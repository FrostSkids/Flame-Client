// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.opengl.renderer.SGL;

public class TextureImpl implements Texture
{
    private /* synthetic */ int texHeight;
    private /* synthetic */ boolean alpha;
    static /* synthetic */ Texture lastBind;
    private /* synthetic */ int textureID;
    private /* synthetic */ float widthRatio;
    protected static /* synthetic */ SGL GL;
    private /* synthetic */ int texWidth;
    private /* synthetic */ ReloadData reloadData;
    private /* synthetic */ int height;
    private static final /* synthetic */ int[] lIIlIlIIllIIlI;
    private /* synthetic */ int width;
    private /* synthetic */ float heightRatio;
    private /* synthetic */ String cacheName;
    private /* synthetic */ String ref;
    private /* synthetic */ int target;
    
    private static boolean llIIlllllllIlIl(final Object lllllllllllllIIllIlIIIllllllIIIl) {
        return lllllllllllllIIllIlIIIllllllIIIl != null;
    }
    
    public float getWidth() {
        return this.widthRatio;
    }
    
    public String getTextureRef() {
        return this.ref;
    }
    
    protected TextureImpl() {
    }
    
    public byte[] getTextureData() {
        int n;
        if (llIIlllllllIIll(this.hasAlpha() ? 1 : 0)) {
            n = TextureImpl.lIIlIlIIllIIlI[2];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            n = TextureImpl.lIIlIlIIllIIlI[3];
        }
        final ByteBuffer lllllllllllllIIllIlIIlIIIIIlllIl = BufferUtils.createByteBuffer(n * this.texWidth * this.texHeight);
        this.bind();
        final SGL gl = TextureImpl.GL;
        final int n2 = TextureImpl.lIIlIlIIllIIlI[0];
        final int n3 = TextureImpl.lIIlIlIIllIIlI[4];
        int n4;
        if (llIIlllllllIIll(this.hasAlpha() ? 1 : 0)) {
            n4 = TextureImpl.lIIlIlIIllIIlI[5];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            n4 = TextureImpl.lIIlIlIIllIIlI[6];
        }
        gl.glGetTexImage(n2, n3, n4, TextureImpl.lIIlIlIIllIIlI[7], lllllllllllllIIllIlIIlIIIIIlllIl);
        final byte[] lllllllllllllIIllIlIIlIIIIIlllII = new byte[lllllllllllllIIllIlIIlIIIIIlllIl.limit()];
        lllllllllllllIIllIlIIlIIIIIlllIl.get(lllllllllllllIIllIlIIlIIIIIlllII);
        "".length();
        lllllllllllllIIllIlIIlIIIIIlllIl.clear();
        "".length();
        return lllllllllllllIIllIlIIlIIIIIlllII;
    }
    
    public int getTextureID() {
        return this.textureID;
    }
    
    private static void llIIlllllllIIIl() {
        (lIIlIlIIllIIlI = new int[10])[0] = (0xFFFF8FFF & 0x7DE1);
        TextureImpl.lIIlIlIIllIIlI[1] = " ".length();
        TextureImpl.lIIlIlIIllIIlI[2] = (0xD ^ 0x9);
        TextureImpl.lIIlIlIIllIIlI[3] = "   ".length();
        TextureImpl.lIIlIlIIllIIlI[4] = ((0x43 ^ 0x17) & ~(0x8 ^ 0x5C));
        TextureImpl.lIIlIlIIllIIlI[5] = (0xFFFFF91E & 0x1FE9);
        TextureImpl.lIIlIlIIllIIlI[6] = (-(11 + 12 + 142 + 20) & (0xFFFF9FBF & 0x79FF));
        TextureImpl.lIIlIlIIllIIlI[7] = (0xFFFF9DDD & 0x7623);
        TextureImpl.lIIlIlIIllIIlI[8] = (0xFFFFED41 & 0x3ABF);
        TextureImpl.lIIlIlIIllIIlI[9] = (-(0xFFFF8EDB & 0x77BE) & (0xFFFFBFBB & 0x6EDD));
    }
    
    public int getTextureHeight() {
        return this.texHeight;
    }
    
    private static boolean llIIlllllllIIlI(final Object lllllllllllllIIllIlIIIlllllllIII, final Object lllllllllllllIIllIlIIIllllllIlll) {
        return lllllllllllllIIllIlIIIlllllllIII != lllllllllllllIIllIlIIIllllllIlll;
    }
    
    protected IntBuffer createIntBuffer(final int lllllllllllllIIllIlIIlIIIIlIIlIl) {
        final ByteBuffer lllllllllllllIIllIlIIlIIIIlIIlII = ByteBuffer.allocateDirect(TextureImpl.lIIlIlIIllIIlI[2] * lllllllllllllIIllIlIIlIIIIlIIlIl);
        lllllllllllllIIllIlIIlIIIIlIIlII.order(ByteOrder.nativeOrder());
        "".length();
        return lllllllllllllIIllIlIIlIIIIlIIlII.asIntBuffer();
    }
    
    public void setAlpha(final boolean lllllllllllllIIllIlIIlIIIllIlIll) {
        this.alpha = lllllllllllllIIllIlIIlIIIllIlIll;
    }
    
    public int getImageWidth() {
        return this.width;
    }
    
    private static boolean llIIlllllllIlII(final Object lllllllllllllIIllIlIIIllllllIlII, final Object lllllllllllllIIllIlIIIllllllIIll) {
        return lllllllllllllIIllIlIIIllllllIlII == lllllllllllllIIllIlIIIllllllIIll;
    }
    
    public void setCacheName(final String lllllllllllllIIllIlIIlIIIllllIIl) {
        this.cacheName = lllllllllllllIIllIlIIlIIIllllIIl;
    }
    
    public void setTextureFilter(final int lllllllllllllIIllIlIIlIIIIIlIlIl) {
        this.bind();
        TextureImpl.GL.glTexParameteri(this.target, TextureImpl.lIIlIlIIllIIlI[8], lllllllllllllIIllIlIIlIIIIIlIlIl);
        TextureImpl.GL.glTexParameteri(this.target, TextureImpl.lIIlIlIIllIIlI[9], lllllllllllllIIllIlIIlIIIIIlIlIl);
    }
    
    public void release() {
        final IntBuffer lllllllllllllIIllIlIIlIIIIllIlII = this.createIntBuffer(TextureImpl.lIIlIlIIllIIlI[1]);
        lllllllllllllIIllIlIIlIIIIllIlII.put(this.textureID);
        "".length();
        lllllllllllllIIllIlIIlIIIIllIlII.flip();
        "".length();
        TextureImpl.GL.glDeleteTextures(lllllllllllllIIllIlIIlIIIIllIlII);
        if (llIIlllllllIlII(TextureImpl.lastBind, this)) {
            bindNone();
        }
        if (llIIlllllllIlIl(this.cacheName)) {
            InternalTextureLoader.get().clear(this.cacheName);
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            InternalTextureLoader.get().clear(this.ref);
        }
    }
    
    public float getHeight() {
        return this.heightRatio;
    }
    
    private void setWidth() {
        if (llIIlllllllIIll(this.texWidth)) {
            this.widthRatio = this.width / (float)this.texWidth;
        }
    }
    
    public boolean hasAlpha() {
        return this.alpha;
    }
    
    public static void unbind() {
        TextureImpl.lastBind = null;
    }
    
    public void setTextureID(final int lllllllllllllIIllIlIIlIIIIlIlIll) {
        this.textureID = lllllllllllllIIllIlIIlIIIIlIlIll;
    }
    
    public int getTextureWidth() {
        return this.texWidth;
    }
    
    private static boolean llIIlllllllIIll(final int lllllllllllllIIllIlIIIlllllIllll) {
        return lllllllllllllIIllIlIIIlllllIllll != 0;
    }
    
    public TextureImpl(final String lllllllllllllIIllIlIIlIIlIIIIIll, final int lllllllllllllIIllIlIIlIIIllllllI, final int lllllllllllllIIllIlIIlIIlIIIIIIl) {
        this.target = lllllllllllllIIllIlIIlIIIllllllI;
        this.ref = lllllllllllllIIllIlIIlIIlIIIIIll;
        this.textureID = lllllllllllllIIllIlIIlIIlIIIIIIl;
        TextureImpl.lastBind = this;
    }
    
    public void setTextureHeight(final int lllllllllllllIIllIlIIlIIIlIIIlII) {
        this.texHeight = lllllllllllllIIllIlIIlIIIlIIIlII;
        this.setHeight();
    }
    
    public void setWidth(final int lllllllllllllIIllIlIIlIIIlIlllII) {
        this.width = lllllllllllllIIllIlIIlIIIlIlllII;
        this.setWidth();
    }
    
    public int getImageHeight() {
        return this.height;
    }
    
    public void reload() {
        if (llIIlllllllIlIl(this.reloadData)) {
            this.textureID = this.reloadData.reload();
        }
    }
    
    private void setHeight() {
        if (llIIlllllllIIll(this.texHeight)) {
            this.heightRatio = this.height / (float)this.texHeight;
        }
    }
    
    public static void bindNone() {
        TextureImpl.lastBind = null;
        TextureImpl.GL.glDisable(TextureImpl.lIIlIlIIllIIlI[0]);
    }
    
    static {
        llIIlllllllIIIl();
        TextureImpl.GL = Renderer.get();
    }
    
    public void setTextureWidth(final int lllllllllllllIIllIlIIlIIIlIIIIII) {
        this.texWidth = lllllllllllllIIllIlIIlIIIlIIIIII;
        this.setWidth();
    }
    
    public void setHeight(final int lllllllllllllIIllIlIIlIIIllIIIlI) {
        this.height = lllllllllllllIIllIlIIlIIIllIIIlI;
        this.setHeight();
    }
    
    public void bind() {
        if (llIIlllllllIIlI(TextureImpl.lastBind, this)) {
            TextureImpl.lastBind = this;
            TextureImpl.GL.glEnable(TextureImpl.lIIlIlIIllIIlI[0]);
            TextureImpl.GL.glBindTexture(this.target, this.textureID);
        }
    }
    
    public static Texture getLastBind() {
        return TextureImpl.lastBind;
    }
    
    public void setTextureData(final int lllllllllllllIIllIlIIlIIIIIIlIll, final int lllllllllllllIIllIlIIlIIIIIIIlII, final int lllllllllllllIIllIlIIlIIIIIIIIll, final int lllllllllllllIIllIlIIlIIIIIIlIII, final ByteBuffer lllllllllllllIIllIlIIlIIIIIIIlll) {
        this.reloadData = new ReloadData();
        this.reloadData.srcPixelFormat = lllllllllllllIIllIlIIlIIIIIIlIll;
        "".length();
        this.reloadData.componentCount = lllllllllllllIIllIlIIlIIIIIIIlII;
        "".length();
        this.reloadData.minFilter = lllllllllllllIIllIlIIlIIIIIIIIll;
        "".length();
        this.reloadData.magFilter = lllllllllllllIIllIlIIlIIIIIIlIII;
        "".length();
        this.reloadData.textureBuffer = lllllllllllllIIllIlIIlIIIIIIIlll;
        "".length();
    }
    
    private class ReloadData
    {
        private /* synthetic */ int magFilter;
        private /* synthetic */ int componentCount;
        private /* synthetic */ ByteBuffer textureBuffer;
        private /* synthetic */ int srcPixelFormat;
        private /* synthetic */ int minFilter;
        private static final /* synthetic */ int[] lIIIIIlllIIIll;
        private static final /* synthetic */ String[] lIIIIIlllIIIlI;
        
        public int reload() {
            Log.error(String.valueOf(new StringBuilder().append(ReloadData.lIIIIIlllIIIlI[ReloadData.lIIIIIlllIIIll[0]]).append(TextureImpl.this.ref)));
            return InternalTextureLoader.get().reload(TextureImpl.this, this.srcPixelFormat, this.componentCount, this.minFilter, this.magFilter, this.textureBuffer);
        }
        
        static {
            lIllIllllIIIIII();
            lIllIlllIlllllI();
        }
        
        private static void lIllIllllIIIIII() {
            (lIIIIIlllIIIll = new int[4])[0] = ((0x1E ^ 0x16) & ~(0xAC ^ 0xA4));
            ReloadData.lIIIIIlllIIIll[1] = " ".length();
            ReloadData.lIIIIIlllIIIll[2] = (0x68 ^ 0x44 ^ (0x82 ^ 0xA6));
            ReloadData.lIIIIIlllIIIll[3] = "  ".length();
        }
        
        private static String lIllIlllIllIIll(final String lllllllllllllIlIIllIlIlllIlIllll, final String lllllllllllllIlIIllIlIlllIlIlllI) {
            try {
                final SecretKeySpec lllllllllllllIlIIllIlIlllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIlllIlIlllI.getBytes(StandardCharsets.UTF_8)), ReloadData.lIIIIIlllIIIll[2]), "DES");
                final Cipher lllllllllllllIlIIllIlIlllIllIIll = Cipher.getInstance("DES");
                lllllllllllllIlIIllIlIlllIllIIll.init(ReloadData.lIIIIIlllIIIll[3], lllllllllllllIlIIllIlIlllIllIlII);
                return new String(lllllllllllllIlIIllIlIlllIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIlllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIllIlIlllIllIIlI) {
                lllllllllllllIlIIllIlIlllIllIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIllIlllIlllllI() {
            (lIIIIIlllIIIlI = new String[ReloadData.lIIIIIlllIIIll[1]])[ReloadData.lIIIIIlllIIIll[0]] = lIllIlllIllIIll("vKWbANDWkX5ffwPSl9nL3jCGbgHgJQTo", "wICYa");
        }
    }
}
