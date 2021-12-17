// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.init.Blocks;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IInteractionObject;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import com.google.common.base.Predicate;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.entity.item.EntityFallingBlock;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.properties.PropertyDirection;

public class BlockAnvil extends BlockFalling
{
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ int[] lllIlIIIlllIII;
    public static final /* synthetic */ PropertyInteger DAMAGE;
    private static final /* synthetic */ String[] lllIlIIIllIlll;
    
    private static void lIlIIIIlllIllllI() {
        (lllIlIIIlllIII = new int[7])[0] = ((0x51 ^ 0x7F) & ~(0x86 ^ 0xA8));
        BlockAnvil.lllIlIIIlllIII[1] = " ".length();
        BlockAnvil.lllIlIIIlllIII[2] = "  ".length();
        BlockAnvil.lllIlIIIlllIII[3] = (0xFFFF9FFE & 0x63FF);
        BlockAnvil.lllIlIIIlllIII[4] = "   ".length();
        BlockAnvil.lllIlIIIlllIII[5] = (0x12 ^ 0x1D);
        BlockAnvil.lllIlIIIlllIII[6] = (0xBD ^ 0xB5);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIlllIIIlllIIlIllIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockAnvil.FACING, EnumFacing.getHorizontal(llllllllllllIlIlllIIIlllIIlIllIl & BlockAnvil.lllIlIIIlllIII[4])).withProperty((IProperty<Comparable>)BlockAnvil.DAMAGE, (llllllllllllIlIlllIIIlllIIlIllIl & BlockAnvil.lllIlIIIlllIII[5]) >> BlockAnvil.lllIlIIIlllIII[2]);
    }
    
    private static boolean lIlIIIIllllIIIII(final Object llllllllllllIlIlllIIIllIllllIlIl, final Object llllllllllllIlIlllIIIllIllllIlII) {
        return llllllllllllIlIlllIIIllIllllIlIl == llllllllllllIlIlllIIIllIllllIlII;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockAnvil.lllIlIIIlllIII[0] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockAnvil.lllIlIIIlllIII[0] != 0;
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess llllllllllllIlIlllIIIlllIIllIlll, final BlockPos llllllllllllIlIlllIIIlllIIllIllI, final EnumFacing llllllllllllIlIlllIIIlllIIllIlIl) {
        return BlockAnvil.lllIlIIIlllIII[1] != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockAnvil.lllIlIIIlllIII[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockAnvil.lllIlIIIlllIII[0]] = BlockAnvil.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockAnvil.lllIlIIIlllIII[1]] = BlockAnvil.DAMAGE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlIlllIIIlllIlIllIIl) {
        return llllllllllllIlIlllIIIlllIlIllIIl.getValue((IProperty<Integer>)BlockAnvil.DAMAGE);
    }
    
    private static void lIlIIIIlllIlllIl() {
        (lllIlIIIllIlll = new String[BlockAnvil.lllIlIIIlllIII[2]])[BlockAnvil.lllIlIIIlllIII[0]] = lIlIIIIlllIllIll("ECo0BTYR", "vKWlX");
        BlockAnvil.lllIlIIIllIlll[BlockAnvil.lllIlIIIlllIII[1]] = lIlIIIIlllIlllII("xQJtAOAtfXU=", "PRUUa");
    }
    
    private static String lIlIIIIlllIlllII(final String llllllllllllIlIlllIIIlllIIIIIIIl, final String llllllllllllIlIlllIIIllIlllllllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIIlllIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIIllIlllllllI.getBytes(StandardCharsets.UTF_8)), BlockAnvil.lllIlIIIlllIII[6]), "DES");
            final Cipher llllllllllllIlIlllIIIlllIIIIIIll = Cipher.getInstance("DES");
            llllllllllllIlIlllIIIlllIIIIIIll.init(BlockAnvil.lllIlIIIlllIII[2], llllllllllllIlIlllIIIlllIIIIIlII);
            return new String(llllllllllllIlIlllIIIlllIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIIlllIIIIIIlI) {
            llllllllllllIlIlllIIIlllIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void onStartFalling(final EntityFallingBlock llllllllllllIlIlllIIIlllIlIIIIIl) {
        llllllllllllIlIlllIIIlllIlIIIIIl.setHurtEntities((boolean)(BlockAnvil.lllIlIIIlllIII[1] != 0));
    }
    
    private static boolean lIlIIIIlllIlllll(final int llllllllllllIlIlllIIIllIllllIIlI) {
        return llllllllllllIlIlllIIIllIllllIIlI == 0;
    }
    
    @Override
    public IBlockState getStateForEntityRender(final IBlockState llllllllllllIlIlllIIIlllIIllIIlI) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockAnvil.FACING, EnumFacing.SOUTH);
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIlIlllIIIlllIlIIIlIl, final CreativeTabs llllllllllllIlIlllIIIlllIlIIIlll, final List<ItemStack> llllllllllllIlIlllIIIlllIlIIIlII) {
        llllllllllllIlIlllIIIlllIlIIIlII.add(new ItemStack(llllllllllllIlIlllIIIlllIlIIIlIl, BlockAnvil.lllIlIIIlllIII[1], BlockAnvil.lllIlIIIlllIII[0]));
        "".length();
        llllllllllllIlIlllIIIlllIlIIIlII.add(new ItemStack(llllllllllllIlIlllIIIlllIlIIIlIl, BlockAnvil.lllIlIIIlllIII[1], BlockAnvil.lllIlIIIlllIII[1]));
        "".length();
        llllllllllllIlIlllIIIlllIlIIIlII.add(new ItemStack(llllllllllllIlIlllIIIlllIlIIIlIl, BlockAnvil.lllIlIIIlllIII[1], BlockAnvil.lllIlIIIlllIII[2]));
        "".length();
    }
    
    protected BlockAnvil() {
        super(Material.anvil);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockAnvil.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockAnvil.DAMAGE, BlockAnvil.lllIlIIIlllIII[0]));
        this.setLightOpacity(BlockAnvil.lllIlIIIlllIII[0]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    static {
        lIlIIIIlllIllllI();
        lIlIIIIlllIlllIl();
        FACING = PropertyDirection.create(BlockAnvil.lllIlIIIllIlll[BlockAnvil.lllIlIIIlllIII[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
        DAMAGE = PropertyInteger.create(BlockAnvil.lllIlIIIllIlll[BlockAnvil.lllIlIIIlllIII[1]], BlockAnvil.lllIlIIIlllIII[0], BlockAnvil.lllIlIIIlllIII[2]);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIlllIIIlllIIlIIlll) {
        int llllllllllllIlIlllIIIlllIIlIIllI = BlockAnvil.lllIlIIIlllIII[0];
        llllllllllllIlIlllIIIlllIIlIIllI |= llllllllllllIlIlllIIIlllIIlIIlll.getValue((IProperty<EnumFacing>)BlockAnvil.FACING).getHorizontalIndex();
        llllllllllllIlIlllIIIlllIIlIIllI |= llllllllllllIlIlllIIIlllIIlIIlll.getValue((IProperty<Integer>)BlockAnvil.DAMAGE) << BlockAnvil.lllIlIIIlllIII[2];
        return llllllllllllIlIlllIIIlllIIlIIllI;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIlIlllIIIlllIlllIIll, final BlockPos llllllllllllIlIlllIIIlllIlllllII, final EnumFacing llllllllllllIlIlllIIIlllIlllIIIl, final float llllllllllllIlIlllIIIlllIllllIlI, final float llllllllllllIlIlllIIIlllIllIllll, final float llllllllllllIlIlllIIIlllIllllIII, final int llllllllllllIlIlllIIIlllIlllIlll, final EntityLivingBase llllllllllllIlIlllIIIlllIlllIllI) {
        final EnumFacing llllllllllllIlIlllIIIlllIlllIlIl = llllllllllllIlIlllIIIlllIlllIllI.getHorizontalFacing().rotateY();
        return super.onBlockPlaced(llllllllllllIlIlllIIIlllIlllIIll, llllllllllllIlIlllIIIlllIlllllII, llllllllllllIlIlllIIIlllIlllIIIl, llllllllllllIlIlllIIIlllIllllIlI, llllllllllllIlIlllIIIlllIllIllll, llllllllllllIlIlllIIIlllIllllIII, llllllllllllIlIlllIIIlllIlllIlll, llllllllllllIlIlllIIIlllIlllIllI).withProperty((IProperty<Comparable>)BlockAnvil.FACING, llllllllllllIlIlllIIIlllIlllIlIl).withProperty((IProperty<Comparable>)BlockAnvil.DAMAGE, llllllllllllIlIlllIIIlllIlllIlll >> BlockAnvil.lllIlIIIlllIII[2]);
    }
    
    private static String lIlIIIIlllIllIll(String llllllllllllIlIlllIIIlllIIIlIIIl, final String llllllllllllIlIlllIIIlllIIIlIlIl) {
        llllllllllllIlIlllIIIlllIIIlIIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIIlllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIIlllIIIlIlII = new StringBuilder();
        final char[] llllllllllllIlIlllIIIlllIIIlIIll = llllllllllllIlIlllIIIlllIIIlIlIl.toCharArray();
        int llllllllllllIlIlllIIIlllIIIlIIlI = BlockAnvil.lllIlIIIlllIII[0];
        final double llllllllllllIlIlllIIIlllIIIIllII = (Object)llllllllllllIlIlllIIIlllIIIlIIIl.toCharArray();
        final short llllllllllllIlIlllIIIlllIIIIlIll = (short)llllllllllllIlIlllIIIlllIIIIllII.length;
        float llllllllllllIlIlllIIIlllIIIIlIlI = BlockAnvil.lllIlIIIlllIII[0];
        while (lIlIIIIllllIIIIl((int)llllllllllllIlIlllIIIlllIIIIlIlI, llllllllllllIlIlllIIIlllIIIIlIll)) {
            final char llllllllllllIlIlllIIIlllIIIlIlll = llllllllllllIlIlllIIIlllIIIIllII[llllllllllllIlIlllIIIlllIIIIlIlI];
            llllllllllllIlIlllIIIlllIIIlIlII.append((char)(llllllllllllIlIlllIIIlllIIIlIlll ^ llllllllllllIlIlllIIIlllIIIlIIll[llllllllllllIlIlllIIIlllIIIlIIlI % llllllllllllIlIlllIIIlllIIIlIIll.length]));
            "".length();
            ++llllllllllllIlIlllIIIlllIIIlIIlI;
            ++llllllllllllIlIlllIIIlllIIIIlIlI;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIIlllIIIlIlII);
    }
    
    private static boolean lIlIIIIllllIIIIl(final int llllllllllllIlIlllIIIllIlllllIIl, final int llllllllllllIlIlllIIIllIlllllIII) {
        return llllllllllllIlIlllIIIllIlllllIIl < llllllllllllIlIlllIIIllIlllllIII;
    }
    
    @Override
    public void onEndFalling(final World llllllllllllIlIlllIIIlllIIllllII, final BlockPos llllllllllllIlIlllIIIlllIIlllIll) {
        llllllllllllIlIlllIIIlllIIllllII.playAuxSFX(BlockAnvil.lllIlIIIlllIII[3], llllllllllllIlIlllIIIlllIIlllIll, BlockAnvil.lllIlIIIlllIII[0]);
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIlIlllIIIlllIllIIllI, final BlockPos llllllllllllIlIlllIIIlllIllIIlIl, final IBlockState llllllllllllIlIlllIIIlllIllIIlII, final EntityPlayer llllllllllllIlIlllIIIlllIllIIIll, final EnumFacing llllllllllllIlIlllIIIlllIllIIIlI, final float llllllllllllIlIlllIIIlllIllIIIIl, final float llllllllllllIlIlllIIIlllIllIIIII, final float llllllllllllIlIlllIIIlllIlIlllll) {
        if (lIlIIIIlllIlllll(llllllllllllIlIlllIIIlllIllIIllI.isRemote ? 1 : 0)) {
            llllllllllllIlIlllIIIlllIllIIIll.displayGui(new Anvil(llllllllllllIlIlllIIIlllIllIIllI, llllllllllllIlIlllIIIlllIllIIlIl));
        }
        return BlockAnvil.lllIlIIIlllIII[1] != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIlIlllIIIlllIlIIlllI, final BlockPos llllllllllllIlIlllIIIlllIlIlIIIl) {
        final EnumFacing llllllllllllIlIlllIIIlllIlIlIIII = llllllllllllIlIlllIIIlllIlIIlllI.getBlockState(llllllllllllIlIlllIIIlllIlIlIIIl).getValue((IProperty<EnumFacing>)BlockAnvil.FACING);
        if (lIlIIIIllllIIIII(llllllllllllIlIlllIIIlllIlIlIIII.getAxis(), EnumFacing.Axis.X)) {
            this.setBlockBounds(0.0f, 0.0f, 0.125f, 1.0f, 1.0f, 0.875f);
            "".length();
            if (((0x8B ^ 0xA6 ^ (0x76 ^ 0x51)) & (0x3D ^ 0x22 ^ (0x12 ^ 0x7) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.125f, 0.0f, 0.0f, 0.875f, 1.0f, 1.0f);
        }
    }
    
    public static class Anvil implements IInteractionObject
    {
        private final /* synthetic */ World world;
        private static final /* synthetic */ String[] lIIIlllIlIlIlI;
        private final /* synthetic */ BlockPos position;
        private static final /* synthetic */ int[] lIIIlllIlIllII;
        
        private static void llIIIllIlIlIlIl() {
            (lIIIlllIlIllII = new int[5])[0] = ((0x2B ^ 0x68) & ~(0x0 ^ 0x43));
            Anvil.lIIIlllIlIllII[1] = " ".length();
            Anvil.lIIIlllIlIllII[2] = "  ".length();
            Anvil.lIIIlllIlIllII[3] = "   ".length();
            Anvil.lIIIlllIlIllII[4] = (0x4B ^ 0x43);
        }
        
        @Override
        public String getGuiID() {
            return Anvil.lIIIlllIlIlIlI[Anvil.lIIIlllIlIllII[2]];
        }
        
        @Override
        public boolean hasCustomName() {
            return Anvil.lIIIlllIlIllII[0] != 0;
        }
        
        @Override
        public String getName() {
            return Anvil.lIIIlllIlIlIlI[Anvil.lIIIlllIlIllII[0]];
        }
        
        private static String llIIIllIlIlIIII(final String lllllllllllllIIlllllIIIlIlIlIlll, final String lllllllllllllIIlllllIIIlIlIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIIlllllIIIlIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIIlIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlllllIIIlIlIllIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIlllllIIIlIlIllIIl.init(Anvil.lIIIlllIlIllII[2], lllllllllllllIIlllllIIIlIlIllIlI);
                return new String(lllllllllllllIIlllllIIIlIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllllIIIlIlIllIII) {
                lllllllllllllIIlllllIIIlIlIllIII.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIllIlIlIIIl() {
            (lIIIlllIlIlIlI = new String[Anvil.lIIIlllIlIllII[3]])[Anvil.lIIIlllIlIllII[0]] = llIIIllIlIIllll("Hn9C/tsaXCI=", "UHTPb");
            Anvil.lIIIlllIlIlIlI[Anvil.lIIIlllIlIllII[1]] = llIIIllIlIlIIII("uYJDprAVjjw=", "fxuxg");
            Anvil.lIIIlllIlIlIlI[Anvil.lIIIlllIlIllII[2]] = llIIIllIlIIllll("BNq/4oWW6QI9t5oFtSHKkA==", "zqxzM");
        }
        
        @Override
        public IChatComponent getDisplayName() {
            return new ChatComponentTranslation(String.valueOf(new StringBuilder(String.valueOf(Blocks.anvil.getUnlocalizedName())).append(Anvil.lIIIlllIlIlIlI[Anvil.lIIIlllIlIllII[1]])), new Object[Anvil.lIIIlllIlIllII[0]]);
        }
        
        private static String llIIIllIlIIllll(final String lllllllllllllIIlllllIIIlIlIIlIII, final String lllllllllllllIIlllllIIIlIlIIlIIl) {
            try {
                final SecretKeySpec lllllllllllllIIlllllIIIlIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), Anvil.lIIIlllIlIllII[4]), "DES");
                final Cipher lllllllllllllIIlllllIIIlIlIIllII = Cipher.getInstance("DES");
                lllllllllllllIIlllllIIIlIlIIllII.init(Anvil.lIIIlllIlIllII[2], lllllllllllllIIlllllIIIlIlIIllIl);
                return new String(lllllllllllllIIlllllIIIlIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIIlIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllllIIIlIlIIlIll) {
                lllllllllllllIIlllllIIIlIlIIlIll.printStackTrace();
                return null;
            }
        }
        
        static {
            llIIIllIlIlIlIl();
            llIIIllIlIlIIIl();
        }
        
        @Override
        public Container createContainer(final InventoryPlayer lllllllllllllIIlllllIIIlIllIIIIl, final EntityPlayer lllllllllllllIIlllllIIIlIllIIIll) {
            return new ContainerRepair(lllllllllllllIIlllllIIIlIllIIIIl, this.world, this.position, lllllllllllllIIlllllIIIlIllIIIll);
        }
        
        public Anvil(final World lllllllllllllIIlllllIIIlIllIllIl, final BlockPos lllllllllllllIIlllllIIIlIllIllll) {
            this.world = lllllllllllllIIlllllIIIlIllIllIl;
            this.position = lllllllllllllIIlllllIIIlIllIllll;
        }
    }
}
