// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.awt.Graphics;
import org.newdawn.slick.font.Glyph;
import org.newdawn.slick.UnicodeFont;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.BasicStroke;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.awt.Stroke;
import java.awt.Color;

public class OutlineEffect implements ConfigurableEffect
{
    private /* synthetic */ int join;
    private /* synthetic */ float width;
    private static final /* synthetic */ int[] llllIIIIllIII;
    private /* synthetic */ Color color;
    private /* synthetic */ Stroke stroke;
    private static final /* synthetic */ String[] llllIIIIlIlII;
    
    private static String lIlIIlllIIlIIlI(String lllllllllllllIlIllllIIlllIIIIlll, final String lllllllllllllIlIllllIIlllIIIIllI) {
        lllllllllllllIlIllllIIlllIIIIlll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllllIIlllIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllllIIlllIIIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIllllIIlllIIIlIIl = lllllllllllllIlIllllIIlllIIIIllI.toCharArray();
        int lllllllllllllIlIllllIIlllIIIlIII = OutlineEffect.llllIIIIllIII[1];
        final boolean lllllllllllllIlIllllIIlllIIIIIlI = (Object)((String)lllllllllllllIlIllllIIlllIIIIlll).toCharArray();
        final String lllllllllllllIlIllllIIlllIIIIIIl = (String)lllllllllllllIlIllllIIlllIIIIIlI.length;
        boolean lllllllllllllIlIllllIIlllIIIIIII = OutlineEffect.llllIIIIllIII[1] != 0;
        while (lIlIIlllIlIIIII(lllllllllllllIlIllllIIlllIIIIIII ? 1 : 0, (int)lllllllllllllIlIllllIIlllIIIIIIl)) {
            final char lllllllllllllIlIllllIIlllIIIllIl = lllllllllllllIlIllllIIlllIIIIIlI[lllllllllllllIlIllllIIlllIIIIIII];
            lllllllllllllIlIllllIIlllIIIlIlI.append((char)(lllllllllllllIlIllllIIlllIIIllIl ^ lllllllllllllIlIllllIIlllIIIlIIl[lllllllllllllIlIllllIIlllIIIlIII % lllllllllllllIlIllllIIlllIIIlIIl.length]));
            "".length();
            ++lllllllllllllIlIllllIIlllIIIlIII;
            ++lllllllllllllIlIllllIIlllIIIIIII;
            "".length();
            if (((0xDF ^ 0xBA ^ (0x58 ^ 0x11)) & (65 + 63 - 51 + 76 ^ 51 + 118 - 144 + 156 ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllllIIlllIIIlIlI);
    }
    
    private static String lIlIIlllIIIllII(final String lllllllllllllIlIllllIIlllIlIIlll, final String lllllllllllllIlIllllIIlllIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIIlllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIlllIlIlIII.getBytes(StandardCharsets.UTF_8)), OutlineEffect.llllIIIIllIII[8]), "DES");
            final Cipher lllllllllllllIlIllllIIlllIlIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIllllIIlllIlIlIll.init(OutlineEffect.llllIIIIllIII[0], lllllllllllllIlIllllIIlllIlIllII);
            return new String(lllllllllllllIlIllllIIlllIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIlllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIIlllIlIlIlI) {
            lllllllllllllIlIllllIIlllIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIlllIIlIIll() {
        (llllIIIIlIlII = new String[OutlineEffect.llllIIIIllIII[15]])[OutlineEffect.llllIIIIllIII[1]] = lIlIIlllIIIlIll("uf4P/S8dZ18=", "IaLZT");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[2]] = lIlIIlllIIIllII("f6sq6HsZ1Sk=", "QBDQz");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[0]] = lIlIIlllIIIlIll("1yupFA229Co=", "QdFcL");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[3]] = lIlIIlllIIIllII("V8y8wj2Di04HQT8eexDLWqYFsUEYWfH+1nas52WW7e/2Wjpv2nsuGQAi7xkykFcAh08OcGUvET/MsUjIXnSnOxJFPAA5PvhMjFMmwo9FiKiqiGNWosy2Jv6pLepn7khE5C3DzaFMmq3lhYtp/GR74+DsqTbQ7Ngf", "emJeB");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[4]] = lIlIIlllIIIllII("0vSAOVD2Zz4=", "mGFRu");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[5]] = lIlIIlllIIlIIlI("IQgmFSY=", "cmPpJ");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[6]] = lIlIIlllIIIllII("p6mA5VeZQDI=", "aKABe");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[7]] = lIlIIlllIIlIIlI("JxMzNzo=", "jzGRH");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[8]] = lIlIIlllIIlIIlI("Sg==", "zAiqm");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[9]] = lIlIIlllIIIllII("FcUZdaJATeQ=", "PYSKF");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[10]] = lIlIIlllIIlIIlI("cA==", "AxjRY");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[11]] = lIlIIlllIIIllII("n1WdFLCkfuphKEQxlXaA184G3BMh4jt/0KLOfcrGVCJBBTLryisRZsYAU8uTgnuKfg6d9zpK25yBwTmAQPRsMX06xN4PKMIOzVN7GxlTYh7F7W3kS2c19qwh5wopC+yxSVeJ0ZyGiF30+WFr3JDt284eo8gyy4iF", "atSvP");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[12]] = lIlIIlllIIIllII("FaJ/ti9O/xc=", "yeVQk");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[13]] = lIlIIlllIIIllII("kIbb7l2eYxQ=", "axSqD");
        OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[14]] = lIlIIlllIIIlIll("HiDNhCUPL90=", "pSGre");
    }
    
    private static boolean lIlIIlllIIllllI(final Object lllllllllllllIlIllllIIllIlllIlll) {
        return lllllllllllllIlIllllIIllIlllIlll == null;
    }
    
    public void setStroke(final Stroke lllllllllllllIlIllllIIllllIIlIlI) {
        this.stroke = lllllllllllllIlIllllIIllllIIlIlI;
    }
    
    public Stroke getStroke() {
        if (lIlIIlllIIllllI(this.stroke)) {
            return new BasicStroke(this.width, OutlineEffect.llllIIIIllIII[0], this.join);
        }
        return this.stroke;
    }
    
    public void setValues(final List lllllllllllllIlIllllIIlllIllIlIl) {
        final Iterator lllllllllllllIlIllllIIlllIllIlll = lllllllllllllIlIllllIIlllIllIlIl.iterator();
        while (lIlIIlllIIlllll(lllllllllllllIlIllllIIlllIllIlll.hasNext() ? 1 : 0)) {
            final Value lllllllllllllIlIllllIIlllIlllIII = lllllllllllllIlIllllIIlllIllIlll.next();
            if (lIlIIlllIIlllll(lllllllllllllIlIllllIIlllIlllIII.getName().equals(OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[12]]) ? 1 : 0)) {
                this.color = (Color)lllllllllllllIlIllllIIlllIlllIII.getObject();
                "".length();
                if (" ".length() >= "   ".length()) {
                    return;
                }
            }
            else if (lIlIIlllIIlllll(lllllllllllllIlIllllIIlllIlllIII.getName().equals(OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[13]]) ? 1 : 0)) {
                this.width = (float)lllllllllllllIlIllllIIlllIlllIII.getObject();
                "".length();
                if (-" ".length() == " ".length()) {
                    return;
                }
            }
            else if (lIlIIlllIIlllll(lllllllllllllIlIllllIIlllIlllIII.getName().equals(OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[14]]) ? 1 : 0)) {
                this.join = Integer.parseInt((String)lllllllllllllIlIllllIIlllIlllIII.getObject());
            }
            "".length();
            if (((0x8C ^ 0x87 ^ (0x4C ^ 0x51)) & (172 + 186 - 295 + 150 ^ 128 + 18 - 51 + 100 ^ -" ".length())) < 0) {
                return;
            }
        }
    }
    
    public void setColor(final Color lllllllllllllIlIllllIIllllIllIII) {
        this.color = lllllllllllllIlIllllIIllllIllIII;
    }
    
    public void setWidth(final int lllllllllllllIlIllllIIllllIlllll) {
        this.width = (float)lllllllllllllIlIllllIIllllIlllll;
    }
    
    public OutlineEffect() {
        this.width = 2.0f;
        this.color = Color.black;
        this.join = OutlineEffect.llllIIIIllIII[0];
    }
    
    public OutlineEffect(final int lllllllllllllIlIllllIIllllllIlll, final Color lllllllllllllIlIllllIIllllllIllI) {
        this.width = 2.0f;
        this.color = Color.black;
        this.join = OutlineEffect.llllIIIIllIII[0];
        this.width = (float)lllllllllllllIlIllllIIllllllIlll;
        this.color = lllllllllllllIlIllllIIllllllIllI;
    }
    
    public List getValues() {
        final List lllllllllllllIlIllllIIlllIllllll = new ArrayList();
        lllllllllllllIlIllllIIlllIllllll.add(EffectUtil.colorValue(OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[2]], this.color));
        "".length();
        lllllllllllllIlIllllIIlllIllllll.add(EffectUtil.floatValue(OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[0]], this.width, 0.1f, 999.0f, OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[3]]));
        "".length();
        final List list = lllllllllllllIlIllllIIlllIllllll;
        final String lllllllllllllIIlIlIllIllllIllIII = OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[4]];
        final String value = String.valueOf(this.join);
        final String[][] lllllllllllllIIlIlIllIllllIlIIlI = new String[OutlineEffect.llllIIIIllIII[3]][];
        final int n = OutlineEffect.llllIIIIllIII[1];
        final String[] array = new String[OutlineEffect.llllIIIIllIII[0]];
        array[OutlineEffect.llllIIIIllIII[1]] = OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[5]];
        array[OutlineEffect.llllIIIIllIII[2]] = OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[6]];
        lllllllllllllIIlIlIllIllllIlIIlI[n] = array;
        final int n2 = OutlineEffect.llllIIIIllIII[2];
        final String[] array2 = new String[OutlineEffect.llllIIIIllIII[0]];
        array2[OutlineEffect.llllIIIIllIII[1]] = OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[7]];
        array2[OutlineEffect.llllIIIIllIII[2]] = OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[8]];
        lllllllllllllIIlIlIllIllllIlIIlI[n2] = array2;
        final int n3 = OutlineEffect.llllIIIIllIII[0];
        final String[] array3 = new String[OutlineEffect.llllIIIIllIII[0]];
        array3[OutlineEffect.llllIIIIllIII[1]] = OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[9]];
        array3[OutlineEffect.llllIIIIllIII[2]] = OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[10]];
        lllllllllllllIIlIlIllIllllIlIIlI[n3] = array3;
        list.add(EffectUtil.optionValue(lllllllllllllIIlIlIllIllllIllIII, value, lllllllllllllIIlIlIllIllllIlIIlI, OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[11]]));
        "".length();
        return lllllllllllllIlIllllIIlllIllllll;
    }
    
    @Override
    public String toString() {
        return OutlineEffect.llllIIIIlIlII[OutlineEffect.llllIIIIllIII[1]];
    }
    
    public int getJoin() {
        return this.join;
    }
    
    static {
        lIlIIlllIIllIll();
        lIlIIlllIIlIIll();
    }
    
    private static boolean lIlIIlllIlIIIII(final int lllllllllllllIlIllllIIllIlllllII, final int lllllllllllllIlIllllIIllIllllIll) {
        return lllllllllllllIlIllllIIllIlllllII < lllllllllllllIlIllllIIllIllllIll;
    }
    
    private static boolean lIlIIlllIIlllll(final int lllllllllllllIlIllllIIllIlllIlIl) {
        return lllllllllllllIlIllllIIllIlllIlIl != 0;
    }
    
    public void setJoin(final int lllllllllllllIlIllllIIllllIIIllI) {
        this.join = lllllllllllllIlIllllIIllllIIIllI;
    }
    
    private static boolean lIlIIlllIIlllII(final Object lllllllllllllIlIllllIIllIllllIIl) {
        return lllllllllllllIlIllllIIllIllllIIl != null;
    }
    
    public void draw(final BufferedImage lllllllllllllIlIllllIIlllllIlllI, Graphics2D lllllllllllllIlIllllIIlllllIlIIl, final UnicodeFont lllllllllllllIlIllllIIlllllIllII, final Glyph lllllllllllllIlIllllIIlllllIlIll) {
        lllllllllllllIlIllllIIlllllIlIIl = (char)((Graphics)lllllllllllllIlIllllIIlllllIlIIl).create();
        if (lIlIIlllIIlllII(this.stroke)) {
            ((Graphics2D)lllllllllllllIlIllllIIlllllIlIIl).setStroke(this.stroke);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            ((Graphics2D)lllllllllllllIlIllllIIlllllIlIIl).setStroke(this.getStroke());
        }
        ((Graphics)lllllllllllllIlIllllIIlllllIlIIl).setColor(this.color);
        ((Graphics2D)lllllllllllllIlIllllIIlllllIlIIl).draw(lllllllllllllIlIllllIIlllllIlIll.getShape());
        ((Graphics)lllllllllllllIlIllllIIlllllIlIIl).dispose();
    }
    
    private static void lIlIIlllIIllIll() {
        (llllIIIIllIII = new int[16])[0] = "  ".length();
        OutlineEffect.llllIIIIllIII[1] = ((0x45 ^ 0x1E) & ~(0x7F ^ 0x24));
        OutlineEffect.llllIIIIllIII[2] = " ".length();
        OutlineEffect.llllIIIIllIII[3] = "   ".length();
        OutlineEffect.llllIIIIllIII[4] = (0x39 ^ 0x28 ^ (0x7F ^ 0x6A));
        OutlineEffect.llllIIIIllIII[5] = (0x99 ^ 0x9C);
        OutlineEffect.llllIIIIllIII[6] = (0x1 ^ 0x65 ^ (0xD4 ^ 0xB6));
        OutlineEffect.llllIIIIllIII[7] = (0xB4 ^ 0x89 ^ (0x7B ^ 0x41));
        OutlineEffect.llllIIIIllIII[8] = (0x26 ^ 0x2E);
        OutlineEffect.llllIIIIllIII[9] = (0x5E ^ 0x63 ^ (0x6C ^ 0x58));
        OutlineEffect.llllIIIIllIII[10] = (0x2F ^ 0x25);
        OutlineEffect.llllIIIIllIII[11] = (0x7C ^ 0x77);
        OutlineEffect.llllIIIIllIII[12] = (0x62 ^ 0x6E);
        OutlineEffect.llllIIIIllIII[13] = (0xF ^ 0x2);
        OutlineEffect.llllIIIIllIII[14] = (0x53 ^ 0x5D);
        OutlineEffect.llllIIIIllIII[15] = (0x7A ^ 0x62 ^ (0xD1 ^ 0xC6));
    }
    
    private static String lIlIIlllIIIlIll(final String lllllllllllllIlIllllIIlllIIlllII, final String lllllllllllllIlIllllIIlllIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIIlllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIlllIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllllIIlllIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllllIIlllIIllllI.init(OutlineEffect.llllIIIIllIII[0], lllllllllllllIlIllllIIlllIIlllll);
            return new String(lllllllllllllIlIllllIIlllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIlllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIIlllIIlllIl) {
            lllllllllllllIlIllllIIlllIIlllIl.printStackTrace();
            return null;
        }
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public float getWidth() {
        return this.width;
    }
}
