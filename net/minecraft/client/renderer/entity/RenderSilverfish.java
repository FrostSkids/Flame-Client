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
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSilverfish;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntitySilverfish;

public class RenderSilverfish extends RenderLiving<EntitySilverfish>
{
    private static final /* synthetic */ ResourceLocation silverfishTextures;
    private static final /* synthetic */ int[] llIlIlllIIlIll;
    private static final /* synthetic */ String[] llIlIlllIIlIIl;
    
    @Override
    protected ResourceLocation getEntityTexture(final EntitySilverfish llllllllllllIllIlIIlIIIIllllIlII) {
        return RenderSilverfish.silverfishTextures;
    }
    
    private static void lIIlIlIllIlIIIll() {
        (llIlIlllIIlIll = new int[4])[0] = ((0x65 ^ 0xA ^ (0x13 ^ 0x32)) & (0xC3 ^ 0x90 ^ (0xA9 ^ 0xB4) ^ -" ".length()));
        RenderSilverfish.llIlIlllIIlIll[1] = " ".length();
        RenderSilverfish.llIlIlllIIlIll[2] = (0x57 ^ 0x5F);
        RenderSilverfish.llIlIlllIIlIll[3] = "  ".length();
    }
    
    @Override
    protected float getDeathMaxRotation(final EntitySilverfish llllllllllllIllIlIIlIIIIllllIllI) {
        return 180.0f;
    }
    
    static {
        lIIlIlIllIlIIIll();
        lIIlIlIllIIlllll();
        silverfishTextures = new ResourceLocation(RenderSilverfish.llIlIlllIIlIIl[RenderSilverfish.llIlIlllIIlIll[0]]);
    }
    
    public RenderSilverfish(final RenderManager llllllllllllIllIlIIlIIIIlllllIII) {
        super(llllllllllllIllIlIIlIIIIlllllIII, new ModelSilverfish(), 0.3f);
    }
    
    private static void lIIlIlIllIIlllll() {
        (llIlIlllIIlIIl = new String[RenderSilverfish.llIlIlllIIlIll[1]])[RenderSilverfish.llIlIlllIIlIll[0]] = lIIlIlIllIIlllIl("L4tsWbneeG9x9pTiLVr5wjQznpla4DGX6IB4WcfoYic=", "mKsyD");
    }
    
    private static String lIIlIlIllIIlllIl(final String llllllllllllIllIlIIlIIIIlllIIIlI, final String llllllllllllIllIlIIlIIIIlllIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIIIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIIIIlllIIIIl.getBytes(StandardCharsets.UTF_8)), RenderSilverfish.llIlIlllIIlIll[2]), "DES");
            final Cipher llllllllllllIllIlIIlIIIIlllIIllI = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIIIIlllIIllI.init(RenderSilverfish.llIlIlllIIlIll[3], llllllllllllIllIlIIlIIIIlllIIlll);
            return new String(llllllllllllIllIlIIlIIIIlllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIIIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIIIlllIIlIl) {
            llllllllllllIllIlIIlIIIIlllIIlIl.printStackTrace();
            return null;
        }
    }
}
