// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBat;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityBat;

public class RenderBat extends RenderLiving<EntityBat>
{
    private static final /* synthetic */ ResourceLocation batTextures;
    private static final /* synthetic */ String[] lIIIIIIIllIIII;
    private static final /* synthetic */ int[] lIIIIIIIllIIIl;
    
    public RenderBat(final RenderManager lllllllllllllIlIlIIIllllIlllllIl) {
        super(lllllllllllllIlIlIIIllllIlllllIl, new ModelBat(), 0.25f);
    }
    
    private static void lIllIIllIIlllll() {
        (lIIIIIIIllIIII = new String[RenderBat.lIIIIIIIllIIIl[1]])[RenderBat.lIIIIIIIllIIIl[0]] = lIllIIllIIllllI("8Z+UDw+e1bUstA37hmrHnW6u+51XIWk/", "eMxwz");
    }
    
    private static void lIllIIllIlIIIII() {
        (lIIIIIIIllIIIl = new int[3])[0] = ((0x69 ^ 0x57) & ~(0xBC ^ 0x82));
        RenderBat.lIIIIIIIllIIIl[1] = " ".length();
        RenderBat.lIIIIIIIllIIIl[2] = "  ".length();
    }
    
    @Override
    protected void preRenderCallback(final EntityBat lllllllllllllIlIlIIIllllIllllIIl, final float lllllllllllllIlIlIIIllllIllllIII) {
        GlStateManager.scale(0.35f, 0.35f, 0.35f);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityBat lllllllllllllIlIlIIIllllIllllIll) {
        return RenderBat.batTextures;
    }
    
    private static String lIllIIllIIllllI(final String lllllllllllllIlIlIIIllllIlIIllIl, final String lllllllllllllIlIlIIIllllIlIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIllllIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIllllIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIllllIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIllllIlIIllll.init(RenderBat.lIIIIIIIllIIIl[2], lllllllllllllIlIlIIIllllIlIlIIII);
            return new String(lllllllllllllIlIlIIIllllIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIllllIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIllllIlIIlllI) {
            lllllllllllllIlIlIIIllllIlIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIllIlIIIIl(final int lllllllllllllIlIlIIIllllIlIIIllI) {
        return lllllllllllllIlIlIIIllllIlIIIllI == 0;
    }
    
    @Override
    protected void rotateCorpse(final EntityBat lllllllllllllIlIlIIIllllIllIllII, final float lllllllllllllIlIlIIIllllIllIlIll, final float lllllllllllllIlIlIIIllllIllIlIlI, final float lllllllllllllIlIlIIIllllIllIlllI) {
        if (lIllIIllIlIIIIl(lllllllllllllIlIlIIIllllIllIllII.getIsBatHanging() ? 1 : 0)) {
            GlStateManager.translate(0.0f, MathHelper.cos(lllllllllllllIlIlIIIllllIllIlIll * 0.3f) * 0.1f, 0.0f);
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else {
            GlStateManager.translate(0.0f, -0.1f, 0.0f);
        }
        super.rotateCorpse(lllllllllllllIlIlIIIllllIllIllII, lllllllllllllIlIlIIIllllIllIlIll, lllllllllllllIlIlIIIllllIllIlIlI, lllllllllllllIlIlIIIllllIllIlllI);
    }
    
    static {
        lIllIIllIlIIIII();
        lIllIIllIIlllll();
        batTextures = new ResourceLocation(RenderBat.lIIIIIIIllIIII[RenderBat.lIIIIIIIllIIIl[0]]);
    }
}
