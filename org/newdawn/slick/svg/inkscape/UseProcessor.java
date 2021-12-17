// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.svg.NonGeometricData;
import org.newdawn.slick.svg.Figure;
import org.newdawn.slick.svg.ParsingException;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.svg.Diagram;
import org.newdawn.slick.svg.Loader;
import org.w3c.dom.Element;

public class UseProcessor implements ElementProcessor
{
    private static final /* synthetic */ int[] lIlIIIIIllIIII;
    private static final /* synthetic */ String[] lIlIIIIIlIllIl;
    
    public boolean handles(final Element lllllllllllllIIlIIIIlllIllllIIIl) {
        return lllllllllllllIIlIIIIlllIllllIIIl.getNodeName().equals(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[0]]);
    }
    
    private static boolean lllIIIIIllIIIll(final Object lllllllllllllIIlIIIIlllIlIIllIII) {
        return lllllllllllllIIlIIIIlllIlIIllIII == null;
    }
    
    public void process(final Loader lllllllllllllIIlIIIIlllIlllIIlIl, final Element lllllllllllllIIlIIIIlllIllIllIIl, final Diagram lllllllllllllIIlIIIIlllIllIllIII, final Transform lllllllllllllIIlIIIIlllIlllIIIlI) throws ParsingException {
        final String lllllllllllllIIlIIIIlllIlllIIIIl = lllllllllllllIIlIIIIlllIllIllIIl.getAttributeNS(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[1]], UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[2]]);
        final String lllllllllllllIIlIIIIlllIlllIIIII = Util.getAsReference(lllllllllllllIIlIIIIlllIlllIIIIl);
        final Figure lllllllllllllIIlIIIIlllIllIlllll = lllllllllllllIIlIIIIlllIllIllIII.getFigureByID(lllllllllllllIIlIIIIlllIlllIIIII);
        if (lllIIIIIllIIIll(lllllllllllllIIlIIIIlllIllIlllll)) {
            throw new ParsingException(lllllllllllllIIlIIIIlllIllIllIIl, String.valueOf(new StringBuilder().append(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[3]]).append(lllllllllllllIIlIIIIlllIlllIIIII)));
        }
        final Transform lllllllllllllIIlIIIIlllIllIllllI = Util.getTransform(lllllllllllllIIlIIIIlllIllIllIIl);
        final Transform lllllllllllllIIlIIIIlllIllIlllIl = lllllllllllllIIlIIIIlllIllIllllI.concatenate(lllllllllllllIIlIIIIlllIllIlllll.getTransform());
        final NonGeometricData lllllllllllllIIlIIIIlllIllIlllII = Util.getNonGeometricData(lllllllllllllIIlIIIIlllIllIllIIl);
        final Shape lllllllllllllIIlIIIIlllIllIllIll = lllllllllllllIIlIIIIlllIllIlllll.getShape().transform(lllllllllllllIIlIIIIlllIllIlllIl);
        lllllllllllllIIlIIIIlllIllIlllII.addAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[4]], lllllllllllllIIlIIIIlllIllIlllll.getData().getAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[5]]));
        lllllllllllllIIlIIIIlllIllIlllII.addAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[6]], lllllllllllllIIlIIIIlllIllIlllll.getData().getAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[7]]));
        lllllllllllllIIlIIIIlllIllIlllII.addAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[8]], lllllllllllllIIlIIIIlllIllIlllll.getData().getAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[9]]));
        lllllllllllllIIlIIIIlllIllIlllII.addAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[10]], lllllllllllllIIlIIIIlllIllIlllll.getData().getAttribute(UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[11]]));
        final Figure lllllllllllllIIlIIIIlllIllIllIlI = new Figure(lllllllllllllIIlIIIIlllIllIlllll.getType(), lllllllllllllIIlIIIIlllIllIllIll, lllllllllllllIIlIIIIlllIllIlllII, lllllllllllllIIlIIIIlllIllIlllIl);
        lllllllllllllIIlIIIIlllIllIllIII.addFigure(lllllllllllllIIlIIIIlllIllIllIlI);
    }
    
    static {
        lllIIIIIllIIIlI();
        lllIIIIIlIlllll();
    }
    
    private static String lllIIIIIlIlllII(final String lllllllllllllIIlIIIIlllIlIlIIIll, final String lllllllllllllIIlIIIIlllIlIlIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIlllIlIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIlllIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIlllIlIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIlllIlIlIIlIl.init(UseProcessor.lIlIIIIIllIIII[2], lllllllllllllIIlIIIIlllIlIlIIllI);
            return new String(lllllllllllllIIlIIIIlllIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlllIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIlllIlIlIIlII) {
            lllllllllllllIIlIIIIlllIlIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIIlIllIll(String lllllllllllllIIlIIIIlllIlIllIIll, final String lllllllllllllIIlIIIIlllIlIllIlll) {
        lllllllllllllIIlIIIIlllIlIllIIll = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIIlllIlIllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIlllIlIllIllI = new StringBuilder();
        final char[] lllllllllllllIIlIIIIlllIlIllIlIl = lllllllllllllIIlIIIIlllIlIllIlll.toCharArray();
        int lllllllllllllIIlIIIIlllIlIllIlII = UseProcessor.lIlIIIIIllIIII[0];
        final int lllllllllllllIIlIIIIlllIlIlIlllI = (Object)((String)lllllllllllllIIlIIIIlllIlIllIIll).toCharArray();
        final char lllllllllllllIIlIIIIlllIlIlIllIl = (char)lllllllllllllIIlIIIIlllIlIlIlllI.length;
        boolean lllllllllllllIIlIIIIlllIlIlIllII = UseProcessor.lIlIIIIIllIIII[0] != 0;
        while (lllIIIIIllIIlII(lllllllllllllIIlIIIIlllIlIlIllII ? 1 : 0, lllllllllllllIIlIIIIlllIlIlIllIl)) {
            final char lllllllllllllIIlIIIIlllIlIlllIIl = lllllllllllllIIlIIIIlllIlIlIlllI[lllllllllllllIIlIIIIlllIlIlIllII];
            lllllllllllllIIlIIIIlllIlIllIllI.append((char)(lllllllllllllIIlIIIIlllIlIlllIIl ^ lllllllllllllIIlIIIIlllIlIllIlIl[lllllllllllllIIlIIIIlllIlIllIlII % lllllllllllllIIlIIIIlllIlIllIlIl.length]));
            "".length();
            ++lllllllllllllIIlIIIIlllIlIllIlII;
            ++lllllllllllllIIlIIIIlllIlIlIllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIlllIlIllIllI);
    }
    
    private static String lllIIIIIlIllIII(final String lllllllllllllIIlIIIIlllIllIIlIII, final String lllllllllllllIIlIIIIlllIllIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIlllIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIlllIllIIIlIl.getBytes(StandardCharsets.UTF_8)), UseProcessor.lIlIIIIIllIIII[8]), "DES");
            final Cipher lllllllllllllIIlIIIIlllIllIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIlllIllIIlIlI.init(UseProcessor.lIlIIIIIllIIII[2], lllllllllllllIIlIIIIlllIllIIlIll);
            return new String(lllllllllllllIIlIIIIlllIllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlllIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIlllIllIIlIIl) {
            lllllllllllllIIlIIIIlllIllIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIIIIlIlllll() {
        (lIlIIIIIlIllIl = new String[UseProcessor.lIlIIIIIllIIII[12]])[UseProcessor.lIlIIIIIllIIII[0]] = lllIIIIIlIllIII("kV+cV8j7QXk=", "WkcBa");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[1]] = lllIIIIIlIllIII("mTAJqoSfS+L7oTQ6fAJk7Yd4G7QTbYZ7qXbBZkxPyjw=", "mqlvY");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[2]] = lllIIIIIlIllIll("KjMWIQ==", "BAsGk");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[3]] = lllIIIIIlIllIll("BCoRFiM0ZAQbbz0rExU7NGQCESk0NhUaLDQgUBEjNCkVGjtrZA==", "QDptO");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[4]] = lllIIIIIlIllIll("IyEeIw==", "EHrOn");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[5]] = lllIIIIIlIllIII("PwNiONN4lLU=", "NumlD");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[6]] = lllIIIIIlIlllII("H1prFBAE4e4=", "MiIaD");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[7]] = lllIIIIIlIllIll("PQAgJyMr", "NtRHH");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[8]] = lllIIIIIlIlllII("mb3riQgxfw0=", "cLgcp");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[9]] = lllIIIIIlIllIII("isQplDw1YH4=", "NQkEx");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[10]] = lllIIIIIlIllIII("YNQxScEyfzKqohEOz2B6Gw==", "NMpxR");
        UseProcessor.lIlIIIIIlIllIl[UseProcessor.lIlIIIIIllIIII[11]] = lllIIIIIlIllIII("oUzZO5R3lGphuexFL4UL0A==", "fLPcP");
    }
    
    private static void lllIIIIIllIIIlI() {
        (lIlIIIIIllIIII = new int[13])[0] = ((0x5E ^ 0x58 ^ (0x3 ^ 0x33)) & (4 + 69 + 56 + 32 ^ 98 + 143 - 209 + 119 ^ -" ".length()));
        UseProcessor.lIlIIIIIllIIII[1] = " ".length();
        UseProcessor.lIlIIIIIllIIII[2] = "  ".length();
        UseProcessor.lIlIIIIIllIIII[3] = "   ".length();
        UseProcessor.lIlIIIIIllIIII[4] = (0xAF ^ 0xAB);
        UseProcessor.lIlIIIIIllIIII[5] = (0x12 ^ 0x61 ^ (0x40 ^ 0x36));
        UseProcessor.lIlIIIIIllIIII[6] = (0x9E ^ 0xA2 ^ (0x13 ^ 0x29));
        UseProcessor.lIlIIIIIllIIII[7] = (0x58 ^ 0x5F);
        UseProcessor.lIlIIIIIllIIII[8] = (0x5D ^ 0x6E ^ (0x6B ^ 0x50));
        UseProcessor.lIlIIIIIllIIII[9] = (0x5 ^ 0xC);
        UseProcessor.lIlIIIIIllIIII[10] = (0x43 ^ 0x49);
        UseProcessor.lIlIIIIIllIIII[11] = (0x3F ^ 0x34);
        UseProcessor.lIlIIIIIllIIII[12] = (139 + 79 - 76 + 23 ^ 104 + 10 - 34 + 89);
    }
    
    private static boolean lllIIIIIllIIlII(final int lllllllllllllIIlIIIIlllIlIIllIll, final int lllllllllllllIIlIIIIlllIlIIllIlI) {
        return lllllllllllllIIlIIIIlllIlIIllIll < lllllllllllllIIlIIIIlllIlIIllIlI;
    }
}
