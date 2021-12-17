// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.Vec3i;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import java.util.List;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.Block;

public class ItemBlock extends Item
{
    private static final /* synthetic */ int[] llIIlllIIIIIll;
    protected final /* synthetic */ Block block;
    private static final /* synthetic */ String[] llIIlllIIIIIlI;
    
    private static boolean lIIIllllIlIlllII(final Object llllllllllllIllIlllllIlIlIIlIllI) {
        return llllllllllllIllIlllllIlIlIIlIllI != null;
    }
    
    private static String lIIIllllIlIlIlIl(String llllllllllllIllIlllllIlIllIIIIlI, final String llllllllllllIllIlllllIlIllIIIllI) {
        llllllllllllIllIlllllIlIllIIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlllllIlIllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllllIlIllIIIlIl = new StringBuilder();
        final char[] llllllllllllIllIlllllIlIllIIIlII = llllllllllllIllIlllllIlIllIIIllI.toCharArray();
        int llllllllllllIllIlllllIlIllIIIIll = ItemBlock.llIIlllIIIIIll[0];
        final boolean llllllllllllIllIlllllIlIlIllllIl = (Object)llllllllllllIllIlllllIlIllIIIIlI.toCharArray();
        final long llllllllllllIllIlllllIlIlIllllII = llllllllllllIllIlllllIlIlIllllIl.length;
        char llllllllllllIllIlllllIlIlIlllIll = (char)ItemBlock.llIIlllIIIIIll[0];
        while (lIIIllllIlIlllIl(llllllllllllIllIlllllIlIlIlllIll, (int)llllllllllllIllIlllllIlIlIllllII)) {
            final char llllllllllllIllIlllllIlIllIIlIII = llllllllllllIllIlllllIlIlIllllIl[llllllllllllIllIlllllIlIlIlllIll];
            llllllllllllIllIlllllIlIllIIIlIl.append((char)(llllllllllllIllIlllllIlIllIIlIII ^ llllllllllllIllIlllllIlIllIIIlII[llllllllllllIllIlllllIlIllIIIIll % llllllllllllIllIlllllIlIllIIIlII.length]));
            "".length();
            ++llllllllllllIllIlllllIlIllIIIIll;
            ++llllllllllllIllIlllllIlIlIlllIll;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllllIlIllIIIlIl);
    }
    
    public ItemBlock(final Block llllllllllllIllIlllllIllIlIIlIlI) {
        this.block = llllllllllllIllIlllllIllIlIIlIlI;
    }
    
    static {
        lIIIllllIlIlIlll();
        lIIIllllIlIlIllI();
    }
    
    @Override
    public CreativeTabs getCreativeTab() {
        return this.block.getCreativeTabToDisplayOn();
    }
    
    private static boolean lIIIllllIlIllIIl(final int llllllllllllIllIlllllIlIlIIlIIlI) {
        return llllllllllllIllIlllllIlIlIIlIIlI != 0;
    }
    
    public static boolean setTileEntityNBT(final World llllllllllllIllIlllllIllIIIIlIlI, final EntityPlayer llllllllllllIllIlllllIllIIIlIIlI, final BlockPos llllllllllllIllIlllllIllIIIIlIII, final ItemStack llllllllllllIllIlllllIllIIIlIIII) {
        final MinecraftServer llllllllllllIllIlllllIllIIIIllll = MinecraftServer.getServer();
        if (lIIIllllIlIllIll(llllllllllllIllIlllllIllIIIIllll)) {
            return ItemBlock.llIIlllIIIIIll[0] != 0;
        }
        if (lIIIllllIlIllIIl(llllllllllllIllIlllllIllIIIlIIII.hasTagCompound() ? 1 : 0) && lIIIllllIlIllIIl(llllllllllllIllIlllllIllIIIlIIII.getTagCompound().hasKey(ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[0]], ItemBlock.llIIlllIIIIIll[3]) ? 1 : 0)) {
            final TileEntity llllllllllllIllIlllllIllIIIIlllI = llllllllllllIllIlllllIllIIIIlIlI.getTileEntity(llllllllllllIllIlllllIllIIIIlIII);
            if (lIIIllllIlIlllII(llllllllllllIllIlllllIllIIIIlllI)) {
                if (lIIIllllIlIllIII(llllllllllllIllIlllllIllIIIIlIlI.isRemote ? 1 : 0) && lIIIllllIlIllIIl(llllllllllllIllIlllllIllIIIIlllI.func_183000_F() ? 1 : 0) && lIIIllllIlIllIII(llllllllllllIllIlllllIllIIIIllll.getConfigurationManager().canSendCommands(llllllllllllIllIlllllIllIIIlIIlI.getGameProfile()) ? 1 : 0)) {
                    return ItemBlock.llIIlllIIIIIll[0] != 0;
                }
                final NBTTagCompound llllllllllllIllIlllllIllIIIIllIl = new NBTTagCompound();
                final NBTTagCompound llllllllllllIllIlllllIllIIIIllII = (NBTTagCompound)llllllllllllIllIlllllIllIIIIllIl.copy();
                llllllllllllIllIlllllIllIIIIlllI.writeToNBT(llllllllllllIllIlllllIllIIIIllIl);
                final NBTTagCompound llllllllllllIllIlllllIllIIIIlIll = (NBTTagCompound)llllllllllllIllIlllllIllIIIlIIII.getTagCompound().getTag(ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[2]]);
                llllllllllllIllIlllllIllIIIIllIl.merge(llllllllllllIllIlllllIllIIIIlIll);
                llllllllllllIllIlllllIllIIIIllIl.setInteger(ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[4]], llllllllllllIllIlllllIllIIIIlIII.getX());
                llllllllllllIllIlllllIllIIIIllIl.setInteger(ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[1]], llllllllllllIllIlllllIllIIIIlIII.getY());
                llllllllllllIllIlllllIllIIIIllIl.setInteger(ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[5]], llllllllllllIllIlllllIllIIIIlIII.getZ());
                if (lIIIllllIlIllIII(llllllllllllIllIlllllIllIIIIllIl.equals(llllllllllllIllIlllllIllIIIIllII) ? 1 : 0)) {
                    llllllllllllIllIlllllIllIIIIlllI.readFromNBT(llllllllllllIllIlllllIllIIIIllIl);
                    llllllllllllIllIlllllIllIIIIlllI.markDirty();
                    return ItemBlock.llIIlllIIIIIll[2] != 0;
                }
            }
        }
        return ItemBlock.llIIlllIIIIIll[0] != 0;
    }
    
    @Override
    public String getUnlocalizedName() {
        return this.block.getUnlocalizedName();
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack llllllllllllIllIlllllIlIlllIllII) {
        return this.block.getUnlocalizedName();
    }
    
    public boolean canPlaceBlockOnSide(final World llllllllllllIllIlllllIlIllllIIll, BlockPos llllllllllllIllIlllllIlIllllIIlI, EnumFacing llllllllllllIllIlllllIlIllllIIIl, final EntityPlayer llllllllllllIllIlllllIlIllllIlll, final ItemStack llllllllllllIllIlllllIlIllllIllI) {
        final Block llllllllllllIllIlllllIlIllllIlIl = llllllllllllIllIlllllIlIllllIIll.getBlockState(llllllllllllIllIlllllIlIllllIIlI).getBlock();
        if (lIIIllllIlIllIlI(llllllllllllIllIlllllIlIllllIlIl, Blocks.snow_layer)) {
            llllllllllllIllIlllllIlIllllIIIl = EnumFacing.UP;
            "".length();
            if (" ".length() == 0) {
                return ((0x4E ^ 0x17) & ~(0x9A ^ 0xC3)) != 0x0;
            }
        }
        else if (lIIIllllIlIllIII(llllllllllllIllIlllllIlIllllIlIl.isReplaceable(llllllllllllIllIlllllIlIllllIIll, llllllllllllIllIlllllIlIllllIIlI) ? 1 : 0)) {
            llllllllllllIllIlllllIlIllllIIlI = llllllllllllIllIlllllIlIllllIIlI.offset((EnumFacing)llllllllllllIllIlllllIlIllllIIIl);
        }
        return llllllllllllIllIlllllIlIllllIIll.canBlockBePlaced(this.block, llllllllllllIllIlllllIlIllllIIlI, (boolean)(ItemBlock.llIIlllIIIIIll[0] != 0), (EnumFacing)llllllllllllIllIlllllIlIllllIIIl, null, llllllllllllIllIlllllIlIllllIllI);
    }
    
    private static String lIIIllllIlIlIIll(final String llllllllllllIllIlllllIlIlIllIIlI, final String llllllllllllIllIlllllIlIlIlIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIlIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIlIlIlIllll.getBytes(StandardCharsets.UTF_8)), ItemBlock.llIIlllIIIIIll[7]), "DES");
            final Cipher llllllllllllIllIlllllIlIlIllIlII = Cipher.getInstance("DES");
            llllllllllllIllIlllllIlIlIllIlII.init(ItemBlock.llIIlllIIIIIll[4], llllllllllllIllIlllllIlIlIllIlIl);
            return new String(llllllllllllIllIlllllIlIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIlIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIlIlIllIIll) {
            llllllllllllIllIlllllIlIlIllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void getSubItems(final Item llllllllllllIllIlllllIlIllIlllll, final CreativeTabs llllllllllllIllIlllllIlIllIllIlI, final List<ItemStack> llllllllllllIllIlllllIlIllIlllIl) {
        this.block.getSubBlocks(llllllllllllIllIlllllIlIllIlllll, llllllllllllIllIlllllIlIllIllIlI, llllllllllllIllIlllllIlIllIlllIl);
    }
    
    private static void lIIIllllIlIlIlll() {
        (llIIlllIIIIIll = new int[8])[0] = ((2 + 28 + 68 + 32 ^ 24 + 125 - 36 + 48) & (125 + 165 - 224 + 108 ^ 134 + 80 - 97 + 24 ^ -" ".length()));
        ItemBlock.llIIlllIIIIIll[1] = "   ".length();
        ItemBlock.llIIlllIIIIIll[2] = " ".length();
        ItemBlock.llIIlllIIIIIll[3] = (0x56 ^ 0x7F ^ (0xB8 ^ 0x9B));
        ItemBlock.llIIlllIIIIIll[4] = "  ".length();
        ItemBlock.llIIlllIIIIIll[5] = (124 + 132 - 140 + 71 ^ 93 + 147 - 84 + 35);
        ItemBlock.llIIlllIIIIIll[6] = (0x29 ^ 0x2C);
        ItemBlock.llIIlllIIIIIll[7] = (0x6E ^ 0x66);
    }
    
    private static boolean lIIIllllIlIllIII(final int llllllllllllIllIlllllIlIlIIlIIII) {
        return llllllllllllIllIlllllIlIlIIlIIII == 0;
    }
    
    private static boolean lIIIllllIlIllIll(final Object llllllllllllIllIlllllIlIlIIlIlII) {
        return llllllllllllIllIlllllIlIlIIlIlII == null;
    }
    
    private static void lIIIllllIlIlIllI() {
        (llIIlllIIIIIlI = new String[ItemBlock.llIIlllIIIIIll[6]])[ItemBlock.llIIlllIIIIIll[0]] = lIIIllllIlIlIIll("i6/uZa1mKOaIt3B+gFA9PQ==", "LxHON");
        ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[2]] = lIIIllllIlIlIlII("HTndfwhM6fq15W1cN3wmwg==", "Jybmx");
        ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[4]] = lIIIllllIlIlIlIl("PA==", "DBHDv");
        ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[1]] = lIIIllllIlIlIlIl("PA==", "EIRcu");
        ItemBlock.llIIlllIIIIIlI[ItemBlock.llIIlllIIIIIll[5]] = lIIIllllIlIlIlIl("DQ==", "wMQMw");
    }
    
    private static boolean lIIIllllIlIlllIl(final int llllllllllllIllIlllllIlIlIIlllIl, final int llllllllllllIllIlllllIlIlIIlllII) {
        return llllllllllllIllIlllllIlIlIIlllIl < llllllllllllIllIlllllIlIlIIlllII;
    }
    
    private static String lIIIllllIlIlIlII(final String llllllllllllIllIlllllIlIlIlIIlIl, final String llllllllllllIllIlllllIlIlIlIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIlIlIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllllIlIlIlIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllllIlIlIlIIlll.init(ItemBlock.llIIlllIIIIIll[4], llllllllllllIllIlllllIlIlIlIlIII);
            return new String(llllllllllllIllIlllllIlIlIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIlIlIlIIllI) {
            llllllllllllIllIlllllIlIlIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllllIlIllIlI(final Object llllllllllllIllIlllllIlIlIIllIIl, final Object llllllllllllIllIlllllIlIlIIllIII) {
        return llllllllllllIllIlllllIlIlIIllIIl == llllllllllllIllIlllllIlIlIIllIII;
    }
    
    public Block getBlock() {
        return this.block;
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIllIlllllIllIIllIlIl, final EntityPlayer llllllllllllIllIlllllIllIIllIlII, final World llllllllllllIllIlllllIllIIlIIllI, BlockPos llllllllllllIllIlllllIllIIlIIlIl, final EnumFacing llllllllllllIllIlllllIllIIlIIlII, final float llllllllllllIllIlllllIllIIlIIIll, final float llllllllllllIllIlllllIllIIlIIIlI, final float llllllllllllIllIlllllIllIIlIIIIl) {
        final IBlockState llllllllllllIllIlllllIllIIlIllIl = llllllllllllIllIlllllIllIIlIIllI.getBlockState((BlockPos)llllllllllllIllIlllllIllIIlIIlIl);
        final Block llllllllllllIllIlllllIllIIlIllII = llllllllllllIllIlllllIllIIlIllIl.getBlock();
        if (lIIIllllIlIllIII(llllllllllllIllIlllllIllIIlIllII.isReplaceable(llllllllllllIllIlllllIllIIlIIllI, (BlockPos)llllllllllllIllIlllllIllIIlIIlIl) ? 1 : 0)) {
            llllllllllllIllIlllllIllIIlIIlIl = ((BlockPos)llllllllllllIllIlllllIllIIlIIlIl).offset(llllllllllllIllIlllllIllIIlIIlII);
        }
        if (lIIIllllIlIllIII(llllllllllllIllIlllllIllIIllIlIl.stackSize)) {
            return ItemBlock.llIIlllIIIIIll[0] != 0;
        }
        if (lIIIllllIlIllIII(llllllllllllIllIlllllIllIIllIlII.canPlayerEdit((BlockPos)llllllllllllIllIlllllIllIIlIIlIl, llllllllllllIllIlllllIllIIlIIlII, llllllllllllIllIlllllIllIIllIlIl) ? 1 : 0)) {
            return ItemBlock.llIIlllIIIIIll[0] != 0;
        }
        if (lIIIllllIlIllIIl(llllllllllllIllIlllllIllIIlIIllI.canBlockBePlaced(this.block, (BlockPos)llllllllllllIllIlllllIllIIlIIlIl, (boolean)(ItemBlock.llIIlllIIIIIll[0] != 0), llllllllllllIllIlllllIllIIlIIlII, null, llllllllllllIllIlllllIllIIllIlIl) ? 1 : 0)) {
            final int llllllllllllIllIlllllIllIIlIlIll = this.getMetadata(llllllllllllIllIlllllIllIIllIlIl.getMetadata());
            IBlockState llllllllllllIllIlllllIllIIlIlIlI = this.block.onBlockPlaced(llllllllllllIllIlllllIllIIlIIllI, (BlockPos)llllllllllllIllIlllllIllIIlIIlIl, llllllllllllIllIlllllIllIIlIIlII, llllllllllllIllIlllllIllIIlIIIll, llllllllllllIllIlllllIllIIlIIIlI, llllllllllllIllIlllllIllIIlIIIIl, llllllllllllIllIlllllIllIIlIlIll, llllllllllllIllIlllllIllIIllIlII);
            if (lIIIllllIlIllIIl(llllllllllllIllIlllllIllIIlIIllI.setBlockState((BlockPos)llllllllllllIllIlllllIllIIlIIlIl, llllllllllllIllIlllllIllIIlIlIlI, ItemBlock.llIIlllIIIIIll[1]) ? 1 : 0)) {
                llllllllllllIllIlllllIllIIlIlIlI = llllllllllllIllIlllllIllIIlIIllI.getBlockState((BlockPos)llllllllllllIllIlllllIllIIlIIlIl);
                if (lIIIllllIlIllIlI(llllllllllllIllIlllllIllIIlIlIlI.getBlock(), this.block)) {
                    setTileEntityNBT(llllllllllllIllIlllllIllIIlIIllI, llllllllllllIllIlllllIllIIllIlII, (BlockPos)llllllllllllIllIlllllIllIIlIIlIl, llllllllllllIllIlllllIllIIllIlIl);
                    "".length();
                    this.block.onBlockPlacedBy(llllllllllllIllIlllllIllIIlIIllI, (BlockPos)llllllllllllIllIlllllIllIIlIIlIl, llllllllllllIllIlllllIllIIlIlIlI, llllllllllllIllIlllllIllIIllIlII, llllllllllllIllIlllllIllIIllIlIl);
                }
                llllllllllllIllIlllllIllIIlIIllI.playSoundEffect(((Vec3i)llllllllllllIllIlllllIllIIlIIlIl).getX() + 0.5f, ((Vec3i)llllllllllllIllIlllllIllIIlIIlIl).getY() + 0.5f, ((Vec3i)llllllllllllIllIlllllIllIIlIIlIl).getZ() + 0.5f, this.block.stepSound.getPlaceSound(), (this.block.stepSound.getVolume() + 1.0f) / 2.0f, this.block.stepSound.getFrequency() * 0.8f);
                llllllllllllIllIlllllIllIIllIlIl.stackSize -= ItemBlock.llIIlllIIIIIll[2];
            }
            return ItemBlock.llIIlllIIIIIll[2] != 0;
        }
        return ItemBlock.llIIlllIIIIIll[0] != 0;
    }
    
    @Override
    public ItemBlock setUnlocalizedName(final String llllllllllllIllIlllllIllIlIIIllI) {
        super.setUnlocalizedName(llllllllllllIllIlllllIllIlIIIllI);
        "".length();
        return this;
    }
}
