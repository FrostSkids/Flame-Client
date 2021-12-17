// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S3APacketTabComplete implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ String[] matches;
    private static final /* synthetic */ int[] llIIllIllllIll;
    
    public S3APacketTabComplete(final String[] llllllllllllIllIllllllIIlIlIlllI) {
        this.matches = llllllllllllIllIllllllIIlIlIlllI;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllllllIIlIlIIlll) throws IOException {
        this.matches = new String[llllllllllllIllIllllllIIlIlIIlll.readVarIntFromBuffer()];
        int llllllllllllIllIllllllIIlIlIIllI = S3APacketTabComplete.llIIllIllllIll[0];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lIIIllllIIllllII(llllllllllllIllIllllllIIlIlIIllI, this.matches.length)) {
            this.matches[llllllllllllIllIllllllIIlIlIIllI] = llllllllllllIllIllllllIIlIlIIlll.readStringFromBuffer(S3APacketTabComplete.llIIllIllllIll[1]);
            ++llllllllllllIllIllllllIIlIlIIllI;
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllllllIIlIIIlllI) {
        llllllllllllIllIllllllIIlIIIlllI.handleTabComplete(this);
    }
    
    public S3APacketTabComplete() {
    }
    
    public String[] func_149630_c() {
        return this.matches;
    }
    
    static {
        lIIIllllIIlllIll();
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllllllIIlIIllIll) throws IOException {
        llllllllllllIllIllllllIIlIIllIll.writeVarIntToBuffer(this.matches.length);
        final char llllllllllllIllIllllllIIlIIlIlII;
        final byte llllllllllllIllIllllllIIlIIlIlIl = (byte)((String[])(Object)(llllllllllllIllIllllllIIlIIlIlII = (char)(Object)this.matches)).length;
        Exception llllllllllllIllIllllllIIlIIlIllI = (Exception)S3APacketTabComplete.llIIllIllllIll[0];
        "".length();
        if ((0xA8 ^ 0xAC) <= ((0x15 ^ 0x2) & ~(0x10 ^ 0x7))) {
            return;
        }
        while (!lIIIllllIIllllII((int)llllllllllllIllIllllllIIlIIlIllI, llllllllllllIllIllllllIIlIIlIlIl)) {
            final String llllllllllllIllIllllllIIlIIllIlI = llllllllllllIllIllllllIIlIIlIlII[llllllllllllIllIllllllIIlIIlIllI];
            llllllllllllIllIllllllIIlIIllIll.writeString(llllllllllllIllIllllllIIlIIllIlI);
            "".length();
            ++llllllllllllIllIllllllIIlIIlIllI;
        }
    }
    
    private static void lIIIllllIIlllIll() {
        (llIIllIllllIll = new int[2])[0] = ((0x7E ^ 0x28) & ~(0xEB ^ 0xBD));
        S3APacketTabComplete.llIIllIllllIll[1] = (-" ".length() & (-1 & 0x7FFF));
    }
    
    private static boolean lIIIllllIIllllII(final int llllllllllllIllIllllllIIlIIIIlII, final int llllllllllllIllIllllllIIlIIIIIll) {
        return llllllllllllIllIllllllIIlIIIIlII >= llllllllllllIllIllllllIIlIIIIIll;
    }
}
