// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.font.Glyph;
import org.newdawn.slick.UnicodeFont;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class ColorEffect implements ConfigurableEffect
{
    private static final /* synthetic */ int[] lllIIIIllIllIl;
    private static final /* synthetic */ String[] lllIIIIllIlIll;
    private /* synthetic */ Color color;
    
    @Override
    public String toString() {
        return ColorEffect.lllIIIIllIlIll[ColorEffect.lllIIIIllIllIl[1]];
    }
    
    public Color getColor() {
        return this.color;
    }
    
    static {
        lIIlllIIlllIIllI();
        lIIlllIIllIlllll();
    }
    
    private static boolean lIIlllIIlllIIlll(final Object llllllllllllIllIIIIlIIIlIllIIIlI) {
        return llllllllllllIllIIIIlIIIlIllIIIlI == null;
    }
    
    private static boolean lIIlllIIlllIlIII(final int llllllllllllIllIIIIlIIIlIllIIIII) {
        return llllllllllllIllIIIIlIIIlIllIIIII != 0;
    }
    
    public void draw(final BufferedImage llllllllllllIllIIIIlIIIllIllllII, final Graphics2D llllllllllllIllIIIIlIIIllIlllIll, final UnicodeFont llllllllllllIllIIIIlIIIllIlllIlI, final Glyph llllllllllllIllIIIIlIIIllIllIllI) {
        llllllllllllIllIIIIlIIIllIlllIll.setColor(this.color);
        llllllllllllIllIIIIlIIIllIlllIll.fill(llllllllllllIllIIIIlIIIllIllIllI.getShape());
    }
    
    private static void lIIlllIIlllIIllI() {
        (lllIIIIllIllIl = new int[6])[0] = ((0x12 ^ 0x55 ^ (0xE7 ^ 0xB7)) & (0x27 ^ 0x13 ^ (0x62 ^ 0x41) ^ -" ".length()));
        ColorEffect.lllIIIIllIllIl[1] = " ".length();
        ColorEffect.lllIIIIllIllIl[2] = "  ".length();
        ColorEffect.lllIIIIllIllIl[3] = "   ".length();
        ColorEffect.lllIIIIllIllIl[4] = (0xD ^ 0x5B ^ (0x6F ^ 0x3D));
        ColorEffect.lllIIIIllIllIl[5] = (127 + 49 + 26 + 3 ^ 15 + 153 - 133 + 162);
    }
    
    private static void lIIlllIIllIlllll() {
        (lllIIIIllIlIll = new String[ColorEffect.lllIIIIllIllIl[4]])[ColorEffect.lllIIIIllIllIl[0]] = lIIlllIIllIlllII("3a213lL4xPgR8yJWz05CKt2kSk50xQ2p", "paWAj");
        ColorEffect.lllIIIIllIlIll[ColorEffect.lllIIIIllIllIl[1]] = lIIlllIIllIlllIl("aygbCVKtZOI=", "DNrLm");
        ColorEffect.lllIIIIllIlIll[ColorEffect.lllIIIIllIllIl[2]] = lIIlllIIllIlllII("tmZDMxSUnIE=", "dnruX");
        ColorEffect.lllIIIIllIlIll[ColorEffect.lllIIIIllIllIl[3]] = lIIlllIIllIllllI("AAYgOyE=", "CiLTS");
    }
    
    private static String lIIlllIIllIlllIl(final String llllllllllllIllIIIIlIIIllIIIIIll, final String llllllllllllIllIIIIlIIIllIIIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIIllIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIIllIIIIlII.getBytes(StandardCharsets.UTF_8)), ColorEffect.lllIIIIllIllIl[5]), "DES");
            final Cipher llllllllllllIllIIIIlIIIllIIIIlll = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIIIllIIIIlll.init(ColorEffect.lllIIIIllIllIl[2], llllllllllllIllIIIIlIIIllIIIlIII);
            return new String(llllllllllllIllIIIIlIIIllIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIIllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIIllIIIIllI) {
            llllllllllllIllIIIIlIIIllIIIIllI.printStackTrace();
            return null;
        }
    }
    
    public ColorEffect(final Color llllllllllllIllIIIIlIIIlllIIIIIl) {
        this.color = Color.white;
        this.color = llllllllllllIllIIIIlIIIlllIIIIIl;
    }
    
    private static boolean lIIlllIIlllIlIIl(final int llllllllllllIllIIIIlIIIlIllIIlIl, final int llllllllllllIllIIIIlIIIlIllIIlII) {
        return llllllllllllIllIIIIlIIIlIllIIlIl < llllllllllllIllIIIIlIIIlIllIIlII;
    }
    
    private static String lIIlllIIllIllllI(String llllllllllllIllIIIIlIIIlIlllIIII, final String llllllllllllIllIIIIlIIIlIlllIlII) {
        llllllllllllIllIIIIlIIIlIlllIIII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIlIIIlIlllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIIIlIlllIIll = new StringBuilder();
        final char[] llllllllllllIllIIIIlIIIlIlllIIlI = llllllllllllIllIIIIlIIIlIlllIlII.toCharArray();
        int llllllllllllIllIIIIlIIIlIlllIIIl = ColorEffect.lllIIIIllIllIl[0];
        final double llllllllllllIllIIIIlIIIlIllIlIll = (Object)((String)llllllllllllIllIIIIlIIIlIlllIIII).toCharArray();
        final byte llllllllllllIllIIIIlIIIlIllIlIlI = (byte)llllllllllllIllIIIIlIIIlIllIlIll.length;
        Exception llllllllllllIllIIIIlIIIlIllIlIIl = (Exception)ColorEffect.lllIIIIllIllIl[0];
        while (lIIlllIIlllIlIIl((int)llllllllllllIllIIIIlIIIlIllIlIIl, llllllllllllIllIIIIlIIIlIllIlIlI)) {
            final char llllllllllllIllIIIIlIIIlIlllIllI = llllllllllllIllIIIIlIIIlIllIlIll[llllllllllllIllIIIIlIIIlIllIlIIl];
            llllllllllllIllIIIIlIIIlIlllIIll.append((char)(llllllllllllIllIIIIlIIIlIlllIllI ^ llllllllllllIllIIIIlIIIlIlllIIlI[llllllllllllIllIIIIlIIIlIlllIIIl % llllllllllllIllIIIIlIIIlIlllIIlI.length]));
            "".length();
            ++llllllllllllIllIIIIlIIIlIlllIIIl;
            ++llllllllllllIllIIIIlIIIlIllIlIIl;
            "".length();
            if (" ".length() == ((0xA2 ^ 0xAD) & ~(0x7F ^ 0x70))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIIIlIlllIIll);
    }
    
    public ColorEffect() {
        this.color = Color.white;
    }
    
    public void setValues(final List llllllllllllIllIIIIlIIIllIIllllI) {
        final Iterator llllllllllllIllIIIIlIIIllIlIIIII = llllllllllllIllIIIIlIIIllIIllllI.iterator();
        while (lIIlllIIlllIlIII(llllllllllllIllIIIIlIIIllIlIIIII.hasNext() ? 1 : 0)) {
            final Value llllllllllllIllIIIIlIIIllIlIIIIl = llllllllllllIllIIIIlIIIllIlIIIII.next();
            if (lIIlllIIlllIlIII(llllllllllllIllIIIIlIIIllIlIIIIl.getName().equals(ColorEffect.lllIIIIllIlIll[ColorEffect.lllIIIIllIllIl[3]]) ? 1 : 0)) {
                this.setColor((Color)llllllllllllIllIIIIlIIIllIlIIIIl.getObject());
            }
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
    }
    
    public void setColor(final Color llllllllllllIllIIIIlIIIllIlIllIl) {
        if (lIIlllIIlllIIlll(llllllllllllIllIIIIlIIIllIlIllIl)) {
            throw new IllegalArgumentException(ColorEffect.lllIIIIllIlIll[ColorEffect.lllIIIIllIllIl[0]]);
        }
        this.color = llllllllllllIllIIIIlIIIllIlIllIl;
    }
    
    private static String lIIlllIIllIlllII(final String llllllllllllIllIIIIlIIIllIIlIIlI, final String llllllllllllIllIIIIlIIIllIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIIllIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIlIIIllIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIlIIIllIIlIlII.init(ColorEffect.lllIIIIllIllIl[2], llllllllllllIllIIIIlIIIllIIlIlIl);
            return new String(llllllllllllIllIIIIlIIIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIIllIIlIIll) {
            llllllllllllIllIIIIlIIIllIIlIIll.printStackTrace();
            return null;
        }
    }
    
    public List getValues() {
        final List llllllllllllIllIIIIlIIIllIlIlIII = new ArrayList();
        llllllllllllIllIIIIlIIIllIlIlIII.add(EffectUtil.colorValue(ColorEffect.lllIIIIllIlIll[ColorEffect.lllIIIIllIllIl[2]], this.color));
        "".length();
        return llllllllllllIllIIIIlIIIllIlIlIII;
    }
}
