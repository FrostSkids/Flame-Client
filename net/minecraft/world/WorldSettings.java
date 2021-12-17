// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Arrays;
import net.minecraft.entity.player.PlayerCapabilities;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.storage.WorldInfo;

public final class WorldSettings
{
    private final /* synthetic */ long seed;
    private static final /* synthetic */ int[] lIIIllllIlIIIl;
    private /* synthetic */ boolean commandsAllowed;
    private final /* synthetic */ boolean hardcoreEnabled;
    private final /* synthetic */ GameType theGameType;
    private final /* synthetic */ WorldType terrainType;
    private /* synthetic */ boolean bonusChestEnabled;
    private static final /* synthetic */ String[] lIIIllllIIllIl;
    private /* synthetic */ String worldName;
    private final /* synthetic */ boolean mapFeaturesEnabled;
    
    public boolean areCommandsAllowed() {
        return this.commandsAllowed;
    }
    
    public boolean isBonusChestEnabled() {
        return this.bonusChestEnabled;
    }
    
    public boolean getHardcoreEnabled() {
        return this.hardcoreEnabled;
    }
    
    public static GameType getGameTypeById(final int lllllllllllllIIllllIIllllllIllII) {
        return GameType.getByID(lllllllllllllIIllllIIllllllIllII);
    }
    
    public GameType getGameType() {
        return this.theGameType;
    }
    
    public long getSeed() {
        return this.seed;
    }
    
    public WorldSettings(final long lllllllllllllIIllllIlIIIIIIllIIl, final GameType lllllllllllllIIllllIlIIIIIIllllI, final boolean lllllllllllllIIllllIlIIIIIIlIlll, final boolean lllllllllllllIIllllIlIIIIIIlIllI, final WorldType lllllllllllllIIllllIlIIIIIIlIlIl) {
        this.worldName = WorldSettings.lIIIllllIIllIl[WorldSettings.lIIIllllIlIIIl[0]];
        this.seed = lllllllllllllIIllllIlIIIIIIllIIl;
        this.theGameType = lllllllllllllIIllllIlIIIIIIllllI;
        this.mapFeaturesEnabled = lllllllllllllIIllllIlIIIIIIlIlll;
        this.hardcoreEnabled = lllllllllllllIIllllIlIIIIIIlIllI;
        this.terrainType = lllllllllllllIIllllIlIIIIIIlIlIl;
    }
    
    public WorldSettings setWorldName(final String lllllllllllllIIllllIlIIIIIIIIlIl) {
        this.worldName = lllllllllllllIIllllIlIIIIIIIIlIl;
        return this;
    }
    
    public boolean isMapFeaturesEnabled() {
        return this.mapFeaturesEnabled;
    }
    
    public WorldSettings enableCommands() {
        this.commandsAllowed = (WorldSettings.lIIIllllIlIIIl[1] != 0);
        return this;
    }
    
    private static void llIIIlllllIIIII() {
        (lIIIllllIlIIIl = new int[3])[0] = ((0x8B ^ 0x90) & ~(0xD ^ 0x16));
        WorldSettings.lIIIllllIlIIIl[1] = " ".length();
        WorldSettings.lIIIllllIlIIIl[2] = "  ".length();
    }
    
    public WorldSettings enableBonusChest() {
        this.bonusChestEnabled = (WorldSettings.lIIIllllIlIIIl[1] != 0);
        return this;
    }
    
    public String getWorldName() {
        return this.worldName;
    }
    
    public WorldType getTerrainType() {
        return this.terrainType;
    }
    
    private static void llIIIllllIlllIl() {
        (lIIIllllIIllIl = new String[WorldSettings.lIIIllllIlIIIl[1]])[WorldSettings.lIIIllllIlIIIl[0]] = llIIIllllIlllII("n1BBCJztdEw=", "MhVel");
    }
    
    public WorldSettings(final WorldInfo lllllllllllllIIllllIlIIIIIIIllll) {
        this(lllllllllllllIIllllIlIIIIIIIllll.getSeed(), lllllllllllllIIllllIlIIIIIIIllll.getGameType(), lllllllllllllIIllllIlIIIIIIIllll.isMapFeaturesEnabled(), lllllllllllllIIllllIlIIIIIIIllll.isHardcoreModeEnabled(), lllllllllllllIIllllIlIIIIIIIllll.getTerrainType());
    }
    
    private static String llIIIllllIlllII(final String lllllllllllllIIllllIIlllllIllllI, final String lllllllllllllIIllllIIlllllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIllllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIllllllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIllllllIIIlI.init(WorldSettings.lIIIllllIlIIIl[2], lllllllllllllIIllllIIllllllIIIll);
            return new String(lllllllllllllIIllllIIllllllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlllllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIllllllIIIIl) {
            lllllllllllllIIllllIIllllllIIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIlllllIIIII();
        llIIIllllIlllIl();
    }
    
    public enum GameType
    {
        CREATIVE(GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[5]], GameType.llIIIlIIIIllII[3], GameType.llIIIlIIIIllII[2], GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[6]]);
        
        private static final /* synthetic */ String[] llIIIIlllIlIIl;
        /* synthetic */ int id;
        
        NOT_SET(GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[0]], GameType.llIIIlIIIIllII[0], GameType.llIIIlIIIIllII[1], GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[2]]);
        
        /* synthetic */ String name;
        
        ADVENTURE(GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[7]], GameType.llIIIlIIIIllII[4], GameType.llIIIlIIIIllII[3], GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[8]]), 
        SPECTATOR(GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[9]], GameType.llIIIlIIIIllII[5], GameType.llIIIlIIIIllII[4], GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[10]]), 
        SURVIVAL(GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[3]], GameType.llIIIlIIIIllII[2], GameType.llIIIlIIIIllII[0], GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[4]]);
        
        private static final /* synthetic */ int[] llIIIlIIIIllII;
        
        private static String lIIIlIIIIlIlllII(final String llllllllllllIlllIllIIIlllllIIIII, final String llllllllllllIlllIllIIIllllIlllIl) {
            try {
                final SecretKeySpec llllllllllllIlllIllIIIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIllIIIlllllIIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIlllIllIIIlllllIIIlI.init(GameType.llIIIlIIIIllII[3], llllllllllllIlllIllIIIlllllIIIll);
                return new String(llllllllllllIlllIllIIIlllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIlllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllIIIlllllIIIIl) {
                llllllllllllIlllIllIIIlllllIIIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIlIIIlIlllIII(final int llllllllllllIlllIllIIIlllIlIllll, final int llllllllllllIlllIllIIIlllIlIlllI) {
            return llllllllllllIlllIllIIIlllIlIllll >= llllllllllllIlllIllIIIlllIlIlllI;
        }
        
        private static boolean lIIIlIIIlIllIllI(final Object llllllllllllIlllIllIIIlllIlIIlll, final Object llllllllllllIlllIllIIIlllIlIIllI) {
            return llllllllllllIlllIllIIIlllIlIIlll != llllllllllllIlllIllIIIlllIlIIllI;
        }
        
        public boolean isAdventure() {
            if (lIIIlIIIlIllIllI(this, GameType.ADVENTURE) && lIIIlIIIlIllIllI(this, GameType.SPECTATOR)) {
                return GameType.llIIIlIIIIllII[0] != 0;
            }
            return GameType.llIIIlIIIIllII[2] != 0;
        }
        
        private static void lIIIlIIIIllIIllI() {
            (llIIIIlllIlIIl = new String[GameType.llIIIlIIIIllII[11]])[GameType.llIIIlIIIIllII[0]] = lIIIlIIIIlIlllII("b40+UiGcbc0=", "LjoUc");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[2]] = lIIIlIIIIlIllllI("t+hCkadhY6U=", "RbVGL");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[3]] = lIIIlIIIIlIlllII("UewsA//RNolclm/LkP9wCg==", "IVAVq");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[4]] = lIIIlIIIIlIllllI("dKaAZNZpNKEVc0ftLgWe8A==", "IjCGK");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[5]] = lIIIlIIIIlIlllII("GaDp9F1P0GwOR63PGHbJvg==", "XxncD");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[6]] = lIIIlIIIIlIllllI("NR7TljzftmA6FB3LDi0XcA==", "hFWuI");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[7]] = lIIIlIIIIllIIlII("FyEiBw0CMCYH", "VetBC");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[8]] = lIIIlIIIIllIIlII("JR4SHyIwDxYf", "DzdzL");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[9]] = lIIIlIIIIlIllllI("ozUpiX2YUzPKxsoShR1veg==", "cfZfW");
            GameType.llIIIIlllIlIIl[GameType.llIIIlIIIIllII[10]] = lIIIlIIIIlIllllI("d16rVHhhFbPJNAM4uHmh1A==", "FZgeG");
        }
        
        public static GameType getByName(final String llllllllllllIlllIllIIIllllllIllI) {
            final boolean llllllllllllIlllIllIIIllllllIIII;
            final Exception llllllllllllIlllIllIIIllllllIIIl = (Exception)((GameType[])(Object)(llllllllllllIlllIllIIIllllllIIII = (boolean)(Object)values())).length;
            double llllllllllllIlllIllIIIllllllIIlI = GameType.llIIIlIIIIllII[0];
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
            while (!lIIIlIIIlIlllIII((int)llllllllllllIlllIllIIIllllllIIlI, (int)llllllllllllIlllIllIIIllllllIIIl)) {
                final GameType llllllllllllIlllIllIIIllllllIlIl = llllllllllllIlllIllIIIllllllIIII[llllllllllllIlllIllIIIllllllIIlI];
                if (lIIIlIIIlIllIlIl(llllllllllllIlllIllIIIllllllIlIl.name.equals(llllllllllllIlllIllIIIllllllIllI) ? 1 : 0)) {
                    return llllllllllllIlllIllIIIllllllIlIl;
                }
                ++llllllllllllIlllIllIIIllllllIIlI;
            }
            return GameType.SURVIVAL;
        }
        
        private static boolean lIIIlIIIlIlllIIl(final int llllllllllllIlllIllIIIlllIlIlIll, final int llllllllllllIlllIllIIIlllIlIlIlI) {
            return llllllllllllIlllIllIIIlllIlIlIll < llllllllllllIlllIllIIIlllIlIlIlI;
        }
        
        public void configurePlayerCapabilities(final PlayerCapabilities llllllllllllIlllIllIIlIIIIIlIIll) {
            if (lIIIlIIIlIllIIll(this, GameType.CREATIVE)) {
                llllllllllllIlllIllIIlIIIIIlIIll.allowFlying = (GameType.llIIIlIIIIllII[2] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.isCreativeMode = (GameType.llIIIlIIIIllII[2] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.disableDamage = (GameType.llIIIlIIIIllII[2] != 0);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            else if (lIIIlIIIlIllIIll(this, GameType.SPECTATOR)) {
                llllllllllllIlllIllIIlIIIIIlIIll.allowFlying = (GameType.llIIIlIIIIllII[2] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.isCreativeMode = (GameType.llIIIlIIIIllII[0] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.disableDamage = (GameType.llIIIlIIIIllII[2] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.isFlying = (GameType.llIIIlIIIIllII[2] != 0);
                "".length();
                if (((30 + 139 - 31 + 93 ^ 65 + 3 - 8 + 110) & (176 + 121 - 292 + 227 ^ 160 + 161 - 272 + 116 ^ -" ".length())) < -" ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllIllIIlIIIIIlIIll.allowFlying = (GameType.llIIIlIIIIllII[0] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.isCreativeMode = (GameType.llIIIlIIIIllII[0] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.disableDamage = (GameType.llIIIlIIIIllII[0] != 0);
                llllllllllllIlllIllIIlIIIIIlIIll.isFlying = (GameType.llIIIlIIIIllII[0] != 0);
            }
            int allowEdit;
            if (lIIIlIIIlIllIlIl(this.isAdventure() ? 1 : 0)) {
                allowEdit = GameType.llIIIlIIIIllII[0];
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
            else {
                allowEdit = GameType.llIIIlIIIIllII[2];
            }
            llllllllllllIlllIllIIlIIIIIlIIll.allowEdit = (allowEdit != 0);
        }
        
        public static GameType getByID(final int llllllllllllIlllIllIIlIIIIIIIIlI) {
            final short llllllllllllIlllIllIIIllllllllII;
            final String llllllllllllIlllIllIIIllllllllIl = (String)((GameType[])(Object)(llllllllllllIlllIllIIIllllllllII = (short)(Object)values())).length;
            boolean llllllllllllIlllIllIIIlllllllllI = GameType.llIIIlIIIIllII[0] != 0;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
            while (!lIIIlIIIlIlllIII(llllllllllllIlllIllIIIlllllllllI ? 1 : 0, (int)llllllllllllIlllIllIIIllllllllIl)) {
                final GameType llllllllllllIlllIllIIlIIIIIIIIIl = llllllllllllIlllIllIIIllllllllII[llllllllllllIlllIllIIIlllllllllI];
                if (lIIIlIIIlIllIlll(llllllllllllIlllIllIIlIIIIIIIIIl.id, llllllllllllIlllIllIIlIIIIIIIIlI)) {
                    return llllllllllllIlllIllIIlIIIIIIIIIl;
                }
                ++llllllllllllIlllIllIIIlllllllllI;
            }
            return GameType.SURVIVAL;
        }
        
        private static boolean lIIIlIIIlIllIlIl(final int llllllllllllIlllIllIIIlllIlIIIII) {
            return llllllllllllIlllIllIIIlllIlIIIII != 0;
        }
        
        private static boolean lIIIlIIIlIllIlll(final int llllllllllllIlllIllIIIlllIllIIll, final int llllllllllllIlllIllIIIlllIllIIlI) {
            return llllllllllllIlllIllIIIlllIllIIll == llllllllllllIlllIllIIIlllIllIIlI;
        }
        
        private static boolean lIIIlIIIlIllIIll(final Object llllllllllllIlllIllIIIlllIlIIIll, final Object llllllllllllIlllIllIIIlllIlIIIlI) {
            return llllllllllllIlllIllIIIlllIlIIIll == llllllllllllIlllIllIIIlllIlIIIlI;
        }
        
        private static void lIIIlIIIlIllIIlI() {
            (llIIIlIIIIllII = new int[12])[0] = ((0xA4 ^ 0xAA) & ~(0x87 ^ 0x89));
            GameType.llIIIlIIIIllII[1] = -" ".length();
            GameType.llIIIlIIIIllII[2] = " ".length();
            GameType.llIIIlIIIIllII[3] = "  ".length();
            GameType.llIIIlIIIIllII[4] = "   ".length();
            GameType.llIIIlIIIIllII[5] = (0x17 ^ 0x7D ^ (0x4F ^ 0x21));
            GameType.llIIIlIIIIllII[6] = (0x77 ^ 0x42 ^ (0xB ^ 0x3B));
            GameType.llIIIlIIIIllII[7] = (37 + 189 - 144 + 114 ^ 33 + 158 - 152 + 155);
            GameType.llIIIlIIIIllII[8] = (0x89 ^ 0x8E);
            GameType.llIIIlIIIIllII[9] = (0x63 ^ 0x6B);
            GameType.llIIIlIIIIllII[10] = (0x23 ^ 0x2A);
            GameType.llIIIlIIIIllII[11] = (0x73 ^ 0x79);
        }
        
        private GameType(final String llllllllllllIlllIllIIlIIIIlIIIII, final int llllllllllllIlllIllIIlIIIIIlllll, final int llllllllllllIlllIllIIlIIIIIllllI, final String llllllllllllIlllIllIIlIIIIlIIIlI) {
            this.id = llllllllllllIlllIllIIlIIIIIllllI;
            this.name = llllllllllllIlllIllIIlIIIIlIIIlI;
        }
        
        public boolean isCreative() {
            if (lIIIlIIIlIllIIll(this, GameType.CREATIVE)) {
                return GameType.llIIIlIIIIllII[2] != 0;
            }
            return GameType.llIIIlIIIIllII[0] != 0;
        }
        
        static {
            lIIIlIIIlIllIIlI();
            lIIIlIIIIllIIllI();
            final GameType[] enum$VALUES = new GameType[GameType.llIIIlIIIIllII[6]];
            enum$VALUES[GameType.llIIIlIIIIllII[0]] = GameType.NOT_SET;
            enum$VALUES[GameType.llIIIlIIIIllII[2]] = GameType.SURVIVAL;
            enum$VALUES[GameType.llIIIlIIIIllII[3]] = GameType.CREATIVE;
            enum$VALUES[GameType.llIIIlIIIIllII[4]] = GameType.ADVENTURE;
            enum$VALUES[GameType.llIIIlIIIIllII[5]] = GameType.SPECTATOR;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIIlIIIIllIIlII(String llllllllllllIlllIllIIIlllIlllllI, final String llllllllllllIlllIllIIIllllIIIIlI) {
            llllllllllllIlllIllIIIlllIlllllI = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIllIIIlllIlllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIllIIIllllIIIIIl = new StringBuilder();
            final char[] llllllllllllIlllIllIIIllllIIIIII = llllllllllllIlllIllIIIllllIIIIlI.toCharArray();
            int llllllllllllIlllIllIIIlllIllllll = GameType.llIIIlIIIIllII[0];
            final boolean llllllllllllIlllIllIIIlllIlllIIl = (Object)((String)llllllllllllIlllIllIIIlllIlllllI).toCharArray();
            final float llllllllllllIlllIllIIIlllIlllIII = llllllllllllIlllIllIIIlllIlllIIl.length;
            boolean llllllllllllIlllIllIIIlllIllIlll = GameType.llIIIlIIIIllII[0] != 0;
            while (lIIIlIIIlIlllIIl(llllllllllllIlllIllIIIlllIllIlll ? 1 : 0, (int)llllllllllllIlllIllIIIlllIlllIII)) {
                final char llllllllllllIlllIllIIIllllIIIlII = llllllllllllIlllIllIIIlllIlllIIl[llllllllllllIlllIllIIIlllIllIlll];
                llllllllllllIlllIllIIIllllIIIIIl.append((char)(llllllllllllIlllIllIIIllllIIIlII ^ llllllllllllIlllIllIIIllllIIIIII[llllllllllllIlllIllIIIlllIllllll % llllllllllllIlllIllIIIllllIIIIII.length]));
                "".length();
                ++llllllllllllIlllIllIIIlllIllllll;
                ++llllllllllllIlllIllIIIlllIllIlll;
                "".length();
                if (-(0xF1 ^ 0x98 ^ (0xC9 ^ 0xA4)) >= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIllIIIllllIIIIIl);
        }
        
        public String getName() {
            return this.name;
        }
        
        public int getID() {
            return this.id;
        }
        
        private static String lIIIlIIIIlIllllI(final String llllllllllllIlllIllIIIllllIlIIll, final String llllllllllllIlllIllIIIllllIlIIII) {
            try {
                final SecretKeySpec llllllllllllIlllIllIIIllllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIllllIlIIII.getBytes(StandardCharsets.UTF_8)), GameType.llIIIlIIIIllII[9]), "DES");
                final Cipher llllllllllllIlllIllIIIllllIlIlIl = Cipher.getInstance("DES");
                llllllllllllIlllIllIIIllllIlIlIl.init(GameType.llIIIlIIIIllII[3], llllllllllllIlllIllIIIllllIlIllI);
                return new String(llllllllllllIlllIllIIIllllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllIIIllllIlIlII) {
                llllllllllllIlllIllIIIllllIlIlII.printStackTrace();
                return null;
            }
        }
        
        public boolean isSurvivalOrAdventure() {
            if (lIIIlIIIlIllIllI(this, GameType.SURVIVAL) && lIIIlIIIlIllIllI(this, GameType.ADVENTURE)) {
                return GameType.llIIIlIIIIllII[0] != 0;
            }
            return GameType.llIIIlIIIIllII[2] != 0;
        }
    }
}
