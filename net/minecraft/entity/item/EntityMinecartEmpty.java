// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityMinecartEmpty extends EntityMinecart
{
    private static final /* synthetic */ int[] lllIlllllIllII;
    
    private static boolean lIlIIllIIIlIlllI(final int llllllllllllIlIlIlllllIIIllllIlI) {
        return llllllllllllIlIlIlllllIIIllllIlI == 0;
    }
    
    private static void lIlIIllIIIlIlIlI() {
        (lllIlllllIllII = new int[3])[0] = " ".length();
        EntityMinecartEmpty.lllIlllllIllII[1] = ((0x9D ^ 0x9A) & ~(0x6 ^ 0x1));
        EntityMinecartEmpty.lllIlllllIllII[2] = (0xCE ^ 0xA5 ^ (0xD3 ^ 0xB2));
    }
    
    static {
        lIlIIllIIIlIlIlI();
    }
    
    public EntityMinecartEmpty(final World llllllllllllIlIlIlllllIIlIIlllII, final double llllllllllllIlIlIlllllIIlIIlIllI, final double llllllllllllIlIlIlllllIIlIIlIlIl, final double llllllllllllIlIlIlllllIIlIIlIlII) {
        super(llllllllllllIlIlIlllllIIlIIlllII, llllllllllllIlIlIlllllIIlIIlIllI, llllllllllllIlIlIlllllIIlIIlIlIl, llllllllllllIlIlIlllllIIlIIlIlII);
    }
    
    public EntityMinecartEmpty(final World llllllllllllIlIlIlllllIIlIlIIIll) {
        super(llllllllllllIlIlIlllllIIlIlIIIll);
    }
    
    private static boolean lIlIIllIIIlIllII(final int llllllllllllIlIlIlllllIIIlllllII) {
        return llllllllllllIlIlIlllllIIIlllllII != 0;
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer llllllllllllIlIlIlllllIIlIIlIIII) {
        if (lIlIIllIIIlIlIll(this.riddenByEntity) && lIlIIllIIIlIllII((this.riddenByEntity instanceof EntityPlayer) ? 1 : 0) && lIlIIllIIIlIllIl(this.riddenByEntity, llllllllllllIlIlIlllllIIlIIlIIII)) {
            return EntityMinecartEmpty.lllIlllllIllII[0] != 0;
        }
        if (lIlIIllIIIlIlIll(this.riddenByEntity) && lIlIIllIIIlIllIl(this.riddenByEntity, llllllllllllIlIlIlllllIIlIIlIIII)) {
            return EntityMinecartEmpty.lllIlllllIllII[1] != 0;
        }
        if (lIlIIllIIIlIlllI(this.worldObj.isRemote ? 1 : 0)) {
            llllllllllllIlIlIlllllIIlIIlIIII.mountEntity(this);
        }
        return EntityMinecartEmpty.lllIlllllIllII[0] != 0;
    }
    
    @Override
    public void onActivatorRailPass(final int llllllllllllIlIlIlllllIIlIIIlIlI, final int llllllllllllIlIlIlllllIIlIIIlIIl, final int llllllllllllIlIlIlllllIIlIIIlIII, final boolean llllllllllllIlIlIlllllIIlIIIIlll) {
        if (lIlIIllIIIlIllII(llllllllllllIlIlIlllllIIlIIIIlll ? 1 : 0)) {
            if (lIlIIllIIIlIlIll(this.riddenByEntity)) {
                this.riddenByEntity.mountEntity(null);
            }
            if (lIlIIllIIIlIlllI(this.getRollingAmplitude())) {
                this.setRollingDirection(-this.getRollingDirection());
                this.setRollingAmplitude(EntityMinecartEmpty.lllIlllllIllII[2]);
                this.setDamage(50.0f);
                this.setBeenAttacked();
            }
        }
    }
    
    private static boolean lIlIIllIIIlIllIl(final Object llllllllllllIlIlIlllllIIlIIIIIIl, final Object llllllllllllIlIlIlllllIIlIIIIIII) {
        return llllllllllllIlIlIlllllIIlIIIIIIl != llllllllllllIlIlIlllllIIlIIIIIII;
    }
    
    private static boolean lIlIIllIIIlIlIll(final Object llllllllllllIlIlIlllllIIIllllllI) {
        return llllllllllllIlIlIlllllIIIllllllI != null;
    }
    
    @Override
    public EnumMinecartType getMinecartType() {
        return EnumMinecartType.RIDEABLE;
    }
}
