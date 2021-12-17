// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import java.util.Iterator;
import java.util.Map;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.enchantment.EnchantmentHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockAnvil;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.apache.logging.log4j.Logger;

public class ContainerRepair extends Container
{
    private /* synthetic */ IInventory outputSlot;
    private static final /* synthetic */ String[] llIllIlllIIlIl;
    public /* synthetic */ int maximumCost;
    private /* synthetic */ String repairedItemName;
    private /* synthetic */ IInventory inputSlots;
    private /* synthetic */ World theWorld;
    private final /* synthetic */ EntityPlayer thePlayer;
    private /* synthetic */ int materialCost;
    private static final /* synthetic */ int[] llIllIlllIlIIl;
    private /* synthetic */ BlockPos selfPosition;
    
    @Override
    public void updateProgressBar(final int llllllllllllIllIIllIIIIIllIllIIl, final int llllllllllllIllIIllIIIIIllIllIll) {
        if (lIIllIIIIlllllll(llllllllllllIllIIllIIIIIllIllIIl)) {
            this.maximumCost = llllllllllllIllIIllIIIIIllIllIll;
        }
    }
    
    private static boolean lIIllIIIIlllllll(final int llllllllllllIllIIllIIIIIIllllIlI) {
        return llllllllllllIllIIllIIIIIIllllIlI == 0;
    }
    
    private static boolean lIIllIIIlIIIIIIl(final int llllllllllllIllIIllIIIIIlIIIllll, final int llllllllllllIllIIllIIIIIlIIIlllI) {
        return llllllllllllIllIIllIIIIIlIIIllll < llllllllllllIllIIllIIIIIlIIIlllI;
    }
    
    public ContainerRepair(final InventoryPlayer llllllllllllIllIIllIIIIllIIIIIll, final World llllllllllllIllIIllIIIIllIIIIIlI, final BlockPos llllllllllllIllIIllIIIIllIIIllII, final EntityPlayer llllllllllllIllIIllIIIIlIllllllI) {
        this.outputSlot = new InventoryCraftResult();
        this.inputSlots = new InventoryBasic(ContainerRepair.llIllIlllIIlIl[ContainerRepair.llIllIlllIlIIl[0]], ContainerRepair.llIllIlllIlIIl[1], ContainerRepair.llIllIlllIlIIl[2]) {
            @Override
            public void markDirty() {
                super.markDirty();
                ContainerRepair.this.onCraftMatrixChanged(this);
            }
        };
        this.selfPosition = llllllllllllIllIIllIIIIllIIIllII;
        this.theWorld = llllllllllllIllIIllIIIIllIIIIIlI;
        this.thePlayer = llllllllllllIllIIllIIIIlIllllllI;
        this.addSlotToContainer(new Slot(this.inputSlots, ContainerRepair.llIllIlllIlIIl[0], ContainerRepair.llIllIlllIlIIl[3], ContainerRepair.llIllIlllIlIIl[4]));
        "".length();
        this.addSlotToContainer(new Slot(this.inputSlots, ContainerRepair.llIllIlllIlIIl[1], ContainerRepair.llIllIlllIlIIl[5], ContainerRepair.llIllIlllIlIIl[4]));
        "".length();
        this.addSlotToContainer(new Slot(this.outputSlot, ContainerRepair.llIllIlllIlIIl[2], ContainerRepair.llIllIlllIlIIl[6], ContainerRepair.llIllIlllIlIIl[4]) {
            private static final /* synthetic */ int[] lIlIlllIllllII;
            
            private static boolean llllIlIIIIlIllI(final int lllllllllllllIIIIlIlIllIIIlIIIII) {
                return lllllllllllllIIIIlIlIllIIIlIIIII != 0;
            }
            
            private static boolean llllIlIIIIlIlIl(final int lllllllllllllIIIIlIlIllIIIIllIlI) {
                return lllllllllllllIIIIlIlIllIIIIllIlI > 0;
            }
            
            private static boolean llllIlIIIIllIIl(final int lllllllllllllIIIIlIlIllIIIlIlIIl, final int lllllllllllllIIIIlIlIllIIIlIlIII) {
                return lllllllllllllIIIIlIlIllIIIlIlIIl > lllllllllllllIIIIlIlIllIIIlIlIII;
            }
            
            private static boolean llllIlIIIIllIll(final int lllllllllllllIIIIlIlIllIIIIlllII) {
                return lllllllllllllIIIIlIlIllIIIIlllII < 0;
            }
            
            @Override
            public boolean canTakeStack(final EntityPlayer lllllllllllllIIIIlIlIllIIlIIIIII) {
                if ((!llllIlIIIIlIIll(lllllllllllllIIIIlIlIllIIlIIIIII.capabilities.isCreativeMode ? 1 : 0) || llllIlIIIIlIlII(lllllllllllllIIIIlIlIllIIlIIIIII.experienceLevel, ContainerRepair.this.maximumCost)) && llllIlIIIIlIlIl(ContainerRepair.this.maximumCost) && llllIlIIIIlIllI(this.getHasStack() ? 1 : 0)) {
                    return ContainerRepair$2.lIlIlllIllllII[1] != 0;
                }
                return ContainerRepair$2.lIlIlllIllllII[0] != 0;
            }
            
            private static boolean llllIlIIIIlIIll(final int lllllllllllllIIIIlIlIllIIIIllllI) {
                return lllllllllllllIIIIlIlIllIIIIllllI == 0;
            }
            
            private static boolean llllIlIIIIlIlII(final int lllllllllllllIIIIlIlIllIIIlIllIl, final int lllllllllllllIIIIlIlIllIIIlIllII) {
                return lllllllllllllIIIIlIlIllIIIlIllIl >= lllllllllllllIIIIlIlIllIIIlIllII;
            }
            
            static {
                llllIlIIIIlIIlI();
            }
            
            private static boolean llllIlIIIIllIlI(final Object lllllllllllllIIIIlIlIllIIIlIIIll, final Object lllllllllllllIIIIlIlIllIIIlIIIlI) {
                return lllllllllllllIIIIlIlIllIIIlIIIll == lllllllllllllIIIIlIlIllIIIlIIIlI;
            }
            
            private static void llllIlIIIIlIIlI() {
                (lIlIlllIllllII = new int[5])[0] = ((0x32 ^ 0x19 ^ (0x80 ^ 0x9F)) & (0xD5 ^ 0xB1 ^ (0x7F ^ 0x2F) ^ -" ".length()));
                ContainerRepair$2.lIlIlllIllllII[1] = " ".length();
                ContainerRepair$2.lIlIlllIllllII[2] = "  ".length();
                ContainerRepair$2.lIlIlllIllllII[3] = (-(0xFFFFA7A5 & 0x7C5B) & (0xFFFFFFFD & 0x27FE));
                ContainerRepair$2.lIlIlllIllllII[4] = (0xFFFFEFFF & 0x13FD);
            }
            
            @Override
            public void onPickupFromSlot(final EntityPlayer lllllllllllllIIIIlIlIllIIIllIIlI, final ItemStack lllllllllllllIIIIlIlIllIIIllIlll) {
                if (llllIlIIIIlIIll(lllllllllllllIIIIlIlIllIIIllIIlI.capabilities.isCreativeMode ? 1 : 0)) {
                    lllllllllllllIIIIlIlIllIIIllIIlI.addExperienceLevel(-ContainerRepair.this.maximumCost);
                }
                ContainerRepair.this.inputSlots.setInventorySlotContents(ContainerRepair$2.lIlIlllIllllII[0], null);
                if (llllIlIIIIlIlIl(ContainerRepair.this.materialCost)) {
                    final ItemStack lllllllllllllIIIIlIlIllIIIllIllI = ContainerRepair.this.inputSlots.getStackInSlot(ContainerRepair$2.lIlIlllIllllII[1]);
                    if (llllIlIIIIllIII(lllllllllllllIIIIlIlIllIIIllIllI) && llllIlIIIIllIIl(lllllllllllllIIIIlIlIllIIIllIllI.stackSize, ContainerRepair.this.materialCost)) {
                        final ItemStack itemStack = lllllllllllllIIIIlIlIllIIIllIllI;
                        itemStack.stackSize -= ContainerRepair.this.materialCost;
                        ContainerRepair.this.inputSlots.setInventorySlotContents(ContainerRepair$2.lIlIlllIllllII[1], lllllllllllllIIIIlIlIllIIIllIllI);
                        "".length();
                        if (((0x66 ^ 0x79) & ~(0xB4 ^ 0xAB)) < 0) {
                            return;
                        }
                    }
                    else {
                        ContainerRepair.this.inputSlots.setInventorySlotContents(ContainerRepair$2.lIlIlllIllllII[1], null);
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                    }
                }
                else {
                    ContainerRepair.this.inputSlots.setInventorySlotContents(ContainerRepair$2.lIlIlllIllllII[1], null);
                }
                ContainerRepair.this.maximumCost = ContainerRepair$2.lIlIlllIllllII[0];
                final IBlockState lllllllllllllIIIIlIlIllIIIllIlIl = llllllllllllIllIIllIIIIllIIIIIlI.getBlockState(llllllllllllIllIIllIIIIllIIIllII);
                if (llllIlIIIIlIIll(lllllllllllllIIIIlIlIllIIIllIIlI.capabilities.isCreativeMode ? 1 : 0) && llllIlIIIIlIIll(llllllllllllIllIIllIIIIllIIIIIlI.isRemote ? 1 : 0) && llllIlIIIIllIlI(lllllllllllllIIIIlIlIllIIIllIlIl.getBlock(), Blocks.anvil) && llllIlIIIIllIll(llllIlIIIIlIlll(lllllllllllllIIIIlIlIllIIIllIIlI.getRNG().nextFloat(), 0.12f))) {
                    int lllllllllllllIIIIlIlIllIIIllIlII = lllllllllllllIIIIlIlIllIIIllIlIl.getValue((IProperty<Integer>)BlockAnvil.DAMAGE);
                    if (llllIlIIIIllIIl(++lllllllllllllIIIIlIlIllIIIllIlII, ContainerRepair$2.lIlIlllIllllII[2])) {
                        llllllllllllIllIIllIIIIllIIIIIlI.setBlockToAir(llllllllllllIllIIllIIIIllIIIllII);
                        "".length();
                        llllllllllllIllIIllIIIIllIIIIIlI.playAuxSFX(ContainerRepair$2.lIlIlllIllllII[3], llllllllllllIllIIllIIIIllIIIllII, ContainerRepair$2.lIlIlllIllllII[0]);
                        "".length();
                        if ("   ".length() >= (0x8A ^ 0x8E)) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIIllIIIIllIIIIIlI.setBlockState(llllllllllllIllIIllIIIIllIIIllII, lllllllllllllIIIIlIlIllIIIllIlIl.withProperty((IProperty<Comparable>)BlockAnvil.DAMAGE, lllllllllllllIIIIlIlIllIIIllIlII), ContainerRepair$2.lIlIlllIllllII[2]);
                        "".length();
                        llllllllllllIllIIllIIIIllIIIIIlI.playAuxSFX(ContainerRepair$2.lIlIlllIllllII[4], llllllllllllIllIIllIIIIllIIIllII, ContainerRepair$2.lIlIlllIllllII[0]);
                        "".length();
                        if ((0x2 ^ 0x74 ^ (0x4D ^ 0x3F)) != (13 + 104 - 100 + 173 ^ 70 + 42 + 20 + 54)) {
                            return;
                        }
                    }
                }
                else if (llllIlIIIIlIIll(llllllllllllIllIIllIIIIllIIIIIlI.isRemote ? 1 : 0)) {
                    llllllllllllIllIIllIIIIllIIIIIlI.playAuxSFX(ContainerRepair$2.lIlIlllIllllII[4], llllllllllllIllIIllIIIIllIIIllII, ContainerRepair$2.lIlIlllIllllII[0]);
                }
            }
            
            private static boolean llllIlIIIIllIII(final Object lllllllllllllIIIIlIlIllIIIlIIllI) {
                return lllllllllllllIIIIlIlIllIIIlIIllI != null;
            }
            
            @Override
            public boolean isItemValid(final ItemStack lllllllllllllIIIIlIlIllIIlIIIlII) {
                return ContainerRepair$2.lIlIlllIllllII[0] != 0;
            }
            
            private static int llllIlIIIIlIlll(final float n, final float n2) {
                return fcmpg(n, n2);
            }
        });
        "".length();
        int llllllllllllIllIIllIIIIllIIIlIIl = ContainerRepair.llIllIlllIlIIl[0];
        "".length();
        if (((79 + 19 - 11 + 102 ^ 120 + 84 - 167 + 108) & (0xAF ^ 0xAA ^ (0x77 ^ 0x5E) ^ -" ".length())) == "  ".length()) {
            throw null;
        }
        while (!lIIllIIIIllllIII(llllllllllllIllIIllIIIIllIIIlIIl, ContainerRepair.llIllIlllIlIIl[11])) {
            int llllllllllllIllIIllIIIIllIIIlIII = ContainerRepair.llIllIlllIlIIl[0];
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
            while (!lIIllIIIIllllIII(llllllllllllIllIIllIIIIllIIIlIII, ContainerRepair.llIllIlllIlIIl[7])) {
                this.addSlotToContainer(new Slot(llllllllllllIllIIllIIIIllIIIIIll, llllllllllllIllIIllIIIIllIIIlIII + llllllllllllIllIIllIIIIllIIIlIIl * ContainerRepair.llIllIlllIlIIl[7] + ContainerRepair.llIllIlllIlIIl[7], ContainerRepair.llIllIlllIlIIl[8] + llllllllllllIllIIllIIIIllIIIlIII * ContainerRepair.llIllIlllIlIIl[9], ContainerRepair.llIllIlllIlIIl[10] + llllllllllllIllIIllIIIIllIIIlIIl * ContainerRepair.llIllIlllIlIIl[9]));
                "".length();
                ++llllllllllllIllIIllIIIIllIIIlIII;
            }
            ++llllllllllllIllIIllIIIIllIIIlIIl;
        }
        int llllllllllllIllIIllIIIIllIIIIllI = ContainerRepair.llIllIlllIlIIl[0];
        "".length();
        if (((0x1B ^ 0x1F) & ~(0x2D ^ 0x29)) > 0) {
            throw null;
        }
        while (!lIIllIIIIllllIII(llllllllllllIllIIllIIIIllIIIIllI, ContainerRepair.llIllIlllIlIIl[7])) {
            this.addSlotToContainer(new Slot(llllllllllllIllIIllIIIIllIIIIIll, llllllllllllIllIIllIIIIllIIIIllI, ContainerRepair.llIllIlllIlIIl[8] + llllllllllllIllIIllIIIIllIIIIllI * ContainerRepair.llIllIlllIlIIl[9], ContainerRepair.llIllIlllIlIIl[12]));
            "".length();
            ++llllllllllllIllIIllIIIIllIIIIllI;
        }
    }
    
    private static boolean lIIllIIIlIIIIlII(final int llllllllllllIllIIllIIIIIlIIIlIll, final int llllllllllllIllIIllIIIIIlIIIlIlI) {
        return llllllllllllIllIIllIIIIIlIIIlIll > llllllllllllIllIIllIIIIIlIIIlIlI;
    }
    
    private static boolean lIIllIIIIllllIII(final int llllllllllllIllIIllIIIIIlIIlIIll, final int llllllllllllIllIIllIIIIIlIIlIIlI) {
        return llllllllllllIllIIllIIIIIlIIlIIll >= llllllllllllIllIIllIIIIIlIIlIIlI;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer llllllllllllIllIIllIIIIIllIIIllI) {
        int n;
        if (lIIllIIIlIIIIllI(this.theWorld.getBlockState(this.selfPosition).getBlock(), Blocks.anvil)) {
            n = ContainerRepair.llIllIlllIlIIl[0];
            "".length();
            if (null != null) {
                return ((116 + 71 - 157 + 133 ^ 95 + 9 - 38 + 85) & (142 + 135 - 272 + 157 ^ 139 + 65 - 138 + 84 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIllIIIIllllllI(lIIllIIIlIIIIlIl(llllllllllllIllIIllIIIIIllIIIllI.getDistanceSq(this.selfPosition.getX() + 0.5, this.selfPosition.getY() + 0.5, this.selfPosition.getZ() + 0.5), 64.0))) {
            n = ContainerRepair.llIllIlllIlIIl[1];
            "".length();
            if (((0x1B ^ 0x1E) & ~(0x35 ^ 0x30)) != 0x0) {
                return ((0x64 ^ 0x7E) & ~(0x75 ^ 0x6F)) != 0x0;
            }
        }
        else {
            n = ContainerRepair.llIllIlllIlIIl[0];
        }
        return n != 0;
    }
    
    private static void lIIllIIIIllIllll() {
        (llIllIlllIIlIl = new String[ContainerRepair.llIllIlllIlIIl[1]])[ContainerRepair.llIllIlllIlIIl[0]] = lIIllIIIIllIlllI("6lZb/yFwK1g=", "mhhvo");
    }
    
    private static boolean lIIllIIIlIIIIIll(final int llllllllllllIllIIllIIIIIIlllIIIl, final int llllllllllllIllIIllIIIIIIlllIIII) {
        return llllllllllllIllIIllIIIIIIlllIIIl != llllllllllllIllIIllIIIIIIlllIIII;
    }
    
    static {
        lIIllIIIIlllIlll();
        lIIllIIIIllIllll();
        logger = LogManager.getLogger();
    }
    
    public void updateItemName(final String llllllllllllIllIIllIIIIIlIlIllll) {
        this.repairedItemName = llllllllllllIllIIllIIIIIlIlIllll;
        if (lIIllIIIIlllllIl(this.getSlot(ContainerRepair.llIllIlllIlIIl[2]).getHasStack() ? 1 : 0)) {
            final ItemStack llllllllllllIllIIllIIIIIlIlIlllI = this.getSlot(ContainerRepair.llIllIlllIlIIl[2]).getStack();
            if (lIIllIIIIlllllIl(StringUtils.isBlank((CharSequence)llllllllllllIllIIllIIIIIlIlIllll) ? 1 : 0)) {
                llllllllllllIllIIllIIIIIlIlIlllI.clearCustomName();
                "".length();
                if ((2 + 54 + 92 + 10 ^ 85 + 98 - 150 + 122) == 0x0) {
                    return;
                }
            }
            else {
                llllllllllllIllIIllIIIIIlIlIlllI.setStackDisplayName(this.repairedItemName);
                "".length();
            }
        }
        this.updateRepairOutput();
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer llllllllllllIllIIllIIIIIlIlllllI, final int llllllllllllIllIIllIIIIIlIllllIl) {
        ItemStack llllllllllllIllIIllIIIIIlIllllII = null;
        final Slot llllllllllllIllIIllIIIIIlIlllIll = this.inventorySlots.get(llllllllllllIllIIllIIIIIlIllllIl);
        if (lIIllIIIIllllIll(llllllllllllIllIIllIIIIIlIlllIll) && lIIllIIIIlllllIl(llllllllllllIllIIllIIIIIlIlllIll.getHasStack() ? 1 : 0)) {
            final ItemStack llllllllllllIllIIllIIIIIlIlllIlI = llllllllllllIllIIllIIIIIlIlllIll.getStack();
            llllllllllllIllIIllIIIIIlIllllII = llllllllllllIllIIllIIIIIlIlllIlI.copy();
            if (lIIllIIIlIIIIIlI(llllllllllllIllIIllIIIIIlIllllIl, ContainerRepair.llIllIlllIlIIl[2])) {
                if (lIIllIIIIlllllll(this.mergeItemStack(llllllllllllIllIIllIIIIIlIlllIlI, ContainerRepair.llIllIlllIlIIl[11], ContainerRepair.llIllIlllIlIIl[17], (boolean)(ContainerRepair.llIllIlllIlIIl[1] != 0)) ? 1 : 0)) {
                    return null;
                }
                llllllllllllIllIIllIIIIIlIlllIll.onSlotChange(llllllllllllIllIIllIIIIIlIlllIlI, llllllllllllIllIIllIIIIIlIllllII);
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            else if (lIIllIIIIlllllIl(llllllllllllIllIIllIIIIIlIllllIl) && lIIllIIIlIIIIIll(llllllllllllIllIIllIIIIIlIllllIl, ContainerRepair.llIllIlllIlIIl[1])) {
                if (lIIllIIIIllllIII(llllllllllllIllIIllIIIIIlIllllIl, ContainerRepair.llIllIlllIlIIl[11]) && lIIllIIIlIIIIIIl(llllllllllllIllIIllIIIIIlIllllIl, ContainerRepair.llIllIlllIlIIl[17]) && lIIllIIIIlllllll(this.mergeItemStack(llllllllllllIllIIllIIIIIlIlllIlI, ContainerRepair.llIllIlllIlIIl[0], ContainerRepair.llIllIlllIlIIl[2], (boolean)(ContainerRepair.llIllIlllIlIIl[0] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (lIIllIIIIlllllll(this.mergeItemStack(llllllllllllIllIIllIIIIIlIlllIlI, ContainerRepair.llIllIlllIlIIl[11], ContainerRepair.llIllIlllIlIIl[17], (boolean)(ContainerRepair.llIllIlllIlIIl[0] != 0)) ? 1 : 0)) {
                return null;
            }
            if (lIIllIIIIlllllll(llllllllllllIllIIllIIIIIlIlllIlI.stackSize)) {
                llllllllllllIllIIllIIIIIlIlllIll.putStack(null);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIllIIllIIIIIlIlllIll.onSlotChanged();
            }
            if (lIIllIIIlIIIIIlI(llllllllllllIllIIllIIIIIlIlllIlI.stackSize, llllllllllllIllIIllIIIIIlIllllII.stackSize)) {
                return null;
            }
            llllllllllllIllIIllIIIIIlIlllIll.onPickupFromSlot(llllllllllllIllIIllIIIIIlIlllllI, llllllllllllIllIIllIIIIIlIlllIlI);
        }
        return llllllllllllIllIIllIIIIIlIllllII;
    }
    
    private static int lIIllIIIlIIIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void onCraftGuiOpened(final ICrafting llllllllllllIllIIllIIIIIlllIIIIl) {
        super.onCraftGuiOpened(llllllllllllIllIIllIIIIIlllIIIIl);
        llllllllllllIllIIllIIIIIlllIIIIl.sendProgressBarUpdate(this, ContainerRepair.llIllIlllIlIIl[0], this.maximumCost);
    }
    
    private static boolean lIIllIIIIllllllI(final int llllllllllllIllIIllIIIIIIlllIllI) {
        return llllllllllllIllIIllIIIIIIlllIllI <= 0;
    }
    
    private static boolean lIIllIIIIllllIIl(final Object llllllllllllIllIIllIIIIIlIIIIIll, final Object llllllllllllIllIIllIIIIIlIIIIIlI) {
        return llllllllllllIllIIllIIIIIlIIIIIll == llllllllllllIllIIllIIIIIlIIIIIlI;
    }
    
    private static boolean lIIllIIIIlllllIl(final int llllllllllllIllIIllIIIIIIlllllII) {
        return llllllllllllIllIIllIIIIIIlllllII != 0;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer llllllllllllIllIIllIIIIIllIIlllI) {
        super.onContainerClosed(llllllllllllIllIIllIIIIIllIIlllI);
        if (lIIllIIIIlllllll(this.theWorld.isRemote ? 1 : 0)) {
            int llllllllllllIllIIllIIIIIllIlIIIl = ContainerRepair.llIllIlllIlIIl[0];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
            while (!lIIllIIIIllllIII(llllllllllllIllIIllIIIIIllIlIIIl, this.inputSlots.getSizeInventory())) {
                final ItemStack llllllllllllIllIIllIIIIIllIlIIII = this.inputSlots.removeStackFromSlot(llllllllllllIllIIllIIIIIllIlIIIl);
                if (lIIllIIIIllllIll(llllllllllllIllIIllIIIIIllIlIIII)) {
                    llllllllllllIllIIllIIIIIllIIlllI.dropPlayerItemWithRandomChoice(llllllllllllIllIIllIIIIIllIlIIII, (boolean)(ContainerRepair.llIllIlllIlIIl[0] != 0));
                    "".length();
                }
                ++llllllllllllIllIIllIIIIIllIlIIIl;
            }
        }
    }
    
    private static boolean lIIllIIIIllllIll(final Object llllllllllllIllIIllIIIIIlIIIIIII) {
        return llllllllllllIllIIllIIIIIlIIIIIII != null;
    }
    
    private static boolean lIIllIIIIllllIlI(final Object llllllllllllIllIIllIIIIIIllllllI) {
        return llllllllllllIllIIllIIIIIIllllllI == null;
    }
    
    @Override
    public void onCraftMatrixChanged(final IInventory llllllllllllIllIIllIIIIlIlllIIIl) {
        super.onCraftMatrixChanged(llllllllllllIllIIllIIIIlIlllIIIl);
        if (lIIllIIIIllllIIl(llllllllllllIllIIllIIIIlIlllIIIl, this.inputSlots)) {
            this.updateRepairOutput();
        }
    }
    
    private static String lIIllIIIIllIlllI(final String llllllllllllIllIIllIIIIIlIIlllIl, final String llllllllllllIllIIllIIIIIlIIllllI) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIIIIlIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIIIIIlIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIIIIIlIlIIIIl.init(ContainerRepair.llIllIlllIlIIl[2], llllllllllllIllIIllIIIIIlIlIIIlI);
            return new String(llllllllllllIllIIllIIIIIlIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIIIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIIIIlIlIIIII) {
            llllllllllllIllIIllIIIIIlIlIIIII.printStackTrace();
            return null;
        }
    }
    
    public void updateRepairOutput() {
        final int llllllllllllIllIIllIIIIlIIlIIlII = ContainerRepair.llIllIlllIlIIl[0];
        final int llllllllllllIllIIllIIIIlIIlIIIll = ContainerRepair.llIllIlllIlIIl[1];
        final int llllllllllllIllIIllIIIIlIIlIIIlI = ContainerRepair.llIllIlllIlIIl[1];
        final int llllllllllllIllIIllIIIIlIIlIIIIl = ContainerRepair.llIllIlllIlIIl[1];
        final int llllllllllllIllIIllIIIIlIIlIIIII = ContainerRepair.llIllIlllIlIIl[2];
        final int llllllllllllIllIIllIIIIlIIIlllll = ContainerRepair.llIllIlllIlIIl[1];
        final int llllllllllllIllIIllIIIIlIIIllllI = ContainerRepair.llIllIlllIlIIl[1];
        final ItemStack llllllllllllIllIIllIIIIlIIIlllIl = this.inputSlots.getStackInSlot(ContainerRepair.llIllIlllIlIIl[0]);
        this.maximumCost = ContainerRepair.llIllIlllIlIIl[1];
        int llllllllllllIllIIllIIIIlIIIlllII = ContainerRepair.llIllIlllIlIIl[0];
        int llllllllllllIllIIllIIIIlIIIllIll = ContainerRepair.llIllIlllIlIIl[0];
        int llllllllllllIllIIllIIIIlIIIllIlI = ContainerRepair.llIllIlllIlIIl[0];
        if (lIIllIIIIllllIlI(llllllllllllIllIIllIIIIlIIIlllIl)) {
            this.outputSlot.setInventorySlotContents(ContainerRepair.llIllIlllIlIIl[0], null);
            this.maximumCost = ContainerRepair.llIllIlllIlIIl[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            ItemStack llllllllllllIllIIllIIIIlIIIllIIl = llllllllllllIllIIllIIIIlIIIlllIl.copy();
            final ItemStack llllllllllllIllIIllIIIIlIIIllIII = this.inputSlots.getStackInSlot(ContainerRepair.llIllIlllIlIIl[1]);
            final Map<Integer, Integer> llllllllllllIllIIllIIIIlIIIlIlll = EnchantmentHelper.getEnchantments(llllllllllllIllIIllIIIIlIIIllIIl);
            boolean llllllllllllIllIIllIIIIlIIIlIllI = ContainerRepair.llIllIlllIlIIl[0] != 0;
            final int n = llllllllllllIllIIllIIIIlIIIllIll + llllllllllllIllIIllIIIIlIIIlllIl.getRepairCost();
            int repairCost;
            if (lIIllIIIIllllIlI(llllllllllllIllIIllIIIIlIIIllIII)) {
                repairCost = ContainerRepair.llIllIlllIlIIl[0];
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                repairCost = llllllllllllIllIIllIIIIlIIIllIII.getRepairCost();
            }
            llllllllllllIllIIllIIIIlIIIllIll = n + repairCost;
            this.materialCost = ContainerRepair.llIllIlllIlIIl[0];
            if (lIIllIIIIllllIll(llllllllllllIllIIllIIIIlIIIllIII)) {
                int n2;
                if (lIIllIIIIllllIIl(llllllllllllIllIIllIIIIlIIIllIII.getItem(), Items.enchanted_book) && lIIllIIIIlllllII(Items.enchanted_book.getEnchantments(llllllllllllIllIIllIIIIlIIIllIII).tagCount())) {
                    n2 = ContainerRepair.llIllIlllIlIIl[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n2 = ContainerRepair.llIllIlllIlIIl[0];
                }
                llllllllllllIllIIllIIIIlIIIlIllI = (n2 != 0);
                if (lIIllIIIIlllllIl(llllllllllllIllIIllIIIIlIIIllIIl.isItemStackDamageable() ? 1 : 0) && lIIllIIIIlllllIl(llllllllllllIllIIllIIIIlIIIllIIl.getItem().getIsRepairable(llllllllllllIllIIllIIIIlIIIlllIl, llllllllllllIllIIllIIIIlIIIllIII) ? 1 : 0)) {
                    int llllllllllllIllIIllIIIIlIIIlIlIl = Math.min(llllllllllllIllIIllIIIIlIIIllIIl.getItemDamage(), llllllllllllIllIIllIIIIlIIIllIIl.getMaxDamage() / ContainerRepair.llIllIlllIlIIl[13]);
                    if (lIIllIIIIllllllI(llllllllllllIllIIllIIIIlIIIlIlIl)) {
                        this.outputSlot.setInventorySlotContents(ContainerRepair.llIllIlllIlIIl[0], null);
                        this.maximumCost = ContainerRepair.llIllIlllIlIIl[0];
                        return;
                    }
                    int llllllllllllIllIIllIIIIlIIIlIlII = ContainerRepair.llIllIlllIlIIl[0];
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                    while (lIIllIIIIlllllII(llllllllllllIllIIllIIIIlIIIlIlIl) && !lIIllIIIIllllIII(llllllllllllIllIIllIIIIlIIIlIlII, llllllllllllIllIIllIIIIlIIIllIII.stackSize)) {
                        final int llllllllllllIllIIllIIIIlIIIlIIll = llllllllllllIllIIllIIIIlIIIllIIl.getItemDamage() - llllllllllllIllIIllIIIIlIIIlIlIl;
                        llllllllllllIllIIllIIIIlIIIllIIl.setItemDamage(llllllllllllIllIIllIIIIlIIIlIIll);
                        ++llllllllllllIllIIllIIIIlIIIlllII;
                        llllllllllllIllIIllIIIIlIIIlIlIl = Math.min(llllllllllllIllIIllIIIIlIIIllIIl.getItemDamage(), llllllllllllIllIIllIIIIlIIIllIIl.getMaxDamage() / ContainerRepair.llIllIlllIlIIl[13]);
                        ++llllllllllllIllIIllIIIIlIIIlIlII;
                    }
                    this.materialCost = llllllllllllIllIIllIIIIlIIIlIlII;
                    "".length();
                    if ("  ".length() == "   ".length()) {
                        return;
                    }
                }
                else {
                    if (lIIllIIIIlllllll(llllllllllllIllIIllIIIIlIIIlIllI ? 1 : 0) && (!lIIllIIIIllllIIl(llllllllllllIllIIllIIIIlIIIllIIl.getItem(), llllllllllllIllIIllIIIIlIIIllIII.getItem()) || lIIllIIIIlllllll(llllllllllllIllIIllIIIIlIIIllIIl.isItemStackDamageable() ? 1 : 0))) {
                        this.outputSlot.setInventorySlotContents(ContainerRepair.llIllIlllIlIIl[0], null);
                        this.maximumCost = ContainerRepair.llIllIlllIlIIl[0];
                        return;
                    }
                    if (lIIllIIIIlllllIl(llllllllllllIllIIllIIIIlIIIllIIl.isItemStackDamageable() ? 1 : 0) && lIIllIIIIlllllll(llllllllllllIllIIllIIIIlIIIlIllI ? 1 : 0)) {
                        final int llllllllllllIllIIllIIIIlIIIlIIlI = llllllllllllIllIIllIIIIlIIIlllIl.getMaxDamage() - llllllllllllIllIIllIIIIlIIIlllIl.getItemDamage();
                        final int llllllllllllIllIIllIIIIlIIIlIIIl = llllllllllllIllIIllIIIIlIIIllIII.getMaxDamage() - llllllllllllIllIIllIIIIlIIIllIII.getItemDamage();
                        final int llllllllllllIllIIllIIIIlIIIlIIII = llllllllllllIllIIllIIIIlIIIlIIIl + llllllllllllIllIIllIIIIlIIIllIIl.getMaxDamage() * ContainerRepair.llIllIlllIlIIl[14] / ContainerRepair.llIllIlllIlIIl[15];
                        final int llllllllllllIllIIllIIIIlIIIIllll = llllllllllllIllIIllIIIIlIIIlIIlI + llllllllllllIllIIllIIIIlIIIlIIII;
                        int llllllllllllIllIIllIIIIlIIIIlllI = llllllllllllIllIIllIIIIlIIIllIIl.getMaxDamage() - llllllllllllIllIIllIIIIlIIIIllll;
                        if (lIIllIIIlIIIIIII(llllllllllllIllIIllIIIIlIIIIlllI)) {
                            llllllllllllIllIIllIIIIlIIIIlllI = ContainerRepair.llIllIlllIlIIl[0];
                        }
                        if (lIIllIIIlIIIIIIl(llllllllllllIllIIllIIIIlIIIIlllI, llllllllllllIllIIllIIIIlIIIllIIl.getMetadata())) {
                            llllllllllllIllIIllIIIIlIIIllIIl.setItemDamage(llllllllllllIllIIllIIIIlIIIIlllI);
                            llllllllllllIllIIllIIIIlIIIlllII += 2;
                        }
                    }
                    final Map<Integer, Integer> llllllllllllIllIIllIIIIlIIIIllIl = EnchantmentHelper.getEnchantments(llllllllllllIllIIllIIIIlIIIllIII);
                    final Iterator llllllllllllIllIIllIIIIlIIIIllII = llllllllllllIllIIllIIIIlIIIIllIl.keySet().iterator();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIIllIIIIlllllll(llllllllllllIllIIllIIIIlIIIIllII.hasNext() ? 1 : 0)) {
                        final int llllllllllllIllIIllIIIIlIIIIlIll = llllllllllllIllIIllIIIIlIIIIllII.next();
                        final Enchantment llllllllllllIllIIllIIIIlIIIIlIlI = Enchantment.getEnchantmentById(llllllllllllIllIIllIIIIlIIIIlIll);
                        if (lIIllIIIIllllIll(llllllllllllIllIIllIIIIlIIIIlIlI)) {
                            int intValue;
                            if (lIIllIIIIlllllIl(llllllllllllIllIIllIIIIlIIIlIlll.containsKey(llllllllllllIllIIllIIIIlIIIIlIll) ? 1 : 0)) {
                                intValue = llllllllllllIllIIllIIIIlIIIlIlll.get(llllllllllllIllIIllIIIIlIIIIlIll);
                                "".length();
                                if ((0x63 ^ 0x54 ^ (0x91 ^ 0xA2)) != ("  ".length() ^ (0x23 ^ 0x25))) {
                                    return;
                                }
                            }
                            else {
                                intValue = ContainerRepair.llIllIlllIlIIl[0];
                            }
                            final int llllllllllllIllIIllIIIIlIIIIlIIl = intValue;
                            int llllllllllllIllIIllIIIIlIIIIlIII = llllllllllllIllIIllIIIIlIIIIllIl.get(llllllllllllIllIIllIIIIlIIIIlIll);
                            int llllllllllllIllIIllIIIIlIIIIIllI = 0;
                            if (lIIllIIIlIIIIIlI(llllllllllllIllIIllIIIIlIIIIlIIl, llllllllllllIllIIllIIIIlIIIIlIII)) {
                                final int llllllllllllIllIIllIIIIlIIIIIlll = ++llllllllllllIllIIllIIIIlIIIIlIII;
                                "".length();
                                if (" ".length() > (0xE ^ 0xA)) {
                                    return;
                                }
                            }
                            else {
                                llllllllllllIllIIllIIIIlIIIIIllI = Math.max(llllllllllllIllIIllIIIIlIIIIlIII, llllllllllllIllIIllIIIIlIIIIlIIl);
                            }
                            llllllllllllIllIIllIIIIlIIIIlIII = llllllllllllIllIIllIIIIlIIIIIllI;
                            boolean llllllllllllIllIIllIIIIlIIIIIlIl = llllllllllllIllIIllIIIIlIIIIlIlI.canApply(llllllllllllIllIIllIIIIlIIIlllIl);
                            if (!lIIllIIIIlllllll(this.thePlayer.capabilities.isCreativeMode ? 1 : 0) || lIIllIIIIllllIIl(llllllllllllIllIIllIIIIlIIIlllIl.getItem(), Items.enchanted_book)) {
                                llllllllllllIllIIllIIIIlIIIIIlIl = (ContainerRepair.llIllIlllIlIIl[1] != 0);
                            }
                            final Iterator llllllllllllIllIIllIIIIlIIIIIlII = llllllllllllIllIIllIIIIlIIIlIlll.keySet().iterator();
                            "".length();
                            if (" ".length() >= "  ".length()) {
                                return;
                            }
                            while (!lIIllIIIIlllllll(llllllllllllIllIIllIIIIlIIIIIlII.hasNext() ? 1 : 0)) {
                                final int llllllllllllIllIIllIIIIlIIIIIIll = llllllllllllIllIIllIIIIlIIIIIlII.next();
                                if (lIIllIIIlIIIIIll(llllllllllllIllIIllIIIIlIIIIIIll, llllllllllllIllIIllIIIIlIIIIlIll) && lIIllIIIIlllllll(llllllllllllIllIIllIIIIlIIIIlIlI.canApplyTogether(Enchantment.getEnchantmentById(llllllllllllIllIIllIIIIlIIIIIIll)) ? 1 : 0)) {
                                    llllllllllllIllIIllIIIIlIIIIIlIl = (ContainerRepair.llIllIlllIlIIl[0] != 0);
                                    ++llllllllllllIllIIllIIIIlIIIlllII;
                                }
                            }
                            if (!lIIllIIIIlllllIl(llllllllllllIllIIllIIIIlIIIIIlIl ? 1 : 0)) {
                                continue;
                            }
                            if (lIIllIIIlIIIIlII(llllllllllllIllIIllIIIIlIIIIlIII, llllllllllllIllIIllIIIIlIIIIlIlI.getMaxLevel())) {
                                llllllllllllIllIIllIIIIlIIIIlIII = llllllllllllIllIIllIIIIlIIIIlIlI.getMaxLevel();
                            }
                            llllllllllllIllIIllIIIIlIIIlIlll.put(llllllllllllIllIIllIIIIlIIIIlIll, llllllllllllIllIIllIIIIlIIIIlIII);
                            "".length();
                            int llllllllllllIllIIllIIIIlIIIIIIlI = ContainerRepair.llIllIlllIlIIl[0];
                            Label_1353: {
                                switch (llllllllllllIllIIllIIIIlIIIIlIlI.getWeight()) {
                                    case 1: {
                                        llllllllllllIllIIllIIIIlIIIIIIlI = ContainerRepair.llIllIlllIlIIl[8];
                                        "".length();
                                        if ("   ".length() < 0) {
                                            return;
                                        }
                                        break Label_1353;
                                    }
                                    case 2: {
                                        llllllllllllIllIIllIIIIlIIIIIIlI = ContainerRepair.llIllIlllIlIIl[13];
                                        break;
                                    }
                                    case 5: {
                                        llllllllllllIllIIllIIIIlIIIIIIlI = ContainerRepair.llIllIlllIlIIl[2];
                                        "".length();
                                        if (((0x72 ^ 0x22 ^ (0xB4 ^ 0xC7)) & (0x1E ^ 0x26 ^ (0x5E ^ 0x45) ^ -" ".length())) != ((40 + 103 - 59 + 131 ^ 146 + 35 - 70 + 69) & (17 + 92 - 107 + 217 ^ 35 + 21 - 9 + 137 ^ -" ".length()))) {
                                            return;
                                        }
                                        break Label_1353;
                                    }
                                    case 10: {
                                        llllllllllllIllIIllIIIIlIIIIIIlI = ContainerRepair.llIllIlllIlIIl[1];
                                        break Label_1353;
                                    }
                                }
                                "".length();
                                if ("  ".length() <= ((0x2B ^ 0xF ^ (0x5A ^ 0x3D)) & (170 + 117 - 203 + 108 ^ 39 + 120 - 74 + 46 ^ -" ".length()))) {
                                    return;
                                }
                            }
                            if (lIIllIIIIlllllIl(llllllllllllIllIIllIIIIlIIIlIllI ? 1 : 0)) {
                                llllllllllllIllIIllIIIIlIIIIIIlI = Math.max(ContainerRepair.llIllIlllIlIIl[1], llllllllllllIllIIllIIIIlIIIIIIlI / ContainerRepair.llIllIlllIlIIl[2]);
                            }
                            llllllllllllIllIIllIIIIlIIIlllII += llllllllllllIllIIllIIIIlIIIIIIlI * llllllllllllIllIIllIIIIlIIIIlIII;
                        }
                    }
                }
            }
            if (lIIllIIIIlllllIl(StringUtils.isBlank((CharSequence)this.repairedItemName) ? 1 : 0)) {
                if (lIIllIIIIlllllIl(llllllllllllIllIIllIIIIlIIIlllIl.hasDisplayName() ? 1 : 0)) {
                    llllllllllllIllIIllIIIIlIIIllIlI = ContainerRepair.llIllIlllIlIIl[1];
                    llllllllllllIllIIllIIIIlIIIlllII += llllllllllllIllIIllIIIIlIIIllIlI;
                    llllllllllllIllIIllIIIIlIIIllIIl.clearCustomName();
                    "".length();
                    if ((0x6A ^ 0x6E) != (0x2F ^ 0x2B)) {
                        return;
                    }
                }
            }
            else if (lIIllIIIIlllllll(this.repairedItemName.equals(llllllllllllIllIIllIIIIlIIIlllIl.getDisplayName()) ? 1 : 0)) {
                llllllllllllIllIIllIIIIlIIIllIlI = ContainerRepair.llIllIlllIlIIl[1];
                llllllllllllIllIIllIIIIlIIIlllII += llllllllllllIllIIllIIIIlIIIllIlI;
                llllllllllllIllIIllIIIIlIIIllIIl.setStackDisplayName(this.repairedItemName);
                "".length();
            }
            this.maximumCost = llllllllllllIllIIllIIIIlIIIllIll + llllllllllllIllIIllIIIIlIIIlllII;
            if (lIIllIIIIllllllI(llllllllllllIllIIllIIIIlIIIlllII)) {
                llllllllllllIllIIllIIIIlIIIllIIl = null;
            }
            if (lIIllIIIlIIIIIlI(llllllllllllIllIIllIIIIlIIIllIlI, llllllllllllIllIIllIIIIlIIIlllII) && lIIllIIIIlllllII(llllllllllllIllIIllIIIIlIIIllIlI) && lIIllIIIIllllIII(this.maximumCost, ContainerRepair.llIllIlllIlIIl[16])) {
                this.maximumCost = ContainerRepair.llIllIlllIlIIl[17];
            }
            if (lIIllIIIIllllIII(this.maximumCost, ContainerRepair.llIllIlllIlIIl[16]) && lIIllIIIIlllllll(this.thePlayer.capabilities.isCreativeMode ? 1 : 0)) {
                llllllllllllIllIIllIIIIlIIIllIIl = null;
            }
            if (lIIllIIIIllllIll(llllllllllllIllIIllIIIIlIIIllIIl)) {
                int llllllllllllIllIIllIIIIlIIIIIIIl = llllllllllllIllIIllIIIIlIIIllIIl.getRepairCost();
                if (lIIllIIIIllllIll(llllllllllllIllIIllIIIIlIIIllIII) && lIIllIIIlIIIIIIl(llllllllllllIllIIllIIIIlIIIIIIIl, llllllllllllIllIIllIIIIlIIIllIII.getRepairCost())) {
                    llllllllllllIllIIllIIIIlIIIIIIIl = llllllllllllIllIIllIIIIlIIIllIII.getRepairCost();
                }
                llllllllllllIllIIllIIIIlIIIIIIIl = llllllllllllIllIIllIIIIlIIIIIIIl * ContainerRepair.llIllIlllIlIIl[2] + ContainerRepair.llIllIlllIlIIl[1];
                llllllllllllIllIIllIIIIlIIIllIIl.setRepairCost(llllllllllllIllIIllIIIIlIIIIIIIl);
                EnchantmentHelper.setEnchantments(llllllllllllIllIIllIIIIlIIIlIlll, llllllllllllIllIIllIIIIlIIIllIIl);
            }
            this.outputSlot.setInventorySlotContents(ContainerRepair.llIllIlllIlIIl[0], llllllllllllIllIIllIIIIlIIIllIIl);
            this.detectAndSendChanges();
        }
    }
    
    private static void lIIllIIIIlllIlll() {
        (llIllIlllIlIIl = new int[18])[0] = ((0x8F ^ 0x9F ^ (0x4B ^ 0x14)) & (0x4B ^ 0x3B ^ (0x4 ^ 0x3B) ^ -" ".length()));
        ContainerRepair.llIllIlllIlIIl[1] = " ".length();
        ContainerRepair.llIllIlllIlIIl[2] = "  ".length();
        ContainerRepair.llIllIlllIlIIl[3] = (0xC ^ 0x17);
        ContainerRepair.llIllIlllIlIIl[4] = (0x73 ^ 0x5C);
        ContainerRepair.llIllIlllIlIIl[5] = (182 + 39 - 131 + 114 ^ 32 + 8 + 46 + 42);
        ContainerRepair.llIllIlllIlIIl[6] = (0xA6 ^ 0xB7) + (3 + 26 + 30 + 68) - (0x30 ^ 0x4E) + (0x71 ^ 0x5);
        ContainerRepair.llIllIlllIlIIl[7] = (0x65 ^ 0x27 ^ (0x9 ^ 0x42));
        ContainerRepair.llIllIlllIlIIl[8] = (0x54 ^ 0x3D ^ (0x33 ^ 0x52));
        ContainerRepair.llIllIlllIlIIl[9] = (0xB ^ 0x19);
        ContainerRepair.llIllIlllIlIIl[10] = (0xC8 ^ 0x9C);
        ContainerRepair.llIllIlllIlIIl[11] = "   ".length();
        ContainerRepair.llIllIlllIlIIl[12] = (0x38 ^ 0x46) + (0xA7 ^ 0xB5) - (0x31 ^ 0x42) + (0x55 ^ 0x24);
        ContainerRepair.llIllIlllIlIIl[13] = (0x9A ^ 0x9E);
        ContainerRepair.llIllIlllIlIIl[14] = (41 + 90 - 68 + 66 ^ 82 + 37 - 69 + 91);
        ContainerRepair.llIllIlllIlIIl[15] = (0x12 ^ 0x76);
        ContainerRepair.llIllIlllIlIIl[16] = (0x42 ^ 0x6A);
        ContainerRepair.llIllIlllIlIIl[17] = (0x6 ^ 0x21);
    }
    
    private static boolean lIIllIIIlIIIIIII(final int llllllllllllIllIIllIIIIIIllllIII) {
        return llllllllllllIllIIllIIIIIIllllIII < 0;
    }
    
    public ContainerRepair(final InventoryPlayer llllllllllllIllIIllIIIIllIllIIII, final World llllllllllllIllIIllIIIIllIlIlIIl, final EntityPlayer llllllllllllIllIIllIIIIllIlIllIl) {
        this(llllllllllllIllIIllIIIIllIllIIII, llllllllllllIllIIllIIIIllIlIlIIl, BlockPos.ORIGIN, llllllllllllIllIIllIIIIllIlIllIl);
    }
    
    private static boolean lIIllIIIlIIIIllI(final Object llllllllllllIllIIllIIIIIlIIIIlll, final Object llllllllllllIllIIllIIIIIlIIIIllI) {
        return llllllllllllIllIIllIIIIIlIIIIlll != llllllllllllIllIIllIIIIIlIIIIllI;
    }
    
    private static boolean lIIllIIIlIIIIIlI(final int llllllllllllIllIIllIIIIIlIIlIlll, final int llllllllllllIllIIllIIIIIlIIlIllI) {
        return llllllllllllIllIIllIIIIIlIIlIlll == llllllllllllIllIIllIIIIIlIIlIllI;
    }
    
    private static boolean lIIllIIIIlllllII(final int llllllllllllIllIIllIIIIIIlllIlII) {
        return llllllllllllIllIIllIIIIIIlllIlII > 0;
    }
}
