// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import net.minecraft.potion.PotionEffect;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S1EPacketRemoveEntityEffect implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityId;
    private /* synthetic */ int effectId;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIIllIIIIIlIlII) throws IOException {
        llllllllllllIllIllIIllIIIIIlIlII.writeVarIntToBuffer(this.entityId);
        llllllllllllIllIllIIllIIIIIlIlII.writeByte(this.effectId);
        "".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIIllIIIIIllIlI) throws IOException {
        this.entityId = llllllllllllIllIllIIllIIIIIllIlI.readVarIntFromBuffer();
        this.effectId = llllllllllllIllIllIIllIIIIIllIlI.readUnsignedByte();
    }
    
    public S1EPacketRemoveEntityEffect() {
    }
    
    public int getEffectId() {
        return this.effectId;
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    public S1EPacketRemoveEntityEffect(final int llllllllllllIllIllIIllIIIIlIIIIl, final PotionEffect llllllllllllIllIllIIllIIIIlIIIll) {
        this.entityId = llllllllllllIllIllIIllIIIIlIIIIl;
        this.effectId = llllllllllllIllIllIIllIIIIlIIIll.getPotionID();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllIIllIIIIIIlllI) {
        llllllllllllIllIllIIllIIIIIIlllI.handleRemoveEntityEffect(this);
    }
}
