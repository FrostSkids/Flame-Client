// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.util.Vec3i;
import net.minecraft.server.MinecraftServer;
import java.util.UUID;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.ITickable;
import java.util.Collection;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.util.MathHelper;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import com.google.common.base.Predicate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.AxisAlignedBB;
import java.util.Set;
import net.minecraft.profiler.Profiler;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Random;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.village.VillageCollection;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.entity.Entity;
import net.minecraft.util.IntHashMap;
import java.util.Calendar;
import net.minecraft.tileentity.TileEntity;
import java.util.List;
import net.minecraft.scoreboard.Scoreboard;

public abstract class World implements IBlockAccess
{
    protected /* synthetic */ Scoreboard worldScoreboard;
    protected /* synthetic */ boolean spawnPeacefulMobs;
    public final /* synthetic */ boolean isRemote;
    protected /* synthetic */ float prevRainingStrength;
    private final /* synthetic */ List<TileEntity> tileEntitiesToBeRemoved;
    protected /* synthetic */ float thunderingStrength;
    private final /* synthetic */ Calendar theCalendar;
    private final /* synthetic */ List<TileEntity> addedTileEntityList;
    private /* synthetic */ int ambientTickCountdown;
    protected final /* synthetic */ IntHashMap<Entity> entitiesById;
    public final /* synthetic */ List<Entity> loadedEntityList;
    protected /* synthetic */ boolean findingSpawnPoint;
    private /* synthetic */ int skylightSubtracted;
    protected /* synthetic */ IChunkProvider chunkProvider;
    protected /* synthetic */ MapStorage mapStorage;
    protected /* synthetic */ WorldInfo worldInfo;
    private final /* synthetic */ WorldBorder worldBorder;
    protected /* synthetic */ VillageCollection villageCollectionObj;
    protected /* synthetic */ float prevThunderingStrength;
    protected final /* synthetic */ ISaveHandler saveHandler;
    public final /* synthetic */ Random rand;
    private static final /* synthetic */ String[] lIlIlIIIlllIll;
    private /* synthetic */ int field_181546_a;
    public final /* synthetic */ List<EntityPlayer> playerEntities;
    protected /* synthetic */ boolean spawnHostileMobs;
    public final /* synthetic */ Profiler theProfiler;
    protected /* synthetic */ boolean scheduledUpdatesAreImmediate;
    public final /* synthetic */ List<TileEntity> loadedTileEntityList;
    protected final /* synthetic */ List<Entity> unloadedEntityList;
    private /* synthetic */ boolean processingLoadedTiles;
    private /* synthetic */ long cloudColour;
    public final /* synthetic */ WorldProvider provider;
    protected /* synthetic */ int updateLCG;
    private /* synthetic */ int lastLightningBolt;
    public final /* synthetic */ List<Entity> weatherEffects;
    public final /* synthetic */ List<TileEntity> tickableTileEntities;
    /* synthetic */ int[] lightUpdateBlockList;
    private static final /* synthetic */ int[] lIlIlIIlIlIllI;
    protected /* synthetic */ float rainingStrength;
    protected /* synthetic */ Set<ChunkCoordIntPair> activeChunkSet;
    protected /* synthetic */ List<IWorldAccess> worldAccesses;
    
    public void setItemData(final String lllllllllllllIIIlIIlIlIlllllIllI, final WorldSavedData lllllllllllllIIIlIIlIlIlllllIlIl) {
        this.mapStorage.setData(lllllllllllllIIIlIIlIlIlllllIllI, lllllllllllllIIIlIIlIlIlllllIlIl);
    }
    
    public float getRainStrength(final float lllllllllllllIIIlIIlIllIIIIlllII) {
        return this.prevRainingStrength + (this.rainingStrength - this.prevRainingStrength) * lllllllllllllIIIlIIlIllIIIIlllII;
    }
    
    public Entity getEntityByID(final int lllllllllllllIIIlIIlIllllIIlIllI) {
        return this.entitiesById.lookup(lllllllllllllIIIlIIlIllllIIlIllI);
    }
    
    public <T extends Entity> List<T> getEntitiesWithinAABB(final Class<? extends T> lllllllllllllIIIlIIlIlllllIlllll, final AxisAlignedBB lllllllllllllIIIlIIlIlllllIllIll) {
        return this.getEntitiesWithinAABB(lllllllllllllIIIlIIlIlllllIlllll, lllllllllllllIIIlIIlIlllllIllIll, (com.google.common.base.Predicate<? super T>)EntitySelectors.NOT_SPECTATING);
    }
    
    private static boolean lllIllIIlIIlIII(final Object lllllllllllllIIIlIIlIlIIlIlllllI) {
        return lllllllllllllIIIlIIlIlIIlIlllllI == null;
    }
    
    public boolean checkNoEntityCollision(final AxisAlignedBB lllllllllllllIIIlIIllIllllIlllll, final Entity lllllllllllllIIIlIIllIllllIlIlII) {
        final List<Entity> lllllllllllllIIIlIIllIllllIllIll = this.getEntitiesWithinAABBExcludingEntity(null, lllllllllllllIIIlIIllIllllIlllll);
        int lllllllllllllIIIlIIllIllllIllIIl = World.lIlIlIIlIlIllI[5];
        "".length();
        if (-"  ".length() >= 0) {
            return ((0xD4 ^ 0xC3 ^ (0x5D ^ 0x44)) & (0x69 ^ 0x7 ^ (0x5F ^ 0x3F) ^ -" ".length())) != 0x0;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIllllIllIIl, lllllllllllllIIIlIIllIllllIllIll.size())) {
            final Entity lllllllllllllIIIlIIllIllllIlIlll = lllllllllllllIIIlIIllIllllIllIll.get(lllllllllllllIIIlIIllIllllIllIIl);
            if (lllIllIIlIIIllI(lllllllllllllIIIlIIllIllllIlIlll.isDead ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIllIllllIlIlll.preventEntitySpawning ? 1 : 0) && lllIllIIlIIlIll(lllllllllllllIIIlIIllIllllIlIlll, lllllllllllllIIIlIIllIllllIlIlII) && (!lllIllIIlIlIIIl(lllllllllllllIIIlIIllIllllIlIlII) || (lllIllIIlIIlIll(lllllllllllllIIIlIIllIllllIlIlII.ridingEntity, lllllllllllllIIIlIIllIllllIlIlll) && lllIllIIlIIlIll(lllllllllllllIIIlIIllIllllIlIlII.riddenByEntity, lllllllllllllIIIlIIllIllllIlIlll)))) {
                return World.lIlIlIIlIlIllI[5] != 0;
            }
            ++lllllllllllllIIIlIIllIllllIllIIl;
        }
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public MapStorage getMapStorage() {
        return this.mapStorage;
    }
    
    @Override
    public int getStrongPower(final BlockPos lllllllllllllIIIlIIlIlllIIllllll, final EnumFacing lllllllllllllIIIlIIlIlllIlIIIIlI) {
        final IBlockState lllllllllllllIIIlIIlIlllIlIIIIIl = this.getBlockState(lllllllllllllIIIlIIlIlllIIllllll);
        return lllllllllllllIIIlIIlIlllIlIIIIIl.getBlock().getStrongPower(this, lllllllllllllIIIlIIlIlllIIllllll, lllllllllllllIIIlIIlIlllIlIIIIIl, lllllllllllllIIIlIIlIlllIlIIIIlI);
    }
    
    public boolean canBlockFreezeNoWater(final BlockPos lllllllllllllIIIlIIllIIlIllIIllI) {
        return this.canBlockFreeze(lllllllllllllIIIlIIllIIlIllIIllI, (boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    private int getRawLight(final BlockPos lllllllllllllIIIlIIllIIlIIIlIlII, final EnumSkyBlock lllllllllllllIIIlIIllIIlIIIlllII) {
        if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIIlIIIlllII, EnumSkyBlock.SKY) && lllIllIIlIIIIIl(this.canSeeSky(lllllllllllllIIIlIIllIIlIIIlIlII) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[18];
        }
        final Block lllllllllllllIIIlIIllIIlIIIllIll = this.getBlockState(lllllllllllllIIIlIIllIIlIIIlIlII).getBlock();
        int lightValue;
        if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIIlIIIlllII, EnumSkyBlock.SKY)) {
            lightValue = World.lIlIlIIlIlIllI[5];
            "".length();
            if (((0xD ^ 0x6D) & ~(0xF ^ 0x6F)) >= "   ".length()) {
                return (0x4 ^ 0x4C) & ~(0x6A ^ 0x22);
            }
        }
        else {
            lightValue = lllllllllllllIIIlIIllIIlIIIllIll.getLightValue();
        }
        int lllllllllllllIIIlIIllIIlIIIllIlI = lightValue;
        int lllllllllllllIIIlIIllIIlIIIllIIl = lllllllllllllIIIlIIllIIlIIIllIll.getLightOpacity();
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIlIIIllIIl, World.lIlIlIIlIlIllI[18]) && lllIllIIlIIllII(lllllllllllllIIIlIIllIIlIIIllIll.getLightValue())) {
            lllllllllllllIIIlIIllIIlIIIllIIl = World.lIlIlIIlIlIllI[3];
        }
        if (lllIllIIlIIIIll(lllllllllllllIIIlIIllIIlIIIllIIl, World.lIlIlIIlIlIllI[3])) {
            lllllllllllllIIIlIIllIIlIIIllIIl = World.lIlIlIIlIlIllI[3];
        }
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIlIIIllIIl, World.lIlIlIIlIlIllI[18])) {
            return World.lIlIlIIlIlIllI[5];
        }
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIlIIIllIlI, World.lIlIlIIlIlIllI[28])) {
            return lllllllllllllIIIlIIllIIlIIIllIlI;
        }
        final long lllllllllllllIIIlIIllIIlIIIIllII;
        final boolean lllllllllllllIIIlIIllIIlIIIIllIl = ((EnumFacing[])(Object)(lllllllllllllIIIlIIllIIlIIIIllII = (long)(Object)EnumFacing.values())).length != 0;
        Exception lllllllllllllIIIlIIllIIlIIIIlllI = (Exception)World.lIlIlIIlIlIllI[5];
        "".length();
        if (((0x31 ^ 0x68) & ~(0xE8 ^ 0xB1)) >= "  ".length()) {
            return (0x17 ^ 0x44) & ~(0x74 ^ 0x27);
        }
        while (!lllIllIIlIIIIlI((int)lllllllllllllIIIlIIllIIlIIIIlllI, lllllllllllllIIIlIIllIIlIIIIllIl ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIlIIllIIlIIIllIII = lllllllllllllIIIlIIllIIlIIIIllII[lllllllllllllIIIlIIllIIlIIIIlllI];
            final BlockPos lllllllllllllIIIlIIllIIlIIIlIlll = lllllllllllllIIIlIIllIIlIIIlIlII.offset(lllllllllllllIIIlIIllIIlIIIllIII);
            final int lllllllllllllIIIlIIllIIlIIIlIllI = this.getLightFor(lllllllllllllIIIlIIllIIlIIIlllII, lllllllllllllIIIlIIllIIlIIIlIlll) - lllllllllllllIIIlIIllIIlIIIllIIl;
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllIIlIIIlIllI, lllllllllllllIIIlIIllIIlIIIllIlI)) {
                lllllllllllllIIIlIIllIIlIIIllIlI = lllllllllllllIIIlIIllIIlIIIlIllI;
            }
            if (lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIlIIIllIlI, World.lIlIlIIlIlIllI[28])) {
                return lllllllllllllIIIlIIllIIlIIIllIlI;
            }
            ++lllllllllllllIIIlIIllIIlIIIIlllI;
        }
        return lllllllllllllIIIlIIllIIlIIIllIlI;
    }
    
    public void playSound(final double lllllllllllllIIIlIIllllIlIIIIllI, final double lllllllllllllIIIlIIllllIlIIIIlIl, final double lllllllllllllIIIlIIllllIlIIIIlII, final String lllllllllllllIIIlIIllllIlIIIIIll, final float lllllllllllllIIIlIIllllIlIIIIIlI, final float lllllllllllllIIIlIIllllIlIIIIIIl, final boolean lllllllllllllIIIlIIllllIlIIIIIII) {
    }
    
    protected World(final ISaveHandler lllllllllllllIIIlIlIIIIlIlIlIIIl, final WorldInfo lllllllllllllIIIlIlIIIIlIlIlIIII, final WorldProvider lllllllllllllIIIlIlIIIIlIlIIlIIl, final Profiler lllllllllllllIIIlIlIIIIlIlIIlIII, final boolean lllllllllllllIIIlIlIIIIlIlIIIlll) {
        this.field_181546_a = World.lIlIlIIlIlIllI[0];
        this.loadedEntityList = (List<Entity>)Lists.newArrayList();
        this.unloadedEntityList = (List<Entity>)Lists.newArrayList();
        this.loadedTileEntityList = (List<TileEntity>)Lists.newArrayList();
        this.tickableTileEntities = (List<TileEntity>)Lists.newArrayList();
        this.addedTileEntityList = (List<TileEntity>)Lists.newArrayList();
        this.tileEntitiesToBeRemoved = (List<TileEntity>)Lists.newArrayList();
        this.playerEntities = (List<EntityPlayer>)Lists.newArrayList();
        this.weatherEffects = (List<Entity>)Lists.newArrayList();
        this.entitiesById = new IntHashMap<Entity>();
        this.cloudColour = 16777215L;
        this.updateLCG = new Random().nextInt();
        this.rand = new Random();
        this.worldAccesses = (List<IWorldAccess>)Lists.newArrayList();
        this.theCalendar = Calendar.getInstance();
        this.worldScoreboard = new Scoreboard();
        this.activeChunkSet = (Set<ChunkCoordIntPair>)Sets.newHashSet();
        this.ambientTickCountdown = this.rand.nextInt(World.lIlIlIIlIlIllI[2]);
        this.spawnHostileMobs = (World.lIlIlIIlIlIllI[3] != 0);
        this.spawnPeacefulMobs = (World.lIlIlIIlIlIllI[3] != 0);
        this.lightUpdateBlockList = new int[World.lIlIlIIlIlIllI[4]];
        this.saveHandler = lllllllllllllIIIlIlIIIIlIlIlIIIl;
        this.theProfiler = lllllllllllllIIIlIlIIIIlIlIIlIII;
        this.worldInfo = lllllllllllllIIIlIlIIIIlIlIlIIII;
        this.provider = lllllllllllllIIIlIlIIIIlIlIIlIIl;
        this.isRemote = lllllllllllllIIIlIlIIIIlIlIIIlll;
        this.worldBorder = lllllllllllllIIIlIlIIIIlIlIIlIIl.getWorldBorder();
    }
    
    public int getMoonPhase() {
        return this.provider.getMoonPhase(this.worldInfo.getWorldTime());
    }
    
    private static boolean lllIllIIlIIIlII(final int lllllllllllllIIIlIIlIlIIlIlllIII) {
        return lllllllllllllIIIlIIlIlIIlIlllIII >= 0;
    }
    
    public MovingObjectPosition rayTraceBlocks(final Vec3 lllllllllllllIIIlIIlllllIIlIllII, final Vec3 lllllllllllllIIIlIIlllllIIlIllll, final boolean lllllllllllllIIIlIIlllllIIlIlIlI) {
        return this.rayTraceBlocks(lllllllllllllIIIlIIlllllIIlIllII, lllllllllllllIIIlIIlllllIIlIllll, lllllllllllllIIIlIIlllllIIlIlIlI, (boolean)(World.lIlIlIIlIlIllI[5] != 0), (boolean)(World.lIlIlIIlIlIllI[5] != 0));
    }
    
    public ISaveHandler getSaveHandler() {
        return this.saveHandler;
    }
    
    public void makeFireworks(final double lllllllllllllIIIlIIlIlIlIllIllII, final double lllllllllllllIIIlIIlIlIlIllIlIll, final double lllllllllllllIIIlIIlIlIlIllIlIlI, final double lllllllllllllIIIlIIlIlIlIllIlIIl, final double lllllllllllllIIIlIIlIlIlIllIlIII, final double lllllllllllllIIIlIIlIlIlIllIIlll, final NBTTagCompound lllllllllllllIIIlIIlIlIlIllIIllI) {
    }
    
    private static int lllIllIIllIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public BlockPos getHeight(final BlockPos lllllllllllllIIIlIIllllllIlIlIlI) {
        int lllllllllllllIIIlIIllllllIlIllII = 0;
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIllllllIlIlIlI.getX(), World.lIlIlIIlIlIllI[9]) && lllIllIIlIIIIlI(lllllllllllllIIIlIIllllllIlIlIlI.getZ(), World.lIlIlIIlIlIllI[9]) && lllIllIIlIIIIll(lllllllllllllIIIlIIllllllIlIlIlI.getX(), World.lIlIlIIlIlIllI[10]) && lllIllIIlIIIIll(lllllllllllllIIIlIIllllllIlIlIlI.getZ(), World.lIlIlIIlIlIllI[10])) {
            if (lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIllllllIlIlIlI.getX() >> World.lIlIlIIlIlIllI[12], lllllllllllllIIIlIIllllllIlIlIlI.getZ() >> World.lIlIlIIlIlIllI[12], (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
                final int lllllllllllllIIIlIIllllllIlIlllI = this.getChunkFromChunkCoords(lllllllllllllIIIlIIllllllIlIlIlI.getX() >> World.lIlIlIIlIlIllI[12], lllllllllllllIIIlIIllllllIlIlIlI.getZ() >> World.lIlIlIIlIlIllI[12]).getHeightValue(lllllllllllllIIIlIIllllllIlIlIlI.getX() & World.lIlIlIIlIlIllI[18], lllllllllllllIIIlIIllllllIlIlIlI.getZ() & World.lIlIlIIlIlIllI[18]);
                "".length();
                if (((0x99 ^ 0xA2) & ~(0x16 ^ 0x2D)) != 0x0) {
                    return null;
                }
            }
            else {
                final int lllllllllllllIIIlIIllllllIlIllIl = World.lIlIlIIlIlIllI[5];
                "".length();
                if (" ".length() > (0x40 ^ 0x44)) {
                    return null;
                }
            }
        }
        else {
            lllllllllllllIIIlIIllllllIlIllII = this.func_181545_F() + World.lIlIlIIlIlIllI[3];
        }
        return new BlockPos(lllllllllllllIIIlIIllllllIlIlIlI.getX(), lllllllllllllIIIlIIllllllIlIllII, lllllllllllllIIIlIIllllllIlIlIlI.getZ());
    }
    
    public String getProviderName() {
        return this.chunkProvider.makeString();
    }
    
    private static int lllIllIIlIlIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public int isBlockIndirectlyGettingPowered(final BlockPos lllllllllllllIIIlIIlIllIlllIllII) {
        int lllllllllllllIIIlIIlIllIlllIlIll = World.lIlIlIIlIlIllI[5];
        final byte lllllllllllllIIIlIIlIllIlllIIIlI;
        final String lllllllllllllIIIlIIlIllIlllIIIll = (String)((EnumFacing[])(Object)(lllllllllllllIIIlIIlIllIlllIIIlI = (byte)(Object)EnumFacing.values())).length;
        double lllllllllllllIIIlIIlIllIlllIIlII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (-" ".length() > 0) {
            return (0x35 ^ 0x3) & ~(0x9B ^ 0xAD);
        }
        while (!lllIllIIlIIIIlI((int)lllllllllllllIIIlIIlIllIlllIIlII, (int)lllllllllllllIIIlIIlIllIlllIIIll)) {
            final EnumFacing lllllllllllllIIIlIIlIllIlllIlIlI = lllllllllllllIIIlIIlIllIlllIIIlI[lllllllllllllIIIlIIlIllIlllIIlII];
            final int lllllllllllllIIIlIIlIllIlllIlIIl = this.getRedstonePower(lllllllllllllIIIlIIlIllIlllIllII.offset(lllllllllllllIIIlIIlIllIlllIlIlI), lllllllllllllIIIlIIlIllIlllIlIlI);
            if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIllIlllIlIIl, World.lIlIlIIlIlIllI[18])) {
                return World.lIlIlIIlIlIllI[18];
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIlIllIlllIlIIl, lllllllllllllIIIlIIlIllIlllIlIll)) {
                lllllllllllllIIIlIIlIllIlllIlIll = lllllllllllllIIIlIIlIllIlllIlIIl;
            }
            ++lllllllllllllIIIlIIlIllIlllIIlII;
        }
        return lllllllllllllIIIlIIlIllIlllIlIll;
    }
    
    public int getLastLightningBolt() {
        return this.lastLightningBolt;
    }
    
    public int getChunksLowestHorizon(final int lllllllllllllIIIlIIllllllIIlllll, final int lllllllllllllIIIlIIllllllIIllllI) {
        if (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllllllIIlllll, World.lIlIlIIlIlIllI[9]) || !lllIllIIlIIIIlI(lllllllllllllIIIlIIllllllIIllllI, World.lIlIlIIlIlIllI[9]) || !lllIllIIlIIIIll(lllllllllllllIIIlIIllllllIIlllll, World.lIlIlIIlIlIllI[10]) || !lllIllIIlIIIIll(lllllllllllllIIIlIIllllllIIllllI, World.lIlIlIIlIlIllI[10])) {
            return this.func_181545_F() + World.lIlIlIIlIlIllI[3];
        }
        if (lllIllIIlIIIllI(this.isChunkLoaded(lllllllllllllIIIlIIllllllIIlllll >> World.lIlIlIIlIlIllI[12], lllllllllllllIIIlIIllllllIIllllI >> World.lIlIlIIlIlIllI[12], (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5];
        }
        final Chunk lllllllllllllIIIlIIllllllIlIIIIl = this.getChunkFromChunkCoords(lllllllllllllIIIlIIllllllIIlllll >> World.lIlIlIIlIlIllI[12], lllllllllllllIIIlIIllllllIIllllI >> World.lIlIlIIlIlIllI[12]);
        return lllllllllllllIIIlIIllllllIlIIIIl.getLowestHeight();
    }
    
    public boolean isBlockLoaded(final BlockPos lllllllllllllIIIlIlIIIIlIIIIllll) {
        return this.isBlockLoaded(lllllllllllllIIIlIlIIIIlIIIIllll, (boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    private static String lllIlIlllllIIlI(String lllllllllllllIIIlIIlIlIlIIIIIIII, final String lllllllllllllIIIlIIlIlIlIIIIIlII) {
        lllllllllllllIIIlIIlIlIlIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIlIIlIlIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIlIlIlIIIIIIll = new StringBuilder();
        final char[] lllllllllllllIIIlIIlIlIlIIIIIIlI = lllllllllllllIIIlIIlIlIlIIIIIlII.toCharArray();
        int lllllllllllllIIIlIIlIlIlIIIIIIIl = World.lIlIlIIlIlIllI[5];
        final Exception lllllllllllllIIIlIIlIlIIlllllIll = (Object)lllllllllllllIIIlIIlIlIlIIIIIIII.toCharArray();
        final long lllllllllllllIIIlIIlIlIIlllllIlI = lllllllllllllIIIlIIlIlIIlllllIll.length;
        Exception lllllllllllllIIIlIIlIlIIlllllIIl = (Exception)World.lIlIlIIlIlIllI[5];
        while (lllIllIIlIIIIll((int)lllllllllllllIIIlIIlIlIIlllllIIl, (int)lllllllllllllIIIlIIlIlIIlllllIlI)) {
            final char lllllllllllllIIIlIIlIlIlIIIIIllI = lllllllllllllIIIlIIlIlIIlllllIll[lllllllllllllIIIlIIlIlIIlllllIIl];
            lllllllllllllIIIlIIlIlIlIIIIIIll.append((char)(lllllllllllllIIIlIIlIlIlIIIIIllI ^ lllllllllllllIIIlIIlIlIlIIIIIIlI[lllllllllllllIIIlIIlIlIlIIIIIIIl % lllllllllllllIIIlIIlIlIlIIIIIIlI.length]));
            "".length();
            ++lllllllllllllIIIlIIlIlIlIIIIIIIl;
            ++lllllllllllllIIIlIIlIlIIlllllIIl;
            "".length();
            if (-(0x2C ^ 0x28) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIlIlIlIIIIIIll);
    }
    
    public MovingObjectPosition rayTraceBlocks(final Vec3 lllllllllllllIIIlIIlllllIIllIlll, final Vec3 lllllllllllllIIIlIIlllllIIlllIIl) {
        return this.rayTraceBlocks(lllllllllllllIIIlIIlllllIIllIlll, lllllllllllllIIIlIIlllllIIlllIIl, (boolean)(World.lIlIlIIlIlIllI[5] != 0), (boolean)(World.lIlIlIIlIlIllI[5] != 0), (boolean)(World.lIlIlIIlIlIllI[5] != 0));
    }
    
    public float getCurrentMoonPhaseFactor() {
        return WorldProvider.moonPhaseFactors[this.provider.getMoonPhase(this.worldInfo.getWorldTime())];
    }
    
    private static int lllIllIIlIllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public Vec3 getFogColor(final float lllllllllllllIIIlIIlllIIllIIIlII) {
        final float lllllllllllllIIIlIIlllIIllIIIIll = this.getCelestialAngle(lllllllllllllIIIlIIlllIIllIIIlII);
        return this.provider.getFogColor(lllllllllllllIIIlIIlllIIllIIIIll, lllllllllllllIIIlIIlllIIllIIIlII);
    }
    
    public Vec3 getSkyColor(final Entity lllllllllllllIIIlIIlllIlIIIlIIlI, final float lllllllllllllIIIlIIlllIlIIlIIlll) {
        final float lllllllllllllIIIlIIlllIlIIlIIllI = this.getCelestialAngle(lllllllllllllIIIlIIlllIlIIlIIlll);
        float lllllllllllllIIIlIIlllIlIIlIIlIl = MathHelper.cos(lllllllllllllIIIlIIlllIlIIlIIllI * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        lllllllllllllIIIlIIlllIlIIlIIlIl = MathHelper.clamp_float(lllllllllllllIIIlIIlllIlIIlIIlIl, 0.0f, 1.0f);
        final int lllllllllllllIIIlIIlllIlIIlIIlII = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIIIlIIlI.posX);
        final int lllllllllllllIIIlIIlllIlIIlIIIll = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIIIlIIlI.posY);
        final int lllllllllllllIIIlIIlllIlIIlIIIlI = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIIIlIIlI.posZ);
        final BlockPos lllllllllllllIIIlIIlllIlIIlIIIIl = new BlockPos(lllllllllllllIIIlIIlllIlIIlIIlII, lllllllllllllIIIlIIlllIlIIlIIIll, lllllllllllllIIIlIIlllIlIIlIIIlI);
        final BiomeGenBase lllllllllllllIIIlIIlllIlIIlIIIII = this.getBiomeGenForCoords(lllllllllllllIIIlIIlllIlIIlIIIIl);
        final float lllllllllllllIIIlIIlllIlIIIlllll = lllllllllllllIIIlIIlllIlIIlIIIII.getFloatTemperature(lllllllllllllIIIlIIlllIlIIlIIIIl);
        final int lllllllllllllIIIlIIlllIlIIIllllI = lllllllllllllIIIlIIlllIlIIlIIIII.getSkyColorByTemp(lllllllllllllIIIlIIlllIlIIIlllll);
        float lllllllllllllIIIlIIlllIlIIIlllIl = (lllllllllllllIIIlIIlllIlIIIllllI >> World.lIlIlIIlIlIllI[21] & World.lIlIlIIlIlIllI[17]) / 255.0f;
        float lllllllllllllIIIlIIlllIlIIIlllII = (lllllllllllllIIIlIIlllIlIIIllllI >> World.lIlIlIIlIlIllI[7] & World.lIlIlIIlIlIllI[17]) / 255.0f;
        float lllllllllllllIIIlIIlllIlIIIllIll = (lllllllllllllIIIlIIlllIlIIIllllI & World.lIlIlIIlIlIllI[17]) / 255.0f;
        lllllllllllllIIIlIIlllIlIIIlllIl *= lllllllllllllIIIlIIlllIlIIlIIlIl;
        lllllllllllllIIIlIIlllIlIIIlllII *= lllllllllllllIIIlIIlllIlIIlIIlIl;
        lllllllllllllIIIlIIlllIlIIIllIll *= lllllllllllllIIIlIIlllIlIIlIIlIl;
        final float lllllllllllllIIIlIIlllIlIIIllIlI = this.getRainStrength(lllllllllllllIIIlIIlllIlIIlIIlll);
        if (lllIllIIlIIllII(lllIllIIlIlIlII(lllllllllllllIIIlIIlllIlIIIllIlI, 0.0f))) {
            final float lllllllllllllIIIlIIlllIlIIIllIIl = (lllllllllllllIIIlIIlllIlIIIlllIl * 0.3f + lllllllllllllIIIlIIlllIlIIIlllII * 0.59f + lllllllllllllIIIlIIlllIlIIIllIll * 0.11f) * 0.6f;
            final float lllllllllllllIIIlIIlllIlIIIllIII = 1.0f - lllllllllllllIIIlIIlllIlIIIllIlI * 0.75f;
            lllllllllllllIIIlIIlllIlIIIlllIl = lllllllllllllIIIlIIlllIlIIIlllIl * lllllllllllllIIIlIIlllIlIIIllIII + lllllllllllllIIIlIIlllIlIIIllIIl * (1.0f - lllllllllllllIIIlIIlllIlIIIllIII);
            lllllllllllllIIIlIIlllIlIIIlllII = lllllllllllllIIIlIIlllIlIIIlllII * lllllllllllllIIIlIIlllIlIIIllIII + lllllllllllllIIIlIIlllIlIIIllIIl * (1.0f - lllllllllllllIIIlIIlllIlIIIllIII);
            lllllllllllllIIIlIIlllIlIIIllIll = lllllllllllllIIIlIIlllIlIIIllIll * lllllllllllllIIIlIIlllIlIIIllIII + lllllllllllllIIIlIIlllIlIIIllIIl * (1.0f - lllllllllllllIIIlIIlllIlIIIllIII);
        }
        final float lllllllllllllIIIlIIlllIlIIIlIlll = this.getThunderStrength(lllllllllllllIIIlIIlllIlIIlIIlll);
        if (lllIllIIlIIllII(lllIllIIlIlIlII(lllllllllllllIIIlIIlllIlIIIlIlll, 0.0f))) {
            final float lllllllllllllIIIlIIlllIlIIIlIllI = (lllllllllllllIIIlIIlllIlIIIlllIl * 0.3f + lllllllllllllIIIlIIlllIlIIIlllII * 0.59f + lllllllllllllIIIlIIlllIlIIIllIll * 0.11f) * 0.2f;
            final float lllllllllllllIIIlIIlllIlIIIlIlIl = 1.0f - lllllllllllllIIIlIIlllIlIIIlIlll * 0.75f;
            lllllllllllllIIIlIIlllIlIIIlllIl = lllllllllllllIIIlIIlllIlIIIlllIl * lllllllllllllIIIlIIlllIlIIIlIlIl + lllllllllllllIIIlIIlllIlIIIlIllI * (1.0f - lllllllllllllIIIlIIlllIlIIIlIlIl);
            lllllllllllllIIIlIIlllIlIIIlllII = lllllllllllllIIIlIIlllIlIIIlllII * lllllllllllllIIIlIIlllIlIIIlIlIl + lllllllllllllIIIlIIlllIlIIIlIllI * (1.0f - lllllllllllllIIIlIIlllIlIIIlIlIl);
            lllllllllllllIIIlIIlllIlIIIllIll = lllllllllllllIIIlIIlllIlIIIllIll * lllllllllllllIIIlIIlllIlIIIlIlIl + lllllllllllllIIIlIIlllIlIIIlIllI * (1.0f - lllllllllllllIIIlIIlllIlIIIlIlIl);
        }
        if (lllIllIIlIIllII(this.lastLightningBolt)) {
            float lllllllllllllIIIlIIlllIlIIIlIlII = this.lastLightningBolt - lllllllllllllIIIlIIlllIlIIlIIlll;
            if (lllIllIIlIIllII(lllIllIIlIlIlII(lllllllllllllIIIlIIlllIlIIIlIlII, 1.0f))) {
                lllllllllllllIIIlIIlllIlIIIlIlII = 1.0f;
            }
            lllllllllllllIIIlIIlllIlIIIlIlII *= 0.45f;
            lllllllllllllIIIlIIlllIlIIIlllIl = lllllllllllllIIIlIIlllIlIIIlllIl * (1.0f - lllllllllllllIIIlIIlllIlIIIlIlII) + 0.8f * lllllllllllllIIIlIIlllIlIIIlIlII;
            lllllllllllllIIIlIIlllIlIIIlllII = lllllllllllllIIIlIIlllIlIIIlllII * (1.0f - lllllllllllllIIIlIIlllIlIIIlIlII) + 0.8f * lllllllllllllIIIlIIlllIlIIIlIlII;
            lllllllllllllIIIlIIlllIlIIIllIll = lllllllllllllIIIlIIlllIlIIIllIll * (1.0f - lllllllllllllIIIlIIlllIlIIIlIlII) + 1.0f * lllllllllllllIIIlIIlllIlIIIlIlII;
        }
        return new Vec3(lllllllllllllIIIlIIlllIlIIIlllIl, lllllllllllllIIIlIIlllIlIIIlllII, lllllllllllllIIIlIIlllIlIIIllIll);
    }
    
    public Scoreboard getScoreboard() {
        return this.worldScoreboard;
    }
    
    public void playSoundEffect(final double lllllllllllllIIIlIIllllIlIIIlllI, final double lllllllllllllIIIlIIllllIlIIIllIl, final double lllllllllllllIIIlIIllllIlIIlIlII, final String lllllllllllllIIIlIIllllIlIIlIIll, final float lllllllllllllIIIlIIllllIlIIlIIlI, final float lllllllllllllIIIlIIllllIlIIIlIIl) {
        int lllllllllllllIIIlIIllllIlIIlIIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllllIlIIlIIII, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIllllIlIIlIIII).playSound(lllllllllllllIIIlIIllllIlIIlIIll, lllllllllllllIIIlIIllllIlIIIlllI, lllllllllllllIIIlIIllllIlIIIllIl, lllllllllllllIIIlIIllllIlIIlIlII, lllllllllllllIIIlIIllllIlIIlIIlI, lllllllllllllIIIlIIllllIlIIIlIIl);
            ++lllllllllllllIIIlIIllllIlIIlIIII;
        }
    }
    
    public int getHeight() {
        return World.lIlIlIIlIlIllI[11];
    }
    
    public boolean canBlockBePlaced(final Block lllllllllllllIIIlIIlIlllIlIllIIl, final BlockPos lllllllllllllIIIlIIlIlllIllIIIIl, final boolean lllllllllllllIIIlIIlIlllIlIlIlll, final EnumFacing lllllllllllllIIIlIIlIlllIlIlIllI, final Entity lllllllllllllIIIlIIlIlllIlIllllI, final ItemStack lllllllllllllIIIlIIlIlllIlIlIlII) {
        final Block lllllllllllllIIIlIIlIlllIlIlllII = this.getBlockState(lllllllllllllIIIlIIlIlllIllIIIIl).getBlock();
        AxisAlignedBB collisionBoundingBox;
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIlllIlIlIlll ? 1 : 0)) {
            collisionBoundingBox = null;
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0x5 ^ 0x1F) & ~(0xA1 ^ 0xBB)) != 0x0;
            }
        }
        else {
            collisionBoundingBox = lllllllllllllIIIlIIlIlllIlIllIIl.getCollisionBoundingBox(this, lllllllllllllIIIlIIlIlllIllIIIIl, lllllllllllllIIIlIIlIlllIlIllIIl.getDefaultState());
        }
        final AxisAlignedBB lllllllllllllIIIlIIlIlllIlIllIll = collisionBoundingBox;
        int n;
        if (lllIllIIlIlIIIl(lllllllllllllIIIlIIlIlllIlIllIll) && lllIllIIlIIIllI(this.checkNoEntityCollision(lllllllllllllIIIlIIlIlllIlIllIll, lllllllllllllIIIlIIlIlllIlIllllI) ? 1 : 0)) {
            n = World.lIlIlIIlIlIllI[5];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x3 ^ 0x25) & ~(0x2 ^ 0x24)) != 0x0;
            }
        }
        else if (lllIllIIlIIIlIl(lllllllllllllIIIlIIlIlllIlIlllII.getMaterial(), Material.circuits) && lllIllIIlIIIlIl(lllllllllllllIIIlIIlIlllIlIllIIl, Blocks.anvil)) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if (-(0x29 ^ 0x2 ^ (0x3E ^ 0x11)) >= 0) {
                return ((0xF8 ^ 0xA1 ^ (0x3F ^ 0x74)) & (0xB2 ^ 0xA1 ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIlllIlIlllII.getMaterial().isReplaceable() ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlIlllIlIllIIl.canReplace(this, lllllllllllllIIIlIIlIlllIllIIIIl, lllllllllllllIIIlIIlIlllIlIlIllI, lllllllllllllIIIlIIlIlllIlIlIlII) ? 1 : 0)) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if (((0xB4 ^ 0x94 ^ (0x39 ^ 0xB)) & (103 + 8 - 7 + 25 ^ 28 + 9 + 44 + 66 ^ -" ".length())) != ((144 + 126 - 153 + 29 ^ 63 + 147 - 120 + 66) & (0xED ^ 0xA5 ^ (0x84 ^ 0xC2) ^ -" ".length()) & (((0x29 ^ 0x32 ^ (0x2F ^ 0x19)) & (46 + 124 - 59 + 20 ^ 105 + 93 - 194 + 170 ^ -" ".length())) ^ -" ".length()))) {
                return ((0x73 ^ 0x3D ^ (0xD9 ^ 0xC7)) & (0x4D ^ 0x53 ^ (0xDD ^ 0x93) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = World.lIlIlIIlIlIllI[5];
        }
        return n != 0;
    }
    
    public boolean isAreaLoaded(final BlockPos lllllllllllllIIIlIlIIIIIlllIlIIl, final BlockPos lllllllllllllIIIlIlIIIIIlllIlIII) {
        return this.isAreaLoaded(lllllllllllllIIIlIlIIIIIlllIlIIl, lllllllllllllIIIlIlIIIIIlllIlIII, (boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    public boolean isBlockModifiable(final EntityPlayer lllllllllllllIIIlIIlIllIIlIIlllI, final BlockPos lllllllllllllIIIlIIlIllIIlIIllIl) {
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public boolean isBlockFullCube(final BlockPos lllllllllllllIIIlIIllIIlllllllll) {
        final IBlockState lllllllllllllIIIlIIllIIllllllllI = this.getBlockState(lllllllllllllIIIlIIllIIlllllllll);
        final AxisAlignedBB lllllllllllllIIIlIIllIIlllllllIl = lllllllllllllIIIlIIllIIllllllllI.getBlock().getCollisionBoundingBox(this, lllllllllllllIIIlIIllIIlllllllll, lllllllllllllIIIlIIllIIllllllllI);
        if (lllIllIIlIlIIIl(lllllllllllllIIIlIIllIIlllllllIl) && lllIllIIlIIIlII(lllIllIIlIllllI(lllllllllllllIIIlIIllIIlllllllIl.getAverageEdgeLength(), 1.0))) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public void notifyBlockOfStateChange(final BlockPos lllllllllllllIIIlIIllllllllllIlI, final Block lllllllllllllIIIlIIlllllllllIIlI) {
        if (lllIllIIlIIIllI(this.isRemote ? 1 : 0)) {
            final IBlockState lllllllllllllIIIlIIllllllllllIII = this.getBlockState(lllllllllllllIIIlIIllllllllllIlI);
            try {
                lllllllllllllIIIlIIllllllllllIII.getBlock().onNeighborBlockChange(this, lllllllllllllIIIlIIllllllllllIlI, lllllllllllllIIIlIIllllllllllIII, lllllllllllllIIIlIIlllllllllIIlI);
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIlIIlllllllllIlll) {
                final CrashReport lllllllllllllIIIlIIlllllllllIllI = CrashReport.makeCrashReport(lllllllllllllIIIlIIlllllllllIlll, World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[12]]);
                final CrashReportCategory lllllllllllllIIIlIIlllllllllIlIl = lllllllllllllIIIlIIlllllllllIllI.makeCategory(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[15]]);
                lllllllllllllIIIlIIlllllllllIlIl.addCrashSectionCallable(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[16]], new Callable<String>() {
                    private static final /* synthetic */ int[] llIIIllIlIlllI;
                    private static final /* synthetic */ String[] llIIIllIlIlIlI;
                    
                    private static String lIIIlIlIIlllIlll(final String llllllllllllIlllIlIIlIIlIIllllll, final String llllllllllllIlllIlIIlIIlIIllllII) {
                        try {
                            final SecretKeySpec llllllllllllIlllIlIIlIIlIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlIIlIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                            final Cipher llllllllllllIlllIlIIlIIlIlIIIIIl = Cipher.getInstance("Blowfish");
                            llllllllllllIlllIlIIlIIlIlIIIIIl.init(World$2.llIIIllIlIlllI[3], llllllllllllIlllIlIIlIIlIlIIIIlI);
                            return new String(llllllllllllIlllIlIIlIIlIlIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception llllllllllllIlllIlIIlIIlIlIIIIII) {
                            llllllllllllIlllIlIIlIIlIlIIIIII.printStackTrace();
                            return null;
                        }
                    }
                    
                    private static void lIIIlIlIIlllllII() {
                        (llIIIllIlIlllI = new int[4])[0] = ((87 + 116 - 119 + 48 ^ 112 + 119 - 178 + 93) & (155 + 47 - 81 + 43 ^ 167 + 91 - 193 + 113 ^ -" ".length()));
                        World$2.llIIIllIlIlllI[1] = "   ".length();
                        World$2.llIIIllIlIlllI[2] = " ".length();
                        World$2.llIIIllIlIlllI[3] = "  ".length();
                    }
                    
                    @Override
                    public String call() throws Exception {
                        try {
                            final String format = World$2.llIIIllIlIlIlI[World$2.llIIIllIlIlllI[0]];
                            final Object[] args = new Object[World$2.llIIIllIlIlllI[1]];
                            args[World$2.llIIIllIlIlllI[0]] = Block.getIdFromBlock(lllllllllllllIIIlIIlllllllllIIlI);
                            args[World$2.llIIIllIlIlllI[2]] = lllllllllllllIIIlIIlllllllllIIlI.getUnlocalizedName();
                            args[World$2.llIIIllIlIlllI[3]] = lllllllllllllIIIlIIlllllllllIIlI.getClass().getCanonicalName();
                            return String.format(format, args);
                        }
                        catch (Throwable llllllllllllIlllIlIIlIIlIlIIlIll) {
                            return String.valueOf(new StringBuilder(World$2.llIIIllIlIlIlI[World$2.llIIIllIlIlllI[2]]).append(Block.getIdFromBlock(lllllllllllllIIIlIIlllllllllIIlI)));
                        }
                    }
                    
                    static {
                        lIIIlIlIIlllllII();
                        lIIIlIlIIllllIII();
                    }
                    
                    private static String lIIIlIlIIlllIllI(String llllllllllllIlllIlIIlIIlIIlIlIlI, final String llllllllllllIlllIlIIlIIlIIlIlllI) {
                        llllllllllllIlllIlIIlIIlIIlIlIlI = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                        final StringBuilder llllllllllllIlllIlIIlIIlIIlIllIl = new StringBuilder();
                        final char[] llllllllllllIlllIlIIlIIlIIlIllII = llllllllllllIlllIlIIlIIlIIlIlllI.toCharArray();
                        int llllllllllllIlllIlIIlIIlIIlIlIll = World$2.llIIIllIlIlllI[0];
                        final double llllllllllllIlllIlIIlIIlIIlIIlIl = (Object)llllllllllllIlllIlIIlIIlIIlIlIlI.toCharArray();
                        final char llllllllllllIlllIlIIlIIlIIlIIlII = (char)llllllllllllIlllIlIIlIIlIIlIIlIl.length;
                        long llllllllllllIlllIlIIlIIlIIlIIIll = World$2.llIIIllIlIlllI[0];
                        while (lIIIlIlIIlllllIl((int)llllllllllllIlllIlIIlIIlIIlIIIll, llllllllllllIlllIlIIlIIlIIlIIlII)) {
                            final char llllllllllllIlllIlIIlIIlIIllIIII = llllllllllllIlllIlIIlIIlIIlIIlIl[llllllllllllIlllIlIIlIIlIIlIIIll];
                            llllllllllllIlllIlIIlIIlIIlIllIl.append((char)(llllllllllllIlllIlIIlIIlIIllIIII ^ llllllllllllIlllIlIIlIIlIIlIllII[llllllllllllIlllIlIIlIIlIIlIlIll % llllllllllllIlllIlIIlIIlIIlIllII.length]));
                            "".length();
                            ++llllllllllllIlllIlIIlIIlIIlIlIll;
                            ++llllllllllllIlllIlIIlIIlIIlIIIll;
                            "".length();
                            if ("   ".length() == 0) {
                                return null;
                            }
                        }
                        return String.valueOf(llllllllllllIlllIlIIlIIlIIlIllIl);
                    }
                    
                    private static void lIIIlIlIIllllIII() {
                        (llIIIllIlIlIlI = new String[World$2.llIIIllIlIlllI[3]])[World$2.llIIIllIlIlllI[0]] = lIIIlIlIIlllIllI("My1qSG0eSWJOO1pGZUttCUA=", "ziJkH");
                        World$2.llIIIllIlIlIlI[World$2.llIIIllIlIlllI[2]] = lIIIlIlIIlllIlll("tPoPr77DkHg=", "ZNymE");
                    }
                    
                    private static boolean lIIIlIlIIlllllIl(final int llllllllllllIlllIlIIlIIlIIIlllll, final int llllllllllllIlllIlIIlIIlIIIllllI) {
                        return llllllllllllIlllIlIIlIIlIIIlllll < llllllllllllIlllIlIIlIIlIIIllllI;
                    }
                });
                CrashReportCategory.addBlockInfo(lllllllllllllIIIlIIlllllllllIlIl, lllllllllllllIIIlIIllllllllllIlI, lllllllllllllIIIlIIllllllllllIII);
                throw new ReportedException(lllllllllllllIIIlIIlllllllllIllI);
            }
        }
    }
    
    public int getActualHeight() {
        int n;
        if (lllIllIIlIIIIIl(this.provider.getHasNoSky() ? 1 : 0)) {
            n = World.lIlIlIIlIlIllI[54];
            "".length();
            if (" ".length() > " ".length()) {
                return (0xA0 ^ 0x8F) & ~(0x56 ^ 0x79);
            }
        }
        else {
            n = World.lIlIlIIlIlIllI[11];
        }
        return n;
    }
    
    public boolean spawnEntityInWorld(final Entity lllllllllllllIIIlIIllllIIIIIllII) {
        final int lllllllllllllIIIlIIllllIIIIIlIll = MathHelper.floor_double(lllllllllllllIIIlIIllllIIIIIllII.posX / 16.0);
        final int lllllllllllllIIIlIIllllIIIIIlIlI = MathHelper.floor_double(lllllllllllllIIIlIIllllIIIIIllII.posZ / 16.0);
        boolean lllllllllllllIIIlIIllllIIIIIlIIl = lllllllllllllIIIlIIllllIIIIIllII.forceSpawn;
        if (lllIllIIlIIIIIl((lllllllllllllIIIlIIllllIIIIIllII instanceof EntityPlayer) ? 1 : 0)) {
            lllllllllllllIIIlIIllllIIIIIlIIl = (World.lIlIlIIlIlIllI[3] != 0);
        }
        if (lllIllIIlIIIllI(lllllllllllllIIIlIIllllIIIIIlIIl ? 1 : 0) && lllIllIIlIIIllI(this.isChunkLoaded(lllllllllllllIIIlIIllllIIIIIlIll, lllllllllllllIIIlIIllllIIIIIlIlI, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        if (lllIllIIlIIIIIl((lllllllllllllIIIlIIllllIIIIIllII instanceof EntityPlayer) ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIIlIIllllIIIIIlIII = (EntityPlayer)lllllllllllllIIIlIIllllIIIIIllII;
            this.playerEntities.add(lllllllllllllIIIlIIllllIIIIIlIII);
            "".length();
            this.updateAllPlayersSleepingFlag();
        }
        this.getChunkFromChunkCoords(lllllllllllllIIIlIIllllIIIIIlIll, lllllllllllllIIIlIIllllIIIIIlIlI).addEntity(lllllllllllllIIIlIIllllIIIIIllII);
        this.loadedEntityList.add(lllllllllllllIIIlIIllllIIIIIllII);
        "".length();
        this.onEntityAdded(lllllllllllllIIIlIIllllIIIIIllII);
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public boolean checkNoEntityCollision(final AxisAlignedBB lllllllllllllIIIlIIllIllllllIIll) {
        return this.checkNoEntityCollision(lllllllllllllIIIlIIllIllllllIIll, null);
    }
    
    public int countEntities(final Class<?> lllllllllllllIIIlIIlIllllIIIIlIl) {
        int lllllllllllllIIIlIIlIllllIIIIlII = World.lIlIlIIlIlIllI[5];
        final Exception lllllllllllllIIIlIIlIlllIllllllI = (Exception)this.loadedEntityList.iterator();
        "".length();
        if ("   ".length() == 0) {
            return (0xAB ^ 0xAF) & ~(0x3C ^ 0x38);
        }
        while (!lllIllIIlIIIllI(((Iterator)lllllllllllllIIIlIIlIlllIllllllI).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIIlIIlIllllIIIIIll = ((Iterator<Entity>)lllllllllllllIIIlIIlIlllIllllllI).next();
            if ((!lllIllIIlIIIIIl((lllllllllllllIIIlIIlIllllIIIIIll instanceof EntityLiving) ? 1 : 0) || lllIllIIlIIIllI(((EntityLiving)lllllllllllllIIIlIIlIllllIIIIIll).isNoDespawnRequired() ? 1 : 0)) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllllIIIIlIl.isAssignableFrom(lllllllllllllIIIlIIlIllllIIIIIll.getClass()) ? 1 : 0)) {
                ++lllllllllllllIIIlIIlIllllIIIIlII;
            }
        }
        return lllllllllllllIIIlIIlIllllIIIIlII;
    }
    
    public void setWorldTime(final long lllllllllllllIIIlIIlIllIIlllIIll) {
        this.worldInfo.setWorldTime(lllllllllllllIIIlIIlIllIIlllIIll);
    }
    
    public int getSkylightSubtracted() {
        return this.skylightSubtracted;
    }
    
    public long getWorldTime() {
        return this.worldInfo.getWorldTime();
    }
    
    public void updateComparatorOutputLevel(final BlockPos lllllllllllllIIIlIIlIlIlIlIlIlII, final Block lllllllllllllIIIlIIlIlIlIlIlIIll) {
        final byte lllllllllllllIIIlIIlIlIlIlIlIIIl = (byte)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ("  ".length() >= "   ".length()) {
            return;
        }
        while (!lllIllIIlIIIllI(((Iterator)lllllllllllllIIIlIIlIlIlIlIlIIIl).hasNext() ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIlIIlIlIlIlIllIII = ((Iterator<EnumFacing>)lllllllllllllIIIlIIlIlIlIlIlIIIl).next();
            BlockPos lllllllllllllIIIlIIlIlIlIlIlIlll = lllllllllllllIIIlIIlIlIlIlIlIlII.offset(lllllllllllllIIIlIIlIlIlIlIllIII);
            if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlIlIlIlIlIlll) ? 1 : 0)) {
                IBlockState lllllllllllllIIIlIIlIlIlIlIlIllI = this.getBlockState(lllllllllllllIIIlIIlIlIlIlIlIlll);
                if (lllIllIIlIIIIIl(Blocks.unpowered_comparator.isAssociated(lllllllllllllIIIlIIlIlIlIlIlIllI.getBlock()) ? 1 : 0)) {
                    lllllllllllllIIIlIIlIlIlIlIlIllI.getBlock().onNeighborBlockChange(this, lllllllllllllIIIlIIlIlIlIlIlIlll, lllllllllllllIIIlIIlIlIlIlIlIllI, lllllllllllllIIIlIIlIlIlIlIlIIll);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    if (!lllIllIIlIIIIIl(lllllllllllllIIIlIIlIlIlIlIlIllI.getBlock().isNormalCube() ? 1 : 0)) {
                        continue;
                    }
                    lllllllllllllIIIlIIlIlIlIlIlIlll = lllllllllllllIIIlIIlIlIlIlIlIlll.offset(lllllllllllllIIIlIIlIlIlIlIllIII);
                    lllllllllllllIIIlIIlIlIlIlIlIllI = this.getBlockState(lllllllllllllIIIlIIlIlIlIlIlIlll);
                    if (!lllIllIIlIIIIIl(Blocks.unpowered_comparator.isAssociated(lllllllllllllIIIlIIlIlIlIlIlIllI.getBlock()) ? 1 : 0)) {
                        continue;
                    }
                    lllllllllllllIIIlIIlIlIlIlIlIllI.getBlock().onNeighborBlockChange(this, lllllllllllllIIIlIIlIlIlIlIlIlll, lllllllllllllIIIlIIlIlIlIlIlIllI, lllllllllllllIIIlIIlIlIlIlIlIIll);
                }
            }
        }
    }
    
    public Vec3 getCloudColour(final float lllllllllllllIIIlIIlllIIllIlIIlI) {
        final float lllllllllllllIIIlIIlllIIllIllllI = this.getCelestialAngle(lllllllllllllIIIlIIlllIIllIlIIlI);
        float lllllllllllllIIIlIIlllIIllIlllIl = MathHelper.cos(lllllllllllllIIIlIIlllIIllIllllI * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        lllllllllllllIIIlIIlllIIllIlllIl = MathHelper.clamp_float(lllllllllllllIIIlIIlllIIllIlllIl, 0.0f, 1.0f);
        float lllllllllllllIIIlIIlllIIllIlllII = (this.cloudColour >> World.lIlIlIIlIlIllI[21] & 0xFFL) / 255.0f;
        float lllllllllllllIIIlIIlllIIllIllIll = (this.cloudColour >> World.lIlIlIIlIlIllI[7] & 0xFFL) / 255.0f;
        float lllllllllllllIIIlIIlllIIllIllIlI = (this.cloudColour & 0xFFL) / 255.0f;
        final float lllllllllllllIIIlIIlllIIllIllIIl = this.getRainStrength(lllllllllllllIIIlIIlllIIllIlIIlI);
        if (lllIllIIlIIllII(lllIllIIlIlIlIl(lllllllllllllIIIlIIlllIIllIllIIl, 0.0f))) {
            final float lllllllllllllIIIlIIlllIIllIllIII = (lllllllllllllIIIlIIlllIIllIlllII * 0.3f + lllllllllllllIIIlIIlllIIllIllIll * 0.59f + lllllllllllllIIIlIIlllIIllIllIlI * 0.11f) * 0.6f;
            final float lllllllllllllIIIlIIlllIIllIlIlll = 1.0f - lllllllllllllIIIlIIlllIIllIllIIl * 0.95f;
            lllllllllllllIIIlIIlllIIllIlllII = lllllllllllllIIIlIIlllIIllIlllII * lllllllllllllIIIlIIlllIIllIlIlll + lllllllllllllIIIlIIlllIIllIllIII * (1.0f - lllllllllllllIIIlIIlllIIllIlIlll);
            lllllllllllllIIIlIIlllIIllIllIll = lllllllllllllIIIlIIlllIIllIllIll * lllllllllllllIIIlIIlllIIllIlIlll + lllllllllllllIIIlIIlllIIllIllIII * (1.0f - lllllllllllllIIIlIIlllIIllIlIlll);
            lllllllllllllIIIlIIlllIIllIllIlI = lllllllllllllIIIlIIlllIIllIllIlI * lllllllllllllIIIlIIlllIIllIlIlll + lllllllllllllIIIlIIlllIIllIllIII * (1.0f - lllllllllllllIIIlIIlllIIllIlIlll);
        }
        lllllllllllllIIIlIIlllIIllIlllII *= lllllllllllllIIIlIIlllIIllIlllIl * 0.9f + 0.1f;
        lllllllllllllIIIlIIlllIIllIllIll *= lllllllllllllIIIlIIlllIIllIlllIl * 0.9f + 0.1f;
        lllllllllllllIIIlIIlllIIllIllIlI *= lllllllllllllIIIlIIlllIIllIlllIl * 0.85f + 0.15f;
        final float lllllllllllllIIIlIIlllIIllIlIllI = this.getThunderStrength(lllllllllllllIIIlIIlllIIllIlIIlI);
        if (lllIllIIlIIllII(lllIllIIlIlIlIl(lllllllllllllIIIlIIlllIIllIlIllI, 0.0f))) {
            final float lllllllllllllIIIlIIlllIIllIlIlIl = (lllllllllllllIIIlIIlllIIllIlllII * 0.3f + lllllllllllllIIIlIIlllIIllIllIll * 0.59f + lllllllllllllIIIlIIlllIIllIllIlI * 0.11f) * 0.2f;
            final float lllllllllllllIIIlIIlllIIllIlIlII = 1.0f - lllllllllllllIIIlIIlllIIllIlIllI * 0.95f;
            lllllllllllllIIIlIIlllIIllIlllII = lllllllllllllIIIlIIlllIIllIlllII * lllllllllllllIIIlIIlllIIllIlIlII + lllllllllllllIIIlIIlllIIllIlIlIl * (1.0f - lllllllllllllIIIlIIlllIIllIlIlII);
            lllllllllllllIIIlIIlllIIllIllIll = lllllllllllllIIIlIIlllIIllIllIll * lllllllllllllIIIlIIlllIIllIlIlII + lllllllllllllIIIlIIlllIIllIlIlIl * (1.0f - lllllllllllllIIIlIIlllIIllIlIlII);
            lllllllllllllIIIlIIlllIIllIllIlI = lllllllllllllIIIlIIlllIIllIllIlI * lllllllllllllIIIlIIlllIIllIlIlII + lllllllllllllIIIlIIlllIIllIlIlIl * (1.0f - lllllllllllllIIIlIIlllIIllIlIlII);
        }
        return new Vec3(lllllllllllllIIIlIIlllIIllIlllII, lllllllllllllIIIlIIlllIIllIllIll, lllllllllllllIIIlIIlllIIllIllIlI);
    }
    
    public static boolean doesBlockHaveSolidTopSurface(final IBlockAccess lllllllllllllIIIlIIllIIlllllIlII, final BlockPos lllllllllllllIIIlIIllIIllllIllll) {
        final IBlockState lllllllllllllIIIlIIllIIlllllIIlI = lllllllllllllIIIlIIllIIlllllIlII.getBlockState(lllllllllllllIIIlIIllIIllllIllll);
        final Block lllllllllllllIIIlIIllIIlllllIIIl = lllllllllllllIIIlIIllIIlllllIIlI.getBlock();
        int n;
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllIIlllllIIIl.getMaterial().isOpaque() ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIllIIlllllIIIl.isFullCube() ? 1 : 0)) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if ((0x53 ^ 0x36 ^ (0x47 ^ 0x26)) < "  ".length()) {
                return ((89 + 14 - 17 + 135 ^ 3 + 114 - 58 + 87) & (0x2E ^ 0x5F ^ (0x43 ^ 0x7D) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIIlIIIIIl((lllllllllllllIIIlIIllIIlllllIIIl instanceof BlockStairs) ? 1 : 0)) {
            if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIIlllllIIlI.getValue(BlockStairs.HALF), BlockStairs.EnumHalf.TOP)) {
                n = World.lIlIlIIlIlIllI[3];
                "".length();
                if (-" ".length() > "  ".length()) {
                    return ((0x89 ^ 0xAB) & ~(0x2B ^ 0x9)) != 0x0;
                }
            }
            else {
                n = World.lIlIlIIlIlIllI[5];
                "".length();
                if (" ".length() < ((0x6B ^ 0x4A) & ~(0x48 ^ 0x69))) {
                    return ((0x48 ^ 0x63) & ~(0x4A ^ 0x61)) != 0x0;
                }
            }
        }
        else if (lllIllIIlIIIIIl((lllllllllllllIIIlIIllIIlllllIIIl instanceof BlockSlab) ? 1 : 0)) {
            if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIIlllllIIlI.getValue(BlockSlab.HALF), BlockSlab.EnumBlockHalf.TOP)) {
                n = World.lIlIlIIlIlIllI[3];
                "".length();
                if (-" ".length() > 0) {
                    return ((100 + 165 - 98 + 78 ^ 89 + 184 - 127 + 42) & (0x55 ^ 0x58 ^ (0x70 ^ 0x34) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = World.lIlIlIIlIlIllI[5];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x3D ^ 0x29 ^ (0xBD ^ 0xB1)) & (0x7E ^ 0x2B ^ (0xFC ^ 0xB1) ^ -" ".length())) != 0x0;
                }
            }
        }
        else if (lllIllIIlIIIIIl((lllllllllllllIIIlIIllIIlllllIIIl instanceof BlockHopper) ? 1 : 0)) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if ("   ".length() < 0) {
                return ((67 + 29 - 8 + 58 ^ 81 + 55 - 8 + 0) & (0x5E ^ 0x4F ^ "   ".length() ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIIlIIIIIl((lllllllllllllIIIlIIllIIlllllIIIl instanceof BlockSnow) ? 1 : 0)) {
            if (lllIllIIlIIlIIl(lllllllllllllIIIlIIllIIlllllIIlI.getValue((IProperty<Integer>)BlockSnow.LAYERS), World.lIlIlIIlIlIllI[22])) {
                n = World.lIlIlIIlIlIllI[3];
                "".length();
                if ((135 + 157 - 206 + 81 ^ 27 + 137 - 53 + 52) == ((0x7E ^ 0x35 ^ (0x2A ^ 0x2E)) & (154 + 141 - 94 + 9 ^ 110 + 139 - 157 + 65 ^ -" ".length()))) {
                    return ((135 + 24 - 28 + 34 ^ 101 + 81 - 83 + 38) & (0x5E ^ 0x24 ^ (0x53 ^ 0x5) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = World.lIlIlIIlIlIllI[5];
                "".length();
                if (("   ".length() & ~"   ".length()) > 0) {
                    return ((0x64 ^ 0x6F) & ~(0x21 ^ 0x2A)) != 0x0;
                }
            }
        }
        else {
            n = World.lIlIlIIlIlIllI[5];
        }
        return n != 0;
    }
    
    static {
        lllIllIIlIIIIII();
        lllIlIlllllllII();
    }
    
    @Override
    public WorldType getWorldType() {
        return this.worldInfo.getTerrainType();
    }
    
    public CrashReportCategory addWorldInfoToCrashReport(final CrashReport lllllllllllllIIIlIIlIlIllIIIlIIl) {
        final CrashReportCategory categoryDepth;
        final CrashReportCategory lllllllllllllIIIlIIlIlIllIIIlIII = categoryDepth = lllllllllllllIIIlIIlIlIllIIIlIIl.makeCategoryDepth(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[55]], World.lIlIlIIlIlIllI[3]);
        final String lllllllllllllIlIllIlIIIIIIlIIlll = World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[56]];
        String worldName;
        if (lllIllIIlIIlIII(this.worldInfo)) {
            worldName = World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[57]];
            "".length();
            if ("  ".length() == (0x5C ^ 0x58)) {
                return null;
            }
        }
        else {
            worldName = this.worldInfo.getWorldName();
        }
        categoryDepth.addCrashSection(lllllllllllllIlIllIlIIIIIIlIIlll, worldName);
        lllllllllllllIIIlIIlIlIllIIIlIII.addCrashSectionCallable(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[58]], new Callable<String>() {
            private static final /* synthetic */ String[] llIIlIllllIllI;
            private static final /* synthetic */ int[] llIIlIllllIlll;
            
            @Override
            public String call() {
                return String.valueOf(new StringBuilder(String.valueOf(World.this.playerEntities.size())).append(World$3.llIIlIllllIllI[World$3.llIIlIllllIlll[0]]).append(World.this.playerEntities.toString()));
            }
            
            private static void lIIIlllIIIIllIlI() {
                (llIIlIllllIlll = new int[2])[0] = ((0xA8 ^ 0x9D ^ (0x4A ^ 0x28)) & (0x19 ^ 0x6F ^ (0x20 ^ 0x1) ^ -" ".length()));
                World$3.llIIlIllllIlll[1] = " ".length();
            }
            
            private static void lIIIlllIIIIllIIl() {
                (llIIlIllllIllI = new String[World$3.llIIlIllllIlll[1]])[World$3.llIIlIllllIlll[0]] = lIIIlllIIIIllIII("TT8DFQ0BcEw=", "mKlal");
            }
            
            private static String lIIIlllIIIIllIII(String llllllllllllIlllIIIIlllIIllIllll, final String llllllllllllIlllIIIIlllIIlllIIll) {
                llllllllllllIlllIIIIlllIIllIllll = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIIlllIIllIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllIIIIlllIIlllIIlI = new StringBuilder();
                final char[] llllllllllllIlllIIIIlllIIlllIIIl = llllllllllllIlllIIIIlllIIlllIIll.toCharArray();
                int llllllllllllIlllIIIIlllIIlllIIII = World$3.llIIlIllllIlll[0];
                final boolean llllllllllllIlllIIIIlllIIllIlIlI = (Object)((String)llllllllllllIlllIIIIlllIIllIllll).toCharArray();
                final short llllllllllllIlllIIIIlllIIllIlIIl = (short)llllllllllllIlllIIIIlllIIllIlIlI.length;
                int llllllllllllIlllIIIIlllIIllIlIII = World$3.llIIlIllllIlll[0];
                while (lIIIlllIIIIllIll(llllllllllllIlllIIIIlllIIllIlIII, llllllllllllIlllIIIIlllIIllIlIIl)) {
                    final char llllllllllllIlllIIIIlllIIlllIlIl = llllllllllllIlllIIIIlllIIllIlIlI[llllllllllllIlllIIIIlllIIllIlIII];
                    llllllllllllIlllIIIIlllIIlllIIlI.append((char)(llllllllllllIlllIIIIlllIIlllIlIl ^ llllllllllllIlllIIIIlllIIlllIIIl[llllllllllllIlllIIIIlllIIlllIIII % llllllllllllIlllIIIIlllIIlllIIIl.length]));
                    "".length();
                    ++llllllllllllIlllIIIIlllIIlllIIII;
                    ++llllllllllllIlllIIIIlllIIllIlIII;
                    "".length();
                    if ((86 + 135 - 212 + 161 ^ 11 + 88 - 79 + 154) == 0x0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllIIIIlllIIlllIIlI);
            }
            
            static {
                lIIIlllIIIIllIlI();
                lIIIlllIIIIllIIl();
            }
            
            private static boolean lIIIlllIIIIllIll(final int llllllllllllIlllIIIIlllIIllIIlII, final int llllllllllllIlllIIIIlllIIllIIIll) {
                return llllllllllllIlllIIIIlllIIllIIlII < llllllllllllIlllIIIIlllIIllIIIll;
            }
        });
        lllllllllllllIIIlIIlIlIllIIIlIII.addCrashSectionCallable(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[59]], new Callable<String>() {
            @Override
            public String call() {
                return World.this.chunkProvider.makeString();
            }
        });
        try {
            this.worldInfo.addToCrashReport(lllllllllllllIIIlIIlIlIllIIIlIII);
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (Throwable lllllllllllllIIIlIIlIlIllIIIIlll) {
            lllllllllllllIIIlIIlIlIllIIIlIII.addCrashSectionThrowable(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[60]], lllllllllllllIIIlIIlIlIllIIIIlll);
        }
        return lllllllllllllIIIlIIlIlIllIIIlIII;
    }
    
    private static boolean lllIllIIlIIIllI(final int lllllllllllllIIIlIIlIlIIlIlllIlI) {
        return lllllllllllllIIIlIIlIlIIlIlllIlI == 0;
    }
    
    private static void lllIlIlllllllII() {
        (lIlIlIIIlllIll = new String[World.lIlIlIIlIlIllI[61]])[World.lIlIlIIlIlIllI[5]] = lllIlIlllllIIlI("DRECERgkE1YHGCUZEw==", "Jtveq");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[3]] = lllIlIlllllIIlI("OyAWHC8RIRgaLgtvFghrGiYWAy5YPRwfPh08DQ==", "xOynK");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[6]] = lllIlIlllllIIlI("OxwGCh0eHAs=", "wseki");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[13]] = lllIlIlllllIIlI("JSMSKwEKIhAgHg==", "FKwHj");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[12]] = lllIlIlllllIIll("ji42d0Hpo4YuLx7tHEZiaYup91ZG+cfNejFCHuinEz9lYxtvmmE/oA==", "PPOYM");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[15]] = lllIlIlllllIIlI("NQ04JTNXAzIvNhBBIjY8FhUyIg==", "waWFX");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[16]] = lllIlIlllllIlII("dH4917baZCqs8zNtKX3WoeTatGIm9+qV", "iDnnJ");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[22]] = lllIlIlllllIIll("rBLwhHKMQL5GEo3VisRnWw==", "FdnAl");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[7]] = lllIlIlllllIIll("ud0IbLT4wCA=", "emxGB");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[23]] = lllIlIlllllIIlI("GgEHPScgD0QzIDoBEC8=", "NhdVN");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[24]] = lllIlIlllllIlII("14TSLCKcGmpHNvAMja91vfeOBHYNEQl5", "ehxaD");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[25]] = lllIlIlllllIlII("+DrdrpDDPPs=", "eoyab");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[26]] = lllIlIlllllIlII("nLnW/LVFDOKa34+aJZVL5w==", "jDHEI");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[27]] = lllIlIlllllIlII("+B/pf2aGj08=", "tfQLA");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[28]] = lllIlIlllllIIlI("HSAlIQcONw==", "oEBTk");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[18]] = lllIlIlllllIIll("2aIXnOtzQiw=", "qMlKi");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[21]] = lllIlIlllllIIlI("JREuEhkfH20cHgUROQA=", "qxMyp");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[29]] = lllIlIlllllIIlI("DwAyLQ4zTiQhEyQJZjATKQUjIA==", "JnFDz");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[30]] = lllIlIlllllIIlI("Ahw/Gx4V", "pyRth");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[31]] = lllIlIlllllIlII("25lppPfRyWKJIZQSYWqDnA==", "ctHCw");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[19]] = lllIlIlllllIlII("DjQP/H7bSbRaMHel6ePBPg/MahhzTarw", "mvpBp");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[32]] = lllIlIlllllIlII("jyymkHZwUStGer4MaozRuP2YlR9dzbzJZl1kwwLcbSs=", "FRXNh");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[33]] = lllIlIlllllIlII("x/RdYjznTWFDMUL2t67dYdug5k6Tti9h", "xSwjx");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[35]] = lllIlIlllllIIll("q5gGKnWuzWntlsh4X3jJWQ==", "eQpTV");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[37]] = lllIlIlllllIIlI("NQIATnY=", "tnltV");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[40]] = lllIlIlllllIIll("VmHueelZNOtnpFU83K0AHg==", "wTBfO");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[41]] = lllIlIlllllIlII("YgikXFBL7nLgWAKbzipnOZWNt6+Ezqs5", "aIqJc");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[42]] = lllIlIlllllIIll("JWh+Wh7bQDqsjMV1AeOy6g==", "NdBtF");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[43]] = lllIlIlllllIIll("HqXx/GKmLN9P0uoaZ3E8IPtzdjDXMZyJ", "jRLWl");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[45]] = lllIlIlllllIIlI("Jzo8BwIIOz4MHQ==", "DRYdi");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[46]] = lllIlIlllllIlII("smhZAjbBsf6tSQHAzurOtA==", "emWbd");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[48]] = lllIlIlllllIIlI("KisjKB8sJxYkByA3LyQaaX9mPxsKKyMoHwosMyUA", "ICFKt");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[34]] = lllIlIlllllIIll("NpGTzdLxiaRrFafFhjnRTwFr5lLVZFFI", "LUcQd");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[49]] = lllIlIlllllIlII("MA+y4VSl+zteOnj/VgBngfwC0wMoYNlIYS11nk9y0ss=", "ytIfV");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[50]] = lllIlIlllllIIlI("AQAkDAljDyQAECcFJQ4WJh8=", "ClKob");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[51]] = lllIlIlllllIlII("7qyiw9pQQO1/PPutaCadbA==", "ZXFxg");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[52]] = lllIlIlllllIIlI("JjMRLxBDMQ0xAQ==", "cEtAd");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[53]] = lllIlIlllllIIll("EEnOo6LVHWie3gVuDwBj9A==", "KQGBQ");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[55]] = lllIlIlllllIlII("rEP6SnPPGZvhzk5OBOyZRQ==", "xOArK");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[56]] = lllIlIlllllIIlI("BickIQlqLDMpAA==", "JBRDe");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[57]] = lllIlIlllllIlII("Q9yDQDZfoOE=", "VfZKn");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[58]] = lllIlIlllllIIll("4Tpkkl4gk9NBViCJOQ04MA==", "Mexzp");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[59]] = lllIlIlllllIIll("NrUZU4yrNoyXrxROACEmtg==", "IhtFY");
        World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[60]] = lllIlIlllllIIll("aneYaBoborDX4pjXTZmProgPNpEYYTVs", "JJSkx");
    }
    
    private static int lllIllIIllIlIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void playSoundToNearExcept(final EntityPlayer lllllllllllllIIIlIIllllIlIlIlIlI, final String lllllllllllllIIIlIIllllIlIlIIIll, final float lllllllllllllIIIlIIllllIlIlIIIlI, final float lllllllllllllIIIlIIllllIlIlIIIIl) {
        int lllllllllllllIIIlIIllllIlIlIIllI = World.lIlIlIIlIlIllI[5];
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllllIlIlIIllI, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIllllIlIlIIllI).playSoundToNearExcept(lllllllllllllIIIlIIllllIlIlIlIlI, lllllllllllllIIIlIIllllIlIlIIIll, lllllllllllllIIIlIIllllIlIlIlIlI.posX, lllllllllllllIIIlIIllllIlIlIlIlI.posY, lllllllllllllIIIlIIllllIlIlIlIlI.posZ, lllllllllllllIIIlIIllllIlIlIIIlI, lllllllllllllIIIlIIllllIlIlIIIIl);
            ++lllllllllllllIIIlIIllllIlIlIIllI;
        }
    }
    
    public <T extends Entity> List<T> getEntities(final Class<? extends T> lllllllllllllIIIlIIlIllllllllIIl, final Predicate<? super T> lllllllllllllIIIlIIlIllllllllIII) {
        final List<T> lllllllllllllIIIlIIlIlllllllllII = (List<T>)Lists.newArrayList();
        final String lllllllllllllIIIlIIlIlllllllIlIl = (String)this.loadedEntityList.iterator();
        "".length();
        if ((0x9 ^ 0x1E ^ (0x99 ^ 0x8A)) < 0) {
            return null;
        }
        while (!lllIllIIlIIIllI(((Iterator)lllllllllllllIIIlIIlIlllllllIlIl).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIIlIIlIllllllllIll = ((Iterator<Entity>)lllllllllllllIIIlIIlIlllllllIlIl).next();
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllllllllIIl.isAssignableFrom(lllllllllllllIIIlIIlIllllllllIll.getClass()) ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllllllllIII.apply((Object)lllllllllllllIIIlIIlIllllllllIll) ? 1 : 0)) {
                lllllllllllllIIIlIIlIlllllllllII.add((T)lllllllllllllIIIlIIlIllllllllIll);
                "".length();
            }
        }
        return lllllllllllllIIIlIIlIlllllllllII;
    }
    
    public WorldChunkManager getWorldChunkManager() {
        return this.provider.getWorldChunkManager();
    }
    
    @Override
    public boolean extendedLevelsInChunkCache() {
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public boolean isInsideBorder(final WorldBorder lllllllllllllIIIlIIlllIllIIIlIll, final Entity lllllllllllllIIIlIIlllIllIIIlIlI) {
        double lllllllllllllIIIlIIlllIllIIIlIIl = lllllllllllllIIIlIIlllIllIIIlIll.minX();
        double lllllllllllllIIIlIIlllIllIIIlIII = lllllllllllllIIIlIIlllIllIIIlIll.minZ();
        double lllllllllllllIIIlIIlllIllIIIIlll = lllllllllllllIIIlIIlllIllIIIlIll.maxX();
        double lllllllllllllIIIlIIlllIllIIIIllI = lllllllllllllIIIlIIlllIllIIIlIll.maxZ();
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIllIIIlIlI.isOutsideBorder() ? 1 : 0)) {
            ++lllllllllllllIIIlIIlllIllIIIlIIl;
            ++lllllllllllllIIIlIIlllIllIIIlIII;
            --lllllllllllllIIIlIIlllIllIIIIlll;
            --lllllllllllllIIIlIIlllIllIIIIllI;
            "".length();
            if ("   ".length() == -" ".length()) {
                return ((93 + 2 + 29 + 107 ^ 151 + 58 - 66 + 23) & (0x30 ^ 0x3 ^ (0x4F ^ 0x3D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            --lllllllllllllIIIlIIlllIllIIIlIIl;
            --lllllllllllllIIIlIIlllIllIIIlIII;
            ++lllllllllllllIIIlIIlllIllIIIIlll;
            ++lllllllllllllIIIlIIlllIllIIIIllI;
        }
        if (lllIllIIlIIllII(lllIllIIlIlIIlI(lllllllllllllIIIlIIlllIllIIIlIlI.posX, lllllllllllllIIIlIIlllIllIIIlIIl)) && lllIllIIlIIlllI(lllIllIIlIlIIll(lllllllllllllIIIlIIlllIllIIIlIlI.posX, lllllllllllllIIIlIIlllIllIIIIlll)) && lllIllIIlIIllII(lllIllIIlIlIIlI(lllllllllllllIIIlIIlllIllIIIlIlI.posZ, lllllllllllllIIIlIIlllIllIIIlIII)) && lllIllIIlIIlllI(lllIllIIlIlIIll(lllllllllllllIIIlIIlllIllIIIlIlI.posZ, lllllllllllllIIIlIIlllIllIIIIllI))) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public boolean isAreaLoaded(final BlockPos lllllllllllllIIIlIlIIIIIllllIlll, final int lllllllllllllIIIlIlIIIIIllllIIlI, final boolean lllllllllllllIIIlIlIIIIIllllIlIl) {
        return this.isAreaLoaded(lllllllllllllIIIlIlIIIIIllllIlll.getX() - lllllllllllllIIIlIlIIIIIllllIIlI, lllllllllllllIIIlIlIIIIIllllIlll.getY() - lllllllllllllIIIlIlIIIIIllllIIlI, lllllllllllllIIIlIlIIIIIllllIlll.getZ() - lllllllllllllIIIlIlIIIIIllllIIlI, lllllllllllllIIIlIlIIIIIllllIlll.getX() + lllllllllllllIIIlIlIIIIIllllIIlI, lllllllllllllIIIlIlIIIIIllllIlll.getY() + lllllllllllllIIIlIlIIIIIllllIIlI, lllllllllllllIIIlIlIIIIIllllIlll.getZ() + lllllllllllllIIIlIlIIIIIllllIIlI, lllllllllllllIIIlIlIIIIIllllIlIl);
    }
    
    private static int lllIllIIlIlIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean canBlockSeeSky(final BlockPos lllllllllllllIIIlIIlllllllIllIll) {
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlllllllIllIll.getY(), this.func_181545_F())) {
            return this.canSeeSky(lllllllllllllIIIlIIlllllllIllIll);
        }
        BlockPos lllllllllllllIIIlIIlllllllIllllI = new BlockPos(lllllllllllllIIIlIIlllllllIllIll.getX(), this.func_181545_F(), lllllllllllllIIIlIIlllllllIllIll.getZ());
        if (lllIllIIlIIIllI(this.canSeeSky(lllllllllllllIIIlIIlllllllIllllI) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        lllllllllllllIIIlIIlllllllIllllI = lllllllllllllIIIlIIlllllllIllllI.down();
        "".length();
        if (null != null) {
            return ((76 + 20 - 64 + 100 ^ 106 + 71 - 108 + 74) & (0x25 ^ 0x7C ^ (0x1E ^ 0x4C) ^ -" ".length())) != 0x0;
        }
        while (!lllIllIIlIIllIl(lllllllllllllIIIlIIlllllllIllllI.getY(), lllllllllllllIIIlIIlllllllIllIll.getY())) {
            final Block lllllllllllllIIIlIIlllllllIlllIl = this.getBlockState(lllllllllllllIIIlIIlllllllIllllI).getBlock();
            if (lllIllIIlIIllII(lllllllllllllIIIlIIlllllllIlllIl.getLightOpacity()) && lllIllIIlIIIllI(lllllllllllllIIIlIIlllllllIlllIl.getMaterial().isLiquid() ? 1 : 0)) {
                return World.lIlIlIIlIlIllI[5] != 0;
            }
            lllllllllllllIIIlIIlllllllIllllI = lllllllllllllIIIlIIlllllllIllllI.down();
        }
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public void setAllowedSpawnTypes(final boolean lllllllllllllIIIlIIllIIlllIlIIII, final boolean lllllllllllllIIIlIIllIIlllIIllll) {
        this.spawnHostileMobs = lllllllllllllIIIlIIllIIlllIlIIII;
        this.spawnPeacefulMobs = lllllllllllllIIIlIIllIIlllIIllll;
    }
    
    public Chunk getChunkFromChunkCoords(final int lllllllllllllIIIlIlIIIIIlIIlIlIl, final int lllllllllllllIIIlIlIIIIIlIIlIlII) {
        return this.chunkProvider.provideChunk(lllllllllllllIIIlIlIIIIIlIIlIlIl, lllllllllllllIIIlIlIIIIIlIIlIlII);
    }
    
    public void updateBlockTick(final BlockPos lllllllllllllIIIlIIlllIIlIIlIllI, final Block lllllllllllllIIIlIIlllIIlIIlIlIl, final int lllllllllllllIIIlIIlllIIlIIlIlII, final int lllllllllllllIIIlIIlllIIlIIlIIll) {
    }
    
    public boolean checkLightFor(final EnumSkyBlock lllllllllllllIIIlIIllIIIllIIllll, final BlockPos lllllllllllllIIIlIIllIIIlIIIIlIl) {
        if (lllIllIIlIIIllI(this.isAreaLoaded(lllllllllllllIIIlIIllIIIlIIIIlIl, World.lIlIlIIlIlIllI[29], (boolean)(World.lIlIlIIlIlIllI[5] != 0)) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        int lllllllllllllIIIlIIllIIIllIIlIll = World.lIlIlIIlIlIllI[5];
        int lllllllllllllIIIlIIllIIIllIIlIlI = World.lIlIlIIlIlIllI[5];
        this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[46]]);
        final int lllllllllllllIIIlIIllIIIllIIlIIl = this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIIIlIl);
        final int lllllllllllllIIIlIIllIIIllIIIlll = this.getRawLight(lllllllllllllIIIlIIllIIIlIIIIlIl, lllllllllllllIIIlIIllIIIllIIllll);
        final int lllllllllllllIIIlIIllIIIllIIIlIl = lllllllllllllIIIlIIllIIIlIIIIlIl.getX();
        final int lllllllllllllIIIlIIllIIIllIIIIll = lllllllllllllIIIlIIllIIIlIIIIlIl.getY();
        final int lllllllllllllIIIlIIllIIIllIIIIIl = lllllllllllllIIIlIIllIIIlIIIIlIl.getZ();
        if (lllIllIIlIIIlll(lllllllllllllIIIlIIllIIIllIIIlll, lllllllllllllIIIlIIllIIIllIIlIIl)) {
            this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = World.lIlIlIIlIlIllI[47];
            "".length();
            if (" ".length() > " ".length()) {
                return ((0xBD ^ 0x8E ^ (0x69 ^ 0x14)) & (0x40 ^ 0x25 ^ (0x83 ^ 0xA8) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIIlIIIIll(lllllllllllllIIIlIIllIIIllIIIlll, lllllllllllllIIIlIIllIIIllIIlIIl)) {
            this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = (World.lIlIlIIlIlIllI[47] | lllllllllllllIIIlIIllIIIllIIlIIl << World.lIlIlIIlIlIllI[30]);
            "".length();
            if ("  ".length() == 0) {
                return ((0x46 ^ 0x51 ^ (0xA0 ^ 0x96)) & (0x8C ^ 0xC6 ^ (0x43 ^ 0x28) ^ -" ".length())) != 0x0;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIIllIIlIll, lllllllllllllIIIlIIllIIIllIIlIlI)) {
                final int lllllllllllllIIIlIIllIIIlIllllll = this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIll++];
                final int lllllllllllllIIIlIIllIIIlIllllIl = (lllllllllllllIIIlIIllIIIlIllllll & World.lIlIlIIlIlIllI[0]) - World.lIlIlIIlIlIllI[34] + lllllllllllllIIIlIIllIIIllIIIlIl;
                final int lllllllllllllIIIlIIllIIIlIlllIll = (lllllllllllllIIIlIIllIIIlIllllll >> World.lIlIlIIlIlIllI[16] & World.lIlIlIIlIlIllI[0]) - World.lIlIlIIlIlIllI[34] + lllllllllllllIIIlIIllIIIllIIIIll;
                final int lllllllllllllIIIlIIllIIIlIlllIIl = (lllllllllllllIIIlIIllIIIlIllllll >> World.lIlIlIIlIlIllI[26] & World.lIlIlIIlIlIllI[0]) - World.lIlIlIIlIlIllI[34] + lllllllllllllIIIlIIllIIIllIIIIIl;
                final int lllllllllllllIIIlIIllIIIlIllIlll = lllllllllllllIIIlIIllIIIlIllllll >> World.lIlIlIIlIlIllI[30] & World.lIlIlIIlIlIllI[18];
                final BlockPos lllllllllllllIIIlIIllIIIlIllIlIl = new BlockPos(lllllllllllllIIIlIIllIIIlIllllIl, lllllllllllllIIIlIIllIIIlIlllIll, lllllllllllllIIIlIIllIIIlIlllIIl);
                int lllllllllllllIIIlIIllIIIlIllIIll = this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIllIlIl);
                if (lllIllIIlIIlIIl(lllllllllllllIIIlIIllIIIlIllIIll, lllllllllllllIIIlIIllIIIlIllIlll)) {
                    this.setLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIllIlIl, World.lIlIlIIlIlIllI[5]);
                    if (!lllIllIIlIIllII(lllllllllllllIIIlIIllIIIlIllIlll)) {
                        continue;
                    }
                    final int lllllllllllllIIIlIIllIIIlIllIIlI = MathHelper.abs_int(lllllllllllllIIIlIIllIIIlIllllIl - lllllllllllllIIIlIIllIIIllIIIlIl);
                    final int lllllllllllllIIIlIIllIIIlIllIIII = MathHelper.abs_int(lllllllllllllIIIlIIllIIIlIlllIll - lllllllllllllIIIlIIllIIIllIIIIll);
                    final int lllllllllllllIIIlIIllIIIlIlIlllI = MathHelper.abs_int(lllllllllllllIIIlIIllIIIlIlllIIl - lllllllllllllIIIlIIllIIIllIIIIIl);
                    if (!lllIllIIlIIIIll(lllllllllllllIIIlIIllIIIlIllIIlI + lllllllllllllIIIlIIllIIIlIllIIII + lllllllllllllIIIlIIllIIIlIlIlllI, World.lIlIlIIlIlIllI[29])) {
                        continue;
                    }
                    final BlockPos.MutableBlockPos lllllllllllllIIIlIIllIIIlIlIlIll = new BlockPos.MutableBlockPos();
                    final int lllllllllllllIIIlIIllIIIIllIIIII;
                    final boolean lllllllllllllIIIlIIllIIIIllIIIlI = ((EnumFacing[])(Object)(lllllllllllllIIIlIIllIIIIllIIIII = (int)(Object)EnumFacing.values())).length != 0;
                    short lllllllllllllIIIlIIllIIIIllIIIll = (short)World.lIlIlIIlIlIllI[5];
                    "".length();
                    if (((0xD5 ^ 0xB4) & ~(0x6E ^ 0xF)) > " ".length()) {
                        return ((0x13 ^ 0x5) & ~(0xA2 ^ 0xB4)) != 0x0;
                    }
                    while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIIIllIIIll, lllllllllllllIIIlIIllIIIIllIIIlI ? 1 : 0)) {
                        final EnumFacing lllllllllllllIIIlIIllIIIlIlIlIIl = lllllllllllllIIIlIIllIIIIllIIIII[lllllllllllllIIIlIIllIIIIllIIIll];
                        final int lllllllllllllIIIlIIllIIIlIlIIlll = lllllllllllllIIIlIIllIIIlIllllIl + lllllllllllllIIIlIIllIIIlIlIlIIl.getFrontOffsetX();
                        final int lllllllllllllIIIlIIllIIIlIlIIlIl = lllllllllllllIIIlIIllIIIlIlllIll + lllllllllllllIIIlIIllIIIlIlIlIIl.getFrontOffsetY();
                        final int lllllllllllllIIIlIIllIIIlIlIIIll = lllllllllllllIIIlIIllIIIlIlllIIl + lllllllllllllIIIlIIllIIIlIlIlIIl.getFrontOffsetZ();
                        lllllllllllllIIIlIIllIIIlIlIlIll.func_181079_c(lllllllllllllIIIlIIllIIIlIlIIlll, lllllllllllllIIIlIIllIIIlIlIIlIl, lllllllllllllIIIlIIllIIIlIlIIIll);
                        "".length();
                        final int lllllllllllllIIIlIIllIIIlIlIIIIl = Math.max(World.lIlIlIIlIlIllI[3], this.getBlockState(lllllllllllllIIIlIIllIIIlIlIlIll).getBlock().getLightOpacity());
                        lllllllllllllIIIlIIllIIIlIllIIll = this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIlIlIll);
                        if (lllIllIIlIIlIIl(lllllllllllllIIIlIIllIIIlIllIIll, lllllllllllllIIIlIIllIIIlIllIlll - lllllllllllllIIIlIIllIIIlIlIIIIl) && lllIllIIlIIIIll(lllllllllllllIIIlIIllIIIllIIlIlI, this.lightUpdateBlockList.length)) {
                            this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = (lllllllllllllIIIlIIllIIIlIlIIlll - lllllllllllllIIIlIIllIIIllIIIlIl + World.lIlIlIIlIlIllI[34] | lllllllllllllIIIlIIllIIIlIlIIlIl - lllllllllllllIIIlIIllIIIllIIIIll + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[16] | lllllllllllllIIIlIIllIIIlIlIIIll - lllllllllllllIIIlIIllIIIllIIIIIl + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[26] | lllllllllllllIIIlIIllIIIlIllIlll - lllllllllllllIIIlIIllIIIlIlIIIIl << World.lIlIlIIlIlIllI[30]);
                        }
                        ++lllllllllllllIIIlIIllIIIIllIIIll;
                    }
                }
            }
            lllllllllllllIIIlIIllIIIllIIlIll = World.lIlIlIIlIlIllI[5];
        }
        this.theProfiler.endSection();
        this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[48]]);
        "".length();
        if (null != null) {
            return ((0x57 ^ 0x5A) & ~(0x10 ^ 0x1D)) != 0x0;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIIllIIlIll, lllllllllllllIIIlIIllIIIllIIlIlI)) {
            final int lllllllllllllIIIlIIllIIIlIIlllll = this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIll++];
            final int lllllllllllllIIIlIIllIIIlIIlllIl = (lllllllllllllIIIlIIllIIIlIIlllll & World.lIlIlIIlIlIllI[0]) - World.lIlIlIIlIlIllI[34] + lllllllllllllIIIlIIllIIIllIIIlIl;
            final int lllllllllllllIIIlIIllIIIlIIllIll = (lllllllllllllIIIlIIllIIIlIIlllll >> World.lIlIlIIlIlIllI[16] & World.lIlIlIIlIlIllI[0]) - World.lIlIlIIlIlIllI[34] + lllllllllllllIIIlIIllIIIllIIIIll;
            final int lllllllllllllIIIlIIllIIIlIIllIIl = (lllllllllllllIIIlIIllIIIlIIlllll >> World.lIlIlIIlIlIllI[26] & World.lIlIlIIlIlIllI[0]) - World.lIlIlIIlIlIllI[34] + lllllllllllllIIIlIIllIIIllIIIIIl;
            final BlockPos lllllllllllllIIIlIIllIIIlIIlIlll = new BlockPos(lllllllllllllIIIlIIllIIIlIIlllIl, lllllllllllllIIIlIIllIIIlIIllIll, lllllllllllllIIIlIIllIIIlIIllIIl);
            final int lllllllllllllIIIlIIllIIIlIIlIlIl = this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll);
            final int lllllllllllllIIIlIIllIIIlIIlIIll = this.getRawLight(lllllllllllllIIIlIIllIIIlIIlIlll, lllllllllllllIIIlIIllIIIllIIllll);
            if (lllIllIIlIIlIlI(lllllllllllllIIIlIIllIIIlIIlIIll, lllllllllllllIIIlIIllIIIlIIlIlIl)) {
                this.setLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll, lllllllllllllIIIlIIllIIIlIIlIIll);
                if (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIIIlIIlIIll, lllllllllllllIIIlIIllIIIlIIlIlIl)) {
                    continue;
                }
                final int lllllllllllllIIIlIIllIIIlIIlIIIl = Math.abs(lllllllllllllIIIlIIllIIIlIIlllIl - lllllllllllllIIIlIIllIIIllIIIlIl);
                final int lllllllllllllIIIlIIllIIIlIIIllll = Math.abs(lllllllllllllIIIlIIllIIIlIIllIll - lllllllllllllIIIlIIllIIIllIIIIll);
                final int lllllllllllllIIIlIIllIIIlIIIllIl = Math.abs(lllllllllllllIIIlIIllIIIlIIllIIl - lllllllllllllIIIlIIllIIIllIIIIIl);
                int n;
                if (lllIllIIlIIIIll(lllllllllllllIIIlIIllIIIllIIlIlI, this.lightUpdateBlockList.length - World.lIlIlIIlIlIllI[16])) {
                    n = World.lIlIlIIlIlIllI[3];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((65 + 75 - 31 + 47 ^ 4 + 68 - 20 + 98) & (73 + 114 - 106 + 82 ^ 24 + 149 - 170 + 166 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = World.lIlIlIIlIlIllI[5];
                }
                final boolean lllllllllllllIIIlIIllIIIlIIIlIll = n != 0;
                if (!lllIllIIlIIIIll(lllllllllllllIIIlIIllIIIlIIlIIIl + lllllllllllllIIIlIIllIIIlIIIllll + lllllllllllllIIIlIIllIIIlIIIllIl, World.lIlIlIIlIlIllI[29]) || !lllIllIIlIIIIIl(lllllllllllllIIIlIIllIIIlIIIlIll ? 1 : 0)) {
                    continue;
                }
                if (lllIllIIlIIIIll(this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll.west()), lllllllllllllIIIlIIllIIIlIIlIIll)) {
                    this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = lllllllllllllIIIlIIllIIIlIIlllIl - World.lIlIlIIlIlIllI[3] - lllllllllllllIIIlIIllIIIllIIIlIl + World.lIlIlIIlIlIllI[34] + (lllllllllllllIIIlIIllIIIlIIllIll - lllllllllllllIIIlIIllIIIllIIIIll + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[16]) + (lllllllllllllIIIlIIllIIIlIIllIIl - lllllllllllllIIIlIIllIIIllIIIIIl + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[26]);
                }
                if (lllIllIIlIIIIll(this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll.east()), lllllllllllllIIIlIIllIIIlIIlIIll)) {
                    this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = lllllllllllllIIIlIIllIIIlIIlllIl + World.lIlIlIIlIlIllI[3] - lllllllllllllIIIlIIllIIIllIIIlIl + World.lIlIlIIlIlIllI[34] + (lllllllllllllIIIlIIllIIIlIIllIll - lllllllllllllIIIlIIllIIIllIIIIll + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[16]) + (lllllllllllllIIIlIIllIIIlIIllIIl - lllllllllllllIIIlIIllIIIllIIIIIl + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[26]);
                }
                if (lllIllIIlIIIIll(this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll.down()), lllllllllllllIIIlIIllIIIlIIlIIll)) {
                    this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = lllllllllllllIIIlIIllIIIlIIlllIl - lllllllllllllIIIlIIllIIIllIIIlIl + World.lIlIlIIlIlIllI[34] + (lllllllllllllIIIlIIllIIIlIIllIll - World.lIlIlIIlIlIllI[3] - lllllllllllllIIIlIIllIIIllIIIIll + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[16]) + (lllllllllllllIIIlIIllIIIlIIllIIl - lllllllllllllIIIlIIllIIIllIIIIIl + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[26]);
                }
                if (lllIllIIlIIIIll(this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll.up()), lllllllllllllIIIlIIllIIIlIIlIIll)) {
                    this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = lllllllllllllIIIlIIllIIIlIIlllIl - lllllllllllllIIIlIIllIIIllIIIlIl + World.lIlIlIIlIlIllI[34] + (lllllllllllllIIIlIIllIIIlIIllIll + World.lIlIlIIlIlIllI[3] - lllllllllllllIIIlIIllIIIllIIIIll + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[16]) + (lllllllllllllIIIlIIllIIIlIIllIIl - lllllllllllllIIIlIIllIIIllIIIIIl + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[26]);
                }
                if (lllIllIIlIIIIll(this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll.north()), lllllllllllllIIIlIIllIIIlIIlIIll)) {
                    this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = lllllllllllllIIIlIIllIIIlIIlllIl - lllllllllllllIIIlIIllIIIllIIIlIl + World.lIlIlIIlIlIllI[34] + (lllllllllllllIIIlIIllIIIlIIllIll - lllllllllllllIIIlIIllIIIllIIIIll + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[16]) + (lllllllllllllIIIlIIllIIIlIIllIIl - World.lIlIlIIlIlIllI[3] - lllllllllllllIIIlIIllIIIllIIIIIl + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[26]);
                }
                if (!lllIllIIlIIIIll(this.getLightFor(lllllllllllllIIIlIIllIIIllIIllll, lllllllllllllIIIlIIllIIIlIIlIlll.south()), lllllllllllllIIIlIIllIIIlIIlIIll)) {
                    continue;
                }
                this.lightUpdateBlockList[lllllllllllllIIIlIIllIIIllIIlIlI++] = lllllllllllllIIIlIIllIIIlIIlllIl - lllllllllllllIIIlIIllIIIllIIIlIl + World.lIlIlIIlIlIllI[34] + (lllllllllllllIIIlIIllIIIlIIllIll - lllllllllllllIIIlIIllIIIllIIIIll + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[16]) + (lllllllllllllIIIlIIllIIIlIIllIIl + World.lIlIlIIlIlIllI[3] - lllllllllllllIIIlIIllIIIllIIIIIl + World.lIlIlIIlIlIllI[34] << World.lIlIlIIlIlIllI[26]);
            }
        }
        this.theProfiler.endSection();
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public void setRainStrength(final float lllllllllllllIIIlIIlIllIIIIlIllI) {
        this.prevRainingStrength = lllllllllllllIIIlIIlIllIIIIlIllI;
        this.rainingStrength = lllllllllllllIIIlIIlIllIIIIlIllI;
    }
    
    private static String lllIlIlllllIlII(final String lllllllllllllIIIlIIlIlIIlllIlllI, final String lllllllllllllIIIlIIlIlIIlllIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIlIlIIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIlIIlllIllIl.getBytes(StandardCharsets.UTF_8)), World.lIlIlIIlIlIllI[7]), "DES");
            final Cipher lllllllllllllIIIlIIlIlIIllllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIlIIlIlIIllllIIlI.init(World.lIlIlIIlIlIllI[6], lllllllllllllIIIlIIlIlIIllllIIll);
            return new String(lllllllllllllIIIlIIlIlIIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIlIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIlIlIIllllIIIl) {
            lllllllllllllIIIlIIlIlIIllllIIIl.printStackTrace();
            return null;
        }
    }
    
    public float getSunBrightness(final float lllllllllllllIIIlIIlllIlIlIIIIll) {
        final float lllllllllllllIIIlIIlllIlIlIIIIlI = this.getCelestialAngle(lllllllllllllIIIlIIlllIlIlIIIIll);
        float lllllllllllllIIIlIIlllIlIlIIIIIl = 1.0f - (MathHelper.cos(lllllllllllllIIIlIIlllIlIlIIIIlI * 3.1415927f * 2.0f) * 2.0f + 0.2f);
        lllllllllllllIIIlIIlllIlIlIIIIIl = MathHelper.clamp_float(lllllllllllllIIIlIIlllIlIlIIIIIl, 0.0f, 1.0f);
        lllllllllllllIIIlIIlllIlIlIIIIIl = 1.0f - lllllllllllllIIIlIIlllIlIlIIIIIl;
        lllllllllllllIIIlIIlllIlIlIIIIIl *= (float)(1.0 - this.getRainStrength(lllllllllllllIIIlIIlllIlIlIIIIll) * 5.0f / 16.0);
        lllllllllllllIIIlIIlllIlIlIIIIIl *= (float)(1.0 - this.getThunderStrength(lllllllllllllIIIlIIlllIlIlIIIIll) * 5.0f / 16.0);
        return lllllllllllllIIIlIIlllIlIlIIIIIl * 0.8f + 0.2f;
    }
    
    private static boolean lllIllIIllIIIlI(final int lllllllllllllIIIlIIlIlIIlIllIlII) {
        return lllllllllllllIIIlIIlIlIIlIllIlII <= 0;
    }
    
    public void setTileEntity(final BlockPos lllllllllllllIIIlIIllIlIIIIlllII, final TileEntity lllllllllllllIIIlIIllIlIIIIlIllI) {
        if (lllIllIIlIlIIIl(lllllllllllllIIIlIIllIlIIIIlIllI) && lllIllIIlIIIllI(lllllllllllllIIIlIIllIlIIIIlIllI.isInvalid() ? 1 : 0)) {
            if (lllIllIIlIIIIIl(this.processingLoadedTiles ? 1 : 0)) {
                lllllllllllllIIIlIIllIlIIIIlIllI.setPos(lllllllllllllIIIlIIllIlIIIIlllII);
                final Iterator<TileEntity> lllllllllllllIIIlIIllIlIIIIllIlI = this.addedTileEntityList.iterator();
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                while (!lllIllIIlIIIllI(lllllllllllllIIIlIIllIlIIIIllIlI.hasNext() ? 1 : 0)) {
                    final TileEntity lllllllllllllIIIlIIllIlIIIIllIIl = lllllllllllllIIIlIIllIlIIIIllIlI.next();
                    if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllIlIIIIllIIl.getPos().equals(lllllllllllllIIIlIIllIlIIIIlllII) ? 1 : 0)) {
                        lllllllllllllIIIlIIllIlIIIIllIIl.invalidate();
                        lllllllllllllIIIlIIllIlIIIIllIlI.remove();
                    }
                }
                this.addedTileEntityList.add(lllllllllllllIIIlIIllIlIIIIlIllI);
                "".length();
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
            else {
                this.addTileEntity(lllllllllllllIIIlIIllIlIIIIlIllI);
                "".length();
                this.getChunkFromBlockCoords(lllllllllllllIIIlIIllIlIIIIlllII).addTileEntity(lllllllllllllIIIlIIllIlIIIIlllII, lllllllllllllIIIlIIllIlIIIIlIllI);
            }
        }
    }
    
    public GameRules getGameRules() {
        return this.worldInfo.getGameRulesInstance();
    }
    
    public Block getGroundAboveSeaLevel(final BlockPos lllllllllllllIIIlIlIIIIlIIlIIIll) {
        BlockPos lllllllllllllIIIlIlIIIIlIIlIIIlI = new BlockPos(lllllllllllllIIIlIlIIIIlIIlIIIll.getX(), this.func_181545_F(), lllllllllllllIIIlIlIIIIlIIlIIIll.getZ());
        "".length();
        if ("  ".length() <= 0) {
            return null;
        }
        while (!lllIllIIlIIIIIl(this.isAirBlock(lllllllllllllIIIlIlIIIIlIIlIIIlI.up()) ? 1 : 0)) {
            lllllllllllllIIIlIlIIIIlIIlIIIlI = lllllllllllllIIIlIlIIIIlIIlIIIlI.up();
        }
        return this.getBlockState(lllllllllllllIIIlIlIIIIlIIlIIIlI).getBlock();
    }
    
    public void updateEntityWithOptionalForce(final Entity lllllllllllllIIIlIIlllIIIIIlIlIl, final boolean lllllllllllllIIIlIIlllIIIIIlIIll) {
        final int lllllllllllllIIIlIIlllIIIIIlIIlI = MathHelper.floor_double(lllllllllllllIIIlIIlllIIIIIlIlIl.posX);
        final int lllllllllllllIIIlIIlllIIIIIlIIII = MathHelper.floor_double(lllllllllllllIIIlIIlllIIIIIlIlIl.posZ);
        final int lllllllllllllIIIlIIlllIIIIIIllll = World.lIlIlIIlIlIllI[34];
        if (!lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIIIlIIll ? 1 : 0) || lllIllIIlIIIIIl(this.isAreaLoaded(lllllllllllllIIIlIIlllIIIIIlIIlI - lllllllllllllIIIlIIlllIIIIIIllll, World.lIlIlIIlIlIllI[5], lllllllllllllIIIlIIlllIIIIIlIIII - lllllllllllllIIIlIIlllIIIIIIllll, lllllllllllllIIIlIIlllIIIIIlIIlI + lllllllllllllIIIlIIlllIIIIIIllll, World.lIlIlIIlIlIllI[5], lllllllllllllIIIlIIlllIIIIIlIIII + lllllllllllllIIIlIIlllIIIIIIllll, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
            lllllllllllllIIIlIIlllIIIIIlIlIl.lastTickPosX = lllllllllllllIIIlIIlllIIIIIlIlIl.posX;
            lllllllllllllIIIlIIlllIIIIIlIlIl.lastTickPosY = lllllllllllllIIIlIIlllIIIIIlIlIl.posY;
            lllllllllllllIIIlIIlllIIIIIlIlIl.lastTickPosZ = lllllllllllllIIIlIIlllIIIIIlIlIl.posZ;
            lllllllllllllIIIlIIlllIIIIIlIlIl.prevRotationYaw = lllllllllllllIIIlIIlllIIIIIlIlIl.rotationYaw;
            lllllllllllllIIIlIIlllIIIIIlIlIl.prevRotationPitch = lllllllllllllIIIlIIlllIIIIIlIlIl.rotationPitch;
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIIIlIIll ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.addedToChunk ? 1 : 0)) {
                lllllllllllllIIIlIIlllIIIIIlIlIl.ticksExisted += World.lIlIlIIlIlIllI[3];
                if (lllIllIIlIlIIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.ridingEntity)) {
                    lllllllllllllIIIlIIlllIIIIIlIlIl.updateRidden();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIlllIIIIIlIlIl.onUpdate();
                }
            }
            this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[35]]);
            if (!lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllIIIIIlIlIl.posX) ? 1 : 0) || lllIllIIlIIIIIl(Double.isInfinite(lllllllllllllIIIlIIlllIIIIIlIlIl.posX) ? 1 : 0)) {
                lllllllllllllIIIlIIlllIIIIIlIlIl.posX = lllllllllllllIIIlIIlllIIIIIlIlIl.lastTickPosX;
            }
            if (!lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllIIIIIlIlIl.posY) ? 1 : 0) || lllIllIIlIIIIIl(Double.isInfinite(lllllllllllllIIIlIIlllIIIIIlIlIl.posY) ? 1 : 0)) {
                lllllllllllllIIIlIIlllIIIIIlIlIl.posY = lllllllllllllIIIlIIlllIIIIIlIlIl.lastTickPosY;
            }
            if (!lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllIIIIIlIlIl.posZ) ? 1 : 0) || lllIllIIlIIIIIl(Double.isInfinite(lllllllllllllIIIlIIlllIIIIIlIlIl.posZ) ? 1 : 0)) {
                lllllllllllllIIIlIIlllIIIIIlIlIl.posZ = lllllllllllllIIIlIIlllIIIIIlIlIl.lastTickPosZ;
            }
            if (!lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllIIIIIlIlIl.rotationPitch) ? 1 : 0) || lllIllIIlIIIIIl(Double.isInfinite(lllllllllllllIIIlIIlllIIIIIlIlIl.rotationPitch) ? 1 : 0)) {
                lllllllllllllIIIlIIlllIIIIIlIlIl.rotationPitch = lllllllllllllIIIlIIlllIIIIIlIlIl.prevRotationPitch;
            }
            if (!lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllIIIIIlIlIl.rotationYaw) ? 1 : 0) || lllIllIIlIIIIIl(Double.isInfinite(lllllllllllllIIIlIIlllIIIIIlIlIl.rotationYaw) ? 1 : 0)) {
                lllllllllllllIIIlIIlllIIIIIlIlIl.rotationYaw = lllllllllllllIIIlIIlllIIIIIlIlIl.prevRotationYaw;
            }
            final int lllllllllllllIIIlIIlllIIIIIIlllI = MathHelper.floor_double(lllllllllllllIIIlIIlllIIIIIlIlIl.posX / 16.0);
            final int lllllllllllllIIIlIIlllIIIIIIllII = MathHelper.floor_double(lllllllllllllIIIlIIlllIIIIIlIlIl.posY / 16.0);
            final int lllllllllllllIIIlIIlllIIIIIIlIlI = MathHelper.floor_double(lllllllllllllIIIlIIlllIIIIIlIlIl.posZ / 16.0);
            if (!lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.addedToChunk ? 1 : 0) || !lllIllIIlIIlIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordX, lllllllllllllIIIlIIlllIIIIIIlllI) || !lllIllIIlIIlIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordY, lllllllllllllIIIlIIlllIIIIIIllII) || lllIllIIlIIlIlI(lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordZ, lllllllllllllIIIlIIlllIIIIIIlIlI)) {
                if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.addedToChunk ? 1 : 0) && lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordX, lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordZ, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
                    this.getChunkFromChunkCoords(lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordX, lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordZ).removeEntityAtIndex(lllllllllllllIIIlIIlllIIIIIlIlIl, lllllllllllllIIIlIIlllIIIIIlIlIl.chunkCoordY);
                }
                if (lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIlllIIIIIIlllI, lllllllllllllIIIlIIlllIIIIIIlIlI, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
                    lllllllllllllIIIlIIlllIIIIIlIlIl.addedToChunk = (World.lIlIlIIlIlIllI[3] != 0);
                    this.getChunkFromChunkCoords(lllllllllllllIIIlIIlllIIIIIIlllI, lllllllllllllIIIlIIlllIIIIIIlIlI).addEntity(lllllllllllllIIIlIIlllIIIIIlIlIl);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIlllIIIIIlIlIl.addedToChunk = (World.lIlIlIIlIlIllI[5] != 0);
                }
            }
            this.theProfiler.endSection();
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIIIlIIll ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.addedToChunk ? 1 : 0) && lllIllIIlIlIIIl(lllllllllllllIIIlIIlllIIIIIlIlIl.riddenByEntity)) {
                if (lllIllIIlIIIllI(lllllllllllllIIIlIIlllIIIIIlIlIl.riddenByEntity.isDead ? 1 : 0) && lllIllIIlIIIlIl(lllllllllllllIIIlIIlllIIIIIlIlIl.riddenByEntity.ridingEntity, lllllllllllllIIIlIIlllIIIIIlIlIl)) {
                    this.updateEntity(lllllllllllllIIIlIIlllIIIIIlIlIl.riddenByEntity);
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIlllIIIIIlIlIl.riddenByEntity.ridingEntity = null;
                    lllllllllllllIIIlIIlllIIIIIlIlIl.riddenByEntity = null;
                }
            }
        }
    }
    
    public float getBlockDensity(final Vec3 lllllllllllllIIIlIIllIlIIllIIlII, final AxisAlignedBB lllllllllllllIIIlIIllIlIIllIIIll) {
        final double lllllllllllllIIIlIIllIlIIllIIIlI = 1.0 / ((lllllllllllllIIIlIIllIlIIllIIIll.maxX - lllllllllllllIIIlIIllIlIIllIIIll.minX) * 2.0 + 1.0);
        final double lllllllllllllIIIlIIllIlIIllIIIIl = 1.0 / ((lllllllllllllIIIlIIllIlIIllIIIll.maxY - lllllllllllllIIIlIIllIlIIllIIIll.minY) * 2.0 + 1.0);
        final double lllllllllllllIIIlIIllIlIIllIIIII = 1.0 / ((lllllllllllllIIIlIIllIlIIllIIIll.maxZ - lllllllllllllIIIlIIllIlIIllIIIll.minZ) * 2.0 + 1.0);
        final double lllllllllllllIIIlIIllIlIIlIlllll = (1.0 - Math.floor(1.0 / lllllllllllllIIIlIIllIlIIllIIIlI) * lllllllllllllIIIlIIllIlIIllIIIlI) / 2.0;
        final double lllllllllllllIIIlIIllIlIIlIllllI = (1.0 - Math.floor(1.0 / lllllllllllllIIIlIIllIlIIllIIIII) * lllllllllllllIIIlIIllIlIIllIIIII) / 2.0;
        if (!lllIllIIlIIIlII(lllIllIIlIllIlI(lllllllllllllIIIlIIllIlIIllIIIlI, 0.0)) || !lllIllIIlIIIlII(lllIllIIlIllIlI(lllllllllllllIIIlIIllIlIIllIIIIl, 0.0)) || !lllIllIIlIIIlII(lllIllIIlIllIlI(lllllllllllllIIIlIIllIlIIllIIIII, 0.0))) {
            return 0.0f;
        }
        int lllllllllllllIIIlIIllIlIIlIlllIl = World.lIlIlIIlIlIllI[5];
        int lllllllllllllIIIlIIllIlIIlIlllII = World.lIlIlIIlIlIllI[5];
        float lllllllllllllIIIlIIllIlIIlIllIll = 0.0f;
        "".length();
        if ((0xB0 ^ 0xB4) == -" ".length()) {
            return 0.0f;
        }
        while (!lllIllIIlIIllII(lllIllIIlIllIll(lllllllllllllIIIlIIllIlIIlIllIll, 1.0f))) {
            float lllllllllllllIIIlIIllIlIIlIllIlI = 0.0f;
            "".length();
            if ("  ".length() < 0) {
                return 0.0f;
            }
            while (!lllIllIIlIIllII(lllIllIIlIllIll(lllllllllllllIIIlIIllIlIIlIllIlI, 1.0f))) {
                float lllllllllllllIIIlIIllIlIIlIllIIl = 0.0f;
                "".length();
                if ((0xF0 ^ 0xA8 ^ (0x39 ^ 0x65)) <= " ".length()) {
                    return 0.0f;
                }
                while (!lllIllIIlIIllII(lllIllIIlIllIll(lllllllllllllIIIlIIllIlIIlIllIIl, 1.0f))) {
                    final double lllllllllllllIIIlIIllIlIIlIllIII = lllllllllllllIIIlIIllIlIIllIIIll.minX + (lllllllllllllIIIlIIllIlIIllIIIll.maxX - lllllllllllllIIIlIIllIlIIllIIIll.minX) * lllllllllllllIIIlIIllIlIIlIllIll;
                    final double lllllllllllllIIIlIIllIlIIlIlIlll = lllllllllllllIIIlIIllIlIIllIIIll.minY + (lllllllllllllIIIlIIllIlIIllIIIll.maxY - lllllllllllllIIIlIIllIlIIllIIIll.minY) * lllllllllllllIIIlIIllIlIIlIllIlI;
                    final double lllllllllllllIIIlIIllIlIIlIlIllI = lllllllllllllIIIlIIllIlIIllIIIll.minZ + (lllllllllllllIIIlIIllIlIIllIIIll.maxZ - lllllllllllllIIIlIIllIlIIllIIIll.minZ) * lllllllllllllIIIlIIllIlIIlIllIIl;
                    if (lllIllIIlIIlIII(this.rayTraceBlocks(new Vec3(lllllllllllllIIIlIIllIlIIlIllIII + lllllllllllllIIIlIIllIlIIlIlllll, lllllllllllllIIIlIIllIlIIlIlIlll, lllllllllllllIIIlIIllIlIIlIlIllI + lllllllllllllIIIlIIllIlIIlIllllI), lllllllllllllIIIlIIllIlIIllIIlII))) {
                        ++lllllllllllllIIIlIIllIlIIlIlllIl;
                    }
                    ++lllllllllllllIIIlIIllIlIIlIlllII;
                    lllllllllllllIIIlIIllIlIIlIllIIl += (float)lllllllllllllIIIlIIllIlIIllIIIII;
                }
                lllllllllllllIIIlIIllIlIIlIllIlI += (float)lllllllllllllIIIlIIllIlIIllIIIIl;
            }
            lllllllllllllIIIlIIllIlIIlIllIll += (float)lllllllllllllIIIlIIllIlIIllIIIlI;
        }
        return lllllllllllllIIIlIIllIlIIlIlllIl / (float)lllllllllllllIIIlIIllIlIIlIlllII;
    }
    
    public boolean isFlammableWithin(final AxisAlignedBB lllllllllllllIIIlIIllIllIlIlIIlI) {
        final int lllllllllllllIIIlIIllIllIlIlIIIl = MathHelper.floor_double(lllllllllllllIIIlIIllIllIlIlIIlI.minX);
        final int lllllllllllllIIIlIIllIllIlIlIIII = MathHelper.floor_double(lllllllllllllIIIlIIllIllIlIlIIlI.maxX + 1.0);
        final int lllllllllllllIIIlIIllIllIlIIllll = MathHelper.floor_double(lllllllllllllIIIlIIllIllIlIlIIlI.minY);
        final int lllllllllllllIIIlIIllIllIlIIlllI = MathHelper.floor_double(lllllllllllllIIIlIIllIllIlIlIIlI.maxY + 1.0);
        final int lllllllllllllIIIlIIllIllIlIIllIl = MathHelper.floor_double(lllllllllllllIIIlIIllIllIlIlIIlI.minZ);
        final int lllllllllllllIIIlIIllIllIlIIllII = MathHelper.floor_double(lllllllllllllIIIlIIllIllIlIlIIlI.maxZ + 1.0);
        if (lllIllIIlIIIIIl(this.isAreaLoaded(lllllllllllllIIIlIIllIllIlIlIIIl, lllllllllllllIIIlIIllIllIlIIllll, lllllllllllllIIIlIIllIllIlIIllIl, lllllllllllllIIIlIIllIllIlIlIIII, lllllllllllllIIIlIIllIllIlIIlllI, lllllllllllllIIIlIIllIllIlIIllII, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
            final BlockPos.MutableBlockPos lllllllllllllIIIlIIllIllIlIIlIll = new BlockPos.MutableBlockPos();
            int lllllllllllllIIIlIIllIllIlIIlIlI = lllllllllllllIIIlIIllIllIlIlIIIl;
            "".length();
            if (((0x52 ^ 0xD) & ~(0x50 ^ 0xF)) != 0x0) {
                return ((0xB9 ^ 0xBD) & ~(0x4A ^ 0x4E)) != 0x0;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIllIlIIlIlI, lllllllllllllIIIlIIllIllIlIlIIII)) {
                int lllllllllllllIIIlIIllIllIlIIlIIl = lllllllllllllIIIlIIllIllIlIIllll;
                "".length();
                if ((0x4A ^ 0x4E) != (0x7A ^ 0x7E)) {
                    return ((0x9 ^ 0x2C) & ~(0x2E ^ 0xB)) != 0x0;
                }
                while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIllIlIIlIIl, lllllllllllllIIIlIIllIllIlIIlllI)) {
                    int lllllllllllllIIIlIIllIllIlIIlIII = lllllllllllllIIIlIIllIllIlIIllIl;
                    "".length();
                    if ((0x86 ^ 0xBC ^ (0x36 ^ 0x8)) == "   ".length()) {
                        return ((18 + 59 + 47 + 46 ^ 96 + 154 - 149 + 87) & (0x9A ^ 0x96 ^ (0xB5 ^ 0xAF) ^ -" ".length())) != 0x0;
                    }
                    while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIllIlIIlIII, lllllllllllllIIIlIIllIllIlIIllII)) {
                        final Block lllllllllllllIIIlIIllIllIlIIIlll = this.getBlockState(lllllllllllllIIIlIIllIllIlIIlIll.func_181079_c(lllllllllllllIIIlIIllIllIlIIlIlI, lllllllllllllIIIlIIllIllIlIIlIIl, lllllllllllllIIIlIIllIllIlIIlIII)).getBlock();
                        if (!lllIllIIlIIlIll(lllllllllllllIIIlIIllIllIlIIIlll, Blocks.fire) || !lllIllIIlIIlIll(lllllllllllllIIIlIIllIllIlIIIlll, Blocks.flowing_lava) || lllIllIIlIIIlIl(lllllllllllllIIIlIIllIllIlIIIlll, Blocks.lava)) {
                            return World.lIlIlIIlIlIllI[3] != 0;
                        }
                        ++lllllllllllllIIIlIIllIllIlIIlIII;
                    }
                    ++lllllllllllllIIIlIIllIllIlIIlIIl;
                }
                ++lllllllllllllIIIlIIllIllIlIIlIlI;
            }
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public int calculateSkylightSubtracted(final float lllllllllllllIIIlIIlllIlIlIIlIll) {
        final float lllllllllllllIIIlIIlllIlIlIIlllI = this.getCelestialAngle(lllllllllllllIIIlIIlllIlIlIIlIll);
        float lllllllllllllIIIlIIlllIlIlIIllIl = 1.0f - (MathHelper.cos(lllllllllllllIIIlIIlllIlIlIIlllI * 3.1415927f * 2.0f) * 2.0f + 0.5f);
        lllllllllllllIIIlIIlllIlIlIIllIl = MathHelper.clamp_float(lllllllllllllIIIlIIlllIlIlIIllIl, 0.0f, 1.0f);
        lllllllllllllIIIlIIlllIlIlIIllIl = 1.0f - lllllllllllllIIIlIIlllIlIlIIllIl;
        lllllllllllllIIIlIIlllIlIlIIllIl *= (float)(1.0 - this.getRainStrength(lllllllllllllIIIlIIlllIlIlIIlIll) * 5.0f / 16.0);
        lllllllllllllIIIlIIlllIlIlIIllIl *= (float)(1.0 - this.getThunderStrength(lllllllllllllIIIlIIlllIlIlIIlIll) * 5.0f / 16.0);
        lllllllllllllIIIlIIlllIlIlIIllIl = 1.0f - lllllllllllllIIIlIIlllIlIlIIllIl;
        return (int)(lllllllllllllIIIlIIlllIlIlIIllIl * 11.0f);
    }
    
    private static int lllIllIIlIlIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean isAreaLoaded(final StructureBoundingBox lllllllllllllIIIlIlIIIIIllIlIIIl, final boolean lllllllllllllIIIlIlIIIIIllIIllIl) {
        return this.isAreaLoaded(lllllllllllllIIIlIlIIIIIllIlIIIl.minX, lllllllllllllIIIlIlIIIIIllIlIIIl.minY, lllllllllllllIIIlIlIIIIIllIlIIIl.minZ, lllllllllllllIIIlIlIIIIIllIlIIIl.maxX, lllllllllllllIIIlIlIIIIIllIlIIIl.maxY, lllllllllllllIIIlIlIIIIIllIlIIIl.maxZ, lllllllllllllIIIlIlIIIIIllIIllIl);
    }
    
    public int getRedstonePower(final BlockPos lllllllllllllIIIlIIlIlllIIIlIllI, final EnumFacing lllllllllllllIIIlIIlIlllIIIlIlII) {
        final IBlockState lllllllllllllIIIlIIlIlllIIIllIll = this.getBlockState(lllllllllllllIIIlIIlIlllIIIlIllI);
        final Block lllllllllllllIIIlIIlIlllIIIllIIl = lllllllllllllIIIlIIlIlllIIIllIll.getBlock();
        int n;
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIlllIIIllIIl.isNormalCube() ? 1 : 0)) {
            n = this.getStrongPower(lllllllllllllIIIlIIlIlllIIIlIllI);
            "".length();
            if (null != null) {
                return "   ".length() & ("   ".length() ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIIlIIlIlllIIIllIIl.getWeakPower(this, lllllllllllllIIIlIIlIlllIIIlIllI, lllllllllllllIIIlIIlIlllIIIllIll, lllllllllllllIIIlIIlIlllIIIlIlII);
        }
        return n;
    }
    
    private static boolean lllIllIIlIIlIIl(final int lllllllllllllIIIlIIlIlIIllIllIll, final int lllllllllllllIIIlIIlIlIIllIllIlI) {
        return lllllllllllllIIIlIIlIlIIllIllIll == lllllllllllllIIIlIIlIlIIllIllIlI;
    }
    
    private static boolean lllIllIIlIIllIl(final int lllllllllllllIIIlIIlIlIIllIIllll, final int lllllllllllllIIIlIIlIlIIllIIlllI) {
        return lllllllllllllIIIlIIlIlIIllIIllll <= lllllllllllllIIIlIIlIlIIllIIlllI;
    }
    
    protected abstract int getRenderDistanceChunks();
    
    public EnumDifficulty getDifficulty() {
        return this.getWorldInfo().getDifficulty();
    }
    
    public int getLight(BlockPos lllllllllllllIIIlIIllllllIlllIlI, final boolean lllllllllllllIIIlIIllllllIlllIIl) {
        if (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllllllIlllIlI.getX(), World.lIlIlIIlIlIllI[9]) || !lllIllIIlIIIIlI(lllllllllllllIIIlIIllllllIlllIlI.getZ(), World.lIlIlIIlIlIllI[9]) || !lllIllIIlIIIIll(lllllllllllllIIIlIIllllllIlllIlI.getX(), World.lIlIlIIlIlIllI[10]) || !lllIllIIlIIIIll(lllllllllllllIIIlIIllllllIlllIlI.getZ(), World.lIlIlIIlIlIllI[10])) {
            return World.lIlIlIIlIlIllI[18];
        }
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllllIlllIIl ? 1 : 0) && lllIllIIlIIIIIl(this.getBlockState(lllllllllllllIIIlIIllllllIlllIlI).getBlock().getUseNeighborBrightness() ? 1 : 0)) {
            int lllllllllllllIIIlIIlllllllIIIIIl = this.getLight(lllllllllllllIIIlIIllllllIlllIlI.up(), (boolean)(World.lIlIlIIlIlIllI[5] != 0));
            final int lllllllllllllIIIlIIlllllllIIIIII = this.getLight(lllllllllllllIIIlIIllllllIlllIlI.east(), (boolean)(World.lIlIlIIlIlIllI[5] != 0));
            final int lllllllllllllIIIlIIllllllIllllll = this.getLight(lllllllllllllIIIlIIllllllIlllIlI.west(), (boolean)(World.lIlIlIIlIlIllI[5] != 0));
            final int lllllllllllllIIIlIIllllllIlllllI = this.getLight(lllllllllllllIIIlIIllllllIlllIlI.south(), (boolean)(World.lIlIlIIlIlIllI[5] != 0));
            final int lllllllllllllIIIlIIllllllIllllIl = this.getLight(lllllllllllllIIIlIIllllllIlllIlI.north(), (boolean)(World.lIlIlIIlIlIllI[5] != 0));
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIlllllllIIIIII, lllllllllllllIIIlIIlllllllIIIIIl)) {
                lllllllllllllIIIlIIlllllllIIIIIl = lllllllllllllIIIlIIlllllllIIIIII;
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllllllIllllll, lllllllllllllIIIlIIlllllllIIIIIl)) {
                lllllllllllllIIIlIIlllllllIIIIIl = lllllllllllllIIIlIIllllllIllllll;
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllllllIlllllI, lllllllllllllIIIlIIlllllllIIIIIl)) {
                lllllllllllllIIIlIIlllllllIIIIIl = lllllllllllllIIIlIIllllllIlllllI;
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllllllIllllIl, lllllllllllllIIIlIIlllllllIIIIIl)) {
                lllllllllllllIIIlIIlllllllIIIIIl = lllllllllllllIIIlIIllllllIllllIl;
            }
            return lllllllllllllIIIlIIlllllllIIIIIl;
        }
        if (lllIllIIlIIlllI(lllllllllllllIIIlIIllllllIlllIlI.getY())) {
            return World.lIlIlIIlIlIllI[5];
        }
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIllllllIlllIlI.getY(), World.lIlIlIIlIlIllI[11])) {
            lllllllllllllIIIlIIllllllIlllIlI = new BlockPos(lllllllllllllIIIlIIllllllIlllIlI.getX(), World.lIlIlIIlIlIllI[17], lllllllllllllIIIlIIllllllIlllIlI.getZ());
        }
        final Chunk lllllllllllllIIIlIIllllllIllllII = this.getChunkFromBlockCoords(lllllllllllllIIIlIIllllllIlllIlI);
        return lllllllllllllIIIlIIllllllIllllII.getLightSubtracted(lllllllllllllIIIlIIllllllIlllIlI, this.skylightSubtracted);
    }
    
    public void updateEntities() {
        this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[22]]);
        this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[7]]);
        int lllllllllllllIIIlIIlllIIlIIIIlIl = World.lIlIlIIlIlIllI[5];
        "".length();
        if (-(15 + 77 + 16 + 49 ^ 111 + 13 - 10 + 39) > 0) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIIlIIIIlIl, this.weatherEffects.size())) {
            final Entity lllllllllllllIIIlIIlllIIlIIIIlII = this.weatherEffects.get(lllllllllllllIIIlIIlllIIlIIIIlIl);
            try {
                final Entity entity = lllllllllllllIIIlIIlllIIlIIIIlII;
                entity.ticksExisted += World.lIlIlIIlIlIllI[3];
                lllllllllllllIIIlIIlllIIlIIIIlII.onUpdate();
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIlIIlllIIlIIIIIll) {
                final CrashReport lllllllllllllIIIlIIlllIIlIIIIIlI = CrashReport.makeCrashReport(lllllllllllllIIIlIIlllIIlIIIIIll, World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[23]]);
                final CrashReportCategory lllllllllllllIIIlIIlllIIlIIIIIIl = lllllllllllllIIIlIIlllIIlIIIIIlI.makeCategory(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[24]]);
                if (lllIllIIlIIlIII(lllllllllllllIIIlIIlllIIlIIIIlII)) {
                    lllllllllllllIIIlIIlllIIlIIIIIIl.addCrashSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[25]], World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[26]]);
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIlllIIlIIIIlII.addEntityCrashInfo(lllllllllllllIIIlIIlllIIlIIIIIIl);
                }
                throw new ReportedException(lllllllllllllIIIlIIlllIIlIIIIIlI);
            }
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIlIIIIlII.isDead ? 1 : 0)) {
                this.weatherEffects.remove(lllllllllllllIIIlIIlllIIlIIIIlIl--);
                "".length();
            }
            ++lllllllllllllIIIlIIlllIIlIIIIlIl;
        }
        this.theProfiler.endStartSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[27]]);
        this.loadedEntityList.removeAll(this.unloadedEntityList);
        "".length();
        int lllllllllllllIIIlIIlllIIlIIIIIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIIlIIIIIII, this.unloadedEntityList.size())) {
            final Entity lllllllllllllIIIlIIlllIIIlllllll = this.unloadedEntityList.get(lllllllllllllIIIlIIlllIIlIIIIIII);
            final int lllllllllllllIIIlIIlllIIIllllllI = lllllllllllllIIIlIIlllIIIlllllll.chunkCoordX;
            final int lllllllllllllIIIlIIlllIIIlllllIl = lllllllllllllIIIlIIlllIIIlllllll.chunkCoordZ;
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIlllllll.addedToChunk ? 1 : 0) && lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIlllIIIllllllI, lllllllllllllIIIlIIlllIIIlllllIl, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
                this.getChunkFromChunkCoords(lllllllllllllIIIlIIlllIIIllllllI, lllllllllllllIIIlIIlllIIIlllllIl).removeEntity(lllllllllllllIIIlIIlllIIIlllllll);
            }
            ++lllllllllllllIIIlIIlllIIlIIIIIII;
        }
        int lllllllllllllIIIlIIlllIIIlllllII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (((0x3A ^ 0x57 ^ (0x84 ^ 0xC4)) & (0x4A ^ 0x74 ^ (0x39 ^ 0x2A) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIIIlllllII, this.unloadedEntityList.size())) {
            this.onEntityRemoved(this.unloadedEntityList.get(lllllllllllllIIIlIIlllIIIlllllII));
            ++lllllllllllllIIIlIIlllIIIlllllII;
        }
        this.unloadedEntityList.clear();
        this.theProfiler.endStartSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[28]]);
        int lllllllllllllIIIlIIlllIIIllllIll = World.lIlIlIIlIlIllI[5];
        "".length();
        if (" ".length() <= ((0x49 ^ 0x7F ^ (0x54 ^ 0x51)) & (0x2C ^ 0x8 ^ (0x15 ^ 0x2) ^ -" ".length()))) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIIIllllIll, this.loadedEntityList.size())) {
            final Entity lllllllllllllIIIlIIlllIIIllllIlI = this.loadedEntityList.get(lllllllllllllIIIlIIlllIIIllllIll);
            Label_0856: {
                if (lllIllIIlIlIIIl(lllllllllllllIIIlIIlllIIIllllIlI.ridingEntity)) {
                    if (lllIllIIlIIIllI(lllllllllllllIIIlIIlllIIIllllIlI.ridingEntity.isDead ? 1 : 0) && lllIllIIlIIIlIl(lllllllllllllIIIlIIlllIIIllllIlI.ridingEntity.riddenByEntity, lllllllllllllIIIlIIlllIIIllllIlI)) {
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                        break Label_0856;
                    }
                    else {
                        lllllllllllllIIIlIIlllIIIllllIlI.ridingEntity.riddenByEntity = null;
                        lllllllllllllIIIlIIlllIIIllllIlI.ridingEntity = null;
                    }
                }
                this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[18]]);
                if (lllIllIIlIIIllI(lllllllllllllIIIlIIlllIIIllllIlI.isDead ? 1 : 0)) {
                    try {
                        this.updateEntity(lllllllllllllIIIlIIlllIIIllllIlI);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    catch (Throwable lllllllllllllIIIlIIlllIIIllllIIl) {
                        final CrashReport lllllllllllllIIIlIIlllIIIllllIII = CrashReport.makeCrashReport(lllllllllllllIIIlIIlllIIIllllIIl, World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[21]]);
                        final CrashReportCategory lllllllllllllIIIlIIlllIIIlllIlll = lllllllllllllIIIlIIlllIIIllllIII.makeCategory(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[29]]);
                        lllllllllllllIIIlIIlllIIIllllIlI.addEntityCrashInfo(lllllllllllllIIIlIIlllIIIlllIlll);
                        throw new ReportedException(lllllllllllllIIIlIIlllIIIllllIII);
                    }
                }
                this.theProfiler.endSection();
                this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[30]]);
                if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIllllIlI.isDead ? 1 : 0)) {
                    final int lllllllllllllIIIlIIlllIIIlllIllI = lllllllllllllIIIlIIlllIIIllllIlI.chunkCoordX;
                    final int lllllllllllllIIIlIIlllIIIlllIlIl = lllllllllllllIIIlIIlllIIIllllIlI.chunkCoordZ;
                    if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIllllIlI.addedToChunk ? 1 : 0) && lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIlllIIIlllIllI, lllllllllllllIIIlIIlllIIIlllIlIl, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
                        this.getChunkFromChunkCoords(lllllllllllllIIIlIIlllIIIlllIllI, lllllllllllllIIIlIIlllIIIlllIlIl).removeEntity(lllllllllllllIIIlIIlllIIIllllIlI);
                    }
                    this.loadedEntityList.remove(lllllllllllllIIIlIIlllIIIllllIll--);
                    "".length();
                    this.onEntityRemoved(lllllllllllllIIIlIIlllIIIllllIlI);
                }
                this.theProfiler.endSection();
            }
            ++lllllllllllllIIIlIIlllIIIllllIll;
        }
        this.theProfiler.endStartSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[31]]);
        this.processingLoadedTiles = (World.lIlIlIIlIlIllI[3] != 0);
        final Iterator<TileEntity> lllllllllllllIIIlIIlllIIIlllIlII = this.tickableTileEntities.iterator();
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lllIllIIlIIIllI(lllllllllllllIIIlIIlllIIIlllIlII.hasNext() ? 1 : 0)) {
            final TileEntity lllllllllllllIIIlIIlllIIIlllIIll = lllllllllllllIIIlIIlllIIIlllIlII.next();
            if (lllIllIIlIIIllI(lllllllllllllIIIlIIlllIIIlllIIll.isInvalid() ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIlllIIll.hasWorldObj() ? 1 : 0)) {
                final BlockPos lllllllllllllIIIlIIlllIIIlllIIlI = lllllllllllllIIIlIIlllIIIlllIIll.getPos();
                if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlllIIIlllIIlI) ? 1 : 0) && lllIllIIlIIIIIl(this.worldBorder.contains(lllllllllllllIIIlIIlllIIIlllIIlI) ? 1 : 0)) {
                    try {
                        ((ITickable)lllllllllllllIIIlIIlllIIIlllIIll).update();
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                    catch (Throwable lllllllllllllIIIlIIlllIIIlllIIIl) {
                        final CrashReport lllllllllllllIIIlIIlllIIIlllIIII = CrashReport.makeCrashReport(lllllllllllllIIIlIIlllIIIlllIIIl, World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[19]]);
                        final CrashReportCategory lllllllllllllIIIlIIlllIIIllIllll = lllllllllllllIIIlIIlllIIIlllIIII.makeCategory(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[32]]);
                        lllllllllllllIIIlIIlllIIIlllIIll.addInfoToCrashReport(lllllllllllllIIIlIIlllIIIllIllll);
                        throw new ReportedException(lllllllllllllIIIlIIlllIIIlllIIII);
                    }
                }
            }
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIlllIIll.isInvalid() ? 1 : 0)) {
                lllllllllllllIIIlIIlllIIIlllIlII.remove();
                this.loadedTileEntityList.remove(lllllllllllllIIIlIIlllIIIlllIIll);
                "".length();
                if (!lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlllIIIlllIIll.getPos()) ? 1 : 0)) {
                    continue;
                }
                this.getChunkFromBlockCoords(lllllllllllllIIIlIIlllIIIlllIIll.getPos()).removeTileEntity(lllllllllllllIIIlIIlllIIIlllIIll.getPos());
            }
        }
        this.processingLoadedTiles = (World.lIlIlIIlIlIllI[5] != 0);
        if (lllIllIIlIIIllI(this.tileEntitiesToBeRemoved.isEmpty() ? 1 : 0)) {
            this.tickableTileEntities.removeAll(this.tileEntitiesToBeRemoved);
            "".length();
            this.loadedTileEntityList.removeAll(this.tileEntitiesToBeRemoved);
            "".length();
            this.tileEntitiesToBeRemoved.clear();
        }
        this.theProfiler.endStartSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[33]]);
        if (lllIllIIlIIIllI(this.addedTileEntityList.isEmpty() ? 1 : 0)) {
            int lllllllllllllIIIlIIlllIIIllIlllI = World.lIlIlIIlIlIllI[5];
            "".length();
            if ((0xBA ^ 0xBE) < ((0xE9 ^ 0xA8) & ~(0x36 ^ 0x77))) {
                return;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIIIllIlllI, this.addedTileEntityList.size())) {
                final TileEntity lllllllllllllIIIlIIlllIIIllIllIl = this.addedTileEntityList.get(lllllllllllllIIIlIIlllIIIllIlllI);
                if (lllIllIIlIIIllI(lllllllllllllIIIlIIlllIIIllIllIl.isInvalid() ? 1 : 0)) {
                    if (lllIllIIlIIIllI(this.loadedTileEntityList.contains(lllllllllllllIIIlIIlllIIIllIllIl) ? 1 : 0)) {
                        this.addTileEntity(lllllllllllllIIIlIIlllIIIllIllIl);
                        "".length();
                    }
                    if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlllIIIllIllIl.getPos()) ? 1 : 0)) {
                        this.getChunkFromBlockCoords(lllllllllllllIIIlIIlllIIIllIllIl.getPos()).addTileEntity(lllllllllllllIIIlIIlllIIIllIllIl.getPos(), lllllllllllllIIIlIIlllIIIllIllIl);
                    }
                    this.markBlockForUpdate(lllllllllllllIIIlIIlllIIIllIllIl.getPos());
                }
                ++lllllllllllllIIIlIIlllIIIllIlllI;
            }
            this.addedTileEntityList.clear();
        }
        this.theProfiler.endSection();
        this.theProfiler.endSection();
    }
    
    public boolean handleMaterialAcceleration(final AxisAlignedBB lllllllllllllIIIlIIllIllIIlIIlIl, final Material lllllllllllllIIIlIIllIllIIIlIIII, final Entity lllllllllllllIIIlIIllIllIIlIIIll) {
        final int lllllllllllllIIIlIIllIllIIlIIIlI = MathHelper.floor_double(lllllllllllllIIIlIIllIllIIlIIlIl.minX);
        final int lllllllllllllIIIlIIllIllIIlIIIIl = MathHelper.floor_double(lllllllllllllIIIlIIllIllIIlIIlIl.maxX + 1.0);
        final int lllllllllllllIIIlIIllIllIIlIIIII = MathHelper.floor_double(lllllllllllllIIIlIIllIllIIlIIlIl.minY);
        final int lllllllllllllIIIlIIllIllIIIlllll = MathHelper.floor_double(lllllllllllllIIIlIIllIllIIlIIlIl.maxY + 1.0);
        final int lllllllllllllIIIlIIllIllIIIllllI = MathHelper.floor_double(lllllllllllllIIIlIIllIllIIlIIlIl.minZ);
        final int lllllllllllllIIIlIIllIllIIIlllIl = MathHelper.floor_double(lllllllllllllIIIlIIllIllIIlIIlIl.maxZ + 1.0);
        if (lllIllIIlIIIllI(this.isAreaLoaded(lllllllllllllIIIlIIllIllIIlIIIlI, lllllllllllllIIIlIIllIllIIlIIIII, lllllllllllllIIIlIIllIllIIIllllI, lllllllllllllIIIlIIllIllIIlIIIIl, lllllllllllllIIIlIIllIllIIIlllll, lllllllllllllIIIlIIllIllIIIlllIl, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        boolean lllllllllllllIIIlIIllIllIIIlllII = World.lIlIlIIlIlIllI[5] != 0;
        Vec3 lllllllllllllIIIlIIllIllIIIllIll = new Vec3(0.0, 0.0, 0.0);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIIllIllIIIllIlI = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIIllIllIIIllIIl = lllllllllllllIIIlIIllIllIIlIIIlI;
        "".length();
        if ("  ".length() == -" ".length()) {
            return ((0xD ^ 0x21 ^ (0xC ^ 0x3B)) & (0xEB ^ 0xA3 ^ (0xED ^ 0xBE) ^ -" ".length())) != 0x0;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIllIIIllIIl, lllllllllllllIIIlIIllIllIIlIIIIl)) {
            int lllllllllllllIIIlIIllIllIIIllIII = lllllllllllllIIIlIIllIllIIlIIIII;
            "".length();
            if (-" ".length() < -" ".length()) {
                return ((126 + 89 - 103 + 27 ^ 88 + 65 - 60 + 47) & (151 + 10 - 97 + 123 ^ 58 + 170 - 172 + 132 ^ -" ".length())) != 0x0;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIllIIIllIII, lllllllllllllIIIlIIllIllIIIlllll)) {
                int lllllllllllllIIIlIIllIllIIIlIlll = lllllllllllllIIIlIIllIllIIIllllI;
                "".length();
                if (null != null) {
                    return ((0x13 ^ 0x1E) & ~(0x2B ^ 0x26)) != 0x0;
                }
                while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIllIIIlIlll, lllllllllllllIIIlIIllIllIIIlllIl)) {
                    lllllllllllllIIIlIIllIllIIIllIlI.func_181079_c(lllllllllllllIIIlIIllIllIIIllIIl, lllllllllllllIIIlIIllIllIIIllIII, lllllllllllllIIIlIIllIllIIIlIlll);
                    "".length();
                    final IBlockState lllllllllllllIIIlIIllIllIIIlIllI = this.getBlockState(lllllllllllllIIIlIIllIllIIIllIlI);
                    final Block lllllllllllllIIIlIIllIllIIIlIlIl = lllllllllllllIIIlIIllIllIIIlIllI.getBlock();
                    if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIllIIIlIlIl.getMaterial(), lllllllllllllIIIlIIllIllIIIlIIII)) {
                        final double lllllllllllllIIIlIIllIllIIIlIlII = lllllllllllllIIIlIIllIllIIIllIII + World.lIlIlIIlIlIllI[3] - BlockLiquid.getLiquidHeightPercent(lllllllllllllIIIlIIllIllIIIlIllI.getValue((IProperty<Integer>)BlockLiquid.LEVEL));
                        if (lllIllIIlIIIlII(lllIllIIlIllIII(lllllllllllllIIIlIIllIllIIIlllll, lllllllllllllIIIlIIllIllIIIlIlII))) {
                            lllllllllllllIIIlIIllIllIIIlllII = (World.lIlIlIIlIlIllI[3] != 0);
                            lllllllllllllIIIlIIllIllIIIllIll = lllllllllllllIIIlIIllIllIIIlIlIl.modifyAcceleration(this, lllllllllllllIIIlIIllIllIIIllIlI, lllllllllllllIIIlIIllIllIIlIIIll, lllllllllllllIIIlIIllIllIIIllIll);
                        }
                    }
                    ++lllllllllllllIIIlIIllIllIIIlIlll;
                }
                ++lllllllllllllIIIlIIllIllIIIllIII;
            }
            ++lllllllllllllIIIlIIllIllIIIllIIl;
        }
        if (lllIllIIlIIllII(lllIllIIlIllIII(lllllllllllllIIIlIIllIllIIIllIll.lengthVector(), 0.0)) && lllIllIIlIIIIIl(lllllllllllllIIIlIIllIllIIlIIIll.isPushedByWater() ? 1 : 0)) {
            lllllllllllllIIIlIIllIllIIIllIll = lllllllllllllIIIlIIllIllIIIllIll.normalize();
            final double lllllllllllllIIIlIIllIllIIIlIIll = 0.014;
            lllllllllllllIIIlIIllIllIIlIIIll.motionX += lllllllllllllIIIlIIllIllIIIllIll.xCoord * lllllllllllllIIIlIIllIllIIIlIIll;
            lllllllllllllIIIlIIllIllIIlIIIll.motionY += lllllllllllllIIIlIIllIllIIIllIll.yCoord * lllllllllllllIIIlIIllIllIIIlIIll;
            lllllllllllllIIIlIIllIllIIlIIIll.motionZ += lllllllllllllIIIlIIllIllIIIllIll.zCoord * lllllllllllllIIIlIIllIllIIIlIIll;
        }
        return lllllllllllllIIIlIIllIllIIIlllII;
    }
    
    public void setTotalWorldTime(final long lllllllllllllIIIlIIlIllIlIIIIIlI) {
        this.worldInfo.setWorldTotalTime(lllllllllllllIIIlIIlIllIlIIIIIlI);
    }
    
    public String getDebugLoadedEntities() {
        return String.valueOf(new StringBuilder(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[37]]).append(this.loadedEntityList.size()));
    }
    
    public int getLightFor(final EnumSkyBlock lllllllllllllIIIlIIlllllIllllIlI, BlockPos lllllllllllllIIIlIIlllllIllllIIl) {
        if (lllIllIIlIIlllI(((Vec3i)lllllllllllllIIIlIIlllllIllllIIl).getY())) {
            lllllllllllllIIIlIIlllllIllllIIl = new BlockPos(((Vec3i)lllllllllllllIIIlIIlllllIllllIIl).getX(), World.lIlIlIIlIlIllI[5], ((Vec3i)lllllllllllllIIIlIIlllllIllllIIl).getZ());
        }
        if (lllIllIIlIIIllI(this.isValid((BlockPos)lllllllllllllIIIlIIlllllIllllIIl) ? 1 : 0)) {
            return lllllllllllllIIIlIIlllllIllllIlI.defaultLightValue;
        }
        if (lllIllIIlIIIllI(this.isBlockLoaded((BlockPos)lllllllllllllIIIlIIlllllIllllIIl) ? 1 : 0)) {
            return lllllllllllllIIIlIIlllllIllllIlI.defaultLightValue;
        }
        final Chunk lllllllllllllIIIlIIlllllIlllllII = this.getChunkFromBlockCoords((BlockPos)lllllllllllllIIIlIIlllllIllllIIl);
        return lllllllllllllIIIlIIlllllIlllllII.getLightFor(lllllllllllllIIIlIIlllllIllllIlI, (BlockPos)lllllllllllllIIIlIIlllllIllllIIl);
    }
    
    private static int lllIllIIlIlIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public List<NextTickListEntry> func_175712_a(final StructureBoundingBox lllllllllllllIIIlIIllIIIIlIIlIll, final boolean lllllllllllllIIIlIIllIIIIlIIlIlI) {
        return null;
    }
    
    public WorldBorder getWorldBorder() {
        return this.worldBorder;
    }
    
    public boolean setBlockToAir(final BlockPos lllllllllllllIIIlIlIIIIIIllllIII) {
        return this.setBlockState(lllllllllllllIIIlIlIIIIIIllllIII, Blocks.air.getDefaultState(), World.lIlIlIIlIlIllI[13]);
    }
    
    public boolean isAnyLiquid(final AxisAlignedBB lllllllllllllIIIlIIllIllIllllIIl) {
        final int lllllllllllllIIIlIIllIllIllllIII = MathHelper.floor_double(lllllllllllllIIIlIIllIllIllllIIl.minX);
        final int lllllllllllllIIIlIIllIllIlllIlll = MathHelper.floor_double(lllllllllllllIIIlIIllIllIllllIIl.maxX);
        final int lllllllllllllIIIlIIllIllIlllIllI = MathHelper.floor_double(lllllllllllllIIIlIIllIllIllllIIl.minY);
        final int lllllllllllllIIIlIIllIllIlllIlIl = MathHelper.floor_double(lllllllllllllIIIlIIllIllIllllIIl.maxY);
        final int lllllllllllllIIIlIIllIllIlllIlII = MathHelper.floor_double(lllllllllllllIIIlIIllIllIllllIIl.minZ);
        final int lllllllllllllIIIlIIllIllIlllIIll = MathHelper.floor_double(lllllllllllllIIIlIIllIllIllllIIl.maxZ);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIIllIllIlllIIlI = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIIllIllIlllIIIl = lllllllllllllIIIlIIllIllIllllIII;
        "".length();
        if ((0xBA ^ 0xA6 ^ (0x9E ^ 0x86)) <= 0) {
            return ((28 + 75 - 10 + 71 ^ 26 + 117 - 121 + 141) & (92 + 178 - 123 + 51 ^ 160 + 91 - 152 + 94 ^ -" ".length())) != 0x0;
        }
        while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIllIlllIIIl, lllllllllllllIIIlIIllIllIlllIlll)) {
            int lllllllllllllIIIlIIllIllIlllIIII = lllllllllllllIIIlIIllIllIlllIllI;
            "".length();
            if (null != null) {
                return ((0x36 ^ 0x17 ^ (0x2E ^ 0x7)) & (49 + 51 - 79 + 133 ^ 24 + 49 + 37 + 36 ^ -" ".length())) != 0x0;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIllIlllIIII, lllllllllllllIIIlIIllIllIlllIlIl)) {
                int lllllllllllllIIIlIIllIllIllIllll = lllllllllllllIIIlIIllIllIlllIlII;
                "".length();
                if (null != null) {
                    return ((131 + 28 - 97 + 70 ^ 10 + 14 + 87 + 67) & (0x5F ^ 0x25 ^ (0xC7 ^ 0x8B) ^ -" ".length())) != 0x0;
                }
                while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIllIllIllll, lllllllllllllIIIlIIllIllIlllIIll)) {
                    final Block lllllllllllllIIIlIIllIllIllIlllI = this.getBlockState(lllllllllllllIIIlIIllIllIlllIIlI.func_181079_c(lllllllllllllIIIlIIllIllIlllIIIl, lllllllllllllIIIlIIllIllIlllIIII, lllllllllllllIIIlIIllIllIllIllll)).getBlock();
                    if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllIllIllIlllI.getMaterial().isLiquid() ? 1 : 0)) {
                        return World.lIlIlIIlIlIllI[3] != 0;
                    }
                    ++lllllllllllllIIIlIIllIllIllIllll;
                }
                ++lllllllllllllIIIlIIllIllIlllIIII;
            }
            ++lllllllllllllIIIlIIllIllIlllIIIl;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public void removeTileEntity(final BlockPos lllllllllllllIIIlIIllIlIIIIIllII) {
        final TileEntity lllllllllllllIIIlIIllIlIIIIIlllI = this.getTileEntity(lllllllllllllIIIlIIllIlIIIIIllII);
        if (lllIllIIlIlIIIl(lllllllllllllIIIlIIllIlIIIIIlllI) && lllIllIIlIIIIIl(this.processingLoadedTiles ? 1 : 0)) {
            lllllllllllllIIIlIIllIlIIIIIlllI.invalidate();
            this.addedTileEntityList.remove(lllllllllllllIIIlIIllIlIIIIIlllI);
            "".length();
            "".length();
            if (-(0x35 ^ 0x30) >= 0) {
                return;
            }
        }
        else {
            if (lllIllIIlIlIIIl(lllllllllllllIIIlIIllIlIIIIIlllI)) {
                this.addedTileEntityList.remove(lllllllllllllIIIlIIllIlIIIIIlllI);
                "".length();
                this.loadedTileEntityList.remove(lllllllllllllIIIlIIllIlIIIIIlllI);
                "".length();
                this.tickableTileEntities.remove(lllllllllllllIIIlIIllIlIIIIIlllI);
                "".length();
            }
            this.getChunkFromBlockCoords(lllllllllllllIIIlIIllIlIIIIIllII).removeTileEntity(lllllllllllllIIIlIIllIlIIIIIllII);
        }
    }
    
    public void notifyLightSet(final BlockPos lllllllllllllIIIlIIlllllIllIIlII) {
        int lllllllllllllIIIlIIlllllIllIIIll = World.lIlIlIIlIlIllI[5];
        "".length();
        if ((0x7D ^ 0x79) < 0) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllllIllIIIll, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIlllllIllIIIll).notifyLightSet(lllllllllllllIIIlIIlllllIllIIlII);
            ++lllllllllllllIIIlIIlllllIllIIIll;
        }
    }
    
    protected void updateWeather() {
        if (lllIllIIlIIIllI(this.provider.getHasNoSky() ? 1 : 0) && lllIllIIlIIIllI(this.isRemote ? 1 : 0)) {
            int lllllllllllllIIIlIIllIIlllIIIIll = this.worldInfo.getCleanWeatherTime();
            if (lllIllIIlIIllII(lllllllllllllIIIlIIllIIlllIIIIll)) {
                --lllllllllllllIIIlIIllIIlllIIIIll;
                this.worldInfo.setCleanWeatherTime(lllllllllllllIIIlIIllIIlllIIIIll);
                final WorldInfo worldInfo = this.worldInfo;
                int thunderTime;
                if (lllIllIIlIIIIIl(this.worldInfo.isThundering() ? 1 : 0)) {
                    thunderTime = World.lIlIlIIlIlIllI[3];
                    "".length();
                    if (((0x6 ^ 0x17) & ~(0x3F ^ 0x2E)) <= -" ".length()) {
                        return;
                    }
                }
                else {
                    thunderTime = World.lIlIlIIlIlIllI[6];
                }
                worldInfo.setThunderTime(thunderTime);
                final WorldInfo worldInfo2 = this.worldInfo;
                int rainTime;
                if (lllIllIIlIIIIIl(this.worldInfo.isRaining() ? 1 : 0)) {
                    rainTime = World.lIlIlIIlIlIllI[3];
                    "".length();
                    if (((0xAE ^ 0xA2) & ~(0x3A ^ 0x36)) < -" ".length()) {
                        return;
                    }
                }
                else {
                    rainTime = World.lIlIlIIlIlIllI[6];
                }
                worldInfo2.setRainTime(rainTime);
            }
            int lllllllllllllIIIlIIllIIlllIIIIlI = this.worldInfo.getThunderTime();
            if (lllIllIIllIIIlI(lllllllllllllIIIlIIllIIlllIIIIlI)) {
                if (lllIllIIlIIIIIl(this.worldInfo.isThundering() ? 1 : 0)) {
                    this.worldInfo.setThunderTime(this.rand.nextInt(World.lIlIlIIlIlIllI[2]) + World.lIlIlIIlIlIllI[38]);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    this.worldInfo.setThunderTime(this.rand.nextInt(World.lIlIlIIlIlIllI[39]) + World.lIlIlIIlIlIllI[2]);
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                }
            }
            else {
                --lllllllllllllIIIlIIllIIlllIIIIlI;
                this.worldInfo.setThunderTime(lllllllllllllIIIlIIllIIlllIIIIlI);
                if (lllIllIIllIIIlI(lllllllllllllIIIlIIllIIlllIIIIlI)) {
                    final WorldInfo worldInfo3 = this.worldInfo;
                    int thundering;
                    if (lllIllIIlIIIIIl(this.worldInfo.isThundering() ? 1 : 0)) {
                        thundering = World.lIlIlIIlIlIllI[5];
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        thundering = World.lIlIlIIlIlIllI[3];
                    }
                    worldInfo3.setThundering((boolean)(thundering != 0));
                }
            }
            this.prevThunderingStrength = this.thunderingStrength;
            if (lllIllIIlIIIIIl(this.worldInfo.isThundering() ? 1 : 0)) {
                this.thunderingStrength += (float)0.01;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.thunderingStrength -= (float)0.01;
            }
            this.thunderingStrength = MathHelper.clamp_float(this.thunderingStrength, 0.0f, 1.0f);
            int lllllllllllllIIIlIIllIIlllIIIIIl = this.worldInfo.getRainTime();
            if (lllIllIIllIIIlI(lllllllllllllIIIlIIllIIlllIIIIIl)) {
                if (lllIllIIlIIIIIl(this.worldInfo.isRaining() ? 1 : 0)) {
                    this.worldInfo.setRainTime(this.rand.nextInt(World.lIlIlIIlIlIllI[2]) + World.lIlIlIIlIlIllI[2]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.worldInfo.setRainTime(this.rand.nextInt(World.lIlIlIIlIlIllI[39]) + World.lIlIlIIlIlIllI[2]);
                    "".length();
                    if (((0x5D ^ 0x74 ^ (0xAF ^ 0x8B)) & (0x72 ^ 0x3C ^ (0x4 ^ 0x47) ^ -" ".length())) < -" ".length()) {
                        return;
                    }
                }
            }
            else {
                --lllllllllllllIIIlIIllIIlllIIIIIl;
                this.worldInfo.setRainTime(lllllllllllllIIIlIIllIIlllIIIIIl);
                if (lllIllIIllIIIlI(lllllllllllllIIIlIIllIIlllIIIIIl)) {
                    final WorldInfo worldInfo4 = this.worldInfo;
                    int raining;
                    if (lllIllIIlIIIIIl(this.worldInfo.isRaining() ? 1 : 0)) {
                        raining = World.lIlIlIIlIlIllI[5];
                        "".length();
                        if ("  ".length() >= "   ".length()) {
                            return;
                        }
                    }
                    else {
                        raining = World.lIlIlIIlIlIllI[3];
                    }
                    worldInfo4.setRaining((boolean)(raining != 0));
                }
            }
            this.prevRainingStrength = this.rainingStrength;
            if (lllIllIIlIIIIIl(this.worldInfo.isRaining() ? 1 : 0)) {
                this.rainingStrength += (float)0.01;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.rainingStrength -= (float)0.01;
            }
            this.rainingStrength = MathHelper.clamp_float(this.rainingStrength, 0.0f, 1.0f);
        }
    }
    
    public void markBlockRangeForRenderUpdate(final BlockPos lllllllllllllIIIlIlIIIIIIIllIlII, final BlockPos lllllllllllllIIIlIlIIIIIIIllIIll) {
        this.markBlockRangeForRenderUpdate(lllllllllllllIIIlIlIIIIIIIllIlII.getX(), lllllllllllllIIIlIlIIIIIIIllIlII.getY(), lllllllllllllIIIlIlIIIIIIIllIlII.getZ(), lllllllllllllIIIlIlIIIIIIIllIIll.getX(), lllllllllllllIIIlIlIIIIIIIllIIll.getY(), lllllllllllllIIIlIlIIIIIIIllIIll.getZ());
    }
    
    public BlockPos getTopSolidOrLiquidBlock(final BlockPos lllllllllllllIIIlIIlllIIlIllIIlI) {
        final Chunk lllllllllllllIIIlIIlllIIlIllIIIl = this.getChunkFromBlockCoords(lllllllllllllIIIlIIlllIIlIllIIlI);
        BlockPos lllllllllllllIIIlIIlllIIlIllIIII = new BlockPos(lllllllllllllIIIlIIlllIIlIllIIlI.getX(), lllllllllllllIIIlIIlllIIlIllIIIl.getTopFilledSegment() + World.lIlIlIIlIlIllI[21], lllllllllllllIIIlIIlllIIlIllIIlI.getZ());
        "".length();
        if ("  ".length() > (0x62 ^ 0x66)) {
            return null;
        }
        while (!lllIllIIlIIlllI(lllllllllllllIIIlIIlllIIlIllIIII.getY())) {
            final BlockPos lllllllllllllIIIlIIlllIIlIlIllll = lllllllllllllIIIlIIlllIIlIllIIII.down();
            final Material lllllllllllllIIIlIIlllIIlIlIlllI = lllllllllllllIIIlIIlllIIlIllIIIl.getBlock(lllllllllllllIIIlIIlllIIlIlIllll).getMaterial();
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIlIlIlllI.blocksMovement() ? 1 : 0) && lllIllIIlIIlIll(lllllllllllllIIIlIIlllIIlIlIlllI, Material.leaves)) {
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
                break;
            }
            else {
                lllllllllllllIIIlIIlllIIlIllIIII = lllllllllllllIIIlIIlllIIlIlIllll;
            }
        }
        return lllllllllllllIIIlIIlllIIlIllIIII;
    }
    
    public boolean extinguishFire(final EntityPlayer lllllllllllllIIIlIIllIlIIIllllII, BlockPos lllllllllllllIIIlIIllIlIIIlllIll, final EnumFacing lllllllllllllIIIlIIllIlIIIlllIlI) {
        lllllllllllllIIIlIIllIlIIIlllIll = (int)((BlockPos)lllllllllllllIIIlIIllIlIIIlllIll).offset(lllllllllllllIIIlIIllIlIIIlllIlI);
        if (lllIllIIlIIIlIl(this.getBlockState((BlockPos)lllllllllllllIIIlIIllIlIIIlllIll).getBlock(), Blocks.fire)) {
            this.playAuxSFXAtEntity(lllllllllllllIIIlIIllIlIIIllllII, World.lIlIlIIlIlIllI[36], (BlockPos)lllllllllllllIIIlIIllIlIIIlllIll, World.lIlIlIIlIlIllI[5]);
            this.setBlockToAir((BlockPos)lllllllllllllIIIlIIllIlIIIlllIll);
            "".length();
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public boolean tickUpdates(final boolean lllllllllllllIIIlIIllIIIIlIlIllI) {
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    private static int lllIllIIllIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean addTileEntity(final TileEntity lllllllllllllIIIlIIlllIIIlIllllI) {
        final boolean lllllllllllllIIIlIIlllIIIllIIIII = this.loadedTileEntityList.add(lllllllllllllIIIlIIlllIIIlIllllI);
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIIIllIIIII ? 1 : 0) && lllIllIIlIIIIIl((lllllllllllllIIIlIIlllIIIlIllllI instanceof ITickable) ? 1 : 0)) {
            this.tickableTileEntities.add(lllllllllllllIIIlIIlllIIIlIllllI);
            "".length();
        }
        return lllllllllllllIIIlIIlllIIIllIIIII;
    }
    
    public Random setRandomSeed(final int lllllllllllllIIIlIIlIlIllIlIIlII, final int lllllllllllllIIIlIIlIlIllIlIIIll, final int lllllllllllllIIIlIIlIlIllIlIIIlI) {
        final long lllllllllllllIIIlIIlIlIllIlIIIIl = lllllllllllllIIIlIIlIlIllIlIIlII * 341873128712L + lllllllllllllIIIlIIlIlIllIlIIIll * 132897987541L + this.getWorldInfo().getSeed() + lllllllllllllIIIlIIlIlIllIlIIIlI;
        this.rand.setSeed(lllllllllllllIIIlIIlIlIllIlIIIIl);
        return this.rand;
    }
    
    public boolean isAnyPlayerWithinRangeAt(final double lllllllllllllIIIlIIlIllIlIllIIII, final double lllllllllllllIIIlIIlIllIlIlIllll, final double lllllllllllllIIIlIIlIllIlIlIlllI, final double lllllllllllllIIIlIIlIllIlIlIIlIl) {
        int lllllllllllllIIIlIIlIllIlIlIllII = World.lIlIlIIlIlIllI[5];
        "".length();
        if ("  ".length() >= (0xC7 ^ 0xC3)) {
            return ((0x28 ^ 0x72) & ~(0xE5 ^ 0xBF)) != 0x0;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIllIlIlIllII, this.playerEntities.size())) {
            final EntityPlayer lllllllllllllIIIlIIlIllIlIlIlIll = this.playerEntities.get(lllllllllllllIIIlIIlIllIlIlIllII);
            if (lllIllIIlIIIIIl(EntitySelectors.NOT_SPECTATING.apply((Object)lllllllllllllIIIlIIlIllIlIlIlIll) ? 1 : 0)) {
                final double lllllllllllllIIIlIIlIllIlIlIlIlI = lllllllllllllIIIlIIlIllIlIlIlIll.getDistanceSq(lllllllllllllIIIlIIlIllIlIllIIII, lllllllllllllIIIlIIlIllIlIlIllll, lllllllllllllIIIlIIlIllIlIlIlllI);
                if (!lllIllIIlIIIlII(lllIllIIllIlIlI(lllllllllllllIIIlIIlIllIlIlIIlIl, 0.0)) || lllIllIIlIIlllI(lllIllIIllIlIlI(lllllllllllllIIIlIIlIllIlIlIlIlI, lllllllllllllIIIlIIlIllIlIlIIlIl * lllllllllllllIIIlIIlIllIlIlIIlIl))) {
                    return World.lIlIlIIlIlIllI[3] != 0;
                }
            }
            ++lllllllllllllIIIlIIlIllIlIlIllII;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public void playRecord(final BlockPos lllllllllllllIIIlIIllllIIlllIllI, final String lllllllllllllIIIlIIllllIIllllIIl) {
        int lllllllllllllIIIlIIllllIIllllIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllllIIllllIII, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIllllIIllllIII).playRecord(lllllllllllllIIIlIIllllIIllllIIl, lllllllllllllIIIlIIllllIIlllIllI);
            ++lllllllllllllIIIlIIllllIIllllIII;
        }
    }
    
    private static int lllIllIIlIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void forceBlockUpdateTick(final Block lllllllllllllIIIlIIllIIlIlllIllI, final BlockPos lllllllllllllIIIlIIllIIlIlllIIIl, final Random lllllllllllllIIIlIIllIIlIlllIIII) {
        this.scheduledUpdatesAreImmediate = (World.lIlIlIIlIlIllI[3] != 0);
        lllllllllllllIIIlIIllIIlIlllIllI.updateTick(this, lllllllllllllIIIlIIllIIlIlllIIIl, this.getBlockState(lllllllllllllIIIlIIllIIlIlllIIIl), lllllllllllllIIIlIIllIIlIlllIIII);
        this.scheduledUpdatesAreImmediate = (World.lIlIlIIlIlIllI[5] != 0);
    }
    
    private static boolean lllIllIIlIIIIll(final int lllllllllllllIIIlIIlIlIIllIlIIll, final int lllllllllllllIIIlIIlIlIIllIlIIlI) {
        return lllllllllllllIIIlIIlIlIIllIlIIll < lllllllllllllIIIlIIlIlIIllIlIIlI;
    }
    
    public void spawnParticle(final EnumParticleTypes lllllllllllllIIIlIIllllIIlIIllIl, final boolean lllllllllllllIIIlIIllllIIlIIIIlI, final double lllllllllllllIIIlIIllllIIlIIlIll, final double lllllllllllllIIIlIIllllIIlIIlIlI, final double lllllllllllllIIIlIIllllIIIllllll, final double lllllllllllllIIIlIIllllIIIlllllI, final double lllllllllllllIIIlIIllllIIIllllIl, final double lllllllllllllIIIlIIllllIIIllllII, final int... lllllllllllllIIIlIIllllIIlIIIlIl) {
        this.spawnParticle(lllllllllllllIIIlIIllllIIlIIllIl.getParticleID(), lllllllllllllIIIlIIllllIIlIIllIl.getShouldIgnoreRange() | lllllllllllllIIIlIIllllIIlIIIIlI, lllllllllllllIIIlIIllllIIlIIlIll, lllllllllllllIIIlIIllllIIlIIlIlI, lllllllllllllIIIlIIllllIIIllllll, lllllllllllllIIIlIIllllIIIlllllI, lllllllllllllIIIlIIllllIIIllllIl, lllllllllllllIIIlIIllllIIIllllII, lllllllllllllIIIlIIllllIIlIIIlIl);
    }
    
    public boolean canSeeSky(final BlockPos lllllllllllllIIIlIIllllllllIIlll) {
        return this.getChunkFromBlockCoords(lllllllllllllIIIlIIllllllllIIlll).canSeeSky(lllllllllllllIIIlIIllllllllIIlll);
    }
    
    public List<NextTickListEntry> getPendingBlockUpdates(final Chunk lllllllllllllIIIlIIllIIIIlIlIIII, final boolean lllllllllllllIIIlIIllIIIIlIIlllI) {
        return null;
    }
    
    public EntityPlayer getClosestPlayer(final double lllllllllllllIIIlIIlIllIllIIllII, final double lllllllllllllIIIlIIlIllIllIIlIll, final double lllllllllllllIIIlIIlIllIllIIIIII, final double lllllllllllllIIIlIIlIllIlIllllll) {
        double lllllllllllllIIIlIIlIllIllIIlIII = -1.0;
        EntityPlayer lllllllllllllIIIlIIlIllIllIIIlll = null;
        int lllllllllllllIIIlIIlIllIllIIIllI = World.lIlIlIIlIlIllI[5];
        "".length();
        if (-(0x80 ^ 0x84) >= 0) {
            return null;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIllIllIIIllI, this.playerEntities.size())) {
            final EntityPlayer lllllllllllllIIIlIIlIllIllIIIlIl = this.playerEntities.get(lllllllllllllIIIlIIlIllIllIIIllI);
            if (lllIllIIlIIIIIl(EntitySelectors.NOT_SPECTATING.apply((Object)lllllllllllllIIIlIIlIllIllIIIlIl) ? 1 : 0)) {
                final double lllllllllllllIIIlIIlIllIllIIIlII = lllllllllllllIIIlIIlIllIllIIIlIl.getDistanceSq(lllllllllllllIIIlIIlIllIllIIllII, lllllllllllllIIIlIIlIllIllIIlIll, lllllllllllllIIIlIIlIllIllIIIIII);
                if ((!lllIllIIlIIIlII(lllIllIIllIlIII(lllllllllllllIIIlIIlIllIlIllllll, 0.0)) || lllIllIIlIIlllI(lllIllIIllIlIII(lllllllllllllIIIlIIlIllIllIIIlII, lllllllllllllIIIlIIlIllIlIllllll * lllllllllllllIIIlIIlIllIlIllllll))) && (!lllIllIIlIIIIIl(lllIllIIllIlIIl(lllllllllllllIIIlIIlIllIllIIlIII, -1.0)) || lllIllIIlIIlllI(lllIllIIllIlIII(lllllllllllllIIIlIIlIllIllIIIlII, lllllllllllllIIIlIIlIllIllIIlIII)))) {
                    lllllllllllllIIIlIIlIllIllIIlIII = lllllllllllllIIIlIIlIllIllIIIlII;
                    lllllllllllllIIIlIIlIllIllIIIlll = lllllllllllllIIIlIIlIllIllIIIlIl;
                }
            }
            ++lllllllllllllIIIlIIlIllIllIIIllI;
        }
        return lllllllllllllIIIlIIlIllIllIIIlll;
    }
    
    protected abstract IChunkProvider createChunkProvider();
    
    protected void onEntityRemoved(final Entity lllllllllllllIIIlIIlllIlllllIIIl) {
        int lllllllllllllIIIlIIlllIlllllIIll = World.lIlIlIIlIlIllI[5];
        "".length();
        if ((0x66 ^ 0x62) <= " ".length()) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIlllllIIll, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIlllIlllllIIll).onEntityRemoved(lllllllllllllIIIlIIlllIlllllIIIl);
            ++lllllllllllllIIIlIIlllIlllllIIll;
        }
    }
    
    public int getLightFromNeighborsFor(final EnumSkyBlock lllllllllllllIIIlIIllllllIIIlIlI, BlockPos lllllllllllllIIIlIIllllllIIIlIIl) {
        if (lllIllIIlIIIIIl(this.provider.getHasNoSky() ? 1 : 0) && lllIllIIlIIIlIl(lllllllllllllIIIlIIllllllIIIlIlI, EnumSkyBlock.SKY)) {
            return World.lIlIlIIlIlIllI[5];
        }
        if (lllIllIIlIIlllI(lllllllllllllIIIlIIllllllIIIlIIl.getY())) {
            lllllllllllllIIIlIIllllllIIIlIIl = new BlockPos(lllllllllllllIIIlIIllllllIIIlIIl.getX(), World.lIlIlIIlIlIllI[5], lllllllllllllIIIlIIllllllIIIlIIl.getZ());
        }
        if (lllIllIIlIIIllI(this.isValid(lllllllllllllIIIlIIllllllIIIlIIl) ? 1 : 0)) {
            return lllllllllllllIIIlIIllllllIIIlIlI.defaultLightValue;
        }
        if (lllIllIIlIIIllI(this.isBlockLoaded(lllllllllllllIIIlIIllllllIIIlIIl) ? 1 : 0)) {
            return lllllllllllllIIIlIIllllllIIIlIlI.defaultLightValue;
        }
        if (lllIllIIlIIIIIl(this.getBlockState(lllllllllllllIIIlIIllllllIIIlIIl).getBlock().getUseNeighborBrightness() ? 1 : 0)) {
            int lllllllllllllIIIlIIllllllIIlIIIl = this.getLightFor(lllllllllllllIIIlIIllllllIIIlIlI, lllllllllllllIIIlIIllllllIIIlIIl.up());
            final int lllllllllllllIIIlIIllllllIIlIIII = this.getLightFor(lllllllllllllIIIlIIllllllIIIlIlI, lllllllllllllIIIlIIllllllIIIlIIl.east());
            final int lllllllllllllIIIlIIllllllIIIllll = this.getLightFor(lllllllllllllIIIlIIllllllIIIlIlI, lllllllllllllIIIlIIllllllIIIlIIl.west());
            final int lllllllllllllIIIlIIllllllIIIlllI = this.getLightFor(lllllllllllllIIIlIIllllllIIIlIlI, lllllllllllllIIIlIIllllllIIIlIIl.south());
            final int lllllllllllllIIIlIIllllllIIIllIl = this.getLightFor(lllllllllllllIIIlIIllllllIIIlIlI, lllllllllllllIIIlIIllllllIIIlIIl.north());
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllllllIIlIIII, lllllllllllllIIIlIIllllllIIlIIIl)) {
                lllllllllllllIIIlIIllllllIIlIIIl = lllllllllllllIIIlIIllllllIIlIIII;
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllllllIIIllll, lllllllllllllIIIlIIllllllIIlIIIl)) {
                lllllllllllllIIIlIIllllllIIlIIIl = lllllllllllllIIIlIIllllllIIIllll;
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllllllIIIlllI, lllllllllllllIIIlIIllllllIIlIIIl)) {
                lllllllllllllIIIlIIllllllIIlIIIl = lllllllllllllIIIlIIllllllIIIlllI;
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIllllllIIIllIl, lllllllllllllIIIlIIllllllIIlIIIl)) {
                lllllllllllllIIIlIIllllllIIlIIIl = lllllllllllllIIIlIIllllllIIIllIl;
            }
            return lllllllllllllIIIlIIllllllIIlIIIl;
        }
        final Chunk lllllllllllllIIIlIIllllllIIIllII = this.getChunkFromBlockCoords(lllllllllllllIIIlIIllllllIIIlIIl);
        return lllllllllllllIIIlIIllllllIIIllII.getLightFor(lllllllllllllIIIlIIllllllIIIlIlI, lllllllllllllIIIlIIllllllIIIlIIl);
    }
    
    protected void setActivePlayerChunksAndCheckLight() {
        this.activeChunkSet.clear();
        this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[40]]);
        int lllllllllllllIIIlIIllIIllIllIIll = World.lIlIlIIlIlIllI[5];
        "".length();
        if (" ".length() >= "   ".length()) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIIllIllIIll, this.playerEntities.size())) {
            final EntityPlayer lllllllllllllIIIlIIllIIllIllIIlI = this.playerEntities.get(lllllllllllllIIIlIIllIIllIllIIll);
            final int lllllllllllllIIIlIIllIIllIllIIIl = MathHelper.floor_double(lllllllllllllIIIlIIllIIllIllIIlI.posX / 16.0);
            final int lllllllllllllIIIlIIllIIllIllIIII = MathHelper.floor_double(lllllllllllllIIIlIIllIIllIllIIlI.posZ / 16.0);
            final int lllllllllllllIIIlIIllIIllIlIllll = this.getRenderDistanceChunks();
            int lllllllllllllIIIlIIllIIllIlIlllI = -lllllllllllllIIIlIIllIIllIlIllll;
            "".length();
            if (((177 + 148 - 308 + 161 ^ 88 + 127 - 112 + 29) & (0xFF ^ 0xC5 ^ (0xA8 ^ 0xA4) ^ -" ".length())) < ((0x76 ^ 0x7 ^ (0xC0 ^ 0x9E)) & (90 + 65 - 67 + 62 ^ 75 + 163 - 211 + 158 ^ -" ".length()))) {
                return;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIIllIlIlllI, lllllllllllllIIIlIIllIIllIlIllll)) {
                int lllllllllllllIIIlIIllIIllIlIllIl = -lllllllllllllIIIlIIllIIllIlIllll;
                "".length();
                if ((0x6D ^ 0x5 ^ (0xCF ^ 0xA3)) < -" ".length()) {
                    return;
                }
                while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIIllIlIllIl, lllllllllllllIIIlIIllIIllIlIllll)) {
                    this.activeChunkSet.add(new ChunkCoordIntPair(lllllllllllllIIIlIIllIIllIlIlllI + lllllllllllllIIIlIIllIIllIllIIIl, lllllllllllllIIIlIIllIIllIlIllIl + lllllllllllllIIIlIIllIIllIllIIII));
                    "".length();
                    ++lllllllllllllIIIlIIllIIllIlIllIl;
                }
                ++lllllllllllllIIIlIIllIIllIlIlllI;
            }
            ++lllllllllllllIIIlIIllIIllIllIIll;
        }
        this.theProfiler.endSection();
        if (lllIllIIlIIllII(this.ambientTickCountdown)) {
            this.ambientTickCountdown -= World.lIlIlIIlIlIllI[3];
        }
        this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[41]]);
        if (lllIllIIlIIIllI(this.playerEntities.isEmpty() ? 1 : 0)) {
            final int lllllllllllllIIIlIIllIIllIlIllII = this.rand.nextInt(this.playerEntities.size());
            final EntityPlayer lllllllllllllIIIlIIllIIllIlIlIll = this.playerEntities.get(lllllllllllllIIIlIIllIIllIlIllII);
            final int lllllllllllllIIIlIIllIIllIlIlIlI = MathHelper.floor_double(lllllllllllllIIIlIIllIIllIlIlIll.posX) + this.rand.nextInt(World.lIlIlIIlIlIllI[25]) - World.lIlIlIIlIlIllI[15];
            final int lllllllllllllIIIlIIllIIllIlIlIIl = MathHelper.floor_double(lllllllllllllIIIlIIllIIllIlIlIll.posY) + this.rand.nextInt(World.lIlIlIIlIlIllI[25]) - World.lIlIlIIlIlIllI[15];
            final int lllllllllllllIIIlIIllIIllIlIlIII = MathHelper.floor_double(lllllllllllllIIIlIIllIIllIlIlIll.posZ) + this.rand.nextInt(World.lIlIlIIlIlIllI[25]) - World.lIlIlIIlIlIllI[15];
            this.checkLight(new BlockPos(lllllllllllllIIIlIIllIIllIlIlIlI, lllllllllllllIIIlIIllIIllIlIlIIl, lllllllllllllIIIlIIllIIllIlIlIII));
            "".length();
        }
        this.theProfiler.endSection();
    }
    
    private boolean isWater(final BlockPos lllllllllllllIIIlIIllIIlIlIIlIII) {
        if (lllIllIIlIIIlIl(this.getBlockState(lllllllllllllIIIlIIllIIlIlIIlIII).getBlock().getMaterial(), Material.water)) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    private boolean isAreaLoaded(int lllllllllllllIIIlIlIIIIIlIllIlll, final int lllllllllllllIIIlIlIIIIIllIIIIII, int lllllllllllllIIIlIlIIIIIlIllIlIl, int lllllllllllllIIIlIlIIIIIlIllIlII, final int lllllllllllllIIIlIlIIIIIlIllIIll, int lllllllllllllIIIlIlIIIIIlIllIIlI, final boolean lllllllllllllIIIlIlIIIIIlIlllIll) {
        if (!lllIllIIlIIIlII(lllllllllllllIIIlIlIIIIIlIllIIll) || !lllIllIIlIIIIll(lllllllllllllIIIlIlIIIIIllIIIIII, World.lIlIlIIlIlIllI[11])) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        lllllllllllllIIIlIlIIIIIlIllIlll >>= World.lIlIlIIlIlIllI[12];
        lllllllllllllIIIlIlIIIIIlIllIlIl >>= World.lIlIlIIlIlIllI[12];
        lllllllllllllIIIlIlIIIIIlIllIlII >>= World.lIlIlIIlIlIllI[12];
        lllllllllllllIIIlIlIIIIIlIllIIlI >>= (byte)World.lIlIlIIlIlIllI[12];
        int lllllllllllllIIIlIlIIIIIlIlllIlI = lllllllllllllIIIlIlIIIIIlIllIlll;
        "".length();
        if (((0xFF ^ 0xB3) & ~(0x5C ^ 0x10)) < -" ".length()) {
            return ((0x12 ^ 0x56) & ~(0x4C ^ 0x8)) != 0x0;
        }
        while (!lllIllIIlIIIlll(lllllllllllllIIIlIlIIIIIlIlllIlI, lllllllllllllIIIlIlIIIIIlIllIlII)) {
            int lllllllllllllIIIlIlIIIIIlIlllIIl = lllllllllllllIIIlIlIIIIIlIllIlIl;
            "".length();
            if (-(0xA0 ^ 0xA5) >= 0) {
                return ((0x45 ^ 0x40) & ~(0xBF ^ 0xBA)) != 0x0;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIlIIIIIlIlllIIl, lllllllllllllIIIlIlIIIIIlIllIIlI)) {
                if (lllIllIIlIIIllI(this.isChunkLoaded(lllllllllllllIIIlIlIIIIIlIlllIlI, lllllllllllllIIIlIlIIIIIlIlllIIl, lllllllllllllIIIlIlIIIIIlIlllIll) ? 1 : 0)) {
                    return World.lIlIlIIlIlIllI[5] != 0;
                }
                ++lllllllllllllIIIlIlIIIIIlIlllIIl;
            }
            ++lllllllllllllIIIlIlIIIIIlIlllIlI;
        }
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public EntityPlayer getClosestPlayerToEntity(final Entity lllllllllllllIIIlIIlIllIllIlllII, final double lllllllllllllIIIlIIlIllIllIllIll) {
        return this.getClosestPlayer(lllllllllllllIIIlIIlIllIllIlllII.posX, lllllllllllllIIIlIIlIllIllIlllII.posY, lllllllllllllIIIlIIlIllIllIlllII.posZ, lllllllllllllIIIlIIlIllIllIllIll);
    }
    
    public Explosion newExplosion(final Entity lllllllllllllIIIlIIllIlIIlllllIl, final double lllllllllllllIIIlIIllIlIlIIIIlIl, final double lllllllllllllIIIlIIllIlIlIIIIlII, final double lllllllllllllIIIlIIllIlIIllllIlI, final float lllllllllllllIIIlIIllIlIlIIIIIlI, final boolean lllllllllllllIIIlIIllIlIIllllIII, final boolean lllllllllllllIIIlIIllIlIlIIIIIII) {
        final Explosion lllllllllllllIIIlIIllIlIIlllllll = new Explosion(this, lllllllllllllIIIlIIllIlIIlllllIl, lllllllllllllIIIlIIllIlIlIIIIlIl, lllllllllllllIIIlIIllIlIlIIIIlII, lllllllllllllIIIlIIllIlIIllllIlI, lllllllllllllIIIlIIllIlIlIIIIIlI, lllllllllllllIIIlIIllIlIIllllIII, lllllllllllllIIIlIIllIlIlIIIIIII);
        lllllllllllllIIIlIIllIlIIlllllll.doExplosionA();
        lllllllllllllIIIlIIllIlIIlllllll.doExplosionB((boolean)(World.lIlIlIIlIlIllI[3] != 0));
        return lllllllllllllIIIlIIllIlIIlllllll;
    }
    
    public void markBlockForUpdate(final BlockPos lllllllllllllIIIlIlIIIIIIlIllIIl) {
        int lllllllllllllIIIlIlIIIIIIlIllIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if ((0x3F ^ 0x3B) != (0x3D ^ 0x39)) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIlIIIIIIlIllIII, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIlIIIIIIlIllIII).markBlockForUpdate(lllllllllllllIIIlIlIIIIIIlIllIIl);
            ++lllllllllllllIIIlIlIIIIIIlIllIII;
        }
    }
    
    public void markBlocksDirtyVertical(final int lllllllllllllIIIlIlIIIIIIlIIIlII, final int lllllllllllllIIIlIlIIIIIIIllllII, int lllllllllllllIIIlIlIIIIIIIlllIll, int lllllllllllllIIIlIlIIIIIIIlllIlI) {
        if (lllIllIIlIIIlll((int)lllllllllllllIIIlIlIIIIIIIlllIll, lllllllllllllIIIlIlIIIIIIIlllIlI)) {
            final int lllllllllllllIIIlIlIIIIIIlIIIIII = lllllllllllllIIIlIlIIIIIIIlllIlI;
            lllllllllllllIIIlIlIIIIIIIlllIlI = (int)lllllllllllllIIIlIlIIIIIIIlllIll;
            lllllllllllllIIIlIlIIIIIIIlllIll = lllllllllllllIIIlIlIIIIIIlIIIIII;
        }
        if (lllIllIIlIIIllI(this.provider.getHasNoSky() ? 1 : 0)) {
            int lllllllllllllIIIlIlIIIIIIIllllll = (int)lllllllllllllIIIlIlIIIIIIIlllIll;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIlIIIIIIIllllll, lllllllllllllIIIlIlIIIIIIIlllIlI)) {
                this.checkLightFor(EnumSkyBlock.SKY, new BlockPos(lllllllllllllIIIlIlIIIIIIlIIIlII, lllllllllllllIIIlIlIIIIIIIllllll, lllllllllllllIIIlIlIIIIIIIllllII));
                "".length();
                ++lllllllllllllIIIlIlIIIIIIIllllll;
            }
        }
        this.markBlockRangeForRenderUpdate(lllllllllllllIIIlIlIIIIIIlIIIlII, (int)lllllllllllllIIIlIlIIIIIIIlllIll, lllllllllllllIIIlIlIIIIIIIllllII, lllllllllllllIIIlIlIIIIIIlIIIlII, lllllllllllllIIIlIlIIIIIIIlllIlI, lllllllllllllIIIlIlIIIIIIIllllII);
    }
    
    public WorldInfo getWorldInfo() {
        return this.worldInfo;
    }
    
    private static String lllIlIlllllIIll(final String lllllllllllllIIIlIIlIlIIlllIIIll, final String lllllllllllllIIIlIIlIlIIlllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIlIlIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIlIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIlIlIIlllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIlIlIIlllIIlIl.init(World.lIlIlIIlIlIllI[6], lllllllllllllIIIlIIlIlIIlllIIllI);
            return new String(lllllllllllllIIIlIIlIlIIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIlIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIlIlIIlllIIlII) {
            lllllllllllllIIIlIIlIlIIlllIIlII.printStackTrace();
            return null;
        }
    }
    
    private boolean isValid(final BlockPos lllllllllllllIIIlIlIIIIlIIIlllII) {
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIlIIIIlIIIlllII.getX(), World.lIlIlIIlIlIllI[9]) && lllIllIIlIIIIlI(lllllllllllllIIIlIlIIIIlIIIlllII.getZ(), World.lIlIlIIlIlIllI[9]) && lllIllIIlIIIIll(lllllllllllllIIIlIlIIIIlIIIlllII.getX(), World.lIlIlIIlIlIllI[10]) && lllIllIIlIIIIll(lllllllllllllIIIlIlIIIIlIIIlllII.getZ(), World.lIlIlIIlIlIllI[10]) && lllIllIIlIIIlII(lllllllllllllIIIlIlIIIIlIIIlllII.getY()) && lllIllIIlIIIIll(lllllllllllllIIIlIlIIIIlIIIlllII.getY(), World.lIlIlIIlIlIllI[11])) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    private static boolean lllIllIIlIIlllI(final int lllllllllllllIIIlIIlIlIIlIllIllI) {
        return lllllllllllllIIIlIIlIlIIlIllIllI < 0;
    }
    
    public boolean isBlockNormalCube(final BlockPos lllllllllllllIIIlIIllIIllllIIllI, final boolean lllllllllllllIIIlIIllIIllllIIIII) {
        if (lllIllIIlIIIllI(this.isValid(lllllllllllllIIIlIIllIIllllIIllI) ? 1 : 0)) {
            return lllllllllllllIIIlIIllIIllllIIIII;
        }
        final Chunk lllllllllllllIIIlIIllIIllllIIlII = this.chunkProvider.provideChunk(lllllllllllllIIIlIIllIIllllIIllI);
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllIIllllIIlII.isEmpty() ? 1 : 0)) {
            return lllllllllllllIIIlIIllIIllllIIIII;
        }
        final Block lllllllllllllIIIlIIllIIllllIIIll = this.getBlockState(lllllllllllllIIIlIIllIIllllIIllI).getBlock();
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllIIllllIIIll.getMaterial().isOpaque() ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIllIIllllIIIll.isFullCube() ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public <T extends Entity> List<T> getPlayers(final Class<? extends T> lllllllllllllIIIlIIlIllllllIllIl, final Predicate<? super T> lllllllllllllIIIlIIlIllllllIllII) {
        final List<T> lllllllllllllIIIlIIlIllllllIlIll = (List<T>)Lists.newArrayList();
        final int lllllllllllllIIIlIIlIllllllIIlII = (int)this.playerEntities.iterator();
        "".length();
        if (((165 + 70 - 233 + 166 ^ 133 + 85 - 168 + 95) & (0x1A ^ 0x62 ^ (0xE2 ^ 0xA3) ^ -" ".length())) == " ".length()) {
            return null;
        }
        while (!lllIllIIlIIIllI(((Iterator)lllllllllllllIIIlIIlIllllllIIlII).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIIlIIlIllllllIlIlI = ((Iterator<Entity>)lllllllllllllIIIlIIlIllllllIIlII).next();
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllllllIllIl.isAssignableFrom(lllllllllllllIIIlIIlIllllllIlIlI.getClass()) ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllllllIllII.apply((Object)lllllllllllllIIIlIIlIllllllIlIlI) ? 1 : 0)) {
                lllllllllllllIIIlIIlIllllllIlIll.add((T)lllllllllllllIIIlIIlIllllllIlIlI);
                "".length();
            }
        }
        return lllllllllllllIIIlIIlIllllllIlIll;
    }
    
    public boolean isBlockPowered(final BlockPos lllllllllllllIIIlIIlIllIllllIllI) {
        int n;
        if (lllIllIIlIIllII(this.getRedstonePower(lllllllllllllIIIlIIlIllIllllIllI.down(), EnumFacing.DOWN))) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if (((0x5F ^ 0x9) & ~(0x91 ^ 0xC7)) > (0x18 ^ 0x1C)) {
                return ((0x40 ^ 0x51) & ~(0x73 ^ 0x62)) != 0x0;
            }
        }
        else if (lllIllIIlIIllII(this.getRedstonePower(lllllllllllllIIIlIIlIllIllllIllI.up(), EnumFacing.UP))) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if (null != null) {
                return ((0x4E ^ 0x50) & ~(0x45 ^ 0x5B)) != 0x0;
            }
        }
        else if (lllIllIIlIIllII(this.getRedstonePower(lllllllllllllIIIlIIlIllIllllIllI.north(), EnumFacing.NORTH))) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0xE7 ^ 0x91 ^ (0x79 ^ 0x3C)) & (0xD4 ^ 0x82 ^ (0x1A ^ 0x7F) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIIlIIllII(this.getRedstonePower(lllllllllllllIIIlIIlIllIllllIllI.south(), EnumFacing.SOUTH))) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if (((0x8D ^ 0xAA) & ~(0x14 ^ 0x33)) > 0) {
                return ((0x54 ^ 0x5B) & ~(0x5E ^ 0x51)) != 0x0;
            }
        }
        else if (lllIllIIlIIllII(this.getRedstonePower(lllllllllllllIIIlIIlIllIllllIllI.west(), EnumFacing.WEST))) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if ("   ".length() < -" ".length()) {
                return ((0x18 ^ 0x3A) & ~(0x7A ^ 0x58)) != 0x0;
            }
        }
        else if (lllIllIIlIIllII(this.getRedstonePower(lllllllllllllIIIlIIlIllIllllIllI.east(), EnumFacing.EAST))) {
            n = World.lIlIlIIlIlIllI[3];
            "".length();
            if (-(0xB ^ 0xF) >= 0) {
                return ((0xC0 ^ 0x83) & ~(0x18 ^ 0x5B)) != 0x0;
            }
        }
        else {
            n = World.lIlIlIIlIlIllI[5];
        }
        return n != 0;
    }
    
    public double getHorizon() {
        double n;
        if (lllIllIIlIIIlIl(this.worldInfo.getTerrainType(), WorldType.FLAT)) {
            n = 0.0;
            "".length();
            if ("  ".length() > "  ".length()) {
                return 0.0;
            }
        }
        else {
            n = 63.0;
        }
        return n;
    }
    
    public boolean isAreaLoaded(final BlockPos lllllllllllllIIIlIlIIIIlIIIIIIIl, final int lllllllllllllIIIlIlIIIIIllllllIl) {
        return this.isAreaLoaded(lllllllllllllIIIlIlIIIIlIIIIIIIl, lllllllllllllIIIlIlIIIIIllllllIl, (boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    public void sendQuittingDisconnectingPacket() {
    }
    
    public IChunkProvider getChunkProvider() {
        return this.chunkProvider;
    }
    
    public int getUniqueDataId(final String lllllllllllllIIIlIIlIlIllllIIIll) {
        return this.mapStorage.getUniqueDataId(lllllllllllllIIIlIIlIlIllllIIIll);
    }
    
    public float getCelestialAngleRadians(final float lllllllllllllIIIlIIlllIIlllIllIl) {
        final float lllllllllllllIIIlIIlllIIlllIllll = this.getCelestialAngle(lllllllllllllIIIlIIlllIIlllIllIl);
        return lllllllllllllIIIlIIlllIIlllIllll * 3.1415927f * 2.0f;
    }
    
    public boolean isMaterialInBB(final AxisAlignedBB lllllllllllllIIIlIIllIlIllllIIIl, final Material lllllllllllllIIIlIIllIlIlllIIIll) {
        final int lllllllllllllIIIlIIllIlIlllIllll = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllllIIIl.minX);
        final int lllllllllllllIIIlIIllIlIlllIlllI = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllllIIIl.maxX + 1.0);
        final int lllllllllllllIIIlIIllIlIlllIllIl = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllllIIIl.minY);
        final int lllllllllllllIIIlIIllIlIlllIllII = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllllIIIl.maxY + 1.0);
        final int lllllllllllllIIIlIIllIlIlllIlIll = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllllIIIl.minZ);
        final int lllllllllllllIIIlIIllIlIlllIlIlI = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllllIIIl.maxZ + 1.0);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIIllIlIlllIlIIl = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIIllIlIlllIlIII = lllllllllllllIIIlIIllIlIlllIllll;
        "".length();
        if ("  ".length() > "  ".length()) {
            return ((0xAE ^ 0xA3) & ~(0x92 ^ 0x9F)) != 0x0;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIlllIlIII, lllllllllllllIIIlIIllIlIlllIlllI)) {
            int lllllllllllllIIIlIIllIlIlllIIlll = lllllllllllllIIIlIIllIlIlllIllIl;
            "".length();
            if (((34 + 96 - 16 + 101 ^ 122 + 50 - 132 + 99) & (92 + 206 - 294 + 238 ^ 72 + 86 - 135 + 151 ^ -" ".length()) & (((0x10 ^ 0x36 ^ (0x24 ^ 0x1E)) & (0x9E ^ 0x90 ^ (0x57 ^ 0x45) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return ((0xD2 ^ 0x93 ^ (0x58 ^ 0x8)) & (0xBD ^ 0xB2 ^ (0x22 ^ 0x3C) ^ -" ".length())) != 0x0;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIlllIIlll, lllllllllllllIIIlIIllIlIlllIllII)) {
                int lllllllllllllIIIlIIllIlIlllIIllI = lllllllllllllIIIlIIllIlIlllIlIll;
                "".length();
                if (((0x70 ^ 0x78 ^ (0xDD ^ 0x92)) & (210 + 18 - 128 + 149 ^ 29 + 78 + 13 + 70 ^ -" ".length())) != 0x0) {
                    return ((86 + 65 - 122 + 146 ^ 70 + 139 - 86 + 18) & (29 + 74 - 102 + 131 ^ 144 + 123 - 239 + 138 ^ -" ".length()) & (((0x3A ^ 0x57 ^ (0x41 ^ 0x10)) & (0x77 ^ 0x24 ^ (0xE2 ^ 0x8D) ^ -" ".length())) ^ -" ".length())) != 0x0;
                }
                while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIlllIIllI, lllllllllllllIIIlIIllIlIlllIlIlI)) {
                    if (lllIllIIlIIIlIl(this.getBlockState(lllllllllllllIIIlIIllIlIlllIlIIl.func_181079_c(lllllllllllllIIIlIIllIlIlllIlIII, lllllllllllllIIIlIIllIlIlllIIlll, lllllllllllllIIIlIIllIlIlllIIllI)).getBlock().getMaterial(), lllllllllllllIIIlIIllIlIlllIIIll)) {
                        return World.lIlIlIIlIlIllI[3] != 0;
                    }
                    ++lllllllllllllIIIlIIllIlIlllIIllI;
                }
                ++lllllllllllllIIIlIIllIlIlllIIlll;
            }
            ++lllllllllllllIIIlIIllIlIlllIlIII;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public void playSoundAtEntity(final Entity lllllllllllllIIIlIIllllIlIllllII, final String lllllllllllllIIIlIIllllIlIllIlIl, final float lllllllllllllIIIlIIllllIlIlllIlI, final float lllllllllllllIIIlIIllllIlIlllIIl) {
        int lllllllllllllIIIlIIllllIlIlllIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (" ".length() >= (0xA3 ^ 0xA7)) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllllIlIlllIII, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIllllIlIlllIII).playSound(lllllllllllllIIIlIIllllIlIllIlIl, lllllllllllllIIIlIIllllIlIllllII.posX, lllllllllllllIIIlIIllllIlIllllII.posY, lllllllllllllIIIlIIllllIlIllllII.posZ, lllllllllllllIIIlIIllllIlIlllIlI, lllllllllllllIIIlIIllllIlIlllIIl);
            ++lllllllllllllIIIlIIllllIlIlllIII;
        }
    }
    
    public void loadEntities(final Collection<Entity> lllllllllllllIIIlIIlIlllIlllIlIl) {
        this.loadedEntityList.addAll(lllllllllllllIIIlIIlIlllIlllIlIl);
        "".length();
        final Exception lllllllllllllIIIlIIlIlllIlllIIll = (Exception)lllllllllllllIIIlIIlIlllIlllIlIl.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIllIIlIIIllI(((Iterator)lllllllllllllIIIlIIlIlllIlllIIll).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIIlIIlIlllIlllIlll = ((Iterator<Entity>)lllllllllllllIIIlIIlIlllIlllIIll).next();
            this.onEntityAdded(lllllllllllllIIIlIIlIlllIlllIlll);
        }
    }
    
    public void setSkylightSubtracted(final int lllllllllllllIIIlIIlIlIlIIlllIIl) {
        this.skylightSubtracted = lllllllllllllIIIlIIlIlIlIIlllIIl;
    }
    
    private static int lllIllIIllIIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public DifficultyInstance getDifficultyForLocation(final BlockPos lllllllllllllIIIlIIlIlIlIlIIlIIl) {
        long lllllllllllllIIIlIIlIlIlIlIIlIII = 0L;
        float lllllllllllllIIIlIIlIlIlIlIIIlll = 0.0f;
        if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlIlIlIlIIlIIl) ? 1 : 0)) {
            lllllllllllllIIIlIIlIlIlIlIIIlll = this.getCurrentMoonPhaseFactor();
            lllllllllllllIIIlIIlIlIlIlIIlIII = this.getChunkFromBlockCoords(lllllllllllllIIIlIIlIlIlIlIIlIIl).getInhabitedTime();
        }
        return new DifficultyInstance(this.getDifficulty(), this.getWorldTime(), lllllllllllllIIIlIIlIlIlIlIIlIII, lllllllllllllIIIlIIlIlIlIlIIIlll);
    }
    
    public VillageCollection getVillageCollection() {
        return this.villageCollectionObj;
    }
    
    public void playAuxSFX(final int lllllllllllllIIIlIIlIlIlllIIlllI, final BlockPos lllllllllllllIIIlIIlIlIlllIIllIl, final int lllllllllllllIIIlIIlIlIlllIIllII) {
        this.playAuxSFXAtEntity(null, lllllllllllllIIIlIIlIlIlllIIlllI, lllllllllllllIIIlIIlIlIlllIIllIl, lllllllllllllIIIlIIlIlIlllIIllII);
    }
    
    public int func_181545_F() {
        return this.field_181546_a;
    }
    
    public boolean setBlockState(final BlockPos lllllllllllllIIIlIlIIIIIIllIIIlI, final IBlockState lllllllllllllIIIlIlIIIIIIllIIIIl) {
        return this.setBlockState(lllllllllllllIIIlIlIIIIIIllIIIlI, lllllllllllllIIIlIlIIIIIIllIIIIl, World.lIlIlIIlIlIllI[13]);
    }
    
    public void markChunkDirty(final BlockPos lllllllllllllIIIlIIlIllllIIIllII, final TileEntity lllllllllllllIIIlIIlIllllIIIlllI) {
        if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlIllllIIIllII) ? 1 : 0)) {
            this.getChunkFromBlockCoords(lllllllllllllIIIlIIlIllllIIIllII).setChunkModified();
        }
    }
    
    public boolean isAreaLoaded(final StructureBoundingBox lllllllllllllIIIlIlIIIIIllIlIllI) {
        return this.isAreaLoaded(lllllllllllllIIIlIlIIIIIllIlIllI, (boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    public EntityPlayer getPlayerEntityByUUID(final UUID lllllllllllllIIIlIIlIllIlIIlIIII) {
        int lllllllllllllIIIlIIlIllIlIIIllll = World.lIlIlIIlIlIllI[5];
        "".length();
        if ("   ".length() == " ".length()) {
            return null;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIllIlIIIllll, this.playerEntities.size())) {
            final EntityPlayer lllllllllllllIIIlIIlIllIlIIIlllI = this.playerEntities.get(lllllllllllllIIIlIIlIllIlIIIllll);
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllIlIIlIIII.equals(lllllllllllllIIIlIIlIllIlIIIlllI.getUniqueID()) ? 1 : 0)) {
                return lllllllllllllIIIlIIlIllIlIIIlllI;
            }
            ++lllllllllllllIIIlIIlIllIlIIIllll;
        }
        return null;
    }
    
    public boolean isDaytime() {
        if (lllIllIIlIIIIll(this.skylightSubtracted, World.lIlIlIIlIlIllI[12])) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public void updateEntity(final Entity lllllllllllllIIIlIIlllIIIlIIIIII) {
        this.updateEntityWithOptionalForce(lllllllllllllIIIlIIlllIIIlIIIIII, (boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    public World init() {
        return this;
    }
    
    private static int lllIllIIlIllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void setSpawnPoint(final BlockPos lllllllllllllIIIlIIlIllIIllIIlll) {
        this.worldInfo.setSpawn(lllllllllllllIIIlIIlIllIIllIIlll);
    }
    
    public BlockPos getSpawnPoint() {
        BlockPos lllllllllllllIIIlIIlIllIIllIllIl = new BlockPos(this.worldInfo.getSpawnX(), this.worldInfo.getSpawnY(), this.worldInfo.getSpawnZ());
        if (lllIllIIlIIIllI(this.getWorldBorder().contains(lllllllllllllIIIlIIlIllIIllIllIl) ? 1 : 0)) {
            lllllllllllllIIIlIIlIllIIllIllIl = this.getHeight(new BlockPos(this.getWorldBorder().getCenterX(), 0.0, this.getWorldBorder().getCenterZ()));
        }
        return lllllllllllllIIIlIIlIllIIllIllIl;
    }
    
    public boolean isThundering() {
        if (lllIllIIlIIllII(lllIllIIllIlIll(this.getThunderStrength(1.0f), 0.9))) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    @Override
    public BiomeGenBase getBiomeGenForCoords(final BlockPos lllllllllllllIIIlIlIIIIlIIllIllI) {
        if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIlIIIIlIIllIllI) ? 1 : 0)) {
            final Chunk lllllllllllllIIIlIlIIIIlIIlllIll = this.getChunkFromBlockCoords(lllllllllllllIIIlIlIIIIlIIllIllI);
            try {
                return lllllllllllllIIIlIlIIIIlIIlllIll.getBiome(lllllllllllllIIIlIlIIIIlIIllIllI, this.provider.getWorldChunkManager());
            }
            catch (Throwable lllllllllllllIIIlIlIIIIlIIlllIlI) {
                final CrashReport lllllllllllllIIIlIlIIIIlIIlllIIl = CrashReport.makeCrashReport(lllllllllllllIIIlIlIIIIlIIlllIlI, World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[5]]);
                final CrashReportCategory lllllllllllllIIIlIlIIIIlIIlllIII = lllllllllllllIIIlIlIIIIlIIlllIIl.makeCategory(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[3]]);
                lllllllllllllIIIlIlIIIIlIIlllIII.addCrashSectionCallable(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[6]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return CrashReportCategory.getCoordinateInfo(lllllllllllllIIIlIlIIIIlIIllIllI);
                    }
                });
                throw new ReportedException(lllllllllllllIIIlIlIIIIlIIlllIIl);
            }
        }
        return this.provider.getWorldChunkManager().getBiomeGenerator(lllllllllllllIIIlIlIIIIlIIllIllI, BiomeGenBase.plains);
    }
    
    public void markBlockRangeForRenderUpdate(final int lllllllllllllIIIlIlIIIIIIIlIIllI, final int lllllllllllllIIIlIlIIIIIIIIlllIl, final int lllllllllllllIIIlIlIIIIIIIlIIlII, final int lllllllllllllIIIlIlIIIIIIIlIIIll, final int lllllllllllllIIIlIlIIIIIIIlIIIlI, final int lllllllllllllIIIlIlIIIIIIIIllIIl) {
        int lllllllllllllIIIlIlIIIIIIIlIIIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if ("   ".length() <= ((0x24 ^ 0x7C) & ~(0x9E ^ 0xC6))) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIlIIIIIIIlIIIII, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIlIIIIIIIlIIIII).markBlockRangeForRenderUpdate(lllllllllllllIIIlIlIIIIIIIlIIllI, lllllllllllllIIIlIlIIIIIIIIlllIl, lllllllllllllIIIlIlIIIIIIIlIIlII, lllllllllllllIIIlIlIIIIIIIlIIIll, lllllllllllllIIIlIlIIIIIIIlIIIlI, lllllllllllllIIIlIlIIIIIIIIllIIl);
            ++lllllllllllllIIIlIlIIIIIIIlIIIII;
        }
    }
    
    private static int lllIllIIlIllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public EntityPlayer getPlayerEntityByName(final String lllllllllllllIIIlIIlIllIlIIllIII) {
        int lllllllllllllIIIlIIlIllIlIIllIll = World.lIlIlIIlIlIllI[5];
        "".length();
        if ("  ".length() <= -" ".length()) {
            return null;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIllIlIIllIll, this.playerEntities.size())) {
            final EntityPlayer lllllllllllllIIIlIIlIllIlIIllIlI = this.playerEntities.get(lllllllllllllIIIlIIlIllIlIIllIll);
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllIlIIllIII.equals(lllllllllllllIIIlIIlIllIlIIllIlI.getName()) ? 1 : 0)) {
                return lllllllllllllIIIlIIlIllIlIIllIlI;
            }
            ++lllllllllllllIIIlIIlIllIlIIllIll;
        }
        return null;
    }
    
    public int getLightFromNeighbors(final BlockPos lllllllllllllIIIlIIlllllllIIllIl) {
        return this.getLight(lllllllllllllIIIlIIlllllllIIllIl, (boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    public boolean isSpawnChunk(final int lllllllllllllIIIlIIlIlIlIIIlIlIl, final int lllllllllllllIIIlIIlIlIlIIIlIlII) {
        final BlockPos lllllllllllllIIIlIIlIlIlIIIllIlI = this.getSpawnPoint();
        final int lllllllllllllIIIlIIlIlIlIIIllIIl = lllllllllllllIIIlIIlIlIlIIIlIlIl * World.lIlIlIIlIlIllI[21] + World.lIlIlIIlIlIllI[7] - lllllllllllllIIIlIIlIlIlIIIllIlI.getX();
        final int lllllllllllllIIIlIIlIlIlIIIllIII = lllllllllllllIIIlIIlIlIlIIIlIlII * World.lIlIlIIlIlIllI[21] + World.lIlIlIIlIlIllI[7] - lllllllllllllIIIlIIlIlIlIIIllIlI.getZ();
        final int lllllllllllllIIIlIIlIlIlIIIlIlll = World.lIlIlIIlIlIllI[54];
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlIlIIIllIIl, -lllllllllllllIIIlIIlIlIlIIIlIlll) && lllIllIIlIIllIl(lllllllllllllIIIlIIlIlIlIIIllIIl, lllllllllllllIIIlIIlIlIlIIIlIlll) && lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlIlIIIllIII, -lllllllllllllIIIlIIlIlIlIIIlIlll) && lllIllIIlIIllIl(lllllllllllllIIIlIIlIlIlIIIllIII, lllllllllllllIIIlIIlIlIlIIIlIlll)) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    private static int lllIllIIllIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean canLightningStrike(final BlockPos lllllllllllllIIIlIIlIllIIIIIlIII) {
        if (lllIllIIlIIIllI(this.isRaining() ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        if (lllIllIIlIIIllI(this.canSeeSky(lllllllllllllIIIlIIlIllIIIIIlIII) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        if (lllIllIIlIIIlll(this.getPrecipitationHeight(lllllllllllllIIIlIIlIllIIIIIlIII).getY(), lllllllllllllIIIlIIlIllIIIIIlIII.getY())) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        final BiomeGenBase lllllllllllllIIIlIIlIllIIIIIlIlI = this.getBiomeGenForCoords(lllllllllllllIIIlIIlIllIIIIIlIII);
        int canSpawnLightningBolt;
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlIllIIIIIlIlI.getEnableSnow() ? 1 : 0)) {
            canSpawnLightningBolt = World.lIlIlIIlIlIllI[5];
            "".length();
            if ((0x40 ^ 0x58 ^ (0x85 ^ 0x99)) > (0x55 ^ 0x71 ^ (0x75 ^ 0x55))) {
                return ((21 + 145 - 99 + 127 ^ 66 + 34 - 98 + 151) & (0x4E ^ 0x12 ^ (0xB3 ^ 0xB4) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIIlIIIIIl(this.canSnowAt(lllllllllllllIIIlIIlIllIIIIIlIII, (boolean)(World.lIlIlIIlIlIllI[5] != 0)) ? 1 : 0)) {
            canSpawnLightningBolt = World.lIlIlIIlIlIllI[5];
            "".length();
            if ("   ".length() >= (0x12 ^ 0x16)) {
                return ((0x66 ^ 0x6F) & ~(0x22 ^ 0x2B)) != 0x0;
            }
        }
        else {
            canSpawnLightningBolt = (lllllllllllllIIIlIIlIllIIIIIlIlI.canSpawnLightningBolt() ? 1 : 0);
        }
        return canSpawnLightningBolt != 0;
    }
    
    private static int lllIllIIllIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void setThunderStrength(final float lllllllllllllIIIlIIlIllIIIlIIlII) {
        this.prevThunderingStrength = lllllllllllllIIIlIIlIllIIIlIIlII;
        this.thunderingStrength = lllllllllllllIIIlIIlIllIIIlIIlII;
    }
    
    public void addTileEntities(final Collection<TileEntity> lllllllllllllIIIlIIlllIIIlIIlIll) {
        if (lllIllIIlIIIIIl(this.processingLoadedTiles ? 1 : 0)) {
            this.addedTileEntityList.addAll(lllllllllllllIIIlIIlllIIIlIIlIll);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final double lllllllllllllIIIlIIlllIIIlIIlIIl = (double)lllllllllllllIIIlIIlllIIIlIIlIll.iterator();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lllIllIIlIIIllI(((Iterator)lllllllllllllIIIlIIlllIIIlIIlIIl).hasNext() ? 1 : 0)) {
                final TileEntity lllllllllllllIIIlIIlllIIIlIIllIl = ((Iterator<TileEntity>)lllllllllllllIIIlIIlllIIIlIIlIIl).next();
                this.loadedTileEntityList.add(lllllllllllllIIIlIIlllIIIlIIllIl);
                "".length();
                if (lllIllIIlIIIIIl((lllllllllllllIIIlIIlllIIIlIIllIl instanceof ITickable) ? 1 : 0)) {
                    this.tickableTileEntities.add(lllllllllllllIIIlIIlllIIIlIIllIl);
                    "".length();
                }
            }
        }
    }
    
    public boolean isRaining() {
        if (lllIllIIlIIllII(lllIllIIllIllII(this.getRainStrength(1.0f), 0.2))) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public List<Entity> getEntitiesWithinAABBExcludingEntity(final Entity lllllllllllllIIIlIIllIIIIlIIIIll, final AxisAlignedBB lllllllllllllIIIlIIllIIIIlIIIIIl) {
        return this.getEntitiesInAABBexcluding(lllllllllllllIIIlIIllIIIIlIIIIll, lllllllllllllIIIlIIllIIIIlIIIIIl, EntitySelectors.NOT_SPECTATING);
    }
    
    public int getStrongPower(final BlockPos lllllllllllllIIIlIIlIlllIIllIlIl) {
        int lllllllllllllIIIlIIlIlllIIllIlII = World.lIlIlIIlIlIllI[5];
        lllllllllllllIIIlIIlIlllIIllIlII = Math.max(lllllllllllllIIIlIIlIlllIIllIlII, this.getStrongPower(lllllllllllllIIIlIIlIlllIIllIlIl.down(), EnumFacing.DOWN));
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlllIIllIlII, World.lIlIlIIlIlIllI[18])) {
            return lllllllllllllIIIlIIlIlllIIllIlII;
        }
        lllllllllllllIIIlIIlIlllIIllIlII = Math.max(lllllllllllllIIIlIIlIlllIIllIlII, this.getStrongPower(lllllllllllllIIIlIIlIlllIIllIlIl.up(), EnumFacing.UP));
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlllIIllIlII, World.lIlIlIIlIlIllI[18])) {
            return lllllllllllllIIIlIIlIlllIIllIlII;
        }
        lllllllllllllIIIlIIlIlllIIllIlII = Math.max(lllllllllllllIIIlIIlIlllIIllIlII, this.getStrongPower(lllllllllllllIIIlIIlIlllIIllIlIl.north(), EnumFacing.NORTH));
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlllIIllIlII, World.lIlIlIIlIlIllI[18])) {
            return lllllllllllllIIIlIIlIlllIIllIlII;
        }
        lllllllllllllIIIlIIlIlllIIllIlII = Math.max(lllllllllllllIIIlIIlIlllIIllIlII, this.getStrongPower(lllllllllllllIIIlIIlIlllIIllIlIl.south(), EnumFacing.SOUTH));
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlllIIllIlII, World.lIlIlIIlIlIllI[18])) {
            return lllllllllllllIIIlIIlIlllIIllIlII;
        }
        lllllllllllllIIIlIIlIlllIIllIlII = Math.max(lllllllllllllIIIlIIlIlllIIllIlII, this.getStrongPower(lllllllllllllIIIlIIlIlllIIllIlIl.west(), EnumFacing.WEST));
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlllIIllIlII, World.lIlIlIIlIlIllI[18])) {
            return lllllllllllllIIIlIIlIlllIIllIlII;
        }
        lllllllllllllIIIlIIlIlllIIllIlII = Math.max(lllllllllllllIIIlIIlIlllIIllIlII, this.getStrongPower(lllllllllllllIIIlIIlIlllIIllIlIl.east(), EnumFacing.EAST));
        int n;
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlllIIllIlII, World.lIlIlIIlIlIllI[18])) {
            n = lllllllllllllIIIlIIlIlllIIllIlII;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return (0x68 ^ 0x2A) & ~(0x74 ^ 0x36);
            }
        }
        else {
            n = lllllllllllllIIIlIIlIlllIIllIlII;
        }
        return n;
    }
    
    public Calendar getCurrentDate() {
        if (lllIllIIlIIIllI(lllIllIIllIllll(this.getTotalWorldTime() % 600L, 0L))) {
            this.theCalendar.setTimeInMillis(MinecraftServer.getCurrentTimeMillis());
        }
        return this.theCalendar;
    }
    
    public WorldSavedData loadItemData(final Class<? extends WorldSavedData> lllllllllllllIIIlIIlIlIllllIllIl, final String lllllllllllllIIIlIIlIlIllllIllII) {
        return this.mapStorage.loadData(lllllllllllllIIIlIIlIlIllllIllIl, lllllllllllllIIIlIIlIlIllllIllII);
    }
    
    public long getSeed() {
        return this.worldInfo.getSeed();
    }
    
    public void setLastLightningBolt(final int lllllllllllllIIIlIIlIlIlIIlIlllI) {
        this.lastLightningBolt = lllllllllllllIIIlIIlIlIlIIlIlllI;
    }
    
    public void sendBlockBreakProgress(final int lllllllllllllIIIlIIlIlIlIllllIll, final BlockPos lllllllllllllIIIlIIlIlIlIllllIlI, final int lllllllllllllIIIlIIlIlIlIllllIIl) {
        int lllllllllllllIIIlIIlIlIlIllllIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlIlIllllIII, this.worldAccesses.size())) {
            final IWorldAccess lllllllllllllIIIlIIlIlIlIlllIlll = this.worldAccesses.get(lllllllllllllIIIlIIlIlIlIllllIII);
            lllllllllllllIIIlIIlIlIlIlllIlll.sendBlockBreakProgress(lllllllllllllIIIlIIlIlIlIllllIll, lllllllllllllIIIlIIlIlIlIllllIlI, lllllllllllllIIIlIIlIlIlIllllIIl);
            ++lllllllllllllIIIlIIlIlIlIllllIII;
        }
    }
    
    private void spawnParticle(final int lllllllllllllIIIlIIllllIIIlIlllI, final boolean lllllllllllllIIIlIIllllIIIlIIIIl, final double lllllllllllllIIIlIIllllIIIlIIIII, final double lllllllllllllIIIlIIllllIIIIlllll, final double lllllllllllllIIIlIIllllIIIlIlIlI, final double lllllllllllllIIIlIIllllIIIIlllIl, final double lllllllllllllIIIlIIllllIIIIlllII, final double lllllllllllllIIIlIIllllIIIlIIlll, final int... lllllllllllllIIIlIIllllIIIlIIllI) {
        int lllllllllllllIIIlIIllllIIIlIIlIl = World.lIlIlIIlIlIllI[5];
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllllIIIlIIlIl, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIllllIIIlIIlIl).spawnParticle(lllllllllllllIIIlIIllllIIIlIlllI, lllllllllllllIIIlIIllllIIIlIIIIl, lllllllllllllIIIlIIllllIIIlIIIII, lllllllllllllIIIlIIllllIIIIlllll, lllllllllllllIIIlIIllllIIIlIlIlI, lllllllllllllIIIlIIllllIIIIlllIl, lllllllllllllIIIlIIllllIIIIlllII, lllllllllllllIIIlIIllllIIIlIIlll, lllllllllllllIIIlIIllllIIIlIIllI);
            ++lllllllllllllIIIlIIllllIIIlIIlIl;
        }
    }
    
    public void scheduleUpdate(final BlockPos lllllllllllllIIIlIIlllIIlIIllIlI, final Block lllllllllllllIIIlIIlllIIlIIllIIl, final int lllllllllllllIIIlIIlllIIlIIllIII) {
    }
    
    public List<Entity> getEntitiesInAABBexcluding(final Entity lllllllllllllIIIlIIllIIIIIIllIlI, final AxisAlignedBB lllllllllllllIIIlIIllIIIIIIIlllI, final Predicate<? super Entity> lllllllllllllIIIlIIllIIIIIIllIII) {
        final List<Entity> lllllllllllllIIIlIIllIIIIIIlIlll = (List<Entity>)Lists.newArrayList();
        final int lllllllllllllIIIlIIllIIIIIIlIllI = MathHelper.floor_double((lllllllllllllIIIlIIllIIIIIIIlllI.minX - 2.0) / 16.0);
        final int lllllllllllllIIIlIIllIIIIIIlIlIl = MathHelper.floor_double((lllllllllllllIIIlIIllIIIIIIIlllI.maxX + 2.0) / 16.0);
        final int lllllllllllllIIIlIIllIIIIIIlIlII = MathHelper.floor_double((lllllllllllllIIIlIIllIIIIIIIlllI.minZ - 2.0) / 16.0);
        final int lllllllllllllIIIlIIllIIIIIIlIIll = MathHelper.floor_double((lllllllllllllIIIlIIllIIIIIIIlllI.maxZ + 2.0) / 16.0);
        int lllllllllllllIIIlIIllIIIIIIlIIlI = lllllllllllllIIIlIIllIIIIIIlIllI;
        "".length();
        if ((0x6E ^ 0x6A) == 0x0) {
            return null;
        }
        while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIIIIIIlIIlI, lllllllllllllIIIlIIllIIIIIIlIlIl)) {
            int lllllllllllllIIIlIIllIIIIIIlIIIl = lllllllllllllIIIlIIllIIIIIIlIlII;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIIIIIIlIIIl, lllllllllllllIIIlIIllIIIIIIlIIll)) {
                if (lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIllIIIIIIlIIlI, lllllllllllllIIIlIIllIIIIIIlIIIl, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
                    this.getChunkFromChunkCoords(lllllllllllllIIIlIIllIIIIIIlIIlI, lllllllllllllIIIlIIllIIIIIIlIIIl).getEntitiesWithinAABBForEntity(lllllllllllllIIIlIIllIIIIIIllIlI, lllllllllllllIIIlIIllIIIIIIIlllI, lllllllllllllIIIlIIllIIIIIIlIlll, lllllllllllllIIIlIIllIIIIIIllIII);
                }
                ++lllllllllllllIIIlIIllIIIIIIlIIIl;
            }
            ++lllllllllllllIIIlIIllIIIIIIlIIlI;
        }
        return lllllllllllllIIIlIIllIIIIIIlIlll;
    }
    
    public List<AxisAlignedBB> func_147461_a(final AxisAlignedBB lllllllllllllIIIlIIlllIlIlllIIII) {
        final List<AxisAlignedBB> lllllllllllllIIIlIIlllIlIllIllll = (List<AxisAlignedBB>)Lists.newArrayList();
        final int lllllllllllllIIIlIIlllIlIllIlllI = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIlllIIII.minX);
        final int lllllllllllllIIIlIIlllIlIllIllIl = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIlllIIII.maxX + 1.0);
        final int lllllllllllllIIIlIIlllIlIllIllII = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIlllIIII.minY);
        final int lllllllllllllIIIlIIlllIlIllIlIll = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIlllIIII.maxY + 1.0);
        final int lllllllllllllIIIlIIlllIlIllIlIlI = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIlllIIII.minZ);
        final int lllllllllllllIIIlIIlllIlIllIlIIl = MathHelper.floor_double(lllllllllllllIIIlIIlllIlIlllIIII.maxZ + 1.0);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIIlllIlIllIlIII = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIIlllIlIllIIlll = lllllllllllllIIIlIIlllIlIllIlllI;
        "".length();
        if (-" ".length() >= 0) {
            return null;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIlIllIIlll, lllllllllllllIIIlIIlllIlIllIllIl)) {
            int lllllllllllllIIIlIIlllIlIllIIllI = lllllllllllllIIIlIIlllIlIllIlIlI;
            "".length();
            if (((0x6B ^ 0x49) & ~(0xF ^ 0x2D)) != ((0x20 ^ 0x61) & ~(0xE ^ 0x4F))) {
                return null;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIlIllIIllI, lllllllllllllIIIlIIlllIlIllIlIIl)) {
                if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlllIlIllIlIII.func_181079_c(lllllllllllllIIIlIIlllIlIllIIlll, World.lIlIlIIlIlIllI[8], lllllllllllllIIIlIIlllIlIllIIllI)) ? 1 : 0)) {
                    int lllllllllllllIIIlIIlllIlIllIIlIl = lllllllllllllIIIlIIlllIlIllIllII - World.lIlIlIIlIlIllI[3];
                    "".length();
                    if ("  ".length() <= 0) {
                        return null;
                    }
                    while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIlIllIIlIl, lllllllllllllIIIlIIlllIlIllIlIll)) {
                        lllllllllllllIIIlIIlllIlIllIlIII.func_181079_c(lllllllllllllIIIlIIlllIlIllIIlll, lllllllllllllIIIlIIlllIlIllIIlIl, lllllllllllllIIIlIIlllIlIllIIllI);
                        "".length();
                        IBlockState lllllllllllllIIIlIIlllIlIllIIIll = null;
                        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIlIllIIlll, World.lIlIlIIlIlIllI[9]) && lllIllIIlIIIIll(lllllllllllllIIIlIIlllIlIllIIlll, World.lIlIlIIlIlIllI[10]) && lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIlIllIIllI, World.lIlIlIIlIlIllI[9]) && lllIllIIlIIIIll(lllllllllllllIIIlIIlllIlIllIIllI, World.lIlIlIIlIlIllI[10])) {
                            final IBlockState lllllllllllllIIIlIIlllIlIllIIlII = this.getBlockState(lllllllllllllIIIlIIlllIlIllIlIII);
                            "".length();
                            if ("  ".length() <= ((95 + 139 - 172 + 78 ^ 82 + 29 - 99 + 143) & (0x1D ^ 0x1 ^ (0x1B ^ 0x10) ^ -" ".length()))) {
                                return null;
                            }
                        }
                        else {
                            lllllllllllllIIIlIIlllIlIllIIIll = Blocks.bedrock.getDefaultState();
                        }
                        lllllllllllllIIIlIIlllIlIllIIIll.getBlock().addCollisionBoxesToList(this, lllllllllllllIIIlIIlllIlIllIlIII, lllllllllllllIIIlIIlllIlIllIIIll, lllllllllllllIIIlIIlllIlIlllIIII, lllllllllllllIIIlIIlllIlIllIllll, null);
                        ++lllllllllllllIIIlIIlllIlIllIIlIl;
                    }
                }
                ++lllllllllllllIIIlIIlllIlIllIIllI;
            }
            ++lllllllllllllIIIlIIlllIlIllIIlll;
        }
        return lllllllllllllIIIlIIlllIlIllIllll;
    }
    
    protected void calculateInitialWeather() {
        if (lllIllIIlIIIIIl(this.worldInfo.isRaining() ? 1 : 0)) {
            this.rainingStrength = 1.0f;
            if (lllIllIIlIIIIIl(this.worldInfo.isThundering() ? 1 : 0)) {
                this.thunderingStrength = 1.0f;
            }
        }
    }
    
    public boolean checkLight(final BlockPos lllllllllllllIIIlIIllIIlIIlIllll) {
        boolean lllllllllllllIIIlIIllIIlIIlIlllI = World.lIlIlIIlIlIllI[5] != 0;
        if (lllIllIIlIIIllI(this.provider.getHasNoSky() ? 1 : 0)) {
            lllllllllllllIIIlIIllIIlIIlIlllI |= this.checkLightFor(EnumSkyBlock.SKY, lllllllllllllIIIlIIllIIlIIlIllll);
        }
        lllllllllllllIIIlIIllIIlIIlIlllI |= this.checkLightFor(EnumSkyBlock.BLOCK, lllllllllllllIIIlIIllIIlIIlIllll);
        return lllllllllllllIIIlIIllIIlIIlIlllI;
    }
    
    public boolean canSnowAt(final BlockPos lllllllllllllIIIlIIllIIlIIlllllI, final boolean lllllllllllllIIIlIIllIIlIIllIlll) {
        final BiomeGenBase lllllllllllllIIIlIIllIIlIIllllII = this.getBiomeGenForCoords(lllllllllllllIIIlIIllIIlIIlllllI);
        final float lllllllllllllIIIlIIllIIlIIlllIll = lllllllllllllIIIlIIllIIlIIllllII.getFloatTemperature(lllllllllllllIIIlIIllIIlIIlllllI);
        if (lllIllIIlIIllII(lllIllIIllIIlIl(lllllllllllllIIIlIIllIIlIIlllIll, 0.15f))) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        if (lllIllIIlIIIllI(lllllllllllllIIIlIIllIIlIIllIlll ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        if (lllIllIIlIIIlII(lllllllllllllIIIlIIllIIlIIlllllI.getY()) && lllIllIIlIIIIll(lllllllllllllIIIlIIllIIlIIlllllI.getY(), World.lIlIlIIlIlIllI[11]) && lllIllIIlIIIIll(this.getLightFor(EnumSkyBlock.BLOCK, lllllllllllllIIIlIIllIIlIIlllllI), World.lIlIlIIlIlIllI[24])) {
            final Block lllllllllllllIIIlIIllIIlIIlllIlI = this.getBlockState(lllllllllllllIIIlIIllIIlIIlllllI).getBlock();
            if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIIlIIlllIlI.getMaterial(), Material.air) && lllIllIIlIIIIIl(Blocks.snow_layer.canPlaceBlockAt(this, lllllllllllllIIIlIIllIIlIIlllllI) ? 1 : 0)) {
                return World.lIlIlIIlIlIllI[3] != 0;
            }
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public boolean isBlockinHighHumidity(final BlockPos lllllllllllllIIIlIIlIllIIIIIIIlI) {
        final BiomeGenBase lllllllllllllIIIlIIlIllIIIIIIIIl = this.getBiomeGenForCoords(lllllllllllllIIIlIIlIllIIIIIIIlI);
        return lllllllllllllIIIlIIlIllIIIIIIIIl.isHighHumidity();
    }
    
    public void notifyNeighborsOfStateChange(final BlockPos lllllllllllllIIIlIlIIIIIIIIlIIII, final Block lllllllllllllIIIlIlIIIIIIIIlIIlI) {
        this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIlIIII.west(), lllllllllllllIIIlIlIIIIIIIIlIIlI);
        this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIlIIII.east(), lllllllllllllIIIlIlIIIIIIIIlIIlI);
        this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIlIIII.down(), lllllllllllllIIIlIlIIIIIIIIlIIlI);
        this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIlIIII.up(), lllllllllllllIIIlIlIIIIIIIIlIIlI);
        this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIlIIII.north(), lllllllllllllIIIlIlIIIIIIIIlIIlI);
        this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIlIIII.south(), lllllllllllllIIIlIlIIIIIIIIlIIlI);
    }
    
    public float getLightBrightness(final BlockPos lllllllllllllIIIlIIlllllIlIIllIl) {
        return this.provider.getLightBrightnessTable()[this.getLightFromNeighbors(lllllllllllllIIIlIIlllllIlIIllIl)];
    }
    
    public void addWorldAccess(final IWorldAccess lllllllllllllIIIlIIlllIlllIllIII) {
        this.worldAccesses.add(lllllllllllllIIIlIIlllIlllIllIII);
        "".length();
    }
    
    protected void playMoodSoundAndCheckLight(final int lllllllllllllIIIlIIllIIllIIlIIll, final int lllllllllllllIIIlIIllIIllIIIIlll, final Chunk lllllllllllllIIIlIIllIIllIIlIIIl) {
        this.theProfiler.endStartSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[42]]);
        if (lllIllIIlIIIllI(this.ambientTickCountdown) && lllIllIIlIIIllI(this.isRemote ? 1 : 0)) {
            this.updateLCG = this.updateLCG * World.lIlIlIIlIlIllI[13] + World.lIlIlIIlIlIllI[1];
            final int lllllllllllllIIIlIIllIIllIIlIIII = this.updateLCG >> World.lIlIlIIlIlIllI[6];
            int lllllllllllllIIIlIIllIIllIIIllll = lllllllllllllIIIlIIllIIllIIlIIII & World.lIlIlIIlIlIllI[18];
            int lllllllllllllIIIlIIllIIllIIIlllI = lllllllllllllIIIlIIllIIllIIlIIII >> World.lIlIlIIlIlIllI[7] & World.lIlIlIIlIlIllI[18];
            final int lllllllllllllIIIlIIllIIllIIIllIl = lllllllllllllIIIlIIllIIllIIlIIII >> World.lIlIlIIlIlIllI[21] & World.lIlIlIIlIlIllI[17];
            final BlockPos lllllllllllllIIIlIIllIIllIIIllII = new BlockPos(lllllllllllllIIIlIIllIIllIIIllll, lllllllllllllIIIlIIllIIllIIIllIl, lllllllllllllIIIlIIllIIllIIIlllI);
            final Block lllllllllllllIIIlIIllIIllIIIlIll = lllllllllllllIIIlIIllIIllIIlIIIl.getBlock(lllllllllllllIIIlIIllIIllIIIllII);
            lllllllllllllIIIlIIllIIllIIIllll += lllllllllllllIIIlIIllIIllIIlIIll;
            lllllllllllllIIIlIIllIIllIIIlllI += lllllllllllllIIIlIIllIIllIIIIlll;
            if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIIllIIIlIll.getMaterial(), Material.air) && lllIllIIlIIllIl(this.getLight(lllllllllllllIIIlIIllIIllIIIllII), this.rand.nextInt(World.lIlIlIIlIlIllI[7])) && lllIllIIllIIIlI(this.getLightFor(EnumSkyBlock.SKY, lllllllllllllIIIlIIllIIllIIIllII))) {
                final EntityPlayer lllllllllllllIIIlIIllIIllIIIlIlI = this.getClosestPlayer(lllllllllllllIIIlIIllIIllIIIllll + 0.5, lllllllllllllIIIlIIllIIllIIIllIl + 0.5, lllllllllllllIIIlIIllIIllIIIlllI + 0.5, 8.0);
                if (lllIllIIlIlIIIl(lllllllllllllIIIlIIllIIllIIIlIlI) && lllIllIIlIIllII(lllIllIIllIIIll(lllllllllllllIIIlIIllIIllIIIlIlI.getDistanceSq(lllllllllllllIIIlIIllIIllIIIllll + 0.5, lllllllllllllIIIlIIllIIllIIIllIl + 0.5, lllllllllllllIIIlIIllIIllIIIlllI + 0.5), 4.0))) {
                    this.playSoundEffect(lllllllllllllIIIlIIllIIllIIIllll + 0.5, lllllllllllllIIIlIIllIIllIIIllIl + 0.5, lllllllllllllIIIlIIllIIllIIIlllI + 0.5, World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[43]], 0.7f, 0.8f + this.rand.nextFloat() * 0.2f);
                    this.ambientTickCountdown = this.rand.nextInt(World.lIlIlIIlIlIllI[2]) + World.lIlIlIIlIlIllI[44];
                }
            }
        }
        this.theProfiler.endStartSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[45]]);
        lllllllllllllIIIlIIllIIllIIlIIIl.enqueueRelightChecks();
    }
    
    private static int lllIllIIlIllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean addWeatherEffect(final Entity lllllllllllllIIIlIIllllIIIIlIlII) {
        this.weatherEffects.add(lllllllllllllIIIlIIllllIIIIlIlII);
        "".length();
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public void playBroadcastSound(final int lllllllllllllIIIlIIlIlIlllIlllII, final BlockPos lllllllllllllIIIlIIlIlIlllIllIll, final int lllllllllllllIIIlIIlIlIlllIllIlI) {
        int lllllllllllllIIIlIIlIlIlllIllIIl = World.lIlIlIIlIlIllI[5];
        "".length();
        if ((0x8A ^ 0x8E) == 0x0) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlIlllIllIIl, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIlIlIlllIllIIl).broadcastSound(lllllllllllllIIIlIIlIlIlllIlllII, lllllllllllllIIIlIIlIlIlllIllIll, lllllllllllllIIIlIIlIlIlllIllIlI);
            ++lllllllllllllIIIlIIlIlIlllIllIIl;
        }
    }
    
    public boolean setBlockState(final BlockPos lllllllllllllIIIlIlIIIIIlIIIIIlI, final IBlockState lllllllllllllIIIlIlIIIIIlIIIIIIl, final int lllllllllllllIIIlIlIIIIIlIIIlIII) {
        if (lllIllIIlIIIllI(this.isValid(lllllllllllllIIIlIlIIIIIlIIIIIlI) ? 1 : 0)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        if (lllIllIIlIIIllI(this.isRemote ? 1 : 0) && lllIllIIlIIIlIl(this.worldInfo.getTerrainType(), WorldType.DEBUG_WORLD)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        final Chunk lllllllllllllIIIlIlIIIIIlIIIIlll = this.getChunkFromBlockCoords(lllllllllllllIIIlIlIIIIIlIIIIIlI);
        final Block lllllllllllllIIIlIlIIIIIlIIIIllI = lllllllllllllIIIlIlIIIIIlIIIIIIl.getBlock();
        final IBlockState lllllllllllllIIIlIlIIIIIlIIIIlIl = lllllllllllllIIIlIlIIIIIlIIIIlll.setBlockState(lllllllllllllIIIlIlIIIIIlIIIIIlI, lllllllllllllIIIlIlIIIIIlIIIIIIl);
        if (lllIllIIlIIlIII(lllllllllllllIIIlIlIIIIIlIIIIlIl)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        final Block lllllllllllllIIIlIlIIIIIlIIIIlII = lllllllllllllIIIlIlIIIIIlIIIIlIl.getBlock();
        if (!lllIllIIlIIlIIl(lllllllllllllIIIlIlIIIIIlIIIIllI.getLightOpacity(), lllllllllllllIIIlIlIIIIIlIIIIlII.getLightOpacity()) || lllIllIIlIIlIlI(lllllllllllllIIIlIlIIIIIlIIIIllI.getLightValue(), lllllllllllllIIIlIlIIIIIlIIIIlII.getLightValue())) {
            this.theProfiler.startSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[13]]);
            this.checkLight(lllllllllllllIIIlIlIIIIIlIIIIIlI);
            "".length();
            this.theProfiler.endSection();
        }
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIlIIIIIlIIIlIII & World.lIlIlIIlIlIllI[6]) && (!lllIllIIlIIIIIl(this.isRemote ? 1 : 0) || lllIllIIlIIIllI(lllllllllllllIIIlIlIIIIIlIIIlIII & World.lIlIlIIlIlIllI[12])) && lllIllIIlIIIIIl(lllllllllllllIIIlIlIIIIIlIIIIlll.isPopulated() ? 1 : 0)) {
            this.markBlockForUpdate(lllllllllllllIIIlIlIIIIIlIIIIIlI);
        }
        if (lllIllIIlIIIllI(this.isRemote ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIlIIIIIlIIIlIII & World.lIlIlIIlIlIllI[3])) {
            this.notifyNeighborsRespectDebug(lllllllllllllIIIlIlIIIIIlIIIIIlI, lllllllllllllIIIlIlIIIIIlIIIIlIl.getBlock());
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIlIIIIIlIIIIllI.hasComparatorInputOverride() ? 1 : 0)) {
                this.updateComparatorOutputLevel(lllllllllllllIIIlIlIIIIIlIIIIIlI, lllllllllllllIIIlIlIIIIIlIIIIllI);
            }
        }
        return World.lIlIlIIlIlIllI[3] != 0;
    }
    
    public boolean isSidePowered(final BlockPos lllllllllllllIIIlIIlIlllIIlIllII, final EnumFacing lllllllllllllIIIlIIlIlllIIlIlIII) {
        if (lllIllIIlIIllII(this.getRedstonePower(lllllllllllllIIIlIIlIlllIIlIllII, lllllllllllllIIIlIIlIlllIIlIlIII))) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    private static int lllIllIIllIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public MovingObjectPosition rayTraceBlocks(Vec3 lllllllllllllIIIlIIllllIlllIIIll, final Vec3 lllllllllllllIIIlIIlllllIIIIIllI, final boolean lllllllllllllIIIlIIllllIlllIIIIl, final boolean lllllllllllllIIIlIIllllIlllIIIII, final boolean lllllllllllllIIIlIIllllIllIlllll) {
        if (!lllIllIIlIIIllI(Double.isNaN(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord) ? 1 : 0) || !lllIllIIlIIIllI(Double.isNaN(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord) ? 1 : 0) || !lllIllIIlIIIllI(Double.isNaN(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord) ? 1 : 0)) {
            return null;
        }
        if (!lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllllIIIIIllI.xCoord) ? 1 : 0) || !lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllllIIIIIllI.yCoord) ? 1 : 0) || !lllIllIIlIIIllI(Double.isNaN(lllllllllllllIIIlIIlllllIIIIIllI.zCoord) ? 1 : 0)) {
            return null;
        }
        final int lllllllllllllIIIlIIlllllIIIIIIlI = MathHelper.floor_double(lllllllllllllIIIlIIlllllIIIIIllI.xCoord);
        final int lllllllllllllIIIlIIlllllIIIIIIIl = MathHelper.floor_double(lllllllllllllIIIlIIlllllIIIIIllI.yCoord);
        final int lllllllllllllIIIlIIlllllIIIIIIII = MathHelper.floor_double(lllllllllllllIIIlIIlllllIIIIIllI.zCoord);
        int lllllllllllllIIIlIIllllIllllllll = MathHelper.floor_double(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord);
        int lllllllllllllIIIlIIllllIlllllllI = MathHelper.floor_double(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord);
        int lllllllllllllIIIlIIllllIllllllIl = MathHelper.floor_double(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord);
        BlockPos lllllllllllllIIIlIIllllIllllllII = new BlockPos(lllllllllllllIIIlIIllllIllllllll, lllllllllllllIIIlIIllllIlllllllI, lllllllllllllIIIlIIllllIllllllIl);
        final IBlockState lllllllllllllIIIlIIllllIlllllIll = this.getBlockState(lllllllllllllIIIlIIllllIllllllII);
        final Block lllllllllllllIIIlIIllllIlllllIlI = lllllllllllllIIIlIIllllIlllllIll.getBlock();
        if ((!lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIlllIIIII ? 1 : 0) || lllIllIIlIlIIIl(lllllllllllllIIIlIIllllIlllllIlI.getCollisionBoundingBox(this, lllllllllllllIIIlIIllllIllllllII, lllllllllllllIIIlIIllllIlllllIll))) && lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIlllllIlI.canCollideCheck(lllllllllllllIIIlIIllllIlllllIll, lllllllllllllIIIlIIllllIlllIIIIl) ? 1 : 0)) {
            final MovingObjectPosition lllllllllllllIIIlIIllllIlllllIIl = lllllllllllllIIIlIIllllIlllllIlI.collisionRayTrace(this, lllllllllllllIIIlIIllllIllllllII, (Vec3)lllllllllllllIIIlIIllllIlllIIIll, lllllllllllllIIIlIIlllllIIIIIllI);
            if (lllIllIIlIlIIIl(lllllllllllllIIIlIIllllIlllllIIl)) {
                return lllllllllllllIIIlIIllllIlllllIIl;
            }
        }
        MovingObjectPosition lllllllllllllIIIlIIllllIlllllIII = null;
        int lllllllllllllIIIlIIllllIllllIlll = World.lIlIlIIlIlIllI[20];
        "".length();
        if (" ".length() > "   ".length()) {
            return null;
        }
        while (!lllIllIIlIIlllI(lllllllllllllIIIlIIllllIllllIlll--)) {
            if (!lllIllIIlIIIllI(Double.isNaN(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord) ? 1 : 0) || !lllIllIIlIIIllI(Double.isNaN(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord) ? 1 : 0) || lllIllIIlIIIIIl(Double.isNaN(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord) ? 1 : 0)) {
                return null;
            }
            if (lllIllIIlIIlIIl(lllllllllllllIIIlIIllllIllllllll, lllllllllllllIIIlIIlllllIIIIIIlI) && lllIllIIlIIlIIl(lllllllllllllIIIlIIllllIlllllllI, lllllllllllllIIIlIIlllllIIIIIIIl) && lllIllIIlIIlIIl(lllllllllllllIIIlIIllllIllllllIl, lllllllllllllIIIlIIlllllIIIIIIII)) {
                MovingObjectPosition movingObjectPosition;
                if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIllIlllll ? 1 : 0)) {
                    movingObjectPosition = lllllllllllllIIIlIIllllIlllllIII;
                    "".length();
                    if ("  ".length() < 0) {
                        return null;
                    }
                }
                else {
                    movingObjectPosition = null;
                }
                return movingObjectPosition;
            }
            boolean lllllllllllllIIIlIIllllIllllIllI = World.lIlIlIIlIlIllI[3] != 0;
            boolean lllllllllllllIIIlIIllllIllllIlIl = World.lIlIlIIlIlIllI[3] != 0;
            boolean lllllllllllllIIIlIIllllIllllIlII = World.lIlIlIIlIlIllI[3] != 0;
            double lllllllllllllIIIlIIllllIllllIIll = 999.0;
            double lllllllllllllIIIlIIllllIllllIIlI = 999.0;
            double lllllllllllllIIIlIIllllIllllIIIl = 999.0;
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIlllllIIIIIIlI, lllllllllllllIIIlIIllllIllllllll)) {
                lllllllllllllIIIlIIllllIllllIIll = lllllllllllllIIIlIIllllIllllllll + 1.0;
                "".length();
                if ((0x16 ^ 0x31 ^ (0x70 ^ 0x53)) > (162 + 60 - 41 + 8 ^ 43 + 95 - 24 + 71)) {
                    return null;
                }
            }
            else if (lllIllIIlIIIIll(lllllllllllllIIIlIIlllllIIIIIIlI, lllllllllllllIIIlIIllllIllllllll)) {
                lllllllllllllIIIlIIllllIllllIIll = lllllllllllllIIIlIIllllIllllllll + 0.0;
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIlIIllllIllllIllI = (World.lIlIlIIlIlIllI[5] != 0);
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIlllllIIIIIIIl, lllllllllllllIIIlIIllllIlllllllI)) {
                lllllllllllllIIIlIIllllIllllIIlI = lllllllllllllIIIlIIllllIlllllllI + 1.0;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (lllIllIIlIIIIll(lllllllllllllIIIlIIlllllIIIIIIIl, lllllllllllllIIIlIIllllIlllllllI)) {
                lllllllllllllIIIlIIllllIllllIIlI = lllllllllllllIIIlIIllllIlllllllI + 0.0;
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIlIIllllIllllIlIl = (World.lIlIlIIlIlIllI[5] != 0);
            }
            if (lllIllIIlIIIlll(lllllllllllllIIIlIIlllllIIIIIIII, lllllllllllllIIIlIIllllIllllllIl)) {
                lllllllllllllIIIlIIllllIllllIIIl = lllllllllllllIIIlIIllllIllllllIl + 1.0;
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            else if (lllIllIIlIIIIll(lllllllllllllIIIlIIlllllIIIIIIII, lllllllllllllIIIlIIllllIllllllIl)) {
                lllllllllllllIIIlIIllllIllllIIIl = lllllllllllllIIIlIIllllIllllllIl + 0.0;
                "".length();
                if (((0xC0 ^ 0x8F) & ~(0x7F ^ 0x30)) != 0x0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIlIIllllIllllIlII = (World.lIlIlIIlIlIllI[5] != 0);
            }
            double lllllllllllllIIIlIIllllIllllIIII = 999.0;
            double lllllllllllllIIIlIIllllIlllIllll = 999.0;
            double lllllllllllllIIIlIIllllIlllIlllI = 999.0;
            final double lllllllllllllIIIlIIllllIlllIllIl = lllllllllllllIIIlIIlllllIIIIIllI.xCoord - ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord;
            final double lllllllllllllIIIlIIllllIlllIllII = lllllllllllllIIIlIIlllllIIIIIllI.yCoord - ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord;
            final double lllllllllllllIIIlIIllllIlllIlIll = lllllllllllllIIIlIIlllllIIIIIllI.zCoord - ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord;
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIllllIllI ? 1 : 0)) {
                lllllllllllllIIIlIIllllIllllIIII = (lllllllllllllIIIlIIllllIllllIIll - ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord) / lllllllllllllIIIlIIllllIlllIllIl;
            }
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIllllIlIl ? 1 : 0)) {
                lllllllllllllIIIlIIllllIlllIllll = (lllllllllllllIIIlIIllllIllllIIlI - ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord) / lllllllllllllIIIlIIllllIlllIllII;
            }
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIllllIlII ? 1 : 0)) {
                lllllllllllllIIIlIIllllIlllIlllI = (lllllllllllllIIIlIIllllIllllIIIl - ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord) / lllllllllllllIIIlIIllllIlllIlIll;
            }
            if (lllIllIIlIIIllI(lllIllIIlIIllll(lllllllllllllIIIlIIllllIllllIIII, -0.0))) {
                lllllllllllllIIIlIIllllIllllIIII = -1.0E-4;
            }
            if (lllIllIIlIIIllI(lllIllIIlIIllll(lllllllllllllIIIlIIllllIlllIllll, -0.0))) {
                lllllllllllllIIIlIIllllIlllIllll = -1.0E-4;
            }
            if (lllIllIIlIIIllI(lllIllIIlIIllll(lllllllllllllIIIlIIllllIlllIlllI, -0.0))) {
                lllllllllllllIIIlIIllllIlllIlllI = -1.0E-4;
            }
            EnumFacing lllllllllllllIIIlIIllllIlllIlIII = null;
            if (lllIllIIlIIlllI(lllIllIIlIlIIII(lllllllllllllIIIlIIllllIllllIIII, lllllllllllllIIIlIIllllIlllIllll)) && lllIllIIlIIlllI(lllIllIIlIlIIII(lllllllllllllIIIlIIllllIllllIIII, lllllllllllllIIIlIIllllIlllIlllI))) {
                EnumFacing enumFacing;
                if (lllIllIIlIIIlll(lllllllllllllIIIlIIlllllIIIIIIlI, lllllllllllllIIIlIIllllIllllllll)) {
                    enumFacing = EnumFacing.WEST;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    enumFacing = EnumFacing.EAST;
                }
                final EnumFacing lllllllllllllIIIlIIllllIlllIlIlI = enumFacing;
                lllllllllllllIIIlIIllllIlllIIIll = new Vec3(lllllllllllllIIIlIIllllIllllIIll, ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord + lllllllllllllIIIlIIllllIlllIllII * lllllllllllllIIIlIIllllIllllIIII, ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord + lllllllllllllIIIlIIllllIlllIlIll * lllllllllllllIIIlIIllllIllllIIII);
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            else if (lllIllIIlIIlllI(lllIllIIlIlIIII(lllllllllllllIIIlIIllllIlllIllll, lllllllllllllIIIlIIllllIlllIlllI))) {
                EnumFacing enumFacing2;
                if (lllIllIIlIIIlll(lllllllllllllIIIlIIlllllIIIIIIIl, lllllllllllllIIIlIIllllIlllllllI)) {
                    enumFacing2 = EnumFacing.DOWN;
                    "".length();
                    if (" ".length() == -" ".length()) {
                        return null;
                    }
                }
                else {
                    enumFacing2 = EnumFacing.UP;
                }
                final EnumFacing lllllllllllllIIIlIIllllIlllIlIIl = enumFacing2;
                lllllllllllllIIIlIIllllIlllIIIll = new Vec3(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord + lllllllllllllIIIlIIllllIlllIllIl * lllllllllllllIIIlIIllllIlllIllll, lllllllllllllIIIlIIllllIllllIIlI, ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord + lllllllllllllIIIlIIllllIlllIlIll * lllllllllllllIIIlIIllllIlllIllll);
                "".length();
                if ((0x69 ^ 0x6D) <= ((0xBA ^ 0xB1) & ~(0x62 ^ 0x69))) {
                    return null;
                }
            }
            else {
                EnumFacing enumFacing3;
                if (lllIllIIlIIIlll(lllllllllllllIIIlIIlllllIIIIIIII, lllllllllllllIIIlIIllllIllllllIl)) {
                    enumFacing3 = EnumFacing.NORTH;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    enumFacing3 = EnumFacing.SOUTH;
                }
                lllllllllllllIIIlIIllllIlllIlIII = enumFacing3;
                lllllllllllllIIIlIIllllIlllIIIll = new Vec3(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord + lllllllllllllIIIlIIllllIlllIllIl * lllllllllllllIIIlIIllllIlllIlllI, ((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord + lllllllllllllIIIlIIllllIlllIllII * lllllllllllllIIIlIIllllIlllIlllI, lllllllllllllIIIlIIllllIllllIIIl);
            }
            final int floor_double = MathHelper.floor_double(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).xCoord);
            int n;
            if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllllIlllIlIII, EnumFacing.EAST)) {
                n = World.lIlIlIIlIlIllI[3];
                "".length();
                if (-" ".length() == "  ".length()) {
                    return null;
                }
            }
            else {
                n = World.lIlIlIIlIlIllI[5];
            }
            lllllllllllllIIIlIIllllIllllllll = floor_double - n;
            final int floor_double2 = MathHelper.floor_double(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).yCoord);
            int n2;
            if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllllIlllIlIII, EnumFacing.UP)) {
                n2 = World.lIlIlIIlIlIllI[3];
                "".length();
                if ((0x42 ^ 0x44 ^ "   ".length()) <= 0) {
                    return null;
                }
            }
            else {
                n2 = World.lIlIlIIlIlIllI[5];
            }
            lllllllllllllIIIlIIllllIlllllllI = floor_double2 - n2;
            final int floor_double3 = MathHelper.floor_double(((Vec3)lllllllllllllIIIlIIllllIlllIIIll).zCoord);
            int n3;
            if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllllIlllIlIII, EnumFacing.SOUTH)) {
                n3 = World.lIlIlIIlIlIllI[3];
                "".length();
                if (((0x54 ^ 0x70) & ~(0xA7 ^ 0x83)) > 0) {
                    return null;
                }
            }
            else {
                n3 = World.lIlIlIIlIlIllI[5];
            }
            lllllllllllllIIIlIIllllIllllllIl = floor_double3 - n3;
            lllllllllllllIIIlIIllllIllllllII = new BlockPos(lllllllllllllIIIlIIllllIllllllll, lllllllllllllIIIlIIllllIlllllllI, lllllllllllllIIIlIIllllIllllllIl);
            final IBlockState lllllllllllllIIIlIIllllIlllIIlll = this.getBlockState(lllllllllllllIIIlIIllllIllllllII);
            final Block lllllllllllllIIIlIIllllIlllIIllI = lllllllllllllIIIlIIllllIlllIIlll.getBlock();
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIlllIIIII ? 1 : 0) && !lllIllIIlIlIIIl(lllllllllllllIIIlIIllllIlllIIllI.getCollisionBoundingBox(this, lllllllllllllIIIlIIllllIllllllII, lllllllllllllIIIlIIllllIlllIIlll))) {
                continue;
            }
            if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIlllIIllI.canCollideCheck(lllllllllllllIIIlIIllllIlllIIlll, lllllllllllllIIIlIIllllIlllIIIIl) ? 1 : 0)) {
                final MovingObjectPosition lllllllllllllIIIlIIllllIlllIIlIl = lllllllllllllIIIlIIllllIlllIIllI.collisionRayTrace(this, lllllllllllllIIIlIIllllIllllllII, (Vec3)lllllllllllllIIIlIIllllIlllIIIll, lllllllllllllIIIlIIlllllIIIIIllI);
                if (lllIllIIlIlIIIl(lllllllllllllIIIlIIllllIlllIIlIl)) {
                    return lllllllllllllIIIlIIllllIlllIIlIl;
                }
                continue;
            }
            else {
                lllllllllllllIIIlIIllllIlllllIII = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, (Vec3)lllllllllllllIIIlIIllllIlllIIIll, lllllllllllllIIIlIIllllIlllIlIII, lllllllllllllIIIlIIllllIllllllII);
            }
        }
        MovingObjectPosition movingObjectPosition2;
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIllllIllIlllll ? 1 : 0)) {
            movingObjectPosition2 = lllllllllllllIIIlIIllllIlllllIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            movingObjectPosition2 = null;
        }
        return movingObjectPosition2;
    }
    
    protected void updateBlocks() {
        this.setActivePlayerChunksAndCheckLight();
    }
    
    private static boolean lllIllIIlIIlIlI(final int lllllllllllllIIIlIIlIlIIlIlIllll, final int lllllllllllllIIIlIIlIlIIlIlIlllI) {
        return lllllllllllllIIIlIIlIlIIlIlIllll != lllllllllllllIIIlIIlIlIIlIlIlllI;
    }
    
    public void scheduleBlockUpdate(final BlockPos lllllllllllllIIIlIIlllIIlIIlIIIl, final Block lllllllllllllIIIlIIlllIIlIIlIIII, final int lllllllllllllIIIlIIlllIIlIIIllll, final int lllllllllllllIIIlIIlllIIlIIIlllI) {
    }
    
    @Override
    public IBlockState getBlockState(final BlockPos lllllllllllllIIIlIIlllllIlIIIIll) {
        if (lllIllIIlIIIllI(this.isValid(lllllllllllllIIIlIIlllllIlIIIIll) ? 1 : 0)) {
            return Blocks.air.getDefaultState();
        }
        final Chunk lllllllllllllIIIlIIlllllIlIIIlIl = this.getChunkFromBlockCoords(lllllllllllllIIIlIIlllllIlIIIIll);
        return lllllllllllllIIIlIIlllllIlIIIlIl.getBlockState(lllllllllllllIIIlIIlllllIlIIIIll);
    }
    
    public <T extends Entity> T findNearestEntityWithinAABB(final Class<? extends T> lllllllllllllIIIlIIlIllllIlIIlII, final AxisAlignedBB lllllllllllllIIIlIIlIllllIlIllIl, final T lllllllllllllIIIlIIlIllllIlIIIlI) {
        final List<T> lllllllllllllIIIlIIlIllllIlIlIll = this.getEntitiesWithinAABB(lllllllllllllIIIlIIlIllllIlIIlII, lllllllllllllIIIlIIlIllllIlIllIl);
        T lllllllllllllIIIlIIlIllllIlIlIlI = null;
        double lllllllllllllIIIlIIlIllllIlIlIIl = Double.MAX_VALUE;
        int lllllllllllllIIIlIIlIllllIlIlIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if (" ".length() == 0) {
            return null;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIllllIlIlIII, lllllllllllllIIIlIIlIllllIlIlIll.size())) {
            final T lllllllllllllIIIlIIlIllllIlIIlll = lllllllllllllIIIlIIlIllllIlIlIll.get(lllllllllllllIIIlIIlIllllIlIlIII);
            if (lllIllIIlIIlIll(lllllllllllllIIIlIIlIllllIlIIlll, lllllllllllllIIIlIIlIllllIlIIIlI) && lllIllIIlIIIIIl(EntitySelectors.NOT_SPECTATING.apply((Object)lllllllllllllIIIlIIlIllllIlIIlll) ? 1 : 0)) {
                final double lllllllllllllIIIlIIlIllllIlIIllI = lllllllllllllIIIlIIlIllllIlIIIlI.getDistanceSqToEntity(lllllllllllllIIIlIIlIllllIlIIlll);
                if (lllIllIIllIIIlI(lllIllIIllIIllI(lllllllllllllIIIlIIlIllllIlIIllI, lllllllllllllIIIlIIlIllllIlIlIIl))) {
                    lllllllllllllIIIlIIlIllllIlIlIlI = lllllllllllllIIIlIIlIllllIlIIlll;
                    lllllllllllllIIIlIIlIllllIlIlIIl = lllllllllllllIIIlIIlIllllIlIIllI;
                }
            }
            ++lllllllllllllIIIlIIlIllllIlIlIII;
        }
        return lllllllllllllIIIlIIlIllllIlIlIlI;
    }
    
    public void removeEntity(final Entity lllllllllllllIIIlIIlllIllllIllII) {
        if (lllIllIIlIlIIIl(lllllllllllllIIIlIIlllIllllIllII.riddenByEntity)) {
            lllllllllllllIIIlIIlllIllllIllII.riddenByEntity.mountEntity(null);
        }
        if (lllIllIIlIlIIIl(lllllllllllllIIIlIIlllIllllIllII.ridingEntity)) {
            lllllllllllllIIIlIIlllIllllIllII.mountEntity(null);
        }
        lllllllllllllIIIlIIlllIllllIllII.setDead();
        if (lllIllIIlIIIIIl((lllllllllllllIIIlIIlllIllllIllII instanceof EntityPlayer) ? 1 : 0)) {
            this.playerEntities.remove(lllllllllllllIIIlIIlllIllllIllII);
            "".length();
            this.updateAllPlayersSleepingFlag();
            this.onEntityRemoved(lllllllllllllIIIlIIlllIllllIllII);
        }
    }
    
    public void setEntityState(final Entity lllllllllllllIIIlIIlIllIIlIIlIll, final byte lllllllllllllIIIlIIlIllIIlIIlIlI) {
    }
    
    public boolean canBlockFreeze(final BlockPos lllllllllllllIIIlIIllIIlIlIlIIlI, final boolean lllllllllllllIIIlIIllIIlIlIlIIIl) {
        final BiomeGenBase lllllllllllllIIIlIIllIIlIlIllIII = this.getBiomeGenForCoords(lllllllllllllIIIlIIllIIlIlIlIIlI);
        final float lllllllllllllIIIlIIllIIlIlIlIlll = lllllllllllllIIIlIIllIIlIlIllIII.getFloatTemperature(lllllllllllllIIIlIIllIIlIlIlIIlI);
        if (lllIllIIlIIllII(lllIllIIllIIlII(lllllllllllllIIIlIIllIIlIlIlIlll, 0.15f))) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        if (lllIllIIlIIIlII(lllllllllllllIIIlIIllIIlIlIlIIlI.getY()) && lllIllIIlIIIIll(lllllllllllllIIIlIIllIIlIlIlIIlI.getY(), World.lIlIlIIlIlIllI[11]) && lllIllIIlIIIIll(this.getLightFor(EnumSkyBlock.BLOCK, lllllllllllllIIIlIIllIIlIlIlIIlI), World.lIlIlIIlIlIllI[24])) {
            final IBlockState lllllllllllllIIIlIIllIIlIlIlIllI = this.getBlockState(lllllllllllllIIIlIIllIIlIlIlIIlI);
            final Block lllllllllllllIIIlIIllIIlIlIlIlIl = lllllllllllllIIIlIIllIIlIlIlIllI.getBlock();
            if ((!lllIllIIlIIlIll(lllllllllllllIIIlIIllIIlIlIlIlIl, Blocks.water) || lllIllIIlIIIlIl(lllllllllllllIIIlIIllIIlIlIlIlIl, Blocks.flowing_water)) && lllIllIIlIIIllI(lllllllllllllIIIlIIllIIlIlIlIllI.getValue((IProperty<Integer>)BlockLiquid.LEVEL))) {
                if (lllIllIIlIIIllI(lllllllllllllIIIlIIllIIlIlIlIIIl ? 1 : 0)) {
                    return World.lIlIlIIlIlIllI[3] != 0;
                }
                int n;
                if (lllIllIIlIIIIIl(this.isWater(lllllllllllllIIIlIIllIIlIlIlIIlI.west()) ? 1 : 0) && lllIllIIlIIIIIl(this.isWater(lllllllllllllIIIlIIllIIlIlIlIIlI.east()) ? 1 : 0) && lllIllIIlIIIIIl(this.isWater(lllllllllllllIIIlIIllIIlIlIlIIlI.north()) ? 1 : 0) && lllIllIIlIIIIIl(this.isWater(lllllllllllllIIIlIIllIIlIlIlIIlI.south()) ? 1 : 0)) {
                    n = World.lIlIlIIlIlIllI[3];
                    "".length();
                    if (null != null) {
                        return ((0x14 ^ 0x70 ^ (0x36 ^ 0x6D)) & (0xB5 ^ 0xBB ^ (0x1C ^ 0x2D) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = World.lIlIlIIlIlIllI[5];
                }
                final boolean lllllllllllllIIIlIIllIIlIlIlIlII = n != 0;
                if (lllIllIIlIIIllI(lllllllllllllIIIlIIllIIlIlIlIlII ? 1 : 0)) {
                    return World.lIlIlIIlIlIllI[3] != 0;
                }
            }
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public BlockPos getStrongholdPos(final String lllllllllllllIIIlIIlIlIllIIlIlll, final BlockPos lllllllllllllIIIlIIlIlIllIIlIllI) {
        return this.getChunkProvider().getStrongholdGen(this, lllllllllllllIIIlIIlIlIllIIlIlll, lllllllllllllIIIlIIlIlIllIIlIllI);
    }
    
    public List<Entity> getLoadedEntityList() {
        return this.loadedEntityList;
    }
    
    @Override
    public TileEntity getTileEntity(final BlockPos lllllllllllllIIIlIIllIlIIIlIllIl) {
        if (lllIllIIlIIIllI(this.isValid(lllllllllllllIIIlIIllIlIIIlIllIl) ? 1 : 0)) {
            return null;
        }
        TileEntity lllllllllllllIIIlIIllIlIIIlIllII = null;
        if (lllIllIIlIIIIIl(this.processingLoadedTiles ? 1 : 0)) {
            int lllllllllllllIIIlIIllIlIIIlIlIll = World.lIlIlIIlIlIllI[5];
            "".length();
            if ((0x6A ^ 0x7F ^ (0x5A ^ 0x4B)) <= "  ".length()) {
                return null;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIIIlIlIll, this.addedTileEntityList.size())) {
                final TileEntity lllllllllllllIIIlIIllIlIIIlIlIlI = this.addedTileEntityList.get(lllllllllllllIIIlIIllIlIIIlIlIll);
                if (lllIllIIlIIIllI(lllllllllllllIIIlIIllIlIIIlIlIlI.isInvalid() ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIllIlIIIlIlIlI.getPos().equals(lllllllllllllIIIlIIllIlIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIIIlIIllIlIIIlIllII = lllllllllllllIIIlIIllIlIIIlIlIlI;
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return null;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIIlIIllIlIIIlIlIll;
                }
            }
        }
        if (lllIllIIlIIlIII(lllllllllllllIIIlIIllIlIIIlIllII)) {
            lllllllllllllIIIlIIllIlIIIlIllII = this.getChunkFromBlockCoords(lllllllllllllIIIlIIllIlIIIlIllIl).getTileEntity(lllllllllllllIIIlIIllIlIIIlIllIl, Chunk.EnumCreateEntityType.IMMEDIATE);
        }
        if (lllIllIIlIIlIII(lllllllllllllIIIlIIllIlIIIlIllII)) {
            int lllllllllllllIIIlIIllIlIIIlIlIIl = World.lIlIlIIlIlIllI[5];
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIIIlIlIIl, this.addedTileEntityList.size())) {
                final TileEntity lllllllllllllIIIlIIllIlIIIlIlIII = this.addedTileEntityList.get(lllllllllllllIIIlIIllIlIIIlIlIIl);
                if (lllIllIIlIIIllI(lllllllllllllIIIlIIllIlIIIlIlIII.isInvalid() ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIllIlIIIlIlIII.getPos().equals(lllllllllllllIIIlIIllIlIIIlIllIl) ? 1 : 0)) {
                    lllllllllllllIIIlIIllIlIIIlIllII = lllllllllllllIIIlIIllIlIIIlIlIII;
                    "".length();
                    if (((0xC1 ^ 0x8F) & ~(0xE1 ^ 0xAF)) == " ".length()) {
                        return null;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIIlIIllIlIIIlIlIIl;
                }
            }
        }
        return lllllllllllllIIIlIIllIlIIIlIllII;
    }
    
    private static int lllIllIIllIllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllIllIIlIIIIlI(final int lllllllllllllIIIlIIlIlIIllIlIlll, final int lllllllllllllIIIlIIlIlIIllIlIllI) {
        return lllllllllllllIIIlIIlIlIIllIlIlll >= lllllllllllllIIIlIIlIlIIllIlIllI;
    }
    
    public void joinEntityInSurroundings(final Entity lllllllllllllIIIlIIlIllIIlIlllII) {
        final int lllllllllllllIIIlIIlIllIIlIllIll = MathHelper.floor_double(lllllllllllllIIIlIIlIllIIlIlllII.posX / 16.0);
        final int lllllllllllllIIIlIIlIllIIlIllIlI = MathHelper.floor_double(lllllllllllllIIIlIIlIllIIlIlllII.posZ / 16.0);
        final int lllllllllllllIIIlIIlIllIIlIllIIl = World.lIlIlIIlIlIllI[6];
        int lllllllllllllIIIlIIlIllIIlIllIII = lllllllllllllIIIlIIlIllIIlIllIll - lllllllllllllIIIlIIlIllIIlIllIIl;
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIllIIlIIIlll(lllllllllllllIIIlIIlIllIIlIllIII, lllllllllllllIIIlIIlIllIIlIllIll + lllllllllllllIIIlIIlIllIIlIllIIl)) {
            int lllllllllllllIIIlIIlIllIIlIlIlll = lllllllllllllIIIlIIlIllIIlIllIlI - lllllllllllllIIIlIIlIllIIlIllIIl;
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIIlIllIIlIlIlll, lllllllllllllIIIlIIlIllIIlIllIlI + lllllllllllllIIIlIIlIllIIlIllIIl)) {
                this.getChunkFromChunkCoords(lllllllllllllIIIlIIlIllIIlIllIII, lllllllllllllIIIlIIlIllIIlIlIlll);
                "".length();
                ++lllllllllllllIIIlIIlIllIIlIlIlll;
            }
            ++lllllllllllllIIIlIIlIllIIlIllIII;
        }
        if (lllIllIIlIIIllI(this.loadedEntityList.contains(lllllllllllllIIIlIIlIllIIlIlllII) ? 1 : 0)) {
            this.loadedEntityList.add(lllllllllllllIIIlIIlIllIIlIlllII);
            "".length();
        }
    }
    
    private static boolean lllIllIIlIIIlll(final int lllllllllllllIIIlIIlIlIIllIIlIll, final int lllllllllllllIIIlIIlIlIIllIIlIlI) {
        return lllllllllllllIIIlIIlIlIIllIIlIll > lllllllllllllIIIlIIlIlIIllIIlIlI;
    }
    
    public boolean checkBlockCollision(final AxisAlignedBB lllllllllllllIIIlIIllIlllIlIIIII) {
        final int lllllllllllllIIIlIIllIlllIIlllll = MathHelper.floor_double(lllllllllllllIIIlIIllIlllIlIIIII.minX);
        final int lllllllllllllIIIlIIllIlllIIllllI = MathHelper.floor_double(lllllllllllllIIIlIIllIlllIlIIIII.maxX);
        final int lllllllllllllIIIlIIllIlllIIlllIl = MathHelper.floor_double(lllllllllllllIIIlIIllIlllIlIIIII.minY);
        final int lllllllllllllIIIlIIllIlllIIlllII = MathHelper.floor_double(lllllllllllllIIIlIIllIlllIlIIIII.maxY);
        final int lllllllllllllIIIlIIllIlllIIllIll = MathHelper.floor_double(lllllllllllllIIIlIIllIlllIlIIIII.minZ);
        final int lllllllllllllIIIlIIllIlllIIllIlI = MathHelper.floor_double(lllllllllllllIIIlIIllIlllIlIIIII.maxZ);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIIllIlllIIllIIl = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIIllIlllIIllIII = lllllllllllllIIIlIIllIlllIIlllll;
        "".length();
        if (-"  ".length() > 0) {
            return ((101 + 116 - 151 + 106 ^ 39 + 72 - 101 + 132) & (0xC0 ^ 0x9B ^ (0x75 ^ 0xC) ^ -" ".length())) != 0x0;
        }
        while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIlllIIllIII, lllllllllllllIIIlIIllIlllIIllllI)) {
            int lllllllllllllIIIlIIllIlllIIlIlll = lllllllllllllIIIlIIllIlllIIlllIl;
            "".length();
            if ("  ".length() >= (0x81 ^ 0x85)) {
                return ((0x7B ^ 0x5D) & ~(0x38 ^ 0x1E)) != 0x0;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIlllIIlIlll, lllllllllllllIIIlIIllIlllIIlllII)) {
                int lllllllllllllIIIlIIllIlllIIlIllI = lllllllllllllIIIlIIllIlllIIllIll;
                "".length();
                if ("   ".length() < " ".length()) {
                    return ((0xEA ^ 0xA5) & ~(0x1F ^ 0x50)) != 0x0;
                }
                while (!lllIllIIlIIIlll(lllllllllllllIIIlIIllIlllIIlIllI, lllllllllllllIIIlIIllIlllIIllIlI)) {
                    final Block lllllllllllllIIIlIIllIlllIIlIlIl = this.getBlockState(lllllllllllllIIIlIIllIlllIIllIIl.func_181079_c(lllllllllllllIIIlIIllIlllIIllIII, lllllllllllllIIIlIIllIlllIIlIlll, lllllllllllllIIIlIIllIlllIIlIllI)).getBlock();
                    if (lllIllIIlIIlIll(lllllllllllllIIIlIIllIlllIIlIlIl.getMaterial(), Material.air)) {
                        return World.lIlIlIIlIlIllI[3] != 0;
                    }
                    ++lllllllllllllIIIlIIllIlllIIlIllI;
                }
                ++lllllllllllllIIIlIIllIlllIIlIlll;
            }
            ++lllllllllllllIIIlIIllIlllIIllIII;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public void setLightFor(final EnumSkyBlock lllllllllllllIIIlIIlllllIllIllII, final BlockPos lllllllllllllIIIlIIlllllIllIlIll, final int lllllllllllllIIIlIIlllllIllIlIlI) {
        if (lllIllIIlIIIIIl(this.isValid(lllllllllllllIIIlIIlllllIllIlIll) ? 1 : 0) && lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlllllIllIlIll) ? 1 : 0)) {
            final Chunk lllllllllllllIIIlIIlllllIllIlllI = this.getChunkFromBlockCoords(lllllllllllllIIIlIIlllllIllIlIll);
            lllllllllllllIIIlIIlllllIllIlllI.setLightFor(lllllllllllllIIIlIIlllllIllIllII, lllllllllllllIIIlIIlllllIllIlIll, lllllllllllllIIIlIIlllllIllIlIlI);
            this.notifyLightSet(lllllllllllllIIIlIIlllllIllIlIll);
        }
    }
    
    public void checkSessionLock() throws MinecraftException {
        this.saveHandler.checkSessionLock();
    }
    
    public void removePlayerEntityDangerously(final Entity lllllllllllllIIIlIIlllIllllIIIII) {
        lllllllllllllIIIlIIlllIllllIIIII.setDead();
        if (lllIllIIlIIIIIl((lllllllllllllIIIlIIlllIllllIIIII instanceof EntityPlayer) ? 1 : 0)) {
            this.playerEntities.remove(lllllllllllllIIIlIIlllIllllIIIII);
            "".length();
            this.updateAllPlayersSleepingFlag();
        }
        final int lllllllllllllIIIlIIlllIllllIIIll = lllllllllllllIIIlIIlllIllllIIIII.chunkCoordX;
        final int lllllllllllllIIIlIIlllIllllIIIlI = lllllllllllllIIIlIIlllIllllIIIII.chunkCoordZ;
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIllllIIIII.addedToChunk ? 1 : 0) && lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIlllIllllIIIll, lllllllllllllIIIlIIlllIllllIIIlI, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
            this.getChunkFromChunkCoords(lllllllllllllIIIlIIlllIllllIIIll, lllllllllllllIIIlIIlllIllllIIIlI).removeEntity(lllllllllllllIIIlIIlllIllllIIIII);
        }
        this.loadedEntityList.remove(lllllllllllllIIIlIIlllIllllIIIII);
        "".length();
        this.onEntityRemoved(lllllllllllllIIIlIIlllIllllIIIII);
    }
    
    @Override
    public boolean isAirBlock(final BlockPos lllllllllllllIIIlIlIIIIlIIIlIlll) {
        if (lllIllIIlIIIlIl(this.getBlockState(lllllllllllllIIIlIlIIIIlIIIlIlll).getBlock().getMaterial(), Material.air)) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public int getLight(BlockPos lllllllllllllIIIlIIlllllllIlIIll) {
        if (lllIllIIlIIlllI(lllllllllllllIIIlIIlllllllIlIIll.getY())) {
            return World.lIlIlIIlIlIllI[5];
        }
        if (lllIllIIlIIIIlI(lllllllllllllIIIlIIlllllllIlIIll.getY(), World.lIlIlIIlIlIllI[11])) {
            lllllllllllllIIIlIIlllllllIlIIll = new BlockPos(lllllllllllllIIIlIIlllllllIlIIll.getX(), World.lIlIlIIlIlIllI[17], lllllllllllllIIIlIIlllllllIlIIll.getZ());
        }
        return this.getChunkFromBlockCoords(lllllllllllllIIIlIIlllllllIlIIll).getLightSubtracted(lllllllllllllIIIlIIlllllllIlIIll, World.lIlIlIIlIlIllI[5]);
    }
    
    public BlockPos getPrecipitationHeight(final BlockPos lllllllllllllIIIlIIlllIIlIllllII) {
        return this.getChunkFromBlockCoords(lllllllllllllIIIlIIlllIIlIllllII).getPrecipitationHeight(lllllllllllllIIIlIIlllIIlIllllII);
    }
    
    public float getStarBrightness(final float lllllllllllllIIIlIIlllIIlIIllllI) {
        final float lllllllllllllIIIlIIlllIIlIlIIIIl = this.getCelestialAngle(lllllllllllllIIIlIIlllIIlIIllllI);
        float lllllllllllllIIIlIIlllIIlIlIIIII = 1.0f - (MathHelper.cos(lllllllllllllIIIlIIlllIIlIlIIIIl * 3.1415927f * 2.0f) * 2.0f + 0.25f);
        lllllllllllllIIIlIIlllIIlIlIIIII = MathHelper.clamp_float(lllllllllllllIIIlIIlllIIlIlIIIII, 0.0f, 1.0f);
        return lllllllllllllIIIlIIlllIIlIlIIIII * lllllllllllllIIIlIIlllIIlIlIIIII * 0.5f;
    }
    
    public <T extends Entity> List<T> getEntitiesWithinAABB(final Class<? extends T> lllllllllllllIIIlIIlIlllllIIlllI, final AxisAlignedBB lllllllllllllIIIlIIlIlllllIIIIlI, final Predicate<? super T> lllllllllllllIIIlIIlIlllllIIllII) {
        final int lllllllllllllIIIlIIlIlllllIIlIll = MathHelper.floor_double((lllllllllllllIIIlIIlIlllllIIIIlI.minX - 2.0) / 16.0);
        final int lllllllllllllIIIlIIlIlllllIIlIlI = MathHelper.floor_double((lllllllllllllIIIlIIlIlllllIIIIlI.maxX + 2.0) / 16.0);
        final int lllllllllllllIIIlIIlIlllllIIlIIl = MathHelper.floor_double((lllllllllllllIIIlIIlIlllllIIIIlI.minZ - 2.0) / 16.0);
        final int lllllllllllllIIIlIIlIlllllIIlIII = MathHelper.floor_double((lllllllllllllIIIlIIlIlllllIIIIlI.maxZ + 2.0) / 16.0);
        final List<T> lllllllllllllIIIlIIlIlllllIIIlll = (List<T>)Lists.newArrayList();
        int lllllllllllllIIIlIIlIlllllIIIllI = lllllllllllllIIIlIIlIlllllIIlIll;
        "".length();
        if ("   ".length() <= " ".length()) {
            return null;
        }
        while (!lllIllIIlIIIlll(lllllllllllllIIIlIIlIlllllIIIllI, lllllllllllllIIIlIIlIlllllIIlIlI)) {
            int lllllllllllllIIIlIIlIlllllIIIlIl = lllllllllllllIIIlIIlIlllllIIlIIl;
            "".length();
            if ((0x18 ^ 0x3C ^ (0x4A ^ 0x6A)) <= ((0x4 ^ 0x5A ^ (0xF8 ^ 0xB9)) & (0xAF ^ 0x9E ^ (0xE8 ^ 0xC6) ^ -" ".length()))) {
                return null;
            }
            while (!lllIllIIlIIIlll(lllllllllllllIIIlIIlIlllllIIIlIl, lllllllllllllIIIlIIlIlllllIIlIII)) {
                if (lllIllIIlIIIIIl(this.isChunkLoaded(lllllllllllllIIIlIIlIlllllIIIllI, lllllllllllllIIIlIIlIlllllIIIlIl, (boolean)(World.lIlIlIIlIlIllI[3] != 0)) ? 1 : 0)) {
                    this.getChunkFromChunkCoords(lllllllllllllIIIlIIlIlllllIIIllI, lllllllllllllIIIlIIlIlllllIIIlIl).getEntitiesOfTypeWithinAAAB(lllllllllllllIIIlIIlIlllllIIlllI, lllllllllllllIIIlIIlIlllllIIIIlI, lllllllllllllIIIlIIlIlllllIIIlll, lllllllllllllIIIlIIlIlllllIIllII);
                }
                ++lllllllllllllIIIlIIlIlllllIIIlIl;
            }
            ++lllllllllllllIIIlIIlIlllllIIIllI;
        }
        return lllllllllllllIIIlIIlIlllllIIIlll;
    }
    
    public boolean canBlockFreezeWater(final BlockPos lllllllllllllIIIlIIllIIlIllIlIlI) {
        return this.canBlockFreeze(lllllllllllllIIIlIIllIIlIllIlIlI, (boolean)(World.lIlIlIIlIlIllI[5] != 0));
    }
    
    public void playAuxSFXAtEntity(final EntityPlayer lllllllllllllIIIlIIlIlIllIllIlIl, final int lllllllllllllIIIlIIlIlIllIllIlII, final BlockPos lllllllllllllIIIlIIlIlIllIllllII, final int lllllllllllllIIIlIIlIlIllIlllIll) {
        try {
            int lllllllllllllIIIlIIlIlIllIlllIlI = World.lIlIlIIlIlIllI[5];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlIlIllIlllIlI, this.worldAccesses.size())) {
                this.worldAccesses.get(lllllllllllllIIIlIIlIlIllIlllIlI).playAuxSFX(lllllllllllllIIIlIIlIlIllIllIlIl, lllllllllllllIIIlIIlIlIllIllIlII, lllllllllllllIIIlIIlIlIllIllllII, lllllllllllllIIIlIIlIlIllIlllIll);
                ++lllllllllllllIIIlIIlIlIllIlllIlI;
            }
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIIlIIlIlIllIlllIIl) {
            final CrashReport lllllllllllllIIIlIIlIlIllIlllIII = CrashReport.makeCrashReport(lllllllllllllIIIlIIlIlIllIlllIIl, World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[34]]);
            final CrashReportCategory lllllllllllllIIIlIIlIlIllIllIlll = lllllllllllllIIIlIIlIlIllIlllIII.makeCategory(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[49]]);
            lllllllllllllIIIlIIlIlIllIllIlll.addCrashSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[50]], CrashReportCategory.getCoordinateInfo(lllllllllllllIIIlIIlIlIllIllllII));
            lllllllllllllIIIlIIlIlIllIllIlll.addCrashSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[51]], lllllllllllllIIIlIIlIlIllIllIlIl);
            lllllllllllllIIIlIIlIlIllIllIlll.addCrashSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[52]], lllllllllllllIIIlIIlIlIllIllIlII);
            lllllllllllllIIIlIIlIlIllIllIlll.addCrashSection(World.lIlIlIIIlllIll[World.lIlIlIIlIlIllI[53]], lllllllllllllIIIlIIlIlIllIlllIll);
            throw new ReportedException(lllllllllllllIIIlIIlIlIllIlllIII);
        }
    }
    
    public void setInitialSpawnLocation() {
        this.setSpawnPoint(new BlockPos(World.lIlIlIIlIlIllI[7], World.lIlIlIIlIlIllI[8], World.lIlIlIIlIlIllI[7]));
    }
    
    public void notifyNeighborsRespectDebug(final BlockPos lllllllllllllIIIlIlIIIIIIlIlIIII, final Block lllllllllllllIIIlIlIIIIIIlIIllll) {
        if (lllIllIIlIIlIll(this.worldInfo.getTerrainType(), WorldType.DEBUG_WORLD)) {
            this.notifyNeighborsOfStateChange(lllllllllllllIIIlIlIIIIIIlIlIIII, lllllllllllllIIIlIlIIIIIIlIIllll);
        }
    }
    
    protected boolean isChunkLoaded(final int lllllllllllllIIIlIlIIIIIlIlIlIIl, final int lllllllllllllIIIlIlIIIIIlIlIlIII, final boolean lllllllllllllIIIlIlIIIIIlIlIIIll) {
        if (lllIllIIlIIIIIl(this.chunkProvider.chunkExists(lllllllllllllIIIlIlIIIIIlIlIlIIl, lllllllllllllIIIlIlIIIIIlIlIlIII) ? 1 : 0) && (!lllIllIIlIIIllI(lllllllllllllIIIlIlIIIIIlIlIIIll ? 1 : 0) || lllIllIIlIIIllI(this.chunkProvider.provideChunk(lllllllllllllIIIlIlIIIIIlIlIlIIl, lllllllllllllIIIlIlIIIIIlIlIlIII).isEmpty() ? 1 : 0))) {
            return World.lIlIlIIlIlIllI[3] != 0;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public boolean destroyBlock(final BlockPos lllllllllllllIIIlIlIIIIIIllIlIlI, final boolean lllllllllllllIIIlIlIIIIIIllIlllI) {
        final IBlockState lllllllllllllIIIlIlIIIIIIllIllIl = this.getBlockState(lllllllllllllIIIlIlIIIIIIllIlIlI);
        final Block lllllllllllllIIIlIlIIIIIIllIllII = lllllllllllllIIIlIlIIIIIIllIllIl.getBlock();
        if (lllIllIIlIIIlIl(lllllllllllllIIIlIlIIIIIIllIllII.getMaterial(), Material.air)) {
            return World.lIlIlIIlIlIllI[5] != 0;
        }
        this.playAuxSFX(World.lIlIlIIlIlIllI[14], lllllllllllllIIIlIlIIIIIIllIlIlI, Block.getStateId(lllllllllllllIIIlIlIIIIIIllIllIl));
        if (lllIllIIlIIIIIl(lllllllllllllIIIlIlIIIIIIllIlllI ? 1 : 0)) {
            lllllllllllllIIIlIlIIIIIIllIllII.dropBlockAsItem(this, lllllllllllllIIIlIlIIIIIIllIlIlI, lllllllllllllIIIlIlIIIIIIllIllIl, World.lIlIlIIlIlIllI[5]);
        }
        return this.setBlockState(lllllllllllllIIIlIlIIIIIIllIlIlI, Blocks.air.getDefaultState(), World.lIlIlIIlIlIllI[13]);
    }
    
    private static boolean lllIllIIlIIIIIl(final int lllllllllllllIIIlIIlIlIIlIllllII) {
        return lllllllllllllIIIlIIlIlIIlIllllII != 0;
    }
    
    public void addBlockEvent(final BlockPos lllllllllllllIIIlIIlIllIIlIIIIII, final Block lllllllllllllIIIlIIlIllIIIllllll, final int lllllllllllllIIIlIIlIllIIIlllIIl, final int lllllllllllllIIIlIIlIllIIIlllIII) {
        lllllllllllllIIIlIIlIllIIIllllll.onBlockEventReceived(this, lllllllllllllIIIlIIlIllIIlIIIIII, this.getBlockState(lllllllllllllIIIlIIlIllIIlIIIIII), lllllllllllllIIIlIIlIllIIIlllIIl, lllllllllllllIIIlIIlIllIIIlllIII);
        "".length();
    }
    
    @Override
    public int getCombinedLight(final BlockPos lllllllllllllIIIlIIlllllIlIllIIl, final int lllllllllllllIIIlIIlllllIlIllIII) {
        final int lllllllllllllIIIlIIlllllIlIlIlll = this.getLightFromNeighborsFor(EnumSkyBlock.SKY, lllllllllllllIIIlIIlllllIlIllIIl);
        int lllllllllllllIIIlIIlllllIlIlIllI = this.getLightFromNeighborsFor(EnumSkyBlock.BLOCK, lllllllllllllIIIlIIlllllIlIllIIl);
        if (lllIllIIlIIIIll(lllllllllllllIIIlIIlllllIlIlIllI, lllllllllllllIIIlIIlllllIlIllIII)) {
            lllllllllllllIIIlIIlllllIlIlIllI = lllllllllllllIIIlIIlllllIlIllIII;
        }
        return lllllllllllllIIIlIIlllllIlIlIlll << World.lIlIlIIlIlIllI[19] | lllllllllllllIIIlIIlllllIlIlIllI << World.lIlIlIIlIlIllI[12];
    }
    
    private static boolean lllIllIIlIIllII(final int lllllllllllllIIIlIIlIlIIlIllIIlI) {
        return lllllllllllllIIIlIIlIlIIlIllIIlI > 0;
    }
    
    public boolean isBlockTickPending(final BlockPos lllllllllllllIIIlIIllllllllIllII, final Block lllllllllllllIIIlIIllllllllIlIll) {
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    protected void onEntityAdded(final Entity lllllllllllllIIIlIIlllIllllllIlI) {
        int lllllllllllllIIIlIIlllIlllllllII = World.lIlIlIIlIlIllI[5];
        "".length();
        if ("   ".length() == (0xFB ^ 0x8E ^ (0xE0 ^ 0x91))) {
            return;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIlllllllII, this.worldAccesses.size())) {
            this.worldAccesses.get(lllllllllllllIIIlIIlllIlllllllII).onEntityAdded(lllllllllllllIIIlIIlllIllllllIlI);
            ++lllllllllllllIIIlIIlllIlllllllII;
        }
    }
    
    public void func_181544_b(final int lllllllllllllIIIlIIlIlllIlIIlIIl) {
        this.field_181546_a = lllllllllllllIIIlIIlIlllIlIIlIIl;
    }
    
    public void calculateInitialSkylight() {
        final int lllllllllllllIIIlIIllIIlllIllIlI = this.calculateSkylightSubtracted(1.0f);
        if (lllIllIIlIIlIlI(lllllllllllllIIIlIIllIIlllIllIlI, this.skylightSubtracted)) {
            this.skylightSubtracted = lllllllllllllIIIlIIllIIlllIllIlI;
        }
    }
    
    public void tick() {
        this.updateWeather();
    }
    
    private static int lllIllIIllIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lllIllIIlIlIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean isAreaLoaded(final BlockPos lllllllllllllIIIlIlIIIIIllIllllI, final BlockPos lllllllllllllIIIlIlIIIIIllIlllIl, final boolean lllllllllllllIIIlIlIIIIIlllIIIII) {
        return this.isAreaLoaded(lllllllllllllIIIlIlIIIIIllIllllI.getX(), lllllllllllllIIIlIlIIIIIllIllllI.getY(), lllllllllllllIIIlIlIIIIIllIllllI.getZ(), lllllllllllllIIIlIlIIIIIllIlllIl.getX(), lllllllllllllIIIlIlIIIIIllIlllIl.getY(), lllllllllllllIIIlIlIIIIIllIlllIl.getZ(), lllllllllllllIIIlIlIIIIIlllIIIII);
    }
    
    public Chunk getChunkFromBlockCoords(final BlockPos lllllllllllllIIIlIlIIIIIlIIlllll) {
        return this.getChunkFromChunkCoords(lllllllllllllIIIlIlIIIIIlIIlllll.getX() >> World.lIlIlIIlIlIllI[12], lllllllllllllIIIlIlIIIIIlIIlllll.getZ() >> World.lIlIlIIlIlIllI[12]);
    }
    
    public Explosion createExplosion(final Entity lllllllllllllIIIlIIllIlIlIIlllIl, final double lllllllllllllIIIlIIllIlIlIIlllII, final double lllllllllllllIIIlIIllIlIlIIllIll, final double lllllllllllllIIIlIIllIlIlIIlIIll, final float lllllllllllllIIIlIIllIlIlIIlIIlI, final boolean lllllllllllllIIIlIIllIlIlIIllIII) {
        return this.newExplosion(lllllllllllllIIIlIIllIlIlIIlllIl, lllllllllllllIIIlIIllIlIlIIlllII, lllllllllllllIIIlIIllIlIlIIllIll, lllllllllllllIIIlIIllIlIlIIlIIll, lllllllllllllIIIlIIllIlIlIIlIIlI, (boolean)(World.lIlIlIIlIlIllI[5] != 0), lllllllllllllIIIlIIllIlIlIIllIII);
    }
    
    public void markTileEntityForRemoval(final TileEntity lllllllllllllIIIlIIllIlIIIIIIlll) {
        this.tileEntitiesToBeRemoved.add(lllllllllllllIIIlIIllIlIIIIIIlll);
        "".length();
    }
    
    public boolean isFindingSpawnPoint() {
        return this.findingSpawnPoint;
    }
    
    public void removeWorldAccess(final IWorldAccess lllllllllllllIIIlIIlllIlllIlIIlI) {
        this.worldAccesses.remove(lllllllllllllIIIlIIlllIlllIlIIlI);
        "".length();
    }
    
    private static boolean lllIllIIlIlIIIl(final Object lllllllllllllIIIlIIlIlIIllIIIIII) {
        return lllllllllllllIIIlIIlIlIIllIIIIII != null;
    }
    
    public long getTotalWorldTime() {
        return this.worldInfo.getWorldTotalTime();
    }
    
    private static boolean lllIllIIlIIIlIl(final Object lllllllllllllIIIlIIlIlIIllIIIIll, final Object lllllllllllllIIIlIIlIlIIllIIIIlI) {
        return lllllllllllllIIIlIIlIlIIllIIIIll == lllllllllllllIIIlIIlIlIIllIIIIlI;
    }
    
    public boolean isBlockLoaded(final BlockPos lllllllllllllIIIlIlIIIIlIIIIlIlI, final boolean lllllllllllllIIIlIlIIIIlIIIIlIIl) {
        int chunkLoaded;
        if (lllIllIIlIIIllI(this.isValid(lllllllllllllIIIlIlIIIIlIIIIlIlI) ? 1 : 0)) {
            chunkLoaded = World.lIlIlIIlIlIllI[5];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x5D ^ 0x65 ^ (0xB8 ^ 0x84)) & (0xFD ^ 0xAB ^ (0x26 ^ 0x74) ^ -" ".length())) != 0x0;
            }
        }
        else {
            chunkLoaded = (this.isChunkLoaded(lllllllllllllIIIlIlIIIIlIIIIlIlI.getX() >> World.lIlIlIIlIlIllI[12], lllllllllllllIIIlIlIIIIlIIIIlIlI.getZ() >> World.lIlIlIIlIlIllI[12], lllllllllllllIIIlIlIIIIlIIIIlIIl) ? 1 : 0);
        }
        return chunkLoaded != 0;
    }
    
    public boolean isAABBInMaterial(final AxisAlignedBB lllllllllllllIIIlIIllIlIllIIIllI, final Material lllllllllllllIIIlIIllIlIllIIIlIl) {
        final int lllllllllllllIIIlIIllIlIllIIIlII = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllIIIllI.minX);
        final int lllllllllllllIIIlIIllIlIllIIIIll = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllIIIllI.maxX + 1.0);
        final int lllllllllllllIIIlIIllIlIllIIIIlI = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllIIIllI.minY);
        final int lllllllllllllIIIlIIllIlIllIIIIIl = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllIIIllI.maxY + 1.0);
        final int lllllllllllllIIIlIIllIlIllIIIIII = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllIIIllI.minZ);
        final int lllllllllllllIIIlIIllIlIlIllllll = MathHelper.floor_double(lllllllllllllIIIlIIllIlIllIIIllI.maxZ + 1.0);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIIllIlIlIlllllI = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIIllIlIlIllllIl = lllllllllllllIIIlIIllIlIllIIIlII;
        "".length();
        if (((0x6D ^ 0x46 ^ (0xE1 ^ 0xC5)) & (80 + 29 - 99 + 145 ^ 112 + 131 - 160 + 65 ^ -" ".length())) > 0) {
            return ((0x38 ^ 0x5 ^ (0xB4 ^ 0xAB)) & (159 + 39 - 122 + 85 ^ 13 + 45 + 30 + 43 ^ -" ".length()) & (((100 + 61 - 150 + 178 ^ 77 + 114 - 125 + 100) & (0x69 ^ 0x18 ^ (0xDE ^ 0xB4) ^ -" ".length())) ^ -" ".length())) != 0x0;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIlIllllIl, lllllllllllllIIIlIIllIlIllIIIIll)) {
            int lllllllllllllIIIlIIllIlIlIllllII = lllllllllllllIIIlIIllIlIllIIIIlI;
            "".length();
            if (((0x74 ^ 0x2E ^ (0x0 ^ 0x6A)) & (7 + 61 + 9 + 79 ^ 79 + 20 + 37 + 36 ^ -" ".length())) < -" ".length()) {
                return ((98 + 60 - 126 + 158 ^ 3 + 59 + 79 + 38) & (0xE7 ^ 0x8C ^ (0x13 ^ 0x75) ^ -" ".length())) != 0x0;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIlIllllII, lllllllllllllIIIlIIllIlIllIIIIIl)) {
                int lllllllllllllIIIlIIllIlIlIlllIll = lllllllllllllIIIlIIllIlIllIIIIII;
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0x27 ^ 0x6A) & ~(0x2A ^ 0x67)) != 0x0;
                }
                while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIllIlIlIlllIll, lllllllllllllIIIlIIllIlIlIllllll)) {
                    final IBlockState lllllllllllllIIIlIIllIlIlIlllIlI = this.getBlockState(lllllllllllllIIIlIIllIlIlIlllllI.func_181079_c(lllllllllllllIIIlIIllIlIlIllllIl, lllllllllllllIIIlIIllIlIlIllllII, lllllllllllllIIIlIIllIlIlIlllIll));
                    final Block lllllllllllllIIIlIIllIlIlIlllIIl = lllllllllllllIIIlIIllIlIlIlllIlI.getBlock();
                    if (lllIllIIlIIIlIl(lllllllllllllIIIlIIllIlIlIlllIIl.getMaterial(), lllllllllllllIIIlIIllIlIllIIIlIl)) {
                        final int lllllllllllllIIIlIIllIlIlIlllIII = lllllllllllllIIIlIIllIlIlIlllIlI.getValue((IProperty<Integer>)BlockLiquid.LEVEL);
                        double lllllllllllllIIIlIIllIlIlIllIlll = lllllllllllllIIIlIIllIlIlIllllII + World.lIlIlIIlIlIllI[3];
                        if (lllIllIIlIIIIll(lllllllllllllIIIlIIllIlIlIlllIII, World.lIlIlIIlIlIllI[7])) {
                            lllllllllllllIIIlIIllIlIlIllIlll = lllllllllllllIIIlIIllIlIlIllllII + World.lIlIlIIlIlIllI[3] - lllllllllllllIIIlIIllIlIlIlllIII / 8.0;
                        }
                        if (lllIllIIlIIIlII(lllIllIIlIllIIl(lllllllllllllIIIlIIllIlIlIllIlll, lllllllllllllIIIlIIllIlIllIIIllI.minY))) {
                            return World.lIlIlIIlIlIllI[3] != 0;
                        }
                    }
                    ++lllllllllllllIIIlIIllIlIlIlllIll;
                }
                ++lllllllllllllIIIlIIllIlIlIllllII;
            }
            ++lllllllllllllIIIlIIllIlIlIllllIl;
        }
        return World.lIlIlIIlIlIllI[5] != 0;
    }
    
    public float getThunderStrength(final float lllllllllllllIIIlIIlIllIIIlIlIII) {
        return (this.prevThunderingStrength + (this.thunderingStrength - this.prevThunderingStrength) * lllllllllllllIIIlIIlIllIIIlIlIII) * this.getRainStrength(lllllllllllllIIIlIIlIllIIIlIlIII);
    }
    
    public void unloadEntities(final Collection<Entity> lllllllllllllIIIlIIlIlllIllIllll) {
        this.unloadedEntityList.addAll(lllllllllllllIIIlIIlIlllIllIllll);
        "".length();
    }
    
    public void spawnParticle(final EnumParticleTypes lllllllllllllIIIlIIllllIIllIIIII, final double lllllllllllllIIIlIIllllIIlIlllll, final double lllllllllllllIIIlIIllllIIlIllllI, final double lllllllllllllIIIlIIllllIIlIlllIl, final double lllllllllllllIIIlIIllllIIllIIlIl, final double lllllllllllllIIIlIIllllIIllIIlII, final double lllllllllllllIIIlIIllllIIlIllIlI, final int... lllllllllllllIIIlIIllllIIlIllIIl) {
        this.spawnParticle(lllllllllllllIIIlIIllllIIllIIIII.getParticleID(), lllllllllllllIIIlIIllllIIllIIIII.getShouldIgnoreRange(), lllllllllllllIIIlIIllllIIlIlllll, lllllllllllllIIIlIIllllIIlIllllI, lllllllllllllIIIlIIllllIIlIlllIl, lllllllllllllIIIlIIllllIIllIIlIl, lllllllllllllIIIlIIllllIIllIIlII, lllllllllllllIIIlIIllllIIlIllIlI, lllllllllllllIIIlIIllllIIlIllIIl);
    }
    
    public List<AxisAlignedBB> getCollidingBoundingBoxes(final Entity lllllllllllllIIIlIIlllIllIllllII, final AxisAlignedBB lllllllllllllIIIlIIlllIllIlIIlII) {
        final List<AxisAlignedBB> lllllllllllllIIIlIIlllIllIlllIlI = (List<AxisAlignedBB>)Lists.newArrayList();
        final int lllllllllllllIIIlIIlllIllIlllIIl = MathHelper.floor_double(lllllllllllllIIIlIIlllIllIlIIlII.minX);
        final int lllllllllllllIIIlIIlllIllIlllIII = MathHelper.floor_double(lllllllllllllIIIlIIlllIllIlIIlII.maxX + 1.0);
        final int lllllllllllllIIIlIIlllIllIllIlll = MathHelper.floor_double(lllllllllllllIIIlIIlllIllIlIIlII.minY);
        final int lllllllllllllIIIlIIlllIllIllIllI = MathHelper.floor_double(lllllllllllllIIIlIIlllIllIlIIlII.maxY + 1.0);
        final int lllllllllllllIIIlIIlllIllIllIlIl = MathHelper.floor_double(lllllllllllllIIIlIIlllIllIlIIlII.minZ);
        final int lllllllllllllIIIlIIlllIllIllIlII = MathHelper.floor_double(lllllllllllllIIIlIIlllIllIlIIlII.maxZ + 1.0);
        final WorldBorder lllllllllllllIIIlIIlllIllIllIIll = this.getWorldBorder();
        final boolean lllllllllllllIIIlIIlllIllIllIIlI = lllllllllllllIIIlIIlllIllIllllII.isOutsideBorder();
        final boolean lllllllllllllIIIlIIlllIllIllIIIl = this.isInsideBorder(lllllllllllllIIIlIIlllIllIllIIll, lllllllllllllIIIlIIlllIllIllllII);
        final IBlockState lllllllllllllIIIlIIlllIllIllIIII = Blocks.stone.getDefaultState();
        final BlockPos.MutableBlockPos lllllllllllllIIIlIIlllIllIlIllll = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIIlllIllIlIlllI = lllllllllllllIIIlIIlllIllIlllIIl;
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIllIlIlllI, lllllllllllllIIIlIIlllIllIlllIII)) {
            int lllllllllllllIIIlIIlllIllIlIllIl = lllllllllllllIIIlIIlllIllIllIlIl;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
            while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIllIlIllIl, lllllllllllllIIIlIIlllIllIllIlII)) {
                if (lllIllIIlIIIIIl(this.isBlockLoaded(lllllllllllllIIIlIIlllIllIlIllll.func_181079_c(lllllllllllllIIIlIIlllIllIlIlllI, World.lIlIlIIlIlIllI[8], lllllllllllllIIIlIIlllIllIlIllIl)) ? 1 : 0)) {
                    int lllllllllllllIIIlIIlllIllIlIllII = lllllllllllllIIIlIIlllIllIllIlll - World.lIlIlIIlIlIllI[3];
                    "".length();
                    if ("  ".length() == ((40 + 23 + 7 + 73 ^ 93 + 136 - 209 + 170) & (0x31 ^ 0x7F ^ 91 + 63 - 119 + 92 ^ -" ".length()))) {
                        return null;
                    }
                    while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIllIlIllII, lllllllllllllIIIlIIlllIllIllIllI)) {
                        lllllllllllllIIIlIIlllIllIlIllll.func_181079_c(lllllllllllllIIIlIIlllIllIlIlllI, lllllllllllllIIIlIIlllIllIlIllII, lllllllllllllIIIlIIlllIllIlIllIl);
                        "".length();
                        if (lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIllIllIIlI ? 1 : 0) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIllIllIIIl ? 1 : 0)) {
                            lllllllllllllIIIlIIlllIllIllllII.setOutsideBorder((boolean)(World.lIlIlIIlIlIllI[5] != 0));
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else if (lllIllIIlIIIllI(lllllllllllllIIIlIIlllIllIllIIlI ? 1 : 0) && lllIllIIlIIIllI(lllllllllllllIIIlIIlllIllIllIIIl ? 1 : 0)) {
                            lllllllllllllIIIlIIlllIllIllllII.setOutsideBorder((boolean)(World.lIlIlIIlIlIllI[3] != 0));
                        }
                        IBlockState lllllllllllllIIIlIIlllIllIlIlIll = lllllllllllllIIIlIIlllIllIllIIII;
                        if (!lllIllIIlIIIllI(lllllllllllllIIIlIIlllIllIllIIll.contains(lllllllllllllIIIlIIlllIllIlIllll) ? 1 : 0) || lllIllIIlIIIllI(lllllllllllllIIIlIIlllIllIllIIIl ? 1 : 0)) {
                            lllllllllllllIIIlIIlllIllIlIlIll = this.getBlockState(lllllllllllllIIIlIIlllIllIlIllll);
                        }
                        lllllllllllllIIIlIIlllIllIlIlIll.getBlock().addCollisionBoxesToList(this, lllllllllllllIIIlIIlllIllIlIllll, lllllllllllllIIIlIIlllIllIlIlIll, lllllllllllllIIIlIIlllIllIlIIlII, lllllllllllllIIIlIIlllIllIlllIlI, lllllllllllllIIIlIIlllIllIllllII);
                        ++lllllllllllllIIIlIIlllIllIlIllII;
                    }
                }
                ++lllllllllllllIIIlIIlllIllIlIllIl;
            }
            ++lllllllllllllIIIlIIlllIllIlIlllI;
        }
        final double lllllllllllllIIIlIIlllIllIlIlIlI = 0.25;
        final List<Entity> lllllllllllllIIIlIIlllIllIlIlIIl = this.getEntitiesWithinAABBExcludingEntity(lllllllllllllIIIlIIlllIllIllllII, lllllllllllllIIIlIIlllIllIlIIlII.expand(lllllllllllllIIIlIIlllIllIlIlIlI, lllllllllllllIIIlIIlllIllIlIlIlI, lllllllllllllIIIlIIlllIllIlIlIlI));
        int lllllllllllllIIIlIIlllIllIlIlIII = World.lIlIlIIlIlIllI[5];
        "".length();
        if ((0xEE ^ 0x95 ^ 6 + 3 + 59 + 59) <= "  ".length()) {
            return null;
        }
        while (!lllIllIIlIIIIlI(lllllllllllllIIIlIIlllIllIlIlIII, lllllllllllllIIIlIIlllIllIlIlIIl.size())) {
            if (lllIllIIlIIlIll(lllllllllllllIIIlIIlllIllIllllII.riddenByEntity, lllllllllllllIIIlIIlllIllIlIlIIl) && lllIllIIlIIlIll(lllllllllllllIIIlIIlllIllIllllII.ridingEntity, lllllllllllllIIIlIIlllIllIlIlIIl)) {
                AxisAlignedBB lllllllllllllIIIlIIlllIllIlIIlll = lllllllllllllIIIlIIlllIllIlIlIIl.get(lllllllllllllIIIlIIlllIllIlIlIII).getCollisionBoundingBox();
                if (lllIllIIlIlIIIl(lllllllllllllIIIlIIlllIllIlIIlll) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIllIlIIlll.intersectsWith(lllllllllllllIIIlIIlllIllIlIIlII) ? 1 : 0)) {
                    lllllllllllllIIIlIIlllIllIlllIlI.add(lllllllllllllIIIlIIlllIllIlIIlll);
                    "".length();
                }
                lllllllllllllIIIlIIlllIllIlIIlll = lllllllllllllIIIlIIlllIllIllllII.getCollisionBox(lllllllllllllIIIlIIlllIllIlIlIIl.get(lllllllllllllIIIlIIlllIllIlIlIII));
                if (lllIllIIlIlIIIl(lllllllllllllIIIlIIlllIllIlIIlll) && lllIllIIlIIIIIl(lllllllllllllIIIlIIlllIllIlIIlll.intersectsWith(lllllllllllllIIIlIIlllIllIlIIlII) ? 1 : 0)) {
                    lllllllllllllIIIlIIlllIllIlllIlI.add(lllllllllllllIIIlIIlllIllIlIIlll);
                    "".length();
                }
            }
            ++lllllllllllllIIIlIIlllIllIlIlIII;
        }
        return lllllllllllllIIIlIIlllIllIlllIlI;
    }
    
    public void updateAllPlayersSleepingFlag() {
    }
    
    private static void lllIllIIlIIIIII() {
        (lIlIlIIlIlIllI = new int[62])[0] = (36 + 68 + 28 + 25 ^ 55 + 136 - 151 + 122);
        World.lIlIlIIlIlIllI[1] = (-(0xFFFFEFE5 & 0x1CBB) & (-1 & 0x3C6EFFFF));
        World.lIlIlIIlIlIllI[2] = (0xFFFFAEE8 & 0x7FF7);
        World.lIlIlIIlIlIllI[3] = " ".length();
        World.lIlIlIIlIlIllI[4] = (0xFFFFCCF3 & 0xB30C);
        World.lIlIlIIlIlIllI[5] = ((153 + 119 - 189 + 89 ^ 123 + 48 + 12 + 6) & (5 + 79 - 61 + 147 ^ 174 + 67 - 158 + 104 ^ -" ".length()));
        World.lIlIlIIlIlIllI[6] = "  ".length();
        World.lIlIlIIlIlIllI[7] = (0x4F ^ 0x47);
        World.lIlIlIIlIlIllI[8] = (155 + 89 - 69 + 32 ^ 25 + 18 + 30 + 70);
        World.lIlIlIIlIlIllI[9] = -(0xFFFFF3AD & 0x1C9CFD2);
        World.lIlIlIIlIlIllI[10] = (0xFFFFEBD4 & 0x1C9D7AB);
        World.lIlIlIIlIlIllI[11] = (-(0xFFFFFEC7 & 0x3FBE) & (0xFFFFBFB7 & 0x7FCD));
        World.lIlIlIIlIlIllI[12] = (0x25 ^ 0x21);
        World.lIlIlIIlIlIllI[13] = "   ".length();
        World.lIlIlIIlIlIllI[14] = (0xFFFFB7D7 & 0x4FF9);
        World.lIlIlIIlIlIllI[15] = (130 + 174 - 151 + 37 ^ 71 + 45 - 37 + 108);
        World.lIlIlIIlIlIllI[16] = (0x9A ^ 0x9C);
        World.lIlIlIIlIlIllI[17] = (0x6C ^ 0x42) + (0x98 ^ 0xA4) - (0x57 ^ 0x5A) + (115 + 107 - 195 + 135);
        World.lIlIlIIlIlIllI[18] = (0xCB ^ 0xC4);
        World.lIlIlIIlIlIllI[19] = (0x8F ^ 0x9B);
        World.lIlIlIIlIlIllI[20] = (0x3E ^ 0x1) + (141 + 162 - 152 + 27) - (0xDE ^ 0xA2) + (0x27 ^ 0x74);
        World.lIlIlIIlIlIllI[21] = (0x8D ^ 0x9D);
        World.lIlIlIIlIlIllI[22] = (0xAD ^ 0xAA);
        World.lIlIlIIlIlIllI[23] = (0x17 ^ 0x1E);
        World.lIlIlIIlIlIllI[24] = (0xFA ^ 0x92 ^ (0x69 ^ 0xB));
        World.lIlIlIIlIlIllI[25] = (0x6C ^ 0x67);
        World.lIlIlIIlIlIllI[26] = (0xAD ^ 0xA1);
        World.lIlIlIIlIlIllI[27] = (130 + 123 - 106 + 15 ^ 89 + 114 - 156 + 128);
        World.lIlIlIIlIlIllI[28] = (0x53 ^ 0x5D);
        World.lIlIlIIlIlIllI[29] = (0x79 ^ 0x68);
        World.lIlIlIIlIlIllI[30] = (139 + 153 - 252 + 119 ^ 46 + 12 - 37 + 120);
        World.lIlIlIIlIlIllI[31] = (0x16 ^ 0x5);
        World.lIlIlIIlIlIllI[32] = (0x96 ^ 0x83);
        World.lIlIlIIlIlIllI[33] = (0xE4 ^ 0xB8 ^ (0x35 ^ 0x7F));
        World.lIlIlIIlIlIllI[34] = (0x36 ^ 0x16);
        World.lIlIlIIlIlIllI[35] = (162 + 28 - 64 + 39 ^ 35 + 154 - 32 + 21);
        World.lIlIlIIlIlIllI[36] = (0xFFFFFBFD & 0x7EE);
        World.lIlIlIIlIlIllI[37] = (0x88 ^ 0x90);
        World.lIlIlIIlIlIllI[38] = (-(0xFFFFB8FF & 0x776B) & (0xFFFFBE7B & 0x7FFE));
        World.lIlIlIIlIlIllI[39] = (0xFFFFDC45 & 0x2B3FA);
        World.lIlIlIIlIlIllI[40] = (0x1 ^ 0x40 ^ (0xE2 ^ 0xBA));
        World.lIlIlIIlIlIllI[41] = (0x9B ^ 0x81);
        World.lIlIlIIlIlIllI[42] = (1 + 85 - 32 + 86 ^ 96 + 106 - 103 + 52);
        World.lIlIlIIlIlIllI[43] = (38 + 9 - 38 + 134 ^ 10 + 24 + 14 + 99);
        World.lIlIlIIlIlIllI[44] = (-(0xFFFFAEDF & 0x592B) & (0xFFFFDFFF & 0x3F7A));
        World.lIlIlIIlIlIllI[45] = (0x1 ^ 0x64 ^ (0xEA ^ 0x92));
        World.lIlIlIIlIlIllI[46] = (0x90 ^ 0x8E);
        World.lIlIlIIlIlIllI[47] = (0xFFFFEEA2 & 0x2197D);
        World.lIlIlIIlIlIllI[48] = (0x20 ^ 0x3F);
        World.lIlIlIIlIlIllI[49] = (0xBD ^ 0x9C);
        World.lIlIlIIlIlIllI[50] = (0x81 ^ 0x95 ^ (0x4D ^ 0x7B));
        World.lIlIlIIlIlIllI[51] = (0xB8 ^ 0xC1 ^ (0x1A ^ 0x40));
        World.lIlIlIIlIlIllI[52] = (4 + 93 + 74 + 3 ^ 108 + 58 - 76 + 48);
        World.lIlIlIIlIlIllI[53] = (0xB ^ 0x2E);
        World.lIlIlIIlIlIllI[54] = (0x43 ^ 0x2) + (0x66 ^ 0x4) - (0x36 ^ 0x59) + (0x88 ^ 0xC4);
        World.lIlIlIIlIlIllI[55] = (72 + 96 - 89 + 150 ^ 139 + 8 - 5 + 53);
        World.lIlIlIIlIlIllI[56] = (18 + 82 - 95 + 143 ^ 143 + 74 - 192 + 154);
        World.lIlIlIIlIlIllI[57] = (0xA ^ 0x76 ^ (0x38 ^ 0x6C));
        World.lIlIlIIlIlIllI[58] = (0xAE ^ 0x87);
        World.lIlIlIIlIlIllI[59] = (0x46 ^ 0x5E ^ (0x24 ^ 0x16));
        World.lIlIlIIlIlIllI[60] = (0xBA ^ 0x91);
        World.lIlIlIIlIlIllI[61] = (0x47 ^ 0x6B);
    }
    
    private static int lllIllIIlIIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllIllIIlIIlIll(final Object lllllllllllllIIIlIIlIlIIllIIIlll, final Object lllllllllllllIIIlIIlIlIIllIIIllI) {
        return lllllllllllllIIIlIIlIlIIllIIIlll != lllllllllllllIIIlIIlIlIIllIIIllI;
    }
    
    public void initialize(final WorldSettings lllllllllllllIIIlIlIIIIlIIlIllII) {
        this.worldInfo.setServerInitialized((boolean)(World.lIlIlIIlIlIllI[3] != 0));
    }
    
    private static int lllIllIIllIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public float getCelestialAngle(final float lllllllllllllIIIlIIlllIIllllllIl) {
        return this.provider.calculateCelestialAngle(this.worldInfo.getWorldTime(), lllllllllllllIIIlIIlllIIllllllIl);
    }
    
    public void notifyNeighborsOfStateExcept(final BlockPos lllllllllllllIIIlIlIIIIIIIIIlIIl, final Block lllllllllllllIIIlIlIIIIIIIIIlIII, final EnumFacing lllllllllllllIIIlIlIIIIIIIIIIlll) {
        if (lllIllIIlIIlIll(lllllllllllllIIIlIlIIIIIIIIIIlll, EnumFacing.WEST)) {
            this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIIlIIl.west(), lllllllllllllIIIlIlIIIIIIIIIlIII);
        }
        if (lllIllIIlIIlIll(lllllllllllllIIIlIlIIIIIIIIIIlll, EnumFacing.EAST)) {
            this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIIlIIl.east(), lllllllllllllIIIlIlIIIIIIIIIlIII);
        }
        if (lllIllIIlIIlIll(lllllllllllllIIIlIlIIIIIIIIIIlll, EnumFacing.DOWN)) {
            this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIIlIIl.down(), lllllllllllllIIIlIlIIIIIIIIIlIII);
        }
        if (lllIllIIlIIlIll(lllllllllllllIIIlIlIIIIIIIIIIlll, EnumFacing.UP)) {
            this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIIlIIl.up(), lllllllllllllIIIlIlIIIIIIIIIlIII);
        }
        if (lllIllIIlIIlIll(lllllllllllllIIIlIlIIIIIIIIIIlll, EnumFacing.NORTH)) {
            this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIIlIIl.north(), lllllllllllllIIIlIlIIIIIIIIIlIII);
        }
        if (lllIllIIlIIlIll(lllllllllllllIIIlIlIIIIIIIIIIlll, EnumFacing.SOUTH)) {
            this.notifyBlockOfStateChange(lllllllllllllIIIlIlIIIIIIIIIlIIl.south(), lllllllllllllIIIlIlIIIIIIIIIlIII);
        }
    }
}
