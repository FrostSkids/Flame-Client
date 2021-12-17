// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.init.Items;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;

public class EntitySquid extends EntityWaterMob
{
    public /* synthetic */ float squidPitch;
    private /* synthetic */ float randomMotionSpeed;
    public /* synthetic */ float tentacleAngle;
    public /* synthetic */ float lastTentacleAngle;
    private static final /* synthetic */ int[] llllIlIIllIll;
    private /* synthetic */ float randomMotionVecZ;
    public /* synthetic */ float prevSquidRotation;
    public /* synthetic */ float squidRotation;
    private /* synthetic */ float field_70871_bB;
    private /* synthetic */ float randomMotionVecY;
    public /* synthetic */ float prevSquidYaw;
    public /* synthetic */ float squidYaw;
    private /* synthetic */ float rotationVelocity;
    public /* synthetic */ float prevSquidPitch;
    private /* synthetic */ float randomMotionVecX;
    
    public EntitySquid(final World lllllllllllllIlIllIllIllIIIIlllI) {
        super(lllllllllllllIlIllIllIllIIIIlllI);
        this.setSize(0.95f, 0.95f);
        this.rand.setSeed(EntitySquid.llllIlIIllIll[0] + this.getEntityId());
        this.rotationVelocity = 1.0f / (this.rand.nextFloat() + 1.0f) * 0.2f;
        this.tasks.addTask(EntitySquid.llllIlIIllIll[1], new AIMoveRandom(this));
    }
    
    @Override
    public boolean isInWater() {
        return this.worldObj.handleMaterialAcceleration(this.getEntityBoundingBox().expand(0.0, -0.6000000238418579, 0.0), Material.water, this);
    }
    
    public boolean func_175567_n() {
        if (lIlIlIlIIIllIlI(lIlIlIlIIIlllll(this.randomMotionVecX, 0.0f)) && lIlIlIlIIIllIlI(lIlIlIlIIIlllll(this.randomMotionVecY, 0.0f)) && lIlIlIlIIIllIlI(lIlIlIlIIIlllll(this.randomMotionVecZ, 0.0f))) {
            return EntitySquid.llllIlIIllIll[1] != 0;
        }
        return EntitySquid.llllIlIIllIll[0] != 0;
    }
    
    @Override
    protected String getHurtSound() {
        return null;
    }
    
    public void func_175568_b(final float lllllllllllllIlIllIllIlIllIlIIIl, final float lllllllllllllIlIllIllIlIllIlIlII, final float lllllllllllllIlIllIllIlIllIlIIll) {
        this.randomMotionVecX = lllllllllllllIlIllIllIlIllIlIIIl;
        this.randomMotionVecY = lllllllllllllIlIllIllIlIllIlIlII;
        this.randomMotionVecZ = lllllllllllllIlIllIllIlIllIlIIll;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (lIlIlIlIIIllIII(lIlIlIlIIIlllII(this.posY, 45.0)) && lIlIlIlIIIllIll(lIlIlIlIIIlllIl(this.posY, this.worldObj.func_181545_F())) && lIlIlIlIIIllIIl(super.getCanSpawnHere() ? 1 : 0)) {
            return EntitySquid.llllIlIIllIll[0] != 0;
        }
        return EntitySquid.llllIlIIllIll[1] != 0;
    }
    
    private static boolean lIlIlIlIIIlIlIl(final int lllllllllllllIlIllIllIlIllIIIIll, final int lllllllllllllIlIllIllIlIllIIIIlI) {
        return lllllllllllllIlIllIllIlIllIIIIll >= lllllllllllllIlIllIllIlIllIIIIlI;
    }
    
    @Override
    protected String getLivingSound() {
        return null;
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.prevSquidPitch = this.squidPitch;
        this.prevSquidYaw = this.squidYaw;
        this.prevSquidRotation = this.squidRotation;
        this.lastTentacleAngle = this.tentacleAngle;
        this.squidRotation += this.rotationVelocity;
        if (lIlIlIlIIIllIII(lIlIlIlIIIlIllI(this.squidRotation, 6.283185307179586))) {
            if (lIlIlIlIIIllIIl(this.worldObj.isRemote ? 1 : 0)) {
                this.squidRotation = 6.2831855f;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                this.squidRotation -= (float)6.283185307179586;
                if (lIlIlIlIIIllIlI(this.rand.nextInt(EntitySquid.llllIlIIllIll[3]))) {
                    this.rotationVelocity = 1.0f / (this.rand.nextFloat() + 1.0f) * 0.2f;
                }
                this.worldObj.setEntityState(this, (byte)EntitySquid.llllIlIIllIll[4]);
            }
        }
        if (lIlIlIlIIIllIIl(this.inWater ? 1 : 0)) {
            if (lIlIlIlIIIllIll(lIlIlIlIIIlIlll(this.squidRotation, 3.1415927f))) {
                final float lllllllllllllIlIllIllIlIlllIllII = this.squidRotation / 3.1415927f;
                this.tentacleAngle = MathHelper.sin(lllllllllllllIlIllIllIlIlllIllII * lllllllllllllIlIllIllIlIlllIllII * 3.1415927f) * 3.1415927f * 0.25f;
                if (lIlIlIlIIIllIII(lIlIlIlIIIlIllI(lllllllllllllIlIllIllIlIlllIllII, 0.75))) {
                    this.randomMotionSpeed = 1.0f;
                    this.field_70871_bB = 1.0f;
                    "".length();
                    if ((26 + 110 - 80 + 99 ^ 34 + 83 - 33 + 74) == 0x0) {
                        return;
                    }
                }
                else {
                    this.field_70871_bB *= 0.8f;
                    "".length();
                    if ((0x3F ^ 0x0 ^ (0x8 ^ 0x32)) <= 0) {
                        return;
                    }
                }
            }
            else {
                this.tentacleAngle = 0.0f;
                this.randomMotionSpeed *= 0.9f;
                this.field_70871_bB *= 0.99f;
            }
            if (lIlIlIlIIIllIlI(this.worldObj.isRemote ? 1 : 0)) {
                this.motionX = this.randomMotionVecX * this.randomMotionSpeed;
                this.motionY = this.randomMotionVecY * this.randomMotionSpeed;
                this.motionZ = this.randomMotionVecZ * this.randomMotionSpeed;
            }
            final float lllllllllllllIlIllIllIlIlllIlIll = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.renderYawOffset += (-(float)MathHelper.func_181159_b(this.motionX, this.motionZ) * 180.0f / 3.1415927f - this.renderYawOffset) * 0.1f;
            this.rotationYaw = this.renderYawOffset;
            this.squidYaw += (float)(3.141592653589793 * this.field_70871_bB * 1.5);
            this.squidPitch += (-(float)MathHelper.func_181159_b(lllllllllllllIlIllIllIlIlllIlIll, this.motionY) * 180.0f / 3.1415927f - this.squidPitch) * 0.1f;
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            this.tentacleAngle = MathHelper.abs(MathHelper.sin(this.squidRotation)) * 3.1415927f * 0.25f;
            if (lIlIlIlIIIllIlI(this.worldObj.isRemote ? 1 : 0)) {
                this.motionX = 0.0;
                this.motionY -= 0.08;
                this.motionY *= 0.9800000190734863;
                this.motionZ = 0.0;
            }
            this.squidPitch += (float)((-90.0f - this.squidPitch) * 0.02);
        }
    }
    
    private static boolean lIlIlIlIIIllIll(final int lllllllllllllIlIllIllIlIlIllllII) {
        return lllllllllllllIlIllIllIlIlIllllII < 0;
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIlIllIllIlIlllllIlI, final int lllllllllllllIlIllIllIlIllllIlIl) {
        final int lllllllllllllIlIllIllIlIlllllIII = this.rand.nextInt(EntitySquid.llllIlIIllIll[2] + lllllllllllllIlIllIllIlIllllIlIl) + EntitySquid.llllIlIIllIll[0];
        int lllllllllllllIlIllIllIlIllllIlll = EntitySquid.llllIlIIllIll[1];
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIlIlIlIIIlIlIl(lllllllllllllIlIllIllIlIllllIlll, lllllllllllllIlIllIllIlIlllllIII)) {
            this.entityDropItem(new ItemStack(Items.dye, EntitySquid.llllIlIIllIll[0], EnumDyeColor.BLACK.getDyeDamage()), 0.0f);
            "".length();
            ++lllllllllllllIlIllIllIlIllllIlll;
        }
    }
    
    static {
        lIlIlIlIIIlIlII();
    }
    
    private static int lIlIlIlIIIlllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected Item getDropItem() {
        return null;
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIlIllIllIlIllIlllIl) {
        if (lIlIlIlIIIllllI(lllllllllllllIlIllIllIlIllIlllIl, EntitySquid.llllIlIIllIll[4])) {
            this.squidRotation = 0.0f;
            "".length();
            if ((0x5 ^ 0x1) != (0xB1 ^ 0xB5)) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIlIllIllIlIllIlllIl);
        }
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntitySquid.llllIlIIllIll[1] != 0;
    }
    
    @Override
    public float getEyeHeight() {
        return this.height * 0.5f;
    }
    
    @Override
    protected String getDeathSound() {
        return null;
    }
    
    private static int lIlIlIlIIIlIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    private static boolean lIlIlIlIIIllIlI(final int lllllllllllllIlIllIllIlIlIlllllI) {
        return lllllllllllllIlIllIllIlIlIlllllI == 0;
    }
    
    private static int lIlIlIlIIIlIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
    }
    
    @Override
    public void moveEntityWithHeading(final float lllllllllllllIlIllIllIlIlllIIllI, final float lllllllllllllIlIllIllIlIlllIIlIl) {
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
    }
    
    private static int lIlIlIlIIIlllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIlIlIlIIIlllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIlIlIIIllIII(final int lllllllllllllIlIllIllIlIlIlllIlI) {
        return lllllllllllllIlIllIllIlIlIlllIlI > 0;
    }
    
    private static boolean lIlIlIlIIIllllI(final int lllllllllllllIlIllIllIlIllIIIlll, final int lllllllllllllIlIllIllIlIllIIIllI) {
        return lllllllllllllIlIllIllIlIllIIIlll == lllllllllllllIlIllIllIlIllIIIllI;
    }
    
    private static boolean lIlIlIlIIIllIIl(final int lllllllllllllIlIllIllIlIllIIIIII) {
        return lllllllllllllIlIllIllIlIllIIIIII != 0;
    }
    
    private static void lIlIlIlIIIlIlII() {
        (llllIlIIllIll = new int[5])[0] = " ".length();
        EntitySquid.llllIlIIllIll[1] = ("  ".length() & ~"  ".length());
        EntitySquid.llllIlIIllIll[2] = "   ".length();
        EntitySquid.llllIlIIllIll[3] = (0x1D ^ 0x11 ^ (0xC5 ^ 0xC3));
        EntitySquid.llllIlIIllIll[4] = (0x3 ^ 0x10);
    }
    
    static class AIMoveRandom extends EntityAIBase
    {
        private /* synthetic */ EntitySquid squid;
        private static final /* synthetic */ int[] llIlllIlIIIlIl;
        
        private static boolean lIIllIIllIIlllIl(final int llllllllllllIllIIlIIlIlIlllllIII) {
            return llllllllllllIllIIlIIlIlIlllllIII == 0;
        }
        
        @Override
        public boolean shouldExecute() {
            return AIMoveRandom.llIlllIlIIIlIl[0] != 0;
        }
        
        @Override
        public void updateTask() {
            final int llllllllllllIllIIlIIlIllIIIIlIlI = this.squid.getAge();
            if (lIIllIIllIIllIll(llllllllllllIllIIlIIlIllIIIIlIlI, AIMoveRandom.llIlllIlIIIlIl[1])) {
                this.squid.func_175568_b(0.0f, 0.0f, 0.0f);
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
            else if (!lIIllIIllIIlllII(this.squid.getRNG().nextInt(AIMoveRandom.llIlllIlIIIlIl[2])) || !lIIllIIllIIlllII(this.squid.inWater ? 1 : 0) || lIIllIIllIIlllIl(this.squid.func_175567_n() ? 1 : 0)) {
                final float llllllllllllIllIIlIIlIllIIIIlIIl = this.squid.getRNG().nextFloat() * 3.1415927f * 2.0f;
                final float llllllllllllIllIIlIIlIllIIIIlIII = MathHelper.cos(llllllllllllIllIIlIIlIllIIIIlIIl) * 0.2f;
                final float llllllllllllIllIIlIIlIllIIIIIlll = -0.1f + this.squid.getRNG().nextFloat() * 0.2f;
                final float llllllllllllIllIIlIIlIllIIIIIllI = MathHelper.sin(llllllllllllIllIIlIIlIllIIIIlIIl) * 0.2f;
                this.squid.func_175568_b(llllllllllllIllIIlIIlIllIIIIlIII, llllllllllllIllIIlIIlIllIIIIIlll, llllllllllllIllIIlIIlIllIIIIIllI);
            }
        }
        
        static {
            lIIllIIllIIllIlI();
        }
        
        private static void lIIllIIllIIllIlI() {
            (llIlllIlIIIlIl = new int[3])[0] = " ".length();
            AIMoveRandom.llIlllIlIIIlIl[1] = (0x21 ^ 0x45);
            AIMoveRandom.llIlllIlIIIlIl[2] = (0x85 ^ 0xB7);
        }
        
        private static boolean lIIllIIllIIlllII(final int llllllllllllIllIIlIIlIlIlllllIlI) {
            return llllllllllllIllIIlIIlIlIlllllIlI != 0;
        }
        
        public AIMoveRandom() {
        }
        
        private static boolean lIIllIIllIIllIll(final int llllllllllllIllIIlIIlIlIllllllIl, final int llllllllllllIllIIlIIlIlIllllllII) {
            return llllllllllllIllIIlIIlIlIllllllIl > llllllllllllIllIIlIIlIlIllllllII;
        }
    }
}
