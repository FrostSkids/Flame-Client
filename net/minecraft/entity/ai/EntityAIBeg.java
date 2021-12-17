// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.passive.EntityWolf;

public class EntityAIBeg extends EntityAIBase
{
    private /* synthetic */ EntityWolf theWolf;
    private /* synthetic */ World worldObject;
    private /* synthetic */ float minPlayerDistance;
    private static final /* synthetic */ int[] lIIIIIIllIllIl;
    private /* synthetic */ EntityPlayer thePlayer;
    private /* synthetic */ int timeoutCounter;
    
    private static boolean lIllIlIIllIIlII(final int lllllllllllllIlIlIIIIIIllIIllIll) {
        return lllllllllllllIlIlIIIIIIllIIllIll == 0;
    }
    
    private static boolean lIllIlIIllIIlll(final Object lllllllllllllIlIlIIIIIIllIlIIIlI, final Object lllllllllllllIlIlIIIIIIllIlIIIIl) {
        return lllllllllllllIlIlIIIIIIllIlIIIlI == lllllllllllllIlIlIIIIIIllIlIIIIl;
    }
    
    private static boolean lIllIlIIllIIIlI(final Object lllllllllllllIlIlIIIIIIllIIlllll) {
        return lllllllllllllIlIlIIIIIIllIIlllll == null;
    }
    
    public EntityAIBeg(final EntityWolf lllllllllllllIlIlIIIIIIllIlllllI, final float lllllllllllllIlIlIIIIIIlllIIIIII) {
        this.theWolf = lllllllllllllIlIlIIIIIIllIlllllI;
        this.worldObject = lllllllllllllIlIlIIIIIIllIlllllI.worldObj;
        this.minPlayerDistance = lllllllllllllIlIlIIIIIIlllIIIIII;
        this.setMutexBits(EntityAIBeg.lIIIIIIllIllIl[0]);
    }
    
    @Override
    public void startExecuting() {
        this.theWolf.setBegging((boolean)(EntityAIBeg.lIIIIIIllIllIl[2] != 0));
        this.timeoutCounter = EntityAIBeg.lIIIIIIllIllIl[3] + this.theWolf.getRNG().nextInt(EntityAIBeg.lIIIIIIllIllIl[3]);
    }
    
    private static boolean lIllIlIIllIIlIl(final int lllllllllllllIlIlIIIIIIllIIllIIl) {
        return lllllllllllllIlIlIIIIIIllIIllIIl > 0;
    }
    
    @Override
    public void resetTask() {
        this.theWolf.setBegging((boolean)(EntityAIBeg.lIIIIIIllIllIl[1] != 0));
        this.thePlayer = null;
    }
    
    @Override
    public void updateTask() {
        this.theWolf.getLookHelper().setLookPosition(this.thePlayer.posX, this.thePlayer.posY + this.thePlayer.getEyeHeight(), this.thePlayer.posZ, 10.0f, (float)this.theWolf.getVerticalFaceSpeed());
        this.timeoutCounter -= EntityAIBeg.lIIIIIIllIllIl[2];
    }
    
    private static int lIllIlIIllIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lIllIlIIllIIlII(this.thePlayer.isEntityAlive() ? 1 : 0)) {
            n = EntityAIBeg.lIIIIIIllIllIl[1];
            "".length();
            if (null != null) {
                return ((0xF3 ^ 0xC2 ^ (0x3E ^ 0x5F)) & (42 + 40 + 35 + 131 ^ 126 + 157 - 119 + 4 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIlIIllIIlIl(lIllIlIIllIIIll(this.theWolf.getDistanceSqToEntity(this.thePlayer), this.minPlayerDistance * this.minPlayerDistance))) {
            n = EntityAIBeg.lIIIIIIllIllIl[1];
            "".length();
            if (-(0x3B ^ 0x68 ^ (0xF6 ^ 0xA1)) >= 0) {
                return ((0x6D ^ 0x58 ^ (0xCE ^ 0xC3)) & (0x91 ^ 0x8F ^ (0x25 ^ 0x3) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIlIIllIIlIl(this.timeoutCounter) && lIllIlIIllIIllI(this.hasPlayerGotBoneInHand(this.thePlayer) ? 1 : 0)) {
            n = EntityAIBeg.lIIIIIIllIllIl[2];
            "".length();
            if (-" ".length() == " ".length()) {
                return ((0x53 ^ 0x5B) & ~(0x43 ^ 0x4B)) != 0x0;
            }
        }
        else {
            n = EntityAIBeg.lIIIIIIllIllIl[1];
        }
        return n != 0;
    }
    
    @Override
    public boolean shouldExecute() {
        this.thePlayer = this.worldObject.getClosestPlayerToEntity(this.theWolf, this.minPlayerDistance);
        int hasPlayerGotBoneInHand;
        if (lIllIlIIllIIIlI(this.thePlayer)) {
            hasPlayerGotBoneInHand = EntityAIBeg.lIIIIIIllIllIl[1];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x54 ^ 0x60) & ~(0x93 ^ 0xA7) & ~((0x99 ^ 0x90) & ~(0x44 ^ 0x4D) & ~((0x5D ^ 0x52) & ~(0x6B ^ 0x64)))) != 0x0;
            }
        }
        else {
            hasPlayerGotBoneInHand = (this.hasPlayerGotBoneInHand(this.thePlayer) ? 1 : 0);
        }
        return hasPlayerGotBoneInHand != 0;
    }
    
    private boolean hasPlayerGotBoneInHand(final EntityPlayer lllllllllllllIlIlIIIIIIllIlIIllI) {
        final ItemStack lllllllllllllIlIlIIIIIIllIlIlIII = lllllllllllllIlIlIIIIIIllIlIIllI.inventory.getCurrentItem();
        int breedingItem;
        if (lIllIlIIllIIIlI(lllllllllllllIlIlIIIIIIllIlIlIII)) {
            breedingItem = EntityAIBeg.lIIIIIIllIllIl[1];
            "".length();
            if (((0x7F ^ 0x4F ^ (0x89 ^ 0x93)) & (0x7E ^ 0x3 ^ (0xEF ^ 0xB8) ^ -" ".length())) != 0x0) {
                return ((0xF1 ^ 0x88 ^ (0xA1 ^ 0x9C)) & (86 + 66 - 25 + 120 ^ 66 + 25 + 33 + 55 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIlIIllIIlII(this.theWolf.isTamed() ? 1 : 0) && lIllIlIIllIIlll(lllllllllllllIlIlIIIIIIllIlIlIII.getItem(), Items.bone)) {
            breedingItem = EntityAIBeg.lIIIIIIllIllIl[2];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return ((0x1B ^ 0x1E) & ~(0x5F ^ 0x5A)) != 0x0;
            }
        }
        else {
            breedingItem = (this.theWolf.isBreedingItem(lllllllllllllIlIlIIIIIIllIlIlIII) ? 1 : 0);
        }
        return breedingItem != 0;
    }
    
    private static boolean lIllIlIIllIIllI(final int lllllllllllllIlIlIIIIIIllIIlllIl) {
        return lllllllllllllIlIlIIIIIIllIIlllIl != 0;
    }
    
    private static void lIllIlIIllIIIIl() {
        (lIIIIIIllIllIl = new int[4])[0] = "  ".length();
        EntityAIBeg.lIIIIIIllIllIl[1] = ((0x62 ^ 0x0 ^ (0x42 ^ 0x6F)) & (" ".length() ^ (0xD5 ^ 0x9B) ^ -" ".length()));
        EntityAIBeg.lIIIIIIllIllIl[2] = " ".length();
        EntityAIBeg.lIIIIIIllIllIl[3] = (0x45 ^ 0x27 ^ (0xF9 ^ 0xB3));
    }
    
    static {
        lIllIlIIllIIIIl();
    }
}
