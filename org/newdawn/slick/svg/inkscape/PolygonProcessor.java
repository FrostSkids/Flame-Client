// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import java.util.Arrays;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.svg.NonGeometricData;
import org.newdawn.slick.svg.Figure;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.svg.Diagram;
import org.newdawn.slick.svg.Loader;
import org.newdawn.slick.svg.ParsingException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.w3c.dom.Element;
import org.newdawn.slick.geom.Polygon;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class PolygonProcessor implements ElementProcessor
{
    private static final /* synthetic */ String[] lIllIIlIlllIII;
    private static final /* synthetic */ int[] lIllIIllIllIlI;
    
    private static String lllllIlIIlIIlII(final String lllllllllllllIIIIIIlIlIIIllIIIlI, final String lllllllllllllIIIIIIlIlIIIllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlIlIIIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIlIlIIIllIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIlIlIIIllIIllI.init(PolygonProcessor.lIllIIllIllIlI[2], lllllllllllllIIIIIIlIlIIIllIIlll);
            return new String(lllllllllllllIIIIIIlIlIIIllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlIlIIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlIlIIIllIIlIl) {
            lllllllllllllIIIIIIlIlIIIllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static int processPoly(final Polygon lllllllllllllIIIIIIlIlIIlIlIIIlI, final Element lllllllllllllIIIIIIlIlIIlIIllIlI, final StringTokenizer lllllllllllllIIIIIIlIlIIlIlIIIII) throws ParsingException {
        int lllllllllllllIIIIIIlIlIIlIIlllll = PolygonProcessor.lIllIIllIllIlI[0];
        final ArrayList lllllllllllllIIIIIIlIlIIlIIllllI = new ArrayList();
        boolean lllllllllllllIIIIIIlIlIIlIIlllIl = PolygonProcessor.lIllIIllIllIlI[0] != 0;
        boolean lllllllllllllIIIIIIlIlIIlIIlllII = PolygonProcessor.lIllIIllIllIlI[0] != 0;
        while (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIlIlIIIII.hasMoreTokens() ? 1 : 0)) {
            final String lllllllllllllIIIIIIlIlIIlIlIIlIl = lllllllllllllIIIIIIlIlIIlIlIIIII.nextToken();
            if (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIlIlIIlIl.equals(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[0]]) ? 1 : 0)) {
                "".length();
                if ((0xAB ^ 0xAE) <= 0) {
                    return (0xEE ^ 0xA6) & ~(0x63 ^ 0x2B);
                }
                continue;
            }
            else if (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIlIlIIlIl.equals(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[1]]) ? 1 : 0)) {
                lllllllllllllIIIIIIlIlIIlIIlllII = (PolygonProcessor.lIllIIllIllIlI[1] != 0);
                "".length();
                if (null != null) {
                    return (0xBE ^ 0xAE ^ (0x53 ^ 0x5D)) & (0x7 ^ 0x46 ^ (0xE1 ^ 0xBE) ^ -" ".length());
                }
                break;
            }
            else if (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIlIlIIlIl.equals(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[2]]) ? 1 : 0)) {
                if (!lllllIlIllIllll(lllllllllllllIIIIIIlIlIIlIIlllIl ? 1 : 0)) {
                    return PolygonProcessor.lIllIIllIllIlI[0];
                }
                lllllllllllllIIIIIIlIlIIlIIlllIl = (PolygonProcessor.lIllIIllIllIlI[1] != 0);
                "".length();
                if (((0xBD ^ 0xB5 ^ (0x8B ^ 0x86)) & (0xF6 ^ 0xC6 ^ (0xA6 ^ 0x93) ^ -" ".length())) >= (0x44 ^ 0x5A ^ (0x2C ^ 0x36))) {
                    return (16 + 99 - 101 + 169 ^ 3 + 30 + 112 + 18) & (0x96 ^ 0x93 ^ (0x4 ^ 0x15) ^ -" ".length());
                }
                continue;
            }
            else {
                if (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIlIlIIlIl.equals(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[3]]) ? 1 : 0)) {
                    return PolygonProcessor.lIllIIllIllIlI[0];
                }
                final String lllllllllllllIIIIIIlIlIIlIlIIlII = lllllllllllllIIIIIIlIlIIlIlIIlIl;
                final String lllllllllllllIIIIIIlIlIIlIlIIIll = lllllllllllllIIIIIIlIlIIlIlIIIII.nextToken();
                try {
                    final float lllllllllllllIIIIIIlIlIIlIlIlIII = Float.parseFloat(lllllllllllllIIIIIIlIlIIlIlIIlII);
                    final float lllllllllllllIIIIIIlIlIIlIlIIlll = Float.parseFloat(lllllllllllllIIIIIIlIlIIlIlIIIll);
                    lllllllllllllIIIIIIlIlIIlIlIIIlI.addPoint(lllllllllllllIIIIIIlIlIIlIlIlIII, lllllllllllllIIIIIIlIlIIlIlIIlll);
                    ++lllllllllllllIIIIIIlIlIIlIIlllll;
                    "".length();
                    if (null != null) {
                        return (0x64 ^ 0x63) & ~(0xBE ^ 0xB9);
                    }
                }
                catch (NumberFormatException lllllllllllllIIIIIIlIlIIlIlIIllI) {
                    throw new ParsingException(lllllllllllllIIIIIIlIlIIlIIllIlI.getAttribute(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[4]]), PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[5]], lllllllllllllIIIIIIlIlIIlIlIIllI);
                }
                "".length();
                if (-"   ".length() >= 0) {
                    return (0x1A ^ 0x11) & ~(0x3 ^ 0x8);
                }
                continue;
            }
        }
        lllllllllllllIIIIIIlIlIIlIlIIIlI.setClosed(lllllllllllllIIIIIIlIlIIlIIlllII);
        return lllllllllllllIIIIIIlIlIIlIIlllll;
    }
    
    private static boolean lllllIlIlllIIII(final int lllllllllllllIIIIIIlIlIIIIllIIll, final int lllllllllllllIIIIIIlIlIIIIllIIlI) {
        return lllllllllllllIIIIIIlIlIIIIllIIll > lllllllllllllIIIIIIlIlIIIIllIIlI;
    }
    
    private static boolean lllllIlIllIllll(final int lllllllllllllIIIIIIlIlIIIIlIlllI) {
        return lllllllllllllIIIIIIlIlIIIIlIlllI == 0;
    }
    
    private static void lllllIlIIlIlllI() {
        (lIllIIlIlllIII = new String[PolygonProcessor.lIllIIllIllIlI[15]])[PolygonProcessor.lIllIIllIllIlI[0]] = lllllIlIIlIIlII("k/CwPixPaBc=", "pLUfW");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[1]] = lllllIlIIlIIlII("b7sgVoMrZjk=", "lylhp");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[2]] = lllllIlIIlIIlIl("8FOdB2vSu5A=", "agnPc");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[3]] = lllllIlIIlIIlII("0huP+VTv8mw=", "zjShC");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[4]] = lllllIlIIlIIlIl("LUDsTLw739w=", "isgKR");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[5]] = lllllIlIIlIIlII("IP3rZCTqhlG8LS8J3Ujj0bIPZP4bC69gWO/NWz7VBgI=", "AbBkY");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[6]] = lllllIlIIlIIlIl("hwbiem388ZQ=", "BFrpi");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[7]] = lllllIlIIlIIlII("b2qlAUZekQ4=", "cxTDs");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[8]] = lllllIlIIlIIlIl("UyeeTDzXCik=", "aCMOz");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[9]] = lllllIlIIlIIlIl("+H9pJwwl0so=", "bcZQp");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[10]] = lllllIlIIlIIlII("FNaPLB7jIcA=", "NzujV");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[11]] = lllllIlIIlIlIlI("NA0HKw==", "DlsCE");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[12]] = lllllIlIIlIIlIl("K3oyjL6Tjgg=", "BbHeU");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[13]] = lllllIlIIlIlIlI("BA42JVZDVTE6CAUKLTEFQgktIB4PHyQ6HgsfbDsJGFUGAShDCS0xBRwVJjxBXFQmIQg=", "lzBUl");
        PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[14]] = lllllIlIIlIIlII("B6wTdbNT4kE=", "etgZp");
    }
    
    private static String lllllIlIIlIlIlI(String lllllllllllllIIIIIIlIlIIIlIIllll, final String lllllllllllllIIIIIIlIlIIIlIlIIll) {
        lllllllllllllIIIIIIlIlIIIlIIllll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIlIlIIIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIlIlIIIlIlIIlI = new StringBuilder();
        final char[] lllllllllllllIIIIIIlIlIIIlIlIIIl = lllllllllllllIIIIIIlIlIIIlIlIIll.toCharArray();
        int lllllllllllllIIIIIIlIlIIIlIlIIII = PolygonProcessor.lIllIIllIllIlI[0];
        final double lllllllllllllIIIIIIlIlIIIlIIlIlI = (Object)lllllllllllllIIIIIIlIlIIIlIIllll.toCharArray();
        final float lllllllllllllIIIIIIlIlIIIlIIlIIl = lllllllllllllIIIIIIlIlIIIlIIlIlI.length;
        byte lllllllllllllIIIIIIlIlIIIlIIlIII = (byte)PolygonProcessor.lIllIIllIllIlI[0];
        while (lllllIlIlllIIIl(lllllllllllllIIIIIIlIlIIIlIIlIII, (int)lllllllllllllIIIIIIlIlIIIlIIlIIl)) {
            final char lllllllllllllIIIIIIlIlIIIlIlIlIl = lllllllllllllIIIIIIlIlIIIlIIlIlI[lllllllllllllIIIIIIlIlIIIlIIlIII];
            lllllllllllllIIIIIIlIlIIIlIlIIlI.append((char)(lllllllllllllIIIIIIlIlIIIlIlIlIl ^ lllllllllllllIIIIIIlIlIIIlIlIIIl[lllllllllllllIIIIIIlIlIIIlIlIIII % lllllllllllllIIIIIIlIlIIIlIlIIIl.length]));
            "".length();
            ++lllllllllllllIIIIIIlIlIIIlIlIIII;
            ++lllllllllllllIIIIIIlIlIIIlIIlIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIlIlIIIlIlIIlI);
    }
    
    static {
        lllllIlIllIllIl();
        lllllIlIIlIlllI();
    }
    
    public void process(final Loader lllllllllllllIIIIIIlIlIIlIIIIIll, final Element lllllllllllllIIIIIIlIlIIIllllIIl, final Diagram lllllllllllllIIIIIIlIlIIlIIIIIIl, final Transform lllllllllllllIIIIIIlIlIIlIIIIIII) throws ParsingException {
        Transform lllllllllllllIIIIIIlIlIIIlllllll = Util.getTransform(lllllllllllllIIIIIIlIlIIIllllIIl);
        lllllllllllllIIIIIIlIlIIIlllllll = new Transform(lllllllllllllIIIIIIlIlIIlIIIIIII, lllllllllllllIIIIIIlIlIIIlllllll);
        String lllllllllllllIIIIIIlIlIIIllllllI = lllllllllllllIIIIIIlIlIIIllllIIl.getAttribute(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[6]]);
        if (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIIllllIIl.getNodeName().equals(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[7]]) ? 1 : 0)) {
            lllllllllllllIIIIIIlIlIIIllllllI = lllllllllllllIIIIIIlIlIIIllllIIl.getAttribute(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[8]]);
        }
        final StringTokenizer lllllllllllllIIIIIIlIlIIIlllllIl = new StringTokenizer(lllllllllllllIIIIIIlIlIIIllllllI, PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[9]]);
        final Polygon lllllllllllllIIIIIIlIlIIIlllllII = new Polygon();
        final int lllllllllllllIIIIIIlIlIIIllllIll = processPoly(lllllllllllllIIIIIIlIlIIIlllllII, lllllllllllllIIIIIIlIlIIIllllIIl, lllllllllllllIIIIIIlIlIIIlllllIl);
        final NonGeometricData lllllllllllllIIIIIIlIlIIIllllIlI = Util.getNonGeometricData(lllllllllllllIIIIIIlIlIIIllllIIl);
        if (lllllIlIlllIIII(lllllllllllllIIIIIIlIlIIIllllIll, PolygonProcessor.lIllIIllIllIlI[3])) {
            final Shape lllllllllllllIIIIIIlIlIIlIIIIlIl = lllllllllllllIIIIIIlIlIIIlllllII.transform(lllllllllllllIIIIIIlIlIIIlllllll);
            lllllllllllllIIIIIIlIlIIlIIIIIIl.addFigure(new Figure(PolygonProcessor.lIllIIllIllIlI[5], lllllllllllllIIIIIIlIlIIlIIIIlIl, lllllllllllllIIIIIIlIlIIIllllIlI, lllllllllllllIIIIIIlIlIIIlllllll));
        }
    }
    
    private static String lllllIlIIlIIlIl(final String lllllllllllllIIIIIIlIlIIIIllllIl, final String lllllllllllllIIIIIIlIlIIIIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlIlIIIlIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlIlIIIIllllII.getBytes(StandardCharsets.UTF_8)), PolygonProcessor.lIllIIllIllIlI[8]), "DES");
            final Cipher lllllllllllllIIIIIIlIlIIIlIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIIlIlIIIlIIIIIl.init(PolygonProcessor.lIllIIllIllIlI[2], lllllllllllllIIIIIIlIlIIIlIIIIlI);
            return new String(lllllllllllllIIIIIIlIlIIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlIlIIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlIlIIIlIIIIII) {
            lllllllllllllIIIIIIlIlIIIlIIIIII.printStackTrace();
            return null;
        }
    }
    
    public boolean handles(final Element lllllllllllllIIIIIIlIlIIIllIllII) {
        if (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIIllIllII.getNodeName().equals(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[10]]) ? 1 : 0)) {
            return PolygonProcessor.lIllIIllIllIlI[1] != 0;
        }
        if (lllllIlIllIlllI(lllllllllllllIIIIIIlIlIIIllIllII.getNodeName().equals(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[11]]) ? 1 : 0) && lllllIlIllIllll(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[12]].equals(lllllllllllllIIIIIIlIlIIIllIllII.getAttributeNS(PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[13]], PolygonProcessor.lIllIIlIlllIII[PolygonProcessor.lIllIIllIllIlI[14]])) ? 1 : 0)) {
            return PolygonProcessor.lIllIIllIllIlI[1] != 0;
        }
        return PolygonProcessor.lIllIIllIllIlI[0] != 0;
    }
    
    private static boolean lllllIlIllIlllI(final int lllllllllllllIIIIIIlIlIIIIllIIII) {
        return lllllllllllllIIIIIIlIlIIIIllIIII != 0;
    }
    
    private static boolean lllllIlIlllIIIl(final int lllllllllllllIIIIIIlIlIIIIllIlll, final int lllllllllllllIIIIIIlIlIIIIllIllI) {
        return lllllllllllllIIIIIIlIlIIIIllIlll < lllllllllllllIIIIIIlIlIIIIllIllI;
    }
    
    private static void lllllIlIllIllIl() {
        (lIllIIllIllIlI = new int[16])[0] = ((0x9A ^ 0x80) & ~(0x9E ^ 0x84));
        PolygonProcessor.lIllIIllIllIlI[1] = " ".length();
        PolygonProcessor.lIllIIllIllIlI[2] = "  ".length();
        PolygonProcessor.lIllIIllIllIlI[3] = "   ".length();
        PolygonProcessor.lIllIIllIllIlI[4] = (0xBD ^ 0xB9);
        PolygonProcessor.lIllIIllIllIlI[5] = (0xA9 ^ 0xAC);
        PolygonProcessor.lIllIIllIllIlI[6] = (0xAB ^ 0xAD);
        PolygonProcessor.lIllIIllIllIlI[7] = (0xC7 ^ 0xC0);
        PolygonProcessor.lIllIIllIllIlI[8] = (0x79 ^ 0x71);
        PolygonProcessor.lIllIIllIllIlI[9] = (0x7A ^ 0x14 ^ (0x3 ^ 0x64));
        PolygonProcessor.lIllIIllIllIlI[10] = (0x47 ^ 0x4D);
        PolygonProcessor.lIllIIllIllIlI[11] = (0x2E ^ 0xE ^ (0x46 ^ 0x6D));
        PolygonProcessor.lIllIIllIllIlI[12] = (0x9E ^ 0x92);
        PolygonProcessor.lIllIIllIllIlI[13] = (81 + 73 - 7 + 32 ^ 79 + 133 - 47 + 25);
        PolygonProcessor.lIllIIllIllIlI[14] = (0xFB ^ 0xC0 ^ (0x72 ^ 0x47));
        PolygonProcessor.lIllIIllIllIlI[15] = (0x55 ^ 0x6A ^ (0xAD ^ 0x9D));
    }
}
