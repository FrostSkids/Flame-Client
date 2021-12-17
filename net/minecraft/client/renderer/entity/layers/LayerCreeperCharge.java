// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityCreeper;

public class LayerCreeperCharge implements LayerRenderer<EntityCreeper>
{
    private static final /* synthetic */ String[] lIIIIIIlllIlll;
    private static final /* synthetic */ ResourceLocation LIGHTNING_TEXTURE;
    private static final /* synthetic */ int[] lIIIIIIllllIIl;
    private final /* synthetic */ RenderCreeper creeperRenderer;
    private final /* synthetic */ ModelCreeper creeperModel;
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerCreeperCharge.lIIIIIIllllIIl[0] != 0;
    }
    
    private static String lIllIlIlIIIIllI(final String lllllllllllllIlIIllllllIllllIIlI, final String lllllllllllllIlIIllllllIllllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllllllIllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllllllIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllllllIllllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllllllIllllIlII.init(LayerCreeperCharge.lIIIIIIllllIIl[4], lllllllllllllIlIIllllllIllllIlIl);
            return new String(lllllllllllllIlIIllllllIllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllllllIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllllllIllllIIll) {
            lllllllllllllIlIIllllllIllllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void doRenderLayer(final EntityCreeper lllllllllllllIlIIlllllllIIIlIlll, final float lllllllllllllIlIIlllllllIIIlIllI, final float lllllllllllllIlIIlllllllIIIlIlIl, final float lllllllllllllIlIIlllllllIIlIIIII, final float lllllllllllllIlIIlllllllIIIlIIll, final float lllllllllllllIlIIlllllllIIIllllI, final float lllllllllllllIlIIlllllllIIIlIIIl, final float lllllllllllllIlIIlllllllIIIlIIII) {
        if (lIllIlIlIIlIlII(lllllllllllllIlIIlllllllIIIlIlll.getPowered() ? 1 : 0)) {
            final boolean lllllllllllllIlIIlllllllIIIllIll = lllllllllllllIlIIlllllllIIIlIlll.isInvisible();
            int lllllllllllllIIlIlIIlllIIIIIIIIl;
            if (lIllIlIlIIlIlII(lllllllllllllIlIIlllllllIIIllIll ? 1 : 0)) {
                lllllllllllllIIlIlIIlllIIIIIIIIl = LayerCreeperCharge.lIIIIIIllllIIl[0];
                "".length();
                if ((0x1B ^ 0x56 ^ (0x2B ^ 0x63)) == 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIlIIlllIIIIIIIIl = LayerCreeperCharge.lIIIIIIllllIIl[1];
            }
            GlStateManager.depthMask((boolean)(lllllllllllllIIlIlIIlllIIIIIIIIl != 0));
            this.creeperRenderer.bindTexture(LayerCreeperCharge.LIGHTNING_TEXTURE);
            GlStateManager.matrixMode(LayerCreeperCharge.lIIIIIIllllIIl[2]);
            GlStateManager.loadIdentity();
            final float lllllllllllllIlIIlllllllIIIllIlI = lllllllllllllIlIIlllllllIIIlIlll.ticksExisted + lllllllllllllIlIIlllllllIIlIIIII;
            GlStateManager.translate(lllllllllllllIlIIlllllllIIIllIlI * 0.01f, lllllllllllllIlIIlllllllIIIllIlI * 0.01f, 0.0f);
            GlStateManager.matrixMode(LayerCreeperCharge.lIIIIIIllllIIl[3]);
            GlStateManager.enableBlend();
            final float lllllllllllllIlIIlllllllIIIllIIl = 0.5f;
            GlStateManager.color(lllllllllllllIlIIlllllllIIIllIIl, lllllllllllllIlIIlllllllIIIllIIl, lllllllllllllIlIIlllllllIIIllIIl, 1.0f);
            GlStateManager.disableLighting();
            GlStateManager.blendFunc(LayerCreeperCharge.lIIIIIIllllIIl[1], LayerCreeperCharge.lIIIIIIllllIIl[1]);
            this.creeperModel.setModelAttributes(this.creeperRenderer.getMainModel());
            this.creeperModel.render(lllllllllllllIlIIlllllllIIIlIlll, lllllllllllllIlIIlllllllIIIlIllI, lllllllllllllIlIIlllllllIIIlIlIl, lllllllllllllIlIIlllllllIIIlIIll, lllllllllllllIlIIlllllllIIIllllI, lllllllllllllIlIIlllllllIIIlIIIl, lllllllllllllIlIIlllllllIIIlIIII);
            GlStateManager.matrixMode(LayerCreeperCharge.lIIIIIIllllIIl[2]);
            GlStateManager.loadIdentity();
            GlStateManager.matrixMode(LayerCreeperCharge.lIIIIIIllllIIl[3]);
            GlStateManager.enableLighting();
            GlStateManager.disableBlend();
            GlStateManager.depthMask(lllllllllllllIlIIlllllllIIIllIll);
        }
    }
    
    public LayerCreeperCharge(final RenderCreeper lllllllllllllIlIIlllllllIIllIIIl) {
        this.creeperModel = new ModelCreeper(2.0f);
        this.creeperRenderer = lllllllllllllIlIIlllllllIIllIIIl;
    }
    
    static {
        lIllIlIlIIlIIll();
        lIllIlIlIIIIlll();
        LIGHTNING_TEXTURE = new ResourceLocation(LayerCreeperCharge.lIIIIIIlllIlll[LayerCreeperCharge.lIIIIIIllllIIl[0]]);
    }
    
    private static void lIllIlIlIIIIlll() {
        (lIIIIIIlllIlll = new String[LayerCreeperCharge.lIIIIIIllllIIl[1]])[LayerCreeperCharge.lIIIIIIllllIIl[0]] = lIllIlIlIIIIllI("mMBD4+pAJvHEthEToq7IKMzGyZIKd5rXeP/pyjqTCmGVwORjQLohSkTHXph6Ru+x", "YJNze");
    }
    
    private static boolean lIllIlIlIIlIlII(final int lllllllllllllIlIIllllllIlllIlIll) {
        return lllllllllllllIlIIllllllIlllIlIll != 0;
    }
    
    private static void lIllIlIlIIlIIll() {
        (lIIIIIIllllIIl = new int[5])[0] = ((0xDE ^ 0x8C) & ~(0xD6 ^ 0x84));
        LayerCreeperCharge.lIIIIIIllllIIl[1] = " ".length();
        LayerCreeperCharge.lIIIIIIllllIIl[2] = (0xFFFF97DF & 0x7F22);
        LayerCreeperCharge.lIIIIIIllllIIl[3] = (0xFFFFBF19 & 0x57E6);
        LayerCreeperCharge.lIIIIIIllllIIl[4] = "  ".length();
    }
}
