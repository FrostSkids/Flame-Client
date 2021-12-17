// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.block.state.BlockState;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;

public class BlockDirt extends Block
{
    private static final /* synthetic */ int[] llIIllllllIIIl;
    public static final /* synthetic */ PropertyEnum<DirtType> VARIANT;
    private static final /* synthetic */ String[] llIIllllllIIII;
    public static final /* synthetic */ PropertyBool SNOWY;
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIllIlllIIIllIIlllIll) {
        return llllllllllllIllIlllIIIllIIlllIll.getValue(BlockDirt.VARIANT).func_181066_d();
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIllIlllIIIllIIIIIllI) {
        DirtType llllllllllllIllIlllIIIllIIIIIlll = llllllllllllIllIlllIIIllIIIIIllI.getValue(BlockDirt.VARIANT);
        if (lIIlIIIIllIIIIII(llllllllllllIllIlllIIIllIIIIIlll, DirtType.PODZOL)) {
            llllllllllllIllIlllIIIllIIIIIlll = DirtType.DIRT;
        }
        return llllllllllllIllIlllIIIllIIIIIlll.getMetadata();
    }
    
    private static String lIIlIIIIlIllllIl(final String llllllllllllIllIlllIIIlIlllllIll, final String llllllllllllIllIlllIIIlIlllllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIIllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIlIlllllIlI.getBytes(StandardCharsets.UTF_8)), BlockDirt.llIIllllllIIIl[3]), "DES");
            final Cipher llllllllllllIllIlllIIIlIllllllll = Cipher.getInstance("DES");
            llllllllllllIllIlllIIIlIllllllll.init(BlockDirt.llIIllllllIIIl[2], llllllllllllIllIlllIIIllIIIIIIII);
            return new String(llllllllllllIllIlllIIIlIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIlIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIIlIlllllllI) {
            llllllllllllIllIlllIIIlIlllllllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIIIlIllllII(String llllllllllllIllIlllIIIlIlllIlIII, final String llllllllllllIllIlllIIIlIlllIIlll) {
        llllllllllllIllIlllIIIlIlllIlIII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIIIlIlllIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIIIlIlllIlIll = new StringBuilder();
        final char[] llllllllllllIllIlllIIIlIlllIlIlI = llllllllllllIllIlllIIIlIlllIIlll.toCharArray();
        int llllllllllllIllIlllIIIlIlllIlIIl = BlockDirt.llIIllllllIIIl[0];
        final Exception llllllllllllIllIlllIIIlIlllIIIll = (Object)((String)llllllllllllIllIlllIIIlIlllIlIII).toCharArray();
        final boolean llllllllllllIllIlllIIIlIlllIIIlI = llllllllllllIllIlllIIIlIlllIIIll.length != 0;
        double llllllllllllIllIlllIIIlIlllIIIIl = BlockDirt.llIIllllllIIIl[0];
        while (lIIlIIIIllIIIIlI((int)llllllllllllIllIlllIIIlIlllIIIIl, llllllllllllIllIlllIIIlIlllIIIlI ? 1 : 0)) {
            final char llllllllllllIllIlllIIIlIlllIlllI = llllllllllllIllIlllIIIlIlllIIIll[llllllllllllIllIlllIIIlIlllIIIIl];
            llllllllllllIllIlllIIIlIlllIlIll.append((char)(llllllllllllIllIlllIIIlIlllIlllI ^ llllllllllllIllIlllIIIlIlllIlIlI[llllllllllllIllIlllIIIlIlllIlIIl % llllllllllllIllIlllIIIlIlllIlIlI.length]));
            "".length();
            ++llllllllllllIllIlllIIIlIlllIlIIl;
            ++llllllllllllIllIlllIIIlIlllIIIIl;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIIIlIlllIlIll);
    }
    
    private static boolean lIIlIIIIllIIIIlI(final int llllllllllllIllIlllIIIlIllIlllIl, final int llllllllllllIllIlllIIIlIllIlllII) {
        return llllllllllllIllIlllIIIlIllIlllIl < llllllllllllIllIlllIIIlIllIlllII;
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIllIlllIIIllIIlIlIIl, final CreativeTabs llllllllllllIllIlllIIIllIIlIlIII, final List<ItemStack> llllllllllllIllIlllIIIllIIlIIlIl) {
        llllllllllllIllIlllIIIllIIlIIlIl.add(new ItemStack(this, BlockDirt.llIIllllllIIIl[1], DirtType.DIRT.getMetadata()));
        "".length();
        llllllllllllIllIlllIIIllIIlIIlIl.add(new ItemStack(this, BlockDirt.llIIllllllIIIl[1], DirtType.COARSE_DIRT.getMetadata()));
        "".length();
        llllllllllllIllIlllIIIllIIlIIlIl.add(new ItemStack(this, BlockDirt.llIIllllllIIIl[1], DirtType.PODZOL.getMetadata()));
        "".length();
    }
    
    @Override
    public IBlockState getActualState(IBlockState llllllllllllIllIlllIIIllIIllIIII, final IBlockAccess llllllllllllIllIlllIIIllIIllIIll, final BlockPos llllllllllllIllIlllIIIllIIlIlllI) {
        if (lIIlIIIIllIIIIII(((IBlockState)llllllllllllIllIlllIIIllIIllIIII).getValue((IProperty<DirtType>)BlockDirt.VARIANT), DirtType.PODZOL)) {
            final Block llllllllllllIllIlllIIIllIIllIIIl = llllllllllllIllIlllIIIllIIllIIll.getBlockState(llllllllllllIllIlllIIIllIIlIlllI.up()).getBlock();
            final Object o = llllllllllllIllIlllIIIllIIllIIII;
            final PropertyBool snowy = BlockDirt.SNOWY;
            int b;
            if (lIIlIIIIllIIIIIl(llllllllllllIllIlllIIIllIIllIIIl, Blocks.snow) && lIIlIIIIllIIIIIl(llllllllllllIllIlllIIIllIIllIIIl, Blocks.snow_layer)) {
                b = BlockDirt.llIIllllllIIIl[0];
                "".length();
                if ((0x1D ^ 0x19) <= -" ".length()) {
                    return null;
                }
            }
            else {
                b = BlockDirt.llIIllllllIIIl[1];
            }
            llllllllllllIllIlllIIIllIIllIIII = ((IBlockState)o).withProperty((IProperty<Comparable>)snowy, Boolean.valueOf((boolean)(b != 0)));
        }
        return (IBlockState)llllllllllllIllIlllIIIllIIllIIII;
    }
    
    private static boolean lIIlIIIIllIIIIIl(final Object llllllllllllIllIlllIIIlIllIllIIl, final Object llllllllllllIllIlllIIIlIllIllIII) {
        return llllllllllllIllIlllIIIlIllIllIIl != llllllllllllIllIlllIIIlIllIllIII;
    }
    
    protected BlockDirt() {
        super(Material.ground);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockDirt.VARIANT, DirtType.DIRT).withProperty((IProperty<Comparable>)BlockDirt.SNOWY, (boolean)(BlockDirt.llIIllllllIIIl[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIlllIIIllIIIlIIll) {
        return this.getDefaultState().withProperty(BlockDirt.VARIANT, DirtType.byMetadata(llllllllllllIllIlllIIIllIIIlIIll));
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIlllIIIllIIIIllll) {
        return llllllllllllIllIlllIIIllIIIIllll.getValue(BlockDirt.VARIANT).getMetadata();
    }
    
    private static void lIIlIIIIlIlllllI() {
        (llIIllllllIIII = new String[BlockDirt.llIIllllllIIIl[2]])[BlockDirt.llIIllllllIIIl[0]] = lIIlIIIIlIllllII("Eg88Ly4KGg==", "dnNFO");
        BlockDirt.llIIllllllIIII[BlockDirt.llIIllllllIIIl[1]] = lIIlIIIIlIllllIl("SMH3iYYrvH8=", "UFtXI");
    }
    
    @Override
    public int getDamageValue(final World llllllllllllIllIlllIIIllIIIlllll, final BlockPos llllllllllllIllIlllIIIllIIIllIlI) {
        final IBlockState llllllllllllIllIlllIIIllIIIlllIl = llllllllllllIllIlllIIIllIIIlllll.getBlockState(llllllllllllIllIlllIIIllIIIllIlI);
        int metadata;
        if (lIIlIIIIllIIIIIl(llllllllllllIllIlllIIIllIIIlllIl.getBlock(), this)) {
            metadata = BlockDirt.llIIllllllIIIl[0];
            "".length();
            if (null != null) {
                return (0x20 ^ 0x2C) & ~(0x7F ^ 0x73);
            }
        }
        else {
            metadata = llllllllllllIllIlllIIIllIIIlllIl.getValue(BlockDirt.VARIANT).getMetadata();
        }
        return metadata;
    }
    
    private static void lIIlIIIIlIllllll() {
        (llIIllllllIIIl = new int[4])[0] = ((0xF5 ^ 0x8E ^ (0xC3 ^ 0xA4)) & (0xC1 ^ 0xC5 ^ (0x3A ^ 0x22) ^ -" ".length()));
        BlockDirt.llIIllllllIIIl[1] = " ".length();
        BlockDirt.llIIllllllIIIl[2] = "  ".length();
        BlockDirt.llIIllllllIIIl[3] = (0xB2 ^ 0x9F ^ (0xF ^ 0x2A));
    }
    
    static {
        lIIlIIIIlIllllll();
        lIIlIIIIlIlllllI();
        VARIANT = PropertyEnum.create(BlockDirt.llIIllllllIIII[BlockDirt.llIIllllllIIIl[0]], DirtType.class);
        SNOWY = PropertyBool.create(BlockDirt.llIIllllllIIII[BlockDirt.llIIllllllIIIl[1]]);
    }
    
    private static boolean lIIlIIIIllIIIIII(final Object llllllllllllIllIlllIIIlIllIlIlIl, final Object llllllllllllIllIlllIIIlIllIlIlII) {
        return llllllllllllIllIlllIIIlIllIlIlIl == llllllllllllIllIlllIIIlIllIlIlII;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockDirt.llIIllllllIIIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDirt.llIIllllllIIIl[0]] = BlockDirt.VARIANT;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDirt.llIIllllllIIIl[1]] = BlockDirt.SNOWY;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    public enum DirtType implements IStringSerializable
    {
        private final /* synthetic */ String unlocalizedName;
        private static final /* synthetic */ int[] llIlIIlllIIlll;
        private final /* synthetic */ String name;
        
        PODZOL(DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[6]], DirtType.llIlIIlllIIlll[2], DirtType.llIlIIlllIIlll[2], DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[7]], MapColor.obsidianColor);
        
        private final /* synthetic */ int metadata;
        
        COARSE_DIRT(DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[3]], DirtType.llIlIIlllIIlll[1], DirtType.llIlIIlllIIlll[1], DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[4]], DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[5]], MapColor.dirtColor), 
        DIRT(DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[0]], DirtType.llIlIIlllIIlll[0], DirtType.llIlIIlllIIlll[0], DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[1]], DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[2]], MapColor.dirtColor);
        
        private static final /* synthetic */ String[] llIlIIlllIIllI;
        private final /* synthetic */ MapColor field_181067_h;
        private static final /* synthetic */ DirtType[] METADATA_LOOKUP;
        
        private static boolean lIIlIIllIIlllIll(final int llllllllllllIllIlIlllIIIIIllIlll) {
            return llllllllllllIllIlIlllIIIIIllIlll >= 0;
        }
        
        static {
            lIIlIIllIIlllIIl();
            lIIlIIllIIlllIII();
            final DirtType[] enum$VALUES = new DirtType[DirtType.llIlIIlllIIlll[3]];
            enum$VALUES[DirtType.llIlIIlllIIlll[0]] = DirtType.DIRT;
            enum$VALUES[DirtType.llIlIIlllIIlll[1]] = DirtType.COARSE_DIRT;
            enum$VALUES[DirtType.llIlIIlllIIlll[2]] = DirtType.PODZOL;
            ENUM$VALUES = enum$VALUES;
            METADATA_LOOKUP = new DirtType[values().length];
            final double llllllllllllIllIlIlllIIIlIllIIII;
            final short llllllllllllIllIlIlllIIIlIllIIIl = (short)((DirtType[])(Object)(llllllllllllIllIlIlllIIIlIllIIII = (double)(Object)values())).length;
            long llllllllllllIllIlIlllIIIlIllIIlI = DirtType.llIlIIlllIIlll[0];
            "".length();
            if (-(0x76 ^ 0x73) >= 0) {
                return;
            }
            while (!lIIlIIllIIlllIlI((int)llllllllllllIllIlIlllIIIlIllIIlI, llllllllllllIllIlIlllIIIlIllIIIl)) {
                final DirtType llllllllllllIllIlIlllIIIlIllIlII = llllllllllllIllIlIlllIIIlIllIIII[llllllllllllIllIlIlllIIIlIllIIlI];
                DirtType.METADATA_LOOKUP[llllllllllllIllIlIlllIIIlIllIlII.getMetadata()] = llllllllllllIllIlIlllIIIlIllIlII;
                ++llllllllllllIllIlIlllIIIlIllIIlI;
            }
        }
        
        private DirtType(final String llllllllllllIllIlIlllIIIlIlIIlII, final int llllllllllllIllIlIlllIIIlIlIIIll, final int llllllllllllIllIlIlllIIIlIlIlIII, final String llllllllllllIllIlIlllIIIlIlIIlll, final MapColor llllllllllllIllIlIlllIIIlIlIIllI) {
            this(llllllllllllIllIlIlllIIIlIlIIlII, llllllllllllIllIlIlllIIIlIlIIIll, llllllllllllIllIlIlllIIIlIlIlIII, llllllllllllIllIlIlllIIIlIlIIlll, llllllllllllIllIlIlllIIIlIlIIlll, llllllllllllIllIlIlllIIIlIlIIllI);
        }
        
        private static boolean lIIlIIllIIlllIlI(final int llllllllllllIllIlIlllIIIIIlllllI, final int llllllllllllIllIlIlllIIIIIllllIl) {
            return llllllllllllIllIlIlllIIIIIlllllI >= llllllllllllIllIlIlllIIIIIllllIl;
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private static String lIIlIIllIIllIllI(final String llllllllllllIllIlIlllIIIIllIlIll, final String llllllllllllIllIlIlllIIIIllIlIII) {
            try {
                final SecretKeySpec llllllllllllIllIlIlllIIIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllIIIIllIlIII.getBytes(StandardCharsets.UTF_8)), DirtType.llIlIIlllIIlll[8]), "DES");
                final Cipher llllllllllllIllIlIlllIIIIllIllIl = Cipher.getInstance("DES");
                llllllllllllIllIlIlllIIIIllIllIl.init(DirtType.llIlIIlllIIlll[2], llllllllllllIllIlIlllIIIIllIlllI);
                return new String(llllllllllllIllIlIlllIIIIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllIIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlllIIIIllIllII) {
                llllllllllllIllIlIlllIIIIllIllII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static boolean lIIlIIllIIllllII(final int llllllllllllIllIlIlllIIIIIlllIlI, final int llllllllllllIllIlIlllIIIIIlllIIl) {
            return llllllllllllIllIlIlllIIIIIlllIlI < llllllllllllIllIlIlllIIIIIlllIIl;
        }
        
        private static void lIIlIIllIIlllIII() {
            (llIlIIlllIIllI = new String[DirtType.llIlIIlllIIlll[8]])[DirtType.llIlIIlllIIlll[0]] = lIIlIIllIIllIlIl("HjwIOg==", "ZuZnu");
            DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[1]] = lIIlIIllIIllIllI("6G4kdk+kukw=", "QOvUY");
            DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[2]] = lIIlIIllIIllIlIl("NA4iJyY8Hw==", "PkDFS");
            DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[3]] = lIIlIIllIIllIllI("8PZyhu52AUcCJ2VJ+5Zmqw==", "QQtMp");
            DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[4]] = lIIlIIllIIllIlll("7MuGTsCrqGsAbJfPBls7MQ==", "Kcfya");
            DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[5]] = lIIlIIllIIllIllI("kG30GW2jeG0=", "dXTIF");
            DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[6]] = lIIlIIllIIllIllI("BLiHcpc385M=", "BWHtV");
            DirtType.llIlIIlllIIllI[DirtType.llIlIIlllIIlll[7]] = lIIlIIllIIllIlll("SHxR5FQuPkM=", "sSgOT");
        }
        
        private DirtType(final String llllllllllllIllIlIlllIIIlIIlIIlI, final int llllllllllllIllIlIlllIIIlIIlIIIl, final int llllllllllllIllIlIlllIIIlIIlIlll, final String llllllllllllIllIlIlllIIIlIIlIllI, final String llllllllllllIllIlIlllIIIlIIIlllI, final MapColor llllllllllllIllIlIlllIIIlIIIllIl) {
            this.metadata = llllllllllllIllIlIlllIIIlIIlIlll;
            this.name = llllllllllllIllIlIlllIIIlIIlIllI;
            this.unlocalizedName = llllllllllllIllIlIlllIIIlIIIlllI;
            this.field_181067_h = llllllllllllIllIlIlllIIIlIIIllIl;
        }
        
        public int getMetadata() {
            return this.metadata;
        }
        
        public static DirtType byMetadata(int llllllllllllIllIlIlllIIIIlllllll) {
            if (!lIIlIIllIIlllIll(llllllllllllIllIlIlllIIIIlllllll) || lIIlIIllIIlllIlI(llllllllllllIllIlIlllIIIIlllllll, DirtType.METADATA_LOOKUP.length)) {
                llllllllllllIllIlIlllIIIIlllllll = DirtType.llIlIIlllIIlll[0];
            }
            return DirtType.METADATA_LOOKUP[llllllllllllIllIlIlllIIIIlllllll];
        }
        
        public MapColor func_181066_d() {
            return this.field_181067_h;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static void lIIlIIllIIlllIIl() {
            (llIlIIlllIIlll = new int[9])[0] = ((0xB6 ^ 0x8C) & ~(0x78 ^ 0x42));
            DirtType.llIlIIlllIIlll[1] = " ".length();
            DirtType.llIlIIlllIIlll[2] = "  ".length();
            DirtType.llIlIIlllIIlll[3] = "   ".length();
            DirtType.llIlIIlllIIlll[4] = (119 + 18 - 45 + 74 ^ 78 + 90 - 15 + 9);
            DirtType.llIlIIlllIIlll[5] = (0xB8 ^ 0xBD);
            DirtType.llIlIIlllIIlll[6] = (0xE ^ 0x8);
            DirtType.llIlIIlllIIlll[7] = (0x3B ^ 0x3C);
            DirtType.llIlIIlllIIlll[8] = (0x37 ^ 0x11 ^ (0xB2 ^ 0x9C));
        }
        
        private static String lIIlIIllIIllIlll(final String llllllllllllIllIlIlllIIIIlIIIllI, final String llllllllllllIllIlIlllIIIIlIIIlIl) {
            try {
                final SecretKeySpec llllllllllllIllIlIlllIIIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIlllIIIIlIIlIII = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIlllIIIIlIIlIII.init(DirtType.llIlIIlllIIlll[2], llllllllllllIllIlIlllIIIIlIIlIIl);
                return new String(llllllllllllIllIlIlllIIIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllIIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlllIIIIlIIIlll) {
                llllllllllllIllIlIlllIIIIlIIIlll.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlIIllIIllIlIl(String llllllllllllIllIlIlllIIIIlIlIllI, final String llllllllllllIllIlIlllIIIIlIlIlIl) {
            llllllllllllIllIlIlllIIIIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIllIlIlllIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlllIIIIlIllIIl = new StringBuilder();
            final char[] llllllllllllIllIlIlllIIIIlIllIII = llllllllllllIllIlIlllIIIIlIlIlIl.toCharArray();
            int llllllllllllIllIlIlllIIIIlIlIlll = DirtType.llIlIIlllIIlll[0];
            final boolean llllllllllllIllIlIlllIIIIlIlIIIl = (Object)llllllllllllIllIlIlllIIIIlIlIllI.toCharArray();
            final int llllllllllllIllIlIlllIIIIlIlIIII = llllllllllllIllIlIlllIIIIlIlIIIl.length;
            char llllllllllllIllIlIlllIIIIlIIllll = (char)DirtType.llIlIIlllIIlll[0];
            while (lIIlIIllIIllllII(llllllllllllIllIlIlllIIIIlIIllll, llllllllllllIllIlIlllIIIIlIlIIII)) {
                final char llllllllllllIllIlIlllIIIIlIlllII = llllllllllllIllIlIlllIIIIlIlIIIl[llllllllllllIllIlIlllIIIIlIIllll];
                llllllllllllIllIlIlllIIIIlIllIIl.append((char)(llllllllllllIllIlIlllIIIIlIlllII ^ llllllllllllIllIlIlllIIIIlIllIII[llllllllllllIllIlIlllIIIIlIlIlll % llllllllllllIllIlIlllIIIIlIllIII.length]));
                "".length();
                ++llllllllllllIllIlIlllIIIIlIlIlll;
                ++llllllllllllIllIlIlllIIIIlIIllll;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlllIIIIlIllIIl);
        }
    }
}
