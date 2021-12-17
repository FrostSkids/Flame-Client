// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Iterator;
import net.minecraft.network.play.server.S1FPacketSetExperience;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.world.demo.DemoWorldManager;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.network.play.server.S09PacketHeldItemChange;
import net.minecraft.network.play.server.S39PacketPlayerAbilities;
import net.minecraft.network.play.server.S05PacketSpawnPosition;
import net.minecraft.network.play.server.S41PacketServerDifficulty;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.NetworkManager;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import net.minecraft.scoreboard.ScoreObjective;
import java.util.Set;
import net.minecraft.network.play.server.S3EPacketTeams;
import net.minecraft.scoreboard.ScorePlayerTeam;
import com.google.common.collect.Sets;
import net.minecraft.scoreboard.ServerScoreboard;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.world.border.IBorderListener;
import java.net.SocketAddress;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import net.minecraft.network.play.server.S44PacketWorldBorder;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S38PacketPlayerListItem;
import net.minecraft.entity.Entity;
import net.minecraft.stats.StatList;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.world.WorldServer;
import com.mojang.authlib.GameProfile;
import net.minecraft.world.storage.IPlayerFileData;
import net.minecraft.stats.StatisticsFile;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldSettings;
import java.util.List;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.UUID;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import java.text.SimpleDateFormat;
import java.io.File;

public abstract class ServerConfigurationManager
{
    private static final /* synthetic */ int[] lllIlllllllllI;
    private final /* synthetic */ UserListOps ops;
    protected /* synthetic */ int maxPlayers;
    public static final /* synthetic */ File FILE_IPBANS;
    private final /* synthetic */ UserListBans bannedPlayers;
    private final /* synthetic */ BanList bannedIPs;
    private static final /* synthetic */ SimpleDateFormat dateFormat;
    private static final /* synthetic */ String[] lllIllllIllIll;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ Map<UUID, EntityPlayerMP> uuidToPlayerMap;
    private final /* synthetic */ List<EntityPlayerMP> playerEntityList;
    private /* synthetic */ int viewDistance;
    private /* synthetic */ boolean commandsAllowedForAll;
    private /* synthetic */ WorldSettings.GameType gameType;
    private /* synthetic */ int playerPingIndex;
    private final /* synthetic */ UserListWhitelist whiteListedPlayers;
    private /* synthetic */ boolean whiteListEnforced;
    private final /* synthetic */ MinecraftServer mcServer;
    public static final /* synthetic */ File FILE_OPS;
    public static final /* synthetic */ File FILE_WHITELIST;
    private final /* synthetic */ Map<UUID, StatisticsFile> playerStatFiles;
    private /* synthetic */ IPlayerFileData playerNBTManagerObj;
    public static final /* synthetic */ File FILE_PLAYERBANS;
    
    private static int lIlIIllIIlllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIllIIlllllII(final int llllllllllllIlIlIlllIlIllIllllII) {
        return llllllllllllIlIlIlllIlIllIllllII < 0;
    }
    
    public void setGameType(final WorldSettings.GameType llllllllllllIlIlIlllIllIIllIllIl) {
        this.gameType = llllllllllllIlIlIlllIllIIllIllIl;
    }
    
    public void addWhitelistedPlayer(final GameProfile llllllllllllIlIlIlllIllIlIlllIII) {
        ((UserList<K, UserListWhitelistEntry>)this.whiteListedPlayers).addEntry(new UserListWhitelistEntry(llllllllllllIlIlIlllIllIlIlllIII));
    }
    
    public String[] getAllUsernames() {
        final String[] llllllllllllIlIlIlllIlllIIllIllI = new String[this.playerEntityList.size()];
        int llllllllllllIlIlIlllIlllIIllIlIl = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIlllIIllIlIl, this.playerEntityList.size())) {
            llllllllllllIlIlIlllIlllIIllIllI[llllllllllllIlIlIlllIlllIIllIlIl] = this.playerEntityList.get(llllllllllllIlIlIlllIlllIIllIlIl).getName();
            ++llllllllllllIlIlIlllIlllIIllIlIl;
        }
        return llllllllllllIlIlIlllIlllIIllIllI;
    }
    
    public void preparePlayer(final EntityPlayerMP llllllllllllIlIlIllllIIIIlIIIlIl, final WorldServer llllllllllllIlIlIllllIIIIlIIIlII) {
        final WorldServer llllllllllllIlIlIllllIIIIlIIIllI = llllllllllllIlIlIllllIIIIlIIIlIl.getServerForPlayer();
        if (lIlIIllIIllIllll(llllllllllllIlIlIllllIIIIlIIIlII)) {
            llllllllllllIlIlIllllIIIIlIIIlII.getPlayerManager().removePlayer(llllllllllllIlIlIllllIIIIlIIIlIl);
        }
        llllllllllllIlIlIllllIIIIlIIIllI.getPlayerManager().addPlayer(llllllllllllIlIlIllllIIIIlIIIlIl);
        llllllllllllIlIlIllllIIIIlIIIllI.theChunkProviderServer.loadChunk((int)llllllllllllIlIlIllllIIIIlIIIlIl.posX >> ServerConfigurationManager.lllIlllllllllI[4], (int)llllllllllllIlIlIllllIIIIlIIIlIl.posZ >> ServerConfigurationManager.lllIlllllllllI[4]);
        "".length();
    }
    
    public int getMaxPlayers() {
        return this.maxPlayers;
    }
    
    private static boolean lIlIIllIIllllIlI(final Object llllllllllllIlIlIlllIlIlllIIllIl, final Object llllllllllllIlIlIlllIlIlllIIllII) {
        return llllllllllllIlIlIlllIlIlllIIllIl != llllllllllllIlIlIlllIlIlllIIllII;
    }
    
    public void sendToAllNear(final double llllllllllllIlIlIlllIllIllllIIII, final double llllllllllllIlIlIlllIllIllllIllI, final double llllllllllllIlIlIlllIllIlllIlllI, final double llllllllllllIlIlIlllIllIllllIlII, final int llllllllllllIlIlIlllIllIlllIllII, final Packet llllllllllllIlIlIlllIllIlllIlIll) {
        this.sendToAllNearExcept(null, llllllllllllIlIlIlllIllIllllIIII, llllllllllllIlIlIlllIllIllllIllI, llllllllllllIlIlIlllIllIlllIlllI, llllllllllllIlIlIlllIllIllllIlII, llllllllllllIlIlIlllIllIlllIllII, llllllllllllIlIlIlllIllIlllIlIll);
    }
    
    public boolean canJoin(final GameProfile llllllllllllIlIlIlllIlllIIIlIIIl) {
        if (lIlIIllIIlllIIlI(this.whiteListEnforced ? 1 : 0) && lIlIIllIIlllIIII(((UserList<GameProfile, V>)this.ops).hasEntry(llllllllllllIlIlIlllIlllIIIlIIIl) ? 1 : 0) && lIlIIllIIlllIIII(((UserList<GameProfile, V>)this.whiteListedPlayers).hasEntry(llllllllllllIlIlIlllIlllIIIlIIIl) ? 1 : 0)) {
            return ServerConfigurationManager.lllIlllllllllI[0] != 0;
        }
        return ServerConfigurationManager.lllIlllllllllI[1] != 0;
    }
    
    public void loadWhiteList() {
    }
    
    public void sendToAllNearExcept(final EntityPlayer llllllllllllIlIlIlllIllIllIIllll, final double llllllllllllIlIlIlllIllIllIllIll, final double llllllllllllIlIlIlllIllIllIllIlI, final double llllllllllllIlIlIlllIllIllIIllII, final double llllllllllllIlIlIlllIllIllIIlIll, final int llllllllllllIlIlIlllIllIllIlIlll, final Packet llllllllllllIlIlIlllIllIllIlIllI) {
        int llllllllllllIlIlIlllIllIllIlIlIl = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIllIllIlIlIl, this.playerEntityList.size())) {
            final EntityPlayerMP llllllllllllIlIlIlllIllIllIlIlII = this.playerEntityList.get(llllllllllllIlIlIlllIllIllIlIlIl);
            if (lIlIIllIIllllIlI(llllllllllllIlIlIlllIllIllIlIlII, llllllllllllIlIlIlllIllIllIIllll) && lIlIIllIIlllIlll(llllllllllllIlIlIlllIllIllIlIlII.dimension, llllllllllllIlIlIlllIllIllIlIlll)) {
                final double llllllllllllIlIlIlllIllIllIlIIll = llllllllllllIlIlIlllIllIllIllIll - llllllllllllIlIlIlllIllIllIlIlII.posX;
                final double llllllllllllIlIlIlllIllIllIlIIlI = llllllllllllIlIlIlllIllIllIllIlI - llllllllllllIlIlIlllIllIllIlIlII.posY;
                final double llllllllllllIlIlIlllIllIllIlIIIl = llllllllllllIlIlIlllIllIllIIllII - llllllllllllIlIlIlllIllIllIlIlII.posZ;
                if (lIlIIllIIlllllII(lIlIIllIIllllIll(llllllllllllIlIlIlllIllIllIlIIll * llllllllllllIlIlIlllIllIllIlIIll + llllllllllllIlIlIlllIllIllIlIIlI * llllllllllllIlIlIlllIllIllIlIIlI + llllllllllllIlIlIlllIllIllIlIIIl * llllllllllllIlIlIlllIllIllIlIIIl, llllllllllllIlIlIlllIllIllIIlIll * llllllllllllIlIlIlllIllIllIIlIll))) {
                    llllllllllllIlIlIlllIllIllIlIlII.playerNetServerHandler.sendPacket(llllllllllllIlIlIlllIllIllIlIllI);
                }
            }
            ++llllllllllllIlIlIlllIllIllIlIlIl;
        }
    }
    
    private static boolean lIlIIllIIllIllll(final Object llllllllllllIlIlIlllIlIlllIIlIlI) {
        return llllllllllllIlIlIlllIlIlllIIlIlI != null;
    }
    
    private void setPlayerGameTypeBasedOnOther(final EntityPlayerMP llllllllllllIlIlIlllIllIIllIIIIl, final EntityPlayerMP llllllllllllIlIlIlllIllIIllIIlII, final World llllllllllllIlIlIlllIllIIllIIIll) {
        if (lIlIIllIIllIllll(llllllllllllIlIlIlllIllIIllIIlII)) {
            llllllllllllIlIlIlllIllIIllIIIIl.theItemInWorldManager.setGameType(llllllllllllIlIlIlllIllIIllIIlII.theItemInWorldManager.getGameType());
            "".length();
            if (((0x51 ^ 0x65) & ~(0x31 ^ 0x5)) != 0x0) {
                return;
            }
        }
        else if (lIlIIllIIllIllll(this.gameType)) {
            llllllllllllIlIlIlllIllIIllIIIIl.theItemInWorldManager.setGameType(this.gameType);
        }
        llllllllllllIlIlIlllIllIIllIIIIl.theItemInWorldManager.initializeGameType(llllllllllllIlIlIlllIllIIllIIIll.getWorldInfo().getGameType());
    }
    
    public boolean func_183023_f(final GameProfile llllllllllllIlIlIlllIllIIIIlIIlI) {
        return ServerConfigurationManager.lllIlllllllllI[0] != 0;
    }
    
    public UserListWhitelist getWhitelistedPlayers() {
        return this.whiteListedPlayers;
    }
    
    public void sendChatMsgImpl(final IChatComponent llllllllllllIlIlIlllIllIIlIIlIIl, final boolean llllllllllllIlIlIlllIllIIlIIllII) {
        this.mcServer.addChatMessage(llllllllllllIlIlIlllIllIIlIIlIIl);
        int n;
        if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllIIlIIllII ? 1 : 0)) {
            n = ServerConfigurationManager.lllIlllllllllI[1];
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        }
        else {
            n = ServerConfigurationManager.lllIlllllllllI[0];
        }
        final byte llllllllllllIlIlIlllIllIIlIIlIll = (byte)n;
        this.sendPacketToAllPlayers(new S02PacketChat(llllllllllllIlIlIlllIllIIlIIlIIl, llllllllllllIlIlIlllIllIIlIIlIll));
    }
    
    private static void lIlIIllIIllIllIl() {
        (lllIlllllllllI = new int[43])[0] = ((0x56 ^ 0xB ^ (0x61 ^ 0x6F)) & (0x64 ^ 0x16 ^ (0xB3 ^ 0x92) ^ -" ".length()));
        ServerConfigurationManager.lllIlllllllllI[1] = " ".length();
        ServerConfigurationManager.lllIlllllllllI[2] = "  ".length();
        ServerConfigurationManager.lllIlllllllllI[3] = "   ".length();
        ServerConfigurationManager.lllIlllllllllI[4] = (0xC0 ^ 0xC4);
        ServerConfigurationManager.lllIlllllllllI[5] = (0x26 ^ 0x7A ^ (0x7A ^ 0x2E));
        ServerConfigurationManager.lllIlllllllllI[6] = (0x5F ^ 0x21 ^ (0xE0 ^ 0x9B));
        ServerConfigurationManager.lllIlllllllllI[7] = (11 + 67 - 59 + 115 ^ 56 + 97 - 63 + 38);
        ServerConfigurationManager.lllIlllllllllI[8] = (0x59 ^ 0x44 ^ (0x77 ^ 0x6D));
        ServerConfigurationManager.lllIlllllllllI[9] = (0x49 ^ 0xF ^ (0x50 ^ 0x1F));
        ServerConfigurationManager.lllIlllllllllI[10] = (0x33 ^ 0x39);
        ServerConfigurationManager.lllIlllllllllI[11] = (0x5F ^ 0x54);
        ServerConfigurationManager.lllIlllllllllI[12] = (0x6E ^ 0x44 ^ (0x6C ^ 0x4A));
        ServerConfigurationManager.lllIlllllllllI[13] = (0x9E ^ 0x8B ^ (0x98 ^ 0x80));
        ServerConfigurationManager.lllIlllllllllI[14] = (0x66 ^ 0x68);
        ServerConfigurationManager.lllIlllllllllI[15] = (0x57 ^ 0x58);
        ServerConfigurationManager.lllIlllllllllI[16] = (156 + 121 - 121 + 1 ^ 5 + 66 + 21 + 49);
        ServerConfigurationManager.lllIlllllllllI[17] = (0x27 ^ 0x1A ^ (0x4C ^ 0x60));
        ServerConfigurationManager.lllIlllllllllI[18] = (0x1 ^ 0x12);
        ServerConfigurationManager.lllIlllllllllI[19] = (32 + 61 + 17 + 20 ^ 88 + 65 - 20 + 11);
        ServerConfigurationManager.lllIlllllllllI[20] = (0x5B ^ 0x4F);
        ServerConfigurationManager.lllIlllllllllI[21] = (0xBC ^ 0xA9);
        ServerConfigurationManager.lllIlllllllllI[22] = (111 + 163 - 145 + 42 ^ 78 + 163 - 131 + 79);
        ServerConfigurationManager.lllIlllllllllI[23] = (0x70 ^ 0x67);
        ServerConfigurationManager.lllIlllllllllI[24] = (0x69 ^ 0x71);
        ServerConfigurationManager.lllIlllllllllI[25] = (0x7A ^ 0x63);
        ServerConfigurationManager.lllIlllllllllI[26] = (0x5D ^ 0x7C ^ (0xB ^ 0x30));
        ServerConfigurationManager.lllIlllllllllI[27] = (0xD9 ^ 0xC2);
        ServerConfigurationManager.lllIlllllllllI[28] = -" ".length();
        ServerConfigurationManager.lllIlllllllllI[29] = (0xC0 ^ 0x8C ^ (0x74 ^ 0x24));
        ServerConfigurationManager.lllIlllllllllI[30] = -(0xFFFFDF05 & 0x1C9E3FA);
        ServerConfigurationManager.lllIlllllllllI[31] = (-(0xFFFFF5BB & 0x3E7F) & (0xFFFFF73A & 0x1C9FFFF));
        ServerConfigurationManager.lllIlllllllllI[32] = (0xFFFFA77D & 0x5ADA);
        ServerConfigurationManager.lllIlllllllllI[33] = (0x81 ^ 0x9C);
        ServerConfigurationManager.lllIlllllllllI[34] = (0x24 ^ 0x3A);
        ServerConfigurationManager.lllIlllllllllI[35] = (0xC5 ^ 0x8F ^ (0x27 ^ 0x72));
        ServerConfigurationManager.lllIlllllllllI[36] = (0xA9 ^ 0x89);
        ServerConfigurationManager.lllIlllllllllI[37] = (37 + 87 - 73 + 106 ^ 4 + 172 - 106 + 118);
        ServerConfigurationManager.lllIlllllllllI[38] = (0x3B ^ 0x19);
        ServerConfigurationManager.lllIlllllllllI[39] = (0xA9 ^ 0x8A);
        ServerConfigurationManager.lllIlllllllllI[40] = (0x37 ^ 0x54 ^ (0x34 ^ 0x73));
        ServerConfigurationManager.lllIlllllllllI[41] = (0x16 ^ 0x33);
        ServerConfigurationManager.lllIlllllllllI[42] = (0xAD ^ 0x8B);
    }
    
    public ServerConfigurationManager(final MinecraftServer llllllllllllIlIlIllllIIIlIIllIlI) {
        this.playerEntityList = (List<EntityPlayerMP>)Lists.newArrayList();
        this.uuidToPlayerMap = (Map<UUID, EntityPlayerMP>)Maps.newHashMap();
        this.bannedPlayers = new UserListBans(ServerConfigurationManager.FILE_PLAYERBANS);
        this.bannedIPs = new BanList(ServerConfigurationManager.FILE_IPBANS);
        this.ops = new UserListOps(ServerConfigurationManager.FILE_OPS);
        this.whiteListedPlayers = new UserListWhitelist(ServerConfigurationManager.FILE_WHITELIST);
        this.playerStatFiles = (Map<UUID, StatisticsFile>)Maps.newHashMap();
        this.mcServer = llllllllllllIlIlIllllIIIlIIllIlI;
        this.bannedPlayers.setLanServer((boolean)(ServerConfigurationManager.lllIlllllllllI[0] != 0));
        this.bannedIPs.setLanServer((boolean)(ServerConfigurationManager.lllIlllllllllI[0] != 0));
        this.maxPlayers = ServerConfigurationManager.lllIlllllllllI[5];
    }
    
    private static boolean lIlIIllIIlllIlII(final Object llllllllllllIlIlIlllIlIlllIIIlll, final Object llllllllllllIlIlIlllIlIlllIIIllI) {
        return llllllllllllIlIlIlllIlIlllIIIlll == llllllllllllIlIlIlllIlIlllIIIllI;
    }
    
    public MinecraftServer getServerInstance() {
        return this.mcServer;
    }
    
    private static boolean lIlIIllIIlllIIll(final int llllllllllllIlIlIlllIlIlllIllIIl, final int llllllllllllIlIlIlllIlIlllIllIII) {
        return llllllllllllIlIlIlllIlIlllIllIIl >= llllllllllllIlIlIlllIlIlllIllIII;
    }
    
    private static String lIlIIllIIIIlllll(String llllllllllllIlIlIlllIllIIIIIIIlI, final String llllllllllllIlIlIlllIllIIIIIIIIl) {
        llllllllllllIlIlIlllIllIIIIIIIlI = new String(Base64.getDecoder().decode(llllllllllllIlIlIlllIllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlIlllIllIIIIIIlIl = new StringBuilder();
        final char[] llllllllllllIlIlIlllIllIIIIIIlII = llllllllllllIlIlIlllIllIIIIIIIIl.toCharArray();
        int llllllllllllIlIlIlllIllIIIIIIIll = ServerConfigurationManager.lllIlllllllllI[0];
        final byte llllllllllllIlIlIlllIlIlllllllIl = (Object)llllllllllllIlIlIlllIllIIIIIIIlI.toCharArray();
        final char llllllllllllIlIlIlllIlIlllllllII = (char)llllllllllllIlIlIlllIlIlllllllIl.length;
        float llllllllllllIlIlIlllIlIllllllIll = ServerConfigurationManager.lllIlllllllllI[0];
        while (lIlIIllIIlllllIl((int)llllllllllllIlIlIlllIlIllllllIll, llllllllllllIlIlIlllIlIlllllllII)) {
            final char llllllllllllIlIlIlllIllIIIIIlIII = llllllllllllIlIlIlllIlIlllllllIl[llllllllllllIlIlIlllIlIllllllIll];
            llllllllllllIlIlIlllIllIIIIIIlIl.append((char)(llllllllllllIlIlIlllIllIIIIIlIII ^ llllllllllllIlIlIlllIllIIIIIIlII[llllllllllllIlIlIlllIllIIIIIIIll % llllllllllllIlIlIlllIllIIIIIIlII.length]));
            "".length();
            ++llllllllllllIlIlIlllIllIIIIIIIll;
            ++llllllllllllIlIlIlllIlIllllllIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlIlllIllIIIIIIlIl);
    }
    
    public void removePlayerFromWhitelist(final GameProfile llllllllllllIlIlIlllIllIlIllIIlI) {
        ((UserList<GameProfile, V>)this.whiteListedPlayers).removeEntry(llllllllllllIlIlIlllIllIlIllIIlI);
    }
    
    private static int lIlIIllIIllllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIllIIllllIIl(final int llllllllllllIlIlIlllIlIlllIlIIIl, final int llllllllllllIlIlIlllIlIlllIlIIII) {
        return llllllllllllIlIlIlllIlIlllIlIIIl > llllllllllllIlIlIlllIlIlllIlIIII;
    }
    
    public boolean canSendCommands(final GameProfile llllllllllllIlIlIlllIlllIIIIlIll) {
        if (lIlIIllIIlllIIII(((UserList<GameProfile, V>)this.ops).hasEntry(llllllllllllIlIlIlllIlllIIIIlIll) ? 1 : 0) && (!lIlIIllIIlllIIlI(this.mcServer.isSinglePlayer() ? 1 : 0) || !lIlIIllIIlllIIlI(this.mcServer.worldServers[ServerConfigurationManager.lllIlllllllllI[0]].getWorldInfo().areCommandsAllowed() ? 1 : 0) || lIlIIllIIlllIIII(this.mcServer.getServerOwner().equalsIgnoreCase(llllllllllllIlIlIlllIlllIIIIlIll.getName()) ? 1 : 0)) && lIlIIllIIlllIIII(this.commandsAllowedForAll ? 1 : 0)) {
            return ServerConfigurationManager.lllIlllllllllI[0] != 0;
        }
        return ServerConfigurationManager.lllIlllllllllI[1] != 0;
    }
    
    public void serverUpdateMountedMovingPlayer(final EntityPlayerMP llllllllllllIlIlIllllIIIIIIllIII) {
        llllllllllllIlIlIllllIIIIIIllIII.getServerForPlayer().getPlayerManager().updateMountedMovingPlayer(llllllllllllIlIlIllllIIIIIIllIII);
    }
    
    public void playerLoggedOut(final EntityPlayerMP llllllllllllIlIlIllllIIIIIIIlIll) {
        llllllllllllIlIlIllllIIIIIIIlIll.triggerAchievement(StatList.leaveGameStat);
        this.writePlayerData(llllllllllllIlIlIllllIIIIIIIlIll);
        final WorldServer llllllllllllIlIlIllllIIIIIIIllll = llllllllllllIlIlIllllIIIIIIIlIll.getServerForPlayer();
        if (lIlIIllIIllIllll(llllllllllllIlIlIllllIIIIIIIlIll.ridingEntity)) {
            llllllllllllIlIlIllllIIIIIIIllll.removePlayerEntityDangerously(llllllllllllIlIlIllllIIIIIIIlIll.ridingEntity);
            ServerConfigurationManager.logger.debug(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[18]]);
        }
        llllllllllllIlIlIllllIIIIIIIllll.removeEntity(llllllllllllIlIlIllllIIIIIIIlIll);
        llllllllllllIlIlIllllIIIIIIIllll.getPlayerManager().removePlayer(llllllllllllIlIlIllllIIIIIIIlIll);
        this.playerEntityList.remove(llllllllllllIlIlIllllIIIIIIIlIll);
        "".length();
        final UUID llllllllllllIlIlIllllIIIIIIIlllI = llllllllllllIlIlIllllIIIIIIIlIll.getUniqueID();
        final EntityPlayerMP llllllllllllIlIlIllllIIIIIIIllIl = this.uuidToPlayerMap.get(llllllllllllIlIlIllllIIIIIIIlllI);
        if (lIlIIllIIlllIlII(llllllllllllIlIlIllllIIIIIIIllIl, llllllllllllIlIlIllllIIIIIIIlIll)) {
            this.uuidToPlayerMap.remove(llllllllllllIlIlIllllIIIIIIIlllI);
            "".length();
            this.playerStatFiles.remove(llllllllllllIlIlIllllIIIIIIIlllI);
            "".length();
        }
        final S38PacketPlayerListItem.Action remove_PLAYER = S38PacketPlayerListItem.Action.REMOVE_PLAYER;
        final EntityPlayerMP[] llllllllllllIllIIIIIIllIIllllIIl = new EntityPlayerMP[ServerConfigurationManager.lllIlllllllllI[1]];
        llllllllllllIllIIIIIIllIIllllIIl[ServerConfigurationManager.lllIlllllllllI[0]] = llllllllllllIlIlIllllIIIIIIIlIll;
        this.sendPacketToAllPlayers(new S38PacketPlayerListItem(remove_PLAYER, llllllllllllIllIIIIIIllIIllllIIl));
    }
    
    private static boolean lIlIIllIIlllllIl(final int llllllllllllIlIlIlllIlIlllIlIlIl, final int llllllllllllIlIlIlllIlIlllIlIlII) {
        return llllllllllllIlIlIlllIlIlllIlIlIl < llllllllllllIlIlIlllIlIlllIlIlII;
    }
    
    public void sendPacketToAllPlayers(final Packet llllllllllllIlIlIlllIllllIIIIIII) {
        int llllllllllllIlIlIlllIllllIIIIIlI = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if ("  ".length() == " ".length()) {
            return;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIllllIIIIIlI, this.playerEntityList.size())) {
            this.playerEntityList.get(llllllllllllIlIlIlllIllllIIIIIlI).playerNetServerHandler.sendPacket(llllllllllllIlIlIlllIllllIIIIIII);
            ++llllllllllllIlIlIlllIllllIIIIIlI;
        }
    }
    
    public void removeOp(final GameProfile llllllllllllIlIlIlllIlllIIIlIlll) {
        ((UserList<GameProfile, V>)this.ops).removeEntry(llllllllllllIlIlIlllIlllIIIlIlll);
    }
    
    public NBTTagCompound getHostPlayerData() {
        return null;
    }
    
    public void transferEntityToWorld(final Entity llllllllllllIlIlIlllIllllIIlllIl, final int llllllllllllIlIlIlllIllllIIlllII, final WorldServer llllllllllllIlIlIlllIllllIIlIIIl, final WorldServer llllllllllllIlIlIlllIllllIIlIIII) {
        double llllllllllllIlIlIlllIllllIIllIIl = llllllllllllIlIlIlllIllllIIlllIl.posX;
        double llllllllllllIlIlIlllIllllIIllIII = llllllllllllIlIlIlllIllllIIlllIl.posZ;
        final double llllllllllllIlIlIlllIllllIIlIlll = 8.0;
        final float llllllllllllIlIlIlllIllllIIlIllI = llllllllllllIlIlIlllIllllIIlllIl.rotationYaw;
        llllllllllllIlIlIlllIllllIIlIIIl.theProfiler.startSection(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[27]]);
        if (lIlIIllIIlllIlll(llllllllllllIlIlIlllIllllIIlllIl.dimension, ServerConfigurationManager.lllIlllllllllI[28])) {
            llllllllllllIlIlIlllIllllIIllIIl = MathHelper.clamp_double(llllllllllllIlIlIlllIllllIIllIIl / llllllllllllIlIlIlllIllllIIlIlll, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().minX() + 16.0, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().maxX() - 16.0);
            llllllllllllIlIlIlllIllllIIllIII = MathHelper.clamp_double(llllllllllllIlIlIlllIllllIIllIII / llllllllllllIlIlIlllIllllIIlIlll, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().minZ() + 16.0, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().maxZ() - 16.0);
            llllllllllllIlIlIlllIllllIIlllIl.setLocationAndAngles(llllllllllllIlIlIlllIllllIIllIIl, llllllllllllIlIlIlllIllllIIlllIl.posY, llllllllllllIlIlIlllIllllIIllIII, llllllllllllIlIlIlllIllllIIlllIl.rotationYaw, llllllllllllIlIlIlllIllllIIlllIl.rotationPitch);
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllllIIlllIl.isEntityAlive() ? 1 : 0)) {
                llllllllllllIlIlIlllIllllIIlIIIl.updateEntityWithOptionalForce(llllllllllllIlIlIlllIllllIIlllIl, (boolean)(ServerConfigurationManager.lllIlllllllllI[0] != 0));
                "".length();
                if ("  ".length() > (0xAB ^ 0xAF)) {
                    return;
                }
            }
        }
        else if (lIlIIllIIlllIIII(llllllllllllIlIlIlllIllllIIlllIl.dimension)) {
            llllllllllllIlIlIlllIllllIIllIIl = MathHelper.clamp_double(llllllllllllIlIlIlllIllllIIllIIl * llllllllllllIlIlIlllIllllIIlIlll, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().minX() + 16.0, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().maxX() - 16.0);
            llllllllllllIlIlIlllIllllIIllIII = MathHelper.clamp_double(llllllllllllIlIlIlllIllllIIllIII * llllllllllllIlIlIlllIllllIIlIlll, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().minZ() + 16.0, llllllllllllIlIlIlllIllllIIlIIII.getWorldBorder().maxZ() - 16.0);
            llllllllllllIlIlIlllIllllIIlllIl.setLocationAndAngles(llllllllllllIlIlIlllIllllIIllIIl, llllllllllllIlIlIlllIllllIIlllIl.posY, llllllllllllIlIlIlllIllllIIllIII, llllllllllllIlIlIlllIllllIIlllIl.rotationYaw, llllllllllllIlIlIlllIllllIIlllIl.rotationPitch);
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllllIIlllIl.isEntityAlive() ? 1 : 0)) {
                llllllllllllIlIlIlllIllllIIlIIIl.updateEntityWithOptionalForce(llllllllllllIlIlIlllIllllIIlllIl, (boolean)(ServerConfigurationManager.lllIlllllllllI[0] != 0));
                "".length();
                if (((0x4F ^ 0x15 ^ (0x52 ^ 0x5E)) & (168 + 48 - 47 + 61 ^ 157 + 137 - 284 + 166 ^ -" ".length())) >= "  ".length()) {
                    return;
                }
            }
        }
        else {
            BlockPos llllllllllllIlIlIlllIllllIIlIlII = null;
            if (lIlIIllIIlllIlll(llllllllllllIlIlIlllIllllIIlllII, ServerConfigurationManager.lllIlllllllllI[1])) {
                final BlockPos llllllllllllIlIlIlllIllllIIlIlIl = llllllllllllIlIlIlllIllllIIlIIII.getSpawnPoint();
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else {
                llllllllllllIlIlIlllIllllIIlIlII = llllllllllllIlIlIlllIllllIIlIIII.getSpawnCoordinate();
            }
            llllllllllllIlIlIlllIllllIIllIIl = llllllllllllIlIlIlllIllllIIlIlII.getX();
            llllllllllllIlIlIlllIllllIIlllIl.posY = llllllllllllIlIlIlllIllllIIlIlII.getY();
            llllllllllllIlIlIlllIllllIIllIII = llllllllllllIlIlIlllIllllIIlIlII.getZ();
            llllllllllllIlIlIlllIllllIIlllIl.setLocationAndAngles(llllllllllllIlIlIlllIllllIIllIIl, llllllllllllIlIlIlllIllllIIlllIl.posY, llllllllllllIlIlIlllIllllIIllIII, 90.0f, 0.0f);
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllllIIlllIl.isEntityAlive() ? 1 : 0)) {
                llllllllllllIlIlIlllIllllIIlIIIl.updateEntityWithOptionalForce(llllllllllllIlIlIlllIllllIIlllIl, (boolean)(ServerConfigurationManager.lllIlllllllllI[0] != 0));
            }
        }
        llllllllllllIlIlIlllIllllIIlIIIl.theProfiler.endSection();
        if (lIlIIllIIllllIII(llllllllllllIlIlIlllIllllIIlllII, ServerConfigurationManager.lllIlllllllllI[1])) {
            llllllllllllIlIlIlllIllllIIlIIIl.theProfiler.startSection(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[29]]);
            llllllllllllIlIlIlllIllllIIllIIl = MathHelper.clamp_int((int)llllllllllllIlIlIlllIllllIIllIIl, ServerConfigurationManager.lllIlllllllllI[30], ServerConfigurationManager.lllIlllllllllI[31]);
            llllllllllllIlIlIlllIllllIIllIII = MathHelper.clamp_int((int)llllllllllllIlIlIlllIllllIIllIII, ServerConfigurationManager.lllIlllllllllI[30], ServerConfigurationManager.lllIlllllllllI[31]);
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllllIIlllIl.isEntityAlive() ? 1 : 0)) {
                llllllllllllIlIlIlllIllllIIlllIl.setLocationAndAngles(llllllllllllIlIlIlllIllllIIllIIl, llllllllllllIlIlIlllIllllIIlllIl.posY, llllllllllllIlIlIlllIllllIIllIII, llllllllllllIlIlIlllIllllIIlllIl.rotationYaw, llllllllllllIlIlIlllIllllIIlllIl.rotationPitch);
                llllllllllllIlIlIlllIllllIIlIIII.getDefaultTeleporter().placeInPortal(llllllllllllIlIlIlllIllllIIlllIl, llllllllllllIlIlIlllIllllIIlIllI);
                llllllllllllIlIlIlllIllllIIlIIII.spawnEntityInWorld(llllllllllllIlIlIlllIllllIIlllIl);
                "".length();
                llllllllllllIlIlIlllIllllIIlIIII.updateEntityWithOptionalForce(llllllllllllIlIlIlllIllllIIlllIl, (boolean)(ServerConfigurationManager.lllIlllllllllI[0] != 0));
            }
            llllllllllllIlIlIlllIllllIIlIIIl.theProfiler.endSection();
        }
        llllllllllllIlIlIlllIllllIIlllIl.setWorld(llllllllllllIlIlIlllIllllIIlIIII);
    }
    
    public void setViewDistance(final int llllllllllllIlIlIlllIllIIIlIIlII) {
        this.viewDistance = llllllllllllIlIlIlllIllIIIlIIlII;
        if (lIlIIllIIllIllll(this.mcServer.worldServers)) {
            final byte llllllllllllIlIlIlllIllIIIIlllIl;
            final int llllllllllllIlIlIlllIllIIIIllllI = ((WorldServer[])(Object)(llllllllllllIlIlIlllIllIIIIlllIl = (byte)(Object)this.mcServer.worldServers)).length;
            String llllllllllllIlIlIlllIllIIIIlllll = (String)ServerConfigurationManager.lllIlllllllllI[0];
            "".length();
            if (((0x6E ^ 0x79) & ~(0xA2 ^ 0xB5)) < 0) {
                return;
            }
            while (!lIlIIllIIlllIIll((int)llllllllllllIlIlIlllIllIIIIlllll, llllllllllllIlIlIlllIllIIIIllllI)) {
                final WorldServer llllllllllllIlIlIlllIllIIIlIIIll = llllllllllllIlIlIlllIllIIIIlllIl[llllllllllllIlIlIlllIllIIIIlllll];
                if (lIlIIllIIllIllll(llllllllllllIlIlIlllIllIIIlIIIll)) {
                    llllllllllllIlIlIlllIllIIIlIIIll.getPlayerManager().setPlayerViewRadius(llllllllllllIlIlIlllIllIIIlIIlII);
                }
                ++llllllllllllIlIlIlllIllIIIIlllll;
            }
        }
    }
    
    public String func_181058_b(final boolean llllllllllllIlIlIlllIlllIIlllllI) {
        String llllllllllllIlIlIlllIlllIlIIIIlI = ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[33]];
        final List<EntityPlayerMP> llllllllllllIlIlIlllIlllIlIIIIIl = (List<EntityPlayerMP>)Lists.newArrayList((Iterable)this.playerEntityList);
        int llllllllllllIlIlIlllIlllIlIIIIII = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (-"   ".length() >= 0) {
            return null;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIlllIlIIIIII, llllllllllllIlIlIlllIlllIlIIIIIl.size())) {
            if (lIlIIllIIlllIIIl(llllllllllllIlIlIlllIlllIlIIIIII)) {
                llllllllllllIlIlIlllIlllIlIIIIlI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIlllIlllIlIIIIlI)).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[34]]));
            }
            llllllllllllIlIlIlllIlllIlIIIIlI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIlllIlllIlIIIIlI)).append(llllllllllllIlIlIlllIlllIlIIIIIl.get(llllllllllllIlIlIlllIlllIlIIIIII).getName()));
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIlllIIlllllI ? 1 : 0)) {
                llllllllllllIlIlIlllIlllIlIIIIlI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIlllIlllIlIIIIlI)).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[35]]).append(llllllllllllIlIlIlllIlllIlIIIIIl.get(llllllllllllIlIlIlllIlllIlIIIIII).getUniqueID().toString()).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[36]]));
            }
            ++llllllllllllIlIlIlllIlllIlIIIIII;
        }
        return llllllllllllIlIlIlllIlllIlIIIIlI;
    }
    
    private static boolean lIlIIllIIlllIIII(final int llllllllllllIlIlIlllIlIlllIIIIII) {
        return llllllllllllIlIlIlllIlIlllIIIIII == 0;
    }
    
    public void onTick() {
        final int n = this.playerPingIndex + ServerConfigurationManager.lllIlllllllllI[1];
        this.playerPingIndex = n;
        if (lIlIIllIIllllIIl(n, ServerConfigurationManager.lllIlllllllllI[32])) {
            this.sendPacketToAllPlayers(new S38PacketPlayerListItem(S38PacketPlayerListItem.Action.UPDATE_LATENCY, this.playerEntityList));
            this.playerPingIndex = ServerConfigurationManager.lllIlllllllllI[0];
        }
    }
    
    public void addOp(final GameProfile llllllllllllIlIlIlllIlllIIIlllIl) {
        ((UserList<K, UserListOpsEntry>)this.ops).addEntry(new UserListOpsEntry(llllllllllllIlIlIlllIlllIIIlllIl, this.mcServer.getOpPermissionLevel(), this.ops.func_183026_b(llllllllllllIlIlIlllIlllIIIlllIl)));
    }
    
    public void sendPacketToAllPlayersInDimension(final Packet llllllllllllIlIlIlllIlllIllllIII, final int llllllllllllIlIlIlllIlllIlllIlll) {
        int llllllllllllIlIlIlllIlllIlllIllI = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (" ".length() < ((0x59 ^ 0x35 ^ (0x34 ^ 0x1B)) & (0x6B ^ 0x1 ^ (0xBD ^ 0x94) ^ -" ".length()))) {
            return;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIlllIlllIllI, this.playerEntityList.size())) {
            final EntityPlayerMP llllllllllllIlIlIlllIlllIlllIlIl = this.playerEntityList.get(llllllllllllIlIlIlllIlllIlllIllI);
            if (lIlIIllIIlllIlll(llllllllllllIlIlIlllIlllIlllIlIl.dimension, llllllllllllIlIlIlllIlllIlllIlll)) {
                llllllllllllIlIlIlllIlllIlllIlIl.playerNetServerHandler.sendPacket(llllllllllllIlIlIlllIlllIllllIII);
            }
            ++llllllllllllIlIlIlllIlllIlllIllI;
        }
    }
    
    public int getCurrentPlayerCount() {
        return this.playerEntityList.size();
    }
    
    public void sendMessageToAllTeamMembers(final EntityPlayer llllllllllllIlIlIlllIlllIllIIlll, final IChatComponent llllllllllllIlIlIlllIlllIllIIIII) {
        final Team llllllllllllIlIlIlllIlllIllIIlIl = llllllllllllIlIlIlllIlllIllIIlll.getTeam();
        if (lIlIIllIIllIllll(llllllllllllIlIlIlllIlllIllIIlIl)) {
            final short llllllllllllIlIlIlllIlllIlIlllIl = (short)llllllllllllIlIlIlllIlllIllIIlIl.getMembershipCollection().iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIlllIlllIlIlllIl).hasNext() ? 1 : 0)) {
                final String llllllllllllIlIlIlllIlllIllIIlII = ((Iterator<String>)llllllllllllIlIlIlllIlllIlIlllIl).next();
                final EntityPlayerMP llllllllllllIlIlIlllIlllIllIIIll = this.getPlayerByUsername(llllllllllllIlIlIlllIlllIllIIlII);
                if (lIlIIllIIllIllll(llllllllllllIlIlIlllIlllIllIIIll) && lIlIIllIIllllIlI(llllllllllllIlIlIlllIlllIllIIIll, llllllllllllIlIlIlllIlllIllIIlll)) {
                    llllllllllllIlIlIlllIlllIllIIIll.addChatMessage(llllllllllllIlIlIlllIlllIllIIIII);
                }
            }
        }
    }
    
    private static boolean lIlIIllIIlllIllI(final int llllllllllllIlIlIlllIlIllIlllllI) {
        return llllllllllllIlIlIlllIlIllIlllllI >= 0;
    }
    
    private static boolean lIlIIllIIlllIIlI(final int llllllllllllIlIlIlllIlIlllIIIIlI) {
        return llllllllllllIlIlIlllIlIlllIIIIlI != 0;
    }
    
    public void playerLoggedIn(final EntityPlayerMP llllllllllllIlIlIllllIIIIIIllllI) {
        this.playerEntityList.add(llllllllllllIlIlIllllIIIIIIllllI);
        "".length();
        this.uuidToPlayerMap.put(llllllllllllIlIlIllllIIIIIIllllI.getUniqueID(), llllllllllllIlIlIllllIIIIIIllllI);
        "".length();
        final S38PacketPlayerListItem.Action add_PLAYER = S38PacketPlayerListItem.Action.ADD_PLAYER;
        final EntityPlayerMP[] llllllllllllIllIIIIIIllIIllllIIl = new EntityPlayerMP[ServerConfigurationManager.lllIlllllllllI[1]];
        llllllllllllIllIIIIIIllIIllllIIl[ServerConfigurationManager.lllIlllllllllI[0]] = llllllllllllIlIlIllllIIIIIIllllI;
        this.sendPacketToAllPlayers(new S38PacketPlayerListItem(add_PLAYER, llllllllllllIllIIIIIIllIIllllIIl));
        final WorldServer llllllllllllIlIlIllllIIIIIlIIIlI = this.mcServer.worldServerForDimension(llllllllllllIlIlIllllIIIIIIllllI.dimension);
        llllllllllllIlIlIllllIIIIIlIIIlI.spawnEntityInWorld(llllllllllllIlIlIllllIIIIIIllllI);
        "".length();
        this.preparePlayer(llllllllllllIlIlIllllIIIIIIllllI, null);
        int llllllllllllIlIlIllllIIIIIlIIIIl = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (" ".length() <= ((0xB2 ^ 0x9E) & ~(0x33 ^ 0x1F))) {
            return;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIllllIIIIIlIIIIl, this.playerEntityList.size())) {
            final EntityPlayerMP llllllllllllIlIlIllllIIIIIlIIIII = this.playerEntityList.get(llllllllllllIlIlIllllIIIIIlIIIIl);
            final NetHandlerPlayServer playerNetServerHandler = llllllllllllIlIlIllllIIIIIIllllI.playerNetServerHandler;
            final S38PacketPlayerListItem.Action add_PLAYER2 = S38PacketPlayerListItem.Action.ADD_PLAYER;
            final EntityPlayerMP[] llllllllllllIllIIIIIIllIIllllIIl2 = new EntityPlayerMP[ServerConfigurationManager.lllIlllllllllI[1]];
            llllllllllllIllIIIIIIllIIllllIIl2[ServerConfigurationManager.lllIlllllllllI[0]] = llllllllllllIlIlIllllIIIIIlIIIII;
            playerNetServerHandler.sendPacket(new S38PacketPlayerListItem(add_PLAYER2, llllllllllllIllIIIIIIllIIllllIIl2));
            ++llllllllllllIlIlIllllIIIIIlIIIIl;
        }
    }
    
    private static boolean lIlIIllIIlllIlll(final int llllllllllllIlIlIlllIlIlllIlllIl, final int llllllllllllIlIlIlllIlIlllIlllII) {
        return llllllllllllIlIlIlllIlIlllIlllIl == llllllllllllIlIlIlllIlIlllIlllII;
    }
    
    private static void lIlIIllIIIlllIIl() {
        (lllIllllIllIll = new String[ServerConfigurationManager.lllIlllllllllI[42]])[ServerConfigurationManager.lllIlllllllllI[0]] = lIlIIllIIIIlllll("KC0gAwouYT4BDjMpPB5BID8hAw==", "JLNmo");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[1]] = lIlIIllIIIlIIIII("JJCeOKeUgvju3HtKqkkJ4A==", "zTqbE");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[2]] = lIlIIllIIIIlllll("Jhk1ah46Big=", "IiFDt");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[3]] = lIlIIllIIIIlllll("LS4cFRI2LwYVWTA1Gg8=", "ZFuaw");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[4]] = lIlIIllIIIlIIIlI("aXFRS5qRBuHigRXgQ7oCa1CBN8h6aiLHUu5keitqjHQ=", "gkJKg");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[6]] = lIlIIllIIIIlllll("Jx8LNy0=", "KphVA");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[7]] = lIlIIllIIIlIIIII("fMqZis6VCHE=", "NgINs");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[8]] = lIlIIllIIIIlllll("FWwcKwAvKRRkDiZsBy0TIGwVKhMhOAlkDixs", "HLpDg");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[5]] = lIlIIllIIIlIIIlI("CGEHrw61Qvg=", "vpyxZ");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[9]] = lIlIIllIIIIlllll("W3U=", "wUqwk");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[10]] = lIlIIllIIIlIIIII("PG78vAx7OhQ=", "VNxDW");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[11]] = lIlIIllIIIlIIIlI("xpJKOA+T6Oo=", "DZuTC");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[12]] = lIlIIllIIIlIIIII("M4mzDj66PC5HJ2Y0fBk6g1NzELc4INXN", "wdier");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[13]] = lIlIIllIIIIlllll("OTc7MBsVGiM=", "ttGri");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[14]] = lIlIIllIIIIlllll("FCIYBz4JOxUKMgt5BB82ADIGXT0WPhoWM1clER02FDIQ", "yWtsW");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[15]] = lIlIIllIIIlIIIII("H1n5KOg9pq7BGsaxycryBw4v1lpaCrCyHeDin7mBS1k=", "NLefk");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[16]] = lIlIIllIIIlIIIlI("/8eUmiK9Ahc=", "lWItl");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[17]] = lIlIIllIIIlIIIlI("smL1KuNtLAs=", "sLGVq");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[19]] = lIlIIllIIIlIIIII("qeVb09V4KpAlDYirMecFBny3+kBRYF44", "LMfRl");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[18]] = lIlIIllIIIIlllll("ASg9JzAaIzdoNh8sKS00UyA/PSgH", "sMPHF");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[20]] = lIlIIllIIIlIIIlI("NEKbnOJj19UR2kBZkVSMR11q61lUnSOxf6J/UVNUaw+ixuz8ZtJ5NsNAb42Jsvtx", "dmJPo");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[21]] = lIlIIllIIIlIIIlI("sCwJHdRSYmKgpqlKr5lgZ7PahovTa+T/9hIKVPjQoIY=", "SutDr");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[22]] = lIlIIllIIIlIIIII("VZ2mK9MqMof8NFtNVbCuYz1AroO3L3iTlSzc+cPXVQT+msCKlmp4pIky57r/TgMy", "eFjCn");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[23]] = lIlIIllIIIIlllll("HSo3GXkNFWIKPSA3JxgqZCwxSzslKywOPWQjMAQ0ZDEqAipkNicZLyE3Y2ELISQxBDd+ZQ==", "DEBkY");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[24]] = lIlIIllIIIlIIIlI("sNCXqeqYgTDAi4s1GNLHGWYMdzupmpDDGbI89+SctMU=", "wzPlX");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[25]] = lIlIIllIIIIlllll("NzwNbicGJh4rJkM9G24yFjgEbw==", "cThNT");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[26]] = lIlIIllIIIIlllll("Ejc8SSUkPy4MLWsxJ0kvOTckSSglNz0BLDl4JQYqKiwgBic=", "KXIiI");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[27]] = lIlIIllIIIIlllll("NBoePDo+", "YuhUT");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[29]] = lIlIIllIIIIlllll("OQkQJAQnAg==", "IeqGm");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[33]] = lIlIIllIIIIlllll("", "pFISw");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[34]] = lIlIIllIIIlIIIlI("9cTVgkl7+5o=", "ecjSD");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[35]] = lIlIIllIIIIlllll("c2o=", "SBMqO");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[36]] = lIlIIllIIIIlllll("bg==", "GxPNL");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[37]] = lIlIIllIIIIlllll("MiABFhs6JiIfFhU2JhsH", "VOEwb");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[38]] = lIlIIllIIIlIIIlI("FEYT9sVa9/SeHx9tXm7Rew==", "OtSjb");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[39]] = lIlIIllIIIIlllll("BCQOEAo=", "wPody");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[40]] = lIlIIllIIIlIIIII("0XwyKehlcgs=", "HrjWu");
        ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[41]] = lIlIIllIIIlIIIII("u/RNtOW44sM=", "tiYFH");
    }
    
    public void updateTimeAndWeatherForPlayer(final EntityPlayerMP llllllllllllIlIlIlllIllIlIIllIll, final WorldServer llllllllllllIlIlIlllIllIlIIllIlI) {
        final WorldBorder llllllllllllIlIlIlllIllIlIIlllIl = this.mcServer.worldServers[ServerConfigurationManager.lllIlllllllllI[0]].getWorldBorder();
        llllllllllllIlIlIlllIllIlIIllIll.playerNetServerHandler.sendPacket(new S44PacketWorldBorder(llllllllllllIlIlIlllIllIlIIlllIl, S44PacketWorldBorder.Action.INITIALIZE));
        llllllllllllIlIlIlllIllIlIIllIll.playerNetServerHandler.sendPacket(new S03PacketTimeUpdate(llllllllllllIlIlIlllIllIlIIllIlI.getTotalWorldTime(), llllllllllllIlIlIlllIllIlIIllIlI.getWorldTime(), llllllllllllIlIlIlllIllIlIIllIlI.getGameRules().getBoolean(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[37]])));
        if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllIlIIllIlI.isRaining() ? 1 : 0)) {
            llllllllllllIlIlIlllIllIlIIllIll.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(ServerConfigurationManager.lllIlllllllllI[1], 0.0f));
            llllllllllllIlIlIlllIllIlIIllIll.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(ServerConfigurationManager.lllIlllllllllI[8], llllllllllllIlIlIlllIllIlIIllIlI.getRainStrength(1.0f)));
            llllllllllllIlIlIlllIllIlIIllIll.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(ServerConfigurationManager.lllIlllllllllI[5], llllllllllllIlIlIlllIllIlIIllIlI.getThunderStrength(1.0f)));
        }
    }
    
    public String allowUserToConnect(final SocketAddress llllllllllllIlIlIllllIIIIIIIIIIl, final GameProfile llllllllllllIlIlIlllIllllllllIIl) {
        if (lIlIIllIIlllIIlI(this.bannedPlayers.isBanned(llllllllllllIlIlIlllIllllllllIIl) ? 1 : 0)) {
            final UserListBansEntry llllllllllllIlIlIlllIlllllllllll = this.bannedPlayers.getEntry(llllllllllllIlIlIlllIllllllllIIl);
            String llllllllllllIlIlIlllIllllllllllI = String.valueOf(new StringBuilder(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[20]]).append(llllllllllllIlIlIlllIlllllllllll.getBanReason()));
            if (lIlIIllIIllIllll(llllllllllllIlIlIlllIlllllllllll.getBanEndDate())) {
                llllllllllllIlIlIlllIllllllllllI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIlllIllllllllllI)).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[21]]).append(ServerConfigurationManager.dateFormat.format(llllllllllllIlIlIlllIlllllllllll.getBanEndDate())));
            }
            return llllllllllllIlIlIlllIllllllllllI;
        }
        if (lIlIIllIIlllIIII(this.canJoin(llllllllllllIlIlIlllIllllllllIIl) ? 1 : 0)) {
            return ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[22]];
        }
        if (lIlIIllIIlllIIlI(this.bannedIPs.isBanned(llllllllllllIlIlIllllIIIIIIIIIIl) ? 1 : 0)) {
            final IPBanEntry llllllllllllIlIlIlllIlllllllllIl = this.bannedIPs.getBanEntry(llllllllllllIlIlIllllIIIIIIIIIIl);
            String llllllllllllIlIlIlllIlllllllllII = String.valueOf(new StringBuilder(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[23]]).append(llllllllllllIlIlIlllIlllllllllIl.getBanReason()));
            if (lIlIIllIIllIllll(llllllllllllIlIlIlllIlllllllllIl.getBanEndDate())) {
                llllllllllllIlIlIlllIlllllllllII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIlllIlllllllllII)).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[24]]).append(ServerConfigurationManager.dateFormat.format(llllllllllllIlIlIlllIlllllllllIl.getBanEndDate())));
            }
            return llllllllllllIlIlIlllIlllllllllII;
        }
        String s;
        if (lIlIIllIIlllIIll(this.playerEntityList.size(), this.maxPlayers) && lIlIIllIIlllIIII(this.func_183023_f(llllllllllllIlIlIlllIllllllllIIl) ? 1 : 0)) {
            s = ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[25]];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            s = null;
        }
        return s;
    }
    
    public int getEntityViewDistance() {
        return PlayerManager.getFurthestViewableBlock(this.getViewDistance());
    }
    
    public void setPlayerManager(final WorldServer[] llllllllllllIlIlIllllIIIIlIIllll) {
        this.playerNBTManagerObj = llllllllllllIlIlIllllIIIIlIIllll[ServerConfigurationManager.lllIlllllllllI[0]].getSaveHandler().getPlayerNBTManager();
        llllllllllllIlIlIllllIIIIlIIllll[ServerConfigurationManager.lllIlllllllllI[0]].getWorldBorder().addListener(new IBorderListener() {
            @Override
            public void onSizeChanged(final WorldBorder llllllllllllIlllIllIIlIIlIIlIIIl, final double llllllllllllIlllIllIIlIIlIIlIIII) {
                ServerConfigurationManager.this.sendPacketToAllPlayers(new S44PacketWorldBorder(llllllllllllIlllIllIIlIIlIIlIIIl, S44PacketWorldBorder.Action.SET_SIZE));
            }
            
            @Override
            public void onTransitionStarted(final WorldBorder llllllllllllIlllIllIIlIIlIIIlIlI, final double llllllllllllIlllIllIIlIIlIIIlIIl, final double llllllllllllIlllIllIIlIIlIIIlIII, final long llllllllllllIlllIllIIlIIlIIIIlll) {
                ServerConfigurationManager.this.sendPacketToAllPlayers(new S44PacketWorldBorder(llllllllllllIlllIllIIlIIlIIIlIlI, S44PacketWorldBorder.Action.LERP_SIZE));
            }
            
            @Override
            public void onCenterChanged(final WorldBorder llllllllllllIlllIllIIlIIIlllllIl, final double llllllllllllIlllIllIIlIIlIIIIIII, final double llllllllllllIlllIllIIlIIIlllllll) {
                ServerConfigurationManager.this.sendPacketToAllPlayers(new S44PacketWorldBorder(llllllllllllIlllIllIIlIIIlllllIl, S44PacketWorldBorder.Action.SET_CENTER));
            }
            
            @Override
            public void onDamageAmountChanged(final WorldBorder llllllllllllIlllIllIIlIIIllIllIl, final double llllllllllllIlllIllIIlIIIllIllII) {
            }
            
            @Override
            public void onWarningTimeChanged(final WorldBorder llllllllllllIlllIllIIlIIIllllIIl, final int llllllllllllIlllIllIIlIIIllllIII) {
                ServerConfigurationManager.this.sendPacketToAllPlayers(new S44PacketWorldBorder(llllllllllllIlllIllIIlIIIllllIIl, S44PacketWorldBorder.Action.SET_WARNING_TIME));
            }
            
            @Override
            public void onWarningDistanceChanged(final WorldBorder llllllllllllIlllIllIIlIIIlllIIlI, final int llllllllllllIlllIllIIlIIIlllIIIl) {
                ServerConfigurationManager.this.sendPacketToAllPlayers(new S44PacketWorldBorder(llllllllllllIlllIllIIlIIIlllIIlI, S44PacketWorldBorder.Action.SET_WARNING_BLOCKS));
            }
            
            @Override
            public void onDamageBufferChanged(final WorldBorder llllllllllllIlllIllIIlIIIllIlIlI, final double llllllllllllIlllIllIIlIIIllIlIIl) {
            }
        });
    }
    
    private static String lIlIIllIIIlIIIII(final String llllllllllllIlIlIlllIlIlllllIIlI, final String llllllllllllIlIlIlllIlIlllllIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlIlllIlIlllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIlllIlIlllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlIlllIlIlllllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlIlllIlIlllllIlII.init(ServerConfigurationManager.lllIlllllllllI[2], llllllllllllIlIlIlllIlIlllllIlIl);
            return new String(llllllllllllIlIlIlllIlIlllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIlllIlIlllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIlllIlIlllllIIll) {
            llllllllllllIlIlIlllIlIlllllIIll.printStackTrace();
            return null;
        }
    }
    
    protected void sendScoreboard(final ServerScoreboard llllllllllllIlIlIllllIIIIlIllIIl, final EntityPlayerMP llllllllllllIlIlIllllIIIIlIllIII) {
        final Set<ScoreObjective> llllllllllllIlIlIllllIIIIlIllllI = (Set<ScoreObjective>)Sets.newHashSet();
        final long llllllllllllIlIlIllllIIIIlIlIlIl = (long)llllllllllllIlIlIllllIIIIlIllIIl.getTeams().iterator();
        "".length();
        if ((0xA8 ^ 0xAC) < ((0xDD ^ 0xBE) & ~(0x4E ^ 0x2D))) {
            return;
        }
        while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIllllIIIIlIlIlIl).hasNext() ? 1 : 0)) {
            final ScorePlayerTeam llllllllllllIlIlIllllIIIIlIlllIl = ((Iterator<ScorePlayerTeam>)llllllllllllIlIlIllllIIIIlIlIlIl).next();
            llllllllllllIlIlIllllIIIIlIllIII.playerNetServerHandler.sendPacket(new S3EPacketTeams(llllllllllllIlIlIllllIIIIlIlllIl, ServerConfigurationManager.lllIlllllllllI[0]));
        }
        int llllllllllllIlIlIllllIIIIlIlllII = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if ((0xC2 ^ 0xC7) == 0x0) {
            return;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIllllIIIIlIlllII, ServerConfigurationManager.lllIlllllllllI[18])) {
            final ScoreObjective llllllllllllIlIlIllllIIIIlIllIll = llllllllllllIlIlIllllIIIIlIllIIl.getObjectiveInDisplaySlot(llllllllllllIlIlIllllIIIIlIlllII);
            if (lIlIIllIIllIllll(llllllllllllIlIlIllllIIIIlIllIll) && lIlIIllIIlllIIII(llllllllllllIlIlIllllIIIIlIllllI.contains(llllllllllllIlIlIllllIIIIlIllIll) ? 1 : 0)) {
                final float llllllllllllIlIlIllllIIIIlIlIIll = (float)llllllllllllIlIlIllllIIIIlIllIIl.func_96550_d(llllllllllllIlIlIllllIIIIlIllIll).iterator();
                "".length();
                if ("  ".length() == -" ".length()) {
                    return;
                }
                while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIllllIIIIlIlIIll).hasNext() ? 1 : 0)) {
                    final Packet llllllllllllIlIlIllllIIIIlIllIlI = ((Iterator<Packet>)llllllllllllIlIlIllllIIIIlIlIIll).next();
                    llllllllllllIlIlIllllIIIIlIllIII.playerNetServerHandler.sendPacket(llllllllllllIlIlIllllIIIIlIllIlI);
                }
                llllllllllllIlIlIllllIIIIlIllllI.add(llllllllllllIlIlIllllIIIIlIllIll);
                "".length();
            }
            ++llllllllllllIlIlIllllIIIIlIlllII;
        }
    }
    
    public UserListBans getBannedPlayers() {
        return this.bannedPlayers;
    }
    
    public void removeAllPlayers() {
        int llllllllllllIlIlIlllIllIIlIlIlIl = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIllIIlIlIlIl, this.playerEntityList.size())) {
            this.playerEntityList.get(llllllllllllIlIlIlllIllIIlIlIlIl).playerNetServerHandler.kickPlayerFromServer(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[38]]);
            ++llllllllllllIlIlIlllIllIIlIlIlIl;
        }
    }
    
    static {
        lIlIIllIIllIllIl();
        lIlIIllIIIlllIIl();
        FILE_PLAYERBANS = new File(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[0]]);
        FILE_IPBANS = new File(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[1]]);
        FILE_OPS = new File(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[2]]);
        FILE_WHITELIST = new File(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[3]]);
        logger = LogManager.getLogger();
        dateFormat = new SimpleDateFormat(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[4]]);
    }
    
    public List<EntityPlayerMP> func_181057_v() {
        return this.playerEntityList;
    }
    
    private static String lIlIIllIIIlIIIlI(final String llllllllllllIlIlIlllIlIllllIIlIl, final String llllllllllllIlIlIlllIlIllllIIlII) {
        try {
            final SecretKeySpec llllllllllllIlIlIlllIlIllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIlllIlIllllIIlII.getBytes(StandardCharsets.UTF_8)), ServerConfigurationManager.lllIlllllllllI[5]), "DES");
            final Cipher llllllllllllIlIlIlllIlIllllIIlll = Cipher.getInstance("DES");
            llllllllllllIlIlIlllIlIllllIIlll.init(ServerConfigurationManager.lllIlllllllllI[2], llllllllllllIlIlIlllIlIllllIlIII);
            return new String(llllllllllllIlIlIlllIlIllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIlllIlIllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIlllIlIllllIIllI) {
            llllllllllllIlIlIlllIlIllllIIllI.printStackTrace();
            return null;
        }
    }
    
    public EntityPlayerMP getPlayerByUsername(final String llllllllllllIlIlIlllIlllIIIIIlIl) {
        final float llllllllllllIlIlIlllIlllIIIIIIII = (float)this.playerEntityList.iterator();
        "".length();
        if (-" ".length() == "  ".length()) {
            return null;
        }
        while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIlllIlllIIIIIIII).hasNext() ? 1 : 0)) {
            final EntityPlayerMP llllllllllllIlIlIlllIlllIIIIIlII = ((Iterator<EntityPlayerMP>)llllllllllllIlIlIlllIlllIIIIIIII).next();
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIlllIIIIIlII.getName().equalsIgnoreCase(llllllllllllIlIlIlllIlllIIIIIlIl) ? 1 : 0)) {
                return llllllllllllIlIlIlllIlllIIIIIlII;
            }
        }
        return null;
    }
    
    private static boolean lIlIIllIIllIlllI(final Object llllllllllllIlIlIlllIlIlllIIIlII) {
        return llllllllllllIlIlIlllIlIlllIIIlII == null;
    }
    
    public String[] getOppedPlayerNames() {
        return this.ops.getKeys();
    }
    
    public NBTTagCompound readPlayerDataFromFile(final EntityPlayerMP llllllllllllIlIlIllllIIIIIlllIlI) {
        final NBTTagCompound llllllllllllIlIlIllllIIIIIlllIIl = this.mcServer.worldServers[ServerConfigurationManager.lllIlllllllllI[0]].getWorldInfo().getPlayerNBTTagCompound();
        NBTTagCompound llllllllllllIlIlIllllIIIIIllIlll = null;
        if (lIlIIllIIlllIIlI(llllllllllllIlIlIllllIIIIIlllIlI.getName().equals(this.mcServer.getServerOwner()) ? 1 : 0) && lIlIIllIIllIllll(llllllllllllIlIlIllllIIIIIlllIIl)) {
            llllllllllllIlIlIllllIIIIIlllIlI.readFromNBT(llllllllllllIlIlIllllIIIIIlllIIl);
            final NBTTagCompound llllllllllllIlIlIllllIIIIIlllIII = llllllllllllIlIlIllllIIIIIlllIIl;
            ServerConfigurationManager.logger.debug(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[19]]);
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIlIlIllllIIIIIllIlll = this.playerNBTManagerObj.readPlayerData(llllllllllllIlIlIllllIIIIIlllIlI);
        }
        return llllllllllllIlIlIllllIIIIIllIlll;
    }
    
    public void saveAllPlayerData() {
        int llllllllllllIlIlIlllIllIllIIIIII = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIllIllIIIIII, this.playerEntityList.size())) {
            this.writePlayerData(this.playerEntityList.get(llllllllllllIlIlIlllIllIllIIIIII));
            ++llllllllllllIlIlIlllIllIllIIIIII;
        }
    }
    
    public StatisticsFile getPlayerStatsFile(final EntityPlayer llllllllllllIlIlIlllIllIIIllIIIl) {
        final UUID llllllllllllIlIlIlllIllIIIllIlll = llllllllllllIlIlIlllIllIIIllIIIl.getUniqueID();
        StatisticsFile statisticsFile;
        if (lIlIIllIIllIlllI(llllllllllllIlIlIlllIllIIIllIlll)) {
            statisticsFile = null;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else {
            statisticsFile = this.playerStatFiles.get(llllllllllllIlIlIlllIllIIIllIlll);
        }
        StatisticsFile llllllllllllIlIlIlllIllIIIllIllI = statisticsFile;
        if (lIlIIllIIllIlllI(llllllllllllIlIlIlllIllIIIllIllI)) {
            final File llllllllllllIlIlIlllIllIIIllIlIl = new File(this.mcServer.worldServerForDimension(ServerConfigurationManager.lllIlllllllllI[0]).getSaveHandler().getWorldDirectory(), ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[39]]);
            final File llllllllllllIlIlIlllIllIIIllIlII = new File(llllllllllllIlIlIlllIllIIIllIlIl, String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIlllIllIIIllIlll.toString())).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[40]])));
            if (lIlIIllIIlllIIII(llllllllllllIlIlIlllIllIIIllIlII.exists() ? 1 : 0)) {
                final File llllllllllllIlIlIlllIllIIIllIIll = new File(llllllllllllIlIlIlllIllIIIllIlIl, String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIlllIllIIIllIIIl.getName())).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[41]])));
                if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllIIIllIIll.exists() ? 1 : 0) && lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllIIIllIIll.isFile() ? 1 : 0)) {
                    llllllllllllIlIlIlllIllIIIllIIll.renameTo(llllllllllllIlIlIlllIllIIIllIlII);
                    "".length();
                }
            }
            llllllllllllIlIlIlllIllIIIllIllI = new StatisticsFile(this.mcServer, llllllllllllIlIlIlllIllIIIllIlII);
            llllllllllllIlIlIlllIllIIIllIllI.readStatFile();
            this.playerStatFiles.put(llllllllllllIlIlIlllIllIIIllIlll, llllllllllllIlIlIlllIllIIIllIllI);
            "".length();
        }
        return llllllllllllIlIlIlllIllIIIllIllI;
    }
    
    public void setWhiteListEnabled(final boolean llllllllllllIlIlIlllIllIlIIIIllI) {
        this.whiteListEnforced = llllllllllllIlIlIlllIllIlIIIIllI;
    }
    
    public EntityPlayerMP getPlayerByUUID(final UUID llllllllllllIlIlIlllIllIIIIlIlII) {
        return this.uuidToPlayerMap.get(llllllllllllIlIlIlllIllIIIIlIlII);
    }
    
    public String[] getAvailablePlayerDat() {
        return this.mcServer.worldServers[ServerConfigurationManager.lllIlllllllllI[0]].getSaveHandler().getPlayerNBTManager().getAvailablePlayerDat();
    }
    
    public BanList getBannedIPs() {
        return this.bannedIPs;
    }
    
    public int getViewDistance() {
        return this.viewDistance;
    }
    
    public void initializeConnectionToPlayer(final NetworkManager llllllllllllIlIlIllllIIIlIIIlIII, final EntityPlayerMP llllllllllllIlIlIllllIIIlIIIIlll) {
        final GameProfile llllllllllllIlIlIllllIIIlIIIIllI = llllllllllllIlIlIllllIIIlIIIIlll.getGameProfile();
        final PlayerProfileCache llllllllllllIlIlIllllIIIlIIIIlIl = this.mcServer.getPlayerProfileCache();
        final GameProfile llllllllllllIlIlIllllIIIlIIIIlII = llllllllllllIlIlIllllIIIlIIIIlIl.getProfileByUUID(llllllllllllIlIlIllllIIIlIIIIllI.getId());
        String s;
        if (lIlIIllIIllIlllI(llllllllllllIlIlIllllIIIlIIIIlII)) {
            s = llllllllllllIlIlIllllIIIlIIIIllI.getName();
            "".length();
            if (((0xD6 ^ 0x92) & ~(0x43 ^ 0x7)) >= "   ".length()) {
                return;
            }
        }
        else {
            s = llllllllllllIlIlIllllIIIlIIIIlII.getName();
        }
        final String llllllllllllIlIlIllllIIIlIIIIIll = s;
        llllllllllllIlIlIllllIIIlIIIIlIl.addEntry(llllllllllllIlIlIllllIIIlIIIIllI);
        final NBTTagCompound llllllllllllIlIlIllllIIIlIIIIIlI = this.readPlayerDataFromFile(llllllllllllIlIlIllllIIIlIIIIlll);
        llllllllllllIlIlIllllIIIlIIIIlll.setWorld(this.mcServer.worldServerForDimension(llllllllllllIlIlIllllIIIlIIIIlll.dimension));
        llllllllllllIlIlIllllIIIlIIIIlll.theItemInWorldManager.setWorld((WorldServer)llllllllllllIlIlIllllIIIlIIIIlll.worldObj);
        String llllllllllllIlIlIllllIIIlIIIIIIl = ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[6]];
        if (lIlIIllIIllIllll(llllllllllllIlIlIllllIIIlIIIlIII.getRemoteAddress())) {
            llllllllllllIlIlIllllIIIlIIIIIIl = llllllllllllIlIlIllllIIIlIIIlIII.getRemoteAddress().toString();
        }
        ServerConfigurationManager.logger.info(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlIllllIIIlIIIIlll.getName())).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[7]]).append(llllllllllllIlIlIllllIIIlIIIIIIl).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[8]]).append(llllllllllllIlIlIllllIIIlIIIIlll.getEntityId()).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[5]]).append(llllllllllllIlIlIllllIIIlIIIIlll.posX).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[9]]).append(llllllllllllIlIlIllllIIIlIIIIlll.posY).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[10]]).append(llllllllllllIlIlIllllIIIlIIIIlll.posZ).append(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[11]])));
        final WorldServer llllllllllllIlIlIllllIIIlIIIIIII = this.mcServer.worldServerForDimension(llllllllllllIlIlIllllIIIlIIIIlll.dimension);
        final WorldInfo llllllllllllIlIlIllllIIIIlllllll = llllllllllllIlIlIllllIIIlIIIIIII.getWorldInfo();
        final BlockPos llllllllllllIlIlIllllIIIIllllllI = llllllllllllIlIlIllllIIIlIIIIIII.getSpawnPoint();
        this.setPlayerGameTypeBasedOnOther(llllllllllllIlIlIllllIIIlIIIIlll, null, llllllllllllIlIlIllllIIIlIIIIIII);
        final NetHandlerPlayServer llllllllllllIlIlIllllIIIIlllllIl = new NetHandlerPlayServer(this.mcServer, llllllllllllIlIlIllllIIIlIIIlIII, llllllllllllIlIlIllllIIIlIIIIlll);
        llllllllllllIlIlIllllIIIIlllllIl.sendPacket(new S01PacketJoinGame(llllllllllllIlIlIllllIIIlIIIIlll.getEntityId(), llllllllllllIlIlIllllIIIlIIIIlll.theItemInWorldManager.getGameType(), llllllllllllIlIlIllllIIIIlllllll.isHardcoreModeEnabled(), llllllllllllIlIlIllllIIIlIIIIIII.provider.getDimensionId(), llllllllllllIlIlIllllIIIlIIIIIII.getDifficulty(), this.getMaxPlayers(), llllllllllllIlIlIllllIIIIlllllll.getTerrainType(), llllllllllllIlIlIllllIIIlIIIIIII.getGameRules().getBoolean(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[12]])));
        llllllllllllIlIlIllllIIIIlllllIl.sendPacket(new S3FPacketCustomPayload(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[13]], new PacketBuffer(Unpooled.buffer()).writeString(this.getServerInstance().getServerModName())));
        llllllllllllIlIlIllllIIIIlllllIl.sendPacket(new S41PacketServerDifficulty(llllllllllllIlIlIllllIIIIlllllll.getDifficulty(), llllllllllllIlIlIllllIIIIlllllll.isDifficultyLocked()));
        llllllllllllIlIlIllllIIIIlllllIl.sendPacket(new S05PacketSpawnPosition(llllllllllllIlIlIllllIIIIllllllI));
        llllllllllllIlIlIllllIIIIlllllIl.sendPacket(new S39PacketPlayerAbilities(llllllllllllIlIlIllllIIIlIIIIlll.capabilities));
        llllllllllllIlIlIllllIIIIlllllIl.sendPacket(new S09PacketHeldItemChange(llllllllllllIlIlIllllIIIlIIIIlll.inventory.currentItem));
        llllllllllllIlIlIllllIIIlIIIIlll.getStatFile().func_150877_d();
        llllllllllllIlIlIllllIIIlIIIIlll.getStatFile().sendAchievements(llllllllllllIlIlIllllIIIlIIIIlll);
        this.sendScoreboard((ServerScoreboard)llllllllllllIlIlIllllIIIlIIIIIII.getScoreboard(), llllllllllllIlIlIllllIIIlIIIIlll);
        this.mcServer.refreshStatusNextTick();
        ChatComponentTranslation llllllllllllIlIlIllllIIIIllllIll = null;
        if (lIlIIllIIlllIIII(llllllllllllIlIlIllllIIIlIIIIlll.getName().equalsIgnoreCase(llllllllllllIlIlIllllIIIlIIIIIll) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[14]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[ServerConfigurationManager.lllIlllllllllI[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[ServerConfigurationManager.lllIlllllllllI[0]] = llllllllllllIlIlIllllIIIlIIIIlll.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl[ServerConfigurationManager.lllIlllllllllI[1]] = llllllllllllIlIlIllllIIIlIIIIIll;
            final ChatComponentTranslation llllllllllllIlIlIllllIIIIlllllII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[15]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[ServerConfigurationManager.lllIlllllllllI[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[ServerConfigurationManager.lllIlllllllllI[0]] = llllllllllllIlIlIllllIIIlIIIIlll.getDisplayName();
            llllllllllllIlIlIllllIIIIllllIll = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
        }
        llllllllllllIlIlIllllIIIIllllIll.getChatStyle().setColor(EnumChatFormatting.YELLOW);
        "".length();
        this.sendChatMsg(llllllllllllIlIlIllllIIIIllllIll);
        this.playerLoggedIn(llllllllllllIlIlIllllIIIlIIIIlll);
        llllllllllllIlIlIllllIIIIlllllIl.setPlayerLocation(llllllllllllIlIlIllllIIIlIIIIlll.posX, llllllllllllIlIlIllllIIIlIIIIlll.posY, llllllllllllIlIlIllllIIIlIIIIlll.posZ, llllllllllllIlIlIllllIIIlIIIIlll.rotationYaw, llllllllllllIlIlIllllIIIlIIIIlll.rotationPitch);
        this.updateTimeAndWeatherForPlayer(llllllllllllIlIlIllllIIIlIIIIlll, llllllllllllIlIlIllllIIIlIIIIIII);
        if (lIlIIllIIlllIIIl(this.mcServer.getResourcePackUrl().length())) {
            llllllllllllIlIlIllllIIIlIIIIlll.loadResourcePack(this.mcServer.getResourcePackUrl(), this.mcServer.getResourcePackHash());
        }
        final double llllllllllllIlIlIllllIIIIllIlIIl = (double)llllllllllllIlIlIllllIIIlIIIIlll.getActivePotionEffects().iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIllllIIIIllIlIIl).hasNext() ? 1 : 0)) {
            final PotionEffect llllllllllllIlIlIllllIIIIllllIlI = ((Iterator<PotionEffect>)llllllllllllIlIlIllllIIIIllIlIIl).next();
            llllllllllllIlIlIllllIIIIlllllIl.sendPacket(new S1DPacketEntityEffect(llllllllllllIlIlIllllIIIlIIIIlll.getEntityId(), llllllllllllIlIlIllllIIIIllllIlI));
        }
        llllllllllllIlIlIllllIIIlIIIIlll.addSelfToInternalCraftingInventory();
        if (lIlIIllIIllIllll(llllllllllllIlIlIllllIIIlIIIIIlI) && lIlIIllIIlllIIlI(llllllllllllIlIlIllllIIIlIIIIIlI.hasKey(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[16]], ServerConfigurationManager.lllIlllllllllI[10]) ? 1 : 0)) {
            final Entity llllllllllllIlIlIllllIIIIllllIIl = EntityList.createEntityFromNBT(llllllllllllIlIlIllllIIIlIIIIIlI.getCompoundTag(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[17]]), llllllllllllIlIlIllllIIIlIIIIIII);
            if (lIlIIllIIllIllll(llllllllllllIlIlIllllIIIIllllIIl)) {
                llllllllllllIlIlIllllIIIIllllIIl.forceSpawn = (ServerConfigurationManager.lllIlllllllllI[1] != 0);
                llllllllllllIlIlIllllIIIlIIIIIII.spawnEntityInWorld(llllllllllllIlIlIllllIIIIllllIIl);
                "".length();
                llllllllllllIlIlIllllIIIlIIIIlll.mountEntity(llllllllllllIlIlIllllIIIIllllIIl);
                llllllllllllIlIlIllllIIIIllllIIl.forceSpawn = (ServerConfigurationManager.lllIlllllllllI[0] != 0);
            }
        }
    }
    
    public String[] getWhitelistedPlayerNames() {
        return this.whiteListedPlayers.getKeys();
    }
    
    public UserListOps getOppedPlayers() {
        return this.ops;
    }
    
    private static boolean lIlIIllIIllllIII(final int llllllllllllIlIlIlllIlIllIllIlll, final int llllllllllllIlIlIlllIlIllIllIllI) {
        return llllllllllllIlIlIlllIlIllIllIlll != llllllllllllIlIlIlllIlIllIllIllI;
    }
    
    public void sendMessageToTeamOrEvryPlayer(final EntityPlayer llllllllllllIlIlIlllIlllIlIIlllI, final IChatComponent llllllllllllIlIlIlllIlllIlIIllIl) {
        final Team llllllllllllIlIlIlllIlllIlIlIIlI = llllllllllllIlIlIlllIlllIlIIlllI.getTeam();
        if (lIlIIllIIllIlllI(llllllllllllIlIlIlllIlllIlIlIIlI)) {
            this.sendChatMsg(llllllllllllIlIlIlllIlllIlIIllIl);
            "".length();
            if ("   ".length() > (0xEB ^ 0x91 ^ (0x13 ^ 0x6D))) {
                return;
            }
        }
        else {
            int llllllllllllIlIlIlllIlllIlIlIIIl = ServerConfigurationManager.lllIlllllllllI[0];
            "".length();
            if (((0xF6 ^ 0xA6) & ~(0x60 ^ 0x30)) == -" ".length()) {
                return;
            }
            while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIlllIlIlIIIl, this.playerEntityList.size())) {
                final EntityPlayerMP llllllllllllIlIlIlllIlllIlIlIIII = this.playerEntityList.get(llllllllllllIlIlIlllIlllIlIlIIIl);
                if (lIlIIllIIllllIlI(llllllllllllIlIlIlllIlllIlIlIIII.getTeam(), llllllllllllIlIlIlllIlllIlIlIIlI)) {
                    llllllllllllIlIlIlllIlllIlIlIIII.addChatMessage(llllllllllllIlIlIlllIlllIlIIllIl);
                }
                ++llllllllllllIlIlIlllIlllIlIlIIIl;
            }
        }
    }
    
    public void syncPlayerInventory(final EntityPlayerMP llllllllllllIlIlIlllIllIlIIlIlIl) {
        llllllllllllIlIlIlllIllIlIIlIlIl.sendContainerToPlayer(llllllllllllIlIlIlllIllIlIIlIlIl.inventoryContainer);
        llllllllllllIlIlIlllIllIlIIlIlIl.setPlayerHealthUpdated();
        llllllllllllIlIlIlllIllIlIIlIlIl.playerNetServerHandler.sendPacket(new S09PacketHeldItemChange(llllllllllllIlIlIlllIllIlIIlIlIl.inventory.currentItem));
    }
    
    public EntityPlayerMP createPlayerForUser(final GameProfile llllllllllllIlIlIlllIllllllIlllI) {
        final UUID llllllllllllIlIlIlllIllllllIllIl = EntityPlayer.getUUID(llllllllllllIlIlIlllIllllllIlllI);
        final List<EntityPlayerMP> llllllllllllIlIlIlllIllllllIllII = (List<EntityPlayerMP>)Lists.newArrayList();
        int llllllllllllIlIlIlllIllllllIlIll = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (((0x6F ^ 0x3F ^ (0x36 ^ 0x7E)) & (0x60 ^ 0x39 ^ (0xF7 ^ 0xB6) ^ -" ".length())) != ((0xA4 ^ 0xAC ^ (0x44 ^ 0x6A)) & (100 + 198 - 143 + 74 ^ 57 + 97 - 91 + 132 ^ -" ".length()))) {
            return null;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIllllllIlIll, this.playerEntityList.size())) {
            final EntityPlayerMP llllllllllllIlIlIlllIllllllIlIlI = this.playerEntityList.get(llllllllllllIlIlIlllIllllllIlIll);
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllllllIlIlI.getUniqueID().equals(llllllllllllIlIlIlllIllllllIllIl) ? 1 : 0)) {
                llllllllllllIlIlIlllIllllllIllII.add(llllllllllllIlIlIlllIllllllIlIlI);
                "".length();
            }
            ++llllllllllllIlIlIlllIllllllIlIll;
        }
        final EntityPlayerMP llllllllllllIlIlIlllIllllllIlIIl = this.uuidToPlayerMap.get(llllllllllllIlIlIlllIllllllIlllI.getId());
        if (lIlIIllIIllIllll(llllllllllllIlIlIlllIllllllIlIIl) && lIlIIllIIlllIIII(llllllllllllIlIlIlllIllllllIllII.contains(llllllllllllIlIlIlllIllllllIlIIl) ? 1 : 0)) {
            llllllllllllIlIlIlllIllllllIllII.add(llllllllllllIlIlIlllIllllllIlIIl);
            "".length();
        }
        final boolean llllllllllllIlIlIlllIlllllIlllll = (boolean)llllllllllllIlIlIlllIllllllIllII.iterator();
        "".length();
        if ("  ".length() < 0) {
            return null;
        }
        while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIlllIlllllIlllll).hasNext() ? 1 : 0)) {
            final EntityPlayerMP llllllllllllIlIlIlllIllllllIlIII = ((Iterator<EntityPlayerMP>)llllllllllllIlIlIlllIlllllIlllll).next();
            llllllllllllIlIlIlllIllllllIlIII.playerNetServerHandler.kickPlayerFromServer(ServerConfigurationManager.lllIllllIllIll[ServerConfigurationManager.lllIlllllllllI[26]]);
        }
        ItemInWorldManager llllllllllllIlIlIlllIllllllIIllI = null;
        if (lIlIIllIIlllIIlI(this.mcServer.isDemo() ? 1 : 0)) {
            final ItemInWorldManager llllllllllllIlIlIlllIllllllIIlll = new DemoWorldManager(this.mcServer.worldServerForDimension(ServerConfigurationManager.lllIlllllllllI[0]));
            "".length();
            if (((0x11 ^ 0x3B) & ~(0xA8 ^ 0x82)) != 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIlIlIlllIllllllIIllI = new ItemInWorldManager(this.mcServer.worldServerForDimension(ServerConfigurationManager.lllIlllllllllI[0]));
        }
        return new EntityPlayerMP(this.mcServer, this.mcServer.worldServerForDimension(ServerConfigurationManager.lllIlllllllllI[0]), llllllllllllIlIlIlllIllllllIlllI, llllllllllllIlIlIlllIllllllIIllI);
    }
    
    protected void writePlayerData(final EntityPlayerMP llllllllllllIlIlIllllIIIIIlIlllI) {
        this.playerNBTManagerObj.writePlayerData(llllllllllllIlIlIllllIIIIIlIlllI);
        final StatisticsFile llllllllllllIlIlIllllIIIIIlIllIl = this.playerStatFiles.get(llllllllllllIlIlIllllIIIIIlIlllI.getUniqueID());
        if (lIlIIllIIllIllll(llllllllllllIlIlIllllIIIIIlIllIl)) {
            llllllllllllIlIlIllllIIIIIlIllIl.saveStatFile();
        }
    }
    
    public void sendChatMsg(final IChatComponent llllllllllllIlIlIlllIllIIlIIIIIl) {
        this.sendChatMsgImpl(llllllllllllIlIlIlllIllIIlIIIIIl, (boolean)(ServerConfigurationManager.lllIlllllllllI[1] != 0));
    }
    
    public void setCommandsAllowedForAll(final boolean llllllllllllIlIlIlllIllIIlIllIIl) {
        this.commandsAllowedForAll = llllllllllllIlIlIlllIllIIlIllIIl;
    }
    
    public GameProfile[] getAllProfiles() {
        final GameProfile[] llllllllllllIlIlIlllIlllIIlIllIl = new GameProfile[this.playerEntityList.size()];
        int llllllllllllIlIlIlllIlllIIlIllII = ServerConfigurationManager.lllIlllllllllI[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIIllIIlllIIll(llllllllllllIlIlIlllIlllIIlIllII, this.playerEntityList.size())) {
            llllllllllllIlIlIlllIlllIIlIllIl[llllllllllllIlIlIlllIlllIIlIllII] = this.playerEntityList.get(llllllllllllIlIlIlllIlllIIlIllII).getGameProfile();
            ++llllllllllllIlIlIlllIlllIIlIllII;
        }
        return llllllllllllIlIlIlllIlllIIlIllIl;
    }
    
    public void transferPlayerToDimension(final EntityPlayerMP llllllllllllIlIlIlllIllllIllIlIl, final int llllllllllllIlIlIlllIllllIllIlII) {
        final int llllllllllllIlIlIlllIllllIllIIll = llllllllllllIlIlIlllIllllIllIlIl.dimension;
        final WorldServer llllllllllllIlIlIlllIllllIllIIlI = this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIllllIllIlIl.dimension);
        llllllllllllIlIlIlllIllllIllIlIl.dimension = llllllllllllIlIlIlllIllllIllIlII;
        final WorldServer llllllllllllIlIlIlllIllllIllIIIl = this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIllllIllIlIl.dimension);
        llllllllllllIlIlIlllIllllIllIlIl.playerNetServerHandler.sendPacket(new S07PacketRespawn(llllllllllllIlIlIlllIllllIllIlIl.dimension, llllllllllllIlIlIlllIllllIllIlIl.worldObj.getDifficulty(), llllllllllllIlIlIlllIllllIllIlIl.worldObj.getWorldInfo().getTerrainType(), llllllllllllIlIlIlllIllllIllIlIl.theItemInWorldManager.getGameType()));
        llllllllllllIlIlIlllIllllIllIIlI.removePlayerEntityDangerously(llllllllllllIlIlIlllIllllIllIlIl);
        llllllllllllIlIlIlllIllllIllIlIl.isDead = (ServerConfigurationManager.lllIlllllllllI[0] != 0);
        this.transferEntityToWorld(llllllllllllIlIlIlllIllllIllIlIl, llllllllllllIlIlIlllIllllIllIIll, llllllllllllIlIlIlllIllllIllIIlI, llllllllllllIlIlIlllIllllIllIIIl);
        this.preparePlayer(llllllllllllIlIlIlllIllllIllIlIl, llllllllllllIlIlIlllIllllIllIIlI);
        llllllllllllIlIlIlllIllllIllIlIl.playerNetServerHandler.setPlayerLocation(llllllllllllIlIlIlllIllllIllIlIl.posX, llllllllllllIlIlIlllIllllIllIlIl.posY, llllllllllllIlIlIlllIllllIllIlIl.posZ, llllllllllllIlIlIlllIllllIllIlIl.rotationYaw, llllllllllllIlIlIlllIllllIllIlIl.rotationPitch);
        llllllllllllIlIlIlllIllllIllIlIl.theItemInWorldManager.setWorld(llllllllllllIlIlIlllIllllIllIIIl);
        this.updateTimeAndWeatherForPlayer(llllllllllllIlIlIlllIllllIllIlIl, llllllllllllIlIlIlllIllllIllIIIl);
        this.syncPlayerInventory(llllllllllllIlIlIlllIllllIllIlIl);
        final byte llllllllllllIlIlIlllIllllIlIlIII = (byte)llllllllllllIlIlIlllIllllIllIlIl.getActivePotionEffects().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIlllIllllIlIlIII).hasNext() ? 1 : 0)) {
            final PotionEffect llllllllllllIlIlIlllIllllIllIIII = ((Iterator<PotionEffect>)llllllllllllIlIlIlllIllllIlIlIII).next();
            llllllllllllIlIlIlllIllllIllIlIl.playerNetServerHandler.sendPacket(new S1DPacketEntityEffect(llllllllllllIlIlIlllIllllIllIlIl.getEntityId(), llllllllllllIlIlIlllIllllIllIIII));
        }
    }
    
    public EntityPlayerMP recreatePlayerEntity(final EntityPlayerMP llllllllllllIlIlIlllIlllllIlIIll, final int llllllllllllIlIlIlllIlllllIIIllI, final boolean llllllllllllIlIlIlllIlllllIlIIIl) {
        llllllllllllIlIlIlllIlllllIlIIll.getServerForPlayer().getEntityTracker().removePlayerFromTrackers(llllllllllllIlIlIlllIlllllIlIIll);
        llllllllllllIlIlIlllIlllllIlIIll.getServerForPlayer().getEntityTracker().untrackEntity(llllllllllllIlIlIlllIlllllIlIIll);
        llllllllllllIlIlIlllIlllllIlIIll.getServerForPlayer().getPlayerManager().removePlayer(llllllllllllIlIlIlllIlllllIlIIll);
        this.playerEntityList.remove(llllllllllllIlIlIlllIlllllIlIIll);
        "".length();
        this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIlllllIlIIll.dimension).removePlayerEntityDangerously(llllllllllllIlIlIlllIlllllIlIIll);
        final BlockPos llllllllllllIlIlIlllIlllllIlIIII = llllllllllllIlIlIlllIlllllIlIIll.getBedLocation();
        final boolean llllllllllllIlIlIlllIlllllIIllll = llllllllllllIlIlIlllIlllllIlIIll.isSpawnForced();
        llllllllllllIlIlIlllIlllllIlIIll.dimension = llllllllllllIlIlIlllIlllllIIIllI;
        ItemInWorldManager llllllllllllIlIlIlllIlllllIIllIl = null;
        if (lIlIIllIIlllIIlI(this.mcServer.isDemo() ? 1 : 0)) {
            final ItemInWorldManager llllllllllllIlIlIlllIlllllIIlllI = new DemoWorldManager(this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIlllllIlIIll.dimension));
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            llllllllllllIlIlIlllIlllllIIllIl = new ItemInWorldManager(this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIlllllIlIIll.dimension));
        }
        final EntityPlayerMP llllllllllllIlIlIlllIlllllIIllII = new EntityPlayerMP(this.mcServer, this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIlllllIlIIll.dimension), llllllllllllIlIlIlllIlllllIlIIll.getGameProfile(), llllllllllllIlIlIlllIlllllIIllIl);
        llllllllllllIlIlIlllIlllllIIllII.playerNetServerHandler = llllllllllllIlIlIlllIlllllIlIIll.playerNetServerHandler;
        llllllllllllIlIlIlllIlllllIIllII.clonePlayer(llllllllllllIlIlIlllIlllllIlIIll, llllllllllllIlIlIlllIlllllIlIIIl);
        llllllllllllIlIlIlllIlllllIIllII.setEntityId(llllllllllllIlIlIlllIlllllIlIIll.getEntityId());
        llllllllllllIlIlIlllIlllllIIllII.func_174817_o(llllllllllllIlIlIlllIlllllIlIIll);
        final WorldServer llllllllllllIlIlIlllIlllllIIlIll = this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIlllllIlIIll.dimension);
        this.setPlayerGameTypeBasedOnOther(llllllllllllIlIlIlllIlllllIIllII, llllllllllllIlIlIlllIlllllIlIIll, llllllllllllIlIlIlllIlllllIIlIll);
        if (lIlIIllIIllIllll(llllllllllllIlIlIlllIlllllIlIIII)) {
            final BlockPos llllllllllllIlIlIlllIlllllIIlIlI = EntityPlayer.getBedSpawnLocation(this.mcServer.worldServerForDimension(llllllllllllIlIlIlllIlllllIlIIll.dimension), llllllllllllIlIlIlllIlllllIlIIII, llllllllllllIlIlIlllIlllllIIllll);
            if (lIlIIllIIllIllll(llllllllllllIlIlIlllIlllllIIlIlI)) {
                llllllllllllIlIlIlllIlllllIIllII.setLocationAndAngles(llllllllllllIlIlIlllIlllllIIlIlI.getX() + 0.5f, llllllllllllIlIlIlllIlllllIIlIlI.getY() + 0.1f, llllllllllllIlIlIlllIlllllIIlIlI.getZ() + 0.5f, 0.0f, 0.0f);
                llllllllllllIlIlIlllIlllllIIllII.setSpawnPoint(llllllllllllIlIlIlllIlllllIlIIII, llllllllllllIlIlIlllIlllllIIllll);
                "".length();
                if ("   ".length() == "  ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIlIlIlllIlllllIIllII.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(ServerConfigurationManager.lllIlllllllllI[0], 0.0f));
            }
        }
        llllllllllllIlIlIlllIlllllIIlIll.theChunkProviderServer.loadChunk((int)llllllllllllIlIlIlllIlllllIIllII.posX >> ServerConfigurationManager.lllIlllllllllI[4], (int)llllllllllllIlIlIlllIlllllIIllII.posZ >> ServerConfigurationManager.lllIlllllllllI[4]);
        "".length();
        "".length();
        if (" ".length() >= "   ".length()) {
            return null;
        }
        while (lIlIIllIIlllIIII(llllllllllllIlIlIlllIlllllIIlIll.getCollidingBoundingBoxes(llllllllllllIlIlIlllIlllllIIllII, llllllllllllIlIlIlllIlllllIIllII.getEntityBoundingBox()).isEmpty() ? 1 : 0) && !lIlIIllIIlllIllI(lIlIIllIIlllIlIl(llllllllllllIlIlIlllIlllllIIllII.posY, 256.0))) {
            llllllllllllIlIlIlllIlllllIIllII.setPosition(llllllllllllIlIlIlllIlllllIIllII.posX, llllllllllllIlIlIlllIlllllIIllII.posY + 1.0, llllllllllllIlIlIlllIlllllIIllII.posZ);
        }
        llllllllllllIlIlIlllIlllllIIllII.playerNetServerHandler.sendPacket(new S07PacketRespawn(llllllllllllIlIlIlllIlllllIIllII.dimension, llllllllllllIlIlIlllIlllllIIllII.worldObj.getDifficulty(), llllllllllllIlIlIlllIlllllIIllII.worldObj.getWorldInfo().getTerrainType(), llllllllllllIlIlIlllIlllllIIllII.theItemInWorldManager.getGameType()));
        final BlockPos llllllllllllIlIlIlllIlllllIIlIIl = llllllllllllIlIlIlllIlllllIIlIll.getSpawnPoint();
        llllllllllllIlIlIlllIlllllIIllII.playerNetServerHandler.setPlayerLocation(llllllllllllIlIlIlllIlllllIIllII.posX, llllllllllllIlIlIlllIlllllIIllII.posY, llllllllllllIlIlIlllIlllllIIllII.posZ, llllllllllllIlIlIlllIlllllIIllII.rotationYaw, llllllllllllIlIlIlllIlllllIIllII.rotationPitch);
        llllllllllllIlIlIlllIlllllIIllII.playerNetServerHandler.sendPacket(new S05PacketSpawnPosition(llllllllllllIlIlIlllIlllllIIlIIl));
        llllllllllllIlIlIlllIlllllIIllII.playerNetServerHandler.sendPacket(new S1FPacketSetExperience(llllllllllllIlIlIlllIlllllIIllII.experience, llllllllllllIlIlIlllIlllllIIllII.experienceTotal, llllllllllllIlIlIlllIlllllIIllII.experienceLevel));
        this.updateTimeAndWeatherForPlayer(llllllllllllIlIlIlllIlllllIIllII, llllllllllllIlIlIlllIlllllIIlIll);
        llllllllllllIlIlIlllIlllllIIlIll.getPlayerManager().addPlayer(llllllllllllIlIlIlllIlllllIIllII);
        llllllllllllIlIlIlllIlllllIIlIll.spawnEntityInWorld(llllllllllllIlIlIlllIlllllIIllII);
        "".length();
        this.playerEntityList.add(llllllllllllIlIlIlllIlllllIIllII);
        "".length();
        this.uuidToPlayerMap.put(llllllllllllIlIlIlllIlllllIIllII.getUniqueID(), llllllllllllIlIlIlllIlllllIIllII);
        "".length();
        llllllllllllIlIlIlllIlllllIIllII.addSelfToInternalCraftingInventory();
        llllllllllllIlIlIlllIlllllIIllII.setHealth(llllllllllllIlIlIlllIlllllIIllII.getHealth());
        return llllllllllllIlIlIlllIlllllIIllII;
    }
    
    public List<EntityPlayerMP> getPlayersMatchingAddress(final String llllllllllllIlIlIlllIllIIlllllll) {
        final List<EntityPlayerMP> llllllllllllIlIlIlllIllIIllllllI = (List<EntityPlayerMP>)Lists.newArrayList();
        final int llllllllllllIlIlIlllIllIIllllIII = (int)this.playerEntityList.iterator();
        "".length();
        if (-(0xBD ^ 0xB9) >= 0) {
            return null;
        }
        while (!lIlIIllIIlllIIII(((Iterator)llllllllllllIlIlIlllIllIIllllIII).hasNext() ? 1 : 0)) {
            final EntityPlayerMP llllllllllllIlIlIlllIllIIlllllIl = ((Iterator<EntityPlayerMP>)llllllllllllIlIlIlllIllIIllllIII).next();
            if (lIlIIllIIlllIIlI(llllllllllllIlIlIlllIllIIlllllIl.getPlayerIP().equals(llllllllllllIlIlIlllIllIIlllllll) ? 1 : 0)) {
                llllllllllllIlIlIlllIllIIllllllI.add(llllllllllllIlIlIlllIllIIlllllIl);
                "".length();
            }
        }
        return llllllllllllIlIlIlllIllIIllllllI;
    }
    
    private static boolean lIlIIllIIlllIIIl(final int llllllllllllIlIlIlllIlIllIlllIlI) {
        return llllllllllllIlIlIlllIlIllIlllIlI > 0;
    }
}
