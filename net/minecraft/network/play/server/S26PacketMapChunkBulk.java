// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.world.chunk.Chunk;
import java.util.List;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S26PacketMapChunkBulk implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ int[] llIllllIIIIIll;
    private /* synthetic */ int[] xPositions;
    private /* synthetic */ S21PacketChunkData.Extracted[] chunksData;
    private /* synthetic */ int[] zPositions;
    private /* synthetic */ boolean isOverworld;
    
    private static boolean lIIllIlIIlIIIIII(final int llllllllllllIllIIlIIIIIlIIlIIlII) {
        return llllllllllllIllIIlIIIIIlIIlIIlII != 0;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIIlIIIIIlIlIIlIIl) {
        llllllllllllIllIIlIIIIIlIlIIlIIl.handleMapChunkBulk(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIlIIIIIlIlIllIll) throws IOException {
        this.isOverworld = llllllllllllIllIIlIIIIIlIlIllIll.readBoolean();
        final int llllllllllllIllIIlIIIIIlIlIlllll = llllllllllllIllIIlIIIIIlIlIllIll.readVarIntFromBuffer();
        this.xPositions = new int[llllllllllllIllIIlIIIIIlIlIlllll];
        this.zPositions = new int[llllllllllllIllIIlIIIIIlIlIlllll];
        this.chunksData = new S21PacketChunkData.Extracted[llllllllllllIllIIlIIIIIlIlIlllll];
        int llllllllllllIllIIlIIIIIlIlIllllI = S26PacketMapChunkBulk.llIllllIIIIIll[0];
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIIllIlIIlIIIIIl(llllllllllllIllIIlIIIIIlIlIllllI, llllllllllllIllIIlIIIIIlIlIlllll)) {
            this.xPositions[llllllllllllIllIIlIIIIIlIlIllllI] = llllllllllllIllIIlIIIIIlIlIllIll.readInt();
            this.zPositions[llllllllllllIllIIlIIIIIlIlIllllI] = llllllllllllIllIIlIIIIIlIlIllIll.readInt();
            this.chunksData[llllllllllllIllIIlIIIIIlIlIllllI] = new S21PacketChunkData.Extracted();
            this.chunksData[llllllllllllIllIIlIIIIIlIlIllllI].dataSize = (llllllllllllIllIIlIIIIIlIlIllIll.readShort() & S26PacketMapChunkBulk.llIllllIIIIIll[2]);
            this.chunksData[llllllllllllIllIIlIIIIIlIlIllllI].data = new byte[S21PacketChunkData.func_180737_a(Integer.bitCount(this.chunksData[llllllllllllIllIIlIIIIIlIlIllllI].dataSize), this.isOverworld, (boolean)(S26PacketMapChunkBulk.llIllllIIIIIll[1] != 0))];
            ++llllllllllllIllIIlIIIIIlIlIllllI;
        }
        int llllllllllllIllIIlIIIIIlIlIlllIl = S26PacketMapChunkBulk.llIllllIIIIIll[0];
        "".length();
        if ("  ".length() < -" ".length()) {
            return;
        }
        while (!lIIllIlIIlIIIIIl(llllllllllllIllIIlIIIIIlIlIlllIl, llllllllllllIllIIlIIIIIlIlIlllll)) {
            llllllllllllIllIIlIIIIIlIlIllIll.readBytes(this.chunksData[llllllllllllIllIIlIIIIIlIlIlllIl].data);
            "".length();
            ++llllllllllllIllIIlIIIIIlIlIlllIl;
        }
    }
    
    public byte[] getChunkBytes(final int llllllllllllIllIIlIIIIIlIIllIlII) {
        return this.chunksData[llllllllllllIllIIlIIIIIlIIllIlII].data;
    }
    
    private static void lIIllIlIIIllllll() {
        (llIllllIIIIIll = new int[3])[0] = ((0xBD ^ 0x8B) & ~(0xB0 ^ 0x86));
        S26PacketMapChunkBulk.llIllllIIIIIll[1] = " ".length();
        S26PacketMapChunkBulk.llIllllIIIIIll[2] = (-1 & 0xFFFF);
    }
    
    public S26PacketMapChunkBulk() {
    }
    
    static {
        lIIllIlIIIllllll();
    }
    
    public int getChunkZ(final int llllllllllllIllIIlIIIIIlIIllllll) {
        return this.zPositions[llllllllllllIllIIlIIIIIlIIllllll];
    }
    
    public int getChunkX(final int llllllllllllIllIIlIIIIIlIlIIIlIl) {
        return this.xPositions[llllllllllllIllIIlIIIIIlIlIIIlIl];
    }
    
    public S26PacketMapChunkBulk(final List<Chunk> llllllllllllIllIIlIIIIIlIlllIIII) {
        final int llllllllllllIllIIlIIIIIlIllIllll = llllllllllllIllIIlIIIIIlIlllIIII.size();
        this.xPositions = new int[llllllllllllIllIIlIIIIIlIllIllll];
        this.zPositions = new int[llllllllllllIllIIlIIIIIlIllIllll];
        this.chunksData = new S21PacketChunkData.Extracted[llllllllllllIllIIlIIIIIlIllIllll];
        int isOverworld;
        if (lIIllIlIIlIIIIII(llllllllllllIllIIlIIIIIlIlllIIII.get(S26PacketMapChunkBulk.llIllllIIIIIll[0]).getWorld().provider.getHasNoSky() ? 1 : 0)) {
            isOverworld = S26PacketMapChunkBulk.llIllllIIIIIll[0];
            "".length();
            if (-"   ".length() >= 0) {
                throw null;
            }
        }
        else {
            isOverworld = S26PacketMapChunkBulk.llIllllIIIIIll[1];
        }
        this.isOverworld = (isOverworld != 0);
        int llllllllllllIllIIlIIIIIlIllIlllI = S26PacketMapChunkBulk.llIllllIIIIIll[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            throw null;
        }
        while (!lIIllIlIIlIIIIIl(llllllllllllIllIIlIIIIIlIllIlllI, llllllllllllIllIIlIIIIIlIllIllll)) {
            final Chunk llllllllllllIllIIlIIIIIlIllIllIl = llllllllllllIllIIlIIIIIlIlllIIII.get(llllllllllllIllIIlIIIIIlIllIlllI);
            final S21PacketChunkData.Extracted llllllllllllIllIIlIIIIIlIllIllII = S21PacketChunkData.func_179756_a(llllllllllllIllIIlIIIIIlIllIllIl, (boolean)(S26PacketMapChunkBulk.llIllllIIIIIll[1] != 0), this.isOverworld, S26PacketMapChunkBulk.llIllllIIIIIll[2]);
            this.xPositions[llllllllllllIllIIlIIIIIlIllIlllI] = llllllllllllIllIIlIIIIIlIllIllIl.xPosition;
            this.zPositions[llllllllllllIllIIlIIIIIlIllIlllI] = llllllllllllIllIIlIIIIIlIllIllIl.zPosition;
            this.chunksData[llllllllllllIllIIlIIIIIlIllIlllI] = llllllllllllIllIIlIIIIIlIllIllII;
            ++llllllllllllIllIIlIIIIIlIllIlllI;
        }
    }
    
    private static boolean lIIllIlIIlIIIIIl(final int llllllllllllIllIIlIIIIIlIIlIIlll, final int llllllllllllIllIIlIIIIIlIIlIIllI) {
        return llllllllllllIllIIlIIIIIlIIlIIlll >= llllllllllllIllIIlIIIIIlIIlIIllI;
    }
    
    public int getChunkSize(final int llllllllllllIllIIlIIIIIlIIlIlllI) {
        return this.chunksData[llllllllllllIllIIlIIIIIlIIlIlllI].dataSize;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIlIIIIIlIlIlIlII) throws IOException {
        llllllllllllIllIIlIIIIIlIlIlIlII.writeBoolean(this.isOverworld);
        "".length();
        llllllllllllIllIIlIIIIIlIlIlIlII.writeVarIntToBuffer(this.chunksData.length);
        int llllllllllllIllIIlIIIIIlIlIlIIll = S26PacketMapChunkBulk.llIllllIIIIIll[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIlIIlIIIIIl(llllllllllllIllIIlIIIIIlIlIlIIll, this.xPositions.length)) {
            llllllllllllIllIIlIIIIIlIlIlIlII.writeInt(this.xPositions[llllllllllllIllIIlIIIIIlIlIlIIll]);
            "".length();
            llllllllllllIllIIlIIIIIlIlIlIlII.writeInt(this.zPositions[llllllllllllIllIIlIIIIIlIlIlIIll]);
            "".length();
            llllllllllllIllIIlIIIIIlIlIlIlII.writeShort((short)(this.chunksData[llllllllllllIllIIlIIIIIlIlIlIIll].dataSize & S26PacketMapChunkBulk.llIllllIIIIIll[2]));
            "".length();
            ++llllllllllllIllIIlIIIIIlIlIlIIll;
        }
        int llllllllllllIllIIlIIIIIlIlIlIIlI = S26PacketMapChunkBulk.llIllllIIIIIll[0];
        "".length();
        if ("   ".length() >= (0x60 ^ 0x64)) {
            return;
        }
        while (!lIIllIlIIlIIIIIl(llllllllllllIllIIlIIIIIlIlIlIIlI, this.xPositions.length)) {
            llllllllllllIllIIlIIIIIlIlIlIlII.writeBytes(this.chunksData[llllllllllllIllIIlIIIIIlIlIlIIlI].data);
            "".length();
            ++llllllllllllIllIIlIIIIIlIlIlIIlI;
        }
    }
    
    public int getChunkCount() {
        return this.xPositions.length;
    }
}
