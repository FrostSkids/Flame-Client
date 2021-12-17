// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import java.util.Iterator;
import net.minecraft.entity.item.EntityMinecart;
import java.util.Collection;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumParticleTypes;
import com.google.common.collect.Lists;
import net.minecraft.world.World;
import net.minecraft.util.StringUtils;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityList;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;
import java.util.List;

public abstract class MobSpawnerBaseLogic
{
    private /* synthetic */ int minSpawnDelay;
    private /* synthetic */ int spawnRange;
    private /* synthetic */ int maxSpawnDelay;
    private final /* synthetic */ List<WeightedRandomMinecart> minecartToSpawn;
    private /* synthetic */ int maxNearbyEntities;
    private /* synthetic */ int spawnCount;
    private /* synthetic */ int activatingRangeFromPlayer;
    private /* synthetic */ double prevMobRotation;
    private static final /* synthetic */ int[] llllIIIIIlIIl;
    private /* synthetic */ int spawnDelay;
    private /* synthetic */ Entity cachedEntity;
    private /* synthetic */ WeightedRandomMinecart randomEntity;
    private /* synthetic */ double mobRotation;
    private static final /* synthetic */ String[] llllIIIIIIlll;
    private /* synthetic */ String mobID;
    
    public void readFromNBT(final NBTTagCompound lllllllllllllIlIlllllIIlIlIllllI) {
        this.mobID = lllllllllllllIlIlllllIIlIlIllllI.getString(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[5]]);
        this.spawnDelay = lllllllllllllIlIlllllIIlIlIllllI.getShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[14]]);
        this.minecartToSpawn.clear();
        if (lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlIllllI.hasKey(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[15]], MobSpawnerBaseLogic.llllIIIIIlIIl[16]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIlIlllllIIlIllIIIIl = lllllllllllllIlIlllllIIlIlIllllI.getTagList(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[16]], MobSpawnerBaseLogic.llllIIIIIlIIl[13]);
            int lllllllllllllIlIlllllIIlIllIIIII = MobSpawnerBaseLogic.llllIIIIIlIIl[1];
            "".length();
            if (((32 + 90 - 47 + 58 ^ 148 + 71 - 100 + 78) & (0xA7 ^ 0xB7 ^ (0xF0 ^ 0xA0) ^ -" ".length())) > "  ".length()) {
                return;
            }
            while (!lIlIIllIllIIlll(lllllllllllllIlIlllllIIlIllIIIII, lllllllllllllIlIlllllIIlIllIIIIl.tagCount())) {
                this.minecartToSpawn.add(new WeightedRandomMinecart(lllllllllllllIlIlllllIIlIllIIIIl.getCompoundTagAt(lllllllllllllIlIlllllIIlIllIIIII)));
                "".length();
                ++lllllllllllllIlIlllllIIlIllIIIII;
            }
        }
        if (lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlIllllI.hasKey(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[13]], MobSpawnerBaseLogic.llllIIIIIlIIl[13]) ? 1 : 0)) {
            this.setRandomEntity(new WeightedRandomMinecart(lllllllllllllIlIlllllIIlIlIllllI.getCompoundTag(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[17]]), this.mobID));
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        else {
            this.setRandomEntity(null);
        }
        if (lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlIllllI.hasKey(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[18]], MobSpawnerBaseLogic.llllIIIIIlIIl[19]) ? 1 : 0)) {
            this.minSpawnDelay = lllllllllllllIlIlllllIIlIlIllllI.getShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[20]]);
            this.maxSpawnDelay = lllllllllllllIlIlllllIIlIlIllllI.getShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[21]]);
            this.spawnCount = lllllllllllllIlIlllllIIlIlIllllI.getShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[22]]);
        }
        if (lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlIllllI.hasKey(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[6]], MobSpawnerBaseLogic.llllIIIIIlIIl[19]) ? 1 : 0)) {
            this.maxNearbyEntities = lllllllllllllIlIlllllIIlIlIllllI.getShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[23]]);
            this.activatingRangeFromPlayer = lllllllllllllIlIlllllIIlIlIllllI.getShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[24]]);
        }
        if (lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlIllllI.hasKey(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[25]], MobSpawnerBaseLogic.llllIIIIIlIIl[19]) ? 1 : 0)) {
            this.spawnRange = lllllllllllllIlIlllllIIlIlIllllI.getShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[0]]);
        }
        if (lIlIIllIllIIIll(this.getSpawnerWorld())) {
            this.cachedEntity = null;
        }
    }
    
    public double getPrevMobRotation() {
        return this.prevMobRotation;
    }
    
    private Entity spawnNewEntity(final Entity lllllllllllllIlIlllllIIllIIIIIll, final boolean lllllllllllllIlIlllllIIlIlllIllI) {
        if (lIlIIllIllIIIll(this.getRandomEntity())) {
            NBTTagCompound lllllllllllllIlIlllllIIllIIIIIIl = new NBTTagCompound();
            lllllllllllllIlIlllllIIllIIIIIll.writeToNBTOptional(lllllllllllllIlIlllllIIllIIIIIIl);
            "".length();
            final boolean lllllllllllllIlIlllllIIlIlllIIll = (boolean)this.getRandomEntity().nbtData.getKeySet().iterator();
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIlIIllIllIlIII(((Iterator)lllllllllllllIlIlllllIIlIlllIIll).hasNext() ? 1 : 0)) {
                final String lllllllllllllIlIlllllIIllIIIIIII = ((Iterator<String>)lllllllllllllIlIlllllIIlIlllIIll).next();
                final NBTBase lllllllllllllIlIlllllIIlIlllllll = this.getRandomEntity().nbtData.getTag(lllllllllllllIlIlllllIIllIIIIIII);
                lllllllllllllIlIlllllIIllIIIIIIl.setTag(lllllllllllllIlIlllllIIllIIIIIII, lllllllllllllIlIlllllIIlIlllllll.copy());
            }
            lllllllllllllIlIlllllIIllIIIIIll.readFromNBT(lllllllllllllIlIlllllIIllIIIIIIl);
            if (lIlIIllIllIIIll(lllllllllllllIlIlllllIIllIIIIIll.worldObj) && lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlllIllI ? 1 : 0)) {
                lllllllllllllIlIlllllIIllIIIIIll.worldObj.spawnEntityInWorld(lllllllllllllIlIlllllIIllIIIIIll);
                "".length();
            }
            Entity lllllllllllllIlIlllllIIlIlllllIl = lllllllllllllIlIlllllIIllIIIIIll;
            "".length();
            if ((0xC ^ 0x8) == ((0xBA ^ 0x97) & ~(0x36 ^ 0x1B))) {
                return null;
            }
            while (!lIlIIllIllIlIII(lllllllllllllIlIlllllIIllIIIIIIl.hasKey(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[12]], MobSpawnerBaseLogic.llllIIIIIlIIl[13]) ? 1 : 0)) {
                final NBTTagCompound lllllllllllllIlIlllllIIlIllllllI = lllllllllllllIlIlllllIIllIIIIIIl.getCompoundTag(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[10]]);
                final Entity lllllllllllllIlIlllllIIlIlllllII = EntityList.createEntityByName(lllllllllllllIlIlllllIIlIllllllI.getString(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[4]]), lllllllllllllIlIlllllIIllIIIIIll.worldObj);
                if (lIlIIllIllIIIll(lllllllllllllIlIlllllIIlIlllllII)) {
                    final NBTTagCompound lllllllllllllIlIlllllIIlIllllIll = new NBTTagCompound();
                    lllllllllllllIlIlllllIIlIlllllII.writeToNBTOptional(lllllllllllllIlIlllllIIlIllllIll);
                    "".length();
                    final byte lllllllllllllIlIlllllIIlIllIllll = (byte)lllllllllllllIlIlllllIIlIllllllI.getKeySet().iterator();
                    "".length();
                    if (((0xBC ^ 0xAF ^ (0xF0 ^ 0xB8)) & (236 + 105 - 327 + 231 ^ 54 + 165 - 215 + 170 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    while (!lIlIIllIllIlIII(((Iterator)lllllllllllllIlIlllllIIlIllIllll).hasNext() ? 1 : 0)) {
                        final String lllllllllllllIlIlllllIIlIllllIlI = ((Iterator<String>)lllllllllllllIlIlllllIIlIllIllll).next();
                        final NBTBase lllllllllllllIlIlllllIIlIllllIIl = lllllllllllllIlIlllllIIlIllllllI.getTag(lllllllllllllIlIlllllIIlIllllIlI);
                        lllllllllllllIlIlllllIIlIllllIll.setTag(lllllllllllllIlIlllllIIlIllllIlI, lllllllllllllIlIlllllIIlIllllIIl.copy());
                    }
                    lllllllllllllIlIlllllIIlIlllllII.readFromNBT(lllllllllllllIlIlllllIIlIllllIll);
                    lllllllllllllIlIlllllIIlIlllllII.setLocationAndAngles(lllllllllllllIlIlllllIIlIlllllIl.posX, lllllllllllllIlIlllllIIlIlllllIl.posY, lllllllllllllIlIlllllIIlIlllllIl.posZ, lllllllllllllIlIlllllIIlIlllllIl.rotationYaw, lllllllllllllIlIlllllIIlIlllllIl.rotationPitch);
                    if (lIlIIllIllIIIll(lllllllllllllIlIlllllIIllIIIIIll.worldObj) && lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlllIllI ? 1 : 0)) {
                        lllllllllllllIlIlllllIIllIIIIIll.worldObj.spawnEntityInWorld(lllllllllllllIlIlllllIIlIlllllII);
                        "".length();
                    }
                    lllllllllllllIlIlllllIIlIlllllIl.mountEntity(lllllllllllllIlIlllllIIlIlllllII);
                }
                lllllllllllllIlIlllllIIlIlllllIl = lllllllllllllIlIlllllIIlIlllllII;
                lllllllllllllIlIlllllIIllIIIIIIl = lllllllllllllIlIlllllIIlIllllllI;
            }
            "".length();
            if (" ".length() > (0x8F ^ 0x8B)) {
                return null;
            }
        }
        else if (lIlIIllIllIIlII((lllllllllllllIlIlllllIIllIIIIIll instanceof EntityLivingBase) ? 1 : 0) && lIlIIllIllIIIll(lllllllllllllIlIlllllIIllIIIIIll.worldObj) && lIlIIllIllIIlII(lllllllllllllIlIlllllIIlIlllIllI ? 1 : 0)) {
            if (lIlIIllIllIIlII((lllllllllllllIlIlllllIIllIIIIIll instanceof EntityLiving) ? 1 : 0)) {
                ((EntityLiving)lllllllllllllIlIlllllIIllIIIIIll).onInitialSpawn(lllllllllllllIlIlllllIIllIIIIIll.worldObj.getDifficultyForLocation(new BlockPos(lllllllllllllIlIlllllIIllIIIIIll)), null);
                "".length();
            }
            lllllllllllllIlIlllllIIllIIIIIll.worldObj.spawnEntityInWorld(lllllllllllllIlIlllllIIllIIIIIll);
            "".length();
        }
        return lllllllllllllIlIlllllIIllIIIIIll;
    }
    
    private static boolean lIlIIllIllIlIlI(final int lllllllllllllIlIlllllIIIllllIIII, final int lllllllllllllIlIlllllIIIlllIllll) {
        return lllllllllllllIlIlllllIIIllllIIII < lllllllllllllIlIlllllIIIlllIllll;
    }
    
    private WeightedRandomMinecart getRandomEntity() {
        return this.randomEntity;
    }
    
    public abstract BlockPos getSpawnerPosition();
    
    private static String lIlIIllIlIllIlI(final String lllllllllllllIlIlllllIIlIIIllIII, final String lllllllllllllIlIlllllIIlIIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlllllIIlIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), MobSpawnerBaseLogic.llllIIIIIlIIl[15]), "DES");
            final Cipher lllllllllllllIlIlllllIIlIIIllIlI = Cipher.getInstance("DES");
            lllllllllllllIlIlllllIIlIIIllIlI.init(MobSpawnerBaseLogic.llllIIIIIlIIl[8], lllllllllllllIlIlllllIIlIIIllIll);
            return new String(lllllllllllllIlIlllllIIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllllIIlIIIllIIl) {
            lllllllllllllIlIlllllIIlIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIllIllIIlll(final int lllllllllllllIlIlllllIIIllllIlII, final int lllllllllllllIlIlllllIIIllllIIll) {
        return lllllllllllllIlIlllllIIIllllIlII >= lllllllllllllIlIlllllIIIllllIIll;
    }
    
    public abstract void func_98267_a(final int p0);
    
    private static String lIlIIllIlIllIIl(String lllllllllllllIlIlllllIIlIIIIIIll, final String lllllllllllllIlIlllllIIlIIIIIIlI) {
        lllllllllllllIlIlllllIIlIIIIIIll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlllllIIlIIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllllIIlIIIIIllI = new StringBuilder();
        final char[] lllllllllllllIlIlllllIIlIIIIIlIl = lllllllllllllIlIlllllIIlIIIIIIlI.toCharArray();
        int lllllllllllllIlIlllllIIlIIIIIlII = MobSpawnerBaseLogic.llllIIIIIlIIl[1];
        final boolean lllllllllllllIlIlllllIIIlllllllI = (Object)((String)lllllllllllllIlIlllllIIlIIIIIIll).toCharArray();
        final float lllllllllllllIlIlllllIIIllllllIl = lllllllllllllIlIlllllIIIlllllllI.length;
        double lllllllllllllIlIlllllIIIllllllII = MobSpawnerBaseLogic.llllIIIIIlIIl[1];
        while (lIlIIllIllIlIlI((int)lllllllllllllIlIlllllIIIllllllII, (int)lllllllllllllIlIlllllIIIllllllIl)) {
            final char lllllllllllllIlIlllllIIlIIIIlIIl = lllllllllllllIlIlllllIIIlllllllI[lllllllllllllIlIlllllIIIllllllII];
            lllllllllllllIlIlllllIIlIIIIIllI.append((char)(lllllllllllllIlIlllllIIlIIIIlIIl ^ lllllllllllllIlIlllllIIlIIIIIlIl[lllllllllllllIlIlllllIIlIIIIIlII % lllllllllllllIlIlllllIIlIIIIIlIl.length]));
            "".length();
            ++lllllllllllllIlIlllllIIlIIIIIlII;
            ++lllllllllllllIlIlllllIIIllllllII;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllllIIlIIIIIllI);
    }
    
    private boolean isActivated() {
        final BlockPos lllllllllllllIlIlllllIIllIllIIll = this.getSpawnerPosition();
        return this.getSpawnerWorld().isAnyPlayerWithinRangeAt(lllllllllllllIlIlllllIIllIllIIll.getX() + 0.5, lllllllllllllIlIlllllIIllIllIIll.getY() + 0.5, lllllllllllllIlIlllllIIllIllIIll.getZ() + 0.5, this.activatingRangeFromPlayer);
    }
    
    public void writeToNBT(final NBTTagCompound lllllllllllllIlIlllllIIlIlIlIlII) {
        final String lllllllllllllIlIlllllIIlIlIlIIll = this.getEntityNameToSpawn();
        if (lIlIIllIllIlIII(StringUtils.isNullOrEmpty(lllllllllllllIlIlllllIIlIlIlIIll) ? 1 : 0)) {
            lllllllllllllIlIlllllIIlIlIlIlII.setString(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[26]], lllllllllllllIlIlllllIIlIlIlIIll);
            lllllllllllllIlIlllllIIlIlIlIlII.setShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[27]], (short)this.spawnDelay);
            lllllllllllllIlIlllllIIlIlIlIlII.setShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[28]], (short)this.minSpawnDelay);
            lllllllllllllIlIlllllIIlIlIlIlII.setShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[29]], (short)this.maxSpawnDelay);
            lllllllllllllIlIlllllIIlIlIlIlII.setShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[30]], (short)this.spawnCount);
            lllllllllllllIlIlllllIIlIlIlIlII.setShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[31]], (short)this.maxNearbyEntities);
            lllllllllllllIlIlllllIIlIlIlIlII.setShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[32]], (short)this.activatingRangeFromPlayer);
            lllllllllllllIlIlllllIIlIlIlIlII.setShort(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[33]], (short)this.spawnRange);
            if (lIlIIllIllIIIll(this.getRandomEntity())) {
                lllllllllllllIlIlllllIIlIlIlIlII.setTag(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[34]], this.getRandomEntity().nbtData.copy());
            }
            if (!lIlIIllIllIIIlI(this.getRandomEntity()) || lIlIIllIllIIlIl(this.minecartToSpawn.size())) {
                final NBTTagList lllllllllllllIlIlllllIIlIlIlIIlI = new NBTTagList();
                if (lIlIIllIllIIlIl(this.minecartToSpawn.size())) {
                    final float lllllllllllllIlIlllllIIlIlIIlIll = (float)this.minecartToSpawn.iterator();
                    "".length();
                    if (-" ".length() >= "   ".length()) {
                        return;
                    }
                    while (!lIlIIllIllIlIII(((Iterator)lllllllllllllIlIlllllIIlIlIIlIll).hasNext() ? 1 : 0)) {
                        final WeightedRandomMinecart lllllllllllllIlIlllllIIlIlIlIIIl = ((Iterator<WeightedRandomMinecart>)lllllllllllllIlIlllllIIlIlIIlIll).next();
                        lllllllllllllIlIlllllIIlIlIlIIlI.appendTag(lllllllllllllIlIlllllIIlIlIlIIIl.toNBT());
                    }
                    "".length();
                    if ((0xB7 ^ 0xB3) == 0x0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIlllllIIlIlIlIIlI.appendTag(this.getRandomEntity().toNBT());
                }
                lllllllllllllIlIlllllIIlIlIlIlII.setTag(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[35]], lllllllllllllIlIlllllIIlIlIlIIlI);
            }
        }
    }
    
    public abstract World getSpawnerWorld();
    
    public boolean setDelayToMin(final int lllllllllllllIlIlllllIIlIIllllII) {
        if (lIlIIllIllIIllI(lllllllllllllIlIlllllIIlIIllllII, MobSpawnerBaseLogic.llllIIIIIlIIl[7]) && lIlIIllIllIIlII(this.getSpawnerWorld().isRemote ? 1 : 0)) {
            this.spawnDelay = this.minSpawnDelay;
            return MobSpawnerBaseLogic.llllIIIIIlIIl[7] != 0;
        }
        return MobSpawnerBaseLogic.llllIIIIIlIIl[1] != 0;
    }
    
    private static boolean lIlIIllIllIlIIl(final int lllllllllllllIlIlllllIIIlllIllII, final int lllllllllllllIlIlllllIIIlllIlIll) {
        return lllllllllllllIlIlllllIIIlllIllII <= lllllllllllllIlIlllllIIIlllIlIll;
    }
    
    public MobSpawnerBaseLogic() {
        this.spawnDelay = MobSpawnerBaseLogic.llllIIIIIlIIl[0];
        this.mobID = MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[1]];
        this.minecartToSpawn = (List<WeightedRandomMinecart>)Lists.newArrayList();
        this.minSpawnDelay = MobSpawnerBaseLogic.llllIIIIIlIIl[2];
        this.maxSpawnDelay = MobSpawnerBaseLogic.llllIIIIIlIIl[3];
        this.spawnCount = MobSpawnerBaseLogic.llllIIIIIlIIl[4];
        this.maxNearbyEntities = MobSpawnerBaseLogic.llllIIIIIlIIl[5];
        this.activatingRangeFromPlayer = MobSpawnerBaseLogic.llllIIIIIlIIl[6];
        this.spawnRange = MobSpawnerBaseLogic.llllIIIIIlIIl[4];
    }
    
    private static boolean lIlIIllIllIIlII(final int lllllllllllllIlIlllllIIIlllIIlIl) {
        return lllllllllllllIlIlllllIIIlllIIlIl != 0;
    }
    
    static {
        lIlIIllIllIIIIl();
        lIlIIllIlIlllIl();
    }
    
    private static boolean lIlIIllIllIIIll(final Object lllllllllllllIlIlllllIIIlllIlIIl) {
        return lllllllllllllIlIlllllIIIlllIlIIl != null;
    }
    
    public void setRandomEntity(final WeightedRandomMinecart lllllllllllllIlIlllllIIlIIllIIll) {
        this.randomEntity = lllllllllllllIlIlllllIIlIIllIIll;
    }
    
    private String getEntityNameToSpawn() {
        if (lIlIIllIllIIIlI(this.getRandomEntity())) {
            if (lIlIIllIllIIIll(this.mobID) && lIlIIllIllIIlII(this.mobID.equals(MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[7]]) ? 1 : 0)) {
                this.mobID = MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[8]];
            }
            return this.mobID;
        }
        return this.getRandomEntity().entityType;
    }
    
    public Entity func_180612_a(final World lllllllllllllIlIlllllIIlIlIIIIll) {
        if (lIlIIllIllIIIlI(this.cachedEntity)) {
            Entity lllllllllllllIlIlllllIIlIlIIIlIl = EntityList.createEntityByName(this.getEntityNameToSpawn(), lllllllllllllIlIlllllIIlIlIIIIll);
            if (lIlIIllIllIIIll(lllllllllllllIlIlllllIIlIlIIIlIl)) {
                lllllllllllllIlIlllllIIlIlIIIlIl = this.spawnNewEntity(lllllllllllllIlIlllllIIlIlIIIlIl, (boolean)(MobSpawnerBaseLogic.llllIIIIIlIIl[1] != 0));
                this.cachedEntity = lllllllllllllIlIlllllIIlIlIIIlIl;
            }
        }
        return this.cachedEntity;
    }
    
    private static void lIlIIllIlIlllIl() {
        (llllIIIIIIlll = new String[MobSpawnerBaseLogic.llllIIIIIlIIl[36]])[MobSpawnerBaseLogic.llllIIIIIlIIl[1]] = lIlIIllIlIllIIl("NzwV", "gUrJM");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[7]] = lIlIIllIlIllIlI("RuTiKv6A3+z+fERzuyTOuQ==", "gchZj");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[8]] = lIlIIllIlIllIlI("sra22pDMC0FVfY39CNpE70WrjbCMfqMw", "hGLiJ");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[10]] = lIlIIllIlIllIIl("FQwsAAUg", "GeHik");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[4]] = lIlIIllIlIllIll("eQLhnxQRpTo=", "dFNna");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[12]] = lIlIIllIlIllIlI("McVk1lCURjw=", "zIlBj");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[5]] = lIlIIllIlIllIll("wYLTrCsIbv8BEFnRBfp+3g==", "KSUwt");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[14]] = lIlIIllIlIllIIl("HQ4dDC8=", "YkqmV");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[15]] = lIlIIllIlIllIIl("KjsoIigpJD0wKA0iKDk1", "yKIUF");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[16]] = lIlIIllIlIllIll("k2uVxkH9MgAvEDq2JztA9w==", "HDKzT");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[13]] = lIlIIllIlIllIlI("GHfiSpDE0nwcylYwFfky4w==", "ZNLww");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[17]] = lIlIIllIlIllIll("y8W0+uCjSK0z1QJ596V18w==", "fHCcQ");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[18]] = lIlIIllIlIllIll("RyD765Zz4zcDP9sGX0wofw==", "YpKOs");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[20]] = lIlIIllIlIllIIl("KQcqFDsFGSoDLggPPQ==", "dnDGK");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[21]] = lIlIIllIlIllIlI("C1AGEw1lsyw+G7IoS0kVtw==", "WucnO");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[22]] = lIlIIllIlIllIll("BeA4sv2igDKPY5k8IXPQAA==", "PSvUj");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[6]] = lIlIIllIlIllIlI("QwH8d9KrIJmAj/rjiDbyQMqKO31YwoOJ", "fSzvS");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[23]] = lIlIIllIlIllIIl("Di0NFyMiPhcgAy04HC0vJj8=", "CLuYF");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[24]] = lIlIIllIlIllIlI("tPOrbGbfH1AfQJR3kSXIQ194R7qqTCC+", "AvkgB");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[25]] = lIlIIllIlIllIll("fCOL2atLExWIGGoxomgVRA==", "iAHNe");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[0]] = lIlIIllIlIllIIl("KRsIFAEoCgcECg==", "zkico");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[26]] = lIlIIllIlIllIll("BYjtzOTfHR9HyGrHC4T05g==", "GsLil");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[27]] = lIlIIllIlIllIll("doPR9g0XeVs=", "JXZED");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[28]] = lIlIIllIlIllIll("9VkZbHS77yqtGGjtqQb7gg==", "MiEcw");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[29]] = lIlIIllIlIllIlI("GL9EJpEs0P/P0jJY3g4HFw==", "TgiFm");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[30]] = lIlIIllIlIllIll("bRw0nRasLylXf1xYZ65BPA==", "XGKUl");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[31]] = lIlIIllIlIllIll("BqF5iJ9BgoIBEwGMvE7rPyQdD7ugi5lX", "YCijE");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[32]] = lIlIIllIlIllIlI("2Db+DUm0u5l22GVcF9f7QlNyZrTqNbhA", "TUScE");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[33]] = lIlIIllIlIllIll("UGdrjRt8p+gNz22948WsyA==", "jnGoh");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[34]] = lIlIIllIlIllIlI("ic2NndW8mlkkYvZoTKvjBA==", "wiEqp");
        MobSpawnerBaseLogic.llllIIIIIIlll[MobSpawnerBaseLogic.llllIIIIIlIIl[35]] = lIlIIllIlIllIIl("FTUMJjgWKhk0ODIsDD0l", "FEmQV");
    }
    
    public void setEntityName(final String lllllllllllllIlIlllllIIllIllIlll) {
        this.mobID = lllllllllllllIlIlllllIIllIllIlll;
    }
    
    private static boolean lIlIIllIllIlIII(final int lllllllllllllIlIlllllIIIlllIIIll) {
        return lllllllllllllIlIlllllIIIlllIIIll == 0;
    }
    
    public double getMobRotation() {
        return this.mobRotation;
    }
    
    private static boolean lIlIIllIllIIIlI(final Object lllllllllllllIlIlllllIIIlllIIlll) {
        return lllllllllllllIlIlllllIIIlllIIlll == null;
    }
    
    private static void lIlIIllIllIIIIl() {
        (llllIIIIIlIIl = new int[37])[0] = (0xD2 ^ 0xC6);
        MobSpawnerBaseLogic.llllIIIIIlIIl[1] = ((1 + 73 - 41 + 185 ^ 87 + 94 - 110 + 81) & (0xDB ^ 0xC2 ^ (0xD ^ 0x56) ^ -" ".length()));
        MobSpawnerBaseLogic.llllIIIIIlIIl[2] = 145 + 51 - 159 + 163;
        MobSpawnerBaseLogic.llllIIIIIlIIl[3] = (-(0xFFFFEDF4 & 0x7EDF) & (0xFFFFEFF3 & 0x7FFF));
        MobSpawnerBaseLogic.llllIIIIIlIIl[4] = (0x2E ^ 0x2A);
        MobSpawnerBaseLogic.llllIIIIIlIIl[5] = (0x8C ^ 0x8A);
        MobSpawnerBaseLogic.llllIIIIIlIIl[6] = (128 + 166 - 218 + 105 ^ 132 + 53 - 162 + 142);
        MobSpawnerBaseLogic.llllIIIIIlIIl[7] = " ".length();
        MobSpawnerBaseLogic.llllIIIIIlIIl[8] = "  ".length();
        MobSpawnerBaseLogic.llllIIIIIlIIl[9] = -" ".length();
        MobSpawnerBaseLogic.llllIIIIIlIIl[10] = "   ".length();
        MobSpawnerBaseLogic.llllIIIIIlIIl[11] = (-(0xFFFFFDF6 & 0x6A2B) & (0xFFFFEFFD & 0x7FF7));
        MobSpawnerBaseLogic.llllIIIIIlIIl[12] = (0xB ^ 0xE);
        MobSpawnerBaseLogic.llllIIIIIlIIl[13] = (0x4E ^ 0x44);
        MobSpawnerBaseLogic.llllIIIIIlIIl[14] = (0x1C ^ 0x18 ^ "   ".length());
        MobSpawnerBaseLogic.llllIIIIIlIIl[15] = (0x6C ^ 0x64);
        MobSpawnerBaseLogic.llllIIIIIlIIl[16] = (0xDA ^ 0xB0 ^ (0xA5 ^ 0xC6));
        MobSpawnerBaseLogic.llllIIIIIlIIl[17] = (0x46 ^ 0x34 ^ (0x3 ^ 0x7A));
        MobSpawnerBaseLogic.llllIIIIIlIIl[18] = (0xB4 ^ 0x8B ^ (0x79 ^ 0x4A));
        MobSpawnerBaseLogic.llllIIIIIlIIl[19] = (0x31 ^ 0x52);
        MobSpawnerBaseLogic.llllIIIIIlIIl[20] = (0x27 ^ 0x2A);
        MobSpawnerBaseLogic.llllIIIIIlIIl[21] = (0x79 ^ 0x77);
        MobSpawnerBaseLogic.llllIIIIIlIIl[22] = (0x92 ^ 0x80 ^ (0x85 ^ 0x98));
        MobSpawnerBaseLogic.llllIIIIIlIIl[23] = (0x27 ^ 0x60 ^ (0x79 ^ 0x2F));
        MobSpawnerBaseLogic.llllIIIIIlIIl[24] = (0xD6 ^ 0xC4);
        MobSpawnerBaseLogic.llllIIIIIlIIl[25] = (85 + 72 - 103 + 113 ^ 87 + 24 - 18 + 87);
        MobSpawnerBaseLogic.llllIIIIIlIIl[26] = (0xD5 ^ 0xC0);
        MobSpawnerBaseLogic.llllIIIIIlIIl[27] = (0x9B ^ 0x8D);
        MobSpawnerBaseLogic.llllIIIIIlIIl[28] = (28 + 54 - 80 + 126 ^ 15 + 118 - 24 + 42);
        MobSpawnerBaseLogic.llllIIIIIlIIl[29] = (0xEB ^ 0xA4 ^ (0xC4 ^ 0x93));
        MobSpawnerBaseLogic.llllIIIIIlIIl[30] = (0x2B ^ 0x32);
        MobSpawnerBaseLogic.llllIIIIIlIIl[31] = (10 + 175 + 34 + 0 ^ 79 + 148 - 48 + 14);
        MobSpawnerBaseLogic.llllIIIIIlIIl[32] = (0xE8 ^ 0xAF ^ (0x58 ^ 0x4));
        MobSpawnerBaseLogic.llllIIIIIlIIl[33] = (84 + 85 - 92 + 114 ^ 30 + 43 + 37 + 53);
        MobSpawnerBaseLogic.llllIIIIIlIIl[34] = (0xA0 ^ 0xBF ^ "  ".length());
        MobSpawnerBaseLogic.llllIIIIIlIIl[35] = (0x4D ^ 0xC ^ (0x4F ^ 0x10));
        MobSpawnerBaseLogic.llllIIIIIlIIl[36] = (0x4 ^ 0x1B);
    }
    
    private static boolean lIlIIllIllIIlIl(final int lllllllllllllIlIlllllIIIlllIIIIl) {
        return lllllllllllllIlIlllllIIIlllIIIIl > 0;
    }
    
    public void updateSpawner() {
        if (lIlIIllIllIIlII(this.isActivated() ? 1 : 0)) {
            final BlockPos lllllllllllllIlIlllllIIllIlIIlIl = this.getSpawnerPosition();
            if (lIlIIllIllIIlII(this.getSpawnerWorld().isRemote ? 1 : 0)) {
                final double lllllllllllllIlIlllllIIllIlIIlII = lllllllllllllIlIlllllIIllIlIIlIl.getX() + this.getSpawnerWorld().rand.nextFloat();
                final double lllllllllllllIlIlllllIIllIlIIIll = lllllllllllllIlIlllllIIllIlIIlIl.getY() + this.getSpawnerWorld().rand.nextFloat();
                final double lllllllllllllIlIlllllIIllIlIIIlI = lllllllllllllIlIlllllIIllIlIIlIl.getZ() + this.getSpawnerWorld().rand.nextFloat();
                this.getSpawnerWorld().spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIlIlllllIIllIlIIlII, lllllllllllllIlIlllllIIllIlIIIll, lllllllllllllIlIlllllIIllIlIIIlI, 0.0, 0.0, 0.0, new int[MobSpawnerBaseLogic.llllIIIIIlIIl[1]]);
                this.getSpawnerWorld().spawnParticle(EnumParticleTypes.FLAME, lllllllllllllIlIlllllIIllIlIIlII, lllllllllllllIlIlllllIIllIlIIIll, lllllllllllllIlIlllllIIllIlIIIlI, 0.0, 0.0, 0.0, new int[MobSpawnerBaseLogic.llllIIIIIlIIl[1]]);
                if (lIlIIllIllIIlIl(this.spawnDelay)) {
                    this.spawnDelay -= MobSpawnerBaseLogic.llllIIIIIlIIl[7];
                }
                this.prevMobRotation = this.mobRotation;
                this.mobRotation = (this.mobRotation + 1000.0f / (this.spawnDelay + 200.0f)) % 360.0;
                "".length();
                if ("   ".length() < "   ".length()) {
                    return;
                }
            }
            else {
                if (lIlIIllIllIIllI(this.spawnDelay, MobSpawnerBaseLogic.llllIIIIIlIIl[9])) {
                    this.resetTimer();
                }
                if (lIlIIllIllIIlIl(this.spawnDelay)) {
                    this.spawnDelay -= MobSpawnerBaseLogic.llllIIIIIlIIl[7];
                    return;
                }
                boolean lllllllllllllIlIlllllIIllIlIIIIl = MobSpawnerBaseLogic.llllIIIIIlIIl[1] != 0;
                int lllllllllllllIlIlllllIIllIlIIIII = MobSpawnerBaseLogic.llllIIIIIlIIl[1];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIlIIllIllIIlll(lllllllllllllIlIlllllIIllIlIIIII, this.spawnCount)) {
                    final Entity lllllllllllllIlIlllllIIllIIlllll = EntityList.createEntityByName(this.getEntityNameToSpawn(), this.getSpawnerWorld());
                    if (lIlIIllIllIIIlI(lllllllllllllIlIlllllIIllIIlllll)) {
                        return;
                    }
                    final int lllllllllllllIlIlllllIIllIIllllI = this.getSpawnerWorld().getEntitiesWithinAABB(lllllllllllllIlIlllllIIllIIlllll.getClass(), new AxisAlignedBB(lllllllllllllIlIlllllIIllIlIIlIl.getX(), lllllllllllllIlIlllllIIllIlIIlIl.getY(), lllllllllllllIlIlllllIIllIlIIlIl.getZ(), lllllllllllllIlIlllllIIllIlIIlIl.getX() + MobSpawnerBaseLogic.llllIIIIIlIIl[7], lllllllllllllIlIlllllIIllIlIIlIl.getY() + MobSpawnerBaseLogic.llllIIIIIlIIl[7], lllllllllllllIlIlllllIIllIlIIlIl.getZ() + MobSpawnerBaseLogic.llllIIIIIlIIl[7]).expand(this.spawnRange, this.spawnRange, this.spawnRange)).size();
                    if (lIlIIllIllIIlll(lllllllllllllIlIlllllIIllIIllllI, this.maxNearbyEntities)) {
                        this.resetTimer();
                        return;
                    }
                    final double lllllllllllllIlIlllllIIllIIlllIl = lllllllllllllIlIlllllIIllIlIIlIl.getX() + (this.getSpawnerWorld().rand.nextDouble() - this.getSpawnerWorld().rand.nextDouble()) * this.spawnRange + 0.5;
                    final double lllllllllllllIlIlllllIIllIIlllII = lllllllllllllIlIlllllIIllIlIIlIl.getY() + this.getSpawnerWorld().rand.nextInt(MobSpawnerBaseLogic.llllIIIIIlIIl[10]) - MobSpawnerBaseLogic.llllIIIIIlIIl[7];
                    final double lllllllllllllIlIlllllIIllIIllIll = lllllllllllllIlIlllllIIllIlIIlIl.getZ() + (this.getSpawnerWorld().rand.nextDouble() - this.getSpawnerWorld().rand.nextDouble()) * this.spawnRange + 0.5;
                    EntityLiving entityLiving;
                    if (lIlIIllIllIIlII((lllllllllllllIlIlllllIIllIIlllll instanceof EntityLiving) ? 1 : 0)) {
                        entityLiving = (EntityLiving)lllllllllllllIlIlllllIIllIIlllll;
                        "".length();
                        if ((0xCA ^ 0xC2 ^ (0xCE ^ 0xC3)) <= 0) {
                            return;
                        }
                    }
                    else {
                        entityLiving = null;
                    }
                    final EntityLiving lllllllllllllIlIlllllIIllIIllIlI = entityLiving;
                    lllllllllllllIlIlllllIIllIIlllll.setLocationAndAngles(lllllllllllllIlIlllllIIllIIlllIl, lllllllllllllIlIlllllIIllIIlllII, lllllllllllllIlIlllllIIllIIllIll, this.getSpawnerWorld().rand.nextFloat() * 360.0f, 0.0f);
                    if (!lIlIIllIllIIIll(lllllllllllllIlIlllllIIllIIllIlI) || (lIlIIllIllIIlII(lllllllllllllIlIlllllIIllIIllIlI.getCanSpawnHere() ? 1 : 0) && lIlIIllIllIIlII(lllllllllllllIlIlllllIIllIIllIlI.isNotColliding() ? 1 : 0))) {
                        this.spawnNewEntity(lllllllllllllIlIlllllIIllIIlllll, (boolean)(MobSpawnerBaseLogic.llllIIIIIlIIl[7] != 0));
                        "".length();
                        this.getSpawnerWorld().playAuxSFX(MobSpawnerBaseLogic.llllIIIIIlIIl[11], lllllllllllllIlIlllllIIllIlIIlIl, MobSpawnerBaseLogic.llllIIIIIlIIl[1]);
                        if (lIlIIllIllIIIll(lllllllllllllIlIlllllIIllIIllIlI)) {
                            lllllllllllllIlIlllllIIllIIllIlI.spawnExplosionParticle();
                        }
                        lllllllllllllIlIlllllIIllIlIIIIl = (MobSpawnerBaseLogic.llllIIIIIlIIl[7] != 0);
                    }
                    ++lllllllllllllIlIlllllIIllIlIIIII;
                }
                if (lIlIIllIllIIlII(lllllllllllllIlIlllllIIllIlIIIIl ? 1 : 0)) {
                    this.resetTimer();
                }
            }
        }
    }
    
    private void resetTimer() {
        if (lIlIIllIllIlIIl(this.maxSpawnDelay, this.minSpawnDelay)) {
            this.spawnDelay = this.minSpawnDelay;
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            final int lllllllllllllIlIlllllIIlIllIlIlI = this.maxSpawnDelay - this.minSpawnDelay;
            this.spawnDelay = this.minSpawnDelay + this.getSpawnerWorld().rand.nextInt(lllllllllllllIlIlllllIIlIllIlIlI);
        }
        if (lIlIIllIllIIlIl(this.minecartToSpawn.size())) {
            this.setRandomEntity(WeightedRandom.getRandomItem(this.getSpawnerWorld().rand, this.minecartToSpawn));
        }
        this.func_98267_a(MobSpawnerBaseLogic.llllIIIIIlIIl[7]);
    }
    
    private static String lIlIIllIlIllIll(final String lllllllllllllIlIlllllIIlIIlIIlIl, final String lllllllllllllIlIlllllIIlIIlIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllllIIlIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllllIIlIIlIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllllIIlIIlIIlll.init(MobSpawnerBaseLogic.llllIIIIIlIIl[8], lllllllllllllIlIlllllIIlIIlIlIII);
            return new String(lllllllllllllIlIlllllIIlIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllllIIlIIlIIllI) {
            lllllllllllllIlIlllllIIlIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIllIllIIllI(final int lllllllllllllIlIlllllIIIlllllIII, final int lllllllllllllIlIlllllIIIllllIlll) {
        return lllllllllllllIlIlllllIIIlllllIII == lllllllllllllIlIlllllIIIllllIlll;
    }
    
    public class WeightedRandomMinecart extends WeightedRandom.Item
    {
        private final /* synthetic */ String entityType;
        private static final /* synthetic */ int[] llIlllIIIlIllI;
        private static final /* synthetic */ String[] llIllIlllIIIll;
        private final /* synthetic */ NBTTagCompound nbtData;
        
        private static boolean lIIllIIlIIllIllI(final int llllllllllllIllIIlIlIIIllIIllIIl) {
            return llllllllllllIllIIlIlIIIllIIllIIl != 0;
        }
        
        static {
            lIIllIIlIIllIlIl();
            lIIllIIIIllIllIl();
        }
        
        public WeightedRandomMinecart(final MobSpawnerBaseLogic llllllllllllIllIIlIlIIlIIIllIlIl, final NBTTagCompound llllllllllllIllIIlIlIIlIIIllIIll) {
            this(llllllllllllIllIIlIlIIlIIIllIlIl, llllllllllllIllIIlIlIIlIIIllIIll.getCompoundTag(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[0]]), llllllllllllIllIIlIlIIlIIIllIIll.getString(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[1]]), llllllllllllIllIIlIlIIlIIIllIIll.getInteger(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[2]]));
        }
        
        private static void lIIllIIIIllIllIl() {
            (llIllIlllIIIll = new String[WeightedRandomMinecart.llIlllIIIlIllI[9]])[WeightedRandomMinecart.llIlllIIIlIllI[0]] = lIIllIIIIllIIlII("FtkXEVQtFQCd2njF7xtuPQ==", "tnOGH");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[1]] = lIIllIIIIllIlIll("HhQGIw==", "JmvFA");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[2]] = lIIllIIIIllIllII("Q+lZC/AM06c=", "hrVDj");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[3]] = lIIllIIIIllIllII("ke4PC6DS2r91KM6joBEu4w==", "qpLkt");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[4]] = lIIllIIIIllIlIll("EC4jFA==", "DWSqF");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[5]] = lIIllIIIIllIllII("u4OLSBTi++1VZiiJjUNP2eEaOGbPwjVx", "CJoDg");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[6]] = lIIllIIIIllIlIll("PiYmHg8cICALGQ==", "nTInj");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[7]] = lIIllIIIIllIlIll("OwknFg==", "opWsV");
            WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[8]] = lIIllIIIIllIllII("hYghJoakHrA=", "KfjrT");
        }
        
        private static boolean lIIllIIlIIllIlll(final Object llllllllllllIllIIlIlIIIllIIllIll) {
            return llllllllllllIllIIlIlIIIllIIllIll != null;
        }
        
        private static boolean lIIllIIlIIlllIII(final int llllllllllllIllIIlIlIIIllIIllllI, final int llllllllllllIllIIlIlIIIllIIlllIl) {
            return llllllllllllIllIIlIlIIIllIIllllI < llllllllllllIllIIlIlIIIllIIlllIl;
        }
        
        private static String lIIllIIIIllIIlII(final String llllllllllllIllIIlIlIIIllIlIIllI, final String llllllllllllIllIIlIlIIIllIlIIIll) {
            try {
                final SecretKeySpec llllllllllllIllIIlIlIIIllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), WeightedRandomMinecart.llIlllIIIlIllI[8]), "DES");
                final Cipher llllllllllllIllIIlIlIIIllIlIlIII = Cipher.getInstance("DES");
                llllllllllllIllIIlIlIIIllIlIlIII.init(WeightedRandomMinecart.llIlllIIIlIllI[2], llllllllllllIllIIlIlIIIllIlIlIIl);
                return new String(llllllllllllIllIIlIlIIIllIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIIIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIlIIIllIlIIlll) {
                llllllllllllIllIIlIlIIIllIlIIlll.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllIIlIIllIlIl() {
            (llIlllIIIlIllI = new int[10])[0] = ((0x21 ^ 0x2F ^ (0x28 ^ 0x38)) & (0xD8 ^ 0x80 ^ (0x31 ^ 0x77) ^ -" ".length()));
            WeightedRandomMinecart.llIlllIIIlIllI[1] = " ".length();
            WeightedRandomMinecart.llIlllIIIlIllI[2] = "  ".length();
            WeightedRandomMinecart.llIlllIIIlIllI[3] = "   ".length();
            WeightedRandomMinecart.llIlllIIIlIllI[4] = (0x9D ^ 0x99);
            WeightedRandomMinecart.llIlllIIIlIllI[5] = (0x82 ^ 0xA2 ^ (0xB5 ^ 0x90));
            WeightedRandomMinecart.llIlllIIIlIllI[6] = (123 + 56 - 68 + 38 ^ 28 + 133 - 49 + 35);
            WeightedRandomMinecart.llIlllIIIlIllI[7] = ("   ".length() ^ (0x79 ^ 0x7D));
            WeightedRandomMinecart.llIlllIIIlIllI[8] = (0x23 ^ 0x2B);
            WeightedRandomMinecart.llIlllIIIlIllI[9] = (0xBD ^ 0x94 ^ (0x1 ^ 0x21));
        }
        
        public NBTTagCompound toNBT() {
            final NBTTagCompound llllllllllllIllIIlIlIIIlllllIIll = new NBTTagCompound();
            llllllllllllIllIIlIlIIIlllllIIll.setTag(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[6]], this.nbtData);
            llllllllllllIllIIlIlIIIlllllIIll.setString(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[7]], this.entityType);
            llllllllllllIllIIlIlIIIlllllIIll.setInteger(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[8]], this.itemWeight);
            return llllllllllllIllIIlIlIIIlllllIIll;
        }
        
        public WeightedRandomMinecart(final MobSpawnerBaseLogic llllllllllllIllIIlIlIIlIIIlIIIII, final NBTTagCompound llllllllllllIllIIlIlIIlIIIIllllI, final String llllllllllllIllIIlIlIIlIIIlIIIll) {
            this(llllllllllllIllIIlIlIIlIIIlIIIII, llllllllllllIllIIlIlIIlIIIIllllI, llllllllllllIllIIlIlIIlIIIlIIIll, WeightedRandomMinecart.llIlllIIIlIllI[1]);
        }
        
        private WeightedRandomMinecart(final NBTTagCompound llllllllllllIllIIlIlIIlIIIIIlllI, String llllllllllllIllIIlIlIIlIIIIIIIII, final int llllllllllllIllIIlIlIIlIIIIIlIIl) {
            super(llllllllllllIllIIlIlIIlIIIIIlIIl);
            if (lIIllIIlIIllIllI(llllllllllllIllIIlIlIIlIIIIIIIII.equals(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[3]]) ? 1 : 0)) {
                if (lIIllIIlIIllIlll(llllllllllllIllIIlIlIIlIIIIIlllI)) {
                    llllllllllllIllIIlIlIIlIIIIIIIII = EntityMinecart.EnumMinecartType.byNetworkID(llllllllllllIllIIlIlIIlIIIIIlllI.getInteger(WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[4]])).getName();
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                else {
                    llllllllllllIllIIlIlIIlIIIIIIIII = WeightedRandomMinecart.llIllIlllIIIll[WeightedRandomMinecart.llIlllIIIlIllI[5]];
                }
            }
            this.nbtData = llllllllllllIllIIlIlIIlIIIIIlllI;
            this.entityType = llllllllllllIllIIlIlIIlIIIIIIIII;
        }
        
        private static String lIIllIIIIllIlIll(String llllllllllllIllIIlIlIIIlllIIIllI, final String llllllllllllIllIIlIlIIIlllIIlIll) {
            llllllllllllIllIIlIlIIIlllIIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIlIlIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlIlIIIlllIIlIlI = new StringBuilder();
            final char[] llllllllllllIllIIlIlIIIlllIIlIIl = llllllllllllIllIIlIlIIIlllIIlIll.toCharArray();
            int llllllllllllIllIIlIlIIIlllIIIlll = WeightedRandomMinecart.llIlllIIIlIllI[0];
            final String llllllllllllIllIIlIlIIIllIlllllI = (Object)llllllllllllIllIIlIlIIIlllIIIllI.toCharArray();
            final char llllllllllllIllIIlIlIIIllIllllIl = (char)llllllllllllIllIIlIlIIIllIlllllI.length;
            char llllllllllllIllIIlIlIIIllIllllII = (char)WeightedRandomMinecart.llIlllIIIlIllI[0];
            while (lIIllIIlIIlllIII(llllllllllllIllIIlIlIIIllIllllII, llllllllllllIllIIlIlIIIllIllllIl)) {
                final char llllllllllllIllIIlIlIIIlllIIlllI = llllllllllllIllIIlIlIIIllIlllllI[llllllllllllIllIIlIlIIIllIllllII];
                llllllllllllIllIIlIlIIIlllIIlIlI.append((char)(llllllllllllIllIIlIlIIIlllIIlllI ^ llllllllllllIllIIlIlIIIlllIIlIIl[llllllllllllIllIIlIlIIIlllIIIlll % llllllllllllIllIIlIlIIIlllIIlIIl.length]));
                "".length();
                ++llllllllllllIllIIlIlIIIlllIIIlll;
                ++llllllllllllIllIIlIlIIIllIllllII;
                "".length();
                if (((0xD3 ^ 0x88) & ~(0xEA ^ 0xB1)) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlIlIIIlllIIlIlI);
        }
        
        private static String lIIllIIIIllIllII(final String llllllllllllIllIIlIlIIIllIllIIll, final String llllllllllllIllIIlIlIIIllIllIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIlIlIIIllIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIlIlIIIllIllIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIIlIlIIIllIllIlIl.init(WeightedRandomMinecart.llIlllIIIlIllI[2], llllllllllllIllIIlIlIIIllIllIllI);
                return new String(llllllllllllIllIIlIlIIIllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIIIllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIlIIIllIllIlII) {
                llllllllllllIllIIlIlIIIllIllIlII.printStackTrace();
                return null;
            }
        }
    }
}
