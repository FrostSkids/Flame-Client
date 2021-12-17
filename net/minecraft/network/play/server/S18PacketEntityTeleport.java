// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S18PacketEntityTeleport implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int posX;
    private /* synthetic */ int posZ;
    private /* synthetic */ boolean onGround;
    private /* synthetic */ byte pitch;
    private /* synthetic */ int posY;
    private /* synthetic */ byte yaw;
    private /* synthetic */ int entityId;
    
    public int getY() {
        return this.posY;
    }
    
    public int getZ() {
        return this.posZ;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIllIlIllIlIllllI) throws IOException {
        this.entityId = lllllllllllllIlIIllIlIllIlIllllI.readVarIntFromBuffer();
        this.posX = lllllllllllllIlIIllIlIllIlIllllI.readInt();
        this.posY = lllllllllllllIlIIllIlIllIlIllllI.readInt();
        this.posZ = lllllllllllllIlIIllIlIllIlIllllI.readInt();
        this.yaw = lllllllllllllIlIIllIlIllIlIllllI.readByte();
        this.pitch = lllllllllllllIlIIllIlIllIlIllllI.readByte();
        this.onGround = lllllllllllllIlIIllIlIllIlIllllI.readBoolean();
    }
    
    public S18PacketEntityTeleport(final int lllllllllllllIlIIllIlIllIllIlIlI, final int lllllllllllllIlIIllIlIllIlllIIIl, final int lllllllllllllIlIIllIlIllIllIlIII, final int lllllllllllllIlIIllIlIllIllIllll, final byte lllllllllllllIlIIllIlIllIllIlllI, final byte lllllllllllllIlIIllIlIllIllIllIl, final boolean lllllllllllllIlIIllIlIllIllIIlII) {
        this.entityId = lllllllllllllIlIIllIlIllIllIlIlI;
        this.posX = lllllllllllllIlIIllIlIllIlllIIIl;
        this.posY = lllllllllllllIlIIllIlIllIllIlIII;
        this.posZ = lllllllllllllIlIIllIlIllIllIllll;
        this.yaw = lllllllllllllIlIIllIlIllIllIlllI;
        this.pitch = lllllllllllllIlIIllIlIllIllIllIl;
        this.onGround = lllllllllllllIlIIllIlIllIllIIlII;
    }
    
    public byte getYaw() {
        return this.yaw;
    }
    
    public byte getPitch() {
        return this.pitch;
    }
    
    public int getX() {
        return this.posX;
    }
    
    public S18PacketEntityTeleport() {
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIIllIlIllIlIlIIlI) {
        lllllllllllllIlIIllIlIllIlIlIIlI.handleEntityTeleport(this);
    }
    
    public S18PacketEntityTeleport(final Entity lllllllllllllIlIIllIlIllIlllllII) {
        this.entityId = lllllllllllllIlIIllIlIllIlllllII.getEntityId();
        this.posX = MathHelper.floor_double(lllllllllllllIlIIllIlIllIlllllII.posX * 32.0);
        this.posY = MathHelper.floor_double(lllllllllllllIlIIllIlIllIlllllII.posY * 32.0);
        this.posZ = MathHelper.floor_double(lllllllllllllIlIIllIlIllIlllllII.posZ * 32.0);
        this.yaw = (byte)(lllllllllllllIlIIllIlIllIlllllII.rotationYaw * 256.0f / 360.0f);
        this.pitch = (byte)(lllllllllllllIlIIllIlIllIlllllII.rotationPitch * 256.0f / 360.0f);
        this.onGround = lllllllllllllIlIIllIlIllIlllllII.onGround;
    }
    
    public boolean getOnGround() {
        return this.onGround;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIllIlIllIlIllIlI) throws IOException {
        lllllllllllllIlIIllIlIllIlIllIlI.writeVarIntToBuffer(this.entityId);
        lllllllllllllIlIIllIlIllIlIllIlI.writeInt(this.posX);
        "".length();
        lllllllllllllIlIIllIlIllIlIllIlI.writeInt(this.posY);
        "".length();
        lllllllllllllIlIIllIlIllIlIllIlI.writeInt(this.posZ);
        "".length();
        lllllllllllllIlIIllIlIllIlIllIlI.writeByte(this.yaw);
        "".length();
        lllllllllllllIlIIllIlIllIlIllIlI.writeByte(this.pitch);
        "".length();
        lllllllllllllIlIIllIlIllIlIllIlI.writeBoolean(this.onGround);
        "".length();
    }
}
