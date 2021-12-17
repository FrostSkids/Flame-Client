// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import java.util.Arrays;
import java.util.ArrayList;
import org.newdawn.slick.svg.ParsingException;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.svg.NonGeometricData;
import org.newdawn.slick.geom.Path;
import org.newdawn.slick.svg.Figure;
import java.util.StringTokenizer;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.svg.Diagram;
import org.newdawn.slick.svg.Loader;
import org.w3c.dom.Element;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class PathProcessor implements ElementProcessor
{
    private static final /* synthetic */ String[] lIIIIllIlllIll;
    private static final /* synthetic */ int[] lIIIIllIllllIl;
    
    private static void lIllllIIIIlIIlI() {
        (lIIIIllIlllIll = new String[PathProcessor.lIIIIllIllllIl[14]])[PathProcessor.lIIIIllIllllIl[0]] = lIllllIIIIIllIl("NIUdZI/B7O4=", "yiRJK");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[1]] = lIllllIIIIIllIl("V0EcuIrSpao=", "WwMXk");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[2]] = lIllllIIIIIlllI("Bg==", "KBfli");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[3]] = lIllllIIIIIllIl("muJrlpkqRdQ=", "GqRUZ");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[4]] = lIllllIIIIIlllI("MwA=", "ZdvUP");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[5]] = lIllllIIIIIllIl("HicCYeQJqF/frFWZ15u1MrPk87bJnv4eigzQHNt/8a0=", "DkQHL");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[6]] = lIllllIIIIIlllI("GAkRIzob", "hfxMN");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[7]] = lIllllIIIIIlllI("HSY8DQ==", "mGHeN");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[8]] = lIllllIIIIIlllI("Cg==", "nBJPl");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[9]] = lIllllIIIIIlllI("Zkc=", "JgJdI");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[10]] = lIllllIIIIIllIl("87f+nt7uTGU=", "UKrlW");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[11]] = lIllllIIIIIlllI("NgAU", "WrwAQ");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[12]] = lIllllIIIIlIIII("QsvFRB8zVvYLaPqaAPzJH667HBzOdm8Sqct+ZB5+NoJX5yLB5U6ovj+EXL1e/Gt2BwrJY83lf74=", "SMrPQ");
        PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[13]] = lIllllIIIIIlllI("PA8xDw==", "HvAjf");
    }
    
    private static boolean lIllllIIIIllIII(final Object lllllllllllllIlIIlIIIlIllllllIll) {
        return lllllllllllllIlIIlIIIlIllllllIll != null;
    }
    
    private static boolean lIllllIIIIlIlll(final int lllllllllllllIlIIlIIIlIlllllIlll) {
        return lllllllllllllIlIIlIIIlIlllllIlll == 0;
    }
    
    private static String lIllllIIIIlIIII(final String lllllllllllllIlIIlIIIllIIIlIlIIl, final String lllllllllllllIlIIlIIIllIIIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIllIIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIIllIIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIIllIIIlIllIl.init(PathProcessor.lIIIIllIllllIl[2], lllllllllllllIlIIlIIIllIIIlIlllI);
            return new String(lllllllllllllIlIIlIIIllIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIllIIIlIllII) {
            lllllllllllllIlIIlIIIllIIIlIllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllllIIIIlIlIl();
        lIllllIIIIlIIlI();
    }
    
    public boolean handles(final Element lllllllllllllIlIIlIIIllIIIllIIll) {
        if (lIllllIIIIlIllI(lllllllllllllIlIIlIIIllIIIllIIll.getNodeName().equals(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[10]]) ? 1 : 0) && lIllllIIIIlIlll(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[11]].equals(lllllllllllllIlIIlIIIllIIIllIIll.getAttributeNS(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[12]], PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[13]])) ? 1 : 0)) {
            return PathProcessor.lIIIIllIllllIl[1] != 0;
        }
        return PathProcessor.lIIIIllIllllIl[0] != 0;
    }
    
    public void process(final Loader lllllllllllllIlIIlIIIllIIlIIlIII, final Element lllllllllllllIlIIlIIIllIIlIIIlll, final Diagram lllllllllllllIlIIlIIIllIIIlllllI, final Transform lllllllllllllIlIIlIIIllIIIllllIl) throws ParsingException {
        Transform lllllllllllllIlIIlIIIllIIlIIIlII = Util.getTransform(lllllllllllllIlIIlIIIllIIlIIIlll);
        lllllllllllllIlIIlIIIllIIlIIIlII = new Transform(lllllllllllllIlIIlIIIllIIIllllIl, lllllllllllllIlIIlIIIllIIlIIIlII);
        String lllllllllllllIlIIlIIIllIIlIIIIll = lllllllllllllIlIIlIIIllIIlIIIlll.getAttribute(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[6]]);
        if (lIllllIIIIlIllI(lllllllllllllIlIIlIIIllIIlIIIlll.getNodeName().equals(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[7]]) ? 1 : 0)) {
            lllllllllllllIlIIlIIIllIIlIIIIll = lllllllllllllIlIIlIIIllIIlIIIlll.getAttribute(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[8]]);
        }
        final StringTokenizer lllllllllllllIlIIlIIIllIIlIIIIlI = new StringTokenizer(lllllllllllllIlIIlIIIllIIlIIIIll, PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[9]]);
        final Path lllllllllllllIlIIlIIIllIIlIIIIIl = processPoly(lllllllllllllIlIIlIIIllIIlIIIlll, lllllllllllllIlIIlIIIllIIlIIIIlI);
        final NonGeometricData lllllllllllllIlIIlIIIllIIlIIIIII = Util.getNonGeometricData(lllllllllllllIlIIlIIIllIIlIIIlll);
        if (lIllllIIIIllIII(lllllllllllllIlIIlIIIllIIlIIIIIl)) {
            final Shape lllllllllllllIlIIlIIIllIIlIIlIlI = lllllllllllllIlIIlIIIllIIlIIIIIl.transform(lllllllllllllIlIIlIIIllIIlIIIlII);
            lllllllllllllIlIIlIIIllIIIlllllI.addFigure(new Figure(PathProcessor.lIIIIllIllllIl[4], lllllllllllllIlIIlIIIllIIlIIlIlI, lllllllllllllIlIIlIIIllIIlIIIIII, lllllllllllllIlIIlIIIllIIlIIIlII));
        }
    }
    
    private static boolean lIllllIIIIllIIl(final int lllllllllllllIlIIlIIIlIllllllllI, final int lllllllllllllIlIIlIIIlIlllllllIl) {
        return lllllllllllllIlIIlIIIlIllllllllI < lllllllllllllIlIIlIIIlIlllllllIl;
    }
    
    private static String lIllllIIIIIlllI(String lllllllllllllIlIIlIIIllIIIIIlIIl, final String lllllllllllllIlIIlIIIllIIIIIllIl) {
        lllllllllllllIlIIlIIIllIIIIIlIIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIIIllIIIIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIllIIIIIllII = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIllIIIIIlIll = lllllllllllllIlIIlIIIllIIIIIllIl.toCharArray();
        int lllllllllllllIlIIlIIIllIIIIIlIlI = PathProcessor.lIIIIllIllllIl[0];
        final String lllllllllllllIlIIlIIIllIIIIIIlII = (Object)((String)lllllllllllllIlIIlIIIllIIIIIlIIl).toCharArray();
        final int lllllllllllllIlIIlIIIllIIIIIIIll = lllllllllllllIlIIlIIIllIIIIIIlII.length;
        boolean lllllllllllllIlIIlIIIllIIIIIIIlI = PathProcessor.lIIIIllIllllIl[0] != 0;
        while (lIllllIIIIllIIl(lllllllllllllIlIIlIIIllIIIIIIIlI ? 1 : 0, lllllllllllllIlIIlIIIllIIIIIIIll)) {
            final char lllllllllllllIlIIlIIIllIIIIIllll = lllllllllllllIlIIlIIIllIIIIIIlII[lllllllllllllIlIIlIIIllIIIIIIIlI];
            lllllllllllllIlIIlIIIllIIIIIllII.append((char)(lllllllllllllIlIIlIIIllIIIIIllll ^ lllllllllllllIlIIlIIIllIIIIIlIll[lllllllllllllIlIIlIIIllIIIIIlIlI % lllllllllllllIlIIlIIIllIIIIIlIll.length]));
            "".length();
            ++lllllllllllllIlIIlIIIllIIIIIlIlI;
            ++lllllllllllllIlIIlIIIllIIIIIIIlI;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIllIIIIIllII);
    }
    
    private static void lIllllIIIIlIlIl() {
        (lIIIIllIllllIl = new int[15])[0] = ((0x6E ^ 0x36) & ~(0xFC ^ 0xA4));
        PathProcessor.lIIIIllIllllIl[1] = " ".length();
        PathProcessor.lIIIIllIllllIl[2] = "  ".length();
        PathProcessor.lIIIIllIllllIl[3] = "   ".length();
        PathProcessor.lIIIIllIllllIl[4] = (160 + 80 - 77 + 29 ^ 13 + 115 - 85 + 153);
        PathProcessor.lIIIIllIllllIl[5] = (0xB9 ^ 0x9D ^ (0x7E ^ 0x5F));
        PathProcessor.lIIIIllIllllIl[6] = (0x5E ^ 0x30 ^ (0xB ^ 0x63));
        PathProcessor.lIIIIllIllllIl[7] = (0xE9 ^ 0xA4 ^ (0x5F ^ 0x15));
        PathProcessor.lIIIIllIllllIl[8] = (0x86 ^ 0x8E);
        PathProcessor.lIIIIllIllllIl[9] = (0x7 ^ 0xE);
        PathProcessor.lIIIIllIllllIl[10] = (0xAC ^ 0xAB ^ (0x1A ^ 0x17));
        PathProcessor.lIIIIllIllllIl[11] = (0x45 ^ 0x4E);
        PathProcessor.lIIIIllIllllIl[12] = (0xB0 ^ 0xBC);
        PathProcessor.lIIIIllIllllIl[13] = (0x44 ^ 0x69 ^ (0x8C ^ 0xAC));
        PathProcessor.lIIIIllIllllIl[14] = (0x2E ^ 0x33 ^ (0x54 ^ 0x47));
    }
    
    private static boolean lIllllIIIIlIllI(final int lllllllllllllIlIIlIIIlIllllllIIl) {
        return lllllllllllllIlIIlIIIlIllllllIIl != 0;
    }
    
    private static Path processPoly(final Element lllllllllllllIlIIlIIIllIIllIlIII, final StringTokenizer lllllllllllllIlIIlIIIllIIllIIIII) throws ParsingException {
        final int lllllllllllllIlIIlIIIllIIllIIllI = PathProcessor.lIIIIllIllllIl[0];
        final ArrayList lllllllllllllIlIIlIIIllIIllIIlIl = new ArrayList();
        boolean lllllllllllllIlIIlIIIllIIllIIlII = PathProcessor.lIIIIllIllllIl[0] != 0;
        boolean lllllllllllllIlIIlIIIllIIllIIIll = PathProcessor.lIIIIllIllllIl[0] != 0;
        Path lllllllllllllIlIIlIIIllIIllIIIlI = null;
        while (lIllllIIIIlIllI(lllllllllllllIlIIlIIIllIIllIIIII.hasMoreTokens() ? 1 : 0)) {
            try {
                final String lllllllllllllIlIIlIIIllIIllIlIlI = lllllllllllllIlIIlIIIllIIllIIIII.nextToken();
                if (lIllllIIIIlIllI(lllllllllllllIlIIlIIIllIIllIlIlI.equals(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[0]]) ? 1 : 0)) {
                    final float lllllllllllllIlIIlIIIllIIlllIllI = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    final float lllllllllllllIlIIlIIIllIIlllIlIl = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    lllllllllllllIlIIlIIIllIIllIIIlI.lineTo(lllllllllllllIlIIlIIIllIIlllIllI, lllllllllllllIlIIlIIIllIIlllIlIl);
                    "".length();
                    if (-"  ".length() >= 0) {
                        return null;
                    }
                    continue;
                }
                else if (lIllllIIIIlIllI(lllllllllllllIlIIlIIIllIIllIlIlI.equals(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[1]]) ? 1 : 0)) {
                    lllllllllllllIlIIlIIIllIIllIIIlI.close();
                    "".length();
                    if (-" ".length() >= ((0xCB ^ 0xAB) & ~(0x39 ^ 0x59))) {
                        return null;
                    }
                    continue;
                }
                else if (lIllllIIIIlIllI(lllllllllllllIlIIlIIIllIIllIlIlI.equals(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[2]]) ? 1 : 0)) {
                    if (lIllllIIIIlIlll(lllllllllllllIlIIlIIIllIIllIIlII ? 1 : 0)) {
                        lllllllllllllIlIIlIIIllIIllIIlII = (PathProcessor.lIIIIllIllllIl[1] != 0);
                        final float lllllllllllllIlIIlIIIllIIlllIlII = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                        final float lllllllllllllIlIIlIIIllIIlllIIll = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                        lllllllllllllIlIIlIIIllIIllIIIlI = new Path(lllllllllllllIlIIlIIIllIIlllIlII, lllllllllllllIlIIlIIIllIIlllIIll);
                        "".length();
                        if ("  ".length() >= (46 + 114 - 92 + 92 ^ 30 + 108 - 94 + 120)) {
                            return null;
                        }
                        continue;
                    }
                    else {
                        lllllllllllllIlIIlIIIllIIllIIIll = (PathProcessor.lIIIIllIllllIl[1] != 0);
                        final float lllllllllllllIlIIlIIIllIIlllIIlI = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                        final float lllllllllllllIlIIlIIIllIIlllIIIl = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                        lllllllllllllIlIIlIIIllIIllIIIlI.startHole(lllllllllllllIlIIlIIIllIIlllIIlI, lllllllllllllIlIIlIIIllIIlllIIIl);
                        "".length();
                        if ((0xC3 ^ 0xC7) == 0x0) {
                            return null;
                        }
                        continue;
                    }
                }
                else if (lIllllIIIIlIllI(lllllllllllllIlIIlIIIllIIllIlIlI.equals(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[3]]) ? 1 : 0)) {
                    lllllllllllllIlIIlIIIllIIllIIIll = (PathProcessor.lIIIIllIllllIl[1] != 0);
                    final float lllllllllllllIlIIlIIIllIIlllIIII = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    final float lllllllllllllIlIIlIIIllIIllIllll = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    final float lllllllllllllIlIIlIIIllIIllIlllI = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    final float lllllllllllllIlIIlIIIllIIllIllIl = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    final float lllllllllllllIlIIlIIIllIIllIllII = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    final float lllllllllllllIlIIlIIIllIIllIlIll = Float.parseFloat(lllllllllllllIlIIlIIIllIIllIIIII.nextToken());
                    lllllllllllllIlIIlIIIllIIllIIIlI.curveTo(lllllllllllllIlIIlIIIllIIllIllII, lllllllllllllIlIIlIIIllIIllIlIll, lllllllllllllIlIIlIIIllIIlllIIII, lllllllllllllIlIIlIIIllIIllIllll, lllllllllllllIlIIlIIIllIIllIlllI, lllllllllllllIlIIlIIIllIIllIllIl);
                    "".length();
                    if ("   ".length() < 0) {
                        return null;
                    }
                    continue;
                }
                else {
                    "".length();
                    if ("  ".length() >= (0x47 ^ 0x43)) {
                        return null;
                    }
                    continue;
                }
            }
            catch (NumberFormatException lllllllllllllIlIIlIIIllIIllIlIIl) {
                throw new ParsingException(lllllllllllllIlIIlIIIllIIllIlIII.getAttribute(PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[4]]), PathProcessor.lIIIIllIlllIll[PathProcessor.lIIIIllIllllIl[5]], lllllllllllllIlIIlIIIllIIllIlIIl);
            }
            break;
        }
        if (lIllllIIIIlIlll(lllllllllllllIlIIlIIIllIIllIIIll ? 1 : 0)) {
            return null;
        }
        return lllllllllllllIlIIlIIIllIIllIIIlI;
    }
    
    private static String lIllllIIIIIllIl(final String lllllllllllllIlIIlIIIllIIIIllllI, final String lllllllllllllIlIIlIIIllIIIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIllIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), PathProcessor.lIIIIllIllllIl[8]), "DES");
            final Cipher lllllllllllllIlIIlIIIllIIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIIllIIIlIIIII.init(PathProcessor.lIIIIllIllllIl[2], lllllllllllllIlIIlIIIllIIIlIIIIl);
            return new String(lllllllllllllIlIIlIIIllIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIllIIIIlllll) {
            lllllllllllllIlIIlIIIllIIIIlllll.printStackTrace();
            return null;
        }
    }
}
