// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.item.EntityXPOrb;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S11PacketSpawnExperienceOrb implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int posY;
    private /* synthetic */ int posX;
    private /* synthetic */ int xpValue;
    private /* synthetic */ int posZ;
    private /* synthetic */ int entityID;
    
    public int getEntityID() {
        return this.entityID;
    }
    
    public int getXPValue() {
        return this.xpValue;
    }
    
    public int getZ() {
        return this.posZ;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIllIlIlllIlIlllI) throws IOException {
        llllllllllllIlllIllIlIlllIlIlllI.writeVarIntToBuffer(this.entityID);
        llllllllllllIlllIllIlIlllIlIlllI.writeInt(this.posX);
        "".length();
        llllllllllllIlllIllIlIlllIlIlllI.writeInt(this.posY);
        "".length();
        llllllllllllIlllIllIlIlllIlIlllI.writeInt(this.posZ);
        "".length();
        llllllllllllIlllIllIlIlllIlIlllI.writeShort(this.xpValue);
        "".length();
    }
    
    public int getY() {
        return this.posY;
    }
    
    public S11PacketSpawnExperienceOrb() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIllIlIlllIlIlIII) {
        llllllllllllIlllIllIlIlllIlIlIII.handleSpawnExperienceOrb(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIllIlIlllIllIllI) throws IOException {
        this.entityID = llllllllllllIlllIllIlIlllIllIllI.readVarIntFromBuffer();
        this.posX = llllllllllllIlllIllIlIlllIllIllI.readInt();
        this.posY = llllllllllllIlllIllIlIlllIllIllI.readInt();
        this.posZ = llllllllllllIlllIllIlIlllIllIllI.readInt();
        this.xpValue = llllllllllllIlllIllIlIlllIllIllI.readShort();
    }
    
    public S11PacketSpawnExperienceOrb(final EntityXPOrb llllllllllllIlllIllIlIlllIllllII) {
        this.entityID = llllllllllllIlllIllIlIlllIllllII.getEntityId();
        this.posX = MathHelper.floor_double(llllllllllllIlllIllIlIlllIllllII.posX * 32.0);
        this.posY = MathHelper.floor_double(llllllllllllIlllIllIlIlllIllllII.posY * 32.0);
        this.posZ = MathHelper.floor_double(llllllllllllIlllIllIlIlllIllllII.posZ * 32.0);
        this.xpValue = llllllllllllIlllIllIlIlllIllllII.getXpValue();
    }
    
    public int getX() {
        return this.posX;
    }
}
