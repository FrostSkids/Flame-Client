// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.nbt.NBTBase;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;

public class EntityFireworkRocket extends Entity
{
    private /* synthetic */ int fireworkAge;
    private /* synthetic */ int lifetime;
    private static final /* synthetic */ int[] lIIlIllllIlllI;
    private static final /* synthetic */ String[] lIIlIllllIllIl;
    
    private static boolean llIlIlIIlIIIIII(final int lllllllllllllIIlIlllllllIIllIIII, final int lllllllllllllIIlIlllllllIIlIllll) {
        return lllllllllllllIIlIlllllllIIllIIII == lllllllllllllIIlIlllllllIIlIllll;
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIIlIlllllllIllIlIII) {
        return super.getBrightnessForRender(lllllllllllllIIlIlllllllIllIlIII);
    }
    
    private static void llIlIlIIIllIlII() {
        (lIIlIllllIlllI = new int[12])[0] = (0x26 ^ 0x76 ^ (0xED ^ 0xB5));
        EntityFireworkRocket.lIIlIllllIlllI[1] = (0x71 ^ 0x74);
        EntityFireworkRocket.lIIlIllllIlllI[2] = " ".length();
        EntityFireworkRocket.lIIlIllllIlllI[3] = ((0x5D ^ 0x59) & ~(0xAF ^ 0xAB));
        EntityFireworkRocket.lIIlIllllIlllI[4] = (0x8A ^ 0x86 ^ (0x3A ^ 0x3C));
        EntityFireworkRocket.lIIlIllllIlllI[5] = (0x1B ^ 0x1D);
        EntityFireworkRocket.lIIlIllllIlllI[6] = (0xA0 ^ 0xB7 ^ (0x50 ^ 0x40));
        EntityFireworkRocket.lIIlIllllIlllI[7] = "  ".length();
        EntityFireworkRocket.lIIlIllllIlllI[8] = (0x6A ^ 0x11 ^ (0x40 ^ 0x2A));
        EntityFireworkRocket.lIIlIllllIlllI[9] = "   ".length();
        EntityFireworkRocket.lIIlIllllIlllI[10] = (0x76 ^ 0x72);
        EntityFireworkRocket.lIIlIllllIlllI[11] = (57 + 186 - 184 + 132 ^ 163 + 78 - 217 + 158);
    }
    
    @Override
    public float getBrightness(final float lllllllllllllIIlIlllllllIllIlllI) {
        return super.getBrightness(lllllllllllllIIlIlllllllIllIlllI);
    }
    
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlIlllllllIlllIlII) {
        this.fireworkAge = lllllllllllllIIlIlllllllIlllIlII.getInteger(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[6]]);
        this.lifetime = lllllllllllllIIlIlllllllIlllIlII.getInteger(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[0]]);
        final NBTTagCompound lllllllllllllIIlIlllllllIlllIlll = lllllllllllllIIlIlllllllIlllIlII.getCompoundTag(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[11]]);
        if (llIlIlIIIllIlll(lllllllllllllIIlIlllllllIlllIlll)) {
            final ItemStack lllllllllllllIIlIlllllllIlllIllI = ItemStack.loadItemStackFromNBT(lllllllllllllIIlIlllllllIlllIlll);
            if (llIlIlIIIllIlll(lllllllllllllIIlIlllllllIlllIllI)) {
                this.dataWatcher.updateObject(EntityFireworkRocket.lIIlIllllIlllI[0], lllllllllllllIIlIlllllllIlllIllI);
            }
        }
    }
    
    public EntityFireworkRocket(final World lllllllllllllIIlIllllllllIllIIlI, final double lllllllllllllIIlIllllllllIllIIIl, final double lllllllllllllIIlIllllllllIlllIIl, final double lllllllllllllIIlIllllllllIlIllll, final ItemStack lllllllllllllIIlIllllllllIlIlllI) {
        super(lllllllllllllIIlIllllllllIllIIlI);
        this.fireworkAge = EntityFireworkRocket.lIIlIllllIlllI[3];
        this.setSize(0.25f, 0.25f);
        this.setPosition(lllllllllllllIIlIllllllllIllIIIl, lllllllllllllIIlIllllllllIlllIIl, lllllllllllllIIlIllllllllIlIllll);
        int lllllllllllllIIlIllllllllIllIllI = EntityFireworkRocket.lIIlIllllIlllI[2];
        if (llIlIlIIIllIlll(lllllllllllllIIlIllllllllIlIlllI) && llIlIlIIIlllIII(lllllllllllllIIlIllllllllIlIlllI.hasTagCompound() ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityFireworkRocket.lIIlIllllIlllI[0], lllllllllllllIIlIllllllllIlIlllI);
            final NBTTagCompound lllllllllllllIIlIllllllllIllIlIl = lllllllllllllIIlIllllllllIlIlllI.getTagCompound();
            final NBTTagCompound lllllllllllllIIlIllllllllIllIlII = lllllllllllllIIlIllllllllIllIlIl.getCompoundTag(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[3]]);
            if (llIlIlIIIllIlll(lllllllllllllIIlIllllllllIllIlII)) {
                lllllllllllllIIlIllllllllIllIllI += lllllllllllllIIlIllllllllIllIlII.getByte(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[2]]);
            }
        }
        this.motionX = this.rand.nextGaussian() * 0.001;
        this.motionZ = this.rand.nextGaussian() * 0.001;
        this.motionY = 0.05;
        this.lifetime = EntityFireworkRocket.lIIlIllllIlllI[4] * lllllllllllllIIlIllllllllIllIllI + this.rand.nextInt(EntityFireworkRocket.lIIlIllllIlllI[5]) + this.rand.nextInt(EntityFireworkRocket.lIIlIllllIlllI[6]);
    }
    
    private static int llIlIlIIIlllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llIlIlIIIllIlll(final Object lllllllllllllIIlIlllllllIIlIIlIl) {
        return lllllllllllllIIlIlllllllIIlIIlIl != null;
    }
    
    private static boolean llIlIlIIIlllIlI(final int lllllllllllllIIlIlllllllIIlIIIIl) {
        return lllllllllllllIIlIlllllllIIlIIIIl == 0;
    }
    
    private static void llIlIlIIIllIIll() {
        (lIIlIllllIllIl = new String[EntityFireworkRocket.lIIlIllllIlllI[4]])[EntityFireworkRocket.lIIlIllllIlllI[3]] = llIlIlIIIllIIII("Xai+Ab8NUZLbpzcv3pVvBA==", "afMCX");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[2]] = llIlIlIIIllIIIl("NBQLMwAG", "rxbTh");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[7]] = llIlIlIIIllIIlI("DrKZeCN3gDoGvlchcjNq20Z6lW5EMycO", "YWljG");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[9]] = llIlIlIIIllIIIl("DwI2DSImGS8b", "IkDhU");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[10]] = llIlIlIIIllIIII("JjQC2N3FnWY=", "ZZTqY");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[1]] = llIlIlIIIllIIII("VQP2zKUT9z+alXJr/yaFog==", "ybqcY");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[5]] = llIlIlIIIllIIlI("WKFoMv02MD1+thTZ9qO3kw==", "FKvVW");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[6]] = llIlIlIIIllIIIl("Oh0FNg==", "vtcSe");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[0]] = llIlIlIIIllIIIl("HgMFPBA7BwY=", "RjcYD");
        EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[11]] = llIlIlIIIllIIII("w9O9ZfxvD934VSsf2ozzRw==", "xwvse");
    }
    
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlIllllllllIIIIIII) {
        lllllllllllllIIlIllllllllIIIIIII.setInteger(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[10]], this.fireworkAge);
        lllllllllllllIIlIllllllllIIIIIII.setInteger(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[1]], this.lifetime);
        final ItemStack lllllllllllllIIlIllllllllIIIIIll = this.dataWatcher.getWatchableObjectItemStack(EntityFireworkRocket.lIIlIllllIlllI[0]);
        if (llIlIlIIIllIlll(lllllllllllllIIlIllllllllIIIIIll)) {
            final NBTTagCompound lllllllllllllIIlIllllllllIIIIIlI = new NBTTagCompound();
            lllllllllllllIIlIllllllllIIIIIll.writeToNBT(lllllllllllllIIlIllllllllIIIIIlI);
            "".length();
            lllllllllllllIIlIllllllllIIIIIII.setTag(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[5]], lllllllllllllIIlIllllllllIIIIIlI);
        }
    }
    
    private static String llIlIlIIIllIIIl(String lllllllllllllIIlIlllllllIlIlIlIl, final String lllllllllllllIIlIlllllllIlIllIIl) {
        lllllllllllllIIlIlllllllIlIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlllllllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlllllllIlIllIII = new StringBuilder();
        final char[] lllllllllllllIIlIlllllllIlIlIlll = lllllllllllllIIlIlllllllIlIllIIl.toCharArray();
        int lllllllllllllIIlIlllllllIlIlIllI = EntityFireworkRocket.lIIlIllllIlllI[3];
        final Exception lllllllllllllIIlIlllllllIlIlIIII = (Object)lllllllllllllIIlIlllllllIlIlIlIl.toCharArray();
        final String lllllllllllllIIlIlllllllIlIIllll = (String)lllllllllllllIIlIlllllllIlIlIIII.length;
        float lllllllllllllIIlIlllllllIlIIlllI = EntityFireworkRocket.lIIlIllllIlllI[3];
        while (llIlIlIIIlllllI((int)lllllllllllllIIlIlllllllIlIIlllI, (int)lllllllllllllIIlIlllllllIlIIllll)) {
            final char lllllllllllllIIlIlllllllIlIllIll = lllllllllllllIIlIlllllllIlIlIIII[lllllllllllllIIlIlllllllIlIIlllI];
            lllllllllllllIIlIlllllllIlIllIII.append((char)(lllllllllllllIIlIlllllllIlIllIll ^ lllllllllllllIIlIlllllllIlIlIlll[lllllllllllllIIlIlllllllIlIlIllI % lllllllllllllIIlIlllllllIlIlIlll.length]));
            "".length();
            ++lllllllllllllIIlIlllllllIlIlIllI;
            ++lllllllllllllIIlIlllllllIlIIlllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlllllllIlIllIII);
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIIlIllllllllIIIllII) {
        if (llIlIlIIlIIIIII(lllllllllllllIIlIllllllllIIIllII, EntityFireworkRocket.lIIlIllllIlllI[8]) && llIlIlIIIlllIII(this.worldObj.isRemote ? 1 : 0)) {
            final ItemStack lllllllllllllIIlIllllllllIIIllll = this.dataWatcher.getWatchableObjectItemStack(EntityFireworkRocket.lIIlIllllIlllI[0]);
            NBTTagCompound lllllllllllllIIlIllllllllIIIlllI = null;
            if (llIlIlIIIllIlll(lllllllllllllIIlIllllllllIIIllll) && llIlIlIIIlllIII(lllllllllllllIIlIllllllllIIIllll.hasTagCompound() ? 1 : 0)) {
                lllllllllllllIIlIllllllllIIIlllI = lllllllllllllIIlIllllllllIIIllll.getTagCompound().getCompoundTag(EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[9]]);
            }
            this.worldObj.makeFireworks(this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ, lllllllllllllIIlIllllllllIIIlllI);
        }
        super.handleStatusUpdate(lllllllllllllIIlIllllllllIIIllII);
    }
    
    private static int llIlIlIIIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    protected void entityInit() {
        this.dataWatcher.addObjectByDataType(EntityFireworkRocket.lIIlIllllIlllI[0], EntityFireworkRocket.lIIlIllllIlllI[1]);
    }
    
    private static boolean llIlIlIIIllllll(final int lllllllllllllIIlIlllllllIIlIlIII, final int lllllllllllllIIlIlllllllIIlIIlll) {
        return lllllllllllllIIlIlllllllIIlIlIII > lllllllllllllIIlIlllllllIIlIIlll;
    }
    
    private static boolean llIlIlIIIllIllI(final int lllllllllllllIIlIlllllllIIIlllIl) {
        return lllllllllllllIIlIlllllllIIIlllIl < 0;
    }
    
    private static boolean llIlIlIIIlllllI(final int lllllllllllllIIlIlllllllIIlIllII, final int lllllllllllllIIlIlllllllIIlIlIll) {
        return lllllllllllllIIlIlllllllIIlIllII < lllllllllllllIIlIlllllllIIlIlIll;
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double lllllllllllllIIlIlllllllllIIIlll) {
        if (llIlIlIIIllIllI(llIlIlIIIllIlIl(lllllllllllllIIlIlllllllllIIIlll, 4096.0))) {
            return EntityFireworkRocket.lIIlIllllIlllI[2] != 0;
        }
        return EntityFireworkRocket.lIIlIllllIlllI[3] != 0;
    }
    
    static {
        llIlIlIIIllIlII();
        llIlIlIIIllIIll();
    }
    
    private static boolean llIlIlIIIlllIII(final int lllllllllllllIIlIlllllllIIlIIIll) {
        return lllllllllllllIIlIlllllllIIlIIIll != 0;
    }
    
    private static int llIlIlIIIllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public boolean canAttackWithItem() {
        return EntityFireworkRocket.lIIlIllllIlllI[3] != 0;
    }
    
    private static boolean llIlIlIIIllllIl(final int lllllllllllllIIlIlllllllIIIlllll) {
        return lllllllllllllIIlIlllllllIIIlllll >= 0;
    }
    
    private static String llIlIlIIIllIIII(final String lllllllllllllIIlIlllllllIlIIIIll, final String lllllllllllllIIlIlllllllIlIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlllllllIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlllllllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), EntityFireworkRocket.lIIlIllllIlllI[0]), "DES");
            final Cipher lllllllllllllIIlIlllllllIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllIIlIlllllllIlIIIlll.init(EntityFireworkRocket.lIIlIllllIlllI[7], lllllllllllllIIlIlllllllIlIIlIII);
            return new String(lllllllllllllIIlIlllllllIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlllllllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlllllllIlIIIllI) {
            lllllllllllllIIlIlllllllIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onUpdate() {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();
        this.motionX *= 1.15;
        this.motionZ *= 1.15;
        this.motionY += 0.04;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        final float lllllllllllllIIlIllllllllIIllIII = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(MathHelper.func_181159_b(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
        this.rotationPitch = (float)(MathHelper.func_181159_b(this.motionY, lllllllllllllIIlIllllllllIIllIII) * 180.0 / 3.141592653589793);
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!llIlIlIIIllllIl(llIlIlIIIlllIll(this.rotationPitch - this.prevRotationPitch, -180.0f))) {
            this.prevRotationPitch -= 360.0f;
        }
        "".length();
        if (-" ".length() >= "  ".length()) {
            return;
        }
        while (!llIlIlIIIllIllI(llIlIlIIIllllII(this.rotationPitch - this.prevRotationPitch, 180.0f))) {
            this.prevRotationPitch += 360.0f;
        }
        "".length();
        if (null != null) {
            return;
        }
        while (!llIlIlIIIllllIl(llIlIlIIIlllIll(this.rotationYaw - this.prevRotationYaw, -180.0f))) {
            this.prevRotationYaw -= 360.0f;
        }
        "".length();
        if ((0x8E ^ 0x8A) != (0x28 ^ 0x2C)) {
            return;
        }
        while (!llIlIlIIIllIllI(llIlIlIIIllllII(this.rotationYaw - this.prevRotationYaw, 180.0f))) {
            this.prevRotationYaw += 360.0f;
        }
        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
        if (llIlIlIIIlllIlI(this.fireworkAge) && llIlIlIIIlllIlI(this.isSilent() ? 1 : 0)) {
            this.worldObj.playSoundAtEntity(this, EntityFireworkRocket.lIIlIllllIllIl[EntityFireworkRocket.lIIlIllllIlllI[7]], 3.0f, 1.0f);
        }
        this.fireworkAge += EntityFireworkRocket.lIIlIllllIlllI[2];
        if (llIlIlIIIlllIII(this.worldObj.isRemote ? 1 : 0) && llIlIlIIIlllllI(this.fireworkAge % EntityFireworkRocket.lIIlIllllIlllI[7], EntityFireworkRocket.lIIlIllllIlllI[7])) {
            this.worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, this.posX, this.posY - 0.3, this.posZ, this.rand.nextGaussian() * 0.05, -this.motionY * 0.5, this.rand.nextGaussian() * 0.05, new int[EntityFireworkRocket.lIIlIllllIlllI[3]]);
        }
        if (llIlIlIIIlllIlI(this.worldObj.isRemote ? 1 : 0) && llIlIlIIIllllll(this.fireworkAge, this.lifetime)) {
            this.worldObj.setEntityState(this, (byte)EntityFireworkRocket.lIIlIllllIlllI[8]);
            this.setDead();
        }
    }
    
    private static int llIlIlIIIllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void setVelocity(final double lllllllllllllIIlIllllllllIIlllll, final double lllllllllllllIIlIllllllllIIllllI, final double lllllllllllllIIlIllllllllIIlllIl) {
        this.motionX = lllllllllllllIIlIllllllllIIlllll;
        this.motionY = lllllllllllllIIlIllllllllIIllllI;
        this.motionZ = lllllllllllllIIlIllllllllIIlllIl;
        if (llIlIlIIIlllIlI(llIlIlIIIlllIIl(this.prevRotationPitch, 0.0f)) && llIlIlIIIlllIlI(llIlIlIIIlllIIl(this.prevRotationYaw, 0.0f))) {
            final float lllllllllllllIIlIllllllllIlIIIIl = MathHelper.sqrt_double(lllllllllllllIIlIllllllllIIlllll * lllllllllllllIIlIllllllllIIlllll + lllllllllllllIIlIllllllllIIlllIl * lllllllllllllIIlIllllllllIIlllIl);
            final float n = (float)(MathHelper.func_181159_b(lllllllllllllIIlIllllllllIIlllll, lllllllllllllIIlIllllllllIIlllIl) * 180.0 / 3.141592653589793);
            this.rotationYaw = n;
            this.prevRotationYaw = n;
            final float n2 = (float)(MathHelper.func_181159_b(lllllllllllllIIlIllllllllIIllllI, lllllllllllllIIlIllllllllIlIIIIl) * 180.0 / 3.141592653589793);
            this.rotationPitch = n2;
            this.prevRotationPitch = n2;
        }
    }
    
    public EntityFireworkRocket(final World lllllllllllllIIlIlllllllllIIllll) {
        super(lllllllllllllIIlIlllllllllIIllll);
        this.setSize(0.25f, 0.25f);
    }
    
    private static String llIlIlIIIllIIlI(final String lllllllllllllIIlIlllllllIIlllIII, final String lllllllllllllIIlIlllllllIIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlllllllIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlllllllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlllllllIIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlllllllIIlllIlI.init(EntityFireworkRocket.lIIlIllllIlllI[7], lllllllllllllIIlIlllllllIIlllIll);
            return new String(lllllllllllllIIlIlllllllIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlllllllIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlllllllIIlllIIl) {
            lllllllllllllIIlIlllllllIIlllIIl.printStackTrace();
            return null;
        }
    }
}
