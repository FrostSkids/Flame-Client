// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import com.google.common.collect.Maps;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityHorse;

public class RenderHorse extends RenderLiving<EntityHorse>
{
    private static final /* synthetic */ ResourceLocation skeletonHorseTextures;
    private static final /* synthetic */ ResourceLocation muleTextures;
    private static final /* synthetic */ ResourceLocation donkeyTextures;
    private static final /* synthetic */ ResourceLocation zombieHorseTextures;
    private static final /* synthetic */ ResourceLocation whiteHorseTextures;
    private static final /* synthetic */ String[] lIlIlIIlIllllI;
    private static final /* synthetic */ Map<String, ResourceLocation> field_110852_a;
    private static final /* synthetic */ int[] lIlIlIIlIlllll;
    
    private static String lllIllIIlllIlIl(final String lllllllllllllIIIlIIllIlllllIIIlI, final String lllllllllllllIIIlIIllIlllllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIllIlllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIllIlllllIIIII.getBytes(StandardCharsets.UTF_8)), RenderHorse.lIlIlIIlIlllll[6]), "DES");
            final Cipher lllllllllllllIIIlIIllIlllllIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIlIIllIlllllIIllI.init(RenderHorse.lIlIlIIlIlllll[2], lllllllllllllIIIlIIllIlllllIlIII);
            return new String(lllllllllllllIIIlIIllIlllllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIllIlllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIllIlllllIIlII) {
            lllllllllllllIIIlIIllIlllllIIlII.printStackTrace();
            return null;
        }
    }
    
    private ResourceLocation func_110848_b(final EntityHorse lllllllllllllIIIlIIlllIIIIlIIlIl) {
        final String lllllllllllllIIIlIIlllIIIIlIlIII = lllllllllllllIIIlIIlllIIIIlIIlIl.getHorseTexture();
        if (lllIllIIllllIIl(lllllllllllllIIIlIIlllIIIIlIIlIl.func_175507_cI() ? 1 : 0)) {
            return null;
        }
        ResourceLocation lllllllllllllIIIlIIlllIIIIlIIlll = RenderHorse.field_110852_a.get(lllllllllllllIIIlIIlllIIIIlIlIII);
        if (lllIllIIllllIlI(lllllllllllllIIIlIIlllIIIIlIIlll)) {
            lllllllllllllIIIlIIlllIIIIlIIlll = new ResourceLocation(lllllllllllllIIIlIIlllIIIIlIlIII);
            Minecraft.getMinecraft().getTextureManager().loadTexture(lllllllllllllIIIlIIlllIIIIlIIlll, new LayeredTexture(lllllllllllllIIIlIIlllIIIIlIIlIl.getVariantTexturePaths()));
            "".length();
            RenderHorse.field_110852_a.put(lllllllllllllIIIlIIlllIIIIlIlIII, lllllllllllllIIIlIIlllIIIIlIIlll);
            "".length();
        }
        return lllllllllllllIIIlIIlllIIIIlIIlll;
    }
    
    private static String lllIllIIlllIlII(final String lllllllllllllIIIlIIllIllllllIllI, final String lllllllllllllIIIlIIllIllllllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIllIllllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIllIllllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIllIlllllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIllIlllllllIlI.init(RenderHorse.lIlIlIIlIlllll[2], lllllllllllllIIIlIIllIllllllllII);
            return new String(lllllllllllllIIIlIIllIlllllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIllIllllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIllIlllllllIII) {
            lllllllllllllIIIlIIllIlllllllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIllIIllllIll(final int lllllllllllllIIIlIIllIlllIlIlIll, final int lllllllllllllIIIlIIllIlllIlIlIlI) {
        return lllllllllllllIIIlIIllIlllIlIlIll < lllllllllllllIIIlIIllIlllIlIlIlI;
    }
    
    private static void lllIllIIlllIlll() {
        (lIlIlIIlIlllll = new int[7])[0] = ((0x85 ^ 0xB1) & ~(0x5A ^ 0x6E));
        RenderHorse.lIlIlIIlIlllll[1] = " ".length();
        RenderHorse.lIlIlIIlIlllll[2] = "  ".length();
        RenderHorse.lIlIlIIlIlllll[3] = "   ".length();
        RenderHorse.lIlIlIIlIlllll[4] = (0x9F ^ 0x9B);
        RenderHorse.lIlIlIIlIlllll[5] = (29 + 124 - 132 + 141 ^ 0 + 38 + 87 + 42);
        RenderHorse.lIlIlIIlIlllll[6] = (0x7D ^ 0x75);
    }
    
    public RenderHorse(final RenderManager lllllllllllllIIIlIIlllIIIlIlIIlI, final ModelHorse lllllllllllllIIIlIIlllIIIlIlIlll, final float lllllllllllllIIIlIIlllIIIlIlIllI) {
        super(lllllllllllllIIIlIIlllIIIlIlIIlI, lllllllllllllIIIlIIlllIIIlIlIlll, lllllllllllllIIIlIIlllIIIlIlIllI);
    }
    
    private static boolean lllIllIIllllIII(final int lllllllllllllIIIlIIllIlllIlIllll, final int lllllllllllllIIIlIIllIlllIlIlllI) {
        return lllllllllllllIIIlIIllIlllIlIllll == lllllllllllllIIIlIIllIlllIlIlllI;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityHorse lllllllllllllIIIlIIlllIIIIllIIII) {
        if (!lllIllIIllllIIl(lllllllllllllIIIlIIlllIIIIllIIII.func_110239_cn() ? 1 : 0)) {
            return this.func_110848_b(lllllllllllllIIIlIIlllIIIIllIIII);
        }
        switch (lllllllllllllIIIlIIlllIIIIllIIII.getHorseType()) {
            default: {
                return RenderHorse.whiteHorseTextures;
            }
            case 1: {
                return RenderHorse.donkeyTextures;
            }
            case 2: {
                return RenderHorse.muleTextures;
            }
            case 3: {
                return RenderHorse.zombieHorseTextures;
            }
            case 4: {
                return RenderHorse.skeletonHorseTextures;
            }
        }
    }
    
    static {
        lllIllIIlllIlll();
        lllIllIIlllIllI();
        field_110852_a = Maps.newHashMap();
        whiteHorseTextures = new ResourceLocation(RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[0]]);
        muleTextures = new ResourceLocation(RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[1]]);
        donkeyTextures = new ResourceLocation(RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[2]]);
        zombieHorseTextures = new ResourceLocation(RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[3]]);
        skeletonHorseTextures = new ResourceLocation(RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[4]]);
    }
    
    @Override
    protected void preRenderCallback(final EntityHorse lllllllllllllIIIlIIlllIIIIllIlll, final float lllllllllllllIIIlIIlllIIIIlllIll) {
        float lllllllllllllIIIlIIlllIIIIlllIlI = 1.0f;
        final int lllllllllllllIIIlIIlllIIIIlllIIl = lllllllllllllIIIlIIlllIIIIllIlll.getHorseType();
        if (lllIllIIllllIII(lllllllllllllIIIlIIlllIIIIlllIIl, RenderHorse.lIlIlIIlIlllll[1])) {
            lllllllllllllIIIlIIlllIIIIlllIlI *= 0.87f;
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else if (lllIllIIllllIII(lllllllllllllIIIlIIlllIIIIlllIIl, RenderHorse.lIlIlIIlIlllll[2])) {
            lllllllllllllIIIlIIlllIIIIlllIlI *= 0.92f;
        }
        GlStateManager.scale(lllllllllllllIIIlIIlllIIIIlllIlI, lllllllllllllIIIlIIlllIIIIlllIlI, lllllllllllllIIIlIIlllIIIIlllIlI);
        super.preRenderCallback(lllllllllllllIIIlIIlllIIIIllIlll, lllllllllllllIIIlIIlllIIIIlllIll);
    }
    
    private static void lllIllIIlllIllI() {
        (lIlIlIIlIllllI = new String[RenderHorse.lIlIlIIlIlllll[5]])[RenderHorse.lIlIlIIlIlllll[0]] = lllIllIIlllIIll("FQQ6IgQTBDF5FA8VKyIITgktJAIETio5AxIEHSEZCBUneAEPBg==", "aaBVq");
        RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[1]] = lllIllIIlllIlII("ubpZFkn3XN+FLo0FWk2NH4OCaUVh1zWu6BA6Cq581FI=", "uQTkG");
        RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[2]] = lllIllIIlllIlII("24XfJZeKegwy4qSLyxTLY4slkvGP6PgTIbjZsZkRw8fRjjsXgp21xA==", "qbLAK");
        RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[3]] = lllIllIIlllIlIl("n33giJqjgSPOk9R2DArjm9ugcivNOMvXAR1wJa1dDsHz3N1FppBh1A==", "usKkT");
        RenderHorse.lIlIlIIlIllllI[RenderHorse.lIlIlIIlIlllll[4]] = lllIllIIlllIlIl("1yPA432rhKNaGa8BwkMkA7pi4Ff0ZZZr40srW6Ae1O0k5SVI0x3bK1dszxC2VY5k", "InjYP");
    }
    
    private static String lllIllIIlllIIll(String lllllllllllllIIIlIIllIllllIIIIII, final String lllllllllllllIIIlIIllIlllIlllllI) {
        lllllllllllllIIIlIIllIllllIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIlIIllIllllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIllIllllIIIlII = new StringBuilder();
        final char[] lllllllllllllIIIlIIllIllllIIIIll = lllllllllllllIIIlIIllIlllIlllllI.toCharArray();
        int lllllllllllllIIIlIIllIllllIIIIlI = RenderHorse.lIlIlIIlIlllll[0];
        final short lllllllllllllIIIlIIllIlllIllIllI = (Object)lllllllllllllIIIlIIllIllllIIIIII.toCharArray();
        final boolean lllllllllllllIIIlIIllIlllIllIlII = lllllllllllllIIIlIIllIlllIllIllI.length != 0;
        String lllllllllllllIIIlIIllIlllIllIIll = (String)RenderHorse.lIlIlIIlIlllll[0];
        while (lllIllIIllllIll((int)lllllllllllllIIIlIIllIlllIllIIll, lllllllllllllIIIlIIllIlllIllIlII ? 1 : 0)) {
            final char lllllllllllllIIIlIIllIllllIIIlll = lllllllllllllIIIlIIllIlllIllIllI[lllllllllllllIIIlIIllIlllIllIIll];
            lllllllllllllIIIlIIllIllllIIIlII.append((char)(lllllllllllllIIIlIIllIllllIIIlll ^ lllllllllllllIIIlIIllIllllIIIIll[lllllllllllllIIIlIIllIllllIIIIlI % lllllllllllllIIIlIIllIllllIIIIll.length]));
            "".length();
            ++lllllllllllllIIIlIIllIllllIIIIlI;
            ++lllllllllllllIIIlIIllIlllIllIIll;
            "".length();
            if ((0x33 ^ 0x61 ^ (0x2 ^ 0x55)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIllIllllIIIlII);
    }
    
    private static boolean lllIllIIllllIIl(final int lllllllllllllIIIlIIllIlllIlIIllI) {
        return lllllllllllllIIIlIIllIlllIlIIllI == 0;
    }
    
    private static boolean lllIllIIllllIlI(final Object lllllllllllllIIIlIIllIlllIlIlIII) {
        return lllllllllllllIIIlIIllIlllIlIlIII == null;
    }
}
