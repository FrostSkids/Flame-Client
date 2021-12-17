// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityCaveSpider;

public class RenderCaveSpider extends RenderSpider<EntityCaveSpider>
{
    private static final /* synthetic */ int[] llllIllIIlIIl;
    private static final /* synthetic */ String[] llllIllIIlIII;
    private static final /* synthetic */ ResourceLocation caveSpiderTextures;
    
    private static String lIlIlIlIlllllll(final String lllllllllllllIlIllIlIIlIlllIlIlI, final String lllllllllllllIlIllIlIIlIlllIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIlIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIlIlllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIIlIlllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIIlIlllIllII.init(RenderCaveSpider.llllIllIIlIIl[2], lllllllllllllIlIllIlIIlIlllIllIl);
            return new String(lllllllllllllIlIllIlIIlIlllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIlIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIlIlllIlIll) {
            lllllllllllllIlIllIlIIlIlllIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIllIIIIIIl() {
        (llllIllIIlIIl = new int[3])[0] = ((152 + 79 - 217 + 174 ^ 38 + 81 + 15 + 38) & (0x2D ^ 0x40 ^ (0x50 ^ 0x2D) ^ -" ".length()));
        RenderCaveSpider.llllIllIIlIIl[1] = " ".length();
        RenderCaveSpider.llllIllIIlIIl[2] = "  ".length();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityCaveSpider lllllllllllllIlIllIlIIlIllllllII) {
        return RenderCaveSpider.caveSpiderTextures;
    }
    
    static {
        lIlIlIllIIIIIIl();
        lIlIlIllIIIIIII();
        caveSpiderTextures = new ResourceLocation(RenderCaveSpider.llllIllIIlIII[RenderCaveSpider.llllIllIIlIIl[0]]);
    }
    
    public RenderCaveSpider(final RenderManager lllllllllllllIlIllIlIIllIIIIIIll) {
        super(lllllllllllllIlIllIlIIllIIIIIIll);
        this.shadowSize *= 0.7f;
    }
    
    private static void lIlIlIllIIIIIII() {
        (llllIllIIlIII = new String[RenderCaveSpider.llllIllIIlIIl[1]])[RenderCaveSpider.llllIllIIlIIl[0]] = lIlIlIlIlllllll("rIRy1u/KfRF3k7G7WwXQgiL84rg/jhwrooWwMuwyr0pvwt4JZwKD3Q==", "OAzGa");
    }
    
    @Override
    protected void preRenderCallback(final EntityCaveSpider lllllllllllllIlIllIlIIlIllllllll, final float lllllllllllllIlIllIlIIlIlllllllI) {
        GlStateManager.scale(0.7f, 0.7f, 0.7f);
    }
}
