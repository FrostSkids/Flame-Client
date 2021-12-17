// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityOcelot;

public class RenderOcelot extends RenderLiving<EntityOcelot>
{
    private static final /* synthetic */ String[] lIlIlIIlIlIIIl;
    private static final /* synthetic */ ResourceLocation blackOcelotTextures;
    private static final /* synthetic */ ResourceLocation siameseOcelotTextures;
    private static final /* synthetic */ ResourceLocation ocelotTextures;
    private static final /* synthetic */ int[] lIlIlIIlIlIIlI;
    private static final /* synthetic */ ResourceLocation redOcelotTextures;
    
    public RenderOcelot(final RenderManager lllllllllllllIIIlIlIIIlIllIIIllI, final ModelBase lllllllllllllIIIlIlIIIlIllIIIlIl, final float lllllllllllllIIIlIlIIIlIllIIIlII) {
        super(lllllllllllllIIIlIlIIIlIllIIIllI, lllllllllllllIIIlIlIIIlIllIIIlIl, lllllllllllllIIIlIlIIIlIllIIIlII);
    }
    
    @Override
    protected void preRenderCallback(final EntityOcelot lllllllllllllIIIlIlIIIlIlIlllIll, final float lllllllllllllIIIlIlIIIlIlIlllIlI) {
        super.preRenderCallback(lllllllllllllIIIlIlIIIlIlIlllIll, lllllllllllllIIIlIlIIIlIlIlllIlI);
        if (lllIllIIIllIIll(lllllllllllllIIIlIlIIIlIlIlllIll.isTamed() ? 1 : 0)) {
            GlStateManager.scale(0.8f, 0.8f, 0.8f);
        }
    }
    
    private static String lllIllIIIlIllll(String lllllllllllllIIIlIlIIIlIlIIlIIII, final String lllllllllllllIIIlIlIIIlIlIIIllll) {
        lllllllllllllIIIlIlIIIlIlIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIIlIlIIlIIll = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIIlIlIIlIIlI = lllllllllllllIIIlIlIIIlIlIIIllll.toCharArray();
        int lllllllllllllIIIlIlIIIlIlIIlIIIl = RenderOcelot.lIlIlIIlIlIIlI[0];
        final char lllllllllllllIIIlIlIIIlIlIIIlIll = (Object)lllllllllllllIIIlIlIIIlIlIIlIIII.toCharArray();
        final Exception lllllllllllllIIIlIlIIIlIlIIIlIlI = (Exception)lllllllllllllIIIlIlIIIlIlIIIlIll.length;
        short lllllllllllllIIIlIlIIIlIlIIIlIIl = (short)RenderOcelot.lIlIlIIlIlIIlI[0];
        while (lllIllIIIllIlII(lllllllllllllIIIlIlIIIlIlIIIlIIl, (int)lllllllllllllIIIlIlIIIlIlIIIlIlI)) {
            final char lllllllllllllIIIlIlIIIlIlIIlIllI = lllllllllllllIIIlIlIIIlIlIIIlIll[lllllllllllllIIIlIlIIIlIlIIIlIIl];
            lllllllllllllIIIlIlIIIlIlIIlIIll.append((char)(lllllllllllllIIIlIlIIIlIlIIlIllI ^ lllllllllllllIIIlIlIIIlIlIIlIIlI[lllllllllllllIIIlIlIIIlIlIIlIIIl % lllllllllllllIIIlIlIIIlIlIIlIIlI.length]));
            "".length();
            ++lllllllllllllIIIlIlIIIlIlIIlIIIl;
            ++lllllllllllllIIIlIlIIIlIlIIIlIIl;
            "".length();
            if (-" ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIIlIlIIlIIll);
    }
    
    private static void lllIllIIIllIIIl() {
        (lIlIlIIlIlIIIl = new String[RenderOcelot.lIlIlIIlIlIIlI[4]])[RenderOcelot.lIlIlIIlIlIIlI[0]] = lllIllIIIlIllll("IRMwGTcnEztCJzsCIRk7ehUpGW03GikOKXsGJgo=", "UvHmB");
        RenderOcelot.lIlIlIIlIlIIIl[RenderOcelot.lIlIlIIlIlIIlI[1]] = lllIllIIIlIllll("OAsqHT4+CyFGLiIaOx0yYw0zHWQjDTcFJDhAIgcs", "LnRiK");
        RenderOcelot.lIlIlIIlIlIIIl[RenderOcelot.lIlIlIIlIlIIlI[2]] = lllIllIIIlIllll("HAgNLCUaCAZ3NQYZHCwpRw4ULH8aCBF2IAYK", "hmuXP");
        RenderOcelot.lIlIlIIlIlIIIl[RenderOcelot.lIlIlIIlIlIIlI[3]] = lllIllIIIllIIII("23zXIcgucnaex3p5PFXAlG8NKZk5DZYo6TAg9zQYsB0=", "QXzhi");
    }
    
    private static boolean lllIllIIIllIlII(final int lllllllllllllIIIlIlIIIlIlIIIIlIl, final int lllllllllllllIIIlIlIIIlIlIIIIlII) {
        return lllllllllllllIIIlIlIIIlIlIIIIlIl < lllllllllllllIIIlIlIIIlIlIIIIlII;
    }
    
    private static String lllIllIIIllIIII(final String lllllllllllllIIIlIlIIIlIlIlIIlIl, final String lllllllllllllIIIlIlIIIlIlIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIIlIlIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIIIlIlIlIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIIIlIlIlIIlll.init(RenderOcelot.lIlIlIIlIlIIlI[2], lllllllllllllIIIlIlIIIlIlIlIlIII);
            return new String(lllllllllllllIIIlIlIIIlIlIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIIlIlIlIIllI) {
            lllllllllllllIIIlIlIIIlIlIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lllIllIIIllIIlI() {
        (lIlIlIIlIlIIlI = new int[5])[0] = ((0x37 ^ 0x3E ^ (0x1E ^ 0x10)) & (0x7 ^ 0x1F ^ (0x5 ^ 0x1A) ^ -" ".length()));
        RenderOcelot.lIlIlIIlIlIIlI[1] = " ".length();
        RenderOcelot.lIlIlIIlIlIIlI[2] = "  ".length();
        RenderOcelot.lIlIlIIlIlIIlI[3] = "   ".length();
        RenderOcelot.lIlIlIIlIlIIlI[4] = (0x6E ^ 0x6A);
    }
    
    static {
        lllIllIIIllIIlI();
        lllIllIIIllIIIl();
        blackOcelotTextures = new ResourceLocation(RenderOcelot.lIlIlIIlIlIIIl[RenderOcelot.lIlIlIIlIlIIlI[0]]);
        ocelotTextures = new ResourceLocation(RenderOcelot.lIlIlIIlIlIIIl[RenderOcelot.lIlIlIIlIlIIlI[1]]);
        redOcelotTextures = new ResourceLocation(RenderOcelot.lIlIlIIlIlIIIl[RenderOcelot.lIlIlIIlIlIIlI[2]]);
        siameseOcelotTextures = new ResourceLocation(RenderOcelot.lIlIlIIlIlIIIl[RenderOcelot.lIlIlIIlIlIIlI[3]]);
    }
    
    private static boolean lllIllIIIllIIll(final int lllllllllllllIIIlIlIIIlIlIIIIIlI) {
        return lllllllllllllIIIlIlIIIlIlIIIIIlI != 0;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityOcelot lllllllllllllIIIlIlIIIlIllIIIIII) {
        switch (lllllllllllllIIIlIlIIIlIllIIIIII.getTameSkin()) {
            default: {
                return RenderOcelot.ocelotTextures;
            }
            case 1: {
                return RenderOcelot.blackOcelotTextures;
            }
            case 2: {
                return RenderOcelot.redOcelotTextures;
            }
            case 3: {
                return RenderOcelot.siameseOcelotTextures;
            }
        }
    }
}
