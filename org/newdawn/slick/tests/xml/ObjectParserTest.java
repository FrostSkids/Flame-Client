// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.xml;

import org.newdawn.slick.util.xml.SlickXMLException;
import org.newdawn.slick.util.xml.ObjectTreeParser;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ObjectParserTest
{
    private static final /* synthetic */ String[] lllIlIIIIllIIl;
    private static final /* synthetic */ int[] lllIlIIIIllIll;
    
    private static String lIlIIIIllIIIIIlI(final String llllllllllllIlIlllIIllIIlIlIlIlI, final String llllllllllllIlIlllIIllIIlIlIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllIIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), ObjectParserTest.lllIlIIIIllIll[5]), "DES");
            final Cipher llllllllllllIlIlllIIllIIlIlIllII = Cipher.getInstance("DES");
            llllllllllllIlIlllIIllIIlIlIllII.init(ObjectParserTest.lllIlIIIIllIll[2], llllllllllllIlIlllIIllIIlIlIllIl);
            return new String(llllllllllllIlIlllIIllIIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllIIlIlIlIll) {
            llllllllllllIlIlllIIllIIlIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIllIIIlIII(final int llllllllllllIlIlllIIllIIIlllllIl, final int llllllllllllIlIlllIIllIIIlllllII) {
        return llllllllllllIlIlllIIllIIIlllllIl < llllllllllllIlIlllIIllIIIlllllII;
    }
    
    static {
        lIlIIIIllIIIIlll();
        lIlIIIIllIIIIlII();
    }
    
    private static String lIlIIIIllIIIIIll(final String llllllllllllIlIlllIIllIIlIIIIlIl, final String llllllllllllIlIlllIIllIIlIIIIlII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllIIlIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIllIIlIIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIllIIlIIIIlll.init(ObjectParserTest.lllIlIIIIllIll[2], llllllllllllIlIlllIIllIIlIIIlIII);
            return new String(llllllllllllIlIlllIIllIIlIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllIIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllIIlIIIIllI) {
            llllllllllllIlIlllIIllIIlIIIIllI.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] llllllllllllIlIlllIIllIIlIllIllI) throws SlickXMLException {
        final ObjectTreeParser llllllllllllIlIlllIIllIIlIllIlIl = new ObjectTreeParser(ObjectParserTest.lllIlIIIIllIIl[ObjectParserTest.lllIlIIIIllIll[0]]);
        llllllllllllIlIlllIIllIIlIllIlIl.addElementMapping(ObjectParserTest.lllIlIIIIllIIl[ObjectParserTest.lllIlIIIIllIll[1]], ItemContainer.class);
        final GameData llllllllllllIlIlllIIllIIlIllIlII = (GameData)llllllllllllIlIlllIIllIIlIllIlIl.parse(ObjectParserTest.lllIlIIIIllIIl[ObjectParserTest.lllIlIIIIllIll[2]]);
        llllllllllllIlIlllIIllIIlIllIlII.dump(ObjectParserTest.lllIlIIIIllIIl[ObjectParserTest.lllIlIIIIllIll[3]]);
    }
    
    private static String lIlIIIIllIIIIIIl(String llllllllllllIlIlllIIllIIlIIlIlIl, final String llllllllllllIlIlllIIllIIlIIllIIl) {
        llllllllllllIlIlllIIllIIlIIlIlIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIIllIIlIIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIllIIlIIllIII = new StringBuilder();
        final char[] llllllllllllIlIlllIIllIIlIIlIlll = llllllllllllIlIlllIIllIIlIIllIIl.toCharArray();
        int llllllllllllIlIlllIIllIIlIIlIllI = ObjectParserTest.lllIlIIIIllIll[0];
        final double llllllllllllIlIlllIIllIIlIIlIIII = (Object)((String)llllllllllllIlIlllIIllIIlIIlIlIl).toCharArray();
        final double llllllllllllIlIlllIIllIIlIIIllll = llllllllllllIlIlllIIllIIlIIlIIII.length;
        char llllllllllllIlIlllIIllIIlIIIlllI = (char)ObjectParserTest.lllIlIIIIllIll[0];
        while (lIlIIIIllIIIlIII(llllllllllllIlIlllIIllIIlIIIlllI, (int)llllllllllllIlIlllIIllIIlIIIllll)) {
            final char llllllllllllIlIlllIIllIIlIIllIll = llllllllllllIlIlllIIllIIlIIlIIII[llllllllllllIlIlllIIllIIlIIIlllI];
            llllllllllllIlIlllIIllIIlIIllIII.append((char)(llllllllllllIlIlllIIllIIlIIllIll ^ llllllllllllIlIlllIIllIIlIIlIlll[llllllllllllIlIlllIIllIIlIIlIllI % llllllllllllIlIlllIIllIIlIIlIlll.length]));
            "".length();
            ++llllllllllllIlIlllIIllIIlIIlIllI;
            ++llllllllllllIlIlllIIllIIlIIIlllI;
            "".length();
            if ("  ".length() <= ((0x60 ^ 0x32 ^ (0x55 ^ 0x43)) & (124 + 13 - 55 + 116 ^ 123 + 110 - 193 + 90 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIllIIlIIllIII);
    }
    
    private static void lIlIIIIllIIIIlII() {
        (lllIlIIIIllIIl = new String[ObjectParserTest.lllIlIIIIllIll[4]])[ObjectParserTest.lllIlIIIIllIll[0]] = lIlIIIIllIIIIIIl("IRAMdi8rFQ85NiBMGDQoLQlFLCQ9Fhh2OSMO", "NbkXA");
        ObjectParserTest.lllIlIIIIllIIl[ObjectParserTest.lllIlIIIIllIll[1]] = lIlIIIIllIIIIIIl("DgYy", "LgUAE");
        ObjectParserTest.lllIlIIIIllIIl[ObjectParserTest.lllIlIIIIllIll[2]] = lIlIIIIllIIIIIlI("FxLZApCREktMwyto/s7ZkzvJu+JRIm3s", "nDbOR");
        ObjectParserTest.lllIlIIIIllIIl[ObjectParserTest.lllIlIIIIllIll[3]] = lIlIIIIllIIIIIll("E+J+zxX8G3k=", "RRqHq");
    }
    
    private static void lIlIIIIllIIIIlll() {
        (lllIlIIIIllIll = new int[6])[0] = ((0x5D ^ 0x38 ^ (0x11 ^ 0x37)) & (0x44 ^ 0x7E ^ (0x6C ^ 0x15) ^ -" ".length()));
        ObjectParserTest.lllIlIIIIllIll[1] = " ".length();
        ObjectParserTest.lllIlIIIIllIll[2] = "  ".length();
        ObjectParserTest.lllIlIIIIllIll[3] = "   ".length();
        ObjectParserTest.lllIlIIIIllIll[4] = (136 + 88 - 127 + 48 ^ 67 + 98 - 135 + 119);
        ObjectParserTest.lllIlIIIIllIll[5] = (0x3D ^ 0x60 ^ (0xC8 ^ 0x9D));
    }
}
