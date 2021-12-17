// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityEnderChest;

public class InventoryEnderChest extends InventoryBasic
{
    private static final /* synthetic */ int[] llllIlIlIIIII;
    private static final /* synthetic */ String[] llllIlIIlllIl;
    private /* synthetic */ TileEntityEnderChest associatedChest;
    
    private static boolean lIlIlIlIIlIlIll(final int lllllllllllllIlIllIllIlIIIIIIlll, final int lllllllllllllIlIllIllIlIIIIIIllI) {
        return lllllllllllllIlIllIllIlIIIIIIlll < lllllllllllllIlIllIllIlIIIIIIllI;
    }
    
    private static void lIlIlIlIIlIlIII() {
        (llllIlIlIIIII = new int[7])[0] = ((110 + 78 - 146 + 117 ^ 79 + 61 - 41 + 35) & (0x42 ^ 0x4E ^ (0x98 ^ 0x8D) ^ -" ".length()));
        InventoryEnderChest.llllIlIlIIIII[1] = (0x9E ^ 0x85);
        InventoryEnderChest.llllIlIlIIIII[2] = " ".length();
        InventoryEnderChest.llllIlIlIIIII[3] = (0xC3 ^ 0xA4) + (0x7D ^ 0x2C) - -(0xDA ^ 0xC2) + (0x5E ^ 0x71);
        InventoryEnderChest.llllIlIlIIIII[4] = "  ".length();
        InventoryEnderChest.llllIlIlIIIII[5] = "   ".length();
        InventoryEnderChest.llllIlIlIIIII[6] = (0x67 ^ 0x5 ^ (0xF3 ^ 0x99));
    }
    
    private static boolean lIlIlIlIIlIlIIl(final int lllllllllllllIlIllIllIlIIIIIlIll, final int lllllllllllllIlIllIllIlIIIIIlIlI) {
        return lllllllllllllIlIllIllIlIIIIIlIll >= lllllllllllllIlIllIllIlIIIIIlIlI;
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIlIllIllIlIIIllIlIl) {
        if (lIlIlIlIIlIllII(this.associatedChest)) {
            this.associatedChest.closeChest();
        }
        super.closeInventory(lllllllllllllIlIllIllIlIIIllIlIl);
        this.associatedChest = null;
    }
    
    private static boolean lIlIlIlIIlIlIlI(final int lllllllllllllIlIllIllIlIIIIIIIII) {
        return lllllllllllllIlIllIllIlIIIIIIIII >= 0;
    }
    
    public void setChestTileEntity(final TileEntityEnderChest lllllllllllllIlIllIllIlIIllllIII) {
        this.associatedChest = lllllllllllllIlIllIllIlIIllllIII;
    }
    
    private static boolean lIlIlIlIIlIllII(final Object lllllllllllllIlIllIllIlIIIIIIlII) {
        return lllllllllllllIlIllIllIlIIIIIIlII != null;
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIlIllIllIlIIIlllIll) {
        if (lIlIlIlIIlIllII(this.associatedChest)) {
            this.associatedChest.openChest();
        }
        super.openInventory(lllllllllllllIlIllIllIlIIIlllIll);
    }
    
    public NBTTagList saveInventoryToNBT() {
        final NBTTagList lllllllllllllIlIllIllIlIIlIllIll = new NBTTagList();
        int lllllllllllllIlIllIllIlIIlIllIIl = InventoryEnderChest.llllIlIlIIIII[0];
        "".length();
        if (-"   ".length() >= 0) {
            return null;
        }
        while (!lIlIlIlIIlIlIIl(lllllllllllllIlIllIllIlIIlIllIIl, this.getSizeInventory())) {
            final ItemStack lllllllllllllIlIllIllIlIIlIlIlll = this.getStackInSlot(lllllllllllllIlIllIllIlIIlIllIIl);
            if (lIlIlIlIIlIllII(lllllllllllllIlIllIllIlIIlIlIlll)) {
                final NBTTagCompound lllllllllllllIlIllIllIlIIlIlIllI = new NBTTagCompound();
                lllllllllllllIlIllIllIlIIlIlIllI.setByte(InventoryEnderChest.llllIlIIlllIl[InventoryEnderChest.llllIlIlIIIII[4]], (byte)lllllllllllllIlIllIllIlIIlIllIIl);
                lllllllllllllIlIllIllIlIIlIlIlll.writeToNBT(lllllllllllllIlIllIllIlIIlIlIllI);
                "".length();
                lllllllllllllIlIllIllIlIIlIllIll.appendTag(lllllllllllllIlIllIllIlIIlIlIllI);
            }
            ++lllllllllllllIlIllIllIlIIlIllIIl;
        }
        return lllllllllllllIlIllIllIlIIlIllIll;
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIlIllIllIlIIlIIIlII) {
        int useableByPlayer;
        if (lIlIlIlIIlIllII(this.associatedChest) && lIlIlIlIIlIllIl(this.associatedChest.canBeUsed(lllllllllllllIlIllIllIlIIlIIIlII) ? 1 : 0)) {
            useableByPlayer = InventoryEnderChest.llllIlIlIIIII[0];
            "".length();
            if (((23 + 139 - 97 + 77 ^ 82 + 121 - 97 + 77) & (104 + 80 - 176 + 120 ^ 65 + 74 + 20 + 26 ^ -" ".length())) < 0) {
                return ((0x6A ^ 0x25 ^ (0x11 ^ 0x65)) & (0x9C ^ 0xA6 ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            useableByPlayer = (super.isUseableByPlayer(lllllllllllllIlIllIllIlIIlIIIlII) ? 1 : 0);
        }
        return useableByPlayer != 0;
    }
    
    public void loadInventoryFromNBT(final NBTTagList lllllllllllllIlIllIllIlIIllIllll) {
        int lllllllllllllIlIllIllIlIIllIlllI = InventoryEnderChest.llllIlIlIIIII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIlIlIIlIlIIl(lllllllllllllIlIllIllIlIIllIlllI, this.getSizeInventory())) {
            this.setInventorySlotContents(lllllllllllllIlIllIllIlIIllIlllI, null);
            ++lllllllllllllIlIllIllIlIIllIlllI;
        }
        int lllllllllllllIlIllIllIlIIllIllIl = InventoryEnderChest.llllIlIlIIIII[0];
        "".length();
        if ("  ".length() <= -" ".length()) {
            return;
        }
        while (!lIlIlIlIIlIlIIl(lllllllllllllIlIllIllIlIIllIllIl, lllllllllllllIlIllIllIlIIllIllll.tagCount())) {
            final NBTTagCompound lllllllllllllIlIllIllIlIIllIllII = lllllllllllllIlIllIllIlIIllIllll.getCompoundTagAt(lllllllllllllIlIllIllIlIIllIllIl);
            final int lllllllllllllIlIllIllIlIIllIlIll = lllllllllllllIlIllIllIlIIllIllII.getByte(InventoryEnderChest.llllIlIIlllIl[InventoryEnderChest.llllIlIlIIIII[2]]) & InventoryEnderChest.llllIlIlIIIII[3];
            if (lIlIlIlIIlIlIlI(lllllllllllllIlIllIllIlIIllIlIll) && lIlIlIlIIlIlIll(lllllllllllllIlIllIllIlIIllIlIll, this.getSizeInventory())) {
                this.setInventorySlotContents(lllllllllllllIlIllIllIlIIllIlIll, ItemStack.loadItemStackFromNBT(lllllllllllllIlIllIllIlIIllIllII));
            }
            ++lllllllllllllIlIllIllIlIIllIllIl;
        }
    }
    
    private static boolean lIlIlIlIIlIllIl(final int lllllllllllllIlIllIllIlIIIIIIIlI) {
        return lllllllllllllIlIllIllIlIIIIIIIlI == 0;
    }
    
    public InventoryEnderChest() {
        super(InventoryEnderChest.llllIlIIlllIl[InventoryEnderChest.llllIlIlIIIII[0]], (boolean)(InventoryEnderChest.llllIlIlIIIII[0] != 0), InventoryEnderChest.llllIlIlIIIII[1]);
    }
    
    private static String lIlIlIlIIlIIlII(String lllllllllllllIlIllIllIlIIIIlIllI, final String lllllllllllllIlIllIllIlIIIIlIlIl) {
        lllllllllllllIlIllIllIlIIIIlIllI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIllIlIIIIlIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIllIlIIIIllIIl = new StringBuilder();
        final char[] lllllllllllllIlIllIllIlIIIIllIII = lllllllllllllIlIllIllIlIIIIlIlIl.toCharArray();
        int lllllllllllllIlIllIllIlIIIIlIlll = InventoryEnderChest.llllIlIlIIIII[0];
        final short lllllllllllllIlIllIllIlIIIIlIIIl = (Object)((String)lllllllllllllIlIllIllIlIIIIlIllI).toCharArray();
        final double lllllllllllllIlIllIllIlIIIIlIIII = lllllllllllllIlIllIllIlIIIIlIIIl.length;
        String lllllllllllllIlIllIllIlIIIIIllll = (String)InventoryEnderChest.llllIlIlIIIII[0];
        while (lIlIlIlIIlIlIll((int)lllllllllllllIlIllIllIlIIIIIllll, (int)lllllllllllllIlIllIllIlIIIIlIIII)) {
            final char lllllllllllllIlIllIllIlIIIIlllII = lllllllllllllIlIllIllIlIIIIlIIIl[lllllllllllllIlIllIllIlIIIIIllll];
            lllllllllllllIlIllIllIlIIIIllIIl.append((char)(lllllllllllllIlIllIllIlIIIIlllII ^ lllllllllllllIlIllIllIlIIIIllIII[lllllllllllllIlIllIllIlIIIIlIlll % lllllllllllllIlIllIllIlIIIIllIII.length]));
            "".length();
            ++lllllllllllllIlIllIllIlIIIIlIlll;
            ++lllllllllllllIlIllIllIlIIIIIllll;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIllIlIIIIllIIl);
    }
    
    static {
        lIlIlIlIIlIlIII();
        lIlIlIlIIlIIlIl();
    }
    
    private static void lIlIlIlIIlIIlIl() {
        (llllIlIIlllIl = new String[InventoryEnderChest.llllIlIlIIIII[5]])[InventoryEnderChest.llllIlIlIIIII[0]] = lIlIlIlIIlIIIll("h+qxvFVqxpATr03LGF04sGoo6rfgbeaf", "NjrxJ");
        InventoryEnderChest.llllIlIIlllIl[InventoryEnderChest.llllIlIlIIIII[2]] = lIlIlIlIIlIIlII("IgQpNg==", "qhFBj");
        InventoryEnderChest.llllIlIIlllIl[InventoryEnderChest.llllIlIlIIIII[4]] = lIlIlIlIIlIIlII("EiECAA==", "AMmtA");
    }
    
    private static String lIlIlIlIIlIIIll(final String lllllllllllllIlIllIllIlIIIlIlIIl, final String lllllllllllllIlIllIllIlIIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIllIlIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllIlIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), InventoryEnderChest.llllIlIlIIIII[6]), "DES");
            final Cipher lllllllllllllIlIllIllIlIIIlIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIllIllIlIIIlIllIl.init(InventoryEnderChest.llllIlIlIIIII[4], lllllllllllllIlIllIllIlIIIlIlllI);
            return new String(lllllllllllllIlIllIllIlIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIllIlIIIlIllII) {
            lllllllllllllIlIllIllIlIIIlIllII.printStackTrace();
            return null;
        }
    }
}
