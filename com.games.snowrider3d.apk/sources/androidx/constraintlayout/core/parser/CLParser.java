package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class CLParser {
    static boolean DEBUG = false;
    private boolean hasComment = false;
    private int lineNumber;
    private String mContent;

    /* loaded from: classes.dex */
    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    public CLObject parse() throws CLParsingException {
        int i;
        char c;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i2 = 1;
        this.lineNumber = 1;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            char c2 = charArray[i3];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.lineNumber++;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject allocate = CLObject.allocate(charArray);
        allocate.setLine(this.lineNumber);
        allocate.setStart(i3);
        int i4 = i3 + 1;
        CLObject cLObject = allocate;
        while (i4 < length) {
            char c3 = charArray[i4];
            if (c3 == '\n') {
                this.lineNumber += i2;
            }
            if (this.hasComment) {
                if (c3 == '\n') {
                    this.hasComment = z;
                } else {
                    i = i2;
                    i4++;
                    i2 = i;
                    z = false;
                }
            }
            if (cLObject == null) {
                break;
            }
            if (cLObject.isDone()) {
                cLObject = getNextJsonElement(i4, c3, cLObject, charArray);
            } else if (cLObject instanceof CLObject) {
                if (c3 == '}') {
                    cLObject.setEnd(i4 - 1);
                } else {
                    cLObject = getNextJsonElement(i4, c3, cLObject, charArray);
                }
            } else if (!(cLObject instanceof CLArray)) {
                boolean z2 = cLObject instanceof CLString;
                if (z2) {
                    if (charArray[(int) cLObject.start] == c3) {
                        cLObject.setStart(cLObject.start + 1);
                        cLObject.setEnd(i4 - 1);
                    }
                } else {
                    if (cLObject instanceof CLToken) {
                        CLToken cLToken = (CLToken) cLObject;
                        i = i2;
                        if (!cLToken.validate(c3, i4)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.lineNumber, cLToken);
                        }
                    } else {
                        i = i2;
                    }
                    if (((cLObject instanceof CLKey) || z2) && (((c = charArray[(int) cLObject.start]) == '\'' || c == '\"') && c == c3)) {
                        cLObject.setStart(cLObject.start + 1);
                        cLObject.setEnd(i4 - 1);
                    }
                    if (!cLObject.isDone() && (c3 == '}' || c3 == ']' || c3 == ',' || c3 == ' ' || c3 == '\t' || c3 == '\r' || c3 == '\n' || c3 == ':')) {
                        long j = i4 - 1;
                        cLObject.setEnd(j);
                        if (c3 == '}' || c3 == ']') {
                            cLObject = cLObject.getContainer();
                            cLObject.setEnd(j);
                            if (cLObject instanceof CLKey) {
                                cLObject = cLObject.getContainer();
                                cLObject.setEnd(j);
                            }
                        }
                    }
                    if (cLObject.isDone() && (!(cLObject instanceof CLKey) || ((CLKey) cLObject).mElements.size() > 0)) {
                        cLObject = cLObject.getContainer();
                    }
                    i4++;
                    i2 = i;
                    z = false;
                }
            } else if (c3 == ']') {
                cLObject.setEnd(i4 - 1);
            } else {
                cLObject = getNextJsonElement(i4, c3, cLObject, charArray);
            }
            i = i2;
            if (cLObject.isDone()) {
                cLObject = cLObject.getContainer();
            }
            i4++;
            i2 = i;
            z = false;
        }
        while (cLObject != null && !cLObject.isDone()) {
            if (cLObject instanceof CLString) {
                cLObject.setStart(((int) cLObject.start) + 1);
            }
            cLObject.setEnd(length - 1);
            cLObject = cLObject.getContainer();
        }
        if (DEBUG) {
            System.out.println("Root: " + allocate.toJSON());
        }
        return allocate;
    }

    private CLElement getNextJsonElement(int i, char c, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c == '\"' || c == '\'') {
                if (cLElement instanceof CLObject) {
                    return createElement(cLElement, i, TYPE.KEY, true, cArr);
                }
                return createElement(cLElement, i, TYPE.STRING, true, cArr);
            } else if (c == '[') {
                return createElement(cLElement, i, TYPE.ARRAY, true, cArr);
            } else {
                if (c != ']') {
                    if (c == '{') {
                        return createElement(cLElement, i, TYPE.OBJECT, true, cArr);
                    }
                    if (c != '}') {
                        switch (c) {
                            case '+':
                            case '-':
                            case '.':
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            case '2':
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            case '8':
                            case '9':
                                return createElement(cLElement, i, TYPE.NUMBER, true, cArr);
                            case ',':
                            case ':':
                                break;
                            case '/':
                                int i2 = i + 1;
                                if (i2 >= cArr.length || cArr[i2] != '/') {
                                    return cLElement;
                                }
                                this.hasComment = true;
                                return cLElement;
                            default:
                                if ((cLElement instanceof CLContainer) && !(cLElement instanceof CLObject)) {
                                    CLElement createElement = createElement(cLElement, i, TYPE.TOKEN, true, cArr);
                                    CLToken cLToken = (CLToken) createElement;
                                    if (!cLToken.validate(c, i)) {
                                        throw new CLParsingException("incorrect token <" + c + "> at line " + this.lineNumber, cLToken);
                                    }
                                    return createElement;
                                }
                                return createElement(cLElement, i, TYPE.KEY, true, cArr);
                        }
                    }
                }
                cLElement.setEnd(i - 1);
                CLElement container = cLElement.getContainer();
                container.setEnd(i);
                return container;
            }
        }
        return cLElement;
    }

    private CLElement createElement(CLElement cLElement, int i, TYPE type, boolean z, char[] cArr) {
        CLElement cLElement2;
        if (DEBUG) {
            System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[type.ordinal()]) {
            case 1:
                cLElement2 = CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                cLElement2 = CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                cLElement2 = CLString.allocate(cArr);
                break;
            case 4:
                cLElement2 = CLNumber.allocate(cArr);
                break;
            case 5:
                cLElement2 = CLKey.allocate(cArr);
                break;
            case 6:
                cLElement2 = CLToken.allocate(cArr);
                break;
            default:
                cLElement2 = null;
                break;
        }
        if (cLElement2 == null) {
            return null;
        }
        cLElement2.setLine(this.lineNumber);
        if (z) {
            cLElement2.setStart(i);
        }
        if (cLElement instanceof CLContainer) {
            cLElement2.setContainer((CLContainer) cLElement);
        }
        return cLElement2;
    }

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        static {
            int[] iArr = new int[TYPE.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = iArr;
            try {
                iArr[TYPE.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
