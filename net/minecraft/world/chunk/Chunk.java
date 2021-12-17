// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import com.google.common.collect.Queues;
import com.google.common.collect.Maps;
import net.minecraft.block.ITileEntityProvider;
import java.util.Arrays;
import net.minecraft.world.gen.ChunkProviderDebug;
import net.minecraft.world.WorldType;
import java.util.Random;
import net.minecraft.util.EnumFacing;
import net.minecraft.crash.CrashReport;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import com.google.common.base.Predicate;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import java.util.Collection;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import java.util.concurrent.Callable;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.world.EnumSkyBlock;
import org.apache.logging.log4j.LogManager;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.Iterator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import java.util.Map;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.util.BlockPos;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.logging.log4j.Logger;

public class Chunk
{
    private final /* synthetic */ byte[] blockBiomeArray;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ boolean isTerrainPopulated;
    public final /* synthetic */ int zPosition;
    private /* synthetic */ ConcurrentLinkedQueue<BlockPos> tileEntityPosQueue;
    private /* synthetic */ boolean field_150815_m;
    private final /* synthetic */ ExtendedBlockStorage[] storageArrays;
    private final /* synthetic */ ClassInheritanceMultiMap<Entity>[] entityLists;
    private /* synthetic */ boolean hasEntities;
    private /* synthetic */ int heightMapMinimum;
    private /* synthetic */ boolean isGapLightingUpdated;
    private /* synthetic */ long inhabitedTime;
    private /* synthetic */ boolean isLightPopulated;
    private static final /* synthetic */ String[] lIlIIIllllIlll;
    private /* synthetic */ boolean isModified;
    private static final /* synthetic */ int[] lIlIIlIIIIlIIl;
    private /* synthetic */ long lastSaveTime;
    private final /* synthetic */ boolean[] updateSkylightColumns;
    private final /* synthetic */ int[] precipitationHeightMap;
    private final /* synthetic */ int[] heightMap;
    private /* synthetic */ int queuedLightChecks;
    private final /* synthetic */ World worldObj;
    public final /* synthetic */ int xPosition;
    private /* synthetic */ boolean isChunkLoaded;
    private final /* synthetic */ Map<BlockPos, TileEntity> chunkTileEntityMap;
    
    public Chunk(final World lllllllllllllIIIlllIlIlIllllIllI, final ChunkPrimer lllllllllllllIIIlllIlIlIlllIlIII, final int lllllllllllllIIIlllIlIlIllllIlII, final int lllllllllllllIIIlllIlIlIlllIIllI) {
        this(lllllllllllllIIIlllIlIlIllllIllI, lllllllllllllIIIlllIlIlIllllIlII, lllllllllllllIIIlllIlIlIlllIIllI);
        final int lllllllllllllIIIlllIlIlIllllIIlI = Chunk.lIlIIlIIIIlIIl[1];
        int n;
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIlIllllIllI.provider.getHasNoSky() ? 1 : 0)) {
            n = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if ("  ".length() < 0) {
                throw null;
            }
        }
        else {
            n = Chunk.lIlIIlIIIIlIIl[6];
        }
        final boolean lllllllllllllIIIlllIlIlIllllIIIl = n != 0;
        int lllllllllllllIIIlllIlIlIllllIIII = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIllllIIII, Chunk.lIlIIlIIIIlIIl[0])) {
            int lllllllllllllIIIlllIlIlIlllIllll = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if ("  ".length() != "  ".length()) {
                throw null;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIlllIllll, Chunk.lIlIIlIIIIlIIl[0])) {
                int lllllllllllllIIIlllIlIlIlllIlllI = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if ((0xB3 ^ 0xB7) < ((0x2F ^ 0x3C) & ~(0x51 ^ 0x42))) {
                    throw null;
                }
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIlllIlllI, lllllllllllllIIIlllIlIlIllllIIlI)) {
                    final int lllllllllllllIIIlllIlIlIlllIllIl = lllllllllllllIIIlllIlIlIllllIIII * lllllllllllllIIIlllIlIlIllllIIlI * Chunk.lIlIIlIIIIlIIl[0] | lllllllllllllIIIlllIlIlIlllIllll * lllllllllllllIIIlllIlIlIllllIIlI | lllllllllllllIIIlllIlIlIlllIlllI;
                    final IBlockState lllllllllllllIIIlllIlIlIlllIllII = lllllllllllllIIIlllIlIlIlllIlIII.getBlockState(lllllllllllllIIIlllIlIlIlllIllIl);
                    if (lllIIlIIllIIIll(lllllllllllllIIIlllIlIlIlllIllII.getBlock().getMaterial(), Material.air)) {
                        final int lllllllllllllIIIlllIlIlIlllIlIll = lllllllllllllIIIlllIlIlIlllIlllI >> Chunk.lIlIIlIIIIlIIl[7];
                        if (lllIIlIIllIIlII(this.storageArrays[lllllllllllllIIIlllIlIlIlllIlIll])) {
                            this.storageArrays[lllllllllllllIIIlllIlIlIlllIlIll] = new ExtendedBlockStorage(lllllllllllllIIIlllIlIlIlllIlIll << Chunk.lIlIIlIIIIlIIl[7], lllllllllllllIIIlllIlIlIllllIIIl);
                        }
                        this.storageArrays[lllllllllllllIIIlllIlIlIlllIlIll].set(lllllllllllllIIIlllIlIlIllllIIII, lllllllllllllIIIlllIlIlIlllIlllI & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIlIlllIllll, lllllllllllllIIIlllIlIlIlllIllII);
                    }
                    ++lllllllllllllIIIlllIlIlIlllIlllI;
                }
                ++lllllllllllllIIIlllIlIlIlllIllll;
            }
            ++lllllllllllllIIIlllIlIlIllllIIII;
        }
    }
    
    public boolean getAreLevelsEmpty(int lllllllllllllIIIlllIlIIIIIIIllIl, int lllllllllllllIIIlllIlIIIIIIIllII) {
        if (lllIIlIIllIIlll(lllllllllllllIIIlllIlIIIIIIIllIl)) {
            lllllllllllllIIIlllIlIIIIIIIllIl = Chunk.lIlIIlIIIIlIIl[3];
        }
        if (lllIIlIIllIIIIl((int)lllllllllllllIIIlllIlIIIIIIIllII, Chunk.lIlIIlIIIIlIIl[1])) {
            lllllllllllllIIIlllIlIIIIIIIllII = Chunk.lIlIIlIIIIlIIl[11];
        }
        int lllllllllllllIIIlllIlIIIIIIlIIII = lllllllllllllIIIlllIlIIIIIIIllIl;
        "".length();
        if (-"  ".length() >= 0) {
            return ((0x76 ^ 0x5D ^ (0xA3 ^ 0x97)) & (0x42 ^ 0x3 ^ (0xC8 ^ 0x96) ^ -" ".length())) != 0x0;
        }
        while (!lllIIlIIllIllIl(lllllllllllllIIIlllIlIIIIIIlIIII, (int)lllllllllllllIIIlllIlIIIIIIIllII)) {
            final ExtendedBlockStorage lllllllllllllIIIlllIlIIIIIIIllll = this.storageArrays[lllllllllllllIIIlllIlIIIIIIlIIII >> Chunk.lIlIIlIIIIlIIl[7]];
            if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIIIIIIIllll) && lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIIIIIIllll.isEmpty() ? 1 : 0)) {
                return Chunk.lIlIIlIIIIlIIl[3] != 0;
            }
            lllllllllllllIIIlllIlIIIIIIlIIII += 16;
        }
        return Chunk.lIlIIlIIIIlIIl[6] != 0;
    }
    
    private static void lllIIlIIIllIIIl() {
        (lIlIIIllllIlll = new String[Chunk.lIlIIlIIIIlIIl[31]])[Chunk.lIlIIlIIIIlIIl[3]] = lllIIlIIIlIIlII("q4ic0DR86lNNxGWnAWoglQ==", "njCGT");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[6]] = lllIIlIIIlIlIll("FwMGLjw+AVI4OT8FGQ==", "PfrZU");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[12]] = lllIIlIIIlIIlII("nDOIfRL5a956wTWE2fsv4g==", "tVOyG");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[13]] = lllIIlIIIlIlIll("GAIPMCw9AgI=", "TmlQX");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[7]] = lllIIlIIIlIlIll("DRQ5JChvGjMuLShYMSg3", "OxVGC");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[14]] = lllIIlIIIlIIlII("XWctpn/knGEvzMEBuwchzQ==", "osPTG");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[17]] = lllIIlIIIlIlllI("i1ldzRdAcYDX4hEJav1NjII3WVvThdei", "xcxmq");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[18]] = lllIIlIIIlIlllI("xacXbqXvtP0XbCVVLTxOaQ==", "WvQWW");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[10]] = lllIIlIIIlIlIll("KxUFMyMOFQg=", "gzfRW");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[19]] = lllIIlIIIlIIlII("lQQAlq5QgwYWx+hrJ2Mzt7FfGsJi0UYB", "pUcOF");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[20]] = lllIIlIIIlIlIll("Z1A=", "KpSNL");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[21]] = lllIIlIIIlIIlII("eVSHvDoEg40RjJKj2bkuTA==", "HnEZM");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[22]] = lllIIlIIIlIlllI("HlbeFUsgq/0=", "scRSw");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[23]] = lllIIlIIIlIlIll("Z0dO", "NknkJ");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[27]] = lllIIlIIIlIlllI("inSq4QaNWOqy8CEDd50HHJALFtgJmjn5MEEPD53R/aI3DBtlSTaXliCi/mDtAyPTjE4oEmzob+w=", "MugpY");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[8]] = lllIIlIIIlIlllI("Cvblel20eRntpTckxERAgg==", "rsxpT");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[0]] = lllIIlIIIlIIlII("/UPjRDjJWYer3nP48/y3fsOw22q4Gcjhy+54AGt1H6p8POMJ9Ysda+UTrflIWLFSeRF3Sw6U1gU=", "RNlma");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[28]] = lllIIlIIIlIIlII("A55nWYYLoy11gpIimWx4zw==", "HxSQl");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[29]] = lllIIlIIIlIIlII("kVL2cLJAtFXJ8ecoBfPD8AY7aL1fe0h+uwbHoTMhXkpABNA7XIx7pOPnyylqY7mq0iEBoOQ4y04=", "OwmQZ");
        Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[30]] = lllIIlIIIlIIlII("Iad4NcYER2W0rxNcEI7Clw==", "jSYhL");
    }
    
    private void checkSkylightNeighborHeight(final int lllllllllllllIIIlllIlIlIIllIIlII, final int lllllllllllllIIIlllIlIlIIlIllllI, final int lllllllllllllIIIlllIlIlIIlIlllIl) {
        final int lllllllllllllIIIlllIlIlIIllIIIIl = this.worldObj.getHeight(new BlockPos(lllllllllllllIIIlllIlIlIIllIIlII, Chunk.lIlIIlIIIIlIIl[3], lllllllllllllIIIlllIlIlIIlIllllI)).getY();
        if (lllIIlIIllIllIl(lllllllllllllIIIlllIlIlIIllIIIIl, lllllllllllllIIIlllIlIlIIlIlllIl)) {
            this.updateSkylightNeighborHeight(lllllllllllllIIIlllIlIlIIllIIlII, lllllllllllllIIIlllIlIlIIlIllllI, lllllllllllllIIIlllIlIlIIlIlllIl, lllllllllllllIIIlllIlIlIIllIIIIl + Chunk.lIlIIlIIIIlIIl[6]);
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else if (lllIIlIIllIlIII(lllllllllllllIIIlllIlIlIIllIIIIl, lllllllllllllIIIlllIlIlIIlIlllIl)) {
            this.updateSkylightNeighborHeight(lllllllllllllIIIlllIlIlIIllIIlII, lllllllllllllIIIlllIlIlIIlIllllI, lllllllllllllIIIlllIlIlIIllIIIIl, lllllllllllllIIIlllIlIlIIlIlllIl + Chunk.lIlIIlIIIIlIIl[6]);
        }
    }
    
    public void fillChunk(final byte[] lllllllllllllIIIlllIIlllllllIllI, final int lllllllllllllIIIlllIIllllllIIllI, final boolean lllllllllllllIIIlllIIlllllllIlII) {
        int lllllllllllllIIIlllIIlllllllIIll = Chunk.lIlIIlIIIIlIIl[3];
        int n;
        if (lllIIlIIllIIIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
            n = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if (((0x3E ^ 0x0) & ~(0x4D ^ 0x73)) > "   ".length()) {
                return;
            }
        }
        else {
            n = Chunk.lIlIIlIIIIlIIl[6];
        }
        final boolean lllllllllllllIIIlllIIlllllllIIlI = n != 0;
        int lllllllllllllIIIlllIIlllllllIIIl = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIlllllllIIIl, this.storageArrays.length)) {
            if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIllllllIIllI & Chunk.lIlIIlIIIIlIIl[6] << lllllllllllllIIIlllIIlllllllIIIl)) {
                if (lllIIlIIllIIlII(this.storageArrays[lllllllllllllIIIlllIIlllllllIIIl])) {
                    this.storageArrays[lllllllllllllIIIlllIIlllllllIIIl] = new ExtendedBlockStorage(lllllllllllllIIIlllIIlllllllIIIl << Chunk.lIlIIlIIIIlIIl[7], lllllllllllllIIIlllIIlllllllIIlI);
                }
                final char[] lllllllllllllIIIlllIIlllllllIIII = this.storageArrays[lllllllllllllIIIlllIIlllllllIIIl].getData();
                int lllllllllllllIIIlllIIllllllIllll = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (((0x96 ^ 0xB8) & ~(0x3 ^ 0x2D)) > 0) {
                    return;
                }
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllllIllll, lllllllllllllIIIlllIIlllllllIIII.length)) {
                    lllllllllllllIIIlllIIlllllllIIII[lllllllllllllIIIlllIIllllllIllll] = (char)((lllllllllllllIIIlllIIlllllllIllI[lllllllllllllIIIlllIIlllllllIIll + Chunk.lIlIIlIIIIlIIl[6]] & Chunk.lIlIIlIIIIlIIl[11]) << Chunk.lIlIIlIIIIlIIl[10] | (lllllllllllllIIIlllIIlllllllIllI[lllllllllllllIIIlllIIlllllllIIll] & Chunk.lIlIIlIIIIlIIl[11]));
                    lllllllllllllIIIlllIIlllllllIIll += 2;
                    ++lllllllllllllIIIlllIIllllllIllll;
                }
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            }
            else if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIlllllllIlII ? 1 : 0) && lllIIlIIllIIllI(this.storageArrays[lllllllllllllIIIlllIIlllllllIIIl])) {
                this.storageArrays[lllllllllllllIIIlllIIlllllllIIIl] = null;
            }
            ++lllllllllllllIIIlllIIlllllllIIIl;
        }
        int lllllllllllllIIIlllIIllllllIlllI = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if (" ".length() <= -" ".length()) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllllIlllI, this.storageArrays.length)) {
            if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIllllllIIllI & Chunk.lIlIIlIIIIlIIl[6] << lllllllllllllIIIlllIIllllllIlllI) && lllIIlIIllIIllI(this.storageArrays[lllllllllllllIIIlllIIllllllIlllI])) {
                final NibbleArray lllllllllllllIIIlllIIllllllIllIl = this.storageArrays[lllllllllllllIIIlllIIllllllIlllI].getBlocklightArray();
                System.arraycopy(lllllllllllllIIIlllIIlllllllIllI, lllllllllllllIIIlllIIlllllllIIll, lllllllllllllIIIlllIIllllllIllIl.getData(), Chunk.lIlIIlIIIIlIIl[3], lllllllllllllIIIlllIIllllllIllIl.getData().length);
                lllllllllllllIIIlllIIlllllllIIll += lllllllllllllIIIlllIIllllllIllIl.getData().length;
            }
            ++lllllllllllllIIIlllIIllllllIlllI;
        }
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIlllllllIIlI ? 1 : 0)) {
            int lllllllllllllIIIlllIIllllllIllII = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if (((0xA8 ^ 0x8A) & ~(0x95 ^ 0xB7)) != 0x0) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllllIllII, this.storageArrays.length)) {
                if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIllllllIIllI & Chunk.lIlIIlIIIIlIIl[6] << lllllllllllllIIIlllIIllllllIllII) && lllIIlIIllIIllI(this.storageArrays[lllllllllllllIIIlllIIllllllIllII])) {
                    final NibbleArray lllllllllllllIIIlllIIllllllIlIll = this.storageArrays[lllllllllllllIIIlllIIllllllIllII].getSkylightArray();
                    System.arraycopy(lllllllllllllIIIlllIIlllllllIllI, lllllllllllllIIIlllIIlllllllIIll, lllllllllllllIIIlllIIllllllIlIll.getData(), Chunk.lIlIIlIIIIlIIl[3], lllllllllllllIIIlllIIllllllIlIll.getData().length);
                    lllllllllllllIIIlllIIlllllllIIll += lllllllllllllIIIlllIIllllllIlIll.getData().length;
                }
                ++lllllllllllllIIIlllIIllllllIllII;
            }
        }
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIlllllllIlII ? 1 : 0)) {
            System.arraycopy(lllllllllllllIIIlllIIlllllllIllI, lllllllllllllIIIlllIIlllllllIIll, this.blockBiomeArray, Chunk.lIlIIlIIIIlIIl[3], this.blockBiomeArray.length);
            final int n2 = lllllllllllllIIIlllIIlllllllIIll + this.blockBiomeArray.length;
        }
        int lllllllllllllIIIlllIIllllllIlIlI = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if ("   ".length() == " ".length()) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllllIlIlI, this.storageArrays.length)) {
            if (lllIIlIIllIIllI(this.storageArrays[lllllllllllllIIIlllIIllllllIlIlI]) && lllIIlIIllIIIlI(lllllllllllllIIIlllIIllllllIIllI & Chunk.lIlIIlIIIIlIIl[6] << lllllllllllllIIIlllIIllllllIlIlI)) {
                this.storageArrays[lllllllllllllIIIlllIIllllllIlIlI].removeInvalidBlocks();
            }
            ++lllllllllllllIIIlllIIllllllIlIlI;
        }
        this.isLightPopulated = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        this.isTerrainPopulated = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        this.generateHeightMap();
        final Iterator<TileEntity> iterator = this.chunkTileEntityMap.values().iterator();
        "".length();
        if (((0x88 ^ 0x95) & ~(0x9D ^ 0x80)) != 0x0) {
            return;
        }
        while (!lllIIlIIllIlIlI(iterator.hasNext() ? 1 : 0)) {
            final TileEntity lllllllllllllIIIlllIIllllllIlIIl = iterator.next();
            lllllllllllllIIIlllIIllllllIlIIl.updateContainingBlockInfo();
        }
    }
    
    private static boolean lllIIlIIllIlllI(final int lllllllllllllIIIlllIIllIlIllIIII) {
        return lllllllllllllIIIlllIIllIlIllIIII >= 0;
    }
    
    public boolean isTerrainPopulated() {
        return this.isTerrainPopulated;
    }
    
    public Map<BlockPos, TileEntity> getTileEntityMap() {
        return this.chunkTileEntityMap;
    }
    
    public boolean isEmpty() {
        return Chunk.lIlIIlIIIIlIIl[3] != 0;
    }
    
    private static boolean lllIIlIIllIIIll(final Object lllllllllllllIIIlllIIllIlIllllll, final Object lllllllllllllIIIlllIIllIlIlllllI) {
        return lllllllllllllIIIlllIIllIlIllllll != lllllllllllllIIIlllIIllIlIlllllI;
    }
    
    public ChunkCoordIntPair getChunkCoordIntPair() {
        return new ChunkCoordIntPair(this.xPosition, this.zPosition);
    }
    
    static {
        lllIIlIIllIIIII();
        lllIIlIIIllIIIl();
        logger = LogManager.getLogger();
    }
    
    public void setChunkLoaded(final boolean lllllllllllllIIIlllIIlllIlIIllll) {
        this.isChunkLoaded = lllllllllllllIIIlllIIlllIlIIllll;
    }
    
    private static int lllIIlIIlllIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public int getLightFor(final EnumSkyBlock lllllllllllllIIIlllIlIIlIlllIIlI, final BlockPos lllllllllllllIIIlllIlIIlIllIlIlI) {
        final int lllllllllllllIIIlllIlIIlIlllIIII = lllllllllllllIIIlllIlIIlIllIlIlI.getX() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIlIllIllll = lllllllllllllIIIlllIlIIlIllIlIlI.getY();
        final int lllllllllllllIIIlllIlIIlIllIlllI = lllllllllllllIIIlllIlIIlIllIlIlI.getZ() & Chunk.lIlIIlIIIIlIIl[8];
        final ExtendedBlockStorage lllllllllllllIIIlllIlIIlIllIllIl = this.storageArrays[lllllllllllllIIIlllIlIIlIllIllll >> Chunk.lIlIIlIIIIlIIl[7]];
        int n;
        if (lllIIlIIllIIlII(lllllllllllllIIIlllIlIIlIllIllIl)) {
            if (lllIIlIIllIIIlI(this.canSeeSky(lllllllllllllIIIlllIlIIlIllIlIlI) ? 1 : 0)) {
                n = lllllllllllllIIIlllIlIIlIlllIIlI.defaultLightValue;
                "".length();
                if (-" ".length() > "   ".length()) {
                    return (0x25 ^ 0x47) & ~(0xF1 ^ 0x93);
                }
            }
            else {
                n = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if ((0xB6 ^ 0xB2) < "  ".length()) {
                    return (0x63 ^ 0x69) & ~(0x2C ^ 0x26);
                }
            }
        }
        else if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIlIlllIIlI, EnumSkyBlock.SKY)) {
            if (lllIIlIIllIIIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
                n = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (-" ".length() > 0) {
                    return (119 + 61 + 23 + 36 ^ 18 + 1 + 12 + 159) & (0x3A ^ 0x50 ^ (0x50 ^ 0x6B) ^ -" ".length());
                }
            }
            else {
                n = lllllllllllllIIIlllIlIIlIllIllIl.getExtSkylightValue(lllllllllllllIIIlllIlIIlIlllIIII, lllllllllllllIIIlllIlIIlIllIllll & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlIllIlllI);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return (173 + 172 - 214 + 50 ^ 136 + 148 - 160 + 41) & (33 + 2 + 66 + 36 ^ 118 + 40 - 39 + 34 ^ -" ".length());
                }
            }
        }
        else if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIlIlllIIlI, EnumSkyBlock.BLOCK)) {
            n = lllllllllllllIIIlllIlIIlIllIllIl.getExtBlocklightValue(lllllllllllllIIIlllIlIIlIlllIIII, lllllllllllllIIIlllIlIIlIllIllll & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlIllIlllI);
            "".length();
            if (-" ".length() >= ((151 + 14 - 89 + 92 ^ 48 + 114 - 41 + 20) & (0xB ^ 0x7C ^ (0xF1 ^ 0xA3) ^ -" ".length()))) {
                return (4 + 105 - 75 + 129 ^ 70 + 132 - 196 + 164) & (61 + 111 - 98 + 75 ^ 72 + 17 - 87 + 154 ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIIlllIlIIlIlllIIlI.defaultLightValue;
        }
        return n;
    }
    
    private static boolean lllIIlIIllIIllI(final Object lllllllllllllIIIlllIIllIlIllllII) {
        return lllllllllllllIIIlllIIllIlIllllII != null;
    }
    
    protected void generateHeightMap() {
        final int lllllllllllllIIIlllIlIlIlIllIlIl = this.getTopFilledSegment();
        this.heightMapMinimum = Chunk.lIlIIlIIIIlIIl[9];
        int lllllllllllllIIIlllIlIlIlIllIlII = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIlIllIlII, Chunk.lIlIIlIIIIlIIl[0])) {
            int lllllllllllllIIIlllIlIlIlIllIIll = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if ("  ".length() > (0xF ^ 0x36 ^ (0x18 ^ 0x25))) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIlIllIIll, Chunk.lIlIIlIIIIlIIl[0])) {
                this.precipitationHeightMap[lllllllllllllIIIlllIlIlIlIllIlII + (lllllllllllllIIIlllIlIlIlIllIIll << Chunk.lIlIIlIIIIlIIl[7])] = Chunk.lIlIIlIIIIlIIl[4];
                int lllllllllllllIIIlllIlIlIlIllIIlI = lllllllllllllIIIlllIlIlIlIllIlIl + Chunk.lIlIIlIIIIlIIl[0];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!lllIIlIIllIlIIl(lllllllllllllIIIlllIlIlIlIllIIlI)) {
                    final Block lllllllllllllIIIlllIlIlIlIllIIIl = this.getBlock0(lllllllllllllIIIlllIlIlIlIllIlII, lllllllllllllIIIlllIlIlIlIllIIlI - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIlIlIllIIll);
                    if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIlIlIllIIIl.getLightOpacity())) {
                        this.heightMap[lllllllllllllIIIlllIlIlIlIllIIll << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIlIlIllIlII] = lllllllllllllIIIlllIlIlIlIllIIlI;
                        if (!lllIIlIIllIlIII(lllllllllllllIIIlllIlIlIlIllIIlI, this.heightMapMinimum)) {
                            break;
                        }
                        this.heightMapMinimum = lllllllllllllIIIlllIlIlIlIllIIlI;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        --lllllllllllllIIIlllIlIlIlIllIIlI;
                    }
                }
                ++lllllllllllllIIIlllIlIlIlIllIIll;
            }
            ++lllllllllllllIIIlllIlIlIlIllIlII;
        }
        this.isModified = (Chunk.lIlIIlIIIIlIIl[6] != 0);
    }
    
    public void setChunkModified() {
        this.isModified = (Chunk.lIlIIlIIIIlIIl[6] != 0);
    }
    
    private void updateSkylightNeighborHeight(final int lllllllllllllIIIlllIlIlIIlIIlllI, final int lllllllllllllIIIlllIlIlIIlIIllIl, final int lllllllllllllIIIlllIlIlIIlIIllII, final int lllllllllllllIIIlllIlIlIIlIIlIll) {
        if (lllIIlIIllIllIl(lllllllllllllIIIlllIlIlIIlIIlIll, lllllllllllllIIIlllIlIlIIlIIllII) && lllIIlIIllIIIlI(this.worldObj.isAreaLoaded(new BlockPos(lllllllllllllIIIlllIlIlIIlIIlllI, Chunk.lIlIIlIIIIlIIl[3], lllllllllllllIIIlllIlIlIIlIIllIl), Chunk.lIlIIlIIIIlIIl[0]) ? 1 : 0)) {
            int lllllllllllllIIIlllIlIlIIlIlIIII = lllllllllllllIIIlllIlIlIIlIIllII;
            "".length();
            if (((0x45 ^ 0x3B ^ (0xA8 ^ 0x9D)) & (242 + 203 - 295 + 96 ^ 70 + 130 - 72 + 61 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIIlIlIIII, lllllllllllllIIIlllIlIlIIlIIlIll)) {
                this.worldObj.checkLightFor(EnumSkyBlock.SKY, new BlockPos(lllllllllllllIIIlllIlIlIIlIIlllI, lllllllllllllIIIlllIlIlIIlIlIIII, lllllllllllllIIIlllIlIlIIlIIllIl));
                "".length();
                ++lllllllllllllIIIlllIlIlIIlIlIIII;
            }
            this.isModified = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        }
    }
    
    public void func_150804_b(final boolean lllllllllllllIIIlllIlIIIIIlIIIIl) {
        if (lllIIlIIllIIIlI(this.isGapLightingUpdated ? 1 : 0) && lllIIlIIllIlIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0) && lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIIIIlIIIIl ? 1 : 0)) {
            this.recheckGaps(this.worldObj.isRemote);
        }
        this.field_150815_m = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        if (lllIIlIIllIlIlI(this.isLightPopulated ? 1 : 0) && lllIIlIIllIIIlI(this.isTerrainPopulated ? 1 : 0)) {
            this.func_150809_p();
            "".length();
            if (((0x80 ^ 0x95 ^ (0x67 ^ 0x42)) & (128 + 152 - 186 + 67 ^ 31 + 59 + 17 + 38 ^ -" ".length())) < 0) {
                return;
            }
        }
        while (!lllIIlIIllIIIlI(this.tileEntityPosQueue.isEmpty() ? 1 : 0)) {
            final BlockPos lllllllllllllIIIlllIlIIIIIlIIlII = this.tileEntityPosQueue.poll();
            if (lllIIlIIllIIlII(this.getTileEntity(lllllllllllllIIIlllIlIIIIIlIIlII, EnumCreateEntityType.CHECK)) && lllIIlIIllIIIlI(this.getBlock(lllllllllllllIIIlllIlIIIIIlIIlII).hasTileEntity() ? 1 : 0)) {
                final TileEntity lllllllllllllIIIlllIlIIIIIlIIIll = this.createNewTileEntity(lllllllllllllIIIlllIlIIIIIlIIlII);
                this.worldObj.setTileEntity(lllllllllllllIIIlllIlIIIIIlIIlII, lllllllllllllIIIlllIlIIIIIlIIIll);
                this.worldObj.markBlockRangeForRenderUpdate(lllllllllllllIIIlllIlIIIIIlIIlII, lllllllllllllIIIlllIlIIIIIlIIlII);
            }
        }
    }
    
    private static String lllIIlIIIlIlllI(final String lllllllllllllIIIlllIIllIlllllllI, final String lllllllllllllIIIlllIIllIllllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIlllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIllIllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIIlllIIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIIlllIIIIIIlI.init(Chunk.lIlIIlIIIIlIIl[12], lllllllllllllIIIlllIIlllIIIIIIll);
            return new String(lllllllllllllIIIlllIIlllIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIllIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIlllIIIIIIIl) {
            lllllllllllllIIIlllIIlllIIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    public Block getBlock(final BlockPos lllllllllllllIIIlllIlIIlllIlIlll) {
        try {
            return this.getBlock0(lllllllllllllIIIlllIlIIlllIlIlll.getX() & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlllIlIlll.getY(), lllllllllllllIIIlllIlIIlllIlIlll.getZ() & Chunk.lIlIIlIIIIlIIl[8]);
        }
        catch (ReportedException lllllllllllllIIIlllIlIIlllIllIlI) {
            final CrashReportCategory lllllllllllllIIIlllIlIIlllIllIIl = lllllllllllllIIIlllIlIIlllIllIlI.getCrashReport().makeCategory(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[7]]);
            lllllllllllllIIIlllIlIIlllIllIIl.addCrashSectionCallable(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[14]], new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return CrashReportCategory.getCoordinateInfo(lllllllllllllIIIlllIlIIlllIlIlll);
                }
            });
            throw lllllllllllllIIIlllIlIIlllIllIlI;
        }
    }
    
    private int getBlockMetadata(final int lllllllllllllIIIlllIlIIllIlllIII, final int lllllllllllllIIIlllIlIIllIllIlll, final int lllllllllllllIIIlllIlIIllIllIIIl) {
        if (lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIllIllIlll >> Chunk.lIlIIlIIIIlIIl[7], this.storageArrays.length)) {
            return Chunk.lIlIIlIIIIlIIl[3];
        }
        final ExtendedBlockStorage lllllllllllllIIIlllIlIIllIllIlIl = this.storageArrays[lllllllllllllIIIlllIlIIllIllIlll >> Chunk.lIlIIlIIIIlIIl[7]];
        int extBlockMetadata;
        if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIIllIllIlIl)) {
            extBlockMetadata = lllllllllllllIIIlllIlIIllIllIlIl.getExtBlockMetadata(lllllllllllllIIIlllIlIIllIlllIII, lllllllllllllIIIlllIlIIllIllIlll & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIllIllIIIl);
            "".length();
            if (-" ".length() >= "  ".length()) {
                return (0x1B ^ 0x36 ^ (0x70 ^ 0x51)) & (0x6B ^ 0x51 ^ (0x92 ^ 0xA4) ^ -" ".length());
            }
        }
        else {
            extBlockMetadata = Chunk.lIlIIlIIIIlIIl[3];
        }
        return extBlockMetadata;
    }
    
    private static boolean lllIIlIIllIIIlI(final int lllllllllllllIIIlllIIllIlIllIlII) {
        return lllllllllllllIIIlllIIllIlIllIlII != 0;
    }
    
    private static boolean lllIIlIIllIIIIl(final int lllllllllllllIIIlllIIllIllIIllll, final int lllllllllllllIIIlllIIllIllIIlllI) {
        return lllllllllllllIIIlllIIllIllIIllll >= lllllllllllllIIIlllIIllIllIIlllI;
    }
    
    private static boolean lllIIlIIllIIlll(final int lllllllllllllIIIlllIIllIlIlIlllI) {
        return lllllllllllllIIIlllIIllIlIlIlllI < 0;
    }
    
    public boolean isPopulated() {
        if (lllIIlIIllIIIlI(this.field_150815_m ? 1 : 0) && lllIIlIIllIIIlI(this.isTerrainPopulated ? 1 : 0) && lllIIlIIllIIIlI(this.isLightPopulated ? 1 : 0)) {
            return Chunk.lIlIIlIIIIlIIl[6] != 0;
        }
        return Chunk.lIlIIlIIIIlIIl[3] != 0;
    }
    
    public void removeEntityAtIndex(final Entity lllllllllllllIIIlllIlIIlIIIllIIl, int lllllllllllllIIIlllIlIIlIIIlIlIl) {
        if (lllIIlIIllIIlll(lllllllllllllIIIlllIlIIlIIIlIlIl)) {
            lllllllllllllIIIlllIlIIlIIIlIlIl = Chunk.lIlIIlIIIIlIIl[3];
        }
        if (lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIlIIIlIlIl, this.entityLists.length)) {
            lllllllllllllIIIlllIlIIlIIIlIlIl = this.entityLists.length - Chunk.lIlIIlIIIIlIIl[6];
        }
        this.entityLists[lllllllllllllIIIlllIlIIlIIIlIlIl].remove(lllllllllllllIIIlllIlIIlIIIllIIl);
        "".length();
    }
    
    private static boolean lllIIlIIllIlIll(final int lllllllllllllIIIlllIIllIlIlIIlll, final int lllllllllllllIIIlllIIllIlIlIIllI) {
        return lllllllllllllIIIlllIIllIlIlIIlll != lllllllllllllIIIlllIIllIlIlIIllI;
    }
    
    public Block getBlock(final int lllllllllllllIIIlllIlIIllllIlIll, final int lllllllllllllIIIlllIlIIllllIIlII, final int lllllllllllllIIIlllIlIIllllIlIIl) {
        try {
            return this.getBlock0(lllllllllllllIIIlllIlIIllllIlIll & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIllllIIlII, lllllllllllllIIIlllIlIIllllIlIIl & Chunk.lIlIIlIIIIlIIl[8]);
        }
        catch (ReportedException lllllllllllllIIIlllIlIIllllIlIII) {
            final CrashReportCategory lllllllllllllIIIlllIlIIllllIIlll = lllllllllllllIIIlllIlIIllllIlIII.getCrashReport().makeCategory(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[12]]);
            lllllllllllllIIIlllIlIIllllIIlll.addCrashSectionCallable(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[13]], new Callable<String>() {
                private static final /* synthetic */ int[] lIIlllllllIllI;
                
                static {
                    llIllllllIIllII();
                }
                
                private static void llIllllllIIllII() {
                    (lIIlllllllIllI = new int[1])[0] = (0x7E ^ 0x30 ^ (0x22 ^ 0x7C));
                }
                
                @Override
                public String call() throws Exception {
                    return CrashReportCategory.getCoordinateInfo(new BlockPos(Chunk.this.xPosition * Chunk$1.lIIlllllllIllI[0] + lllllllllllllIIIlllIlIIllllIlIll, lllllllllllllIIIlllIlIIllllIIlII, Chunk.this.zPosition * Chunk$1.lIIlllllllIllI[0] + lllllllllllllIIIlllIlIIllllIlIIl));
                }
            });
            throw lllllllllllllIIIlllIlIIllllIlIII;
        }
    }
    
    public void generateSkylightMap() {
        final int lllllllllllllIIIlllIlIlIlIlIIIIl = this.getTopFilledSegment();
        this.heightMapMinimum = Chunk.lIlIIlIIIIlIIl[9];
        int lllllllllllllIIIlllIlIlIlIlIIIII = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if ("  ".length() > "  ".length()) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIlIlIIIII, Chunk.lIlIIlIIIIlIIl[0])) {
            int lllllllllllllIIIlllIlIlIlIIlllll = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if (((175 + 22 - 165 + 152 ^ 115 + 109 - 218 + 150) & (0xB8 ^ 0x87 ^ (0x14 ^ 0xF) ^ -" ".length())) != ((0x12 ^ 0x27 ^ (0xF6 ^ 0x9B)) & (0x28 ^ 0x1E ^ (0xE8 ^ 0x86) ^ -" ".length()))) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIlIIlllll, Chunk.lIlIIlIIIIlIIl[0])) {
                this.precipitationHeightMap[lllllllllllllIIIlllIlIlIlIlIIIII + (lllllllllllllIIIlllIlIlIlIIlllll << Chunk.lIlIIlIIIIlIIl[7])] = Chunk.lIlIIlIIIIlIIl[4];
                int lllllllllllllIIIlllIlIlIlIIllllI = lllllllllllllIIIlllIlIlIlIlIIIIl + Chunk.lIlIIlIIIIlIIl[0];
                "".length();
                if (((0x30 ^ 0xF) & ~(0xAE ^ 0x91)) >= " ".length()) {
                    return;
                }
                while (!lllIIlIIllIlIIl(lllllllllllllIIIlllIlIlIlIIllllI)) {
                    if (lllIIlIIllIIIlI(this.getBlockLightOpacity(lllllllllllllIIIlllIlIlIlIlIIIII, lllllllllllllIIIlllIlIlIlIIllllI - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIlIlIIlllll))) {
                        this.heightMap[lllllllllllllIIIlllIlIlIlIIlllll << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIlIlIlIIIII] = lllllllllllllIIIlllIlIlIlIIllllI;
                        if (!lllIIlIIllIlIII(lllllllllllllIIIlllIlIlIlIIllllI, this.heightMapMinimum)) {
                            break;
                        }
                        this.heightMapMinimum = lllllllllllllIIIlllIlIlIlIIllllI;
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        --lllllllllllllIIIlllIlIlIlIIllllI;
                    }
                }
                if (lllIIlIIllIlIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
                    int lllllllllllllIIIlllIlIlIlIIlllIl = Chunk.lIlIIlIIIIlIIl[8];
                    int lllllllllllllIIIlllIlIlIlIIlllII = lllllllllllllIIIlllIlIlIlIlIIIIl + Chunk.lIlIIlIIIIlIIl[0] - Chunk.lIlIIlIIIIlIIl[6];
                    do {
                        int lllllllllllllIIIlllIlIlIlIIllIll = this.getBlockLightOpacity(lllllllllllllIIIlllIlIlIlIlIIIII, lllllllllllllIIIlllIlIlIlIIlllII, lllllllllllllIIIlllIlIlIlIIlllll);
                        if (lllIIlIIllIlIlI(lllllllllllllIIIlllIlIlIlIIllIll) && lllIIlIIllIlIll(lllllllllllllIIIlllIlIlIlIIlllIl, Chunk.lIlIIlIIIIlIIl[8])) {
                            lllllllllllllIIIlllIlIlIlIIllIll = Chunk.lIlIIlIIIIlIIl[6];
                        }
                        lllllllllllllIIIlllIlIlIlIIlllIl -= lllllllllllllIIIlllIlIlIlIIllIll;
                        if (lllIIlIIllIllII(lllllllllllllIIIlllIlIlIlIIlllIl)) {
                            final ExtendedBlockStorage lllllllllllllIIIlllIlIlIlIIllIlI = this.storageArrays[lllllllllllllIIIlllIlIlIlIIlllII >> Chunk.lIlIIlIIIIlIIl[7]];
                            if (!lllIIlIIllIIllI(lllllllllllllIIIlllIlIlIlIIllIlI)) {
                                continue;
                            }
                            lllllllllllllIIIlllIlIlIlIIllIlI.setExtSkylightValue(lllllllllllllIIIlllIlIlIlIlIIIII, lllllllllllllIIIlllIlIlIlIIlllII & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIlIlIIlllll, lllllllllllllIIIlllIlIlIlIIlllIl);
                            this.worldObj.notifyLightSet(new BlockPos((this.xPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIlIlIlIlIIIII, lllllllllllllIIIlllIlIlIlIIlllII, (this.zPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIlIlIlIIlllll));
                        }
                    } while (lllIIlIIllIllII(--lllllllllllllIIIlllIlIlIlIIlllII) && !lllIIlIIllIlIIl(lllllllllllllIIIlllIlIlIlIIlllIl));
                }
                ++lllllllllllllIIIlllIlIlIlIIlllll;
            }
            ++lllllllllllllIIIlllIlIlIlIlIIIII;
        }
        this.isModified = (Chunk.lIlIIlIIIIlIIl[6] != 0);
    }
    
    public boolean canSeeSky(final BlockPos lllllllllllllIIIlllIlIIlIIIIlllI) {
        final int lllllllllllllIIIlllIlIIlIIIIllIl = lllllllllllllIIIlllIlIIlIIIIlllI.getX() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIlIIIIllII = lllllllllllllIIIlllIlIIlIIIIlllI.getY();
        final int lllllllllllllIIIlllIlIIlIIIIlIll = lllllllllllllIIIlllIlIIlIIIIlllI.getZ() & Chunk.lIlIIlIIIIlIIl[8];
        if (lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIlIIIIllII, this.heightMap[lllllllllllllIIIlllIlIIlIIIIlIll << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIIlIIIIllIl])) {
            return Chunk.lIlIIlIIIIlIIl[6] != 0;
        }
        return Chunk.lIlIIlIIIIlIIl[3] != 0;
    }
    
    private int getBlockLightOpacity(final int lllllllllllllIIIlllIlIlIIIIlIIIl, final int lllllllllllllIIIlllIlIlIIIIlIIII, final int lllllllllllllIIIlllIlIlIIIIIllll) {
        return this.getBlock0(lllllllllllllIIIlllIlIlIIIIlIIIl, lllllllllllllIIIlllIlIlIIIIlIIII, lllllllllllllIIIlllIlIlIIIIIllll).getLightOpacity();
    }
    
    public void onChunkUnload() {
        this.isChunkLoaded = (Chunk.lIlIIlIIIIlIIl[3] != 0);
        final char lllllllllllllIIIlllIlIIIllIIIlIl = (char)this.chunkTileEntityMap.values().iterator();
        "".length();
        if ("  ".length() < -" ".length()) {
            return;
        }
        while (!lllIIlIIllIlIlI(((Iterator)lllllllllllllIIIlllIlIIIllIIIlIl).hasNext() ? 1 : 0)) {
            final TileEntity lllllllllllllIIIlllIlIIIllIIlIIl = ((Iterator<TileEntity>)lllllllllllllIIIlllIlIIIllIIIlIl).next();
            this.worldObj.markTileEntityForRemoval(lllllllllllllIIIlllIlIIIllIIlIIl);
        }
        int lllllllllllllIIIlllIlIIIllIIlIII = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIIllIIlIII, this.entityLists.length)) {
            this.worldObj.unloadEntities(this.entityLists[lllllllllllllIIIlllIlIIIllIIlIII]);
            ++lllllllllllllIIIlllIlIIIllIIlIII;
        }
    }
    
    public void getEntitiesWithinAABBForEntity(final Entity lllllllllllllIIIlllIlIIIlIllIlII, final AxisAlignedBB lllllllllllllIIIlllIlIIIlIllIIll, final List<Entity> lllllllllllllIIIlllIlIIIlIlIIlll, final Predicate<? super Entity> lllllllllllllIIIlllIlIIIlIlIIllI) {
        int lllllllllllllIIIlllIlIIIlIllIIII = MathHelper.floor_double((lllllllllllllIIIlllIlIIIlIllIIll.minY - 2.0) / 16.0);
        int lllllllllllllIIIlllIlIIIlIlIllll = MathHelper.floor_double((lllllllllllllIIIlllIlIIIlIllIIll.maxY + 2.0) / 16.0);
        lllllllllllllIIIlllIlIIIlIllIIII = MathHelper.clamp_int(lllllllllllllIIIlllIlIIIlIllIIII, Chunk.lIlIIlIIIIlIIl[3], this.entityLists.length - Chunk.lIlIIlIIIIlIIl[6]);
        lllllllllllllIIIlllIlIIIlIlIllll = MathHelper.clamp_int(lllllllllllllIIIlllIlIIIlIlIllll, Chunk.lIlIIlIIIIlIIl[3], this.entityLists.length - Chunk.lIlIIlIIIIlIIl[6]);
        int lllllllllllllIIIlllIlIIIlIlIlllI = lllllllllllllIIIlllIlIIIlIllIIII;
        "".length();
        if ((0x78 ^ 0x7C) <= "   ".length()) {
            return;
        }
        while (!lllIIlIIllIllIl(lllllllllllllIIIlllIlIIIlIlIlllI, lllllllllllllIIIlllIlIIIlIlIllll)) {
            if (lllIIlIIllIlIlI(this.entityLists[lllllllllllllIIIlllIlIIIlIlIlllI].isEmpty() ? 1 : 0)) {
                final char lllllllllllllIIIlllIlIIIlIlIIIIl = (char)this.entityLists[lllllllllllllIIIlllIlIIIlIlIlllI].iterator();
                "".length();
                if (null != null) {
                    return;
                }
                while (!lllIIlIIllIlIlI(((Iterator)lllllllllllllIIIlllIlIIIlIlIIIIl).hasNext() ? 1 : 0)) {
                    Entity lllllllllllllIIIlllIlIIIlIlIllIl = ((Iterator<Entity>)lllllllllllllIIIlllIlIIIlIlIIIIl).next();
                    if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIlIlIllIl.getEntityBoundingBox().intersectsWith(lllllllllllllIIIlllIlIIIlIllIIll) ? 1 : 0) && lllIIlIIllIIIll(lllllllllllllIIIlllIlIIIlIlIllIl, lllllllllllllIIIlllIlIIIlIllIlII)) {
                        if (!lllIIlIIllIIllI(lllllllllllllIIIlllIlIIIlIlIIllI) || lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIlIlIIllI.apply((Object)lllllllllllllIIIlllIlIIIlIlIllIl) ? 1 : 0)) {
                            lllllllllllllIIIlllIlIIIlIlIIlll.add(lllllllllllllIIIlllIlIIIlIlIllIl);
                            "".length();
                        }
                        final Entity[] lllllllllllllIIIlllIlIIIlIlIllII = lllllllllllllIIIlllIlIIIlIlIllIl.getParts();
                        if (!lllIIlIIllIIllI(lllllllllllllIIIlllIlIIIlIlIllII)) {
                            continue;
                        }
                        int lllllllllllllIIIlllIlIIIlIlIlIll = Chunk.lIlIIlIIIIlIIl[3];
                        "".length();
                        if (null != null) {
                            return;
                        }
                        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIIlIlIlIll, lllllllllllllIIIlllIlIIIlIlIllII.length)) {
                            lllllllllllllIIIlllIlIIIlIlIllIl = lllllllllllllIIIlllIlIIIlIlIllII[lllllllllllllIIIlllIlIIIlIlIlIll];
                            if (lllIIlIIllIIIll(lllllllllllllIIIlllIlIIIlIlIllIl, lllllllllllllIIIlllIlIIIlIllIlII) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIlIlIllIl.getEntityBoundingBox().intersectsWith(lllllllllllllIIIlllIlIIIlIllIIll) ? 1 : 0) && (!lllIIlIIllIIllI(lllllllllllllIIIlllIlIIIlIlIIllI) || lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIlIlIIllI.apply((Object)lllllllllllllIIIlllIlIIIlIlIllIl) ? 1 : 0))) {
                                lllllllllllllIIIlllIlIIIlIlIIlll.add(lllllllllllllIIIlllIlIIIlIlIllIl);
                                "".length();
                            }
                            ++lllllllllllllIIIlllIlIIIlIlIlIll;
                        }
                    }
                }
            }
            ++lllllllllllllIIIlllIlIIIlIlIlllI;
        }
    }
    
    public boolean needsSaving(final boolean lllllllllllllIIIlllIlIIIIlllllII) {
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlllllII ? 1 : 0)) {
            if ((lllIIlIIllIIIlI(this.hasEntities ? 1 : 0) && !lllIIlIIllIlIlI(lllIIlIIlllIIII(this.worldObj.getTotalWorldTime(), this.lastSaveTime))) || lllIIlIIllIIIlI(this.isModified ? 1 : 0)) {
                return Chunk.lIlIIlIIIIlIIl[6] != 0;
            }
        }
        else if (lllIIlIIllIIIlI(this.hasEntities ? 1 : 0) && lllIIlIIllIlllI(lllIIlIIlllIIII(this.worldObj.getTotalWorldTime(), this.lastSaveTime + 600L))) {
            return Chunk.lIlIIlIIIIlIIl[6] != 0;
        }
        return this.isModified;
    }
    
    private Block getBlock0(final int lllllllllllllIIIlllIlIIllllllIIl, final int lllllllllllllIIIlllIlIlIIIIIIIII, final int lllllllllllllIIIlllIlIIlllllIlll) {
        Block lllllllllllllIIIlllIlIIllllllllI = Blocks.air;
        if (lllIIlIIllIlllI(lllllllllllllIIIlllIlIlIIIIIIIII) && lllIIlIIllIlIII(lllllllllllllIIIlllIlIlIIIIIIIII >> Chunk.lIlIIlIIIIlIIl[7], this.storageArrays.length)) {
            final ExtendedBlockStorage lllllllllllllIIIlllIlIIlllllllIl = this.storageArrays[lllllllllllllIIIlllIlIlIIIIIIIII >> Chunk.lIlIIlIIIIlIIl[7]];
            if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIIlllllllIl)) {
                try {
                    lllllllllllllIIIlllIlIIllllllllI = lllllllllllllIIIlllIlIIlllllllIl.getBlockByExtId(lllllllllllllIIIlllIlIIllllllIIl, lllllllllllllIIIlllIlIlIIIIIIIII & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlllllIlll);
                    "".length();
                    if ("   ".length() < 0) {
                        return null;
                    }
                }
                catch (Throwable lllllllllllllIIIlllIlIIlllllllII) {
                    final CrashReport lllllllllllllIIIlllIlIIllllllIll = CrashReport.makeCrashReport(lllllllllllllIIIlllIlIIlllllllII, Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[6]]);
                    throw new ReportedException(lllllllllllllIIIlllIlIIllllllIll);
                }
            }
        }
        return lllllllllllllIIIlllIlIIllllllllI;
    }
    
    private static void lllIIlIIllIIIII() {
        (lIlIIlIIIIlIIl = new int[32])[0] = (0x44 ^ 0x54);
        Chunk.lIlIIlIIIIlIIl[1] = (-(0xFFFFF7BD & 0x6AFE) & (0xFFFFEFBB & 0x73FF));
        Chunk.lIlIIlIIIIlIIl[2] = (-(0xFFFFF7EF & 0x6ED4) & (0xFFFFFEC7 & 0x77FB));
        Chunk.lIlIIlIIIIlIIl[3] = ((0x43 ^ 0x52) & ~(0x18 ^ 0x9));
        Chunk.lIlIIlIIIIlIIl[4] = -(0xFFFF9BF7 & 0x67EF);
        Chunk.lIlIIlIIIIlIIl[5] = -" ".length();
        Chunk.lIlIIlIIIIlIIl[6] = " ".length();
        Chunk.lIlIIlIIIIlIIl[7] = (0xC4 ^ 0xC0);
        Chunk.lIlIIlIIIIlIIl[8] = (0x8A ^ 0x85);
        Chunk.lIlIIlIIIIlIIl[9] = (-1 & Integer.MAX_VALUE);
        Chunk.lIlIIlIIIIlIIl[10] = (0xCC ^ 0xC4);
        Chunk.lIlIIlIIIIlIIl[11] = (0x7D ^ 0x0) + (69 + 42 - 91 + 111) - (0x2 ^ 0x69) + (0xF7 ^ 0x9D);
        Chunk.lIlIIlIIIIlIIl[12] = "  ".length();
        Chunk.lIlIIlIIIIlIIl[13] = "   ".length();
        Chunk.lIlIIlIIIIlIIl[14] = (95 + 105 - 67 + 38 ^ 137 + 148 - 145 + 34);
        Chunk.lIlIIlIIIIlIIl[15] = (0xD ^ 0x6F ^ (0x4A ^ 0x14));
        Chunk.lIlIIlIIIIlIIl[16] = (0x3E ^ 0x78);
        Chunk.lIlIIlIIIIlIIl[17] = (0x59 ^ 0x39 ^ (0x36 ^ 0x50));
        Chunk.lIlIIlIIIIlIIl[18] = (0x2B ^ 0x2C);
        Chunk.lIlIIlIIIIlIIl[19] = (0xCE ^ 0xC7);
        Chunk.lIlIIlIIIIlIIl[20] = (0x3C ^ 0x36);
        Chunk.lIlIIlIIIIlIIl[21] = (9 + 29 + 83 + 20 ^ 127 + 128 - 134 + 13);
        Chunk.lIlIIlIIIIlIIl[22] = (0x5E ^ 0x6B ^ (0x9B ^ 0xA2));
        Chunk.lIlIIlIIIIlIIl[23] = (0xF9 ^ 0xAD ^ (0x42 ^ 0x1B));
        Chunk.lIlIIlIIIIlIIl[24] = (0xFFFFFBA7 & 0x4C1D5E);
        Chunk.lIlIIlIIIIlIIl[25] = (-(0xFFFFDF4F & 0x3FB5) & (0xFFFFFFDF & 0x5ADFFF));
        Chunk.lIlIIlIIIIlIIl[26] = (0xFFFFF76F & 0x5FADF);
        Chunk.lIlIIlIIIIlIIl[27] = (0xA5 ^ 0xAB);
        Chunk.lIlIIlIIIIlIIl[28] = (0xB ^ 0x1A);
        Chunk.lIlIIlIIIIlIIl[29] = (0xCF ^ 0xBC ^ (0xD5 ^ 0xB4));
        Chunk.lIlIIlIIIIlIIl[30] = (0x1 ^ 0x13 ^ " ".length());
        Chunk.lIlIIlIIIIlIIl[31] = (0x60 ^ 0x74);
    }
    
    public ClassInheritanceMultiMap<Entity>[] getEntityLists() {
        return this.entityLists;
    }
    
    private void propagateSkylightOcclusion(final int lllllllllllllIIIlllIlIlIlIIIllIl, final int lllllllllllllIIIlllIlIlIlIIIlIIl) {
        this.updateSkylightColumns[lllllllllllllIIIlllIlIlIlIIIllIl + lllllllllllllIIIlllIlIlIlIIIlIIl * Chunk.lIlIIlIIIIlIIl[0]] = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        this.isGapLightingUpdated = (Chunk.lIlIIlIIIIlIIl[6] != 0);
    }
    
    public <T extends Entity> void getEntitiesOfTypeWithinAAAB(final Class<? extends T> lllllllllllllIIIlllIlIIIlIIlIIll, final AxisAlignedBB lllllllllllllIIIlllIlIIIlIIIlIIl, final List<T> lllllllllllllIIIlllIlIIIlIIlIIIl, final Predicate<? super T> lllllllllllllIIIlllIlIIIlIIlIIII) {
        int lllllllllllllIIIlllIlIIIlIIIllll = MathHelper.floor_double((lllllllllllllIIIlllIlIIIlIIIlIIl.minY - 2.0) / 16.0);
        int lllllllllllllIIIlllIlIIIlIIIlllI = MathHelper.floor_double((lllllllllllllIIIlllIlIIIlIIIlIIl.maxY + 2.0) / 16.0);
        lllllllllllllIIIlllIlIIIlIIIllll = MathHelper.clamp_int(lllllllllllllIIIlllIlIIIlIIIllll, Chunk.lIlIIlIIIIlIIl[3], this.entityLists.length - Chunk.lIlIIlIIIIlIIl[6]);
        lllllllllllllIIIlllIlIIIlIIIlllI = MathHelper.clamp_int(lllllllllllllIIIlllIlIIIlIIIlllI, Chunk.lIlIIlIIIIlIIl[3], this.entityLists.length - Chunk.lIlIIlIIIIlIIl[6]);
        int lllllllllllllIIIlllIlIIIlIIIllIl = lllllllllllllIIIlllIlIIIlIIIllll;
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lllIIlIIllIllIl(lllllllllllllIIIlllIlIIIlIIIllIl, lllllllllllllIIIlllIlIIIlIIIlllI)) {
            final float lllllllllllllIIIlllIlIIIlIIIIIlI = (float)this.entityLists[lllllllllllllIIIlllIlIIIlIIIllIl].getByClass(lllllllllllllIIIlllIlIIIlIIlIIll).iterator();
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
            while (!lllIIlIIllIlIlI(((Iterator)lllllllllllllIIIlllIlIIIlIIIIIlI).hasNext() ? 1 : 0)) {
                final T lllllllllllllIIIlllIlIIIlIIIllII = ((Iterator<T>)lllllllllllllIIIlllIlIIIlIIIIIlI).next();
                if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIlIIIllII.getEntityBoundingBox().intersectsWith(lllllllllllllIIIlllIlIIIlIIIlIIl) ? 1 : 0) && (!lllIIlIIllIIllI(lllllllllllllIIIlllIlIIIlIIlIIII) || lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIlIIlIIII.apply((Object)lllllllllllllIIIlllIlIIIlIIIllII) ? 1 : 0))) {
                    lllllllllllllIIIlllIlIIIlIIlIIIl.add(lllllllllllllIIIlllIlIIIlIIIllII);
                    "".length();
                }
            }
            ++lllllllllllllIIIlllIlIIIlIIIllIl;
        }
    }
    
    public void populateChunk(final IChunkProvider lllllllllllllIIIlllIlIIIIllIIlIl, final IChunkProvider lllllllllllllIIIlllIlIIIIllIIlII, final int lllllllllllllIIIlllIlIIIIllIIIll, final int lllllllllllllIIIlllIlIIIIllIIIlI) {
        final boolean lllllllllllllIIIlllIlIIIIllIIIIl = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll, lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
        final boolean lllllllllllllIIIlllIlIIIIllIIIII = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll + Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI);
        final boolean lllllllllllllIIIlllIlIIIIlIlllll = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll, lllllllllllllIIIlllIlIIIIllIIIlI + Chunk.lIlIIlIIIIlIIl[6]);
        final boolean lllllllllllllIIIlllIlIIIIlIllllI = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI);
        final boolean lllllllllllllIIIlllIlIIIIlIlllIl = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
        final boolean lllllllllllllIIIlllIlIIIIlIlllII = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll + Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI + Chunk.lIlIIlIIIIlIIl[6]);
        final boolean lllllllllllllIIIlllIlIIIIlIllIll = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI + Chunk.lIlIIlIIIIlIIl[6]);
        final boolean lllllllllllllIIIlllIlIIIIlIllIlI = lllllllllllllIIIlllIlIIIIllIIlIl.chunkExists(lllllllllllllIIIlllIlIIIIllIIIll + Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIllIIIII ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIlllll ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIlllII ? 1 : 0)) {
            if (lllIIlIIllIlIlI(this.isTerrainPopulated ? 1 : 0)) {
                lllllllllllllIIIlllIlIIIIllIIlIl.populate(lllllllllllllIIIlllIlIIIIllIIlII, lllllllllllllIIIlllIlIIIIllIIIll, lllllllllllllIIIlllIlIIIIllIIIlI);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIlIIIIllIIlIl.func_177460_a(lllllllllllllIIIlllIlIIIIllIIlII, this, lllllllllllllIIIlllIlIIIIllIIIll, lllllllllllllIIIlllIlIIIIllIIIlI);
                "".length();
            }
        }
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIllllI ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIlllll ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIllIll ? 1 : 0)) {
            final Chunk lllllllllllllIIIlllIlIIIIlIllIIl = lllllllllllllIIIlllIlIIIIllIIlIl.provideChunk(lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI);
            if (lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIIIlIllIIl.isTerrainPopulated ? 1 : 0)) {
                lllllllllllllIIIlllIlIIIIllIIlIl.populate(lllllllllllllIIIlllIlIIIIllIIlII, lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI);
                "".length();
                if (((0x6C ^ 0x78) & ~(0x8B ^ 0x9F)) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIlIIIIllIIlIl.func_177460_a(lllllllllllllIIIlllIlIIIIllIIlII, lllllllllllllIIIlllIlIIIIlIllIIl, lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI);
                "".length();
            }
        }
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIllIIIIl ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIllIIIII ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIllIlI ? 1 : 0)) {
            final Chunk lllllllllllllIIIlllIlIIIIlIllIII = lllllllllllllIIIlllIlIIIIllIIlIl.provideChunk(lllllllllllllIIIlllIlIIIIllIIIll, lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
            if (lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIIIlIllIII.isTerrainPopulated ? 1 : 0)) {
                lllllllllllllIIIlllIlIIIIllIIlIl.populate(lllllllllllllIIIlllIlIIIIllIIlII, lllllllllllllIIIlllIlIIIIllIIIll, lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIlIIIIllIIlIl.func_177460_a(lllllllllllllIIIlllIlIIIIllIIlII, lllllllllllllIIIlllIlIIIIlIllIII, lllllllllllllIIIlllIlIIIIllIIIll, lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
                "".length();
            }
        }
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIlllIl ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIllIIIIl ? 1 : 0) && lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIIlIllllI ? 1 : 0)) {
            final Chunk lllllllllllllIIIlllIlIIIIlIlIlll = lllllllllllllIIIlllIlIIIIllIIlIl.provideChunk(lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
            if (lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIIIlIlIlll.isTerrainPopulated ? 1 : 0)) {
                lllllllllllllIIIlllIlIIIIllIIlIl.populate(lllllllllllllIIIlllIlIIIIllIIlII, lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
                "".length();
                if (-" ".length() == (" ".length() & (" ".length() ^ -" ".length()))) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIlIIIIllIIlIl.func_177460_a(lllllllllllllIIIlllIlIIIIllIIlII, lllllllllllllIIIlllIlIIIIlIlIlll, lllllllllllllIIIlllIlIIIIllIIIll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIIIllIIIlI - Chunk.lIlIIlIIIIlIIl[6]);
                "".length();
            }
        }
    }
    
    public void onChunkLoad() {
        this.isChunkLoaded = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        this.worldObj.addTileEntities(this.chunkTileEntityMap.values());
        int lllllllllllllIIIlllIlIIIllIlIIll = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIIllIlIIll, this.entityLists.length)) {
            final int lllllllllllllIIIlllIlIIIllIIlllI = (int)this.entityLists[lllllllllllllIIIlllIlIIIllIlIIll].iterator();
            "".length();
            if (((0xF6 ^ 0xB0) & ~(0x3A ^ 0x7C)) >= " ".length()) {
                return;
            }
            while (!lllIIlIIllIlIlI(((Iterator)lllllllllllllIIIlllIlIIIllIIlllI).hasNext() ? 1 : 0)) {
                final Entity lllllllllllllIIIlllIlIIIllIlIIlI = ((Iterator<Entity>)lllllllllllllIIIlllIlIIIllIIlllI).next();
                lllllllllllllIIIlllIlIIIllIlIIlI.onChunkLoad();
            }
            this.worldObj.loadEntities(this.entityLists[lllllllllllllIIIlllIlIIIllIlIIll]);
            ++lllllllllllllIIIlllIlIIIllIlIIll;
        }
    }
    
    public TileEntity getTileEntity(final BlockPos lllllllllllllIIIlllIlIIIllllIlll, final EnumCreateEntityType lllllllllllllIIIlllIlIIIllllIllI) {
        TileEntity lllllllllllllIIIlllIlIIIllllIlIl = this.chunkTileEntityMap.get(lllllllllllllIIIlllIlIIIllllIlll);
        if (lllIIlIIllIIlII(lllllllllllllIIIlllIlIIIllllIlIl)) {
            if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIIllllIllI, EnumCreateEntityType.IMMEDIATE)) {
                lllllllllllllIIIlllIlIIIllllIlIl = this.createNewTileEntity(lllllllllllllIIIlllIlIIIllllIlll);
                this.worldObj.setTileEntity(lllllllllllllIIIlllIlIIIllllIlll, lllllllllllllIIIlllIlIIIllllIlIl);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            else if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIIllllIllI, EnumCreateEntityType.QUEUED)) {
                this.tileEntityPosQueue.add(lllllllllllllIIIlllIlIIIllllIlll);
                "".length();
                "".length();
                if (" ".length() > " ".length()) {
                    return null;
                }
            }
        }
        else if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIIllllIlIl.isInvalid() ? 1 : 0)) {
            this.chunkTileEntityMap.remove(lllllllllllllIIIlllIlIIIllllIlll);
            "".length();
            return null;
        }
        return lllllllllllllIIIlllIlIIIllllIlIl;
    }
    
    public BlockPos getPrecipitationHeight(final BlockPos lllllllllllllIIIlllIlIIIIIllIIll) {
        final int lllllllllllllIIIlllIlIIIIIllllII = lllllllllllllIIIlllIlIIIIIllIIll.getX() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIIIIlllIll = lllllllllllllIIIlllIlIIIIIllIIll.getZ() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIIIIlllIlI = lllllllllllllIIIlllIlIIIIIllllII | lllllllllllllIIIlllIlIIIIIlllIll << Chunk.lIlIIlIIIIlIIl[7];
        BlockPos lllllllllllllIIIlllIlIIIIIlllIIl = new BlockPos(lllllllllllllIIIlllIlIIIIIllIIll.getX(), this.precipitationHeightMap[lllllllllllllIIIlllIlIIIIIlllIlI], lllllllllllllIIIlllIlIIIIIllIIll.getZ());
        if (lllIIlIIllIIlIl(lllllllllllllIIIlllIlIIIIIlllIIl.getY(), Chunk.lIlIIlIIIIlIIl[4])) {
            final int lllllllllllllIIIlllIlIIIIIlllIII = this.getTopFilledSegment() + Chunk.lIlIIlIIIIlIIl[8];
            lllllllllllllIIIlllIlIIIIIlllIIl = new BlockPos(lllllllllllllIIIlllIlIIIIIllIIll.getX(), lllllllllllllIIIlllIlIIIIIlllIII, lllllllllllllIIIlllIlIIIIIllIIll.getZ());
            int lllllllllllllIIIlllIlIIIIIllIlll = Chunk.lIlIIlIIIIlIIl[5];
            "".length();
            if ((0x6D ^ 0x25 ^ (0xF3 ^ 0xBF)) <= 0) {
                return null;
            }
            while (lllIIlIIllIllII(lllllllllllllIIIlllIlIIIIIlllIIl.getY()) && !lllIIlIIllIlIll(lllllllllllllIIIlllIlIIIIIllIlll, Chunk.lIlIIlIIIIlIIl[5])) {
                final Block lllllllllllllIIIlllIlIIIIIllIllI = this.getBlock(lllllllllllllIIIlllIlIIIIIlllIIl);
                final Material lllllllllllllIIIlllIlIIIIIllIlIl = lllllllllllllIIIlllIlIIIIIllIllI.getMaterial();
                if (lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIIIIllIlIl.blocksMovement() ? 1 : 0) && lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIIIIllIlIl.isLiquid() ? 1 : 0)) {
                    lllllllllllllIIIlllIlIIIIIlllIIl = lllllllllllllIIIlllIlIIIIIlllIIl.down();
                    "".length();
                    if (((17 + 93 + 15 + 29 ^ 67 + 69 - 43 + 82) & (0x7B ^ 0x54 ^ (0xA1 ^ 0xBB) ^ -" ".length())) > 0) {
                        return null;
                    }
                    continue;
                }
                else {
                    lllllllllllllIIIlllIlIIIIIllIlll = lllllllllllllIIIlllIlIIIIIlllIIl.getY() + Chunk.lIlIIlIIIIlIIl[6];
                }
            }
            this.precipitationHeightMap[lllllllllllllIIIlllIlIIIIIlllIlI] = lllllllllllllIIIlllIlIIIIIllIlll;
        }
        return new BlockPos(lllllllllllllIIIlllIlIIIIIllIIll.getX(), this.precipitationHeightMap[lllllllllllllIIIlllIlIIIIIlllIlI], lllllllllllllIIIlllIlIIIIIllIIll.getZ());
    }
    
    public int getBlockMetadata(final BlockPos lllllllllllllIIIlllIlIIllIlIllII) {
        return this.getBlockMetadata(lllllllllllllIIIlllIlIIllIlIllII.getX() & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIllIlIllII.getY(), lllllllllllllIIIlllIlIIllIlIllII.getZ() & Chunk.lIlIIlIIIIlIIl[8]);
    }
    
    private void func_180700_a(final EnumFacing lllllllllllllIIIlllIIlllIlllIIll) {
        if (lllIIlIIllIIIlI(this.isTerrainPopulated ? 1 : 0)) {
            if (lllIIlIIllIllll(lllllllllllllIIIlllIIlllIlllIIll, EnumFacing.EAST)) {
                int lllllllllllllIIIlllIIlllIllllIII = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if ((0x19 ^ 0x1D) < "  ".length()) {
                    return;
                }
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIlllIllllIII, Chunk.lIlIIlIIIIlIIl[0])) {
                    this.func_150811_f(Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIIlllIllllIII);
                    "".length();
                    ++lllllllllllllIIIlllIIlllIllllIII;
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lllIIlIIllIllll(lllllllllllllIIIlllIIlllIlllIIll, EnumFacing.WEST)) {
                int lllllllllllllIIIlllIIlllIlllIlll = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (((0x5F ^ 0x53) & ~(0x40 ^ 0x4C)) != 0x0) {
                    return;
                }
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIlllIlllIlll, Chunk.lIlIIlIIIIlIIl[0])) {
                    this.func_150811_f(Chunk.lIlIIlIIIIlIIl[3], lllllllllllllIIIlllIIlllIlllIlll);
                    "".length();
                    ++lllllllllllllIIIlllIIlllIlllIlll;
                }
                "".length();
                if (((0x2A ^ 0x32 ^ (0xD0 ^ 0x8F)) & (0xA2 ^ 0xB4 ^ (0xD5 ^ 0x84) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (lllIIlIIllIllll(lllllllllllllIIIlllIIlllIlllIIll, EnumFacing.SOUTH)) {
                int lllllllllllllIIIlllIIlllIlllIllI = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (((0x5C ^ 0x7A) & ~(0x20 ^ 0x6)) != 0x0) {
                    return;
                }
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIlllIlllIllI, Chunk.lIlIIlIIIIlIIl[0])) {
                    this.func_150811_f(lllllllllllllIIIlllIIlllIlllIllI, Chunk.lIlIIlIIIIlIIl[8]);
                    "".length();
                    ++lllllllllllllIIIlllIIlllIlllIllI;
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lllIIlIIllIllll(lllllllllllllIIIlllIIlllIlllIIll, EnumFacing.NORTH)) {
                int lllllllllllllIIIlllIIlllIlllIlIl = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (((0x18 ^ 0x32) & ~(0x95 ^ 0xBF)) < 0) {
                    return;
                }
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIlllIlllIlIl, Chunk.lIlIIlIIIIlIIl[0])) {
                    this.func_150811_f(lllllllllllllIIIlllIIlllIlllIlIl, Chunk.lIlIIlIIIIlIIl[3]);
                    "".length();
                    ++lllllllllllllIIIlllIIlllIlllIlIl;
                }
            }
        }
    }
    
    public void setModified(final boolean lllllllllllllIIIlllIIlllIIlIIIII) {
        this.isModified = lllllllllllllIIIlllIIlllIIlIIIII;
    }
    
    public void enqueueRelightChecks() {
        final BlockPos lllllllllllllIIIlllIIllllIlIlIll = new BlockPos(this.xPosition << Chunk.lIlIIlIIIIlIIl[7], Chunk.lIlIIlIIIIlIIl[3], this.zPosition << Chunk.lIlIIlIIIIlIIl[7]);
        int lllllllllllllIIIlllIIllllIlIlIlI = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if ("  ".length() < ((0x16 ^ 0x8) & ~(0x51 ^ 0x4F))) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllIlIlIlI, Chunk.lIlIIlIIIIlIIl[10])) {
            if (lllIIlIIllIIIIl(this.queuedLightChecks, Chunk.lIlIIlIIIIlIIl[2])) {
                return;
            }
            final int lllllllllllllIIIlllIIllllIlIlIIl = this.queuedLightChecks % Chunk.lIlIIlIIIIlIIl[0];
            final int lllllllllllllIIIlllIIllllIlIlIII = this.queuedLightChecks / Chunk.lIlIIlIIIIlIIl[0] % Chunk.lIlIIlIIIIlIIl[0];
            final int lllllllllllllIIIlllIIllllIlIIlll = this.queuedLightChecks / Chunk.lIlIIlIIIIlIIl[1];
            this.queuedLightChecks += Chunk.lIlIIlIIIIlIIl[6];
            int lllllllllllllIIIlllIIllllIlIIllI = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if (null != null) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllIlIIllI, Chunk.lIlIIlIIIIlIIl[0])) {
                final BlockPos lllllllllllllIIIlllIIllllIlIIlIl = lllllllllllllIIIlllIIllllIlIlIll.add(lllllllllllllIIIlllIIllllIlIlIII, (lllllllllllllIIIlllIIllllIlIlIIl << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIIllllIlIIllI, lllllllllllllIIIlllIIllllIlIIlll);
                int n;
                if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIllllIlIIllI) && lllIIlIIllIlIll(lllllllllllllIIIlllIIllllIlIIllI, Chunk.lIlIIlIIIIlIIl[8]) && lllIIlIIllIIIlI(lllllllllllllIIIlllIIllllIlIlIII) && lllIIlIIllIlIll(lllllllllllllIIIlllIIllllIlIlIII, Chunk.lIlIIlIIIIlIIl[8]) && lllIIlIIllIIIlI(lllllllllllllIIIlllIIllllIlIIlll) && lllIIlIIllIlIll(lllllllllllllIIIlllIIllllIlIIlll, Chunk.lIlIIlIIIIlIIl[8])) {
                    n = Chunk.lIlIIlIIIIlIIl[3];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n = Chunk.lIlIIlIIIIlIIl[6];
                }
                final boolean lllllllllllllIIIlllIIllllIlIIlII = n != 0;
                if ((lllIIlIIllIIlII(this.storageArrays[lllllllllllllIIIlllIIllllIlIlIIl]) && !lllIIlIIllIlIlI(lllllllllllllIIIlllIIllllIlIIlII ? 1 : 0)) || (lllIIlIIllIIllI(this.storageArrays[lllllllllllllIIIlllIIllllIlIlIIl]) && lllIIlIIllIllll(this.storageArrays[lllllllllllllIIIlllIIllllIlIlIIl].getBlockByExtId(lllllllllllllIIIlllIIllllIlIlIII, lllllllllllllIIIlllIIllllIlIIllI, lllllllllllllIIIlllIIllllIlIIlll).getMaterial(), Material.air))) {
                    final short lllllllllllllIIIlllIIllllIIlIlIl;
                    final byte lllllllllllllIIIlllIIllllIIlIllI = (byte)((EnumFacing[])(Object)(lllllllllllllIIIlllIIllllIIlIlIl = (short)(Object)EnumFacing.values())).length;
                    boolean lllllllllllllIIIlllIIllllIIlIlll = Chunk.lIlIIlIIIIlIIl[3] != 0;
                    "".length();
                    if ("  ".length() < (("  ".length() ^ (0x88 ^ 0xB7)) & (" ".length() ^ (0x64 ^ 0x58) ^ -" ".length()))) {
                        return;
                    }
                    while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllIIlIlll ? 1 : 0, lllllllllllllIIIlllIIllllIIlIllI)) {
                        final EnumFacing lllllllllllllIIIlllIIllllIlIIIll = lllllllllllllIIIlllIIllllIIlIlIl[lllllllllllllIIIlllIIllllIIlIlll];
                        final BlockPos lllllllllllllIIIlllIIllllIlIIIlI = lllllllllllllIIIlllIIllllIlIIlIl.offset(lllllllllllllIIIlllIIllllIlIIIll);
                        if (lllIIlIIllIllII(this.worldObj.getBlockState(lllllllllllllIIIlllIIllllIlIIIlI).getBlock().getLightValue())) {
                            this.worldObj.checkLight(lllllllllllllIIIlllIIllllIlIIIlI);
                            "".length();
                        }
                        ++lllllllllllllIIIlllIIllllIIlIlll;
                    }
                    this.worldObj.checkLight(lllllllllllllIIIlllIIllllIlIIlIl);
                    "".length();
                }
                ++lllllllllllllIIIlllIIllllIlIIllI;
            }
            ++lllllllllllllIIIlllIIllllIlIlIlI;
        }
    }
    
    public byte[] getBiomeArray() {
        return this.blockBiomeArray;
    }
    
    private static boolean lllIIlIIllIlIlI(final int lllllllllllllIIIlllIIllIlIllIIlI) {
        return lllllllllllllIIIlllIIllIlIllIIlI == 0;
    }
    
    public void setLightPopulated(final boolean lllllllllllllIIIlllIIlllIIlIIllI) {
        this.isLightPopulated = lllllllllllllIIIlllIIlllIIlIIllI;
    }
    
    public Random getRandomWithSeed(final long lllllllllllllIIIlllIlIIIIllllIII) {
        return new Random(this.worldObj.getSeed() + this.xPosition * this.xPosition * Chunk.lIlIIlIIIIlIIl[24] + this.xPosition * Chunk.lIlIIlIIIIlIIl[25] + this.zPosition * this.zPosition * 4392871L + this.zPosition * Chunk.lIlIIlIIIIlIIl[26] ^ lllllllllllllIIIlllIlIIIIllllIII);
    }
    
    private static boolean lllIIlIIllIlIIl(final int lllllllllllllIIIlllIIllIlIlIllII) {
        return lllllllllllllIIIlllIIllIlIlIllII <= 0;
    }
    
    public void setLightFor(final EnumSkyBlock lllllllllllllIIIlllIlIIlIlIlllII, final BlockPos lllllllllllllIIIlllIlIIlIlIllIll, final int lllllllllllllIIIlllIlIIlIlIlIIlI) {
        final int lllllllllllllIIIlllIlIIlIlIllIIl = lllllllllllllIIIlllIlIIlIlIllIll.getX() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIlIlIllIII = lllllllllllllIIIlllIlIIlIlIllIll.getY();
        final int lllllllllllllIIIlllIlIIlIlIlIlll = lllllllllllllIIIlllIlIIlIlIllIll.getZ() & Chunk.lIlIIlIIIIlIIl[8];
        ExtendedBlockStorage lllllllllllllIIIlllIlIIlIlIlIllI = this.storageArrays[lllllllllllllIIIlllIlIIlIlIllIII >> Chunk.lIlIIlIIIIlIIl[7]];
        if (lllIIlIIllIIlII(lllllllllllllIIIlllIlIIlIlIlIllI)) {
            final ExtendedBlockStorage[] storageArrays = this.storageArrays;
            final int n = lllllllllllllIIIlllIlIIlIlIllIII >> Chunk.lIlIIlIIIIlIIl[7];
            final int llllllllllllIlllllIIlllIllllIlIl = lllllllllllllIIIlllIlIIlIlIllIII >> Chunk.lIlIIlIIIIlIIl[7] << Chunk.lIlIIlIIIIlIIl[7];
            int llllllllllllIlllllIIlllIllllIlll;
            if (lllIIlIIllIIIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
                llllllllllllIlllllIIlllIllllIlll = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if ((0x22 ^ 0x26) <= "   ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIIlllIllllIlll = Chunk.lIlIIlIIIIlIIl[6];
            }
            final ExtendedBlockStorage extendedBlockStorage = new ExtendedBlockStorage(llllllllllllIlllllIIlllIllllIlIl, (boolean)(llllllllllllIlllllIIlllIllllIlll != 0));
            storageArrays[n] = extendedBlockStorage;
            lllllllllllllIIIlllIlIIlIlIlIllI = extendedBlockStorage;
            this.generateSkylightMap();
        }
        this.isModified = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIlIlIlllII, EnumSkyBlock.SKY)) {
            if (lllIIlIIllIlIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
                lllllllllllllIIIlllIlIIlIlIlIllI.setExtSkylightValue(lllllllllllllIIIlllIlIIlIlIllIIl, lllllllllllllIIIlllIlIIlIlIllIII & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlIlIlIlll, lllllllllllllIIIlllIlIIlIlIlIIlI);
                "".length();
                if (" ".length() >= (0x6E ^ 0x6A)) {
                    return;
                }
            }
        }
        else if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIlIlIlllII, EnumSkyBlock.BLOCK)) {
            lllllllllllllIIIlllIlIIlIlIlIllI.setExtBlocklightValue(lllllllllllllIIIlllIlIIlIlIllIIl, lllllllllllllIIIlllIlIIlIlIllIII & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlIlIlIlll, lllllllllllllIIIlllIlIIlIlIlIIlI);
        }
    }
    
    public void removeTileEntity(final BlockPos lllllllllllllIIIlllIlIIIllIlllIl) {
        if (lllIIlIIllIIIlI(this.isChunkLoaded ? 1 : 0)) {
            final TileEntity lllllllllllllIIIlllIlIIIllIlllII = this.chunkTileEntityMap.remove(lllllllllllllIIIlllIlIIIllIlllIl);
            if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIIIllIlllII)) {
                lllllllllllllIIIlllIlIIIllIlllII.invalidate();
            }
        }
    }
    
    public void setHasEntities(final boolean lllllllllllllIIIlllIIlllIIIlllII) {
        this.hasEntities = lllllllllllllIIIlllIIlllIIIlllII;
    }
    
    public int getTopFilledSegment() {
        int lllllllllllllIIIlllIlIlIllIIIIlI = this.storageArrays.length - Chunk.lIlIIlIIIIlIIl[6];
        "".length();
        if ("  ".length() <= -" ".length()) {
            return (0x5A ^ 0x3 ^ (0xF1 ^ 0x83)) & (0x4E ^ 0x49 ^ (0x8B ^ 0xA7) ^ -" ".length());
        }
        while (!lllIIlIIllIIlll(lllllllllllllIIIlllIlIlIllIIIIlI)) {
            if (lllIIlIIllIIllI(this.storageArrays[lllllllllllllIIIlllIlIlIllIIIIlI])) {
                return this.storageArrays[lllllllllllllIIIlllIlIlIllIIIIlI].getYLocation();
            }
            --lllllllllllllIIIlllIlIlIllIIIIlI;
        }
        return Chunk.lIlIIlIIIIlIIl[3];
    }
    
    public void resetRelightChecks() {
        this.queuedLightChecks = Chunk.lIlIIlIIIIlIIl[3];
    }
    
    private static String lllIIlIIIlIlIll(String lllllllllllllIIIlllIIllIlllIlIll, final String lllllllllllllIIIlllIIllIlllIlIlI) {
        lllllllllllllIIIlllIIllIlllIlIll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlllIIllIlllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIIllIlllIlllI = new StringBuilder();
        final char[] lllllllllllllIIIlllIIllIlllIllIl = lllllllllllllIIIlllIIllIlllIlIlI.toCharArray();
        int lllllllllllllIIIlllIIllIlllIllII = Chunk.lIlIIlIIIIlIIl[3];
        final long lllllllllllllIIIlllIIllIlllIIllI = (Object)((String)lllllllllllllIIIlllIIllIlllIlIll).toCharArray();
        final double lllllllllllllIIIlllIIllIlllIIlIl = lllllllllllllIIIlllIIllIlllIIllI.length;
        Exception lllllllllllllIIIlllIIllIlllIIlII = (Exception)Chunk.lIlIIlIIIIlIIl[3];
        while (lllIIlIIllIlIII((int)lllllllllllllIIIlllIIllIlllIIlII, (int)lllllllllllllIIIlllIIllIlllIIlIl)) {
            final char lllllllllllllIIIlllIIllIllllIIIl = lllllllllllllIIIlllIIllIlllIIllI[lllllllllllllIIIlllIIllIlllIIlII];
            lllllllllllllIIIlllIIllIlllIlllI.append((char)(lllllllllllllIIIlllIIllIllllIIIl ^ lllllllllllllIIIlllIIllIlllIllIl[lllllllllllllIIIlllIIllIlllIllII % lllllllllllllIIIlllIIllIlllIllIl.length]));
            "".length();
            ++lllllllllllllIIIlllIIllIlllIllII;
            ++lllllllllllllIIIlllIIllIlllIIlII;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIIllIlllIlllI);
    }
    
    public IBlockState getBlockState(final BlockPos lllllllllllllIIIlllIlIIlllIIllIl) {
        if (lllIIlIIllIllll(this.worldObj.getWorldType(), WorldType.DEBUG_WORLD)) {
            IBlockState lllllllllllllIIIlllIlIIlllIIllII = null;
            if (lllIIlIIllIIlIl(lllllllllllllIIIlllIlIIlllIIllIl.getY(), Chunk.lIlIIlIIIIlIIl[15])) {
                lllllllllllllIIIlllIlIIlllIIllII = Blocks.barrier.getDefaultState();
            }
            if (lllIIlIIllIIlIl(lllllllllllllIIIlllIlIIlllIIllIl.getY(), Chunk.lIlIIlIIIIlIIl[16])) {
                lllllllllllllIIIlllIlIIlllIIllII = ChunkProviderDebug.func_177461_b(lllllllllllllIIIlllIlIIlllIIllIl.getX(), lllllllllllllIIIlllIlIIlllIIllIl.getZ());
            }
            IBlockState defaultState;
            if (lllIIlIIllIIlII(lllllllllllllIIIlllIlIIlllIIllII)) {
                defaultState = Blocks.air.getDefaultState();
                "".length();
                if ("  ".length() > "  ".length()) {
                    return null;
                }
            }
            else {
                defaultState = lllllllllllllIIIlllIlIIlllIIllII;
            }
            return defaultState;
        }
        try {
            if (lllIIlIIllIlllI(lllllllllllllIIIlllIlIIlllIIllIl.getY()) && lllIIlIIllIlIII(lllllllllllllIIIlllIlIIlllIIllIl.getY() >> Chunk.lIlIIlIIIIlIIl[7], this.storageArrays.length)) {
                final ExtendedBlockStorage lllllllllllllIIIlllIlIIlllIIlIll = this.storageArrays[lllllllllllllIIIlllIlIIlllIIllIl.getY() >> Chunk.lIlIIlIIIIlIIl[7]];
                if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIIlllIIlIll)) {
                    final int lllllllllllllIIIlllIlIIlllIIlIlI = lllllllllllllIIIlllIlIIlllIIllIl.getX() & Chunk.lIlIIlIIIIlIIl[8];
                    final int lllllllllllllIIIlllIlIIlllIIlIIl = lllllllllllllIIIlllIlIIlllIIllIl.getY() & Chunk.lIlIIlIIIIlIIl[8];
                    final int lllllllllllllIIIlllIlIIlllIIlIII = lllllllllllllIIIlllIlIIlllIIllIl.getZ() & Chunk.lIlIIlIIIIlIIl[8];
                    return lllllllllllllIIIlllIlIIlllIIlIll.get(lllllllllllllIIIlllIlIIlllIIlIlI, lllllllllllllIIIlllIlIIlllIIlIIl, lllllllllllllIIIlllIlIIlllIIlIII);
                }
            }
            return Blocks.air.getDefaultState();
        }
        catch (Throwable lllllllllllllIIIlllIlIIlllIIIlll) {
            final CrashReport lllllllllllllIIIlllIlIIlllIIIllI = CrashReport.makeCrashReport(lllllllllllllIIIlllIlIIlllIIIlll, Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[17]]);
            final CrashReportCategory lllllllllllllIIIlllIlIIlllIIIlIl = lllllllllllllIIIlllIlIIlllIIIllI.makeCategory(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[18]]);
            lllllllllllllIIIlllIlIIlllIIIlIl.addCrashSectionCallable(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[10]], new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return CrashReportCategory.getCoordinateInfo(lllllllllllllIIIlllIlIIlllIIllIl);
                }
            });
            throw new ReportedException(lllllllllllllIIIlllIlIIlllIIIllI);
        }
    }
    
    public boolean isLoaded() {
        return this.isChunkLoaded;
    }
    
    private static String lllIIlIIIlIIlII(final String lllllllllllllIIIlllIIllIllIllIIl, final String lllllllllllllIIIlllIIllIllIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIllIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIllIllIllIlI.getBytes(StandardCharsets.UTF_8)), Chunk.lIlIIlIIIIlIIl[10]), "DES");
            final Cipher lllllllllllllIIIlllIIllIllIlllIl = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIllIllIlllIl.init(Chunk.lIlIIlIIIIlIIl[12], lllllllllllllIIIlllIIllIllIllllI);
            return new String(lllllllllllllIIIlllIIllIllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIllIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIllIllIlllII) {
            lllllllllllllIIIlllIIllIllIlllII.printStackTrace();
            return null;
        }
    }
    
    public void setInhabitedTime(final long lllllllllllllIIIlllIIlllIIIIlIlI) {
        this.inhabitedTime = lllllllllllllIIIlllIIlllIIIIlIlI;
    }
    
    public IBlockState setBlockState(final BlockPos lllllllllllllIIIlllIlIIllIIllIIl, final IBlockState lllllllllllllIIIlllIlIIllIIIIlll) {
        final int lllllllllllllIIIlllIlIIllIIlIlll = lllllllllllllIIIlllIlIIllIIllIIl.getX() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIllIIlIllI = lllllllllllllIIIlllIlIIllIIllIIl.getY();
        final int lllllllllllllIIIlllIlIIllIIlIlIl = lllllllllllllIIIlllIlIIllIIllIIl.getZ() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIllIIlIlII = lllllllllllllIIIlllIlIIllIIlIlIl << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIIllIIlIlll;
        if (lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIllIIlIllI, this.precipitationHeightMap[lllllllllllllIIIlllIlIIllIIlIlII] - Chunk.lIlIIlIIIIlIIl[6])) {
            this.precipitationHeightMap[lllllllllllllIIIlllIlIIllIIlIlII] = Chunk.lIlIIlIIIIlIIl[4];
        }
        final int lllllllllllllIIIlllIlIIllIIlIIll = this.heightMap[lllllllllllllIIIlllIlIIllIIlIlII];
        final IBlockState lllllllllllllIIIlllIlIIllIIlIIlI = this.getBlockState(lllllllllllllIIIlllIlIIllIIllIIl);
        if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIllIIlIIlI, lllllllllllllIIIlllIlIIllIIIIlll)) {
            return null;
        }
        final Block lllllllllllllIIIlllIlIIllIIlIIIl = lllllllllllllIIIlllIlIIllIIIIlll.getBlock();
        final Block lllllllllllllIIIlllIlIIllIIlIIII = lllllllllllllIIIlllIlIIllIIlIIlI.getBlock();
        ExtendedBlockStorage lllllllllllllIIIlllIlIIllIIIllll = this.storageArrays[lllllllllllllIIIlllIlIIllIIlIllI >> Chunk.lIlIIlIIIIlIIl[7]];
        boolean lllllllllllllIIIlllIlIIllIIIlllI = Chunk.lIlIIlIIIIlIIl[3] != 0;
        if (lllIIlIIllIIlII(lllllllllllllIIIlllIlIIllIIIllll)) {
            if (lllIIlIIllIllll(lllllllllllllIIIlllIlIIllIIlIIIl, Blocks.air)) {
                return null;
            }
            final ExtendedBlockStorage[] storageArrays = this.storageArrays;
            final int n = lllllllllllllIIIlllIlIIllIIlIllI >> Chunk.lIlIIlIIIIlIIl[7];
            final int llllllllllllIlllllIIlllIllllIlIl = lllllllllllllIIIlllIlIIllIIlIllI >> Chunk.lIlIIlIIIIlIIl[7] << Chunk.lIlIIlIIIIlIIl[7];
            int llllllllllllIlllllIIlllIllllIlll;
            if (lllIIlIIllIIIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
                llllllllllllIlllllIIlllIllllIlll = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (" ".length() < -" ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIlllllIIlllIllllIlll = Chunk.lIlIIlIIIIlIIl[6];
            }
            final ExtendedBlockStorage extendedBlockStorage = new ExtendedBlockStorage(llllllllllllIlllllIIlllIllllIlIl, (boolean)(llllllllllllIlllllIIlllIllllIlll != 0));
            storageArrays[n] = extendedBlockStorage;
            lllllllllllllIIIlllIlIIllIIIllll = extendedBlockStorage;
            int n2;
            if (lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIllIIlIllI, lllllllllllllIIIlllIlIIllIIlIIll)) {
                n2 = Chunk.lIlIIlIIIIlIIl[6];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else {
                n2 = Chunk.lIlIIlIIIIlIIl[3];
            }
            lllllllllllllIIIlllIlIIllIIIlllI = (n2 != 0);
        }
        lllllllllllllIIIlllIlIIllIIIllll.set(lllllllllllllIIIlllIlIIllIIlIlll, lllllllllllllIIIlllIlIIllIIlIllI & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIllIIlIlIl, lllllllllllllIIIlllIlIIllIIIIlll);
        if (lllIIlIIllIIIll(lllllllllllllIIIlllIlIIllIIlIIII, lllllllllllllIIIlllIlIIllIIlIIIl)) {
            if (lllIIlIIllIlIlI(this.worldObj.isRemote ? 1 : 0)) {
                lllllllllllllIIIlllIlIIllIIlIIII.breakBlock(this.worldObj, lllllllllllllIIIlllIlIIllIIllIIl, lllllllllllllIIIlllIlIIllIIlIIlI);
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            else if (lllIIlIIllIIIlI((lllllllllllllIIIlllIlIIllIIlIIII instanceof ITileEntityProvider) ? 1 : 0)) {
                this.worldObj.removeTileEntity(lllllllllllllIIIlllIlIIllIIllIIl);
            }
        }
        if (lllIIlIIllIIIll(lllllllllllllIIIlllIlIIllIIIllll.getBlockByExtId(lllllllllllllIIIlllIlIIllIIlIlll, lllllllllllllIIIlllIlIIllIIlIllI & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIllIIlIlIl), lllllllllllllIIIlllIlIIllIIlIIIl)) {
            return null;
        }
        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIIllIIIlllI ? 1 : 0)) {
            this.generateSkylightMap();
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            final int lllllllllllllIIIlllIlIIllIIIllIl = lllllllllllllIIIlllIlIIllIIlIIIl.getLightOpacity();
            final int lllllllllllllIIIlllIlIIllIIIllII = lllllllllllllIIIlllIlIIllIIlIIII.getLightOpacity();
            if (lllIIlIIllIllII(lllllllllllllIIIlllIlIIllIIIllIl)) {
                if (lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIllIIlIllI, lllllllllllllIIIlllIlIIllIIlIIll)) {
                    this.relightBlock(lllllllllllllIIIlllIlIIllIIlIlll, lllllllllllllIIIlllIlIIllIIlIllI + Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIIllIIlIlIl);
                    "".length();
                    if (-" ".length() >= (178 + 7 - 74 + 84 ^ 159 + 10 + 16 + 14)) {
                        return null;
                    }
                }
            }
            else if (lllIIlIIllIIlIl(lllllllllllllIIIlllIlIIllIIlIllI, lllllllllllllIIIlllIlIIllIIlIIll - Chunk.lIlIIlIIIIlIIl[6])) {
                this.relightBlock(lllllllllllllIIIlllIlIIllIIlIlll, lllllllllllllIIIlllIlIIllIIlIllI, lllllllllllllIIIlllIlIIllIIlIlIl);
            }
            if (lllIIlIIllIlIll(lllllllllllllIIIlllIlIIllIIIllIl, lllllllllllllIIIlllIlIIllIIIllII) && (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIllIIIllIl, lllllllllllllIIIlllIlIIllIIIllII) || !lllIIlIIllIlIIl(this.getLightFor(EnumSkyBlock.SKY, lllllllllllllIIIlllIlIIllIIllIIl)) || lllIIlIIllIllII(this.getLightFor(EnumSkyBlock.BLOCK, lllllllllllllIIIlllIlIIllIIllIIl)))) {
                this.propagateSkylightOcclusion(lllllllllllllIIIlllIlIIllIIlIlll, lllllllllllllIIIlllIlIIllIIlIlIl);
            }
        }
        if (lllIIlIIllIIIlI((lllllllllllllIIIlllIlIIllIIlIIII instanceof ITileEntityProvider) ? 1 : 0)) {
            final TileEntity lllllllllllllIIIlllIlIIllIIIlIll = this.getTileEntity(lllllllllllllIIIlllIlIIllIIllIIl, EnumCreateEntityType.CHECK);
            if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIIllIIIlIll)) {
                lllllllllllllIIIlllIlIIllIIIlIll.updateContainingBlockInfo();
            }
        }
        if (lllIIlIIllIlIlI(this.worldObj.isRemote ? 1 : 0) && lllIIlIIllIIIll(lllllllllllllIIIlllIlIIllIIlIIII, lllllllllllllIIIlllIlIIllIIlIIIl)) {
            lllllllllllllIIIlllIlIIllIIlIIIl.onBlockAdded(this.worldObj, lllllllllllllIIIlllIlIIllIIllIIl, lllllllllllllIIIlllIlIIllIIIIlll);
        }
        if (lllIIlIIllIIIlI((lllllllllllllIIIlllIlIIllIIlIIIl instanceof ITileEntityProvider) ? 1 : 0)) {
            TileEntity lllllllllllllIIIlllIlIIllIIIlIlI = this.getTileEntity(lllllllllllllIIIlllIlIIllIIllIIl, EnumCreateEntityType.CHECK);
            if (lllIIlIIllIIlII(lllllllllllllIIIlllIlIIllIIIlIlI)) {
                lllllllllllllIIIlllIlIIllIIIlIlI = ((ITileEntityProvider)lllllllllllllIIIlllIlIIllIIlIIIl).createNewTileEntity(this.worldObj, lllllllllllllIIIlllIlIIllIIlIIIl.getMetaFromState(lllllllllllllIIIlllIlIIllIIIIlll));
                this.worldObj.setTileEntity(lllllllllllllIIIlllIlIIllIIllIIl, lllllllllllllIIIlllIlIIllIIIlIlI);
            }
            if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIIllIIIlIlI)) {
                lllllllllllllIIIlllIlIIllIIIlIlI.updateContainingBlockInfo();
            }
        }
        this.isModified = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        return lllllllllllllIIIlllIlIIllIIlIIlI;
    }
    
    public boolean isAtLocation(final int lllllllllllllIIIlllIlIlIllIllIIl, final int lllllllllllllIIIlllIlIlIllIllIII) {
        if (lllIIlIIllIIlIl(lllllllllllllIIIlllIlIlIllIllIIl, this.xPosition) && lllIIlIIllIIlIl(lllllllllllllIIIlllIlIlIllIllIII, this.zPosition)) {
            return Chunk.lIlIIlIIIIlIIl[6] != 0;
        }
        return Chunk.lIlIIlIIIIlIIl[3] != 0;
    }
    
    private static boolean lllIIlIIllIllII(final int lllllllllllllIIIlllIIllIlIlIlIlI) {
        return lllllllllllllIIIlllIIllIlIlIlIlI > 0;
    }
    
    public void setLastSaveTime(final long lllllllllllllIIIlllIIlllIIIlIlII) {
        this.lastSaveTime = lllllllllllllIIIlllIIlllIIIlIlII;
    }
    
    private boolean func_150811_f(final int lllllllllllllIIIlllIIlllIllIIlll, final int lllllllllllllIIIlllIIlllIllIIllI) {
        final int lllllllllllllIIIlllIIlllIllIIlIl = this.getTopFilledSegment();
        boolean lllllllllllllIIIlllIIlllIllIIlII = Chunk.lIlIIlIIIIlIIl[3] != 0;
        boolean lllllllllllllIIIlllIIlllIllIIIll = Chunk.lIlIIlIIIIlIIl[3] != 0;
        final BlockPos.MutableBlockPos lllllllllllllIIIlllIIlllIllIIIlI = new BlockPos.MutableBlockPos((this.xPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIIlllIllIIlll, Chunk.lIlIIlIIIIlIIl[3], (this.zPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIIlllIllIIllI);
        int lllllllllllllIIIlllIIlllIllIIIIl = lllllllllllllIIIlllIIlllIllIIlIl + Chunk.lIlIIlIIIIlIIl[0] - Chunk.lIlIIlIIIIlIIl[6];
        "".length();
        if (((191 + 36 - 102 + 124 ^ 6 + 39 + 93 + 26) & (0xB ^ 0x65 ^ (0xA8 ^ 0x9B) ^ -" ".length())) != 0x0) {
            return ((0x16 ^ 0x6D ^ (0xDB ^ 0xBD)) & (73 + 80 - 132 + 110 ^ 121 + 94 - 212 + 155 ^ -" ".length())) != 0x0;
        }
        while (!lllIIlIIlllIIIl(lllllllllllllIIIlllIIlllIllIIIIl, this.worldObj.func_181545_F()) || (lllIIlIIllIllII(lllllllllllllIIIlllIIlllIllIIIIl) && !lllIIlIIllIIIlI(lllllllllllllIIIlllIIlllIllIIIll ? 1 : 0))) {
            lllllllllllllIIIlllIIlllIllIIIlI.func_181079_c(lllllllllllllIIIlllIIlllIllIIIlI.getX(), lllllllllllllIIIlllIIlllIllIIIIl, lllllllllllllIIIlllIIlllIllIIIlI.getZ());
            "".length();
            final int lllllllllllllIIIlllIIlllIllIIIII = this.getBlockLightOpacity(lllllllllllllIIIlllIIlllIllIIIlI);
            if (lllIIlIIllIIlIl(lllllllllllllIIIlllIIlllIllIIIII, Chunk.lIlIIlIIIIlIIl[11]) && lllIIlIIllIlIII(lllllllllllllIIIlllIIlllIllIIIlI.getY(), this.worldObj.func_181545_F())) {
                lllllllllllllIIIlllIIlllIllIIIll = (Chunk.lIlIIlIIIIlIIl[6] != 0);
            }
            if (lllIIlIIllIlIlI(lllllllllllllIIIlllIIlllIllIIlII ? 1 : 0) && lllIIlIIllIllII(lllllllllllllIIIlllIIlllIllIIIII)) {
                lllllllllllllIIIlllIIlllIllIIlII = (Chunk.lIlIIlIIIIlIIl[6] != 0);
                "".length();
                if (-"  ".length() > 0) {
                    return ((88 + 117 - 58 + 74 ^ 59 + 28 - 63 + 105) & (138 + 17 + 15 + 46 ^ 33 + 40 + 34 + 25 ^ -" ".length())) != 0x0;
                }
            }
            else if (lllIIlIIllIIIlI(lllllllllllllIIIlllIIlllIllIIlII ? 1 : 0) && lllIIlIIllIlIlI(lllllllllllllIIIlllIIlllIllIIIII) && lllIIlIIllIlIlI(this.worldObj.checkLight(lllllllllllllIIIlllIIlllIllIIIlI) ? 1 : 0)) {
                return Chunk.lIlIIlIIIIlIIl[3] != 0;
            }
            --lllllllllllllIIIlllIIlllIllIIIIl;
        }
        int lllllllllllllIIIlllIIlllIlIlllll = lllllllllllllIIIlllIIlllIllIIIlI.getY();
        "".length();
        if (((0x39 ^ 0x69 ^ (0x71 ^ 0x19)) & (36 + 241 - 37 + 11 ^ 70 + 91 - 87 + 121 ^ -" ".length())) != 0x0) {
            return ((((0x7 ^ 0x2) & ~(0x9B ^ 0x9E)) ^ (0x46 ^ 0x12)) & (220 + 195 - 338 + 154 ^ 78 + 69 - 63 + 95 ^ -" ".length())) != 0x0;
        }
        while (!lllIIlIIllIlIIl(lllllllllllllIIIlllIIlllIlIlllll)) {
            lllllllllllllIIIlllIIlllIllIIIlI.func_181079_c(lllllllllllllIIIlllIIlllIllIIIlI.getX(), lllllllllllllIIIlllIIlllIlIlllll, lllllllllllllIIIlllIIlllIllIIIlI.getZ());
            "".length();
            if (lllIIlIIllIllII(this.getBlock(lllllllllllllIIIlllIIlllIllIIIlI).getLightValue())) {
                this.worldObj.checkLight(lllllllllllllIIIlllIIlllIllIIIlI);
                "".length();
            }
            --lllllllllllllIIIlllIIlllIlIlllll;
        }
        return Chunk.lIlIIlIIIIlIIl[6] != 0;
    }
    
    private static boolean lllIIlIIllIIlIl(final int lllllllllllllIIIlllIIllIllIlIIll, final int lllllllllllllIIIlllIIllIllIlIIlI) {
        return lllllllllllllIIIlllIIllIllIlIIll == lllllllllllllIIIlllIIllIllIlIIlI;
    }
    
    public Chunk(final World lllllllllllllIIIlllIlIllIIIIlIII, final int lllllllllllllIIIlllIlIllIIIIIlll, final int lllllllllllllIIIlllIlIllIIIIlIll) {
        this.storageArrays = new ExtendedBlockStorage[Chunk.lIlIIlIIIIlIIl[0]];
        this.blockBiomeArray = new byte[Chunk.lIlIIlIIIIlIIl[1]];
        this.precipitationHeightMap = new int[Chunk.lIlIIlIIIIlIIl[1]];
        this.updateSkylightColumns = new boolean[Chunk.lIlIIlIIIIlIIl[1]];
        this.chunkTileEntityMap = (Map<BlockPos, TileEntity>)Maps.newHashMap();
        this.queuedLightChecks = Chunk.lIlIIlIIIIlIIl[2];
        this.tileEntityPosQueue = (ConcurrentLinkedQueue<BlockPos>)Queues.newConcurrentLinkedQueue();
        this.entityLists = (ClassInheritanceMultiMap<Entity>[])new ClassInheritanceMultiMap[Chunk.lIlIIlIIIIlIIl[0]];
        this.worldObj = lllllllllllllIIIlllIlIllIIIIlIII;
        this.xPosition = lllllllllllllIIIlllIlIllIIIIIlll;
        this.zPosition = lllllllllllllIIIlllIlIllIIIIlIll;
        this.heightMap = new int[Chunk.lIlIIlIIIIlIIl[1]];
        int lllllllllllllIIIlllIlIllIIIIlIlI = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if ("   ".length() != "   ".length()) {
            throw null;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIllIIIIlIlI, this.entityLists.length)) {
            this.entityLists[lllllllllllllIIIlllIlIllIIIIlIlI] = new ClassInheritanceMultiMap<Entity>(Entity.class);
            ++lllllllllllllIIIlllIlIllIIIIlIlI;
        }
        Arrays.fill(this.precipitationHeightMap, Chunk.lIlIIlIIIIlIIl[4]);
        Arrays.fill(this.blockBiomeArray, (byte)Chunk.lIlIIlIIIIlIIl[5]);
    }
    
    public int getLightSubtracted(final BlockPos lllllllllllllIIIlllIlIIlIIlllIlI, final int lllllllllllllIIIlllIlIIlIIlllIIl) {
        final int lllllllllllllIIIlllIlIIlIlIIIIIl = lllllllllllllIIIlllIlIIlIIlllIlI.getX() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIlIIlIlIIIIII = lllllllllllllIIIlllIlIIlIIlllIlI.getY();
        final int lllllllllllllIIIlllIlIIlIIllllll = lllllllllllllIIIlllIlIIlIIlllIlI.getZ() & Chunk.lIlIIlIIIIlIIl[8];
        final ExtendedBlockStorage lllllllllllllIIIlllIlIIlIIlllllI = this.storageArrays[lllllllllllllIIIlllIlIIlIlIIIIII >> Chunk.lIlIIlIIIIlIIl[7]];
        if (lllIIlIIllIIlII(lllllllllllllIIIlllIlIIlIIlllllI)) {
            int n;
            if (lllIIlIIllIlIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0) && lllIIlIIllIlIII(lllllllllllllIIIlllIlIIlIIlllIIl, EnumSkyBlock.SKY.defaultLightValue)) {
                n = EnumSkyBlock.SKY.defaultLightValue - lllllllllllllIIIlllIlIIlIIlllIIl;
                "".length();
                if ("  ".length() == 0) {
                    return (0x23 ^ 0x6F ^ (0x6F ^ 0x63)) & (" ".length() ^ (0x0 ^ 0x41) ^ -" ".length());
                }
            }
            else {
                n = Chunk.lIlIIlIIIIlIIl[3];
            }
            return n;
        }
        int extSkylightValue;
        if (lllIIlIIllIIIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
            extSkylightValue = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if (((0x8D ^ 0x98) & ~(0xA9 ^ 0xBC)) != 0x0) {
                return (0xC7 ^ 0x86) & ~(0xD9 ^ 0x98);
            }
        }
        else {
            extSkylightValue = lllllllllllllIIIlllIlIIlIIlllllI.getExtSkylightValue(lllllllllllllIIIlllIlIIlIlIIIIIl, lllllllllllllIIIlllIlIIlIlIIIIII & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlIIllllll);
        }
        int lllllllllllllIIIlllIlIIlIIllllIl = extSkylightValue;
        lllllllllllllIIIlllIlIIlIIllllIl -= lllllllllllllIIIlllIlIIlIIlllIIl;
        final int lllllllllllllIIIlllIlIIlIIllllII = lllllllllllllIIIlllIlIIlIIlllllI.getExtBlocklightValue(lllllllllllllIIIlllIlIIlIlIIIIIl, lllllllllllllIIIlllIlIIlIlIIIIII & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIIlIIllllll);
        if (lllIIlIIllIllIl(lllllllllllllIIIlllIlIIlIIllllII, lllllllllllllIIIlllIlIIlIIllllIl)) {
            lllllllllllllIIIlllIlIIlIIllllIl = lllllllllllllIIIlllIlIIlIIllllII;
        }
        return lllllllllllllIIIlllIlIIlIIllllIl;
    }
    
    private TileEntity createNewTileEntity(final BlockPos lllllllllllllIIIlllIlIIIlllllllI) {
        final Block lllllllllllllIIIlllIlIIlIIIIIIII = this.getBlock(lllllllllllllIIIlllIlIIIlllllllI);
        TileEntity newTileEntity;
        if (lllIIlIIllIlIlI(lllllllllllllIIIlllIlIIlIIIIIIII.hasTileEntity() ? 1 : 0)) {
            newTileEntity = null;
            "".length();
            if ((144 + 84 - 84 + 10 ^ 149 + 30 - 72 + 51) < 0) {
                return null;
            }
        }
        else {
            newTileEntity = ((ITileEntityProvider)lllllllllllllIIIlllIlIIlIIIIIIII).createNewTileEntity(this.worldObj, this.getBlockMetadata(lllllllllllllIIIlllIlIIIlllllllI));
        }
        return newTileEntity;
    }
    
    public int getLowestHeight() {
        return this.heightMapMinimum;
    }
    
    public long getInhabitedTime() {
        return this.inhabitedTime;
    }
    
    public boolean isLightPopulated() {
        return this.isLightPopulated;
    }
    
    public void setStorageArrays(final ExtendedBlockStorage[] lllllllllllllIIIlllIlIIIIIIIIlIl) {
        if (lllIIlIIllIlIll(this.storageArrays.length, lllllllllllllIIIlllIlIIIIIIIIlIl.length)) {
            Chunk.logger.warn(String.valueOf(new StringBuilder(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[27]]).append(lllllllllllllIIIlllIlIIIIIIIIlIl.length).append(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[8]]).append(this.storageArrays.length)));
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else {
            int lllllllllllllIIIlllIlIIIIIIIIlII = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if (((142 + 29 - 20 + 2 ^ 150 + 30 - 141 + 122) & (0x22 ^ 0x2 ^ (0x8E ^ 0x96) ^ -" ".length())) >= "   ".length()) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIIIIIIIlII, this.storageArrays.length)) {
                this.storageArrays[lllllllllllllIIIlllIlIIIIIIIIlII] = lllllllllllllIIIlllIlIIIIIIIIlIl[lllllllllllllIIIlllIlIIIIIIIIlII];
                ++lllllllllllllIIIlllIlIIIIIIIIlII;
            }
        }
    }
    
    public int getBlockLightOpacity(final BlockPos lllllllllllllIIIlllIlIlIIIIllIIl) {
        return this.getBlock(lllllllllllllIIIlllIlIlIIIIllIIl).getLightOpacity();
    }
    
    public void setHeightMap(final int[] lllllllllllllIIIlllIIlllIlIIIIlI) {
        if (lllIIlIIllIlIll(this.heightMap.length, lllllllllllllIIIlllIIlllIlIIIIlI.length)) {
            Chunk.logger.warn(String.valueOf(new StringBuilder(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[29]]).append(lllllllllllllIIIlllIIlllIlIIIIlI.length).append(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[30]]).append(this.heightMap.length)));
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            int lllllllllllllIIIlllIIlllIlIIIIIl = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if ("   ".length() == 0) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIlllIlIIIIIl, this.heightMap.length)) {
                this.heightMap[lllllllllllllIIIlllIIlllIlIIIIIl] = lllllllllllllIIIlllIIlllIlIIIIlI[lllllllllllllIIIlllIIlllIlIIIIIl];
                ++lllllllllllllIIIlllIIlllIlIIIIIl;
            }
        }
    }
    
    public void addTileEntity(final TileEntity lllllllllllllIIIlllIlIIIlllIlIll) {
        this.addTileEntity(lllllllllllllIIIlllIlIIIlllIlIll.getPos(), lllllllllllllIIIlllIlIIIlllIlIll);
        if (lllIIlIIllIIIlI(this.isChunkLoaded ? 1 : 0)) {
            this.worldObj.addTileEntity(lllllllllllllIIIlllIlIIIlllIlIll);
            "".length();
        }
    }
    
    public int getHeightValue(final int lllllllllllllIIIlllIlIlIllIIlIlI, final int lllllllllllllIIIlllIlIlIllIIIllI) {
        return this.heightMap[lllllllllllllIIIlllIlIlIllIIIllI << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIlIllIIlIlI];
    }
    
    public ExtendedBlockStorage[] getBlockStorageArray() {
        return this.storageArrays;
    }
    
    public void removeEntity(final Entity lllllllllllllIIIlllIlIIlIIlIIIII) {
        this.removeEntityAtIndex(lllllllllllllIIIlllIlIIlIIlIIIII, lllllllllllllIIIlllIlIIlIIlIIIII.chunkCoordY);
    }
    
    public int getHeight(final BlockPos lllllllllllllIIIlllIlIlIllIIllll) {
        return this.getHeightValue(lllllllllllllIIIlllIlIlIllIIllll.getX() & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIlIllIIllll.getZ() & Chunk.lIlIIlIIIIlIIl[8]);
    }
    
    private void recheckGaps(final boolean lllllllllllllIIIlllIlIlIIlllIIll) {
        this.worldObj.theProfiler.startSection(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[3]]);
        if (lllIIlIIllIIIlI(this.worldObj.isAreaLoaded(new BlockPos(this.xPosition * Chunk.lIlIIlIIIIlIIl[0] + Chunk.lIlIIlIIIIlIIl[10], Chunk.lIlIIlIIIIlIIl[3], this.zPosition * Chunk.lIlIIlIIIIlIIl[0] + Chunk.lIlIIlIIIIlIIl[10]), Chunk.lIlIIlIIIIlIIl[0]) ? 1 : 0)) {
            int lllllllllllllIIIlllIlIlIIlllllII = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIIlllllII, Chunk.lIlIIlIIIIlIIl[0])) {
                int lllllllllllllIIIlllIlIlIIllllIll = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (-(0x2E ^ 0x2A) >= 0) {
                    return;
                }
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIIllllIll, Chunk.lIlIIlIIIIlIIl[0])) {
                    if (lllIIlIIllIIIlI(this.updateSkylightColumns[lllllllllllllIIIlllIlIlIIlllllII + lllllllllllllIIIlllIlIlIIllllIll * Chunk.lIlIIlIIIIlIIl[0]] ? 1 : 0)) {
                        this.updateSkylightColumns[lllllllllllllIIIlllIlIlIIlllllII + lllllllllllllIIIlllIlIlIIllllIll * Chunk.lIlIIlIIIIlIIl[0]] = (Chunk.lIlIIlIIIIlIIl[3] != 0);
                        final int lllllllllllllIIIlllIlIlIIllllIlI = this.getHeightValue(lllllllllllllIIIlllIlIlIIlllllII, lllllllllllllIIIlllIlIlIIllllIll);
                        final int lllllllllllllIIIlllIlIlIIllllIIl = this.xPosition * Chunk.lIlIIlIIIIlIIl[0] + lllllllllllllIIIlllIlIlIIlllllII;
                        final int lllllllllllllIIIlllIlIlIIllllIII = this.zPosition * Chunk.lIlIIlIIIIlIIl[0] + lllllllllllllIIIlllIlIlIIllllIll;
                        int lllllllllllllIIIlllIlIlIIlllIlll = Chunk.lIlIIlIIIIlIIl[9];
                        int lllllllllllllIIIlllIlIlIIllIlIll = (int)EnumFacing.Plane.HORIZONTAL.iterator();
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return;
                        }
                        while (!lllIIlIIllIlIlI(((Iterator)lllllllllllllIIIlllIlIlIIllIlIll).hasNext() ? 1 : 0)) {
                            final EnumFacing lllllllllllllIIIlllIlIlIIlllIllI = ((Iterator<EnumFacing>)lllllllllllllIIIlllIlIlIIllIlIll).next();
                            lllllllllllllIIIlllIlIlIIlllIlll = Math.min(lllllllllllllIIIlllIlIlIIlllIlll, this.worldObj.getChunksLowestHorizon(lllllllllllllIIIlllIlIlIIllllIIl + lllllllllllllIIIlllIlIlIIlllIllI.getFrontOffsetX(), lllllllllllllIIIlllIlIlIIllllIII + lllllllllllllIIIlllIlIlIIlllIllI.getFrontOffsetZ()));
                        }
                        this.checkSkylightNeighborHeight(lllllllllllllIIIlllIlIlIIllllIIl, lllllllllllllIIIlllIlIlIIllllIII, lllllllllllllIIIlllIlIlIIlllIlll);
                        lllllllllllllIIIlllIlIlIIllIlIll = (int)EnumFacing.Plane.HORIZONTAL.iterator();
                        "".length();
                        if (((14 + 67 - 4 + 105 ^ 101 + 84 - 129 + 123) & (0x72 ^ 0x7 ^ (0x17 ^ 0x67) ^ -" ".length())) != 0x0) {
                            return;
                        }
                        while (!lllIIlIIllIlIlI(((Iterator)lllllllllllllIIIlllIlIlIIllIlIll).hasNext() ? 1 : 0)) {
                            final EnumFacing lllllllllllllIIIlllIlIlIIlllIlIl = ((Iterator<EnumFacing>)lllllllllllllIIIlllIlIlIIllIlIll).next();
                            this.checkSkylightNeighborHeight(lllllllllllllIIIlllIlIlIIllllIIl + lllllllllllllIIIlllIlIlIIlllIlIl.getFrontOffsetX(), lllllllllllllIIIlllIlIlIIllllIII + lllllllllllllIIIlllIlIlIIlllIlIl.getFrontOffsetZ(), lllllllllllllIIIlllIlIlIIllllIlI);
                        }
                        if (lllIIlIIllIIIlI(lllllllllllllIIIlllIlIlIIlllIIll ? 1 : 0)) {
                            this.worldObj.theProfiler.endSection();
                            return;
                        }
                    }
                    ++lllllllllllllIIIlllIlIlIIllllIll;
                }
                ++lllllllllllllIIIlllIlIlIIlllllII;
            }
            this.isGapLightingUpdated = (Chunk.lIlIIlIIIIlIIl[3] != 0);
        }
        this.worldObj.theProfiler.endSection();
    }
    
    public void addEntity(final Entity lllllllllllllIIIlllIlIIlIIlIIlll) {
        this.hasEntities = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        final int lllllllllllllIIIlllIlIIlIIlIlIll = MathHelper.floor_double(lllllllllllllIIIlllIlIIlIIlIIlll.posX / 16.0);
        final int lllllllllllllIIIlllIlIIlIIlIlIlI = MathHelper.floor_double(lllllllllllllIIIlllIlIIlIIlIIlll.posZ / 16.0);
        if (!lllIIlIIllIIlIl(lllllllllllllIIIlllIlIIlIIlIlIll, this.xPosition) || lllIIlIIllIlIll(lllllllllllllIIIlllIlIIlIIlIlIlI, this.zPosition)) {
            final Logger logger = Chunk.logger;
            final String value = String.valueOf(new StringBuilder(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[19]]).append(lllllllllllllIIIlllIlIIlIIlIlIll).append(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[20]]).append(lllllllllllllIIIlllIlIIlIIlIlIlI).append(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[21]]).append(this.xPosition).append(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[22]]).append(this.zPosition).append(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[23]]).append(lllllllllllllIIIlllIlIIlIIlIIlll));
            final Object[] array = new Object[Chunk.lIlIIlIIIIlIIl[6]];
            array[Chunk.lIlIIlIIIIlIIl[3]] = lllllllllllllIIIlllIlIIlIIlIIlll;
            logger.warn(value, array);
            lllllllllllllIIIlllIlIIlIIlIIlll.setDead();
        }
        int lllllllllllllIIIlllIlIIlIIlIlIIl = MathHelper.floor_double(lllllllllllllIIIlllIlIIlIIlIIlll.posY / 16.0);
        if (lllIIlIIllIIlll(lllllllllllllIIIlllIlIIlIIlIlIIl)) {
            lllllllllllllIIIlllIlIIlIIlIlIIl = Chunk.lIlIIlIIIIlIIl[3];
        }
        if (lllIIlIIllIIIIl(lllllllllllllIIIlllIlIIlIIlIlIIl, this.entityLists.length)) {
            lllllllllllllIIIlllIlIIlIIlIlIIl = this.entityLists.length - Chunk.lIlIIlIIIIlIIl[6];
        }
        lllllllllllllIIIlllIlIIlIIlIIlll.addedToChunk = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        lllllllllllllIIIlllIlIIlIIlIIlll.chunkCoordX = this.xPosition;
        lllllllllllllIIIlllIlIIlIIlIIlll.chunkCoordY = lllllllllllllIIIlllIlIIlIIlIlIIl;
        lllllllllllllIIIlllIlIIlIIlIIlll.chunkCoordZ = this.zPosition;
        this.entityLists[lllllllllllllIIIlllIlIIlIIlIlIIl].add(lllllllllllllIIIlllIlIIlIIlIIlll);
        "".length();
    }
    
    public World getWorld() {
        return this.worldObj;
    }
    
    public BiomeGenBase getBiome(final BlockPos lllllllllllllIIIlllIIlllllIIllll, final WorldChunkManager lllllllllllllIIIlllIIlllllIIlllI) {
        final int lllllllllllllIIIlllIIlllllIlIlIl = lllllllllllllIIIlllIIlllllIIllll.getX() & Chunk.lIlIIlIIIIlIIl[8];
        final int lllllllllllllIIIlllIIlllllIlIlII = lllllllllllllIIIlllIIlllllIIllll.getZ() & Chunk.lIlIIlIIIIlIIl[8];
        int lllllllllllllIIIlllIIlllllIlIIll = this.blockBiomeArray[lllllllllllllIIIlllIIlllllIlIlII << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIIlllllIlIlIl] & Chunk.lIlIIlIIIIlIIl[11];
        if (lllIIlIIllIIlIl(lllllllllllllIIIlllIIlllllIlIIll, Chunk.lIlIIlIIIIlIIl[11])) {
            final BiomeGenBase lllllllllllllIIIlllIIlllllIlIIlI = lllllllllllllIIIlllIIlllllIIlllI.getBiomeGenerator(lllllllllllllIIIlllIIlllllIIllll, BiomeGenBase.plains);
            lllllllllllllIIIlllIIlllllIlIIll = lllllllllllllIIIlllIIlllllIlIIlI.biomeID;
            this.blockBiomeArray[lllllllllllllIIIlllIIlllllIlIlII << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIIlllllIlIlIl] = (byte)(lllllllllllllIIIlllIIlllllIlIIll & Chunk.lIlIIlIIIIlIIl[11]);
        }
        final BiomeGenBase lllllllllllllIIIlllIIlllllIlIIIl = BiomeGenBase.getBiome(lllllllllllllIIIlllIIlllllIlIIll);
        BiomeGenBase plains;
        if (lllIIlIIllIIlII(lllllllllllllIIIlllIIlllllIlIIIl)) {
            plains = BiomeGenBase.plains;
            "".length();
            if (-(0x95 ^ 0x91) > 0) {
                return null;
            }
        }
        else {
            plains = lllllllllllllIIIlllIIlllllIlIIIl;
        }
        return plains;
    }
    
    public void setBiomeArray(final byte[] lllllllllllllIIIlllIIllllIllllll) {
        if (lllIIlIIllIlIll(this.blockBiomeArray.length, lllllllllllllIIIlllIIllllIllllll.length)) {
            Chunk.logger.warn(String.valueOf(new StringBuilder(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[0]]).append(lllllllllllllIIIlllIIllllIllllll.length).append(Chunk.lIlIIIllllIlll[Chunk.lIlIIlIIIIlIIl[28]]).append(this.blockBiomeArray.length)));
            "".length();
            if ("  ".length() == ((0xF2 ^ 0xA2 ^ (0x11 ^ 0x9)) & (81 + 161 - 119 + 125 ^ 112 + 33 + 29 + 2 ^ -" ".length()))) {
                return;
            }
        }
        else {
            int lllllllllllllIIIlllIIlllllIIIIIl = Chunk.lIlIIlIIIIlIIl[3];
            "".length();
            if ((0x48 ^ 0x30 ^ (0x7 ^ 0x7B)) == -" ".length()) {
                return;
            }
            while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIlllllIIIIIl, this.blockBiomeArray.length)) {
                this.blockBiomeArray[lllllllllllllIIIlllIIlllllIIIIIl] = lllllllllllllIIIlllIIllllIllllll[lllllllllllllIIIlllIIlllllIIIIIl];
                ++lllllllllllllIIIlllIIlllllIIIIIl;
            }
        }
    }
    
    public int[] getHeightMap() {
        return this.heightMap;
    }
    
    private static boolean lllIIlIIllIIlII(final Object lllllllllllllIIIlllIIllIlIllIllI) {
        return lllllllllllllIIIlllIIllIlIllIllI == null;
    }
    
    private static boolean lllIIlIIllIlIII(final int lllllllllllllIIIlllIIllIllIIlIll, final int lllllllllllllIIIlllIIllIllIIlIlI) {
        return lllllllllllllIIIlllIIllIllIIlIll < lllllllllllllIIIlllIIllIllIIlIlI;
    }
    
    private void func_177441_y() {
        int lllllllllllllIIIlllIIllllIIIIIII = Chunk.lIlIIlIIIIlIIl[3];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllIIIIIII, this.updateSkylightColumns.length)) {
            this.updateSkylightColumns[lllllllllllllIIIlllIIllllIIIIIII] = (Chunk.lIlIIlIIIIlIIl[6] != 0);
            ++lllllllllllllIIIlllIIllllIIIIIII;
        }
        this.recheckGaps((boolean)(Chunk.lIlIIlIIIIlIIl[3] != 0));
    }
    
    private static boolean lllIIlIIllIllll(final Object lllllllllllllIIIlllIIllIlIlllIIl, final Object lllllllllllllIIIlllIIllIlIlllIII) {
        return lllllllllllllIIIlllIIllIlIlllIIl == lllllllllllllIIIlllIIllIlIlllIII;
    }
    
    private static boolean lllIIlIIlllIIIl(final int lllllllllllllIIIlllIIllIllIIIlll, final int lllllllllllllIIIlllIIllIllIIIllI) {
        return lllllllllllllIIIlllIIllIllIIIlll <= lllllllllllllIIIlllIIllIllIIIllI;
    }
    
    public void addTileEntity(final BlockPos lllllllllllllIIIlllIlIIIlllIIllI, final TileEntity lllllllllllllIIIlllIlIIIlllIIIlI) {
        lllllllllllllIIIlllIlIIIlllIIIlI.setWorldObj(this.worldObj);
        lllllllllllllIIIlllIlIIIlllIIIlI.setPos(lllllllllllllIIIlllIlIIIlllIIllI);
        if (lllIIlIIllIIIlI((this.getBlock(lllllllllllllIIIlllIlIIIlllIIllI) instanceof ITileEntityProvider) ? 1 : 0)) {
            if (lllIIlIIllIIIlI(this.chunkTileEntityMap.containsKey(lllllllllllllIIIlllIlIIIlllIIllI) ? 1 : 0)) {
                this.chunkTileEntityMap.get(lllllllllllllIIIlllIlIIIlllIIllI).invalidate();
            }
            lllllllllllllIIIlllIlIIIlllIIIlI.validate();
            this.chunkTileEntityMap.put(lllllllllllllIIIlllIlIIIlllIIllI, lllllllllllllIIIlllIlIIIlllIIIlI);
            "".length();
        }
    }
    
    public void func_150809_p() {
        this.isTerrainPopulated = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        this.isLightPopulated = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        final BlockPos lllllllllllllIIIlllIIllllIIIllIl = new BlockPos(this.xPosition << Chunk.lIlIIlIIIIlIIl[7], Chunk.lIlIIlIIIIlIIl[3], this.zPosition << Chunk.lIlIIlIIIIlIIl[7]);
        if (lllIIlIIllIlIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
            if (lllIIlIIllIIIlI(this.worldObj.isAreaLoaded(lllllllllllllIIIlllIIllllIIIllIl.add(Chunk.lIlIIlIIIIlIIl[5], Chunk.lIlIIlIIIIlIIl[3], Chunk.lIlIIlIIIIlIIl[5]), lllllllllllllIIIlllIIllllIIIllIl.add(Chunk.lIlIIlIIIIlIIl[0], this.worldObj.func_181545_F(), Chunk.lIlIIlIIIIlIIl[0])) ? 1 : 0)) {
                int lllllllllllllIIIlllIIllllIIIllII = Chunk.lIlIIlIIIIlIIl[3];
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return;
                }
            Label_0239:
                while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllIIIllII, Chunk.lIlIIlIIIIlIIl[0])) {
                    int lllllllllllllIIIlllIIllllIIIlIll = Chunk.lIlIIlIIIIlIIl[3];
                    "".length();
                    if ((0x11 ^ 0x15) != (0x70 ^ 0x74)) {
                        return;
                    }
                    while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIIllllIIIlIll, Chunk.lIlIIlIIIIlIIl[0])) {
                        if (lllIIlIIllIlIlI(this.func_150811_f(lllllllllllllIIIlllIIllllIIIllII, lllllllllllllIIIlllIIllllIIIlIll) ? 1 : 0)) {
                            this.isLightPopulated = (Chunk.lIlIIlIIIIlIIl[3] != 0);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0239;
                        }
                        else {
                            ++lllllllllllllIIIlllIIllllIIIlIll;
                        }
                    }
                    ++lllllllllllllIIIlllIIllllIIIllII;
                }
                if (lllIIlIIllIIIlI(this.isLightPopulated ? 1 : 0)) {
                    final Iterator<EnumFacing> iterator = EnumFacing.Plane.HORIZONTAL.iterator();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    while (!lllIIlIIllIlIlI(iterator.hasNext() ? 1 : 0)) {
                        final EnumFacing lllllllllllllIIIlllIIllllIIIlIlI = iterator.next();
                        int n;
                        if (lllIIlIIllIllll(lllllllllllllIIIlllIIllllIIIlIlI.getAxisDirection(), EnumFacing.AxisDirection.POSITIVE)) {
                            n = Chunk.lIlIIlIIIIlIIl[0];
                            "".length();
                            if ((0x4 ^ 0x0) <= " ".length()) {
                                return;
                            }
                        }
                        else {
                            n = Chunk.lIlIIlIIIIlIIl[6];
                        }
                        final int lllllllllllllIIIlllIIllllIIIlIIl = n;
                        this.worldObj.getChunkFromBlockCoords(lllllllllllllIIIlllIIllllIIIllIl.offset(lllllllllllllIIIlllIIllllIIIlIlI, lllllllllllllIIIlllIIllllIIIlIIl)).func_180700_a(lllllllllllllIIIlllIIllllIIIlIlI.getOpposite());
                    }
                    this.func_177441_y();
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
            }
            else {
                this.isLightPopulated = (Chunk.lIlIIlIIIIlIIl[3] != 0);
            }
        }
    }
    
    private static boolean lllIIlIIllIllIl(final int lllllllllllllIIIlllIIllIllIIIIll, final int lllllllllllllIIIlllIIllIllIIIIlI) {
        return lllllllllllllIIIlllIIllIllIIIIll > lllllllllllllIIIlllIIllIllIIIIlI;
    }
    
    public void setTerrainPopulated(final boolean lllllllllllllIIIlllIIlllIIlIllll) {
        this.isTerrainPopulated = lllllllllllllIIIlllIIlllIIlIllll;
    }
    
    private void relightBlock(final int lllllllllllllIIIlllIlIlIIIlIlIII, final int lllllllllllllIIIlllIlIlIIIlllIlI, final int lllllllllllllIIIlllIlIlIIIlllIIl) {
        int lllllllllllllIIIlllIlIlIIIllIlll;
        final int lllllllllllllIIIlllIlIlIIIlllIII = lllllllllllllIIIlllIlIlIIIllIlll = (this.heightMap[lllllllllllllIIIlllIlIlIIIlllIIl << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIlIIIlIlIII] & Chunk.lIlIIlIIIIlIIl[11]);
        if (lllIIlIIllIllIl(lllllllllllllIIIlllIlIlIIIlllIlI, lllllllllllllIIIlllIlIlIIIlllIII)) {
            lllllllllllllIIIlllIlIlIIIllIlll = lllllllllllllIIIlllIlIlIIIlllIlI;
            "".length();
            if (null != null) {
                return;
            }
        }
        while (lllIIlIIllIllII(lllllllllllllIIIlllIlIlIIIllIlll) && !lllIIlIIllIIIlI(this.getBlockLightOpacity(lllllllllllllIIIlllIlIlIIIlIlIII, lllllllllllllIIIlllIlIlIIIllIlll - Chunk.lIlIIlIIIIlIIl[6], lllllllllllllIIIlllIlIlIIIlllIIl))) {
            --lllllllllllllIIIlllIlIlIIIllIlll;
        }
        if (lllIIlIIllIlIll(lllllllllllllIIIlllIlIlIIIllIlll, lllllllllllllIIIlllIlIlIIIlllIII)) {
            this.worldObj.markBlocksDirtyVertical(lllllllllllllIIIlllIlIlIIIlIlIII + this.xPosition * Chunk.lIlIIlIIIIlIIl[0], lllllllllllllIIIlllIlIlIIIlllIIl + this.zPosition * Chunk.lIlIIlIIIIlIIl[0], lllllllllllllIIIlllIlIlIIIllIlll, lllllllllllllIIIlllIlIlIIIlllIII);
            this.heightMap[lllllllllllllIIIlllIlIlIIIlllIIl << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIlIIIlIlIII] = lllllllllllllIIIlllIlIlIIIllIlll;
            final int lllllllllllllIIIlllIlIlIIIllIllI = this.xPosition * Chunk.lIlIIlIIIIlIIl[0] + lllllllllllllIIIlllIlIlIIIlIlIII;
            final int lllllllllllllIIIlllIlIlIIIllIlIl = this.zPosition * Chunk.lIlIIlIIIIlIIl[0] + lllllllllllllIIIlllIlIlIIIlllIIl;
            if (lllIIlIIllIlIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
                if (lllIIlIIllIlIII(lllllllllllllIIIlllIlIlIIIllIlll, lllllllllllllIIIlllIlIlIIIlllIII)) {
                    int lllllllllllllIIIlllIlIlIIIllIlII = lllllllllllllIIIlllIlIlIIIllIlll;
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                    while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIIIllIlII, lllllllllllllIIIlllIlIlIIIlllIII)) {
                        final ExtendedBlockStorage lllllllllllllIIIlllIlIlIIIllIIll = this.storageArrays[lllllllllllllIIIlllIlIlIIIllIlII >> Chunk.lIlIIlIIIIlIIl[7]];
                        if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIlIIIllIIll)) {
                            lllllllllllllIIIlllIlIlIIIllIIll.setExtSkylightValue(lllllllllllllIIIlllIlIlIIIlIlIII, lllllllllllllIIIlllIlIlIIIllIlII & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIlIIIlllIIl, Chunk.lIlIIlIIIIlIIl[8]);
                            this.worldObj.notifyLightSet(new BlockPos((this.xPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIlIlIIIlIlIII, lllllllllllllIIIlllIlIlIIIllIlII, (this.zPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIlIlIIIlllIIl));
                        }
                        ++lllllllllllllIIIlllIlIlIIIllIlII;
                    }
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                }
                else {
                    int lllllllllllllIIIlllIlIlIIIllIIlI = lllllllllllllIIIlllIlIlIIIlllIII;
                    "".length();
                    if (-" ".length() > (0x3B ^ 0x7C ^ (0xDF ^ 0x9C))) {
                        return;
                    }
                    while (!lllIIlIIllIIIIl(lllllllllllllIIIlllIlIlIIIllIIlI, lllllllllllllIIIlllIlIlIIIllIlll)) {
                        final ExtendedBlockStorage lllllllllllllIIIlllIlIlIIIllIIIl = this.storageArrays[lllllllllllllIIIlllIlIlIIIllIIlI >> Chunk.lIlIIlIIIIlIIl[7]];
                        if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIlIIIllIIIl)) {
                            lllllllllllllIIIlllIlIlIIIllIIIl.setExtSkylightValue(lllllllllllllIIIlllIlIlIIIlIlIII, lllllllllllllIIIlllIlIlIIIllIIlI & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIlIIIlllIIl, Chunk.lIlIIlIIIIlIIl[3]);
                            this.worldObj.notifyLightSet(new BlockPos((this.xPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIlIlIIIlIlIII, lllllllllllllIIIlllIlIlIIIllIIlI, (this.zPosition << Chunk.lIlIIlIIIIlIIl[7]) + lllllllllllllIIIlllIlIlIIIlllIIl));
                        }
                        ++lllllllllllllIIIlllIlIlIIIllIIlI;
                    }
                }
                int lllllllllllllIIIlllIlIlIIIllIIII = Chunk.lIlIIlIIIIlIIl[8];
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
                while (lllIIlIIllIllII(lllllllllllllIIIlllIlIlIIIllIlll) && !lllIIlIIllIlIIl(lllllllllllllIIIlllIlIlIIIllIIII)) {
                    --lllllllllllllIIIlllIlIlIIIllIlll;
                    int lllllllllllllIIIlllIlIlIIIlIllll = this.getBlockLightOpacity(lllllllllllllIIIlllIlIlIIIlIlIII, lllllllllllllIIIlllIlIlIIIllIlll, lllllllllllllIIIlllIlIlIIIlllIIl);
                    if (lllIIlIIllIlIlI(lllllllllllllIIIlllIlIlIIIlIllll)) {
                        lllllllllllllIIIlllIlIlIIIlIllll = Chunk.lIlIIlIIIIlIIl[6];
                    }
                    lllllllllllllIIIlllIlIlIIIllIIII -= lllllllllllllIIIlllIlIlIIIlIllll;
                    if (lllIIlIIllIIlll(lllllllllllllIIIlllIlIlIIIllIIII)) {
                        lllllllllllllIIIlllIlIlIIIllIIII = Chunk.lIlIIlIIIIlIIl[3];
                    }
                    final ExtendedBlockStorage lllllllllllllIIIlllIlIlIIIlIlllI = this.storageArrays[lllllllllllllIIIlllIlIlIIIllIlll >> Chunk.lIlIIlIIIIlIIl[7]];
                    if (lllIIlIIllIIllI(lllllllllllllIIIlllIlIlIIIlIlllI)) {
                        lllllllllllllIIIlllIlIlIIIlIlllI.setExtSkylightValue(lllllllllllllIIIlllIlIlIIIlIlIII, lllllllllllllIIIlllIlIlIIIllIlll & Chunk.lIlIIlIIIIlIIl[8], lllllllllllllIIIlllIlIlIIIlllIIl, lllllllllllllIIIlllIlIlIIIllIIII);
                    }
                }
            }
            final int lllllllllllllIIIlllIlIlIIIlIllIl = this.heightMap[lllllllllllllIIIlllIlIlIIIlllIIl << Chunk.lIlIIlIIIIlIIl[7] | lllllllllllllIIIlllIlIlIIIlIlIII];
            int lllllllllllllIIIlllIlIlIIIlIllII = lllllllllllllIIIlllIlIlIIIlllIII;
            int lllllllllllllIIIlllIlIlIIIlIlIll = lllllllllllllIIIlllIlIlIIIlIllIl;
            if (lllIIlIIllIlIII(lllllllllllllIIIlllIlIlIIIlIllIl, lllllllllllllIIIlllIlIlIIIlllIII)) {
                lllllllllllllIIIlllIlIlIIIlIllII = lllllllllllllIIIlllIlIlIIIlIllIl;
                lllllllllllllIIIlllIlIlIIIlIlIll = lllllllllllllIIIlllIlIlIIIlllIII;
            }
            if (lllIIlIIllIlIII(lllllllllllllIIIlllIlIlIIIlIllIl, this.heightMapMinimum)) {
                this.heightMapMinimum = lllllllllllllIIIlllIlIlIIIlIllIl;
            }
            if (lllIIlIIllIlIlI(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
                final Exception lllllllllllllIIIlllIlIlIIIIlllIl = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
                "".length();
                if (null != null) {
                    return;
                }
                while (!lllIIlIIllIlIlI(((Iterator)lllllllllllllIIIlllIlIlIIIIlllIl).hasNext() ? 1 : 0)) {
                    final EnumFacing lllllllllllllIIIlllIlIlIIIlIlIlI = ((Iterator<EnumFacing>)lllllllllllllIIIlllIlIlIIIIlllIl).next();
                    this.updateSkylightNeighborHeight(lllllllllllllIIIlllIlIlIIIllIllI + lllllllllllllIIIlllIlIlIIIlIlIlI.getFrontOffsetX(), lllllllllllllIIIlllIlIlIIIllIlIl + lllllllllllllIIIlllIlIlIIIlIlIlI.getFrontOffsetZ(), lllllllllllllIIIlllIlIlIIIlIllII, lllllllllllllIIIlllIlIlIIIlIlIll);
                }
                this.updateSkylightNeighborHeight(lllllllllllllIIIlllIlIlIIIllIllI, lllllllllllllIIIlllIlIlIIIllIlIl, lllllllllllllIIIlllIlIlIIIlIllII, lllllllllllllIIIlllIlIlIIIlIlIll);
            }
            this.isModified = (Chunk.lIlIIlIIIIlIIl[6] != 0);
        }
    }
    
    public enum EnumCreateEntityType
    {
        CHECK(EnumCreateEntityType.lIIIIlIIIlIIII[EnumCreateEntityType.lIIIIlIIIlIllI[2]], EnumCreateEntityType.lIIIIlIIIlIllI[2]), 
        IMMEDIATE(EnumCreateEntityType.lIIIIlIIIlIIII[EnumCreateEntityType.lIIIIlIIIlIllI[0]], EnumCreateEntityType.lIIIIlIIIlIllI[0]), 
        QUEUED(EnumCreateEntityType.lIIIIlIIIlIIII[EnumCreateEntityType.lIIIIlIIIlIllI[1]], EnumCreateEntityType.lIIIIlIIIlIllI[1]);
        
        private static final /* synthetic */ String[] lIIIIlIIIlIIII;
        private static final /* synthetic */ int[] lIIIIlIIIlIllI;
        
        static {
            lIlllIIIIIlIIlI();
            lIlllIIIIIIllll();
            final EnumCreateEntityType[] enum$VALUES = new EnumCreateEntityType[EnumCreateEntityType.lIIIIlIIIlIllI[3]];
            enum$VALUES[EnumCreateEntityType.lIIIIlIIIlIllI[0]] = EnumCreateEntityType.IMMEDIATE;
            enum$VALUES[EnumCreateEntityType.lIIIIlIIIlIllI[1]] = EnumCreateEntityType.QUEUED;
            enum$VALUES[EnumCreateEntityType.lIIIIlIIIlIllI[2]] = EnumCreateEntityType.CHECK;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIlllIIIIIIlllI(String lllllllllllllIlIIllIlIIIIlIIlIIl, final String lllllllllllllIlIIllIlIIIIlIIllIl) {
            lllllllllllllIlIIllIlIIIIlIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIllIlIIIIlIIllII = new StringBuilder();
            final char[] lllllllllllllIlIIllIlIIIIlIIlIll = lllllllllllllIlIIllIlIIIIlIIllIl.toCharArray();
            int lllllllllllllIlIIllIlIIIIlIIlIlI = EnumCreateEntityType.lIIIIlIIIlIllI[0];
            final boolean lllllllllllllIlIIllIlIIIIlIIIlII = (Object)lllllllllllllIlIIllIlIIIIlIIlIIl.toCharArray();
            final byte lllllllllllllIlIIllIlIIIIlIIIIll = (byte)lllllllllllllIlIIllIlIIIIlIIIlII.length;
            float lllllllllllllIlIIllIlIIIIlIIIIlI = EnumCreateEntityType.lIIIIlIIIlIllI[0];
            while (lIlllIIIIIlIIll((int)lllllllllllllIlIIllIlIIIIlIIIIlI, lllllllllllllIlIIllIlIIIIlIIIIll)) {
                final char lllllllllllllIlIIllIlIIIIlIIllll = lllllllllllllIlIIllIlIIIIlIIIlII[lllllllllllllIlIIllIlIIIIlIIIIlI];
                lllllllllllllIlIIllIlIIIIlIIllII.append((char)(lllllllllllllIlIIllIlIIIIlIIllll ^ lllllllllllllIlIIllIlIIIIlIIlIll[lllllllllllllIlIIllIlIIIIlIIlIlI % lllllllllllllIlIIllIlIIIIlIIlIll.length]));
                "".length();
                ++lllllllllllllIlIIllIlIIIIlIIlIlI;
                ++lllllllllllllIlIIllIlIIIIlIIIIlI;
                "".length();
                if (((102 + 21 + 8 + 53 ^ 61 + 38 + 43 + 35) & (0x8D ^ 0xC3 ^ (0x86 ^ 0xC1) ^ -" ".length())) >= "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIllIlIIIIlIIllII);
        }
        
        private static void lIlllIIIIIlIIlI() {
            (lIIIIlIIIlIllI = new int[5])[0] = ((0x74 ^ 0x57) & ~(0x93 ^ 0xB0));
            EnumCreateEntityType.lIIIIlIIIlIllI[1] = " ".length();
            EnumCreateEntityType.lIIIIlIIIlIllI[2] = "  ".length();
            EnumCreateEntityType.lIIIIlIIIlIllI[3] = "   ".length();
            EnumCreateEntityType.lIIIIlIIIlIllI[4] = (154 + 112 - 90 + 9 ^ 113 + 90 - 95 + 69);
        }
        
        private static boolean lIlllIIIIIlIIll(final int lllllllllllllIlIIllIlIIIIIlllllI, final int lllllllllllllIlIIllIlIIIIIllllIl) {
            return lllllllllllllIlIIllIlIIIIIlllllI < lllllllllllllIlIIllIlIIIIIllllIl;
        }
        
        private EnumCreateEntityType(final String lllllllllllllIlIIllIlIIIIllIllll, final int lllllllllllllIlIIllIlIIIIllIlllI) {
        }
        
        private static void lIlllIIIIIIllll() {
            (lIIIIlIIIlIIII = new String[EnumCreateEntityType.lIIIIlIIIlIllI[3]])[EnumCreateEntityType.lIIIIlIIIlIllI[0]] = lIlllIIIIIIlIlI("ruiSowbCGKpVCqBNXJducw==", "AOvPz");
            EnumCreateEntityType.lIIIIlIIIlIIII[EnumCreateEntityType.lIIIIlIIIlIllI[1]] = lIlllIIIIIIlIlI("2j6Rl5YhdaA=", "ZkXTg");
            EnumCreateEntityType.lIIIIlIIIlIIII[EnumCreateEntityType.lIIIIlIIIlIllI[2]] = lIlllIIIIIIlllI("ByQPMhM=", "DlJqX");
        }
        
        private static String lIlllIIIIIIlIlI(final String lllllllllllllIlIIllIlIIIIlIlllII, final String lllllllllllllIlIIllIlIIIIlIlllIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIllIlIIIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), EnumCreateEntityType.lIIIIlIIIlIllI[4]), "DES");
                final Cipher lllllllllllllIlIIllIlIIIIllIIIII = Cipher.getInstance("DES");
                lllllllllllllIlIIllIlIIIIllIIIII.init(EnumCreateEntityType.lIIIIlIIIlIllI[2], lllllllllllllIlIIllIlIIIIllIIIIl);
                return new String(lllllllllllllIlIIllIlIIIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIllIlIIIIlIlllll) {
                lllllllllllllIlIIllIlIIIIlIlllll.printStackTrace();
                return null;
            }
        }
    }
}
