// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.block.state.BlockState;
import java.util.Arrays;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.StatCollector;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;

public class BlockFlowerPot extends BlockContainer
{
    public static final /* synthetic */ PropertyInteger LEGACY_DATA;
    private static final /* synthetic */ String[] lIIIlllIllllIl;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType;
    public static final /* synthetic */ PropertyEnum<EnumFlowerType> CONTENTS;
    private static final /* synthetic */ int[] lIIIllllIIIIIl;
    
    private static void llIIIlllIllIIII() {
        (lIIIllllIIIIIl = new int[13])[0] = ((0x37 ^ 0x67) & ~(0x6A ^ 0x3A));
        BlockFlowerPot.lIIIllllIIIIIl[1] = (0xE6 ^ 0x91 ^ (0x24 ^ 0x5C));
        BlockFlowerPot.lIIIllllIIIIIl[2] = " ".length();
        BlockFlowerPot.lIIIllllIIIIIl[3] = "  ".length();
        BlockFlowerPot.lIIIllllIIIIIl[4] = "   ".length();
        BlockFlowerPot.lIIIllllIIIIIl[5] = (-" ".length() & (-1 & 0xFFFFFF));
        BlockFlowerPot.lIIIllllIIIIIl[6] = (0x1C ^ 0x19);
        BlockFlowerPot.lIIIllllIIIIIl[7] = (0xB7 ^ 0xB1);
        BlockFlowerPot.lIIIllllIIIIIl[8] = (0x2A ^ 0x5D ^ (0xEB ^ 0x98));
        BlockFlowerPot.lIIIllllIIIIIl[9] = (0x40 ^ 0x5B ^ (0xA ^ 0x16));
        BlockFlowerPot.lIIIllllIIIIIl[10] = (0x77 ^ 0x67 ^ (0x8F ^ 0x95));
        BlockFlowerPot.lIIIllllIIIIIl[11] = (57 + 104 - 62 + 49 ^ 104 + 126 - 148 + 75);
        BlockFlowerPot.lIIIllllIIIIIl[12] = (0x24 ^ 0x51 ^ (0xC ^ 0x71));
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIllllIlIllIllIlllI, final BlockPos lllllllllllllIIllllIlIllIllIllIl, final IBlockState lllllllllllllIIllllIlIllIllIllII, final EntityPlayer lllllllllllllIIllllIlIllIllIIIII, final EnumFacing lllllllllllllIIllllIlIllIllIlIlI, final float lllllllllllllIIllllIlIllIllIlIIl, final float lllllllllllllIIllllIlIllIllIlIII, final float lllllllllllllIIllllIlIllIllIIlll) {
        final ItemStack lllllllllllllIIllllIlIllIllIIllI = lllllllllllllIIllllIlIllIllIIIII.inventory.getCurrentItem();
        if (!llIIIlllIllIIlI(lllllllllllllIIllllIlIllIllIIllI) || !llIIIlllIllIIIl((lllllllllllllIIllllIlIllIllIIllI.getItem() instanceof ItemBlock) ? 1 : 0)) {
            return BlockFlowerPot.lIIIllllIIIIIl[0] != 0;
        }
        final TileEntityFlowerPot lllllllllllllIIllllIlIllIllIIlIl = this.getTileEntity(lllllllllllllIIllllIlIllIllIlllI, lllllllllllllIIllllIlIllIllIllIl);
        if (llIIIlllIllIIll(lllllllllllllIIllllIlIllIllIIlIl)) {
            return BlockFlowerPot.lIIIllllIIIIIl[0] != 0;
        }
        if (llIIIlllIllIIlI(lllllllllllllIIllllIlIllIllIIlIl.getFlowerPotItem())) {
            return BlockFlowerPot.lIIIllllIIIIIl[0] != 0;
        }
        final Block lllllllllllllIIllllIlIllIllIIlII = Block.getBlockFromItem(lllllllllllllIIllllIlIllIllIIllI.getItem());
        if (llIIIlllIllIlII(this.canNotContain(lllllllllllllIIllllIlIllIllIIlII, lllllllllllllIIllllIlIllIllIIllI.getMetadata()) ? 1 : 0)) {
            return BlockFlowerPot.lIIIllllIIIIIl[0] != 0;
        }
        lllllllllllllIIllllIlIllIllIIlIl.setFlowerPotData(lllllllllllllIIllllIlIllIllIIllI.getItem(), lllllllllllllIIllllIlIllIllIIllI.getMetadata());
        lllllllllllllIIllllIlIllIllIIlIl.markDirty();
        lllllllllllllIIllllIlIllIllIlllI.markBlockForUpdate(lllllllllllllIIllllIlIllIllIllIl);
        lllllllllllllIIllllIlIllIllIIIII.triggerAchievement(StatList.field_181736_T);
        if (llIIIlllIllIlII(lllllllllllllIIllllIlIllIllIIIII.capabilities.isCreativeMode ? 1 : 0)) {
            final ItemStack itemStack = lllllllllllllIIllllIlIllIllIIllI;
            final int n = itemStack.stackSize - BlockFlowerPot.lIIIllllIIIIIl[2];
            itemStack.stackSize = n;
            if (llIIIlllIllIlIl(n)) {
                lllllllllllllIIllllIlIllIllIIIII.inventory.setInventorySlotContents(lllllllllllllIIllllIlIllIllIIIII.inventory.currentItem, null);
            }
        }
        return BlockFlowerPot.lIIIllllIIIIIl[2] != 0;
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(BlockFlowerPot.lIIIlllIllllIl[BlockFlowerPot.lIIIllllIIIIIl[3]]);
    }
    
    @Override
    public boolean isFlowerPot() {
        return BlockFlowerPot.lIIIllllIIIIIl[2] != 0;
    }
    
    @Override
    public int getDamageValue(final World lllllllllllllIIllllIlIllIlIIIlII, final BlockPos lllllllllllllIIllllIlIllIIllllll) {
        final TileEntityFlowerPot lllllllllllllIIllllIlIllIlIIIIlI = this.getTileEntity(lllllllllllllIIllllIlIllIlIIIlII, lllllllllllllIIllllIlIllIIllllll);
        int flowerPotData;
        if (llIIIlllIllIIlI(lllllllllllllIIllllIlIllIlIIIIlI) && llIIIlllIllIIlI(lllllllllllllIIllllIlIllIlIIIIlI.getFlowerPotItem())) {
            flowerPotData = lllllllllllllIIllllIlIllIlIIIIlI.getFlowerPotData();
            "".length();
            if ("   ".length() <= 0) {
                return (0x1F ^ 0x3E ^ (0xD9 ^ 0xC7)) & (111 + 86 - 146 + 115 ^ 57 + 128 - 76 + 44 ^ -" ".length());
            }
        }
        else {
            flowerPotData = BlockFlowerPot.lIIIllllIIIIIl[0];
        }
        return flowerPotData;
    }
    
    private static boolean llIIIlllIllIlll(final Object lllllllllllllIIllllIlIlIlIIIIIlI, final Object lllllllllllllIIllllIlIlIlIIIIIIl) {
        return lllllllllllllIIllllIlIlIlIIIIIlI == lllllllllllllIIllllIlIlIlIIIIIIl;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIllllIlIllIIllIlIl, final BlockPos lllllllllllllIIllllIlIllIIllIlII) {
        if (llIIIlllIllIIIl(super.canPlaceBlockAt(lllllllllllllIIllllIlIllIIllIlIl, lllllllllllllIIllllIlIllIIllIlII) ? 1 : 0) && llIIIlllIllIIIl(World.doesBlockHaveSolidTopSurface(lllllllllllllIIllllIlIllIIllIlIl, lllllllllllllIIllllIlIllIIllIlII.down()) ? 1 : 0)) {
            return BlockFlowerPot.lIIIllllIIIIIl[2] != 0;
        }
        return BlockFlowerPot.lIIIllllIIIIIl[0] != 0;
    }
    
    private static String llIIIlllIlIIlll(final String lllllllllllllIIllllIlIlIlIlIIlIl, final String lllllllllllllIIllllIlIlIlIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIlIlIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIlIlIlIlIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIlIlIlIlIIlll.init(BlockFlowerPot.lIIIllllIIIIIl[3], lllllllllllllIIllllIlIlIlIlIlIII);
            return new String(lllllllllllllIIllllIlIlIlIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIlIlIlIIllI) {
            lllllllllllllIIllllIlIlIlIlIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIllllIlIlIlllIIllI) {
        return lllllllllllllIIllllIlIlIlllIIllI.getValue((IProperty<Integer>)BlockFlowerPot.LEGACY_DATA);
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        final float lllllllllllllIIllllIlIlllIIIlllI = 0.375f;
        final float lllllllllllllIIllllIlIlllIIIllIl = lllllllllllllIIllllIlIlllIIIlllI / 2.0f;
        this.setBlockBounds(0.5f - lllllllllllllIIllllIlIlllIIIllIl, 0.0f, 0.5f - lllllllllllllIIllllIlIlllIIIllIl, 0.5f + lllllllllllllIIllllIlIlllIIIllIl, lllllllllllllIIllllIlIlllIIIlllI, 0.5f + lllllllllllllIIllllIlIlllIIIllIl);
    }
    
    private static boolean llIIIlllIllIIIl(final int lllllllllllllIIllllIlIlIIlllllIl) {
        return lllllllllllllIIllllIlIlIIlllllIl != 0;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIllllIlIllIlIIllII, final BlockPos lllllllllllllIIllllIlIllIlIIlIll) {
        final TileEntityFlowerPot lllllllllllllIIllllIlIllIlIIlllI = this.getTileEntity(lllllllllllllIIllllIlIllIlIIllII, lllllllllllllIIllllIlIllIlIIlIll);
        Item item;
        if (llIIIlllIllIIlI(lllllllllllllIIllllIlIllIlIIlllI) && llIIIlllIllIIlI(lllllllllllllIIllllIlIllIlIIlllI.getFlowerPotItem())) {
            item = lllllllllllllIIllllIlIllIlIIlllI.getFlowerPotItem();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            item = Items.flower_pot;
        }
        return item;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIllllIlIlIllllIIll, final int lllllllllllllIIllllIlIlIllllIIlI) {
        Block lllllllllllllIIllllIlIlIllllIIIl = null;
        int lllllllllllllIIllllIlIlIllllIIII = BlockFlowerPot.lIIIllllIIIIIl[0];
        switch (lllllllllllllIIllllIlIlIllllIIlI) {
            case 1: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.red_flower;
                lllllllllllllIIllllIlIlIllllIIII = BlockFlower.EnumFlowerType.POPPY.getMeta();
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
                break;
            }
            case 2: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.yellow_flower;
                "".length();
                if ("   ".length() == " ".length()) {
                    return null;
                }
                break;
            }
            case 3: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.sapling;
                lllllllllllllIIllllIlIlIllllIIII = BlockPlanks.EnumType.OAK.getMetadata();
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
                break;
            }
            case 4: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.sapling;
                lllllllllllllIIllllIlIlIllllIIII = BlockPlanks.EnumType.SPRUCE.getMetadata();
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
                break;
            }
            case 5: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.sapling;
                lllllllllllllIIllllIlIlIllllIIII = BlockPlanks.EnumType.BIRCH.getMetadata();
                "".length();
                if (((0x31 ^ 0x6F ^ (0x64 ^ 0x12)) & (0x18 ^ 0x33 ^ "   ".length() ^ -" ".length())) != 0x0) {
                    return null;
                }
                break;
            }
            case 6: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.sapling;
                lllllllllllllIIllllIlIlIllllIIII = BlockPlanks.EnumType.JUNGLE.getMetadata();
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            case 7: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.red_mushroom;
                "".length();
                if ("  ".length() == (0x4C ^ 0x48)) {
                    return null;
                }
                break;
            }
            case 8: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.brown_mushroom;
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            case 9: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.cactus;
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            case 10: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.deadbush;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
                break;
            }
            case 11: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.tallgrass;
                lllllllllllllIIllllIlIlIllllIIII = BlockTallGrass.EnumType.FERN.getMeta();
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return null;
                }
                break;
            }
            case 12: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.sapling;
                lllllllllllllIIllllIlIlIllllIIII = BlockPlanks.EnumType.ACACIA.getMetadata();
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            case 13: {
                lllllllllllllIIllllIlIlIllllIIIl = Blocks.sapling;
                lllllllllllllIIllllIlIlIllllIIII = BlockPlanks.EnumType.DARK_OAK.getMetadata();
                break;
            }
        }
        return new TileEntityFlowerPot(Item.getItemFromBlock(lllllllllllllIIllllIlIlIllllIIIl), lllllllllllllIIllllIlIlIllllIIII);
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIllllIlIllIIlIIIII, final BlockPos lllllllllllllIIllllIlIllIIIlllll, final IBlockState lllllllllllllIIllllIlIllIIIllIIl) {
        final TileEntityFlowerPot lllllllllllllIIllllIlIllIIIlllIl = this.getTileEntity(lllllllllllllIIllllIlIllIIlIIIII, lllllllllllllIIllllIlIllIIIlllll);
        if (llIIIlllIllIIlI(lllllllllllllIIllllIlIllIIIlllIl) && llIIIlllIllIIlI(lllllllllllllIIllllIlIllIIIlllIl.getFlowerPotItem())) {
            Block.spawnAsEntity(lllllllllllllIIllllIlIllIIlIIIII, lllllllllllllIIllllIlIllIIIlllll, new ItemStack(lllllllllllllIIllllIlIllIIIlllIl.getFlowerPotItem(), BlockFlowerPot.lIIIllllIIIIIl[2], lllllllllllllIIllllIlIllIIIlllIl.getFlowerPotData()));
        }
        super.breakBlock(lllllllllllllIIllllIlIllIIlIIIII, lllllllllllllIIllllIlIllIIIlllll, lllllllllllllIIllllIlIllIIIllIIl);
    }
    
    public BlockFlowerPot() {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockFlowerPot.CONTENTS, EnumFlowerType.EMPTY).withProperty((IProperty<Comparable>)BlockFlowerPot.LEGACY_DATA, BlockFlowerPot.lIIIllllIIIIIl[0]));
        this.setBlockBoundsForItemRender();
    }
    
    @Override
    public IBlockState getActualState(final IBlockState lllllllllllllIIllllIlIlIllIlIIlI, final IBlockAccess lllllllllllllIIllllIlIlIllIllIlI, final BlockPos lllllllllllllIIllllIlIlIllIlIIII) {
        EnumFlowerType lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.EMPTY;
        final TileEntity lllllllllllllIIllllIlIlIllIlIlll = lllllllllllllIIllllIlIlIllIllIlI.getTileEntity(lllllllllllllIIllllIlIlIllIlIIII);
        if (llIIIlllIllIIIl((lllllllllllllIIllllIlIlIllIlIlll instanceof TileEntityFlowerPot) ? 1 : 0)) {
            final TileEntityFlowerPot lllllllllllllIIllllIlIlIllIlIllI = (TileEntityFlowerPot)lllllllllllllIIllllIlIlIllIlIlll;
            final Item lllllllllllllIIllllIlIlIllIlIlIl = lllllllllllllIIllllIlIlIllIlIllI.getFlowerPotItem();
            if (llIIIlllIllIIIl((lllllllllllllIIllllIlIlIllIlIlIl instanceof ItemBlock) ? 1 : 0)) {
                final int lllllllllllllIIllllIlIlIllIlIlII = lllllllllllllIIllllIlIlIllIlIllI.getFlowerPotData();
                final Block lllllllllllllIIllllIlIlIllIlIIll = Block.getBlockFromItem(lllllllllllllIIllllIlIlIllIlIlIl);
                if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.sapling)) {
                    switch ($SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType()[BlockPlanks.EnumType.byMetadata(lllllllllllllIIllllIlIlIllIlIlII).ordinal()]) {
                        case 1: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.OAK_SAPLING;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                            break;
                        }
                        case 2: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.SPRUCE_SAPLING;
                            "".length();
                            if (" ".length() < 0) {
                                return null;
                            }
                            break;
                        }
                        case 3: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.BIRCH_SAPLING;
                            "".length();
                            if (((0x8D ^ 0xBF) & ~(0x16 ^ 0x24)) > 0) {
                                return null;
                            }
                            break;
                        }
                        case 4: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.JUNGLE_SAPLING;
                            "".length();
                            if (-"   ".length() >= 0) {
                                return null;
                            }
                            break;
                        }
                        case 5: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.ACACIA_SAPLING;
                            "".length();
                            if (-" ".length() > (0x9F ^ 0x8F ^ (0x46 ^ 0x52))) {
                                return null;
                            }
                            break;
                        }
                        case 6: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.DARK_OAK_SAPLING;
                            "".length();
                            if ("  ".length() == 0) {
                                return null;
                            }
                            break;
                        }
                        default: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.EMPTY;
                            "".length();
                            if (((0xD6 ^ 0x88) & ~(0xF9 ^ 0xA7)) != 0x0) {
                                return null;
                            }
                            break;
                        }
                    }
                }
                else if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.tallgrass)) {
                    switch (lllllllllllllIIllllIlIlIllIlIlII) {
                        case 0: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.DEAD_BUSH;
                            "".length();
                            if (-(119 + 6 - 92 + 143 ^ 4 + 41 + 11 + 124) > 0) {
                                return null;
                            }
                            break;
                        }
                        case 2: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.FERN;
                            "".length();
                            if ((0xD5 ^ 0xC6 ^ (0x79 ^ 0x6E)) != (0xCE ^ 0x84 ^ (0x5D ^ 0x13))) {
                                return null;
                            }
                            break;
                        }
                        default: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.EMPTY;
                            "".length();
                            if (-" ".length() > "  ".length()) {
                                return null;
                            }
                            break;
                        }
                    }
                }
                else if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.yellow_flower)) {
                    lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.DANDELION;
                    "".length();
                    if (-(124 + 11 - 60 + 96 ^ 95 + 34 - 28 + 74) > 0) {
                        return null;
                    }
                }
                else if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.red_flower)) {
                    switch ($SWITCH_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType()[BlockFlower.EnumFlowerType.getType(BlockFlower.EnumFlowerColor.RED, lllllllllllllIIllllIlIlIllIlIlII).ordinal()]) {
                        case 2: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.POPPY;
                            "".length();
                            if (-" ".length() > ((0x80 ^ 0xBA) & ~(0x9C ^ 0xA6))) {
                                return null;
                            }
                            break;
                        }
                        case 3: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.BLUE_ORCHID;
                            "".length();
                            if (-"   ".length() > 0) {
                                return null;
                            }
                            break;
                        }
                        case 4: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.ALLIUM;
                            "".length();
                            if (" ".length() == (0xB3 ^ 0xB7)) {
                                return null;
                            }
                            break;
                        }
                        case 5: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.HOUSTONIA;
                            "".length();
                            if ("  ".length() >= (0xB7 ^ 0xB3)) {
                                return null;
                            }
                            break;
                        }
                        case 6: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.RED_TULIP;
                            "".length();
                            if (" ".length() < 0) {
                                return null;
                            }
                            break;
                        }
                        case 7: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.ORANGE_TULIP;
                            "".length();
                            if (((0x2F ^ 0x6A) & ~(0x5A ^ 0x1F)) < 0) {
                                return null;
                            }
                            break;
                        }
                        case 8: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.WHITE_TULIP;
                            "".length();
                            if (-"   ".length() > 0) {
                                return null;
                            }
                            break;
                        }
                        case 9: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.PINK_TULIP;
                            "".length();
                            if ("  ".length() == 0) {
                                return null;
                            }
                            break;
                        }
                        case 10: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.OXEYE_DAISY;
                            "".length();
                            if (-(0x8A ^ 0x8F) >= 0) {
                                return null;
                            }
                            break;
                        }
                        default: {
                            lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.EMPTY;
                            "".length();
                            if ((0x7E ^ 0x26 ^ (0x29 ^ 0x75)) < 0) {
                                return null;
                            }
                            break;
                        }
                    }
                }
                else if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.red_mushroom)) {
                    lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.MUSHROOM_RED;
                    "".length();
                    if ((142 + 142 - 158 + 25 ^ 73 + 76 - 117 + 115) > (0xA6 ^ 0x85 ^ (0x46 ^ 0x61))) {
                        return null;
                    }
                }
                else if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.brown_mushroom)) {
                    lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.MUSHROOM_BROWN;
                    "".length();
                    if (((0xB7 ^ 0x89) & ~(0x1A ^ 0x24)) >= " ".length()) {
                        return null;
                    }
                }
                else if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.deadbush)) {
                    lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.DEAD_BUSH;
                    "".length();
                    if (((0x55 ^ 0x1E) & ~(0x75 ^ 0x3E)) != 0x0) {
                        return null;
                    }
                }
                else if (llIIIlllIllIlll(lllllllllllllIIllllIlIlIllIlIIll, Blocks.cactus)) {
                    lllllllllllllIIllllIlIlIllIllIII = EnumFlowerType.CACTUS;
                }
            }
        }
        return lllllllllllllIIllllIlIlIllIlIIlI.withProperty(BlockFlowerPot.CONTENTS, lllllllllllllIIllllIlIlIllIllIII);
    }
    
    @Override
    public void onBlockHarvested(final World lllllllllllllIIllllIlIllIIIIlIlI, final BlockPos lllllllllllllIIllllIlIllIIIIlIIl, final IBlockState lllllllllllllIIllllIlIllIIIIlIII, final EntityPlayer lllllllllllllIIllllIlIllIIIIIlll) {
        super.onBlockHarvested(lllllllllllllIIllllIlIllIIIIlIlI, lllllllllllllIIllllIlIllIIIIlIIl, lllllllllllllIIllllIlIllIIIIlIII, lllllllllllllIIllllIlIllIIIIIlll);
        if (llIIIlllIllIIIl(lllllllllllllIIllllIlIllIIIIIlll.capabilities.isCreativeMode ? 1 : 0)) {
            final TileEntityFlowerPot lllllllllllllIIllllIlIllIIIIllII = this.getTileEntity(lllllllllllllIIllllIlIllIIIIlIlI, lllllllllllllIIllllIlIllIIIIlIIl);
            if (llIIIlllIllIIlI(lllllllllllllIIllllIlIllIIIIllII)) {
                lllllllllllllIIllllIlIllIIIIllII.setFlowerPotData(null, BlockFlowerPot.lIIIllllIIIIIl[0]);
            }
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIllllIlIllIIlIlllI, final BlockPos lllllllllllllIIllllIlIllIIlIllIl, final IBlockState lllllllllllllIIllllIlIllIIlIllII, final Block lllllllllllllIIllllIlIllIIlIlIll) {
        if (llIIIlllIllIlII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIllllIlIllIIlIlllI, lllllllllllllIIllllIlIllIIlIllIl.down()) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIIllllIlIllIIlIlllI, lllllllllllllIIllllIlIllIIlIllIl, lllllllllllllIIllllIlIllIIlIllII, BlockFlowerPot.lIIIllllIIIIIl[0]);
            lllllllllllllIIllllIlIllIIlIlllI.setBlockToAir(lllllllllllllIIllllIlIllIIlIllIl);
            "".length();
        }
    }
    
    private static boolean llIIIlllIllIIlI(final Object lllllllllllllIIllllIlIlIlIIIIlIl) {
        return lllllllllllllIIllllIlIlIlIIIIlIl != null;
    }
    
    private TileEntityFlowerPot getTileEntity(final World lllllllllllllIIllllIlIlIllllllIl, final BlockPos lllllllllllllIIllllIlIlIllllllII) {
        final TileEntity lllllllllllllIIllllIlIlIlllllIll = lllllllllllllIIllllIlIlIllllllIl.getTileEntity(lllllllllllllIIllllIlIlIllllllII);
        TileEntityFlowerPot tileEntityFlowerPot;
        if (llIIIlllIllIIIl((lllllllllllllIIllllIlIlIlllllIll instanceof TileEntityFlowerPot) ? 1 : 0)) {
            tileEntityFlowerPot = (TileEntityFlowerPot)lllllllllllllIIllllIlIlIlllllIll;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        else {
            tileEntityFlowerPot = null;
        }
        return tileEntityFlowerPot;
    }
    
    private static boolean llIIIlllIllIllI(final Object lllllllllllllIIllllIlIlIlIIIlIII, final Object lllllllllllllIIllllIlIlIlIIIIlll) {
        return lllllllllllllIIllllIlIlIlIIIlIII != lllllllllllllIIllllIlIlIlIIIIlll;
    }
    
    private static String llIIIlllIlIIllI(String lllllllllllllIIllllIlIlIlIllIlIl, final String lllllllllllllIIllllIlIlIlIlllIIl) {
        lllllllllllllIIllllIlIlIlIllIlIl = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIlIlIlIllIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIlIlIlIlllIII = new StringBuilder();
        final char[] lllllllllllllIIllllIlIlIlIllIlll = lllllllllllllIIllllIlIlIlIlllIIl.toCharArray();
        int lllllllllllllIIllllIlIlIlIllIllI = BlockFlowerPot.lIIIllllIIIIIl[0];
        final byte lllllllllllllIIllllIlIlIlIllIIII = (Object)((String)lllllllllllllIIllllIlIlIlIllIlIl).toCharArray();
        final long lllllllllllllIIllllIlIlIlIlIllll = lllllllllllllIIllllIlIlIlIllIIII.length;
        String lllllllllllllIIllllIlIlIlIlIlllI = (String)BlockFlowerPot.lIIIllllIIIIIl[0];
        while (llIIIlllIlllIIl((int)lllllllllllllIIllllIlIlIlIlIlllI, (int)lllllllllllllIIllllIlIlIlIlIllll)) {
            final char lllllllllllllIIllllIlIlIlIlllIll = lllllllllllllIIllllIlIlIlIllIIII[lllllllllllllIIllllIlIlIlIlIlllI];
            lllllllllllllIIllllIlIlIlIlllIII.append((char)(lllllllllllllIIllllIlIlIlIlllIll ^ lllllllllllllIIllllIlIlIlIllIlll[lllllllllllllIIllllIlIlIlIllIllI % lllllllllllllIIllllIlIlIlIllIlll.length]));
            "".length();
            ++lllllllllllllIIllllIlIlIlIllIllI;
            ++lllllllllllllIIllllIlIlIlIlIlllI;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIlIlIlIlllIII);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockFlowerPot.lIIIllllIIIIIl[0] != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIllllIlIllIIIIIlII, final Random lllllllllllllIIllllIlIllIIIIIIll, final int lllllllllllllIIllllIlIllIIIIIIlI) {
        return Items.flower_pot;
    }
    
    private static boolean llIIIlllIllIlII(final int lllllllllllllIIllllIlIlIIllllIll) {
        return lllllllllllllIIllllIlIlIIllllIll == 0;
    }
    
    private static boolean llIIIlllIllIIll(final Object lllllllllllllIIllllIlIlIIlllllll) {
        return lllllllllllllIIllllIlIlIIlllllll == null;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType = BlockFlowerPot.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        if (llIIIlllIllIIlI($switch_TABLE$net$minecraft$block$BlockPlanks$EnumType)) {
            return $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        }
        "".length();
        final double lllllllllllllIIllllIlIlIllIIIlll = (Object)new int[BlockPlanks.EnumType.values().length];
        try {
            lllllllllllllIIllllIlIlIllIIIlll[BlockPlanks.EnumType.ACACIA.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlll[BlockPlanks.EnumType.BIRCH.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[4];
            "".length();
            if (((0xD6 ^ 0x80) & ~(0x56 ^ 0x0)) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlll[BlockPlanks.EnumType.DARK_OAK.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[7];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlll[BlockPlanks.EnumType.JUNGLE.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[8];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlll[BlockPlanks.EnumType.OAK.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlll[BlockPlanks.EnumType.SPRUCE.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[3];
            "".length();
            if ((0x48 ^ 0x3A ^ (0x12 ^ 0x64)) < "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockFlowerPot.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType = (int[])(Object)lllllllllllllIIllllIlIlIllIIIlll;
    }
    
    private static String llIIIlllIlIIlIl(final String lllllllllllllIIllllIlIlIlIIllIII, final String lllllllllllllIIllllIlIlIlIIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), BlockFlowerPot.lIIIllllIIIIIl[12]), "DES");
            final Cipher lllllllllllllIIllllIlIlIlIIllIlI = Cipher.getInstance("DES");
            lllllllllllllIIllllIlIlIlIIllIlI.init(BlockFlowerPot.lIIIllllIIIIIl[3], lllllllllllllIIllllIlIlIlIIllIll);
            return new String(lllllllllllllIIllllIlIlIlIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIlIlIIllIIl) {
            lllllllllllllIIllllIlIlIlIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIlllIlIlIll() {
        (lIIIlllIllllIl = new String[BlockFlowerPot.lIIIllllIIIIIl[4]])[BlockFlowerPot.lIIIllllIIIIIl[0]] = llIIIlllIlIIlIl("bdfkufZ3gd5d2EvOONheNQ==", "BHySh");
        BlockFlowerPot.lIIIlllIllllIl[BlockFlowerPot.lIIIllllIIIIIl[2]] = llIIIlllIlIIllI("Eg07PgwfFiY=", "qbUJi");
        BlockFlowerPot.lIIIlllIllllIl[BlockFlowerPot.lIIIllllIIIIIl[3]] = llIIIlllIlIIlll("rLW6FWjBJQ6NmBlpEoJqIFrBp/MVCwIt", "iZsWB");
    }
    
    private boolean canNotContain(final Block lllllllllllllIIllllIlIllIlIllIIl, final int lllllllllllllIIllllIlIllIlIlIllI) {
        int n;
        if (llIIIlllIllIllI(lllllllllllllIIllllIlIllIlIllIIl, Blocks.yellow_flower) && llIIIlllIllIllI(lllllllllllllIIllllIlIllIlIllIIl, Blocks.red_flower) && llIIIlllIllIllI(lllllllllllllIIllllIlIllIlIllIIl, Blocks.cactus) && llIIIlllIllIllI(lllllllllllllIIllllIlIllIlIllIIl, Blocks.brown_mushroom) && llIIIlllIllIllI(lllllllllllllIIllllIlIllIlIllIIl, Blocks.red_mushroom) && llIIIlllIllIllI(lllllllllllllIIllllIlIllIlIllIIl, Blocks.sapling) && llIIIlllIllIllI(lllllllllllllIIllllIlIllIlIllIIl, Blocks.deadbush)) {
            if (llIIIlllIllIlll(lllllllllllllIIllllIlIllIlIllIIl, Blocks.tallgrass) && llIIIlllIlllIII(lllllllllllllIIllllIlIllIlIlIllI, BlockTallGrass.EnumType.FERN.getMeta())) {
                n = BlockFlowerPot.lIIIllllIIIIIl[2];
                "".length();
                if (-" ".length() > "  ".length()) {
                    return ((0xE1 ^ 0xC0) & ~(0x19 ^ 0x38)) != 0x0;
                }
            }
            else {
                n = BlockFlowerPot.lIIIllllIIIIIl[0];
                "".length();
                if (null != null) {
                    return ((0xC ^ 0x41) & ~(0xFD ^ 0xB0)) != 0x0;
                }
            }
        }
        else {
            n = BlockFlowerPot.lIIIllllIIIIIl[2];
        }
        return n != 0;
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess lllllllllllllIIllllIlIllIllllIll, final BlockPos lllllllllllllIIllllIlIllIllllIlI, final int lllllllllllllIIllllIlIllIllllllI) {
        final TileEntity lllllllllllllIIllllIlIllIlllllIl = lllllllllllllIIllllIlIllIllllIll.getTileEntity(lllllllllllllIIllllIlIllIllllIlI);
        if (llIIIlllIllIIIl((lllllllllllllIIllllIlIllIlllllIl instanceof TileEntityFlowerPot) ? 1 : 0)) {
            final Item lllllllllllllIIllllIlIllIlllllII = ((TileEntityFlowerPot)lllllllllllllIIllllIlIllIlllllIl).getFlowerPotItem();
            if (llIIIlllIllIIIl((lllllllllllllIIllllIlIllIlllllII instanceof ItemBlock) ? 1 : 0)) {
                return Block.getBlockFromItem(lllllllllllllIIllllIlIllIlllllII).colorMultiplier(lllllllllllllIIllllIlIllIllllIll, lllllllllllllIIllllIlIllIllllIlI, lllllllllllllIIllllIlIllIllllllI);
            }
        }
        return BlockFlowerPot.lIIIllllIIIIIl[5];
    }
    
    private static boolean llIIIlllIlllIIl(final int lllllllllllllIIllllIlIlIlIIIllII, final int lllllllllllllIIllllIlIlIlIIIlIll) {
        return lllllllllllllIIllllIlIlIlIIIllII < lllllllllllllIIllllIlIlIlIIIlIll;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockFlowerPot.lIIIllllIIIIIl[0] != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockFlowerPot.lIIIllllIIIIIl[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFlowerPot.lIIIllllIIIIIl[0]] = BlockFlowerPot.CONTENTS;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFlowerPot.lIIIllllIIIIIl[2]] = BlockFlowerPot.LEGACY_DATA;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean llIIIlllIllIlIl(final int lllllllllllllIIllllIlIlIIllllIIl) {
        return lllllllllllllIIllllIlIlIIllllIIl <= 0;
    }
    
    @Override
    public int getRenderType() {
        return BlockFlowerPot.lIIIllllIIIIIl[4];
    }
    
    private static boolean llIIIlllIlllIII(final int lllllllllllllIIllllIlIlIlIIlIIII, final int lllllllllllllIIllllIlIlIlIIIllll) {
        return lllllllllllllIIllllIlIlIlIIlIIII == lllllllllllllIIllllIlIlIlIIIllll;
    }
    
    static {
        llIIIlllIllIIII();
        llIIIlllIlIlIll();
        LEGACY_DATA = PropertyInteger.create(BlockFlowerPot.lIIIlllIllllIl[BlockFlowerPot.lIIIllllIIIIIl[0]], BlockFlowerPot.lIIIllllIIIIIl[0], BlockFlowerPot.lIIIllllIIIIIl[1]);
        CONTENTS = PropertyEnum.create(BlockFlowerPot.lIIIlllIllllIl[BlockFlowerPot.lIIIllllIIIIIl[2]], EnumFlowerType.class);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType = BlockFlowerPot.$SWITCH_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType;
        if (llIIIlllIllIIlI($switch_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType)) {
            return $switch_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType;
        }
        "".length();
        final Exception lllllllllllllIIllllIlIlIllIIIlIl = (Object)new int[BlockFlower.EnumFlowerType.values().length];
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.ALLIUM.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[8];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.BLUE_ORCHID.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[4];
            "".length();
            if (((0x25 ^ 0xA) & ~(0x55 ^ 0x7A) & ~((0x44 ^ 0x3) & ~(0x87 ^ 0xC0))) > ((0x4D ^ 0x5A) & ~(0x3C ^ 0x2B))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.DANDELION.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[2];
            "".length();
            if ((0x61 ^ 0x7D ^ (0x59 ^ 0x41)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.HOUSTONIA.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.ORANGE_TULIP.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[9];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.OXEYE_DAISY.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[10];
            "".length();
            if (((172 + 138 - 200 + 76 ^ 142 + 12 - 87 + 81) & (0xDE ^ 0xAB ^ (0xD5 ^ 0x8E) ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.PINK_TULIP.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[11];
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.POPPY.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[3];
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.RED_TULIP.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[7];
            "".length();
            if ((0x4F ^ 0x4B) == -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIlIllIIIlIl[BlockFlower.EnumFlowerType.WHITE_TULIP.ordinal()] = BlockFlowerPot.lIIIllllIIIIIl[12];
            "".length();
            if (" ".length() <= ((107 + 104 - 180 + 97 ^ 137 + 4 + 37 + 4) & (186 + 36 - 95 + 117 ^ 169 + 50 - 175 + 150 ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError10) {
            "".length();
        }
        return BlockFlowerPot.$SWITCH_TABLE$net$minecraft$block$BlockFlower$EnumFlowerType = (int[])(Object)lllllllllllllIIllllIlIlIllIIIlIl;
    }
    
    public enum EnumFlowerType implements IStringSerializable
    {
        FERN(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[40]], EnumFlowerType.lIIIlIllIlIIlI[20], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[41]]), 
        DARK_OAK_SAPLING(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[32]], EnumFlowerType.lIIIlIllIlIIlI[16], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[33]]), 
        ORANGE_TULIP(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[12]], EnumFlowerType.lIIIlIllIlIIlI[6], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[13]]), 
        BLUE_ORCHID(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[4]], EnumFlowerType.lIIIlIllIlIIlI[2], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[5]]);
        
        private final /* synthetic */ String name;
        private static final /* synthetic */ int[] lIIIlIllIlIIlI;
        
        ALLIUM(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[6]], EnumFlowerType.lIIIlIllIlIIlI[3], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[7]]), 
        ACACIA_SAPLING(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[30]], EnumFlowerType.lIIIlIllIlIIlI[15], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[31]]), 
        BIRCH_SAPLING(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[26]], EnumFlowerType.lIIIlIllIlIIlI[13], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[27]]);
        
        private static final /* synthetic */ String[] lIIIlIllIIIlll;
        
        OAK_SAPLING(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[22]], EnumFlowerType.lIIIlIllIlIIlI[11], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[23]]), 
        WHITE_TULIP(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[14]], EnumFlowerType.lIIIlIllIlIIlI[7], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[15]]), 
        POPPY(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[2]], EnumFlowerType.lIIIlIllIlIIlI[1], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[3]]), 
        RED_TULIP(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[10]], EnumFlowerType.lIIIlIllIlIIlI[5], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[11]]), 
        MUSHROOM_BROWN(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[36]], EnumFlowerType.lIIIlIllIlIIlI[18], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[37]]), 
        HOUSTONIA(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[8]], EnumFlowerType.lIIIlIllIlIIlI[4], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[9]]), 
        DANDELION(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[20]], EnumFlowerType.lIIIlIllIlIIlI[10], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[21]]), 
        CACTUS(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[42]], EnumFlowerType.lIIIlIllIlIIlI[21], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[43]]), 
        OXEYE_DAISY(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[18]], EnumFlowerType.lIIIlIllIlIIlI[9], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[19]]), 
        EMPTY(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[0]], EnumFlowerType.lIIIlIllIlIIlI[0], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[1]]), 
        PINK_TULIP(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[16]], EnumFlowerType.lIIIlIllIlIIlI[8], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[17]]), 
        SPRUCE_SAPLING(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[24]], EnumFlowerType.lIIIlIllIlIIlI[12], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[25]]), 
        JUNGLE_SAPLING(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[28]], EnumFlowerType.lIIIlIllIlIIlI[14], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[29]]), 
        MUSHROOM_RED(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[34]], EnumFlowerType.lIIIlIllIlIIlI[17], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[35]]), 
        DEAD_BUSH(EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[38]], EnumFlowerType.lIIIlIllIlIIlI[19], EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[39]]);
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static void llIIIIIlllIIIlI() {
            (lIIIlIllIlIIlI = new int[45])[0] = ((0x90 ^ 0xAB) & ~(0xE ^ 0x35));
            EnumFlowerType.lIIIlIllIlIIlI[1] = " ".length();
            EnumFlowerType.lIIIlIllIlIIlI[2] = "  ".length();
            EnumFlowerType.lIIIlIllIlIIlI[3] = "   ".length();
            EnumFlowerType.lIIIlIllIlIIlI[4] = (175 + 78 - 240 + 179 ^ 125 + 78 - 118 + 111);
            EnumFlowerType.lIIIlIllIlIIlI[5] = (0x9E ^ 0x9B);
            EnumFlowerType.lIIIlIllIlIIlI[6] = (0x21 ^ 0x27);
            EnumFlowerType.lIIIlIllIlIIlI[7] = (0x63 ^ 0x64);
            EnumFlowerType.lIIIlIllIlIIlI[8] = (0xE ^ 0x6);
            EnumFlowerType.lIIIlIllIlIIlI[9] = (0xAD ^ 0xB1 ^ (0xD1 ^ 0xC4));
            EnumFlowerType.lIIIlIllIlIIlI[10] = (0x43 ^ 0x54 ^ (0x68 ^ 0x75));
            EnumFlowerType.lIIIlIllIlIIlI[11] = (0x11 ^ 0x39 ^ (0xAE ^ 0x8D));
            EnumFlowerType.lIIIlIllIlIIlI[12] = (0x67 ^ 0x1B ^ (0xE ^ 0x7E));
            EnumFlowerType.lIIIlIllIlIIlI[13] = (39 + 62 + 39 + 50 ^ 178 + 26 - 52 + 27);
            EnumFlowerType.lIIIlIllIlIIlI[14] = (0x1D ^ 0x13);
            EnumFlowerType.lIIIlIllIlIIlI[15] = (0x6C ^ 0x63);
            EnumFlowerType.lIIIlIllIlIIlI[16] = (0x27 ^ 0x37);
            EnumFlowerType.lIIIlIllIlIIlI[17] = (0x3E ^ 0x1A ^ (0x73 ^ 0x46));
            EnumFlowerType.lIIIlIllIlIIlI[18] = (0x75 ^ 0x67);
            EnumFlowerType.lIIIlIllIlIIlI[19] = (0x8 ^ 0x1B);
            EnumFlowerType.lIIIlIllIlIIlI[20] = (101 + 43 - 112 + 99 ^ 97 + 26 - 5 + 33);
            EnumFlowerType.lIIIlIllIlIIlI[21] = (0x3D ^ 0x28);
            EnumFlowerType.lIIIlIllIlIIlI[22] = (0x65 ^ 0x73);
            EnumFlowerType.lIIIlIllIlIIlI[23] = (0x7E ^ 0x79 ^ (0x5F ^ 0x4F));
            EnumFlowerType.lIIIlIllIlIIlI[24] = (0xDD ^ 0xC5);
            EnumFlowerType.lIIIlIllIlIIlI[25] = (108 + 41 - 137 + 127 ^ 103 + 51 - 25 + 17);
            EnumFlowerType.lIIIlIllIlIIlI[26] = (0x48 ^ 0x52);
            EnumFlowerType.lIIIlIllIlIIlI[27] = (0x50 ^ 0x1 ^ (0x4A ^ 0x0));
            EnumFlowerType.lIIIlIllIlIIlI[28] = (0x24 ^ 0x38);
            EnumFlowerType.lIIIlIllIlIIlI[29] = (0x20 ^ 0x3D);
            EnumFlowerType.lIIIlIllIlIIlI[30] = (0x80 ^ 0xAE ^ (0x8E ^ 0xBE));
            EnumFlowerType.lIIIlIllIlIIlI[31] = (0x79 ^ 0x43 ^ (0x1C ^ 0x39));
            EnumFlowerType.lIIIlIllIlIIlI[32] = (0xAE ^ 0x8E);
            EnumFlowerType.lIIIlIllIlIIlI[33] = (0x33 ^ 0x34 ^ (0x62 ^ 0x44));
            EnumFlowerType.lIIIlIllIlIIlI[34] = (69 + 9 - 10 + 66 ^ 72 + 48 - 49 + 93);
            EnumFlowerType.lIIIlIllIlIIlI[35] = (0x2D ^ 0xE);
            EnumFlowerType.lIIIlIllIlIIlI[36] = (0x4C ^ 0x68);
            EnumFlowerType.lIIIlIllIlIIlI[37] = (0xB5 ^ 0x8F ^ (0x6C ^ 0x73));
            EnumFlowerType.lIIIlIllIlIIlI[38] = (0x42 ^ 0x64);
            EnumFlowerType.lIIIlIllIlIIlI[39] = (0xA7 ^ 0x81 ^ " ".length());
            EnumFlowerType.lIIIlIllIlIIlI[40] = (0x8 ^ 0x20);
            EnumFlowerType.lIIIlIllIlIIlI[41] = (0x83 ^ 0xAA);
            EnumFlowerType.lIIIlIllIlIIlI[42] = (0x48 ^ 0x6A ^ (0x5E ^ 0x56));
            EnumFlowerType.lIIIlIllIlIIlI[43] = (0x7F ^ 0x20 ^ (0x7F ^ 0xB));
            EnumFlowerType.lIIIlIllIlIIlI[44] = (24 + 138 - 137 + 143 ^ 105 + 73 - 129 + 83);
        }
        
        private EnumFlowerType(final String lllllllllllllIlIIIIlIllIllIIIlII, final int lllllllllllllIlIIIIlIllIllIIIIll, final String lllllllllllllIlIIIIlIllIllIIIllI) {
            this.name = lllllllllllllIlIIIIlIllIllIIIllI;
        }
        
        private static String llIIIIIllIlIIlI(String lllllllllllllIlIIIIlIllIlIIlIlll, final String lllllllllllllIlIIIIlIllIlIIlIllI) {
            lllllllllllllIlIIIIlIllIlIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIlIllIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIIlIllIlIIllIlI = new StringBuilder();
            final char[] lllllllllllllIlIIIIlIllIlIIllIIl = lllllllllllllIlIIIIlIllIlIIlIllI.toCharArray();
            int lllllllllllllIlIIIIlIllIlIIllIII = EnumFlowerType.lIIIlIllIlIIlI[0];
            final long lllllllllllllIlIIIIlIllIlIIlIIlI = (Object)lllllllllllllIlIIIIlIllIlIIlIlll.toCharArray();
            final double lllllllllllllIlIIIIlIllIlIIlIIIl = lllllllllllllIlIIIIlIllIlIIlIIlI.length;
            byte lllllllllllllIlIIIIlIllIlIIlIIII = (byte)EnumFlowerType.lIIIlIllIlIIlI[0];
            while (llIIIIIlllIIIll(lllllllllllllIlIIIIlIllIlIIlIIII, (int)lllllllllllllIlIIIIlIllIlIIlIIIl)) {
                final char lllllllllllllIlIIIIlIllIlIIlllIl = lllllllllllllIlIIIIlIllIlIIlIIlI[lllllllllllllIlIIIIlIllIlIIlIIII];
                lllllllllllllIlIIIIlIllIlIIllIlI.append((char)(lllllllllllllIlIIIIlIllIlIIlllIl ^ lllllllllllllIlIIIIlIllIlIIllIIl[lllllllllllllIlIIIIlIllIlIIllIII % lllllllllllllIlIIIIlIllIlIIllIIl.length]));
                "".length();
                ++lllllllllllllIlIIIIlIllIlIIllIII;
                ++lllllllllllllIlIIIIlIllIlIIlIIII;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIIlIllIlIIllIlI);
        }
        
        static {
            llIIIIIlllIIIlI();
            llIIIIIlllIIIII();
            final EnumFlowerType[] enum$VALUES = new EnumFlowerType[EnumFlowerType.lIIIlIllIlIIlI[22]];
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[0]] = EnumFlowerType.EMPTY;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[1]] = EnumFlowerType.POPPY;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[2]] = EnumFlowerType.BLUE_ORCHID;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[3]] = EnumFlowerType.ALLIUM;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[4]] = EnumFlowerType.HOUSTONIA;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[5]] = EnumFlowerType.RED_TULIP;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[6]] = EnumFlowerType.ORANGE_TULIP;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[7]] = EnumFlowerType.WHITE_TULIP;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[8]] = EnumFlowerType.PINK_TULIP;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[9]] = EnumFlowerType.OXEYE_DAISY;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[10]] = EnumFlowerType.DANDELION;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[11]] = EnumFlowerType.OAK_SAPLING;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[12]] = EnumFlowerType.SPRUCE_SAPLING;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[13]] = EnumFlowerType.BIRCH_SAPLING;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[14]] = EnumFlowerType.JUNGLE_SAPLING;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[15]] = EnumFlowerType.ACACIA_SAPLING;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[16]] = EnumFlowerType.DARK_OAK_SAPLING;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[17]] = EnumFlowerType.MUSHROOM_RED;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[18]] = EnumFlowerType.MUSHROOM_BROWN;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[19]] = EnumFlowerType.DEAD_BUSH;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[20]] = EnumFlowerType.FERN;
            enum$VALUES[EnumFlowerType.lIIIlIllIlIIlI[21]] = EnumFlowerType.CACTUS;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean llIIIIIlllIIIll(final int lllllllllllllIlIIIIlIllIIlllllll, final int lllllllllllllIlIIIIlIllIIllllllI) {
            return lllllllllllllIlIIIIlIllIIlllllll < lllllllllllllIlIIIIlIllIIllllllI;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String llIIIIIllIlIIII(final String lllllllllllllIlIIIIlIllIlIlIllII, final String lllllllllllllIlIIIIlIllIlIlIlIll) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIlIllIlIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIllIlIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIIlIllIlIlIlllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIIlIllIlIlIlllI.init(EnumFlowerType.lIIIlIllIlIIlI[2], lllllllllllllIlIIIIlIllIlIlIllll);
                return new String(lllllllllllllIlIIIIlIllIlIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIllIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIlIllIlIlIllIl) {
                lllllllllllllIlIIIIlIllIlIlIllIl.printStackTrace();
                return null;
            }
        }
        
        private static String llIIIIIllIlIIIl(final String lllllllllllllIlIIIIlIllIlIIIIlll, final String lllllllllllllIlIIIIlIllIlIIIIllI) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIlIllIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIllIlIIIIllI.getBytes(StandardCharsets.UTF_8)), EnumFlowerType.lIIIlIllIlIIlI[8]), "DES");
                final Cipher lllllllllllllIlIIIIlIllIlIIIlIIl = Cipher.getInstance("DES");
                lllllllllllllIlIIIIlIllIlIIIlIIl.init(EnumFlowerType.lIIIlIllIlIIlI[2], lllllllllllllIlIIIIlIllIlIIIlIlI);
                return new String(lllllllllllllIlIIIIlIllIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIllIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIlIllIlIIIlIII) {
                lllllllllllllIlIIIIlIllIlIIIlIII.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIIIlllIIIII() {
            (lIIIlIllIIIlll = new String[EnumFlowerType.lIIIlIllIlIIlI[44]])[EnumFlowerType.lIIIlIllIlIIlI[0]] = llIIIIIllIlIIII("HLadnwiMbjY=", "gwbWJ");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[1]] = llIIIIIllIlIIIl("xH3gZbxF7WE=", "mrZMC");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[2]] = llIIIIIllIlIIIl("HTD9mU2paj8=", "OqujD");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[3]] = llIIIIIllIlIIIl("yHxrlCBL86I=", "kxMkn");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[4]] = llIIIIIllIlIIlI("BT0vCjsIIzkHLQM=", "GqzOd");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[5]] = llIIIIIllIlIIIl("flgBZ0REOT7Wh2dH2QwSCg==", "PFnfh");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[6]] = llIIIIIllIlIIII("AkXp43+CMI8=", "MjFLN");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[7]] = llIIIIIllIlIIII("pXQ5dZ5nFGI=", "IwtGR");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[8]] = llIIIIIllIlIIIl("nfaIWrGDfxl8J0Xx7gh2+Q==", "FCCaV");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[9]] = llIIIIIllIlIIlI("Ix4QARkkHwwT", "Kqerm");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[10]] = llIIIIIllIlIIII("qFLp8+f+Ub+0l+atcVyS/w==", "ZmfmY");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[11]] = llIIIIIllIlIIlI("ADAuFg4HOSM5", "rUJIz");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[12]] = llIIIIIllIlIIIl("Anri2NFj2c5nv3uYidTjcg==", "yYTIc");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[13]] = llIIIIIllIlIIlI("ITAUHQ4rHQEGBScy", "NBusi");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[14]] = llIIIIIllIlIIIl("2ZKSj09SbfEXSZzsQ13jkw==", "TEhbl");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[15]] = llIIIIIllIlIIII("nDCHYnHGQfuKZpsnKnL1ig==", "rUtqH");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[16]] = llIIIIIllIlIIIl("aoUhpoDdA+SGwu+TvHeCqw==", "gROzc");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[17]] = llIIIIIllIlIIII("2juHNdJF8nsHJPrywvE51Q==", "trcGm");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[18]] = llIIIIIllIlIIII("6yctTsLG/zXjgyVfLOE+WA==", "ZNFIb");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[19]] = llIIIIIllIlIIII("YUFKGuLWtmuyU+1pqdta6g==", "KICkT");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[20]] = llIIIIIllIlIIlI("Bi0LEjcOJQoY", "BlEVr");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[21]] = llIIIIIllIlIIIl("szoZFe/fszNviphiQGR9FA==", "JoVSM");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[22]] = llIIIIIllIlIIII("shjRZLnWk9m0dcKvAzzFnQ==", "eItPJ");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[23]] = llIIIIIllIlIIII("DG716XUyB+MHRJAwQtjH1g==", "JqUbl");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[24]] = llIIIIIllIlIIIl("clAIel6fGcpHdXoNfuF1MA==", "JmWug");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[25]] = llIIIIIllIlIIII("o95TF53lud0xZ4ctMoN1sQ==", "dJSHI");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[26]] = llIIIIIllIlIIlI("GxggGxwGAjMIGBAfNQ==", "YQrXT");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[27]] = llIIIIIllIlIIII("LE3xm69Hpmn1FETDhcwzZQ==", "hEgcc");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[28]] = llIIIIIllIlIIlI("CDgGMygHMhs1NA4kBjM=", "BmHtd");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[29]] = llIIIIIllIlIIII("i9HjkE7qYuZQbDjIQgq/LQ==", "kYwYQ");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[30]] = llIIIIIllIlIIlI("KS85CAApMysKGSQlNgw=", "hlxKI");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[31]] = llIIIIIllIlIIII("K4KKFsUY//SDZXs0ae4amg==", "HnyLe");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[32]] = llIIIIIllIlIIIl("XFPLU5HuOopqq/B/h1DySMTTcT0oqmEw", "llbIC");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[33]] = llIIIIIllIlIIlI("EBgKKTgbGBMdFBUJFCsJEw==", "tyxBg");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[34]] = llIIIIIllIlIIlI("CRQkDQELDjoaAQEF", "DAwES");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[35]] = llIIIIIllIlIIIl("fEpqfchwHA+OL676tAsbbQ==", "EiPXO");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[36]] = llIIIIIllIlIIlI("FAYqOTAWHDQuIAscLj8=", "YSyqb");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[37]] = llIIIIIllIlIIIl("xQpJN/6wDobIBXLn715Aiw==", "wuJGI");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[38]] = llIIIIIllIlIIII("D/tMbLwssoKxrdp9kPGaug==", "aniGK");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[39]] = llIIIIIllIlIIlI("Pi8bCRE4PwkF", "ZJzmN");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[40]] = llIIIIIllIlIIII("UsRtvnWAIDI=", "QqmKZ");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[41]] = llIIIIIllIlIIIl("UrdNJY8rW1M=", "ecYva");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[42]] = llIIIIIllIlIIII("o3Qo6wACQV8=", "UJWEe");
            EnumFlowerType.lIIIlIllIIIlll[EnumFlowerType.lIIIlIllIlIIlI[43]] = llIIIIIllIlIIII("OdyvX3Zpq7s=", "RiwEo");
        }
    }
}
