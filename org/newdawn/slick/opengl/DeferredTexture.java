// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import org.newdawn.slick.loading.LoadingList;
import java.io.InputStream;
import org.newdawn.slick.loading.DeferredResource;

public class DeferredTexture extends TextureImpl implements DeferredResource
{
    private /* synthetic */ int filter;
    private /* synthetic */ String resourceName;
    private /* synthetic */ boolean flipped;
    private static final /* synthetic */ int[] lIIIIIIIlIIlII;
    private /* synthetic */ TextureImpl target;
    private /* synthetic */ InputStream in;
    private static final /* synthetic */ String[] lIIIIIIIlIIIll;
    private /* synthetic */ int[] trans;
    
    @Override
    public float getHeight() {
        this.checkTarget();
        return this.target.getHeight();
    }
    
    @Override
    public void bind() {
        this.checkTarget();
        this.target.bind();
    }
    
    static {
        lIllIIllIIIIIlI();
        lIllIIllIIIIIIl();
    }
    
    private void checkTarget() {
        if (lIllIIllIIIIIll(this.target)) {
            try {
                this.load();
                LoadingList.get().remove(this);
            }
            catch (IOException lllllllllllllIlIlIIlIIIlIllllIII) {
                throw new RuntimeException(String.valueOf(new StringBuilder().append(DeferredTexture.lIIIIIIIlIIIll[DeferredTexture.lIIIIIIIlIIlII[0]]).append(this.resourceName)));
            }
        }
    }
    
    private static void lIllIIllIIIIIIl() {
        (lIIIIIIIlIIIll = new String[DeferredTexture.lIIIIIIIlIIlII[1]])[DeferredTexture.lIIIIIIIlIIlII[0]] = lIllIIllIIIIIII("Fx0NLC4mHVk9LHYcCixjMgwfLDEkDB1pNzMRDTwxM0kbLCU5GxxpLzkIHSAtMUkYJyd2Gxw6LCMbGixjOAYNaSU5HBcteXY=", "ViyIC");
    }
    
    @Override
    public void setTextureHeight(final int lllllllllllllIlIlIIlIIIlIlIIIlIl) {
        this.checkTarget();
        this.target.setTextureHeight(lllllllllllllIlIlIIlIIIlIlIIIlIl);
    }
    
    @Override
    public int getImageHeight() {
        this.checkTarget();
        return this.target.getImageHeight();
    }
    
    @Override
    public void setTextureWidth(final int lllllllllllllIlIlIIlIIIlIIlllIll) {
        this.checkTarget();
        this.target.setTextureWidth(lllllllllllllIlIlIIlIIIlIIlllIll);
    }
    
    @Override
    public void setHeight(final int lllllllllllllIlIlIIlIIIlIlIIllIl) {
        this.checkTarget();
        this.target.setHeight(lllllllllllllIlIlIIlIIIlIlIIllIl);
    }
    
    @Override
    public boolean hasAlpha() {
        this.checkTarget();
        return this.target.hasAlpha();
    }
    
    @Override
    public void setWidth(final int lllllllllllllIlIlIIlIIIlIIllIlIl) {
        this.checkTarget();
        this.target.setWidth(lllllllllllllIlIlIIlIIIlIIllIlIl);
    }
    
    @Override
    public int getTextureID() {
        this.checkTarget();
        return this.target.getTextureID();
    }
    
    public String getDescription() {
        return this.resourceName;
    }
    
    @Override
    public void release() {
        this.checkTarget();
        this.target.release();
    }
    
    private static boolean lIllIIllIIIIIll(final Object lllllllllllllIlIlIIlIIIlIIIIIllI) {
        return lllllllllllllIlIlIIlIIIlIIIIIllI == null;
    }
    
    @Override
    public byte[] getTextureData() {
        this.checkTarget();
        return this.target.getTextureData();
    }
    
    @Override
    public int getImageWidth() {
        this.checkTarget();
        return this.target.getImageWidth();
    }
    
    @Override
    public void setTextureID(final int lllllllllllllIlIlIIlIIIlIlIIIIIl) {
        this.checkTarget();
        this.target.setTextureID(lllllllllllllIlIlIIlIIIlIlIIIIIl);
    }
    
    @Override
    public int getTextureHeight() {
        this.checkTarget();
        return this.target.getTextureHeight();
    }
    
    @Override
    public String getTextureRef() {
        this.checkTarget();
        return this.target.getTextureRef();
    }
    
    private static boolean lIllIIllIIIIlII(final int lllllllllllllIlIlIIlIIIlIIIIlIIl, final int lllllllllllllIlIlIIlIIIlIIIIlIII) {
        return lllllllllllllIlIlIIlIIIlIIIIlIIl < lllllllllllllIlIlIIlIIIlIIIIlIII;
    }
    
    public void load() throws IOException {
        final boolean lllllllllllllIlIlIIlIIIlIlllllIl = InternalTextureLoader.get().isDeferredLoading();
        InternalTextureLoader.get().setDeferredLoading((boolean)(DeferredTexture.lIIIIIIIlIIlII[0] != 0));
        this.target = InternalTextureLoader.get().getTexture(this.in, this.resourceName, this.flipped, this.filter, this.trans);
        InternalTextureLoader.get().setDeferredLoading(lllllllllllllIlIlIIlIIIlIlllllIl);
    }
    
    @Override
    public void setAlpha(final boolean lllllllllllllIlIlIIlIIIlIlIlIIll) {
        this.checkTarget();
        this.target.setAlpha(lllllllllllllIlIlIIlIIIlIlIlIIll);
    }
    
    @Override
    public void setTextureFilter(final int lllllllllllllIlIlIIlIIIlIIlIIllI) {
        this.checkTarget();
        this.target.setTextureFilter(lllllllllllllIlIlIIlIIIlIIlIIllI);
    }
    
    @Override
    public float getWidth() {
        this.checkTarget();
        return this.target.getWidth();
    }
    
    private static void lIllIIllIIIIIlI() {
        (lIIIIIIIlIIlII = new int[2])[0] = ((0x30 ^ 0x24) & ~(0xB1 ^ 0xA5));
        DeferredTexture.lIIIIIIIlIIlII[1] = " ".length();
    }
    
    private static String lIllIIllIIIIIII(String lllllllllllllIlIlIIlIIIlIIIlIlII, final String lllllllllllllIlIlIIlIIIlIIIllIII) {
        lllllllllllllIlIlIIlIIIlIIIlIlII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIlIIIlIIIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIlIIIlIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIlIIlIIIlIIIlIllI = lllllllllllllIlIlIIlIIIlIIIllIII.toCharArray();
        int lllllllllllllIlIlIIlIIIlIIIlIlIl = DeferredTexture.lIIIIIIIlIIlII[0];
        final boolean lllllllllllllIlIlIIlIIIlIIIIllll = (Object)((String)lllllllllllllIlIlIIlIIIlIIIlIlII).toCharArray();
        final float lllllllllllllIlIlIIlIIIlIIIIlllI = lllllllllllllIlIlIIlIIIlIIIIllll.length;
        boolean lllllllllllllIlIlIIlIIIlIIIIllIl = DeferredTexture.lIIIIIIIlIIlII[0] != 0;
        while (lIllIIllIIIIlII(lllllllllllllIlIlIIlIIIlIIIIllIl ? 1 : 0, (int)lllllllllllllIlIlIIlIIIlIIIIlllI)) {
            final char lllllllllllllIlIlIIlIIIlIIIllIlI = lllllllllllllIlIlIIlIIIlIIIIllll[lllllllllllllIlIlIIlIIIlIIIIllIl];
            lllllllllllllIlIlIIlIIIlIIIlIlll.append((char)(lllllllllllllIlIlIIlIIIlIIIllIlI ^ lllllllllllllIlIlIIlIIIlIIIlIllI[lllllllllllllIlIlIIlIIIlIIIlIlIl % lllllllllllllIlIlIIlIIIlIIIlIllI.length]));
            "".length();
            ++lllllllllllllIlIlIIlIIIlIIIlIlIl;
            ++lllllllllllllIlIlIIlIIIlIIIIllIl;
            "".length();
            if (((0x68 ^ 0x5D ^ (0x4A ^ 0x50)) & (0x13 ^ 0x77 ^ (0x74 ^ 0x3F) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIlIIIlIIIlIlll);
    }
    
    public DeferredTexture(final InputStream lllllllllllllIlIlIIlIIIllIIIlIll, final String lllllllllllllIlIlIIlIIIllIIIIlII, final boolean lllllllllllllIlIlIIlIIIllIIIlIIl, final int lllllllllllllIlIlIIlIIIllIIIlIII, final int[] lllllllllllllIlIlIIlIIIllIIIIIIl) {
        this.in = lllllllllllllIlIlIIlIIIllIIIlIll;
        this.resourceName = lllllllllllllIlIlIIlIIIllIIIIlII;
        this.flipped = lllllllllllllIlIlIIlIIIllIIIlIIl;
        this.filter = lllllllllllllIlIlIIlIIIllIIIlIII;
        this.trans = lllllllllllllIlIlIIlIIIllIIIIIIl;
        LoadingList.get().add(this);
    }
    
    @Override
    public int getTextureWidth() {
        this.checkTarget();
        return this.target.getTextureWidth();
    }
}
