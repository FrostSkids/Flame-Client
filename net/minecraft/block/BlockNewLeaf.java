// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.properties.PropertyBool;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.stats.StatList;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;

public class BlockNewLeaf extends BlockLeaves
{
    private static final /* synthetic */ String[] lIllIlIIllllII;
    public static final /* synthetic */ PropertyEnum<BlockPlanks.EnumType> VARIANT;
    private static final /* synthetic */ int[] lIllIlIIllllIl;
    
    public BlockNewLeaf() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockNewLeaf.VARIANT, BlockPlanks.EnumType.ACACIA).withProperty((IProperty<Comparable>)BlockNewLeaf.CHECK_DECAY, (boolean)(BlockNewLeaf.lIllIlIIllllIl[1] != 0)).withProperty((IProperty<Comparable>)BlockNewLeaf.DECAYABLE, (boolean)(BlockNewLeaf.lIllIlIIllllIl[1] != 0)));
    }
    
    private static boolean llllllIIlllllll(final int lllllllllllllIIIIIIIIIlIIIllIIIl) {
        return lllllllllllllIIIIIIIIIlIIIllIIIl != 0;
    }
    
    private static boolean llllllIlIIIIIII(final Object lllllllllllllIIIIIIIIIlIIIllIIll) {
        return lllllllllllllIIIIIIIIIlIIIllIIll != null;
    }
    
    @Override
    public void harvestBlock(final World lllllllllllllIIIIIIIIIlIIlIlIIII, final EntityPlayer lllllllllllllIIIIIIIIIlIIlIIllll, final BlockPos lllllllllllllIIIIIIIIIlIIlIIlIII, final IBlockState lllllllllllllIIIIIIIIIlIIlIIllIl, final TileEntity lllllllllllllIIIIIIIIIlIIlIIllII) {
        if (llllllIIlllllIl(lllllllllllllIIIIIIIIIlIIlIlIIII.isRemote ? 1 : 0) && llllllIlIIIIIII(lllllllllllllIIIIIIIIIlIIlIIllll.getCurrentEquippedItem()) && llllllIIlllllII(lllllllllllllIIIIIIIIIlIIlIIllll.getCurrentEquippedItem().getItem(), Items.shears)) {
            lllllllllllllIIIIIIIIIlIIlIIllll.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
            Block.spawnAsEntity(lllllllllllllIIIIIIIIIlIIlIlIIII, lllllllllllllIIIIIIIIIlIIlIIlIII, new ItemStack(Item.getItemFromBlock(this), BlockNewLeaf.lIllIlIIllllIl[1], lllllllllllllIIIIIIIIIlIIlIIllIl.getValue(BlockNewLeaf.VARIANT).getMetadata() - BlockNewLeaf.lIllIlIIllllIl[3]));
            "".length();
            if ((0xE7 ^ 0xB8 ^ (0x5D ^ 0x6)) <= 0) {
                return;
            }
        }
        else {
            super.harvestBlock(lllllllllllllIIIIIIIIIlIIlIlIIII, lllllllllllllIIIIIIIIIlIIlIIllll, lllllllllllllIIIIIIIIIlIIlIIlIII, lllllllllllllIIIIIIIIIlIIlIIllIl, lllllllllllllIIIIIIIIIlIIlIIllII);
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockNewLeaf.lIllIlIIllllIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockNewLeaf.lIllIlIIllllIl[0]] = BlockNewLeaf.VARIANT;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockNewLeaf.lIllIlIIllllIl[1]] = BlockNewLeaf.CHECK_DECAY;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockNewLeaf.lIllIlIIllllIl[5]] = BlockNewLeaf.DECAYABLE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    static {
        llllllIIllllIll();
        llllllIIllllIIl();
        VARIANT = PropertyEnum.create(BlockNewLeaf.lIllIlIIllllII[BlockNewLeaf.lIllIlIIllllIl[0]], BlockPlanks.EnumType.class, (com.google.common.base.Predicate<BlockPlanks.EnumType>)new Predicate<BlockPlanks.EnumType>() {
            private static final /* synthetic */ int[] lIlllIIllIllIl;
            
            static {
                lIIIIIlIIIIlIIlI();
            }
            
            public boolean apply(final BlockPlanks.EnumType llllllllllllIlllllIIllIIIIIIlllI) {
                if (lIIIIIlIIIIlIIll(llllllllllllIlllllIIllIIIIIIlllI.getMetadata(), BlockNewLeaf$1.lIlllIIllIllIl[0])) {
                    return BlockNewLeaf$1.lIlllIIllIllIl[1] != 0;
                }
                return BlockNewLeaf$1.lIlllIIllIllIl[2] != 0;
            }
            
            private static void lIIIIIlIIIIlIIlI() {
                (lIlllIIllIllIl = new int[3])[0] = (0x3F ^ 0x3B);
                BlockNewLeaf$1.lIlllIIllIllIl[1] = " ".length();
                BlockNewLeaf$1.lIlllIIllIllIl[2] = ((0xD ^ 0x3E ^ (0x6 ^ 0x38)) & (96 + 99 - 82 + 22 ^ 39 + 83 + 11 + 5 ^ -" ".length()));
            }
            
            private static boolean lIIIIIlIIIIlIIll(final int llllllllllllIlllllIIllIIIIIIIlll, final int llllllllllllIlllllIIllIIIIIIIllI) {
                return llllllllllllIlllllIIllIIIIIIIlll >= llllllllllllIlllllIIllIIIIIIIllI;
            }
        });
    }
    
    private static boolean llllllIIlllllII(final Object lllllllllllllIIIIIIIIIlIIIllIllI, final Object lllllllllllllIIIIIIIIIlIIIllIlIl) {
        return lllllllllllllIIIIIIIIIlIIIllIllI == lllllllllllllIIIIIIIIIlIIIllIlIl;
    }
    
    @Override
    protected void dropApple(final World lllllllllllllIIIIIIIIIlIlIIIllll, final BlockPos lllllllllllllIIIIIIIIIlIlIIIlIlI, final IBlockState lllllllllllllIIIIIIIIIlIlIIIllIl, final int lllllllllllllIIIIIIIIIlIlIIIlIII) {
        if (llllllIIlllllII(lllllllllllllIIIIIIIIIlIlIIIllIl.getValue(BlockNewLeaf.VARIANT), BlockPlanks.EnumType.DARK_OAK) && llllllIIlllllIl(lllllllllllllIIIIIIIIIlIlIIIllll.rand.nextInt(lllllllllllllIIIIIIIIIlIlIIIlIII))) {
            Block.spawnAsEntity(lllllllllllllIIIIIIIIIlIlIIIllll, lllllllllllllIIIIIIIIIlIlIIIlIlI, new ItemStack(Items.apple, BlockNewLeaf.lIllIlIIllllIl[1], BlockNewLeaf.lIllIlIIllllIl[0]));
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIIIIIIlIIllIIIII) {
        int lllllllllllllIIIIIIIIIlIIllIIIIl = BlockNewLeaf.lIllIlIIllllIl[0];
        lllllllllllllIIIIIIIIIlIIllIIIIl |= lllllllllllllIIIIIIIIIlIIllIIIII.getValue(BlockNewLeaf.VARIANT).getMetadata() - BlockNewLeaf.lIllIlIIllllIl[3];
        if (llllllIIlllllIl(((boolean)lllllllllllllIIIIIIIIIlIIllIIIII.getValue((IProperty<Boolean>)BlockNewLeaf.DECAYABLE)) ? 1 : 0)) {
            lllllllllllllIIIIIIIIIlIIllIIIIl |= BlockNewLeaf.lIllIlIIllllIl[3];
        }
        if (llllllIIlllllll(((boolean)lllllllllllllIIIIIIIIIlIIllIIIII.getValue((IProperty<Boolean>)BlockNewLeaf.CHECK_DECAY)) ? 1 : 0)) {
            lllllllllllllIIIIIIIIIlIIllIIIIl |= BlockNewLeaf.lIllIlIIllllIl[4];
        }
        return lllllllllllllIIIIIIIIIlIIllIIIIl;
    }
    
    @Override
    public BlockPlanks.EnumType getWoodType(final int lllllllllllllIIIIIIIIIlIIlIlllII) {
        return BlockPlanks.EnumType.byMetadata((lllllllllllllIIIIIIIIIlIIlIlllII & BlockNewLeaf.lIllIlIIllllIl[2]) + BlockNewLeaf.lIllIlIIllllIl[3]);
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIIIIIIIIlIIlllIllI, final CreativeTabs lllllllllllllIIIIIIIIIlIIlllIlIl, final List<ItemStack> lllllllllllllIIIIIIIIIlIIlllIIlI) {
        lllllllllllllIIIIIIIIIlIIlllIIlI.add(new ItemStack(lllllllllllllIIIIIIIIIlIIlllIllI, BlockNewLeaf.lIllIlIIllllIl[1], BlockNewLeaf.lIllIlIIllllIl[0]));
        "".length();
        lllllllllllllIIIIIIIIIlIIlllIIlI.add(new ItemStack(lllllllllllllIIIIIIIIIlIIlllIllI, BlockNewLeaf.lIllIlIIllllIl[1], BlockNewLeaf.lIllIlIIllllIl[1]));
        "".length();
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState lllllllllllllIIIIIIIIIlIIllIllII) {
        return new ItemStack(Item.getItemFromBlock(this), BlockNewLeaf.lIllIlIIllllIl[1], lllllllllllllIIIIIIIIIlIIllIllII.getValue(BlockNewLeaf.VARIANT).getMetadata() - BlockNewLeaf.lIllIlIIllllIl[3]);
    }
    
    private static boolean llllllIIlllllIl(final int lllllllllllllIIIIIIIIIlIIIlIllll) {
        return lllllllllllllIIIIIIIIIlIIIlIllll == 0;
    }
    
    private static String llllllIIlllIlll(final String lllllllllllllIIIIIIIIIlIIIllllII, final String lllllllllllllIIIIIIIIIlIIIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIIlIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIIlIIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIIlIIlIIIIII.init(BlockNewLeaf.lIllIlIIllllIl[5], lllllllllllllIIIIIIIIIlIIlIIIIIl);
            return new String(lllllllllllllIIIIIIIIIlIIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIlIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIIlIIIllllll) {
            lllllllllllllIIIIIIIIIlIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void llllllIIllllIll() {
        (lIllIlIIllllIl = new int[6])[0] = ((0x3C ^ 0x6D) & ~(0x9 ^ 0x58));
        BlockNewLeaf.lIllIlIIllllIl[1] = " ".length();
        BlockNewLeaf.lIllIlIIllllIl[2] = "   ".length();
        BlockNewLeaf.lIllIlIIllllIl[3] = (0xDF ^ 0xC1 ^ (0xB3 ^ 0xA9));
        BlockNewLeaf.lIllIlIIllllIl[4] = (0xEB ^ 0xB4 ^ (0x26 ^ 0x71));
        BlockNewLeaf.lIllIlIIllllIl[5] = "  ".length();
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIIIIIIIIlIlIIIIlIl) {
        return lllllllllllllIIIIIIIIIlIlIIIIlIl.getValue(BlockNewLeaf.VARIANT).getMetadata();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIIIIIIlIIllIlIII) {
        final IBlockState withProperty = this.getDefaultState().withProperty(BlockNewLeaf.VARIANT, this.getWoodType(lllllllllllllIIIIIIIIIlIIllIlIII));
        final PropertyBool decayable = BlockNewLeaf.DECAYABLE;
        int b;
        if (llllllIIlllllIl(lllllllllllllIIIIIIIIIlIIllIlIII & BlockNewLeaf.lIllIlIIllllIl[3])) {
            b = BlockNewLeaf.lIllIlIIllllIl[1];
            "".length();
            if ((0xA7 ^ 0xA3) <= 0) {
                return null;
            }
        }
        else {
            b = BlockNewLeaf.lIllIlIIllllIl[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)decayable, (boolean)(b != 0));
        final PropertyBool check_DECAY = BlockNewLeaf.CHECK_DECAY;
        int b2;
        if (llllllIIllllllI(lllllllllllllIIIIIIIIIlIIllIlIII & BlockNewLeaf.lIllIlIIllllIl[4])) {
            b2 = BlockNewLeaf.lIllIlIIllllIl[1];
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else {
            b2 = BlockNewLeaf.lIllIlIIllllIl[0];
        }
        return withProperty2.withProperty((IProperty<Comparable>)check_DECAY, (boolean)(b2 != 0));
    }
    
    @Override
    public int getDamageValue(final World lllllllllllllIIIIIIIIIlIIlllllII, final BlockPos lllllllllllllIIIIIIIIIlIIllllllI) {
        final IBlockState lllllllllllllIIIIIIIIIlIIlllllIl = lllllllllllllIIIIIIIIIlIIlllllII.getBlockState(lllllllllllllIIIIIIIIIlIIllllllI);
        return lllllllllllllIIIIIIIIIlIIlllllIl.getBlock().getMetaFromState(lllllllllllllIIIIIIIIIlIIlllllIl) & BlockNewLeaf.lIllIlIIllllIl[2];
    }
    
    private static void llllllIIllllIIl() {
        (lIllIlIIllllII = new String[BlockNewLeaf.lIllIlIIllllIl[1]])[BlockNewLeaf.lIllIlIIllllIl[0]] = llllllIIlllIlll("3AqlMb6XxDc=", "PAFFf");
    }
    
    private static boolean llllllIIllllllI(final int lllllllllllllIIIIIIIIIlIIIlIllIl) {
        return lllllllllllllIIIIIIIIIlIIIlIllIl > 0;
    }
}
