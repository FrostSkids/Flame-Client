// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Random;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.state.BlockState;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.tileentity.TileEntity;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.util.StatCollector;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.properties.IProperty;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockWorldState;
import com.google.common.base.Predicate;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.pattern.BlockPattern;

public class BlockSkull extends BlockContainer
{
    private /* synthetic */ BlockPattern witherPattern;
    private static final /* synthetic */ String[] lIlIIllIlIllIl;
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ Predicate<BlockWorldState> IS_WITHER_SKELETON;
    private static final /* synthetic */ int[] lIlIIllIlIlllI;
    public static final /* synthetic */ PropertyBool NODROP;
    private /* synthetic */ BlockPattern witherBasePattern;
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockSkull.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lllIlIIIIIlIIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final float lllllllllllllIIIllIIlIlIllllllIl = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIIllIIlIlIllllllIl[EnumFacing.DOWN.ordinal()] = BlockSkull.lIlIIllIlIlllI[1];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIllIIlIlIllllllIl[EnumFacing.EAST.ordinal()] = BlockSkull.lIlIIllIlIlllI[9];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIllIIlIlIllllllIl[EnumFacing.NORTH.ordinal()] = BlockSkull.lIlIIllIlIlllI[4];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIllIIlIlIllllllIl[EnumFacing.SOUTH.ordinal()] = BlockSkull.lIlIIllIlIlllI[3];
            "".length();
            if (((0xBD ^ 0xB2 ^ (0x34 ^ 0x3C)) & (0x2D ^ 0x53 ^ (0xF ^ 0x76) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIllIIlIlIllllllIl[EnumFacing.UP.ordinal()] = BlockSkull.lIlIIllIlIlllI[2];
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIIllIIlIlIllllllIl[EnumFacing.WEST.ordinal()] = BlockSkull.lIlIIllIlIlllI[8];
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockSkull.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIIllIIlIlIllllllIl;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIllIIlIlllIlIIIlI, final BlockPos lllllllllllllIIIllIIlIlllIlIIIIl, final IBlockState lllllllllllllIIIllIIlIlllIlIIIII) {
        this.setBlockBoundsBasedOnState(lllllllllllllIIIllIIlIlllIlIIIlI, lllllllllllllIIIllIIlIlllIlIIIIl);
        return super.getCollisionBoundingBox(lllllllllllllIIIllIIlIlllIlIIIlI, lllllllllllllIIIllIIlIlllIlIIIIl, lllllllllllllIIIllIIlIlllIlIIIII);
    }
    
    private static boolean lllIlIIIIIlIIll(final Object lllllllllllllIIIllIIlIlIlIllIllI, final Object lllllllllllllIIIllIIlIlIlIllIlIl) {
        return lllllllllllllIIIllIIlIlIlIllIllI == lllllllllllllIIIllIIlIlIlIllIlIl;
    }
    
    private static boolean lllIlIIIIIIllll(final int lllllllllllllIIIllIIlIlIllIIlIII, final int lllllllllllllIIIllIIlIlIllIIIlll) {
        return lllllllllllllIIIllIIlIlIllIIlIII == lllllllllllllIIIllIIlIlIllIIIlll;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIllIIlIllIIIIlIll) {
        int lllllllllllllIIIllIIlIllIIIIlIlI = BlockSkull.lIlIIllIlIlllI[0];
        lllllllllllllIIIllIIlIllIIIIlIlI |= lllllllllllllIIIllIIlIllIIIIlIll.getValue((IProperty<EnumFacing>)BlockSkull.FACING).getIndex();
        if (lllIlIIIIIIllIl(((boolean)lllllllllllllIIIllIIlIllIIIIlIll.getValue((IProperty<Boolean>)BlockSkull.NODROP)) ? 1 : 0)) {
            lllllllllllllIIIllIIlIllIIIIlIlI |= BlockSkull.lIlIIllIlIlllI[7];
        }
        return lllllllllllllIIIllIIlIllIIIIlIlI;
    }
    
    private static boolean lllIlIIIIIlIlII(final int lllllllllllllIIIllIIlIlIlIlIllIl) {
        return lllllllllllllIIIllIIlIlIlIlIllIl > 0;
    }
    
    private static String lllIlIIIIIIlIlI(String lllllllllllllIIIllIIlIlIllIlIIll, final String lllllllllllllIIIllIIlIlIllIlIlll) {
        lllllllllllllIIIllIIlIlIllIlIIll = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIlIlIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIlIlIllIlIllI = new StringBuilder();
        final char[] lllllllllllllIIIllIIlIlIllIlIlIl = lllllllllllllIIIllIIlIlIllIlIlll.toCharArray();
        int lllllllllllllIIIllIIlIlIllIlIlII = BlockSkull.lIlIIllIlIlllI[0];
        final char lllllllllllllIIIllIIlIlIllIIlllI = (Object)lllllllllllllIIIllIIlIlIllIlIIll.toCharArray();
        final char lllllllllllllIIIllIIlIlIllIIllIl = (char)lllllllllllllIIIllIIlIlIllIIlllI.length;
        int lllllllllllllIIIllIIlIlIllIIllII = BlockSkull.lIlIIllIlIlllI[0];
        while (lllIlIIIIIlIllI(lllllllllllllIIIllIIlIlIllIIllII, lllllllllllllIIIllIIlIlIllIIllIl)) {
            final char lllllllllllllIIIllIIlIlIllIllIIl = lllllllllllllIIIllIIlIlIllIIlllI[lllllllllllllIIIllIIlIlIllIIllII];
            lllllllllllllIIIllIIlIlIllIlIllI.append((char)(lllllllllllllIIIllIIlIlIllIllIIl ^ lllllllllllllIIIllIIlIlIllIlIlIl[lllllllllllllIIIllIIlIlIllIlIlII % lllllllllllllIIIllIIlIlIllIlIlIl.length]));
            "".length();
            ++lllllllllllllIIIllIIlIlIllIlIlII;
            ++lllllllllllllIIIllIIlIlIllIIllII;
            "".length();
            if (" ".length() == (0x95 ^ 0x91)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIlIlIllIlIllI);
    }
    
    private static boolean lllIlIIIIIIlllI(final int lllllllllllllIIIllIIlIlIlIlIllll) {
        return lllllllllllllIIIllIIlIlIlIlIllll == 0;
    }
    
    protected BlockSkull() {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockSkull.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockSkull.NODROP, (boolean)(BlockSkull.lIlIIllIlIlllI[0] != 0)));
        this.setBlockBounds(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIIllIIlIlllIIIlIlI, final BlockPos lllllllllllllIIIllIIlIlllIIIlIIl) {
        return Items.skull;
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[2]]);
    }
    
    private static String lllIlIIIIIIlIII(final String lllllllllllllIIIllIIlIlIlllIIllI, final String lllllllllllllIIIllIIlIlIlllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIlIlllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIlIlllIIlll.getBytes(StandardCharsets.UTF_8)), BlockSkull.lIlIIllIlIlllI[7]), "DES");
            final Cipher lllllllllllllIIIllIIlIlIlllIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIIllIIlIlIlllIlIlI.init(BlockSkull.lIlIIllIlIlllI[2], lllllllllllllIIIllIIlIlIlllIlIll);
            return new String(lllllllllllllIIIllIIlIlIlllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIlIlllIlIIl) {
            lllllllllllllIIIllIIlIlIlllIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIIllIIlIlllIIIllIl, final int lllllllllllllIIIllIIlIlllIIIllII) {
        return new TileEntitySkull();
    }
    
    public void checkWitherSpawn(final World lllllllllllllIIIllIIlIllIIIlllll, final BlockPos lllllllllllllIIIllIIlIllIIIllllI, final TileEntitySkull lllllllllllllIIIllIIlIllIIIlllIl) {
        if (lllIlIIIIIIllll(lllllllllllllIIIllIIlIllIIIlllIl.getSkullType(), BlockSkull.lIlIIllIlIlllI[1]) && lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIIIllllI.getY(), BlockSkull.lIlIIllIlIlllI[2]) && lllIlIIIIIlIIlI(lllllllllllllIIIllIIlIllIIIlllll.getDifficulty(), EnumDifficulty.PEACEFUL) && lllIlIIIIIIlllI(lllllllllllllIIIllIIlIllIIIlllll.isRemote ? 1 : 0)) {
            final BlockPattern lllllllllllllIIIllIIlIllIIlIllll = this.getWitherPattern();
            final BlockPattern.PatternHelper lllllllllllllIIIllIIlIllIIlIlllI = lllllllllllllIIIllIIlIllIIlIllll.match(lllllllllllllIIIllIIlIllIIIlllll, lllllllllllllIIIllIIlIllIIIllllI);
            if (lllIlIIIIIlIIII(lllllllllllllIIIllIIlIllIIlIlllI)) {
                int lllllllllllllIIIllIIlIllIIlIllIl = BlockSkull.lIlIIllIlIlllI[0];
                "".length();
                if ("   ".length() == "  ".length()) {
                    return;
                }
                while (!lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIIlIllIl, BlockSkull.lIlIIllIlIlllI[4])) {
                    final BlockWorldState lllllllllllllIIIllIIlIllIIlIllII = lllllllllllllIIIllIIlIllIIlIlllI.translateOffset(lllllllllllllIIIllIIlIllIIlIllIl, BlockSkull.lIlIIllIlIlllI[0], BlockSkull.lIlIIllIlIlllI[0]);
                    lllllllllllllIIIllIIlIllIIIlllll.setBlockState(lllllllllllllIIIllIIlIllIIlIllII.getPos(), lllllllllllllIIIllIIlIllIIlIllII.getBlockState().withProperty((IProperty<Comparable>)BlockSkull.NODROP, (boolean)(BlockSkull.lIlIIllIlIlllI[1] != 0)), BlockSkull.lIlIIllIlIlllI[2]);
                    "".length();
                    ++lllllllllllllIIIllIIlIllIIlIllIl;
                }
                int lllllllllllllIIIllIIlIllIIlIlIll = BlockSkull.lIlIIllIlIlllI[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIIlIlIll, lllllllllllllIIIllIIlIllIIlIllll.getPalmLength())) {
                    int lllllllllllllIIIllIIlIllIIlIlIlI = BlockSkull.lIlIIllIlIlllI[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIIlIlIlI, lllllllllllllIIIllIIlIllIIlIllll.getThumbLength())) {
                        final BlockWorldState lllllllllllllIIIllIIlIllIIlIlIIl = lllllllllllllIIIllIIlIllIIlIlllI.translateOffset(lllllllllllllIIIllIIlIllIIlIlIll, lllllllllllllIIIllIIlIllIIlIlIlI, BlockSkull.lIlIIllIlIlllI[0]);
                        lllllllllllllIIIllIIlIllIIIlllll.setBlockState(lllllllllllllIIIllIIlIllIIlIlIIl.getPos(), Blocks.air.getDefaultState(), BlockSkull.lIlIIllIlIlllI[2]);
                        "".length();
                        ++lllllllllllllIIIllIIlIllIIlIlIlI;
                    }
                    ++lllllllllllllIIIllIIlIllIIlIlIll;
                }
                final BlockPos lllllllllllllIIIllIIlIllIIlIlIII = lllllllllllllIIIllIIlIllIIlIlllI.translateOffset(BlockSkull.lIlIIllIlIlllI[1], BlockSkull.lIlIIllIlIlllI[0], BlockSkull.lIlIIllIlIlllI[0]).getPos();
                final EntityWither lllllllllllllIIIllIIlIllIIlIIlll = new EntityWither(lllllllllllllIIIllIIlIllIIIlllll);
                final BlockPos lllllllllllllIIIllIIlIllIIlIIllI = lllllllllllllIIIllIIlIllIIlIlllI.translateOffset(BlockSkull.lIlIIllIlIlllI[1], BlockSkull.lIlIIllIlIlllI[2], BlockSkull.lIlIIllIlIlllI[0]).getPos();
                final EntityWither entityWither = lllllllllllllIIIllIIlIllIIlIIlll;
                final double lllllllllllllIIlIlllIllIIlIlIIlI = lllllllllllllIIIllIIlIllIIlIIllI.getX() + 0.5;
                final double lllllllllllllIIlIlllIllIIlIIlIll = lllllllllllllIIIllIIlIllIIlIIllI.getY() + 0.55;
                final double lllllllllllllIIlIlllIllIIlIIlIlI = lllllllllllllIIIllIIlIllIIlIIllI.getZ() + 0.5;
                float lllllllllllllIIlIlllIllIIlIIllll;
                if (lllIlIIIIIlIIll(lllllllllllllIIIllIIlIllIIlIlllI.getFinger().getAxis(), EnumFacing.Axis.X)) {
                    lllllllllllllIIlIlllIllIIlIIllll = 0.0f;
                    "".length();
                    if ((0x8 ^ 0xC) < -" ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIlllIllIIlIIllll = 90.0f;
                }
                entityWither.setLocationAndAngles(lllllllllllllIIlIlllIllIIlIlIIlI, lllllllllllllIIlIlllIllIIlIIlIll, lllllllllllllIIlIlllIllIIlIIlIlI, lllllllllllllIIlIlllIllIIlIIllll, 0.0f);
                final EntityWither entityWither2 = lllllllllllllIIIllIIlIllIIlIIlll;
                float renderYawOffset;
                if (lllIlIIIIIlIIll(lllllllllllllIIIllIIlIllIIlIlllI.getFinger().getAxis(), EnumFacing.Axis.X)) {
                    renderYawOffset = 0.0f;
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
                else {
                    renderYawOffset = 90.0f;
                }
                entityWither2.renderYawOffset = renderYawOffset;
                lllllllllllllIIIllIIlIllIIlIIlll.func_82206_m();
                final Iterator<EntityPlayer> iterator = lllllllllllllIIIllIIlIllIIIlllll.getEntitiesWithinAABB((Class<? extends EntityPlayer>)EntityPlayer.class, lllllllllllllIIIllIIlIllIIlIIlll.getEntityBoundingBox().expand(50.0, 50.0, 50.0)).iterator();
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                while (!lllIlIIIIIIlllI(iterator.hasNext() ? 1 : 0)) {
                    final EntityPlayer lllllllllllllIIIllIIlIllIIlIIlIl = iterator.next();
                    lllllllllllllIIIllIIlIllIIlIIlIl.triggerAchievement(AchievementList.spawnWither);
                }
                lllllllllllllIIIllIIlIllIIIlllll.spawnEntityInWorld(lllllllllllllIIIllIIlIllIIlIIlll);
                "".length();
                int lllllllllllllIIIllIIlIllIIlIIlII = BlockSkull.lIlIIllIlIlllI[0];
                "".length();
                if ((0x58 ^ 0x5C) < 0) {
                    return;
                }
                while (!lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIIlIIlII, BlockSkull.lIlIIllIlIlllI[5])) {
                    lllllllllllllIIIllIIlIllIIIlllll.spawnParticle(EnumParticleTypes.SNOWBALL, lllllllllllllIIIllIIlIllIIlIlIII.getX() + lllllllllllllIIIllIIlIllIIIlllll.rand.nextDouble(), lllllllllllllIIIllIIlIllIIlIlIII.getY() - BlockSkull.lIlIIllIlIlllI[2] + lllllllllllllIIIllIIlIllIIIlllll.rand.nextDouble() * 3.9, lllllllllllllIIIllIIlIllIIlIlIII.getZ() + lllllllllllllIIIllIIlIllIIIlllll.rand.nextDouble(), 0.0, 0.0, 0.0, new int[BlockSkull.lIlIIllIlIlllI[0]]);
                    ++lllllllllllllIIIllIIlIllIIlIIlII;
                }
                int lllllllllllllIIIllIIlIllIIlIIIll = BlockSkull.lIlIIllIlIlllI[0];
                "".length();
                if ((((0x0 ^ 0x1F) & ~(0x20 ^ 0x3F)) ^ (0x26 ^ 0x22)) <= 0) {
                    return;
                }
                while (!lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIIlIIIll, lllllllllllllIIIllIIlIllIIlIllll.getPalmLength())) {
                    int lllllllllllllIIIllIIlIllIIlIIIlI = BlockSkull.lIlIIllIlIlllI[0];
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                    while (!lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIIlIIIlI, lllllllllllllIIIllIIlIllIIlIllll.getThumbLength())) {
                        final BlockWorldState lllllllllllllIIIllIIlIllIIlIIIIl = lllllllllllllIIIllIIlIllIIlIlllI.translateOffset(lllllllllllllIIIllIIlIllIIlIIIll, lllllllllllllIIIllIIlIllIIlIIIlI, BlockSkull.lIlIIllIlIlllI[0]);
                        lllllllllllllIIIllIIlIllIIIlllll.notifyNeighborsRespectDebug(lllllllllllllIIIllIIlIllIIlIIIIl.getPos(), Blocks.air);
                        ++lllllllllllllIIIllIIlIllIIlIIIlI;
                    }
                    ++lllllllllllllIIIllIIlIllIIlIIIll;
                }
            }
        }
    }
    
    public boolean canDispenserPlace(final World lllllllllllllIIIllIIlIllIlIIIllI, final BlockPos lllllllllllllIIIllIIlIllIlIIIlIl, final ItemStack lllllllllllllIIIllIIlIllIlIIIlII) {
        int n;
        if (lllIlIIIIIIllll(lllllllllllllIIIllIIlIllIlIIIlII.getMetadata(), BlockSkull.lIlIIllIlIlllI[1]) && lllIlIIIIIlIIIl(lllllllllllllIIIllIIlIllIlIIIlIl.getY(), BlockSkull.lIlIIllIlIlllI[2]) && lllIlIIIIIlIIlI(lllllllllllllIIIllIIlIllIlIIIllI.getDifficulty(), EnumDifficulty.PEACEFUL) && lllIlIIIIIIlllI(lllllllllllllIIIllIIlIllIlIIIllI.isRemote ? 1 : 0)) {
            if (lllIlIIIIIlIIII(this.getWitherBasePattern().match(lllllllllllllIIIllIIlIllIlIIIllI, lllllllllllllIIIllIIlIllIlIIIlIl))) {
                n = BlockSkull.lIlIIllIlIlllI[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return ((14 + 106 - 87 + 108 ^ 45 + 14 - 42 + 120) & (126 + 75 - 110 + 56 ^ 41 + 141 - 180 + 149 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = BlockSkull.lIlIIllIlIlllI[0];
                "".length();
                if ("  ".length() < ((0x47 ^ 0x10) & ~(0x56 ^ 0x1))) {
                    return ((0x8 ^ 0x5E) & ~(0x23 ^ 0x75)) != 0x0;
                }
            }
        }
        else {
            n = BlockSkull.lIlIIllIlIlllI[0];
        }
        return n != 0;
    }
    
    private static void lllIlIIIIIIllII() {
        (lIlIIllIlIlllI = new int[15])[0] = ((42 + 90 - 47 + 84 ^ 150 + 118 - 185 + 97) & (0x6A ^ 0x16 ^ (0x4E ^ 0x2F) ^ -" ".length()));
        BlockSkull.lIlIIllIlIlllI[1] = " ".length();
        BlockSkull.lIlIIllIlIlllI[2] = "  ".length();
        BlockSkull.lIlIIllIlIlllI[3] = (0xB9 ^ 0x88 ^ (0xB2 ^ 0x87));
        BlockSkull.lIlIIllIlIlllI[4] = "   ".length();
        BlockSkull.lIlIIllIlIlllI[5] = (0x52 ^ 0x2A);
        BlockSkull.lIlIIllIlIlllI[6] = (11 + 84 + 40 + 23 ^ 108 + 41 - 117 + 121);
        BlockSkull.lIlIIllIlIlllI[7] = (0xC ^ 0x4);
        BlockSkull.lIlIIllIlIlllI[8] = (0x4F ^ 0x4A);
        BlockSkull.lIlIIllIlIlllI[9] = (0xC ^ 0xA);
        BlockSkull.lIlIIllIlIlllI[10] = (0x19 ^ 0x3A);
        BlockSkull.lIlIIllIlIlllI[11] = (0x52 ^ 0x2C);
        BlockSkull.lIlIIllIlIlllI[12] = (41 + 70 - 16 + 59 ^ 38 + 46 - 49 + 112);
        BlockSkull.lIlIIllIlIlllI[13] = (0x55 ^ 0x46 ^ (0xC7 ^ 0x8A));
        BlockSkull.lIlIIllIlIlllI[14] = (0x86 ^ 0x8C);
    }
    
    private static String lllIlIIIIIIlIIl(final String lllllllllllllIIIllIIlIlIllllIIll, final String lllllllllllllIIIllIIlIlIllllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIlIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIlIlIllllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIlIlIllllIlll.init(BlockSkull.lIlIIllIlIlllI[2], lllllllllllllIIIllIIlIlIlllllIII);
            return new String(lllllllllllllIIIllIIlIlIllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIlIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIlIllllIllI) {
            lllllllllllllIIIllIIlIlIllllIllI.printStackTrace();
            return null;
        }
    }
    
    protected BlockPattern getWitherPattern() {
        if (lllIlIIIIIlIlIl(this.witherPattern)) {
            final FactoryBlockPattern start = FactoryBlockPattern.start();
            final String[] lllllllllllllIIIIllllllIIIllIIll = new String[BlockSkull.lIlIIllIlIlllI[4]];
            lllllllllllllIIIIllllllIIIllIIll[BlockSkull.lIlIIllIlIlllI[0]] = BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[6]];
            lllllllllllllIIIIllllllIIIllIIll[BlockSkull.lIlIIllIlIlllI[1]] = BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[7]];
            lllllllllllllIIIIllllllIIIllIIll[BlockSkull.lIlIIllIlIlllI[2]] = BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[12]];
            this.witherPattern = start.aisle(lllllllllllllIIIIllllllIIIllIIll).where((char)BlockSkull.lIlIIllIlIlllI[10], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.soul_sand))).where((char)BlockSkull.lIlIIllIlIlllI[13], BlockSkull.IS_WITHER_SKELETON).where((char)BlockSkull.lIlIIllIlIlllI[11], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.air))).build();
        }
        return this.witherPattern;
    }
    
    private static boolean lllIlIIIIIlIIIl(final int lllllllllllllIIIllIIlIlIllIIIlII, final int lllllllllllllIIIllIIlIlIllIIIIll) {
        return lllllllllllllIIIllIIlIlIllIIIlII >= lllllllllllllIIIllIIlIlIllIIIIll;
    }
    
    private static boolean lllIlIIIIIlIlIl(final Object lllllllllllllIIIllIIlIlIlIllIIll) {
        return lllllllllllllIIIllIIlIlIlIllIIll == null;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIllIIlIlllIlIlIIl, final BlockPos lllllllllllllIIIllIIlIlllIlIlIII) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIIllIIlIlllIlIlIIl.getBlockState(lllllllllllllIIIllIIlIlllIlIlIII).getValue((IProperty<EnumFacing>)BlockSkull.FACING).ordinal()]) {
            default: {
                this.setBlockBounds(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
                break;
            }
            case 3: {
                this.setBlockBounds(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 4: {
                this.setBlockBounds(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 5: {
                this.setBlockBounds(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                "".length();
                if ((127 + 32 - 42 + 37 ^ 141 + 48 - 133 + 102) == 0x0) {
                    return;
                }
                break;
            }
            case 6: {
                this.setBlockBounds(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
                break;
            }
        }
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIIllIIlIllIlIlIllI, final BlockPos lllllllllllllIIIllIIlIllIlIlllIl, final IBlockState lllllllllllllIIIllIIlIllIlIlIlII) {
        if (lllIlIIIIIIlllI(lllllllllllllIIIllIIlIllIlIlIllI.isRemote ? 1 : 0)) {
            if (lllIlIIIIIIlllI(((boolean)lllllllllllllIIIllIIlIllIlIlIlII.getValue((IProperty<Boolean>)BlockSkull.NODROP)) ? 1 : 0)) {
                final TileEntity lllllllllllllIIIllIIlIllIlIllIll = lllllllllllllIIIllIIlIllIlIlIllI.getTileEntity(lllllllllllllIIIllIIlIllIlIlllIl);
                if (lllIlIIIIIIllIl((lllllllllllllIIIllIIlIllIlIllIll instanceof TileEntitySkull) ? 1 : 0)) {
                    final TileEntitySkull lllllllllllllIIIllIIlIllIlIllIlI = (TileEntitySkull)lllllllllllllIIIllIIlIllIlIllIll;
                    final ItemStack lllllllllllllIIIllIIlIllIlIllIIl = new ItemStack(Items.skull, BlockSkull.lIlIIllIlIlllI[1], this.getDamageValue(lllllllllllllIIIllIIlIllIlIlIllI, lllllllllllllIIIllIIlIllIlIlllIl));
                    if (lllIlIIIIIIllll(lllllllllllllIIIllIIlIllIlIllIlI.getSkullType(), BlockSkull.lIlIIllIlIlllI[4]) && lllIlIIIIIlIIII(lllllllllllllIIIllIIlIllIlIllIlI.getPlayerProfile())) {
                        lllllllllllllIIIllIIlIllIlIllIIl.setTagCompound(new NBTTagCompound());
                        final NBTTagCompound lllllllllllllIIIllIIlIllIlIllIII = new NBTTagCompound();
                        NBTUtil.writeGameProfile(lllllllllllllIIIllIIlIllIlIllIII, lllllllllllllIIIllIIlIllIlIllIlI.getPlayerProfile());
                        "".length();
                        lllllllllllllIIIllIIlIllIlIllIIl.getTagCompound().setTag(BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[4]], lllllllllllllIIIllIIlIllIlIllIII);
                    }
                    Block.spawnAsEntity(lllllllllllllIIIllIIlIllIlIlIllI, lllllllllllllIIIllIIlIllIlIlllIl, lllllllllllllIIIllIIlIllIlIllIIl);
                }
            }
            super.breakBlock(lllllllllllllIIIllIIlIllIlIlIllI, lllllllllllllIIIllIIlIllIlIlllIl, lllllllllllllIIIllIIlIllIlIlIlII);
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIllIIlIllIIIlIIIl) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockSkull.FACING, EnumFacing.getFront(lllllllllllllIIIllIIlIllIIIlIIIl & BlockSkull.lIlIIllIlIlllI[6]));
        final PropertyBool nodrop = BlockSkull.NODROP;
        int b;
        if (lllIlIIIIIlIlII(lllllllllllllIIIllIIlIllIIIlIIIl & BlockSkull.lIlIIllIlIlllI[7])) {
            b = BlockSkull.lIlIIllIlIlllI[1];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            b = BlockSkull.lIlIIllIlIlllI[0];
        }
        return withProperty.withProperty((IProperty<Comparable>)nodrop, (boolean)(b != 0));
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockSkull.lIlIIllIlIlllI[0] != 0;
    }
    
    private static void lllIlIIIIIIlIll() {
        (lIlIIllIlIllIl = new String[BlockSkull.lIlIIllIlIlllI[14]])[BlockSkull.lIlIIllIlIlllI[0]] = lllIlIIIIIIlIII("TdrLrwAfUPY=", "oWSzC");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[1]] = lllIlIIIIIIlIIl("wV+0l3LeYuA=", "nTXQV");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[2]] = lllIlIIIIIIlIII("U9//7tv33nlbTFaOm/cbcSFmeHRiVJjyT4ErEYckTno=", "UDmao");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[4]] = lllIlIIIIIIlIII("9YG2eqmmzF+euxfQ/in0cw==", "ycrMc");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[3]] = lllIlIIIIIIlIlI("QnhY", "bXxHC");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[8]] = lllIlIIIIIIlIII("RySJ6NbU+/g=", "roJsj");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[9]] = lllIlIIIIIIlIIl("a4CdD3FiPTk=", "UrOqS");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[6]] = lllIlIIIIIIlIlI("PycT", "ayMqA");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[7]] = lllIlIIIIIIlIIl("MujjcBdKNdQ=", "buVSX");
        BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[12]] = lllIlIIIIIIlIII("bQ9S5nY3Qbs=", "UTFfG");
    }
    
    private static boolean lllIlIIIIIIllIl(final int lllllllllllllIIIllIIlIlIlIllIIIl) {
        return lllllllllllllIIIllIIlIlIlIllIIIl != 0;
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIIIllIIlIllIllllIll, final BlockPos lllllllllllllIIIllIIlIllIllllIlI, final IBlockState lllllllllllllIIIllIIlIllIllllIIl, final float lllllllllllllIIIllIIlIllIllllIII, final int lllllllllllllIIIllIIlIllIlllIlll) {
    }
    
    protected BlockPattern getWitherBasePattern() {
        if (lllIlIIIIIlIlIl(this.witherBasePattern)) {
            final FactoryBlockPattern start = FactoryBlockPattern.start();
            final String[] lllllllllllllIIIIllllllIIIllIIll = new String[BlockSkull.lIlIIllIlIlllI[4]];
            lllllllllllllIIIIllllllIIIllIIll[BlockSkull.lIlIIllIlIlllI[0]] = BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[3]];
            lllllllllllllIIIIllllllIIIllIIll[BlockSkull.lIlIIllIlIlllI[1]] = BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[8]];
            lllllllllllllIIIIllllllIIIllIIll[BlockSkull.lIlIIllIlIlllI[2]] = BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[9]];
            this.witherBasePattern = start.aisle(lllllllllllllIIIIllllllIIIllIIll).where((char)BlockSkull.lIlIIllIlIlllI[10], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.soul_sand))).where((char)BlockSkull.lIlIIllIlIlllI[11], BlockWorldState.hasState((Predicate<IBlockState>)BlockStateHelper.forBlock(Blocks.air))).build();
        }
        return this.witherBasePattern;
    }
    
    private static boolean lllIlIIIIIlIIII(final Object lllllllllllllIIIllIIlIlIlIlllIIl) {
        return lllllllllllllIIIllIIlIlIlIlllIIl != null;
    }
    
    @Override
    public int getDamageValue(final World lllllllllllllIIIllIIlIlllIIIIIll, final BlockPos lllllllllllllIIIllIIlIlllIIIIIlI) {
        final TileEntity lllllllllllllIIIllIIlIlllIIIIIIl = lllllllllllllIIIllIIlIlllIIIIIll.getTileEntity(lllllllllllllIIIllIIlIlllIIIIIlI);
        int n;
        if (lllIlIIIIIIllIl((lllllllllllllIIIllIIlIlllIIIIIIl instanceof TileEntitySkull) ? 1 : 0)) {
            n = ((TileEntitySkull)lllllllllllllIIIllIIlIlllIIIIIIl).getSkullType();
            "".length();
            if (-(0x5F ^ 0x5A) >= 0) {
                return (0x56 ^ 0x1D) & ~(0x54 ^ 0x1F);
            }
        }
        else {
            n = super.getDamageValue(lllllllllllllIIIllIIlIlllIIIIIll, lllllllllllllIIIllIIlIlllIIIIIlI);
        }
        return n;
    }
    
    static {
        lllIlIIIIIIllII();
        lllIlIIIIIIlIll();
        FACING = PropertyDirection.create(BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[0]]);
        NODROP = PropertyBool.create(BlockSkull.lIlIIllIlIllIl[BlockSkull.lIlIIllIlIlllI[1]]);
        IS_WITHER_SKELETON = (Predicate)new Predicate<BlockWorldState>() {
            private static final /* synthetic */ int[] lIlIllIIIIllII;
            
            static {
                llllIIIIIlIlIIl();
            }
            
            public boolean apply(final BlockWorldState lllllllllllllIIIIlllIllIIIIlllIl) {
                if (llllIIIIIlIlIlI(lllllllllllllIIIIlllIllIIIIlllIl.getBlockState()) && llllIIIIIlIlIll(lllllllllllllIIIIlllIllIIIIlllIl.getBlockState().getBlock(), Blocks.skull) && llllIIIIIlIllII((lllllllllllllIIIIlllIllIIIIlllIl.getTileEntity() instanceof TileEntitySkull) ? 1 : 0) && llllIIIIIlIllIl(((TileEntitySkull)lllllllllllllIIIIlllIllIIIIlllIl.getTileEntity()).getSkullType(), BlockSkull$1.lIlIllIIIIllII[0])) {
                    return BlockSkull$1.lIlIllIIIIllII[0] != 0;
                }
                return BlockSkull$1.lIlIllIIIIllII[1] != 0;
            }
            
            private static boolean llllIIIIIlIlIlI(final Object lllllllllllllIIIIlllIllIIIIlIIlI) {
                return lllllllllllllIIIIlllIllIIIIlIIlI != null;
            }
            
            private static boolean llllIIIIIlIlIll(final Object lllllllllllllIIIIlllIllIIIIIllll, final Object lllllllllllllIIIIlllIllIIIIIlllI) {
                return lllllllllllllIIIIlllIllIIIIIllll == lllllllllllllIIIIlllIllIIIIIlllI;
            }
            
            private static void llllIIIIIlIlIIl() {
                (lIlIllIIIIllII = new int[2])[0] = " ".length();
                BlockSkull$1.lIlIllIIIIllII[1] = ((0x2B ^ 0x1A) & ~(0x8 ^ 0x39));
            }
            
            private static boolean llllIIIIIlIllIl(final int lllllllllllllIIIIlllIllIIIIlIlIl, final int lllllllllllllIIIIlllIllIIIIlIlII) {
                return lllllllllllllIIIIlllIllIIIIlIlIl == lllllllllllllIIIIlllIllIIIIlIlII;
            }
            
            private static boolean llllIIIIIlIllII(final int lllllllllllllIIIIlllIllIIIIIllII) {
                return lllllllllllllIIIIlllIllIIIIIllII != 0;
            }
        };
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockSkull.lIlIIllIlIlllI[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSkull.lIlIIllIlIlllI[0]] = BlockSkull.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSkull.lIlIIllIlIlllI[1]] = BlockSkull.NODROP;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lllIlIIIIIlIllI(final int lllllllllllllIIIllIIlIlIllIIIIII, final int lllllllllllllIIIllIIlIlIlIllllll) {
        return lllllllllllllIIIllIIlIlIllIIIIII < lllllllllllllIIIllIIlIlIlIllllll;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIIllIIlIlllIIllIII, final BlockPos lllllllllllllIIIllIIlIlllIIlIlll, final EnumFacing lllllllllllllIIIllIIlIlllIIlIllI, final float lllllllllllllIIIllIIlIlllIIlIlIl, final float lllllllllllllIIIllIIlIlllIIlIlII, final float lllllllllllllIIIllIIlIlllIIlIIll, final int lllllllllllllIIIllIIlIlllIIlIIlI, final EntityLivingBase lllllllllllllIIIllIIlIlllIIlIIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockSkull.FACING, lllllllllllllIIIllIIlIlllIIlIIIl.getHorizontalFacing()).withProperty((IProperty<Comparable>)BlockSkull.NODROP, (boolean)(BlockSkull.lIlIIllIlIlllI[0] != 0));
    }
    
    private static boolean lllIlIIIIIlIIlI(final Object lllllllllllllIIIllIIlIlIlIllllII, final Object lllllllllllllIIIllIIlIlIlIlllIll) {
        return lllllllllllllIIIllIIlIlIlIllllII != lllllllllllllIIIllIIlIlIlIlllIll;
    }
    
    @Override
    public void onBlockHarvested(final World lllllllllllllIIIllIIlIllIllIlIll, final BlockPos lllllllllllllIIIllIIlIllIllIlIlI, IBlockState lllllllllllllIIIllIIlIllIllIlIIl, final EntityPlayer lllllllllllllIIIllIIlIllIllIlIII) {
        if (lllIlIIIIIIllIl(lllllllllllllIIIllIIlIllIllIlIII.capabilities.isCreativeMode ? 1 : 0)) {
            lllllllllllllIIIllIIlIllIllIlIIl = lllllllllllllIIIllIIlIllIllIlIIl.withProperty((IProperty<Comparable>)BlockSkull.NODROP, (boolean)(BlockSkull.lIlIIllIlIlllI[1] != 0));
            lllllllllllllIIIllIIlIllIllIlIll.setBlockState(lllllllllllllIIIllIIlIllIllIlIlI, lllllllllllllIIIllIIlIllIllIlIIl, BlockSkull.lIlIIllIlIlllI[3]);
            "".length();
        }
        super.onBlockHarvested(lllllllllllllIIIllIIlIllIllIlIll, lllllllllllllIIIllIIlIllIllIlIlI, lllllllllllllIIIllIIlIllIllIlIIl, lllllllllllllIIIllIIlIllIllIlIII);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockSkull.lIlIIllIlIlllI[0] != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIllIIlIllIlIIlllI, final Random lllllllllllllIIIllIIlIllIlIIllIl, final int lllllllllllllIIIllIIlIllIlIIllII) {
        return Items.skull;
    }
}
