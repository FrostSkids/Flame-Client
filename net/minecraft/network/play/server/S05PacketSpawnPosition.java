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

public class S05PacketSpawnPosition implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ BlockPos spawnBlockPos;
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIIIIIlllllllIIll) throws IOException {
        this.spawnBlockPos = llllllllllllIlllIIIIIlllllllIIll.readBlockPos();
    }
    
    public S05PacketSpawnPosition(final BlockPos llllllllllllIlllIIIIIlllllllIlll) {
        this.spawnBlockPos = llllllllllllIlllIIIIIlllllllIlll;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIIIIIllllllIllIl) throws IOException {
        llllllllllllIlllIIIIIllllllIllIl.writeBlockPos(this.spawnBlockPos);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIIIIIllllllIIlIl) {
        llllllllllllIlllIIIIIllllllIIlIl.handleSpawnPosition(this);
    }
    
    public S05PacketSpawnPosition() {
    }
    
    public BlockPos getSpawnPos() {
        return this.spawnBlockPos;
    }
}
