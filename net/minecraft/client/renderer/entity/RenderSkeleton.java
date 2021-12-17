// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import java.util.Arrays;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntitySkeleton;

public class RenderSkeleton extends RenderBiped<EntitySkeleton>
{
    private static final /* synthetic */ int[] llIIllIIIIlIIl;
    private static final /* synthetic */ ResourceLocation skeletonTextures;
    private static final /* synthetic */ String[] llIIllIIIIlIII;
    private static final /* synthetic */ ResourceLocation witherSkeletonTextures;
    
    @Override
    protected ResourceLocation getEntityTexture(final EntitySkeleton llllllllllllIlllIIIIlIlIIIIIIllI) {
        ResourceLocation resourceLocation;
        if (lIIIlllIIlIlIlII(llllllllllllIlllIIIIlIlIIIIIIllI.getSkeletonType(), RenderSkeleton.llIIllIIIIlIIl[1])) {
            resourceLocation = RenderSkeleton.witherSkeletonTextures;
            "".length();
            if (((0x71 ^ 0x4B) & ~(0x7C ^ 0x46)) != 0x0) {
                return null;
            }
        }
        else {
            resourceLocation = RenderSkeleton.skeletonTextures;
        }
        return resourceLocation;
    }
    
    private static boolean lIIIlllIIlIlIlII(final int llllllllllllIlllIIIIlIIlllIlllll, final int llllllllllllIlllIIIIlIIlllIllllI) {
        return llllllllllllIlllIIIIlIIlllIlllll == llllllllllllIlllIIIIlIIlllIllllI;
    }
    
    private static void lIIIlllIIlIlIIll() {
        (llIIllIIIIlIIl = new int[4])[0] = ((0xE0 ^ 0xBB) & ~(0x36 ^ 0x6D));
        RenderSkeleton.llIIllIIIIlIIl[1] = " ".length();
        RenderSkeleton.llIIllIIIIlIIl[2] = "  ".length();
        RenderSkeleton.llIIllIIIIlIIl[3] = (0x53 ^ 0x5B);
    }
    
    private static void lIIIlllIIlIlIIlI() {
        (llIIllIIIIlIII = new String[RenderSkeleton.llIIllIIIIlIIl[2]])[RenderSkeleton.llIIllIIIIlIIl[0]] = lIIIlllIIlIlIIII("B3q9VHWkbNJWcIZ8miBv04vuHEI2QxPBFmpsD0HtZg2/OaW1mV8QCA==", "bEZGA");
        RenderSkeleton.llIIllIIIIlIII[RenderSkeleton.llIIllIIIIlIIl[1]] = lIIIlllIIlIlIIIl("TrIoXf8z8IECsTmqIS6Mp0gr4MxAThb6yftSDruE1btIK+DMQE4W+mby3joMmKnT", "KEeSP");
    }
    
    private static String lIIIlllIIlIlIIII(final String llllllllllllIlllIIIIlIIlllllIIlI, final String llllllllllllIlllIIIIlIIlllllIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIlIIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIlIIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIlIIlllllIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIlIIlllllIllI.init(RenderSkeleton.llIIllIIIIlIIl[2], llllllllllllIlllIIIIlIIlllllIlll);
            return new String(llllllllllllIlllIIIIlIIlllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIlllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIlIIlllllIlIl) {
            llllllllllllIlllIIIIlIIlllllIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlllIIlIlIIll();
        lIIIlllIIlIlIIlI();
        skeletonTextures = new ResourceLocation(RenderSkeleton.llIIllIIIIlIII[RenderSkeleton.llIIllIIIIlIIl[0]]);
        witherSkeletonTextures = new ResourceLocation(RenderSkeleton.llIIllIIIIlIII[RenderSkeleton.llIIllIIIIlIIl[1]]);
    }
    
    public RenderSkeleton(final RenderManager llllllllllllIlllIIIIlIlIIIIlIIII) {
        super(llllllllllllIlllIIIIlIlIIIIlIIII, new ModelSkeleton(), 0.5f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldItem(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerBipedArmor(this) {
            private static final /* synthetic */ int[] lIllIlllllIIll;
            
            @Override
            protected void initArmor() {
                this.field_177189_c = (T)new ModelSkeleton(0.5f, (boolean)(RenderSkeleton$1.lIllIlllllIIll[0] != 0));
                this.field_177186_d = (T)new ModelSkeleton(1.0f, (boolean)(RenderSkeleton$1.lIllIlllllIIll[0] != 0));
            }
            
            private static void lIIIIIIIlIIlIIII() {
                (lIllIlllllIIll = new int[1])[0] = " ".length();
            }
            
            static {
                lIIIIIIIlIIlIIII();
            }
        });
        "".length();
    }
    
    private static String lIIIlllIIlIlIIIl(final String llllllllllllIlllIIIIlIIllllIIlll, final String llllllllllllIlllIIIIlIIllllIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIlIIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIlIIllllIIlII.getBytes(StandardCharsets.UTF_8)), RenderSkeleton.llIIllIIIIlIIl[3]), "DES");
            final Cipher llllllllllllIlllIIIIlIIllllIlIIl = Cipher.getInstance("DES");
            llllllllllllIlllIIIIlIIllllIlIIl.init(RenderSkeleton.llIIllIIIIlIIl[2], llllllllllllIlllIIIIlIIllllIlIlI);
            return new String(llllllllllllIlllIIIIlIIllllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIlIIllllIlIII) {
            llllllllllllIlllIIIIlIIllllIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void preRenderCallback(final EntitySkeleton llllllllllllIlllIIIIlIlIIIIIlIll, final float llllllllllllIlllIIIIlIlIIIIIllII) {
        if (lIIIlllIIlIlIlII(llllllllllllIlllIIIIlIlIIIIIlIll.getSkeletonType(), RenderSkeleton.llIIllIIIIlIIl[1])) {
            GlStateManager.scale(1.2f, 1.2f, 1.2f);
        }
    }
    
    @Override
    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.09375f, 0.1875f, 0.0f);
    }
}
