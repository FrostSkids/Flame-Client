// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.entity.Entity;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S12PacketEntityVelocity implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int motionY;
    private /* synthetic */ int motionZ;
    private /* synthetic */ int motionX;
    private /* synthetic */ int entityID;
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIlIIlllllIlIIlIl) throws IOException {
        lllllllllllllIlIIlIIlllllIlIIlIl.writeVarIntToBuffer(this.entityID);
        lllllllllllllIlIIlIIlllllIlIIlIl.writeShort(this.motionX);
        "".length();
        lllllllllllllIlIIlIIlllllIlIIlIl.writeShort(this.motionY);
        "".length();
        lllllllllllllIlIIlIIlllllIlIIlIl.writeShort(this.motionZ);
        "".length();
    }
    
    public int getMotionX() {
        return this.motionX;
    }
    
    private static int lIlllIlIlllllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public int getMotionZ() {
        return this.motionZ;
    }
    
    public S12PacketEntityVelocity(final int lllllllllllllIlIIlIIlllllIlllIll, double lllllllllllllIlIIlIIlllllIllIlII, double lllllllllllllIlIIlIIlllllIllIIll, double lllllllllllllIlIIlIIlllllIllIIlI) {
        this.entityID = lllllllllllllIlIIlIIlllllIlllIll;
        final double lllllllllllllIlIIlIIlllllIllIlll = 3.9;
        if (lIlllIllIIIIIII(lIlllIlIllllllI(lllllllllllllIlIIlIIlllllIllIlII, -lllllllllllllIlIIlIIlllllIllIlll))) {
            lllllllllllllIlIIlIIlllllIllIlII = -lllllllllllllIlIIlIIlllllIllIlll;
        }
        if (lIlllIllIIIIIII(lIlllIlIllllllI(lllllllllllllIlIIlIIlllllIllIIll, -lllllllllllllIlIIlIIlllllIllIlll))) {
            lllllllllllllIlIIlIIlllllIllIIll = -lllllllllllllIlIIlIIlllllIllIlll;
        }
        if (lIlllIllIIIIIII(lIlllIlIllllllI(lllllllllllllIlIIlIIlllllIllIIlI, -lllllllllllllIlIIlIIlllllIllIlll))) {
            lllllllllllllIlIIlIIlllllIllIIlI = -lllllllllllllIlIIlIIlllllIllIlll;
        }
        if (lIlllIllIIIIIIl(lIlllIlIlllllll(lllllllllllllIlIIlIIlllllIllIlII, lllllllllllllIlIIlIIlllllIllIlll))) {
            lllllllllllllIlIIlIIlllllIllIlII = lllllllllllllIlIIlIIlllllIllIlll;
        }
        if (lIlllIllIIIIIIl(lIlllIlIlllllll(lllllllllllllIlIIlIIlllllIllIIll, lllllllllllllIlIIlIIlllllIllIlll))) {
            lllllllllllllIlIIlIIlllllIllIIll = lllllllllllllIlIIlIIlllllIllIlll;
        }
        if (lIlllIllIIIIIIl(lIlllIlIlllllll(lllllllllllllIlIIlIIlllllIllIIlI, lllllllllllllIlIIlIIlllllIllIlll))) {
            lllllllllllllIlIIlIIlllllIllIIlI = lllllllllllllIlIIlIIlllllIllIlll;
        }
        this.motionX = (int)(lllllllllllllIlIIlIIlllllIllIlII * 8000.0);
        this.motionY = (int)(lllllllllllllIlIIlIIlllllIllIIll * 8000.0);
        this.motionZ = (int)(lllllllllllllIlIIlIIlllllIllIIlI * 8000.0);
    }
    
    private static int lIlllIlIllllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public int getMotionY() {
        return this.motionY;
    }
    
    private static boolean lIlllIllIIIIIII(final int lllllllllllllIlIIlIIlllllIIIllIl) {
        return lllllllllllllIlIIlIIlllllIIIllIl < 0;
    }
    
    public S12PacketEntityVelocity() {
    }
    
    public int getEntityID() {
        return this.entityID;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIlIIlllllIlIllIl) throws IOException {
        this.entityID = lllllllllllllIlIIlIIlllllIlIllIl.readVarIntFromBuffer();
        this.motionX = lllllllllllllIlIIlIIlllllIlIllIl.readShort();
        this.motionY = lllllllllllllIlIIlIIlllllIlIllIl.readShort();
        this.motionZ = lllllllllllllIlIIlIIlllllIlIllIl.readShort();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIIlIIlllllIlIIIIl) {
        lllllllllllllIlIIlIIlllllIlIIIIl.handleEntityVelocity(this);
    }
    
    public S12PacketEntityVelocity(final Entity lllllllllllllIlIIlIIllllllIIIlIl) {
        this(lllllllllllllIlIIlIIllllllIIIlIl.getEntityId(), lllllllllllllIlIIlIIllllllIIIlIl.motionX, lllllllllllllIlIIlIIllllllIIIlIl.motionY, lllllllllllllIlIIlIIllllllIIIlIl.motionZ);
    }
    
    private static boolean lIlllIllIIIIIIl(final int lllllllllllllIlIIlIIlllllIIIlIll) {
        return lllllllllllllIlIIlIIlllllIIIlIll > 0;
    }
}
