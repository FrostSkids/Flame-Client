// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.inventory.ContainerDispenser;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Random;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

public class TileEntityDispenser extends TileEntityLockable implements IInventory
{
    private static final /* synthetic */ int[] lIllIIIIllIllI;
    protected /* synthetic */ String customName;
    private /* synthetic */ ItemStack[] stacks;
    private static final /* synthetic */ Random RNG;
    private static final /* synthetic */ String[] lIllIIIIllIlIl;
    
    public void setCustomName(final String lllllllllllllIIIIIlllIlllllIIlIl) {
        this.customName = lllllllllllllIIIIIlllIlllllIIlIl;
    }
    
    private static boolean llllIlllIIIIllI(final int lllllllllllllIIIIIlllIllIlIlIIll) {
        return lllllllllllllIIIIIlllIllIlIlIIll != 0;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return TileEntityDispenser.lIllIIIIllIllI[13];
    }
    
    static {
        llllIllIlllllll();
        llllIllIllllllI();
        RNG = new Random();
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIIIIIlllIlllIlllIlI) {
        int n;
        if (llllIlllIIIlIlI(this.worldObj.getTileEntity(this.pos), this)) {
            n = TileEntityDispenser.lIllIIIIllIllI[3];
            "".length();
            if (((29 + 175 - 34 + 11 ^ 104 + 45 - 128 + 113) & (4 + 137 - 16 + 29 ^ 155 + 47 - 96 + 63 ^ -" ".length())) == "   ".length()) {
                return ((0xE2 ^ 0xA6 ^ (0x73 ^ 0x15)) & (21 + 160 - 22 + 14 ^ 26 + 122 - 31 + 26 ^ -" ".length())) != 0x0;
            }
        }
        else if (llllIlllIIIlIll(llllIlllIIIlIIl(lllllllllllllIIIIIlllIlllIlllIlI.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = TileEntityDispenser.lIllIIIIllIllI[2];
            "".length();
            if ("  ".length() < -" ".length()) {
                return ((0xB ^ 0x20 ^ (0xDA ^ 0xA6)) & (0x29 ^ 0x40 ^ (0x99 ^ 0xA7) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = TileEntityDispenser.lIllIIIIllIllI[3];
        }
        return n != 0;
    }
    
    @Override
    public boolean hasCustomName() {
        if (llllIlllIIIIIII(this.customName)) {
            return TileEntityDispenser.lIllIIIIllIllI[2] != 0;
        }
        return TileEntityDispenser.lIllIIIIllIllI[3] != 0;
    }
    
    @Override
    public String getName() {
        String customName;
        if (llllIlllIIIIllI(this.hasCustomName() ? 1 : 0)) {
            customName = this.customName;
            "".length();
            if ((0x55 ^ 0x51) < 0) {
                return null;
            }
        }
        else {
            customName = TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[3]];
        }
        return customName;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIIIIIlllIllllIllIlI) {
        super.readFromNBT(lllllllllllllIIIIIlllIllllIllIlI);
        final NBTTagList lllllllllllllIIIIIlllIllllIllIIl = lllllllllllllIIIIIlllIllllIllIlI.getTagList(TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[2]], TileEntityDispenser.lIllIIIIllIllI[4]);
        this.stacks = new ItemStack[this.getSizeInventory()];
        int lllllllllllllIIIIIlllIllllIllIII = TileEntityDispenser.lIllIIIIllIllI[3];
        "".length();
        if (-" ".length() > "  ".length()) {
            return;
        }
        while (!llllIlllIIIIIll(lllllllllllllIIIIIlllIllllIllIII, lllllllllllllIIIIIlllIllllIllIIl.tagCount())) {
            final NBTTagCompound lllllllllllllIIIIIlllIllllIlIlll = lllllllllllllIIIIIlllIllllIllIIl.getCompoundTagAt(lllllllllllllIIIIIlllIllllIllIII);
            final int lllllllllllllIIIIIlllIllllIlIllI = lllllllllllllIIIIIlllIllllIlIlll.getByte(TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[5]]) & TileEntityDispenser.lIllIIIIllIllI[6];
            if (llllIlllIIIIlll(lllllllllllllIIIIIlllIllllIlIllI) && llllIlllIIIlIII(lllllllllllllIIIIIlllIllllIlIllI, this.stacks.length)) {
                this.stacks[lllllllllllllIIIIIlllIllllIlIllI] = ItemStack.loadItemStackFromNBT(lllllllllllllIIIIIlllIllllIlIlll);
            }
            ++lllllllllllllIIIIIlllIllllIllIII;
        }
        if (llllIlllIIIIllI(lllllllllllllIIIIIlllIllllIllIlI.hasKey(TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[7]], TileEntityDispenser.lIllIIIIllIllI[8]) ? 1 : 0)) {
            this.customName = lllllllllllllIIIIIlllIllllIllIlI.getString(TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[9]]);
        }
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIIIIIllllIIIIIlIlll, final int lllllllllllllIIIIIllllIIIIIlIllI) {
        if (!llllIlllIIIIIII(this.stacks[lllllllllllllIIIIIllllIIIIIlIlll])) {
            return null;
        }
        if (llllIlllIIIIIIl(this.stacks[lllllllllllllIIIIIllllIIIIIlIlll].stackSize, lllllllllllllIIIIIllllIIIIIlIllI)) {
            final ItemStack lllllllllllllIIIIIllllIIIIIllIlI = this.stacks[lllllllllllllIIIIIllllIIIIIlIlll];
            this.stacks[lllllllllllllIIIIIllllIIIIIlIlll] = null;
            this.markDirty();
            return lllllllllllllIIIIIllllIIIIIllIlI;
        }
        final ItemStack lllllllllllllIIIIIllllIIIIIllIIl = this.stacks[lllllllllllllIIIIIllllIIIIIlIlll].splitStack(lllllllllllllIIIIIllllIIIIIlIllI);
        if (llllIlllIIIIIlI(this.stacks[lllllllllllllIIIIIllllIIIIIlIlll].stackSize)) {
            this.stacks[lllllllllllllIIIIIllllIIIIIlIlll] = null;
        }
        this.markDirty();
        return lllllllllllllIIIIIllllIIIIIllIIl;
    }
    
    private static boolean llllIlllIIIIIII(final Object lllllllllllllIIIIIlllIllIlIlIlll) {
        return lllllllllllllIIIIIlllIllIlIlIlll != null;
    }
    
    private static boolean llllIlllIIIIIIl(final int lllllllllllllIIIIIlllIllIllIIIlI, final int lllllllllllllIIIIIlllIllIllIIIIl) {
        return lllllllllllllIIIIIlllIllIllIIIlI <= lllllllllllllIIIIIlllIllIllIIIIl;
    }
    
    public int addItemStack(final ItemStack lllllllllllllIIIIIlllIllllllIIlI) {
        int lllllllllllllIIIIIlllIllllllIIIl = TileEntityDispenser.lIllIIIIllIllI[3];
        "".length();
        if ((13 + 53 - 52 + 137 ^ 143 + 13 - 80 + 71) < "   ".length()) {
            return (0xCF ^ 0x84 ^ (0x4 ^ 0x9)) & (0x20 ^ 0x59 ^ (0x99 ^ 0xA6) ^ -" ".length());
        }
        while (!llllIlllIIIIIll(lllllllllllllIIIIIlllIllllllIIIl, this.stacks.length)) {
            if (!llllIlllIIIIIII(this.stacks[lllllllllllllIIIIIlllIllllllIIIl]) || llllIlllIIIIlIl(this.stacks[lllllllllllllIIIIIlllIllllllIIIl].getItem())) {
                this.setInventorySlotContents(lllllllllllllIIIIIlllIllllllIIIl, lllllllllllllIIIIIlllIllllllIIlI);
                return lllllllllllllIIIIIlllIllllllIIIl;
            }
            ++lllllllllllllIIIIIlllIllllllIIIl;
        }
        return TileEntityDispenser.lIllIIIIllIllI[1];
    }
    
    @Override
    public void setInventorySlotContents(final int lllllllllllllIIIIIlllIlllllllIll, final ItemStack lllllllllllllIIIIIlllIllllllIlll) {
        this.stacks[lllllllllllllIIIIIlllIlllllllIll] = lllllllllllllIIIIIlllIllllllIlll;
        if (llllIlllIIIIIII(lllllllllllllIIIIIlllIllllllIlll) && llllIlllIIIIlII(lllllllllllllIIIIIlllIllllllIlll.stackSize, this.getInventoryStackLimit())) {
            lllllllllllllIIIIIlllIllllllIlll.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }
    
    private static boolean llllIlllIIIIlll(final int lllllllllllllIIIIIlllIllIlIIllll) {
        return lllllllllllllIIIIIlllIllIlIIllll >= 0;
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int lllllllllllllIIIIIllllIIIIIlIIII) {
        if (llllIlllIIIIIII(this.stacks[lllllllllllllIIIIIllllIIIIIlIIII])) {
            final ItemStack lllllllllllllIIIIIllllIIIIIIllll = this.stacks[lllllllllllllIIIIIllllIIIIIlIIII];
            this.stacks[lllllllllllllIIIIIllllIIIIIlIIII] = null;
            return lllllllllllllIIIIIllllIIIIIIllll;
        }
        return null;
    }
    
    private static void llllIllIllllllI() {
        (lIllIIIIllIlIl = new String[TileEntityDispenser.lIllIIIIllIllI[0]])[TileEntityDispenser.lIllIIIIllIllI[3]] = llllIllIllllIll("mVF4Xhj7ZNvrUmj+nre6FY+eBVwZP/kW", "ugcnd");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[2]] = llllIllIlllllII("Eii1rr0584Q=", "flngm");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[5]] = llllIllIlllllIl("Nhk2Bg==", "euYrd");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[7]] = llllIllIllllIll("6+UIPvtscZ5LxS4f/KR24g==", "EHZLj");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[9]] = llllIllIllllIll("tb+ah0aM3ePQD0MXb5Cb1A==", "mmuKO");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[10]] = llllIllIlllllII("pwV3dAuQKhc=", "qVpCh");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[11]] = llllIllIlllllII("wv8f5OkvpwQ=", "waiik");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[12]] = llllIllIllllIll("BKkCFBlB9FC54R9WyEmqnQ==", "DiRvo");
        TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[8]] = llllIllIllllIll("PQzPdBiOSUhhOK8fEHHTmc6rsHIUeOO+", "iPloC");
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIIIIIlllIllllIIIlII) {
        super.writeToNBT(lllllllllllllIIIIIlllIllllIIIlII);
        final NBTTagList lllllllllllllIIIIIlllIllllIIlIII = new NBTTagList();
        int lllllllllllllIIIIIlllIllllIIIlll = TileEntityDispenser.lIllIIIIllIllI[3];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllIlllIIIIIll(lllllllllllllIIIIIlllIllllIIIlll, this.stacks.length)) {
            if (llllIlllIIIIIII(this.stacks[lllllllllllllIIIIIlllIllllIIIlll])) {
                final NBTTagCompound lllllllllllllIIIIIlllIllllIIIllI = new NBTTagCompound();
                lllllllllllllIIIIIlllIllllIIIllI.setByte(TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[10]], (byte)lllllllllllllIIIIIlllIllllIIIlll);
                this.stacks[lllllllllllllIIIIIlllIllllIIIlll].writeToNBT(lllllllllllllIIIIIlllIllllIIIllI);
                "".length();
                lllllllllllllIIIIIlllIllllIIlIII.appendTag(lllllllllllllIIIIIlllIllllIIIllI);
            }
            ++lllllllllllllIIIIIlllIllllIIIlll;
        }
        lllllllllllllIIIIIlllIllllIIIlII.setTag(TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[11]], lllllllllllllIIIIIlllIllllIIlIII);
        if (llllIlllIIIIllI(this.hasCustomName() ? 1 : 0)) {
            lllllllllllllIIIIIlllIllllIIIlII.setString(TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[12]], this.customName);
        }
    }
    
    private static String llllIllIlllllIl(String lllllllllllllIIIIIlllIlllIIIllll, final String lllllllllllllIIIIIlllIlllIIIlllI) {
        lllllllllllllIIIIIlllIlllIIIllll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIlllIlllIIIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlllIlllIIlIIlI = new StringBuilder();
        final char[] lllllllllllllIIIIIlllIlllIIlIIIl = lllllllllllllIIIIIlllIlllIIIlllI.toCharArray();
        int lllllllllllllIIIIIlllIlllIIlIIII = TileEntityDispenser.lIllIIIIllIllI[3];
        final String lllllllllllllIIIIIlllIlllIIIlIlI = (Object)((String)lllllllllllllIIIIIlllIlllIIIllll).toCharArray();
        final Exception lllllllllllllIIIIIlllIlllIIIlIIl = (Exception)lllllllllllllIIIIIlllIlllIIIlIlI.length;
        char lllllllllllllIIIIIlllIlllIIIlIII = (char)TileEntityDispenser.lIllIIIIllIllI[3];
        while (llllIlllIIIlIII(lllllllllllllIIIIIlllIlllIIIlIII, (int)lllllllllllllIIIIIlllIlllIIIlIIl)) {
            final char lllllllllllllIIIIIlllIlllIIlIlIl = lllllllllllllIIIIIlllIlllIIIlIlI[lllllllllllllIIIIIlllIlllIIIlIII];
            lllllllllllllIIIIIlllIlllIIlIIlI.append((char)(lllllllllllllIIIIIlllIlllIIlIlIl ^ lllllllllllllIIIIIlllIlllIIlIIIl[lllllllllllllIIIIIlllIlllIIlIIII % lllllllllllllIIIIIlllIlllIIlIIIl.length]));
            "".length();
            ++lllllllllllllIIIIIlllIlllIIlIIII;
            ++lllllllllllllIIIIIlllIlllIIIlIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlllIlllIIlIIlI);
    }
    
    private static boolean llllIlllIIIIIll(final int lllllllllllllIIIIIlllIllIllIlIlI, final int lllllllllllllIIIIIlllIllIllIlIIl) {
        return lllllllllllllIIIIIlllIllIllIlIlI >= lllllllllllllIIIIIlllIllIllIlIIl;
    }
    
    private static boolean llllIlllIIIlIll(final int lllllllllllllIIIIIlllIllIlIIllIl) {
        return lllllllllllllIIIIIlllIllIlIIllIl <= 0;
    }
    
    private static boolean llllIlllIIIlIlI(final Object lllllllllllllIIIIIlllIllIlIllIlI, final Object lllllllllllllIIIIIlllIllIlIllIIl) {
        return lllllllllllllIIIIIlllIllIlIllIlI != lllllllllllllIIIIIlllIllIlIllIIl;
    }
    
    @Override
    public int getField(final int lllllllllllllIIIIIlllIlllIlIlIIl) {
        return TileEntityDispenser.lIllIIIIllIllI[3];
    }
    
    @Override
    public void setField(final int lllllllllllllIIIIIlllIlllIlIIlll, final int lllllllllllllIIIIIlllIlllIlIIllI) {
    }
    
    @Override
    public Container createContainer(final InventoryPlayer lllllllllllllIIIIIlllIlllIlIlllI, final EntityPlayer lllllllllllllIIIIIlllIlllIlIllIl) {
        return new ContainerDispenser(lllllllllllllIIIIIlllIlllIlIlllI, this);
    }
    
    @Override
    public String getGuiID() {
        return TileEntityDispenser.lIllIIIIllIlIl[TileEntityDispenser.lIllIIIIllIllI[8]];
    }
    
    private static void llllIllIlllllll() {
        (lIllIIIIllIllI = new int[14])[0] = (23 + 60 + 40 + 7 ^ 31 + 103 - 22 + 27);
        TileEntityDispenser.lIllIIIIllIllI[1] = -" ".length();
        TileEntityDispenser.lIllIIIIllIllI[2] = " ".length();
        TileEntityDispenser.lIllIIIIllIllI[3] = ((0x59 ^ 0xC ^ (0x78 ^ 0x61)) & (0xE8 ^ 0x82 ^ (0xA ^ 0x2C) ^ -" ".length()));
        TileEntityDispenser.lIllIIIIllIllI[4] = (79 + 115 - 167 + 117 ^ 136 + 4 - 87 + 101);
        TileEntityDispenser.lIllIIIIllIllI[5] = "  ".length();
        TileEntityDispenser.lIllIIIIllIllI[6] = 136 + 89 - 173 + 91 + "  ".length() - -(0x66 ^ 0x59) + (0xE9 ^ 0xC6);
        TileEntityDispenser.lIllIIIIllIllI[7] = "   ".length();
        TileEntityDispenser.lIllIIIIllIllI[8] = (0xAA ^ 0xA2);
        TileEntityDispenser.lIllIIIIllIllI[9] = (12 + 124 - 46 + 63 ^ 138 + 51 - 100 + 68);
        TileEntityDispenser.lIllIIIIllIllI[10] = (0x8B ^ 0x8E);
        TileEntityDispenser.lIllIIIIllIllI[11] = (0xC0 ^ 0xB2 ^ (0xE3 ^ 0x97));
        TileEntityDispenser.lIllIIIIllIllI[12] = (0xEA ^ 0x9C ^ (0xF ^ 0x7E));
        TileEntityDispenser.lIllIIIIllIllI[13] = (69 + 114 - 116 + 68 ^ 48 + 103 + 21 + 27);
    }
    
    private static boolean llllIlllIIIIlII(final int lllllllllllllIIIIIlllIllIlIllllI, final int lllllllllllllIIIIIlllIllIlIlllIl) {
        return lllllllllllllIIIIIlllIllIlIllllI > lllllllllllllIIIIIlllIllIlIlllIl;
    }
    
    private static boolean llllIlllIIIlIII(final int lllllllllllllIIIIIlllIllIllIIllI, final int lllllllllllllIIIIIlllIllIllIIlIl) {
        return lllllllllllllIIIIIlllIllIllIIllI < lllllllllllllIIIIIlllIllIllIIlIl;
    }
    
    private static String llllIllIllllIll(final String lllllllllllllIIIIIlllIllIlllllll, final String lllllllllllllIIIIIlllIllIlllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllIlllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllIllIlllllII.getBytes(StandardCharsets.UTF_8)), TileEntityDispenser.lIllIIIIllIllI[8]), "DES");
            final Cipher lllllllllllllIIIIIlllIlllIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIlllIlllIIIIIIl.init(TileEntityDispenser.lIllIIIIllIllI[5], lllllllllllllIIIIIlllIlllIIIIIlI);
            return new String(lllllllllllllIIIIIlllIlllIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllIlllIIIIIII) {
            lllllllllllllIIIIIlllIlllIIIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIIIIIlllIlllIllIlII, final ItemStack lllllllllllllIIIIIlllIlllIllIIll) {
        return TileEntityDispenser.lIllIIIIllIllI[2] != 0;
    }
    
    @Override
    public ItemStack getStackInSlot(final int lllllllllllllIIIIIllllIIIIlIIIlI) {
        return this.stacks[lllllllllllllIIIIIllllIIIIlIIIlI];
    }
    
    @Override
    public void clear() {
        int lllllllllllllIIIIIlllIlllIlIIIIl = TileEntityDispenser.lIllIIIIllIllI[3];
        "".length();
        if (((0x39 ^ 0x3D) & ~(0x52 ^ 0x56)) != 0x0) {
            return;
        }
        while (!llllIlllIIIIIll(lllllllllllllIIIIIlllIlllIlIIIIl, this.stacks.length)) {
            this.stacks[lllllllllllllIIIIIlllIlllIlIIIIl] = null;
            ++lllllllllllllIIIIIlllIlllIlIIIIl;
        }
    }
    
    public TileEntityDispenser() {
        this.stacks = new ItemStack[TileEntityDispenser.lIllIIIIllIllI[0]];
    }
    
    @Override
    public int getFieldCount() {
        return TileEntityDispenser.lIllIIIIllIllI[3];
    }
    
    private static boolean llllIlllIIIIlIl(final Object lllllllllllllIIIIIlllIllIlIlIlIl) {
        return lllllllllllllIIIIIlllIllIlIlIlIl == null;
    }
    
    private static String llllIllIlllllII(final String lllllllllllllIIIIIlllIllIlllIIlI, final String lllllllllllllIIIIIlllIllIlllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlllIllIlllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlllIllIlllIlII.init(TileEntityDispenser.lIllIIIIllIllI[5], lllllllllllllIIIIIlllIllIlllIlIl);
            return new String(lllllllllllllIIIIIlllIllIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllIllIlllIIll) {
            lllllllllllllIIIIIlllIllIlllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getSizeInventory() {
        return TileEntityDispenser.lIllIIIIllIllI[0];
    }
    
    private static boolean llllIlllIIIIIlI(final int lllllllllllllIIIIIlllIllIlIlIIIl) {
        return lllllllllllllIIIIIlllIllIlIlIIIl == 0;
    }
    
    public int getDispenseSlot() {
        int lllllllllllllIIIIIllllIIIIIIIllI = TileEntityDispenser.lIllIIIIllIllI[1];
        int lllllllllllllIIIIIllllIIIIIIIlIl = TileEntityDispenser.lIllIIIIllIllI[2];
        int lllllllllllllIIIIIllllIIIIIIIlII = TileEntityDispenser.lIllIIIIllIllI[3];
        "".length();
        if (-(0 + 1 + 84 + 47 ^ 90 + 87 - 95 + 47) >= 0) {
            return (12 + 28 - 39 + 218 ^ 113 + 18 - 63 + 72) & (131 + 137 - 242 + 179 ^ 94 + 91 - 176 + 145 ^ -" ".length());
        }
        while (!llllIlllIIIIIll(lllllllllllllIIIIIllllIIIIIIIlII, this.stacks.length)) {
            if (llllIlllIIIIIII(this.stacks[lllllllllllllIIIIIllllIIIIIIIlII]) && llllIlllIIIIIlI(TileEntityDispenser.RNG.nextInt(lllllllllllllIIIIIllllIIIIIIIlIl++))) {
                lllllllllllllIIIIIllllIIIIIIIllI = lllllllllllllIIIIIllllIIIIIIIlII;
            }
            ++lllllllllllllIIIIIllllIIIIIIIlII;
        }
        return lllllllllllllIIIIIllllIIIIIIIllI;
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIIIIIlllIlllIllIllI) {
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIIIIIlllIlllIlllIII) {
    }
    
    private static int llllIlllIIIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
}
