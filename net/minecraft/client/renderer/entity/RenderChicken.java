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
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityChicken;

public class RenderChicken extends RenderLiving<EntityChicken>
{
    private static final /* synthetic */ String[] lIIIIIllIIIIII;
    private static final /* synthetic */ ResourceLocation chickenTextures;
    private static final /* synthetic */ int[] lIIIIIllIIIIlI;
    
    public RenderChicken(final RenderManager lllllllllllllIlIIlllIIlIIlIIlIIl, final ModelBase lllllllllllllIlIIlllIIlIIlIIllII, final float lllllllllllllIlIIlllIIlIIlIIIlll) {
        super(lllllllllllllIlIIlllIIlIIlIIlIIl, lllllllllllllIlIIlllIIlIIlIIllII, lllllllllllllIlIIlllIIlIIlIIIlll);
    }
    
    static {
        lIllIllIlIllIlI();
        lIllIllIlIlIllI();
        chickenTextures = new ResourceLocation(RenderChicken.lIIIIIllIIIIII[RenderChicken.lIIIIIllIIIIlI[0]]);
    }
    
    private static void lIllIllIlIllIlI() {
        (lIIIIIllIIIIlI = new int[3])[0] = ((0xAA ^ 0xB1) & ~(0xAB ^ 0xB0));
        RenderChicken.lIIIIIllIIIIlI[1] = " ".length();
        RenderChicken.lIIIIIllIIIIlI[2] = "  ".length();
    }
    
    @Override
    protected float handleRotationFloat(final EntityChicken lllllllllllllIlIIlllIIlIIIllllll, final float lllllllllllllIlIIlllIIlIIIlllIlI) {
        final float lllllllllllllIlIIlllIIlIIIllllIl = lllllllllllllIlIIlllIIlIIIllllll.field_70888_h + (lllllllllllllIlIIlllIIlIIIllllll.wingRotation - lllllllllllllIlIIlllIIlIIIllllll.field_70888_h) * lllllllllllllIlIIlllIIlIIIlllIlI;
        final float lllllllllllllIlIIlllIIlIIIllllII = lllllllllllllIlIIlllIIlIIIllllll.field_70884_g + (lllllllllllllIlIIlllIIlIIIllllll.destPos - lllllllllllllIlIIlllIIlIIIllllll.field_70884_g) * lllllllllllllIlIIlllIIlIIIlllIlI;
        return (MathHelper.sin(lllllllllllllIlIIlllIIlIIIllllIl) + 1.0f) * lllllllllllllIlIIlllIIlIIIllllII;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityChicken lllllllllllllIlIIlllIIlIIlIIIlIl) {
        return RenderChicken.chickenTextures;
    }
    
    private static void lIllIllIlIlIllI() {
        (lIIIIIllIIIIII = new String[RenderChicken.lIIIIIllIIIIlI[1]])[RenderChicken.lIIIIIllIIIIlI[0]] = lIllIllIlIlIlIl("SzJtzYR2587GCSJTlcP/Io59Zjlq8n3Asopt/8jAYAE=", "Ovxnh");
    }
    
    private static String lIllIllIlIlIlIl(final String lllllllllllllIlIIlllIIlIIIlIIllI, final String lllllllllllllIlIIlllIIlIIIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIIlIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllIIlIIIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllIIlIIIlIlIII.init(RenderChicken.lIIIIIllIIIIlI[2], lllllllllllllIlIIlllIIlIIIlIlIIl);
            return new String(lllllllllllllIlIIlllIIlIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIIlIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIIlIIIlIIlll) {
            lllllllllllllIlIIlllIIlIIIlIIlll.printStackTrace();
            return null;
        }
    }
}
