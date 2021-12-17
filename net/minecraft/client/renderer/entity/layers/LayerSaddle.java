// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.EntityLivingBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.model.ModelPig;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityPig;

public class LayerSaddle implements LayerRenderer<EntityPig>
{
    private static final /* synthetic */ String[] lIllIIllIIlIll;
    private static final /* synthetic */ ResourceLocation TEXTURE;
    private final /* synthetic */ ModelPig pigModel;
    private final /* synthetic */ RenderPig pigRenderer;
    private static final /* synthetic */ int[] lIllIIllIIllII;
    
    public LayerSaddle(final RenderPig lllllllllllllIIIIIIllIIlllllIIIl) {
        this.pigModel = new ModelPig(0.5f);
        this.pigRenderer = lllllllllllllIIIIIIllIIlllllIIIl;
    }
    
    @Override
    public void doRenderLayer(final EntityPig lllllllllllllIIIIIIllIIllllIIlll, final float lllllllllllllIIIIIIllIIlllIlllIl, final float lllllllllllllIIIIIIllIIlllIlllII, final float lllllllllllllIIIIIIllIIllllIIlII, final float lllllllllllllIIIIIIllIIllllIIIll, final float lllllllllllllIIIIIIllIIlllIllIlI, final float lllllllllllllIIIIIIllIIlllIllIIl, final float lllllllllllllIIIIIIllIIlllIllIII) {
        if (lllllIlIlIlIIIl(lllllllllllllIIIIIIllIIllllIIlll.getSaddled() ? 1 : 0)) {
            this.pigRenderer.bindTexture(LayerSaddle.TEXTURE);
            this.pigModel.setModelAttributes(this.pigRenderer.getMainModel());
            this.pigModel.render(lllllllllllllIIIIIIllIIllllIIlll, lllllllllllllIIIIIIllIIlllIlllIl, lllllllllllllIIIIIIllIIlllIlllII, lllllllllllllIIIIIIllIIllllIIIll, lllllllllllllIIIIIIllIIlllIllIlI, lllllllllllllIIIIIIllIIlllIllIIl, lllllllllllllIIIIIIllIIlllIllIII);
        }
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerSaddle.lIllIIllIIllII[0] != 0;
    }
    
    private static boolean lllllIlIlIlIIIl(final int lllllllllllllIIIIIIllIIllIllIllI) {
        return lllllllllllllIIIIIIllIIllIllIllI != 0;
    }
    
    private static String lllllIlIlIIllIl(final String lllllllllllllIIIIIIllIIllIllllIl, final String lllllllllllllIIIIIIllIIllIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIIlllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIllIIllIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIllIIllIllllll.init(LayerSaddle.lIllIIllIIllII[2], lllllllllllllIIIIIIllIIlllIIIIII);
            return new String(lllllllllllllIIIIIIllIIllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIIllIlllllI) {
            lllllllllllllIIIIIIllIIllIlllllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lllllIlIlIlIIII();
        lllllIlIlIIlllI();
        TEXTURE = new ResourceLocation(LayerSaddle.lIllIIllIIlIll[LayerSaddle.lIllIIllIIllII[0]]);
    }
    
    private static void lllllIlIlIIlllI() {
        (lIllIIllIIlIll = new String[LayerSaddle.lIllIIllIIllII[1]])[LayerSaddle.lIllIIllIIllII[0]] = lllllIlIlIIllIl("szbzrVVoSJ+/iF8+PT4AvCi+Pu4mY6ujTO3KBCAvCuKq3oVevc4nSg==", "EiPCj");
    }
    
    private static void lllllIlIlIlIIII() {
        (lIllIIllIIllII = new int[3])[0] = ((0x7A ^ 0x5B) & ~(0x57 ^ 0x76));
        LayerSaddle.lIllIIllIIllII[1] = " ".length();
        LayerSaddle.lIllIIllIIllII[2] = "  ".length();
    }
}
