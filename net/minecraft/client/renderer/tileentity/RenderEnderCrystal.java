// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.model.ModelEnderCrystal;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.client.renderer.entity.Render;

public class RenderEnderCrystal extends Render<EntityEnderCrystal>
{
    private static final /* synthetic */ ResourceLocation enderCrystalTextures;
    private static final /* synthetic */ int[] lllIIlIllIlIlI;
    private /* synthetic */ ModelBase modelEnderCrystal;
    private static final /* synthetic */ String[] lllIIlIllIlIII;
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityEnderCrystal llllllllllllIlIllllIIlIllllllIlI) {
        return RenderEnderCrystal.enderCrystalTextures;
    }
    
    static {
        lIIlllllllIllIII();
        lIIlllllllIlIllI();
        enderCrystalTextures = new ResourceLocation(RenderEnderCrystal.lllIIlIllIlIII[RenderEnderCrystal.lllIIlIllIlIlI[0]]);
    }
    
    public RenderEnderCrystal(final RenderManager llllllllllllIlIllllIIllIIIlIlIll) {
        super(llllllllllllIlIllllIIllIIIlIlIll);
        this.modelEnderCrystal = new ModelEnderCrystal(0.0f, (boolean)(RenderEnderCrystal.lllIIlIllIlIlI[1] != 0));
        this.shadowSize = 0.5f;
    }
    
    @Override
    public void doRender(final EntityEnderCrystal llllllllllllIlIllllIIllIIIIlllII, final double llllllllllllIlIllllIIllIIIIllIlI, final double llllllllllllIlIllllIIllIIIIIlIII, final double llllllllllllIlIllllIIllIIIIlIllI, final float llllllllllllIlIllllIIllIIIIIIlII, final float llllllllllllIlIllllIIllIIIIIIIll) {
        final float llllllllllllIlIllllIIllIIIIlIIII = llllllllllllIlIllllIIllIIIIlllII.innerRotation + llllllllllllIlIllllIIllIIIIIIIll;
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)llllllllllllIlIllllIIllIIIIllIlI, (float)llllllllllllIlIllllIIllIIIIIlIII, (float)llllllllllllIlIllllIIllIIIIlIllI);
        this.bindTexture(RenderEnderCrystal.enderCrystalTextures);
        float llllllllllllIlIllllIIllIIIIIlllI = MathHelper.sin(llllllllllllIlIllllIIllIIIIlIIII * 0.2f) / 2.0f + 0.5f;
        llllllllllllIlIllllIIllIIIIIlllI += llllllllllllIlIllllIIllIIIIIlllI * llllllllllllIlIllllIIllIIIIIlllI;
        this.modelEnderCrystal.render(llllllllllllIlIllllIIllIIIIlllII, 0.0f, llllllllllllIlIllllIIllIIIIlIIII * 3.0f, llllllllllllIlIllllIIllIIIIIlllI * 0.2f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.popMatrix();
        super.doRender(llllllllllllIlIllllIIllIIIIlllII, llllllllllllIlIllllIIllIIIIllIlI, llllllllllllIlIllllIIllIIIIIlIII, llllllllllllIlIllllIIllIIIIlIllI, llllllllllllIlIllllIIllIIIIIIlII, llllllllllllIlIllllIIllIIIIIIIll);
    }
    
    private static void lIIlllllllIllIII() {
        (lllIIlIllIlIlI = new int[3])[0] = ((0xD1 ^ 0x9E) & ~(0xEF ^ 0xA0));
        RenderEnderCrystal.lllIIlIllIlIlI[1] = " ".length();
        RenderEnderCrystal.lllIIlIllIlIlI[2] = "  ".length();
    }
    
    private static void lIIlllllllIlIllI() {
        (lllIIlIllIlIII = new String[RenderEnderCrystal.lllIIlIllIlIlI[1]])[RenderEnderCrystal.lllIIlIllIlIlI[0]] = lIIlllllllIlIlIl("p8qRuZzzECZrIQrTtDB9j7HJ1uJOC82C4fm4iN7uwvyAJ5mkj9fmiWU16T/KDYXC", "iyNhg");
    }
    
    private static String lIIlllllllIlIlIl(final String llllllllllllIlIllllIIlIlllIIllll, final String llllllllllllIlIllllIIlIlllIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIlIlllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIlIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIlIlllIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIlIlllIlIIIl.init(RenderEnderCrystal.lllIIlIllIlIlI[2], llllllllllllIlIllllIIlIlllIlIIll);
            return new String(llllllllllllIlIllllIIlIlllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIlIlllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIlIlllIlIIII) {
            llllllllllllIlIllllIIlIlllIlIIII.printStackTrace();
            return null;
        }
    }
}
