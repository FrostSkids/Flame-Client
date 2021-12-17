// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityBlaze;

public class RenderBlaze extends RenderLiving<EntityBlaze>
{
    private static final /* synthetic */ String[] lIIlllIllIIlll;
    private static final /* synthetic */ int[] lIIlllIllIlIII;
    private static final /* synthetic */ ResourceLocation blazeTextures;
    
    private static String llIlllIIIIIlIll(final String lllllllllllllIIlIIlllIIlIIIlllll, final String lllllllllllllIIlIIlllIIlIIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlllIIlIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlllIIlIIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlllIIlIIlIIIll.init(RenderBlaze.lIIlllIllIlIII[2], lllllllllllllIIlIIlllIIlIIlIIlII);
            return new String(lllllllllllllIIlIIlllIIlIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlllIIlIIlIIIlI) {
            lllllllllllllIIlIIlllIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void llIlllIIIIIllII() {
        (lIIlllIllIIlll = new String[RenderBlaze.lIIlllIllIlIII[1]])[RenderBlaze.lIIlllIllIlIII[0]] = llIlllIIIIIlIll("Xd9IJh1mfyFGUln6eIpZFGiyNwIXtw0iiOkrhCnukds=", "UfVrV");
    }
    
    private static void llIlllIIIIIllIl() {
        (lIIlllIllIlIII = new int[3])[0] = ((0x3F ^ 0xB) & ~(0x8 ^ 0x3C));
        RenderBlaze.lIIlllIllIlIII[1] = " ".length();
        RenderBlaze.lIIlllIllIlIII[2] = "  ".length();
    }
    
    public RenderBlaze(final RenderManager lllllllllllllIIlIIlllIIlIIllIIIl) {
        super(lllllllllllllIIlIIlllIIlIIllIIIl, new ModelBlaze(), 0.5f);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityBlaze lllllllllllllIIlIIlllIIlIIlIllIl) {
        return RenderBlaze.blazeTextures;
    }
    
    static {
        llIlllIIIIIllIl();
        llIlllIIIIIllII();
        blazeTextures = new ResourceLocation(RenderBlaze.lIIlllIllIIlll[RenderBlaze.lIIlllIllIlIII[0]]);
    }
}
