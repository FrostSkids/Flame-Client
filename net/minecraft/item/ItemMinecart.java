// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.dispenser.IBehaviorDispenseItem;

public class ItemMinecart extends Item
{
    private static final /* synthetic */ IBehaviorDispenseItem dispenserMinecartBehavior;
    private static final /* synthetic */ int[] lllIlllIlIIIll;
    private final /* synthetic */ EntityMinecart.EnumMinecartType minecartType;
    
    static {
        lIlIIlIllIlIlIlI();
        dispenserMinecartBehavior = new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] llIlIIIllIlllI;
            private final /* synthetic */ BehaviorDefaultDispenseItem behaviourDefaultDispenseItem = new BehaviorDefaultDispenseItem();
            
            private static boolean lIIlIIlIIIIlllll(final int llllllllllllIllIllIIlIllllIIIIll) {
                return llllllllllllIllIllIIlIllllIIIIll == 0;
            }
            
            private static boolean lIIlIIlIIIlIIIII(final Object llllllllllllIllIllIIlIllllIIllII, final Object llllllllllllIllIllIIlIllllIIlIll) {
                return llllllllllllIllIllIIlIllllIIllII != llllllllllllIllIllIIlIllllIIlIll;
            }
            
            public ItemStack dispenseStack(final IBlockSource llllllllllllIllIllIIlIllllIlllll, final ItemStack llllllllllllIllIllIIlIllllIllllI) {
                final EnumFacing llllllllllllIllIllIIlIlllllIllll = BlockDispenser.getFacing(llllllllllllIllIllIIlIllllIlllll.getBlockMetadata());
                final World llllllllllllIllIllIIlIlllllIlllI = llllllllllllIllIllIIlIllllIlllll.getWorld();
                final double llllllllllllIllIllIIlIlllllIllIl = llllllllllllIllIllIIlIllllIlllll.getX() + llllllllllllIllIllIIlIlllllIllll.getFrontOffsetX() * 1.125;
                final double llllllllllllIllIllIIlIlllllIllII = Math.floor(llllllllllllIllIllIIlIllllIlllll.getY()) + llllllllllllIllIllIIlIlllllIllll.getFrontOffsetY();
                final double llllllllllllIllIllIIlIlllllIlIll = llllllllllllIllIllIIlIllllIlllll.getZ() + llllllllllllIllIllIIlIlllllIllll.getFrontOffsetZ() * 1.125;
                final BlockPos llllllllllllIllIllIIlIlllllIlIlI = llllllllllllIllIllIIlIllllIlllll.getBlockPos().offset(llllllllllllIllIllIIlIlllllIllll);
                final IBlockState llllllllllllIllIllIIlIlllllIlIIl = llllllllllllIllIllIIlIlllllIlllI.getBlockState(llllllllllllIllIllIIlIlllllIlIlI);
                BlockRailBase.EnumRailDirection north_SOUTH;
                if (lIIlIIlIIIIlllIl((llllllllllllIllIllIIlIlllllIlIIl.getBlock() instanceof BlockRailBase) ? 1 : 0)) {
                    north_SOUTH = llllllllllllIllIllIIlIlllllIlIIl.getValue(((BlockRailBase)llllllllllllIllIllIIlIlllllIlIIl.getBlock()).getShapeProperty());
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return null;
                    }
                }
                else {
                    north_SOUTH = BlockRailBase.EnumRailDirection.NORTH_SOUTH;
                }
                final BlockRailBase.EnumRailDirection llllllllllllIllIllIIlIlllllIlIII = north_SOUTH;
                double llllllllllllIllIllIIlIlllllIIlII = 0.0;
                if (lIIlIIlIIIIlllIl(BlockRailBase.isRailBlock(llllllllllllIllIllIIlIlllllIlIIl) ? 1 : 0)) {
                    if (lIIlIIlIIIIlllIl(llllllllllllIllIllIIlIlllllIlIII.isAscending() ? 1 : 0)) {
                        final double llllllllllllIllIllIIlIlllllIIlll = 0.6;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else {
                        final double llllllllllllIllIllIIlIlllllIIllI = 0.1;
                        "".length();
                        if ("   ".length() < "  ".length()) {
                            return null;
                        }
                    }
                }
                else {
                    if (!lIIlIIlIIIIllllI(llllllllllllIllIllIIlIlllllIlIIl.getBlock().getMaterial(), Material.air) || lIIlIIlIIIIlllll(BlockRailBase.isRailBlock(llllllllllllIllIllIIlIlllllIlllI.getBlockState(llllllllllllIllIllIIlIlllllIlIlI.down())) ? 1 : 0)) {
                        return this.behaviourDefaultDispenseItem.dispense(llllllllllllIllIllIIlIllllIlllll, llllllllllllIllIllIIlIllllIllllI);
                    }
                    final IBlockState llllllllllllIllIllIIlIlllllIIIll = llllllllllllIllIllIIlIlllllIlllI.getBlockState(llllllllllllIllIllIIlIlllllIlIlI.down());
                    BlockRailBase.EnumRailDirection north_SOUTH2;
                    if (lIIlIIlIIIIlllIl((llllllllllllIllIllIIlIlllllIIIll.getBlock() instanceof BlockRailBase) ? 1 : 0)) {
                        north_SOUTH2 = llllllllllllIllIllIIlIlllllIIIll.getValue(((BlockRailBase)llllllllllllIllIllIIlIlllllIIIll.getBlock()).getShapeProperty());
                        "".length();
                        if ("   ".length() == 0) {
                            return null;
                        }
                    }
                    else {
                        north_SOUTH2 = BlockRailBase.EnumRailDirection.NORTH_SOUTH;
                    }
                    final BlockRailBase.EnumRailDirection llllllllllllIllIllIIlIlllllIIIlI = north_SOUTH2;
                    if (lIIlIIlIIIlIIIII(llllllllllllIllIllIIlIlllllIllll, EnumFacing.DOWN) && lIIlIIlIIIIlllIl(llllllllllllIllIllIIlIlllllIIIlI.isAscending() ? 1 : 0)) {
                        final double llllllllllllIllIllIIlIlllllIIlIl = -0.4;
                        "".length();
                        if (" ".length() < " ".length()) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIllIllIIlIlllllIIlII = -0.9;
                    }
                }
                final EntityMinecart llllllllllllIllIllIIlIlllllIIIIl = EntityMinecart.func_180458_a(llllllllllllIllIllIIlIlllllIlllI, llllllllllllIllIllIIlIlllllIllIl, llllllllllllIllIllIIlIlllllIllII + llllllllllllIllIllIIlIlllllIIlII, llllllllllllIllIllIIlIlllllIlIll, ((ItemMinecart)llllllllllllIllIllIIlIllllIllllI.getItem()).minecartType);
                if (lIIlIIlIIIIlllIl(llllllllllllIllIllIIlIllllIllllI.hasDisplayName() ? 1 : 0)) {
                    llllllllllllIllIllIIlIlllllIIIIl.setCustomNameTag(llllllllllllIllIllIIlIllllIllllI.getDisplayName());
                }
                llllllllllllIllIllIIlIlllllIlllI.spawnEntityInWorld(llllllllllllIllIllIIlIlllllIIIIl);
                "".length();
                llllllllllllIllIllIIlIllllIllllI.splitStack(ItemMinecart$1.llIlIIIllIlllI[0]);
                "".length();
                return llllllllllllIllIllIIlIllllIllllI;
            }
            
            private static void lIIlIIlIIIIlllII() {
                (llIlIIIllIlllI = new int[3])[0] = " ".length();
                ItemMinecart$1.llIlIIIllIlllI[1] = (-(0xFFFFBEED & 0x751A) & (0xFFFFBFEF & 0x77FF));
                ItemMinecart$1.llIlIIIllIlllI[2] = ((0x12 ^ 0x14) & ~(0x36 ^ 0x30));
            }
            
            private static boolean lIIlIIlIIIIlllIl(final int llllllllllllIllIllIIlIllllIIIlIl) {
                return llllllllllllIllIllIIlIllllIIIlIl != 0;
            }
            
            @Override
            protected void playDispenseSound(final IBlockSource llllllllllllIllIllIIlIllllIIllll) {
                llllllllllllIllIllIIlIllllIIllll.getWorld().playAuxSFX(ItemMinecart$1.llIlIIIllIlllI[1], llllllllllllIllIllIIlIllllIIllll.getBlockPos(), ItemMinecart$1.llIlIIIllIlllI[2]);
            }
            
            static {
                lIIlIIlIIIIlllII();
            }
            
            private static boolean lIIlIIlIIIIllllI(final Object llllllllllllIllIllIIlIllllIIlIII, final Object llllllllllllIllIllIIlIllllIIIlll) {
                return llllllllllllIllIllIIlIllllIIlIII == llllllllllllIllIllIIlIllllIIIlll;
            }
        };
    }
    
    private static boolean lIlIIlIllIlIllII(final int llllllllllllIlIllIIIIlIIlllIIlll) {
        return llllllllllllIlIllIIIIlIIlllIIlll == 0;
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIlIllIIIIlIIllllllII, final EntityPlayer llllllllllllIlIllIIIIlIlIIIIllll, final World llllllllllllIlIllIIIIlIlIIIIllIl, final BlockPos llllllllllllIlIllIIIIlIlIIIIlIll, final EnumFacing llllllllllllIlIllIIIIlIlIIIIlIlI, final float llllllllllllIlIllIIIIlIlIIIIlIIl, final float llllllllllllIlIllIIIIlIlIIIIIlll, final float llllllllllllIlIllIIIIlIlIIIIIlIl) {
        final IBlockState llllllllllllIlIllIIIIlIlIIIIIlII = llllllllllllIlIllIIIIlIlIIIIllIl.getBlockState(llllllllllllIlIllIIIIlIlIIIIlIll);
        if (lIlIIlIllIlIlIll(BlockRailBase.isRailBlock(llllllllllllIlIllIIIIlIlIIIIIlII) ? 1 : 0)) {
            if (lIlIIlIllIlIllII(llllllllllllIlIllIIIIlIlIIIIllIl.isRemote ? 1 : 0)) {
                BlockRailBase.EnumRailDirection north_SOUTH;
                if (lIlIIlIllIlIlIll((llllllllllllIlIllIIIIlIlIIIIIlII.getBlock() instanceof BlockRailBase) ? 1 : 0)) {
                    north_SOUTH = llllllllllllIlIllIIIIlIlIIIIIlII.getValue(((BlockRailBase)llllllllllllIlIllIIIIlIlIIIIIlII.getBlock()).getShapeProperty());
                    "".length();
                    if (((0xC1 ^ 0x8E) & ~(0x65 ^ 0x2A)) != 0x0) {
                        return ((0x53 ^ 0x1F) & ~(0xE2 ^ 0xAE)) != 0x0;
                    }
                }
                else {
                    north_SOUTH = BlockRailBase.EnumRailDirection.NORTH_SOUTH;
                }
                final BlockRailBase.EnumRailDirection llllllllllllIlIllIIIIlIlIIIIIIll = north_SOUTH;
                double llllllllllllIlIllIIIIlIlIIIIIIIl = 0.0;
                if (lIlIIlIllIlIlIll(llllllllllllIlIllIIIIlIlIIIIIIll.isAscending() ? 1 : 0)) {
                    llllllllllllIlIllIIIIlIlIIIIIIIl = 0.5;
                }
                final EntityMinecart llllllllllllIlIllIIIIlIIllllllll = EntityMinecart.func_180458_a(llllllllllllIlIllIIIIlIlIIIIllIl, llllllllllllIlIllIIIIlIlIIIIlIll.getX() + 0.5, llllllllllllIlIllIIIIlIlIIIIlIll.getY() + 0.0625 + llllllllllllIlIllIIIIlIlIIIIIIIl, llllllllllllIlIllIIIIlIlIIIIlIll.getZ() + 0.5, this.minecartType);
                if (lIlIIlIllIlIlIll(llllllllllllIlIllIIIIlIIllllllII.hasDisplayName() ? 1 : 0)) {
                    llllllllllllIlIllIIIIlIIllllllll.setCustomNameTag(llllllllllllIlIllIIIIlIIllllllII.getDisplayName());
                }
                llllllllllllIlIllIIIIlIlIIIIllIl.spawnEntityInWorld(llllllllllllIlIllIIIIlIIllllllll);
                "".length();
            }
            llllllllllllIlIllIIIIlIIllllllII.stackSize -= ItemMinecart.lllIlllIlIIIll[0];
            return ItemMinecart.lllIlllIlIIIll[0] != 0;
        }
        return ItemMinecart.lllIlllIlIIIll[1] != 0;
    }
    
    private static void lIlIIlIllIlIlIlI() {
        (lllIlllIlIIIll = new int[2])[0] = " ".length();
        ItemMinecart.lllIlllIlIIIll[1] = ((0x7F ^ 0x5E) & ~(0x27 ^ 0x6));
    }
    
    public ItemMinecart(final EntityMinecart.EnumMinecartType llllllllllllIlIllIIIIlIlIIlIlIIl) {
        this.maxStackSize = ItemMinecart.lllIlllIlIIIll[0];
        this.minecartType = llllllllllllIlIllIIIIlIlIIlIlIIl;
        this.setCreativeTab(CreativeTabs.tabTransport);
        "".length();
        BlockDispenser.dispenseBehaviorRegistry.putObject(this, ItemMinecart.dispenserMinecartBehavior);
    }
    
    private static boolean lIlIIlIllIlIlIll(final int llllllllllllIlIllIIIIlIIlllIlIll) {
        return llllllllllllIlIllIIIIlIIlllIlIll != 0;
    }
}
