// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.entity.layers.LayerCreeperCharge;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityCreeper;

public class RenderCreeper extends RenderLiving<EntityCreeper>
{
    private static final /* synthetic */ int[] llIlIlIIlIlIll;
    private static final /* synthetic */ ResourceLocation creeperTextures;
    private static final /* synthetic */ String[] llIlIlIIlIlIIl;
    
    private static void lIIlIIllllIlllII() {
        (llIlIlIIlIlIIl = new String[RenderCreeper.llIlIlIIlIlIll[5]])[RenderCreeper.llIlIlIIlIlIll[0]] = lIIlIIllllIlIlII("Z3RS8zuhseG9PGR7Z8dTapN49slepRWokd1LuRwcReJluoqkpyx43w==", "MKsZi");
    }
    
    @Override
    protected void preRenderCallback(final EntityCreeper llllllllllllIllIlIlIllIlIlIIIlIl, final float llllllllllllIllIlIlIllIlIlIIlIlI) {
        float llllllllllllIllIlIlIllIlIlIIlIIl = llllllllllllIllIlIlIllIlIlIIIlIl.getCreeperFlashIntensity(llllllllllllIllIlIlIllIlIlIIlIlI);
        final float llllllllllllIllIlIlIllIlIlIIlIII = 1.0f + MathHelper.sin(llllllllllllIllIlIlIllIlIlIIlIIl * 100.0f) * llllllllllllIllIlIlIllIlIlIIlIIl * 0.01f;
        llllllllllllIllIlIlIllIlIlIIlIIl = MathHelper.clamp_float(llllllllllllIllIlIlIllIlIlIIlIIl, 0.0f, 1.0f);
        llllllllllllIllIlIlIllIlIlIIlIIl *= llllllllllllIllIlIlIllIlIlIIlIIl;
        llllllllllllIllIlIlIllIlIlIIlIIl *= llllllllllllIllIlIlIllIlIlIIlIIl;
        final float llllllllllllIllIlIlIllIlIlIIIlll = (1.0f + llllllllllllIllIlIlIllIlIlIIlIIl * 0.4f) * llllllllllllIllIlIlIllIlIlIIlIII;
        final float llllllllllllIllIlIlIllIlIlIIIllI = (1.0f + llllllllllllIllIlIlIllIlIlIIlIIl * 0.1f) / llllllllllllIllIlIlIllIlIlIIlIII;
        GlStateManager.scale(llllllllllllIllIlIlIllIlIlIIIlll, llllllllllllIllIlIlIllIlIlIIIllI, llllllllllllIllIlIlIllIlIlIIIlll);
    }
    
    @Override
    protected int getColorMultiplier(final EntityCreeper llllllllllllIllIlIlIllIlIIllIlIl, final float llllllllllllIllIlIlIllIlIIlllIIl, final float llllllllllllIllIlIlIllIlIIllIlII) {
        final float llllllllllllIllIlIlIllIlIIllIlll = llllllllllllIllIlIlIllIlIIllIlIl.getCreeperFlashIntensity(llllllllllllIllIlIlIllIlIIllIlII);
        if (lIIlIIllllIlllll((int)(llllllllllllIllIlIlIllIlIIllIlll * 10.0f) % RenderCreeper.llIlIlIIlIlIll[1])) {
            return RenderCreeper.llIlIlIIlIlIll[0];
        }
        int llllllllllllIllIlIlIllIlIIllIllI = (int)(llllllllllllIllIlIlIllIlIIllIlll * 0.2f * 255.0f);
        llllllllllllIllIlIlIllIlIIllIllI = MathHelper.clamp_int(llllllllllllIllIlIlIllIlIIllIllI, RenderCreeper.llIlIlIIlIlIll[0], RenderCreeper.llIlIlIIlIlIll[2]);
        return llllllllllllIllIlIlIllIlIIllIllI << RenderCreeper.llIlIlIIlIlIll[3] | RenderCreeper.llIlIlIIlIlIll[4];
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityCreeper llllllllllllIllIlIlIllIlIIllIIII) {
        return RenderCreeper.creeperTextures;
    }
    
    private static boolean lIIlIIllllIlllll(final int llllllllllllIllIlIlIllIlIIIIllll) {
        return llllllllllllIllIlIlIllIlIIIIllll == 0;
    }
    
    static {
        lIIlIIllllIllllI();
        lIIlIIllllIlllII();
        creeperTextures = new ResourceLocation(RenderCreeper.llIlIlIIlIlIIl[RenderCreeper.llIlIlIIlIlIll[0]]);
    }
    
    private static void lIIlIIllllIllllI() {
        (llIlIlIIlIlIll = new int[6])[0] = ((78 + 54 - 113 + 134 ^ 112 + 119 - 145 + 79) & (0x23 ^ 0x7B ^ (0x2E ^ 0x4A) ^ -" ".length()));
        RenderCreeper.llIlIlIIlIlIll[1] = "  ".length();
        RenderCreeper.llIlIlIIlIlIll[2] = 93 + 240 - 160 + 82;
        RenderCreeper.llIlIlIIlIlIll[3] = (0x15 ^ 0xD);
        RenderCreeper.llIlIlIIlIlIll[4] = (-" ".length() & (-1 & 0xFFFFFF));
        RenderCreeper.llIlIlIIlIlIll[5] = " ".length();
    }
    
    public RenderCreeper(final RenderManager llllllllllllIllIlIlIllIlIlIlIIll) {
        super(llllllllllllIllIlIlIllIlIlIlIIll, new ModelCreeper(), 0.5f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerCreeperCharge(this));
        "".length();
    }
    
    private static String lIIlIIllllIlIlII(final String llllllllllllIllIlIlIllIlIIIlIllI, final String llllllllllllIllIlIlIllIlIIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllIlIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIllIlIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIllIlIIIllIII.init(RenderCreeper.llIlIlIIlIlIll[1], llllllllllllIllIlIlIllIlIIIllIIl);
            return new String(llllllllllllIllIlIlIllIlIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIlIIIlIlll) {
            llllllllllllIllIlIlIllIlIIIlIlll.printStackTrace();
            return null;
        }
    }
}
