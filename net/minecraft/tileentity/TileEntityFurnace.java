// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.inventory.SlotFurnaceFuel;
import java.util.Arrays;
import net.minecraft.block.BlockFurnace;
import net.minecraft.util.MathHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.item.crafting.FurnaceRecipes;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.EnumFacing;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.util.ITickable;

public class TileEntityFurnace extends TileEntityLockable implements ITickable, ISidedInventory
{
    private static final /* synthetic */ int[] lllIllIIlIlllI;
    private static final /* synthetic */ int[] slotsTop;
    private static final /* synthetic */ String[] lllIllIIlIllIl;
    private /* synthetic */ int cookTime;
    private static final /* synthetic */ int[] slotsBottom;
    private /* synthetic */ int totalCookTime;
    private /* synthetic */ int currentItemBurnTime;
    private /* synthetic */ ItemStack[] furnaceItemStacks;
    private /* synthetic */ String furnaceCustomName;
    private static final /* synthetic */ int[] slotsSides;
    private /* synthetic */ int furnaceBurnTime;
    
    @Override
    public ItemStack decrStackSize(final int llllllllllllIlIllIIllIIIlIlIIIII, final int llllllllllllIlIllIIllIIIlIIlllll) {
        if (!lIlIIlIIIlllIlll(this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIIII])) {
            return null;
        }
        if (lIlIIlIIIllllIII(this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIIII].stackSize, llllllllllllIlIllIIllIIIlIIlllll)) {
            final ItemStack llllllllllllIlIllIIllIIIlIIllllI = this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIIII];
            this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIIII] = null;
            return llllllllllllIlIllIIllIIIlIIllllI;
        }
        final ItemStack llllllllllllIlIllIIllIIIlIIlllIl = this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIIII].splitStack(llllllllllllIlIllIIllIIIlIIlllll);
        if (lIlIIlIIIllllIIl(this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIIII].stackSize)) {
            this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIIII] = null;
        }
        return llllllllllllIlIllIIllIIIlIIlllIl;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return TileEntityFurnace.lllIllIIlIlllI[14];
    }
    
    @Override
    public Container createContainer(final InventoryPlayer llllllllllllIlIllIIlIllllllllIIl, final EntityPlayer llllllllllllIlIllIIlIllllllllIII) {
        return new ContainerFurnace(llllllllllllIlIllIIlIllllllllIIl, this);
    }
    
    @Override
    public boolean canInsertItem(final int llllllllllllIlIllIIllIIIIIIlIIII, final ItemStack llllllllllllIlIllIIllIIIIIIIlIll, final EnumFacing llllllllllllIlIllIIllIIIIIIIlllI) {
        return this.isItemValidForSlot(llllllllllllIlIllIIllIIIIIIlIIII, llllllllllllIlIllIIllIIIIIIIlIll);
    }
    
    private static boolean lIlIIlIIIlllllll(final int llllllllllllIlIllIIlIllllIlIIlll, final int llllllllllllIlIllIIlIllllIlIIllI) {
        return llllllllllllIlIllIIlIllllIlIIlll >= llllllllllllIlIllIIlIllllIlIIllI;
    }
    
    @Override
    public void openInventory(final EntityPlayer llllllllllllIlIllIIllIIIIIlIIIlI) {
    }
    
    @Override
    public int getFieldCount() {
        return TileEntityFurnace.lllIllIIlIlllI[5];
    }
    
    public TileEntityFurnace() {
        this.furnaceItemStacks = new ItemStack[TileEntityFurnace.lllIllIIlIlllI[3]];
    }
    
    public static boolean isBurning(final IInventory llllllllllllIlIllIIllIIIIlIlIIIl) {
        if (lIlIIlIIIlllllII(llllllllllllIlIllIIllIIIIlIlIIIl.getField(TileEntityFurnace.lllIllIIlIlllI[2]))) {
            return TileEntityFurnace.lllIllIIlIlllI[0] != 0;
        }
        return TileEntityFurnace.lllIllIIlIlllI[2] != 0;
    }
    
    public int getCookTime(final ItemStack llllllllllllIlIllIIllIIIIlIIIIlI) {
        return TileEntityFurnace.lllIllIIlIlllI[15];
    }
    
    static {
        lIlIIlIIIlllIllI();
        lIlIIlIIIlllIlIl();
        slotsTop = new int[TileEntityFurnace.lllIllIIlIlllI[0]];
        final int[] slotsBottom2 = new int[TileEntityFurnace.lllIllIIlIlllI[1]];
        slotsBottom2[TileEntityFurnace.lllIllIIlIlllI[2]] = TileEntityFurnace.lllIllIIlIlllI[1];
        slotsBottom2[TileEntityFurnace.lllIllIIlIlllI[0]] = TileEntityFurnace.lllIllIIlIlllI[0];
        slotsBottom = slotsBottom2;
        final int[] slotsSides2 = new int[TileEntityFurnace.lllIllIIlIlllI[0]];
        slotsSides2[TileEntityFurnace.lllIllIIlIlllI[2]] = TileEntityFurnace.lllIllIIlIlllI[0];
        slotsSides = slotsSides2;
    }
    
    @Override
    public ItemStack getStackInSlot(final int llllllllllllIlIllIIllIIIlIlIIllI) {
        return this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIlIIllI];
    }
    
    private static boolean lIlIIlIIIllllIll(final int llllllllllllIlIllIIlIllllIIllIll, final int llllllllllllIlIllIIlIllllIIllIlI) {
        return llllllllllllIlIllIIlIllllIIllIll > llllllllllllIlIllIIlIllllIIllIlI;
    }
    
    private static String lIlIIlIIIlllIIll(String llllllllllllIlIllIIlIlllllIlIIII, final String llllllllllllIlIllIIlIlllllIlIlII) {
        llllllllllllIlIllIIlIlllllIlIIII = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlIlllllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIlllllIlIIll = new StringBuilder();
        final char[] llllllllllllIlIllIIlIlllllIlIIlI = llllllllllllIlIllIIlIlllllIlIlII.toCharArray();
        int llllllllllllIlIllIIlIlllllIlIIIl = TileEntityFurnace.lllIllIIlIlllI[2];
        final int llllllllllllIlIllIIlIlllllIIlIll = (Object)llllllllllllIlIllIIlIlllllIlIIII.toCharArray();
        final long llllllllllllIlIllIIlIlllllIIlIlI = llllllllllllIlIllIIlIlllllIIlIll.length;
        int llllllllllllIlIllIIlIlllllIIlIIl = TileEntityFurnace.lllIllIIlIlllI[2];
        while (lIlIIlIIIllllllI(llllllllllllIlIllIIlIlllllIIlIIl, (int)llllllllllllIlIllIIlIlllllIIlIlI)) {
            final char llllllllllllIlIllIIlIlllllIlIllI = llllllllllllIlIllIIlIlllllIIlIll[llllllllllllIlIllIIlIlllllIIlIIl];
            llllllllllllIlIllIIlIlllllIlIIll.append((char)(llllllllllllIlIllIIlIlllllIlIllI ^ llllllllllllIlIllIIlIlllllIlIIlI[llllllllllllIlIllIIlIlllllIlIIIl % llllllllllllIlIllIIlIlllllIlIIlI.length]));
            "".length();
            ++llllllllllllIlIllIIlIlllllIlIIIl;
            ++llllllllllllIlIllIIlIlllllIIlIIl;
            "".length();
            if ((0x2 ^ 0x49 ^ (0xDC ^ 0x93)) != (91 + 68 - 39 + 18 ^ 0 + 39 + 54 + 49)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIlllllIlIIll);
    }
    
    private static String lIlIIlIIIlllIIlI(final String llllllllllllIlIllIIlIllllIllIIll, final String llllllllllllIlIllIIlIllllIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIllllIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIllllIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIllllIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIllllIllIlIl.init(TileEntityFurnace.lllIllIIlIlllI[1], llllllllllllIlIllIIlIllllIllIllI);
            return new String(llllllllllllIlIllIIlIllllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIllllIllIlII) {
            llllllllllllIlIllIIlIllllIllIlII.printStackTrace();
            return null;
        }
    }
    
    public void smeltItem() {
        if (lIlIIlIIIllllIlI(this.canSmelt() ? 1 : 0)) {
            final ItemStack llllllllllllIlIllIIllIIIIIlllIII = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]]);
            if (lIlIIlIIlIIIIIlI(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]])) {
                this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]] = llllllllllllIlIllIIllIIIIIlllIII.copy();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIlIIlIIlIIIIIll(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]].getItem(), llllllllllllIlIllIIllIIIIIlllIII.getItem())) {
                final ItemStack itemStack = this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]];
                itemStack.stackSize += TileEntityFurnace.lllIllIIlIlllI[0];
            }
            if (lIlIIlIIlIIIIIll(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]].getItem(), Item.getItemFromBlock(Blocks.sponge)) && lIlIIlIIlIIIIIII(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]].getMetadata(), TileEntityFurnace.lllIllIIlIlllI[0]) && lIlIIlIIIlllIlll(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]]) && lIlIIlIIlIIIIIll(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]].getItem(), Items.bucket)) {
                this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]] = new ItemStack(Items.water_bucket);
            }
            final ItemStack itemStack2 = this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]];
            itemStack2.stackSize -= TileEntityFurnace.lllIllIIlIlllI[0];
            if (lIlIIlIIlIIIIlII(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]].stackSize)) {
                this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]] = null;
            }
        }
    }
    
    public static boolean isItemFuel(final ItemStack llllllllllllIlIllIIllIIIIIlIlIlI) {
        if (lIlIIlIIIlllllII(getItemBurnTime(llllllllllllIlIllIIllIIIIIlIlIlI))) {
            return TileEntityFurnace.lllIllIIlIlllI[0] != 0;
        }
        return TileEntityFurnace.lllIllIIlIlllI[2] != 0;
    }
    
    public boolean isBurning() {
        if (lIlIIlIIIlllllII(this.furnaceBurnTime)) {
            return TileEntityFurnace.lllIllIIlIlllI[0] != 0;
        }
        return TileEntityFurnace.lllIllIIlIlllI[2] != 0;
    }
    
    private static void lIlIIlIIIlllIlIl() {
        (lllIllIIlIllIl = new String[TileEntityFurnace.lllIllIIlIlllI[27]])[TileEntityFurnace.lllIllIIlIlllI[2]] = lIlIIlIIIlllIIlI("ejgcfUwGE/s8cZUmkIxt+AslLg/+Lq6I", "ZKvZj");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[0]] = lIlIIlIIIlllIIll("GBApGSQ=", "QdLtW");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[1]] = lIlIIlIIIlllIlII("AalIyvrNmM8=", "nfwVa");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[3]] = lIlIIlIIIlllIIlI("Vz7P+Myn0t/Ek5AAIhkwLg==", "nIWHF");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[5]] = lIlIIlIIIlllIlII("Uc2MGuyg6sDP9Qn1aRAJ8Q==", "eRIZC");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[6]] = lIlIIlIIIlllIIlI("LtqzsLTV3VuGjAaty9Zx9Q==", "oQmjq");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[7]] = lIlIIlIIIlllIlII("yh2Y8Amqlz0filoizw8vWA==", "ECegW");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[9]] = lIlIIlIIIlllIIlI("zT9+47V4Ra0Z/st9Z/zl+g==", "cuFPi");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[8]] = lIlIIlIIIlllIIll("KwwlFAcAFDI=", "iyWzS");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[10]] = lIlIIlIIIlllIIll("Cg0VPR8gDx8=", "IbzVK");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[4]] = lIlIIlIIIlllIlII("D6MUyOKraQMSElg0hKhQwQ==", "OBBHs");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[11]] = lIlIIlIIIlllIIll("GzgCBg==", "HTmre");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[12]] = lIlIIlIIIlllIlII("B1vPgdQ5Bt0=", "xhzQv");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[13]] = lIlIIlIIIlllIlII("9YXN4QGPIPbjJAoYOFOxgQ==", "IuPea");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[19]] = lIlIIlIIIlllIlII("lKEhHdRvzKM=", "tLNOa");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[20]] = lIlIIlIIIlllIlII("R2R54hfYWn0=", "dGAlD");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[21]] = lIlIIlIIIlllIIlI("nDcViOQQl4g=", "caGES");
        TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[26]] = lIlIIlIIIlllIIlI("TJ9iNjiR63gxdFwK2gVbqQpGlUfOHoDl", "YBRhU");
    }
    
    @Override
    public void update() {
        final boolean llllllllllllIlIllIIllIIIIlIIlIlI = this.isBurning();
        boolean llllllllllllIlIllIIllIIIIlIIlIIl = TileEntityFurnace.lllIllIIlIlllI[2] != 0;
        if (lIlIIlIIIllllIlI(this.isBurning() ? 1 : 0)) {
            this.furnaceBurnTime -= TileEntityFurnace.lllIllIIlIlllI[0];
        }
        if (lIlIIlIIIllllIIl(this.worldObj.isRemote ? 1 : 0)) {
            if (!lIlIIlIIIllllIIl(this.isBurning() ? 1 : 0) || (lIlIIlIIIlllIlll(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]]) && lIlIIlIIIlllIlll(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]]))) {
                if (lIlIIlIIIllllIIl(this.isBurning() ? 1 : 0) && lIlIIlIIIllllIlI(this.canSmelt() ? 1 : 0)) {
                    final int itemBurnTime = getItemBurnTime(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]]);
                    this.furnaceBurnTime = itemBurnTime;
                    this.currentItemBurnTime = itemBurnTime;
                    if (lIlIIlIIIllllIlI(this.isBurning() ? 1 : 0)) {
                        llllllllllllIlIllIIllIIIIlIIlIIl = (TileEntityFurnace.lllIllIIlIlllI[0] != 0);
                        if (lIlIIlIIIlllIlll(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]])) {
                            final ItemStack itemStack = this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]];
                            itemStack.stackSize -= TileEntityFurnace.lllIllIIlIlllI[0];
                            if (lIlIIlIIIllllIIl(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]].stackSize)) {
                                final Item llllllllllllIlIllIIllIIIIlIIlIII = this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]].getItem().getContainerItem();
                                final ItemStack[] furnaceItemStacks = this.furnaceItemStacks;
                                final int n = TileEntityFurnace.lllIllIIlIlllI[0];
                                ItemStack itemStack2;
                                if (lIlIIlIIIlllIlll(llllllllllllIlIllIIllIIIIlIIlIII)) {
                                    itemStack2 = new ItemStack(llllllllllllIlIllIIllIIIIlIIlIII);
                                    "".length();
                                    if (" ".length() > (0x25 ^ 0x21)) {
                                        return;
                                    }
                                }
                                else {
                                    itemStack2 = null;
                                }
                                furnaceItemStacks[n] = itemStack2;
                            }
                        }
                    }
                }
                if (lIlIIlIIIllllIlI(this.isBurning() ? 1 : 0) && lIlIIlIIIllllIlI(this.canSmelt() ? 1 : 0)) {
                    this.cookTime += TileEntityFurnace.lllIllIIlIlllI[0];
                    if (lIlIIlIIlIIIIIII(this.cookTime, this.totalCookTime)) {
                        this.cookTime = TileEntityFurnace.lllIllIIlIlllI[2];
                        this.totalCookTime = this.getCookTime(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]]);
                        this.smeltItem();
                        llllllllllllIlIllIIllIIIIlIIlIIl = (TileEntityFurnace.lllIllIIlIlllI[0] != 0);
                        "".length();
                        if (-(0x1E ^ 0x7F ^ (0x1A ^ 0x7F)) >= 0) {
                            return;
                        }
                    }
                }
                else {
                    this.cookTime = TileEntityFurnace.lllIllIIlIlllI[2];
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                }
            }
            else if (lIlIIlIIIllllIIl(this.isBurning() ? 1 : 0) && lIlIIlIIIlllllII(this.cookTime)) {
                this.cookTime = MathHelper.clamp_int(this.cookTime - TileEntityFurnace.lllIllIIlIlllI[1], TileEntityFurnace.lllIllIIlIlllI[2], this.totalCookTime);
            }
            if (lIlIIlIIlIIIIIIl(llllllllllllIlIllIIllIIIIlIIlIlI ? 1 : 0, this.isBurning() ? 1 : 0)) {
                llllllllllllIlIllIIllIIIIlIIlIIl = (TileEntityFurnace.lllIllIIlIlllI[0] != 0);
                BlockFurnace.setState(this.isBurning(), this.worldObj, this.pos);
            }
        }
        if (lIlIIlIIIllllIlI(llllllllllllIlIllIIllIIIIlIIlIIl ? 1 : 0)) {
            this.markDirty();
        }
    }
    
    private static boolean lIlIIlIIlIIIIIll(final Object llllllllllllIlIllIIlIllllIIlIIIl, final Object llllllllllllIlIllIIlIllllIIlIIII) {
        return llllllllllllIlIllIIlIllllIIlIIIl == llllllllllllIlIllIIlIllllIIlIIII;
    }
    
    @Override
    public int getSizeInventory() {
        return this.furnaceItemStacks.length;
    }
    
    @Override
    public String getGuiID() {
        return TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[26]];
    }
    
    private boolean canSmelt() {
        if (lIlIIlIIlIIIIIlI(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]])) {
            return TileEntityFurnace.lllIllIIlIlllI[2] != 0;
        }
        final ItemStack llllllllllllIlIllIIllIIIIIlllllI = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[2]]);
        int n;
        if (lIlIIlIIlIIIIIlI(llllllllllllIlIllIIllIIIIIlllllI)) {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
            "".length();
            if ((0x21 ^ 0x6E ^ (0x52 ^ 0x19)) <= 0) {
                return ((136 + 10 - 17 + 8 ^ 40 + 55 + 65 + 27) & (1 + 97 - 76 + 119 ^ 143 + 155 - 174 + 67 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIlIIlIIIIIlI(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]])) {
            n = TileEntityFurnace.lllIllIIlIlllI[0];
            "".length();
            if ("  ".length() < 0) {
                return ((0x60 ^ 0x23 ^ (0x79 ^ 0x6C)) & (0x7B ^ 0x8 ^ (0x9 ^ 0x2C) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIlIIIllllIIl(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]].isItemEqual(llllllllllllIlIllIIllIIIIIlllllI) ? 1 : 0)) {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
            "".length();
            if ("   ".length() < 0) {
                return ((0x3F ^ 0x2F ^ (0x55 ^ 0x4)) & (0xFB ^ 0xAF ^ (0xB2 ^ 0xA7) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIlIIIllllllI(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]].stackSize, this.getInventoryStackLimit()) && lIlIIlIIIllllllI(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]].stackSize, this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]].getMaxStackSize())) {
            n = TileEntityFurnace.lllIllIIlIlllI[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0xC4 ^ 0xBA ^ (0x7C ^ 0x44)) & (0xEA ^ 0xA6 ^ (0x5A ^ 0x50) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIlIIIllllllI(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[1]].stackSize, llllllllllllIlIllIIllIIIIIlllllI.getMaxStackSize())) {
            n = TileEntityFurnace.lllIllIIlIlllI[0];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x22 ^ 0x66 ^ (0x8F ^ 0x85)) & (0x73 ^ 0x43 ^ (0x26 ^ 0x58) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
        }
        return n != 0;
    }
    
    private static int lIlIIlIIlIIIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int llllllllllllIlIllIIllIIIlIIlIIIl) {
        if (lIlIIlIIIlllIlll(this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIIlIIIl])) {
            final ItemStack llllllllllllIlIllIIllIIIlIIlIIll = this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIIlIIIl];
            this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIIlIIIl] = null;
            return llllllllllllIlIllIIllIIIlIIlIIll;
        }
        return null;
    }
    
    private static boolean lIlIIlIIIllllIIl(final int llllllllllllIlIllIIlIllllIIIlIlI) {
        return llllllllllllIlIllIIlIllllIIIlIlI == 0;
    }
    
    private static boolean lIlIIlIIIlllllIl(final int llllllllllllIlIllIIlIllllIIIlIII) {
        return llllllllllllIlIllIIlIllllIIIlIII >= 0;
    }
    
    private static boolean lIlIIlIIIllllllI(final int llllllllllllIlIllIIlIllllIlIIIll, final int llllllllllllIlIllIIlIllllIlIIIlI) {
        return llllllllllllIlIllIIlIllllIlIIIll < llllllllllllIlIllIIlIllllIlIIIlI;
    }
    
    private static boolean lIlIIlIIIlllllII(final int llllllllllllIlIllIIlIllllIIIIlII) {
        return llllllllllllIlIllIIlIllllIIIIlII > 0;
    }
    
    private static String lIlIIlIIIlllIlII(final String llllllllllllIlIllIIlIlllllIIIIII, final String llllllllllllIlIllIIlIllllIllllll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIlllllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIllllIllllll.getBytes(StandardCharsets.UTF_8)), TileEntityFurnace.lllIllIIlIlllI[8]), "DES");
            final Cipher llllllllllllIlIllIIlIlllllIIIIlI = Cipher.getInstance("DES");
            llllllllllllIlIllIIlIlllllIIIIlI.init(TileEntityFurnace.lllIllIIlIlllI[1], llllllllllllIlIllIIlIlllllIIIIll);
            return new String(llllllllllllIlIllIIlIlllllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIlllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIlllllIIIIIl) {
            llllllllllllIlIllIIlIlllllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isItemValidForSlot(final int llllllllllllIlIllIIllIIIIIIllIlI, final ItemStack llllllllllllIlIllIIllIIIIIIllIIl) {
        int n;
        if (lIlIIlIIlIIIIIII(llllllllllllIlIllIIllIIIIIIllIlI, TileEntityFurnace.lllIllIIlIlllI[1])) {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
            "".length();
            if (null != null) {
                return ((0x59 ^ 0x61 ^ (0xBB ^ 0x98)) & (84 + 5 - 31 + 118 ^ 116 + 112 - 197 + 140 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIlIIlIIIIIIl(llllllllllllIlIllIIllIIIIIIllIlI, TileEntityFurnace.lllIllIIlIlllI[0])) {
            n = TileEntityFurnace.lllIllIIlIlllI[0];
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((0xE1 ^ 0xB9) & ~(0xFE ^ 0xA6)) != 0x0;
            }
        }
        else if (lIlIIlIIIllllIIl(isItemFuel(llllllllllllIlIllIIllIIIIIIllIIl) ? 1 : 0) && lIlIIlIIIllllIIl(SlotFurnaceFuel.isBucket(llllllllllllIlIllIIllIIIIIIllIIl) ? 1 : 0)) {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
            "".length();
            if (((100 + 126 - 76 + 8 ^ 89 + 110 - 72 + 14) & (0x9B ^ 0x82 ^ (0x82 ^ 0x88) ^ -" ".length())) != 0x0) {
                return ((0x18 ^ 0x6F ^ (0x1E ^ 0x71)) & (0xC ^ 0x5 ^ (0x3 ^ 0x12) ^ -" ".length()) & (((0x5A ^ 0x17 ^ (0xFB ^ 0xBC)) & (97 + 23 - 40 + 90 ^ 22 + 8 + 70 + 60 ^ -" ".length())) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = TileEntityFurnace.lllIllIIlIlllI[0];
        }
        return n != 0;
    }
    
    private static boolean lIlIIlIIlIIIIIlI(final Object llllllllllllIlIllIIlIllllIIIlllI) {
        return llllllllllllIlIllIIlIllllIIIlllI == null;
    }
    
    @Override
    public int[] getSlotsForFace(final EnumFacing llllllllllllIlIllIIllIIIIIIlIllI) {
        int[] array;
        if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIIlIllI, EnumFacing.DOWN)) {
            array = TileEntityFurnace.slotsBottom;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIIlIllI, EnumFacing.UP)) {
            array = TileEntityFurnace.slotsTop;
            "".length();
            if (((0x3C ^ 0x25) & ~(0xAA ^ 0xB3)) > " ".length()) {
                return null;
            }
        }
        else {
            array = TileEntityFurnace.slotsSides;
        }
        return array;
    }
    
    @Override
    public boolean canExtractItem(final int llllllllllllIlIllIIllIIIIIIIIlIl, final ItemStack llllllllllllIlIllIIllIIIIIIIIIII, final EnumFacing llllllllllllIlIllIIlIlllllllllll) {
        if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIlIlllllllllll, EnumFacing.DOWN) && lIlIIlIIlIIIIIII(llllllllllllIlIllIIllIIIIIIIIlIl, TileEntityFurnace.lllIllIIlIlllI[0])) {
            final Item llllllllllllIlIllIIllIIIIIIIIIlI = llllllllllllIlIllIIllIIIIIIIIIII.getItem();
            if (lIlIIlIIlIIIIlIl(llllllllllllIlIllIIllIIIIIIIIIlI, Items.water_bucket) && lIlIIlIIlIIIIlIl(llllllllllllIlIllIIllIIIIIIIIIlI, Items.bucket)) {
                return TileEntityFurnace.lllIllIIlIlllI[2] != 0;
            }
        }
        return TileEntityFurnace.lllIllIIlIlllI[0] != 0;
    }
    
    @Override
    public int getField(final int llllllllllllIlIllIIlIlllllllIIlI) {
        switch (llllllllllllIlIllIIlIlllllllIIlI) {
            case 0: {
                return this.furnaceBurnTime;
            }
            case 1: {
                return this.currentItemBurnTime;
            }
            case 2: {
                return this.cookTime;
            }
            case 3: {
                return this.totalCookTime;
            }
            default: {
                return TileEntityFurnace.lllIllIIlIlllI[2];
            }
        }
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIlIllIIllIIIIlIlllll) {
        super.writeToNBT(llllllllllllIlIllIIllIIIIlIlllll);
        llllllllllllIlIllIIllIIIIlIlllll.setShort(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[8]], (short)this.furnaceBurnTime);
        llllllllllllIlIllIIllIIIIlIlllll.setShort(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[10]], (short)this.cookTime);
        llllllllllllIlIllIIllIIIIlIlllll.setShort(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[4]], (short)this.totalCookTime);
        final NBTTagList llllllllllllIlIllIIllIIIIlIllllI = new NBTTagList();
        int llllllllllllIlIllIIllIIIIlIlllIl = TileEntityFurnace.lllIllIIlIlllI[2];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lIlIIlIIIlllllll(llllllllllllIlIllIIllIIIIlIlllIl, this.furnaceItemStacks.length)) {
            if (lIlIIlIIIlllIlll(this.furnaceItemStacks[llllllllllllIlIllIIllIIIIlIlllIl])) {
                final NBTTagCompound llllllllllllIlIllIIllIIIIlIlllII = new NBTTagCompound();
                llllllllllllIlIllIIllIIIIlIlllII.setByte(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[11]], (byte)llllllllllllIlIllIIllIIIIlIlllIl);
                this.furnaceItemStacks[llllllllllllIlIllIIllIIIIlIlllIl].writeToNBT(llllllllllllIlIllIIllIIIIlIlllII);
                "".length();
                llllllllllllIlIllIIllIIIIlIllllI.appendTag(llllllllllllIlIllIIllIIIIlIlllII);
            }
            ++llllllllllllIlIllIIllIIIIlIlllIl;
        }
        llllllllllllIlIllIIllIIIIlIlllll.setTag(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[12]], llllllllllllIlIllIIllIIIIlIllllI);
        if (lIlIIlIIIllllIlI(this.hasCustomName() ? 1 : 0)) {
            llllllllllllIlIllIIllIIIIlIlllll.setString(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[13]], this.furnaceCustomName);
        }
    }
    
    @Override
    public String getName() {
        String furnaceCustomName;
        if (lIlIIlIIIllllIlI(this.hasCustomName() ? 1 : 0)) {
            furnaceCustomName = this.furnaceCustomName;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            furnaceCustomName = TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[2]];
        }
        return furnaceCustomName;
    }
    
    private static boolean lIlIIlIIlIIIIIIl(final int llllllllllllIlIllIIlIllllIIIIIIl, final int llllllllllllIlIllIIlIllllIIIIIII) {
        return llllllllllllIlIllIIlIllllIIIIIIl != llllllllllllIlIllIIlIllllIIIIIII;
    }
    
    private static boolean lIlIIlIIIllllIII(final int llllllllllllIlIllIIlIllllIIlllll, final int llllllllllllIlIllIIlIllllIIllllI) {
        return llllllllllllIlIllIIlIllllIIlllll <= llllllllllllIlIllIIlIllllIIllllI;
    }
    
    public static int getItemBurnTime(final ItemStack llllllllllllIlIllIIllIIIIIlIllll) {
        if (lIlIIlIIlIIIIIlI(llllllllllllIlIllIIllIIIIIlIllll)) {
            return TileEntityFurnace.lllIllIIlIlllI[2];
        }
        final Item llllllllllllIlIllIIllIIIIIllIIIl = llllllllllllIlIllIIllIIIIIlIllll.getItem();
        if (lIlIIlIIIllllIlI((llllllllllllIlIllIIllIIIIIllIIIl instanceof ItemBlock) ? 1 : 0) && lIlIIlIIlIIIIlIl(Block.getBlockFromItem(llllllllllllIlIllIIllIIIIIllIIIl), Blocks.air)) {
            final Block llllllllllllIlIllIIllIIIIIllIIII = Block.getBlockFromItem(llllllllllllIlIllIIllIIIIIllIIIl);
            if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIII, Blocks.wooden_slab)) {
                return TileEntityFurnace.lllIllIIlIlllI[16];
            }
            if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIII.getMaterial(), Material.wood)) {
                return TileEntityFurnace.lllIllIIlIlllI[17];
            }
            if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIII, Blocks.coal_block)) {
                return TileEntityFurnace.lllIllIIlIlllI[18];
            }
        }
        int n;
        if (lIlIIlIIIllllIlI((llllllllllllIlIllIIllIIIIIllIIIl instanceof ItemTool) ? 1 : 0) && lIlIIlIIIllllIlI(((ItemTool)llllllllllllIlIllIIllIIIIIllIIIl).getToolMaterialName().equals(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[19]]) ? 1 : 0)) {
            n = TileEntityFurnace.lllIllIIlIlllI[15];
            "".length();
            if (" ".length() < 0) {
                return (0x86 ^ 0xB5) & ~(0x19 ^ 0x2A);
            }
        }
        else if (lIlIIlIIIllllIlI((llllllllllllIlIllIIllIIIIIllIIIl instanceof ItemSword) ? 1 : 0) && lIlIIlIIIllllIlI(((ItemSword)llllllllllllIlIllIIllIIIIIllIIIl).getToolMaterialName().equals(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[20]]) ? 1 : 0)) {
            n = TileEntityFurnace.lllIllIIlIlllI[15];
            "".length();
            if ("   ".length() <= " ".length()) {
                return (0x13 ^ 0x17) & ~(0x87 ^ 0x83);
            }
        }
        else if (lIlIIlIIIllllIlI((llllllllllllIlIllIIllIIIIIllIIIl instanceof ItemHoe) ? 1 : 0) && lIlIIlIIIllllIlI(((ItemHoe)llllllllllllIlIllIIllIIIIIllIIIl).getMaterialName().equals(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[21]]) ? 1 : 0)) {
            n = TileEntityFurnace.lllIllIIlIlllI[15];
            "".length();
            if ("  ".length() <= 0) {
                return (0xED ^ 0xB3) & ~(0xC0 ^ 0x9E);
            }
        }
        else if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIIl, Items.stick)) {
            n = TileEntityFurnace.lllIllIIlIlllI[22];
            "".length();
            if (" ".length() >= "   ".length()) {
                return (0x54 ^ 0x41 ^ (0x85 ^ 0xA1)) & (0x6F ^ 0x2B ^ (0x4C ^ 0x39) ^ -" ".length());
            }
        }
        else if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIIl, Items.coal)) {
            n = TileEntityFurnace.lllIllIIlIlllI[23];
            "".length();
            if (-" ".length() >= 0) {
                return (0x25 ^ 0x1F) & ~(0x93 ^ 0xA9);
            }
        }
        else if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIIl, Items.lava_bucket)) {
            n = TileEntityFurnace.lllIllIIlIlllI[24];
            "".length();
            if (-" ".length() != -" ".length()) {
                return (0x73 ^ 0x37) & ~(0xC3 ^ 0x87);
            }
        }
        else if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIIl, Item.getItemFromBlock(Blocks.sapling))) {
            n = TileEntityFurnace.lllIllIIlIlllI[22];
            "".length();
            if (-(0x27 ^ 0x22) >= 0) {
                return (0x12 ^ 0x48) & ~(0xD3 ^ 0x89);
            }
        }
        else if (lIlIIlIIlIIIIIll(llllllllllllIlIllIIllIIIIIllIIIl, Items.blaze_rod)) {
            n = TileEntityFurnace.lllIllIIlIlllI[25];
            "".length();
            if (-" ".length() == " ".length()) {
                return (0xEC ^ 0x88 ^ (0x13 ^ 0x15)) & (0xA1 ^ 0x99 ^ (0x3B ^ 0x61) ^ -" ".length());
            }
        }
        else {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
        }
        return n;
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer llllllllllllIlIllIIllIIIIIlIIllI) {
        int n;
        if (lIlIIlIIlIIIIlIl(this.worldObj.getTileEntity(this.pos), this)) {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
            "".length();
            if (-"   ".length() >= 0) {
                return ((169 + 175 - 295 + 174 ^ 57 + 88 - 50 + 59) & (0x5 ^ 0x1E ^ (0x14 ^ 0x4A) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIlIIlIIIIlII(lIlIIlIIlIIIIllI(llllllllllllIlIllIIllIIIIIlIIllI.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = TileEntityFurnace.lllIllIIlIlllI[0];
            "".length();
            if ((0x4E ^ 0x4A) < 0) {
                return ((0x88 ^ 0xAB) & ~(0x2A ^ 0x9)) != 0x0;
            }
        }
        else {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
        }
        return n != 0;
    }
    
    @Override
    public void setField(final int llllllllllllIlIllIIlIllllllIlIII, final int llllllllllllIlIllIIlIllllllIIlll) {
        switch (llllllllllllIlIllIIlIllllllIlIII) {
            case 0: {
                this.furnaceBurnTime = llllllllllllIlIllIIlIllllllIIlll;
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 1: {
                this.currentItemBurnTime = llllllllllllIlIllIIlIllllllIIlll;
                "".length();
                if (-(0x1F ^ 0x49 ^ (0xF3 ^ 0xA1)) > 0) {
                    return;
                }
                break;
            }
            case 2: {
                this.cookTime = llllllllllllIlIllIIlIllllllIIlll;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                this.totalCookTime = llllllllllllIlIllIIlIllllllIIlll;
                break;
            }
        }
    }
    
    private static boolean lIlIIlIIlIIIIlIl(final Object llllllllllllIlIllIIlIllllIIlIlll, final Object llllllllllllIlIllIIlIllllIIlIllI) {
        return llllllllllllIlIllIIlIllllIIlIlll != llllllllllllIlIllIIlIllllIIlIllI;
    }
    
    private static void lIlIIlIIIlllIllI() {
        (lllIllIIlIlllI = new int[28])[0] = " ".length();
        TileEntityFurnace.lllIllIIlIlllI[1] = "  ".length();
        TileEntityFurnace.lllIllIIlIlllI[2] = ((0x1D ^ 0x32 ^ (0xD7 ^ 0xBA)) & (0x99 ^ 0xAB ^ (0x77 ^ 0x7) ^ -" ".length()));
        TileEntityFurnace.lllIllIIlIlllI[3] = "   ".length();
        TileEntityFurnace.lllIllIIlIlllI[4] = (142 + 24 - 36 + 73 ^ 175 + 97 - 105 + 26);
        TileEntityFurnace.lllIllIIlIlllI[5] = (16 + 47 + 46 + 53 ^ 128 + 134 - 116 + 20);
        TileEntityFurnace.lllIllIIlIlllI[6] = (0x62 ^ 0x67);
        TileEntityFurnace.lllIllIIlIlllI[7] = (0x8 ^ 0xE);
        TileEntityFurnace.lllIllIIlIlllI[8] = (0x15 ^ 0x4D ^ (0xD4 ^ 0x84));
        TileEntityFurnace.lllIllIIlIlllI[9] = (0x7 ^ 0x4C ^ (0x2D ^ 0x61));
        TileEntityFurnace.lllIllIIlIlllI[10] = (68 + 101 - 153 + 134 ^ 46 + 60 - 14 + 67);
        TileEntityFurnace.lllIllIIlIlllI[11] = (0x69 ^ 0x62);
        TileEntityFurnace.lllIllIIlIlllI[12] = (0xE2 ^ 0x83 ^ (0x7 ^ 0x6A));
        TileEntityFurnace.lllIllIIlIlllI[13] = (0x22 ^ 0x34 ^ (0x48 ^ 0x53));
        TileEntityFurnace.lllIllIIlIlllI[14] = (0x73 ^ 0x33);
        TileEntityFurnace.lllIllIIlIlllI[15] = 130 + 3 - 22 + 89;
        TileEntityFurnace.lllIllIIlIlllI[16] = 29 + 113 - 90 + 98;
        TileEntityFurnace.lllIllIIlIlllI[17] = (-(0xFFFFED33 & 0x7EDD) & (0xFFFFFD7D & 0x6FBE));
        TileEntityFurnace.lllIllIIlIlllI[18] = (0xFFFFBE9B & 0x7FE4);
        TileEntityFurnace.lllIllIIlIlllI[19] = (0x87 ^ 0x89);
        TileEntityFurnace.lllIllIIlIlllI[20] = (0x54 ^ 0x5B);
        TileEntityFurnace.lllIllIIlIlllI[21] = (160 + 149 - 155 + 11 ^ 22 + 66 + 14 + 79);
        TileEntityFurnace.lllIllIIlIlllI[22] = (" ".length() ^ (0x2D ^ 0x48));
        TileEntityFurnace.lllIllIIlIlllI[23] = (0xFFFFD6F1 & 0x2F4E);
        TileEntityFurnace.lllIllIIlIlllI[24] = (-(0xFFFFF2DD & 0x2D77) & (0xFFFFFF7D & 0x6EF6));
        TileEntityFurnace.lllIllIIlIlllI[25] = (-(0xFFFFE1CD & 0x5EBF) & (0xFFFFCFFD & 0x79EE));
        TileEntityFurnace.lllIllIIlIlllI[26] = (0x7E ^ 0x6F);
        TileEntityFurnace.lllIllIIlIlllI[27] = (166 + 135 - 121 + 3 ^ 22 + 95 - 0 + 48);
    }
    
    private static boolean lIlIIlIIlIIIIlII(final int llllllllllllIlIllIIlIllllIIIIllI) {
        return llllllllllllIlIllIIlIllllIIIIllI <= 0;
    }
    
    @Override
    public void setInventorySlotContents(final int llllllllllllIlIllIIllIIIlIIIIllI, final ItemStack llllllllllllIlIllIIllIIIlIIIlIIl) {
        int n;
        if (lIlIIlIIIlllIlll(llllllllllllIlIllIIllIIIlIIIlIIl) && lIlIIlIIIllllIlI(llllllllllllIlIllIIllIIIlIIIlIIl.isItemEqual(this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIIIIllI]) ? 1 : 0) && lIlIIlIIIllllIlI(ItemStack.areItemStackTagsEqual(llllllllllllIlIllIIllIIIlIIIlIIl, this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIIIIllI]) ? 1 : 0)) {
            n = TileEntityFurnace.lllIllIIlIlllI[0];
            "".length();
            if (" ".length() > (159 + 122 - 123 + 11 ^ 29 + 93 - 34 + 85)) {
                return;
            }
        }
        else {
            n = TileEntityFurnace.lllIllIIlIlllI[2];
        }
        final boolean llllllllllllIlIllIIllIIIlIIIlIII = n != 0;
        this.furnaceItemStacks[llllllllllllIlIllIIllIIIlIIIIllI] = llllllllllllIlIllIIllIIIlIIIlIIl;
        if (lIlIIlIIIlllIlll(llllllllllllIlIllIIllIIIlIIIlIIl) && lIlIIlIIIllllIll(llllllllllllIlIllIIllIIIlIIIlIIl.stackSize, this.getInventoryStackLimit())) {
            llllllllllllIlIllIIllIIIlIIIlIIl.stackSize = this.getInventoryStackLimit();
        }
        if (lIlIIlIIIllllIIl(llllllllllllIlIllIIllIIIlIIIIllI) && lIlIIlIIIllllIIl(llllllllllllIlIllIIllIIIlIIIlIII ? 1 : 0)) {
            this.totalCookTime = this.getCookTime(llllllllllllIlIllIIllIIIlIIIlIIl);
            this.cookTime = TileEntityFurnace.lllIllIIlIlllI[2];
            this.markDirty();
        }
    }
    
    private static boolean lIlIIlIIIlllIlll(final Object llllllllllllIlIllIIlIllllIIlIlII) {
        return llllllllllllIlIllIIlIllllIIlIlII != null;
    }
    
    public void setCustomInventoryName(final String llllllllllllIlIllIIllIIIIllllIII) {
        this.furnaceCustomName = llllllllllllIlIllIIllIIIIllllIII;
    }
    
    @Override
    public void closeInventory(final EntityPlayer llllllllllllIlIllIIllIIIIIlIIIII) {
    }
    
    @Override
    public void clear() {
        int llllllllllllIlIllIIlIllllllIIIlI = TileEntityFurnace.lllIllIIlIlllI[2];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIlIIIlllllll(llllllllllllIlIllIIlIllllllIIIlI, this.furnaceItemStacks.length)) {
            this.furnaceItemStacks[llllllllllllIlIllIIlIllllllIIIlI] = null;
            ++llllllllllllIlIllIIlIllllllIIIlI;
        }
    }
    
    private static boolean lIlIIlIIlIIIIIII(final int llllllllllllIlIllIIlIllllIlIlIll, final int llllllllllllIlIllIIlIllllIlIlIlI) {
        return llllllllllllIlIllIIlIllllIlIlIll == llllllllllllIlIllIIlIllllIlIlIlI;
    }
    
    @Override
    public boolean hasCustomName() {
        if (lIlIIlIIIlllIlll(this.furnaceCustomName) && lIlIIlIIIlllllII(this.furnaceCustomName.length())) {
            return TileEntityFurnace.lllIllIIlIlllI[0] != 0;
        }
        return TileEntityFurnace.lllIllIIlIlllI[2] != 0;
    }
    
    private static boolean lIlIIlIIIllllIlI(final int llllllllllllIlIllIIlIllllIIIllII) {
        return llllllllllllIlIllIIlIllllIIIllII != 0;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIlIllIIllIIIIlllIIII) {
        super.readFromNBT(llllllllllllIlIllIIllIIIIlllIIII);
        final NBTTagList llllllllllllIlIllIIllIIIIllIllll = llllllllllllIlIllIIllIIIIlllIIII.getTagList(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[0]], TileEntityFurnace.lllIllIIlIlllI[4]);
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];
        int llllllllllllIlIllIIllIIIIllIlllI = TileEntityFurnace.lllIllIIlIlllI[2];
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIlIIlIIIlllllll(llllllllllllIlIllIIllIIIIllIlllI, llllllllllllIlIllIIllIIIIllIllll.tagCount())) {
            final NBTTagCompound llllllllllllIlIllIIllIIIIllIllIl = llllllllllllIlIllIIllIIIIllIllll.getCompoundTagAt(llllllllllllIlIllIIllIIIIllIlllI);
            final int llllllllllllIlIllIIllIIIIllIllII = llllllllllllIlIllIIllIIIIllIllIl.getByte(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[1]]);
            if (lIlIIlIIIlllllIl(llllllllllllIlIllIIllIIIIllIllII) && lIlIIlIIIllllllI(llllllllllllIlIllIIllIIIIllIllII, this.furnaceItemStacks.length)) {
                this.furnaceItemStacks[llllllllllllIlIllIIllIIIIllIllII] = ItemStack.loadItemStackFromNBT(llllllllllllIlIllIIllIIIIllIllIl);
            }
            ++llllllllllllIlIllIIllIIIIllIlllI;
        }
        this.furnaceBurnTime = llllllllllllIlIllIIllIIIIlllIIII.getShort(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[3]]);
        this.cookTime = llllllllllllIlIllIIllIIIIlllIIII.getShort(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[5]]);
        this.totalCookTime = llllllllllllIlIllIIllIIIIlllIIII.getShort(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[6]]);
        this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks[TileEntityFurnace.lllIllIIlIlllI[0]]);
        if (lIlIIlIIIllllIlI(llllllllllllIlIllIIllIIIIlllIIII.hasKey(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[7]], TileEntityFurnace.lllIllIIlIlllI[8]) ? 1 : 0)) {
            this.furnaceCustomName = llllllllllllIlIllIIllIIIIlllIIII.getString(TileEntityFurnace.lllIllIIlIllIl[TileEntityFurnace.lllIllIIlIlllI[9]]);
        }
    }
}
