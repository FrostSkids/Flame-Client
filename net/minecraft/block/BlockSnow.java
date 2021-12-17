// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.stats.StatList;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.block.state.BlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;

public class BlockSnow extends Block
{
    public static final /* synthetic */ PropertyInteger LAYERS;
    private static final /* synthetic */ int[] lIlIIlIlllIIIl;
    private static final /* synthetic */ String[] lIlIIlIlllIIII;
    
    private static boolean lllIIllIllIlIIl(final int lllllllllllllIIIllIlIllIlIlIlllI) {
        return lllllllllllllIIIllIlIllIlIlIlllI == 0;
    }
    
    private static boolean lllIIllIllIIlII(final int lllllllllllllIIIllIlIllIlIllllll, final int lllllllllllllIIIllIlIllIlIlllllI) {
        return lllllllllllllIIIllIlIllIlIllllll < lllllllllllllIIIllIlIllIlIlllllI;
    }
    
    protected BlockSnow() {
        super(Material.snow);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockSnow.LAYERS, BlockSnow.lIlIIlIlllIIIl[1]));
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.setTickRandomly((boolean)(BlockSnow.lIlIIlIlllIIIl[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.setBlockBoundsForItemRender();
    }
    
    protected void getBoundsForLayers(final int lllllllllllllIIIllIlIlllIlIIIIII) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, lllllllllllllIIIllIlIlllIlIIIIII / 8.0f, 1.0f);
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIllIlIlllIlIIlIII, final BlockPos lllllllllllllIIIllIlIlllIlIIlIll) {
        final IBlockState lllllllllllllIIIllIlIlllIlIIlIlI = lllllllllllllIIIllIlIlllIlIIlIII.getBlockState(lllllllllllllIIIllIlIlllIlIIlIll);
        this.getBoundsForLayers(lllllllllllllIIIllIlIlllIlIIlIlI.getValue((IProperty<Integer>)BlockSnow.LAYERS));
    }
    
    private static boolean lllIIllIllIIlll(final int lllllllllllllIIIllIlIllIllIIIIll, final int lllllllllllllIIIllIlIllIllIIIIlI) {
        return lllllllllllllIIIllIlIllIllIIIIll >= lllllllllllllIIIllIlIllIllIIIIlI;
    }
    
    private static void lllIIllIllIIIll() {
        (lIlIIlIlllIIIl = new int[7])[0] = ((0xE9 ^ 0xA9) & ~(0xC4 ^ 0x84));
        BlockSnow.lIlIIlIlllIIIl[1] = " ".length();
        BlockSnow.lIlIIlIlllIIIl[2] = (" ".length() ^ (0x85 ^ 0x8C));
        BlockSnow.lIlIIlIlllIIIl[3] = (0x50 ^ 0xB ^ (0x6A ^ 0x34));
        BlockSnow.lIlIIlIlllIIIl[4] = (0x90 ^ 0x86 ^ (0x2F ^ 0x3E));
        BlockSnow.lIlIIlIlllIIIl[5] = (0x36 ^ 0x3D);
        BlockSnow.lIlIIlIlllIIIl[6] = "  ".length();
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIllIlIlllIllIIIII, final BlockPos lllllllllllllIIIllIlIlllIlIllIlI, final IBlockState lllllllllllllIIIllIlIlllIlIllllI) {
        final int lllllllllllllIIIllIlIlllIlIlllIl = lllllllllllllIIIllIlIlllIlIllllI.getValue((IProperty<Integer>)BlockSnow.LAYERS) - BlockSnow.lIlIIlIlllIIIl[1];
        final float lllllllllllllIIIllIlIlllIlIlllII = 0.125f;
        return new AxisAlignedBB(lllllllllllllIIIllIlIlllIlIllIlI.getX() + this.minX, lllllllllllllIIIllIlIlllIlIllIlI.getY() + this.minY, lllllllllllllIIIllIlIlllIlIllIlI.getZ() + this.minZ, lllllllllllllIIIllIlIlllIlIllIlI.getX() + this.maxX, lllllllllllllIIIllIlIlllIlIllIlI.getY() + lllllllllllllIIIllIlIlllIlIlllIl * lllllllllllllIIIllIlIlllIlIlllII, lllllllllllllIIIllIlIlllIlIllIlI.getZ() + this.maxZ);
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIIllIlIllIllllIIIl, final BlockPos lllllllllllllIIIllIlIllIllllIIII, final EnumFacing lllllllllllllIIIllIlIllIlllIlIll) {
        int shouldSideBeRendered;
        if (lllIIllIllIIllI(lllllllllllllIIIllIlIllIlllIlIll, EnumFacing.UP)) {
            shouldSideBeRendered = BlockSnow.lIlIIlIlllIIIl[1];
            "".length();
            if ("   ".length() < " ".length()) {
                return ((0xE6 ^ 0xB2 ^ (0xF5 ^ 0x9B)) & (6 + 81 - 30 + 78 ^ 27 + 43 + 86 + 33 ^ -" ".length())) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = (super.shouldSideBeRendered(lllllllllllllIIIllIlIllIllllIIIl, lllllllllllllIIIllIlIllIllllIIII, lllllllllllllIIIllIlIllIlllIlIll) ? 1 : 0);
        }
        return shouldSideBeRendered != 0;
    }
    
    private static boolean lllIIllIllIlIII(final int lllllllllllllIIIllIlIllIlIllIIII) {
        return lllllllllllllIIIllIlIllIlIllIIII != 0;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIIllIlIlllIIllIlII, final BlockPos lllllllllllllIIIllIlIlllIIlllIII) {
        final IBlockState lllllllllllllIIIllIlIlllIIllIlll = lllllllllllllIIIllIlIlllIIllIlII.getBlockState(lllllllllllllIIIllIlIlllIIlllIII.down());
        final Block lllllllllllllIIIllIlIlllIIllIllI = lllllllllllllIIIllIlIlllIIllIlll.getBlock();
        int n;
        if (lllIIllIllIIlIl(lllllllllllllIIIllIlIlllIIllIllI, Blocks.ice) && lllIIllIllIIlIl(lllllllllllllIIIllIlIlllIIllIllI, Blocks.packed_ice)) {
            if (lllIIllIllIIllI(lllllllllllllIIIllIlIlllIIllIllI.getMaterial(), Material.leaves)) {
                n = BlockSnow.lIlIIlIlllIIIl[1];
                "".length();
                if ((0x12 ^ 0x16) <= "  ".length()) {
                    return ((0x9E ^ 0xC7) & ~(0xDE ^ 0x87)) != 0x0;
                }
            }
            else if (lllIIllIllIIllI(lllllllllllllIIIllIlIlllIIllIllI, this) && lllIIllIllIIlll(lllllllllllllIIIllIlIlllIIllIlll.getValue((IProperty<Integer>)BlockSnow.LAYERS), BlockSnow.lIlIIlIlllIIIl[4])) {
                n = BlockSnow.lIlIIlIlllIIIl[1];
                "".length();
                if (-" ".length() >= 0) {
                    return ((0x5A ^ 0xB) & ~(0xD1 ^ 0x80)) != 0x0;
                }
            }
            else if (lllIIllIllIlIII(lllllllllllllIIIllIlIlllIIllIllI.isOpaqueCube() ? 1 : 0) && lllIIllIllIlIII(lllllllllllllIIIllIlIlllIIllIllI.blockMaterial.blocksMovement() ? 1 : 0)) {
                n = BlockSnow.lIlIIlIlllIIIl[1];
                "".length();
                if ("   ".length() < -" ".length()) {
                    return ((0xAB ^ 0x99) & ~(0x30 ^ 0x2)) != 0x0;
                }
            }
            else {
                n = BlockSnow.lIlIIlIlllIIIl[0];
                "".length();
                if ((0xF1 ^ 0x84 ^ (0x2F ^ 0x5E)) > (0xF6 ^ 0xAE ^ (0xDC ^ 0x80))) {
                    return ((188 + 147 - 245 + 114 ^ 28 + 71 + 69 + 27) & (0x43 ^ 0x5D ^ (0x6 ^ 0x17) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n = BlockSnow.lIlIIlIlllIIIl[0];
        }
        return n != 0;
    }
    
    private static String lllIIllIllIIIIl(final String lllllllllllllIIIllIlIllIllIIllIl, final String lllllllllllllIIIllIlIllIllIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIllIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIllIllIIlllI.getBytes(StandardCharsets.UTF_8)), BlockSnow.lIlIIlIlllIIIl[2]), "DES");
            final Cipher lllllllllllllIIIllIlIllIllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIllIlIllIllIlIIIl.init(BlockSnow.lIlIIlIlllIIIl[6], lllllllllllllIIIllIlIllIllIlIIlI);
            return new String(lllllllllllllIIIllIlIllIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIllIllIlIIII) {
            lllllllllllllIIIllIlIllIllIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIllIllIlIll(final int lllllllllllllIIIllIlIllIllIIIlll, final int lllllllllllllIIIllIlIllIllIIIllI) {
        return lllllllllllllIIIllIlIllIllIIIlll == lllllllllllllIIIllIlIllIllIIIllI;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIIllIlIlllIIIIIIlI) {
        return BlockSnow.lIlIIlIlllIIIl[0];
    }
    
    private static boolean lllIIllIllIIlIl(final Object lllllllllllllIIIllIlIllIlIllIlll, final Object lllllllllllllIIIllIlIllIlIllIllI) {
        return lllllllllllllIIIllIlIllIlIllIlll != lllllllllllllIIIllIlIllIlIllIllI;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockSnow.lIlIIlIlllIIIl[0] != 0;
    }
    
    @Override
    public boolean isReplaceable(final World lllllllllllllIIIllIlIllIllIlllll, final BlockPos lllllllllllllIIIllIlIllIllIllllI) {
        if (lllIIllIllIlIll(lllllllllllllIIIllIlIllIllIlllll.getBlockState(lllllllllllllIIIllIlIllIllIllllI).getValue((IProperty<Integer>)BlockSnow.LAYERS), BlockSnow.lIlIIlIlllIIIl[1])) {
            return BlockSnow.lIlIIlIlllIIIl[1] != 0;
        }
        return BlockSnow.lIlIIlIlllIIIl[0] != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIllIlIllIllIllIlI) {
        return lllllllllllllIIIllIlIllIllIllIlI.getValue((IProperty<Integer>)BlockSnow.LAYERS) - BlockSnow.lIlIIlIlllIIIl[1];
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIllIlIlllIIIIIllI, final Random lllllllllllllIIIllIlIlllIIIIIlIl, final int lllllllllllllIIIllIlIlllIIIIIlII) {
        return Items.snowball;
    }
    
    private static void lllIIllIllIIIlI() {
        (lIlIIlIlllIIII = new String[BlockSnow.lIlIIlIlllIIIl[1]])[BlockSnow.lIlIIlIlllIIIl[0]] = lllIIllIllIIIIl("jfQ+Cqo5drM=", "ADgBQ");
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockSnow.lIlIIlIlllIIIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSnow.lIlIIlIlllIIIl[0]] = BlockSnow.LAYERS;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lllIIllIllIIllI(final Object lllllllllllllIIIllIlIllIlIllIIll, final Object lllllllllllllIIIllIlIllIlIllIIlI) {
        return lllllllllllllIIIllIlIllIlIllIIll == lllllllllllllIIIllIlIllIlIllIIlI;
    }
    
    private static boolean lllIIllIllIlIlI(final int lllllllllllllIIIllIlIllIlIlllIll, final int lllllllllllllIIIllIlIllIlIlllIlI) {
        return lllllllllllllIIIllIlIllIlIlllIll > lllllllllllllIIIllIlIllIlIlllIlI;
    }
    
    static {
        lllIIllIllIIIll();
        lllIIllIllIIIlI();
        LAYERS = PropertyInteger.create(BlockSnow.lIlIIlIlllIIII[BlockSnow.lIlIIlIlllIIIl[0]], BlockSnow.lIlIIlIlllIIIl[1], BlockSnow.lIlIIlIlllIIIl[2]);
    }
    
    @Override
    public boolean isPassable(final IBlockAccess lllllllllllllIIIllIlIlllIllIlIlI, final BlockPos lllllllllllllIIIllIlIlllIllIIlll) {
        if (lllIIllIllIIlII(lllllllllllllIIIllIlIlllIllIlIlI.getBlockState(lllllllllllllIIIllIlIlllIllIIlll).getValue((IProperty<Integer>)BlockSnow.LAYERS), BlockSnow.lIlIIlIlllIIIl[3])) {
            return BlockSnow.lIlIIlIlllIIIl[1] != 0;
        }
        return BlockSnow.lIlIIlIlllIIIl[0] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIllIlIllIlllIIlll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockSnow.LAYERS, (lllllllllllllIIIllIlIllIlllIIlll & BlockSnow.lIlIIlIlllIIIl[4]) + BlockSnow.lIlIIlIlllIIIl[1]);
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.getBoundsForLayers(BlockSnow.lIlIIlIlllIIIl[0]);
    }
    
    private boolean checkAndDropBlock(final World lllllllllllllIIIllIlIlllIIIllIlI, final BlockPos lllllllllllllIIIllIlIlllIIIlllIl, final IBlockState lllllllllllllIIIllIlIlllIIIlllII) {
        if (lllIIllIllIlIIl(this.canPlaceBlockAt(lllllllllllllIIIllIlIlllIIIllIlI, lllllllllllllIIIllIlIlllIIIlllIl) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIIIllIlIlllIIIllIlI, lllllllllllllIIIllIlIlllIIIlllIl, lllllllllllllIIIllIlIlllIIIlllII, BlockSnow.lIlIIlIlllIIIl[0]);
            lllllllllllllIIIllIlIlllIIIllIlI.setBlockToAir(lllllllllllllIIIllIlIlllIIIlllIl);
            "".length();
            return BlockSnow.lIlIIlIlllIIIl[0] != 0;
        }
        return BlockSnow.lIlIIlIlllIIIl[1] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockSnow.lIlIIlIlllIIIl[0] != 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIIllIlIlllIIlIIllI, final BlockPos lllllllllllllIIIllIlIlllIIlIlIlI, final IBlockState lllllllllllllIIIllIlIlllIIlIlIIl, final Block lllllllllllllIIIllIlIlllIIlIlIII) {
        this.checkAndDropBlock(lllllllllllllIIIllIlIlllIIlIIllI, lllllllllllllIIIllIlIlllIIlIlIlI, lllllllllllllIIIllIlIlllIIlIlIIl);
        "".length();
    }
    
    @Override
    public void updateTick(final World lllllllllllllIIIllIlIllIllllllIl, final BlockPos lllllllllllllIIIllIlIllIllllIlll, final IBlockState lllllllllllllIIIllIlIllIlllllIll, final Random lllllllllllllIIIllIlIllIlllllIlI) {
        if (lllIIllIllIlIlI(lllllllllllllIIIllIlIllIllllllIl.getLightFor(EnumSkyBlock.BLOCK, lllllllllllllIIIllIlIllIllllIlll), BlockSnow.lIlIIlIlllIIIl[5])) {
            this.dropBlockAsItem(lllllllllllllIIIllIlIllIllllllIl, lllllllllllllIIIllIlIllIllllIlll, lllllllllllllIIIllIlIllIllllllIl.getBlockState(lllllllllllllIIIllIlIllIllllIlll), BlockSnow.lIlIIlIlllIIIl[0]);
            lllllllllllllIIIllIlIllIllllllIl.setBlockToAir(lllllllllllllIIIllIlIllIllllIlll);
            "".length();
        }
    }
    
    @Override
    public void harvestBlock(final World lllllllllllllIIIllIlIlllIIIlIIIl, final EntityPlayer lllllllllllllIIIllIlIlllIIIIlIlI, final BlockPos lllllllllllllIIIllIlIlllIIIIlIIl, final IBlockState lllllllllllllIIIllIlIlllIIIIlllI, final TileEntity lllllllllllllIIIllIlIlllIIIIllIl) {
        Block.spawnAsEntity(lllllllllllllIIIllIlIlllIIIlIIIl, lllllllllllllIIIllIlIlllIIIIlIIl, new ItemStack(Items.snowball, lllllllllllllIIIllIlIlllIIIIlllI.getValue((IProperty<Integer>)BlockSnow.LAYERS) + BlockSnow.lIlIIlIlllIIIl[1], BlockSnow.lIlIIlIlllIIIl[0]));
        lllllllllllllIIIllIlIlllIIIlIIIl.setBlockToAir(lllllllllllllIIIllIlIlllIIIIlIIl);
        "".length();
        lllllllllllllIIIllIlIlllIIIIlIlI.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
    }
}
