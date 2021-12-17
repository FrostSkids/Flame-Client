// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.layers.LayerWitherAura;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelWither;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.boss.EntityWither;

public class RenderWither extends RenderLiving<EntityWither>
{
    private static final /* synthetic */ int[] llIIIIIlIlIlIl;
    private static final /* synthetic */ ResourceLocation witherTextures;
    private static final /* synthetic */ String[] llIIIIIlIIlllI;
    private static final /* synthetic */ ResourceLocation invulnerableWitherTextures;
    
    private static boolean lIIIIlllIlIIIIlI(final int llllllllllllIlllIllllIIIlIIlIllI, final int llllllllllllIlllIllllIIIlIIlIlIl) {
        return llllllllllllIlllIllllIIIlIIlIllI <= llllllllllllIlllIllllIIIlIIlIlIl;
    }
    
    @Override
    public void doRender(final EntityWither llllllllllllIlllIllllIIlIIIIIlII, final double llllllllllllIlllIllllIIIlllllIlI, final double llllllllllllIlllIllllIIlIIIIIIlI, final double llllllllllllIlllIllllIIIlllllIII, final float llllllllllllIlllIllllIIIllllIlll, final float llllllllllllIlllIllllIIIllllllll) {
        BossStatus.setBossStatus(llllllllllllIlllIllllIIlIIIIIlII, (boolean)(RenderWither.llIIIIIlIlIlIl[1] != 0));
        super.doRender(llllllllllllIlllIllllIIlIIIIIlII, llllllllllllIlllIllllIIIlllllIlI, llllllllllllIlllIllllIIlIIIIIIlI, llllllllllllIlllIllllIIIlllllIII, llllllllllllIlllIllllIIIllllIlll, llllllllllllIlllIllllIIIllllllll);
    }
    
    private static String lIIIIlllIIlllIII(String llllllllllllIlllIllllIIIlIlIIlIl, final String llllllllllllIlllIllllIIIlIlIlIIl) {
        llllllllllllIlllIllllIIIlIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllllIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllllIIIlIlIlIII = new StringBuilder();
        final char[] llllllllllllIlllIllllIIIlIlIIlll = llllllllllllIlllIllllIIIlIlIlIIl.toCharArray();
        int llllllllllllIlllIllllIIIlIlIIllI = RenderWither.llIIIIIlIlIlIl[0];
        final char llllllllllllIlllIllllIIIlIlIIIII = (Object)llllllllllllIlllIllllIIIlIlIIlIl.toCharArray();
        final char llllllllllllIlllIllllIIIlIIlllll = (char)llllllllllllIlllIllllIIIlIlIIIII.length;
        String llllllllllllIlllIllllIIIlIIllllI = (String)RenderWither.llIIIIIlIlIlIl[0];
        while (lIIIIlllIlIIIlII((int)llllllllllllIlllIllllIIIlIIllllI, llllllllllllIlllIllllIIIlIIlllll)) {
            final char llllllllllllIlllIllllIIIlIlIlIll = llllllllllllIlllIllllIIIlIlIIIII[llllllllllllIlllIllllIIIlIIllllI];
            llllllllllllIlllIllllIIIlIlIlIII.append((char)(llllllllllllIlllIllllIIIlIlIlIll ^ llllllllllllIlllIllllIIIlIlIIlll[llllllllllllIlllIllllIIIlIlIIllI % llllllllllllIlllIllllIIIlIlIIlll.length]));
            "".length();
            ++llllllllllllIlllIllllIIIlIlIIllI;
            ++llllllllllllIlllIllllIIIlIIllllI;
            "".length();
            if ((72 + 78 + 19 + 16 ^ 48 + 71 + 47 + 22) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllllIIIlIlIlIII);
    }
    
    @Override
    protected void preRenderCallback(final EntityWither llllllllllllIlllIllllIIIlllIIIIl, final float llllllllllllIlllIllllIIIllIlllII) {
        float llllllllllllIlllIllllIIIllIlllll = 2.0f;
        final int llllllllllllIlllIllllIIIllIllllI = llllllllllllIlllIllllIIIlllIIIIl.getInvulTime();
        if (lIIIIlllIlIIIIIl(llllllllllllIlllIllllIIIllIllllI)) {
            llllllllllllIlllIllllIIIllIlllll -= (llllllllllllIlllIllllIIIllIllllI - llllllllllllIlllIllllIIIllIlllII) / 220.0f * 0.5f;
        }
        GlStateManager.scale(llllllllllllIlllIllllIIIllIlllll, llllllllllllIlllIllllIIIllIlllll, llllllllllllIlllIllllIIIllIlllll);
    }
    
    private static boolean lIIIIlllIlIIIlII(final int llllllllllllIlllIllllIIIlIIllIlI, final int llllllllllllIlllIllllIIIlIIllIIl) {
        return llllllllllllIlllIllllIIIlIIllIlI < llllllllllllIlllIllllIIIlIIllIIl;
    }
    
    private static void lIIIIlllIIlllIlI() {
        (llIIIIIlIIlllI = new String[RenderWither.llIIIIIlIlIlIl[4]])[RenderWither.llIIIIIlIlIlIl[0]] = lIIIIlllIIlllIII("MzcVEBI1Nx5LAikmBBAeaCUEEA8iIEITDjM6CBY4LjwbEQspNx8FBSs3QxQJIA==", "GRmdg");
        RenderWither.llIIIIIlIIlllI[RenderWither.llIIIIIlIlIlIl[1]] = lIIIIlllIIlllIIl("gL9ZiiMDJ4O/PyMvfNpOBpRtr3xv9LVIqeUBRW8BMLQDEcLt/yYUYg==", "NRUxZ");
    }
    
    static {
        lIIIIlllIIllllll();
        lIIIIlllIIlllIlI();
        invulnerableWitherTextures = new ResourceLocation(RenderWither.llIIIIIlIIlllI[RenderWither.llIIIIIlIlIlIl[0]]);
        witherTextures = new ResourceLocation(RenderWither.llIIIIIlIIlllI[RenderWither.llIIIIIlIlIlIl[1]]);
    }
    
    private static String lIIIIlllIIlllIIl(final String llllllllllllIlllIllllIIIlIlllIlI, final String llllllllllllIlllIllllIIIlIlllIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllllIIIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllIIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllllIIIlIllllII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllllIIIlIllllII.init(RenderWither.llIIIIIlIlIlIl[4], llllllllllllIlllIllllIIIlIllllIl);
            return new String(llllllllllllIlllIllllIIIlIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllIIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllllIIIlIlllIll) {
            llllllllllllIlllIllllIIIlIlllIll.printStackTrace();
            return null;
        }
    }
    
    public RenderWither(final RenderManager llllllllllllIlllIllllIIlIIIlIllI) {
        super(llllllllllllIlllIllllIIlIIIlIllI, new ModelWither(0.0f), 1.0f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerWitherAura(this));
        "".length();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityWither llllllllllllIlllIllllIIIlllIlIlI) {
        final int llllllllllllIlllIllllIIIlllIlIll = llllllllllllIlllIllllIIIlllIlIlI.getInvulTime();
        ResourceLocation resourceLocation;
        if (lIIIIlllIlIIIIIl(llllllllllllIlllIllllIIIlllIlIll) && (!lIIIIlllIlIIIIlI(llllllllllllIlllIllllIIIlllIlIll, RenderWither.llIIIIIlIlIlIl[2]) || lIIIIlllIlIIIIll(llllllllllllIlllIllllIIIlllIlIll / RenderWither.llIIIIIlIlIlIl[3] % RenderWither.llIIIIIlIlIlIl[4], RenderWither.llIIIIIlIlIlIl[1]))) {
            resourceLocation = RenderWither.invulnerableWitherTextures;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            resourceLocation = RenderWither.witherTextures;
        }
        return resourceLocation;
    }
    
    private static boolean lIIIIlllIlIIIIIl(final int llllllllllllIlllIllllIIIlIIlIIll) {
        return llllllllllllIlllIllllIIIlIIlIIll > 0;
    }
    
    private static boolean lIIIIlllIlIIIIll(final int llllllllllllIlllIllllIIIlIIlIIII, final int llllllllllllIlllIllllIIIlIIIllll) {
        return llllllllllllIlllIllllIIIlIIlIIII != llllllllllllIlllIllllIIIlIIIllll;
    }
    
    private static void lIIIIlllIIllllll() {
        (llIIIIIlIlIlIl = new int[5])[0] = ((0xB3 ^ 0xAA ^ (0xC0 ^ 0x9B)) & (0x10 ^ 0x5D ^ (0xBE ^ 0xB1) ^ -" ".length()));
        RenderWither.llIIIIIlIlIlIl[1] = " ".length();
        RenderWither.llIIIIIlIlIlIl[2] = (0x7A ^ 0x2A);
        RenderWither.llIIIIIlIlIlIl[3] = (0x55 ^ 0x50);
        RenderWither.llIIIIIlIlIlIl[4] = "  ".length();
    }
}
