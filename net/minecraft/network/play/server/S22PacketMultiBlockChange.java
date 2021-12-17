// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import net.minecraft.network.INetHandler;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.block.state.IBlockState;
import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S22PacketMultiBlockChange implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ ChunkCoordIntPair chunkPosCoord;
    private static final /* synthetic */ int[] llIIIlIllIIllI;
    private /* synthetic */ BlockUpdateData[] changedBlocks;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIlIlIllIIIIIIlll) throws IOException {
        llllllllllllIlllIlIlIllIIIIIIlll.writeInt(this.chunkPosCoord.chunkXPos);
        "".length();
        llllllllllllIlllIlIlIllIIIIIIlll.writeInt(this.chunkPosCoord.chunkZPos);
        "".length();
        llllllllllllIlllIlIlIllIIIIIIlll.writeVarIntToBuffer(this.changedBlocks.length);
        final byte llllllllllllIlllIlIlIllIIIIIIIll;
        final char llllllllllllIlllIlIlIllIIIIIIlII = (char)((BlockUpdateData[])(Object)(llllllllllllIlllIlIlIllIIIIIIIll = (byte)(Object)this.changedBlocks)).length;
        byte llllllllllllIlllIlIlIllIIIIIIlIl = (byte)S22PacketMultiBlockChange.llIIIlIllIIllI[0];
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!lIIIlIIllIIlllIl(llllllllllllIlllIlIlIllIIIIIIlIl, llllllllllllIlllIlIlIllIIIIIIlII)) {
            final BlockUpdateData llllllllllllIlllIlIlIllIIIIIlIIl = llllllllllllIlllIlIlIllIIIIIIIll[llllllllllllIlllIlIlIllIIIIIIlIl];
            llllllllllllIlllIlIlIllIIIIIIlll.writeShort(llllllllllllIlllIlIlIllIIIIIlIIl.func_180089_b());
            "".length();
            llllllllllllIlllIlIlIllIIIIIIlll.writeVarIntToBuffer(Block.BLOCK_STATE_IDS.get(llllllllllllIlllIlIlIllIIIIIlIIl.getBlockState()));
            ++llllllllllllIlllIlIlIllIIIIIIlIl;
        }
    }
    
    public BlockUpdateData[] getChangedBlocks() {
        return this.changedBlocks;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIlIlIllIIIIlIllI) throws IOException {
        this.chunkPosCoord = new ChunkCoordIntPair(llllllllllllIlllIlIlIllIIIIlIllI.readInt(), llllllllllllIlllIlIlIllIIIIlIllI.readInt());
        this.changedBlocks = new BlockUpdateData[llllllllllllIlllIlIlIllIIIIlIllI.readVarIntFromBuffer()];
        int llllllllllllIlllIlIlIllIIIIlIlIl = S22PacketMultiBlockChange.llIIIlIllIIllI[0];
        "".length();
        if ("  ".length() <= " ".length()) {
            return;
        }
        while (!lIIIlIIllIIlllIl(llllllllllllIlllIlIlIllIIIIlIlIl, this.changedBlocks.length)) {
            this.changedBlocks[llllllllllllIlllIlIlIllIIIIlIlIl] = new BlockUpdateData(llllllllllllIlllIlIlIllIIIIlIllI.readShort(), Block.BLOCK_STATE_IDS.getByValue(llllllllllllIlllIlIlIllIIIIlIllI.readVarIntFromBuffer()));
            ++llllllllllllIlllIlIlIllIIIIlIlIl;
        }
    }
    
    private static void lIIIlIIllIIlllII() {
        (llIIIlIllIIllI = new int[1])[0] = ((0x79 ^ 0x5A) & ~(0xAD ^ 0x8E));
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIlIlIlIlllllllll) {
        llllllllllllIlllIlIlIlIlllllllll.handleMultiBlockChange(this);
    }
    
    public S22PacketMultiBlockChange(final int llllllllllllIlllIlIlIllIIIIllllI, final short[] llllllllllllIlllIlIlIllIIIlIIIlI, final Chunk llllllllllllIlllIlIlIllIIIIlllII) {
        this.chunkPosCoord = new ChunkCoordIntPair(llllllllllllIlllIlIlIllIIIIlllII.xPosition, llllllllllllIlllIlIlIllIIIIlllII.zPosition);
        this.changedBlocks = new BlockUpdateData[llllllllllllIlllIlIlIllIIIIllllI];
        int llllllllllllIlllIlIlIllIIIlIIIII = S22PacketMultiBlockChange.llIIIlIllIIllI[0];
        "".length();
        if ("   ".length() > (155 + 74 - 90 + 50 ^ 170 + 57 - 154 + 112)) {
            throw null;
        }
        while (!lIIIlIIllIIlllIl(llllllllllllIlllIlIlIllIIIlIIIII, this.changedBlocks.length)) {
            this.changedBlocks[llllllllllllIlllIlIlIllIIIlIIIII] = new BlockUpdateData(llllllllllllIlllIlIlIllIIIlIIIlI[llllllllllllIlllIlIlIllIIIlIIIII], llllllllllllIlllIlIlIllIIIIlllII);
            ++llllllllllllIlllIlIlIllIIIlIIIII;
        }
    }
    
    static {
        lIIIlIIllIIlllII();
    }
    
    private static boolean lIIIlIIllIIlllIl(final int llllllllllllIlllIlIlIlIlllllIIIl, final int llllllllllllIlllIlIlIlIlllllIIII) {
        return llllllllllllIlllIlIlIlIlllllIIIl >= llllllllllllIlllIlIlIlIlllllIIII;
    }
    
    public S22PacketMultiBlockChange() {
    }
    
    public class BlockUpdateData
    {
        private static final /* synthetic */ int[] llIIllIlIlllIl;
        private final /* synthetic */ IBlockState blockState;
        private final /* synthetic */ short chunkPosCrammed;
        
        public BlockUpdateData(final short llllllllllllIlllIIIIIIIIllIIIIII, final IBlockState llllllllllllIlllIIIIIIIIllIIIIll) {
            this.chunkPosCrammed = llllllllllllIlllIIIIIIIIllIIIIII;
            this.blockState = llllllllllllIlllIIIIIIIIllIIIIll;
        }
        
        public IBlockState getBlockState() {
            return this.blockState;
        }
        
        private static void lIIIlllIllllIlII() {
            (llIIllIlIlllIl = new int[4])[0] = (0x3B ^ 0x37);
            BlockUpdateData.llIIllIlIlllIl[1] = (55 + 127 - 100 + 86 ^ 37 + 47 + 49 + 34);
            BlockUpdateData.llIIllIlIlllIl[2] = 164 + 146 - 276 + 221;
            BlockUpdateData.llIIllIlIlllIl[3] = (0x96 ^ 0x9E);
        }
        
        static {
            lIIIlllIllllIlII();
        }
        
        public BlockPos getPos() {
            return new BlockPos(S22PacketMultiBlockChange.this.chunkPosCoord.getBlock(this.chunkPosCrammed >> BlockUpdateData.llIIllIlIlllIl[0] & BlockUpdateData.llIIllIlIlllIl[1], this.chunkPosCrammed & BlockUpdateData.llIIllIlIlllIl[2], this.chunkPosCrammed >> BlockUpdateData.llIIllIlIlllIl[3] & BlockUpdateData.llIIllIlIlllIl[1]));
        }
        
        public short func_180089_b() {
            return this.chunkPosCrammed;
        }
        
        public BlockUpdateData(final short llllllllllllIlllIIIIIIIIlIllIlIl, final Chunk llllllllllllIlllIIIIIIIIlIlllIII) {
            this.chunkPosCrammed = llllllllllllIlllIIIIIIIIlIllIlIl;
            this.blockState = llllllllllllIlllIIIIIIIIlIlllIII.getBlockState(this.getPos());
        }
    }
}
