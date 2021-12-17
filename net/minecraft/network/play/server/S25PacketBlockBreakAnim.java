// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S25PacketBlockBreakAnim implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ BlockPos position;
    private /* synthetic */ int breakerId;
    private /* synthetic */ int progress;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIlIlIIlIlIIllllII) throws IOException {
        llllllllllllIllIlIlIIlIlIIllllII.writeVarIntToBuffer(this.breakerId);
        llllllllllllIllIlIlIIlIlIIllllII.writeBlockPos(this.position);
        llllllllllllIllIlIlIIlIlIIllllII.writeByte(this.progress);
        "".length();
    }
    
    public BlockPos getPosition() {
        return this.position;
    }
    
    public int getProgress() {
        return this.progress;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIlIlIIlIlIIllIllI) {
        llllllllllllIllIlIlIIlIlIIllIllI.handleBlockBreakAnim(this);
    }
    
    public S25PacketBlockBreakAnim() {
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIlIlIIlIlIlIIIIII) throws IOException {
        this.breakerId = llllllllllllIllIlIlIIlIlIlIIIIII.readVarIntFromBuffer();
        this.position = llllllllllllIllIlIlIIlIlIlIIIIII.readBlockPos();
        this.progress = llllllllllllIllIlIlIIlIlIlIIIIII.readUnsignedByte();
    }
    
    public int getBreakerId() {
        return this.breakerId;
    }
    
    public S25PacketBlockBreakAnim(final int llllllllllllIllIlIlIIlIlIlIIlIII, final BlockPos llllllllllllIllIlIlIIlIlIlIIIlll, final int llllllllllllIllIlIlIIlIlIlIIIllI) {
        this.breakerId = llllllllllllIllIlIlIIlIlIlIIlIII;
        this.position = llllllllllllIllIlIlIIlIlIlIIIlll;
        this.progress = llllllllllllIllIlIlIIlIlIlIIIllI;
    }
}
