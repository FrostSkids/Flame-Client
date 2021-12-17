// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S2APacketParticles implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ float zOffset;
    private static final /* synthetic */ int[] llIIIIllIlIlII;
    private /* synthetic */ float xOffset;
    private /* synthetic */ boolean longDistance;
    private /* synthetic */ float zCoord;
    private /* synthetic */ float particleSpeed;
    private /* synthetic */ int[] particleArguments;
    private /* synthetic */ EnumParticleTypes particleType;
    private /* synthetic */ float yOffset;
    private /* synthetic */ int particleCount;
    private /* synthetic */ float xCoord;
    private /* synthetic */ float yCoord;
    
    private static boolean lIIIlIIIIIllIllI(final Object llllllllllllIlllIllIlIIlllIlllIl) {
        return llllllllllllIlllIllIlIIlllIlllIl == null;
    }
    
    public int[] getParticleArgs() {
        return this.particleArguments;
    }
    
    public float getYOffset() {
        return this.yOffset;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIllIlIlIIIlIIIII) throws IOException {
        this.particleType = EnumParticleTypes.getParticleFromId(llllllllllllIlllIllIlIlIIIlIIIII.readInt());
        if (lIIIlIIIIIllIllI(this.particleType)) {
            this.particleType = EnumParticleTypes.BARRIER;
        }
        this.longDistance = llllllllllllIlllIllIlIlIIIlIIIII.readBoolean();
        this.xCoord = llllllllllllIlllIllIlIlIIIlIIIII.readFloat();
        this.yCoord = llllllllllllIlllIllIlIlIIIlIIIII.readFloat();
        this.zCoord = llllllllllllIlllIllIlIlIIIlIIIII.readFloat();
        this.xOffset = llllllllllllIlllIllIlIlIIIlIIIII.readFloat();
        this.yOffset = llllllllllllIlllIllIlIlIIIlIIIII.readFloat();
        this.zOffset = llllllllllllIlllIllIlIlIIIlIIIII.readFloat();
        this.particleSpeed = llllllllllllIlllIllIlIlIIIlIIIII.readFloat();
        this.particleCount = llllllllllllIlllIllIlIlIIIlIIIII.readInt();
        final int llllllllllllIlllIllIlIlIIIIlllll = this.particleType.getArgumentCount();
        this.particleArguments = new int[llllllllllllIlllIllIlIlIIIIlllll];
        int llllllllllllIlllIllIlIlIIIIllllI = S2APacketParticles.llIIIIllIlIlII[0];
        "".length();
        if ((0xB3 ^ 0xB7) == " ".length()) {
            return;
        }
        while (!lIIIlIIIIIllIlll(llllllllllllIlllIllIlIlIIIIllllI, llllllllllllIlllIllIlIlIIIIlllll)) {
            this.particleArguments[llllllllllllIlllIllIlIlIIIIllllI] = llllllllllllIlllIllIlIlIIIlIIIII.readVarIntFromBuffer();
            ++llllllllllllIlllIllIlIlIIIIllllI;
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIllIlIlIIIIlIIII) throws IOException {
        llllllllllllIlllIllIlIlIIIIlIIII.writeInt(this.particleType.getParticleID());
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeBoolean(this.longDistance);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeFloat(this.xCoord);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeFloat(this.yCoord);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeFloat(this.zCoord);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeFloat(this.xOffset);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeFloat(this.yOffset);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeFloat(this.zOffset);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeFloat(this.particleSpeed);
        "".length();
        llllllllllllIlllIllIlIlIIIIlIIII.writeInt(this.particleCount);
        "".length();
        final int llllllllllllIlllIllIlIlIIIIlIIll = this.particleType.getArgumentCount();
        int llllllllllllIlllIllIlIlIIIIlIIlI = S2APacketParticles.llIIIIllIlIlII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIlIIIIIllIlll(llllllllllllIlllIllIlIlIIIIlIIlI, llllllllllllIlllIllIlIlIIIIlIIll)) {
            llllllllllllIlllIllIlIlIIIIlIIII.writeVarIntToBuffer(this.particleArguments[llllllllllllIlllIllIlIlIIIIlIIlI]);
            ++llllllllllllIlllIllIlIlIIIIlIIlI;
        }
    }
    
    public S2APacketParticles() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIllIlIIllllIlIIl) {
        llllllllllllIlllIllIlIIllllIlIIl.handleParticles(this);
    }
    
    public double getXCoordinate() {
        return this.xCoord;
    }
    
    public EnumParticleTypes getParticleType() {
        return this.particleType;
    }
    
    public boolean isLongDistance() {
        return this.longDistance;
    }
    
    public float getZOffset() {
        return this.zOffset;
    }
    
    private static boolean lIIIlIIIIIllIlll(final int llllllllllllIlllIllIlIIllllIIIII, final int llllllllllllIlllIllIlIIlllIlllll) {
        return llllllllllllIlllIllIlIIllllIIIII >= llllllllllllIlllIllIlIIlllIlllll;
    }
    
    public float getXOffset() {
        return this.xOffset;
    }
    
    public S2APacketParticles(final EnumParticleTypes llllllllllllIlllIllIlIlIIIllIIII, final boolean llllllllllllIlllIllIlIlIIIlIllll, final float llllllllllllIlllIllIlIlIIIlllIlI, final float llllllllllllIlllIllIlIlIIIlllIIl, final float llllllllllllIlllIllIlIlIIIlllIII, final float llllllllllllIlllIllIlIlIIIlIlIll, final float llllllllllllIlllIllIlIlIIIllIllI, final float llllllllllllIlllIllIlIlIIIlIlIIl, final float llllllllllllIlllIllIlIlIIIlIlIII, final int llllllllllllIlllIllIlIlIIIllIIll, final int... llllllllllllIlllIllIlIlIIIllIIlI) {
        this.particleType = llllllllllllIlllIllIlIlIIIllIIII;
        this.longDistance = llllllllllllIlllIllIlIlIIIlIllll;
        this.xCoord = llllllllllllIlllIllIlIlIIIlllIlI;
        this.yCoord = llllllllllllIlllIllIlIlIIIlllIIl;
        this.zCoord = llllllllllllIlllIllIlIlIIIlllIII;
        this.xOffset = llllllllllllIlllIllIlIlIIIlIlIll;
        this.yOffset = llllllllllllIlllIllIlIlIIIllIllI;
        this.zOffset = llllllllllllIlllIllIlIlIIIlIlIIl;
        this.particleSpeed = llllllllllllIlllIllIlIlIIIlIlIII;
        this.particleCount = llllllllllllIlllIllIlIlIIIllIIll;
        this.particleArguments = llllllllllllIlllIllIlIlIIIllIIlI;
    }
    
    public double getYCoordinate() {
        return this.yCoord;
    }
    
    public float getParticleSpeed() {
        return this.particleSpeed;
    }
    
    private static void lIIIlIIIIIllIlIl() {
        (llIIIIllIlIlII = new int[1])[0] = ((0xB ^ 0x26) & ~(0xB5 ^ 0x98) & ~((0x5A ^ 0x78) & ~(0x37 ^ 0x15)));
    }
    
    public int getParticleCount() {
        return this.particleCount;
    }
    
    static {
        lIIIlIIIIIllIlIl();
    }
    
    public double getZCoordinate() {
        return this.zCoord;
    }
}
