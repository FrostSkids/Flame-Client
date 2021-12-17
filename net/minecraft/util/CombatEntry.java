// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.entity.EntityLivingBase;

public class CombatEntry
{
    private final /* synthetic */ int field_94567_b;
    private final /* synthetic */ String field_94566_e;
    private final /* synthetic */ DamageSource damageSrc;
    private final /* synthetic */ float fallDistance;
    private final /* synthetic */ float damage;
    private final /* synthetic */ float health;
    
    public float func_94563_c() {
        return this.damage;
    }
    
    private static boolean lIllIlIlllllIlI(final Object lllllllllllllIlIIllllIIIlIlllIII) {
        return lllllllllllllIlIIllllIIIlIlllIII == null;
    }
    
    public CombatEntry(final DamageSource lllllllllllllIlIIllllIIIllIlllII, final int lllllllllllllIlIIllllIIIllIlIlII, final float lllllllllllllIlIIllllIIIllIlIIll, final float lllllllllllllIlIIllllIIIllIllIIl, final String lllllllllllllIlIIllllIIIllIllIII, final float lllllllllllllIlIIllllIIIllIlIIII) {
        this.damageSrc = lllllllllllllIlIIllllIIIllIlllII;
        this.field_94567_b = lllllllllllllIlIIllllIIIllIlIlII;
        this.damage = lllllllllllllIlIIllllIIIllIllIIl;
        this.health = lllllllllllllIlIIllllIIIllIlIIll;
        this.field_94566_e = lllllllllllllIlIIllllIIIllIllIII;
        this.fallDistance = lllllllllllllIlIIllllIIIllIlIIII;
    }
    
    public String func_94562_g() {
        return this.field_94566_e;
    }
    
    public float getDamageAmount() {
        float fallDistance;
        if (lIllIlIlllllIll(this.damageSrc, DamageSource.outOfWorld)) {
            fallDistance = Float.MAX_VALUE;
            "".length();
            if (" ".length() <= -" ".length()) {
                return 0.0f;
            }
        }
        else {
            fallDistance = this.fallDistance;
        }
        return fallDistance;
    }
    
    private static boolean lIllIlIlllllIll(final Object lllllllllllllIlIIllllIIIlIlllIll, final Object lllllllllllllIlIIllllIIIlIlllIlI) {
        return lllllllllllllIlIIllllIIIlIlllIll == lllllllllllllIlIIllllIIIlIlllIlI;
    }
    
    public boolean isLivingDamageSrc() {
        return this.damageSrc.getEntity() instanceof EntityLivingBase;
    }
    
    public IChatComponent getDamageSrcDisplayName() {
        IChatComponent displayName;
        if (lIllIlIlllllIlI(this.getDamageSrc().getEntity())) {
            displayName = null;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            displayName = this.getDamageSrc().getEntity().getDisplayName();
        }
        return displayName;
    }
    
    public DamageSource getDamageSrc() {
        return this.damageSrc;
    }
}
