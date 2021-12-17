// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import com.google.common.collect.Maps;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.EnumDyeColor;
import java.util.List;
import java.util.Iterator;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.LayeredColorMaskTexture;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBanner;
import java.util.Map;
import net.minecraft.tileentity.TileEntityBanner;

public class TileEntityBannerRenderer extends TileEntitySpecialRenderer<TileEntityBanner>
{
    private static final /* synthetic */ int[] lllllllllllII;
    private static final /* synthetic */ Map<String, TimedBannerTexture> DESIGNS;
    private static final /* synthetic */ String[] llllllllllIll;
    private /* synthetic */ ModelBanner bannerModel;
    private static final /* synthetic */ ResourceLocation BANNERTEXTURES;
    
    private static void lIllIIlIIlIlIlI() {
        (llllllllllIll = new String[TileEntityBannerRenderer.lllllllllllII[10]])[TileEntityBannerRenderer.lllllllllllII[0]] = lIllIIlIIlIlIIl("2DmEXwVcsBBI2Kkh0BDEq8pG6rYOUN46dE/aSsQ/eF8=", "EQonc");
        TileEntityBannerRenderer.llllllllllIll[TileEntityBannerRenderer.lllllllllllII[1]] = lIllIIlIIlIlIIl("TWQ/BjKFKAc6p3S5hM60ncc4GRXNVv57", "DJRYR");
        TileEntityBannerRenderer.llllllllllIll[TileEntityBannerRenderer.lllllllllllII[3]] = lIllIIlIIlIlIIl("mu6dglWxbLQ=", "yWPEx");
    }
    
    private static boolean lIllIIlIIlIlllI(final Object lllllllllllllIlIlIIlIlIlIIIlIllI, final Object lllllllllllllIlIlIIlIlIlIIIlIlIl) {
        return lllllllllllllIlIlIIlIlIlIIIlIllI != lllllllllllllIlIlIIlIlIlIIIlIlIl;
    }
    
    private static boolean lIllIIlIIllIlII(final int lllllllllllllIlIlIIlIlIlIIIIllIl) {
        return lllllllllllllIlIlIIlIlIlIIIIllIl == 0;
    }
    
    private static void lIllIIlIIlIlIll() {
        (lllllllllllII = new int[12])[0] = ((0x82 ^ 0xAD ^ (0xFF ^ 0x95)) & (0x72 ^ 0x16 ^ (0x2B ^ 0xA) ^ -" ".length()));
        TileEntityBannerRenderer.lllllllllllII[1] = " ".length();
        TileEntityBannerRenderer.lllllllllllII[2] = (-(0xFFFFAAD5 & 0x7FBE) & (0xFFFFAFFF & 0x7BFB));
        TileEntityBannerRenderer.lllllllllllII[3] = "  ".length();
        TileEntityBannerRenderer.lllllllllllII[4] = (0xC5 ^ 0xC1);
        TileEntityBannerRenderer.lllllllllllII[5] = (0xAB ^ 0xAE);
        TileEntityBannerRenderer.lllllllllllII[6] = (0x54 ^ 0x53);
        TileEntityBannerRenderer.lllllllllllII[7] = (137 + 181 - 209 + 97 ^ 78 + 17 + 45 + 59);
        TileEntityBannerRenderer.lllllllllllII[8] = (0x3 ^ 0xE);
        TileEntityBannerRenderer.lllllllllllII[9] = (0xFFFFE90A & 0x17F5);
        TileEntityBannerRenderer.lllllllllllII[10] = "   ".length();
        TileEntityBannerRenderer.lllllllllllII[11] = (13 + 8 + 12 + 125 ^ 39 + 133 - 157 + 135);
    }
    
    private ResourceLocation func_178463_a(final TileEntityBanner lllllllllllllIlIlIIlIlIlIlIIlllI) {
        final String lllllllllllllIlIlIIlIlIlIlIIllIl = lllllllllllllIlIlIIlIlIlIlIIlllI.func_175116_e();
        if (lIllIIlIIlIllIl(lllllllllllllIlIlIIlIlIlIlIIllIl.isEmpty() ? 1 : 0)) {
            return null;
        }
        TimedBannerTexture lllllllllllllIlIlIIlIlIlIlIIllII = TileEntityBannerRenderer.DESIGNS.get(lllllllllllllIlIlIIlIlIlIlIIllIl);
        if (lIllIIlIIllIIIl(lllllllllllllIlIlIIlIlIlIlIIllII)) {
            if (lIllIIlIIllIIlI(TileEntityBannerRenderer.DESIGNS.size(), TileEntityBannerRenderer.lllllllllllII[9])) {
                final long lllllllllllllIlIlIIlIlIlIlIIlIll = System.currentTimeMillis();
                final Iterator<String> lllllllllllllIlIlIIlIlIlIlIIlIlI = TileEntityBannerRenderer.DESIGNS.keySet().iterator();
                "".length();
                if ("   ".length() <= ((0xE5 ^ 0x98 ^ (0x80 ^ 0xC0)) & (0x5C ^ 0x40 ^ (0x43 ^ 0x62) ^ -" ".length()))) {
                    return null;
                }
                while (!lIllIIlIIllIlII(lllllllllllllIlIlIIlIlIlIlIIlIlI.hasNext() ? 1 : 0)) {
                    final String lllllllllllllIlIlIIlIlIlIlIIlIIl = lllllllllllllIlIlIIlIlIlIlIIlIlI.next();
                    final TimedBannerTexture lllllllllllllIlIlIIlIlIlIlIIlIII = TileEntityBannerRenderer.DESIGNS.get(lllllllllllllIlIlIIlIlIlIlIIlIIl);
                    if (lIllIIlIIllIIll(lIllIIlIIllIIII(lllllllllllllIlIlIIlIlIlIlIIlIll - lllllllllllllIlIlIIlIlIlIlIIlIII.systemTime, 60000L))) {
                        Minecraft.getMinecraft().getTextureManager().deleteTexture(lllllllllllllIlIlIIlIlIlIlIIlIII.bannerTexture);
                        lllllllllllllIlIlIIlIlIlIlIIlIlI.remove();
                    }
                }
                if (lIllIIlIIllIIlI(TileEntityBannerRenderer.DESIGNS.size(), TileEntityBannerRenderer.lllllllllllII[9])) {
                    return null;
                }
            }
            final List<TileEntityBanner.EnumBannerPattern> lllllllllllllIlIlIIlIlIlIlIIIlll = lllllllllllllIlIlIIlIlIlIlIIlllI.getPatternList();
            final List<EnumDyeColor> lllllllllllllIlIlIIlIlIlIlIIIllI = lllllllllllllIlIlIIlIlIlIlIIlllI.getColorList();
            final List<String> lllllllllllllIlIlIIlIlIlIlIIIlIl = (List<String>)Lists.newArrayList();
            final Exception lllllllllllllIlIlIIlIlIlIIllllII = (Exception)lllllllllllllIlIlIIlIlIlIlIIIlll.iterator();
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
            while (!lIllIIlIIllIlII(((Iterator)lllllllllllllIlIlIIlIlIlIIllllII).hasNext() ? 1 : 0)) {
                final TileEntityBanner.EnumBannerPattern lllllllllllllIlIlIIlIlIlIlIIIlII = ((Iterator<TileEntityBanner.EnumBannerPattern>)lllllllllllllIlIlIIlIlIlIIllllII).next();
                lllllllllllllIlIlIIlIlIlIlIIIlIl.add(String.valueOf(new StringBuilder(TileEntityBannerRenderer.llllllllllIll[TileEntityBannerRenderer.lllllllllllII[1]]).append(lllllllllllllIlIlIIlIlIlIlIIIlII.getPatternName()).append(TileEntityBannerRenderer.llllllllllIll[TileEntityBannerRenderer.lllllllllllII[3]])));
                "".length();
            }
            lllllllllllllIlIlIIlIlIlIlIIllII = new TimedBannerTexture(null);
            lllllllllllllIlIlIIlIlIlIlIIllII.bannerTexture = new ResourceLocation(lllllllllllllIlIlIIlIlIlIlIIllIl);
            Minecraft.getMinecraft().getTextureManager().loadTexture(lllllllllllllIlIlIIlIlIlIlIIllII.bannerTexture, new LayeredColorMaskTexture(TileEntityBannerRenderer.BANNERTEXTURES, lllllllllllllIlIlIIlIlIlIlIIIlIl, lllllllllllllIlIlIIlIlIlIlIIIllI));
            "".length();
            TileEntityBannerRenderer.DESIGNS.put(lllllllllllllIlIlIIlIlIlIlIIllIl, lllllllllllllIlIlIIlIlIlIlIIllII);
            "".length();
        }
        lllllllllllllIlIlIIlIlIlIlIIllII.systemTime = System.currentTimeMillis();
        return lllllllllllllIlIlIIlIlIlIlIIllII.bannerTexture;
    }
    
    private static boolean lIllIIlIIllIIll(final int lllllllllllllIlIlIIlIlIlIIIIlIll) {
        return lllllllllllllIlIlIIlIlIlIIIIlIll > 0;
    }
    
    private static int lIllIIlIIllIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIllIIlIIlIllIl(final int lllllllllllllIlIlIIlIlIlIIIIllll) {
        return lllllllllllllIlIlIIlIlIlIIIIllll != 0;
    }
    
    private static boolean lIllIIlIIllIIIl(final Object lllllllllllllIlIlIIlIlIlIIIlIIIl) {
        return lllllllllllllIlIlIIlIlIlIIIlIIIl == null;
    }
    
    private static boolean lIllIIlIIlIllII(final Object lllllllllllllIlIlIIlIlIlIIIlIIll) {
        return lllllllllllllIlIlIIlIlIlIIIlIIll != null;
    }
    
    private static boolean lIllIIlIIlIllll(final int lllllllllllllIlIlIIlIlIlIIIllllI, final int lllllllllllllIlIlIIlIlIlIIIlllIl) {
        return lllllllllllllIlIlIIlIlIlIIIllllI == lllllllllllllIlIlIIlIlIlIIIlllIl;
    }
    
    static {
        lIllIIlIIlIlIll();
        lIllIIlIIlIlIlI();
        DESIGNS = Maps.newHashMap();
        BANNERTEXTURES = new ResourceLocation(TileEntityBannerRenderer.llllllllllIll[TileEntityBannerRenderer.lllllllllllII[0]]);
    }
    
    public TileEntityBannerRenderer() {
        this.bannerModel = new ModelBanner();
    }
    
    @Override
    public void renderTileEntityAt(final TileEntityBanner lllllllllllllIlIlIIlIlIlIlllIlIl, final double lllllllllllllIlIlIIlIlIlIllIIIll, final double lllllllllllllIlIlIIlIlIlIllIIIlI, final double lllllllllllllIlIlIIlIlIlIlllIIlI, final float lllllllllllllIlIlIIlIlIlIlllIIIl, final int lllllllllllllIlIlIIlIlIlIlllIIII) {
        int n;
        if (lIllIIlIIlIllII(lllllllllllllIlIlIIlIlIlIlllIlIl.getWorld())) {
            n = TileEntityBannerRenderer.lllllllllllII[1];
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            n = TileEntityBannerRenderer.lllllllllllII[0];
        }
        final boolean lllllllllllllIlIlIIlIlIlIllIllll = n != 0;
        int n2;
        if (lIllIIlIIlIllIl(lllllllllllllIlIlIIlIlIlIllIllll ? 1 : 0) && lIllIIlIIlIlllI(lllllllllllllIlIlIIlIlIlIlllIlIl.getBlockType(), Blocks.standing_banner)) {
            n2 = TileEntityBannerRenderer.lllllllllllII[0];
            "".length();
            if ("  ".length() <= ((0x77 ^ 0x1F ^ (0xD9 ^ 0x9C)) & (0xEB ^ 0xB4 ^ (0x42 ^ 0x30) ^ -" ".length()))) {
                return;
            }
        }
        else {
            n2 = TileEntityBannerRenderer.lllllllllllII[1];
        }
        final boolean lllllllllllllIlIlIIlIlIlIllIlllI = n2 != 0;
        int blockMetadata;
        if (lIllIIlIIlIllIl(lllllllllllllIlIlIIlIlIlIllIllll ? 1 : 0)) {
            blockMetadata = lllllllllllllIlIlIIlIlIlIlllIlIl.getBlockMetadata();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            blockMetadata = TileEntityBannerRenderer.lllllllllllII[0];
        }
        final int lllllllllllllIlIlIIlIlIlIllIllIl = blockMetadata;
        long totalWorldTime;
        if (lIllIIlIIlIllIl(lllllllllllllIlIlIIlIlIlIllIllll ? 1 : 0)) {
            totalWorldTime = lllllllllllllIlIlIIlIlIlIlllIlIl.getWorld().getTotalWorldTime();
            "".length();
            if ((0x5F ^ 0x5B) < (0x84 ^ 0x80)) {
                return;
            }
        }
        else {
            totalWorldTime = 0L;
        }
        final long lllllllllllllIlIlIIlIlIlIllIllII = totalWorldTime;
        GlStateManager.pushMatrix();
        final float lllllllllllllIlIlIIlIlIlIllIlIll = 0.6666667f;
        if (lIllIIlIIlIllIl(lllllllllllllIlIlIIlIlIlIllIlllI ? 1 : 0)) {
            GlStateManager.translate((float)lllllllllllllIlIlIIlIlIlIllIIIll + 0.5f, (float)lllllllllllllIlIlIIlIlIlIllIIIlI + 0.75f * lllllllllllllIlIlIIlIlIlIllIlIll, (float)lllllllllllllIlIlIIlIlIlIlllIIlI + 0.5f);
            final float lllllllllllllIlIlIIlIlIlIllIlIlI = lllllllllllllIlIlIIlIlIlIllIllIl * TileEntityBannerRenderer.lllllllllllII[2] / 16.0f;
            GlStateManager.rotate(-lllllllllllllIlIlIIlIlIlIllIlIlI, 0.0f, 1.0f, 0.0f);
            this.bannerModel.bannerStand.showModel = (TileEntityBannerRenderer.lllllllllllII[1] != 0);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            float lllllllllllllIlIlIIlIlIlIllIlIIl = 0.0f;
            if (lIllIIlIIlIllll(lllllllllllllIlIlIIlIlIlIllIllIl, TileEntityBannerRenderer.lllllllllllII[3])) {
                lllllllllllllIlIlIIlIlIlIllIlIIl = 180.0f;
            }
            if (lIllIIlIIlIllll(lllllllllllllIlIlIIlIlIlIllIllIl, TileEntityBannerRenderer.lllllllllllII[4])) {
                lllllllllllllIlIlIIlIlIlIllIlIIl = 90.0f;
            }
            if (lIllIIlIIlIllll(lllllllllllllIlIlIIlIlIlIllIllIl, TileEntityBannerRenderer.lllllllllllII[5])) {
                lllllllllllllIlIlIIlIlIlIllIlIIl = -90.0f;
            }
            GlStateManager.translate((float)lllllllllllllIlIlIIlIlIlIllIIIll + 0.5f, (float)lllllllllllllIlIlIIlIlIlIllIIIlI - 0.25f * lllllllllllllIlIlIIlIlIlIllIlIll, (float)lllllllllllllIlIlIIlIlIlIlllIIlI + 0.5f);
            GlStateManager.rotate(-lllllllllllllIlIlIIlIlIlIllIlIIl, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(0.0f, -0.3125f, -0.4375f);
            this.bannerModel.bannerStand.showModel = (TileEntityBannerRenderer.lllllllllllII[0] != 0);
        }
        final BlockPos lllllllllllllIlIlIIlIlIlIllIlIII = lllllllllllllIlIlIIlIlIlIlllIlIl.getPos();
        final float lllllllllllllIlIlIIlIlIlIllIIlll = lllllllllllllIlIlIIlIlIlIllIlIII.getX() * TileEntityBannerRenderer.lllllllllllII[6] + lllllllllllllIlIlIIlIlIlIllIlIII.getY() * TileEntityBannerRenderer.lllllllllllII[7] + lllllllllllllIlIlIIlIlIlIllIlIII.getZ() * TileEntityBannerRenderer.lllllllllllII[8] + (float)lllllllllllllIlIlIIlIlIlIllIllII + lllllllllllllIlIlIIlIlIlIlllIIIl;
        this.bannerModel.bannerSlate.rotateAngleX = (-0.0125f + 0.01f * MathHelper.cos(lllllllllllllIlIlIIlIlIlIllIIlll * 3.1415927f * 0.02f)) * 3.1415927f;
        GlStateManager.enableRescaleNormal();
        final ResourceLocation lllllllllllllIlIlIIlIlIlIllIIllI = this.func_178463_a(lllllllllllllIlIlIIlIlIlIlllIlIl);
        if (lIllIIlIIlIllII(lllllllllllllIlIlIIlIlIlIllIIllI)) {
            this.bindTexture(lllllllllllllIlIlIIlIlIlIllIIllI);
            GlStateManager.pushMatrix();
            GlStateManager.scale(lllllllllllllIlIlIIlIlIlIllIlIll, -lllllllllllllIlIlIIlIlIlIllIlIll, -lllllllllllllIlIlIIlIlIlIllIlIll);
            this.bannerModel.renderBanner();
            GlStateManager.popMatrix();
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }
    
    private static boolean lIllIIlIIllIIlI(final int lllllllllllllIlIlIIlIlIlIIIllIlI, final int lllllllllllllIlIlIIlIlIlIIIllIIl) {
        return lllllllllllllIlIlIIlIlIlIIIllIlI >= lllllllllllllIlIlIIlIlIlIIIllIIl;
    }
    
    private static String lIllIIlIIlIlIIl(final String lllllllllllllIlIlIIlIlIlIIlIIllI, final String lllllllllllllIlIlIIlIlIlIIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIlIlIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIlIlIIlIIIll.getBytes(StandardCharsets.UTF_8)), TileEntityBannerRenderer.lllllllllllII[11]), "DES");
            final Cipher lllllllllllllIlIlIIlIlIlIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIlIlIIlIlIII.init(TileEntityBannerRenderer.lllllllllllII[3], lllllllllllllIlIlIIlIlIlIIlIlIIl);
            return new String(lllllllllllllIlIlIIlIlIlIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIlIlIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIlIlIIlIIlll) {
            lllllllllllllIlIlIIlIlIlIIlIIlll.printStackTrace();
            return null;
        }
    }
    
    static class TimedBannerTexture
    {
        public /* synthetic */ ResourceLocation bannerTexture;
        public /* synthetic */ long systemTime;
        
        private TimedBannerTexture() {
        }
    }
}
