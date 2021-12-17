// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.properties.PropertyEnum;

public class BlockStainedGlass extends BlockBreakable
{
    public static final /* synthetic */ PropertyEnum<EnumDyeColor> COLOR;
    private static final /* synthetic */ int[] llIIlIlIlIllII;
    private static final /* synthetic */ String[] llIIlIlIlIlIll;
    
    static {
        lIIIllIlIIlllIII();
        lIIIllIlIIllIlll();
        COLOR = PropertyEnum.create(BlockStainedGlass.llIIlIlIlIlIll[BlockStainedGlass.llIIlIlIlIllII[0]], EnumDyeColor.class);
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIlllIIIllIlIIIIIIIll) {
        return llllllllllllIlllIIIllIlIIIIIIIll.getValue(BlockStainedGlass.COLOR).getMapColor();
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlllIIIllIlIIIIllIII) {
        return llllllllllllIlllIIIllIlIIIIllIII.getValue(BlockStainedGlass.COLOR).getMetadata();
    }
    
    @Override
    public int quantityDropped(final Random llllllllllllIlllIIIllIIlllllllll) {
        return BlockStainedGlass.llIIlIlIlIllII[0];
    }
    
    public BlockStainedGlass(final Material llllllllllllIlllIIIllIlIIIIllIll) {
        super(llllllllllllIlllIIIllIlIIIIllIll, (boolean)(BlockStainedGlass.llIIlIlIlIllII[0] != 0));
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockStainedGlass.COLOR, EnumDyeColor.WHITE));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIlllIIIllIlIIIIIlIll, final CreativeTabs llllllllllllIlllIIIllIlIIIIIlllI, final List<ItemStack> llllllllllllIlllIIIllIlIIIIIllIl) {
        final char llllllllllllIlllIIIllIlIIIIIIllI;
        final boolean llllllllllllIlllIIIllIlIIIIIIlll = ((EnumDyeColor[])(Object)(llllllllllllIlllIIIllIlIIIIIIllI = (char)(Object)EnumDyeColor.values())).length != 0;
        int llllllllllllIlllIIIllIlIIIIIlIII = BlockStainedGlass.llIIlIlIlIllII[0];
        "".length();
        if (((0x3E ^ 0x37) & ~(0x51 ^ 0x58)) != 0x0) {
            return;
        }
        while (!lIIIllIlIIlllIIl(llllllllllllIlllIIIllIlIIIIIlIII, llllllllllllIlllIIIllIlIIIIIIlll ? 1 : 0)) {
            final EnumDyeColor llllllllllllIlllIIIllIlIIIIIllII = llllllllllllIlllIIIllIlIIIIIIllI[llllllllllllIlllIIIllIlIIIIIlIII];
            llllllllllllIlllIIIllIlIIIIIllIl.add(new ItemStack(llllllllllllIlllIIIllIlIIIIIlIll, BlockStainedGlass.llIIlIlIlIllII[1], llllllllllllIlllIIIllIlIIIIIllII.getMetadata()));
            "".length();
            ++llllllllllllIlllIIIllIlIIIIIlIII;
        }
    }
    
    private static boolean lIIIllIlIIlllIlI(final int llllllllllllIlllIIIllIIlllIIllIl) {
        return llllllllllllIlllIIIllIIlllIIllIl == 0;
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIlllIIIllIIlllllIIll, final BlockPos llllllllllllIlllIIIllIIllllIllll, final IBlockState llllllllllllIlllIIIllIIlllllIIIl) {
        if (lIIIllIlIIlllIlI(llllllllllllIlllIIIllIIlllllIIll.isRemote ? 1 : 0)) {
            BlockBeacon.updateColorAsync(llllllllllllIlllIIIllIIlllllIIll, llllllllllllIlllIIIllIIllllIllll);
        }
    }
    
    private static void lIIIllIlIIlllIII() {
        (llIIlIlIlIllII = new int[3])[0] = ((164 + 173 - 224 + 116 ^ 95 + 96 - 93 + 72) & (0x21 ^ 0x7D ^ (0x82 ^ 0x91) ^ -" ".length()));
        BlockStainedGlass.llIIlIlIlIllII[1] = " ".length();
        BlockStainedGlass.llIIlIlIlIllII[2] = "  ".length();
    }
    
    @Override
    protected boolean canSilkHarvest() {
        return BlockStainedGlass.llIIlIlIlIllII[1] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStainedGlass.llIIlIlIlIllII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStainedGlass.llIIlIlIlIllII[0]] = BlockStainedGlass.COLOR;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockStainedGlass.llIIlIlIlIllII[0] != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllIIIllIIllllIIlII) {
        return llllllllllllIlllIIIllIIllllIIlII.getValue(BlockStainedGlass.COLOR).getMetadata();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllIIIllIIlllllIlll) {
        return this.getDefaultState().withProperty(BlockStainedGlass.COLOR, EnumDyeColor.byMetadata(llllllllllllIlllIIIllIIlllllIlll));
    }
    
    private static boolean lIIIllIlIIlllIIl(final int llllllllllllIlllIIIllIIlllIlIIII, final int llllllllllllIlllIIIllIIlllIIllll) {
        return llllllllllllIlllIIIllIIlllIlIIII >= llllllllllllIlllIIIllIIlllIIllll;
    }
    
    @Override
    public void breakBlock(final World llllllllllllIlllIIIllIIllllIlIII, final BlockPos llllllllllllIlllIIIllIIllllIlIlI, final IBlockState llllllllllllIlllIIIllIIllllIlIIl) {
        if (lIIIllIlIIlllIlI(llllllllllllIlllIIIllIIllllIlIII.isRemote ? 1 : 0)) {
            BlockBeacon.updateColorAsync(llllllllllllIlllIIIllIIllllIlIII, llllllllllllIlllIIIllIIllllIlIlI);
        }
    }
    
    private static String lIIIllIlIIllIllI(final String llllllllllllIlllIIIllIIlllIlIllI, final String llllllllllllIlllIIIllIIlllIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIllIIlllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIllIIlllIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIllIIlllIllIlI.init(BlockStainedGlass.llIIlIlIlIllII[2], llllllllllllIlllIIIllIIlllIllIll);
            return new String(llllllllllllIlllIIIllIIlllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIllIIlllIllIIl) {
            llllllllllllIlllIIIllIIlllIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIlIIllIlll() {
        (llIIlIlIlIlIll = new String[BlockStainedGlass.llIIlIlIlIllII[1]])[BlockStainedGlass.llIIlIlIlIllII[0]] = lIIIllIlIIllIllI("Eql87z5EuMw=", "VZvMx");
    }
}
