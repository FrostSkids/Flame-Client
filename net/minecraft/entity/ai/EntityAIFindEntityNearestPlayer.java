// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.SharedMonsterAttributes;
import org.apache.logging.log4j.LogManager;
import net.minecraft.entity.EntityCreature;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.scoreboard.Team;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import com.google.common.base.Predicate;
import org.apache.logging.log4j.Logger;

public class EntityAIFindEntityNearestPlayer extends EntityAIBase
{
    private static final /* synthetic */ String[] llllIIIlIIIll;
    private static final /* synthetic */ Logger field_179436_a;
    private final /* synthetic */ Predicate<Entity> field_179435_c;
    private static final /* synthetic */ int[] llllIIIlIIllI;
    private /* synthetic */ EntityLivingBase field_179433_e;
    private /* synthetic */ EntityLiving field_179434_b;
    private final /* synthetic */ EntityAINearestAttackableTarget.Sorter field_179432_d;
    
    private static boolean lIlIIlllIlllIlI(final int lllllllllllllIlIllllIIlIlIIIIIII) {
        return lllllllllllllIlIllllIIlIlIIIIIII == 0;
    }
    
    private static boolean lIlIIlllIlllIll(final Object lllllllllllllIlIllllIIlIlIIIlIlI) {
        return lllllllllllllIlIllllIIlIlIIIlIlI != null;
    }
    
    private static boolean lIlIIlllIllIlll(final int lllllllllllllIlIllllIIlIlIIIIIlI) {
        return lllllllllllllIlIllllIIlIlIIIIIlI != 0;
    }
    
    private static boolean lIlIIlllIllllIl(final int lllllllllllllIlIllllIIlIIllllllI) {
        return lllllllllllllIlIllllIIlIIllllllI > 0;
    }
    
    @Override
    public boolean shouldExecute() {
        final double lllllllllllllIlIllllIIlIlIlllIlI = this.func_179431_f();
        final List<EntityPlayer> lllllllllllllIlIllllIIlIlIlllIIl = this.field_179434_b.worldObj.getEntitiesWithinAABB((Class<? extends EntityPlayer>)EntityPlayer.class, this.field_179434_b.getEntityBoundingBox().expand(lllllllllllllIlIllllIIlIlIlllIlI, 4.0, lllllllllllllIlIllllIIlIlIlllIlI), (com.google.common.base.Predicate<? super EntityPlayer>)this.field_179435_c);
        Collections.sort(lllllllllllllIlIllllIIlIlIlllIIl, this.field_179432_d);
        if (lIlIIlllIllIlll(lllllllllllllIlIllllIIlIlIlllIIl.isEmpty() ? 1 : 0)) {
            return EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0] != 0;
        }
        this.field_179433_e = lllllllllllllIlIllllIIlIlIlllIIl.get(EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0]);
        return EntityAIFindEntityNearestPlayer.llllIIIlIIllI[1] != 0;
    }
    
    private static void lIlIIlllIllIIll() {
        (llllIIIlIIIll = new String[EntityAIFindEntityNearestPlayer.llllIIIlIIllI[1]])[EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0]] = lIlIIlllIllIIlI("rQbDw4AdedGfkpVW4lgB/s63tPjnGVgZsTY/Hx3vyC1i//yLWalB5muIDoU9IqZfmn/jG5mNCVlhbaix5gMYeA==", "hIPkA");
    }
    
    @Override
    public void resetTask() {
        this.field_179434_b.setAttackTarget(null);
        super.startExecuting();
    }
    
    @Override
    public boolean continueExecuting() {
        final EntityLivingBase lllllllllllllIlIllllIIlIlIlIllll = this.field_179434_b.getAttackTarget();
        if (lIlIIlllIlllIIl(lllllllllllllIlIllllIIlIlIlIllll)) {
            return EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0] != 0;
        }
        if (lIlIIlllIlllIlI(lllllllllllllIlIllllIIlIlIlIllll.isEntityAlive() ? 1 : 0)) {
            return EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0] != 0;
        }
        if (lIlIIlllIllIlll((lllllllllllllIlIllllIIlIlIlIllll instanceof EntityPlayer) ? 1 : 0) && lIlIIlllIllIlll(((EntityPlayer)lllllllllllllIlIllllIIlIlIlIllll).capabilities.disableDamage ? 1 : 0)) {
            return EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0] != 0;
        }
        final Team lllllllllllllIlIllllIIlIlIlIlllI = this.field_179434_b.getTeam();
        final Team lllllllllllllIlIllllIIlIlIlIllIl = lllllllllllllIlIllllIIlIlIlIllll.getTeam();
        if (lIlIIlllIlllIll(lllllllllllllIlIllllIIlIlIlIlllI) && lIlIIlllIllllII(lllllllllllllIlIllllIIlIlIlIllIl, lllllllllllllIlIllllIIlIlIlIlllI)) {
            return EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0] != 0;
        }
        final double lllllllllllllIlIllllIIlIlIlIllII = this.func_179431_f();
        int n;
        if (lIlIIlllIllllIl(lIlIIlllIlllIII(this.field_179434_b.getDistanceSqToEntity(lllllllllllllIlIllllIIlIlIlIllll), lllllllllllllIlIllllIIlIlIlIllII * lllllllllllllIlIllllIIlIlIlIllII))) {
            n = EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0];
            "".length();
            if (" ".length() == 0) {
                return ((0x82 ^ 0xB3 ^ (0x53 ^ 0x69)) & (0x98 ^ 0x8B ^ (0x90 ^ 0x88) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIlllIllIlll((lllllllllllllIlIllllIIlIlIlIllll instanceof EntityPlayerMP) ? 1 : 0) && lIlIIlllIllIlll(((EntityPlayerMP)lllllllllllllIlIllllIIlIlIlIllll).theItemInWorldManager.isCreative() ? 1 : 0)) {
            n = EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0];
            "".length();
            if (-" ".length() > 0) {
                return ((0xE2 ^ 0x88 ^ (0xA5 ^ 0x9B)) & (0x79 ^ 0x69 ^ (0xC2 ^ 0x86) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIFindEntityNearestPlayer.llllIIIlIIllI[1];
        }
        return n != 0;
    }
    
    private static String lIlIIlllIllIIlI(final String lllllllllllllIlIllllIIlIlIIlIIIl, final String lllllllllllllIlIllllIIlIlIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIIlIlIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIlIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllllIIlIlIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllllIIlIlIIlIIll.init(EntityAIFindEntityNearestPlayer.llllIIIlIIllI[2], lllllllllllllIlIllllIIlIlIIlIlII);
            return new String(lllllllllllllIlIllllIIlIlIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIIlIlIIlIIlI) {
            lllllllllllllIlIllllIIlIlIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    public EntityAIFindEntityNearestPlayer(final EntityLiving lllllllllllllIlIllllIIlIllIIIIIl) {
        this.field_179434_b = lllllllllllllIlIllllIIlIllIIIIIl;
        if (lIlIIlllIllIlll((lllllllllllllIlIllllIIlIllIIIIIl instanceof EntityCreature) ? 1 : 0)) {
            EntityAIFindEntityNearestPlayer.field_179436_a.warn(EntityAIFindEntityNearestPlayer.llllIIIlIIIll[EntityAIFindEntityNearestPlayer.llllIIIlIIllI[0]]);
        }
        this.field_179435_c = (Predicate<Entity>)new Predicate<Entity>() {
            private static final /* synthetic */ int[] lllIIlIIlIIlIl;
            
            static {
                lIIlllllIIlIIlIl();
            }
            
            private static int lIIlllllIIlIIlll(final double n, final double n2) {
                return dcmpl(n, n2);
            }
            
            private static boolean lIIlllllIIlIlIlI(final int llllllllllllIlIllllIllllIIIllIII) {
                return llllllllllllIlIllllIllllIIIllIII < 0;
            }
            
            private static int lIIlllllIIlIIllI(final float n, final float n2) {
                return fcmpg(n, n2);
            }
            
            private static boolean lIIlllllIIlIlIll(final int llllllllllllIlIllllIllllIIIlIllI) {
                return llllllllllllIlIllllIllllIIIlIllI > 0;
            }
            
            private static boolean lIIlllllIIlIlIII(final int llllllllllllIlIllllIllllIIIllIlI) {
                return llllllllllllIlIllllIllllIIIllIlI == 0;
            }
            
            public boolean apply(final Entity llllllllllllIlIllllIllllIIlIIlII) {
                if (lIIlllllIIlIlIII((llllllllllllIlIllllIllllIIlIIlII instanceof EntityPlayer) ? 1 : 0)) {
                    return EntityAIFindEntityNearestPlayer$1.lllIIlIIlIIlIl[0] != 0;
                }
                if (lIIlllllIIlIlIIl(((EntityPlayer)llllllllllllIlIllllIllllIIlIIlII).capabilities.disableDamage ? 1 : 0)) {
                    return EntityAIFindEntityNearestPlayer$1.lllIIlIIlIIlIl[0] != 0;
                }
                double llllllllllllIlIllllIllllIIlIIlll = EntityAIFindEntityNearestPlayer.this.func_179431_f();
                if (lIIlllllIIlIlIIl(llllllllllllIlIllllIllllIIlIIlII.isSneaking() ? 1 : 0)) {
                    llllllllllllIlIllllIllllIIlIIlll *= 0.800000011920929;
                }
                if (lIIlllllIIlIlIIl(llllllllllllIlIllllIllllIIlIIlII.isInvisible() ? 1 : 0)) {
                    float llllllllllllIlIllllIllllIIlIIllI = ((EntityPlayer)llllllllllllIlIllllIllllIIlIIlII).getArmorVisibility();
                    if (lIIlllllIIlIlIlI(lIIlllllIIlIIllI(llllllllllllIlIllllIllllIIlIIllI, 0.1f))) {
                        llllllllllllIlIllllIllllIIlIIllI = 0.1f;
                    }
                    llllllllllllIlIllllIllllIIlIIlll *= 0.7f * llllllllllllIlIllllIllllIIlIIllI;
                }
                int suitableTarget;
                if (lIIlllllIIlIlIll(lIIlllllIIlIIlll(llllllllllllIlIllllIllllIIlIIlII.getDistanceToEntity(EntityAIFindEntityNearestPlayer.this.field_179434_b), llllllllllllIlIllllIllllIIlIIlll))) {
                    suitableTarget = EntityAIFindEntityNearestPlayer$1.lllIIlIIlIIlIl[0];
                    "".length();
                    if (null != null) {
                        return ((0x34 ^ 0x3B) & ~(0xBB ^ 0xB4)) != 0x0;
                    }
                }
                else {
                    suitableTarget = (EntityAITarget.isSuitableTarget(EntityAIFindEntityNearestPlayer.this.field_179434_b, (EntityLivingBase)llllllllllllIlIllllIllllIIlIIlII, (boolean)(EntityAIFindEntityNearestPlayer$1.lllIIlIIlIIlIl[0] != 0), (boolean)(EntityAIFindEntityNearestPlayer$1.lllIIlIIlIIlIl[1] != 0)) ? 1 : 0);
                }
                return suitableTarget != 0;
            }
            
            private static void lIIlllllIIlIIlIl() {
                (lllIIlIIlIIlIl = new int[2])[0] = ((107 + 72 - 114 + 83 ^ 5 + 141 - 67 + 76) & (0x74 ^ 0x5D ^ (0x30 ^ 0x16) ^ -" ".length()));
                EntityAIFindEntityNearestPlayer$1.lllIIlIIlIIlIl[1] = " ".length();
            }
            
            private static boolean lIIlllllIIlIlIIl(final int llllllllllllIlIllllIllllIIIlllII) {
                return llllllllllllIlIllllIllllIIIlllII != 0;
            }
        };
        this.field_179432_d = new EntityAINearestAttackableTarget.Sorter(lllllllllllllIlIllllIIlIllIIIIIl);
    }
    
    private static boolean lIlIIlllIlllIIl(final Object lllllllllllllIlIllllIIlIlIIIIlII) {
        return lllllllllllllIlIllllIIlIlIIIIlII == null;
    }
    
    private static int lIlIIlllIlllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIIlllIllllII(final Object lllllllllllllIlIllllIIlIlIIIIlll, final Object lllllllllllllIlIllllIIlIlIIIIllI) {
        return lllllllllllllIlIllllIIlIlIIIIlll == lllllllllllllIlIllllIIlIlIIIIllI;
    }
    
    static {
        lIlIIlllIllIllI();
        lIlIIlllIllIIll();
        field_179436_a = LogManager.getLogger();
    }
    
    protected double func_179431_f() {
        final IAttributeInstance lllllllllllllIlIllllIIlIlIIlllIl = this.field_179434_b.getEntityAttribute(SharedMonsterAttributes.followRange);
        double attributeValue;
        if (lIlIIlllIlllIIl(lllllllllllllIlIllllIIlIlIIlllIl)) {
            attributeValue = 16.0;
            "".length();
            if ("   ".length() < 0) {
                return 0.0;
            }
        }
        else {
            attributeValue = lllllllllllllIlIllllIIlIlIIlllIl.getAttributeValue();
        }
        return attributeValue;
    }
    
    private static void lIlIIlllIllIllI() {
        (llllIIIlIIllI = new int[3])[0] = ((0x19 ^ 0x1C) & ~(0x34 ^ 0x31));
        EntityAIFindEntityNearestPlayer.llllIIIlIIllI[1] = " ".length();
        EntityAIFindEntityNearestPlayer.llllIIIlIIllI[2] = "  ".length();
    }
    
    @Override
    public void startExecuting() {
        this.field_179434_b.setAttackTarget(this.field_179433_e);
        super.startExecuting();
    }
}
