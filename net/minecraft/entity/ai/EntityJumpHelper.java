// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityLiving;

public class EntityJumpHelper
{
    private /* synthetic */ EntityLiving entity;
    protected /* synthetic */ boolean isJumping;
    private static final /* synthetic */ int[] lIlllIIIlIlIlI;
    
    private static void lIIIIIIlIIllIIIl() {
        (lIlllIIIlIlIlI = new int[2])[0] = " ".length();
        EntityJumpHelper.lIlllIIIlIlIlI[1] = ((0x0 ^ 0x5D ^ (0x78 ^ 0x3D)) & (0x89 ^ 0xC3 ^ (0x54 ^ 0x6) ^ -" ".length()));
    }
    
    public EntityJumpHelper(final EntityLiving llllllllllllIlllllIllIllIIIlllIl) {
        this.entity = llllllllllllIlllllIllIllIIIlllIl;
    }
    
    public void setJumping() {
        this.isJumping = (EntityJumpHelper.lIlllIIIlIlIlI[0] != 0);
    }
    
    static {
        lIIIIIIlIIllIIIl();
    }
    
    public void doJump() {
        this.entity.setJumping(this.isJumping);
        this.isJumping = (EntityJumpHelper.lIlllIIIlIlIlI[1] != 0);
    }
}
