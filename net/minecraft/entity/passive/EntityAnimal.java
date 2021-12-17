// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;

public abstract class EntityAnimal extends EntityAgeable implements IAnimals
{
    private /* synthetic */ int inLove;
    private static final /* synthetic */ String[] lllIIIllIIIlII;
    protected /* synthetic */ Block spawnableBlock;
    private static final /* synthetic */ int[] lllIIIllIIIlIl;
    private /* synthetic */ EntityPlayer playerInLove;
    
    private static boolean lIIlllIlllIIlllI(final int llllllllllllIllIIIIIIIIllIIlIlll) {
        return llllllllllllIllIIIIIIIIllIIlIlll != 0;
    }
    
    @Override
    public int getTalkInterval() {
        return EntityAnimal.lllIIIllIIIlIl[4];
    }
    
    @Override
    protected boolean canDespawn() {
        return EntityAnimal.lllIIIllIIIlIl[0] != 0;
    }
    
    public void resetInLove() {
        this.inLove = EntityAnimal.lllIIIllIIIlIl[0];
    }
    
    private static boolean lIIlllIlllIlIIlI(final int llllllllllllIllIIIIIIIIllIlIIllI, final int llllllllllllIllIIIIIIIIllIlIIlIl) {
        return llllllllllllIllIIIIIIIIllIlIIllI > llllllllllllIllIIIIIIIIllIlIIlIl;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIIIIIIIlIIIIlIIII) {
        super.readEntityFromNBT(llllllllllllIllIIIIIIIlIIIIlIIII);
        this.inLove = llllllllllllIllIIIIIIIlIIIIlIIII.getInteger(EntityAnimal.lllIIIllIIIlII[EntityAnimal.lllIIIllIIIlIl[1]]);
    }
    
    private static void lIIlllIlllIIllIl() {
        (lllIIIllIIIlIl = new int[11])[0] = ((0xF9 ^ 0x8C ^ (0x8E ^ 0xA5)) & (68 + 132 - 39 + 72 ^ 83 + 27 - 4 + 77 ^ -" ".length()) & (((91 + 93 - 98 + 42 ^ 60 + 50 - 18 + 44) & (54 + 23 - 21 + 107 ^ 87 + 43 - 71 + 112 ^ -" ".length())) ^ -" ".length()));
        EntityAnimal.lllIIIllIIIlIl[1] = " ".length();
        EntityAnimal.lllIIIllIIIlIl[2] = (0x18 ^ 0x56 ^ (0x6F ^ 0x2B));
        EntityAnimal.lllIIIllIIIlIl[3] = (0x96 ^ 0x9E);
        EntityAnimal.lllIIIllIIIlIl[4] = (0xCC ^ 0xB4);
        EntityAnimal.lllIIIllIIIlIl[5] = "   ".length();
        EntityAnimal.lllIIIllIIIlIl[6] = (0x9F ^ 0xBB ^ (0x9B ^ 0xAB));
        EntityAnimal.lllIIIllIIIlIl[7] = (0xFFFF9F78 & 0x62DF);
        EntityAnimal.lllIIIllIIIlIl[8] = (0x38 ^ 0x45 ^ (0x4A ^ 0x25));
        EntityAnimal.lllIIIllIIIlIl[9] = (0xA9 ^ 0xAE);
        EntityAnimal.lllIIIllIIIlIl[10] = "  ".length();
    }
    
    private static boolean lIIlllIlllIlIlII(final Object llllllllllllIllIIIIIIIIllIIllIll) {
        return llllllllllllIllIIIIIIIIllIIllIll != null;
    }
    
    private static boolean lIIlllIlllIlIIII(final int llllllllllllIllIIIIIIIIllIIlIlIl) {
        return llllllllllllIllIIIIIIIIllIIlIlIl == 0;
    }
    
    private static boolean lIIlllIlllIlIIIl(final Object llllllllllllIllIIIIIIIIllIIllllI, final Object llllllllllllIllIIIIIIIIllIIlllIl) {
        return llllllllllllIllIIIIIIIIllIIllllI == llllllllllllIllIIIIIIIIllIIlllIl;
    }
    
    private static boolean lIIlllIlllIIllll(final int llllllllllllIllIIIIIIIIllIIlIIIl) {
        return llllllllllllIllIIIIIIIIllIIlIIIl > 0;
    }
    
    @Override
    protected int getExperiencePoints(final EntityPlayer llllllllllllIllIIIIIIIIllllllIlI) {
        return EntityAnimal.lllIIIllIIIlIl[1] + this.worldObj.rand.nextInt(EntityAnimal.lllIIIllIIIlIl[5]);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIIIIIIIlIIIIlIllI) {
        super.writeEntityToNBT(llllllllllllIllIIIIIIIlIIIIlIllI);
        llllllllllllIllIIIIIIIlIIIIlIllI.setInteger(EntityAnimal.lllIIIllIIIlII[EntityAnimal.lllIIIllIIIlIl[0]], this.inLove);
    }
    
    @Override
    protected void updateAITasks() {
        if (lIIlllIlllIIlllI(this.getGrowingAge())) {
            this.inLove = EntityAnimal.lllIIIllIIIlIl[0];
        }
        super.updateAITasks();
    }
    
    public boolean isBreedingItem(final ItemStack llllllllllllIllIIIIIIIIlllllIllI) {
        int n;
        if (lIIlllIlllIlIIll(llllllllllllIllIIIIIIIIlllllIllI)) {
            n = EntityAnimal.lllIIIllIIIlIl[0];
            "".length();
            if (((0xF ^ 0x1) & ~(0xA2 ^ 0xAC)) != 0x0) {
                return ((0x6C ^ 0x50) & ~(0x3B ^ 0x7)) != 0x0;
            }
        }
        else if (lIIlllIlllIlIIIl(llllllllllllIllIIIIIIIIlllllIllI.getItem(), Items.wheat)) {
            n = EntityAnimal.lllIIIllIIIlIl[1];
            "".length();
            if (((0x72 ^ 0x5B) & ~(0x83 ^ 0xAA)) == " ".length()) {
                return ((0xE5 ^ 0xAC) & ~(0xCA ^ 0x83)) != 0x0;
            }
        }
        else {
            n = EntityAnimal.lllIIIllIIIlIl[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIllIIIIIIIlIIIlIIlII, final float llllllllllllIllIIIIIIIlIIIlIIIII) {
        if (lIIlllIlllIIlllI(this.isEntityInvulnerable(llllllllllllIllIIIIIIIlIIIlIIlII) ? 1 : 0)) {
            return EntityAnimal.lllIIIllIIIlIl[0] != 0;
        }
        this.inLove = EntityAnimal.lllIIIllIIIlIl[0];
        return super.attackEntityFrom(llllllllllllIllIIIIIIIlIIIlIIlII, llllllllllllIllIIIIIIIlIIIlIIIII);
    }
    
    static {
        lIIlllIlllIIllIl();
        lIIlllIlllIIllII();
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (lIIlllIlllIIlllI(this.getGrowingAge())) {
            this.inLove = EntityAnimal.lllIIIllIIIlIl[0];
        }
        if (lIIlllIlllIIllll(this.inLove)) {
            this.inLove -= EntityAnimal.lllIIIllIIIlIl[1];
            if (lIIlllIlllIlIIII(this.inLove % EntityAnimal.lllIIIllIIIlIl[2])) {
                final double llllllllllllIllIIIIIIIlIIIlIllll = this.rand.nextGaussian() * 0.02;
                final double llllllllllllIllIIIIIIIlIIIlIlllI = this.rand.nextGaussian() * 0.02;
                final double llllllllllllIllIIIIIIIlIIIlIllIl = this.rand.nextGaussian() * 0.02;
                this.worldObj.spawnParticle(EnumParticleTypes.HEART, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width, this.posY + 0.5 + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width, llllllllllllIllIIIIIIIlIIIlIllll, llllllllllllIllIIIIIIIlIIIlIlllI, llllllllllllIllIIIIIIIlIIIlIllIl, new int[EntityAnimal.lllIIIllIIIlIl[0]]);
            }
        }
    }
    
    private static boolean lIIlllIlllIlIlll(final int llllllllllllIllIIIIIIIIllIlIlllI, final int llllllllllllIllIIIIIIIIllIlIllIl) {
        return llllllllllllIllIIIIIIIIllIlIlllI == llllllllllllIllIIIIIIIIllIlIllIl;
    }
    
    @Override
    public boolean interact(final EntityPlayer llllllllllllIllIIIIIIIIlllllIIII) {
        final ItemStack llllllllllllIllIIIIIIIIllllIllll = llllllllllllIllIIIIIIIIlllllIIII.inventory.getCurrentItem();
        if (lIIlllIlllIlIlII(llllllllllllIllIIIIIIIIllllIllll)) {
            if (lIIlllIlllIIlllI(this.isBreedingItem(llllllllllllIllIIIIIIIIllllIllll) ? 1 : 0) && lIIlllIlllIlIIII(this.getGrowingAge()) && lIIlllIlllIlIlIl(this.inLove)) {
                this.consumeItemFromStack(llllllllllllIllIIIIIIIIlllllIIII, llllllllllllIllIIIIIIIIllllIllll);
                this.setInLove(llllllllllllIllIIIIIIIIlllllIIII);
                return EntityAnimal.lllIIIllIIIlIl[1] != 0;
            }
            if (lIIlllIlllIIlllI(this.isChild() ? 1 : 0) && lIIlllIlllIIlllI(this.isBreedingItem(llllllllllllIllIIIIIIIIllllIllll) ? 1 : 0)) {
                this.consumeItemFromStack(llllllllllllIllIIIIIIIIlllllIIII, llllllllllllIllIIIIIIIIllllIllll);
                this.func_175501_a((int)(-this.getGrowingAge() / EntityAnimal.lllIIIllIIIlIl[6] * 0.1f), (boolean)(EntityAnimal.lllIIIllIIIlIl[1] != 0));
                return EntityAnimal.lllIIIllIIIlIl[1] != 0;
            }
        }
        return super.interact(llllllllllllIllIIIIIIIIlllllIIII);
    }
    
    private static boolean lIIlllIlllIlIllI(final Object llllllllllllIllIIIIIIIIllIlIIIlI, final Object llllllllllllIllIIIIIIIIllIlIIIIl) {
        return llllllllllllIllIIIIIIIIllIlIIIlI != llllllllllllIllIIIIIIIIllIlIIIIl;
    }
    
    @Override
    public float getBlockPathWeight(final BlockPos llllllllllllIllIIIIIIIlIIIIlllII) {
        float n;
        if (lIIlllIlllIlIIIl(this.worldObj.getBlockState(llllllllllllIllIIIIIIIlIIIIlllII.down()).getBlock(), Blocks.grass)) {
            n = 10.0f;
            "".length();
            if ("   ".length() != "   ".length()) {
                return 0.0f;
            }
        }
        else {
            n = this.worldObj.getLightBrightness(llllllllllllIllIIIIIIIlIIIIlllII) - 0.5f;
        }
        return n;
    }
    
    public boolean canMateWith(final EntityAnimal llllllllllllIllIIIIIIIIlllIlIIlI) {
        int n;
        if (lIIlllIlllIlIIIl(llllllllllllIllIIIIIIIIlllIlIIlI, this)) {
            n = EntityAnimal.lllIIIllIIIlIl[0];
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0x4B ^ 0x5) & ~(0x2A ^ 0x64)) != 0x0;
            }
        }
        else if (lIIlllIlllIlIllI(llllllllllllIllIIIIIIIIlllIlIIlI.getClass(), this.getClass())) {
            n = EntityAnimal.lllIIIllIIIlIl[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((65 + 126 - 83 + 26 ^ 185 + 168 - 338 + 173) & (0xE8 ^ 0x84 ^ (0x4C ^ 0x1A) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIlllIlllIIlllI(this.isInLove() ? 1 : 0) && lIIlllIlllIIlllI(llllllllllllIllIIIIIIIIlllIlIIlI.isInLove() ? 1 : 0)) {
            n = EntityAnimal.lllIIIllIIIlIl[1];
            "".length();
            if ((0x4B ^ 0x10 ^ (0xC1 ^ 0x9E)) == -" ".length()) {
                return (("  ".length() ^ (0x50 ^ 0x43)) & (0x3D ^ 0x0 ^ (0x5C ^ 0x70) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAnimal.lllIIIllIIIlIl[0];
        }
        return n != 0;
    }
    
    private static void lIIlllIlllIIllII() {
        (lllIIIllIIIlII = new String[EntityAnimal.lllIIIllIIIlIl[10]])[EntityAnimal.lllIIIllIIIlIl[0]] = lIIlllIlllIIlIll("jHMe/KbKVk8=", "LaGee");
        EntityAnimal.lllIIIllIIIlII[EntityAnimal.lllIIIllIIIlIl[1]] = lIIlllIlllIIlIll("2Cn+19H6Q/U=", "GxfAg");
    }
    
    public boolean isInLove() {
        if (lIIlllIlllIIllll(this.inLove)) {
            return EntityAnimal.lllIIIllIIIlIl[1] != 0;
        }
        return EntityAnimal.lllIIIllIIIlIl[0] != 0;
    }
    
    public EntityAnimal(final World llllllllllllIllIIIIIIIlIIIlllIlI) {
        super(llllllllllllIllIIIIIIIlIIIlllIlI);
        this.spawnableBlock = Blocks.grass;
    }
    
    private static boolean lIIlllIlllIllIII(final int llllllllllllIllIIIIIIIIllIlIlIlI, final int llllllllllllIllIIIIIIIIllIlIlIIl) {
        return llllllllllllIllIIIIIIIIllIlIlIlI >= llllllllllllIllIIIIIIIIllIlIlIIl;
    }
    
    private static String lIIlllIlllIIlIll(final String llllllllllllIllIIIIIIIIllIllIllI, final String llllllllllllIllIIIIIIIIllIllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIIIllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIIIllIlllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIIIllIlllIII.init(EntityAnimal.lllIIIllIIIlIl[10], llllllllllllIllIIIIIIIIllIlllIIl);
            return new String(llllllllllllIllIIIIIIIIllIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIIIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIIIllIllIlll) {
            llllllllllllIllIIIIIIIIllIllIlll.printStackTrace();
            return null;
        }
    }
    
    protected void consumeItemFromStack(final EntityPlayer llllllllllllIllIIIIIIIIllllIIllI, final ItemStack llllllllllllIllIIIIIIIIllllIIlIl) {
        if (lIIlllIlllIlIIII(llllllllllllIllIIIIIIIIllllIIllI.capabilities.isCreativeMode ? 1 : 0)) {
            llllllllllllIllIIIIIIIIllllIIlIl.stackSize -= EntityAnimal.lllIIIllIIIlIl[1];
            if (lIIlllIlllIlIlIl(llllllllllllIllIIIIIIIIllllIIlIl.stackSize)) {
                llllllllllllIllIIIIIIIIllllIIllI.inventory.setInventorySlotContents(llllllllllllIllIIIIIIIIllllIIllI.inventory.currentItem, null);
            }
        }
    }
    
    public EntityPlayer getPlayerInLove() {
        return this.playerInLove;
    }
    
    private static boolean lIIlllIlllIlIlIl(final int llllllllllllIllIIIIIIIIllIIlIIll) {
        return llllllllllllIllIIIIIIIIllIIlIIll <= 0;
    }
    
    @Override
    public void handleStatusUpdate(final byte llllllllllllIllIIIIIIIIlllIIlIII) {
        if (lIIlllIlllIlIlll(llllllllllllIllIIIIIIIIlllIIlIII, EntityAnimal.lllIIIllIIIlIl[8])) {
            int llllllllllllIllIIIIIIIIlllIIIlll = EntityAnimal.lllIIIllIIIlIl[0];
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
            while (!lIIlllIlllIllIII(llllllllllllIllIIIIIIIIlllIIIlll, EntityAnimal.lllIIIllIIIlIl[9])) {
                final double llllllllllllIllIIIIIIIIlllIIIllI = this.rand.nextGaussian() * 0.02;
                final double llllllllllllIllIIIIIIIIlllIIIlIl = this.rand.nextGaussian() * 0.02;
                final double llllllllllllIllIIIIIIIIlllIIIlII = this.rand.nextGaussian() * 0.02;
                this.worldObj.spawnParticle(EnumParticleTypes.HEART, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width, this.posY + 0.5 + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width, llllllllllllIllIIIIIIIIlllIIIllI, llllllllllllIllIIIIIIIIlllIIIlIl, llllllllllllIllIIIIIIIIlllIIIlII, new int[EntityAnimal.lllIIIllIIIlIl[0]]);
                ++llllllllllllIllIIIIIIIIlllIIIlll;
            }
            "".length();
            if ("   ".length() > (0x88 ^ 0x8C)) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(llllllllllllIllIIIIIIIIlllIIlIII);
        }
    }
    
    private static boolean lIIlllIlllIlIIll(final Object llllllllllllIllIIIIIIIIllIIllIIl) {
        return llllllllllllIllIIIIIIIIllIIllIIl == null;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        final int llllllllllllIllIIIIIIIlIIIIIIlll = MathHelper.floor_double(this.posX);
        final int llllllllllllIllIIIIIIIlIIIIIIllI = MathHelper.floor_double(this.getEntityBoundingBox().minY);
        final int llllllllllllIllIIIIIIIlIIIIIIlIl = MathHelper.floor_double(this.posZ);
        final BlockPos llllllllllllIllIIIIIIIlIIIIIIlII = new BlockPos(llllllllllllIllIIIIIIIlIIIIIIlll, llllllllllllIllIIIIIIIlIIIIIIllI, llllllllllllIllIIIIIIIlIIIIIIlIl);
        if (lIIlllIlllIlIIIl(this.worldObj.getBlockState(llllllllllllIllIIIIIIIlIIIIIIlII.down()).getBlock(), this.spawnableBlock) && lIIlllIlllIlIIlI(this.worldObj.getLight(llllllllllllIllIIIIIIIlIIIIIIlII), EntityAnimal.lllIIIllIIIlIl[3]) && lIIlllIlllIIlllI(super.getCanSpawnHere() ? 1 : 0)) {
            return EntityAnimal.lllIIIllIIIlIl[1] != 0;
        }
        return EntityAnimal.lllIIIllIIIlIl[0] != 0;
    }
    
    public void setInLove(final EntityPlayer llllllllllllIllIIIIIIIIlllIlllll) {
        this.inLove = EntityAnimal.lllIIIllIIIlIl[7];
        this.playerInLove = llllllllllllIllIIIIIIIIlllIlllll;
        this.worldObj.setEntityState(this, (byte)EntityAnimal.lllIIIllIIIlIl[8]);
    }
}
