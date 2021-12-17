// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelGhast;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityGhast;

public class RenderGhast extends RenderLiving<EntityGhast>
{
    private static final /* synthetic */ ResourceLocation ghastTextures;
    private static final /* synthetic */ int[] lllIlIIllIIIll;
    private static final /* synthetic */ ResourceLocation ghastShootingTextures;
    private static final /* synthetic */ String[] lllIlIIllIIIIl;
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityGhast llllllllllllIlIllIllllIIIlIIIIII) {
        ResourceLocation resourceLocation;
        if (lIlIIIlIIlIlIlll(llllllllllllIlIllIllllIIIlIIIIII.isAttacking() ? 1 : 0)) {
            resourceLocation = RenderGhast.ghastShootingTextures;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            resourceLocation = RenderGhast.ghastTextures;
        }
        return resourceLocation;
    }
    
    @Override
    protected void preRenderCallback(final EntityGhast llllllllllllIlIllIllllIIIIllIIll, final float llllllllllllIlIllIllllIIIIllIIIl) {
        final float llllllllllllIlIllIllllIIIIlIllll = 1.0f;
        final float llllllllllllIlIllIllllIIIIlIllIl = (8.0f + llllllllllllIlIllIllllIIIIlIllll) / 2.0f;
        final float llllllllllllIlIllIllllIIIIlIlIll = (8.0f + 1.0f / llllllllllllIlIllIllllIIIIlIllll) / 2.0f;
        GlStateManager.scale(llllllllllllIlIllIllllIIIIlIlIll, llllllllllllIlIllIllllIIIIlIllIl, llllllllllllIlIllIllllIIIIlIlIll);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private static void lIlIIIlIIlIlIIIl() {
        (lllIlIIllIIIIl = new String[RenderGhast.lllIlIIllIIIll[2]])[RenderGhast.lllIlIIllIIIll[0]] = lIlIIIlIIlIlIIII("aEZXRVLkq1dbQjOrZw63RRU7oLPgOom3wh03KkxEzss=", "rmyvP");
        RenderGhast.lllIlIIllIIIIl[RenderGhast.lllIlIIllIIIll[1]] = lIlIIIlIIlIlIIII("Rmwt7xAcVLYnfMa9afU4fx28YFX2+eJ9DCMXXuEu2zTMmNU2+lMCdcEhWUMsbACd", "RwVOc");
    }
    
    private static String lIlIIIlIIlIlIIII(final String llllllllllllIlIllIllllIIIIIIIlll, final String llllllllllllIlIllIllllIIIIIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIllllIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllllIIIIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllllIIIIIIllll.init(RenderGhast.lllIlIIllIIIll[2], llllllllllllIlIllIllllIIIIIlIIIl);
            return new String(llllllllllllIlIllIllllIIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllllIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllllIIIIIIllIl) {
            llllllllllllIlIllIllllIIIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIlIIlIlIllI();
        lIlIIIlIIlIlIIIl();
        ghastTextures = new ResourceLocation(RenderGhast.lllIlIIllIIIIl[RenderGhast.lllIlIIllIIIll[0]]);
        ghastShootingTextures = new ResourceLocation(RenderGhast.lllIlIIllIIIIl[RenderGhast.lllIlIIllIIIll[1]]);
    }
    
    private static void lIlIIIlIIlIlIllI() {
        (lllIlIIllIIIll = new int[3])[0] = ((0xE5 ^ 0xB0) & ~(0xEE ^ 0xBB));
        RenderGhast.lllIlIIllIIIll[1] = " ".length();
        RenderGhast.lllIlIIllIIIll[2] = "  ".length();
    }
    
    private static boolean lIlIIIlIIlIlIlll(final int llllllllllllIlIllIlllIllllllllII) {
        return llllllllllllIlIllIlllIllllllllII != 0;
    }
    
    public RenderGhast(final RenderManager llllllllllllIlIllIllllIIIlIIlIII) {
        super(llllllllllllIlIllIllllIIIlIIlIII, new ModelGhast(), 0.5f);
    }
}
