// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import org.newdawn.slick.svg.ParsingException;
import org.newdawn.slick.svg.NonGeometricData;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.svg.Figure;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.svg.Diagram;
import org.newdawn.slick.svg.Loader;
import org.w3c.dom.Element;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EllipseProcessor implements ElementProcessor
{
    private static final /* synthetic */ String[] llIlIIlllIlllI;
    private static final /* synthetic */ int[] llIlIIlllIllll;
    
    static {
        lIIlIIllIlIIIlll();
        lIIlIIllIlIIIllI();
    }
    
    private static String lIIlIIllIlIIIlIl(final String llllllllllllIllIlIllIlllIlIlIIll, final String llllllllllllIllIlIllIlllIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIllIlllIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIlllIlIlIIII.getBytes(StandardCharsets.UTF_8)), EllipseProcessor.llIlIIlllIllll[8]), "DES");
            final Cipher llllllllllllIllIlIllIlllIlIlIlIl = Cipher.getInstance("DES");
            llllllllllllIllIlIllIlllIlIlIlIl.init(EllipseProcessor.llIlIIlllIllll[2], llllllllllllIllIlIllIlllIlIlIllI);
            return new String(llllllllllllIllIlIllIlllIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIlllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllIlllIlIlIlII) {
            llllllllllllIllIlIllIlllIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIllIlIIIIll(String llllllllllllIllIlIllIlllIlllIIII, final String llllllllllllIllIlIllIlllIlllIlII) {
        llllllllllllIllIlIllIlllIlllIIII = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIllIlllIlllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIllIlllIlllIIll = new StringBuilder();
        final char[] llllllllllllIllIlIllIlllIlllIIlI = llllllllllllIllIlIllIlllIlllIlII.toCharArray();
        int llllllllllllIllIlIllIlllIlllIIIl = EllipseProcessor.llIlIIlllIllll[0];
        final long llllllllllllIllIlIllIlllIllIlIll = (Object)((String)llllllllllllIllIlIllIlllIlllIIII).toCharArray();
        final byte llllllllllllIllIlIllIlllIllIlIlI = (byte)llllllllllllIllIlIllIlllIllIlIll.length;
        float llllllllllllIllIlIllIlllIllIlIIl = EllipseProcessor.llIlIIlllIllll[0];
        while (lIIlIIllIlIIlIIl((int)llllllllllllIllIlIllIlllIllIlIIl, llllllllllllIllIlIllIlllIllIlIlI)) {
            final char llllllllllllIllIlIllIlllIlllIllI = llllllllllllIllIlIllIlllIllIlIll[llllllllllllIllIlIllIlllIllIlIIl];
            llllllllllllIllIlIllIlllIlllIIll.append((char)(llllllllllllIllIlIllIlllIlllIllI ^ llllllllllllIllIlIllIlllIlllIIlI[llllllllllllIllIlIllIlllIlllIIIl % llllllllllllIllIlIllIlllIlllIIlI.length]));
            "".length();
            ++llllllllllllIllIlIllIlllIlllIIIl;
            ++llllllllllllIllIlIllIlllIllIlIIl;
            "".length();
            if ((0x69 ^ 0x6D) < ((0x9D ^ 0x9B) & ~(0x49 ^ 0x4F))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIllIlllIlllIIll);
    }
    
    private static String lIIlIIllIlIIIlII(final String llllllllllllIllIlIllIlllIlIllllI, final String llllllllllllIllIlIllIlllIlIlllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIllIlllIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIlllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIllIlllIllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIllIlllIllIIIlI.init(EllipseProcessor.llIlIIlllIllll[2], llllllllllllIllIlIllIlllIllIIIll);
            return new String(llllllllllllIllIlIllIlllIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIlllIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllIlllIllIIIIl) {
            llllllllllllIllIlIllIlllIllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIllIlIIIlll() {
        (llIlIIlllIllll = new int[18])[0] = ((147 + 32 - 117 + 114 ^ 75 + 15 + 33 + 5) & (0xA ^ 0x40 ^ (0x1B ^ 0x61) ^ -" ".length()));
        EllipseProcessor.llIlIIlllIllll[1] = " ".length();
        EllipseProcessor.llIlIIlllIllll[2] = "  ".length();
        EllipseProcessor.llIlIIlllIllll[3] = "   ".length();
        EllipseProcessor.llIlIIlllIllll[4] = (109 + 105 - 91 + 13 ^ 79 + 77 - 56 + 40);
        EllipseProcessor.llIlIIlllIllll[5] = (0x5B ^ 0x5E);
        EllipseProcessor.llIlIIlllIllll[6] = (0x13 ^ 0x3F ^ (0x97 ^ 0xBD));
        EllipseProcessor.llIlIIlllIllll[7] = (0x66 ^ 0x61);
        EllipseProcessor.llIlIIlllIllll[8] = (0xD8 ^ 0xA2 ^ (0x17 ^ 0x65));
        EllipseProcessor.llIlIIlllIllll[9] = (64 + 164 - 145 + 89 ^ 106 + 23 - 25 + 61);
        EllipseProcessor.llIlIIlllIllll[10] = (76 + 56 - 78 + 110 ^ 79 + 68 - 105 + 132);
        EllipseProcessor.llIlIIlllIllll[11] = (0x85 ^ 0x8E);
        EllipseProcessor.llIlIIlllIllll[12] = (20 + 151 - 39 + 22 ^ 74 + 105 - 72 + 43);
        EllipseProcessor.llIlIIlllIllll[13] = (0x86 ^ 0x8B);
        EllipseProcessor.llIlIIlllIllll[14] = (0x18 ^ 0x16);
        EllipseProcessor.llIlIIlllIllll[15] = (0x2D ^ 0x4B ^ (0xDB ^ 0xB2));
        EllipseProcessor.llIlIIlllIllll[16] = (0x2E ^ 0x3E);
        EllipseProcessor.llIlIIlllIllll[17] = (0xBE ^ 0xAF);
    }
    
    public boolean handles(final Element llllllllllllIllIlIllIllllIIIIIII) {
        if (lIIlIIllIlIIlIII(llllllllllllIllIlIllIllllIIIIIII.getNodeName().equals(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[12]]) ? 1 : 0)) {
            return EllipseProcessor.llIlIIlllIllll[1] != 0;
        }
        if (lIIlIIllIlIIlIII(llllllllllllIllIlIllIllllIIIIIII.getNodeName().equals(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[13]]) ? 1 : 0) && lIIlIIllIlIIlIII(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[14]].equals(llllllllllllIllIlIllIllllIIIIIII.getAttributeNS(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[15]], EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[16]])) ? 1 : 0)) {
            return EllipseProcessor.llIlIIlllIllll[1] != 0;
        }
        return EllipseProcessor.llIlIIlllIllll[0] != 0;
    }
    
    private static boolean lIIlIIllIlIIlIIl(final int llllllllllllIllIlIllIlllIlIIlIll, final int llllllllllllIllIlIllIlllIlIIlIlI) {
        return llllllllllllIllIlIllIlllIlIIlIll < llllllllllllIllIlIllIlllIlIIlIlI;
    }
    
    public void process(final Loader llllllllllllIllIlIllIllllIIllIlI, final Element llllllllllllIllIlIllIllllIIIlllI, final Diagram llllllllllllIllIlIllIllllIIIllIl, final Transform llllllllllllIllIlIllIllllIIIllII) throws ParsingException {
        Transform llllllllllllIllIlIllIllllIIlIllI = Util.getTransform(llllllllllllIllIlIllIllllIIIlllI);
        llllllllllllIllIlIllIllllIIlIllI = new Transform(llllllllllllIllIlIllIllllIIIllII, llllllllllllIllIlIllIllllIIlIllI);
        final float llllllllllllIllIlIllIllllIIlIlIl = Util.getFloatAttribute(llllllllllllIllIlIllIllllIIIlllI, EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[0]]);
        final float llllllllllllIllIlIllIllllIIlIlII = Util.getFloatAttribute(llllllllllllIllIlIllIllllIIIlllI, EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[1]]);
        final float llllllllllllIllIlIllIllllIIlIIll = Util.getFloatAttribute(llllllllllllIllIlIllIllllIIIlllI, EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[2]]);
        final float llllllllllllIllIlIllIllllIIlIIlI = Util.getFloatAttribute(llllllllllllIllIlIllIllllIIIlllI, EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[3]]);
        final Ellipse llllllllllllIllIlIllIllllIIlIIIl = new Ellipse(llllllllllllIllIlIllIllllIIlIlIl, llllllllllllIllIlIllIllllIIlIlII, llllllllllllIllIlIllIllllIIlIIll, llllllllllllIllIlIllIllllIIlIIlI);
        final Shape llllllllllllIllIlIllIllllIIlIIII = llllllllllllIllIlIllIllllIIlIIIl.transform(llllllllllllIllIlIllIllllIIlIllI);
        final NonGeometricData llllllllllllIllIlIllIllllIIIllll = Util.getNonGeometricData(llllllllllllIllIlIllIllllIIIlllI);
        llllllllllllIllIlIllIllllIIIllll.addAttribute(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[4]], String.valueOf(new StringBuilder().append(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[5]]).append(llllllllllllIllIlIllIllllIIlIlIl)));
        llllllllllllIllIlIllIllllIIIllll.addAttribute(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[6]], String.valueOf(new StringBuilder().append(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[7]]).append(llllllllllllIllIlIllIllllIIlIlII)));
        llllllllllllIllIlIllIllllIIIllll.addAttribute(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[8]], String.valueOf(new StringBuilder().append(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[9]]).append(llllllllllllIllIlIllIllllIIlIIll)));
        llllllllllllIllIlIllIllllIIIllll.addAttribute(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[10]], String.valueOf(new StringBuilder().append(EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[11]]).append(llllllllllllIllIlIllIllllIIlIIlI)));
        llllllllllllIllIlIllIllllIIIllIl.addFigure(new Figure(EllipseProcessor.llIlIIlllIllll[1], llllllllllllIllIlIllIllllIIlIIII, llllllllllllIllIlIllIllllIIIllll, llllllllllllIllIlIllIllllIIlIllI));
    }
    
    private static void lIIlIIllIlIIIllI() {
        (llIlIIlllIlllI = new String[EllipseProcessor.llIlIIlllIllll[17]])[EllipseProcessor.llIlIIlllIllll[0]] = lIIlIIllIlIIIIll("JSE=", "FYLEf");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[1]] = lIIlIIllIlIIIlII("Oe7aRBNTk8o=", "DGRkO");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[2]] = lIIlIIllIlIIIlII("2Pa+Ilkf18M=", "jTWjx");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[3]] = lIIlIIllIlIIIIll("ODc=", "JNlGg");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[4]] = lIIlIIllIlIIIIll("Ng4=", "UvQOM");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[5]] = lIIlIIllIlIIIlIl("YMPAI5IJicc=", "XQvIT");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[6]] = lIIlIIllIlIIIIll("ARs=", "bbCOI");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[7]] = lIIlIIllIlIIIIll("", "sAEvr");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[8]] = lIIlIIllIlIIIlII("cdGNb6JmuoM=", "UkslK");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[9]] = lIIlIIllIlIIIlIl("ZOV35nRxuxk=", "XQkUa");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[10]] = lIIlIIllIlIIIIll("Iwk=", "QphwD");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[11]] = lIIlIIllIlIIIlII("SdHv7lY5jVc=", "hvkKN");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[12]] = lIIlIIllIlIIIlIl("84Yic3lLkJE=", "mCRKB");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[13]] = lIIlIIllIlIIIIll("IS86Hg==", "QNNvr");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[14]] = lIIlIIllIlIIIlII("EIJcCfm9ba4=", "EvkIh");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[15]] = lIIlIIllIlIIIlII("0GHCNUrh+sBqQdt1/AEy2tvc2Fryzh2qE8Hy4zg8HZl3VGESWS0sRbFVigOAa1hNtZ0Z+DXVlT8=", "FrKUo");
        EllipseProcessor.llIlIIlllIlllI[EllipseProcessor.llIlIIlllIllll[16]] = lIIlIIllIlIIIIll("HxQTCA==", "kmcmn");
    }
    
    private static boolean lIIlIIllIlIIlIII(final int llllllllllllIllIlIllIlllIlIIlIII) {
        return llllllllllllIllIlIllIlllIlIIlIII != 0;
    }
}
