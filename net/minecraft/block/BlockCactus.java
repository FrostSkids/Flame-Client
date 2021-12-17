// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyInteger;

public class BlockCactus extends Block
{
    private static final /* synthetic */ int[] lllIIlIIIIllIl;
    private static final /* synthetic */ String[] lllIIlIIIIllII;
    public static final /* synthetic */ PropertyInteger AGE;
    
    private static boolean lIIllllIllIIllIl(final int llllllllllllIlIlllllIlIIIIIIlIIl, final int llllllllllllIlIlllllIlIIIIIIlIII) {
        return llllllllllllIlIlllllIlIIIIIIlIIl == llllllllllllIlIlllllIlIIIIIIlIII;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIlIlllllIlIIIlIllllI, final BlockPos llllllllllllIlIlllllIlIIIlIlllIl, final IBlockState llllllllllllIlIlllllIlIIIlIlllII) {
        final float llllllllllllIlIlllllIlIIIlIllIll = 0.0625f;
        return new AxisAlignedBB(llllllllllllIlIlllllIlIIIlIlllIl.getX() + llllllllllllIlIlllllIlIIIlIllIll, llllllllllllIlIlllllIlIIIlIlllIl.getY(), llllllllllllIlIlllllIlIIIlIlllIl.getZ() + llllllllllllIlIlllllIlIIIlIllIll, llllllllllllIlIlllllIlIIIlIlllIl.getX() + BlockCactus.lllIIlIIIIllIl[2] - llllllllllllIlIlllllIlIIIlIllIll, llllllllllllIlIlllllIlIIIlIlllIl.getY() + BlockCactus.lllIIlIIIIllIl[2] - llllllllllllIlIlllllIlIIIlIllIll, llllllllllllIlIlllllIlIIIlIlllIl.getZ() + BlockCactus.lllIIlIIIIllIl[2] - llllllllllllIlIlllllIlIIIlIllIll);
    }
    
    private static void lIIllllIllIIlIIl() {
        (lllIIlIIIIllIl = new int[7])[0] = ((144 + 62 - 32 + 70 ^ 145 + 144 - 181 + 60) & (76 + 106 - 166 + 211 ^ 183 + 137 - 310 + 181 ^ -" ".length()));
        BlockCactus.lllIIlIIIIllIl[1] = (0x85 ^ 0xA6 ^ (0xBE ^ 0x92));
        BlockCactus.lllIIlIIIIllIl[2] = " ".length();
        BlockCactus.lllIIlIIIIllIl[3] = "   ".length();
        BlockCactus.lllIIlIIIIllIl[4] = (0x7B ^ 0x39 ^ (0xC8 ^ 0x8E));
        BlockCactus.lllIIlIIIIllIl[5] = (0x6B ^ 0x63);
        BlockCactus.lllIIlIIIIllIl[6] = "  ".length();
    }
    
    private static boolean lIIllllIllIIlllI(final int llllllllllllIlIlllllIIllllllllII) {
        return llllllllllllIlIlllllIIllllllllII == 0;
    }
    
    private static String lIIllllIllIIIlll(final String llllllllllllIlIlllllIlIIIIIIllll, final String llllllllllllIlIlllllIlIIIIIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIlIIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIlIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), BlockCactus.lllIIlIIIIllIl[5]), "DES");
            final Cipher llllllllllllIlIlllllIlIIIIIlIIll = Cipher.getInstance("DES");
            llllllllllllIlIlllllIlIIIIIlIIll.init(BlockCactus.lllIIlIIIIllIl[6], llllllllllllIlIlllllIlIIIIIlIlII);
            return new String(llllllllllllIlIlllllIlIIIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIlIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIlIIIIIlIIlI) {
            llllllllllllIlIlllllIlIIIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllIllIIllII(final int llllllllllllIlIlllllIlIIIIIIIlIl, final int llllllllllllIlIlllllIlIIIIIIIlII) {
        return llllllllllllIlIlllllIlIIIIIIIlIl < llllllllllllIlIlllllIlIIIIIIIlII;
    }
    
    private static void lIIllllIllIIlIII() {
        (lllIIlIIIIllII = new String[BlockCactus.lllIIlIIIIllIl[2]])[BlockCactus.lllIIlIIIIllIl[0]] = lIIllllIllIIIlll("jLrSVaCV5pE=", "pUckF");
    }
    
    @Override
    public boolean isFullCube() {
        return BlockCactus.lllIIlIIIIllIl[0] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIlllllIlIIIIlIIIlI) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockCactus.AGE, llllllllllllIlIlllllIlIIIIlIIIlI);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockCactus.lllIIlIIIIllIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCactus.lllIIlIIIIllIl[0]] = BlockCactus.AGE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    public boolean canBlockStay(final World llllllllllllIlIlllllIlIIIIllIIIl, final BlockPos llllllllllllIlIlllllIlIIIIllIIII) {
        final String llllllllllllIlIlllllIlIIIIlIlllI = (String)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ("   ".length() >= (0xC5 ^ 0xC1)) {
            return ((0x72 ^ 0x25) & ~(0xD ^ 0x5A)) != 0x0;
        }
        while (!lIIllllIllIIlllI(((Iterator)llllllllllllIlIlllllIlIIIIlIlllI).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIlIlllllIlIIIIllIIll = ((Iterator<EnumFacing>)llllllllllllIlIlllllIlIIIIlIlllI).next();
            if (lIIllllIllIIlIlI(llllllllllllIlIlllllIlIIIIllIIIl.getBlockState(llllllllllllIlIlllllIlIIIIllIIII.offset(llllllllllllIlIlllllIlIIIIllIIll)).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                return BlockCactus.lllIIlIIIIllIl[0] != 0;
            }
        }
        final Block llllllllllllIlIlllllIlIIIIllIIlI = llllllllllllIlIlllllIlIIIIllIIIl.getBlockState(llllllllllllIlIlllllIlIIIIllIIII.down()).getBlock();
        if (lIIllllIllIIlIll(llllllllllllIlIlllllIlIIIIllIIlI, Blocks.cactus) && lIIllllIllIIlIll(llllllllllllIlIlllllIlIIIIllIIlI, Blocks.sand)) {
            return BlockCactus.lllIIlIIIIllIl[0] != 0;
        }
        return BlockCactus.lllIIlIIIIllIl[2] != 0;
    }
    
    private static boolean lIIllllIllIIlIlI(final int llllllllllllIlIlllllIIlllllllllI) {
        return llllllllllllIlIlllllIIlllllllllI != 0;
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World llllllllllllIlIlllllIlIIIlIlIlIl, final BlockPos llllllllllllIlIlllllIlIIIlIlIlII) {
        final float llllllllllllIlIlllllIlIIIlIlIIll = 0.0625f;
        return new AxisAlignedBB(llllllllllllIlIlllllIlIIIlIlIlII.getX() + llllllllllllIlIlllllIlIIIlIlIIll, llllllllllllIlIlllllIlIIIlIlIlII.getY(), llllllllllllIlIlllllIlIIIlIlIlII.getZ() + llllllllllllIlIlllllIlIIIlIlIIll, llllllllllllIlIlllllIlIIIlIlIlII.getX() + BlockCactus.lllIIlIIIIllIl[2] - llllllllllllIlIlllllIlIIIlIlIIll, llllllllllllIlIlllllIlIIIlIlIlII.getY() + BlockCactus.lllIIlIIIIllIl[2], llllllllllllIlIlllllIlIIIlIlIlII.getZ() + BlockCactus.lllIIlIIIIllIl[2] - llllllllllllIlIlllllIlIIIlIlIIll);
    }
    
    @Override
    public void updateTick(final World llllllllllllIlIlllllIlIIIlllIIIl, final BlockPos llllllllllllIlIlllllIlIIIllIIlll, final IBlockState llllllllllllIlIlllllIlIIIllIllll, final Random llllllllllllIlIlllllIlIIIllIlllI) {
        final BlockPos llllllllllllIlIlllllIlIIIllIllIl = llllllllllllIlIlllllIlIIIllIIlll.up();
        if (lIIllllIllIIlIlI(llllllllllllIlIlllllIlIIIlllIIIl.isAirBlock(llllllllllllIlIlllllIlIIIllIllIl) ? 1 : 0)) {
            int llllllllllllIlIlllllIlIIIllIllII = BlockCactus.lllIIlIIIIllIl[2];
            "".length();
            if ((32 + 29 + 69 + 51 ^ 48 + 86 + 38 + 4) == 0x0) {
                return;
            }
            while (!lIIllllIllIIlIll(llllllllllllIlIlllllIlIIIlllIIIl.getBlockState(llllllllllllIlIlllllIlIIIllIIlll.down(llllllllllllIlIlllllIlIIIllIllII)).getBlock(), this)) {
                ++llllllllllllIlIlllllIlIIIllIllII;
            }
            if (lIIllllIllIIllII(llllllllllllIlIlllllIlIIIllIllII, BlockCactus.lllIIlIIIIllIl[3])) {
                final int llllllllllllIlIlllllIlIIIllIlIll = llllllllllllIlIlllllIlIIIllIllll.getValue((IProperty<Integer>)BlockCactus.AGE);
                if (lIIllllIllIIllIl(llllllllllllIlIlllllIlIIIllIlIll, BlockCactus.lllIIlIIIIllIl[1])) {
                    llllllllllllIlIlllllIlIIIlllIIIl.setBlockState(llllllllllllIlIlllllIlIIIllIllIl, this.getDefaultState());
                    "".length();
                    final IBlockState llllllllllllIlIlllllIlIIIllIlIlI = llllllllllllIlIlllllIlIIIllIllll.withProperty((IProperty<Comparable>)BlockCactus.AGE, BlockCactus.lllIIlIIIIllIl[0]);
                    llllllllllllIlIlllllIlIIIlllIIIl.setBlockState(llllllllllllIlIlllllIlIIIllIIlll, llllllllllllIlIlllllIlIIIllIlIlI, BlockCactus.lllIIlIIIIllIl[4]);
                    "".length();
                    this.onNeighborBlockChange(llllllllllllIlIlllllIlIIIlllIIIl, llllllllllllIlIlllllIlIIIllIllIl, llllllllllllIlIlllllIlIIIllIlIlI, this);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIlllllIlIIIlllIIIl.setBlockState(llllllllllllIlIlllllIlIIIllIIlll, llllllllllllIlIlllllIlIIIllIllll.withProperty((IProperty<Comparable>)BlockCactus.AGE, llllllllllllIlIlllllIlIIIllIlIll + BlockCactus.lllIIlIIIIllIl[2]), BlockCactus.lllIIlIIIIllIl[4]);
                    "".length();
                }
            }
        }
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockCactus.lllIIlIIIIllIl[0] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    private static boolean lIIllllIllIIlIll(final Object llllllllllllIlIlllllIlIIIIIIIIIl, final Object llllllllllllIlIlllllIlIIIIIIIIII) {
        return llllllllllllIlIlllllIlIIIIIIIIIl != llllllllllllIlIlllllIlIIIIIIIIII;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlIlllllIlIIIIllllII, final BlockPos llllllllllllIlIlllllIlIIIlIIIIII, final IBlockState llllllllllllIlIlllllIlIIIIllllll, final Block llllllllllllIlIlllllIlIIIIlllllI) {
        if (lIIllllIllIIlllI(this.canBlockStay(llllllllllllIlIlllllIlIIIIllllII, llllllllllllIlIlllllIlIIIlIIIIII) ? 1 : 0)) {
            llllllllllllIlIlllllIlIIIIllllII.destroyBlock(llllllllllllIlIlllllIlIIIlIIIIII, (boolean)(BlockCactus.lllIIlIIIIllIl[2] != 0));
            "".length();
        }
    }
    
    static {
        lIIllllIllIIlIIl();
        lIIllllIllIIlIII();
        AGE = PropertyInteger.create(BlockCactus.lllIIlIIIIllII[BlockCactus.lllIIlIIIIllIl[0]], BlockCactus.lllIIlIIIIllIl[0], BlockCactus.lllIIlIIIIllIl[1]);
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIlIlllllIlIIIlIIlIlI, final BlockPos llllllllllllIlIlllllIlIIIlIIlIIl) {
        int canBlockStay;
        if (lIIllllIllIIlIlI(super.canPlaceBlockAt(llllllllllllIlIlllllIlIIIlIIlIlI, llllllllllllIlIlllllIlIIIlIIlIIl) ? 1 : 0)) {
            canBlockStay = (this.canBlockStay(llllllllllllIlIlllllIlIIIlIIlIlI, llllllllllllIlIlllllIlIIIlIIlIIl) ? 1 : 0);
            "".length();
            if (((0x30 ^ 0x7) & ~(0x2B ^ 0x1C)) < 0) {
                return ((0xC1 ^ 0x98) & ~(0xEA ^ 0xB3)) != 0x0;
            }
        }
        else {
            canBlockStay = BlockCactus.lllIIlIIIIllIl[0];
        }
        return canBlockStay != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIlllllIlIIIIIlllIl) {
        return llllllllllllIlIlllllIlIIIIIlllIl.getValue((IProperty<Integer>)BlockCactus.AGE);
    }
    
    protected BlockCactus() {
        super(Material.cactus);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockCactus.AGE, BlockCactus.lllIIlIIIIllIl[0]));
        this.setTickRandomly((boolean)(BlockCactus.lllIIlIIIIllIl[2] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World llllllllllllIlIlllllIlIIIIlIlIll, final BlockPos llllllllllllIlIlllllIlIIIIlIlIlI, final IBlockState llllllllllllIlIlllllIlIIIIlIlIIl, final Entity llllllllllllIlIlllllIlIIIIlIIlll) {
        llllllllllllIlIlllllIlIIIIlIIlll.attackEntityFrom(DamageSource.cactus, 1.0f);
        "".length();
    }
}
