// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Iterator;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.network.play.server.S22PacketMultiBlockChange;
import net.minecraft.network.play.server.S21PacketChunkData;
import net.minecraft.world.World;
import net.minecraft.network.play.server.S23PacketBlockChange;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.Packet;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.BlockPos;
import net.minecraft.world.WorldProvider;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.LongHashMap;
import net.minecraft.world.WorldServer;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class PlayerManager
{
    private static final /* synthetic */ Logger pmLogger;
    private final /* synthetic */ List<EntityPlayerMP> players;
    private /* synthetic */ int playerViewRadius;
    private final /* synthetic */ List<PlayerInstance> playerInstanceList;
    private final /* synthetic */ WorldServer theWorldServer;
    private final /* synthetic */ LongHashMap<PlayerInstance> playerInstances;
    private static final /* synthetic */ int[] lIlIllIlllIIll;
    private final /* synthetic */ int[][] xzDirectionsConst;
    private final /* synthetic */ List<PlayerInstance> playerInstancesToUpdate;
    private /* synthetic */ long previousTotalWorldTime;
    
    static {
        llllIIlIIlIIIII();
        pmLogger = LogManager.getLogger();
    }
    
    public boolean hasPlayerInstance(final int lllllllllllllIIIIllIIllIIlllllIl, final int lllllllllllllIIIIllIIllIlIIIIIII) {
        final long lllllllllllllIIIIllIIllIIlllllll = lllllllllllllIIIIllIIllIIlllllIl + 2147483647L | lllllllllllllIIIIllIIllIlIIIIIII + 2147483647L << PlayerManager.lIlIllIlllIIll[6];
        if (llllIIlIIlIIllI(this.playerInstances.getValueByKey(lllllllllllllIIIIllIIllIIlllllll))) {
            return PlayerManager.lIlIllIlllIIll[3] != 0;
        }
        return PlayerManager.lIlIllIlllIIll[1] != 0;
    }
    
    private static int llllIIlIIlIIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void addPlayer(final EntityPlayerMP lllllllllllllIIIIllIIllIIlIIllII) {
        final int lllllllllllllIIIIllIIllIIlIlIIIl = (int)lllllllllllllIIIIllIIllIIlIIllII.posX >> PlayerManager.lIlIllIlllIIll[0];
        final int lllllllllllllIIIIllIIllIIlIlIIII = (int)lllllllllllllIIIIllIIllIIlIIllII.posZ >> PlayerManager.lIlIllIlllIIll[0];
        lllllllllllllIIIIllIIllIIlIIllII.managedPosX = lllllllllllllIIIIllIIllIIlIIllII.posX;
        lllllllllllllIIIIllIIllIIlIIllII.managedPosZ = lllllllllllllIIIIllIIllIIlIIllII.posZ;
        int lllllllllllllIIIIllIIllIIlIIllll = lllllllllllllIIIIllIIllIIlIlIIIl - this.playerViewRadius;
        "".length();
        if (((0xB5 ^ 0xAD) & ~(0xDC ^ 0xC4)) != 0x0) {
            return;
        }
        while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIllIIlIIllll, lllllllllllllIIIIllIIllIIlIlIIIl + this.playerViewRadius)) {
            int lllllllllllllIIIIllIIllIIlIIlllI = lllllllllllllIIIIllIIllIIlIlIIII - this.playerViewRadius;
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
            while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIllIIlIIlllI, lllllllllllllIIIIllIIllIIlIlIIII + this.playerViewRadius)) {
                this.getPlayerInstance(lllllllllllllIIIIllIIllIIlIIllll, lllllllllllllIIIIllIIllIIlIIlllI, (boolean)(PlayerManager.lIlIllIlllIIll[3] != 0)).addPlayer(lllllllllllllIIIIllIIllIIlIIllII);
                ++lllllllllllllIIIIllIIllIIlIIlllI;
            }
            ++lllllllllllllIIIIllIIllIIlIIllll;
        }
        this.players.add(lllllllllllllIIIIllIIllIIlIIllII);
        "".length();
        this.filterChunkLoadQueue(lllllllllllllIIIIllIIllIIlIIllII);
    }
    
    public void removePlayer(final EntityPlayerMP lllllllllllllIIIIllIIllIIIIlIlII) {
        final int lllllllllllllIIIIllIIllIIIIlIIll = (int)lllllllllllllIIIIllIIllIIIIlIlII.managedPosX >> PlayerManager.lIlIllIlllIIll[0];
        final int lllllllllllllIIIIllIIllIIIIlIIlI = (int)lllllllllllllIIIIllIIllIIIIlIlII.managedPosZ >> PlayerManager.lIlIllIlllIIll[0];
        int lllllllllllllIIIIllIIllIIIIlIIIl = lllllllllllllIIIIllIIllIIIIlIIll - this.playerViewRadius;
        "".length();
        if (((0xDA ^ 0x8E) & ~(0xC5 ^ 0x91)) != 0x0) {
            return;
        }
        while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIllIIIIlIIIl, lllllllllllllIIIIllIIllIIIIlIIll + this.playerViewRadius)) {
            int lllllllllllllIIIIllIIllIIIIlIIII = lllllllllllllIIIIllIIllIIIIlIIlI - this.playerViewRadius;
            "".length();
            if (null != null) {
                return;
            }
            while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIllIIIIlIIII, lllllllllllllIIIIllIIllIIIIlIIlI + this.playerViewRadius)) {
                final PlayerInstance lllllllllllllIIIIllIIllIIIIIllll = this.getPlayerInstance(lllllllllllllIIIIllIIllIIIIlIIIl, lllllllllllllIIIIllIIllIIIIlIIII, (boolean)(PlayerManager.lIlIllIlllIIll[1] != 0));
                if (llllIIlIIlIIllI(lllllllllllllIIIIllIIllIIIIIllll)) {
                    lllllllllllllIIIIllIIllIIIIIllll.removePlayer(lllllllllllllIIIIllIIllIIIIlIlII);
                }
                ++lllllllllllllIIIIllIIllIIIIlIIII;
            }
            ++lllllllllllllIIIIllIIllIIIIlIIIl;
        }
        this.players.remove(lllllllllllllIIIIllIIllIIIIlIlII);
        "".length();
    }
    
    public PlayerManager(final WorldServer lllllllllllllIIIIllIIllIlIIllIIl) {
        this.players = (List<EntityPlayerMP>)Lists.newArrayList();
        this.playerInstances = new LongHashMap<PlayerInstance>();
        this.playerInstancesToUpdate = (List<PlayerInstance>)Lists.newArrayList();
        this.playerInstanceList = (List<PlayerInstance>)Lists.newArrayList();
        final int[][] xzDirectionsConst = new int[PlayerManager.lIlIllIlllIIll[0]][];
        final int n = PlayerManager.lIlIllIlllIIll[1];
        final int[] array = new int[PlayerManager.lIlIllIlllIIll[2]];
        array[PlayerManager.lIlIllIlllIIll[1]] = PlayerManager.lIlIllIlllIIll[3];
        xzDirectionsConst[n] = array;
        final int n2 = PlayerManager.lIlIllIlllIIll[3];
        final int[] array2 = new int[PlayerManager.lIlIllIlllIIll[2]];
        array2[PlayerManager.lIlIllIlllIIll[3]] = PlayerManager.lIlIllIlllIIll[3];
        xzDirectionsConst[n2] = array2;
        final int n3 = PlayerManager.lIlIllIlllIIll[2];
        final int[] array3 = new int[PlayerManager.lIlIllIlllIIll[2]];
        array3[PlayerManager.lIlIllIlllIIll[1]] = PlayerManager.lIlIllIlllIIll[4];
        xzDirectionsConst[n3] = array3;
        final int n4 = PlayerManager.lIlIllIlllIIll[5];
        final int[] array4 = new int[PlayerManager.lIlIllIlllIIll[2]];
        array4[PlayerManager.lIlIllIlllIIll[3]] = PlayerManager.lIlIllIlllIIll[4];
        xzDirectionsConst[n4] = array4;
        this.xzDirectionsConst = xzDirectionsConst;
        this.theWorldServer = lllllllllllllIIIIllIIllIlIIllIIl;
        this.setPlayerViewRadius(lllllllllllllIIIIllIIllIlIIllIIl.getMinecraftServer().getConfigurationManager().getViewDistance());
    }
    
    public void filterChunkLoadQueue(final EntityPlayerMP lllllllllllllIIIIllIIllIIIlllIII) {
        final List<ChunkCoordIntPair> lllllllllllllIIIIllIIllIIIllIlll = (List<ChunkCoordIntPair>)Lists.newArrayList((Iterable)lllllllllllllIIIIllIIllIIIlllIII.loadedChunks);
        int lllllllllllllIIIIllIIllIIIllIllI = PlayerManager.lIlIllIlllIIll[1];
        final int lllllllllllllIIIIllIIllIIIllIlIl = this.playerViewRadius;
        final int lllllllllllllIIIIllIIllIIIllIlII = (int)lllllllllllllIIIIllIIllIIIlllIII.posX >> PlayerManager.lIlIllIlllIIll[0];
        final int lllllllllllllIIIIllIIllIIIllIIll = (int)lllllllllllllIIIIllIIllIIIlllIII.posZ >> PlayerManager.lIlIllIlllIIll[0];
        int lllllllllllllIIIIllIIllIIIllIIlI = PlayerManager.lIlIllIlllIIll[1];
        int lllllllllllllIIIIllIIllIIIllIIIl = PlayerManager.lIlIllIlllIIll[1];
        ChunkCoordIntPair lllllllllllllIIIIllIIllIIIllIIII = this.getPlayerInstance(lllllllllllllIIIIllIIllIIIllIlII, lllllllllllllIIIIllIIllIIIllIIll, (boolean)(PlayerManager.lIlIllIlllIIll[3] != 0)).chunkCoords;
        lllllllllllllIIIIllIIllIIIlllIII.loadedChunks.clear();
        if (llllIIlIIlIIlII(lllllllllllllIIIIllIIllIIIllIlll.contains(lllllllllllllIIIIllIIllIIIllIIII) ? 1 : 0)) {
            lllllllllllllIIIIllIIllIIIlllIII.loadedChunks.add(lllllllllllllIIIIllIIllIIIllIIII);
            "".length();
        }
        int lllllllllllllIIIIllIIllIIIlIllll = PlayerManager.lIlIllIlllIIll[3];
        "".length();
        if ("   ".length() <= " ".length()) {
            return;
        }
        while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIllIIIlIllll, lllllllllllllIIIIllIIllIIIllIlIl * PlayerManager.lIlIllIlllIIll[2])) {
            int lllllllllllllIIIIllIIllIIIlIlllI = PlayerManager.lIlIllIlllIIll[1];
            "".length();
            if ((0x4C ^ 0x49) <= 0) {
                return;
            }
            while (!llllIIlIIlIIIll(lllllllllllllIIIIllIIllIIIlIlllI, PlayerManager.lIlIllIlllIIll[2])) {
                final int[] lllllllllllllIIIIllIIllIIIlIllIl = this.xzDirectionsConst[lllllllllllllIIIIllIIllIIIllIllI++ % PlayerManager.lIlIllIlllIIll[0]];
                int lllllllllllllIIIIllIIllIIIlIllII = PlayerManager.lIlIllIlllIIll[1];
                "".length();
                if (((0xEF ^ 0xC0) & ~(0x14 ^ 0x3B) & ~((0x31 ^ 0x11) & ~(0xBF ^ 0x9F))) < -" ".length()) {
                    return;
                }
                while (!llllIIlIIlIIIll(lllllllllllllIIIIllIIllIIIlIllII, lllllllllllllIIIIllIIllIIIlIllll)) {
                    lllllllllllllIIIIllIIllIIIllIIlI += lllllllllllllIIIIllIIllIIIlIllIl[PlayerManager.lIlIllIlllIIll[1]];
                    lllllllllllllIIIIllIIllIIIllIIIl += lllllllllllllIIIIllIIllIIIlIllIl[PlayerManager.lIlIllIlllIIll[3]];
                    lllllllllllllIIIIllIIllIIIllIIII = this.getPlayerInstance(lllllllllllllIIIIllIIllIIIllIlII + lllllllllllllIIIIllIIllIIIllIIlI, lllllllllllllIIIIllIIllIIIllIIll + lllllllllllllIIIIllIIllIIIllIIIl, (boolean)(PlayerManager.lIlIllIlllIIll[3] != 0)).chunkCoords;
                    if (llllIIlIIlIIlII(lllllllllllllIIIIllIIllIIIllIlll.contains(lllllllllllllIIIIllIIllIIIllIIII) ? 1 : 0)) {
                        lllllllllllllIIIIllIIllIIIlllIII.loadedChunks.add(lllllllllllllIIIIllIIllIIIllIIII);
                        "".length();
                    }
                    ++lllllllllllllIIIIllIIllIIIlIllII;
                }
                ++lllllllllllllIIIIllIIllIIIlIlllI;
            }
            ++lllllllllllllIIIIllIIllIIIlIllll;
        }
        lllllllllllllIIIIllIIllIIIllIllI %= PlayerManager.lIlIllIlllIIll[0];
        int lllllllllllllIIIIllIIllIIIlIlIll = PlayerManager.lIlIllIlllIIll[1];
        "".length();
        if ("   ".length() == -" ".length()) {
            return;
        }
        while (!llllIIlIIlIIIll(lllllllllllllIIIIllIIllIIIlIlIll, lllllllllllllIIIIllIIllIIIllIlIl * PlayerManager.lIlIllIlllIIll[2])) {
            lllllllllllllIIIIllIIllIIIllIIlI += this.xzDirectionsConst[lllllllllllllIIIIllIIllIIIllIllI][PlayerManager.lIlIllIlllIIll[1]];
            lllllllllllllIIIIllIIllIIIllIIIl += this.xzDirectionsConst[lllllllllllllIIIIllIIllIIIllIllI][PlayerManager.lIlIllIlllIIll[3]];
            lllllllllllllIIIIllIIllIIIllIIII = this.getPlayerInstance(lllllllllllllIIIIllIIllIIIllIlII + lllllllllllllIIIIllIIllIIIllIIlI, lllllllllllllIIIIllIIllIIIllIIll + lllllllllllllIIIIllIIllIIIllIIIl, (boolean)(PlayerManager.lIlIllIlllIIll[3] != 0)).chunkCoords;
            if (llllIIlIIlIIlII(lllllllllllllIIIIllIIllIIIllIlll.contains(lllllllllllllIIIIllIIllIIIllIIII) ? 1 : 0)) {
                lllllllllllllIIIIllIIllIIIlllIII.loadedChunks.add(lllllllllllllIIIIllIIllIIIllIIII);
                "".length();
            }
            ++lllllllllllllIIIIllIIllIIIlIlIll;
        }
    }
    
    private static boolean llllIIlIIlIlIIl(final int lllllllllllllIIIIllIIlIllIIIIlIl, final int lllllllllllllIIIIllIIlIllIIIIlII) {
        return lllllllllllllIIIIllIIlIllIIIIlIl <= lllllllllllllIIIIllIIlIllIIIIlII;
    }
    
    public WorldServer getWorldServer() {
        return this.theWorldServer;
    }
    
    public boolean isPlayerWatchingChunk(final EntityPlayerMP lllllllllllllIIIIllIIlIllIlllIIl, final int lllllllllllllIIIIllIIlIllIlllIII, final int lllllllllllllIIIIllIIlIllIllIlll) {
        final PlayerInstance lllllllllllllIIIIllIIlIllIlllIll = this.getPlayerInstance(lllllllllllllIIIIllIIlIllIlllIII, lllllllllllllIIIIllIIlIllIllIlll, (boolean)(PlayerManager.lIlIllIlllIIll[1] != 0));
        if (llllIIlIIlIIllI(lllllllllllllIIIIllIIlIllIlllIll) && llllIIlIIlIIlII(lllllllllllllIIIIllIIlIllIlllIll.playersWatchingChunk.contains(lllllllllllllIIIIllIIlIllIlllIIl) ? 1 : 0) && llllIIlIIlIIlIl(lllllllllllllIIIIllIIlIllIlllIIl.loadedChunks.contains(lllllllllllllIIIIllIIlIllIlllIll.chunkCoords) ? 1 : 0)) {
            return PlayerManager.lIlIllIlllIIll[3] != 0;
        }
        return PlayerManager.lIlIllIlllIIll[1] != 0;
    }
    
    public void setPlayerViewRadius(int lllllllllllllIIIIllIIlIllIIlllll) {
        lllllllllllllIIIIllIIlIllIIlllll = MathHelper.clamp_int((int)lllllllllllllIIIIllIIlIllIIlllll, PlayerManager.lIlIllIlllIIll[5], PlayerManager.lIlIllIlllIIll[6]);
        if (llllIIlIIlIllII((int)lllllllllllllIIIIllIIlIllIIlllll, this.playerViewRadius)) {
            final int lllllllllllllIIIIllIIlIllIlIlIIl = (int)(lllllllllllllIIIIllIIlIllIIlllll - this.playerViewRadius);
            final long lllllllllllllIIIIllIIlIllIIlllII = (long)Lists.newArrayList((Iterable)this.players).iterator();
            "".length();
            if (((0xB4 ^ 0x99) & ~(0xA8 ^ 0x85)) != 0x0) {
                return;
            }
            while (!llllIIlIIlIIlIl(((Iterator)lllllllllllllIIIIllIIlIllIIlllII).hasNext() ? 1 : 0)) {
                final EntityPlayerMP lllllllllllllIIIIllIIlIllIlIlIII = ((Iterator<EntityPlayerMP>)lllllllllllllIIIIllIIlIllIIlllII).next();
                final int lllllllllllllIIIIllIIlIllIlIIlll = (int)lllllllllllllIIIIllIIlIllIlIlIII.posX >> PlayerManager.lIlIllIlllIIll[0];
                final int lllllllllllllIIIIllIIlIllIlIIllI = (int)lllllllllllllIIIIllIIlIllIlIlIII.posZ >> PlayerManager.lIlIllIlllIIll[0];
                if (llllIIlIIlIIIlI(lllllllllllllIIIIllIIlIllIlIlIIl)) {
                    int lllllllllllllIIIIllIIlIllIlIIlIl = (int)(lllllllllllllIIIIllIIlIllIlIIlll - lllllllllllllIIIIllIIlIllIIlllll);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIlIllIlIIlIl, (int)(lllllllllllllIIIIllIIlIllIlIIlll + lllllllllllllIIIIllIIlIllIIlllll))) {
                        int lllllllllllllIIIIllIIlIllIlIIlII = (int)(lllllllllllllIIIIllIIlIllIlIIllI - lllllllllllllIIIIllIIlIllIIlllll);
                        "".length();
                        if ((151 + 112 - 226 + 134 ^ 85 + 147 - 153 + 96) <= " ".length()) {
                            return;
                        }
                        while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIlIllIlIIlII, (int)(lllllllllllllIIIIllIIlIllIlIIllI + lllllllllllllIIIIllIIlIllIIlllll))) {
                            final PlayerInstance lllllllllllllIIIIllIIlIllIlIIIll = this.getPlayerInstance(lllllllllllllIIIIllIIlIllIlIIlIl, lllllllllllllIIIIllIIlIllIlIIlII, (boolean)(PlayerManager.lIlIllIlllIIll[3] != 0));
                            if (llllIIlIIlIIlIl(lllllllllllllIIIIllIIlIllIlIIIll.playersWatchingChunk.contains(lllllllllllllIIIIllIIlIllIlIlIII) ? 1 : 0)) {
                                lllllllllllllIIIIllIIlIllIlIIIll.addPlayer(lllllllllllllIIIIllIIlIllIlIlIII);
                            }
                            ++lllllllllllllIIIIllIIlIllIlIIlII;
                        }
                        ++lllllllllllllIIIIllIIlIllIlIIlIl;
                    }
                    "".length();
                    if (((0xDA ^ 0x92) & ~(0xE7 ^ 0xAF)) < -" ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    int lllllllllllllIIIIllIIlIllIlIIIlI = lllllllllllllIIIIllIIlIllIlIIlll - this.playerViewRadius;
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                    while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIlIllIlIIIlI, lllllllllllllIIIIllIIlIllIlIIlll + this.playerViewRadius)) {
                        int lllllllllllllIIIIllIIlIllIlIIIIl = lllllllllllllIIIIllIIlIllIlIIllI - this.playerViewRadius;
                        "".length();
                        if (-(0x9E ^ 0x9A) > 0) {
                            return;
                        }
                        while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIlIllIlIIIIl, lllllllllllllIIIIllIIlIllIlIIllI + this.playerViewRadius)) {
                            if (llllIIlIIlIIlIl(this.overlaps(lllllllllllllIIIIllIIlIllIlIIIlI, lllllllllllllIIIIllIIlIllIlIIIIl, lllllllllllllIIIIllIIlIllIlIIlll, lllllllllllllIIIIllIIlIllIlIIllI, (int)lllllllllllllIIIIllIIlIllIIlllll) ? 1 : 0)) {
                                this.getPlayerInstance(lllllllllllllIIIIllIIlIllIlIIIlI, lllllllllllllIIIIllIIlIllIlIIIIl, (boolean)(PlayerManager.lIlIllIlllIIll[3] != 0)).removePlayer(lllllllllllllIIIIllIIlIllIlIlIII);
                            }
                            ++lllllllllllllIIIIllIIlIllIlIIIIl;
                        }
                        ++lllllllllllllIIIIllIIlIllIlIIIlI;
                    }
                }
            }
            this.playerViewRadius = (int)lllllllllllllIIIIllIIlIllIIlllll;
        }
    }
    
    private static boolean llllIIlIIlIllII(final int lllllllllllllIIIIllIIlIlIlllIIIl, final int lllllllllllllIIIIllIIlIlIlllIIII) {
        return lllllllllllllIIIIllIIlIlIlllIIIl != lllllllllllllIIIIllIIlIlIlllIIII;
    }
    
    public static int getFurthestViewableBlock(final int lllllllllllllIIIIllIIlIllIIlIlII) {
        return lllllllllllllIIIIllIIlIllIIlIlII * PlayerManager.lIlIllIlllIIll[8] - PlayerManager.lIlIllIlllIIll[8];
    }
    
    private static boolean llllIIlIIlIIlll(final Object lllllllllllllIIIIllIIlIlIlllllII) {
        return lllllllllllllIIIIllIIlIlIlllllII == null;
    }
    
    private PlayerInstance getPlayerInstance(final int lllllllllllllIIIIllIIllIIlllIIll, final int lllllllllllllIIIIllIIllIIllIllII, final boolean lllllllllllllIIIIllIIllIIlllIIIl) {
        final long lllllllllllllIIIIllIIllIIlllIIII = lllllllllllllIIIIllIIllIIlllIIll + 2147483647L | lllllllllllllIIIIllIIllIIllIllII + 2147483647L << PlayerManager.lIlIllIlllIIll[6];
        PlayerInstance lllllllllllllIIIIllIIllIIllIllll = this.playerInstances.getValueByKey(lllllllllllllIIIIllIIllIIlllIIII);
        if (llllIIlIIlIIlll(lllllllllllllIIIIllIIllIIllIllll) && llllIIlIIlIIlII(lllllllllllllIIIIllIIllIIlllIIIl ? 1 : 0)) {
            lllllllllllllIIIIllIIllIIllIllll = new PlayerInstance(lllllllllllllIIIIllIIllIIlllIIll, lllllllllllllIIIIllIIllIIllIllII);
            this.playerInstances.add(lllllllllllllIIIIllIIllIIlllIIII, lllllllllllllIIIIllIIllIIllIllll);
            this.playerInstanceList.add(lllllllllllllIIIIllIIllIIllIllll);
            "".length();
        }
        return lllllllllllllIIIIllIIllIIllIllll;
    }
    
    public void updateMountedMovingPlayer(final EntityPlayerMP lllllllllllllIIIIllIIlIllllIIIIl) {
        final int lllllllllllllIIIIllIIlIllllIIIII = (int)lllllllllllllIIIIllIIlIllllIIIIl.posX >> PlayerManager.lIlIllIlllIIll[0];
        final int lllllllllllllIIIIllIIlIlllIlllll = (int)lllllllllllllIIIIllIIlIllllIIIIl.posZ >> PlayerManager.lIlIllIlllIIll[0];
        final double lllllllllllllIIIIllIIlIlllIllllI = lllllllllllllIIIIllIIlIllllIIIIl.managedPosX - lllllllllllllIIIIllIIlIllllIIIIl.posX;
        final double lllllllllllllIIIIllIIlIlllIlllIl = lllllllllllllIIIIllIIlIllllIIIIl.managedPosZ - lllllllllllllIIIIllIIlIllllIIIIl.posZ;
        final double lllllllllllllIIIIllIIlIlllIlllII = lllllllllllllIIIIllIIlIlllIllllI * lllllllllllllIIIIllIIlIlllIllllI + lllllllllllllIIIIllIIlIlllIlllIl * lllllllllllllIIIIllIIlIlllIlllIl;
        if (llllIIlIIlIlIll(llllIIlIIlIlIlI(lllllllllllllIIIIllIIlIlllIlllII, 64.0))) {
            final int lllllllllllllIIIIllIIlIlllIllIll = (int)lllllllllllllIIIIllIIlIllllIIIIl.managedPosX >> PlayerManager.lIlIllIlllIIll[0];
            final int lllllllllllllIIIIllIIlIlllIllIlI = (int)lllllllllllllIIIIllIIlIllllIIIIl.managedPosZ >> PlayerManager.lIlIllIlllIIll[0];
            final int lllllllllllllIIIIllIIlIlllIllIIl = this.playerViewRadius;
            final int lllllllllllllIIIIllIIlIlllIllIII = lllllllllllllIIIIllIIlIllllIIIII - lllllllllllllIIIIllIIlIlllIllIll;
            final int lllllllllllllIIIIllIIlIlllIlIlll = lllllllllllllIIIIllIIlIlllIlllll - lllllllllllllIIIIllIIlIlllIllIlI;
            if (!llllIIlIIlIIlIl(lllllllllllllIIIIllIIlIlllIllIII) || llllIIlIIlIIlII(lllllllllllllIIIIllIIlIlllIlIlll)) {
                int lllllllllllllIIIIllIIlIlllIlIllI = lllllllllllllIIIIllIIlIllllIIIII - lllllllllllllIIIIllIIlIlllIllIIl;
                "".length();
                if (((0x65 ^ 0x5F) & ~(0x7A ^ 0x40)) != ((0x41 ^ 0x56) & ~(0x1C ^ 0xB))) {
                    return;
                }
                while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIlIlllIlIllI, lllllllllllllIIIIllIIlIllllIIIII + lllllllllllllIIIIllIIlIlllIllIIl)) {
                    int lllllllllllllIIIIllIIlIlllIlIlIl = lllllllllllllIIIIllIIlIlllIlllll - lllllllllllllIIIIllIIlIlllIllIIl;
                    "".length();
                    if (-" ".length() > (0x5E ^ 0x15 ^ (0x7C ^ 0x33))) {
                        return;
                    }
                    while (!llllIIlIIlIlIII(lllllllllllllIIIIllIIlIlllIlIlIl, lllllllllllllIIIIllIIlIlllIlllll + lllllllllllllIIIIllIIlIlllIllIIl)) {
                        if (llllIIlIIlIIlIl(this.overlaps(lllllllllllllIIIIllIIlIlllIlIllI, lllllllllllllIIIIllIIlIlllIlIlIl, lllllllllllllIIIIllIIlIlllIllIll, lllllllllllllIIIIllIIlIlllIllIlI, lllllllllllllIIIIllIIlIlllIllIIl) ? 1 : 0)) {
                            this.getPlayerInstance(lllllllllllllIIIIllIIlIlllIlIllI, lllllllllllllIIIIllIIlIlllIlIlIl, (boolean)(PlayerManager.lIlIllIlllIIll[3] != 0)).addPlayer(lllllllllllllIIIIllIIlIllllIIIIl);
                        }
                        if (llllIIlIIlIIlIl(this.overlaps(lllllllllllllIIIIllIIlIlllIlIllI - lllllllllllllIIIIllIIlIlllIllIII, lllllllllllllIIIIllIIlIlllIlIlIl - lllllllllllllIIIIllIIlIlllIlIlll, lllllllllllllIIIIllIIlIllllIIIII, lllllllllllllIIIIllIIlIlllIlllll, lllllllllllllIIIIllIIlIlllIllIIl) ? 1 : 0)) {
                            final PlayerInstance lllllllllllllIIIIllIIlIlllIlIlII = this.getPlayerInstance(lllllllllllllIIIIllIIlIlllIlIllI - lllllllllllllIIIIllIIlIlllIllIII, lllllllllllllIIIIllIIlIlllIlIlIl - lllllllllllllIIIIllIIlIlllIlIlll, (boolean)(PlayerManager.lIlIllIlllIIll[1] != 0));
                            if (llllIIlIIlIIllI(lllllllllllllIIIIllIIlIlllIlIlII)) {
                                lllllllllllllIIIIllIIlIlllIlIlII.removePlayer(lllllllllllllIIIIllIIlIllllIIIIl);
                            }
                        }
                        ++lllllllllllllIIIIllIIlIlllIlIlIl;
                    }
                    ++lllllllllllllIIIIllIIlIlllIlIllI;
                }
                this.filterChunkLoadQueue(lllllllllllllIIIIllIIlIllllIIIIl);
                lllllllllllllIIIIllIIlIllllIIIIl.managedPosX = lllllllllllllIIIIllIIlIllllIIIIl.posX;
                lllllllllllllIIIIllIIlIllllIIIIl.managedPosZ = lllllllllllllIIIIllIIlIllllIIIIl.posZ;
            }
        }
    }
    
    private boolean overlaps(final int lllllllllllllIIIIllIIlIlllllllll, final int lllllllllllllIIIIllIIlIllllllllI, final int lllllllllllllIIIIllIIlIlllllllIl, final int lllllllllllllIIIIllIIlIlllllIlIl, final int lllllllllllllIIIIllIIlIllllllIll) {
        final int lllllllllllllIIIIllIIlIllllllIlI = lllllllllllllIIIIllIIlIlllllllll - lllllllllllllIIIIllIIlIlllllllIl;
        final int lllllllllllllIIIIllIIlIllllllIIl = lllllllllllllIIIIllIIlIllllllllI - lllllllllllllIIIIllIIlIlllllIlIl;
        int n;
        if (llllIIlIIlIIIll(lllllllllllllIIIIllIIlIllllllIlI, -lllllllllllllIIIIllIIlIllllllIll) && llllIIlIIlIlIIl(lllllllllllllIIIIllIIlIllllllIlI, lllllllllllllIIIIllIIlIllllllIll)) {
            if (llllIIlIIlIIIll(lllllllllllllIIIIllIIlIllllllIIl, -lllllllllllllIIIIllIIlIllllllIll) && llllIIlIIlIlIIl(lllllllllllllIIIIllIIlIllllllIIl, lllllllllllllIIIIllIIlIllllllIll)) {
                n = PlayerManager.lIlIllIlllIIll[3];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0x27 ^ 0x14) & ~(0xAA ^ 0x99)) != 0x0;
                }
            }
            else {
                n = PlayerManager.lIlIllIlllIIll[1];
                "".length();
                if (null != null) {
                    return ((0xF5 ^ 0xC4) & ~(0x36 ^ 0x7)) != 0x0;
                }
            }
        }
        else {
            n = PlayerManager.lIlIllIlllIIll[1];
        }
        return n != 0;
    }
    
    private static boolean llllIIlIIlIIllI(final Object lllllllllllllIIIIllIIlIlIllllllI) {
        return lllllllllllllIIIIllIIlIlIllllllI != null;
    }
    
    private static boolean llllIIlIIlIlIII(final int lllllllllllllIIIIllIIlIllIIIIIIl, final int lllllllllllllIIIIllIIlIllIIIIIII) {
        return lllllllllllllIIIIllIIlIllIIIIIIl > lllllllllllllIIIIllIIlIllIIIIIII;
    }
    
    private static boolean llllIIlIIlIlIll(final int lllllllllllllIIIIllIIlIlIlllIllI) {
        return lllllllllllllIIIIllIIlIlIlllIllI >= 0;
    }
    
    private static int llllIIlIIlIlIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void llllIIlIIlIIIII() {
        (lIlIllIlllIIll = new int[9])[0] = (0x7A ^ 0x1 ^ 12 + 122 - 101 + 94);
        PlayerManager.lIlIllIlllIIll[1] = ((0xB3 ^ 0x81 ^ " ".length()) & (0x48 ^ 0x29 ^ (0xCB ^ 0x99) ^ -" ".length()));
        PlayerManager.lIlIllIlllIIll[2] = "  ".length();
        PlayerManager.lIlIllIlllIIll[3] = " ".length();
        PlayerManager.lIlIllIlllIIll[4] = -" ".length();
        PlayerManager.lIlIllIlllIIll[5] = "   ".length();
        PlayerManager.lIlIllIlllIIll[6] = (0x67 ^ 0x47);
        PlayerManager.lIlIllIlllIIll[7] = (0x45 ^ 0x4A);
        PlayerManager.lIlIllIlllIIll[8] = (0xA7 ^ 0xB7);
    }
    
    private static boolean llllIIlIIlIIlIl(final int lllllllllllllIIIIllIIlIlIllllIII) {
        return lllllllllllllIIIIllIIlIlIllllIII == 0;
    }
    
    private static boolean llllIIlIIlIIIll(final int lllllllllllllIIIIllIIlIllIIIlIIl, final int lllllllllllllIIIIllIIlIllIIIlIII) {
        return lllllllllllllIIIIllIIlIllIIIlIIl >= lllllllllllllIIIIllIIlIllIIIlIII;
    }
    
    private static boolean llllIIlIIlIIlII(final int lllllllllllllIIIIllIIlIlIllllIlI) {
        return lllllllllllllIIIIllIIlIlIllllIlI != 0;
    }
    
    public void updatePlayerInstances() {
        final long lllllllllllllIIIIllIIllIlIIlIIII = this.theWorldServer.getTotalWorldTime();
        if (llllIIlIIlIIIlI(llllIIlIIlIIIIl(lllllllllllllIIIIllIIllIlIIlIIII - this.previousTotalWorldTime, 8000L))) {
            this.previousTotalWorldTime = lllllllllllllIIIIllIIllIlIIlIIII;
            int lllllllllllllIIIIllIIllIlIIIllll = PlayerManager.lIlIllIlllIIll[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!llllIIlIIlIIIll(lllllllllllllIIIIllIIllIlIIIllll, this.playerInstanceList.size())) {
                final PlayerInstance lllllllllllllIIIIllIIllIlIIIlllI = this.playerInstanceList.get(lllllllllllllIIIIllIIllIlIIIllll);
                lllllllllllllIIIIllIIllIlIIIlllI.onUpdate();
                lllllllllllllIIIIllIIllIlIIIlllI.processChunk();
                ++lllllllllllllIIIIllIIllIlIIIllll;
            }
            "".length();
            if (-" ".length() == (0x18 ^ 0x1C)) {
                return;
            }
        }
        else {
            int lllllllllllllIIIIllIIllIlIIIllIl = PlayerManager.lIlIllIlllIIll[1];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
            while (!llllIIlIIlIIIll(lllllllllllllIIIIllIIllIlIIIllIl, this.playerInstancesToUpdate.size())) {
                final PlayerInstance lllllllllllllIIIIllIIllIlIIIllII = this.playerInstancesToUpdate.get(lllllllllllllIIIIllIIllIlIIIllIl);
                lllllllllllllIIIIllIIllIlIIIllII.onUpdate();
                ++lllllllllllllIIIIllIIllIlIIIllIl;
            }
        }
        this.playerInstancesToUpdate.clear();
        if (llllIIlIIlIIlII(this.players.isEmpty() ? 1 : 0)) {
            final WorldProvider lllllllllllllIIIIllIIllIlIIIlIll = this.theWorldServer.provider;
            if (llllIIlIIlIIlIl(lllllllllllllIIIIllIIllIlIIIlIll.canRespawnHere() ? 1 : 0)) {
                this.theWorldServer.theChunkProviderServer.unloadAllChunks();
            }
        }
    }
    
    private static boolean llllIIlIIlIIIlI(final int lllllllllllllIIIIllIIlIlIlllIlII) {
        return lllllllllllllIIIIllIIlIlIlllIlII > 0;
    }
    
    public void markBlockForUpdate(final BlockPos lllllllllllllIIIIllIIllIIllIIIlI) {
        final int lllllllllllllIIIIllIIllIIllIIIIl = lllllllllllllIIIIllIIllIIllIIIlI.getX() >> PlayerManager.lIlIllIlllIIll[0];
        final int lllllllllllllIIIIllIIllIIllIIIII = lllllllllllllIIIIllIIllIIllIIIlI.getZ() >> PlayerManager.lIlIllIlllIIll[0];
        final PlayerInstance lllllllllllllIIIIllIIllIIlIlllll = this.getPlayerInstance(lllllllllllllIIIIllIIllIIllIIIIl, lllllllllllllIIIIllIIllIIllIIIII, (boolean)(PlayerManager.lIlIllIlllIIll[1] != 0));
        if (llllIIlIIlIIllI(lllllllllllllIIIIllIIllIIlIlllll)) {
            lllllllllllllIIIIllIIllIIlIlllll.flagChunkForUpdate(lllllllllllllIIIIllIIllIIllIIIlI.getX() & PlayerManager.lIlIllIlllIIll[7], lllllllllllllIIIIllIIllIIllIIIlI.getY(), lllllllllllllIIIIllIIllIIllIIIlI.getZ() & PlayerManager.lIlIllIlllIIll[7]);
        }
    }
    
    class PlayerInstance
    {
        private static final /* synthetic */ String[] lllIIlIIIIIIlI;
        private /* synthetic */ int numBlocksToUpdate;
        private final /* synthetic */ List<EntityPlayerMP> playersWatchingChunk;
        private /* synthetic */ short[] locationOfBlockChange;
        private /* synthetic */ long previousWorldTime;
        private final /* synthetic */ ChunkCoordIntPair chunkCoords;
        private static final /* synthetic */ int[] lllIIlIIIIIIll;
        private /* synthetic */ int flagsYAreasToUpdate;
        
        private static String lIIllllIlIIIlllI(String llllllllllllIlIlllllIlllIIlIllIl, final String llllllllllllIlIlllllIlllIIllIIIl) {
            llllllllllllIlIlllllIlllIIlIllIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllllIlllIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIlllllIlllIIllIIII = new StringBuilder();
            final char[] llllllllllllIlIlllllIlllIIlIllll = llllllllllllIlIlllllIlllIIllIIIl.toCharArray();
            int llllllllllllIlIlllllIlllIIlIlllI = PlayerInstance.lllIIlIIIIIIll[1];
            final short llllllllllllIlIlllllIlllIIlIlIII = (Object)llllllllllllIlIlllllIlllIIlIllIl.toCharArray();
            final boolean llllllllllllIlIlllllIlllIIlIIlll = llllllllllllIlIlllllIlllIIlIlIII.length != 0;
            Exception llllllllllllIlIlllllIlllIIlIIllI = (Exception)PlayerInstance.lllIIlIIIIIIll[1];
            while (lIIllllIlIIlIlII((int)llllllllllllIlIlllllIlllIIlIIllI, llllllllllllIlIlllllIlllIIlIIlll ? 1 : 0)) {
                final char llllllllllllIlIlllllIlllIIllIIll = llllllllllllIlIlllllIlllIIlIlIII[llllllllllllIlIlllllIlllIIlIIllI];
                llllllllllllIlIlllllIlllIIllIIII.append((char)(llllllllllllIlIlllllIlllIIllIIll ^ llllllllllllIlIlllllIlllIIlIllll[llllllllllllIlIlllllIlllIIlIlllI % llllllllllllIlIlllllIlllIIlIllll.length]));
                "".length();
                ++llllllllllllIlIlllllIlllIIlIlllI;
                ++llllllllllllIlIlllllIlllIIlIIllI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIlllllIlllIIllIIII);
        }
        
        public void sendToAllPlayersWatchingChunk(final Packet llllllllllllIlIlllllIlllIllIlllI) {
            int llllllllllllIlIlllllIlllIllIllIl = PlayerInstance.lllIIlIIIIIIll[1];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lIIllllIlIIlIllI(llllllllllllIlIlllllIlllIllIllIl, this.playersWatchingChunk.size())) {
                final EntityPlayerMP llllllllllllIlIlllllIlllIllIllII = this.playersWatchingChunk.get(llllllllllllIlIlllllIlllIllIllIl);
                if (lIIllllIlIIlIIll(llllllllllllIlIlllllIlllIllIllII.loadedChunks.contains(this.chunkCoords) ? 1 : 0)) {
                    llllllllllllIlIlllllIlllIllIllII.playerNetServerHandler.sendPacket(llllllllllllIlIlllllIlllIllIlllI);
                }
                ++llllllllllllIlIlllllIlllIllIllIl;
            }
        }
        
        private static boolean lIIllllIlIIlIIll(final int llllllllllllIlIlllllIlllIIIlIIll) {
            return llllllllllllIlIlllllIlllIIIlIIll == 0;
        }
        
        private void sendTileToAllPlayersWatchingChunk(final TileEntity llllllllllllIlIlllllIlllIlIIIlIl) {
            if (lIIllllIlIIlIlll(llllllllllllIlIlllllIlllIlIIIlIl)) {
                final Packet llllllllllllIlIlllllIlllIlIIIlII = llllllllllllIlIlllllIlllIlIIIlIl.getDescriptionPacket();
                if (lIIllllIlIIlIlll(llllllllllllIlIlllllIlllIlIIIlII)) {
                    this.sendToAllPlayersWatchingChunk(llllllllllllIlIlllllIlllIlIIIlII);
                }
            }
        }
        
        public PlayerInstance(final int llllllllllllIlIlllllIllllIlIIIlI, final int llllllllllllIlIlllllIllllIlIIlIl) {
            this.playersWatchingChunk = (List<EntityPlayerMP>)Lists.newArrayList();
            this.locationOfBlockChange = new short[PlayerInstance.lllIIlIIIIIIll[0]];
            this.chunkCoords = new ChunkCoordIntPair(llllllllllllIlIlllllIllllIlIIIlI, llllllllllllIlIlllllIllllIlIIlIl);
            PlayerManager.this.getWorldServer().theChunkProviderServer.loadChunk(llllllllllllIlIlllllIllllIlIIIlI, llllllllllllIlIlllllIllllIlIIlIl);
            "".length();
        }
        
        private static void lIIllllIlIIlIIII() {
            (lllIIlIIIIIIll = new int[12])[0] = (0xCD ^ 0x8D);
            PlayerInstance.lllIIlIIIIIIll[1] = ((0x94 ^ 0xA3 ^ (0xE5 ^ 0x84)) & (0x36 ^ 0x59 ^ (0x58 ^ 0x61) ^ -" ".length()));
            PlayerInstance.lllIIlIIIIIIll[2] = "   ".length();
            PlayerInstance.lllIIlIIIIIIll[3] = " ".length();
            PlayerInstance.lllIIlIIIIIIll[4] = "  ".length();
            PlayerInstance.lllIIlIIIIIIll[5] = (0x9C ^ 0xBC);
            PlayerInstance.lllIIlIIIIIIll[6] = (71 + 137 - 199 + 168 ^ 175 + 13 - 187 + 180);
            PlayerInstance.lllIIlIIIIIIll[7] = (0x23 ^ 0x2F);
            PlayerInstance.lllIIlIIIIIIll[8] = (144 + 98 - 222 + 153 ^ 153 + 40 - 160 + 132);
            PlayerInstance.lllIIlIIIIIIll[9] = (59 + 130 - 100 + 44 ^ 30 + 79 - 34 + 63);
            PlayerInstance.lllIIlIIIIIIll[10] = (74 + 144 - 192 + 141 ^ 110 + 91 - 26 + 8);
            PlayerInstance.lllIIlIIIIIIll[11] = 27 + 131 - 95 + 79 + (0x50 ^ 0x2B) - (180 + 67 - 214 + 181) + (65 + 185 - 93 + 47);
        }
        
        private static void lIIllllIlIIIllll() {
            (lllIIlIIIIIIlI = new String[PlayerInstance.lllIIlIIIIIIll[3]])[PlayerInstance.lllIIlIIIIIIll[1]] = lIIllllIlIIIlllI("MAkEBhQSSBkFURcMCUoBGgkUDwNYSBYXURcEHw8QEhFNAwJWAQNKEh4dAwFRDRVBSgoL", "vhmjq");
        }
        
        public void onUpdate() {
            if (lIIllllIlIIlIIIl(this.numBlocksToUpdate)) {
                if (lIIllllIlIIlIlIl(this.numBlocksToUpdate, PlayerInstance.lllIIlIIIIIIll[3])) {
                    final int llllllllllllIlIlllllIlllIlIlllll = (this.locationOfBlockChange[PlayerInstance.lllIIlIIIIIIll[1]] >> PlayerInstance.lllIIlIIIIIIll[7] & PlayerInstance.lllIIlIIIIIIll[9]) + this.chunkCoords.chunkXPos * PlayerInstance.lllIIlIIIIIIll[10];
                    final int llllllllllllIlIlllllIlllIlIllllI = this.locationOfBlockChange[PlayerInstance.lllIIlIIIIIIll[1]] & PlayerInstance.lllIIlIIIIIIll[11];
                    final int llllllllllllIlIlllllIlllIlIlllIl = (this.locationOfBlockChange[PlayerInstance.lllIIlIIIIIIll[1]] >> PlayerInstance.lllIIlIIIIIIll[8] & PlayerInstance.lllIIlIIIIIIll[9]) + this.chunkCoords.chunkZPos * PlayerInstance.lllIIlIIIIIIll[10];
                    final BlockPos llllllllllllIlIlllllIlllIlIlllII = new BlockPos(llllllllllllIlIlllllIlllIlIlllll, llllllllllllIlIlllllIlllIlIllllI, llllllllllllIlIlllllIlllIlIlllIl);
                    this.sendToAllPlayersWatchingChunk(new S23PacketBlockChange(PlayerManager.this.theWorldServer, llllllllllllIlIlllllIlllIlIlllII));
                    if (lIIllllIlIIlIIIl(PlayerManager.this.theWorldServer.getBlockState(llllllllllllIlIlllllIlllIlIlllII).getBlock().hasTileEntity() ? 1 : 0)) {
                        this.sendTileToAllPlayersWatchingChunk(PlayerManager.this.theWorldServer.getTileEntity(llllllllllllIlIlllllIlllIlIlllII));
                        "".length();
                        if ("  ".length() == ((0xBD ^ 0xB0 ^ (0xD ^ 0x50)) & (32 + 95 - 66 + 139 ^ 43 + 122 - 144 + 131 ^ -" ".length()))) {
                            return;
                        }
                    }
                }
                else if (lIIllllIlIIlIlIl(this.numBlocksToUpdate, PlayerInstance.lllIIlIIIIIIll[0])) {
                    final int llllllllllllIlIlllllIlllIlIllIll = this.chunkCoords.chunkXPos * PlayerInstance.lllIIlIIIIIIll[10];
                    final int llllllllllllIlIlllllIlllIlIllIlI = this.chunkCoords.chunkZPos * PlayerInstance.lllIIlIIIIIIll[10];
                    this.sendToAllPlayersWatchingChunk(new S21PacketChunkData(PlayerManager.this.theWorldServer.getChunkFromChunkCoords(this.chunkCoords.chunkXPos, this.chunkCoords.chunkZPos), (boolean)(PlayerInstance.lllIIlIIIIIIll[1] != 0), this.flagsYAreasToUpdate));
                    int llllllllllllIlIlllllIlllIlIllIIl = PlayerInstance.lllIIlIIIIIIll[1];
                    "".length();
                    if ((0x6B ^ 0x6F) < 0) {
                        return;
                    }
                    while (!lIIllllIlIIlIllI(llllllllllllIlIlllllIlllIlIllIIl, PlayerInstance.lllIIlIIIIIIll[10])) {
                        if (lIIllllIlIIlIIIl(this.flagsYAreasToUpdate & PlayerInstance.lllIIlIIIIIIll[3] << llllllllllllIlIlllllIlllIlIllIIl)) {
                            final int llllllllllllIlIlllllIlllIlIllIII = llllllllllllIlIlllllIlllIlIllIIl << PlayerInstance.lllIIlIIIIIIll[6];
                            final List<TileEntity> llllllllllllIlIlllllIlllIlIlIlll = PlayerManager.this.theWorldServer.getTileEntitiesIn(llllllllllllIlIlllllIlllIlIllIll, llllllllllllIlIlllllIlllIlIllIII, llllllllllllIlIlllllIlllIlIllIlI, llllllllllllIlIlllllIlllIlIllIll + PlayerInstance.lllIIlIIIIIIll[10], llllllllllllIlIlllllIlllIlIllIII + PlayerInstance.lllIIlIIIIIIll[10], llllllllllllIlIlllllIlllIlIllIlI + PlayerInstance.lllIIlIIIIIIll[10]);
                            int llllllllllllIlIlllllIlllIlIlIllI = PlayerInstance.lllIIlIIIIIIll[1];
                            "".length();
                            if ((0x98 ^ 0x9C) < "  ".length()) {
                                return;
                            }
                            while (!lIIllllIlIIlIllI(llllllllllllIlIlllllIlllIlIlIllI, llllllllllllIlIlllllIlllIlIlIlll.size())) {
                                this.sendTileToAllPlayersWatchingChunk(llllllllllllIlIlllllIlllIlIlIlll.get(llllllllllllIlIlllllIlllIlIlIllI));
                                ++llllllllllllIlIlllllIlllIlIlIllI;
                            }
                        }
                        ++llllllllllllIlIlllllIlllIlIllIIl;
                    }
                    "".length();
                    if (((97 + 65 - 83 + 118 ^ 125 + 88 - 161 + 92) & (0xAB ^ 0xA1 ^ (0xE ^ 0x51) ^ -" ".length())) > "  ".length()) {
                        return;
                    }
                }
                else {
                    this.sendToAllPlayersWatchingChunk(new S22PacketMultiBlockChange(this.numBlocksToUpdate, this.locationOfBlockChange, PlayerManager.this.theWorldServer.getChunkFromChunkCoords(this.chunkCoords.chunkXPos, this.chunkCoords.chunkZPos)));
                    int llllllllllllIlIlllllIlllIlIlIlIl = PlayerInstance.lllIIlIIIIIIll[1];
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                    while (!lIIllllIlIIlIllI(llllllllllllIlIlllllIlllIlIlIlIl, this.numBlocksToUpdate)) {
                        final int llllllllllllIlIlllllIlllIlIlIlII = (this.locationOfBlockChange[llllllllllllIlIlllllIlllIlIlIlIl] >> PlayerInstance.lllIIlIIIIIIll[7] & PlayerInstance.lllIIlIIIIIIll[9]) + this.chunkCoords.chunkXPos * PlayerInstance.lllIIlIIIIIIll[10];
                        final int llllllllllllIlIlllllIlllIlIlIIll = this.locationOfBlockChange[llllllllllllIlIlllllIlllIlIlIlIl] & PlayerInstance.lllIIlIIIIIIll[11];
                        final int llllllllllllIlIlllllIlllIlIlIIlI = (this.locationOfBlockChange[llllllllllllIlIlllllIlllIlIlIlIl] >> PlayerInstance.lllIIlIIIIIIll[8] & PlayerInstance.lllIIlIIIIIIll[9]) + this.chunkCoords.chunkZPos * PlayerInstance.lllIIlIIIIIIll[10];
                        final BlockPos llllllllllllIlIlllllIlllIlIlIIIl = new BlockPos(llllllllllllIlIlllllIlllIlIlIlII, llllllllllllIlIlllllIlllIlIlIIll, llllllllllllIlIlllllIlllIlIlIIlI);
                        if (lIIllllIlIIlIIIl(PlayerManager.this.theWorldServer.getBlockState(llllllllllllIlIlllllIlllIlIlIIIl).getBlock().hasTileEntity() ? 1 : 0)) {
                            this.sendTileToAllPlayersWatchingChunk(PlayerManager.this.theWorldServer.getTileEntity(llllllllllllIlIlllllIlllIlIlIIIl));
                        }
                        ++llllllllllllIlIlllllIlllIlIlIlIl;
                    }
                }
                this.numBlocksToUpdate = PlayerInstance.lllIIlIIIIIIll[1];
                this.flagsYAreasToUpdate = PlayerInstance.lllIIlIIIIIIll[1];
            }
        }
        
        private static boolean lIIllllIlIIlIlIl(final int llllllllllllIlIlllllIlllIIlIIIlI, final int llllllllllllIlIlllllIlllIIlIIIIl) {
            return llllllllllllIlIlllllIlllIIlIIIlI == llllllllllllIlIlllllIlllIIlIIIIl;
        }
        
        private static boolean lIIllllIlIIlIlII(final int llllllllllllIlIlllllIlllIIIllIlI, final int llllllllllllIlIlllllIlllIIIllIIl) {
            return llllllllllllIlIlllllIlllIIIllIlI < llllllllllllIlIlllllIlllIIIllIIl;
        }
        
        private void increaseInhabitedTime(final Chunk llllllllllllIlIlllllIllllIIIlIII) {
            llllllllllllIlIlllllIllllIIIlIII.setInhabitedTime(llllllllllllIlIlllllIllllIIIlIII.getInhabitedTime() + PlayerManager.this.theWorldServer.getTotalWorldTime() - this.previousWorldTime);
            this.previousWorldTime = PlayerManager.this.theWorldServer.getTotalWorldTime();
        }
        
        public void removePlayer(final EntityPlayerMP llllllllllllIlIlllllIllllIIlIIIl) {
            if (lIIllllIlIIlIIIl(this.playersWatchingChunk.contains(llllllllllllIlIlllllIllllIIlIIIl) ? 1 : 0)) {
                final Chunk llllllllllllIlIlllllIllllIIlIlII = PlayerManager.this.theWorldServer.getChunkFromChunkCoords(this.chunkCoords.chunkXPos, this.chunkCoords.chunkZPos);
                if (lIIllllIlIIlIIIl(llllllllllllIlIlllllIllllIIlIlII.isPopulated() ? 1 : 0)) {
                    llllllllllllIlIlllllIllllIIlIIIl.playerNetServerHandler.sendPacket(new S21PacketChunkData(llllllllllllIlIlllllIllllIIlIlII, (boolean)(PlayerInstance.lllIIlIIIIIIll[3] != 0), PlayerInstance.lllIIlIIIIIIll[1]));
                }
                this.playersWatchingChunk.remove(llllllllllllIlIlllllIllllIIlIIIl);
                "".length();
                llllllllllllIlIlllllIllllIIlIIIl.loadedChunks.remove(this.chunkCoords);
                "".length();
                if (lIIllllIlIIlIIIl(this.playersWatchingChunk.isEmpty() ? 1 : 0)) {
                    final long llllllllllllIlIlllllIllllIIlIIll = this.chunkCoords.chunkXPos + 2147483647L | this.chunkCoords.chunkZPos + 2147483647L << PlayerInstance.lllIIlIIIIIIll[5];
                    this.increaseInhabitedTime(llllllllllllIlIlllllIllllIIlIlII);
                    PlayerManager.this.playerInstances.remove(llllllllllllIlIlllllIllllIIlIIll);
                    "".length();
                    PlayerManager.this.playerInstanceList.remove(this);
                    "".length();
                    if (lIIllllIlIIlIIlI(this.numBlocksToUpdate)) {
                        PlayerManager.this.playerInstancesToUpdate.remove(this);
                        "".length();
                    }
                    PlayerManager.this.getWorldServer().theChunkProviderServer.dropChunk(this.chunkCoords.chunkXPos, this.chunkCoords.chunkZPos);
                }
            }
        }
        
        private static boolean lIIllllIlIIlIIIl(final int llllllllllllIlIlllllIlllIIIlIlIl) {
            return llllllllllllIlIlllllIlllIIIlIlIl != 0;
        }
        
        public void addPlayer(final EntityPlayerMP llllllllllllIlIlllllIllllIIllIll) {
            if (lIIllllIlIIlIIIl(this.playersWatchingChunk.contains(llllllllllllIlIlllllIllllIIllIll) ? 1 : 0)) {
                final Logger access$0 = PlayerManager.pmLogger;
                final String s = PlayerInstance.lllIIlIIIIIIlI[PlayerInstance.lllIIlIIIIIIll[1]];
                final Object[] array = new Object[PlayerInstance.lllIIlIIIIIIll[2]];
                array[PlayerInstance.lllIIlIIIIIIll[1]] = llllllllllllIlIlllllIllllIIllIll;
                array[PlayerInstance.lllIIlIIIIIIll[3]] = this.chunkCoords.chunkXPos;
                array[PlayerInstance.lllIIlIIIIIIll[4]] = this.chunkCoords.chunkZPos;
                access$0.debug(s, array);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                if (lIIllllIlIIlIIIl(this.playersWatchingChunk.isEmpty() ? 1 : 0)) {
                    this.previousWorldTime = PlayerManager.this.theWorldServer.getTotalWorldTime();
                }
                this.playersWatchingChunk.add(llllllllllllIlIlllllIllllIIllIll);
                "".length();
                llllllllllllIlIlllllIllllIIllIll.loadedChunks.add(this.chunkCoords);
                "".length();
            }
        }
        
        private static boolean lIIllllIlIIlIllI(final int llllllllllllIlIlllllIlllIIIllllI, final int llllllllllllIlIlllllIlllIIIlllIl) {
            return llllllllllllIlIlllllIlllIIIllllI >= llllllllllllIlIlllllIlllIIIlllIl;
        }
        
        private static boolean lIIllllIlIIlIlll(final Object llllllllllllIlIlllllIlllIIIlIlll) {
            return llllllllllllIlIlllllIlllIIIlIlll != null;
        }
        
        private static boolean lIIllllIlIIlIIlI(final int llllllllllllIlIlllllIlllIIIlIIIl) {
            return llllllllllllIlIlllllIlllIIIlIIIl > 0;
        }
        
        public void processChunk() {
            this.increaseInhabitedTime(PlayerManager.this.theWorldServer.getChunkFromChunkCoords(this.chunkCoords.chunkXPos, this.chunkCoords.chunkZPos));
        }
        
        static {
            lIIllllIlIIlIIII();
            lIIllllIlIIIllll();
        }
        
        public void flagChunkForUpdate(final int llllllllllllIlIlllllIlllIllllIII, final int llllllllllllIlIlllllIlllIlllIlll, final int llllllllllllIlIlllllIlllIlllllII) {
            if (lIIllllIlIIlIIll(this.numBlocksToUpdate)) {
                PlayerManager.this.playerInstancesToUpdate.add(this);
                "".length();
            }
            this.flagsYAreasToUpdate |= PlayerInstance.lllIIlIIIIIIll[3] << (llllllllllllIlIlllllIlllIlllIlll >> PlayerInstance.lllIIlIIIIIIll[6]);
            if (lIIllllIlIIlIlII(this.numBlocksToUpdate, PlayerInstance.lllIIlIIIIIIll[0])) {
                final short llllllllllllIlIlllllIlllIllllIll = (short)(llllllllllllIlIlllllIlllIllllIII << PlayerInstance.lllIIlIIIIIIll[7] | llllllllllllIlIlllllIlllIlllllII << PlayerInstance.lllIIlIIIIIIll[8] | llllllllllllIlIlllllIlllIlllIlll);
                int llllllllllllIlIlllllIlllIllllIlI = PlayerInstance.lllIIlIIIIIIll[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                while (!lIIllllIlIIlIllI(llllllllllllIlIlllllIlllIllllIlI, this.numBlocksToUpdate)) {
                    if (lIIllllIlIIlIlIl(this.locationOfBlockChange[llllllllllllIlIlllllIlllIllllIlI], llllllllllllIlIlllllIlllIllllIll)) {
                        return;
                    }
                    ++llllllllllllIlIlllllIlllIllllIlI;
                }
                final short[] locationOfBlockChange = this.locationOfBlockChange;
                final int numBlocksToUpdate = this.numBlocksToUpdate;
                this.numBlocksToUpdate = numBlocksToUpdate + PlayerInstance.lllIIlIIIIIIll[3];
                locationOfBlockChange[numBlocksToUpdate] = llllllllllllIlIlllllIlllIllllIll;
            }
        }
    }
}
