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
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityCow;

public class RenderCow extends RenderLiving<EntityCow>
{
    private static final /* synthetic */ int[] llIIlllIlllIII;
    private static final /* synthetic */ String[] llIIlllIllIlll;
    private static final /* synthetic */ ResourceLocation cowTextures;
    
    private static void lIIIlllllllIlIlI() {
        (llIIlllIlllIII = new int[3])[0] = ((187 + 8 - 120 + 131 ^ 24 + 56 - 13 + 106) & (123 + 0 - 96 + 200 ^ 114 + 113 - 168 + 69 ^ -" ".length()));
        RenderCow.llIIlllIlllIII[1] = " ".length();
        RenderCow.llIIlllIlllIII[2] = "  ".length();
    }
    
    public RenderCow(final RenderManager llllllllllllIllIllllIIIIlIIlIlll, final ModelBase llllllllllllIllIllllIIIIlIIlIllI, final float llllllllllllIllIllllIIIIlIIlIIIl) {
        super(llllllllllllIllIllllIIIIlIIlIlll, llllllllllllIllIllllIIIIlIIlIllI, llllllllllllIllIllllIIIIlIIlIIIl);
    }
    
    private static void lIIIlllllllIlIII() {
        (llIIlllIllIlll = new String[RenderCow.llIIlllIlllIII[1]])[RenderCow.llIIlllIlllIII[0]] = lIIIlllllllIIlll("VmFNR8He0BbXgAWkLDc1wU/j8PqfmV8qVGm2scrJ6Pw=", "zMWas");
    }
    
    static {
        lIIIlllllllIlIlI();
        lIIIlllllllIlIII();
        cowTextures = new ResourceLocation(RenderCow.llIIlllIllIlll[RenderCow.llIIlllIlllIII[0]]);
    }
    
    private static String lIIIlllllllIIlll(final String llllllllllllIllIllllIIIIlIIIIIll, final String llllllllllllIllIllllIIIIlIIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIIIlIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllIIIIlIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllIIIIlIIIIlIl.init(RenderCow.llIIlllIlllIII[2], llllllllllllIllIllllIIIIlIIIIllI);
            return new String(llllllllllllIllIllllIIIIlIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIIIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIIIlIIIIlII) {
            llllllllllllIllIllllIIIIlIIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityCow llllllllllllIllIllllIIIIlIIIllll) {
        return RenderCow.cowTextures;
    }
}
