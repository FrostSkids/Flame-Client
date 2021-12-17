// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockRail extends BlockRailBase
{
    public static final /* synthetic */ PropertyEnum<EnumRailDirection> SHAPE;
    private static final /* synthetic */ int[] lIIlllIlllllIl;
    private static final /* synthetic */ String[] lIIlllIllllIll;
    
    private static void llIlllIIlIllIlI() {
        (lIIlllIllllIll = new String[BlockRail.lIIlllIlllllIl[2]])[BlockRail.lIIlllIlllllIl[0]] = llIlllIIlIllIIl("xNNZPolV60Q=", "ylajT");
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIIllIlIIIIllllIl) {
        return this.getDefaultState().withProperty(BlockRail.SHAPE, EnumRailDirection.byMetadata(lllllllllllllIIlIIllIlIIIIllllIl));
    }
    
    protected BlockRail() {
        super((boolean)(BlockRail.lIIlllIlllllIl[0] != 0));
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockRail.SHAPE, EnumRailDirection.NORTH_SOUTH));
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIIllIlIIIIlllIlI) {
        return lllllllllllllIIlIIllIlIIIIlllIlI.getValue(BlockRail.SHAPE).getMetadata();
    }
    
    private static String llIlllIIlIllIIl(final String lllllllllllllIIlIIllIlIIIIlIlllI, final String lllllllllllllIIlIIllIlIIIIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIlIIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIlIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIllIlIIIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIllIlIIIIllIIII.init(BlockRail.lIIlllIlllllIl[3], lllllllllllllIIlIIllIlIIIIllIIIl);
            return new String(lllllllllllllIIlIIllIlIIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIlIIIIlIllll) {
            lllllllllllllIIlIIllIlIIIIlIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void onNeighborChangedInternal(final World lllllllllllllIIlIIllIlIIIlIIllII, final BlockPos lllllllllllllIIlIIllIlIIIlIIIllI, final IBlockState lllllllllllllIIlIIllIlIIIlIIlIlI, final Block lllllllllllllIIlIIllIlIIIlIIlIIl) {
        if (llIlllIIllIIIll(lllllllllllllIIlIIllIlIIIlIIlIIl.canProvidePower() ? 1 : 0) && llIlllIIllIIlII(new Rail(lllllllllllllIIlIIllIlIIIlIIllII, lllllllllllllIIlIIllIlIIIlIIIllI, lllllllllllllIIlIIllIlIIIlIIlIlI).countAdjacentRails(), BlockRail.lIIlllIlllllIl[1])) {
            this.func_176564_a(lllllllllllllIIlIIllIlIIIlIIllII, lllllllllllllIIlIIllIlIIIlIIIllI, lllllllllllllIIlIIllIlIIIlIIlIlI, (boolean)(BlockRail.lIIlllIlllllIl[0] != 0));
            "".length();
        }
    }
    
    private static boolean llIlllIIllIIlII(final int lllllllllllllIIlIIllIlIIIIlIIllI, final int lllllllllllllIIlIIllIlIIIIlIIlIl) {
        return lllllllllllllIIlIIllIlIIIIlIIllI == lllllllllllllIIlIIllIlIIIIlIIlIl;
    }
    
    @Override
    public IProperty<EnumRailDirection> getShapeProperty() {
        return BlockRail.SHAPE;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockRail.lIIlllIlllllIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRail.lIIlllIlllllIl[0]] = BlockRail.SHAPE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean llIlllIIllIIIll(final int lllllllllllllIIlIIllIlIIIIlIIIll) {
        return lllllllllllllIIlIIllIlIIIIlIIIll != 0;
    }
    
    static {
        llIlllIIllIIIlI();
        llIlllIIlIllIlI();
        SHAPE = PropertyEnum.create(BlockRail.lIIlllIllllIll[BlockRail.lIIlllIlllllIl[0]], EnumRailDirection.class);
    }
    
    private static void llIlllIIllIIIlI() {
        (lIIlllIlllllIl = new int[4])[0] = ((0x31 ^ 0x6) & ~(0x2B ^ 0x1C));
        BlockRail.lIIlllIlllllIl[1] = "   ".length();
        BlockRail.lIIlllIlllllIl[2] = " ".length();
        BlockRail.lIIlllIlllllIl[3] = "  ".length();
    }
}
