// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.init.Blocks;
import net.minecraft.block.state.BlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.ItemLead;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.PropertyBool;

public class BlockFence extends Block
{
    public static final /* synthetic */ PropertyBool EAST;
    private static final /* synthetic */ String[] lIlllIlllIlllI;
    private static final /* synthetic */ int[] lIlllIlllIllll;
    public static final /* synthetic */ PropertyBool WEST;
    public static final /* synthetic */ PropertyBool SOUTH;
    public static final /* synthetic */ PropertyBool NORTH;
    
    @Override
    public boolean isPassable(final IBlockAccess llllllllllllIllllIllIlIlIIIlIlIl, final BlockPos llllllllllllIllllIllIlIlIIIlIlII) {
        return BlockFence.lIlllIlllIllll[0] != 0;
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess llllllllllllIllllIllIlIlIIIIIllI, final BlockPos llllllllllllIllllIllIlIlIIIIIlIl, final EnumFacing llllllllllllIllllIllIlIlIIIIIlII) {
        return BlockFence.lIlllIlllIllll[1] != 0;
    }
    
    public BlockFence(final Material llllllllllllIllllIllIlIlIlllIIII) {
        this(llllllllllllIllllIllIlIlIlllIIII, llllllllllllIllllIllIlIlIlllIIII.getMaterialMapColor());
    }
    
    private static void lIIIIIlllIIIllIl() {
        (lIlllIlllIlllI = new String[BlockFence.lIlllIlllIllll[4]])[BlockFence.lIlllIlllIllll[0]] = lIIIIIlllIIIlIlI("IQQQNzk=", "OkbCQ");
        BlockFence.lIlllIlllIlllI[BlockFence.lIlllIlllIllll[1]] = lIIIIIlllIIIlIll("ux8UNC+L9GY=", "HUNeR");
        BlockFence.lIlllIlllIlllI[BlockFence.lIlllIlllIllll[2]] = lIIIIIlllIIIlIll("vifrPxhOmL4=", "YLUmL");
        BlockFence.lIlllIlllIlllI[BlockFence.lIlllIlllIllll[3]] = lIIIIIlllIIIlIll("QCxjFkY6RsM=", "CJWlI");
    }
    
    private static boolean lIIIIIlllIIlIIIl(final Object llllllllllllIllllIllIlIIlIllIlII, final Object llllllllllllIllllIllIlIIlIllIIll) {
        return llllllllllllIllllIllIlIIlIllIlII == llllllllllllIllllIllIlIIlIllIIll;
    }
    
    @Override
    public void addCollisionBoxesToList(final World llllllllllllIllllIllIlIlIlIIIlll, final BlockPos llllllllllllIllllIllIlIlIlIlIlIl, final IBlockState llllllllllllIllllIllIlIlIlIIIlIl, final AxisAlignedBB llllllllllllIllllIllIlIlIlIIIlII, final List<AxisAlignedBB> llllllllllllIllllIllIlIlIlIIIIll, final Entity llllllllllllIllllIllIlIlIlIIIIlI) {
        final boolean llllllllllllIllllIllIlIlIlIlIIII = this.canConnectTo(llllllllllllIllllIllIlIlIlIIIlll, llllllllllllIllllIllIlIlIlIlIlIl.north());
        final boolean llllllllllllIllllIllIlIlIlIIllll = this.canConnectTo(llllllllllllIllllIllIlIlIlIIIlll, llllllllllllIllllIllIlIlIlIlIlIl.south());
        final boolean llllllllllllIllllIllIlIlIlIIlllI = this.canConnectTo(llllllllllllIllllIllIlIlIlIIIlll, llllllllllllIllllIllIlIlIlIlIlIl.west());
        final boolean llllllllllllIllllIllIlIlIlIIllIl = this.canConnectTo(llllllllllllIllllIllIlIlIlIIIlll, llllllllllllIllllIllIlIlIlIlIlIl.east());
        float llllllllllllIllllIllIlIlIlIIllII = 0.375f;
        float llllllllllllIllllIllIlIlIlIIlIll = 0.625f;
        float llllllllllllIllllIllIlIlIlIIlIlI = 0.375f;
        float llllllllllllIllllIllIlIlIlIIlIIl = 0.625f;
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIlIlIIII ? 1 : 0)) {
            llllllllllllIllllIllIlIlIlIIlIlI = 0.0f;
        }
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIlIIllll ? 1 : 0)) {
            llllllllllllIllllIllIlIlIlIIlIIl = 1.0f;
        }
        if (!lIIIIIlllIIlIIII(llllllllllllIllllIllIlIlIlIlIIII ? 1 : 0) || lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIlIIllll ? 1 : 0)) {
            this.setBlockBounds(llllllllllllIllllIllIlIlIlIIllII, 0.0f, llllllllllllIllllIllIlIlIlIIlIlI, llllllllllllIllllIllIlIlIlIIlIll, 1.5f, llllllllllllIllllIllIlIlIlIIlIIl);
            super.addCollisionBoxesToList(llllllllllllIllllIllIlIlIlIIIlll, llllllllllllIllllIllIlIlIlIlIlIl, llllllllllllIllllIllIlIlIlIIIlIl, llllllllllllIllllIllIlIlIlIIIlII, llllllllllllIllllIllIlIlIlIIIIll, llllllllllllIllllIllIlIlIlIIIIlI);
        }
        llllllllllllIllllIllIlIlIlIIlIlI = 0.375f;
        llllllllllllIllllIllIlIlIlIIlIIl = 0.625f;
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIlIIlllI ? 1 : 0)) {
            llllllllllllIllllIllIlIlIlIIllII = 0.0f;
        }
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIlIIllIl ? 1 : 0)) {
            llllllllllllIllllIllIlIlIlIIlIll = 1.0f;
        }
        if (!lIIIIIlllIIlIIII(llllllllllllIllllIllIlIlIlIIlllI ? 1 : 0) || !lIIIIIlllIIlIIII(llllllllllllIllllIllIlIlIlIIllIl ? 1 : 0) || (lIIIIIlllIIlIIII(llllllllllllIllllIllIlIlIlIlIIII ? 1 : 0) && lIIIIIlllIIlIIII(llllllllllllIllllIllIlIlIlIIllll ? 1 : 0))) {
            this.setBlockBounds(llllllllllllIllllIllIlIlIlIIllII, 0.0f, llllllllllllIllllIllIlIlIlIIlIlI, llllllllllllIllllIllIlIlIlIIlIll, 1.5f, llllllllllllIllllIllIlIlIlIIlIIl);
            super.addCollisionBoxesToList(llllllllllllIllllIllIlIlIlIIIlll, llllllllllllIllllIllIlIlIlIlIlIl, llllllllllllIllllIllIlIlIlIIIlIl, llllllllllllIllllIllIlIlIlIIIlII, llllllllllllIllllIllIlIlIlIIIIll, llllllllllllIllllIllIlIlIlIIIIlI);
        }
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIlIlIIII ? 1 : 0)) {
            llllllllllllIllllIllIlIlIlIIlIlI = 0.0f;
        }
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIlIIllll ? 1 : 0)) {
            llllllllllllIllllIllIlIlIlIIlIIl = 1.0f;
        }
        this.setBlockBounds(llllllllllllIllllIllIlIlIlIIllII, 0.0f, llllllllllllIllllIllIlIlIlIIlIlI, llllllllllllIllllIllIlIlIlIIlIll, 1.0f, llllllllllllIllllIllIlIlIlIIlIIl);
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIllllIllIlIIllllIlll, final BlockPos llllllllllllIllllIllIlIIlllllllI, final IBlockState llllllllllllIllllIllIlIIllllllIl, final EntityPlayer llllllllllllIllllIllIlIIllllllII, final EnumFacing llllllllllllIllllIllIlIIlllllIll, final float llllllllllllIllllIllIlIIlllllIlI, final float llllllllllllIllllIllIlIIlllllIIl, final float llllllllllllIllllIllIlIIlllllIII) {
        int attachToFence;
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIIllllIlll.isRemote ? 1 : 0)) {
            attachToFence = BlockFence.lIlllIlllIllll[1];
            "".length();
            if ((0x76 ^ 0x1F ^ (0xC5 ^ 0xA8)) <= ((0xDB ^ 0xAD ^ (0x88 ^ 0xB4)) & (0x95 ^ 0x8D ^ (0x18 ^ 0x4A) ^ -" ".length()))) {
                return ((0xA2 ^ 0xAF ^ (0x61 ^ 0x2E)) & (15 + 143 - 112 + 209 ^ 159 + 179 - 265 + 116 ^ -" ".length())) != 0x0;
            }
        }
        else {
            attachToFence = (ItemLead.attachToFence(llllllllllllIllllIllIlIIllllllII, llllllllllllIllllIllIlIIllllIlll, llllllllllllIllllIllIlIIlllllllI) ? 1 : 0);
        }
        return attachToFence != 0;
    }
    
    @Override
    public IBlockState getActualState(final IBlockState llllllllllllIllllIllIlIIlllIllIl, final IBlockAccess llllllllllllIllllIllIlIIlllIlIII, final BlockPos llllllllllllIllllIllIlIIlllIlIll) {
        return llllllllllllIllllIllIlIIlllIllIl.withProperty((IProperty<Comparable>)BlockFence.NORTH, this.canConnectTo(llllllllllllIllllIllIlIIlllIlIII, llllllllllllIllllIllIlIIlllIlIll.north())).withProperty((IProperty<Comparable>)BlockFence.EAST, this.canConnectTo(llllllllllllIllllIllIlIIlllIlIII, llllllllllllIllllIllIlIIlllIlIll.east())).withProperty((IProperty<Comparable>)BlockFence.SOUTH, this.canConnectTo(llllllllllllIllllIllIlIIlllIlIII, llllllllllllIllllIllIlIIlllIlIll.south())).withProperty((IProperty<Comparable>)BlockFence.WEST, this.canConnectTo(llllllllllllIllllIllIlIIlllIlIII, llllllllllllIllllIllIlIIlllIlIll.west()));
    }
    
    private static String lIIIIIlllIIIlIlI(String llllllllllllIllllIllIlIIllIlIlII, final String llllllllllllIllllIllIlIIllIllIII) {
        llllllllllllIllllIllIlIIllIlIlII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIllIlIIllIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllIlIIllIlIlll = new StringBuilder();
        final char[] llllllllllllIllllIllIlIIllIlIllI = llllllllllllIllllIllIlIIllIllIII.toCharArray();
        int llllllllllllIllllIllIlIIllIlIlIl = BlockFence.lIlllIlllIllll[0];
        final String llllllllllllIllllIllIlIIllIIllll = (Object)((String)llllllllllllIllllIllIlIIllIlIlII).toCharArray();
        final char llllllllllllIllllIllIlIIllIIlllI = (char)llllllllllllIllllIllIlIIllIIllll.length;
        char llllllllllllIllllIllIlIIllIIllIl = (char)BlockFence.lIlllIlllIllll[0];
        while (lIIIIIlllIIlIIll(llllllllllllIllllIllIlIIllIIllIl, llllllllllllIllllIllIlIIllIIlllI)) {
            final char llllllllllllIllllIllIlIIllIllIlI = llllllllllllIllllIllIlIIllIIllll[llllllllllllIllllIllIlIIllIIllIl];
            llllllllllllIllllIllIlIIllIlIlll.append((char)(llllllllllllIllllIllIlIIllIllIlI ^ llllllllllllIllllIllIlIIllIlIllI[llllllllllllIllllIllIlIIllIlIlIl % llllllllllllIllllIllIlIIllIlIllI.length]));
            "".length();
            ++llllllllllllIllllIllIlIIllIlIlIl;
            ++llllllllllllIllllIllIlIIllIIllIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllIlIIllIlIlll);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockFence.lIlllIlllIllll[0] != 0;
    }
    
    private static boolean lIIIIIlllIIlIIll(final int llllllllllllIllllIllIlIIlIllllII, final int llllllllllllIllllIllIlIIlIlllIll) {
        return llllllllllllIllllIllIlIIlIllllII < llllllllllllIllllIllIlIIlIlllIll;
    }
    
    private static String lIIIIIlllIIIlIll(final String llllllllllllIllllIllIlIIllIIIIlI, final String llllllllllllIllllIllIlIIllIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIllIlIIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIlIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIlIIllIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIlIIllIIIllI.init(BlockFence.lIlllIlllIllll[2], llllllllllllIllllIllIlIIllIIIlll);
            return new String(llllllllllllIllllIllIlIIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIlIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIlIIllIIIlIl) {
            llllllllllllIllllIllIlIIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlllIIIlllI() {
        (lIlllIlllIllll = new int[5])[0] = ((0x3C ^ 0x38) & ~(0x8E ^ 0x8A));
        BlockFence.lIlllIlllIllll[1] = " ".length();
        BlockFence.lIlllIlllIllll[2] = "  ".length();
        BlockFence.lIlllIlllIllll[3] = "   ".length();
        BlockFence.lIlllIlllIllll[4] = (71 + 147 - 42 + 4 ^ 150 + 151 - 284 + 159);
    }
    
    private static boolean lIIIIIlllIIlIIlI(final Object llllllllllllIllllIllIlIIlIlllIII, final Object llllllllllllIllllIllIlIIlIllIlll) {
        return llllllllllllIllllIllIlIIlIlllIII != llllllllllllIllllIllIlIIlIllIlll;
    }
    
    private static boolean lIIIIIlllIIlIIII(final int llllllllllllIllllIllIlIIlIlIllll) {
        return llllllllllllIllllIllIlIIlIlIllll == 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIllllIllIlIlIIlIIIlI, final BlockPos llllllllllllIllllIllIlIlIIlIIIIl) {
        final boolean llllllllllllIllllIllIlIlIIlIlIll = this.canConnectTo(llllllllllllIllllIllIlIlIIlIIIlI, llllllllllllIllllIllIlIlIIlIIIIl.north());
        final boolean llllllllllllIllllIllIlIlIIlIlIlI = this.canConnectTo(llllllllllllIllllIllIlIlIIlIIIlI, llllllllllllIllllIllIlIlIIlIIIIl.south());
        final boolean llllllllllllIllllIllIlIlIIlIlIIl = this.canConnectTo(llllllllllllIllllIllIlIlIIlIIIlI, llllllllllllIllllIllIlIlIIlIIIIl.west());
        final boolean llllllllllllIllllIllIlIlIIlIlIII = this.canConnectTo(llllllllllllIllllIllIlIlIIlIIIlI, llllllllllllIllllIllIlIlIIlIIIIl.east());
        float llllllllllllIllllIllIlIlIIlIIlll = 0.375f;
        float llllllllllllIllllIllIlIlIIlIIllI = 0.625f;
        float llllllllllllIllllIllIlIlIIlIIlIl = 0.375f;
        float llllllllllllIllllIllIlIlIIlIIlII = 0.625f;
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIIlIlIll ? 1 : 0)) {
            llllllllllllIllllIllIlIlIIlIIlIl = 0.0f;
        }
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIIlIlIlI ? 1 : 0)) {
            llllllllllllIllllIllIlIlIIlIIlII = 1.0f;
        }
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIIlIlIIl ? 1 : 0)) {
            llllllllllllIllllIllIlIlIIlIIlll = 0.0f;
        }
        if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIIlIlIII ? 1 : 0)) {
            llllllllllllIllllIllIlIlIIlIIllI = 1.0f;
        }
        this.setBlockBounds(llllllllllllIllllIllIlIlIIlIIlll, 0.0f, llllllllllllIllllIllIlIlIIlIIlIl, llllllllllllIllllIllIlIlIIlIIllI, 1.0f, llllllllllllIllllIllIlIlIIlIIlII);
    }
    
    public BlockFence(final Material llllllllllllIllllIllIlIlIllIlIII, final MapColor llllllllllllIllllIllIlIlIllIIlll) {
        super(llllllllllllIllllIllIlIlIllIlIII, llllllllllllIllllIllIlIlIllIIlll);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockFence.NORTH, (boolean)(BlockFence.lIlllIlllIllll[0] != 0)).withProperty((IProperty<Comparable>)BlockFence.EAST, (boolean)(BlockFence.lIlllIlllIllll[0] != 0)).withProperty((IProperty<Comparable>)BlockFence.SOUTH, (boolean)(BlockFence.lIlllIlllIllll[0] != 0)).withProperty((IProperty<Comparable>)BlockFence.WEST, (boolean)(BlockFence.lIlllIlllIllll[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockFence.lIlllIlllIllll[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFence.lIlllIlllIllll[0]] = BlockFence.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFence.lIlllIlllIllll[1]] = BlockFence.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFence.lIlllIlllIllll[2]] = BlockFence.WEST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFence.lIlllIlllIllll[3]] = BlockFence.SOUTH;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllllIllIlIIllllIIll) {
        return BlockFence.lIlllIlllIllll[0];
    }
    
    public boolean canConnectTo(final IBlockAccess llllllllllllIllllIllIlIlIIIIlllI, final BlockPos llllllllllllIllllIllIlIlIIIIllIl) {
        final Block llllllllllllIllllIllIlIlIIIIllII = llllllllllllIllllIllIlIlIIIIlllI.getBlockState(llllllllllllIllllIllIlIlIIIIllIl).getBlock();
        int n;
        if (lIIIIIlllIIlIIIl(llllllllllllIllllIllIlIlIIIIllII, Blocks.barrier)) {
            n = BlockFence.lIlllIlllIllll[0];
            "".length();
            if ("   ".length() == 0) {
                return ((0x96 ^ 0xB3) & ~(0x36 ^ 0x13)) != 0x0;
            }
        }
        else if ((!lIIIIIlllIIIllll((llllllllllllIllllIllIlIlIIIIllII instanceof BlockFence) ? 1 : 0) || lIIIIIlllIIlIIlI(llllllllllllIllllIllIlIlIIIIllII.blockMaterial, this.blockMaterial)) && lIIIIIlllIIlIIII((llllllllllllIllllIllIlIlIIIIllII instanceof BlockFenceGate) ? 1 : 0)) {
            if (lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIIIIllII.blockMaterial.isOpaque() ? 1 : 0) && lIIIIIlllIIIllll(llllllllllllIllllIllIlIlIIIIllII.isFullCube() ? 1 : 0)) {
                if (lIIIIIlllIIlIIlI(llllllllllllIllllIllIlIlIIIIllII.blockMaterial, Material.gourd)) {
                    n = BlockFence.lIlllIlllIllll[1];
                    "".length();
                    if (((0xB6 ^ 0xA4) & ~(0x92 ^ 0x80)) != 0x0) {
                        return ((0x70 ^ 0x58) & ~(0xAD ^ 0x85)) != 0x0;
                    }
                }
                else {
                    n = BlockFence.lIlllIlllIllll[0];
                    "".length();
                    if ((0x3B ^ 0x3F) == 0x0) {
                        return ((0xB3 ^ 0x8F) & ~(0x6E ^ 0x52)) != 0x0;
                    }
                }
            }
            else {
                n = BlockFence.lIlllIlllIllll[0];
                "".length();
                if (null != null) {
                    return ((0x87 ^ 0xB9) & ~(0xF9 ^ 0xC7)) != 0x0;
                }
            }
        }
        else {
            n = BlockFence.lIlllIlllIllll[1];
        }
        return n != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockFence.lIlllIlllIllll[0] != 0;
    }
    
    private static boolean lIIIIIlllIIIllll(final int llllllllllllIllllIllIlIIlIllIIIl) {
        return llllllllllllIllllIllIlIIlIllIIIl != 0;
    }
    
    static {
        lIIIIIlllIIIlllI();
        lIIIIIlllIIIllIl();
        NORTH = PropertyBool.create(BlockFence.lIlllIlllIlllI[BlockFence.lIlllIlllIllll[0]]);
        EAST = PropertyBool.create(BlockFence.lIlllIlllIlllI[BlockFence.lIlllIlllIllll[1]]);
        SOUTH = PropertyBool.create(BlockFence.lIlllIlllIlllI[BlockFence.lIlllIlllIllll[2]]);
        WEST = PropertyBool.create(BlockFence.lIlllIlllIlllI[BlockFence.lIlllIlllIllll[3]]);
    }
}
