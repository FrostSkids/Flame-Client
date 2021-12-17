// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import java.util.Iterator;
import net.minecraft.client.renderer.block.model.BreakingFour;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.block.model.ModelBlock;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.block.model.BakedQuad;
import java.util.List;

public class SimpleBakedModel implements IBakedModel
{
    protected final /* synthetic */ List<BakedQuad> generalQuads;
    protected final /* synthetic */ TextureAtlasSprite texture;
    protected final /* synthetic */ List<List<BakedQuad>> faceQuads;
    private static final /* synthetic */ int[] lIlllIIllIIllI;
    protected final /* synthetic */ boolean gui3d;
    protected final /* synthetic */ boolean ambientOcclusion;
    protected final /* synthetic */ ItemCameraTransforms cameraTransforms;
    
    @Override
    public TextureAtlasSprite getParticleTexture() {
        return this.texture;
    }
    
    @Override
    public boolean isAmbientOcclusion() {
        return this.ambientOcclusion;
    }
    
    @Override
    public ItemCameraTransforms getItemCameraTransforms() {
        return this.cameraTransforms;
    }
    
    private static void lIIIIIIlllllllIl() {
        (lIlllIIllIIllI = new int[1])[0] = ((0xDF ^ 0x99) & ~(0x59 ^ 0x1F));
    }
    
    @Override
    public boolean isGui3d() {
        return this.gui3d;
    }
    
    public SimpleBakedModel(final List<BakedQuad> llllllllllllIlllllIIllIlllIIllll, final List<List<BakedQuad>> llllllllllllIlllllIIllIlllIIlllI, final boolean llllllllllllIlllllIIllIlllIlIlII, final boolean llllllllllllIlllllIIllIlllIlIIll, final TextureAtlasSprite llllllllllllIlllllIIllIlllIIlIll, final ItemCameraTransforms llllllllllllIlllllIIllIlllIIlIlI) {
        this.generalQuads = llllllllllllIlllllIIllIlllIIllll;
        this.faceQuads = llllllllllllIlllllIIllIlllIIlllI;
        this.ambientOcclusion = llllllllllllIlllllIIllIlllIlIlII;
        this.gui3d = llllllllllllIlllllIIllIlllIlIIll;
        this.texture = llllllllllllIlllllIIllIlllIIlIll;
        this.cameraTransforms = llllllllllllIlllllIIllIlllIIlIlI;
    }
    
    static {
        lIIIIIIlllllllIl();
    }
    
    @Override
    public List<BakedQuad> getGeneralQuads() {
        return this.generalQuads;
    }
    
    @Override
    public List<BakedQuad> getFaceQuads(final EnumFacing llllllllllllIlllllIIllIlllIIIllI) {
        return this.faceQuads.get(llllllllllllIlllllIIllIlllIIIllI.ordinal());
    }
    
    @Override
    public boolean isBuiltInRenderer() {
        return SimpleBakedModel.lIlllIIllIIllI[0] != 0;
    }
    
    public static class Builder
    {
        private final /* synthetic */ boolean builderAmbientOcclusion;
        private /* synthetic */ ItemCameraTransforms builderCameraTransforms;
        private /* synthetic */ boolean builderGui3d;
        private final /* synthetic */ List<BakedQuad> builderGeneralQuads;
        private static final /* synthetic */ String[] llllIlIIlIIII;
        private static final /* synthetic */ int[] llllIlIIlIIIl;
        private final /* synthetic */ List<List<BakedQuad>> builderFaceQuads;
        private /* synthetic */ TextureAtlasSprite builderTexture;
        
        private static boolean lIlIlIlIIIIlIII(final int lllllllllllllIlIllIllIlllIIIIIll) {
            return lllllllllllllIlIllIllIlllIIIIIll == 0;
        }
        
        private static String lIlIlIlIIIIIlII(final String lllllllllllllIlIllIllIlllIIlIIII, final String lllllllllllllIlIllIllIlllIIIllIl) {
            try {
                final SecretKeySpec lllllllllllllIlIllIllIlllIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllIlllIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIllIllIlllIIlIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIllIllIlllIIlIIlI.init(Builder.llllIlIIlIIIl[3], lllllllllllllIlIllIllIlllIIlIIll);
                return new String(lllllllllllllIlIllIllIlllIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllIlllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIllIlllIIlIIIl) {
                lllllllllllllIlIllIllIlllIIlIIIl.printStackTrace();
                return null;
            }
        }
        
        public Builder(final ModelBlock lllllllllllllIlIllIlllIIIIlIlllI) {
            this(lllllllllllllIlIllIlllIIIIlIlllI.isAmbientOcclusion(), lllllllllllllIlIllIlllIIIIlIlllI.isGui3d(), lllllllllllllIlIllIlllIIIIlIlllI.func_181682_g());
        }
        
        private Builder(final boolean lllllllllllllIlIllIllIlllIllllII, final boolean lllllllllllllIlIllIllIlllIlllIlI, final ItemCameraTransforms lllllllllllllIlIllIllIlllIllIlII) {
            this.builderGeneralQuads = (List<BakedQuad>)Lists.newArrayList();
            this.builderFaceQuads = (List<List<BakedQuad>>)Lists.newArrayListWithCapacity(Builder.llllIlIIlIIIl[1]);
            final byte lllllllllllllIlIllIllIlllIllIIII;
            final short lllllllllllllIlIllIllIlllIllIIIl = (short)((EnumFacing[])(Object)(lllllllllllllIlIllIllIlllIllIIII = (byte)(Object)EnumFacing.values())).length;
            boolean lllllllllllllIlIllIllIlllIllIIlI = Builder.llllIlIIlIIIl[0] != 0;
            "".length();
            if ("  ".length() <= " ".length()) {
                throw null;
            }
            while (!lIlIlIlIIIIIlll(lllllllllllllIlIllIllIlllIllIIlI ? 1 : 0, lllllllllllllIlIllIllIlllIllIIIl)) {
                final EnumFacing lllllllllllllIlIllIllIlllIlllIII = lllllllllllllIlIllIllIlllIllIIII[lllllllllllllIlIllIllIlllIllIIlI];
                this.builderFaceQuads.add(Lists.newArrayList());
                "".length();
                ++lllllllllllllIlIllIllIlllIllIIlI;
            }
            this.builderAmbientOcclusion = lllllllllllllIlIllIllIlllIllllII;
            this.builderGui3d = lllllllllllllIlIllIllIlllIlllIlI;
            this.builderCameraTransforms = lllllllllllllIlIllIllIlllIllIlII;
        }
        
        private void addGeneralBreakingFours(final IBakedModel lllllllllllllIlIllIllIlllllIIIlI, final TextureAtlasSprite lllllllllllllIlIllIllIllllIllIIl) {
            final short lllllllllllllIlIllIllIllllIlIllI = (short)lllllllllllllIlIllIllIlllllIIIlI.getGeneralQuads().iterator();
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
            while (!lIlIlIlIIIIlIII(((Iterator)lllllllllllllIlIllIllIllllIlIllI).hasNext() ? 1 : 0)) {
                final BakedQuad lllllllllllllIlIllIllIllllIllllI = ((Iterator<BakedQuad>)lllllllllllllIlIllIllIllllIlIllI).next();
                this.addGeneralQuad(new BreakingFour(lllllllllllllIlIllIllIllllIllllI, lllllllllllllIlIllIllIllllIllIIl));
                "".length();
            }
        }
        
        public Builder addGeneralQuad(final BakedQuad lllllllllllllIlIllIllIlllIlIIIll) {
            this.builderGeneralQuads.add(lllllllllllllIlIllIllIlllIlIIIll);
            "".length();
            return this;
        }
        
        public Builder addFaceQuad(final EnumFacing lllllllllllllIlIllIllIlllIlIlIll, final BakedQuad lllllllllllllIlIllIllIlllIlIIlll) {
            this.builderFaceQuads.get(lllllllllllllIlIllIllIlllIlIlIll.ordinal()).add(lllllllllllllIlIllIllIlllIlIIlll);
            "".length();
            return this;
        }
        
        public Builder(final IBakedModel lllllllllllllIlIllIlllIIIIIllIIl, final TextureAtlasSprite lllllllllllllIlIllIlllIIIIIlllIl) {
            this(lllllllllllllIlIllIlllIIIIIllIIl.isAmbientOcclusion(), lllllllllllllIlIllIlllIIIIIllIIl.isGui3d(), lllllllllllllIlIllIlllIIIIIllIIl.getItemCameraTransforms());
            this.builderTexture = lllllllllllllIlIllIlllIIIIIllIIl.getParticleTexture();
            final int lllllllllllllIlIllIlllIIIIIlIIll;
            final long lllllllllllllIlIllIlllIIIIIlIlII = ((EnumFacing[])(Object)(lllllllllllllIlIllIlllIIIIIlIIll = (int)(Object)EnumFacing.values())).length;
            short lllllllllllllIlIllIlllIIIIIlIllI = (short)Builder.llllIlIIlIIIl[0];
            "".length();
            if (null != null) {
                throw null;
            }
            while (!lIlIlIlIIIIIlll(lllllllllllllIlIllIlllIIIIIlIllI, (int)lllllllllllllIlIllIlllIIIIIlIlII)) {
                final EnumFacing lllllllllllllIlIllIlllIIIIIllIll = lllllllllllllIlIllIlllIIIIIlIIll[lllllllllllllIlIllIlllIIIIIlIllI];
                this.addFaceBreakingFours(lllllllllllllIlIllIlllIIIIIllIIl, lllllllllllllIlIllIlllIIIIIlllIl, lllllllllllllIlIllIlllIIIIIllIll);
                ++lllllllllllllIlIllIlllIIIIIlIllI;
            }
            this.addGeneralBreakingFours(lllllllllllllIlIllIlllIIIIIllIIl, lllllllllllllIlIllIlllIIIIIlllIl);
        }
        
        private static void lIlIlIlIIIIIllI() {
            (llllIlIIlIIIl = new int[4])[0] = ((0x9F ^ 0x81) & ~(0x93 ^ 0x8D));
            Builder.llllIlIIlIIIl[1] = (134 + 13 - 70 + 96 ^ 161 + 79 - 82 + 13);
            Builder.llllIlIIlIIIl[2] = " ".length();
            Builder.llllIlIIlIIIl[3] = "  ".length();
        }
        
        private static boolean lIlIlIlIIIIIlll(final int lllllllllllllIlIllIllIlllIIIlIII, final int lllllllllllllIlIllIllIlllIIIIlll) {
            return lllllllllllllIlIllIllIlllIIIlIII >= lllllllllllllIlIllIllIlllIIIIlll;
        }
        
        static {
            lIlIlIlIIIIIllI();
            lIlIlIlIIIIIlIl();
        }
        
        private static boolean lIlIlIlIIIIlIIl(final Object lllllllllllllIlIllIllIlllIIIIlIl) {
            return lllllllllllllIlIllIllIlllIIIIlIl == null;
        }
        
        private void addFaceBreakingFours(final IBakedModel lllllllllllllIlIllIllIllllllllll, final TextureAtlasSprite lllllllllllllIlIllIllIllllllIllI, final EnumFacing lllllllllllllIlIllIllIllllllIlII) {
            final float lllllllllllllIlIllIllIllllllIIlI = (float)lllllllllllllIlIllIllIllllllllll.getFaceQuads(lllllllllllllIlIllIllIllllllIlII).iterator();
            "".length();
            if ((109 + 71 - 72 + 28 ^ 64 + 41 - 2 + 38) == 0x0) {
                return;
            }
            while (!lIlIlIlIIIIlIII(((Iterator)lllllllllllllIlIllIllIllllllIIlI).hasNext() ? 1 : 0)) {
                final BakedQuad lllllllllllllIlIllIllIlllllllIll = ((Iterator<BakedQuad>)lllllllllllllIlIllIllIllllllIIlI).next();
                this.addFaceQuad(lllllllllllllIlIllIllIllllllIlII, new BreakingFour(lllllllllllllIlIllIllIlllllllIll, lllllllllllllIlIllIllIllllllIllI));
                "".length();
            }
        }
        
        public Builder setTexture(final TextureAtlasSprite lllllllllllllIlIllIllIlllIIllIll) {
            this.builderTexture = lllllllllllllIlIllIllIlllIIllIll;
            return this;
        }
        
        public IBakedModel makeBakedModel() {
            if (lIlIlIlIIIIlIIl(this.builderTexture)) {
                throw new RuntimeException(Builder.llllIlIIlIIII[Builder.llllIlIIlIIIl[0]]);
            }
            return new SimpleBakedModel(this.builderGeneralQuads, this.builderFaceQuads, this.builderAmbientOcclusion, this.builderGui3d, this.builderTexture, this.builderCameraTransforms);
        }
        
        private static void lIlIlIlIIIIIlIl() {
            (llllIlIIlIIII = new String[Builder.llllIlIIlIIIl[2]])[Builder.llllIlIIlIIIl[0]] = lIlIlIlIIIIIlII("hgBfExIBTOaMVGK6uTMdltg5LxANTP2d", "YIHDB");
        }
    }
}
