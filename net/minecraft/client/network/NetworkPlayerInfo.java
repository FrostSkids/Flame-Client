// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.network;

import com.google.common.base.Objects;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.network.play.server.S38PacketPlayerListItem;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.client.Minecraft;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldSettings;
import net.minecraft.util.IChatComponent;

public class NetworkPlayerInfo
{
    private /* synthetic */ long field_178869_m;
    private /* synthetic */ IChatComponent displayName;
    private /* synthetic */ int field_178873_i;
    private /* synthetic */ int responseTime;
    private /* synthetic */ long field_178871_k;
    private /* synthetic */ WorldSettings.GameType gameType;
    private /* synthetic */ boolean playerTexturesLoaded;
    private /* synthetic */ int field_178870_j;
    private /* synthetic */ ResourceLocation locationSkin;
    private final /* synthetic */ GameProfile gameProfile;
    private /* synthetic */ String skinType;
    private /* synthetic */ ResourceLocation locationCape;
    private static final /* synthetic */ int[] lllIIlllllIlIl;
    private /* synthetic */ long field_178868_l;
    
    private static boolean lIlIIIIlIIIlIllI(final Object llllllllllllIlIlllIlIlIIIIIlIIIl) {
        return llllllllllllIlIlllIlIlIIIIIlIIIl == null;
    }
    
    public void setDisplayName(final IChatComponent llllllllllllIlIlllIlIlIIIlIlIlIl) {
        this.displayName = llllllllllllIlIlllIlIlIIIlIlIlIl;
    }
    
    static {
        lIlIIIIlIIIlIlII();
    }
    
    public boolean hasLocationSkin() {
        if (lIlIIIIlIIIlIlIl(this.locationSkin)) {
            return NetworkPlayerInfo.lllIIlllllIlIl[1] != 0;
        }
        return NetworkPlayerInfo.lllIIlllllIlIl[0] != 0;
    }
    
    public long func_178847_n() {
        return this.field_178871_k;
    }
    
    public int func_178835_l() {
        return this.field_178873_i;
    }
    
    public long func_178858_o() {
        return this.field_178868_l;
    }
    
    public GameProfile getGameProfile() {
        return this.gameProfile;
    }
    
    public void func_178857_c(final int llllllllllllIlIlllIlIlIIIlIIIIII) {
        this.field_178870_j = llllllllllllIlIlllIlIlIIIlIIIIII;
    }
    
    public IChatComponent getDisplayName() {
        return this.displayName;
    }
    
    protected void loadPlayerTextures() {
        final String llllllllllllIlIlllIlIlIIIlIllIIl = (String)this;
        synchronized (this) {
            if (lIlIIIIlIIIlIlll(this.playerTexturesLoaded ? 1 : 0)) {
                this.playerTexturesLoaded = (NetworkPlayerInfo.lllIIlllllIlIl[1] != 0);
                Minecraft.getMinecraft().getSkinManager().loadProfileTextures(this.gameProfile, new SkinManager.SkinAvailableCallback() {
                    private static final /* synthetic */ String[] lllllIllIlIlI;
                    private static final /* synthetic */ int[] lllllIlllIlll;
                    
                    private static String lIlIllllIIIIIll(final String lllllllllllllIlIlIllIIlIIIIlIIIl, final String lllllllllllllIlIlIllIIlIIIIlIIlI) {
                        try {
                            final SecretKeySpec lllllllllllllIlIlIllIIlIIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                            final Cipher lllllllllllllIlIlIllIIlIIIIlIlIl = Cipher.getInstance("Blowfish");
                            lllllllllllllIlIlIllIIlIIIIlIlIl.init(NetworkPlayerInfo$1.lllllIlllIlll[2], lllllllllllllIlIlIllIIlIIIIlIllI);
                            return new String(lllllllllllllIlIlIllIIlIIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception lllllllllllllIlIlIllIIlIIIIlIlII) {
                            lllllllllllllIlIlIllIIlIIIIlIlII.printStackTrace();
                            return null;
                        }
                    }
                    
                    static {
                        lIlIllllIIllllI();
                        lIlIllllIIIIlIl();
                    }
                    
                    private static String lIlIllllIIIIlII(String lllllllllllllIlIlIllIIIllllllllI, final String lllllllllllllIlIlIllIIIlllllllIl) {
                        lllllllllllllIlIlIllIIIllllllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIllIIIllllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                        final StringBuilder lllllllllllllIlIlIllIIlIIIIIIIIl = new StringBuilder();
                        final char[] lllllllllllllIlIlIllIIlIIIIIIIII = lllllllllllllIlIlIllIIIlllllllIl.toCharArray();
                        int lllllllllllllIlIlIllIIIlllllllll = NetworkPlayerInfo$1.lllllIlllIlll[0];
                        final String lllllllllllllIlIlIllIIIllllllIIl = (Object)lllllllllllllIlIlIllIIIllllllllI.toCharArray();
                        final char lllllllllllllIlIlIllIIIllllllIII = (char)lllllllllllllIlIlIllIIIllllllIIl.length;
                        byte lllllllllllllIlIlIllIIIlllllIlll = (byte)NetworkPlayerInfo$1.lllllIlllIlll[0];
                        while (lIlIllllIlIIIIl(lllllllllllllIlIlIllIIIlllllIlll, lllllllllllllIlIlIllIIIllllllIII)) {
                            final char lllllllllllllIlIlIllIIlIIIIIIlII = lllllllllllllIlIlIllIIIllllllIIl[lllllllllllllIlIlIllIIIlllllIlll];
                            lllllllllllllIlIlIllIIlIIIIIIIIl.append((char)(lllllllllllllIlIlIllIIlIIIIIIlII ^ lllllllllllllIlIlIllIIlIIIIIIIII[lllllllllllllIlIlIllIIIlllllllll % lllllllllllllIlIlIllIIlIIIIIIIII.length]));
                            "".length();
                            ++lllllllllllllIlIlIllIIIlllllllll;
                            ++lllllllllllllIlIlIllIIIlllllIlll;
                            "".length();
                            if ("  ".length() < 0) {
                                return null;
                            }
                        }
                        return String.valueOf(lllllllllllllIlIlIllIIlIIIIIIIIl);
                    }
                    
                    private static boolean lIlIllllIlIIIIl(final int lllllllllllllIlIlIllIIIlllllIIll, final int lllllllllllllIlIlIllIIIlllllIIlI) {
                        return lllllllllllllIlIlIllIIIlllllIIll < lllllllllllllIlIlIllIIIlllllIIlI;
                    }
                    
                    private static void lIlIllllIIllllI() {
                        (lllllIlllIlll = new int[3])[0] = ((0x63 ^ 0x79) & ~(0x3D ^ 0x27));
                        NetworkPlayerInfo$1.lllllIlllIlll[1] = " ".length();
                        NetworkPlayerInfo$1.lllllIlllIlll[2] = "  ".length();
                    }
                    
                    static /* synthetic */ int[] $SWITCH_TABLE$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type() {
                        final int[] $switch_TABLE$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type = NetworkPlayerInfo$1.$SWITCH_TABLE$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type;
                        if (lIlIllllIlIIIII($switch_TABLE$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type)) {
                            return $switch_TABLE$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type;
                        }
                        "".length();
                        final boolean lllllllllllllIlIlIllIIlIIIIllIll = (Object)new int[MinecraftProfileTexture.Type.values().length];
                        try {
                            lllllllllllllIlIlIllIIlIIIIllIll[MinecraftProfileTexture.Type.CAPE.ordinal()] = NetworkPlayerInfo$1.lllllIlllIlll[2];
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        catch (NoSuchFieldError noSuchFieldError) {
                            "".length();
                        }
                        try {
                            lllllllllllllIlIlIllIIlIIIIllIll[MinecraftProfileTexture.Type.SKIN.ordinal()] = NetworkPlayerInfo$1.lllllIlllIlll[1];
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        catch (NoSuchFieldError noSuchFieldError2) {
                            "".length();
                        }
                        return NetworkPlayerInfo$1.$SWITCH_TABLE$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type = (int[])(Object)lllllllllllllIlIlIllIIlIIIIllIll;
                    }
                    
                    private static void lIlIllllIIIIlIl() {
                        (lllllIllIlIlI = new String[NetworkPlayerInfo$1.lllllIlllIlll[2]])[NetworkPlayerInfo$1.lllllIlllIlll[0]] = lIlIllllIIIIIll("y4/V/oW71mE=", "UwDrw");
                        NetworkPlayerInfo$1.lllllIllIlIlI[NetworkPlayerInfo$1.lllllIlllIlll[1]] = lIlIllllIIIIlII("CikgFhgCOA==", "nLFwm");
                    }
                    
                    private static boolean lIlIllllIlIIIII(final Object lllllllllllllIlIlIllIIIlllllIIII) {
                        return lllllllllllllIlIlIllIIIlllllIIII != null;
                    }
                    
                    private static boolean lIlIllllIIlllll(final Object lllllllllllllIlIlIllIIIllllIlllI) {
                        return lllllllllllllIlIlIllIIIllllIlllI == null;
                    }
                    
                    @Override
                    public void skinAvailable(final MinecraftProfileTexture.Type lllllllllllllIlIlIllIIlIIIlIIIll, final ResourceLocation lllllllllllllIlIlIllIIlIIIlIIIlI, final MinecraftProfileTexture lllllllllllllIlIlIllIIlIIIIlllIl) {
                        switch ($SWITCH_TABLE$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type()[lllllllllllllIlIlIllIIlIIIlIIIll.ordinal()]) {
                            case 1: {
                                NetworkPlayerInfo.access$0(NetworkPlayerInfo.this, lllllllllllllIlIlIllIIlIIIlIIIlI);
                                NetworkPlayerInfo.access$1(NetworkPlayerInfo.this, lllllllllllllIlIlIllIIlIIIIlllIl.getMetadata(NetworkPlayerInfo$1.lllllIllIlIlI[NetworkPlayerInfo$1.lllllIlllIlll[0]]));
                                if (!lIlIllllIIlllll(NetworkPlayerInfo.this.skinType)) {
                                    break;
                                }
                                NetworkPlayerInfo.access$1(NetworkPlayerInfo.this, NetworkPlayerInfo$1.lllllIllIlIlI[NetworkPlayerInfo$1.lllllIlllIlll[1]]);
                                "".length();
                                if ((0x33 ^ 0x37) < "  ".length()) {
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                NetworkPlayerInfo.access$3(NetworkPlayerInfo.this, lllllllllllllIlIlIllIIlIIIlIIIlI);
                                break;
                            }
                        }
                    }
                }, (boolean)(NetworkPlayerInfo.lllIIlllllIlIl[1] != 0));
            }
            // monitorexit(this)
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
    }
    
    public int func_178860_m() {
        return this.field_178870_j;
    }
    
    public ResourceLocation getLocationCape() {
        if (lIlIIIIlIIIlIllI(this.locationCape)) {
            this.loadPlayerTextures();
        }
        return this.locationCape;
    }
    
    static /* synthetic */ void access$1(final NetworkPlayerInfo llllllllllllIlIlllIlIlIIIIIlllII, final String llllllllllllIlIlllIlIlIIIIIllIll) {
        llllllllllllIlIlllIlIlIIIIIlllII.skinType = llllllllllllIlIlllIlIlIIIIIllIll;
    }
    
    static /* synthetic */ void access$0(final NetworkPlayerInfo llllllllllllIlIlllIlIlIIIIlIIIII, final ResourceLocation llllllllllllIlIlllIlIlIIIIIlllll) {
        llllllllllllIlIlllIlIlIIIIlIIIII.locationSkin = llllllllllllIlIlllIlIlIIIIIlllll;
    }
    
    protected void setResponseTime(final int llllllllllllIlIlllIlIlIIIllIllIl) {
        this.responseTime = llllllllllllIlIlllIlIlIIIllIllIl;
    }
    
    public NetworkPlayerInfo(final GameProfile llllllllllllIlIlllIlIlIIlIIIlIII) {
        this.playerTexturesLoaded = (NetworkPlayerInfo.lllIIlllllIlIl[0] != 0);
        this.field_178873_i = NetworkPlayerInfo.lllIIlllllIlIl[0];
        this.field_178870_j = NetworkPlayerInfo.lllIIlllllIlIl[0];
        this.field_178871_k = 0L;
        this.field_178868_l = 0L;
        this.field_178869_m = 0L;
        this.gameProfile = llllllllllllIlIlllIlIlIIlIIIlIII;
    }
    
    public long func_178855_p() {
        return this.field_178869_m;
    }
    
    private static boolean lIlIIIIlIIIlIlll(final int llllllllllllIlIlllIlIlIIIIIIllll) {
        return llllllllllllIlIlllIlIlIIIIIIllll == 0;
    }
    
    public void func_178836_b(final int llllllllllllIlIlllIlIlIIIlIIlIIl) {
        this.field_178873_i = llllllllllllIlIlllIlIlIIIlIIlIIl;
    }
    
    public void func_178843_c(final long llllllllllllIlIlllIlIlIIIIlIIIll) {
        this.field_178869_m = llllllllllllIlIlllIlIlIIIIlIIIll;
    }
    
    public void func_178844_b(final long llllllllllllIlIlllIlIlIIIIlIllII) {
        this.field_178868_l = llllllllllllIlIlllIlIlIIIIlIllII;
    }
    
    protected void setGameType(final WorldSettings.GameType llllllllllllIlIlllIlIlIIIlllIIll) {
        this.gameType = llllllllllllIlIlllIlIlIIIlllIIll;
    }
    
    private static void lIlIIIIlIIIlIlII() {
        (lllIIlllllIlIl = new int[2])[0] = ("   ".length() & ~"   ".length());
        NetworkPlayerInfo.lllIIlllllIlIl[1] = " ".length();
    }
    
    public NetworkPlayerInfo(final S38PacketPlayerListItem.AddPlayerData llllllllllllIlIlllIlIlIIlIIIIlII) {
        this.playerTexturesLoaded = (NetworkPlayerInfo.lllIIlllllIlIl[0] != 0);
        this.field_178873_i = NetworkPlayerInfo.lllIIlllllIlIl[0];
        this.field_178870_j = NetworkPlayerInfo.lllIIlllllIlIl[0];
        this.field_178871_k = 0L;
        this.field_178868_l = 0L;
        this.field_178869_m = 0L;
        this.gameProfile = llllllllllllIlIlllIlIlIIlIIIIlII.getProfile();
        this.gameType = llllllllllllIlIlllIlIlIIlIIIIlII.getGameMode();
        this.responseTime = llllllllllllIlIlllIlIlIIlIIIIlII.getPing();
        this.displayName = llllllllllllIlIlllIlIlIIlIIIIlII.getDisplayName();
    }
    
    public WorldSettings.GameType getGameType() {
        return this.gameType;
    }
    
    public void func_178846_a(final long llllllllllllIlIlllIlIlIIIIllIlIl) {
        this.field_178871_k = llllllllllllIlIlllIlIlIIIIllIlIl;
    }
    
    static /* synthetic */ void access$3(final NetworkPlayerInfo llllllllllllIlIlllIlIlIIIIIlIllI, final ResourceLocation llllllllllllIlIlllIlIlIIIIIlIlIl) {
        llllllllllllIlIlllIlIlIIIIIlIllI.locationCape = llllllllllllIlIlllIlIlIIIIIlIlIl;
    }
    
    public ScorePlayerTeam getPlayerTeam() {
        return Minecraft.getMinecraft().theWorld.getScoreboard().getPlayersTeam(this.getGameProfile().getName());
    }
    
    public String getSkinType() {
        String s;
        if (lIlIIIIlIIIlIllI(this.skinType)) {
            s = DefaultPlayerSkin.getSkinType(this.gameProfile.getId());
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            s = this.skinType;
        }
        return s;
    }
    
    public ResourceLocation getLocationSkin() {
        if (lIlIIIIlIIIlIllI(this.locationSkin)) {
            this.loadPlayerTextures();
        }
        return (ResourceLocation)Objects.firstNonNull((Object)this.locationSkin, (Object)DefaultPlayerSkin.getDefaultSkin(this.gameProfile.getId()));
    }
    
    public int getResponseTime() {
        return this.responseTime;
    }
    
    private static boolean lIlIIIIlIIIlIlIl(final Object llllllllllllIlIlllIlIlIIIIIlIIll) {
        return llllllllllllIlIlllIlIlIIIIIlIIll != null;
    }
}
