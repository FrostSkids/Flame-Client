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
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import com.google.common.base.Predicate;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyDirection;

public class BlockWallSign extends BlockSign
{
    private static final /* synthetic */ int[] lIlIlllIlIIlIl;
    private static final /* synthetic */ String[] lIlIlllIlIIIll;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    public static final /* synthetic */ PropertyDirection FACING;
    
    private static boolean llllIIllllIIIII(final Object lllllllllllllIIIIlIllIIIlIlllIIl) {
        return lllllllllllllIIIIlIllIIIlIlllIIl != null;
    }
    
    static {
        llllIIlllIlllIl();
        llllIIlllIllIll();
        FACING = PropertyDirection.create(BlockWallSign.lIlIlllIlIIIll[BlockWallSign.lIlIlllIlIIlIl[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIIIlIllIIIlllIIIlI, final BlockPos lllllllllllllIIIIlIllIIIlllIIIIl, final IBlockState lllllllllllllIIIIlIllIIIlllIIIII, final Block lllllllllllllIIIIlIllIIIlllIIlIl) {
        final EnumFacing lllllllllllllIIIIlIllIIIlllIIlII = lllllllllllllIIIIlIllIIIlllIIIII.getValue((IProperty<EnumFacing>)BlockWallSign.FACING);
        if (llllIIlllIllllI(lllllllllllllIIIIlIllIIIlllIIIlI.getBlockState(lllllllllllllIIIIlIllIIIlllIIIIl.offset(lllllllllllllIIIIlIllIIIlllIIlII.getOpposite())).getBlock().getMaterial().isSolid() ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIIIIlIllIIIlllIIIlI, lllllllllllllIIIIlIllIIIlllIIIIl, lllllllllllllIIIIlIllIIIlllIIIII, BlockWallSign.lIlIlllIlIIlIl[0]);
            lllllllllllllIIIIlIllIIIlllIIIlI.setBlockToAir(lllllllllllllIIIIlIllIIIlllIIIIl);
            "".length();
        }
        super.onNeighborBlockChange(lllllllllllllIIIIlIllIIIlllIIIlI, lllllllllllllIIIIlIllIIIlllIIIIl, lllllllllllllIIIIlIllIIIlllIIIII, lllllllllllllIIIIlIllIIIlllIIlIl);
    }
    
    private static boolean llllIIlllIllllI(final int lllllllllllllIIIIlIllIIIlIllIlll) {
        return lllllllllllllIIIIlIllIIIlIllIlll == 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIIlIllIIlIIIIIIII, final BlockPos lllllllllllllIIIIlIllIIIllllIllI) {
        final EnumFacing lllllllllllllIIIIlIllIIIlllllllI = lllllllllllllIIIIlIllIIlIIIIIIII.getBlockState(lllllllllllllIIIIlIllIIIllllIllI).getValue((IProperty<EnumFacing>)BlockWallSign.FACING);
        final float lllllllllllllIIIIlIllIIIllllllIl = 0.28125f;
        final float lllllllllllllIIIIlIllIIIllllllII = 0.78125f;
        final float lllllllllllllIIIIlIllIIIlllllIll = 0.0f;
        final float lllllllllllllIIIIlIllIIIlllllIlI = 1.0f;
        final float lllllllllllllIIIIlIllIIIlllllIIl = 0.125f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIIIlIllIIIlllllllI.ordinal()]) {
            case 3: {
                this.setBlockBounds(lllllllllllllIIIIlIllIIIlllllIll, lllllllllllllIIIIlIllIIIllllllIl, 1.0f - lllllllllllllIIIIlIllIIIlllllIIl, lllllllllllllIIIIlIllIIIlllllIlI, lllllllllllllIIIIlIllIIIllllllII, 1.0f);
                "".length();
                if ((90 + 60 - 112 + 90 ^ 14 + 74 - 33 + 77) == 0x0) {
                    return;
                }
                break;
            }
            case 4: {
                this.setBlockBounds(lllllllllllllIIIIlIllIIIlllllIll, lllllllllllllIIIIlIllIIIllllllIl, 0.0f, lllllllllllllIIIIlIllIIIlllllIlI, lllllllllllllIIIIlIllIIIllllllII, lllllllllllllIIIIlIllIIIlllllIIl);
                "".length();
                if (((0x2C ^ 0x3) & ~(0x37 ^ 0x18)) > ((0x26 ^ 0x75) & ~(0x94 ^ 0xC7))) {
                    return;
                }
                break;
            }
            case 5: {
                this.setBlockBounds(1.0f - lllllllllllllIIIIlIllIIIlllllIIl, lllllllllllllIIIIlIllIIIllllllIl, lllllllllllllIIIIlIllIIIlllllIll, 1.0f, lllllllllllllIIIIlIllIIIllllllII, lllllllllllllIIIIlIllIIIlllllIlI);
                "".length();
                if (-(0x25 ^ 0x21) > 0) {
                    return;
                }
                break;
            }
            case 6: {
                this.setBlockBounds(0.0f, lllllllllllllIIIIlIllIIIllllllIl, lllllllllllllIIIIlIllIIIlllllIll, lllllllllllllIIIIlIllIIIlllllIIl, lllllllllllllIIIIlIllIIIllllllII, lllllllllllllIIIIlIllIIIlllllIlI);
                break;
            }
        }
    }
    
    private static boolean llllIIlllIlllll(final Object lllllllllllllIIIIlIllIIIlIllllII, final Object lllllllllllllIIIIlIllIIIlIlllIll) {
        return lllllllllllllIIIIlIllIIIlIllllII == lllllllllllllIIIIlIllIIIlIlllIll;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIlIllIIIllIlIIIl) {
        return lllllllllllllIIIIlIllIIIllIlIIIl.getValue((IProperty<EnumFacing>)BlockWallSign.FACING).getIndex();
    }
    
    private static void llllIIlllIllIll() {
        (lIlIlllIlIIIll = new String[BlockWallSign.lIlIlllIlIIlIl[1]])[BlockWallSign.lIlIlllIlIIlIl[0]] = llllIIlllIllIlI("jV5II/Iniyg=", "fbldE");
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockWallSign.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (llllIIllllIIIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final char lllllllllllllIIIIlIllIIIllIIllII = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIIIlIllIIIllIIllII[EnumFacing.DOWN.ordinal()] = BlockWallSign.lIlIlllIlIIlIl[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIllIIIllIIllII[EnumFacing.EAST.ordinal()] = BlockWallSign.lIlIlllIlIIlIl[2];
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIllIIIllIIllII[EnumFacing.NORTH.ordinal()] = BlockWallSign.lIlIlllIlIIlIl[3];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIllIIIllIIllII[EnumFacing.SOUTH.ordinal()] = BlockWallSign.lIlIlllIlIIlIl[4];
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIllIIIllIIllII[EnumFacing.UP.ordinal()] = BlockWallSign.lIlIlllIlIIlIl[5];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIllIIIllIIllII[EnumFacing.WEST.ordinal()] = BlockWallSign.lIlIlllIlIIlIl[6];
            "".length();
            if (-(0x1B ^ 0x1F) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockWallSign.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIIIlIllIIIllIIllII;
    }
    
    public BlockWallSign() {
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockWallSign.FACING, EnumFacing.NORTH));
    }
    
    private static String llllIIlllIllIlI(final String lllllllllllllIIIIlIllIIIllIIIlII, final String lllllllllllllIIIIlIllIIIllIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIllIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), BlockWallSign.lIlIlllIlIIlIl[7]), "DES");
            final Cipher lllllllllllllIIIIlIllIIIllIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIlIllIIIllIIIllI.init(BlockWallSign.lIlIlllIlIIlIl[5], lllllllllllllIIIIlIllIIIllIIIlll);
            return new String(lllllllllllllIIIIlIllIIIllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIllIIIllIIIlIl) {
            lllllllllllllIIIIlIllIIIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockWallSign.lIlIlllIlIIlIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockWallSign.lIlIlllIlIIlIl[0]] = BlockWallSign.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void llllIIlllIlllIl() {
        (lIlIlllIlIIlIl = new int[8])[0] = ((0xD8 ^ 0x95 ^ (0xFB ^ 0x81)) & (23 + 111 - 84 + 132 ^ 42 + 120 - 146 + 113 ^ -" ".length()));
        BlockWallSign.lIlIlllIlIIlIl[1] = " ".length();
        BlockWallSign.lIlIlllIlIIlIl[2] = (0x36 ^ 0x30);
        BlockWallSign.lIlIlllIlIIlIl[3] = "   ".length();
        BlockWallSign.lIlIlllIlIIlIl[4] = (0x8B ^ 0x8F);
        BlockWallSign.lIlIlllIlIIlIl[5] = "  ".length();
        BlockWallSign.lIlIlllIlIIlIl[6] = (0x88 ^ 0x8D);
        BlockWallSign.lIlIlllIlIIlIl[7] = (0x39 ^ 0x1F ^ (0x7D ^ 0x53));
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIlIllIIIllIllIIl) {
        EnumFacing lllllllllllllIIIIlIllIIIllIllIII = EnumFacing.getFront(lllllllllllllIIIIlIllIIIllIllIIl);
        if (llllIIlllIlllll(lllllllllllllIIIIlIllIIIllIllIII.getAxis(), EnumFacing.Axis.Y)) {
            lllllllllllllIIIIlIllIIIllIllIII = EnumFacing.NORTH;
        }
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockWallSign.FACING, lllllllllllllIIIIlIllIIIllIllIII);
    }
}
