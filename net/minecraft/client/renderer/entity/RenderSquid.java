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
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntitySquid;

public class RenderSquid extends RenderLiving<EntitySquid>
{
    private static final /* synthetic */ String[] lIIIIlIIllIIIl;
    private static final /* synthetic */ ResourceLocation squidTextures;
    private static final /* synthetic */ int[] lIIIIlIIllIllI;
    
    public RenderSquid(final RenderManager lllllllllllllIlIIlIlllllIllIlIII, final ModelBase lllllllllllllIlIIlIlllllIllIIlll, final float lllllllllllllIlIIlIlllllIllIlIlI) {
        super(lllllllllllllIlIIlIlllllIllIlIII, lllllllllllllIlIIlIlllllIllIIlll, lllllllllllllIlIIlIlllllIllIlIlI);
    }
    
    private static void lIlllIIIlllIlIl() {
        (lIIIIlIIllIIIl = new String[RenderSquid.lIIIIlIIllIllI[1]])[RenderSquid.lIIIIlIIllIllI[0]] = lIlllIIIlllIlII("rmiR2CA0G/QyAU2/Ko08pc8ctiyJezbOWZ5mNpAneXY=", "SvFDo");
    }
    
    @Override
    protected void rotateCorpse(final EntitySquid lllllllllllllIlIIlIlllllIlIlllIl, final float lllllllllllllIlIIlIlllllIlIlllII, final float lllllllllllllIlIIlIlllllIlIlIllI, final float lllllllllllllIlIIlIlllllIlIllIlI) {
        final float lllllllllllllIlIIlIlllllIlIllIIl = lllllllllllllIlIIlIlllllIlIlllIl.prevSquidPitch + (lllllllllllllIlIIlIlllllIlIlllIl.squidPitch - lllllllllllllIlIIlIlllllIlIlllIl.prevSquidPitch) * lllllllllllllIlIIlIlllllIlIllIlI;
        final float lllllllllllllIlIIlIlllllIlIllIII = lllllllllllllIlIIlIlllllIlIlllIl.prevSquidYaw + (lllllllllllllIlIIlIlllllIlIlllIl.squidYaw - lllllllllllllIlIIlIlllllIlIlllIl.prevSquidYaw) * lllllllllllllIlIIlIlllllIlIllIlI;
        GlStateManager.translate(0.0f, 0.5f, 0.0f);
        GlStateManager.rotate(180.0f - lllllllllllllIlIIlIlllllIlIlIllI, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(lllllllllllllIlIIlIlllllIlIllIIl, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(lllllllllllllIlIIlIlllllIlIllIII, 0.0f, 1.0f, 0.0f);
        GlStateManager.translate(0.0f, -1.2f, 0.0f);
    }
    
    private static void lIlllIIIlllIlll() {
        (lIIIIlIIllIllI = new int[4])[0] = ((109 + 86 - 97 + 84 ^ 130 + 4 + 15 + 18) & (9 + 48 - 41 + 162 ^ 159 + 115 - 209 + 98 ^ -" ".length()));
        RenderSquid.lIIIIlIIllIllI[1] = " ".length();
        RenderSquid.lIIIIlIIllIllI[2] = (0xA ^ 0x2);
        RenderSquid.lIIIIlIIllIllI[3] = "  ".length();
    }
    
    @Override
    protected float handleRotationFloat(final EntitySquid lllllllllllllIlIIlIlllllIlIIllll, final float lllllllllllllIlIIlIlllllIlIIllII) {
        return lllllllllllllIlIIlIlllllIlIIllll.lastTentacleAngle + (lllllllllllllIlIIlIlllllIlIIllll.tentacleAngle - lllllllllllllIlIIlIlllllIlIIllll.lastTentacleAngle) * lllllllllllllIlIIlIlllllIlIIllII;
    }
    
    private static String lIlllIIIlllIlII(final String lllllllllllllIlIIlIlllllIIllIIII, final String lllllllllllllIlIIlIlllllIIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlllllIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlllllIIlIllIl.getBytes(StandardCharsets.UTF_8)), RenderSquid.lIIIIlIIllIllI[2]), "DES");
            final Cipher lllllllllllllIlIIlIlllllIIllIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlllllIIllIIlI.init(RenderSquid.lIIIIlIIllIllI[3], lllllllllllllIlIIlIlllllIIllIIll);
            return new String(lllllllllllllIlIIlIlllllIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlllllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlllllIIllIIIl) {
            lllllllllllllIlIIlIlllllIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlllIIIlllIlll();
        lIlllIIIlllIlIl();
        squidTextures = new ResourceLocation(RenderSquid.lIIIIlIIllIIIl[RenderSquid.lIIIIlIIllIllI[0]]);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntitySquid lllllllllllllIlIIlIlllllIllIIlII) {
        return RenderSquid.squidTextures;
    }
}
