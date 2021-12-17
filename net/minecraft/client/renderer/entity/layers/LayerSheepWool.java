// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.EnumDyeColor;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.entity.passive.EntitySheep;

public class LayerSheepWool implements LayerRenderer<EntitySheep>
{
    private final /* synthetic */ ModelSheep1 sheepModel;
    private final /* synthetic */ RenderSheep sheepRenderer;
    private static final /* synthetic */ String[] lIIlllIlIIIlIl;
    private static final /* synthetic */ int[] lIIlllIlIIlIII;
    private static final /* synthetic */ ResourceLocation TEXTURE;
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerSheepWool.lIIlllIlIIlIII[1] != 0;
    }
    
    private static boolean llIllIlllIIllIl(final int lllllllllllllIIlIIlllllIlIIIIlII, final int lllllllllllllIIlIIlllllIlIIIIIll) {
        return lllllllllllllIIlIIlllllIlIIIIlII < lllllllllllllIIlIIlllllIlIIIIIll;
    }
    
    private static boolean llIllIlllIIllII(final int lllllllllllllIIlIIlllllIlIIIIIIl) {
        return lllllllllllllIIlIIlllllIlIIIIIIl != 0;
    }
    
    static {
        llIllIlllIIlIlI();
        llIllIllIllllII();
        TEXTURE = new ResourceLocation(LayerSheepWool.lIIlllIlIIIlIl[LayerSheepWool.lIIlllIlIIlIII[0]]);
    }
    
    private static void llIllIllIllllII() {
        (lIIlllIlIIIlIl = new String[LayerSheepWool.lIIlllIlIIlIII[3]])[LayerSheepWool.lIIlllIlIIlIII[0]] = llIllIllIlllIlI("CJwGgNnFka/WABhJAxliIzsWvkaKD1yiw/D4RKRTjmSQrnZ+YDwbpg==", "AhvOR");
        LayerSheepWool.lIIlllIlIIIlIl[LayerSheepWool.lIIlllIlIIlIII[1]] = llIllIllIlllIll("JAATLQ==", "Neqrd");
    }
    
    private static String llIllIllIlllIlI(final String lllllllllllllIIlIIlllllIlIlIIlII, final String lllllllllllllIIlIIlllllIlIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlllllIlIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlllllIlIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlllllIlIlIIllI.init(LayerSheepWool.lIIlllIlIIlIII[3], lllllllllllllIIlIIlllllIlIlIIlll);
            return new String(lllllllllllllIIlIIlllllIlIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllllIlIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlllllIlIlIIlIl) {
            lllllllllllllIIlIIlllllIlIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIllIlllIIlIlI() {
        (lIIlllIlIIlIII = new int[4])[0] = ((0x7 ^ 0x3A) & ~(0x21 ^ 0x1C));
        LayerSheepWool.lIIlllIlIIlIII[1] = " ".length();
        LayerSheepWool.lIIlllIlIIlIII[2] = (0xF0 ^ 0xBB ^ (0x5C ^ 0xE));
        LayerSheepWool.lIIlllIlIIlIII[3] = "  ".length();
    }
    
    private static boolean llIllIlllIIlIll(final int lllllllllllllIIlIIlllllIIlllllll) {
        return lllllllllllllIIlIIlllllIIlllllll == 0;
    }
    
    private static String llIllIllIlllIll(String lllllllllllllIIlIIlllllIlIIIllll, final String lllllllllllllIIlIIlllllIlIIlIIll) {
        lllllllllllllIIlIIlllllIlIIIllll = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlllllIlIIIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlllllIlIIlIIlI = new StringBuilder();
        final char[] lllllllllllllIIlIIlllllIlIIlIIIl = lllllllllllllIIlIIlllllIlIIlIIll.toCharArray();
        int lllllllllllllIIlIIlllllIlIIlIIII = LayerSheepWool.lIIlllIlIIlIII[0];
        final char lllllllllllllIIlIIlllllIlIIIlIlI = (Object)((String)lllllllllllllIIlIIlllllIlIIIllll).toCharArray();
        final short lllllllllllllIIlIIlllllIlIIIlIIl = (short)lllllllllllllIIlIIlllllIlIIIlIlI.length;
        byte lllllllllllllIIlIIlllllIlIIIlIII = (byte)LayerSheepWool.lIIlllIlIIlIII[0];
        while (llIllIlllIIllIl(lllllllllllllIIlIIlllllIlIIIlIII, lllllllllllllIIlIIlllllIlIIIlIIl)) {
            final char lllllllllllllIIlIIlllllIlIIlIlIl = lllllllllllllIIlIIlllllIlIIIlIlI[lllllllllllllIIlIIlllllIlIIIlIII];
            lllllllllllllIIlIIlllllIlIIlIIlI.append((char)(lllllllllllllIIlIIlllllIlIIlIlIl ^ lllllllllllllIIlIIlllllIlIIlIIIl[lllllllllllllIIlIIlllllIlIIlIIII % lllllllllllllIIlIIlllllIlIIlIIIl.length]));
            "".length();
            ++lllllllllllllIIlIIlllllIlIIlIIII;
            ++lllllllllllllIIlIIlllllIlIIIlIII;
            "".length();
            if (((0x40 ^ 0x79) & ~(0x1 ^ 0x38)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlllllIlIIlIIlI);
    }
    
    public LayerSheepWool(final RenderSheep lllllllllllllIIlIIlllllIllllIlIl) {
        this.sheepModel = new ModelSheep1();
        this.sheepRenderer = lllllllllllllIIlIIlllllIllllIlIl;
    }
    
    @Override
    public void doRenderLayer(final EntitySheep lllllllllllllIIlIIlllllIlllIIIII, final float lllllllllllllIIlIIlllllIllIIllIl, final float lllllllllllllIIlIIlllllIllIIllII, final float lllllllllllllIIlIIlllllIllIlllIl, final float lllllllllllllIIlIIlllllIllIlllII, final float lllllllllllllIIlIIlllllIllIllIll, final float lllllllllllllIIlIIlllllIllIllIlI, final float lllllllllllllIIlIIlllllIllIIIlll) {
        if (llIllIlllIIlIll(lllllllllllllIIlIIlllllIlllIIIII.getSheared() ? 1 : 0) && llIllIlllIIlIll(lllllllllllllIIlIIlllllIlllIIIII.isInvisible() ? 1 : 0)) {
            this.sheepRenderer.bindTexture(LayerSheepWool.TEXTURE);
            if (llIllIlllIIllII(lllllllllllllIIlIIlllllIlllIIIII.hasCustomName() ? 1 : 0) && llIllIlllIIllII(LayerSheepWool.lIIlllIlIIIlIl[LayerSheepWool.lIIlllIlIIlIII[1]].equals(lllllllllllllIIlIIlllllIlllIIIII.getCustomNameTag()) ? 1 : 0)) {
                final int lllllllllllllIIlIIlllllIllIllIII = LayerSheepWool.lIIlllIlIIlIII[2];
                final int lllllllllllllIIlIIlllllIllIlIlll = lllllllllllllIIlIIlllllIlllIIIII.ticksExisted / LayerSheepWool.lIIlllIlIIlIII[2] + lllllllllllllIIlIIlllllIlllIIIII.getEntityId();
                final int lllllllllllllIIlIIlllllIllIlIllI = EnumDyeColor.values().length;
                final int lllllllllllllIIlIIlllllIllIlIlIl = lllllllllllllIIlIIlllllIllIlIlll % lllllllllllllIIlIIlllllIllIlIllI;
                final int lllllllllllllIIlIIlllllIllIlIlII = (lllllllllllllIIlIIlllllIllIlIlll + LayerSheepWool.lIIlllIlIIlIII[1]) % lllllllllllllIIlIIlllllIllIlIllI;
                final float lllllllllllllIIlIIlllllIllIlIIll = (lllllllllllllIIlIIlllllIlllIIIII.ticksExisted % LayerSheepWool.lIIlllIlIIlIII[2] + lllllllllllllIIlIIlllllIllIlllIl) / 25.0f;
                final float[] lllllllllllllIIlIIlllllIllIlIIlI = EntitySheep.func_175513_a(EnumDyeColor.byMetadata(lllllllllllllIIlIIlllllIllIlIlIl));
                final float[] lllllllllllllIIlIIlllllIllIlIIIl = EntitySheep.func_175513_a(EnumDyeColor.byMetadata(lllllllllllllIIlIIlllllIllIlIlII));
                GlStateManager.color(lllllllllllllIIlIIlllllIllIlIIlI[LayerSheepWool.lIIlllIlIIlIII[0]] * (1.0f - lllllllllllllIIlIIlllllIllIlIIll) + lllllllllllllIIlIIlllllIllIlIIIl[LayerSheepWool.lIIlllIlIIlIII[0]] * lllllllllllllIIlIIlllllIllIlIIll, lllllllllllllIIlIIlllllIllIlIIlI[LayerSheepWool.lIIlllIlIIlIII[1]] * (1.0f - lllllllllllllIIlIIlllllIllIlIIll) + lllllllllllllIIlIIlllllIllIlIIIl[LayerSheepWool.lIIlllIlIIlIII[1]] * lllllllllllllIIlIIlllllIllIlIIll, lllllllllllllIIlIIlllllIllIlIIlI[LayerSheepWool.lIIlllIlIIlIII[3]] * (1.0f - lllllllllllllIIlIIlllllIllIlIIll) + lllllllllllllIIlIIlllllIllIlIIIl[LayerSheepWool.lIIlllIlIIlIII[3]] * lllllllllllllIIlIIlllllIllIlIIll);
                "".length();
                if ((0x43 ^ 0x47) < -" ".length()) {
                    return;
                }
            }
            else {
                final float[] lllllllllllllIIlIIlllllIllIlIIII = EntitySheep.func_175513_a(lllllllllllllIIlIIlllllIlllIIIII.getFleeceColor());
                GlStateManager.color(lllllllllllllIIlIIlllllIllIlIIII[LayerSheepWool.lIIlllIlIIlIII[0]], lllllllllllllIIlIIlllllIllIlIIII[LayerSheepWool.lIIlllIlIIlIII[1]], lllllllllllllIIlIIlllllIllIlIIII[LayerSheepWool.lIIlllIlIIlIII[3]]);
            }
            this.sheepModel.setModelAttributes(this.sheepRenderer.getMainModel());
            this.sheepModel.setLivingAnimations(lllllllllllllIIlIIlllllIlllIIIII, lllllllllllllIIlIIlllllIllIIllIl, lllllllllllllIIlIIlllllIllIIllII, lllllllllllllIIlIIlllllIllIlllIl);
            this.sheepModel.render(lllllllllllllIIlIIlllllIlllIIIII, lllllllllllllIIlIIlllllIllIIllIl, lllllllllllllIIlIIlllllIllIIllII, lllllllllllllIIlIIlllllIllIlllII, lllllllllllllIIlIIlllllIllIllIll, lllllllllllllIIlIIlllllIllIllIlI, lllllllllllllIIlIIlllllIllIIIlll);
        }
    }
}
