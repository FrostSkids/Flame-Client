// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.util.BlockPos;
import net.minecraft.block.Block;

public abstract class EntityFlying extends EntityLiving
{
    private static final /* synthetic */ int[] lllllIllllllI;
    
    private static void lIlIllllIllllIl() {
        (lllllIllllllI = new int[2])[0] = " ".length();
        EntityFlying.lllllIllllllI[1] = ((19 + 86 - 89 + 200 ^ 132 + 118 - 214 + 113) & (0xAA ^ 0xA7 ^ (0x9 ^ 0x49) ^ -" ".length()));
    }
    
    @Override
    public boolean isOnLadder() {
        return EntityFlying.lllllIllllllI[1] != 0;
    }
    
    @Override
    public void fall(final float lllllllllllllIlIlIllIIIIIlIlIIII, final float lllllllllllllIlIlIllIIIIIlIIlllI) {
    }
    
    static {
        lIlIllllIllllIl();
    }
    
    private static boolean lIlIlllllIIIIII(final int lllllllllllllIlIlIllIIIIIIIIIIII) {
        return lllllllllllllIlIlIllIIIIIIIIIIII > 0;
    }
    
    @Override
    protected void updateFallState(final double lllllllllllllIlIlIllIIIIIlIIlIll, final boolean lllllllllllllIlIlIllIIIIIlIIlIIl, final Block lllllllllllllIlIlIllIIIIIlIIIlll, final BlockPos lllllllllllllIlIlIllIIIIIlIIIlIl) {
    }
    
    private static int lIlIllllIlllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void moveEntityWithHeading(final float lllllllllllllIlIlIllIIIIIIIlIlIl, final float lllllllllllllIlIlIllIIIIIIIlllll) {
        if (lIlIllllIllllll(this.isInWater() ? 1 : 0)) {
            this.moveFlying(lllllllllllllIlIlIllIIIIIIIlIlIl, lllllllllllllIlIlIllIIIIIIIlllll, 0.02f);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.800000011920929;
            this.motionY *= 0.800000011920929;
            this.motionZ *= 0.800000011920929;
            "".length();
            if (((0x62 ^ 0x36 ^ (0x79 ^ 0x1F)) & (0xF4 ^ 0x89 ^ (0x60 ^ 0x2F) ^ -" ".length())) != ((180 + 218 - 215 + 61 ^ 21 + 33 + 6 + 108) & (0x36 ^ 0x2F ^ (0x27 ^ 0x62) ^ -" ".length()))) {
                return;
            }
        }
        else if (lIlIllllIllllll(this.isInLava() ? 1 : 0)) {
            this.moveFlying(lllllllllllllIlIlIllIIIIIIIlIlIl, lllllllllllllIlIlIllIIIIIIIlllll, 0.02f);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.5;
            this.motionY *= 0.5;
            this.motionZ *= 0.5;
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
        }
        else {
            float lllllllllllllIlIlIllIIIIIIIlllIl = 0.91f;
            if (lIlIllllIllllll(this.onGround ? 1 : 0)) {
                lllllllllllllIlIlIllIIIIIIIlllIl = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.getEntityBoundingBox().minY) - EntityFlying.lllllIllllllI[0], MathHelper.floor_double(this.posZ))).getBlock().slipperiness * 0.91f;
            }
            final float lllllllllllllIlIlIllIIIIIIIlllII = 0.16277136f / (lllllllllllllIlIlIllIIIIIIIlllIl * lllllllllllllIlIlIllIIIIIIIlllIl * lllllllllllllIlIlIllIIIIIIIlllIl);
            float lllllllllllllIIlIlllIllIllIIlIlI;
            if (lIlIllllIllllll(this.onGround ? 1 : 0)) {
                lllllllllllllIIlIlllIllIllIIlIlI = 0.1f * lllllllllllllIlIlIllIIIIIIIlllII;
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIlllIllIllIIlIlI = 0.02f;
            }
            this.moveFlying(lllllllllllllIlIlIllIIIIIIIlIlIl, lllllllllllllIlIlIllIIIIIIIlllll, lllllllllllllIIlIlllIllIllIIlIlI);
            lllllllllllllIlIlIllIIIIIIIlllIl = 0.91f;
            if (lIlIllllIllllll(this.onGround ? 1 : 0)) {
                lllllllllllllIlIlIllIIIIIIIlllIl = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.getEntityBoundingBox().minY) - EntityFlying.lllllIllllllI[0], MathHelper.floor_double(this.posZ))).getBlock().slipperiness * 0.91f;
            }
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= lllllllllllllIlIlIllIIIIIIIlllIl;
            this.motionY *= lllllllllllllIlIlIllIIIIIIIlllIl;
            this.motionZ *= lllllllllllllIlIlIllIIIIIIIlllIl;
        }
        this.prevLimbSwingAmount = this.limbSwingAmount;
        final double lllllllllllllIlIlIllIIIIIIIllIll = this.posX - this.prevPosX;
        final double lllllllllllllIlIlIllIIIIIIIllIlI = this.posZ - this.prevPosZ;
        float lllllllllllllIlIlIllIIIIIIIllIII = MathHelper.sqrt_double(lllllllllllllIlIlIllIIIIIIIllIll * lllllllllllllIlIlIllIIIIIIIllIll + lllllllllllllIlIlIllIIIIIIIllIlI * lllllllllllllIlIlIllIIIIIIIllIlI) * 4.0f;
        if (lIlIlllllIIIIII(lIlIllllIlllllI(lllllllllllllIlIlIllIIIIIIIllIII, 1.0f))) {
            lllllllllllllIlIlIllIIIIIIIllIII = 1.0f;
        }
        this.limbSwingAmount += (lllllllllllllIlIlIllIIIIIIIllIII - this.limbSwingAmount) * 0.4f;
        this.limbSwing += this.limbSwingAmount;
    }
    
    public EntityFlying(final World lllllllllllllIlIlIllIIIIIlIlIlIl) {
        super(lllllllllllllIlIlIllIIIIIlIlIlIl);
    }
    
    private static boolean lIlIllllIllllll(final int lllllllllllllIlIlIllIIIIIIIIIlII) {
        return lllllllllllllIlIlIllIIIIIIIIIlII != 0;
    }
}
