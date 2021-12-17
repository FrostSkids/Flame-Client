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
import java.awt.image.ConvolveOp;
import java.awt.RenderingHints;
import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.awt.Composite;
import java.awt.AlphaComposite;
import org.newdawn.slick.font.Glyph;
import org.newdawn.slick.UnicodeFont;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class ShadowEffect implements ConfigurableEffect
{
    private /* synthetic */ float opacity;
    private /* synthetic */ float yDistance;
    public static final /* synthetic */ float[][] GAUSSIAN_BLUR_KERNELS;
    private /* synthetic */ Color color;
    private /* synthetic */ float xDistance;
    private static final /* synthetic */ String[] lIIllllIlIIlIl;
    private /* synthetic */ int blurPasses;
    private static final /* synthetic */ int[] lIIllllIlIIlll;
    private /* synthetic */ int blurKernelSize;
    
    public void setBlurKernelSize(final int lllllllllllllIIlIIlIlIlIIIIlIIlI) {
        this.blurKernelSize = lllllllllllllIIlIIlIlIlIIIIlIIlI;
    }
    
    @Override
    public String toString() {
        return ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[0]];
    }
    
    private static float[][] generatePascalsTriangle(int lllllllllllllIIlIIlIlIIlllIIIlIl) {
        if (llIlllIllllllIl((int)lllllllllllllIIlIIlIlIIlllIIIlIl, ShadowEffect.lIIllllIlIIlll[3])) {
            lllllllllllllIIlIIlIlIIlllIIIlIl = ShadowEffect.lIIllllIlIIlll[3];
        }
        final float[][] lllllllllllllIIlIIlIlIIlllIIIllI = new float[lllllllllllllIIlIIlIlIIlllIIIlIl][];
        lllllllllllllIIlIIlIlIIlllIIIllI[ShadowEffect.lIIllllIlIIlll[0]] = new float[ShadowEffect.lIIllllIlIIlll[1]];
        lllllllllllllIIlIIlIlIIlllIIIllI[ShadowEffect.lIIllllIlIIlll[1]] = new float[ShadowEffect.lIIllllIlIIlll[3]];
        lllllllllllllIIlIIlIlIIlllIIIllI[ShadowEffect.lIIllllIlIIlll[0]][ShadowEffect.lIIllllIlIIlll[0]] = 1.0f;
        lllllllllllllIIlIIlIlIIlllIIIllI[ShadowEffect.lIIllllIlIIlll[1]][ShadowEffect.lIIllllIlIIlll[0]] = 1.0f;
        lllllllllllllIIlIIlIlIIlllIIIllI[ShadowEffect.lIIllllIlIIlll[1]][ShadowEffect.lIIllllIlIIlll[1]] = 1.0f;
        int lllllllllllllIIlIIlIlIIlllIIlIII = ShadowEffect.lIIllllIlIIlll[3];
        while (llIlllIllllllIl(lllllllllllllIIlIIlIlIIlllIIlIII, (int)lllllllllllllIIlIIlIlIIlllIIIlIl)) {
            (lllllllllllllIIlIIlIlIIlllIIIllI[lllllllllllllIIlIIlIlIIlllIIlIII] = new float[lllllllllllllIIlIIlIlIIlllIIlIII + ShadowEffect.lIIllllIlIIlll[1]])[ShadowEffect.lIIllllIlIIlll[0]] = 1.0f;
            lllllllllllllIIlIIlIlIIlllIIIllI[lllllllllllllIIlIIlIlIIlllIIlIII][lllllllllllllIIlIIlIlIIlllIIlIII] = 1.0f;
            int lllllllllllllIIlIIlIlIIlllIIlIIl = ShadowEffect.lIIllllIlIIlll[1];
            while (llIlllIllllllIl(lllllllllllllIIlIIlIlIIlllIIlIIl, lllllllllllllIIlIIlIlIIlllIIIllI[lllllllllllllIIlIIlIlIIlllIIlIII].length - ShadowEffect.lIIllllIlIIlll[1])) {
                lllllllllllllIIlIIlIlIIlllIIIllI[lllllllllllllIIlIIlIlIIlllIIlIII][lllllllllllllIIlIIlIlIIlllIIlIIl] = lllllllllllllIIlIIlIlIIlllIIIllI[lllllllllllllIIlIIlIlIIlllIIlIII - ShadowEffect.lIIllllIlIIlll[1]][lllllllllllllIIlIIlIlIIlllIIlIIl - ShadowEffect.lIIllllIlIIlll[1]] + lllllllllllllIIlIIlIlIIlllIIIllI[lllllllllllllIIlIIlIlIIlllIIlIII - ShadowEffect.lIIllllIlIIlll[1]][lllllllllllllIIlIIlIlIIlllIIlIIl];
                ++lllllllllllllIIlIIlIlIIlllIIlIIl;
                "".length();
                if ("   ".length() < -" ".length()) {
                    return null;
                }
            }
            ++lllllllllllllIIlIIlIlIIlllIIlIII;
            "".length();
            if ((0x37 ^ 0x32) == 0x0) {
                return null;
            }
        }
        return lllllllllllllIIlIIlIlIIlllIIIllI;
    }
    
    private static boolean llIlllIllllllIl(final int lllllllllllllIIlIIlIlIIllIIIllIl, final int lllllllllllllIIlIIlIlIIllIIIllII) {
        return lllllllllllllIIlIIlIlIIllIIIllIl < lllllllllllllIIlIIlIlIIllIIIllII;
    }
    
    public void draw(final BufferedImage lllllllllllllIIlIIlIlIlIIlIlllIl, Graphics2D lllllllllllllIIlIIlIlIlIIlIlIlll, final UnicodeFont lllllllllllllIIlIIlIlIlIIlIllIll, final Glyph lllllllllllllIIlIIlIlIlIIlIllIlI) {
        lllllllllllllIIlIIlIlIlIIlIlIlll = (Graphics2D)lllllllllllllIIlIIlIlIlIIlIlIlll.create();
        lllllllllllllIIlIIlIlIlIIlIlIlll.translate(this.xDistance, this.yDistance);
        lllllllllllllIIlIIlIlIlIIlIlIlll.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), Math.round(this.opacity * 255.0f)));
        lllllllllllllIIlIIlIlIlIIlIlIlll.fill(lllllllllllllIIlIIlIlIlIIlIllIlI.getShape());
        final Iterator lllllllllllllIIlIIlIlIlIIlIlllll = lllllllllllllIIlIIlIlIlIIlIllIll.getEffects().iterator();
        while (llIlllIlllllIll(lllllllllllllIIlIIlIlIlIIlIlllll.hasNext() ? 1 : 0)) {
            final Effect lllllllllllllIIlIIlIlIlIIllIIIII = lllllllllllllIIlIIlIlIlIIlIlllll.next();
            if (llIlllIlllllIll((lllllllllllllIIlIIlIlIlIIllIIIII instanceof OutlineEffect) ? 1 : 0)) {
                final Composite lllllllllllllIIlIIlIlIlIIllIIIIl = lllllllllllllIIlIIlIlIlIIlIlIlll.getComposite();
                lllllllllllllIIlIIlIlIlIIlIlIlll.setComposite(AlphaComposite.Src);
                lllllllllllllIIlIIlIlIlIIlIlIlll.setStroke(((OutlineEffect)lllllllllllllIIlIIlIlIlIIllIIIII).getStroke());
                lllllllllllllIIlIIlIlIlIIlIlIlll.draw(lllllllllllllIIlIIlIlIlIIlIllIlI.getShape());
                lllllllllllllIIlIIlIlIlIIlIlIlll.setComposite(lllllllllllllIIlIIlIlIlIIllIIIIl);
                "".length();
                if (((0xB0 ^ 0x82) & ~(0x86 ^ 0xB4)) < 0) {
                    return;
                }
                break;
            }
            else {
                "".length();
                if ((40 + 101 - 134 + 166 ^ 133 + 48 - 100 + 87) <= 0) {
                    return;
                }
                continue;
            }
        }
        lllllllllllllIIlIIlIlIlIIlIlIlll.dispose();
        if (llIlllIllllllII(this.blurKernelSize, ShadowEffect.lIIllllIlIIlll[1]) && llIlllIllllllIl(this.blurKernelSize, ShadowEffect.lIIllllIlIIlll[2]) && llIlllIlllllllI(this.blurPasses)) {
            this.blur(lllllllllllllIIlIIlIlIlIIlIlllIl);
        }
    }
    
    private static float[][] generateGaussianBlurKernels(final int lllllllllllllIIlIIlIlIIlllIlIlII) {
        final float[][] lllllllllllllIIlIIlIlIIlllIlIllI = generatePascalsTriangle(lllllllllllllIIlIIlIlIIlllIlIlII);
        final float[][] lllllllllllllIIlIIlIlIIlllIlIlIl = new float[lllllllllllllIIlIIlIlIIlllIlIllI.length][];
        int lllllllllllllIIlIIlIlIIlllIllIII = ShadowEffect.lIIllllIlIIlll[0];
        while (llIlllIllllllIl(lllllllllllllIIlIIlIlIIlllIllIII, lllllllllllllIIlIIlIlIIlllIlIlIl.length)) {
            float lllllllllllllIIlIIlIlIIlllIllIlI = 0.0f;
            lllllllllllllIIlIIlIlIIlllIlIlIl[lllllllllllllIIlIIlIlIIlllIllIII] = new float[lllllllllllllIIlIIlIlIIlllIlIllI[lllllllllllllIIlIIlIlIIlllIllIII].length];
            int lllllllllllllIIlIIlIlIIlllIlllII = ShadowEffect.lIIllllIlIIlll[0];
            while (llIlllIllllllIl(lllllllllllllIIlIIlIlIIlllIlllII, lllllllllllllIIlIIlIlIIlllIlIllI[lllllllllllllIIlIIlIlIIlllIllIII].length)) {
                lllllllllllllIIlIIlIlIIlllIllIlI += lllllllllllllIIlIIlIlIIlllIlIllI[lllllllllllllIIlIIlIlIIlllIllIII][lllllllllllllIIlIIlIlIIlllIlllII];
                ++lllllllllllllIIlIIlIlIIlllIlllII;
                "".length();
                if ("   ".length() > (0x6 ^ 0x6B ^ (0x79 ^ 0x10))) {
                    return null;
                }
            }
            final float lllllllllllllIIlIIlIlIIlllIllIIl = 1.0f / lllllllllllllIIlIIlIlIIlllIllIlI;
            int lllllllllllllIIlIIlIlIIlllIllIll = ShadowEffect.lIIllllIlIIlll[0];
            while (llIlllIllllllIl(lllllllllllllIIlIIlIlIIlllIllIll, lllllllllllllIIlIIlIlIIlllIlIllI[lllllllllllllIIlIIlIlIIlllIllIII].length)) {
                lllllllllllllIIlIIlIlIIlllIlIlIl[lllllllllllllIIlIIlIlIIlllIllIII][lllllllllllllIIlIIlIlIIlllIllIll] = lllllllllllllIIlIIlIlIIlllIllIIl * lllllllllllllIIlIIlIlIIlllIlIllI[lllllllllllllIIlIIlIlIIlllIllIII][lllllllllllllIIlIIlIlIIlllIllIll];
                ++lllllllllllllIIlIIlIlIIlllIllIll;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            ++lllllllllllllIIlIIlIlIIlllIllIII;
            "".length();
            if (" ".length() < ((0x79 ^ 0x2A) & ~(0xB ^ 0x58))) {
                return null;
            }
        }
        return lllllllllllllIIlIIlIlIIlllIlIlIl;
    }
    
    public int getBlurKernelSize() {
        return this.blurKernelSize;
    }
    
    private static boolean llIlllIlllllllI(final int lllllllllllllIIlIIlIlIIllIIIIlII) {
        return lllllllllllllIIlIIlIlIIllIIIIlII > 0;
    }
    
    public ShadowEffect(final Color lllllllllllllIIlIIlIlIlIIllIllIl, final int lllllllllllllIIlIIlIlIlIIlllIIIl, final int lllllllllllllIIlIIlIlIlIIllIlIll, final float lllllllllllllIIlIIlIlIlIIllIllll) {
        this.color = Color.black;
        this.opacity = 0.6f;
        this.xDistance = 2.0f;
        this.yDistance = 2.0f;
        this.blurKernelSize = ShadowEffect.lIIllllIlIIlll[0];
        this.blurPasses = ShadowEffect.lIIllllIlIIlll[1];
        this.color = lllllllllllllIIlIIlIlIlIIllIllIl;
        this.xDistance = (float)lllllllllllllIIlIIlIlIlIIlllIIIl;
        this.yDistance = (float)lllllllllllllIIlIIlIlIlIIllIlIll;
        this.opacity = lllllllllllllIIlIIlIlIlIIllIllll;
    }
    
    public void setOpacity(final float lllllllllllllIIlIIlIlIlIIIIIIIII) {
        this.opacity = lllllllllllllIIlIIlIlIlIIIIIIIII;
    }
    
    public void setColor(final Color lllllllllllllIIlIIlIlIlIIIlIllIl) {
        this.color = lllllllllllllIIlIIlIlIlIIIlIllIl;
    }
    
    public List getValues() {
        final List lllllllllllllIIlIIlIlIIlllllIllI = new ArrayList();
        lllllllllllllIIlIIlIlIIlllllIllI.add(EffectUtil.colorValue(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[1]], this.color));
        "".length();
        lllllllllllllIIlIIlIlIIlllllIllI.add(EffectUtil.floatValue(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[3]], this.opacity, 0.0f, 1.0f, ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[4]]));
        "".length();
        lllllllllllllIIlIIlIlIIlllllIllI.add(EffectUtil.floatValue(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[5]], this.xDistance, Float.MIN_VALUE, Float.MAX_VALUE, ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[6]]));
        "".length();
        lllllllllllllIIlIIlIlIIlllllIllI.add(EffectUtil.floatValue(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[7]], this.yDistance, Float.MIN_VALUE, Float.MAX_VALUE, ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[8]]));
        "".length();
        final ArrayList<String[]> list;
        final List lllllllllllllIIlIIlIlIIlllllIlIl = list = new ArrayList<String[]>();
        final String[] array = new String[ShadowEffect.lIIllllIlIIlll[3]];
        array[ShadowEffect.lIIllllIlIIlll[0]] = ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[9]];
        array[ShadowEffect.lIIllllIlIIlll[1]] = ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[10]];
        list.add(array);
        "".length();
        int lllllllllllllIIlIIlIlIIllllllIII = ShadowEffect.lIIllllIlIIlll[3];
        while (llIlllIllllllIl(lllllllllllllIIlIIlIlIIllllllIII, ShadowEffect.lIIllllIlIIlll[2])) {
            final List list2 = lllllllllllllIIlIIlIlIIlllllIlIl;
            final String[] array2 = new String[ShadowEffect.lIIllllIlIIlll[1]];
            array2[ShadowEffect.lIIllllIlIIlll[0]] = String.valueOf(lllllllllllllIIlIIlIlIIllllllIII);
            list2.add(array2);
            "".length();
            ++lllllllllllllIIlIIlIlIIllllllIII;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        final String[][] lllllllllllllIIlIIlIlIIlllllIlII = lllllllllllllIIlIIlIlIIlllllIlIl.toArray(new String[lllllllllllllIIlIIlIlIIlllllIlIl.size()][]);
        lllllllllllllIIlIIlIlIIlllllIllI.add(EffectUtil.optionValue(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[11]], String.valueOf(this.blurKernelSize), lllllllllllllIIlIIlIlIIlllllIlII, ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[12]]));
        "".length();
        lllllllllllllIIlIIlIlIIlllllIllI.add(EffectUtil.intValue(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[13]], this.blurPasses, ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[14]]));
        "".length();
        return lllllllllllllIIlIIlIlIIlllllIllI;
    }
    
    private void blur(final BufferedImage lllllllllllllIIlIIlIlIlIIIllllII) {
        final float[] lllllllllllllIIlIIlIlIlIIlIIIlII = ShadowEffect.GAUSSIAN_BLUR_KERNELS[this.blurKernelSize - ShadowEffect.lIIllllIlIIlll[1]];
        final Kernel lllllllllllllIIlIIlIlIlIIlIIIIll = new Kernel(lllllllllllllIIlIIlIlIlIIlIIIlII.length, ShadowEffect.lIIllllIlIIlll[1], lllllllllllllIIlIIlIlIlIIlIIIlII);
        final Kernel lllllllllllllIIlIIlIlIlIIlIIIIlI = new Kernel(ShadowEffect.lIIllllIlIIlll[1], lllllllllllllIIlIIlIlIlIIlIIIlII.length, lllllllllllllIIlIIlIlIlIIlIIIlII);
        final RenderingHints lllllllllllllIIlIIlIlIlIIlIIIIIl = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
        final ConvolveOp lllllllllllllIIlIIlIlIlIIlIIIIII = new ConvolveOp(lllllllllllllIIlIIlIlIlIIlIIIIll, ShadowEffect.lIIllllIlIIlll[1], lllllllllllllIIlIIlIlIlIIlIIIIIl);
        final ConvolveOp lllllllllllllIIlIIlIlIlIIIllllll = new ConvolveOp(lllllllllllllIIlIIlIlIlIIlIIIIlI, ShadowEffect.lIIllllIlIIlll[1], lllllllllllllIIlIIlIlIlIIlIIIIIl);
        final BufferedImage lllllllllllllIIlIIlIlIlIIIlllllI = EffectUtil.getScratchImage();
        int lllllllllllllIIlIIlIlIlIIlIIIlll = ShadowEffect.lIIllllIlIIlll[0];
        while (llIlllIllllllIl(lllllllllllllIIlIIlIlIlIIlIIIlll, this.blurPasses)) {
            lllllllllllllIIlIIlIlIlIIlIIIIII.filter(lllllllllllllIIlIIlIlIlIIIllllII, lllllllllllllIIlIIlIlIlIIIlllllI);
            "".length();
            lllllllllllllIIlIIlIlIlIIIllllll.filter(lllllllllllllIIlIIlIlIlIIIlllllI, lllllllllllllIIlIIlIlIlIIIllllII);
            "".length();
            ++lllllllllllllIIlIIlIlIlIIlIIIlll;
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
    }
    
    public void setValues(final List lllllllllllllIIlIIlIlIIllllIIllI) {
        final Iterator lllllllllllllIIlIIlIlIIllllIlIlI = lllllllllllllIIlIIlIlIIllllIIllI.iterator();
        while (llIlllIlllllIll(lllllllllllllIIlIIlIlIIllllIlIlI.hasNext() ? 1 : 0)) {
            final Value lllllllllllllIIlIIlIlIIllllIlIll = lllllllllllllIIlIIlIlIIllllIlIlI.next();
            if (llIlllIlllllIll(lllllllllllllIIlIIlIlIIllllIlIll.getName().equals(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[15]]) ? 1 : 0)) {
                this.color = (Color)lllllllllllllIIlIIlIlIIllllIlIll.getObject();
                "".length();
                if ((0x1C ^ 0x18) <= " ".length()) {
                    return;
                }
            }
            else if (llIlllIlllllIll(lllllllllllllIIlIIlIlIIllllIlIll.getName().equals(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[16]]) ? 1 : 0)) {
                this.opacity = (float)lllllllllllllIIlIIlIlIIllllIlIll.getObject();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIlllIlllllIll(lllllllllllllIIlIIlIlIIllllIlIll.getName().equals(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[2]]) ? 1 : 0)) {
                this.xDistance = (float)lllllllllllllIIlIIlIlIIllllIlIll.getObject();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIlllIlllllIll(lllllllllllllIIlIIlIlIIllllIlIll.getName().equals(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[17]]) ? 1 : 0)) {
                this.yDistance = (float)lllllllllllllIIlIIlIlIIllllIlIll.getObject();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIlllIlllllIll(lllllllllllllIIlIIlIlIIllllIlIll.getName().equals(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[18]]) ? 1 : 0)) {
                this.blurKernelSize = Integer.parseInt((String)lllllllllllllIIlIIlIlIIllllIlIll.getObject());
                "".length();
                if (((0x4C ^ 0x65) & ~(0x3E ^ 0x17)) >= "  ".length()) {
                    return;
                }
            }
            else if (llIlllIlllllIll(lllllllllllllIIlIIlIlIIllllIlIll.getName().equals(ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[19]]) ? 1 : 0)) {
                this.blurPasses = (int)lllllllllllllIIlIIlIlIIllllIlIll.getObject();
            }
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
    }
    
    private static String llIlllIllllIIII(final String lllllllllllllIIlIIlIlIIllIIlIIll, final String lllllllllllllIIlIIlIlIIllIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlIIllIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIlIIllIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIlIIllIIlIlll.init(ShadowEffect.lIIllllIlIIlll[3], lllllllllllllIIlIIlIlIIllIIllIII);
            return new String(lllllllllllllIIlIIlIlIIllIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlIIllIIlIllI) {
            lllllllllllllIIlIIlIlIIllIIlIllI.printStackTrace();
            return null;
        }
    }
    
    public float getYDistance() {
        return this.yDistance;
    }
    
    private static void llIlllIlllllIIl() {
        (lIIllllIlIIlIl = new String[ShadowEffect.lIIllllIlIIlll[20]])[ShadowEffect.lIIllllIlIIlll[0]] = llIlllIlllIllll("Rya9lFS4/Qk=", "OKBEQ");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[1]] = llIlllIlllIllll("emMwINyJ678=", "AzJUc");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[3]] = llIlllIlllIllll("KmtNGKEzNks=", "jqMhS");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[4]] = llIlllIllllIIII("53bqqwxK1GDXX6sPdO3tMq2DPEE4AMtgOZruYkN8zpv0enONChARucV5qtRUitv0qCY3aZxVW1g=", "lnsOu");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[5]] = llIlllIllllIIIl("AEYyPCcsBzg2MQ==", "XfVUT");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[6]] = llIlllIllllIIIl("DjA+JWEpPSMiKDQ/dz8yeiw/M2E7NTgjLy54ODBhKjEvMy0peCM5YTU+MSUkLngjPiR6Kz83JTUvdzkveiw/M2EieDYuKCl2dwIpP3gwOjgqMCR2NjM0O3YvPz0zdjE7PDM/Lz14JDlhLjAydjIyOTM5Nno8ODMyNH8jdiY/LHc1LTMoJzMldA==", "ZXWVA");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[7]] = llIlllIlllIllll("RwkrJZnegUbFQKL3XaufZw==", "CHJjx");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[8]] = llIlllIllllIIII("pRnv95gu7YyEee1X1YLa8Hi6hC2sfKys/y0oU8+S40rcexe/HbF1EiwWJBOgDk0NMvGB9YjqAkKYQE4PTopFmRCvuRCW0WW4oidvaJTzzeXz/8sLrXCOq/a1mSFfXt+lyreg+XPayGhJNMixI4SDGtIbURZrnWzgMc5M4mjczifcYcXYcSgYyewUfvXX9uCJ", "rRXtg");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[9]] = llIlllIllllIIIl("BBoIFA==", "JufqQ");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[10]] = llIlllIllllIIIl("Sg==", "zaTbN");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[11]] = llIlllIllllIIIl("LiQUOVUHLRMlEABoEiIPCQ==", "lHaKu");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[12]] = llIlllIlllIllll("HcOjDKUcosf0BciBwPMC+zvXcqmN+jtwYAC2uk8WyX0xNqQDVnLoWjJkI67LlpTlvzYZ8p68dRbQ5tIz5/2hxzVTgWgsHKdndrse8OtRgSGyh50DJy6fSOoGnNy3LNGnBFgTi4BPxhGoOrd+u/vAxA==", "fxkSF");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[13]] = llIlllIllllIIIl("EyknGWohJCEYLyI=", "QERkJ");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[14]] = llIlllIlllIllll("4Y7nCbDtf9B9UN8sWaCuWM4o36mnx35GsKLlu31TNGRH53biCYjz1y0riWmWj9+G6h+oUGULg4kqZgs5/Ubqh0m19TxeZ5c1qbLKPFysnj7TeZ8nh6p/fdkABOG98vwl", "AvKgA");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[15]] = llIlllIllllIIIl("FQs2GDk=", "VdZwK");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[16]] = llIlllIllllIIIl("LjgkJTsVMQ==", "aHEFR");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[2]] = llIlllIlllIllll("zVFGbX75dOTMbwhY9PwmSA==", "tXQBx");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[17]] = llIlllIlllIllll("5v/Hczu+9BxK7+t5YSugDw==", "inXey");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[18]] = llIlllIllllIIIl("KA4lIVYBByI9EwZCIzoMDw==", "jbPSv");
        ShadowEffect.lIIllllIlIIlIl[ShadowEffect.lIIllllIlIIlll[19]] = llIlllIllllIIIl("Cho3N284FzE2Kjs=", "HvBEO");
    }
    
    private static boolean llIlllIllllllII(final int lllllllllllllIIlIIlIlIIllIIIlIIl, final int lllllllllllllIIlIIlIlIIllIIIlIII) {
        return lllllllllllllIIlIIlIlIIllIIIlIIl > lllllllllllllIIlIIlIlIIllIIIlIII;
    }
    
    public ShadowEffect() {
        this.color = Color.black;
        this.opacity = 0.6f;
        this.xDistance = 2.0f;
        this.yDistance = 2.0f;
        this.blurKernelSize = ShadowEffect.lIIllllIlIIlll[0];
        this.blurPasses = ShadowEffect.lIIllllIlIIlll[1];
    }
    
    public float getOpacity() {
        return this.opacity;
    }
    
    public float getXDistance() {
        return this.xDistance;
    }
    
    private static void llIlllIlllllIlI() {
        (lIIllllIlIIlll = new int[21])[0] = ((99 + 96 - 116 + 83 ^ 44 + 157 - 69 + 61) & (0x7B ^ 0x40 ^ (0x46 ^ 0x1E) ^ -" ".length()));
        ShadowEffect.lIIllllIlIIlll[1] = " ".length();
        ShadowEffect.lIIllllIlIIlll[2] = (0x3A ^ 0x2A);
        ShadowEffect.lIIllllIlIIlll[3] = "  ".length();
        ShadowEffect.lIIllllIlIIlll[4] = "   ".length();
        ShadowEffect.lIIllllIlIIlll[5] = (0x76 ^ 0x72);
        ShadowEffect.lIIllllIlIIlll[6] = (0x1C ^ 0x17 ^ (0x12 ^ 0x1C));
        ShadowEffect.lIIllllIlIIlll[7] = (0x8B ^ 0x8D);
        ShadowEffect.lIIllllIlIIlll[8] = (0x74 ^ 0x6D ^ (0x6B ^ 0x75));
        ShadowEffect.lIIllllIlIIlll[9] = (0x4B ^ 0x43);
        ShadowEffect.lIIllllIlIIlll[10] = (0x5 ^ 0xC);
        ShadowEffect.lIIllllIlIIlll[11] = (27 + 94 - 97 + 166 ^ 106 + 64 - 160 + 170);
        ShadowEffect.lIIllllIlIIlll[12] = (10 + 66 + 50 + 6 ^ 24 + 94 + 4 + 21);
        ShadowEffect.lIIllllIlIIlll[13] = (0x25 ^ 0x29);
        ShadowEffect.lIIllllIlIIlll[14] = (62 + 57 - 37 + 60 ^ 88 + 116 - 180 + 107);
        ShadowEffect.lIIllllIlIIlll[15] = (0xE ^ 0x1F ^ (0x2 ^ 0x1D));
        ShadowEffect.lIIllllIlIIlll[16] = (0x7E ^ 0x12 ^ (0x4B ^ 0x28));
        ShadowEffect.lIIllllIlIIlll[17] = (0x1C ^ 0x5F ^ (0xE4 ^ 0xB6));
        ShadowEffect.lIIllllIlIIlll[18] = (0x26 ^ 0x7A ^ (0xC1 ^ 0x8F));
        ShadowEffect.lIIllllIlIIlll[19] = (0x9C ^ 0x8F);
        ShadowEffect.lIIllllIlIIlll[20] = (0x63 ^ 0x28 ^ (0xC ^ 0x53));
    }
    
    public void setBlurPasses(final int lllllllllllllIIlIIlIlIlIIIIIIlll) {
        this.blurPasses = lllllllllllllIIlIIlIlIlIIIIIIlll;
    }
    
    private static String llIlllIllllIIIl(String lllllllllllllIIlIIlIlIIllIlIIlIl, final String lllllllllllllIIlIIlIlIIllIlIIlII) {
        lllllllllllllIIlIIlIlIIllIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIlIIllIlIlIII = new StringBuilder();
        final char[] lllllllllllllIIlIIlIlIIllIlIIlll = lllllllllllllIIlIIlIlIIllIlIIlII.toCharArray();
        int lllllllllllllIIlIIlIlIIllIlIIllI = ShadowEffect.lIIllllIlIIlll[0];
        final char lllllllllllllIIlIIlIlIIllIlIIIII = (Object)lllllllllllllIIlIIlIlIIllIlIIlIl.toCharArray();
        final short lllllllllllllIIlIIlIlIIllIIlllll = (short)lllllllllllllIIlIIlIlIIllIlIIIII.length;
        long lllllllllllllIIlIIlIlIIllIIllllI = ShadowEffect.lIIllllIlIIlll[0];
        while (llIlllIllllllIl((int)lllllllllllllIIlIIlIlIIllIIllllI, lllllllllllllIIlIIlIlIIllIIlllll)) {
            final char lllllllllllllIIlIIlIlIIllIlIlIll = lllllllllllllIIlIIlIlIIllIlIIIII[lllllllllllllIIlIIlIlIIllIIllllI];
            lllllllllllllIIlIIlIlIIllIlIlIII.append((char)(lllllllllllllIIlIIlIlIIllIlIlIll ^ lllllllllllllIIlIIlIlIIllIlIIlll[lllllllllllllIIlIIlIlIIllIlIIllI % lllllllllllllIIlIIlIlIIllIlIIlll.length]));
            "".length();
            ++lllllllllllllIIlIIlIlIIllIlIIllI;
            ++lllllllllllllIIlIIlIlIIllIIllllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIlIIllIlIlIII);
    }
    
    public int getBlurPasses() {
        return this.blurPasses;
    }
    
    private static String llIlllIlllIllll(final String lllllllllllllIIlIIlIlIIllIlllIlI, final String lllllllllllllIIlIIlIlIIllIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlIIllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), ShadowEffect.lIIllllIlIIlll[9]), "DES");
            final Cipher lllllllllllllIIlIIlIlIIllIllllII = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIlIIllIllllII.init(ShadowEffect.lIIllllIlIIlll[3], lllllllllllllIIlIIlIlIIllIllllIl);
            return new String(lllllllllllllIIlIIlIlIIllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlIIllIlllIll) {
            lllllllllllllIIlIIlIlIIllIlllIll.printStackTrace();
            return null;
        }
    }
    
    public void setXDistance(final float lllllllllllllIIlIIlIlIlIIIlIIlII) {
        this.xDistance = lllllllllllllIIlIIlIlIlIIIlIIlII;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    private static boolean llIlllIlllllIll(final int lllllllllllllIIlIIlIlIIllIIIIllI) {
        return lllllllllllllIIlIIlIlIIllIIIIllI != 0;
    }
    
    static {
        llIlllIlllllIlI();
        llIlllIlllllIIl();
        NUM_KERNELS = ShadowEffect.lIIllllIlIIlll[2];
        GAUSSIAN_BLUR_KERNELS = generateGaussianBlurKernels(ShadowEffect.lIIllllIlIIlll[2]);
    }
    
    public void setYDistance(final float lllllllllllllIIlIIlIlIlIIIIllIIl) {
        this.yDistance = lllllllllllllIIlIIlIlIlIIIIllIIl;
    }
}
