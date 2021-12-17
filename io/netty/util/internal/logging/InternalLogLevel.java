// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum InternalLogLevel
{
    ERROR, 
    DEBUG, 
    WARN, 
    TRACE;
    
    private static final /* synthetic */ String[] lIllIIIlllllll;
    private static final /* synthetic */ int[] lIllIIlIIIIIIl;
    
    INFO;
    
    private static String lllllIIlIIlllII(final String lllllllllllllIIIIIlIIllIlIIlIIIl, final String lllllllllllllIIIIIlIIllIlIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIIllIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIIllIlIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlIIllIlIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlIIllIlIIllIIl.init(InternalLogLevel.lIllIIlIIIIIIl[2], lllllllllllllIIIIIlIIllIlIIllIll);
            return new String(lllllllllllllIIIIIlIIllIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIIllIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIIllIlIIlIlll) {
            lllllllllllllIIIIIlIIllIlIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lllllIIlIIlllIl(final String lllllllllllllIIIIIlIIllIllIlIllI, final String lllllllllllllIIIIIlIIllIllIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIIllIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIIllIllIlIlII.getBytes(StandardCharsets.UTF_8)), InternalLogLevel.lIllIIlIIIIIIl[6]), "DES");
            final Cipher lllllllllllllIIIIIlIIllIllIlllIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIlIIllIllIlllIl.init(InternalLogLevel.lIllIIlIIIIIIl[2], lllllllllllllIIIIIlIIllIllIllllI);
            return new String(lllllllllllllIIIIIlIIllIllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIIllIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIIllIllIlllII) {
            lllllllllllllIIIIIlIIllIllIlllII.printStackTrace();
            return null;
        }
    }
    
    private static void lllllIIlIIlllll() {
        (lIllIIIlllllll = new String[InternalLogLevel.lIllIIlIIIIIIl[5]])[InternalLogLevel.lIllIIlIIIIIIl[0]] = lllllIIlIIlllII("Vxb2z103iP4=", "XiNNy");
        InternalLogLevel.lIllIIIlllllll[InternalLogLevel.lIllIIlIIIIIIl[1]] = lllllIIlIIlllIl("h6VKJiBk/gA=", "HENLw");
        InternalLogLevel.lIllIIIlllllll[InternalLogLevel.lIllIIlIIIIIIl[2]] = lllllIIlIIllllI("Bh0jCg==", "OSeEd");
        InternalLogLevel.lIllIIIlllllll[InternalLogLevel.lIllIIlIIIIIIl[3]] = lllllIIlIIlllII("5ttX++VhbPM=", "PtWcu");
        InternalLogLevel.lIllIIIlllllll[InternalLogLevel.lIllIIlIIIIIIl[4]] = lllllIIlIIlllIl("8Xx5RJRaxoE=", "jqFll");
    }
    
    private static void lllllIIlIlIlIIl() {
        (lIllIIlIIIIIIl = new int[7])[0] = ((0xE7 ^ 0x8C ^ (0x31 ^ 0x66)) & (144 + 189 - 329 + 186 ^ 113 + 26 - 37 + 28 ^ -" ".length()));
        InternalLogLevel.lIllIIlIIIIIIl[1] = " ".length();
        InternalLogLevel.lIllIIlIIIIIIl[2] = "  ".length();
        InternalLogLevel.lIllIIlIIIIIIl[3] = "   ".length();
        InternalLogLevel.lIllIIlIIIIIIl[4] = (0x24 ^ 0x20);
        InternalLogLevel.lIllIIlIIIIIIl[5] = (26 + 29 + 61 + 72 ^ 120 + 8 - 53 + 110);
        InternalLogLevel.lIllIIlIIIIIIl[6] = (0xCA ^ 0xC2);
    }
    
    private static boolean lllllIIlIlIlIlI(final int lllllllllllllIIIIIlIIllIlIIIIllI, final int lllllllllllllIIIIIlIIllIlIIIIlII) {
        return lllllllllllllIIIIIlIIllIlIIIIllI < lllllllllllllIIIIIlIIllIlIIIIlII;
    }
    
    static {
        lllllIIlIlIlIIl();
        lllllIIlIIlllll();
        final InternalLogLevel[] $values = new InternalLogLevel[InternalLogLevel.lIllIIlIIIIIIl[5]];
        $values[InternalLogLevel.lIllIIlIIIIIIl[0]] = InternalLogLevel.TRACE;
        $values[InternalLogLevel.lIllIIlIIIIIIl[1]] = InternalLogLevel.DEBUG;
        $values[InternalLogLevel.lIllIIlIIIIIIl[2]] = InternalLogLevel.INFO;
        $values[InternalLogLevel.lIllIIlIIIIIIl[3]] = InternalLogLevel.WARN;
        $values[InternalLogLevel.lIllIIlIIIIIIl[4]] = InternalLogLevel.ERROR;
        $VALUES = $values;
    }
    
    private static String lllllIIlIIllllI(String lllllllllllllIIIIIlIIllIlIllIIIl, final String lllllllllllllIIIIIlIIllIlIlIllll) {
        lllllllllllllIIIIIlIIllIlIllIIIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIlIIllIlIllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIIllIlIllIllI = new StringBuilder();
        final char[] lllllllllllllIIIIIlIIllIlIllIlII = lllllllllllllIIIIIlIIllIlIlIllll.toCharArray();
        int lllllllllllllIIIIIlIIllIlIllIIll = InternalLogLevel.lIllIIlIIIIIIl[0];
        final String lllllllllllllIIIIIlIIllIlIlIlIIl = (Object)((String)lllllllllllllIIIIIlIIllIlIllIIIl).toCharArray();
        final char lllllllllllllIIIIIlIIllIlIlIlIII = (char)lllllllllllllIIIIIlIIllIlIlIlIIl.length;
        short lllllllllllllIIIIIlIIllIlIlIIlll = (short)InternalLogLevel.lIllIIlIIIIIIl[0];
        while (lllllIIlIlIlIlI(lllllllllllllIIIIIlIIllIlIlIIlll, lllllllllllllIIIIIlIIllIlIlIlIII)) {
            final char lllllllllllllIIIIIlIIllIlIllllII = lllllllllllllIIIIIlIIllIlIlIlIIl[lllllllllllllIIIIIlIIllIlIlIIlll];
            lllllllllllllIIIIIlIIllIlIllIllI.append((char)(lllllllllllllIIIIIlIIllIlIllllII ^ lllllllllllllIIIIIlIIllIlIllIlII[lllllllllllllIIIIIlIIllIlIllIIll % lllllllllllllIIIIIlIIllIlIllIlII.length]));
            "".length();
            ++lllllllllllllIIIIIlIIllIlIllIIll;
            ++lllllllllllllIIIIIlIIllIlIlIIlll;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIIllIlIllIllI);
    }
}
