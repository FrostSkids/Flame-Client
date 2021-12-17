// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.init.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import java.util.List;
import net.minecraft.stats.StatList;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.InventoryPlayer;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;

public class ContainerEnchantment extends Container
{
    private /* synthetic */ BlockPos position;
    public /* synthetic */ int xpSeed;
    public /* synthetic */ int[] field_178151_h;
    private /* synthetic */ World worldPointer;
    public /* synthetic */ int[] enchantLevels;
    private static final /* synthetic */ int[] lIIIllllIllIll;
    public /* synthetic */ IInventory tableInventory;
    private /* synthetic */ Random rand;
    private static final /* synthetic */ String[] lIIIlllIllIlIl;
    
    private static boolean llIIIllllllllIl(final int lllllllllllllIIllllIIlIlllllIlIl, final int lllllllllllllIIllllIIlIlllllIlII) {
        return lllllllllllllIIllllIIlIlllllIlIl >= lllllllllllllIIllllIIlIlllllIlII;
    }
    
    public ContainerEnchantment(final InventoryPlayer lllllllllllllIIllllIIllIlIIlllII, final World lllllllllllllIIllllIIllIlIIlIlII, final BlockPos lllllllllllllIIllllIIllIlIIlIIll) {
        this.tableInventory = new InventoryBasic(ContainerEnchantment.lIIIlllIllIlIl[ContainerEnchantment.lIIIllllIllIll[0]], ContainerEnchantment.lIIIllllIllIll[1], ContainerEnchantment.lIIIllllIllIll[2]) {
            private static final /* synthetic */ int[] lllIllllIllllI;
            
            private static void lIlIIllIIIIlllII() {
                (lllIllllIllllI = new int[1])[0] = (0xED ^ 0xAD);
            }
            
            @Override
            public int getInventoryStackLimit() {
                return ContainerEnchantment$1.lllIllllIllllI[0];
            }
            
            @Override
            public void markDirty() {
                super.markDirty();
                ContainerEnchantment.this.onCraftMatrixChanged(this);
            }
            
            static {
                lIlIIllIIIIlllII();
            }
        };
        this.rand = new Random();
        this.enchantLevels = new int[ContainerEnchantment.lIIIllllIllIll[3]];
        final int[] field_178151_h = new int[ContainerEnchantment.lIIIllllIllIll[3]];
        field_178151_h[ContainerEnchantment.lIIIllllIllIll[0]] = ContainerEnchantment.lIIIllllIllIll[4];
        field_178151_h[ContainerEnchantment.lIIIllllIllIll[1]] = ContainerEnchantment.lIIIllllIllIll[4];
        field_178151_h[ContainerEnchantment.lIIIllllIllIll[2]] = ContainerEnchantment.lIIIllllIllIll[4];
        this.field_178151_h = field_178151_h;
        this.worldPointer = lllllllllllllIIllllIIllIlIIlIlII;
        this.position = lllllllllllllIIllllIIllIlIIlIIll;
        this.xpSeed = lllllllllllllIIllllIIllIlIIlllII.player.getXPSeed();
        this.addSlotToContainer(new Slot(this.tableInventory, ContainerEnchantment.lIIIllllIllIll[0], ContainerEnchantment.lIIIllllIllIll[5], ContainerEnchantment.lIIIllllIllIll[6]) {
            private static final /* synthetic */ int[] lIllIlIIIIlIII;
            
            private static void lllllIllllIllll() {
                (lIllIlIIIIlIII = new int[1])[0] = " ".length();
            }
            
            @Override
            public int getSlotStackLimit() {
                return ContainerEnchantment$2.lIllIlIIIIlIII[0];
            }
            
            @Override
            public boolean isItemValid(final ItemStack lllllllllllllIIIIIIIlIlIIIIlIlIl) {
                return ContainerEnchantment$2.lIllIlIIIIlIII[0] != 0;
            }
            
            static {
                lllllIllllIllll();
            }
        });
        "".length();
        this.addSlotToContainer(new Slot(this.tableInventory, ContainerEnchantment.lIIIllllIllIll[1], ContainerEnchantment.lIIIllllIllIll[7], ContainerEnchantment.lIIIllllIllIll[6]) {
            private static final /* synthetic */ int[] lIllIlIIIIllII;
            
            @Override
            public boolean isItemValid(final ItemStack lllllllllllllIIIIIIIlIIlllllIllI) {
                if (lllllIlllllIIIl(lllllllllllllIIIIIIIlIIlllllIllI.getItem(), Items.dye) && lllllIlllllIIIl(EnumDyeColor.byDyeDamage(lllllllllllllIIIIIIIlIIlllllIllI.getMetadata()), EnumDyeColor.BLUE)) {
                    return ContainerEnchantment$3.lIllIlIIIIllII[0] != 0;
                }
                return ContainerEnchantment$3.lIllIlIIIIllII[1] != 0;
            }
            
            static {
                lllllIlllllIIII();
            }
            
            private static void lllllIlllllIIII() {
                (lIllIlIIIIllII = new int[2])[0] = " ".length();
                ContainerEnchantment$3.lIllIlIIIIllII[1] = ((0xEE ^ 0xBA ^ " ".length()) & (0x7B ^ 0x3 ^ (0x78 ^ 0x55) ^ -" ".length()));
            }
            
            private static boolean lllllIlllllIIIl(final Object lllllllllllllIIIIIIIlIIllllIlllI, final Object lllllllllllllIIIIIIIlIIllllIllIl) {
                return lllllllllllllIIIIIIIlIIllllIlllI == lllllllllllllIIIIIIIlIIllllIllIl;
            }
        });
        "".length();
        int lllllllllllllIIllllIIllIlIIllIIl = ContainerEnchantment.lIIIllllIllIll[0];
        "".length();
        if ("  ".length() == "   ".length()) {
            throw null;
        }
        while (!llIIIllllllllIl(lllllllllllllIIllllIIllIlIIllIIl, ContainerEnchantment.lIIIllllIllIll[3])) {
            int lllllllllllllIIllllIIllIlIIllIII = ContainerEnchantment.lIIIllllIllIll[0];
            "".length();
            if ("  ".length() > "   ".length()) {
                throw null;
            }
            while (!llIIIllllllllIl(lllllllllllllIIllllIIllIlIIllIII, ContainerEnchantment.lIIIllllIllIll[8])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIllllIIllIlIIlllII, lllllllllllllIIllllIIllIlIIllIII + lllllllllllllIIllllIIllIlIIllIIl * ContainerEnchantment.lIIIllllIllIll[8] + ContainerEnchantment.lIIIllllIllIll[8], ContainerEnchantment.lIIIllllIllIll[9] + lllllllllllllIIllllIIllIlIIllIII * ContainerEnchantment.lIIIllllIllIll[10], ContainerEnchantment.lIIIllllIllIll[11] + lllllllllllllIIllllIIllIlIIllIIl * ContainerEnchantment.lIIIllllIllIll[10]));
                "".length();
                ++lllllllllllllIIllllIIllIlIIllIII;
            }
            ++lllllllllllllIIllllIIllIlIIllIIl;
        }
        int lllllllllllllIIllllIIllIlIIlIlll = ContainerEnchantment.lIIIllllIllIll[0];
        "".length();
        if ((67 + 40 - 29 + 79 ^ 150 + 140 - 242 + 105) > (142 + 66 - 206 + 150 ^ 18 + 57 - 39 + 120)) {
            throw null;
        }
        while (!llIIIllllllllIl(lllllllllllllIIllllIIllIlIIlIlll, ContainerEnchantment.lIIIllllIllIll[8])) {
            this.addSlotToContainer(new Slot(lllllllllllllIIllllIIllIlIIlllII, lllllllllllllIIllllIIllIlIIlIlll, ContainerEnchantment.lIIIllllIllIll[9] + lllllllllllllIIllllIIllIlIIlIlll * ContainerEnchantment.lIIIllllIllIll[10], ContainerEnchantment.lIIIllllIllIll[12]));
            "".length();
            ++lllllllllllllIIllllIIllIlIIlIlll;
        }
    }
    
    @Override
    public boolean enchantItem(final EntityPlayer lllllllllllllIIllllIIllIIlIlIlII, final int lllllllllllllIIllllIIllIIlIlIIll) {
        final ItemStack lllllllllllllIIllllIIllIIlIlIIlI = this.tableInventory.getStackInSlot(ContainerEnchantment.lIIIllllIllIll[0]);
        final ItemStack lllllllllllllIIllllIIllIIlIlIIIl = this.tableInventory.getStackInSlot(ContainerEnchantment.lIIIllllIllIll[1]);
        final int lllllllllllllIIllllIIllIIlIlIIII = lllllllllllllIIllllIIllIIlIlIIll + ContainerEnchantment.lIIIllllIllIll[1];
        if ((!llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIlIlIIIl) || llIIlIIIIIIIllI(lllllllllllllIIllllIIllIIlIlIIIl.stackSize, lllllllllllllIIllllIIllIIlIlIIII)) && llIIlIIIIIIIlII(lllllllllllllIIllllIIllIIlIlIlII.capabilities.isCreativeMode ? 1 : 0)) {
            return ContainerEnchantment.lIIIllllIllIll[0] != 0;
        }
        if (llIIlIIIIIIIlll(this.enchantLevels[lllllllllllllIIllllIIllIIlIlIIll]) && llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIlIlIIlI) && ((llIIIllllllllIl(lllllllllllllIIllllIIllIIlIlIlII.experienceLevel, lllllllllllllIIllllIIllIIlIlIIII) && !llIIlIIIIIIIllI(lllllllllllllIIllllIIllIIlIlIlII.experienceLevel, this.enchantLevels[lllllllllllllIIllllIIllIIlIlIIll])) || llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIlIlIlII.capabilities.isCreativeMode ? 1 : 0))) {
            if (llIIlIIIIIIIlII(this.worldPointer.isRemote ? 1 : 0)) {
                final List<EnchantmentData> lllllllllllllIIllllIIllIIlIIllll = this.func_178148_a(lllllllllllllIIllllIIllIIlIlIIlI, lllllllllllllIIllllIIllIIlIlIIll, this.enchantLevels[lllllllllllllIIllllIIllIIlIlIIll]);
                int n;
                if (llIIlIIIIIIIIIl(lllllllllllllIIllllIIllIIlIlIIlI.getItem(), Items.book)) {
                    n = ContainerEnchantment.lIIIllllIllIll[1];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return ((175 + 117 - 177 + 83 ^ 20 + 116 - 131 + 123) & (0x6D ^ 0x55 ^ (0xC1 ^ 0xBF) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = ContainerEnchantment.lIIIllllIllIll[0];
                }
                final boolean lllllllllllllIIllllIIllIIlIIlllI = n != 0;
                if (llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIlIIllll)) {
                    lllllllllllllIIllllIIllIIlIlIlII.removeExperienceLevel(lllllllllllllIIllllIIllIIlIlIIII);
                    if (llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIlIIlllI ? 1 : 0)) {
                        lllllllllllllIIllllIIllIIlIlIIlI.setItem(Items.enchanted_book);
                    }
                    int lllllllllllllIIllllIIllIIlIIllIl = ContainerEnchantment.lIIIllllIllIll[0];
                    "".length();
                    if (-" ".length() >= 0) {
                        return ((0x22 ^ 0x1F) & ~(0x51 ^ 0x6C)) != 0x0;
                    }
                    while (!llIIIllllllllIl(lllllllllllllIIllllIIllIIlIIllIl, lllllllllllllIIllllIIllIIlIIllll.size())) {
                        final EnchantmentData lllllllllllllIIllllIIllIIlIIllII = lllllllllllllIIllllIIllIIlIIllll.get(lllllllllllllIIllllIIllIIlIIllIl);
                        if (llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIlIIlllI ? 1 : 0)) {
                            Items.enchanted_book.addEnchantment(lllllllllllllIIllllIIllIIlIlIIlI, lllllllllllllIIllllIIllIIlIIllII);
                            "".length();
                            if (" ".length() < -" ".length()) {
                                return ((0xC1 ^ 0x92) & ~(0x38 ^ 0x6B)) != 0x0;
                            }
                        }
                        else {
                            lllllllllllllIIllllIIllIIlIlIIlI.addEnchantment(lllllllllllllIIllllIIllIIlIIllII.enchantmentobj, lllllllllllllIIllllIIllIIlIIllII.enchantmentLevel);
                        }
                        ++lllllllllllllIIllllIIllIIlIIllIl;
                    }
                    if (llIIlIIIIIIIlII(lllllllllllllIIllllIIllIIlIlIlII.capabilities.isCreativeMode ? 1 : 0)) {
                        final ItemStack itemStack = lllllllllllllIIllllIIllIIlIlIIIl;
                        itemStack.stackSize -= lllllllllllllIIllllIIllIIlIlIIII;
                        if (llIIlIIIIIIlIII(lllllllllllllIIllllIIllIIlIlIIIl.stackSize)) {
                            this.tableInventory.setInventorySlotContents(ContainerEnchantment.lIIIllllIllIll[1], null);
                        }
                    }
                    lllllllllllllIIllllIIllIIlIlIlII.triggerAchievement(StatList.field_181739_W);
                    this.tableInventory.markDirty();
                    this.xpSeed = lllllllllllllIIllllIIllIIlIlIlII.getXPSeed();
                    this.onCraftMatrixChanged(this.tableInventory);
                }
            }
            return ContainerEnchantment.lIIIllllIllIll[1] != 0;
        }
        return ContainerEnchantment.lIIIllllIllIll[0] != 0;
    }
    
    @Override
    public void updateProgressBar(final int lllllllllllllIIllllIIllIIlllllIl, final int lllllllllllllIIllllIIllIIllllIIl) {
        if (llIIIlllllllllI(lllllllllllllIIllllIIllIIlllllIl) && llIIIllllllllll(lllllllllllllIIllllIIllIIlllllIl, ContainerEnchantment.lIIIllllIllIll[2])) {
            this.enchantLevels[lllllllllllllIIllllIIllIIlllllIl] = lllllllllllllIIllllIIllIIllllIIl;
            "".length();
            if ((188 + 14 - 16 + 3 ^ 146 + 122 - 232 + 149) == 0x0) {
                return;
            }
        }
        else if (llIIlIIIIIIIIII(lllllllllllllIIllllIIllIIlllllIl, ContainerEnchantment.lIIIllllIllIll[3])) {
            this.xpSeed = lllllllllllllIIllllIIllIIllllIIl;
            "".length();
            if (((0x1A ^ 0x4B) & ~(0xD5 ^ 0x84)) < 0) {
                return;
            }
        }
        else if (llIIIllllllllIl(lllllllllllllIIllllIIllIIlllllIl, ContainerEnchantment.lIIIllllIllIll[14]) && llIIIllllllllll(lllllllllllllIIllllIIllIIlllllIl, ContainerEnchantment.lIIIllllIllIll[16])) {
            this.field_178151_h[lllllllllllllIIllllIIllIIlllllIl - ContainerEnchantment.lIIIllllIllIll[14]] = lllllllllllllIIllllIIllIIllllIIl;
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            super.updateProgressBar(lllllllllllllIIllllIIllIIlllllIl, lllllllllllllIIllllIIllIIllllIIl);
        }
    }
    
    private static boolean llIIlIIIIIIIllI(final int lllllllllllllIIllllIIlIlllllIIIl, final int lllllllllllllIIllllIIlIlllllIIII) {
        return lllllllllllllIIllllIIlIlllllIIIl < lllllllllllllIIllllIIlIlllllIIII;
    }
    
    private static boolean llIIlIIIIIIIIll(final int lllllllllllllIIllllIIlIlllIllIlI) {
        return lllllllllllllIIllllIIlIlllIllIlI != 0;
    }
    
    private List<EnchantmentData> func_178148_a(final ItemStack lllllllllllllIIllllIIllIIIlllIll, final int lllllllllllllIIllllIIllIIIllIlIl, final int lllllllllllllIIllllIIllIIIlllIIl) {
        this.rand.setSeed(this.xpSeed + lllllllllllllIIllllIIllIIIllIlIl);
        final List<EnchantmentData> lllllllllllllIIllllIIllIIIlllIII = EnchantmentHelper.buildEnchantmentList(this.rand, lllllllllllllIIllllIIllIIIlllIll, lllllllllllllIIllllIIllIIIlllIIl);
        if (llIIlIIIIIIIIIl(lllllllllllllIIllllIIllIIIlllIll.getItem(), Items.book) && llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIIlllIII) && llIIlIIIIIIIlIl(lllllllllllllIIllllIIllIIIlllIII.size(), ContainerEnchantment.lIIIllllIllIll[1])) {
            lllllllllllllIIllllIIllIIIlllIII.remove(this.rand.nextInt(lllllllllllllIIllllIIllIIIlllIII.size()));
            "".length();
        }
        return lllllllllllllIIllllIIllIIIlllIII;
    }
    
    private static boolean llIIlIIIIIIIIIl(final Object lllllllllllllIIllllIIlIllllIIIIl, final Object lllllllllllllIIllllIIlIllllIIIII) {
        return lllllllllllllIIllllIIlIllllIIIIl == lllllllllllllIIllllIIlIllllIIIII;
    }
    
    private static boolean llIIlIIIIIIIlII(final int lllllllllllllIIllllIIlIlllIllIII) {
        return lllllllllllllIIllllIIlIlllIllIII == 0;
    }
    
    private static boolean llIIlIIIIIIlIII(final int lllllllllllllIIllllIIlIlllIlIlII) {
        return lllllllllllllIIllllIIlIlllIlIlII <= 0;
    }
    
    private static boolean llIIlIIIIIIIlll(final int lllllllllllllIIllllIIlIlllIlIIlI) {
        return lllllllllllllIIllllIIlIlllIlIIlI > 0;
    }
    
    private static boolean llIIlIIIIIIIIlI(final Object lllllllllllllIIllllIIlIlllIllllI) {
        return lllllllllllllIIllllIIlIlllIllllI != null;
    }
    
    private static int llIIlIIIIIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void llIIIllllllllII() {
        (lIIIllllIllIll = new int[18])[0] = ((97 + 95 - 11 + 66 ^ 90 + 62 - 111 + 133) & (0x48 ^ 0x2E ^ (0x67 ^ 0x58) ^ -" ".length()));
        ContainerEnchantment.lIIIllllIllIll[1] = " ".length();
        ContainerEnchantment.lIIIllllIllIll[2] = "  ".length();
        ContainerEnchantment.lIIIllllIllIll[3] = "   ".length();
        ContainerEnchantment.lIIIllllIllIll[4] = -" ".length();
        ContainerEnchantment.lIIIllllIllIll[5] = (53 + 127 - 155 + 177 ^ 18 + 110 + 45 + 24);
        ContainerEnchantment.lIIIllllIllIll[6] = (0x4F ^ 0x34 ^ (0x60 ^ 0x34));
        ContainerEnchantment.lIIIllllIllIll[7] = (0x5E ^ 0xA ^ (0x4E ^ 0x39));
        ContainerEnchantment.lIIIllllIllIll[8] = (0x5 ^ 0x2 ^ (0x7 ^ 0x9));
        ContainerEnchantment.lIIIllllIllIll[9] = (0x6F ^ 0x67);
        ContainerEnchantment.lIIIllllIllIll[10] = (10 + 38 + 59 + 42 ^ 83 + 117 - 114 + 49);
        ContainerEnchantment.lIIIllllIllIll[11] = (0xEB ^ 0xBF);
        ContainerEnchantment.lIIIllllIllIll[12] = 70 + 134 - 89 + 27;
        ContainerEnchantment.lIIIllllIllIll[13] = -(0x44 ^ 0x6E ^ (0x88 ^ 0xB2));
        ContainerEnchantment.lIIIllllIllIll[14] = (0x32 ^ 0x36);
        ContainerEnchantment.lIIIllllIllIll[15] = (0x20 ^ 0x3A ^ (0x22 ^ 0x3D));
        ContainerEnchantment.lIIIllllIllIll[16] = (0x64 ^ 0x54 ^ (0xF ^ 0x39));
        ContainerEnchantment.lIIIllllIllIll[17] = (0x3 ^ 0x25);
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer lllllllllllllIIllllIIllIIIlIIlll) {
        super.onContainerClosed(lllllllllllllIIllllIIllIIIlIIlll);
        if (llIIlIIIIIIIlII(this.worldPointer.isRemote ? 1 : 0)) {
            int lllllllllllllIIllllIIllIIIlIIllI = ContainerEnchantment.lIIIllllIllIll[0];
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
            while (!llIIIllllllllIl(lllllllllllllIIllllIIllIIIlIIllI, this.tableInventory.getSizeInventory())) {
                final ItemStack lllllllllllllIIllllIIllIIIlIIlIl = this.tableInventory.removeStackFromSlot(lllllllllllllIIllllIIllIIIlIIllI);
                if (llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIIlIIlIl)) {
                    lllllllllllllIIllllIIllIIIlIIlll.dropPlayerItemWithRandomChoice(lllllllllllllIIllllIIllIIIlIIlIl, (boolean)(ContainerEnchantment.lIIIllllIllIll[0] != 0));
                    "".length();
                }
                ++lllllllllllllIIllllIIllIIIlIIllI;
            }
        }
    }
    
    public ContainerEnchantment(final InventoryPlayer lllllllllllllIIllllIIllIlIlIIlIl, final World lllllllllllllIIllllIIllIlIlIIlII) {
        this(lllllllllllllIIllllIIllIlIlIIlIl, lllllllllllllIIllllIIllIlIlIIlII, BlockPos.ORIGIN);
    }
    
    private static boolean llIIlIIIIIIIlIl(final int lllllllllllllIIllllIIlIllllIlIIl, final int lllllllllllllIIllllIIlIllllIlIII) {
        return lllllllllllllIIllllIIlIllllIlIIl > lllllllllllllIIllllIIlIllllIlIII;
    }
    
    private static boolean llIIlIIIIIIlIll(final Object lllllllllllllIIllllIIlIllllIIlIl, final Object lllllllllllllIIllllIIlIllllIIlII) {
        return lllllllllllllIIllllIIlIllllIIlIl != lllllllllllllIIllllIIlIllllIIlII;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIIllllIIllIIIIlllIl) {
        int n;
        if (llIIlIIIIIIlIll(this.worldPointer.getBlockState(this.position).getBlock(), Blocks.enchanting_table)) {
            n = ContainerEnchantment.lIIIllllIllIll[0];
            "".length();
            if ((0x98 ^ 0x9C) < 0) {
                return ((0xAD ^ 0xAB) & ~(0xB8 ^ 0xBE)) != 0x0;
            }
        }
        else if (llIIlIIIIIIlIII(llIIlIIIIIIlIlI(lllllllllllllIIllllIIllIIIIlllIl.getDistanceSq(this.position.getX() + 0.5, this.position.getY() + 0.5, this.position.getZ() + 0.5), 64.0))) {
            n = ContainerEnchantment.lIIIllllIllIll[1];
            "".length();
            if (null != null) {
                return ((0x0 ^ 0x43) & ~(0x16 ^ 0x55)) != 0x0;
            }
        }
        else {
            n = ContainerEnchantment.lIIIllllIllIll[0];
        }
        return n != 0;
    }
    
    @Override
    public void onCraftGuiOpened(final ICrafting lllllllllllllIIllllIIllIlIIIlIll) {
        super.onCraftGuiOpened(lllllllllllllIIllllIIllIlIIIlIll);
        lllllllllllllIIllllIIllIlIIIlIll.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[0], this.enchantLevels[ContainerEnchantment.lIIIllllIllIll[0]]);
        lllllllllllllIIllllIIllIlIIIlIll.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[1], this.enchantLevels[ContainerEnchantment.lIIIllllIllIll[1]]);
        lllllllllllllIIllllIIllIlIIIlIll.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[2], this.enchantLevels[ContainerEnchantment.lIIIllllIllIll[2]]);
        lllllllllllllIIllllIIllIlIIIlIll.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[3], this.xpSeed & ContainerEnchantment.lIIIllllIllIll[13]);
        lllllllllllllIIllllIIllIlIIIlIll.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[14], this.field_178151_h[ContainerEnchantment.lIIIllllIllIll[0]]);
        lllllllllllllIIllllIIllIlIIIlIll.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[15], this.field_178151_h[ContainerEnchantment.lIIIllllIllIll[1]]);
        lllllllllllllIIllllIIllIlIIIlIll.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[16], this.field_178151_h[ContainerEnchantment.lIIIllllIllIll[2]]);
    }
    
    @Override
    public void onCraftMatrixChanged(final IInventory lllllllllllllIIllllIIllIIlllIIII) {
        if (llIIlIIIIIIIIIl(lllllllllllllIIllllIIllIIlllIIII, this.tableInventory)) {
            final ItemStack lllllllllllllIIllllIIllIIllIllll = lllllllllllllIIllllIIllIIlllIIII.getStackInSlot(ContainerEnchantment.lIIIllllIllIll[0]);
            if (llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIllIllll) && llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIllIllll.isItemEnchantable() ? 1 : 0)) {
                if (llIIlIIIIIIIlII(this.worldPointer.isRemote ? 1 : 0)) {
                    int lllllllllllllIIllllIIllIIllIlllI = ContainerEnchantment.lIIIllllIllIll[0];
                    int lllllllllllllIIllllIIllIIllIllIl = ContainerEnchantment.lIIIllllIllIll[4];
                    "".length();
                    if (((0x5A ^ 0x75) & ~(0x13 ^ 0x3C)) >= "  ".length()) {
                        return;
                    }
                    while (!llIIlIIIIIIIlIl(lllllllllllllIIllllIIllIIllIllIl, ContainerEnchantment.lIIIllllIllIll[1])) {
                        int lllllllllllllIIllllIIllIIllIllII = ContainerEnchantment.lIIIllllIllIll[4];
                        "".length();
                        if (((0x9A ^ 0xC2) & ~(0x66 ^ 0x3E)) < 0) {
                            return;
                        }
                        while (!llIIlIIIIIIIlIl(lllllllllllllIIllllIIllIIllIllII, ContainerEnchantment.lIIIllllIllIll[1])) {
                            if ((!llIIlIIIIIIIlII(lllllllllllllIIllllIIllIIllIllIl) || llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIllIllII)) && llIIlIIIIIIIIll(this.worldPointer.isAirBlock(this.position.add(lllllllllllllIIllllIIllIIllIllII, ContainerEnchantment.lIIIllllIllIll[0], lllllllllllllIIllllIIllIIllIllIl)) ? 1 : 0) && llIIlIIIIIIIIll(this.worldPointer.isAirBlock(this.position.add(lllllllllllllIIllllIIllIIllIllII, ContainerEnchantment.lIIIllllIllIll[1], lllllllllllllIIllllIIllIIllIllIl)) ? 1 : 0)) {
                                if (llIIlIIIIIIIIIl(this.worldPointer.getBlockState(this.position.add(lllllllllllllIIllllIIllIIllIllII * ContainerEnchantment.lIIIllllIllIll[2], ContainerEnchantment.lIIIllllIllIll[0], lllllllllllllIIllllIIllIIllIllIl * ContainerEnchantment.lIIIllllIllIll[2])).getBlock(), Blocks.bookshelf)) {
                                    ++lllllllllllllIIllllIIllIIllIlllI;
                                }
                                if (llIIlIIIIIIIIIl(this.worldPointer.getBlockState(this.position.add(lllllllllllllIIllllIIllIIllIllII * ContainerEnchantment.lIIIllllIllIll[2], ContainerEnchantment.lIIIllllIllIll[1], lllllllllllllIIllllIIllIIllIllIl * ContainerEnchantment.lIIIllllIllIll[2])).getBlock(), Blocks.bookshelf)) {
                                    ++lllllllllllllIIllllIIllIIllIlllI;
                                }
                                if (llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIllIllII) && llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIllIllIl)) {
                                    if (llIIlIIIIIIIIIl(this.worldPointer.getBlockState(this.position.add(lllllllllllllIIllllIIllIIllIllII * ContainerEnchantment.lIIIllllIllIll[2], ContainerEnchantment.lIIIllllIllIll[0], lllllllllllllIIllllIIllIIllIllIl)).getBlock(), Blocks.bookshelf)) {
                                        ++lllllllllllllIIllllIIllIIllIlllI;
                                    }
                                    if (llIIlIIIIIIIIIl(this.worldPointer.getBlockState(this.position.add(lllllllllllllIIllllIIllIIllIllII * ContainerEnchantment.lIIIllllIllIll[2], ContainerEnchantment.lIIIllllIllIll[1], lllllllllllllIIllllIIllIIllIllIl)).getBlock(), Blocks.bookshelf)) {
                                        ++lllllllllllllIIllllIIllIIllIlllI;
                                    }
                                    if (llIIlIIIIIIIIIl(this.worldPointer.getBlockState(this.position.add(lllllllllllllIIllllIIllIIllIllII, ContainerEnchantment.lIIIllllIllIll[0], lllllllllllllIIllllIIllIIllIllIl * ContainerEnchantment.lIIIllllIllIll[2])).getBlock(), Blocks.bookshelf)) {
                                        ++lllllllllllllIIllllIIllIIllIlllI;
                                    }
                                    if (llIIlIIIIIIIIIl(this.worldPointer.getBlockState(this.position.add(lllllllllllllIIllllIIllIIllIllII, ContainerEnchantment.lIIIllllIllIll[1], lllllllllllllIIllllIIllIIllIllIl * ContainerEnchantment.lIIIllllIllIll[2])).getBlock(), Blocks.bookshelf)) {
                                        ++lllllllllllllIIllllIIllIIllIlllI;
                                    }
                                }
                            }
                            ++lllllllllllllIIllllIIllIIllIllII;
                        }
                        ++lllllllllllllIIllllIIllIIllIllIl;
                    }
                    this.rand.setSeed(this.xpSeed);
                    int lllllllllllllIIllllIIllIIllIlIll = ContainerEnchantment.lIIIllllIllIll[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llIIIllllllllIl(lllllllllllllIIllllIIllIIllIlIll, ContainerEnchantment.lIIIllllIllIll[3])) {
                        this.enchantLevels[lllllllllllllIIllllIIllIIllIlIll] = EnchantmentHelper.calcItemStackEnchantability(this.rand, lllllllllllllIIllllIIllIIllIlIll, lllllllllllllIIllllIIllIIllIlllI, lllllllllllllIIllllIIllIIllIllll);
                        this.field_178151_h[lllllllllllllIIllllIIllIIllIlIll] = ContainerEnchantment.lIIIllllIllIll[4];
                        if (llIIlIIIIIIIllI(this.enchantLevels[lllllllllllllIIllllIIllIIllIlIll], lllllllllllllIIllllIIllIIllIlIll + ContainerEnchantment.lIIIllllIllIll[1])) {
                            this.enchantLevels[lllllllllllllIIllllIIllIIllIlIll] = ContainerEnchantment.lIIIllllIllIll[0];
                        }
                        ++lllllllllllllIIllllIIllIIllIlIll;
                    }
                    int lllllllllllllIIllllIIllIIllIlIlI = ContainerEnchantment.lIIIllllIllIll[0];
                    "".length();
                    if (((122 + 130 - 139 + 133 ^ 111 + 70 - 152 + 168) & (101 + 30 - 86 + 197 ^ 116 + 78 - 141 + 140 ^ -" ".length())) != 0x0) {
                        return;
                    }
                    while (!llIIIllllllllIl(lllllllllllllIIllllIIllIIllIlIlI, ContainerEnchantment.lIIIllllIllIll[3])) {
                        if (llIIlIIIIIIIlll(this.enchantLevels[lllllllllllllIIllllIIllIIllIlIlI])) {
                            final List<EnchantmentData> lllllllllllllIIllllIIllIIllIlIIl = this.func_178148_a(lllllllllllllIIllllIIllIIllIllll, lllllllllllllIIllllIIllIIllIlIlI, this.enchantLevels[lllllllllllllIIllllIIllIIllIlIlI]);
                            if (llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIllIlIIl) && llIIlIIIIIIIlII(lllllllllllllIIllllIIllIIllIlIIl.isEmpty() ? 1 : 0)) {
                                final EnchantmentData lllllllllllllIIllllIIllIIllIlIII = lllllllllllllIIllllIIllIIllIlIIl.get(this.rand.nextInt(lllllllllllllIIllllIIllIIllIlIIl.size()));
                                this.field_178151_h[lllllllllllllIIllllIIllIIllIlIlI] = (lllllllllllllIIllllIIllIIllIlIII.enchantmentobj.effectId | lllllllllllllIIllllIIllIIllIlIII.enchantmentLevel << ContainerEnchantment.lIIIllllIllIll[9]);
                            }
                        }
                        ++lllllllllllllIIllllIIllIIllIlIlI;
                    }
                    this.detectAndSendChanges();
                    "".length();
                    if (((0xA9 ^ 0xB1) & ~(0x34 ^ 0x2C)) != 0x0) {
                        return;
                    }
                }
            }
            else {
                int lllllllllllllIIllllIIllIIllIIlll = ContainerEnchantment.lIIIllllIllIll[0];
                "".length();
                if (-(0x5E ^ 0x5A) >= 0) {
                    return;
                }
                while (!llIIIllllllllIl(lllllllllllllIIllllIIllIIllIIlll, ContainerEnchantment.lIIIllllIllIll[3])) {
                    this.enchantLevels[lllllllllllllIIllllIIllIIllIIlll] = ContainerEnchantment.lIIIllllIllIll[0];
                    this.field_178151_h[lllllllllllllIIllllIIllIIllIIlll] = ContainerEnchantment.lIIIllllIllIll[4];
                    ++lllllllllllllIIllllIIllIIllIIlll;
                }
            }
        }
    }
    
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        int lllllllllllllIIllllIIllIlIIIIllI = ContainerEnchantment.lIIIllllIllIll[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!llIIIllllllllIl(lllllllllllllIIllllIIllIlIIIIllI, this.crafters.size())) {
            final ICrafting lllllllllllllIIllllIIllIlIIIIlIl = this.crafters.get(lllllllllllllIIllllIIllIlIIIIllI);
            lllllllllllllIIllllIIllIlIIIIlIl.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[0], this.enchantLevels[ContainerEnchantment.lIIIllllIllIll[0]]);
            lllllllllllllIIllllIIllIlIIIIlIl.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[1], this.enchantLevels[ContainerEnchantment.lIIIllllIllIll[1]]);
            lllllllllllllIIllllIIllIlIIIIlIl.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[2], this.enchantLevels[ContainerEnchantment.lIIIllllIllIll[2]]);
            lllllllllllllIIllllIIllIlIIIIlIl.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[3], this.xpSeed & ContainerEnchantment.lIIIllllIllIll[13]);
            lllllllllllllIIllllIIllIlIIIIlIl.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[14], this.field_178151_h[ContainerEnchantment.lIIIllllIllIll[0]]);
            lllllllllllllIIllllIIllIlIIIIlIl.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[15], this.field_178151_h[ContainerEnchantment.lIIIllllIllIll[1]]);
            lllllllllllllIIllllIIllIlIIIIlIl.sendProgressBarUpdate(this, ContainerEnchantment.lIIIllllIllIll[16], this.field_178151_h[ContainerEnchantment.lIIIllllIllIll[2]]);
            ++lllllllllllllIIllllIIllIlIIIIllI;
        }
    }
    
    private static boolean llIIIllllllllll(final int lllllllllllllIIllllIIlIllllIllIl, final int lllllllllllllIIllllIIlIllllIllII) {
        return lllllllllllllIIllllIIlIllllIllIl <= lllllllllllllIIllllIIlIllllIllII;
    }
    
    public int getLapisAmount() {
        final ItemStack lllllllllllllIIllllIIllIIIlIllll = this.tableInventory.getStackInSlot(ContainerEnchantment.lIIIllllIllIll[1]);
        int stackSize;
        if (llIIlIIIIIIlIIl(lllllllllllllIIllllIIllIIIlIllll)) {
            stackSize = ContainerEnchantment.lIIIllllIllIll[0];
            "".length();
            if ("   ".length() < -" ".length()) {
                return "  ".length() & ("  ".length() ^ -" ".length());
            }
        }
        else {
            stackSize = lllllllllllllIIllllIIllIIIlIllll.stackSize;
        }
        return stackSize;
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIIllllIIllIIIIlIIll, final int lllllllllllllIIllllIIllIIIIIllII) {
        ItemStack lllllllllllllIIllllIIllIIIIlIIIl = null;
        final Slot lllllllllllllIIllllIIllIIIIlIIII = this.inventorySlots.get(lllllllllllllIIllllIIllIIIIIllII);
        if (llIIlIIIIIIIIlI(lllllllllllllIIllllIIllIIIIlIIII) && llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIIIlIIII.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIIllllIIllIIIIIllll = lllllllllllllIIllllIIllIIIIlIIII.getStack();
            lllllllllllllIIllllIIllIIIIlIIIl = lllllllllllllIIllllIIllIIIIIllll.copy();
            if (llIIlIIIIIIIlII(lllllllllllllIIllllIIllIIIIIllII)) {
                if (llIIlIIIIIIIlII(this.mergeItemStack(lllllllllllllIIllllIIllIIIIIllll, ContainerEnchantment.lIIIllllIllIll[2], ContainerEnchantment.lIIIllllIllIll[17], (boolean)(ContainerEnchantment.lIIIllllIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIIlIIIIIIIIII(lllllllllllllIIllllIIllIIIIIllII, ContainerEnchantment.lIIIllllIllIll[1])) {
                if (llIIlIIIIIIIlII(this.mergeItemStack(lllllllllllllIIllllIIllIIIIIllll, ContainerEnchantment.lIIIllllIllIll[2], ContainerEnchantment.lIIIllllIllIll[17], (boolean)(ContainerEnchantment.lIIIllllIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIIlIIIIIIIIIl(lllllllllllllIIllllIIllIIIIIllll.getItem(), Items.dye) && llIIlIIIIIIIIIl(EnumDyeColor.byDyeDamage(lllllllllllllIIllllIIllIIIIIllll.getMetadata()), EnumDyeColor.BLUE)) {
                if (llIIlIIIIIIIlII(this.mergeItemStack(lllllllllllllIIllllIIllIIIIIllll, ContainerEnchantment.lIIIllllIllIll[1], ContainerEnchantment.lIIIllllIllIll[2], (boolean)(ContainerEnchantment.lIIIllllIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else {
                if (!llIIlIIIIIIIlII(this.inventorySlots.get(ContainerEnchantment.lIIIllllIllIll[0]).getHasStack() ? 1 : 0) || llIIlIIIIIIIlII(this.inventorySlots.get(ContainerEnchantment.lIIIllllIllIll[0]).isItemValid(lllllllllllllIIllllIIllIIIIIllll) ? 1 : 0)) {
                    return null;
                }
                if (llIIlIIIIIIIIll(lllllllllllllIIllllIIllIIIIIllll.hasTagCompound() ? 1 : 0) && llIIlIIIIIIIIII(lllllllllllllIIllllIIllIIIIIllll.stackSize, ContainerEnchantment.lIIIllllIllIll[1])) {
                    this.inventorySlots.get(ContainerEnchantment.lIIIllllIllIll[0]).putStack(lllllllllllllIIllllIIllIIIIIllll.copy());
                    lllllllllllllIIllllIIllIIIIIllll.stackSize = ContainerEnchantment.lIIIllllIllIll[0];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else if (llIIIllllllllIl(lllllllllllllIIllllIIllIIIIIllll.stackSize, ContainerEnchantment.lIIIllllIllIll[1])) {
                    this.inventorySlots.get(ContainerEnchantment.lIIIllllIllIll[0]).putStack(new ItemStack(lllllllllllllIIllllIIllIIIIIllll.getItem(), ContainerEnchantment.lIIIllllIllIll[1], lllllllllllllIIllllIIllIIIIIllll.getMetadata()));
                    final ItemStack itemStack = lllllllllllllIIllllIIllIIIIIllll;
                    itemStack.stackSize -= ContainerEnchantment.lIIIllllIllIll[1];
                }
            }
            if (llIIlIIIIIIIlII(lllllllllllllIIllllIIllIIIIIllll.stackSize)) {
                lllllllllllllIIllllIIllIIIIlIIII.putStack(null);
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllllIIllIIIIlIIII.onSlotChanged();
            }
            if (llIIlIIIIIIIIII(lllllllllllllIIllllIIllIIIIIllll.stackSize, lllllllllllllIIllllIIllIIIIlIIIl.stackSize)) {
                return null;
            }
            lllllllllllllIIllllIIllIIIIlIIII.onPickupFromSlot(lllllllllllllIIllllIIllIIIIlIIll, lllllllllllllIIllllIIllIIIIIllll);
        }
        return lllllllllllllIIllllIIllIIIIlIIIl;
    }
    
    private static void llIIIlllIIlIIIl() {
        (lIIIlllIllIlIl = new String[ContainerEnchantment.lIIIllllIllIll[1]])[ContainerEnchantment.lIIIllllIllIll[0]] = llIIIlllIIIlllI("up0QwbSQCZ4=", "HkiqU");
    }
    
    static {
        llIIIllllllllII();
        llIIIlllIIlIIIl();
    }
    
    private static boolean llIIlIIIIIIIIII(final int lllllllllllllIIllllIIlIllllllIIl, final int lllllllllllllIIllllIIlIllllllIII) {
        return lllllllllllllIIllllIIlIllllllIIl == lllllllllllllIIllllIIlIllllllIII;
    }
    
    private static boolean llIIIlllllllllI(final int lllllllllllllIIllllIIlIlllIlIllI) {
        return lllllllllllllIIllllIIlIlllIlIllI >= 0;
    }
    
    private static String llIIIlllIIIlllI(final String lllllllllllllIIllllIIlIlllllllll, final String lllllllllllllIIllllIIlIllllllllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIllIIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlIllllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIllIIIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIllIIIIIIIll.init(ContainerEnchantment.lIIIllllIllIll[2], lllllllllllllIIllllIIllIIIIIIlII);
            return new String(lllllllllllllIIllllIIllIIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIllIIIIIIIlI) {
            lllllllllllllIIllllIIllIIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIIIIIIlIIl(final Object lllllllllllllIIllllIIlIlllIlllII) {
        return lllllllllllllIIllllIIlIlllIlllII == null;
    }
}
