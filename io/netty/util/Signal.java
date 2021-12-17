// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentMap;

public final class Signal extends Error
{
    private static final /* synthetic */ int[] lIlIIllIlIllII;
    private final /* synthetic */ UniqueName uname;
    private static final /* synthetic */ String[] lIlIIllIlIlIll;
    private static final /* synthetic */ ConcurrentMap<String, Boolean> map;
    
    @Override
    public String toString() {
        return this.uname.name();
    }
    
    @Override
    public Throwable initCause(final Throwable lllllllllllllIIIllIIlIllllIIllll) {
        return this;
    }
    
    public static Signal valueOf(final String lllllllllllllIIIllIIlIllllIlllll) {
        return new Signal(lllllllllllllIIIllIIlIllllIlllll);
    }
    
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
    
    private static boolean lllIlIIIIIIIlll(final Object lllllllllllllIIIllIIlIlllIlllIII, final Object lllllllllllllIIIllIIlIlllIllIlll) {
        return lllllllllllllIIIllIIlIlllIlllIII != lllllllllllllIIIllIIlIlllIllIlll;
    }
    
    private static void lllIlIIIIIIIlIl() {
        (lIlIIllIlIlIll = new String[Signal.lIlIIllIlIllII[1]])[Signal.lIlIIllIlIllII[0]] = lllIlIIIIIIIlII("+Obfn8tt+31Mhxzq2W8gvUL214y/sL9N", "arrSj");
    }
    
    private static String lllIlIIIIIIIlII(final String lllllllllllllIIIllIIlIllllIIIIII, final String lllllllllllllIIIllIIlIlllIllllll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIllllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIlIllllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIlIllllIIIIlI.init(Signal.lIlIIllIlIllII[2], lllllllllllllIIIllIIlIllllIIIIll);
            return new String(lllllllllllllIIIllIIlIllllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIllllIIIIIl) {
            lllllllllllllIIIllIIlIllllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lllIlIIIIIIIllI() {
        (lIlIIllIlIllII = new int[3])[0] = ((0x70 ^ 0x40) & ~(0x82 ^ 0xB2));
        Signal.lIlIIllIlIllII[1] = " ".length();
        Signal.lIlIIllIlIllII[2] = "  ".length();
    }
    
    public void expect(final Signal lllllllllllllIIIllIIlIllllIlIIlI) {
        if (lllIlIIIIIIIlll(this, lllllllllllllIIIllIIlIllllIlIIlI)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(Signal.lIlIIllIlIlIll[Signal.lIlIIllIlIllII[0]]).append(lllllllllllllIIIllIIlIllllIlIIlI)));
        }
    }
    
    static {
        lllIlIIIIIIIllI();
        lllIlIIIIIIIlIl();
        map = PlatformDependent.newConcurrentHashMap();
    }
    
    @Deprecated
    public Signal(final String lllllllllllllIIIllIIlIllllIllIlI) {
        super(lllllllllllllIIIllIIlIllllIllIlI);
        this.uname = new UniqueName(Signal.map, lllllllllllllIIIllIIlIllllIllIlI, new Object[Signal.lIlIIllIlIllII[0]]);
    }
}
