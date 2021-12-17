// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.PropertyInteger;

public class BlockFarmland extends Block
{
    private static final /* synthetic */ String[] lllIllllllIlll;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    public static final /* synthetic */ PropertyInteger MOISTURE;
    private static final /* synthetic */ int[] lllIlllllllIIl;
    
    private static boolean lIlIIllIIlIlllII(final Object llllllllllllIlIlIllllIIlIllIlIIl) {
        return llllllllllllIlIlIllllIIlIllIlIIl != null;
    }
    
    private static void lIlIIllIIlIlIIlI() {
        (lllIllllllIlll = new String[BlockFarmland.lllIlllllllIIl[4]])[BlockFarmland.lllIlllllllIIl[0]] = lIlIIllIIlIIllll("qbUpgdYOojde3oL89Zf8Yw==", "xlGkH");
        BlockFarmland.lllIllllllIlll[BlockFarmland.lllIlllllllIIl[2]] = lIlIIllIIlIlIIII("e00+fg/HLE74Sk9uzg6KEg==", "mePHR");
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockFarmland.lllIlllllllIIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFarmland.lllIlllllllIIl[0]] = BlockFarmland.MOISTURE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static String lIlIIllIIlIIllll(final String llllllllllllIlIlIllllIIllIIIIlll, final String llllllllllllIlIlIllllIIllIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIlIlIllllIIllIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllIIllIIIlIII.getBytes(StandardCharsets.UTF_8)), BlockFarmland.lllIlllllllIIl[10]), "DES");
            final Cipher llllllllllllIlIlIllllIIllIIIlIll = Cipher.getInstance("DES");
            llllllllllllIlIlIllllIIllIIIlIll.init(BlockFarmland.lllIlllllllIIl[4], llllllllllllIlIlIllllIIllIIIllII);
            return new String(llllllllllllIlIlIllllIIllIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllIIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIllllIIllIIIlIlI) {
            llllllllllllIlIlIllllIIllIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIllIIlIllIII(final int llllllllllllIlIlIllllIIlIllIIlll) {
        return llllllllllllIlIlIllllIIlIllIIlll != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockFarmland.lllIlllllllIIl[0] != 0;
    }
    
    private boolean hasWater(final World llllllllllllIlIlIllllIIlllIIllll, final BlockPos llllllllllllIlIlIllllIIlllIIlIll) {
        final int llllllllllllIlIlIllllIIlllIIlIIl = (int)BlockPos.getAllInBoxMutable(llllllllllllIlIlIllllIIlllIIlIll.add(BlockFarmland.lllIlllllllIIl[5], BlockFarmland.lllIlllllllIIl[0], BlockFarmland.lllIlllllllIIl[5]), llllllllllllIlIlIllllIIlllIIlIll.add(BlockFarmland.lllIlllllllIIl[6], BlockFarmland.lllIlllllllIIl[2], BlockFarmland.lllIlllllllIIl[6])).iterator();
        "".length();
        if (null != null) {
            return ((0x49 ^ 0x58 ^ (0xEA ^ 0xC2)) & (59 + 115 - 124 + 114 ^ 61 + 7 + 89 + 0 ^ -" ".length())) != 0x0;
        }
        while (!lIlIIllIIlIlIlII(((Iterator)llllllllllllIlIlIllllIIlllIIlIIl).hasNext() ? 1 : 0)) {
            final BlockPos.MutableBlockPos llllllllllllIlIlIllllIIlllIIllIl = ((Iterator<BlockPos.MutableBlockPos>)llllllllllllIlIlIllllIIlllIIlIIl).next();
            if (lIlIIllIIlIllIlI(llllllllllllIlIlIllllIIlllIIllll.getBlockState(llllllllllllIlIlIllllIIlllIIllIl).getBlock().getMaterial(), Material.water)) {
                return BlockFarmland.lllIlllllllIIl[2] != 0;
            }
        }
        return BlockFarmland.lllIlllllllIIl[0] != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIlIllllIIllIlIIlll, final Random llllllllllllIlIlIllllIIllIlIIlII, final int llllllllllllIlIlIllllIIllIlIIlIl) {
        return Blocks.dirt.getItemDropped(Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), llllllllllllIlIlIllllIIllIlIIlII, llllllllllllIlIlIllllIIllIlIIlIl);
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlIlIllllIIlllIIIIlI, final BlockPos llllllllllllIlIlIllllIIlllIIIIIl, final IBlockState llllllllllllIlIlIllllIIllIlllIll, final Block llllllllllllIlIlIllllIIllIllllll) {
        super.onNeighborBlockChange(llllllllllllIlIlIllllIIlllIIIIlI, llllllllllllIlIlIllllIIlllIIIIIl, llllllllllllIlIlIllllIIllIlllIll, llllllllllllIlIlIllllIIllIllllll);
        if (lIlIIllIIlIllIII(llllllllllllIlIlIllllIIlllIIIIlI.getBlockState(llllllllllllIlIlIllllIIlllIIIIIl.up()).getBlock().getMaterial().isSolid() ? 1 : 0)) {
            llllllllllllIlIlIllllIIlllIIIIlI.setBlockState(llllllllllllIlIlIllllIIlllIIIIIl, Blocks.dirt.getDefaultState());
            "".length();
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIlIllllIIllIIlllII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockFarmland.MOISTURE, llllllllllllIlIlIllllIIllIIlllII & BlockFarmland.lllIlllllllIIl[1]);
    }
    
    private static void lIlIIllIIlIlIIll() {
        (lllIlllllllIIl = new int[11])[0] = ((0x6F ^ 0x2A ^ (0x9 ^ 0x72)) & (0x28 ^ 0xD ^ (0xAD ^ 0xB6) ^ -" ".length()));
        BlockFarmland.lllIlllllllIIl[1] = (0xB1 ^ 0xB6);
        BlockFarmland.lllIlllllllIIl[2] = " ".length();
        BlockFarmland.lllIlllllllIIl[3] = (0x73 ^ 0x25) + (0x3 ^ 0x54) - -(0xD ^ 0x2D) + (0x37 ^ 0x5);
        BlockFarmland.lllIlllllllIIl[4] = "  ".length();
        BlockFarmland.lllIlllllllIIl[5] = -(0x6 ^ 0x9 ^ (0x8B ^ 0x80));
        BlockFarmland.lllIlllllllIIl[6] = (0x6 ^ 0x2);
        BlockFarmland.lllIlllllllIIl[7] = (76 + 108 - 73 + 50 ^ 47 + 14 + 92 + 14);
        BlockFarmland.lllIlllllllIIl[8] = "   ".length();
        BlockFarmland.lllIlllllllIIl[9] = ("   ".length() ^ (0x2F ^ 0x29));
        BlockFarmland.lllIlllllllIIl[10] = (0x48 ^ 0x40);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIlIllllIIllIIlIlll) {
        return llllllllllllIlIlIllllIIllIIlIlll.getValue((IProperty<Integer>)BlockFarmland.MOISTURE);
    }
    
    private boolean hasCrops(final World llllllllllllIlIlIllllIIlllIllIlI, final BlockPos llllllllllllIlIlIllllIIlllIllIIl) {
        final Block llllllllllllIlIlIllllIIlllIllIII = llllllllllllIlIlIllllIIlllIllIlI.getBlockState(llllllllllllIlIlIllllIIlllIllIIl.up()).getBlock();
        if (lIlIIllIIlIlIlII((llllllllllllIlIlIllllIIlllIllIII instanceof BlockCrops) ? 1 : 0) && lIlIIllIIlIlIlII((llllllllllllIlIlIllllIIlllIllIII instanceof BlockStem) ? 1 : 0)) {
            return BlockFarmland.lllIlllllllIIl[0] != 0;
        }
        return BlockFarmland.lllIlllllllIIl[2] != 0;
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess llllllllllllIlIlIllllIIllIllIIll, final BlockPos llllllllllllIlIlIllllIIllIlIllIl, final EnumFacing llllllllllllIlIlIllllIIllIllIIIl) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIlIllllIIllIllIIIl.ordinal()]) {
            case 2: {
                return BlockFarmland.lllIlllllllIIl[2] != 0;
            }
            case 3:
            case 4:
            case 5:
            case 6: {
                final Block llllllllllllIlIlIllllIIllIllIIII = llllllllllllIlIlIllllIIllIllIIll.getBlockState(llllllllllllIlIlIllllIIllIlIllIl).getBlock();
                if (lIlIIllIIlIlIlII(llllllllllllIlIlIllllIIllIllIIII.isOpaqueCube() ? 1 : 0) && lIlIIllIIlIllIll(llllllllllllIlIlIllllIIllIllIIII, Blocks.farmland)) {
                    return BlockFarmland.lllIlllllllIIl[2] != 0;
                }
                return BlockFarmland.lllIlllllllIIl[0] != 0;
            }
            default: {
                return super.shouldSideBeRendered(llllllllllllIlIlIllllIIllIllIIll, llllllllllllIlIlIllllIIllIlIllIl, llllllllllllIlIlIllllIIllIllIIIl);
            }
        }
    }
    
    private static boolean lIlIIllIIlIllIlI(final Object llllllllllllIlIlIllllIIlIllIllII, final Object llllllllllllIlIlIllllIIlIllIlIll) {
        return llllllllllllIlIlIllllIIlIllIllII == llllllllllllIlIlIllllIIlIllIlIll;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockFarmland.lllIlllllllIIl[0] != 0;
    }
    
    private static boolean lIlIIllIIlIllIIl(final int llllllllllllIlIlIllllIIlIllIIIIl) {
        return llllllllllllIlIlIllllIIlIllIIIIl < 0;
    }
    
    private static boolean lIlIIllIIlIllIll(final Object llllllllllllIlIlIllllIIlIlllIIII, final Object llllllllllllIlIlIllllIIlIllIllll) {
        return llllllllllllIlIlIllllIIlIlllIIII != llllllllllllIlIlIllllIIlIllIllll;
    }
    
    private static boolean lIlIIllIIlIlIlIl(final int llllllllllllIlIlIllllIIlIlIllllI) {
        return llllllllllllIlIlIllllIIlIlIllllI > 0;
    }
    
    private static String lIlIIllIIlIlIIII(final String llllllllllllIlIlIllllIIlIlllllII, final String llllllllllllIlIlIllllIIlIllllIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlIllllIIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlIllllIIlIllllllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlIllllIIlIllllllI.init(BlockFarmland.lllIlllllllIIl[4], llllllllllllIlIlIllllIIlIlllllll);
            return new String(llllllllllllIlIlIllllIIlIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllIIlIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIllllIIlIlllllIl) {
            llllllllllllIlIlIllllIIlIlllllIl.printStackTrace();
            return null;
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockFarmland.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIllIIlIlllII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final long llllllllllllIlIlIllllIIllIIlIIIl = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlIlIllllIIllIIlIIIl[EnumFacing.DOWN.ordinal()] = BlockFarmland.lllIlllllllIIl[2];
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIlIllllIIllIIlIIIl[EnumFacing.EAST.ordinal()] = BlockFarmland.lllIlllllllIIl[7];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIlIllllIIllIIlIIIl[EnumFacing.NORTH.ordinal()] = BlockFarmland.lllIlllllllIIl[8];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIlIllllIIllIIlIIIl[EnumFacing.SOUTH.ordinal()] = BlockFarmland.lllIlllllllIIl[6];
            "".length();
            if ("  ".length() == (" ".length() & (" ".length() ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIlIllllIIllIIlIIIl[EnumFacing.UP.ordinal()] = BlockFarmland.lllIlllllllIIl[4];
            "".length();
            if ((0x90 ^ 0x94) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIlIllllIIllIIlIIIl[EnumFacing.WEST.ordinal()] = BlockFarmland.lllIlllllllIIl[9];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockFarmland.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIlIllllIIllIIlIIIl;
    }
    
    private static boolean lIlIIllIIlIlIllI(final int llllllllllllIlIlIllllIIlIlllIlII, final int llllllllllllIlIlIllllIIlIlllIIll) {
        return llllllllllllIlIlIllllIIlIlllIlII < llllllllllllIlIlIllllIIlIlllIIll;
    }
    
    protected BlockFarmland() {
        super(Material.ground);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockFarmland.MOISTURE, BlockFarmland.lllIlllllllIIl[0]));
        this.setTickRandomly((boolean)(BlockFarmland.lllIlllllllIIl[2] != 0));
        "".length();
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.setLightOpacity(BlockFarmland.lllIlllllllIIl[3]);
        "".length();
    }
    
    @Override
    public void onFallenUpon(final World llllllllllllIlIlIllllIIllllIIIlI, final BlockPos llllllllllllIlIlIllllIIllllIIIIl, final Entity llllllllllllIlIlIllllIIllllIIlIl, final float llllllllllllIlIlIllllIIllllIIlII) {
        if (lIlIIllIIlIllIII((llllllllllllIlIlIllllIIllllIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
            if (lIlIIllIIlIlIlII(llllllllllllIlIlIllllIIllllIIIlI.isRemote ? 1 : 0) && lIlIIllIIlIllIIl(lIlIIllIIlIlIlll(llllllllllllIlIlIllllIIllllIIIlI.rand.nextFloat(), llllllllllllIlIlIllllIIllllIIlII - 0.5f))) {
                if (lIlIIllIIlIlIlII((llllllllllllIlIlIllllIIllllIIlIl instanceof EntityPlayer) ? 1 : 0) && lIlIIllIIlIlIlII(llllllllllllIlIlIllllIIllllIIIlI.getGameRules().getBoolean(BlockFarmland.lllIllllllIlll[BlockFarmland.lllIlllllllIIl[2]]) ? 1 : 0)) {
                    return;
                }
                llllllllllllIlIlIllllIIllllIIIlI.setBlockState(llllllllllllIlIlIllllIIllllIIIIl, Blocks.dirt.getDefaultState());
                "".length();
            }
            super.onFallenUpon(llllllllllllIlIlIllllIIllllIIIlI, llllllllllllIlIlIllllIIllllIIIIl, llllllllllllIlIlIllllIIllllIIlIl, llllllllllllIlIlIllllIIllllIIlII);
        }
    }
    
    @Override
    public Item getItem(final World llllllllllllIlIlIllllIIllIlIIIIl, final BlockPos llllllllllllIlIlIllllIIllIlIIIII) {
        return Item.getItemFromBlock(Blocks.dirt);
    }
    
    @Override
    public void updateTick(final World llllllllllllIlIlIllllIIlllllIIIl, final BlockPos llllllllllllIlIlIllllIIlllllIIII, final IBlockState llllllllllllIlIlIllllIIlllllIlIl, final Random llllllllllllIlIlIllllIIlllllIlII) {
        final int llllllllllllIlIlIllllIIlllllIIll = llllllllllllIlIlIllllIIlllllIlIl.getValue((IProperty<Integer>)BlockFarmland.MOISTURE);
        if (lIlIIllIIlIlIlII(this.hasWater(llllllllllllIlIlIllllIIlllllIIIl, llllllllllllIlIlIllllIIlllllIIII) ? 1 : 0) && lIlIIllIIlIlIlII(llllllllllllIlIlIllllIIlllllIIIl.canLightningStrike(llllllllllllIlIlIllllIIlllllIIII.up()) ? 1 : 0)) {
            if (lIlIIllIIlIlIlIl(llllllllllllIlIlIllllIIlllllIIll)) {
                llllllllllllIlIlIllllIIlllllIIIl.setBlockState(llllllllllllIlIlIllllIIlllllIIII, llllllllllllIlIlIllllIIlllllIlIl.withProperty((IProperty<Comparable>)BlockFarmland.MOISTURE, llllllllllllIlIlIllllIIlllllIIll - BlockFarmland.lllIlllllllIIl[2]), BlockFarmland.lllIlllllllIIl[4]);
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else if (lIlIIllIIlIlIlII(this.hasCrops(llllllllllllIlIlIllllIIlllllIIIl, llllllllllllIlIlIllllIIlllllIIII) ? 1 : 0)) {
                llllllllllllIlIlIllllIIlllllIIIl.setBlockState(llllllllllllIlIlIllllIIlllllIIII, Blocks.dirt.getDefaultState());
                "".length();
                "".length();
                if (((0x48 ^ 0x5A ^ (0x1B ^ 0x4F)) & (0x25 ^ 0x1C ^ 103 + 35 - 70 + 59 ^ -" ".length())) > 0) {
                    return;
                }
            }
        }
        else if (lIlIIllIIlIlIllI(llllllllllllIlIlIllllIIlllllIIll, BlockFarmland.lllIlllllllIIl[1])) {
            llllllllllllIlIlIllllIIlllllIIIl.setBlockState(llllllllllllIlIlIllllIIlllllIIII, llllllllllllIlIlIllllIIlllllIlIl.withProperty((IProperty<Comparable>)BlockFarmland.MOISTURE, BlockFarmland.lllIlllllllIIl[1]), BlockFarmland.lllIlllllllIIl[4]);
            "".length();
        }
    }
    
    private static boolean lIlIIllIIlIlIlII(final int llllllllllllIlIlIllllIIlIllIIlII) {
        return llllllllllllIlIlIllllIIlIllIIlII == 0;
    }
    
    private static int lIlIIllIIlIlIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIlIlIllllIlIIIIIIIll, final BlockPos llllllllllllIlIlIllllIlIIIIIIIlI, final IBlockState llllllllllllIlIlIllllIlIIIIIIIIl) {
        return new AxisAlignedBB(llllllllllllIlIlIllllIlIIIIIIIlI.getX(), llllllllllllIlIlIllllIlIIIIIIIlI.getY(), llllllllllllIlIlIllllIlIIIIIIIlI.getZ(), llllllllllllIlIlIllllIlIIIIIIIlI.getX() + BlockFarmland.lllIlllllllIIl[2], llllllllllllIlIlIllllIlIIIIIIIlI.getY() + BlockFarmland.lllIlllllllIIl[2], llllllllllllIlIlIllllIlIIIIIIIlI.getZ() + BlockFarmland.lllIlllllllIIl[2]);
    }
    
    static {
        lIlIIllIIlIlIIll();
        lIlIIllIIlIlIIlI();
        MOISTURE = PropertyInteger.create(BlockFarmland.lllIllllllIlll[BlockFarmland.lllIlllllllIIl[0]], BlockFarmland.lllIlllllllIIl[0], BlockFarmland.lllIlllllllIIl[1]);
    }
}
