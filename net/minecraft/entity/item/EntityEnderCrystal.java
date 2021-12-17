// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.util.MathHelper;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;

public class EntityEnderCrystal extends Entity
{
    public /* synthetic */ int innerRotation;
    public /* synthetic */ int health;
    private static final /* synthetic */ int[] lIlllIIllIIlII;
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIlllllIIllIlllllIIIl) {
    }
    
    private static boolean lIIIIIIllllllIIl(final int llllllllllllIlllllIIllIllllIIIll) {
        return llllllllllllIlllllIIllIllllIIIll != 0;
    }
    
    public EntityEnderCrystal(final World llllllllllllIlllllIIlllIIIIlIlII) {
        super(llllllllllllIlllllIIlllIIIIlIlII);
        this.preventEntitySpawning = (EntityEnderCrystal.lIlllIIllIIlII[0] != 0);
        this.setSize(2.0f, 2.0f);
        this.health = EntityEnderCrystal.lIlllIIllIIlII[1];
        this.innerRotation = this.rand.nextInt(EntityEnderCrystal.lIlllIIllIIlII[2]);
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityEnderCrystal.lIlllIIllIIlII[3] != 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlllllIIllIllllIllII, final float llllllllllllIlllllIIllIllllIlIll) {
        if (lIIIIIIllllllIIl(this.isEntityInvulnerable(llllllllllllIlllllIIllIllllIllII) ? 1 : 0)) {
            return EntityEnderCrystal.lIlllIIllIIlII[3] != 0;
        }
        if (lIIIIIIllllllIll(this.isDead ? 1 : 0) && lIIIIIIllllllIll(this.worldObj.isRemote ? 1 : 0)) {
            this.health = EntityEnderCrystal.lIlllIIllIIlII[3];
            if (lIIIIIIlllllllII(this.health)) {
                this.setDead();
                if (lIIIIIIllllllIll(this.worldObj.isRemote ? 1 : 0)) {
                    this.worldObj.createExplosion(null, this.posX, this.posY, this.posZ, 6.0f, (boolean)(EntityEnderCrystal.lIlllIIllIIlII[0] != 0));
                    "".length();
                }
            }
        }
        return EntityEnderCrystal.lIlllIIllIIlII[0] != 0;
    }
    
    private static boolean lIIIIIIllllllIll(final int llllllllllllIlllllIIllIllllIIIIl) {
        return llllllllllllIlllllIIllIllllIIIIl == 0;
    }
    
    private static boolean lIIIIIIlllllllII(final int llllllllllllIlllllIIllIlllIlllll) {
        return llllllllllllIlllllIIllIlllIlllll <= 0;
    }
    
    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(EntityEnderCrystal.lIlllIIllIIlII[4], this.health);
    }
    
    private static void lIIIIIIllllllIII() {
        (lIlllIIllIIlII = new int[5])[0] = " ".length();
        EntityEnderCrystal.lIlllIIllIIlII[1] = (0xF ^ 0xA);
        EntityEnderCrystal.lIlllIIllIIlII[2] = (0xFFFF87B5 & 0x1FEEA);
        EntityEnderCrystal.lIlllIIllIIlII[3] = ((0x43 ^ 0x3F ^ (0x41 ^ 0x2C)) & (0x83 ^ 0x8B ^ (0x2F ^ 0x36) ^ -" ".length()));
        EntityEnderCrystal.lIlllIIllIIlII[4] = (0xEF ^ 0x95 ^ (0x2C ^ 0x5E));
    }
    
    @Override
    public boolean canBeCollidedWith() {
        return EntityEnderCrystal.lIlllIIllIIlII[0] != 0;
    }
    
    static {
        lIIIIIIllllllIII();
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIlllllIIllIlllllIIll) {
    }
    
    public EntityEnderCrystal(final World llllllllllllIlllllIIlllIIIIIllIl, final double llllllllllllIlllllIIlllIIIIIllII, final double llllllllllllIlllllIIlllIIIIIlIll, final double llllllllllllIlllllIIlllIIIIIlIlI) {
        this(llllllllllllIlllllIIlllIIIIIllIl);
        this.setPosition(llllllllllllIlllllIIlllIIIIIllII, llllllllllllIlllllIIlllIIIIIlIll, llllllllllllIlllllIIlllIIIIIlIlI);
    }
    
    private static boolean lIIIIIIllllllIlI(final Object llllllllllllIlllllIIllIllllIIllI, final Object llllllllllllIlllllIIllIllllIIlIl) {
        return llllllllllllIlllllIIllIllllIIllI != llllllllllllIlllllIIllIllllIIlIl;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.innerRotation += EntityEnderCrystal.lIlllIIllIIlII[0];
        this.dataWatcher.updateObject(EntityEnderCrystal.lIlllIIllIIlII[4], this.health);
        final int llllllllllllIlllllIIllIllllllIll = MathHelper.floor_double(this.posX);
        final int llllllllllllIlllllIIllIllllllIlI = MathHelper.floor_double(this.posY);
        final int llllllllllllIlllllIIllIllllllIIl = MathHelper.floor_double(this.posZ);
        if (lIIIIIIllllllIIl((this.worldObj.provider instanceof WorldProviderEnd) ? 1 : 0) && lIIIIIIllllllIlI(this.worldObj.getBlockState(new BlockPos(llllllllllllIlllllIIllIllllllIll, llllllllllllIlllllIIllIllllllIlI, llllllllllllIlllllIIllIllllllIIl)).getBlock(), Blocks.fire)) {
            this.worldObj.setBlockState(new BlockPos(llllllllllllIlllllIIllIllllllIll, llllllllllllIlllllIIllIllllllIlI, llllllllllllIlllllIIllIllllllIIl), Blocks.fire.getDefaultState());
            "".length();
        }
    }
}
