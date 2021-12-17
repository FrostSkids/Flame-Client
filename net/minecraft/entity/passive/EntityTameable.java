// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import java.util.Arrays;
import net.minecraft.world.World;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.scoreboard.Team;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import java.util.UUID;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.IEntityOwnable;

public abstract class EntityTameable extends EntityAnimal implements IEntityOwnable
{
    private static final /* synthetic */ String[] lIIIlIIllIlllI;
    private static final /* synthetic */ int[] lIIIlIIlllIIlI;
    protected /* synthetic */ EntityAISit aiSit;
    
    protected void playTameEffect(final boolean lllllllllllllIlIIIlIlIIIIIIlIlII) {
        EnumParticleTypes lllllllllllllIlIIIlIlIIIIIIllIlI = EnumParticleTypes.HEART;
        if (lIlllllllIlIIIl(lllllllllllllIlIIIlIlIIIIIIlIlII ? 1 : 0)) {
            lllllllllllllIlIIIlIlIIIIIIllIlI = EnumParticleTypes.SMOKE_NORMAL;
        }
        int lllllllllllllIlIIIlIlIIIIIIllIIl = EntityTameable.lIIIlIIlllIIlI[1];
        "".length();
        if ((0x65 ^ 0x60) <= 0) {
            return;
        }
        while (!lIlllllllIlIIlI(lllllllllllllIlIIIlIlIIIIIIllIIl, EntityTameable.lIIIlIIlllIIlI[10])) {
            final double lllllllllllllIlIIIlIlIIIIIIllIII = this.rand.nextGaussian() * 0.02;
            final double lllllllllllllIlIIIlIlIIIIIIlIlll = this.rand.nextGaussian() * 0.02;
            final double lllllllllllllIlIIIlIlIIIIIIlIllI = this.rand.nextGaussian() * 0.02;
            this.worldObj.spawnParticle(lllllllllllllIlIIIlIlIIIIIIllIlI, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width, this.posY + 0.5 + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width, lllllllllllllIlIIIlIlIIIIIIllIII, lllllllllllllIlIIIlIlIIIIIIlIlll, lllllllllllllIlIIIlIlIIIIIIlIllI, new int[EntityTameable.lIIIlIIlllIIlI[1]]);
            ++lllllllllllllIlIIIlIlIIIIIIllIIl;
        }
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIIlIlIIIIIllIIlI) {
        super.writeEntityToNBT(lllllllllllllIlIIIlIlIIIIIllIIlI);
        if (lIlllllllIIllIl(this.getOwnerId())) {
            lllllllllllllIlIIIlIlIIIIIllIIlI.setString(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[3]], EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[4]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIlIIIlIlIIIIIllIIlI.setString(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[5]], this.getOwnerId());
        }
        lllllllllllllIlIIIlIlIIIIIllIIlI.setBoolean(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[6]], this.isSitting());
    }
    
    @Override
    public EntityLivingBase getOwner() {
        try {
            final UUID lllllllllllllIlIIIlIIllllllIIIll = UUID.fromString(this.getOwnerId());
            EntityLivingBase playerEntityByUUID;
            if (lIlllllllIIllIl(lllllllllllllIlIIIlIIllllllIIIll)) {
                playerEntityByUUID = null;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            else {
                playerEntityByUUID = this.worldObj.getPlayerEntityByUUID(lllllllllllllIlIIIlIIllllllIIIll);
            }
            return playerEntityByUUID;
        }
        catch (IllegalArgumentException lllllllllllllIlIIIlIIllllllIIIlI) {
            return null;
        }
    }
    
    @Override
    public void onDeath(final DamageSource lllllllllllllIlIIIlIIlllllIIIIIl) {
        if (lIlllllllIlIIIl(this.worldObj.isRemote ? 1 : 0) && lIlllllllIIllll(this.worldObj.getGameRules().getBoolean(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[15]]) ? 1 : 0) && lIlllllllIIllll(this.hasCustomName() ? 1 : 0) && lIlllllllIIllll((this.getOwner() instanceof EntityPlayerMP) ? 1 : 0)) {
            ((EntityPlayerMP)this.getOwner()).addChatMessage(this.getCombatTracker().getDeathMessage());
        }
        super.onDeath(lllllllllllllIlIIIlIIlllllIIIIIl);
    }
    
    public void setSitting(final boolean lllllllllllllIlIIIlIIlllllllIIIl) {
        final byte lllllllllllllIlIIIlIIlllllllIIll = this.dataWatcher.getWatchableObjectByte(EntityTameable.lIIIlIIlllIIlI[0]);
        if (lIlllllllIIllll(lllllllllllllIlIIIlIIlllllllIIIl ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityTameable.lIIIlIIlllIIlI[0], (byte)(lllllllllllllIlIIIlIIlllllllIIll | EntityTameable.lIIIlIIlllIIlI[3]));
            "".length();
            if (((0x59 ^ 0x2) & ~(0x2B ^ 0x70)) != 0x0) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityTameable.lIIIlIIlllIIlI[0], (byte)(lllllllllllllIlIIIlIIlllllllIIll & EntityTameable.lIIIlIIlllIIlI[14]));
        }
    }
    
    public boolean shouldAttackEntity(final EntityLivingBase lllllllllllllIlIIIlIIlllllIlIlIl, final EntityLivingBase lllllllllllllIlIIIlIIlllllIlIlII) {
        return EntityTameable.lIIIlIIlllIIlI[3] != 0;
    }
    
    private static boolean lIlllllllIlIlll(final int lllllllllllllIlIIIlIIllllIIIIIII, final int lllllllllllllIlIIIlIIlllIlllllll) {
        return lllllllllllllIlIIIlIIllllIIIIIII < lllllllllllllIlIIIlIIlllIlllllll;
    }
    
    public EntityAISit getAISit() {
        return this.aiSit;
    }
    
    private static void lIlllllllIIllII() {
        (lIIIlIIlllIIlI = new int[17])[0] = (0x74 ^ 0x64);
        EntityTameable.lIIIlIIlllIIlI[1] = ((0x4C ^ 0x1D) & ~(0x28 ^ 0x79));
        EntityTameable.lIIIlIIlllIIlI[2] = (0x83 ^ 0x91 ^ "   ".length());
        EntityTameable.lIIIlIIlllIIlI[3] = " ".length();
        EntityTameable.lIIIlIIlllIIlI[4] = "  ".length();
        EntityTameable.lIIIlIIlllIIlI[5] = "   ".length();
        EntityTameable.lIIIlIIlllIIlI[6] = (0x5F ^ 0x5B);
        EntityTameable.lIIIlIIlllIIlI[7] = (0x10 ^ 0x15);
        EntityTameable.lIIIlIIlllIIlI[8] = (0x60 ^ 0x66);
        EntityTameable.lIIIlIIlllIIlI[9] = (0x1D ^ 0x47 ^ (0xDC ^ 0x8E));
        EntityTameable.lIIIlIIlllIIlI[10] = (0x27 ^ 0x2E ^ (0x5A ^ 0x54));
        EntityTameable.lIIIlIIlllIIlI[11] = (0xB8 ^ 0xB1);
        EntityTameable.lIIIlIIlllIIlI[12] = (0x3D ^ 0x37);
        EntityTameable.lIIIlIIlllIIlI[13] = -(0x25 ^ 0x20);
        EntityTameable.lIIIlIIlllIIlI[14] = -"  ".length();
        EntityTameable.lIIIlIIlllIIlI[15] = (0x90 ^ 0x9B);
        EntityTameable.lIIIlIIlllIIlI[16] = (145 + 4 + 19 + 1 ^ 52 + 28 + 4 + 81);
    }
    
    private static void lIlllllllIIlIlI() {
        (lIIIlIIllIlllI = new String[EntityTameable.lIIIlIIlllIIlI[16]])[EntityTameable.lIIIlIIlllIIlI[1]] = lIlllllllIIIlll("2Gi7J9QxHl0=", "olkKy");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[3]] = lIlllllllIIlIII("vv4FKDy03ixhzPc/rEU5NA==", "wpXWJ");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[4]] = lIlllllllIIIlll("cdD4UgGKJ8U=", "xHOpy");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[5]] = lIlllllllIIlIIl("PTAUNyonEjMW", "rGzRX");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[6]] = lIlllllllIIIlll("/qkvelQ+VEc=", "ifnRf");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[7]] = lIlllllllIIlIII("BihNCNzbS7s=", "MverM");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[8]] = lIlllllllIIlIIl("DQ4ZPxAXLD4e", "BywZb");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[10]] = lIlllllllIIlIII("WBNOfxeBOy15+yUXbZ6cdQ==", "XmBUx");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[9]] = lIlllllllIIlIIl("ATApFCQ=", "NGGqV");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[11]] = lIlllllllIIlIII("eYreqLUdiuA=", "QvNmI");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[12]] = lIlllllllIIlIII("nZ66gkmL15A=", "rtgDy");
        EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[15]] = lIlllllllIIIlll("Uc8CKERzRl1RNodMADMOMV2aCeMM08Hx", "wPpRl");
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIIlIlIIIIIlIIllI) {
        super.readEntityFromNBT(lllllllllllllIlIIIlIlIIIIIlIIllI);
        String lllllllllllllIlIIIlIlIIIIIlIlIIl = EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[7]];
        if (lIlllllllIIllll(lllllllllllllIlIIIlIlIIIIIlIIllI.hasKey(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[8]], EntityTameable.lIIIlIIlllIIlI[9]) ? 1 : 0)) {
            lllllllllllllIlIIIlIlIIIIIlIlIIl = lllllllllllllIlIIIlIlIIIIIlIIllI.getString(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[10]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final String lllllllllllllIlIIIlIlIIIIIlIlIII = lllllllllllllIlIIIlIlIIIIIlIIllI.getString(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[9]]);
            lllllllllllllIlIIIlIlIIIIIlIlIIl = PreYggdrasilConverter.getStringUUIDFromName(lllllllllllllIlIIIlIlIIIIIlIlIII);
        }
        if (lIlllllllIlIIII(lllllllllllllIlIIIlIlIIIIIlIlIIl.length())) {
            this.setOwnerId(lllllllllllllIlIIIlIlIIIIIlIlIIl);
            this.setTamed((boolean)(EntityTameable.lIIIlIIlllIIlI[3] != 0));
        }
        this.aiSit.setSitting(lllllllllllllIlIIIlIlIIIIIlIIllI.getBoolean(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[11]]));
        this.setSitting(lllllllllllllIlIIIlIlIIIIIlIIllI.getBoolean(EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[12]]));
    }
    
    protected void setupTamedAI() {
    }
    
    static {
        lIlllllllIIllII();
        lIlllllllIIlIlI();
    }
    
    private static boolean lIlllllllIIllIl(final Object lllllllllllllIlIIIlIIlllIlllIlll) {
        return lllllllllllllIlIIIlIIlllIlllIlll == null;
    }
    
    public boolean isOwner(final EntityLivingBase lllllllllllllIlIIIlIIlllllIllIlI) {
        if (lIlllllllIlIlIl(lllllllllllllIlIIIlIIlllllIllIlI, this.getOwner())) {
            return EntityTameable.lIIIlIIlllIIlI[3] != 0;
        }
        return EntityTameable.lIIIlIIlllIIlI[1] != 0;
    }
    
    public boolean isSitting() {
        if (lIlllllllIIllll(this.dataWatcher.getWatchableObjectByte(EntityTameable.lIIIlIIlllIIlI[0]) & EntityTameable.lIIIlIIlllIIlI[3])) {
            return EntityTameable.lIIIlIIlllIIlI[3] != 0;
        }
        return EntityTameable.lIIIlIIlllIIlI[1] != 0;
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIlIIIlIlIIIIIIIlIIl) {
        if (lIlllllllIlIIll(lllllllllllllIlIIIlIlIIIIIIIlIIl, EntityTameable.lIIIlIIlllIIlI[10])) {
            this.playTameEffect((boolean)(EntityTameable.lIIIlIIlllIIlI[3] != 0));
            "".length();
            if (((0x8C ^ 0xBF) & ~(0xAE ^ 0x9D)) != 0x0) {
                return;
            }
        }
        else if (lIlllllllIlIIll(lllllllllllllIlIIIlIlIIIIIIIlIIl, EntityTameable.lIIIlIIlllIIlI[8])) {
            this.playTameEffect((boolean)(EntityTameable.lIIIlIIlllIIlI[1] != 0));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIlIIIlIlIIIIIIIlIIl);
        }
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityTameable.lIIIlIIlllIIlI[0], (byte)EntityTameable.lIIIlIIlllIIlI[1]);
        this.dataWatcher.addObject(EntityTameable.lIIIlIIlllIIlI[2], EntityTameable.lIIIlIIllIlllI[EntityTameable.lIIIlIIlllIIlI[1]]);
    }
    
    private static String lIlllllllIIlIIl(String lllllllllllllIlIIIlIIllllIIlIIll, final String lllllllllllllIlIIIlIIllllIIlIlll) {
        lllllllllllllIlIIIlIIllllIIlIIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIlIIllllIIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIIllllIIlIllI = new StringBuilder();
        final char[] lllllllllllllIlIIIlIIllllIIlIlIl = lllllllllllllIlIIIlIIllllIIlIlll.toCharArray();
        int lllllllllllllIlIIIlIIllllIIlIlII = EntityTameable.lIIIlIIlllIIlI[1];
        final long lllllllllllllIlIIIlIIllllIIIlllI = (Object)((String)lllllllllllllIlIIIlIIllllIIlIIll).toCharArray();
        final float lllllllllllllIlIIIlIIllllIIIllIl = lllllllllllllIlIIIlIIllllIIIlllI.length;
        int lllllllllllllIlIIIlIIllllIIIllII = EntityTameable.lIIIlIIlllIIlI[1];
        while (lIlllllllIlIlll(lllllllllllllIlIIIlIIllllIIIllII, (int)lllllllllllllIlIIIlIIllllIIIllIl)) {
            final char lllllllllllllIlIIIlIIllllIIllIIl = lllllllllllllIlIIIlIIllllIIIlllI[lllllllllllllIlIIIlIIllllIIIllII];
            lllllllllllllIlIIIlIIllllIIlIllI.append((char)(lllllllllllllIlIIIlIIllllIIllIIl ^ lllllllllllllIlIIIlIIllllIIlIlIl[lllllllllllllIlIIIlIIllllIIlIlII % lllllllllllllIlIIIlIIllllIIlIlIl.length]));
            "".length();
            ++lllllllllllllIlIIIlIIllllIIlIlII;
            ++lllllllllllllIlIIIlIIllllIIIllII;
            "".length();
            if (((0x48 ^ 0x3A ^ (0xE4 ^ 0xB0)) & (36 + 108 - 48 + 65 ^ 103 + 104 - 202 + 130 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIIllllIIlIllI);
    }
    
    public boolean isTamed() {
        if (lIlllllllIIllll(this.dataWatcher.getWatchableObjectByte(EntityTameable.lIIIlIIlllIIlI[0]) & EntityTameable.lIIIlIIlllIIlI[6])) {
            return EntityTameable.lIIIlIIlllIIlI[3] != 0;
        }
        return EntityTameable.lIIIlIIlllIIlI[1] != 0;
    }
    
    @Override
    public Team getTeam() {
        if (lIlllllllIIllll(this.isTamed() ? 1 : 0)) {
            final EntityLivingBase lllllllllllllIlIIIlIIlllllIlIIII = this.getOwner();
            if (lIlllllllIlIllI(lllllllllllllIlIIIlIIlllllIlIIII)) {
                return lllllllllllllIlIIIlIIlllllIlIIII.getTeam();
            }
        }
        return super.getTeam();
    }
    
    private static boolean lIlllllllIlIIIl(final int lllllllllllllIlIIIlIIlllIlllIIll) {
        return lllllllllllllIlIIIlIIlllIlllIIll == 0;
    }
    
    private static boolean lIlllllllIlIIll(final int lllllllllllllIlIIIlIIllllIIIlIII, final int lllllllllllllIlIIIlIIllllIIIIlll) {
        return lllllllllllllIlIIIlIIllllIIIlIII == lllllllllllllIlIIIlIIllllIIIIlll;
    }
    
    public void setOwnerId(final String lllllllllllllIlIIIlIIllllllIlIIl) {
        this.dataWatcher.updateObject(EntityTameable.lIIIlIIlllIIlI[2], lllllllllllllIlIIIlIIllllllIlIIl);
    }
    
    private static String lIlllllllIIIlll(final String lllllllllllllIlIIIlIIllllIllIIll, final String lllllllllllllIlIIIlIIllllIllIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIllllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIllllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIIllllIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIIllllIllIlll.init(EntityTameable.lIIIlIIlllIIlI[4], lllllllllllllIlIIIlIIllllIlllIII);
            return new String(lllllllllllllIlIIIlIIllllIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIllllIllIllI) {
            lllllllllllllIlIIIlIIllllIllIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllllllIIllll(final int lllllllllllllIlIIIlIIlllIlllIlIl) {
        return lllllllllllllIlIIIlIIlllIlllIlIl != 0;
    }
    
    @Override
    public String getOwnerId() {
        return this.dataWatcher.getWatchableObjectString(EntityTameable.lIIIlIIlllIIlI[2]);
    }
    
    public EntityTameable(final World lllllllllllllIlIIIlIlIIIIIlllIll) {
        super(lllllllllllllIlIIIlIlIIIIIlllIll);
        this.aiSit = new EntityAISit(this);
        this.setupTamedAI();
    }
    
    @Override
    public boolean isOnSameTeam(final EntityLivingBase lllllllllllllIlIIIlIIlllllIIlIIl) {
        if (lIlllllllIIllll(this.isTamed() ? 1 : 0)) {
            final EntityLivingBase lllllllllllllIlIIIlIIlllllIIlIII = this.getOwner();
            if (lIlllllllIlIlIl(lllllllllllllIlIIIlIIlllllIIlIIl, lllllllllllllIlIIIlIIlllllIIlIII)) {
                return EntityTameable.lIIIlIIlllIIlI[3] != 0;
            }
            if (lIlllllllIlIllI(lllllllllllllIlIIIlIIlllllIIlIII)) {
                return lllllllllllllIlIIIlIIlllllIIlIII.isOnSameTeam(lllllllllllllIlIIIlIIlllllIIlIIl);
            }
        }
        return super.isOnSameTeam(lllllllllllllIlIIIlIIlllllIIlIIl);
    }
    
    private static boolean lIlllllllIlIIII(final int lllllllllllllIlIIIlIIlllIlllIIIl) {
        return lllllllllllllIlIIIlIIlllIlllIIIl > 0;
    }
    
    private static boolean lIlllllllIlIllI(final Object lllllllllllllIlIIIlIIlllIllllIIl) {
        return lllllllllllllIlIIIlIIlllIllllIIl != null;
    }
    
    private static boolean lIlllllllIlIIlI(final int lllllllllllllIlIIIlIIllllIIIIlII, final int lllllllllllllIlIIIlIIllllIIIIIll) {
        return lllllllllllllIlIIIlIIllllIIIIlII >= lllllllllllllIlIIIlIIllllIIIIIll;
    }
    
    private static boolean lIlllllllIlIlIl(final Object lllllllllllllIlIIIlIIlllIlllllII, final Object lllllllllllllIlIIIlIIlllIllllIll) {
        return lllllllllllllIlIIIlIIlllIlllllII == lllllllllllllIlIIIlIIlllIllllIll;
    }
    
    private static String lIlllllllIIlIII(final String lllllllllllllIlIIIlIIllllIlIIllI, final String lllllllllllllIlIIIlIIllllIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIllllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), EntityTameable.lIIIlIIlllIIlI[9]), "DES");
            final Cipher lllllllllllllIlIIIlIIllllIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIIllllIlIlIlI.init(EntityTameable.lIIIlIIlllIIlI[4], lllllllllllllIlIIIlIIllllIlIlIll);
            return new String(lllllllllllllIlIIIlIIllllIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIllllIlIlIIl) {
            lllllllllllllIlIIIlIIllllIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    public void setTamed(final boolean lllllllllllllIlIIIlIlIIIIIIIIIIl) {
        final byte lllllllllllllIlIIIlIlIIIIIIIIIII = this.dataWatcher.getWatchableObjectByte(EntityTameable.lIIIlIIlllIIlI[0]);
        if (lIlllllllIIllll(lllllllllllllIlIIIlIlIIIIIIIIIIl ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityTameable.lIIIlIIlllIIlI[0], (byte)(lllllllllllllIlIIIlIlIIIIIIIIIII | EntityTameable.lIIIlIIlllIIlI[6]));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityTameable.lIIIlIIlllIIlI[0], (byte)(lllllllllllllIlIIIlIlIIIIIIIIIII & EntityTameable.lIIIlIIlllIIlI[13]));
        }
        this.setupTamedAI();
    }
}
