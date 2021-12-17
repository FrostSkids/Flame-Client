// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelLeashKnot;
import net.minecraft.entity.EntityLeashKnot;

public class RenderLeashKnot extends Render<EntityLeashKnot>
{
    private static final /* synthetic */ String[] llllllIIllIll;
    private /* synthetic */ ModelLeashKnot leashKnotModel;
    private static final /* synthetic */ ResourceLocation leashKnotTextures;
    private static final /* synthetic */ int[] llllllIIlllIl;
    
    private static void lIlIllllllllllI() {
        (llllllIIllIll = new String[RenderLeashKnot.llllllIIlllIl[1]])[RenderLeashKnot.llllllIIlllIl[0]] = lIlIlllllllllIl("t47jLWV5ozWQMsolhqzUlnF9DvbtXK0cKchrIo+AXS0=", "aiIvr");
    }
    
    private static String lIlIlllllllllIl(final String lllllllllllllIlIlIlIlIIllIIlIIlI, final String lllllllllllllIlIlIlIlIIllIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIIllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), RenderLeashKnot.llllllIIlllIl[2]), "DES");
            final Cipher lllllllllllllIlIlIlIlIIllIIlIlII = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIlIIllIIlIlII.init(RenderLeashKnot.llllllIIlllIl[3], lllllllllllllIlIlIlIlIIllIIlIlIl);
            return new String(lllllllllllllIlIlIlIlIIllIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIIllIIlIIll) {
            lllllllllllllIlIlIlIlIIllIIlIIll.printStackTrace();
            return null;
        }
    }
    
    public RenderLeashKnot(final RenderManager lllllllllllllIlIlIlIlIIlllIIIllI) {
        super(lllllllllllllIlIlIlIlIIlllIIIllI);
        this.leashKnotModel = new ModelLeashKnot();
    }
    
    static {
        lIlIlllllllllll();
        lIlIllllllllllI();
        leashKnotTextures = new ResourceLocation(RenderLeashKnot.llllllIIllIll[RenderLeashKnot.llllllIIlllIl[0]]);
    }
    
    @Override
    public void doRender(final EntityLeashKnot lllllllllllllIlIlIlIlIIllIllIlII, final double lllllllllllllIlIlIlIlIIllIlllIll, final double lllllllllllllIlIlIlIlIIllIlllIlI, final double lllllllllllllIlIlIlIlIIllIlllIIl, final float lllllllllllllIlIlIlIlIIllIllIIII, final float lllllllllllllIlIlIlIlIIllIlIllll) {
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.translate((float)lllllllllllllIlIlIlIlIIllIlllIll, (float)lllllllllllllIlIlIlIlIIllIlllIlI, (float)lllllllllllllIlIlIlIlIIllIlllIIl);
        final float lllllllllllllIlIlIlIlIIllIllIllI = 0.0625f;
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0f, -1.0f, 1.0f);
        GlStateManager.enableAlpha();
        this.bindEntityTexture(lllllllllllllIlIlIlIlIIllIllIlII);
        "".length();
        this.leashKnotModel.render(lllllllllllllIlIlIlIlIIllIllIlII, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, lllllllllllllIlIlIlIlIIllIllIllI);
        GlStateManager.popMatrix();
        super.doRender(lllllllllllllIlIlIlIlIIllIllIlII, lllllllllllllIlIlIlIlIIllIlllIll, lllllllllllllIlIlIlIlIIllIlllIlI, lllllllllllllIlIlIlIlIIllIlllIIl, lllllllllllllIlIlIlIlIIllIllIIII, lllllllllllllIlIlIlIlIIllIlIllll);
    }
    
    private static void lIlIlllllllllll() {
        (llllllIIlllIl = new int[4])[0] = ("   ".length() & ~"   ".length());
        RenderLeashKnot.llllllIIlllIl[1] = " ".length();
        RenderLeashKnot.llllllIIlllIl[2] = (0x6F ^ 0x67);
        RenderLeashKnot.llllllIIlllIl[3] = "  ".length();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityLeashKnot lllllllllllllIlIlIlIlIIllIlIllII) {
        return RenderLeashKnot.leashKnotTextures;
    }
}
