// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import java.util.Iterator;
import java.lang.reflect.Constructor;
import net.minecraft.util.IJsonSerializable;
import com.google.gson.JsonParser;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.player.EntityPlayer;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.TupleIntJsonSerializable;
import java.util.Map;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S37PacketStatistics;
import com.google.common.collect.Maps;
import net.minecraft.entity.player.EntityPlayerMP;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import java.io.File;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class StatisticsFile extends StatFileWriter
{
    private /* synthetic */ int field_150885_f;
    private static final /* synthetic */ String[] lIIIllIlIlIIII;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ Set<StatBase> field_150888_e;
    private static final /* synthetic */ int[] lIIIllIlIlllll;
    private /* synthetic */ boolean field_150886_g;
    private final /* synthetic */ File statsFile;
    private final /* synthetic */ MinecraftServer mcServer;
    
    private static boolean llIIIlIIllllIlI(final Object lllllllllllllIIlllllllIlIlIlIIII) {
        return lllllllllllllIIlllllllIlIlIlIIII != null;
    }
    
    private static String llIIIlIIIlllIll(final String lllllllllllllIIlllllllIlIlIlllll, final String lllllllllllllIIlllllllIlIlIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIlllllllIlIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllllIlIlIllllI.getBytes(StandardCharsets.UTF_8)), StatisticsFile.lIIIllIlIlllll[9]), "DES");
            final Cipher lllllllllllllIIlllllllIlIllIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIlllllllIlIllIIIIl.init(StatisticsFile.lIIIllIlIlllll[3], lllllllllllllIIlllllllIlIllIIIlI);
            return new String(lllllllllllllIIlllllllIlIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllllIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllllIlIllIIIII) {
            lllllllllllllIIlllllllIlIllIIIII.printStackTrace();
            return null;
        }
    }
    
    public void saveStatFile() {
        try {
            FileUtils.writeStringToFile(this.statsFile, dumpJson(this.statsData));
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (IOException lllllllllllllIIllllllllIIIIIIIlI) {
            StatisticsFile.logger.error(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[3]], (Throwable)lllllllllllllIIllllllllIIIIIIIlI);
        }
    }
    
    private static boolean llIIIlIIlllIlll(final int lllllllllllllIIlllllllIlIlIIlllI) {
        return lllllllllllllIIlllllllIlIlIIlllI != 0;
    }
    
    public void sendAchievements(final EntityPlayerMP lllllllllllllIIlllllllIllIIlIllI) {
        final Map<StatBase, Integer> lllllllllllllIIlllllllIllIIlIlIl = (Map<StatBase, Integer>)Maps.newHashMap();
        final char lllllllllllllIIlllllllIllIIIllll = (char)AchievementList.achievementList.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIIlIIllllIII(((Iterator)lllllllllllllIIlllllllIllIIIllll).hasNext() ? 1 : 0)) {
            final Achievement lllllllllllllIIlllllllIllIIlIlII = ((Iterator<Achievement>)lllllllllllllIIlllllllIllIIIllll).next();
            if (llIIIlIIlllIlll(this.hasAchievementUnlocked(lllllllllllllIIlllllllIllIIlIlII) ? 1 : 0)) {
                lllllllllllllIIlllllllIllIIlIlIl.put(lllllllllllllIIlllllllIllIIlIlII, this.readStat(lllllllllllllIIlllllllIllIIlIlII));
                "".length();
                this.field_150888_e.remove(lllllllllllllIIlllllllIllIIlIlII);
                "".length();
            }
        }
        lllllllllllllIIlllllllIllIIlIllI.playerNetServerHandler.sendPacket(new S37PacketStatistics(lllllllllllllIIlllllllIllIIlIlIl));
    }
    
    public static String dumpJson(final Map<StatBase, TupleIntJsonSerializable> lllllllllllllIIlllllllIlllIIIIII) {
        final JsonObject lllllllllllllIIlllllllIllIllllll = new JsonObject();
        final long lllllllllllllIIlllllllIllIlllIII = (long)lllllllllllllIIlllllllIlllIIIIII.entrySet().iterator();
        "".length();
        if (((0x3E ^ 0x75 ^ (0x0 ^ 0x5B)) & (0x77 ^ 0x4A ^ (0x3 ^ 0x2E) ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!llIIIlIIllllIII(((Iterator)lllllllllllllIIlllllllIllIlllIII).hasNext() ? 1 : 0)) {
            final Map.Entry<StatBase, TupleIntJsonSerializable> lllllllllllllIIlllllllIllIlllllI = ((Iterator<Map.Entry<StatBase, TupleIntJsonSerializable>>)lllllllllllllIIlllllllIllIlllIII).next();
            if (llIIIlIIllllIlI(lllllllllllllIIlllllllIllIlllllI.getValue().getJsonSerializableValue())) {
                final JsonObject lllllllllllllIIlllllllIllIllllIl = new JsonObject();
                lllllllllllllIIlllllllIllIllllIl.addProperty(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[16]], (Number)lllllllllllllIIlllllllIllIlllllI.getValue().getIntegerValue());
                try {
                    lllllllllllllIIlllllllIllIllllIl.add(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[17]], lllllllllllllIIlllllllIllIlllllI.getValue().getJsonSerializableValue().getSerializableElement());
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                catch (Throwable lllllllllllllIIlllllllIllIllllII) {
                    StatisticsFile.logger.warn(String.valueOf(new StringBuilder(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[18]]).append(lllllllllllllIIlllllllIllIlllllI.getKey().getStatName()).append(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[19]])), lllllllllllllIIlllllllIllIllllII);
                }
                lllllllllllllIIlllllllIllIllllll.add(lllllllllllllIIlllllllIllIlllllI.getKey().statId, (JsonElement)lllllllllllllIIlllllllIllIllllIl);
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
                continue;
            }
            else {
                lllllllllllllIIlllllllIllIllllll.addProperty(lllllllllllllIIlllllllIllIlllllI.getKey().statId, (Number)lllllllllllllIIlllllllIllIlllllI.getValue().getIntegerValue());
            }
        }
        return lllllllllllllIIlllllllIllIllllll.toString();
    }
    
    public void readStatFile() {
        if (llIIIlIIlllIlll(this.statsFile.isFile() ? 1 : 0)) {
            try {
                this.statsData.clear();
                this.statsData.putAll(this.parseJson(FileUtils.readFileToString(this.statsFile)));
                "".length();
                if (((0xCB ^ 0xC6) & ~(0x6B ^ 0x66)) < ((0x6F ^ 0x50) & ~(0x8C ^ 0xB3))) {
                    return;
                }
            }
            catch (IOException lllllllllllllIIllllllllIIIIIlIIl) {
                StatisticsFile.logger.error(String.valueOf(new StringBuilder(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[1]]).append(this.statsFile)), (Throwable)lllllllllllllIIllllllllIIIIIlIIl);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            catch (JsonParseException lllllllllllllIIllllllllIIIIIlIII) {
                StatisticsFile.logger.error(String.valueOf(new StringBuilder(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[2]]).append(this.statsFile)), (Throwable)lllllllllllllIIllllllllIIIIIlIII);
            }
        }
    }
    
    public void func_150877_d() {
        final long lllllllllllllIIlllllllIllIlIlllI = (long)this.statsData.keySet().iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!llIIIlIIllllIII(((Iterator)lllllllllllllIIlllllllIllIlIlllI).hasNext() ? 1 : 0)) {
            final StatBase lllllllllllllIIlllllllIllIllIIIl = ((Iterator<StatBase>)lllllllllllllIIlllllllIllIlIlllI).next();
            this.field_150888_e.add(lllllllllllllIIlllllllIllIllIIIl);
            "".length();
        }
    }
    
    private static boolean llIIIlIIllllIII(final int lllllllllllllIIlllllllIlIlIIllII) {
        return lllllllllllllIIlllllllIlIlIIllII == 0;
    }
    
    static {
        llIIIlIIlllIllI();
        llIIIlIIIllllII();
        logger = LogManager.getLogger();
    }
    
    public StatisticsFile(final MinecraftServer lllllllllllllIIllllllllIIIIIlllI, final File lllllllllllllIIllllllllIIIIIllIl) {
        this.field_150888_e = (Set<StatBase>)Sets.newHashSet();
        this.field_150885_f = StatisticsFile.lIIIllIlIlllll[0];
        this.field_150886_g = (StatisticsFile.lIIIllIlIlllll[1] != 0);
        this.mcServer = lllllllllllllIIllllllllIIIIIlllI;
        this.statsFile = lllllllllllllIIllllllllIIIIIllIl;
    }
    
    public Set<StatBase> func_150878_c() {
        final Set<StatBase> lllllllllllllIIlllllllIllllIllIl = (Set<StatBase>)Sets.newHashSet((Iterable)this.field_150888_e);
        this.field_150888_e.clear();
        this.field_150886_g = (StatisticsFile.lIIIllIlIlllll[1] != 0);
        return lllllllllllllIIlllllllIllllIllIl;
    }
    
    private static void llIIIlIIlllIllI() {
        (lIIIllIlIlllll = new int[22])[0] = -(-(0xFFFFFEC7 & 0x1BF9) & (0xFFFFDBFD & 0x3FEE));
        StatisticsFile.lIIIllIlIlllll[1] = ((0x4D ^ 0x1B) & ~(0x6C ^ 0x3A));
        StatisticsFile.lIIIllIlIlllll[2] = " ".length();
        StatisticsFile.lIIIllIlIlllll[3] = "  ".length();
        StatisticsFile.lIIIllIlIlllll[4] = "   ".length();
        StatisticsFile.lIIIllIlIlllll[5] = (0x2A ^ 0x2E);
        StatisticsFile.lIIIllIlIlllll[6] = (0x12 ^ 0x3B ^ (0x62 ^ 0x4E));
        StatisticsFile.lIIIllIlIlllll[7] = (0xC ^ 0x1E ^ (0xD6 ^ 0xC2));
        StatisticsFile.lIIIllIlIlllll[8] = (0x6C ^ 0x6 ^ (0x2 ^ 0x6F));
        StatisticsFile.lIIIllIlIlllll[9] = (0x89 ^ 0x81);
        StatisticsFile.lIIIllIlIlllll[10] = (0xB0 ^ 0xB9);
        StatisticsFile.lIIIllIlIlllll[11] = (0x2F ^ 0x25);
        StatisticsFile.lIIIllIlIlllll[12] = (0x7F ^ 0x40 ^ (0x7A ^ 0x4E));
        StatisticsFile.lIIIllIlIlllll[13] = (0x24 ^ 0x46 ^ (0x19 ^ 0x77));
        StatisticsFile.lIIIllIlIlllll[14] = (0x42 ^ 0x4F);
        StatisticsFile.lIIIllIlIlllll[15] = (" ".length() ^ (0x20 ^ 0x2F));
        StatisticsFile.lIIIllIlIlllll[16] = (0x39 ^ 0x36);
        StatisticsFile.lIIIllIlIlllll[17] = (0x5A ^ 0x6A ^ (0x1D ^ 0x3D));
        StatisticsFile.lIIIllIlIlllll[18] = (0xA5 ^ 0xB4);
        StatisticsFile.lIIIllIlIlllll[19] = (0x20 ^ 0x6E ^ (0x5F ^ 0x3));
        StatisticsFile.lIIIllIlIlllll[20] = (-(0xFFFFFEDC & 0x6567) & (0xFFFFEF7F & 0x75EF));
        StatisticsFile.lIIIllIlIlllll[21] = (0x23 ^ 0x2 ^ (0xA4 ^ 0x96));
    }
    
    private static String llIIIlIIIllIllI(String lllllllllllllIIlllllllIlIllIllll, final String lllllllllllllIIlllllllIlIllIlllI) {
        lllllllllllllIIlllllllIlIllIllll = new String(Base64.getDecoder().decode(lllllllllllllIIlllllllIlIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllllIlIlllIIlI = new StringBuilder();
        final char[] lllllllllllllIIlllllllIlIlllIIIl = lllllllllllllIIlllllllIlIllIlllI.toCharArray();
        int lllllllllllllIIlllllllIlIlllIIII = StatisticsFile.lIIIllIlIlllll[1];
        final String lllllllllllllIIlllllllIlIllIlIlI = (Object)lllllllllllllIIlllllllIlIllIllll.toCharArray();
        final byte lllllllllllllIIlllllllIlIllIlIIl = (byte)lllllllllllllIIlllllllIlIllIlIlI.length;
        float lllllllllllllIIlllllllIlIllIlIII = StatisticsFile.lIIIllIlIlllll[1];
        while (llIIIlIIlllllII((int)lllllllllllllIIlllllllIlIllIlIII, lllllllllllllIIlllllllIlIllIlIIl)) {
            final char lllllllllllllIIlllllllIlIlllIlIl = lllllllllllllIIlllllllIlIllIlIlI[lllllllllllllIIlllllllIlIllIlIII];
            lllllllllllllIIlllllllIlIlllIIlI.append((char)(lllllllllllllIIlllllllIlIlllIlIl ^ lllllllllllllIIlllllllIlIlllIIIl[lllllllllllllIIlllllllIlIlllIIII % lllllllllllllIIlllllllIlIlllIIIl.length]));
            "".length();
            ++lllllllllllllIIlllllllIlIlllIIII;
            ++lllllllllllllIIlllllllIlIllIlIII;
            "".length();
            if (((99 + 122 - 146 + 85 ^ 148 + 72 - 154 + 123) & (34 + 136 - 167 + 150 ^ 106 + 16 - 64 + 74 ^ -" ".length())) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllllIlIlllIIlI);
    }
    
    private static void llIIIlIIIllllII() {
        (lIIIllIlIlIIII = new String[StatisticsFile.lIIIllIlIlllll[21]])[StatisticsFile.lIIIllIlIlllll[1]] = llIIIlIIIllIllI("MBYZIhUdXhhuAxYYCG4CBxgYJwIHEA89URUQACtR", "sylNq");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[2]] = llIIIlIIIllIllI("NDUfGQYZfR5VEhYoGRBCBC4LAQsELgMWEVc8AxkHVw==", "wZjub");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[3]] = llIIIlIIIllIlll("PYgmYXk9zVAY6NiFKGZnkDZX6iO18mjK", "yCmSU");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[4]] = llIIIlIIIllIlll("pzpCP9JUFqmvUuD8gq1a0qhmJWaD/vgV", "vubaE");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[5]] = llIIIlIIIllIllI("MRgOIUMmCR8wQzMTBzwIJBUCMAMmXhs0Bjce", "RpoUm");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[6]] = llIIIlIIIlllIll("pxipBobG5rY=", "qeNKt");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[7]] = llIIIlIIIllIlll("LeJQVp5okjk=", "FKpis");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[8]] = llIIIlIIIlllIll("yx8DvjIcmAU=", "YqhQg");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[9]] = llIIIlIIIlllIll("CZsyfa/woMc=", "SMMEU");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[10]] = llIIIlIIIlllIll("K6NQNcOAcshUV2wPvPWQXg==", "YRuDg");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[11]] = llIIIlIIIllIllI("JAgcEyoxCQA=", "TzstX");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[12]] = llIIIlIIIlllIll("IO4J9wkrSYn2LxQw3N+rjHALA03z/8AkzPEdbL+8x3s=", "OxVHX");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[13]] = llIIIlIIIllIllI("Dxs7AwcvEW0RHycBJBEfLxZtCwVm", "FuMbk");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[14]] = llIIIlIIIllIlll("pEB5gsrvRidiXXo9eTbXuFc272fxNwBp", "Czzpm");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[15]] = llIIIlIIIlllIll("zPg8TlVdPMI=", "fcnHX");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[16]] = llIIIlIIIllIllI("JSsmIBY=", "SJJUs");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[17]] = llIIIlIIIllIllI("BjUjJgoTND8=", "vGLAx");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[18]] = llIIIlIIIlllIll("CC3HwhH6+F5AF0oWdHk1NvYVaypy0zJsTzCm3zAHGGc=", "hEFRh");
        StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[19]] = llIIIlIIIllIlll("8vAq9rNtovALrif6D8w3YiyiseC58nEUxfPqI1pSVts=", "SyXlQ");
    }
    
    private static boolean llIIIlIIlllllII(final int lllllllllllllIIlllllllIlIlIlIlll, final int lllllllllllllIIlllllllIlIlIlIllI) {
        return lllllllllllllIIlllllllIlIlIlIlll < lllllllllllllIIlllllllIlIlIlIllI;
    }
    
    private static boolean llIIIlIIllllIIl(final int lllllllllllllIIlllllllIlIlIIlIlI) {
        return lllllllllllllIIlllllllIlIlIIlIlI > 0;
    }
    
    @Override
    public void unlockAchievement(final EntityPlayer lllllllllllllIIlllllllIllllllIIl, final StatBase lllllllllllllIIlllllllIlllllIIll, final int lllllllllllllIIlllllllIlllllIlll) {
        int stat;
        if (llIIIlIIlllIlll(lllllllllllllIIlllllllIlllllIIll.isAchievement() ? 1 : 0)) {
            stat = this.readStat(lllllllllllllIIlllllllIlllllIIll);
            "".length();
            if (-(0x5B ^ 0x60 ^ (0x7B ^ 0x45)) >= 0) {
                return;
            }
        }
        else {
            stat = StatisticsFile.lIIIllIlIlllll[1];
        }
        final int lllllllllllllIIlllllllIlllllIllI = stat;
        super.unlockAchievement(lllllllllllllIIlllllllIllllllIIl, lllllllllllllIIlllllllIlllllIIll, lllllllllllllIIlllllllIlllllIlll);
        this.field_150888_e.add(lllllllllllllIIlllllllIlllllIIll);
        "".length();
        if (llIIIlIIlllIlll(lllllllllllllIIlllllllIlllllIIll.isAchievement() ? 1 : 0) && llIIIlIIllllIII(lllllllllllllIIlllllllIlllllIllI) && llIIIlIIllllIIl(lllllllllllllIIlllllllIlllllIlll)) {
            this.field_150886_g = (StatisticsFile.lIIIllIlIlllll[2] != 0);
            if (llIIIlIIlllIlll(this.mcServer.isAnnouncingPlayerAchievements() ? 1 : 0)) {
                final ServerConfigurationManager configurationManager = this.mcServer.getConfigurationManager();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[4]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[StatisticsFile.lIIIllIlIlllll[3]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[StatisticsFile.lIIIllIlIlllll[1]] = lllllllllllllIIlllllllIllllllIIl.getDisplayName();
                lllllllllllllIlIIlIlllIIlIIIIIIl[StatisticsFile.lIIIllIlIlllll[2]] = lllllllllllllIIlllllllIlllllIIll.func_150955_j();
                configurationManager.sendChatMsg(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
            }
        }
        if (llIIIlIIlllIlll(lllllllllllllIIlllllllIlllllIIll.isAchievement() ? 1 : 0) && llIIIlIIllllIIl(lllllllllllllIIlllllllIlllllIllI) && llIIIlIIllllIII(lllllllllllllIIlllllllIlllllIlll)) {
            this.field_150886_g = (StatisticsFile.lIIIllIlIlllll[2] != 0);
            if (llIIIlIIlllIlll(this.mcServer.isAnnouncingPlayerAchievements() ? 1 : 0)) {
                final ServerConfigurationManager configurationManager2 = this.mcServer.getConfigurationManager();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[5]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[StatisticsFile.lIIIllIlIlllll[3]];
                lllllllllllllIlIIlIlllIIlIIIIIIl2[StatisticsFile.lIIIllIlIlllll[1]] = lllllllllllllIIlllllllIllllllIIl.getDisplayName();
                lllllllllllllIlIIlIlllIIlIIIIIIl2[StatisticsFile.lIIIllIlIlllll[2]] = lllllllllllllIIlllllllIlllllIIll.func_150955_j();
                configurationManager2.sendChatMsg(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2));
            }
        }
    }
    
    public boolean func_150879_e() {
        return this.field_150886_g;
    }
    
    private static boolean llIIIlIIllllIll(final int lllllllllllllIIlllllllIlIlIlIIll, final int lllllllllllllIIlllllllIlIlIlIIlI) {
        return lllllllllllllIIlllllllIlIlIlIIll > lllllllllllllIIlllllllIlIlIlIIlI;
    }
    
    private static String llIIIlIIIllIlll(final String lllllllllllllIIlllllllIllIIIIIlI, final String lllllllllllllIIlllllllIllIIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlllllllIllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllllIllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllllllIllIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllllllIllIIIIllI.init(StatisticsFile.lIIIllIlIlllll[3], lllllllllllllIIlllllllIllIIIIlll);
            return new String(lllllllllllllIIlllllllIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllllIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllllIllIIIIlIl) {
            lllllllllllllIIlllllllIllIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    public void func_150876_a(final EntityPlayerMP lllllllllllllIIlllllllIllIlIIIIl) {
        final int lllllllllllllIIlllllllIllIlIIlIl = this.mcServer.getTickCounter();
        final Map<StatBase, Integer> lllllllllllllIIlllllllIllIlIIlII = (Map<StatBase, Integer>)Maps.newHashMap();
        if (!llIIIlIIllllIII(this.field_150886_g ? 1 : 0) || llIIIlIIllllIll(lllllllllllllIIlllllllIllIlIIlIl - this.field_150885_f, StatisticsFile.lIIIllIlIlllll[20])) {
            this.field_150885_f = lllllllllllllIIlllllllIllIlIIlIl;
            final Exception lllllllllllllIIlllllllIllIIlllIl = (Exception)this.func_150878_c().iterator();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!llIIIlIIllllIII(((Iterator)lllllllllllllIIlllllllIllIIlllIl).hasNext() ? 1 : 0)) {
                final StatBase lllllllllllllIIlllllllIllIlIIIll = ((Iterator<StatBase>)lllllllllllllIIlllllllIllIIlllIl).next();
                lllllllllllllIIlllllllIllIlIIlII.put(lllllllllllllIIlllllllIllIlIIIll, this.readStat(lllllllllllllIIlllllllIllIlIIIll));
                "".length();
            }
        }
        lllllllllllllIIlllllllIllIlIIIIl.playerNetServerHandler.sendPacket(new S37PacketStatistics(lllllllllllllIIlllllllIllIlIIlII));
    }
    
    public Map<StatBase, TupleIntJsonSerializable> parseJson(final String lllllllllllllIIlllllllIlllIlllIl) {
        final JsonElement lllllllllllllIIlllllllIlllIlllII = new JsonParser().parse(lllllllllllllIIlllllllIlllIlllIl);
        if (llIIIlIIllllIII(lllllllllllllIIlllllllIlllIlllII.isJsonObject() ? 1 : 0)) {
            return (Map<StatBase, TupleIntJsonSerializable>)Maps.newHashMap();
        }
        final JsonObject lllllllllllllIIlllllllIlllIllIll = lllllllllllllIIlllllllIlllIlllII.getAsJsonObject();
        final Map<StatBase, TupleIntJsonSerializable> lllllllllllllIIlllllllIlllIllIlI = (Map<StatBase, TupleIntJsonSerializable>)Maps.newHashMap();
        final Exception lllllllllllllIIlllllllIlllIIllII = (Exception)lllllllllllllIIlllllllIlllIllIll.entrySet().iterator();
        "".length();
        if ("   ".length() < 0) {
            return null;
        }
        while (!llIIIlIIllllIII(((Iterator)lllllllllllllIIlllllllIlllIIllII).hasNext() ? 1 : 0)) {
            final Map.Entry<String, JsonElement> lllllllllllllIIlllllllIlllIllIIl = ((Iterator<Map.Entry<String, JsonElement>>)lllllllllllllIIlllllllIlllIIllII).next();
            final StatBase lllllllllllllIIlllllllIlllIllIII = StatList.getOneShotStat(lllllllllllllIIlllllllIlllIllIIl.getKey());
            if (llIIIlIIllllIlI(lllllllllllllIIlllllllIlllIllIII)) {
                final TupleIntJsonSerializable lllllllllllllIIlllllllIlllIlIlll = new TupleIntJsonSerializable();
                if (llIIIlIIlllIlll(lllllllllllllIIlllllllIlllIllIIl.getValue().isJsonPrimitive() ? 1 : 0) && llIIIlIIlllIlll(lllllllllllllIIlllllllIlllIllIIl.getValue().getAsJsonPrimitive().isNumber() ? 1 : 0)) {
                    lllllllllllllIIlllllllIlllIlIlll.setIntegerValue(lllllllllllllIIlllllllIlllIllIIl.getValue().getAsInt());
                    "".length();
                    if (((0xDF ^ 0x83 ^ (0x50 ^ 0x34)) & (0x63 ^ 0x70 ^ (0x17 ^ 0x3C) ^ -" ".length())) <= -" ".length()) {
                        return null;
                    }
                }
                else if (llIIIlIIlllIlll(lllllllllllllIIlllllllIlllIllIIl.getValue().isJsonObject() ? 1 : 0)) {
                    final JsonObject lllllllllllllIIlllllllIlllIlIllI = lllllllllllllIIlllllllIlllIllIIl.getValue().getAsJsonObject();
                    if (llIIIlIIlllIlll(lllllllllllllIIlllllllIlllIlIllI.has(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[6]]) ? 1 : 0) && llIIIlIIlllIlll(lllllllllllllIIlllllllIlllIlIllI.get(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[7]]).isJsonPrimitive() ? 1 : 0) && llIIIlIIlllIlll(lllllllllllllIIlllllllIlllIlIllI.get(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[8]]).getAsJsonPrimitive().isNumber() ? 1 : 0)) {
                        lllllllllllllIIlllllllIlllIlIlll.setIntegerValue(lllllllllllllIIlllllllIlllIlIllI.getAsJsonPrimitive(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[9]]).getAsInt());
                    }
                    if (llIIIlIIlllIlll(lllllllllllllIIlllllllIlllIlIllI.has(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[10]]) ? 1 : 0) && llIIIlIIllllIlI(lllllllllllllIIlllllllIlllIllIII.func_150954_l())) {
                        try {
                            final Constructor<? extends IJsonSerializable> lllllllllllllIIlllllllIlllIlIlIl = lllllllllllllIIlllllllIlllIllIII.func_150954_l().getConstructor((Class<?>[])new Class[StatisticsFile.lIIIllIlIlllll[1]]);
                            final IJsonSerializable lllllllllllllIIlllllllIlllIlIlII = (IJsonSerializable)lllllllllllllIIlllllllIlllIlIlIl.newInstance(new Object[StatisticsFile.lIIIllIlIlllll[1]]);
                            lllllllllllllIIlllllllIlllIlIlII.fromJson(lllllllllllllIIlllllllIlllIlIllI.get(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[11]]));
                            lllllllllllllIIlllllllIlllIlIlll.setJsonSerializableValue(lllllllllllllIIlllllllIlllIlIlII);
                            "".length();
                            if (" ".length() < ((0x69 ^ 0x78) & ~(0x64 ^ 0x75))) {
                                return null;
                            }
                        }
                        catch (Throwable lllllllllllllIIlllllllIlllIlIIll) {
                            StatisticsFile.logger.warn(String.valueOf(new StringBuilder(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[12]]).append(this.statsFile)), lllllllllllllIIlllllllIlllIlIIll);
                        }
                    }
                }
                lllllllllllllIIlllllllIlllIllIlI.put(lllllllllllllIIlllllllIlllIllIII, lllllllllllllIIlllllllIlllIlIlll);
                "".length();
                "".length();
                if (((0xC4 ^ 0xA7) & ~(0xD0 ^ 0xB3)) != 0x0) {
                    return null;
                }
                continue;
            }
            else {
                StatisticsFile.logger.warn(String.valueOf(new StringBuilder(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[13]]).append(this.statsFile).append(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[14]]).append(lllllllllllllIIlllllllIlllIllIIl.getKey()).append(StatisticsFile.lIIIllIlIlIIII[StatisticsFile.lIIIllIlIlllll[15]])));
            }
        }
        return lllllllllllllIIlllllllIlllIllIlI;
    }
}
