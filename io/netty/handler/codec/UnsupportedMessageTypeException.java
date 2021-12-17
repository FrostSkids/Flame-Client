// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class UnsupportedMessageTypeException extends CodecException
{
    private static final /* synthetic */ int[] lIIlllIIlllIIl;
    private static final /* synthetic */ String[] lIIlllIIllIlIl;
    
    public UnsupportedMessageTypeException(final Throwable lllllllllllllIIlIlIIIIIlllIlIIlI) {
        super(lllllllllllllIIlIlIIIIIlllIlIIlI);
    }
    
    private static boolean llIllIllIIlIlll(final Object lllllllllllllIIlIlIIIIIllIIlIlII) {
        return lllllllllllllIIlIlIIIIIllIIlIlII == null;
    }
    
    public UnsupportedMessageTypeException(final String lllllllllllllIIlIlIIIIIlllIlIllI) {
        super(lllllllllllllIIlIlIIIIIlllIlIllI);
    }
    
    private static boolean llIllIllIIllIIl(final int lllllllllllllIIlIlIIIIIllIIlIIlI) {
        return lllllllllllllIIlIlIIIIIllIIlIIlI > 0;
    }
    
    static {
        llIllIllIIlIllI();
        llIllIllIIlIIIl();
    }
    
    public UnsupportedMessageTypeException(final Object lllllllllllllIIlIlIIIIIllllIlIIl, final Class<?>... lllllllllllllIIlIlIIIIIllllIlIll) {
        String name;
        if (llIllIllIIlIlll(lllllllllllllIIlIlIIIIIllllIlIIl)) {
            name = UnsupportedMessageTypeException.lIIlllIIllIlIl[UnsupportedMessageTypeException.lIIlllIIlllIIl[0]];
            "".length();
            if ((("   ".length() ^ (0x6B ^ 0x6D)) & (17 + 103 - 63 + 83 ^ 58 + 81 - 96 + 94 ^ -" ".length())) != 0x0) {
                throw null;
            }
        }
        else {
            name = lllllllllllllIIlIlIIIIIllllIlIIl.getClass().getName();
        }
        super(message(name, lllllllllllllIIlIlIIIIIllllIlIll));
    }
    
    public UnsupportedMessageTypeException(final String lllllllllllllIIlIlIIIIIllllIIIII, final Throwable lllllllllllllIIlIlIIIIIlllIlllII) {
        super(lllllllllllllIIlIlIIIIIllllIIIII, lllllllllllllIIlIlIIIIIlllIlllII);
    }
    
    private static void llIllIllIIlIllI() {
        (lIIlllIIlllIIl = new int[5])[0] = ((0x7 ^ 0x4D ^ (0x6 ^ 0x1)) & (14 + 187 - 104 + 155 ^ 128 + 117 - 72 + 4 ^ -" ".length()));
        UnsupportedMessageTypeException.lIIlllIIlllIIl[1] = " ".length();
        UnsupportedMessageTypeException.lIIlllIIlllIIl[2] = "  ".length();
        UnsupportedMessageTypeException.lIIlllIIlllIIl[3] = (0x65 ^ 0x4C);
        UnsupportedMessageTypeException.lIIlllIIlllIIl[4] = "   ".length();
    }
    
    private static boolean llIllIllIIllIII(final Object lllllllllllllIIlIlIIIIIllIIlIllI) {
        return lllllllllllllIIlIlIIIIIllIIlIllI != null;
    }
    
    private static String llIllIllIIIllII(final String lllllllllllllIIlIlIIIIIllIlIIIIl, final String lllllllllllllIIlIlIIIIIllIIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIIIIllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIIIIIllIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIIIIIllIlIIIll.init(UnsupportedMessageTypeException.lIIlllIIlllIIl[2], lllllllllllllIIlIlIIIIIllIlIIlII);
            return new String(lllllllllllllIIlIlIIIIIllIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIIIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIIIIllIlIIIlI) {
            lllllllllllllIIlIlIIIIIllIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static String message(final String lllllllllllllIIlIlIIIIIlllIIIlIl, final Class<?>... lllllllllllllIIlIlIIIIIlllIIIlll) {
        final StringBuilder lllllllllllllIIlIlIIIIIlllIIIllI = new StringBuilder(lllllllllllllIIlIlIIIIIlllIIIlIl);
        if (llIllIllIIllIII(lllllllllllllIIlIlIIIIIlllIIIlll) && llIllIllIIllIIl(lllllllllllllIIlIlIIIIIlllIIIlll.length)) {
            lllllllllllllIIlIlIIIIIlllIIIllI.append(UnsupportedMessageTypeException.lIIlllIIllIlIl[UnsupportedMessageTypeException.lIIlllIIlllIIl[1]]).append(lllllllllllllIIlIlIIIIIlllIIIlll[UnsupportedMessageTypeException.lIIlllIIlllIIl[0]].getName());
            "".length();
            int lllllllllllllIIlIlIIIIIlllIIlIIl = UnsupportedMessageTypeException.lIIlllIIlllIIl[1];
            while (llIllIllIIllIlI(lllllllllllllIIlIlIIIIIlllIIlIIl, lllllllllllllIIlIlIIIIIlllIIIlll.length)) {
                final Class<?> lllllllllllllIIlIlIIIIIlllIIlIlI = lllllllllllllIIlIlIIIIIlllIIIlll[lllllllllllllIIlIlIIIIIlllIIlIIl];
                if (llIllIllIIlIlll(lllllllllllllIIlIlIIIIIlllIIlIlI)) {
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return null;
                    }
                    break;
                }
                else {
                    lllllllllllllIIlIlIIIIIlllIIIllI.append(UnsupportedMessageTypeException.lIIlllIIllIlIl[UnsupportedMessageTypeException.lIIlllIIlllIIl[2]]).append(lllllllllllllIIlIlIIIIIlllIIlIlI.getName());
                    "".length();
                    ++lllllllllllllIIlIlIIIIIlllIIlIIl;
                    "".length();
                    if (((0x25 ^ 0x29) & ~(0x12 ^ 0x1E)) != 0x0) {
                        return null;
                    }
                    continue;
                }
            }
            lllllllllllllIIlIlIIIIIlllIIIllI.append((char)UnsupportedMessageTypeException.lIIlllIIlllIIl[3]);
            "".length();
        }
        return String.valueOf(lllllllllllllIIlIlIIIIIlllIIIllI);
    }
    
    private static void llIllIllIIlIIIl() {
        (lIIlllIIllIlIl = new String[UnsupportedMessageTypeException.lIIlllIIlllIIl[4]])[UnsupportedMessageTypeException.lIIlllIIlllIIl[0]] = llIllIllIIIlIll("FAc0Ng==", "zrXZf");
        UnsupportedMessageTypeException.lIIlllIIllIlIl[UnsupportedMessageTypeException.lIIlllIIlllIIl[1]] = llIllIllIIIllII("V+Ix3mMRSYxwe7HkICRY9g==", "sSzWn");
        UnsupportedMessageTypeException.lIIlllIIllIlIl[UnsupportedMessageTypeException.lIIlllIIlllIIl[2]] = llIllIllIIIllII("wM0yRz/kwnQ=", "VCHGG");
    }
    
    public UnsupportedMessageTypeException() {
    }
    
    private static boolean llIllIllIIllIlI(final int lllllllllllllIIlIlIIIIIllIIllIIl, final int lllllllllllllIIlIlIIIIIllIIllIII) {
        return lllllllllllllIIlIlIIIIIllIIllIIl < lllllllllllllIIlIlIIIIIllIIllIII;
    }
    
    private static String llIllIllIIIlIll(String lllllllllllllIIlIlIIIIIllIllIIIl, final String lllllllllllllIIlIlIIIIIllIllIIII) {
        lllllllllllllIIlIlIIIIIllIllIIIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIIIIIllIllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIIIIllIllIlII = new StringBuilder();
        final char[] lllllllllllllIIlIlIIIIIllIllIIll = lllllllllllllIIlIlIIIIIllIllIIII.toCharArray();
        int lllllllllllllIIlIlIIIIIllIllIIlI = UnsupportedMessageTypeException.lIIlllIIlllIIl[0];
        final boolean lllllllllllllIIlIlIIIIIllIlIllII = (Object)((String)lllllllllllllIIlIlIIIIIllIllIIIl).toCharArray();
        final char lllllllllllllIIlIlIIIIIllIlIlIll = (char)lllllllllllllIIlIlIIIIIllIlIllII.length;
        Exception lllllllllllllIIlIlIIIIIllIlIlIlI = (Exception)UnsupportedMessageTypeException.lIIlllIIlllIIl[0];
        while (llIllIllIIllIlI((int)lllllllllllllIIlIlIIIIIllIlIlIlI, lllllllllllllIIlIlIIIIIllIlIlIll)) {
            final char lllllllllllllIIlIlIIIIIllIllIlll = lllllllllllllIIlIlIIIIIllIlIllII[lllllllllllllIIlIlIIIIIllIlIlIlI];
            lllllllllllllIIlIlIIIIIllIllIlII.append((char)(lllllllllllllIIlIlIIIIIllIllIlll ^ lllllllllllllIIlIlIIIIIllIllIIll[lllllllllllllIIlIlIIIIIllIllIIlI % lllllllllllllIIlIlIIIIIllIllIIll.length]));
            "".length();
            ++lllllllllllllIIlIlIIIIIllIllIIlI;
            ++lllllllllllllIIlIlIIIIIllIlIlIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIIIIllIllIlII);
    }
}
