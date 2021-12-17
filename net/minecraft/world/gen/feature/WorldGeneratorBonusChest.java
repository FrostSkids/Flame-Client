// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.util.WeightedRandomChestContent;
import java.util.List;

public class WorldGeneratorBonusChest extends WorldGenerator
{
    private final /* synthetic */ List<WeightedRandomChestContent> chestItems;
    private final /* synthetic */ int itemsToGenerateInBonusChest;
    private static final /* synthetic */ int[] lllIlIIIIlIllI;
    
    static {
        lIlIIIIlIlllIlIl();
    }
    
    public WorldGeneratorBonusChest(final List<WeightedRandomChestContent> llllllllllllIlIlllIIllIlIlIllIlI, final int llllllllllllIlIlllIIllIlIlIlIllI) {
        this.chestItems = llllllllllllIlIlllIIllIlIlIllIlI;
        this.itemsToGenerateInBonusChest = llllllllllllIlIlllIIllIlIlIlIllI;
    }
    
    private static boolean lIlIIIIlIllllIll(final int llllllllllllIlIlllIIllIlIIlIlllI, final int llllllllllllIlIlllIIllIlIIlIllIl) {
        return llllllllllllIlIlllIIllIlIIlIlllI >= llllllllllllIlIlllIIllIlIIlIllIl;
    }
    
    private static void lIlIIIIlIlllIlIl() {
        (lllIlIIIIlIllI = new int[5])[0] = " ".length();
        WorldGeneratorBonusChest.lllIlIIIIlIllI[1] = (" ".length() & ~" ".length());
        WorldGeneratorBonusChest.lllIlIIIIlIllI[2] = (0x3C ^ 0x37 ^ (0x17 ^ 0x18));
        WorldGeneratorBonusChest.lllIlIIIIlIllI[3] = "   ".length();
        WorldGeneratorBonusChest.lllIlIIIIlIllI[4] = "  ".length();
    }
    
    @Override
    public boolean generate(final World llllllllllllIlIlllIIllIlIIlllIll, final Random llllllllllllIlIlllIIllIlIlIIIlll, BlockPos llllllllllllIlIlllIIllIlIIlllIIl) {
        "".length();
        if ("   ".length() < 0) {
            return ((0xF4 ^ 0xAF) & ~(0xC6 ^ 0x9D)) != 0x0;
        }
        Block llllllllllllIlIlllIIllIlIlIIIlII;
        while ((!lIlIIIIlIlllIllI((llllllllllllIlIlllIIllIlIlIIIlII = llllllllllllIlIlllIIllIlIIlllIll.getBlockState(llllllllllllIlIlllIIllIlIIlllIIl).getBlock()).getMaterial(), Material.air) || lIlIIIIlIlllIlll(llllllllllllIlIlllIIllIlIlIIIlII.getMaterial(), Material.leaves)) && !lIlIIIIlIllllIII(llllllllllllIlIlllIIllIlIIlllIIl.getY(), WorldGeneratorBonusChest.lllIlIIIIlIllI[0])) {
            llllllllllllIlIlllIIllIlIIlllIIl = llllllllllllIlIlllIIllIlIIlllIIl.down();
        }
        if (lIlIIIIlIllllIIl(llllllllllllIlIlllIIllIlIIlllIIl.getY(), WorldGeneratorBonusChest.lllIlIIIIlIllI[0])) {
            return WorldGeneratorBonusChest.lllIlIIIIlIllI[1] != 0;
        }
        llllllllllllIlIlllIIllIlIIlllIIl = llllllllllllIlIlllIIllIlIIlllIIl.up();
        int llllllllllllIlIlllIIllIlIlIIIIll = WorldGeneratorBonusChest.lllIlIIIIlIllI[1];
        "".length();
        if (null != null) {
            return ((0x67 ^ 0xD ^ (0xE7 ^ 0xB6)) & (0x91 ^ 0x84 ^ (0x21 ^ 0xF) ^ -" ".length())) != 0x0;
        }
        while (!lIlIIIIlIllllIll(llllllllllllIlIlllIIllIlIlIIIIll, WorldGeneratorBonusChest.lllIlIIIIlIllI[2])) {
            final BlockPos llllllllllllIlIlllIIllIlIlIIIIlI = llllllllllllIlIlllIIllIlIIlllIIl.add(llllllllllllIlIlllIIllIlIlIIIlll.nextInt(WorldGeneratorBonusChest.lllIlIIIIlIllI[2]) - llllllllllllIlIlllIIllIlIlIIIlll.nextInt(WorldGeneratorBonusChest.lllIlIIIIlIllI[2]), llllllllllllIlIlllIIllIlIlIIIlll.nextInt(WorldGeneratorBonusChest.lllIlIIIIlIllI[3]) - llllllllllllIlIlllIIllIlIlIIIlll.nextInt(WorldGeneratorBonusChest.lllIlIIIIlIllI[3]), llllllllllllIlIlllIIllIlIlIIIlll.nextInt(WorldGeneratorBonusChest.lllIlIIIIlIllI[2]) - llllllllllllIlIlllIIllIlIlIIIlll.nextInt(WorldGeneratorBonusChest.lllIlIIIIlIllI[2]));
            if (lIlIIIIlIllllIlI(llllllllllllIlIlllIIllIlIIlllIll.isAirBlock(llllllllllllIlIlllIIllIlIlIIIIlI) ? 1 : 0) && lIlIIIIlIllllIlI(World.doesBlockHaveSolidTopSurface(llllllllllllIlIlllIIllIlIIlllIll, llllllllllllIlIlllIIllIlIlIIIIlI.down()) ? 1 : 0)) {
                llllllllllllIlIlllIIllIlIIlllIll.setBlockState(llllllllllllIlIlllIIllIlIlIIIIlI, Blocks.chest.getDefaultState(), WorldGeneratorBonusChest.lllIlIIIIlIllI[4]);
                "".length();
                final TileEntity llllllllllllIlIlllIIllIlIlIIIIIl = llllllllllllIlIlllIIllIlIIlllIll.getTileEntity(llllllllllllIlIlllIIllIlIlIIIIlI);
                if (lIlIIIIlIllllIlI((llllllllllllIlIlllIIllIlIlIIIIIl instanceof TileEntityChest) ? 1 : 0)) {
                    WeightedRandomChestContent.generateChestContents(llllllllllllIlIlllIIllIlIlIIIlll, this.chestItems, (IInventory)llllllllllllIlIlllIIllIlIlIIIIIl, this.itemsToGenerateInBonusChest);
                }
                final BlockPos llllllllllllIlIlllIIllIlIlIIIIII = llllllllllllIlIlllIIllIlIlIIIIlI.east();
                final BlockPos llllllllllllIlIlllIIllIlIIllllll = llllllllllllIlIlllIIllIlIlIIIIlI.west();
                final BlockPos llllllllllllIlIlllIIllIlIIlllllI = llllllllllllIlIlllIIllIlIlIIIIlI.north();
                final BlockPos llllllllllllIlIlllIIllIlIIllllIl = llllllllllllIlIlllIIllIlIlIIIIlI.south();
                if (lIlIIIIlIllllIlI(llllllllllllIlIlllIIllIlIIlllIll.isAirBlock(llllllllllllIlIlllIIllIlIIllllll) ? 1 : 0) && lIlIIIIlIllllIlI(World.doesBlockHaveSolidTopSurface(llllllllllllIlIlllIIllIlIIlllIll, llllllllllllIlIlllIIllIlIIllllll.down()) ? 1 : 0)) {
                    llllllllllllIlIlllIIllIlIIlllIll.setBlockState(llllllllllllIlIlllIIllIlIIllllll, Blocks.torch.getDefaultState(), WorldGeneratorBonusChest.lllIlIIIIlIllI[4]);
                    "".length();
                }
                if (lIlIIIIlIllllIlI(llllllllllllIlIlllIIllIlIIlllIll.isAirBlock(llllllllllllIlIlllIIllIlIlIIIIII) ? 1 : 0) && lIlIIIIlIllllIlI(World.doesBlockHaveSolidTopSurface(llllllllllllIlIlllIIllIlIIlllIll, llllllllllllIlIlllIIllIlIlIIIIII.down()) ? 1 : 0)) {
                    llllllllllllIlIlllIIllIlIIlllIll.setBlockState(llllllllllllIlIlllIIllIlIlIIIIII, Blocks.torch.getDefaultState(), WorldGeneratorBonusChest.lllIlIIIIlIllI[4]);
                    "".length();
                }
                if (lIlIIIIlIllllIlI(llllllllllllIlIlllIIllIlIIlllIll.isAirBlock(llllllllllllIlIlllIIllIlIIlllllI) ? 1 : 0) && lIlIIIIlIllllIlI(World.doesBlockHaveSolidTopSurface(llllllllllllIlIlllIIllIlIIlllIll, llllllllllllIlIlllIIllIlIIlllllI.down()) ? 1 : 0)) {
                    llllllllllllIlIlllIIllIlIIlllIll.setBlockState(llllllllllllIlIlllIIllIlIIlllllI, Blocks.torch.getDefaultState(), WorldGeneratorBonusChest.lllIlIIIIlIllI[4]);
                    "".length();
                }
                if (lIlIIIIlIllllIlI(llllllllllllIlIlllIIllIlIIlllIll.isAirBlock(llllllllllllIlIlllIIllIlIIllllIl) ? 1 : 0) && lIlIIIIlIllllIlI(World.doesBlockHaveSolidTopSurface(llllllllllllIlIlllIIllIlIIlllIll, llllllllllllIlIlllIIllIlIIllllIl.down()) ? 1 : 0)) {
                    llllllllllllIlIlllIIllIlIIlllIll.setBlockState(llllllllllllIlIlllIIllIlIIllllIl, Blocks.torch.getDefaultState(), WorldGeneratorBonusChest.lllIlIIIIlIllI[4]);
                    "".length();
                }
                return WorldGeneratorBonusChest.lllIlIIIIlIllI[0] != 0;
            }
            ++llllllllllllIlIlllIIllIlIlIIIIll;
        }
        return WorldGeneratorBonusChest.lllIlIIIIlIllI[1] != 0;
    }
    
    private static boolean lIlIIIIlIllllIlI(final int llllllllllllIlIlllIIllIlIIIllIll) {
        return llllllllllllIlIlllIIllIlIIIllIll != 0;
    }
    
    private static boolean lIlIIIIlIllllIIl(final int llllllllllllIlIlllIIllIlIIlIlIlI, final int llllllllllllIlIlllIIllIlIIlIlIIl) {
        return llllllllllllIlIlllIIllIlIIlIlIlI < llllllllllllIlIlllIIllIlIIlIlIIl;
    }
    
    private static boolean lIlIIIIlIllllIII(final int llllllllllllIlIlllIIllIlIIlIIllI, final int llllllllllllIlIlllIIllIlIIlIIlIl) {
        return llllllllllllIlIlllIIllIlIIlIIllI <= llllllllllllIlIlllIIllIlIIlIIlIl;
    }
    
    private static boolean lIlIIIIlIlllIlll(final Object llllllllllllIlIlllIIllIlIIIllllI, final Object llllllllllllIlIlllIIllIlIIIlllIl) {
        return llllllllllllIlIlllIIllIlIIIllllI == llllllllllllIlIlllIIllIlIIIlllIl;
    }
    
    private static boolean lIlIIIIlIlllIllI(final Object llllllllllllIlIlllIIllIlIIlIIIlI, final Object llllllllllllIlIlllIIllIlIIlIIIIl) {
        return llllllllllllIlIlllIIllIlIIlIIIlI != llllllllllllIlIlllIIllIlIIlIIIIl;
    }
}
