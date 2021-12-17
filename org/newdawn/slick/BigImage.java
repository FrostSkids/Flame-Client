// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.util.Arrays;
import org.newdawn.slick.opengl.ImageData;
import java.io.IOException;
import org.newdawn.slick.util.ResourceLoader;
import org.newdawn.slick.opengl.ImageDataFactory;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import org.newdawn.slick.opengl.LoadableImageData;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.util.OperationNotSupportedException;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.renderer.SGL;

public class BigImage extends Image
{
    protected static /* synthetic */ SGL GL;
    private static final /* synthetic */ String[] lIllllllllllIl;
    private static /* synthetic */ Image lastBind;
    private /* synthetic */ int realWidth;
    private /* synthetic */ int xcount;
    private /* synthetic */ int ycount;
    private /* synthetic */ Image[][] images;
    private static final /* synthetic */ int[] lIlllllllllllI;
    private /* synthetic */ int realHeight;
    
    @Override
    public Image getScaledCopy(final float llllllllllllIllllIIIlIIIIlIIIIIl) {
        return this.getScaledCopy((int)(llllllllllllIllllIIIlIIIIlIIIIIl * this.width), (int)(llllllllllllIllllIIIlIIIIlIIIIIl * this.height));
    }
    
    private static boolean lIIIIllIIllIlllI(final int llllllllllllIllllIIIIlllIIlllllI, final int llllllllllllIllllIIIIlllIIllllIl) {
        return llllllllllllIllllIIIIlllIIlllllI <= llllllllllllIllllIIIIlllIIllllIl;
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIIlllIIIlI, final float llllllllllllIllllIIIlIIIlllIlIlI, final float llllllllllllIllllIIIlIIIlllIIIII, final float llllllllllllIllllIIIlIIIlllIlIII, final float llllllllllllIllllIIIlIIIlllIIlll, final float llllllllllllIllllIIIlIIIlllIIllI) {
        final int llllllllllllIllllIIIlIIIlllIIlIl = (int)(llllllllllllIllllIIIlIIIlllIIlll - llllllllllllIllllIIIlIIIlllIIIII);
        final int llllllllllllIllllIIIlIIIlllIIlII = (int)(llllllllllllIllllIIIlIIIlllIIllI - llllllllllllIllllIIIlIIIlllIlIII);
        this.draw(llllllllllllIllllIIIlIIIlllIIIlI, llllllllllllIllllIIIlIIIlllIlIlI, (float)llllllllllllIllllIIIlIIIlllIIlIl, (float)llllllllllllIllllIIIlIIIlllIIlII, llllllllllllIllllIIIlIIIlllIIIII, llllllllllllIllllIIIlIIIlllIlIII, llllllllllllIllllIIIlIIIlllIIlll, llllllllllllIllllIIIlIIIlllIIllI);
    }
    
    @Override
    public void draw() {
        this.draw(0.0f, 0.0f);
    }
    
    private static boolean lIIIIllIIlllIIll(final int llllllllllllIllllIIIIlllIIllIlIl) {
        return llllllllllllIllllIIIIlllIIllIlIl != 0;
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIIllIIIllI, final float llllllllllllIllllIIIlIIIllIIIIIl, final float llllllllllllIllllIIIlIIIllIIIlII) {
        this.draw(llllllllllllIllllIIIlIIIllIIIllI, llllllllllllIllllIIIlIIIllIIIIIl, llllllllllllIllllIIIlIIIllIIIlII, Color.white);
    }
    
    @Override
    public void setTexture(final Texture llllllllllllIllllIIIIllllllIIlIl) {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[11]]);
    }
    
    @Override
    public void drawEmbedded(final float llllllllllllIllllIIIIllllIIIllIl, final float llllllllllllIllllIIIIllllIIIllII, final float llllllllllllIllllIIIIllllIIIlIll, final float llllllllllllIllllIIIIllllIIIlIlI, final float llllllllllllIllllIIIIllllIIIlIIl, final float llllllllllllIllllIIIIllllIIIlIII, final float llllllllllllIllllIIIIllllIIIIlll, final float llllllllllllIllllIIIIllllIIIIllI) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void bind() {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[3]]);
    }
    
    public Image getTile(final int llllllllllllIllllIIIlIIllIllllII, final int llllllllllllIllllIIIlIIllIlllllI) {
        return this.images[llllllllllllIllllIIIlIIllIllllII][llllllllllllIllllIIIlIIllIlllllI];
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIlIlIIllll, final float llllllllllllIllllIIIlIIlIlIIlIIl, final float llllllllllllIllllIIIlIIlIlIIlIII, final Color llllllllllllIllllIIIlIIlIlIIllII) {
        this.draw(llllllllllllIllllIIIlIIlIlIIllll, llllllllllllIllllIIIlIIlIlIIlIIl, this.width * llllllllllllIllllIIIlIIlIlIIlIII, this.height * llllllllllllIllllIIIlIIlIlIIlIII, llllllllllllIllllIIIlIIlIlIIllII);
    }
    
    private static boolean lIIIIllIIlllIIII(final int llllllllllllIllllIIIIlllIlIIIllI, final int llllllllllllIllllIIIIlllIlIIIlIl) {
        return llllllllllllIllllIIIIlllIlIIIllI == llllllllllllIllllIIIIlllIlIIIlIl;
    }
    
    @Override
    public void endUse() {
        if (lIIIIllIIlllIIIl(BigImage.lastBind)) {
            BigImage.lastBind.endUse();
        }
        BigImage.lastBind = null;
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIIllllIlllIII, final float llllllllllllIllllIIIIllllIlIlIII, final float llllllllllllIllllIIIIllllIllIllI, final float llllllllllllIllllIIIIllllIllIlIl, final float llllllllllllIllllIIIIllllIlIIlIl, final float llllllllllllIllllIIIIllllIllIIll, final float llllllllllllIllllIIIIllllIllIIlI, final float llllllllllllIllllIIIIllllIlIIIlI, final Color llllllllllllIllllIIIIllllIllIIII) {
        final int llllllllllllIllllIIIIllllIlIllll = (int)(llllllllllllIllllIIIIllllIllIIlI - llllllllllllIllllIIIIllllIlIIlIl);
        final int llllllllllllIllllIIIIllllIlIlllI = (int)(llllllllllllIllllIIIIllllIlIIIlI - llllllllllllIllllIIIIllllIllIIll);
        final Image llllllllllllIllllIIIIllllIlIllIl = this.getSubImage((int)llllllllllllIllllIIIIllllIlIIlIl, (int)llllllllllllIllllIIIIllllIllIIll, llllllllllllIllllIIIIllllIlIllll, llllllllllllIllllIIIIllllIlIlllI);
        final int llllllllllllIllllIIIIllllIlIllII = (int)(llllllllllllIllllIIIIllllIllIllI - llllllllllllIllllIIIIllllIlllIII);
        final int llllllllllllIllllIIIIllllIlIlIll = (int)(llllllllllllIllllIIIIllllIllIlIl - llllllllllllIllllIIIIllllIlIlIII);
        llllllllllllIllllIIIIllllIlIllIl.draw(llllllllllllIllllIIIIllllIlllIII, llllllllllllIllllIIIIllllIlIlIII, (float)llllllllllllIllllIIIIllllIlIllII, (float)llllllllllllIllllIIIIllllIlIlIll, llllllllllllIllllIIIIllllIllIIII);
    }
    
    @Override
    public void startUse() {
    }
    
    @Override
    public void drawEmbedded(final float llllllllllllIllllIIIIllllIIlIlll, final float llllllllllllIllllIIIIllllIIlIllI, final float llllllllllllIllllIIIIllllIIlIlIl, final float llllllllllllIllllIIIIllllIIlIlII, final float llllllllllllIllllIIIIllllIIlIIll, final float llllllllllllIllllIIIIllllIIlIIlI, final float llllllllllllIllllIIIIllllIIlIIIl, final float llllllllllllIllllIIIIllllIIlIIII, final Color llllllllllllIllllIIIIllllIIIllll) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String toString() {
        return BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[12]];
    }
    
    private static String lIIIIllIIllIlIIl(String llllllllllllIllllIIIIlllIlIllllI, final String llllllllllllIllllIIIIlllIllIIIlI) {
        llllllllllllIllllIIIIlllIlIllllI = new String(Base64.getDecoder().decode(llllllllllllIllllIIIIlllIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIIlllIllIIIIl = new StringBuilder();
        final char[] llllllllllllIllllIIIIlllIllIIIII = llllllllllllIllllIIIIlllIllIIIlI.toCharArray();
        int llllllllllllIllllIIIIlllIlIlllll = BigImage.lIlllllllllllI[2];
        final int llllllllllllIllllIIIIlllIlIllIIl = (Object)llllllllllllIllllIIIIlllIlIllllI.toCharArray();
        final String llllllllllllIllllIIIIlllIlIllIII = (String)llllllllllllIllllIIIIlllIlIllIIl.length;
        float llllllllllllIllllIIIIlllIlIlIlll = BigImage.lIlllllllllllI[2];
        while (lIIIIllIIllIllll((int)llllllllllllIllllIIIIlllIlIlIlll, (int)llllllllllllIllllIIIIlllIlIllIII)) {
            final char llllllllllllIllllIIIIlllIllIIlII = llllllllllllIllllIIIIlllIlIllIIl[llllllllllllIllllIIIIlllIlIlIlll];
            llllllllllllIllllIIIIlllIllIIIIl.append((char)(llllllllllllIllllIIIIlllIllIIlII ^ llllllllllllIllllIIIIlllIllIIIII[llllllllllllIllllIIIIlllIlIlllll % llllllllllllIllllIIIIlllIllIIIII.length]));
            "".length();
            ++llllllllllllIllllIIIIlllIlIlllll;
            ++llllllllllllIllllIIIIlllIlIlIlll;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIIlllIllIIIIl);
    }
    
    static {
        lIIIIllIIllIllIl();
        lIIIIllIIllIllII();
        BigImage.GL = Renderer.get();
    }
    
    @Override
    public void drawCentered(final float llllllllllllIllllIIIIllllIIllIlI, final float llllllllllllIllllIIIIllllIIllIIl) {
        throw new UnsupportedOperationException();
    }
    
    public BigImage(final String llllllllllllIllllIIIlIIllllIIlIl, final int llllllllllllIllllIIIlIIllllIIIII, final int llllllllllllIllllIIIlIIlllIlllll) throws SlickException {
        this.build(llllllllllllIllllIIIlIIllllIIlIl, llllllllllllIllllIIIlIIllllIIIII, llllllllllllIllllIIIlIIlllIlllll);
    }
    
    @Override
    public Texture getTexture() {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[9]]);
    }
    
    private static void lIIIIllIIllIllII() {
        (lIllllllllllIl = new String[BigImage.lIlllllllllllI[13]])[BigImage.lIlllllllllllI[2]] = lIIIIllIIllIlIIl("Pxs/GB8dWiIbWhUVNxBAWQ==", "yzVtz");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[3]] = lIIIIllIIllIlIlI("VORQjiFngSWBKHNXP0PaZMAe69OwhYs3qemidtx2MfU=", "LauQa");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[4]] = lIIIIllIIllIlIIl("AjIgbw1hMCE4AGExJy9ZKD4vLxwyczctDQ==", "ASNHy");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[6]] = lIIIIllIIllIlIlI("86Zk+6ERZ3yI1sX2u5zwgWpUMiztikmk4I3AVlUXZr5xxspqWk9UPw==", "bjSMf");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[7]] = lIIIIllIIllIlIIl("MSMLSj5SNxYIahArAk0jHyMCCDlSIxZNKAckAwg4AQ==", "rBemJ");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[8]] = lIIIIllIIllIlIlI("nLQMfug1lHcQqeVRPlDPrb7Aw0MADZpO04LVdHBy1T4oBRvCwIwj+ayV0FDm9KQX", "rgWXm");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[9]] = lIIIIllIIllIlIll("KQlc9uI69qpZJnvCCyp5vWhfAnCjBcllV+eclp23hY2wBXKh8D75xLCm5Hdtyzbz", "zQtnu");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[10]] = lIIIIllIIllIlIlI("bGkTuE6+FEra+x6ZQwTtp7Eeiqve0ejsmfttgELXcqo7cxUQ0vQMQ+KJH87UPBNM", "EdUoZ");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[5]] = lIIIIllIIllIlIlI("wA/x4QHqzba2ExQiNhxAjHhiyq+cn2jSwVGVV4o9Xoc1ECgZ+XkIusA6SVuBIpEX", "rmpeX");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[11]] = lIIIIllIIllIlIlI("IQbyJvNzZXvV1TGS61iksWg6rAzg+svaGu0P2waGDgiazV+2NGjX+UYrpGtePh6M", "NgpIW");
        BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[12]] = lIIIIllIIllIlIll("wL77mSSpmertJsPoKwkNgQ==", "grpQv");
    }
    
    public BigImage(final String llllllllllllIllllIIIlIIlllllIlII) throws SlickException {
        this(llllllllllllIllllIIIlIIlllllIlII, BigImage.lIlllllllllllI[4]);
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIlIIlIlIll, final float llllllllllllIllllIIIlIIlIIllIlII, final float llllllllllllIllllIIIlIIlIIllIIll, final float llllllllllllIllllIIIlIIlIIllIIlI, final Color llllllllllllIllllIIIlIIlIIllIIIl) {
        final float llllllllllllIllllIIIlIIlIIllIIII = llllllllllllIllllIIIlIIlIIllIIll / this.realWidth;
        final float llllllllllllIllllIIIlIIlIIlIllll = llllllllllllIllllIIIlIIlIIllIIlI / this.realHeight;
        BigImage.GL.glTranslatef(llllllllllllIllllIIIlIIlIIlIlIll, llllllllllllIllllIIIlIIlIIllIlII, 0.0f);
        BigImage.GL.glScalef(llllllllllllIllllIIIlIIlIIllIIII, llllllllllllIllllIIIlIIlIIlIllll, 1.0f);
        float llllllllllllIllllIIIlIIlIIlIlllI = 0.0f;
        float llllllllllllIllllIIIlIIlIIlIllIl = 0.0f;
        int llllllllllllIllllIIIlIIlIIllIlll = BigImage.lIlllllllllllI[2];
        while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIlIIllIlll, this.xcount)) {
            llllllllllllIllllIIIlIIlIIlIllIl = 0.0f;
            int llllllllllllIllllIIIlIIlIIlllIII = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIlIIlllIII, this.ycount)) {
                final Image llllllllllllIllllIIIlIIlIIlllIIl = this.images[llllllllllllIllllIIIlIIlIIllIlll][llllllllllllIllllIIIlIIlIIlllIII];
                llllllllllllIllllIIIlIIlIIlllIIl.draw(llllllllllllIllllIIIlIIlIIlIlllI, llllllllllllIllllIIIlIIlIIlIllIl, (float)llllllllllllIllllIIIlIIlIIlllIIl.getWidth(), (float)llllllllllllIllllIIIlIIlIIlllIIl.getHeight(), llllllllllllIllllIIIlIIlIIllIIIl);
                llllllllllllIllllIIIlIIlIIlIllIl += llllllllllllIllllIIIlIIlIIlllIIl.getHeight();
                if (lIIIIllIIlllIIII(llllllllllllIllllIIIlIIlIIlllIII, this.ycount - BigImage.lIlllllllllllI[3])) {
                    llllllllllllIllllIIIlIIlIIlIlllI += llllllllllllIllllIIIlIIlIIlllIIl.getWidth();
                }
                ++llllllllllllIllllIIIlIIlIIlllIII;
                "".length();
                if ((0xC4 ^ 0xC0) <= "   ".length()) {
                    return;
                }
            }
            ++llllllllllllIllllIIIlIIlIIllIlll;
            "".length();
            if ((0x97 ^ 0x93) <= 0) {
                return;
            }
        }
        BigImage.GL.glScalef(1.0f / llllllllllllIllllIIIlIIlIIllIIII, 1.0f / llllllllllllIllllIIIlIIlIIlIllll, 1.0f);
        BigImage.GL.glTranslatef(-llllllllllllIllllIIIlIIlIIlIlIll, -llllllllllllIllllIIIlIIlIIllIlII, 0.0f);
    }
    
    @Override
    public void drawSheared(final float llllllllllllIllllIIIIlllIllllllI, final float llllllllllllIllllIIIIlllIlllllIl, final float llllllllllllIllllIIIIlllIlllllII, final float llllllllllllIllllIIIIlllIllllIll) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void reinit() {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[5]]);
    }
    
    public BigImage(final LoadableImageData llllllllllllIllllIIIlIIlllIIIlll, final ByteBuffer llllllllllllIllllIIIlIIlllIIlIll, final int llllllllllllIllllIIIlIIlllIIlIlI, final int llllllllllllIllllIIIlIIlllIIlIIl) {
        this.build(llllllllllllIllllIIIlIIlllIIIlll, llllllllllllIllllIIIlIIlllIIlIll, llllllllllllIllllIIIlIIlllIIlIlI, llllllllllllIllllIIIlIIlllIIlIIl);
    }
    
    @Override
    public Image getScaledCopy(final int llllllllllllIllllIIIlIIIIIllIlll, final int llllllllllllIllllIIIlIIIIIlllIlI) {
        final BigImage llllllllllllIllllIIIlIIIIIlllIIl = new BigImage();
        llllllllllllIllllIIIlIIIIIlllIIl.images = this.images;
        llllllllllllIllllIIIlIIIIIlllIIl.xcount = this.xcount;
        llllllllllllIllllIIIlIIIIIlllIIl.ycount = this.ycount;
        llllllllllllIllllIIIlIIIIIlllIIl.width = llllllllllllIllllIIIlIIIIIllIlll;
        llllllllllllIllllIIIlIIIIIlllIIl.height = llllllllllllIllllIIIlIIIIIlllIlI;
        llllllllllllIllllIIIlIIIIIlllIIl.realWidth = this.realWidth;
        llllllllllllIllllIIIlIIIIIlllIIl.realHeight = this.realHeight;
        return llllllllllllIllllIIIlIIIIIlllIIl;
    }
    
    private static String lIIIIllIIllIlIll(final String llllllllllllIllllIIIIlllIlIIlllI, final String llllllllllllIllllIIIIlllIlIIllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIlllIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlllIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIIlllIlIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIIlllIlIlIIII.init(BigImage.lIlllllllllllI[4], llllllllllllIllllIIIIlllIlIlIIIl);
            return new String(llllllllllllIllllIIIIlllIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIlllIlIIllll) {
            llllllllllllIllllIIIIlllIlIIllll.printStackTrace();
            return null;
        }
    }
    
    public BigImage(final LoadableImageData llllllllllllIllllIIIlIIlllIllIIl, final ByteBuffer llllllllllllIllllIIIlIIlllIlIlII, final int llllllllllllIllllIIIlIIlllIlIlll) {
        this.build(llllllllllllIllllIIIlIIlllIllIIl, llllllllllllIllllIIIlIIlllIlIlII, llllllllllllIllllIIIlIIlllIlIlll, getMaxSingleImageSize());
    }
    
    @Override
    public void ensureInverted() {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[6]]);
    }
    
    @Override
    public Image getSubImage(final int llllllllllllIllllIIIlIIIIIIIIIIl, final int llllllllllllIllllIIIlIIIIIIIIIII, final int llllllllllllIllllIIIlIIIIIIIllII, final int llllllllllllIllllIIIlIIIIIIIlIll) {
        final BigImage llllllllllllIllllIIIlIIIIIIIlIlI = new BigImage();
        llllllllllllIllllIIIlIIIIIIIlIlI.width = llllllllllllIllllIIIlIIIIIIIllII;
        llllllllllllIllllIIIlIIIIIIIlIlI.height = llllllllllllIllllIIIlIIIIIIIlIll;
        llllllllllllIllllIIIlIIIIIIIlIlI.realWidth = llllllllllllIllllIIIlIIIIIIIllII;
        llllllllllllIllllIIIlIIIIIIIlIlI.realHeight = llllllllllllIllllIIIlIIIIIIIlIll;
        llllllllllllIllllIIIlIIIIIIIlIlI.images = new Image[this.xcount][this.ycount];
        float llllllllllllIllllIIIlIIIIIIIlIIl = 0.0f;
        float llllllllllllIllllIIIlIIIIIIIlIII = 0.0f;
        final int llllllllllllIllllIIIlIIIIIIIIlll = llllllllllllIllllIIIlIIIIIIIIIIl + llllllllllllIllllIIIlIIIIIIIllII;
        final int llllllllllllIllllIIIlIIIIIIIIllI = llllllllllllIllllIIIlIIIIIIIIIII + llllllllllllIllllIIIlIIIIIIIlIll;
        int llllllllllllIllllIIIlIIIIIIIIlIl = BigImage.lIlllllllllllI[2];
        int llllllllllllIllllIIIlIIIIIIIIlII = BigImage.lIlllllllllllI[2];
        boolean llllllllllllIllllIIIlIIIIIIIIIll = BigImage.lIlllllllllllI[2] != 0;
        int llllllllllllIllllIIIlIIIIIIlIIII = BigImage.lIlllllllllllI[2];
        while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIIIIlIIII, this.xcount)) {
            llllllllllllIllllIIIlIIIIIIIlIII = 0.0f;
            llllllllllllIllllIIIlIIIIIIIIlII = BigImage.lIlllllllllllI[2];
            llllllllllllIllllIIIlIIIIIIIIIll = (BigImage.lIlllllllllllI[2] != 0);
            int llllllllllllIllllIIIlIIIIIIlIIIl = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIIIIlIIIl, this.ycount)) {
                final Image llllllllllllIllllIIIlIIIIIIllIlI = this.images[llllllllllllIllllIIIlIIIIIIlIIII][llllllllllllIllllIIIlIIIIIIlIIIl];
                final int llllllllllllIllllIIIlIIIIIIllIIl = (int)(llllllllllllIllllIIIlIIIIIIIlIIl + llllllllllllIllllIIIlIIIIIIllIlI.getWidth());
                final int llllllllllllIllllIIIlIIIIIIllIII = (int)(llllllllllllIllllIIIlIIIIIIIlIII + llllllllllllIllllIIIlIIIIIIllIlI.getHeight());
                final int llllllllllllIllllIIIlIIIIIIlIlll = (int)Math.max((float)llllllllllllIllllIIIlIIIIIIIIIIl, llllllllllllIllllIIIlIIIIIIIlIIl);
                final int llllllllllllIllllIIIlIIIIIIlIllI = (int)Math.max((float)llllllllllllIllllIIIlIIIIIIIIIII, llllllllllllIllllIIIlIIIIIIIlIII);
                final int llllllllllllIllllIIIlIIIIIIlIlIl = Math.min(llllllllllllIllllIIIlIIIIIIIIlll, llllllllllllIllllIIIlIIIIIIllIIl);
                final int llllllllllllIllllIIIlIIIIIIlIlII = Math.min(llllllllllllIllllIIIlIIIIIIIIllI, llllllllllllIllllIIIlIIIIIIllIII);
                final int llllllllllllIllllIIIlIIIIIIlIIll = llllllllllllIllllIIIlIIIIIIlIlIl - llllllllllllIllllIIIlIIIIIIlIlll;
                final int llllllllllllIllllIIIlIIIIIIlIIlI = llllllllllllIllllIIIlIIIIIIlIlII - llllllllllllIllllIIIlIIIIIIlIllI;
                if (lIIIIllIIlllIlII(llllllllllllIllllIIIlIIIIIIlIIll) && lIIIIllIIlllIlII(llllllllllllIllllIIIlIIIIIIlIIlI)) {
                    final Image llllllllllllIllllIIIlIIIIIIllIll = llllllllllllIllllIIIlIIIIIIllIlI.getSubImage((int)(llllllllllllIllllIIIlIIIIIIlIlll - llllllllllllIllllIIIlIIIIIIIlIIl), (int)(llllllllllllIllllIIIlIIIIIIlIllI - llllllllllllIllllIIIlIIIIIIIlIII), llllllllllllIllllIIIlIIIIIIlIlIl - llllllllllllIllllIIIlIIIIIIlIlll, llllllllllllIllllIIIlIIIIIIlIlII - llllllllllllIllllIIIlIIIIIIlIllI);
                    llllllllllllIllllIIIlIIIIIIIIIll = (BigImage.lIlllllllllllI[3] != 0);
                    llllllllllllIllllIIIlIIIIIIIlIlI.images[llllllllllllIllllIIIlIIIIIIIIlIl][llllllllllllIllllIIIlIIIIIIIIlII] = llllllllllllIllllIIIlIIIIIIllIll;
                    ++llllllllllllIllllIIIlIIIIIIIIlII;
                    llllllllllllIllllIIIlIIIIIIIlIlI.ycount = Math.max(llllllllllllIllllIIIlIIIIIIIlIlI.ycount, llllllllllllIllllIIIlIIIIIIIIlII);
                }
                llllllllllllIllllIIIlIIIIIIIlIII += llllllllllllIllllIIIlIIIIIIllIlI.getHeight();
                if (lIIIIllIIlllIIII(llllllllllllIllllIIIlIIIIIIlIIIl, this.ycount - BigImage.lIlllllllllllI[3])) {
                    llllllllllllIllllIIIlIIIIIIIlIIl += llllllllllllIllllIIIlIIIIIIllIlI.getWidth();
                }
                ++llllllllllllIllllIIIlIIIIIIlIIIl;
                "".length();
                if (((0x5A ^ 0x5F ^ (0x38 ^ 0x6C)) & (131 + 173 - 205 + 138 ^ 140 + 182 - 249 + 115 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            if (lIIIIllIIlllIIll(llllllllllllIllllIIIlIIIIIIIIIll ? 1 : 0)) {
                ++llllllllllllIllllIIIlIIIIIIIIlIl;
                final BigImage bigImage = llllllllllllIllllIIIlIIIIIIIlIlI;
                bigImage.xcount += BigImage.lIlllllllllllI[3];
            }
            ++llllllllllllIllllIIIlIIIIIIlIIII;
            "".length();
            if (((0x92 ^ 0x9F) & ~(0x24 ^ 0x29)) != 0x0) {
                return null;
            }
        }
        return llllllllllllIllllIIIlIIIIIIIlIlI;
    }
    
    public static final int getMaxSingleImageSize() {
        final IntBuffer llllllllllllIllllIIIlIIllllllllI = BufferUtils.createIntBuffer(BigImage.lIlllllllllllI[0]);
        BigImage.GL.glGetInteger(BigImage.lIlllllllllllI[1], llllllllllllIllllIIIlIIllllllllI);
        return llllllllllllIllllIIIlIIllllllllI.get(BigImage.lIlllllllllllI[2]);
    }
    
    public int getHorizontalImageCount() {
        return this.xcount;
    }
    
    private static boolean lIIIIllIIlllIIIl(final Object llllllllllllIllllIIIIlllIIllIlll) {
        return llllllllllllIllllIIIIlllIIllIlll != null;
    }
    
    @Override
    public Image copy() {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[4]]);
    }
    
    private static boolean lIIIIllIIlllIIlI(final Object llllllllllllIllllIIIIlllIIlllIlI, final Object llllllllllllIllllIIIIlllIIlllIIl) {
        return llllllllllllIllllIIIIlllIIlllIlI != llllllllllllIllllIIIIlllIIlllIIl;
    }
    
    private static void lIIIIllIIllIllIl() {
        (lIlllllllllllI = new int[14])[0] = (0x5D ^ 0x35 ^ (0xCB ^ 0xB3));
        BigImage.lIlllllllllllI[1] = (0xFFFFAD3F & 0x5FF3);
        BigImage.lIlllllllllllI[2] = ((0x60 ^ 0x23 ^ (0x7B ^ 0x14)) & (0x68 ^ 0x19 ^ (0x8 ^ 0x55) ^ -" ".length()));
        BigImage.lIlllllllllllI[3] = " ".length();
        BigImage.lIlllllllllllI[4] = "  ".length();
        BigImage.lIlllllllllllI[5] = (0x42 ^ 0x4A);
        BigImage.lIlllllllllllI[6] = "   ".length();
        BigImage.lIlllllllllllI[7] = (0x63 ^ 0x67);
        BigImage.lIlllllllllllI[8] = (0xB3 ^ 0xB6);
        BigImage.lIlllllllllllI[9] = (95 + 63 - 36 + 28 ^ 41 + 130 - 32 + 5);
        BigImage.lIlllllllllllI[10] = (74 + 127 - 28 + 5 ^ 67 + 108 - 19 + 25);
        BigImage.lIlllllllllllI[11] = (0xD ^ 0x4);
        BigImage.lIlllllllllllI[12] = (0x12 ^ 0x18);
        BigImage.lIlllllllllllI[13] = (0xB0 ^ 0xA8 ^ (0x64 ^ 0x77));
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIIllIlIlII, final float llllllllllllIllllIIIlIIIllIlIIll, final float llllllllllllIllllIIIlIIIllIIllIl, final float llllllllllllIllllIIIlIIIllIIllII) {
        this.draw(llllllllllllIllllIIIlIIIllIlIlII, llllllllllllIllllIIIlIIIllIlIIll, llllllllllllIllllIIIlIIIllIIllIl, llllllllllllIllllIIIlIIIllIIllII, Color.white);
    }
    
    @Override
    public void drawFlash(final float llllllllllllIllllIIIlIIIIllIIlll, final float llllllllllllIllllIIIlIIIIllIlIIl) {
        this.drawFlash(llllllllllllIllllIIIlIIIIllIIlll, llllllllllllIllllIIIlIIIIllIlIIl, (float)this.width, (float)this.height);
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIIlIlllIll, final float llllllllllllIllllIIIlIIIlIllIlll) {
        this.draw(llllllllllllIllllIIIlIIIlIlllIll, llllllllllllIllllIIIlIIIlIllIlll, Color.white);
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIlIlIllIII, final float llllllllllllIllllIIIlIIlIlIlIlll, final Color llllllllllllIllllIIIlIIlIlIlIllI) {
        this.draw(llllllllllllIllllIIIlIIlIlIllIII, llllllllllllIllllIIIlIIlIlIlIlll, (float)this.width, (float)this.height, llllllllllllIllllIIIlIIlIlIlIllI);
    }
    
    @Override
    public void drawFlash(final float llllllllllllIllllIIIlIIIlIIIIIlI, final float llllllllllllIllllIIIlIIIIllllIII, final float llllllllllllIllllIIIlIIIIlllIlll, final float llllllllllllIllllIIIlIIIIlllIllI) {
        final float llllllllllllIllllIIIlIIIIllllllI = llllllllllllIllllIIIlIIIIlllIlll / this.realWidth;
        final float llllllllllllIllllIIIlIIIIlllllIl = llllllllllllIllllIIIlIIIIlllIllI / this.realHeight;
        BigImage.GL.glTranslatef(llllllllllllIllllIIIlIIIlIIIIIlI, llllllllllllIllllIIIlIIIIllllIII, 0.0f);
        BigImage.GL.glScalef(llllllllllllIllllIIIlIIIIllllllI, llllllllllllIllllIIIlIIIIlllllIl, 1.0f);
        float llllllllllllIllllIIIlIIIIlllllII = 0.0f;
        float llllllllllllIllllIIIlIIIIllllIll = 0.0f;
        int llllllllllllIllllIIIlIIIlIIIIlII = BigImage.lIlllllllllllI[2];
        while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIlIIIIlII, this.xcount)) {
            llllllllllllIllllIIIlIIIIllllIll = 0.0f;
            int llllllllllllIllllIIIlIIIlIIIIlIl = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIlIIIIlIl, this.ycount)) {
                final Image llllllllllllIllllIIIlIIIlIIIIllI = this.images[llllllllllllIllllIIIlIIIlIIIIlII][llllllllllllIllllIIIlIIIlIIIIlIl];
                llllllllllllIllllIIIlIIIlIIIIllI.drawFlash(llllllllllllIllllIIIlIIIIlllllII, llllllllllllIllllIIIlIIIIllllIll, (float)llllllllllllIllllIIIlIIIlIIIIllI.getWidth(), (float)llllllllllllIllllIIIlIIIlIIIIllI.getHeight());
                llllllllllllIllllIIIlIIIIllllIll += llllllllllllIllllIIIlIIIlIIIIllI.getHeight();
                if (lIIIIllIIlllIIII(llllllllllllIllllIIIlIIIlIIIIlIl, this.ycount - BigImage.lIlllllllllllI[3])) {
                    llllllllllllIllllIIIlIIIIlllllII += llllllllllllIllllIIIlIIIlIIIIllI.getWidth();
                }
                ++llllllllllllIllllIIIlIIIlIIIIlIl;
                "".length();
                if (null != null) {
                    return;
                }
            }
            ++llllllllllllIllllIIIlIIIlIIIIlII;
            "".length();
            if (((0x3C ^ 0x30 ^ (0x69 ^ 0x49)) & (0x4C ^ 0x5E ^ (0xAE ^ 0x90) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        BigImage.GL.glScalef(1.0f / llllllllllllIllllIIIlIIIIllllllI, 1.0f / llllllllllllIllllIIIlIIIIlllllIl, 1.0f);
        BigImage.GL.glTranslatef(-llllllllllllIllllIIIlIIIlIIIIIlI, -llllllllllllIllllIIIlIIIIllllIII, 0.0f);
    }
    
    @Override
    public Graphics getGraphics() throws SlickException {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[8]]);
    }
    
    @Override
    public void draw(final float llllllllllllIllllIIIlIIlIIIlIIII, final float llllllllllllIllllIIIlIIlIIIIllll, final float llllllllllllIllllIIIlIIlIIIIIIII, final float llllllllllllIllllIIIlIIlIIIIllIl, final float llllllllllllIllllIIIlIIIlllllllI, final float llllllllllllIllllIIIlIIIllllllIl, final float llllllllllllIllllIIIlIIlIIIIlIlI, final float llllllllllllIllllIIIlIIlIIIIlIIl) {
        final int llllllllllllIllllIIIlIIlIIIIlIII = (int)(llllllllllllIllllIIIlIIlIIIIlIlI - llllllllllllIllllIIIlIIIlllllllI);
        final int llllllllllllIllllIIIlIIlIIIIIlll = (int)(llllllllllllIllllIIIlIIlIIIIlIIl - llllllllllllIllllIIIlIIIllllllIl);
        final Image llllllllllllIllllIIIlIIlIIIIIllI = this.getSubImage((int)llllllllllllIllllIIIlIIIlllllllI, (int)llllllllllllIllllIIIlIIIllllllIl, llllllllllllIllllIIIlIIlIIIIlIII, llllllllllllIllllIIIlIIlIIIIIlll);
        final int llllllllllllIllllIIIlIIlIIIIIlIl = (int)(llllllllllllIllllIIIlIIlIIIIIIII - llllllllllllIllllIIIlIIlIIIlIIII);
        final int llllllllllllIllllIIIlIIlIIIIIlII = (int)(llllllllllllIllllIIIlIIlIIIIllIl - llllllllllllIllllIIIlIIlIIIIllll);
        llllllllllllIllllIIIlIIlIIIIIllI.draw(llllllllllllIllllIIIlIIlIIIlIIII, llllllllllllIllllIIIlIIlIIIIllll, (float)llllllllllllIllllIIIlIIlIIIIIlIl, (float)llllllllllllIllllIIIlIIlIIIIIlII);
    }
    
    private static boolean lIIIIllIIlllIlII(final int llllllllllllIllllIIIIlllIIllIIll) {
        return llllllllllllIllllIIIIlllIIllIIll > 0;
    }
    
    @Override
    protected void initImpl() {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[10]]);
    }
    
    @Override
    public Color getColor(final int llllllllllllIllllIIIlIIIIllIIIIl, final int llllllllllllIllllIIIlIIIIllIIIII) {
        throw new OperationNotSupportedException(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[7]]);
    }
    
    private void build(final String llllllllllllIllllIIIlIIllIllIIII, final int llllllllllllIllllIIIlIIllIlIllll, final int llllllllllllIllllIIIlIIllIlIlllI) throws SlickException {
        try {
            final LoadableImageData llllllllllllIllllIIIlIIllIllIlII = ImageDataFactory.getImageDataFor(llllllllllllIllllIIIlIIllIllIIII);
            final ByteBuffer llllllllllllIllllIIIlIIllIllIIll = llllllllllllIllllIIIlIIllIllIlII.loadImage(ResourceLoader.getResourceAsStream(llllllllllllIllllIIIlIIllIllIIII), (boolean)(BigImage.lIlllllllllllI[2] != 0), null);
            this.build(llllllllllllIllllIIIlIIllIllIlII, llllllllllllIllllIIIlIIllIllIIll, llllllllllllIllllIIIlIIllIlIllll, llllllllllllIllllIIIlIIllIlIlllI);
            "".length();
            if (((0xA7 ^ 0x8A) & ~(0x4E ^ 0x63)) > 0) {
                return;
            }
        }
        catch (IOException llllllllllllIllllIIIlIIllIllIIlI) {
            throw new SlickException(String.valueOf(new StringBuilder().append(BigImage.lIllllllllllIl[BigImage.lIlllllllllllI[2]]).append(llllllllllllIllllIIIlIIllIllIIII)), llllllllllllIllllIIIlIIllIllIIlI);
        }
    }
    
    @Override
    public void drawFlash(final float llllllllllllIllllIIIIllllIIIIlII, final float llllllllllllIllllIIIIllllIIIIIll, final float llllllllllllIllllIIIIllllIIIIIlI, final float llllllllllllIllllIIIIllllIIIIIIl, final Color llllllllllllIllllIIIIllllIIIIIII) {
        throw new UnsupportedOperationException();
    }
    
    public int getVerticalImageCount() {
        return this.ycount;
    }
    
    private void build(final LoadableImageData llllllllllllIllllIIIlIIlIllllIlI, final ByteBuffer llllllllllllIllllIIIlIIlIllllIIl, final int llllllllllllIllllIIIlIIllIIIIIII, final int llllllllllllIllllIIIlIIlIlllllll) {
        final int llllllllllllIllllIIIlIIlIllllllI = llllllllllllIllllIIIlIIlIllllIlI.getTexWidth();
        final int llllllllllllIllllIIIlIIlIlllllIl = llllllllllllIllllIIIlIIlIllllIlI.getTexHeight();
        final int width = llllllllllllIllllIIIlIIlIllllIlI.getWidth();
        this.width = width;
        this.realWidth = width;
        final int height = llllllllllllIllllIIIlIIlIllllIlI.getHeight();
        this.height = height;
        this.realHeight = height;
        if (lIIIIllIIllIlllI(llllllllllllIllllIIIlIIlIllllllI, llllllllllllIllllIIIlIIlIlllllll) && lIIIIllIIllIlllI(llllllllllllIllllIIIlIIlIlllllIl, llllllllllllIllllIIIlIIlIlllllll)) {
            this.images = new Image[BigImage.lIlllllllllllI[3]][BigImage.lIlllllllllllI[3]];
            final ImageData llllllllllllIllllIIIlIIllIIlIIlI = new ImageData() {
                public int getWidth() {
                    return llllllllllllIllllIIIlIIlIllllllI;
                }
                
                public ByteBuffer getImageBufferData() {
                    return llllllllllllIllllIIIlIIlIllllIIl;
                }
                
                public int getHeight() {
                    return llllllllllllIllllIIIlIIlIlllllIl;
                }
                
                public int getDepth() {
                    return llllllllllllIllllIIIlIIlIllllIlI.getDepth();
                }
                
                public int getTexWidth() {
                    return llllllllllllIllllIIIlIIlIllllllI;
                }
                
                public int getTexHeight() {
                    return llllllllllllIllllIIIlIIlIlllllIl;
                }
            };
            this.images[BigImage.lIlllllllllllI[2]][BigImage.lIlllllllllllI[2]] = new Image(llllllllllllIllllIIIlIIllIIlIIlI, llllllllllllIllllIIIlIIllIIIIIII);
            this.xcount = BigImage.lIlllllllllllI[3];
            this.ycount = BigImage.lIlllllllllllI[3];
            this.inited = (BigImage.lIlllllllllllI[3] != 0);
            return;
        }
        this.xcount = (this.realWidth - BigImage.lIlllllllllllI[3]) / llllllllllllIllllIIIlIIlIlllllll + BigImage.lIlllllllllllI[3];
        this.ycount = (this.realHeight - BigImage.lIlllllllllllI[3]) / llllllllllllIllllIIIlIIlIlllllll + BigImage.lIlllllllllllI[3];
        this.images = new Image[this.xcount][this.ycount];
        final int llllllllllllIllllIIIlIIlIlllllII = llllllllllllIllllIIIlIIlIllllIlI.getDepth() / BigImage.lIlllllllllllI[5];
        int llllllllllllIllllIIIlIIllIIIIlII = BigImage.lIlllllllllllI[2];
        while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIllIIIIlII, this.xcount)) {
            int llllllllllllIllllIIIlIIllIIIIlIl = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIllIIIIlIl, this.ycount)) {
                final int llllllllllllIllllIIIlIIllIIIllll = (llllllllllllIllllIIIlIIllIIIIlII + BigImage.lIlllllllllllI[3]) * llllllllllllIllllIIIlIIlIlllllll;
                final int llllllllllllIllllIIIlIIllIIIlllI = (llllllllllllIllllIIIlIIllIIIIlIl + BigImage.lIlllllllllllI[3]) * llllllllllllIllllIIIlIIlIlllllll;
                final int llllllllllllIllllIIIlIIllIIIllIl = Math.min(this.realWidth - llllllllllllIllllIIIlIIllIIIIlII * llllllllllllIllllIIIlIIlIlllllll, llllllllllllIllllIIIlIIlIlllllll);
                final int llllllllllllIllllIIIlIIllIIIllII = Math.min(this.realHeight - llllllllllllIllllIIIlIIllIIIIlIl * llllllllllllIllllIIIlIIlIlllllll, llllllllllllIllllIIIlIIlIlllllll);
                final int llllllllllllIllllIIIlIIllIIIlIll = llllllllllllIllllIIIlIIlIlllllll;
                final int llllllllllllIllllIIIlIIllIIIlIlI = llllllllllllIllllIIIlIIlIlllllll;
                final ByteBuffer llllllllllllIllllIIIlIIllIIIlIIl = BufferUtils.createByteBuffer(llllllllllllIllllIIIlIIlIlllllll * llllllllllllIllllIIIlIIlIlllllll * llllllllllllIllllIIIlIIlIlllllII);
                final int llllllllllllIllllIIIlIIllIIIlIII = llllllllllllIllllIIIlIIllIIIIlII * llllllllllllIllllIIIlIIlIlllllll * llllllllllllIllllIIIlIIlIlllllII;
                final byte[] llllllllllllIllllIIIlIIllIIIIlll = new byte[llllllllllllIllllIIIlIIllIIIlIll * llllllllllllIllllIIIlIIlIlllllII];
                int llllllllllllIllllIIIlIIllIIlIIII = BigImage.lIlllllllllllI[2];
                while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIllIIlIIII, llllllllllllIllllIIIlIIllIIIlIlI)) {
                    final int llllllllllllIllllIIIlIIllIIlIIIl = (llllllllllllIllllIIIlIIllIIIIlIl * llllllllllllIllllIIIlIIlIlllllll + llllllllllllIllllIIIlIIllIIlIIII) * llllllllllllIllllIIIlIIlIllllllI * llllllllllllIllllIIIlIIlIlllllII;
                    llllllllllllIllllIIIlIIlIllllIIl.position(llllllllllllIllllIIIlIIllIIlIIIl + llllllllllllIllllIIIlIIllIIIlIII);
                    "".length();
                    llllllllllllIllllIIIlIIlIllllIIl.get(llllllllllllIllllIIIlIIllIIIIlll, BigImage.lIlllllllllllI[2], llllllllllllIllllIIIlIIllIIIlIll * llllllllllllIllllIIIlIIlIlllllII);
                    "".length();
                    llllllllllllIllllIIIlIIllIIIlIIl.put(llllllllllllIllllIIIlIIllIIIIlll);
                    "".length();
                    ++llllllllllllIllllIIIlIIllIIlIIII;
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return;
                    }
                }
                llllllllllllIllllIIIlIIllIIIlIIl.flip();
                "".length();
                final ImageData llllllllllllIllllIIIlIIllIIIIllI = new ImageData() {
                    public int getWidth() {
                        return llllllllllllIllllIIIlIIllIIIllIl;
                    }
                    
                    public ByteBuffer getImageBufferData() {
                        return llllllllllllIllllIIIlIIllIIIlIIl;
                    }
                    
                    public int getTexWidth() {
                        return llllllllllllIllllIIIlIIllIIIlIll;
                    }
                    
                    public int getTexHeight() {
                        return llllllllllllIllllIIIlIIllIIIlIlI;
                    }
                    
                    public int getHeight() {
                        return llllllllllllIllllIIIlIIllIIIllII;
                    }
                    
                    public int getDepth() {
                        return llllllllllllIllllIIIlIIlIllllIlI.getDepth();
                    }
                };
                this.images[llllllllllllIllllIIIlIIllIIIIlII][llllllllllllIllllIIIlIIllIIIIlIl] = new Image(llllllllllllIllllIIIlIIllIIIIllI, llllllllllllIllllIIIlIIllIIIIIII);
                ++llllllllllllIllllIIIlIIllIIIIlIl;
                "".length();
                if (-(0x1E ^ 0x1A) >= 0) {
                    return;
                }
            }
            ++llllllllllllIllllIIIlIIllIIIIlII;
            "".length();
            if (-" ".length() >= " ".length()) {
                return;
            }
        }
        this.inited = (BigImage.lIlllllllllllI[3] != 0);
    }
    
    public Image getSubImage(final int llllllllllllIllllIIIIllllllIIIII, final int llllllllllllIllllIIIIlllllIlllII) {
        return this.images[llllllllllllIllllIIIIllllllIIIII][llllllllllllIllllIIIIlllllIlllII];
    }
    
    @Override
    public Image getFlippedCopy(final boolean llllllllllllIllllIIIlIIIIlIlIIIl, final boolean llllllllllllIllllIIIlIIIIlIlIIII) {
        final BigImage llllllllllllIllllIIIlIIIIlIIllll = new BigImage();
        llllllllllllIllllIIIlIIIIlIIllll.images = this.images;
        llllllllllllIllllIIIlIIIIlIIllll.xcount = this.xcount;
        llllllllllllIllllIIIlIIIIlIIllll.ycount = this.ycount;
        llllllllllllIllllIIIlIIIIlIIllll.width = this.width;
        llllllllllllIllllIIIlIIIIlIIllll.height = this.height;
        llllllllllllIllllIIIlIIIIlIIllll.realWidth = this.realWidth;
        llllllllllllIllllIIIlIIIIlIIllll.realHeight = this.realHeight;
        if (lIIIIllIIlllIIll(llllllllllllIllllIIIlIIIIlIlIIIl ? 1 : 0)) {
            final Image[][] llllllllllllIllllIIIlIIIIlIlIllI = llllllllllllIllllIIIlIIIIlIIllll.images;
            llllllllllllIllllIIIlIIIIlIIllll.images = new Image[this.xcount][this.ycount];
            int llllllllllllIllllIIIlIIIIlIlIlll = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIIlIlIlll, this.xcount)) {
                int llllllllllllIllllIIIlIIIIlIllIII = BigImage.lIlllllllllllI[2];
                while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIIlIllIII, this.ycount)) {
                    llllllllllllIllllIIIlIIIIlIIllll.images[llllllllllllIllllIIIlIIIIlIlIlll][llllllllllllIllllIIIlIIIIlIllIII] = llllllllllllIllllIIIlIIIIlIlIllI[this.xcount - BigImage.lIlllllllllllI[3] - llllllllllllIllllIIIlIIIIlIlIlll][llllllllllllIllllIIIlIIIIlIllIII].getFlippedCopy((boolean)(BigImage.lIlllllllllllI[3] != 0), (boolean)(BigImage.lIlllllllllllI[2] != 0));
                    ++llllllllllllIllllIIIlIIIIlIllIII;
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return null;
                    }
                }
                ++llllllllllllIllllIIIlIIIIlIlIlll;
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
        }
        if (lIIIIllIIlllIIll(llllllllllllIllllIIIlIIIIlIlIIII ? 1 : 0)) {
            final Image[][] llllllllllllIllllIIIlIIIIlIlIIll = llllllllllllIllllIIIlIIIIlIIllll.images;
            llllllllllllIllllIIIlIIIIlIIllll.images = new Image[this.xcount][this.ycount];
            int llllllllllllIllllIIIlIIIIlIlIlII = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIIlIlIlII, this.xcount)) {
                int llllllllllllIllllIIIlIIIIlIlIlIl = BigImage.lIlllllllllllI[2];
                while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIIlIlIlIl, this.ycount)) {
                    llllllllllllIllllIIIlIIIIlIIllll.images[llllllllllllIllllIIIlIIIIlIlIlII][llllllllllllIllllIIIlIIIIlIlIlIl] = llllllllllllIllllIIIlIIIIlIlIIll[llllllllllllIllllIIIlIIIIlIlIlII][this.ycount - BigImage.lIlllllllllllI[3] - llllllllllllIllllIIIlIIIIlIlIlIl].getFlippedCopy((boolean)(BigImage.lIlllllllllllI[2] != 0), (boolean)(BigImage.lIlllllllllllI[3] != 0));
                    ++llllllllllllIllllIIIlIIIIlIlIlIl;
                    "".length();
                    if (((0x7F ^ 0x25 ^ "  ".length()) & (0x3E ^ 0x33 ^ (0x1E ^ 0x4B) ^ -" ".length()) & (((47 + 63 + 105 + 31 ^ 53 + 153 - 85 + 42) & (0xEE ^ 0xC4 ^ 38 + 43 + 22 + 24 ^ -" ".length())) ^ -" ".length())) > 0) {
                        return null;
                    }
                }
                ++llllllllllllIllllIIIlIIIIlIlIlII;
                "".length();
                if ("   ".length() == ((0xD7 ^ 0xBC ^ (0xDE ^ 0x90)) & (0x32 ^ 0x54 ^ (0x6B ^ 0x28) ^ -" ".length()))) {
                    return null;
                }
            }
        }
        return llllllllllllIllllIIIlIIIIlIIllll;
    }
    
    private static boolean lIIIIllIIllIllll(final int llllllllllllIllllIIIIlllIlIIIIlI, final int llllllllllllIllllIIIIlllIlIIIIIl) {
        return llllllllllllIllllIIIIlllIlIIIIlI < llllllllllllIllllIIIIlllIlIIIIIl;
    }
    
    @Override
    public void destroy() throws SlickException {
        int llllllllllllIllllIIIIlllllIIlllI = BigImage.lIlllllllllllI[2];
        while (lIIIIllIIllIllll(llllllllllllIllllIIIIlllllIIlllI, this.xcount)) {
            int llllllllllllIllllIIIIlllllIIllll = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIIlllllIIllll, this.ycount)) {
                final Image llllllllllllIllllIIIIlllllIlIIII = this.images[llllllllllllIllllIIIIlllllIIlllI][llllllllllllIllllIIIIlllllIIllll];
                llllllllllllIllllIIIIlllllIlIIII.destroy();
                ++llllllllllllIllllIIIIlllllIIllll;
                "".length();
                if (-(104 + 72 - 91 + 64 ^ 7 + 140 - 98 + 96) >= 0) {
                    return;
                }
            }
            ++llllllllllllIllllIIIIlllllIIlllI;
            "".length();
            if (((80 + 146 - 156 + 93 ^ 6 + 3 + 71 + 103) & (0xF6 ^ 0xC5 ^ (0x7A ^ 0x5D) ^ -" ".length())) != 0x0) {
                return;
            }
        }
    }
    
    private static String lIIIIllIIllIlIlI(final String llllllllllllIllllIIIIlllIlllIIIl, final String llllllllllllIllllIIIIlllIlllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIlllIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlllIlllIIlI.getBytes(StandardCharsets.UTF_8)), BigImage.lIlllllllllllI[5]), "DES");
            final Cipher llllllllllllIllllIIIIlllIlllIlIl = Cipher.getInstance("DES");
            llllllllllllIllllIIIIlllIlllIlIl.init(BigImage.lIlllllllllllI[4], llllllllllllIllllIIIIlllIlllIllI);
            return new String(llllllllllllIllllIIIIlllIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlllIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIlllIlllIlII) {
            llllllllllllIllllIIIIlllIlllIlII.printStackTrace();
            return null;
        }
    }
    
    public BigImage(final String llllllllllllIllllIIIlIIllllIllll, final int llllllllllllIllllIIIlIIllllIlllI) throws SlickException {
        this.build(llllllllllllIllllIIIlIIllllIllll, llllllllllllIllllIIIlIIllllIlllI, getMaxSingleImageSize());
    }
    
    @Override
    public void drawEmbedded(final float llllllllllllIllllIIIlIIIlIIlllIl, final float llllllllllllIllllIIIlIIIlIlIIlIl, final float llllllllllllIllllIIIlIIIlIIllIll, final float llllllllllllIllllIIIlIIIlIlIIIll) {
        final float llllllllllllIllllIIIlIIIlIlIIIlI = llllllllllllIllllIIIlIIIlIIllIll / this.realWidth;
        final float llllllllllllIllllIIIlIIIlIlIIIIl = llllllllllllIllllIIIlIIIlIlIIIll / this.realHeight;
        float llllllllllllIllllIIIlIIIlIlIIIII = 0.0f;
        float llllllllllllIllllIIIlIIIlIIlllll = 0.0f;
        int llllllllllllIllllIIIlIIIlIlIlIII = BigImage.lIlllllllllllI[2];
        while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIlIlIlIII, this.xcount)) {
            llllllllllllIllllIIIlIIIlIIlllll = 0.0f;
            int llllllllllllIllllIIIlIIIlIlIlIIl = BigImage.lIlllllllllllI[2];
            while (lIIIIllIIllIllll(llllllllllllIllllIIIlIIIlIlIlIIl, this.ycount)) {
                final Image llllllllllllIllllIIIlIIIlIlIlIlI = this.images[llllllllllllIllllIIIlIIIlIlIlIII][llllllllllllIllllIIIlIIIlIlIlIIl];
                if (!lIIIIllIIlllIIIl(BigImage.lastBind) || lIIIIllIIlllIIlI(llllllllllllIllllIIIlIIIlIlIlIlI.getTexture(), BigImage.lastBind.getTexture())) {
                    if (lIIIIllIIlllIIIl(BigImage.lastBind)) {
                        BigImage.lastBind.endUse();
                    }
                    (BigImage.lastBind = llllllllllllIllllIIIlIIIlIlIlIlI).startUse();
                }
                llllllllllllIllllIIIlIIIlIlIlIlI.drawEmbedded(llllllllllllIllllIIIlIIIlIlIIIII + llllllllllllIllllIIIlIIIlIIlllIl, llllllllllllIllllIIIlIIIlIIlllll + llllllllllllIllllIIIlIIIlIlIIlIl, (float)llllllllllllIllllIIIlIIIlIlIlIlI.getWidth(), (float)llllllllllllIllllIIIlIIIlIlIlIlI.getHeight());
                llllllllllllIllllIIIlIIIlIIlllll += llllllllllllIllllIIIlIIIlIlIlIlI.getHeight();
                if (lIIIIllIIlllIIII(llllllllllllIllllIIIlIIIlIlIlIIl, this.ycount - BigImage.lIlllllllllllI[3])) {
                    llllllllllllIllllIIIlIIIlIlIIIII += llllllllllllIllllIIIlIIIlIlIlIlI.getWidth();
                }
                ++llllllllllllIllllIIIlIIIlIlIlIIl;
                "".length();
                if (null != null) {
                    return;
                }
            }
            ++llllllllllllIllllIIIlIIIlIlIlIII;
            "".length();
            if ((0x57 ^ 0x3 ^ (0x56 ^ 0x6)) < 0) {
                return;
            }
        }
    }
    
    private BigImage() {
        this.inited = (BigImage.lIlllllllllllI[3] != 0);
    }
}
