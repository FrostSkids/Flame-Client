// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public class BlockRedstoneLight extends Block
{
    private static final /* synthetic */ int[] llllIlllIIllI;
    private final /* synthetic */ boolean isOn;
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIllIIlIIIllIlIIII, final Random lllllllllllllIlIllIIlIIIllIIllll, final int lllllllllllllIlIllIIlIIIllIIlllI) {
        return Item.getItemFromBlock(Blocks.redstone_lamp);
    }
    
    static {
        lIlIllIIIIIllIl();
    }
    
    private static boolean lIlIllIIIIIllll(final int lllllllllllllIlIllIIlIIIllIIIlIl) {
        return lllllllllllllIlIllIIlIIIllIIIlIl == 0;
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState lllllllllllllIlIllIIlIIIllIIlIIl) {
        return new ItemStack(Blocks.redstone_lamp);
    }
    
    private static void lIlIllIIIIIllIl() {
        (llllIlllIIllI = new int[2])[0] = "  ".length();
        BlockRedstoneLight.llllIlllIIllI[1] = (0xFF ^ 0x91 ^ (0xDC ^ 0xB6));
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIllIIlIIIllIIllII, final BlockPos lllllllllllllIlIllIIlIIIllIIlIll) {
        return Item.getItemFromBlock(Blocks.redstone_lamp);
    }
    
    private static boolean lIlIllIIIIIlllI(final int lllllllllllllIlIllIIlIIIllIIIlll) {
        return lllllllllllllIlIllIIlIIIllIIIlll != 0;
    }
    
    public BlockRedstoneLight(final boolean lllllllllllllIlIllIIlIIIllllIIlI) {
        super(Material.redstoneLight);
        this.isOn = lllllllllllllIlIllIIlIIIllllIIlI;
        if (lIlIllIIIIIlllI(lllllllllllllIlIllIIlIIIllllIIlI ? 1 : 0)) {
            this.setLightLevel(1.0f);
            "".length();
        }
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIllIIlIIIllIllIII, final BlockPos lllllllllllllIlIllIIlIIIllIlIlll, final IBlockState lllllllllllllIlIllIIlIIIllIlIllI, final Random lllllllllllllIlIllIIlIIIllIlIlIl) {
        if (lIlIllIIIIIllll(lllllllllllllIlIllIIlIIIllIllIII.isRemote ? 1 : 0) && lIlIllIIIIIlllI(this.isOn ? 1 : 0) && lIlIllIIIIIllll(lllllllllllllIlIllIIlIIIllIllIII.isBlockPowered(lllllllllllllIlIllIIlIIIllIlIlll) ? 1 : 0)) {
            lllllllllllllIlIllIIlIIIllIllIII.setBlockState(lllllllllllllIlIllIIlIIIllIlIlll, Blocks.redstone_lamp.getDefaultState(), BlockRedstoneLight.llllIlllIIllI[0]);
            "".length();
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIllIIlIIIllIllllI, final BlockPos lllllllllllllIlIllIIlIIIlllIIIlI, final IBlockState lllllllllllllIlIllIIlIIIlllIIIIl, final Block lllllllllllllIlIllIIlIIIlllIIIII) {
        if (lIlIllIIIIIllll(lllllllllllllIlIllIIlIIIllIllllI.isRemote ? 1 : 0)) {
            if (lIlIllIIIIIlllI(this.isOn ? 1 : 0) && lIlIllIIIIIllll(lllllllllllllIlIllIIlIIIllIllllI.isBlockPowered(lllllllllllllIlIllIIlIIIlllIIIlI) ? 1 : 0)) {
                lllllllllllllIlIllIIlIIIllIllllI.scheduleUpdate(lllllllllllllIlIllIIlIIIlllIIIlI, this, BlockRedstoneLight.llllIlllIIllI[1]);
                "".length();
                if ((0x8F ^ 0x8B) <= 0) {
                    return;
                }
            }
            else if (lIlIllIIIIIllll(this.isOn ? 1 : 0) && lIlIllIIIIIlllI(lllllllllllllIlIllIIlIIIllIllllI.isBlockPowered(lllllllllllllIlIllIIlIIIlllIIIlI) ? 1 : 0)) {
                lllllllllllllIlIllIIlIIIllIllllI.setBlockState(lllllllllllllIlIllIIlIIIlllIIIlI, Blocks.lit_redstone_lamp.getDefaultState(), BlockRedstoneLight.llllIlllIIllI[0]);
                "".length();
            }
        }
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIllIIlIIIlllIlIIl, final BlockPos lllllllllllllIlIllIIlIIIlllIllII, final IBlockState lllllllllllllIlIllIIlIIIlllIlIll) {
        if (lIlIllIIIIIllll(lllllllllllllIlIllIIlIIIlllIlIIl.isRemote ? 1 : 0)) {
            if (lIlIllIIIIIlllI(this.isOn ? 1 : 0) && lIlIllIIIIIllll(lllllllllllllIlIllIIlIIIlllIlIIl.isBlockPowered(lllllllllllllIlIllIIlIIIlllIllII) ? 1 : 0)) {
                lllllllllllllIlIllIIlIIIlllIlIIl.setBlockState(lllllllllllllIlIllIIlIIIlllIllII, Blocks.redstone_lamp.getDefaultState(), BlockRedstoneLight.llllIlllIIllI[0]);
                "".length();
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else if (lIlIllIIIIIllll(this.isOn ? 1 : 0) && lIlIllIIIIIlllI(lllllllllllllIlIllIIlIIIlllIlIIl.isBlockPowered(lllllllllllllIlIllIIlIIIlllIllII) ? 1 : 0)) {
                lllllllllllllIlIllIIlIIIlllIlIIl.setBlockState(lllllllllllllIlIllIIlIIIlllIllII, Blocks.lit_redstone_lamp.getDefaultState(), BlockRedstoneLight.llllIlllIIllI[0]);
                "".length();
            }
        }
    }
}
