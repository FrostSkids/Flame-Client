// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import java.util.Arrays;
import org.newdawn.slick.svg.ParsingException;
import org.newdawn.slick.svg.NonGeometricData;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.svg.Figure;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.svg.Diagram;
import org.w3c.dom.Element;
import org.newdawn.slick.svg.Loader;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class RectProcessor implements ElementProcessor
{
    private static final /* synthetic */ int[] lIlIlIllIIllll;
    private static final /* synthetic */ String[] lIlIlIllIIllIl;
    
    private static String lllIllllIIIlIll(final String lllllllllllllIIIIllllllllIllIlIl, final String lllllllllllllIIIIllllllllIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllllllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllllllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllllllllIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllllllllIlllIIl.init(RectProcessor.lIlIlIllIIllll[2], lllllllllllllIIIIllllllllIlllIlI);
            return new String(lllllllllllllIIIIllllllllIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllllllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllllllIlllIII) {
            lllllllllllllIIIIllllllllIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIllllIIIIlll(String lllllllllllllIIIIlllllllllIIIlll, final String lllllllllllllIIIIlllllllllIIIllI) {
        lllllllllllllIIIIlllllllllIIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIIlllllllllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllllllllIIlIlI = new StringBuilder();
        final char[] lllllllllllllIIIIlllllllllIIlIIl = lllllllllllllIIIIlllllllllIIIllI.toCharArray();
        int lllllllllllllIIIIlllllllllIIlIII = RectProcessor.lIlIlIllIIllll[0];
        final float lllllllllllllIIIIlllllllllIIIIlI = (Object)lllllllllllllIIIIlllllllllIIIlll.toCharArray();
        final String lllllllllllllIIIIlllllllllIIIIIl = (String)lllllllllllllIIIIlllllllllIIIIlI.length;
        byte lllllllllllllIIIIlllllllllIIIIII = (byte)RectProcessor.lIlIlIllIIllll[0];
        while (lllIllllIIlIIll(lllllllllllllIIIIlllllllllIIIIII, (int)lllllllllllllIIIIlllllllllIIIIIl)) {
            final char lllllllllllllIIIIlllllllllIIllIl = lllllllllllllIIIIlllllllllIIIIlI[lllllllllllllIIIIlllllllllIIIIII];
            lllllllllllllIIIIlllllllllIIlIlI.append((char)(lllllllllllllIIIIlllllllllIIllIl ^ lllllllllllllIIIIlllllllllIIlIIl[lllllllllllllIIIIlllllllllIIlIII % lllllllllllllIIIIlllllllllIIlIIl.length]));
            "".length();
            ++lllllllllllllIIIIlllllllllIIlIII;
            ++lllllllllllllIIIIlllllllllIIIIII;
            "".length();
            if (((0xF1 ^ 0xB8 ^ (0x73 ^ 0x32)) & (0x69 ^ 0x10 ^ (0xF7 ^ 0x86) ^ -" ".length())) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllllllllIIlIlI);
    }
    
    public void process(final Loader lllllllllllllIIIIlllllllllllIIIl, final Element lllllllllllllIIIIlllllllllllIIII, final Diagram lllllllllllllIIIIllllllllllIIlII, final Transform lllllllllllllIIIIllllllllllIIIll) throws ParsingException {
        Transform lllllllllllllIIIIllllllllllIllIl = Util.getTransform(lllllllllllllIIIIlllllllllllIIII);
        lllllllllllllIIIIllllllllllIllIl = new Transform(lllllllllllllIIIIllllllllllIIIll, lllllllllllllIIIIllllllllllIllIl);
        final float lllllllllllllIIIIllllllllllIllII = Float.parseFloat(lllllllllllllIIIIlllllllllllIIII.getAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[0]]));
        final float lllllllllllllIIIIllllllllllIlIll = Float.parseFloat(lllllllllllllIIIIlllllllllllIIII.getAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[1]]));
        final float lllllllllllllIIIIllllllllllIlIlI = Float.parseFloat(lllllllllllllIIIIlllllllllllIIII.getAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[2]]));
        final float lllllllllllllIIIIllllllllllIlIIl = Float.parseFloat(lllllllllllllIIIIlllllllllllIIII.getAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[3]]));
        final Rectangle lllllllllllllIIIIllllllllllIlIII = new Rectangle(lllllllllllllIIIIllllllllllIlIlI, lllllllllllllIIIIllllllllllIlIIl, lllllllllllllIIIIllllllllllIllII + 1.0f, lllllllllllllIIIIllllllllllIlIll + 1.0f);
        final Shape lllllllllllllIIIIllllllllllIIlll = lllllllllllllIIIIllllllllllIlIII.transform(lllllllllllllIIIIllllllllllIllIl);
        final NonGeometricData lllllllllllllIIIIllllllllllIIllI = Util.getNonGeometricData(lllllllllllllIIIIlllllllllllIIII);
        lllllllllllllIIIIllllllllllIIllI.addAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[4]], String.valueOf(new StringBuilder().append(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[5]]).append(lllllllllllllIIIIllllllllllIllII)));
        lllllllllllllIIIIllllllllllIIllI.addAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[6]], String.valueOf(new StringBuilder().append(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[7]]).append(lllllllllllllIIIIllllllllllIlIll)));
        lllllllllllllIIIIllllllllllIIllI.addAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[8]], String.valueOf(new StringBuilder().append(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[9]]).append(lllllllllllllIIIIllllllllllIlIlI)));
        lllllllllllllIIIIllllllllllIIllI.addAttribute(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[10]], String.valueOf(new StringBuilder().append(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[11]]).append(lllllllllllllIIIIllllllllllIlIIl)));
        lllllllllllllIIIIllllllllllIIlII.addFigure(new Figure(RectProcessor.lIlIlIllIIllll[3], lllllllllllllIIIIllllllllllIIlll, lllllllllllllIIIIllllllllllIIllI, lllllllllllllIIIIllllllllllIllIl));
    }
    
    private static String lllIllllIIIIIll(final String lllllllllllllIIIIllllllllIlIlIlI, final String lllllllllllllIIIIllllllllIlIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllllllIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllllllIlIlIIl.getBytes(StandardCharsets.UTF_8)), RectProcessor.lIlIlIllIIllll[8]), "DES");
            final Cipher lllllllllllllIIIIllllllllIlIllII = Cipher.getInstance("DES");
            lllllllllllllIIIIllllllllIlIllII.init(RectProcessor.lIlIlIllIIllll[2], lllllllllllllIIIIllllllllIlIllIl);
            return new String(lllllllllllllIIIIllllllllIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllllllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllllllIlIlIll) {
            lllllllllllllIIIIllllllllIlIlIll.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIllllIIlIIIl();
        lllIllllIIIlllI();
    }
    
    public boolean handles(final Element lllllllllllllIIIIlllllllllIlIlll) {
        if (lllIllllIIlIIlI(lllllllllllllIIIIlllllllllIlIlll.getNodeName().equals(RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[12]]) ? 1 : 0)) {
            return RectProcessor.lIlIlIllIIllll[1] != 0;
        }
        return RectProcessor.lIlIlIllIIllll[0] != 0;
    }
    
    private static void lllIllllIIIlllI() {
        (lIlIlIllIIllIl = new String[RectProcessor.lIlIlIllIIllll[13]])[RectProcessor.lIlIlIllIIllll[0]] = lllIllllIIIIIll("orGAxOnMuVI=", "vQRfr");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[1]] = lllIllllIIIIlll("JwMFFDo7", "OflsR");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[2]] = lllIllllIIIIIll("ZUCNgcauCZI=", "LjkCU");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[3]] = lllIllllIIIlIll("Q1LZZ7OceoM=", "GhzPi");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[4]] = lllIllllIIIlIll("zkF5bjTwjKk=", "dtMVP");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[5]] = lllIllllIIIlIll("00y1NuzIVgo=", "jcIme");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[6]] = lllIllllIIIlIll("gXeQO5vTEBM=", "BuFBP");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[7]] = lllIllllIIIlIll("EOwjzKueqYs=", "aJIcJ");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[8]] = lllIllllIIIIIll("bQz4zb+mQtQ=", "aiVVM");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[9]] = lllIllllIIIIIll("8yYM19Y3NnQ=", "kHhPx");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[10]] = lllIllllIIIlIll("2Wn+arjtlLQ=", "gqTfd");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[11]] = lllIllllIIIIlll("", "FgsGh");
        RectProcessor.lIlIlIllIIllIl[RectProcessor.lIlIlIllIIllll[12]] = lllIllllIIIIlll("PioxLQ==", "LORYu");
    }
    
    private static void lllIllllIIlIIIl() {
        (lIlIlIllIIllll = new int[14])[0] = ((0x1C ^ 0x22) & ~(0x30 ^ 0xE));
        RectProcessor.lIlIlIllIIllll[1] = " ".length();
        RectProcessor.lIlIlIllIIllll[2] = "  ".length();
        RectProcessor.lIlIlIllIIllll[3] = "   ".length();
        RectProcessor.lIlIlIllIIllll[4] = (0x18 ^ 0x1C);
        RectProcessor.lIlIlIllIIllll[5] = (61 + 80 - 48 + 47 ^ 118 + 114 - 228 + 133);
        RectProcessor.lIlIlIllIIllll[6] = (86 + 24 - 100 + 129 ^ 97 + 128 - 116 + 32);
        RectProcessor.lIlIlIllIIllll[7] = (0x12 ^ 0x15);
        RectProcessor.lIlIlIllIIllll[8] = (0x6D ^ 0x59 ^ (0x38 ^ 0x4));
        RectProcessor.lIlIlIllIIllll[9] = (0x1F ^ 0x7F ^ (0xFD ^ 0x94));
        RectProcessor.lIlIlIllIIllll[10] = (0xAB ^ 0xA1);
        RectProcessor.lIlIlIllIIllll[11] = (0xF ^ 0x17 ^ (0x5C ^ 0x4F));
        RectProcessor.lIlIlIllIIllll[12] = (0xC0 ^ 0xC5 ^ (0x3D ^ 0x34));
        RectProcessor.lIlIlIllIIllll[13] = (0x8 ^ 0x5);
    }
    
    private static boolean lllIllllIIlIIll(final int lllllllllllllIIIIllllllllIlIIIlI, final int lllllllllllllIIIIllllllllIlIIIIl) {
        return lllllllllllllIIIIllllllllIlIIIlI < lllllllllllllIIIIllllllllIlIIIIl;
    }
    
    private static boolean lllIllllIIlIIlI(final int lllllllllllllIIIIllllllllIIlllll) {
        return lllllllllllllIIIIllllllllIIlllll != 0;
    }
}
