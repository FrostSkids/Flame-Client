// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.Material;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.state.BlockState;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.properties.PropertyEnum;

public class BlockColored extends Block
{
    private static final /* synthetic */ String[] lIlIIlllIIllll;
    public static final /* synthetic */ PropertyEnum<EnumDyeColor> COLOR;
    private static final /* synthetic */ int[] lIlIIlllIlIIII;
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIIllIIIIIIIIIIIIll) {
        return lllllllllllllIIIllIIIIIIIIIIIIll.getValue(BlockColored.COLOR).getMapColor();
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIlIlllllllllllIIl) {
        return lllllllllllllIIIlIlllllllllllIIl.getValue(BlockColored.COLOR).getMetadata();
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIIllIIIIIIIIIIllll, final CreativeTabs lllllllllllllIIIllIIIIIIIIIIlllI, final List<ItemStack> lllllllllllllIIIllIIIIIIIIIIllIl) {
        final double lllllllllllllIIIllIIIIIIIIIIIllI;
        final byte lllllllllllllIIIllIIIIIIIIIIIlll = (byte)((EnumDyeColor[])(Object)(lllllllllllllIIIllIIIIIIIIIIIllI = (double)(Object)EnumDyeColor.values())).length;
        byte lllllllllllllIIIllIIIIIIIIIIlIII = (byte)BlockColored.lIlIIlllIlIIII[0];
        "".length();
        if (((0x83 ^ 0x9A ^ (0xED ^ 0xB5)) & ("   ".length() ^ (0xC3 ^ 0x81) ^ -" ".length())) >= (96 + 28 - 95 + 135 ^ 119 + 83 - 90 + 48)) {
            return;
        }
        while (!lllIlIIlIIlIIlI(lllllllllllllIIIllIIIIIIIIIIlIII, lllllllllllllIIIllIIIIIIIIIIIlll)) {
            final EnumDyeColor lllllllllllllIIIllIIIIIIIIIIllII = lllllllllllllIIIllIIIIIIIIIIIllI[lllllllllllllIIIllIIIIIIIIIIlIII];
            lllllllllllllIIIllIIIIIIIIIIllIl.add(new ItemStack(lllllllllllllIIIllIIIIIIIIIIllll, BlockColored.lIlIIlllIlIIII[1], lllllllllllllIIIllIIIIIIIIIIllII.getMetadata()));
            "".length();
            ++lllllllllllllIIIllIIIIIIIIIIlIII;
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockColored.lIlIIlllIlIIII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockColored.lIlIIlllIlIIII[0]] = BlockColored.COLOR;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static String lllIlIIlIIIllll(String lllllllllllllIIIlIlllllllllIIlIl, final String lllllllllllllIIIlIlllllllllIIlII) {
        lllllllllllllIIIlIlllllllllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlllllllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlllllllllIlIII = new StringBuilder();
        final char[] lllllllllllllIIIlIlllllllllIIlll = lllllllllllllIIIlIlllllllllIIlII.toCharArray();
        int lllllllllllllIIIlIlllllllllIIllI = BlockColored.lIlIIlllIlIIII[0];
        final long lllllllllllllIIIlIlllllllllIIIII = (Object)lllllllllllllIIIlIlllllllllIIlIl.toCharArray();
        final double lllllllllllllIIIlIllllllllIlllll = lllllllllllllIIIlIlllllllllIIIII.length;
        double lllllllllllllIIIlIllllllllIllllI = BlockColored.lIlIIlllIlIIII[0];
        while (lllIlIIlIIlIIll((int)lllllllllllllIIIlIllllllllIllllI, (int)lllllllllllllIIIlIllllllllIlllll)) {
            final char lllllllllllllIIIlIlllllllllIlIll = lllllllllllllIIIlIlllllllllIIIII[lllllllllllllIIIlIllllllllIllllI];
            lllllllllllllIIIlIlllllllllIlIII.append((char)(lllllllllllllIIIlIlllllllllIlIll ^ lllllllllllllIIIlIlllllllllIIlll[lllllllllllllIIIlIlllllllllIIllI % lllllllllllllIIIlIlllllllllIIlll.length]));
            "".length();
            ++lllllllllllllIIIlIlllllllllIIllI;
            ++lllllllllllllIIIlIllllllllIllllI;
            "".length();
            if (" ".length() <= ((0x5D ^ 0x58 ^ (0x2B ^ 0x65)) & (27 + 133 - 86 + 159 ^ 12 + 9 + 108 + 33 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlllllllllIlIII);
    }
    
    private static void lllIlIIlIIlIIIl() {
        (lIlIIlllIlIIII = new int[2])[0] = ((0x58 ^ 0x50) & ~(0xCA ^ 0xC2));
        BlockColored.lIlIIlllIlIIII[1] = " ".length();
    }
    
    private static void lllIlIIlIIlIIII() {
        (lIlIIlllIIllll = new String[BlockColored.lIlIIlllIlIIII[1]])[BlockColored.lIlIIlllIlIIII[0]] = lllIlIIlIIIllll("NTYABDU=", "VYlkG");
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIIllIIIIIIIIIllIII) {
        return lllllllllllllIIIllIIIIIIIIIllIII.getValue(BlockColored.COLOR).getMetadata();
    }
    
    private static boolean lllIlIIlIIlIIll(final int lllllllllllllIIIlIllllllllIlIllI, final int lllllllllllllIIIlIllllllllIlIlIl) {
        return lllllllllllllIIIlIllllllllIlIllI < lllllllllllllIIIlIllllllllIlIlIl;
    }
    
    public BlockColored(final Material lllllllllllllIIIllIIIIIIIIIlllIl) {
        super(lllllllllllllIIIllIIIIIIIIIlllIl);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lllIlIIlIIlIIlI(final int lllllllllllllIIIlIllllllllIllIlI, final int lllllllllllllIIIlIllllllllIllIIl) {
        return lllllllllllllIIIlIllllllllIllIlI >= lllllllllllllIIIlIllllllllIllIIl;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIlIllllllllllllII) {
        return this.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.byMetadata(lllllllllllllIIIlIllllllllllllII));
    }
    
    static {
        lllIlIIlIIlIIIl();
        lllIlIIlIIlIIII();
        COLOR = PropertyEnum.create(BlockColored.lIlIIlllIIllll[BlockColored.lIlIIlllIlIIII[0]], EnumDyeColor.class);
    }
}
