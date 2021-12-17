// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import io.netty.util.concurrent.FastThreadLocalThread;
import java.nio.charset.CharsetEncoder;
import java.util.IdentityHashMap;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.Map;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class InternalThreadLocalMap extends UnpaddedInternalThreadLocalMap
{
    private static final /* synthetic */ String[] llIlIllIlllIll;
    private static final /* synthetic */ int[] llIlIllIllllII;
    public static final /* synthetic */ Object UNSET;
    
    public static int lastVariableIndex() {
        return InternalThreadLocalMap.nextIndex.get() - InternalThreadLocalMap.llIlIllIllllII[1];
    }
    
    private InternalThreadLocalMap() {
        super(newIndexedVariableTable());
    }
    
    private static boolean lIIlIlIlIllllIIl(final Object llllllllllllIllIlIIlIIllllllIlll) {
        return llllllllllllIllIlIIlIIllllllIlll != null;
    }
    
    public static void destroy() {
        InternalThreadLocalMap.slowThreadLocalMap = null;
    }
    
    public int localChannelReaderStackDepth() {
        return this.localChannelReaderStackDepth;
    }
    
    private static void lIIlIlIlIlllIlIl() {
        (llIlIllIlllIll = new String[InternalThreadLocalMap.llIlIllIllllII[1]])[InternalThreadLocalMap.llIlIllIllllII[0]] = lIIlIlIlIlllIlII("Dik+Ri8bKChGNhI0NAcmVyo+BSMWZjgIJh8+NAJiDCcjDyMYKjQV", "zFQfB");
    }
    
    private static boolean lIIlIlIlIlllllII(final Object llllllllllllIllIlIIlIIlllllllIlI, final Object llllllllllllIllIlIIlIIlllllllIIl) {
        return llllllllllllIllIlIIlIIlllllllIlI != llllllllllllIllIlIIlIIlllllllIIl;
    }
    
    private static String lIIlIlIlIlllIlII(String llllllllllllIllIlIIlIlIIIIIIlIIl, final String llllllllllllIllIlIIlIlIIIIIIllIl) {
        llllllllllllIllIlIIlIlIIIIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlIlIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIlIIIIIIllII = new StringBuilder();
        final char[] llllllllllllIllIlIIlIlIIIIIIlIll = llllllllllllIllIlIIlIlIIIIIIllIl.toCharArray();
        int llllllllllllIllIlIIlIlIIIIIIlIlI = InternalThreadLocalMap.llIlIllIllllII[0];
        final long llllllllllllIllIlIIlIlIIIIIIIlII = (Object)llllllllllllIllIlIIlIlIIIIIIlIIl.toCharArray();
        final byte llllllllllllIllIlIIlIlIIIIIIIIll = (byte)llllllllllllIllIlIIlIlIIIIIIIlII.length;
        Exception llllllllllllIllIlIIlIlIIIIIIIIlI = (Exception)InternalThreadLocalMap.llIlIllIllllII[0];
        while (lIIlIlIlIllllIll((int)llllllllllllIllIlIIlIlIIIIIIIIlI, llllllllllllIllIlIIlIlIIIIIIIIll)) {
            final char llllllllllllIllIlIIlIlIIIIIIllll = llllllllllllIllIlIIlIlIIIIIIIlII[llllllllllllIllIlIIlIlIIIIIIIIlI];
            llllllllllllIllIlIIlIlIIIIIIllII.append((char)(llllllllllllIllIlIIlIlIIIIIIllll ^ llllllllllllIllIlIIlIlIIIIIIlIll[llllllllllllIllIlIIlIlIIIIIIlIlI % llllllllllllIllIlIIlIlIIIIIIlIll.length]));
            "".length();
            ++llllllllllllIllIlIIlIlIIIIIIlIlI;
            ++llllllllllllIllIlIIlIlIIIIIIIIlI;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIlIIIIIIllII);
    }
    
    public boolean setIndexedVariable(final int llllllllllllIllIlIIlIlIIIlIIIllI, final Object llllllllllllIllIlIIlIlIIIlIIIlIl) {
        final Object[] llllllllllllIllIlIIlIlIIIlIIlIII = this.indexedVariables;
        if (lIIlIlIlIllllIll(llllllllllllIllIlIIlIlIIIlIIIllI, llllllllllllIllIlIIlIlIIIlIIlIII.length)) {
            final Object llllllllllllIllIlIIlIlIIIlIIllII = llllllllllllIllIlIIlIlIIIlIIlIII[llllllllllllIllIlIIlIlIIIlIIIllI];
            llllllllllllIllIlIIlIlIIIlIIlIII[llllllllllllIllIlIIlIlIIIlIIIllI] = llllllllllllIllIlIIlIlIIIlIIIlIl;
            int n;
            if (lIIlIlIlIlllllIl(llllllllllllIllIlIIlIlIIIlIIllII, InternalThreadLocalMap.UNSET)) {
                n = InternalThreadLocalMap.llIlIllIllllII[1];
                "".length();
                if (" ".length() <= 0) {
                    return ((0xB3 ^ 0xB8) & ~(0x3F ^ 0x34)) != 0x0;
                }
            }
            else {
                n = InternalThreadLocalMap.llIlIllIllllII[0];
            }
            return n != 0;
        }
        this.expandIndexedVariableTableAndSet(llllllllllllIllIlIIlIlIIIlIIIllI, llllllllllllIllIlIIlIlIIIlIIIlIl);
        return InternalThreadLocalMap.llIlIllIllllII[1] != 0;
    }
    
    public static int nextVariableIndex() {
        final int llllllllllllIllIlIIlIlIIlIlllIIl = InternalThreadLocalMap.nextIndex.getAndIncrement();
        if (lIIlIlIlIllllIlI(llllllllllllIllIlIIlIlIIlIlllIIl)) {
            InternalThreadLocalMap.nextIndex.decrementAndGet();
            "".length();
            throw new IllegalStateException(InternalThreadLocalMap.llIlIllIlllIll[InternalThreadLocalMap.llIlIllIllllII[0]]);
        }
        return llllllllllllIllIlIIlIlIIlIlllIIl;
    }
    
    private static boolean lIIlIlIlIllllIll(final int llllllllllllIllIlIIlIIlllllllllI, final int llllllllllllIllIlIIlIIllllllllIl) {
        return llllllllllllIllIlIIlIIlllllllllI < llllllllllllIllIlIIlIIllllllllIl;
    }
    
    public Map<Class<?>, Boolean> handlerSharableCache() {
        Map<Class<?>, Boolean> llllllllllllIllIlIIlIlIIIllIIllI = this.handlerSharableCache;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIIllIIllI)) {
            llllllllllllIllIlIIlIlIIIllIIllI = (this.handlerSharableCache = new WeakHashMap<Class<?>, Boolean>(InternalThreadLocalMap.llIlIllIllllII[4]));
        }
        return llllllllllllIllIlIIlIlIIIllIIllI;
    }
    
    private static InternalThreadLocalMap slowGet() {
        ThreadLocal<InternalThreadLocalMap> llllllllllllIllIlIIlIlIIllIIIlII = UnpaddedInternalThreadLocalMap.slowThreadLocalMap;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIllIIIlII)) {
            llllllllllllIllIlIIlIlIIllIIIlII = (UnpaddedInternalThreadLocalMap.slowThreadLocalMap = new ThreadLocal<InternalThreadLocalMap>());
        }
        InternalThreadLocalMap llllllllllllIllIlIIlIlIIllIIIIll = llllllllllllIllIlIIlIlIIllIIIlII.get();
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIllIIIIll)) {
            llllllllllllIllIlIIlIlIIllIIIIll = new InternalThreadLocalMap();
            llllllllllllIllIlIIlIlIIllIIIlII.set(llllllllllllIllIlIIlIlIIllIIIIll);
        }
        return llllllllllllIllIlIIlIlIIllIIIIll;
    }
    
    public Object indexedVariable(final int llllllllllllIllIlIIlIlIIIlIlIIll) {
        final Object[] llllllllllllIllIlIIlIlIIIlIlIlIl = this.indexedVariables;
        Object unset;
        if (lIIlIlIlIllllIll(llllllllllllIllIlIIlIlIIIlIlIIll, llllllllllllIllIlIIlIlIIIlIlIlIl.length)) {
            unset = llllllllllllIllIlIIlIlIIIlIlIlIl[llllllllllllIllIlIIlIlIIIlIlIIll];
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            unset = InternalThreadLocalMap.UNSET;
        }
        return unset;
    }
    
    public int futureListenerStackDepth() {
        return this.futureListenerStackDepth;
    }
    
    public int size() {
        int llllllllllllIllIlIIlIlIIlIlIIllI = InternalThreadLocalMap.llIlIllIllllII[0];
        if (lIIlIlIlIlllIlll(this.futureListenerStackDepth)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIlllIlll(this.localChannelReaderStackDepth)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.handlerSharableCache)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.counterHashCode)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.random)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.typeParameterMatcherGetCache)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.typeParameterMatcherFindCache)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.stringBuilder)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.charsetEncoderCache)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        if (lIIlIlIlIllllIIl(this.charsetDecoderCache)) {
            ++llllllllllllIllIlIIlIlIIlIlIIllI;
        }
        final Object[] llllllllllllIllIlIIlIlIIlIlIlIlI = this.indexedVariables;
        final int llllllllllllIllIlIIlIlIIlIlIlIIl = llllllllllllIllIlIIlIlIIlIlIlIlI.length;
        int llllllllllllIllIlIIlIlIIlIlIlIII = InternalThreadLocalMap.llIlIllIllllII[0];
        while (lIIlIlIlIllllIll(llllllllllllIllIlIIlIlIIlIlIlIII, llllllllllllIllIlIIlIlIIlIlIlIIl)) {
            final Object llllllllllllIllIlIIlIlIIlIlIlIll = llllllllllllIllIlIIlIlIIlIlIlIlI[llllllllllllIllIlIIlIlIIlIlIlIII];
            if (lIIlIlIlIlllllII(llllllllllllIllIlIIlIlIIlIlIlIll, InternalThreadLocalMap.UNSET)) {
                ++llllllllllllIllIlIIlIlIIlIlIIllI;
            }
            ++llllllllllllIllIlIIlIlIIlIlIlIII;
            "".length();
            if (((8 + 167 - 145 + 142 ^ 71 + 15 + 22 + 77) & (67 + 66 + 21 + 59 ^ 185 + 67 - 238 + 178 ^ -" ".length())) != 0x0) {
                return (0xD0 ^ 0xA9 ^ (0x98 ^ 0x83)) & (0x7E ^ 0x7A ^ (0x43 ^ 0x25) ^ -" ".length());
            }
        }
        return llllllllllllIllIlIIlIlIIlIlIIllI - InternalThreadLocalMap.llIlIllIllllII[1];
    }
    
    private static boolean lIIlIlIlIllllIlI(final int llllllllllllIllIlIIlIIlllllIllIl) {
        return llllllllllllIllIlIIlIIlllllIllIl < 0;
    }
    
    public void setLocalChannelReaderStackDepth(final int llllllllllllIllIlIIlIlIIIlIllIll) {
        this.localChannelReaderStackDepth = llllllllllllIllIlIIlIlIIIlIllIll;
    }
    
    private static void lIIlIlIlIlllIllI() {
        (llIlIllIllllII = new int[8])[0] = ((0x42 ^ 0x23) & ~(0x25 ^ 0x44));
        InternalThreadLocalMap.llIlIllIllllII[1] = " ".length();
        InternalThreadLocalMap.llIlIllIllllII[2] = (0x96 ^ 0xB6);
        InternalThreadLocalMap.llIlIllIllllII[3] = (0xFFFF8EA0 & 0x735F);
        InternalThreadLocalMap.llIlIllIllllII[4] = (0x9E ^ 0x9A);
        InternalThreadLocalMap.llIlIllIllllII[5] = "  ".length();
        InternalThreadLocalMap.llIlIllIllllII[6] = (0x9B ^ 0x93);
        InternalThreadLocalMap.llIlIllIllllII[7] = (65 + 52 + 68 + 29 ^ 24 + 117 - 22 + 79);
    }
    
    private void expandIndexedVariableTableAndSet(final int llllllllllllIllIlIIlIlIIIIlllIlI, final Object llllllllllllIllIlIIlIlIIIIlllIIl) {
        final Object[] llllllllllllIllIlIIlIlIIIIlllIII = this.indexedVariables;
        final int llllllllllllIllIlIIlIlIIIIllIlll = llllllllllllIllIlIIlIlIIIIlllIII.length;
        int llllllllllllIllIlIIlIlIIIIllIllI = llllllllllllIllIlIIlIlIIIIlllIlI;
        llllllllllllIllIlIIlIlIIIIllIllI |= llllllllllllIllIlIIlIlIIIIllIllI >>> InternalThreadLocalMap.llIlIllIllllII[1];
        llllllllllllIllIlIIlIlIIIIllIllI |= llllllllllllIllIlIIlIlIIIIllIllI >>> InternalThreadLocalMap.llIlIllIllllII[5];
        llllllllllllIllIlIIlIlIIIIllIllI |= llllllllllllIllIlIIlIlIIIIllIllI >>> InternalThreadLocalMap.llIlIllIllllII[4];
        llllllllllllIllIlIIlIlIIIIllIllI |= llllllllllllIllIlIIlIlIIIIllIllI >>> InternalThreadLocalMap.llIlIllIllllII[6];
        llllllllllllIllIlIIlIlIIIIllIllI |= llllllllllllIllIlIIlIlIIIIllIllI >>> InternalThreadLocalMap.llIlIllIllllII[7];
        ++llllllllllllIllIlIIlIlIIIIllIllI;
        final Object[] llllllllllllIllIlIIlIlIIIIllIlIl = Arrays.copyOf(llllllllllllIllIlIIlIlIIIIlllIII, llllllllllllIllIlIIlIlIIIIllIllI);
        Arrays.fill(llllllllllllIllIlIIlIlIIIIllIlIl, llllllllllllIllIlIIlIlIIIIllIlll, llllllllllllIllIlIIlIlIIIIllIlIl.length, InternalThreadLocalMap.UNSET);
        llllllllllllIllIlIIlIlIIIIllIlIl[llllllllllllIllIlIIlIlIIIIlllIlI] = llllllllllllIllIlIIlIlIIIIlllIIl;
        this.indexedVariables = llllllllllllIllIlIIlIlIIIIllIlIl;
    }
    
    public Map<Charset, CharsetDecoder> charsetDecoderCache() {
        Map<Charset, CharsetDecoder> llllllllllllIllIlIIlIlIIlIIlIIII = this.charsetDecoderCache;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIlIIlIIII)) {
            llllllllllllIllIlIIlIlIIlIIlIIII = (this.charsetDecoderCache = new IdentityHashMap<Charset, CharsetDecoder>());
        }
        return llllllllllllIllIlIIlIlIIlIIlIIII;
    }
    
    public void setFutureListenerStackDepth(final int llllllllllllIllIlIIlIlIIlIIIIlIl) {
        this.futureListenerStackDepth = llllllllllllIllIlIIlIlIIlIIIIlIl;
    }
    
    public Map<Class<?>, TypeParameterMatcher> typeParameterMatcherGetCache() {
        Map<Class<?>, TypeParameterMatcher> llllllllllllIllIlIIlIlIIIllllIll = this.typeParameterMatcherGetCache;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIIllllIll)) {
            llllllllllllIllIlIIlIlIIIllllIll = (this.typeParameterMatcherGetCache = new IdentityHashMap<Class<?>, TypeParameterMatcher>());
        }
        return llllllllllllIllIlIIlIlIIIllllIll;
    }
    
    static {
        lIIlIlIlIlllIllI();
        lIIlIlIlIlllIlIl();
        UNSET = new Object();
    }
    
    private static boolean lIIlIlIlIlllIlll(final int llllllllllllIllIlIIlIIlllllIllll) {
        return llllllllllllIllIlIIlIIlllllIllll != 0;
    }
    
    private static boolean lIIlIlIlIllllIII(final Object llllllllllllIllIlIIlIIllllllIIIl) {
        return llllllllllllIllIlIIlIIllllllIIIl == null;
    }
    
    private static Object[] newIndexedVariableTable() {
        final Object[] llllllllllllIllIlIIlIlIIlIllIIll = new Object[InternalThreadLocalMap.llIlIllIllllII[2]];
        Arrays.fill(llllllllllllIllIlIIlIlIIlIllIIll, InternalThreadLocalMap.UNSET);
        return llllllllllllIllIlIIlIlIIlIllIIll;
    }
    
    public IntegerHolder counterHashCode() {
        return this.counterHashCode;
    }
    
    public Map<Charset, CharsetEncoder> charsetEncoderCache() {
        Map<Charset, CharsetEncoder> llllllllllllIllIlIIlIlIIlIIlIllI = this.charsetEncoderCache;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIlIIlIllI)) {
            llllllllllllIllIlIIlIlIIlIIlIllI = (this.charsetEncoderCache = new IdentityHashMap<Charset, CharsetEncoder>());
        }
        return llllllllllllIllIlIIlIlIIlIIlIllI;
    }
    
    public StringBuilder stringBuilder() {
        StringBuilder llllllllllllIllIlIIlIlIIlIIlllII = this.stringBuilder;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIlIIlllII)) {
            llllllllllllIllIlIIlIlIIlIIlllII = (this.stringBuilder = new StringBuilder(InternalThreadLocalMap.llIlIllIllllII[3]));
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            llllllllllllIllIlIIlIlIIlIIlllII.setLength(InternalThreadLocalMap.llIlIllIllllII[0]);
        }
        return llllllllllllIllIlIIlIlIIlIIlllII;
    }
    
    public void setCounterHashCode(final IntegerHolder llllllllllllIllIlIIlIlIIIllIlIlI) {
        this.counterHashCode = llllllllllllIllIlIIlIlIIIllIlIlI;
    }
    
    private static InternalThreadLocalMap fastGet(final FastThreadLocalThread llllllllllllIllIlIIlIlIIllIIlIlI) {
        InternalThreadLocalMap llllllllllllIllIlIIlIlIIllIIlIIl = llllllllllllIllIlIIlIlIIllIIlIlI.threadLocalMap();
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIllIIlIIl)) {
            llllllllllllIllIlIIlIlIIllIIlIlI.setThreadLocalMap(llllllllllllIllIlIIlIlIIllIIlIIl = new InternalThreadLocalMap());
        }
        return llllllllllllIllIlIIlIlIIllIIlIIl;
    }
    
    public static InternalThreadLocalMap getIfSet() {
        final Thread llllllllllllIllIlIIlIlIIllIlIlII = Thread.currentThread();
        InternalThreadLocalMap llllllllllllIllIlIIlIlIIllIlIIll = null;
        if (lIIlIlIlIlllIlll((llllllllllllIllIlIIlIlIIllIlIlII instanceof FastThreadLocalThread) ? 1 : 0)) {
            final InternalThreadLocalMap llllllllllllIllIlIIlIlIIllIlIlll = ((FastThreadLocalThread)llllllllllllIllIlIIlIlIIllIlIlII).threadLocalMap();
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            final ThreadLocal<InternalThreadLocalMap> llllllllllllIllIlIIlIlIIllIlIlIl = UnpaddedInternalThreadLocalMap.slowThreadLocalMap;
            if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIllIlIlIl)) {
                final InternalThreadLocalMap llllllllllllIllIlIIlIlIIllIlIllI = null;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            else {
                llllllllllllIllIlIIlIlIIllIlIIll = llllllllllllIllIlIIlIlIIllIlIlIl.get();
            }
        }
        return llllllllllllIllIlIIlIlIIllIlIIll;
    }
    
    private static boolean lIIlIlIlIlllllIl(final Object llllllllllllIllIlIIlIIllllllIlII, final Object llllllllllllIllIlIIlIIllllllIIll) {
        return llllllllllllIllIlIIlIIllllllIlII == llllllllllllIllIlIIlIIllllllIIll;
    }
    
    public boolean isIndexedVariableSet(final int llllllllllllIllIlIIlIlIIIIIlllIl) {
        final Object[] llllllllllllIllIlIIlIlIIIIIlllII = this.indexedVariables;
        int n;
        if (lIIlIlIlIllllIll(llllllllllllIllIlIIlIlIIIIIlllIl, llllllllllllIllIlIIlIlIIIIIlllII.length) && lIIlIlIlIlllllII(llllllllllllIllIlIIlIlIIIIIlllII[llllllllllllIllIlIIlIlIIIIIlllIl], InternalThreadLocalMap.UNSET)) {
            n = InternalThreadLocalMap.llIlIllIllllII[1];
            "".length();
            if (-(0x88 ^ 0x8C) > 0) {
                return ((0x7A ^ 0x61) & ~(0x24 ^ 0x3F)) != 0x0;
            }
        }
        else {
            n = InternalThreadLocalMap.llIlIllIllllII[0];
        }
        return n != 0;
    }
    
    public static InternalThreadLocalMap get() {
        final Thread llllllllllllIllIlIIlIlIIllIIlllI = Thread.currentThread();
        if (lIIlIlIlIlllIlll((llllllllllllIllIlIIlIlIIllIIlllI instanceof FastThreadLocalThread) ? 1 : 0)) {
            return fastGet((FastThreadLocalThread)llllllllllllIllIlIIlIlIIllIIlllI);
        }
        return slowGet();
    }
    
    public static void remove() {
        final Thread llllllllllllIllIlIIlIlIIlIllllIl = Thread.currentThread();
        if (lIIlIlIlIlllIlll((llllllllllllIllIlIIlIlIIlIllllIl instanceof FastThreadLocalThread) ? 1 : 0)) {
            ((FastThreadLocalThread)llllllllllllIllIlIIlIlIIlIllllIl).setThreadLocalMap(null);
            "".length();
            if (((128 + 61 - 130 + 80 ^ 124 + 86 - 123 + 111) & (156 + 203 - 174 + 19 ^ 15 + 73 - 6 + 47 ^ -" ".length())) < ((0x78 ^ 0x6 ^ (0xDA ^ 0xBC)) & (0xBA ^ 0xA8 ^ (0x77 ^ 0x7D) ^ -" ".length()))) {
                return;
            }
        }
        else {
            final ThreadLocal<InternalThreadLocalMap> llllllllllllIllIlIIlIlIIlIlllllI = UnpaddedInternalThreadLocalMap.slowThreadLocalMap;
            if (lIIlIlIlIllllIIl(llllllllllllIllIlIIlIlIIlIlllllI)) {
                llllllllllllIllIlIIlIlIIlIlllllI.remove();
            }
        }
    }
    
    public Map<Class<?>, Map<String, TypeParameterMatcher>> typeParameterMatcherFindCache() {
        Map<Class<?>, Map<String, TypeParameterMatcher>> llllllllllllIllIlIIlIlIIIlllIlIl = this.typeParameterMatcherFindCache;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIIlllIlIl)) {
            llllllllllllIllIlIIlIlIIIlllIlIl = (this.typeParameterMatcherFindCache = new IdentityHashMap<Class<?>, Map<String, TypeParameterMatcher>>());
        }
        return llllllllllllIllIlIIlIlIIIlllIlIl;
    }
    
    public ThreadLocalRandom random() {
        ThreadLocalRandom llllllllllllIllIlIIlIlIIlIIIIIIl = this.random;
        if (lIIlIlIlIllllIII(llllllllllllIllIlIIlIlIIlIIIIIIl)) {
            llllllllllllIllIlIIlIlIIlIIIIIIl = (this.random = new ThreadLocalRandom());
        }
        return llllllllllllIllIlIIlIlIIlIIIIIIl;
    }
    
    public Object removeIndexedVariable(final int llllllllllllIllIlIIlIlIIIIlIIlll) {
        final Object[] llllllllllllIllIlIIlIlIIIIlIIllI = this.indexedVariables;
        if (lIIlIlIlIllllIll(llllllllllllIllIlIIlIlIIIIlIIlll, llllllllllllIllIlIIlIlIIIIlIIllI.length)) {
            final Object llllllllllllIllIlIIlIlIIIIlIlIIl = llllllllllllIllIlIIlIlIIIIlIIllI[llllllllllllIllIlIIlIlIIIIlIIlll];
            llllllllllllIllIlIIlIlIIIIlIIllI[llllllllllllIllIlIIlIlIIIIlIIlll] = InternalThreadLocalMap.UNSET;
            return llllllllllllIllIlIIlIlIIIIlIlIIl;
        }
        return InternalThreadLocalMap.UNSET;
    }
}
