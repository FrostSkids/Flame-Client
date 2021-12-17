// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import net.minecraft.util.EnumFacing;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class BlockFluidRenderer
{
    private static final /* synthetic */ int[] llIIIlIllIIIll;
    private static final /* synthetic */ String[] llIIIlIllIIIIl;
    private /* synthetic */ TextureAtlasSprite[] atlasSpritesLava;
    private /* synthetic */ TextureAtlasSprite[] atlasSpritesWater;
    
    private static boolean lIIIlIIllIIIllIl(final int llllllllllllIlllIlIlIllIllIlllll) {
        return llllllllllllIlllIlIlIllIllIlllll == 0;
    }
    
    private static boolean lIIIlIIllIIIlllI(final int llllllllllllIlllIlIlIllIlllIIIIl) {
        return llllllllllllIlllIlIlIllIlllIIIIl != 0;
    }
    
    private static boolean lIIIlIIllIIlIIlI(final int llllllllllllIlllIlIlIllIlllIllII, final int llllllllllllIlllIlIlIllIlllIlIll) {
        return llllllllllllIlllIlIlIllIlllIllII < llllllllllllIlllIlIlIllIlllIlIll;
    }
    
    private static boolean lIIIlIIllIIlIIll(final int llllllllllllIlllIlIlIllIllllIIII, final int llllllllllllIlllIlIlIllIlllIllll) {
        return llllllllllllIlllIlIlIllIllllIIII >= llllllllllllIlllIlIlIllIlllIllll;
    }
    
    private float getFluidHeight(final IBlockAccess llllllllllllIlllIlIlIlllIIlIllll, final BlockPos llllllllllllIlllIlIlIlllIIlIlllI, final Material llllllllllllIlllIlIlIlllIIlIllIl) {
        int llllllllllllIlllIlIlIlllIIlIllII = BlockFluidRenderer.llIIIlIllIIIll[1];
        float llllllllllllIlllIlIlIlllIIlIlIll = 0.0f;
        int llllllllllllIlllIlIlIlllIIlIlIlI = BlockFluidRenderer.llIIIlIllIIIll[1];
        "".length();
        if ("  ".length() <= 0) {
            return 0.0f;
        }
        while (!lIIIlIIllIIlIIll(llllllllllllIlllIlIlIlllIIlIlIlI, BlockFluidRenderer.llIIIlIllIIIll[7])) {
            final BlockPos llllllllllllIlllIlIlIlllIIlIlIIl = llllllllllllIlllIlIlIlllIIlIlllI.add(-(llllllllllllIlllIlIlIlllIIlIlIlI & BlockFluidRenderer.llIIIlIllIIIll[2]), BlockFluidRenderer.llIIIlIllIIIll[1], -(llllllllllllIlllIlIlIlllIIlIlIlI >> BlockFluidRenderer.llIIIlIllIIIll[2] & BlockFluidRenderer.llIIIlIllIIIll[2]));
            if (lIIIlIIllIIIllII(llllllllllllIlllIlIlIlllIIlIllll.getBlockState(llllllllllllIlllIlIlIlllIIlIlIIl.up()).getBlock().getMaterial(), llllllllllllIlllIlIlIlllIIlIllIl)) {
                return 1.0f;
            }
            final IBlockState llllllllllllIlllIlIlIlllIIlIlIII = llllllllllllIlllIlIlIlllIIlIllll.getBlockState(llllllllllllIlllIlIlIlllIIlIlIIl);
            final Material llllllllllllIlllIlIlIlllIIlIIlll = llllllllllllIlllIlIlIlllIIlIlIII.getBlock().getMaterial();
            if (lIIIlIIllIIlIlII(llllllllllllIlllIlIlIlllIIlIIlll, llllllllllllIlllIlIlIlllIIlIllIl)) {
                if (lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllIIlIIlll.isSolid() ? 1 : 0)) {
                    ++llllllllllllIlllIlIlIlllIIlIlIll;
                    ++llllllllllllIlllIlIlIlllIIlIllII;
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return 0.0f;
                    }
                }
            }
            else {
                final int llllllllllllIlllIlIlIlllIIlIIllI = llllllllllllIlllIlIlIlllIIlIlIII.getValue((IProperty<Integer>)BlockLiquid.LEVEL);
                if (!lIIIlIIllIIlIIlI(llllllllllllIlllIlIlIlllIIlIIllI, BlockFluidRenderer.llIIIlIllIIIll[6]) || lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllIIlIIllI)) {
                    llllllllllllIlllIlIlIlllIIlIlIll += BlockLiquid.getLiquidHeightPercent(llllllllllllIlllIlIlIlllIIlIIllI) * 10.0f;
                    llllllllllllIlllIlIlIlllIIlIllII += 10;
                }
                llllllllllllIlllIlIlIlllIIlIlIll += BlockLiquid.getLiquidHeightPercent(llllllllllllIlllIlIlIlllIIlIIllI);
                ++llllllllllllIlllIlIlIlllIIlIllII;
            }
            ++llllllllllllIlllIlIlIlllIIlIlIlI;
        }
        return 1.0f - llllllllllllIlllIlIlIlllIIlIlIll / llllllllllllIlllIlIlIlllIIlIllII;
    }
    
    static {
        lIIIlIIllIIIlIIl();
        lIIIlIIllIIIIlIl();
    }
    
    private static String lIIIlIIllIIIIlII(final String llllllllllllIlllIlIlIlllIIIlIlII, final String llllllllllllIlllIlIlIlllIIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIlllIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIlllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), BlockFluidRenderer.llIIIlIllIIIll[6]), "DES");
            final Cipher llllllllllllIlllIlIlIlllIIIlIllI = Cipher.getInstance("DES");
            llllllllllllIlllIlIlIlllIIIlIllI.init(BlockFluidRenderer.llIIIlIllIIIll[0], llllllllllllIlllIlIlIlllIIIlIlll);
            return new String(llllllllllllIlllIlIlIlllIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIlllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIlllIIIlIlIl) {
            llllllllllllIlllIlIlIlllIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlIIllIIIIIll(String llllllllllllIlllIlIlIllIllllllll, final String llllllllllllIlllIlIlIlllIIIIIIll) {
        llllllllllllIlllIlIlIllIllllllll = new String(Base64.getDecoder().decode(llllllllllllIlllIlIlIllIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlIlllIIIIIIlI = new StringBuilder();
        final char[] llllllllllllIlllIlIlIlllIIIIIIIl = llllllllllllIlllIlIlIlllIIIIIIll.toCharArray();
        int llllllllllllIlllIlIlIlllIIIIIIII = BlockFluidRenderer.llIIIlIllIIIll[1];
        final byte llllllllllllIlllIlIlIllIlllllIlI = (Object)llllllllllllIlllIlIlIllIllllllll.toCharArray();
        final boolean llllllllllllIlllIlIlIllIlllllIIl = llllllllllllIlllIlIlIllIlllllIlI.length != 0;
        double llllllllllllIlllIlIlIllIlllllIII = BlockFluidRenderer.llIIIlIllIIIll[1];
        while (lIIIlIIllIIlIIlI((int)llllllllllllIlllIlIlIllIlllllIII, llllllllllllIlllIlIlIllIlllllIIl ? 1 : 0)) {
            final char llllllllllllIlllIlIlIlllIIIIIlIl = llllllllllllIlllIlIlIllIlllllIlI[llllllllllllIlllIlIlIllIlllllIII];
            llllllllllllIlllIlIlIlllIIIIIIlI.append((char)(llllllllllllIlllIlIlIlllIIIIIlIl ^ llllllllllllIlllIlIlIlllIIIIIIIl[llllllllllllIlllIlIlIlllIIIIIIII % llllllllllllIlllIlIlIlllIIIIIIIl.length]));
            "".length();
            ++llllllllllllIlllIlIlIlllIIIIIIII;
            ++llllllllllllIlllIlIlIllIlllllIII;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlIlllIIIIIIlI);
    }
    
    private static boolean lIIIlIIllIIIllll(final int llllllllllllIlllIlIlIllIllIllIll) {
        return llllllllllllIlllIlIlIllIllIllIll > 0;
    }
    
    private static int lIIIlIIllIIIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIlIIllIIlIlII(final Object llllllllllllIlllIlIlIllIlllIlIII, final Object llllllllllllIlllIlIlIllIlllIIlll) {
        return llllllllllllIlllIlIlIllIlllIlIII != llllllllllllIlllIlIlIllIlllIIlll;
    }
    
    public boolean renderFluid(final IBlockAccess llllllllllllIlllIlIlIlllIlllIIII, final IBlockState llllllllllllIlllIlIlIlllIllIllll, final BlockPos llllllllllllIlllIlIlIlllllIlIlIl, final WorldRenderer llllllllllllIlllIlIlIlllIllIllIl) {
        final BlockLiquid llllllllllllIlllIlIlIlllllIlIIll = (BlockLiquid)llllllllllllIlllIlIlIlllIllIllll.getBlock();
        llllllllllllIlllIlIlIlllllIlIIll.setBlockBoundsBasedOnState(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl);
        TextureAtlasSprite[] array;
        if (lIIIlIIllIIIllII(llllllllllllIlllIlIlIlllllIlIIll.getMaterial(), Material.lava)) {
            array = this.atlasSpritesLava;
            "".length();
            if ("  ".length() == 0) {
                return ((0x68 ^ 0x3B) & ~(0xCE ^ 0x9D)) != 0x0;
            }
        }
        else {
            array = this.atlasSpritesWater;
        }
        final TextureAtlasSprite[] llllllllllllIlllIlIlIlllllIlIIlI = array;
        final int llllllllllllIlllIlIlIlllllIlIIIl = llllllllllllIlllIlIlIlllllIlIIll.colorMultiplier(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl);
        final float llllllllllllIlllIlIlIlllllIlIIII = (llllllllllllIlllIlIlIlllllIlIIIl >> BlockFluidRenderer.llIIIlIllIIIll[4] & BlockFluidRenderer.llIIIlIllIIIll[5]) / 255.0f;
        final float llllllllllllIlllIlIlIlllllIIllll = (llllllllllllIlllIlIlIlllllIlIIIl >> BlockFluidRenderer.llIIIlIllIIIll[6] & BlockFluidRenderer.llIIIlIllIIIll[5]) / 255.0f;
        final float llllllllllllIlllIlIlIlllllIIlllI = (llllllllllllIlllIlIlIlllllIlIIIl & BlockFluidRenderer.llIIIlIllIIIll[5]) / 255.0f;
        final boolean llllllllllllIlllIlIlIlllllIIllIl = llllllllllllIlllIlIlIlllllIlIIll.shouldSideBeRendered(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.up(), EnumFacing.UP);
        final boolean llllllllllllIlllIlIlIlllllIIllII = llllllllllllIlllIlIlIlllllIlIIll.shouldSideBeRendered(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.down(), EnumFacing.DOWN);
        final boolean[] array2 = new boolean[BlockFluidRenderer.llIIIlIllIIIll[7]];
        array2[BlockFluidRenderer.llIIIlIllIIIll[1]] = llllllllllllIlllIlIlIlllllIlIIll.shouldSideBeRendered(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.north(), EnumFacing.NORTH);
        array2[BlockFluidRenderer.llIIIlIllIIIll[2]] = llllllllllllIlllIlIlIlllllIlIIll.shouldSideBeRendered(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.south(), EnumFacing.SOUTH);
        array2[BlockFluidRenderer.llIIIlIllIIIll[0]] = llllllllllllIlllIlIlIlllllIlIIll.shouldSideBeRendered(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.west(), EnumFacing.WEST);
        array2[BlockFluidRenderer.llIIIlIllIIIll[3]] = llllllllllllIlllIlIlIlllllIlIIll.shouldSideBeRendered(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.east(), EnumFacing.EAST);
        final boolean[] llllllllllllIlllIlIlIlllllIIlIll = array2;
        if (lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllllIIllIl ? 1 : 0) && lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllllIIllII ? 1 : 0) && lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllllIIlIll[BlockFluidRenderer.llIIIlIllIIIll[1]] ? 1 : 0) && lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllllIIlIll[BlockFluidRenderer.llIIIlIllIIIll[2]] ? 1 : 0) && lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllllIIlIll[BlockFluidRenderer.llIIIlIllIIIll[0]] ? 1 : 0) && lIIIlIIllIIIllIl(llllllllllllIlllIlIlIlllllIIlIll[BlockFluidRenderer.llIIIlIllIIIll[3]] ? 1 : 0)) {
            return BlockFluidRenderer.llIIIlIllIIIll[1] != 0;
        }
        boolean llllllllllllIlllIlIlIlllllIIlIlI = BlockFluidRenderer.llIIIlIllIIIll[1] != 0;
        final float llllllllllllIlllIlIlIlllllIIlIIl = 0.5f;
        final float llllllllllllIlllIlIlIlllllIIlIII = 1.0f;
        final float llllllllllllIlllIlIlIlllllIIIlll = 0.8f;
        final float llllllllllllIlllIlIlIlllllIIIllI = 0.6f;
        final Material llllllllllllIlllIlIlIlllllIIIlIl = llllllllllllIlllIlIlIlllllIlIIll.getMaterial();
        float llllllllllllIlllIlIlIlllllIIIlII = this.getFluidHeight(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl, llllllllllllIlllIlIlIlllllIIIlIl);
        float llllllllllllIlllIlIlIlllllIIIIll = this.getFluidHeight(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.south(), llllllllllllIlllIlIlIlllllIIIlIl);
        float llllllllllllIlllIlIlIlllllIIIIlI = this.getFluidHeight(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.east().south(), llllllllllllIlllIlIlIlllllIIIlIl);
        float llllllllllllIlllIlIlIlllllIIIIIl = this.getFluidHeight(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.east(), llllllllllllIlllIlIlIlllllIIIlIl);
        final double llllllllllllIlllIlIlIlllllIIIIII = llllllllllllIlllIlIlIlllllIlIlIl.getX();
        final double llllllllllllIlllIlIlIllllIllllll = llllllllllllIlllIlIlIlllllIlIlIl.getY();
        final double llllllllllllIlllIlIlIllllIlllllI = llllllllllllIlllIlIlIlllllIlIlIl.getZ();
        final float llllllllllllIlllIlIlIllllIllllIl = 0.001f;
        if (lIIIlIIllIIIlllI(llllllllllllIlllIlIlIlllllIIllIl ? 1 : 0)) {
            llllllllllllIlllIlIlIlllllIIlIlI = (BlockFluidRenderer.llIIIlIllIIIll[2] != 0);
            TextureAtlasSprite llllllllllllIlllIlIlIllllIllllII = llllllllllllIlllIlIlIlllllIlIIlI[BlockFluidRenderer.llIIIlIllIIIll[1]];
            final float llllllllllllIlllIlIlIllllIlllIll = (float)BlockLiquid.getFlowDirection(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl, llllllllllllIlllIlIlIlllllIIIlIl);
            if (lIIIlIIllIIIllll(lIIIlIIllIIIlIlI(llllllllllllIlllIlIlIllllIlllIll, -999.0f))) {
                llllllllllllIlllIlIlIllllIllllII = llllllllllllIlllIlIlIlllllIlIIlI[BlockFluidRenderer.llIIIlIllIIIll[2]];
            }
            llllllllllllIlllIlIlIlllllIIIlII -= llllllllllllIlllIlIlIllllIllllIl;
            llllllllllllIlllIlIlIlllllIIIIll -= llllllllllllIlllIlIlIllllIllllIl;
            llllllllllllIlllIlIlIlllllIIIIlI -= llllllllllllIlllIlIlIllllIllllIl;
            llllllllllllIlllIlIlIlllllIIIIIl -= llllllllllllIlllIlIlIllllIllllIl;
            float llllllllllllIlllIlIlIllllIlllIIl = 0.0f;
            float llllllllllllIlllIlIlIllllIllIIIl = 0.0f;
            float llllllllllllIlllIlIlIllllIllIlll = 0.0f;
            float llllllllllllIlllIlIlIllllIlIllll = 0.0f;
            float llllllllllllIlllIlIlIllllIllIlIl = 0.0f;
            float llllllllllllIlllIlIlIllllIlIllIl = 0.0f;
            float llllllllllllIlllIlIlIllllIllIIll = 0.0f;
            float llllllllllllIlllIlIlIllllIlIlIll = 0.0f;
            if (lIIIlIIllIIlIIII(lIIIlIIllIIIlIll(llllllllllllIlllIlIlIllllIlllIll, -999.0f))) {
                final float llllllllllllIlllIlIlIllllIlllIlI = llllllllllllIlllIlIlIllllIllllII.getInterpolatedU(0.0);
                final float llllllllllllIlllIlIlIllllIllIIlI = llllllllllllIlllIlIlIllllIllllII.getInterpolatedV(0.0);
                final float llllllllllllIlllIlIlIllllIlllIII = llllllllllllIlllIlIlIllllIlllIlI;
                final float llllllllllllIlllIlIlIllllIllIIII = llllllllllllIlllIlIlIllllIllllII.getInterpolatedV(16.0);
                final float llllllllllllIlllIlIlIllllIllIllI = llllllllllllIlllIlIlIllllIllllII.getInterpolatedU(16.0);
                final float llllllllllllIlllIlIlIllllIlIlllI = llllllllllllIlllIlIlIllllIllIIII;
                final float llllllllllllIlllIlIlIllllIllIlII = llllllllllllIlllIlIlIllllIllIllI;
                final float llllllllllllIlllIlIlIllllIlIllII = llllllllllllIlllIlIlIllllIllIIlI;
                "".length();
                if (-" ".length() > "  ".length()) {
                    return ((0x54 ^ 0x9) & ~(0x4F ^ 0x12)) != 0x0;
                }
            }
            else {
                final float llllllllllllIlllIlIlIllllIlIlIlI = MathHelper.sin(llllllllllllIlllIlIlIllllIlllIll) * 0.25f;
                final float llllllllllllIlllIlIlIllllIlIlIIl = MathHelper.cos(llllllllllllIlllIlIlIllllIlllIll) * 0.25f;
                final float llllllllllllIlllIlIlIllllIlIlIII = 8.0f;
                llllllllllllIlllIlIlIllllIlllIIl = llllllllllllIlllIlIlIllllIllllII.getInterpolatedU(8.0f + (-llllllllllllIlllIlIlIllllIlIlIIl - llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
                llllllllllllIlllIlIlIllllIllIIIl = llllllllllllIlllIlIlIllllIllllII.getInterpolatedV(8.0f + (-llllllllllllIlllIlIlIllllIlIlIIl + llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
                llllllllllllIlllIlIlIllllIllIlll = llllllllllllIlllIlIlIllllIllllII.getInterpolatedU(8.0f + (-llllllllllllIlllIlIlIllllIlIlIIl + llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
                llllllllllllIlllIlIlIllllIlIllll = llllllllllllIlllIlIlIllllIllllII.getInterpolatedV(8.0f + (llllllllllllIlllIlIlIllllIlIlIIl + llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
                llllllllllllIlllIlIlIllllIllIlIl = llllllllllllIlllIlIlIllllIllllII.getInterpolatedU(8.0f + (llllllllllllIlllIlIlIllllIlIlIIl + llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
                llllllllllllIlllIlIlIllllIlIllIl = llllllllllllIlllIlIlIllllIllllII.getInterpolatedV(8.0f + (llllllllllllIlllIlIlIllllIlIlIIl - llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
                llllllllllllIlllIlIlIllllIllIIll = llllllllllllIlllIlIlIllllIllllII.getInterpolatedU(8.0f + (llllllllllllIlllIlIlIllllIlIlIIl - llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
                llllllllllllIlllIlIlIllllIlIlIll = llllllllllllIlllIlIlIllllIllllII.getInterpolatedV(8.0f + (-llllllllllllIlllIlIlIllllIlIlIIl - llllllllllllIlllIlIlIllllIlIlIlI) * 16.0f);
            }
            final int llllllllllllIlllIlIlIllllIlIIlll = llllllllllllIlllIlIlIlllllIlIIll.getMixedBrightnessForBlock(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl);
            final int llllllllllllIlllIlIlIllllIlIIllI = llllllllllllIlllIlIlIllllIlIIlll >> BlockFluidRenderer.llIIIlIllIIIll[4] & BlockFluidRenderer.llIIIlIllIIIll[8];
            final int llllllllllllIlllIlIlIllllIlIIlIl = llllllllllllIlllIlIlIllllIlIIlll & BlockFluidRenderer.llIIIlIllIIIll[8];
            final float llllllllllllIlllIlIlIllllIlIIlII = llllllllllllIlllIlIlIlllllIIlIII * llllllllllllIlllIlIlIlllllIlIIII;
            final float llllllllllllIlllIlIlIllllIlIIIll = llllllllllllIlllIlIlIlllllIIlIII * llllllllllllIlllIlIlIlllllIIllll;
            final float llllllllllllIlllIlIlIllllIlIIIlI = llllllllllllIlllIlIlIlllllIIlIII * llllllllllllIlllIlIlIlllllIIlllI;
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 0.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIlII, llllllllllllIlllIlIlIllllIlllllI + 0.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIlllIIl, llllllllllllIlllIlIlIllllIllIIIl).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 0.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIIll, llllllllllllIlllIlIlIllllIlllllI + 1.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIllIlll, llllllllllllIlllIlIlIllllIlIllll).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 1.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIIlI, llllllllllllIlllIlIlIllllIlllllI + 1.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIllIlIl, llllllllllllIlllIlIlIllllIlIllIl).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 1.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIIIl, llllllllllllIlllIlIlIllllIlllllI + 0.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIllIIll, llllllllllllIlllIlIlIllllIlIlIll).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
            if (lIIIlIIllIIIlllI(llllllllllllIlllIlIlIlllllIlIIll.func_176364_g(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.up()) ? 1 : 0)) {
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 0.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIlII, llllllllllllIlllIlIlIllllIlllllI + 0.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIlllIIl, llllllllllllIlllIlIlIllllIllIIIl).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 1.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIIIl, llllllllllllIlllIlIlIllllIlllllI + 0.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIllIIll, llllllllllllIlllIlIlIllllIlIlIll).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 1.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIIlI, llllllllllllIlllIlIlIllllIlllllI + 1.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIllIlIl, llllllllllllIlllIlIlIllllIlIllIl).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 0.0, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIlllllIIIIll, llllllllllllIlllIlIlIllllIlllllI + 1.0).color(llllllllllllIlllIlIlIllllIlIIlII, llllllllllllIlllIlIlIllllIlIIIll, llllllllllllIlllIlIlIllllIlIIIlI, 1.0f).tex(llllllllllllIlllIlIlIllllIllIlll, llllllllllllIlllIlIlIllllIlIllll).lightmap(llllllllllllIlllIlIlIllllIlIIllI, llllllllllllIlllIlIlIllllIlIIlIl).endVertex();
            }
        }
        if (lIIIlIIllIIIlllI(llllllllllllIlllIlIlIlllllIIllII ? 1 : 0)) {
            final float llllllllllllIlllIlIlIllllIlIIIIl = llllllllllllIlllIlIlIlllllIlIIlI[BlockFluidRenderer.llIIIlIllIIIll[1]].getMinU();
            final float llllllllllllIlllIlIlIllllIlIIIII = llllllllllllIlllIlIlIlllllIlIIlI[BlockFluidRenderer.llIIIlIllIIIll[1]].getMaxU();
            final float llllllllllllIlllIlIlIllllIIlllll = llllllllllllIlllIlIlIlllllIlIIlI[BlockFluidRenderer.llIIIlIllIIIll[1]].getMinV();
            final float llllllllllllIlllIlIlIllllIIllllI = llllllllllllIlllIlIlIlllllIlIIlI[BlockFluidRenderer.llIIIlIllIIIll[1]].getMaxV();
            final int llllllllllllIlllIlIlIllllIIlllIl = llllllllllllIlllIlIlIlllllIlIIll.getMixedBrightnessForBlock(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIlllllIlIlIl.down());
            final int llllllllllllIlllIlIlIllllIIlllII = llllllllllllIlllIlIlIllllIIlllIl >> BlockFluidRenderer.llIIIlIllIIIll[4] & BlockFluidRenderer.llIIIlIllIIIll[8];
            final int llllllllllllIlllIlIlIllllIIllIll = llllllllllllIlllIlIlIllllIIlllIl & BlockFluidRenderer.llIIIlIllIIIll[8];
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII, llllllllllllIlllIlIlIllllIllllll, llllllllllllIlllIlIlIllllIlllllI + 1.0).color(llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, 1.0f).tex(llllllllllllIlllIlIlIllllIlIIIIl, llllllllllllIlllIlIlIllllIIllllI).lightmap(llllllllllllIlllIlIlIllllIIlllII, llllllllllllIlllIlIlIllllIIllIll).endVertex();
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII, llllllllllllIlllIlIlIllllIllllll, llllllllllllIlllIlIlIllllIlllllI).color(llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, 1.0f).tex(llllllllllllIlllIlIlIllllIlIIIIl, llllllllllllIlllIlIlIllllIIlllll).lightmap(llllllllllllIlllIlIlIllllIIlllII, llllllllllllIlllIlIlIllllIIllIll).endVertex();
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 1.0, llllllllllllIlllIlIlIllllIllllll, llllllllllllIlllIlIlIllllIlllllI).color(llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, 1.0f).tex(llllllllllllIlllIlIlIllllIlIIIII, llllllllllllIlllIlIlIllllIIlllll).lightmap(llllllllllllIlllIlIlIllllIIlllII, llllllllllllIlllIlIlIllllIIllIll).endVertex();
            llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIlllllIIIIII + 1.0, llllllllllllIlllIlIlIllllIllllll, llllllllllllIlllIlIlIllllIlllllI + 1.0).color(llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, llllllllllllIlllIlIlIlllllIIlIIl, 1.0f).tex(llllllllllllIlllIlIlIllllIlIIIII, llllllllllllIlllIlIlIllllIIllllI).lightmap(llllllllllllIlllIlIlIllllIIlllII, llllllllllllIlllIlIlIllllIIllIll).endVertex();
            llllllllllllIlllIlIlIlllllIIlIlI = (BlockFluidRenderer.llIIIlIllIIIll[2] != 0);
        }
        int llllllllllllIlllIlIlIllllIIllIlI = BlockFluidRenderer.llIIIlIllIIIll[1];
        "".length();
        if (null != null) {
            return ((0x38 ^ 0x13) & ~(0xBE ^ 0x95)) != 0x0;
        }
        while (!lIIIlIIllIIlIIll(llllllllllllIlllIlIlIllllIIllIlI, BlockFluidRenderer.llIIIlIllIIIll[7])) {
            int llllllllllllIlllIlIlIllllIIllIIl = BlockFluidRenderer.llIIIlIllIIIll[1];
            int llllllllllllIlllIlIlIllllIIllIII = BlockFluidRenderer.llIIIlIllIIIll[1];
            if (lIIIlIIllIIIllIl(llllllllllllIlllIlIlIllllIIllIlI)) {
                --llllllllllllIlllIlIlIllllIIllIII;
            }
            if (lIIIlIIllIIlIIIl(llllllllllllIlllIlIlIllllIIllIlI, BlockFluidRenderer.llIIIlIllIIIll[2])) {
                ++llllllllllllIlllIlIlIllllIIllIII;
            }
            if (lIIIlIIllIIlIIIl(llllllllllllIlllIlIlIllllIIllIlI, BlockFluidRenderer.llIIIlIllIIIll[0])) {
                --llllllllllllIlllIlIlIllllIIllIIl;
            }
            if (lIIIlIIllIIlIIIl(llllllllllllIlllIlIlIllllIIllIlI, BlockFluidRenderer.llIIIlIllIIIll[3])) {
                ++llllllllllllIlllIlIlIllllIIllIIl;
            }
            final BlockPos llllllllllllIlllIlIlIllllIIlIlll = llllllllllllIlllIlIlIlllllIlIlIl.add(llllllllllllIlllIlIlIllllIIllIIl, BlockFluidRenderer.llIIIlIllIIIll[1], llllllllllllIlllIlIlIllllIIllIII);
            final TextureAtlasSprite llllllllllllIlllIlIlIllllIIlIllI = llllllllllllIlllIlIlIlllllIlIIlI[BlockFluidRenderer.llIIIlIllIIIll[2]];
            if (lIIIlIIllIIIlllI(llllllllllllIlllIlIlIlllllIIlIll[llllllllllllIlllIlIlIllllIIllIlI] ? 1 : 0)) {
                float llllllllllllIlllIlIlIllllIIlIIlI = 0.0f;
                float llllllllllllIlllIlIlIllllIIIlllI = 0.0f;
                double llllllllllllIlllIlIlIllllIIIlIlI = 0.0;
                double llllllllllllIlllIlIlIllllIIIIIlI = 0.0;
                double llllllllllllIlllIlIlIllllIIIIllI = 0.0;
                double llllllllllllIlllIlIlIlllIllllllI = 0.0;
                if (lIIIlIIllIIIllIl(llllllllllllIlllIlIlIllllIIllIlI)) {
                    final float llllllllllllIlllIlIlIllllIIlIlIl = llllllllllllIlllIlIlIlllllIIIlII;
                    final float llllllllllllIlllIlIlIllllIIlIIIl = llllllllllllIlllIlIlIlllllIIIIIl;
                    final double llllllllllllIlllIlIlIllllIIIllIl = llllllllllllIlllIlIlIlllllIIIIII;
                    final double llllllllllllIlllIlIlIllllIIIIlIl = llllllllllllIlllIlIlIlllllIIIIII + 1.0;
                    final double llllllllllllIlllIlIlIllllIIIlIIl = llllllllllllIlllIlIlIllllIlllllI + llllllllllllIlllIlIlIllllIllllIl;
                    final double llllllllllllIlllIlIlIllllIIIIIIl = llllllllllllIlllIlIlIllllIlllllI + llllllllllllIlllIlIlIllllIllllIl;
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return ((0x42 ^ 0x6E) & ~(0x36 ^ 0x1A)) != 0x0;
                    }
                }
                else if (lIIIlIIllIIlIIIl(llllllllllllIlllIlIlIllllIIllIlI, BlockFluidRenderer.llIIIlIllIIIll[2])) {
                    final float llllllllllllIlllIlIlIllllIIlIlII = llllllllllllIlllIlIlIlllllIIIIlI;
                    final float llllllllllllIlllIlIlIllllIIlIIII = llllllllllllIlllIlIlIlllllIIIIll;
                    final double llllllllllllIlllIlIlIllllIIIllII = llllllllllllIlllIlIlIlllllIIIIII + 1.0;
                    final double llllllllllllIlllIlIlIllllIIIIlII = llllllllllllIlllIlIlIlllllIIIIII;
                    final double llllllllllllIlllIlIlIllllIIIlIII = llllllllllllIlllIlIlIllllIlllllI + 1.0 - llllllllllllIlllIlIlIllllIllllIl;
                    final double llllllllllllIlllIlIlIllllIIIIIII = llllllllllllIlllIlIlIllllIlllllI + 1.0 - llllllllllllIlllIlIlIllllIllllIl;
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return ((46 + 5 + 34 + 49 ^ 116 + 141 - 145 + 62) & (0x5F ^ 0x53 ^ (0x33 ^ 0x17) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIlIIllIIlIIIl(llllllllllllIlllIlIlIllllIIllIlI, BlockFluidRenderer.llIIIlIllIIIll[0])) {
                    final float llllllllllllIlllIlIlIllllIIlIIll = llllllllllllIlllIlIlIlllllIIIIll;
                    final float llllllllllllIlllIlIlIllllIIIllll = llllllllllllIlllIlIlIlllllIIIlII;
                    final double llllllllllllIlllIlIlIllllIIIlIll = llllllllllllIlllIlIlIlllllIIIIII + llllllllllllIlllIlIlIllllIllllIl;
                    final double llllllllllllIlllIlIlIllllIIIIIll = llllllllllllIlllIlIlIlllllIIIIII + llllllllllllIlllIlIlIllllIllllIl;
                    final double llllllllllllIlllIlIlIllllIIIIlll = llllllllllllIlllIlIlIllllIlllllI + 1.0;
                    final double llllllllllllIlllIlIlIlllIlllllll = llllllllllllIlllIlIlIllllIlllllI;
                    "".length();
                    if ("  ".length() == 0) {
                        return ((0xAE ^ 0x8B) & ~(0x9D ^ 0xB8) & ~("   ".length() & ~"   ".length())) != 0x0;
                    }
                }
                else {
                    llllllllllllIlllIlIlIllllIIlIIlI = llllllllllllIlllIlIlIlllllIIIIIl;
                    llllllllllllIlllIlIlIllllIIIlllI = llllllllllllIlllIlIlIlllllIIIIlI;
                    llllllllllllIlllIlIlIllllIIIlIlI = llllllllllllIlllIlIlIlllllIIIIII + 1.0 - llllllllllllIlllIlIlIllllIllllIl;
                    llllllllllllIlllIlIlIllllIIIIIlI = llllllllllllIlllIlIlIlllllIIIIII + 1.0 - llllllllllllIlllIlIlIllllIllllIl;
                    llllllllllllIlllIlIlIllllIIIIllI = llllllllllllIlllIlIlIllllIlllllI;
                    llllllllllllIlllIlIlIlllIllllllI = llllllllllllIlllIlIlIllllIlllllI + 1.0;
                }
                llllllllllllIlllIlIlIlllllIIlIlI = (BlockFluidRenderer.llIIIlIllIIIll[2] != 0);
                final float llllllllllllIlllIlIlIlllIlllllIl = llllllllllllIlllIlIlIllllIIlIllI.getInterpolatedU(0.0);
                final float llllllllllllIlllIlIlIlllIlllllII = llllllllllllIlllIlIlIllllIIlIllI.getInterpolatedU(8.0);
                final float llllllllllllIlllIlIlIlllIllllIll = llllllllllllIlllIlIlIllllIIlIllI.getInterpolatedV((1.0f - llllllllllllIlllIlIlIllllIIlIIlI) * 16.0f * 0.5f);
                final float llllllllllllIlllIlIlIlllIllllIlI = llllllllllllIlllIlIlIllllIIlIllI.getInterpolatedV((1.0f - llllllllllllIlllIlIlIllllIIIlllI) * 16.0f * 0.5f);
                final float llllllllllllIlllIlIlIlllIllllIIl = llllllllllllIlllIlIlIllllIIlIllI.getInterpolatedV(8.0);
                final int llllllllllllIlllIlIlIlllIllllIII = llllllllllllIlllIlIlIlllllIlIIll.getMixedBrightnessForBlock(llllllllllllIlllIlIlIlllIlllIIII, llllllllllllIlllIlIlIllllIIlIlll);
                final int llllllllllllIlllIlIlIlllIlllIlll = llllllllllllIlllIlIlIlllIllllIII >> BlockFluidRenderer.llIIIlIllIIIll[4] & BlockFluidRenderer.llIIIlIllIIIll[8];
                final int llllllllllllIlllIlIlIlllIlllIllI = llllllllllllIlllIlIlIlllIllllIII & BlockFluidRenderer.llIIIlIllIIIll[8];
                float n;
                if (lIIIlIIllIIlIIlI(llllllllllllIlllIlIlIllllIIllIlI, BlockFluidRenderer.llIIIlIllIIIll[0])) {
                    n = llllllllllllIlllIlIlIlllllIIIlll;
                    "".length();
                    if (((0xB8 ^ 0x99 ^ (0x3B ^ 0x50)) & (0x12 ^ 0x2A ^ (0x7 ^ 0x75) ^ -" ".length())) > 0) {
                        return ((108 + 62 - 100 + 62 ^ 193 + 30 - 174 + 145) & (136 + 142 - 156 + 76 ^ 52 + 16 - 24 + 84 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = llllllllllllIlllIlIlIlllllIIIllI;
                }
                final float llllllllllllIlllIlIlIlllIlllIlIl = n;
                final float llllllllllllIlllIlIlIlllIlllIlII = llllllllllllIlllIlIlIlllllIIlIII * llllllllllllIlllIlIlIlllIlllIlIl * llllllllllllIlllIlIlIlllllIlIIII;
                final float llllllllllllIlllIlIlIlllIlllIIll = llllllllllllIlllIlIlIlllllIIlIII * llllllllllllIlllIlIlIlllIlllIlIl * llllllllllllIlllIlIlIlllllIIllll;
                final float llllllllllllIlllIlIlIlllIlllIIlI = llllllllllllIlllIlIlIlllllIIlIII * llllllllllllIlllIlIlIlllIlllIlIl * llllllllllllIlllIlIlIlllllIIlllI;
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIlIlI, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIllllIIlIIlI, llllllllllllIlllIlIlIllllIIIIllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllIl, llllllllllllIlllIlIlIlllIllllIll).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIIIlI, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIllllIIIlllI, llllllllllllIlllIlIlIlllIllllllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllII, llllllllllllIlllIlIlIlllIllllIlI).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIIIlI, llllllllllllIlllIlIlIllllIllllll + 0.0, llllllllllllIlllIlIlIlllIllllllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllII, llllllllllllIlllIlIlIlllIllllIIl).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIlIlI, llllllllllllIlllIlIlIllllIllllll + 0.0, llllllllllllIlllIlIlIllllIIIIllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllIl, llllllllllllIlllIlIlIlllIllllIIl).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIlIlI, llllllllllllIlllIlIlIllllIllllll + 0.0, llllllllllllIlllIlIlIllllIIIIllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllIl, llllllllllllIlllIlIlIlllIllllIIl).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIIIlI, llllllllllllIlllIlIlIllllIllllll + 0.0, llllllllllllIlllIlIlIlllIllllllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllII, llllllllllllIlllIlIlIlllIllllIIl).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIIIlI, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIllllIIIlllI, llllllllllllIlllIlIlIlllIllllllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllII, llllllllllllIlllIlIlIlllIllllIlI).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
                llllllllllllIlllIlIlIlllIllIllIl.pos(llllllllllllIlllIlIlIllllIIIlIlI, llllllllllllIlllIlIlIllllIllllll + llllllllllllIlllIlIlIllllIIlIIlI, llllllllllllIlllIlIlIllllIIIIllI).color(llllllllllllIlllIlIlIlllIlllIlII, llllllllllllIlllIlIlIlllIlllIIll, llllllllllllIlllIlIlIlllIlllIIlI, 1.0f).tex(llllllllllllIlllIlIlIlllIlllllIl, llllllllllllIlllIlIlIlllIllllIll).lightmap(llllllllllllIlllIlIlIlllIlllIlll, llllllllllllIlllIlIlIlllIlllIllI).endVertex();
            }
            ++llllllllllllIlllIlIlIllllIIllIlI;
        }
        return llllllllllllIlllIlIlIlllllIIlIlI;
    }
    
    public BlockFluidRenderer() {
        this.atlasSpritesLava = new TextureAtlasSprite[BlockFluidRenderer.llIIIlIllIIIll[0]];
        this.atlasSpritesWater = new TextureAtlasSprite[BlockFluidRenderer.llIIIlIllIIIll[0]];
        this.initAtlasSprites();
    }
    
    private static void lIIIlIIllIIIlIIl() {
        (llIIIlIllIIIll = new int[9])[0] = "  ".length();
        BlockFluidRenderer.llIIIlIllIIIll[1] = ((0x8F ^ 0x8B) & ~(0x18 ^ 0x1C));
        BlockFluidRenderer.llIIIlIllIIIll[2] = " ".length();
        BlockFluidRenderer.llIIIlIllIIIll[3] = "   ".length();
        BlockFluidRenderer.llIIIlIllIIIll[4] = (0x60 ^ 0x70);
        BlockFluidRenderer.llIIIlIllIIIll[5] = 97 + 208 - 58 + 8;
        BlockFluidRenderer.llIIIlIllIIIll[6] = (0x5 ^ 0x6C ^ (0xFF ^ 0x9E));
        BlockFluidRenderer.llIIIlIllIIIll[7] = (0x67 ^ 0x14 ^ (0xEC ^ 0x9B));
        BlockFluidRenderer.llIIIlIllIIIll[8] = (-1 & 0xFFFF);
    }
    
    private static boolean lIIIlIIllIIIllII(final Object llllllllllllIlllIlIlIllIlllIIlII, final Object llllllllllllIlllIlIlIllIlllIIIll) {
        return llllllllllllIlllIlIlIllIlllIIlII == llllllllllllIlllIlIlIllIlllIIIll;
    }
    
    private static boolean lIIIlIIllIIlIIIl(final int llllllllllllIlllIlIlIllIllllIlII, final int llllllllllllIlllIlIlIllIllllIIll) {
        return llllllllllllIlllIlIlIllIllllIlII == llllllllllllIlllIlIlIllIllllIIll;
    }
    
    private static int lIIIlIIllIIIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlIIllIIlIIII(final int llllllllllllIlllIlIlIllIllIlllIl) {
        return llllllllllllIlllIlIlIllIllIlllIl < 0;
    }
    
    private static void lIIIlIIllIIIIlIl() {
        (llIIIlIllIIIIl = new String[BlockFluidRenderer.llIIIlIllIIIll[7]])[BlockFluidRenderer.llIIIlIllIIIll[1]] = lIIIlIIllIIIIIll("LyIlJDAwKi01aSAnJCI4MWQnICUjFDg1Oi4n", "BKKAS");
        BlockFluidRenderer.llIIIlIllIIIIl[BlockFluidRenderer.llIIIlIllIIIll[2]] = lIIIlIIllIIIIlII("2fc8K+2KSimVxC8XI5VgjJDvv/qUewIsioArreazDr0=", "wjMtP");
        BlockFluidRenderer.llIIIlIllIIIIl[BlockFluidRenderer.llIIIlIllIIIll[0]] = lIIIlIIllIIIIIll("CCMXNhoXKx8nQwcmFjASFmUOMg0AOCYgDQwmFQ==", "eJySy");
        BlockFluidRenderer.llIIIlIllIIIIl[BlockFluidRenderer.llIIIlIllIIIll[3]] = lIIIlIIllIIIIIll("JCElAgY7KS0TXyskJAQOOmc8BhEsOhQBCSY/", "IHKge");
    }
    
    protected void initAtlasSprites() {
        final TextureMap llllllllllllIlllIlIllIIIIIIlIIlI = Minecraft.getMinecraft().getTextureMapBlocks();
        this.atlasSpritesLava[BlockFluidRenderer.llIIIlIllIIIll[1]] = llllllllllllIlllIlIllIIIIIIlIIlI.getAtlasSprite(BlockFluidRenderer.llIIIlIllIIIIl[BlockFluidRenderer.llIIIlIllIIIll[1]]);
        this.atlasSpritesLava[BlockFluidRenderer.llIIIlIllIIIll[2]] = llllllllllllIlllIlIllIIIIIIlIIlI.getAtlasSprite(BlockFluidRenderer.llIIIlIllIIIIl[BlockFluidRenderer.llIIIlIllIIIll[2]]);
        this.atlasSpritesWater[BlockFluidRenderer.llIIIlIllIIIll[1]] = llllllllllllIlllIlIllIIIIIIlIIlI.getAtlasSprite(BlockFluidRenderer.llIIIlIllIIIIl[BlockFluidRenderer.llIIIlIllIIIll[0]]);
        this.atlasSpritesWater[BlockFluidRenderer.llIIIlIllIIIll[2]] = llllllllllllIlllIlIllIIIIIIlIIlI.getAtlasSprite(BlockFluidRenderer.llIIIlIllIIIIl[BlockFluidRenderer.llIIIlIllIIIll[3]]);
    }
}
