// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C03PacketPlayer implements Packet<INetHandlerPlayServer>
{
    protected /* synthetic */ double x;
    private static final /* synthetic */ int[] lIIIIlllIIlIII;
    protected /* synthetic */ float pitch;
    protected /* synthetic */ boolean moving;
    protected /* synthetic */ float yaw;
    protected /* synthetic */ double z;
    protected /* synthetic */ double y;
    protected /* synthetic */ boolean onGround;
    protected /* synthetic */ boolean rotating;
    
    public C03PacketPlayer() {
    }
    
    public boolean isOnGround() {
        return this.onGround;
    }
    
    private static boolean lIllllIIlIIIIlI(final int lllllllllllllIlIIlIIIIIllIllllII) {
        return lllllllllllllIlIIlIIIIIllIllllII != 0;
    }
    
    public boolean isMoving() {
        return this.moving;
    }
    
    public float getYaw() {
        return this.yaw;
    }
    
    public void setMoving(final boolean lllllllllllllIlIIlIIIIIlllIIIlII) {
        this.moving = lllllllllllllIlIIlIIIIIlllIIIlII;
    }
    
    public boolean getRotating() {
        return this.rotating;
    }
    
    static {
        lIllllIIlIIIIIl();
    }
    
    public double getPositionZ() {
        return this.z;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIIlIIIIIllllIllII) {
        lllllllllllllIlIIlIIIIIllllIllII.processPlayer(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIlIIIIIllllIIIII) throws IOException {
        int llllllllllllIlIllIlIlIlIIIllIIll;
        if (lIllllIIlIIIIlI(this.onGround ? 1 : 0)) {
            llllllllllllIlIllIlIlIlIIIllIIll = C03PacketPlayer.lIIIIlllIIlIII[0];
            "".length();
            if ((0xB5 ^ 0xC3 ^ (0x1C ^ 0x6E)) != (0x78 ^ 0x35 ^ (0x88 ^ 0xC1))) {
                return;
            }
        }
        else {
            llllllllllllIlIllIlIlIlIIIllIIll = C03PacketPlayer.lIIIIlllIIlIII[1];
        }
        lllllllllllllIlIIlIIIIIllllIIIII.writeByte(llllllllllllIlIllIlIlIlIIIllIIll);
        "".length();
    }
    
    public double getPositionY() {
        return this.y;
    }
    
    private static void lIllllIIlIIIIIl() {
        (lIIIIlllIIlIII = new int[2])[0] = " ".length();
        C03PacketPlayer.lIIIIlllIIlIII[1] = ((0x87 ^ 0xBE ^ (0x9B ^ 0x83)) & (0x77 ^ 0x34 ^ (0xFC ^ 0x9E) ^ -" ".length()));
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIlIIIIIllllIIllI) throws IOException {
        int onGround;
        if (lIllllIIlIIIIlI(lllllllllllllIlIIlIIIIIllllIIllI.readUnsignedByte())) {
            onGround = C03PacketPlayer.lIIIIlllIIlIII[0];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            onGround = C03PacketPlayer.lIIIIlllIIlIII[1];
        }
        this.onGround = (onGround != 0);
    }
    
    public float getPitch() {
        return this.pitch;
    }
    
    public C03PacketPlayer(final boolean lllllllllllllIlIIlIIIIIlllllIIlI) {
        this.onGround = lllllllllllllIlIIlIIIIIlllllIIlI;
    }
    
    public double getPositionX() {
        return this.x;
    }
    
    public static class C05PacketPlayerLook extends C03PacketPlayer
    {
        private static final /* synthetic */ int[] lIlIIlIlIlIlII;
        
        static {
            lllIIllIIIllIIl();
        }
        
        public C05PacketPlayerLook(final float lllllllllllllIIIllIllIlIlIlIIIIl, final float lllllllllllllIIIllIllIlIlIlIIlII, final boolean lllllllllllllIIIllIllIlIlIlIIIll) {
            this.yaw = lllllllllllllIIIllIllIlIlIlIIIIl;
            this.pitch = lllllllllllllIIIllIllIlIlIlIIlII;
            this.onGround = lllllllllllllIIIllIllIlIlIlIIIll;
            this.rotating = (C05PacketPlayerLook.lIlIIlIlIlIlII[0] != 0);
        }
        
        private static void lllIIllIIIllIIl() {
            (lIlIIlIlIlIlII = new int[1])[0] = " ".length();
        }
        
        @Override
        public void readPacketData(final PacketBuffer lllllllllllllIIIllIllIlIlIIllIll) throws IOException {
            this.yaw = lllllllllllllIIIllIllIlIlIIllIll.readFloat();
            this.pitch = lllllllllllllIIIllIllIlIlIIllIll.readFloat();
            super.readPacketData(lllllllllllllIIIllIllIlIlIIllIll);
        }
        
        public C05PacketPlayerLook() {
            this.rotating = (C05PacketPlayerLook.lIlIIlIlIlIlII[0] != 0);
        }
        
        @Override
        public void writePacketData(final PacketBuffer lllllllllllllIIIllIllIlIlIIlIlIl) throws IOException {
            lllllllllllllIIIllIllIlIlIIlIlIl.writeFloat(this.yaw);
            "".length();
            lllllllllllllIIIllIllIlIlIIlIlIl.writeFloat(this.pitch);
            "".length();
            super.writePacketData(lllllllllllllIIIllIllIlIlIIlIlIl);
        }
    }
    
    public static class C06PacketPlayerPosLook extends C03PacketPlayer
    {
        private static final /* synthetic */ int[] lIIIllIIIlllII;
        
        @Override
        public void readPacketData(final PacketBuffer lllllllllllllIlIIIIIllIIlIlIlIlI) throws IOException {
            this.x = lllllllllllllIlIIIIIllIIlIlIlIlI.readDouble();
            this.y = lllllllllllllIlIIIIIllIIlIlIlIlI.readDouble();
            this.z = lllllllllllllIlIIIIIllIIlIlIlIlI.readDouble();
            this.yaw = lllllllllllllIlIIIIIllIIlIlIlIlI.readFloat();
            this.pitch = lllllllllllllIlIIIIIllIIlIlIlIlI.readFloat();
            super.readPacketData(lllllllllllllIlIIIIIllIIlIlIlIlI);
        }
        
        public C06PacketPlayerPosLook(final double lllllllllllllIlIIIIIllIIlIllllII, final double lllllllllllllIlIIIIIllIIlIlllIll, final double lllllllllllllIlIIIIIllIIlIlllIlI, final float lllllllllllllIlIIIIIllIIlIllIIlI, final float lllllllllllllIlIIIIIllIIlIllIIIl, final boolean lllllllllllllIlIIIIIllIIlIllIlll) {
            this.x = lllllllllllllIlIIIIIllIIlIllllII;
            this.y = lllllllllllllIlIIIIIllIIlIlllIll;
            this.z = lllllllllllllIlIIIIIllIIlIlllIlI;
            this.yaw = lllllllllllllIlIIIIIllIIlIllIIlI;
            this.pitch = lllllllllllllIlIIIIIllIIlIllIIIl;
            this.onGround = lllllllllllllIlIIIIIllIIlIllIlll;
            this.rotating = (C06PacketPlayerPosLook.lIIIllIIIlllII[0] != 0);
            this.moving = (C06PacketPlayerPosLook.lIIIllIIIlllII[0] != 0);
        }
        
        private static void llIIIIllIIIllIl() {
            (lIIIllIIIlllII = new int[1])[0] = " ".length();
        }
        
        public C06PacketPlayerPosLook() {
            this.moving = (C06PacketPlayerPosLook.lIIIllIIIlllII[0] != 0);
            this.rotating = (C06PacketPlayerPosLook.lIIIllIIIlllII[0] != 0);
        }
        
        static {
            llIIIIllIIIllIl();
        }
        
        @Override
        public void writePacketData(final PacketBuffer lllllllllllllIlIIIIIllIIlIlIIllI) throws IOException {
            lllllllllllllIlIIIIIllIIlIlIIllI.writeDouble(this.x);
            "".length();
            lllllllllllllIlIIIIIllIIlIlIIllI.writeDouble(this.y);
            "".length();
            lllllllllllllIlIIIIIllIIlIlIIllI.writeDouble(this.z);
            "".length();
            lllllllllllllIlIIIIIllIIlIlIIllI.writeFloat(this.yaw);
            "".length();
            lllllllllllllIlIIIIIllIIlIlIIllI.writeFloat(this.pitch);
            "".length();
            super.writePacketData(lllllllllllllIlIIIIIllIIlIlIIllI);
        }
    }
    
    public static class C04PacketPlayerPosition extends C03PacketPlayer
    {
        private static final /* synthetic */ int[] lIIIllllIIllll;
        
        @Override
        public void writePacketData(final PacketBuffer lllllllllllllIIllllIlIIIIIlIIlll) throws IOException {
            lllllllllllllIIllllIlIIIIIlIIlll.writeDouble(this.x);
            "".length();
            lllllllllllllIIllllIlIIIIIlIIlll.writeDouble(this.y);
            "".length();
            lllllllllllllIIllllIlIIIIIlIIlll.writeDouble(this.z);
            "".length();
            super.writePacketData(lllllllllllllIIllllIlIIIIIlIIlll);
        }
        
        public C04PacketPlayerPosition(final double lllllllllllllIIllllIlIIIIIllIllI, final double lllllllllllllIIllllIlIIIIIlllIlI, final double lllllllllllllIIllllIlIIIIIllIlII, final boolean lllllllllllllIIllllIlIIIIIlllIII) {
            this.x = lllllllllllllIIllllIlIIIIIllIllI;
            this.y = lllllllllllllIIllllIlIIIIIlllIlI;
            this.z = lllllllllllllIIllllIlIIIIIllIlII;
            this.onGround = lllllllllllllIIllllIlIIIIIlllIII;
            this.moving = (C04PacketPlayerPosition.lIIIllllIIllll[0] != 0);
        }
        
        public C04PacketPlayerPosition() {
            this.moving = (C04PacketPlayerPosition.lIIIllllIIllll[0] != 0);
        }
        
        @Override
        public void readPacketData(final PacketBuffer lllllllllllllIIllllIlIIIIIlIllll) throws IOException {
            this.x = lllllllllllllIIllllIlIIIIIlIllll.readDouble();
            this.y = lllllllllllllIIllllIlIIIIIlIllll.readDouble();
            this.z = lllllllllllllIIllllIlIIIIIlIllll.readDouble();
            super.readPacketData(lllllllllllllIIllllIlIIIIIlIllll);
        }
        
        static {
            llIIIllllIllllI();
        }
        
        private static void llIIIllllIllllI() {
            (lIIIllllIIllll = new int[1])[0] = " ".length();
        }
    }
}
