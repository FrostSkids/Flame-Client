// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.w3c.dom.Element;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;

public class ParsingException extends SlickException
{
    private static final /* synthetic */ int[] lIIIllIIIllIII;
    private static final /* synthetic */ String[] lIIIllIIIlIIll;
    
    private static void llIIIIlIllllIll() {
        (lIIIllIIIlIIll = new String[ParsingException.lIIIllIIIllIII[10]])[ParsingException.lIIIllIIIllIII[0]] = llIIIIlIlllIIII("Zg==", "NnFpa");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[1]] = llIIIIlIlllIIIl("Fq1GTSzMx2s=", "QgAkL");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[2]] = llIIIIlIlllIIII("bA==", "DdCPn");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[3]] = llIIIIlIlllIIIl("ZwdAMDBLPl0=", "ewsRh");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[4]] = llIIIIlIlllIIIl("BAPHzVmRpVA=", "srdbv");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[5]] = llIIIIlIlllIIII("WQ==", "qljmh");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[6]] = llIIIIlIllllIlI("4et1p8mbFAc=", "mdZZj");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[7]] = llIIIIlIlllIIIl("/+71eh2qYiE=", "VlFXg");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[8]] = llIIIIlIllllIlI("4NL9ZnQiGbY=", "PbNKc");
        ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[9]] = llIIIIlIllllIlI("uvLqpN78Pp0=", "ZPlMc");
    }
    
    private static void llIIIIllIIIIIII() {
        (lIIIllIIIllIII = new int[11])[0] = ((0x6F ^ 0x74 ^ "   ".length()) & (0x25 ^ 0xE ^ (0x8E ^ 0xBD) ^ -" ".length()));
        ParsingException.lIIIllIIIllIII[1] = " ".length();
        ParsingException.lIIIllIIIllIII[2] = "  ".length();
        ParsingException.lIIIllIIIllIII[3] = "   ".length();
        ParsingException.lIIIllIIIllIII[4] = (0x14 ^ 0x10);
        ParsingException.lIIIllIIIllIII[5] = (0x51 ^ 0x54);
        ParsingException.lIIIllIIIllIII[6] = (0x1A ^ 0x1C);
        ParsingException.lIIIllIIIllIII[7] = (0x46 ^ 0x1F ^ (0x2 ^ 0x5C));
        ParsingException.lIIIllIIIllIII[8] = (0x74 ^ 0x7C);
        ParsingException.lIIIllIIIllIII[9] = (0x51 ^ 0x58);
        ParsingException.lIIIllIIIllIII[10] = (0x78 ^ 0x72);
    }
    
    public ParsingException(final String lllllllllllllIlIIIIIllIllIlIlIll, final String lllllllllllllIlIIIIIllIllIlIlIlI, final Throwable lllllllllllllIlIIIIIllIllIlIlIIl) {
        super(String.valueOf(new StringBuilder().append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[0]]).append(lllllllllllllIlIIIIIllIllIlIlIll).append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[1]]).append(lllllllllllllIlIIIIIllIllIlIlIlI)), lllllllllllllIlIIIIIllIllIlIlIIl);
    }
    
    private static String llIIIIlIllllIlI(final String lllllllllllllIlIIIIIllIlIllIIlll, final String lllllllllllllIlIIIIIllIlIllIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIllIlIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIllIlIllIIllI.getBytes(StandardCharsets.UTF_8)), ParsingException.lIIIllIIIllIII[8]), "DES");
            final Cipher lllllllllllllIlIIIIIllIlIllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIllIlIllIlIIl.init(ParsingException.lIIIllIIIllIII[2], lllllllllllllIlIIIIIllIlIllIlIlI);
            return new String(lllllllllllllIlIIIIIllIlIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIllIlIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIllIlIllIlIII) {
            lllllllllllllIlIIIIIllIlIllIlIII.printStackTrace();
            return null;
        }
    }
    
    public ParsingException(final Element lllllllllllllIlIIIIIllIllIIIlIll, final String lllllllllllllIlIIIIIllIllIIIIlll) {
        super(String.valueOf(new StringBuilder().append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[7]]).append(lllllllllllllIlIIIIIllIllIIIlIll.getAttribute(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[8]])).append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[9]]).append(lllllllllllllIlIIIIIllIllIIIIlll)));
    }
    
    public ParsingException(final Element lllllllllllllIlIIIIIllIllIIlllll, final String lllllllllllllIlIIIIIllIllIIllIlI, final Throwable lllllllllllllIlIIIIIllIllIIlllIl) {
        super(String.valueOf(new StringBuilder().append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[2]]).append(lllllllllllllIlIIIIIllIllIIlllll.getAttribute(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[3]])).append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[4]]).append(lllllllllllllIlIIIIIllIllIIllIlI)), lllllllllllllIlIIIIIllIllIIlllIl);
    }
    
    private static String llIIIIlIlllIIIl(final String lllllllllllllIlIIIIIllIlIlIllIII, final String lllllllllllllIlIIIIIllIlIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIllIlIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIllIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIllIlIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIllIlIlIlllII.init(ParsingException.lIIIllIIIllIII[2], lllllllllllllIlIIIIIllIlIlIlllIl);
            return new String(lllllllllllllIlIIIIIllIlIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIllIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIllIlIlIllIll) {
            lllllllllllllIlIIIIIllIlIlIllIll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIlIlllIIII(String lllllllllllllIlIIIIIllIlIlllIlll, final String lllllllllllllIlIIIIIllIlIllllIll) {
        lllllllllllllIlIIIIIllIlIlllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIllIlIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIllIlIllllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIIIIllIlIllllIIl = lllllllllllllIlIIIIIllIlIllllIll.toCharArray();
        int lllllllllllllIlIIIIIllIlIllllIII = ParsingException.lIIIllIIIllIII[0];
        final int lllllllllllllIlIIIIIllIlIlllIIlI = (Object)lllllllllllllIlIIIIIllIlIlllIlll.toCharArray();
        final long lllllllllllllIlIIIIIllIlIlllIIIl = lllllllllllllIlIIIIIllIlIlllIIlI.length;
        short lllllllllllllIlIIIIIllIlIlllIIII = (short)ParsingException.lIIIllIIIllIII[0];
        while (llIIIIllIIIIIIl(lllllllllllllIlIIIIIllIlIlllIIII, (int)lllllllllllllIlIIIIIllIlIlllIIIl)) {
            final char lllllllllllllIlIIIIIllIlIlllllIl = lllllllllllllIlIIIIIllIlIlllIIlI[lllllllllllllIlIIIIIllIlIlllIIII];
            lllllllllllllIlIIIIIllIlIllllIlI.append((char)(lllllllllllllIlIIIIIllIlIlllllIl ^ lllllllllllllIlIIIIIllIlIllllIIl[lllllllllllllIlIIIIIllIlIllllIII % lllllllllllllIlIIIIIllIlIllllIIl.length]));
            "".length();
            ++lllllllllllllIlIIIIIllIlIllllIII;
            ++lllllllllllllIlIIIIIllIlIlllIIII;
            "".length();
            if (-" ".length() > ((0x97 ^ 0xB4) & ~(0x82 ^ 0xA1))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIllIlIllllIlI);
    }
    
    public ParsingException(final String lllllllllllllIlIIIIIllIllIIlIlII, final String lllllllllllllIlIIIIIllIllIIlIIll) {
        super(String.valueOf(new StringBuilder().append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[5]]).append(lllllllllllllIlIIIIIllIllIIlIlII).append(ParsingException.lIIIllIIIlIIll[ParsingException.lIIIllIIIllIII[6]]).append(lllllllllllllIlIIIIIllIllIIlIIll)));
    }
    
    static {
        llIIIIllIIIIIII();
        llIIIIlIllllIll();
    }
    
    private static boolean llIIIIllIIIIIIl(final int lllllllllllllIlIIIIIllIlIlIlIIlI, final int lllllllllllllIlIIIIIllIlIlIlIIIl) {
        return lllllllllllllIlIIIIIllIlIlIlIIlI < lllllllllllllIlIIIIIllIlIlIlIIIl;
    }
}
