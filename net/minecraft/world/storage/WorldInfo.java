// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTBase;
import net.minecraft.server.MinecraftServer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.world.WorldType;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.GameRules;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.EnumDifficulty;

public class WorldInfo
{
    private /* synthetic */ double borderSafeZone;
    private /* synthetic */ double borderCenterX;
    private /* synthetic */ int spawnY;
    private /* synthetic */ EnumDifficulty difficulty;
    private /* synthetic */ int rainTime;
    private /* synthetic */ boolean hardcore;
    private /* synthetic */ boolean mapFeaturesEnabled;
    private /* synthetic */ long borderSizeLerpTime;
    private /* synthetic */ String generatorOptions;
    private /* synthetic */ double borderCenterZ;
    private /* synthetic */ int saveVersion;
    private /* synthetic */ double borderDamagePerBlock;
    private /* synthetic */ boolean raining;
    private /* synthetic */ long totalTime;
    private /* synthetic */ long sizeOnDisk;
    private static final /* synthetic */ String[] lIlIlllllIllll;
    private /* synthetic */ NBTTagCompound playerTag;
    private /* synthetic */ double borderSizeLerpTarget;
    private /* synthetic */ int borderWarningDistance;
    private /* synthetic */ GameRules theGameRules;
    private /* synthetic */ String levelName;
    private /* synthetic */ long worldTime;
    private /* synthetic */ double borderSize;
    private /* synthetic */ int thunderTime;
    private /* synthetic */ boolean allowCommands;
    private /* synthetic */ boolean difficultyLocked;
    private /* synthetic */ long lastTimePlayed;
    private /* synthetic */ boolean thundering;
    private /* synthetic */ int borderWarningTime;
    private /* synthetic */ int cleanWeatherTime;
    public static final /* synthetic */ EnumDifficulty DEFAULT_DIFFICULTY;
    private /* synthetic */ int dimension;
    private /* synthetic */ int spawnX;
    private /* synthetic */ WorldSettings.GameType theGameType;
    private /* synthetic */ WorldType terrainType;
    private static final /* synthetic */ int[] lIllIIIlIIlIlI;
    private /* synthetic */ long randomSeed;
    private /* synthetic */ int spawnZ;
    private /* synthetic */ boolean initialized;
    
    public void setThundering(final boolean lllllllllllllIIIIIllIlIlIlllIIIl) {
        this.thundering = lllllllllllllIIIIIllIlIlIlllIIIl;
    }
    
    public boolean isHardcoreModeEnabled() {
        return this.hardcore;
    }
    
    public String getGeneratorOptions() {
        return this.generatorOptions;
    }
    
    public double getBorderCenterZ() {
        return this.borderCenterZ;
    }
    
    public void setBorderWarningTime(final int lllllllllllllIIIIIllIlIIllIIlIII) {
        this.borderWarningTime = lllllllllllllIIIIIllIlIIllIIlIII;
    }
    
    public double getBorderDamagePerBlock() {
        return this.borderDamagePerBlock;
    }
    
    public boolean isMapFeaturesEnabled() {
        return this.mapFeaturesEnabled;
    }
    
    public int getCleanWeatherTime() {
        return this.cleanWeatherTime;
    }
    
    public void setWorldTotalTime(final long lllllllllllllIIIIIllIlIllIlIIlII) {
        this.totalTime = lllllllllllllIIIIIllIlIllIlIIlII;
    }
    
    protected WorldInfo() {
        this.terrainType = WorldType.DEFAULT;
        this.generatorOptions = WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[0]];
        this.borderCenterX = 0.0;
        this.borderCenterZ = 0.0;
        this.borderSize = 6.0E7;
        this.borderSizeLerpTime = 0L;
        this.borderSizeLerpTarget = 0.0;
        this.borderSafeZone = 5.0;
        this.borderDamagePerBlock = 0.2;
        this.borderWarningDistance = WorldInfo.lIllIIIlIIlIlI[1];
        this.borderWarningTime = WorldInfo.lIllIIIlIIlIlI[2];
        this.theGameRules = new GameRules();
    }
    
    private static boolean llllIllllIlIllI(final Object lllllllllllllIIIIIllIIllllIIIIlI) {
        return lllllllllllllIIIIIllIIllllIIIIlI != null;
    }
    
    private static boolean llllIllllIlIIll(final int lllllllllllllIIIIIllIIlllIlllllI) {
        return lllllllllllllIIIIIllIIlllIlllllI != 0;
    }
    
    public int getBorderWarningTime() {
        return this.borderWarningTime;
    }
    
    public double getBorderCenterX() {
        return this.borderCenterX;
    }
    
    public void addToCrashReport(final CrashReportCategory lllllllllllllIIIIIllIlIIlIlIIIII) {
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[98]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return String.valueOf(WorldInfo.this.getSeed());
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[99]], new Callable<String>() {
            private static final /* synthetic */ int[] lIlllllIlIIlll;
            private static final /* synthetic */ String[] lIlllllIlIIllI;
            
            static {
                lIIIIlIlIllIIlll();
                lIIIIlIlIllIIllI();
            }
            
            private static void lIIIIlIlIllIIllI() {
                (lIlllllIlIIllI = new String[WorldInfo$2.lIlllllIlIIlll[2]])[WorldInfo$2.lIlllllIlIIlll[0]] = lIIIIlIlIllIIlIl("IF41m2gwAW8HHXejiG5JCpwUFJaUoJqdw/4PHFWfrfbL29IkRDwUVRIF//eCuuV8", "fyvMy");
            }
            
            private static String lIIIIlIlIllIIlIl(final String llllllllllllIllllIIllIIllllllIII, final String llllllllllllIllllIIllIIllllllIIl) {
                try {
                    final SecretKeySpec llllllllllllIllllIIllIIlllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIIllllllIIl.getBytes(StandardCharsets.UTF_8)), WorldInfo$2.lIlllllIlIIlll[5]), "DES");
                    final Cipher llllllllllllIllllIIllIIlllllllII = Cipher.getInstance("DES");
                    llllllllllllIllllIIllIIlllllllII.init(WorldInfo$2.lIlllllIlIIlll[3], llllllllllllIllllIIllIIlllllllIl);
                    return new String(llllllllllllIllllIIllIIlllllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIIllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIIllIIllllllIll) {
                    llllllllllllIllllIIllIIllllllIll.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIIIlIlIllIIlll() {
                (lIlllllIlIIlll = new int[6])[0] = ((0x56 ^ 0x5F ^ (0x66 ^ 0x68)) & (0xC4 ^ 0xB5 ^ (0x5F ^ 0x29) ^ -" ".length()));
                WorldInfo$2.lIlllllIlIIlll[1] = (0x2D ^ 0x29);
                WorldInfo$2.lIlllllIlIIlll[2] = " ".length();
                WorldInfo$2.lIlllllIlIIlll[3] = "  ".length();
                WorldInfo$2.lIlllllIlIIlll[4] = "   ".length();
                WorldInfo$2.lIlllllIlIIlll[5] = (0x11 ^ 0x19);
            }
            
            @Override
            public String call() throws Exception {
                final String format = WorldInfo$2.lIlllllIlIIllI[WorldInfo$2.lIlllllIlIIlll[0]];
                final Object[] args = new Object[WorldInfo$2.lIlllllIlIIlll[1]];
                args[WorldInfo$2.lIlllllIlIIlll[0]] = WorldInfo.this.terrainType.getWorldTypeID();
                args[WorldInfo$2.lIlllllIlIIlll[2]] = WorldInfo.this.terrainType.getWorldTypeName();
                args[WorldInfo$2.lIlllllIlIIlll[3]] = WorldInfo.this.terrainType.getGeneratorVersion();
                args[WorldInfo$2.lIlllllIlIIlll[4]] = WorldInfo.this.mapFeaturesEnabled;
                return String.format(format, args);
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[8]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return WorldInfo.this.generatorOptions;
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[100]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return CrashReportCategory.getCoordinateInfo(WorldInfo.this.spawnX, WorldInfo.this.spawnY, WorldInfo.this.spawnZ);
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[101]], new Callable<String>() {
            private static final /* synthetic */ int[] lllIIlIlIIIIII;
            private static final /* synthetic */ String[] lllIIlIIllllIl;
            
            @Override
            public String call() throws Exception {
                final String format = WorldInfo$5.lllIIlIIllllIl[WorldInfo$5.lllIIlIlIIIIII[0]];
                final Object[] args = new Object[WorldInfo$5.lllIIlIlIIIIII[1]];
                args[WorldInfo$5.lllIIlIlIIIIII[0]] = WorldInfo.this.totalTime;
                args[WorldInfo$5.lllIIlIlIIIIII[2]] = WorldInfo.this.worldTime;
                return String.format(format, args);
            }
            
            private static boolean lIIllllllIIIlllI(final int llllllllllllIlIllllIlIIllIIIIllI, final int llllllllllllIlIllllIlIIllIIIIlIl) {
                return llllllllllllIlIllllIlIIllIIIIllI < llllllllllllIlIllllIlIIllIIIIlIl;
            }
            
            private static void lIIllllllIIIlIII() {
                (lllIIlIIllllIl = new String[WorldInfo$5.lllIIlIlIIIIII[2]])[WorldInfo$5.lllIIlIlIIIIII[0]] = lIIllllllIIIIlll("VCdsADYcJmwTPhwmYEdyFWMoBi5RNyUKMg==", "qCLgW");
            }
            
            private static void lIIllllllIIIllIl() {
                (lllIIlIlIIIIII = new int[3])[0] = ((41 + 20 - 48 + 241 ^ 96 + 26 - 22 + 58) & (181 + 154 - 144 + 12 ^ 120 + 134 - 154 + 71 ^ -" ".length()));
                WorldInfo$5.lllIIlIlIIIIII[1] = "  ".length();
                WorldInfo$5.lllIIlIlIIIIII[2] = " ".length();
            }
            
            static {
                lIIllllllIIIllIl();
                lIIllllllIIIlIII();
            }
            
            private static String lIIllllllIIIIlll(String llllllllllllIlIllllIlIIllIIlIIIl, final String llllllllllllIlIllllIlIIllIIlIlIl) {
                llllllllllllIlIllllIlIIllIIlIIIl = new String(Base64.getDecoder().decode(llllllllllllIlIllllIlIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIllllIlIIllIIlIlII = new StringBuilder();
                final char[] llllllllllllIlIllllIlIIllIIlIIll = llllllllllllIlIllllIlIIllIIlIlIl.toCharArray();
                int llllllllllllIlIllllIlIIllIIlIIlI = WorldInfo$5.lllIIlIlIIIIII[0];
                final long llllllllllllIlIllllIlIIllIIIllII = (Object)llllllllllllIlIllllIlIIllIIlIIIl.toCharArray();
                final long llllllllllllIlIllllIlIIllIIIlIll = llllllllllllIlIllllIlIIllIIIllII.length;
                boolean llllllllllllIlIllllIlIIllIIIlIlI = WorldInfo$5.lllIIlIlIIIIII[0] != 0;
                while (lIIllllllIIIlllI(llllllllllllIlIllllIlIIllIIIlIlI ? 1 : 0, (int)llllllllllllIlIllllIlIIllIIIlIll)) {
                    final char llllllllllllIlIllllIlIIllIIlIlll = llllllllllllIlIllllIlIIllIIIllII[llllllllllllIlIllllIlIIllIIIlIlI];
                    llllllllllllIlIllllIlIIllIIlIlII.append((char)(llllllllllllIlIllllIlIIllIIlIlll ^ llllllllllllIlIllllIlIIllIIlIIll[llllllllllllIlIllllIlIIllIIlIIlI % llllllllllllIlIllllIlIIllIIlIIll.length]));
                    "".length();
                    ++llllllllllllIlIllllIlIIllIIlIIlI;
                    ++llllllllllllIlIllllIlIIllIIIlIlI;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIllllIlIIllIIlIlII);
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[102]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return String.valueOf(WorldInfo.this.dimension);
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[103]], new Callable<String>() {
            private static final /* synthetic */ int[] llIIIIIlllIIIl;
            private static final /* synthetic */ String[] llIIIIIllIllIl;
            
            static {
                lIIIIlllIllIllIl();
                lIIIIlllIllIlIII();
            }
            
            private static String lIIIIlllIlIlllll(final String llllllllllllIlllIlllIllIllIlIIlI, final String llllllllllllIlllIlllIllIllIlIIIl) {
                try {
                    final SecretKeySpec llllllllllllIlllIlllIllIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllIlllIllIllIlIllI = Cipher.getInstance("Blowfish");
                    llllllllllllIlllIlllIllIllIlIllI.init(WorldInfo$7.llIIIIIlllIIIl[2], llllllllllllIlllIlllIllIllIlIlll);
                    return new String(llllllllllllIlllIlllIllIllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIllIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIlllIllIllIlIlIl) {
                    llllllllllllIlllIlllIllIllIlIlIl.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String call() throws Exception {
                String llllllllllllIlllIlllIllIlllIIIIl = WorldInfo$7.llIIIIIllIllIl[WorldInfo$7.llIIIIIlllIIIl[0]];
                Label_0111: {
                    try {
                        switch (WorldInfo.this.saveVersion) {
                            case 19132: {
                                llllllllllllIlllIlllIllIlllIIIIl = WorldInfo$7.llIIIIIllIllIl[WorldInfo$7.llIIIIIlllIIIl[1]];
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    return null;
                                }
                                break Label_0111;
                            }
                            case 19133: {
                                llllllllllllIlllIlllIllIlllIIIIl = WorldInfo$7.llIIIIIllIllIl[WorldInfo$7.llIIIIIlllIIIl[2]];
                                break;
                            }
                        }
                        "".length();
                        if (((0x5F ^ 0x6D) & ~(0x4B ^ 0x79)) >= "   ".length()) {
                            return null;
                        }
                    }
                    catch (Throwable t) {}
                }
                final String format = WorldInfo$7.llIIIIIllIllIl[WorldInfo$7.llIIIIIlllIIIl[3]];
                final Object[] args = new Object[WorldInfo$7.llIIIIIlllIIIl[2]];
                args[WorldInfo$7.llIIIIIlllIIIl[0]] = WorldInfo.this.saveVersion;
                args[WorldInfo$7.llIIIIIlllIIIl[1]] = llllllllllllIlllIlllIllIlllIIIIl;
                return String.format(format, args);
            }
            
            private static void lIIIIlllIllIlIII() {
                (llIIIIIllIllIl = new String[WorldInfo$7.llIIIIIlllIIIl[4]])[WorldInfo$7.llIIIIIlllIIIl[0]] = lIIIIlllIlIlllll("RMSVjCrhhkAiFHo9ncUELA==", "pEztZ");
                WorldInfo$7.llIIIIIllIllIl[WorldInfo$7.llIIIIIlllIIIl[1]] = lIIIIlllIllIIlll("KQgTEQINBC8=", "dkAte");
                WorldInfo$7.llIIIIIllIllIl[WorldInfo$7.llIIIIIlllIIIl[2]] = lIIIIlllIllIIlll("BiQeAi0=", "GJhkA");
                WorldInfo$7.llIIIIIllIllIl[WorldInfo$7.llIIIIIlllIIIl[3]] = lIIIIlllIlIlllll("seRD0+bIVqyEYhvZmBqy2w==", "ohcNk");
            }
            
            private static String lIIIIlllIllIIlll(String llllllllllllIlllIlllIllIlIllllll, final String llllllllllllIlllIlllIllIlIlllllI) {
                llllllllllllIlllIlllIllIlIllllll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlllIllIlIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllIlllIllIllIIIIlI = new StringBuilder();
                final char[] llllllllllllIlllIlllIllIllIIIIIl = llllllllllllIlllIlllIllIlIlllllI.toCharArray();
                int llllllllllllIlllIlllIllIllIIIIII = WorldInfo$7.llIIIIIlllIIIl[0];
                final float llllllllllllIlllIlllIllIlIlllIlI = (Object)((String)llllllllllllIlllIlllIllIlIllllll).toCharArray();
                final float llllllllllllIlllIlllIllIlIlllIIl = llllllllllllIlllIlllIllIlIlllIlI.length;
                boolean llllllllllllIlllIlllIllIlIlllIII = WorldInfo$7.llIIIIIlllIIIl[0] != 0;
                while (lIIIIlllIllIlllI(llllllllllllIlllIlllIllIlIlllIII ? 1 : 0, (int)llllllllllllIlllIlllIllIlIlllIIl)) {
                    final char llllllllllllIlllIlllIllIllIIIlIl = llllllllllllIlllIlllIllIlIlllIlI[llllllllllllIlllIlllIllIlIlllIII];
                    llllllllllllIlllIlllIllIllIIIIlI.append((char)(llllllllllllIlllIlllIllIllIIIlIl ^ llllllllllllIlllIlllIllIllIIIIIl[llllllllllllIlllIlllIllIllIIIIII % llllllllllllIlllIlllIllIllIIIIIl.length]));
                    "".length();
                    ++llllllllllllIlllIlllIllIllIIIIII;
                    ++llllllllllllIlllIlllIllIlIlllIII;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllIlllIllIllIIIIlI);
            }
            
            private static void lIIIIlllIllIllIl() {
                (llIIIIIlllIIIl = new int[5])[0] = ((0x88 ^ 0xB7) & ~(0x5D ^ 0x62));
                WorldInfo$7.llIIIIIlllIIIl[1] = " ".length();
                WorldInfo$7.llIIIIIlllIIIl[2] = "  ".length();
                WorldInfo$7.llIIIIIlllIIIl[3] = "   ".length();
                WorldInfo$7.llIIIIIlllIIIl[4] = (0x8C ^ 0xB7 ^ (0x3D ^ 0x2));
            }
            
            private static boolean lIIIIlllIllIlllI(final int llllllllllllIlllIlllIllIlIllIlII, final int llllllllllllIlllIlllIllIlIllIIll) {
                return llllllllllllIlllIlllIllIlIllIlII < llllllllllllIlllIlllIllIlIllIIll;
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[104]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIllIIIlIlIII;
            private static final /* synthetic */ int[] lIIllIIIlIlIlI;
            
            static {
                llIlIllIIllIIll();
                llIlIllIIllIIII();
            }
            
            @Override
            public String call() throws Exception {
                final String format = WorldInfo$8.lIIllIIIlIlIII[WorldInfo$8.lIIllIIIlIlIlI[0]];
                final Object[] args = new Object[WorldInfo$8.lIIllIIIlIlIlI[1]];
                args[WorldInfo$8.lIIllIIIlIlIlI[0]] = WorldInfo.this.rainTime;
                args[WorldInfo$8.lIIllIIIlIlIlI[2]] = WorldInfo.this.raining;
                args[WorldInfo$8.lIIllIIIlIlIlI[3]] = WorldInfo.this.thunderTime;
                args[WorldInfo$8.lIIllIIIlIlIlI[4]] = WorldInfo.this.thundering;
                return String.format(format, args);
            }
            
            private static void llIlIllIIllIIII() {
                (lIIllIIIlIlIII = new String[WorldInfo$8.lIIllIIIlIlIlI[2]])[WorldInfo$8.lIIllIIIlIlIlI[0]] = llIlIllIIlIlllI("3OnkhAYWqbRWI30joAZrKK6x0HHPp8qs8FRH4d9DFg9CRHE0Q5pBOUjBrVCweoo8G3M9hIYSqwA=", "stoEE");
            }
            
            private static String llIlIllIIlIlllI(final String lllllllllllllIIlIllIlIIIIIIIlllI, final String lllllllllllllIIlIllIlIIIIIIIllIl) {
                try {
                    final SecretKeySpec lllllllllllllIIlIllIlIIIIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIllIlIIIIIIlIIlI = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIllIlIIIIIIlIIlI.init(WorldInfo$8.lIIllIIIlIlIlI[3], lllllllllllllIIlIllIlIIIIIIlIIll);
                    return new String(lllllllllllllIIlIllIlIIIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIllIlIIIIIIlIIIl) {
                    lllllllllllllIIlIllIlIIIIIIlIIIl.printStackTrace();
                    return null;
                }
            }
            
            private static void llIlIllIIllIIll() {
                (lIIllIIIlIlIlI = new int[5])[0] = ((123 + 34 - 33 + 44 ^ 33 + 148 - 86 + 81) & (0x83 ^ 0xA9 ^ (0x29 ^ 0x1B) ^ -" ".length()));
                WorldInfo$8.lIIllIIIlIlIlI[1] = (0xF ^ 0x41 ^ (0x4C ^ 0x6));
                WorldInfo$8.lIIllIIIlIlIlI[2] = " ".length();
                WorldInfo$8.lIIllIIIlIlIlI[3] = "  ".length();
                WorldInfo$8.lIIllIIIlIlIlI[4] = "   ".length();
            }
        });
        lllllllllllllIIIIIllIlIIlIlIIIII.addCrashSectionCallable(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[105]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIIIIIIlIlllI;
            private static final /* synthetic */ int[] lIIIIIIIlIllll;
            
            @Override
            public String call() throws Exception {
                final String format = WorldInfo$9.lIIIIIIIlIlllI[WorldInfo$9.lIIIIIIIlIllll[0]];
                final Object[] args = new Object[WorldInfo$9.lIIIIIIIlIllll[1]];
                args[WorldInfo$9.lIIIIIIIlIllll[0]] = WorldInfo.this.theGameType.getName();
                args[WorldInfo$9.lIIIIIIIlIllll[2]] = WorldInfo.this.theGameType.getID();
                args[WorldInfo$9.lIIIIIIIlIllll[3]] = WorldInfo.this.hardcore;
                args[WorldInfo$9.lIIIIIIIlIllll[4]] = WorldInfo.this.allowCommands;
                return String.format(format, args);
            }
            
            static {
                lIllIIllIIlllII();
                lIllIIllIIllIll();
            }
            
            private static boolean lIllIIllIIlllIl(final int lllllllllllllIlIlIIIlllllIIIIlII, final int lllllllllllllIlIlIIIlllllIIIIIll) {
                return lllllllllllllIlIlIIIlllllIIIIlII < lllllllllllllIlIlIIIlllllIIIIIll;
            }
            
            private static String lIllIIllIIllIlI(String lllllllllllllIlIlIIIlllllIIIllll, final String lllllllllllllIlIlIIIlllllIIIlllI) {
                lllllllllllllIlIlIIIlllllIIIllll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIIlllllIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIlIlIIIlllllIIlIIlI = new StringBuilder();
                final char[] lllllllllllllIlIlIIIlllllIIlIIIl = lllllllllllllIlIlIIIlllllIIIlllI.toCharArray();
                int lllllllllllllIlIlIIIlllllIIlIIII = WorldInfo$9.lIIIIIIIlIllll[0];
                final double lllllllllllllIlIlIIIlllllIIIlIlI = (Object)lllllllllllllIlIlIIIlllllIIIllll.toCharArray();
                final double lllllllllllllIlIlIIIlllllIIIlIIl = lllllllllllllIlIlIIIlllllIIIlIlI.length;
                float lllllllllllllIlIlIIIlllllIIIlIII = WorldInfo$9.lIIIIIIIlIllll[0];
                while (lIllIIllIIlllIl((int)lllllllllllllIlIlIIIlllllIIIlIII, (int)lllllllllllllIlIlIIIlllllIIIlIIl)) {
                    final char lllllllllllllIlIlIIIlllllIIlIlIl = lllllllllllllIlIlIIIlllllIIIlIlI[lllllllllllllIlIlIIIlllllIIIlIII];
                    lllllllllllllIlIlIIIlllllIIlIIlI.append((char)(lllllllllllllIlIlIIIlllllIIlIlIl ^ lllllllllllllIlIlIIIlllllIIlIIIl[lllllllllllllIlIlIIIlllllIIlIIII % lllllllllllllIlIlIIIlllllIIlIIIl.length]));
                    "".length();
                    ++lllllllllllllIlIlIIIlllllIIlIIII;
                    ++lllllllllllllIlIlIIIlllllIIIlIII;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIlIlIIIlllllIIlIIlI);
            }
            
            private static void lIllIIllIIllIll() {
                (lIIIIIIIlIlllI = new String[WorldInfo$9.lIIIIIIIlIllll[2]])[WorldInfo$9.lIIIIIIIlIllll[0]] = lIllIIllIIllIlI("AzgmMEQpNi8wXmR8OHVMDR1rcABtd2sdBTY9KDoWIWNrcAZqeQg9ASUtOG9EYTs=", "DYKUd");
            }
            
            private static void lIllIIllIIlllII() {
                (lIIIIIIIlIllll = new int[5])[0] = ((0xE6 ^ 0xAD) & ~(0x46 ^ 0xD) & ~((0x27 ^ 0x6A) & ~(0x6 ^ 0x4B)));
                WorldInfo$9.lIIIIIIIlIllll[1] = (0xC6 ^ 0xC2);
                WorldInfo$9.lIIIIIIIlIllll[2] = " ".length();
                WorldInfo$9.lIIIIIIIlIllll[3] = "  ".length();
                WorldInfo$9.lIIIIIIIlIllll[4] = "   ".length();
            }
        });
    }
    
    public void setSpawnX(final int lllllllllllllIIIIIllIlIllIlllIII) {
        this.spawnX = lllllllllllllIIIIIllIlIllIlllIII;
    }
    
    public void setMapFeaturesEnabled(final boolean lllllllllllllIIIIIllIlIlIlIIlIlI) {
        this.mapFeaturesEnabled = lllllllllllllIIIIIllIlIlIlIIlIlI;
    }
    
    private static boolean llllIllllIlIlll(final int lllllllllllllIIIIIllIIllllIIlIIl, final int lllllllllllllIIIIIllIIllllIIlIII) {
        return lllllllllllllIIIIIllIIllllIIlIIl < lllllllllllllIIIIIllIIllllIIlIII;
    }
    
    public WorldInfo(final WorldSettings lllllllllllllIIIIIllIlIllllllIIl, final String lllllllllllllIIIIIllIlIllllllIll) {
        this.terrainType = WorldType.DEFAULT;
        this.generatorOptions = WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[60]];
        this.borderCenterX = 0.0;
        this.borderCenterZ = 0.0;
        this.borderSize = 6.0E7;
        this.borderSizeLerpTime = 0L;
        this.borderSizeLerpTarget = 0.0;
        this.borderSafeZone = 5.0;
        this.borderDamagePerBlock = 0.2;
        this.borderWarningDistance = WorldInfo.lIllIIIlIIlIlI[1];
        this.borderWarningTime = WorldInfo.lIllIIIlIIlIlI[2];
        this.theGameRules = new GameRules();
        this.populateFromWorldSettings(lllllllllllllIIIIIllIlIllllllIIl);
        this.levelName = lllllllllllllIIIIIllIlIllllllIll;
        this.difficulty = WorldInfo.DEFAULT_DIFFICULTY;
        this.initialized = (WorldInfo.lIllIIIlIIlIlI[0] != 0);
    }
    
    public void setBorderWarningDistance(final int lllllllllllllIIIIIllIlIIllIIllII) {
        this.borderWarningDistance = lllllllllllllIIIIIllIlIIllIIllII;
    }
    
    private void updateTagCompound(final NBTTagCompound lllllllllllllIIIIIllIlIlllIllIII, final NBTTagCompound lllllllllllllIIIIIllIlIlllIlIlll) {
        lllllllllllllIIIIIllIlIlllIllIII.setLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[62]], this.randomSeed);
        lllllllllllllIIIIIllIlIlllIllIII.setString(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[63]], this.terrainType.getWorldTypeName());
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[64]], this.terrainType.getGeneratorVersion());
        lllllllllllllIIIIIllIlIlllIllIII.setString(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[65]], this.generatorOptions);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[66]], this.theGameType.getID());
        lllllllllllllIIIIIllIlIlllIllIII.setBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[67]], this.mapFeaturesEnabled);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[68]], this.spawnX);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[69]], this.spawnY);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[70]], this.spawnZ);
        lllllllllllllIIIIIllIlIlllIllIII.setLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[71]], this.totalTime);
        lllllllllllllIIIIIllIlIlllIllIII.setLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[72]], this.worldTime);
        lllllllllllllIIIIIllIlIlllIllIII.setLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[73]], this.sizeOnDisk);
        lllllllllllllIIIIIllIlIlllIllIII.setLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[74]], MinecraftServer.getCurrentTimeMillis());
        lllllllllllllIIIIIllIlIlllIllIII.setString(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[75]], this.levelName);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[76]], this.saveVersion);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[77]], this.cleanWeatherTime);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[78]], this.rainTime);
        lllllllllllllIIIIIllIlIlllIllIII.setBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[79]], this.raining);
        lllllllllllllIIIIIllIlIlllIllIII.setInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[80]], this.thunderTime);
        lllllllllllllIIIIIllIlIlllIllIII.setBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[81]], this.thundering);
        lllllllllllllIIIIIllIlIlllIllIII.setBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[82]], this.hardcore);
        lllllllllllllIIIIIllIlIlllIllIII.setBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[83]], this.allowCommands);
        lllllllllllllIIIIIllIlIlllIllIII.setBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[84]], this.initialized);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[85]], this.borderCenterX);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[86]], this.borderCenterZ);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[87]], this.borderSize);
        lllllllllllllIIIIIllIlIlllIllIII.setLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[88]], this.borderSizeLerpTime);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[89]], this.borderSafeZone);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[90]], this.borderDamagePerBlock);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[91]], this.borderSizeLerpTarget);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[92]], this.borderWarningDistance);
        lllllllllllllIIIIIllIlIlllIllIII.setDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[93]], this.borderWarningTime);
        if (llllIllllIlIllI(this.difficulty)) {
            lllllllllllllIIIIIllIlIlllIllIII.setByte(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[94]], (byte)this.difficulty.getDifficultyId());
        }
        lllllllllllllIIIIIllIlIlllIllIII.setBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[95]], this.difficultyLocked);
        lllllllllllllIIIIIllIlIlllIllIII.setTag(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[96]], this.theGameRules.writeToNBT());
        if (llllIllllIlIllI(lllllllllllllIIIIIllIlIlllIlIlll)) {
            lllllllllllllIIIIIllIlIlllIllIII.setTag(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[97]], lllllllllllllIIIIIllIlIlllIlIlll);
        }
    }
    
    public long getSizeOnDisk() {
        return this.sizeOnDisk;
    }
    
    public long getWorldTotalTime() {
        return this.totalTime;
    }
    
    public WorldInfo(final WorldInfo lllllllllllllIIIIIllIlIllllIlllI) {
        this.terrainType = WorldType.DEFAULT;
        this.generatorOptions = WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[61]];
        this.borderCenterX = 0.0;
        this.borderCenterZ = 0.0;
        this.borderSize = 6.0E7;
        this.borderSizeLerpTime = 0L;
        this.borderSizeLerpTarget = 0.0;
        this.borderSafeZone = 5.0;
        this.borderDamagePerBlock = 0.2;
        this.borderWarningDistance = WorldInfo.lIllIIIlIIlIlI[1];
        this.borderWarningTime = WorldInfo.lIllIIIlIIlIlI[2];
        this.theGameRules = new GameRules();
        this.randomSeed = lllllllllllllIIIIIllIlIllllIlllI.randomSeed;
        this.terrainType = lllllllllllllIIIIIllIlIllllIlllI.terrainType;
        this.generatorOptions = lllllllllllllIIIIIllIlIllllIlllI.generatorOptions;
        this.theGameType = lllllllllllllIIIIIllIlIllllIlllI.theGameType;
        this.mapFeaturesEnabled = lllllllllllllIIIIIllIlIllllIlllI.mapFeaturesEnabled;
        this.spawnX = lllllllllllllIIIIIllIlIllllIlllI.spawnX;
        this.spawnY = lllllllllllllIIIIIllIlIllllIlllI.spawnY;
        this.spawnZ = lllllllllllllIIIIIllIlIllllIlllI.spawnZ;
        this.totalTime = lllllllllllllIIIIIllIlIllllIlllI.totalTime;
        this.worldTime = lllllllllllllIIIIIllIlIllllIlllI.worldTime;
        this.lastTimePlayed = lllllllllllllIIIIIllIlIllllIlllI.lastTimePlayed;
        this.sizeOnDisk = lllllllllllllIIIIIllIlIllllIlllI.sizeOnDisk;
        this.playerTag = lllllllllllllIIIIIllIlIllllIlllI.playerTag;
        this.dimension = lllllllllllllIIIIIllIlIllllIlllI.dimension;
        this.levelName = lllllllllllllIIIIIllIlIllllIlllI.levelName;
        this.saveVersion = lllllllllllllIIIIIllIlIllllIlllI.saveVersion;
        this.rainTime = lllllllllllllIIIIIllIlIllllIlllI.rainTime;
        this.raining = lllllllllllllIIIIIllIlIllllIlllI.raining;
        this.thunderTime = lllllllllllllIIIIIllIlIllllIlllI.thunderTime;
        this.thundering = lllllllllllllIIIIIllIlIllllIlllI.thundering;
        this.hardcore = lllllllllllllIIIIIllIlIllllIlllI.hardcore;
        this.allowCommands = lllllllllllllIIIIIllIlIllllIlllI.allowCommands;
        this.initialized = lllllllllllllIIIIIllIlIllllIlllI.initialized;
        this.theGameRules = lllllllllllllIIIIIllIlIllllIlllI.theGameRules;
        this.difficulty = lllllllllllllIIIIIllIlIllllIlllI.difficulty;
        this.difficultyLocked = lllllllllllllIIIIIllIlIllllIlllI.difficultyLocked;
        this.borderCenterX = lllllllllllllIIIIIllIlIllllIlllI.borderCenterX;
        this.borderCenterZ = lllllllllllllIIIIIllIlIllllIlllI.borderCenterZ;
        this.borderSize = lllllllllllllIIIIIllIlIllllIlllI.borderSize;
        this.borderSizeLerpTime = lllllllllllllIIIIIllIlIllllIlllI.borderSizeLerpTime;
        this.borderSizeLerpTarget = lllllllllllllIIIIIllIlIllllIlllI.borderSizeLerpTarget;
        this.borderSafeZone = lllllllllllllIIIIIllIlIllllIlllI.borderSafeZone;
        this.borderDamagePerBlock = lllllllllllllIIIIIllIlIllllIlllI.borderDamagePerBlock;
        this.borderWarningTime = lllllllllllllIIIIIllIlIllllIlllI.borderWarningTime;
        this.borderWarningDistance = lllllllllllllIIIIIllIlIllllIlllI.borderWarningDistance;
    }
    
    public int getBorderWarningDistance() {
        return this.borderWarningDistance;
    }
    
    public double getBorderSafeZone() {
        return this.borderSafeZone;
    }
    
    public void setCleanWeatherTime(final int lllllllllllllIIIIIllIlIlIllllIlI) {
        this.cleanWeatherTime = lllllllllllllIIIIIllIlIlIllllIlI;
    }
    
    public int getThunderTime() {
        return this.thunderTime;
    }
    
    public int getRainTime() {
        return this.rainTime;
    }
    
    public double getBorderLerpTarget() {
        return this.borderSizeLerpTarget;
    }
    
    public NBTTagCompound getPlayerNBTTagCompound() {
        return this.playerTag;
    }
    
    public void setBorderLerpTime(final long lllllllllllllIIIIIllIlIlIIIIIIlI) {
        this.borderSizeLerpTime = lllllllllllllIIIIIllIlIlIIIIIIlI;
    }
    
    private static boolean llllIllllIlIlII(final Object lllllllllllllIIIIIllIIllllIIIIII) {
        return lllllllllllllIIIIIllIIllllIIIIII == null;
    }
    
    public long getBorderLerpTime() {
        return this.borderSizeLerpTime;
    }
    
    public void setAllowCommands(final boolean lllllllllllllIIIIIllIlIlIIlIIllI) {
        this.allowCommands = lllllllllllllIIIIIllIlIlIIlIIllI;
    }
    
    public int getSpawnX() {
        return this.spawnX;
    }
    
    public void setDifficultyLocked(final boolean lllllllllllllIIIIIllIlIIlIllIIII) {
        this.difficultyLocked = lllllllllllllIIIIIllIlIIlIllIIII;
    }
    
    public void setRainTime(final int lllllllllllllIIIIIllIlIlIlIllIII) {
        this.rainTime = lllllllllllllIIIIIllIlIlIlIllIII;
    }
    
    public WorldInfo(final NBTTagCompound lllllllllllllIIIIIllIllIIIIIIIll) {
        this.terrainType = WorldType.DEFAULT;
        this.generatorOptions = WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[3]];
        this.borderCenterX = 0.0;
        this.borderCenterZ = 0.0;
        this.borderSize = 6.0E7;
        this.borderSizeLerpTime = 0L;
        this.borderSizeLerpTarget = 0.0;
        this.borderSafeZone = 5.0;
        this.borderDamagePerBlock = 0.2;
        this.borderWarningDistance = WorldInfo.lIllIIIlIIlIlI[1];
        this.borderWarningTime = WorldInfo.lIllIIIlIIlIlI[2];
        this.theGameRules = new GameRules();
        this.randomSeed = lllllllllllllIIIIIllIllIIIIIIIll.getLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[4]]);
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[5]], WorldInfo.lIllIIIlIIlIlI[6]) ? 1 : 0)) {
            final String lllllllllllllIIIIIllIllIIIIIIllI = lllllllllllllIIIIIllIllIIIIIIIll.getString(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[7]]);
            this.terrainType = WorldType.parseWorldType(lllllllllllllIIIIIllIllIIIIIIllI);
            if (llllIllllIlIlII(this.terrainType)) {
                this.terrainType = WorldType.DEFAULT;
                "".length();
                if ("  ".length() == 0) {
                    throw null;
                }
            }
            else if (llllIllllIlIIll(this.terrainType.isVersioned() ? 1 : 0)) {
                int lllllllllllllIIIIIllIllIIIIIIlIl = WorldInfo.lIllIIIlIIlIlI[0];
                if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[1]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
                    lllllllllllllIIIIIllIllIIIIIIlIl = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[9]]);
                }
                this.terrainType = this.terrainType.getWorldTypeForGeneratorVersion(lllllllllllllIIIIIllIllIIIIIIlIl);
            }
            if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[10]], WorldInfo.lIllIIIlIIlIlI[6]) ? 1 : 0)) {
                this.generatorOptions = lllllllllllllIIIIIllIllIIIIIIIll.getString(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[6]]);
            }
        }
        this.theGameType = WorldSettings.GameType.getByID(lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[11]]));
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[12]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.mapFeaturesEnabled = lllllllllllllIIIIIllIllIIIIIIIll.getBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[13]]);
            "".length();
            if (((0x15 ^ 0x48) & ~(0x7E ^ 0x23)) != 0x0) {
                throw null;
            }
        }
        else {
            this.mapFeaturesEnabled = (WorldInfo.lIllIIIlIIlIlI[3] != 0);
        }
        this.spawnX = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[14]]);
        this.spawnY = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[15]]);
        this.spawnZ = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[16]]);
        this.totalTime = lllllllllllllIIIIIllIllIIIIIIIll.getLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[2]]);
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[17]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.worldTime = lllllllllllllIIIIIllIllIIIIIIIll.getLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[18]]);
            "".length();
            if (" ".length() < 0) {
                throw null;
            }
        }
        else {
            this.worldTime = this.totalTime;
        }
        this.lastTimePlayed = lllllllllllllIIIIIllIllIIIIIIIll.getLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[19]]);
        this.sizeOnDisk = lllllllllllllIIIIIllIllIIIIIIIll.getLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[20]]);
        this.levelName = lllllllllllllIIIIIllIllIIIIIIIll.getString(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[21]]);
        this.saveVersion = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[22]]);
        this.cleanWeatherTime = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[23]]);
        this.rainTime = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[24]]);
        this.raining = lllllllllllllIIIIIllIllIIIIIIIll.getBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[25]]);
        this.thunderTime = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[26]]);
        this.thundering = lllllllllllllIIIIIllIllIIIIIIIll.getBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[27]]);
        this.hardcore = lllllllllllllIIIIIllIllIIIIIIIll.getBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[28]]);
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[29]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.initialized = lllllllllllllIIIIIllIllIIIIIIIll.getBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[30]]);
            "".length();
            if (((0x3B ^ 0x1E) & ~(0xA ^ 0x2F)) < 0) {
                throw null;
            }
        }
        else {
            this.initialized = (WorldInfo.lIllIIIlIIlIlI[3] != 0);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[31]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.allowCommands = lllllllllllllIIIIIllIllIIIIIIIll.getBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[32]]);
            "".length();
            if ((159 + 157 - 177 + 38 ^ 83 + 117 - 81 + 62) <= 0) {
                throw null;
            }
        }
        else {
            int allowCommands;
            if (llllIllllIlIlIl(this.theGameType, WorldSettings.GameType.CREATIVE)) {
                allowCommands = WorldInfo.lIllIIIlIIlIlI[3];
                "".length();
                if (((0xA1 ^ 0x95) & ~(0xA0 ^ 0x94)) != 0x0) {
                    throw null;
                }
            }
            else {
                allowCommands = WorldInfo.lIllIIIlIIlIlI[0];
            }
            this.allowCommands = (allowCommands != 0);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[33]], WorldInfo.lIllIIIlIIlIlI[12]) ? 1 : 0)) {
            this.playerTag = lllllllllllllIIIIIllIllIIIIIIIll.getCompoundTag(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[34]]);
            this.dimension = this.playerTag.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[35]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[36]], WorldInfo.lIllIIIlIIlIlI[12]) ? 1 : 0)) {
            this.theGameRules.readFromNBT(lllllllllllllIIIIIllIllIIIIIIIll.getCompoundTag(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[37]]));
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[38]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.difficulty = EnumDifficulty.getDifficultyEnum(lllllllllllllIIIIIllIllIIIIIIIll.getByte(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[39]]));
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[40]], WorldInfo.lIllIIIlIIlIlI[3]) ? 1 : 0)) {
            this.difficultyLocked = lllllllllllllIIIIIllIllIIIIIIIll.getBoolean(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[41]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[42]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderCenterX = lllllllllllllIIIIIllIllIIIIIIIll.getDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[43]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[44]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderCenterZ = lllllllllllllIIIIIllIllIIIIIIIll.getDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[45]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[46]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderSize = lllllllllllllIIIIIllIllIIIIIIIll.getDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[47]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[48]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderSizeLerpTime = lllllllllllllIIIIIllIllIIIIIIIll.getLong(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[49]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[50]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderSizeLerpTarget = lllllllllllllIIIIIllIllIIIIIIIll.getDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[51]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[52]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderSafeZone = lllllllllllllIIIIIllIllIIIIIIIll.getDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[53]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[54]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderDamagePerBlock = lllllllllllllIIIIIllIllIIIIIIIll.getDouble(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[55]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[56]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderWarningDistance = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[57]]);
        }
        if (llllIllllIlIIll(lllllllllllllIIIIIllIllIIIIIIIll.hasKey(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[58]], WorldInfo.lIllIIIlIIlIlI[8]) ? 1 : 0)) {
            this.borderWarningTime = lllllllllllllIIIIIllIllIIIIIIIll.getInteger(WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[59]]);
        }
    }
    
    public WorldType getTerrainType() {
        return this.terrainType;
    }
    
    public WorldSettings.GameType getGameType() {
        return this.theGameType;
    }
    
    private static void llllIllllIlIIlI() {
        (lIllIIIlIIlIlI = new int[107])[0] = ((29 + 51 + 128 + 40 ^ 34 + 8 + 133 + 17) & (" ".length() ^ (0x8E ^ 0xB7) ^ -" ".length()));
        WorldInfo.lIllIIIlIIlIlI[1] = (0x8D ^ 0xC1 ^ (0xD4 ^ 0x9D));
        WorldInfo.lIllIIIlIIlIlI[2] = (134 + 23 - 94 + 90 ^ 131 + 122 - 174 + 71);
        WorldInfo.lIllIIIlIIlIlI[3] = " ".length();
        WorldInfo.lIllIIIlIIlIlI[4] = "  ".length();
        WorldInfo.lIllIIIlIIlIlI[5] = "   ".length();
        WorldInfo.lIllIIIlIIlIlI[6] = (0x7B ^ 0x73);
        WorldInfo.lIllIIIlIIlIlI[7] = (18 + 95 - 46 + 74 ^ 38 + 33 - 44 + 110);
        WorldInfo.lIllIIIlIIlIlI[8] = (0x38 ^ 0x5B);
        WorldInfo.lIllIIIlIIlIlI[9] = (0x70 ^ 0x64 ^ (0x5A ^ 0x48));
        WorldInfo.lIllIIIlIIlIlI[10] = (0x7D ^ 0x7A);
        WorldInfo.lIllIIIlIIlIlI[11] = (0x3 ^ 0x6 ^ (0x8D ^ 0x81));
        WorldInfo.lIllIIIlIIlIlI[12] = (0x24 ^ 0x2E);
        WorldInfo.lIllIIIlIIlIlI[13] = (0x69 ^ 0x62);
        WorldInfo.lIllIIIlIIlIlI[14] = (123 + 116 - 135 + 68 ^ 47 + 114 - 134 + 133);
        WorldInfo.lIllIIIlIIlIlI[15] = (0x82 ^ 0x8F);
        WorldInfo.lIllIIIlIIlIlI[16] = (0x79 ^ 0x77);
        WorldInfo.lIllIIIlIIlIlI[17] = (0x51 ^ 0x25 ^ (0x6B ^ 0xF));
        WorldInfo.lIllIIIlIIlIlI[18] = (0x42 ^ 0x53);
        WorldInfo.lIllIIIlIIlIlI[19] = (0xBE ^ 0xAC);
        WorldInfo.lIllIIIlIIlIlI[20] = (149 + 77 - 204 + 135 ^ 55 + 97 - 94 + 84);
        WorldInfo.lIllIIIlIIlIlI[21] = (0x48 ^ 0x5C);
        WorldInfo.lIllIIIlIIlIlI[22] = (144 + 62 - 152 + 131 ^ 53 + 53 - 97 + 163);
        WorldInfo.lIllIIIlIIlIlI[23] = (0x94 ^ 0xA2 ^ (0x87 ^ 0xA7));
        WorldInfo.lIllIIIlIIlIlI[24] = (0xA7 ^ 0x83 ^ (0xA8 ^ 0x9B));
        WorldInfo.lIllIIIlIIlIlI[25] = (15 + 13 + 83 + 59 ^ 160 + 115 - 137 + 40);
        WorldInfo.lIllIIIlIIlIlI[26] = (0x70 ^ 0x0 ^ (0x77 ^ 0x1E));
        WorldInfo.lIllIIIlIIlIlI[27] = (0x91 ^ 0x8B);
        WorldInfo.lIllIIIlIIlIlI[28] = (0xAD ^ 0xB6);
        WorldInfo.lIllIIIlIIlIlI[29] = (0x1E ^ 0x2);
        WorldInfo.lIllIIIlIIlIlI[30] = (0x1E ^ 0xD ^ (0x8 ^ 0x6));
        WorldInfo.lIllIIIlIIlIlI[31] = (0xB2 ^ 0xAC);
        WorldInfo.lIllIIIlIIlIlI[32] = (0x48 ^ 0x0 ^ (0xF1 ^ 0xA6));
        WorldInfo.lIllIIIlIIlIlI[33] = (0x51 ^ 0x71);
        WorldInfo.lIllIIIlIIlIlI[34] = (0x7A ^ 0x29 ^ (0x1E ^ 0x6C));
        WorldInfo.lIllIIIlIIlIlI[35] = (0x1D ^ 0x3F);
        WorldInfo.lIllIIIlIIlIlI[36] = (0x79 ^ 0x3D ^ (0x55 ^ 0x32));
        WorldInfo.lIllIIIlIIlIlI[37] = (0xB8 ^ 0x9C);
        WorldInfo.lIllIIIlIIlIlI[38] = (0x37 ^ 0xF ^ (0x2A ^ 0x37));
        WorldInfo.lIllIIIlIIlIlI[39] = (0xB7 ^ 0x91);
        WorldInfo.lIllIIIlIIlIlI[40] = (143 + 81 - 151 + 78 ^ 56 + 67 - 18 + 71);
        WorldInfo.lIllIIIlIIlIlI[41] = (0xB8 ^ 0x90);
        WorldInfo.lIllIIIlIIlIlI[42] = (0x3C ^ 0x3 ^ (0x42 ^ 0x54));
        WorldInfo.lIllIIIlIIlIlI[43] = (0x93 ^ 0x83 ^ (0x7D ^ 0x47));
        WorldInfo.lIllIIIlIIlIlI[44] = (0xF6 ^ 0x91 ^ (0x4 ^ 0x48));
        WorldInfo.lIllIIIlIIlIlI[45] = (0x4F ^ 0xC ^ (0xCD ^ 0xA2));
        WorldInfo.lIllIIIlIIlIlI[46] = (86 + 131 - 80 + 20 ^ 137 + 157 - 183 + 65);
        WorldInfo.lIllIIIlIIlIlI[47] = (0xDF ^ 0x91 ^ (0xC1 ^ 0xA1));
        WorldInfo.lIllIIIlIIlIlI[48] = (0xD9 ^ 0x99 ^ (0x6A ^ 0x5));
        WorldInfo.lIllIIIlIIlIlI[49] = (0x57 ^ 0x2A ^ (0xDC ^ 0x91));
        WorldInfo.lIllIIIlIIlIlI[50] = (0x5B ^ 0x6A);
        WorldInfo.lIllIIIlIIlIlI[51] = (3 + 1 + 77 + 49 ^ 20 + 68 - 44 + 132);
        WorldInfo.lIllIIIlIIlIlI[52] = (0xB8 ^ 0x8C ^ (0x4C ^ 0x4B));
        WorldInfo.lIllIIIlIIlIlI[53] = (37 + 73 - 84 + 115 ^ 134 + 70 - 20 + 1);
        WorldInfo.lIllIIIlIIlIlI[54] = (7 + 13 + 92 + 26 ^ 151 + 58 - 39 + 21);
        WorldInfo.lIllIIIlIIlIlI[55] = (0x42 ^ 0x76 ^ "  ".length());
        WorldInfo.lIllIIIlIIlIlI[56] = (0xA7 ^ 0xAA ^ (0xBA ^ 0x80));
        WorldInfo.lIllIIIlIIlIlI[57] = (0xF ^ 0x37);
        WorldInfo.lIllIIIlIIlIlI[58] = (0x69 ^ 0x50);
        WorldInfo.lIllIIIlIIlIlI[59] = (0x89 ^ 0xB3);
        WorldInfo.lIllIIIlIIlIlI[60] = (0x35 ^ 0x1A ^ (0xE ^ 0x1A));
        WorldInfo.lIllIIIlIIlIlI[61] = (0xB7 ^ 0x8B);
        WorldInfo.lIllIIIlIIlIlI[62] = (0x8B ^ 0xB6);
        WorldInfo.lIllIIIlIIlIlI[63] = (0x20 ^ 0x1E);
        WorldInfo.lIllIIIlIIlIlI[64] = (0x89 ^ 0xB6);
        WorldInfo.lIllIIIlIIlIlI[65] = (0xE ^ 0x4E);
        WorldInfo.lIllIIIlIIlIlI[66] = (0xE7 ^ 0xA6);
        WorldInfo.lIllIIIlIIlIlI[67] = (0x2A ^ 0x14 ^ (0x16 ^ 0x6A));
        WorldInfo.lIllIIIlIIlIlI[68] = (0x37 ^ 0x24 ^ (0x8 ^ 0x58));
        WorldInfo.lIllIIIlIIlIlI[69] = (0x1 ^ 0x5C ^ (0x50 ^ 0x49));
        WorldInfo.lIllIIIlIIlIlI[70] = (0x3B ^ 0x13 ^ (0x19 ^ 0x74));
        WorldInfo.lIllIIIlIIlIlI[71] = (0xF1 ^ 0xB7);
        WorldInfo.lIllIIIlIIlIlI[72] = (38 + 80 + 11 + 94 ^ 123 + 132 - 117 + 14);
        WorldInfo.lIllIIIlIIlIlI[73] = (0xD3 ^ 0x9B);
        WorldInfo.lIllIIIlIIlIlI[74] = (0xDE ^ 0xB9 ^ (0x7E ^ 0x50));
        WorldInfo.lIllIIIlIIlIlI[75] = (39 + 106 - 8 + 112 ^ 62 + 116 - 3 + 4);
        WorldInfo.lIllIIIlIIlIlI[76] = (0x7 ^ 0x4C);
        WorldInfo.lIllIIIlIIlIlI[77] = (0x5A ^ 0x16);
        WorldInfo.lIllIIIlIIlIlI[78] = (0xFA ^ 0xB7);
        WorldInfo.lIllIIIlIIlIlI[79] = (0xF4 ^ 0xAF ^ (0xD4 ^ 0xC1));
        WorldInfo.lIllIIIlIIlIlI[80] = (0xF3 ^ 0xBC);
        WorldInfo.lIllIIIlIIlIlI[81] = (0xC4 ^ 0x94);
        WorldInfo.lIllIIIlIIlIlI[82] = (31 + 199 - 100 + 77 ^ 25 + 111 - 14 + 36);
        WorldInfo.lIllIIIlIIlIlI[83] = (197 + 208 - 336 + 183 ^ 41 + 9 - 35 + 159);
        WorldInfo.lIllIIIlIIlIlI[84] = (0xC8 ^ 0x9B);
        WorldInfo.lIllIIIlIIlIlI[85] = (0x12 ^ 0x46);
        WorldInfo.lIllIIIlIIlIlI[86] = (0x97 ^ 0xC2);
        WorldInfo.lIllIIIlIIlIlI[87] = (0xC7 ^ 0x91);
        WorldInfo.lIllIIIlIIlIlI[88] = (0x93 ^ 0xC4);
        WorldInfo.lIllIIIlIIlIlI[89] = (0xB1 ^ 0x97 ^ (0x1A ^ 0x64));
        WorldInfo.lIllIIIlIIlIlI[90] = (0x1C ^ 0x6F ^ (0x91 ^ 0xBB));
        WorldInfo.lIllIIIlIIlIlI[91] = (0x2E ^ 0x12 ^ (0x79 ^ 0x1F));
        WorldInfo.lIllIIIlIIlIlI[92] = (0x63 ^ 0x38);
        WorldInfo.lIllIIIlIIlIlI[93] = (0x6 ^ 0x5A);
        WorldInfo.lIllIIIlIIlIlI[94] = (0x56 ^ 0xB);
        WorldInfo.lIllIIIlIIlIlI[95] = (178 + 124 - 98 + 24 ^ 88 + 141 - 208 + 165);
        WorldInfo.lIllIIIlIIlIlI[96] = (0x5B ^ 0x3 ^ (0x5F ^ 0x58));
        WorldInfo.lIllIIIlIIlIlI[97] = (0x39 ^ 0x52 ^ (0x59 ^ 0x52));
        WorldInfo.lIllIIIlIIlIlI[98] = (0xE3 ^ 0xAE ^ (0x27 ^ 0xB));
        WorldInfo.lIllIIIlIIlIlI[99] = (0xDC ^ 0xBE);
        WorldInfo.lIllIIIlIIlIlI[100] = (96 + 113 - 187 + 172 ^ 67 + 1 - 28 + 126);
        WorldInfo.lIllIIIlIIlIlI[101] = (0x77 ^ 0x12);
        WorldInfo.lIllIIIlIIlIlI[102] = (0xAD ^ 0xB6 ^ (0x30 ^ 0x4D));
        WorldInfo.lIllIIIlIIlIlI[103] = (0xA ^ 0x6D);
        WorldInfo.lIllIIIlIIlIlI[104] = (0x73 ^ 0x1B);
        WorldInfo.lIllIIIlIIlIlI[105] = (0xAD ^ 0xC4);
        WorldInfo.lIllIIIlIIlIlI[106] = (0xCA ^ 0xA0);
    }
    
    public NBTTagCompound cloneNBTCompound(final NBTTagCompound lllllllllllllIIIIIllIlIllllIIIIl) {
        final NBTTagCompound lllllllllllllIIIIIllIlIllllIIIII = new NBTTagCompound();
        this.updateTagCompound(lllllllllllllIIIIIllIlIllllIIIII, lllllllllllllIIIIIllIlIllllIIIIl);
        return lllllllllllllIIIIIllIlIllllIIIII;
    }
    
    public long getSeed() {
        return this.randomSeed;
    }
    
    public boolean areCommandsAllowed() {
        return this.allowCommands;
    }
    
    public void setBorderLerpTarget(final double lllllllllllllIIIIIllIlIIlllllIll) {
        this.borderSizeLerpTarget = lllllllllllllIIIIIllIlIIlllllIll;
    }
    
    public boolean isInitialized() {
        return this.initialized;
    }
    
    public NBTTagCompound getNBTTagCompound() {
        final NBTTagCompound lllllllllllllIIIIIllIlIllllIlIII = new NBTTagCompound();
        this.updateTagCompound(lllllllllllllIIIIIllIlIllllIlIII, this.playerTag);
        return lllllllllllllIIIIIllIlIllllIlIII;
    }
    
    public void getBorderCenterX(final double lllllllllllllIIIIIllIlIIlllIllll) {
        this.borderCenterX = lllllllllllllIIIIIllIlIIlllIllll;
    }
    
    public void setBorderDamagePerBlock(final double lllllllllllllIIIIIllIlIIllIllIll) {
        this.borderDamagePerBlock = lllllllllllllIIIIIllIlIIllIllIll;
    }
    
    public void setBorderSafeZone(final double lllllllllllllIIIIIllIlIIlllIIllI) {
        this.borderSafeZone = lllllllllllllIIIIIllIlIIlllIIllI;
    }
    
    private static String llllIlIlIlIllll(final String lllllllllllllIIIIIllIIlllllllIlI, final String lllllllllllllIIIIIllIIlllllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIlIIIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlllllllIIl.getBytes(StandardCharsets.UTF_8)), WorldInfo.lIllIIIlIIlIlI[6]), "DES");
            final Cipher lllllllllllllIIIIIllIlIIIIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIllIlIIIIIIIIIl.init(WorldInfo.lIllIIIlIIlIlI[4], lllllllllllllIIIIIllIlIIIIIIIIll);
            return new String(lllllllllllllIIIIIllIlIIIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIllllllllll) {
            lllllllllllllIIIIIllIIllllllllll.printStackTrace();
            return null;
        }
    }
    
    public void setHardcore(final boolean lllllllllllllIIIIIllIlIlIIllllIl) {
        this.hardcore = lllllllllllllIIIIIllIlIlIIllllIl;
    }
    
    public void setSpawnY(final int lllllllllllllIIIIIllIlIllIllIIlI) {
        this.spawnY = lllllllllllllIIIIIllIlIllIllIIlI;
    }
    
    public boolean isThundering() {
        return this.thundering;
    }
    
    public void setWorldName(final String lllllllllllllIIIIIllIlIllIIIllll) {
        this.levelName = lllllllllllllIIIIIllIlIllIIIllll;
    }
    
    private static String llllIlIlIllIIlI(String lllllllllllllIIIIIllIlIIIIIlllII, final String lllllllllllllIIIIIllIlIIIIlIIIlI) {
        lllllllllllllIIIIIllIlIIIIIlllII = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIllIlIIIIIlllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIlIIIIlIIIII = new StringBuilder();
        final char[] lllllllllllllIIIIIllIlIIIIIlllll = lllllllllllllIIIIIllIlIIIIlIIIlI.toCharArray();
        int lllllllllllllIIIIIllIlIIIIIlllIl = WorldInfo.lIllIIIlIIlIlI[0];
        final short lllllllllllllIIIIIllIlIIIIIlIlIl = (Object)((String)lllllllllllllIIIIIllIlIIIIIlllII).toCharArray();
        final byte lllllllllllllIIIIIllIlIIIIIlIlII = (byte)lllllllllllllIIIIIllIlIIIIIlIlIl.length;
        Exception lllllllllllllIIIIIllIlIIIIIlIIlI = (Exception)WorldInfo.lIllIIIlIIlIlI[0];
        while (llllIllllIlIlll((int)lllllllllllllIIIIIllIlIIIIIlIIlI, lllllllllllllIIIIIllIlIIIIIlIlII)) {
            final char lllllllllllllIIIIIllIlIIIIlIIllI = lllllllllllllIIIIIllIlIIIIIlIlIl[lllllllllllllIIIIIllIlIIIIIlIIlI];
            lllllllllllllIIIIIllIlIIIIlIIIII.append((char)(lllllllllllllIIIIIllIlIIIIlIIllI ^ lllllllllllllIIIIIllIlIIIIIlllll[lllllllllllllIIIIIllIlIIIIIlllIl % lllllllllllllIIIIIllIlIIIIIlllll.length]));
            "".length();
            ++lllllllllllllIIIIIllIlIIIIIlllIl;
            ++lllllllllllllIIIIIllIlIIIIIlIIlI;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIlIIIIlIIIII);
    }
    
    public int getSpawnZ() {
        return this.spawnZ;
    }
    
    public boolean isRaining() {
        return this.raining;
    }
    
    private static boolean llllIllllIlIlIl(final Object lllllllllllllIIIIIllIIllllIIIlIl, final Object lllllllllllllIIIIIllIIllllIIIlII) {
        return lllllllllllllIIIIIllIIllllIIIlIl == lllllllllllllIIIIIllIIllllIIIlII;
    }
    
    public boolean isDifficultyLocked() {
        return this.difficultyLocked;
    }
    
    public GameRules getGameRulesInstance() {
        return this.theGameRules;
    }
    
    public String getWorldName() {
        return this.levelName;
    }
    
    public long getWorldTime() {
        return this.worldTime;
    }
    
    public int getSpawnY() {
        return this.spawnY;
    }
    
    public void setTerrainType(final WorldType lllllllllllllIIIIIllIlIlIIllIlII) {
        this.terrainType = lllllllllllllIIIIIllIlIlIIllIlII;
    }
    
    public void populateFromWorldSettings(final WorldSettings lllllllllllllIIIIIllIlIlllllIlII) {
        this.randomSeed = lllllllllllllIIIIIllIlIlllllIlII.getSeed();
        this.theGameType = lllllllllllllIIIIIllIlIlllllIlII.getGameType();
        this.mapFeaturesEnabled = lllllllllllllIIIIIllIlIlllllIlII.isMapFeaturesEnabled();
        this.hardcore = lllllllllllllIIIIIllIlIlllllIlII.getHardcoreEnabled();
        this.terrainType = lllllllllllllIIIIIllIlIlllllIlII.getTerrainType();
        this.generatorOptions = lllllllllllllIIIIIllIlIlllllIlII.getWorldName();
        this.allowCommands = lllllllllllllIIIIIllIlIlllllIlII.areCommandsAllowed();
    }
    
    public void setWorldTime(final long lllllllllllllIIIIIllIlIllIIllllI) {
        this.worldTime = lllllllllllllIIIIIllIlIllIIllllI;
    }
    
    public void setSpawnZ(final int lllllllllllllIIIIIllIlIllIlIllII) {
        this.spawnZ = lllllllllllllIIIIIllIlIllIlIllII;
    }
    
    public void setGameType(final WorldSettings.GameType lllllllllllllIIIIIllIlIlIlIIIlII) {
        this.theGameType = lllllllllllllIIIIIllIlIlIlIIIlII;
    }
    
    public void setThunderTime(final int lllllllllllllIIIIIllIlIlIllIlIII) {
        this.thunderTime = lllllllllllllIIIIIllIlIlIllIlIII;
    }
    
    private static void llllIlIllIIlIIl() {
        (lIlIlllllIllll = new String[WorldInfo.lIllIIIlIIlIlI[106]])[WorldInfo.lIllIIIlIIlIlI[0]] = llllIlIlIlIllll("UFbdgf3mu+c=", "CrYTP");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[3]] = llllIlIlIllIIII("d1pbrem9bN8=", "iUeOT");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[4]] = llllIlIlIlIllll("uq927QH877cBfMFD5uabSQ==", "WzlPv");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[5]] = llllIlIlIlIllll("70BOdr8Pr0+6Xjcp9EtMtg==", "BXPZK");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[7]] = llllIlIlIlIllll("zN8S0qf9kWuJ/lhUWLy3Pg==", "dYbCK");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[1]] = llllIlIlIllIIlI("CCQvEhoONS4FPgozMh4HAQ==", "oAAwh");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[9]] = llllIlIlIlIllll("5l7Q/xPTyb73xkgImZOzHjOWcjdzs+Bt", "rkgZK");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[10]] = llllIlIlIlIllll("+7MLrbm4iRT1JiyW560J4scs9/NOYkw7", "rIbSq");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[6]] = llllIlIlIlIllll("UpjChUfVkOv4db11kZtA+RIA4JLcBuSh", "pIqUN");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[11]] = llllIlIlIllIIII("itn5NtJGtxhm5m0TNDYAuQ==", "EBDrS");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[12]] = llllIlIlIllIIII("DQTF+uLADON3lCOQrww9iA==", "Teepl");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[13]] = llllIlIlIlIllll("lE4erR8bSKY7ZfWJemNqjw==", "YBNwB");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[14]] = llllIlIlIlIllll("RNxGhe9Uu7k=", "ARcIo");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[15]] = llllIlIlIllIIII("5I4ih+MOR1s=", "RyJJI");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[16]] = llllIlIlIllIIlI("AgQ7HzQL", "QtZhZ");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[2]] = llllIlIlIllIIlI("IS8GBw==", "uFkbZ");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[17]] = llllIlIlIlIllll("rUiMI4PuuRE=", "sxCIc");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[18]] = llllIlIlIlIllll("TA8rIrlPucE=", "QrMaL");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[19]] = llllIlIlIllIIlI("OjY8LgQaNjY/MA==", "vWOZT");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[20]] = llllIlIlIlIllll("sZvpHp0naq5ynQ5AjvI+sA==", "NEUoU");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[21]] = llllIlIlIllIIII("W92B52Bxpd6IK7fOWN3YzQ==", "hjUfk");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[22]] = llllIlIlIllIIlI("IQsDNBw4AA==", "WnqGu");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[23]] = llllIlIlIllIIlI("LQIuICcZCyo1PSscHyg4Kw==", "NnKAU");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[24]] = llllIlIlIllIIlI("BTAIDzUePAQ=", "wQaaa");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[25]] = llllIlIlIllIIlI("CgsiJRMWDQ==", "xjKKz");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[26]] = llllIlIlIlIllll("fII75OKsV4bma0ZPESBA/Q==", "BEpGx");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[27]] = llllIlIlIllIIlI("BxI3BygWCCsHKw==", "szBiL");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[28]] = llllIlIlIlIllll("kxL3HK/rYm5cdFr4cSiHBw==", "oIFxU");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[29]] = llllIlIlIllIIlI("Gg86GAwSDToWABc=", "saSle");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[30]] = llllIlIlIllIIlI("CgQkHTgCBiQTNAc=", "cjMiQ");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[31]] = llllIlIlIlIllll("cS0AqmWEDXtWJyeLTcoiYQ==", "qISsn");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[32]] = llllIlIlIllIIlI("AysYOy8hKBk5OQwjBw==", "bGtTX");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[33]] = llllIlIlIllIIII("bt8khH1nqNM=", "HovQJ");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[34]] = llllIlIlIlIllll("upHz8aZ0UBQ=", "mpwoJ");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[35]] = llllIlIlIlIllll("/WZ8V2uZe9Jy7v5RiaKjSQ==", "NQyvr");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[36]] = llllIlIlIllIIII("ycSZrfYAXV/3q3hIMfRdSw==", "TSoHm");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[37]] = llllIlIlIllIIlI("NBI5PAQGHzEq", "ssTYV");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[38]] = llllIlIlIllIIII("geSZbsjIe94ZiyM6jt+V7g==", "CJKMl");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[39]] = llllIlIlIllIIlI("PjoyISAZJjgzMA==", "zSTGI");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[40]] = llllIlIlIllIIII("ZFkT9TxQaIE1ddacDa05ZSn/xL5rTKkm", "oUXJY");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[41]] = llllIlIlIllIIlI("KjEpMD8NLSMiLyI3LD0zCg==", "nXOVV");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[42]] = llllIlIlIllIIlI("CT4fAjw5EggILS4jNQ==", "KQmfY");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[43]] = llllIlIlIllIIII("uIS5MGA3ml5vl8aeHhPQbQ==", "aeFns");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[44]] = llllIlIlIlIllll("UxF+Fmo5mtJ+fYpTLy1uZw==", "AyKwy");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[45]] = llllIlIlIlIllll("q6YvUBxg9ZSY1Cxd+YlZqA==", "JFClz");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[46]] = llllIlIlIllIIlI("ERkfBjchJQQYNw==", "SvmbR");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[47]] = llllIlIlIlIllll("y6r64aPZ643C7nYyJdY8/g==", "NPjJp");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[48]] = llllIlIlIllIIII("UU4kiksQesoWY2y6pObbFA4JMYL0fiAh", "YEAph");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[49]] = llllIlIlIllIIlI("KykbNzEbFQApMSUjGyMAACsM", "iFiST");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[50]] = llllIlIlIllIIlI("BCMDEQs0HxgPCwopAwU6Jz4WEBo=", "FLqun");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[51]] = llllIlIlIllIIII("ZWPF51HiJnoHwqbCZ1As3sQYxMkdGmHp", "xZglW");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[52]] = llllIlIlIllIIlI("BC0wDAI0ESMOAhwtLA0=", "FBBhg");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[53]] = llllIlIlIlIllll("KTQe/qmMrWruJkVwI4v8dA==", "lIHZD");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[54]] = llllIlIlIllIIlI("Gj4nPQ8qFTQ0Cz80BTwYGj06OgE=", "XQUYj");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[55]] = llllIlIlIlIllll("sfkYSyO2q1tMUegdI7dx5HtDl8g60Vc8", "VXhbK");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[56]] = llllIlIlIllIIII("2p8LnxVgmborC7yr1ZEr8ixri0RQ6SpL", "cmNWp");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[57]] = llllIlIlIllIIlI("NB4cDxEEJg8ZGh8fCSkYGRIFGA==", "vqnkt");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[58]] = llllIlIlIlIllll("YKi4mfaWID7qK9tBXwOAx3Hf65JMDngz", "dHrOO");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[59]] = llllIlIlIllIIlI("Bw0ELTQ3NRc7PywMER04KAc=", "EbvIQ");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[60]] = llllIlIlIllIIII("/4a4RdkMCCk=", "WjXOO");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[61]] = llllIlIlIllIIlI("", "ckZKp");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[62]] = llllIlIlIllIIII("YVk7J5EEtA16TFPHMbdRhA==", "tDgXR");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[63]] = llllIlIlIlIllll("XEdpaE/aoJAlOk9n+i7U/A==", "FZWuO");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[64]] = llllIlIlIlIllll("cJzRISyZpEsNEIRnYeezM6Ds5nJeEjkq", "qFMnE");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[65]] = llllIlIlIllIIlI("Nyc+HCsxNj8LFiA2ORY3Iw==", "PBPyY");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[66]] = llllIlIlIlIllll("7ha7IrKiLp8ECN2zQPK/EA==", "Qbiqc");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[67]] = llllIlIlIlIllll("gl9rpPqiPX7eSKb/pf6DQw==", "nmFPh");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[68]] = llllIlIlIllIIlI("ABYLGBkL", "Sfjow");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[69]] = llllIlIlIlIllll("orOJxaHG0hA=", "OQaqQ");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[70]] = llllIlIlIllIIlI("HxkWEDcW", "LiwgY");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[71]] = llllIlIlIllIIII("Av+vFk5eGC0=", "QKOvT");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[72]] = llllIlIlIllIIlI("CDc6JQEhMw==", "LVCqh");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[73]] = llllIlIlIllIIlI("NhM/CyYLPiwdAg==", "ezEni");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[74]] = llllIlIlIllIIII("LRwDTfjKlfUlhQl6i0Bu3w==", "kZddp");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[75]] = llllIlIlIllIIlI("CjEDBhkINRgG", "FTucu");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[76]] = llllIlIlIllIIlI("BgMrKw0fCA==", "pfYXd");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[77]] = llllIlIlIllIIII("XPyNp1lK1D7oUwUvxRQEqDTfgsIkF+wI", "LivaU");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[78]] = llllIlIlIllIIII("FsJB/2AUncemNPSKO86LKQ==", "bkyWA");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[79]] = llllIlIlIlIllll("nLV/1g1hZ6c=", "WMXtY");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[80]] = llllIlIlIllIIlI("EDkUDwsBIzUIAgE=", "dQaao");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[81]] = llllIlIlIllIIlI("PyY8PyMuPCA/IA==", "KNIQG");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[82]] = llllIlIlIlIllll("4RErkFzbJD8aZ/prUt+OCg==", "XDZSI");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[83]] = llllIlIlIlIllll("8awEDw+1g7NooALjY54zDg==", "OGOrl");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[84]] = llllIlIlIllIIlI("AQk9GAQJCz0WCAw=", "hgTlm");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[85]] = llllIlIlIllIIlI("DA02Fiw8ISEcPSsQHA==", "NbDrI");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[86]] = llllIlIlIllIIII("gB6MmlfRLYFosEGEZ85mkQ==", "cEpoA");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[87]] = llllIlIlIlIllll("OCVnsmHXf5iFx3WD/ahebQ==", "aXdcp");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[88]] = llllIlIlIllIIlI("Ay4+MRczEiUvFw0kPiUmKCwp", "AALUr");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[89]] = llllIlIlIllIIlI("FCMiPA8kHzE+DwwjPj0=", "VLPXj");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[90]] = llllIlIlIlIllll("wUc3hLLdWqVVANCbdeuXoBN0qOpvWyN7", "KTVEW");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[91]] = llllIlIlIlIllll("qZPpTlm/4hFTBnoW2jY9V3PvQAuHoVjP", "SiepK");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[92]] = llllIlIlIllIIII("t9GGLswjn55pb4FVFyNh0msgG6k+eIj/", "eSvcb");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[93]] = llllIlIlIllIIII("90qOoD9yUNCa0Aj/7qQ2UEdWfNhiioMV", "TBjkb");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[94]] = llllIlIlIllIIII("5mtpUSuV/ZOXtEcsHNoNpA==", "oHJTt");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[95]] = llllIlIlIllIIlI("Ag4OPwclEgQtFwoICzILIg==", "FghYn");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[96]] = llllIlIlIlIllll("IyMHe3aMZcxx+lRqXZ/FlA==", "KrXuU");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[97]] = llllIlIlIllIIlI("GiAyDBI4", "JLSuw");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[98]] = llllIlIlIlIllll("GxY8g0t0rpCQn7Pfzv2BNw==", "HOBTi");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[99]] = llllIlIlIllIIII("f769cfsAHFwMjSBy8csvkw==", "zRUYE");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[8]] = llllIlIlIllIIlI("GzQ/EB93NiwbFiUwPRoBdz45ARo4Pzo=", "WQIus");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[100]] = llllIlIlIllIIII("Q7pb5lQGDLBFna6hbYYizqrLIkru3lTD", "nUSvU");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[101]] = llllIlIlIllIIlI("JTw0IxpJLSsrEw==", "iYBFv");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[102]] = llllIlIlIllIIlI("KC4uFiJELzEeKwo4MRwg", "dKXsN");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[103]] = llllIlIlIllIIII("rNIVrl3l8qY2F6q5cHZrRb+1A94AwBwn", "CEAnh");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[104]] = llllIlIlIllIIlI("GiczHQ92NSAZFz4nNw==", "VBExc");
        WorldInfo.lIlIlllllIllll[WorldInfo.lIllIIIlIIlIlI[105]] = llllIlIlIlIllll("e5VsYlg/aCDfC6skQoRytw==", "ibGtm");
    }
    
    public int getSaveVersion() {
        return this.saveVersion;
    }
    
    public double getBorderSize() {
        return this.borderSize;
    }
    
    public void setSaveVersion(final int lllllllllllllIIIIIllIlIllIIIlIII) {
        this.saveVersion = lllllllllllllIIIIIllIlIllIIIlIII;
    }
    
    public void setDifficulty(final EnumDifficulty lllllllllllllIIIIIllIlIIlIllllll) {
        this.difficulty = lllllllllllllIIIIIllIlIIlIllllll;
    }
    
    public EnumDifficulty getDifficulty() {
        return this.difficulty;
    }
    
    static {
        llllIllllIlIIlI();
        llllIlIllIIlIIl();
        DEFAULT_DIFFICULTY = EnumDifficulty.NORMAL;
    }
    
    public void getBorderCenterZ(final double lllllllllllllIIIIIllIlIIllllIlIl) {
        this.borderCenterZ = lllllllllllllIIIIIllIlIIllllIlIl;
    }
    
    public void setServerInitialized(final boolean lllllllllllllIIIIIllIlIlIIIlllIl) {
        this.initialized = lllllllllllllIIIIIllIlIlIIIlllIl;
    }
    
    public void setRaining(final boolean lllllllllllllIIIIIllIlIlIllIIIIl) {
        this.raining = lllllllllllllIIIIIllIlIlIllIIIIl;
    }
    
    public void setSpawn(final BlockPos lllllllllllllIIIIIllIlIllIIllIII) {
        this.spawnX = lllllllllllllIIIIIllIlIllIIllIII.getX();
        this.spawnY = lllllllllllllIIIIIllIlIllIIllIII.getY();
        this.spawnZ = lllllllllllllIIIIIllIlIllIIllIII.getZ();
    }
    
    public long getLastTimePlayed() {
        return this.lastTimePlayed;
    }
    
    private static String llllIlIlIllIIII(final String lllllllllllllIIIIIllIIlllllIIlII, final String lllllllllllllIIIIIllIIlllllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIlllllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIIlllllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIIlllllIlIII.init(WorldInfo.lIllIIIlIIlIlI[4], lllllllllllllIIIIIllIIlllllIlIlI);
            return new String(lllllllllllllIIIIIllIIlllllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIlllllIIllI) {
            lllllllllllllIIIIIllIIlllllIIllI.printStackTrace();
            return null;
        }
    }
    
    public void setBorderSize(final double lllllllllllllIIIIIllIlIlIIIIlIll) {
        this.borderSize = lllllllllllllIIIIIllIlIlIIIIlIll;
    }
}
