// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.newdawn.slick.opengl.pbuffer.GraphicsFactory;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.ImageData;
import java.io.InputStream;
import java.io.IOException;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.opengl.InternalTextureLoader;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.renderer.SGL;

public class Image implements Renderable
{
    protected /* synthetic */ byte[] pixelData;
    protected /* synthetic */ String ref;
    protected /* synthetic */ int height;
    protected /* synthetic */ boolean inited;
    private /* synthetic */ Color transparent;
    protected /* synthetic */ float centerX;
    protected /* synthetic */ float textureHeight;
    protected /* synthetic */ int width;
    protected /* synthetic */ float textureWidth;
    protected /* synthetic */ float alpha;
    protected /* synthetic */ Color[] corners;
    protected /* synthetic */ float angle;
    private static final /* synthetic */ int[] lIIIIlIIlIIIII;
    protected static /* synthetic */ SGL GL;
    protected static /* synthetic */ Image inUse;
    protected /* synthetic */ boolean destroyed;
    protected /* synthetic */ Texture texture;
    protected /* synthetic */ float textureOffsetX;
    protected /* synthetic */ float centerY;
    private static final /* synthetic */ String[] lIIIIlIIIllIII;
    private /* synthetic */ int filter;
    protected /* synthetic */ String name;
    private /* synthetic */ boolean flipped;
    protected /* synthetic */ float textureOffsetY;
    
    @Override
    public String toString() {
        this.init();
        return String.valueOf(new StringBuilder().append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[20]]).append(this.ref).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[14]]).append(this.width).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[21]]).append(this.height).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[22]]).append(this.textureOffsetX).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[23]]).append(this.textureOffsetY).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[24]]).append(this.textureWidth).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[25]]).append(this.textureHeight).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[26]]));
    }
    
    public void drawCentered(final float lllllllllllllIlIIllIIllIIIIllIIl, final float lllllllllllllIlIIllIIllIIIIlIlIl) {
        this.draw(lllllllllllllIlIIllIIllIIIIllIIl - this.getWidth() / Image.lIIIIlIIlIIIII[2], lllllllllllllIlIIllIIllIIIIlIlIl - this.getHeight() / Image.lIIIIlIIlIIIII[2]);
    }
    
    private static int lIlllIIIIllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected final void init() {
        if (lIlllIIIIlIllll(this.inited ? 1 : 0)) {
            return;
        }
        this.inited = (Image.lIIIIlIIlIIIII[3] != 0);
        if (lIlllIIIIlIllIl(this.texture)) {
            this.width = this.texture.getImageWidth();
            this.height = this.texture.getImageHeight();
            this.textureOffsetX = 0.0f;
            this.textureOffsetY = 0.0f;
            this.textureWidth = this.texture.getWidth();
            this.textureHeight = this.texture.getHeight();
        }
        this.initImpl();
        this.centerX = (float)(this.width / Image.lIIIIlIIlIIIII[2]);
        this.centerY = (float)(this.height / Image.lIIIIlIIlIIIII[2]);
    }
    
    public float getTextureWidth() {
        this.init();
        return this.textureWidth;
    }
    
    public Image(final int lllllllllllllIlIIllIIllIllIIllll, final int lllllllllllllIlIIllIIllIllIIlllI, final int lllllllllllllIlIIllIIllIllIlIIIl) throws SlickException {
        this.alpha = 1.0f;
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.filter = Image.lIIIIlIIlIIIII[1];
        this.ref = super.toString();
        int filter;
        if (lIlllIIIIlIllII(lllllllllllllIlIIllIIllIllIlIIIl, Image.lIIIIlIIlIIIII[3])) {
            filter = Image.lIIIIlIIlIIIII[1];
            "".length();
            if ("   ".length() < -" ".length()) {
                throw null;
            }
        }
        else {
            filter = Image.lIIIIlIIlIIIII[4];
        }
        this.filter = filter;
        try {
            this.texture = InternalTextureLoader.get().createTexture(lllllllllllllIlIIllIIllIllIIllll, lllllllllllllIlIIllIIllIllIIlllI, this.filter);
            "".length();
            if (" ".length() == 0) {
                throw null;
            }
        }
        catch (IOException lllllllllllllIlIIllIIllIllIlIlIl) {
            Log.error(lllllllllllllIlIIllIIllIllIlIlIl);
            throw new SlickException(String.valueOf(new StringBuilder().append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[3]]).append(lllllllllllllIlIIllIIllIllIIllll).append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[2]]).append(lllllllllllllIlIIllIIllIllIIlllI)));
        }
        this.init();
    }
    
    public void draw() {
        this.draw(0.0f, 0.0f);
    }
    
    public float getTextureOffsetY() {
        this.init();
        return this.textureOffsetY;
    }
    
    public void setImageColor(final float lllllllllllllIlIIllIIllIIlllIIIl, final float lllllllllllllIlIIllIIllIIlllIlII, final float lllllllllllllIlIIllIIllIIlllIIll) {
        this.setColor(Image.lIIIIlIIlIIIII[0], lllllllllllllIlIIllIIllIIlllIIIl, lllllllllllllIlIIllIIllIIlllIlII, lllllllllllllIlIIllIIllIIlllIIll);
        this.setColor(Image.lIIIIlIIlIIIII[3], lllllllllllllIlIIllIIllIIlllIIIl, lllllllllllllIlIIllIIllIIlllIlII, lllllllllllllIlIIllIIllIIlllIIll);
        this.setColor(Image.lIIIIlIIlIIIII[5], lllllllllllllIlIIllIIllIIlllIIIl, lllllllllllllIlIIllIIllIIlllIlII, lllllllllllllIlIIllIIllIIlllIIll);
        this.setColor(Image.lIIIIlIIlIIIII[2], lllllllllllllIlIIllIIllIIlllIIIl, lllllllllllllIlIIllIIllIIlllIlII, lllllllllllllIlIIllIIllIIlllIIll);
    }
    
    public Color getColor(int lllllllllllllIlIIllIIlIIIIIlIIIl, int lllllllllllllIlIIllIIlIIIIIlIIII) {
        if (lIlllIIIIlIlllI(this.pixelData)) {
            this.pixelData = this.texture.getTextureData();
        }
        final int lllllllllllllIlIIllIIlIIIIIlIlIl = (int)(this.textureOffsetX * this.texture.getTextureWidth());
        final int lllllllllllllIlIIllIIlIIIIIlIlII = (int)(this.textureOffsetY * this.texture.getTextureHeight());
        if (lIlllIIIIlllIII(lIlllIIIIlllIIl(this.textureWidth, 0.0f))) {
            lllllllllllllIlIIllIIlIIIIIlIIIl = lllllllllllllIlIIllIIlIIIIIlIlIl - lllllllllllllIlIIllIIlIIIIIlIIIl;
            "".length();
            if (-(73 + 99 - 6 + 12 ^ 22 + 150 - 91 + 102) >= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIllIIlIIIIIlIIIl += lllllllllllllIlIIllIIlIIIIIlIlIl;
        }
        if (lIlllIIIIlllIII(lIlllIIIIlllIIl(this.textureHeight, 0.0f))) {
            lllllllllllllIlIIllIIlIIIIIlIIII = (short)(lllllllllllllIlIIllIIlIIIIIlIlII - lllllllllllllIlIIllIIlIIIIIlIIII);
            "".length();
            if (((0x87 ^ 0xB8) & ~(0xFE ^ 0xC1) & ~((0x12 ^ 0xD) & ~(0x49 ^ 0x56))) > " ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIllIIlIIIIIlIIII += (short)lllllllllllllIlIIllIIlIIIIIlIlII;
        }
        final int n;
        int lllllllllllllIlIIllIIlIIIIIlIIll = n = lllllllllllllIlIIllIIlIIIIIlIIIl + lllllllllllllIlIIllIIlIIIIIlIIII * this.texture.getTextureWidth();
        int n2;
        if (lIlllIIIIlIllll(this.texture.hasAlpha() ? 1 : 0)) {
            n2 = Image.lIIIIlIIlIIIII[9];
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        else {
            n2 = Image.lIIIIlIIlIIIII[5];
        }
        lllllllllllllIlIIllIIlIIIIIlIIll = n * n2;
        if (lIlllIIIIlIllll(this.texture.hasAlpha() ? 1 : 0)) {
            return new Color(this.translate(this.pixelData[lllllllllllllIlIIllIIlIIIIIlIIll]), this.translate(this.pixelData[lllllllllllllIlIIllIIlIIIIIlIIll + Image.lIIIIlIIlIIIII[3]]), this.translate(this.pixelData[lllllllllllllIlIIllIIlIIIIIlIIll + Image.lIIIIlIIlIIIII[2]]), this.translate(this.pixelData[lllllllllllllIlIIllIIlIIIIIlIIll + Image.lIIIIlIIlIIIII[5]]));
        }
        return new Color(this.translate(this.pixelData[lllllllllllllIlIIllIIlIIIIIlIIll]), this.translate(this.pixelData[lllllllllllllIlIIllIIlIIIIIlIIll + Image.lIIIIlIIlIIIII[3]]), this.translate(this.pixelData[lllllllllllllIlIIllIIlIIIIIlIIll + Image.lIIIIlIIlIIIII[2]]));
    }
    
    public Image getFlippedCopy(final boolean lllllllllllllIlIIllIIlIIIIllIlll, final boolean lllllllllllllIlIIllIIlIIIIllIllI) {
        this.init();
        final Image lllllllllllllIlIIllIIlIIIIlllIIl = this.copy();
        if (lIlllIIIIlIllll(lllllllllllllIlIIllIIlIIIIllIlll ? 1 : 0)) {
            lllllllllllllIlIIllIIlIIIIlllIIl.textureOffsetX = this.textureOffsetX + this.textureWidth;
            lllllllllllllIlIIllIIlIIIIlllIIl.textureWidth = -this.textureWidth;
        }
        if (lIlllIIIIlIllll(lllllllllllllIlIIllIIlIIIIllIllI ? 1 : 0)) {
            lllllllllllllIlIIllIIlIIIIlllIIl.textureOffsetY = this.textureOffsetY + this.textureHeight;
            lllllllllllllIlIIllIIlIIIIlllIIl.textureHeight = -this.textureHeight;
        }
        return lllllllllllllIlIIllIIlIIIIlllIIl;
    }
    
    private static int lIlllIIIIllIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Image(final String lllllllllllllIlIIllIIlllIIIllIll) throws SlickException {
        this(lllllllllllllIlIIllIIlllIIIllIll, (boolean)(Image.lIIIIlIIlIIIII[0] != 0));
    }
    
    public void drawFlash(final float lllllllllllllIlIIllIIlIllIIIIIIl, final float lllllllllllllIlIIllIIlIlIllllIll, final float lllllllllllllIlIIllIIlIlIllllIlI, final float lllllllllllllIlIIllIIlIlIllllIIl) {
        this.drawFlash(lllllllllllllIlIIllIIlIllIIIIIIl, lllllllllllllIlIIllIIlIlIllllIll, lllllllllllllIlIIllIIlIlIllllIlI, lllllllllllllIlIIllIIlIlIllllIIl, Color.white);
    }
    
    public float getRotation() {
        return this.angle;
    }
    
    public void setImageColor(final float lllllllllllllIlIIllIIllIlIIIIIll, final float lllllllllllllIlIIllIIllIIlllllIl, final float lllllllllllllIlIIllIIllIlIIIIIIl, final float lllllllllllllIlIIllIIllIIllllIll) {
        this.setColor(Image.lIIIIlIIlIIIII[0], lllllllllllllIlIIllIIllIlIIIIIll, lllllllllllllIlIIllIIllIIlllllIl, lllllllllllllIlIIllIIllIlIIIIIIl, lllllllllllllIlIIllIIllIIllllIll);
        this.setColor(Image.lIIIIlIIlIIIII[3], lllllllllllllIlIIllIIllIlIIIIIll, lllllllllllllIlIIllIIllIIlllllIl, lllllllllllllIlIIllIIllIlIIIIIIl, lllllllllllllIlIIllIIllIIllllIll);
        this.setColor(Image.lIIIIlIIlIIIII[5], lllllllllllllIlIIllIIllIlIIIIIll, lllllllllllllIlIIllIIllIIlllllIl, lllllllllllllIlIIllIIllIlIIIIIIl, lllllllllllllIlIIllIIllIIllllIll);
        this.setColor(Image.lIIIIlIIlIIIII[2], lllllllllllllIlIIllIIllIlIIIIIll, lllllllllllllIlIIllIIllIIlllllIl, lllllllllllllIlIIllIIllIlIIIIIIl, lllllllllllllIlIIllIIllIIllllIll);
    }
    
    public Image getSubImage(final int lllllllllllllIlIIllIIlIlIIlIlIll, final int lllllllllllllIlIIllIIlIlIIlIIIII, final int lllllllllllllIlIIllIIlIlIIIlllll, final int lllllllllllllIlIIllIIlIlIIlIlIII) {
        this.init();
        final float lllllllllllllIlIIllIIlIlIIlIIlll = lllllllllllllIlIIllIIlIlIIlIlIll / (float)this.width * this.textureWidth + this.textureOffsetX;
        final float lllllllllllllIlIIllIIlIlIIlIIllI = lllllllllllllIlIIllIIlIlIIlIIIII / (float)this.height * this.textureHeight + this.textureOffsetY;
        final float lllllllllllllIlIIllIIlIlIIlIIlIl = lllllllllllllIlIIllIIlIlIIIlllll / (float)this.width * this.textureWidth;
        final float lllllllllllllIlIIllIIlIlIIlIIlII = lllllllllllllIlIIllIIlIlIIlIlIII / (float)this.height * this.textureHeight;
        final Image lllllllllllllIlIIllIIlIlIIlIIIll = new Image();
        lllllllllllllIlIIllIIlIlIIlIIIll.inited = (Image.lIIIIlIIlIIIII[3] != 0);
        lllllllllllllIlIIllIIlIlIIlIIIll.texture = this.texture;
        lllllllllllllIlIIllIIlIlIIlIIIll.textureOffsetX = lllllllllllllIlIIllIIlIlIIlIIlll;
        lllllllllllllIlIIllIIlIlIIlIIIll.textureOffsetY = lllllllllllllIlIIllIIlIlIIlIIllI;
        lllllllllllllIlIIllIIlIlIIlIIIll.textureWidth = lllllllllllllIlIIllIIlIlIIlIIlIl;
        lllllllllllllIlIIllIIlIlIIlIIIll.textureHeight = lllllllllllllIlIIllIIlIlIIlIIlII;
        lllllllllllllIlIIllIIlIlIIlIIIll.width = lllllllllllllIlIIllIIlIlIIIlllll;
        lllllllllllllIlIIllIIlIlIIlIIIll.height = lllllllllllllIlIIllIIlIlIIlIlIII;
        lllllllllllllIlIIllIIlIlIIlIIIll.ref = this.ref;
        lllllllllllllIlIIllIIlIlIIlIIIll.centerX = (float)(lllllllllllllIlIIllIIlIlIIIlllll / Image.lIIIIlIIlIIIII[2]);
        lllllllllllllIlIIllIIlIlIIlIIIll.centerY = (float)(lllllllllllllIlIIllIIlIlIIlIlIII / Image.lIIIIlIIlIIIII[2]);
        return lllllllllllllIlIIllIIlIlIIlIIIll;
    }
    
    public void draw(final float lllllllllllllIlIIllIIlIllIIlIIlI, final float lllllllllllllIlIIllIIlIllIIIlIll, final float lllllllllllllIlIIllIIlIllIIlIIII, final float lllllllllllllIlIIllIIlIllIIIlIIl, Color lllllllllllllIlIIllIIlIllIIIlIII) {
        if (lIlllIIIIlIllll(lIlllIIIIllIIIl(this.alpha, 1.0f))) {
            if (lIlllIIIIlIlllI(lllllllllllllIlIIllIIlIllIIIlIII)) {
                lllllllllllllIlIIllIIlIllIIIlIII = Color.white;
            }
            final Color color;
            lllllllllllllIlIIllIIlIllIIIlIII = (color = new Color((Color)lllllllllllllIlIIllIIlIllIIIlIII));
            color.a *= this.alpha;
        }
        if (lIlllIIIIlIllIl(lllllllllllllIlIIllIIlIllIIIlIII)) {
            ((Color)lllllllllllllIlIIllIIlIllIIIlIII).bind();
        }
        this.texture.bind();
        Image.GL.glTranslatef(lllllllllllllIlIIllIIlIllIIlIIlI, lllllllllllllIlIIllIIlIllIIIlIll, 0.0f);
        if (lIlllIIIIlIllll(lIlllIIIIllIIIl(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glBegin(Image.lIIIIlIIlIIIII[14]);
        this.drawEmbedded(0.0f, 0.0f, lllllllllllllIlIIllIIlIllIIlIIII, lllllllllllllIlIIllIIlIllIIIlIIl);
        Image.GL.glEnd();
        if (lIlllIIIIlIllll(lIlllIIIIllIIIl(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(-this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glTranslatef(-lllllllllllllIlIIllIIlIllIIlIIlI, -lllllllllllllIlIIllIIlIllIIIlIll, 0.0f);
    }
    
    public String getName() {
        return this.name;
    }
    
    public float getCenterOfRotationX() {
        this.init();
        return this.centerX;
    }
    
    protected Image(final Image lllllllllllllIlIIllIIlllIIlIlIlI) {
        this.alpha = 1.0f;
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.filter = Image.lIIIIlIIlIIIII[1];
        this.width = lllllllllllllIlIIllIIlllIIlIlIlI.getWidth();
        this.height = lllllllllllllIlIIllIIlllIIlIlIlI.getHeight();
        this.texture = lllllllllllllIlIIllIIlllIIlIlIlI.texture;
        this.textureWidth = lllllllllllllIlIIllIIlllIIlIlIlI.textureWidth;
        this.textureHeight = lllllllllllllIlIIllIIlllIIlIlIlI.textureHeight;
        this.ref = lllllllllllllIlIIllIIlllIIlIlIlI.ref;
        this.textureOffsetX = lllllllllllllIlIIllIIlllIIlIlIlI.textureOffsetX;
        this.textureOffsetY = lllllllllllllIlIIllIIlllIIlIlIlI.textureOffsetY;
        this.centerX = (float)(this.width / Image.lIIIIlIIlIIIII[2]);
        this.centerY = (float)(this.height / Image.lIIIIlIIlIIIII[2]);
        this.inited = (Image.lIIIIlIIlIIIII[3] != 0);
    }
    
    private static boolean lIlllIIIIllIlll(final Object lllllllllllllIlIIllIIIllllIIIlll, final Object lllllllllllllIlIIllIIIllllIIIllI) {
        return lllllllllllllIlIIllIIIllllIIIlll != lllllllllllllIlIIllIIIllllIIIllI;
    }
    
    private static int lIlllIIIIllIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIlllIIIIlllIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public float getTextureHeight() {
        this.init();
        return this.textureHeight;
    }
    
    public Image(final Texture lllllllllllllIlIIllIIlllIIlIIIll) {
        this.alpha = 1.0f;
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.filter = Image.lIIIIlIIlIIIII[1];
        this.texture = lllllllllllllIlIIllIIlllIIlIIIll;
        this.ref = lllllllllllllIlIIllIIlllIIlIIIll.toString();
        this.clampTexture();
    }
    
    public Image(final String lllllllllllllIlIIllIIllIlllIlllI, final boolean lllllllllllllIlIIllIIllIllllIIlI, final int lllllllllllllIlIIllIIllIlllIllII, final Color lllllllllllllIlIIllIIllIllllIIII) throws SlickException {
        this.alpha = 1.0f;
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.filter = Image.lIIIIlIIlIIIII[1];
        int filter;
        if (lIlllIIIIlIllII(lllllllllllllIlIIllIIllIlllIllII, Image.lIIIIlIIlIIIII[3])) {
            filter = Image.lIIIIlIIlIIIII[1];
            "".length();
            if ("   ".length() == (0xA2 ^ 0xA6)) {
                throw null;
            }
        }
        else {
            filter = Image.lIIIIlIIlIIIII[4];
        }
        this.filter = filter;
        this.transparent = lllllllllllllIlIIllIIllIllllIIII;
        this.flipped = lllllllllllllIlIIllIIllIllllIIlI;
        try {
            this.ref = lllllllllllllIlIIllIIllIlllIlllI;
            int[] lllllllllllllIlIIllIIllIllllIllI = null;
            if (lIlllIIIIlIllIl(lllllllllllllIlIIllIIllIllllIIII)) {
                lllllllllllllIlIIllIIllIllllIllI = new int[Image.lIIIIlIIlIIIII[5]];
                lllllllllllllIlIIllIIllIllllIllI[Image.lIIIIlIIlIIIII[0]] = (int)(lllllllllllllIlIIllIIllIllllIIII.r * 255.0f);
                lllllllllllllIlIIllIIllIllllIllI[Image.lIIIIlIIlIIIII[3]] = (int)(lllllllllllllIlIIllIIllIllllIIII.g * 255.0f);
                lllllllllllllIlIIllIIllIllllIllI[Image.lIIIIlIIlIIIII[2]] = (int)(lllllllllllllIlIIllIIllIllllIIII.b * 255.0f);
            }
            this.texture = InternalTextureLoader.get().getTexture(lllllllllllllIlIIllIIllIlllIlllI, lllllllllllllIlIIllIIllIllllIIlI, this.filter, lllllllllllllIlIIllIIllIllllIllI);
            "".length();
            if (((0x8C ^ 0xC4) & ~(0x36 ^ 0x7E)) > " ".length()) {
                throw null;
            }
        }
        catch (IOException lllllllllllllIlIIllIIllIllllIlIl) {
            Log.error(lllllllllllllIlIIllIIllIllllIlIl);
            throw new SlickException(String.valueOf(new StringBuilder().append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[0]]).append(lllllllllllllIlIIllIIllIlllIlllI)), lllllllllllllIlIIllIIllIllllIlIl);
        }
    }
    
    public void setRotation(final float lllllllllllllIlIIllIIlIlIlIIlIll) {
        this.angle = lllllllllllllIlIIllIIlIlIlIIlIll % 360.0f;
    }
    
    public Image(final int lllllllllllllIlIIllIIllIllIlllII, final int lllllllllllllIlIIllIIllIllIllllI) throws SlickException {
        this(lllllllllllllIlIIllIIllIllIlllII, lllllllllllllIlIIllIIllIllIllllI, Image.lIIIIlIIlIIIII[2]);
    }
    
    public void draw(final float lllllllllllllIlIIllIIlIlllIlIIlI, final float lllllllllllllIlIIllIIlIlllIIllII, final float lllllllllllllIlIIllIIlIlllIIlIll, final Color lllllllllllllIlIIllIIlIlllIIllll) {
        this.init();
        this.draw(lllllllllllllIlIIllIIlIlllIlIIlI, lllllllllllllIlIIllIIlIlllIIllII, this.width * lllllllllllllIlIIllIIlIlllIIlIll, this.height * lllllllllllllIlIIllIIlIlllIIlIll, lllllllllllllIlIIllIIlIlllIIllll);
    }
    
    private int translate(final byte lllllllllllllIlIIllIIlIIIIlIIIII) {
        if (lIlllIIIIlllIII(lllllllllllllIlIIllIIlIIIIlIIIII)) {
            return Image.lIIIIlIIlIIIII[27] + lllllllllllllIlIIllIIlIIIIlIIIII;
        }
        return lllllllllllllIlIIllIIlIIIIlIIIII;
    }
    
    public void setTexture(final Texture lllllllllllllIlIIllIIlIIIIlIIlIl) {
        this.texture = lllllllllllllIlIIllIIlIIIIlIIlIl;
        this.reinit();
    }
    
    public Texture getTexture() {
        return this.texture;
    }
    
    public void draw(final float lllllllllllllIlIIllIIllIIIIIIllI, final float lllllllllllllIlIIllIIllIIIIIIlIl, final Color lllllllllllllIlIIllIIllIIIIIIlII) {
        this.init();
        this.draw(lllllllllllllIlIIllIIllIIIIIIllI, lllllllllllllIlIIllIIllIIIIIIlIl, (float)this.width, (float)this.height, lllllllllllllIlIIllIIllIIIIIIlII);
    }
    
    public void ensureInverted() {
        if (lIlllIIIIllIllI(lIlllIIIIllIlIl(this.textureHeight, 0.0f))) {
            this.textureOffsetY += this.textureHeight;
            this.textureHeight = -this.textureHeight;
        }
    }
    
    public boolean isDestroyed() {
        return this.destroyed;
    }
    
    public Image(final InputStream lllllllllllllIlIIllIIllIllIIIIlI, final String lllllllllllllIlIIllIIllIllIIIIIl, final boolean lllllllllllllIlIIllIIllIllIIIIII) throws SlickException {
        this(lllllllllllllIlIIllIIllIllIIIIlI, lllllllllllllIlIIllIIllIllIIIIIl, lllllllllllllIlIIllIIllIllIIIIII, Image.lIIIIlIIlIIIII[3]);
    }
    
    public void draw(final float lllllllllllllIlIIllIIlIlllIIIIll, final float lllllllllllllIlIIllIIlIlllIIIIlI, final float lllllllllllllIlIIllIIlIllIllllII, final float lllllllllllllIlIIllIIlIlllIIIIII) {
        this.init();
        this.draw(lllllllllllllIlIIllIIlIlllIIIIll, lllllllllllllIlIIllIIlIlllIIIIlI, lllllllllllllIlIIllIIlIllIllllII, lllllllllllllIlIIllIIlIlllIIIIII, Color.white);
    }
    
    public void setAlpha(final float lllllllllllllIlIIllIIlIlIIllllll) {
        this.alpha = lllllllllllllIlIIllIIlIlIIllllll;
    }
    
    public void draw(final float lllllllllllllIlIIllIIllIIIIlIIII, final float lllllllllllllIlIIllIIllIIIIIllll) {
        this.init();
        this.draw(lllllllllllllIlIIllIIllIIIIlIIII, lllllllllllllIlIIllIIllIIIIIllll, (float)this.width, (float)this.height);
    }
    
    public void drawSheared(final float lllllllllllllIlIIllIIlIllIllIlII, final float lllllllllllllIlIIllIIlIllIllIIll, final float lllllllllllllIlIIllIIlIllIllIIlI, final float lllllllllllllIlIIllIIlIllIllIIIl) {
        this.drawSheared(lllllllllllllIlIIllIIlIllIllIlII, lllllllllllllIlIIllIIlIllIllIIll, lllllllllllllIlIIllIIlIllIllIIlI, lllllllllllllIlIIllIIlIllIllIIIl, Color.white);
    }
    
    public void draw(final float lllllllllllllIlIIllIIlIIllllIIII, final float lllllllllllllIlIIllIIlIIlllIllll, final float lllllllllllllIlIIllIIlIIlllIlllI, final float lllllllllllllIlIIllIIlIIllllIllI, final float lllllllllllllIlIIllIIlIIllllIlIl, final float lllllllllllllIlIIllIIlIIllllIlII, final float lllllllllllllIlIIllIIlIIllllIIll, final float lllllllllllllIlIIllIIlIIllllIIlI) {
        this.draw(lllllllllllllIlIIllIIlIIllllIIII, lllllllllllllIlIIllIIlIIlllIllll, lllllllllllllIlIIllIIlIIlllIlllI, lllllllllllllIlIIllIIlIIllllIllI, lllllllllllllIlIIllIIlIIllllIlIl, lllllllllllllIlIIllIIlIIllllIlII, lllllllllllllIlIIllIIlIIllllIIll, lllllllllllllIlIIllIIlIIllllIIlI, Color.white);
    }
    
    public int getFilter() {
        return this.filter;
    }
    
    private static boolean lIlllIIIIllIllI(final int lllllllllllllIlIIllIIIlllIllllII) {
        return lllllllllllllIlIIllIIIlllIllllII > 0;
    }
    
    private static int lIlllIIIIllIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void drawFlash(final float lllllllllllllIlIIllIIlIlIlIlIIII, final float lllllllllllllIlIIllIIlIlIlIIllll) {
        this.drawFlash(lllllllllllllIlIIllIIlIlIlIlIIII, lllllllllllllIlIIllIIlIlIlIIllll, (float)this.getWidth(), (float)this.getHeight());
    }
    
    private static boolean lIlllIIIIlIllll(final int lllllllllllllIlIIllIIIllllIIIIII) {
        return lllllllllllllIlIIllIIIllllIIIIII != 0;
    }
    
    public Image(final ImageData lllllllllllllIlIIllIIllIlIIlllII) {
        this(lllllllllllllIlIIllIIllIlIIlllII, Image.lIIIIlIIlIIIII[3]);
    }
    
    public Image copy() {
        this.init();
        return this.getSubImage(Image.lIIIIlIIlIIIII[0], Image.lIIIIlIIlIIIII[0], this.width, this.height);
    }
    
    private static boolean lIlllIIIIlIlllI(final Object lllllllllllllIlIIllIIIllllIIIIlI) {
        return lllllllllllllIlIIllIIIllllIIIIlI == null;
    }
    
    public void setColor(final int lllllllllllllIlIIllIIllIIllIIIIl, final float lllllllllllllIlIIllIIllIIllIIllI, final float lllllllllllllIlIIllIIllIIlIlllll, final float lllllllllllllIlIIllIIllIIllIIlII, final float lllllllllllllIlIIllIIllIIllIIIll) {
        if (lIlllIIIIlIlllI(this.corners)) {
            final Color[] corners = new Color[Image.lIIIIlIIlIIIII[9]];
            corners[Image.lIIIIlIIlIIIII[0]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            corners[Image.lIIIIlIIlIIIII[3]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            corners[Image.lIIIIlIIlIIIII[2]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            corners[Image.lIIIIlIIlIIIII[5]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            this.corners = corners;
        }
        this.corners[lllllllllllllIlIIllIIllIIllIIIIl].r = lllllllllllllIlIIllIIllIIllIIllI;
        this.corners[lllllllllllllIlIIllIIllIIllIIIIl].g = lllllllllllllIlIIllIIllIIlIlllll;
        this.corners[lllllllllllllIlIIllIIllIIllIIIIl].b = lllllllllllllIlIIllIIllIIllIIlII;
        this.corners[lllllllllllllIlIIllIIllIIllIIIIl].a = lllllllllllllIlIIllIIllIIllIIIll;
    }
    
    private static void lIlllIIIIlIlIll() {
        (lIIIIlIIlIIIII = new int[29])[0] = ((0x4B ^ 0x57 ^ (0xD2 ^ 0xC3)) & (94 + 102 - 83 + 18 ^ 73 + 112 - 97 + 54 ^ -" ".length()));
        Image.lIIIIlIIlIIIII[1] = (-(0xFFFFFDCF & 0x5B77) & (0xFFFFFF6F & 0x7FD7));
        Image.lIIIIlIIlIIIII[2] = "  ".length();
        Image.lIIIIlIIlIIIII[3] = " ".length();
        Image.lIIIIlIIlIIIII[4] = (-(0xFFFF94BB & 0x7BF6) & (0xFFFFFFFB & 0x36B5));
        Image.lIIIIlIIlIIIII[5] = "   ".length();
        Image.lIIIIlIIlIIIII[6] = (-(0xFFFFF78F & 0x2871) & (0xFFFFBDE5 & 0x6FFB));
        Image.lIIIIlIIlIIIII[7] = (0xFFFFEF39 & 0x38C7);
        Image.lIIIIlIIlIIIII[8] = (-(0xFFFFFAFB & 0x15E4) & (0xFFFFBDDF & 0x7AFF));
        Image.lIIIIlIIlIIIII[9] = (181 + 64 - 227 + 169 ^ 32 + 57 + 74 + 28);
        Image.lIIIIlIIlIIIII[10] = (-(0xFFFFD7FE & 0x7DFF) & (-1 & 0x7DFF));
        Image.lIIIIlIIlIIIII[11] = (0xFFFFE7EB & 0x9F57);
        Image.lIIIIlIIlIIIII[12] = (-(0xFFFFF9FD & 0x567F) & (0xFFFFFAFF & 0x7D7F));
        Image.lIIIIlIIlIIIII[13] = (0xFFFFEFCE & 0x3931);
        Image.lIIIIlIIlIIIII[14] = (0x3D ^ 0x21 ^ (0x5D ^ 0x46));
        Image.lIIIIlIIlIIIII[15] = (0xFFFFCFD8 & 0xB47F);
        Image.lIIIIlIIlIIIII[16] = (-(0xFFFFA4FF & 0x5F9D) & (0xFFFFE79E & 0x3FFD));
        Image.lIIIIlIIlIIIII[17] = (-(0xFFFFD1E5 & 0x7FFF) & (0xFFFFFBE6 & 0x77FD));
        Image.lIIIIlIIlIIIII[18] = (0xFFFFA375 & 0x7D8A);
        Image.lIIIIlIIlIIIII[19] = (0x39 ^ 0x3C);
        Image.lIIIIlIIlIIIII[20] = (0x27 ^ 0x21);
        Image.lIIIIlIIlIIIII[21] = (0x84 ^ 0x8C);
        Image.lIIIIlIIlIIIII[22] = (0x99 ^ 0x90);
        Image.lIIIIlIIlIIIII[23] = (0xB1 ^ 0xBB);
        Image.lIIIIlIIlIIIII[24] = (159 + 44 - 197 + 167 ^ 43 + 16 - 13 + 120);
        Image.lIIIIlIIlIIIII[25] = (0x1B ^ 0x17);
        Image.lIIIIlIIlIIIII[26] = (0x58 ^ 0x55);
        Image.lIIIIlIIlIIIII[27] = (-(0xFFFFF7F5 & 0x5AFB) & (0xFFFFD3FB & 0x7FF4));
        Image.lIIIIlIIlIIIII[28] = (0x17 ^ 0x77 ^ (0xCA ^ 0xA4));
    }
    
    public float getAlpha() {
        return this.alpha;
    }
    
    public void setName(final String lllllllllllllIlIIllIIllIIlIIlIIl) {
        this.name = lllllllllllllIlIIllIIllIIlIIlIIl;
    }
    
    Image(final ImageBuffer lllllllllllllIlIIllIIllIlIlIlIll) {
        this(lllllllllllllIlIIllIIllIlIlIlIll, Image.lIIIIlIIlIIIII[3]);
        TextureImpl.bindNone();
    }
    
    public int getWidth() {
        this.init();
        return this.width;
    }
    
    public void draw(final float lllllllllllllIlIIllIIlIlllIllIll, final float lllllllllllllIlIIllIIlIlllIllIlI, final float lllllllllllllIlIIllIIlIlllIllIIl) {
        this.init();
        this.draw(lllllllllllllIlIIllIIlIlllIllIll, lllllllllllllIlIIllIIlIlllIllIlI, this.width * lllllllllllllIlIIllIIlIlllIllIIl, this.height * lllllllllllllIlIIllIIlIlllIllIIl, Color.white);
    }
    
    private static boolean lIlllIIIIlIllIl(final Object lllllllllllllIlIIllIIIllllIIIlII) {
        return lllllllllllllIlIIllIIIllllIIIlII != null;
    }
    
    private static String lIlllIIIIIllIlI(String lllllllllllllIlIIllIIIlllllllIIl, final String lllllllllllllIlIIllIIIlllllllIII) {
        lllllllllllllIlIIllIIIlllllllIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIllIIIlllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIIIllllllIlll = new StringBuilder();
        final char[] lllllllllllllIlIIllIIIllllllIllI = lllllllllllllIlIIllIIIlllllllIII.toCharArray();
        int lllllllllllllIlIIllIIIllllllIlIl = Image.lIIIIlIIlIIIII[0];
        final byte lllllllllllllIlIIllIIIlllllIllll = (Object)lllllllllllllIlIIllIIIlllllllIIl.toCharArray();
        final short lllllllllllllIlIIllIIIlllllIlllI = (short)lllllllllllllIlIIllIIIlllllIllll.length;
        Exception lllllllllllllIlIIllIIIlllllIllIl = (Exception)Image.lIIIIlIIlIIIII[0];
        while (lIlllIIIIlllIlI((int)lllllllllllllIlIIllIIIlllllIllIl, lllllllllllllIlIIllIIIlllllIlllI)) {
            final char lllllllllllllIlIIllIIIlllllllIlI = lllllllllllllIlIIllIIIlllllIllll[lllllllllllllIlIIllIIIlllllIllIl];
            lllllllllllllIlIIllIIIllllllIlll.append((char)(lllllllllllllIlIIllIIIlllllllIlI ^ lllllllllllllIlIIllIIIllllllIllI[lllllllllllllIlIIllIIIllllllIlIl % lllllllllllllIlIIllIIIllllllIllI.length]));
            "".length();
            ++lllllllllllllIlIIllIIIllllllIlIl;
            ++lllllllllllllIlIIllIIIlllllIllIl;
            "".length();
            if (" ".length() == (0x3F ^ 0x3B)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIIIllllllIlll);
    }
    
    protected void reinit() {
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.init();
    }
    
    public void drawFlash(final float lllllllllllllIlIIllIIlIlIlIlllII, final float lllllllllllllIlIIllIIlIlIlIllIll, final float lllllllllllllIlIIllIIlIlIlIllIlI, final float lllllllllllllIlIIllIIlIlIlIllIIl, final Color lllllllllllllIlIIllIIlIlIlIllllI) {
        this.init();
        lllllllllllllIlIIllIIlIlIlIllllI.bind();
        this.texture.bind();
        if (lIlllIIIIlIllll(Image.GL.canSecondaryColor() ? 1 : 0)) {
            Image.GL.glEnable(Image.lIIIIlIIlIIIII[15]);
            Image.GL.glSecondaryColor3ubEXT((byte)(lllllllllllllIlIIllIIlIlIlIllllI.r * 255.0f), (byte)(lllllllllllllIlIIllIIlIlIlIllllI.g * 255.0f), (byte)(lllllllllllllIlIIllIIlIlIlIllllI.b * 255.0f));
        }
        Image.GL.glTexEnvi(Image.lIIIIlIIlIIIII[16], Image.lIIIIlIIlIIIII[17], Image.lIIIIlIIlIIIII[18]);
        Image.GL.glTranslatef(lllllllllllllIlIIllIIlIlIlIlllII, lllllllllllllIlIIllIIlIlIlIllIll, 0.0f);
        if (lIlllIIIIlIllll(lIlllIIIIllIIlI(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glBegin(Image.lIIIIlIIlIIIII[14]);
        this.drawEmbedded(0.0f, 0.0f, lllllllllllllIlIIllIIlIlIlIllIlI, lllllllllllllIlIIllIIlIlIlIllIIl);
        Image.GL.glEnd();
        if (lIlllIIIIlIllll(lIlllIIIIllIIlI(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(-this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glTranslatef(-lllllllllllllIlIIllIIlIlIlIlllII, -lllllllllllllIlIIllIIlIlIlIllIll, 0.0f);
        if (lIlllIIIIlIllll(Image.GL.canSecondaryColor() ? 1 : 0)) {
            Image.GL.glDisable(Image.lIIIIlIIlIIIII[15]);
        }
    }
    
    private static int lIlllIIIIllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlllIIIIlllIII(final int lllllllllllllIlIIllIIIlllIlllllI) {
        return lllllllllllllIlIIllIIIlllIlllllI < 0;
    }
    
    public void drawSheared(final float lllllllllllllIlIIllIIlIllIlIIlII, final float lllllllllllllIlIIllIIlIllIIlllIl, final float lllllllllllllIlIIllIIlIllIIlllII, final float lllllllllllllIlIIllIIlIllIlIIIIl, Color lllllllllllllIlIIllIIlIllIIllIlI) {
        if (lIlllIIIIlIllll(lIlllIIIIllIIII(this.alpha, 1.0f))) {
            if (lIlllIIIIlIlllI(lllllllllllllIlIIllIIlIllIIllIlI)) {
                lllllllllllllIlIIllIIlIllIIllIlI = Color.white;
            }
            final Color color;
            lllllllllllllIlIIllIIlIllIIllIlI = (color = new Color((Color)lllllllllllllIlIIllIIlIllIIllIlI));
            color.a *= this.alpha;
        }
        if (lIlllIIIIlIllIl(lllllllllllllIlIIllIIlIllIIllIlI)) {
            ((Color)lllllllllllllIlIIllIIlIllIIllIlI).bind();
        }
        this.texture.bind();
        Image.GL.glTranslatef(lllllllllllllIlIIllIIlIllIlIIlII, lllllllllllllIlIIllIIlIllIIlllIl, 0.0f);
        if (lIlllIIIIlIllll(lIlllIIIIllIIII(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glBegin(Image.lIIIIlIIlIIIII[14]);
        this.init();
        Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY);
        Image.GL.glVertex3f(0.0f, 0.0f, 0.0f);
        Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY + this.textureHeight);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIllIIlllII, (float)this.height, 0.0f);
        Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY + this.textureHeight);
        Image.GL.glVertex3f(this.width + lllllllllllllIlIIllIIlIllIIlllII, this.height + lllllllllllllIlIIllIIlIllIlIIIIl, 0.0f);
        Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY);
        Image.GL.glVertex3f((float)this.width, lllllllllllllIlIIllIIlIllIlIIIIl, 0.0f);
        Image.GL.glEnd();
        if (lIlllIIIIlIllll(lIlllIIIIllIIII(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(-this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glTranslatef(-lllllllllllllIlIIllIIlIllIlIIlII, -lllllllllllllIlIIllIIlIllIIlllIl, 0.0f);
    }
    
    public void bind() {
        this.texture.bind();
    }
    
    private static String lIlllIIIIIllIII(final String lllllllllllllIlIIllIIIllllIlIlIl, final String lllllllllllllIlIIllIIIllllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIllllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIllllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIIIllllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIIIllllIllIIl.init(Image.lIIIIlIIlIIIII[2], lllllllllllllIlIIllIIIllllIllIlI);
            return new String(lllllllllllllIlIIllIIIllllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIllllIllIII) {
            lllllllllllllIlIIllIIIllllIllIII.printStackTrace();
            return null;
        }
    }
    
    public float getTextureOffsetX() {
        this.init();
        return this.textureOffsetX;
    }
    
    public void drawEmbedded(final float lllllllllllllIlIIllIIlIIllIIIIII, final float lllllllllllllIlIIllIIlIIlIllIllI, final float lllllllllllllIlIIllIIlIIlIlllllI, final float lllllllllllllIlIIllIIlIIlIllIlII, final float lllllllllllllIlIIllIIlIIlIllIIll, final float lllllllllllllIlIIllIIlIIlIllIIlI, final float lllllllllllllIlIIllIIlIIlIllIIIl, final float lllllllllllllIlIIllIIlIIlIlllIIl) {
        this.drawEmbedded(lllllllllllllIlIIllIIlIIllIIIIII, lllllllllllllIlIIllIIlIIlIllIllI, lllllllllllllIlIIllIIlIIlIlllllI, lllllllllllllIlIIllIIlIIlIllIlII, lllllllllllllIlIIllIIlIIlIllIIll, lllllllllllllIlIIllIIlIIlIllIIlI, lllllllllllllIlIIllIIlIIlIllIIIl, lllllllllllllIlIIllIIlIIlIlllIIl, null);
    }
    
    public Image(final ImageData lllllllllllllIlIIllIIllIlIIlIlIl, final int lllllllllllllIlIIllIIllIlIIlIIIl) {
        this.alpha = 1.0f;
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.filter = Image.lIIIIlIIlIIIII[1];
        try {
            int filter;
            if (lIlllIIIIlIllII(lllllllllllllIlIIllIIllIlIIlIIIl, Image.lIIIIlIIlIIIII[3])) {
                filter = Image.lIIIIlIIlIIIII[1];
                "".length();
                if ((0xA3 ^ 0xA7) < 0) {
                    throw null;
                }
            }
            else {
                filter = Image.lIIIIlIIlIIIII[4];
            }
            this.filter = filter;
            this.texture = InternalTextureLoader.get().getTexture(lllllllllllllIlIIllIIllIlIIlIlIl, this.filter);
            this.ref = this.texture.toString();
            "".length();
            if ("   ".length() >= (0xAA ^ 0xAE)) {
                throw null;
            }
        }
        catch (IOException lllllllllllllIlIIllIIllIlIIlIlll) {
            Log.error(lllllllllllllIlIIllIIllIlIIlIlll);
        }
    }
    
    private static String lIlllIIIIIllIll(final String lllllllllllllIlIIllIIIlllllIIlII, final String lllllllllllllIlIIllIIIlllllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIlllllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIlllllIIIIl.getBytes(StandardCharsets.UTF_8)), Image.lIIIIlIIlIIIII[21]), "DES");
            final Cipher lllllllllllllIlIIllIIIlllllIIllI = Cipher.getInstance("DES");
            lllllllllllllIlIIllIIIlllllIIllI.init(Image.lIIIIlIIlIIIII[2], lllllllllllllIlIIllIIIlllllIIlll);
            return new String(lllllllllllllIlIIllIIIlllllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIlllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIlllllIIlIl) {
            lllllllllllllIlIIllIIIlllllIIlIl.printStackTrace();
            return null;
        }
    }
    
    public void drawWarped(final float lllllllllllllIlIIllIIlIIIllIllll, final float lllllllllllllIlIIllIIlIIIllIIlIl, final float lllllllllllllIlIIllIIlIIIllIIlII, final float lllllllllllllIlIIllIIlIIIllIllII, final float lllllllllllllIlIIllIIlIIIllIIIlI, final float lllllllllllllIlIIllIIlIIIllIIIIl, final float lllllllllllllIlIIllIIlIIIllIlIIl, final float lllllllllllllIlIIllIIlIIIllIlIII) {
        Color.white.bind();
        this.texture.bind();
        Image.GL.glTranslatef(lllllllllllllIlIIllIIlIIIllIllll, lllllllllllllIlIIllIIlIIIllIIlIl, 0.0f);
        if (lIlllIIIIlIllll(lIlllIIIIllIlII(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glBegin(Image.lIIIIlIIlIIIII[14]);
        this.init();
        Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY);
        Image.GL.glVertex3f(0.0f, 0.0f, 0.0f);
        Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY + this.textureHeight);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIIIllIIlII - lllllllllllllIlIIllIIlIIIllIllll, lllllllllllllIlIIllIIlIIIllIllII - lllllllllllllIlIIllIIlIIIllIIlIl, 0.0f);
        Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY + this.textureHeight);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIIIllIIIlI - lllllllllllllIlIIllIIlIIIllIllll, lllllllllllllIlIIllIIlIIIllIIIIl - lllllllllllllIlIIllIIlIIIllIIlIl, 0.0f);
        Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIIIllIlIIl - lllllllllllllIlIIllIIlIIIllIllll, lllllllllllllIlIIllIIlIIIllIlIII - lllllllllllllIlIIllIIlIIIllIIlIl, 0.0f);
        Image.GL.glEnd();
        if (lIlllIIIIlIllll(lIlllIIIIllIlII(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(-this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glTranslatef(-lllllllllllllIlIIllIIlIIIllIllll, -lllllllllllllIlIIllIIlIIIllIIlIl, 0.0f);
    }
    
    private static int lIlllIIIIllIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setColor(final int lllllllllllllIlIIllIIllIIlIlIllI, final float lllllllllllllIlIIllIIllIIlIlIlIl, final float lllllllllllllIlIIllIIllIIlIlIlII, final float lllllllllllllIlIIllIIllIIlIlIIll) {
        if (lIlllIIIIlIlllI(this.corners)) {
            final Color[] corners = new Color[Image.lIIIIlIIlIIIII[9]];
            corners[Image.lIIIIlIIlIIIII[0]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            corners[Image.lIIIIlIIlIIIII[3]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            corners[Image.lIIIIlIIlIIIII[2]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            corners[Image.lIIIIlIIlIIIII[5]] = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            this.corners = corners;
        }
        this.corners[lllllllllllllIlIIllIIllIIlIlIllI].r = lllllllllllllIlIIllIIllIIlIlIlIl;
        this.corners[lllllllllllllIlIIllIIllIIlIlIllI].g = lllllllllllllIlIIllIIllIIlIlIlII;
        this.corners[lllllllllllllIlIIllIIllIIlIlIllI].b = lllllllllllllIlIIllIIllIIlIlIIll;
    }
    
    private static boolean lIlllIIIIlllIlI(final int lllllllllllllIlIIllIIIllllIIlIll, final int lllllllllllllIlIIllIIIllllIIlIlI) {
        return lllllllllllllIlIIllIIIllllIIlIll < lllllllllllllIlIIllIIIllllIIlIlI;
    }
    
    public void flushPixelData() {
        this.pixelData = null;
    }
    
    public Image(final InputStream lllllllllllllIlIIllIIllIlIlllIIl, final String lllllllllllllIlIIllIIllIlIlllIII, final boolean lllllllllllllIlIIllIIllIlIllIIlI, final int lllllllllllllIlIIllIIllIlIllIIIl) throws SlickException {
        this.alpha = 1.0f;
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.filter = Image.lIIIIlIIlIIIII[1];
        this.load(lllllllllllllIlIIllIIllIlIlllIIl, lllllllllllllIlIIllIIllIlIlllIII, lllllllllllllIlIIllIIllIlIllIIlI, lllllllllllllIlIIllIIllIlIllIIIl, null);
    }
    
    public float getCenterOfRotationY() {
        this.init();
        return this.centerY;
    }
    
    public Image(final String lllllllllllllIlIIllIIllIllllllll, final boolean lllllllllllllIlIIllIIllIlllllllI, final int lllllllllllllIlIIllIIllIllllllIl) throws SlickException {
        this(lllllllllllllIlIIllIIllIllllllll, lllllllllllllIlIIllIIllIlllllllI, lllllllllllllIlIIllIIllIllllllIl, null);
    }
    
    protected void initImpl() {
    }
    
    static {
        lIlllIIIIlIlIll();
        lIlllIIIIlIlIlI();
        TOP_LEFT = Image.lIIIIlIIlIIIII[0];
        BOTTOM_LEFT = Image.lIIIIlIIlIIIII[5];
        BOTTOM_RIGHT = Image.lIIIIlIIlIIIII[2];
        FILTER_LINEAR = Image.lIIIIlIIlIIIII[3];
        TOP_RIGHT = Image.lIIIIlIIlIIIII[3];
        FILTER_NEAREST = Image.lIIIIlIIlIIIII[2];
        Image.GL = Renderer.get();
    }
    
    public Image getScaledCopy(final float lllllllllllllIlIIllIIlIIIlIlIIlI) {
        this.init();
        return this.getScaledCopy((int)(this.width * lllllllllllllIlIIllIIlIIIlIlIIlI), (int)(this.height * lllllllllllllIlIIllIIlIIIlIlIIlI));
    }
    
    public void destroy() throws SlickException {
        if (lIlllIIIIlIllll(this.isDestroyed() ? 1 : 0)) {
            return;
        }
        this.destroyed = (Image.lIIIIlIIlIIIII[3] != 0);
        this.texture.release();
        GraphicsFactory.releaseGraphicsForImage(this);
    }
    
    public Image(final String lllllllllllllIlIIllIIlllIIIlIIll, final Color lllllllllllllIlIIllIIlllIIIlIIlI) throws SlickException {
        this(lllllllllllllIlIIllIIlllIIIlIIll, (boolean)(Image.lIIIIlIIlIIIII[0] != 0), Image.lIIIIlIIlIIIII[3], lllllllllllllIlIIllIIlllIIIlIIlI);
    }
    
    private void load(final InputStream lllllllllllllIlIIllIIllIIIllIIII, final String lllllllllllllIlIIllIIllIIIllIlIl, final boolean lllllllllllllIlIIllIIllIIIllIlII, final int lllllllllllllIlIIllIIllIIIlIllIl, final Color lllllllllllllIlIIllIIllIIIllIIlI) throws SlickException {
        int filter;
        if (lIlllIIIIlIllII(lllllllllllllIlIIllIIllIIIlIllIl, Image.lIIIIlIIlIIIII[3])) {
            filter = Image.lIIIIlIIlIIIII[1];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            filter = Image.lIIIIlIIlIIIII[4];
        }
        this.filter = filter;
        try {
            this.ref = lllllllllllllIlIIllIIllIIIllIlIl;
            int[] lllllllllllllIlIIllIIllIIIlllIIl = null;
            if (lIlllIIIIlIllIl(lllllllllllllIlIIllIIllIIIllIIlI)) {
                lllllllllllllIlIIllIIllIIIlllIIl = new int[Image.lIIIIlIIlIIIII[5]];
                lllllllllllllIlIIllIIllIIIlllIIl[Image.lIIIIlIIlIIIII[0]] = (int)(lllllllllllllIlIIllIIllIIIllIIlI.r * 255.0f);
                lllllllllllllIlIIllIIllIIIlllIIl[Image.lIIIIlIIlIIIII[3]] = (int)(lllllllllllllIlIIllIIllIIIllIIlI.g * 255.0f);
                lllllllllllllIlIIllIIllIIIlllIIl[Image.lIIIIlIIlIIIII[2]] = (int)(lllllllllllllIlIIllIIllIIIllIIlI.b * 255.0f);
            }
            this.texture = InternalTextureLoader.get().getTexture(lllllllllllllIlIIllIIllIIIllIIII, lllllllllllllIlIIllIIllIIIllIlIl, lllllllllllllIlIIllIIllIIIllIlII, this.filter, lllllllllllllIlIIllIIllIIIlllIIl);
            "".length();
            if ((0x59 ^ 0x5D) <= 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIIllIIllIIIlllIII) {
            Log.error(lllllllllllllIlIIllIIllIIIlllIII);
            throw new SlickException(String.valueOf(new StringBuilder().append(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[5]]).append(lllllllllllllIlIIllIIllIIIllIlIl)), lllllllllllllIlIIllIIllIIIlllIII);
        }
    }
    
    public void rotate(final float lllllllllllllIlIIllIIlIlIIllIlll) {
        this.angle += lllllllllllllIlIIllIIlIlIIllIlll;
        this.angle %= 360.0f;
    }
    
    public void drawEmbedded(final float lllllllllllllIlIIllIIlIIlIIIlIlI, final float lllllllllllllIlIIllIIlIIlIIllIll, final float lllllllllllllIlIIllIIlIIlIIIlIII, final float lllllllllllllIlIIllIIlIIlIIllIIl, final float lllllllllllllIlIIllIIlIIlIIllIII, final float lllllllllllllIlIIllIIlIIlIIlIlll, final float lllllllllllllIlIIllIIlIIlIIlIllI, final float lllllllllllllIlIIllIIlIIlIIIIIll, final Color lllllllllllllIlIIllIIlIIlIIIIIlI) {
        if (lIlllIIIIlIllIl(lllllllllllllIlIIllIIlIIlIIIIIlI)) {
            lllllllllllllIlIIllIIlIIlIIIIIlI.bind();
        }
        final float lllllllllllllIlIIllIIlIIlIIlIIll = lllllllllllllIlIIllIIlIIlIIIlIII - lllllllllllllIlIIllIIlIIlIIIlIlI;
        final float lllllllllllllIlIIllIIlIIlIIlIIlI = lllllllllllllIlIIllIIlIIlIIllIIl - lllllllllllllIlIIllIIlIIlIIllIll;
        final float lllllllllllllIlIIllIIlIIlIIlIIIl = lllllllllllllIlIIllIIlIIlIIlIllI - lllllllllllllIlIIllIIlIIlIIllIII;
        final float lllllllllllllIlIIllIIlIIlIIlIIII = lllllllllllllIlIIllIIlIIlIIIIIll - lllllllllllllIlIIllIIlIIlIIlIlll;
        final float lllllllllllllIlIIllIIlIIlIIIllll = lllllllllllllIlIIllIIlIIlIIllIII / this.width * this.textureWidth + this.textureOffsetX;
        final float lllllllllllllIlIIllIIlIIlIIIlllI = lllllllllllllIlIIllIIlIIlIIlIlll / this.height * this.textureHeight + this.textureOffsetY;
        final float lllllllllllllIlIIllIIlIIlIIIllIl = lllllllllllllIlIIllIIlIIlIIlIIIl / this.width * this.textureWidth;
        final float lllllllllllllIlIIllIIlIIlIIIllII = lllllllllllllIlIIllIIlIIlIIlIIII / this.height * this.textureHeight;
        Image.GL.glTexCoord2f(lllllllllllllIlIIllIIlIIlIIIllll, lllllllllllllIlIIllIIlIIlIIIlllI);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIIlIIIlIlI, lllllllllllllIlIIllIIlIIlIIllIll, 0.0f);
        Image.GL.glTexCoord2f(lllllllllllllIlIIllIIlIIlIIIllll, lllllllllllllIlIIllIIlIIlIIIlllI + lllllllllllllIlIIllIIlIIlIIIllII);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIIlIIIlIlI, lllllllllllllIlIIllIIlIIlIIllIll + lllllllllllllIlIIllIIlIIlIIlIIlI, 0.0f);
        Image.GL.glTexCoord2f(lllllllllllllIlIIllIIlIIlIIIllll + lllllllllllllIlIIllIIlIIlIIIllIl, lllllllllllllIlIIllIIlIIlIIIlllI + lllllllllllllIlIIllIIlIIlIIIllII);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIIlIIIlIlI + lllllllllllllIlIIllIIlIIlIIlIIll, lllllllllllllIlIIllIIlIIlIIllIll + lllllllllllllIlIIllIIlIIlIIlIIlI, 0.0f);
        Image.GL.glTexCoord2f(lllllllllllllIlIIllIIlIIlIIIllll + lllllllllllllIlIIllIIlIIlIIIllIl, lllllllllllllIlIIllIIlIIlIIIlllI);
        Image.GL.glVertex3f(lllllllllllllIlIIllIIlIIlIIIlIlI + lllllllllllllIlIIllIIlIIlIIlIIll, lllllllllllllIlIIllIIlIIlIIllIll, 0.0f);
    }
    
    public Image(final String lllllllllllllIlIIllIIlllIIIIlIlI, final boolean lllllllllllllIlIIllIIlllIIIIlIIl) throws SlickException {
        this(lllllllllllllIlIIllIIlllIIIIlIlI, lllllllllllllIlIIllIIlllIIIIlIIl, Image.lIIIIlIIlIIIII[3]);
    }
    
    public void draw(final float lllllllllllllIlIIllIIlIIllIlIIll, final float lllllllllllllIlIIllIIlIIllIlIIlI, final float lllllllllllllIlIIllIIlIIllIllIll, final float lllllllllllllIlIIllIIlIIllIlIIII, final float lllllllllllllIlIIllIIlIIllIIllll, final float lllllllllllllIlIIllIIlIIllIIlllI, final float lllllllllllllIlIIllIIlIIllIIllIl, final float lllllllllllllIlIIllIIlIIllIIllII, Color lllllllllllllIlIIllIIlIIllIIlIll) {
        this.init();
        if (lIlllIIIIlIllll(lIlllIIIIllIIll(this.alpha, 1.0f))) {
            if (lIlllIIIIlIlllI(lllllllllllllIlIIllIIlIIllIIlIll)) {
                lllllllllllllIlIIllIIlIIllIIlIll = Color.white;
            }
            final Color color;
            lllllllllllllIlIIllIIlIIllIIlIll = (color = new Color((Color)lllllllllllllIlIIllIIlIIllIIlIll));
            color.a *= this.alpha;
        }
        ((Color)lllllllllllllIlIIllIIlIIllIIlIll).bind();
        this.texture.bind();
        Image.GL.glTranslatef(lllllllllllllIlIIllIIlIIllIlIIll, lllllllllllllIlIIllIIlIIllIlIIlI, 0.0f);
        if (lIlllIIIIlIllll(lIlllIIIIllIIll(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glBegin(Image.lIIIIlIIlIIIII[14]);
        this.drawEmbedded(0.0f, 0.0f, lllllllllllllIlIIllIIlIIllIllIll - lllllllllllllIlIIllIIlIIllIlIIll, lllllllllllllIlIIllIIlIIllIlIIII - lllllllllllllIlIIllIIlIIllIlIIlI, lllllllllllllIlIIllIIlIIllIIllll, lllllllllllllIlIIllIIlIIllIIlllI, lllllllllllllIlIIllIIlIIllIIllIl, lllllllllllllIlIIllIIlIIllIIllII);
        Image.GL.glEnd();
        if (lIlllIIIIlIllll(lIlllIIIIllIIll(this.angle, 0.0f))) {
            Image.GL.glTranslatef(this.centerX, this.centerY, 0.0f);
            Image.GL.glRotatef(-this.angle, 0.0f, 0.0f, 1.0f);
            Image.GL.glTranslatef(-this.centerX, -this.centerY, 0.0f);
        }
        Image.GL.glTranslatef(-lllllllllllllIlIIllIIlIIllIlIIll, -lllllllllllllIlIIllIIlIIllIlIIlI, 0.0f);
    }
    
    private static void lIlllIIIIlIlIlI() {
        (lIIIIlIIIllIII = new String[Image.lIIIIlIIlIIIII[28]])[Image.lIIIIlIIlIIIII[0]] = lIlllIIIIIllIII("tueCUQMsAHZI9vCs+ncY74osvK3cV7BrTJV/RkPU7NQ=", "oeQYM");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[3]] = lIlllIIIIIllIII("SP2GqB3gw+i0xuW6fHZKy63Lv5TUzWlupSllnUeyX+I=", "eyvRb");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[2]] = lIlllIIIIIllIlI("Cw==", "sSXAg");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[5]] = lIlllIIIIIllIll("FEstn54a6g8uQoXuGx6ooR4QOuxw7atsvQqKcBSizHs=", "WaNEb");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[9]] = lIlllIIIIIllIlI("MRgIeAkVAgQsH0UDBT0fEVAEK1oLHxl4GRACHz0UERwUeBMLUBgrHw==", "epmXz");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[19]] = lIlllIIIIIllIII("2K+c+b78whjIbT/2XTpE+doQCgJZAeMYwyaFSMVDmpta5zDZF33ffgeAtx+72gurcyqAFG0lKdVIyeBG/KLEaxCplh8DZ9D1TRYObDOkShwC4oq83x5Eag==", "HVGIZ");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[20]] = lIlllIIIIIllIII("ZoxZYsLwz10=", "iBnsn");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[14]] = lIlllIIIIIllIlI("Qg==", "borRk");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[21]] = lIlllIIIIIllIlI("Dg==", "vqXxZ");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[22]] = lIlllIIIIIllIlI("WVI=", "yrpnE");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[23]] = lIlllIIIIIllIII("7a9wYIG+gsQ=", "IIVku");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[24]] = lIlllIIIIIllIll("rQOnDu1LDOE=", "BiqdR");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[25]] = lIlllIIIIIllIII("u3lrwXwtLqA=", "dEfTZ");
        Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[26]] = lIlllIIIIIllIll("jDsdeAGXo2U=", "dKmPJ");
    }
    
    public void setCenterOfRotation(final float lllllllllllllIlIIllIIlIlIlllIIIl, final float lllllllllllllIlIIllIIlIlIlllIIII) {
        this.centerX = lllllllllllllIlIIllIIlIlIlllIIIl;
        this.centerY = lllllllllllllIlIIllIIlIlIlllIIII;
    }
    
    public void drawEmbedded(final float lllllllllllllIlIIllIIlIlllllIlII, final float lllllllllllllIlIIllIIlIllllllIII, final float lllllllllllllIlIIllIIlIlllllIIlI, final float lllllllllllllIlIIllIIlIlllllIllI) {
        this.init();
        if (lIlllIIIIlIlllI(this.corners)) {
            Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII, lllllllllllllIlIIllIIlIllllllIII, 0.0f);
            Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY + this.textureHeight);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII, lllllllllllllIlIIllIIlIllllllIII + lllllllllllllIlIIllIIlIlllllIllI, 0.0f);
            Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY + this.textureHeight);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII + lllllllllllllIlIIllIIlIlllllIIlI, lllllllllllllIlIIllIIlIllllllIII + lllllllllllllIlIIllIIlIlllllIllI, 0.0f);
            Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII + lllllllllllllIlIIllIIlIlllllIIlI, lllllllllllllIlIIllIIlIllllllIII, 0.0f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.corners[Image.lIIIIlIIlIIIII[0]].bind();
            Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII, lllllllllllllIlIIllIIlIllllllIII, 0.0f);
            this.corners[Image.lIIIIlIIlIIIII[5]].bind();
            Image.GL.glTexCoord2f(this.textureOffsetX, this.textureOffsetY + this.textureHeight);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII, lllllllllllllIlIIllIIlIllllllIII + lllllllllllllIlIIllIIlIlllllIllI, 0.0f);
            this.corners[Image.lIIIIlIIlIIIII[2]].bind();
            Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY + this.textureHeight);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII + lllllllllllllIlIIllIIlIlllllIIlI, lllllllllllllIlIIllIIlIllllllIII + lllllllllllllIlIIllIIlIlllllIllI, 0.0f);
            this.corners[Image.lIIIIlIIlIIIII[3]].bind();
            Image.GL.glTexCoord2f(this.textureOffsetX + this.textureWidth, this.textureOffsetY);
            Image.GL.glVertex3f(lllllllllllllIlIIllIIlIlllllIlII + lllllllllllllIlIIllIIlIlllllIIlI, lllllllllllllIlIIllIIlIllllllIII, 0.0f);
        }
    }
    
    public void endUse() {
        if (lIlllIIIIllIlll(Image.inUse, this)) {
            throw new RuntimeException(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[9]]);
        }
        Image.inUse = null;
        Image.GL.glEnd();
    }
    
    private static boolean lIlllIIIIlIllII(final int lllllllllllllIlIIllIIIllllIIllll, final int lllllllllllllIlIIllIIIllllIIlllI) {
        return lllllllllllllIlIIllIIIllllIIllll == lllllllllllllIlIIllIIIllllIIlllI;
    }
    
    protected Image() {
        this.alpha = 1.0f;
        this.inited = (Image.lIIIIlIIlIIIII[0] != 0);
        this.filter = Image.lIIIIlIIlIIIII[1];
    }
    
    public int getHeight() {
        this.init();
        return this.height;
    }
    
    public Graphics getGraphics() throws SlickException {
        return GraphicsFactory.getGraphicsForImage(this);
    }
    
    Image(final ImageBuffer lllllllllllllIlIIllIIllIlIlIIIll, final int lllllllllllllIlIIllIIllIlIlIIIlI) {
        this((ImageData)lllllllllllllIlIIllIIllIlIlIIIll, lllllllllllllIlIIllIIllIlIlIIIlI);
        TextureImpl.bindNone();
    }
    
    public void draw(final float lllllllllllllIlIIllIIlIlIIIlIIII, final float lllllllllllllIlIIllIIlIlIIIIlIII, final float lllllllllllllIlIIllIIlIlIIIIIlll, final float lllllllllllllIlIIllIIlIlIIIIllIl, final float lllllllllllllIlIIllIIlIlIIIIllII, final float lllllllllllllIlIIllIIlIlIIIIlIll) {
        this.draw(lllllllllllllIlIIllIIlIlIIIlIIII, lllllllllllllIlIIllIIlIlIIIIlIII, lllllllllllllIlIIllIIlIlIIIlIIII + this.width, lllllllllllllIlIIllIIlIlIIIIlIII + this.height, lllllllllllllIlIIllIIlIlIIIIIlll, lllllllllllllIlIIllIIlIlIIIIllIl, lllllllllllllIlIIllIIlIlIIIIllII, lllllllllllllIlIIllIIlIlIIIIlIll);
    }
    
    public void setFilter(final int lllllllllllllIlIIllIIllIlllIIlII) {
        int filter;
        if (lIlllIIIIlIllII(lllllllllllllIlIIllIIllIlllIIlII, Image.lIIIIlIIlIIIII[3])) {
            filter = Image.lIIIIlIIlIIIII[1];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            filter = Image.lIIIIlIIlIIIII[4];
        }
        this.filter = filter;
        this.texture.bind();
        Image.GL.glTexParameteri(Image.lIIIIlIIlIIIII[6], Image.lIIIIlIIlIIIII[7], this.filter);
        Image.GL.glTexParameteri(Image.lIIIIlIIlIIIII[6], Image.lIIIIlIIlIIIII[8], this.filter);
    }
    
    public void startUse() {
        if (lIlllIIIIlIllIl(Image.inUse)) {
            throw new RuntimeException(Image.lIIIIlIIIllIII[Image.lIIIIlIIlIIIII[19]]);
        }
        (Image.inUse = this).init();
        Color.white.bind();
        this.texture.bind();
        Image.GL.glBegin(Image.lIIIIlIIlIIIII[14]);
    }
    
    public String getResourceReference() {
        return this.ref;
    }
    
    public void clampTexture() {
        if (lIlllIIIIlIllll(Image.GL.canTextureMirrorClamp() ? 1 : 0)) {
            Image.GL.glTexParameteri(Image.lIIIIlIIlIIIII[6], Image.lIIIIlIIlIIIII[10], Image.lIIIIlIIlIIIII[11]);
            Image.GL.glTexParameteri(Image.lIIIIlIIlIIIII[6], Image.lIIIIlIIlIIIII[12], Image.lIIIIlIIlIIIII[11]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            Image.GL.glTexParameteri(Image.lIIIIlIIlIIIII[6], Image.lIIIIlIIlIIIII[10], Image.lIIIIlIIlIIIII[13]);
            Image.GL.glTexParameteri(Image.lIIIIlIIlIIIII[6], Image.lIIIIlIIlIIIII[12], Image.lIIIIlIIlIIIII[13]);
        }
    }
    
    public Image getScaledCopy(final int lllllllllllllIlIIllIIlIIIlIIIllI, final int lllllllllllllIlIIllIIlIIIlIIIlIl) {
        this.init();
        final Image lllllllllllllIlIIllIIlIIIlIIlIII = this.copy();
        lllllllllllllIlIIllIIlIIIlIIlIII.width = lllllllllllllIlIIllIIlIIIlIIIllI;
        lllllllllllllIlIIllIIlIIIlIIlIII.height = lllllllllllllIlIIllIIlIIIlIIIlIl;
        lllllllllllllIlIIllIIlIIIlIIlIII.centerX = (float)(lllllllllllllIlIIllIIlIIIlIIIllI / Image.lIIIIlIIlIIIII[2]);
        lllllllllllllIlIIllIIlIIIlIIlIII.centerY = (float)(lllllllllllllIlIIllIIlIIIlIIIlIl / Image.lIIIIlIIlIIIII[2]);
        return lllllllllllllIlIIllIIlIIIlIIlIII;
    }
}
