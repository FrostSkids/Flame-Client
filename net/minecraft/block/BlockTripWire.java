// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.item.Item;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.BlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import java.util.Random;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.PropertyBool;

public class BlockTripWire extends Block
{
    public static final /* synthetic */ PropertyBool NORTH;
    public static final /* synthetic */ PropertyBool POWERED;
    public static final /* synthetic */ PropertyBool DISARMED;
    public static final /* synthetic */ PropertyBool ATTACHED;
    public static final /* synthetic */ PropertyBool EAST;
    private static final /* synthetic */ int[] lIlllllllIIlIl;
    public static final /* synthetic */ PropertyBool SOUTH;
    public static final /* synthetic */ PropertyBool WEST;
    private static final /* synthetic */ String[] lIlllllIIllIII;
    public static final /* synthetic */ PropertyBool SUSPENDED;
    
    private static String lIIIIlIlIIllllIl(final String llllllllllllIllllIIIlllIlIllllIl, final String llllllllllllIllllIIIlllIlIllllII) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlllIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlllIlIllllII.getBytes(StandardCharsets.UTF_8)), BlockTripWire.lIlllllllIIlIl[9]), "DES");
            final Cipher llllllllllllIllllIIIlllIllIIIIIl = Cipher.getInstance("DES");
            llllllllllllIllllIIIlllIllIIIIIl.init(BlockTripWire.lIlllllllIIlIl[2], llllllllllllIllllIIIlllIllIIIIlI);
            return new String(llllllllllllIllllIIIlllIllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlllIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlllIllIIIIII) {
            llllllllllllIllllIIIlllIllIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIIIIlllIl(final int llllllllllllIllllIIIlllIlIlIllll, final int llllllllllllIllllIIIlllIlIlIlllI) {
        return llllllllllllIllllIIIlllIlIlIllll < llllllllllllIllllIIIlllIlIlIlllI;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIllllIIIllllllIIIIIl, final BlockPos llllllllllllIllllIIIllllllIIIIII, final IBlockState llllllllllllIllllIIIlllllIllllll) {
        return null;
    }
    
    private static String lIIIIlIlIIllllII(String llllllllllllIllllIIIlllIllIIllll, final String llllllllllllIllllIIIlllIllIlIIll) {
        llllllllllllIllllIIIlllIllIIllll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIlllIllIIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIlllIllIlIIlI = new StringBuilder();
        final char[] llllllllllllIllllIIIlllIllIlIIIl = llllllllllllIllllIIIlllIllIlIIll.toCharArray();
        int llllllllllllIllllIIIlllIllIlIIII = BlockTripWire.lIlllllllIIlIl[0];
        final double llllllllllllIllllIIIlllIllIIlIlI = (Object)((String)llllllllllllIllllIIIlllIllIIllll).toCharArray();
        final Exception llllllllllllIllllIIIlllIllIIlIIl = (Exception)llllllllllllIllllIIIlllIllIIlIlI.length;
        boolean llllllllllllIllllIIIlllIllIIlIII = BlockTripWire.lIlllllllIIlIl[0] != 0;
        while (lIIIIllIIIIlllIl(llllllllllllIllllIIIlllIllIIlIII ? 1 : 0, (int)llllllllllllIllllIIIlllIllIIlIIl)) {
            final char llllllllllllIllllIIIlllIllIlIlIl = llllllllllllIllllIIIlllIllIIlIlI[llllllllllllIllllIIIlllIllIIlIII];
            llllllllllllIllllIIIlllIllIlIIlI.append((char)(llllllllllllIllllIIIlllIllIlIlIl ^ llllllllllllIllllIIIlllIllIlIIIl[llllllllllllIllllIIIlllIllIlIIII % llllllllllllIllllIIIlllIllIlIIIl.length]));
            "".length();
            ++llllllllllllIllllIIIlllIllIlIIII;
            ++llllllllllllIllllIIIlllIllIIlIII;
            "".length();
            if ((0x93 ^ 0x9B ^ (0x46 ^ 0x4A)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIlllIllIlIIlI);
    }
    
    private void updateState(final World llllllllllllIllllIIIllllIIIlllll, final BlockPos llllllllllllIllllIIIllllIIIllllI) {
        IBlockState llllllllllllIllllIIIllllIIlIIlIl = llllllllllllIllllIIIllllIIIlllll.getBlockState(llllllllllllIllllIIIllllIIIllllI);
        final boolean llllllllllllIllllIIIllllIIlIIlII = llllllllllllIllllIIIllllIIlIIlIl.getValue((IProperty<Boolean>)BlockTripWire.POWERED);
        boolean llllllllllllIllllIIIllllIIlIIIll = BlockTripWire.lIlllllllIIlIl[0] != 0;
        final List<? extends Entity> llllllllllllIllllIIIllllIIlIIIlI = llllllllllllIllllIIIllllIIIlllll.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(llllllllllllIllllIIIllllIIIllllI.getX() + this.minX, llllllllllllIllllIIIllllIIIllllI.getY() + this.minY, llllllllllllIllllIIIllllIIIllllI.getZ() + this.minZ, llllllllllllIllllIIIllllIIIllllI.getX() + this.maxX, llllllllllllIllllIIIllllIIIllllI.getY() + this.maxY, llllllllllllIllllIIIllllIIIllllI.getZ() + this.maxZ));
        if (lIIIIllIIIIlIllI(llllllllllllIllllIIIllllIIlIIIlI.isEmpty() ? 1 : 0)) {
            final Exception llllllllllllIllllIIIllllIIIllIII = (Exception)llllllllllllIllllIIIllllIIlIIIlI.iterator();
            "".length();
            if (((0x1E ^ 0x22 ^ (0x4B ^ 0x32)) & (0x21 ^ 0x2 ^ (0x13 ^ 0x75) ^ -" ".length())) > (0x56 ^ 0x13 ^ (0x4E ^ 0xF))) {
                return;
            }
            while (!lIIIIllIIIIlIllI(((Iterator)llllllllllllIllllIIIllllIIIllIII).hasNext() ? 1 : 0)) {
                final Entity llllllllllllIllllIIIllllIIlIIIIl = ((Iterator<Entity>)llllllllllllIllllIIIllllIIIllIII).next();
                if (lIIIIllIIIIlIllI(llllllllllllIllllIIIllllIIlIIIIl.doesEntityNotTriggerPressurePlate() ? 1 : 0)) {
                    llllllllllllIllllIIIllllIIlIIIll = (BlockTripWire.lIlllllllIIlIl[1] != 0);
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                    break;
                }
            }
        }
        if (lIIIIllIIIIlIlIl(llllllllllllIllllIIIllllIIlIIIll ? 1 : 0, llllllllllllIllllIIIllllIIlIIlII ? 1 : 0)) {
            llllllllllllIllllIIIllllIIlIIlIl = llllllllllllIllllIIIllllIIlIIlIl.withProperty((IProperty<Comparable>)BlockTripWire.POWERED, llllllllllllIllllIIIllllIIlIIIll);
            llllllllllllIllllIIIllllIIIlllll.setBlockState(llllllllllllIllllIIIllllIIIllllI, llllllllllllIllllIIIllllIIlIIlIl, BlockTripWire.lIlllllllIIlIl[3]);
            "".length();
            this.notifyHook(llllllllllllIllllIIIllllIIIlllll, llllllllllllIllllIIIllllIIIllllI, llllllllllllIllllIIIllllIIlIIlIl);
        }
        if (lIIIIllIIIIlIlII(llllllllllllIllllIIIllllIIlIIIll ? 1 : 0)) {
            llllllllllllIllllIIIllllIIIlllll.scheduleUpdate(llllllllllllIllllIIIllllIIIllllI, this, this.tickRate(llllllllllllIllllIIIllllIIIlllll));
        }
    }
    
    private static String lIIIIlIlIIlllllI(final String llllllllllllIllllIIIlllIlllIIlII, final String llllllllllllIllllIIIlllIlllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlllIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlllIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIlllIlllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIlllIlllIIllI.init(BlockTripWire.lIlllllllIIlIl[2], llllllllllllIllllIIIlllIlllIIlll);
            return new String(llllllllllllIllllIIIlllIlllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlllIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlllIlllIIlIl) {
            llllllllllllIllllIIIlllIlllIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isFullCube() {
        return BlockTripWire.lIlllllllIIlIl[0] != 0;
    }
    
    @Override
    public void breakBlock(final World llllllllllllIllllIIIllllIllllllI, final BlockPos llllllllllllIllllIIIllllIllllIIl, final IBlockState llllllllllllIllllIIIllllIllllIII) {
        this.notifyHook(llllllllllllIllllIIIllllIllllllI, llllllllllllIllllIIIllllIllllIIl, llllllllllllIllllIIIllllIllllIII.withProperty((IProperty<Comparable>)BlockTripWire.POWERED, (boolean)(BlockTripWire.lIlllllllIIlIl[1] != 0)));
    }
    
    private static boolean lIIIIllIIIIlIllI(final int llllllllllllIllllIIIlllIlIlIIIII) {
        return llllllllllllIllllIIIlllIlIlIIIII == 0;
    }
    
    @Override
    public void randomTick(final World llllllllllllIllllIIIllllIlIIIIII, final BlockPos llllllllllllIllllIIIllllIIllllll, final IBlockState llllllllllllIllllIIIllllIIlllllI, final Random llllllllllllIllllIIIllllIIllllIl) {
    }
    
    private static void lIIIIlIlIIllllll() {
        (lIlllllIIllIII = new String[BlockTripWire.lIlllllllIIlIl[9]])[BlockTripWire.lIlllllllIIlIl[0]] = lIIIIlIlIIllllII("OQImCT0sCQ==", "ImQlO");
        BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[1]] = lIIIIlIlIIllllIl("Y43VZ/YSSJeMXoUGsH0tcA==", "CSTNf");
        BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[2]] = lIIIIlIlIIllllIl("JSeczBKeJVeLo5CMczAJlg==", "SlQtD");
        BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[3]] = lIIIIlIlIIlllllI("VZGihrOSqVjeA2f8pBKdBQ==", "iNwGD");
        BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[4]] = lIIIIlIlIIllllIl("N4ZgM0RHBKU=", "SDKEa");
        BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[5]] = lIIIIlIlIIllllIl("D84Om52KjCI=", "jOgvr");
        BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[6]] = lIIIIlIlIIllllIl("3xSed2QO8TA=", "dJdsl");
        BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[7]] = lIIIIlIlIIlllllI("Mj2lZpyJZvk=", "qIdgq");
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIllllIIIlllllIIIlIlI, final BlockPos llllllllllllIllllIIIlllllIIIIlIl, IBlockState llllllllllllIllllIIIlllllIIIIlII) {
        final IBlockState blockState = llllllllllllIllllIIIlllllIIIIlII;
        final PropertyBool suspended = BlockTripWire.SUSPENDED;
        int b;
        if (lIIIIllIIIIlIlII(World.doesBlockHaveSolidTopSurface(llllllllllllIllllIIIlllllIIIlIlI, llllllllllllIllllIIIlllllIIIIlIl.down()) ? 1 : 0)) {
            b = BlockTripWire.lIlllllllIIlIl[0];
            "".length();
            if (((0x78 ^ 0x36) & ~(0x88 ^ 0xC6)) >= "  ".length()) {
                return;
            }
        }
        else {
            b = BlockTripWire.lIlllllllIIlIl[1];
        }
        llllllllllllIllllIIIlllllIIIIlII = blockState.withProperty((IProperty<Comparable>)suspended, (boolean)(b != 0));
        llllllllllllIllllIIIlllllIIIlIlI.setBlockState(llllllllllllIllllIIIlllllIIIIlIl, llllllllllllIllllIIIlllllIIIIlII, BlockTripWire.lIlllllllIIlIl[3]);
        "".length();
        this.notifyHook(llllllllllllIllllIIIlllllIIIlIlI, llllllllllllIllllIIIlllllIIIIlIl, llllllllllllIllllIIIlllllIIIIlII);
    }
    
    private static boolean lIIIIllIIIIlIlll(final Object llllllllllllIllllIIIlllIlIlIlIII) {
        return llllllllllllIllllIIIlllIlIlIlIII != null;
    }
    
    public BlockTripWire() {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockTripWire.POWERED, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWire.SUSPENDED, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWire.ATTACHED, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWire.DISARMED, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWire.NORTH, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWire.EAST, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWire.SOUTH, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWire.WEST, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0)));
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.setTickRandomly((boolean)(BlockTripWire.lIlllllllIIlIl[1] != 0));
        "".length();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllllIIIlllIllllIllI) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool powered = BlockTripWire.POWERED;
        int b;
        if (lIIIIllIIIIlllII(llllllllllllIllllIIIlllIllllIllI & BlockTripWire.lIlllllllIIlIl[1])) {
            b = BlockTripWire.lIlllllllIIlIl[1];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            b = BlockTripWire.lIlllllllIIlIl[0];
        }
        final IBlockState withProperty = defaultState.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
        final PropertyBool suspended = BlockTripWire.SUSPENDED;
        int b2;
        if (lIIIIllIIIIlllII(llllllllllllIllllIIIlllIllllIllI & BlockTripWire.lIlllllllIIlIl[2])) {
            b2 = BlockTripWire.lIlllllllIIlIl[1];
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        else {
            b2 = BlockTripWire.lIlllllllIIlIl[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)suspended, (boolean)(b2 != 0));
        final PropertyBool attached = BlockTripWire.ATTACHED;
        int b3;
        if (lIIIIllIIIIlllII(llllllllllllIllllIIIlllIllllIllI & BlockTripWire.lIlllllllIIlIl[4])) {
            b3 = BlockTripWire.lIlllllllIIlIl[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            b3 = BlockTripWire.lIlllllllIIlIl[0];
        }
        final IBlockState withProperty3 = withProperty2.withProperty((IProperty<Comparable>)attached, (boolean)(b3 != 0));
        final PropertyBool disarmed = BlockTripWire.DISARMED;
        int b4;
        if (lIIIIllIIIIlllII(llllllllllllIllllIIIlllIllllIllI & BlockTripWire.lIlllllllIIlIl[9])) {
            b4 = BlockTripWire.lIlllllllIIlIl[1];
            "".length();
            if (" ".length() == ((0x1B ^ 0x46 ^ (0x71 ^ 0x14)) & (131 + 145 - 218 + 129 ^ 102 + 6 - 106 + 129 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            b4 = BlockTripWire.lIlllllllIIlIl[0];
        }
        return withProperty3.withProperty((IProperty<Comparable>)disarmed, (boolean)(b4 != 0));
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIllllIIIlllllIIlIlII, final BlockPos llllllllllllIllllIIIlllllIIlIIll) {
        final IBlockState llllllllllllIllllIIIlllllIIllIII = llllllllllllIllllIIIlllllIIlIlII.getBlockState(llllllllllllIllllIIIlllllIIlIIll);
        final boolean llllllllllllIllllIIIlllllIIlIlll = llllllllllllIllllIIIlllllIIllIII.getValue((IProperty<Boolean>)BlockTripWire.ATTACHED);
        final boolean llllllllllllIllllIIIlllllIIlIllI = llllllllllllIllllIIIlllllIIllIII.getValue((IProperty<Boolean>)BlockTripWire.SUSPENDED);
        if (lIIIIllIIIIlIllI(llllllllllllIllllIIIlllllIIlIllI ? 1 : 0)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
            "".length();
            if ((0xA6 ^ 0xA2) == 0x0) {
                return;
            }
        }
        else if (lIIIIllIIIIlIllI(llllllllllllIllllIIIlllllIIlIlll ? 1 : 0)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            "".length();
            if ((0x0 ^ 0x4) == 0x0) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
        }
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World llllllllllllIllllIIIllllIlIIlIIl, final BlockPos llllllllllllIllllIIIllllIlIIlIII, final IBlockState llllllllllllIllllIIIllllIlIIIlll, final Entity llllllllllllIllllIIIllllIlIIIllI) {
        if (lIIIIllIIIIlIllI(llllllllllllIllllIIIllllIlIIlIIl.isRemote ? 1 : 0) && lIIIIllIIIIlIllI(((boolean)llllllllllllIllllIIIllllIlIIIlll.getValue((IProperty<Boolean>)BlockTripWire.POWERED)) ? 1 : 0)) {
            this.updateState(llllllllllllIllllIIIllllIlIIlIIl, llllllllllllIllllIIIllllIlIIlIII);
        }
    }
    
    @Override
    public void updateTick(final World llllllllllllIllllIIIllllIIlllIII, final BlockPos llllllllllllIllllIIIllllIIllIIlI, final IBlockState llllllllllllIllllIIIllllIIllIllI, final Random llllllllllllIllllIIIllllIIllIlIl) {
        if (lIIIIllIIIIlIllI(llllllllllllIllllIIIllllIIlllIII.isRemote ? 1 : 0) && lIIIIllIIIIlIlII(((boolean)llllllllllllIllllIIIllllIIlllIII.getBlockState(llllllllllllIllllIIIllllIIllIIlI).getValue((IProperty<Boolean>)BlockTripWire.POWERED)) ? 1 : 0)) {
            this.updateState(llllllllllllIllllIIIllllIIlllIII, llllllllllllIllllIIIllllIIllIIlI);
        }
    }
    
    private static void lIIIIllIIIIlIIll() {
        (lIlllllllIIlIl = new int[10])[0] = ((0x3E ^ 0x1B) & ~(0x6D ^ 0x48));
        BlockTripWire.lIlllllllIIlIl[1] = " ".length();
        BlockTripWire.lIlllllllIIlIl[2] = "  ".length();
        BlockTripWire.lIlllllllIIlIl[3] = "   ".length();
        BlockTripWire.lIlllllllIIlIl[4] = ("   ".length() ^ (0xC0 ^ 0xC7));
        BlockTripWire.lIlllllllIIlIl[5] = (0x23 ^ 0x26);
        BlockTripWire.lIlllllllIIlIl[6] = (0x79 ^ 0x7D ^ "  ".length());
        BlockTripWire.lIlllllllIIlIl[7] = (0x12 ^ 0x1C ^ (0xCE ^ 0xC7));
        BlockTripWire.lIlllllllIIlIl[8] = (0x6E ^ 0x1C ^ (0x9A ^ 0xC2));
        BlockTripWire.lIlllllllIIlIl[9] = (0x6A ^ 0x62);
    }
    
    static {
        lIIIIllIIIIlIIll();
        lIIIIlIlIIllllll();
        POWERED = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[0]]);
        SUSPENDED = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[1]]);
        ATTACHED = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[2]]);
        DISARMED = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[3]]);
        NORTH = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[4]]);
        EAST = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[5]]);
        SOUTH = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[6]]);
        WEST = PropertyBool.create(BlockTripWire.lIlllllIIllIII[BlockTripWire.lIlllllllIIlIl[7]]);
    }
    
    private static boolean lIIIIllIIIIllIIl(final Object llllllllllllIllllIIIlllIlIlIlIll, final Object llllllllllllIllllIIIlllIlIlIlIlI) {
        return llllllllllllIllllIIIlllIlIlIlIll != llllllllllllIllllIIIlllIlIlIlIlI;
    }
    
    private static boolean lIIIIllIIIIllIll(final int llllllllllllIllllIIIlllIlIllIlll, final int llllllllllllIllllIIIlllIlIllIllI) {
        return llllllllllllIllllIIIlllIlIllIlll == llllllllllllIllllIIIlllIlIllIllI;
    }
    
    private static boolean lIIIIllIIIIllIII(final Object llllllllllllIllllIIIlllIlIlIIlIl, final Object llllllllllllIllllIIIlllIlIlIIlII) {
        return llllllllllllIllllIIIlllIlIlIIlIl == llllllllllllIllllIIIlllIlIlIIlII;
    }
    
    public static boolean isConnectedTo(final IBlockAccess llllllllllllIllllIIIllllIIIIIlII, final BlockPos llllllllllllIllllIIIllllIIIIllIl, final IBlockState llllllllllllIllllIIIllllIIIIIIlI, final EnumFacing llllllllllllIllllIIIllllIIIIlIll) {
        final BlockPos llllllllllllIllllIIIllllIIIIlIlI = llllllllllllIllllIIIllllIIIIllIl.offset(llllllllllllIllllIIIllllIIIIlIll);
        final IBlockState llllllllllllIllllIIIllllIIIIlIIl = llllllllllllIllllIIIllllIIIIIlII.getBlockState(llllllllllllIllllIIIllllIIIIlIlI);
        final Block llllllllllllIllllIIIllllIIIIlIII = llllllllllllIllllIIIllllIIIIlIIl.getBlock();
        if (lIIIIllIIIIllIII(llllllllllllIllllIIIllllIIIIlIII, Blocks.tripwire_hook)) {
            final EnumFacing llllllllllllIllllIIIllllIIIIIlll = llllllllllllIllllIIIllllIIIIlIll.getOpposite();
            if (lIIIIllIIIIllIII(llllllllllllIllllIIIllllIIIIlIIl.getValue((IProperty<Object>)BlockTripWireHook.FACING), llllllllllllIllllIIIllllIIIIIlll)) {
                return BlockTripWire.lIlllllllIIlIl[1] != 0;
            }
            return BlockTripWire.lIlllllllIIlIl[0] != 0;
        }
        else {
            if (!lIIIIllIIIIllIII(llllllllllllIllllIIIllllIIIIlIII, Blocks.tripwire)) {
                return BlockTripWire.lIlllllllIIlIl[0] != 0;
            }
            final boolean llllllllllllIllllIIIllllIIIIIllI = llllllllllllIllllIIIllllIIIIIIlI.getValue((IProperty<Boolean>)BlockTripWire.SUSPENDED);
            final boolean llllllllllllIllllIIIllllIIIIIlIl = llllllllllllIllllIIIllllIIIIlIIl.getValue((IProperty<Boolean>)BlockTripWire.SUSPENDED);
            if (lIIIIllIIIIllIll(llllllllllllIllllIIIllllIIIIIllI ? 1 : 0, llllllllllllIllllIIIllllIIIIIlIl ? 1 : 0)) {
                return BlockTripWire.lIlllllllIIlIl[1] != 0;
            }
            return BlockTripWire.lIlllllllIIlIl[0] != 0;
        }
    }
    
    private static boolean lIIIIllIIIIlllII(final int llllllllllllIllllIIIlllIlIIllllI) {
        return llllllllllllIllllIIIlllIlIIllllI > 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllllIIIlllllIlIllIl, final BlockPos llllllllllllIllllIIIlllllIlIIlIl, final IBlockState llllllllllllIllllIIIlllllIlIlIll, final Block llllllllllllIllllIIIlllllIlIlIlI) {
        final boolean llllllllllllIllllIIIlllllIlIlIIl = llllllllllllIllllIIIlllllIlIlIll.getValue((IProperty<Boolean>)BlockTripWire.SUSPENDED);
        int n;
        if (lIIIIllIIIIlIlII(World.doesBlockHaveSolidTopSurface(llllllllllllIllllIIIlllllIlIllIl, llllllllllllIllllIIIlllllIlIIlIl.down()) ? 1 : 0)) {
            n = BlockTripWire.lIlllllllIIlIl[0];
            "".length();
            if (((0x54 ^ 0x15 ^ (0x30 ^ 0x2A)) & (0xD9 ^ 0x95 ^ (0x6E ^ 0x79) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            n = BlockTripWire.lIlllllllIIlIl[1];
        }
        final boolean llllllllllllIllllIIIlllllIlIlIII = n != 0;
        if (lIIIIllIIIIlIlIl(llllllllllllIllllIIIlllllIlIlIIl ? 1 : 0, llllllllllllIllllIIIlllllIlIlIII ? 1 : 0)) {
            this.dropBlockAsItem(llllllllllllIllllIIIlllllIlIllIl, llllllllllllIllllIIIlllllIlIIlIl, llllllllllllIllllIIIlllllIlIlIll, BlockTripWire.lIlllllllIIlIl[0]);
            llllllllllllIllllIIIlllllIlIllIl.setBlockToAir(llllllllllllIllllIIIlllllIlIIlIl);
            "".length();
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockTripWire.lIlllllllIIlIl[9]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[0]] = BlockTripWire.POWERED;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[1]] = BlockTripWire.SUSPENDED;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[2]] = BlockTripWire.ATTACHED;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[3]] = BlockTripWire.DISARMED;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[4]] = BlockTripWire.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[5]] = BlockTripWire.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[6]] = BlockTripWire.WEST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWire.lIlllllllIIlIl[7]] = BlockTripWire.SOUTH;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void onBlockHarvested(final World llllllllllllIllllIIIllllIlllIIlI, final BlockPos llllllllllllIllllIIIllllIlllIIIl, final IBlockState llllllllllllIllllIIIllllIllIllII, final EntityPlayer llllllllllllIllllIIIllllIllIllll) {
        if (lIIIIllIIIIlIllI(llllllllllllIllllIIIllllIlllIIlI.isRemote ? 1 : 0) && lIIIIllIIIIlIlll(llllllllllllIllllIIIllllIllIllll.getCurrentEquippedItem()) && lIIIIllIIIIllIII(llllllllllllIllllIIIllllIllIllll.getCurrentEquippedItem().getItem(), Items.shears)) {
            llllllllllllIllllIIIllllIlllIIlI.setBlockState(llllllllllllIllllIIIllllIlllIIIl, llllllllllllIllllIIIllllIllIllII.withProperty((IProperty<Comparable>)BlockTripWire.DISARMED, (boolean)(BlockTripWire.lIlllllllIIlIl[1] != 0)), BlockTripWire.lIlllllllIIlIl[4]);
            "".length();
        }
    }
    
    private static boolean lIIIIllIIIIlIlIl(final int llllllllllllIllllIIIlllIlIIllIll, final int llllllllllllIllllIIIlllIlIIllIlI) {
        return llllllllllllIllllIIIlllIlIIllIll != llllllllllllIllllIIIlllIlIIllIlI;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockTripWire.lIlllllllIIlIl[0] != 0;
    }
    
    @Override
    public IBlockState getActualState(final IBlockState llllllllllllIllllIIIllllllIIIlIl, final IBlockAccess llllllllllllIllllIIIllllllIIIlII, final BlockPos llllllllllllIllllIIIllllllIIIIll) {
        return llllllllllllIllllIIIllllllIIIlIl.withProperty((IProperty<Comparable>)BlockTripWire.NORTH, isConnectedTo(llllllllllllIllllIIIllllllIIIlII, llllllllllllIllllIIIllllllIIIIll, llllllllllllIllllIIIllllllIIIlIl, EnumFacing.NORTH)).withProperty((IProperty<Comparable>)BlockTripWire.EAST, isConnectedTo(llllllllllllIllllIIIllllllIIIlII, llllllllllllIllllIIIllllllIIIIll, llllllllllllIllllIIIllllllIIIlIl, EnumFacing.EAST)).withProperty((IProperty<Comparable>)BlockTripWire.SOUTH, isConnectedTo(llllllllllllIllllIIIllllllIIIlII, llllllllllllIllllIIIllllllIIIIll, llllllllllllIllllIIIllllllIIIlIl, EnumFacing.SOUTH)).withProperty((IProperty<Comparable>)BlockTripWire.WEST, isConnectedTo(llllllllllllIllllIIIllllllIIIlII, llllllllllllIllllIIIllllllIIIIll, llllllllllllIllllIIIllllllIIIlIl, EnumFacing.WEST));
    }
    
    private static boolean lIIIIllIIIIlIlII(final int llllllllllllIllllIIIlllIlIlIIIlI) {
        return llllllllllllIllllIIIlllIlIlIIIlI != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllllIIIlllIllllIIlI) {
        int llllllllllllIllllIIIlllIllllIIIl = BlockTripWire.lIlllllllIIlIl[0];
        if (lIIIIllIIIIlIlII(((boolean)llllllllllllIllllIIIlllIllllIIlI.getValue((IProperty<Boolean>)BlockTripWire.POWERED)) ? 1 : 0)) {
            llllllllllllIllllIIIlllIllllIIIl |= BlockTripWire.lIlllllllIIlIl[1];
        }
        if (lIIIIllIIIIlIlII(((boolean)llllllllllllIllllIIIlllIllllIIlI.getValue((IProperty<Boolean>)BlockTripWire.SUSPENDED)) ? 1 : 0)) {
            llllllllllllIllllIIIlllIllllIIIl |= BlockTripWire.lIlllllllIIlIl[2];
        }
        if (lIIIIllIIIIlIlII(((boolean)llllllllllllIllllIIIlllIllllIIlI.getValue((IProperty<Boolean>)BlockTripWire.ATTACHED)) ? 1 : 0)) {
            llllllllllllIllllIIIlllIllllIIIl |= BlockTripWire.lIlllllllIIlIl[4];
        }
        if (lIIIIllIIIIlIlII(((boolean)llllllllllllIllllIIIlllIllllIIlI.getValue((IProperty<Boolean>)BlockTripWire.DISARMED)) ? 1 : 0)) {
            llllllllllllIllllIIIlllIllllIIIl |= BlockTripWire.lIlllllllIIlIl[9];
        }
        return llllllllllllIllllIIIlllIllllIIIl;
    }
    
    private void notifyHook(final World llllllllllllIllllIIIllllIlIlllll, final BlockPos llllllllllllIllllIIIllllIlIllllI, final IBlockState llllllllllllIllllIIIllllIlIlllIl) {
        final EnumFacing[] array = new EnumFacing[BlockTripWire.lIlllllllIIlIl[2]];
        array[BlockTripWire.lIlllllllIIlIl[0]] = EnumFacing.SOUTH;
        array[BlockTripWire.lIlllllllIIlIl[1]] = EnumFacing.WEST;
        final long llllllllllllIllllIIIllllIlIlIIlI = (Object)array;
        final char llllllllllllIllllIIIllllIlIlIIll = (char)array.length;
        String llllllllllllIllllIIIllllIlIlIlII = (String)BlockTripWire.lIlllllllIIlIl[0];
        "".length();
        if ("  ".length() >= "   ".length()) {
            return;
        }
        while (!lIIIIllIIIIllIlI((int)llllllllllllIllllIIIllllIlIlIlII, llllllllllllIllllIIIllllIlIlIIll)) {
            final EnumFacing llllllllllllIllllIIIllllIlIlllII = llllllllllllIllllIIIllllIlIlIIlI[llllllllllllIllllIIIllllIlIlIlII];
            int llllllllllllIllllIIIllllIlIllIll = BlockTripWire.lIlllllllIIlIl[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIIllIIIIllIlI(llllllllllllIllllIIIllllIlIllIll, BlockTripWire.lIlllllllIIlIl[8])) {
                final BlockPos llllllllllllIllllIIIllllIlIllIlI = llllllllllllIllllIIIllllIlIllllI.offset(llllllllllllIllllIIIllllIlIlllII, llllllllllllIllllIIIllllIlIllIll);
                final IBlockState llllllllllllIllllIIIllllIlIllIIl = llllllllllllIllllIIIllllIlIlllll.getBlockState(llllllllllllIllllIIIllllIlIllIlI);
                if (lIIIIllIIIIllIII(llllllllllllIllllIIIllllIlIllIIl.getBlock(), Blocks.tripwire_hook)) {
                    if (!lIIIIllIIIIllIII(llllllllllllIllllIIIllllIlIllIIl.getValue((IProperty<Object>)BlockTripWireHook.FACING), llllllllllllIllllIIIllllIlIlllII.getOpposite())) {
                        break;
                    }
                    Blocks.tripwire_hook.func_176260_a(llllllllllllIllllIIIllllIlIlllll, llllllllllllIllllIIIllllIlIllIlI, llllllllllllIllllIIIllllIlIllIIl, (boolean)(BlockTripWire.lIlllllllIIlIl[0] != 0), (boolean)(BlockTripWire.lIlllllllIIlIl[1] != 0), llllllllllllIllllIIIllllIlIllIll, llllllllllllIllllIIIllllIlIlllIl);
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return;
                    }
                    break;
                }
                else if (lIIIIllIIIIllIIl(llllllllllllIllllIIIllllIlIllIIl.getBlock(), Blocks.tripwire)) {
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    break;
                }
                else {
                    ++llllllllllllIllllIIIllllIlIllIll;
                }
            }
            ++llllllllllllIllllIIIllllIlIlIlII;
        }
    }
    
    @Override
    public Item getItem(final World llllllllllllIllllIIIlllllIllIllI, final BlockPos llllllllllllIllllIIIlllllIllIlIl) {
        return Items.string;
    }
    
    private static boolean lIIIIllIIIIllIlI(final int llllllllllllIllllIIIlllIlIllIIll, final int llllllllllllIllllIIIlllIlIllIIlI) {
        return llllllllllllIllllIIIlllIlIllIIll >= llllllllllllIllllIIIlllIlIllIIlI;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllllIIIlllllIlllIlI, final Random llllllllllllIllllIIIlllllIlllIIl, final int llllllllllllIllllIIIlllllIlllIII) {
        return Items.string;
    }
}
