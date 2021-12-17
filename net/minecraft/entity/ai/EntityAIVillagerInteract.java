// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.passive.EntityVillager;

public class EntityAIVillagerInteract extends EntityAIWatchClosest2
{
    private static final /* synthetic */ int[] lIIIlllIIIllIl;
    private /* synthetic */ int interactionDelay;
    private /* synthetic */ EntityVillager villager;
    
    private static boolean llIIIlIlllIlIlI(final Object lllllllllllllIIlllllIlllllIIlIlI, final Object lllllllllllllIIlllllIlllllIIlIIl) {
        return lllllllllllllIIlllllIlllllIIlIlI != lllllllllllllIIlllllIlllllIIlIIl;
    }
    
    private static boolean llIIIlIlllIlIII(final int lllllllllllllIIlllllIllllIllllll) {
        return lllllllllllllIIlllllIllllIllllll == 0;
    }
    
    private static boolean llIIIlIlllIllII(final int lllllllllllllIIlllllIlllllIIlllI, final int lllllllllllllIIlllllIlllllIIllIl) {
        return lllllllllllllIIlllllIlllllIIlllI > lllllllllllllIIlllllIlllllIIllIl;
    }
    
    @Override
    public void startExecuting() {
        super.startExecuting();
        if (llIIIlIlllIIllI(this.villager.canAbondonItems() ? 1 : 0) && llIIIlIlllIIllI((this.closestEntity instanceof EntityVillager) ? 1 : 0) && llIIIlIlllIIllI(((EntityVillager)this.closestEntity).func_175557_cr() ? 1 : 0)) {
            this.interactionDelay = EntityAIVillagerInteract.lIIIlllIIIllIl[0];
            "".length();
            if (((0x40 ^ 0x3E ^ (0x11 ^ 0x27)) & (0x51 ^ 0x28 ^ (0x58 ^ 0x69) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.interactionDelay = EntityAIVillagerInteract.lIIIlllIIIllIl[1];
        }
    }
    
    private static boolean llIIIlIlllIllIl(final int lllllllllllllIIlllllIllllIllllIl) {
        return lllllllllllllIIlllllIllllIllllIl <= 0;
    }
    
    private static boolean llIIIlIlllIlIIl(final Object lllllllllllllIIlllllIlllllIIIlll) {
        return lllllllllllllIIlllllIlllllIIIlll != null;
    }
    
    @Override
    public void updateTask() {
        super.updateTask();
        if (llIIIlIlllIIlll(this.interactionDelay)) {
            this.interactionDelay -= EntityAIVillagerInteract.lIIIlllIIIllIl[2];
            if (llIIIlIlllIlIII(this.interactionDelay)) {
                final InventoryBasic lllllllllllllIIlllllIllllllIllII = this.villager.getVillagerInventory();
                int lllllllllllllIIlllllIllllllIlIll = EntityAIVillagerInteract.lIIIlllIIIllIl[1];
                "".length();
                if ((("  ".length() ^ (0xD4 ^ 0x83)) & (0x60 ^ 0x35 ^ ((0x2C ^ 0x74) & ~(0x5F ^ 0x7)) ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!llIIIlIlllIlllI(lllllllllllllIIlllllIllllllIlIll, lllllllllllllIIlllllIllllllIllII.getSizeInventory())) {
                    final ItemStack lllllllllllllIIlllllIllllllIlIlI = lllllllllllllIIlllllIllllllIllII.getStackInSlot(lllllllllllllIIlllllIllllllIlIll);
                    ItemStack lllllllllllllIIlllllIllllllIlIIl = null;
                    if (llIIIlIlllIlIIl(lllllllllllllIIlllllIllllllIlIlI)) {
                        final Item lllllllllllllIIlllllIllllllIlIII = lllllllllllllIIlllllIllllllIlIlI.getItem();
                        if ((!llIIIlIlllIlIlI(lllllllllllllIIlllllIllllllIlIII, Items.bread) || !llIIIlIlllIlIlI(lllllllllllllIIlllllIllllllIlIII, Items.potato) || llIIIlIlllIlIll(lllllllllllllIIlllllIllllllIlIII, Items.carrot)) && llIIIlIlllIllII(lllllllllllllIIlllllIllllllIlIlI.stackSize, EntityAIVillagerInteract.lIIIlllIIIllIl[3])) {
                            final int lllllllllllllIIlllllIllllllIIlll = lllllllllllllIIlllllIllllllIlIlI.stackSize / EntityAIVillagerInteract.lIIIlllIIIllIl[4];
                            final ItemStack itemStack = lllllllllllllIIlllllIllllllIlIlI;
                            itemStack.stackSize -= lllllllllllllIIlllllIllllllIIlll;
                            lllllllllllllIIlllllIllllllIlIIl = new ItemStack(lllllllllllllIIlllllIllllllIlIII, lllllllllllllIIlllllIllllllIIlll, lllllllllllllIIlllllIllllllIlIlI.getMetadata());
                            "".length();
                            if (((86 + 88 - 142 + 106 ^ 127 + 65 - 17 + 19) & (72 + 191 - 72 + 21 ^ 17 + 39 + 4 + 96 ^ -" ".length())) < 0) {
                                return;
                            }
                        }
                        else if (llIIIlIlllIlIll(lllllllllllllIIlllllIllllllIlIII, Items.wheat) && llIIIlIlllIllII(lllllllllllllIIlllllIllllllIlIlI.stackSize, EntityAIVillagerInteract.lIIIlllIIIllIl[5])) {
                            final int lllllllllllllIIlllllIllllllIIllI = lllllllllllllIIlllllIllllllIlIlI.stackSize / EntityAIVillagerInteract.lIIIlllIIIllIl[4] / EntityAIVillagerInteract.lIIIlllIIIllIl[3] * EntityAIVillagerInteract.lIIIlllIIIllIl[3];
                            final int lllllllllllllIIlllllIllllllIIlIl = lllllllllllllIIlllllIllllllIIllI / EntityAIVillagerInteract.lIIIlllIIIllIl[3];
                            final ItemStack itemStack2 = lllllllllllllIIlllllIllllllIlIlI;
                            itemStack2.stackSize -= lllllllllllllIIlllllIllllllIIllI;
                            lllllllllllllIIlllllIllllllIlIIl = new ItemStack(Items.bread, lllllllllllllIIlllllIllllllIIlIl, EntityAIVillagerInteract.lIIIlllIIIllIl[1]);
                        }
                        if (llIIIlIlllIllIl(lllllllllllllIIlllllIllllllIlIlI.stackSize)) {
                            lllllllllllllIIlllllIllllllIllII.setInventorySlotContents(lllllllllllllIIlllllIllllllIlIll, null);
                        }
                    }
                    if (llIIIlIlllIlIIl(lllllllllllllIIlllllIllllllIlIIl)) {
                        final double lllllllllllllIIlllllIllllllIIlII = this.villager.posY - 0.30000001192092896 + this.villager.getEyeHeight();
                        final EntityItem lllllllllllllIIlllllIllllllIIIll = new EntityItem(this.villager.worldObj, this.villager.posX, lllllllllllllIIlllllIllllllIIlII, this.villager.posZ, lllllllllllllIIlllllIllllllIlIIl);
                        final float lllllllllllllIIlllllIllllllIIIlI = 0.3f;
                        final float lllllllllllllIIlllllIllllllIIIIl = this.villager.rotationYawHead;
                        final float lllllllllllllIIlllllIllllllIIIII = this.villager.rotationPitch;
                        lllllllllllllIIlllllIllllllIIIll.motionX = -MathHelper.sin(lllllllllllllIIlllllIllllllIIIIl / 180.0f * 3.1415927f) * MathHelper.cos(lllllllllllllIIlllllIllllllIIIII / 180.0f * 3.1415927f) * lllllllllllllIIlllllIllllllIIIlI;
                        lllllllllllllIIlllllIllllllIIIll.motionZ = MathHelper.cos(lllllllllllllIIlllllIllllllIIIIl / 180.0f * 3.1415927f) * MathHelper.cos(lllllllllllllIIlllllIllllllIIIII / 180.0f * 3.1415927f) * lllllllllllllIIlllllIllllllIIIlI;
                        lllllllllllllIIlllllIllllllIIIll.motionY = -MathHelper.sin(lllllllllllllIIlllllIllllllIIIII / 180.0f * 3.1415927f) * lllllllllllllIIlllllIllllllIIIlI + 0.1f;
                        lllllllllllllIIlllllIllllllIIIll.setDefaultPickupDelay();
                        this.villager.worldObj.spawnEntityInWorld(lllllllllllllIIlllllIllllllIIIll);
                        "".length();
                        "".length();
                        if ("  ".length() <= ((0x2C ^ 0x16 ^ (0xB ^ 0x61)) & (0xA ^ 0x4F ^ (0x53 ^ 0x46) ^ -" ".length()))) {
                            return;
                        }
                        break;
                    }
                    else {
                        ++lllllllllllllIIlllllIllllllIlIll;
                    }
                }
            }
        }
    }
    
    private static void llIIIlIlllIIlIl() {
        (lIIIlllIIIllIl = new int[6])[0] = (0xB5 ^ 0xBF);
        EntityAIVillagerInteract.lIIIlllIIIllIl[1] = ((0xE2 ^ 0x9F ^ (0xEF ^ 0x8D)) & (0x36 ^ 0x4E ^ (0x2B ^ 0x4C) ^ -" ".length()));
        EntityAIVillagerInteract.lIIIlllIIIllIl[2] = " ".length();
        EntityAIVillagerInteract.lIIIlllIIIllIl[3] = "   ".length();
        EntityAIVillagerInteract.lIIIlllIIIllIl[4] = "  ".length();
        EntityAIVillagerInteract.lIIIlllIIIllIl[5] = (0xF ^ 0xA);
    }
    
    private static boolean llIIIlIlllIlIll(final Object lllllllllllllIIlllllIlllllIIIlII, final Object lllllllllllllIIlllllIlllllIIIIll) {
        return lllllllllllllIIlllllIlllllIIIlII == lllllllllllllIIlllllIlllllIIIIll;
    }
    
    private static boolean llIIIlIlllIlllI(final int lllllllllllllIIlllllIlllllIlIIlI, final int lllllllllllllIIlllllIlllllIlIIIl) {
        return lllllllllllllIIlllllIlllllIlIIlI >= lllllllllllllIIlllllIlllllIlIIIl;
    }
    
    private static boolean llIIIlIlllIIllI(final int lllllllllllllIIlllllIlllllIIIIIl) {
        return lllllllllllllIIlllllIlllllIIIIIl != 0;
    }
    
    public EntityAIVillagerInteract(final EntityVillager lllllllllllllIIlllllIllllllllllI) {
        super(lllllllllllllIIlllllIllllllllllI, EntityVillager.class, 3.0f, 0.02f);
        this.villager = lllllllllllllIIlllllIllllllllllI;
    }
    
    static {
        llIIIlIlllIIlIl();
    }
    
    private static boolean llIIIlIlllIIlll(final int lllllllllllllIIlllllIllllIlllIll) {
        return lllllllllllllIIlllllIllllIlllIll > 0;
    }
}
