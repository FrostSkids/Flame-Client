// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S0DPacketCollectItem implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int collectedItemEntityId;
    private /* synthetic */ int entityId;
    
    public S0DPacketCollectItem(final int lllllllllllllIlIlIlIlIlIIIlIIlIl, final int lllllllllllllIlIlIlIlIlIIIlIIlII) {
        this.collectedItemEntityId = lllllllllllllIlIlIlIlIlIIIlIIlIl;
        this.entityId = lllllllllllllIlIlIlIlIlIIIlIIlII;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIlIlIlIlIIIIlIlII) {
        lllllllllllllIlIlIlIlIlIIIIlIlII.handleCollectItem(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlIlIlIlIIIIllllI) throws IOException {
        this.collectedItemEntityId = lllllllllllllIlIlIlIlIlIIIIllllI.readVarIntFromBuffer();
        this.entityId = lllllllllllllIlIlIlIlIlIIIIllllI.readVarIntFromBuffer();
    }
    
    public int getCollectedItemEntityID() {
        return this.collectedItemEntityId;
    }
    
    public S0DPacketCollectItem() {
    }
    
    public int getEntityID() {
        return this.entityId;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlIlIlIlIIIIllIII) throws IOException {
        lllllllllllllIlIlIlIlIlIIIIllIII.writeVarIntToBuffer(this.collectedItemEntityId);
        lllllllllllllIlIlIlIlIlIIIIllIII.writeVarIntToBuffer(this.entityId);
    }
}
