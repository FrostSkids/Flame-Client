// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import com.google.common.base.Predicate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.ContainerHopper;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.block.BlockHopper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ITickable;

public class TileEntityHopper extends TileEntityLockable implements IHopper, ITickable
{
    private static final /* synthetic */ int[] lIllIllIlIlIII;
    private /* synthetic */ String customName;
    private /* synthetic */ ItemStack[] inventory;
    private /* synthetic */ int transferCooldown;
    private static final /* synthetic */ String[] lIllIllIlIIllI;
    
    private static void llllllllIlIIIIl() {
        (lIllIllIlIIllI = new String[TileEntityHopper.lIllIllIlIlIII[13]])[TileEntityHopper.lIllIllIlIlIII[2]] = llllllllIIlllII("VH6VIjnGlM8=", "KFCNM");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[4]] = llllllllIIlllll("yNtfAJMZZ7eUZts4/zbpYQ==", "Awgve");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[6]] = llllllllIIlllII("Zl0X0sDwAOCOLtbrPhjqeQ==", "IYZii");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[7]] = llllllllIIlllll("jJFe9noYyBoO0CW8F5pdxZvdSmk1O6Hf", "DbbuO");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[8]] = llllllllIIlllII("2hT3HQq0d7E=", "sZsPR");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[0]] = llllllllIlIIIII("Cy0DLQ==", "XAlYU");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[9]] = llllllllIIlllll("RUalAf3P4B0=", "YBUEe");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[10]] = llllllllIlIIIII("Jj41PBIUKSYRDh0gMD0WHA==", "rLTRa");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[5]] = llllllllIIlllII("y8klC8Lh0uJxU1Qp7LzqJA==", "kltxg");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[11]] = llllllllIlIIIII("Ez8aLSQZPhEraxg/BCkgAg==", "pPtYE");
        TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[3]] = llllllllIIlllII("uf1gXPHvVJsHmK0gHq3EHYZwpIYIZd+6", "jDlcp");
    }
    
    private static void llllllllIlIlllI() {
        (lIllIllIlIlIII = new int[14])[0] = (0x73 ^ 0x76);
        TileEntityHopper.lIllIllIlIlIII[1] = -" ".length();
        TileEntityHopper.lIllIllIlIlIII[2] = ((0x3A ^ 0x64 ^ (0xF2 ^ 0x9D)) & (0x80 ^ 0x8F ^ (0x99 ^ 0xA7) ^ -" ".length()));
        TileEntityHopper.lIllIllIlIlIII[3] = (20 + 73 + 5 + 47 ^ 149 + 12 - 70 + 64);
        TileEntityHopper.lIllIllIlIlIII[4] = " ".length();
        TileEntityHopper.lIllIllIlIlIII[5] = (0x4A ^ 0x42);
        TileEntityHopper.lIllIllIlIlIII[6] = "  ".length();
        TileEntityHopper.lIllIllIlIlIII[7] = "   ".length();
        TileEntityHopper.lIllIllIlIlIII[8] = (0x41 ^ 0x45);
        TileEntityHopper.lIllIllIlIlIII[9] = (0x76 ^ 0x70);
        TileEntityHopper.lIllIllIlIlIII[10] = (0x6C ^ 0x6B);
        TileEntityHopper.lIllIllIlIlIII[11] = (0x0 ^ 0x12 ^ (0xA5 ^ 0xBE));
        TileEntityHopper.lIllIllIlIlIII[12] = (192 + 185 - 338 + 172 ^ 80 + 38 - 75 + 104);
        TileEntityHopper.lIllIllIlIlIII[13] = (0xE5 ^ 0xA0 ^ (0x49 ^ 0x7));
    }
    
    private static ItemStack insertStack(final IInventory llllllllllllIllllllIlllIIIIllIlI, ItemStack llllllllllllIllllllIlllIIIIlIIII, final int llllllllllllIllllllIlllIIIIllIII, final EnumFacing llllllllllllIllllllIlllIIIIIlllI) {
        final ItemStack llllllllllllIllllllIlllIIIIlIllI = llllllllllllIllllllIlllIIIIllIlI.getStackInSlot(llllllllllllIllllllIlllIIIIllIII);
        if (llllllllIlIllll(canInsertItemInSlot(llllllllllllIllllllIlllIIIIllIlI, llllllllllllIllllllIlllIIIIlIIII, llllllllllllIllllllIlllIIIIllIII, llllllllllllIllllllIlllIIIIIlllI) ? 1 : 0)) {
            boolean llllllllllllIllllllIlllIIIIlIlIl = TileEntityHopper.lIllIllIlIlIII[2] != 0;
            if (llllllllIllllII(llllllllllllIllllllIlllIIIIlIllI)) {
                llllllllllllIllllllIlllIIIIllIlI.setInventorySlotContents(llllllllllllIllllllIlllIIIIllIII, llllllllllllIllllllIlllIIIIlIIII);
                llllllllllllIllllllIlllIIIIlIIII = null;
                llllllllllllIllllllIlllIIIIlIlIl = (TileEntityHopper.lIllIllIlIlIII[4] != 0);
                "".length();
                if (((168 + 151 - 263 + 157 ^ 49 + 10 - 8 + 86) & (56 + 65 - 18 + 141 ^ 88 + 164 - 195 + 111 ^ -" ".length())) < 0) {
                    return null;
                }
            }
            else if (llllllllIlIllll(canCombine(llllllllllllIllllllIlllIIIIlIllI, llllllllllllIllllllIlllIIIIlIIII) ? 1 : 0)) {
                final int llllllllllllIllllllIlllIIIIlIlII = llllllllllllIllllllIlllIIIIlIIII.getMaxStackSize() - llllllllllllIllllllIlllIIIIlIllI.stackSize;
                final int llllllllllllIllllllIlllIIIIlIIll = Math.min(llllllllllllIllllllIlllIIIIlIIII.stackSize, llllllllllllIllllllIlllIIIIlIlII);
                final ItemStack itemStack = llllllllllllIllllllIlllIIIIlIIII;
                itemStack.stackSize -= llllllllllllIllllllIlllIIIIlIIll;
                final ItemStack itemStack2 = llllllllllllIllllllIlllIIIIlIllI;
                itemStack2.stackSize += llllllllllllIllllllIlllIIIIlIIll;
                int n;
                if (llllllllIllIlll(llllllllllllIllllllIlllIIIIlIIll)) {
                    n = TileEntityHopper.lIllIllIlIlIII[4];
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return null;
                    }
                }
                else {
                    n = TileEntityHopper.lIllIllIlIlIII[2];
                }
                llllllllllllIllllllIlllIIIIlIlIl = (n != 0);
            }
            if (llllllllIlIllll(llllllllllllIllllllIlllIIIIlIlIl ? 1 : 0)) {
                if (llllllllIlIllll((llllllllllllIllllllIlllIIIIllIlI instanceof TileEntityHopper) ? 1 : 0)) {
                    final TileEntityHopper llllllllllllIllllllIlllIIIIlIIlI = (TileEntityHopper)llllllllllllIllllllIlllIIIIllIlI;
                    if (llllllllIlIllll(llllllllllllIllllllIlllIIIIlIIlI.mayTransfer() ? 1 : 0)) {
                        llllllllllllIllllllIlllIIIIlIIlI.setTransferCooldown(TileEntityHopper.lIllIllIlIlIII[5]);
                    }
                    llllllllllllIllllllIlllIIIIllIlI.markDirty();
                }
                llllllllllllIllllllIlllIIIIllIlI.markDirty();
            }
        }
        return llllllllllllIllllllIlllIIIIlIIII;
    }
    
    @Override
    public boolean isItemValidForSlot(final int llllllllllllIllllllIlllIlllIIIll, final ItemStack llllllllllllIllllllIlllIlllIIIlI) {
        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
    }
    
    @Override
    public double getXPos() {
        return this.pos.getX() + 0.5;
    }
    
    @Override
    public int getFieldCount() {
        return TileEntityHopper.lIllIllIlIlIII[2];
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer llllllllllllIllllllIlllIlllIlIIl) {
        int n;
        if (llllllllIlllIIl(this.worldObj.getTileEntity(this.pos), this)) {
            n = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (((82 + 0 - 11 + 70 ^ 128 + 112 - 77 + 5) & (117 + 8 - 91 + 127 ^ 85 + 25 - 84 + 106 ^ -" ".length())) != 0x0) {
                return ((0x85 ^ 0x99 ^ (0x1A ^ 0x13)) & (0x9 ^ 0x10 ^ (0x1D ^ 0x11) ^ -" ".length())) != 0x0;
            }
        }
        else if (llllllllIlllIlI(llllllllIlllIII(llllllllllllIllllllIlllIlllIlIIl.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = TileEntityHopper.lIllIllIlIlIII[4];
            "".length();
            if ((0xAB ^ 0xAF) < -" ".length()) {
                return ((0xD ^ 0x0) & ~(0xB0 ^ 0xBD)) != 0x0;
            }
        }
        else {
            n = TileEntityHopper.lIllIllIlIlIII[2];
        }
        return n != 0;
    }
    
    public void setCustomName(final String llllllllllllIllllllIlllIllllIIII) {
        this.customName = llllllllllllIllllllIlllIllllIIII;
    }
    
    public boolean updateHopper() {
        if (llllllllIllIIll(this.worldObj) && llllllllIllIlIl(this.worldObj.isRemote ? 1 : 0)) {
            if (llllllllIllIlIl(this.isOnTransferCooldown() ? 1 : 0) && llllllllIlIllll(BlockHopper.isEnabled(this.getBlockMetadata()) ? 1 : 0)) {
                boolean llllllllllllIllllllIlllIllIllIll = TileEntityHopper.lIllIllIlIlIII[2] != 0;
                if (llllllllIllIlIl(this.isEmpty() ? 1 : 0)) {
                    llllllllllllIllllllIlllIllIllIll = this.transferItemsOut();
                }
                if (llllllllIllIlIl(this.isFull() ? 1 : 0)) {
                    int n;
                    if (llllllllIllIlIl(captureDroppedItems(this) ? 1 : 0) && llllllllIllIlIl(llllllllllllIllllllIlllIllIllIll ? 1 : 0)) {
                        n = TileEntityHopper.lIllIllIlIlIII[2];
                        "".length();
                        if (null != null) {
                            return ((0x0 ^ 0x29 ^ (0x7A ^ 0x1E)) & (0x14 ^ 0x1A ^ (0x81 ^ 0xC2) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        n = TileEntityHopper.lIllIllIlIlIII[4];
                    }
                    llllllllllllIllllllIlllIllIllIll = (n != 0);
                }
                if (llllllllIlIllll(llllllllllllIllllllIlllIllIllIll ? 1 : 0)) {
                    this.setTransferCooldown(TileEntityHopper.lIllIllIlIlIII[5]);
                    this.markDirty();
                    return TileEntityHopper.lIllIllIlIlIII[4] != 0;
                }
            }
            return TileEntityHopper.lIllIllIlIlIII[2] != 0;
        }
        return TileEntityHopper.lIllIllIlIlIII[2] != 0;
    }
    
    private static boolean canExtractItemFromSlot(final IInventory llllllllllllIllllllIlllIIIlIIllI, final ItemStack llllllllllllIllllllIlllIIIlIlIIl, final int llllllllllllIllllllIlllIIIlIIlII, final EnumFacing llllllllllllIllllllIlllIIIlIIlll) {
        if (llllllllIlIllll((llllllllllllIllllllIlllIIIlIIllI instanceof ISidedInventory) ? 1 : 0) && llllllllIllIlIl(((ISidedInventory)llllllllllllIllllllIlllIIIlIIllI).canExtractItem(llllllllllllIllllllIlllIIIlIIlII, llllllllllllIllllllIlllIIIlIlIIl, llllllllllllIllllllIlllIIIlIIlll) ? 1 : 0)) {
            return TileEntityHopper.lIllIllIlIlIII[2] != 0;
        }
        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
    }
    
    private static boolean llllllllIlllIlI(final int llllllllllllIllllllIllIlIlIlIIII) {
        return llllllllllllIllllllIllIlIlIlIIII <= 0;
    }
    
    @Override
    public Container createContainer(final InventoryPlayer llllllllllllIllllllIllIllIlIllll, final EntityPlayer llllllllllllIllllllIllIllIllIIIl) {
        return new ContainerHopper(llllllllllllIllllllIllIllIlIllll, this, llllllllllllIllllllIllIllIllIIIl);
    }
    
    @Override
    public String getGuiID() {
        return TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[3]];
    }
    
    private boolean isInventoryFull(final IInventory llllllllllllIllllllIlllIlIIllllI, final EnumFacing llllllllllllIllllllIlllIlIlIIllI) {
        if (llllllllIlIllll((llllllllllllIllllllIlllIlIIllllI instanceof ISidedInventory) ? 1 : 0)) {
            final ISidedInventory llllllllllllIllllllIlllIlIlIIlIl = (ISidedInventory)llllllllllllIllllllIlllIlIIllllI;
            final int[] llllllllllllIllllllIlllIlIlIIlII = llllllllllllIllllllIlllIlIlIIlIl.getSlotsForFace(llllllllllllIllllllIlllIlIlIIllI);
            int llllllllllllIllllllIlllIlIlIIIll = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (null != null) {
                return ((0xF5 ^ 0xB1) & ~(0xC3 ^ 0x87)) != 0x0;
            }
            while (!llllllllIllIIlI(llllllllllllIllllllIlllIlIlIIIll, llllllllllllIllllllIlllIlIlIIlII.length)) {
                final ItemStack llllllllllllIllllllIlllIlIlIIIlI = llllllllllllIllllllIlllIlIlIIlIl.getStackInSlot(llllllllllllIllllllIlllIlIlIIlII[llllllllllllIllllllIlllIlIlIIIll]);
                if (!llllllllIllIIll(llllllllllllIllllllIlllIlIlIIIlI) || llllllllIlllIll(llllllllllllIllllllIlllIlIlIIIlI.stackSize, llllllllllllIllllllIlllIlIlIIIlI.getMaxStackSize())) {
                    return TileEntityHopper.lIllIllIlIlIII[2] != 0;
                }
                ++llllllllllllIllllllIlllIlIlIIIll;
            }
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0x4F ^ 0x2) & ~(0xD9 ^ 0x94)) != 0x0;
            }
        }
        else {
            final int llllllllllllIllllllIlllIlIlIIIIl = llllllllllllIllllllIlllIlIIllllI.getSizeInventory();
            int llllllllllllIllllllIlllIlIlIIIII = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0xAB ^ 0x8B) & ~(0x88 ^ 0xA8)) != 0x0;
            }
            while (!llllllllIllIIlI(llllllllllllIllllllIlllIlIlIIIII, llllllllllllIllllllIlllIlIlIIIIl)) {
                final ItemStack llllllllllllIllllllIlllIlIIlllll = llllllllllllIllllllIlllIlIIllllI.getStackInSlot(llllllllllllIllllllIlllIlIlIIIII);
                if (!llllllllIllIIll(llllllllllllIllllllIlllIlIIlllll) || llllllllIlllIll(llllllllllllIllllllIlllIlIIlllll.stackSize, llllllllllllIllllllIlllIlIIlllll.getMaxStackSize())) {
                    return TileEntityHopper.lIllIllIlIlIII[2] != 0;
                }
                ++llllllllllllIllllllIlllIlIlIIIII;
            }
        }
        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
    }
    
    @Override
    public void setField(final int llllllllllllIllllllIllIllIlIlIlI, final int llllllllllllIllllllIllIllIlIlIIl) {
    }
    
    @Override
    public String getName() {
        String customName;
        if (llllllllIlIllll(this.hasCustomName() ? 1 : 0)) {
            customName = this.customName;
            "".length();
            if ((61 + 17 - 18 + 112 ^ 123 + 155 - 111 + 1) == 0x0) {
                return null;
            }
        }
        else {
            customName = TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[11]];
        }
        return customName;
    }
    
    @Override
    public boolean hasCustomName() {
        if (llllllllIllIIll(this.customName) && llllllllIllIlll(this.customName.length())) {
            return TileEntityHopper.lIllIllIlIlIII[4] != 0;
        }
        return TileEntityHopper.lIllIllIlIlIII[2] != 0;
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int llllllllllllIllllllIllllIIIIlIIl) {
        if (llllllllIllIIll(this.inventory[llllllllllllIllllllIllllIIIIlIIl])) {
            final ItemStack llllllllllllIllllllIllllIIIIlIII = this.inventory[llllllllllllIllllllIllllIIIIlIIl];
            this.inventory[llllllllllllIllllllIllllIIIIlIIl] = null;
            return llllllllllllIllllllIllllIIIIlIII;
        }
        return null;
    }
    
    public boolean mayTransfer() {
        if (llllllllIllIlII(this.transferCooldown, TileEntityHopper.lIllIllIlIlIII[4])) {
            return TileEntityHopper.lIllIllIlIlIII[4] != 0;
        }
        return TileEntityHopper.lIllIllIlIlIII[2] != 0;
    }
    
    private static boolean canCombine(final ItemStack llllllllllllIllllllIllIlllIIlllI, final ItemStack llllllllllllIllllllIllIlllIIllIl) {
        int itemStackTagsEqual;
        if (llllllllIlllIIl(llllllllllllIllllllIllIlllIIlllI.getItem(), llllllllllllIllllllIllIlllIIllIl.getItem())) {
            itemStackTagsEqual = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (-" ".length() == " ".length()) {
                return ((9 + 140 - 102 + 94 ^ 23 + 30 - 43 + 180) & (0x17 ^ 0x44 ^ (0x22 ^ 0x42) ^ -" ".length())) != 0x0;
            }
        }
        else if (llllllllIlllIll(llllllllllllIllllllIllIlllIIlllI.getMetadata(), llllllllllllIllllllIllIlllIIllIl.getMetadata())) {
            itemStackTagsEqual = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((0x63 ^ 0x33) & ~(0x68 ^ 0x38)) != 0x0;
            }
        }
        else if (llllllllIllIllI(llllllllllllIllllllIllIlllIIlllI.stackSize, llllllllllllIllllllIllIlllIIlllI.getMaxStackSize())) {
            itemStackTagsEqual = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (" ".length() < 0) {
                return ((0x62 ^ 0x18 ^ (0x92 ^ 0xA4)) & (0x77 ^ 0x6D ^ (0xCA ^ 0x9C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            itemStackTagsEqual = (ItemStack.areItemStackTagsEqual(llllllllllllIllllllIllIlllIIlllI, llllllllllllIllllllIllIlllIIllIl) ? 1 : 0);
        }
        return itemStackTagsEqual != 0;
    }
    
    private static boolean llllllllIlllIIl(final Object llllllllllllIllllllIllIlIlIlllIl, final Object llllllllllllIllllllIllIlIlIlllII) {
        return llllllllllllIllllllIllIlIlIlllIl != llllllllllllIllllllIllIlIlIlllII;
    }
    
    public boolean isOnTransferCooldown() {
        if (llllllllIllIlll(this.transferCooldown)) {
            return TileEntityHopper.lIllIllIlIlIII[4] != 0;
        }
        return TileEntityHopper.lIllIllIlIlIII[2] != 0;
    }
    
    private static boolean llllllllIllIllI(final int llllllllllllIllllllIllIlIllIIIIl, final int llllllllllllIllllllIllIlIllIIIII) {
        return llllllllllllIllllllIllIlIllIIIIl > llllllllllllIllllllIllIlIllIIIII;
    }
    
    public TileEntityHopper() {
        this.inventory = new ItemStack[TileEntityHopper.lIllIllIlIlIII[0]];
        this.transferCooldown = TileEntityHopper.lIllIllIlIlIII[1];
    }
    
    private static boolean llllllllIllIIlI(final int llllllllllllIllllllIllIlIllIllIl, final int llllllllllllIllllllIllIlIllIllII) {
        return llllllllllllIllllllIllIlIllIllIl >= llllllllllllIllllllIllIlIllIllII;
    }
    
    @Override
    public int getField(final int llllllllllllIllllllIllIllIlIllII) {
        return TileEntityHopper.lIllIllIlIlIII[2];
    }
    
    public static boolean putDropInInventoryAllSlots(final IInventory llllllllllllIllllllIlllIIlIllIII, final EntityItem llllllllllllIllllllIlllIIlIlIlll) {
        boolean llllllllllllIllllllIlllIIlIlIllI = TileEntityHopper.lIllIllIlIlIII[2] != 0;
        if (llllllllIllllII(llllllllllllIllllllIlllIIlIlIlll)) {
            return TileEntityHopper.lIllIllIlIlIII[2] != 0;
        }
        final ItemStack llllllllllllIllllllIlllIIlIlIlIl = llllllllllllIllllllIlllIIlIlIlll.getEntityItem().copy();
        final ItemStack llllllllllllIllllllIlllIIlIlIlII = putStackInInventoryAllSlots(llllllllllllIllllllIlllIIlIllIII, llllllllllllIllllllIlllIIlIlIlIl, null);
        if (llllllllIllIIll(llllllllllllIllllllIlllIIlIlIlII) && llllllllIlIllll(llllllllllllIllllllIlllIIlIlIlII.stackSize)) {
            llllllllllllIllllllIlllIIlIlIlll.setEntityItemStack(llllllllllllIllllllIlllIIlIlIlII);
            "".length();
            if (((0x61 ^ 0x51 ^ (0xDB ^ 0xC4)) & (0x6D ^ 0x39 ^ (0x19 ^ 0x62) ^ -" ".length())) <= -" ".length()) {
                return ((0xC4 ^ 0xB5 ^ (0x1F ^ 0x56)) & (45 + 123 - 103 + 95 ^ 115 + 149 - 169 + 57 ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIllllllIlllIIlIlIllI = (TileEntityHopper.lIllIllIlIlIII[4] != 0);
            llllllllllllIllllllIlllIIlIlIlll.setDead();
        }
        return llllllllllllIllllllIlllIIlIlIllI;
    }
    
    public static List<EntityItem> func_181556_a(final World llllllllllllIllllllIllIllllllIII, final double llllllllllllIllllllIllIllllllIll, final double llllllllllllIllllllIllIlllllIllI, final double llllllllllllIllllllIllIlllllIlIl) {
        return llllllllllllIllllllIllIllllllIII.getEntitiesWithinAABB((Class<? extends EntityItem>)EntityItem.class, new AxisAlignedBB(llllllllllllIllllllIllIllllllIll - 0.5, llllllllllllIllllllIllIlllllIllI - 0.5, llllllllllllIllllllIllIlllllIlIl - 0.5, llllllllllllIllllllIllIllllllIll + 0.5, llllllllllllIllllllIllIlllllIllI + 0.5, llllllllllllIllllllIllIlllllIlIl + 0.5), (com.google.common.base.Predicate<? super EntityItem>)EntitySelectors.selectAnything);
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIllllllIllllIIlIllll) {
        super.writeToNBT(llllllllllllIllllllIllllIIlIllll);
        final NBTTagList llllllllllllIllllllIllllIIlIlllI = new NBTTagList();
        int llllllllllllIllllllIllllIIlIllIl = TileEntityHopper.lIllIllIlIlIII[2];
        "".length();
        if (-" ".length() > ((0x5 ^ 0x18) & ~(0x3D ^ 0x20))) {
            return;
        }
        while (!llllllllIllIIlI(llllllllllllIllllllIllllIIlIllIl, this.inventory.length)) {
            if (llllllllIllIIll(this.inventory[llllllllllllIllllllIllllIIlIllIl])) {
                final NBTTagCompound llllllllllllIllllllIllllIIlIllII = new NBTTagCompound();
                llllllllllllIllllllIllllIIlIllII.setByte(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[0]], (byte)llllllllllllIllllllIllllIIlIllIl);
                this.inventory[llllllllllllIllllllIllllIIlIllIl].writeToNBT(llllllllllllIllllllIllllIIlIllII);
                "".length();
                llllllllllllIllllllIllllIIlIlllI.appendTag(llllllllllllIllllllIllllIIlIllII);
            }
            ++llllllllllllIllllllIllllIIlIllIl;
        }
        llllllllllllIllllllIllllIIlIllll.setTag(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[9]], llllllllllllIllllllIllllIIlIlllI);
        llllllllllllIllllllIllllIIlIllll.setInteger(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[10]], this.transferCooldown);
        if (llllllllIlIllll(this.hasCustomName() ? 1 : 0)) {
            llllllllllllIllllllIllllIIlIllll.setString(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[5]], this.customName);
        }
    }
    
    private static boolean llllllllIllllII(final Object llllllllllllIllllllIllIlIlIllIII) {
        return llllllllllllIllllllIllIlIlIllIII == null;
    }
    
    private static String llllllllIIlllll(final String llllllllllllIllllllIllIllIIllIII, final String llllllllllllIllllllIllIllIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllllllIllIllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIllIllIIlIlll.getBytes(StandardCharsets.UTF_8)), TileEntityHopper.lIllIllIlIlIII[5]), "DES");
            final Cipher llllllllllllIllllllIllIllIIlllII = Cipher.getInstance("DES");
            llllllllllllIllllllIllIllIIlllII.init(TileEntityHopper.lIllIllIlIlIII[6], llllllllllllIllllllIllIllIIlllIl);
            return new String(llllllllllllIllllllIllIllIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIllIllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIllIllIIllIll) {
            llllllllllllIllllllIllIllIIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getSizeInventory() {
        return this.inventory.length;
    }
    
    private IInventory getInventoryForHopperTransfer() {
        final EnumFacing llllllllllllIllllllIlllIIIIIIllI = BlockHopper.getFacing(this.getBlockMetadata());
        return getInventoryAtPosition(this.getWorld(), this.pos.getX() + llllllllllllIllllllIlllIIIIIIllI.getFrontOffsetX(), this.pos.getY() + llllllllllllIllllllIlllIIIIIIllI.getFrontOffsetY(), this.pos.getZ() + llllllllllllIllllllIlllIIIIIIllI.getFrontOffsetZ());
    }
    
    private static boolean llllllllIllIIll(final Object llllllllllllIllllllIllIlIlIllIlI) {
        return llllllllllllIllllllIllIlIlIllIlI != null;
    }
    
    public static boolean captureDroppedItems(final IHopper llllllllllllIllllllIlllIIllllIII) {
        final IInventory llllllllllllIllllllIlllIlIIIIIII = getHopperInventory(llllllllllllIllllllIlllIIllllIII);
        if (llllllllIllIIll(llllllllllllIllllllIlllIlIIIIIII)) {
            final EnumFacing llllllllllllIllllllIlllIIlllllll = EnumFacing.DOWN;
            if (llllllllIlIllll(isInventoryEmpty(llllllllllllIllllllIlllIlIIIIIII, llllllllllllIllllllIlllIIlllllll) ? 1 : 0)) {
                return TileEntityHopper.lIllIllIlIlIII[2] != 0;
            }
            if (llllllllIlIllll((llllllllllllIllllllIlllIlIIIIIII instanceof ISidedInventory) ? 1 : 0)) {
                final ISidedInventory llllllllllllIllllllIlllIIllllllI = (ISidedInventory)llllllllllllIllllllIlllIlIIIIIII;
                final int[] llllllllllllIllllllIlllIIlllllIl = llllllllllllIllllllIlllIIllllllI.getSlotsForFace(llllllllllllIllllllIlllIIlllllll);
                int llllllllllllIllllllIlllIIlllllII = TileEntityHopper.lIllIllIlIlIII[2];
                "".length();
                if (null != null) {
                    return ((0x1 ^ 0x52) & ~(0x57 ^ 0x4)) != 0x0;
                }
                while (!llllllllIllIIlI(llllllllllllIllllllIlllIIlllllII, llllllllllllIllllllIlllIIlllllIl.length)) {
                    if (llllllllIlIllll(pullItemFromSlot(llllllllllllIllllllIlllIIllllIII, llllllllllllIllllllIlllIlIIIIIII, llllllllllllIllllllIlllIIlllllIl[llllllllllllIllllllIlllIIlllllII], llllllllllllIllllllIlllIIlllllll) ? 1 : 0)) {
                        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
                    }
                    ++llllllllllllIllllllIlllIIlllllII;
                }
                "".length();
                if (-(0x43 ^ 0x47) >= 0) {
                    return ((0x10 ^ 0x35) & ~(0x32 ^ 0x17)) != 0x0;
                }
            }
            else {
                final int llllllllllllIllllllIlllIIllllIll = llllllllllllIllllllIlllIlIIIIIII.getSizeInventory();
                int llllllllllllIllllllIlllIIllllIlI = TileEntityHopper.lIllIllIlIlIII[2];
                "".length();
                if ("  ".length() > "  ".length()) {
                    return ((0xCE ^ 0x80) & ~(0x8E ^ 0xC0)) != 0x0;
                }
                while (!llllllllIllIIlI(llllllllllllIllllllIlllIIllllIlI, llllllllllllIllllllIlllIIllllIll)) {
                    if (llllllllIlIllll(pullItemFromSlot(llllllllllllIllllllIlllIIllllIII, llllllllllllIllllllIlllIlIIIIIII, llllllllllllIllllllIlllIIllllIlI, llllllllllllIllllllIlllIIlllllll) ? 1 : 0)) {
                        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
                    }
                    ++llllllllllllIllllllIlllIIllllIlI;
                }
                "".length();
                if ((0x41 ^ 0x2E ^ (0xF9 ^ 0x92)) == 0x0) {
                    return ((0xF4 ^ 0x97 ^ (0xB1 ^ 0x8D)) & (136 + 136 - 186 + 120 ^ 36 + 12 + 10 + 87 ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            final Iterator<EntityItem> iterator = func_181556_a(llllllllllllIllllllIlllIIllllIII.getWorld(), llllllllllllIllllllIlllIIllllIII.getXPos(), llllllllllllIllllllIlllIIllllIII.getYPos() + 1.0, llllllllllllIllllllIlllIIllllIII.getZPos()).iterator();
            "".length();
            if (" ".length() > " ".length()) {
                return ((0x70 ^ 0x2F) & ~(0x7D ^ 0x22)) != 0x0;
            }
            while (!llllllllIllIlIl(iterator.hasNext() ? 1 : 0)) {
                final EntityItem llllllllllllIllllllIlllIIllllIIl = iterator.next();
                if (llllllllIlIllll(putDropInInventoryAllSlots(llllllllllllIllllllIlllIIllllIII, llllllllllllIllllllIlllIIllllIIl) ? 1 : 0)) {
                    return TileEntityHopper.lIllIllIlIlIII[4] != 0;
                }
            }
        }
        return TileEntityHopper.lIllIllIlIlIII[2] != 0;
    }
    
    private static String llllllllIlIIIII(String llllllllllllIllllllIllIllIIIIlIl, final String llllllllllllIllllllIllIllIIIlIIl) {
        llllllllllllIllllllIllIllIIIIlIl = new String(Base64.getDecoder().decode(llllllllllllIllllllIllIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIllIllIIIlIII = new StringBuilder();
        final char[] llllllllllllIllllllIllIllIIIIlll = llllllllllllIllllllIllIllIIIlIIl.toCharArray();
        int llllllllllllIllllllIllIllIIIIllI = TileEntityHopper.lIllIllIlIlIII[2];
        final String llllllllllllIllllllIllIllIIIIIII = (Object)llllllllllllIllllllIllIllIIIIlIl.toCharArray();
        final short llllllllllllIllllllIllIlIlllllll = (short)llllllllllllIllllllIllIllIIIIIII.length;
        byte llllllllllllIllllllIllIlIllllllI = (byte)TileEntityHopper.lIllIllIlIlIII[2];
        while (llllllllIllIIIl(llllllllllllIllllllIllIlIllllllI, llllllllllllIllllllIllIlIlllllll)) {
            final char llllllllllllIllllllIllIllIIIlIll = llllllllllllIllllllIllIllIIIIIII[llllllllllllIllllllIllIlIllllllI];
            llllllllllllIllllllIllIllIIIlIII.append((char)(llllllllllllIllllllIllIllIIIlIll ^ llllllllllllIllllllIllIllIIIIlll[llllllllllllIllllllIllIllIIIIllI % llllllllllllIllllllIllIllIIIIlll.length]));
            "".length();
            ++llllllllllllIllllllIllIllIIIIllI;
            ++llllllllllllIllllllIllIlIllllllI;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIllIllIIIlIII);
    }
    
    @Override
    public void openInventory(final EntityPlayer llllllllllllIllllllIlllIlllIIlll) {
    }
    
    @Override
    public void setInventorySlotContents(final int llllllllllllIllllllIlllIllllllIl, final ItemStack llllllllllllIllllllIlllIllllllll) {
        this.inventory[llllllllllllIllllllIlllIllllllIl] = llllllllllllIllllllIlllIllllllll;
        if (llllllllIllIIll(llllllllllllIllllllIlllIllllllll) && llllllllIllIllI(llllllllllllIllllllIlllIllllllll.stackSize, this.getInventoryStackLimit())) {
            llllllllllllIllllllIlllIllllllll.stackSize = this.getInventoryStackLimit();
        }
    }
    
    @Override
    public void update() {
        if (llllllllIllIIll(this.worldObj) && llllllllIllIlIl(this.worldObj.isRemote ? 1 : 0)) {
            this.transferCooldown -= TileEntityHopper.lIllIllIlIlIII[4];
            if (llllllllIllIlIl(this.isOnTransferCooldown() ? 1 : 0)) {
                this.setTransferCooldown(TileEntityHopper.lIllIllIlIlIII[2]);
                this.updateHopper();
                "".length();
            }
        }
    }
    
    @Override
    public int getInventoryStackLimit() {
        return TileEntityHopper.lIllIllIlIlIII[12];
    }
    
    private static String llllllllIIlllII(final String llllllllllllIllllllIllIlIlllIlIl, final String llllllllllllIllllllIllIlIlllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllllIllIlIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIllIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIllIlIlllIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIllIlIlllIlll.init(TileEntityHopper.lIllIllIlIlIII[6], llllllllllllIllllllIllIlIllllIII);
            return new String(llllllllllllIllllllIllIlIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIllIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIllIlIlllIllI) {
            llllllllllllIllllllIllIlIlllIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void clear() {
        int llllllllllllIllllllIllIllIlIIlII = TileEntityHopper.lIllIllIlIlIII[2];
        "".length();
        if (((0x18 ^ 0x23) & ~(0x96 ^ 0xAD)) > " ".length()) {
            return;
        }
        while (!llllllllIllIIlI(llllllllllllIllllllIllIllIlIIlII, this.inventory.length)) {
            this.inventory[llllllllllllIllllllIllIllIlIIlII] = null;
            ++llllllllllllIllllllIllIllIlIIlII;
        }
    }
    
    @Override
    public ItemStack decrStackSize(final int llllllllllllIllllllIllllIIIlIlIl, final int llllllllllllIllllllIllllIIIIllll) {
        if (!llllllllIllIIll(this.inventory[llllllllllllIllllllIllllIIIlIlIl])) {
            return null;
        }
        if (llllllllIllIlII(this.inventory[llllllllllllIllllllIllllIIIlIlIl].stackSize, llllllllllllIllllllIllllIIIIllll)) {
            final ItemStack llllllllllllIllllllIllllIIIlIIll = this.inventory[llllllllllllIllllllIllllIIIlIlIl];
            this.inventory[llllllllllllIllllllIllllIIIlIlIl] = null;
            return llllllllllllIllllllIllllIIIlIIll;
        }
        final ItemStack llllllllllllIllllllIllllIIIlIIlI = this.inventory[llllllllllllIllllllIllllIIIlIlIl].splitStack(llllllllllllIllllllIllllIIIIllll);
        if (llllllllIllIlIl(this.inventory[llllllllllllIllllllIllllIIIlIlIl].stackSize)) {
            this.inventory[llllllllllllIllllllIllllIIIlIlIl] = null;
        }
        return llllllllllllIllllllIllllIIIlIIlI;
    }
    
    private boolean transferItemsOut() {
        final IInventory llllllllllllIllllllIlllIlIlllIIl = this.getInventoryForHopperTransfer();
        if (llllllllIllllII(llllllllllllIllllllIlllIlIlllIIl)) {
            return TileEntityHopper.lIllIllIlIlIII[2] != 0;
        }
        final EnumFacing llllllllllllIllllllIlllIlIlllIII = BlockHopper.getFacing(this.getBlockMetadata()).getOpposite();
        if (llllllllIlIllll(this.isInventoryFull(llllllllllllIllllllIlllIlIlllIIl, llllllllllllIllllllIlllIlIlllIII) ? 1 : 0)) {
            return TileEntityHopper.lIllIllIlIlIII[2] != 0;
        }
        int llllllllllllIllllllIlllIlIllIlll = TileEntityHopper.lIllIllIlIlIII[2];
        "".length();
        if (-" ".length() >= 0) {
            return ((0x41 ^ 0x7) & ~(0xEA ^ 0xAC)) != 0x0;
        }
        while (!llllllllIllIIlI(llllllllllllIllllllIlllIlIllIlll, this.getSizeInventory())) {
            if (llllllllIllIIll(this.getStackInSlot(llllllllllllIllllllIlllIlIllIlll))) {
                final ItemStack llllllllllllIllllllIlllIlIllIllI = this.getStackInSlot(llllllllllllIllllllIlllIlIllIlll).copy();
                final ItemStack llllllllllllIllllllIlllIlIllIlIl = putStackInInventoryAllSlots(llllllllllllIllllllIlllIlIlllIIl, this.decrStackSize(llllllllllllIllllllIlllIlIllIlll, TileEntityHopper.lIllIllIlIlIII[4]), llllllllllllIllllllIlllIlIlllIII);
                if (!llllllllIllIIll(llllllllllllIllllllIlllIlIllIlIl) || llllllllIllIlIl(llllllllllllIllllllIlllIlIllIlIl.stackSize)) {
                    llllllllllllIllllllIlllIlIlllIIl.markDirty();
                    return TileEntityHopper.lIllIllIlIlIII[4] != 0;
                }
                this.setInventorySlotContents(llllllllllllIllllllIlllIlIllIlll, llllllllllllIllllllIlllIlIllIllI);
            }
            ++llllllllllllIllllllIlllIlIllIlll;
        }
        return TileEntityHopper.lIllIllIlIlIII[2] != 0;
    }
    
    private static boolean pullItemFromSlot(final IHopper llllllllllllIllllllIlllIIllIIlII, final IInventory llllllllllllIllllllIlllIIllIlIlI, final int llllllllllllIllllllIlllIIllIIIlI, final EnumFacing llllllllllllIllllllIlllIIllIlIII) {
        final ItemStack llllllllllllIllllllIlllIIllIIlll = llllllllllllIllllllIlllIIllIlIlI.getStackInSlot(llllllllllllIllllllIlllIIllIIIlI);
        if (llllllllIllIIll(llllllllllllIllllllIlllIIllIIlll) && llllllllIlIllll(canExtractItemFromSlot(llllllllllllIllllllIlllIIllIlIlI, llllllllllllIllllllIlllIIllIIlll, llllllllllllIllllllIlllIIllIIIlI, llllllllllllIllllllIlllIIllIlIII) ? 1 : 0)) {
            final ItemStack llllllllllllIllllllIlllIIllIIllI = llllllllllllIllllllIlllIIllIIlll.copy();
            final ItemStack llllllllllllIllllllIlllIIllIIlIl = putStackInInventoryAllSlots(llllllllllllIllllllIlllIIllIIlII, llllllllllllIllllllIlllIIllIlIlI.decrStackSize(llllllllllllIllllllIlllIIllIIIlI, TileEntityHopper.lIllIllIlIlIII[4]), null);
            if (!llllllllIllIIll(llllllllllllIllllllIlllIIllIIlIl) || llllllllIllIlIl(llllllllllllIllllllIlllIIllIIlIl.stackSize)) {
                llllllllllllIllllllIlllIIllIlIlI.markDirty();
                return TileEntityHopper.lIllIllIlIlIII[4] != 0;
            }
            llllllllllllIllllllIlllIIllIlIlI.setInventorySlotContents(llllllllllllIllllllIlllIIllIIIlI, llllllllllllIllllllIlllIIllIIllI);
        }
        return TileEntityHopper.lIllIllIlIlIII[2] != 0;
    }
    
    @Override
    public void markDirty() {
        super.markDirty();
    }
    
    private static boolean llllllllIllIIII(final int llllllllllllIllllllIllIlIlIlIIlI) {
        return llllllllllllIllllllIllIlIlIlIIlI >= 0;
    }
    
    public void setTransferCooldown(final int llllllllllllIllllllIllIlllIIIIII) {
        this.transferCooldown = llllllllllllIllllllIllIlllIIIIII;
    }
    
    private static boolean llllllllIllIIIl(final int llllllllllllIllllllIllIlIllIlIIl, final int llllllllllllIllllllIllIlIllIlIII) {
        return llllllllllllIllllllIllIlIllIlIIl < llllllllllllIllllllIllIlIllIlIII;
    }
    
    private static boolean isInventoryEmpty(final IInventory llllllllllllIllllllIlllIlIIIllII, final EnumFacing llllllllllllIllllllIlllIlIIIlIll) {
        if (llllllllIlIllll((llllllllllllIllllllIlllIlIIIllII instanceof ISidedInventory) ? 1 : 0)) {
            final ISidedInventory llllllllllllIllllllIlllIlIIlIIIl = (ISidedInventory)llllllllllllIllllllIlllIlIIIllII;
            final int[] llllllllllllIllllllIlllIlIIlIIII = llllllllllllIllllllIlllIlIIlIIIl.getSlotsForFace(llllllllllllIllllllIlllIlIIIlIll);
            int llllllllllllIllllllIlllIlIIIllll = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if ("   ".length() <= 0) {
                return ((0xBD ^ 0x97) & ~(0x71 ^ 0x5B)) != 0x0;
            }
            while (!llllllllIllIIlI(llllllllllllIllllllIlllIlIIIllll, llllllllllllIllllllIlllIlIIlIIII.length)) {
                if (llllllllIllIIll(llllllllllllIllllllIlllIlIIlIIIl.getStackInSlot(llllllllllllIllllllIlllIlIIlIIII[llllllllllllIllllllIlllIlIIIllll]))) {
                    return TileEntityHopper.lIllIllIlIlIII[2] != 0;
                }
                ++llllllllllllIllllllIlllIlIIIllll;
            }
            "".length();
            if (" ".length() <= 0) {
                return ((0x95 ^ 0x8C) & ~(0xDE ^ 0xC7)) != 0x0;
            }
        }
        else {
            final int llllllllllllIllllllIlllIlIIIlllI = llllllllllllIllllllIlllIlIIIllII.getSizeInventory();
            int llllllllllllIllllllIlllIlIIIllIl = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (" ".length() > "  ".length()) {
                return ((0x0 ^ 0x57) & ~(0x64 ^ 0x33)) != 0x0;
            }
            while (!llllllllIllIIlI(llllllllllllIllllllIlllIlIIIllIl, llllllllllllIllllllIlllIlIIIlllI)) {
                if (llllllllIllIIll(llllllllllllIllllllIlllIlIIIllII.getStackInSlot(llllllllllllIllllllIlllIlIIIllIl))) {
                    return TileEntityHopper.lIllIllIlIlIII[2] != 0;
                }
                ++llllllllllllIllllllIlllIlIIIllIl;
            }
        }
        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
    }
    
    static {
        llllllllIlIlllI();
        llllllllIlIIIIl();
    }
    
    private static boolean llllllllIlllIll(final int llllllllllllIllllllIllIlIlIIlIll, final int llllllllllllIllllllIllIlIlIIlIlI) {
        return llllllllllllIllllllIllIlIlIIlIll != llllllllllllIllllllIllIlIlIIlIlI;
    }
    
    private static boolean llllllllIllIlIl(final int llllllllllllIllllllIllIlIlIlIlII) {
        return llllllllllllIllllllIllIlIlIlIlII == 0;
    }
    
    private static boolean llllllllIllIlll(final int llllllllllllIllllllIllIlIlIIlllI) {
        return llllllllllllIllllllIllIlIlIIlllI > 0;
    }
    
    @Override
    public double getZPos() {
        return this.pos.getZ() + 0.5;
    }
    
    @Override
    public void closeInventory(final EntityPlayer llllllllllllIllllllIlllIlllIIlIl) {
    }
    
    private static boolean llllllllIlIllll(final int llllllllllllIllllllIllIlIlIlIllI) {
        return llllllllllllIllllllIllIlIlIlIllI != 0;
    }
    
    private static int llllllllIlllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public double getYPos() {
        return this.pos.getY() + 0.5;
    }
    
    public static IInventory getInventoryAtPosition(final World llllllllllllIllllllIllIllllIlIIl, final double llllllllllllIllllllIllIlllIlllII, final double llllllllllllIllllllIllIllllIIlll, final double llllllllllllIllllllIllIlllIllIlI) {
        IInventory llllllllllllIllllllIllIllllIIlIl = null;
        final int llllllllllllIllllllIllIllllIIlII = MathHelper.floor_double(llllllllllllIllllllIllIlllIlllII);
        final int llllllllllllIllllllIllIllllIIIll = MathHelper.floor_double(llllllllllllIllllllIllIllllIIlll);
        final int llllllllllllIllllllIllIllllIIIlI = MathHelper.floor_double(llllllllllllIllllllIllIlllIllIlI);
        final BlockPos llllllllllllIllllllIllIllllIIIIl = new BlockPos(llllllllllllIllllllIllIllllIIlII, llllllllllllIllllllIllIllllIIIll, llllllllllllIllllllIllIllllIIIlI);
        final Block llllllllllllIllllllIllIllllIIIII = llllllllllllIllllllIllIllllIlIIl.getBlockState(llllllllllllIllllllIllIllllIIIIl).getBlock();
        if (llllllllIlIllll(llllllllllllIllllllIllIllllIIIII.hasTileEntity() ? 1 : 0)) {
            final TileEntity llllllllllllIllllllIllIlllIlllll = llllllllllllIllllllIllIllllIlIIl.getTileEntity(llllllllllllIllllllIllIllllIIIIl);
            if (llllllllIlIllll((llllllllllllIllllllIllIlllIlllll instanceof IInventory) ? 1 : 0)) {
                llllllllllllIllllllIllIllllIIlIl = (IInventory)llllllllllllIllllllIllIlllIlllll;
                if (llllllllIlIllll((llllllllllllIllllllIllIllllIIlIl instanceof TileEntityChest) ? 1 : 0) && llllllllIlIllll((llllllllllllIllllllIllIllllIIIII instanceof BlockChest) ? 1 : 0)) {
                    llllllllllllIllllllIllIllllIIlIl = ((BlockChest)llllllllllllIllllllIllIllllIIIII).getLockableContainer(llllllllllllIllllllIllIllllIlIIl, llllllllllllIllllllIllIllllIIIIl);
                }
            }
        }
        if (llllllllIllllII(llllllllllllIllllllIllIllllIIlIl)) {
            final List<Entity> llllllllllllIllllllIllIlllIllllI = llllllllllllIllllllIllIllllIlIIl.getEntitiesInAABBexcluding(null, new AxisAlignedBB(llllllllllllIllllllIllIlllIlllII - 0.5, llllllllllllIllllllIllIllllIIlll - 0.5, llllllllllllIllllllIllIlllIllIlI - 0.5, llllllllllllIllllllIllIlllIlllII + 0.5, llllllllllllIllllllIllIllllIIlll + 0.5, llllllllllllIllllllIllIlllIllIlI + 0.5), EntitySelectors.selectInventories);
            if (llllllllIllIlll(llllllllllllIllllllIllIlllIllllI.size())) {
                llllllllllllIllllllIllIllllIIlIl = (IInventory)llllllllllllIllllllIllIlllIllllI.get(llllllllllllIllllllIllIllllIlIIl.rand.nextInt(llllllllllllIllllllIllIlllIllllI.size()));
            }
        }
        return llllllllllllIllllllIllIllllIIlIl;
    }
    
    private boolean isFull() {
        final int llllllllllllIllllllIlllIllIIIIIl;
        final byte llllllllllllIllllllIlllIllIIIIlI = (byte)((ItemStack[])(Object)(llllllllllllIllllllIlllIllIIIIIl = (int)(Object)this.inventory)).length;
        long llllllllllllIllllllIlllIllIIIIll = TileEntityHopper.lIllIllIlIlIII[2];
        "".length();
        if (" ".length() < 0) {
            return ((0x68 ^ 0x62) & ~(0x63 ^ 0x69)) != 0x0;
        }
        while (!llllllllIllIIlI((int)llllllllllllIllllllIlllIllIIIIll, llllllllllllIllllllIlllIllIIIIlI)) {
            final ItemStack llllllllllllIllllllIlllIllIIIllI = llllllllllllIllllllIlllIllIIIIIl[llllllllllllIllllllIlllIllIIIIll];
            if (!llllllllIllIIll(llllllllllllIllllllIlllIllIIIllI) || llllllllIlllIll(llllllllllllIllllllIlllIllIIIllI.stackSize, llllllllllllIllllllIlllIllIIIllI.getMaxStackSize())) {
                return TileEntityHopper.lIllIllIlIlIII[2] != 0;
            }
            ++llllllllllllIllllllIlllIllIIIIll;
        }
        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
    }
    
    private static boolean llllllllIllIlII(final int llllllllllllIllllllIllIlIllIIlIl, final int llllllllllllIllllllIllIlIllIIlII) {
        return llllllllllllIllllllIllIlIllIIlIl <= llllllllllllIllllllIllIlIllIIlII;
    }
    
    private boolean isEmpty() {
        final double llllllllllllIllllllIlllIllIIllIl;
        final byte llllllllllllIllllllIlllIllIIlllI = (byte)((ItemStack[])(Object)(llllllllllllIllllllIlllIllIIllIl = (double)(Object)this.inventory)).length;
        long llllllllllllIllllllIlllIllIIllll = TileEntityHopper.lIllIllIlIlIII[2];
        "".length();
        if ((0x8C ^ 0x88) < "  ".length()) {
            return ((0x1A ^ 0x4D) & ~(0xE5 ^ 0xB2)) != 0x0;
        }
        while (!llllllllIllIIlI((int)llllllllllllIllllllIlllIllIIllll, llllllllllllIllllllIlllIllIIlllI)) {
            final ItemStack llllllllllllIllllllIlllIllIlIIlI = llllllllllllIllllllIlllIllIIllIl[llllllllllllIllllllIlllIllIIllll];
            if (llllllllIllIIll(llllllllllllIllllllIlllIllIlIIlI)) {
                return TileEntityHopper.lIllIllIlIlIII[2] != 0;
            }
            ++llllllllllllIllllllIlllIllIIllll;
        }
        return TileEntityHopper.lIllIllIlIlIII[4] != 0;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIllllllIllllIlIIIIII) {
        super.readFromNBT(llllllllllllIllllllIllllIlIIIIII);
        final NBTTagList llllllllllllIllllllIllllIIllllll = llllllllllllIllllllIllllIlIIIIII.getTagList(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[2]], TileEntityHopper.lIllIllIlIlIII[3]);
        this.inventory = new ItemStack[this.getSizeInventory()];
        if (llllllllIlIllll(llllllllllllIllllllIllllIlIIIIII.hasKey(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[4]], TileEntityHopper.lIllIllIlIlIII[5]) ? 1 : 0)) {
            this.customName = llllllllllllIllllllIllllIlIIIIII.getString(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[6]]);
        }
        this.transferCooldown = llllllllllllIllllllIllllIlIIIIII.getInteger(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[7]]);
        int llllllllllllIllllllIllllIIlllllI = TileEntityHopper.lIllIllIlIlIII[2];
        "".length();
        if ((0x4 ^ 0x2 ^ "  ".length()) <= 0) {
            return;
        }
        while (!llllllllIllIIlI(llllllllllllIllllllIllllIIlllllI, llllllllllllIllllllIllllIIllllll.tagCount())) {
            final NBTTagCompound llllllllllllIllllllIllllIIllllIl = llllllllllllIllllllIllllIIllllll.getCompoundTagAt(llllllllllllIllllllIllllIIlllllI);
            final int llllllllllllIllllllIllllIIllllII = llllllllllllIllllllIllllIIllllIl.getByte(TileEntityHopper.lIllIllIlIIllI[TileEntityHopper.lIllIllIlIlIII[8]]);
            if (llllllllIllIIII(llllllllllllIllllllIllllIIllllII) && llllllllIllIIIl(llllllllllllIllllllIllllIIllllII, this.inventory.length)) {
                this.inventory[llllllllllllIllllllIllllIIllllII] = ItemStack.loadItemStackFromNBT(llllllllllllIllllllIllllIIllllIl);
            }
            ++llllllllllllIllllllIllllIIlllllI;
        }
    }
    
    private static boolean canInsertItemInSlot(final IInventory llllllllllllIllllllIlllIIIllIllI, final ItemStack llllllllllllIllllllIlllIIIllIlIl, final int llllllllllllIllllllIlllIIIllIlII, final EnumFacing llllllllllllIllllllIlllIIIllIIll) {
        int n;
        if (llllllllIllIlIl(llllllllllllIllllllIlllIIIllIllI.isItemValidForSlot(llllllllllllIllllllIlllIIIllIlII, llllllllllllIllllllIlllIIIllIlIl) ? 1 : 0)) {
            n = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (" ".length() < 0) {
                return ((99 + 144 - 81 + 16 ^ 127 + 108 - 179 + 102) & (50 + 107 - 46 + 63 ^ 65 + 41 - 72 + 96 ^ -" ".length())) != 0x0;
            }
        }
        else if (llllllllIlIllll((llllllllllllIllllllIlllIIIllIllI instanceof ISidedInventory) ? 1 : 0) && llllllllIllIlIl(((ISidedInventory)llllllllllllIllllllIlllIIIllIllI).canInsertItem(llllllllllllIllllllIlllIIIllIlII, llllllllllllIllllllIlllIIIllIlIl, llllllllllllIllllllIlllIIIllIIll) ? 1 : 0)) {
            n = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return ((24 + 124 - 147 + 195 ^ 120 + 122 - 142 + 30) & (98 + 32 - 21 + 18 ^ (0x28 ^ 0x11) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = TileEntityHopper.lIllIllIlIlIII[4];
        }
        return n != 0;
    }
    
    public static ItemStack putStackInInventoryAllSlots(final IInventory llllllllllllIllllllIlllIIlIIlIII, ItemStack llllllllllllIllllllIlllIIIllllll, final EnumFacing llllllllllllIllllllIlllIIIlllllI) {
        if (llllllllIlIllll((llllllllllllIllllllIlllIIlIIlIII instanceof ISidedInventory) ? 1 : 0) && llllllllIllIIll(llllllllllllIllllllIlllIIIlllllI)) {
            final ISidedInventory llllllllllllIllllllIlllIIlIIIlIl = (ISidedInventory)llllllllllllIllllllIlllIIlIIlIII;
            final int[] llllllllllllIllllllIlllIIlIIIlII = llllllllllllIllllllIlllIIlIIIlIl.getSlotsForFace(llllllllllllIllllllIlllIIIlllllI);
            int llllllllllllIllllllIlllIIlIIIIll = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
            while (llllllllIllIIIl(llllllllllllIllllllIlllIIlIIIIll, llllllllllllIllllllIlllIIlIIIlII.length) && llllllllIllIIll(llllllllllllIllllllIlllIIIllllll)) {
                if (llllllllIlllIlI(((ItemStack)llllllllllllIllllllIlllIIIllllll).stackSize)) {
                    "".length();
                    if ("  ".length() == -" ".length()) {
                        return null;
                    }
                    break;
                }
                else {
                    llllllllllllIllllllIlllIIIllllll = insertStack(llllllllllllIllllllIlllIIlIIlIII, (ItemStack)llllllllllllIllllllIlllIIIllllll, llllllllllllIllllllIlllIIlIIIlII[llllllllllllIllllllIlllIIlIIIIll], llllllllllllIllllllIlllIIIlllllI);
                    ++llllllllllllIllllllIlllIIlIIIIll;
                }
            }
        }
        else {
            final int llllllllllllIllllllIlllIIlIIIIlI = llllllllllllIllllllIlllIIlIIlIII.getSizeInventory();
            int llllllllllllIllllllIlllIIlIIIIIl = TileEntityHopper.lIllIllIlIlIII[2];
            "".length();
            if ((0x7 ^ 0x12 ^ (0x62 ^ 0x73)) <= 0) {
                return null;
            }
            while (llllllllIllIIIl(llllllllllllIllllllIlllIIlIIIIIl, llllllllllllIllllllIlllIIlIIIIlI) && llllllllIllIIll(llllllllllllIllllllIlllIIIllllll) && !llllllllIlllIlI(((ItemStack)llllllllllllIllllllIlllIIIllllll).stackSize)) {
                llllllllllllIllllllIlllIIIllllll = insertStack(llllllllllllIllllllIlllIIlIIlIII, (ItemStack)llllllllllllIllllllIlllIIIllllll, llllllllllllIllllllIlllIIlIIIIIl, llllllllllllIllllllIlllIIIlllllI);
                ++llllllllllllIllllllIlllIIlIIIIIl;
            }
        }
        if (llllllllIllIIll(llllllllllllIllllllIlllIIIllllll) && llllllllIllIlIl(((ItemStack)llllllllllllIllllllIlllIIIllllll).stackSize)) {
            llllllllllllIllllllIlllIIIllllll = null;
        }
        return (ItemStack)llllllllllllIllllllIlllIIIllllll;
    }
    
    public static IInventory getHopperInventory(final IHopper llllllllllllIllllllIlllIIIIIIIlI) {
        return getInventoryAtPosition(llllllllllllIllllllIlllIIIIIIIlI.getWorld(), llllllllllllIllllllIlllIIIIIIIlI.getXPos(), llllllllllllIllllllIlllIIIIIIIlI.getYPos() + 1.0, llllllllllllIllllllIlllIIIIIIIlI.getZPos());
    }
    
    @Override
    public ItemStack getStackInSlot(final int llllllllllllIllllllIllllIIIllIll) {
        return this.inventory[llllllllllllIllllllIllllIIIllIll];
    }
}
