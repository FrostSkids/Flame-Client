// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.BlockDirt;

public class ItemHoe extends Item
{
    private static final /* synthetic */ int[] llIIIIIlIllIIl;
    protected /* synthetic */ ToolMaterial theToolMaterial;
    
    private static boolean lIIIIlllIlIIllII(final Object llllllllllllIlllIllllIIIIIIIIlII, final Object llllllllllllIlllIllllIIIIIIIIIll) {
        return llllllllllllIlllIllllIIIIIIIIlII == llllllllllllIlllIllllIIIIIIIIIll;
    }
    
    @Override
    public boolean isFull3D() {
        return ItemHoe.llIIIIIlIllIIl[0] != 0;
    }
    
    static {
        lIIIIlllIlIIlIIl();
    }
    
    private static boolean lIIIIlllIlIIlIll(final Object llllllllllllIlllIllllIIIIIIIlIII, final Object llllllllllllIlllIllllIIIIIIIIlll) {
        return llllllllllllIlllIllllIIIIIIIlIII != llllllllllllIlllIllllIIIIIIIIlll;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockDirt$DirtType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockDirt$DirtType = ItemHoe.$SWITCH_TABLE$net$minecraft$block$BlockDirt$DirtType;
        if (lIIIIlllIlIIlllI($switch_TABLE$net$minecraft$block$BlockDirt$DirtType)) {
            return $switch_TABLE$net$minecraft$block$BlockDirt$DirtType;
        }
        "".length();
        final long llllllllllllIlllIllllIIIIIIIlIll = (Object)new int[BlockDirt.DirtType.values().length];
        try {
            llllllllllllIlllIllllIIIIIIIlIll[BlockDirt.DirtType.COARSE_DIRT.ordinal()] = ItemHoe.llIIIIIlIllIIl[2];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIIIIIlIll[BlockDirt.DirtType.DIRT.ordinal()] = ItemHoe.llIIIIIlIllIIl[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIIIIIlIll[BlockDirt.DirtType.PODZOL.ordinal()] = ItemHoe.llIIIIIlIllIIl[3];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return ItemHoe.$SWITCH_TABLE$net$minecraft$block$BlockDirt$DirtType = (int[])(Object)llllllllllllIlllIllllIIIIIIIlIll;
    }
    
    private static void lIIIIlllIlIIlIIl() {
        (llIIIIIlIllIIl = new int[4])[0] = " ".length();
        ItemHoe.llIIIIIlIllIIl[1] = ((48 + 25 + 65 + 0 ^ 104 + 77 - 106 + 89) & (107 + 133 - 168 + 107 ^ 66 + 43 - 50 + 98 ^ -" ".length()));
        ItemHoe.llIIIIIlIllIIl[2] = "  ".length();
        ItemHoe.llIIIIIlIllIIl[3] = "   ".length();
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIlllIllllIIIIIllIIlI, final EntityPlayer llllllllllllIlllIllllIIIIIlIIllI, final World llllllllllllIlllIllllIIIIIlIIlIl, final BlockPos llllllllllllIlllIllllIIIIIlIllll, final EnumFacing llllllllllllIlllIllllIIIIIlIIIll, final float llllllllllllIlllIllllIIIIIlIllIl, final float llllllllllllIlllIllllIIIIIlIllII, final float llllllllllllIlllIllllIIIIIlIlIll) {
        if (lIIIIlllIlIIlIlI(llllllllllllIlllIllllIIIIIlIIllI.canPlayerEdit(llllllllllllIlllIllllIIIIIlIllll.offset(llllllllllllIlllIllllIIIIIlIIIll), llllllllllllIlllIllllIIIIIlIIIll, llllllllllllIlllIllllIIIIIllIIlI) ? 1 : 0)) {
            return ItemHoe.llIIIIIlIllIIl[1] != 0;
        }
        final IBlockState llllllllllllIlllIllllIIIIIlIlIlI = llllllllllllIlllIllllIIIIIlIIlIl.getBlockState(llllllllllllIlllIllllIIIIIlIllll);
        final Block llllllllllllIlllIllllIIIIIlIlIIl = llllllllllllIlllIllllIIIIIlIlIlI.getBlock();
        if (lIIIIlllIlIIlIll(llllllllllllIlllIllllIIIIIlIIIll, EnumFacing.DOWN) && lIIIIlllIlIIllII(llllllllllllIlllIllllIIIIIlIIlIl.getBlockState(llllllllllllIlllIllllIIIIIlIllll.up()).getBlock().getMaterial(), Material.air)) {
            if (lIIIIlllIlIIllII(llllllllllllIlllIllllIIIIIlIlIIl, Blocks.grass)) {
                return this.useHoe(llllllllllllIlllIllllIIIIIllIIlI, llllllllllllIlllIllllIIIIIlIIllI, llllllllllllIlllIllllIIIIIlIIlIl, llllllllllllIlllIllllIIIIIlIllll, Blocks.farmland.getDefaultState());
            }
            if (lIIIIlllIlIIllII(llllllllllllIlllIllllIIIIIlIlIIl, Blocks.dirt)) {
                switch ($SWITCH_TABLE$net$minecraft$block$BlockDirt$DirtType()[llllllllllllIlllIllllIIIIIlIlIlI.getValue(BlockDirt.VARIANT).ordinal()]) {
                    case 1: {
                        return this.useHoe(llllllllllllIlllIllllIIIIIllIIlI, llllllllllllIlllIllllIIIIIlIIllI, llllllllllllIlllIllllIIIIIlIIlIl, llllllllllllIlllIllllIIIIIlIllll, Blocks.farmland.getDefaultState());
                    }
                    case 2: {
                        return this.useHoe(llllllllllllIlllIllllIIIIIllIIlI, llllllllllllIlllIllllIIIIIlIIllI, llllllllllllIlllIllllIIIIIlIIlIl, llllllllllllIlllIllllIIIIIlIllll, Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                    }
                }
            }
        }
        return ItemHoe.llIIIIIlIllIIl[1] != 0;
    }
    
    private static boolean lIIIIlllIlIIlllI(final Object llllllllllllIlllIllllIIIIIIIIIIl) {
        return llllllllllllIlllIllllIIIIIIIIIIl != null;
    }
    
    public String getMaterialName() {
        return this.theToolMaterial.toString();
    }
    
    private static boolean lIIIIlllIlIIllIl(final int llllllllllllIlllIlllIlllllllllll) {
        return llllllllllllIlllIlllIlllllllllll != 0;
    }
    
    private static boolean lIIIIlllIlIIlIlI(final int llllllllllllIlllIlllIlllllllllIl) {
        return llllllllllllIlllIlllIlllllllllIl == 0;
    }
    
    public ItemHoe(final ToolMaterial llllllllllllIlllIllllIIIIIlllllI) {
        this.theToolMaterial = llllllllllllIlllIllllIIIIIlllllI;
        this.maxStackSize = ItemHoe.llIIIIIlIllIIl[0];
        this.setMaxDamage(llllllllllllIlllIllllIIIIIlllllI.getMaxUses());
        "".length();
        this.setCreativeTab(CreativeTabs.tabTools);
        "".length();
    }
    
    protected boolean useHoe(final ItemStack llllllllllllIlllIllllIIIIIIlIlIl, final EntityPlayer llllllllllllIlllIllllIIIIIIlIlII, final World llllllllllllIlllIllllIIIIIIllIII, final BlockPos llllllllllllIlllIllllIIIIIIlIlll, final IBlockState llllllllllllIlllIllllIIIIIIlIllI) {
        llllllllllllIlllIllllIIIIIIllIII.playSoundEffect(llllllllllllIlllIllllIIIIIIlIlll.getX() + 0.5f, llllllllllllIlllIllllIIIIIIlIlll.getY() + 0.5f, llllllllllllIlllIllllIIIIIIlIlll.getZ() + 0.5f, llllllllllllIlllIllllIIIIIIlIllI.getBlock().stepSound.getStepSound(), (llllllllllllIlllIllllIIIIIIlIllI.getBlock().stepSound.getVolume() + 1.0f) / 2.0f, llllllllllllIlllIllllIIIIIIlIllI.getBlock().stepSound.getFrequency() * 0.8f);
        if (lIIIIlllIlIIllIl(llllllllllllIlllIllllIIIIIIllIII.isRemote ? 1 : 0)) {
            return ItemHoe.llIIIIIlIllIIl[0] != 0;
        }
        llllllllllllIlllIllllIIIIIIllIII.setBlockState(llllllllllllIlllIllllIIIIIIlIlll, llllllllllllIlllIllllIIIIIIlIllI);
        "".length();
        llllllllllllIlllIllllIIIIIIlIlIl.damageItem(ItemHoe.llIIIIIlIllIIl[0], llllllllllllIlllIllllIIIIIIlIlII);
        return ItemHoe.llIIIIIlIllIIl[0] != 0;
    }
}
