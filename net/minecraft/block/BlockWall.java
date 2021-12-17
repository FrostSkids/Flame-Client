// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.util.StatCollector;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;

public class BlockWall extends Block
{
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    public static final /* synthetic */ PropertyBool UP;
    private static final /* synthetic */ int[] llIlIlIlIIIllI;
    public static final /* synthetic */ PropertyBool NORTH;
    private static final /* synthetic */ String[] llIlIlIlIIIIlI;
    public static final /* synthetic */ PropertyBool WEST;
    public static final /* synthetic */ PropertyBool EAST;
    public static final /* synthetic */ PropertyBool SOUTH;
    
    static {
        lIIlIlIIIIlllIIl();
        lIIlIlIIIIllIlIl();
        UP = PropertyBool.create(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[0]]);
        NORTH = PropertyBool.create(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[1]]);
        EAST = PropertyBool.create(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[2]]);
        SOUTH = PropertyBool.create(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[3]]);
        WEST = PropertyBool.create(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[4]]);
        VARIANT = PropertyEnum.create(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[5]], EnumType.class);
    }
    
    @Override
    public boolean isPassable(final IBlockAccess llllllllllllIllIlIlIlIIIIllllllI, final BlockPos llllllllllllIllIlIlIlIIIIlllllIl) {
        return BlockWall.llIlIlIlIIIllI[0] != 0;
    }
    
    public boolean canConnectTo(final IBlockAccess llllllllllllIllIlIlIlIIIIlIIIIlI, final BlockPos llllllllllllIllIlIlIlIIIIlIIIlIl) {
        final Block llllllllllllIllIlIlIlIIIIlIIIlII = llllllllllllIllIlIlIlIIIIlIIIIlI.getBlockState(llllllllllllIllIlIlIlIIIIlIIIlIl).getBlock();
        int n;
        if (lIIlIlIIIIllllII(llllllllllllIllIlIlIlIIIIlIIIlII, Blocks.barrier)) {
            n = BlockWall.llIlIlIlIIIllI[0];
            "".length();
            if ((0xBB ^ 0xBF) <= "  ".length()) {
                return ((0x5 ^ 0x9) & ~(0x55 ^ 0x59)) != 0x0;
            }
        }
        else if (lIIlIlIIIIllllIl(llllllllllllIllIlIlIlIIIIlIIIlII, this) && lIIlIlIIIIlllIll((llllllllllllIllIlIlIlIIIIlIIIlII instanceof BlockFenceGate) ? 1 : 0)) {
            if (lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIlIIIlII.blockMaterial.isOpaque() ? 1 : 0) && lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIlIIIlII.isFullCube() ? 1 : 0)) {
                if (lIIlIlIIIIllllIl(llllllllllllIllIlIlIlIIIIlIIIlII.blockMaterial, Material.gourd)) {
                    n = BlockWall.llIlIlIlIIIllI[1];
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return ((0x5D ^ 0x20 ^ (0x48 ^ 0x19)) & (0x2A ^ 0x7B ^ (0xEB ^ 0x96) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = BlockWall.llIlIlIlIIIllI[0];
                    "".length();
                    if (" ".length() > " ".length()) {
                        return ((0x98 ^ 0x90 ^ (0xB2 ^ 0x9D)) & (23 + 26 + 31 + 88 ^ 44 + 135 - 37 + 1 ^ -" ".length())) != 0x0;
                    }
                }
            }
            else {
                n = BlockWall.llIlIlIlIIIllI[0];
                "".length();
                if (-" ".length() < -" ".length()) {
                    return ((0xF2 ^ 0xAC) & ~(0x5F ^ 0x1)) != 0x0;
                }
            }
        }
        else {
            n = BlockWall.llIlIlIlIIIllI[1];
        }
        return n != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockWall.llIlIlIlIIIllI[0] != 0;
    }
    
    private static boolean lIIlIlIIIIlllIll(final int llllllllllllIllIlIlIIlllllIIIIII) {
        return llllllllllllIllIlIlIIlllllIIIIII == 0;
    }
    
    private static String lIIlIlIIIIllIIII(String llllllllllllIllIlIlIIllllllIlIIl, final String llllllllllllIllIlIlIIllllllIllIl) {
        llllllllllllIllIlIlIIllllllIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIIllllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIllllllIllII = new StringBuilder();
        final char[] llllllllllllIllIlIlIIllllllIlIll = llllllllllllIllIlIlIIllllllIllIl.toCharArray();
        int llllllllllllIllIlIlIIllllllIlIlI = BlockWall.llIlIlIlIIIllI[0];
        final double llllllllllllIllIlIlIIllllllIIlII = (Object)llllllllllllIllIlIlIIllllllIlIIl.toCharArray();
        final int llllllllllllIllIlIlIIllllllIIIll = llllllllllllIllIlIlIIllllllIIlII.length;
        double llllllllllllIllIlIlIIllllllIIIlI = BlockWall.llIlIlIlIIIllI[0];
        while (lIIlIlIIIIllllll((int)llllllllllllIllIlIlIIllllllIIIlI, llllllllllllIllIlIlIIllllllIIIll)) {
            final char llllllllllllIllIlIlIIllllllIllll = llllllllllllIllIlIlIIllllllIIlII[llllllllllllIllIlIlIIllllllIIIlI];
            llllllllllllIllIlIlIIllllllIllII.append((char)(llllllllllllIllIlIlIIllllllIllll ^ llllllllllllIllIlIlIIllllllIlIll[llllllllllllIllIlIlIIllllllIlIlI % llllllllllllIllIlIlIIllllllIlIll.length]));
            "".length();
            ++llllllllllllIllIlIlIIllllllIlIlI;
            ++llllllllllllIllIlIlIIllllllIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIllllllIllII);
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[6]]).append(EnumType.NORMAL.getUnlocalizedName()).append(BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[7]])));
    }
    
    private static void lIIlIlIIIIlllIIl() {
        (llIlIlIlIIIllI = new int[9])[0] = ((0x1A ^ 0x5B) & ~(0x1C ^ 0x5D));
        BlockWall.llIlIlIlIIIllI[1] = " ".length();
        BlockWall.llIlIlIlIIIllI[2] = "  ".length();
        BlockWall.llIlIlIlIIIllI[3] = "   ".length();
        BlockWall.llIlIlIlIIIllI[4] = (0x48 ^ 0x4C);
        BlockWall.llIlIlIlIIIllI[5] = (0x3F ^ 0x61 ^ (0x75 ^ 0x2E));
        BlockWall.llIlIlIlIIIllI[6] = (0x8C ^ 0x8A);
        BlockWall.llIlIlIlIIIllI[7] = (0x32 ^ 0x35);
        BlockWall.llIlIlIlIIIllI[8] = (0xBC ^ 0xB4);
    }
    
    private static boolean lIIlIlIIIIllllIl(final Object llllllllllllIllIlIlIIlllllIIlIIl, final Object llllllllllllIllIlIlIIlllllIIlIII) {
        return llllllllllllIllIlIlIIlllllIIlIIl != llllllllllllIllIlIlIIlllllIIlIII;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIllIlIlIlIIIIlIIlllI, final BlockPos llllllllllllIllIlIlIlIIIIlIlIIIl, final IBlockState llllllllllllIllIlIlIlIIIIlIlIIII) {
        this.setBlockBoundsBasedOnState(llllllllllllIllIlIlIlIIIIlIIlllI, llllllllllllIllIlIlIlIIIIlIlIIIl);
        this.maxY = 1.5;
        return super.getCollisionBoundingBox(llllllllllllIllIlIlIlIIIIlIIlllI, llllllllllllIllIlIlIlIIIIlIlIIIl, llllllllllllIllIlIlIlIIIIlIlIIII);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIlIlIlIIIIIIlIlIl) {
        return llllllllllllIllIlIlIlIIIIIIlIlIl.getValue(BlockWall.VARIANT).getMetadata();
    }
    
    @Override
    public boolean isFullCube() {
        return BlockWall.llIlIlIlIIIllI[0] != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockWall.llIlIlIlIIIllI[6]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockWall.llIlIlIlIIIllI[0]] = BlockWall.UP;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockWall.llIlIlIlIIIllI[1]] = BlockWall.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockWall.llIlIlIlIIIllI[2]] = BlockWall.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockWall.llIlIlIlIIIllI[3]] = BlockWall.WEST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockWall.llIlIlIlIIIllI[4]] = BlockWall.SOUTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockWall.llIlIlIlIIIllI[5]] = BlockWall.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void lIIlIlIIIIllIlIl() {
        (llIlIlIlIIIIlI = new String[BlockWall.llIlIlIlIIIllI[8]])[BlockWall.llIlIlIlIIIllI[0]] = lIIlIlIIIIlIllll("9e17Qstumok=", "vxXLU");
        BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[1]] = lIIlIlIIIIlIllll("+mN8YdS6dYQ=", "suEhG");
        BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[2]] = lIIlIlIIIIllIIII("ESoRPA==", "tKbHp");
        BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[3]] = lIIlIlIIIIllIIIl("Q5RuTXV0M8c=", "dCPjz");
        BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[4]] = lIIlIlIIIIllIIII("ECkFDg==", "gLvzh");
        BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[5]] = lIIlIlIIIIllIIIl("MuvbzZN6aZI=", "mlCBJ");
        BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[6]] = lIIlIlIIIIllIIIl("wzhfj+VbTx8=", "ZIPNS");
        BlockWall.llIlIlIlIIIIlI[BlockWall.llIlIlIlIIIllI[7]] = lIIlIlIIIIllIIIl("8T0k6ANmRcY=", "UUBBo");
    }
    
    public BlockWall(final Block llllllllllllIllIlIlIlIIIlIIIIlII) {
        super(llllllllllllIllIlIlIlIIIlIIIIlII.blockMaterial);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockWall.UP, (boolean)(BlockWall.llIlIlIlIIIllI[0] != 0)).withProperty((IProperty<Comparable>)BlockWall.NORTH, (boolean)(BlockWall.llIlIlIlIIIllI[0] != 0)).withProperty((IProperty<Comparable>)BlockWall.EAST, (boolean)(BlockWall.llIlIlIlIIIllI[0] != 0)).withProperty((IProperty<Comparable>)BlockWall.SOUTH, (boolean)(BlockWall.llIlIlIlIIIllI[0] != 0)).withProperty((IProperty<Comparable>)BlockWall.WEST, (boolean)(BlockWall.llIlIlIlIIIllI[0] != 0)).withProperty(BlockWall.VARIANT, EnumType.NORMAL));
        this.setHardness(llllllllllllIllIlIlIlIIIlIIIIlII.blockHardness);
        "".length();
        this.setResistance(llllllllllllIllIlIlIlIIIlIIIIlII.blockResistance / 3.0f);
        "".length();
        this.setStepSound(llllllllllllIllIlIlIlIIIlIIIIlII.stepSound);
        "".length();
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static String lIIlIlIIIIlIllll(final String llllllllllllIllIlIlIIlllllllllII, final String llllllllllllIllIlIlIIllllllllIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIIIIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIllllllllIll.getBytes(StandardCharsets.UTF_8)), BlockWall.llIlIlIlIIIllI[8]), "DES");
            final Cipher llllllllllllIllIlIlIlIIIIIIIIIII = Cipher.getInstance("DES");
            llllllllllllIllIlIlIlIIIIIIIIIII.init(BlockWall.llIlIlIlIIIllI[2], llllllllllllIllIlIlIlIIIIIIIIIIl);
            return new String(llllllllllllIllIlIlIlIIIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIlllllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIlllllllllll) {
            llllllllllllIllIlIlIIlllllllllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess llllllllllllIllIlIlIlIIIIIlIIlIl, final BlockPos llllllllllllIllIlIlIlIIIIIlIIIII, final EnumFacing llllllllllllIllIlIlIlIIIIIIlllll) {
        int shouldSideBeRendered;
        if (lIIlIlIIIIllllII(llllllllllllIllIlIlIlIIIIIIlllll, EnumFacing.DOWN)) {
            shouldSideBeRendered = (super.shouldSideBeRendered(llllllllllllIllIlIlIlIIIIIlIIlIl, llllllllllllIllIlIlIlIIIIIlIIIII, llllllllllllIllIlIlIlIIIIIIlllll) ? 1 : 0);
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((88 + 62 - 89 + 66 ^ (0xC3 ^ 0x94)) & (176 + 100 - 106 + 62 ^ 8 + 67 + 97 + 20 ^ -" ".length())) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = BlockWall.llIlIlIlIIIllI[1];
        }
        return shouldSideBeRendered != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIllIlIlIlIIIIllIIIlI, final BlockPos llllllllllllIllIlIlIlIIIIllIllIl) {
        final boolean llllllllllllIllIlIlIlIIIIllIllII = this.canConnectTo(llllllllllllIllIlIlIlIIIIllIIIlI, llllllllllllIllIlIlIlIIIIllIllIl.north());
        final boolean llllllllllllIllIlIlIlIIIIllIlIll = this.canConnectTo(llllllllllllIllIlIlIlIIIIllIIIlI, llllllllllllIllIlIlIlIIIIllIllIl.south());
        final boolean llllllllllllIllIlIlIlIIIIllIlIlI = this.canConnectTo(llllllllllllIllIlIlIlIIIIllIIIlI, llllllllllllIllIlIlIlIIIIllIllIl.west());
        final boolean llllllllllllIllIlIlIlIIIIllIlIIl = this.canConnectTo(llllllllllllIllIlIlIlIIIIllIIIlI, llllllllllllIllIlIlIlIIIIllIllIl.east());
        float llllllllllllIllIlIlIlIIIIllIlIII = 0.25f;
        float llllllllllllIllIlIlIlIIIIllIIlll = 0.75f;
        float llllllllllllIllIlIlIlIIIIllIIllI = 0.25f;
        float llllllllllllIllIlIlIlIIIIllIIlIl = 0.75f;
        float llllllllllllIllIlIlIlIIIIllIIlII = 1.0f;
        if (lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIllII ? 1 : 0)) {
            llllllllllllIllIlIlIlIIIIllIIllI = 0.0f;
        }
        if (lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIlIll ? 1 : 0)) {
            llllllllllllIllIlIlIlIIIIllIIlIl = 1.0f;
        }
        if (lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIlIlI ? 1 : 0)) {
            llllllllllllIllIlIlIlIIIIllIlIII = 0.0f;
        }
        if (lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIlIIl ? 1 : 0)) {
            llllllllllllIllIlIlIlIIIIllIIlll = 1.0f;
        }
        if (lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIllII ? 1 : 0) && lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIlIll ? 1 : 0) && lIIlIlIIIIlllIll(llllllllllllIllIlIlIlIIIIllIlIlI ? 1 : 0) && lIIlIlIIIIlllIll(llllllllllllIllIlIlIlIIIIllIlIIl ? 1 : 0)) {
            llllllllllllIllIlIlIlIIIIllIIlII = 0.8125f;
            llllllllllllIllIlIlIlIIIIllIlIII = 0.3125f;
            llllllllllllIllIlIlIlIIIIllIIlll = 0.6875f;
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else if (lIIlIlIIIIlllIll(llllllllllllIllIlIlIlIIIIllIllII ? 1 : 0) && lIIlIlIIIIlllIll(llllllllllllIllIlIlIlIIIIllIlIll ? 1 : 0) && lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIlIlI ? 1 : 0) && lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIllIlIIl ? 1 : 0)) {
            llllllllllllIllIlIlIlIIIIllIIlII = 0.8125f;
            llllllllllllIllIlIlIlIIIIllIIllI = 0.3125f;
            llllllllllllIllIlIlIlIIIIllIIlIl = 0.6875f;
        }
        this.setBlockBounds(llllllllllllIllIlIlIlIIIIllIlIII, 0.0f, llllllllllllIllIlIlIlIIIIllIIllI, llllllllllllIllIlIlIlIIIIllIIlll, llllllllllllIllIlIlIlIIIIllIIlII, llllllllllllIllIlIlIlIIIIllIIlIl);
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIllIlIlIlIIIIIllIlII, final CreativeTabs llllllllllllIllIlIlIlIIIIIllIlll, final List<ItemStack> llllllllllllIllIlIlIlIIIIIllIIll) {
        final String llllllllllllIllIlIlIlIIIIIlIllll;
        final float llllllllllllIllIlIlIlIIIIIllIIII = ((EnumType[])(Object)(llllllllllllIllIlIlIlIIIIIlIllll = (String)(Object)EnumType.values())).length;
        float llllllllllllIllIlIlIlIIIIIllIIIl = BlockWall.llIlIlIlIIIllI[0];
        "".length();
        if ("  ".length() > "  ".length()) {
            return;
        }
        while (!lIIlIlIIIIlllllI((int)llllllllllllIllIlIlIlIIIIIllIIIl, (int)llllllllllllIllIlIlIlIIIIIllIIII)) {
            final EnumType llllllllllllIllIlIlIlIIIIIllIlIl = llllllllllllIllIlIlIlIIIIIlIllll[llllllllllllIllIlIlIlIIIIIllIIIl];
            llllllllllllIllIlIlIlIIIIIllIIll.add(new ItemStack(llllllllllllIllIlIlIlIIIIIllIlII, BlockWall.llIlIlIlIIIllI[1], llllllllllllIllIlIlIlIIIIIllIlIl.getMetadata()));
            "".length();
            ++llllllllllllIllIlIlIlIIIIIllIIIl;
        }
    }
    
    private static boolean lIIlIlIIIIlllIlI(final int llllllllllllIllIlIlIIlllllIIIIlI) {
        return llllllllllllIllIlIlIIlllllIIIIlI != 0;
    }
    
    private static String lIIlIlIIIIllIIIl(final String llllllllllllIllIlIlIIlllllIllIIl, final String llllllllllllIllIlIlIIlllllIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIlllllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIlllllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIIlllllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIIlllllIllIll.init(BlockWall.llIlIlIlIIIllI[2], llllllllllllIllIlIlIIlllllIlllII);
            return new String(llllllllllllIllIlIlIIlllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIlllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIlllllIllIlI) {
            llllllllllllIllIlIlIIlllllIllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIlIlIlIIIIIIllIll) {
        return this.getDefaultState().withProperty(BlockWall.VARIANT, EnumType.byMetadata(llllllllllllIllIlIlIlIIIIIIllIll));
    }
    
    @Override
    public IBlockState getActualState(final IBlockState llllllllllllIllIlIlIlIIIIIIIllll, final IBlockAccess llllllllllllIllIlIlIlIIIIIIIlIlI, final BlockPos llllllllllllIllIlIlIlIIIIIIIlIIl) {
        final PropertyBool up = BlockWall.UP;
        int b;
        if (lIIlIlIIIIlllIlI(llllllllllllIllIlIlIlIIIIIIIlIlI.isAirBlock(llllllllllllIllIlIlIlIIIIIIIlIIl.up()) ? 1 : 0)) {
            b = BlockWall.llIlIlIlIIIllI[0];
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            b = BlockWall.llIlIlIlIIIllI[1];
        }
        return llllllllllllIllIlIlIlIIIIIIIllll.withProperty((IProperty<Comparable>)up, (boolean)(b != 0)).withProperty((IProperty<Comparable>)BlockWall.NORTH, this.canConnectTo(llllllllllllIllIlIlIlIIIIIIIlIlI, llllllllllllIllIlIlIlIIIIIIIlIIl.north())).withProperty((IProperty<Comparable>)BlockWall.EAST, this.canConnectTo(llllllllllllIllIlIlIlIIIIIIIlIlI, llllllllllllIllIlIlIlIIIIIIIlIIl.east())).withProperty((IProperty<Comparable>)BlockWall.SOUTH, this.canConnectTo(llllllllllllIllIlIlIlIIIIIIIlIlI, llllllllllllIllIlIlIlIIIIIIIlIIl.south())).withProperty((IProperty<Comparable>)BlockWall.WEST, this.canConnectTo(llllllllllllIllIlIlIlIIIIIIIlIlI, llllllllllllIllIlIlIlIIIIIIIlIIl.west()));
    }
    
    private static boolean lIIlIlIIIIllllll(final int llllllllllllIllIlIlIIlllllIIllIl, final int llllllllllllIllIlIlIIlllllIIllII) {
        return llllllllllllIllIlIlIIlllllIIllIl < llllllllllllIllIlIlIIlllllIIllII;
    }
    
    private static boolean lIIlIlIIIIllllII(final Object llllllllllllIllIlIlIIlllllIIIlIl, final Object llllllllllllIllIlIlIIlllllIIIlII) {
        return llllllllllllIllIlIlIIlllllIIIlIl == llllllllllllIllIlIlIIlllllIIIlII;
    }
    
    private static boolean lIIlIlIIIIlllllI(final int llllllllllllIllIlIlIIlllllIlIIIl, final int llllllllllllIllIlIlIIlllllIlIIII) {
        return llllllllllllIllIlIlIIlllllIlIIIl >= llllllllllllIllIlIlIIlllllIlIIII;
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIllIlIlIlIIIIIlIllII) {
        return llllllllllllIllIlIlIlIIIIIlIllII.getValue(BlockWall.VARIANT).getMetadata();
    }
    
    public enum EnumType implements IStringSerializable
    {
        MOSSY(EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[3]], EnumType.lIlllIIIllIlII[1], EnumType.lIlllIIIllIlII[1], EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[4]], EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[5]]);
        
        private final /* synthetic */ String name;
        
        NORMAL(EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[0]], EnumType.lIlllIIIllIlII[0], EnumType.lIlllIIIllIlII[0], EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[1]], EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[2]]);
        
        private /* synthetic */ String unlocalizedName;
        private static final /* synthetic */ String[] lIlllIIIllIIll;
        private static final /* synthetic */ int[] lIlllIIIllIlII;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        private final /* synthetic */ int meta;
        
        public static EnumType byMetadata(int llllllllllllIlllllIlIllIIllllllI) {
            if (!lIIIIIIlIllIIIlI((int)llllllllllllIlllllIlIllIIllllllI) || lIIIIIIlIllIIIIl((int)llllllllllllIlllllIlIllIIllllllI, EnumType.META_LOOKUP.length)) {
                llllllllllllIlllllIlIllIIllllllI = EnumType.lIlllIIIllIlII[0];
            }
            return EnumType.META_LOOKUP[llllllllllllIlllllIlIllIIllllllI];
        }
        
        private static String lIIIIIIlIlIIllll(final String llllllllllllIlllllIlIllIIlIllIIl, final String llllllllllllIlllllIlIllIIlIllIlI) {
            try {
                final SecretKeySpec llllllllllllIlllllIlIllIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIllIIlIllIlI.getBytes(StandardCharsets.UTF_8)), EnumType.lIlllIIIllIlII[7]), "DES");
                final Cipher llllllllllllIlllllIlIllIIlIlllIl = Cipher.getInstance("DES");
                llllllllllllIlllllIlIllIIlIlllIl.init(EnumType.lIlllIIIllIlII[2], llllllllllllIlllllIlIllIIlIllllI);
                return new String(llllllllllllIlllllIlIllIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIllIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllIlIllIIlIlllII) {
                llllllllllllIlllllIlIllIIlIlllII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static boolean lIIIIIIlIllIIIlI(final int llllllllllllIlllllIlIllIIIllIlII) {
            return llllllllllllIlllllIlIllIIIllIlII >= 0;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static boolean lIIIIIIlIllIIIll(final int llllllllllllIlllllIlIllIIIllIlll, final int llllllllllllIlllllIlIllIIIllIllI) {
            return llllllllllllIlllllIlIllIIIllIlll < llllllllllllIlllllIlIllIIIllIllI;
        }
        
        private static boolean lIIIIIIlIllIIIIl(final int llllllllllllIlllllIlIllIIIlllIll, final int llllllllllllIlllllIlIllIIIlllIlI) {
            return llllllllllllIlllllIlIllIIIlllIll >= llllllllllllIlllllIlIllIIIlllIlI;
        }
        
        private static void lIIIIIIlIlIlllIl() {
            (lIlllIIIllIIll = new String[EnumType.lIlllIIIllIlII[6]])[EnumType.lIlllIIIllIlII[0]] = lIIIIIIlIlIIllll("6KW4C407f18=", "VlwHV");
            EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[1]] = lIIIIIIlIlIlIIIl("NxgzBAgxBCUJCjE=", "TwQfd");
            EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[2]] = lIIIIIIlIlIlIIIl("Aiw0FDAA", "lCFyQ");
            EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[3]] = lIIIIIIlIlIlIIIl("Hx0aJiA=", "RRIuy");
            EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[4]] = lIIIIIIlIlIlIIll("vgQBZwQ+wXzXtl4+nL15/aNWKiJTAiRq", "llOnu");
            EnumType.lIlllIIIllIIll[EnumType.lIlllIIIllIlII[5]] = lIIIIIIlIlIIllll("znpw+1GyCag=", "vxhhS");
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static String lIIIIIIlIlIlIIIl(String llllllllllllIlllllIlIllIIlIIIllI, final String llllllllllllIlllllIlIllIIlIIlIlI) {
            llllllllllllIlllllIlIllIIlIIIllI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIlIllIIlIIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllllIlIllIIlIIlIIl = new StringBuilder();
            final char[] llllllllllllIlllllIlIllIIlIIlIII = llllllllllllIlllllIlIllIIlIIlIlI.toCharArray();
            int llllllllllllIlllllIlIllIIlIIIlll = EnumType.lIlllIIIllIlII[0];
            final int llllllllllllIlllllIlIllIIlIIIIIl = (Object)((String)llllllllllllIlllllIlIllIIlIIIllI).toCharArray();
            final boolean llllllllllllIlllllIlIllIIlIIIIII = llllllllllllIlllllIlIllIIlIIIIIl.length != 0;
            byte llllllllllllIlllllIlIllIIIllllll = (byte)EnumType.lIlllIIIllIlII[0];
            while (lIIIIIIlIllIIIll(llllllllllllIlllllIlIllIIIllllll, llllllllllllIlllllIlIllIIlIIIIII ? 1 : 0)) {
                final char llllllllllllIlllllIlIllIIlIIllII = llllllllllllIlllllIlIllIIlIIIIIl[llllllllllllIlllllIlIllIIIllllll];
                llllllllllllIlllllIlIllIIlIIlIIl.append((char)(llllllllllllIlllllIlIllIIlIIllII ^ llllllllllllIlllllIlIllIIlIIlIII[llllllllllllIlllllIlIllIIlIIIlll % llllllllllllIlllllIlIllIIlIIlIII.length]));
                "".length();
                ++llllllllllllIlllllIlIllIIlIIIlll;
                ++llllllllllllIlllllIlIllIIIllllll;
                "".length();
                if (((0x35 ^ 0x39 ^ (0x15 ^ 0x2C)) & (0x44 ^ 0x3D ^ (0x55 ^ 0x19) ^ -" ".length())) == (0xAE ^ 0xB8 ^ (0x71 ^ 0x63))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllllIlIllIIlIIlIIl);
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private EnumType(final String llllllllllllIlllllIlIllIlIIIlIll, final int llllllllllllIlllllIlIllIlIIIlIlI, final int llllllllllllIlllllIlIllIlIIIllll, final String llllllllllllIlllllIlIllIlIIIlIII, final String llllllllllllIlllllIlIllIlIIIIlll) {
            this.meta = llllllllllllIlllllIlIllIlIIIllll;
            this.name = llllllllllllIlllllIlIllIlIIIlIII;
            this.unlocalizedName = llllllllllllIlllllIlIllIlIIIIlll;
        }
        
        static {
            lIIIIIIlIllIIIII();
            lIIIIIIlIlIlllIl();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lIlllIIIllIlII[2]];
            enum$VALUES[EnumType.lIlllIIIllIlII[0]] = EnumType.NORMAL;
            enum$VALUES[EnumType.lIlllIIIllIlII[1]] = EnumType.MOSSY;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final int llllllllllllIlllllIlIllIlIIlIlll;
            final String llllllllllllIlllllIlIllIlIIllIII = (String)((EnumType[])(Object)(llllllllllllIlllllIlIllIlIIlIlll = (int)(Object)values())).length;
            String llllllllllllIlllllIlIllIlIIllIIl = (String)EnumType.lIlllIIIllIlII[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIIIIlIllIIIIl((int)llllllllllllIlllllIlIllIlIIllIIl, (int)llllllllllllIlllllIlIllIlIIllIII)) {
                final EnumType llllllllllllIlllllIlIllIlIIllIll = llllllllllllIlllllIlIllIlIIlIlll[llllllllllllIlllllIlIllIlIIllIIl];
                EnumType.META_LOOKUP[llllllllllllIlllllIlIllIlIIllIll.getMetadata()] = llllllllllllIlllllIlIllIlIIllIll;
                ++llllllllllllIlllllIlIllIlIIllIIl;
            }
        }
        
        private static String lIIIIIIlIlIlIIll(final String llllllllllllIlllllIlIllIIllIIllI, final String llllllllllllIlllllIlIllIIllIIlll) {
            try {
                final SecretKeySpec llllllllllllIlllllIlIllIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIllIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllllIlIllIIllIlIlI = Cipher.getInstance("Blowfish");
                llllllllllllIlllllIlIllIIllIlIlI.init(EnumType.lIlllIIIllIlII[2], llllllllllllIlllllIlIllIIllIlIll);
                return new String(llllllllllllIlllllIlIllIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllIlIllIIllIlIIl) {
                llllllllllllIlllllIlIllIIllIlIIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIIIIlIllIIIII() {
            (lIlllIIIllIlII = new int[8])[0] = ((0xC0 ^ 0x97) & ~(0x66 ^ 0x31));
            EnumType.lIlllIIIllIlII[1] = " ".length();
            EnumType.lIlllIIIllIlII[2] = "  ".length();
            EnumType.lIlllIIIllIlII[3] = "   ".length();
            EnumType.lIlllIIIllIlII[4] = (0xAF ^ 0xAB);
            EnumType.lIlllIIIllIlII[5] = (5 + 167 - 64 + 74 ^ 121 + 74 - 156 + 140);
            EnumType.lIlllIIIllIlII[6] = (0x11 ^ 0x17);
            EnumType.lIlllIIIllIlII[7] = (0x4A ^ 0x33 ^ (0xD4 ^ 0xA5));
        }
    }
}
