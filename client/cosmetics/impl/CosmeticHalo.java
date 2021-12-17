// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics.impl;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import client.cosmetics.CosmeticModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.entity.AbstractClientPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.entity.RenderPlayer;
import client.cosmetics.CosmeticBase;

public class CosmeticHalo extends CosmeticBase
{
    private static final /* synthetic */ String[] llIllIIIIlIlll;
    private static final /* synthetic */ int[] llIllIIIIllIII;
    private final /* synthetic */ HaloRenderer haloModel;
    
    private static boolean lIIlIllIIlIlIIIl(final int llllllllllllIllIlIIIIlIIllIIIIlI) {
        return llllllllllllIllIlIIIIlIIllIIIIlI == 0;
    }
    
    private static void lIIlIllIIlIlIIII() {
        (llIllIIIIllIII = new int[4])[0] = ((0x29 ^ 0x5 ^ (0x21 ^ 0x56)) & (17 + 131 - 78 + 137 ^ 106 + 14 - 107 + 135 ^ -" ".length()));
        CosmeticHalo.llIllIIIIllIII[1] = " ".length();
        CosmeticHalo.llIllIIIIllIII[2] = "  ".length();
        CosmeticHalo.llIllIIIIllIII[3] = (0x40 ^ 0x48);
    }
    
    public CosmeticHalo(final RenderPlayer llllllllllllIllIlIIIIlIlIIIIlIlI) {
        super(llllllllllllIllIlIIIIlIlIIIIlIlI);
        this.haloModel = new HaloRenderer(llllllllllllIllIlIIIIlIlIIIIlIlI);
    }
    
    private static String lIIlIllIIlIIlllI(final String llllllllllllIllIlIIIIlIIllIIllll, final String llllllllllllIllIlIIIIlIIllIIllII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIlIIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIlIIllIIllII.getBytes(StandardCharsets.UTF_8)), CosmeticHalo.llIllIIIIllIII[3]), "DES");
            final Cipher llllllllllllIllIlIIIIlIIllIlIIIl = Cipher.getInstance("DES");
            llllllllllllIllIlIIIIlIIllIlIIIl.init(CosmeticHalo.llIllIIIIllIII[2], llllllllllllIllIlIIIIlIIllIlIIlI);
            return new String(llllllllllllIllIlIIIIlIIllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIlIIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIlIIllIlIIII) {
            llllllllllllIllIlIIIIlIIllIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIllIIlIIllIl(String llllllllllllIllIlIIIIlIIllIlllll, final String llllllllllllIllIlIIIIlIIlllIIIll) {
        llllllllllllIllIlIIIIlIIllIlllll = new String(Base64.getDecoder().decode(llllllllllllIllIlIIIIlIIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIIlIIlllIIIlI = new StringBuilder();
        final char[] llllllllllllIllIlIIIIlIIlllIIIIl = llllllllllllIllIlIIIIlIIlllIIIll.toCharArray();
        int llllllllllllIllIlIIIIlIIlllIIIII = CosmeticHalo.llIllIIIIllIII[0];
        final float llllllllllllIllIlIIIIlIIllIllIlI = (Object)llllllllllllIllIlIIIIlIIllIlllll.toCharArray();
        final short llllllllllllIllIlIIIIlIIllIllIIl = (short)llllllllllllIllIlIIIIlIIllIllIlI.length;
        Exception llllllllllllIllIlIIIIlIIllIllIII = (Exception)CosmeticHalo.llIllIIIIllIII[0];
        while (lIIlIllIIlIlIIll((int)llllllllllllIllIlIIIIlIIllIllIII, llllllllllllIllIlIIIIlIIllIllIIl)) {
            final char llllllllllllIllIlIIIIlIIlllIIlIl = llllllllllllIllIlIIIIlIIllIllIlI[llllllllllllIllIlIIIIlIIllIllIII];
            llllllllllllIllIlIIIIlIIlllIIIlI.append((char)(llllllllllllIllIlIIIIlIIlllIIlIl ^ llllllllllllIllIlIIIIlIIlllIIIIl[llllllllllllIllIlIIIIlIIlllIIIII % llllllllllllIllIlIIIIlIIlllIIIIl.length]));
            "".length();
            ++llllllllllllIllIlIIIIlIIlllIIIII;
            ++llllllllllllIllIlIIIIlIIllIllIII;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIIlIIlllIIIlI);
    }
    
    private static boolean lIIlIllIIlIlIIlI(final int llllllllllllIllIlIIIIlIIllIIIlII) {
        return llllllllllllIllIlIIIIlIIllIIIlII != 0;
    }
    
    private static void lIIlIllIIlIIllll() {
        (llIllIIIIlIlll = new String[CosmeticHalo.llIllIIIIllIII[2]])[CosmeticHalo.llIllIIIIllIII[0]] = lIIlIllIIlIIllIl("BxEpCQkkAS8F", "TdJaZ");
        CosmeticHalo.llIllIIIIlIlll[CosmeticHalo.llIllIIIIllIII[1]] = lIIlIllIIlIIlllI("p4Nq1Hp/gxgW4zRuwXY12PeZ5etr/+pK", "RJbdK");
    }
    
    private static boolean lIIlIllIIlIlIIll(final int llllllllllllIllIlIIIIlIIllIIIlll, final int llllllllllllIllIlIIIIlIIllIIIllI) {
        return llllllllllllIllIlIIIIlIIllIIIlll < llllllllllllIllIlIIIIlIIllIIIllI;
    }
    
    @Override
    public void render(final AbstractClientPlayer llllllllllllIllIlIIIIlIIllllIlIl, final float llllllllllllIllIlIIIIlIIllllIlII, final float llllllllllllIllIlIIIIlIIllllllII, final float llllllllllllIllIlIIIIlIIlllllIll, final float llllllllllllIllIlIIIIlIIlllllIlI, final float llllllllllllIllIlIIIIlIIlllllIIl, final float llllllllllllIllIlIIIIlIIlllllIII, final float llllllllllllIllIlIIIIlIIllllIlll) {
        if (lIIlIllIIlIlIIIl(llllllllllllIllIlIIIIlIIllllIlIl.getName().equals(CosmeticHalo.llIllIIIIlIlll[CosmeticHalo.llIllIIIIllIII[0]]) ? 1 : 0)) {
            return;
        }
        GL11.glPushMatrix();
        if (lIIlIllIIlIlIIlI(llllllllllllIllIlIIIIlIIllllIlIl.isSneaking() ? 1 : 0)) {
            GlStateManager.translate(0.0, 0.225, 0.0);
        }
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(CosmeticHalo.llIllIIIIlIlll[CosmeticHalo.llIllIIIIllIII[1]]));
        GlStateManager.color(1.0f, 1.0f, 1.0f);
        this.haloModel.render(llllllllllllIllIlIIIIlIIllllIlIl, llllllllllllIllIlIIIIlIIllllIlII, llllllllllllIllIlIIIIlIIllllllII, llllllllllllIllIlIIIIlIIlllllIlI, llllllllllllIllIlIIIIlIIlllllIIl, llllllllllllIllIlIIIIlIIlllllIII, llllllllllllIllIlIIIIlIIllllIlll);
        GL11.glPopMatrix();
    }
    
    static {
        lIIlIllIIlIlIIII();
        lIIlIllIIlIIllll();
    }
    
    public class HaloRenderer extends CosmeticModelBase
    {
        private static final /* synthetic */ int[] llllIlIllllIl;
        /* synthetic */ ModelRenderer Halo2;
        /* synthetic */ ModelRenderer Halo1;
        /* synthetic */ ModelRenderer Halo3;
        /* synthetic */ ModelRenderer Halo4;
        
        public HaloRenderer(final RenderPlayer lllllllllllllIlIllIlIlIIIIIIIIlI) {
            super(lllllllllllllIlIllIlIlIIIIIIIIlI);
            this.textureWidth = HaloRenderer.llllIlIllllIl[0];
            this.textureHeight = HaloRenderer.llllIlIllllIl[1];
            this.Halo1 = new ModelRenderer(this, HaloRenderer.llllIlIllllIl[2], HaloRenderer.llllIlIllllIl[2]);
            this.Halo1.addBox(0.0f, 0.0f, 0.0f, HaloRenderer.llllIlIllllIl[3], HaloRenderer.llllIlIllllIl[4], HaloRenderer.llllIlIllllIl[4]);
            "".length();
            this.Halo1.setRotationPoint(-5.0f, -11.0f, 4.0f);
            this.Halo1.setTextureSize(HaloRenderer.llllIlIllllIl[0], HaloRenderer.llllIlIllllIl[1]);
            "".length();
            this.Halo1.mirror = (HaloRenderer.llllIlIllllIl[4] != 0);
            this.Halo2 = new ModelRenderer(this, HaloRenderer.llllIlIllllIl[2], HaloRenderer.llllIlIllllIl[2]);
            this.Halo2.addBox(0.0f, 0.0f, 0.0f, HaloRenderer.llllIlIllllIl[3], HaloRenderer.llllIlIllllIl[4], HaloRenderer.llllIlIllllIl[4]);
            "".length();
            this.Halo2.setRotationPoint(-5.0f, -11.0f, -5.0f);
            this.Halo2.setTextureSize(HaloRenderer.llllIlIllllIl[0], HaloRenderer.llllIlIllllIl[1]);
            "".length();
            this.Halo2.mirror = (HaloRenderer.llllIlIllllIl[4] != 0);
            this.Halo3 = new ModelRenderer(this, HaloRenderer.llllIlIllllIl[2], HaloRenderer.llllIlIllllIl[2]);
            this.Halo3.addBox(0.0f, 0.0f, 0.0f, HaloRenderer.llllIlIllllIl[4], HaloRenderer.llllIlIllllIl[4], HaloRenderer.llllIlIllllIl[5]);
            "".length();
            this.Halo3.setRotationPoint(4.0f, -11.0f, -4.0f);
            this.Halo3.setTextureSize(HaloRenderer.llllIlIllllIl[0], HaloRenderer.llllIlIllllIl[1]);
            "".length();
            this.Halo3.mirror = (HaloRenderer.llllIlIllllIl[4] != 0);
            this.Halo4 = new ModelRenderer(this, HaloRenderer.llllIlIllllIl[2], HaloRenderer.llllIlIllllIl[2]);
            this.Halo4.addBox(0.0f, 0.0f, 0.0f, HaloRenderer.llllIlIllllIl[4], HaloRenderer.llllIlIllllIl[4], HaloRenderer.llllIlIllllIl[5]);
            "".length();
            this.Halo4.setRotationPoint(-5.0f, -11.0f, -4.0f);
            this.Halo4.setTextureSize(HaloRenderer.llllIlIllllIl[0], HaloRenderer.llllIlIllllIl[1]);
            "".length();
            this.Halo4.mirror = (HaloRenderer.llllIlIllllIl[4] != 0);
        }
        
        private static void lIlIlIlIllIIlll() {
            (llllIlIllllIl = new int[6])[0] = (0x3 ^ 0x43);
            HaloRenderer.llllIlIllllIl[1] = (0x63 ^ 0x40 ^ "   ".length());
            HaloRenderer.llllIlIllllIl[2] = ((0x6A ^ 0x36) & ~(0xDA ^ 0x86));
            HaloRenderer.llllIlIllllIl[3] = (135 + 84 - 89 + 51 ^ 70 + 190 - 150 + 81);
            HaloRenderer.llllIlIllllIl[4] = " ".length();
            HaloRenderer.llllIlIllllIl[5] = (0x40 ^ 0x70 ^ (0x4E ^ 0x76));
        }
        
        static {
            lIlIlIlIllIIlll();
        }
        
        @Override
        public void render(final Entity lllllllllllllIlIllIlIIlllllllIll, final float lllllllllllllIlIllIlIIlllllllIlI, final float lllllllllllllIlIllIlIIlllllllIIl, final float lllllllllllllIlIllIlIIlllllllIII, final float lllllllllllllIlIllIlIIllllllIlll, final float lllllllllllllIlIllIlIIllllllIllI, final float lllllllllllllIlIllIlIIllllllIlIl) {
            GlStateManager.pushMatrix();
            final float lllllllllllllIlIllIlIIllllllIlII = lllllllllllllIlIllIlIIlllllllIII / 100.0f;
            final float lllllllllllllIlIllIlIIllllllIIll = lllllllllllllIlIllIlIIllllllIlII * 3.1415927f * 1.0f;
            GlStateManager.translate(0.0f, -(float)(Math.sin(lllllllllllllIlIllIlIIllllllIIll + 2.0f) + 0.5) * 0.08f, 0.0f);
            GlStateManager.scale(0.9, 0.9, 0.9);
            this.Halo1.render(lllllllllllllIlIllIlIIllllllIlIl);
            this.Halo2.render(lllllllllllllIlIllIlIIllllllIlIl);
            this.Halo3.render(lllllllllllllIlIllIlIIllllllIlIl);
            this.Halo4.render(lllllllllllllIlIllIlIIllllllIlIl);
            GlStateManager.popMatrix();
        }
    }
}
