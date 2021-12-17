// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import org.lwjgl.opengl.GL11;

public abstract class AbstractTexture implements ITextureObject
{
    protected /* synthetic */ int glTextureId;
    protected /* synthetic */ boolean blur;
    protected /* synthetic */ boolean mipmapLast;
    protected /* synthetic */ boolean blurLast;
    protected /* synthetic */ boolean mipmap;
    private static final /* synthetic */ int[] lllIIlIllIllll;
    
    private static void lIIlllllllIlllIl() {
        (lllIIlIllIllll = new int[8])[0] = -" ".length();
        AbstractTexture.lllIIlIllIllll[1] = (-(0xFFFFD3EF & 0x6CF5) & (0xFFFFE7FF & 0x7FE7));
        AbstractTexture.lllIIlIllIllll[2] = (-(0xFFFFD97D & 0x2FDF) & (0xFFFFBFFF & 0x6F5D));
        AbstractTexture.lllIIlIllIllll[3] = (0xFFFFF7EA & 0x2F17);
        AbstractTexture.lllIIlIllIllll[4] = (0xFFFFE65B & 0x3FA4);
        AbstractTexture.lllIIlIllIllll[5] = (-(0xFFFFF14B & 0x4EBF) & (0xFFFFCFEB & 0x7DFF));
        AbstractTexture.lllIIlIllIllll[6] = (0xFFFFB991 & 0x6E6F);
        AbstractTexture.lllIIlIllIllll[7] = (-(0xFFFF8C9D & 0x777F) & (0xFFFFEF1C & 0x3CFF));
    }
    
    @Override
    public void setBlurMipmap(final boolean llllllllllllIlIllllIIlIllIIIIIII, final boolean llllllllllllIlIllllIIlIlIlllllII) {
        this.blurLast = this.blur;
        this.mipmapLast = this.mipmap;
        this.setBlurMipmapDirect(llllllllllllIlIllllIIlIllIIIIIII, llllllllllllIlIllllIIlIlIlllllII);
    }
    
    public void setBlurMipmapDirect(final boolean llllllllllllIlIllllIIlIllIIIllIl, final boolean llllllllllllIlIllllIIlIllIIIIlll) {
        this.blur = llllllllllllIlIllllIIlIllIIIllIl;
        this.mipmap = llllllllllllIlIllllIIlIllIIIIlll;
        int llllllllllllIlIllllIIlIllIIIlIll = AbstractTexture.lllIIlIllIllll[0];
        int llllllllllllIlIllllIIlIllIIIlIlI = AbstractTexture.lllIIlIllIllll[0];
        if (lIIlllllllIllllI(llllllllllllIlIllllIIlIllIIIllIl ? 1 : 0)) {
            int n;
            if (lIIlllllllIllllI(llllllllllllIlIllllIIlIllIIIIlll ? 1 : 0)) {
                n = AbstractTexture.lllIIlIllIllll[1];
                "".length();
                if (-" ".length() == "   ".length()) {
                    return;
                }
            }
            else {
                n = AbstractTexture.lllIIlIllIllll[2];
            }
            llllllllllllIlIllllIIlIllIIIlIll = n;
            llllllllllllIlIllllIIlIllIIIlIlI = AbstractTexture.lllIIlIllIllll[2];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            int n2;
            if (lIIlllllllIllllI(llllllllllllIlIllllIIlIllIIIIlll ? 1 : 0)) {
                n2 = AbstractTexture.lllIIlIllIllll[3];
                "".length();
                if (((0xB ^ 0x5E) & ~(0xFD ^ 0xA8)) != 0x0) {
                    return;
                }
            }
            else {
                n2 = AbstractTexture.lllIIlIllIllll[4];
            }
            llllllllllllIlIllllIIlIllIIIlIll = n2;
            llllllllllllIlIllllIIlIllIIIlIlI = AbstractTexture.lllIIlIllIllll[4];
        }
        GL11.glTexParameteri(AbstractTexture.lllIIlIllIllll[5], AbstractTexture.lllIIlIllIllll[6], llllllllllllIlIllllIIlIllIIIlIll);
        GL11.glTexParameteri(AbstractTexture.lllIIlIllIllll[5], AbstractTexture.lllIIlIllIllll[7], llllllllllllIlIllllIIlIllIIIlIlI);
    }
    
    static {
        lIIlllllllIlllIl();
    }
    
    @Override
    public int getGlTextureId() {
        if (lIIlllllllIlllll(this.glTextureId, AbstractTexture.lllIIlIllIllll[0])) {
            this.glTextureId = TextureUtil.glGenTextures();
        }
        return this.glTextureId;
    }
    
    public AbstractTexture() {
        this.glTextureId = AbstractTexture.lllIIlIllIllll[0];
    }
    
    private static boolean lIIlllllllIllllI(final int llllllllllllIlIllllIIlIlIllIllIl) {
        return llllllllllllIlIllllIIlIlIllIllIl != 0;
    }
    
    private static boolean lIIllllllllIIIII(final int llllllllllllIlIllllIIlIlIllIlIlI, final int llllllllllllIlIllllIIlIlIllIlIIl) {
        return llllllllllllIlIllllIIlIlIllIlIlI != llllllllllllIlIllllIIlIlIllIlIIl;
    }
    
    private static boolean lIIlllllllIlllll(final int llllllllllllIlIllllIIlIlIlllIIII, final int llllllllllllIlIllllIIlIlIllIllll) {
        return llllllllllllIlIllllIIlIlIlllIIII == llllllllllllIlIllllIIlIlIllIllll;
    }
    
    public void deleteGlTexture() {
        if (lIIllllllllIIIII(this.glTextureId, AbstractTexture.lllIIlIllIllll[0])) {
            TextureUtil.deleteTexture(this.glTextureId);
            this.glTextureId = AbstractTexture.lllIIlIllIllll[0];
        }
    }
    
    @Override
    public void restoreLastBlurMipmap() {
        this.setBlurMipmapDirect(this.blurLast, this.mipmapLast);
    }
}
