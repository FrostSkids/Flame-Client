// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.player.EntityPlayerMP;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.base.Predicate;
import org.apache.logging.log4j.Logger;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving;

public class EntityAIFindEntityNearest extends EntityAIBase
{
    private /* synthetic */ EntityLiving field_179442_b;
    private final /* synthetic */ EntityAINearestAttackableTarget.Sorter field_179440_d;
    private /* synthetic */ EntityLivingBase field_179441_e;
    private static final /* synthetic */ int[] llIIlIIIlllIll;
    private static final /* synthetic */ String[] llIIlIIIlllIlI;
    private static final /* synthetic */ Logger field_179444_a;
    private final /* synthetic */ Predicate<EntityLivingBase> field_179443_c;
    private /* synthetic */ Class<? extends EntityLivingBase> field_179439_f;
    
    protected double func_179438_f() {
        final IAttributeInstance llllllllllllIlllIIlIllIllllllIlI = this.field_179442_b.getEntityAttribute(SharedMonsterAttributes.followRange);
        double attributeValue;
        if (lIIIllIIIIIlllIl(llllllllllllIlllIIlIllIllllllIlI)) {
            attributeValue = 16.0;
            "".length();
            if (null != null) {
                return 0.0;
            }
        }
        else {
            attributeValue = llllllllllllIlllIIlIllIllllllIlI.getAttributeValue();
        }
        return attributeValue;
    }
    
    public EntityAIFindEntityNearest(final EntityLiving llllllllllllIlllIIlIlllIIIIllIlI, final Class<? extends EntityLivingBase> llllllllllllIlllIIlIlllIIIIllIIl) {
        this.field_179442_b = llllllllllllIlllIIlIlllIIIIllIlI;
        this.field_179439_f = llllllllllllIlllIIlIlllIIIIllIIl;
        if (lIIIllIIIIIllIll((llllllllllllIlllIIlIlllIIIIllIlI instanceof EntityCreature) ? 1 : 0)) {
            EntityAIFindEntityNearest.field_179444_a.warn(EntityAIFindEntityNearest.llIIlIIIlllIlI[EntityAIFindEntityNearest.llIIlIIIlllIll[0]]);
        }
        this.field_179443_c = (Predicate<EntityLivingBase>)new Predicate<EntityLivingBase>() {
            private static final /* synthetic */ int[] llIIlIIIIIlIII;
            
            private static boolean lIIIlIlllIIIIlll(final int llllllllllllIlllIIlllIIIIIIIIlIl) {
                return llllllllllllIlllIIlllIIIIIIIIlIl > 0;
            }
            
            static {
                lIIIlIlllIIIIlII();
            }
            
            private static boolean lIIIlIlllIIIIllI(final int llllllllllllIlllIIlllIIIIIIIIlll) {
                return llllllllllllIlllIIlllIIIIIIIIlll != 0;
            }
            
            public boolean apply(final EntityLivingBase llllllllllllIlllIIlllIIIIIIIlllI) {
                double llllllllllllIlllIIlllIIIIIIlIIII = EntityAIFindEntityNearest.this.func_179438_f();
                if (lIIIlIlllIIIIllI(llllllllllllIlllIIlllIIIIIIIlllI.isSneaking() ? 1 : 0)) {
                    llllllllllllIlllIIlllIIIIIIlIIII *= 0.800000011920929;
                }
                int suitableTarget;
                if (lIIIlIlllIIIIllI(llllllllllllIlllIIlllIIIIIIIlllI.isInvisible() ? 1 : 0)) {
                    suitableTarget = EntityAIFindEntityNearest$1.llIIlIIIIIlIII[0];
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x6C ^ 0x32) & ~(0xDC ^ 0x82)) != 0x0;
                    }
                }
                else if (lIIIlIlllIIIIlll(lIIIlIlllIIIIlIl(llllllllllllIlllIIlllIIIIIIIlllI.getDistanceToEntity(EntityAIFindEntityNearest.this.field_179442_b), llllllllllllIlllIIlllIIIIIIlIIII))) {
                    suitableTarget = EntityAIFindEntityNearest$1.llIIlIIIIIlIII[0];
                    "".length();
                    if (((0xFF ^ 0xBE) & ~(0x82 ^ 0xC3)) != 0x0) {
                        return ((0x7C ^ 0x4C) & ~(0x1 ^ 0x31)) != 0x0;
                    }
                }
                else {
                    suitableTarget = (EntityAITarget.isSuitableTarget(EntityAIFindEntityNearest.this.field_179442_b, llllllllllllIlllIIlllIIIIIIIlllI, (boolean)(EntityAIFindEntityNearest$1.llIIlIIIIIlIII[0] != 0), (boolean)(EntityAIFindEntityNearest$1.llIIlIIIIIlIII[1] != 0)) ? 1 : 0);
                }
                return suitableTarget != 0;
            }
            
            private static int lIIIlIlllIIIIlIl(final double n, final double n2) {
                return dcmpl(n, n2);
            }
            
            private static void lIIIlIlllIIIIlII() {
                (llIIlIIIIIlIII = new int[2])[0] = ((0x1F ^ 0x22) & ~(0x98 ^ 0xA5));
                EntityAIFindEntityNearest$1.llIIlIIIIIlIII[1] = " ".length();
            }
        };
        this.field_179440_d = new EntityAINearestAttackableTarget.Sorter(llllllllllllIlllIIlIlllIIIIllIlI);
    }
    
    private static String lIIIllIIIIIlIlll(final String llllllllllllIlllIIlIllIllllIllII, final String llllllllllllIlllIIlIllIllllIllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIllIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIllIllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIllIlllllIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIllIlllllIIII.init(EntityAIFindEntityNearest.llIIlIIIlllIll[2], llllllllllllIlllIIlIllIlllllIIIl);
            return new String(llllllllllllIlllIIlIllIlllllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIllIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIllIllllIllll) {
            llllllllllllIlllIIlIllIllllIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void startExecuting() {
        this.field_179442_b.setAttackTarget(this.field_179441_e);
        super.startExecuting();
    }
    
    private static boolean lIIIllIIIIIllIll(final int llllllllllllIlllIIlIllIllllIIlIl) {
        return llllllllllllIlllIIlIllIllllIIlIl != 0;
    }
    
    private static boolean lIIIllIIIIIlllll(final int llllllllllllIlllIIlIllIllllIIIIl) {
        return llllllllllllIlllIIlIllIllllIIIIl > 0;
    }
    
    private static boolean lIIIllIIIIIlllIl(final Object llllllllllllIlllIIlIllIllllIIlll) {
        return llllllllllllIlllIIlIllIllllIIlll == null;
    }
    
    private static int lIIIllIIIIIlllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lIIIllIIIIIllIII() {
        (llIIlIIIlllIlI = new String[EntityAIFindEntityNearest.llIIlIIIlllIll[1]])[EntityAIFindEntityNearest.llIIlIIIlllIll[0]] = lIIIllIIIIIlIlll("xOnmSao8vtZjEh9q7X1qxsTMIqoA3xt3vHLhaJBYf3ug8QG7FU5Cu0r+EbXTWkygwJQqVsf8u8XoDkRfSeg/ZQ==", "HqmGq");
    }
    
    static {
        lIIIllIIIIIllIIl();
        lIIIllIIIIIllIII();
        field_179444_a = LogManager.getLogger();
    }
    
    @Override
    public void resetTask() {
        this.field_179442_b.setAttackTarget(null);
        super.startExecuting();
    }
    
    private static void lIIIllIIIIIllIIl() {
        (llIIlIIIlllIll = new int[3])[0] = ((0x1E ^ 0x62 ^ (0x1E ^ 0x2D)) & (55 + 10 + 58 + 89 ^ 76 + 35 - 15 + 59 ^ -" ".length()));
        EntityAIFindEntityNearest.llIIlIIIlllIll[1] = " ".length();
        EntityAIFindEntityNearest.llIIlIIIlllIll[2] = "  ".length();
    }
    
    @Override
    public boolean shouldExecute() {
        final double llllllllllllIlllIIlIlllIIIIlIIIl = this.func_179438_f();
        final List<EntityLivingBase> llllllllllllIlllIIlIlllIIIIlIIII = this.field_179442_b.worldObj.getEntitiesWithinAABB(this.field_179439_f, this.field_179442_b.getEntityBoundingBox().expand(llllllllllllIlllIIlIlllIIIIlIIIl, 4.0, llllllllllllIlllIIlIlllIIIIlIIIl), (com.google.common.base.Predicate<? super EntityLivingBase>)this.field_179443_c);
        Collections.sort(llllllllllllIlllIIlIlllIIIIlIIII, this.field_179440_d);
        if (lIIIllIIIIIllIll(llllllllllllIlllIIlIlllIIIIlIIII.isEmpty() ? 1 : 0)) {
            return EntityAIFindEntityNearest.llIIlIIIlllIll[0] != 0;
        }
        this.field_179441_e = llllllllllllIlllIIlIlllIIIIlIIII.get(EntityAIFindEntityNearest.llIIlIIIlllIll[0]);
        return EntityAIFindEntityNearest.llIIlIIIlllIll[1] != 0;
    }
    
    private static boolean lIIIllIIIIIllllI(final int llllllllllllIlllIIlIllIllllIIIll) {
        return llllllllllllIlllIIlIllIllllIIIll == 0;
    }
    
    @Override
    public boolean continueExecuting() {
        final EntityLivingBase llllllllllllIlllIIlIlllIIIIIlIII = this.field_179442_b.getAttackTarget();
        if (lIIIllIIIIIlllIl(llllllllllllIlllIIlIlllIIIIIlIII)) {
            return EntityAIFindEntityNearest.llIIlIIIlllIll[0] != 0;
        }
        if (lIIIllIIIIIllllI(llllllllllllIlllIIlIlllIIIIIlIII.isEntityAlive() ? 1 : 0)) {
            return EntityAIFindEntityNearest.llIIlIIIlllIll[0] != 0;
        }
        final double llllllllllllIlllIIlIlllIIIIIIlll = this.func_179438_f();
        int n;
        if (lIIIllIIIIIlllll(lIIIllIIIIIlllII(this.field_179442_b.getDistanceSqToEntity(llllllllllllIlllIIlIlllIIIIIlIII), llllllllllllIlllIIlIlllIIIIIIlll * llllllllllllIlllIIlIlllIIIIIIlll))) {
            n = EntityAIFindEntityNearest.llIIlIIIlllIll[0];
            "".length();
            if (null != null) {
                return ((0x30 ^ 0x4) & ~(0x34 ^ 0x0)) != 0x0;
            }
        }
        else if (lIIIllIIIIIllIll((llllllllllllIlllIIlIlllIIIIIlIII instanceof EntityPlayerMP) ? 1 : 0) && lIIIllIIIIIllIll(((EntityPlayerMP)llllllllllllIlllIIlIlllIIIIIlIII).theItemInWorldManager.isCreative() ? 1 : 0)) {
            n = EntityAIFindEntityNearest.llIIlIIIlllIll[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x41 ^ 0x36 ^ (0x6A ^ 0x4B)) & (35 + 53 + 14 + 119 ^ 132 + 81 - 211 + 137 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIFindEntityNearest.llIIlIIIlllIll[1];
        }
        return n != 0;
    }
}
