// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.ArrayList;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.network.play.server.S24PacketBlockAction;
import com.google.common.base.Predicate;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.WorldChunkManager;
import java.util.Random;
import java.util.Collection;
import net.minecraft.util.WeightedRandom;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import org.apache.logging.log4j.LogManager;
import net.minecraft.entity.INpc;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.S2APacketParticles;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.scoreboard.ScoreboardSaveData;
import net.minecraft.scoreboard.ServerScoreboard;
import net.minecraft.village.VillageCollection;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.gen.feature.WorldGeneratorBonusChest;
import net.minecraft.tileentity.TileEntity;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.block.BlockEventData;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import java.util.Iterator;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.CrashReport;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.init.Blocks;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityTracker;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.gen.ChunkProviderServer;
import net.minecraft.village.VillageSiege;
import net.minecraft.server.management.PlayerManager;
import org.apache.logging.log4j.Logger;
import java.util.Set;
import net.minecraft.entity.Entity;
import java.util.UUID;
import java.util.Map;
import java.util.TreeSet;
import java.util.List;
import net.minecraft.util.IThreadListener;

public class WorldServer extends World implements IThreadListener
{
    private /* synthetic */ List<NextTickListEntry> pendingTickListEntriesThisTick;
    private final /* synthetic */ TreeSet<NextTickListEntry> pendingTickListEntriesTreeSet;
    private final /* synthetic */ Map<UUID, Entity> entitiesByUuid;
    private /* synthetic */ int blockEventCacheIndex;
    private final /* synthetic */ Set<NextTickListEntry> pendingTickListEntriesHashSet;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ PlayerManager thePlayerManager;
    private static final /* synthetic */ int[] lIlIIIlIllllII;
    protected final /* synthetic */ VillageSiege villageSiege;
    private /* synthetic */ boolean allPlayersSleeping;
    public /* synthetic */ ChunkProviderServer theChunkProviderServer;
    private final /* synthetic */ MinecraftServer mcServer;
    private /* synthetic */ ServerBlockEventList[] field_147490_S;
    private /* synthetic */ int updateEntityTick;
    private static final /* synthetic */ List<WeightedRandomChestContent> bonusChestContent;
    private final /* synthetic */ SpawnerAnimals mobSpawner;
    private final /* synthetic */ EntityTracker theEntityTracker;
    private static final /* synthetic */ String[] lIlIIIlIllIIll;
    private final /* synthetic */ Teleporter worldTeleporter;
    
    public boolean areAllPlayersAsleep() {
        if (!lllIIIllIlIIIII(this.allPlayersSleeping ? 1 : 0) || !lllIIIllIlIIIlI(this.isRemote ? 1 : 0)) {
            return WorldServer.lIlIIIlIllllII[1] != 0;
        }
        final String lllllllllllllIIIllllIllIlIllIIIl = (String)this.playerEntities.iterator();
        "".length();
        if ((0x35 ^ 0x31) != (0x36 ^ 0x32)) {
            return ((0x22 ^ 0x3C) & ~(0xB2 ^ 0xAC)) != 0x0;
        }
        while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIllIlIllIIIl).hasNext() ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIIllllIllIlIllIlII = ((Iterator<EntityPlayer>)lllllllllllllIIIllllIllIlIllIIIl).next();
            if (!lllIIIllIlIIIlI(lllllllllllllIIIllllIllIlIllIlII.isSpectator() ? 1 : 0) || lllIIIllIlIIIlI(lllllllllllllIIIllllIllIlIllIlII.isPlayerFullyAsleep() ? 1 : 0)) {
                return WorldServer.lIlIIIlIllllII[1] != 0;
            }
        }
        return WorldServer.lIlIIIlIllllII[2] != 0;
    }
    
    @Override
    protected void updateBlocks() {
        super.updateBlocks();
        if (lllIIIllIlIlIII(this.worldInfo.getTerrainType(), WorldType.DEBUG_WORLD)) {
            final byte lllllllllllllIIIllllIllIIllllIII = (byte)this.activeChunkSet.iterator();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIllIIllllIII).hasNext() ? 1 : 0)) {
                final ChunkCoordIntPair lllllllllllllIIIllllIllIlIIIllll = ((Iterator<ChunkCoordIntPair>)lllllllllllllIIIllllIllIIllllIII).next();
                this.getChunkFromChunkCoords(lllllllllllllIIIllllIllIlIIIllll.chunkXPos, lllllllllllllIIIllllIllIlIIIllll.chunkZPos).func_150804_b((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
            }
            "".length();
            if ((0x3F ^ 0x3B) != (0x73 ^ 0x77)) {
                return;
            }
        }
        else {
            int lllllllllllllIIIllllIllIlIIIlllI = WorldServer.lIlIIIlIllllII[1];
            int lllllllllllllIIIllllIllIlIIIllIl = WorldServer.lIlIIIlIllllII[1];
            final char lllllllllllllIIIllllIllIIlllIllI = (char)this.activeChunkSet.iterator();
            "".length();
            if ((0x22 ^ 0x26) < "  ".length()) {
                return;
            }
            while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIllIIlllIllI).hasNext() ? 1 : 0)) {
                final ChunkCoordIntPair lllllllllllllIIIllllIllIlIIIllII = ((Iterator<ChunkCoordIntPair>)lllllllllllllIIIllllIllIIlllIllI).next();
                final int lllllllllllllIIIllllIllIlIIIlIll = lllllllllllllIIIllllIllIlIIIllII.chunkXPos * WorldServer.lIlIIIlIllllII[13];
                final int lllllllllllllIIIllllIllIlIIIlIlI = lllllllllllllIIIllllIllIlIIIllII.chunkZPos * WorldServer.lIlIIIlIllllII[13];
                this.theProfiler.startSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[14]]);
                final Chunk lllllllllllllIIIllllIllIlIIIlIIl = this.getChunkFromChunkCoords(lllllllllllllIIIllllIllIlIIIllII.chunkXPos, lllllllllllllIIIllllIllIlIIIllII.chunkZPos);
                this.playMoodSoundAndCheckLight(lllllllllllllIIIllllIllIlIIIlIll, lllllllllllllIIIllllIllIlIIIlIlI, lllllllllllllIIIllllIllIlIIIlIIl);
                this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[15]]);
                lllllllllllllIIIllllIllIlIIIlIIl.func_150804_b((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
                this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[16]]);
                if (lllIIIllIlIIIlI(this.rand.nextInt(WorldServer.lIlIIIlIllllII[17])) && lllIIIllIlIIIII(this.isRaining() ? 1 : 0) && lllIIIllIlIIIII(this.isThundering() ? 1 : 0)) {
                    this.updateLCG = this.updateLCG * WorldServer.lIlIIIlIllllII[3] + WorldServer.lIlIIIlIllllII[18];
                    final int lllllllllllllIIIllllIllIlIIIlIII = this.updateLCG >> WorldServer.lIlIIIlIllllII[4];
                    final BlockPos lllllllllllllIIIllllIllIlIIIIlll = this.adjustPosToNearbyEntity(new BlockPos(lllllllllllllIIIllllIllIlIIIlIll + (lllllllllllllIIIllllIllIlIIIlIII & WorldServer.lIlIIIlIllllII[19]), WorldServer.lIlIIIlIllllII[1], lllllllllllllIIIllllIllIlIIIlIlI + (lllllllllllllIIIllllIllIlIIIlIII >> WorldServer.lIlIIIlIllllII[9] & WorldServer.lIlIIIlIllllII[19])));
                    if (lllIIIllIlIIIII(this.canLightningStrike(lllllllllllllIIIllllIllIlIIIIlll) ? 1 : 0)) {
                        this.addWeatherEffect(new EntityLightningBolt(this, lllllllllllllIIIllllIllIlIIIIlll.getX(), lllllllllllllIIIllllIllIlIIIIlll.getY(), lllllllllllllIIIllllIllIlIIIIlll.getZ()));
                        "".length();
                    }
                }
                this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[19]]);
                if (lllIIIllIlIIIlI(this.rand.nextInt(WorldServer.lIlIIIlIllllII[13]))) {
                    this.updateLCG = this.updateLCG * WorldServer.lIlIIIlIllllII[3] + WorldServer.lIlIIIlIllllII[18];
                    final int lllllllllllllIIIllllIllIlIIIIllI = this.updateLCG >> WorldServer.lIlIIIlIllllII[4];
                    final BlockPos lllllllllllllIIIllllIllIlIIIIlIl = this.getPrecipitationHeight(new BlockPos(lllllllllllllIIIllllIllIlIIIlIll + (lllllllllllllIIIllllIllIlIIIIllI & WorldServer.lIlIIIlIllllII[19]), WorldServer.lIlIIIlIllllII[1], lllllllllllllIIIllllIllIlIIIlIlI + (lllllllllllllIIIllllIllIlIIIIllI >> WorldServer.lIlIIIlIllllII[9] & WorldServer.lIlIIIlIllllII[19])));
                    final BlockPos lllllllllllllIIIllllIllIlIIIIlII = lllllllllllllIIIllllIllIlIIIIlIl.down();
                    if (lllIIIllIlIIIII(this.canBlockFreezeNoWater(lllllllllllllIIIllllIllIlIIIIlII) ? 1 : 0)) {
                        this.setBlockState(lllllllllllllIIIllllIllIlIIIIlII, Blocks.ice.getDefaultState());
                        "".length();
                    }
                    if (lllIIIllIlIIIII(this.isRaining() ? 1 : 0) && lllIIIllIlIIIII(this.canSnowAt(lllllllllllllIIIllllIllIlIIIIlIl, (boolean)(WorldServer.lIlIIIlIllllII[2] != 0)) ? 1 : 0)) {
                        this.setBlockState(lllllllllllllIIIllllIllIlIIIIlIl, Blocks.snow_layer.getDefaultState());
                        "".length();
                    }
                    if (lllIIIllIlIIIII(this.isRaining() ? 1 : 0) && lllIIIllIlIIIII(this.getBiomeGenForCoords(lllllllllllllIIIllllIllIlIIIIlII).canSpawnLightningBolt() ? 1 : 0)) {
                        this.getBlockState(lllllllllllllIIIllllIllIlIIIIlII).getBlock().fillWithRain(this, lllllllllllllIIIllllIllIlIIIIlII);
                    }
                }
                this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[13]]);
                final int lllllllllllllIIIllllIllIlIIIIIll = this.getGameRules().getInt(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[20]]);
                if (lllIIIllIIllllI(lllllllllllllIIIllllIllIlIIIIIll)) {
                    final String lllllllllllllIIIllllIllIIllIlllI;
                    final boolean lllllllllllllIIIllllIllIIllIllll = ((ExtendedBlockStorage[])(Object)(lllllllllllllIIIllllIllIIllIlllI = (String)(Object)lllllllllllllIIIllllIllIlIIIlIIl.getBlockStorageArray())).length != 0;
                    int lllllllllllllIIIllllIIllllIIIIlI = WorldServer.lIlIIIlIllllII[1];
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIIllllIIIIlI, lllllllllllllIIIllllIllIIllIllll ? 1 : 0)) {
                        final ExtendedBlockStorage lllllllllllllIIIllllIllIlIIIIIlI = lllllllllllllIIIllllIllIIllIlllI[lllllllllllllIIIllllIIllllIIIIlI];
                        if (lllIIIllIlIIlII(lllllllllllllIIIllllIllIlIIIIIlI) && lllIIIllIlIIIII(lllllllllllllIIIllllIllIlIIIIIlI.getNeedsRandomTick() ? 1 : 0)) {
                            int lllllllllllllIIIllllIllIlIIIIIIl = WorldServer.lIlIIIlIllllII[1];
                            "".length();
                            if ("   ".length() < ((12 + 78 + 141 + 4 ^ 126 + 134 - 244 + 149) & (0xA6 ^ 0xA1 ^ (0xC0 ^ 0x89) ^ -" ".length()))) {
                                return;
                            }
                            while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIllIlIIIIIIl, lllllllllllllIIIllllIllIlIIIIIll)) {
                                this.updateLCG = this.updateLCG * WorldServer.lIlIIIlIllllII[3] + WorldServer.lIlIIIlIllllII[18];
                                final int lllllllllllllIIIllllIllIlIIIIIII = this.updateLCG >> WorldServer.lIlIIIlIllllII[4];
                                final int lllllllllllllIIIllllIllIIlllllll = lllllllllllllIIIllllIllIlIIIIIII & WorldServer.lIlIIIlIllllII[19];
                                final int lllllllllllllIIIllllIllIIllllllI = lllllllllllllIIIllllIllIlIIIIIII >> WorldServer.lIlIIIlIllllII[9] & WorldServer.lIlIIIlIllllII[19];
                                final int lllllllllllllIIIllllIllIIlllllIl = lllllllllllllIIIllllIllIlIIIIIII >> WorldServer.lIlIIIlIllllII[13] & WorldServer.lIlIIIlIllllII[19];
                                ++lllllllllllllIIIllllIllIlIIIllIl;
                                final IBlockState lllllllllllllIIIllllIllIIlllllII = lllllllllllllIIIllllIllIlIIIIIlI.get(lllllllllllllIIIllllIllIIlllllll, lllllllllllllIIIllllIllIIlllllIl, lllllllllllllIIIllllIllIIllllllI);
                                final Block lllllllllllllIIIllllIllIIllllIll = lllllllllllllIIIllllIllIIlllllII.getBlock();
                                if (lllIIIllIlIIIII(lllllllllllllIIIllllIllIIllllIll.getTickRandomly() ? 1 : 0)) {
                                    ++lllllllllllllIIIllllIllIlIIIlllI;
                                    lllllllllllllIIIllllIllIIllllIll.randomTick(this, new BlockPos(lllllllllllllIIIllllIllIIlllllll + lllllllllllllIIIllllIllIlIIIlIll, lllllllllllllIIIllllIllIIlllllIl + lllllllllllllIIIllllIllIlIIIIIlI.getYLocation(), lllllllllllllIIIllllIllIIllllllI + lllllllllllllIIIllllIllIlIIIlIlI), lllllllllllllIIIllllIllIIlllllII, this.rand);
                                }
                                ++lllllllllllllIIIllllIllIlIIIIIIl;
                            }
                        }
                        ++lllllllllllllIIIllllIIllllIIIIlI;
                    }
                }
                this.theProfiler.endSection();
            }
        }
    }
    
    @Override
    protected void onEntityAdded(final Entity lllllllllllllIIIllllIlIIlllIIIlI) {
        super.onEntityAdded(lllllllllllllIIIllllIlIIlllIIIlI);
        this.entitiesById.addKey(lllllllllllllIIIllllIlIIlllIIIlI.getEntityId(), lllllllllllllIIIllllIlIIlllIIIlI);
        this.entitiesByUuid.put(lllllllllllllIIIllllIlIIlllIIIlI.getUniqueID(), lllllllllllllIIIllllIlIIlllIIIlI);
        "".length();
        final Entity[] lllllllllllllIIIllllIlIIlllIIIIl = lllllllllllllIIIllllIlIIlllIIIlI.getParts();
        if (lllIIIllIlIIlII(lllllllllllllIIIllllIlIIlllIIIIl)) {
            int lllllllllllllIIIllllIlIIlllIIIII = WorldServer.lIlIIIlIllllII[1];
            "".length();
            if (-(0x48 ^ 0x4C) > 0) {
                return;
            }
            while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIlIIlllIIIII, lllllllllllllIIIllllIlIIlllIIIIl.length)) {
                this.entitiesById.addKey(lllllllllllllIIIllllIlIIlllIIIIl[lllllllllllllIIIllllIlIIlllIIIII].getEntityId(), lllllllllllllIIIllllIlIIlllIIIIl[lllllllllllllIIIllllIlIIlllIIIII]);
                ++lllllllllllllIIIllllIlIIlllIIIII;
            }
        }
    }
    
    @Override
    public void setInitialSpawnLocation() {
        if (lllIIIllIlIIllI(this.worldInfo.getSpawnY())) {
            this.worldInfo.setSpawnY(this.func_181545_F() + WorldServer.lIlIIIlIllllII[2]);
        }
        int lllllllllllllIIIllllIllIlIlIlIll = this.worldInfo.getSpawnX();
        int lllllllllllllIIIllllIllIlIlIlIlI = this.worldInfo.getSpawnZ();
        int lllllllllllllIIIllllIllIlIlIlIIl = WorldServer.lIlIIIlIllllII[1];
        "".length();
        if (((51 + 69 - 72 + 84 ^ 62 + 3 + 64 + 42) & (0xB5 ^ 0x94 ^ (0x5F ^ 0x51) ^ -" ".length())) > 0) {
            return;
        }
        while (!lllIIIllIlIIIIl(this.getGroundAboveSeaLevel(new BlockPos(lllllllllllllIIIllllIllIlIlIlIll, WorldServer.lIlIIIlIllllII[1], lllllllllllllIIIllllIllIlIlIlIlI)).getMaterial(), Material.air)) {
            lllllllllllllIIIllllIllIlIlIlIll += this.rand.nextInt(WorldServer.lIlIIIlIllllII[9]) - this.rand.nextInt(WorldServer.lIlIIIlIllllII[9]);
            lllllllllllllIIIllllIllIlIlIlIlI += this.rand.nextInt(WorldServer.lIlIIIlIllllII[9]) - this.rand.nextInt(WorldServer.lIlIIIlIllllII[9]);
            if (lllIIIllIlIIlll(++lllllllllllllIIIllllIllIlIlIlIIl, WorldServer.lIlIIIlIllllII[12])) {
                "".length();
                if (((0x33 ^ 0x61 ^ (0x2E ^ 0x53)) & (0x68 ^ 0x7F ^ (0x5B ^ 0x63) ^ -" ".length())) > 0) {
                    return;
                }
                break;
            }
        }
        this.worldInfo.setSpawnX(lllllllllllllIIIllllIllIlIlIlIll);
        this.worldInfo.setSpawnZ(lllllllllllllIIIllllIllIlIlIlIlI);
    }
    
    @Override
    public boolean tickUpdates(final boolean lllllllllllllIIIllllIlIllllllIII) {
        if (lllIIIllIlIlIII(this.worldInfo.getTerrainType(), WorldType.DEBUG_WORLD)) {
            return WorldServer.lIlIIIlIllllII[1] != 0;
        }
        int lllllllllllllIIIllllIllIIIIIIIll = this.pendingTickListEntriesTreeSet.size();
        if (lllIIIllIlIIIll(lllllllllllllIIIllllIllIIIIIIIll, this.pendingTickListEntriesHashSet.size())) {
            throw new IllegalStateException(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[22]]);
        }
        if (lllIIIllIlIlIlI(lllllllllllllIIIllllIllIIIIIIIll, WorldServer.lIlIIIlIllllII[23])) {
            lllllllllllllIIIllllIllIIIIIIIll = WorldServer.lIlIIIlIllllII[23];
        }
        this.theProfiler.startSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[24]]);
        int lllllllllllllIIIllllIllIIIIIIIlI = WorldServer.lIlIIIlIllllII[1];
        "".length();
        if (" ".length() != " ".length()) {
            return ((0x43 ^ 0x70) & ~(0x81 ^ 0xB2)) != 0x0;
        }
        while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIllIIIIIIIlI, lllllllllllllIIIllllIllIIIIIIIll)) {
            final NextTickListEntry lllllllllllllIIIllllIllIIIIIIIIl = this.pendingTickListEntriesTreeSet.first();
            if (lllIIIllIlIIIlI(lllllllllllllIIIllllIlIllllllIII ? 1 : 0) && lllIIIllIIllllI(lllIIIllIlIlIIl(lllllllllllllIIIllllIllIIIIIIIIl.scheduledTime, this.worldInfo.getWorldTotalTime()))) {
                "".length();
                if ("   ".length() < "  ".length()) {
                    return ((0x85 ^ 0x83 ^ (0x1A ^ 0x42)) & (0x16 ^ 0x2 ^ (0x6F ^ 0x25) ^ -" ".length())) != 0x0;
                }
                break;
            }
            else {
                this.pendingTickListEntriesTreeSet.remove(lllllllllllllIIIllllIllIIIIIIIIl);
                "".length();
                this.pendingTickListEntriesHashSet.remove(lllllllllllllIIIllllIllIIIIIIIIl);
                "".length();
                this.pendingTickListEntriesThisTick.add(lllllllllllllIIIllllIllIIIIIIIIl);
                "".length();
                ++lllllllllllllIIIllllIllIIIIIIIlI;
            }
        }
        this.theProfiler.endSection();
        this.theProfiler.startSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[25]]);
        final Iterator<NextTickListEntry> lllllllllllllIIIllllIllIIIIIIIII = this.pendingTickListEntriesThisTick.iterator();
        "".length();
        if (" ".length() == -" ".length()) {
            return ((0x59 ^ 0x4A) & ~(0xA4 ^ 0xB7)) != 0x0;
        }
        while (!lllIIIllIlIIIlI(lllllllllllllIIIllllIllIIIIIIIII.hasNext() ? 1 : 0)) {
            final NextTickListEntry lllllllllllllIIIllllIlIlllllllll = lllllllllllllIIIllllIllIIIIIIIII.next();
            lllllllllllllIIIllllIllIIIIIIIII.remove();
            final int lllllllllllllIIIllllIlIllllllllI = WorldServer.lIlIIIlIllllII[1];
            if (lllIIIllIlIIIII(this.isAreaLoaded(lllllllllllllIIIllllIlIlllllllll.position.add(-lllllllllllllIIIllllIlIllllllllI, -lllllllllllllIIIllllIlIllllllllI, -lllllllllllllIIIllllIlIllllllllI), lllllllllllllIIIllllIlIlllllllll.position.add(lllllllllllllIIIllllIlIllllllllI, lllllllllllllIIIllllIlIllllllllI, lllllllllllllIIIllllIlIllllllllI)) ? 1 : 0)) {
                final IBlockState lllllllllllllIIIllllIlIlllllllIl = this.getBlockState(lllllllllllllIIIllllIlIlllllllll.position);
                if (!lllIIIllIlIIIIl(lllllllllllllIIIllllIlIlllllllIl.getBlock().getMaterial(), Material.air) || !lllIIIllIlIIIII(Block.isEqualTo(lllllllllllllIIIllllIlIlllllllIl.getBlock(), lllllllllllllIIIllllIlIlllllllll.getBlock()) ? 1 : 0)) {
                    continue;
                }
                try {
                    lllllllllllllIIIllllIlIlllllllIl.getBlock().updateTick(this, lllllllllllllIIIllllIlIlllllllll.position, lllllllllllllIIIllllIlIlllllllIl, this.rand);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return ((125 + 202 - 171 + 57 ^ 80 + 69 - 88 + 79) & (177 + 165 - 340 + 192 ^ 106 + 23 - 104 + 130 ^ -" ".length())) != 0x0;
                    }
                    continue;
                }
                catch (Throwable lllllllllllllIIIllllIlIlllllllII) {
                    final CrashReport lllllllllllllIIIllllIlIllllllIll = CrashReport.makeCrashReport(lllllllllllllIIIllllIlIlllllllII, WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[26]]);
                    final CrashReportCategory lllllllllllllIIIllllIlIllllllIlI = lllllllllllllIIIllllIlIllllllIll.makeCategory(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[27]]);
                    CrashReportCategory.addBlockInfo(lllllllllllllIIIllllIlIllllllIlI, lllllllllllllIIIllllIlIlllllllll.position, lllllllllllllIIIllllIlIlllllllIl);
                    throw new ReportedException(lllllllllllllIIIllllIlIllllllIll);
                }
            }
            this.scheduleUpdate(lllllllllllllIIIllllIlIlllllllll.position, lllllllllllllIIIllllIlIlllllllll.getBlock(), WorldServer.lIlIIIlIllllII[1]);
        }
        this.theProfiler.endSection();
        this.pendingTickListEntriesThisTick.clear();
        int n;
        if (lllIIIllIlIIIII(this.pendingTickListEntriesTreeSet.isEmpty() ? 1 : 0)) {
            n = WorldServer.lIlIIIlIllllII[1];
            "".length();
            if ("   ".length() < 0) {
                return ((0x65 ^ 0x61) & ~(0x2C ^ 0x28)) != 0x0;
            }
        }
        else {
            n = WorldServer.lIlIIIlIllllII[2];
        }
        return n != 0;
    }
    
    public void flush() {
        this.saveHandler.flush();
    }
    
    @Override
    public boolean addWeatherEffect(final Entity lllllllllllllIIIllllIlIIllIIllII) {
        if (lllIIIllIlIIIII(super.addWeatherEffect(lllllllllllllIIIllllIlIIllIIllII) ? 1 : 0)) {
            this.mcServer.getConfigurationManager().sendToAllNear(lllllllllllllIIIllllIlIIllIIllII.posX, lllllllllllllIIIllllIlIIllIIllII.posY, lllllllllllllIIIllllIlIIllIIllII.posZ, 512.0, this.provider.getDimensionId(), new S2CPacketSpawnGlobalEntity(lllllllllllllIIIllllIlIIllIIllII));
            return WorldServer.lIlIIIlIllllII[2] != 0;
        }
        return WorldServer.lIlIIIlIllllII[1] != 0;
    }
    
    public BlockPos getSpawnCoordinate() {
        return this.provider.getSpawnCoordinate();
    }
    
    @Override
    public void addBlockEvent(final BlockPos lllllllllllllIIIllllIlIIlIIlIlll, final Block lllllllllllllIIIllllIlIIlIIIllll, final int lllllllllllllIIIllllIlIIlIIlIlIl, final int lllllllllllllIIIllllIlIIlIIIllIl) {
        final BlockEventData lllllllllllllIIIllllIlIIlIIlIIll = new BlockEventData(lllllllllllllIIIllllIlIIlIIlIlll, lllllllllllllIIIllllIlIIlIIIllll, lllllllllllllIIIllllIlIIlIIlIlIl, lllllllllllllIIIllllIlIIlIIIllIl);
        final double lllllllllllllIIIllllIlIIlIIIlIlI = (double)this.field_147490_S[this.blockEventCacheIndex].iterator();
        "".length();
        if ((0x89 ^ 0x8D) <= -" ".length()) {
            return;
        }
        while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIlIIlIIIlIlI).hasNext() ? 1 : 0)) {
            final BlockEventData lllllllllllllIIIllllIlIIlIIlIIlI = ((Iterator<BlockEventData>)lllllllllllllIIIllllIlIIlIIIlIlI).next();
            if (lllIIIllIlIIIII(lllllllllllllIIIllllIlIIlIIlIIlI.equals(lllllllllllllIIIllllIlIIlIIlIIll) ? 1 : 0)) {
                return;
            }
        }
        this.field_147490_S[this.blockEventCacheIndex].add(lllllllllllllIIIllllIlIIlIIlIIll);
        "".length();
    }
    
    public WorldServer(final MinecraftServer lllllllllllllIIIllllIlllIIlIIlll, final ISaveHandler lllllllllllllIIIllllIlllIIlIIIII, final WorldInfo lllllllllllllIIIllllIlllIIlIIlIl, final int lllllllllllllIIIllllIlllIIlIIlII, final Profiler lllllllllllllIIIllllIlllIIIlllIl) {
        super(lllllllllllllIIIllllIlllIIlIIIII, lllllllllllllIIIllllIlllIIlIIlIl, WorldProvider.getProviderForDimension(lllllllllllllIIIllllIlllIIlIIlII), lllllllllllllIIIllllIlllIIIlllIl, (boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        this.pendingTickListEntriesHashSet = (Set<NextTickListEntry>)Sets.newHashSet();
        this.pendingTickListEntriesTreeSet = new TreeSet<NextTickListEntry>();
        this.entitiesByUuid = (Map<UUID, Entity>)Maps.newHashMap();
        this.mobSpawner = new SpawnerAnimals();
        this.villageSiege = new VillageSiege(this);
        final ServerBlockEventList[] field_147490_S = new ServerBlockEventList[WorldServer.lIlIIIlIllllII[4]];
        field_147490_S[WorldServer.lIlIIIlIllllII[1]] = new ServerBlockEventList(null);
        field_147490_S[WorldServer.lIlIIIlIllllII[2]] = new ServerBlockEventList(null);
        this.field_147490_S = field_147490_S;
        this.pendingTickListEntriesThisTick = (List<NextTickListEntry>)Lists.newArrayList();
        this.mcServer = lllllllllllllIIIllllIlllIIlIIlll;
        this.theEntityTracker = new EntityTracker(this);
        this.thePlayerManager = new PlayerManager(this);
        this.provider.registerWorld(this);
        this.chunkProvider = this.createChunkProvider();
        this.worldTeleporter = new Teleporter(this);
        this.calculateInitialSkylight();
        this.calculateInitialWeather();
        this.getWorldBorder().setSize(lllllllllllllIIIllllIlllIIlIIlll.getMaxWorldSize());
    }
    
    public List<TileEntity> getTileEntitiesIn(final int lllllllllllllIIIllllIlIlIllllIII, final int lllllllllllllIIIllllIlIllIIIlIIl, final int lllllllllllllIIIllllIlIllIIIlIII, final int lllllllllllllIIIllllIlIllIIIIlll, final int lllllllllllllIIIllllIlIllIIIIlIl, final int lllllllllllllIIIllllIlIllIIIIlII) {
        final List<TileEntity> lllllllllllllIIIllllIlIllIIIIIlI = (List<TileEntity>)Lists.newArrayList();
        int lllllllllllllIIIllllIlIllIIIIIII = WorldServer.lIlIIIlIllllII[1];
        "".length();
        if (" ".length() >= (0x84 ^ 0x80)) {
            return null;
        }
        while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIlIllIIIIIII, this.loadedTileEntityList.size())) {
            final TileEntity lllllllllllllIIIllllIlIlIllllllI = this.loadedTileEntityList.get(lllllllllllllIIIllllIlIllIIIIIII);
            final BlockPos lllllllllllllIIIllllIlIlIlllllII = lllllllllllllIIIllllIlIlIllllllI.getPos();
            if (lllIIIllIlIIlIl(lllllllllllllIIIllllIlIlIlllllII.getX(), lllllllllllllIIIllllIlIlIllllIII) && lllIIIllIlIIlIl(lllllllllllllIIIllllIlIlIlllllII.getY(), lllllllllllllIIIllllIlIllIIIlIIl) && lllIIIllIlIIlIl(lllllllllllllIIIllllIlIlIlllllII.getZ(), lllllllllllllIIIllllIlIllIIIlIII) && lllIIIllIlIlIll(lllllllllllllIIIllllIlIlIlllllII.getX(), lllllllllllllIIIllllIlIllIIIIlll) && lllIIIllIlIlIll(lllllllllllllIIIllllIlIlIlllllII.getY(), lllllllllllllIIIllllIlIllIIIIlIl) && lllIIIllIlIlIll(lllllllllllllIIIllllIlIlIlllllII.getZ(), lllllllllllllIIIllllIlIllIIIIlII)) {
                lllllllllllllIIIllllIlIllIIIIIlI.add(lllllllllllllIIIllllIlIlIllllllI);
                "".length();
            }
            ++lllllllllllllIIIllllIlIllIIIIIII;
        }
        return lllllllllllllIIIllllIlIllIIIIIlI;
    }
    
    protected void createBonusChest() {
        final WorldGeneratorBonusChest lllllllllllllIIIllllIlIlIIIIlIIl = new WorldGeneratorBonusChest(WorldServer.bonusChestContent, WorldServer.lIlIIIlIllllII[0]);
        int lllllllllllllIIIllllIlIlIIIIlIII = WorldServer.lIlIIIlIllllII[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIlIlIIIIlIII, WorldServer.lIlIIIlIllllII[0])) {
            final int lllllllllllllIIIllllIlIlIIIIIlll = this.worldInfo.getSpawnX() + this.rand.nextInt(WorldServer.lIlIIIlIllllII[7]) - this.rand.nextInt(WorldServer.lIlIIIlIllllII[7]);
            final int lllllllllllllIIIllllIlIlIIIIIllI = this.worldInfo.getSpawnZ() + this.rand.nextInt(WorldServer.lIlIIIlIllllII[7]) - this.rand.nextInt(WorldServer.lIlIIIlIllllII[7]);
            final BlockPos lllllllllllllIIIllllIlIlIIIIIlIl = this.getTopSolidOrLiquidBlock(new BlockPos(lllllllllllllIIIllllIlIlIIIIIlll, WorldServer.lIlIIIlIllllII[1], lllllllllllllIIIllllIlIlIIIIIllI)).up();
            if (lllIIIllIlIIIII(lllllllllllllIIIllllIlIlIIIIlIIl.generate(this, this.rand, lllllllllllllIIIllllIlIlIIIIIlIl) ? 1 : 0)) {
                "".length();
                if (((0xE2 ^ 0xB8) & ~(0x50 ^ 0xA)) > 0) {
                    return;
                }
                break;
            }
            else {
                ++lllllllllllllIIIllllIlIlIIIIlIII;
            }
        }
    }
    
    private static int lllIIIllIlIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public Entity getEntityFromUuid(final UUID lllllllllllllIIIllllIlIIIIIIIlII) {
        return this.entitiesByUuid.get(lllllllllllllIIIllllIlIIIIIIIlII);
    }
    
    @Override
    protected void onEntityRemoved(final Entity lllllllllllllIIIllllIlIIllIlIllI) {
        super.onEntityRemoved(lllllllllllllIIIllllIlIIllIlIllI);
        this.entitiesById.removeObject(lllllllllllllIIIllllIlIIllIlIllI.getEntityId());
        "".length();
        this.entitiesByUuid.remove(lllllllllllllIIIllllIlIIllIlIllI.getUniqueID());
        "".length();
        final Entity[] lllllllllllllIIIllllIlIIllIlIlIl = lllllllllllllIIIllllIlIIllIlIllI.getParts();
        if (lllIIIllIlIIlII(lllllllllllllIIIllllIlIIllIlIlIl)) {
            int lllllllllllllIIIllllIlIIllIlIlII = WorldServer.lIlIIIlIllllII[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIlIIllIlIlII, lllllllllllllIIIllllIlIIllIlIlIl.length)) {
                this.entitiesById.removeObject(lllllllllllllIIIllllIlIIllIlIlIl[lllllllllllllIIIllllIlIIllIlIlII].getEntityId());
                "".length();
                ++lllllllllllllIIIllllIlIIllIlIlII;
            }
        }
    }
    
    public boolean canCreatureTypeSpawnHere(final EnumCreatureType lllllllllllllIIIllllIllIllllIIlI, final BiomeGenBase.SpawnListEntry lllllllllllllIIIllllIllIllllIIIl, final BlockPos lllllllllllllIIIllllIllIllllIlIl) {
        final List<BiomeGenBase.SpawnListEntry> lllllllllllllIIIllllIllIllllIlII = this.getChunkProvider().getPossibleCreatures(lllllllllllllIIIllllIllIllllIIlI, lllllllllllllIIIllllIllIllllIlIl);
        int contains;
        if (lllIIIllIlIIlII(lllllllllllllIIIllllIllIllllIlII) && lllIIIllIlIIIlI(lllllllllllllIIIllllIllIllllIlII.isEmpty() ? 1 : 0)) {
            contains = (lllllllllllllIIIllllIllIllllIlII.contains(lllllllllllllIIIllllIllIllllIIIl) ? 1 : 0);
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0xAB ^ 0x84 ^ (0x42 ^ 0x65)) & (((0xA1 ^ 0xC3) & ~(0x4 ^ 0x66)) ^ (0x7A ^ 0x72) ^ -" ".length())) != 0x0;
            }
        }
        else {
            contains = WorldServer.lIlIIIlIllllII[1];
        }
        return contains != 0;
    }
    
    @Override
    protected void updateWeather() {
        final boolean lllllllllllllIIIllllIlIIIllIllll = this.isRaining();
        super.updateWeather();
        if (lllIIIllIlIIIII(lllIIIllIlIlllI(this.prevRainingStrength, this.rainingStrength))) {
            this.mcServer.getConfigurationManager().sendPacketToAllPlayersInDimension(new S2BPacketChangeGameState(WorldServer.lIlIIIlIllllII[8], this.rainingStrength), this.provider.getDimensionId());
        }
        if (lllIIIllIlIIIII(lllIIIllIlIlllI(this.prevThunderingStrength, this.thunderingStrength))) {
            this.mcServer.getConfigurationManager().sendPacketToAllPlayersInDimension(new S2BPacketChangeGameState(WorldServer.lIlIIIlIllllII[9], this.thunderingStrength), this.provider.getDimensionId());
        }
        if (lllIIIllIlIIIll(lllllllllllllIIIllllIlIIIllIllll ? 1 : 0, this.isRaining() ? 1 : 0)) {
            if (lllIIIllIlIIIII(lllllllllllllIIIllllIlIIIllIllll ? 1 : 0)) {
                this.mcServer.getConfigurationManager().sendPacketToAllPlayers(new S2BPacketChangeGameState(WorldServer.lIlIIIlIllllII[4], 0.0f));
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else {
                this.mcServer.getConfigurationManager().sendPacketToAllPlayers(new S2BPacketChangeGameState(WorldServer.lIlIIIlIllllII[2], 0.0f));
            }
            this.mcServer.getConfigurationManager().sendPacketToAllPlayers(new S2BPacketChangeGameState(WorldServer.lIlIIIlIllllII[8], this.rainingStrength));
            this.mcServer.getConfigurationManager().sendPacketToAllPlayers(new S2BPacketChangeGameState(WorldServer.lIlIIIlIllllII[9], this.thunderingStrength));
        }
    }
    
    private static boolean lllIIIllIlIIIII(final int lllllllllllllIIIllllIIlllIlIlIll) {
        return lllllllllllllIIIllllIIlllIlIlIll != 0;
    }
    
    private static int lllIIIllIlIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private boolean canSpawnNPCs() {
        return this.mcServer.getCanSpawnNPCs();
    }
    
    private static boolean lllIIIllIIlllIl(final Object lllllllllllllIIIllllIIlllIlIllIl) {
        return lllllllllllllIIIllllIIlllIlIllIl == null;
    }
    
    public MinecraftServer getMinecraftServer() {
        return this.mcServer;
    }
    
    private static boolean lllIIIllIlIIIll(final int lllllllllllllIIIllllIIlllIlIIIII, final int lllllllllllllIIIllllIIlllIIlllll) {
        return lllllllllllllIIIllllIIlllIlIIIII != lllllllllllllIIIllllIIlllIIlllll;
    }
    
    public EntityTracker getEntityTracker() {
        return this.theEntityTracker;
    }
    
    private static boolean lllIIIllIlIlIII(final Object lllllllllllllIIIllllIIlllIllIIII, final Object lllllllllllllIIIllllIIlllIlIllll) {
        return lllllllllllllIIIllllIIlllIllIIII == lllllllllllllIIIllllIIlllIlIllll;
    }
    
    @Override
    public void tick() {
        super.tick();
        if (lllIIIllIlIIIII(this.getWorldInfo().isHardcoreModeEnabled() ? 1 : 0) && lllIIIllIlIIIIl(this.getDifficulty(), EnumDifficulty.HARD)) {
            this.getWorldInfo().setDifficulty(EnumDifficulty.HARD);
        }
        this.provider.getWorldChunkManager().cleanupCache();
        if (lllIIIllIlIIIII(this.areAllPlayersAsleep() ? 1 : 0)) {
            if (lllIIIllIlIIIII(this.getGameRules().getBoolean(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[4]]) ? 1 : 0)) {
                final long lllllllllllllIIIllllIlllIIIIllIl = this.worldInfo.getWorldTime() + 24000L;
                this.worldInfo.setWorldTime(lllllllllllllIIIllllIlllIIIIllIl - lllllllllllllIIIllllIlllIIIIllIl % 24000L);
            }
            this.wakeAllPlayers();
        }
        this.theProfiler.startSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[3]]);
        if (lllIIIllIlIIIII(this.getGameRules().getBoolean(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[5]]) ? 1 : 0) && lllIIIllIlIIIIl(this.worldInfo.getTerrainType(), WorldType.DEBUG_WORLD)) {
            final SpawnerAnimals mobSpawner = this.mobSpawner;
            final boolean spawnHostileMobs = this.spawnHostileMobs;
            final boolean spawnPeacefulMobs = this.spawnPeacefulMobs;
            int llllllllllllIllIIIlllllIIllllIIl;
            if (lllIIIllIlIIIlI(lllIIIllIIlllll(this.worldInfo.getWorldTotalTime() % 400L, 0L))) {
                llllllllllllIllIIIlllllIIllllIIl = WorldServer.lIlIIIlIllllII[2];
                "".length();
                if ((0x47 ^ 0x43) <= 0) {
                    return;
                }
            }
            else {
                llllllllllllIllIIIlllllIIllllIIl = WorldServer.lIlIIIlIllllII[1];
            }
            mobSpawner.findChunksForSpawning(this, spawnHostileMobs, spawnPeacefulMobs, (boolean)(llllllllllllIllIIIlllllIIllllIIl != 0));
            "".length();
        }
        this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[6]]);
        this.chunkProvider.unloadQueuedChunks();
        "".length();
        final int lllllllllllllIIIllllIlllIIIIllII = this.calculateSkylightSubtracted(1.0f);
        if (lllIIIllIlIIIll(lllllllllllllIIIllllIlllIIIIllII, this.getSkylightSubtracted())) {
            this.setSkylightSubtracted(lllllllllllllIIIllllIlllIIIIllII);
        }
        this.worldInfo.setWorldTotalTime(this.worldInfo.getWorldTotalTime() + 1L);
        if (lllIIIllIlIIIII(this.getGameRules().getBoolean(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[7]]) ? 1 : 0)) {
            this.worldInfo.setWorldTime(this.worldInfo.getWorldTime() + 1L);
        }
        this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[8]]);
        this.tickUpdates((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        "".length();
        this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[9]]);
        this.updateBlocks();
        this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[10]]);
        this.thePlayerManager.updatePlayerInstances();
        this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[0]]);
        this.villageCollectionObj.tick();
        this.villageSiege.tick();
        this.theProfiler.endStartSection(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[11]]);
        this.worldTeleporter.removeStalePortalLocations(this.getTotalWorldTime());
        this.theProfiler.endSection();
        this.sendQueuedBlockEvents();
    }
    
    @Override
    public boolean isBlockModifiable(final EntityPlayer lllllllllllllIIIllllIlIlIlIlIlIl, final BlockPos lllllllllllllIIIllllIlIlIlIllIII) {
        if (lllIIIllIlIIIlI(this.mcServer.isBlockProtected(this, lllllllllllllIIIllllIlIlIlIllIII, lllllllllllllIIIllllIlIlIlIlIlIl) ? 1 : 0) && lllIIIllIlIIIII(this.getWorldBorder().contains(lllllllllllllIIIllllIlIlIlIllIII) ? 1 : 0)) {
            return WorldServer.lIlIIIlIllllII[2] != 0;
        }
        return WorldServer.lIlIIIlIllllII[1] != 0;
    }
    
    @Override
    public World init() {
        this.mapStorage = new MapStorage(this.saveHandler);
        final String lllllllllllllIIIllllIlllIIIlIlll = VillageCollection.fileNameForProvider(this.provider);
        final VillageCollection lllllllllllllIIIllllIlllIIIlIllI = (VillageCollection)this.mapStorage.loadData(VillageCollection.class, lllllllllllllIIIllllIlllIIIlIlll);
        if (lllIIIllIIlllIl(lllllllllllllIIIllllIlllIIIlIllI)) {
            this.villageCollectionObj = new VillageCollection(this);
            this.mapStorage.setData(lllllllllllllIIIllllIlllIIIlIlll, this.villageCollectionObj);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            this.villageCollectionObj = lllllllllllllIIIllllIlllIIIlIllI;
            this.villageCollectionObj.setWorldsForAll(this);
        }
        this.worldScoreboard = new ServerScoreboard(this.mcServer);
        ScoreboardSaveData lllllllllllllIIIllllIlllIIIlIlIl = (ScoreboardSaveData)this.mapStorage.loadData(ScoreboardSaveData.class, WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[1]]);
        if (lllIIIllIIlllIl(lllllllllllllIIIllllIlllIIIlIlIl)) {
            lllllllllllllIIIllllIlllIIIlIlIl = new ScoreboardSaveData();
            this.mapStorage.setData(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[2]], lllllllllllllIIIllllIlllIIIlIlIl);
        }
        lllllllllllllIIIllllIlllIIIlIlIl.setScoreboard(this.worldScoreboard);
        ((ServerScoreboard)this.worldScoreboard).func_96547_a(lllllllllllllIIIllllIlllIIIlIlIl);
        this.getWorldBorder().setCenter(this.worldInfo.getBorderCenterX(), this.worldInfo.getBorderCenterZ());
        this.getWorldBorder().setDamageAmount(this.worldInfo.getBorderDamagePerBlock());
        this.getWorldBorder().setDamageBuffer(this.worldInfo.getBorderSafeZone());
        this.getWorldBorder().setWarningDistance(this.worldInfo.getBorderWarningDistance());
        this.getWorldBorder().setWarningTime(this.worldInfo.getBorderWarningTime());
        if (lllIIIllIIllllI(lllIIIllIIlllII(this.worldInfo.getBorderLerpTime(), 0L))) {
            this.getWorldBorder().setTransition(this.worldInfo.getBorderSize(), this.worldInfo.getBorderLerpTarget(), this.worldInfo.getBorderLerpTime());
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        else {
            this.getWorldBorder().setTransition(this.worldInfo.getBorderSize());
        }
        return this;
    }
    
    @Override
    public void updateEntities() {
        if (lllIIIllIlIIIII(this.playerEntities.isEmpty() ? 1 : 0)) {
            final int updateEntityTick = this.updateEntityTick;
            this.updateEntityTick = updateEntityTick + WorldServer.lIlIIIlIllllII[2];
            if (lllIIIllIlIIlIl(updateEntityTick, WorldServer.lIlIIIlIllllII[21])) {
                return;
            }
        }
        else {
            this.resetUpdateEntityTick();
        }
        super.updateEntities();
    }
    
    private static boolean lllIIIllIlIlIll(final int lllllllllllllIIIllllIIlllIlllllI, final int lllllllllllllIIIllllIIlllIllllIl) {
        return lllllllllllllIIIllllIIlllIlllllI < lllllllllllllIIIllllIIlllIllllIl;
    }
    
    private static boolean lllIIIllIlIIlll(final int lllllllllllllIIIllllIIllllIIIllI, final int lllllllllllllIIIllllIIllllIIIlIl) {
        return lllllllllllllIIIllllIIllllIIIllI == lllllllllllllIIIllllIIllllIIIlIl;
    }
    
    public void spawnParticle(final EnumParticleTypes lllllllllllllIIIllllIlIIIIIllIIl, final boolean lllllllllllllIIIllllIlIIIIIllIII, final double lllllllllllllIIIllllIlIIIIIlIlll, final double lllllllllllllIIIllllIlIIIIlIIlll, final double lllllllllllllIIIllllIlIIIIIlIlIl, final int lllllllllllllIIIllllIlIIIIlIIlIl, final double lllllllllllllIIIllllIlIIIIIlIIll, final double lllllllllllllIIIllllIlIIIIIlIIlI, final double lllllllllllllIIIllllIlIIIIIlIIIl, final double lllllllllllllIIIllllIlIIIIIlIIII, final int... lllllllllllllIIIllllIlIIIIIIllll) {
        final Packet lllllllllllllIIIllllIlIIIIIlllll = new S2APacketParticles(lllllllllllllIIIllllIlIIIIIllIIl, lllllllllllllIIIllllIlIIIIIllIII, (float)lllllllllllllIIIllllIlIIIIIlIlll, (float)lllllllllllllIIIllllIlIIIIlIIlll, (float)lllllllllllllIIIllllIlIIIIIlIlIl, (float)lllllllllllllIIIllllIlIIIIIlIIll, (float)lllllllllllllIIIllllIlIIIIIlIIlI, (float)lllllllllllllIIIllllIlIIIIIlIIIl, (float)lllllllllllllIIIllllIlIIIIIlIIII, lllllllllllllIIIllllIlIIIIlIIlIl, lllllllllllllIIIllllIlIIIIIIllll);
        int lllllllllllllIIIllllIlIIIIIllllI = WorldServer.lIlIIIlIllllII[1];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIlIIIIIllllI, this.playerEntities.size())) {
            final EntityPlayerMP lllllllllllllIIIllllIlIIIIIlllIl = this.playerEntities.get(lllllllllllllIIIllllIlIIIIIllllI);
            final BlockPos lllllllllllllIIIllllIlIIIIIlllII = lllllllllllllIIIllllIlIIIIIlllIl.getPosition();
            final double lllllllllllllIIIllllIlIIIIIllIll = lllllllllllllIIIllllIlIIIIIlllII.distanceSq(lllllllllllllIIIllllIlIIIIIlIlll, lllllllllllllIIIllllIlIIIIlIIlll, lllllllllllllIIIllllIlIIIIIlIlIl);
            if (!lllIIIllIIllllI(lllIIIllIlIllll(lllllllllllllIIIllllIlIIIIIllIll, 256.0)) || (lllIIIllIlIIIII(lllllllllllllIIIllllIlIIIIIllIII ? 1 : 0) && lllIIIllIlIIllI(lllIIIllIlIllll(lllllllllllllIIIllllIlIIIIIllIll, 65536.0)))) {
                lllllllllllllIIIllllIlIIIIIlllIl.playerNetServerHandler.sendPacket(lllllllllllllIIIllllIlIIIIIlllll);
            }
            ++lllllllllllllIIIllllIlIIIIIllllI;
        }
    }
    
    @Override
    public Explosion newExplosion(final Entity lllllllllllllIIIllllIlIIlIlIlIlI, final double lllllllllllllIIIllllIlIIlIllIIll, final double lllllllllllllIIIllllIlIIlIlIlIII, final double lllllllllllllIIIllllIlIIlIllIIIl, final float lllllllllllllIIIllllIlIIlIllIIII, final boolean lllllllllllllIIIllllIlIIlIlIIlIl, final boolean lllllllllllllIIIllllIlIIlIlIlllI) {
        final Explosion lllllllllllllIIIllllIlIIlIlIllIl = new Explosion(this, lllllllllllllIIIllllIlIIlIlIlIlI, lllllllllllllIIIllllIlIIlIllIIll, lllllllllllllIIIllllIlIIlIlIlIII, lllllllllllllIIIllllIlIIlIllIIIl, lllllllllllllIIIllllIlIIlIllIIII, lllllllllllllIIIllllIlIIlIlIIlIl, lllllllllllllIIIllllIlIIlIlIlllI);
        lllllllllllllIIIllllIlIIlIlIllIl.doExplosionA();
        lllllllllllllIIIllllIlIIlIlIllIl.doExplosionB((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        if (lllIIIllIlIIIlI(lllllllllllllIIIllllIlIIlIlIlllI ? 1 : 0)) {
            lllllllllllllIIIllllIlIIlIlIllIl.func_180342_d();
        }
        final byte lllllllllllllIIIllllIlIIlIlIIIIl = (byte)this.playerEntities.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIlIIlIlIIIIl).hasNext() ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIIllllIlIIlIlIllII = ((Iterator<EntityPlayer>)lllllllllllllIIIllllIlIIlIlIIIIl).next();
            if (lllIIIllIlIllIl(lllIIIllIlIllII(lllllllllllllIIIllllIlIIlIlIllII.getDistanceSq(lllllllllllllIIIllllIlIIlIllIIll, lllllllllllllIIIllllIlIIlIlIlIII, lllllllllllllIIIllllIlIIlIllIIIl), 4096.0))) {
                ((EntityPlayerMP)lllllllllllllIIIllllIlIIlIlIllII).playerNetServerHandler.sendPacket(new S27PacketExplosion(lllllllllllllIIIllllIlIIlIllIIll, lllllllllllllIIIllllIlIIlIlIlIII, lllllllllllllIIIllllIlIIlIllIIIl, lllllllllllllIIIllllIlIIlIllIIII, lllllllllllllIIIllllIlIIlIlIllIl.getAffectedBlockPositions(), lllllllllllllIIIllllIlIIlIlIllIl.getPlayerKnockbackMap().get(lllllllllllllIIIllllIlIIlIlIllII)));
            }
        }
        return lllllllllllllIIIllllIlIIlIlIllIl;
    }
    
    @Override
    public void updateBlockTick(final BlockPos lllllllllllllIIIllllIllIIIlIlllI, final Block lllllllllllllIIIllllIllIIIlIllIl, int lllllllllllllIIIllllIllIIIlIllII, final int lllllllllllllIIIllllIllIIIllIIll) {
        final NextTickListEntry lllllllllllllIIIllllIllIIIllIIlI = new NextTickListEntry(lllllllllllllIIIllllIllIIIlIlllI, lllllllllllllIIIllllIllIIIlIllIl);
        int lllllllllllllIIIllllIllIIIllIIIl = WorldServer.lIlIIIlIllllII[1];
        if (lllIIIllIlIIIII(this.scheduledUpdatesAreImmediate ? 1 : 0) && lllIIIllIlIIIIl(lllllllllllllIIIllllIllIIIlIllIl.getMaterial(), Material.air)) {
            if (lllIIIllIlIIIII(lllllllllllllIIIllllIllIIIlIllIl.requiresUpdates() ? 1 : 0)) {
                lllllllllllllIIIllllIllIIIllIIIl = WorldServer.lIlIIIlIllllII[9];
                if (lllIIIllIlIIIII(this.isAreaLoaded(lllllllllllllIIIllllIllIIIllIIlI.position.add(-lllllllllllllIIIllllIllIIIllIIIl, -lllllllllllllIIIllllIllIIIllIIIl, -lllllllllllllIIIllllIllIIIllIIIl), lllllllllllllIIIllllIllIIIllIIlI.position.add(lllllllllllllIIIllllIllIIIllIIIl, lllllllllllllIIIllllIllIIIllIIIl, lllllllllllllIIIllllIllIIIllIIIl)) ? 1 : 0)) {
                    final IBlockState lllllllllllllIIIllllIllIIIllIIII = this.getBlockState(lllllllllllllIIIllllIllIIIllIIlI.position);
                    if (lllIIIllIlIIIIl(lllllllllllllIIIllllIllIIIllIIII.getBlock().getMaterial(), Material.air) && lllIIIllIlIlIII(lllllllllllllIIIllllIllIIIllIIII.getBlock(), lllllllllllllIIIllllIllIIIllIIlI.getBlock())) {
                        lllllllllllllIIIllllIllIIIllIIII.getBlock().updateTick(this, lllllllllllllIIIllllIllIIIllIIlI.position, lllllllllllllIIIllllIllIIIllIIII, this.rand);
                    }
                }
                return;
            }
            lllllllllllllIIIllllIllIIIlIllII = WorldServer.lIlIIIlIllllII[2];
        }
        if (lllIIIllIlIIIII(this.isAreaLoaded(lllllllllllllIIIllllIllIIIlIlllI.add(-lllllllllllllIIIllllIllIIIllIIIl, -lllllllllllllIIIllllIllIIIllIIIl, -lllllllllllllIIIllllIllIIIllIIIl), lllllllllllllIIIllllIllIIIlIlllI.add(lllllllllllllIIIllllIllIIIllIIIl, lllllllllllllIIIllllIllIIIllIIIl, lllllllllllllIIIllllIllIIIllIIIl)) ? 1 : 0)) {
            if (lllIIIllIlIIIIl(lllllllllllllIIIllllIllIIIlIllIl.getMaterial(), Material.air)) {
                lllllllllllllIIIllllIllIIIllIIlI.setScheduledTime(lllllllllllllIIIllllIllIIIlIllII + this.worldInfo.getWorldTotalTime());
                "".length();
                lllllllllllllIIIllllIllIIIllIIlI.setPriority(lllllllllllllIIIllllIllIIIllIIll);
            }
            if (lllIIIllIlIIIlI(this.pendingTickListEntriesHashSet.contains(lllllllllllllIIIllllIllIIIllIIlI) ? 1 : 0)) {
                this.pendingTickListEntriesHashSet.add(lllllllllllllIIIllllIllIIIllIIlI);
                "".length();
                this.pendingTickListEntriesTreeSet.add(lllllllllllllIIIllllIllIIIllIIlI);
                "".length();
            }
        }
    }
    
    @Override
    public void updateEntityWithOptionalForce(final Entity lllllllllllllIIIllllIlIllIlllIlI, final boolean lllllllllllllIIIllllIlIllIllIllI) {
        if (lllIIIllIlIIIlI(this.canSpawnAnimals() ? 1 : 0) && (!lllIIIllIlIIIlI((lllllllllllllIIIllllIlIllIlllIlI instanceof EntityAnimal) ? 1 : 0) || lllIIIllIlIIIII((lllllllllllllIIIllllIlIllIlllIlI instanceof EntityWaterMob) ? 1 : 0))) {
            lllllllllllllIIIllllIlIllIlllIlI.setDead();
        }
        if (lllIIIllIlIIIlI(this.canSpawnNPCs() ? 1 : 0) && lllIIIllIlIIIII((lllllllllllllIIIllllIlIllIlllIlI instanceof INpc) ? 1 : 0)) {
            lllllllllllllIIIllllIlIllIlllIlI.setDead();
        }
        super.updateEntityWithOptionalForce(lllllllllllllIIIllllIlIllIlllIlI, lllllllllllllIIIllllIlIllIllIllI);
    }
    
    private static int lllIIIllIIlllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public boolean isBlockTickPending(final BlockPos lllllllllllllIIIllllIllIIlIIlllI, final Block lllllllllllllIIIllllIllIIlIIllIl) {
        final NextTickListEntry lllllllllllllIIIllllIllIIlIlIIII = new NextTickListEntry(lllllllllllllIIIllllIllIIlIIlllI, lllllllllllllIIIllllIllIIlIIllIl);
        return this.pendingTickListEntriesThisTick.contains(lllllllllllllIIIllllIllIIlIlIIII);
    }
    
    private void resetRainAndThunder() {
        this.worldInfo.setRainTime(WorldServer.lIlIIIlIllllII[1]);
        this.worldInfo.setRaining((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        this.worldInfo.setThunderTime(WorldServer.lIlIIIlIllllII[1]);
        this.worldInfo.setThundering((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
    }
    
    protected void wakeAllPlayers() {
        this.allPlayersSleeping = (WorldServer.lIlIIIlIllllII[1] != 0);
        final Exception lllllllllllllIIIllllIllIlIllllll = (Exception)this.playerEntities.iterator();
        "".length();
        if ((0x30 ^ 0x35) <= 0) {
            return;
        }
        while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIllIlIllllll).hasNext() ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIIllllIllIllIIIlII = ((Iterator<EntityPlayer>)lllllllllllllIIIllllIllIlIllllll).next();
            if (lllIIIllIlIIIII(lllllllllllllIIIllllIllIllIIIlII.isPlayerSleeping() ? 1 : 0)) {
                lllllllllllllIIIllllIllIllIIIlII.wakeUpPlayer((boolean)(WorldServer.lIlIIIlIllllII[1] != 0), (boolean)(WorldServer.lIlIIIlIllllII[1] != 0), (boolean)(WorldServer.lIlIIIlIllllII[2] != 0));
            }
        }
        this.resetRainAndThunder();
    }
    
    @Override
    public void updateAllPlayersSleepingFlag() {
        this.allPlayersSleeping = (WorldServer.lIlIIIlIllllII[1] != 0);
        if (lllIIIllIlIIIlI(this.playerEntities.isEmpty() ? 1 : 0)) {
            int lllllllllllllIIIllllIllIlllIIIlI = WorldServer.lIlIIIlIllllII[1];
            int lllllllllllllIIIllllIllIlllIIIII = WorldServer.lIlIIIlIllllII[1];
            final long lllllllllllllIIIllllIllIllIlIlIl = (long)this.playerEntities.iterator();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIllIllIlIlIl).hasNext() ? 1 : 0)) {
                final EntityPlayer lllllllllllllIIIllllIllIllIllllI = ((Iterator<EntityPlayer>)lllllllllllllIIIllllIllIllIlIlIl).next();
                if (lllIIIllIlIIIII(lllllllllllllIIIllllIllIllIllllI.isSpectator() ? 1 : 0)) {
                    ++lllllllllllllIIIllllIllIlllIIIlI;
                    "".length();
                    if ((128 + 47 - 122 + 137 ^ 1 + 92 - 39 + 132) < -" ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    if (!lllIIIllIlIIIII(lllllllllllllIIIllllIllIllIllllI.isPlayerSleeping() ? 1 : 0)) {
                        continue;
                    }
                    ++lllllllllllllIIIllllIllIlllIIIII;
                }
            }
            int allPlayersSleeping;
            if (lllIIIllIIllllI(lllllllllllllIIIllllIllIlllIIIII) && lllIIIllIlIIlIl(lllllllllllllIIIllllIllIlllIIIII, this.playerEntities.size() - lllllllllllllIIIllllIllIlllIIIlI)) {
                allPlayersSleeping = WorldServer.lIlIIIlIllllII[2];
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else {
                allPlayersSleeping = WorldServer.lIlIIIlIllllII[1];
            }
            this.allPlayersSleeping = (allPlayersSleeping != 0);
        }
    }
    
    private static void lllIIIllIIllIll() {
        (lIlIIIlIllllII = new int[38])[0] = (0xD0 ^ 0xC7 ^ (0x83 ^ 0x9E));
        WorldServer.lIlIIIlIllllII[1] = ((0xED ^ 0x9E ^ (0x4E ^ 0x34)) & (0x44 ^ 0x37 ^ (0x56 ^ 0x2C) ^ -" ".length()));
        WorldServer.lIlIIIlIllllII[2] = " ".length();
        WorldServer.lIlIIIlIllllII[3] = "   ".length();
        WorldServer.lIlIIIlIllllII[4] = "  ".length();
        WorldServer.lIlIIIlIllllII[5] = (0x70 ^ 0x74);
        WorldServer.lIlIIIlIllllII[6] = (0x54 ^ 0x2 ^ (0x2A ^ 0x79));
        WorldServer.lIlIIIlIllllII[7] = (0x1F ^ 0x19);
        WorldServer.lIlIIIlIllllII[8] = (0xB3 ^ 0xB4);
        WorldServer.lIlIIIlIllllII[9] = (0x5E ^ 0x14 ^ (0x21 ^ 0x63));
        WorldServer.lIlIIIlIllllII[10] = (0x1E ^ 0x17);
        WorldServer.lIlIIIlIllllII[11] = (0x4F ^ 0x44);
        WorldServer.lIlIIIlIllllII[12] = (0xFFFFE7B9 & 0x3F56);
        WorldServer.lIlIIIlIllllII[13] = (0x55 ^ 0x6 ^ (0xFB ^ 0xB8));
        WorldServer.lIlIIIlIllllII[14] = (0x78 ^ 0x1A ^ (0x7C ^ 0x12));
        WorldServer.lIlIIIlIllllII[15] = (0x93 ^ 0x9E);
        WorldServer.lIlIIIlIllllII[16] = (0x44 ^ 0x4A);
        WorldServer.lIlIIIlIllllII[17] = (0xFFFFFEBC & 0x187E3);
        WorldServer.lIlIIIlIllllII[18] = (0xFFFFFF5F & 0x3C6EF3FF);
        WorldServer.lIlIIIlIllllII[19] = (0x72 ^ 0x43 ^ (0x88 ^ 0xB6));
        WorldServer.lIlIIIlIllllII[20] = (0xB4 ^ 0xA5);
        WorldServer.lIlIIIlIllllII[21] = (0xFFFFEDB2 & 0x16FD);
        WorldServer.lIlIIIlIllllII[22] = (0x8E ^ 0xC0 ^ (0x9A ^ 0xC6));
        WorldServer.lIlIIIlIllllII[23] = (-(0xFFFFAC3F & 0x7BD3) & (-1 & 0x2BFA));
        WorldServer.lIlIIIlIllllII[24] = (0x3D ^ 0x2E);
        WorldServer.lIlIIIlIllllII[25] = (105 + 132 - 181 + 84 ^ 138 + 70 - 136 + 80);
        WorldServer.lIlIIIlIllllII[26] = (48 + 65 - 96 + 134 ^ 46 + 13 + 33 + 38);
        WorldServer.lIlIIIlIllllII[27] = (0x18 ^ 0xE);
        WorldServer.lIlIIIlIllllII[28] = (-(0xFFFFFEFF & 0x2FCF) & (0xFFFFEFFF & 0x3FCE));
        WorldServer.lIlIIIlIllllII[29] = (0x71 ^ 0x32 ^ (0x61 ^ 0x35));
        WorldServer.lIlIIIlIllllII[30] = (0xFFFFEEAC & 0x3B9ADB53);
        WorldServer.lIlIIIlIllllII[31] = (0x2F ^ 0x37);
        WorldServer.lIlIIIlIllllII[32] = (0xBD ^ 0xA4);
        WorldServer.lIlIIIlIllllII[33] = (0x57 ^ 0x4D);
        WorldServer.lIlIIIlIllllII[34] = (0x44 ^ 0x4);
        WorldServer.lIlIIIlIllllII[35] = (0x91 ^ 0x8A);
        WorldServer.lIlIIIlIllllII[36] = (0xB6 ^ 0xAA);
        WorldServer.lIlIIIlIllllII[37] = (0x6C ^ 0x44 ^ (0xA4 ^ 0x91));
    }
    
    static {
        lllIIIllIIllIll();
        lllIIIllIIIllII();
        logger = LogManager.getLogger();
        final WeightedRandomChestContent[] array = new WeightedRandomChestContent[WorldServer.lIlIIIlIllllII[0]];
        array[WorldServer.lIlIIIlIllllII[1]] = new WeightedRandomChestContent(Items.stick, WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[3], WorldServer.lIlIIIlIllllII[0]);
        array[WorldServer.lIlIIIlIllllII[2]] = new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.planks), WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[3], WorldServer.lIlIIIlIllllII[0]);
        array[WorldServer.lIlIIIlIllllII[4]] = new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.log), WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[3], WorldServer.lIlIIIlIllllII[0]);
        array[WorldServer.lIlIIIlIllllII[3]] = new WeightedRandomChestContent(Items.stone_axe, WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[3]);
        array[WorldServer.lIlIIIlIllllII[5]] = new WeightedRandomChestContent(Items.wooden_axe, WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[6]);
        array[WorldServer.lIlIIIlIllllII[6]] = new WeightedRandomChestContent(Items.stone_pickaxe, WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[3]);
        array[WorldServer.lIlIIIlIllllII[7]] = new WeightedRandomChestContent(Items.wooden_pickaxe, WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[6]);
        array[WorldServer.lIlIIIlIllllII[8]] = new WeightedRandomChestContent(Items.apple, WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[4], WorldServer.lIlIIIlIllllII[3], WorldServer.lIlIIIlIllllII[6]);
        array[WorldServer.lIlIIIlIllllII[9]] = new WeightedRandomChestContent(Items.bread, WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[4], WorldServer.lIlIIIlIllllII[3], WorldServer.lIlIIIlIllllII[3]);
        array[WorldServer.lIlIIIlIllllII[10]] = new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.log2), WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[2], WorldServer.lIlIIIlIllllII[3], WorldServer.lIlIIIlIllllII[0]);
        bonusChestContent = Lists.newArrayList((Object[])array);
    }
    
    public void spawnParticle(final EnumParticleTypes lllllllllllllIIIllllIlIIIlIIIllI, final double lllllllllllllIIIllllIlIIIlIIIlII, final double lllllllllllllIIIllllIlIIIlIIllll, final double lllllllllllllIIIllllIlIIIlIIlllI, final int lllllllllllllIIIllllIlIIIlIIIIIl, final double lllllllllllllIIIllllIlIIIlIIllII, final double lllllllllllllIIIllllIlIIIIllllll, final double lllllllllllllIIIllllIlIIIlIIlIlI, final double lllllllllllllIIIllllIlIIIIllllIl, final int... lllllllllllllIIIllllIlIIIlIIIlIl) {
        this.spawnParticle(lllllllllllllIIIllllIlIIIlIIIllI, (boolean)(WorldServer.lIlIIIlIllllII[1] != 0), lllllllllllllIIIllllIlIIIlIIIlII, lllllllllllllIIIllllIlIIIlIIllll, lllllllllllllIIIllllIlIIIlIIlllI, lllllllllllllIIIllllIlIIIlIIIIIl, lllllllllllllIIIllllIlIIIlIIllII, lllllllllllllIIIllllIlIIIIllllll, lllllllllllllIIIllllIlIIIlIIlIlI, lllllllllllllIIIllllIlIIIIllllIl, lllllllllllllIIIllllIlIIIlIIIlIl);
    }
    
    private static String lllIIIlIllllIlI(final String lllllllllllllIIIllllIIlllllIIllI, final String lllllllllllllIIIllllIIlllllIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIlllllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIlllllIIlIl.getBytes(StandardCharsets.UTF_8)), WorldServer.lIlIIIlIllllII[9]), "DES");
            final Cipher lllllllllllllIIIllllIIlllllIlIII = Cipher.getInstance("DES");
            lllllllllllllIIIllllIIlllllIlIII.init(WorldServer.lIlIIIlIllllII[4], lllllllllllllIIIllllIIlllllIlIIl);
            return new String(lllllllllllllIIIllllIIlllllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIlllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIlllllIIlll) {
            lllllllllllllIIIllllIIlllllIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<NextTickListEntry> getPendingBlockUpdates(final Chunk lllllllllllllIIIllllIlIlllIllllI, final boolean lllllllllllllIIIllllIlIlllIlllIl) {
        final ChunkCoordIntPair lllllllllllllIIIllllIlIllllIIlII = lllllllllllllIIIllllIlIlllIllllI.getChunkCoordIntPair();
        final int lllllllllllllIIIllllIlIllllIIIll = (lllllllllllllIIIllllIlIllllIIlII.chunkXPos << WorldServer.lIlIIIlIllllII[5]) - WorldServer.lIlIIIlIllllII[4];
        final int lllllllllllllIIIllllIlIllllIIIlI = lllllllllllllIIIllllIlIllllIIIll + WorldServer.lIlIIIlIllllII[13] + WorldServer.lIlIIIlIllllII[4];
        final int lllllllllllllIIIllllIlIllllIIIIl = (lllllllllllllIIIllllIlIllllIIlII.chunkZPos << WorldServer.lIlIIIlIllllII[5]) - WorldServer.lIlIIIlIllllII[4];
        final int lllllllllllllIIIllllIlIllllIIIII = lllllllllllllIIIllllIlIllllIIIIl + WorldServer.lIlIIIlIllllII[13] + WorldServer.lIlIIIlIllllII[4];
        return this.func_175712_a(new StructureBoundingBox(lllllllllllllIIIllllIlIllllIIIll, WorldServer.lIlIIIlIllllII[1], lllllllllllllIIIllllIlIllllIIIIl, lllllllllllllIIIllllIlIllllIIIlI, WorldServer.lIlIIIlIllllII[28], lllllllllllllIIIllllIlIllllIIIII), lllllllllllllIIIllllIlIlllIlllIl);
    }
    
    private boolean canSpawnAnimals() {
        return this.mcServer.getCanSpawnAnimals();
    }
    
    private static boolean lllIIIllIlIIlIl(final int lllllllllllllIIIllllIIllllIIIIlI, final int lllllllllllllIIIllllIIllllIIIIIl) {
        return lllllllllllllIIIllllIIllllIIIIlI >= lllllllllllllIIIllllIIllllIIIIIl;
    }
    
    private static boolean lllIIIllIlIIlII(final Object lllllllllllllIIIllllIIlllIllIIll) {
        return lllllllllllllIIIllllIIlllIllIIll != null;
    }
    
    public BiomeGenBase.SpawnListEntry getSpawnListEntryForTypeAt(final EnumCreatureType lllllllllllllIIIllllIlllIIIIIIII, final BlockPos lllllllllllllIIIllllIllIllllllll) {
        final List<BiomeGenBase.SpawnListEntry> lllllllllllllIIIllllIlllIIIIIIlI = this.getChunkProvider().getPossibleCreatures(lllllllllllllIIIllllIlllIIIIIIII, lllllllllllllIIIllllIllIllllllll);
        BiomeGenBase.SpawnListEntry spawnListEntry;
        if (lllIIIllIlIIlII(lllllllllllllIIIllllIlllIIIIIIlI) && lllIIIllIlIIIlI(lllllllllllllIIIllllIlllIIIIIIlI.isEmpty() ? 1 : 0)) {
            spawnListEntry = WeightedRandom.getRandomItem(this.rand, lllllllllllllIIIllllIlllIIIIIIlI);
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            spawnListEntry = null;
        }
        return spawnListEntry;
    }
    
    @Override
    public boolean isCallingFromMinecraftThread() {
        return this.mcServer.isCallingFromMinecraftThread();
    }
    
    private void createSpawnPosition(final WorldSettings lllllllllllllIIIllllIlIlIIlIIIll) {
        if (lllIIIllIlIIIlI(this.provider.canRespawnHere() ? 1 : 0)) {
            this.worldInfo.setSpawn(BlockPos.ORIGIN.up(this.provider.getAverageGroundLevel()));
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIIIllIlIlIII(this.worldInfo.getTerrainType(), WorldType.DEBUG_WORLD)) {
            this.worldInfo.setSpawn(BlockPos.ORIGIN.up());
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.findingSpawnPoint = (WorldServer.lIlIIIlIllllII[2] != 0);
            final WorldChunkManager lllllllllllllIIIllllIlIlIIlIIIlI = this.provider.getWorldChunkManager();
            final List<BiomeGenBase> lllllllllllllIIIllllIlIlIIlIIIIl = lllllllllllllIIIllllIlIlIIlIIIlI.getBiomesToSpawnIn();
            final Random lllllllllllllIIIllllIlIlIIlIIIII = new Random(this.getSeed());
            final BlockPos lllllllllllllIIIllllIlIlIIIlllll = lllllllllllllIIIllllIlIlIIlIIIlI.findBiomePosition(WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[1], WorldServer.lIlIIIlIllllII[28], lllllllllllllIIIllllIlIlIIlIIIIl, lllllllllllllIIIllllIlIlIIlIIIII);
            int lllllllllllllIIIllllIlIlIIIllllI = WorldServer.lIlIIIlIllllII[1];
            final int lllllllllllllIIIllllIlIlIIIlllIl = this.provider.getAverageGroundLevel();
            int lllllllllllllIIIllllIlIlIIIlllII = WorldServer.lIlIIIlIllllII[1];
            if (lllIIIllIlIIlII(lllllllllllllIIIllllIlIlIIIlllll)) {
                lllllllllllllIIIllllIlIlIIIllllI = lllllllllllllIIIllllIlIlIIIlllll.getX();
                lllllllllllllIIIllllIlIlIIIlllII = lllllllllllllIIIllllIlIlIIIlllll.getZ();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else {
                WorldServer.logger.warn(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[33]]);
            }
            int lllllllllllllIIIllllIlIlIIIllIll = WorldServer.lIlIIIlIllllII[1];
            "".length();
            if (((0x11 ^ 0x5F ^ (0x6A ^ 0x18)) & (0xD1 ^ 0x99 ^ (0x37 ^ 0x43) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lllIIIllIlIIIII(this.provider.canCoordinateBeSpawn(lllllllllllllIIIllllIlIlIIIllllI, lllllllllllllIIIllllIlIlIIIlllII) ? 1 : 0)) {
                lllllllllllllIIIllllIlIlIIIllllI += lllllllllllllIIIllllIlIlIIlIIIII.nextInt(WorldServer.lIlIIIlIllllII[34]) - lllllllllllllIIIllllIlIlIIlIIIII.nextInt(WorldServer.lIlIIIlIllllII[34]);
                lllllllllllllIIIllllIlIlIIIlllII += lllllllllllllIIIllllIlIlIIlIIIII.nextInt(WorldServer.lIlIIIlIllllII[34]) - lllllllllllllIIIllllIlIlIIlIIIII.nextInt(WorldServer.lIlIIIlIllllII[34]);
                if (lllIIIllIlIIlll(++lllllllllllllIIIllllIlIlIIIllIll, WorldServer.lIlIIIlIllllII[23])) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
            }
            this.worldInfo.setSpawn(new BlockPos(lllllllllllllIIIllllIlIlIIIllllI, lllllllllllllIIIllllIlIlIIIlllIl, lllllllllllllIIIllllIlIlIIIlllII));
            this.findingSpawnPoint = (WorldServer.lIlIIIlIllllII[1] != 0);
            if (lllIIIllIlIIIII(lllllllllllllIIIllllIlIlIIlIIIll.isBonusChestEnabled() ? 1 : 0)) {
                this.createBonusChest();
            }
        }
    }
    
    @Override
    protected IChunkProvider createChunkProvider() {
        final IChunkLoader lllllllllllllIIIllllIlIllIlIIlll = this.saveHandler.getChunkLoader(this.provider);
        this.theChunkProviderServer = new ChunkProviderServer(this, lllllllllllllIIIllllIlIllIlIIlll, this.provider.createChunkGenerator());
        return this.theChunkProviderServer;
    }
    
    public PlayerManager getPlayerManager() {
        return this.thePlayerManager;
    }
    
    private boolean fireBlockEvent(final BlockEventData lllllllllllllIIIllllIlIIIlllIlll) {
        final IBlockState lllllllllllllIIIllllIlIIIllllIIl = this.getBlockState(lllllllllllllIIIllllIlIIIlllIlll.getPosition());
        int onBlockEventReceived;
        if (lllIIIllIlIlIII(lllllllllllllIIIllllIlIIIllllIIl.getBlock(), lllllllllllllIIIllllIlIIIlllIlll.getBlock())) {
            onBlockEventReceived = (lllllllllllllIIIllllIlIIIllllIIl.getBlock().onBlockEventReceived(this, lllllllllllllIIIllllIlIIIlllIlll.getPosition(), lllllllllllllIIIllllIlIIIllllIIl, lllllllllllllIIIllllIlIIIlllIlll.getEventID(), lllllllllllllIIIllllIlIIIlllIlll.getEventParameter()) ? 1 : 0);
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x67 ^ 0x6D) & ~(0x3D ^ 0x37)) != 0x0;
            }
        }
        else {
            onBlockEventReceived = WorldServer.lIlIIIlIllllII[1];
        }
        return onBlockEventReceived != 0;
    }
    
    public void saveChunkData() {
        if (lllIIIllIlIIIII(this.chunkProvider.canSave() ? 1 : 0)) {
            this.chunkProvider.saveExtraData();
        }
    }
    
    private static boolean lllIIIllIlIllIl(final int lllllllllllllIIIllllIIlllIlIIlll) {
        return lllllllllllllIIIllllIIlllIlIIlll < 0;
    }
    
    @Override
    public List<NextTickListEntry> func_175712_a(final StructureBoundingBox lllllllllllllIIIllllIlIlllIIlllI, final boolean lllllllllllllIIIllllIlIlllIIIlII) {
        List<NextTickListEntry> lllllllllllllIIIllllIlIlllIIllII = null;
        int lllllllllllllIIIllllIlIlllIIlIll = WorldServer.lIlIIIlIllllII[1];
        "".length();
        if ((0x30 ^ 0x34) <= 0) {
            return null;
        }
        while (!lllIIIllIlIIlIl(lllllllllllllIIIllllIlIlllIIlIll, WorldServer.lIlIIIlIllllII[4])) {
            Iterator<NextTickListEntry> lllllllllllllIIIllllIlIlllIIlIIl = null;
            if (lllIIIllIlIIIlI(lllllllllllllIIIllllIlIlllIIlIll)) {
                final Iterator<NextTickListEntry> lllllllllllllIIIllllIlIlllIIlIlI = this.pendingTickListEntriesTreeSet.iterator();
                "".length();
                if (((0x6D ^ 0x28) & ~(0x4F ^ 0xA)) != ((0x35 ^ 0x7C) & ~(0xC1 ^ 0x88))) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIllllIlIlllIIlIIl = this.pendingTickListEntriesThisTick.iterator();
                "".length();
                if ((0x6A ^ 0x10 ^ (0x2A ^ 0x54)) != (49 + 97 + 3 + 46 ^ 197 + 181 - 338 + 159)) {
                    return null;
                }
            }
            while (!lllIIIllIlIIIlI(lllllllllllllIIIllllIlIlllIIlIIl.hasNext() ? 1 : 0)) {
                final NextTickListEntry lllllllllllllIIIllllIlIlllIIlIII = lllllllllllllIIIllllIlIlllIIlIIl.next();
                final BlockPos lllllllllllllIIIllllIlIlllIIIlll = lllllllllllllIIIllllIlIlllIIlIII.position;
                if (lllIIIllIlIIlIl(lllllllllllllIIIllllIlIlllIIIlll.getX(), lllllllllllllIIIllllIlIlllIIlllI.minX) && lllIIIllIlIlIll(lllllllllllllIIIllllIlIlllIIIlll.getX(), lllllllllllllIIIllllIlIlllIIlllI.maxX) && lllIIIllIlIIlIl(lllllllllllllIIIllllIlIlllIIIlll.getZ(), lllllllllllllIIIllllIlIlllIIlllI.minZ) && lllIIIllIlIlIll(lllllllllllllIIIllllIlIlllIIIlll.getZ(), lllllllllllllIIIllllIlIlllIIlllI.maxZ)) {
                    if (lllIIIllIlIIIII(lllllllllllllIIIllllIlIlllIIIlII ? 1 : 0)) {
                        this.pendingTickListEntriesHashSet.remove(lllllllllllllIIIllllIlIlllIIlIII);
                        "".length();
                        lllllllllllllIIIllllIlIlllIIlIIl.remove();
                    }
                    if (lllIIIllIIlllIl(lllllllllllllIIIllllIlIlllIIllII)) {
                        lllllllllllllIIIllllIlIlllIIllII = (List<NextTickListEntry>)Lists.newArrayList();
                    }
                    lllllllllllllIIIllllIlIlllIIllII.add(lllllllllllllIIIllllIlIlllIIlIII);
                    "".length();
                }
            }
            ++lllllllllllllIIIllllIlIlllIIlIll;
        }
        return lllllllllllllIIIllllIlIlllIIllII;
    }
    
    private static int lllIIIllIIlllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public Teleporter getDefaultTeleporter() {
        return this.worldTeleporter;
    }
    
    public void saveAllChunks(final boolean lllllllllllllIIIllllIlIIllllIlIl, final IProgressUpdate lllllllllllllIIIllllIlIIllllIlII) throws MinecraftException {
        if (lllIIIllIlIIIII(this.chunkProvider.canSave() ? 1 : 0)) {
            if (lllIIIllIlIIlII(lllllllllllllIIIllllIlIIllllIlII)) {
                lllllllllllllIIIllllIlIIllllIlII.displaySavingString(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[35]]);
            }
            this.saveLevel();
            if (lllIIIllIlIIlII(lllllllllllllIIIllllIlIIllllIlII)) {
                lllllllllllllIIIllllIlIIllllIlII.displayLoadingString(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[36]]);
            }
            this.chunkProvider.saveChunks(lllllllllllllIIIllllIlIIllllIlIl, lllllllllllllIIIllllIlIIllllIlII);
            "".length();
            final byte lllllllllllllIIIllllIlIIlllIlllI = (byte)Lists.newArrayList((Iterable)this.theChunkProviderServer.func_152380_a()).iterator();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIlIIlllIlllI).hasNext() ? 1 : 0)) {
                final Chunk lllllllllllllIIIllllIlIIllllIIll = ((Iterator<Chunk>)lllllllllllllIIIllllIlIIlllIlllI).next();
                if (lllIIIllIlIIlII(lllllllllllllIIIllllIlIIllllIIll) && lllIIIllIlIIIlI(this.thePlayerManager.hasPlayerInstance(lllllllllllllIIIllllIlIIllllIIll.xPosition, lllllllllllllIIIllllIlIIllllIIll.zPosition) ? 1 : 0)) {
                    this.theChunkProviderServer.dropChunk(lllllllllllllIIIllllIlIIllllIIll.xPosition, lllllllllllllIIIllllIlIIllllIIll.zPosition);
                }
            }
        }
    }
    
    protected void saveLevel() throws MinecraftException {
        this.checkSessionLock();
        this.worldInfo.setBorderSize(this.getWorldBorder().getDiameter());
        this.worldInfo.getBorderCenterX(this.getWorldBorder().getCenterX());
        this.worldInfo.getBorderCenterZ(this.getWorldBorder().getCenterZ());
        this.worldInfo.setBorderSafeZone(this.getWorldBorder().getDamageBuffer());
        this.worldInfo.setBorderDamagePerBlock(this.getWorldBorder().getDamageAmount());
        this.worldInfo.setBorderWarningDistance(this.getWorldBorder().getWarningDistance());
        this.worldInfo.setBorderWarningTime(this.getWorldBorder().getWarningTime());
        this.worldInfo.setBorderLerpTarget(this.getWorldBorder().getTargetSize());
        this.worldInfo.setBorderLerpTime(this.getWorldBorder().getTimeUntilTarget());
        this.saveHandler.saveWorldInfoWithPlayer(this.worldInfo, this.mcServer.getConfigurationManager().getHostPlayerData());
        this.mapStorage.saveAllData();
    }
    
    private static boolean lllIIIllIlIlIlI(final int lllllllllllllIIIllllIIlllIlllIlI, final int lllllllllllllIIIllllIIlllIlllIIl) {
        return lllllllllllllIIIllllIIlllIlllIlI > lllllllllllllIIIllllIIlllIlllIIl;
    }
    
    @Override
    public void initialize(final WorldSettings lllllllllllllIIIllllIlIlIlIIIlIl) {
        if (lllIIIllIlIIIlI(this.worldInfo.isInitialized() ? 1 : 0)) {
            try {
                this.createSpawnPosition(lllllllllllllIIIllllIlIlIlIIIlIl);
                if (lllIIIllIlIlIII(this.worldInfo.getTerrainType(), WorldType.DEBUG_WORLD)) {
                    this.setDebugWorldSettings();
                }
                super.initialize(lllllllllllllIIIllllIlIlIlIIIlIl);
                "".length();
                if (((0x2B ^ 0x63 ^ (0x1A ^ 0x73)) & (38 + 123 - 119 + 108 ^ 126 + 49 - 31 + 39 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIllllIlIlIlIIIIll) {
                final CrashReport lllllllllllllIIIllllIlIlIlIIIIIl = CrashReport.makeCrashReport(lllllllllllllIIIllllIlIlIlIIIIll, WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[29]]);
                try {
                    this.addWorldInfoToCrashReport(lllllllllllllIIIllllIlIlIlIIIIIl);
                    "".length();
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                }
                catch (Throwable t) {}
                throw new ReportedException(lllllllllllllIIIllllIlIlIlIIIIIl);
            }
            this.worldInfo.setServerInitialized((boolean)(WorldServer.lIlIIIlIllllII[2] != 0));
        }
    }
    
    private static int lllIIIllIlIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected BlockPos adjustPosToNearbyEntity(final BlockPos lllllllllllllIIIllllIllIIllIIIII) {
        final BlockPos lllllllllllllIIIllllIllIIlIlllll = this.getPrecipitationHeight(lllllllllllllIIIllllIllIIllIIIII);
        final AxisAlignedBB lllllllllllllIIIllllIllIIlIllllI = new AxisAlignedBB(lllllllllllllIIIllllIllIIlIlllll, new BlockPos(lllllllllllllIIIllllIllIIlIlllll.getX(), this.getHeight(), lllllllllllllIIIllllIllIIlIlllll.getZ())).expand(3.0, 3.0, 3.0);
        final List<EntityLivingBase> lllllllllllllIIIllllIllIIlIlllIl = this.getEntitiesWithinAABB((Class<? extends EntityLivingBase>)EntityLivingBase.class, lllllllllllllIIIllllIllIIlIllllI, (com.google.common.base.Predicate<? super EntityLivingBase>)new Predicate<EntityLivingBase>() {
            private static final /* synthetic */ int[] llIllIIIlllIIl;
            
            static {
                lIIlIllIlIIlIIlI();
            }
            
            private static boolean lIIlIllIlIIlIIll(final Object llllllllllllIllIlIIIIIIIIllllIlI) {
                return llllllllllllIllIlIIIIIIIIllllIlI != null;
            }
            
            private static void lIIlIllIlIIlIIlI() {
                (llIllIIIlllIIl = new int[2])[0] = " ".length();
                WorldServer$1.llIllIIIlllIIl[1] = ((0x30 ^ 0x62) & ~(0x61 ^ 0x33));
            }
            
            private static boolean lIIlIllIlIIlIlII(final int llllllllllllIllIlIIIIIIIIllllIII) {
                return llllllllllllIllIlIIIIIIIIllllIII != 0;
            }
            
            public boolean apply(final EntityLivingBase llllllllllllIllIlIIIIIIIlIIIIIlI) {
                if (lIIlIllIlIIlIIll(llllllllllllIllIlIIIIIIIlIIIIIlI) && lIIlIllIlIIlIlII(llllllllllllIllIlIIIIIIIlIIIIIlI.isEntityAlive() ? 1 : 0) && lIIlIllIlIIlIlII(WorldServer.this.canSeeSky(llllllllllllIllIlIIIIIIIlIIIIIlI.getPosition()) ? 1 : 0)) {
                    return WorldServer$1.llIllIIIlllIIl[0] != 0;
                }
                return WorldServer$1.llIllIIIlllIIl[1] != 0;
            }
        });
        BlockPos position;
        if (lllIIIllIlIIIlI(lllllllllllllIIIllllIllIIlIlllIl.isEmpty() ? 1 : 0)) {
            position = lllllllllllllIIIllllIllIIlIlllIl.get(this.rand.nextInt(lllllllllllllIIIllllIllIIlIlllIl.size())).getPosition();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            position = lllllllllllllIIIllllIllIIlIlllll;
        }
        return position;
    }
    
    @Override
    protected int getRenderDistanceChunks() {
        return this.mcServer.getConfigurationManager().getViewDistance();
    }
    
    private static boolean lllIIIllIlIIIlI(final int lllllllllllllIIIllllIIlllIlIlIIl) {
        return lllllllllllllIIIllllIIlllIlIlIIl == 0;
    }
    
    private void sendQueuedBlockEvents() {
        "".length();
        if (((0x9E ^ 0xB4 ^ (0x1F ^ 0x74)) & (0x72 ^ 0x4C ^ 44 + 45 - 66 + 104 ^ -" ".length())) < 0) {
            return;
        }
        while (!lllIIIllIlIIIII(this.field_147490_S[this.blockEventCacheIndex].isEmpty() ? 1 : 0)) {
            final int lllllllllllllIIIllllIlIIlIIIIlII = this.blockEventCacheIndex;
            this.blockEventCacheIndex ^= WorldServer.lIlIIIlIllllII[2];
            final int lllllllllllllIIIllllIlIIIlllllll = (int)this.field_147490_S[lllllllllllllIIIllllIlIIlIIIIlII].iterator();
            "".length();
            if (-" ".length() >= ((0xD6 ^ 0xC5) & ~(0x19 ^ 0xA))) {
                return;
            }
            while (!lllIIIllIlIIIlI(((Iterator)lllllllllllllIIIllllIlIIIlllllll).hasNext() ? 1 : 0)) {
                final BlockEventData lllllllllllllIIIllllIlIIlIIIIIll = ((Iterator<BlockEventData>)lllllllllllllIIIllllIlIIIlllllll).next();
                if (lllIIIllIlIIIII(this.fireBlockEvent(lllllllllllllIIIllllIlIIlIIIIIll) ? 1 : 0)) {
                    this.mcServer.getConfigurationManager().sendToAllNear(lllllllllllllIIIllllIlIIlIIIIIll.getPosition().getX(), lllllllllllllIIIllllIlIIlIIIIIll.getPosition().getY(), lllllllllllllIIIllllIlIIlIIIIIll.getPosition().getZ(), 64.0, this.provider.getDimensionId(), new S24PacketBlockAction(lllllllllllllIIIllllIlIIlIIIIIll.getPosition(), lllllllllllllIIIllllIlIIlIIIIIll.getBlock(), lllllllllllllIIIllllIlIIlIIIIIll.getEventID(), lllllllllllllIIIllllIlIIlIIIIIll.getEventParameter()));
                }
            }
            this.field_147490_S[lllllllllllllIIIllllIlIIlIIIIlII].clear();
        }
    }
    
    @Override
    public void scheduleBlockUpdate(final BlockPos lllllllllllllIIIllllIllIIIIllIlI, final Block lllllllllllllIIIllllIllIIIIlllll, final int lllllllllllllIIIllllIllIIIIllllI, final int lllllllllllllIIIllllIllIIIIlllIl) {
        final NextTickListEntry lllllllllllllIIIllllIllIIIIlllII = new NextTickListEntry(lllllllllllllIIIllllIllIIIIllIlI, lllllllllllllIIIllllIllIIIIlllll);
        lllllllllllllIIIllllIllIIIIlllII.setPriority(lllllllllllllIIIllllIllIIIIlllIl);
        if (lllIIIllIlIIIIl(lllllllllllllIIIllllIllIIIIlllll.getMaterial(), Material.air)) {
            lllllllllllllIIIllllIllIIIIlllII.setScheduledTime(lllllllllllllIIIllllIllIIIIllllI + this.worldInfo.getWorldTotalTime());
            "".length();
        }
        if (lllIIIllIlIIIlI(this.pendingTickListEntriesHashSet.contains(lllllllllllllIIIllllIllIIIIlllII) ? 1 : 0)) {
            this.pendingTickListEntriesHashSet.add(lllllllllllllIIIllllIllIIIIlllII);
            "".length();
            this.pendingTickListEntriesTreeSet.add(lllllllllllllIIIllllIllIIIIlllII);
            "".length();
        }
    }
    
    @Override
    public ListenableFuture<Object> addScheduledTask(final Runnable lllllllllllllIIIllllIlIIIIIIIIII) {
        return this.mcServer.addScheduledTask(lllllllllllllIIIllllIlIIIIIIIIII);
    }
    
    private static boolean lllIIIllIIllllI(final int lllllllllllllIIIllllIIlllIlIIIll) {
        return lllllllllllllIIIllllIIlllIlIIIll > 0;
    }
    
    @Override
    public void scheduleUpdate(final BlockPos lllllllllllllIIIllllIllIIlIIIIlI, final Block lllllllllllllIIIllllIllIIlIIIlIl, final int lllllllllllllIIIllllIllIIlIIIIII) {
        this.updateBlockTick(lllllllllllllIIIllllIllIIlIIIIlI, lllllllllllllIIIllllIllIIlIIIlIl, lllllllllllllIIIllllIllIIlIIIIII, WorldServer.lIlIIIlIllllII[1]);
    }
    
    @Override
    public void setEntityState(final Entity lllllllllllllIIIllllIlIIllIIIIlI, final byte lllllllllllllIIIllllIlIIllIIIIIl) {
        this.getEntityTracker().func_151248_b(lllllllllllllIIIllllIlIIllIIIIlI, new S19PacketEntityStatus(lllllllllllllIIIllllIlIIllIIIIlI, lllllllllllllIIIllllIlIIllIIIIIl));
    }
    
    private static boolean lllIIIllIlIIllI(final int lllllllllllllIIIllllIIlllIlIIlIl) {
        return lllllllllllllIIIllllIIlllIlIIlIl <= 0;
    }
    
    private static String lllIIIlIllllIll(final String lllllllllllllIIIllllIIllllllIIIl, final String lllllllllllllIIIllllIIllllllIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIllllllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIllllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllIIllllllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllIIllllllIlIl.init(WorldServer.lIlIIIlIllllII[4], lllllllllllllIIIllllIIllllllIllI);
            return new String(lllllllllllllIIIllllIIllllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIllllllIlII) {
            lllllllllllllIIIllllIIllllllIlII.printStackTrace();
            return null;
        }
    }
    
    private void setDebugWorldSettings() {
        this.worldInfo.setMapFeaturesEnabled((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        this.worldInfo.setAllowCommands((boolean)(WorldServer.lIlIIIlIllllII[2] != 0));
        this.worldInfo.setRaining((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        this.worldInfo.setThundering((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        this.worldInfo.setCleanWeatherTime(WorldServer.lIlIIIlIllllII[30]);
        this.worldInfo.setWorldTime(6000L);
        this.worldInfo.setGameType(WorldSettings.GameType.SPECTATOR);
        this.worldInfo.setHardcore((boolean)(WorldServer.lIlIIIlIllllII[1] != 0));
        this.worldInfo.setDifficulty(EnumDifficulty.PEACEFUL);
        this.worldInfo.setDifficultyLocked((boolean)(WorldServer.lIlIIIlIllllII[2] != 0));
        this.getGameRules().setOrCreateGameRule(WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[31]], WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[32]]);
    }
    
    private static int lllIIIllIlIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lllIIIlIllllllI(String lllllllllllllIIIllllIIllllIlIIIl, final String lllllllllllllIIIllllIIllllIlIlIl) {
        lllllllllllllIIIllllIIllllIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllllIIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllllIIllllIlIlII = new StringBuilder();
        final char[] lllllllllllllIIIllllIIllllIlIIll = lllllllllllllIIIllllIIllllIlIlIl.toCharArray();
        int lllllllllllllIIIllllIIllllIlIIlI = WorldServer.lIlIIIlIllllII[1];
        final long lllllllllllllIIIllllIIllllIIllII = (Object)lllllllllllllIIIllllIIllllIlIIIl.toCharArray();
        final double lllllllllllllIIIllllIIllllIIlIll = lllllllllllllIIIllllIIllllIIllII.length;
        double lllllllllllllIIIllllIIllllIIlIlI = WorldServer.lIlIIIlIllllII[1];
        while (lllIIIllIlIlIll((int)lllllllllllllIIIllllIIllllIIlIlI, (int)lllllllllllllIIIllllIIllllIIlIll)) {
            final char lllllllllllllIIIllllIIllllIlIlll = lllllllllllllIIIllllIIllllIIllII[lllllllllllllIIIllllIIllllIIlIlI];
            lllllllllllllIIIllllIIllllIlIlII.append((char)(lllllllllllllIIIllllIIllllIlIlll ^ lllllllllllllIIIllllIIllllIlIIll[lllllllllllllIIIllllIIllllIlIIlI % lllllllllllllIIIllllIIllllIlIIll.length]));
            "".length();
            ++lllllllllllllIIIllllIIllllIlIIlI;
            ++lllllllllllllIIIllllIIllllIIlIlI;
            "".length();
            if (((0xAD ^ 0x8C) & ~(0x4E ^ 0x6F)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllllIIllllIlIlII);
    }
    
    public void resetUpdateEntityTick() {
        this.updateEntityTick = WorldServer.lIlIIIlIllllII[1];
    }
    
    private static void lllIIIllIIIllII() {
        (lIlIIIlIllIIll = new String[WorldServer.lIlIIIlIllllII[37]])[WorldServer.lIlIIIlIllllII[1]] = lllIIIlIllllIlI("edCSJVRcpJ5wsb+Zjmr1oQ==", "EbmgV");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[2]] = lllIIIlIllllIll("G+UrSYF/tpZ90rkvGnaSXg==", "IPwiO");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[4]] = lllIIIlIllllIlI("c+/UgPkYVnpJ49sxjoI5fg==", "WCGks");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[3]] = lllIIIlIllllllI("HAMVCjMQGxk8MQ==", "qlwYC");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[5]] = lllIIIlIllllllI("Fws4NTQgFBQtOBoKEg==", "sduZV");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[6]] = lllIIIlIllllIll("/NWzlNnQ4xCcgAPaNJ1U9w==", "ksbry");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[7]] = lllIIIlIllllIll("ph1l6Kdl1+SVpoKsNgQ9XQ==", "IbACJ");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[8]] = lllIIIlIllllIlI("u2aUGghtd0FK5N6FlngYRA==", "tXDPx");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[9]] = lllIIIlIllllIll("MNDH+Vrdh6xg4w0F7dtnnQ==", "JkLvj");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[10]] = lllIIIlIllllIlI("pHFrQgPtjOTkUb76Np0lPg==", "ZhQSP");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[0]] = lllIIIlIllllIll("eYBopcLLP68=", "RNzsp");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[11]] = lllIIIlIllllIll("uSr8Gl7Mj8Oyj4mwT3tbew==", "Mnhgk");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[14]] = lllIIIlIllllIll("JW+Cv3xLDTt3r7UZPDrxmg==", "GAsix");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[15]] = lllIIIlIllllIll("A4iAh77ybQAcj6fJra8bZw==", "ESuxc");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[16]] = lllIIIlIllllIlI("LRxUiBLHo6M=", "jpjVe");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[19]] = lllIIIlIllllIll("xZh96iwUKqaStR/nxcwfdg==", "TaBRR");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[13]] = lllIIIlIllllllI("ByIaLi0fJBouHA==", "sKyEo");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[20]] = lllIIIlIllllIll("tO4FswWPtAcFUDU5UgCvOA==", "NGucO");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[22]] = lllIIIlIllllllI("Aj0rDiczLDwxADU/aAkAJSBoChwidCcDSSUtJgYB", "VTHei");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[24]] = lllIIIlIllllIll("uQu6k4fOVSizkHm++gytZg==", "iMpEG");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[25]] = lllIIIlIllllIll("QFFQe1JXBho=", "qefFx");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[26]] = lllIIIlIllllllI("IBMUIgURAhgpVRIDHisQRR8eJB4MBRBnFEUJGygWDg==", "ekwGu");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[27]] = lllIIIlIllllllI("BiIILB1kLAImGCNuEyYVLysD", "DNgOv");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[29]] = lllIIIlIllllIll("AizF8iPiLCYwIL5GcSLZoAmEaSiPHGg5sD4N1RX2mG8=", "SXjFr");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[31]] = lllIIIlIllllllI("BQQiMAgNAgE5BSISBT0U", "akfQq");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[32]] = lllIIIlIllllIll("bifbutV7dOI=", "WMMJR");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[33]] = lllIIIlIllllIll("+UBpfeH1pJmlfIyt2r9G+VepxRrhBylAYg3BUZLTnFE=", "sLlfq");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[35]] = lllIIIlIllllIlI("cAtbqWWAdH9aHcNlcXxtZg==", "jkfOt");
        WorldServer.lIlIIIlIllIIll[WorldServer.lIlIIIlIllllII[36]] = lllIIIlIllllllI("ETICMBQlcxcxDyw4Bw==", "BStYz");
    }
    
    private static boolean lllIIIllIlIIIIl(final Object lllllllllllllIIIllllIIlllIllIllI, final Object lllllllllllllIIIllllIIlllIllIlIl) {
        return lllllllllllllIIIllllIIlllIllIllI != lllllllllllllIIIllllIIlllIllIlIl;
    }
    
    static class ServerBlockEventList extends ArrayList<BlockEventData>
    {
        private ServerBlockEventList() {
        }
    }
}
