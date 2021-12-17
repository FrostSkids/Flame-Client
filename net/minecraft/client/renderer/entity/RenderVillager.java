// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityVillager;

public class RenderVillager extends RenderLiving<EntityVillager>
{
    private static final /* synthetic */ ResourceLocation librarianVillagerTextures;
    private static final /* synthetic */ ResourceLocation priestVillagerTextures;
    private static final /* synthetic */ ResourceLocation butcherVillagerTextures;
    private static final /* synthetic */ ResourceLocation villagerTextures;
    private static final /* synthetic */ int[] lIlIIlIIIIIIIl;
    private static final /* synthetic */ String[] lIlIIlIIIIIIII;
    private static final /* synthetic */ ResourceLocation farmerVillagerTextures;
    private static final /* synthetic */ ResourceLocation smithVillagerTextures;
    
    public RenderVillager(final RenderManager lllllllllllllIIIlllIllIIIllIlIlI) {
        super(lllllllllllllIIIlllIllIIIllIlIlI, new ModelVillager(0.0f), 0.5f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerCustomHead(this.getMainModel().villagerHead));
        "".length();
    }
    
    @Override
    protected void preRenderCallback(final EntityVillager lllllllllllllIIIlllIllIIIlIllIII, final float lllllllllllllIIIlllIllIIIlIllIll) {
        float lllllllllllllIIIlllIllIIIlIllIlI = 0.9375f;
        if (lllIIlIIlIIIIlI(lllllllllllllIIIlllIllIIIlIllIII.getGrowingAge())) {
            lllllllllllllIIIlllIllIIIlIllIlI *= 0.5;
            this.shadowSize = 0.25f;
            "".length();
            if (((0xED ^ 0xA7 ^ (0xB4 ^ 0x9C)) & (0x85 ^ 0xC4 ^ (0x7 ^ 0x24) ^ -" ".length())) != ((0xFC ^ 0xBD ^ (0x6A ^ 0x7C)) & (0x9C ^ 0xB7 ^ (0x77 ^ 0xB) ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.shadowSize = 0.5f;
        }
        GlStateManager.scale(lllllllllllllIIIlllIllIIIlIllIlI, lllllllllllllIIIlllIllIIIlIllIlI, lllllllllllllIIIlllIllIIIlIllIlI);
    }
    
    private static boolean lllIIlIIlIIIIlI(final int lllllllllllllIIIlllIllIIIIIlIIll) {
        return lllllllllllllIIIlllIllIIIIIlIIll < 0;
    }
    
    private static boolean lllIIlIIlIIIIll(final int lllllllllllllIIIlllIllIIIIIlIllI, final int lllllllllllllIIIlllIllIIIIIlIlIl) {
        return lllllllllllllIIIlllIllIIIIIlIllI < lllllllllllllIIIlllIllIIIIIlIlIl;
    }
    
    static {
        lllIIlIIlIIIIIl();
        lllIIlIIlIIIIII();
        villagerTextures = new ResourceLocation(RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[0]]);
        farmerVillagerTextures = new ResourceLocation(RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[1]]);
        librarianVillagerTextures = new ResourceLocation(RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[2]]);
        priestVillagerTextures = new ResourceLocation(RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[3]]);
        smithVillagerTextures = new ResourceLocation(RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[4]]);
        butcherVillagerTextures = new ResourceLocation(RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[5]]);
    }
    
    @Override
    public ModelVillager getMainModel() {
        return (ModelVillager)super.getMainModel();
    }
    
    private static String lllIIlIIIllllll(final String lllllllllllllIIIlllIllIIIIllIlII, final String lllllllllllllIIIlllIllIIIIllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllIIIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIllIIIIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIllIIIIlllIII.init(RenderVillager.lIlIIlIIIIIIIl[2], lllllllllllllIIIlllIllIIIIlllIIl);
            return new String(lllllllllllllIIIlllIllIIIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllIIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllIIIIllIlll) {
            lllllllllllllIIIlllIllIIIIllIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIlIIIlllllI(final String lllllllllllllIIIlllIllIIIlIIIIll, final String lllllllllllllIIIlllIllIIIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllIIIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), RenderVillager.lIlIIlIIIIIIIl[7]), "DES");
            final Cipher lllllllllllllIIIlllIllIIIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIlllIllIIIlIIIlIl.init(RenderVillager.lIlIIlIIIIIIIl[2], lllllllllllllIIIlllIllIIIlIIIllI);
            return new String(lllllllllllllIIIlllIllIIIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllIIIlIIIlII) {
            lllllllllllllIIIlllIllIIIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIIlIIIIII() {
        (lIlIIlIIIIIIII = new String[RenderVillager.lIlIIlIIIIIIIl[6]])[RenderVillager.lIlIIlIIIIIIIl[0]] = lllIIlIIIllllIl("HykVPDEZKR5nIQU4BDw9RDoEJCgKKwg6ax0lASQlDCkfZjQFKw==", "kLmHD");
        RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[1]] = lllIIlIIIllllIl("NwQzMD8xBDhrLy0VIjAzbBciKCYiBi42ZSUAOSkvMU87Ki0=", "CaKDJ");
        RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[2]] = lllIIlIIIlllllI("b9ZGjWG+MWtS2UVxGnk8RRHxRMrievUzrVujIth/hAjNRhW25y/n/A==", "YaiDL");
        RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[3]] = lllIIlIIIllllll("xSDAsTnpqQuxoj9Z1xjJ+30XrvWWCuU6xPIydUhXV1SSVvGYlIr4/Q==", "EzjVU");
        RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[4]] = lllIIlIIIlllllI("qBIQuuN+EEPfq1dbf+rhkZu9C/G55uV6in0TTlXt+5TWIF7WjD12Ww==", "VfbhE");
        RenderVillager.lIlIIlIIIIIIII[RenderVillager.lIlIIlIIIIIIIl[5]] = lllIIlIIIlllllI("w9lnAd2YEhKNyAgBlI9TF8oq/P3eDUI6RotH/lLBVeO7tIG86TDd/A==", "bMyMP");
    }
    
    private static String lllIIlIIIllllIl(String lllllllllllllIIIlllIllIIIIlIIIIl, final String lllllllllllllIIIlllIllIIIIlIIlIl) {
        lllllllllllllIIIlllIllIIIIlIIIIl = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlllIllIIIIlIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIllIIIIlIIlII = new StringBuilder();
        final char[] lllllllllllllIIIlllIllIIIIlIIIll = lllllllllllllIIIlllIllIIIIlIIlIl.toCharArray();
        int lllllllllllllIIIlllIllIIIIlIIIlI = RenderVillager.lIlIIlIIIIIIIl[0];
        final String lllllllllllllIIIlllIllIIIIIlllII = (Object)((String)lllllllllllllIIIlllIllIIIIlIIIIl).toCharArray();
        final byte lllllllllllllIIIlllIllIIIIIllIll = (byte)lllllllllllllIIIlllIllIIIIIlllII.length;
        int lllllllllllllIIIlllIllIIIIIllIlI = RenderVillager.lIlIIlIIIIIIIl[0];
        while (lllIIlIIlIIIIll(lllllllllllllIIIlllIllIIIIIllIlI, lllllllllllllIIIlllIllIIIIIllIll)) {
            final char lllllllllllllIIIlllIllIIIIlIIlll = lllllllllllllIIIlllIllIIIIIlllII[lllllllllllllIIIlllIllIIIIIllIlI];
            lllllllllllllIIIlllIllIIIIlIIlII.append((char)(lllllllllllllIIIlllIllIIIIlIIlll ^ lllllllllllllIIIlllIllIIIIlIIIll[lllllllllllllIIIlllIllIIIIlIIIlI % lllllllllllllIIIlllIllIIIIlIIIll.length]));
            "".length();
            ++lllllllllllllIIIlllIllIIIIlIIIlI;
            ++lllllllllllllIIIlllIllIIIIIllIlI;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIllIIIIlIIlII);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityVillager lllllllllllllIIIlllIllIIIllIIIlI) {
        switch (lllllllllllllIIIlllIllIIIllIIIlI.getProfession()) {
            case 0: {
                return RenderVillager.farmerVillagerTextures;
            }
            case 1: {
                return RenderVillager.librarianVillagerTextures;
            }
            case 2: {
                return RenderVillager.priestVillagerTextures;
            }
            case 3: {
                return RenderVillager.smithVillagerTextures;
            }
            case 4: {
                return RenderVillager.butcherVillagerTextures;
            }
            default: {
                return RenderVillager.villagerTextures;
            }
        }
    }
    
    private static void lllIIlIIlIIIIIl() {
        (lIlIIlIIIIIIIl = new int[8])[0] = ((0x50 ^ 0x30) & ~(0xE0 ^ 0x80));
        RenderVillager.lIlIIlIIIIIIIl[1] = " ".length();
        RenderVillager.lIlIIlIIIIIIIl[2] = "  ".length();
        RenderVillager.lIlIIlIIIIIIIl[3] = "   ".length();
        RenderVillager.lIlIIlIIIIIIIl[4] = (0xE8 ^ 0xB0 ^ (0xC3 ^ 0x9F));
        RenderVillager.lIlIIlIIIIIIIl[5] = (0x81 ^ 0x84);
        RenderVillager.lIlIIlIIIIIIIl[6] = (0x7F ^ 0x8 ^ (0xF ^ 0x7E));
        RenderVillager.lIlIIlIIIIIIIl[7] = (0xCD ^ 0xC5);
    }
}
