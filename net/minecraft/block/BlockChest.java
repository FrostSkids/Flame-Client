// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import com.google.common.base.Predicate;
import net.minecraft.util.MathHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.Container;
import net.minecraft.stats.StatList;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.world.ILockableContainer;
import net.minecraft.block.state.BlockState;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.properties.IProperty;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.PropertyDirection;

public class BlockChest extends BlockContainer
{
    private static final /* synthetic */ int[] llIllIlIIIIIlI;
    private static final /* synthetic */ String[] llIllIIllIIllI;
    public final /* synthetic */ int chestType;
    public static final /* synthetic */ PropertyDirection FACING;
    
    private static String lIIlIlllIIlIlIll(final String llllllllllllIllIIlllIIllIllIllIl, final String llllllllllllIllIIlllIIllIllIllII) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIIllIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIIllIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIIllIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIIllIllIllll.init(BlockChest.llIllIlIIIIIlI[1], llllllllllllIllIIlllIIllIlllIIII);
            return new String(llllllllllllIllIIlllIIllIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIIllIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIIllIllIlllI) {
            llllllllllllIllIIlllIIllIllIlllI.printStackTrace();
            return null;
        }
    }
    
    private boolean isDoubleChest(final World llllllllllllIllIIlllIlIIIlIIIIIl, final BlockPos llllllllllllIllIIlllIlIIIlIIIIII) {
        if (lIIlIlllIllllIII(llllllllllllIllIIlllIlIIIlIIIIIl.getBlockState(llllllllllllIllIIlllIlIIIlIIIIII).getBlock(), this)) {
            return BlockChest.llIllIlIIIIIlI[0] != 0;
        }
        final Exception llllllllllllIllIIlllIlIIIIlllllI = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (((127 + 57 - 149 + 142 ^ 21 + 25 + 51 + 45) & (89 + 83 - 33 + 40 ^ 7 + 6 + 75 + 52 ^ -" ".length())) > 0) {
            return ((0x16 ^ 0xE ^ (0x64 ^ 0x71)) & (0x72 ^ 0x11 ^ (0xEB ^ 0x85) ^ -" ".length())) != 0x0;
        }
        while (!lIIlIlllIlllIllI(((Iterator)llllllllllllIllIIlllIlIIIIlllllI).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllIIlllIlIIIlIIIIll = ((Iterator<EnumFacing>)llllllllllllIllIIlllIlIIIIlllllI).next();
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIIlIIIIIl.getBlockState(llllllllllllIllIIlllIlIIIlIIIIII.offset(llllllllllllIllIIlllIlIIIlIIIIll)).getBlock(), this)) {
                return BlockChest.llIllIlIIIIIlI[3] != 0;
            }
        }
        return BlockChest.llIllIlIIIIIlI[0] != 0;
    }
    
    private boolean isOcelotSittingOnChest(final World llllllllllllIllIIlllIIlllIlIlIll, final BlockPos llllllllllllIllIIlllIIlllIlIlllI) {
        final int llllllllllllIllIIlllIIlllIlIlIII = (int)llllllllllllIllIIlllIIlllIlIlIll.getEntitiesWithinAABB((Class<? extends Entity>)EntityOcelot.class, new AxisAlignedBB(llllllllllllIllIIlllIIlllIlIlllI.getX(), llllllllllllIllIIlllIIlllIlIlllI.getY() + BlockChest.llIllIlIIIIIlI[3], llllllllllllIllIIlllIIlllIlIlllI.getZ(), llllllllllllIllIIlllIIlllIlIlllI.getX() + BlockChest.llIllIlIIIIIlI[3], llllllllllllIllIIlllIIlllIlIlllI.getY() + BlockChest.llIllIlIIIIIlI[1], llllllllllllIllIIlllIIlllIlIlllI.getZ() + BlockChest.llIllIlIIIIIlI[3])).iterator();
        "".length();
        if (-" ".length() > ((142 + 166 - 172 + 56 ^ 139 + 88 - 145 + 68) & (0x60 ^ 0x7E ^ (0x61 ^ 0x29) ^ -" ".length()))) {
            return ((0x2E ^ 0x20 ^ (0x23 ^ 0x2)) & (42 + 92 - 83 + 122 ^ 93 + 39 - 18 + 16 ^ -" ".length())) != 0x0;
        }
        while (!lIIlIlllIlllIllI(((Iterator)llllllllllllIllIIlllIIlllIlIlIII).hasNext() ? 1 : 0)) {
            final Entity llllllllllllIllIIlllIIlllIlIllIl = ((Iterator<Entity>)llllllllllllIllIIlllIIlllIlIlIII).next();
            final EntityOcelot llllllllllllIllIIlllIIlllIlIllII = (EntityOcelot)llllllllllllIllIIlllIIlllIlIllIl;
            if (lIIlIlllIlllIlll(llllllllllllIllIIlllIIlllIlIllII.isSitting() ? 1 : 0)) {
                return BlockChest.llIllIlIIIIIlI[3] != 0;
            }
        }
        return BlockChest.llIllIlIIIIIlI[0] != 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIIlllIlIIIIllIllI, final BlockPos llllllllllllIllIIlllIlIIIIllIlIl, final IBlockState llllllllllllIllIIlllIlIIIIlIlllI, final Block llllllllllllIllIIlllIlIIIIlIllIl) {
        super.onNeighborBlockChange(llllllllllllIllIIlllIlIIIIllIllI, llllllllllllIllIIlllIlIIIIllIlIl, llllllllllllIllIIlllIlIIIIlIlllI, llllllllllllIllIIlllIlIIIIlIllIl);
        final TileEntity llllllllllllIllIIlllIlIIIIllIIlI = llllllllllllIllIIlllIlIIIIllIllI.getTileEntity(llllllllllllIllIIlllIlIIIIllIlIl);
        if (lIIlIlllIlllIlll((llllllllllllIllIIlllIlIIIIllIIlI instanceof TileEntityChest) ? 1 : 0)) {
            llllllllllllIllIIlllIlIIIIllIIlI.updateContainingBlockInfo();
        }
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockChest.llIllIlIIIIIlI[0] != 0;
    }
    
    private boolean isBelowSolidBlock(final World llllllllllllIllIIlllIIlllIllIlll, final BlockPos llllllllllllIllIIlllIIlllIlllIII) {
        return llllllllllllIllIIlllIIlllIllIlll.getBlockState(llllllllllllIllIIlllIIlllIlllIII.up()).getBlock().isNormalCube();
    }
    
    public IBlockState checkForSurroundingChests(final World llllllllllllIllIIlllIlIIlIIIllll, final BlockPos llllllllllllIllIIlllIlIIlIlIlIll, IBlockState llllllllllllIllIIlllIlIIlIlIlIlI) {
        if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIlIIIllll.isRemote ? 1 : 0)) {
            return llllllllllllIllIIlllIlIIlIlIlIlI;
        }
        final IBlockState llllllllllllIllIIlllIlIIlIlIlIIl = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIlIlIll.north());
        final IBlockState llllllllllllIllIIlllIlIIlIlIlIII = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIlIlIll.south());
        final IBlockState llllllllllllIllIIlllIlIIlIlIIlll = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIlIlIll.west());
        final IBlockState llllllllllllIllIIlllIlIIlIlIIllI = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIlIlIll.east());
        EnumFacing llllllllllllIllIIlllIlIIlIlIIlIl = llllllllllllIllIIlllIlIIlIlIlIlI.getValue((IProperty<EnumFacing>)BlockChest.FACING);
        final Block llllllllllllIllIIlllIlIIlIlIIlII = llllllllllllIllIIlllIlIIlIlIlIIl.getBlock();
        final Block llllllllllllIllIIlllIlIIlIlIIIll = llllllllllllIllIIlllIlIIlIlIlIII.getBlock();
        final Block llllllllllllIllIIlllIlIIlIlIIIlI = llllllllllllIllIIlllIlIIlIlIIlll.getBlock();
        final Block llllllllllllIllIIlllIlIIlIlIIIIl = llllllllllllIllIIlllIlIIlIlIIllI.getBlock();
        if (lIIlIlllIllllIII(llllllllllllIllIIlllIlIIlIlIIlII, this) && lIIlIlllIllllIII(llllllllllllIllIIlllIlIIlIlIIIll, this)) {
            final boolean llllllllllllIllIIlllIlIIlIlIIIII = llllllllllllIllIIlllIlIIlIlIIlII.isFullBlock();
            final boolean llllllllllllIllIIlllIlIIlIIlllll = llllllllllllIllIIlllIlIIlIlIIIll.isFullBlock();
            if (!lIIlIlllIllllIII(llllllllllllIllIIlllIlIIlIlIIIlI, this) || lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIlIlIIIIl, this)) {
                BlockPos blockPos;
                if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIlIlIIIlI, this)) {
                    blockPos = llllllllllllIllIIlllIlIIlIlIlIll.west();
                    "".length();
                    if (((0x3C ^ 0x2) & ~(0x4A ^ 0x74)) != ((0xE1 ^ 0xA4) & ~(0xE4 ^ 0xA1))) {
                        return null;
                    }
                }
                else {
                    blockPos = llllllllllllIllIIlllIlIIlIlIlIll.east();
                }
                final BlockPos llllllllllllIllIIlllIlIIlIIllllI = blockPos;
                final IBlockState llllllllllllIllIIlllIlIIlIIlllIl = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIIllllI.north());
                final IBlockState llllllllllllIllIIlllIlIIlIIlllII = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIIllllI.south());
                llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.SOUTH;
                EnumFacing llllllllllllIllIIlllIlIIlIIllIlI = null;
                if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIlIlIIIlI, this)) {
                    final EnumFacing llllllllllllIllIIlllIlIIlIIllIll = llllllllllllIllIIlllIlIIlIlIIlll.getValue((IProperty<EnumFacing>)BlockChest.FACING);
                    "".length();
                    if (((0xDF ^ 0x95 ^ (0x67 ^ 0x19)) & (131 + 73 - 114 + 91 ^ 123 + 70 - 164 + 100 ^ -" ".length())) >= (0xB7 ^ 0xAE ^ (0x21 ^ 0x3C))) {
                        return null;
                    }
                }
                else {
                    llllllllllllIllIIlllIlIIlIIllIlI = llllllllllllIllIIlllIlIIlIlIIllI.getValue((IProperty<EnumFacing>)BlockChest.FACING);
                }
                if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIlIIllIlI, EnumFacing.NORTH)) {
                    llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.NORTH;
                }
                final Block llllllllllllIllIIlllIlIIlIIllIIl = llllllllllllIllIIlllIlIIlIIlllIl.getBlock();
                final Block llllllllllllIllIIlllIlIIlIIllIII = llllllllllllIllIIlllIlIIlIIlllII.getBlock();
                if ((!lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIlIIIII ? 1 : 0) || lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIlIIllIIl.isFullBlock() ? 1 : 0)) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIIlllll ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIIllIII.isFullBlock() ? 1 : 0)) {
                    llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.SOUTH;
                }
                if ((!lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIIlllll ? 1 : 0) || lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIlIIllIII.isFullBlock() ? 1 : 0)) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIlIIIII ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIIllIIl.isFullBlock() ? 1 : 0)) {
                    llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.NORTH;
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return null;
                    }
                }
            }
        }
        else {
            BlockPos blockPos2;
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIlIlIIlII, this)) {
                blockPos2 = llllllllllllIllIIlllIlIIlIlIlIll.north();
                "".length();
                if (((0xA9 ^ 0xA7 ^ (0x65 ^ 0x27)) & (0x36 ^ 0x77 ^ (0x13 ^ 0x1E) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                blockPos2 = llllllllllllIllIIlllIlIIlIlIlIll.south();
            }
            final BlockPos llllllllllllIllIIlllIlIIlIIlIlll = blockPos2;
            final IBlockState llllllllllllIllIIlllIlIIlIIlIllI = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIIlIlll.west());
            final IBlockState llllllllllllIllIIlllIlIIlIIlIlIl = llllllllllllIllIIlllIlIIlIIIllll.getBlockState(llllllllllllIllIIlllIlIIlIIlIlll.east());
            llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.EAST;
            EnumFacing llllllllllllIllIIlllIlIIlIIlIIll = null;
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIlIlIIlII, this)) {
                final EnumFacing llllllllllllIllIIlllIlIIlIIlIlII = llllllllllllIllIIlllIlIIlIlIlIIl.getValue((IProperty<EnumFacing>)BlockChest.FACING);
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIllIIlllIlIIlIIlIIll = llllllllllllIllIIlllIlIIlIlIlIII.getValue((IProperty<EnumFacing>)BlockChest.FACING);
            }
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIlIIlIIll, EnumFacing.WEST)) {
                llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.WEST;
            }
            final Block llllllllllllIllIIlllIlIIlIIlIIlI = llllllllllllIllIIlllIlIIlIIlIllI.getBlock();
            final Block llllllllllllIllIIlllIlIIlIIlIIIl = llllllllllllIllIIlllIlIIlIIlIlIl.getBlock();
            if ((!lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIlIIIlI.isFullBlock() ? 1 : 0) || lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIlIIlIIlI.isFullBlock() ? 1 : 0)) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIlIIIIl.isFullBlock() ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIIlIIIl.isFullBlock() ? 1 : 0)) {
                llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.EAST;
            }
            if ((!lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIlIIIIl.isFullBlock() ? 1 : 0) || lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIlIIlIIIl.isFullBlock() ? 1 : 0)) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIlIIIlI.isFullBlock() ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIlIIlIIlI.isFullBlock() ? 1 : 0)) {
                llllllllllllIllIIlllIlIIlIlIIlIl = EnumFacing.WEST;
            }
        }
        llllllllllllIllIIlllIlIIlIlIlIlI = llllllllllllIllIIlllIlIIlIlIlIlI.withProperty((IProperty<Comparable>)BlockChest.FACING, llllllllllllIllIIlllIlIIlIlIIlIl);
        llllllllllllIllIIlllIlIIlIIIllll.setBlockState(llllllllllllIllIIlllIlIIlIlIlIll, llllllllllllIllIIlllIlIIlIlIlIlI, BlockChest.llIllIlIIIIIlI[2]);
        "".length();
        return llllllllllllIllIIlllIlIIlIlIlIlI;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockChest.llIllIlIIIIIlI[0] != 0;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIllIIlllIlIIllllllII, final BlockPos llllllllllllIllIIlllIlIIlllllIll, final EnumFacing llllllllllllIllIIlllIlIIlllllIlI, final float llllllllllllIllIIlllIlIIlllllIIl, final float llllllllllllIllIIlllIlIIlllllIII, final float llllllllllllIllIIlllIlIIllllIlll, final int llllllllllllIllIIlllIlIIllllIllI, final EntityLivingBase llllllllllllIllIIlllIlIIllllIIll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockChest.FACING, llllllllllllIllIIlllIlIIllllIIll.getHorizontalFacing());
    }
    
    @Override
    public boolean canProvidePower() {
        if (lIIlIlllIllllIll(this.chestType, BlockChest.llIllIlIIIIIlI[3])) {
            return BlockChest.llIllIlIIIIIlI[3] != 0;
        }
        return BlockChest.llIllIlIIIIIlI[0] != 0;
    }
    
    @Override
    public int getStrongPower(final IBlockAccess llllllllllllIllIIlllIIllllIIlIIl, final BlockPos llllllllllllIllIIlllIIllllIIlIII, final IBlockState llllllllllllIllIIlllIIllllIIllII, final EnumFacing llllllllllllIllIIlllIIllllIIlIll) {
        int weakPower;
        if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIIllllIIlIll, EnumFacing.UP)) {
            weakPower = this.getWeakPower(llllllllllllIllIIlllIIllllIIlIIl, llllllllllllIllIIlllIIllllIIlIII, llllllllllllIllIIlllIIllllIIllII, llllllllllllIllIIlllIIllllIIlIll);
            "".length();
            if ("  ".length() <= ((0x76 ^ 0x38) & ~(0x13 ^ 0x5D))) {
                return (0x6B ^ 0xB) & ~(0xE6 ^ 0x86);
            }
        }
        else {
            weakPower = BlockChest.llIllIlIIIIIlI[0];
        }
        return weakPower;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIIlllIIlllIIlIIIl) {
        return llllllllllllIllIIlllIIlllIIlIIIl.getValue((IProperty<EnumFacing>)BlockChest.FACING).getIndex();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockChest.llIllIlIIIIIlI[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockChest.llIllIlIIIIIlI[0]] = BlockChest.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockChest.llIllIlIIIIIlI[3] != 0;
    }
    
    private static boolean lIIlIlllIllllIIl(final Object llllllllllllIllIIlllIIllIlIlIIlI) {
        return llllllllllllIllIIlllIIllIlIlIIlI != null;
    }
    
    private static void lIIlIlllIlllIlII() {
        (llIllIlIIIIIlI = new int[5])[0] = ((25 + 49 - 20 + 138 ^ 129 + 123 - 192 + 82) & (13 + 10 + 77 + 123 ^ 20 + 128 - 70 + 67 ^ -" ".length()));
        BlockChest.llIllIlIIIIIlI[1] = "  ".length();
        BlockChest.llIllIlIIIIIlI[2] = "   ".length();
        BlockChest.llIllIlIIIIIlI[3] = " ".length();
        BlockChest.llIllIlIIIIIlI[4] = ("   ".length() ^ (0x1B ^ 0x17));
    }
    
    private static boolean lIIlIlllIllllIll(final int llllllllllllIllIIlllIIllIllIIlIl, final int llllllllllllIllIIlllIIllIllIIlII) {
        return llllllllllllIllIIlllIIllIllIIlIl == llllllllllllIllIIlllIIllIllIIlII;
    }
    
    public ILockableContainer getLockableContainer(final World llllllllllllIllIIlllIIllllllIlII, final BlockPos llllllllllllIllIIlllIIllllllIIll) {
        final TileEntity llllllllllllIllIIlllIIlllllllIll = llllllllllllIllIIlllIIllllllIlII.getTileEntity(llllllllllllIllIIlllIIllllllIIll);
        if (lIIlIlllIlllIllI((llllllllllllIllIIlllIIlllllllIll instanceof TileEntityChest) ? 1 : 0)) {
            return null;
        }
        ILockableContainer llllllllllllIllIIlllIIlllllllIlI = (TileEntityChest)llllllllllllIllIIlllIIlllllllIll;
        if (lIIlIlllIlllIlll(this.isBlocked(llllllllllllIllIIlllIIllllllIlII, llllllllllllIllIIlllIIllllllIIll) ? 1 : 0)) {
            return null;
        }
        final short llllllllllllIllIIlllIIlllllIllll = (short)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (-" ".length() >= 0) {
            return null;
        }
        while (!lIIlIlllIlllIllI(((Iterator)llllllllllllIllIIlllIIlllllIllll).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllIIlllIIlllllllIIl = ((Iterator<EnumFacing>)llllllllllllIllIIlllIIlllllIllll).next();
            final BlockPos llllllllllllIllIIlllIIlllllllIII = llllllllllllIllIIlllIIllllllIIll.offset(llllllllllllIllIIlllIIlllllllIIl);
            final Block llllllllllllIllIIlllIIllllllIlll = llllllllllllIllIIlllIIllllllIlII.getBlockState(llllllllllllIllIIlllIIlllllllIII).getBlock();
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIIllllllIlll, this)) {
                if (lIIlIlllIlllIlll(this.isBlocked(llllllllllllIllIIlllIIllllllIlII, llllllllllllIllIIlllIIlllllllIII) ? 1 : 0)) {
                    return null;
                }
                final TileEntity llllllllllllIllIIlllIIllllllIllI = llllllllllllIllIIlllIIllllllIlII.getTileEntity(llllllllllllIllIIlllIIlllllllIII);
                if (!lIIlIlllIlllIlll((llllllllllllIllIIlllIIllllllIllI instanceof TileEntityChest) ? 1 : 0)) {
                    continue;
                }
                if (lIIlIlllIllllIII(llllllllllllIllIIlllIIlllllllIIl, EnumFacing.WEST) && lIIlIlllIllllIII(llllllllllllIllIIlllIIlllllllIIl, EnumFacing.NORTH)) {
                    llllllllllllIllIIlllIIlllllllIlI = new InventoryLargeChest(BlockChest.llIllIIllIIllI[BlockChest.llIllIlIIIIIlI[3]], llllllllllllIllIIlllIIlllllllIlI, (ILockableContainer)llllllllllllIllIIlllIIllllllIllI);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    continue;
                }
                else {
                    llllllllllllIllIIlllIIlllllllIlI = new InventoryLargeChest(BlockChest.llIllIIllIIllI[BlockChest.llIllIlIIIIIlI[1]], (ILockableContainer)llllllllllllIllIIlllIIllllllIllI, llllllllllllIllIIlllIIlllllllIlI);
                }
            }
        }
        return llllllllllllIllIIlllIIlllllllIlI;
    }
    
    private static void lIIlIlllIIlIllII() {
        (llIllIIllIIllI = new String[BlockChest.llIllIlIIIIIlI[2]])[BlockChest.llIllIlIIIIIlI[0]] = lIIlIlllIIlIlIlI("IgQHCCwj", "DedaB");
        BlockChest.llIllIIllIIllI[BlockChest.llIllIlIIIIIlI[3]] = lIIlIlllIIlIlIlI("DAIYLRUGAxMrWgwFEyoAKwIDOxgK", "omvYt");
        BlockChest.llIllIIllIIllI[BlockChest.llIllIlIIIIIlI[1]] = lIIlIlllIIlIlIll("gchDHOtwJZYtil49/KswMowv+DueOnP8", "NRIqd");
    }
    
    @Override
    public int getRenderType() {
        return BlockChest.llIllIlIIIIIlI[1];
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIllIIlllIlIIIIIlIllI, final BlockPos llllllllllllIllIIlllIlIIIIIlIlIl, final IBlockState llllllllllllIllIIlllIlIIIIIlIlII, final EntityPlayer llllllllllllIllIIlllIlIIIIIlIIll, final EnumFacing llllllllllllIllIIlllIlIIIIIlIIlI, final float llllllllllllIllIIlllIlIIIIIlIIIl, final float llllllllllllIllIIlllIlIIIIIlIIII, final float llllllllllllIllIIlllIlIIIIIIllll) {
        if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIIIIlIllI.isRemote ? 1 : 0)) {
            return BlockChest.llIllIlIIIIIlI[3] != 0;
        }
        final ILockableContainer llllllllllllIllIIlllIlIIIIIIlllI = this.getLockableContainer(llllllllllllIllIIlllIlIIIIIlIllI, llllllllllllIllIIlllIlIIIIIlIlIl);
        if (lIIlIlllIllllIIl(llllllllllllIllIIlllIlIIIIIIlllI)) {
            llllllllllllIllIIlllIlIIIIIlIIll.displayGUIChest(llllllllllllIllIIlllIlIIIIIIlllI);
            if (lIIlIlllIlllIllI(this.chestType)) {
                llllllllllllIllIIlllIlIIIIIlIIll.triggerAchievement(StatList.field_181723_aa);
                "".length();
                if (" ".length() > "   ".length()) {
                    return ((0x9E ^ 0xB6) & ~(0xA3 ^ 0x8B)) != 0x0;
                }
            }
            else if (lIIlIlllIllllIll(this.chestType, BlockChest.llIllIlIIIIIlI[3])) {
                llllllllllllIllIIlllIlIIIIIlIIll.triggerAchievement(StatList.field_181737_U);
            }
        }
        return BlockChest.llIllIlIIIIIlI[3] != 0;
    }
    
    private static boolean lIIlIlllIlllIllI(final int llllllllllllIllIIlllIIllIlIIlllI) {
        return llllllllllllIllIIlllIIllIlIIlllI == 0;
    }
    
    private static boolean lIIlIlllIllllIII(final Object llllllllllllIllIIlllIIllIlIllIIl, final Object llllllllllllIllIIlllIIllIlIllIII) {
        return llllllllllllIllIIlllIIllIlIllIIl != llllllllllllIllIIlllIIllIlIllIII;
    }
    
    private static boolean lIIlIlllIlllllII(final int llllllllllllIllIIlllIIllIllIIIIl, final int llllllllllllIllIIlllIIllIllIIIII) {
        return llllllllllllIllIIlllIIllIllIIIIl < llllllllllllIllIIlllIIllIllIIIII;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIllIIlllIlIlIIIllIII, final BlockPos llllllllllllIllIIlllIlIlIIIlIlll) {
        if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIlIIIllIII.getBlockState(llllllllllllIllIIlllIlIlIIIlIlll.north()).getBlock(), this)) {
            this.setBlockBounds(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIlIIIllIII.getBlockState(llllllllllllIllIIlllIlIlIIIlIlll.south()).getBlock(), this)) {
            this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIlIIIllIII.getBlockState(llllllllllllIllIIlllIlIlIIIlIlll.west()).getBlock(), this)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIlIIIllIII.getBlockState(llllllllllllIllIIlllIlIlIIIlIlll.east()).getBlock(), this)) {
            this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }
    
    @Override
    public int getComparatorInputOverride(final World llllllllllllIllIIlllIIlllIIllllI, final BlockPos llllllllllllIllIIlllIIlllIIlllIl) {
        return Container.calcRedstoneFromInventory(this.getLockableContainer(llllllllllllIllIIlllIIlllIIllllI, llllllllllllIllIIlllIIlllIIlllIl));
    }
    
    private static boolean lIIlIlllIllllIlI(final int llllllllllllIllIIlllIIllIlIlllIl, final int llllllllllllIllIIlllIIllIlIlllII) {
        return llllllllllllIllIIlllIIllIlIlllIl <= llllllllllllIllIIlllIIllIlIlllII;
    }
    
    private static boolean lIIlIlllIlllIlll(final int llllllllllllIllIIlllIIllIlIlIIII) {
        return llllllllllllIllIIlllIIllIlIlIIII != 0;
    }
    
    private static boolean lIIlIlllIlllIlIl(final Object llllllllllllIllIIlllIIllIlIlIlIl, final Object llllllllllllIllIIlllIIllIlIlIlII) {
        return llllllllllllIllIIlllIIllIlIlIlIl == llllllllllllIllIIlllIIllIlIlIlII;
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIllIIlllIlIlIIIIIllI, final BlockPos llllllllllllIllIIlllIlIlIIIIllII, final IBlockState llllllllllllIllIIlllIlIlIIIIlIll) {
        this.checkForSurroundingChests(llllllllllllIllIIlllIlIlIIIIIllI, llllllllllllIllIIlllIlIlIIIIllII, llllllllllllIllIIlllIlIlIIIIlIll);
        "".length();
        final short llllllllllllIllIIlllIlIlIIIIIIlI = (short)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!lIIlIlllIlllIllI(((Iterator)llllllllllllIllIIlllIlIlIIIIIIlI).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllIIlllIlIlIIIIlIlI = ((Iterator<EnumFacing>)llllllllllllIllIIlllIlIlIIIIIIlI).next();
            final BlockPos llllllllllllIllIIlllIlIlIIIIlIIl = llllllllllllIllIIlllIlIlIIIIllII.offset(llllllllllllIllIIlllIlIlIIIIlIlI);
            final IBlockState llllllllllllIllIIlllIlIlIIIIlIII = llllllllllllIllIIlllIlIlIIIIIllI.getBlockState(llllllllllllIllIIlllIlIlIIIIlIIl);
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIlIIIIlIII.getBlock(), this)) {
                this.checkForSurroundingChests(llllllllllllIllIIlllIlIlIIIIIllI, llllllllllllIllIIlllIlIlIIIIlIIl, llllllllllllIllIIlllIlIlIIIIlIII);
                "".length();
            }
        }
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIllIIlllIlIIIlIllIlI, final BlockPos llllllllllllIllIIlllIlIIIlIlIIIl) {
        int llllllllllllIllIIlllIlIIIlIllIII = BlockChest.llIllIlIIIIIlI[0];
        final BlockPos llllllllllllIllIIlllIlIIIlIlIlll = llllllllllllIllIIlllIlIIIlIlIIIl.west();
        final BlockPos llllllllllllIllIIlllIlIIIlIlIllI = llllllllllllIllIIlllIlIIIlIlIIIl.east();
        final BlockPos llllllllllllIllIIlllIlIIIlIlIlIl = llllllllllllIllIIlllIlIIIlIlIIIl.north();
        final BlockPos llllllllllllIllIIlllIlIIIlIlIlII = llllllllllllIllIIlllIlIIIlIlIIIl.south();
        if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIIlIllIlI.getBlockState(llllllllllllIllIIlllIlIIIlIlIlll).getBlock(), this)) {
            if (lIIlIlllIlllIlll(this.isDoubleChest(llllllllllllIllIIlllIlIIIlIllIlI, llllllllllllIllIIlllIlIIIlIlIlll) ? 1 : 0)) {
                return BlockChest.llIllIlIIIIIlI[0] != 0;
            }
            ++llllllllllllIllIIlllIlIIIlIllIII;
        }
        if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIIlIllIlI.getBlockState(llllllllllllIllIIlllIlIIIlIlIllI).getBlock(), this)) {
            if (lIIlIlllIlllIlll(this.isDoubleChest(llllllllllllIllIIlllIlIIIlIllIlI, llllllllllllIllIIlllIlIIIlIlIllI) ? 1 : 0)) {
                return BlockChest.llIllIlIIIIIlI[0] != 0;
            }
            ++llllllllllllIllIIlllIlIIIlIllIII;
        }
        if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIIlIllIlI.getBlockState(llllllllllllIllIIlllIlIIIlIlIlIl).getBlock(), this)) {
            if (lIIlIlllIlllIlll(this.isDoubleChest(llllllllllllIllIIlllIlIIIlIllIlI, llllllllllllIllIIlllIlIIIlIlIlIl) ? 1 : 0)) {
                return BlockChest.llIllIlIIIIIlI[0] != 0;
            }
            ++llllllllllllIllIIlllIlIIIlIllIII;
        }
        if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIIlIllIlI.getBlockState(llllllllllllIllIIlllIlIIIlIlIlII).getBlock(), this)) {
            if (lIIlIlllIlllIlll(this.isDoubleChest(llllllllllllIllIIlllIlIIIlIllIlI, llllllllllllIllIIlllIlIIIlIlIlII) ? 1 : 0)) {
                return BlockChest.llIllIlIIIIIlI[0] != 0;
            }
            ++llllllllllllIllIIlllIlIIIlIllIII;
        }
        if (lIIlIlllIllllIlI(llllllllllllIllIIlllIlIIIlIllIII, BlockChest.llIllIlIIIIIlI[3])) {
            return BlockChest.llIllIlIIIIIlI[3] != 0;
        }
        return BlockChest.llIllIlIIIIIlI[0] != 0;
    }
    
    @Override
    public void breakBlock(final World llllllllllllIllIIlllIlIIIIlIIlIl, final BlockPos llllllllllllIllIIlllIlIIIIIlllll, final IBlockState llllllllllllIllIIlllIlIIIIlIIIll) {
        final TileEntity llllllllllllIllIIlllIlIIIIlIIIlI = llllllllllllIllIIlllIlIIIIlIIlIl.getTileEntity(llllllllllllIllIIlllIlIIIIIlllll);
        if (lIIlIlllIlllIlll((llllllllllllIllIIlllIlIIIIlIIIlI instanceof IInventory) ? 1 : 0)) {
            InventoryHelper.dropInventoryItems(llllllllllllIllIIlllIlIIIIlIIlIl, llllllllllllIllIIlllIlIIIIIlllll, (IInventory)llllllllllllIllIIlllIlIIIIlIIIlI);
            llllllllllllIllIIlllIlIIIIlIIlIl.updateComparatorOutputLevel(llllllllllllIllIIlllIlIIIIIlllll, this);
        }
        super.breakBlock(llllllllllllIllIIlllIlIIIIlIIlIl, llllllllllllIllIIlllIlIIIIIlllll, llllllllllllIllIIlllIlIIIIlIIIll);
    }
    
    @Override
    public void onBlockPlacedBy(final World llllllllllllIllIIlllIlIIlllIIIIl, final BlockPos llllllllllllIllIIlllIlIIllIlIIII, IBlockState llllllllllllIllIIlllIlIIllIIllll, final EntityLivingBase llllllllllllIllIIlllIlIIllIIlllI, final ItemStack llllllllllllIllIIlllIlIIllIIllIl) {
        final EnumFacing llllllllllllIllIIlllIlIIllIlllII = EnumFacing.getHorizontal(MathHelper.floor_double(llllllllllllIllIIlllIlIIllIIlllI.rotationYaw * 4.0f / 360.0f + 0.5) & BlockChest.llIllIlIIIIIlI[2]).getOpposite();
        llllllllllllIllIIlllIlIIllIIllll = llllllllllllIllIIlllIlIIllIIllll.withProperty((IProperty<Comparable>)BlockChest.FACING, llllllllllllIllIIlllIlIIllIlllII);
        final BlockPos llllllllllllIllIIlllIlIIllIllIll = llllllllllllIllIIlllIlIIllIlIIII.north();
        final BlockPos llllllllllllIllIIlllIlIIllIllIlI = llllllllllllIllIIlllIlIIllIlIIII.south();
        final BlockPos llllllllllllIllIIlllIlIIllIllIIl = llllllllllllIllIIlllIlIIllIlIIII.west();
        final BlockPos llllllllllllIllIIlllIlIIllIllIII = llllllllllllIllIIlllIlIIllIlIIII.east();
        int n;
        if (lIIlIlllIlllIlIl(this, llllllllllllIllIIlllIlIIlllIIIIl.getBlockState(llllllllllllIllIIlllIlIIllIllIll).getBlock())) {
            n = BlockChest.llIllIlIIIIIlI[3];
            "".length();
            if ("   ".length() < ((0x16 ^ 0x68 ^ (0x44 ^ 0xC)) & (65 + 45 - 72 + 132 ^ 149 + 131 - 214 + 90 ^ -" ".length()))) {
                return;
            }
        }
        else {
            n = BlockChest.llIllIlIIIIIlI[0];
        }
        final boolean llllllllllllIllIIlllIlIIllIlIlll = n != 0;
        int n2;
        if (lIIlIlllIlllIlIl(this, llllllllllllIllIIlllIlIIlllIIIIl.getBlockState(llllllllllllIllIIlllIlIIllIllIlI).getBlock())) {
            n2 = BlockChest.llIllIlIIIIIlI[3];
            "".length();
            if (("  ".length() ^ (0x91 ^ 0x97)) == " ".length()) {
                return;
            }
        }
        else {
            n2 = BlockChest.llIllIlIIIIIlI[0];
        }
        final boolean llllllllllllIllIIlllIlIIllIlIllI = n2 != 0;
        int n3;
        if (lIIlIlllIlllIlIl(this, llllllllllllIllIIlllIlIIlllIIIIl.getBlockState(llllllllllllIllIIlllIlIIllIllIIl).getBlock())) {
            n3 = BlockChest.llIllIlIIIIIlI[3];
            "".length();
            if (((0x17 ^ 0x5D) & ~(0xC2 ^ 0x88)) != 0x0) {
                return;
            }
        }
        else {
            n3 = BlockChest.llIllIlIIIIIlI[0];
        }
        final boolean llllllllllllIllIIlllIlIIllIlIlIl = n3 != 0;
        int n4;
        if (lIIlIlllIlllIlIl(this, llllllllllllIllIIlllIlIIlllIIIIl.getBlockState(llllllllllllIllIIlllIlIIllIllIII).getBlock())) {
            n4 = BlockChest.llIllIlIIIIIlI[3];
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        else {
            n4 = BlockChest.llIllIlIIIIIlI[0];
        }
        final boolean llllllllllllIllIIlllIlIIllIlIlII = n4 != 0;
        if (lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIllIlIlll ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIllIlIllI ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIllIlIlIl ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIllIlIlII ? 1 : 0)) {
            llllllllllllIllIIlllIlIIlllIIIIl.setBlockState(llllllllllllIllIIlllIlIIllIlIIII, llllllllllllIllIIlllIlIIllIIllll, BlockChest.llIllIlIIIIIlI[2]);
            "".length();
            "".length();
            if (((0x71 ^ 0x4E) & ~(0x4C ^ 0x73)) > 0) {
                return;
            }
        }
        else if (!lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIllIlllII.getAxis(), EnumFacing.Axis.X) || (lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIllIlIlll ? 1 : 0) && lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIllIlIllI ? 1 : 0))) {
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIllIlllII.getAxis(), EnumFacing.Axis.Z) && (!lIIlIlllIlllIllI(llllllllllllIllIIlllIlIIllIlIlIl ? 1 : 0) || lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIllIlIlII ? 1 : 0))) {
                if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIllIlIlIl ? 1 : 0)) {
                    llllllllllllIllIIlllIlIIlllIIIIl.setBlockState(llllllllllllIllIIlllIlIIllIllIIl, llllllllllllIllIIlllIlIIllIIllll, BlockChest.llIllIlIIIIIlI[2]);
                    "".length();
                    "".length();
                    if ((0x4D ^ 0x49) != (0x70 ^ 0x74)) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIIlllIlIIlllIIIIl.setBlockState(llllllllllllIllIIlllIlIIllIllIII, llllllllllllIllIIlllIlIIllIIllll, BlockChest.llIllIlIIIIIlI[2]);
                    "".length();
                }
                llllllllllllIllIIlllIlIIlllIIIIl.setBlockState(llllllllllllIllIIlllIlIIllIlIIII, llllllllllllIllIIlllIlIIllIIllll, BlockChest.llIllIlIIIIIlI[2]);
                "".length();
                "".length();
                if (-" ".length() >= " ".length()) {
                    return;
                }
            }
        }
        else {
            if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIllIlIlll ? 1 : 0)) {
                llllllllllllIllIIlllIlIIlllIIIIl.setBlockState(llllllllllllIllIIlllIlIIllIllIll, llllllllllllIllIIlllIlIIllIIllll, BlockChest.llIllIlIIIIIlI[2]);
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else {
                llllllllllllIllIIlllIlIIlllIIIIl.setBlockState(llllllllllllIllIIlllIlIIllIllIlI, llllllllllllIllIIlllIlIIllIIllll, BlockChest.llIllIlIIIIIlI[2]);
                "".length();
            }
            llllllllllllIllIIlllIlIIlllIIIIl.setBlockState(llllllllllllIllIIlllIlIIllIlIIII, llllllllllllIllIIlllIlIIllIIllll, BlockChest.llIllIlIIIIIlI[2]);
            "".length();
        }
        if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIllIIllIl.hasDisplayName() ? 1 : 0)) {
            final TileEntity llllllllllllIllIIlllIlIIllIlIIll = llllllllllllIllIIlllIlIIlllIIIIl.getTileEntity(llllllllllllIllIIlllIlIIllIlIIII);
            if (lIIlIlllIlllIlll((llllllllllllIllIIlllIlIIllIlIIll instanceof TileEntityChest) ? 1 : 0)) {
                ((TileEntityChest)llllllllllllIllIIlllIlIIllIlIIll).setCustomName(llllllllllllIllIIlllIlIIllIIllIl.getDisplayName());
            }
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIIlllIIlllIIllIII) {
        EnumFacing llllllllllllIllIIlllIIlllIIlIlll = EnumFacing.getFront(llllllllllllIllIIlllIIlllIIllIII);
        if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIIlllIIlIlll.getAxis(), EnumFacing.Axis.Y)) {
            llllllllllllIllIIlllIIlllIIlIlll = EnumFacing.NORTH;
        }
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockChest.FACING, llllllllllllIllIIlllIIlllIIlIlll);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIllIIlllIIlllllIlIlI, final int llllllllllllIllIIlllIIlllllIlIIl) {
        return new TileEntityChest();
    }
    
    static {
        lIIlIlllIlllIlII();
        lIIlIlllIIlIllII();
        FACING = PropertyDirection.create(BlockChest.llIllIIllIIllI[BlockChest.llIllIlIIIIIlI[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
    }
    
    public IBlockState correctFacing(final World llllllllllllIllIIlllIlIIIllIlIlI, final BlockPos llllllllllllIllIIlllIlIIIlllIIIl, final IBlockState llllllllllllIllIIlllIlIIIlllIIII) {
        EnumFacing llllllllllllIllIIlllIlIIIllIllll = null;
        final int llllllllllllIllIIlllIlIIIllIIlIl = (int)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ((0xCE ^ 0xB5 ^ (0xFA ^ 0x84)) == 0x0) {
            return null;
        }
        while (!lIIlIlllIlllIllI(((Iterator)llllllllllllIllIIlllIlIIIllIIlIl).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllIIlllIlIIIllIlllI = ((Iterator<EnumFacing>)llllllllllllIllIIlllIlIIIllIIlIl).next();
            final IBlockState llllllllllllIllIIlllIlIIIllIllIl = llllllllllllIllIIlllIlIIIllIlIlI.getBlockState(llllllllllllIllIIlllIlIIIlllIIIl.offset(llllllllllllIllIIlllIlIIIllIlllI));
            if (lIIlIlllIlllIlIl(llllllllllllIllIIlllIlIIIllIllIl.getBlock(), this)) {
                return llllllllllllIllIIlllIlIIIlllIIII;
            }
            if (!lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIIllIllIl.getBlock().isFullBlock() ? 1 : 0)) {
                continue;
            }
            if (lIIlIlllIllllIIl(llllllllllllIllIIlllIlIIIllIllll)) {
                llllllllllllIllIIlllIlIIIllIllll = null;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
                break;
            }
            else {
                llllllllllllIllIIlllIlIIIllIllll = llllllllllllIllIIlllIlIIIllIlllI;
            }
        }
        if (lIIlIlllIllllIIl(llllllllllllIllIIlllIlIIIllIllll)) {
            return llllllllllllIllIIlllIlIIIlllIIII.withProperty((IProperty<Comparable>)BlockChest.FACING, llllllllllllIllIIlllIlIIIllIllll.getOpposite());
        }
        EnumFacing llllllllllllIllIIlllIlIIIllIllII = llllllllllllIllIIlllIlIIIlllIIII.getValue((IProperty<EnumFacing>)BlockChest.FACING);
        if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIIllIlIlI.getBlockState(llllllllllllIllIIlllIlIIIlllIIIl.offset(llllllllllllIllIIlllIlIIIllIllII)).getBlock().isFullBlock() ? 1 : 0)) {
            llllllllllllIllIIlllIlIIIllIllII = llllllllllllIllIIlllIlIIIllIllII.getOpposite();
        }
        if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIIllIlIlI.getBlockState(llllllllllllIllIIlllIlIIIlllIIIl.offset(llllllllllllIllIIlllIlIIIllIllII)).getBlock().isFullBlock() ? 1 : 0)) {
            llllllllllllIllIIlllIlIIIllIllII = llllllllllllIllIIlllIlIIIllIllII.rotateY();
        }
        if (lIIlIlllIlllIlll(llllllllllllIllIIlllIlIIIllIlIlI.getBlockState(llllllllllllIllIIlllIlIIIlllIIIl.offset(llllllllllllIllIIlllIlIIIllIllII)).getBlock().isFullBlock() ? 1 : 0)) {
            llllllllllllIllIIlllIlIIIllIllII = llllllllllllIllIIlllIlIIIllIllII.getOpposite();
        }
        return llllllllllllIllIIlllIlIIIlllIIII.withProperty((IProperty<Comparable>)BlockChest.FACING, llllllllllllIllIIlllIlIIIllIllII);
    }
    
    @Override
    public int getWeakPower(final IBlockAccess llllllllllllIllIIlllIIllllIllIII, final BlockPos llllllllllllIllIIlllIIllllIllllI, final IBlockState llllllllllllIllIIlllIIllllIlllIl, final EnumFacing llllllllllllIllIIlllIIllllIlllII) {
        if (lIIlIlllIlllIllI(this.canProvidePower() ? 1 : 0)) {
            return BlockChest.llIllIlIIIIIlI[0];
        }
        int llllllllllllIllIIlllIIllllIllIll = BlockChest.llIllIlIIIIIlI[0];
        final TileEntity llllllllllllIllIIlllIIllllIllIlI = llllllllllllIllIIlllIIllllIllIII.getTileEntity(llllllllllllIllIIlllIIllllIllllI);
        if (lIIlIlllIlllIlll((llllllllllllIllIIlllIIllllIllIlI instanceof TileEntityChest) ? 1 : 0)) {
            llllllllllllIllIIlllIIllllIllIll = ((TileEntityChest)llllllllllllIllIIlllIIllllIllIlI).numPlayersUsing;
        }
        return MathHelper.clamp_int(llllllllllllIllIIlllIIllllIllIll, BlockChest.llIllIlIIIIIlI[0], BlockChest.llIllIlIIIIIlI[4]);
    }
    
    protected BlockChest(final int llllllllllllIllIIlllIlIlIIlIIlIl) {
        super(Material.wood);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockChest.FACING, EnumFacing.NORTH));
        this.chestType = llllllllllllIllIIlllIlIlIIlIIlIl;
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }
    
    private static String lIIlIlllIIlIlIlI(String llllllllllllIllIIlllIIllIlllllIl, final String llllllllllllIllIIlllIIllIlllllII) {
        llllllllllllIllIIlllIIllIlllllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIlllIIllIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlllIIlllIIIIIII = new StringBuilder();
        final char[] llllllllllllIllIIlllIIllIlllllll = llllllllllllIllIIlllIIllIlllllII.toCharArray();
        int llllllllllllIllIIlllIIllIllllllI = BlockChest.llIllIlIIIIIlI[0];
        final short llllllllllllIllIIlllIIllIllllIII = (Object)llllllllllllIllIIlllIIllIlllllIl.toCharArray();
        final long llllllllllllIllIIlllIIllIlllIlll = llllllllllllIllIIlllIIllIllllIII.length;
        float llllllllllllIllIIlllIIllIlllIllI = BlockChest.llIllIlIIIIIlI[0];
        while (lIIlIlllIlllllII((int)llllllllllllIllIIlllIIllIlllIllI, (int)llllllllllllIllIIlllIIllIlllIlll)) {
            final char llllllllllllIllIIlllIIlllIIIIIll = llllllllllllIllIIlllIIllIllllIII[llllllllllllIllIIlllIIllIlllIllI];
            llllllllllllIllIIlllIIlllIIIIIII.append((char)(llllllllllllIllIIlllIIlllIIIIIll ^ llllllllllllIllIIlllIIllIlllllll[llllllllllllIllIIlllIIllIllllllI % llllllllllllIllIIlllIIllIlllllll.length]));
            "".length();
            ++llllllllllllIllIIlllIIllIllllllI;
            ++llllllllllllIllIIlllIIllIlllIllI;
            "".length();
            if (((0x48 ^ 0xB ^ (0x6C ^ 0x69)) & (0x2B ^ 0x11 ^ (0x76 ^ 0xA) ^ -" ".length())) != ((0xC7 ^ 0xAF ^ (0x24 ^ 0x10)) & (0x94 ^ 0xC6 ^ (0xB0 ^ 0xBE) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlllIIlllIIIIIII);
    }
    
    private boolean isBlocked(final World llllllllllllIllIIlllIIllllIIIIIl, final BlockPos llllllllllllIllIIlllIIlllIllllIl) {
        if (lIIlIlllIlllIllI(this.isBelowSolidBlock(llllllllllllIllIIlllIIllllIIIIIl, llllllllllllIllIIlllIIlllIllllIl) ? 1 : 0) && lIIlIlllIlllIllI(this.isOcelotSittingOnChest(llllllllllllIllIIlllIIllllIIIIIl, llllllllllllIllIIlllIIlllIllllIl) ? 1 : 0)) {
            return BlockChest.llIllIlIIIIIlI[0] != 0;
        }
        return BlockChest.llIllIlIIIIIlI[3] != 0;
    }
}
