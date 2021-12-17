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

public class S36PacketSignEditorOpen implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ BlockPos signPosition;
    
    public S36PacketSignEditorOpen() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIllIlIlIIIIIIIIIIl) throws IOException {
        lllllllllllllIIllIlIlIIIIIIIIIIl.writeBlockPos(this.signPosition);
    }
    
    public S36PacketSignEditorOpen(final BlockPos lllllllllllllIIllIlIlIIIIIIlIIIl) {
        this.signPosition = lllllllllllllIIllIlIlIIIIIIlIIIl;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIllIlIlIIIIIIIllIl) {
        lllllllllllllIIllIlIlIIIIIIIllIl.handleSignEditorOpen(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIllIlIlIIIIIIIIlIl) throws IOException {
        this.signPosition = lllllllllllllIIllIlIlIIIIIIIIlIl.readBlockPos();
    }
    
    public BlockPos getSignPosition() {
        return this.signPosition;
    }
}
