// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class Epoll
{
    private static final /* synthetic */ Throwable UNAVAILABILITY_CAUSE;
    private static final /* synthetic */ int[] lIllllIlIlllII;
    private static final /* synthetic */ String[] lIllllIlIllIlI;
    
    public static Throwable unavailabilityCause() {
        return Epoll.UNAVAILABILITY_CAUSE;
    }
    
    private static void lIIIIlIIlIlIllII() {
        (lIllllIlIlllII = new int[4])[0] = " ".length();
        Epoll.lIllllIlIlllII[1] = ((0x62 ^ 0x4D) & ~(0xBA ^ 0x95));
        Epoll.lIllllIlIlllII[2] = -" ".length();
        Epoll.lIllllIlIlllII[3] = "  ".length();
    }
    
    private static boolean lIIIIlIIlIlIlllI(final Object llllllllllllIllllIlIIIlllllIIIll) {
        return llllllllllllIllllIlIIIlllllIIIll != null;
    }
    
    private static boolean lIIIIlIIlIlIllll(final int llllllllllllIllllIlIIIllllIllllI, final int llllllllllllIllllIlIIIllllIlllIl) {
        return llllllllllllIllllIlIIIllllIllllI != llllllllllllIllllIlIIIllllIlllIl;
    }
    
    public static boolean isAvailable() {
        int n;
        if (lIIIIlIIlIlIllIl(Epoll.UNAVAILABILITY_CAUSE)) {
            n = Epoll.lIllllIlIlllII[0];
            "".length();
            if (-(0xC7 ^ 0xC3) > 0) {
                return ((0x4E ^ 0xF) & ~(0x69 ^ 0x28)) != 0x0;
            }
        }
        else {
            n = Epoll.lIllllIlIlllII[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIIlIIlIlIllIl(final Object llllllllllllIllllIlIIIlllllIIIIl) {
        return llllllllllllIllllIlIIIlllllIIIIl == null;
    }
    
    public static void ensureAvailability() {
        if (lIIIIlIIlIlIlllI(Epoll.UNAVAILABILITY_CAUSE)) {
            throw (Error)new UnsatisfiedLinkError(Epoll.lIllllIlIllIlI[Epoll.lIllllIlIlllII[1]]).initCause(Epoll.UNAVAILABILITY_CAUSE);
        }
    }
    
    static {
        lIIIIlIIlIlIllII();
        lIIIIlIIlIlIlIll();
        Throwable llllllllllllIllllIlIIIlllllllIlI = null;
        int llllllllllllIllllIlIIIlllllllIIl = Epoll.lIllllIlIlllII[2];
        int llllllllllllIllllIlIIIlllllllIII = Epoll.lIllllIlIlllII[2];
        try {
            llllllllllllIllllIlIIIlllllllIIl = Native.epollCreate();
            llllllllllllIllllIlIIIlllllllIII = Native.eventFd();
            if (lIIIIlIIlIlIllll(llllllllllllIllllIlIIIlllllllIIl, Epoll.lIllllIlIlllII[2])) {
                try {
                    Native.close(llllllllllllIllllIlIIIlllllllIIl);
                    "".length();
                    if (((129 + 86 - 72 + 109 ^ 102 + 163 - 131 + 45) & (70 + 16 - 8 + 49 ^ (0x90 ^ 0xA0) ^ -" ".length())) < 0) {
                        return;
                    }
                }
                catch (Exception ex) {}
            }
            if (lIIIIlIIlIlIllll(llllllllllllIllllIlIIIlllllllIII, Epoll.lIllllIlIlllII[2])) {
                try {
                    Native.close(llllllllllllIllllIlIIIlllllllIII);
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                }
                catch (Exception llllllllllllIllllIlIIlIIIIIIIIII) {
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                }
            }
        }
        catch (Throwable llllllllllllIllllIlIIIllllllllll) {
            llllllllllllIllllIlIIIlllllllIlI = llllllllllllIllllIlIIIllllllllll;
            if (lIIIIlIIlIlIllll(llllllllllllIllllIlIIIlllllllIIl, Epoll.lIllllIlIlllII[2])) {
                try {
                    Native.close(llllllllllllIllllIlIIIlllllllIIl);
                    "".length();
                    if ((0x63 ^ 0x67) <= " ".length()) {
                        return;
                    }
                }
                catch (Exception ex2) {}
            }
            if (lIIIIlIIlIlIllll(llllllllllllIllllIlIIIlllllllIII, Epoll.lIllllIlIlllII[2])) {
                try {
                    Native.close(llllllllllllIllllIlIIIlllllllIII);
                    "".length();
                    if ((0x16 ^ 0x8 ^ (0x12 ^ 0x8)) == "   ".length()) {
                        return;
                    }
                }
                catch (Exception llllllllllllIllllIlIIIllllllllIl) {
                    "".length();
                    if (-(62 + 91 - 104 + 139 ^ 166 + 82 - 215 + 151) >= 0) {
                        return;
                    }
                }
            }
        }
        finally {
            if (lIIIIlIIlIlIllll(llllllllllllIllllIlIIIlllllllIIl, Epoll.lIllllIlIlllII[2])) {
                try {
                    Native.close(llllllllllllIllllIlIIIlllllllIIl);
                    "".length();
                    if ((0x4B ^ 0x4F) == 0x0) {
                        return;
                    }
                }
                catch (Exception ex3) {}
            }
            if (lIIIIlIIlIlIllll(llllllllllllIllllIlIIIlllllllIII, Epoll.lIllllIlIlllII[2])) {
                try {
                    Native.close(llllllllllllIllllIlIIIlllllllIII);
                    "".length();
                    if (((0x33 ^ 0x5F ^ (0xF8 ^ 0xC6)) & (0xA3 ^ 0x84 ^ (0xEB ^ 0x9E) ^ -" ".length())) < 0) {
                        return;
                    }
                }
                catch (Exception ex4) {}
            }
        }
        if (lIIIIlIIlIlIlllI(llllllllllllIllllIlIIIlllllllIlI)) {
            UNAVAILABILITY_CAUSE = llllllllllllIllllIlIIIlllllllIlI;
            "".length();
            if (((0x74 ^ 0x36 ^ (0x66 ^ 0x39)) & (145 + 3 - 138 + 141 ^ 35 + 89 - 62 + 76 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            UNAVAILABILITY_CAUSE = null;
        }
    }
    
    private static void lIIIIlIIlIlIlIll() {
        (lIllllIlIllIlI = new String[Epoll.lIllllIlIlllII[0]])[Epoll.lIllllIlIlllII[1]] = lIIIIlIIlIlIIllI("l+uAocHV5q962OmCiuZj0gvbrr5sr+o6XYsaIHfvTcEDy1GRB5uqildUTRWKZcvA", "WcYVW");
    }
    
    private static String lIIIIlIIlIlIIllI(final String llllllllllllIllllIlIIIlllllIlIII, final String llllllllllllIllllIlIIIlllllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIIlllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIIlllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIIIlllllIllII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIIIlllllIllII.init(Epoll.lIllllIlIlllII[3], llllllllllllIllllIlIIIlllllIllIl);
            return new String(llllllllllllIllllIlIIIlllllIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIIlllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIIlllllIlIll) {
            llllllllllllIllllIlIIIlllllIlIll.printStackTrace();
            return null;
        }
    }
    
    private Epoll() {
    }
}
