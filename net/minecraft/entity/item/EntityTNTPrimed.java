// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

public class EntityTNTPrimed extends Entity
{
    public /* synthetic */ int fuse;
    private static final /* synthetic */ int[] llIlllllIIlIlI;
    private static final /* synthetic */ String[] llIlllllIIlIII;
    private /* synthetic */ EntityLivingBase tntPlacedBy;
    
    @Override
    public boolean canBeCollidedWith() {
        int n;
        if (lIIllIllIIIllIlI(this.isDead ? 1 : 0)) {
            n = EntityTNTPrimed.llIlllllIIlIlI[2];
            "".length();
            if ((0x15 ^ 0x7D ^ (0xD4 ^ 0xB8)) == "  ".length()) {
                return ((0x69 ^ 0x2 ^ (0x56 ^ 0x62)) & (0xA5 ^ 0xA9 ^ (0xC9 ^ 0x9A) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityTNTPrimed.llIlllllIIlIlI[0];
        }
        return n != 0;
    }
    
    public EntityLivingBase getTntPlacedBy() {
        return this.tntPlacedBy;
    }
    
    public EntityTNTPrimed(final World llllllllllllIllIIIllIIIIlllIllll, final double llllllllllllIllIIIllIIIIllllIlIl, final double llllllllllllIllIIIllIIIIlllIllIl, final double llllllllllllIllIIIllIIIIlllIllII, final EntityLivingBase llllllllllllIllIIIllIIIIllllIIlI) {
        this(llllllllllllIllIIIllIIIIlllIllll);
        this.setPosition(llllllllllllIllIIIllIIIIllllIlIl, llllllllllllIllIIIllIIIIlllIllIl, llllllllllllIllIIIllIIIIlllIllII);
        final float llllllllllllIllIIIllIIIIllllIIIl = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.motionX = -(float)Math.sin(llllllllllllIllIIIllIIIIllllIIIl) * 0.02f;
        this.motionY = 0.20000000298023224;
        this.motionZ = -(float)Math.cos(llllllllllllIllIIIllIIIIllllIIIl) * 0.02f;
        this.fuse = EntityTNTPrimed.llIlllllIIlIlI[1];
        this.prevPosX = llllllllllllIllIIIllIIIIllllIlIl;
        this.prevPosY = llllllllllllIllIIIllIIIIlllIllIl;
        this.prevPosZ = llllllllllllIllIIIllIIIIlllIllII;
        this.tntPlacedBy = llllllllllllIllIIIllIIIIllllIIlI;
    }
    
    private static void lIIllIllIIIllIIl() {
        (llIlllllIIlIlI = new int[5])[0] = " ".length();
        EntityTNTPrimed.llIlllllIIlIlI[1] = (238 + 83 - 250 + 172 ^ 130 + 92 - 144 + 85);
        EntityTNTPrimed.llIlllllIIlIlI[2] = ((0x40 ^ 0x17) & ~(0x7 ^ 0x50));
        EntityTNTPrimed.llIlllllIIlIlI[3] = "  ".length();
        EntityTNTPrimed.llIlllllIIlIlI[4] = (0x62 ^ 0x55 ^ (0xBF ^ 0x80));
    }
    
    private static String lIIllIllIIIlIIll(final String llllllllllllIllIIIllIIIIllIIIIlI, final String llllllllllllIllIIIllIIIIllIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), EntityTNTPrimed.llIlllllIIlIlI[4]), "DES");
            final Cipher llllllllllllIllIIIllIIIIllIIIllI = Cipher.getInstance("DES");
            llllllllllllIllIIIllIIIIllIIIllI.init(EntityTNTPrimed.llIlllllIIlIlI[3], llllllllllllIllIIIllIIIIllIIIlll);
            return new String(llllllllllllIllIIIllIIIIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIIIllIIIlIl) {
            llllllllllllIllIIIllIIIIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIllIIIllIIIIllIllIII) {
        llllllllllllIllIIIllIIIIllIllIII.setByte(EntityTNTPrimed.llIlllllIIlIII[EntityTNTPrimed.llIlllllIIlIlI[2]], (byte)this.fuse);
    }
    
    private static boolean lIIllIllIIIllIll(final int llllllllllllIllIIIllIIIIlIlIllII) {
        return llllllllllllIllIIIllIIIIlIlIllII <= 0;
    }
    
    @Override
    public float getEyeHeight() {
        return 0.0f;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= 0.03999999910593033;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= 0.9800000190734863;
        if (lIIllIllIIIllIlI(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
            this.motionY *= -0.5;
        }
        final int fuse = this.fuse;
        this.fuse = fuse - EntityTNTPrimed.llIlllllIIlIlI[0];
        if (lIIllIllIIIllIll(fuse)) {
            this.setDead();
            if (lIIllIllIIIlllII(this.worldObj.isRemote ? 1 : 0)) {
                this.explode();
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
        }
        else {
            this.handleWaterMovement();
            "".length();
            this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 0.5, this.posZ, 0.0, 0.0, 0.0, new int[EntityTNTPrimed.llIlllllIIlIlI[2]]);
        }
    }
    
    static {
        lIIllIllIIIllIIl();
        lIIllIllIIIlIlIl();
    }
    
    private static boolean lIIllIllIIIllIlI(final int llllllllllllIllIIIllIIIIlIllIIII) {
        return llllllllllllIllIIIllIIIIlIllIIII != 0;
    }
    
    public EntityTNTPrimed(final World llllllllllllIllIIIllIIIlIIIIIIIl) {
        super(llllllllllllIllIIIllIIIlIIIIIIIl);
        this.preventEntitySpawning = (EntityTNTPrimed.llIlllllIIlIlI[0] != 0);
        this.setSize(0.98f, 0.98f);
    }
    
    @Override
    protected void entityInit() {
    }
    
    private static void lIIllIllIIIlIlIl() {
        (llIlllllIIlIII = new String[EntityTNTPrimed.llIlllllIIlIlI[3]])[EntityTNTPrimed.llIlllllIIlIlI[2]] = lIIllIllIIIlIIlI("Q3rtZCR/SQk=", "UAaDQ");
        EntityTNTPrimed.llIlllllIIlIII[EntityTNTPrimed.llIlllllIIlIlI[0]] = lIIllIllIIIlIIll("w7EwHpU1nqA=", "IpBdy");
    }
    
    private static String lIIllIllIIIlIIlI(final String llllllllllllIllIIIllIIIIlIllIlIl, final String llllllllllllIllIIIllIIIIlIllIlII) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIIIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIIIIlIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIIIIlIlllIIl.init(EntityTNTPrimed.llIlllllIIlIlI[3], llllllllllllIllIIIllIIIIlIlllIlI);
            return new String(llllllllllllIllIIIllIIIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIIIlIlllIII) {
            llllllllllllIllIIIllIIIIlIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIllIIIlllII(final int llllllllllllIllIIIllIIIIlIlIlllI) {
        return llllllllllllIllIIIllIIIIlIlIlllI == 0;
    }
    
    private void explode() {
        final float llllllllllllIllIIIllIIIIllIllllI = 4.0f;
        this.worldObj.createExplosion(this, this.posX, this.posY + this.height / 16.0f, this.posZ, llllllllllllIllIIIllIIIIllIllllI, (boolean)(EntityTNTPrimed.llIlllllIIlIlI[0] != 0));
        "".length();
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIllIIIllIIIIllIlIIII) {
        this.fuse = llllllllllllIllIIIllIIIIllIlIIII.getByte(EntityTNTPrimed.llIlllllIIlIII[EntityTNTPrimed.llIlllllIIlIlI[0]]);
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityTNTPrimed.llIlllllIIlIlI[2] != 0;
    }
}
