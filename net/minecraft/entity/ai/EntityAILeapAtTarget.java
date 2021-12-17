// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class EntityAILeapAtTarget extends EntityAIBase
{
    /* synthetic */ EntityLivingBase leapTarget;
    /* synthetic */ EntityLiving leaper;
    private static final /* synthetic */ int[] lIIlIlIlllllll;
    /* synthetic */ float leapMotionY;
    
    private static boolean llIlIIIllIIlIlI(final int lllllllllllllIIllIIllIIIIIIIllII) {
        return lllllllllllllIIllIIllIIIIIIIllII == 0;
    }
    
    private static int llIlIIIllIIIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    static {
        llIlIIIllIIIIll();
    }
    
    public EntityAILeapAtTarget(final EntityLiving lllllllllllllIIllIIllIIIIIlIlIll, final float lllllllllllllIIllIIllIIIIIlIIlll) {
        this.leaper = lllllllllllllIIllIIllIIIIIlIlIll;
        this.leapMotionY = lllllllllllllIIllIIllIIIIIlIIlll;
        this.setMutexBits(EntityAILeapAtTarget.lIIlIlIlllllll[0]);
    }
    
    @Override
    public void startExecuting() {
        final double lllllllllllllIIllIIllIIIIIIllIII = this.leapTarget.posX - this.leaper.posX;
        final double lllllllllllllIIllIIllIIIIIIlIlll = this.leapTarget.posZ - this.leaper.posZ;
        final float lllllllllllllIIllIIllIIIIIIlIllI = MathHelper.sqrt_double(lllllllllllllIIllIIllIIIIIIllIII * lllllllllllllIIllIIllIIIIIIllIII + lllllllllllllIIllIIllIIIIIIlIlll * lllllllllllllIIllIIllIIIIIIlIlll);
        final EntityLiving leaper = this.leaper;
        leaper.motionX += lllllllllllllIIllIIllIIIIIIllIII / lllllllllllllIIllIIllIIIIIIlIllI * 0.5 * 0.800000011920929 + this.leaper.motionX * 0.20000000298023224;
        final EntityLiving leaper2 = this.leaper;
        leaper2.motionZ += lllllllllllllIIllIIllIIIIIIlIlll / lllllllllllllIIllIIllIIIIIIlIllI * 0.5 * 0.800000011920929 + this.leaper.motionZ * 0.20000000298023224;
        this.leaper.motionY = this.leapMotionY;
    }
    
    private static int llIlIIIllIIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (llIlIIIllIIlIll(this.leaper.onGround ? 1 : 0)) {
            n = EntityAILeapAtTarget.lIIlIlIlllllll[1];
            "".length();
            if (null != null) {
                return ((157 + 89 - 99 + 65 ^ 60 + 37 - 10 + 95) & (0x92 ^ 0x82 ^ (0x2A ^ 0x58) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAILeapAtTarget.lIIlIlIlllllll[2];
        }
        return n != 0;
    }
    
    private static void llIlIIIllIIIIll() {
        (lIIlIlIlllllll = new int[3])[0] = (53 + 139 - 82 + 36 ^ 138 + 109 - 146 + 50);
        EntityAILeapAtTarget.lIIlIlIlllllll[1] = ((0xEF ^ 0xB2 ^ (0x15 ^ 0x71)) & (0x28 ^ 0x67 ^ (0x47 ^ 0x31) ^ -" ".length()));
        EntityAILeapAtTarget.lIIlIlIlllllll[2] = " ".length();
    }
    
    private static boolean llIlIIIllIIlIII(final int lllllllllllllIIllIIllIIIIIIIlIlI) {
        return lllllllllllllIIllIIllIIIIIIIlIlI >= 0;
    }
    
    private static boolean llIlIIIllIIlIIl(final int lllllllllllllIIllIIllIIIIIIIlIII) {
        return lllllllllllllIIllIIllIIIIIIIlIII <= 0;
    }
    
    private static boolean llIlIIIllIIIlll(final Object lllllllllllllIIllIIllIIIIIIlIIII) {
        return lllllllllllllIIllIIllIIIIIIlIIII == null;
    }
    
    @Override
    public boolean shouldExecute() {
        this.leapTarget = this.leaper.getAttackTarget();
        if (llIlIIIllIIIlll(this.leapTarget)) {
            return EntityAILeapAtTarget.lIIlIlIlllllll[1] != 0;
        }
        final double lllllllllllllIIllIIllIIIIIlIIIll = this.leaper.getDistanceSqToEntity(this.leapTarget);
        int n;
        if (llIlIIIllIIlIII(llIlIIIllIIIlII(lllllllllllllIIllIIllIIIIIlIIIll, 4.0)) && llIlIIIllIIlIIl(llIlIIIllIIIlIl(lllllllllllllIIllIIllIIIIIlIIIll, 16.0))) {
            if (llIlIIIllIIlIlI(this.leaper.onGround ? 1 : 0)) {
                n = EntityAILeapAtTarget.lIIlIlIlllllll[1];
                "".length();
                if (null != null) {
                    return ((83 + 161 - 126 + 122 ^ 16 + 175 - 104 + 99) & (142 + 57 - 140 + 163 ^ 42 + 124 - 112 + 94 ^ -" ".length())) != 0x0;
                }
            }
            else if (llIlIIIllIIlIlI(this.leaper.getRNG().nextInt(EntityAILeapAtTarget.lIIlIlIlllllll[0]))) {
                n = EntityAILeapAtTarget.lIIlIlIlllllll[2];
                "".length();
                if (null != null) {
                    return ((0x6F ^ 0x3D ^ (0x75 ^ 0x14)) & (0x3D ^ 0x70 ^ (0x42 ^ 0x3C) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = EntityAILeapAtTarget.lIIlIlIlllllll[1];
                "".length();
                if (" ".length() == 0) {
                    return ((0x7B ^ 0x4C ^ (0x52 ^ 0x5C)) & (0x3A ^ 0x68 ^ (0xCD ^ 0xA6) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n = EntityAILeapAtTarget.lIIlIlIlllllll[1];
        }
        return n != 0;
    }
    
    private static boolean llIlIIIllIIlIll(final int lllllllllllllIIllIIllIIIIIIIlllI) {
        return lllllllllllllIIllIIllIIIIIIIlllI != 0;
    }
}
