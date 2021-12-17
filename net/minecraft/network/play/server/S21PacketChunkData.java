// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Iterator;
import java.util.List;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import com.google.common.collect.Lists;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S21PacketChunkData implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int chunkX;
    private /* synthetic */ int chunkZ;
    private /* synthetic */ boolean field_149279_g;
    private static final /* synthetic */ int[] lIllllIllIIIll;
    private /* synthetic */ Extracted extractedData;
    
    private static void lIIIIlIIllIIIIll() {
        (lIllllIllIIIll = new int[8])[0] = ((0x20 ^ 0x6D ^ (0x2 ^ 0x64)) & (99 + 97 - 45 + 6 ^ 85 + 109 - 38 + 26 ^ -" ".length()));
        S21PacketChunkData.lIllllIllIIIll[1] = " ".length();
        S21PacketChunkData.lIllllIllIIIll[2] = (-" ".length() & (-1 & 0xFFFF));
        S21PacketChunkData.lIllllIllIIIll[3] = "  ".length();
        S21PacketChunkData.lIllllIllIIIll[4] = (0x15 ^ 0x5);
        S21PacketChunkData.lIllllIllIIIll[5] = (0xFFFFBD23 & 0x43DC);
        S21PacketChunkData.lIllllIllIIIll[6] = 73 + 69 + 27 + 50 + (0x19 ^ 0x2B) - (118 + 168 - 253 + 182) + (59 + 163 - 194 + 173);
        S21PacketChunkData.lIllllIllIIIll[7] = (142 + 141 - 210 + 78 ^ 144 + 134 - 236 + 117);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllllIlIIIllIIIlIllI) {
        llllllllllllIllllIlIIIllIIIlIllI.handleChunkData(this);
    }
    
    private static boolean lIIIIlIIllIIIlII(final int llllllllllllIllllIlIIIlIlIllIIII) {
        return llllllllllllIllllIlIIIlIlIllIIII != 0;
    }
    
    private static boolean lIIIIlIIllIIIlll(final int llllllllllllIllllIlIIIlIlIllIlIl, final int llllllllllllIllllIlIIIlIlIllIlII) {
        return llllllllllllIllllIlIIIlIlIllIlIl >= llllllllllllIllllIlIIIlIlIllIlII;
    }
    
    private static boolean lIIIIlIIllIIIlIl(final Object llllllllllllIllllIlIIIlIlIllIIlI) {
        return llllllllllllIllllIlIIIlIlIllIIlI != null;
    }
    
    public int getExtractedSize() {
        return this.extractedData.dataSize;
    }
    
    public int getChunkX() {
        return this.chunkX;
    }
    
    public S21PacketChunkData() {
    }
    
    public S21PacketChunkData(final Chunk llllllllllllIllllIlIIIllIIlIlIlI, final boolean llllllllllllIllllIlIIIllIIlIlIIl, final int llllllllllllIllllIlIIIllIIlIlIII) {
        this.chunkX = llllllllllllIllllIlIIIllIIlIlIlI.xPosition;
        this.chunkZ = llllllllllllIllllIlIIIllIIlIlIlI.zPosition;
        this.field_149279_g = llllllllllllIllllIlIIIllIIlIlIIl;
        int llllllllllllIllllIlIIIlIlllIllII;
        if (lIIIIlIIllIIIlII(llllllllllllIllllIlIIIllIIlIlIlI.getWorld().provider.getHasNoSky() ? 1 : 0)) {
            llllllllllllIllllIlIIIlIlllIllII = S21PacketChunkData.lIllllIllIIIll[0];
            "".length();
            if (-" ".length() == "  ".length()) {
                throw null;
            }
        }
        else {
            llllllllllllIllllIlIIIlIlllIllII = S21PacketChunkData.lIllllIllIIIll[1];
        }
        this.extractedData = func_179756_a(llllllllllllIllllIlIIIllIIlIlIlI, llllllllllllIllllIlIIIllIIlIlIIl, (boolean)(llllllllllllIllllIlIIIlIlllIllII != 0), llllllllllllIllllIlIIIllIIlIlIII);
    }
    
    static {
        lIIIIlIIllIIIIll();
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllllIlIIIllIIIllllI) throws IOException {
        llllllllllllIllllIlIIIllIIIllllI.writeInt(this.chunkX);
        "".length();
        llllllllllllIllllIlIIIllIIIllllI.writeInt(this.chunkZ);
        "".length();
        llllllllllllIllllIlIIIllIIIllllI.writeBoolean(this.field_149279_g);
        "".length();
        llllllllllllIllllIlIIIllIIIllllI.writeShort((short)(this.extractedData.dataSize & S21PacketChunkData.lIllllIllIIIll[2]));
        "".length();
        llllllllllllIllllIlIIIllIIIllllI.writeByteArray(this.extractedData.data);
    }
    
    private static int func_179757_a(final byte[] llllllllllllIllllIlIIIlIllIIlIlI, final byte[] llllllllllllIllllIlIIIlIllIIllII, final int llllllllllllIllllIlIIIlIllIIlIII) {
        System.arraycopy(llllllllllllIllllIlIIIlIllIIlIlI, S21PacketChunkData.lIllllIllIIIll[0], llllllllllllIllllIlIIIlIllIIllII, llllllllllllIllllIlIIIlIllIIlIII, llllllllllllIllllIlIIIlIllIIlIlI.length);
        return llllllllllllIllllIlIIIlIllIIlIII + llllllllllllIllllIlIIIlIllIIlIlI.length;
    }
    
    private static boolean lIIIIlIIllIIIllI(final int llllllllllllIllllIlIIIlIlIlIlllI) {
        return llllllllllllIllllIlIIIlIlIlIlllI == 0;
    }
    
    public boolean func_149274_i() {
        return this.field_149279_g;
    }
    
    public int getChunkZ() {
        return this.chunkZ;
    }
    
    public static Extracted func_179756_a(final Chunk llllllllllllIllllIlIIIlIlllIlllI, final boolean llllllllllllIllllIlIIIlIllIllllI, final boolean llllllllllllIllllIlIIIlIlllIllII, final int llllllllllllIllllIlIIIlIlllIlIll) {
        final ExtendedBlockStorage[] llllllllllllIllllIlIIIlIlllIlIlI = llllllllllllIllllIlIIIlIlllIlllI.getBlockStorageArray();
        final Extracted llllllllllllIllllIlIIIlIlllIlIIl = new Extracted();
        final List<ExtendedBlockStorage> llllllllllllIllllIlIIIlIlllIlIII = (List<ExtendedBlockStorage>)Lists.newArrayList();
        int llllllllllllIllllIlIIIlIlllIIlll = S21PacketChunkData.lIllllIllIIIll[0];
        "".length();
        if (-" ".length() > -" ".length()) {
            return null;
        }
        while (!lIIIIlIIllIIIlll(llllllllllllIllllIlIIIlIlllIIlll, llllllllllllIllllIlIIIlIlllIlIlI.length)) {
            final ExtendedBlockStorage llllllllllllIllllIlIIIlIlllIIllI = llllllllllllIllllIlIIIlIlllIlIlI[llllllllllllIllllIlIIIlIlllIIlll];
            if (lIIIIlIIllIIIlIl(llllllllllllIllllIlIIIlIlllIIllI) && (!lIIIIlIIllIIIlII(llllllllllllIllllIlIIIlIllIllllI ? 1 : 0) || lIIIIlIIllIIIllI(llllllllllllIllllIlIIIlIlllIIllI.isEmpty() ? 1 : 0)) && lIIIIlIIllIIIlII(llllllllllllIllllIlIIIlIlllIlIll & S21PacketChunkData.lIllllIllIIIll[1] << llllllllllllIllllIlIIIlIlllIIlll)) {
                final Extracted extracted = llllllllllllIllllIlIIIlIlllIlIIl;
                extracted.dataSize |= S21PacketChunkData.lIllllIllIIIll[1] << llllllllllllIllllIlIIIlIlllIIlll;
                llllllllllllIllllIlIIIlIlllIlIII.add(llllllllllllIllllIlIIIlIlllIIllI);
                "".length();
            }
            ++llllllllllllIllllIlIIIlIlllIIlll;
        }
        llllllllllllIllllIlIIIlIlllIlIIl.data = new byte[func_180737_a(Integer.bitCount(llllllllllllIllllIlIIIlIlllIlIIl.dataSize), llllllllllllIllllIlIIIlIlllIllII, llllllllllllIllllIlIIIlIllIllllI)];
        int llllllllllllIllllIlIIIlIlllIIlIl = S21PacketChunkData.lIllllIllIIIll[0];
        char llllllllllllIllllIlIIIlIllIlIllI = (char)llllllllllllIllllIlIIIlIlllIlIII.iterator();
        "".length();
        if ("  ".length() < 0) {
            return null;
        }
        while (!lIIIIlIIllIIIllI(((Iterator)llllllllllllIllllIlIIIlIllIlIllI).hasNext() ? 1 : 0)) {
            final ExtendedBlockStorage llllllllllllIllllIlIIIlIlllIIlII = ((Iterator<ExtendedBlockStorage>)llllllllllllIllllIlIIIlIllIlIllI).next();
            final char[] llllllllllllIllllIlIIIlIlllIIIll = llllllllllllIllllIlIIIlIlllIIlII.getData();
            final boolean llllllllllllIllllIlIIIlIllIlIIIl;
            final int llllllllllllIllllIlIIIlIllIlIIlI = ((char[])(Object)(llllllllllllIllllIlIIIlIllIlIIIl = (boolean)(Object)llllllllllllIllllIlIIIlIlllIIIll)).length;
            String llllllllllllIllllIlIIIlIllIlIIll = (String)S21PacketChunkData.lIllllIllIIIll[0];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
            while (!lIIIIlIIllIIIlll((int)llllllllllllIllllIlIIIlIllIlIIll, llllllllllllIllllIlIIIlIllIlIIlI)) {
                final char llllllllllllIllllIlIIIlIlllIIIlI = llllllllllllIllllIlIIIlIllIlIIIl[llllllllllllIllllIlIIIlIllIlIIll];
                llllllllllllIllllIlIIIlIlllIlIIl.data[llllllllllllIllllIlIIIlIlllIIlIl++] = (byte)(llllllllllllIllllIlIIIlIlllIIIlI & S21PacketChunkData.lIllllIllIIIll[6]);
                llllllllllllIllllIlIIIlIlllIlIIl.data[llllllllllllIllllIlIIIlIlllIIlIl++] = (byte)(llllllllllllIllllIlIIIlIlllIIIlI >> S21PacketChunkData.lIllllIllIIIll[7] & S21PacketChunkData.lIllllIllIIIll[6]);
                ++llllllllllllIllllIlIIIlIllIlIIll;
            }
        }
        llllllllllllIllllIlIIIlIllIlIllI = (char)llllllllllllIllllIlIIIlIlllIlIII.iterator();
        "".length();
        if ((0x54 ^ 0x68 ^ (0xA ^ 0x32)) <= 0) {
            return null;
        }
        while (!lIIIIlIIllIIIllI(((Iterator)llllllllllllIllllIlIIIlIllIlIllI).hasNext() ? 1 : 0)) {
            final ExtendedBlockStorage llllllllllllIllllIlIIIlIlllIIIIl = ((Iterator<ExtendedBlockStorage>)llllllllllllIllllIlIIIlIllIlIllI).next();
            llllllllllllIllllIlIIIlIlllIIlIl = func_179757_a(llllllllllllIllllIlIIIlIlllIIIIl.getBlocklightArray().getData(), llllllllllllIllllIlIIIlIlllIlIIl.data, llllllllllllIllllIlIIIlIlllIIlIl);
        }
        if (lIIIIlIIllIIIlII(llllllllllllIllllIlIIIlIlllIllII ? 1 : 0)) {
            llllllllllllIllllIlIIIlIllIlIllI = (char)llllllllllllIllllIlIIIlIlllIlIII.iterator();
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
            while (!lIIIIlIIllIIIllI(((Iterator)llllllllllllIllllIlIIIlIllIlIllI).hasNext() ? 1 : 0)) {
                final ExtendedBlockStorage llllllllllllIllllIlIIIlIlllIIIII = ((Iterator<ExtendedBlockStorage>)llllllllllllIllllIlIIIlIllIlIllI).next();
                llllllllllllIllllIlIIIlIlllIIlIl = func_179757_a(llllllllllllIllllIlIIIlIlllIIIII.getSkylightArray().getData(), llllllllllllIllllIlIIIlIlllIlIIl.data, llllllllllllIllllIlIIIlIlllIIlIl);
            }
        }
        if (lIIIIlIIllIIIlII(llllllllllllIllllIlIIIlIllIllllI ? 1 : 0)) {
            func_179757_a(llllllllllllIllllIlIIIlIlllIlllI.getBiomeArray(), llllllllllllIllllIlIIIlIlllIlIIl.data, llllllllllllIllllIlIIIlIlllIIlIl);
            "".length();
        }
        return llllllllllllIllllIlIIIlIlllIlIIl;
    }
    
    public byte[] func_149272_d() {
        return this.extractedData.data;
    }
    
    protected static int func_180737_a(final int llllllllllllIllllIlIIIllIIIIIlII, final boolean llllllllllllIllllIlIIIllIIIIlIlI, final boolean llllllllllllIllllIlIIIllIIIIIIlI) {
        final int llllllllllllIllllIlIIIllIIIIlIII = llllllllllllIllllIlIIIllIIIIIlII * S21PacketChunkData.lIllllIllIIIll[3] * S21PacketChunkData.lIllllIllIIIll[4] * S21PacketChunkData.lIllllIllIIIll[4] * S21PacketChunkData.lIllllIllIIIll[4];
        final int llllllllllllIllllIlIIIllIIIIIlll = llllllllllllIllllIlIIIllIIIIIlII * S21PacketChunkData.lIllllIllIIIll[4] * S21PacketChunkData.lIllllIllIIIll[4] * S21PacketChunkData.lIllllIllIIIll[4] / S21PacketChunkData.lIllllIllIIIll[3];
        int n;
        if (lIIIIlIIllIIIlII(llllllllllllIllllIlIIIllIIIIlIlI ? 1 : 0)) {
            n = llllllllllllIllllIlIIIllIIIIIlII * S21PacketChunkData.lIllllIllIIIll[4] * S21PacketChunkData.lIllllIllIIIll[4] * S21PacketChunkData.lIllllIllIIIll[4] / S21PacketChunkData.lIllllIllIIIll[3];
            "".length();
            if ((0x31 ^ 0x35) == " ".length()) {
                return (0x74 ^ 0x7A) & ~(0x18 ^ 0x16);
            }
        }
        else {
            n = S21PacketChunkData.lIllllIllIIIll[0];
        }
        final int llllllllllllIllllIlIIIllIIIIIllI = n;
        int n2;
        if (lIIIIlIIllIIIlII(llllllllllllIllllIlIIIllIIIIIIlI ? 1 : 0)) {
            n2 = S21PacketChunkData.lIllllIllIIIll[5];
            "".length();
            if ((0x97 ^ 0x92) <= 0) {
                return (0xDA ^ 0x9A) & ~(0xB ^ 0x4B);
            }
        }
        else {
            n2 = S21PacketChunkData.lIllllIllIIIll[0];
        }
        final int llllllllllllIllllIlIIIllIIIIIlIl = n2;
        return llllllllllllIllllIlIIIllIIIIlIII + llllllllllllIllllIlIIIllIIIIIlll + llllllllllllIllllIlIIIllIIIIIllI + llllllllllllIllllIlIIIllIIIIIlIl;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllllIlIIIllIIlIIlII) throws IOException {
        this.chunkX = llllllllllllIllllIlIIIllIIlIIlII.readInt();
        this.chunkZ = llllllllllllIllllIlIIIllIIlIIlII.readInt();
        this.field_149279_g = llllllllllllIllllIlIIIllIIlIIlII.readBoolean();
        this.extractedData = new Extracted();
        this.extractedData.dataSize = llllllllllllIllllIlIIIllIIlIIlII.readShort();
        this.extractedData.data = llllllllllllIllllIlIIIllIIlIIlII.readByteArray();
    }
    
    public static class Extracted
    {
        public /* synthetic */ byte[] data;
        public /* synthetic */ int dataSize;
    }
}
