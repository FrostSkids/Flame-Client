// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.BlockState;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyBool;

public class BlockFenceGate extends BlockDirectional
{
    private static final /* synthetic */ String[] lllIIIIlIIIIII;
    public static final /* synthetic */ PropertyBool OPEN;
    public static final /* synthetic */ PropertyBool IN_WALL;
    public static final /* synthetic */ PropertyBool POWERED;
    private static final /* synthetic */ int[] lllIIIIlIIIIIl;
    
    @Override
    public boolean isOpaqueCube() {
        return BlockFenceGate.lllIIIIlIIIIIl[0] != 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIIIIllIIlIllIIllI, final BlockPos llllllllllllIllIIIIllIIlIllIIlIl, final IBlockState llllllllllllIllIIIIllIIlIllIIlII, final Block llllllllllllIllIIIIllIIlIlIllllI) {
        if (lIIlllIIIllIIIII(llllllllllllIllIIIIllIIlIllIIllI.isRemote ? 1 : 0)) {
            final boolean llllllllllllIllIIIIllIIlIllIIIlI = llllllllllllIllIIIIllIIlIllIIllI.isBlockPowered(llllllllllllIllIIIIllIIlIllIIlIl);
            if (!lIIlllIIIllIIIII(llllllllllllIllIIIIllIIlIllIIIlI ? 1 : 0) || lIIlllIIIlIlllll(llllllllllllIllIIIIllIIlIlIllllI.canProvidePower() ? 1 : 0)) {
                if (lIIlllIIIlIlllll(llllllllllllIllIIIIllIIlIllIIIlI ? 1 : 0) && lIIlllIIIllIIIII(((boolean)llllllllllllIllIIIIllIIlIllIIlII.getValue((IProperty<Boolean>)BlockFenceGate.OPEN)) ? 1 : 0) && lIIlllIIIllIIIII(((boolean)llllllllllllIllIIIIllIIlIllIIlII.getValue((IProperty<Boolean>)BlockFenceGate.POWERED)) ? 1 : 0)) {
                    llllllllllllIllIIIIllIIlIllIIllI.setBlockState(llllllllllllIllIIIIllIIlIllIIlIl, llllllllllllIllIIIIllIIlIllIIlII.withProperty((IProperty<Comparable>)BlockFenceGate.OPEN, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[1] != 0)).withProperty((IProperty<Comparable>)BlockFenceGate.POWERED, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[1] != 0)), BlockFenceGate.lllIIIIlIIIIIl[2]);
                    "".length();
                    llllllllllllIllIIIIllIIlIllIIllI.playAuxSFXAtEntity(null, BlockFenceGate.lllIIIIlIIIIIl[3], llllllllllllIllIIIIllIIlIllIIlIl, BlockFenceGate.lllIIIIlIIIIIl[0]);
                    "".length();
                    if ("   ".length() == -" ".length()) {
                        return;
                    }
                }
                else if (lIIlllIIIllIIIII(llllllllllllIllIIIIllIIlIllIIIlI ? 1 : 0) && lIIlllIIIlIlllll(((boolean)llllllllllllIllIIIIllIIlIllIIlII.getValue((IProperty<Boolean>)BlockFenceGate.OPEN)) ? 1 : 0) && lIIlllIIIlIlllll(((boolean)llllllllllllIllIIIIllIIlIllIIlII.getValue((IProperty<Boolean>)BlockFenceGate.POWERED)) ? 1 : 0)) {
                    llllllllllllIllIIIIllIIlIllIIllI.setBlockState(llllllllllllIllIIIIllIIlIllIIlIl, llllllllllllIllIIIIllIIlIllIIlII.withProperty((IProperty<Comparable>)BlockFenceGate.OPEN, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFenceGate.POWERED, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0)), BlockFenceGate.lllIIIIlIIIIIl[2]);
                    "".length();
                    llllllllllllIllIIIIllIIlIllIIllI.playAuxSFXAtEntity(null, BlockFenceGate.lllIIIIlIIIIIl[4], llllllllllllIllIIIIllIIlIllIIlIl, BlockFenceGate.lllIIIIlIIIIIl[0]);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
                else if (lIIlllIIIllIIIIl(llllllllllllIllIIIIllIIlIllIIIlI ? 1 : 0, ((boolean)llllllllllllIllIIIIllIIlIllIIlII.getValue((IProperty<Boolean>)BlockFenceGate.POWERED)) ? 1 : 0)) {
                    llllllllllllIllIIIIllIIlIllIIllI.setBlockState(llllllllllllIllIIIIllIIlIllIIlIl, llllllllllllIllIIIIllIIlIllIIlII.withProperty((IProperty<Comparable>)BlockFenceGate.POWERED, llllllllllllIllIIIIllIIlIllIIIlI), BlockFenceGate.lllIIIIlIIIIIl[2]);
                    "".length();
                }
            }
        }
    }
    
    private static void lIIlllIIIlIlllII() {
        (lllIIIIlIIIIIl = new int[8])[0] = ((0xB9 ^ 0x94) & ~(0x32 ^ 0x1F));
        BlockFenceGate.lllIIIIlIIIIIl[1] = " ".length();
        BlockFenceGate.lllIIIIlIIIIIl[2] = "  ".length();
        BlockFenceGate.lllIIIIlIIIIIl[3] = (0xFFFF87FF & 0x7BEB);
        BlockFenceGate.lllIIIIlIIIIIl[4] = (-(0xFFFFBD3E & 0x7AD3) & (0xFFFFBBFF & 0x7FFF));
        BlockFenceGate.lllIIIIlIIIIIl[5] = (0x23 ^ 0x27);
        BlockFenceGate.lllIIIIlIIIIIl[6] = (0x33 ^ 0x3B);
        BlockFenceGate.lllIIIIlIIIIIl[7] = "   ".length();
    }
    
    public BlockFenceGate(final BlockPlanks.EnumType llllllllllllIllIIIIllIIlllIIIllI) {
        super(Material.wood, llllllllllllIllIIIIllIIlllIIIllI.func_181070_c());
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockFenceGate.OPEN, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFenceGate.POWERED, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFenceGate.IN_WALL, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    private static void lIIlllIIIlIllIlI() {
        (lllIIIIlIIIIII = new String[BlockFenceGate.lllIIIIlIIIIIl[7]])[BlockFenceGate.lllIIIIlIIIIIl[0]] = lIIlllIIIlIlIlll("nwJZPDRcGPA=", "dBTmt");
        BlockFenceGate.lllIIIIlIIIIII[BlockFenceGate.lllIIIIlIIIIIl[1]] = lIIlllIIIlIllIIl("KTczKQg8PA==", "YXDLz");
        BlockFenceGate.lllIIIIlIIIIII[BlockFenceGate.lllIIIIlIIIIIl[2]] = lIIlllIIIlIllIIl("GCQ7JAwdJg==", "qJdSm");
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIllIIIIllIIllIIIlIlI, final BlockPos llllllllllllIllIIIIllIIllIIIlIIl, final EnumFacing llllllllllllIllIIIIllIIllIIIlIII, final float llllllllllllIllIIIIllIIllIIIIlll, final float llllllllllllIllIIIIllIIllIIIIllI, final float llllllllllllIllIIIIllIIllIIIIlIl, final int llllllllllllIllIIIIllIIllIIIIlII, final EntityLivingBase llllllllllllIllIIIIllIIllIIIIIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockFenceGate.FACING, llllllllllllIllIIIIllIIllIIIIIIl.getHorizontalFacing()).withProperty((IProperty<Comparable>)BlockFenceGate.OPEN, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFenceGate.POWERED, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFenceGate.IN_WALL, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0));
    }
    
    private static boolean lIIlllIIIllIIIII(final int llllllllllllIllIIIIllIIlIIIlIlII) {
        return llllllllllllIllIIIIllIIlIIIlIlII == 0;
    }
    
    static {
        lIIlllIIIlIlllII();
        lIIlllIIIlIllIlI();
        OPEN = PropertyBool.create(BlockFenceGate.lllIIIIlIIIIII[BlockFenceGate.lllIIIIlIIIIIl[0]]);
        POWERED = PropertyBool.create(BlockFenceGate.lllIIIIlIIIIII[BlockFenceGate.lllIIIIlIIIIIl[1]]);
        IN_WALL = PropertyBool.create(BlockFenceGate.lllIIIIlIIIIII[BlockFenceGate.lllIIIIlIIIIIl[2]]);
    }
    
    private static boolean lIIlllIIIlIllllI(final Object llllllllllllIllIIIIllIIlIIIlllIl, final Object llllllllllllIllIIIIllIIlIIIlllII) {
        return llllllllllllIllIIIIllIIlIIIlllIl != llllllllllllIllIIIIllIIlIIIlllII;
    }
    
    @Override
    public IBlockState getActualState(IBlockState llllllllllllIllIIIIllIIllIlllIlI, final IBlockAccess llllllllllllIllIIIIllIIllIllllIl, final BlockPos llllllllllllIllIIIIllIIllIlllIII) {
        final EnumFacing.Axis llllllllllllIllIIIIllIIllIlllIll = llllllllllllIllIIIIllIIllIlllIlI.getValue((IProperty<EnumFacing>)BlockFenceGate.FACING).getAxis();
        if ((lIIlllIIIlIlllIl(llllllllllllIllIIIIllIIllIlllIll, EnumFacing.Axis.Z) && (!lIIlllIIIlIllllI(llllllllllllIllIIIIllIIllIllllIl.getBlockState(llllllllllllIllIIIIllIIllIlllIII.west()).getBlock(), Blocks.cobblestone_wall) || !lIIlllIIIlIllllI(llllllllllllIllIIIIllIIllIllllIl.getBlockState(llllllllllllIllIIIIllIIllIlllIII.east()).getBlock(), Blocks.cobblestone_wall))) || (lIIlllIIIlIlllIl(llllllllllllIllIIIIllIIllIlllIll, EnumFacing.Axis.X) && (!lIIlllIIIlIllllI(llllllllllllIllIIIIllIIllIllllIl.getBlockState(llllllllllllIllIIIIllIIllIlllIII.north()).getBlock(), Blocks.cobblestone_wall) || lIIlllIIIlIlllIl(llllllllllllIllIIIIllIIllIllllIl.getBlockState(llllllllllllIllIIIIllIIllIlllIII.south()).getBlock(), Blocks.cobblestone_wall)))) {
            llllllllllllIllIIIIllIIllIlllIlI = llllllllllllIllIIIIllIIllIlllIlI.withProperty((IProperty<Comparable>)BlockFenceGate.IN_WALL, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[1] != 0));
        }
        return llllllllllllIllIIIIllIIllIlllIlI;
    }
    
    private static boolean lIIlllIIIllIIIIl(final int llllllllllllIllIIIIllIIlIIIlIIIl, final int llllllllllllIllIIIIllIIlIIIlIIII) {
        return llllllllllllIllIIIIllIIlIIIlIIIl != llllllllllllIllIIIIllIIlIIIlIIII;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIllIIIIllIIllIIllIIl, final BlockPos llllllllllllIllIIIIllIIllIIlllII) {
        final EnumFacing.Axis llllllllllllIllIIIIllIIllIIllIll = llllllllllllIllIIIIllIIllIIllIIl.getBlockState(llllllllllllIllIIIIllIIllIIlllII).getValue((IProperty<EnumFacing>)BlockFenceGate.FACING).getAxis();
        if (lIIlllIIIlIlllIl(llllllllllllIllIIIIllIIllIIllIll, EnumFacing.Axis.Z)) {
            this.setBlockBounds(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean isPassable(final IBlockAccess llllllllllllIllIIIIllIIllIIIllll, final BlockPos llllllllllllIllIIIIllIIllIIlIIII) {
        return llllllllllllIllIIIIllIIllIIIllll.getBlockState(llllllllllllIllIIIIllIIllIIlIIII).getValue((IProperty<Boolean>)BlockFenceGate.OPEN);
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess llllllllllllIllIIIIllIIlIlIllIll, final BlockPos llllllllllllIllIIIIllIIlIlIllIlI, final EnumFacing llllllllllllIllIIIIllIIlIlIllIIl) {
        return BlockFenceGate.lllIIIIlIIIIIl[1] != 0;
    }
    
    private static String lIIlllIIIlIllIIl(String llllllllllllIllIIIIllIIlIIlIllII, final String llllllllllllIllIIIIllIIlIIlIlIll) {
        llllllllllllIllIIIIllIIlIIlIllII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIllIIlIIlIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIllIIlIIlIllll = new StringBuilder();
        final char[] llllllllllllIllIIIIllIIlIIlIlllI = llllllllllllIllIIIIllIIlIIlIlIll.toCharArray();
        int llllllllllllIllIIIIllIIlIIlIllIl = BlockFenceGate.lllIIIIlIIIIIl[0];
        final float llllllllllllIllIIIIllIIlIIlIIlll = (Object)((String)llllllllllllIllIIIIllIIlIIlIllII).toCharArray();
        final byte llllllllllllIllIIIIllIIlIIlIIllI = (byte)llllllllllllIllIIIIllIIlIIlIIlll.length;
        double llllllllllllIllIIIIllIIlIIlIIlIl = BlockFenceGate.lllIIIIlIIIIIl[0];
        while (lIIlllIIIllIIIlI((int)llllllllllllIllIIIIllIIlIIlIIlIl, llllllllllllIllIIIIllIIlIIlIIllI)) {
            final char llllllllllllIllIIIIllIIlIIllIIlI = llllllllllllIllIIIIllIIlIIlIIlll[llllllllllllIllIIIIllIIlIIlIIlIl];
            llllllllllllIllIIIIllIIlIIlIllll.append((char)(llllllllllllIllIIIIllIIlIIllIIlI ^ llllllllllllIllIIIIllIIlIIlIlllI[llllllllllllIllIIIIllIIlIIlIllIl % llllllllllllIllIIIIllIIlIIlIlllI.length]));
            "".length();
            ++llllllllllllIllIIIIllIIlIIlIllIl;
            ++llllllllllllIllIIIIllIIlIIlIIlIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIllIIlIIlIllll);
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIllIIIIllIIlIlllIIIl, final BlockPos llllllllllllIllIIIIllIIlIlllIIII, IBlockState llllllllllllIllIIIIllIIlIllIllll, final EntityPlayer llllllllllllIllIIIIllIIlIllIlllI, final EnumFacing llllllllllllIllIIIIllIIlIlllIllI, final float llllllllllllIllIIIIllIIlIlllIlIl, final float llllllllllllIllIIIIllIIlIlllIlII, final float llllllllllllIllIIIIllIIlIlllIIll) {
        if (lIIlllIIIlIlllll(((boolean)llllllllllllIllIIIIllIIlIllIllll.getValue((IProperty<Boolean>)BlockFenceGate.OPEN)) ? 1 : 0)) {
            llllllllllllIllIIIIllIIlIllIllll = llllllllllllIllIIIIllIIlIllIllll.withProperty((IProperty<Comparable>)BlockFenceGate.OPEN, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[0] != 0));
            llllllllllllIllIIIIllIIlIlllIIIl.setBlockState(llllllllllllIllIIIIllIIlIlllIIII, llllllllllllIllIIIIllIIlIllIllll, BlockFenceGate.lllIIIIlIIIIIl[2]);
            "".length();
            "".length();
            if ("  ".length() <= 0) {
                return ((0x61 ^ 0x29) & ~(0x4D ^ 0x5)) != 0x0;
            }
        }
        else {
            final EnumFacing llllllllllllIllIIIIllIIlIlllIIlI = EnumFacing.fromAngle(llllllllllllIllIIIIllIIlIllIlllI.rotationYaw);
            if (lIIlllIIIlIlllIl(llllllllllllIllIIIIllIIlIllIllll.getValue((IProperty<Object>)BlockFenceGate.FACING), llllllllllllIllIIIIllIIlIlllIIlI.getOpposite())) {
                llllllllllllIllIIIIllIIlIllIllll = llllllllllllIllIIIIllIIlIllIllll.withProperty((IProperty<Comparable>)BlockFenceGate.FACING, llllllllllllIllIIIIllIIlIlllIIlI);
            }
            llllllllllllIllIIIIllIIlIllIllll = llllllllllllIllIIIIllIIlIllIllll.withProperty((IProperty<Comparable>)BlockFenceGate.OPEN, (boolean)(BlockFenceGate.lllIIIIlIIIIIl[1] != 0));
            llllllllllllIllIIIIllIIlIlllIIIl.setBlockState(llllllllllllIllIIIIllIIlIlllIIII, llllllllllllIllIIIIllIIlIllIllll, BlockFenceGate.lllIIIIlIIIIIl[2]);
            "".length();
        }
        int lllllllllllllIIIlIIlIlIllIllIlII;
        if (lIIlllIIIlIlllll(((boolean)llllllllllllIllIIIIllIIlIllIllll.getValue((IProperty<Boolean>)BlockFenceGate.OPEN)) ? 1 : 0)) {
            lllllllllllllIIIlIIlIlIllIllIlII = BlockFenceGate.lllIIIIlIIIIIl[3];
            "".length();
            if (-" ".length() == ((85 + 114 - 108 + 51 ^ 18 + 71 + 16 + 93) & (18 + 18 + 77 + 28 ^ 159 + 173 - 225 + 90 ^ -" ".length()))) {
                return ((0x44 ^ 0x36 ^ (0x43 ^ 0x7E)) & (183 + 32 - 119 + 101 ^ 26 + 84 - 99 + 127 ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIIlIIlIlIllIllIlII = BlockFenceGate.lllIIIIlIIIIIl[4];
        }
        llllllllllllIllIIIIllIIlIlllIIIl.playAuxSFXAtEntity(llllllllllllIllIIIIllIIlIllIlllI, lllllllllllllIIIlIIlIlIllIllIlII, llllllllllllIllIIIIllIIlIlllIIII, BlockFenceGate.lllIIIIlIIIIIl[0]);
        return BlockFenceGate.lllIIIIlIIIIIl[1] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockFenceGate.lllIIIIlIIIIIl[0] != 0;
    }
    
    private static boolean lIIlllIIIllIIIlI(final int llllllllllllIllIIIIllIIlIIlIIIIl, final int llllllllllllIllIIIIllIIlIIlIIIII) {
        return llllllllllllIllIIIIllIIlIIlIIIIl < llllllllllllIllIIIIllIIlIIlIIIII;
    }
    
    private static String lIIlllIIIlIlIlll(final String llllllllllllIllIIIIllIIlIlIIIIIl, final String llllllllllllIllIIIIllIIlIlIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIllIIlIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIllIIlIlIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIllIIlIlIIIIll.init(BlockFenceGate.lllIIIIlIIIIIl[2], llllllllllllIllIIIIllIIlIlIIIlII);
            return new String(llllllllllllIllIIIIllIIlIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIllIIlIlIIIIlI) {
            llllllllllllIllIIIIllIIlIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIllIIIIllIIllIllIIlI, final BlockPos llllllllllllIllIIIIllIIllIllIIIl) {
        int canPlaceBlock;
        if (lIIlllIIIlIlllll(llllllllllllIllIIIIllIIllIllIIlI.getBlockState(llllllllllllIllIIIIllIIllIllIIIl.down()).getBlock().getMaterial().isSolid() ? 1 : 0)) {
            canPlaceBlock = (super.canPlaceBlockAt(llllllllllllIllIIIIllIIllIllIIlI, llllllllllllIllIIIIllIIllIllIIIl) ? 1 : 0);
            "".length();
            if (null != null) {
                return ((0x14 ^ 0x12 ^ (0x96 ^ 0x86)) & (0x9B ^ 0xA6 ^ (0xC ^ 0x27) ^ -" ".length())) != 0x0;
            }
        }
        else {
            canPlaceBlock = BlockFenceGate.lllIIIIlIIIIIl[0];
        }
        return canPlaceBlock != 0;
    }
    
    private static boolean lIIlllIIIlIlllll(final int llllllllllllIllIIIIllIIlIIIlIllI) {
        return llllllllllllIllIIIIllIIlIIIlIllI != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockFenceGate.lllIIIIlIIIIIl[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFenceGate.lllIIIIlIIIIIl[0]] = BlockFenceGate.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFenceGate.lllIIIIlIIIIIl[1]] = BlockFenceGate.OPEN;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFenceGate.lllIIIIlIIIIIl[2]] = BlockFenceGate.POWERED;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFenceGate.lllIIIIlIIIIIl[7]] = BlockFenceGate.IN_WALL;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIIlllIIIlIlllIl(final Object llllllllllllIllIIIIllIIlIIIllIIl, final Object llllllllllllIllIIIIllIIlIIIllIII) {
        return llllllllllllIllIIIIllIIlIIIllIIl == llllllllllllIllIIIIllIIlIIIllIII;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIIIIllIIlIlIIllIl) {
        int llllllllllllIllIIIIllIIlIlIIlllI = BlockFenceGate.lllIIIIlIIIIIl[0];
        llllllllllllIllIIIIllIIlIlIIlllI |= llllllllllllIllIIIIllIIlIlIIllIl.getValue((IProperty<EnumFacing>)BlockFenceGate.FACING).getHorizontalIndex();
        if (lIIlllIIIlIlllll(((boolean)llllllllllllIllIIIIllIIlIlIIllIl.getValue((IProperty<Boolean>)BlockFenceGate.POWERED)) ? 1 : 0)) {
            llllllllllllIllIIIIllIIlIlIIlllI |= BlockFenceGate.lllIIIIlIIIIIl[6];
        }
        if (lIIlllIIIlIlllll(((boolean)llllllllllllIllIIIIllIIlIlIIllIl.getValue((IProperty<Boolean>)BlockFenceGate.OPEN)) ? 1 : 0)) {
            llllllllllllIllIIIIllIIlIlIIlllI |= BlockFenceGate.lllIIIIlIIIIIl[5];
        }
        return llllllllllllIllIIIIllIIlIlIIlllI;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIllIIIIllIIllIlIlIIl, final BlockPos llllllllllllIllIIIIllIIllIlIlIII, final IBlockState llllllllllllIllIIIIllIIllIlIIlll) {
        if (lIIlllIIIlIlllll(((boolean)llllllllllllIllIIIIllIIllIlIIlll.getValue((IProperty<Boolean>)BlockFenceGate.OPEN)) ? 1 : 0)) {
            return null;
        }
        final EnumFacing.Axis llllllllllllIllIIIIllIIllIlIIllI = llllllllllllIllIIIIllIIllIlIIlll.getValue((IProperty<EnumFacing>)BlockFenceGate.FACING).getAxis();
        AxisAlignedBB axisAlignedBB;
        if (lIIlllIIIlIlllIl(llllllllllllIllIIIIllIIllIlIIllI, EnumFacing.Axis.Z)) {
            axisAlignedBB = new AxisAlignedBB(llllllllllllIllIIIIllIIllIlIlIII.getX(), llllllllllllIllIIIIllIIllIlIlIII.getY(), llllllllllllIllIIIIllIIllIlIlIII.getZ() + 0.375f, llllllllllllIllIIIIllIIllIlIlIII.getX() + BlockFenceGate.lllIIIIlIIIIIl[1], llllllllllllIllIIIIllIIllIlIlIII.getY() + 1.5f, llllllllllllIllIIIIllIIllIlIlIII.getZ() + 0.625f);
            "".length();
            if (-(144 + 77 - 58 + 21 ^ 76 + 32 - 81 + 161) >= 0) {
                return null;
            }
        }
        else {
            axisAlignedBB = new AxisAlignedBB(llllllllllllIllIIIIllIIllIlIlIII.getX() + 0.375f, llllllllllllIllIIIIllIIllIlIlIII.getY(), llllllllllllIllIIIIllIIllIlIlIII.getZ(), llllllllllllIllIIIIllIIllIlIlIII.getX() + 0.625f, llllllllllllIllIIIIllIIllIlIlIII.getY() + 1.5f, llllllllllllIllIIIIllIIllIlIlIII.getZ() + BlockFenceGate.lllIIIIlIIIIIl[1]);
        }
        return axisAlignedBB;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIIIIllIIlIlIlIIll) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockFenceGate.FACING, EnumFacing.getHorizontal(llllllllllllIllIIIIllIIlIlIlIIll));
        final PropertyBool open = BlockFenceGate.OPEN;
        int b;
        if (lIIlllIIIlIlllll(llllllllllllIllIIIIllIIlIlIlIIll & BlockFenceGate.lllIIIIlIIIIIl[5])) {
            b = BlockFenceGate.lllIIIIlIIIIIl[1];
            "".length();
            if ((0xD4 ^ 0xAD ^ (0x20 ^ 0x5C)) == 0x0) {
                return null;
            }
        }
        else {
            b = BlockFenceGate.lllIIIIlIIIIIl[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)open, (boolean)(b != 0));
        final PropertyBool powered = BlockFenceGate.POWERED;
        int b2;
        if (lIIlllIIIlIlllll(llllllllllllIllIIIIllIIlIlIlIIll & BlockFenceGate.lllIIIIlIIIIIl[6])) {
            b2 = BlockFenceGate.lllIIIIlIIIIIl[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        else {
            b2 = BlockFenceGate.lllIIIIlIIIIIl[0];
        }
        return withProperty2.withProperty((IProperty<Comparable>)powered, (boolean)(b2 != 0));
    }
}
