// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.BlockState;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.properties.PropertyEnum;

public class BlockCarpet extends Block
{
    public static final /* synthetic */ PropertyEnum<EnumDyeColor> COLOR;
    private static final /* synthetic */ String[] lIIllIIllIlIll;
    private static final /* synthetic */ int[] lIIllIIllIllII;
    
    private static boolean llIlIllllIllIIl(final int lllllllllllllIIlIlIllllIIlIIIIll) {
        return lllllllllllllIIlIlIllllIIlIIIIll != 0;
    }
    
    private boolean canBlockStay(final World lllllllllllllIIlIlIllllIlIIIIIll, final BlockPos lllllllllllllIIlIlIllllIlIIIIlII) {
        int n;
        if (llIlIllllIllIIl(lllllllllllllIIlIlIllllIlIIIIIll.isAirBlock(lllllllllllllIIlIlIllllIlIIIIlII.down()) ? 1 : 0)) {
            n = BlockCarpet.lIIllIIllIllII[0];
            "".length();
            if (null != null) {
                return ((0x71 ^ 0x29 ^ (0x6E ^ 0x5)) & (150 + 117 - 227 + 126 ^ 89 + 104 - 179 + 135 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockCarpet.lIIllIIllIllII[1];
        }
        return n != 0;
    }
    
    private static boolean llIlIllllIllIlI(final int lllllllllllllIIlIlIllllIIlIIIIIl) {
        return lllllllllllllIIlIlIllllIIlIIIIIl == 0;
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIlIlIllllIIlllIIlI) {
        return lllllllllllllIIlIlIllllIIlllIIlI.getValue(BlockCarpet.COLOR).getMetadata();
    }
    
    private boolean checkForDrop(final World lllllllllllllIIlIlIllllIlIIIllll, final BlockPos lllllllllllllIIlIlIllllIlIIIlllI, final IBlockState lllllllllllllIIlIlIllllIlIIIlIIl) {
        if (llIlIllllIllIlI(this.canBlockStay(lllllllllllllIIlIlIllllIlIIIllll, lllllllllllllIIlIlIllllIlIIIlllI) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIIlIlIllllIlIIIllll, lllllllllllllIIlIlIllllIlIIIlllI, lllllllllllllIIlIlIllllIlIIIlIIl, BlockCarpet.lIIllIIllIllII[0]);
            lllllllllllllIIlIlIllllIlIIIllll.setBlockToAir(lllllllllllllIIlIlIllllIlIIIlllI);
            "".length();
            return BlockCarpet.lIIllIIllIllII[0] != 0;
        }
        return BlockCarpet.lIIllIIllIllII[1] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockCarpet.lIIllIIllIllII[0] != 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIlIlIllllIlIIlIlll, final BlockPos lllllllllllllIIlIlIllllIlIIllIll, final IBlockState lllllllllllllIIlIlIllllIlIIllIlI, final Block lllllllllllllIIlIlIllllIlIIllIIl) {
        this.checkForDrop(lllllllllllllIIlIlIllllIlIIlIlll, lllllllllllllIIlIlIllllIlIIllIll, lllllllllllllIIlIlIllllIlIIllIlI);
        "".length();
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIlIllllIIlIlllIl) {
        return lllllllllllllIIlIlIllllIIlIlllIl.getValue(BlockCarpet.COLOR).getMetadata();
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIlIlIllllIIllIllIl, final CreativeTabs lllllllllllllIIlIlIllllIIllIllII, final List<ItemStack> lllllllllllllIIlIlIllllIIllIlIII) {
        int lllllllllllllIIlIlIllllIIllIlIlI = BlockCarpet.lIIllIIllIllII[0];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!llIlIllllIlllII(lllllllllllllIIlIlIllllIIllIlIlI, BlockCarpet.lIIllIIllIllII[2])) {
            lllllllllllllIIlIlIllllIIllIlIII.add(new ItemStack(lllllllllllllIIlIlIllllIIllIllIl, BlockCarpet.lIIllIIllIllII[1], lllllllllllllIIlIlIllllIIllIlIlI));
            "".length();
            ++lllllllllllllIIlIlIllllIIllIlIlI;
        }
    }
    
    private static boolean llIlIllllIllIll(final Object lllllllllllllIIlIlIllllIIlIIIllI, final Object lllllllllllllIIlIlIllllIIlIIIlIl) {
        return lllllllllllllIIlIlIllllIIlIIIllI == lllllllllllllIIlIlIllllIIlIIIlIl;
    }
    
    private static void llIlIllllIllIII() {
        (lIIllIIllIllII = new int[5])[0] = ((0x4 ^ 0x11) & ~(0x32 ^ 0x27));
        BlockCarpet.lIIllIIllIllII[1] = " ".length();
        BlockCarpet.lIIllIIllIllII[2] = (0x1A ^ 0xA);
        BlockCarpet.lIIllIIllIllII[3] = (0x53 ^ 0x5B);
        BlockCarpet.lIIllIIllIllII[4] = "  ".length();
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBoundsFromMeta(BlockCarpet.lIIllIIllIllII[0]);
    }
    
    protected BlockCarpet() {
        super(Material.carpet);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockCarpet.COLOR, EnumDyeColor.WHITE));
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this.setTickRandomly((boolean)(BlockCarpet.lIIllIIllIllII[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.setBlockBoundsFromMeta(BlockCarpet.lIIllIIllIllII[0]);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockCarpet.lIIllIIllIllII[0] != 0;
    }
    
    private static String llIlIllllIlIllI(final String lllllllllllllIIlIlIllllIIlIlIIlI, final String lllllllllllllIIlIlIllllIIlIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllllIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllllIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), BlockCarpet.lIIllIIllIllII[3]), "DES");
            final Cipher lllllllllllllIIlIlIllllIIlIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIllllIIlIlIlII.init(BlockCarpet.lIIllIIllIllII[4], lllllllllllllIIlIlIllllIIlIlIlIl);
            return new String(lllllllllllllIIlIlIllllIIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllllIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllllIIlIlIIll) {
            lllllllllllllIIlIlIllllIIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIlIllllIllIII();
        llIlIllllIlIlll();
        COLOR = PropertyEnum.create(BlockCarpet.lIIllIIllIlIll[BlockCarpet.lIIllIIllIllII[0]], EnumDyeColor.class);
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIlIlIllllIlIlIIIll, final BlockPos lllllllllllllIIlIlIllllIlIlIIlIl) {
        if (llIlIllllIllIIl(super.canPlaceBlockAt(lllllllllllllIIlIlIllllIlIlIIIll, lllllllllllllIIlIlIllllIlIlIIlIl) ? 1 : 0) && llIlIllllIllIIl(this.canBlockStay(lllllllllllllIIlIlIllllIlIlIIIll, lllllllllllllIIlIlIllllIlIlIIlIl) ? 1 : 0)) {
            return BlockCarpet.lIIllIIllIllII[1] != 0;
        }
        return BlockCarpet.lIIllIIllIllII[0] != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockCarpet.lIIllIIllIllII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCarpet.lIIllIIllIllII[0]] = BlockCarpet.COLOR;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIlIlIllllIllIIIIII) {
        return lllllllllllllIIlIlIllllIllIIIIII.getValue(BlockCarpet.COLOR).getMapColor();
    }
    
    private static void llIlIllllIlIlll() {
        (lIIllIIllIlIll = new String[BlockCarpet.lIIllIIllIllII[1]])[BlockCarpet.lIIllIIllIllII[0]] = llIlIllllIlIllI("iokKUpbQH0c=", "zqzYJ");
    }
    
    protected void setBlockBoundsFromMeta(final int lllllllllllllIIlIlIllllIlIllIIII) {
        final int lllllllllllllIIlIlIllllIlIlIllll = BlockCarpet.lIIllIIllIllII[0];
        final float lllllllllllllIIlIlIllllIlIlIlllI = BlockCarpet.lIIllIIllIllII[1] * (BlockCarpet.lIIllIIllIllII[1] + lllllllllllllIIlIlIllllIlIlIllll) / 16.0f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, lllllllllllllIIlIlIllllIlIlIlllI, 1.0f);
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIlIlIllllIIllllIII, final BlockPos lllllllllllllIIlIlIllllIIllllIll, final EnumFacing lllllllllllllIIlIlIllllIIlllIllI) {
        int shouldSideBeRendered;
        if (llIlIllllIllIll(lllllllllllllIIlIlIllllIIlllIllI, EnumFacing.UP)) {
            shouldSideBeRendered = BlockCarpet.lIIllIIllIllII[1];
            "".length();
            if (-" ".length() >= ((0x1B ^ 0x6E ^ (0x24 ^ 0x17)) & (0x82 ^ 0xC0 ^ (0xC4 ^ 0xC0) ^ -" ".length()))) {
                return ((0x7 ^ 0x3D ^ (0xA6 ^ 0xC4)) & (0xA ^ 0x53 ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = (super.shouldSideBeRendered(lllllllllllllIIlIlIllllIIllllIII, lllllllllllllIIlIlIllllIIllllIll, lllllllllllllIIlIlIllllIIlllIllI) ? 1 : 0);
        }
        return shouldSideBeRendered != 0;
    }
    
    private static boolean llIlIllllIlllII(final int lllllllllllllIIlIlIllllIIlIIlIlI, final int lllllllllllllIIlIlIllllIIlIIlIIl) {
        return lllllllllllllIIlIlIllllIIlIIlIlI >= lllllllllllllIIlIlIllllIIlIIlIIl;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIlIllllIIllIIIIl) {
        return this.getDefaultState().withProperty(BlockCarpet.COLOR, EnumDyeColor.byMetadata(lllllllllllllIIlIlIllllIIllIIIIl));
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIlIlIllllIlIllIlll, final BlockPos lllllllllllllIIlIlIllllIlIllIllI) {
        this.setBlockBoundsFromMeta(BlockCarpet.lIIllIIllIllII[0]);
    }
}
