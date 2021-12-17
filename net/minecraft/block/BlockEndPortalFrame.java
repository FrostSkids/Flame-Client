// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.BlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.base.Predicate;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;

public class BlockEndPortalFrame extends Block
{
    public static final /* synthetic */ PropertyDirection FACING;
    public static final /* synthetic */ PropertyBool EYE;
    private static final /* synthetic */ int[] llIllIlIlIIlIl;
    private static final /* synthetic */ String[] llIllIlIlIIlII;
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockEndPortalFrame.llIllIlIlIIlIl[0] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIIllIllIIllIlllll) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool eye = BlockEndPortalFrame.EYE;
        int b;
        if (lIIlIlllllIlIIlI(llllllllllllIllIIllIllIIllIlllll & BlockEndPortalFrame.llIllIlIlIIlIl[3])) {
            b = BlockEndPortalFrame.llIllIlIlIIlIl[1];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            b = BlockEndPortalFrame.llIllIlIlIIlIl[0];
        }
        return defaultState.withProperty((IProperty<Comparable>)eye, (boolean)(b != 0)).withProperty((IProperty<Comparable>)BlockEndPortalFrame.FACING, EnumFacing.getHorizontal(llllllllllllIllIIllIllIIllIlllll & BlockEndPortalFrame.llIllIlIlIIlIl[4]));
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllIIllIllIIlllllIlI, final Random llllllllllllIllIIllIllIIlllllIIl, final int llllllllllllIllIIllIllIIlllllIII) {
        return null;
    }
    
    static {
        lIIlIlllllIlIIIl();
        lIIlIlllllIlIIII();
        FACING = PropertyDirection.create(BlockEndPortalFrame.llIllIlIlIIlII[BlockEndPortalFrame.llIllIlIlIIlIl[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
        EYE = PropertyBool.create(BlockEndPortalFrame.llIllIlIlIIlII[BlockEndPortalFrame.llIllIlIlIIlIl[1]]);
    }
    
    private static String lIIlIlllllIIlllI(String llllllllllllIllIIllIllIIlIllIllI, final String llllllllllllIllIIllIllIIlIlllIlI) {
        llllllllllllIllIIllIllIIlIllIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIllIllIIlIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIllIIlIlllIIl = new StringBuilder();
        final char[] llllllllllllIllIIllIllIIlIlllIII = llllllllllllIllIIllIllIIlIlllIlI.toCharArray();
        int llllllllllllIllIIllIllIIlIllIlll = BlockEndPortalFrame.llIllIlIlIIlIl[0];
        final boolean llllllllllllIllIIllIllIIlIllIIIl = (Object)llllllllllllIllIIllIllIIlIllIllI.toCharArray();
        final boolean llllllllllllIllIIllIllIIlIllIIII = llllllllllllIllIIllIllIIlIllIIIl.length != 0;
        long llllllllllllIllIIllIllIIlIlIllll = BlockEndPortalFrame.llIllIlIlIIlIl[0];
        while (lIIlIlllllIlIIll((int)llllllllllllIllIIllIllIIlIlIllll, llllllllllllIllIIllIllIIlIllIIII ? 1 : 0)) {
            final char llllllllllllIllIIllIllIIlIllllII = llllllllllllIllIIllIllIIlIllIIIl[llllllllllllIllIIllIllIIlIlIllll];
            llllllllllllIllIIllIllIIlIlllIIl.append((char)(llllllllllllIllIIllIllIIlIllllII ^ llllllllllllIllIIllIllIIlIlllIII[llllllllllllIllIIllIllIIlIllIlll % llllllllllllIllIIllIllIIlIlllIII.length]));
            "".length();
            ++llllllllllllIllIIllIllIIlIllIlll;
            ++llllllllllllIllIIllIllIIlIlIllll;
            "".length();
            if (((0x43 ^ 0x31 ^ (0x21 ^ 0x56)) & (0x9 ^ 0x24 ^ (0x38 ^ 0x10) ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIllIIlIlllIIl);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockEndPortalFrame.llIllIlIlIIlIl[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockEndPortalFrame.llIllIlIlIIlIl[0]] = BlockEndPortalFrame.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockEndPortalFrame.llIllIlIlIIlIl[1]] = BlockEndPortalFrame.EYE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIllIIllIllIIllllIlII, final BlockPos llllllllllllIllIIllIllIIllllIIll, final EnumFacing llllllllllllIllIIllIllIIllllIIlI, final float llllllllllllIllIIllIllIIllllIIIl, final float llllllllllllIllIIllIllIIllllIIII, final float llllllllllllIllIIllIllIIlllIllll, final int llllllllllllIllIIllIllIIlllIlllI, final EntityLivingBase llllllllllllIllIIllIllIIlllIlIll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockEndPortalFrame.FACING, llllllllllllIllIIllIllIIlllIlIll.getHorizontalFacing().getOpposite()).withProperty((IProperty<Comparable>)BlockEndPortalFrame.EYE, (boolean)(BlockEndPortalFrame.llIllIlIlIIlIl[0] != 0));
    }
    
    private static String lIIlIlllllIIllll(final String llllllllllllIllIIllIllIIllIIlIll, final String llllllllllllIllIIllIllIIllIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIllIllIIllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIllIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIllIIllIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIllIIllIIllIl.init(BlockEndPortalFrame.llIllIlIlIIlIl[5], llllllllllllIllIIllIllIIllIIlllI);
            return new String(llllllllllllIllIIllIllIIllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIllIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIllIIllIIllII) {
            llllllllllllIllIIllIllIIllIIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockEndPortalFrame.llIllIlIlIIlIl[1] != 0;
    }
    
    private static void lIIlIlllllIlIIIl() {
        (llIllIlIlIIlIl = new int[6])[0] = ((0x57 ^ 0x79) & ~(0x69 ^ 0x47));
        BlockEndPortalFrame.llIllIlIlIIlIl[1] = " ".length();
        BlockEndPortalFrame.llIllIlIlIIlIl[2] = (35 + 46 - 32 + 80 ^ 85 + 10 - 4 + 51);
        BlockEndPortalFrame.llIllIlIlIIlIl[3] = (0x74 ^ 0x70);
        BlockEndPortalFrame.llIllIlIlIIlIl[4] = "   ".length();
        BlockEndPortalFrame.llIllIlIlIIlIl[5] = "  ".length();
    }
    
    private static void lIIlIlllllIlIIII() {
        (llIllIlIlIIlII = new String[BlockEndPortalFrame.llIllIlIlIIlIl[5]])[BlockEndPortalFrame.llIllIlIlIIlIl[0]] = lIIlIlllllIIlllI("CQkbAT4I", "ohxhP");
        BlockEndPortalFrame.llIllIlIlIIlII[BlockEndPortalFrame.llIllIlIlIIlIl[1]] = lIIlIlllllIIllll("jNWGqY9NHQ0=", "vhmlM");
    }
    
    @Override
    public int getComparatorInputOverride(final World llllllllllllIllIIllIllIIlllIIllI, final BlockPos llllllllllllIllIIllIllIIlllIIlIl) {
        int n;
        if (lIIlIlllllIlIIlI(((boolean)llllllllllllIllIIllIllIIlllIIllI.getBlockState(llllllllllllIllIIllIllIIlllIIlIl).getValue((IProperty<Boolean>)BlockEndPortalFrame.EYE)) ? 1 : 0)) {
            n = BlockEndPortalFrame.llIllIlIlIIlIl[2];
            "".length();
            if (((0x76 ^ 0x28) & ~(0x6E ^ 0x30)) > " ".length()) {
                return (0x79 ^ 0x30) & ~(0x70 ^ 0x39);
            }
        }
        else {
            n = BlockEndPortalFrame.llIllIlIlIIlIl[0];
        }
        return n;
    }
    
    @Override
    public void addCollisionBoxesToList(final World llllllllllllIllIIllIllIlIIIIlIII, final BlockPos llllllllllllIllIIllIllIlIIIIIlll, final IBlockState llllllllllllIllIIllIllIIllllllll, final AxisAlignedBB llllllllllllIllIIllIllIIlllllllI, final List<AxisAlignedBB> llllllllllllIllIIllIllIlIIIIIlII, final Entity llllllllllllIllIIllIllIIllllllII) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
        super.addCollisionBoxesToList(llllllllllllIllIIllIllIlIIIIlIII, llllllllllllIllIIllIllIlIIIIIlll, llllllllllllIllIIllIllIIllllllll, llllllllllllIllIIllIllIIlllllllI, llllllllllllIllIIllIllIlIIIIIlII, llllllllllllIllIIllIllIIllllllII);
        if (lIIlIlllllIlIIlI(((boolean)llllllllllllIllIIllIllIlIIIIlIII.getBlockState(llllllllllllIllIIllIllIlIIIIIlll).getValue((IProperty<Boolean>)BlockEndPortalFrame.EYE)) ? 1 : 0)) {
            this.setBlockBounds(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
            super.addCollisionBoxesToList(llllllllllllIllIIllIllIlIIIIlIII, llllllllllllIllIIllIllIlIIIIIlll, llllllllllllIllIIllIllIIllllllll, llllllllllllIllIIllIllIIlllllllI, llllllllllllIllIIllIllIlIIIIIlII, llllllllllllIllIIllIllIIllllllII);
        }
        this.setBlockBoundsForItemRender();
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIIllIllIIllIlIlll) {
        int llllllllllllIllIIllIllIIllIllIII = BlockEndPortalFrame.llIllIlIlIIlIl[0];
        llllllllllllIllIIllIllIIllIllIII |= llllllllllllIllIIllIllIIllIlIlll.getValue((IProperty<EnumFacing>)BlockEndPortalFrame.FACING).getHorizontalIndex();
        if (lIIlIlllllIlIIlI(((boolean)llllllllllllIllIIllIllIIllIlIlll.getValue((IProperty<Boolean>)BlockEndPortalFrame.EYE)) ? 1 : 0)) {
            llllllllllllIllIIllIllIIllIllIII |= BlockEndPortalFrame.llIllIlIlIIlIl[3];
        }
        return llllllllllllIllIIllIllIIllIllIII;
    }
    
    private static boolean lIIlIlllllIlIIll(final int llllllllllllIllIIllIllIIlIlIlIll, final int llllllllllllIllIIllIllIIlIlIlIlI) {
        return llllllllllllIllIIllIllIIlIlIlIll < llllllllllllIllIIllIllIIlIlIlIlI;
    }
    
    private static boolean lIIlIlllllIlIIlI(final int llllllllllllIllIIllIllIIlIlIlIII) {
        return llllllllllllIllIIllIllIIlIlIlIII != 0;
    }
    
    public BlockEndPortalFrame() {
        super(Material.rock, MapColor.greenColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockEndPortalFrame.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockEndPortalFrame.EYE, (boolean)(BlockEndPortalFrame.llIllIlIlIIlIl[0] != 0)));
    }
}
