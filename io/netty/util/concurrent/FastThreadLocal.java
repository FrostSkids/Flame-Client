// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.InternalThreadLocalMap;

public class FastThreadLocal<V>
{
    private final /* synthetic */ int index;
    private static final /* synthetic */ int[] lIllIIIIIllIlI;
    private static final /* synthetic */ int variablesToRemoveIndex;
    
    public FastThreadLocal() {
        this.index = InternalThreadLocalMap.nextVariableIndex();
    }
    
    private V initialize(final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIIlIIlII) {
        V lllllllllllllIIIIlIIIllIIIlIIllI = null;
        try {
            lllllllllllllIIIIlIIIllIIIlIIllI = this.initialValue();
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        catch (Exception lllllllllllllIIIIlIIIllIIIlIlIIl) {
            PlatformDependent.throwException(lllllllllllllIIIIlIIIllIIIlIlIIl);
        }
        lllllllllllllIIIIlIIIllIIIlIIlII.setIndexedVariable(this.index, lllllllllllllIIIIlIIIllIIIlIIllI);
        "".length();
        addToVariablesToRemove(lllllllllllllIIIIlIIIllIIIlIIlII, this);
        return lllllllllllllIIIIlIIIllIIIlIIllI;
    }
    
    protected V initialValue() throws Exception {
        return null;
    }
    
    private static void removeFromVariablesToRemove(final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIlIIIIII, final FastThreadLocal<?> lllllllllllllIIIIlIIIllIIlIIIIll) {
        final Object lllllllllllllIIIIlIIIllIIlIIIIlI = lllllllllllllIIIIlIIIllIIlIIIIII.indexedVariable(FastThreadLocal.variablesToRemoveIndex);
        if (!llllIllIIIlllll(lllllllllllllIIIIlIIIllIIlIIIIlI, InternalThreadLocalMap.UNSET) || llllIllIIIlllIl(lllllllllllllIIIIlIIIllIIlIIIIlI)) {
            return;
        }
        final Set<FastThreadLocal<?>> lllllllllllllIIIIlIIIllIIlIIIIIl = (Set<FastThreadLocal<?>>)lllllllllllllIIIIlIIIllIIlIIIIlI;
        lllllllllllllIIIIlIIIllIIlIIIIIl.remove(lllllllllllllIIIIlIIIllIIlIIIIll);
        "".length();
    }
    
    private static void llllIllIIIlllII() {
        (lIllIIIIIllIlI = new int[2])[0] = ((0xB6 ^ 0xC2 ^ (0x1C ^ 0x4E)) & (0x8 ^ 0x31 ^ (0x73 ^ 0x6C) ^ -" ".length()));
        FastThreadLocal.lIllIIIIIllIlI[1] = " ".length();
    }
    
    public static void removeAll() {
        final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIllIIIlI = InternalThreadLocalMap.getIfSet();
        if (llllIllIIIlllIl(lllllllllllllIIIIlIIIllIIllIIIlI)) {
            return;
        }
        try {
            final Object lllllllllllllIIIIlIIIllIIllIIIll = lllllllllllllIIIIlIIIllIIllIIIlI.indexedVariable(FastThreadLocal.variablesToRemoveIndex);
            if (llllIllIIIllllI(lllllllllllllIIIIlIIIllIIllIIIll) && llllIllIIIlllll(lllllllllllllIIIIlIIIllIIllIIIll, InternalThreadLocalMap.UNSET)) {
                final Set<FastThreadLocal<?>> lllllllllllllIIIIlIIIllIIllIIlIl = (Set<FastThreadLocal<?>>)lllllllllllllIIIIlIIIllIIllIIIll;
                final FastThreadLocal[] lllllllllllllIIIIlIIIllIIllIlIII;
                final FastThreadLocal<?>[] lllllllllllllIIIIlIIIllIIllIIlII = (FastThreadLocal<?>[])(lllllllllllllIIIIlIIIllIIllIlIII = lllllllllllllIIIIlIIIllIIllIIlIl.toArray(new FastThreadLocal[lllllllllllllIIIIlIIIllIIllIIlIl.size()]));
                final int lllllllllllllIIIIlIIIllIIllIIlll = lllllllllllllIIIIlIIIllIIllIlIII.length;
                int lllllllllllllIIIIlIIIllIIllIIllI = FastThreadLocal.lIllIIIIIllIlI[0];
                while (llllIllIIlIIIII(lllllllllllllIIIIlIIIllIIllIIllI, lllllllllllllIIIIlIIIllIIllIIlll)) {
                    final FastThreadLocal<?> lllllllllllllIIIIlIIIllIIllIlIIl = (FastThreadLocal<?>)lllllllllllllIIIIlIIIllIIllIlIII[lllllllllllllIIIIlIIIllIIllIIllI];
                    lllllllllllllIIIIlIIIllIIllIlIIl.remove(lllllllllllllIIIIlIIIllIIllIIIlI);
                    ++lllllllllllllIIIIlIIIllIIllIIllI;
                    "".length();
                    if (((0x62 ^ 0x68) & ~(0x82 ^ 0x88)) != 0x0) {
                        return;
                    }
                }
            }
            InternalThreadLocalMap.remove();
            "".length();
            if (((0x61 ^ 0x5A ^ (0x6F ^ 0x67)) & (11 + 165 - 37 + 38 ^ 55 + 112 - 65 + 28 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        finally {
            InternalThreadLocalMap.remove();
        }
    }
    
    private static boolean llllIllIIIllllI(final Object lllllllllllllIIIIlIIIlIllllIlllI) {
        return lllllllllllllIIIIlIIIlIllllIlllI != null;
    }
    
    static {
        llllIllIIIlllII();
        variablesToRemoveIndex = InternalThreadLocalMap.nextVariableIndex();
    }
    
    private static boolean llllIllIIIlllIl(final Object lllllllllllllIIIIlIIIlIllllIllII) {
        return lllllllllllllIIIIlIIIlIllllIllII == null;
    }
    
    private static boolean llllIllIIIlllll(final Object lllllllllllllIIIIlIIIlIlllllIIIl, final Object lllllllllllllIIIIlIIIlIlllllIIII) {
        return lllllllllllllIIIIlIIIlIlllllIIIl != lllllllllllllIIIIlIIIlIlllllIIII;
    }
    
    public final void remove() {
        this.remove(InternalThreadLocalMap.getIfSet());
    }
    
    public final V get(final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIIlIllll) {
        final Object lllllllllllllIIIIlIIIllIIIllIIIl = lllllllllllllIIIIlIIIllIIIlIllll.indexedVariable(this.index);
        if (llllIllIIIlllll(lllllllllllllIIIIlIIIllIIIllIIIl, InternalThreadLocalMap.UNSET)) {
            return (V)lllllllllllllIIIIlIIIllIIIllIIIl;
        }
        return this.initialize(lllllllllllllIIIIlIIIllIIIlIllll);
    }
    
    private static boolean llllIllIIlIIIIl(final int lllllllllllllIIIIlIIIlIllllIlIlI) {
        return lllllllllllllIIIIlIIIlIllllIlIlI != 0;
    }
    
    private static boolean llllIllIIlIIIII(final int lllllllllllllIIIIlIIIlIlllllIlIl, final int lllllllllllllIIIIlIIIlIlllllIlII) {
        return lllllllllllllIIIIlIIIlIlllllIlIl < lllllllllllllIIIIlIIIlIlllllIlII;
    }
    
    public final boolean isSet() {
        return this.isSet(InternalThreadLocalMap.getIfSet());
    }
    
    private static void addToVariablesToRemove(final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIlIIllII, final FastThreadLocal<?> lllllllllllllIIIIlIIIllIIlIIlIll) {
        final Object lllllllllllllIIIIlIIIllIIlIIlllI = lllllllllllllIIIIlIIIllIIlIIllII.indexedVariable(FastThreadLocal.variablesToRemoveIndex);
        Set<FastThreadLocal<?>> lllllllllllllIIIIlIIIllIIlIIllIl = null;
        if (!llllIllIIIlllll(lllllllllllllIIIIlIIIllIIlIIlllI, InternalThreadLocalMap.UNSET) || llllIllIIIlllIl(lllllllllllllIIIIlIIIllIIlIIlllI)) {
            final Set<FastThreadLocal<?>> lllllllllllllIIIIlIIIllIIlIlIIIl = Collections.newSetFromMap(new IdentityHashMap<FastThreadLocal<?>, Boolean>());
            lllllllllllllIIIIlIIIllIIlIIllII.setIndexedVariable(FastThreadLocal.variablesToRemoveIndex, lllllllllllllIIIIlIIIllIIlIlIIIl);
            "".length();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIIlIIIllIIlIIllIl = (Set<FastThreadLocal<?>>)lllllllllllllIIIIlIIIllIIlIIlllI;
        }
        lllllllllllllIIIIlIIIllIIlIIllIl.add(lllllllllllllIIIIlIIIllIIlIIlIll);
        "".length();
    }
    
    public final void set(final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIIIlIlII, final V lllllllllllllIIIIlIIIllIIIIlIIll) {
        if (llllIllIIIlllll(lllllllllllllIIIIlIIIllIIIIlIIll, InternalThreadLocalMap.UNSET)) {
            if (llllIllIIlIIIIl(lllllllllllllIIIIlIIIllIIIIlIlII.setIndexedVariable(this.index, lllllllllllllIIIIlIIIllIIIIlIIll) ? 1 : 0)) {
                addToVariablesToRemove(lllllllllllllIIIIlIIIllIIIIlIlII, this);
                "".length();
                if ((0xB5 ^ 0xB1) != (0x1D ^ 0x19)) {
                    return;
                }
            }
        }
        else {
            this.remove(lllllllllllllIIIIlIIIllIIIIlIlII);
        }
    }
    
    public static int size() {
        final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIlIlIlll = InternalThreadLocalMap.getIfSet();
        if (llllIllIIIlllIl(lllllllllllllIIIIlIIIllIIlIlIlll)) {
            return FastThreadLocal.lIllIIIIIllIlI[0];
        }
        return lllllllllllllIIIIlIIIllIIlIlIlll.size();
    }
    
    public final V get() {
        return this.get(InternalThreadLocalMap.get());
    }
    
    public final void remove(final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIIIIIIII) {
        if (llllIllIIIlllIl(lllllllllllllIIIIlIIIllIIIIIIIII)) {
            return;
        }
        final Object lllllllllllllIIIIlIIIlIlllllllll = lllllllllllllIIIIlIIIllIIIIIIIII.removeIndexedVariable(this.index);
        removeFromVariablesToRemove(lllllllllllllIIIIlIIIllIIIIIIIII, this);
        if (llllIllIIIlllll(lllllllllllllIIIIlIIIlIlllllllll, InternalThreadLocalMap.UNSET)) {
            try {
                this.onRemoval(lllllllllllllIIIIlIIIlIlllllllll);
                "".length();
                if ("   ".length() < ((56 + 158 - 100 + 46 ^ 113 + 15 - 86 + 137) & (0x1 ^ 0x18 ^ (0x1B ^ 0x11) ^ -" ".length()))) {
                    return;
                }
            }
            catch (Exception lllllllllllllIIIIlIIIllIIIIIIIlI) {
                PlatformDependent.throwException(lllllllllllllIIIIlIIIllIIIIIIIlI);
            }
        }
    }
    
    public final boolean isSet(final InternalThreadLocalMap lllllllllllllIIIIlIIIllIIIIIllII) {
        int n;
        if (llllIllIIIllllI(lllllllllllllIIIIlIIIllIIIIIllII) && llllIllIIlIIIIl(lllllllllllllIIIIlIIIllIIIIIllII.isIndexedVariableSet(this.index) ? 1 : 0)) {
            n = FastThreadLocal.lIllIIIIIllIlI[1];
            "".length();
            if (" ".length() >= "   ".length()) {
                return ((0x81 ^ 0xBE) & ~(0x7C ^ 0x43)) != 0x0;
            }
        }
        else {
            n = FastThreadLocal.lIllIIIIIllIlI[0];
        }
        return n != 0;
    }
    
    public static void destroy() {
        InternalThreadLocalMap.destroy();
    }
    
    public final void set(final V lllllllllllllIIIIlIIIllIIIIllllI) {
        if (llllIllIIIlllll(lllllllllllllIIIIlIIIllIIIIllllI, InternalThreadLocalMap.UNSET)) {
            this.set(InternalThreadLocalMap.get(), lllllllllllllIIIIlIIIllIIIIllllI);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this.remove();
        }
    }
    
    protected void onRemoval(final V lllllllllllllIIIIlIIIlIllllllIII) throws Exception {
    }
}
