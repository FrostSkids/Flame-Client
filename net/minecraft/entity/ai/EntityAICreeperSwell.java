// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;

public class EntityAICreeperSwell extends EntityAIBase
{
    /* synthetic */ EntityCreeper swellingCreeper;
    /* synthetic */ EntityLivingBase creeperAttackTarget;
    private static final /* synthetic */ int[] lIlIlIIIIIlIII;
    
    private static int lllIlIlIlIIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void updateTask() {
        if (lllIlIlIlIIIIll(this.creeperAttackTarget)) {
            this.swellingCreeper.setCreeperState(EntityAICreeperSwell.lIlIlIIIIIlIII[2]);
            "".length();
            if (((0xF ^ 0x6C) & ~(0x21 ^ 0x42)) != 0x0) {
                return;
            }
        }
        else if (lllIlIlIlIIIlII(lllIlIlIlIIIIlI(this.swellingCreeper.getDistanceSqToEntity(this.creeperAttackTarget), 49.0))) {
            this.swellingCreeper.setCreeperState(EntityAICreeperSwell.lIlIlIIIIIlIII[2]);
            "".length();
            if (" ".length() == ((0xD ^ 0x57 ^ (0xBE ^ 0x85)) & (0x3A ^ 0xB ^ (0x4C ^ 0x1C) ^ -" ".length()))) {
                return;
            }
        }
        else if (lllIlIlIlIIIlIl(this.swellingCreeper.getEntitySenses().canSee(this.creeperAttackTarget) ? 1 : 0)) {
            this.swellingCreeper.setCreeperState(EntityAICreeperSwell.lIlIlIIIIIlIII[2]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.swellingCreeper.setCreeperState(EntityAICreeperSwell.lIlIlIIIIIlIII[0]);
        }
    }
    
    @Override
    public void startExecuting() {
        this.swellingCreeper.getNavigator().clearPathEntity();
        this.creeperAttackTarget = this.swellingCreeper.getAttackTarget();
    }
    
    static {
        lllIlIlIIllllIl();
    }
    
    private static boolean lllIlIlIlIIIIII(final Object lllllllllllllIIIlIllIIlllIlIllIl) {
        return lllllllllllllIIIlIllIIlllIlIllIl != null;
    }
    
    private static int lllIlIlIIlllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lllIlIlIlIIIIIl(final int lllllllllllllIIIlIllIIlllIlIIlll) {
        return lllllllllllllIIIlIllIIlllIlIIlll >= 0;
    }
    
    private static void lllIlIlIIllllIl() {
        (lIlIlIIIIIlIII = new int[3])[0] = " ".length();
        EntityAICreeperSwell.lIlIlIIIIIlIII[1] = ((0xEE ^ 0x92 ^ (0x41 ^ 0x2E)) & (91 + 82 - 33 + 34 ^ 137 + 105 - 55 + 2 ^ -" ".length()));
        EntityAICreeperSwell.lIlIlIIIIIlIII[2] = -" ".length();
    }
    
    private static boolean lllIlIlIlIIIIll(final Object lllllllllllllIIIlIllIIlllIlIlIll) {
        return lllllllllllllIIIlIllIIlllIlIlIll == null;
    }
    
    public EntityAICreeperSwell(final EntityCreeper lllllllllllllIIIlIllIIllllIIIIII) {
        this.swellingCreeper = lllllllllllllIIIlIllIIllllIIIIII;
        this.setMutexBits(EntityAICreeperSwell.lIlIlIIIIIlIII[0]);
    }
    
    @Override
    public boolean shouldExecute() {
        final EntityLivingBase lllllllllllllIIIlIllIIlllIlllIlI = this.swellingCreeper.getAttackTarget();
        if (lllIlIlIIllllll(this.swellingCreeper.getCreeperState()) && (!lllIlIlIlIIIIII(lllllllllllllIIIlIllIIlllIlllIlI) || lllIlIlIlIIIIIl(lllIlIlIIlllllI(this.swellingCreeper.getDistanceSqToEntity(lllllllllllllIIIlIllIIlllIlllIlI), 9.0)))) {
            return EntityAICreeperSwell.lIlIlIIIIIlIII[1] != 0;
        }
        return EntityAICreeperSwell.lIlIlIIIIIlIII[0] != 0;
    }
    
    private static boolean lllIlIlIIllllll(final int lllllllllllllIIIlIllIIlllIlIIlIl) {
        return lllllllllllllIIIlIllIIlllIlIIlIl <= 0;
    }
    
    private static boolean lllIlIlIlIIIlII(final int lllllllllllllIIIlIllIIlllIlIIIll) {
        return lllllllllllllIIIlIllIIlllIlIIIll > 0;
    }
    
    private static boolean lllIlIlIlIIIlIl(final int lllllllllllllIIIlIllIIlllIlIlIIl) {
        return lllllllllllllIIIlIllIIlllIlIlIIl == 0;
    }
    
    @Override
    public void resetTask() {
        this.creeperAttackTarget = null;
    }
}
