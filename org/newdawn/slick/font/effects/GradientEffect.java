// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.awt.Paint;
import java.awt.GradientPaint;
import org.newdawn.slick.font.Glyph;
import org.newdawn.slick.UnicodeFont;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.Color;

public class GradientEffect implements ConfigurableEffect
{
    private static final /* synthetic */ int[] lllllllIlIIll;
    private /* synthetic */ boolean cyclic;
    private static final /* synthetic */ String[] lllllllIlIIlI;
    private /* synthetic */ Color topColor;
    private /* synthetic */ float scale;
    private /* synthetic */ Color bottomColor;
    private /* synthetic */ int offset;
    
    public void setValues(final List lllllllllllllIlIlIIllllllIllIlll) {
        final Iterator lllllllllllllIlIlIIllllllIlllIIl = lllllllllllllIlIlIIllllllIllIlll.iterator();
        while (lIllIIIlIIlIlII(lllllllllllllIlIlIIllllllIlllIIl.hasNext() ? 1 : 0)) {
            final Value lllllllllllllIlIlIIllllllIlllIlI = lllllllllllllIlIlIIllllllIlllIIl.next();
            if (lIllIIIlIIlIlII(lllllllllllllIlIlIIllllllIlllIlI.getName().equals(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[9]]) ? 1 : 0)) {
                this.topColor = (Color)lllllllllllllIlIlIIllllllIlllIlI.getObject();
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            }
            else if (lIllIIIlIIlIlII(lllllllllllllIlIlIIllllllIlllIlI.getName().equals(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[10]]) ? 1 : 0)) {
                this.bottomColor = (Color)lllllllllllllIlIlIIllllllIlllIlI.getObject();
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else if (lIllIIIlIIlIlII(lllllllllllllIlIlIIllllllIlllIlI.getName().equals(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[11]]) ? 1 : 0)) {
                this.offset = (int)lllllllllllllIlIlIIllllllIlllIlI.getObject();
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
            else if (lIllIIIlIIlIlII(lllllllllllllIlIlIIllllllIlllIlI.getName().equals(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[12]]) ? 1 : 0)) {
                this.scale = (float)lllllllllllllIlIlIIllllllIlllIlI.getObject();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIllIIIlIIlIlII(lllllllllllllIlIlIIllllllIlllIlI.getName().equals(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[13]]) ? 1 : 0)) {
                this.cyclic = (boolean)lllllllllllllIlIlIIllllllIlllIlI.getObject();
            }
            "".length();
            if ("  ".length() == " ".length()) {
                return;
            }
        }
    }
    
    public float getScale() {
        return this.scale;
    }
    
    private static void lIllIIIlIIlIIll() {
        (lllllllIlIIll = new int[15])[0] = ((0x6F ^ 0x67) & ~(0x14 ^ 0x1C));
        GradientEffect.lllllllIlIIll[1] = "  ".length();
        GradientEffect.lllllllIlIIll[2] = " ".length();
        GradientEffect.lllllllIlIIll[3] = "   ".length();
        GradientEffect.lllllllIlIIll[4] = (0x56 ^ 0x33 ^ (0x39 ^ 0x58));
        GradientEffect.lllllllIlIIll[5] = (0x47 ^ 0x42);
        GradientEffect.lllllllIlIIll[6] = (0x20 ^ 0x26);
        GradientEffect.lllllllIlIIll[7] = (0x8E ^ 0x89);
        GradientEffect.lllllllIlIIll[8] = (0x1 ^ 0x55 ^ (0xD5 ^ 0x89));
        GradientEffect.lllllllIlIIll[9] = (0x41 ^ 0x36 ^ (0x11 ^ 0x6F));
        GradientEffect.lllllllIlIIll[10] = (0xA5 ^ 0xAF);
        GradientEffect.lllllllIlIIll[11] = (0x2C ^ 0x20 ^ (0x47 ^ 0x40));
        GradientEffect.lllllllIlIIll[12] = (0xF ^ 0x3);
        GradientEffect.lllllllIlIIll[13] = (0x9C ^ 0x91);
        GradientEffect.lllllllIlIIll[14] = (0x98 ^ 0x96);
    }
    
    @Override
    public String toString() {
        return GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[0]];
    }
    
    public int getOffset() {
        return this.offset;
    }
    
    private static boolean lIllIIIlIIlIlIl(final int lllllllllllllIlIlIIlllllIllllllI, final int lllllllllllllIlIlIIlllllIlllllIl) {
        return lllllllllllllIlIlIIlllllIllllllI < lllllllllllllIlIlIIlllllIlllllIl;
    }
    
    public void setCyclic(final boolean lllllllllllllIlIlIIlllllllIIlIII) {
        this.cyclic = lllllllllllllIlIlIIlllllllIIlIII;
    }
    
    static {
        lIllIIIlIIlIIll();
        lIllIIIlIIlIIIl();
    }
    
    public List getValues() {
        final List lllllllllllllIlIlIIlllllllIIIIIl = new ArrayList();
        lllllllllllllIlIlIIlllllllIIIIIl.add(EffectUtil.colorValue(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[2]], this.topColor));
        "".length();
        lllllllllllllIlIlIIlllllllIIIIIl.add(EffectUtil.colorValue(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[1]], this.bottomColor));
        "".length();
        lllllllllllllIlIlIIlllllllIIIIIl.add(EffectUtil.intValue(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[3]], this.offset, GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[4]]));
        "".length();
        lllllllllllllIlIlIIlllllllIIIIIl.add(EffectUtil.floatValue(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[5]], this.scale, 0.0f, 1.0f, GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[6]]));
        "".length();
        lllllllllllllIlIlIIlllllllIIIIIl.add(EffectUtil.booleanValue(GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[7]], this.cyclic, GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[8]]));
        "".length();
        return lllllllllllllIlIlIIlllllllIIIIIl;
    }
    
    public void setOffset(final int lllllllllllllIlIlIIlllllllIllIII) {
        this.offset = lllllllllllllIlIlIIlllllllIllIII;
    }
    
    public void setScale(final float lllllllllllllIlIlIIlllllllIlIIIl) {
        this.scale = lllllllllllllIlIlIIlllllllIlIIIl;
    }
    
    public void draw(final BufferedImage lllllllllllllIlIlIlIIIIIIIIIIIII, final Graphics2D lllllllllllllIlIlIIllllllllllIII, final UnicodeFont lllllllllllllIlIlIIlllllllllIlll, final Glyph lllllllllllllIlIlIIlllllllllllIl) {
        final int lllllllllllllIlIlIIlllllllllllII = lllllllllllllIlIlIIlllllllllIlll.getAscent();
        final float lllllllllllllIlIlIIllllllllllIll = lllllllllllllIlIlIIlllllllllllII * this.scale;
        final float lllllllllllllIlIlIIllllllllllIlI = -lllllllllllllIlIlIIlllllllllllIl.getYOffset() + lllllllllllllIlIlIIlllllllllIlll.getDescent() + this.offset + lllllllllllllIlIlIIlllllllllllII / GradientEffect.lllllllIlIIll[1] - lllllllllllllIlIlIIllllllllllIll / 2.0f;
        lllllllllllllIlIlIIllllllllllIII.setPaint(new GradientPaint(0.0f, lllllllllllllIlIlIIllllllllllIlI, this.topColor, 0.0f, lllllllllllllIlIlIIllllllllllIlI + lllllllllllllIlIlIIllllllllllIll, this.bottomColor, this.cyclic));
        lllllllllllllIlIlIIllllllllllIII.fill(lllllllllllllIlIlIIlllllllllllIl.getShape());
    }
    
    private static boolean lIllIIIlIIlIlII(final int lllllllllllllIlIlIIlllllIllllIll) {
        return lllllllllllllIlIlIIlllllIllllIll != 0;
    }
    
    private static void lIllIIIlIIlIIIl() {
        (lllllllIlIIlI = new String[GradientEffect.lllllllIlIIll[14]])[GradientEffect.lllllllIlIIll[0]] = lIllIIIlIIIlllI("NCUGEzwWORM=", "sWgwU");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[2]] = lIllIIIlIIIllll("svOZt+1AU0KNO4DwcG933g==", "dfiDK");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[1]] = lIllIIIlIIIlllI("Ex8SHCQ8UAUHJz4C", "QpfhK");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[3]] = lIllIIIlIIIlllI("DRIyGB82", "BtTkz");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[4]] = lIllIIIlIIIlllI("MSYlNHgWKzgzMQspbCY0CSE7NHgcITlnLApuISguAG44Lz1FKT4mPAwrIjN4ED5sKCpFKiMwNktuGC89RSk+JjwMKyIzeAw9bCk3FyMtKzQcbi8iNhErPiI8RSEiZywNK2wgNBw+JGk=", "eNLGX");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[5]] = lIllIIIlIIlIIII("4TX241XBaTQ=", "wUiXr");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[6]] = lIllIIIlIIIlllI("MwkrMU8UBDY2BgkGYiMDCw41MU8eDjdiGwhBISoOCQYnYhsPBGIqCg4GKjZPCAdiNgcCQSUwDgMIJywbRwM7Yg4XBDAhCgkVIyUKSUEWKgpHBjAjCw4ELDZPDhJiLAAVDCMuAx5BNioKRwknKwgPFWItCUcMLTEbRwYuOx8PEmIrAUcVKidPAQ4sNkE=", "gaBBo");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[7]] = lIllIIIlIIlIIII("8mGtZR3Kwz8=", "CGOQR");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[8]] = lIllIIIlIIIllll("o8DixOOK4mDSFmr1Ej+yu8FjzWUe9QT4E2OkfXSFPDO+lKmJubd1e3TKe5/qR1180Q/dzpx6Szc=", "McCud");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[9]] = lIllIIIlIIlIIII("yRzKCLvSgy/D2jg3oQfksg==", "ZPzvG");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[10]] = lIllIIIlIIIlllI("OxkaDh4UVg0VHRYE", "yvnzq");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[11]] = lIllIIIlIIIllll("nhoww4pvjuk=", "ulwpx");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[12]] = lIllIIIlIIIlllI("KTAHJyA=", "zSfKE");
        GradientEffect.lllllllIlIIlI[GradientEffect.lllllllIlIIll[13]] = lIllIIIlIIlIIII("8WQFaTQmjX4=", "bIFex");
    }
    
    public GradientEffect() {
        this.topColor = Color.cyan;
        this.bottomColor = Color.blue;
        this.offset = GradientEffect.lllllllIlIIll[0];
        this.scale = 1.0f;
    }
    
    public boolean isCyclic() {
        return this.cyclic;
    }
    
    private static String lIllIIIlIIlIIII(final String lllllllllllllIlIlIIllllllIIIIlII, final String lllllllllllllIlIlIIllllllIIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllllllIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllllllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIllllllIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIllllllIIIlIII.init(GradientEffect.lllllllIlIIll[1], lllllllllllllIlIlIIllllllIIIlIIl);
            return new String(lllllllllllllIlIlIIllllllIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllllllIIIIlll) {
            lllllllllllllIlIlIIllllllIIIIlll.printStackTrace();
            return null;
        }
    }
    
    public Color getTopColor() {
        return this.topColor;
    }
    
    public void setTopColor(final Color lllllllllllllIlIlIIllllllllIllII) {
        this.topColor = lllllllllllllIlIlIIllllllllIllII;
    }
    
    private static String lIllIIIlIIIlllI(String lllllllllllllIlIlIIllllllIIlIllI, final String lllllllllllllIlIlIIllllllIIlIlIl) {
        lllllllllllllIlIlIIllllllIIlIllI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIllllllIIlIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIllllllIIllIIl = new StringBuilder();
        final char[] lllllllllllllIlIlIIllllllIIllIII = lllllllllllllIlIlIIllllllIIlIlIl.toCharArray();
        int lllllllllllllIlIlIIllllllIIlIlll = GradientEffect.lllllllIlIIll[0];
        final long lllllllllllllIlIlIIllllllIIlIIIl = (Object)((String)lllllllllllllIlIlIIllllllIIlIllI).toCharArray();
        final Exception lllllllllllllIlIlIIllllllIIlIIII = (Exception)lllllllllllllIlIlIIllllllIIlIIIl.length;
        String lllllllllllllIlIlIIllllllIIIllll = (String)GradientEffect.lllllllIlIIll[0];
        while (lIllIIIlIIlIlIl((int)lllllllllllllIlIlIIllllllIIIllll, (int)lllllllllllllIlIlIIllllllIIlIIII)) {
            final char lllllllllllllIlIlIIllllllIIlllII = lllllllllllllIlIlIIllllllIIlIIIl[lllllllllllllIlIlIIllllllIIIllll];
            lllllllllllllIlIlIIllllllIIllIIl.append((char)(lllllllllllllIlIlIIllllllIIlllII ^ lllllllllllllIlIlIIllllllIIllIII[lllllllllllllIlIlIIllllllIIlIlll % lllllllllllllIlIlIIllllllIIllIII.length]));
            "".length();
            ++lllllllllllllIlIlIIllllllIIlIlll;
            ++lllllllllllllIlIlIIllllllIIIllll;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIllllllIIllIIl);
    }
    
    public void setBottomColor(final Color lllllllllllllIlIlIIllllllllIIIIl) {
        this.bottomColor = lllllllllllllIlIlIIllllllllIIIIl;
    }
    
    public Color getBottomColor() {
        return this.bottomColor;
    }
    
    private static String lIllIIIlIIIllll(final String lllllllllllllIlIlIIllllllIlIlIll, final String lllllllllllllIlIlIIllllllIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllllllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllllllIlIlIlI.getBytes(StandardCharsets.UTF_8)), GradientEffect.lllllllIlIIll[8]), "DES");
            final Cipher lllllllllllllIlIlIIllllllIlIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIllllllIlIllIl.init(GradientEffect.lllllllIlIIll[1], lllllllllllllIlIlIIllllllIlIlllI);
            return new String(lllllllllllllIlIlIIllllllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllllllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllllllIlIllII) {
            lllllllllllllIlIlIIllllllIlIllII.printStackTrace();
            return null;
        }
    }
    
    public GradientEffect(final Color lllllllllllllIlIlIlIIIIIIIIIllll, final Color lllllllllllllIlIlIlIIIIIIIIIlIlI, final float lllllllllllllIlIlIlIIIIIIIIIlIIl) {
        this.topColor = Color.cyan;
        this.bottomColor = Color.blue;
        this.offset = GradientEffect.lllllllIlIIll[0];
        this.scale = 1.0f;
        this.topColor = lllllllllllllIlIlIlIIIIIIIIIllll;
        this.bottomColor = lllllllllllllIlIlIlIIIIIIIIIlIlI;
        this.scale = lllllllllllllIlIlIlIIIIIIIIIlIIl;
    }
}
