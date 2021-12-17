// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Random;
import com.google.common.collect.Maps;
import java.util.List;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import java.util.Map;
import net.minecraft.world.gen.MapGenBase;

public abstract class MapGenStructure extends MapGenBase
{
    private static final /* synthetic */ String[] lIlIllIlIlIIII;
    private static final /* synthetic */ int[] lIlIllIlIlIlIl;
    protected /* synthetic */ Map<Long, StructureStart> structureMap;
    private /* synthetic */ MapGenStructureData structureData;
    
    protected abstract StructureStart getStructureStart(final int p0, final int p1);
    
    protected StructureStart func_175797_c(final BlockPos lllllllllllllIIIIllIlIlIlIIlIlIl) {
        final char lllllllllllllIIIIllIlIlIlIIlIIll = (char)this.structureMap.values().iterator();
        "".length();
        if ("   ".length() == 0) {
            return null;
        }
        while (!llllIIIlllIIIlI(((Iterator)lllllllllllllIIIIllIlIlIlIIlIIll).hasNext() ? 1 : 0)) {
            final StructureStart lllllllllllllIIIIllIlIlIlIIllIIl = ((Iterator<StructureStart>)lllllllllllllIIIIllIlIlIlIIlIIll).next();
            if (llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIIllIIl.isSizeableStructure() ? 1 : 0) && llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIIllIIl.getBoundingBox().isVecInside(lllllllllllllIIIIllIlIlIlIIlIlIl) ? 1 : 0)) {
                final Iterator<StructureComponent> lllllllllllllIIIIllIlIlIlIIllIII = lllllllllllllIIIIllIlIlIlIIllIIl.getComponents().iterator();
                while (!llllIIIlllIIIlI(lllllllllllllIIIIllIlIlIlIIllIII.hasNext() ? 1 : 0)) {
                    final StructureComponent lllllllllllllIIIIllIlIlIlIIlIlll = lllllllllllllIIIIllIlIlIlIIllIII.next();
                    if (llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIIlIlll.getBoundingBox().isVecInside(lllllllllllllIIIIllIlIlIlIIlIlIl) ? 1 : 0)) {
                        return lllllllllllllIIIIllIlIlIlIIllIIl;
                    }
                }
                "".length();
                if (-" ".length() >= (0x9B ^ 0x9F)) {
                    return null;
                }
                continue;
            }
        }
        return null;
    }
    
    private static String llllIIIllIlIlll(final String lllllllllllllIIIIllIlIlIIIlIIlII, final String lllllllllllllIIIIllIlIlIIIlIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIlIIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), MapGenStructure.lIlIllIlIlIlIl[7]), "DES");
            final Cipher lllllllllllllIIIIllIlIlIIIlIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIlIlIIIlIIllI.init(MapGenStructure.lIlIllIlIlIlIl[2], lllllllllllllIIIIllIlIlIIIlIIlll);
            return new String(lllllllllllllIIIIllIlIlIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIlIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIlIIIlIIlIl) {
            lllllllllllllIIIIllIlIlIIIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void llllIIIlllIIIIl() {
        (lIlIllIlIlIlIl = new int[13])[0] = ((105 + 101 - 154 + 181 ^ 68 + 21 - 27 + 76) & (64 + 111 - 69 + 90 ^ 62 + 123 - 25 + 7 ^ -" ".length()));
        MapGenStructure.lIlIllIlIlIlIl[1] = " ".length();
        MapGenStructure.lIlIllIlIlIlIl[2] = "  ".length();
        MapGenStructure.lIlIllIlIlIlIl[3] = "   ".length();
        MapGenStructure.lIlIllIlIlIlIl[4] = (0xA7 ^ 0xA3);
        MapGenStructure.lIlIllIlIlIlIl[5] = (171 + 186 - 348 + 184 ^ 78 + 46 + 8 + 64);
        MapGenStructure.lIlIllIlIlIlIl[6] = (0xC5 ^ 0xC3);
        MapGenStructure.lIlIllIlIlIlIl[7] = (0x65 ^ 0x2A ^ (0x5B ^ 0x1C));
        MapGenStructure.lIlIllIlIlIlIl[8] = (0x57 ^ 0x58);
        MapGenStructure.lIlIllIlIlIlIl[9] = (0xBE ^ 0xC2 ^ (0x24 ^ 0x52));
        MapGenStructure.lIlIllIlIlIlIl[10] = (71 + 88 - 8 + 22 ^ 104 + 86 - 84 + 64);
        MapGenStructure.lIlIllIlIlIlIl[11] = (0x5D ^ 0x54);
        MapGenStructure.lIlIllIlIlIlIl[12] = (0xA3 ^ 0xA8);
    }
    
    private static void llllIIIllIllIlI() {
        (lIlIllIlIlIIII = new String[MapGenStructure.lIlIllIlIlIlIl[12]])[MapGenStructure.lIlIllIlIlIlIl[0]] = llllIIIllIlIllI("FRERNDQkAB0/ZCAbFyElIgAcNmQjHQAkJyQcADRkNgwTJTEiDA==", "PirQD");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[1]] = llllIIIllIlIlll("xdpBQEiBLhMVmU/2GAGN011mEaSZbcP0", "Yldbv");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[2]] = llllIIIllIlIllI("BT91BxUtOCATFWwvPRQeJw==", "LLUap");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[3]] = llllIIIllIlIllI("ITARGhpCNAsXEBYxCxo=", "bXdtq");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[4]] = llllIIIllIlIllI("QSFaZDI=", "dEvAV");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[5]] = llllIIIllIlIllI("MjINGzJRKhcGeRk7Cx0=", "qZxuY");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[6]] = llllIIIllIlIlll("Iiu+v6zcpwo5X0INChKpIg==", "cpVkK");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[10]] = llllIIIllIlIllI("ChIlBBIR", "IzPjy");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[7]] = llllIIIllIlIlll("M9rCU/Wa/xU=", "HHmDe");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[11]] = llllIIIllIllIIl("R6f0EIVNq/4=", "OcLIJ");
        MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[9]] = llllIIIllIlIlll("71pPcj2n6Cw=", "FdElc");
    }
    
    private static boolean llllIIIlllIIIll(final int lllllllllllllIIIIllIlIIllllIlIll) {
        return lllllllllllllIIIIllIlIIllllIlIll != 0;
    }
    
    public abstract String getStructureName();
    
    private static boolean llllIIIlllIlIlI(final int lllllllllllllIIIIllIlIIlllllIIll, final int lllllllllllllIIIIllIlIIlllllIIlI) {
        return lllllllllllllIIIIllIlIIlllllIIll < lllllllllllllIIIIllIlIIlllllIIlI;
    }
    
    private static String llllIIIllIlIllI(String lllllllllllllIIIIllIlIlIIIIIIIlI, final String lllllllllllllIIIIllIlIlIIIIIIllI) {
        lllllllllllllIIIIllIlIlIIIIIIIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIlIlIIIIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIlIlIIIIIIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIllIlIlIIIIIIlII = lllllllllllllIIIIllIlIlIIIIIIllI.toCharArray();
        int lllllllllllllIIIIllIlIlIIIIIIIll = MapGenStructure.lIlIllIlIlIlIl[0];
        final int lllllllllllllIIIIllIlIIlllllllIl = (Object)((String)lllllllllllllIIIIllIlIlIIIIIIIlI).toCharArray();
        final char lllllllllllllIIIIllIlIIlllllllII = (char)lllllllllllllIIIIllIlIIlllllllIl.length;
        int lllllllllllllIIIIllIlIIllllllIll = MapGenStructure.lIlIllIlIlIlIl[0];
        while (llllIIIlllIlIlI(lllllllllllllIIIIllIlIIllllllIll, lllllllllllllIIIIllIlIIlllllllII)) {
            final char lllllllllllllIIIIllIlIlIIIIIlIII = lllllllllllllIIIIllIlIIlllllllIl[lllllllllllllIIIIllIlIIllllllIll];
            lllllllllllllIIIIllIlIlIIIIIIlIl.append((char)(lllllllllllllIIIIllIlIlIIIIIlIII ^ lllllllllllllIIIIllIlIlIIIIIIlII[lllllllllllllIIIIllIlIlIIIIIIIll % lllllllllllllIIIIllIlIlIIIIIIlII.length]));
            "".length();
            ++lllllllllllllIIIIllIlIlIIIIIIIll;
            ++lllllllllllllIIIIllIlIIllllllIll;
            "".length();
            if (((167 + 205 - 165 + 15 ^ 36 + 138 - 39 + 58) & (0x3C ^ 0x3B ^ (0x67 ^ 0x7F) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIlIlIIIIIIlIl);
    }
    
    private static boolean llllIIIlllIIllI(final int lllllllllllllIIIIllIlIIllllIIIll) {
        return lllllllllllllIIIIllIlIIllllIIIll < 0;
    }
    
    private static boolean llllIIIlllIIlll(final Object lllllllllllllIIIIllIlIIllllIllIl) {
        return lllllllllllllIIIIllIlIIllllIllIl == null;
    }
    
    private void func_143027_a(final World lllllllllllllIIIIllIlIlIIlIIIIII) {
        if (llllIIIlllIIlll(this.structureData)) {
            this.structureData = (MapGenStructureData)lllllllllllllIIIIllIlIlIIlIIIIII.loadItemData(MapGenStructureData.class, this.getStructureName());
            if (llllIIIlllIIlll(this.structureData)) {
                this.structureData = new MapGenStructureData(this.getStructureName());
                lllllllllllllIIIIllIlIlIIlIIIIII.setItemData(this.getStructureName(), this.structureData);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                final NBTTagCompound lllllllllllllIIIIllIlIlIIlIIlIII = this.structureData.getTagCompound();
                final long lllllllllllllIIIIllIlIlIIIllllIl = (long)lllllllllllllIIIIllIlIlIIlIIlIII.getKeySet().iterator();
                "".length();
                if (((9 + 106 - 10 + 73 ^ 34 + 75 - 103 + 132) & (31 + 163 - 119 + 97 ^ 64 + 79 - 122 + 127 ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!llllIIIlllIIIlI(((Iterator)lllllllllllllIIIIllIlIlIIIllllIl).hasNext() ? 1 : 0)) {
                    final String lllllllllllllIIIIllIlIlIIlIIIlll = ((Iterator<String>)lllllllllllllIIIIllIlIlIIIllllIl).next();
                    final NBTBase lllllllllllllIIIIllIlIlIIlIIIllI = lllllllllllllIIIIllIlIlIIlIIlIII.getTag(lllllllllllllIIIIllIlIlIIlIIIlll);
                    if (llllIIIlllIlIIl(lllllllllllllIIIIllIlIlIIlIIIllI.getId(), MapGenStructure.lIlIllIlIlIlIl[9])) {
                        final NBTTagCompound lllllllllllllIIIIllIlIlIIlIIIlIl = (NBTTagCompound)lllllllllllllIIIIllIlIlIIlIIIllI;
                        if (!llllIIIlllIIIll(lllllllllllllIIIIllIlIlIIlIIIlIl.hasKey(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[10]]) ? 1 : 0) || !llllIIIlllIIIll(lllllllllllllIIIIllIlIlIIlIIIlIl.hasKey(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[7]]) ? 1 : 0)) {
                            continue;
                        }
                        final int lllllllllllllIIIIllIlIlIIlIIIlII = lllllllllllllIIIIllIlIlIIlIIIlIl.getInteger(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[11]]);
                        final int lllllllllllllIIIIllIlIlIIlIIIIll = lllllllllllllIIIIllIlIlIIlIIIlIl.getInteger(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[9]]);
                        final StructureStart lllllllllllllIIIIllIlIlIIlIIIIlI = MapGenStructureIO.getStructureStart(lllllllllllllIIIIllIlIlIIlIIIlIl, lllllllllllllIIIIllIlIlIIlIIIIII);
                        if (!llllIIIlllIIlII(lllllllllllllIIIIllIlIlIIlIIIIlI)) {
                            continue;
                        }
                        this.structureMap.put(ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIIllIlIlIIlIIIlII, lllllllllllllIIIIllIlIlIIlIIIIll), lllllllllllllIIIIllIlIlIIlIIIIlI);
                        "".length();
                    }
                }
            }
        }
    }
    
    private void func_143026_a(final int lllllllllllllIIIIllIlIlIIIllIIlI, final int lllllllllllllIIIIllIlIlIIIllIIIl, final StructureStart lllllllllllllIIIIllIlIlIIIllIIII) {
        this.structureData.writeInstance(lllllllllllllIIIIllIlIlIIIllIIII.writeStructureComponentsToNBT(lllllllllllllIIIIllIlIlIIIllIIlI, lllllllllllllIIIIllIlIlIIIllIIIl), lllllllllllllIIIIllIlIlIIIllIIlI, lllllllllllllIIIIllIlIlIIIllIIIl);
        this.structureData.markDirty();
    }
    
    @Override
    protected final void recursiveGenerate(final World lllllllllllllIIIIllIlIlIllIIIlll, final int lllllllllllllIIIIllIlIlIllIIIllI, final int lllllllllllllIIIIllIlIlIllIlIIII, final int lllllllllllllIIIIllIlIlIllIIllll, final int lllllllllllllIIIIllIlIlIllIIlllI, final ChunkPrimer lllllllllllllIIIIllIlIlIllIIllIl) {
        this.func_143027_a(lllllllllllllIIIIllIlIlIllIIIlll);
        if (llllIIIlllIIIlI(this.structureMap.containsKey(ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIIllIlIlIllIIIllI, lllllllllllllIIIIllIlIlIllIlIIII)) ? 1 : 0)) {
            this.rand.nextInt();
            "".length();
            try {
                if (llllIIIlllIIIll(this.canSpawnStructureAtCoords(lllllllllllllIIIIllIlIlIllIIIllI, lllllllllllllIIIIllIlIlIllIlIIII) ? 1 : 0)) {
                    final StructureStart lllllllllllllIIIIllIlIlIllIIllII = this.getStructureStart(lllllllllllllIIIIllIlIlIllIIIllI, lllllllllllllIIIIllIlIlIllIlIIII);
                    this.structureMap.put(ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIIllIlIlIllIIIllI, lllllllllllllIIIIllIlIlIllIlIIII), lllllllllllllIIIIllIlIlIllIIllII);
                    "".length();
                    this.func_143026_a(lllllllllllllIIIIllIlIlIllIIIllI, lllllllllllllIIIIllIlIlIllIlIIII, lllllllllllllIIIIllIlIlIllIIllII);
                    "".length();
                    if (((0x18 ^ 0x75 ^ (0x35 ^ 0x57)) & (0xE1 ^ 0xAC ^ (0x6A ^ 0x28) ^ -" ".length())) > "  ".length()) {
                        return;
                    }
                }
            }
            catch (Throwable lllllllllllllIIIIllIlIlIllIIlIll) {
                final CrashReport lllllllllllllIIIIllIlIlIllIIlIlI = CrashReport.makeCrashReport(lllllllllllllIIIIllIlIlIllIIlIll, MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[0]]);
                final CrashReportCategory lllllllllllllIIIIllIlIlIllIIlIIl = lllllllllllllIIIIllIlIlIllIIlIlI.makeCategory(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[1]]);
                lllllllllllllIIIIllIlIlIllIIlIIl.addCrashSectionCallable(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[2]], new Callable<String>() {
                    private static final /* synthetic */ String[] lIIIIlIIlllIlI;
                    private static final /* synthetic */ int[] lIIIIlIIllllII;
                    
                    private static void lIlllIIlIIIIlll() {
                        (lIIIIlIIlllIlI = new String[MapGenStructure$1.lIIIIlIIllllII[2]])[MapGenStructure$1.lIIIIlIIllllII[0]] = lIlllIIlIIIIllI("0VxRtjqkrDc=", "fQhuZ");
                        MapGenStructure$1.lIIIIlIIlllIlI[MapGenStructure$1.lIIIIlIIllllII[1]] = lIlllIIlIIIIllI("1Tjhb7ueb8k=", "ffJPp");
                    }
                    
                    private static String lIlllIIlIIIIllI(final String lllllllllllllIlIIlIllllIlIIllIll, final String lllllllllllllIlIIlIllllIlIIllIII) {
                        try {
                            final SecretKeySpec lllllllllllllIlIIlIllllIlIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllllIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                            final Cipher lllllllllllllIlIIlIllllIlIIlllIl = Cipher.getInstance("Blowfish");
                            lllllllllllllIlIIlIllllIlIIlllIl.init(MapGenStructure$1.lIIIIlIIllllII[2], lllllllllllllIlIIlIllllIlIIllllI);
                            return new String(lllllllllllllIlIIlIllllIlIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllllIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception lllllllllllllIlIIlIllllIlIIlllII) {
                            lllllllllllllIlIIlIllllIlIIlllII.printStackTrace();
                            return null;
                        }
                    }
                    
                    @Override
                    public String call() throws Exception {
                        String s;
                        if (lIlllIIlIIIlIlI(MapGenStructure.this.canSpawnStructureAtCoords(lllllllllllllIIIIllIlIlIllIIIllI, lllllllllllllIIIIllIlIlIllIlIIII) ? 1 : 0)) {
                            s = MapGenStructure$1.lIIIIlIIlllIlI[MapGenStructure$1.lIIIIlIIllllII[0]];
                            "".length();
                            if (" ".length() <= ((0xA8 ^ 0x87 ^ (0x5A ^ 0x30)) & (0xE8 ^ 0x9E ^ (0x6C ^ 0x5F) ^ -" ".length()))) {
                                return null;
                            }
                        }
                        else {
                            s = MapGenStructure$1.lIIIIlIIlllIlI[MapGenStructure$1.lIIIIlIIllllII[1]];
                        }
                        return s;
                    }
                    
                    private static void lIlllIIlIIIlIIl() {
                        (lIIIIlIIllllII = new int[3])[0] = ((0x39 ^ 0x1A) & ~(0x98 ^ 0xBB));
                        MapGenStructure$1.lIIIIlIIllllII[1] = " ".length();
                        MapGenStructure$1.lIIIIlIIllllII[2] = "  ".length();
                    }
                    
                    static {
                        lIlllIIlIIIlIIl();
                        lIlllIIlIIIIlll();
                    }
                    
                    private static boolean lIlllIIlIIIlIlI(final int lllllllllllllIlIIlIllllIlIIlIlII) {
                        return lllllllllllllIlIIlIllllIlIIlIlII != 0;
                    }
                });
                final CrashReportCategory crashReportCategory = lllllllllllllIIIIllIlIlIllIIlIIl;
                final String lllllllllllllIlIllIlIIIIIIlIIlll = MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[3]];
                final String format = MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[4]];
                final Object[] args = new Object[MapGenStructure.lIlIllIlIlIlIl[2]];
                args[MapGenStructure.lIlIllIlIlIlIl[0]] = lllllllllllllIIIIllIlIlIllIIIllI;
                args[MapGenStructure.lIlIllIlIlIlIl[1]] = lllllllllllllIIIIllIlIlIllIlIIII;
                crashReportCategory.addCrashSection(lllllllllllllIlIllIlIIIIIIlIIlll, String.format(format, args));
                lllllllllllllIIIIllIlIlIllIIlIIl.addCrashSectionCallable(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[5]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return String.valueOf(ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIIllIlIlIllIIIllI, lllllllllllllIIIIllIlIlIllIlIIII));
                    }
                });
                lllllllllllllIIIIllIlIlIllIIlIIl.addCrashSectionCallable(MapGenStructure.lIlIllIlIlIIII[MapGenStructure.lIlIllIlIlIlIl[6]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return MapGenStructure.this.getClass().getCanonicalName();
                    }
                });
                throw new ReportedException(lllllllllllllIIIIllIlIlIllIIlIlI);
            }
        }
    }
    
    public BlockPos getClosestStrongholdPos(final World lllllllllllllIIIIllIlIlIIllIIIlI, final BlockPos lllllllllllllIIIIllIlIlIIlllIIlI) {
        this.worldObj = lllllllllllllIIIIllIlIlIIllIIIlI;
        this.func_143027_a(lllllllllllllIIIIllIlIlIIllIIIlI);
        this.rand.setSeed(lllllllllllllIIIIllIlIlIIllIIIlI.getSeed());
        final long lllllllllllllIIIIllIlIlIIlllIIIl = this.rand.nextLong();
        final long lllllllllllllIIIIllIlIlIIlllIIII = this.rand.nextLong();
        final long lllllllllllllIIIIllIlIlIIllIllll = (lllllllllllllIIIIllIlIlIIlllIIlI.getX() >> MapGenStructure.lIlIllIlIlIlIl[4]) * lllllllllllllIIIIllIlIlIIlllIIIl;
        final long lllllllllllllIIIIllIlIlIIllIlllI = (lllllllllllllIIIIllIlIlIIlllIIlI.getZ() >> MapGenStructure.lIlIllIlIlIlIl[4]) * lllllllllllllIIIIllIlIlIIlllIIII;
        this.rand.setSeed(lllllllllllllIIIIllIlIlIIllIllll ^ lllllllllllllIIIIllIlIlIIllIlllI ^ lllllllllllllIIIIllIlIlIIllIIIlI.getSeed());
        this.recursiveGenerate(lllllllllllllIIIIllIlIlIIllIIIlI, lllllllllllllIIIIllIlIlIIlllIIlI.getX() >> MapGenStructure.lIlIllIlIlIlIl[4], lllllllllllllIIIIllIlIlIIlllIIlI.getZ() >> MapGenStructure.lIlIllIlIlIlIl[4], MapGenStructure.lIlIllIlIlIlIl[0], MapGenStructure.lIlIllIlIlIlIl[0], null);
        double lllllllllllllIIIIllIlIlIIllIllIl = Double.MAX_VALUE;
        BlockPos lllllllllllllIIIIllIlIlIIllIllII = null;
        final Iterator<StructureStart> iterator = this.structureMap.values().iterator();
        "".length();
        if ((0x77 ^ 0x72) == 0x0) {
            return null;
        }
        while (!llllIIIlllIIIlI(iterator.hasNext() ? 1 : 0)) {
            final StructureStart lllllllllllllIIIIllIlIlIIllIlIll = iterator.next();
            if (llllIIIlllIIIll(lllllllllllllIIIIllIlIlIIllIlIll.isSizeableStructure() ? 1 : 0)) {
                final StructureComponent lllllllllllllIIIIllIlIlIIllIlIlI = lllllllllllllIIIIllIlIlIIllIlIll.getComponents().get(MapGenStructure.lIlIllIlIlIlIl[0]);
                final BlockPos lllllllllllllIIIIllIlIlIIllIlIIl = lllllllllllllIIIIllIlIlIIllIlIlI.getBoundingBoxCenter();
                final double lllllllllllllIIIIllIlIlIIllIlIII = lllllllllllllIIIIllIlIlIIllIlIIl.distanceSq(lllllllllllllIIIIllIlIlIIlllIIlI);
                if (!llllIIIlllIIllI(llllIIIlllIIlIl(lllllllllllllIIIIllIlIlIIllIlIII, lllllllllllllIIIIllIlIlIIllIllIl))) {
                    continue;
                }
                lllllllllllllIIIIllIlIlIIllIllIl = lllllllllllllIIIIllIlIlIIllIlIII;
                lllllllllllllIIIIllIlIlIIllIllII = lllllllllllllIIIIllIlIlIIllIlIIl;
            }
        }
        if (llllIIIlllIIlII(lllllllllllllIIIIllIlIlIIllIllII)) {
            return lllllllllllllIIIIllIlIlIIllIllII;
        }
        final List<BlockPos> lllllllllllllIIIIllIlIlIIllIIlll = this.getCoordList();
        if (!llllIIIlllIIlII(lllllllllllllIIIIllIlIlIIllIIlll)) {
            return null;
        }
        BlockPos lllllllllllllIIIIllIlIlIIllIIllI = null;
        final String lllllllllllllIIIIllIlIlIIlIlIlll = (String)lllllllllllllIIIIllIlIlIIllIIlll.iterator();
        "".length();
        if (-" ".length() >= 0) {
            return null;
        }
        while (!llllIIIlllIIIlI(((Iterator)lllllllllllllIIIIllIlIlIIlIlIlll).hasNext() ? 1 : 0)) {
            final BlockPos lllllllllllllIIIIllIlIlIIllIIlIl = ((Iterator<BlockPos>)lllllllllllllIIIIllIlIlIIlIlIlll).next();
            final double lllllllllllllIIIIllIlIlIIllIIlII = lllllllllllllIIIIllIlIlIIllIIlIl.distanceSq(lllllllllllllIIIIllIlIlIIlllIIlI);
            if (llllIIIlllIIllI(llllIIIlllIIlIl(lllllllllllllIIIIllIlIlIIllIIlII, lllllllllllllIIIIllIlIlIIllIllIl))) {
                lllllllllllllIIIIllIlIlIIllIllIl = lllllllllllllIIIIllIlIlIIllIIlII;
                lllllllllllllIIIIllIlIlIIllIIllI = lllllllllllllIIIIllIlIlIIllIIlIl;
            }
        }
        return lllllllllllllIIIIllIlIlIIllIIllI;
    }
    
    static {
        llllIIIlllIIIIl();
        llllIIIllIllIlI();
    }
    
    public MapGenStructure() {
        this.structureMap = (Map<Long, StructureStart>)Maps.newHashMap();
    }
    
    private static String llllIIIllIllIIl(final String lllllllllllllIIIIllIlIlIIIIlIlIl, final String lllllllllllllIIIIllIlIlIIIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIlIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIlIIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIlIlIIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIlIlIIIIllIIl.init(MapGenStructure.lIlIllIlIlIlIl[2], lllllllllllllIIIIllIlIlIIIIllIlI);
            return new String(lllllllllllllIIIIllIlIlIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIlIIIIllIII) {
            lllllllllllllIIIIllIlIlIIIIllIII.printStackTrace();
            return null;
        }
    }
    
    public boolean func_175796_a(final World lllllllllllllIIIIllIlIlIlIIIlIlI, final BlockPos lllllllllllllIIIIllIlIlIlIIIIlIl) {
        this.func_143027_a(lllllllllllllIIIIllIlIlIlIIIlIlI);
        final float lllllllllllllIIIIllIlIlIlIIIIIll = (float)this.structureMap.values().iterator();
        "".length();
        if ("   ".length() == 0) {
            return ((0x32 ^ 0x2B ^ (0x56 ^ 0xF)) & (0x4C ^ 0x3A ^ (0x40 ^ 0x76) ^ -" ".length())) != 0x0;
        }
        while (!llllIIIlllIIIlI(((Iterator)lllllllllllllIIIIllIlIlIlIIIIIll).hasNext() ? 1 : 0)) {
            final StructureStart lllllllllllllIIIIllIlIlIlIIIlIII = ((Iterator<StructureStart>)lllllllllllllIIIIllIlIlIlIIIIIll).next();
            if (llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIIIlIII.isSizeableStructure() ? 1 : 0) && llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIIIlIII.getBoundingBox().isVecInside(lllllllllllllIIIIllIlIlIlIIIIlIl) ? 1 : 0)) {
                return MapGenStructure.lIlIllIlIlIlIl[1] != 0;
            }
        }
        return MapGenStructure.lIlIllIlIlIlIl[0] != 0;
    }
    
    private static boolean llllIIIlllIlIIl(final int lllllllllllllIIIIllIlIIlllllIlll, final int lllllllllllllIIIIllIlIIlllllIllI) {
        return lllllllllllllIIIIllIlIIlllllIlll == lllllllllllllIIIIllIlIIlllllIllI;
    }
    
    private static boolean llllIIIlllIIIlI(final int lllllllllllllIIIIllIlIIllllIlIII) {
        return lllllllllllllIIIIllIlIIllllIlIII == 0;
    }
    
    private static boolean llllIIIlllIIlII(final Object lllllllllllllIIIIllIlIIlllllIIII) {
        return lllllllllllllIIIIllIlIIlllllIIII != null;
    }
    
    public boolean func_175795_b(final BlockPos lllllllllllllIIIIllIlIlIlIlIIlII) {
        this.func_143027_a(this.worldObj);
        if (llllIIIlllIIlII(this.func_175797_c(lllllllllllllIIIIllIlIlIlIlIIlII))) {
            return MapGenStructure.lIlIllIlIlIlIl[1] != 0;
        }
        return MapGenStructure.lIlIllIlIlIlIl[0] != 0;
    }
    
    private static int llllIIIlllIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    protected List<BlockPos> getCoordList() {
        return null;
    }
    
    public boolean generateStructure(final World lllllllllllllIIIIllIlIlIlIlIllll, final Random lllllllllllllIIIIllIlIlIlIllIllI, final ChunkCoordIntPair lllllllllllllIIIIllIlIlIlIlIllIl) {
        this.func_143027_a(lllllllllllllIIIIllIlIlIlIlIllll);
        final int lllllllllllllIIIIllIlIlIlIllIlII = (lllllllllllllIIIIllIlIlIlIlIllIl.chunkXPos << MapGenStructure.lIlIllIlIlIlIl[4]) + MapGenStructure.lIlIllIlIlIlIl[7];
        final int lllllllllllllIIIIllIlIlIlIllIIll = (lllllllllllllIIIIllIlIlIlIlIllIl.chunkZPos << MapGenStructure.lIlIllIlIlIlIl[4]) + MapGenStructure.lIlIllIlIlIlIl[7];
        boolean lllllllllllllIIIIllIlIlIlIllIIlI = MapGenStructure.lIlIllIlIlIlIl[0] != 0;
        final String lllllllllllllIIIIllIlIlIlIlIlIII = (String)this.structureMap.values().iterator();
        "".length();
        if ("   ".length() == 0) {
            return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
        }
        while (!llllIIIlllIIIlI(((Iterator)lllllllllllllIIIIllIlIlIlIlIlIII).hasNext() ? 1 : 0)) {
            final StructureStart lllllllllllllIIIIllIlIlIlIllIIIl = ((Iterator<StructureStart>)lllllllllllllIIIIllIlIlIlIlIlIII).next();
            if (llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIllIIIl.isSizeableStructure() ? 1 : 0) && llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIllIIIl.func_175788_a(lllllllllllllIIIIllIlIlIlIlIllIl) ? 1 : 0) && llllIIIlllIIIll(lllllllllllllIIIIllIlIlIlIllIIIl.getBoundingBox().intersectsWith(lllllllllllllIIIIllIlIlIlIllIlII, lllllllllllllIIIIllIlIlIlIllIIll, lllllllllllllIIIIllIlIlIlIllIlII + MapGenStructure.lIlIllIlIlIlIl[8], lllllllllllllIIIIllIlIlIlIllIIll + MapGenStructure.lIlIllIlIlIlIl[8]) ? 1 : 0)) {
                lllllllllllllIIIIllIlIlIlIllIIIl.generateStructure(lllllllllllllIIIIllIlIlIlIlIllll, lllllllllllllIIIIllIlIlIlIllIllI, new StructureBoundingBox(lllllllllllllIIIIllIlIlIlIllIlII, lllllllllllllIIIIllIlIlIlIllIIll, lllllllllllllIIIIllIlIlIlIllIlII + MapGenStructure.lIlIllIlIlIlIl[8], lllllllllllllIIIIllIlIlIlIllIIll + MapGenStructure.lIlIllIlIlIlIl[8]));
                lllllllllllllIIIIllIlIlIlIllIIIl.func_175787_b(lllllllllllllIIIIllIlIlIlIlIllIl);
                lllllllllllllIIIIllIlIlIlIllIIlI = (MapGenStructure.lIlIllIlIlIlIl[1] != 0);
                this.func_143026_a(lllllllllllllIIIIllIlIlIlIllIIIl.getChunkPosX(), lllllllllllllIIIIllIlIlIlIllIIIl.getChunkPosZ(), lllllllllllllIIIIllIlIlIlIllIIIl);
            }
        }
        return lllllllllllllIIIIllIlIlIlIllIIlI;
    }
    
    protected abstract boolean canSpawnStructureAtCoords(final int p0, final int p1);
}
