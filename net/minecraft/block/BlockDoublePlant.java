// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.EntityLivingBase;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.init.Blocks;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.init.Items;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyEnum;

public class BlockDoublePlant extends BlockBush implements IGrowable
{
    private static final /* synthetic */ String[] lllIIllllIlIlI;
    private static final /* synthetic */ int[] lllIIllllIllII;
    public static final /* synthetic */ PropertyEnum<EnumFacing> field_181084_N;
    public static final /* synthetic */ PropertyEnum<EnumBlockHalf> HALF;
    public static final /* synthetic */ PropertyEnum<EnumPlantType> VARIANT;
    
    static {
        lIlIIIIIllllllIl();
        lIlIIIIIllllIlIl();
        VARIANT = PropertyEnum.create(BlockDoublePlant.lllIIllllIlIlI[BlockDoublePlant.lllIIllllIllII[0]], EnumPlantType.class);
        HALF = PropertyEnum.create(BlockDoublePlant.lllIIllllIlIlI[BlockDoublePlant.lllIIllllIllII[1]], EnumBlockHalf.class);
        field_181084_N = BlockDirectional.FACING;
    }
    
    private static boolean lIlIIIIlIIIIIIIl(final int llllllllllllIlIlllIlIlIIllllllII) {
        return llllllllllllIlIlllIlIlIIllllllII == 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIlllIlIlIlllllIllI, final Random llllllllllllIlIlllIlIlIllllllIlI, final int llllllllllllIlIlllIlIlIllllllIIl) {
        if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIlllllIllI.getValue(BlockDoublePlant.HALF), EnumBlockHalf.UPPER)) {
            return null;
        }
        final EnumPlantType llllllllllllIlIlllIlIlIllllllIII = llllllllllllIlIlllIlIlIlllllIllI.getValue(BlockDoublePlant.VARIANT);
        Item item;
        if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllllllIII, EnumPlantType.FERN)) {
            item = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllllllIII, EnumPlantType.GRASS)) {
            if (lIlIIIIlIIIIIIIl(llllllllllllIlIlllIlIlIllllllIlI.nextInt(BlockDoublePlant.lllIIllllIllII[4]))) {
                item = Items.wheat_seeds;
                "".length();
                if (-(0x9B ^ 0x9F) > 0) {
                    return null;
                }
            }
            else {
                item = null;
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        else {
            item = Item.getItemFromBlock(this);
        }
        return item;
    }
    
    @Override
    public boolean isReplaceable(final World llllllllllllIlIlllIlIllIIIllIIll, final BlockPos llllllllllllIlIlllIlIllIIIlIllIl) {
        final IBlockState llllllllllllIlIlllIlIllIIIllIIIl = llllllllllllIlIlllIlIllIIIllIIll.getBlockState(llllllllllllIlIlllIlIllIIIlIllIl);
        if (lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIllIIIllIIIl.getBlock(), this)) {
            return BlockDoublePlant.lllIIllllIllII[1] != 0;
        }
        final EnumPlantType llllllllllllIlIlllIlIllIIIllIIII = this.getActualState(llllllllllllIlIlllIlIllIIIllIIIl, llllllllllllIlIlllIlIllIIIllIIll, llllllllllllIlIlllIlIllIIIlIllIl).getValue(BlockDoublePlant.VARIANT);
        if (lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIllIIIllIIII, EnumPlantType.FERN) && lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIllIIIllIIII, EnumPlantType.GRASS)) {
            return BlockDoublePlant.lllIIllllIllII[0] != 0;
        }
        return BlockDoublePlant.lllIIllllIllII[1] != 0;
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlIlllIlIlIlllllIIIl) {
        int meta;
        if (lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIlllllIIIl.getValue(BlockDoublePlant.HALF), EnumBlockHalf.UPPER) && lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIlllllIIIl.getValue(BlockDoublePlant.VARIANT), EnumPlantType.GRASS)) {
            meta = llllllllllllIlIlllIlIlIlllllIIIl.getValue(BlockDoublePlant.VARIANT).getMeta();
            "".length();
            if ("  ".length() == 0) {
                return (0x8 ^ 0x37) & ~(0x5D ^ 0x62);
            }
        }
        else {
            meta = BlockDoublePlant.lllIIllllIllII[0];
        }
        return meta;
    }
    
    public BlockDoublePlant() {
        super(Material.vine);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockDoublePlant.VARIANT, EnumPlantType.SUNFLOWER).withProperty(BlockDoublePlant.HALF, EnumBlockHalf.LOWER).withProperty(BlockDoublePlant.field_181084_N, EnumFacing.NORTH));
        this.setHardness(0.0f);
        "".length();
        this.setStepSound(BlockDoublePlant.soundTypeGrass);
        "".length();
        this.setUnlocalizedName(BlockDoublePlant.lllIIllllIlIlI[BlockDoublePlant.lllIIllllIllII[2]]);
        "".length();
    }
    
    private static void lIlIIIIIllllllIl() {
        (lllIIllllIllII = new int[7])[0] = ((0x80 ^ 0x8E) & ~(0x35 ^ 0x3B));
        BlockDoublePlant.lllIIllllIllII[1] = " ".length();
        BlockDoublePlant.lllIIllllIllII[2] = "  ".length();
        BlockDoublePlant.lllIIllllIllII[3] = "   ".length();
        BlockDoublePlant.lllIIllllIllII[4] = (0x2F ^ 0x27);
        BlockDoublePlant.lllIIllllIllII[5] = (-1 & 0xFFFFFF);
        BlockDoublePlant.lllIIllllIllII[6] = (0x82 ^ 0x85);
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIlIlllIlIllIIIlllllI, final BlockPos llllllllllllIlIlllIlIllIIIllllIl) {
        if (lIlIIIIIllllllll(super.canPlaceBlockAt(llllllllllllIlIlllIlIllIIIlllllI, llllllllllllIlIlllIlIllIIIllllIl) ? 1 : 0) && lIlIIIIIllllllll(llllllllllllIlIlllIlIllIIIlllllI.isAirBlock(llllllllllllIlIlllIlIllIIIllllIl.up()) ? 1 : 0)) {
            return BlockDoublePlant.lllIIllllIllII[1] != 0;
        }
        return BlockDoublePlant.lllIIllllIllII[0] != 0;
    }
    
    @Override
    public void grow(final World llllllllllllIlIlllIlIlIlIlIlIlIl, final Random llllllllllllIlIlllIlIlIlIlIllIIl, final BlockPos llllllllllllIlIlllIlIlIlIlIllIII, final IBlockState llllllllllllIlIlllIlIlIlIlIlIlll) {
        Block.spawnAsEntity(llllllllllllIlIlllIlIlIlIlIlIlIl, llllllllllllIlIlllIlIlIlIlIllIII, new ItemStack(this, BlockDoublePlant.lllIIllllIllII[1], this.getVariant(llllllllllllIlIlllIlIlIlIlIlIlIl, llllllllllllIlIlllIlIlIlIlIllIII).getMeta()));
    }
    
    private static boolean lIlIIIIlIIIIIlII(final int llllllllllllIlIlllIlIlIIlllllIlI) {
        return llllllllllllIlIlllIlIlIIlllllIlI > 0;
    }
    
    private static boolean lIlIIIIlIIIIIlIl(final int llllllllllllIlIlllIlIlIlIIIIlIll, final int llllllllllllIlIlllIlIlIlIIIIlIlI) {
        return llllllllllllIlIlllIlIlIlIIIIlIll < llllllllllllIlIlllIlIlIlIIIIlIlI;
    }
    
    private static void lIlIIIIIllllIlIl() {
        (lllIIllllIlIlI = new String[BlockDoublePlant.lllIIllllIllII[3]])[BlockDoublePlant.lllIIllllIllII[0]] = lIlIIIIIllllIIll("aQEe4/ggji4=", "dROgv");
        BlockDoublePlant.lllIIllllIlIlI[BlockDoublePlant.lllIIllllIllII[1]] = lIlIIIIIllllIIll("nMO08rMS+gU=", "XLiuf");
        BlockDoublePlant.lllIIllllIlIlI[BlockDoublePlant.lllIIllllIllII[2]] = lIlIIIIIllllIlII("NAY9MQs1OSQyCSQ=", "PiHSg");
    }
    
    @Override
    public boolean canBlockStay(final World llllllllllllIlIlllIlIllIIIIIlIIl, final BlockPos llllllllllllIlIlllIlIllIIIIIIIll, final IBlockState llllllllllllIlIlllIlIllIIIIIIlll) {
        if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIllIIIIIIlll.getValue(BlockDoublePlant.HALF), EnumBlockHalf.UPPER)) {
            if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIllIIIIIlIIl.getBlockState(llllllllllllIlIlllIlIllIIIIIIIll.down()).getBlock(), this)) {
                return BlockDoublePlant.lllIIllllIllII[1] != 0;
            }
            return BlockDoublePlant.lllIIllllIllII[0] != 0;
        }
        else {
            final IBlockState llllllllllllIlIlllIlIllIIIIIIllI = llllllllllllIlIlllIlIllIIIIIlIIl.getBlockState(llllllllllllIlIlllIlIllIIIIIIIll.up());
            if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIllIIIIIIllI.getBlock(), this) && lIlIIIIIllllllll(super.canBlockStay(llllllllllllIlIlllIlIllIIIIIlIIl, llllllllllllIlIlllIlIllIIIIIIIll, llllllllllllIlIlllIlIllIIIIIIllI) ? 1 : 0)) {
                return BlockDoublePlant.lllIIllllIllII[1] != 0;
            }
            return BlockDoublePlant.lllIIllllIllII[0] != 0;
        }
    }
    
    @Override
    public void harvestBlock(final World llllllllllllIlIlllIlIlIllIlllIlI, final EntityPlayer llllllllllllIlIlllIlIlIllIllllll, final BlockPos llllllllllllIlIlllIlIlIllIlllIII, final IBlockState llllllllllllIlIlllIlIlIllIllllIl, final TileEntity llllllllllllIlIlllIlIlIllIllIllI) {
        if (!lIlIIIIlIIIIIIIl(llllllllllllIlIlllIlIlIllIlllIlI.isRemote ? 1 : 0) || !lIlIIIIlIIIIIIlI(llllllllllllIlIlllIlIlIllIllllll.getCurrentEquippedItem()) || !lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllIllllll.getCurrentEquippedItem().getItem(), Items.shears) || !lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllIllllIl.getValue(BlockDoublePlant.HALF), EnumBlockHalf.LOWER) || lIlIIIIlIIIIIIIl(this.onHarvest(llllllllllllIlIlllIlIlIllIlllIlI, llllllllllllIlIlllIlIlIllIlllIII, llllllllllllIlIlllIlIlIllIllllIl, llllllllllllIlIlllIlIlIllIllllll) ? 1 : 0)) {
            super.harvestBlock(llllllllllllIlIlllIlIlIllIlllIlI, llllllllllllIlIlllIlIlIllIllllll, llllllllllllIlIlllIlIlIllIlllIII, llllllllllllIlIlllIlIlIllIllllIl, llllllllllllIlIlllIlIlIllIllIllI);
        }
    }
    
    @Override
    public EnumOffsetType getOffsetType() {
        return EnumOffsetType.XZ;
    }
    
    private static boolean lIlIIIIlIIIIIIlI(final Object llllllllllllIlIlllIlIlIlIIIIIIII) {
        return llllllllllllIlIlllIlIlIlIIIIIIII != null;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIlIlllIlIllIIlIlIllI, final BlockPos llllllllllllIlIlllIlIllIIlIlIlII) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private static String lIlIIIIIllllIIll(final String llllllllllllIlIlllIlIlIlIIlIllll, final String llllllllllllIlIlllIlIlIlIIlIllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlIlIlIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIlIlIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIlIlIlIIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIlIlIlIIllIIIl.init(BlockDoublePlant.lllIIllllIllII[2], llllllllllllIlIlllIlIlIlIIllIIlI);
            return new String(llllllllllllIlIlllIlIlIlIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIlIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlIlIlIIllIIII) {
            llllllllllllIlIlllIlIlIlIIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean canGrow(final World llllllllllllIlIlllIlIlIlIllIIllI, final BlockPos llllllllllllIlIlllIlIlIlIllIIlIl, final IBlockState llllllllllllIlIlllIlIlIlIllIlIlI, final boolean llllllllllllIlIlllIlIlIlIllIlIIl) {
        final EnumPlantType llllllllllllIlIlllIlIlIlIllIlIII = this.getVariant(llllllllllllIlIlllIlIlIlIllIIllI, llllllllllllIlIlllIlIlIlIllIIlIl);
        if (lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIlIllIlIII, EnumPlantType.GRASS) && lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIlIllIlIII, EnumPlantType.FERN)) {
            return BlockDoublePlant.lllIIllllIllII[1] != 0;
        }
        return BlockDoublePlant.lllIIllllIllII[0] != 0;
    }
    
    @Override
    protected void checkAndDropBlock(final World llllllllllllIlIlllIlIllIIIlIIIII, final BlockPos llllllllllllIlIlllIlIllIIIIlIllI, final IBlockState llllllllllllIlIlllIlIllIIIIlIlIl) {
        if (lIlIIIIlIIIIIIIl(this.canBlockStay(llllllllllllIlIlllIlIllIIIlIIIII, llllllllllllIlIlllIlIllIIIIlIllI, llllllllllllIlIlllIlIllIIIIlIlIl) ? 1 : 0)) {
            int n;
            if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIllIIIIlIlIl.getValue(BlockDoublePlant.HALF), EnumBlockHalf.UPPER)) {
                n = BlockDoublePlant.lllIIllllIllII[1];
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                n = BlockDoublePlant.lllIIllllIllII[0];
            }
            final boolean llllllllllllIlIlllIlIllIIIIlllIl = n != 0;
            BlockPos up;
            if (lIlIIIIIllllllll(llllllllllllIlIlllIlIllIIIIlllIl ? 1 : 0)) {
                up = llllllllllllIlIlllIlIllIIIIlIllI;
                "".length();
                if (((0x82 ^ 0x8E) & ~(0x2E ^ 0x22)) >= " ".length()) {
                    return;
                }
            }
            else {
                up = llllllllllllIlIlllIlIllIIIIlIllI.up();
            }
            final BlockPos llllllllllllIlIlllIlIllIIIIlllII = up;
            BlockPos down;
            if (lIlIIIIIllllllll(llllllllllllIlIlllIlIllIIIIlllIl ? 1 : 0)) {
                down = llllllllllllIlIlllIlIllIIIIlIllI.down();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                down = llllllllllllIlIlllIlIllIIIIlIllI;
            }
            final BlockPos llllllllllllIlIlllIlIllIIIIllIll = down;
            Block block;
            if (lIlIIIIIllllllll(llllllllllllIlIlllIlIllIIIIlllIl ? 1 : 0)) {
                block = this;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                block = llllllllllllIlIlllIlIllIIIlIIIII.getBlockState(llllllllllllIlIlllIlIllIIIIlllII).getBlock();
            }
            final Block llllllllllllIlIlllIlIllIIIIllIlI = block;
            Block block2;
            if (lIlIIIIIllllllll(llllllllllllIlIlllIlIllIIIIlllIl ? 1 : 0)) {
                block2 = llllllllllllIlIlllIlIllIIIlIIIII.getBlockState(llllllllllllIlIlllIlIllIIIIllIll).getBlock();
                "".length();
                if (((0x50 ^ 0x4E) & ~(0x16 ^ 0x8)) > " ".length()) {
                    return;
                }
            }
            else {
                block2 = this;
            }
            final Block llllllllllllIlIlllIlIllIIIIllIIl = block2;
            if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIllIIIIllIlI, this)) {
                llllllllllllIlIlllIlIllIIIlIIIII.setBlockState(llllllllllllIlIlllIlIllIIIIlllII, Blocks.air.getDefaultState(), BlockDoublePlant.lllIIllllIllII[2]);
                "".length();
            }
            if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIllIIIIllIIl, this)) {
                llllllllllllIlIlllIlIllIIIlIIIII.setBlockState(llllllllllllIlIlllIlIllIIIIllIll, Blocks.air.getDefaultState(), BlockDoublePlant.lllIIllllIllII[3]);
                "".length();
                if (lIlIIIIlIIIIIIIl(llllllllllllIlIlllIlIllIIIIlllIl ? 1 : 0)) {
                    this.dropBlockAsItem(llllllllllllIlIlllIlIllIIIlIIIII, llllllllllllIlIlllIlIllIIIIllIll, llllllllllllIlIlllIlIllIIIIlIlIl, BlockDoublePlant.lllIIllllIllII[0]);
                }
            }
        }
    }
    
    private boolean onHarvest(final World llllllllllllIlIlllIlIlIllIIllIII, final BlockPos llllllllllllIlIlllIlIlIllIIlIIII, final IBlockState llllllllllllIlIlllIlIlIllIIIllll, final EntityPlayer llllllllllllIlIlllIlIlIllIIlIlIl) {
        final EnumPlantType llllllllllllIlIlllIlIlIllIIlIlII = llllllllllllIlIlllIlIlIllIIIllll.getValue(BlockDoublePlant.VARIANT);
        if (lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIllIIlIlII, EnumPlantType.FERN) && lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIllIIlIlII, EnumPlantType.GRASS)) {
            return BlockDoublePlant.lllIIllllIllII[0] != 0;
        }
        llllllllllllIlIlllIlIlIllIIlIlIl.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
        BlockTallGrass.EnumType enumType;
        if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllIIlIlII, EnumPlantType.GRASS)) {
            enumType = BlockTallGrass.EnumType.GRASS;
            "".length();
            if (null != null) {
                return ((111 + 67 - 102 + 144 ^ 56 + 18 - 42 + 106) & (0x22 ^ 0x4E ^ (0x71 ^ 0x4B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            enumType = BlockTallGrass.EnumType.FERN;
        }
        final int llllllllllllIlIlllIlIlIllIIlIIll = enumType.getMeta();
        Block.spawnAsEntity(llllllllllllIlIlllIlIlIllIIllIII, llllllllllllIlIlllIlIlIllIIlIIII, new ItemStack(Blocks.tallgrass, BlockDoublePlant.lllIIllllIllII[2], llllllllllllIlIlllIlIlIllIIlIIll));
        return BlockDoublePlant.lllIIllllIllII[1] != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIlllIlIlIlIIlllIll) {
        int meta;
        if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIlIIlllIll.getValue(BlockDoublePlant.HALF), EnumBlockHalf.UPPER)) {
            meta = (BlockDoublePlant.lllIIllllIllII[4] | llllllllllllIlIlllIlIlIlIIlllIll.getValue(BlockDoublePlant.field_181084_N).getHorizontalIndex());
            "".length();
            if (((0x9D ^ 0x80) & ~(0x55 ^ 0x48)) > 0) {
                return (0x89 ^ 0xC0) & ~(0x89 ^ 0xC0);
            }
        }
        else {
            meta = llllllllllllIlIlllIlIlIlIIlllIll.getValue(BlockDoublePlant.VARIANT).getMeta();
        }
        return meta;
    }
    
    @Override
    public IBlockState getActualState(IBlockState llllllllllllIlIlllIlIlIlIlIIIIlI, final IBlockAccess llllllllllllIlIlllIlIlIlIlIIIIIl, final BlockPos llllllllllllIlIlllIlIlIlIlIIIlIl) {
        if (lIlIIIIIlllllllI(((IBlockState)llllllllllllIlIlllIlIlIlIlIIIIlI).getValue((IProperty<EnumBlockHalf>)BlockDoublePlant.HALF), EnumBlockHalf.UPPER)) {
            final IBlockState llllllllllllIlIlllIlIlIlIlIIIlII = llllllllllllIlIlllIlIlIlIlIIIIIl.getBlockState(llllllllllllIlIlllIlIlIlIlIIIlIl.down());
            if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIlIlIIIlII.getBlock(), this)) {
                llllllllllllIlIlllIlIlIlIlIIIIlI = ((IBlockState)llllllllllllIlIlllIlIlIlIlIIIIlI).withProperty(BlockDoublePlant.VARIANT, (EnumPlantType)llllllllllllIlIlllIlIlIlIlIIIlII.getValue((IProperty<V>)BlockDoublePlant.VARIANT));
            }
        }
        return (IBlockState)llllllllllllIlIlllIlIlIlIlIIIIlI;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIlllIlIlIlIlIIlllI) {
        IBlockState blockState;
        if (lIlIIIIlIIIIIlII(llllllllllllIlIlllIlIlIlIlIIlllI & BlockDoublePlant.lllIIllllIllII[4])) {
            blockState = this.getDefaultState().withProperty(BlockDoublePlant.HALF, EnumBlockHalf.UPPER);
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            blockState = this.getDefaultState().withProperty(BlockDoublePlant.HALF, EnumBlockHalf.LOWER).withProperty(BlockDoublePlant.VARIANT, EnumPlantType.byMetadata(llllllllllllIlIlllIlIlIlIlIIlllI & BlockDoublePlant.lllIIllllIllII[6]));
        }
        return blockState;
    }
    
    @Override
    public boolean canUseBonemeal(final World llllllllllllIlIlllIlIlIlIllIIIlI, final Random llllllllllllIlIlllIlIlIlIllIIIIl, final BlockPos llllllllllllIlIlllIlIlIlIllIIIII, final IBlockState llllllllllllIlIlllIlIlIlIlIlllll) {
        return BlockDoublePlant.lllIIllllIllII[1] != 0;
    }
    
    public EnumPlantType getVariant(final IBlockAccess llllllllllllIlIlllIlIllIIlIIIlIl, final BlockPos llllllllllllIlIlllIlIllIIlIIIlII) {
        IBlockState llllllllllllIlIlllIlIllIIlIIIlll = llllllllllllIlIlllIlIllIIlIIIlIl.getBlockState(llllllllllllIlIlllIlIllIIlIIIlII);
        if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIllIIlIIIlll.getBlock(), this)) {
            llllllllllllIlIlllIlIllIIlIIIlll = this.getActualState(llllllllllllIlIlllIlIllIIlIIIlll, llllllllllllIlIlllIlIllIIlIIIlIl, llllllllllllIlIlllIlIllIIlIIIlII);
            return llllllllllllIlIlllIlIllIIlIIIlll.getValue(BlockDoublePlant.VARIANT);
        }
        return EnumPlantType.FERN;
    }
    
    private static boolean lIlIIIIIllllllll(final int llllllllllllIlIlllIlIlIIlllllllI) {
        return llllllllllllIlIlllIlIlIIlllllllI != 0;
    }
    
    private static String lIlIIIIIllllIlII(String llllllllllllIlIlllIlIlIlIIIllIlI, final String llllllllllllIlIlllIlIlIlIIIllIIl) {
        llllllllllllIlIlllIlIlIlIIIllIlI = new String(Base64.getDecoder().decode(llllllllllllIlIlllIlIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlIlIlIIIlllIl = new StringBuilder();
        final char[] llllllllllllIlIlllIlIlIlIIIlllII = llllllllllllIlIlllIlIlIlIIIllIIl.toCharArray();
        int llllllllllllIlIlllIlIlIlIIIllIll = BlockDoublePlant.lllIIllllIllII[0];
        final double llllllllllllIlIlllIlIlIlIIIlIlIl = (Object)llllllllllllIlIlllIlIlIlIIIllIlI.toCharArray();
        final char llllllllllllIlIlllIlIlIlIIIlIlII = (char)llllllllllllIlIlllIlIlIlIIIlIlIl.length;
        Exception llllllllllllIlIlllIlIlIlIIIlIIll = (Exception)BlockDoublePlant.lllIIllllIllII[0];
        while (lIlIIIIlIIIIIlIl((int)llllllllllllIlIlllIlIlIlIIIlIIll, llllllllllllIlIlllIlIlIlIIIlIlII)) {
            final char llllllllllllIlIlllIlIlIlIIlIIIII = llllllllllllIlIlllIlIlIlIIIlIlIl[llllllllllllIlIlllIlIlIlIIIlIIll];
            llllllllllllIlIlllIlIlIlIIIlllIl.append((char)(llllllllllllIlIlllIlIlIlIIlIIIII ^ llllllllllllIlIlllIlIlIlIIIlllII[llllllllllllIlIlllIlIlIlIIIllIll % llllllllllllIlIlllIlIlIlIIIlllII.length]));
            "".length();
            ++llllllllllllIlIlllIlIlIlIIIllIll;
            ++llllllllllllIlIlllIlIlIlIIIlIIll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlIlIlIIIlllIl);
    }
    
    public void placeAt(final World llllllllllllIlIlllIlIlIlllIlllII, final BlockPos llllllllllllIlIlllIlIlIlllIllIll, final EnumPlantType llllllllllllIlIlllIlIlIlllIllIlI, final int llllllllllllIlIlllIlIlIlllIllIIl) {
        llllllllllllIlIlllIlIlIlllIlllII.setBlockState(llllllllllllIlIlllIlIlIlllIllIll, this.getDefaultState().withProperty(BlockDoublePlant.HALF, EnumBlockHalf.LOWER).withProperty(BlockDoublePlant.VARIANT, llllllllllllIlIlllIlIlIlllIllIlI), llllllllllllIlIlllIlIlIlllIllIIl);
        "".length();
        llllllllllllIlIlllIlIlIlllIlllII.setBlockState(llllllllllllIlIlllIlIlIlllIllIll.up(), this.getDefaultState().withProperty(BlockDoublePlant.HALF, EnumBlockHalf.UPPER), llllllllllllIlIlllIlIlIlllIllIIl);
        "".length();
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIlIlllIlIlIllIIIIlII, final CreativeTabs llllllllllllIlIlllIlIlIllIIIIIll, final List<ItemStack> llllllllllllIlIlllIlIlIlIlllllll) {
        final short llllllllllllIlIlllIlIlIlIllllIll;
        final int llllllllllllIlIlllIlIlIlIlllllII = ((EnumPlantType[])(Object)(llllllllllllIlIlllIlIlIlIllllIll = (short)(Object)EnumPlantType.values())).length;
        boolean llllllllllllIlIlllIlIlIlIlllllIl = BlockDoublePlant.lllIIllllIllII[0] != 0;
        "".length();
        if (((0xA ^ 0x74 ^ (0xDE ^ 0xB6)) & (0xFD ^ 0xB6 ^ (0x1E ^ 0x43) ^ -" ".length())) < -" ".length()) {
            return;
        }
        while (!lIlIIIIlIIIIIIll(llllllllllllIlIlllIlIlIlIlllllIl ? 1 : 0, llllllllllllIlIlllIlIlIlIlllllII)) {
            final EnumPlantType llllllllllllIlIlllIlIlIllIIIIIIl = llllllllllllIlIlllIlIlIlIllllIll[llllllllllllIlIlllIlIlIlIlllllIl];
            llllllllllllIlIlllIlIlIlIlllllll.add(new ItemStack(llllllllllllIlIlllIlIlIllIIIIlII, BlockDoublePlant.lllIIllllIllII[1], llllllllllllIlIlllIlIlIllIIIIIIl.getMeta()));
            "".length();
            ++llllllllllllIlIlllIlIlIlIlllllIl;
        }
    }
    
    @Override
    public int getDamageValue(final World llllllllllllIlIlllIlIlIlIlllIIll, final BlockPos llllllllllllIlIlllIlIlIlIlllIIlI) {
        return this.getVariant(llllllllllllIlIlllIlIlIlIlllIIll, llllllllllllIlIlllIlIlIlIlllIIlI).getMeta();
    }
    
    private static boolean lIlIIIIIlllllllI(final Object llllllllllllIlIlllIlIlIlIIIIIIll, final Object llllllllllllIlIlllIlIlIlIIIIIIlI) {
        return llllllllllllIlIlllIlIlIlIIIIIIll == llllllllllllIlIlllIlIlIlIIIIIIlI;
    }
    
    @Override
    public void onBlockPlacedBy(final World llllllllllllIlIlllIlIlIlllIIllll, final BlockPos llllllllllllIlIlllIlIlIlllIIlIII, final IBlockState llllllllllllIlIlllIlIlIlllIIllIl, final EntityLivingBase llllllllllllIlIlllIlIlIlllIIllII, final ItemStack llllllllllllIlIlllIlIlIlllIIlIll) {
        llllllllllllIlIlllIlIlIlllIIllll.setBlockState(llllllllllllIlIlllIlIlIlllIIlIII.up(), this.getDefaultState().withProperty(BlockDoublePlant.HALF, EnumBlockHalf.UPPER), BlockDoublePlant.lllIIllllIllII[2]);
        "".length();
    }
    
    @Override
    public void onBlockHarvested(final World llllllllllllIlIlllIlIlIllIlIllIl, final BlockPos llllllllllllIlIlllIlIlIllIlIllII, final IBlockState llllllllllllIlIlllIlIlIllIlIlIll, final EntityPlayer llllllllllllIlIlllIlIlIllIlIlIlI) {
        if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllIlIlIll.getValue(BlockDoublePlant.HALF), EnumBlockHalf.UPPER)) {
            if (lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllIlIllIl.getBlockState(llllllllllllIlIlllIlIlIllIlIllII.down()).getBlock(), this)) {
                if (lIlIIIIlIIIIIIIl(llllllllllllIlIlllIlIlIllIlIlIlI.capabilities.isCreativeMode ? 1 : 0)) {
                    final IBlockState llllllllllllIlIlllIlIlIllIlIlIIl = llllllllllllIlIlllIlIlIllIlIllIl.getBlockState(llllllllllllIlIlllIlIlIllIlIllII.down());
                    final EnumPlantType llllllllllllIlIlllIlIlIllIlIlIII = llllllllllllIlIlllIlIlIllIlIlIIl.getValue(BlockDoublePlant.VARIANT);
                    if (lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIllIlIlIII, EnumPlantType.FERN) && lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIllIlIlIII, EnumPlantType.GRASS)) {
                        llllllllllllIlIlllIlIlIllIlIllIl.destroyBlock(llllllllllllIlIlllIlIlIllIlIllII.down(), (boolean)(BlockDoublePlant.lllIIllllIllII[1] != 0));
                        "".length();
                        "".length();
                        if (((0x80 ^ 0xB5 ^ (0xB5 ^ 0xA0)) & (0x69 ^ 0x4B ^ "  ".length() ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    else if (lIlIIIIlIIIIIIIl(llllllllllllIlIlllIlIlIllIlIllIl.isRemote ? 1 : 0)) {
                        if (lIlIIIIlIIIIIIlI(llllllllllllIlIlllIlIlIllIlIlIlI.getCurrentEquippedItem()) && lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllIlIlIlI.getCurrentEquippedItem().getItem(), Items.shears)) {
                            this.onHarvest(llllllllllllIlIlllIlIlIllIlIllIl, llllllllllllIlIlllIlIlIllIlIllII, llllllllllllIlIlllIlIlIllIlIlIIl, llllllllllllIlIlllIlIlIllIlIlIlI);
                            "".length();
                            llllllllllllIlIlllIlIlIllIlIllIl.setBlockToAir(llllllllllllIlIlllIlIlIllIlIllII.down());
                            "".length();
                            "".length();
                            if (-" ".length() >= 0) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlIlllIlIlIllIlIllIl.destroyBlock(llllllllllllIlIlllIlIlIllIlIllII.down(), (boolean)(BlockDoublePlant.lllIIllllIllII[1] != 0));
                            "".length();
                            "".length();
                            if (" ".length() <= -" ".length()) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIlIlllIlIlIllIlIllIl.setBlockToAir(llllllllllllIlIlllIlIlIllIlIllII.down());
                        "".length();
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                    }
                }
                else {
                    llllllllllllIlIlllIlIlIllIlIllIl.setBlockToAir(llllllllllllIlIlllIlIlIllIlIllII.down());
                    "".length();
                    "".length();
                    if ((119 + 41 - 142 + 126 ^ 60 + 83 - 88 + 93) == -" ".length()) {
                        return;
                    }
                }
            }
        }
        else if (lIlIIIIIllllllll(llllllllllllIlIlllIlIlIllIlIlIlI.capabilities.isCreativeMode ? 1 : 0) && lIlIIIIIlllllllI(llllllllllllIlIlllIlIlIllIlIllIl.getBlockState(llllllllllllIlIlllIlIlIllIlIllII.up()).getBlock(), this)) {
            llllllllllllIlIlllIlIlIllIlIllIl.setBlockState(llllllllllllIlIlllIlIlIllIlIllII.up(), Blocks.air.getDefaultState(), BlockDoublePlant.lllIIllllIllII[2]);
            "".length();
        }
        super.onBlockHarvested(llllllllllllIlIlllIlIlIllIlIllIl, llllllllllllIlIlllIlIlIllIlIllII, llllllllllllIlIlllIlIlIllIlIlIll, llllllllllllIlIlllIlIlIllIlIlIlI);
    }
    
    private static boolean lIlIIIIlIIIIIIll(final int llllllllllllIlIlllIlIlIlIIIIllll, final int llllllllllllIlIlllIlIlIlIIIIlllI) {
        return llllllllllllIlIlllIlIlIlIIIIllll >= llllllllllllIlIlllIlIlIlIIIIlllI;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockDoublePlant.lllIIllllIllII[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoublePlant.lllIIllllIllII[0]] = BlockDoublePlant.HALF;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoublePlant.lllIIllllIllII[1]] = BlockDoublePlant.VARIANT;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoublePlant.lllIIllllIllII[2]] = BlockDoublePlant.field_181084_N;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIlIIIIlIIIIIIII(final Object llllllllllllIlIlllIlIlIlIIIIIlll, final Object llllllllllllIlIlllIlIlIlIIIIIllI) {
        return llllllllllllIlIlllIlIlIlIIIIIlll != llllllllllllIlIlllIlIlIlIIIIIllI;
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess llllllllllllIlIlllIlIlIllllIlIlI, final BlockPos llllllllllllIlIlllIlIlIllllIlIIl, final int llllllllllllIlIlllIlIlIllllIlIII) {
        final EnumPlantType llllllllllllIlIlllIlIlIllllIIlll = this.getVariant(llllllllllllIlIlllIlIlIllllIlIlI, llllllllllllIlIlllIlIlIllllIlIIl);
        int grassColorAtPos;
        if (lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIllllIIlll, EnumPlantType.GRASS) && lIlIIIIlIIIIIIII(llllllllllllIlIlllIlIlIllllIIlll, EnumPlantType.FERN)) {
            grassColorAtPos = BlockDoublePlant.lllIIllllIllII[5];
            "".length();
            if ((0x9 ^ 0x33 ^ (0x57 ^ 0x69)) != (0x32 ^ 0x22 ^ (0x5 ^ 0x11))) {
                return (0x8F ^ 0x93 ^ (0xE0 ^ 0xAB)) & (0x55 ^ 0x26 ^ (0x3 ^ 0x27) ^ -" ".length());
            }
        }
        else {
            grassColorAtPos = BiomeColorHelper.getGrassColorAtPos(llllllllllllIlIlllIlIlIllllIlIlI, llllllllllllIlIlllIlIlIllllIlIIl);
        }
        return grassColorAtPos;
    }
    
    public enum EnumBlockHalf implements IStringSerializable
    {
        LOWER(EnumBlockHalf.llIlIIIIllllII[EnumBlockHalf.llIlIIIIlllllI[1]], EnumBlockHalf.llIlIIIIlllllI[1]);
        
        private static final /* synthetic */ int[] llIlIIIIlllllI;
        private static final /* synthetic */ String[] llIlIIIIllllII;
        
        UPPER(EnumBlockHalf.llIlIIIIllllII[EnumBlockHalf.llIlIIIIlllllI[0]], EnumBlockHalf.llIlIIIIlllllI[0]);
        
        private static String lIIlIIIllIIIIIIl(final String llllllllllllIllIllIlIlIlllIIlIIl, final String llllllllllllIllIllIlIlIlllIIlIII) {
            try {
                final SecretKeySpec llllllllllllIllIllIlIlIlllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIlIlllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllIlIlIlllIIllIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIllIlIlIlllIIllIl.init(EnumBlockHalf.llIlIIIIlllllI[2], llllllllllllIllIllIlIlIlllIIlllI);
                return new String(llllllllllllIllIllIlIlIlllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIlIlllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIlIlIlllIIllII) {
                llllllllllllIllIllIlIlIlllIIllII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlIIIllIIIIlll(final Object llllllllllllIllIllIlIlIllIllllll, final Object llllllllllllIllIllIlIlIllIlllllI) {
            return llllllllllllIllIllIlIlIllIllllll == llllllllllllIllIllIlIlIllIlllllI;
        }
        
        @Override
        public String toString() {
            return this.getName();
        }
        
        private static String lIIlIIIlIlllllII(String llllllllllllIllIllIlIlIlllIllIll, final String llllllllllllIllIllIlIlIlllIlllll) {
            llllllllllllIllIllIlIlIlllIllIll = new String(Base64.getDecoder().decode(llllllllllllIllIllIlIlIlllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllIlIlIlllIllllI = new StringBuilder();
            final char[] llllllllllllIllIllIlIlIlllIlllIl = llllllllllllIllIllIlIlIlllIlllll.toCharArray();
            int llllllllllllIllIllIlIlIlllIlllII = EnumBlockHalf.llIlIIIIlllllI[0];
            final boolean llllllllllllIllIllIlIlIlllIlIllI = (Object)llllllllllllIllIllIlIlIlllIllIll.toCharArray();
            final long llllllllllllIllIllIlIlIlllIlIlIl = llllllllllllIllIllIlIlIlllIlIllI.length;
            short llllllllllllIllIllIlIlIlllIlIlII = (short)EnumBlockHalf.llIlIIIIlllllI[0];
            while (lIIlIIIllIIIlIII(llllllllllllIllIllIlIlIlllIlIlII, (int)llllllllllllIllIllIlIlIlllIlIlIl)) {
                final char llllllllllllIllIllIlIlIllllIIIIl = llllllllllllIllIllIlIlIlllIlIllI[llllllllllllIllIllIlIlIlllIlIlII];
                llllllllllllIllIllIlIlIlllIllllI.append((char)(llllllllllllIllIllIlIlIllllIIIIl ^ llllllllllllIllIllIlIlIlllIlllIl[llllllllllllIllIllIlIlIlllIlllII % llllllllllllIllIllIlIlIlllIlllIl.length]));
                "".length();
                ++llllllllllllIllIllIlIlIlllIlllII;
                ++llllllllllllIllIllIlIlIlllIlIlII;
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllIlIlIlllIllllI);
        }
        
        private static boolean lIIlIIIllIIIlIII(final int llllllllllllIllIllIlIlIlllIIIIll, final int llllllllllllIllIllIlIlIlllIIIIlI) {
            return llllllllllllIllIllIlIlIlllIIIIll < llllllllllllIllIllIlIlIlllIIIIlI;
        }
        
        private static void lIIlIIIllIIIIIll() {
            (llIlIIIIllllII = new String[EnumBlockHalf.llIlIIIIlllllI[4]])[EnumBlockHalf.llIlIIIIlllllI[0]] = lIIlIIIlIlllllII("BxcAJzg=", "RGPbj");
            EnumBlockHalf.llIlIIIIllllII[EnumBlockHalf.llIlIIIIlllllI[1]] = lIIlIIIllIIIIIIl("fR/z1AVcO0U=", "eFIlU");
            EnumBlockHalf.llIlIIIIllllII[EnumBlockHalf.llIlIIIIlllllI[2]] = lIIlIIIllIIIIIIl("oY7jeik6eVE=", "CBRMy");
            EnumBlockHalf.llIlIIIIllllII[EnumBlockHalf.llIlIIIIlllllI[3]] = lIIlIIIlIlllllII("JgUuNx8=", "JjYRm");
        }
        
        private static void lIIlIIIllIIIIllI() {
            (llIlIIIIlllllI = new int[5])[0] = ((0x10 ^ 0x1A) & ~(0x7F ^ 0x75));
            EnumBlockHalf.llIlIIIIlllllI[1] = " ".length();
            EnumBlockHalf.llIlIIIIlllllI[2] = "  ".length();
            EnumBlockHalf.llIlIIIIlllllI[3] = "   ".length();
            EnumBlockHalf.llIlIIIIlllllI[4] = (0xAF ^ 0xAB);
        }
        
        static {
            lIIlIIIllIIIIllI();
            lIIlIIIllIIIIIll();
            final EnumBlockHalf[] enum$VALUES = new EnumBlockHalf[EnumBlockHalf.llIlIIIIlllllI[2]];
            enum$VALUES[EnumBlockHalf.llIlIIIIlllllI[0]] = EnumBlockHalf.UPPER;
            enum$VALUES[EnumBlockHalf.llIlIIIIlllllI[1]] = EnumBlockHalf.LOWER;
            ENUM$VALUES = enum$VALUES;
        }
        
        @Override
        public String getName() {
            String s;
            if (lIIlIIIllIIIIlll(this, EnumBlockHalf.UPPER)) {
                s = EnumBlockHalf.llIlIIIIllllII[EnumBlockHalf.llIlIIIIlllllI[2]];
                "".length();
                if (-(0x92 ^ 0x96) > 0) {
                    return null;
                }
            }
            else {
                s = EnumBlockHalf.llIlIIIIllllII[EnumBlockHalf.llIlIIIIlllllI[3]];
            }
            return s;
        }
        
        private EnumBlockHalf(final String llllllllllllIllIllIlIlIllllllIlI, final int llllllllllllIllIllIlIlIllllllIIl) {
        }
    }
    
    public enum EnumPlantType implements IStringSerializable
    {
        ROSE(EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[10]], EnumPlantType.llIllIIIIIIIIl[4], EnumPlantType.llIllIIIIIIIIl[4], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[11]], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[12]]);
        
        private static final /* synthetic */ EnumPlantType[] META_LOOKUP;
        
        GRASS(EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[4]], EnumPlantType.llIllIIIIIIIIl[2], EnumPlantType.llIllIIIIIIIIl[2], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[5]], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[6]]);
        
        private static final /* synthetic */ int[] llIllIIIIIIIIl;
        
        SYRINGA(EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[2]], EnumPlantType.llIllIIIIIIIIl[1], EnumPlantType.llIllIIIIIIIIl[1], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[3]]);
        
        private final /* synthetic */ String name;
        private final /* synthetic */ int meta;
        
        PAEONIA(EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[13]], EnumPlantType.llIllIIIIIIIIl[5], EnumPlantType.llIllIIIIIIIIl[5], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[14]]);
        
        private final /* synthetic */ String unlocalizedName;
        private static final /* synthetic */ String[] llIlIlllllllll;
        
        FERN(EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[7]], EnumPlantType.llIllIIIIIIIIl[3], EnumPlantType.llIllIIIIIIIIl[3], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[8]], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[9]]), 
        SUNFLOWER(EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[0]], EnumPlantType.llIllIIIIIIIIl[0], EnumPlantType.llIllIIIIIIIIl[0], EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[1]]);
        
        private static boolean lIIlIllIIIlIIIll(final int llllllllllllIllIlIIIlIIIllIlIIIl) {
            return llllllllllllIllIlIIIlIIIllIlIIIl >= 0;
        }
        
        private static String lIIlIllIIIIllIIl(final String llllllllllllIllIlIIIlIIIlllIllIl, final String llllllllllllIllIlIIIlIIIlllIllII) {
            try {
                final SecretKeySpec llllllllllllIllIlIIIlIIIllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIlIIIlllIllII.getBytes(StandardCharsets.UTF_8)), EnumPlantType.llIllIIIIIIIIl[8]), "DES");
                final Cipher llllllllllllIllIlIIIlIIIlllIllll = Cipher.getInstance("DES");
                llllllllllllIllIlIIIlIIIlllIllll.init(EnumPlantType.llIllIIIIIIIIl[2], llllllllllllIllIlIIIlIIIllllIIII);
                return new String(llllllllllllIllIlIIIlIIIlllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIlIIIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIIlIIIlllIlllI) {
                llllllllllllIllIlIIIlIIIlllIlllI.printStackTrace();
                return null;
            }
        }
        
        private EnumPlantType(final String llllllllllllIllIlIIIlIIlIIllIlll, final int llllllllllllIllIlIIIlIIlIIllIllI, final int llllllllllllIllIlIIIlIIlIIlllIlI, final String llllllllllllIllIlIIIlIIlIIllIlII) {
            this(llllllllllllIllIlIIIlIIlIIllIlll, llllllllllllIllIlIIIlIIlIIllIllI, llllllllllllIllIlIIIlIIlIIlllIlI, llllllllllllIllIlIIIlIIlIIllIlII, llllllllllllIllIlIIIlIIlIIllIlII);
        }
        
        private static void lIIlIllIIIIlllll() {
            (llIlIlllllllll = new String[EnumPlantType.llIllIIIIIIIIl[15]])[EnumPlantType.llIllIIIIIIIIl[0]] = lIIlIllIIIIllIIl("84cYVHmJUcvbR3RTL0y2mQ==", "VCBjs");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[1]] = lIIlIllIIIIllIlI("NRgiFBkpGikA", "FmLru");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[2]] = lIIlIllIIIIllIll("uzD7Q/YBFbc=", "anwFE");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[3]] = lIIlIllIIIIllIll("gzoiMuewxo0=", "EiwlT");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[4]] = lIIlIllIIIIllIll("kHKSOgs14G0=", "hckhD");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[5]] = lIIlIllIIIIllIIl("9dnvqYJlmhyB7Z5wMnzWcw==", "dFTEb");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[6]] = lIIlIllIIIIllIlI("AQAjJwY=", "frBTu");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[7]] = lIIlIllIIIIllIIl("dYgJ2osdjg0=", "THvvY");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[8]] = lIIlIllIIIIllIll("jZl0G5C0n5YcLmZUiCyATw==", "fHDlt");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[9]] = lIIlIllIIIIllIIl("1o7lnKSCb1I=", "OYnbv");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[10]] = lIIlIllIIIIllIIl("3tNnghK/NDE=", "pQuKD");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[11]] = lIIlIllIIIIllIlI("DCQWKQENFBEkHg0=", "hKcKm");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[12]] = lIIlIllIIIIllIll("s9qR+I0/3OI=", "SuLHJ");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[13]] = lIIlIllIIIIllIll("1KMR9dpFphU=", "nMNJT");
            EnumPlantType.llIlIlllllllll[EnumPlantType.llIllIIIIIIIIl[14]] = lIIlIllIIIIllIll("mZDdbN0Yb4M=", "GnvDn");
        }
        
        public static EnumPlantType byMetadata(int llllllllllllIllIlIIIlIIlIIIllIll) {
            if (!lIIlIllIIIlIIIll(llllllllllllIllIlIIIlIIlIIIllIll) || lIIlIllIIIlIIIlI(llllllllllllIllIlIIIlIIlIIIllIll, EnumPlantType.META_LOOKUP.length)) {
                llllllllllllIllIlIIIlIIlIIIllIll = EnumPlantType.llIllIIIIIIIIl[0];
            }
            return EnumPlantType.META_LOOKUP[llllllllllllIllIlIIIlIIlIIIllIll];
        }
        
        private static void lIIlIllIIIlIIIIl() {
            (llIllIIIIIIIIl = new int[16])[0] = ((0x27 ^ 0x64) & ~(0xD2 ^ 0x91));
            EnumPlantType.llIllIIIIIIIIl[1] = " ".length();
            EnumPlantType.llIllIIIIIIIIl[2] = "  ".length();
            EnumPlantType.llIllIIIIIIIIl[3] = "   ".length();
            EnumPlantType.llIllIIIIIIIIl[4] = (0xA7 ^ 0xB4 ^ (0x83 ^ 0x94));
            EnumPlantType.llIllIIIIIIIIl[5] = (0xA7 ^ 0xAF ^ (0x12 ^ 0x1F));
            EnumPlantType.llIllIIIIIIIIl[6] = (0x26 ^ 0x20);
            EnumPlantType.llIllIIIIIIIIl[7] = (22 + 78 - 45 + 122 ^ 148 + 146 - 130 + 18);
            EnumPlantType.llIllIIIIIIIIl[8] = (0x5F ^ 0x57);
            EnumPlantType.llIllIIIIIIIIl[9] = (0xEB ^ 0x9C ^ (0x4E ^ 0x30));
            EnumPlantType.llIllIIIIIIIIl[10] = (130 + 172 - 197 + 96 ^ 43 + 13 - 12 + 151);
            EnumPlantType.llIllIIIIIIIIl[11] = (72 + 122 - 78 + 20 ^ 118 + 79 - 105 + 39);
            EnumPlantType.llIllIIIIIIIIl[12] = (27 + 142 - 34 + 12 ^ 38 + 144 - 145 + 122);
            EnumPlantType.llIllIIIIIIIIl[13] = (118 + 22 + 38 + 25 ^ 131 + 86 - 38 + 19);
            EnumPlantType.llIllIIIIIIIIl[14] = (0x7D ^ 0x73);
            EnumPlantType.llIllIIIIIIIIl[15] = (0x8C ^ 0x83);
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        public int getMeta() {
            return this.meta;
        }
        
        static {
            lIIlIllIIIlIIIIl();
            lIIlIllIIIIlllll();
            final EnumPlantType[] enum$VALUES = new EnumPlantType[EnumPlantType.llIllIIIIIIIIl[6]];
            enum$VALUES[EnumPlantType.llIllIIIIIIIIl[0]] = EnumPlantType.SUNFLOWER;
            enum$VALUES[EnumPlantType.llIllIIIIIIIIl[1]] = EnumPlantType.SYRINGA;
            enum$VALUES[EnumPlantType.llIllIIIIIIIIl[2]] = EnumPlantType.GRASS;
            enum$VALUES[EnumPlantType.llIllIIIIIIIIl[3]] = EnumPlantType.FERN;
            enum$VALUES[EnumPlantType.llIllIIIIIIIIl[4]] = EnumPlantType.ROSE;
            enum$VALUES[EnumPlantType.llIllIIIIIIIIl[5]] = EnumPlantType.PAEONIA;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumPlantType[values().length];
            final int llllllllllllIllIlIIIlIIlIlIIIIIl;
            final String llllllllllllIllIlIIIlIIlIlIIIIlI = (String)((EnumPlantType[])(Object)(llllllllllllIllIlIIIlIIlIlIIIIIl = (int)(Object)values())).length;
            char llllllllllllIllIlIIIlIIlIlIIIIll = (char)EnumPlantType.llIllIIIIIIIIl[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
            while (!lIIlIllIIIlIIIlI(llllllllllllIllIlIIIlIIlIlIIIIll, (int)llllllllllllIllIlIIIlIIlIlIIIIlI)) {
                final EnumPlantType llllllllllllIllIlIIIlIIlIlIIIlIl = llllllllllllIllIlIIIlIIlIlIIIIIl[llllllllllllIllIlIIIlIIlIlIIIIll];
                EnumPlantType.META_LOOKUP[llllllllllllIllIlIIIlIIlIlIIIlIl.getMeta()] = llllllllllllIllIlIIIlIIlIlIIIlIl;
                ++llllllllllllIllIlIIIlIIlIlIIIIll;
            }
        }
        
        private static String lIIlIllIIIIllIlI(String llllllllllllIllIlIIIlIIIllllllIl, final String llllllllllllIllIlIIIlIIlIIIIIIIl) {
            llllllllllllIllIlIIIlIIIllllllIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIlIIIllllllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIIIlIIlIIIIIIII = new StringBuilder();
            final char[] llllllllllllIllIlIIIlIIIllllllll = llllllllllllIllIlIIIlIIlIIIIIIIl.toCharArray();
            int llllllllllllIllIlIIIlIIIlllllllI = EnumPlantType.llIllIIIIIIIIl[0];
            final boolean llllllllllllIllIlIIIlIIIlllllIII = (Object)((String)llllllllllllIllIlIIIlIIIllllllIl).toCharArray();
            final short llllllllllllIllIlIIIlIIIllllIlll = (short)llllllllllllIllIlIIIlIIIlllllIII.length;
            byte llllllllllllIllIlIIIlIIIllllIllI = (byte)EnumPlantType.llIllIIIIIIIIl[0];
            while (lIIlIllIIIlIIlII(llllllllllllIllIlIIIlIIIllllIllI, llllllllllllIllIlIIIlIIIllllIlll)) {
                final char llllllllllllIllIlIIIlIIlIIIIIIll = llllllllllllIllIlIIIlIIIlllllIII[llllllllllllIllIlIIIlIIIllllIllI];
                llllllllllllIllIlIIIlIIlIIIIIIII.append((char)(llllllllllllIllIlIIIlIIlIIIIIIll ^ llllllllllllIllIlIIIlIIIllllllll[llllllllllllIllIlIIIlIIIlllllllI % llllllllllllIllIlIIIlIIIllllllll.length]));
                "".length();
                ++llllllllllllIllIlIIIlIIIlllllllI;
                ++llllllllllllIllIlIIIlIIIllllIllI;
                "".length();
                if ((0x43 ^ 0x47) < ((0x7C ^ 0x44) & ~(0x82 ^ 0xBA))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIIIlIIlIIIIIIII);
        }
        
        private static boolean lIIlIllIIIlIIIlI(final int llllllllllllIllIlIIIlIIIllIllIII, final int llllllllllllIllIlIIIlIIIllIlIlll) {
            return llllllllllllIllIlIIIlIIIllIllIII >= llllllllllllIllIlIIIlIIIllIlIlll;
        }
        
        private EnumPlantType(final String llllllllllllIllIlIIIlIIlIIlIlIII, final int llllllllllllIllIlIIIlIIlIIlIIlll, final int llllllllllllIllIlIIIlIIlIIlIIllI, final String llllllllllllIllIlIIIlIIlIIlIlIll, final String llllllllllllIllIlIIIlIIlIIlIIlII) {
            this.meta = llllllllllllIllIlIIIlIIlIIlIIllI;
            this.name = llllllllllllIllIlIIIlIIlIIlIlIll;
            this.unlocalizedName = llllllllllllIllIlIIIlIIlIIlIIlII;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static boolean lIIlIllIIIlIIlII(final int llllllllllllIllIlIIIlIIIllIlIlII, final int llllllllllllIllIlIIIlIIIllIlIIll) {
            return llllllllllllIllIlIIIlIIIllIlIlII < llllllllllllIllIlIIIlIIIllIlIIll;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String lIIlIllIIIIllIll(final String llllllllllllIllIlIIIlIIIllIllllI, final String llllllllllllIllIlIIIlIIIllIlllll) {
            try {
                final SecretKeySpec llllllllllllIllIlIIIlIIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIlIIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIIIlIIIlllIIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIIIlIIIlllIIIlI.init(EnumPlantType.llIllIIIIIIIIl[2], llllllllllllIllIlIIIlIIIlllIIIll);
                return new String(llllllllllllIllIlIIIlIIIlllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIlIIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIIlIIIlllIIIIl) {
                llllllllllllIllIlIIIlIIIlllIIIIl.printStackTrace();
                return null;
            }
        }
    }
}
