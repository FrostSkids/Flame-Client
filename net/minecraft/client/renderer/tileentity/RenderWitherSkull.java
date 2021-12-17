// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.client.renderer.entity.Render;

public class RenderWitherSkull extends Render<EntityWitherSkull>
{
    private final /* synthetic */ ModelSkeletonHead skeletonHeadModel;
    private static final /* synthetic */ String[] lIIlIIlIIlIlll;
    private static final /* synthetic */ ResourceLocation invulnerableWitherTextures;
    private static final /* synthetic */ int[] lIIlIIlIIllIII;
    private static final /* synthetic */ ResourceLocation witherTextures;
    
    private static int llIIllIIlIllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void llIIllIIlIlllIl() {
        (lIIlIIlIIllIII = new int[4])[0] = ((105 + 33 - 134 + 185 ^ 58 + 108 - 149 + 152) & (0x23 ^ 0xF ^ (0x45 ^ 0x7D) ^ -" ".length()));
        RenderWitherSkull.lIIlIIlIIllIII[1] = " ".length();
        RenderWitherSkull.lIIlIIlIIllIII[2] = "  ".length();
        RenderWitherSkull.lIIlIIlIIllIII[3] = (0xAA ^ 0xA2);
    }
    
    static {
        llIIllIIlIlllIl();
        llIIllIIlIlllII();
        invulnerableWitherTextures = new ResourceLocation(RenderWitherSkull.lIIlIIlIIlIlll[RenderWitherSkull.lIIlIIlIIllIII[0]]);
        witherTextures = new ResourceLocation(RenderWitherSkull.lIIlIIlIIlIlll[RenderWitherSkull.lIIlIIlIIllIII[1]]);
    }
    
    private static String llIIllIIlIllIll(final String lllllllllllllIIllIllllIlIlIllllI, final String lllllllllllllIIllIllllIlIlIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIllllIlIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllllIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), RenderWitherSkull.lIIlIIlIIllIII[3]), "DES");
            final Cipher lllllllllllllIIllIllllIlIllIIIII = Cipher.getInstance("DES");
            lllllllllllllIIllIllllIlIllIIIII.init(RenderWitherSkull.lIIlIIlIIllIII[2], lllllllllllllIIllIllllIlIllIIIIl);
            return new String(lllllllllllllIIllIllllIlIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllllIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllllIlIlIlllll) {
            lllllllllllllIIllIllllIlIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIllIIllIIIIl(final int lllllllllllllIIllIllllIlIlIlIIll) {
        return lllllllllllllIIllIllllIlIlIlIIll < 0;
    }
    
    public RenderWitherSkull(final RenderManager lllllllllllllIIllIllllIllIllIllI) {
        super(lllllllllllllIIllIllllIllIllIllI);
        this.skeletonHeadModel = new ModelSkeletonHead();
    }
    
    private float func_82400_a(final float lllllllllllllIIllIllllIllIlIlIlI, final float lllllllllllllIIllIllllIllIlIllIl, final float lllllllllllllIIllIllllIllIlIllII) {
        float lllllllllllllIIllIllllIllIlIlIll = lllllllllllllIIllIllllIllIlIllIl - lllllllllllllIIllIllllIllIlIlIlI;
        "".length();
        if (((0x79 ^ 0x60 ^ (0x4 ^ 0x28)) & (35 + 62 - 66 + 141 ^ 13 + 49 + 75 + 16 ^ -" ".length())) > 0) {
            return 0.0f;
        }
        while (!llIIllIIllIIIII(llIIllIIlIllllI(lllllllllllllIIllIllllIllIlIlIll, -180.0f))) {
            lllllllllllllIIllIllllIllIlIlIll += 360.0f;
        }
        "".length();
        if ((0xDE ^ 0xB6 ^ (0xD6 ^ 0xBA)) < ("   ".length() & ("   ".length() ^ -" ".length()))) {
            return 0.0f;
        }
        while (!llIIllIIllIIIIl(llIIllIIlIlllll(lllllllllllllIIllIllllIllIlIlIll, 180.0f))) {
            lllllllllllllIIllIllllIllIlIlIll -= 360.0f;
        }
        return lllllllllllllIIllIllllIllIlIlIlI + lllllllllllllIIllIllllIllIlIllII * lllllllllllllIIllIllllIllIlIlIll;
    }
    
    @Override
    public void doRender(final EntityWitherSkull lllllllllllllIIllIllllIllIIllIll, final double lllllllllllllIIllIllllIllIIllIlI, final double lllllllllllllIIllIllllIllIIllIIl, final double lllllllllllllIIllIllllIllIIllIII, final float lllllllllllllIIllIllllIllIIlIlll, final float lllllllllllllIIllIllllIllIIlIllI) {
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        final float lllllllllllllIIllIllllIllIIlIlIl = this.func_82400_a(lllllllllllllIIllIllllIllIIllIll.prevRotationYaw, lllllllllllllIIllIllllIllIIllIll.rotationYaw, lllllllllllllIIllIllllIllIIlIllI);
        final float lllllllllllllIIllIllllIllIIlIlII = lllllllllllllIIllIllllIllIIllIll.prevRotationPitch + (lllllllllllllIIllIllllIllIIllIll.rotationPitch - lllllllllllllIIllIllllIllIIllIll.prevRotationPitch) * lllllllllllllIIllIllllIllIIlIllI;
        GlStateManager.translate((float)lllllllllllllIIllIllllIllIIllIlI, (float)lllllllllllllIIllIllllIllIIllIIl, (float)lllllllllllllIIllIllllIllIIllIII);
        final float lllllllllllllIIllIllllIllIIlIIll = 0.0625f;
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0f, -1.0f, 1.0f);
        GlStateManager.enableAlpha();
        this.bindEntityTexture(lllllllllllllIIllIllllIllIIllIll);
        "".length();
        this.skeletonHeadModel.render(lllllllllllllIIllIllllIllIIllIll, 0.0f, 0.0f, 0.0f, lllllllllllllIIllIllllIllIIlIlIl, lllllllllllllIIllIllllIllIIlIlII, lllllllllllllIIllIllllIllIIlIIll);
        GlStateManager.popMatrix();
        super.doRender(lllllllllllllIIllIllllIllIIllIll, lllllllllllllIIllIllllIllIIllIlI, lllllllllllllIIllIllllIllIIllIIl, lllllllllllllIIllIllllIllIIllIII, lllllllllllllIIllIllllIllIIlIlll, lllllllllllllIIllIllllIllIIlIllI);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityWitherSkull lllllllllllllIIllIllllIllIIIIllI) {
        ResourceLocation resourceLocation;
        if (llIIllIIllIIIlI(lllllllllllllIIllIllllIllIIIIllI.isInvulnerable() ? 1 : 0)) {
            resourceLocation = RenderWitherSkull.invulnerableWitherTextures;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            resourceLocation = RenderWitherSkull.witherTextures;
        }
        return resourceLocation;
    }
    
    private static boolean llIIllIIllIIIII(final int lllllllllllllIIllIllllIlIlIlIlIl) {
        return lllllllllllllIIllIllllIlIlIlIlIl >= 0;
    }
    
    private static boolean llIIllIIllIIIlI(final int lllllllllllllIIllIllllIlIlIlIlll) {
        return lllllllllllllIIllIllllIlIlIlIlll != 0;
    }
    
    private static String llIIllIIlIllIlI(final String lllllllllllllIIllIllllIlIllIlIIl, final String lllllllllllllIIllIllllIlIllIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIllllIlIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllllIlIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIllllIlIllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIllllIlIllIllIl.init(RenderWitherSkull.lIIlIIlIIllIII[2], lllllllllllllIIllIllllIlIllIlllI);
            return new String(lllllllllllllIIllIllllIlIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllllIlIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllllIlIllIllII) {
            lllllllllllllIIllIllllIlIllIllII.printStackTrace();
            return null;
        }
    }
    
    private static void llIIllIIlIlllII() {
        (lIIlIIlIIlIlll = new String[RenderWitherSkull.lIIlIIlIIllIII[2]])[RenderWitherSkull.lIIlIIlIIllIII[0]] = llIIllIIlIllIlI("dyqXuOXofSarFTkhIKvWC8n6R+Iaf2K/NrrSzfrWL0MWqa4/WD4OKecFPSso5IVb", "yzDzv");
        RenderWitherSkull.lIIlIIlIIlIlll[RenderWitherSkull.lIIlIIlIIllIII[1]] = llIIllIIlIllIll("9oplAv5Lu68n9NZe8+ZSLHIeopntgV2rYiQAfxMewemm06Iv9PVNEw==", "uePxl");
    }
    
    private static int llIIllIIlIlllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
