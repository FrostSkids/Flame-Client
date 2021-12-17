// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import org.apache.logging.log4j.LogManager;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFishHook;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.Packet;
import com.google.common.collect.Sets;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.IntHashMap;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.WorldServer;

public class EntityTracker
{
    private static final /* synthetic */ int[] lIlIllllllllIl;
    private /* synthetic */ int maxTrackingDistanceThreshold;
    private final /* synthetic */ WorldServer theWorld;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ Set<EntityTrackerEntry> trackedEntities;
    private static final /* synthetic */ String[] lIlIllllllllII;
    private /* synthetic */ IntHashMap<EntityTrackerEntry> trackedEntityHashTable;
    
    public void func_180245_a(final EntityPlayerMP lllllllllllllIIIIlIIlIlIlIllIlll) {
        final String lllllllllllllIIIIlIIlIlIlIllIlIl = (String)this.trackedEntities.iterator();
        "".length();
        if (((0x1C ^ 0x8) & ~(0x8A ^ 0x9E)) != 0x0) {
            return;
        }
        while (!llllIlIllIlIIlI(((Iterator)lllllllllllllIIIIlIIlIlIlIllIlIl).hasNext() ? 1 : 0)) {
            final EntityTrackerEntry lllllllllllllIIIIlIIlIlIlIlllIIl = ((Iterator<EntityTrackerEntry>)lllllllllllllIIIIlIIlIlIlIllIlIl).next();
            if (llllIlIllIlIllI(lllllllllllllIIIIlIIlIlIlIlllIIl.trackedEntity, lllllllllllllIIIIlIIlIlIlIllIlll)) {
                lllllllllllllIIIIlIIlIlIlIlllIIl.updatePlayerEntities(this.theWorld.playerEntities);
                "".length();
                if (" ".length() < ((0x1 ^ 0x21) & ~(0x51 ^ 0x71))) {
                    return;
                }
                continue;
            }
            else {
                lllllllllllllIIIIlIIlIlIlIlllIIl.updatePlayerEntity(lllllllllllllIIIIlIIlIlIlIllIlll);
            }
        }
    }
    
    private static boolean llllIlIllIlIIll(final int lllllllllllllIIIIlIIlIlIIlIIIIll, final int lllllllllllllIIIIlIIlIlIIlIIIIlI) {
        return lllllllllllllIIIIlIIlIlIIlIIIIll > lllllllllllllIIIIlIIlIlIIlIIIIlI;
    }
    
    public void func_85172_a(final EntityPlayerMP lllllllllllllIIIIlIIlIlIlIIIlIll, final Chunk lllllllllllllIIIIlIIlIlIlIIIIllI) {
        final float lllllllllllllIIIIlIIlIlIlIIIIlII = (float)this.trackedEntities.iterator();
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!llllIlIllIlIIlI(((Iterator)lllllllllllllIIIIlIIlIlIlIIIIlII).hasNext() ? 1 : 0)) {
            final EntityTrackerEntry lllllllllllllIIIIlIIlIlIlIIIlIIl = ((Iterator<EntityTrackerEntry>)lllllllllllllIIIIlIIlIlIlIIIIlII).next();
            if (llllIlIllIlIIIl(lllllllllllllIIIIlIIlIlIlIIIlIIl.trackedEntity, lllllllllllllIIIIlIIlIlIlIIIlIll) && llllIlIllIlIlll(lllllllllllllIIIIlIIlIlIlIIIlIIl.trackedEntity.chunkCoordX, lllllllllllllIIIIlIIlIlIlIIIIllI.xPosition) && llllIlIllIlIlll(lllllllllllllIIIIlIIlIlIlIIIlIIl.trackedEntity.chunkCoordZ, lllllllllllllIIIIlIIlIlIlIIIIllI.zPosition)) {
                lllllllllllllIIIIlIIlIlIlIIIlIIl.updatePlayerEntity(lllllllllllllIIIIlIIlIlIlIIIlIll);
            }
        }
    }
    
    public EntityTracker(final WorldServer lllllllllllllIIIIlIIlIllIIIllIlI) {
        this.trackedEntities = (Set<EntityTrackerEntry>)Sets.newHashSet();
        this.trackedEntityHashTable = new IntHashMap<EntityTrackerEntry>();
        this.theWorld = lllllllllllllIIIIlIIlIllIIIllIlI;
        this.maxTrackingDistanceThreshold = lllllllllllllIIIIlIIlIllIIIllIlI.getMinecraftServer().getConfigurationManager().getEntityViewDistance();
    }
    
    public void sendToAllTrackingEntity(final Entity lllllllllllllIIIIlIIlIlIlIlIllll, final Packet lllllllllllllIIIIlIIlIlIlIlIlllI) {
        final EntityTrackerEntry lllllllllllllIIIIlIIlIlIlIlIllIl = this.trackedEntityHashTable.lookup(lllllllllllllIIIIlIIlIlIlIlIllll.getEntityId());
        if (llllIlIllIlIlII(lllllllllllllIIIIlIIlIlIlIlIllIl)) {
            lllllllllllllIIIIlIIlIlIlIlIllIl.sendPacketToTrackedPlayers(lllllllllllllIIIIlIIlIlIlIlIlllI);
        }
    }
    
    private static String llllIlIllIIllIl(final String lllllllllllllIIIIlIIlIlIIllIIlII, final String lllllllllllllIIIIlIIlIlIIllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIlIIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIlIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIlIlIIllIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIlIlIIllIIllI.init(EntityTracker.lIlIllllllllIl[1], lllllllllllllIIIIlIIlIlIIllIIlll);
            return new String(lllllllllllllIIIIlIIlIlIIllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIlIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIlIIllIIlIl) {
            lllllllllllllIIIIlIIlIlIIllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void llllIlIllIIllll() {
        (lIlIllllllllIl = new int[17])[0] = (0xFFFFFA48 & 0x7B7);
        EntityTracker.lIlIllllllllIl[1] = "  ".length();
        EntityTracker.lIlIllllllllIl[2] = (0x9 ^ 0x24 ^ (0xD6 ^ 0xBB));
        EntityTracker.lIlIllllllllIl[3] = (0x6F ^ 0x7E ^ (0x4B ^ 0x5F));
        EntityTracker.lIlIllllllllIl[4] = " ".length();
        EntityTracker.lIlIllllllllIl[5] = (0x29 ^ 0x3D);
        EntityTracker.lIlIllllllllIl[6] = ((0xD1 ^ 0xA3 ^ (0xE2 ^ 0x9E)) & (38 + 155 - 112 + 81 ^ 30 + 22 + 83 + 37 ^ -" ".length()));
        EntityTracker.lIlIllllllllIl[7] = (0x80 ^ 0x8A);
        EntityTracker.lIlIllllllllIl[8] = (0xB5 ^ 0xB1);
        EntityTracker.lIlIllllllllIl[9] = (0x18 ^ 0x48);
        EntityTracker.lIlIllllllllIl[10] = "   ".length();
        EntityTracker.lIlIllllllllIl[11] = (0x4 ^ 0x62) + (0x71 ^ 0x1F) - (0x9 ^ 0x30) + (0xC3 ^ 0xC6);
        EntityTracker.lIlIllllllllIl[12] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        EntityTracker.lIlIllllllllIl[13] = (-(0xFFFFCFFF & 0x3231) & (0xFFFFE3F2 & 0x1F3D));
        EntityTracker.lIlIllllllllIl[14] = (0x2E ^ 0x28);
        EntityTracker.lIlIllllllllIl[15] = (0xC6 ^ 0xC1);
        EntityTracker.lIlIllllllllIl[16] = (0xB5 ^ 0xBD);
    }
    
    private static String llllIlIllIIlIll(String lllllllllllllIIIIlIIlIlIIllllIIl, final String lllllllllllllIIIIlIIlIlIIlllIIll) {
        lllllllllllllIIIIlIIlIlIIllllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIlIIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlIlIIlllIlll = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlIlIIlllIllI = lllllllllllllIIIIlIIlIlIIlllIIll.toCharArray();
        int lllllllllllllIIIIlIIlIlIIlllIlIl = EntityTracker.lIlIllllllllIl[6];
        final short lllllllllllllIIIIlIIlIlIIllIllll = (Object)lllllllllllllIIIIlIIlIlIIllllIIl.toCharArray();
        final short lllllllllllllIIIIlIIlIlIIllIlllI = (short)lllllllllllllIIIIlIIlIlIIllIllll.length;
        long lllllllllllllIIIIlIIlIlIIllIllIl = EntityTracker.lIlIllllllllIl[6];
        while (llllIlIllIllIII((int)lllllllllllllIIIIlIIlIlIIllIllIl, lllllllllllllIIIIlIIlIlIIllIlllI)) {
            final char lllllllllllllIIIIlIIlIlIIllllIlI = lllllllllllllIIIIlIIlIlIIllIllll[lllllllllllllIIIIlIIlIlIIllIllIl];
            lllllllllllllIIIIlIIlIlIIlllIlll.append((char)(lllllllllllllIIIIlIIlIlIIllllIlI ^ lllllllllllllIIIIlIIlIlIIlllIllI[lllllllllllllIIIIlIIlIlIIlllIlIl % lllllllllllllIIIIlIIlIlIIlllIllI.length]));
            "".length();
            ++lllllllllllllIIIIlIIlIlIIlllIlIl;
            ++lllllllllllllIIIIlIIlIlIIllIllIl;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlIlIIlllIlll);
    }
    
    private static boolean llllIlIllIllIII(final int lllllllllllllIIIIlIIlIlIIlIIIlll, final int lllllllllllllIIIIlIIlIlIIlIIIllI) {
        return lllllllllllllIIIIlIIlIlIIlIIIlll < lllllllllllllIIIIlIIlIlIIlIIIllI;
    }
    
    private static boolean llllIlIllIlIlII(final Object lllllllllllllIIIIlIIlIlIIIllllII) {
        return lllllllllllllIIIIlIIlIlIIIllllII != null;
    }
    
    private static boolean llllIlIllIlIIII(final int lllllllllllllIIIIlIIlIlIIIllIllI) {
        return lllllllllllllIIIIlIIlIlIIIllIllI != 0;
    }
    
    public void addEntityToTracker(final Entity lllllllllllllIIIIlIIlIlIllllIlII, int lllllllllllllIIIIlIIlIlIlllIlIII, final int lllllllllllllIIIIlIIlIlIllllIIlI, final boolean lllllllllllllIIIIlIIlIlIlllIIllI) {
        if (llllIlIllIlIIll(lllllllllllllIIIIlIIlIlIlllIlIII, this.maxTrackingDistanceThreshold)) {
            lllllllllllllIIIIlIIlIlIlllIlIII = this.maxTrackingDistanceThreshold;
        }
        try {
            if (llllIlIllIlIIII(this.trackedEntityHashTable.containsItem(lllllllllllllIIIIlIIlIlIllllIlII.getEntityId()) ? 1 : 0)) {
                throw new IllegalStateException(EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[6]]);
            }
            final EntityTrackerEntry lllllllllllllIIIIlIIlIlIllllIIII = new EntityTrackerEntry(lllllllllllllIIIIlIIlIlIllllIlII, lllllllllllllIIIIlIIlIlIlllIlIII, lllllllllllllIIIIlIIlIlIllllIIlI, lllllllllllllIIIIlIIlIlIlllIIllI);
            this.trackedEntities.add(lllllllllllllIIIIlIIlIlIllllIIII);
            "".length();
            this.trackedEntityHashTable.addKey(lllllllllllllIIIIlIIlIlIllllIlII.getEntityId(), lllllllllllllIIIIlIIlIlIllllIIII);
            lllllllllllllIIIIlIIlIlIllllIIII.updatePlayerEntities(this.theWorld.playerEntities);
            "".length();
            if (((0xF4 ^ 0xBC) & ~(0x62 ^ 0x2A)) != ((0x44 ^ 0x1B) & ~(0xF1 ^ 0xAE))) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIIIlIIlIlIlllIllll) {
            final CrashReport lllllllllllllIIIIlIIlIlIlllIlllI = CrashReport.makeCrashReport(lllllllllllllIIIIlIIlIlIlllIllll, EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[4]]);
            final CrashReportCategory lllllllllllllIIIIlIIlIlIlllIllIl = lllllllllllllIIIIlIIlIlIlllIlllI.makeCategory(EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[1]]);
            lllllllllllllIIIIlIIlIlIlllIllIl.addCrashSection(EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[10]], String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlIIlIlIlllIlIII)).append(EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[8]])));
            lllllllllllllIIIIlIIlIlIlllIllIl.addCrashSectionCallable(EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[3]], new Callable<String>() {
                private static final /* synthetic */ String[] lIlIlllIIIIlIl;
                private static final /* synthetic */ int[] lIlIlllIIIIlll;
                
                static {
                    llllIIlIllllllI();
                    llllIIlIlllllII();
                }
                
                private static String llllIIlIlllIllI(String lllllllllllllIIIIlIlllllIIIIlllI, final String lllllllllllllIIIIlIlllllIIIIllIl) {
                    lllllllllllllIIIIlIlllllIIIIlllI = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIlllllIIIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder lllllllllllllIIIIlIlllllIIIlIIIl = new StringBuilder();
                    final char[] lllllllllllllIIIIlIlllllIIIlIIII = lllllllllllllIIIIlIlllllIIIIllIl.toCharArray();
                    int lllllllllllllIIIIlIlllllIIIIllll = EntityTracker$1.lIlIlllIIIIlll[0];
                    final double lllllllllllllIIIIlIlllllIIIIlIIl = (Object)((String)lllllllllllllIIIIlIlllllIIIIlllI).toCharArray();
                    final double lllllllllllllIIIIlIlllllIIIIlIII = lllllllllllllIIIIlIlllllIIIIlIIl.length;
                    String lllllllllllllIIIIlIlllllIIIIIlll = (String)EntityTracker$1.lIlIlllIIIIlll[0];
                    while (llllIIllIIIIIII((int)lllllllllllllIIIIlIlllllIIIIIlll, (int)lllllllllllllIIIIlIlllllIIIIlIII)) {
                        final char lllllllllllllIIIIlIlllllIIIlIlII = lllllllllllllIIIIlIlllllIIIIlIIl[lllllllllllllIIIIlIlllllIIIIIlll];
                        lllllllllllllIIIIlIlllllIIIlIIIl.append((char)(lllllllllllllIIIIlIlllllIIIlIlII ^ lllllllllllllIIIIlIlllllIIIlIIII[lllllllllllllIIIIlIlllllIIIIllll % lllllllllllllIIIIlIlllllIIIlIIII.length]));
                        "".length();
                        ++lllllllllllllIIIIlIlllllIIIIllll;
                        ++lllllllllllllIIIIlIlllllIIIIIlll;
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return null;
                        }
                    }
                    return String.valueOf(lllllllllllllIIIIlIlllllIIIlIIIl);
                }
                
                private static String llllIIlIlllIlll(final String lllllllllllllIIIIlIlllllIIllIIII, final String lllllllllllllIIIIlIlllllIIlIllIl) {
                    try {
                        final SecretKeySpec lllllllllllllIIIIlIlllllIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlllllIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIIIIlIlllllIIllIIlI = Cipher.getInstance("Blowfish");
                        lllllllllllllIIIIlIlllllIIllIIlI.init(EntityTracker$1.lIlIlllIIIIlll[3], lllllllllllllIIIIlIlllllIIllIIll);
                        return new String(lllllllllllllIIIIlIlllllIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlllllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIIIlIlllllIIllIIIl) {
                        lllllllllllllIIIIlIlllllIIllIIIl.printStackTrace();
                        return null;
                    }
                }
                
                @Override
                public String call() throws Exception {
                    String lllllllllllllIIIIlIlllllIIllllII = String.valueOf(new StringBuilder(EntityTracker$1.lIlIlllIIIIlIl[EntityTracker$1.lIlIlllIIIIlll[0]]).append(lllllllllllllIIIIlIIlIlIllllIIlI).append(EntityTracker$1.lIlIlllIIIIlIl[EntityTracker$1.lIlIlllIIIIlll[1]]));
                    if (llllIIlIlllllll(lllllllllllllIIIIlIIlIlIllllIIlI, EntityTracker$1.lIlIlllIIIIlll[2])) {
                        lllllllllllllIIIIlIlllllIIllllII = String.valueOf(new StringBuilder(EntityTracker$1.lIlIlllIIIIlIl[EntityTracker$1.lIlIlllIIIIlll[3]]).append(lllllllllllllIIIIlIlllllIIllllII).append(EntityTracker$1.lIlIlllIIIIlIl[EntityTracker$1.lIlIlllIIIIlll[4]]));
                    }
                    return lllllllllllllIIIIlIlllllIIllllII;
                }
                
                private static boolean llllIIlIlllllll(final int lllllllllllllIIIIlIlllllIIIIIIll, final int lllllllllllllIIIIlIlllllIIIIIIlI) {
                    return lllllllllllllIIIIlIlllllIIIIIIll == lllllllllllllIIIIlIlllllIIIIIIlI;
                }
                
                private static void llllIIlIlllllII() {
                    (lIlIlllIIIIlIl = new String[EntityTracker$1.lIlIlllIIIIlll[5]])[EntityTracker$1.lIlIlllIIIIlll[0]] = llllIIlIlllIllI("PRsvNXICED5w", "ruLPR");
                    EntityTracker$1.lIlIlllIIIIlIl[EntityTracker$1.lIlIlllIIIIlll[1]] = llllIIlIlllIlll("/C2h/UPtW/A=", "jgIEj");
                    EntityTracker$1.lIlIlllIIIIlIl[EntityTracker$1.lIlIlllIIIIlll[3]] = llllIIlIllllIlI("J4x1fPfi2mWyxaEXO7jSvg==", "RguyI");
                    EntityTracker$1.lIlIlllIIIIlIl[EntityTracker$1.lIlIlllIIIIlll[4]] = llllIIlIlllIllI("Xw==", "vEFrv");
                }
                
                private static boolean llllIIllIIIIIII(final int lllllllllllllIIIIlIllllIllllllll, final int lllllllllllllIIIIlIllllIlllllllI) {
                    return lllllllllllllIIIIlIllllIllllllll < lllllllllllllIIIIlIllllIlllllllI;
                }
                
                private static void llllIIlIllllllI() {
                    (lIlIlllIIIIlll = new int[7])[0] = ((0x1 ^ 0x47 ^ (0x7F ^ 0x24)) & (19 + 20 + 84 + 97 ^ 90 + 92 - 53 + 64 ^ -" ".length()));
                    EntityTracker$1.lIlIlllIIIIlll[1] = " ".length();
                    EntityTracker$1.lIlIlllIIIIlll[2] = (-1 & Integer.MAX_VALUE);
                    EntityTracker$1.lIlIlllIIIIlll[3] = "  ".length();
                    EntityTracker$1.lIlIlllIIIIlll[4] = "   ".length();
                    EntityTracker$1.lIlIlllIIIIlll[5] = (0x85 ^ 0x89 ^ (0xB ^ 0x3));
                    EntityTracker$1.lIlIlllIIIIlll[6] = (" ".length() ^ (0x7D ^ 0x74));
                }
                
                private static String llllIIlIllllIlI(final String lllllllllllllIIIIlIlllllIIlIIIll, final String lllllllllllllIIIIlIlllllIIlIIIII) {
                    try {
                        final SecretKeySpec lllllllllllllIIIIlIlllllIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlllllIIlIIIII.getBytes(StandardCharsets.UTF_8)), EntityTracker$1.lIlIlllIIIIlll[6]), "DES");
                        final Cipher lllllllllllllIIIIlIlllllIIlIIlIl = Cipher.getInstance("DES");
                        lllllllllllllIIIIlIlllllIIlIIlIl.init(EntityTracker$1.lIlIlllIIIIlll[3], lllllllllllllIIIIlIlllllIIlIIllI);
                        return new String(lllllllllllllIIIIlIlllllIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlllllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIIIlIlllllIIlIIlII) {
                        lllllllllllllIIIIlIlllllIIlIIlII.printStackTrace();
                        return null;
                    }
                }
            });
            lllllllllllllIIIIlIIlIlIllllIlII.addEntityCrashInfo(lllllllllllllIIIIlIIlIlIlllIllIl);
            final CrashReportCategory lllllllllllllIIIIlIIlIlIlllIllII = lllllllllllllIIIIlIIlIlIlllIlllI.makeCategory(EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[14]]);
            this.trackedEntityHashTable.lookup(lllllllllllllIIIIlIIlIlIllllIlII.getEntityId()).trackedEntity.addEntityCrashInfo(lllllllllllllIIIIlIIlIlIlllIllII);
            try {
                throw new ReportedException(lllllllllllllIIIIlIIlIlIlllIlllI);
            }
            catch (ReportedException lllllllllllllIIIIlIIlIlIlllIlIll) {
                EntityTracker.logger.error(EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[15]], (Throwable)lllllllllllllIIIIlIIlIlIlllIlIll);
            }
        }
    }
    
    public void untrackEntity(final Entity lllllllllllllIIIIlIIlIlIllIllIlI) {
        if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIlIllIllIlI instanceof EntityPlayerMP) ? 1 : 0)) {
            final EntityPlayerMP lllllllllllllIIIIlIIlIlIllIllIIl = (EntityPlayerMP)lllllllllllllIIIIlIIlIlIllIllIlI;
            final boolean lllllllllllllIIIIlIIlIlIllIlIIlI = (boolean)this.trackedEntities.iterator();
            "".length();
            if (((0x94 ^ 0x8B) & ~(0x85 ^ 0x9A)) == "  ".length()) {
                return;
            }
            while (!llllIlIllIlIIlI(((Iterator)lllllllllllllIIIIlIIlIlIllIlIIlI).hasNext() ? 1 : 0)) {
                final EntityTrackerEntry lllllllllllllIIIIlIIlIlIllIllIII = ((Iterator<EntityTrackerEntry>)lllllllllllllIIIIlIIlIlIllIlIIlI).next();
                lllllllllllllIIIIlIIlIlIllIllIII.removeFromTrackedPlayers(lllllllllllllIIIIlIIlIlIllIllIIl);
            }
        }
        final EntityTrackerEntry lllllllllllllIIIIlIIlIlIllIlIlll = this.trackedEntityHashTable.removeObject(lllllllllllllIIIIlIIlIlIllIllIlI.getEntityId());
        if (llllIlIllIlIlII(lllllllllllllIIIIlIIlIlIllIlIlll)) {
            this.trackedEntities.remove(lllllllllllllIIIIlIIlIlIllIlIlll);
            "".length();
            lllllllllllllIIIIlIIlIlIllIlIlll.sendDestroyEntityPacketToTrackedPlayers();
        }
    }
    
    private static boolean llllIlIllIlIIIl(final Object lllllllllllllIIIIlIIlIlIIIllllll, final Object lllllllllllllIIIIlIIlIlIIIlllllI) {
        return lllllllllllllIIIIlIIlIlIIIllllll != lllllllllllllIIIIlIIlIlIIIlllllI;
    }
    
    public void func_151248_b(final Entity lllllllllllllIIIIlIIlIlIlIIlllll, final Packet lllllllllllllIIIIlIIlIlIlIlIIIlI) {
        final EntityTrackerEntry lllllllllllllIIIIlIIlIlIlIlIIIIl = this.trackedEntityHashTable.lookup(lllllllllllllIIIIlIIlIlIlIIlllll.getEntityId());
        if (llllIlIllIlIlII(lllllllllllllIIIIlIIlIlIlIlIIIIl)) {
            lllllllllllllIIIIlIIlIlIlIlIIIIl.func_151261_b(lllllllllllllIIIIlIIlIlIlIlIIIlI);
        }
    }
    
    public void updateTrackedEntities() {
        final List<EntityPlayerMP> lllllllllllllIIIIlIIlIlIllIIlIlI = (List<EntityPlayerMP>)Lists.newArrayList();
        final Iterator<EntityTrackerEntry> iterator = this.trackedEntities.iterator();
        "".length();
        if (((0x56 ^ 0x59 ^ (0x2F ^ 0x6D)) & (0x84 ^ 0x99 ^ (0x16 ^ 0x46) ^ -" ".length())) < 0) {
            return;
        }
        while (!llllIlIllIlIIlI(iterator.hasNext() ? 1 : 0)) {
            final EntityTrackerEntry lllllllllllllIIIIlIIlIlIllIIlIIl = iterator.next();
            lllllllllllllIIIIlIIlIlIllIIlIIl.updatePlayerList(this.theWorld.playerEntities);
            if (llllIlIllIlIIII(lllllllllllllIIIIlIIlIlIllIIlIIl.playerEntitiesUpdated ? 1 : 0) && llllIlIllIlIIII((lllllllllllllIIIIlIIlIlIllIIlIIl.trackedEntity instanceof EntityPlayerMP) ? 1 : 0)) {
                lllllllllllllIIIIlIIlIlIllIIlIlI.add((EntityPlayerMP)lllllllllllllIIIIlIIlIlIllIIlIIl.trackedEntity);
                "".length();
            }
        }
        int lllllllllllllIIIIlIIlIlIllIIlIII = EntityTracker.lIlIllllllllIl[6];
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!llllIlIllIlIlIl(lllllllllllllIIIIlIIlIlIllIIlIII, lllllllllllllIIIIlIIlIlIllIIlIlI.size())) {
            final EntityPlayerMP lllllllllllllIIIIlIIlIlIllIIIlll = lllllllllllllIIIIlIIlIlIllIIlIlI.get(lllllllllllllIIIIlIIlIlIllIIlIII);
            final short lllllllllllllIIIIlIIlIlIllIIIIII = (short)this.trackedEntities.iterator();
            "".length();
            if (-" ".length() >= ((0x5F ^ 0x14) & ~(0x3 ^ 0x48))) {
                return;
            }
            while (!llllIlIllIlIIlI(((Iterator)lllllllllllllIIIIlIIlIlIllIIIIII).hasNext() ? 1 : 0)) {
                final EntityTrackerEntry lllllllllllllIIIIlIIlIlIllIIIllI = ((Iterator<EntityTrackerEntry>)lllllllllllllIIIIlIIlIlIllIIIIII).next();
                if (llllIlIllIlIIIl(lllllllllllllIIIIlIIlIlIllIIIllI.trackedEntity, lllllllllllllIIIIlIIlIlIllIIIlll)) {
                    lllllllllllllIIIIlIIlIlIllIIIllI.updatePlayerEntity(lllllllllllllIIIIlIIlIlIllIIIlll);
                }
            }
            ++lllllllllllllIIIIlIIlIlIllIIlIII;
        }
    }
    
    public void trackEntity(final Entity lllllllllllllIIIIlIIlIllIIIlIIll) {
        if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityPlayerMP) ? 1 : 0)) {
            this.trackEntity(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[0], EntityTracker.lIlIllllllllIl[1]);
            final EntityPlayerMP lllllllllllllIIIIlIIlIllIIIlIIlI = (EntityPlayerMP)lllllllllllllIIIIlIIlIllIIIlIIll;
            final char lllllllllllllIIIIlIIlIllIIIIllII = (char)this.trackedEntities.iterator();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!llllIlIllIlIIlI(((Iterator)lllllllllllllIIIIlIIlIllIIIIllII).hasNext() ? 1 : 0)) {
                final EntityTrackerEntry lllllllllllllIIIIlIIlIllIIIlIIIl = ((Iterator<EntityTrackerEntry>)lllllllllllllIIIIlIIlIllIIIIllII).next();
                if (llllIlIllIlIIIl(lllllllllllllIIIIlIIlIllIIIlIIIl.trackedEntity, lllllllllllllIIIIlIIlIllIIIlIIlI)) {
                    lllllllllllllIIIIlIIlIllIIIlIIIl.updatePlayerEntity(lllllllllllllIIIIlIIlIllIIIlIIlI);
                }
            }
            "".length();
            if ("   ".length() == (0xA5 ^ 0xA1)) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityFishHook) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[3], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if (-(0xAC ^ 0xA9) >= 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityArrow) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[5], (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
            "".length();
            if (((0x27 ^ 0x1D ^ (0x6B ^ 0x5B)) & (0x6 ^ 0xA ^ (0xBE ^ 0xB8) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntitySmallFireball) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityFireball) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
            "".length();
            if (-(15 + 114 - 81 + 110 ^ 78 + 30 + 5 + 41) >= 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntitySnowball) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ((0x68 ^ 0x60 ^ (0x3C ^ 0x30)) < 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityEnderPearl) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ((0xB0 ^ 0xB5) <= 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityEnderEye) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[8], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityEgg) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityPotion) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityExpBottle) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ((0x5F ^ 0x5A) == 0x0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityFireworkRocket) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ((19 + 136 - 139 + 160 ^ 178 + 63 - 123 + 62) <= "   ".length()) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityItem) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[5], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityMinecart) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[9], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if (((0xDE ^ 0xB9 ^ (0x4B ^ 0x33)) & (0x7C ^ 0x3F ^ (0x7 ^ 0x5B) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityBoat) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[9], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ("  ".length() > (0xD ^ 0x67 ^ (0xC1 ^ 0xAF))) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntitySquid) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[2], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ((0x5E ^ 0x5A) < " ".length()) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityWither) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[9], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityBat) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[9], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityDragon) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[11], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ((0x70 ^ 0x42 ^ (0x88 ^ 0xBE)) <= 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof IAnimals) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[9], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityTNTPrimed) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[11], EntityTracker.lIlIllllllllIl[7], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if (-(0x1C ^ 0x19) >= 0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityFallingBlock) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[11], EntityTracker.lIlIllllllllIl[5], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if (((0x9D ^ 0x91) & ~(0x92 ^ 0x9E)) != 0x0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityHanging) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[11], EntityTracker.lIlIllllllllIl[12], (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityArmorStand) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[11], EntityTracker.lIlIllllllllIl[10], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if (((0x35 ^ 0x7B) & ~(0xD1 ^ 0x9F)) != 0x0) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityXPOrb) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[11], EntityTracker.lIlIllllllllIl[5], (boolean)(EntityTracker.lIlIllllllllIl[4] != 0));
            "".length();
            if ((11 + 84 - 6 + 39 ^ 72 + 60 - 50 + 50) < (110 + 36 - 102 + 86 ^ 117 + 53 - 140 + 104)) {
                return;
            }
        }
        else if (llllIlIllIlIIII((lllllllllllllIIIIlIIlIllIIIlIIll instanceof EntityEnderCrystal) ? 1 : 0)) {
            this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIlIIll, EntityTracker.lIlIllllllllIl[13], EntityTracker.lIlIllllllllIl[12], (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
        }
    }
    
    static {
        llllIlIllIIllll();
        llllIlIllIIlllI();
        logger = LogManager.getLogger();
    }
    
    private static boolean llllIlIllIlIlll(final int lllllllllllllIIIIlIIlIlIIlIIllll, final int lllllllllllllIIIIlIIlIlIIlIIlllI) {
        return lllllllllllllIIIIlIIlIlIIlIIllll == lllllllllllllIIIIlIIlIlIIlIIlllI;
    }
    
    private static void llllIlIllIIlllI() {
        (lIlIllllllllII = new String[EntityTracker.lIlIllllllllIl[16]])[EntityTracker.lIlIllllllllIl[6]] = llllIlIllIIlIll("ND0uCg0IczMQWRA/KAYYFSp6FwsQMDEGHVA=", "qSZcy");
        EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[4]] = llllIlIllIIllII("2jvSAIMXbDgRp632OJ6gSiwRnlbWzj80", "lDaMG");
        EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[1]] = llllIlIllIIllII("KBgZPPde3cE2dZXQeQuhkg==", "JVNAu");
        EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[10]] = llllIlIllIIlIll("LiMuDDoTPyhPIxs/KAo=", "zQOoQ");
        EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[8]] = llllIlIllIIllII("cKnGoROA8nQ=", "DmWTU");
        EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[3]] = llllIlIllIIlIll("BgQyCQY2VD8GBjYGIAke", "StVhr");
        EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[14]] = llllIlIllIIllIl("0NNbeNWT1WxpKEiGKyc1pw0JgYEX7Dehmg2DNYSFVSM=", "AMYuI");
        EntityTracker.lIlIllllllllII[EntityTracker.lIlIllllllllIl[15]] = llllIlIllIIllII("064UrS+aDNNvxC5uYxV6U4bUpXGfNcyMlR0lH32HCw8eDgAl7hyU0hKjO23gypGY", "ZtNlw");
    }
    
    public void trackEntity(final Entity lllllllllllllIIIIlIIlIllIIIIIllI, final int lllllllllllllIIIIlIIlIllIIIIIIIl, final int lllllllllllllIIIIlIIlIllIIIIIIII) {
        this.addEntityToTracker(lllllllllllllIIIIlIIlIllIIIIIllI, lllllllllllllIIIIlIIlIllIIIIIIIl, lllllllllllllIIIIlIIlIllIIIIIIII, (boolean)(EntityTracker.lIlIllllllllIl[6] != 0));
    }
    
    public void removePlayerFromTrackers(final EntityPlayerMP lllllllllllllIIIIlIIlIlIlIIlIlII) {
        final double lllllllllllllIIIIlIIlIlIlIIlIIlI = (double)this.trackedEntities.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llllIlIllIlIIlI(((Iterator)lllllllllllllIIIIlIIlIlIlIIlIIlI).hasNext() ? 1 : 0)) {
            final EntityTrackerEntry lllllllllllllIIIIlIIlIlIlIIlIllI = ((Iterator<EntityTrackerEntry>)lllllllllllllIIIIlIIlIlIlIIlIIlI).next();
            lllllllllllllIIIIlIIlIlIlIIlIllI.removeTrackedPlayerSymmetric(lllllllllllllIIIIlIIlIlIlIIlIlII);
        }
    }
    
    private static boolean llllIlIllIlIlIl(final int lllllllllllllIIIIlIIlIlIIlIIlIll, final int lllllllllllllIIIIlIIlIlIIlIIlIlI) {
        return lllllllllllllIIIIlIIlIlIIlIIlIll >= lllllllllllllIIIIlIIlIlIIlIIlIlI;
    }
    
    private static String llllIlIllIIllII(final String lllllllllllllIIIIlIIlIlIIlIlIlll, final String lllllllllllllIIIIlIIlIlIIlIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIlIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIlIIlIlIllI.getBytes(StandardCharsets.UTF_8)), EntityTracker.lIlIllllllllIl[16]), "DES");
            final Cipher lllllllllllllIIIIlIIlIlIIlIllIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIlIlIIlIllIIl.init(EntityTracker.lIlIllllllllIl[1], lllllllllllllIIIIlIIlIlIIlIllIlI);
            return new String(lllllllllllllIIIIlIIlIlIIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIlIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIlIIlIllIII) {
            lllllllllllllIIIIlIIlIlIIlIllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIllIlIIlI(final int lllllllllllllIIIIlIIlIlIIIllIlII) {
        return lllllllllllllIIIIlIIlIlIIIllIlII == 0;
    }
    
    private static boolean llllIlIllIlIllI(final Object lllllllllllllIIIIlIIlIlIIIlllIIl, final Object lllllllllllllIIIIlIIlIlIIIlllIII) {
        return lllllllllllllIIIIlIIlIlIIIlllIIl == lllllllllllllIIIIlIIlIlIIIlllIII;
    }
}
