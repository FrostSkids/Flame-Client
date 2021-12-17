// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.EntityLiving;

public class EntityAIArrowAttack extends EntityAIBase
{
    private /* synthetic */ float maxAttackDistance;
    private /* synthetic */ float field_96562_i;
    private static final /* synthetic */ int[] lIIlIIlIllIIlI;
    private static final /* synthetic */ String[] lIIlIIlIllIIII;
    private /* synthetic */ int rangedAttackTime;
    private /* synthetic */ int field_75318_f;
    private final /* synthetic */ EntityLiving entityHost;
    private /* synthetic */ int field_96561_g;
    private /* synthetic */ int maxRangedAttackTime;
    private final /* synthetic */ IRangedAttackMob rangedAttackEntityHost;
    private /* synthetic */ double entityMoveSpeed;
    private /* synthetic */ EntityLivingBase attackTarget;
    
    private static boolean llIIllIlIlIIlII(final int lllllllllllllIIllIlllIIIllIIIlIl) {
        return lllllllllllllIIllIlllIIIllIIIlIl == 0;
    }
    
    private static int llIIllIlIlIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityAIArrowAttack(final IRangedAttackMob lllllllllllllIIllIlllIIlIIIIIIlI, final double lllllllllllllIIllIlllIIIlllllIll, final int lllllllllllllIIllIlllIIIlllllIlI, final int lllllllllllllIIllIlllIIIlllllIIl, final float lllllllllllllIIllIlllIIIlllllIII) {
        this.rangedAttackTime = EntityAIArrowAttack.lIIlIIlIllIIlI[0];
        if (llIIllIlIlIIlII((lllllllllllllIIllIlllIIlIIIIIIlI instanceof EntityLivingBase) ? 1 : 0)) {
            throw new IllegalArgumentException(EntityAIArrowAttack.lIIlIIlIllIIII[EntityAIArrowAttack.lIIlIIlIllIIlI[1]]);
        }
        this.rangedAttackEntityHost = lllllllllllllIIllIlllIIlIIIIIIlI;
        this.entityHost = (EntityLiving)lllllllllllllIIllIlllIIlIIIIIIlI;
        this.entityMoveSpeed = lllllllllllllIIllIlllIIIlllllIll;
        this.field_96561_g = lllllllllllllIIllIlllIIIlllllIlI;
        this.maxRangedAttackTime = lllllllllllllIIllIlllIIIlllllIIl;
        this.field_96562_i = lllllllllllllIIllIlllIIIlllllIII;
        this.maxAttackDistance = lllllllllllllIIllIlllIIIlllllIII * lllllllllllllIIllIlllIIIlllllIII;
        this.setMutexBits(EntityAIArrowAttack.lIIlIIlIllIIlI[2]);
    }
    
    @Override
    public void resetTask() {
        this.attackTarget = null;
        this.field_75318_f = EntityAIArrowAttack.lIIlIIlIllIIlI[1];
        this.rangedAttackTime = EntityAIArrowAttack.lIIlIIlIllIIlI[0];
    }
    
    private static boolean llIIllIlIlIIllI(final int lllllllllllllIIllIlllIIIllIIIlll) {
        return lllllllllllllIIllIlllIIIllIIIlll != 0;
    }
    
    private static boolean llIIllIlIlIlIlI(final int lllllllllllllIIllIlllIIIllIIllII, final int lllllllllllllIIllIlllIIIllIIlIll) {
        return lllllllllllllIIllIlllIIIllIIllII >= lllllllllllllIIllIlllIIIllIIlIll;
    }
    
    private static int llIIllIlIlIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void updateTask() {
        final double lllllllllllllIIllIlllIIIlllIIlIl = this.entityHost.getDistanceSq(this.attackTarget.posX, this.attackTarget.getEntityBoundingBox().minY, this.attackTarget.posZ);
        final boolean lllllllllllllIIllIlllIIIlllIIlII = this.entityHost.getEntitySenses().canSee(this.attackTarget);
        if (llIIllIlIlIIllI(lllllllllllllIIllIlllIIIlllIIlII ? 1 : 0)) {
            this.field_75318_f += EntityAIArrowAttack.lIIlIIlIllIIlI[3];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            this.field_75318_f = EntityAIArrowAttack.lIIlIIlIllIIlI[1];
        }
        if (llIIllIlIlIlIIl(llIIllIlIlIIlll(lllllllllllllIIllIlllIIIlllIIlIl, this.maxAttackDistance)) && llIIllIlIlIlIlI(this.field_75318_f, EntityAIArrowAttack.lIIlIIlIllIIlI[4])) {
            this.entityHost.getNavigator().clearPathEntity();
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        else {
            this.entityHost.getNavigator().tryMoveToEntityLiving(this.attackTarget, this.entityMoveSpeed);
            "".length();
        }
        this.entityHost.getLookHelper().setLookPositionWithEntity(this.attackTarget, 30.0f, 30.0f);
        final int n = this.rangedAttackTime - EntityAIArrowAttack.lIIlIIlIllIIlI[3];
        this.rangedAttackTime = n;
        if (llIIllIlIlIIlII(n)) {
            if (!llIIllIlIlIlIIl(llIIllIlIlIlIII(lllllllllllllIIllIlllIIIlllIIlIl, this.maxAttackDistance)) || llIIllIlIlIIlII(lllllllllllllIIllIlllIIIlllIIlII ? 1 : 0)) {
                return;
            }
            final float lllllllllllllIIllIlllIIIlllIIIll = MathHelper.sqrt_double(lllllllllllllIIllIlllIIIlllIIlIl) / this.field_96562_i;
            final float lllllllllllllIIllIlllIIIlllIIIlI = MathHelper.clamp_float(lllllllllllllIIllIlllIIIlllIIIll, 0.1f, 1.0f);
            this.rangedAttackEntityHost.attackEntityWithRangedAttack(this.attackTarget, lllllllllllllIIllIlllIIIlllIIIlI);
            this.rangedAttackTime = MathHelper.floor_float(lllllllllllllIIllIlllIIIlllIIIll * (this.maxRangedAttackTime - this.field_96561_g) + this.field_96561_g);
            "".length();
            if (((11 + 44 - 24 + 186 ^ 66 + 37 - 42 + 76) & (0x99 ^ 0x92 ^ (0x2 ^ 0x59) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llIIllIlIlIlIll(this.rangedAttackTime)) {
            final float lllllllllllllIIllIlllIIIlllIIIIl = MathHelper.sqrt_double(lllllllllllllIIllIlllIIIlllIIlIl) / this.field_96562_i;
            this.rangedAttackTime = MathHelper.floor_float(lllllllllllllIIllIlllIIIlllIIIIl * (this.maxRangedAttackTime - this.field_96561_g) + this.field_96561_g);
        }
    }
    
    private static void llIIllIlIlIIIII() {
        (lIIlIIlIllIIII = new String[EntityAIArrowAttack.lIIlIIlIllIIlI[3]])[EntityAIArrowAttack.lIIlIIlIllIIlI[1]] = llIIllIlIIlllll("hYZGVVvlkVFCmd6CuGuiP/ZViqY+rybmCK9Fz748+/pmqfpjqyjTDq33TqwHCfvMsLcGjl7p+Xs=", "WGmFg");
    }
    
    @Override
    public boolean continueExecuting() {
        if (llIIllIlIlIIlII(this.shouldExecute() ? 1 : 0) && llIIllIlIlIIllI(this.entityHost.getNavigator().noPath() ? 1 : 0)) {
            return EntityAIArrowAttack.lIIlIIlIllIIlI[1] != 0;
        }
        return EntityAIArrowAttack.lIIlIIlIllIIlI[3] != 0;
    }
    
    private static boolean llIIllIlIlIlIIl(final int lllllllllllllIIllIlllIIIllIIIIIl) {
        return lllllllllllllIIllIlllIIIllIIIIIl <= 0;
    }
    
    static {
        llIIllIlIlIIIll();
        llIIllIlIlIIIII();
    }
    
    private static boolean llIIllIlIlIIlIl(final Object lllllllllllllIIllIlllIIIllIIlIIl) {
        return lllllllllllllIIllIlllIIIllIIlIIl == null;
    }
    
    @Override
    public boolean shouldExecute() {
        final EntityLivingBase lllllllllllllIIllIlllIIIllllIlII = this.entityHost.getAttackTarget();
        if (llIIllIlIlIIlIl(lllllllllllllIIllIlllIIIllllIlII)) {
            return EntityAIArrowAttack.lIIlIIlIllIIlI[1] != 0;
        }
        this.attackTarget = lllllllllllllIIllIlllIIIllllIlII;
        return EntityAIArrowAttack.lIIlIIlIllIIlI[3] != 0;
    }
    
    private static boolean llIIllIlIlIlIll(final int lllllllllllllIIllIlllIIIllIIIIll) {
        return lllllllllllllIIllIlllIIIllIIIIll < 0;
    }
    
    private static void llIIllIlIlIIIll() {
        (lIIlIIlIllIIlI = new int[6])[0] = -" ".length();
        EntityAIArrowAttack.lIIlIIlIllIIlI[1] = ((0x3E ^ 0x36) & ~(0x56 ^ 0x5E));
        EntityAIArrowAttack.lIIlIIlIllIIlI[2] = "   ".length();
        EntityAIArrowAttack.lIIlIIlIllIIlI[3] = " ".length();
        EntityAIArrowAttack.lIIlIIlIllIIlI[4] = (0xA5 ^ 0xB1);
        EntityAIArrowAttack.lIIlIIlIllIIlI[5] = "  ".length();
    }
    
    private static String llIIllIlIIlllll(final String lllllllllllllIIllIlllIIIllIlIlII, final String lllllllllllllIIllIlllIIIllIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllIIIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlllIIIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlllIIIllIlIllI.init(EntityAIArrowAttack.lIIlIIlIllIIlI[5], lllllllllllllIIllIlllIIIllIlIlll);
            return new String(lllllllllllllIIllIlllIIIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllIIIllIlIlIl) {
            lllllllllllllIIllIlllIIIllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public EntityAIArrowAttack(final IRangedAttackMob lllllllllllllIIllIlllIIlIIIlIIlI, final double lllllllllllllIIllIlllIIlIIIlIIIl, final int lllllllllllllIIllIlllIIlIIIlIIII, final float lllllllllllllIIllIlllIIlIIIIllll) {
        this(lllllllllllllIIllIlllIIlIIIlIIlI, lllllllllllllIIllIlllIIlIIIlIIIl, lllllllllllllIIllIlllIIlIIIlIIII, lllllllllllllIIllIlllIIlIIIlIIII, lllllllllllllIIllIlllIIlIIIIllll);
    }
}
