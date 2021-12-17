// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

import java.io.ByteArrayOutputStream;
import net.minecraft.server.MinecraftServer;
import java.util.zip.InflaterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import java.io.RandomAccessFile;

public class RegionFile
{
    private static final /* synthetic */ int[] lIlllIIIllIllI;
    private /* synthetic */ RandomAccessFile dataFile;
    private static final /* synthetic */ byte[] emptySector;
    private final /* synthetic */ int[] offsets;
    private final /* synthetic */ int[] chunkTimestamps;
    private static final /* synthetic */ String[] lIlllIIIllIlIl;
    private /* synthetic */ long lastModified;
    private /* synthetic */ int sizeDelta;
    private /* synthetic */ List<Boolean> sectorFree;
    private final /* synthetic */ File fileName;
    
    public RegionFile(final File llllllllllllIlllllIlIllIIIIlllll) {
        this.offsets = new int[RegionFile.lIlllIIIllIllI[1]];
        this.chunkTimestamps = new int[RegionFile.lIlllIIIllIllI[1]];
        this.fileName = llllllllllllIlllllIlIllIIIIlllll;
        this.sizeDelta = RegionFile.lIlllIIIllIllI[2];
        try {
            if (lIIIIIIlIllIlIII(llllllllllllIlllllIlIllIIIIlllll.exists() ? 1 : 0)) {
                this.lastModified = llllllllllllIlllllIlIllIIIIlllll.lastModified();
            }
            this.dataFile = new RandomAccessFile(llllllllllllIlllllIlIllIIIIlllll, RegionFile.lIlllIIIllIlIl[RegionFile.lIlllIIIllIllI[2]]);
            if (lIIIIIIlIllIlIIl(lIIIIIIlIllIIlll(this.dataFile.length(), 4096L))) {
                int llllllllllllIlllllIlIllIIIlIlIll = RegionFile.lIlllIIIllIllI[2];
                "".length();
                if ("   ".length() <= "  ".length()) {
                    throw null;
                }
                while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIllIIIlIlIll, RegionFile.lIlllIIIllIllI[1])) {
                    this.dataFile.writeInt(RegionFile.lIlllIIIllIllI[2]);
                    ++llllllllllllIlllllIlIllIIIlIlIll;
                }
                int llllllllllllIlllllIlIllIIIlIlIlI = RegionFile.lIlllIIIllIllI[2];
                "".length();
                if ((0xC7 ^ 0xC3) <= ("   ".length() & ~"   ".length())) {
                    throw null;
                }
                while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIllIIIlIlIlI, RegionFile.lIlllIIIllIllI[1])) {
                    this.dataFile.writeInt(RegionFile.lIlllIIIllIllI[2]);
                    ++llllllllllllIlllllIlIllIIIlIlIlI;
                }
                this.sizeDelta += RegionFile.lIlllIIIllIllI[3];
            }
            if (lIIIIIIlIllIlIII(lIIIIIIlIllIIlll(this.dataFile.length() & 0xFFFL, 0L))) {
                int llllllllllllIlllllIlIllIIIlIlIIl = RegionFile.lIlllIIIllIllI[2];
                "".length();
                if ((25 + 42 - 13 + 116 ^ 48 + 77 + 41 + 8) < " ".length()) {
                    throw null;
                }
                while (!lIIIIIIlIllIlIll(lIIIIIIlIllIIlll(llllllllllllIlllllIlIllIIIlIlIIl, this.dataFile.length() & 0xFFFL))) {
                    this.dataFile.write(RegionFile.lIlllIIIllIllI[2]);
                    ++llllllllllllIlllllIlIllIIIlIlIIl;
                }
            }
            final int llllllllllllIlllllIlIllIIIlIlIII = (int)this.dataFile.length() / RegionFile.lIlllIIIllIllI[0];
            this.sectorFree = (List<Boolean>)Lists.newArrayListWithCapacity(llllllllllllIlllllIlIllIIIlIlIII);
            int llllllllllllIlllllIlIllIIIlIIlll = RegionFile.lIlllIIIllIllI[2];
            "".length();
            if (" ".length() >= "   ".length()) {
                throw null;
            }
            while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIllIIIlIIlll, llllllllllllIlllllIlIllIIIlIlIII)) {
                this.sectorFree.add((boolean)(RegionFile.lIlllIIIllIllI[4] != 0));
                "".length();
                ++llllllllllllIlllllIlIllIIIlIIlll;
            }
            this.sectorFree.set(RegionFile.lIlllIIIllIllI[2], (boolean)(RegionFile.lIlllIIIllIllI[2] != 0));
            "".length();
            this.sectorFree.set(RegionFile.lIlllIIIllIllI[4], (boolean)(RegionFile.lIlllIIIllIllI[2] != 0));
            "".length();
            this.dataFile.seek(0L);
            int llllllllllllIlllllIlIllIIIlIIllI = RegionFile.lIlllIIIllIllI[2];
            "".length();
            if (((0x39 ^ 0x7C) & ~(0x7F ^ 0x3A)) > 0) {
                throw null;
            }
            while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIllIIIlIIllI, RegionFile.lIlllIIIllIllI[1])) {
                final int llllllllllllIlllllIlIllIIIlIIlIl = this.dataFile.readInt();
                this.offsets[llllllllllllIlllllIlIllIIIlIIllI] = llllllllllllIlllllIlIllIIIlIIlIl;
                if (lIIIIIIlIllIlIII(llllllllllllIlllllIlIllIIIlIIlIl) && lIIIIIIlIllIllII((llllllllllllIlllllIlIllIIIlIIlIl >> RegionFile.lIlllIIIllIllI[5]) + (llllllllllllIlllllIlIllIIIlIIlIl & RegionFile.lIlllIIIllIllI[6]), this.sectorFree.size())) {
                    int llllllllllllIlllllIlIllIIIlIIlII = RegionFile.lIlllIIIllIllI[2];
                    "".length();
                    if (((47 + 27 + 14 + 67 ^ 102 + 127 - 157 + 61) & (74 + 32 + 5 + 59 ^ 57 + 20 + 27 + 76 ^ -" ".length())) < 0) {
                        throw null;
                    }
                    while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIllIIIlIIlII, llllllllllllIlllllIlIllIIIlIIlIl & RegionFile.lIlllIIIllIllI[6])) {
                        this.sectorFree.set((llllllllllllIlllllIlIllIIIlIIlIl >> RegionFile.lIlllIIIllIllI[5]) + llllllllllllIlllllIlIllIIIlIIlII, (boolean)(RegionFile.lIlllIIIllIllI[2] != 0));
                        "".length();
                        ++llllllllllllIlllllIlIllIIIlIIlII;
                    }
                }
                ++llllllllllllIlllllIlIllIIIlIIllI;
            }
            int llllllllllllIlllllIlIllIIIlIIIll = RegionFile.lIlllIIIllIllI[2];
            "".length();
            if (null != null) {
                throw null;
            }
            while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIllIIIlIIIll, RegionFile.lIlllIIIllIllI[1])) {
                final int llllllllllllIlllllIlIllIIIlIIIlI = this.dataFile.readInt();
                this.chunkTimestamps[llllllllllllIlllllIlIllIIIlIIIll] = llllllllllllIlllllIlIllIIIlIIIlI;
                ++llllllllllllIlllllIlIllIIIlIIIll;
            }
            "".length();
            if ((0xE9 ^ 0xB7 ^ (0xC8 ^ 0x92)) <= " ".length()) {
                throw null;
            }
        }
        catch (IOException llllllllllllIlllllIlIllIIIlIIIIl) {
            llllllllllllIlllllIlIllIIIlIIIIl.printStackTrace();
        }
    }
    
    private void setChunkTimestamp(final int llllllllllllIlllllIlIlIllIIlIIlI, final int llllllllllllIlllllIlIlIllIIlIlIl, final int llllllllllllIlllllIlIlIllIIlIlII) throws IOException {
        this.chunkTimestamps[llllllllllllIlllllIlIlIllIIlIIlI + llllllllllllIlllllIlIlIllIIlIlIl * RegionFile.lIlllIIIllIllI[11]] = llllllllllllIlllllIlIlIllIIlIlII;
        this.dataFile.seek(RegionFile.lIlllIIIllIllI[0] + (llllllllllllIlllllIlIlIllIIlIIlI + llllllllllllIlllllIlIlIllIIlIlIl * RegionFile.lIlllIIIllIllI[11]) * RegionFile.lIlllIIIllIllI[12]);
        this.dataFile.writeInt(llllllllllllIlllllIlIlIllIIlIlII);
    }
    
    static {
        lIIIIIIlIllIIllI();
        lIIIIIIlIllIIlIl();
        emptySector = new byte[RegionFile.lIlllIIIllIllI[0]];
    }
    
    private static boolean lIIIIIIlIlllIIlI(final int llllllllllllIlllllIlIlIlIllIlIlI, final int llllllllllllIlllllIlIlIlIllIlIIl) {
        return llllllllllllIlllllIlIlIlIllIlIlI < llllllllllllIlllllIlIlIlIllIlIIl;
    }
    
    private void setOffset(final int llllllllllllIlllllIlIlIllIIllllI, final int llllllllllllIlllllIlIlIllIlIIIIl, final int llllllllllllIlllllIlIlIllIlIIIII) throws IOException {
        this.offsets[llllllllllllIlllllIlIlIllIIllllI + llllllllllllIlllllIlIlIllIlIIIIl * RegionFile.lIlllIIIllIllI[11]] = llllllllllllIlllllIlIlIllIlIIIII;
        this.dataFile.seek((llllllllllllIlllllIlIlIllIIllllI + llllllllllllIlllllIlIlIllIlIIIIl * RegionFile.lIlllIIIllIllI[11]) * RegionFile.lIlllIIIllIllI[12]);
        this.dataFile.writeInt(llllllllllllIlllllIlIlIllIlIIIII);
    }
    
    private static boolean lIIIIIIlIllIlIlI(final int llllllllllllIlllllIlIlIlIllIlllI, final int llllllllllllIlllllIlIlIlIllIllIl) {
        return llllllllllllIlllllIlIlIlIllIlllI >= llllllllllllIlllllIlIlIlIllIllIl;
    }
    
    private static int lIIIIIIlIllIIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public DataOutputStream getChunkDataOutputStream(final int llllllllllllIlllllIlIlIllllllIIl, final int llllllllllllIlllllIlIlIllllllIII) {
        DataOutputStream dataOutputStream;
        if (lIIIIIIlIllIlIII(this.outOfBounds(llllllllllllIlllllIlIlIllllllIIl, llllllllllllIlllllIlIlIllllllIII) ? 1 : 0)) {
            dataOutputStream = null;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            final DeflaterOutputStream out;
            dataOutputStream = new DataOutputStream(out);
            out = new DeflaterOutputStream(new ChunkBuffer(llllllllllllIlllllIlIlIllllllIIl, llllllllllllIlllllIlIlIllllllIII));
        }
        return dataOutputStream;
    }
    
    private void write(final int llllllllllllIlllllIlIlIlllIIIlll, final byte[] llllllllllllIlllllIlIlIlllIIIllI, final int llllllllllllIlllllIlIlIlllIIIlIl) throws IOException {
        this.dataFile.seek(llllllllllllIlllllIlIlIlllIIIlll * RegionFile.lIlllIIIllIllI[0]);
        this.dataFile.writeInt(llllllllllllIlllllIlIlIlllIIIlIl + RegionFile.lIlllIIIllIllI[4]);
        this.dataFile.writeByte(RegionFile.lIlllIIIllIllI[7]);
        this.dataFile.write(llllllllllllIlllllIlIlIlllIIIllI, RegionFile.lIlllIIIllIllI[2], llllllllllllIlllllIlIlIlllIIIlIl);
    }
    
    private static boolean lIIIIIIlIllIllll(final int llllllllllllIlllllIlIlIlIlIlIlIl) {
        return llllllllllllIlllllIlIlIlIlIlIlIl <= 0;
    }
    
    public boolean isChunkSaved(final int llllllllllllIlllllIlIlIllIlIllII, final int llllllllllllIlllllIlIlIllIlIlIll) {
        if (lIIIIIIlIllIlIII(this.getOffset(llllllllllllIlllllIlIlIllIlIllII, llllllllllllIlllllIlIlIllIlIlIll))) {
            return RegionFile.lIlllIIIllIllI[4] != 0;
        }
        return RegionFile.lIlllIIIllIllI[2] != 0;
    }
    
    private static String lIIIIIIlIllIIlII(String llllllllllllIlllllIlIlIlIlllllIl, final String llllllllllllIlllllIlIlIllIIIIIIl) {
        llllllllllllIlllllIlIlIlIlllllIl = new String(Base64.getDecoder().decode(llllllllllllIlllllIlIlIlIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlIlIllIIIIIII = new StringBuilder();
        final char[] llllllllllllIlllllIlIlIlIlllllll = llllllllllllIlllllIlIlIllIIIIIIl.toCharArray();
        int llllllllllllIlllllIlIlIlIllllllI = RegionFile.lIlllIIIllIllI[2];
        final boolean llllllllllllIlllllIlIlIlIllllIII = (Object)llllllllllllIlllllIlIlIlIlllllIl.toCharArray();
        final double llllllllllllIlllllIlIlIlIlllIlll = llllllllllllIlllllIlIlIlIllllIII.length;
        boolean llllllllllllIlllllIlIlIlIlllIllI = RegionFile.lIlllIIIllIllI[2] != 0;
        while (lIIIIIIlIlllIIlI(llllllllllllIlllllIlIlIlIlllIllI ? 1 : 0, (int)llllllllllllIlllllIlIlIlIlllIlll)) {
            final char llllllllllllIlllllIlIlIllIIIIIll = llllllllllllIlllllIlIlIlIllllIII[llllllllllllIlllllIlIlIlIlllIllI];
            llllllllllllIlllllIlIlIllIIIIIII.append((char)(llllllllllllIlllllIlIlIllIIIIIll ^ llllllllllllIlllllIlIlIlIlllllll[llllllllllllIlllllIlIlIlIllllllI % llllllllllllIlllllIlIlIlIlllllll.length]));
            "".length();
            ++llllllllllllIlllllIlIlIlIllllllI;
            ++llllllllllllIlllllIlIlIlIlllIllI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlIlIllIIIIIII);
    }
    
    private static boolean lIIIIIIlIllIlllI(final int llllllllllllIlllllIlIlIlIllIIIlI, final int llllllllllllIlllllIlIlIlIllIIIIl) {
        return llllllllllllIlllllIlIlIlIllIIIlI > llllllllllllIlllllIlIlIlIllIIIIl;
    }
    
    private static boolean lIIIIIIlIllIlIll(final int llllllllllllIlllllIlIlIlIlIllIIl) {
        return llllllllllllIlllllIlIlIlIlIllIIl >= 0;
    }
    
    private static boolean lIIIIIIlIlllIIll(final Object llllllllllllIlllllIlIlIlIlIlllll) {
        return llllllllllllIlllllIlIlIlIlIlllll != null;
    }
    
    private static void lIIIIIIlIllIIllI() {
        (lIlllIIIllIllI = new int[13])[0] = (-(0xFFFFEFDB & 0x1C2D) & (0xFFFFBFCB & 0x5C3C));
        RegionFile.lIlllIIIllIllI[1] = (0xFFFFEE73 & 0x158C);
        RegionFile.lIlllIIIllIllI[2] = ((0x9F ^ 0x95) & ~(0x8D ^ 0x87));
        RegionFile.lIlllIIIllIllI[3] = (-(0xFFFFDF3F & 0x2FDF) & (0xFFFFEFDF & 0x3F3E));
        RegionFile.lIlllIIIllIllI[4] = " ".length();
        RegionFile.lIlllIIIllIllI[5] = (0x2E ^ 0x26);
        RegionFile.lIlllIIIllIllI[6] = 96 + 220 - 66 + 5;
        RegionFile.lIlllIIIllIllI[7] = "  ".length();
        RegionFile.lIlllIIIllIllI[8] = (102 + 50 - 70 + 62 ^ 27 + 40 - 22 + 104);
        RegionFile.lIlllIIIllIllI[9] = (-(0xFFFFF75F & 0x7AF9) & (0xFFFFFB5A & 0x77FD));
        RegionFile.lIlllIIIllIllI[10] = -" ".length();
        RegionFile.lIlllIIIllIllI[11] = (0x99 ^ 0xB9);
        RegionFile.lIlllIIIllIllI[12] = (0xE5 ^ 0xBB ^ (0x7B ^ 0x21));
    }
    
    private boolean outOfBounds(final int llllllllllllIlllllIlIlIllIllllIl, final int llllllllllllIlllllIlIlIllIllllII) {
        if (lIIIIIIlIllIlIll(llllllllllllIlllllIlIlIllIllllIl) && lIIIIIIlIlllIIlI(llllllllllllIlllllIlIlIllIllllIl, RegionFile.lIlllIIIllIllI[11]) && lIIIIIIlIllIlIll(llllllllllllIlllllIlIlIllIllllII) && lIIIIIIlIlllIIlI(llllllllllllIlllllIlIlIllIllllII, RegionFile.lIlllIIIllIllI[11])) {
            return RegionFile.lIlllIIIllIllI[2] != 0;
        }
        return RegionFile.lIlllIIIllIllI[4] != 0;
    }
    
    public void close() throws IOException {
        if (lIIIIIIlIlllIIll(this.dataFile)) {
            this.dataFile.close();
        }
    }
    
    public synchronized DataInputStream getChunkDataInputStream(final int llllllllllllIlllllIlIllIIIIlIIII, final int llllllllllllIlllllIlIllIIIIIllll) {
        if (lIIIIIIlIllIlIII(this.outOfBounds(llllllllllllIlllllIlIllIIIIlIIII, llllllllllllIlllllIlIllIIIIIllll) ? 1 : 0)) {
            return null;
        }
        try {
            final int llllllllllllIlllllIlIllIIIIIlllI = this.getOffset(llllllllllllIlllllIlIllIIIIlIIII, llllllllllllIlllllIlIllIIIIIllll);
            if (lIIIIIIlIllIllIl(llllllllllllIlllllIlIllIIIIIlllI)) {
                return null;
            }
            final int llllllllllllIlllllIlIllIIIIIllIl = llllllllllllIlllllIlIllIIIIIlllI >> RegionFile.lIlllIIIllIllI[5];
            final int llllllllllllIlllllIlIllIIIIIllII = llllllllllllIlllllIlIllIIIIIlllI & RegionFile.lIlllIIIllIllI[6];
            if (lIIIIIIlIllIlllI(llllllllllllIlllllIlIllIIIIIllIl + llllllllllllIlllllIlIllIIIIIllII, this.sectorFree.size())) {
                return null;
            }
            this.dataFile.seek(llllllllllllIlllllIlIllIIIIIllIl * RegionFile.lIlllIIIllIllI[0]);
            final int llllllllllllIlllllIlIllIIIIIlIll = this.dataFile.readInt();
            if (lIIIIIIlIllIlllI(llllllllllllIlllllIlIllIIIIIlIll, RegionFile.lIlllIIIllIllI[0] * llllllllllllIlllllIlIllIIIIIllII)) {
                return null;
            }
            if (lIIIIIIlIllIllll(llllllllllllIlllllIlIllIIIIIlIll)) {
                return null;
            }
            final byte llllllllllllIlllllIlIllIIIIIlIlI = this.dataFile.readByte();
            if (lIIIIIIlIlllIIII(llllllllllllIlllllIlIllIIIIIlIlI, RegionFile.lIlllIIIllIllI[4])) {
                final byte[] llllllllllllIlllllIlIllIIIIIlIIl = new byte[llllllllllllIlllllIlIllIIIIIlIll - RegionFile.lIlllIIIllIllI[4]];
                this.dataFile.read(llllllllllllIlllllIlIllIIIIIlIIl);
                "".length();
                return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(llllllllllllIlllllIlIllIIIIIlIIl))));
            }
            if (lIIIIIIlIlllIIII(llllllllllllIlllllIlIllIIIIIlIlI, RegionFile.lIlllIIIllIllI[7])) {
                final byte[] llllllllllllIlllllIlIllIIIIIlIII = new byte[llllllllllllIlllllIlIllIIIIIlIll - RegionFile.lIlllIIIllIllI[4]];
                this.dataFile.read(llllllllllllIlllllIlIllIIIIIlIII);
                "".length();
                return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(llllllllllllIlllllIlIllIIIIIlIII))));
            }
            return null;
        }
        catch (IOException llllllllllllIlllllIlIllIIIIIIlll) {
            return null;
        }
    }
    
    private static boolean lIIIIIIlIllIllII(final int llllllllllllIlllllIlIlIlIllIIllI, final int llllllllllllIlllllIlIlIlIllIIlIl) {
        return llllllllllllIlllllIlIlIlIllIIllI <= llllllllllllIlllllIlIlIlIllIIlIl;
    }
    
    private static boolean lIIIIIIlIlllIIII(final int llllllllllllIlllllIlIlIlIlllIIlI, final int llllllllllllIlllllIlIlIlIlllIIIl) {
        return llllllllllllIlllllIlIlIlIlllIIlI == llllllllllllIlllllIlIlIlIlllIIIl;
    }
    
    private static boolean lIIIIIIlIllIlIIl(final int llllllllllllIlllllIlIlIlIlIlIlll) {
        return llllllllllllIlllllIlIlIlIlIlIlll < 0;
    }
    
    private static boolean lIIIIIIlIllIlIII(final int llllllllllllIlllllIlIlIlIlIlllIl) {
        return llllllllllllIlllllIlIlIlIlIlllIl != 0;
    }
    
    private static void lIIIIIIlIllIIlIl() {
        (lIlllIIIllIlIl = new String[RegionFile.lIlllIIIllIllI[4]])[RegionFile.lIlllIIIllIllI[2]] = lIIIIIIlIllIIlII("PRI=", "Oeftv");
    }
    
    private static boolean lIIIIIIlIllIllIl(final int llllllllllllIlllllIlIlIlIlIllIll) {
        return llllllllllllIlllllIlIlIlIlIllIll == 0;
    }
    
    private int getOffset(final int llllllllllllIlllllIlIlIllIllIlIl, final int llllllllllllIlllllIlIlIllIllIIIl) {
        return this.offsets[llllllllllllIlllllIlIlIllIllIlIl + llllllllllllIlllllIlIlIllIllIIIl * RegionFile.lIlllIIIllIllI[11]];
    }
    
    private static boolean lIIIIIIlIlllIIIl(final int llllllllllllIlllllIlIlIlIlIlIIlI, final int llllllllllllIlllllIlIlIlIlIlIIIl) {
        return llllllllllllIlllllIlIlIlIlIlIIlI != llllllllllllIlllllIlIlIlIlIlIIIl;
    }
    
    protected synchronized void write(final int llllllllllllIlllllIlIlIlllIlIlll, final int llllllllllllIlllllIlIlIllllIIllI, final byte[] llllllllllllIlllllIlIlIllllIIlIl, final int llllllllllllIlllllIlIlIllllIIlII) {
        try {
            final int llllllllllllIlllllIlIlIllllIIIll = this.getOffset(llllllllllllIlllllIlIlIlllIlIlll, llllllllllllIlllllIlIlIllllIIllI);
            int llllllllllllIlllllIlIlIllllIIIlI = llllllllllllIlllllIlIlIllllIIIll >> RegionFile.lIlllIIIllIllI[5];
            final int llllllllllllIlllllIlIlIllllIIIIl = llllllllllllIlllllIlIlIllllIIIll & RegionFile.lIlllIIIllIllI[6];
            final int llllllllllllIlllllIlIlIllllIIIII = (llllllllllllIlllllIlIlIllllIIlII + RegionFile.lIlllIIIllIllI[8]) / RegionFile.lIlllIIIllIllI[0] + RegionFile.lIlllIIIllIllI[4];
            if (lIIIIIIlIllIlIlI(llllllllllllIlllllIlIlIllllIIIII, RegionFile.lIlllIIIllIllI[9])) {
                return;
            }
            if (lIIIIIIlIllIlIII(llllllllllllIlllllIlIlIllllIIIlI) && lIIIIIIlIlllIIII(llllllllllllIlllllIlIlIllllIIIIl, llllllllllllIlllllIlIlIllllIIIII)) {
                this.write(llllllllllllIlllllIlIlIllllIIIlI, llllllllllllIlllllIlIlIllllIIlIl, llllllllllllIlllllIlIlIllllIIlII);
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                int llllllllllllIlllllIlIlIlllIlllll = RegionFile.lIlllIIIllIllI[2];
                "".length();
                if (((0x4F ^ 0x41) & ~(0x72 ^ 0x7C)) != 0x0) {
                    return;
                }
                while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIlIlllIlllll, llllllllllllIlllllIlIlIllllIIIIl)) {
                    this.sectorFree.set(llllllllllllIlllllIlIlIllllIIIlI + llllllllllllIlllllIlIlIlllIlllll, (boolean)(RegionFile.lIlllIIIllIllI[4] != 0));
                    "".length();
                    ++llllllllllllIlllllIlIlIlllIlllll;
                }
                int llllllllllllIlllllIlIlIlllIllllI = this.sectorFree.indexOf((boolean)(RegionFile.lIlllIIIllIllI[4] != 0));
                int llllllllllllIlllllIlIlIlllIlllIl = RegionFile.lIlllIIIllIllI[2];
                if (lIIIIIIlIlllIIIl(llllllllllllIlllllIlIlIlllIllllI, RegionFile.lIlllIIIllIllI[10])) {
                    int llllllllllllIlllllIlIlIlllIlllII = llllllllllllIlllllIlIlIlllIllllI;
                    "".length();
                    if (((0xD9 ^ 0x9B) & ~(0x64 ^ 0x26)) >= (0x33 ^ 0x37)) {
                        return;
                    }
                    while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIlIlllIlllII, this.sectorFree.size())) {
                        if (lIIIIIIlIllIlIII(llllllllllllIlllllIlIlIlllIlllIl)) {
                            if (lIIIIIIlIllIlIII(((boolean)this.sectorFree.get(llllllllllllIlllllIlIlIlllIlllII)) ? 1 : 0)) {
                                ++llllllllllllIlllllIlIlIlllIlllIl;
                                "".length();
                                if (((9 + 89 + 116 + 24 ^ 157 + 93 - 186 + 128) & (63 + 10 + 44 + 13 ^ 119 + 92 - 97 + 58 ^ -" ".length())) == -" ".length()) {
                                    return;
                                }
                            }
                            else {
                                llllllllllllIlllllIlIlIlllIlllIl = RegionFile.lIlllIIIllIllI[2];
                                "".length();
                                if (-" ".length() > -" ".length()) {
                                    return;
                                }
                            }
                        }
                        else if (lIIIIIIlIllIlIII(((boolean)this.sectorFree.get(llllllllllllIlllllIlIlIlllIlllII)) ? 1 : 0)) {
                            llllllllllllIlllllIlIlIlllIllllI = llllllllllllIlllllIlIlIlllIlllII;
                            llllllllllllIlllllIlIlIlllIlllIl = RegionFile.lIlllIIIllIllI[4];
                        }
                        if (lIIIIIIlIllIlIlI(llllllllllllIlllllIlIlIlllIlllIl, llllllllllllIlllllIlIlIllllIIIII)) {
                            "".length();
                            if ((0xE ^ 0x15 ^ (0x53 ^ 0x4C)) == 0x0) {
                                return;
                            }
                            break;
                        }
                        else {
                            ++llllllllllllIlllllIlIlIlllIlllII;
                        }
                    }
                }
                if (lIIIIIIlIllIlIlI(llllllllllllIlllllIlIlIlllIlllIl, llllllllllllIlllllIlIlIllllIIIII)) {
                    llllllllllllIlllllIlIlIllllIIIlI = llllllllllllIlllllIlIlIlllIllllI;
                    this.setOffset(llllllllllllIlllllIlIlIlllIlIlll, llllllllllllIlllllIlIlIllllIIllI, llllllllllllIlllllIlIlIlllIllllI << RegionFile.lIlllIIIllIllI[5] | llllllllllllIlllllIlIlIllllIIIII);
                    int llllllllllllIlllllIlIlIlllIllIll = RegionFile.lIlllIIIllIllI[2];
                    "".length();
                    if (((0x87 ^ 0xBE) & ~(0x63 ^ 0x5A)) != 0x0) {
                        return;
                    }
                    while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIlIlllIllIll, llllllllllllIlllllIlIlIllllIIIII)) {
                        this.sectorFree.set(llllllllllllIlllllIlIlIllllIIIlI + llllllllllllIlllllIlIlIlllIllIll, (boolean)(RegionFile.lIlllIIIllIllI[2] != 0));
                        "".length();
                        ++llllllllllllIlllllIlIlIlllIllIll;
                    }
                    this.write(llllllllllllIlllllIlIlIllllIIIlI, llllllllllllIlllllIlIlIllllIIlIl, llllllllllllIlllllIlIlIllllIIlII);
                    "".length();
                    if (("   ".length() & ~"   ".length()) != 0x0) {
                        return;
                    }
                }
                else {
                    this.dataFile.seek(this.dataFile.length());
                    llllllllllllIlllllIlIlIllllIIIlI = this.sectorFree.size();
                    int llllllllllllIlllllIlIlIlllIllIlI = RegionFile.lIlllIIIllIllI[2];
                    "".length();
                    if ((0x98 ^ 0x9C) <= ((0x5C ^ 0x15) & ~(0x2B ^ 0x62))) {
                        return;
                    }
                    while (!lIIIIIIlIllIlIlI(llllllllllllIlllllIlIlIlllIllIlI, llllllllllllIlllllIlIlIllllIIIII)) {
                        this.dataFile.write(RegionFile.emptySector);
                        this.sectorFree.add((boolean)(RegionFile.lIlllIIIllIllI[2] != 0));
                        "".length();
                        ++llllllllllllIlllllIlIlIlllIllIlI;
                    }
                    this.sizeDelta += RegionFile.lIlllIIIllIllI[0] * llllllllllllIlllllIlIlIllllIIIII;
                    this.write(llllllllllllIlllllIlIlIllllIIIlI, llllllllllllIlllllIlIlIllllIIlIl, llllllllllllIlllllIlIlIllllIIlII);
                    this.setOffset(llllllllllllIlllllIlIlIlllIlIlll, llllllllllllIlllllIlIlIllllIIllI, llllllllllllIlllllIlIlIllllIIIlI << RegionFile.lIlllIIIllIllI[5] | llllllllllllIlllllIlIlIllllIIIII);
                }
            }
            this.setChunkTimestamp(llllllllllllIlllllIlIlIlllIlIlll, llllllllllllIlllllIlIlIllllIIllI, (int)(MinecraftServer.getCurrentTimeMillis() / 1000L));
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (IOException llllllllllllIlllllIlIlIlllIllIIl) {
            llllllllllllIlllllIlIlIlllIllIIl.printStackTrace();
        }
    }
    
    class ChunkBuffer extends ByteArrayOutputStream
    {
        private /* synthetic */ int chunkX;
        private static final /* synthetic */ int[] lIIIlIIllIlIlI;
        private /* synthetic */ int chunkZ;
        
        private static void lIllllllIllllII() {
            (lIIIlIIllIlIlI = new int[1])[0] = (-(0xFFFFF6DF & 0x6937) & (0xFFFFFFBE & 0x7FF7));
        }
        
        @Override
        public void close() throws IOException {
            RegionFile.this.write(this.chunkX, this.chunkZ, this.buf, this.count);
        }
        
        public ChunkBuffer(final int lllllllllllllIlIIIlIlIIlIlIlIlII, final int lllllllllllllIlIIIlIlIIlIlIlIIll) {
            super(ChunkBuffer.lIIIlIIllIlIlI[0]);
            this.chunkX = lllllllllllllIlIIIlIlIIlIlIlIlII;
            this.chunkZ = lllllllllllllIlIIIlIlIIlIlIlIIll;
        }
        
        static {
            lIllllllIllllII();
        }
    }
}
