// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S0APacketUseBed implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int playerID;
    private /* synthetic */ BlockPos bedPos;
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIllIIlIlIllIlI) throws IOException {
        this.playerID = llllllllllllIllIllIllIIlIlIllIlI.readVarIntFromBuffer();
        this.bedPos = llllllllllllIllIllIllIIlIlIllIlI.readBlockPos();
    }
    
    public S0APacketUseBed(final EntityPlayer llllllllllllIllIllIllIIlIllIIIlI, final BlockPos llllllllllllIllIllIllIIlIlIllllI) {
        this.playerID = llllllllllllIllIllIllIIlIllIIIlI.getEntityId();
        this.bedPos = llllllllllllIllIllIllIIlIlIllllI;
    }
    
    public EntityPlayer getPlayer(final World llllllllllllIllIllIllIIlIlIIIllI) {
        return (EntityPlayer)llllllllllllIllIllIllIIlIlIIIllI.getEntityByID(this.playerID);
    }
    
    public S0APacketUseBed() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllIllIIlIlIIlllI) {
        llllllllllllIllIllIllIIlIlIIlllI.handleUseBed(this);
    }
    
    public BlockPos getBedPosition() {
        return this.bedPos;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIllIIlIlIlIlII) throws IOException {
        llllllllllllIllIllIllIIlIlIlIlII.writeVarIntToBuffer(this.playerID);
        llllllllllllIllIllIllIIlIlIlIlII.writeBlockPos(this.bedPos);
    }
}
