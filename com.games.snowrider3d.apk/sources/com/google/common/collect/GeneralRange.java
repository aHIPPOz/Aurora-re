package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    @CheckForNull
    private final T lowerEndpoint;
    @CheckForNull
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    @CheckForNull
    private final T upperEndpoint;

    static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        T t = null;
        T lowerEndpoint = range.hasLowerBound() ? range.lowerEndpoint() : null;
        BoundType lowerBoundType = range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN;
        if (range.hasUpperBound()) {
            t = range.upperEndpoint();
        }
        return new GeneralRange<>(Ordering.natural(), range.hasLowerBound(), lowerEndpoint, lowerBoundType, range.hasUpperBound(), t, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    public static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, false, null, BoundType.OPEN);
    }

    public static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    public static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    static <T> GeneralRange<T> range(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType, @ParametricNullness T t2, BoundType boundType2) {
        return new GeneralRange<>(comparator, true, t, boundType, true, t2, boundType2);
    }

    private GeneralRange(Comparator<? super T> comparator, boolean z, @CheckForNull T t, BoundType boundType, boolean z2, @CheckForNull T t2, BoundType boundType2) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t), (Object) NullnessCasts.uncheckedCastNullableTToT(t));
        }
        if (z2) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t2), (Object) NullnessCasts.uncheckedCastNullableTToT(t2));
        }
        if (!z || !z2) {
            return;
        }
        int compare = comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t), (Object) NullnessCasts.uncheckedCastNullableTToT(t2));
        boolean z3 = true;
        Preconditions.checkArgument(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
        if (compare != 0) {
            return;
        }
        if (boundType == BoundType.OPEN && boundType2 == BoundType.OPEN) {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
    }

    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean isEmpty() {
        if (!hasUpperBound() || !tooLow(NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()))) {
            return hasLowerBound() && tooHigh(NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
        }
        return true;
    }

    public boolean tooLow(@ParametricNullness T t) {
        boolean z = false;
        if (!hasLowerBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (getLowerBoundType() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public boolean tooHigh(@ParametricNullness T t) {
        boolean z = false;
        if (!hasUpperBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()));
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (getUpperBoundType() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public boolean contains(@ParametricNullness T t) {
        return !tooLow(t) && !tooHigh(t);
    }

    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
        T t;
        int compare;
        int compare2;
        int compare3;
        Preconditions.checkNotNull(generalRange);
        Preconditions.checkArgument(this.comparator.equals(generalRange.comparator));
        boolean z = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        BoundType lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z = generalRange.hasLowerBound;
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        } else if (generalRange.hasLowerBound() && ((compare3 = this.comparator.compare(getLowerEndpoint(), generalRange.getLowerEndpoint())) < 0 || (compare3 == 0 && generalRange.getLowerBoundType() == BoundType.OPEN))) {
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        }
        boolean z2 = z;
        boolean z3 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z3 = generalRange.hasUpperBound;
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        } else if (generalRange.hasUpperBound() && ((compare2 = this.comparator.compare(getUpperEndpoint(), generalRange.getUpperEndpoint())) > 0 || (compare2 == 0 && generalRange.getUpperBoundType() == BoundType.OPEN))) {
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        }
        boolean z4 = z3;
        T t2 = upperEndpoint;
        if (!z2 || !z4 || ((compare = this.comparator.compare(lowerEndpoint, t2)) <= 0 && !(compare == 0 && lowerBoundType == BoundType.OPEN && upperBoundType == BoundType.OPEN))) {
            t = lowerEndpoint;
        } else {
            lowerBoundType = BoundType.OPEN;
            upperBoundType = BoundType.CLOSED;
            t = t2;
        }
        return new GeneralRange<>(this.comparator, z2, t, lowerBoundType, z4, t2, upperBoundType);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) && Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange == null) {
            GeneralRange<T> generalRange2 = new GeneralRange<>(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
            generalRange2.reverse = this;
            this.reverse = generalRange2;
            return generalRange2;
        }
        return generalRange;
    }

    public String toString() {
        String valueOf = String.valueOf(this.comparator);
        char c = this.lowerBoundType == BoundType.CLOSED ? '[' : '(';
        String valueOf2 = String.valueOf(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        String valueOf3 = String.valueOf(this.hasUpperBound ? this.upperEndpoint : "∞");
        return new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append(valueOf).append(":").append(c).append(valueOf2).append(',').append(valueOf3).append(this.upperBoundType == BoundType.CLOSED ? ']' : ')').toString();
    }

    @CheckForNull
    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    @CheckForNull
    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }
}
