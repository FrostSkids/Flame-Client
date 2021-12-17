// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityCreature;
import com.google.common.base.Predicate;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.EntityLivingBase;

public class EntityAITargetNonTamed<T extends EntityLivingBase> extends EntityAINearestAttackableTarget
{
    private /* synthetic */ EntityTameable theTameable;
    private static final /* synthetic */ int[] lIllIllIIIIIII;
    
    private static boolean lllllllIlIlllll(final int llllllllllllIlllllllIllIIllIlllI) {
        return llllllllllllIlllllllIllIIllIlllI != 0;
    }
    
    private static void lllllllIlIlllIl() {
        (lIllIllIIIIIII = new int[3])[0] = (0x79 ^ 0x73);
        EntityAITargetNonTamed.lIllIllIIIIIII[1] = ((0x8D ^ 0x9E ^ (0xEA ^ 0xC0)) & (0xE7 ^ 0xAA ^ (0xE0 ^ 0x94) ^ -" ".length()));
        EntityAITargetNonTamed.lIllIllIIIIIII[2] = " ".length();
    }
    
    @Override
    public boolean shouldExecute() {
        if (lllllllIlIllllI(this.theTameable.isTamed() ? 1 : 0) && lllllllIlIlllll(super.shouldExecute() ? 1 : 0)) {
            return EntityAITargetNonTamed.lIllIllIIIIIII[2] != 0;
        }
        return EntityAITargetNonTamed.lIllIllIIIIIII[1] != 0;
    }
    
    private static boolean lllllllIlIllllI(final int llllllllllllIlllllllIllIIllIllII) {
        return llllllllllllIlllllllIllIIllIllII == 0;
    }
    
    public EntityAITargetNonTamed(final EntityTameable llllllllllllIlllllllIllIIlllIllI, final Class<T> llllllllllllIlllllllIllIIlllIlIl, final boolean llllllllllllIlllllllIllIIllllIIl, final Predicate<? super T> llllllllllllIlllllllIllIIlllIIll) {
        super(llllllllllllIlllllllIllIIlllIllI, llllllllllllIlllllllIllIIlllIlIl, EntityAITargetNonTamed.lIllIllIIIIIII[0], llllllllllllIlllllllIllIIllllIIl, (boolean)(EntityAITargetNonTamed.lIllIllIIIIIII[1] != 0), llllllllllllIlllllllIllIIlllIIll);
        this.theTameable = llllllllllllIlllllllIllIIlllIllI;
    }
    
    static {
        lllllllIlIlllIl();
    }
}
