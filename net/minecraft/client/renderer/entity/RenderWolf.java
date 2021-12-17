// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.LayerWolfCollar;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityWolf;

public class RenderWolf extends RenderLiving<EntityWolf>
{
    private static final /* synthetic */ ResourceLocation wolfTextures;
    private static final /* synthetic */ ResourceLocation tamedWolfTextures;
    private static final /* synthetic */ ResourceLocation anrgyWolfTextures;
    private static final /* synthetic */ String[] lIlIlIIllIlIII;
    private static final /* synthetic */ int[] lIlIlIIllIlIIl;
    
    private static void lllIllIlIIlIIIl() {
        (lIlIlIIllIlIIl = new int[4])[0] = ((0x1A ^ 0x2A) & ~(0xAE ^ 0x9E));
        RenderWolf.lIlIlIIllIlIIl[1] = " ".length();
        RenderWolf.lIlIlIIllIlIIl[2] = "  ".length();
        RenderWolf.lIlIlIIllIlIIl[3] = "   ".length();
    }
    
    private static void lllIllIlIIlIIII() {
        (lIlIlIIllIlIII = new String[RenderWolf.lIlIlIIllIlIIl[3]])[RenderWolf.lIlIlIIllIlIIl[0]] = lllIllIlIIIlllI("jXWAme4+eHDWqPC2sIgNrzNPovf9itJXwl40YJDViZ4=", "HfNsv");
        RenderWolf.lIlIlIIllIlIII[RenderWolf.lIlIlIIllIlIIl[1]] = lllIllIlIIIllll("ETQVFRAXNB5OAAslBBUcSiYCDQNKJgINAzolDAwASyEDBg==", "eQmae");
        RenderWolf.lIlIlIIllIlIII[RenderWolf.lIlIlIIllIlIIl[2]] = lllIllIlIIIlllI("hm5rD9PQmi0kf8iuEt+2HUZUNO6nEcR+RiC7Z1RrZ5rxhucdT8bY1Q==", "lINvZ");
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityWolf lllllllllllllIIIlIIlIIllllIllIll) {
        ResourceLocation resourceLocation;
        if (lllIllIlIIlIIlI(lllllllllllllIIIlIIlIIllllIllIll.isTamed() ? 1 : 0)) {
            resourceLocation = RenderWolf.tamedWolfTextures;
            "".length();
            if (" ".length() == (0x55 ^ 0x5F ^ (0x5B ^ 0x55))) {
                return null;
            }
        }
        else if (lllIllIlIIlIIlI(lllllllllllllIIIlIIlIIllllIllIll.isAngry() ? 1 : 0)) {
            resourceLocation = RenderWolf.anrgyWolfTextures;
            "".length();
            if (((0x60 ^ 0x3A) & ~(0xE6 ^ 0xBC)) == " ".length()) {
                return null;
            }
        }
        else {
            resourceLocation = RenderWolf.wolfTextures;
        }
        return resourceLocation;
    }
    
    private static String lllIllIlIIIlllI(final String lllllllllllllIIIlIIlIIlllIlllIIl, final String lllllllllllllIIIlIIlIIlllIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIlIIlllIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIIlllIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIlIIlllIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIlIIlllIllllIl.init(RenderWolf.lIlIlIIllIlIIl[2], lllllllllllllIIIlIIlIIlllIlllllI);
            return new String(lllllllllllllIIIlIIlIIlllIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIIlllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIlIIlllIllllII) {
            lllllllllllllIIIlIIlIIlllIllllII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIllIlIIIllll(String lllllllllllllIIIlIIlIIlllIlIIllI, final String lllllllllllllIIIlIIlIIlllIlIlIlI) {
        lllllllllllllIIIlIIlIIlllIlIIllI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIlIIlllIlIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIlIIlllIlIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIlIIlIIlllIlIlIII = lllllllllllllIIIlIIlIIlllIlIlIlI.toCharArray();
        int lllllllllllllIIIlIIlIIlllIlIIlll = RenderWolf.lIlIlIIllIlIIl[0];
        final Exception lllllllllllllIIIlIIlIIlllIlIIIIl = (Object)((String)lllllllllllllIIIlIIlIIlllIlIIllI).toCharArray();
        final String lllllllllllllIIIlIIlIIlllIlIIIII = (String)lllllllllllllIIIlIIlIIlllIlIIIIl.length;
        double lllllllllllllIIIlIIlIIlllIIlllll = RenderWolf.lIlIlIIllIlIIl[0];
        while (lllIllIlIIlIIll((int)lllllllllllllIIIlIIlIIlllIIlllll, (int)lllllllllllllIIIlIIlIIlllIlIIIII)) {
            final char lllllllllllllIIIlIIlIIlllIlIllII = lllllllllllllIIIlIIlIIlllIlIIIIl[lllllllllllllIIIlIIlIIlllIIlllll];
            lllllllllllllIIIlIIlIIlllIlIlIIl.append((char)(lllllllllllllIIIlIIlIIlllIlIllII ^ lllllllllllllIIIlIIlIIlllIlIlIII[lllllllllllllIIIlIIlIIlllIlIIlll % lllllllllllllIIIlIIlIIlllIlIlIII.length]));
            "".length();
            ++lllllllllllllIIIlIIlIIlllIlIIlll;
            ++lllllllllllllIIIlIIlIIlllIIlllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIlIIlllIlIlIIl);
    }
    
    @Override
    public void doRender(final EntityWolf lllllllllllllIIIlIIlIIlllllIIlIl, final double lllllllllllllIIIlIIlIIlllllIllII, final double lllllllllllllIIIlIIlIIlllllIlIll, final double lllllllllllllIIIlIIlIIlllllIlIlI, final float lllllllllllllIIIlIIlIIlllllIlIIl, final float lllllllllllllIIIlIIlIIlllllIlIII) {
        if (lllIllIlIIlIIlI(lllllllllllllIIIlIIlIIlllllIIlIl.isWolfWet() ? 1 : 0)) {
            final float lllllllllllllIIIlIIlIIlllllIIlll = lllllllllllllIIIlIIlIIlllllIIlIl.getBrightness(lllllllllllllIIIlIIlIIlllllIlIII) * lllllllllllllIIIlIIlIIlllllIIlIl.getShadingWhileWet(lllllllllllllIIIlIIlIIlllllIlIII);
            GlStateManager.color(lllllllllllllIIIlIIlIIlllllIIlll, lllllllllllllIIIlIIlIIlllllIIlll, lllllllllllllIIIlIIlIIlllllIIlll);
        }
        super.doRender(lllllllllllllIIIlIIlIIlllllIIlIl, lllllllllllllIIIlIIlIIlllllIllII, lllllllllllllIIIlIIlIIlllllIlIll, lllllllllllllIIIlIIlIIlllllIlIlI, lllllllllllllIIIlIIlIIlllllIlIIl, lllllllllllllIIIlIIlIIlllllIlIII);
    }
    
    private static boolean lllIllIlIIlIIlI(final int lllllllllllllIIIlIIlIIlllIIllIII) {
        return lllllllllllllIIIlIIlIIlllIIllIII != 0;
    }
    
    @Override
    protected float handleRotationFloat(final EntityWolf lllllllllllllIIIlIIlIIllllllIlll, final float lllllllllllllIIIlIIlIIlllllllIII) {
        return lllllllllllllIIIlIIlIIllllllIlll.getTailRotation();
    }
    
    private static boolean lllIllIlIIlIIll(final int lllllllllllllIIIlIIlIIlllIIllIll, final int lllllllllllllIIIlIIlIIlllIIllIlI) {
        return lllllllllllllIIIlIIlIIlllIIllIll < lllllllllllllIIIlIIlIIlllIIllIlI;
    }
    
    static {
        lllIllIlIIlIIIl();
        lllIllIlIIlIIII();
        wolfTextures = new ResourceLocation(RenderWolf.lIlIlIIllIlIII[RenderWolf.lIlIlIIllIlIIl[0]]);
        tamedWolfTextures = new ResourceLocation(RenderWolf.lIlIlIIllIlIII[RenderWolf.lIlIlIIllIlIIl[1]]);
        anrgyWolfTextures = new ResourceLocation(RenderWolf.lIlIlIIllIlIII[RenderWolf.lIlIlIIllIlIIl[2]]);
    }
    
    public RenderWolf(final RenderManager lllllllllllllIIIlIIlIlIIIIIIIIlI, final ModelBase lllllllllllllIIIlIIlIlIIIIIIIIIl, final float lllllllllllllIIIlIIlIIllllllllII) {
        super(lllllllllllllIIIlIIlIlIIIIIIIIlI, lllllllllllllIIIlIIlIlIIIIIIIIIl, lllllllllllllIIIlIIlIIllllllllII);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerWolfCollar(this));
        "".length();
    }
}
