// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.boss;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.Entity;

public class EntityDragonPart extends Entity
{
    public final /* synthetic */ IEntityMultiPart entityDragonObj;
    public final /* synthetic */ String partName;
    private static final /* synthetic */ int[] lIlllIIIIllllI;
    
    @Override
    protected void entityInit() {
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlllllIlllIIlIlIIIIl, final float llllllllllllIlllllIlllIIlIIlllIl) {
        int attackEntityFromPart;
        if (lIIIIIIlIIIIlllI(this.isEntityInvulnerable(llllllllllllIlllllIlllIIlIlIIIIl) ? 1 : 0)) {
            attackEntityFromPart = EntityDragonPart.lIlllIIIIllllI[1];
            "".length();
            if ((0x57 ^ 0x52) == 0x0) {
                return ((0x6D ^ 0x7A) & ~(0x99 ^ 0x8E)) != 0x0;
            }
        }
        else {
            attackEntityFromPart = (this.entityDragonObj.attackEntityFromPart(this, llllllllllllIlllllIlllIIlIlIIIIl, llllllllllllIlllllIlllIIlIIlllIl) ? 1 : 0);
        }
        return attackEntityFromPart != 0;
    }
    
    private static boolean lIIIIIIlIIIIlllI(final int llllllllllllIlllllIlllIIlIIlIIIl) {
        return llllllllllllIlllllIlllIIlIIlIIIl != 0;
    }
    
    @Override
    public boolean isEntityEqual(final Entity llllllllllllIlllllIlllIIlIIlIlll) {
        if (lIIIIIIlIIIIllll(this, llllllllllllIlllllIlllIIlIIlIlll) && lIIIIIIlIIIIllll(this.entityDragonObj, llllllllllllIlllllIlllIIlIIlIlll)) {
            return EntityDragonPart.lIlllIIIIllllI[1] != 0;
        }
        return EntityDragonPart.lIlllIIIIllllI[0] != 0;
    }
    
    private static boolean lIIIIIIlIIIIllll(final Object llllllllllllIlllllIlllIIlIIlIlII, final Object llllllllllllIlllllIlllIIlIIlIIll) {
        return llllllllllllIlllllIlllIIlIIlIlII != llllllllllllIlllllIlllIIlIIlIIll;
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIlllllIlllIIlIlIIlll) {
    }
    
    static {
        lIIIIIIlIIIIllIl();
    }
    
    private static void lIIIIIIlIIIIllIl() {
        (lIlllIIIIllllI = new int[2])[0] = " ".length();
        EntityDragonPart.lIlllIIIIllllI[1] = ((0x1E ^ 0x68 ^ (0x60 ^ 0x39)) & (55 + 92 - 43 + 71 ^ 77 + 89 - 66 + 28 ^ -" ".length()));
    }
    
    public EntityDragonPart(final IEntityMultiPart llllllllllllIlllllIlllIIlIllIlII, final String llllllllllllIlllllIlllIIlIlIlllI, final float llllllllllllIlllllIlllIIlIlIllIl, final float llllllllllllIlllllIlllIIlIllIIIl) {
        super(llllllllllllIlllllIlllIIlIllIlII.getWorld());
        this.setSize(llllllllllllIlllllIlllIIlIlIllIl, llllllllllllIlllllIlllIIlIllIIIl);
        this.entityDragonObj = llllllllllllIlllllIlllIIlIllIlII;
        this.partName = llllllllllllIlllllIlllIIlIlIlllI;
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIlllllIlllIIlIlIlIIl) {
    }
    
    @Override
    public boolean canBeCollidedWith() {
        return EntityDragonPart.lIlllIIIIllllI[0] != 0;
    }
}
