// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.stats.StatList;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Random;
import net.minecraft.entity.EntityLivingBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.base.Predicate;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyDirection;

public class BlockFurnace extends BlockContainer
{
    private static final /* synthetic */ int[] lIlIlIllIlIIll;
    private final /* synthetic */ boolean isBurning;
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ String[] lIlIlIlIllllII;
    private static /* synthetic */ boolean keepInventory;
    
    private static void lllIllllIlIIlII() {
        (lIlIlIllIlIIll = new int[7])[0] = ((117 + 23 - 106 + 115 ^ 9 + 63 + 8 + 108) & (0x41 ^ 0x14 ^ (0x17 ^ 0x6B) ^ -" ".length()));
        BlockFurnace.lIlIlIllIlIIll[1] = "  ".length();
        BlockFurnace.lIlIlIllIlIIll[2] = " ".length();
        BlockFurnace.lIlIlIllIlIIll[3] = "   ".length();
        BlockFurnace.lIlIlIllIlIIll[4] = (77 + 19 + 20 + 57 ^ 75 + 91 + 3 + 2);
        BlockFurnace.lIlIlIllIlIIll[5] = (0xD ^ 0x9);
        BlockFurnace.lIlIlIllIlIIll[6] = (0xBC ^ 0xB9);
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIIIllllllIlIIlIllI, final BlockPos lllllllllllllIIIIllllllIlIIlIIII, final IBlockState lllllllllllllIIIIllllllIlIIIllll) {
        if (lllIllllIlIIlIl(BlockFurnace.keepInventory ? 1 : 0)) {
            final TileEntity lllllllllllllIIIIllllllIlIIlIIll = lllllllllllllIIIIllllllIlIIlIllI.getTileEntity(lllllllllllllIIIIllllllIlIIlIIII);
            if (lllIllllIlIIlll((lllllllllllllIIIIllllllIlIIlIIll instanceof TileEntityFurnace) ? 1 : 0)) {
                InventoryHelper.dropInventoryItems(lllllllllllllIIIIllllllIlIIlIllI, lllllllllllllIIIIllllllIlIIlIIII, (IInventory)lllllllllllllIIIIllllllIlIIlIIll);
                lllllllllllllIIIIllllllIlIIlIllI.updateComparatorOutputLevel(lllllllllllllIIIIllllllIlIIlIIII, this);
            }
        }
        super.breakBlock(lllllllllllllIIIIllllllIlIIlIllI, lllllllllllllIIIIllllllIlIIlIIII, lllllllllllllIIIIllllllIlIIIllll);
    }
    
    private void setDefaultFacing(final World lllllllllllllIIIIlllllllIIIlIIIl, final BlockPos lllllllllllllIIIIlllllllIIIIlIII, final IBlockState lllllllllllllIIIIlllllllIIIIllll) {
        if (lllIllllIlIIlIl(lllllllllllllIIIIlllllllIIIlIIIl.isRemote ? 1 : 0)) {
            final Block lllllllllllllIIIIlllllllIIIIlllI = lllllllllllllIIIIlllllllIIIlIIIl.getBlockState(lllllllllllllIIIIlllllllIIIIlIII.north()).getBlock();
            final Block lllllllllllllIIIIlllllllIIIIllIl = lllllllllllllIIIIlllllllIIIlIIIl.getBlockState(lllllllllllllIIIIlllllllIIIIlIII.south()).getBlock();
            final Block lllllllllllllIIIIlllllllIIIIllII = lllllllllllllIIIIlllllllIIIlIIIl.getBlockState(lllllllllllllIIIIlllllllIIIIlIII.west()).getBlock();
            final Block lllllllllllllIIIIlllllllIIIIlIll = lllllllllllllIIIIlllllllIIIlIIIl.getBlockState(lllllllllllllIIIIlllllllIIIIlIII.east()).getBlock();
            EnumFacing lllllllllllllIIIIlllllllIIIIlIlI = lllllllllllllIIIIlllllllIIIIllll.getValue((IProperty<EnumFacing>)BlockFurnace.FACING);
            if (lllIllllIlIIllI(lllllllllllllIIIIlllllllIIIIlIlI, EnumFacing.NORTH) && lllIllllIlIIlll(lllllllllllllIIIIlllllllIIIIlllI.isFullBlock() ? 1 : 0) && lllIllllIlIIlIl(lllllllllllllIIIIlllllllIIIIllIl.isFullBlock() ? 1 : 0)) {
                lllllllllllllIIIIlllllllIIIIlIlI = EnumFacing.SOUTH;
                "".length();
                if ("  ".length() == ((0xCB ^ 0x91 ^ (0x68 ^ 0x6E)) & ("   ".length() ^ (0x6D ^ 0x32) ^ -" ".length()))) {
                    return;
                }
            }
            else if (lllIllllIlIIllI(lllllllllllllIIIIlllllllIIIIlIlI, EnumFacing.SOUTH) && lllIllllIlIIlll(lllllllllllllIIIIlllllllIIIIllIl.isFullBlock() ? 1 : 0) && lllIllllIlIIlIl(lllllllllllllIIIIlllllllIIIIlllI.isFullBlock() ? 1 : 0)) {
                lllllllllllllIIIIlllllllIIIIlIlI = EnumFacing.NORTH;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else if (lllIllllIlIIllI(lllllllllllllIIIIlllllllIIIIlIlI, EnumFacing.WEST) && lllIllllIlIIlll(lllllllllllllIIIIlllllllIIIIllII.isFullBlock() ? 1 : 0) && lllIllllIlIIlIl(lllllllllllllIIIIlllllllIIIIlIll.isFullBlock() ? 1 : 0)) {
                lllllllllllllIIIIlllllllIIIIlIlI = EnumFacing.EAST;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lllIllllIlIIllI(lllllllllllllIIIIlllllllIIIIlIlI, EnumFacing.EAST) && lllIllllIlIIlll(lllllllllllllIIIIlllllllIIIIlIll.isFullBlock() ? 1 : 0) && lllIllllIlIIlIl(lllllllllllllIIIIlllllllIIIIllII.isFullBlock() ? 1 : 0)) {
                lllllllllllllIIIIlllllllIIIIlIlI = EnumFacing.WEST;
            }
            lllllllllllllIIIIlllllllIIIlIIIl.setBlockState(lllllllllllllIIIIlllllllIIIIlIII, lllllllllllllIIIIlllllllIIIIllll.withProperty((IProperty<Comparable>)BlockFurnace.FACING, lllllllllllllIIIIlllllllIIIIlIlI), BlockFurnace.lIlIlIllIlIIll[1]);
            "".length();
        }
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIIIllllllIlIIIIlII, final BlockPos lllllllllllllIIIIllllllIlIIIIIll) {
        return Item.getItemFromBlock(Blocks.furnace);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockFurnace.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lllIllllIlIlIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final long lllllllllllllIIIIllllllIIllIllII = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIIIllllllIIllIllII[EnumFacing.DOWN.ordinal()] = BlockFurnace.lIlIlIllIlIIll[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIIllllllIIllIllII[EnumFacing.EAST.ordinal()] = BlockFurnace.lIlIlIllIlIIll[4];
            "".length();
            if ((0x97 ^ 0xBA ^ (0xA ^ 0x22)) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIIllllllIIllIllII[EnumFacing.NORTH.ordinal()] = BlockFurnace.lIlIlIllIlIIll[3];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIIllllllIIllIllII[EnumFacing.SOUTH.ordinal()] = BlockFurnace.lIlIlIllIlIIll[5];
            "".length();
            if (((0x47 ^ 0x78) & ~(0xAC ^ 0x93)) >= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIIllllllIIllIllII[EnumFacing.UP.ordinal()] = BlockFurnace.lIlIlIllIlIIll[1];
            "".length();
            if (" ".length() < ((0x83 ^ 0xA1 ^ (0x37 ^ 0x3E)) & (35 + 62 + 67 + 24 ^ 30 + 89 - 21 + 53 ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIIIllllllIIllIllII[EnumFacing.WEST.ordinal()] = BlockFurnace.lIlIlIllIlIIll[6];
            "".length();
            if ("   ".length() <= ((0xAE ^ 0x93 ^ (0xA5 ^ 0xBF)) & ("   ".length() ^ (0xA6 ^ 0x82) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockFurnace.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIIIllllllIIllIllII;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockFurnace.lIlIlIllIlIIll[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFurnace.lIlIlIllIlIIll[0]] = BlockFurnace.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    protected BlockFurnace(final boolean lllllllllllllIIIIlllllllIIlIllIl) {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, EnumFacing.NORTH));
        this.isBurning = lllllllllllllIIIIlllllllIIlIllIl;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIIIlllllllIIlIIIIl, final BlockPos lllllllllllllIIIIlllllllIIlIIIII, final IBlockState lllllllllllllIIIIlllllllIIIllIll) {
        this.setDefaultFacing(lllllllllllllIIIIlllllllIIlIIIIl, lllllllllllllIIIIlllllllIIlIIIII, lllllllllllllIIIIlllllllIIIllIll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIllllllIIlllIIIl) {
        return lllllllllllllIIIIllllllIIlllIIIl.getValue((IProperty<EnumFacing>)BlockFurnace.FACING).getIndex();
    }
    
    static {
        lllIllllIlIIlII();
        lllIlllIllIIllI();
        FACING = PropertyDirection.create(BlockFurnace.lIlIlIlIllllII[BlockFurnace.lIlIlIllIlIIll[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
    }
    
    private static String lllIlllIllIIlIl(String lllllllllllllIIIIllllllIIlIlllII, final String lllllllllllllIIIIllllllIIlIllIll) {
        lllllllllllllIIIIllllllIIlIlllII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllllllIIlIlllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllllllIIlIlllll = new StringBuilder();
        final char[] lllllllllllllIIIIllllllIIlIllllI = lllllllllllllIIIIllllllIIlIllIll.toCharArray();
        int lllllllllllllIIIIllllllIIlIlllIl = BlockFurnace.lIlIlIllIlIIll[0];
        final char lllllllllllllIIIIllllllIIlIlIlll = (Object)((String)lllllllllllllIIIIllllllIIlIlllII).toCharArray();
        final long lllllllllllllIIIIllllllIIlIlIllI = lllllllllllllIIIIllllllIIlIlIlll.length;
        boolean lllllllllllllIIIIllllllIIlIlIlIl = BlockFurnace.lIlIlIllIlIIll[0] != 0;
        while (lllIllllIlIlIIl(lllllllllllllIIIIllllllIIlIlIlIl ? 1 : 0, (int)lllllllllllllIIIIllllllIIlIlIllI)) {
            final char lllllllllllllIIIIllllllIIllIIIlI = lllllllllllllIIIIllllllIIlIlIlll[lllllllllllllIIIIllllllIIlIlIlIl];
            lllllllllllllIIIIllllllIIlIlllll.append((char)(lllllllllllllIIIIllllllIIllIIIlI ^ lllllllllllllIIIIllllllIIlIllllI[lllllllllllllIIIIllllllIIlIlllIl % lllllllllllllIIIIllllllIIlIllllI.length]));
            "".length();
            ++lllllllllllllIIIIllllllIIlIlllIl;
            ++lllllllllllllIIIIllllllIIlIlIlIl;
            "".length();
            if ((10 + 6 + 3 + 131 ^ 44 + 137 - 145 + 110) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllllllIIlIlllll);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIIIllllllIlIlllllI, final int lllllllllllllIIIIllllllIlIllllIl) {
        return new TileEntityFurnace();
    }
    
    private static boolean lllIllllIlIIlll(final int lllllllllllllIIIIllllllIIlIIlIII) {
        return lllllllllllllIIIIllllllIIlIIlIII != 0;
    }
    
    private static void lllIlllIllIIllI() {
        (lIlIlIlIllllII = new String[BlockFurnace.lIlIlIllIlIIll[2]])[BlockFurnace.lIlIlIllIlIIll[0]] = lllIlllIllIIlIl("CQskICYI", "ojGIH");
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIIIllllllIlIlllIIl, final BlockPos lllllllllllllIIIIllllllIlIlllIII, final EnumFacing lllllllllllllIIIIllllllIlIllIlll, final float lllllllllllllIIIIllllllIlIllIllI, final float lllllllllllllIIIIllllllIlIllIlIl, final float lllllllllllllIIIIllllllIlIllIlII, final int lllllllllllllIIIIllllllIlIllIIll, final EntityLivingBase lllllllllllllIIIIllllllIlIllIIII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, lllllllllllllIIIIllllllIlIllIIII.getHorizontalFacing().getOpposite());
    }
    
    @Override
    public IBlockState getStateForEntityRender(final IBlockState lllllllllllllIIIIllllllIIlllllll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, EnumFacing.SOUTH);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIIlllllllIIlIlIIl, final Random lllllllllllllIIIIlllllllIIlIlIII, final int lllllllllllllIIIIlllllllIIlIIlll) {
        return Item.getItemFromBlock(Blocks.furnace);
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIIllllllIllIllIll, final BlockPos lllllllllllllIIIIllllllIllIlIIIl, final IBlockState lllllllllllllIIIIllllllIllIllIIl, final EntityPlayer lllllllllllllIIIIllllllIllIlIIII, final EnumFacing lllllllllllllIIIIllllllIllIlIlll, final float lllllllllllllIIIIllllllIllIlIllI, final float lllllllllllllIIIIllllllIllIlIlIl, final float lllllllllllllIIIIllllllIllIlIlII) {
        if (lllIllllIlIIlll(lllllllllllllIIIIllllllIllIllIll.isRemote ? 1 : 0)) {
            return BlockFurnace.lIlIlIllIlIIll[2] != 0;
        }
        final TileEntity lllllllllllllIIIIllllllIllIlIIll = lllllllllllllIIIIllllllIllIllIll.getTileEntity(lllllllllllllIIIIllllllIllIlIIIl);
        if (lllIllllIlIIlll((lllllllllllllIIIIllllllIllIlIIll instanceof TileEntityFurnace) ? 1 : 0)) {
            lllllllllllllIIIIllllllIllIlIIII.displayGUIChest((IInventory)lllllllllllllIIIIllllllIllIlIIll);
            lllllllllllllIIIIllllllIllIlIIII.triggerAchievement(StatList.field_181741_Y);
        }
        return BlockFurnace.lIlIlIllIlIIll[2] != 0;
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockFurnace.lIlIlIllIlIIll[2] != 0;
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIIIIllllllIlllIlIlI, final BlockPos lllllllllllllIIIIllllllIlllIlIIl, final IBlockState lllllllllllllIIIIllllllIllllIIll, final Random lllllllllllllIIIIllllllIlllIIlll) {
        if (lllIllllIlIIlll(this.isBurning ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIIllllllIllllIIIl = lllllllllllllIIIIllllllIllllIIll.getValue((IProperty<EnumFacing>)BlockFurnace.FACING);
            final double lllllllllllllIIIIllllllIllllIIII = lllllllllllllIIIIllllllIlllIlIIl.getX() + 0.5;
            final double lllllllllllllIIIIllllllIlllIllll = lllllllllllllIIIIllllllIlllIlIIl.getY() + lllllllllllllIIIIllllllIlllIIlll.nextDouble() * 6.0 / 16.0;
            final double lllllllllllllIIIIllllllIlllIlllI = lllllllllllllIIIIllllllIlllIlIIl.getZ() + 0.5;
            final double lllllllllllllIIIIllllllIlllIllIl = 0.52;
            final double lllllllllllllIIIIllllllIlllIllII = lllllllllllllIIIIllllllIlllIIlll.nextDouble() * 0.6 - 0.3;
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIIIllllllIllllIIIl.ordinal()]) {
                case 5: {
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIIIllllllIllllIIII - lllllllllllllIIIIllllllIlllIllIl, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI + lllllllllllllIIIIllllllIlllIllII, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.FLAME, lllllllllllllIIIIllllllIllllIIII - lllllllllllllIIIIllllllIlllIllIl, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI + lllllllllllllIIIIllllllIlllIllII, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    "".length();
                    if (((0xB0 ^ 0x85 ^ (0x14 ^ 0x3D)) & (0xE3 ^ 0xBB ^ (0x2A ^ 0x6E) ^ -" ".length())) != ((69 + 120 - 158 + 128 ^ 0 + 137 - 82 + 106) & (6 + 121 + 51 + 7 ^ 132 + 45 - 132 + 90 ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 6: {
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIIIllllllIllllIIII + lllllllllllllIIIIllllllIlllIllIl, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI + lllllllllllllIIIIllllllIlllIllII, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.FLAME, lllllllllllllIIIIllllllIllllIIII + lllllllllllllIIIIllllllIlllIllIl, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI + lllllllllllllIIIIllllllIlllIllII, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 3: {
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIIIllllllIllllIIII + lllllllllllllIIIIllllllIlllIllII, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI - lllllllllllllIIIIllllllIlllIllIl, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.FLAME, lllllllllllllIIIIllllllIllllIIII + lllllllllllllIIIIllllllIlllIllII, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI - lllllllllllllIIIIllllllIlllIllIl, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    "".length();
                    if (" ".length() <= ((68 + 31 + 57 + 16 ^ 132 + 110 - 107 + 14) & (0xD1 ^ 0x9B ^ (0x51 ^ 0x22) ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 4: {
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIIIllllllIllllIIII + lllllllllllllIIIIllllllIlllIllII, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI + lllllllllllllIIIIllllllIlllIllIl, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    lllllllllllllIIIIllllllIlllIlIlI.spawnParticle(EnumParticleTypes.FLAME, lllllllllllllIIIIllllllIllllIIII + lllllllllllllIIIIllllllIlllIllII, lllllllllllllIIIIllllllIlllIllll, lllllllllllllIIIIllllllIlllIlllI + lllllllllllllIIIIllllllIlllIllIl, 0.0, 0.0, 0.0, new int[BlockFurnace.lIlIlIllIlIIll[0]]);
                    break;
                }
            }
        }
    }
    
    @Override
    public int getRenderType() {
        return BlockFurnace.lIlIlIllIlIIll[3];
    }
    
    private static boolean lllIllllIlIIllI(final Object lllllllllllllIIIIllllllIIlIIllIl, final Object lllllllllllllIIIIllllllIIlIIllII) {
        return lllllllllllllIIIIllllllIIlIIllIl == lllllllllllllIIIIllllllIIlIIllII;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIllllllIIlllIllI) {
        EnumFacing lllllllllllllIIIIllllllIIllllIII = EnumFacing.getFront(lllllllllllllIIIIllllllIIlllIllI);
        if (lllIllllIlIIllI(lllllllllllllIIIIllllllIIllllIII.getAxis(), EnumFacing.Axis.Y)) {
            lllllllllllllIIIIllllllIIllllIII = EnumFacing.NORTH;
        }
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, lllllllllllllIIIIllllllIIllllIII);
    }
    
    private static boolean lllIllllIlIlIIl(final int lllllllllllllIIIIllllllIIlIlIIIl, final int lllllllllllllIIIIllllllIIlIlIIII) {
        return lllllllllllllIIIIllllllIIlIlIIIl < lllllllllllllIIIIllllllIIlIlIIII;
    }
    
    public static void setState(final boolean lllllllllllllIIIIllllllIllIIIlII, final World lllllllllllllIIIIllllllIllIIlIII, final BlockPos lllllllllllllIIIIllllllIllIIIlll) {
        final IBlockState lllllllllllllIIIIllllllIllIIIllI = lllllllllllllIIIIllllllIllIIlIII.getBlockState(lllllllllllllIIIIllllllIllIIIlll);
        final TileEntity lllllllllllllIIIIllllllIllIIIlIl = lllllllllllllIIIIllllllIllIIlIII.getTileEntity(lllllllllllllIIIIllllllIllIIIlll);
        BlockFurnace.keepInventory = (BlockFurnace.lIlIlIllIlIIll[2] != 0);
        if (lllIllllIlIIlll(lllllllllllllIIIIllllllIllIIIlII ? 1 : 0)) {
            lllllllllllllIIIIllllllIllIIlIII.setBlockState(lllllllllllllIIIIllllllIllIIIlll, Blocks.lit_furnace.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, (EnumFacing)lllllllllllllIIIIllllllIllIIIllI.getValue((IProperty<V>)BlockFurnace.FACING)), BlockFurnace.lIlIlIllIlIIll[3]);
            "".length();
            lllllllllllllIIIIllllllIllIIlIII.setBlockState(lllllllllllllIIIIllllllIllIIIlll, Blocks.lit_furnace.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, (EnumFacing)lllllllllllllIIIIllllllIllIIIllI.getValue((IProperty<V>)BlockFurnace.FACING)), BlockFurnace.lIlIlIllIlIIll[3]);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIIIllllllIllIIlIII.setBlockState(lllllllllllllIIIIllllllIllIIIlll, Blocks.furnace.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, (EnumFacing)lllllllllllllIIIIllllllIllIIIllI.getValue((IProperty<V>)BlockFurnace.FACING)), BlockFurnace.lIlIlIllIlIIll[3]);
            "".length();
            lllllllllllllIIIIllllllIllIIlIII.setBlockState(lllllllllllllIIIIllllllIllIIIlll, Blocks.furnace.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, (EnumFacing)lllllllllllllIIIIllllllIllIIIllI.getValue((IProperty<V>)BlockFurnace.FACING)), BlockFurnace.lIlIlIllIlIIll[3]);
            "".length();
        }
        BlockFurnace.keepInventory = (BlockFurnace.lIlIlIllIlIIll[0] != 0);
        if (lllIllllIlIlIII(lllllllllllllIIIIllllllIllIIIlIl)) {
            lllllllllllllIIIIllllllIllIIIlIl.validate();
            lllllllllllllIIIIllllllIllIIlIII.setTileEntity(lllllllllllllIIIIllllllIllIIIlll, lllllllllllllIIIIllllllIllIIIlIl);
        }
    }
    
    @Override
    public void onBlockPlacedBy(final World lllllllllllllIIIIllllllIlIlIlIII, final BlockPos lllllllllllllIIIIllllllIlIlIIIIl, final IBlockState lllllllllllllIIIIllllllIlIlIIllI, final EntityLivingBase lllllllllllllIIIIllllllIlIlIIlIl, final ItemStack lllllllllllllIIIIllllllIlIlIIlII) {
        lllllllllllllIIIIllllllIlIlIlIII.setBlockState(lllllllllllllIIIIllllllIlIlIIIIl, lllllllllllllIIIIllllllIlIlIIllI.withProperty((IProperty<Comparable>)BlockFurnace.FACING, lllllllllllllIIIIllllllIlIlIIlIl.getHorizontalFacing().getOpposite()), BlockFurnace.lIlIlIllIlIIll[1]);
        "".length();
        if (lllIllllIlIIlll(lllllllllllllIIIIllllllIlIlIIlII.hasDisplayName() ? 1 : 0)) {
            final TileEntity lllllllllllllIIIIllllllIlIlIIIll = lllllllllllllIIIIllllllIlIlIlIII.getTileEntity(lllllllllllllIIIIllllllIlIlIIIIl);
            if (lllIllllIlIIlll((lllllllllllllIIIIllllllIlIlIIIll instanceof TileEntityFurnace) ? 1 : 0)) {
                ((TileEntityFurnace)lllllllllllllIIIIllllllIlIlIIIll).setCustomInventoryName(lllllllllllllIIIIllllllIlIlIIlII.getDisplayName());
            }
        }
    }
    
    private static boolean lllIllllIlIIlIl(final int lllllllllllllIIIIllllllIIlIIIllI) {
        return lllllllllllllIIIIllllllIIlIIIllI == 0;
    }
    
    @Override
    public int getComparatorInputOverride(final World lllllllllllllIIIIllllllIlIIIlIIl, final BlockPos lllllllllllllIIIIllllllIlIIIIllI) {
        return Container.calcRedstone(lllllllllllllIIIIllllllIlIIIlIIl.getTileEntity(lllllllllllllIIIIllllllIlIIIIllI));
    }
    
    private static boolean lllIllllIlIlIII(final Object lllllllllllllIIIIllllllIIlIIlIlI) {
        return lllllllllllllIIIIllllllIIlIIlIlI != null;
    }
}
