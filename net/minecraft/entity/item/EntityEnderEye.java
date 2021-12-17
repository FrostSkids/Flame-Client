// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class EntityEnderEye extends Entity
{
    private /* synthetic */ double targetX;
    private static final /* synthetic */ int[] lIIIIlIIlllIIl;
    private /* synthetic */ boolean shatterOrDrop;
    private /* synthetic */ double targetZ;
    private /* synthetic */ int despawnTimer;
    private /* synthetic */ double targetY;
    
    private static int lIlllIIIlllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlllIIIllllIll(final int lllllllllllllIlIIlIllllIlIllIIll) {
        return lllllllllllllIlIIlIllllIlIllIIll < 0;
    }
    
    private static boolean lIlllIIIlllllll(final int lllllllllllllIlIIlIllllIlIllIlll) {
        return lllllllllllllIlIIlIllllIlIllIlll == 0;
    }
    
    private static void lIlllIIIllllIII() {
        (lIIIIlIIlllIIl = new int[7])[0] = " ".length();
        EntityEnderEye.lIIIIlIIlllIIl[1] = ((0xB1 ^ 0xAD) & ~(0xB2 ^ 0xAE));
        EntityEnderEye.lIIIIlIIlllIIl[2] = (0x9C ^ 0x99);
        EntityEnderEye.lIIIIlIIlllIIl[3] = (0x2 ^ 0x6);
        EntityEnderEye.lIIIIlIIlllIIl[4] = (0x4 ^ 0x54);
        EntityEnderEye.lIIIIlIIlllIIl[5] = (-(0xFFFFBCED & 0x7B1B) & (0xFFFFFFDB & 0x3FFF));
        EntityEnderEye.lIIIIlIIlllIIl[6] = (-(0xFFFFF6F8 & 0x1D0F) & (0xFFFF9DF7 & 0xF076FF));
    }
    
    @Override
    public boolean canAttackWithItem() {
        return EntityEnderEye.lIIIIlIIlllIIl[1] != 0;
    }
    
    private static boolean lIlllIIIllllIlI(final int lllllllllllllIlIIlIllllIlIlllIIl) {
        return lllllllllllllIlIIlIllllIlIlllIIl != 0;
    }
    
    private static boolean lIlllIIlIIIIlIl(final int lllllllllllllIlIIlIllllIlIllllII, final int lllllllllllllIlIIlIllllIlIlllIll) {
        return lllllllllllllIlIIlIllllIlIllllII > lllllllllllllIlIIlIllllIlIlllIll;
    }
    
    @Override
    protected void entityInit() {
    }
    
    @Override
    public float getBrightness(final float lllllllllllllIlIIlIllllIllIIIllI) {
        return 1.0f;
    }
    
    private static boolean lIlllIIIlllllIl(final int lllllllllllllIlIIlIllllIlIllIIIl) {
        return lllllllllllllIlIIlIllllIlIllIIIl > 0;
    }
    
    private static int lIlllIIlIIIIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void setVelocity(final double lllllllllllllIlIIlIllllIlllIlIII, final double lllllllllllllIlIIlIllllIlllIIlll, final double lllllllllllllIlIIlIllllIlllIIllI) {
        this.motionX = lllllllllllllIlIIlIllllIlllIlIII;
        this.motionY = lllllllllllllIlIIlIllllIlllIIlll;
        this.motionZ = lllllllllllllIlIIlIllllIlllIIllI;
        if (lIlllIIIlllllll(lIlllIIIllllllI(this.prevRotationPitch, 0.0f)) && lIlllIIIlllllll(lIlllIIIllllllI(this.prevRotationYaw, 0.0f))) {
            final float lllllllllllllIlIIlIllllIlllIlIlI = MathHelper.sqrt_double(lllllllllllllIlIIlIllllIlllIlIII * lllllllllllllIlIIlIllllIlllIlIII + lllllllllllllIlIIlIllllIlllIIllI * lllllllllllllIlIIlIllllIlllIIllI);
            final float n = (float)(MathHelper.func_181159_b(lllllllllllllIlIIlIllllIlllIlIII, lllllllllllllIlIIlIllllIlllIIllI) * 180.0 / 3.141592653589793);
            this.rotationYaw = n;
            this.prevRotationYaw = n;
            final float n2 = (float)(MathHelper.func_181159_b(lllllllllllllIlIIlIllllIlllIIlll, lllllllllllllIlIIlIllllIlllIlIlI) * 180.0 / 3.141592653589793);
            this.rotationPitch = n2;
            this.prevRotationPitch = n2;
        }
    }
    
    private static int lIlllIIIllllIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIlIllllIllIIlIlI) {
    }
    
    static {
        lIlllIIIllllIII();
    }
    
    private static boolean lIlllIIlIIIIIll(final int lllllllllllllIlIIlIllllIlIllIlIl) {
        return lllllllllllllIlIIlIllllIlIllIlIl >= 0;
    }
    
    public void moveTowards(final BlockPos lllllllllllllIlIIlIlllllIIIIIIlI) {
        final double lllllllllllllIlIIlIlllllIIIIIIIl = lllllllllllllIlIIlIlllllIIIIIIlI.getX();
        final int lllllllllllllIlIIlIlllllIIIIIIII = lllllllllllllIlIIlIlllllIIIIIIlI.getY();
        final double lllllllllllllIlIIlIllllIllllllll = lllllllllllllIlIIlIlllllIIIIIIlI.getZ();
        final double lllllllllllllIlIIlIllllIlllllllI = lllllllllllllIlIIlIlllllIIIIIIIl - this.posX;
        final double lllllllllllllIlIIlIllllIllllllIl = lllllllllllllIlIIlIllllIllllllll - this.posZ;
        final float lllllllllllllIlIIlIllllIllllllII = MathHelper.sqrt_double(lllllllllllllIlIIlIllllIlllllllI * lllllllllllllIlIIlIllllIlllllllI + lllllllllllllIlIIlIllllIllllllIl * lllllllllllllIlIIlIllllIllllllIl);
        if (lIlllIIIlllllIl(lIlllIIIlllllII(lllllllllllllIlIIlIllllIllllllII, 12.0f))) {
            this.targetX = this.posX + lllllllllllllIlIIlIllllIlllllllI / lllllllllllllIlIIlIllllIllllllII * 12.0;
            this.targetZ = this.posZ + lllllllllllllIlIIlIllllIllllllIl / lllllllllllllIlIIlIllllIllllllII * 12.0;
            this.targetY = this.posY + 8.0;
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            this.targetX = lllllllllllllIlIIlIlllllIIIIIIIl;
            this.targetY = lllllllllllllIlIIlIlllllIIIIIIII;
            this.targetZ = lllllllllllllIlIIlIllllIllllllll;
        }
        this.despawnTimer = EntityEnderEye.lIIIIlIIlllIIl[1];
        int shatterOrDrop;
        if (lIlllIIIlllllIl(this.rand.nextInt(EntityEnderEye.lIIIIlIIlllIIl[2]))) {
            shatterOrDrop = EntityEnderEye.lIIIIlIIlllIIl[0];
            "".length();
            if (((0x63 ^ 0x79 ^ (0x41 ^ 0x12)) & (214 + 18 - 17 + 37 ^ 86 + 26 + 27 + 42 ^ -" ".length())) > 0) {
                return;
            }
        }
        else {
            shatterOrDrop = EntityEnderEye.lIIIIlIIlllIIl[1];
        }
        this.shatterOrDrop = (shatterOrDrop != 0);
    }
    
    public EntityEnderEye(final World lllllllllllllIlIIlIlllllIIlIIlll) {
        super(lllllllllllllIlIIlIlllllIIlIIlll);
        this.setSize(0.25f, 0.25f);
    }
    
    private static boolean lIlllIIlIIIIlII(final int lllllllllllllIlIIlIllllIllIIIIII, final int lllllllllllllIlIIlIllllIlIllllll) {
        return lllllllllllllIlIIlIllllIllIIIIII >= lllllllllllllIlIIlIllllIlIllllll;
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double lllllllllllllIlIIlIlllllIIIlllll) {
        double lllllllllllllIlIIlIlllllIIIllllI = this.getEntityBoundingBox().getAverageEdgeLength() * 4.0;
        if (lIlllIIIllllIlI(Double.isNaN(lllllllllllllIlIIlIlllllIIIllllI) ? 1 : 0)) {
            lllllllllllllIlIIlIlllllIIIllllI = 4.0;
        }
        lllllllllllllIlIIlIlllllIIIllllI *= 64.0;
        if (lIlllIIIllllIll(lIlllIIIllllIIl(lllllllllllllIlIIlIlllllIIIlllll, lllllllllllllIlIIlIlllllIIIllllI * lllllllllllllIlIIlIlllllIIIllllI))) {
            return EntityEnderEye.lIIIIlIIlllIIl[0] != 0;
        }
        return EntityEnderEye.lIIIIlIIlllIIl[1] != 0;
    }
    
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIlIllllIllIIlIII) {
    }
    
    private static int lIlllIIIllllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIlIIlIllllIllIIIlII) {
        return EntityEnderEye.lIIIIlIIlllIIl[6];
    }
    
    private static int lIlllIIlIIIIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public EntityEnderEye(final World lllllllllllllIlIIlIlllllIIIlIlII, final double lllllllllllllIlIIlIlllllIIIIlllI, final double lllllllllllllIlIIlIlllllIIIIllIl, final double lllllllllllllIlIIlIlllllIIIlIIIl) {
        super(lllllllllllllIlIIlIlllllIIIlIlII);
        this.despawnTimer = EntityEnderEye.lIIIIlIIlllIIl[1];
        this.setSize(0.25f, 0.25f);
        this.setPosition(lllllllllllllIlIIlIlllllIIIIlllI, lllllllllllllIlIIlIlllllIIIIllIl, lllllllllllllIlIIlIlllllIIIlIIIl);
    }
    
    private static int lIlllIIlIIIIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void onUpdate() {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();
        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
        final float lllllllllllllIlIIlIllllIllIllIll = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(MathHelper.func_181159_b(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
        this.rotationPitch = (float)(MathHelper.func_181159_b(this.motionY, lllllllllllllIlIIlIllllIllIllIll) * 180.0 / 3.141592653589793);
        "".length();
        if (" ".length() >= (0x8C ^ 0xC7 ^ (0x3E ^ 0x71))) {
            return;
        }
        while (!lIlllIIlIIIIIll(lIlllIIlIIIIIII(this.rotationPitch - this.prevRotationPitch, -180.0f))) {
            this.prevRotationPitch -= 360.0f;
        }
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lIlllIIIllllIll(lIlllIIlIIIIIIl(this.rotationPitch - this.prevRotationPitch, 180.0f))) {
            this.prevRotationPitch += 360.0f;
        }
        "".length();
        if ("  ".length() == ((0x5C ^ 0x4B) & ~(0x91 ^ 0x86))) {
            return;
        }
        while (!lIlllIIlIIIIIll(lIlllIIlIIIIIII(this.rotationYaw - this.prevRotationYaw, -180.0f))) {
            this.prevRotationYaw -= 360.0f;
        }
        "".length();
        if ("  ".length() < ((0xA3 ^ 0x84) & ~(0x86 ^ 0xA1))) {
            return;
        }
        while (!lIlllIIIllllIll(lIlllIIlIIIIIIl(this.rotationYaw - this.prevRotationYaw, 180.0f))) {
            this.prevRotationYaw += 360.0f;
        }
        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
        if (lIlllIIIlllllll(this.worldObj.isRemote ? 1 : 0)) {
            final double lllllllllllllIlIIlIllllIllIllIlI = this.targetX - this.posX;
            final double lllllllllllllIlIIlIllllIllIllIIl = this.targetZ - this.posZ;
            final float lllllllllllllIlIIlIllllIllIllIII = (float)Math.sqrt(lllllllllllllIlIIlIllllIllIllIlI * lllllllllllllIlIIlIllllIllIllIlI + lllllllllllllIlIIlIllllIllIllIIl * lllllllllllllIlIIlIllllIllIllIIl);
            final float lllllllllllllIlIIlIllllIllIlIlll = (float)MathHelper.func_181159_b(lllllllllllllIlIIlIllllIllIllIIl, lllllllllllllIlIIlIllllIllIllIlI);
            double lllllllllllllIlIIlIllllIllIlIllI = lllllllllllllIlIIlIllllIllIllIll + (lllllllllllllIlIIlIllllIllIllIII - lllllllllllllIlIIlIllllIllIllIll) * 0.0025;
            if (lIlllIIIllllIll(lIlllIIlIIIIIII(lllllllllllllIlIIlIllllIllIllIII, 1.0f))) {
                lllllllllllllIlIIlIllllIllIlIllI *= 0.8;
                this.motionY *= 0.8;
            }
            this.motionX = Math.cos(lllllllllllllIlIIlIllllIllIlIlll) * lllllllllllllIlIIlIllllIllIlIllI;
            this.motionZ = Math.sin(lllllllllllllIlIIlIllllIllIlIlll) * lllllllllllllIlIIlIllllIllIlIllI;
            if (lIlllIIIllllIll(lIlllIIlIIIIIlI(this.posY, this.targetY))) {
                this.motionY += (1.0 - this.motionY) * 0.014999999664723873;
                "".length();
                if ((0x27 ^ 0x66 ^ (0x55 ^ 0x10)) == "  ".length()) {
                    return;
                }
            }
            else {
                this.motionY += (-1.0 - this.motionY) * 0.014999999664723873;
            }
        }
        final float lllllllllllllIlIIlIllllIllIlIlIl = 0.25f;
        if (lIlllIIIllllIlI(this.isInWater() ? 1 : 0)) {
            int lllllllllllllIlIIlIllllIllIlIlII = EntityEnderEye.lIIIIlIIlllIIl[1];
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
            while (!lIlllIIlIIIIlII(lllllllllllllIlIIlIllllIllIlIlII, EntityEnderEye.lIIIIlIIlllIIl[3])) {
                this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * lllllllllllllIlIIlIllllIllIlIlIl, this.posY - this.motionY * lllllllllllllIlIIlIllllIllIlIlIl, this.posZ - this.motionZ * lllllllllllllIlIIlIllllIllIlIlIl, this.motionX, this.motionY, this.motionZ, new int[EntityEnderEye.lIIIIlIIlllIIl[1]]);
                ++lllllllllllllIlIIlIllllIllIlIlII;
            }
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, this.posX - this.motionX * lllllllllllllIlIIlIllllIllIlIlIl + this.rand.nextDouble() * 0.6 - 0.3, this.posY - this.motionY * lllllllllllllIlIIlIllllIllIlIlIl - 0.5, this.posZ - this.motionZ * lllllllllllllIlIIlIllllIllIlIlIl + this.rand.nextDouble() * 0.6 - 0.3, this.motionX, this.motionY, this.motionZ, new int[EntityEnderEye.lIIIIlIIlllIIl[1]]);
        }
        if (lIlllIIIlllllll(this.worldObj.isRemote ? 1 : 0)) {
            this.setPosition(this.posX, this.posY, this.posZ);
            this.despawnTimer += EntityEnderEye.lIIIIlIIlllIIl[0];
            if (lIlllIIlIIIIlIl(this.despawnTimer, EntityEnderEye.lIIIIlIIlllIIl[4]) && lIlllIIIlllllll(this.worldObj.isRemote ? 1 : 0)) {
                this.setDead();
                if (lIlllIIIllllIlI(this.shatterOrDrop ? 1 : 0)) {
                    this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, new ItemStack(Items.ender_eye)));
                    "".length();
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return;
                    }
                }
                else {
                    this.worldObj.playAuxSFX(EntityEnderEye.lIIIIlIIlllIIl[5], new BlockPos(this), EntityEnderEye.lIIIIlIIlllIIl[1]);
                }
            }
        }
    }
}
