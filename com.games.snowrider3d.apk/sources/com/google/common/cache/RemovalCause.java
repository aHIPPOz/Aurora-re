package com.google.common.cache;
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public enum RemovalCause {
    EXPLICIT { // from class: com.google.common.cache.RemovalCause.1
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    },
    REPLACED { // from class: com.google.common.cache.RemovalCause.2
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED { // from class: com.google.common.cache.RemovalCause.3
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED { // from class: com.google.common.cache.RemovalCause.4
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    },
    SIZE { // from class: com.google.common.cache.RemovalCause.5
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    };

    public abstract boolean wasEvicted();
}
