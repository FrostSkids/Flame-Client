// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.ComparisonChain;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import java.util.Collection;
import net.minecraft.util.WeightedRandom;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.util.EnumFacing;
import java.util.List;

public class WeightedBakedModel implements IBakedModel
{
    private final /* synthetic */ IBakedModel baseModel;
    private final /* synthetic */ int totalWeight;
    private static final /* synthetic */ int[] lllIlIIIllIllI;
    private final /* synthetic */ List<MyWeighedRandomItem> models;
    
    static {
        lIlIIIIlllIllIlI();
    }
    
    @Override
    public List<BakedQuad> getFaceQuads(final EnumFacing llllllllllllIlIlllIIIllllIlIlIII) {
        return this.baseModel.getFaceQuads(llllllllllllIlIlllIIIllllIlIlIII);
    }
    
    @Override
    public boolean isGui3d() {
        return this.baseModel.isGui3d();
    }
    
    @Override
    public List<BakedQuad> getGeneralQuads() {
        return this.baseModel.getGeneralQuads();
    }
    
    @Override
    public ItemCameraTransforms getItemCameraTransforms() {
        return this.baseModel.getItemCameraTransforms();
    }
    
    public IBakedModel getAlternativeModel(final long llllllllllllIlIlllIIIllllIIlIIII) {
        return WeightedRandom.getRandomItem(this.models, Math.abs((int)llllllllllllIlIlllIIIllllIIlIIII >> WeightedBakedModel.lllIlIIIllIllI[1]) % this.totalWeight).model;
    }
    
    @Override
    public boolean isBuiltInRenderer() {
        return this.baseModel.isBuiltInRenderer();
    }
    
    @Override
    public TextureAtlasSprite getParticleTexture() {
        return this.baseModel.getParticleTexture();
    }
    
    public WeightedBakedModel(final List<MyWeighedRandomItem> llllllllllllIlIlllIIIllllIlIlllI) {
        this.models = llllllllllllIlIlllIIIllllIlIlllI;
        this.totalWeight = WeightedRandom.getTotalWeight(llllllllllllIlIlllIIIllllIlIlllI);
        this.baseModel = llllllllllllIlIlllIIIllllIlIlllI.get(WeightedBakedModel.lllIlIIIllIllI[0]).model;
    }
    
    @Override
    public boolean isAmbientOcclusion() {
        return this.baseModel.isAmbientOcclusion();
    }
    
    private static void lIlIIIIlllIllIlI() {
        (lllIlIIIllIllI = new int[2])[0] = ((0x65 ^ 0x6A) & ~(0x77 ^ 0x78));
        WeightedBakedModel.lllIlIIIllIllI[1] = (0x17 ^ 0x7);
    }
    
    static class MyWeighedRandomItem extends WeightedRandom.Item implements Comparable<MyWeighedRandomItem>
    {
        private static final /* synthetic */ int[] lIlIlIlIIIlllI;
        private static final /* synthetic */ String[] lIlIlIlIIIllIl;
        protected final /* synthetic */ IBakedModel model;
        
        public MyWeighedRandomItem(final IBakedModel lllllllllllllIIIlIIIlllllIlIllII, final int lllllllllllllIIIlIIIlllllIlIlIII) {
            super(lllllllllllllIIIlIIIlllllIlIlIII);
            this.model = lllllllllllllIIIlIIIlllllIlIllII;
        }
        
        private static void lllIllIllIIlIlI() {
            (lIlIlIlIIIllIl = new String[MyWeighedRandomItem.lIlIlIlIIIlllI[3]])[MyWeighedRandomItem.lIlIlIlIIIlllI[0]] = lllIllIllIIlIII("F+S6Nn2d6LYMTQbu489k+io+fbNYu4Mt5Hf2aW7cO58=", "XqZWc");
            MyWeighedRandomItem.lIlIlIlIIIllIl[MyWeighedRandomItem.lIlIlIlIIIlllI[1]] = lllIllIllIIlIIl("Iwr/T0V9n+FK5nWkYJw4TQ==", "jOITN");
        }
        
        static {
            lllIllIllIlllll();
            lllIllIllIIlIlI();
        }
        
        @Override
        public int compareTo(final MyWeighedRandomItem lllllllllllllIIIlIIIlllllIlIIIlI) {
            return ComparisonChain.start().compare(lllllllllllllIIIlIIIlllllIlIIIlI.itemWeight, this.itemWeight).compare(this.getCountQuads(), lllllllllllllIIIlIIIlllllIlIIIlI.getCountQuads()).result();
        }
        
        private static boolean lllIllIlllIIIIl(final int lllllllllllllIIIlIIIllllIllIllll, final int lllllllllllllIIIlIIIllllIllIlllI) {
            return lllllllllllllIIIlIIIllllIllIllll >= lllllllllllllIIIlIIIllllIllIlllI;
        }
        
        protected int getCountQuads() {
            int lllllllllllllIIIlIIIlllllIIllIlI = this.model.getGeneralQuads().size();
            final byte lllllllllllllIIIlIIIlllllIIlIIll;
            final boolean lllllllllllllIIIlIIIlllllIIlIlII = ((EnumFacing[])(Object)(lllllllllllllIIIlIIIlllllIIlIIll = (byte)(Object)EnumFacing.values())).length != 0;
            short lllllllllllllIIIlIIIlllllIIlIlIl = (short)MyWeighedRandomItem.lIlIlIlIIIlllI[0];
            "".length();
            if (null != null) {
                return (77 + 49 - 45 + 61 ^ 100 + 16 + 56 + 0) & (21 + 73 + 13 + 56 ^ 14 + 62 + 30 + 23 ^ -" ".length());
            }
            while (!lllIllIlllIIIIl(lllllllllllllIIIlIIIlllllIIlIlIl, lllllllllllllIIIlIIIlllllIIlIlII ? 1 : 0)) {
                final EnumFacing lllllllllllllIIIlIIIlllllIIllIIl = lllllllllllllIIIlIIIlllllIIlIIll[lllllllllllllIIIlIIIlllllIIlIlIl];
                lllllllllllllIIIlIIIlllllIIllIlI += this.model.getFaceQuads(lllllllllllllIIIlIIIlllllIIllIIl).size();
                ++lllllllllllllIIIlIIIlllllIIlIlIl;
            }
            return lllllllllllllIIIlIIIlllllIIllIlI;
        }
        
        private static void lllIllIllIlllll() {
            (lIlIlIlIIIlllI = new int[5])[0] = ((0x40 ^ 0x62 ^ (0xB8 ^ 0xB3)) & ("  ".length() ^ (0x16 ^ 0x3D) ^ -" ".length()));
            MyWeighedRandomItem.lIlIlIlIIIlllI[1] = " ".length();
            MyWeighedRandomItem.lIlIlIlIIIlllI[2] = (0xDD ^ 0xA0);
            MyWeighedRandomItem.lIlIlIlIIIlllI[3] = "  ".length();
            MyWeighedRandomItem.lIlIlIlIIIlllI[4] = (0x1F ^ 0x17);
        }
        
        private static String lllIllIllIIlIIl(final String lllllllllllllIIIlIIIllllIlllIlll, final String lllllllllllllIIIlIIIllllIlllIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIlIIIllllIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIllllIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlIIIllllIllllIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlIIIllllIllllIIl.init(MyWeighedRandomItem.lIlIlIlIIIlllI[3], lllllllllllllIIIlIIIllllIllllIlI);
                return new String(lllllllllllllIIIlIIIllllIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIllllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIIIllllIllllIII) {
                lllllllllllllIIIlIIIllllIllllIII.printStackTrace();
                return null;
            }
        }
        
        private static String lllIllIllIIlIII(final String lllllllllllllIIIlIIIlllllIIIIlII, final String lllllllllllllIIIlIIIlllllIIIIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIlIIIlllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIlllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), MyWeighedRandomItem.lIlIlIlIIIlllI[4]), "DES");
                final Cipher lllllllllllllIIIlIIIlllllIIIIllI = Cipher.getInstance("DES");
                lllllllllllllIIIlIIIlllllIIIIllI.init(MyWeighedRandomItem.lIlIlIlIIIlllI[3], lllllllllllllIIIlIIIlllllIIIIlll);
                return new String(lllllllllllllIIIlIIIlllllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIlllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIIIlllllIIIIlIl) {
                lllllllllllllIIIlIIIlllllIIIIlIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder(MyWeighedRandomItem.lIlIlIlIIIllIl[MyWeighedRandomItem.lIlIlIlIIIlllI[0]]).append(this.itemWeight).append(MyWeighedRandomItem.lIlIlIlIIIllIl[MyWeighedRandomItem.lIlIlIlIIIlllI[1]]).append(this.model).append((char)MyWeighedRandomItem.lIlIlIlIIIlllI[2]));
        }
    }
    
    public static class Builder
    {
        private /* synthetic */ List<MyWeighedRandomItem> listItems;
        private static final /* synthetic */ int[] lIlIIIIIIIllII;
        
        public IBakedModel first() {
            return this.listItems.get(Builder.lIlIIIIIIIllII[0]).model;
        }
        
        private static void llIlllllllllIll() {
            (lIlIIIIIIIllII = new int[1])[0] = ((0x42 ^ 0x11) & ~(0x29 ^ 0x7A));
        }
        
        public Builder() {
            this.listItems = (List<MyWeighedRandomItem>)Lists.newArrayList();
        }
        
        static {
            llIlllllllllIll();
        }
        
        public Builder add(final IBakedModel lllllllllllllIIlIIIlIlIlIIIlllIl, final int lllllllllllllIIlIIIlIlIlIIIllIIl) {
            this.listItems.add(new MyWeighedRandomItem(lllllllllllllIIlIIIlIlIlIIIlllIl, lllllllllllllIIlIIIlIlIlIIIllIIl));
            "".length();
            return this;
        }
        
        public WeightedBakedModel build() {
            Collections.sort(this.listItems);
            return new WeightedBakedModel(this.listItems);
        }
    }
}
