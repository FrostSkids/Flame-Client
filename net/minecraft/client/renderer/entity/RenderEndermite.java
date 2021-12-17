// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelEnderMite;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityEndermite;

public class RenderEndermite extends RenderLiving<EntityEndermite>
{
    private static final /* synthetic */ String[] lIlllIIllIIIIl;
    private static final /* synthetic */ ResourceLocation ENDERMITE_TEXTURES;
    private static final /* synthetic */ int[] lIlllIIllIIIlI;
    
    @Override
    protected float getDeathMaxRotation(final EntityEndermite llllllllllllIlllllIIlllIIIllIIIl) {
        return 180.0f;
    }
    
    static {
        lIIIIIIlllllIlll();
        lIIIIIIlllllIllI();
        ENDERMITE_TEXTURES = new ResourceLocation(RenderEndermite.lIlllIIllIIIIl[RenderEndermite.lIlllIIllIIIlI[0]]);
    }
    
    public RenderEndermite(final RenderManager llllllllllllIlllllIIlllIIIllIlIl) {
        super(llllllllllllIlllllIIlllIIIllIlIl, new ModelEnderMite(), 0.3f);
    }
    
    private static void lIIIIIIlllllIllI() {
        (lIlllIIllIIIIl = new String[RenderEndermite.lIlllIIllIIIlI[1]])[RenderEndermite.lIlllIIllIIIlI[0]] = lIIIIIIlllllIlIl("SibwBsS73uBfXegmCzm6SOsJzGV/DNeFgq0nxUV25N8=", "FyuKf");
    }
    
    private static String lIIIIIIlllllIlIl(final String llllllllllllIlllllIIlllIIIIlllIl, final String llllllllllllIlllllIIlllIIIIlllII) {
        try {
            final SecretKeySpec llllllllllllIlllllIIlllIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIlllIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIlllIIIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIlllIIIlIIIIl.init(RenderEndermite.lIlllIIllIIIlI[2], llllllllllllIlllllIIlllIIIlIIIlI);
            return new String(llllllllllllIlllllIIlllIIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIlllIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIlllIIIlIIIII) {
            llllllllllllIlllllIIlllIIIlIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityEndermite llllllllllllIlllllIIlllIIIlIllll) {
        return RenderEndermite.ENDERMITE_TEXTURES;
    }
    
    private static void lIIIIIIlllllIlll() {
        (lIlllIIllIIIlI = new int[3])[0] = ((0x3A ^ 0x7E) & ~(0x77 ^ 0x33));
        RenderEndermite.lIlllIIllIIIlI[1] = " ".length();
        RenderEndermite.lIlllIIllIIIlI[2] = "  ".length();
    }
}
