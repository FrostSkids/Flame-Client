// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import java.util.Random;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.properties.PropertyBool;

public class BlockPane extends Block
{
    public static final /* synthetic */ PropertyBool SOUTH;
    public static final /* synthetic */ PropertyBool NORTH;
    private final /* synthetic */ boolean canDrop;
    private static final /* synthetic */ int[] lIIIlIIIlllIIl;
    public static final /* synthetic */ PropertyBool WEST;
    private static final /* synthetic */ String[] lIIIlIIIllIlll;
    public static final /* synthetic */ PropertyBool EAST;
    
    private static boolean lIlllllIlllIllI(final int lllllllllllllIlIIIlIllIlIlIlIIII, final int lllllllllllllIlIIIlIllIlIlIIllll) {
        return lllllllllllllIlIIIlIllIlIlIlIIII < lllllllllllllIlIIIlIllIlIlIIllll;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockPane.lIIIlIIIlllIIl[0] != 0;
    }
    
    private static String lIlllllIllIlIlI(String lllllllllllllIlIIIlIllIlIlIllIll, final String lllllllllllllIlIIIlIllIlIlIlllll) {
        lllllllllllllIlIIIlIllIlIlIllIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlIllIlIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIllIlIlIllllI = new StringBuilder();
        final char[] lllllllllllllIlIIIlIllIlIlIlllIl = lllllllllllllIlIIIlIllIlIlIlllll.toCharArray();
        int lllllllllllllIlIIIlIllIlIlIlllII = BlockPane.lIIIlIIIlllIIl[0];
        final long lllllllllllllIlIIIlIllIlIlIlIllI = (Object)lllllllllllllIlIIIlIllIlIlIllIll.toCharArray();
        final int lllllllllllllIlIIIlIllIlIlIlIlIl = lllllllllllllIlIIIlIllIlIlIlIllI.length;
        long lllllllllllllIlIIIlIllIlIlIlIlII = BlockPane.lIIIlIIIlllIIl[0];
        while (lIlllllIlllIllI((int)lllllllllllllIlIIIlIllIlIlIlIlII, lllllllllllllIlIIIlIllIlIlIlIlIl)) {
            final char lllllllllllllIlIIIlIllIlIllIIIIl = lllllllllllllIlIIIlIllIlIlIlIllI[lllllllllllllIlIIIlIllIlIlIlIlII];
            lllllllllllllIlIIIlIllIlIlIllllI.append((char)(lllllllllllllIlIIIlIllIlIllIIIIl ^ lllllllllllllIlIIIlIllIlIlIlllIl[lllllllllllllIlIIIlIllIlIlIlllII % lllllllllllllIlIIIlIllIlIlIlllIl.length]));
            "".length();
            ++lllllllllllllIlIIIlIllIlIlIlllII;
            ++lllllllllllllIlIIIlIllIlIlIlIlII;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIllIlIlIllllI);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPane.lIIIlIIIlllIIl[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPane.lIIIlIIIlllIIl[0]] = BlockPane.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPane.lIIIlIIIlllIIl[1]] = BlockPane.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPane.lIIIlIIIlllIIl[2]] = BlockPane.WEST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPane.lIIIlIIIlllIIl[3]] = BlockPane.SOUTH;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    protected BlockPane(final Material lllllllllllllIlIIIlIllIlllllIlII, final boolean lllllllllllllIlIIIlIllIlllllIIII) {
        super(lllllllllllllIlIIIlIllIlllllIlII);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockPane.NORTH, (boolean)(BlockPane.lIIIlIIIlllIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockPane.EAST, (boolean)(BlockPane.lIIIlIIIlllIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockPane.SOUTH, (boolean)(BlockPane.lIIIlIIIlllIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockPane.WEST, (boolean)(BlockPane.lIIIlIIIlllIIl[0] != 0)));
        this.canDrop = lllllllllllllIlIIIlIllIlllllIIII;
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIlIIIlIllIlllIlIIII, final BlockPos lllllllllllllIlIIIlIllIlllIIllll, final EnumFacing lllllllllllllIlIIIlIllIlllIIlllI) {
        int shouldSideBeRendered;
        if (lIlllllIlllIIll(lllllllllllllIlIIIlIllIlllIlIIII.getBlockState(lllllllllllllIlIIIlIllIlllIIllll).getBlock(), this)) {
            shouldSideBeRendered = BlockPane.lIIIlIIIlllIIl[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((188 + 184 - 311 + 129 ^ 126 + 98 - 216 + 156) & (0x69 ^ 0x5E ^ (0x45 ^ 0x68) ^ -" ".length())) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = (super.shouldSideBeRendered(lllllllllllllIlIIIlIllIlllIlIIII, lllllllllllllIlIIIlIllIlllIIllll, lllllllllllllIlIIIlIllIlllIIlllI) ? 1 : 0);
        }
        return shouldSideBeRendered != 0;
    }
    
    private static boolean lIlllllIlllIlII(final int lllllllllllllIlIIIlIllIlIlIIIlIl) {
        return lllllllllllllIlIIIlIllIlIlIIIlIl != 0;
    }
    
    private static void lIlllllIllIlIll() {
        (lIIIlIIIllIlll = new String[BlockPane.lIIIlIIIlllIIl[4]])[BlockPane.lIIIlIIIlllIIl[0]] = lIlllllIllIlIIl("hdvNuL/mZ7k=", "xNRNs");
        BlockPane.lIIIlIIIllIlll[BlockPane.lIIIlIIIlllIIl[1]] = lIlllllIllIlIlI("KjI7Ew==", "OSHgC");
        BlockPane.lIIIlIIIllIlll[BlockPane.lIIIlIIIlllIIl[2]] = lIlllllIllIlIlI("ISIlICo=", "RMPTB");
        BlockPane.lIIIlIIIllIlll[BlockPane.lIIIlIIIlllIIl[3]] = lIlllllIllIlIIl("82fzRIeWnSk=", "xpcRU");
    }
    
    public final boolean canPaneConnectToBlock(final Block lllllllllllllIlIIIlIllIllIIIIIIl) {
        if (lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIIIIIl.isFullBlock() ? 1 : 0) && lIlllllIlllIlIl(lllllllllllllIlIIIlIllIllIIIIIIl, this) && lIlllllIlllIlIl(lllllllllllllIlIIIlIllIllIIIIIIl, Blocks.glass) && lIlllllIlllIlIl(lllllllllllllIlIIIlIllIllIIIIIIl, Blocks.stained_glass) && lIlllllIlllIlIl(lllllllllllllIlIIIlIllIllIIIIIIl, Blocks.stained_glass_pane) && lIlllllIlllIIlI((lllllllllllllIlIIIlIllIllIIIIIIl instanceof BlockPane) ? 1 : 0)) {
            return BlockPane.lIIIlIIIlllIIl[0] != 0;
        }
        return BlockPane.lIIIlIIIlllIIl[1] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIIIlIllIlIllllIll) {
        return BlockPane.lIIIlIIIlllIIl[0];
    }
    
    @Override
    protected boolean canSilkHarvest() {
        return BlockPane.lIIIlIIIlllIIl[1] != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIIIlIllIllIIllIIl, final BlockPos lllllllllllllIlIIIlIllIllIIIllIl) {
        float lllllllllllllIlIIIlIllIllIIlIlll = 0.4375f;
        float lllllllllllllIlIIIlIllIllIIlIllI = 0.5625f;
        float lllllllllllllIlIIIlIllIllIIlIlIl = 0.4375f;
        float lllllllllllllIlIIIlIllIllIIlIlII = 0.5625f;
        final boolean lllllllllllllIlIIIlIllIllIIlIIll = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIIllIIl.getBlockState(lllllllllllllIlIIIlIllIllIIIllIl.north()).getBlock());
        final boolean lllllllllllllIlIIIlIllIllIIlIIlI = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIIllIIl.getBlockState(lllllllllllllIlIIIlIllIllIIIllIl.south()).getBlock());
        final boolean lllllllllllllIlIIIlIllIllIIlIIIl = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIIllIIl.getBlockState(lllllllllllllIlIIIlIllIllIIIllIl.west()).getBlock());
        final boolean lllllllllllllIlIIIlIllIllIIlIIII = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIIllIIl.getBlockState(lllllllllllllIlIIIlIllIllIIIllIl.east()).getBlock());
        if ((!lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIIl ? 1 : 0) || lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIII ? 1 : 0)) && (!lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIIl ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIII ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIll ? 1 : 0) || lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIlI ? 1 : 0))) {
            if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIIl ? 1 : 0)) {
                lllllllllllllIlIIIlIllIllIIlIlll = 0.0f;
                "".length();
                if (((0xBB ^ 0xAB) & ~(0x83 ^ 0x93)) != 0x0) {
                    return;
                }
            }
            else if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIII ? 1 : 0)) {
                lllllllllllllIlIIIlIllIllIIlIllI = 1.0f;
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
            }
        }
        else {
            lllllllllllllIlIIIlIllIllIIlIlll = 0.0f;
            lllllllllllllIlIIIlIllIllIIlIllI = 1.0f;
        }
        if ((!lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIll ? 1 : 0) || lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIlI ? 1 : 0)) && (!lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIIl ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIII ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIIlIIll ? 1 : 0) || lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIlI ? 1 : 0))) {
            if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIll ? 1 : 0)) {
                lllllllllllllIlIIIlIllIllIIlIlIl = 0.0f;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIIlIIlI ? 1 : 0)) {
                lllllllllllllIlIIIlIllIllIIlIlII = 1.0f;
                "".length();
                if (-(0x44 ^ 0x40) >= 0) {
                    return;
                }
            }
        }
        else {
            lllllllllllllIlIIIlIllIllIIlIlIl = 0.0f;
            lllllllllllllIlIIIlIllIllIIlIlII = 1.0f;
        }
        this.setBlockBounds(lllllllllllllIlIIIlIllIllIIlIlll, 0.0f, lllllllllllllIlIIIlIllIllIIlIlIl, lllllllllllllIlIIIlIllIllIIlIllI, 1.0f, lllllllllllllIlIIIlIllIllIIlIlII);
    }
    
    private static String lIlllllIllIlIIl(final String lllllllllllllIlIIIlIllIlIlllIIII, final String lllllllllllllIlIIIlIllIlIllIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIllIlIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIllIlIllIllll.getBytes(StandardCharsets.UTF_8)), BlockPane.lIIIlIIIlllIIl[5]), "DES");
            final Cipher lllllllllllllIlIIIlIllIlIlllIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIllIlIlllIIlI.init(BlockPane.lIIIlIIIlllIIl[2], lllllllllllllIlIIIlIllIlIlllIIll);
            return new String(lllllllllllllIlIIIlIllIlIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIllIlIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIllIlIlllIIIl) {
            lllllllllllllIlIIIlIllIlIlllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    static {
        lIlllllIlllIIIl();
        lIlllllIllIlIll();
        NORTH = PropertyBool.create(BlockPane.lIIIlIIIllIlll[BlockPane.lIIIlIIIlllIIl[0]]);
        EAST = PropertyBool.create(BlockPane.lIIIlIIIllIlll[BlockPane.lIIIlIIIlllIIl[1]]);
        SOUTH = PropertyBool.create(BlockPane.lIIIlIIIllIlll[BlockPane.lIIIlIIIlllIIl[2]]);
        WEST = PropertyBool.create(BlockPane.lIIIlIIIllIlll[BlockPane.lIIIlIIIlllIIl[3]]);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockPane.lIIIlIIIlllIIl[0] != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIIIlIllIlllIllIlI, final Random lllllllllllllIlIIIlIllIlllIllIIl, final int lllllllllllllIlIIIlIllIlllIllIII) {
        Item itemDropped;
        if (lIlllllIlllIIlI(this.canDrop ? 1 : 0)) {
            itemDropped = null;
            "".length();
            if ((146 + 95 - 180 + 117 ^ 172 + 54 - 152 + 108) != (0x4A ^ 0x27 ^ (0xB ^ 0x62))) {
                return null;
            }
        }
        else {
            itemDropped = super.getItemDropped(lllllllllllllIlIIIlIllIlllIllIlI, lllllllllllllIlIIIlIllIlllIllIIl, lllllllllllllIlIIIlIllIlllIllIII);
        }
        return itemDropped;
    }
    
    private static boolean lIlllllIlllIIlI(final int lllllllllllllIlIIIlIllIlIlIIIIll) {
        return lllllllllllllIlIIIlIllIlIlIIIIll == 0;
    }
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIlIIIlIllIllIllllIl, final BlockPos lllllllllllllIlIIIlIllIllIllIIIl, final IBlockState lllllllllllllIlIIIlIllIllIllIIII, final AxisAlignedBB lllllllllllllIlIIIlIllIllIlllIlI, final List<AxisAlignedBB> lllllllllllllIlIIIlIllIllIlIlllI, final Entity lllllllllllllIlIIIlIllIllIlIllIl) {
        final boolean lllllllllllllIlIIIlIllIllIllIlll = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIllllIl.getBlockState(lllllllllllllIlIIIlIllIllIllIIIl.north()).getBlock());
        final boolean lllllllllllllIlIIIlIllIllIllIllI = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIllllIl.getBlockState(lllllllllllllIlIIIlIllIllIllIIIl.south()).getBlock());
        final boolean lllllllllllllIlIIIlIllIllIllIlIl = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIllllIl.getBlockState(lllllllllllllIlIIIlIllIllIllIIIl.west()).getBlock());
        final boolean lllllllllllllIlIIIlIllIllIllIlII = this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllIllllIl.getBlockState(lllllllllllllIlIIIlIllIllIllIIIl.east()).getBlock());
        if ((!lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIlIl ? 1 : 0) || lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIlII ? 1 : 0)) && (!lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIlIl ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIlII ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIlll ? 1 : 0) || lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIllI ? 1 : 0))) {
            if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIlIl ? 1 : 0)) {
                this.setBlockBounds(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
                super.addCollisionBoxesToList(lllllllllllllIlIIIlIllIllIllllIl, lllllllllllllIlIIIlIllIllIllIIIl, lllllllllllllIlIIIlIllIllIllIIII, lllllllllllllIlIIIlIllIllIlllIlI, lllllllllllllIlIIIlIllIllIlIlllI, lllllllllllllIlIIIlIllIllIlIllIl);
                "".length();
                if ((72 + 63 - 130 + 193 ^ 138 + 146 - 193 + 103) < ((0xFC ^ 0xB1 ^ (0x2 ^ 0x13)) & (0x2B ^ 0x5E ^ (0x96 ^ 0xBF) ^ -" ".length()))) {
                    return;
                }
            }
            else if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIlII ? 1 : 0)) {
                this.setBlockBounds(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                super.addCollisionBoxesToList(lllllllllllllIlIIIlIllIllIllllIl, lllllllllllllIlIIIlIllIllIllIIIl, lllllllllllllIlIIIlIllIllIllIIII, lllllllllllllIlIIIlIllIllIlllIlI, lllllllllllllIlIIIlIllIllIlIlllI, lllllllllllllIlIIIlIllIllIlIllIl);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.addCollisionBoxesToList(lllllllllllllIlIIIlIllIllIllllIl, lllllllllllllIlIIIlIllIllIllIIIl, lllllllllllllIlIIIlIllIllIllIIII, lllllllllllllIlIIIlIllIllIlllIlI, lllllllllllllIlIIIlIllIllIlIlllI, lllllllllllllIlIIIlIllIllIlIllIl);
        }
        if ((!lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIlll ? 1 : 0) || lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIllI ? 1 : 0)) && (!lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIlIl ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIlII ? 1 : 0) || !lIlllllIlllIIlI(lllllllllllllIlIIIlIllIllIllIlll ? 1 : 0) || lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIllI ? 1 : 0))) {
            if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIlll ? 1 : 0)) {
                this.setBlockBounds(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
                super.addCollisionBoxesToList(lllllllllllllIlIIIlIllIllIllllIl, lllllllllllllIlIIIlIllIllIllIIIl, lllllllllllllIlIIIlIllIllIllIIII, lllllllllllllIlIIIlIllIllIlllIlI, lllllllllllllIlIIIlIllIllIlIlllI, lllllllllllllIlIIIlIllIllIlIllIl);
                "".length();
                if ((0x9A ^ 0x9E) < 0) {
                    return;
                }
            }
            else if (lIlllllIlllIlII(lllllllllllllIlIIIlIllIllIllIllI ? 1 : 0)) {
                this.setBlockBounds(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
                super.addCollisionBoxesToList(lllllllllllllIlIIIlIllIllIllllIl, lllllllllllllIlIIIlIllIllIllIIIl, lllllllllllllIlIIIlIllIllIllIIII, lllllllllllllIlIIIlIllIllIlllIlI, lllllllllllllIlIIIlIllIllIlIlllI, lllllllllllllIlIIIlIllIllIlIllIl);
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            this.setBlockBounds(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
            super.addCollisionBoxesToList(lllllllllllllIlIIIlIllIllIllllIl, lllllllllllllIlIIIlIllIllIllIIIl, lllllllllllllIlIIIlIllIllIllIIII, lllllllllllllIlIIIlIllIllIlllIlI, lllllllllllllIlIIIlIllIllIlIlllI, lllllllllllllIlIIIlIllIllIlIllIl);
        }
    }
    
    @Override
    public IBlockState getActualState(final IBlockState lllllllllllllIlIIIlIllIllllIlIlI, final IBlockAccess lllllllllllllIlIIIlIllIllllIIlIl, final BlockPos lllllllllllllIlIIIlIllIllllIIlII) {
        return lllllllllllllIlIIIlIllIllllIlIlI.withProperty((IProperty<Comparable>)BlockPane.NORTH, this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllllIIlIl.getBlockState(lllllllllllllIlIIIlIllIllllIIlII.north()).getBlock())).withProperty((IProperty<Comparable>)BlockPane.SOUTH, this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllllIIlIl.getBlockState(lllllllllllllIlIIIlIllIllllIIlII.south()).getBlock())).withProperty((IProperty<Comparable>)BlockPane.WEST, this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllllIIlIl.getBlockState(lllllllllllllIlIIIlIllIllllIIlII.west()).getBlock())).withProperty((IProperty<Comparable>)BlockPane.EAST, this.canPaneConnectToBlock(lllllllllllllIlIIIlIllIllllIIlIl.getBlockState(lllllllllllllIlIIIlIllIllllIIlII.east()).getBlock()));
    }
    
    private static boolean lIlllllIlllIIll(final Object lllllllllllllIlIIIlIllIlIlIIlIII, final Object lllllllllllllIlIIIlIllIlIlIIIlll) {
        return lllllllllllllIlIIIlIllIlIlIIlIII == lllllllllllllIlIIIlIllIlIlIIIlll;
    }
    
    private static boolean lIlllllIlllIlIl(final Object lllllllllllllIlIIIlIllIlIlIIllII, final Object lllllllllllllIlIIIlIllIlIlIIlIll) {
        return lllllllllllllIlIIIlIllIlIlIIllII != lllllllllllllIlIIIlIllIlIlIIlIll;
    }
    
    private static void lIlllllIlllIIIl() {
        (lIIIlIIIlllIIl = new int[6])[0] = ((0xE ^ 0x49) & ~(0x69 ^ 0x2E));
        BlockPane.lIIIlIIIlllIIl[1] = " ".length();
        BlockPane.lIIIlIIIlllIIl[2] = "  ".length();
        BlockPane.lIIIlIIIlllIIl[3] = "   ".length();
        BlockPane.lIIIlIIIlllIIl[4] = (0xC6 ^ 0xBA ^ (0x39 ^ 0x41));
        BlockPane.lIIIlIIIlllIIl[5] = (144 + 43 - 90 + 53 ^ 8 + 150 - 49 + 49);
    }
}
