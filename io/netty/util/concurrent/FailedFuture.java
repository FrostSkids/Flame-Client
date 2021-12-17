// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import io.netty.util.internal.PlatformDependent;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class FailedFuture<V> extends CompleteFuture<V>
{
    private static final /* synthetic */ int[] lIIIlllIIllIII;
    private final /* synthetic */ Throwable cause;
    private static final /* synthetic */ String[] lIIIlllIIlIlll;
    
    public FailedFuture(final EventExecutor lllllllllllllIIlllllIlIllIIIIlIl, final Throwable lllllllllllllIIlllllIlIllIIIIlII) {
        super(lllllllllllllIIlllllIlIllIIIIlIl);
        if (llIIIllIIlIIIIl(lllllllllllllIIlllllIlIllIIIIlII)) {
            throw new NullPointerException(FailedFuture.lIIIlllIIlIlll[FailedFuture.lIIIlllIIllIII[0]]);
        }
        this.cause = lllllllllllllIIlllllIlIllIIIIlII;
    }
    
    private static String llIIIllIIIllllI(String lllllllllllllIIlllllIlIlIlIllIIl, final String lllllllllllllIIlllllIlIlIlIlllll) {
        lllllllllllllIIlllllIlIlIlIllIIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllllIlIlIlIllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllIlIlIlIllllI = new StringBuilder();
        final char[] lllllllllllllIIlllllIlIlIlIlllIl = lllllllllllllIIlllllIlIlIlIlllll.toCharArray();
        int lllllllllllllIIlllllIlIlIlIllIll = FailedFuture.lIIIlllIIllIII[0];
        final double lllllllllllllIIlllllIlIlIlIIllll = (Object)((String)lllllllllllllIIlllllIlIlIlIllIIl).toCharArray();
        final byte lllllllllllllIIlllllIlIlIlIIllIl = (byte)lllllllllllllIIlllllIlIlIlIIllll.length;
        String lllllllllllllIIlllllIlIlIlIIlIll = (String)FailedFuture.lIIIlllIIllIII[0];
        while (llIIIllIIlIIIlI((int)lllllllllllllIIlllllIlIlIlIIlIll, lllllllllllllIIlllllIlIlIlIIllIl)) {
            final char lllllllllllllIIlllllIlIlIllIIIIl = lllllllllllllIIlllllIlIlIlIIllll[lllllllllllllIIlllllIlIlIlIIlIll];
            lllllllllllllIIlllllIlIlIlIllllI.append((char)(lllllllllllllIIlllllIlIlIllIIIIl ^ lllllllllllllIIlllllIlIlIlIlllIl[lllllllllllllIIlllllIlIlIlIllIll % lllllllllllllIIlllllIlIlIlIlllIl.length]));
            "".length();
            ++lllllllllllllIIlllllIlIlIlIllIll;
            ++lllllllllllllIIlllllIlIlIlIIlIll;
            "".length();
            if (((0x6B ^ 0x49 ^ (0x2B ^ 0x5B)) & (50 + 33 + 43 + 91 ^ 44 + 113 - 87 + 69 ^ -" ".length())) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllIlIlIlIllllI);
    }
    
    private static void llIIIllIIlIIIII() {
        (lIIIlllIIllIII = new int[2])[0] = ((0xEC ^ 0xA2) & ~(0x2 ^ 0x4C));
        FailedFuture.lIIIlllIIllIII[1] = " ".length();
    }
    
    private static void llIIIllIIIlllll() {
        (lIIIlllIIlIlll = new String[FailedFuture.lIIIlllIIllIII[1]])[FailedFuture.lIIIlllIIllIII[0]] = llIIIllIIIllllI("JisBOjU=", "EJtIP");
    }
    
    @Override
    public Future<V> sync() {
        PlatformDependent.throwException(this.cause);
        return this;
    }
    
    static {
        llIIIllIIlIIIII();
        llIIIllIIIlllll();
    }
    
    @Override
    public boolean isSuccess() {
        return FailedFuture.lIIIlllIIllIII[0] != 0;
    }
    
    @Override
    public Throwable cause() {
        return this.cause;
    }
    
    private static boolean llIIIllIIlIIIIl(final Object lllllllllllllIIlllllIlIlIIllllII) {
        return lllllllllllllIIlllllIlIlIIllllII == null;
    }
    
    @Override
    public Future<V> syncUninterruptibly() {
        PlatformDependent.throwException(this.cause);
        return this;
    }
    
    private static boolean llIIIllIIlIIIlI(final int lllllllllllllIIlllllIlIlIlIIIIlI, final int lllllllllllllIIlllllIlIlIlIIIIII) {
        return lllllllllllllIIlllllIlIlIlIIIIlI < lllllllllllllIIlllllIlIlIlIIIIII;
    }
    
    @Override
    public V getNow() {
        return null;
    }
}
