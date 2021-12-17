// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.PropertyBool;

public class BlockJukebox extends BlockContainer
{
    private static final /* synthetic */ int[] lIllIIIllIllII;
    private static final /* synthetic */ String[] lIllIIIllIlIll;
    public static final /* synthetic */ PropertyBool HAS_RECORD;
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockJukebox.lIllIIIllIllII[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockJukebox.lIllIIIllIllII[0]] = BlockJukebox.HAS_RECORD;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lllllIIIlllIlll(final int lllllllllllllIIIIIlIlIIlIIlllIIl) {
        return lllllllllllllIIIIIlIlIIlIIlllIIl == 0;
    }
    
    private void dropRecord(final World lllllllllllllIIIIIlIlIIllIIlllIl, final BlockPos lllllllllllllIIIIIlIlIIllIIlIIII, final IBlockState lllllllllllllIIIIIlIlIIllIIllIll) {
        if (lllllIIIlllIlll(lllllllllllllIIIIIlIlIIllIIlllIl.isRemote ? 1 : 0)) {
            final TileEntity lllllllllllllIIIIIlIlIIllIIllIlI = lllllllllllllIIIIIlIlIIllIIlllIl.getTileEntity(lllllllllllllIIIIIlIlIIllIIlIIII);
            if (lllllIIIlllIllI((lllllllllllllIIIIIlIlIIllIIllIlI instanceof TileEntityJukebox) ? 1 : 0)) {
                final TileEntityJukebox lllllllllllllIIIIIlIlIIllIIllIIl = (TileEntityJukebox)lllllllllllllIIIIIlIlIIllIIllIlI;
                final ItemStack lllllllllllllIIIIIlIlIIllIIllIII = lllllllllllllIIIIIlIlIIllIIllIIl.getRecord();
                if (lllllIIIllllIII(lllllllllllllIIIIIlIlIIllIIllIII)) {
                    lllllllllllllIIIIIlIlIIllIIlllIl.playAuxSFX(BlockJukebox.lIllIIIllIllII[3], lllllllllllllIIIIIlIlIIllIIlIIII, BlockJukebox.lIllIIIllIllII[0]);
                    lllllllllllllIIIIIlIlIIllIIlllIl.playRecord(lllllllllllllIIIIIlIlIIllIIlIIII, null);
                    lllllllllllllIIIIIlIlIIllIIllIIl.setRecord(null);
                    final float lllllllllllllIIIIIlIlIIllIIlIlll = 0.7f;
                    final double lllllllllllllIIIIIlIlIIllIIlIllI = lllllllllllllIIIIIlIlIIllIIlllIl.rand.nextFloat() * lllllllllllllIIIIIlIlIIllIIlIlll + (1.0f - lllllllllllllIIIIIlIlIIllIIlIlll) * 0.5;
                    final double lllllllllllllIIIIIlIlIIllIIlIlIl = lllllllllllllIIIIIlIlIIllIIlllIl.rand.nextFloat() * lllllllllllllIIIIIlIlIIllIIlIlll + (1.0f - lllllllllllllIIIIIlIlIIllIIlIlll) * 0.2 + 0.6;
                    final double lllllllllllllIIIIIlIlIIllIIlIlII = lllllllllllllIIIIIlIlIIllIIlllIl.rand.nextFloat() * lllllllllllllIIIIIlIlIIllIIlIlll + (1.0f - lllllllllllllIIIIIlIlIIllIIlIlll) * 0.5;
                    final ItemStack lllllllllllllIIIIIlIlIIllIIlIIll = lllllllllllllIIIIIlIlIIllIIllIII.copy();
                    final EntityItem lllllllllllllIIIIIlIlIIllIIlIIlI = new EntityItem(lllllllllllllIIIIIlIlIIllIIlllIl, lllllllllllllIIIIIlIlIIllIIlIIII.getX() + lllllllllllllIIIIIlIlIIllIIlIllI, lllllllllllllIIIIIlIlIIllIIlIIII.getY() + lllllllllllllIIIIIlIlIIllIIlIlIl, lllllllllllllIIIIIlIlIIllIIlIIII.getZ() + lllllllllllllIIIIIlIlIIllIIlIlII, lllllllllllllIIIIIlIlIIllIIlIIll);
                    lllllllllllllIIIIIlIlIIllIIlIIlI.setDefaultPickupDelay();
                    lllllllllllllIIIIIlIlIIllIIlllIl.spawnEntityInWorld(lllllllllllllIIIIIlIlIIllIIlIIlI);
                    "".length();
                }
            }
        }
    }
    
    static {
        lllllIIIlllIlIl();
        lllllIIIlllIlII();
        HAS_RECORD = PropertyBool.create(BlockJukebox.lIllIIIllIlIll[BlockJukebox.lIllIIIllIllII[0]]);
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIIIIlIlIIlIlllllIl, final BlockPos lllllllllllllIIIIIlIlIIlIlllllII, final IBlockState lllllllllllllIIIIIlIlIIlIlllllll) {
        this.dropRecord(lllllllllllllIIIIIlIlIIlIlllllIl, lllllllllllllIIIIIlIlIIlIlllllII, lllllllllllllIIIIIlIlIIlIlllllll);
        super.breakBlock(lllllllllllllIIIIIlIlIIlIlllllIl, lllllllllllllIIIIIlIlIIlIlllllII, lllllllllllllIIIIIlIlIIlIlllllll);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIIIIlIlIIlIllIlIIl, final int lllllllllllllIIIIIlIlIIlIllIlIII) {
        return new TileEntityJukebox();
    }
    
    private static String lllllIIIlllIIll(final String lllllllllllllIIIIIlIlIIlIlIIIlII, final String lllllllllllllIIIIIlIlIIlIlIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIlIIlIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIlIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), BlockJukebox.lIllIIIllIllII[5]), "DES");
            final Cipher lllllllllllllIIIIIlIlIIlIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIIlIlIIlIlIIIllI.init(BlockJukebox.lIllIIIllIllII[1], lllllllllllllIIIIIlIlIIlIlIIIlll);
            return new String(lllllllllllllIIIIIlIlIIlIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIlIIlIlIIIlIl) {
            lllllllllllllIIIIIlIlIIlIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getComparatorInputOverride(final World lllllllllllllIIIIIlIlIIlIlIlllIl, final BlockPos lllllllllllllIIIIIlIlIIlIlIlllII) {
        final TileEntity lllllllllllllIIIIIlIlIIlIlIlllll = lllllllllllllIIIIIlIlIIlIlIlllIl.getTileEntity(lllllllllllllIIIIIlIlIIlIlIlllII);
        if (lllllIIIlllIllI((lllllllllllllIIIIIlIlIIlIlIlllll instanceof TileEntityJukebox) ? 1 : 0)) {
            final ItemStack lllllllllllllIIIIIlIlIIlIlIllllI = ((TileEntityJukebox)lllllllllllllIIIIIlIlIIlIlIlllll).getRecord();
            if (lllllIIIllllIII(lllllllllllllIIIIIlIlIIlIlIllllI)) {
                return Item.getIdFromItem(lllllllllllllIIIIIlIlIIlIlIllllI.getItem()) + BlockJukebox.lIllIIIllIllII[2] - Item.getIdFromItem(Items.record_13);
            }
        }
        return BlockJukebox.lIllIIIllIllII[0];
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockJukebox.lIllIIIllIllII[2] != 0;
    }
    
    private static boolean lllllIIIlllIllI(final int lllllllllllllIIIIIlIlIIlIIlllIll) {
        return lllllllllllllIIIIIlIlIIlIIlllIll != 0;
    }
    
    private static boolean lllllIIIllllIII(final Object lllllllllllllIIIIIlIlIIlIIllllIl) {
        return lllllllllllllIIIIIlIlIIlIIllllIl != null;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIIlIlIIlIlIlIIII) {
        int n;
        if (lllllIIIlllIllI(((boolean)lllllllllllllIIIIIlIlIIlIlIlIIII.getValue((IProperty<Boolean>)BlockJukebox.HAS_RECORD)) ? 1 : 0)) {
            n = BlockJukebox.lIllIIIllIllII[2];
            "".length();
            if ((0x78 ^ 0x8 ^ (0xF0 ^ 0x85)) == 0x0) {
                return (88 + 103 - 69 + 17 ^ 112 + 8 + 45 + 14) & (0xE0 ^ 0x9D ^ (0x65 ^ 0x20) ^ -" ".length());
            }
        }
        else {
            n = BlockJukebox.lIllIIIllIllII[0];
        }
        return n;
    }
    
    private static void lllllIIIlllIlII() {
        (lIllIIIllIlIll = new String[BlockJukebox.lIllIIIllIllII[2]])[BlockJukebox.lIllIIIllIllII[0]] = lllllIIIlllIIll("prlGRvTebrCknt4+MdqRiA==", "zlqLG");
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIIlIlIIlIlIlIlIl) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool has_RECORD = BlockJukebox.HAS_RECORD;
        int b;
        if (lllllIIIllllIIl(lllllllllllllIIIIIlIlIIlIlIlIlIl)) {
            b = BlockJukebox.lIllIIIllIllII[2];
            "".length();
            if (((0x0 ^ 0x29) & ~(0x15 ^ 0x3C)) >= "  ".length()) {
                return null;
            }
        }
        else {
            b = BlockJukebox.lIllIIIllIllII[0];
        }
        return defaultState.withProperty((IProperty<Comparable>)has_RECORD, (boolean)(b != 0));
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIIIlIlIIlllIIIlIl, final BlockPos lllllllllllllIIIIIlIlIIlllIIIlII, IBlockState lllllllllllllIIIIIlIlIIlllIIIIll, final EntityPlayer lllllllllllllIIIIIlIlIIlllIIIIlI, final EnumFacing lllllllllllllIIIIIlIlIIlllIIIIIl, final float lllllllllllllIIIIIlIlIIlllIIIIII, final float lllllllllllllIIIIIlIlIIllIllllll, final float lllllllllllllIIIIIlIlIIllIlllllI) {
        if (lllllIIIlllIllI(((boolean)lllllllllllllIIIIIlIlIIlllIIIIll.getValue((IProperty<Boolean>)BlockJukebox.HAS_RECORD)) ? 1 : 0)) {
            this.dropRecord(lllllllllllllIIIIIlIlIIlllIIIlIl, lllllllllllllIIIIIlIlIIlllIIIlII, lllllllllllllIIIIIlIlIIlllIIIIll);
            lllllllllllllIIIIIlIlIIlllIIIIll = lllllllllllllIIIIIlIlIIlllIIIIll.withProperty((IProperty<Comparable>)BlockJukebox.HAS_RECORD, (boolean)(BlockJukebox.lIllIIIllIllII[0] != 0));
            lllllllllllllIIIIIlIlIIlllIIIlIl.setBlockState(lllllllllllllIIIIIlIlIIlllIIIlII, lllllllllllllIIIIIlIlIIlllIIIIll, BlockJukebox.lIllIIIllIllII[1]);
            "".length();
            return BlockJukebox.lIllIIIllIllII[2] != 0;
        }
        return BlockJukebox.lIllIIIllIllII[0] != 0;
    }
    
    @Override
    public int getRenderType() {
        return BlockJukebox.lIllIIIllIllII[4];
    }
    
    private static void lllllIIIlllIlIl() {
        (lIllIIIllIllII = new int[6])[0] = ((0xD4 ^ 0xB6 ^ (0x70 ^ 0x52)) & (175 + 23 + 6 + 6 ^ 125 + 106 - 228 + 143 ^ -" ".length()));
        BlockJukebox.lIllIIIllIllII[1] = "  ".length();
        BlockJukebox.lIllIIIllIllII[2] = " ".length();
        BlockJukebox.lIllIIIllIllII[3] = (0xFFFFDFED & 0x23FF);
        BlockJukebox.lIllIIIllIllII[4] = "   ".length();
        BlockJukebox.lIllIIIllIllII[5] = (0x7B ^ 0x21 ^ (0xE1 ^ 0xB3));
    }
    
    public void insertRecord(final World lllllllllllllIIIIIlIlIIllIlIlllI, final BlockPos lllllllllllllIIIIIlIlIIllIllIIlI, final IBlockState lllllllllllllIIIIIlIlIIllIlIllII, final ItemStack lllllllllllllIIIIIlIlIIllIllIIII) {
        if (lllllIIIlllIlll(lllllllllllllIIIIIlIlIIllIlIlllI.isRemote ? 1 : 0)) {
            final TileEntity lllllllllllllIIIIIlIlIIllIlIllll = lllllllllllllIIIIIlIlIIllIlIlllI.getTileEntity(lllllllllllllIIIIIlIlIIllIllIIlI);
            if (lllllIIIlllIllI((lllllllllllllIIIIIlIlIIllIlIllll instanceof TileEntityJukebox) ? 1 : 0)) {
                ((TileEntityJukebox)lllllllllllllIIIIIlIlIIllIlIllll).setRecord(new ItemStack(lllllllllllllIIIIIlIlIIllIllIIII.getItem(), BlockJukebox.lIllIIIllIllII[2], lllllllllllllIIIIIlIlIIllIllIIII.getMetadata()));
                lllllllllllllIIIIIlIlIIllIlIlllI.setBlockState(lllllllllllllIIIIIlIlIIllIllIIlI, lllllllllllllIIIIIlIlIIllIlIllII.withProperty((IProperty<Comparable>)BlockJukebox.HAS_RECORD, (boolean)(BlockJukebox.lIllIIIllIllII[2] != 0)), BlockJukebox.lIllIIIllIllII[1]);
                "".length();
            }
        }
    }
    
    protected BlockJukebox() {
        super(Material.wood, MapColor.dirtColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockJukebox.HAS_RECORD, (boolean)(BlockJukebox.lIllIIIllIllII[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static boolean lllllIIIllllIIl(final int lllllllllllllIIIIIlIlIIlIIllIlll) {
        return lllllllllllllIIIIIlIlIIlIIllIlll > 0;
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIIIIIlIlIIlIllIlllI, final BlockPos lllllllllllllIIIIIlIlIIlIlllIIll, final IBlockState lllllllllllllIIIIIlIlIIlIllIllII, final float lllllllllllllIIIIIlIlIIlIlllIIIl, final int lllllllllllllIIIIIlIlIIlIlllIIII) {
        if (lllllIIIlllIlll(lllllllllllllIIIIIlIlIIlIllIlllI.isRemote ? 1 : 0)) {
            super.dropBlockAsItemWithChance(lllllllllllllIIIIIlIlIIlIllIlllI, lllllllllllllIIIIIlIlIIlIlllIIll, lllllllllllllIIIIIlIlIIlIllIllII, lllllllllllllIIIIIlIlIIlIlllIIIl, BlockJukebox.lIllIIIllIllII[0]);
        }
    }
    
    public static class TileEntityJukebox extends TileEntity
    {
        private static final /* synthetic */ String[] lllIIIlIIIlIll;
        private /* synthetic */ ItemStack record;
        private static final /* synthetic */ int[] lllIIIlIIlIIII;
        
        private static boolean lIIlllIlIIllIlll(final int llllllllllllIllIIIIIllIIIllllllI) {
            return llllllllllllIllIIIIIllIIIllllllI > 0;
        }
        
        @Override
        public void writeToNBT(final NBTTagCompound llllllllllllIllIIIIIllIIlIllIllI) {
            super.writeToNBT(llllllllllllIllIIIIIllIIlIllIllI);
            if (lIIlllIlIIlllIII(this.getRecord())) {
                llllllllllllIllIIIIIllIIlIllIllI.setTag(TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[5]], this.getRecord().writeToNBT(new NBTTagCompound()));
            }
        }
        
        public void setRecord(final ItemStack llllllllllllIllIIIIIllIIlIlIllIl) {
            this.record = llllllllllllIllIIIIIllIIlIlIllIl;
            this.markDirty();
        }
        
        private static String lIIlllIlIIlIlllI(String llllllllllllIllIIIIIllIIlIIlllIl, final String llllllllllllIllIIIIIllIIlIIlllII) {
            llllllllllllIllIIIIIllIIlIIlllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIllIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIIIllIIlIlIIIII = new StringBuilder();
            final char[] llllllllllllIllIIIIIllIIlIIlllll = llllllllllllIllIIIIIllIIlIIlllII.toCharArray();
            int llllllllllllIllIIIIIllIIlIIllllI = TileEntityJukebox.lllIIIlIIlIIII[0];
            final long llllllllllllIllIIIIIllIIlIIllIII = (Object)llllllllllllIllIIIIIllIIlIIlllIl.toCharArray();
            final short llllllllllllIllIIIIIllIIlIIlIlll = (short)llllllllllllIllIIIIIllIIlIIllIII.length;
            char llllllllllllIllIIIIIllIIlIIlIllI = (char)TileEntityJukebox.lllIIIlIIlIIII[0];
            while (lIIlllIlIIlllIIl(llllllllllllIllIIIIIllIIlIIlIllI, llllllllllllIllIIIIIllIIlIIlIlll)) {
                final char llllllllllllIllIIIIIllIIlIlIIIll = llllllllllllIllIIIIIllIIlIIllIII[llllllllllllIllIIIIIllIIlIIlIllI];
                llllllllllllIllIIIIIllIIlIlIIIII.append((char)(llllllllllllIllIIIIIllIIlIlIIIll ^ llllllllllllIllIIIIIllIIlIIlllll[llllllllllllIllIIIIIllIIlIIllllI % llllllllllllIllIIIIIllIIlIIlllll.length]));
                "".length();
                ++llllllllllllIllIIIIIllIIlIIllllI;
                ++llllllllllllIllIIIIIllIIlIIlIllI;
                "".length();
                if (-" ".length() == "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIIIllIIlIlIIIII);
        }
        
        public ItemStack getRecord() {
            return this.record;
        }
        
        private static void lIIlllIlIIllIIIl() {
            (lllIIIlIIIlIll = new String[TileEntityJukebox.lllIIIlIIlIIII[6]])[TileEntityJukebox.lllIIIlIIlIIII[0]] = lIIlllIlIIlIlllI("JxQTKxkROAQhBg==", "uqpDk");
            TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[2]] = lIIlllIlIIlIllll("4yWkL2Vn6mjjGKhspVNquw==", "gSrlb");
            TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[3]] = lIIlllIlIIlIlllI("Nj8FDCcA", "dZfcU");
            TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[4]] = lIIlllIlIIlIllll("PJjjtMpyPFk=", "plyyC");
            TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[5]] = lIIlllIlIIlIllll("SYNZyc8DS0PAdTA3+T3lwg==", "vNHEP");
        }
        
        private static String lIIlllIlIIlIllll(final String llllllllllllIllIIIIIllIIlIIIlIll, final String llllllllllllIllIIIIIllIIlIIIlIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIIIIllIIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIIllIIlIIIllll = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIIllIIlIIIllll.init(TileEntityJukebox.lllIIIlIIlIIII[3], llllllllllllIllIIIIIllIIlIIlIIII);
                return new String(llllllllllllIllIIIIIllIIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllIIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIIllIIlIIIlllI) {
                llllllllllllIllIIIIIllIIlIIIlllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlllIlIIlllIII(final Object llllllllllllIllIIIIIllIIlIIIIIlI) {
            return llllllllllllIllIIIIIllIIlIIIIIlI != null;
        }
        
        static {
            lIIlllIlIIllIlIl();
            lIIlllIlIIllIIIl();
        }
        
        private static boolean lIIlllIlIIllIllI(final int llllllllllllIllIIIIIllIIlIIIIIII) {
            return llllllllllllIllIIIIIllIIlIIIIIII != 0;
        }
        
        private static boolean lIIlllIlIIlllIIl(final int llllllllllllIllIIIIIllIIlIIIIlIl, final int llllllllllllIllIIIIIllIIlIIIIlII) {
            return llllllllllllIllIIIIIllIIlIIIIlIl < llllllllllllIllIIIIIllIIlIIIIlII;
        }
        
        @Override
        public void readFromNBT(final NBTTagCompound llllllllllllIllIIIIIllIIlIlllllI) {
            super.readFromNBT(llllllllllllIllIIIIIllIIlIlllllI);
            if (lIIlllIlIIllIllI(llllllllllllIllIIIIIllIIlIlllllI.hasKey(TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[0]], TileEntityJukebox.lllIIIlIIlIIII[1]) ? 1 : 0)) {
                this.setRecord(ItemStack.loadItemStackFromNBT(llllllllllllIllIIIIIllIIlIlllllI.getCompoundTag(TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[2]])));
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else if (lIIlllIlIIllIlll(llllllllllllIllIIIIIllIIlIlllllI.getInteger(TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[3]]))) {
                this.setRecord(new ItemStack(Item.getItemById(llllllllllllIllIIIIIllIIlIlllllI.getInteger(TileEntityJukebox.lllIIIlIIIlIll[TileEntityJukebox.lllIIIlIIlIIII[4]])), TileEntityJukebox.lllIIIlIIlIIII[2], TileEntityJukebox.lllIIIlIIlIIII[0]));
            }
        }
        
        private static void lIIlllIlIIllIlIl() {
            (lllIIIlIIlIIII = new int[7])[0] = ((0x84 ^ 0x8C) & ~(0x3 ^ 0xB));
            TileEntityJukebox.lllIIIlIIlIIII[1] = (0x7 ^ 0xD);
            TileEntityJukebox.lllIIIlIIlIIII[2] = " ".length();
            TileEntityJukebox.lllIIIlIIlIIII[3] = "  ".length();
            TileEntityJukebox.lllIIIlIIlIIII[4] = "   ".length();
            TileEntityJukebox.lllIIIlIIlIIII[5] = (0x84 ^ 0x80);
            TileEntityJukebox.lllIIIlIIlIIII[6] = (0x64 ^ 0x22 ^ (0xCE ^ 0x8D));
        }
    }
}
