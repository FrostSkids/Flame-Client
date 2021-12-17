// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import com.google.common.base.Predicates;
import net.minecraft.util.EntitySelectors;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import com.google.common.base.Predicate;
import net.minecraft.entity.EntityLivingBase;

public class EntityAINearestAttackableTarget<T extends EntityLivingBase> extends EntityAITarget
{
    protected final /* synthetic */ Sorter theNearestAttackableTargetSorter;
    protected /* synthetic */ Predicate<? super T> targetEntitySelector;
    protected /* synthetic */ EntityLivingBase targetEntity;
    private final /* synthetic */ int targetChance;
    private static final /* synthetic */ int[] lIlIlllIllIIIl;
    protected final /* synthetic */ Class<T> targetClass;
    
    public EntityAINearestAttackableTarget(final EntityCreature lllllllllllllIIIIlIlIllIlllllIII, final Class<T> lllllllllllllIIIIlIlIllIllllIlll, final boolean lllllllllllllIIIIlIlIllIllllIllI) {
        this(lllllllllllllIIIIlIlIllIlllllIII, lllllllllllllIIIIlIlIllIllllIlll, lllllllllllllIIIIlIlIllIllllIllI, (boolean)(EntityAINearestAttackableTarget.lIlIlllIllIIIl[0] != 0));
    }
    
    private static void llllIlIIIIIIIII() {
        (lIlIlllIllIIIl = new int[3])[0] = ((0x72 ^ 0x25 ^ (0x16 ^ 0x1)) & (0x29 ^ 0x3F ^ (0xD5 ^ 0x83) ^ -" ".length()));
        EntityAINearestAttackableTarget.lIlIlllIllIIIl[1] = (0xBE ^ 0xB4);
        EntityAINearestAttackableTarget.lIlIlllIllIIIl[2] = " ".length();
    }
    
    private static boolean llllIlIIIIIIIlI(final int lllllllllllllIIIIlIlIllIllIIIIII) {
        return lllllllllllllIIIIlIlIllIllIIIIII != 0;
    }
    
    private static boolean llllIlIIIIIIIIl(final int lllllllllllllIIIIlIlIllIlIlllllI) {
        return lllllllllllllIIIIlIlIllIlIlllllI > 0;
    }
    
    @Override
    public void startExecuting() {
        this.taskOwner.setAttackTarget(this.targetEntity);
        super.startExecuting();
    }
    
    public EntityAINearestAttackableTarget(final EntityCreature lllllllllllllIIIIlIlIllIllIlIIll, final Class<T> lllllllllllllIIIIlIlIllIllIllIIl, final int lllllllllllllIIIIlIlIllIllIlIIIl, final boolean lllllllllllllIIIIlIlIllIllIlIIII, final boolean lllllllllllllIIIIlIlIllIllIlIllI, final Predicate<? super T> lllllllllllllIIIIlIlIllIllIlIlIl) {
        super(lllllllllllllIIIIlIlIllIllIlIIll, lllllllllllllIIIIlIlIllIllIlIIII, lllllllllllllIIIIlIlIllIllIlIllI);
        this.targetClass = lllllllllllllIIIIlIlIllIllIllIIl;
        this.targetChance = lllllllllllllIIIIlIlIllIllIlIIIl;
        this.theNearestAttackableTargetSorter = new Sorter(lllllllllllllIIIIlIlIllIllIlIIll);
        this.setMutexBits(EntityAINearestAttackableTarget.lIlIlllIllIIIl[2]);
        this.targetEntitySelector = (Predicate<? super T>)new Predicate<T>() {
            private static final /* synthetic */ int[] lIIlIlIIlIlIII;
            
            private static int llIIllllllIIllI(final double n, final double n2) {
                return dcmpl(n, n2);
            }
            
            private static int llIIllllllIIlIl(final float n, final float n2) {
                return fcmpg(n, n2);
            }
            
            private static boolean llIIllllllIIlll(final Object lllllllllllllIIllIlIIlIIlllllIIl) {
                return lllllllllllllIIllIlIIlIIlllllIIl != null;
            }
            
            private static boolean llIIllllllIlIlI(final int lllllllllllllIIllIlIIlIIllllIIll) {
                return lllllllllllllIIllIlIIlIIllllIIll < 0;
            }
            
            private static boolean llIIllllllIlIII(final int lllllllllllllIIllIlIIlIIllllIlIl) {
                return lllllllllllllIIllIlIIlIIllllIlIl == 0;
            }
            
            private static boolean llIIllllllIlIIl(final int lllllllllllllIIllIlIIlIIllllIlll) {
                return lllllllllllllIIllIlIIlIIllllIlll != 0;
            }
            
            private static boolean llIIllllllIlIll(final int lllllllllllllIIllIlIIlIIllllIIIl) {
                return lllllllllllllIIllIlIIlIIllllIIIl > 0;
            }
            
            public boolean apply(final T lllllllllllllIIllIlIIlIlIIIIIIIl) {
                if (llIIllllllIIlll(lllllllllllllIIIIlIlIllIllIlIlIl) && llIIllllllIlIII(lllllllllllllIIIIlIlIllIllIlIlIl.apply((Object)lllllllllllllIIllIlIIlIlIIIIIIIl) ? 1 : 0)) {
                    return EntityAINearestAttackableTarget$1.lIIlIlIIlIlIII[0] != 0;
                }
                if (llIIllllllIlIIl((lllllllllllllIIllIlIIlIlIIIIIIIl instanceof EntityPlayer) ? 1 : 0)) {
                    double lllllllllllllIIllIlIIlIlIIIIIlII = EntityAINearestAttackableTarget.this.getTargetDistance();
                    if (llIIllllllIlIIl(lllllllllllllIIllIlIIlIlIIIIIIIl.isSneaking() ? 1 : 0)) {
                        lllllllllllllIIllIlIIlIlIIIIIlII *= 0.800000011920929;
                    }
                    if (llIIllllllIlIIl(lllllllllllllIIllIlIIlIlIIIIIIIl.isInvisible() ? 1 : 0)) {
                        float lllllllllllllIIllIlIIlIlIIIIIIll = ((EntityPlayer)lllllllllllllIIllIlIIlIlIIIIIIIl).getArmorVisibility();
                        if (llIIllllllIlIlI(llIIllllllIIlIl(lllllllllllllIIllIlIIlIlIIIIIIll, 0.1f))) {
                            lllllllllllllIIllIlIIlIlIIIIIIll = 0.1f;
                        }
                        lllllllllllllIIllIlIIlIlIIIIIlII *= 0.7f * lllllllllllllIIllIlIIlIlIIIIIIll;
                    }
                    if (llIIllllllIlIll(llIIllllllIIllI(lllllllllllllIIllIlIIlIlIIIIIIIl.getDistanceToEntity(EntityAINearestAttackableTarget.this.taskOwner), lllllllllllllIIllIlIIlIlIIIIIlII))) {
                        return EntityAINearestAttackableTarget$1.lIIlIlIIlIlIII[0] != 0;
                    }
                }
                return EntityAINearestAttackableTarget.this.isSuitableTarget(lllllllllllllIIllIlIIlIlIIIIIIIl, (boolean)(EntityAINearestAttackableTarget$1.lIIlIlIIlIlIII[0] != 0));
            }
            
            static {
                llIIllllllIIlII();
            }
            
            private static void llIIllllllIIlII() {
                (lIIlIlIIlIlIII = new int[1])[0] = ((186 + 156 - 194 + 89 ^ 159 + 104 - 257 + 172) & (0x77 ^ 0x3B ^ (0x75 ^ 0x66) ^ -" ".length()));
            }
        };
    }
    
    static {
        llllIlIIIIIIIII();
    }
    
    @Override
    public boolean shouldExecute() {
        if (llllIlIIIIIIIIl(this.targetChance) && llllIlIIIIIIIlI(this.taskOwner.getRNG().nextInt(this.targetChance))) {
            return EntityAINearestAttackableTarget.lIlIlllIllIIIl[0] != 0;
        }
        final double lllllllllllllIIIIlIlIllIllIIlIIl = this.getTargetDistance();
        final List<T> lllllllllllllIIIIlIlIllIllIIlIII = this.taskOwner.worldObj.getEntitiesWithinAABB((Class<? extends T>)this.targetClass, this.taskOwner.getEntityBoundingBox().expand(lllllllllllllIIIIlIlIllIllIIlIIl, 4.0, lllllllllllllIIIIlIlIllIllIIlIIl), (com.google.common.base.Predicate<? super T>)Predicates.and((Predicate)this.targetEntitySelector, (Predicate)EntitySelectors.NOT_SPECTATING));
        Collections.sort(lllllllllllllIIIIlIlIllIllIIlIII, this.theNearestAttackableTargetSorter);
        if (llllIlIIIIIIIlI(lllllllllllllIIIIlIlIllIllIIlIII.isEmpty() ? 1 : 0)) {
            return EntityAINearestAttackableTarget.lIlIlllIllIIIl[0] != 0;
        }
        this.targetEntity = lllllllllllllIIIIlIlIllIllIIlIII.get(EntityAINearestAttackableTarget.lIlIlllIllIIIl[0]);
        return EntityAINearestAttackableTarget.lIlIlllIllIIIl[2] != 0;
    }
    
    public EntityAINearestAttackableTarget(final EntityCreature lllllllllllllIIIIlIlIllIlllIIllI, final Class<T> lllllllllllllIIIIlIlIllIlllIlIlI, final boolean lllllllllllllIIIIlIlIllIlllIlIIl, final boolean lllllllllllllIIIIlIlIllIlllIIIll) {
        this(lllllllllllllIIIIlIlIllIlllIIllI, lllllllllllllIIIIlIlIllIlllIlIlI, EntityAINearestAttackableTarget.lIlIlllIllIIIl[1], lllllllllllllIIIIlIlIllIlllIlIIl, lllllllllllllIIIIlIlIllIlllIIIll, null);
    }
    
    public static class Sorter implements Comparator<Entity>
    {
        private static final /* synthetic */ int[] lllIIlIIIlIIIl;
        private final /* synthetic */ Entity theEntity;
        
        private static boolean lIIllllIllIllIII(final int llllllllllllIlIlllllIIlllIIllllI) {
            return llllllllllllIlIlllllIIlllIIllllI > 0;
        }
        
        private static int lIIllllIllIlIlIl(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        static {
            lIIllllIllIlIlII();
        }
        
        public Sorter(final Entity llllllllllllIlIlllllIIlllIllIlll) {
            this.theEntity = llllllllllllIlIlllllIIlllIllIlll;
        }
        
        private static void lIIllllIllIlIlII() {
            (lllIIlIIIlIIIl = new int[3])[0] = -" ".length();
            Sorter.lllIIlIIIlIIIl[1] = " ".length();
            Sorter.lllIIlIIIlIIIl[2] = ((0x49 ^ 0x17 ^ (0x54 ^ 0x3A)) & (0x36 ^ 0x47 ^ (0xF5 ^ 0xB4) ^ -" ".length()));
        }
        
        @Override
        public int compare(final Entity llllllllllllIlIlllllIIlllIlIlIll, final Entity llllllllllllIlIlllllIIlllIlIlIlI) {
            final double llllllllllllIlIlllllIIlllIlIlllI = this.theEntity.getDistanceSqToEntity(llllllllllllIlIlllllIIlllIlIlIll);
            final double llllllllllllIlIlllllIIlllIlIllIl = this.theEntity.getDistanceSqToEntity(llllllllllllIlIlllllIIlllIlIlIlI);
            int n;
            if (lIIllllIllIlIlll(lIIllllIllIlIlIl(llllllllllllIlIlllllIIlllIlIlllI, llllllllllllIlIlllllIIlllIlIllIl))) {
                n = Sorter.lllIIlIIIlIIIl[0];
                "".length();
                if ("   ".length() == "  ".length()) {
                    return (0x60 ^ 0x33) & ~(0x5 ^ 0x56);
                }
            }
            else if (lIIllllIllIllIII(lIIllllIllIlIllI(llllllllllllIlIlllllIIlllIlIlllI, llllllllllllIlIlllllIIlllIlIllIl))) {
                n = Sorter.lllIIlIIIlIIIl[1];
                "".length();
                if ("   ".length() == -" ".length()) {
                    return (126 + 14 - 64 + 77 ^ 30 + 89 - 40 + 65) & (0x21 ^ 0x50 ^ (0x72 ^ 0xA) ^ -" ".length());
                }
            }
            else {
                n = Sorter.lllIIlIIIlIIIl[2];
            }
            return n;
        }
        
        private static int lIIllllIllIlIllI(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        private static boolean lIIllllIllIlIlll(final int llllllllllllIlIlllllIIlllIlIIIII) {
            return llllllllllllIlIlllllIIlllIlIIIII < 0;
        }
    }
}
