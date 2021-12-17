// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;

public class EntityAIFollowParent extends EntityAIBase
{
    /* synthetic */ EntityAnimal parentAnimal;
    private static final /* synthetic */ int[] llIllllllIlIII;
    /* synthetic */ EntityAnimal childAnimal;
    private /* synthetic */ int delayCounter;
    /* synthetic */ double moveSpeed;
    
    @Override
    public void resetTask() {
        this.parentAnimal = null;
    }
    
    private static boolean lIIllIllIlllIllI(final int llllllllllllIllIIIlIlIllIlllllII) {
        return llllllllllllIllIIIlIlIllIlllllII <= 0;
    }
    
    private static boolean lIIllIllIlllIlll(final int llllllllllllIllIIIlIlIlllIIIIIlI) {
        return llllllllllllIllIIIlIlIlllIIIIIlI == 0;
    }
    
    public EntityAIFollowParent(final EntityAnimal llllllllllllIllIIIlIlIlllIlIllIl, final double llllllllllllIllIIIlIlIlllIlIlIIl) {
        this.childAnimal = llllllllllllIllIIIlIlIlllIlIllIl;
        this.moveSpeed = llllllllllllIllIIIlIlIlllIlIlIIl;
    }
    
    @Override
    public void updateTask() {
        final int n = this.delayCounter - EntityAIFollowParent.llIllllllIlIII[1];
        this.delayCounter = n;
        if (lIIllIllIlllIllI(n)) {
            this.delayCounter = EntityAIFollowParent.llIllllllIlIII[2];
            this.childAnimal.getNavigator().tryMoveToEntityLiving(this.parentAnimal, this.moveSpeed);
            "".length();
        }
    }
    
    private static boolean lIIllIllIllllIII(final Object llllllllllllIllIIIlIlIlllIIIIlII) {
        return llllllllllllIllIIIlIlIlllIIIIlII == null;
    }
    
    private static boolean lIIllIllIllllIIl(final int llllllllllllIllIIIlIlIllIllllllI) {
        return llllllllllllIllIIIlIlIllIllllllI < 0;
    }
    
    private static int lIIllIllIllllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void startExecuting() {
        this.delayCounter = EntityAIFollowParent.llIllllllIlIII[0];
    }
    
    private static int lIIllIllIlllIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIllIllIlllIlIl(this.childAnimal.getGrowingAge())) {
            return EntityAIFollowParent.llIllllllIlIII[0] != 0;
        }
        final List<EntityAnimal> llllllllllllIllIIIlIlIlllIlIIIII = this.childAnimal.worldObj.getEntitiesWithinAABB(this.childAnimal.getClass(), this.childAnimal.getEntityBoundingBox().expand(8.0, 4.0, 8.0));
        EntityAnimal llllllllllllIllIIIlIlIlllIIlllll = null;
        double llllllllllllIllIIIlIlIlllIIllllI = Double.MAX_VALUE;
        final long llllllllllllIllIIIlIlIlllIIlIllI = (long)llllllllllllIllIIIlIlIlllIlIIIII.iterator();
        "".length();
        if ((120 + 61 - 44 + 49 ^ 120 + 107 - 79 + 43) == 0x0) {
            return ((0x13 ^ 0x6D ^ (0x56 ^ 0x2E)) & (0x64 ^ 0x5 ^ (0xD5 ^ 0xB2) ^ -" ".length())) != 0x0;
        }
        while (!lIIllIllIlllIlll(((Iterator)llllllllllllIllIIIlIlIlllIIlIllI).hasNext() ? 1 : 0)) {
            final EntityAnimal llllllllllllIllIIIlIlIlllIIlllIl = ((Iterator<EntityAnimal>)llllllllllllIllIIIlIlIlllIIlIllI).next();
            if (lIIllIllIlllIlIl(llllllllllllIllIIIlIlIlllIIlllIl.getGrowingAge())) {
                final double llllllllllllIllIIIlIlIlllIIlllII = this.childAnimal.getDistanceSqToEntity(llllllllllllIllIIIlIlIlllIIlllIl);
                if (!lIIllIllIlllIllI(lIIllIllIlllIlII(llllllllllllIllIIIlIlIlllIIlllII, llllllllllllIllIIIlIlIlllIIllllI))) {
                    continue;
                }
                llllllllllllIllIIIlIlIlllIIllllI = llllllllllllIllIIIlIlIlllIIlllII;
                llllllllllllIllIIIlIlIlllIIlllll = llllllllllllIllIIIlIlIlllIIlllIl;
            }
        }
        if (lIIllIllIllllIII(llllllllllllIllIIIlIlIlllIIlllll)) {
            return EntityAIFollowParent.llIllllllIlIII[0] != 0;
        }
        if (lIIllIllIllllIIl(lIIllIllIlllIlII(llllllllllllIllIIIlIlIlllIIllllI, 9.0))) {
            return EntityAIFollowParent.llIllllllIlIII[0] != 0;
        }
        this.parentAnimal = llllllllllllIllIIIlIlIlllIIlllll;
        return EntityAIFollowParent.llIllllllIlIII[1] != 0;
    }
    
    static {
        lIIllIllIlllIIll();
    }
    
    private static int lIIllIllIllllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void lIIllIllIlllIIll() {
        (llIllllllIlIII = new int[3])[0] = ((0x4A ^ 0x5A) & ~(0x88 ^ 0x98));
        EntityAIFollowParent.llIllllllIlIII[1] = " ".length();
        EntityAIFollowParent.llIllllllIlIII[2] = (0xB9 ^ 0xB3);
    }
    
    private static boolean lIIllIllIlllIlIl(final int llllllllllllIllIIIlIlIlllIIIIIII) {
        return llllllllllllIllIIIlIlIlllIIIIIII >= 0;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIllIllIlllIlIl(this.childAnimal.getGrowingAge())) {
            return EntityAIFollowParent.llIllllllIlIII[0] != 0;
        }
        if (lIIllIllIlllIlll(this.parentAnimal.isEntityAlive() ? 1 : 0)) {
            return EntityAIFollowParent.llIllllllIlIII[0] != 0;
        }
        final double llllllllllllIllIIIlIlIlllIIlIIIl = this.childAnimal.getDistanceSqToEntity(this.parentAnimal);
        if (lIIllIllIlllIlIl(lIIllIllIllllIlI(llllllllllllIllIIIlIlIlllIIlIIIl, 9.0)) && lIIllIllIlllIllI(lIIllIllIllllIll(llllllllllllIllIIIlIlIlllIIlIIIl, 256.0))) {
            return EntityAIFollowParent.llIllllllIlIII[1] != 0;
        }
        return EntityAIFollowParent.llIllllllIlIII[0] != 0;
    }
}
