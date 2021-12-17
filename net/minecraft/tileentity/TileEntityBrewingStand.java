// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockBrewingStand;
import net.minecraft.util.EnumFacing;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ContainerBrewingStand;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.potion.PotionEffect;
import java.util.List;
import net.minecraft.item.ItemPotion;
import net.minecraft.init.Items;
import net.minecraft.potion.PotionHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.util.ITickable;
import net.minecraft.inventory.ISidedInventory;

public class TileEntityBrewingStand extends TileEntityLockable implements ISidedInventory, ITickable
{
    private /* synthetic */ int brewTime;
    private /* synthetic */ String customName;
    private /* synthetic */ Item ingredientID;
    private static final /* synthetic */ String[] lIllIIIIllIIIl;
    private static final /* synthetic */ int[] inputSlots;
    private static final /* synthetic */ int[] lIllIIIIllIIlI;
    private /* synthetic */ boolean[] filledSlots;
    private /* synthetic */ ItemStack[] brewingItemStacks;
    private static final /* synthetic */ int[] outputSlots;
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIIIIIllllIIllIIlIlI) {
    }
    
    private int getPotionResult(final int lllllllllllllIIIIIllllIlIIIlIlll, final ItemStack lllllllllllllIIIIIllllIlIIIlIllI) {
        int applyIngredient;
        if (llllIllIlllIlII(lllllllllllllIIIIIllllIlIIIlIllI)) {
            applyIngredient = lllllllllllllIIIIIllllIlIIIlIlll;
            "".length();
            if (-" ".length() == "  ".length()) {
                return (0x2D ^ 0x2A) & ~(0x8C ^ 0x8B);
            }
        }
        else if (llllIllIllIllII(lllllllllllllIIIIIllllIlIIIlIllI.getItem().isPotionIngredient(lllllllllllllIIIIIllllIlIIIlIllI) ? 1 : 0)) {
            applyIngredient = PotionHelper.applyIngredient(lllllllllllllIIIIIllllIlIIIlIlll, lllllllllllllIIIIIllllIlIIIlIllI.getItem().getPotionEffect(lllllllllllllIIIIIllllIlIIIlIllI));
            "".length();
            if ((("  ".length() ^ (0x80 ^ 0xB9)) & (0x4E ^ 0x0 ^ (0xB4 ^ 0xC1) ^ -" ".length())) > ((26 + 40 + 134 + 12 ^ 118 + 125 - 234 + 122) & (164 + 8 - 129 + 177 ^ 32 + 10 + 41 + 56 ^ -" ".length()))) {
                return (0xAD ^ 0x82 ^ (0x98 ^ 0x8A)) & (0x57 ^ 0x49 ^ (0xD ^ 0x2E) ^ -" ".length());
            }
        }
        else {
            applyIngredient = lllllllllllllIIIIIllllIlIIIlIlll;
        }
        return applyIngredient;
    }
    
    private static boolean llllIllIllIllll(final int lllllllllllllIIIIIllllIIIIlllIlI) {
        return lllllllllllllIIIIIllllIIIIlllIlI == 0;
    }
    
    private static void llllIllIllIlIll() {
        (lIllIIIIllIIlI = new int[14])[0] = " ".length();
        TileEntityBrewingStand.lIllIIIIllIIlI[1] = ((0x3C ^ 0x2C) & ~(0xAC ^ 0xBC));
        TileEntityBrewingStand.lIllIIIIllIIlI[2] = "   ".length();
        TileEntityBrewingStand.lIllIIIIllIIlI[3] = "  ".length();
        TileEntityBrewingStand.lIllIIIIllIIlI[4] = (0x64 ^ 0x60);
        TileEntityBrewingStand.lIllIIIIllIIlI[5] = (0xFFFFF3BC & 0xDD3);
        TileEntityBrewingStand.lIllIIIIllIIlI[6] = (0xA9 ^ 0xB8 ^ (0xBC ^ 0xA7));
        TileEntityBrewingStand.lIllIIIIllIIlI[7] = (0x8C ^ 0x84);
        TileEntityBrewingStand.lIllIIIIllIIlI[8] = (0x32 ^ 0x37);
        TileEntityBrewingStand.lIllIIIIllIIlI[9] = (0x16 ^ 0x20 ^ (0x8C ^ 0xBC));
        TileEntityBrewingStand.lIllIIIIllIIlI[10] = (0x3C ^ 0x3B);
        TileEntityBrewingStand.lIllIIIIllIIlI[11] = (0x62 ^ 0x6B);
        TileEntityBrewingStand.lIllIIIIllIIlI[12] = (0x73 ^ 0x33);
        TileEntityBrewingStand.lIllIIIIllIIlI[13] = (0xA5 ^ 0xAE);
    }
    
    public TileEntityBrewingStand() {
        this.brewingItemStacks = new ItemStack[TileEntityBrewingStand.lIllIIIIllIIlI[4]];
    }
    
    private void brewPotions() {
        if (llllIllIllIllII(this.canBrew() ? 1 : 0)) {
            final ItemStack lllllllllllllIIIIIllllIlIIlIlIIl = this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]];
            int lllllllllllllIIIIIllllIlIIlIlIII = TileEntityBrewingStand.lIllIIIIllIIlI[1];
            "".length();
            if (" ".length() == ((0xE ^ 0x38 ^ (0x88 ^ 0x84)) & (0x3E ^ 0x5D ^ (0xCA ^ 0x93) ^ -" ".length()))) {
                return;
            }
            while (!llllIllIlllIIIl(lllllllllllllIIIIIllllIlIIlIlIII, TileEntityBrewingStand.lIllIIIIllIIlI[2])) {
                if (llllIllIllIllIl(this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlIlIII]) && llllIllIlllIIlI(this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlIlIII].getItem(), Items.potionitem)) {
                    final int lllllllllllllIIIIIllllIlIIlIIlll = this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlIlIII].getMetadata();
                    final int lllllllllllllIIIIIllllIlIIlIIllI = this.getPotionResult(lllllllllllllIIIIIllllIlIIlIIlll, lllllllllllllIIIIIllllIlIIlIlIIl);
                    final List<PotionEffect> lllllllllllllIIIIIllllIlIIlIIlIl = Items.potionitem.getEffects(lllllllllllllIIIIIllllIlIIlIIlll);
                    final List<PotionEffect> lllllllllllllIIIIIllllIlIIlIIlII = Items.potionitem.getEffects(lllllllllllllIIIIIllllIlIIlIIllI);
                    if ((llllIllIllIlllI(lllllllllllllIIIIIllllIlIIlIIlll) && !llllIllIlllIIII(lllllllllllllIIIIIllllIlIIlIIlIl, lllllllllllllIIIIIllllIlIIlIIlII)) || (llllIllIllIllIl(lllllllllllllIIIIIllllIlIIlIIlIl) && (!llllIllIllIllll(lllllllllllllIIIIIllllIlIIlIIlIl.equals(lllllllllllllIIIIIllllIlIIlIIlII) ? 1 : 0) || llllIllIlllIlII(lllllllllllllIIIIIllllIlIIlIIlII)))) {
                        if (llllIllIllIllll(ItemPotion.isSplash(lllllllllllllIIIIIllllIlIIlIIlll) ? 1 : 0) && llllIllIllIllII(ItemPotion.isSplash(lllllllllllllIIIIIllllIlIIlIIllI) ? 1 : 0)) {
                            this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlIlIII].setItemDamage(lllllllllllllIIIIIllllIlIIlIIllI);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                    }
                    else if (llllIllIlllIIll(lllllllllllllIIIIIllllIlIIlIIlll, lllllllllllllIIIIIllllIlIIlIIllI)) {
                        this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlIlIII].setItemDamage(lllllllllllllIIIIIllllIlIIlIIllI);
                    }
                }
                ++lllllllllllllIIIIIllllIlIIlIlIII;
            }
            if (llllIllIllIllII(lllllllllllllIIIIIllllIlIIlIlIIl.getItem().hasContainerItem() ? 1 : 0)) {
                this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]] = new ItemStack(lllllllllllllIIIIIllllIlIIlIlIIl.getItem().getContainerItem());
                "".length();
                if (((0x15 ^ 0x13) & ~(0xA4 ^ 0xA2)) > "  ".length()) {
                    return;
                }
            }
            else {
                final ItemStack itemStack = this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]];
                itemStack.stackSize -= TileEntityBrewingStand.lIllIIIIllIIlI[0];
                if (llllIllIlllIlIl(this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]].stackSize)) {
                    this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]] = null;
                }
            }
        }
    }
    
    private static boolean llllIllIlllIIII(final Object lllllllllllllIIIIIllllIIIlIIIlll, final Object lllllllllllllIIIIIllllIIIlIIIllI) {
        return lllllllllllllIIIIIllllIIIlIIIlll != lllllllllllllIIIIIllllIIIlIIIllI;
    }
    
    private static String llllIllIllIlIIl(final String lllllllllllllIIIIIllllIIIlIllIIl, final String lllllllllllllIIIIIllllIIIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllllIIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), TileEntityBrewingStand.lIllIIIIllIIlI[7]), "DES");
            final Cipher lllllllllllllIIIIIllllIIIlIlllIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIllllIIIlIlllIl.init(TileEntityBrewingStand.lIllIIIIllIIlI[3], lllllllllllllIIIIIllllIIIlIllllI);
            return new String(lllllllllllllIIIIIllllIIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllllIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllllIIIlIlllII) {
            lllllllllllllIIIIIllllIIIlIlllII.printStackTrace();
            return null;
        }
    }
    
    private static void llllIllIllIlIlI() {
        (lIllIIIIllIIIl = new String[TileEntityBrewingStand.lIllIIIIllIIlI[13]])[TileEntityBrewingStand.lIllIIIIllIIlI[1]] = llllIllIllIIlll("LyEaBAslIBECRC48EQcDIik=", "LNtpj");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[0]] = llllIllIllIIlll("OSMtFCQ=", "pWHyW");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[3]] = llllIllIllIlIII("uC4mXZWaQCs=", "AziHD");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[2]] = llllIllIllIlIII("/K0hcnqjfwGRzQpVO+u0Hw==", "JgERS");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[4]] = llllIllIllIlIIl("sejeq4UmLvRENOy9NEIG7Q==", "lYCOL");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[8]] = llllIllIllIlIIl("2MuUDgvD72LwDR1fD4nCUA==", "enmhC");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[9]] = llllIllIllIIlll("JwUkIDEMGiQ=", "ewAWe");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[10]] = llllIllIllIlIII("PXm67lSu+fU=", "FzvMO");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[7]] = llllIllIllIlIII("gYLoG/8hwLg=", "WDKjx");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[11]] = llllIllIllIlIII("Q++UUYh+17wVQs8QjbqGTA==", "koHfK");
        TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[6]] = llllIllIllIlIII("/Jp5oz3Dalo9Mz/yKY0Y3GFaJ8Iq5JW6", "VWcnf");
    }
    
    @Override
    public Container createContainer(final InventoryPlayer lllllllllllllIIIIIllllIIlIlIIIIl, final EntityPlayer lllllllllllllIIIIIllllIIlIlIIIII) {
        return new ContainerBrewingStand(lllllllllllllIIIIIllllIIlIlIIIIl, this);
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIIIIIllllIIllIIllII) {
        int n;
        if (llllIllIlllIIII(this.worldObj.getTileEntity(this.pos), this)) {
            n = TileEntityBrewingStand.lIllIIIIllIIlI[1];
            "".length();
            if (-(0xBA ^ 0xBF) >= 0) {
                return ((0x58 ^ 0x7C) & ~(0x41 ^ 0x65)) != 0x0;
            }
        }
        else if (llllIllIlllIlIl(llllIllIllllIII(lllllllllllllIIIIIllllIIllIIllII.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = TileEntityBrewingStand.lIllIIIIllIIlI[0];
            "".length();
            if ("  ".length() == 0) {
                return ((0x19 ^ 0x48) & ~(0x29 ^ 0x78)) != 0x0;
            }
        }
        else {
            n = TileEntityBrewingStand.lIllIIIIllIIlI[1];
        }
        return n != 0;
    }
    
    @Override
    public int getFieldCount() {
        return TileEntityBrewingStand.lIllIIIIllIIlI[0];
    }
    
    private static boolean llllIllIllllIIl(final int lllllllllllllIIIIIllllIIIlIlIIll, final int lllllllllllllIIIIIllllIIIlIlIIlI) {
        return lllllllllllllIIIIIllllIIIlIlIIll == lllllllllllllIIIIIllllIIIlIlIIlI;
    }
    
    @Override
    public boolean canInsertItem(final int lllllllllllllIIIIIllllIIlIlIllll, final ItemStack lllllllllllllIIIIIllllIIlIlIlIlI, final EnumFacing lllllllllllllIIIIIllllIIlIlIllIl) {
        return this.isItemValidForSlot(lllllllllllllIIIIIllllIIlIlIllll, lllllllllllllIIIIIllllIIlIlIlIlI);
    }
    
    private static boolean llllIllIlllIIIl(final int lllllllllllllIIIIIllllIIIlIIllll, final int lllllllllllllIIIIIllllIIIlIIlllI) {
        return lllllllllllllIIIIIllllIIIlIIllll >= lllllllllllllIIIIIllllIIIlIIlllI;
    }
    
    @Override
    public void setField(final int lllllllllllllIIIIIllllIIlIIlIIII, final int lllllllllllllIIIIIllllIIlIIIllll) {
        switch (lllllllllllllIIIIIllllIIlIIlIIII) {
            case 0: {
                this.brewTime = lllllllllllllIIIIIllllIIlIIIllll;
                break;
            }
        }
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int lllllllllllllIIIIIllllIIlllIIIII) {
        if (llllIllIlllIllI(lllllllllllllIIIIIllllIIlllIIIII) && llllIllIlllIlll(lllllllllllllIIIIIllllIIlllIIIII, this.brewingItemStacks.length)) {
            final ItemStack lllllllllllllIIIIIllllIIllIlllll = this.brewingItemStacks[lllllllllllllIIIIIllllIIlllIIIII];
            this.brewingItemStacks[lllllllllllllIIIIIllllIIlllIIIII] = null;
            return lllllllllllllIIIIIllllIIllIlllll;
        }
        return null;
    }
    
    private static boolean llllIllIllIllIl(final Object lllllllllllllIIIIIllllIIIlIIIlII) {
        return lllllllllllllIIIIIllllIIIlIIIlII != null;
    }
    
    @Override
    public boolean canExtractItem(final int lllllllllllllIIIIIllllIIlIlIlIII, final ItemStack lllllllllllllIIIIIllllIIlIlIIlll, final EnumFacing lllllllllllllIIIIIllllIIlIlIIllI) {
        return TileEntityBrewingStand.lIllIIIIllIIlI[0] != 0;
    }
    
    private static boolean llllIllIllIlllI(final int lllllllllllllIIIIIllllIIIIllIlII) {
        return lllllllllllllIIIIIllllIIIIllIlII > 0;
    }
    
    public void setName(final String lllllllllllllIIIIIllllIlIlIllIIl) {
        this.customName = lllllllllllllIIIIIllllIlIlIllIIl;
    }
    
    private static boolean llllIllIllIllII(final int lllllllllllllIIIIIllllIIIIllllII) {
        return lllllllllllllIIIIIllllIIIIllllII != 0;
    }
    
    private static boolean llllIllIlllIlIl(final int lllllllllllllIIIIIllllIIIIllIllI) {
        return lllllllllllllIIIIIllllIIIIllIllI <= 0;
    }
    
    private static boolean llllIllIlllIIlI(final Object lllllllllllllIIIIIllllIIIlIIIIIl, final Object lllllllllllllIIIIIllllIIIlIIIIII) {
        return lllllllllllllIIIIIllllIIIlIIIIIl == lllllllllllllIIIIIllllIIIlIIIIII;
    }
    
    private static boolean llllIllIlllIllI(final int lllllllllllllIIIIIllllIIIIlllIII) {
        return lllllllllllllIIIIIllllIIIIlllIII >= 0;
    }
    
    private static boolean llllIllIlllIlll(final int lllllllllllllIIIIIllllIIIlIIlIll, final int lllllllllllllIIIIIllllIIIlIIlIlI) {
        return lllllllllllllIIIIIllllIIIlIIlIll < lllllllllllllIIIIIllllIIIlIIlIlI;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return TileEntityBrewingStand.lIllIIIIllIIlI[12];
    }
    
    @Override
    public void setInventorySlotContents(final int lllllllllllllIIIIIllllIIllIlIlII, final ItemStack lllllllllllllIIIIIllllIIllIlIllI) {
        if (llllIllIlllIllI(lllllllllllllIIIIIllllIIllIlIlII) && llllIllIlllIlll(lllllllllllllIIIIIllllIIllIlIlII, this.brewingItemStacks.length)) {
            this.brewingItemStacks[lllllllllllllIIIIIllllIIllIlIlII] = lllllllllllllIIIIIllllIIllIlIllI;
        }
    }
    
    @Override
    public void clear() {
        int lllllllllllllIIIIIllllIIlIIIlIlI = TileEntityBrewingStand.lIllIIIIllIIlI[1];
        "".length();
        if (((212 + 37 - 214 + 195 ^ 103 + 20 + 6 + 47) & (0x10 ^ 0x17 ^ (0x62 ^ 0x33) ^ -" ".length())) > "  ".length()) {
            return;
        }
        while (!llllIllIlllIIIl(lllllllllllllIIIIIllllIIlIIIlIlI, this.brewingItemStacks.length)) {
            this.brewingItemStacks[lllllllllllllIIIIIllllIIlIIIlIlI] = null;
            ++lllllllllllllIIIIIllllIIlIIIlIlI;
        }
    }
    
    @Override
    public void update() {
        if (llllIllIllIlllI(this.brewTime)) {
            this.brewTime -= TileEntityBrewingStand.lIllIIIIllIIlI[0];
            if (llllIllIllIllll(this.brewTime)) {
                this.brewPotions();
                this.markDirty();
                "".length();
                if ("   ".length() == (0xC1 ^ 0xA3 ^ (0xD9 ^ 0xBF))) {
                    return;
                }
            }
            else if (llllIllIllIllll(this.canBrew() ? 1 : 0)) {
                this.brewTime = TileEntityBrewingStand.lIllIIIIllIIlI[1];
                this.markDirty();
                "".length();
                if (((0x8C ^ 0xAF ^ (0x78 ^ 0x75)) & (0x6E ^ 0x38 ^ (0x50 ^ 0x28) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (llllIllIlllIIII(this.ingredientID, this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]].getItem())) {
                this.brewTime = TileEntityBrewingStand.lIllIIIIllIIlI[1];
                this.markDirty();
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else if (llllIllIllIllII(this.canBrew() ? 1 : 0)) {
            this.brewTime = TileEntityBrewingStand.lIllIIIIllIIlI[5];
            this.ingredientID = this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]].getItem();
        }
        if (llllIllIllIllll(this.worldObj.isRemote ? 1 : 0)) {
            final boolean[] lllllllllllllIIIIIllllIlIlIlIIII = this.func_174902_m();
            if (llllIllIllIllll(Arrays.equals(lllllllllllllIIIIIllllIlIlIlIIII, this.filledSlots) ? 1 : 0)) {
                this.filledSlots = lllllllllllllIIIIIllllIlIlIlIIII;
                IBlockState lllllllllllllIIIIIllllIlIlIIllll = this.worldObj.getBlockState(this.getPos());
                if (llllIllIllIllll((lllllllllllllIIIIIllllIlIlIIllll.getBlock() instanceof BlockBrewingStand) ? 1 : 0)) {
                    return;
                }
                int lllllllllllllIIIIIllllIlIlIIlllI = TileEntityBrewingStand.lIllIIIIllIIlI[1];
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                while (!llllIllIlllIIIl(lllllllllllllIIIIIllllIlIlIIlllI, BlockBrewingStand.HAS_BOTTLE.length)) {
                    lllllllllllllIIIIIllllIlIlIIllll = lllllllllllllIIIIIllllIlIlIIllll.withProperty((IProperty<Comparable>)BlockBrewingStand.HAS_BOTTLE[lllllllllllllIIIIIllllIlIlIIlllI], lllllllllllllIIIIIllllIlIlIlIIII[lllllllllllllIIIIIllllIlIlIIlllI]);
                    ++lllllllllllllIIIIIllllIlIlIIlllI;
                }
                this.worldObj.setBlockState(this.pos, lllllllllllllIIIIIllllIlIlIIllll, TileEntityBrewingStand.lIllIIIIllIIlI[3]);
                "".length();
            }
        }
    }
    
    private static boolean llllIllIlllIIll(final int lllllllllllllIIIIIllllIIIIllIIIl, final int lllllllllllllIIIIIllllIIIIllIIII) {
        return lllllllllllllIIIIIllllIIIIllIIIl != lllllllllllllIIIIIllllIIIIllIIII;
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIIIIIllllIIllIIlIII) {
    }
    
    private static int llllIllIllllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean[] func_174902_m() {
        final boolean[] lllllllllllllIIIIIllllIIlIllllII = new boolean[TileEntityBrewingStand.lIllIIIIllIIlI[2]];
        int lllllllllllllIIIIIllllIIlIlllIll = TileEntityBrewingStand.lIllIIIIllIIlI[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llllIllIlllIIIl(lllllllllllllIIIIIllllIIlIlllIll, TileEntityBrewingStand.lIllIIIIllIIlI[2])) {
            if (llllIllIllIllIl(this.brewingItemStacks[lllllllllllllIIIIIllllIIlIlllIll])) {
                lllllllllllllIIIIIllllIIlIllllII[lllllllllllllIIIIIllllIIlIlllIll] = (TileEntityBrewingStand.lIllIIIIllIIlI[0] != 0);
            }
            ++lllllllllllllIIIIIllllIIlIlllIll;
        }
        return lllllllllllllIIIIIllllIIlIllllII;
    }
    
    @Override
    public boolean hasCustomName() {
        if (llllIllIllIllIl(this.customName) && llllIllIllIlllI(this.customName.length())) {
            return TileEntityBrewingStand.lIllIIIIllIIlI[0] != 0;
        }
        return TileEntityBrewingStand.lIllIIIIllIIlI[1] != 0;
    }
    
    @Override
    public String getName() {
        String customName;
        if (llllIllIllIllII(this.hasCustomName() ? 1 : 0)) {
            customName = this.customName;
            "".length();
            if (((157 + 140 - 83 + 8 ^ 132 + 134 - 189 + 79) & (0x47 ^ 0x60 ^ (0x1D ^ 0x78) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            customName = TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[1]];
        }
        return customName;
    }
    
    @Override
    public int getField(final int lllllllllllllIIIIIllllIIlIIllIlI) {
        switch (lllllllllllllIIIIIllllIIlIIllIlI) {
            case 0: {
                return this.brewTime;
            }
            default: {
                return TileEntityBrewingStand.lIllIIIIllIIlI[1];
            }
        }
    }
    
    @Override
    public int[] getSlotsForFace(final EnumFacing lllllllllllllIIIIIllllIIlIllIlIl) {
        int[] array;
        if (llllIllIlllIIlI(lllllllllllllIIIIIllllIIlIllIlIl, EnumFacing.UP)) {
            array = TileEntityBrewingStand.inputSlots;
            "".length();
            if (-(0x57 ^ 0x52) >= 0) {
                return null;
            }
        }
        else {
            array = TileEntityBrewingStand.outputSlots;
        }
        return array;
    }
    
    private static boolean llllIllIlllIlII(final Object lllllllllllllIIIIIllllIIIIlllllI) {
        return lllllllllllllIIIIIllllIIIIlllllI == null;
    }
    
    static {
        llllIllIllIlIll();
        llllIllIllIlIlI();
        final int[] inputSlots2 = new int[TileEntityBrewingStand.lIllIIIIllIIlI[0]];
        inputSlots2[TileEntityBrewingStand.lIllIIIIllIIlI[1]] = TileEntityBrewingStand.lIllIIIIllIIlI[2];
        inputSlots = inputSlots2;
        final int[] outputSlots2 = new int[TileEntityBrewingStand.lIllIIIIllIIlI[2]];
        outputSlots2[TileEntityBrewingStand.lIllIIIIllIIlI[0]] = TileEntityBrewingStand.lIllIIIIllIIlI[0];
        outputSlots2[TileEntityBrewingStand.lIllIIIIllIIlI[3]] = TileEntityBrewingStand.lIllIIIIllIIlI[3];
        outputSlots = outputSlots2;
    }
    
    private boolean canBrew() {
        if (!llllIllIllIllIl(this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]]) || !llllIllIllIlllI(this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]].stackSize)) {
            return TileEntityBrewingStand.lIllIIIIllIIlI[1] != 0;
        }
        final ItemStack lllllllllllllIIIIIllllIlIlIIIIII = this.brewingItemStacks[TileEntityBrewingStand.lIllIIIIllIIlI[2]];
        if (llllIllIllIllll(lllllllllllllIIIIIllllIlIlIIIIII.getItem().isPotionIngredient(lllllllllllllIIIIIllllIlIlIIIIII) ? 1 : 0)) {
            return TileEntityBrewingStand.lIllIIIIllIIlI[1] != 0;
        }
        boolean lllllllllllllIIIIIllllIlIIllllll = TileEntityBrewingStand.lIllIIIIllIIlI[1] != 0;
        int lllllllllllllIIIIIllllIlIIlllllI = TileEntityBrewingStand.lIllIIIIllIIlI[1];
        "".length();
        if ("  ".length() >= (0x75 ^ 0x5 ^ (0x50 ^ 0x24))) {
            return ((120 + 97 - 162 + 152 ^ 72 + 69 + 2 + 31) & (0x74 ^ 0x51 ^ (0xE9 ^ 0xAD) ^ -" ".length())) != 0x0;
        }
        while (!llllIllIlllIIIl(lllllllllllllIIIIIllllIlIIlllllI, TileEntityBrewingStand.lIllIIIIllIIlI[2])) {
            if (llllIllIllIllIl(this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlllllI]) && llllIllIlllIIlI(this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlllllI].getItem(), Items.potionitem)) {
                final int lllllllllllllIIIIIllllIlIIllllIl = this.brewingItemStacks[lllllllllllllIIIIIllllIlIIlllllI].getMetadata();
                final int lllllllllllllIIIIIllllIlIIllllII = this.getPotionResult(lllllllllllllIIIIIllllIlIIllllIl, lllllllllllllIIIIIllllIlIlIIIIII);
                if (llllIllIllIllll(ItemPotion.isSplash(lllllllllllllIIIIIllllIlIIllllIl) ? 1 : 0) && llllIllIllIllII(ItemPotion.isSplash(lllllllllllllIIIIIllllIlIIllllII) ? 1 : 0)) {
                    lllllllllllllIIIIIllllIlIIllllll = (TileEntityBrewingStand.lIllIIIIllIIlI[0] != 0);
                    "".length();
                    if ("   ".length() < 0) {
                        return ((0x2 ^ 0xA) & ~(0x69 ^ 0x61)) != 0x0;
                    }
                    break;
                }
                else {
                    final List<PotionEffect> lllllllllllllIIIIIllllIlIIlllIll = Items.potionitem.getEffects(lllllllllllllIIIIIllllIlIIllllIl);
                    final List<PotionEffect> lllllllllllllIIIIIllllIlIIlllIlI = Items.potionitem.getEffects(lllllllllllllIIIIIllllIlIIllllII);
                    if ((!llllIllIllIlllI(lllllllllllllIIIIIllllIlIIllllIl) || llllIllIlllIIII(lllllllllllllIIIIIllllIlIIlllIll, lllllllllllllIIIIIllllIlIIlllIlI)) && (!llllIllIllIllIl(lllllllllllllIIIIIllllIlIIlllIll) || (llllIllIllIllll(lllllllllllllIIIIIllllIlIIlllIll.equals(lllllllllllllIIIIIllllIlIIlllIlI) ? 1 : 0) && llllIllIllIllIl(lllllllllllllIIIIIllllIlIIlllIlI))) && llllIllIlllIIll(lllllllllllllIIIIIllllIlIIllllIl, lllllllllllllIIIIIllllIlIIllllII)) {
                        lllllllllllllIIIIIllllIlIIllllll = (TileEntityBrewingStand.lIllIIIIllIIlI[0] != 0);
                        "".length();
                        if ((0xC1 ^ 0xC5) == 0x0) {
                            return ((0xA5 ^ 0xAB) & ~(0x24 ^ 0x2A)) != 0x0;
                        }
                        break;
                    }
                }
            }
            ++lllllllllllllIIIIIllllIlIIlllllI;
        }
        return lllllllllllllIIIIIllllIlIIllllll;
    }
    
    @Override
    public int getSizeInventory() {
        return this.brewingItemStacks.length;
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIIIIIllllIIllIIIIlI, final ItemStack lllllllllllllIIIIIllllIIllIIIIIl) {
        int potionIngredient;
        if (llllIllIllllIIl(lllllllllllllIIIIIllllIIllIIIIlI, TileEntityBrewingStand.lIllIIIIllIIlI[2])) {
            potionIngredient = (lllllllllllllIIIIIllllIIllIIIIIl.getItem().isPotionIngredient(lllllllllllllIIIIIllllIIllIIIIIl) ? 1 : 0);
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x7E ^ 0x5F ^ (0x0 ^ 0x1D)) & (63 + 111 - 63 + 36 ^ 146 + 34 - 100 + 95 ^ -" ".length())) != 0x0;
            }
        }
        else if (llllIllIlllIIII(lllllllllllllIIIIIllllIIllIIIIIl.getItem(), Items.potionitem) && llllIllIlllIIII(lllllllllllllIIIIIllllIIllIIIIIl.getItem(), Items.glass_bottle)) {
            potionIngredient = TileEntityBrewingStand.lIllIIIIllIIlI[1];
            "".length();
            if (((0x49 ^ 0x18) & ~(0x73 ^ 0x22)) != 0x0) {
                return ((0x7B ^ 0x5D) & ~(0x2D ^ 0xB)) != 0x0;
            }
        }
        else {
            potionIngredient = TileEntityBrewingStand.lIllIIIIllIIlI[0];
        }
        return potionIngredient != 0;
    }
    
    private static String llllIllIllIIlll(String lllllllllllllIIIIIllllIIIllIlIll, final String lllllllllllllIIIIIllllIIIllIllll) {
        lllllllllllllIIIIIllllIIIllIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIllllIIIllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllllIIIllIlllI = new StringBuilder();
        final char[] lllllllllllllIIIIIllllIIIllIllIl = lllllllllllllIIIIIllllIIIllIllll.toCharArray();
        int lllllllllllllIIIIIllllIIIllIllII = TileEntityBrewingStand.lIllIIIIllIIlI[1];
        final short lllllllllllllIIIIIllllIIIllIIllI = (Object)lllllllllllllIIIIIllllIIIllIlIll.toCharArray();
        final long lllllllllllllIIIIIllllIIIllIIlIl = lllllllllllllIIIIIllllIIIllIIllI.length;
        char lllllllllllllIIIIIllllIIIllIIlII = (char)TileEntityBrewingStand.lIllIIIIllIIlI[1];
        while (llllIllIlllIlll(lllllllllllllIIIIIllllIIIllIIlII, (int)lllllllllllllIIIIIllllIIIllIIlIl)) {
            final char lllllllllllllIIIIIllllIIIlllIIIl = lllllllllllllIIIIIllllIIIllIIllI[lllllllllllllIIIIIllllIIIllIIlII];
            lllllllllllllIIIIIllllIIIllIlllI.append((char)(lllllllllllllIIIIIllllIIIlllIIIl ^ lllllllllllllIIIIIllllIIIllIllIl[lllllllllllllIIIIIllllIIIllIllII % lllllllllllllIIIIIllllIIIllIllIl.length]));
            "".length();
            ++lllllllllllllIIIIIllllIIIllIllII;
            ++lllllllllllllIIIIIllllIIIllIIlII;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllllIIIllIlllI);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIIIIIllllIlIIIIlllI) {
        super.readFromNBT(lllllllllllllIIIIIllllIlIIIIlllI);
        final NBTTagList lllllllllllllIIIIIllllIlIIIIllIl = lllllllllllllIIIIIllllIlIIIIlllI.getTagList(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[0]], TileEntityBrewingStand.lIllIIIIllIIlI[6]);
        this.brewingItemStacks = new ItemStack[this.getSizeInventory()];
        int lllllllllllllIIIIIllllIlIIIIllII = TileEntityBrewingStand.lIllIIIIllIIlI[1];
        "".length();
        if ((0xA3 ^ 0x9E ^ (0xB6 ^ 0x8F)) <= -" ".length()) {
            return;
        }
        while (!llllIllIlllIIIl(lllllllllllllIIIIIllllIlIIIIllII, lllllllllllllIIIIIllllIlIIIIllIl.tagCount())) {
            final NBTTagCompound lllllllllllllIIIIIllllIlIIIIlIll = lllllllllllllIIIIIllllIlIIIIllIl.getCompoundTagAt(lllllllllllllIIIIIllllIlIIIIllII);
            final int lllllllllllllIIIIIllllIlIIIIlIlI = lllllllllllllIIIIIllllIlIIIIlIll.getByte(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[3]]);
            if (llllIllIlllIllI(lllllllllllllIIIIIllllIlIIIIlIlI) && llllIllIlllIlll(lllllllllllllIIIIIllllIlIIIIlIlI, this.brewingItemStacks.length)) {
                this.brewingItemStacks[lllllllllllllIIIIIllllIlIIIIlIlI] = ItemStack.loadItemStackFromNBT(lllllllllllllIIIIIllllIlIIIIlIll);
            }
            ++lllllllllllllIIIIIllllIlIIIIllII;
        }
        this.brewTime = lllllllllllllIIIIIllllIlIIIIlllI.getShort(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[2]]);
        if (llllIllIllIllII(lllllllllllllIIIIIllllIlIIIIlllI.hasKey(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[4]], TileEntityBrewingStand.lIllIIIIllIIlI[7]) ? 1 : 0)) {
            this.customName = lllllllllllllIIIIIllllIlIIIIlllI.getString(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[8]]);
        }
    }
    
    private static String llllIllIllIlIII(final String lllllllllllllIIIIIllllIIIllllllI, final String lllllllllllllIIIIIllllIIIlllllll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllllIIlIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllllIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllllIIlIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllllIIlIIIIIlI.init(TileEntityBrewingStand.lIllIIIIllIIlI[3], lllllllllllllIIIIIllllIIlIIIIIll);
            return new String(lllllllllllllIIIIIllllIIlIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllllIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllllIIlIIIIIIl) {
            lllllllllllllIIIIIllllIIlIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIIIIIllllIIllllllIl) {
        super.writeToNBT(lllllllllllllIIIIIllllIIllllllIl);
        lllllllllllllIIIIIllllIIllllllIl.setShort(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[9]], (short)this.brewTime);
        final NBTTagList lllllllllllllIIIIIllllIIllllllII = new NBTTagList();
        int lllllllllllllIIIIIllllIIlllllIll = TileEntityBrewingStand.lIllIIIIllIIlI[1];
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
        while (!llllIllIlllIIIl(lllllllllllllIIIIIllllIIlllllIll, this.brewingItemStacks.length)) {
            if (llllIllIllIllIl(this.brewingItemStacks[lllllllllllllIIIIIllllIIlllllIll])) {
                final NBTTagCompound lllllllllllllIIIIIllllIIlllllIlI = new NBTTagCompound();
                lllllllllllllIIIIIllllIIlllllIlI.setByte(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[10]], (byte)lllllllllllllIIIIIllllIIlllllIll);
                this.brewingItemStacks[lllllllllllllIIIIIllllIIlllllIll].writeToNBT(lllllllllllllIIIIIllllIIlllllIlI);
                "".length();
                lllllllllllllIIIIIllllIIllllllII.appendTag(lllllllllllllIIIIIllllIIlllllIlI);
            }
            ++lllllllllllllIIIIIllllIIlllllIll;
        }
        lllllllllllllIIIIIllllIIllllllIl.setTag(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[7]], lllllllllllllIIIIIllllIIllllllII);
        if (llllIllIllIllII(this.hasCustomName() ? 1 : 0)) {
            lllllllllllllIIIIIllllIIllllllIl.setString(TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[11]], this.customName);
        }
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIIIIIllllIIlllIIllI, final int lllllllllllllIIIIIllllIIlllIlIIl) {
        if (llllIllIlllIllI(lllllllllllllIIIIIllllIIlllIIllI) && llllIllIlllIlll(lllllllllllllIIIIIllllIIlllIIllI, this.brewingItemStacks.length)) {
            final ItemStack lllllllllllllIIIIIllllIIlllIlIII = this.brewingItemStacks[lllllllllllllIIIIIllllIIlllIIllI];
            this.brewingItemStacks[lllllllllllllIIIIIllllIIlllIIllI] = null;
            return lllllllllllllIIIIIllllIIlllIlIII;
        }
        return null;
    }
    
    @Override
    public String getGuiID() {
        return TileEntityBrewingStand.lIllIIIIllIIIl[TileEntityBrewingStand.lIllIIIIllIIlI[6]];
    }
    
    @Override
    public ItemStack getStackInSlot(final int lllllllllllllIIIIIllllIIllllIIIl) {
        ItemStack itemStack;
        if (llllIllIlllIllI(lllllllllllllIIIIIllllIIllllIIIl) && llllIllIlllIlll(lllllllllllllIIIIIllllIIllllIIIl, this.brewingItemStacks.length)) {
            itemStack = this.brewingItemStacks[lllllllllllllIIIIIllllIIllllIIIl];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            itemStack = null;
        }
        return itemStack;
    }
}
