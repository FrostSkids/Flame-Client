// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.EntityLivingBase;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySnowman;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.IBlockState;
import com.google.common.base.Predicate;

public class BlockPumpkin extends BlockDirectional
{
    private static final /* synthetic */ Predicate<IBlockState> field_181085_Q;
    private /* synthetic */ BlockPattern snowmanPattern;
    private /* synthetic */ BlockPattern snowmanBasePattern;
    private /* synthetic */ BlockPattern golemPattern;
    private static final /* synthetic */ String[] lIIlIllIlIllll;
    private /* synthetic */ BlockPattern golemBasePattern;
    private static final /* synthetic */ int[] lIIlIllIllIIlI;
    
    private static boolean llIlIIllIIlIlll(final int lllllllllllllIIllIIIlIlIlllIIIII, final int lllllllllllllIIllIIIlIlIllIlllll) {
        return lllllllllllllIIllIIIlIlIlllIIIII < lllllllllllllIIllIIIlIlIllIlllll;
    }
    
    protected BlockPattern getSnowmanBasePattern() {
        if (llIlIIllIIlIIll(this.snowmanBasePattern)) {
            final FactoryBlockPattern start = FactoryBlockPattern.start();
            final String[] lllllllllllllIIIIllllllIIIllIIll = new String[BlockPumpkin.lIIlIllIllIIlI[4]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[1]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[1]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[0]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[0]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[2]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[2]];
            this.snowmanBasePattern = start.aisle(lllllllllllllIIIIllllllIIIllIIll).where((char)BlockPumpkin.lIIlIllIllIIlI[5], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.snow))).build();
        }
        return this.snowmanBasePattern;
    }
    
    protected BlockPattern getGolemPattern() {
        if (llIlIIllIIlIIll(this.golemPattern)) {
            final FactoryBlockPattern start = FactoryBlockPattern.start();
            final String[] lllllllllllllIIIIllllllIIIllIIll = new String[BlockPumpkin.lIIlIllIllIIlI[4]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[1]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[13]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[0]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[14]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[2]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[15]];
            this.golemPattern = start.aisle(lllllllllllllIIIIllllllIIIllIIll).where((char)BlockPumpkin.lIIlIllIllIIlI[8], BlockWorldState.hasState(BlockPumpkin.field_181085_Q)).where((char)BlockPumpkin.lIIlIllIllIIlI[5], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.iron_block))).where((char)BlockPumpkin.lIIlIllIllIIlI[12], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.air))).build();
        }
        return this.golemPattern;
    }
    
    public boolean canDispenserPlace(final World lllllllllllllIIllIIIlIllIllIllII, final BlockPos lllllllllllllIIllIIIlIllIllIlllI) {
        if (llIlIIllIIlIIll(this.getSnowmanBasePattern().match(lllllllllllllIIllIIIlIllIllIllII, lllllllllllllIIllIIIlIllIllIlllI)) && llIlIIllIIlIIll(this.getGolemBasePattern().match(lllllllllllllIIllIIIlIllIllIllII, lllllllllllllIIllIIIlIllIllIlllI))) {
            return BlockPumpkin.lIIlIllIllIIlI[1] != 0;
        }
        return BlockPumpkin.lIIlIllIllIIlI[0] != 0;
    }
    
    private static void llIlIIllIIlIIlI() {
        (lIIlIllIllIIlI = new int[17])[0] = " ".length();
        BlockPumpkin.lIIlIllIllIIlI[1] = ((0x9A ^ 0x8A ^ (0x75 ^ 0x51)) & (19 + 16 + 30 + 122 ^ 88 + 51 - 30 + 34 ^ -" ".length()));
        BlockPumpkin.lIIlIllIllIIlI[2] = "  ".length();
        BlockPumpkin.lIIlIllIllIIlI[3] = (0xFC ^ 0x84);
        BlockPumpkin.lIIlIllIllIIlI[4] = "   ".length();
        BlockPumpkin.lIIlIllIllIIlI[5] = (0x24 ^ 0x7);
        BlockPumpkin.lIIlIllIllIIlI[6] = (0x4E ^ 0x46 ^ (0x8C ^ 0x80));
        BlockPumpkin.lIIlIllIllIIlI[7] = (97 + 94 - 189 + 128 ^ 66 + 97 - 150 + 122);
        BlockPumpkin.lIIlIllIllIIlI[8] = (0x18 ^ 0x70 ^ (0x65 ^ 0x53));
        BlockPumpkin.lIIlIllIllIIlI[9] = (86 + 80 - 158 + 126 ^ 4 + 62 - 49 + 111);
        BlockPumpkin.lIIlIllIllIIlI[10] = (0xE1 ^ 0xA6 ^ (0xC5 ^ 0x85));
        BlockPumpkin.lIIlIllIllIIlI[11] = (0x42 ^ 0x4A);
        BlockPumpkin.lIIlIllIllIIlI[12] = (55 + 44 + 15 + 141 ^ 79 + 51 - 98 + 97);
        BlockPumpkin.lIIlIllIllIIlI[13] = (0x9E ^ 0x97);
        BlockPumpkin.lIIlIllIllIIlI[14] = (0x2D ^ 0x60 ^ (0x45 ^ 0x2));
        BlockPumpkin.lIIlIllIllIIlI[15] = (123 + 141 - 173 + 112 ^ 83 + 43 - 28 + 94);
        BlockPumpkin.lIIlIllIllIIlI[16] = (0x56 ^ 0x5A ^ ((0x58 ^ 0x44) & ~(0x8 ^ 0x14)));
    }
    
    private static boolean llIlIIllIIlIIll(final Object lllllllllllllIIllIIIlIlIllIllIll) {
        return lllllllllllllIIllIIIlIlIllIllIll == null;
    }
    
    protected BlockPumpkin() {
        super(Material.gourd, MapColor.adobeColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockPumpkin.FACING, EnumFacing.NORTH));
        this.setTickRandomly((boolean)(BlockPumpkin.lIIlIllIllIIlI[0] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static String llIlIIllIIIIIIl(String lllllllllllllIIllIIIlIlIlllIllll, final String lllllllllllllIIllIIIlIlIllllIIll) {
        lllllllllllllIIllIIIlIlIlllIllll = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIlIlIlllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIlIlIllllIIlI = new StringBuilder();
        final char[] lllllllllllllIIllIIIlIlIllllIIIl = lllllllllllllIIllIIIlIlIllllIIll.toCharArray();
        int lllllllllllllIIllIIIlIlIllllIIII = BlockPumpkin.lIIlIllIllIIlI[1];
        final long lllllllllllllIIllIIIlIlIlllIlIlI = (Object)lllllllllllllIIllIIIlIlIlllIllll.toCharArray();
        final float lllllllllllllIIllIIIlIlIlllIlIIl = lllllllllllllIIllIIIlIlIlllIlIlI.length;
        long lllllllllllllIIllIIIlIlIlllIlIII = BlockPumpkin.lIIlIllIllIIlI[1];
        while (llIlIIllIIlIlll((int)lllllllllllllIIllIIIlIlIlllIlIII, (int)lllllllllllllIIllIIIlIlIlllIlIIl)) {
            final char lllllllllllllIIllIIIlIlIllllIlIl = lllllllllllllIIllIIIlIlIlllIlIlI[lllllllllllllIIllIIIlIlIlllIlIII];
            lllllllllllllIIllIIIlIlIllllIIlI.append((char)(lllllllllllllIIllIIIlIlIllllIlIl ^ lllllllllllllIIllIIIlIlIllllIIIl[lllllllllllllIIllIIIlIlIllllIIII % lllllllllllllIIllIIIlIlIllllIIIl.length]));
            "".length();
            ++lllllllllllllIIllIIIlIlIllllIIII;
            ++lllllllllllllIIllIIIlIlIlllIlIII;
            "".length();
            if ((0x56 ^ 0x40 ^ (0xAA ^ 0xB8)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIlIlIllllIIlI);
    }
    
    private void trySpawnGolem(final World lllllllllllllIIllIIIlIllIlIIllIl, final BlockPos lllllllllllllIIllIIIlIllIlIIllII) {
        BlockPattern.PatternHelper lllllllllllllIIllIIIlIllIlIllllI;
        if (llIlIIllIIlIlII(lllllllllllllIIllIIIlIllIlIllllI = this.getSnowmanPattern().match(lllllllllllllIIllIIIlIllIlIIllIl, lllllllllllllIIllIIIlIllIlIIllII))) {
            int lllllllllllllIIllIIIlIllIlIlllIl = BlockPumpkin.lIIlIllIllIIlI[1];
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
            while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIlllIl, this.getSnowmanPattern().getThumbLength())) {
                final BlockWorldState lllllllllllllIIllIIIlIllIlIlllII = lllllllllllllIIllIIIlIllIlIllllI.translateOffset(BlockPumpkin.lIIlIllIllIIlI[1], lllllllllllllIIllIIIlIllIlIlllIl, BlockPumpkin.lIIlIllIllIIlI[1]);
                lllllllllllllIIllIIIlIllIlIIllIl.setBlockState(lllllllllllllIIllIIIlIllIlIlllII.getPos(), Blocks.air.getDefaultState(), BlockPumpkin.lIIlIllIllIIlI[2]);
                "".length();
                ++lllllllllllllIIllIIIlIllIlIlllIl;
            }
            final EntitySnowman lllllllllllllIIllIIIlIllIlIllIll = new EntitySnowman(lllllllllllllIIllIIIlIllIlIIllIl);
            final BlockPos lllllllllllllIIllIIIlIllIlIllIlI = lllllllllllllIIllIIIlIllIlIllllI.translateOffset(BlockPumpkin.lIIlIllIllIIlI[1], BlockPumpkin.lIIlIllIllIIlI[2], BlockPumpkin.lIIlIllIllIIlI[1]).getPos();
            lllllllllllllIIllIIIlIllIlIllIll.setLocationAndAngles(lllllllllllllIIllIIIlIllIlIllIlI.getX() + 0.5, lllllllllllllIIllIIIlIllIlIllIlI.getY() + 0.05, lllllllllllllIIllIIIlIllIlIllIlI.getZ() + 0.5, 0.0f, 0.0f);
            lllllllllllllIIllIIIlIllIlIIllIl.spawnEntityInWorld(lllllllllllllIIllIIIlIllIlIllIll);
            "".length();
            int lllllllllllllIIllIIIlIllIlIllIIl = BlockPumpkin.lIIlIllIllIIlI[1];
            "".length();
            if (((0x71 ^ 0x10 ^ (0xF9 ^ 0xAD)) & (27 + 64 + 41 + 19 ^ 44 + 1 + 102 + 15 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIllIIl, BlockPumpkin.lIIlIllIllIIlI[3])) {
                lllllllllllllIIllIIIlIllIlIIllIl.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, lllllllllllllIIllIIIlIllIlIllIlI.getX() + lllllllllllllIIllIIIlIllIlIIllIl.rand.nextDouble(), lllllllllllllIIllIIIlIllIlIllIlI.getY() + lllllllllllllIIllIIIlIllIlIIllIl.rand.nextDouble() * 2.5, lllllllllllllIIllIIIlIllIlIllIlI.getZ() + lllllllllllllIIllIIIlIllIlIIllIl.rand.nextDouble(), 0.0, 0.0, 0.0, new int[BlockPumpkin.lIIlIllIllIIlI[1]]);
                ++lllllllllllllIIllIIIlIllIlIllIIl;
            }
            int lllllllllllllIIllIIIlIllIlIllIII = BlockPumpkin.lIIlIllIllIIlI[1];
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
            while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIllIII, this.getSnowmanPattern().getThumbLength())) {
                final BlockWorldState lllllllllllllIIllIIIlIllIlIlIlll = lllllllllllllIIllIIIlIllIlIllllI.translateOffset(BlockPumpkin.lIIlIllIllIIlI[1], lllllllllllllIIllIIIlIllIlIllIII, BlockPumpkin.lIIlIllIllIIlI[1]);
                lllllllllllllIIllIIIlIllIlIIllIl.notifyNeighborsRespectDebug(lllllllllllllIIllIIIlIllIlIlIlll.getPos(), Blocks.air);
                ++lllllllllllllIIllIIIlIllIlIllIII;
            }
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else if (llIlIIllIIlIlII(lllllllllllllIIllIIIlIllIlIllllI = this.getGolemPattern().match(lllllllllllllIIllIIIlIllIlIIllIl, lllllllllllllIIllIIIlIllIlIIllII))) {
            int lllllllllllllIIllIIIlIllIlIlIllI = BlockPumpkin.lIIlIllIllIIlI[1];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIlIllI, this.getGolemPattern().getPalmLength())) {
                int lllllllllllllIIllIIIlIllIlIlIlIl = BlockPumpkin.lIIlIllIllIIlI[1];
                "".length();
                if ((0x3C ^ 0x38) > (0x52 ^ 0x56)) {
                    return;
                }
                while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIlIlIl, this.getGolemPattern().getThumbLength())) {
                    lllllllllllllIIllIIIlIllIlIIllIl.setBlockState(lllllllllllllIIllIIIlIllIlIllllI.translateOffset(lllllllllllllIIllIIIlIllIlIlIllI, lllllllllllllIIllIIIlIllIlIlIlIl, BlockPumpkin.lIIlIllIllIIlI[1]).getPos(), Blocks.air.getDefaultState(), BlockPumpkin.lIIlIllIllIIlI[2]);
                    "".length();
                    ++lllllllllllllIIllIIIlIllIlIlIlIl;
                }
                ++lllllllllllllIIllIIIlIllIlIlIllI;
            }
            final BlockPos lllllllllllllIIllIIIlIllIlIlIlII = lllllllllllllIIllIIIlIllIlIllllI.translateOffset(BlockPumpkin.lIIlIllIllIIlI[0], BlockPumpkin.lIIlIllIllIIlI[2], BlockPumpkin.lIIlIllIllIIlI[1]).getPos();
            final EntityIronGolem lllllllllllllIIllIIIlIllIlIlIIll = new EntityIronGolem(lllllllllllllIIllIIIlIllIlIIllIl);
            lllllllllllllIIllIIIlIllIlIlIIll.setPlayerCreated((boolean)(BlockPumpkin.lIIlIllIllIIlI[0] != 0));
            lllllllllllllIIllIIIlIllIlIlIIll.setLocationAndAngles(lllllllllllllIIllIIIlIllIlIlIlII.getX() + 0.5, lllllllllllllIIllIIIlIllIlIlIlII.getY() + 0.05, lllllllllllllIIllIIIlIllIlIlIlII.getZ() + 0.5, 0.0f, 0.0f);
            lllllllllllllIIllIIIlIllIlIIllIl.spawnEntityInWorld(lllllllllllllIIllIIIlIllIlIlIIll);
            "".length();
            int lllllllllllllIIllIIIlIllIlIlIIlI = BlockPumpkin.lIIlIllIllIIlI[1];
            "".length();
            if ("  ".length() > (0x4A ^ 0x22 ^ (0xC6 ^ 0xAA))) {
                return;
            }
            while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIlIIlI, BlockPumpkin.lIIlIllIllIIlI[3])) {
                lllllllllllllIIllIIIlIllIlIIllIl.spawnParticle(EnumParticleTypes.SNOWBALL, lllllllllllllIIllIIIlIllIlIlIlII.getX() + lllllllllllllIIllIIIlIllIlIIllIl.rand.nextDouble(), lllllllllllllIIllIIIlIllIlIlIlII.getY() + lllllllllllllIIllIIIlIllIlIIllIl.rand.nextDouble() * 3.9, lllllllllllllIIllIIIlIllIlIlIlII.getZ() + lllllllllllllIIllIIIlIllIlIIllIl.rand.nextDouble(), 0.0, 0.0, 0.0, new int[BlockPumpkin.lIIlIllIllIIlI[1]]);
                ++lllllllllllllIIllIIIlIllIlIlIIlI;
            }
            int lllllllllllllIIllIIIlIllIlIlIIIl = BlockPumpkin.lIIlIllIllIIlI[1];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIlIIIl, this.getGolemPattern().getPalmLength())) {
                int lllllllllllllIIllIIIlIllIlIlIIII = BlockPumpkin.lIIlIllIllIIlI[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                while (!llIlIIllIIlIlIl(lllllllllllllIIllIIIlIllIlIlIIII, this.getGolemPattern().getThumbLength())) {
                    final BlockWorldState lllllllllllllIIllIIIlIllIlIIllll = lllllllllllllIIllIIIlIllIlIllllI.translateOffset(lllllllllllllIIllIIIlIllIlIlIIIl, lllllllllllllIIllIIIlIllIlIlIIII, BlockPumpkin.lIIlIllIllIIlI[1]);
                    lllllllllllllIIllIIIlIllIlIIllIl.notifyNeighborsRespectDebug(lllllllllllllIIllIIIlIllIlIIllll.getPos(), Blocks.air);
                    ++lllllllllllllIIllIIIlIllIlIlIIII;
                }
                ++lllllllllllllIIllIIIlIllIlIlIIIl;
            }
        }
    }
    
    protected BlockPattern getGolemBasePattern() {
        if (llIlIIllIIlIIll(this.golemBasePattern)) {
            final FactoryBlockPattern start = FactoryBlockPattern.start();
            final String[] lllllllllllllIIIIllllllIIIllIIll = new String[BlockPumpkin.lIIlIllIllIIlI[4]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[1]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[9]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[0]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[10]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[2]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[11]];
            this.golemBasePattern = start.aisle(lllllllllllllIIIIllllllIIIllIIll).where((char)BlockPumpkin.lIIlIllIllIIlI[5], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.iron_block))).where((char)BlockPumpkin.lIIlIllIllIIlI[12], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.air))).build();
        }
        return this.golemBasePattern;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPumpkin.lIIlIllIllIIlI[0]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPumpkin.lIIlIllIllIIlI[1]] = BlockPumpkin.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIllIIIlIllIIlIlIII) {
        return lllllllllllllIIllIIIlIllIIlIlIII.getValue((IProperty<EnumFacing>)BlockPumpkin.FACING).getHorizontalIndex();
    }
    
    static {
        llIlIIllIIlIIlI();
        llIlIIllIIIIllI();
        field_181085_Q = (Predicate)new Predicate<IBlockState>() {
            private static final /* synthetic */ int[] llIllIIIllIIIl;
            
            private static boolean lIIlIllIlIIIIlll(final Object llllllllllllIllIlIIIIIIlIIIIIIll, final Object llllllllllllIllIlIIIIIIlIIIIIIlI) {
                return llllllllllllIllIlIIIIIIlIIIIIIll == llllllllllllIllIlIIIIIIlIIIIIIlI;
            }
            
            private static boolean lIIlIllIlIIIIlIl(final Object llllllllllllIllIlIIIIIIlIIIIIllI) {
                return llllllllllllIllIlIIIIIIlIIIIIllI != null;
            }
            
            private static boolean lIIlIllIlIIIIllI(final Object llllllllllllIllIlIIIIIIlIIIIlIIl, final Object llllllllllllIllIlIIIIIIlIIIIlIII) {
                return llllllllllllIllIlIIIIIIlIIIIlIIl != llllllllllllIllIlIIIIIIlIIIIlIII;
            }
            
            static {
                lIIlIllIlIIIIlII();
            }
            
            public boolean apply(final IBlockState llllllllllllIllIlIIIIIIlIIIlIIIl) {
                if (lIIlIllIlIIIIlIl(llllllllllllIllIlIIIIIIlIIIlIIIl) && (!lIIlIllIlIIIIllI(llllllllllllIllIlIIIIIIlIIIlIIIl.getBlock(), Blocks.pumpkin) || lIIlIllIlIIIIlll(llllllllllllIllIlIIIIIIlIIIlIIIl.getBlock(), Blocks.lit_pumpkin))) {
                    return BlockPumpkin$1.llIllIIIllIIIl[0] != 0;
                }
                return BlockPumpkin$1.llIllIIIllIIIl[1] != 0;
            }
            
            private static void lIIlIllIlIIIIlII() {
                (llIllIIIllIIIl = new int[2])[0] = " ".length();
                BlockPumpkin$1.llIllIIIllIIIl[1] = ((0xC3 ^ 0x87) & ~(0xCB ^ 0x8F));
            }
        };
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIllIIIlIllIlllIllI, final BlockPos lllllllllllllIIllIIIlIllIlllIlIl, final IBlockState lllllllllllllIIllIIIlIllIlllIlII) {
        super.onBlockAdded(lllllllllllllIIllIIIlIllIlllIllI, lllllllllllllIIllIIIlIllIlllIlIl, lllllllllllllIIllIIIlIllIlllIlII);
        this.trySpawnGolem(lllllllllllllIIllIIIlIllIlllIllI, lllllllllllllIIllIIIlIllIlllIlIl);
    }
    
    private static boolean llIlIIllIIlIlIl(final int lllllllllllllIIllIIIlIlIlllIIlII, final int lllllllllllllIIllIIIlIlIlllIIIll) {
        return lllllllllllllIIllIIIlIlIlllIIlII >= lllllllllllllIIllIIIlIlIlllIIIll;
    }
    
    private static void llIlIIllIIIIllI() {
        (lIIlIllIlIllll = new String[BlockPumpkin.lIIlIllIllIIlI[16]])[BlockPumpkin.lIIlIllIllIIlI[1]] = llIlIIllIIIIIII("OgofhKHNRA8=", "ISnlF");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[0]] = llIlIIllIIIIIII("nWkbOUcAvRs=", "RryKj");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[2]] = llIlIIllIIIIIII("h/ljQ2xqL04=", "IYdvH");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[4]] = llIlIIllIIIIIIl("FA==", "JCGSC");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[6]] = llIlIIllIIIIIII("WCw3yyL33/E=", "xxVXs");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[7]] = llIlIIllIIIIIlI("K1t83ELtjOU=", "fuBDH");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[9]] = llIlIIllIIIIIIl("OG8P", "FOqKm");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[10]] = llIlIIllIIIIIII("dwsPd/ViAvs=", "derjH");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[11]] = llIlIIllIIIIIlI("iSdoC5w4gpw=", "HXjqC");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[13]] = llIlIIllIIIIIlI("nxekRo+5oVo=", "QBkSp");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[14]] = llIlIIllIIIIIlI("FezC6fEvLGU=", "OnBVd");
        BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[15]] = llIlIIllIIIIIlI("nP676snKGww=", "nHugD");
    }
    
    private static boolean llIlIIllIIlIllI(final int lllllllllllllIIllIIIlIlIllIllIIl) {
        return lllllllllllllIIllIIIlIlIllIllIIl != 0;
    }
    
    private static String llIlIIllIIIIIlI(final String lllllllllllllIIllIIIlIllIIIIllll, final String lllllllllllllIIllIIIlIllIIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIlIllIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlIllIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIIlIllIIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIIlIllIIIlIIll.init(BlockPumpkin.lIIlIllIllIIlI[2], lllllllllllllIIllIIIlIllIIIlIlII);
            return new String(lllllllllllllIIllIIIlIllIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlIllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIlIllIIIlIIlI) {
            lllllllllllllIIllIIIlIllIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    protected BlockPattern getSnowmanPattern() {
        if (llIlIIllIIlIIll(this.snowmanPattern)) {
            final FactoryBlockPattern start = FactoryBlockPattern.start();
            final String[] lllllllllllllIIIIllllllIIIllIIll = new String[BlockPumpkin.lIIlIllIllIIlI[4]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[1]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[4]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[0]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[6]];
            lllllllllllllIIIIllllllIIIllIIll[BlockPumpkin.lIIlIllIllIIlI[2]] = BlockPumpkin.lIIlIllIlIllll[BlockPumpkin.lIIlIllIllIIlI[7]];
            this.snowmanPattern = start.aisle(lllllllllllllIIIIllllllIIIllIIll).where((char)BlockPumpkin.lIIlIllIllIIlI[8], BlockWorldState.hasState(BlockPumpkin.field_181085_Q)).where((char)BlockPumpkin.lIIlIllIllIIlI[5], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.snow))).build();
        }
        return this.snowmanPattern;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIllIIIlIllIIlllIll, final BlockPos lllllllllllllIIllIIIlIllIIlllIlI, final EnumFacing lllllllllllllIIllIIIlIllIIlllIIl, final float lllllllllllllIIllIIIlIllIIlllIII, final float lllllllllllllIIllIIIlIllIIllIlll, final float lllllllllllllIIllIIIlIllIIllIllI, final int lllllllllllllIIllIIIlIllIIllIlIl, final EntityLivingBase lllllllllllllIIllIIIlIllIIllIIlI) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockPumpkin.FACING, lllllllllllllIIllIIIlIllIIllIIlI.getHorizontalFacing().getOpposite());
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIllIIIlIllIlIIIIlI, final BlockPos lllllllllllllIIllIIIlIllIIllllll) {
        if (llIlIIllIIlIllI(lllllllllllllIIllIIIlIllIlIIIIlI.getBlockState(lllllllllllllIIllIIIlIllIIllllll).getBlock().blockMaterial.isReplaceable() ? 1 : 0) && llIlIIllIIlIllI(World.doesBlockHaveSolidTopSurface(lllllllllllllIIllIIIlIllIlIIIIlI, lllllllllllllIIllIIIlIllIIllllll.down()) ? 1 : 0)) {
            return BlockPumpkin.lIIlIllIllIIlI[0] != 0;
        }
        return BlockPumpkin.lIIlIllIllIIlI[1] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIllIIIlIllIIlIlllI) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockPumpkin.FACING, EnumFacing.getHorizontal(lllllllllllllIIllIIIlIllIIlIlllI));
    }
    
    private static String llIlIIllIIIIIII(final String lllllllllllllIIllIIIlIllIIIIIlII, final String lllllllllllllIIllIIIlIllIIIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIlIllIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), BlockPumpkin.lIIlIllIllIIlI[11]), "DES");
            final Cipher lllllllllllllIIllIIIlIllIIIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIllIIIlIllIIIIIllI.init(BlockPumpkin.lIIlIllIllIIlI[2], lllllllllllllIIllIIIlIllIIIIIlll);
            return new String(lllllllllllllIIllIIIlIllIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlIllIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIlIllIIIIIlIl) {
            lllllllllllllIIllIIIlIllIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIllIIlIlII(final Object lllllllllllllIIllIIIlIlIllIlllIl) {
        return lllllllllllllIIllIIIlIlIllIlllIl != null;
    }
}
