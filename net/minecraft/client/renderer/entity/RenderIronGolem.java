// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerIronGolemFlower;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityIronGolem;

public class RenderIronGolem extends RenderLiving<EntityIronGolem>
{
    private static final /* synthetic */ ResourceLocation ironGolemTextures;
    private static final /* synthetic */ String[] lIllIllIIIIlll;
    private static final /* synthetic */ int[] lIllIllIIIlIII;
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityIronGolem llllllllllllIlllllllIllIIIIlIIlI) {
        return RenderIronGolem.ironGolemTextures;
    }
    
    private static boolean lllllllIllIlIIl(final int llllllllllllIlllllllIlIlllIlllIl) {
        return llllllllllllIlllllllIlIlllIlllIl >= 0;
    }
    
    private static String lllllllIllIIlIl(final String llllllllllllIlllllllIlIllllIIIlI, final String llllllllllllIlllllllIlIllllIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllllllIlIllllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIlIllllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllIlIllllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllIlIllllIIllI.init(RenderIronGolem.lIllIllIIIlIII[2], llllllllllllIlllllllIlIllllIIlll);
            return new String(llllllllllllIlllllllIlIllllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIlIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIlIllllIIlIl) {
            llllllllllllIlllllllIlIllllIIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lllllllIllIIlll();
        lllllllIllIIllI();
        ironGolemTextures = new ResourceLocation(RenderIronGolem.lIllIllIIIIlll[RenderIronGolem.lIllIllIIIlIII[0]]);
    }
    
    private static void lllllllIllIIlll() {
        (lIllIllIIIlIII = new int[3])[0] = ((23 + 25 - 36 + 146 ^ 82 + 45 - 79 + 82) & (0xD7 ^ 0xC2 ^ (0x33 ^ 0x3A) ^ -" ".length()));
        RenderIronGolem.lIllIllIIIlIII[1] = " ".length();
        RenderIronGolem.lIllIllIIIlIII[2] = "  ".length();
    }
    
    public RenderIronGolem(final RenderManager llllllllllllIlllllllIllIIIIlIllI) {
        super(llllllllllllIlllllllIllIIIIlIllI, new ModelIronGolem(), 0.5f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerIronGolemFlower(this));
        "".length();
    }
    
    private static void lllllllIllIIllI() {
        (lIllIllIIIIlll = new String[RenderIronGolem.lIllIllIIIlIII[1]])[RenderIronGolem.lIllIllIIIlIII[0]] = lllllllIllIIlIl("BfXrmtom3kPqZEAzg8uf0kC1+rFbiR9nkfjEZPcPvGY=", "oREHG");
    }
    
    private static int lllllllIllIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected void rotateCorpse(final EntityIronGolem llllllllllllIlllllllIllIIIIIlIII, final float llllllllllllIlllllllIlIlllllllll, final float llllllllllllIlllllllIllIIIIIIllI, final float llllllllllllIlllllllIlIlllllllIl) {
        super.rotateCorpse(llllllllllllIlllllllIllIIIIIlIII, llllllllllllIlllllllIlIlllllllll, llllllllllllIlllllllIllIIIIIIllI, llllllllllllIlllllllIlIlllllllIl);
        if (lllllllIllIlIIl(lllllllIllIlIII(llllllllllllIlllllllIllIIIIIlIII.limbSwingAmount, 0.01))) {
            final float llllllllllllIlllllllIllIIIIIIlII = 13.0f;
            final float llllllllllllIlllllllIllIIIIIIIll = llllllllllllIlllllllIllIIIIIlIII.limbSwing - llllllllllllIlllllllIllIIIIIlIII.limbSwingAmount * (1.0f - llllllllllllIlllllllIlIlllllllIl) + 6.0f;
            final float llllllllllllIlllllllIllIIIIIIIlI = (Math.abs(llllllllllllIlllllllIllIIIIIIIll % llllllllllllIlllllllIllIIIIIIlII - llllllllllllIlllllllIllIIIIIIlII * 0.5f) - llllllllllllIlllllllIllIIIIIIlII * 0.25f) / (llllllllllllIlllllllIllIIIIIIlII * 0.25f);
            GlStateManager.rotate(6.5f * llllllllllllIlllllllIllIIIIIIIlI, 0.0f, 0.0f, 1.0f);
        }
    }
}
