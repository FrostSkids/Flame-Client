// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.block.state.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MathHelper;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import com.google.common.base.Predicate;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;

public class BlockStem extends BlockBush implements IGrowable
{
    private static final /* synthetic */ int[] lIlIIllllIIlll;
    private static final /* synthetic */ String[] lIlIIllllIIllI;
    public static final /* synthetic */ PropertyInteger AGE;
    private final /* synthetic */ Block crop;
    public static final /* synthetic */ PropertyDirection FACING;
    
    @Override
    public Item getItem(final World lllllllllllllIIIlIlllIIlIIIIIllI, final BlockPos lllllllllllllIIIlIlllIIlIIIIIlIl) {
        final Item lllllllllllllIIIlIlllIIlIIIIIlII = this.getSeedItem();
        Item item;
        if (lllIlIIlllllIlI(lllllllllllllIIIlIlllIIlIIIIIlII)) {
            item = lllllllllllllIIIlIlllIIlIIIIIlII;
            "".length();
            if ((0x32 ^ 0x36) <= -" ".length()) {
                return null;
            }
        }
        else {
            item = null;
        }
        return item;
    }
    
    private static String lllIlIIllllIIlI(String lllllllllllllIIIlIlllIIIlIllllll, final String lllllllllllllIIIlIlllIIIlIlllllI) {
        lllllllllllllIIIlIlllIIIlIllllll = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlllIIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlllIIIllIIIIlI = new StringBuilder();
        final char[] lllllllllllllIIIlIlllIIIllIIIIIl = lllllllllllllIIIlIlllIIIlIlllllI.toCharArray();
        int lllllllllllllIIIlIlllIIIllIIIIII = BlockStem.lIlIIllllIIlll[0];
        final double lllllllllllllIIIlIlllIIIlIlllIlI = (Object)lllllllllllllIIIlIlllIIIlIllllll.toCharArray();
        final long lllllllllllllIIIlIlllIIIlIlllIIl = lllllllllllllIIIlIlllIIIlIlllIlI.length;
        double lllllllllllllIIIlIlllIIIlIlllIII = BlockStem.lIlIIllllIIlll[0];
        while (lllIlIIlllllIII((int)lllllllllllllIIIlIlllIIIlIlllIII, (int)lllllllllllllIIIlIlllIIIlIlllIIl)) {
            final char lllllllllllllIIIlIlllIIIllIIIlIl = lllllllllllllIIIlIlllIIIlIlllIlI[lllllllllllllIIIlIlllIIIlIlllIII];
            lllllllllllllIIIlIlllIIIllIIIIlI.append((char)(lllllllllllllIIIlIlllIIIllIIIlIl ^ lllllllllllllIIIlIlllIIIllIIIIIl[lllllllllllllIIIlIlllIIIllIIIIII % lllllllllllllIIIlIlllIIIllIIIIIl.length]));
            "".length();
            ++lllllllllllllIIIlIlllIIIllIIIIII;
            ++lllllllllllllIIIlIlllIIIlIlllIII;
            "".length();
            if ("  ".length() == (33 + 28 + 70 + 9 ^ 54 + 40 + 19 + 23)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlllIIIllIIIIlI);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIlIlllIIlIIIIllII, final Random lllllllllllllIIIlIlllIIlIIIIlIll, final int lllllllllllllIIIlIlllIIlIIIIlIlI) {
        return null;
    }
    
    static {
        lllIlIIllllIlII();
        lllIlIIllllIIll();
        AGE = PropertyInteger.create(BlockStem.lIlIIllllIIllI[BlockStem.lIlIIllllIIlll[0]], BlockStem.lIlIIllllIIlll[0], BlockStem.lIlIIllllIIlll[1]);
        FACING = PropertyDirection.create(BlockStem.lIlIIllllIIllI[BlockStem.lIlIIllllIIlll[2]], (Predicate<EnumFacing>)new Predicate<EnumFacing>() {
            private static final /* synthetic */ int[] lllIIIIIlllllI;
            
            private static void lIIlllIIIlIlIlII() {
                (lllIIIIIlllllI = new int[2])[0] = " ".length();
                BlockStem$1.lllIIIIIlllllI[1] = ((0x5D ^ 0x52) & ~(0x48 ^ 0x47));
            }
            
            private static boolean lIIlllIIIlIlIlIl(final Object llllllllllllIllIIIIllIIlllIIlIll, final Object llllllllllllIllIIIIllIIlllIIlIlI) {
                return llllllllllllIllIIIIllIIlllIIlIll != llllllllllllIllIIIIllIIlllIIlIlI;
            }
            
            public boolean apply(final EnumFacing llllllllllllIllIIIIllIIlllIlIIlI) {
                if (lIIlllIIIlIlIlIl(llllllllllllIllIIIIllIIlllIlIIlI, EnumFacing.DOWN)) {
                    return BlockStem$1.lllIIIIIlllllI[0] != 0;
                }
                return BlockStem$1.lllIIIIIlllllI[1] != 0;
            }
            
            static {
                lIIlllIIIlIlIlII();
            }
        });
    }
    
    private static boolean lllIlIIlllllIll(final int lllllllllllllIIIlIlllIIIlIlIllII, final int lllllllllllllIIIlIlllIIIlIlIlIll) {
        return lllllllllllllIIIlIlllIIIlIlIllII <= lllllllllllllIIIlIlllIIIlIlIlIll;
    }
    
    @Override
    public IBlockState getActualState(IBlockState lllllllllllllIIIlIlllIIllIIIlIlI, final IBlockAccess lllllllllllllIIIlIlllIIllIIIlllI, final BlockPos lllllllllllllIIIlIlllIIllIIIlIII) {
        lllllllllllllIIIlIlllIIllIIIlIlI = lllllllllllllIIIlIlllIIllIIIlIlI.withProperty((IProperty<Comparable>)BlockStem.FACING, EnumFacing.UP);
        final float lllllllllllllIIIlIlllIIllIIIIllI = (float)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ("   ".length() == " ".length()) {
            return null;
        }
        while (!lllIlIIllllIllI(((Iterator)lllllllllllllIIIlIlllIIllIIIIllI).hasNext() ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIlIlllIIllIIIllII = ((Iterator<EnumFacing>)lllllllllllllIIIlIlllIIllIIIIllI).next();
            if (lllIlIIllllIlIl(lllllllllllllIIIlIlllIIllIIIlllI.getBlockState(lllllllllllllIIIlIlllIIllIIIlIII.offset(lllllllllllllIIIlIlllIIllIIIllII)).getBlock(), this.crop)) {
                lllllllllllllIIIlIlllIIllIIIlIlI = lllllllllllllIIIlIlllIIllIIIlIlI.withProperty((IProperty<Comparable>)BlockStem.FACING, lllllllllllllIIIlIlllIIllIIIllII);
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
                break;
            }
        }
        return lllllllllllllIIIlIlllIIllIIIlIlI;
    }
    
    protected Item getSeedItem() {
        Item item;
        if (lllIlIIllllIlIl(this.crop, Blocks.pumpkin)) {
            item = Items.pumpkin_seeds;
            "".length();
            if (((0xA8 ^ 0x9D) & ~(0x89 ^ 0xBC)) != 0x0) {
                return null;
            }
        }
        else if (lllIlIIllllIlIl(this.crop, Blocks.melon_block)) {
            item = Items.melon_seeds;
            "".length();
            if (-(76 + 65 - 42 + 48 ^ 74 + 92 - 64 + 49) >= 0) {
                return null;
            }
        }
        else {
            item = null;
        }
        return item;
    }
    
    private static boolean lllIlIIllllIlll(final int lllllllllllllIIIlIlllIIIlIllIlII, final int lllllllllllllIIIlIlllIIIlIllIIll) {
        return lllllllllllllIIIlIlllIIIlIllIlII >= lllllllllllllIIIlIlllIIIlIllIIll;
    }
    
    @Override
    public boolean canGrow(final World lllllllllllllIIIlIlllIIIllllllll, final BlockPos lllllllllllllIIIlIlllIIIlllllllI, final IBlockState lllllllllllllIIIlIlllIIIllllllIl, final boolean lllllllllllllIIIlIlllIIIllllllII) {
        if (lllIlIIllllllII(lllllllllllllIIIlIlllIIIllllllIl.getValue((IProperty<Integer>)BlockStem.AGE), BlockStem.lIlIIllllIIlll[1])) {
            return BlockStem.lIlIIllllIIlll[2] != 0;
        }
        return BlockStem.lIlIIllllIIlll[0] != 0;
    }
    
    private static boolean lllIlIIllllllII(final int lllllllllllllIIIlIlllIIIlIIlllII, final int lllllllllllllIIIlIlllIIIlIIllIll) {
        return lllllllllllllIIIlIlllIIIlIIlllII != lllllllllllllIIIlIlllIIIlIIllIll;
    }
    
    private static void lllIlIIllllIlII() {
        (lIlIIllllIIlll = new int[13])[0] = ((0x4F ^ 0x8 ^ (0xD9 ^ 0xAA)) & (108 + 112 - 201 + 120 ^ 86 + 17 + 53 + 35 ^ -" ".length()));
        BlockStem.lIlIIllllIIlll[1] = (0x24 ^ 0x23);
        BlockStem.lIlIIllllIIlll[2] = " ".length();
        BlockStem.lIlIIllllIIlll[3] = (0x5F ^ 0x56);
        BlockStem.lIlIIllllIIlll[4] = "  ".length();
        BlockStem.lIlIIllllIIlll[5] = (0x6F ^ 0xE ^ (0x41 ^ 0x25));
        BlockStem.lIlIIllllIIlll[6] = (0xA0 ^ 0x80);
        BlockStem.lIlIIllllIIlll[7] = 134 + 147 - 224 + 198;
        BlockStem.lIlIIllllIIlll[8] = (0x60 ^ 0x72 ^ (0x28 ^ 0x32));
        BlockStem.lIlIIllllIIlll[9] = (0x46 ^ 0x63 ^ (0x7D ^ 0x5C));
        BlockStem.lIlIIllllIIlll[10] = (30 + 85 - 49 + 65 ^ 73 + 28 - 97 + 143);
        BlockStem.lIlIIllllIIlll[11] = (0x81 ^ 0x8E);
        BlockStem.lIlIIllllIIlll[12] = "   ".length();
    }
    
    private static boolean lllIlIIllllIllI(final int lllllllllllllIIIlIlllIIIlIIlllll) {
        return lllllllllllllIIIlIlllIIIlIIlllll == 0;
    }
    
    @Override
    public void grow(final World lllllllllllllIIIlIlllIIIlllIlIll, final Random lllllllllllllIIIlIlllIIIlllIllll, final BlockPos lllllllllllllIIIlIlllIIIlllIlIlI, final IBlockState lllllllllllllIIIlIlllIIIlllIlIIl) {
        this.growStem(lllllllllllllIIIlIlllIIIlllIlIll, lllllllllllllIIIlIlllIIIlllIlIlI, lllllllllllllIIIlIlllIIIlllIlIIl);
    }
    
    @Override
    public void updateTick(final World lllllllllllllIIIlIlllIIlIllIlllI, BlockPos lllllllllllllIIIlIlllIIlIlllIllI, IBlockState lllllllllllllIIIlIlllIIlIllIllII, final Random lllllllllllllIIIlIlllIIlIllIlIll) {
        super.updateTick(lllllllllllllIIIlIlllIIlIllIlllI, lllllllllllllIIIlIlllIIlIlllIllI, lllllllllllllIIIlIlllIIlIllIllII, lllllllllllllIIIlIlllIIlIllIlIll);
        if (lllIlIIllllIlll(lllllllllllllIIIlIlllIIlIllIlllI.getLightFromNeighbors(lllllllllllllIIIlIlllIIlIlllIllI.up()), BlockStem.lIlIIllllIIlll[3])) {
            final float lllllllllllllIIIlIlllIIlIlllIIll = BlockCrops.getGrowthChance(this, lllllllllllllIIIlIlllIIlIllIlllI, lllllllllllllIIIlIlllIIlIlllIllI);
            if (lllIlIIllllIllI(lllllllllllllIIIlIlllIIlIllIlIll.nextInt((int)(25.0f / lllllllllllllIIIlIlllIIlIlllIIll) + BlockStem.lIlIIllllIIlll[2]))) {
                final int lllllllllllllIIIlIlllIIlIlllIIlI = lllllllllllllIIIlIlllIIlIllIllII.getValue((IProperty<Integer>)BlockStem.AGE);
                if (lllIlIIlllllIII(lllllllllllllIIIlIlllIIlIlllIIlI, BlockStem.lIlIIllllIIlll[1])) {
                    lllllllllllllIIIlIlllIIlIllIllII = lllllllllllllIIIlIlllIIlIllIllII.withProperty((IProperty<Comparable>)BlockStem.AGE, lllllllllllllIIIlIlllIIlIlllIIlI + BlockStem.lIlIIllllIIlll[2]);
                    lllllllllllllIIIlIlllIIlIllIlllI.setBlockState(lllllllllllllIIIlIlllIIlIlllIllI, lllllllllllllIIIlIlllIIlIllIllII, BlockStem.lIlIIllllIIlll[4]);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    final short lllllllllllllIIIlIlllIIlIllIIlll = (short)EnumFacing.Plane.HORIZONTAL.iterator();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    while (!lllIlIIllllIllI(((Iterator)lllllllllllllIIIlIlllIIlIllIIlll).hasNext() ? 1 : 0)) {
                        final EnumFacing lllllllllllllIIIlIlllIIlIlllIIIl = ((Iterator<EnumFacing>)lllllllllllllIIIlIlllIIlIllIIlll).next();
                        if (lllIlIIllllIlIl(lllllllllllllIIIlIlllIIlIllIlllI.getBlockState(lllllllllllllIIIlIlllIIlIlllIllI.offset(lllllllllllllIIIlIlllIIlIlllIIIl)).getBlock(), this.crop)) {
                            return;
                        }
                    }
                    lllllllllllllIIIlIlllIIlIlllIllI = lllllllllllllIIIlIlllIIlIlllIllI.offset(EnumFacing.Plane.HORIZONTAL.random(lllllllllllllIIIlIlllIIlIllIlIll));
                    final Block lllllllllllllIIIlIlllIIlIlllIIII = lllllllllllllIIIlIlllIIlIllIlllI.getBlockState(lllllllllllllIIIlIlllIIlIlllIllI.down()).getBlock();
                    if (lllIlIIllllIlIl(lllllllllllllIIIlIlllIIlIllIlllI.getBlockState(lllllllllllllIIIlIlllIIlIlllIllI).getBlock().blockMaterial, Material.air) && (!lllIlIIlllllIIl(lllllllllllllIIIlIlllIIlIlllIIII, Blocks.farmland) || !lllIlIIlllllIIl(lllllllllllllIIIlIlllIIlIlllIIII, Blocks.dirt) || lllIlIIllllIlIl(lllllllllllllIIIlIlllIIlIlllIIII, Blocks.grass))) {
                        lllllllllllllIIIlIlllIIlIllIlllI.setBlockState(lllllllllllllIIIlIlllIIlIlllIllI, this.crop.getDefaultState());
                        "".length();
                    }
                }
            }
        }
    }
    
    public void growStem(final World lllllllllllllIIIlIlllIIlIlIlllIl, final BlockPos lllllllllllllIIIlIlllIIlIlIlllII, final IBlockState lllllllllllllIIIlIlllIIlIlIlllll) {
        final int lllllllllllllIIIlIlllIIlIlIllllI = lllllllllllllIIIlIlllIIlIlIlllll.getValue((IProperty<Integer>)BlockStem.AGE) + MathHelper.getRandomIntegerInRange(lllllllllllllIIIlIlllIIlIlIlllIl.rand, BlockStem.lIlIIllllIIlll[4], BlockStem.lIlIIllllIIlll[5]);
        lllllllllllllIIIlIlllIIlIlIlllIl.setBlockState(lllllllllllllIIIlIlllIIlIlIlllII, lllllllllllllIIIlIlllIIlIlIlllll.withProperty((IProperty<Comparable>)BlockStem.AGE, Math.min(BlockStem.lIlIIllllIIlll[1], lllllllllllllIIIlIlllIIlIlIllllI)), BlockStem.lIlIIllllIIlll[4]);
        "".length();
    }
    
    private static void lllIlIIllllIIll() {
        (lIlIIllllIIllI = new String[BlockStem.lIlIIllllIIlll[4]])[BlockStem.lIlIIllllIIlll[0]] = lllIlIIllllIIIl("ucR3AjTpJKA=", "BKEwj");
        BlockStem.lIlIIllllIIllI[BlockStem.lIlIIllllIIlll[2]] = lllIlIIllllIIlI("FAIBGioV", "rcbsD");
    }
    
    @Override
    public int getRenderColor(final IBlockState lllllllllllllIIIlIlllIIlIlIIllII) {
        if (lllIlIIlllllIIl(lllllllllllllIIIlIlllIIlIlIIllII.getBlock(), this)) {
            return super.getRenderColor(lllllllllllllIIIlIlllIIlIlIIllII);
        }
        final int lllllllllllllIIIlIlllIIlIlIlIIIl = lllllllllllllIIIlIlllIIlIlIIllII.getValue((IProperty<Integer>)BlockStem.AGE);
        final int lllllllllllllIIIlIlllIIlIlIlIIII = lllllllllllllIIIlIlllIIlIlIlIIIl * BlockStem.lIlIIllllIIlll[6];
        final int lllllllllllllIIIlIlllIIlIlIIllll = BlockStem.lIlIIllllIIlll[7] - lllllllllllllIIIlIlllIIlIlIlIIIl * BlockStem.lIlIIllllIIlll[8];
        final int lllllllllllllIIIlIlllIIlIlIIlllI = lllllllllllllIIIlIlllIIlIlIlIIIl * BlockStem.lIlIIllllIIlll[9];
        return lllllllllllllIIIlIlllIIlIlIlIIII << BlockStem.lIlIIllllIIlll[10] | lllllllllllllIIIlIlllIIlIlIIllll << BlockStem.lIlIIllllIIlll[8] | lllllllllllllIIIlIlllIIlIlIIlllI;
    }
    
    private static boolean lllIlIIllllIlIl(final Object lllllllllllllIIIlIlllIIIlIlIIlII, final Object lllllllllllllIIIlIlllIIIlIlIIIll) {
        return lllllllllllllIIIlIlllIIIlIlIIlII == lllllllllllllIIIlIlllIIIlIlIIIll;
    }
    
    private static boolean lllIlIIlllllIIl(final Object lllllllllllllIIIlIlllIIIlIlIlIII, final Object lllllllllllllIIIlIlllIIIlIlIIlll) {
        return lllllllllllllIIIlIlllIIIlIlIlIII != lllllllllllllIIIlIlllIIIlIlIIlll;
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        final float lllllllllllllIIIlIlllIIlIIlllIlI = 0.125f;
        this.setBlockBounds(0.5f - lllllllllllllIIIlIlllIIlIIlllIlI, 0.0f, 0.5f - lllllllllllllIIIlIlllIIlIIlllIlI, 0.5f + lllllllllllllIIIlIlllIIlIIlllIlI, 0.25f, 0.5f + lllllllllllllIIIlIlllIIlIIlllIlI);
    }
    
    protected BlockStem(final Block lllllllllllllIIIlIlllIIllIIllIll) {
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockStem.AGE, BlockStem.lIlIIllllIIlll[0]).withProperty((IProperty<Comparable>)BlockStem.FACING, EnumFacing.UP));
        this.crop = lllllllllllllIIIlIlllIIllIIllIll;
        this.setTickRandomly((boolean)(BlockStem.lIlIIllllIIlll[2] != 0));
        "".length();
        final float lllllllllllllIIIlIlllIIllIIllIlI = 0.125f;
        this.setBlockBounds(0.5f - lllllllllllllIIIlIlllIIllIIllIlI, 0.0f, 0.5f - lllllllllllllIIIlIlllIIllIIllIlI, 0.5f + lllllllllllllIIIlIlllIIllIIllIlI, 0.25f, 0.5f + lllllllllllllIIIlIlllIIllIIllIlI);
        this.setCreativeTab(null);
        "".length();
    }
    
    @Override
    public boolean canUseBonemeal(final World lllllllllllllIIIlIlllIIIlllllIIl, final Random lllllllllllllIIIlIlllIIIlllllIII, final BlockPos lllllllllllllIIIlIlllIIIllllIlll, final IBlockState lllllllllllllIIIlIlllIIIllllIllI) {
        return BlockStem.lIlIIllllIIlll[2] != 0;
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIIIlIlllIIlIIIllIII, final BlockPos lllllllllllllIIIlIlllIIlIIIlIlll, final IBlockState lllllllllllllIIIlIlllIIlIIIlIllI, final float lllllllllllllIIIlIlllIIlIIIlIlIl, final int lllllllllllllIIIlIlllIIlIIIlllIl) {
        super.dropBlockAsItemWithChance(lllllllllllllIIIlIlllIIlIIIllIII, lllllllllllllIIIlIlllIIlIIIlIlll, lllllllllllllIIIlIlllIIlIIIlIllI, lllllllllllllIIIlIlllIIlIIIlIlIl, lllllllllllllIIIlIlllIIlIIIlllIl);
        if (lllIlIIllllIllI(lllllllllllllIIIlIlllIIlIIIllIII.isRemote ? 1 : 0)) {
            final Item lllllllllllllIIIlIlllIIlIIIlllII = this.getSeedItem();
            if (lllIlIIlllllIlI(lllllllllllllIIIlIlllIIlIIIlllII)) {
                final int lllllllllllllIIIlIlllIIlIIIllIll = lllllllllllllIIIlIlllIIlIIIlIllI.getValue((IProperty<Integer>)BlockStem.AGE);
                int lllllllllllllIIIlIlllIIlIIIllIlI = BlockStem.lIlIIllllIIlll[0];
                "".length();
                if (((0x3A ^ 0x79) & ~(0x49 ^ 0xA)) != 0x0) {
                    return;
                }
                while (!lllIlIIllllIlll(lllllllllllllIIIlIlllIIlIIIllIlI, BlockStem.lIlIIllllIIlll[12])) {
                    if (lllIlIIlllllIll(lllllllllllllIIIlIlllIIlIIIllIII.rand.nextInt(BlockStem.lIlIIllllIIlll[11]), lllllllllllllIIIlIlllIIlIIIllIll)) {
                        Block.spawnAsEntity(lllllllllllllIIIlIlllIIlIIIllIII, lllllllllllllIIIlIlllIIlIIIlIlll, new ItemStack(lllllllllllllIIIlIlllIIlIIIlllII));
                    }
                    ++lllllllllllllIIIlIlllIIlIIIllIlI;
                }
            }
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIlIlllIIIlllIIIll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockStem.AGE, lllllllllllllIIIlIlllIIIlllIIIll);
    }
    
    private static boolean lllIlIIlllllIlI(final Object lllllllllllllIIIlIlllIIIlIlIIIIl) {
        return lllllllllllllIIIlIlllIIIlIlIIIIl != null;
    }
    
    @Override
    protected boolean canPlaceBlockOn(final Block lllllllllllllIIIlIlllIIllIIIIIlI) {
        if (lllIlIIllllIlIl(lllllllllllllIIIlIlllIIllIIIIIlI, Blocks.farmland)) {
            return BlockStem.lIlIIllllIIlll[2] != 0;
        }
        return BlockStem.lIlIIllllIIlll[0] != 0;
    }
    
    private static boolean lllIlIIlllllIII(final int lllllllllllllIIIlIlllIIIlIllIIII, final int lllllllllllllIIIlIlllIIIlIlIllll) {
        return lllllllllllllIIIlIlllIIIlIllIIII < lllllllllllllIIIlIlllIIIlIlIllll;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStem.lIlIIllllIIlll[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStem.lIlIIllllIIlll[0]] = BlockStem.AGE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStem.lIlIIllllIIlll[2]] = BlockStem.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIlIlllIIIlllIIIII) {
        return lllllllllllllIIIlIlllIIIlllIIIII.getValue((IProperty<Integer>)BlockStem.AGE);
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIlIlllIIlIIllIIlI, final BlockPos lllllllllllllIIIlIlllIIlIIllIIIl) {
        this.maxY = (lllllllllllllIIIlIlllIIlIIllIIlI.getBlockState(lllllllllllllIIIlIlllIIlIIllIIIl).getValue((IProperty<Integer>)BlockStem.AGE) * BlockStem.lIlIIllllIIlll[4] + BlockStem.lIlIIllllIIlll[4]) / 16.0f;
        final float lllllllllllllIIIlIlllIIlIIllIIII = 0.125f;
        this.setBlockBounds(0.5f - lllllllllllllIIIlIlllIIlIIllIIII, 0.0f, 0.5f - lllllllllllllIIIlIlllIIlIIllIIII, 0.5f + lllllllllllllIIIlIlllIIlIIllIIII, (float)this.maxY, 0.5f + lllllllllllllIIIlIlllIIlIIllIIII);
    }
    
    private static String lllIlIIllllIIIl(final String lllllllllllllIIIlIlllIIIllIlIlII, final String lllllllllllllIIIlIlllIIIllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlllIIIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlllIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlllIIIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlllIIIllIlIllI.init(BlockStem.lIlIIllllIIlll[4], lllllllllllllIIIlIlllIIIllIlIlll);
            return new String(lllllllllllllIIIlIlllIIIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlllIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlllIIIllIlIlIl) {
            lllllllllllllIIIlIlllIIIllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess lllllllllllllIIIlIlllIIlIlIIIIll, final BlockPos lllllllllllllIIIlIlllIIlIlIIIIlI, final int lllllllllllllIIIlIlllIIlIlIIIIIl) {
        return this.getRenderColor(lllllllllllllIIIlIlllIIlIlIIIIll.getBlockState(lllllllllllllIIIlIlllIIlIlIIIIlI));
    }
}
