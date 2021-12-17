// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.LayerSpiderEyes;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSpider;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntitySpider;

public class RenderSpider<T extends EntitySpider> extends RenderLiving<T>
{
    private static final /* synthetic */ int[] lIlIIlIIlIllll;
    private static final /* synthetic */ String[] lIlIIlIIlIlllI;
    private static final /* synthetic */ ResourceLocation spiderTextures;
    
    private static void lllIIlIllIIllII() {
        (lIlIIlIIlIllll = new int[4])[0] = ((0x2D ^ 0x2B) & ~(0x1F ^ 0x19));
        RenderSpider.lIlIIlIIlIllll[1] = " ".length();
        RenderSpider.lIlIIlIIlIllll[2] = (0x26 ^ 0x2E);
        RenderSpider.lIlIIlIIlIllll[3] = "  ".length();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final T lllllllllllllIIIlllIIIIlIlIlIllI) {
        return RenderSpider.spiderTextures;
    }
    
    private static void lllIIlIllIIlIll() {
        (lIlIIlIIlIlllI = new String[RenderSpider.lIlIIlIIlIllll[1]])[RenderSpider.lIlIIlIIlIllll[0]] = lllIIlIllIIlIlI("OeBcxkymYdyM8cfQnjUFmGd6d2wG0POyvFcofRcPZ/n6PWfteTLP1w==", "HNmbM");
    }
    
    static {
        lllIIlIllIIllII();
        lllIIlIllIIlIll();
        spiderTextures = new ResourceLocation(RenderSpider.lIlIIlIIlIlllI[RenderSpider.lIlIIlIIlIllll[0]]);
    }
    
    private static String lllIIlIllIIlIlI(final String lllllllllllllIIIlllIIIIlIlIIIllI, final String lllllllllllllIIIlllIIIIlIlIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIIIlIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), RenderSpider.lIlIIlIIlIllll[2]), "DES");
            final Cipher lllllllllllllIIIlllIIIIlIlIIlIII = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIIIlIlIIlIII.init(RenderSpider.lIlIIlIIlIllll[3], lllllllllllllIIIlllIIIIlIlIIlIIl);
            return new String(lllllllllllllIIIlllIIIIlIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIIIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIIIlIlIIIlll) {
            lllllllllllllIIIlllIIIIlIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected float getDeathMaxRotation(final T lllllllllllllIIIlllIIIIlIlIllIII) {
        return 180.0f;
    }
    
    public RenderSpider(final RenderManager lllllllllllllIIIlllIIIIlIlIllIlI) {
        super(lllllllllllllIIIlllIIIIlIlIllIlI, new ModelSpider(), 1.0f);
        this.addLayer(new LayerSpiderEyes(this));
        "".length();
    }
}
