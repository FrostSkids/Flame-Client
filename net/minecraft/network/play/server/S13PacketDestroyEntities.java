// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S13PacketDestroyEntities implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int[] entityIDs;
    private static final /* synthetic */ int[] lIllIIIllIIlll;
    
    private static boolean lllllIIIlIIllIl(final int lllllllllllllIIIIIlIllllIlIIIlII, final int lllllllllllllIIIIIlIllllIlIIIIll) {
        return lllllllllllllIIIIIlIllllIlIIIlII >= lllllllllllllIIIIIlIllllIlIIIIll;
    }
    
    private static void lllllIIIlIIllII() {
        (lIllIIIllIIlll = new int[1])[0] = ((0xF1 ^ 0x90) & ~(0x13 ^ 0x72));
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIIlIllllIlIllIII) throws IOException {
        lllllllllllllIIIIIlIllllIlIllIII.writeVarIntToBuffer(this.entityIDs.length);
        int lllllllllllllIIIIIlIllllIlIlIlll = S13PacketDestroyEntities.lIllIIIllIIlll[0];
        "".length();
        if (("  ".length() & ("  ".length() ^ -" ".length())) > 0) {
            return;
        }
        while (!lllllIIIlIIllIl(lllllllllllllIIIIIlIllllIlIlIlll, this.entityIDs.length)) {
            lllllllllllllIIIIIlIllllIlIllIII.writeVarIntToBuffer(this.entityIDs[lllllllllllllIIIIIlIllllIlIlIlll]);
            ++lllllllllllllIIIIIlIllllIlIlIlll;
        }
    }
    
    public S13PacketDestroyEntities() {
    }
    
    public S13PacketDestroyEntities(final int... lllllllllllllIIIIIlIllllIllIlIII) {
        this.entityIDs = lllllllllllllIIIIIlIllllIllIlIII;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIIlIllllIlIllllI) throws IOException {
        this.entityIDs = new int[lllllllllllllIIIIIlIllllIlIllllI.readVarIntFromBuffer()];
        int lllllllllllllIIIIIlIllllIllIIIII = S13PacketDestroyEntities.lIllIIIllIIlll[0];
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!lllllIIIlIIllIl(lllllllllllllIIIIIlIllllIllIIIII, this.entityIDs.length)) {
            this.entityIDs[lllllllllllllIIIIIlIllllIllIIIII] = lllllllllllllIIIIIlIllllIlIllllI.readVarIntFromBuffer();
            ++lllllllllllllIIIIIlIllllIllIIIII;
        }
    }
    
    public int[] getEntityIDs() {
        return this.entityIDs;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIIIlIllllIlIlIIII) {
        lllllllllllllIIIIIlIllllIlIlIIII.handleDestroyEntities(this);
    }
    
    static {
        lllllIIIlIIllII();
    }
}
