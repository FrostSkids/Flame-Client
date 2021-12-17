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
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.properties.PropertyEnum;

public class BlockStainedGlassPane extends BlockPane
{
    private static final /* synthetic */ int[] lllllIIllIlII;
    private static final /* synthetic */ String[] lllllIIllIIlI;
    public static final /* synthetic */ PropertyEnum<EnumDyeColor> COLOR;
    
    private static void lIlIlllIIIIIIII() {
        (lllllIIllIlII = new int[6])[0] = ((((0x1 ^ 0x1B) & ~(0x57 ^ 0x4D)) ^ (0xFB ^ 0xA5)) & (90 + 144 - 168 + 153 ^ 35 + 96 - 108 + 110 ^ -" ".length()));
        BlockStainedGlassPane.lllllIIllIlII[1] = " ".length();
        BlockStainedGlassPane.lllllIIllIlII[2] = (0x89 ^ 0x8C);
        BlockStainedGlassPane.lllllIIllIlII[3] = "  ".length();
        BlockStainedGlassPane.lllllIIllIlII[4] = "   ".length();
        BlockStainedGlassPane.lllllIIllIlII[5] = (0xFA ^ 0x80 ^ (0x67 ^ 0x19));
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIlIlllIlIlllIlIII, final BlockPos lllllllllllllIlIlIlllIlIlllIIlII, final IBlockState lllllllllllllIlIlIlllIlIlllIIllI) {
        if (lIlIlllIIIIIIlI(lllllllllllllIlIlIlllIlIlllIlIII.isRemote ? 1 : 0)) {
            BlockBeacon.updateColorAsync(lllllllllllllIlIlIlllIlIlllIlIII, lllllllllllllIlIlIlllIlIlllIIlII);
        }
    }
    
    private static boolean lIlIlllIIIIIIlI(final int lllllllllllllIlIlIlllIlIllIIlIIl) {
        return lllllllllllllIlIlIlllIlIllIIlIIl == 0;
    }
    
    static {
        lIlIlllIIIIIIII();
        lIlIllIlllllllI();
        COLOR = PropertyEnum.create(BlockStainedGlassPane.lllllIIllIIlI[BlockStainedGlassPane.lllllIIllIlII[0]], EnumDyeColor.class);
    }
    
    private static void lIlIllIlllllllI() {
        (lllllIIllIIlI = new String[BlockStainedGlassPane.lllllIIllIlII[1]])[BlockStainedGlassPane.lllllIIllIlII[0]] = lIlIllIlllllIll("oZ7tp1hmkoo=", "PmPKy");
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIlIlIlllIlIlllllIlI) {
        return lllllllllllllIlIlIlllIlIlllllIlI.getValue(BlockStainedGlassPane.COLOR).getMapColor();
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIlIlIlllIlIllIlllIl, final BlockPos lllllllllllllIlIlIlllIlIllIlllll, final IBlockState lllllllllllllIlIlIlllIlIllIllllI) {
        if (lIlIlllIIIIIIlI(lllllllllllllIlIlIlllIlIllIlllIl.isRemote ? 1 : 0)) {
            BlockBeacon.updateColorAsync(lllllllllllllIlIlIlllIlIllIlllIl, lllllllllllllIlIlIlllIlIllIlllll);
        }
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIlIlIlllIllIIIIIlII, final CreativeTabs lllllllllllllIlIlIlllIllIIIIIIll, final List<ItemStack> lllllllllllllIlIlIlllIllIIIIIIlI) {
        int lllllllllllllIlIlIlllIllIIIIIIIl = BlockStainedGlassPane.lllllIIllIlII[0];
        "".length();
        if ("  ".length() >= "   ".length()) {
            return;
        }
        while (!lIlIlllIIIIIIIl(lllllllllllllIlIlIlllIllIIIIIIIl, EnumDyeColor.values().length)) {
            lllllllllllllIlIlIlllIllIIIIIIlI.add(new ItemStack(lllllllllllllIlIlIlllIllIIIIIlII, BlockStainedGlassPane.lllllIIllIlII[1], lllllllllllllIlIlIlllIllIIIIIIIl));
            "".length();
            ++lllllllllllllIlIlIlllIllIIIIIIIl;
        }
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIlIlIlllIllIIIIlIlI) {
        return lllllllllllllIlIlIlllIllIIIIlIlI.getValue(BlockStainedGlassPane.COLOR).getMetadata();
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlIlllIlIllllIlIl) {
        return this.getDefaultState().withProperty(BlockStainedGlassPane.COLOR, EnumDyeColor.byMetadata(lllllllllllllIlIlIlllIlIllllIlIl));
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIlIlllIlIllllIIII) {
        return lllllllllllllIlIlIlllIlIllllIIII.getValue(BlockStainedGlassPane.COLOR).getMetadata();
    }
    
    public BlockStainedGlassPane() {
        super(Material.glass, (boolean)(BlockStainedGlassPane.lllllIIllIlII[0] != 0));
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockStainedGlassPane.NORTH, (boolean)(BlockStainedGlassPane.lllllIIllIlII[0] != 0)).withProperty((IProperty<Comparable>)BlockStainedGlassPane.EAST, (boolean)(BlockStainedGlassPane.lllllIIllIlII[0] != 0)).withProperty((IProperty<Comparable>)BlockStainedGlassPane.SOUTH, (boolean)(BlockStainedGlassPane.lllllIIllIlII[0] != 0)).withProperty((IProperty<Comparable>)BlockStainedGlassPane.WEST, (boolean)(BlockStainedGlassPane.lllllIIllIlII[0] != 0)).withProperty(BlockStainedGlassPane.COLOR, EnumDyeColor.WHITE));
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStainedGlassPane.lllllIIllIlII[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStainedGlassPane.lllllIIllIlII[0]] = BlockStainedGlassPane.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStainedGlassPane.lllllIIllIlII[1]] = BlockStainedGlassPane.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStainedGlassPane.lllllIIllIlII[3]] = BlockStainedGlassPane.WEST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStainedGlassPane.lllllIIllIlII[4]] = BlockStainedGlassPane.SOUTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStainedGlassPane.lllllIIllIlII[5]] = BlockStainedGlassPane.COLOR;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static String lIlIllIlllllIll(final String lllllllllllllIlIlIlllIlIllIlIIlI, final String lllllllllllllIlIlIlllIlIllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlllIlIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIlIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlllIlIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlllIlIllIlIllI.init(BlockStainedGlassPane.lllllIIllIlII[3], lllllllllllllIlIlIlllIlIllIlIlll);
            return new String(lllllllllllllIlIlIlllIlIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIlIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlllIlIllIlIlIl) {
            lllllllllllllIlIlIlllIlIllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlllIIIIIIIl(final int lllllllllllllIlIlIlllIlIllIIllII, final int lllllllllllllIlIlIlllIlIllIIlIll) {
        return lllllllllllllIlIlIlllIlIllIIllII >= lllllllllllllIlIlIlllIlIllIIlIll;
    }
}
