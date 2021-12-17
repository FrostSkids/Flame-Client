// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.util.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S24PacketBlockAction implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ Block block;
    private static final /* synthetic */ int[] lIIlllIIIlIIIl;
    private /* synthetic */ int instrument;
    private /* synthetic */ int pitch;
    private /* synthetic */ BlockPos blockPosition;
    
    private static void llIllIlIlIllIIl() {
        (lIIlllIIIlIIIl = new int[1])[0] = (0xFFFFAFFF & 0x5FFF);
    }
    
    public Block getBlockType() {
        return this.block;
    }
    
    public int getData1() {
        return this.instrument;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIlIlIIIlllIlIlIlII) {
        lllllllllllllIIlIlIIIlllIlIlIlII.handleBlockAction(this);
    }
    
    static {
        llIllIlIlIllIIl();
    }
    
    public int getData2() {
        return this.pitch;
    }
    
    public S24PacketBlockAction() {
    }
    
    public S24PacketBlockAction(final BlockPos lllllllllllllIIlIlIIIlllIllIlllI, final Block lllllllllllllIIlIlIIIlllIllIlIII, final int lllllllllllllIIlIlIIIlllIllIIlll, final int lllllllllllllIIlIlIIIlllIllIIllI) {
        this.blockPosition = lllllllllllllIIlIlIIIlllIllIlllI;
        this.instrument = lllllllllllllIIlIlIIIlllIllIIlll;
        this.pitch = lllllllllllllIIlIlIIIlllIllIIllI;
        this.block = lllllllllllllIIlIlIIIlllIllIlIII;
    }
    
    public BlockPos getBlockPosition() {
        return this.blockPosition;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlIlIIIlllIllIIIII) throws IOException {
        this.blockPosition = lllllllllllllIIlIlIIIlllIllIIIII.readBlockPos();
        this.instrument = lllllllllllllIIlIlIIIlllIllIIIII.readUnsignedByte();
        this.pitch = lllllllllllllIIlIlIIIlllIllIIIII.readUnsignedByte();
        this.block = Block.getBlockById(lllllllllllllIIlIlIIIlllIllIIIII.readVarIntFromBuffer() & S24PacketBlockAction.lIIlllIIIlIIIl[0]);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlIlIIIlllIlIllIlI) throws IOException {
        lllllllllllllIIlIlIIIlllIlIllIlI.writeBlockPos(this.blockPosition);
        lllllllllllllIIlIlIIIlllIlIllIlI.writeByte(this.instrument);
        "".length();
        lllllllllllllIIlIlIIIlllIlIllIlI.writeByte(this.pitch);
        "".length();
        lllllllllllllIIlIlIIIlllIlIllIlI.writeVarIntToBuffer(Block.getIdFromBlock(this.block) & S24PacketBlockAction.lIIlllIIIlIIIl[0]);
    }
}
