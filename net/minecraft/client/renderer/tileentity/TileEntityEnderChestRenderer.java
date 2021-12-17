// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.tileentity.TileEntity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelChest;
import net.minecraft.tileentity.TileEntityEnderChest;

public class TileEntityEnderChestRenderer extends TileEntitySpecialRenderer<TileEntityEnderChest>
{
    private /* synthetic */ ModelChest field_147521_c;
    private static final /* synthetic */ String[] llIllIIlIlllll;
    private static final /* synthetic */ int[] llIllIIllIIIlI;
    private static final /* synthetic */ ResourceLocation ENDER_CHEST_TEXTURE;
    
    private static void lIIlIlllIIIIlllI() {
        (llIllIIlIlllll = new String[TileEntityEnderChestRenderer.llIllIIllIIIlI[10]])[TileEntityEnderChestRenderer.llIllIIllIIIlI[0]] = lIIlIlllIIIIllIl("4TkGJMGC6OlsjXyp2nSiMObyHy4BMCPB7s24Xd+mphs=", "gAKSI");
    }
    
    private static String lIIlIlllIIIIllIl(final String llllllllllllIllIIllllIIIllIIlIII, final String llllllllllllIllIIllllIIIllIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIIIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), TileEntityEnderChestRenderer.llIllIIllIIIlI[11]), "DES");
            final Cipher llllllllllllIllIIllllIIIllIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllIIllllIIIllIIlIlI.init(TileEntityEnderChestRenderer.llIllIIllIIIlI[3], llllllllllllIllIIllllIIIllIIlIll);
            return new String(llllllllllllIllIIllllIIIllIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIIIllIIlIIl) {
            llllllllllllIllIIllllIIIllIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIlllIIIllIll() {
        (llIllIIllIIIlI = new int[12])[0] = ((0x69 ^ 0x56) & ~(0xAE ^ 0x91));
        TileEntityEnderChestRenderer.llIllIIllIIIlI[1] = (-(99 + 19 - 24 + 43) & (0xFFFF97AF & 0x7FDA));
        TileEntityEnderChestRenderer.llIllIIllIIIlI[2] = (-(0xFFFFFCEF & 0x6B7F) & (0xFFFFFFEE & 0x7F7F));
        TileEntityEnderChestRenderer.llIllIIllIIIlI[3] = "  ".length();
        TileEntityEnderChestRenderer.llIllIIllIIIlI[4] = (0x88 ^ 0x84) + (0x20 ^ 0x62) - -(0x94 ^ 0xAF) + (0x80 ^ 0xAB);
        TileEntityEnderChestRenderer.llIllIIllIIIlI[5] = "   ".length();
        TileEntityEnderChestRenderer.llIllIIllIIIlI[6] = (12 + 101 - 31 + 54 ^ 69 + 109 - 61 + 23);
        TileEntityEnderChestRenderer.llIllIIllIIIlI[7] = (0x2E ^ 0x7A ^ (0x97 ^ 0x99));
        TileEntityEnderChestRenderer.llIllIIllIIIlI[8] = (0x6B ^ 0x41 ^ (0x94 ^ 0xBB));
        TileEntityEnderChestRenderer.llIllIIllIIIlI[9] = -(0xD7 ^ 0x8D);
        TileEntityEnderChestRenderer.llIllIIllIIIlI[10] = " ".length();
        TileEntityEnderChestRenderer.llIllIIllIIIlI[11] = (0xC9 ^ 0xC1);
    }
    
    private static boolean lIIlIlllIIIlllII(final int llllllllllllIllIIllllIIIlIllllIl) {
        return llllllllllllIllIIllllIIIlIllllIl != 0;
    }
    
    public TileEntityEnderChestRenderer() {
        this.field_147521_c = new ModelChest();
    }
    
    static {
        lIIlIlllIIIllIll();
        lIIlIlllIIIIlllI();
        ENDER_CHEST_TEXTURE = new ResourceLocation(TileEntityEnderChestRenderer.llIllIIlIlllll[TileEntityEnderChestRenderer.llIllIIllIIIlI[0]]);
    }
    
    @Override
    public void renderTileEntityAt(final TileEntityEnderChest llllllllllllIllIIllllIIIllllIIII, final double llllllllllllIllIIllllIIIlllIllll, final double llllllllllllIllIIllllIIIlllIIlII, final double llllllllllllIllIIllllIIIlllIllIl, final float llllllllllllIllIIllllIIIlllIllII, final int llllllllllllIllIIllllIIIlllIlIll) {
        int llllllllllllIllIIllllIIIlllIlIlI = TileEntityEnderChestRenderer.llIllIIllIIIlI[0];
        if (lIIlIlllIIIlllII(llllllllllllIllIIllllIIIllllIIII.hasWorldObj() ? 1 : 0)) {
            llllllllllllIllIIllllIIIlllIlIlI = llllllllllllIllIIllllIIIllllIIII.getBlockMetadata();
        }
        if (lIIlIlllIIIlllIl(llllllllllllIllIIllllIIIlllIlIll)) {
            this.bindTexture(TileEntityEnderChestRenderer.DESTROY_STAGES[llllllllllllIllIIllllIIIlllIlIll]);
            GlStateManager.matrixMode(TileEntityEnderChestRenderer.llIllIIllIIIlI[1]);
            GlStateManager.pushMatrix();
            GlStateManager.scale(4.0f, 4.0f, 1.0f);
            GlStateManager.translate(0.0625f, 0.0625f, 0.0625f);
            GlStateManager.matrixMode(TileEntityEnderChestRenderer.llIllIIllIIIlI[2]);
            "".length();
            if (((0x90 ^ 0xB5 ^ (0x55 ^ 0x4A)) & (0x0 ^ 0x1D ^ (0x86 ^ 0xA1) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.bindTexture(TileEntityEnderChestRenderer.ENDER_CHEST_TEXTURE);
        }
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.translate((float)llllllllllllIllIIllllIIIlllIllll, (float)llllllllllllIllIIllllIIIlllIIlII + 1.0f, (float)llllllllllllIllIIllllIIIlllIllIl + 1.0f);
        GlStateManager.scale(1.0f, -1.0f, -1.0f);
        GlStateManager.translate(0.5f, 0.5f, 0.5f);
        int llllllllllllIllIIllllIIIlllIlIIl = TileEntityEnderChestRenderer.llIllIIllIIIlI[0];
        if (lIIlIlllIIIllllI(llllllllllllIllIIllllIIIlllIlIlI, TileEntityEnderChestRenderer.llIllIIllIIIlI[3])) {
            llllllllllllIllIIllllIIIlllIlIIl = TileEntityEnderChestRenderer.llIllIIllIIIlI[4];
        }
        if (lIIlIlllIIIllllI(llllllllllllIllIIllllIIIlllIlIlI, TileEntityEnderChestRenderer.llIllIIllIIIlI[5])) {
            llllllllllllIllIIllllIIIlllIlIIl = TileEntityEnderChestRenderer.llIllIIllIIIlI[0];
        }
        if (lIIlIlllIIIllllI(llllllllllllIllIIllllIIIlllIlIlI, TileEntityEnderChestRenderer.llIllIIllIIIlI[6])) {
            llllllllllllIllIIllllIIIlllIlIIl = TileEntityEnderChestRenderer.llIllIIllIIIlI[7];
        }
        if (lIIlIlllIIIllllI(llllllllllllIllIIllllIIIlllIlIlI, TileEntityEnderChestRenderer.llIllIIllIIIlI[8])) {
            llllllllllllIllIIllllIIIlllIlIIl = TileEntityEnderChestRenderer.llIllIIllIIIlI[9];
        }
        GlStateManager.rotate((float)llllllllllllIllIIllllIIIlllIlIIl, 0.0f, 1.0f, 0.0f);
        GlStateManager.translate(-0.5f, -0.5f, -0.5f);
        float llllllllllllIllIIllllIIIlllIlIII = llllllllllllIllIIllllIIIllllIIII.prevLidAngle + (llllllllllllIllIIllllIIIllllIIII.lidAngle - llllllllllllIllIIllllIIIllllIIII.prevLidAngle) * llllllllllllIllIIllllIIIlllIllII;
        llllllllllllIllIIllllIIIlllIlIII = 1.0f - llllllllllllIllIIllllIIIlllIlIII;
        llllllllllllIllIIllllIIIlllIlIII = 1.0f - llllllllllllIllIIllllIIIlllIlIII * llllllllllllIllIIllllIIIlllIlIII * llllllllllllIllIIllllIIIlllIlIII;
        this.field_147521_c.chestLid.rotateAngleX = -(llllllllllllIllIIllllIIIlllIlIII * 3.1415927f / 2.0f);
        this.field_147521_c.renderAll();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        if (lIIlIlllIIIlllIl(llllllllllllIllIIllllIIIlllIlIll)) {
            GlStateManager.matrixMode(TileEntityEnderChestRenderer.llIllIIllIIIlI[1]);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(TileEntityEnderChestRenderer.llIllIIllIIIlI[2]);
        }
    }
    
    private static boolean lIIlIlllIIIllllI(final int llllllllllllIllIIllllIIIllIIIIII, final int llllllllllllIllIIllllIIIlIllllll) {
        return llllllllllllIllIIllllIIIllIIIIII == llllllllllllIllIIllllIIIlIllllll;
    }
    
    private static boolean lIIlIlllIIIlllIl(final int llllllllllllIllIIllllIIIlIlllIll) {
        return llllllllllllIllIIllllIIIlIlllIll >= 0;
    }
}
