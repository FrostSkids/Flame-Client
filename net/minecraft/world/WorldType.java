// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class WorldType
{
    public static final /* synthetic */ WorldType[] worldTypes;
    public static final /* synthetic */ WorldType DEFAULT_1_1;
    private /* synthetic */ boolean hasNotificationData;
    public static final /* synthetic */ WorldType DEFAULT;
    private final /* synthetic */ int worldTypeId;
    private final /* synthetic */ int generatorVersion;
    private /* synthetic */ boolean canBeCreated;
    private /* synthetic */ boolean isWorldTypeVersioned;
    private static final /* synthetic */ String[] lIIIllIIIlIlll;
    private static final /* synthetic */ int[] lIIIllIIIllIlI;
    private final /* synthetic */ String worldType;
    
    private WorldType(final int lllllllllllllIlIIIIIllIlIlIIIIlI, final String lllllllllllllIlIIIIIllIlIlIIIIIl, final int lllllllllllllIlIIIIIllIlIlIIIIII) {
        this.worldType = lllllllllllllIlIIIIIllIlIlIIIIIl;
        this.generatorVersion = lllllllllllllIlIIIIIllIlIlIIIIII;
        this.canBeCreated = (WorldType.lIIIllIIIllIlI[2] != 0);
        this.worldTypeId = lllllllllllllIlIIIIIllIlIlIIIIlI;
        WorldType.worldTypes[lllllllllllllIlIIIIIllIlIlIIIIlI] = this;
    }
    
    static {
        llIIIIllIIIIIll();
        llIIIIlIlllllll();
        worldTypes = new WorldType[WorldType.lIIIllIIIllIlI[0]];
        DEFAULT = new WorldType(WorldType.lIIIllIIIllIlI[1], WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[1]], WorldType.lIIIllIIIllIlI[2]).setVersioned();
        FLAT = new WorldType(WorldType.lIIIllIIIllIlI[2], WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[2]]);
        LARGE_BIOMES = new WorldType(WorldType.lIIIllIIIllIlI[3], WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[3]]);
        AMPLIFIED = new WorldType(WorldType.lIIIllIIIllIlI[4], WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[4]]).setNotificationData();
        CUSTOMIZED = new WorldType(WorldType.lIIIllIIIllIlI[5], WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[5]]);
        DEBUG_WORLD = new WorldType(WorldType.lIIIllIIIllIlI[6], WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[6]]);
        DEFAULT_1_1 = new WorldType(WorldType.lIIIllIIIllIlI[7], WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[8]], WorldType.lIIIllIIIllIlI[1]).setCanBeCreated((boolean)(WorldType.lIIIllIIIllIlI[1] != 0));
    }
    
    private static boolean llIIIIllIIIlIIl(final int lllllllllllllIlIIIIIllIIllIlIlll, final int lllllllllllllIlIIIIIllIIllIlIllI) {
        return lllllllllllllIlIIIIIllIIllIlIlll >= lllllllllllllIlIIIIIllIIllIlIllI;
    }
    
    private static void llIIIIllIIIIIll() {
        (lIIIllIIIllIlI = new int[11])[0] = (105 + 91 - 130 + 61 ^ (0x6F ^ 0x0));
        WorldType.lIIIllIIIllIlI[1] = ((0xF9 ^ 0x94 ^ (0xF ^ 0x78)) & (101 + 90 - 71 + 23 ^ 127 + 62 - 58 + 18 ^ -" ".length()));
        WorldType.lIIIllIIIllIlI[2] = " ".length();
        WorldType.lIIIllIIIllIlI[3] = "  ".length();
        WorldType.lIIIllIIIllIlI[4] = "   ".length();
        WorldType.lIIIllIIIllIlI[5] = (0x30 ^ 0x34);
        WorldType.lIIIllIIIllIlI[6] = (0x74 ^ 0x71);
        WorldType.lIIIllIIIllIlI[7] = (0x35 ^ 0x3D);
        WorldType.lIIIllIIIllIlI[8] = (128 + 46 - 68 + 30 ^ 40 + 131 - 95 + 66);
        WorldType.lIIIllIIIllIlI[9] = (0x66 ^ 0x61);
        WorldType.lIIIllIIIllIlI[10] = (0x16 ^ 0x1F);
    }
    
    public WorldType getWorldTypeForGeneratorVersion(final int lllllllllllllIlIIIIIllIlIIlIlIlI) {
        WorldType default_1_1;
        if (llIIIIllIIIIlIl(this, WorldType.DEFAULT) && llIIIIllIIIIllI(lllllllllllllIlIIIIIllIlIIlIlIlI)) {
            default_1_1 = WorldType.DEFAULT_1_1;
            "".length();
            if (((0x7C ^ 0x55) & ~(0x99 ^ 0xB0)) != 0x0) {
                return null;
            }
        }
        else {
            default_1_1 = this;
        }
        return default_1_1;
    }
    
    private static boolean llIIIIllIIIlIII(final int lllllllllllllIlIIIIIllIIllIIlIlI) {
        return lllllllllllllIlIIIIIllIIllIIlIlI != 0;
    }
    
    public String getWorldTypeName() {
        return this.worldType;
    }
    
    private static boolean llIIIIllIIIIlll(final Object lllllllllllllIlIIIIIllIIllIIllII) {
        return lllllllllllllIlIIIIIllIIllIIllII != null;
    }
    
    private WorldType setCanBeCreated(final boolean lllllllllllllIlIIIIIllIlIIlIIllI) {
        this.canBeCreated = lllllllllllllIlIIIIIllIlIIlIIllI;
        return this;
    }
    
    private static String llIIIIlIlllllIl(final String lllllllllllllIlIIIIIllIIllIlllIl, final String lllllllllllllIlIIIIIllIIllIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIllIIlllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIllIIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIllIIlllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIllIIlllIIIIl.init(WorldType.lIIIllIIIllIlI[3], lllllllllllllIlIIIIIllIIlllIIIlI);
            return new String(lllllllllllllIlIIIIIllIIlllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIllIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIllIIlllIIIII) {
            lllllllllllllIlIIIIIllIIlllIIIII.printStackTrace();
            return null;
        }
    }
    
    public String func_151359_c() {
        return String.valueOf(new StringBuilder(String.valueOf(this.getTranslateName())).append(WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[7]]));
    }
    
    private WorldType(final int lllllllllllllIlIIIIIllIlIlIIlIIl, final String lllllllllllllIlIIIIIllIlIlIIlIll) {
        this(lllllllllllllIlIIIIIllIlIlIIlIIl, lllllllllllllIlIIIIIllIlIlIIlIll, WorldType.lIIIllIIIllIlI[1]);
    }
    
    public int getGeneratorVersion() {
        return this.generatorVersion;
    }
    
    private WorldType setNotificationData() {
        this.hasNotificationData = (WorldType.lIIIllIIIllIlI[2] != 0);
        return this;
    }
    
    public boolean getCanBeCreated() {
        return this.canBeCreated;
    }
    
    public String getTranslateName() {
        return String.valueOf(new StringBuilder(WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[9]]).append(this.worldType));
    }
    
    private static void llIIIIlIlllllll() {
        (lIIIllIIIlIlll = new String[WorldType.lIIIllIIIllIlI[10]])[WorldType.lIIIllIIIllIlI[1]] = llIIIIlIlllllII("Q+bbtwBAGIk=", "rVLun");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[2]] = llIIIIlIlllllIl("hcr3qZLMsPY=", "VioVn");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[3]] = llIIIIlIlllllII("qg0PhkOP8/7SW0Ajo5xfyA==", "JnmQB");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[4]] = llIIIIlIlllllIl("EMNwd48s5a3UrHewMMLL4w==", "xITRn");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[5]] = llIIIIlIlllllII("qRCJ9Uov0DA7cEzGB64OGA==", "RIWzc");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[6]] = llIIIIlIlllllIl("kdrf5ZNoZpCmpTylJsdc2ceJHzi+gBTA", "pkJAt");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[8]] = llIIIIlIlllllIl("TRiJrewp5OJaeII3lSeXVw==", "VesVx");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[9]] = llIIIIlIllllllI("KR8ZFicvDhgBew==", "NzwsU");
        WorldType.lIIIllIIIlIlll[WorldType.lIIIllIIIllIlI[7]] = llIIIIlIllllllI("fh8qCxo=", "PvDmu");
    }
    
    public boolean isVersioned() {
        return this.isWorldTypeVersioned;
    }
    
    public static WorldType parseWorldType(final String lllllllllllllIlIIIIIllIlIIIllIII) {
        int lllllllllllllIlIIIIIllIlIIIlIlll = WorldType.lIIIllIIIllIlI[1];
        "".length();
        if (" ".length() <= 0) {
            return null;
        }
        while (!llIIIIllIIIlIIl(lllllllllllllIlIIIIIllIlIIIlIlll, WorldType.worldTypes.length)) {
            if (llIIIIllIIIIlll(WorldType.worldTypes[lllllllllllllIlIIIIIllIlIIIlIlll]) && llIIIIllIIIlIII(WorldType.worldTypes[lllllllllllllIlIIIIIllIlIIIlIlll].worldType.equalsIgnoreCase(lllllllllllllIlIIIIIllIlIIIllIII) ? 1 : 0)) {
                return WorldType.worldTypes[lllllllllllllIlIIIIIllIlIIIlIlll];
            }
            ++lllllllllllllIlIIIIIllIlIIIlIlll;
        }
        return null;
    }
    
    private static boolean llIIIIllIIIlIlI(final int lllllllllllllIlIIIIIllIIllIlIIll, final int lllllllllllllIlIIIIIllIIllIlIIlI) {
        return lllllllllllllIlIIIIIllIIllIlIIll < lllllllllllllIlIIIIIllIIllIlIIlI;
    }
    
    public int getWorldTypeID() {
        return this.worldTypeId;
    }
    
    private static String llIIIIlIllllllI(String lllllllllllllIlIIIIIllIIllllllII, final String lllllllllllllIlIIIIIllIIlllllIll) {
        lllllllllllllIlIIIIIllIIllllllII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIllIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIllIIllllllll = new StringBuilder();
        final char[] lllllllllllllIlIIIIIllIIlllllllI = lllllllllllllIlIIIIIllIIlllllIll.toCharArray();
        int lllllllllllllIlIIIIIllIIllllllIl = WorldType.lIIIllIIIllIlI[1];
        final float lllllllllllllIlIIIIIllIIllllIlll = (Object)lllllllllllllIlIIIIIllIIllllllII.toCharArray();
        final byte lllllllllllllIlIIIIIllIIllllIllI = (byte)lllllllllllllIlIIIIIllIIllllIlll.length;
        short lllllllllllllIlIIIIIllIIllllIlIl = (short)WorldType.lIIIllIIIllIlI[1];
        while (llIIIIllIIIlIlI(lllllllllllllIlIIIIIllIIllllIlIl, lllllllllllllIlIIIIIllIIllllIllI)) {
            final char lllllllllllllIlIIIIIllIlIIIIIIlI = lllllllllllllIlIIIIIllIIllllIlll[lllllllllllllIlIIIIIllIIllllIlIl];
            lllllllllllllIlIIIIIllIIllllllll.append((char)(lllllllllllllIlIIIIIllIlIIIIIIlI ^ lllllllllllllIlIIIIIllIIlllllllI[lllllllllllllIlIIIIIllIIllllllIl % lllllllllllllIlIIIIIllIIlllllllI.length]));
            "".length();
            ++lllllllllllllIlIIIIIllIIllllllIl;
            ++lllllllllllllIlIIIIIllIIllllIlIl;
            "".length();
            if ((0x3D ^ 0x7E ^ (0x69 ^ 0x2E)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIllIIllllllll);
    }
    
    private static boolean llIIIIllIIIIlIl(final Object lllllllllllllIlIIIIIllIIllIIllll, final Object lllllllllllllIlIIIIIllIIllIIlllI) {
        return lllllllllllllIlIIIIIllIIllIIllll == lllllllllllllIlIIIIIllIIllIIlllI;
    }
    
    private WorldType setVersioned() {
        this.isWorldTypeVersioned = (WorldType.lIIIllIIIllIlI[2] != 0);
        return this;
    }
    
    private static boolean llIIIIllIIIIllI(final int lllllllllllllIlIIIIIllIIllIIlIII) {
        return lllllllllllllIlIIIIIllIIllIIlIII == 0;
    }
    
    public boolean showWorldInfoNotice() {
        return this.hasNotificationData;
    }
    
    private static String llIIIIlIlllllII(final String lllllllllllllIlIIIIIllIIlllIllII, final String lllllllllllllIlIIIIIllIIlllIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIllIIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIllIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), WorldType.lIIIllIIIllIlI[7]), "DES");
            final Cipher lllllllllllllIlIIIIIllIIlllIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIllIIlllIlllI.init(WorldType.lIIIllIIIllIlI[3], lllllllllllllIlIIIIIllIIlllIllll);
            return new String(lllllllllllllIlIIIIIllIIlllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIllIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIllIIlllIllIl) {
            lllllllllllllIlIIIIIllIIlllIllIl.printStackTrace();
            return null;
        }
    }
}
