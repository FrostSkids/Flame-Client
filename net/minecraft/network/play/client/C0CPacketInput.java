// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C0CPacketInput implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ float strafeSpeed;
    private /* synthetic */ boolean jumping;
    private /* synthetic */ float forwardSpeed;
    private /* synthetic */ boolean sneaking;
    private static final /* synthetic */ int[] lIIlIIIlIIIIII;
    
    static {
        llIIlIlIIlIIlII();
    }
    
    public C0CPacketInput(final float lllllllllllllIIlllIlIlIIlIlllIII, final float lllllllllllllIIlllIlIlIIlIllIlll, final boolean lllllllllllllIIlllIlIlIIlIlllIll, final boolean lllllllllllllIIlllIlIlIIlIlllIlI) {
        this.strafeSpeed = lllllllllllllIIlllIlIlIIlIlllIII;
        this.forwardSpeed = lllllllllllllIIlllIlIlIIlIllIlll;
        this.jumping = lllllllllllllIIlllIlIlIIlIlllIll;
        this.sneaking = lllllllllllllIIlllIlIlIIlIlllIlI;
    }
    
    private static void llIIlIlIIlIIlII() {
        (lIIlIIIlIIIIII = new int[3])[0] = " ".length();
        C0CPacketInput.lIIlIIIlIIIIII[1] = ((0x42 ^ 0x70 ^ (0x4E ^ 0x39)) & (201 + 8 - 192 + 196 ^ 135 + 119 - 141 + 31 ^ -" ".length()));
        C0CPacketInput.lIIlIIIlIIIIII[2] = "  ".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlllIlIlIIlIlIllIl) throws IOException {
        this.strafeSpeed = lllllllllllllIIlllIlIlIIlIlIllIl.readFloat();
        this.forwardSpeed = lllllllllllllIIlllIlIlIIlIlIllIl.readFloat();
        final byte lllllllllllllIIlllIlIlIIlIlIllll = lllllllllllllIIlllIlIlIIlIlIllIl.readByte();
        int jumping;
        if (llIIlIlIIlIIlIl(lllllllllllllIIlllIlIlIIlIlIllll & C0CPacketInput.lIIlIIIlIIIIII[0])) {
            jumping = C0CPacketInput.lIIlIIIlIIIIII[0];
            "".length();
            if ("  ".length() == (0x23 ^ 0x1A ^ (0x57 ^ 0x6A))) {
                return;
            }
        }
        else {
            jumping = C0CPacketInput.lIIlIIIlIIIIII[1];
        }
        this.jumping = (jumping != 0);
        int sneaking;
        if (llIIlIlIIlIIlIl(lllllllllllllIIlllIlIlIIlIlIllll & C0CPacketInput.lIIlIIIlIIIIII[2])) {
            sneaking = C0CPacketInput.lIIlIIIlIIIIII[0];
            "".length();
            if (((106 + 1 - 22 + 43 ^ 130 + 95 - 149 + 96) & (107 + 50 - 32 + 20 ^ 86 + 88 - 142 + 157 ^ -" ".length())) < 0) {
                return;
            }
        }
        else {
            sneaking = C0CPacketInput.lIIlIIIlIIIIII[1];
        }
        this.sneaking = (sneaking != 0);
    }
    
    public boolean isJumping() {
        return this.jumping;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIIlllIlIlIIlIIlllIl) {
        lllllllllllllIIlllIlIlIIlIIlllIl.processInput(this);
    }
    
    public float getForwardSpeed() {
        return this.forwardSpeed;
    }
    
    public C0CPacketInput() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlllIlIlIIlIlIIlII) throws IOException {
        lllllllllllllIIlllIlIlIIlIlIIlII.writeFloat(this.strafeSpeed);
        "".length();
        lllllllllllllIIlllIlIlIIlIlIIlII.writeFloat(this.forwardSpeed);
        "".length();
        byte lllllllllllllIIlllIlIlIIlIlIIllI = (byte)C0CPacketInput.lIIlIIIlIIIIII[1];
        if (llIIlIlIIlIIllI(this.jumping ? 1 : 0)) {
            lllllllllllllIIlllIlIlIIlIlIIllI |= (byte)C0CPacketInput.lIIlIIIlIIIIII[0];
        }
        if (llIIlIlIIlIIllI(this.sneaking ? 1 : 0)) {
            lllllllllllllIIlllIlIlIIlIlIIllI |= (byte)C0CPacketInput.lIIlIIIlIIIIII[2];
        }
        lllllllllllllIIlllIlIlIIlIlIIlII.writeByte(lllllllllllllIIlllIlIlIIlIlIIllI);
        "".length();
    }
    
    private static boolean llIIlIlIIlIIlIl(final int lllllllllllllIIlllIlIlIIlIIIlIIl) {
        return lllllllllllllIIlllIlIlIIlIIIlIIl > 0;
    }
    
    private static boolean llIIlIlIIlIIllI(final int lllllllllllllIIlllIlIlIIlIIIlIll) {
        return lllllllllllllIIlllIlIlIIlIIIlIll != 0;
    }
    
    public float getStrafeSpeed() {
        return this.strafeSpeed;
    }
    
    public boolean isSneaking() {
        return this.sneaking;
    }
}
