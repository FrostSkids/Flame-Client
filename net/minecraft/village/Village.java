// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.village;

import java.util.UUID;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.server.MinecraftServer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.Vec3i;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Iterator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockDoor;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.MathHelper;
import com.google.common.collect.Lists;
import net.minecraft.util.Vec3;
import java.util.List;
import java.util.TreeMap;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Village
{
    private static final /* synthetic */ int[] lIIlIlIllIIIlI;
    private /* synthetic */ World worldObj;
    private /* synthetic */ int lastAddDoorTimestamp;
    private /* synthetic */ BlockPos centerHelper;
    private /* synthetic */ int numIronGolems;
    private /* synthetic */ TreeMap<String, Integer> playerReputation;
    private /* synthetic */ BlockPos center;
    private static final /* synthetic */ String[] lIIlIlIlIlllIl;
    private /* synthetic */ int noBreedTicks;
    private /* synthetic */ int villageRadius;
    private /* synthetic */ int numVillagers;
    private final /* synthetic */ List<VillageDoorInfo> villageDoorInfoList;
    private /* synthetic */ List<VillageAggressor> villageAgressors;
    private /* synthetic */ int tickCounter;
    
    public void endMatingSeason() {
        this.noBreedTicks = this.tickCounter;
    }
    
    public void setDefaultPlayerReputation(final int lllllllllllllIIllIIllIlllIIIlIll) {
        final float lllllllllllllIIllIIllIlllIIIlIIl = (float)this.playerReputation.keySet().iterator();
        "".length();
        if (((0xE1 ^ 0xB1) & ~(0x67 ^ 0x37)) > " ".length()) {
            return;
        }
        while (!llIlIIIlIIIIIll(((Iterator)lllllllllllllIIllIIllIlllIIIlIIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllIIllIlllIIIllIl = ((Iterator<String>)lllllllllllllIIllIIllIlllIIIlIIl).next();
            this.setReputationForPlayer(lllllllllllllIIllIIllIlllIIIllIl, lllllllllllllIIllIIllIlllIIIlIll);
            "".length();
        }
    }
    
    private Vec3 func_179862_a(final BlockPos lllllllllllllIIllIIlllIIllIllIIl, final int lllllllllllllIIllIIlllIIllIllIII, final int lllllllllllllIIllIIlllIIllIlIlll, final int lllllllllllllIIllIIlllIIllIlIllI) {
        int lllllllllllllIIllIIlllIIllIlIlIl = Village.lIIlIlIllIIIlI[7];
        "".length();
        if ("   ".length() > "   ".length()) {
            return null;
        }
        while (!llIlIIIlIIIlIII(lllllllllllllIIllIIlllIIllIlIlIl, Village.lIIlIlIllIIIlI[2])) {
            final BlockPos lllllllllllllIIllIIlllIIllIlIlII = lllllllllllllIIllIIlllIIllIllIIl.add(this.worldObj.rand.nextInt(Village.lIIlIlIllIIIlI[8]) - Village.lIIlIlIllIIIlI[9], this.worldObj.rand.nextInt(Village.lIIlIlIllIIIlI[10]) - Village.lIIlIlIllIIIlI[11], this.worldObj.rand.nextInt(Village.lIIlIlIllIIIlI[8]) - Village.lIIlIlIllIIIlI[9]);
            if (llIlIIIlIIIIlll(this.func_179866_a(lllllllllllllIIllIIlllIIllIlIlII) ? 1 : 0) && llIlIIIlIIIIlll(this.func_179861_a(new BlockPos(lllllllllllllIIllIIlllIIllIllIII, lllllllllllllIIllIIlllIIllIlIlll, lllllllllllllIIllIIlllIIllIlIllI), lllllllllllllIIllIIlllIIllIlIlII) ? 1 : 0)) {
                return new Vec3(lllllllllllllIIllIIlllIIllIlIlII.getX(), lllllllllllllIIllIIlllIIllIlIlII.getY(), lllllllllllllIIllIIlllIIllIlIlII.getZ());
            }
            ++lllllllllllllIIllIIlllIIllIlIlIl;
        }
        return null;
    }
    
    public VillageDoorInfo getDoorInfo(final BlockPos lllllllllllllIIllIIlllIIIllIlllI) {
        VillageDoorInfo lllllllllllllIIllIIlllIIIlllIIll = null;
        int lllllllllllllIIllIIlllIIIlllIIlI = Village.lIIlIlIllIIIlI[12];
        final char lllllllllllllIIllIIlllIIIllIlIlI = (char)this.villageDoorInfoList.iterator();
        "".length();
        if ("   ".length() == "  ".length()) {
            return null;
        }
        while (!llIlIIIlIIIIIll(((Iterator)lllllllllllllIIllIIlllIIIllIlIlI).hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIllIIlllIIIlllIIIl = ((Iterator<VillageDoorInfo>)lllllllllllllIIllIIlllIIIllIlIlI).next();
            int lllllllllllllIIllIIlllIIIlllIIII = lllllllllllllIIllIIlllIIIlllIIIl.getDistanceToDoorBlockSq(lllllllllllllIIllIIlllIIIllIlllI);
            if (llIlIIIlIIIIlIl(lllllllllllllIIllIIlllIIIlllIIII, Village.lIIlIlIllIIIlI[13])) {
                lllllllllllllIIllIIlllIIIlllIIII *= Village.lIIlIlIllIIIlI[14];
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIIlllIIIlllIIII = lllllllllllllIIllIIlllIIIlllIIIl.getDoorOpeningRestrictionCounter();
            }
            if (llIlIIIlIIIIlII(lllllllllllllIIllIIlllIIIlllIIII, lllllllllllllIIllIIlllIIIlllIIlI)) {
                lllllllllllllIIllIIlllIIIlllIIll = lllllllllllllIIllIIlllIIIlllIIIl;
                lllllllllllllIIllIIlllIIIlllIIlI = lllllllllllllIIllIIlllIIIlllIIII;
            }
        }
        return lllllllllllllIIllIIlllIIIlllIIll;
    }
    
    public Village(final World lllllllllllllIIllIIlllIIlllllIIl) {
        this.villageDoorInfoList = (List<VillageDoorInfo>)Lists.newArrayList();
        this.centerHelper = BlockPos.ORIGIN;
        this.center = BlockPos.ORIGIN;
        this.playerReputation = new TreeMap<String, Integer>();
        this.villageAgressors = (List<VillageAggressor>)Lists.newArrayList();
        this.worldObj = lllllllllllllIIllIIlllIIlllllIIl;
    }
    
    static {
        llIlIIIlIIIIIlI();
        llIlIIIIllllIIl();
    }
    
    public int setReputationForPlayer(final String lllllllllllllIIllIIllIllllIlllll, final int lllllllllllllIIllIIllIllllIllIIl) {
        final int lllllllllllllIIllIIllIllllIlllIl = this.getReputationForPlayer(lllllllllllllIIllIIllIllllIlllll);
        final int lllllllllllllIIllIIllIllllIlllII = MathHelper.clamp_int(lllllllllllllIIllIIllIllllIlllIl + lllllllllllllIIllIIllIllllIllIIl, Village.lIIlIlIllIIIlI[19], Village.lIIlIlIllIIIlI[2]);
        this.playerReputation.put(lllllllllllllIIllIIllIllllIlllll, lllllllllllllIIllIIllIllllIlllII);
        "".length();
        return lllllllllllllIIllIIllIllllIlllII;
    }
    
    private static String llIlIIIIlllIIII(String lllllllllllllIIllIIllIllIlIlllll, final String lllllllllllllIIllIIllIllIlIllllI) {
        lllllllllllllIIllIIllIllIlIlllll = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIllIllIlIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIllIllIllIIIlI = new StringBuilder();
        final char[] lllllllllllllIIllIIllIllIllIIIIl = lllllllllllllIIllIIllIllIlIllllI.toCharArray();
        int lllllllllllllIIllIIllIllIllIIIII = Village.lIIlIlIllIIIlI[7];
        final short lllllllllllllIIllIIllIllIlIllIlI = (Object)((String)lllllllllllllIIllIIllIllIlIlllll).toCharArray();
        final short lllllllllllllIIllIIllIllIlIllIIl = (short)lllllllllllllIIllIIllIllIlIllIlI.length;
        short lllllllllllllIIllIIllIllIlIllIII = (short)Village.lIIlIlIllIIIlI[7];
        while (llIlIIIlIIIIlII(lllllllllllllIIllIIllIllIlIllIII, lllllllllllllIIllIIllIllIlIllIIl)) {
            final char lllllllllllllIIllIIllIllIllIIlIl = lllllllllllllIIllIIllIllIlIllIlI[lllllllllllllIIllIIllIllIlIllIII];
            lllllllllllllIIllIIllIllIllIIIlI.append((char)(lllllllllllllIIllIIllIllIllIIlIl ^ lllllllllllllIIllIIllIllIllIIIIl[lllllllllllllIIllIIllIllIllIIIII % lllllllllllllIIllIIllIllIllIIIIl.length]));
            "".length();
            ++lllllllllllllIIllIIllIllIllIIIII;
            ++lllllllllllllIIllIIllIllIlIllIII;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIllIllIllIIIlI);
    }
    
    private static int llIlIIIlIIlIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlIIIlIIIllII(final int lllllllllllllIIllIIllIllIIllIIll) {
        return lllllllllllllIIllIIllIllIIllIIll > 0;
    }
    
    private static boolean llIlIIIlIIIIIll(final int lllllllllllllIIllIIllIllIIlllIIl) {
        return lllllllllllllIIllIIllIllIIlllIIl == 0;
    }
    
    private boolean isWoodDoor(final BlockPos lllllllllllllIIllIIllIlllllllllI) {
        final Block lllllllllllllIIllIIlllIIIIIIIIII = this.worldObj.getBlockState(lllllllllllllIIllIIllIlllllllllI).getBlock();
        int n;
        if (llIlIIIlIIIIlll((lllllllllllllIIllIIlllIIIIIIIIII instanceof BlockDoor) ? 1 : 0)) {
            if (llIlIIIlIIIllll(lllllllllllllIIllIIlllIIIIIIIIII.getMaterial(), Material.wood)) {
                n = Village.lIIlIlIllIIIlI[6];
                "".length();
                if ("  ".length() > "   ".length()) {
                    return ((68 + 54 - 16 + 55 ^ 180 + 25 - 202 + 191) & (0x97 ^ 0xA3 ^ (0x20 ^ 0x77) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = Village.lIIlIlIllIIIlI[7];
                "".length();
                if (((18 + 56 + 127 + 19 ^ 89 + 141 - 162 + 76) & (26 + 102 - 55 + 121 ^ 22 + 56 + 49 + 15 ^ -" ".length())) == (0xFE ^ 0x8F ^ (0xDA ^ 0xAF))) {
                    return ((0x13 ^ 0xD ^ (0x94 ^ 0x93)) & (0x51 ^ 0x67 ^ (0x0 ^ 0x2F) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n = Village.lIIlIlIllIIIlI[7];
        }
        return n != 0;
    }
    
    private void updateVillageRadiusAndCenter() {
        final int lllllllllllllIIllIIllIllllllIllI = this.villageDoorInfoList.size();
        if (llIlIIIlIIIIIll(lllllllllllllIIllIIllIllllllIllI)) {
            this.center = new BlockPos(Village.lIIlIlIllIIIlI[7], Village.lIIlIlIllIIIlI[7], Village.lIIlIlIllIIIlI[7]);
            this.villageRadius = Village.lIIlIlIllIIIlI[7];
            "".length();
            if (((0x39 ^ 0x3C) & ~(0x39 ^ 0x3C)) != ((0x17 ^ 0xA) & ~(0x6F ^ 0x72) & ~((0x5 ^ 0x2E) & ~(0xBE ^ 0x95)))) {
                return;
            }
        }
        else {
            this.center = new BlockPos(this.centerHelper.getX() / lllllllllllllIIllIIllIllllllIllI, this.centerHelper.getY() / lllllllllllllIIllIIllIllllllIllI, this.centerHelper.getZ() / lllllllllllllIIllIIllIllllllIllI);
            int lllllllllllllIIllIIllIllllllIlIl = Village.lIIlIlIllIIIlI[7];
            final char lllllllllllllIIllIIllIlllllIllll = (char)this.villageDoorInfoList.iterator();
            "".length();
            if (" ".length() == 0) {
                return;
            }
            while (!llIlIIIlIIIIIll(((Iterator)lllllllllllllIIllIIllIlllllIllll).hasNext() ? 1 : 0)) {
                final VillageDoorInfo lllllllllllllIIllIIllIllllllIlII = ((Iterator<VillageDoorInfo>)lllllllllllllIIllIIllIlllllIllll).next();
                lllllllllllllIIllIIllIllllllIlIl = Math.max(lllllllllllllIIllIIllIllllllIlII.getDistanceToDoorBlockSq(this.center), lllllllllllllIIllIIllIllllllIlIl);
            }
            this.villageRadius = Math.max(Village.lIIlIlIllIIIlI[18], (int)Math.sqrt(lllllllllllllIIllIIllIllllllIlIl) + Village.lIIlIlIllIIIlI[6]);
        }
    }
    
    public void addOrRenewAgressor(final EntityLivingBase lllllllllllllIIllIIlllIIIlIIllll) {
        final char lllllllllllllIIllIIlllIIIlIIlIlI = (char)this.villageAgressors.iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!llIlIIIlIIIIIll(((Iterator)lllllllllllllIIllIIlllIIIlIIlIlI).hasNext() ? 1 : 0)) {
            final VillageAggressor lllllllllllllIIllIIlllIIIlIIlllI = ((Iterator<VillageAggressor>)lllllllllllllIIllIIlllIIIlIIlIlI).next();
            if (llIlIIIlIIIllll(lllllllllllllIIllIIlllIIIlIIlllI.agressor, lllllllllllllIIllIIlllIIIlIIllll)) {
                lllllllllllllIIllIIlllIIIlIIlllI.agressionTime = this.tickCounter;
                return;
            }
        }
        this.villageAgressors.add(new VillageAggressor(lllllllllllllIIllIIlllIIIlIIllll, this.tickCounter));
        "".length();
    }
    
    private void removeDeadAndOldAgressors() {
        final Iterator<VillageAggressor> lllllllllllllIIllIIlllIIIIIllIIl = this.villageAgressors.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIlIIIlIIIIIll(lllllllllllllIIllIIlllIIIIIllIIl.hasNext() ? 1 : 0)) {
            final VillageAggressor lllllllllllllIIllIIlllIIIIIllIII = lllllllllllllIIllIIlllIIIIIllIIl.next();
            if (!llIlIIIlIIIIlll(lllllllllllllIIllIIlllIIIIIllIII.agressor.isEntityAlive() ? 1 : 0) || llIlIIIlIIIIlIl(Math.abs(this.tickCounter - lllllllllllllIIllIIlllIIIIIllIII.agressionTime), Village.lIIlIlIllIIIlI[15])) {
                lllllllllllllIIllIIlllIIIIIllIIl.remove();
            }
        }
    }
    
    private static String llIlIIIIllIllll(final String lllllllllllllIIllIIllIllIlllIlII, final String lllllllllllllIIllIIllIllIlllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllIllIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllIllIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIllIllIlllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIllIllIlllIllI.init(Village.lIIlIlIllIIIlI[4], lllllllllllllIIllIIllIllIlllIlll);
            return new String(lllllllllllllIIllIIllIllIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllIllIlllIlIl) {
            lllllllllllllIIllIIllIllIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    public boolean isPlayerReputationTooLow(final String lllllllllllllIIllIIllIllllIlIIll) {
        if (llIlIIIlIIIlllI(this.getReputationForPlayer(lllllllllllllIIllIIllIllllIlIIll), Village.lIIlIlIllIIIlI[20])) {
            return Village.lIIlIlIllIIIlI[6] != 0;
        }
        return Village.lIIlIlIllIIIlI[7] != 0;
    }
    
    private static boolean llIlIIIlIIIIlII(final int lllllllllllllIIllIIllIllIlIIllII, final int lllllllllllllIIllIIllIllIlIIlIll) {
        return lllllllllllllIIllIIllIllIlIIllII < lllllllllllllIIllIIllIllIlIIlIll;
    }
    
    private static boolean llIlIIIlIIIIllI(final Object lllllllllllllIIllIIllIllIlIIIIIl) {
        return lllllllllllllIIllIIllIllIlIIIIIl != null;
    }
    
    private static String llIlIIIIlllIIIl(final String lllllllllllllIIllIIllIllIlllllll, final String lllllllllllllIIllIIllIllIllllllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllIlllIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllIllIllllllI.getBytes(StandardCharsets.UTF_8)), Village.lIIlIlIllIIIlI[9]), "DES");
            final Cipher lllllllllllllIIllIIllIlllIIIIIll = Cipher.getInstance("DES");
            lllllllllllllIIllIIllIlllIIIIIll.init(Village.lIIlIlIllIIIlI[4], lllllllllllllIIllIIllIlllIIIIlII);
            return new String(lllllllllllllIIllIIllIlllIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllIlllIIIIIlI) {
            lllllllllllllIIllIIllIlllIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    public Village() {
        this.villageDoorInfoList = (List<VillageDoorInfo>)Lists.newArrayList();
        this.centerHelper = BlockPos.ORIGIN;
        this.center = BlockPos.ORIGIN;
        this.playerReputation = new TreeMap<String, Integer>();
        this.villageAgressors = (List<VillageAggressor>)Lists.newArrayList();
    }
    
    public boolean isMatingSeason() {
        if (llIlIIIlIIIIlll(this.noBreedTicks) && llIlIIIlIIIIlII(this.tickCounter - this.noBreedTicks, Village.lIIlIlIllIIIlI[56])) {
            return Village.lIIlIlIllIIIlI[7] != 0;
        }
        return Village.lIIlIlIllIIIlI[6] != 0;
    }
    
    public boolean func_179866_a(final BlockPos lllllllllllllIIllIIlllIIlIIlIllI) {
        if (llIlIIIlIIIlIlI(llIlIIIlIIIlIIl(this.center.distanceSq(lllllllllllllIIllIIlllIIlIIlIllI), this.villageRadius * this.villageRadius))) {
            return Village.lIIlIlIllIIIlI[6] != 0;
        }
        return Village.lIIlIlIllIIIlI[7] != 0;
    }
    
    private void updateNumVillagers() {
        final List<EntityVillager> lllllllllllllIIllIIlllIIlIlIlIll = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityVillager>)EntityVillager.class, new AxisAlignedBB(this.center.getX() - this.villageRadius, this.center.getY() - Village.lIIlIlIllIIIlI[5], this.center.getZ() - this.villageRadius, this.center.getX() + this.villageRadius, this.center.getY() + Village.lIIlIlIllIIIlI[5], this.center.getZ() + this.villageRadius));
        this.numVillagers = lllllllllllllIIllIIlllIIlIlIlIll.size();
        if (llIlIIIlIIIIIll(this.numVillagers)) {
            this.playerReputation.clear();
        }
    }
    
    private static void llIlIIIIllllIIl() {
        (lIIlIlIlIlllIl = new String[Village.lIIlIlIllIIIlI[57]])[Village.lIIlIlIllIIIlI[7]] = llIlIIIIllIllll("x+1Cjwk1swg=", "PSqzf");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[6]] = llIlIIIIlllIIII("AA4rLhwh", "RoOGi");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[4]] = llIlIIIIlllIIII("EhwhFzcm", "UsMrZ");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[11]] = llIlIIIIllIllll("MEiXw/YXFxc=", "YLbSI");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[5]] = llIlIIIIlllIIIl("3OGtdIA4nB4=", "Seweo");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[21]] = llIlIIIIlllIIII("BD4xKzk=", "IjXHR");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[10]] = llIlIIIIlllIIIl("7+5fs4AGrNo=", "QAtYl");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[22]] = llIlIIIIlllIIIl("ElmxUB0GmGA=", "ZbrBm");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[9]] = llIlIIIIlllIIII("BDQ=", "GnWBg");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[23]] = llIlIIIIlllIIIl("LSFSuOCD210=", "alGop");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[2]] = llIlIIIIlllIIIl("KrAdNeLoT8A=", "RqhBh");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[24]] = llIlIIIIlllIIIl("zglc3sJtTak=", "TJSgR");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[25]] = llIlIIIIlllIIIl("lig7kq0Gl6o=", "BqDNO");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[26]] = llIlIIIIlllIIIl("ENZY/jE5PYY=", "reTgk");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[27]] = llIlIIIIlllIIIl("jNbEiEnzcdw=", "TGmHU");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[28]] = llIlIIIIlllIIIl("PAuszSiVxEs=", "pKtgW");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[8]] = llIlIIIIllIllll("c963hGjxLpg=", "xLueY");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[29]] = llIlIIIIllIllll("g7UETjKUUN4=", "KGmca");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[30]] = llIlIIIIlllIIIl("Vji5E2QDtHM=", "RCajO");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[31]] = llIlIIIIlllIIII("HzgLETA9Jw==", "OTjhU");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[0]] = llIlIIIIlllIIII("JR0TAQ==", "pHZEb");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[32]] = llIlIIIIllIllll("Hg/zIjQSgAY=", "uiIAj");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[33]] = llIlIIIIllIllll("k6vsI541Q/Y=", "LJeMR");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[34]] = llIlIIIIllIllll("KY0IhAmrAdo=", "EjjDd");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[35]] = llIlIIIIlllIIII("IA==", "soXMd");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[36]] = llIlIIIIlllIIII("Gi0pJQEwJw==", "JBYvh");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[37]] = llIlIIIIlllIIIl("Suaka+KdGmQ=", "euyGe");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[38]] = llIlIIIIllIllll("WTONehqgXM0=", "aLegt");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[39]] = llIlIIIIlllIIIl("zNEWdt/0O7I=", "uLYis");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[40]] = llIlIIIIllIllll("aG/DSaT0m4A=", "WvMpB");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[1]] = llIlIIIIlllIIII("FT8sECI=", "XkEsI");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[41]] = llIlIIIIlllIIIl("ceKGAtdMx6E=", "fdPJY");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[18]] = llIlIIIIllIllll("0poxJtl4KEw=", "CEnOO");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[42]] = llIlIIIIlllIIII("LwM=", "lYhWo");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[43]] = llIlIIIIlllIIIl("K5wEWO6xMqg=", "SUEcJ");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[44]] = llIlIIIIllIllll("2v6ZqmlWWYU=", "NifYb");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[45]] = llIlIIIIllIllll("5AhHBI6ORa4=", "oSAbr");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[46]] = llIlIIIIlllIIII("Ig==", "zZkUB");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[47]] = llIlIIIIllIllll("uYD8U65UfBs=", "idlDI");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[48]] = llIlIIIIlllIIII("Ew==", "IbCbY");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[49]] = llIlIIIIlllIIIl("jTc0NbO5kSQ=", "SZhgt");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[50]] = llIlIIIIlllIIIl("OCR3r9FLAf8=", "PjPpI");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[51]] = llIlIIIIllIllll("zZ8griVcMXs=", "pJWNa");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[52]] = llIlIIIIllIllll("b2LM70WnhnI=", "wlGSZ");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[53]] = llIlIIIIlllIIII("ORoTCg==", "lOZNt");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[54]] = llIlIIIIlllIIII("BA==", "WWvLg");
        Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[55]] = llIlIIIIllIllll("/21kn9A4ZjY=", "EsTsc");
    }
    
    public void tick(final int lllllllllllllIIllIIlllIIlllIlIlI) {
        this.tickCounter = lllllllllllllIIllIIlllIIlllIlIlI;
        this.removeDeadAndOutOfRangeDoors();
        this.removeDeadAndOldAgressors();
        if (llIlIIIlIIIIIll(lllllllllllllIIllIIlllIIlllIlIlI % Village.lIIlIlIllIIIlI[0])) {
            this.updateNumVillagers();
        }
        if (llIlIIIlIIIIIll(lllllllllllllIIllIIlllIIlllIlIlI % Village.lIIlIlIllIIIlI[1])) {
            this.updateNumIronGolems();
        }
        final int lllllllllllllIIllIIlllIIlllIlIIl = this.numVillagers / Village.lIIlIlIllIIIlI[2];
        if (llIlIIIlIIIIlII(this.numIronGolems, lllllllllllllIIllIIlllIIlllIlIIl) && llIlIIIlIIIIlIl(this.villageDoorInfoList.size(), Village.lIIlIlIllIIIlI[0]) && llIlIIIlIIIIIll(this.worldObj.rand.nextInt(Village.lIIlIlIllIIIlI[3]))) {
            final Vec3 lllllllllllllIIllIIlllIIlllIlIII = this.func_179862_a(this.center, Village.lIIlIlIllIIIlI[4], Village.lIIlIlIllIIIlI[5], Village.lIIlIlIllIIIlI[4]);
            if (llIlIIIlIIIIllI(lllllllllllllIIllIIlllIIlllIlIII)) {
                final EntityIronGolem lllllllllllllIIllIIlllIIlllIIlll = new EntityIronGolem(this.worldObj);
                lllllllllllllIIllIIlllIIlllIIlll.setPosition(lllllllllllllIIllIIlllIIlllIlIII.xCoord, lllllllllllllIIllIIlllIIlllIlIII.yCoord, lllllllllllllIIllIIlllIIlllIlIII.zCoord);
                this.worldObj.spawnEntityInWorld(lllllllllllllIIllIIlllIIlllIIlll);
                "".length();
                this.numIronGolems += Village.lIIlIlIllIIIlI[6];
            }
        }
    }
    
    private static boolean llIlIIIlIIIIlll(final int lllllllllllllIIllIIllIllIIlllIll) {
        return lllllllllllllIIllIIllIllIIlllIll != 0;
    }
    
    private boolean func_179861_a(final BlockPos lllllllllllllIIllIIlllIIlIlllIll, final BlockPos lllllllllllllIIllIIlllIIlIlllIlI) {
        if (llIlIIIlIIIIIll(World.doesBlockHaveSolidTopSurface(this.worldObj, lllllllllllllIIllIIlllIIlIlllIlI.down()) ? 1 : 0)) {
            return Village.lIIlIlIllIIIlI[7] != 0;
        }
        final int lllllllllllllIIllIIlllIIllIIIIIl = lllllllllllllIIllIIlllIIlIlllIlI.getX() - lllllllllllllIIllIIlllIIlIlllIll.getX() / Village.lIIlIlIllIIIlI[4];
        final int lllllllllllllIIllIIlllIIllIIIIII = lllllllllllllIIllIIlllIIlIlllIlI.getZ() - lllllllllllllIIllIIlllIIlIlllIll.getZ() / Village.lIIlIlIllIIIlI[4];
        int lllllllllllllIIllIIlllIIlIllllll = lllllllllllllIIllIIlllIIllIIIIIl;
        "".length();
        if (-"   ".length() >= 0) {
            return ((63 + 114 - 17 + 60 ^ 97 + 44 - 129 + 131) & (151 + 69 - 185 + 162 ^ 54 + 51 - 104 + 149 ^ -" ".length())) != 0x0;
        }
        while (!llIlIIIlIIIlIII(lllllllllllllIIllIIlllIIlIllllll, lllllllllllllIIllIIlllIIllIIIIIl + lllllllllllllIIllIIlllIIlIlllIll.getX())) {
            int lllllllllllllIIllIIlllIIlIlllllI = lllllllllllllIIllIIlllIIlIlllIlI.getY();
            "".length();
            if (-" ".length() > 0) {
                return ((0xD7 ^ 0x95 ^ (0xA ^ 0x6F)) & (0x7 ^ 0x49 ^ (0xCF ^ 0xA6) ^ -" ".length())) != 0x0;
            }
            while (!llIlIIIlIIIlIII(lllllllllllllIIllIIlllIIlIlllllI, lllllllllllllIIllIIlllIIlIlllIlI.getY() + lllllllllllllIIllIIlllIIlIlllIll.getY())) {
                int lllllllllllllIIllIIlllIIlIllllIl = lllllllllllllIIllIIlllIIllIIIIII;
                "".length();
                if (null != null) {
                    return ((0x98 ^ 0x9F) & ~(0xB3 ^ 0xB4)) != 0x0;
                }
                while (!llIlIIIlIIIlIII(lllllllllllllIIllIIlllIIlIllllIl, lllllllllllllIIllIIlllIIllIIIIII + lllllllllllllIIllIIlllIIlIlllIll.getZ())) {
                    if (llIlIIIlIIIIlll(this.worldObj.getBlockState(new BlockPos(lllllllllllllIIllIIlllIIlIllllll, lllllllllllllIIllIIlllIIlIlllllI, lllllllllllllIIllIIlllIIlIllllIl)).getBlock().isNormalCube() ? 1 : 0)) {
                        return Village.lIIlIlIllIIIlI[7] != 0;
                    }
                    ++lllllllllllllIIllIIlllIIlIllllIl;
                }
                ++lllllllllllllIIllIIlllIIlIlllllI;
            }
            ++lllllllllllllIIllIIlllIIlIllllll;
        }
        return Village.lIIlIlIllIIIlI[6] != 0;
    }
    
    public int getReputationForPlayer(final String lllllllllllllIIllIIllIlllllIlIlI) {
        final Integer lllllllllllllIIllIIllIlllllIlIIl = this.playerReputation.get(lllllllllllllIIllIIllIlllllIlIlI);
        int intValue;
        if (llIlIIIlIIIIllI(lllllllllllllIIllIIllIlllllIlIIl)) {
            intValue = lllllllllllllIIllIIllIlllllIlIIl;
            "".length();
            if (((0x3B ^ 0x2F ^ (0x74 ^ 0x6E)) & (0xF1 ^ 0xA9 ^ (0xE2 ^ 0xB4) ^ -" ".length())) < 0) {
                return (132 + 107 - 120 + 51 ^ 22 + 0 + 45 + 66) & (39 + 141 - 106 + 79 ^ 94 + 72 - 153 + 169 ^ -" ".length());
            }
        }
        else {
            intValue = Village.lIIlIlIllIIIlI[7];
        }
        return intValue;
    }
    
    public int getNumVillagers() {
        return this.numVillagers;
    }
    
    private static boolean llIlIIIlIIIllIl(final int lllllllllllllIIllIIllIllIlIlIlII, final int lllllllllllllIIllIIllIllIlIlIIll) {
        return lllllllllllllIIllIIllIllIlIlIlII == lllllllllllllIIllIIllIllIlIlIIll;
    }
    
    private static boolean llIlIIIlIIIlIlI(final int lllllllllllllIIllIIllIllIIllIlll) {
        return lllllllllllllIIllIIllIllIIllIlll < 0;
    }
    
    private static int llIlIIIlIIIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlIIIlIIIllll(final Object lllllllllllllIIllIIllIllIIlllllI, final Object lllllllllllllIIllIIllIllIIllllIl) {
        return lllllllllllllIIllIIllIllIIlllllI == lllllllllllllIIllIIllIllIIllllIl;
    }
    
    private static boolean llIlIIIlIIIlIII(final int lllllllllllllIIllIIllIllIlIlIIII, final int lllllllllllllIIllIIllIllIlIIllll) {
        return lllllllllllllIIllIIllIllIlIlIIII >= lllllllllllllIIllIIllIllIlIIllll;
    }
    
    private static void llIlIIIlIIIIIlI() {
        (lIIlIlIllIIIlI = new int[58])[0] = (61 + 23 + 71 + 15 ^ 51 + 56 - 66 + 149);
        Village.lIIlIlIllIIIlI[1] = (0x5A ^ 0x44);
        Village.lIIlIlIllIIIlI[2] = (0xDD ^ 0xC2 ^ (0x83 ^ 0x96));
        Village.lIIlIlIllIIIlI[3] = (-(55 + 76 - 15 + 20) & (0xFFFFDFFF & 0x3BDF));
        Village.lIIlIlIllIIIlI[4] = "  ".length();
        Village.lIIlIlIllIIIlI[5] = (0xB8 ^ 0xBC);
        Village.lIIlIlIllIIIlI[6] = " ".length();
        Village.lIIlIlIllIIIlI[7] = ((112 + 16 - 41 + 42 ^ 93 + 113 - 141 + 70) & (51 + 6 + 65 + 50 ^ 113 + 53 - 165 + 169 ^ -" ".length()));
        Village.lIIlIlIllIIIlI[8] = (130 + 75 - 111 + 83 ^ 101 + 61 - 39 + 38);
        Village.lIIlIlIllIIIlI[9] = (45 + 93 + 30 + 23 ^ 127 + 6 + 41 + 9);
        Village.lIIlIlIllIIIlI[10] = (0xA1 ^ 0xAB ^ (0x70 ^ 0x7C));
        Village.lIIlIlIllIIIlI[11] = "   ".length();
        Village.lIIlIlIllIIIlI[12] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        Village.lIIlIlIllIIIlI[13] = (0xFFFFB31D & 0x4DE2);
        Village.lIIlIlIllIIIlI[14] = (-(0xFFFFE63D & 0x59C6) & (0xFFFFF7FF & 0x4BEB));
        Village.lIIlIlIllIIIlI[15] = (-(0xFFFFCF47 & 0x7EF9) & (0xFFFFFFEE & 0x4F7D));
        Village.lIIlIlIllIIIlI[16] = (0x32 ^ 0x2A ^ (0x14 ^ 0x3E));
        Village.lIIlIlIllIIIlI[17] = (-(0xFFFFFB47 & 0x17FC) & (0xFFFFFFF3 & 0x17FF));
        Village.lIIlIlIllIIIlI[18] = (119 + 54 - 69 + 122 ^ 22 + 138 - 80 + 114);
        Village.lIIlIlIllIIIlI[19] = -(0xC9 ^ 0xB9 ^ (0x3B ^ 0x55));
        Village.lIIlIlIllIIIlI[20] = -(0x7C ^ 0x73);
        Village.lIIlIlIllIIIlI[21] = (0x1B ^ 0x1E);
        Village.lIIlIlIllIIIlI[22] = (0x5B ^ 0x5C);
        Village.lIIlIlIllIIIlI[23] = (0xEA ^ 0xB3 ^ (0xC2 ^ 0x92));
        Village.lIIlIlIllIIIlI[24] = (0x40 ^ 0x4B);
        Village.lIIlIlIllIIIlI[25] = (55 + 9 - 42 + 115 ^ 122 + 87 - 101 + 25);
        Village.lIIlIlIllIIIlI[26] = (0x39 ^ 0x34);
        Village.lIIlIlIllIIIlI[27] = (0x1F ^ 0x11);
        Village.lIIlIlIllIIIlI[28] = (0x7C ^ 0x73);
        Village.lIIlIlIllIIIlI[29] = (0x95 ^ 0x84);
        Village.lIIlIlIllIIIlI[30] = (0x3F ^ 0x2D);
        Village.lIIlIlIllIIIlI[31] = (0xC5 ^ 0xC2 ^ (0xD3 ^ 0xC7));
        Village.lIIlIlIllIIIlI[32] = (0xB ^ 0x1E);
        Village.lIIlIlIllIIIlI[33] = (0x62 ^ 0x52 ^ (0x5B ^ 0x7D));
        Village.lIIlIlIllIIIlI[34] = (0xB3 ^ 0x8F ^ (0x6B ^ 0x40));
        Village.lIIlIlIllIIIlI[35] = (0x80 ^ 0x98);
        Village.lIIlIlIllIIIlI[36] = (0x24 ^ 0x3D);
        Village.lIIlIlIllIIIlI[37] = (0x63 ^ 0x79);
        Village.lIIlIlIllIIIlI[38] = (0xDD ^ 0xC6);
        Village.lIIlIlIllIIIlI[39] = (0x30 ^ 0x42 ^ (0x64 ^ 0xA));
        Village.lIIlIlIllIIIlI[40] = (0x89 ^ 0x94);
        Village.lIIlIlIllIIIlI[41] = (0x30 ^ 0x2F);
        Village.lIIlIlIllIIIlI[42] = (0x95 ^ 0xB4);
        Village.lIIlIlIllIIIlI[43] = (0x1 ^ 0x23);
        Village.lIIlIlIllIIIlI[44] = (0x58 ^ 0x7B);
        Village.lIIlIlIllIIIlI[45] = (0x29 ^ 0x5F ^ (0x4A ^ 0x18));
        Village.lIIlIlIllIIIlI[46] = (0x57 ^ 0x72);
        Village.lIIlIlIllIIIlI[47] = (143 + 66 - 77 + 15 ^ 143 + 165 - 269 + 142);
        Village.lIIlIlIllIIIlI[48] = (30 + 43 - 37 + 112 ^ 50 + 1 + 47 + 81);
        Village.lIIlIlIllIIIlI[49] = (0x46 ^ 0x74 ^ (0xA0 ^ 0xBA));
        Village.lIIlIlIllIIIlI[50] = (152 + 54 - 112 + 80 ^ 8 + 80 - 53 + 100);
        Village.lIIlIlIllIIIlI[51] = (0xB4 ^ 0x97 ^ (0x5D ^ 0x54));
        Village.lIIlIlIllIIIlI[52] = (0xF7 ^ 0x92 ^ (0xF8 ^ 0xB6));
        Village.lIIlIlIllIIIlI[53] = (0x84 ^ 0xA8);
        Village.lIIlIlIllIIIlI[54] = (0x1E ^ 0x33);
        Village.lIIlIlIllIIIlI[55] = (0xF4 ^ 0xAF ^ (0x5C ^ 0x29));
        Village.lIIlIlIllIIIlI[56] = (0xFFFF8EB3 & 0x7F5C);
        Village.lIIlIlIllIIIlI[57] = (0xA0 ^ 0x8F);
    }
    
    public int getNumVillageDoors() {
        return this.villageDoorInfoList.size();
    }
    
    private void updateNumIronGolems() {
        final List<EntityIronGolem> lllllllllllllIIllIIlllIIlIllIIIl = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityIronGolem>)EntityIronGolem.class, new AxisAlignedBB(this.center.getX() - this.villageRadius, this.center.getY() - Village.lIIlIlIllIIIlI[5], this.center.getZ() - this.villageRadius, this.center.getX() + this.villageRadius, this.center.getY() + Village.lIIlIlIllIIIlI[5], this.center.getZ() + this.villageRadius));
        this.numIronGolems = lllllllllllllIIllIIlllIIlIllIIIl.size();
    }
    
    public EntityLivingBase findNearestVillageAggressor(final EntityLivingBase lllllllllllllIIllIIlllIIIIlllIlI) {
        double lllllllllllllIIllIIlllIIIlIIIIII = Double.MAX_VALUE;
        VillageAggressor lllllllllllllIIllIIlllIIIIllllll = null;
        int lllllllllllllIIllIIlllIIIIlllllI = Village.lIIlIlIllIIIlI[7];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlIIIlIIIlIII(lllllllllllllIIllIIlllIIIIlllllI, this.villageAgressors.size())) {
            final VillageAggressor lllllllllllllIIllIIlllIIIIllllIl = this.villageAgressors.get(lllllllllllllIIllIIlllIIIIlllllI);
            final double lllllllllllllIIllIIlllIIIIllllII = lllllllllllllIIllIIlllIIIIllllIl.agressor.getDistanceSqToEntity(lllllllllllllIIllIIlllIIIIlllIlI);
            if (llIlIIIlIIlIIIl(llIlIIIlIIlIIII(lllllllllllllIIllIIlllIIIIllllII, lllllllllllllIIllIIlllIIIlIIIIII))) {
                lllllllllllllIIllIIlllIIIIllllll = lllllllllllllIIllIIlllIIIIllllIl;
                lllllllllllllIIllIIlllIIIlIIIIII = lllllllllllllIIllIIlllIIIIllllII;
            }
            ++lllllllllllllIIllIIlllIIIIlllllI;
        }
        EntityLivingBase agressor;
        if (llIlIIIlIIIIllI(lllllllllllllIIllIIlllIIIIllllll)) {
            agressor = lllllllllllllIIllIIlllIIIIllllll.agressor;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            agressor = null;
        }
        return agressor;
    }
    
    public VillageDoorInfo getExistedDoor(final BlockPos lllllllllllllIIllIIlllIIIllIIIII) {
        if (llIlIIIlIIIllII(llIlIIIlIIIlIll(this.center.distanceSq(lllllllllllllIIllIIlllIIIllIIIII), this.villageRadius * this.villageRadius))) {
            return null;
        }
        final short lllllllllllllIIllIIlllIIIlIllllI = (short)this.villageDoorInfoList.iterator();
        "".length();
        if (" ".length() > "   ".length()) {
            return null;
        }
        while (!llIlIIIlIIIIIll(((Iterator)lllllllllllllIIllIIlllIIIlIllllI).hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIllIIlllIIIllIIIlI = ((Iterator<VillageDoorInfo>)lllllllllllllIIllIIlllIIIlIllllI).next();
            if (llIlIIIlIIIllIl(lllllllllllllIIllIIlllIIIllIIIlI.getDoorBlockPos().getX(), lllllllllllllIIllIIlllIIIllIIIII.getX()) && llIlIIIlIIIllIl(lllllllllllllIIllIIlllIIIllIIIlI.getDoorBlockPos().getZ(), lllllllllllllIIllIIlllIIIllIIIII.getZ()) && llIlIIIlIIIlllI(Math.abs(lllllllllllllIIllIIlllIIIllIIIlI.getDoorBlockPos().getY() - lllllllllllllIIllIIlllIIIllIIIII.getY()), Village.lIIlIlIllIIIlI[6])) {
                return lllllllllllllIIllIIlllIIIllIIIlI;
            }
        }
        return null;
    }
    
    public BlockPos getCenter() {
        return this.center;
    }
    
    public EntityPlayer getNearestTargetPlayer(final EntityLivingBase lllllllllllllIIllIIlllIIIIlIIlII) {
        double lllllllllllllIIllIIlllIIIIlIlIlI = Double.MAX_VALUE;
        EntityPlayer lllllllllllllIIllIIlllIIIIlIlIIl = null;
        final char lllllllllllllIIllIIlllIIIIlIIIII = (char)this.playerReputation.keySet().iterator();
        "".length();
        if (((0x2 ^ 0x26 ^ (0x4E ^ 0x22)) & (0x36 ^ 0x58 ^ (0x38 ^ 0x1E) ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!llIlIIIlIIIIIll(((Iterator)lllllllllllllIIllIIlllIIIIlIIIII).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllIIlllIIIIlIlIII = ((Iterator<String>)lllllllllllllIIllIIlllIIIIlIIIII).next();
            if (llIlIIIlIIIIlll(this.isPlayerReputationTooLow(lllllllllllllIIllIIlllIIIIlIlIII) ? 1 : 0)) {
                final EntityPlayer lllllllllllllIIllIIlllIIIIlIIlll = this.worldObj.getPlayerEntityByName(lllllllllllllIIllIIlllIIIIlIlIII);
                if (!llIlIIIlIIIIllI(lllllllllllllIIllIIlllIIIIlIIlll)) {
                    continue;
                }
                final double lllllllllllllIIllIIlllIIIIlIIllI = lllllllllllllIIllIIlllIIIIlIIlll.getDistanceSqToEntity(lllllllllllllIIllIIlllIIIIlIIlII);
                if (!llIlIIIlIIlIIIl(llIlIIIlIIlIIlI(lllllllllllllIIllIIlllIIIIlIIllI, lllllllllllllIIllIIlllIIIIlIlIlI))) {
                    continue;
                }
                lllllllllllllIIllIIlllIIIIlIlIIl = lllllllllllllIIllIIlllIIIIlIIlll;
                lllllllllllllIIllIIlllIIIIlIlIlI = lllllllllllllIIllIIlllIIIIlIIllI;
            }
        }
        return lllllllllllllIIllIIlllIIIIlIlIIl;
    }
    
    public int getVillageRadius() {
        return this.villageRadius;
    }
    
    public void addVillageDoorInfo(final VillageDoorInfo lllllllllllllIIllIIlllIIIlIllIlI) {
        this.villageDoorInfoList.add(lllllllllllllIIllIIlllIIIlIllIlI);
        "".length();
        this.centerHelper = this.centerHelper.add(lllllllllllllIIllIIlllIIIlIllIlI.getDoorBlockPos());
        this.updateVillageRadiusAndCenter();
        this.lastAddDoorTimestamp = lllllllllllllIIllIIlllIIIlIllIlI.getInsidePosY();
    }
    
    public VillageDoorInfo getNearestDoor(final BlockPos lllllllllllllIIllIIlllIIlIIIIIlI) {
        VillageDoorInfo lllllllllllllIIllIIlllIIlIIIIlll = null;
        int lllllllllllllIIllIIlllIIlIIIIllI = Village.lIIlIlIllIIIlI[12];
        final String lllllllllllllIIllIIlllIIIllllllI = (String)this.villageDoorInfoList.iterator();
        "".length();
        if (((0x1F ^ 0x6 ^ (0x87 ^ 0xC0)) & (231 + 124 - 224 + 117 ^ 12 + 42 + 28 + 84 ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!llIlIIIlIIIIIll(((Iterator)lllllllllllllIIllIIlllIIIllllllI).hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIllIIlllIIlIIIIlIl = ((Iterator<VillageDoorInfo>)lllllllllllllIIllIIlllIIIllllllI).next();
            final int lllllllllllllIIllIIlllIIlIIIIlII = lllllllllllllIIllIIlllIIlIIIIlIl.getDistanceToDoorBlockSq(lllllllllllllIIllIIlllIIlIIIIIlI);
            if (llIlIIIlIIIIlII(lllllllllllllIIllIIlllIIlIIIIlII, lllllllllllllIIllIIlllIIlIIIIllI)) {
                lllllllllllllIIllIIlllIIlIIIIlll = lllllllllllllIIllIIlllIIlIIIIlIl;
                lllllllllllllIIllIIlllIIlIIIIllI = lllllllllllllIIllIIlllIIlIIIIlII;
            }
        }
        return lllllllllllllIIllIIlllIIlIIIIlll;
    }
    
    public void setWorld(final World lllllllllllllIIllIIlllIIllllIIll) {
        this.worldObj = lllllllllllllIIllIIlllIIllllIIll;
    }
    
    private static boolean llIlIIIlIIIIlIl(final int lllllllllllllIIllIIllIllIlIIIlII, final int lllllllllllllIIllIIllIllIlIIIIll) {
        return lllllllllllllIIllIIllIllIlIIIlII > lllllllllllllIIllIIllIllIlIIIIll;
    }
    
    public void writeVillageDataToNBT(final NBTTagCompound lllllllllllllIIllIIllIlllIlIlIll) {
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[36]], this.numVillagers);
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[37]], this.villageRadius);
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[38]], this.numIronGolems);
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[39]], this.lastAddDoorTimestamp);
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[40]], this.tickCounter);
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[1]], this.noBreedTicks);
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[41]], this.center.getX());
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[18]], this.center.getY());
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[42]], this.center.getZ());
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[43]], this.centerHelper.getX());
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[44]], this.centerHelper.getY());
        lllllllllllllIIllIIllIlllIlIlIll.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[45]], this.centerHelper.getZ());
        final NBTTagList lllllllllllllIIllIIllIlllIlIlIlI = new NBTTagList();
        final Iterator<VillageDoorInfo> iterator = this.villageDoorInfoList.iterator();
        "".length();
        if ((48 + 130 - 142 + 101 ^ 123 + 92 - 166 + 92) == -" ".length()) {
            return;
        }
        while (!llIlIIIlIIIIIll(iterator.hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIllIIllIlllIlIlIIl = iterator.next();
            final NBTTagCompound lllllllllllllIIllIIllIlllIlIlIII = new NBTTagCompound();
            lllllllllllllIIllIIllIlllIlIlIII.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[46]], lllllllllllllIIllIIllIlllIlIlIIl.getDoorBlockPos().getX());
            lllllllllllllIIllIIllIlllIlIlIII.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[47]], lllllllllllllIIllIIllIlllIlIlIIl.getDoorBlockPos().getY());
            lllllllllllllIIllIIllIlllIlIlIII.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[48]], lllllllllllllIIllIIllIlllIlIlIIl.getDoorBlockPos().getZ());
            lllllllllllllIIllIIllIlllIlIlIII.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[49]], lllllllllllllIIllIIllIlllIlIlIIl.getInsideOffsetX());
            lllllllllllllIIllIIllIlllIlIlIII.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[50]], lllllllllllllIIllIIllIlllIlIlIIl.getInsideOffsetZ());
            lllllllllllllIIllIIllIlllIlIlIII.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[51]], lllllllllllllIIllIIllIlllIlIlIIl.getInsidePosY());
            lllllllllllllIIllIIllIlllIlIlIlI.appendTag(lllllllllllllIIllIIllIlllIlIlIII);
        }
        lllllllllllllIIllIIllIlllIlIlIll.setTag(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[52]], lllllllllllllIIllIIllIlllIlIlIlI);
        final NBTTagList lllllllllllllIIllIIllIlllIlIIlll = new NBTTagList();
        final Iterator<String> iterator2 = this.playerReputation.keySet().iterator();
        "".length();
        if (-" ".length() >= "  ".length()) {
            return;
        }
        while (!llIlIIIlIIIIIll(iterator2.hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllIIllIlllIlIIllI = iterator2.next();
            final NBTTagCompound lllllllllllllIIllIIllIlllIlIIlIl = new NBTTagCompound();
            final PlayerProfileCache lllllllllllllIIllIIllIlllIlIIlII = MinecraftServer.getServer().getPlayerProfileCache();
            final GameProfile lllllllllllllIIllIIllIlllIlIIIll = lllllllllllllIIllIIllIlllIlIIlII.getGameProfileForUsername(lllllllllllllIIllIIllIlllIlIIllI);
            if (llIlIIIlIIIIllI(lllllllllllllIIllIIllIlllIlIIIll)) {
                lllllllllllllIIllIIllIlllIlIIlIl.setString(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[53]], lllllllllllllIIllIIllIlllIlIIIll.getId().toString());
                lllllllllllllIIllIIllIlllIlIIlIl.setInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[54]], this.playerReputation.get(lllllllllllllIIllIIllIlllIlIIllI));
                lllllllllllllIIllIIllIlllIlIIlll.appendTag(lllllllllllllIIllIIllIlllIlIIlIl);
            }
        }
        lllllllllllllIIllIIllIlllIlIlIll.setTag(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[55]], lllllllllllllIIllIIllIlllIlIIlll);
    }
    
    private void removeDeadAndOutOfRangeDoors() {
        boolean lllllllllllllIIllIIlllIIIIIIlllI = Village.lIIlIlIllIIIlI[7] != 0;
        int n;
        if (llIlIIIlIIIIIll(this.worldObj.rand.nextInt(Village.lIIlIlIllIIIlI[16]))) {
            n = Village.lIIlIlIllIIIlI[6];
            "".length();
            if ((0xA6 ^ 0xA2) <= "  ".length()) {
                return;
            }
        }
        else {
            n = Village.lIIlIlIllIIIlI[7];
        }
        final boolean lllllllllllllIIllIIlllIIIIIIllIl = n != 0;
        final Iterator<VillageDoorInfo> lllllllllllllIIllIIlllIIIIIIllII = this.villageDoorInfoList.iterator();
        "".length();
        if ("   ".length() > "   ".length()) {
            return;
        }
        while (!llIlIIIlIIIIIll(lllllllllllllIIllIIlllIIIIIIllII.hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIllIIlllIIIIIIlIll = lllllllllllllIIllIIlllIIIIIIllII.next();
            if (llIlIIIlIIIIlll(lllllllllllllIIllIIlllIIIIIIllIl ? 1 : 0)) {
                lllllllllllllIIllIIlllIIIIIIlIll.resetDoorOpeningRestrictionCounter();
            }
            if (!llIlIIIlIIIIlll(this.isWoodDoor(lllllllllllllIIllIIlllIIIIIIlIll.getDoorBlockPos()) ? 1 : 0) || llIlIIIlIIIIlIl(Math.abs(this.tickCounter - lllllllllllllIIllIIlllIIIIIIlIll.getInsidePosY()), Village.lIIlIlIllIIIlI[17])) {
                this.centerHelper = this.centerHelper.subtract(lllllllllllllIIllIIlllIIIIIIlIll.getDoorBlockPos());
                lllllllllllllIIllIIlllIIIIIIlllI = (Village.lIIlIlIllIIIlI[6] != 0);
                lllllllllllllIIllIIlllIIIIIIlIll.setIsDetachedFromVillageFlag((boolean)(Village.lIIlIlIllIIIlI[6] != 0));
                lllllllllllllIIllIIlllIIIIIIllII.remove();
            }
        }
        if (llIlIIIlIIIIlll(lllllllllllllIIllIIlllIIIIIIlllI ? 1 : 0)) {
            this.updateVillageRadiusAndCenter();
        }
    }
    
    public List<VillageDoorInfo> getVillageDoorInfoList() {
        return this.villageDoorInfoList;
    }
    
    private static int llIlIIIlIIlIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public int getTicksSinceLastDoorAdding() {
        return this.tickCounter - this.lastAddDoorTimestamp;
    }
    
    private static boolean llIlIIIlIIlIIIl(final int lllllllllllllIIllIIllIllIIllIlIl) {
        return lllllllllllllIIllIIllIllIIllIlIl <= 0;
    }
    
    private static int llIlIIIlIIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlIIIlIIIlllI(final int lllllllllllllIIllIIllIllIlIIlIII, final int lllllllllllllIIllIIllIllIlIIIlll) {
        return lllllllllllllIIllIIllIllIlIIlIII <= lllllllllllllIIllIIllIllIlIIIlll;
    }
    
    public void readVillageDataFromNBT(final NBTTagCompound lllllllllllllIIllIIllIlllIllllII) {
        this.numVillagers = lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[7]]);
        this.villageRadius = lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[6]]);
        this.numIronGolems = lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[4]]);
        this.lastAddDoorTimestamp = lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[11]]);
        this.tickCounter = lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[5]]);
        this.noBreedTicks = lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[21]]);
        this.center = new BlockPos(lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[10]]), lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[22]]), lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[9]]));
        this.centerHelper = new BlockPos(lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[23]]), lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[2]]), lllllllllllllIIllIIllIlllIllllII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[24]]));
        final NBTTagList lllllllllllllIIllIIllIllllIIIllI = lllllllllllllIIllIIllIlllIllllII.getTagList(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[25]], Village.lIIlIlIllIIIlI[2]);
        int lllllllllllllIIllIIllIllllIIIlIl = Village.lIIlIlIllIIIlI[7];
        "".length();
        if (" ".length() == (0xCD ^ 0x85 ^ (0x7B ^ 0x37))) {
            return;
        }
        while (!llIlIIIlIIIlIII(lllllllllllllIIllIIllIllllIIIlIl, lllllllllllllIIllIIllIllllIIIllI.tagCount())) {
            final NBTTagCompound lllllllllllllIIllIIllIllllIIIlII = lllllllllllllIIllIIllIllllIIIllI.getCompoundTagAt(lllllllllllllIIllIIllIllllIIIlIl);
            final VillageDoorInfo lllllllllllllIIllIIllIllllIIIIll = new VillageDoorInfo(new BlockPos(lllllllllllllIIllIIllIllllIIIlII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[26]]), lllllllllllllIIllIIllIllllIIIlII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[27]]), lllllllllllllIIllIIllIllllIIIlII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[28]])), lllllllllllllIIllIIllIllllIIIlII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[8]]), lllllllllllllIIllIIllIllllIIIlII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[29]]), lllllllllllllIIllIIllIllllIIIlII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[30]]));
            this.villageDoorInfoList.add(lllllllllllllIIllIIllIllllIIIIll);
            "".length();
            ++lllllllllllllIIllIIllIllllIIIlIl;
        }
        final NBTTagList lllllllllllllIIllIIllIllllIIIIlI = lllllllllllllIIllIIllIlllIllllII.getTagList(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[31]], Village.lIIlIlIllIIIlI[2]);
        int lllllllllllllIIllIIllIllllIIIIIl = Village.lIIlIlIllIIIlI[7];
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!llIlIIIlIIIlIII(lllllllllllllIIllIIllIllllIIIIIl, lllllllllllllIIllIIllIllllIIIIlI.tagCount())) {
            final NBTTagCompound lllllllllllllIIllIIllIllllIIIIII = lllllllllllllIIllIIllIllllIIIIlI.getCompoundTagAt(lllllllllllllIIllIIllIllllIIIIIl);
            if (llIlIIIlIIIIlll(lllllllllllllIIllIIllIllllIIIIII.hasKey(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[0]]) ? 1 : 0)) {
                final PlayerProfileCache lllllllllllllIIllIIllIlllIllllll = MinecraftServer.getServer().getPlayerProfileCache();
                final GameProfile lllllllllllllIIllIIllIlllIlllllI = lllllllllllllIIllIIllIlllIllllll.getProfileByUUID(UUID.fromString(lllllllllllllIIllIIllIllllIIIIII.getString(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[32]])));
                if (llIlIIIlIIIIllI(lllllllllllllIIllIIllIlllIlllllI)) {
                    this.playerReputation.put(lllllllllllllIIllIIllIlllIlllllI.getName(), lllllllllllllIIllIIllIllllIIIIII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[33]]));
                    "".length();
                    "".length();
                    if ((139 + 47 - 131 + 101 ^ 117 + 15 - 95 + 116) <= 0) {
                        return;
                    }
                }
            }
            else {
                this.playerReputation.put(lllllllllllllIIllIIllIllllIIIIII.getString(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[34]]), lllllllllllllIIllIIllIllllIIIIII.getInteger(Village.lIIlIlIlIlllIl[Village.lIIlIlIllIIIlI[35]]));
                "".length();
            }
            ++lllllllllllllIIllIIllIllllIIIIIl;
        }
    }
    
    public boolean isAnnihilated() {
        return this.villageDoorInfoList.isEmpty();
    }
    
    class VillageAggressor
    {
        public /* synthetic */ EntityLivingBase agressor;
        public /* synthetic */ int agressionTime;
        
        VillageAggressor(final EntityLivingBase llllllllllllIlllllIIlllllIllIIIl, final int llllllllllllIlllllIIlllllIllIIII) {
            this.agressor = llllllllllllIlllllIIlllllIllIIIl;
            this.agressionTime = llllllllllllIlllllIIlllllIllIIII;
        }
    }
}
