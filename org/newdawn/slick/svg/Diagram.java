// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.ArrayList;

public class Diagram
{
    private static final /* synthetic */ int[] llIlIlllIIlIlI;
    private /* synthetic */ ArrayList figures;
    private /* synthetic */ float width;
    private /* synthetic */ HashMap gradients;
    private /* synthetic */ float height;
    private /* synthetic */ HashMap patterns;
    private /* synthetic */ HashMap figureMap;
    private static final /* synthetic */ String[] llIlIlllIIIIlI;
    
    private static void lIIlIlIllIIlIIll() {
        (llIlIlllIIIIlI = new String[Diagram.llIlIlllIIlIlI[3]])[Diagram.llIlIlllIIlIlI[0]] = lIIlIlIllIIIllll("mxrWXWDwv7E=", "ufLBU");
        Diagram.llIlIlllIIIIlI[Diagram.llIlIlllIIlIlI[1]] = lIIlIlIllIIlIIIl("pSZRn/aH1Ac=", "qIpnE");
        Diagram.llIlIlllIIIIlI[Diagram.llIlIlllIIlIlI[2]] = lIIlIlIllIIlIIlI("ICM=", "IGCzZ");
    }
    
    private static boolean lIIlIlIllIlIIIII(final Object llllllllllllIllIlIIlIIIlIIIIIIII) {
        return llllllllllllIllIlIIlIIIlIIIIIIII != null;
    }
    
    private static String lIIlIlIllIIlIIIl(final String llllllllllllIllIlIIlIIIlIIlIIIIl, final String llllllllllllIllIlIIlIIIlIIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIIlIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlIIIlIIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlIIIlIIlIIlIl.init(Diagram.llIlIlllIIlIlI[2], llllllllllllIllIlIIlIIIlIIlIIllI);
            return new String(llllllllllllIllIlIIlIIIlIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIIlIIlIIlII) {
            llllllllllllIllIlIIlIIIlIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlIllIIlIIlI(String llllllllllllIllIlIIlIIIlIIIIlllI, final String llllllllllllIllIlIIlIIIlIIIlIIlI) {
        llllllllllllIllIlIIlIIIlIIIIlllI = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlIIIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIIIlIIIlIIIl = new StringBuilder();
        final char[] llllllllllllIllIlIIlIIIlIIIlIIII = llllllllllllIllIlIIlIIIlIIIlIIlI.toCharArray();
        int llllllllllllIllIlIIlIIIlIIIIllll = Diagram.llIlIlllIIlIlI[0];
        final byte llllllllllllIllIlIIlIIIlIIIIlIIl = (Object)llllllllllllIllIlIIlIIIlIIIIlllI.toCharArray();
        final boolean llllllllllllIllIlIIlIIIlIIIIlIII = llllllllllllIllIlIIlIIIlIIIIlIIl.length != 0;
        long llllllllllllIllIlIIlIIIlIIIIIlll = Diagram.llIlIlllIIlIlI[0];
        while (lIIlIlIllIlIIIlI((int)llllllllllllIllIlIIlIIIlIIIIIlll, llllllllllllIllIlIIlIIIlIIIIlIII ? 1 : 0)) {
            final char llllllllllllIllIlIIlIIIlIIIlIlII = llllllllllllIllIlIIlIIIlIIIIlIIl[llllllllllllIllIlIIlIIIlIIIIIlll];
            llllllllllllIllIlIIlIIIlIIIlIIIl.append((char)(llllllllllllIllIlIIlIIIlIIIlIlII ^ llllllllllllIllIlIIlIIIlIIIlIIII[llllllllllllIllIlIIlIIIlIIIIllll % llllllllllllIllIlIIlIIIlIIIlIIII.length]));
            "".length();
            ++llllllllllllIllIlIIlIIIlIIIIllll;
            ++llllllllllllIllIlIIlIIIlIIIIIlll;
            "".length();
            if (((148 + 22 - 84 + 72 ^ 58 + 112 - 129 + 113) & (80 + 103 - 41 + 15 ^ 139 + 64 - 148 + 98 ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIIIlIIIlIIIl);
    }
    
    private static boolean lIIlIlIllIlIIIIl(final int llllllllllllIllIlIIlIIIIlllllllI) {
        return llllllllllllIllIlIIlIIIIlllllllI != 0;
    }
    
    public int getFigureCount() {
        return this.figures.size();
    }
    
    public Gradient getGradient(final String llllllllllllIllIlIIlIIIlIllIIIIl) {
        return this.gradients.get(llllllllllllIllIlIIlIIIlIllIIIIl);
    }
    
    static {
        lIIlIlIllIIllllI();
        lIIlIlIllIIlIIll();
    }
    
    public float getHeight() {
        return this.height;
    }
    
    public Figure getFigure(final int llllllllllllIllIlIIlIIIlIlIIIIII) {
        return this.figures.get(llllllllllllIllIlIIlIIIlIlIIIIII);
    }
    
    public Figure getFigureByID(final String llllllllllllIllIlIIlIIIlIlIlIllI) {
        return this.figureMap.get(llllllllllllIllIlIIlIIIlIlIlIllI);
    }
    
    public void addFigure(final Figure llllllllllllIllIlIIlIIIlIlIIlIlI) {
        this.figures.add(llllllllllllIllIlIIlIIIlIlIIlIlI);
        "".length();
        this.figureMap.put(llllllllllllIllIlIIlIIIlIlIIlIlI.getData().getAttribute(Diagram.llIlIlllIIIIlI[Diagram.llIlIlllIIlIlI[0]]), llllllllllllIllIlIIlIIIlIlIIlIlI);
        "".length();
        final String llllllllllllIllIlIIlIIIlIlIIllIl = llllllllllllIllIlIIlIIIlIlIIlIlI.getData().getAsReference(Diagram.llIlIlllIIIIlI[Diagram.llIlIlllIIlIlI[1]]);
        final Gradient llllllllllllIllIlIIlIIIlIlIIllII = this.getGradient(llllllllllllIllIlIIlIIIlIlIIllIl);
        if (lIIlIlIllIlIIIII(llllllllllllIllIlIIlIIIlIlIIllII) && lIIlIlIllIlIIIIl(llllllllllllIllIlIIlIIIlIlIIllII.isRadial() ? 1 : 0)) {
            int llllllllllllIllIlIIlIIIlIlIlIIII = Diagram.llIlIlllIIlIlI[0];
            while (lIIlIlIllIlIIIlI(llllllllllllIllIlIIlIIIlIlIlIIII, InkscapeLoader.RADIAL_TRIANGULATION_LEVEL)) {
                llllllllllllIllIlIIlIIIlIlIIlIlI.getShape().increaseTriangulation();
                ++llllllllllllIllIlIIlIIIlIlIlIIII;
                "".length();
                if (" ".length() > (0x83 ^ 0x87)) {
                    return;
                }
            }
        }
    }
    
    private static void lIIlIlIllIIllllI() {
        (llIlIlllIIlIlI = new int[5])[0] = ("   ".length() & ~"   ".length());
        Diagram.llIlIlllIIlIlI[1] = " ".length();
        Diagram.llIlIlllIIlIlI[2] = "  ".length();
        Diagram.llIlIlllIIlIlI[3] = "   ".length();
        Diagram.llIlIlllIIlIlI[4] = (0xAA ^ 0xC4 ^ (0x4 ^ 0x62));
    }
    
    public void addGradient(final String llllllllllllIllIlIIlIIIlIllIllII, final Gradient llllllllllllIllIlIIlIIIlIllIlIll) {
        this.gradients.put(llllllllllllIllIlIIlIIIlIllIllII, llllllllllllIllIlIIlIIIlIllIlIll);
        "".length();
    }
    
    private static String lIIlIlIllIIIllll(final String llllllllllllIllIlIIlIIIlIIllIIII, final String llllllllllllIllIlIIlIIIlIIlIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIIlIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIIIlIIlIllll.getBytes(StandardCharsets.UTF_8)), Diagram.llIlIlllIIlIlI[4]), "DES");
            final Cipher llllllllllllIllIlIIlIIIlIIllIIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIIIlIIllIIlI.init(Diagram.llIlIlllIIlIlI[2], llllllllllllIllIlIIlIIIlIIllIIll);
            return new String(llllllllllllIllIlIIlIIIlIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIIlIIllIIIl) {
            llllllllllllIllIlIIlIIIlIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIllIlIIIlI(final int llllllllllllIllIlIIlIIIlIIIIIIll, final int llllllllllllIllIlIIlIIIlIIIIIIlI) {
        return llllllllllllIllIlIIlIIIlIIIIIIll < llllllllllllIllIlIIlIIIlIIIIIIlI;
    }
    
    public void removeFigure(final Figure llllllllllllIllIlIIlIIIlIIlllIII) {
        this.figures.remove(llllllllllllIllIlIIlIIIlIIlllIII);
        "".length();
        this.figureMap.remove(llllllllllllIllIlIIlIIIlIIlllIII.getData().getAttribute(Diagram.llIlIlllIIIIlI[Diagram.llIlIlllIIlIlI[2]]));
        "".length();
    }
    
    public Diagram(final float llllllllllllIllIlIIlIIIllIIIIlll, final float llllllllllllIllIlIIlIIIllIIIIllI) {
        this.figures = new ArrayList();
        this.patterns = new HashMap();
        this.gradients = new HashMap();
        this.figureMap = new HashMap();
        this.width = llllllllllllIllIlIIlIIIllIIIIlll;
        this.height = llllllllllllIllIlIIlIIIllIIIIllI;
    }
    
    public String getPatternDef(final String llllllllllllIllIlIIlIIIlIllIIlIl) {
        return this.patterns.get(llllllllllllIllIlIIlIIIlIllIIlIl);
    }
    
    public float getWidth() {
        return this.width;
    }
    
    public String[] getPatternDefNames() {
        return (String[])this.patterns.keySet().toArray(new String[Diagram.llIlIlllIIlIlI[0]]);
    }
    
    public void addPatternDef(final String llllllllllllIllIlIIlIIIlIllllIII, final String llllllllllllIllIlIIlIIIlIlllIlII) {
        this.patterns.put(llllllllllllIllIlIIlIIIlIllllIII, llllllllllllIllIlIIlIIIlIlllIlII);
        "".length();
    }
}
