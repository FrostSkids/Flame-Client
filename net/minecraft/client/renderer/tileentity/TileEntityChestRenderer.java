// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import java.util.Calendar;
import net.minecraft.client.model.ModelLargeChest;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.model.ModelChest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntityChest;

public class TileEntityChestRenderer extends TileEntitySpecialRenderer<TileEntityChest>
{
    private static final /* synthetic */ ResourceLocation textureChristmasDouble;
    private /* synthetic */ ModelChest largeChest;
    private static final /* synthetic */ String[] llllllIllIllI;
    private static final /* synthetic */ ResourceLocation textureTrapped;
    private /* synthetic */ boolean isChristams;
    private /* synthetic */ ModelChest simpleChest;
    private static final /* synthetic */ ResourceLocation textureNormal;
    private static final /* synthetic */ ResourceLocation textureTrappedDouble;
    private static final /* synthetic */ int[] llllllIllIlll;
    private static final /* synthetic */ ResourceLocation textureChristmas;
    private static final /* synthetic */ ResourceLocation textureNormalDouble;
    
    static {
        lIllIIIIIllIIll();
        lIllIIIIIllIIlI();
        textureTrappedDouble = new ResourceLocation(TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[0]]);
        textureChristmasDouble = new ResourceLocation(TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[1]]);
        textureNormalDouble = new ResourceLocation(TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[2]]);
        textureTrapped = new ResourceLocation(TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[3]]);
        textureChristmas = new ResourceLocation(TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[4]]);
        textureNormal = new ResourceLocation(TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[5]]);
    }
    
    @Override
    public void renderTileEntityAt(final TileEntityChest lllllllllllllIlIlIlIIlllIIIlIIIl, final double lllllllllllllIlIlIlIIlllIIlIIIII, final double lllllllllllllIlIlIlIIlllIIIlllll, final double lllllllllllllIlIlIlIIlllIIIllllI, final float lllllllllllllIlIlIlIIlllIIIlllIl, final int lllllllllllllIlIlIlIIlllIIIlllII) {
        GlStateManager.enableDepth();
        GlStateManager.depthFunc(TileEntityChestRenderer.llllllIllIlll[9]);
        GlStateManager.depthMask((boolean)(TileEntityChestRenderer.llllllIllIlll[1] != 0));
        int lllllllllllllIlIlIlIIlllIIIllIlI = 0;
        if (lIllIIIIIlllIII(lllllllllllllIlIlIlIIlllIIIlIIIl.hasWorldObj() ? 1 : 0)) {
            final int lllllllllllllIlIlIlIIlllIIIllIll = TileEntityChestRenderer.llllllIllIlll[0];
            "".length();
            if ((53 + 98 - 49 + 52 ^ 60 + 108 - 66 + 56) <= 0) {
                return;
            }
        }
        else {
            final Block lllllllllllllIlIlIlIIlllIIIllIIl = lllllllllllllIlIlIlIIlllIIIlIIIl.getBlockType();
            lllllllllllllIlIlIlIIlllIIIllIlI = lllllllllllllIlIlIlIIlllIIIlIIIl.getBlockMetadata();
            if (lIllIIIIIlllIIl((lllllllllllllIlIlIlIIlllIIIllIIl instanceof BlockChest) ? 1 : 0) && lIllIIIIIlllIII(lllllllllllllIlIlIlIIlllIIIllIlI)) {
                ((BlockChest)lllllllllllllIlIlIlIIlllIIIllIIl).checkForSurroundingChests(lllllllllllllIlIlIlIIlllIIIlIIIl.getWorld(), lllllllllllllIlIlIlIIlllIIIlIIIl.getPos(), lllllllllllllIlIlIlIIlllIIIlIIIl.getWorld().getBlockState(lllllllllllllIlIlIlIIlllIIIlIIIl.getPos()));
                "".length();
                lllllllllllllIlIlIlIIlllIIIllIlI = lllllllllllllIlIlIlIIlllIIIlIIIl.getBlockMetadata();
            }
            lllllllllllllIlIlIlIIlllIIIlIIIl.checkForAdjacentChests();
        }
        if (lIllIIIIIlllIlI(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestZNeg) && lIllIIIIIlllIlI(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestXNeg)) {
            ModelChest lllllllllllllIlIlIlIIlllIIIlIlll = null;
            if (lIllIIIIIlllIlI(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestXPos) && lIllIIIIIlllIlI(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestZPos)) {
                final ModelChest lllllllllllllIlIlIlIIlllIIIllIII = this.simpleChest;
                if (lIllIIIIIlllIll(lllllllllllllIlIlIlIIlllIIIlllII)) {
                    this.bindTexture(TileEntityChestRenderer.DESTROY_STAGES[lllllllllllllIlIlIlIIlllIIIlllII]);
                    GlStateManager.matrixMode(TileEntityChestRenderer.llllllIllIlll[10]);
                    GlStateManager.pushMatrix();
                    GlStateManager.scale(4.0f, 4.0f, 1.0f);
                    GlStateManager.translate(0.0625f, 0.0625f, 0.0625f);
                    GlStateManager.matrixMode(TileEntityChestRenderer.llllllIllIlll[11]);
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                else if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIlIIIl.getChestType(), TileEntityChestRenderer.llllllIllIlll[1])) {
                    this.bindTexture(TileEntityChestRenderer.textureTrapped);
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                else if (lIllIIIIIlllIIl(this.isChristams ? 1 : 0)) {
                    this.bindTexture(TileEntityChestRenderer.textureChristmas);
                    "".length();
                    if (((0x37 ^ 0x53 ^ (0x53 ^ 0x3F)) & (6 + 46 - 26 + 102 ^ 90 + 105 - 120 + 61 ^ -" ".length())) >= (63 + 120 - 104 + 54 ^ 27 + 56 - 15 + 61)) {
                        return;
                    }
                }
                else {
                    this.bindTexture(TileEntityChestRenderer.textureNormal);
                    "".length();
                    if ((0xAC ^ 0xA8) != (0x51 ^ 0x55)) {
                        return;
                    }
                }
            }
            else {
                lllllllllllllIlIlIlIIlllIIIlIlll = this.largeChest;
                if (lIllIIIIIlllIll(lllllllllllllIlIlIlIIlllIIIlllII)) {
                    this.bindTexture(TileEntityChestRenderer.DESTROY_STAGES[lllllllllllllIlIlIlIIlllIIIlllII]);
                    GlStateManager.matrixMode(TileEntityChestRenderer.llllllIllIlll[10]);
                    GlStateManager.pushMatrix();
                    GlStateManager.scale(8.0f, 4.0f, 1.0f);
                    GlStateManager.translate(0.0625f, 0.0625f, 0.0625f);
                    GlStateManager.matrixMode(TileEntityChestRenderer.llllllIllIlll[11]);
                    "".length();
                    if (((0x1F ^ 0x8) & ~(0x81 ^ 0x96)) <= -" ".length()) {
                        return;
                    }
                }
                else if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIlIIIl.getChestType(), TileEntityChestRenderer.llllllIllIlll[1])) {
                    this.bindTexture(TileEntityChestRenderer.textureTrappedDouble);
                    "".length();
                    if (((0x7D ^ 0x38) & ~(0x36 ^ 0x73)) < 0) {
                        return;
                    }
                }
                else if (lIllIIIIIlllIIl(this.isChristams ? 1 : 0)) {
                    this.bindTexture(TileEntityChestRenderer.textureChristmasDouble);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.bindTexture(TileEntityChestRenderer.textureNormalDouble);
                }
            }
            GlStateManager.pushMatrix();
            GlStateManager.enableRescaleNormal();
            if (lIllIIIIIllllII(lllllllllllllIlIlIlIIlllIIIlllII)) {
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            }
            GlStateManager.translate((float)lllllllllllllIlIlIlIIlllIIlIIIII, (float)lllllllllllllIlIlIlIIlllIIIlllll + 1.0f, (float)lllllllllllllIlIlIlIIlllIIIllllI + 1.0f);
            GlStateManager.scale(1.0f, -1.0f, -1.0f);
            GlStateManager.translate(0.5f, 0.5f, 0.5f);
            int lllllllllllllIlIlIlIIlllIIIlIllI = TileEntityChestRenderer.llllllIllIlll[0];
            if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIllIlI, TileEntityChestRenderer.llllllIllIlll[2])) {
                lllllllllllllIlIlIlIIlllIIIlIllI = TileEntityChestRenderer.llllllIllIlll[12];
            }
            if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIllIlI, TileEntityChestRenderer.llllllIllIlll[3])) {
                lllllllllllllIlIlIlIIlllIIIlIllI = TileEntityChestRenderer.llllllIllIlll[0];
            }
            if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIllIlI, TileEntityChestRenderer.llllllIllIlll[4])) {
                lllllllllllllIlIlIlIIlllIIIlIllI = TileEntityChestRenderer.llllllIllIlll[13];
            }
            if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIllIlI, TileEntityChestRenderer.llllllIllIlll[5])) {
                lllllllllllllIlIlIlIIlllIIIlIllI = TileEntityChestRenderer.llllllIllIlll[14];
            }
            if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIllIlI, TileEntityChestRenderer.llllllIllIlll[2]) && lIllIIIIIllllIl(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestXPos)) {
                GlStateManager.translate(1.0f, 0.0f, 0.0f);
            }
            if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIIllIlI, TileEntityChestRenderer.llllllIllIlll[5]) && lIllIIIIIllllIl(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestZPos)) {
                GlStateManager.translate(0.0f, 0.0f, -1.0f);
            }
            GlStateManager.rotate((float)lllllllllllllIlIlIlIIlllIIIlIllI, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(-0.5f, -0.5f, -0.5f);
            float lllllllllllllIlIlIlIIlllIIIlIlIl = lllllllllllllIlIlIlIIlllIIIlIIIl.prevLidAngle + (lllllllllllllIlIlIlIIlllIIIlIIIl.lidAngle - lllllllllllllIlIlIlIIlllIIIlIIIl.prevLidAngle) * lllllllllllllIlIlIlIIlllIIIlllIl;
            if (lIllIIIIIllllIl(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestZNeg)) {
                final float lllllllllllllIlIlIlIIlllIIIlIlII = lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestZNeg.prevLidAngle + (lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestZNeg.lidAngle - lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestZNeg.prevLidAngle) * lllllllllllllIlIlIlIIlllIIIlllIl;
                if (lIllIIIIIlllllI(lIllIIIIIllIlll(lllllllllllllIlIlIlIIlllIIIlIlII, lllllllllllllIlIlIlIIlllIIIlIlIl))) {
                    lllllllllllllIlIlIlIIlllIIIlIlIl = lllllllllllllIlIlIlIIlllIIIlIlII;
                }
            }
            if (lIllIIIIIllllIl(lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestXNeg)) {
                final float lllllllllllllIlIlIlIIlllIIIlIIll = lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestXNeg.prevLidAngle + (lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestXNeg.lidAngle - lllllllllllllIlIlIlIIlllIIIlIIIl.adjacentChestXNeg.prevLidAngle) * lllllllllllllIlIlIlIIlllIIIlllIl;
                if (lIllIIIIIlllllI(lIllIIIIIllIlll(lllllllllllllIlIlIlIIlllIIIlIIll, lllllllllllllIlIlIlIIlllIIIlIlIl))) {
                    lllllllllllllIlIlIlIIlllIIIlIlIl = lllllllllllllIlIlIlIIlllIIIlIIll;
                }
            }
            lllllllllllllIlIlIlIIlllIIIlIlIl = 1.0f - lllllllllllllIlIlIlIIlllIIIlIlIl;
            lllllllllllllIlIlIlIIlllIIIlIlIl = 1.0f - lllllllllllllIlIlIlIIlllIIIlIlIl * lllllllllllllIlIlIlIIlllIIIlIlIl * lllllllllllllIlIlIlIIlllIIIlIlIl;
            lllllllllllllIlIlIlIIlllIIIlIlll.chestLid.rotateAngleX = -(lllllllllllllIlIlIlIIlllIIIlIlIl * 3.1415927f / 2.0f);
            lllllllllllllIlIlIlIIlllIIIlIlll.renderAll();
            GlStateManager.disableRescaleNormal();
            GlStateManager.popMatrix();
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            if (lIllIIIIIlllIll(lllllllllllllIlIlIlIIlllIIIlllII)) {
                GlStateManager.matrixMode(TileEntityChestRenderer.llllllIllIlll[10]);
                GlStateManager.popMatrix();
                GlStateManager.matrixMode(TileEntityChestRenderer.llllllIllIlll[11]);
            }
        }
    }
    
    private static boolean lIllIIIIIlllIII(final int lllllllllllllIlIlIlIIllIlIlIllll) {
        return lllllllllllllIlIlIlIIllIlIlIllll == 0;
    }
    
    private static int lIllIIIIIllIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIllIIIIIllIIII(final String lllllllllllllIlIlIlIIllIllIIllII, final String lllllllllllllIlIlIlIIllIllIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIllIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIIllIllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIIllIllIIlllI.init(TileEntityChestRenderer.llllllIllIlll[2], lllllllllllllIlIlIlIIllIllIIllll);
            return new String(lllllllllllllIlIlIlIIllIllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIllIllIIllIl) {
            lllllllllllllIlIlIlIIllIllIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIIIIIllIIlI() {
        (llllllIllIllI = new String[TileEntityChestRenderer.llllllIllIlll[15]])[TileEntityChestRenderer.llllllIllIlll[0]] = lIllIIIIIlIllll("EQYSHxgXBhlECAsXAx8USgACDh4RTB4ZDBUTDw8yAQwfCQEATRoFCg==", "ecjkm");
        TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[1]] = lIllIIIIIllIIII("7BKFOT9ZIeNtDByq0P0tfQjiI+1wfV2gi/n2Ap6F8Vzb2nC4CFCRo471sY3Bkk93", "zYsXB");
        TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[2]] = lIllIIIIIlIllll("EhIeMhcUEhVpBwgDDzIbSRQOIxESWAgpEAsWChkGCQIEKgdIBwgh", "fwfFb");
        TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[3]] = lIllIIIIIllIIIl("ugwFz/0i5/UOP0N9DenKo4OpdvHbd4HkNEVhMLmO0XQpTPy+s2i8IA==", "JbTNl");
        TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[4]] = lIllIIIIIlIllll("AA8rJBcGDyB/BxoeOiQbWwk7NREARTA4EB0ZJz0DB0QjPgU=", "tjSPb");
        TileEntityChestRenderer.llllllIllIllI[TileEntityChestRenderer.llllllIllIlll[5]] = lIllIIIIIlIllll("JAksByIiCSdcMj4YPQcufw88FiQkQzocJT0NOF0nPgs=", "PlTsW");
    }
    
    private static boolean lIllIIIIIllllII(final int lllllllllllllIlIlIlIIllIlIlIlIll) {
        return lllllllllllllIlIlIlIIllIlIlIlIll < 0;
    }
    
    private static boolean lIllIIIIIlllIll(final int lllllllllllllIlIlIlIIllIlIlIllIl) {
        return lllllllllllllIlIlIlIIllIlIlIllIl >= 0;
    }
    
    private static boolean lIllIIIIIlllllI(final int lllllllllllllIlIlIlIIllIlIlIlIIl) {
        return lllllllllllllIlIlIlIIllIlIlIlIIl > 0;
    }
    
    private static boolean lIllIIIIIllllIl(final Object lllllllllllllIlIlIlIIllIlIllIlIl) {
        return lllllllllllllIlIlIlIIllIlIllIlIl != null;
    }
    
    private static boolean lIllIIIIIllllll(final int lllllllllllllIlIlIlIIllIlIllllII, final int lllllllllllllIlIlIlIIllIlIlllIll) {
        return lllllllllllllIlIlIlIIllIlIllllII < lllllllllllllIlIlIlIIllIlIlllIll;
    }
    
    private static boolean lIllIIIIIlllIIl(final int lllllllllllllIlIlIlIIllIlIllIIIl) {
        return lllllllllllllIlIlIlIIllIlIllIIIl != 0;
    }
    
    private static String lIllIIIIIllIIIl(final String lllllllllllllIlIlIlIIllIllIlIlll, final String lllllllllllllIlIlIlIIllIllIllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIllIllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIllIllIllIII.getBytes(StandardCharsets.UTF_8)), TileEntityChestRenderer.llllllIllIlll[16]), "DES");
            final Cipher lllllllllllllIlIlIlIIllIllIllIll = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIIllIllIllIll.init(TileEntityChestRenderer.llllllIllIlll[2], lllllllllllllIlIlIlIIllIllIlllII);
            return new String(lllllllllllllIlIlIlIIllIllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIllIllIllIlI) {
            lllllllllllllIlIlIlIIllIllIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIIIIIlIllll(String lllllllllllllIlIlIlIIllIlllIlIIl, final String lllllllllllllIlIlIlIIllIlllIlIII) {
        lllllllllllllIlIlIlIIllIlllIlIIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIlIIllIlllIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIIllIlllIllII = new StringBuilder();
        final char[] lllllllllllllIlIlIlIIllIlllIlIll = lllllllllllllIlIlIlIIllIlllIlIII.toCharArray();
        int lllllllllllllIlIlIlIIllIlllIlIlI = TileEntityChestRenderer.llllllIllIlll[0];
        final long lllllllllllllIlIlIlIIllIlllIIlII = (Object)((String)lllllllllllllIlIlIlIIllIlllIlIIl).toCharArray();
        final float lllllllllllllIlIlIlIIllIlllIIIll = lllllllllllllIlIlIlIIllIlllIIlII.length;
        boolean lllllllllllllIlIlIlIIllIlllIIIlI = TileEntityChestRenderer.llllllIllIlll[0] != 0;
        while (lIllIIIIIllllll(lllllllllllllIlIlIlIIllIlllIIIlI ? 1 : 0, (int)lllllllllllllIlIlIlIIllIlllIIIll)) {
            final char lllllllllllllIlIlIlIIllIlllIllll = lllllllllllllIlIlIlIIllIlllIIlII[lllllllllllllIlIlIlIIllIlllIIIlI];
            lllllllllllllIlIlIlIIllIlllIllII.append((char)(lllllllllllllIlIlIlIIllIlllIllll ^ lllllllllllllIlIlIlIIllIlllIlIll[lllllllllllllIlIlIlIIllIlllIlIlI % lllllllllllllIlIlIlIIllIlllIlIll.length]));
            "".length();
            ++lllllllllllllIlIlIlIIllIlllIlIlI;
            ++lllllllllllllIlIlIlIIllIlllIIIlI;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIIllIlllIllII);
    }
    
    private static boolean lIllIIIIIlllIlI(final Object lllllllllllllIlIlIlIIllIlIllIIll) {
        return lllllllllllllIlIlIlIIllIlIllIIll == null;
    }
    
    private static boolean lIllIIIIIllIllI(final int lllllllllllllIlIlIlIIllIlIlllIII, final int lllllllllllllIlIlIlIIllIlIllIlll) {
        return lllllllllllllIlIlIlIIllIlIlllIII <= lllllllllllllIlIlIlIIllIlIllIlll;
    }
    
    private static void lIllIIIIIllIIll() {
        (llllllIllIlll = new int[17])[0] = ((231 + 117 - 185 + 74 ^ 164 + 61 - 128 + 74) & (0x3E ^ 0x7F ^ (0x46 ^ 0x41) ^ -" ".length()));
        TileEntityChestRenderer.llllllIllIlll[1] = " ".length();
        TileEntityChestRenderer.llllllIllIlll[2] = "  ".length();
        TileEntityChestRenderer.llllllIllIlll[3] = "   ".length();
        TileEntityChestRenderer.llllllIllIlll[4] = (0x4 ^ 0x0);
        TileEntityChestRenderer.llllllIllIlll[5] = (0xC8 ^ 0x83 ^ (0x1E ^ 0x50));
        TileEntityChestRenderer.llllllIllIlll[6] = (0x4D ^ 0x41);
        TileEntityChestRenderer.llllllIllIlll[7] = (0x0 ^ 0x11 ^ (0xB4 ^ 0xBD));
        TileEntityChestRenderer.llllllIllIlll[8] = (0xB5 ^ 0x8C ^ (0x61 ^ 0x42));
        TileEntityChestRenderer.llllllIllIlll[9] = (-(0xFFFFBDAF & 0x7FF5) & (0xFFFFFFEF & 0x3FB7));
        TileEntityChestRenderer.llllllIllIlll[10] = (0xFFFF97B2 & 0x7F4F);
        TileEntityChestRenderer.llllllIllIlll[11] = (-(0xFFFFE9FD & 0x76DF) & (0xFFFFFFFE & 0x77DD));
        TileEntityChestRenderer.llllllIllIlll[12] = (0x3B ^ 0x45) + "   ".length() - (0xBB ^ 0x9C) + (0xEB ^ 0xB1);
        TileEntityChestRenderer.llllllIllIlll[13] = (0x13 ^ 0x49);
        TileEntityChestRenderer.llllllIllIlll[14] = -(0x40 ^ 0x1A);
        TileEntityChestRenderer.llllllIllIlll[15] = (0xA5 ^ 0xA3);
        TileEntityChestRenderer.llllllIllIlll[16] = (0x14 ^ 0x1C);
    }
    
    public TileEntityChestRenderer() {
        this.simpleChest = new ModelChest();
        this.largeChest = new ModelLargeChest();
        final Calendar lllllllllllllIlIlIlIIlllIIllIIIl = Calendar.getInstance();
        if (lIllIIIIIllIlII(lllllllllllllIlIlIlIIlllIIllIIIl.get(TileEntityChestRenderer.llllllIllIlll[2]) + TileEntityChestRenderer.llllllIllIlll[1], TileEntityChestRenderer.llllllIllIlll[6]) && lIllIIIIIllIlIl(lllllllllllllIlIlIlIIlllIIllIIIl.get(TileEntityChestRenderer.llllllIllIlll[5]), TileEntityChestRenderer.llllllIllIlll[7]) && lIllIIIIIllIllI(lllllllllllllIlIlIlIIlllIIllIIIl.get(TileEntityChestRenderer.llllllIllIlll[5]), TileEntityChestRenderer.llllllIllIlll[8])) {
            this.isChristams = (TileEntityChestRenderer.llllllIllIlll[1] != 0);
        }
    }
    
    private static boolean lIllIIIIIllIlII(final int lllllllllllllIlIlIlIIllIllIIIlII, final int lllllllllllllIlIlIlIIllIllIIIIll) {
        return lllllllllllllIlIlIlIIllIllIIIlII == lllllllllllllIlIlIlIIllIllIIIIll;
    }
    
    private static boolean lIllIIIIIllIlIl(final int lllllllllllllIlIlIlIIllIllIIIIII, final int lllllllllllllIlIlIlIIllIlIllllll) {
        return lllllllllllllIlIlIlIIllIllIIIIII >= lllllllllllllIlIlIlIIllIlIllllll;
    }
}
