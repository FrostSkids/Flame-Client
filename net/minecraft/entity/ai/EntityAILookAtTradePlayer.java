// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityVillager;

public class EntityAILookAtTradePlayer extends EntityAIWatchClosest
{
    private final /* synthetic */ EntityVillager theMerchant;
    private static final /* synthetic */ int[] lIlIlIIIIIlllI;
    
    private static boolean lllIlIlIlIlllIl(final int lllllllllllllIIIlIllIIlIlIlIIlll) {
        return lllllllllllllIIIlIllIIlIlIlIIlll != 0;
    }
    
    public EntityAILookAtTradePlayer(final EntityVillager lllllllllllllIIIlIllIIlIlIlIlllI) {
        super(lllllllllllllIIIlIllIIlIlIlIlllI, EntityPlayer.class, 8.0f);
        this.theMerchant = lllllllllllllIIIlIllIIlIlIlIlllI;
    }
    
    static {
        lllIlIlIlIlllII();
    }
    
    private static void lllIlIlIlIlllII() {
        (lIlIlIIIIIlllI = new int[2])[0] = " ".length();
        EntityAILookAtTradePlayer.lIlIlIIIIIlllI[1] = ((0xA5 ^ 0x85 ^ (0x79 ^ 0x7E)) & (68 + 45 - 93 + 136 ^ 180 + 60 - 124 + 71 ^ -" ".length()));
    }
    
    @Override
    public boolean shouldExecute() {
        if (lllIlIlIlIlllIl(this.theMerchant.isTrading() ? 1 : 0)) {
            this.closestEntity = this.theMerchant.getCustomer();
            return EntityAILookAtTradePlayer.lIlIlIIIIIlllI[0] != 0;
        }
        return EntityAILookAtTradePlayer.lIlIlIIIIIlllI[1] != 0;
    }
}
