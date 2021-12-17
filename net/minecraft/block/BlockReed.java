// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import java.util.Random;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyInteger;

public class BlockReed extends Block
{
    public static final /* synthetic */ PropertyInteger AGE;
    private static final /* synthetic */ int[] llIIllIlllllll;
    private static final /* synthetic */ String[] llIIllIllllllI;
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIllllllIIIlIIIllI, final BlockPos llllllllllllIllIllllllIIIlIIIIII, final IBlockState llllllllllllIllIllllllIIIlIIIlII, final Block llllllllllllIllIllllllIIIlIIIIll) {
        this.checkForDrop(llllllllllllIllIllllllIIIlIIIllI, llllllllllllIllIllllllIIIlIIIIII, llllllllllllIllIllllllIIIlIIIlII);
        "".length();
    }
    
    private static boolean lIIIllllIlIIIlll(final int llllllllllllIllIlllllIlllllIIllI) {
        return llllllllllllIllIlllllIlllllIIllI == 0;
    }
    
    @Override
    public Item getItem(final World llllllllllllIllIllllllIIIIIllllI, final BlockPos llllllllllllIllIllllllIIIIIlllIl) {
        return Items.reeds;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIllIllllllIIIIlIlIII, final BlockPos llllllllllllIllIllllllIIIIlIIlll, final IBlockState llllllllllllIllIllllllIIIIlIIllI) {
        return null;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllIllllllIIIIlIIlII, final Random llllllllllllIllIllllllIIIIlIIIll, final int llllllllllllIllIllllllIIIIlIIIlI) {
        return Items.reeds;
    }
    
    private static boolean lIIIllllIlIIIIlI(final Object llllllllllllIllIlllllIlllllIllll, final Object llllllllllllIllIlllllIlllllIlllI) {
        return llllllllllllIllIlllllIlllllIllll != llllllllllllIllIlllllIlllllIlllI;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIllllllIIIIIIlIll) {
        return llllllllllllIllIllllllIIIIIIlIll.getValue((IProperty<Integer>)BlockReed.AGE);
    }
    
    static {
        lIIIllllIlIIIIIl();
        lIIIllllIlIIIIII();
        AGE = PropertyInteger.create(BlockReed.llIIllIllllllI[BlockReed.llIIllIlllllll[0]], BlockReed.llIIllIlllllll[0], BlockReed.llIIllIlllllll[1]);
    }
    
    private static boolean lIIIllllIlIIIllI(final Object llllllllllllIllIlllllIlllllIlIll, final Object llllllllllllIllIlllllIlllllIlIlI) {
        return llllllllllllIllIlllllIlllllIlIll == llllllllllllIllIlllllIlllllIlIlI;
    }
    
    protected final boolean checkForDrop(final World llllllllllllIllIllllllIIIIllIlIl, final BlockPos llllllllllllIllIllllllIIIIllIlII, final IBlockState llllllllllllIllIllllllIIIIllIIll) {
        if (lIIIllllIlIIIIll(this.canBlockStay(llllllllllllIllIllllllIIIIllIlIl, llllllllllllIllIllllllIIIIllIlII) ? 1 : 0)) {
            return BlockReed.llIIllIlllllll[2] != 0;
        }
        this.dropBlockAsItem(llllllllllllIllIllllllIIIIllIlIl, llllllllllllIllIllllllIIIIllIlII, llllllllllllIllIllllllIIIIllIIll, BlockReed.llIIllIlllllll[0]);
        llllllllllllIllIllllllIIIIllIlIl.setBlockToAir(llllllllllllIllIllllllIIIIllIlII);
        "".length();
        return BlockReed.llIIllIlllllll[0] != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockReed.llIIllIlllllll[0] != 0;
    }
    
    private static boolean lIIIllllIlIIIlII(final int llllllllllllIllIlllllIllllllIIll, final int llllllllllllIllIlllllIllllllIIlI) {
        return llllllllllllIllIlllllIllllllIIll < llllllllllllIllIlllllIllllllIIlI;
    }
    
    private static boolean lIIIllllIlIIIIll(final int llllllllllllIllIlllllIlllllIlIII) {
        return llllllllllllIllIlllllIlllllIlIII != 0;
    }
    
    private static boolean lIIIllllIlIIIlIl(final int llllllllllllIllIlllllIllllllIlll, final int llllllllllllIllIlllllIllllllIllI) {
        return llllllllllllIllIlllllIllllllIlll == llllllllllllIllIlllllIllllllIllI;
    }
    
    public boolean canBlockStay(final World llllllllllllIllIllllllIIIIlIlIll, final BlockPos llllllllllllIllIllllllIIIIlIlIlI) {
        return this.canPlaceBlockAt(llllllllllllIllIllllllIIIIlIlIll, llllllllllllIllIllllllIIIIlIlIlI);
    }
    
    private static void lIIIllllIlIIIIIl() {
        (llIIllIlllllll = new int[7])[0] = ((((0x45 ^ 0x70) & ~(0x7F ^ 0x4A)) ^ (0x99 ^ 0x80)) & (0x2A ^ 0x6A ^ (0x68 ^ 0x31) ^ -" ".length()));
        BlockReed.llIIllIlllllll[1] = (0x66 ^ 0x69);
        BlockReed.llIIllIlllllll[2] = " ".length();
        BlockReed.llIIllIlllllll[3] = "   ".length();
        BlockReed.llIIllIlllllll[4] = (0xBA ^ 0xBE);
        BlockReed.llIIllIlllllll[5] = (" ".length() ^ (0x9D ^ 0x94));
        BlockReed.llIIllIlllllll[6] = "  ".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockReed.llIIllIlllllll[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockReed.llIIllIlllllll[0]] = BlockReed.AGE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void lIIIllllIlIIIIII() {
        (llIIllIllllllI = new String[BlockReed.llIIllIlllllll[2]])[BlockReed.llIIllIlllllll[0]] = lIIIllllIIllllll("+nTajeIprJc=", "pQEdu");
    }
    
    @Override
    public boolean isFullCube() {
        return BlockReed.llIIllIlllllll[0] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    private static String lIIIllllIIllllll(final String llllllllllllIllIlllllIllllllllll, final String llllllllllllIllIlllllIllllllllII) {
        try {
            final SecretKeySpec llllllllllllIllIllllllIIIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIllllllllII.getBytes(StandardCharsets.UTF_8)), BlockReed.llIIllIlllllll[5]), "DES");
            final Cipher llllllllllllIllIllllllIIIIIIIIIl = Cipher.getInstance("DES");
            llllllllllllIllIllllllIIIIIIIIIl.init(BlockReed.llIIllIlllllll[6], llllllllllllIllIllllllIIIIIIIIlI);
            return new String(llllllllllllIllIllllllIIIIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllllIIIIIIIIII) {
            llllllllllllIllIllllllIIIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIllllllIIIIIlIIII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockReed.AGE, llllllllllllIllIllllllIIIIIlIIII);
    }
    
    protected BlockReed() {
        super(Material.plants);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockReed.AGE, BlockReed.llIIllIlllllll[0]));
        final float llllllllllllIllIllllllIIIlllIIlI = 0.375f;
        this.setBlockBounds(0.5f - llllllllllllIllIllllllIIIlllIIlI, 0.0f, 0.5f - llllllllllllIllIllllllIIIlllIIlI, 0.5f + llllllllllllIllIllllllIIIlllIIlI, 1.0f, 0.5f + llllllllllllIllIllllllIIIlllIIlI);
        this.setTickRandomly((boolean)(BlockReed.llIIllIlllllll[2] != 0));
        "".length();
    }
    
    @Override
    public void updateTick(final World llllllllllllIllIllllllIIIllIIIIl, final BlockPos llllllllllllIllIllllllIIIllIIIII, final IBlockState llllllllllllIllIllllllIIIlIlllll, final Random llllllllllllIllIllllllIIIllIIlIl) {
        if ((!lIIIllllIlIIIIlI(llllllllllllIllIllllllIIIllIIIIl.getBlockState(llllllllllllIllIllllllIIIllIIIII.down()).getBlock(), Blocks.reeds) || lIIIllllIlIIIIll(this.checkForDrop(llllllllllllIllIllllllIIIllIIIIl, llllllllllllIllIllllllIIIllIIIII, llllllllllllIllIllllllIIIlIlllll) ? 1 : 0)) && lIIIllllIlIIIIll(llllllllllllIllIllllllIIIllIIIIl.isAirBlock(llllllllllllIllIllllllIIIllIIIII.up()) ? 1 : 0)) {
            int llllllllllllIllIllllllIIIllIIlII = BlockReed.llIIllIlllllll[2];
            "".length();
            if ((0x6D ^ 0x69) > (0x5E ^ 0x5A)) {
                return;
            }
            while (!lIIIllllIlIIIIlI(llllllllllllIllIllllllIIIllIIIIl.getBlockState(llllllllllllIllIllllllIIIllIIIII.down(llllllllllllIllIllllllIIIllIIlII)).getBlock(), this)) {
                ++llllllllllllIllIllllllIIIllIIlII;
            }
            if (lIIIllllIlIIIlII(llllllllllllIllIllllllIIIllIIlII, BlockReed.llIIllIlllllll[3])) {
                final int llllllllllllIllIllllllIIIllIIIll = llllllllllllIllIllllllIIIlIlllll.getValue((IProperty<Integer>)BlockReed.AGE);
                if (lIIIllllIlIIIlIl(llllllllllllIllIllllllIIIllIIIll, BlockReed.llIIllIlllllll[1])) {
                    llllllllllllIllIllllllIIIllIIIIl.setBlockState(llllllllllllIllIllllllIIIllIIIII.up(), this.getDefaultState());
                    "".length();
                    llllllllllllIllIllllllIIIllIIIIl.setBlockState(llllllllllllIllIllllllIIIllIIIII, llllllllllllIllIllllllIIIlIlllll.withProperty((IProperty<Comparable>)BlockReed.AGE, BlockReed.llIIllIlllllll[0]), BlockReed.llIIllIlllllll[4]);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIllllllIIIllIIIIl.setBlockState(llllllllllllIllIllllllIIIllIIIII, llllllllllllIllIllllllIIIlIlllll.withProperty((IProperty<Comparable>)BlockReed.AGE, llllllllllllIllIllllllIIIllIIIll + BlockReed.llIIllIlllllll[2]), BlockReed.llIIllIlllllll[4]);
                    "".length();
                }
            }
        }
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIllIllllllIIIlIlIlIl, final BlockPos llllllllllllIllIllllllIIIlIIllll) {
        final Block llllllllllllIllIllllllIIIlIlIIll = llllllllllllIllIllllllIIIlIlIlIl.getBlockState(llllllllllllIllIllllllIIIlIIllll.down()).getBlock();
        if (lIIIllllIlIIIllI(llllllllllllIllIllllllIIIlIlIIll, this)) {
            return BlockReed.llIIllIlllllll[2] != 0;
        }
        if (lIIIllllIlIIIIlI(llllllllllllIllIllllllIIIlIlIIll, Blocks.grass) && lIIIllllIlIIIIlI(llllllllllllIllIllllllIIIlIlIIll, Blocks.dirt) && lIIIllllIlIIIIlI(llllllllllllIllIllllllIIIlIlIIll, Blocks.sand)) {
            return BlockReed.llIIllIlllllll[0] != 0;
        }
        final short llllllllllllIllIllllllIIIlIIllII = (short)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (-" ".length() > ("  ".length() & ("  ".length() ^ -" ".length()))) {
            return ((0xAF ^ 0xA3 ^ (0x60 ^ 0x5A)) & (0x51 ^ 0x27 ^ (0xD4 ^ 0x94) ^ -" ".length())) != 0x0;
        }
        while (!lIIIllllIlIIIlll(((Iterator)llllllllllllIllIllllllIIIlIIllII).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllIllllllIIIlIlIIlI = ((Iterator<EnumFacing>)llllllllllllIllIllllllIIIlIIllII).next();
            if (lIIIllllIlIIIllI(llllllllllllIllIllllllIIIlIlIlIl.getBlockState(llllllllllllIllIllllllIIIlIIllll.offset(llllllllllllIllIllllllIIIlIlIIlI).down()).getBlock().getMaterial(), Material.water)) {
                return BlockReed.llIIllIlllllll[2] != 0;
            }
        }
        return BlockReed.llIIllIlllllll[0] != 0;
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess llllllllllllIllIllllllIIIIIlIllI, final BlockPos llllllllllllIllIllllllIIIIIlIlIl, final int llllllllllllIllIllllllIIIIIlIlll) {
        return llllllllllllIllIllllllIIIIIlIllI.getBiomeGenForCoords(llllllllllllIllIllllllIIIIIlIlIl).getGrassColorAtPos(llllllllllllIllIllllllIIIIIlIlIl);
    }
}
