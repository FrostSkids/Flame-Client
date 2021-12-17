// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.Entity;
import com.google.common.base.Predicate;

public final class EntitySelectors
{
    static {
        selectAnything = (Predicate)new Predicate<Entity>() {
            public boolean apply(final Entity llllllllllllIlllllIllIIIIIIIlllI) {
                return llllllllllllIlllllIllIIIIIIIlllI.isEntityAlive();
            }
        };
        IS_STANDALONE = (Predicate)new Predicate<Entity>() {
            private static final /* synthetic */ int[] lIlIllIIlIlIlI;
            
            private static void llllIIIIllllIlI() {
                (lIlIllIIlIlIlI = new int[2])[0] = " ".length();
                EntitySelectors$2.lIlIllIIlIlIlI[1] = ((0xF3 ^ 0xA6 ^ (0x31 ^ 0x28)) & (63 + 176 - 127 + 138 ^ 5 + 13 + 89 + 75 ^ -" ".length()));
            }
            
            private static boolean llllIIIIllllIll(final int lllllllllllllIIIIlllIIIIIlIllIII) {
                return lllllllllllllIIIIlllIIIIIlIllIII != 0;
            }
            
            static {
                llllIIIIllllIlI();
            }
            
            private static boolean llllIIIIlllllII(final Object lllllllllllllIIIIlllIIIIIlIllIlI) {
                return lllllllllllllIIIIlllIIIIIlIllIlI == null;
            }
            
            public boolean apply(final Entity lllllllllllllIIIIlllIIIIIllIIIII) {
                if (llllIIIIllllIll(lllllllllllllIIIIlllIIIIIllIIIII.isEntityAlive() ? 1 : 0) && llllIIIIlllllII(lllllllllllllIIIIlllIIIIIllIIIII.riddenByEntity) && llllIIIIlllllII(lllllllllllllIIIIlllIIIIIllIIIII.ridingEntity)) {
                    return EntitySelectors$2.lIlIllIIlIlIlI[0] != 0;
                }
                return EntitySelectors$2.lIlIllIIlIlIlI[1] != 0;
            }
        };
        selectInventories = (Predicate)new Predicate<Entity>() {
            private static final /* synthetic */ int[] lllIIllllIlllI;
            
            public boolean apply(final Entity llllllllllllIlIlllIlIlIIllllIIll) {
                if (lIlIIIIlIIIIIlll((llllllllllllIlIlllIlIlIIllllIIll instanceof IInventory) ? 1 : 0) && lIlIIIIlIIIIIlll(llllllllllllIlIlllIlIlIIllllIIll.isEntityAlive() ? 1 : 0)) {
                    return EntitySelectors$3.lllIIllllIlllI[0] != 0;
                }
                return EntitySelectors$3.lllIIllllIlllI[1] != 0;
            }
            
            private static void lIlIIIIlIIIIIllI() {
                (lllIIllllIlllI = new int[2])[0] = " ".length();
                EntitySelectors$3.lllIIllllIlllI[1] = ((25 + 71 + 7 + 80 ^ 31 + 147 - 125 + 95) & (70 + 47 + 33 + 19 ^ 19 + 32 + 56 + 31 ^ -" ".length()));
            }
            
            static {
                lIlIIIIlIIIIIllI();
            }
            
            private static boolean lIlIIIIlIIIIIlll(final int llllllllllllIlIlllIlIlIIlllIllIl) {
                return llllllllllllIlIlllIlIlIIlllIllIl != 0;
            }
        };
        NOT_SPECTATING = (Predicate)new Predicate<Entity>() {
            private static final /* synthetic */ int[] lIlIllIllIlIIl;
            
            public boolean apply(final Entity lllllllllllllIIIIllIlIIIllIlIIII) {
                if (llllIIIllllllll((lllllllllllllIIIIllIlIIIllIlIIII instanceof EntityPlayer) ? 1 : 0) && llllIIIllllllll(((EntityPlayer)lllllllllllllIIIIllIlIIIllIlIIII).isSpectator() ? 1 : 0)) {
                    return EntitySelectors$4.lIlIllIllIlIIl[0] != 0;
                }
                return EntitySelectors$4.lIlIllIllIlIIl[1] != 0;
            }
            
            private static boolean llllIIIllllllll(final int lllllllllllllIIIIllIlIIIllIIlIIl) {
                return lllllllllllllIIIIllIlIIIllIIlIIl != 0;
            }
            
            private static void llllIIIlllllllI() {
                (lIlIllIllIlIIl = new int[2])[0] = ((0x7 ^ 0x68 ^ (0x58 ^ 0x29)) & (174 + 49 - 196 + 157 ^ 76 + 60 - 125 + 155 ^ -" ".length()));
                EntitySelectors$4.lIlIllIllIlIIl[1] = " ".length();
            }
            
            static {
                llllIIIlllllllI();
            }
        };
    }
    
    public static class ArmoredMob implements Predicate<Entity>
    {
        private final /* synthetic */ ItemStack armor;
        private static final /* synthetic */ int[] lIIlIlllIlllII;
        
        private static boolean llIlIlIIIIlIIII(final int lllllllllllllIIllIIIIIlIIIlIlllI) {
            return lllllllllllllIIllIIIIIlIIIlIlllI == 0;
        }
        
        public ArmoredMob(final ItemStack lllllllllllllIIllIIIIIlIIllIIlII) {
            this.armor = lllllllllllllIIllIIIIIlIIllIIlII;
        }
        
        static {
            llIlIlIIIIIllll();
        }
        
        public boolean apply(final Entity lllllllllllllIIllIIIIIlIIlIIlIIl) {
            if (llIlIlIIIIlIIII(lllllllllllllIIllIIIIIlIIlIIlIIl.isEntityAlive() ? 1 : 0)) {
                return ArmoredMob.lIIlIlllIlllII[0] != 0;
            }
            if (llIlIlIIIIlIIII((lllllllllllllIIllIIIIIlIIlIIlIIl instanceof EntityLivingBase) ? 1 : 0)) {
                return ArmoredMob.lIIlIlllIlllII[0] != 0;
            }
            final EntityLivingBase lllllllllllllIIllIIIIIlIIlIIlllI = (EntityLivingBase)lllllllllllllIIllIIIIIlIIlIIlIIl;
            int canPickUpLoot;
            if (llIlIlIIIIlIIIl(lllllllllllllIIllIIIIIlIIlIIlllI.getEquipmentInSlot(EntityLiving.getArmorPosition(this.armor)))) {
                canPickUpLoot = ArmoredMob.lIIlIlllIlllII[0];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return ((0xAA ^ 0xA6 ^ (0x42 ^ 0x75)) & (0x39 ^ 0x1 ^ "   ".length() ^ -" ".length())) != 0x0;
                }
            }
            else if (llIlIlIIIIlIIlI((lllllllllllllIIllIIIIIlIIlIIlllI instanceof EntityLiving) ? 1 : 0)) {
                canPickUpLoot = (((EntityLiving)lllllllllllllIIllIIIIIlIIlIIlllI).canPickUpLoot() ? 1 : 0);
                "".length();
                if ("  ".length() < 0) {
                    return ((0x51 ^ 0x1E) & ~(0x38 ^ 0x77)) != 0x0;
                }
            }
            else if (llIlIlIIIIlIIlI((lllllllllllllIIllIIIIIlIIlIIlllI instanceof EntityArmorStand) ? 1 : 0)) {
                canPickUpLoot = ArmoredMob.lIIlIlllIlllII[1];
                "".length();
                if (-(0x33 ^ 0x36) >= 0) {
                    return ((0x8B ^ 0x94) & ~(0x3E ^ 0x21)) != 0x0;
                }
            }
            else {
                canPickUpLoot = ((lllllllllllllIIllIIIIIlIIlIIlllI instanceof EntityPlayer) ? 1 : 0);
            }
            return canPickUpLoot != 0;
        }
        
        private static boolean llIlIlIIIIlIIlI(final int lllllllllllllIIllIIIIIlIIIllIIll) {
            return lllllllllllllIIllIIIIIlIIIllIIll != 0;
        }
        
        private static boolean llIlIlIIIIlIIIl(final Object lllllllllllllIIllIIIIIlIIIlllIIl) {
            return lllllllllllllIIllIIIIIlIIIlllIIl != null;
        }
        
        private static void llIlIlIIIIIllll() {
            (lIIlIlllIlllII = new int[2])[0] = ((0x94 ^ 0x82) & ~(0x82 ^ 0x94));
            ArmoredMob.lIIlIlllIlllII[1] = " ".length();
        }
    }
}
