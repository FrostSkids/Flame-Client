// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import net.minecraft.entity.Entity;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S1BPacketEntityAttach implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ int[] llIIlIlllIIlII;
    private /* synthetic */ int vehicleEntityId;
    private /* synthetic */ int leash;
    private /* synthetic */ int entityId;
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIIIlIIlIIIlIlllI) {
        llllllllllllIlllIIIlIIlIIIlIlllI.handleEntityAttach(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIIIlIIlIIIlllIII) throws IOException {
        this.entityId = llllllllllllIlllIIIlIIlIIIlllIII.readInt();
        this.vehicleEntityId = llllllllllllIlllIIIlIIlIIIlllIII.readInt();
        this.leash = llllllllllllIlllIIIlIIlIIIlllIII.readUnsignedByte();
    }
    
    public S1BPacketEntityAttach(final int llllllllllllIlllIIIlIIlIIlIIIlII, final Entity llllllllllllIlllIIIlIIlIIlIIIIll, final Entity llllllllllllIlllIIIlIIlIIIlllllI) {
        this.leash = llllllllllllIlllIIIlIIlIIlIIIlII;
        this.entityId = llllllllllllIlllIIIlIIlIIlIIIIll.getEntityId();
        int entityId;
        if (lIIIllIllllIIIlI(llllllllllllIlllIIIlIIlIIIlllllI)) {
            entityId = llllllllllllIlllIIIlIIlIIIlllllI.getEntityId();
            "".length();
            if ("   ".length() <= -" ".length()) {
                throw null;
            }
        }
        else {
            entityId = S1BPacketEntityAttach.llIIlIlllIIlII[0];
        }
        this.vehicleEntityId = entityId;
    }
    
    public int getVehicleEntityId() {
        return this.vehicleEntityId;
    }
    
    public S1BPacketEntityAttach() {
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    static {
        lIIIllIllllIIIIl();
    }
    
    private static void lIIIllIllllIIIIl() {
        (llIIlIlllIIlII = new int[1])[0] = -" ".length();
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIIIlIIlIIIllIIlI) throws IOException {
        llllllllllllIlllIIIlIIlIIIllIIlI.writeInt(this.entityId);
        "".length();
        llllllllllllIlllIIIlIIlIIIllIIlI.writeInt(this.vehicleEntityId);
        "".length();
        llllllllllllIlllIIIlIIlIIIllIIlI.writeByte(this.leash);
        "".length();
    }
    
    public int getLeash() {
        return this.leash;
    }
    
    private static boolean lIIIllIllllIIIlI(final Object llllllllllllIlllIIIlIIlIIIIlllIl) {
        return llllllllllllIlllIIIlIIlIIIIlllIl != null;
    }
}
