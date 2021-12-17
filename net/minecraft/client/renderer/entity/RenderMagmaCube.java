// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelMagmaCube;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityMagmaCube;

public class RenderMagmaCube extends RenderLiving<EntityMagmaCube>
{
    private static final /* synthetic */ String[] llIIlIIIIIIlIl;
    private static final /* synthetic */ int[] llIIlIIIIIIllI;
    private static final /* synthetic */ ResourceLocation magmaCubeTextures;
    
    @Override
    protected void preRenderCallback(final EntityMagmaCube llllllllllllIlllIIlllIIIIIllIlll, final float llllllllllllIlllIIlllIIIIIllllII) {
        final int llllllllllllIlllIIlllIIIIIlllIll = llllllllllllIlllIIlllIIIIIllIlll.getSlimeSize();
        final float llllllllllllIlllIIlllIIIIIlllIlI = (llllllllllllIlllIIlllIIIIIllIlll.prevSquishFactor + (llllllllllllIlllIIlllIIIIIllIlll.squishFactor - llllllllllllIlllIIlllIIIIIllIlll.prevSquishFactor) * llllllllllllIlllIIlllIIIIIllllII) / (llllllllllllIlllIIlllIIIIIlllIll * 0.5f + 1.0f);
        final float llllllllllllIlllIIlllIIIIIlllIIl = 1.0f / (llllllllllllIlllIIlllIIIIIlllIlI + 1.0f);
        final float llllllllllllIlllIIlllIIIIIlllIII = (float)llllllllllllIlllIIlllIIIIIlllIll;
        GlStateManager.scale(llllllllllllIlllIIlllIIIIIlllIIl * llllllllllllIlllIIlllIIIIIlllIII, 1.0f / llllllllllllIlllIIlllIIIIIlllIIl * llllllllllllIlllIIlllIIIIIlllIII, llllllllllllIlllIIlllIIIIIlllIIl * llllllllllllIlllIIlllIIIIIlllIII);
    }
    
    private static void lIIIlIlllIIIIIlI() {
        (llIIlIIIIIIlIl = new String[RenderMagmaCube.llIIlIIIIIIllI[1]])[RenderMagmaCube.llIIlIIIIIIllI[0]] = lIIIlIlllIIIIIIl("eohunoGS+ZFr0iN8uo+smJwCwF1FzTsci1tE7zaxzbijYZHogrOWMw==", "gJzzX");
    }
    
    private static void lIIIlIlllIIIIIll() {
        (llIIlIIIIIIllI = new int[4])[0] = ((0x2B ^ 0x4) & ~(0xAC ^ 0x83));
        RenderMagmaCube.llIIlIIIIIIllI[1] = " ".length();
        RenderMagmaCube.llIIlIIIIIIllI[2] = (0x43 ^ 0x4B);
        RenderMagmaCube.llIIlIIIIIIllI[3] = "  ".length();
    }
    
    public RenderMagmaCube(final RenderManager llllllllllllIlllIIlllIIIIlIIIlll) {
        super(llllllllllllIlllIIlllIIIIlIIIlll, new ModelMagmaCube(), 0.25f);
    }
    
    static {
        lIIIlIlllIIIIIll();
        lIIIlIlllIIIIIlI();
        magmaCubeTextures = new ResourceLocation(RenderMagmaCube.llIIlIIIIIIlIl[RenderMagmaCube.llIIlIIIIIIllI[0]]);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityMagmaCube llllllllllllIlllIIlllIIIIlIIIlIl) {
        return RenderMagmaCube.magmaCubeTextures;
    }
    
    private static String lIIIlIlllIIIIIIl(final String llllllllllllIlllIIlllIIIIIlIIIII, final String llllllllllllIlllIIlllIIIIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllIIIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllIIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), RenderMagmaCube.llIIlIIIIIIllI[2]), "DES");
            final Cipher llllllllllllIlllIIlllIIIIIlIIIlI = Cipher.getInstance("DES");
            llllllllllllIlllIIlllIIIIIlIIIlI.init(RenderMagmaCube.llIIlIIIIIIllI[3], llllllllllllIlllIIlllIIIIIlIIIll);
            return new String(llllllllllllIlllIIlllIIIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllIIIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllIIIIIlIIIIl) {
            llllllllllllIlllIIlllIIIIIlIIIIl.printStackTrace();
            return null;
        }
    }
}
