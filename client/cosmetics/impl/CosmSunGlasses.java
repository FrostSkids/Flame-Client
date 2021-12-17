// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics.impl;

import net.minecraft.client.model.ModelBase;
import client.cosmetics.CosmeticModelBase;
import net.minecraft.client.model.ModelRenderer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.entity.AbstractClientPlayer;
import client.cosmetics.CosmeticBase;

public class CosmSunGlasses extends CosmeticBase
{
    private static final /* synthetic */ int[] llIllIlIIIIlIl;
    private final /* synthetic */ GlassesRenderer glassesModel;
    private static final /* synthetic */ String[] llIllIlIIIIlII;
    
    private static boolean lIIlIllllIIIIIll(final int llllllllllllIllIIlllIIIlIlIllllI) {
        return llllllllllllIllIIlllIIIlIlIllllI != 0;
    }
    
    @Override
    public void render(final AbstractClientPlayer llllllllllllIllIIlllIIIllIIlIIll, final float llllllllllllIllIIlllIIIllIIlIIlI, final float llllllllllllIllIIlllIIIllIIIlIII, final float llllllllllllIllIIlllIIIllIIlIIII, final float llllllllllllIllIIlllIIIllIIIIlll, final float llllllllllllIllIIlllIIIllIIIIllI, final float llllllllllllIllIIlllIIIllIIIIlIl, final float llllllllllllIllIIlllIIIllIIIIlII) {
        if (lIIlIllllIIIIIlI(llllllllllllIllIIlllIIIllIIlIIll.getName().equals(CosmSunGlasses.llIllIlIIIIlII[CosmSunGlasses.llIllIlIIIIlIl[0]]) ? 1 : 0)) {
            return;
        }
        GL11.glPushMatrix();
        if (lIIlIllllIIIIIll(llllllllllllIllIIlllIIIllIIlIIll.isSneaking() ? 1 : 0)) {
            GlStateManager.translate(0.0, 0.225, 0.0);
        }
        GlStateManager.rotate(llllllllllllIllIIlllIIIllIIIIllI, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIllIIlllIIIllIIIIlIl, 1.0f, 0.0f, 0.0f);
        this.glassesModel.render(llllllllllllIllIIlllIIIllIIlIIll, llllllllllllIllIIlllIIIllIIlIIlI, llllllllllllIllIIlllIIIllIIIlIII, llllllllllllIllIIlllIIIllIIIIlll, llllllllllllIllIIlllIIIllIIIIllI, llllllllllllIllIIlllIIIllIIIIlIl, llllllllllllIllIIlllIIIllIIIIlII);
        GL11.glPopMatrix();
    }
    
    public CosmSunGlasses(final RenderPlayer llllllllllllIllIIlllIIIllIIlllll) {
        super(llllllllllllIllIIlllIIIllIIlllll);
        this.glassesModel = new GlassesRenderer(llllllllllllIllIIlllIIIllIIlllll);
    }
    
    private static void lIIlIllllIIIIIIl() {
        (llIllIlIIIIlIl = new int[3])[0] = ((0x7D ^ 0x1D) & ~(0x31 ^ 0x51));
        CosmSunGlasses.llIllIlIIIIlIl[1] = " ".length();
        CosmSunGlasses.llIllIlIIIIlIl[2] = "  ".length();
    }
    
    static {
        lIIlIllllIIIIIIl();
        lIIlIllllIIIIIII();
    }
    
    private static String lIIlIlllIlllllll(final String llllllllllllIllIIlllIIIlIllIIlIl, final String llllllllllllIllIIlllIIIlIllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIIIlIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIIIlIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIIIlIllIIlll.init(CosmSunGlasses.llIllIlIIIIlIl[2], llllllllllllIllIIlllIIIlIllIlIII);
            return new String(llllllllllllIllIIlllIIIlIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIIIlIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIIIlIllIIllI) {
            llllllllllllIllIIlllIIIlIllIIllI.printStackTrace();
            return null;
        }
    }
    
    private void setRotation(final ModelRenderer llllllllllllIllIIlllIIIlIllllllI, final float llllllllllllIllIIlllIIIlIllllIIl, final float llllllllllllIllIIlllIIIlIlllllII, final float llllllllllllIllIIlllIIIlIllllIll) {
        llllllllllllIllIIlllIIIlIllllllI.rotateAngleX = llllllllllllIllIIlllIIIlIllllIIl;
        llllllllllllIllIIlllIIIlIllllllI.rotateAngleY = llllllllllllIllIIlllIIIlIlllllII;
        llllllllllllIllIIlllIIIlIllllllI.rotateAngleZ = llllllllllllIllIIlllIIIlIllllIll;
    }
    
    private static boolean lIIlIllllIIIIIlI(final int llllllllllllIllIIlllIIIlIlIlllII) {
        return llllllllllllIllIIlllIIIlIlIlllII == 0;
    }
    
    private static void lIIlIllllIIIIIII() {
        (llIllIlIIIIlII = new String[CosmSunGlasses.llIllIlIIIIlIl[1]])[CosmSunGlasses.llIllIlIIIIlIl[0]] = lIIlIlllIlllllll("VlPjgeu+/9kZ8Lkmmns2+g==", "zAmqV");
    }
    
    public class GlassesRenderer extends CosmeticModelBase
    {
        /* synthetic */ ModelRenderer Glasses4;
        /* synthetic */ ModelRenderer Glasses3;
        /* synthetic */ ModelRenderer Glasses1;
        /* synthetic */ ModelRenderer Glasses9;
        /* synthetic */ ModelRenderer Glasses7;
        /* synthetic */ ModelRenderer Glasses5;
        /* synthetic */ ModelRenderer Glasses6;
        /* synthetic */ ModelRenderer Glasses2;
        /* synthetic */ ModelRenderer Glasses8;
        private static final /* synthetic */ int[] llIIlllIIIIlIl;
        
        public GlassesRenderer(final RenderPlayer llllllllllllIllIlllllIlIlIIIlIll) {
            super(llllllllllllIllIlllllIlIlIIIlIll);
            this.textureWidth = GlassesRenderer.llIIlllIIIIlIl[0];
            this.textureHeight = GlassesRenderer.llIIlllIIIIlIl[1];
            this.Glasses1 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses1.addBox(0.0f, 0.0f, 0.0f, GlassesRenderer.llIIlllIIIIlIl[3], GlassesRenderer.llIIlllIIIIlIl[4], GlassesRenderer.llIIlllIIIIlIl[5]);
            "".length();
            this.Glasses1.setRotationPoint(-5.0f, -3.0f, -5.0f);
            this.Glasses1.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses1.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses1, 0.0f, 0.0f, 0.0f);
            this.Glasses2 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses2.addBox(0.0f, 0.0f, 0.0f, GlassesRenderer.llIIlllIIIIlIl[6], GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[5]);
            "".length();
            this.Glasses2.setRotationPoint(-5.0f, -3.0f, -5.0f);
            this.Glasses2.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses2.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses2, 0.0f, 0.0f, 0.0f);
            this.Glasses3 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses3.addBox(0.0f, 0.0f, 0.0f, GlassesRenderer.llIIlllIIIIlIl[3], GlassesRenderer.llIIlllIIIIlIl[4], GlassesRenderer.llIIlllIIIIlIl[5]);
            "".length();
            this.Glasses3.setRotationPoint(1.0f, -3.0f, -5.0f);
            this.Glasses3.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses3.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses3, 0.0f, 0.0f, 0.0f);
            this.Glasses4 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses4.addBox(-3.0f, 0.0f, -2.0f, GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[7]);
            "".length();
            this.Glasses4.setRotationPoint(-2.0f, -3.0f, -3.0f);
            this.Glasses4.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses4.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses4, 0.0f, 0.0f, 0.0f);
            this.Glasses5 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses5.addBox(0.0f, 0.0f, 0.0f, GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[7]);
            "".length();
            this.Glasses5.setRotationPoint(4.0f, -3.0f, -5.0f);
            this.Glasses5.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses5.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses5, 0.0f, 0.0f, 0.0f);
            this.Glasses6 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses6.addBox(0.0f, 0.0f, 0.0f, GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[5]);
            "".length();
            this.Glasses6.setRotationPoint(4.0f, -2.0f, 1.0f);
            this.Glasses6.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses6.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses6, 0.0f, 0.0f, 0.0f);
            this.Glasses7 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses7.addBox(0.0f, 0.0f, 0.0f, GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[5], GlassesRenderer.llIIlllIIIIlIl[5]);
            "".length();
            this.Glasses7.setRotationPoint(-5.0f, -2.0f, 1.0f);
            this.Glasses7.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses7.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses7, 0.0f, 0.0f, 0.0f);
            this.Glasses8 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses8.addBox(0.0f, 0.0f, 0.0f, GlassesRenderer.llIIlllIIIIlIl[3], GlassesRenderer.llIIlllIIIIlIl[4], GlassesRenderer.llIIlllIIIIlIl[5]);
            "".length();
            this.Glasses8.setRotationPoint(-5.0f, -3.0f, -5.0f);
            this.Glasses8.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses8.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses8, 0.0f, 0.0f, 0.0f);
            this.Glasses9 = new ModelRenderer(this, GlassesRenderer.llIIlllIIIIlIl[2], GlassesRenderer.llIIlllIIIIlIl[2]);
            this.Glasses9.addBox(1.0f, -3.0f, -5.0f, GlassesRenderer.llIIlllIIIIlIl[3], GlassesRenderer.llIIlllIIIIlIl[4], GlassesRenderer.llIIlllIIIIlIl[5]);
            "".length();
            this.Glasses9.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.Glasses9.setTextureSize(GlassesRenderer.llIIlllIIIIlIl[0], GlassesRenderer.llIIlllIIIIlIl[1]);
            "".length();
            this.Glasses9.mirror = (GlassesRenderer.llIIlllIIIIlIl[5] != 0);
            CosmSunGlasses.this.setRotation(this.Glasses9, 0.0f, 0.0f, 0.0f);
        }
        
        @Override
        public void render(final Entity llllllllllllIllIlllllIlIlIIIIlII, final float llllllllllllIllIlllllIlIlIIIIIll, final float llllllllllllIllIlllllIlIlIIIIIlI, final float llllllllllllIllIlllllIlIlIIIIIIl, final float llllllllllllIllIlllllIlIlIIIIIII, final float llllllllllllIllIlllllIlIIlllllll, final float llllllllllllIllIlllllIlIIllllllI) {
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0, -0.065, 0.0);
            GlStateManager.color(0.0f, 0.0f, 0.0f);
            this.Glasses1.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses2.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses3.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses4.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses5.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses6.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses7.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses8.render(llllllllllllIllIlllllIlIIllllllI);
            this.Glasses9.render(llllllllllllIllIlllllIlIIllllllI);
            GlStateManager.popMatrix();
        }
        
        private static void lIIIllllIlIllllI() {
            (llIIlllIIIIlIl = new int[8])[0] = (0x7 ^ 0x47);
            GlassesRenderer.llIIlllIIIIlIl[1] = (0xB ^ 0x2B);
            GlassesRenderer.llIIlllIIIIlIl[2] = ((" ".length() ^ (0x2A ^ 0x76)) & (0xBB ^ 0xA6 ^ (0x7A ^ 0x3A) ^ -" ".length()));
            GlassesRenderer.llIIlllIIIIlIl[3] = (0x25 ^ 0x55 ^ (0x26 ^ 0x52));
            GlassesRenderer.llIIlllIIIIlIl[4] = "  ".length();
            GlassesRenderer.llIIlllIIIIlIl[5] = " ".length();
            GlassesRenderer.llIIlllIIIIlIl[6] = (0xEC ^ 0xB8 ^ (0xF5 ^ 0xAB));
            GlassesRenderer.llIIlllIIIIlIl[7] = (0x38 ^ 0x3E);
        }
        
        static {
            lIIIllllIlIllllI();
        }
    }
}
