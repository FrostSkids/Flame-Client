// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLiving;

public abstract class EntityAmbientCreature extends EntityLiving implements IAnimals
{
    private static final /* synthetic */ int[] lIlIIIIIIIIIII;
    
    static {
        llIllllllllIIll();
    }
    
    @Override
    protected boolean interact(final EntityPlayer lllllllllllllIIlIIIlIlIlllIIlIlI) {
        return EntityAmbientCreature.lIlIIIIIIIIIII[0] != 0;
    }
    
    @Override
    public boolean allowLeashing() {
        return EntityAmbientCreature.lIlIIIIIIIIIII[0] != 0;
    }
    
    private static void llIllllllllIIll() {
        (lIlIIIIIIIIIII = new int[1])[0] = ((0xA5 ^ 0xAF) & ~(0x92 ^ 0x98));
    }
    
    public EntityAmbientCreature(final World lllllllllllllIIlIIIlIlIlllIIllIl) {
        super(lllllllllllllIIlIIIlIlIlllIIllIl);
    }
}
