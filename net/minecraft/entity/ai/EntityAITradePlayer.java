// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.inventory.Container;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityVillager;

public class EntityAITradePlayer extends EntityAIBase
{
    private static final /* synthetic */ int[] lIIlIllIllllIl;
    private /* synthetic */ EntityVillager villager;
    
    private static boolean llIlIIllIlllIII(final Object lllllllllllllIIllIIIlIIIIIlIlIlI) {
        return lllllllllllllIIllIIIlIIIIIlIlIlI == null;
    }
    
    private static int llIlIIllIllIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlIIllIllIllI(final int lllllllllllllIIllIIIlIIIIIlIIllI) {
        return lllllllllllllIIllIIIlIIIIIlIIllI == 0;
    }
    
    @Override
    public void resetTask() {
        this.villager.setCustomer(null);
    }
    
    @Override
    public boolean shouldExecute() {
        if (llIlIIllIllIllI(this.villager.isEntityAlive() ? 1 : 0)) {
            return EntityAITradePlayer.lIIlIllIllllIl[1] != 0;
        }
        if (llIlIIllIllIlll(this.villager.isInWater() ? 1 : 0)) {
            return EntityAITradePlayer.lIIlIllIllllIl[1] != 0;
        }
        if (llIlIIllIllIllI(this.villager.onGround ? 1 : 0)) {
            return EntityAITradePlayer.lIIlIllIllllIl[1] != 0;
        }
        if (llIlIIllIllIlll(this.villager.velocityChanged ? 1 : 0)) {
            return EntityAITradePlayer.lIIlIllIllllIl[1] != 0;
        }
        final EntityPlayer lllllllllllllIIllIIIlIIIIIllIlII = this.villager.getCustomer();
        int n;
        if (llIlIIllIlllIII(lllllllllllllIIllIIIlIIIIIllIlII)) {
            n = EntityAITradePlayer.lIIlIllIllllIl[1];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x60 ^ 0x7D) & ~(0xB4 ^ 0xA9)) != 0x0;
            }
        }
        else if (llIlIIllIlllIlI(llIlIIllIllIlII(this.villager.getDistanceSqToEntity(lllllllllllllIIllIIIlIIIIIllIlII), 16.0))) {
            n = EntityAITradePlayer.lIIlIllIllllIl[1];
            "".length();
            if (null != null) {
                return ((0x47 ^ 0x76) & ~(0x82 ^ 0xB3)) != 0x0;
            }
        }
        else {
            n = ((lllllllllllllIIllIIIlIIIIIllIlII.openContainer instanceof Container) ? 1 : 0);
        }
        return n != 0;
    }
    
    static {
        llIlIIllIllIIll();
    }
    
    private static void llIlIIllIllIIll() {
        (lIIlIllIllllIl = new int[2])[0] = (0x34 ^ 0x31);
        EntityAITradePlayer.lIIlIllIllllIl[1] = ((0x1B ^ 0x2B) & ~(0x78 ^ 0x48));
    }
    
    public EntityAITradePlayer(final EntityVillager lllllllllllllIIllIIIlIIIIIlllIlI) {
        this.villager = lllllllllllllIIllIIIlIIIIIlllIlI;
        this.setMutexBits(EntityAITradePlayer.lIIlIllIllllIl[0]);
    }
    
    @Override
    public void startExecuting() {
        this.villager.getNavigator().clearPathEntity();
    }
    
    private static boolean llIlIIllIllIlll(final int lllllllllllllIIllIIIlIIIIIlIlIII) {
        return lllllllllllllIIllIIIlIIIIIlIlIII != 0;
    }
    
    private static boolean llIlIIllIlllIlI(final int lllllllllllllIIllIIIlIIIIIlIIlII) {
        return lllllllllllllIIllIIIlIIIIIlIIlII > 0;
    }
}
