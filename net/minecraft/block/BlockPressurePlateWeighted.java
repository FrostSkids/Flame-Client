// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.block.material.MapColor;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyInteger;

public class BlockPressurePlateWeighted extends BlockBasePressurePlate
{
    public static final /* synthetic */ PropertyInteger POWER;
    private static final /* synthetic */ String[] llIllIIIlllIlI;
    private final /* synthetic */ int field_150068_a;
    private static final /* synthetic */ int[] llIllIIlIIlIII;
    
    @Override
    protected IBlockState setRedstoneStrength(final IBlockState llllllllllllIllIIlllllIllIllIIII, final int llllllllllllIllIIlllllIllIlIllIl) {
        return llllllllllllIllIIlllllIllIllIIII.withProperty((IProperty<Comparable>)BlockPressurePlateWeighted.POWER, llllllllllllIllIIlllllIllIlIllIl);
    }
    
    @Override
    public int tickRate(final World llllllllllllIllIIlllllIllIlIlIll) {
        return BlockPressurePlateWeighted.llIllIIlIIlIII[2];
    }
    
    private static boolean lIIlIllIllIIIlll(final int llllllllllllIllIIlllllIllIIIllll) {
        return llllllllllllIllIIlllllIllIIIllll > 0;
    }
    
    protected BlockPressurePlateWeighted(final Material llllllllllllIllIIlllllIlllIlIlll, final int llllllllllllIllIIlllllIlllIlIIll) {
        this(llllllllllllIllIIlllllIlllIlIlll, llllllllllllIllIIlllllIlllIlIIll, llllllllllllIllIIlllllIlllIlIlll.getMaterialMapColor());
    }
    
    private static void lIIlIllIllIIIllI() {
        (llIllIIlIIlIII = new int[5])[0] = ("  ".length() & ~"  ".length());
        BlockPressurePlateWeighted.llIllIIlIIlIII[1] = (0xA5 ^ 0xAA);
        BlockPressurePlateWeighted.llIllIIlIIlIII[2] = (0x17 ^ 0x1D);
        BlockPressurePlateWeighted.llIllIIlIIlIII[3] = " ".length();
        BlockPressurePlateWeighted.llIllIIlIIlIII[4] = "  ".length();
    }
    
    @Override
    protected int getRedstoneStrength(final IBlockState llllllllllllIllIIlllllIllIllIlII) {
        return llllllllllllIllIIlllllIllIllIlII.getValue((IProperty<Integer>)BlockPressurePlateWeighted.POWER);
    }
    
    private static String lIIlIllIlIIlIlIl(final String llllllllllllIllIIlllllIllIIlIllI, final String llllllllllllIllIIlllllIllIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlllllIllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllllIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllllIllIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllllIllIIllIII.init(BlockPressurePlateWeighted.llIllIIlIIlIII[4], llllllllllllIllIIlllllIllIIllIIl);
            return new String(llllllllllllIllIIlllllIllIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllllIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllllIllIIlIlll) {
            llllllllllllIllIIlllllIllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIIlllllIllIlIIlll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockPressurePlateWeighted.POWER, llllllllllllIllIIlllllIllIlIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIIlllllIllIlIIIIl) {
        return llllllllllllIllIIlllllIllIlIIIIl.getValue((IProperty<Integer>)BlockPressurePlateWeighted.POWER);
    }
    
    static {
        lIIlIllIllIIIllI();
        lIIlIllIlIIlIllI();
        POWER = PropertyInteger.create(BlockPressurePlateWeighted.llIllIIIlllIlI[BlockPressurePlateWeighted.llIllIIlIIlIII[0]], BlockPressurePlateWeighted.llIllIIlIIlIII[0], BlockPressurePlateWeighted.llIllIIlIIlIII[1]);
    }
    
    protected BlockPressurePlateWeighted(final Material llllllllllllIllIIlllllIlllIIlIIl, final int llllllllllllIllIIlllllIlllIIllII, final MapColor llllllllllllIllIIlllllIlllIIIlll) {
        super(llllllllllllIllIIlllllIlllIIlIIl, llllllllllllIllIIlllllIlllIIIlll);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockPressurePlateWeighted.POWER, BlockPressurePlateWeighted.llIllIIlIIlIII[0]));
        this.field_150068_a = llllllllllllIllIIlllllIlllIIllII;
    }
    
    private static void lIIlIllIlIIlIllI() {
        (llIllIIIlllIlI = new String[BlockPressurePlateWeighted.llIllIIlIIlIII[3]])[BlockPressurePlateWeighted.llIllIIlIIlIII[0]] = lIIlIllIlIIlIlIl("yQJj0EmaCnE=", "OjQhI");
    }
    
    @Override
    protected int computeRedstoneStrength(final World llllllllllllIllIIlllllIllIlllIll, final BlockPos llllllllllllIllIIlllllIllIllllll) {
        final int llllllllllllIllIIlllllIllIlllllI = Math.min(llllllllllllIllIIlllllIllIlllIll.getEntitiesWithinAABB((Class<? extends Entity>)Entity.class, this.getSensitiveAABB(llllllllllllIllIIlllllIllIllllll)).size(), this.field_150068_a);
        if (lIIlIllIllIIIlll(llllllllllllIllIIlllllIllIlllllI)) {
            final float llllllllllllIllIIlllllIllIllllIl = Math.min(this.field_150068_a, llllllllllllIllIIlllllIllIlllllI) / (float)this.field_150068_a;
            return MathHelper.ceiling_float_int(llllllllllllIllIIlllllIllIllllIl * 15.0f);
        }
        return BlockPressurePlateWeighted.llIllIIlIIlIII[0];
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPressurePlateWeighted.llIllIIlIIlIII[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPressurePlateWeighted.llIllIIlIIlIII[0]] = BlockPressurePlateWeighted.POWER;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
}
