// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.Vec3i;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.BlockWorldState;
import com.google.common.cache.LoadingCache;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyEnum;

public class BlockPortal extends BlockBreakable
{
    private static final /* synthetic */ String[] llllIlIIIIIll;
    private static final /* synthetic */ int[] llllIlIIIlIIl;
    public static final /* synthetic */ PropertyEnum<EnumFacing.Axis> AXIS;
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
    
    private static String lIlIlIIlIllllll(final String lllllllllllllIlIllIllllIIllllIII, final String lllllllllllllIlIllIllllIIllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIllllIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllllIIllllIIl.getBytes(StandardCharsets.UTF_8)), BlockPortal.llllIlIIIlIIl[8]), "DES");
            final Cipher lllllllllllllIlIllIllllIIlllllII = Cipher.getInstance("DES");
            lllllllllllllIlIllIllllIIlllllII.init(BlockPortal.llllIlIIIlIIl[1], lllllllllllllIlIllIllllIIlllllIl);
            return new String(lllllllllllllIlIllIllllIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllllIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIllllIIllllIll) {
            lllllllllllllIlIllIllllIIllllIll.printStackTrace();
            return null;
        }
    }
    
    public BlockPattern.PatternHelper func_181089_f(final World lllllllllllllIlIllIllllIlIlIllIl, final BlockPos lllllllllllllIlIllIllllIlIIlllIl) {
        EnumFacing.Axis lllllllllllllIlIllIllllIlIlIlIll = EnumFacing.Axis.Z;
        Size lllllllllllllIlIllIllllIlIlIlIlI = new Size(lllllllllllllIlIllIllllIlIlIllIl, lllllllllllllIlIllIllllIlIIlllIl, EnumFacing.Axis.X);
        final LoadingCache<BlockPos, BlockWorldState> lllllllllllllIlIllIllllIlIlIlIIl = BlockPattern.func_181627_a(lllllllllllllIlIllIllllIlIlIllIl, (boolean)(BlockPortal.llllIlIIIlIIl[2] != 0));
        if (lIlIlIIllIlllIl(lllllllllllllIlIllIllllIlIlIlIlI.func_150860_b() ? 1 : 0)) {
            lllllllllllllIlIllIllllIlIlIlIll = EnumFacing.Axis.X;
            lllllllllllllIlIllIllllIlIlIlIlI = new Size(lllllllllllllIlIllIllllIlIlIllIl, lllllllllllllIlIllIllllIlIIlllIl, EnumFacing.Axis.Z);
        }
        if (lIlIlIIllIlllIl(lllllllllllllIlIllIllllIlIlIlIlI.func_150860_b() ? 1 : 0)) {
            return new BlockPattern.PatternHelper(lllllllllllllIlIllIllllIlIIlllIl, EnumFacing.NORTH, EnumFacing.UP, lllllllllllllIlIllIllllIlIlIlIIl, BlockPortal.llllIlIIIlIIl[2], BlockPortal.llllIlIIIlIIl[2], BlockPortal.llllIlIIIlIIl[2]);
        }
        final int[] lllllllllllllIlIllIllllIlIlIlIII = new int[EnumFacing.AxisDirection.values().length];
        final EnumFacing lllllllllllllIlIllIllllIlIlIIlll = lllllllllllllIlIllIllllIlIlIlIlI.field_150866_c.rotateYCCW();
        final BlockPos lllllllllllllIlIllIllllIlIlIIllI = lllllllllllllIlIllIllllIlIlIlIlI.field_150861_f.up(lllllllllllllIlIllIllllIlIlIlIlI.func_181100_a() - BlockPortal.llllIlIIIlIIl[2]);
        char lllllllllllllIlIllIllllIlIIlIIll;
        byte lllllllllllllIlIllIllllIlIIlIlII = (byte)((EnumFacing.AxisDirection[])(Object)(lllllllllllllIlIllIllllIlIIlIIll = (char)(Object)EnumFacing.AxisDirection.values())).length;
        float lllllllllllllIlIllIllllIlIIlIlIl = BlockPortal.llllIlIIIlIIl[0];
        "".length();
        if (-" ".length() > " ".length()) {
            return null;
        }
        while (!lIlIlIIlllIIlII((int)lllllllllllllIlIllIllllIlIIlIlIl, lllllllllllllIlIllIllllIlIIlIlII)) {
            final EnumFacing.AxisDirection lllllllllllllIlIllIllllIlIlIIlIl = lllllllllllllIlIllIllllIlIIlIIll[lllllllllllllIlIllIllllIlIIlIlIl];
            BlockPos offset;
            if (lIlIlIIlllIIIIl(lllllllllllllIlIllIllllIlIlIIlll.getAxisDirection(), lllllllllllllIlIllIllllIlIlIIlIl)) {
                offset = lllllllllllllIlIllIllllIlIlIIllI;
                "".length();
                if (-" ".length() >= (131 + 94 - 134 + 54 ^ 21 + 59 - 31 + 100)) {
                    return null;
                }
            }
            else {
                offset = lllllllllllllIlIllIllllIlIlIIllI.offset(lllllllllllllIlIllIllllIlIlIlIlI.field_150866_c, lllllllllllllIlIllIllllIlIlIlIlI.func_181101_b() - BlockPortal.llllIlIIIlIIl[2]);
            }
            final BlockPattern.PatternHelper lllllllllllllIlIllIllllIlIlIIlII = new BlockPattern.PatternHelper(offset, EnumFacing.func_181076_a(lllllllllllllIlIllIllllIlIlIIlIl, lllllllllllllIlIllIllllIlIlIlIll), EnumFacing.UP, lllllllllllllIlIllIllllIlIlIlIIl, lllllllllllllIlIllIllllIlIlIlIlI.func_181101_b(), lllllllllllllIlIllIllllIlIlIlIlI.func_181100_a(), BlockPortal.llllIlIIIlIIl[2]);
            int lllllllllllllIlIllIllllIlIlIIIll = BlockPortal.llllIlIIIlIIl[0];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
            while (!lIlIlIIlllIIlII(lllllllllllllIlIllIllllIlIlIIIll, lllllllllllllIlIllIllllIlIlIlIlI.func_181101_b())) {
                int lllllllllllllIlIllIllllIlIlIIIlI = BlockPortal.llllIlIIIlIIl[0];
                "".length();
                if ("  ".length() >= (119 + 141 - 174 + 94 ^ 141 + 93 - 92 + 34)) {
                    return null;
                }
                while (!lIlIlIIlllIIlII(lllllllllllllIlIllIllllIlIlIIIlI, lllllllllllllIlIllIllllIlIlIlIlI.func_181100_a())) {
                    final BlockWorldState lllllllllllllIlIllIllllIlIlIIIIl = lllllllllllllIlIllIllllIlIlIIlII.translateOffset(lllllllllllllIlIllIllllIlIlIIIll, lllllllllllllIlIllIllllIlIlIIIlI, BlockPortal.llllIlIIIlIIl[2]);
                    if (lIlIlIIlllIIIII(lllllllllllllIlIllIllllIlIlIIIIl.getBlockState()) && lIlIlIIlllIIIll(lllllllllllllIlIllIllllIlIlIIIIl.getBlockState().getBlock().getMaterial(), Material.air)) {
                        final int[] array = lllllllllllllIlIllIllllIlIlIlIII;
                        final int ordinal = lllllllllllllIlIllIllllIlIlIIlIl.ordinal();
                        array[ordinal] += BlockPortal.llllIlIIIlIIl[2];
                    }
                    ++lllllllllllllIlIllIllllIlIlIIIlI;
                }
                ++lllllllllllllIlIllIllllIlIlIIIll;
            }
            ++lllllllllllllIlIllIllllIlIIlIlIl;
        }
        EnumFacing.AxisDirection lllllllllllllIlIllIllllIlIlIIIII = EnumFacing.AxisDirection.POSITIVE;
        final long lllllllllllllIlIllIllllIlIIlIIlI;
        lllllllllllllIlIllIllllIlIIlIIll = (char)((EnumFacing.AxisDirection[])(Object)(lllllllllllllIlIllIllllIlIIlIIlI = (long)(Object)EnumFacing.AxisDirection.values())).length;
        lllllllllllllIlIllIllllIlIIlIlII = (byte)BlockPortal.llllIlIIIlIIl[0];
        "".length();
        if (((0x24 ^ 0x12) & ~(0xB6 ^ 0x80)) != 0x0) {
            return null;
        }
        while (!lIlIlIIlllIIlII(lllllllllllllIlIllIllllIlIIlIlII, lllllllllllllIlIllIllllIlIIlIIll)) {
            final EnumFacing.AxisDirection lllllllllllllIlIllIllllIlIIlllll = lllllllllllllIlIllIllllIlIIlIIlI[lllllllllllllIlIllIllllIlIIlIlII];
            if (lIlIlIIllIlllII(lllllllllllllIlIllIllllIlIlIlIII[lllllllllllllIlIllIllllIlIIlllll.ordinal()], lllllllllllllIlIllIllllIlIlIlIII[lllllllllllllIlIllIllllIlIlIIIII.ordinal()])) {
                lllllllllllllIlIllIllllIlIlIIIII = lllllllllllllIlIllIllllIlIIlllll;
            }
            ++lllllllllllllIlIllIllllIlIIlIlII;
        }
        BlockPos offset2;
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIllllIlIlIIlll.getAxisDirection(), lllllllllllllIlIllIllllIlIlIIIII)) {
            offset2 = lllllllllllllIlIllIllllIlIlIIllI;
            "".length();
            if ("  ".length() > (0xA ^ 0xE)) {
                return null;
            }
        }
        else {
            offset2 = lllllllllllllIlIllIllllIlIlIIllI.offset(lllllllllllllIlIllIllllIlIlIlIlI.field_150866_c, lllllllllllllIlIllIllllIlIlIlIlI.func_181101_b() - BlockPortal.llllIlIIIlIIl[2]);
        }
        return new BlockPattern.PatternHelper(offset2, EnumFacing.func_181076_a(lllllllllllllIlIllIllllIlIlIIIII, lllllllllllllIlIllIllllIlIlIlIll), EnumFacing.UP, lllllllllllllIlIllIllllIlIlIlIIl, lllllllllllllIlIllIllllIlIlIlIlI.func_181101_b(), lllllllllllllIlIllIllllIlIlIlIlI.func_181100_a(), BlockPortal.llllIlIIIlIIl[2]);
    }
    
    private static String lIlIlIIllIIIIII(final String lllllllllllllIlIllIllllIlIIIIlIl, final String lllllllllllllIlIllIllllIlIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIllllIlIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIllllIlIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIllllIlIIIlIIl.init(BlockPortal.llllIlIIIlIIl[1], lllllllllllllIlIllIllllIlIIIlIlI);
            return new String(lllllllllllllIlIllIllllIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIllllIlIIIlIII) {
            lllllllllllllIlIllIllllIlIIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIIlllIIlIl(final int lllllllllllllIlIllIllllIIlIllIlI, final int lllllllllllllIlIllIllllIIlIllIIl) {
        return lllllllllllllIlIllIllllIIlIllIlI == lllllllllllllIlIllIllllIIlIllIIl;
    }
    
    private static String lIlIlIIlIlllllI(String lllllllllllllIlIllIllllIIllIIlIl, final String lllllllllllllIlIllIllllIIllIlIIl) {
        lllllllllllllIlIllIllllIIllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIllIllllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIllllIIllIlIII = new StringBuilder();
        final char[] lllllllllllllIlIllIllllIIllIIlll = lllllllllllllIlIllIllllIIllIlIIl.toCharArray();
        int lllllllllllllIlIllIllllIIllIIllI = BlockPortal.llllIlIIIlIIl[0];
        final char lllllllllllllIlIllIllllIIllIIIII = (Object)lllllllllllllIlIllIllllIIllIIlIl.toCharArray();
        final int lllllllllllllIlIllIllllIIlIlllll = lllllllllllllIlIllIllllIIllIIIII.length;
        Exception lllllllllllllIlIllIllllIIlIllllI = (Exception)BlockPortal.llllIlIIIlIIl[0];
        while (lIlIlIIllIlllII((int)lllllllllllllIlIllIllllIIlIllllI, lllllllllllllIlIllIllllIIlIlllll)) {
            final char lllllllllllllIlIllIllllIIllIlIll = lllllllllllllIlIllIllllIIllIIIII[lllllllllllllIlIllIllllIIlIllllI];
            lllllllllllllIlIllIllllIIllIlIII.append((char)(lllllllllllllIlIllIllllIIllIlIll ^ lllllllllllllIlIllIllllIIllIIlll[lllllllllllllIlIllIllllIIllIIllI % lllllllllllllIlIllIllllIIllIIlll.length]));
            "".length();
            ++lllllllllllllIlIllIllllIIllIIllI;
            ++lllllllllllllIlIllIllllIIlIllllI;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIllllIIllIlIII);
    }
    
    static {
        lIlIlIIllIllIlI();
        lIlIlIIllIIIIIl();
        final String lllllllllllllIIlIlIIIllIlIIIllIl = BlockPortal.llllIlIIIIIll[BlockPortal.llllIlIIIlIIl[0]];
        final Class<EnumFacing.Axis> lllllllllllllIIlIlIIIllIlIIIllII = EnumFacing.Axis.class;
        final EnumFacing.Axis[] lllllllllllllIIlIlIIIllIlIIIlllI = new EnumFacing.Axis[BlockPortal.llllIlIIIlIIl[1]];
        lllllllllllllIIlIlIIIllIlIIIlllI[BlockPortal.llllIlIIIlIIl[0]] = EnumFacing.Axis.X;
        lllllllllllllIIlIlIIIllIlIIIlllI[BlockPortal.llllIlIIIlIIl[2]] = EnumFacing.Axis.Z;
        AXIS = PropertyEnum.create(lllllllllllllIIlIlIIIllIlIIIllIl, lllllllllllllIIlIlIIIllIlIIIllII, lllllllllllllIIlIlIIIllIlIIIlllI);
    }
    
    public boolean func_176548_d(final World lllllllllllllIlIllIlllllIIllllIl, final BlockPos lllllllllllllIlIllIlllllIIllllII) {
        final Size lllllllllllllIlIllIlllllIIlllIll = new Size(lllllllllllllIlIllIlllllIIllllIl, lllllllllllllIlIllIlllllIIllllII, EnumFacing.Axis.X);
        if (lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIlllIll.func_150860_b() ? 1 : 0) && lIlIlIIllIlllIl(lllllllllllllIlIllIlllllIIlllIll.field_150864_e)) {
            lllllllllllllIlIllIlllllIIlllIll.func_150859_c();
            return BlockPortal.llllIlIIIlIIl[2] != 0;
        }
        final Size lllllllllllllIlIllIlllllIIlllIlI = new Size(lllllllllllllIlIllIlllllIIllllIl, lllllllllllllIlIllIlllllIIllllII, EnumFacing.Axis.Z);
        if (lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIlllIlI.func_150860_b() ? 1 : 0) && lIlIlIIllIlllIl(lllllllllllllIlIllIlllllIIlllIlI.field_150864_e)) {
            lllllllllllllIlIllIlllllIIlllIlI.func_150859_c();
            return BlockPortal.llllIlIIIlIIl[2] != 0;
        }
        return BlockPortal.llllIlIIIlIIl[0] != 0;
    }
    
    private static boolean lIlIlIIllIlllII(final int lllllllllllllIlIllIllllIIlIlIIlI, final int lllllllllllllIlIllIllllIIlIlIIIl) {
        return lllllllllllllIlIllIllllIIlIlIIlI < lllllllllllllIlIllIllllIIlIlIIIl;
    }
    
    private static boolean lIlIlIIllIlllll(final int lllllllllllllIlIllIllllIIIllllIl) {
        return lllllllllllllIlIllIllllIIIllllIl > 0;
    }
    
    private static void lIlIlIIllIIIIIl() {
        (llllIlIIIIIll = new String[BlockPortal.llllIlIIIlIIl[7]])[BlockPortal.llllIlIIIlIIl[0]] = lIlIlIIlIlllllI("NBEKOg==", "UicIf");
        BlockPortal.llllIlIIIIIll[BlockPortal.llllIlIIIlIIl[2]] = lIlIlIIlIllllll("MlTlLnOsQJKSV4Oy+imKSw==", "ilBkm");
        BlockPortal.llllIlIIIIIll[BlockPortal.llllIlIIIlIIl[1]] = lIlIlIIllIIIIII("5K6Sbr5EP1BVD3U//H3TvQ==", "HTfMd");
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIlIllIllllIlllIIllI, final BlockPos lllllllllllllIlIllIllllIllIlIlll, final IBlockState lllllllllllllIlIllIllllIlllIIlII, final Random lllllllllllllIlIllIllllIlllIIIll) {
        if (lIlIlIIllIlllIl(lllllllllllllIlIllIllllIlllIIIll.nextInt(BlockPortal.llllIlIIIlIIl[5]))) {
            lllllllllllllIlIllIllllIlllIIllI.playSound(lllllllllllllIlIllIllllIllIlIlll.getX() + 0.5, lllllllllllllIlIllIllllIllIlIlll.getY() + 0.5, lllllllllllllIlIllIllllIllIlIlll.getZ() + 0.5, BlockPortal.llllIlIIIIIll[BlockPortal.llllIlIIIlIIl[1]], 0.5f, lllllllllllllIlIllIllllIlllIIIll.nextFloat() * 0.4f + 0.8f, (boolean)(BlockPortal.llllIlIIIlIIl[0] != 0));
        }
        int lllllllllllllIlIllIllllIlllIIIlI = BlockPortal.llllIlIIIlIIl[0];
        "".length();
        if (" ".length() >= "   ".length()) {
            return;
        }
        while (!lIlIlIIlllIIlII(lllllllllllllIlIllIllllIlllIIIlI, BlockPortal.llllIlIIIlIIl[6])) {
            double lllllllllllllIlIllIllllIlllIIIIl = lllllllllllllIlIllIllllIllIlIlll.getX() + lllllllllllllIlIllIllllIlllIIIll.nextFloat();
            final double lllllllllllllIlIllIllllIlllIIIII = lllllllllllllIlIllIllllIllIlIlll.getY() + lllllllllllllIlIllIllllIlllIIIll.nextFloat();
            double lllllllllllllIlIllIllllIllIlllll = lllllllllllllIlIllIllllIllIlIlll.getZ() + lllllllllllllIlIllIllllIlllIIIll.nextFloat();
            double lllllllllllllIlIllIllllIllIllllI = (lllllllllllllIlIllIllllIlllIIIll.nextFloat() - 0.5) * 0.5;
            final double lllllllllllllIlIllIllllIllIlllIl = (lllllllllllllIlIllIllllIlllIIIll.nextFloat() - 0.5) * 0.5;
            double lllllllllllllIlIllIllllIllIlllII = (lllllllllllllIlIllIllllIlllIIIll.nextFloat() - 0.5) * 0.5;
            final int lllllllllllllIlIllIllllIllIllIll = lllllllllllllIlIllIllllIlllIIIll.nextInt(BlockPortal.llllIlIIIlIIl[1]) * BlockPortal.llllIlIIIlIIl[1] - BlockPortal.llllIlIIIlIIl[2];
            if (lIlIlIIlllIIIll(lllllllllllllIlIllIllllIlllIIllI.getBlockState(lllllllllllllIlIllIllllIllIlIlll.west()).getBlock(), this) && lIlIlIIlllIIIll(lllllllllllllIlIllIllllIlllIIllI.getBlockState(lllllllllllllIlIllIllllIllIlIlll.east()).getBlock(), this)) {
                lllllllllllllIlIllIllllIlllIIIIl = lllllllllllllIlIllIllllIllIlIlll.getX() + 0.5 + 0.25 * lllllllllllllIlIllIllllIllIllIll;
                lllllllllllllIlIllIllllIllIllllI = lllllllllllllIlIllIllllIlllIIIll.nextFloat() * 2.0f * lllllllllllllIlIllIllllIllIllIll;
                "".length();
                if ("   ".length() == (121 + 71 - 162 + 149 ^ 159 + 3 + 4 + 17)) {
                    return;
                }
            }
            else {
                lllllllllllllIlIllIllllIllIlllll = lllllllllllllIlIllIllllIllIlIlll.getZ() + 0.5 + 0.25 * lllllllllllllIlIllIllllIllIllIll;
                lllllllllllllIlIllIllllIllIlllII = lllllllllllllIlIllIllllIlllIIIll.nextFloat() * 2.0f * lllllllllllllIlIllIllllIllIllIll;
            }
            lllllllllllllIlIllIllllIlllIIllI.spawnParticle(EnumParticleTypes.PORTAL, lllllllllllllIlIllIllllIlllIIIIl, lllllllllllllIlIllIllllIlllIIIII, lllllllllllllIlIllIllllIllIlllll, lllllllllllllIlIllIllllIllIllllI, lllllllllllllIlIllIllllIllIlllIl, lllllllllllllIlIllIllllIllIlllII, new int[BlockPortal.llllIlIIIlIIl[0]]);
            ++lllllllllllllIlIllIllllIlllIIIlI;
        }
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIllIllllIllIIllIl, final BlockPos lllllllllllllIlIllIllllIllIIllII) {
        return null;
    }
    
    private static boolean lIlIlIIlllIIlII(final int lllllllllllllIlIllIllllIIlIlIllI, final int lllllllllllllIlIllIllllIIlIlIlIl) {
        return lllllllllllllIlIllIllllIIlIlIllI >= lllllllllllllIlIllIllllIIlIlIlIl;
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIllIllllIlllllIIl, final BlockPos lllllllllllllIlIllIllllIllllIlIl, final IBlockState lllllllllllllIlIllIllllIllllIlll, final Entity lllllllllllllIlIllIllllIllllIllI) {
        if (lIlIlIIlllIIIlI(lllllllllllllIlIllIllllIllllIllI.ridingEntity) && lIlIlIIlllIIIlI(lllllllllllllIlIllIllllIllllIllI.riddenByEntity)) {
            lllllllllllllIlIllIllllIllllIllI.func_181015_d(lllllllllllllIlIllIllllIllllIlIl);
        }
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIlIllIlllllIIIlIllI, final BlockPos lllllllllllllIlIllIlllllIIIlIlIl, final EnumFacing lllllllllllllIlIllIlllllIIIIlIII) {
        EnumFacing.Axis lllllllllllllIlIllIlllllIIIlIIll = null;
        final IBlockState lllllllllllllIlIllIlllllIIIlIIlI = lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl);
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl).getBlock(), this)) {
            lllllllllllllIlIllIlllllIIIlIIll = lllllllllllllIlIllIlllllIIIlIIlI.getValue(BlockPortal.AXIS);
            if (lIlIlIIlllIIIlI(lllllllllllllIlIllIlllllIIIlIIll)) {
                return BlockPortal.llllIlIIIlIIl[0] != 0;
            }
            if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIlIIll, EnumFacing.Axis.Z) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.EAST) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.WEST)) {
                return BlockPortal.llllIlIIIlIIl[0] != 0;
            }
            if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIlIIll, EnumFacing.Axis.X) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.SOUTH) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.NORTH)) {
                return BlockPortal.llllIlIIIlIIl[0] != 0;
            }
        }
        int n;
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.west()).getBlock(), this) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.west(BlockPortal.llllIlIIIlIIl[1])).getBlock(), this)) {
            n = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if (null != null) {
                return ((0x6F ^ 0xE ^ (0x6E ^ 0x23)) & (0x6E ^ 0xD ^ (0xDB ^ 0x94) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockPortal.llllIlIIIlIIl[0];
        }
        final boolean lllllllllllllIlIllIlllllIIIlIIIl = n != 0;
        int n2;
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.east()).getBlock(), this) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.east(BlockPortal.llllIlIIIlIIl[1])).getBlock(), this)) {
            n2 = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if ((0x4E ^ 0x4A) < 0) {
                return ((0x1C ^ 0xE) & ~(0xA6 ^ 0xB4)) != 0x0;
            }
        }
        else {
            n2 = BlockPortal.llllIlIIIlIIl[0];
        }
        final boolean lllllllllllllIlIllIlllllIIIlIIII = n2 != 0;
        int n3;
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.north()).getBlock(), this) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.north(BlockPortal.llllIlIIIlIIl[1])).getBlock(), this)) {
            n3 = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if (((0x54 ^ 0x66 ^ (0x6F ^ 0x6)) & (0x91 ^ 0xAA ^ (0x2C ^ 0x4C) ^ -" ".length())) < -" ".length()) {
                return ((0x5E ^ 0x78 ^ (0x94 ^ 0xBF)) & (0x2F ^ 0x28 ^ (0x56 ^ 0x5C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = BlockPortal.llllIlIIIlIIl[0];
        }
        final boolean lllllllllllllIlIllIlllllIIIIllll = n3 != 0;
        int n4;
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.south()).getBlock(), this) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIlIllI.getBlockState(lllllllllllllIlIllIlllllIIIlIlIl.south(BlockPortal.llllIlIIIlIIl[1])).getBlock(), this)) {
            n4 = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if (((0xA7 ^ 0xAA ^ (0xA0 ^ 0xB2)) & (27 + 150 - 81 + 66 ^ 155 + 21 - 42 + 55 ^ -" ".length())) != 0x0) {
                return ((171 + 46 - 76 + 109 ^ 44 + 34 + 97 + 23) & (0x49 ^ 0x2D ^ (0x19 ^ 0x41) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n4 = BlockPortal.llllIlIIIlIIl[0];
        }
        final boolean lllllllllllllIlIllIlllllIIIIlllI = n4 != 0;
        int n5;
        if (lIlIlIIllIlllIl(lllllllllllllIlIllIlllllIIIlIIIl ? 1 : 0) && lIlIlIIllIlllIl(lllllllllllllIlIllIlllllIIIlIIII ? 1 : 0) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIlIIll, EnumFacing.Axis.X)) {
            n5 = BlockPortal.llllIlIIIlIIl[0];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0x4C ^ 0x8 ^ (0xE4 ^ 0x81)) & (0x22 ^ 0x1D ^ (0xD8 ^ 0xC6) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n5 = BlockPortal.llllIlIIIlIIl[2];
        }
        final boolean lllllllllllllIlIllIlllllIIIIllIl = n5 != 0;
        int n6;
        if (lIlIlIIllIlllIl(lllllllllllllIlIllIlllllIIIIllll ? 1 : 0) && lIlIlIIllIlllIl(lllllllllllllIlIllIlllllIIIIlllI ? 1 : 0) && lIlIlIIlllIIIll(lllllllllllllIlIllIlllllIIIlIIll, EnumFacing.Axis.Z)) {
            n6 = BlockPortal.llllIlIIIlIIl[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0x16 ^ 0x71 ^ (0x46 ^ 0x76)) & (0x56 ^ 0x71 ^ (0x2D ^ 0x5D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n6 = BlockPortal.llllIlIIIlIIl[2];
        }
        final boolean lllllllllllllIlIllIlllllIIIIllII = n6 != 0;
        int n7;
        if (lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIIIllIl ? 1 : 0) && lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.WEST)) {
            n7 = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((136 + 223 - 302 + 191 ^ 53 + 27 - 73 + 185) & (0x19 ^ 0x5A ^ (0x77 ^ 0xC) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIIIllIl ? 1 : 0) && lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.EAST)) {
            n7 = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if (((0x34 ^ 0xB) & ~(0x7C ^ 0x43)) != 0x0) {
                return ((0x2D ^ 0x29) & ~(0x42 ^ 0x46)) != 0x0;
            }
        }
        else if (lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIIIllII ? 1 : 0) && lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.NORTH)) {
            n7 = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if ((0xE0 ^ 0x82 ^ (0x77 ^ 0x11)) < 0) {
                return ((0x63 ^ 0x4F ^ (0x44 ^ 0x27)) & (0x1A ^ 0x53 ^ (0x45 ^ 0x43) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIIIllII ? 1 : 0) && lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIIIlIII, EnumFacing.SOUTH)) {
            n7 = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if (-" ".length() == " ".length()) {
                return ((0x93 ^ 0x88) & ~(0x52 ^ 0x49)) != 0x0;
            }
        }
        else {
            n7 = BlockPortal.llllIlIIIlIIl[0];
        }
        return n7 != 0;
    }
    
    private static void lIlIlIIllIllIlI() {
        (llllIlIIIlIIl = new int[9])[0] = ((0x52 ^ 0x48 ^ (0x85 ^ 0xC2)) & (0xE3 ^ 0xA1 ^ (0x36 ^ 0x29) ^ -" ".length()));
        BlockPortal.llllIlIIIlIIl[1] = "  ".length();
        BlockPortal.llllIlIIIlIIl[2] = " ".length();
        BlockPortal.llllIlIIIlIIl[3] = (-(0xFFFFD7CD & 0x3837) & (0xFFFFBFDF & 0x57F4));
        BlockPortal.llllIlIIIlIIl[4] = (0x4A ^ 0x2 ^ (0xC6 ^ 0xB7));
        BlockPortal.llllIlIIIlIIl[5] = (0xC6 ^ 0xA2);
        BlockPortal.llllIlIIIlIIl[6] = (0xDD ^ 0x9E ^ (0x25 ^ 0x62));
        BlockPortal.llllIlIIIlIIl[7] = "   ".length();
        BlockPortal.llllIlIIIlIIl[8] = (0x78 ^ 0x2D ^ (0xF7 ^ 0xAA));
    }
    
    private static boolean lIlIlIIlllIIIll(final Object lllllllllllllIlIllIllllIIlIIlllI, final Object lllllllllllllIlIllIllllIIlIIllIl) {
        return lllllllllllllIlIllIllllIIlIIlllI != lllllllllllllIlIllIllllIIlIIllIl;
    }
    
    private static boolean lIlIlIIllIllIll(final int lllllllllllllIlIllIllllIIlIIIIll) {
        return lllllllllllllIlIllIllllIIlIIIIll != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPortal.llllIlIIIlIIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPortal.llllIlIIIlIIl[0]] = BlockPortal.AXIS;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIllIllllIlllllllI) {
        return BlockPortal.llllIlIIIlIIl[0];
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIllIlllllIllIlIll, final BlockPos lllllllllllllIlIllIlllllIllIIIlI, final IBlockState lllllllllllllIlIllIlllllIllIlIIl, final Random lllllllllllllIlIllIlllllIllIlIII) {
        super.updateTick(lllllllllllllIlIllIlllllIllIlIll, lllllllllllllIlIllIlllllIllIIIlI, lllllllllllllIlIllIlllllIllIlIIl, lllllllllllllIlIllIlllllIllIlIII);
        if (lIlIlIIllIllIll(lllllllllllllIlIllIlllllIllIlIll.provider.isSurfaceWorld() ? 1 : 0) && lIlIlIIllIllIll(lllllllllllllIlIllIlllllIllIlIll.getGameRules().getBoolean(BlockPortal.llllIlIIIIIll[BlockPortal.llllIlIIIlIIl[2]]) ? 1 : 0) && lIlIlIIllIlllII(lllllllllllllIlIllIlllllIllIlIII.nextInt(BlockPortal.llllIlIIIlIIl[3]), lllllllllllllIlIllIlllllIllIlIll.getDifficulty().getDifficultyId())) {
            final int lllllllllllllIlIllIlllllIllIIlll = lllllllllllllIlIllIlllllIllIIIlI.getY();
            BlockPos lllllllllllllIlIllIlllllIllIIllI = lllllllllllllIlIllIlllllIllIIIlI;
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (lIlIlIIllIlllIl(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIllIlllllIllIlIll, lllllllllllllIlIllIlllllIllIIllI) ? 1 : 0) && !lIlIlIIllIllllI(lllllllllllllIlIllIlllllIllIIllI.getY())) {
                lllllllllllllIlIllIlllllIllIIllI = lllllllllllllIlIllIlllllIllIIllI.down();
            }
            if (lIlIlIIllIlllll(lllllllllllllIlIllIlllllIllIIlll) && lIlIlIIllIlllIl(lllllllllllllIlIllIlllllIllIlIll.getBlockState(lllllllllllllIlIllIlllllIllIIllI.up()).getBlock().isNormalCube() ? 1 : 0)) {
                final Entity lllllllllllllIlIllIlllllIllIIlIl = ItemMonsterPlacer.spawnCreature(lllllllllllllIlIllIlllllIllIlIll, BlockPortal.llllIlIIIlIIl[4], lllllllllllllIlIllIlllllIllIIllI.getX() + 0.5, lllllllllllllIlIllIlllllIllIIllI.getY() + 1.1, lllllllllllllIlIllIlllllIllIIllI.getZ() + 0.5);
                if (lIlIlIIlllIIIII(lllllllllllllIlIllIlllllIllIIlIl)) {
                    lllllllllllllIlIllIlllllIllIIlIl.timeUntilPortal = lllllllllllllIlIllIlllllIllIIlIl.getPortalCooldown();
                }
            }
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIllIlllllIIlIllll, final BlockPos lllllllllllllIlIllIlllllIIlIlllI, final IBlockState lllllllllllllIlIllIlllllIIlIllIl, final Block lllllllllllllIlIllIlllllIIlIllII) {
        final EnumFacing.Axis lllllllllllllIlIllIlllllIIlIlIll = lllllllllllllIlIllIlllllIIlIllIl.getValue(BlockPortal.AXIS);
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIlIlIll, EnumFacing.Axis.X)) {
            final Size lllllllllllllIlIllIlllllIIlIlIlI = new Size(lllllllllllllIlIllIlllllIIlIllll, lllllllllllllIlIllIlllllIIlIlllI, EnumFacing.Axis.X);
            if (!lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIlIlIlI.func_150860_b() ? 1 : 0) || lIlIlIIllIlllII(lllllllllllllIlIllIlllllIIlIlIlI.field_150864_e, lllllllllllllIlIllIlllllIIlIlIlI.field_150868_h * lllllllllllllIlIllIlllllIIlIlIlI.field_150862_g)) {
                lllllllllllllIlIllIlllllIIlIllll.setBlockState(lllllllllllllIlIllIlllllIIlIlllI, Blocks.air.getDefaultState());
                "".length();
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
        }
        else if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIIlIlIll, EnumFacing.Axis.Z)) {
            final Size lllllllllllllIlIllIlllllIIlIlIIl = new Size(lllllllllllllIlIllIlllllIIlIllll, lllllllllllllIlIllIlllllIIlIlllI, EnumFacing.Axis.Z);
            if (!lIlIlIIllIllIll(lllllllllllllIlIllIlllllIIlIlIIl.func_150860_b() ? 1 : 0) || lIlIlIIllIlllII(lllllllllllllIlIllIlllllIIlIlIIl.field_150864_e, lllllllllllllIlIllIlllllIIlIlIIl.field_150868_h * lllllllllllllIlIllIlllllIIlIlIIl.field_150862_g)) {
                lllllllllllllIlIllIlllllIIlIllll.setBlockState(lllllllllllllIlIllIlllllIIlIlllI, Blocks.air.getDefaultState());
                "".length();
            }
        }
    }
    
    private static boolean lIlIlIIllIllllI(final int lllllllllllllIlIllIllllIIIllllll) {
        return lllllllllllllIlIllIllllIIIllllll <= 0;
    }
    
    public BlockPortal() {
        super(Material.portal, (boolean)(BlockPortal.llllIlIIIlIIl[0] != 0));
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockPortal.AXIS, EnumFacing.Axis.X));
        this.setTickRandomly((boolean)(BlockPortal.llllIlIIIlIIl[2] != 0));
        "".length();
    }
    
    private static boolean lIlIlIIlllIIIIl(final Object lllllllllllllIlIllIllllIIlIIlIII, final Object lllllllllllllIlIllIllllIIlIIIlll) {
        return lllllllllllllIlIllIllllIIlIIlIII == lllllllllllllIlIllIllllIIlIIIlll;
    }
    
    private static boolean lIlIlIIllIlllIl(final int lllllllllllllIlIllIllllIIlIIIIIl) {
        return lllllllllllllIlIllIllllIIlIIIIIl == 0;
    }
    
    private static boolean lIlIlIIlllIIIII(final Object lllllllllllllIlIllIllllIIlIIlIll) {
        return lllllllllllllIlIllIllllIIlIIlIll != null;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockPortal.llllIlIIIlIIl[0] != 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIllIlllllIlIllIll, final BlockPos lllllllllllllIlIllIlllllIlIllIlI, final IBlockState lllllllllllllIlIllIlllllIlIllIIl) {
        return null;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIllIllllIllIIlIII) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyEnum<EnumFacing.Axis> axis = BlockPortal.AXIS;
        EnumFacing.Axis axis2;
        if (lIlIlIIlllIIlIl(lllllllllllllIlIllIllllIllIIlIII & BlockPortal.llllIlIIIlIIl[7], BlockPortal.llllIlIIIlIIl[1])) {
            axis2 = EnumFacing.Axis.Z;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        else {
            axis2 = EnumFacing.Axis.X;
        }
        return defaultState.withProperty((IProperty<Comparable>)axis, axis2);
    }
    
    public static int getMetaForAxis(final EnumFacing.Axis lllllllllllllIlIllIlllllIlIIIlII) {
        int n;
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIlIIIlII, EnumFacing.Axis.X)) {
            n = BlockPortal.llllIlIIIlIIl[2];
            "".length();
            if ((112 + 124 - 116 + 75 ^ 111 + 48 + 34 + 6) <= "  ".length()) {
                return (0x7F ^ 0x75 ^ (0x63 ^ 0x31)) & (0x76 ^ 0x18 ^ (0x66 ^ 0x50) ^ -" ".length());
            }
        }
        else if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIlIIIlII, EnumFacing.Axis.Z)) {
            n = BlockPortal.llllIlIIIlIIl[1];
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) <= -" ".length()) {
                return (165 + 118 - 279 + 166 ^ 31 + 132 - 64 + 38) & (0x5A ^ 0x5C ^ (0x1A ^ 0x3F) ^ -" ".length());
            }
        }
        else {
            n = BlockPortal.llllIlIIIlIIl[0];
        }
        return n;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIllIlllllIlIIlIll, final BlockPos lllllllllllllIlIllIlllllIlIIlIlI) {
        final EnumFacing.Axis lllllllllllllIlIllIlllllIlIIllll = lllllllllllllIlIllIlllllIlIIlIll.getBlockState(lllllllllllllIlIllIlllllIlIIlIlI).getValue(BlockPortal.AXIS);
        float lllllllllllllIlIllIlllllIlIIlllI = 0.125f;
        float lllllllllllllIlIllIlllllIlIIllIl = 0.125f;
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIlIIllll, EnumFacing.Axis.X)) {
            lllllllllllllIlIllIlllllIlIIlllI = 0.5f;
        }
        if (lIlIlIIlllIIIIl(lllllllllllllIlIllIlllllIlIIllll, EnumFacing.Axis.Z)) {
            lllllllllllllIlIllIlllllIlIIllIl = 0.5f;
        }
        this.setBlockBounds(0.5f - lllllllllllllIlIllIlllllIlIIlllI, 0.0f, 0.5f - lllllllllllllIlIllIlllllIlIIllIl, 0.5f + lllllllllllllIlIllIlllllIlIIlllI, 1.0f, 0.5f + lllllllllllllIlIllIlllllIlIIllIl);
    }
    
    private static boolean lIlIlIIlllIIIlI(final Object lllllllllllllIlIllIllllIIlIIIlIl) {
        return lllllllllllllIlIllIllllIIlIIIlIl == null;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIllIllllIllIIIIlI) {
        return getMetaForAxis(lllllllllllllIlIllIllllIllIIIIlI.getValue(BlockPortal.AXIS));
    }
    
    public static class Size
    {
        private final /* synthetic */ EnumFacing.Axis axis;
        private final /* synthetic */ EnumFacing field_150863_d;
        private /* synthetic */ BlockPos field_150861_f;
        private /* synthetic */ int field_150868_h;
        private /* synthetic */ int field_150864_e;
        private static final /* synthetic */ int[] lIlIlIllIIIlIl;
        private final /* synthetic */ EnumFacing field_150866_c;
        private /* synthetic */ int field_150862_g;
        private final /* synthetic */ World world;
        
        private static boolean lllIlllIlllIlIl(final int lllllllllllllIIIlIIIIIIIllIlllll, final int lllllllllllllIIIlIIIIIIIllIllllI) {
            return lllllllllllllIIIlIIIIIIIllIlllll >= lllllllllllllIIIlIIIIIIIllIllllI;
        }
        
        private static boolean lllIlllIllllIII(final Object lllllllllllllIIIlIIIIIIIllIlIIll, final Object lllllllllllllIIIlIIIIIIIllIlIIlI) {
            return lllllllllllllIIIlIIIIIIIllIlIIll != lllllllllllllIIIlIIIIIIIllIlIIlI;
        }
        
        protected boolean func_150857_a(final Block lllllllllllllIIIlIIIIIIlIIIIIIII) {
            if (lllIlllIllllIII(lllllllllllllIIIlIIIIIIlIIIIIIII.blockMaterial, Material.air) && lllIlllIllllIII(lllllllllllllIIIlIIIIIIlIIIIIIII, Blocks.fire) && lllIlllIllllIII(lllllllllllllIIIlIIIIIIlIIIIIIII, Blocks.portal)) {
                return Size.lIlIlIllIIIlIl[0] != 0;
            }
            return Size.lIlIlIllIIIlIl[2] != 0;
        }
        
        private static void lllIlllIllIllll() {
            (lIlIlIllIIIlIl = new int[6])[0] = ((0x75 ^ 0x4B ^ (0xF8 ^ 0x82)) & (0xE ^ 0x3 ^ (0x14 ^ 0x5D) ^ -" ".length()));
            Size.lIlIlIllIIIlIl[1] = (0x35 ^ 0x20);
            Size.lIlIlIllIIIlIl[2] = " ".length();
            Size.lIlIlIllIIIlIl[3] = "  ".length();
            Size.lIlIlIllIIIlIl[4] = (0x35 ^ 0x23);
            Size.lIlIlIllIIIlIl[5] = "   ".length();
        }
        
        private static boolean lllIlllIlllIlII(final int lllllllllllllIIIlIIIIIIIllIIIllI) {
            return lllllllllllllIIIlIIIIIIIllIIIllI >= 0;
        }
        
        private static boolean lllIlllIlllIlll(final int lllllllllllllIIIlIIIIIIIllIIlIlI) {
            return lllllllllllllIIIlIIIIIIIllIIlIlI != 0;
        }
        
        private static boolean lllIlllIlllIIIl(final int lllllllllllllIIIlIIIIIIIllIlIlll, final int lllllllllllllIIIlIIIIIIIllIlIllI) {
            return lllllllllllllIIIlIIIIIIIllIlIlll > lllllllllllllIIIlIIIIIIIllIlIllI;
        }
        
        private static boolean lllIlllIllllIlI(final int lllllllllllllIIIlIIIIIIIllIllIll, final int lllllllllllllIIIlIIIIIIIllIllIlI) {
            return lllllllllllllIIIlIIIIIIIllIllIll <= lllllllllllllIIIlIIIIIIIllIllIlI;
        }
        
        public boolean func_150860_b() {
            if (lllIlllIlllIllI(this.field_150861_f) && lllIlllIlllIlIl(this.field_150868_h, Size.lIlIlIllIIIlIl[3]) && lllIlllIllllIlI(this.field_150868_h, Size.lIlIlIllIIIlIl[1]) && lllIlllIlllIlIl(this.field_150862_g, Size.lIlIlIllIIIlIl[5]) && lllIlllIllllIlI(this.field_150862_g, Size.lIlIlIllIIIlIl[1])) {
                return Size.lIlIlIllIIIlIl[2] != 0;
            }
            return Size.lIlIlIllIIIlIl[0] != 0;
        }
        
        public int func_181100_a() {
            return this.field_150862_g;
        }
        
        private static boolean lllIlllIlllIIlI(final int lllllllllllllIIIlIIIIIIIllIIIlII) {
            return lllllllllllllIIIlIIIIIIIllIIIlII > 0;
        }
        
        private static boolean lllIlllIlllIIll(final int lllllllllllllIIIlIIIIIIIllIIlIII) {
            return lllllllllllllIIIlIIIIIIIllIIlIII == 0;
        }
        
        protected int func_150858_a() {
            this.field_150862_g = Size.lIlIlIllIIIlIl[0];
            "".length();
            if (((0x9E ^ 0xA1) & ~(0x1B ^ 0x24)) != 0x0) {
                return (0x7A ^ 0x36) & ~(0x13 ^ 0x5F);
            }
        Label_0389:
            while (!lllIlllIlllIlIl(this.field_150862_g, Size.lIlIlIllIIIlIl[1])) {
                int lllllllllllllIIIlIIIIIIlIIIIlIlI = Size.lIlIlIllIIIlIl[0];
                "".length();
                if (((0x36 ^ 0x7F) & ~(0xE0 ^ 0xA9)) <= -" ".length()) {
                    return (0xC0 ^ 0xC4) & ~(0x6E ^ 0x6A);
                }
                while (!lllIlllIlllIlIl(lllllllllllllIIIlIIIIIIlIIIIlIlI, this.field_150868_h)) {
                    final BlockPos lllllllllllllIIIlIIIIIIlIIIIlIIl = this.field_150861_f.offset(this.field_150866_c, lllllllllllllIIIlIIIIIIlIIIIlIlI).up(this.field_150862_g);
                    Block lllllllllllllIIIlIIIIIIlIIIIlIII = this.world.getBlockState(lllllllllllllIIIlIIIIIIlIIIIlIIl).getBlock();
                    if (lllIlllIlllIIll(this.func_150857_a(lllllllllllllIIIlIIIIIIlIIIIlIII) ? 1 : 0)) {
                        "".length();
                        if ("   ".length() > (0xB4 ^ 0xB0)) {
                            return (0x1F ^ 0x29) & ~(0x27 ^ 0x11);
                        }
                        break Label_0389;
                    }
                    else {
                        if (lllIlllIlllIIII(lllllllllllllIIIlIIIIIIlIIIIlIII, Blocks.portal)) {
                            this.field_150864_e += Size.lIlIlIllIIIlIl[2];
                        }
                        if (lllIlllIlllIIll(lllllllllllllIIIlIIIIIIlIIIIlIlI)) {
                            lllllllllllllIIIlIIIIIIlIIIIlIII = this.world.getBlockState(lllllllllllllIIIlIIIIIIlIIIIlIIl.offset(this.field_150863_d)).getBlock();
                            if (lllIlllIllllIII(lllllllllllllIIIlIIIIIIlIIIIlIII, Blocks.obsidian)) {
                                "".length();
                                if ("   ".length() <= 0) {
                                    return (0xF ^ 0x1D) & ~(0x56 ^ 0x44);
                                }
                                break Label_0389;
                            }
                        }
                        else if (lllIlllIllllIIl(lllllllllllllIIIlIIIIIIlIIIIlIlI, this.field_150868_h - Size.lIlIlIllIIIlIl[2])) {
                            lllllllllllllIIIlIIIIIIlIIIIlIII = this.world.getBlockState(lllllllllllllIIIlIIIIIIlIIIIlIIl.offset(this.field_150866_c)).getBlock();
                            if (lllIlllIllllIII(lllllllllllllIIIlIIIIIIlIIIIlIII, Blocks.obsidian)) {
                                "".length();
                                if ((0x71 ^ 0x75) <= 0) {
                                    return (0xB9 ^ 0x96) & ~(0x4 ^ 0x2B);
                                }
                                break Label_0389;
                            }
                        }
                        ++lllllllllllllIIIlIIIIIIlIIIIlIlI;
                    }
                }
                this.field_150862_g += Size.lIlIlIllIIIlIl[2];
            }
            int lllllllllllllIIIlIIIIIIlIIIIIlll = Size.lIlIlIllIIIlIl[0];
            "".length();
            if ("  ".length() <= 0) {
                return (0x6D ^ 0x33 ^ (0x44 ^ 0x16)) & ("  ".length() ^ (0x6E ^ 0x60) ^ -" ".length());
            }
            while (!lllIlllIlllIlIl(lllllllllllllIIIlIIIIIIlIIIIIlll, this.field_150868_h)) {
                if (lllIlllIllllIII(this.world.getBlockState(this.field_150861_f.offset(this.field_150866_c, lllllllllllllIIIlIIIIIIlIIIIIlll).up(this.field_150862_g)).getBlock(), Blocks.obsidian)) {
                    this.field_150862_g = Size.lIlIlIllIIIlIl[0];
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return "  ".length() & ~"  ".length();
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIIlIIIIIIlIIIIIlll;
                }
            }
            if (lllIlllIllllIlI(this.field_150862_g, Size.lIlIlIllIIIlIl[1]) && lllIlllIlllIlIl(this.field_150862_g, Size.lIlIlIllIIIlIl[5])) {
                return this.field_150862_g;
            }
            this.field_150861_f = null;
            this.field_150868_h = Size.lIlIlIllIIIlIl[0];
            this.field_150862_g = Size.lIlIlIllIIIlIl[0];
            return Size.lIlIlIllIIIlIl[0];
        }
        
        public Size(final World lllllllllllllIIIlIIIIIIlIIlIlIIl, BlockPos lllllllllllllIIIlIIIIIIlIIlIlIII, final EnumFacing.Axis lllllllllllllIIIlIIIIIIlIIlIIlll) {
            this.field_150864_e = Size.lIlIlIllIIIlIl[0];
            this.world = lllllllllllllIIIlIIIIIIlIIlIlIIl;
            this.axis = lllllllllllllIIIlIIIIIIlIIlIIlll;
            if (lllIlllIlllIIII(lllllllllllllIIIlIIIIIIlIIlIIlll, EnumFacing.Axis.X)) {
                this.field_150863_d = EnumFacing.EAST;
                this.field_150866_c = EnumFacing.WEST;
                "".length();
                if (-"   ".length() > 0) {
                    throw null;
                }
            }
            else {
                this.field_150863_d = EnumFacing.NORTH;
                this.field_150866_c = EnumFacing.SOUTH;
            }
            final BlockPos lllllllllllllIIIlIIIIIIlIIlIllII = (BlockPos)lllllllllllllIIIlIIIIIIlIIlIlIII;
            "".length();
            if (-"   ".length() > 0) {
                throw null;
            }
            while (lllIlllIlllIIIl(((Vec3i)lllllllllllllIIIlIIIIIIlIIlIlIII).getY(), lllllllllllllIIIlIIIIIIlIIlIllII.getY() - Size.lIlIlIllIIIlIl[1]) && lllIlllIlllIIlI(((Vec3i)lllllllllllllIIIlIIIIIIlIIlIlIII).getY()) && !lllIlllIlllIIll(this.func_150857_a(lllllllllllllIIIlIIIIIIlIIlIlIIl.getBlockState(((BlockPos)lllllllllllllIIIlIIIIIIlIIlIlIII).down()).getBlock()) ? 1 : 0)) {
                lllllllllllllIIIlIIIIIIlIIlIlIII = ((BlockPos)lllllllllllllIIIlIIIIIIlIIlIlIII).down();
            }
            final int lllllllllllllIIIlIIIIIIlIIlIlIll = this.func_180120_a((BlockPos)lllllllllllllIIIlIIIIIIlIIlIlIII, this.field_150863_d) - Size.lIlIlIllIIIlIl[2];
            if (lllIlllIlllIlII(lllllllllllllIIIlIIIIIIlIIlIlIll)) {
                this.field_150861_f = ((BlockPos)lllllllllllllIIIlIIIIIIlIIlIlIII).offset(this.field_150863_d, lllllllllllllIIIlIIIIIIlIIlIlIll);
                this.field_150868_h = this.func_180120_a(this.field_150861_f, this.field_150866_c);
                if (!lllIlllIlllIlIl(this.field_150868_h, Size.lIlIlIllIIIlIl[3]) || lllIlllIlllIIIl(this.field_150868_h, Size.lIlIlIllIIIlIl[1])) {
                    this.field_150861_f = null;
                    this.field_150868_h = Size.lIlIlIllIIIlIl[0];
                }
            }
            if (lllIlllIlllIllI(this.field_150861_f)) {
                this.field_150862_g = this.func_150858_a();
            }
        }
        
        private static boolean lllIlllIlllIllI(final Object lllllllllllllIIIlIIIIIIIllIIllII) {
            return lllllllllllllIIIlIIIIIIIllIIllII != null;
        }
        
        public int func_181101_b() {
            return this.field_150868_h;
        }
        
        protected int func_180120_a(final BlockPos lllllllllllllIIIlIIIIIIlIIIllIIl, final EnumFacing lllllllllllllIIIlIIIIIIlIIIllllI) {
            int lllllllllllllIIIlIIIIIIlIIIlllIl = Size.lIlIlIllIIIlIl[0];
            "".length();
            if (-" ".length() > "  ".length()) {
                return (25 + 127 - 35 + 28 ^ 91 + 71 - 121 + 154) & (0x5B ^ 0x7E ^ (0xEC ^ 0x9B) ^ -" ".length());
            }
            while (!lllIlllIlllIlIl(lllllllllllllIIIlIIIIIIlIIIlllIl, Size.lIlIlIllIIIlIl[4])) {
                final BlockPos lllllllllllllIIIlIIIIIIlIIIlllII = lllllllllllllIIIlIIIIIIlIIIllIIl.offset(lllllllllllllIIIlIIIIIIlIIIllllI, lllllllllllllIIIlIIIIIIlIIIlllIl);
                if (!lllIlllIlllIlll(this.func_150857_a(this.world.getBlockState(lllllllllllllIIIlIIIIIIlIIIlllII).getBlock()) ? 1 : 0)) {
                    break;
                }
                if (lllIlllIllllIII(this.world.getBlockState(lllllllllllllIIIlIIIIIIlIIIlllII.down()).getBlock(), Blocks.obsidian)) {
                    "".length();
                    if (((0xEB ^ 0xBC ^ (0x52 ^ 0x3)) & (0x28 ^ 0x7C ^ (0x97 ^ 0xC5) ^ -" ".length())) < 0) {
                        return (0x64 ^ 0x5D ^ (0x73 ^ 0x7D)) & (0x5C ^ 0x6E ^ (0xAB ^ 0xAE) ^ -" ".length());
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIIlIIIIIIlIIIlllIl;
                }
            }
            final Block lllllllllllllIIIlIIIIIIlIIIllIll = this.world.getBlockState(lllllllllllllIIIlIIIIIIlIIIllIIl.offset(lllllllllllllIIIlIIIIIIlIIIllllI, lllllllllllllIIIlIIIIIIlIIIlllIl)).getBlock();
            int n;
            if (lllIlllIlllIIII(lllllllllllllIIIlIIIIIIlIIIllIll, Blocks.obsidian)) {
                n = lllllllllllllIIIlIIIIIIlIIIlllIl;
                "".length();
                if ((0x5B ^ 0x65 ^ (0xF9 ^ 0xC3)) <= 0) {
                    return (0x1D ^ 0x65 ^ (0xEC ^ 0xA0)) & (0x3D ^ 0x59 ^ (0x5B ^ 0xB) ^ -" ".length());
                }
            }
            else {
                n = Size.lIlIlIllIIIlIl[0];
            }
            return n;
        }
        
        public void func_150859_c() {
            int lllllllllllllIIIlIIIIIIIllllIllI = Size.lIlIlIllIIIlIl[0];
            "".length();
            if (" ".length() >= (0x6D ^ 0xF ^ (0xEA ^ 0x8C))) {
                return;
            }
            while (!lllIlllIlllIlIl(lllllllllllllIIIlIIIIIIIllllIllI, this.field_150868_h)) {
                final BlockPos lllllllllllllIIIlIIIIIIIllllIlIl = this.field_150861_f.offset(this.field_150866_c, lllllllllllllIIIlIIIIIIIllllIllI);
                int lllllllllllllIIIlIIIIIIIllllIlII = Size.lIlIlIllIIIlIl[0];
                "".length();
                if (-(0x18 ^ 0x5B ^ (0xEA ^ 0xAD)) > 0) {
                    return;
                }
                while (!lllIlllIlllIlIl(lllllllllllllIIIlIIIIIIIllllIlII, this.field_150862_g)) {
                    this.world.setBlockState(lllllllllllllIIIlIIIIIIIllllIlIl.up(lllllllllllllIIIlIIIIIIIllllIlII), Blocks.portal.getDefaultState().withProperty(BlockPortal.AXIS, this.axis), Size.lIlIlIllIIIlIl[3]);
                    "".length();
                    ++lllllllllllllIIIlIIIIIIIllllIlII;
                }
                ++lllllllllllllIIIlIIIIIIIllllIllI;
            }
        }
        
        private static boolean lllIlllIllllIIl(final int lllllllllllllIIIlIIIIIIIlllIIIll, final int lllllllllllllIIIlIIIIIIIlllIIIlI) {
            return lllllllllllllIIIlIIIIIIIlllIIIll == lllllllllllllIIIlIIIIIIIlllIIIlI;
        }
        
        private static boolean lllIlllIlllIIII(final Object lllllllllllllIIIlIIIIIIIllIIllll, final Object lllllllllllllIIIlIIIIIIIllIIlllI) {
            return lllllllllllllIIIlIIIIIIIllIIllll == lllllllllllllIIIlIIIIIIIllIIlllI;
        }
        
        static {
            lllIlllIllIllll();
        }
    }
}
