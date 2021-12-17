// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockOldLeaf extends BlockLeaves
{
    public static final /* synthetic */ PropertyEnum<BlockPlanks.EnumType> VARIANT;
    private static final /* synthetic */ String[] llllIllIIllll;
    private static final /* synthetic */ int[] llllIllIlIIII;
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIllIlIIlIIIIIIlII) {
        final IBlockState withProperty = this.getDefaultState().withProperty(BlockOldLeaf.VARIANT, this.getWoodType(lllllllllllllIlIllIlIIlIIIIIIlII));
        final PropertyBool decayable = BlockOldLeaf.DECAYABLE;
        int b;
        if (lIlIlIllIIllIII(lllllllllllllIlIllIlIIlIIIIIIlII & BlockOldLeaf.llllIllIlIIII[3])) {
            b = BlockOldLeaf.llllIllIlIIII[1];
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            b = BlockOldLeaf.llllIllIlIIII[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)decayable, (boolean)(b != 0));
        final PropertyBool check_DECAY = BlockOldLeaf.CHECK_DECAY;
        int b2;
        if (lIlIlIllIIllIIl(lllllllllllllIlIllIlIIlIIIIIIlII & BlockOldLeaf.llllIllIlIIII[4])) {
            b2 = BlockOldLeaf.llllIllIlIIII[1];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            b2 = BlockOldLeaf.llllIllIlIIII[0];
        }
        return withProperty2.withProperty((IProperty<Comparable>)check_DECAY, (boolean)(b2 != 0));
    }
    
    private static boolean lIlIlIllIIllIII(final int lllllllllllllIlIllIlIIIllIllIlII) {
        return lllllllllllllIlIllIlIIIllIllIlII == 0;
    }
    
    private static boolean lIlIlIllIIllIIl(final int lllllllllllllIlIllIlIIIllIllIIlI) {
        return lllllllllllllIlIllIlIIIllIllIIlI > 0;
    }
    
    private static boolean lIlIlIllIIllIlI(final int lllllllllllllIlIllIlIIIllIllIllI) {
        return lllllllllllllIlIllIlIIIllIllIllI != 0;
    }
    
    private static boolean lIlIlIllIIllIll(final Object lllllllllllllIlIllIlIIIllIlllIII) {
        return lllllllllllllIlIllIlIIIllIlllIII != null;
    }
    
    private static boolean lIlIlIllIIlIlll(final Object lllllllllllllIlIllIlIIIllIlllIll, final Object lllllllllllllIlIllIlIIIllIlllIlI) {
        return lllllllllllllIlIllIlIIIllIlllIll == lllllllllllllIlIllIlIIIllIlllIlI;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockOldLeaf.llllIllIlIIII[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockOldLeaf.llllIllIlIIII[0]] = BlockOldLeaf.VARIANT;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockOldLeaf.llllIllIlIIII[1]] = BlockOldLeaf.CHECK_DECAY;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockOldLeaf.llllIllIlIIII[6]] = BlockOldLeaf.DECAYABLE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    public BlockOldLeaf() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty((IProperty<Comparable>)BlockOldLeaf.CHECK_DECAY, (boolean)(BlockOldLeaf.llllIllIlIIII[1] != 0)).withProperty((IProperty<Comparable>)BlockOldLeaf.DECAYABLE, (boolean)(BlockOldLeaf.llllIllIlIIII[1] != 0)));
    }
    
    @Override
    protected int getSaplingDropChance(final IBlockState lllllllllllllIlIllIlIIlIIIIllIII) {
        int saplingDropChance;
        if (lIlIlIllIIlIlll(lllllllllllllIlIllIlIIlIIIIllIII.getValue(BlockOldLeaf.VARIANT), BlockPlanks.EnumType.JUNGLE)) {
            saplingDropChance = BlockOldLeaf.llllIllIlIIII[2];
            "".length();
            if ("   ".length() == ((0x65 ^ 0x72) & ~(0x86 ^ 0x91))) {
                return (0x50 ^ 0x3) & ~(0xD4 ^ 0x87);
            }
        }
        else {
            saplingDropChance = super.getSaplingDropChance(lllllllllllllIlIllIlIIlIIIIllIII);
        }
        return saplingDropChance;
    }
    
    private static void lIlIlIllIIlIlII() {
        (llllIllIIllll = new String[BlockOldLeaf.llllIllIlIIII[1]])[BlockOldLeaf.llllIllIlIIII[0]] = lIlIlIllIIlIIlI("IywzDCc7OQ==", "UMAeF");
    }
    
    static {
        lIlIlIllIIlIlIl();
        lIlIlIllIIlIlII();
        VARIANT = PropertyEnum.create(BlockOldLeaf.llllIllIIllll[BlockOldLeaf.llllIllIlIIII[0]], BlockPlanks.EnumType.class, (com.google.common.base.Predicate<BlockPlanks.EnumType>)new Predicate<BlockPlanks.EnumType>() {
            private static final /* synthetic */ int[] lIllllIllIIlIl;
            
            private static void lIIIIlIIllIIlIIl() {
                (lIllllIllIIlIl = new int[3])[0] = (0xE ^ 0x44 ^ (0xCB ^ 0x85));
                BlockOldLeaf$1.lIllllIllIIlIl[1] = " ".length();
                BlockOldLeaf$1.lIllllIllIIlIl[2] = ((27 + 9 + 10 + 209 ^ 122 + 185 - 306 + 191) & (100 + 22 + 44 + 83 ^ 28 + 189 - 44 + 25 ^ -" ".length()));
            }
            
            public boolean apply(final BlockPlanks.EnumType llllllllllllIllllIlIIIlIlIlIIlll) {
                if (lIIIIlIIllIIlIlI(llllllllllllIllllIlIIIlIlIlIIlll.getMetadata(), BlockOldLeaf$1.lIllllIllIIlIl[0])) {
                    return BlockOldLeaf$1.lIllllIllIIlIl[1] != 0;
                }
                return BlockOldLeaf$1.lIllllIllIIlIl[2] != 0;
            }
            
            private static boolean lIIIIlIIllIIlIlI(final int llllllllllllIllllIlIIIlIlIlIIIII, final int llllllllllllIllllIlIIIlIlIIlllll) {
                return llllllllllllIllllIlIIIlIlIlIIIII < llllllllllllIllllIlIIIlIlIIlllll;
            }
            
            static {
                lIIIIlIIllIIlIIl();
            }
        });
    }
    
    private static String lIlIlIllIIlIIlI(String lllllllllllllIlIllIlIIIlllIIlllI, final String lllllllllllllIlIllIlIIIlllIIllIl) {
        lllllllllllllIlIllIlIIIlllIIlllI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIlIIIlllIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlIIIlllIlIIIl = new StringBuilder();
        final char[] lllllllllllllIlIllIlIIIlllIlIIII = lllllllllllllIlIllIlIIIlllIIllIl.toCharArray();
        int lllllllllllllIlIllIlIIIlllIIllll = BlockOldLeaf.llllIllIlIIII[0];
        final byte lllllllllllllIlIllIlIIIlllIIlIIl = (Object)((String)lllllllllllllIlIllIlIIIlllIIlllI).toCharArray();
        final Exception lllllllllllllIlIllIlIIIlllIIlIII = (Exception)lllllllllllllIlIllIlIIIlllIIlIIl.length;
        char lllllllllllllIlIllIlIIIlllIIIlll = (char)BlockOldLeaf.llllIllIlIIII[0];
        while (lIlIlIllIIlllII(lllllllllllllIlIllIlIIIlllIIIlll, (int)lllllllllllllIlIllIlIIIlllIIlIII)) {
            final char lllllllllllllIlIllIlIIIlllIlIlII = lllllllllllllIlIllIlIIIlllIIlIIl[lllllllllllllIlIllIlIIIlllIIIlll];
            lllllllllllllIlIllIlIIIlllIlIIIl.append((char)(lllllllllllllIlIllIlIIIlllIlIlII ^ lllllllllllllIlIllIlIIIlllIlIIII[lllllllllllllIlIllIlIIIlllIIllll % lllllllllllllIlIllIlIIIlllIlIIII.length]));
            "".length();
            ++lllllllllllllIlIllIlIIIlllIIllll;
            ++lllllllllllllIlIllIlIIIlllIIIlll;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlIIIlllIlIIIl);
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIlIllIlIIIlllllIIII) {
        return lllllllllllllIlIllIlIIIlllllIIII.getValue(BlockOldLeaf.VARIANT).getMetadata();
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIllIlIIIllllllllI) {
        int lllllllllllllIlIllIlIIIlllllllIl = BlockOldLeaf.llllIllIlIIII[0];
        lllllllllllllIlIllIlIIIlllllllIl |= lllllllllllllIlIllIlIIIllllllllI.getValue(BlockOldLeaf.VARIANT).getMetadata();
        if (lIlIlIllIIllIII(((boolean)lllllllllllllIlIllIlIIIllllllllI.getValue((IProperty<Boolean>)BlockOldLeaf.DECAYABLE)) ? 1 : 0)) {
            lllllllllllllIlIllIlIIIlllllllIl |= BlockOldLeaf.llllIllIlIIII[3];
        }
        if (lIlIlIllIIllIlI(((boolean)lllllllllllllIlIllIlIIIllllllllI.getValue((IProperty<Boolean>)BlockOldLeaf.CHECK_DECAY)) ? 1 : 0)) {
            lllllllllllllIlIllIlIIIlllllllIl |= BlockOldLeaf.llllIllIlIIII[4];
        }
        return lllllllllllllIlIllIlIIIlllllllIl;
    }
    
    @Override
    protected void dropApple(final World lllllllllllllIlIllIlIIlIIIIlllll, final BlockPos lllllllllllllIlIllIlIIlIIIlIIIlI, final IBlockState lllllllllllllIlIllIlIIlIIIIlllIl, final int lllllllllllllIlIllIlIIlIIIlIIIII) {
        if (lIlIlIllIIlIlll(lllllllllllllIlIllIlIIlIIIIlllIl.getValue(BlockOldLeaf.VARIANT), BlockPlanks.EnumType.OAK) && lIlIlIllIIllIII(lllllllllllllIlIllIlIIlIIIIlllll.rand.nextInt(lllllllllllllIlIllIlIIlIIIlIIIII))) {
            Block.spawnAsEntity(lllllllllllllIlIllIlIIlIIIIlllll, lllllllllllllIlIllIlIIlIIIlIIIlI, new ItemStack(Items.apple, BlockOldLeaf.llllIllIlIIII[1], BlockOldLeaf.llllIllIlIIII[0]));
        }
    }
    
    private static boolean lIlIlIllIIlIllI(final Object lllllllllllllIlIllIlIIIllIllllll, final Object lllllllllllllIlIllIlIIIllIlllllI) {
        return lllllllllllllIlIllIlIIIllIllllll != lllllllllllllIlIllIlIIIllIlllllI;
    }
    
    private static void lIlIlIllIIlIlIl() {
        (llllIllIlIIII = new int[7])[0] = ((0xEE ^ 0xA3) & ~(0xCD ^ 0x80));
        BlockOldLeaf.llllIllIlIIII[1] = " ".length();
        BlockOldLeaf.llllIllIlIIII[2] = (0x10 ^ 0x53 ^ (0x6F ^ 0x4));
        BlockOldLeaf.llllIllIlIIII[3] = (0x4D ^ 0x49);
        BlockOldLeaf.llllIllIlIIII[4] = (0x62 ^ 0x6A);
        BlockOldLeaf.llllIllIlIIII[5] = "   ".length();
        BlockOldLeaf.llllIllIlIIII[6] = "  ".length();
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess lllllllllllllIlIllIlIIlIIIllIIll, final BlockPos lllllllllllllIlIllIlIIlIIIllIIlI, final int lllllllllllllIlIllIlIIlIIIllIIIl) {
        final IBlockState lllllllllllllIlIllIlIIlIIIllIIII = lllllllllllllIlIllIlIIlIIIllIIll.getBlockState(lllllllllllllIlIllIlIIlIIIllIIlI);
        if (lIlIlIllIIlIlll(lllllllllllllIlIllIlIIlIIIllIIII.getBlock(), this)) {
            final BlockPlanks.EnumType lllllllllllllIlIllIlIIlIIIlIllll = lllllllllllllIlIllIlIIlIIIllIIII.getValue(BlockOldLeaf.VARIANT);
            if (lIlIlIllIIlIlll(lllllllllllllIlIllIlIIlIIIlIllll, BlockPlanks.EnumType.SPRUCE)) {
                return ColorizerFoliage.getFoliageColorPine();
            }
            if (lIlIlIllIIlIlll(lllllllllllllIlIllIlIIlIIIlIllll, BlockPlanks.EnumType.BIRCH)) {
                return ColorizerFoliage.getFoliageColorBirch();
            }
        }
        return super.colorMultiplier(lllllllllllllIlIllIlIIlIIIllIIll, lllllllllllllIlIllIlIIlIIIllIIlI, lllllllllllllIlIllIlIIlIIIllIIIl);
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIlIllIlIIlIIIIIllll, final CreativeTabs lllllllllllllIlIllIlIIlIIIIlIIIl, final List<ItemStack> lllllllllllllIlIllIlIIlIIIIIlllI) {
        lllllllllllllIlIllIlIIlIIIIIlllI.add(new ItemStack(lllllllllllllIlIllIlIIlIIIIIllll, BlockOldLeaf.llllIllIlIIII[1], BlockPlanks.EnumType.OAK.getMetadata()));
        "".length();
        lllllllllllllIlIllIlIIlIIIIIlllI.add(new ItemStack(lllllllllllllIlIllIlIIlIIIIIllll, BlockOldLeaf.llllIllIlIIII[1], BlockPlanks.EnumType.SPRUCE.getMetadata()));
        "".length();
        lllllllllllllIlIllIlIIlIIIIIlllI.add(new ItemStack(lllllllllllllIlIllIlIIlIIIIIllll, BlockOldLeaf.llllIllIlIIII[1], BlockPlanks.EnumType.BIRCH.getMetadata()));
        "".length();
        lllllllllllllIlIllIlIIlIIIIIlllI.add(new ItemStack(lllllllllllllIlIllIlIIlIIIIIllll, BlockOldLeaf.llllIllIlIIII[1], BlockPlanks.EnumType.JUNGLE.getMetadata()));
        "".length();
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState lllllllllllllIlIllIlIIlIIIIIlIII) {
        return new ItemStack(Item.getItemFromBlock(this), BlockOldLeaf.llllIllIlIIII[1], lllllllllllllIlIllIlIIlIIIIIlIII.getValue(BlockOldLeaf.VARIANT).getMetadata());
    }
    
    @Override
    public int getRenderColor(final IBlockState lllllllllllllIlIllIlIIlIIIllllII) {
        if (lIlIlIllIIlIllI(lllllllllllllIlIllIlIIlIIIllllII.getBlock(), this)) {
            return super.getRenderColor(lllllllllllllIlIllIlIIlIIIllllII);
        }
        final BlockPlanks.EnumType lllllllllllllIlIllIlIIlIIIlllllI = lllllllllllllIlIllIlIIlIIIllllII.getValue(BlockOldLeaf.VARIANT);
        int n;
        if (lIlIlIllIIlIlll(lllllllllllllIlIllIlIIlIIIlllllI, BlockPlanks.EnumType.SPRUCE)) {
            n = ColorizerFoliage.getFoliageColorPine();
            "".length();
            if (null != null) {
                return (0xA8 ^ 0xB7 ^ (0x89 ^ 0xA0)) & (0xE ^ 0x34 ^ (0x13 ^ 0x1F) ^ -" ".length());
            }
        }
        else if (lIlIlIllIIlIlll(lllllllllllllIlIllIlIIlIIIlllllI, BlockPlanks.EnumType.BIRCH)) {
            n = ColorizerFoliage.getFoliageColorBirch();
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) != 0x0) {
                return (0xA0 ^ 0xA5 ^ (0x6B ^ 0x65)) & (126 + 78 - 127 + 91 ^ 35 + 103 - 24 + 49 ^ -" ".length());
            }
        }
        else {
            n = super.getRenderColor(lllllllllllllIlIllIlIIlIIIllllII);
        }
        return n;
    }
    
    private static boolean lIlIlIllIIlllII(final int lllllllllllllIlIllIlIIIlllIIIIll, final int lllllllllllllIlIllIlIIIlllIIIIlI) {
        return lllllllllllllIlIllIlIIIlllIIIIll < lllllllllllllIlIllIlIIIlllIIIIlI;
    }
    
    @Override
    public BlockPlanks.EnumType getWoodType(final int lllllllllllllIlIllIlIIIlllllIlll) {
        return BlockPlanks.EnumType.byMetadata((lllllllllllllIlIllIlIIIlllllIlll & BlockOldLeaf.llllIllIlIIII[5]) % BlockOldLeaf.llllIllIlIIII[3]);
    }
    
    @Override
    public void harvestBlock(final World lllllllllllllIlIllIlIIIllllIlIII, final EntityPlayer lllllllllllllIlIllIlIIIllllIIIIl, final BlockPos lllllllllllllIlIllIlIIIllllIIIII, final IBlockState lllllllllllllIlIllIlIIIllllIIlIl, final TileEntity lllllllllllllIlIllIlIIIllllIIlII) {
        if (lIlIlIllIIllIII(lllllllllllllIlIllIlIIIllllIlIII.isRemote ? 1 : 0) && lIlIlIllIIllIll(lllllllllllllIlIllIlIIIllllIIIIl.getCurrentEquippedItem()) && lIlIlIllIIlIlll(lllllllllllllIlIllIlIIIllllIIIIl.getCurrentEquippedItem().getItem(), Items.shears)) {
            lllllllllllllIlIllIlIIIllllIIIIl.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
            Block.spawnAsEntity(lllllllllllllIlIllIlIIIllllIlIII, lllllllllllllIlIllIlIIIllllIIIII, new ItemStack(Item.getItemFromBlock(this), BlockOldLeaf.llllIllIlIIII[1], lllllllllllllIlIllIlIIIllllIIlIl.getValue(BlockOldLeaf.VARIANT).getMetadata()));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            super.harvestBlock(lllllllllllllIlIllIlIIIllllIlIII, lllllllllllllIlIllIlIIIllllIIIIl, lllllllllllllIlIllIlIIIllllIIIII, lllllllllllllIlIllIlIIIllllIIlIl, lllllllllllllIlIllIlIIIllllIIlII);
        }
    }
}
