// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntityDaylightDetector;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.BlockState;
import net.minecraft.world.IBlockAccess;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyInteger;

public class BlockDaylightDetector extends BlockContainer
{
    private static final /* synthetic */ String[] lIllIIIIIlIlll;
    private static final /* synthetic */ int[] lIllIIIIIllIII;
    public static final /* synthetic */ PropertyInteger POWER;
    private final /* synthetic */ boolean inverted;
    
    private static void llllIllIIIlIlII() {
        (lIllIIIIIlIlll = new String[BlockDaylightDetector.lIllIIIIIllIII[5]])[BlockDaylightDetector.lIllIIIIIllIII[0]] = llllIllIIIlIIlI("IgICMSI=", "RmuTP");
        BlockDaylightDetector.lIllIIIIIlIlll[BlockDaylightDetector.lIllIIIIIllIII[2]] = llllIllIIIlIIll("bcR3x6uD7OaTz5EJjpfA5xrCf1MJODcy", "tCINM");
    }
    
    private static boolean llllIllIIIllIII(final int lllllllllllllIIIIlIIIllIIlllIlll) {
        return lllllllllllllIIIIlIIIllIIlllIlll < 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIlIIIllIlIllIllI) {
        return lllllllllllllIIIIlIIIllIlIllIllI.getValue((IProperty<Integer>)BlockDaylightDetector.POWER);
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIIlIIIllIllIlllIl, final BlockPos lllllllllllllIIIIlIIIllIllIlIIll, final IBlockState lllllllllllllIIIIlIIIllIllIllIll, final EntityPlayer lllllllllllllIIIIlIIIllIllIllIlI, final EnumFacing lllllllllllllIIIIlIIIllIllIlIIII, final float lllllllllllllIIIIlIIIllIllIllIII, final float lllllllllllllIIIIlIIIllIllIIlllI, final float lllllllllllllIIIIlIIIllIllIIllIl) {
        if (!llllIllIIIllIIl(lllllllllllllIIIIlIIIllIllIllIlI.isAllowEdit() ? 1 : 0)) {
            return super.onBlockActivated(lllllllllllllIIIIlIIIllIllIlllIl, lllllllllllllIIIIlIIIllIllIlIIll, lllllllllllllIIIIlIIIllIllIllIll, lllllllllllllIIIIlIIIllIllIllIlI, lllllllllllllIIIIlIIIllIllIlIIII, lllllllllllllIIIIlIIIllIllIllIII, lllllllllllllIIIIlIIIllIllIIlllI, lllllllllllllIIIIlIIIllIllIIllIl);
        }
        if (llllIllIIIllIIl(lllllllllllllIIIIlIIIllIllIlllIl.isRemote ? 1 : 0)) {
            return BlockDaylightDetector.lIllIIIIIllIII[2] != 0;
        }
        if (llllIllIIIllIIl(this.inverted ? 1 : 0)) {
            lllllllllllllIIIIlIIIllIllIlllIl.setBlockState(lllllllllllllIIIIlIIIllIllIlIIll, Blocks.daylight_detector.getDefaultState().withProperty((IProperty<Comparable>)BlockDaylightDetector.POWER, (Integer)lllllllllllllIIIIlIIIllIllIllIll.getValue((IProperty<V>)BlockDaylightDetector.POWER)), BlockDaylightDetector.lIllIIIIIllIII[4]);
            "".length();
            Blocks.daylight_detector.updatePower(lllllllllllllIIIIlIIIllIllIlllIl, lllllllllllllIIIIlIIIllIllIlIIll);
            "".length();
            if (null != null) {
                return ((0xFC ^ 0xB1 ^ (0xE3 ^ 0xB7)) & (0x2C ^ 0x6D ^ (0x9A ^ 0xC2) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIIIlIIIllIllIlllIl.setBlockState(lllllllllllllIIIIlIIIllIllIlIIll, Blocks.daylight_detector_inverted.getDefaultState().withProperty((IProperty<Comparable>)BlockDaylightDetector.POWER, (Integer)lllllllllllllIIIIlIIIllIllIllIll.getValue((IProperty<V>)BlockDaylightDetector.POWER)), BlockDaylightDetector.lIllIIIIIllIII[4]);
            "".length();
            Blocks.daylight_detector_inverted.updatePower(lllllllllllllIIIIlIIIllIllIlllIl, lllllllllllllIIIIlIIIllIllIlIIll);
        }
        return BlockDaylightDetector.lIllIIIIIllIII[2] != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIIlIIIlllIIIIIllI, final BlockPos lllllllllllllIIIIlIIIlllIIIIIlIl) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockDaylightDetector.lIllIIIIIllIII[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDaylightDetector.lIllIIIIIllIII[0]] = BlockDaylightDetector.POWER;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIIlIIIllIllIIlIll, final Random lllllllllllllIIIIlIIIllIllIIlIlI, final int lllllllllllllIIIIlIIIllIllIIlIIl) {
        return Item.getItemFromBlock(Blocks.daylight_detector);
    }
    
    private static boolean llllIllIIIlIlll(final int lllllllllllllIIIIlIIIllIIllllIIl) {
        return lllllllllllllIIIIlIIIllIIllllIIl == 0;
    }
    
    private static boolean llllIllIIIllIll(final int lllllllllllllIIIIlIIIllIIllllllI, final int lllllllllllllIIIIlIIIllIIlllllIl) {
        return lllllllllllllIIIIlIIIllIIllllllI < lllllllllllllIIIIlIIIllIIlllllIl;
    }
    
    public BlockDaylightDetector(final boolean lllllllllllllIIIIlIIIlllIIIIlIll) {
        super(Material.wood);
        this.inverted = lllllllllllllIIIIlIIIlllIIIIlIll;
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockDaylightDetector.POWER, BlockDaylightDetector.lIllIIIIIllIII[0]));
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
        this.setHardness(0.2f);
        "".length();
        this.setStepSound(BlockDaylightDetector.soundTypeWood);
        "".length();
        this.setUnlocalizedName(BlockDaylightDetector.lIllIIIIIlIlll[BlockDaylightDetector.lIllIIIIIllIII[2]]);
        "".length();
    }
    
    private static void llllIllIIIlIlIl() {
        (lIllIIIIIllIII = new int[7])[0] = ((0xCD ^ 0xC3) & ~(0xE ^ 0x0));
        BlockDaylightDetector.lIllIIIIIllIII[1] = (0x60 ^ 0x6F);
        BlockDaylightDetector.lIllIIIIIllIII[2] = " ".length();
        BlockDaylightDetector.lIllIIIIIllIII[3] = "   ".length();
        BlockDaylightDetector.lIllIIIIIllIII[4] = (0xE6 ^ 0x9B ^ (0x74 ^ 0xD));
        BlockDaylightDetector.lIllIIIIIllIII[5] = "  ".length();
        BlockDaylightDetector.lIllIIIIIllIII[6] = (109 + 109 - 176 + 115 ^ 28 + 111 - 10 + 20);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIIIlIIIllIllIIIIII, final int lllllllllllllIIIIlIIIllIlIllllll) {
        return new TileEntityDaylightDetector();
    }
    
    @Override
    public boolean isFullCube() {
        return BlockDaylightDetector.lIllIIIIIllIII[0] != 0;
    }
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIIIIlIIIlllIIIIIIIl, final BlockPos lllllllllllllIIIIlIIIlllIIIIIIII, final IBlockState lllllllllllllIIIIlIIIllIllllllll, final EnumFacing lllllllllllllIIIIlIIIllIlllllllI) {
        return lllllllllllllIIIIlIIIllIllllllll.getValue((IProperty<Integer>)BlockDaylightDetector.POWER);
    }
    
    private static String llllIllIIIlIIll(final String lllllllllllllIIIIlIIIllIlIIIIllI, final String lllllllllllllIIIIlIIIllIlIIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIIllIlIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), BlockDaylightDetector.lIllIIIIIllIII[6]), "DES");
            final Cipher lllllllllllllIIIIlIIIllIlIIIlIII = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIIllIlIIIlIII.init(BlockDaylightDetector.lIllIIIIIllIII[5], lllllllllllllIIIIlIIIllIlIIIlIIl);
            return new String(lllllllllllllIIIIlIIIllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIIllIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIIllIlIIIIlll) {
            lllllllllllllIIIIlIIIllIlIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIllIIIllIlI(final int lllllllllllllIIIIlIIIllIIlllIlII, final int lllllllllllllIIIIlIIIllIIlllIIll) {
        return lllllllllllllIIIIlIIIllIIlllIlII != lllllllllllllIIIIlIIIllIIlllIIll;
    }
    
    public void updatePower(final World lllllllllllllIIIIlIIIllIllllIlII, final BlockPos lllllllllllllIIIIlIIIllIlllIllII) {
        if (llllIllIIIlIlll(lllllllllllllIIIIlIIIllIllllIlII.provider.getHasNoSky() ? 1 : 0)) {
            final IBlockState lllllllllllllIIIIlIIIllIllllIIlI = lllllllllllllIIIIlIIIllIllllIlII.getBlockState(lllllllllllllIIIIlIIIllIlllIllII);
            int lllllllllllllIIIIlIIIllIllllIIIl = lllllllllllllIIIIlIIIllIllllIlII.getLightFor(EnumSkyBlock.SKY, lllllllllllllIIIIlIIIllIlllIllII) - lllllllllllllIIIIlIIIllIllllIlII.getSkylightSubtracted();
            float lllllllllllllIIIIlIIIllIllllIIII = lllllllllllllIIIIlIIIllIllllIlII.getCelestialAngleRadians(1.0f);
            float n;
            if (llllIllIIIllIII(llllIllIIIlIllI(lllllllllllllIIIIlIIIllIllllIIII, 3.1415927f))) {
                n = 0.0f;
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                n = 6.2831855f;
            }
            final float lllllllllllllIIIIlIIIllIlllIllll = n;
            lllllllllllllIIIIlIIIllIllllIIII += (lllllllllllllIIIIlIIIllIlllIllll - lllllllllllllIIIIlIIIllIllllIIII) * 0.2f;
            lllllllllllllIIIIlIIIllIllllIIIl = Math.round(lllllllllllllIIIIlIIIllIllllIIIl * MathHelper.cos(lllllllllllllIIIIlIIIllIllllIIII));
            lllllllllllllIIIIlIIIllIllllIIIl = MathHelper.clamp_int(lllllllllllllIIIIlIIIllIllllIIIl, BlockDaylightDetector.lIllIIIIIllIII[0], BlockDaylightDetector.lIllIIIIIllIII[1]);
            if (llllIllIIIllIIl(this.inverted ? 1 : 0)) {
                lllllllllllllIIIIlIIIllIllllIIIl = BlockDaylightDetector.lIllIIIIIllIII[1] - lllllllllllllIIIIlIIIllIllllIIIl;
            }
            if (llllIllIIIllIlI(lllllllllllllIIIIlIIIllIllllIIlI.getValue((IProperty<Integer>)BlockDaylightDetector.POWER), lllllllllllllIIIIlIIIllIllllIIIl)) {
                lllllllllllllIIIIlIIIllIllllIlII.setBlockState(lllllllllllllIIIIlIIIllIlllIllII, lllllllllllllIIIIlIIIllIllllIIlI.withProperty((IProperty<Comparable>)BlockDaylightDetector.POWER, lllllllllllllIIIIlIIIllIllllIIIl), BlockDaylightDetector.lIllIIIIIllIII[3]);
                "".length();
            }
        }
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockDaylightDetector.lIllIIIIIllIII[0] != 0;
    }
    
    private static int llllIllIIIlIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockDaylightDetector.lIllIIIIIllIII[2] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIlIIIllIlIlllIll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockDaylightDetector.POWER, lllllllllllllIIIIlIIIllIlIlllIll);
    }
    
    private static boolean llllIllIIIllIIl(final int lllllllllllllIIIIlIIIllIIllllIll) {
        return lllllllllllllIIIIlIIIllIIllllIll != 0;
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIIIlIIIllIlIlIlIII, final CreativeTabs lllllllllllllIIIIlIIIllIlIlIlIll, final List<ItemStack> lllllllllllllIIIIlIIIllIlIlIlIlI) {
        if (llllIllIIIlIlll(this.inverted ? 1 : 0)) {
            super.getSubBlocks(lllllllllllllIIIIlIIIllIlIlIlIII, lllllllllllllIIIIlIIIllIlIlIlIll, lllllllllllllIIIIlIIIllIlIlIlIlI);
        }
    }
    
    private static String llllIllIIIlIIlI(String lllllllllllllIIIIlIIIllIlIIlIllI, final String lllllllllllllIIIIlIIIllIlIIlIlIl) {
        lllllllllllllIIIIlIIIllIlIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIIIllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIIllIlIIllIIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIIIllIlIIllIII = lllllllllllllIIIIlIIIllIlIIlIlIl.toCharArray();
        int lllllllllllllIIIIlIIIllIlIIlIlll = BlockDaylightDetector.lIllIIIIIllIII[0];
        final int lllllllllllllIIIIlIIIllIlIIlIIIl = (Object)lllllllllllllIIIIlIIIllIlIIlIllI.toCharArray();
        final String lllllllllllllIIIIlIIIllIlIIlIIII = (String)lllllllllllllIIIIlIIIllIlIIlIIIl.length;
        int lllllllllllllIIIIlIIIllIlIIIllll = BlockDaylightDetector.lIllIIIIIllIII[0];
        while (llllIllIIIllIll(lllllllllllllIIIIlIIIllIlIIIllll, (int)lllllllllllllIIIIlIIIllIlIIlIIII)) {
            final char lllllllllllllIIIIlIIIllIlIIlllII = lllllllllllllIIIIlIIIllIlIIlIIIl[lllllllllllllIIIIlIIIllIlIIIllll];
            lllllllllllllIIIIlIIIllIlIIllIIl.append((char)(lllllllllllllIIIIlIIIllIlIIlllII ^ lllllllllllllIIIIlIIIllIlIIllIII[lllllllllllllIIIIlIIIllIlIIlIlll % lllllllllllllIIIIlIIIllIlIIllIII.length]));
            "".length();
            ++lllllllllllllIIIIlIIIllIlIIlIlll;
            ++lllllllllllllIIIIlIIIllIlIIIllll;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIIllIlIIllIIl);
    }
    
    @Override
    public int getRenderType() {
        return BlockDaylightDetector.lIllIIIIIllIII[3];
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIIIlIIIllIllIIIlll, final BlockPos lllllllllllllIIIIlIIIllIllIIIllI) {
        return Item.getItemFromBlock(Blocks.daylight_detector);
    }
    
    static {
        llllIllIIIlIlIl();
        llllIllIIIlIlII();
        POWER = PropertyInteger.create(BlockDaylightDetector.lIllIIIIIlIlll[BlockDaylightDetector.lIllIIIIIllIII[0]], BlockDaylightDetector.lIllIIIIIllIII[0], BlockDaylightDetector.lIllIIIIIllIII[1]);
    }
}
