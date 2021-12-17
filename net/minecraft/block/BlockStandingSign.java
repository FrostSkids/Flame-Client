// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyInteger;

public class BlockStandingSign extends BlockSign
{
    public static final /* synthetic */ PropertyInteger ROTATION;
    private static final /* synthetic */ int[] lllIlllIIlllII;
    private static final /* synthetic */ String[] lllIlllIIllIll;
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIllIIIIlIllIIlIlll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockStandingSign.ROTATION, llllllllllllIlIllIIIIlIllIIlIlll);
    }
    
    private static boolean lIlIIlIllIIlllll(final int llllllllllllIlIllIIIIlIlIlllIlII) {
        return llllllllllllIlIllIIIIlIlIlllIlII == 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlIllIIIIlIllIlIIllI, final BlockPos llllllllllllIlIllIIIIlIllIIlllIl, final IBlockState llllllllllllIlIllIIIIlIllIIlllII, final Block llllllllllllIlIllIIIIlIllIlIIIlI) {
        if (lIlIIlIllIIlllll(llllllllllllIlIllIIIIlIllIlIIllI.getBlockState(llllllllllllIlIllIIIIlIllIIlllIl.down()).getBlock().getMaterial().isSolid() ? 1 : 0)) {
            this.dropBlockAsItem(llllllllllllIlIllIIIIlIllIlIIllI, llllllllllllIlIllIIIIlIllIIlllIl, llllllllllllIlIllIIIIlIllIIlllII, BlockStandingSign.lllIlllIIlllII[0]);
            llllllllllllIlIllIIIIlIllIlIIllI.setBlockToAir(llllllllllllIlIllIIIIlIllIIlllIl);
            "".length();
        }
        super.onNeighborBlockChange(llllllllllllIlIllIIIIlIllIlIIllI, llllllllllllIlIllIIIIlIllIIlllIl, llllllllllllIlIllIIIIlIllIIlllII, llllllllllllIlIllIIIIlIllIlIIIlI);
    }
    
    private static void lIlIIlIllIIlllIl() {
        (lllIlllIIllIll = new String[BlockStandingSign.lllIlllIIlllII[2]])[BlockStandingSign.lllIlllIIlllII[0]] = lIlIIlIllIIlllII("Lmkex8+olSesKqsGYJqcQw==", "DWuph");
    }
    
    static {
        lIlIIlIllIIllllI();
        lIlIIlIllIIlllIl();
        ROTATION = PropertyInteger.create(BlockStandingSign.lllIlllIIllIll[BlockStandingSign.lllIlllIIlllII[0]], BlockStandingSign.lllIlllIIlllII[0], BlockStandingSign.lllIlllIIlllII[1]);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIllIIIIlIllIIlIIII) {
        return llllllllllllIlIllIIIIlIllIIlIIII.getValue((IProperty<Integer>)BlockStandingSign.ROTATION);
    }
    
    private static String lIlIIlIllIIlllII(final String llllllllllllIlIllIIIIlIlIllllIll, final String llllllllllllIlIllIIIIlIlIllllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIlIlIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIlIlIllllIII.getBytes(StandardCharsets.UTF_8)), BlockStandingSign.lllIlllIIlllII[3]), "DES");
            final Cipher llllllllllllIlIllIIIIlIlIlllllIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIlIlIlllllIl.init(BlockStandingSign.lllIlllIIlllII[4], llllllllllllIlIllIIIIlIlIllllllI);
            return new String(llllllllllllIlIllIIIIlIlIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIlIlIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIlIlIlllllII) {
            llllllllllllIlIllIIIIlIlIlllllII.printStackTrace();
            return null;
        }
    }
    
    public BlockStandingSign() {
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockStandingSign.ROTATION, BlockStandingSign.lllIlllIIlllII[0]));
    }
    
    private static void lIlIIlIllIIllllI() {
        (lllIlllIIlllII = new int[5])[0] = ((0x21 ^ 0x71) & ~(0x6D ^ 0x3D));
        BlockStandingSign.lllIlllIIlllII[1] = (0x83 ^ 0x8C);
        BlockStandingSign.lllIlllIIlllII[2] = " ".length();
        BlockStandingSign.lllIlllIIlllII[3] = (0x94 ^ 0x9C);
        BlockStandingSign.lllIlllIIlllII[4] = "  ".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStandingSign.lllIlllIIlllII[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStandingSign.lllIlllIIlllII[0]] = BlockStandingSign.ROTATION;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
}
