// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.item.EntityBoat;

public class RenderBoat extends Render<EntityBoat>
{
    private static final /* synthetic */ ResourceLocation boatTextures;
    private static final /* synthetic */ String[] llIlIlIIIlIlII;
    private static final /* synthetic */ int[] llIlIlIIIlIlIl;
    protected /* synthetic */ ModelBase modelBoat;
    
    private static void lIIlIIlllIlIIllI() {
        (llIlIlIIIlIlIl = new int[4])[0] = ((0xD2 ^ 0x94) & ~(0xD8 ^ 0x9E));
        RenderBoat.llIlIlIIIlIlIl[1] = " ".length();
        RenderBoat.llIlIlIIIlIlIl[2] = (0x2 ^ 0xA);
        RenderBoat.llIlIlIIIlIlIl[3] = "  ".length();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityBoat llllllllllllIllIlIlIllllllIlIlII) {
        return RenderBoat.boatTextures;
    }
    
    private static String lIIlIIlllIlIIlII(final String llllllllllllIllIlIlIlllllIlllIII, final String llllllllllllIllIlIlIlllllIllIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlllllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlllllIllIlll.getBytes(StandardCharsets.UTF_8)), RenderBoat.llIlIlIIIlIlIl[2]), "DES");
            final Cipher llllllllllllIllIlIlIlllllIllllII = Cipher.getInstance("DES");
            llllllllllllIllIlIlIlllllIllllII.init(RenderBoat.llIlIlIIIlIlIl[3], llllllllllllIllIlIlIlllllIllllIl);
            return new String(llllllllllllIllIlIlIlllllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlllllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlllllIlllIll) {
            llllllllllllIllIlIlIlllllIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIlllIlIIlIl() {
        (llIlIlIIIlIlII = new String[RenderBoat.llIlIlIIIlIlIl[1]])[RenderBoat.llIlIlIIIlIlIl[0]] = lIIlIIlllIlIIlII("QXPniaJaUs4kBYKPcsBAKlWtCKyfUW5dj7uQEiMaH1k=", "COZxc");
    }
    
    private static boolean lIIlIIlllIlIlIlI(final int llllllllllllIllIlIlIlllllIllIIIl) {
        return llllllllllllIllIlIlIlllllIllIIIl > 0;
    }
    
    static {
        lIIlIIlllIlIIllI();
        lIIlIIlllIlIIlIl();
        boatTextures = new ResourceLocation(RenderBoat.llIlIlIIIlIlII[RenderBoat.llIlIlIIIlIlIl[0]]);
    }
    
    public RenderBoat(final RenderManager llllllllllllIllIlIlIllllllllIllI) {
        super(llllllllllllIllIlIlIllllllllIllI);
        this.modelBoat = new ModelBoat();
        this.shadowSize = 0.5f;
    }
    
    @Override
    public void doRender(final EntityBoat llllllllllllIllIlIlIllllllIllllI, final double llllllllllllIllIlIlIllllllIlllIl, final double llllllllllllIllIlIlIlllllllIIllI, final double llllllllllllIllIlIlIlllllllIIlIl, final float llllllllllllIllIlIlIllllllIllIlI, final float llllllllllllIllIlIlIlllllllIIIll) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)llllllllllllIllIlIlIllllllIlllIl, (float)llllllllllllIllIlIlIlllllllIIllI + 0.25f, (float)llllllllllllIllIlIlIlllllllIIlIl);
        GlStateManager.rotate(180.0f - llllllllllllIllIlIlIllllllIllIlI, 0.0f, 1.0f, 0.0f);
        final float llllllllllllIllIlIlIlllllllIIIlI = llllllllllllIllIlIlIllllllIllllI.getTimeSinceHit() - llllllllllllIllIlIlIlllllllIIIll;
        float llllllllllllIllIlIlIlllllllIIIIl = llllllllllllIllIlIlIllllllIllllI.getDamageTaken() - llllllllllllIllIlIlIlllllllIIIll;
        if (lIIlIIlllIlIlIIl(lIIlIIlllIlIIlll(llllllllllllIllIlIlIlllllllIIIIl, 0.0f))) {
            llllllllllllIllIlIlIlllllllIIIIl = 0.0f;
        }
        if (lIIlIIlllIlIlIlI(lIIlIIlllIlIlIII(llllllllllllIllIlIlIlllllllIIIlI, 0.0f))) {
            GlStateManager.rotate(MathHelper.sin(llllllllllllIllIlIlIlllllllIIIlI) * llllllllllllIllIlIlIlllllllIIIlI * llllllllllllIllIlIlIlllllllIIIIl / 10.0f * llllllllllllIllIlIlIllllllIllllI.getForwardDirection(), 1.0f, 0.0f, 0.0f);
        }
        final float llllllllllllIllIlIlIlllllllIIIII = 0.75f;
        GlStateManager.scale(llllllllllllIllIlIlIlllllllIIIII, llllllllllllIllIlIlIlllllllIIIII, llllllllllllIllIlIlIlllllllIIIII);
        GlStateManager.scale(1.0f / llllllllllllIllIlIlIlllllllIIIII, 1.0f / llllllllllllIllIlIlIlllllllIIIII, 1.0f / llllllllllllIllIlIlIlllllllIIIII);
        this.bindEntityTexture(llllllllllllIllIlIlIllllllIllllI);
        "".length();
        GlStateManager.scale(-1.0f, -1.0f, 1.0f);
        this.modelBoat.render(llllllllllllIllIlIlIllllllIllllI, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.popMatrix();
        super.doRender(llllllllllllIllIlIlIllllllIllllI, llllllllllllIllIlIlIllllllIlllIl, llllllllllllIllIlIlIlllllllIIllI, llllllllllllIllIlIlIlllllllIIlIl, llllllllllllIllIlIlIllllllIllIlI, llllllllllllIllIlIlIlllllllIIIll);
    }
    
    private static int lIIlIIlllIlIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIlIIlllIlIIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIlIIlllIlIlIIl(final int llllllllllllIllIlIlIlllllIllIIll) {
        return llllllllllllIllIlIlIlllllIllIIll < 0;
    }
}
