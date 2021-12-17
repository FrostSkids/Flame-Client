// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.BlockState;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.IProperty;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyBool;

public class BlockMycelium extends Block
{
    private static final /* synthetic */ String[] llIlllllIlIlll;
    private static final /* synthetic */ int[] llIlllllIllIII;
    public static final /* synthetic */ PropertyBool SNOWY;
    
    @Override
    public void randomDisplayTick(final World llllllllllllIllIIIlIlllIlIIIIIII, final BlockPos llllllllllllIllIIIlIlllIlIIIIlII, final IBlockState llllllllllllIllIIIlIlllIlIIIIIll, final Random llllllllllllIllIIIlIlllIIlllllIl) {
        super.randomDisplayTick(llllllllllllIllIIIlIlllIlIIIIIII, llllllllllllIllIIIlIlllIlIIIIlII, llllllllllllIllIIIlIlllIlIIIIIll, llllllllllllIllIIIlIlllIIlllllIl);
        if (lIIllIllIlIIIIll(llllllllllllIllIIIlIlllIIlllllIl.nextInt(BlockMycelium.llIlllllIllIII[7]))) {
            llllllllllllIllIIIlIlllIlIIIIIII.spawnParticle(EnumParticleTypes.TOWN_AURA, llllllllllllIllIIIlIlllIlIIIIlII.getX() + llllllllllllIllIIIlIlllIIlllllIl.nextFloat(), llllllllllllIllIIIlIlllIlIIIIlII.getY() + 1.1f, llllllllllllIllIIIlIlllIlIIIIlII.getZ() + llllllllllllIllIIIlIlllIIlllllIl.nextFloat(), 0.0, 0.0, 0.0, new int[BlockMycelium.llIlllllIllIII[0]]);
        }
    }
    
    private static void lIIllIllIlIIIIIl() {
        (llIlllllIllIII = new int[8])[0] = ((0x72 ^ 0x3A ^ (0xF1 ^ 0xB6)) & (17 + 183 - 103 + 88 ^ 24 + 101 + 29 + 28 ^ -" ".length()));
        BlockMycelium.llIlllllIllIII[1] = " ".length();
        BlockMycelium.llIlllllIllIII[2] = (0xB ^ 0x79 ^ (0xFF ^ 0x89));
        BlockMycelium.llIlllllIllIII[3] = "  ".length();
        BlockMycelium.llIlllllIllIII[4] = (0xB ^ 0x2);
        BlockMycelium.llIlllllIllIII[5] = "   ".length();
        BlockMycelium.llIlllllIllIII[6] = (0x40 ^ 0x45);
        BlockMycelium.llIlllllIllIII[7] = (0x14 ^ 0x1E);
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllIIIlIlllIIllllIIl, final Random llllllllllllIllIIIlIlllIIlllIllI, final int llllllllllllIllIIIlIlllIIlllIlIl) {
        return Blocks.dirt.getItemDropped(Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), llllllllllllIllIIIlIlllIIlllIllI, llllllllllllIllIIIlIlllIIlllIlIl);
    }
    
    @Override
    public IBlockState getActualState(final IBlockState llllllllllllIllIIIlIlllIlIlIllII, final IBlockAccess llllllllllllIllIIIlIlllIlIlIlIll, final BlockPos llllllllllllIllIIIlIlllIlIlIlIlI) {
        final Block llllllllllllIllIIIlIlllIlIlIlIIl = llllllllllllIllIIIlIlllIlIlIlIll.getBlockState(llllllllllllIllIIIlIlllIlIlIlIlI.up()).getBlock();
        final PropertyBool snowy = BlockMycelium.SNOWY;
        int b;
        if (lIIllIllIlIIIIlI(llllllllllllIllIIIlIlllIlIlIlIIl, Blocks.snow) && lIIllIllIlIIIIlI(llllllllllllIllIIIlIlllIlIlIlIIl, Blocks.snow_layer)) {
            b = BlockMycelium.llIlllllIllIII[0];
            "".length();
            if ("   ".length() == ((0x68 ^ 0xA ^ (0xCE ^ 0xBB)) & (0xD2 ^ 0xA4 ^ (0x71 ^ 0x10) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            b = BlockMycelium.llIlllllIllIII[1];
        }
        return llllllllllllIllIIIlIlllIlIlIllII.withProperty((IProperty<Comparable>)snowy, (boolean)(b != 0));
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIIIlIlllIIlllIIll) {
        return BlockMycelium.llIlllllIllIII[0];
    }
    
    private static void lIIllIllIlIIIIII() {
        (llIlllllIlIlll = new String[BlockMycelium.llIlllllIllIII[1]])[BlockMycelium.llIlllllIllIII[0]] = lIIllIllIIllllll("OTnsKBOsSCE=", "wbqii");
    }
    
    static {
        lIIllIllIlIIIIIl();
        lIIllIllIlIIIIII();
        SNOWY = PropertyBool.create(BlockMycelium.llIlllllIlIlll[BlockMycelium.llIlllllIllIII[0]]);
    }
    
    private static boolean lIIllIllIlIIIIll(final int llllllllllllIllIIIlIlllIIlIIlIIl) {
        return llllllllllllIllIIIlIlllIIlIIlIIl == 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockMycelium.llIlllllIllIII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockMycelium.llIlllllIllIII[0]] = BlockMycelium.SNOWY;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static String lIIllIllIIllllll(final String llllllllllllIllIIIlIlllIIllIIllI, final String llllllllllllIllIIIlIlllIIllIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlllIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlllIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIlllIIllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIlllIIllIlIlI.init(BlockMycelium.llIlllllIllIII[3], llllllllllllIllIIIlIlllIIllIlIll);
            return new String(llllllllllllIllIIIlIlllIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlllIIllIlIIl) {
            llllllllllllIllIIIlIlllIIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void updateTick(final World llllllllllllIllIIIlIlllIlIIlIIlI, final BlockPos llllllllllllIllIIIlIlllIlIIlIIIl, final IBlockState llllllllllllIllIIIlIlllIlIIllIIl, final Random llllllllllllIllIIIlIlllIlIIlIIII) {
        if (lIIllIllIlIIIIll(llllllllllllIllIIIlIlllIlIIlIIlI.isRemote ? 1 : 0)) {
            if (lIIllIllIlIIIlII(llllllllllllIllIIIlIlllIlIIlIIlI.getLightFromNeighbors(llllllllllllIllIIIlIlllIlIIlIIIl.up()), BlockMycelium.llIlllllIllIII[2]) && lIIllIllIlIIIlIl(llllllllllllIllIIIlIlllIlIIlIIlI.getBlockState(llllllllllllIllIIIlIlllIlIIlIIIl.up()).getBlock().getLightOpacity(), BlockMycelium.llIlllllIllIII[3])) {
                llllllllllllIllIIIlIlllIlIIlIIlI.setBlockState(llllllllllllIllIIIlIlllIlIIlIIIl, Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                "".length();
                "".length();
                if ((0x2B ^ 0x2C ^ "   ".length()) < 0) {
                    return;
                }
            }
            else if (lIIllIllIlIIIllI(llllllllllllIllIIIlIlllIlIIlIIlI.getLightFromNeighbors(llllllllllllIllIIIlIlllIlIIlIIIl.up()), BlockMycelium.llIlllllIllIII[4])) {
                int llllllllllllIllIIIlIlllIlIIlIlll = BlockMycelium.llIlllllIllIII[0];
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
                while (!lIIllIllIlIIIllI(llllllllllllIllIIIlIlllIlIIlIlll, BlockMycelium.llIlllllIllIII[2])) {
                    final BlockPos llllllllllllIllIIIlIlllIlIIlIllI = llllllllllllIllIIIlIlllIlIIlIIIl.add(llllllllllllIllIIIlIlllIlIIlIIII.nextInt(BlockMycelium.llIlllllIllIII[5]) - BlockMycelium.llIlllllIllIII[1], llllllllllllIllIIIlIlllIlIIlIIII.nextInt(BlockMycelium.llIlllllIllIII[6]) - BlockMycelium.llIlllllIllIII[5], llllllllllllIllIIIlIlllIlIIlIIII.nextInt(BlockMycelium.llIlllllIllIII[5]) - BlockMycelium.llIlllllIllIII[1]);
                    final IBlockState llllllllllllIllIIIlIlllIlIIlIlIl = llllllllllllIllIIIlIlllIlIIlIIlI.getBlockState(llllllllllllIllIIIlIlllIlIIlIllI);
                    final Block llllllllllllIllIIIlIlllIlIIlIlII = llllllllllllIllIIIlIlllIlIIlIIlI.getBlockState(llllllllllllIllIIIlIlllIlIIlIllI.up()).getBlock();
                    if (lIIllIllIlIIIlll(llllllllllllIllIIIlIlllIlIIlIlIl.getBlock(), Blocks.dirt) && lIIllIllIlIIIlll(llllllllllllIllIIIlIlllIlIIlIlIl.getValue(BlockDirt.VARIANT), BlockDirt.DirtType.DIRT) && lIIllIllIlIIIllI(llllllllllllIllIIIlIlllIlIIlIIlI.getLightFromNeighbors(llllllllllllIllIIIlIlllIlIIlIllI.up()), BlockMycelium.llIlllllIllIII[2]) && lIIllIllIlIIlIII(llllllllllllIllIIIlIlllIlIIlIlII.getLightOpacity(), BlockMycelium.llIlllllIllIII[3])) {
                        llllllllllllIllIIIlIlllIlIIlIIlI.setBlockState(llllllllllllIllIIIlIlllIlIIlIllI, this.getDefaultState());
                        "".length();
                    }
                    ++llllllllllllIllIIIlIlllIlIIlIlll;
                }
            }
        }
    }
    
    private static boolean lIIllIllIlIIIlIl(final int llllllllllllIllIIIlIlllIIlIlIlII, final int llllllllllllIllIIIlIlllIIlIlIIll) {
        return llllllllllllIllIIIlIlllIIlIlIlII > llllllllllllIllIIIlIlllIIlIlIIll;
    }
    
    private static boolean lIIllIllIlIIIlII(final int llllllllllllIllIIIlIlllIIlIlllII, final int llllllllllllIllIIIlIlllIIlIllIll) {
        return llllllllllllIllIIIlIlllIIlIlllII < llllllllllllIllIIIlIlllIIlIllIll;
    }
    
    private static boolean lIIllIllIlIIlIII(final int llllllllllllIllIIIlIlllIIlIllIII, final int llllllllllllIllIIIlIlllIIlIlIlll) {
        return llllllllllllIllIIIlIlllIIlIllIII <= llllllllllllIllIIIlIlllIIlIlIlll;
    }
    
    protected BlockMycelium() {
        super(Material.grass, MapColor.purpleColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockMycelium.SNOWY, (boolean)(BlockMycelium.llIlllllIllIII[0] != 0)));
        this.setTickRandomly((boolean)(BlockMycelium.llIlllllIllIII[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lIIllIllIlIIIlll(final Object llllllllllllIllIIIlIlllIIlIIllII, final Object llllllllllllIllIIIlIlllIIlIIlIll) {
        return llllllllllllIllIIIlIlllIIlIIllII == llllllllllllIllIIIlIlllIIlIIlIll;
    }
    
    private static boolean lIIllIllIlIIIllI(final int llllllllllllIllIIIlIlllIIllIIIII, final int llllllllllllIllIIIlIlllIIlIlllll) {
        return llllllllllllIllIIIlIlllIIllIIIII >= llllllllllllIllIIIlIlllIIlIlllll;
    }
    
    private static boolean lIIllIllIlIIIIlI(final Object llllllllllllIllIIIlIlllIIlIlIIII, final Object llllllllllllIllIIIlIlllIIlIIllll) {
        return llllllllllllIllIIIlIlllIIlIlIIII != llllllllllllIllIIIlIlllIIlIIllll;
    }
}
