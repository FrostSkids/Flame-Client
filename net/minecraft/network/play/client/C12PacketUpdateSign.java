// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C12PacketUpdateSign implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ IChatComponent[] lines;
    private /* synthetic */ BlockPos pos;
    private static final /* synthetic */ int[] lIIIlIIllIlIII;
    
    private static void lIllllllIlllIlI() {
        (lIIIlIIllIlIII = new int[6])[0] = (0x78 ^ 0x7C);
        C12PacketUpdateSign.lIIIlIIllIlIII[1] = (" ".length() & (" ".length() ^ -" ".length()));
        C12PacketUpdateSign.lIIIlIIllIlIII[2] = " ".length();
        C12PacketUpdateSign.lIIIlIIllIlIII[3] = "  ".length();
        C12PacketUpdateSign.lIIIlIIllIlIII[4] = "   ".length();
        C12PacketUpdateSign.lIIIlIIllIlIII[5] = (-(0xFFFFE7E7 & 0x3E7D) & (0xFFFFFFE4 & 0x27FF));
    }
    
    public C12PacketUpdateSign(final BlockPos lllllllllllllIlIIIlIlIIllIIlIIII, final IChatComponent[] lllllllllllllIlIIIlIlIIllIIIllll) {
        this.pos = lllllllllllllIlIIIlIlIIllIIlIIII;
        final IChatComponent[] lines = new IChatComponent[C12PacketUpdateSign.lIIIlIIllIlIII[0]];
        lines[C12PacketUpdateSign.lIIIlIIllIlIII[1]] = lllllllllllllIlIIIlIlIIllIIIllll[C12PacketUpdateSign.lIIIlIIllIlIII[1]];
        lines[C12PacketUpdateSign.lIIIlIIllIlIII[2]] = lllllllllllllIlIIIlIlIIllIIIllll[C12PacketUpdateSign.lIIIlIIllIlIII[2]];
        lines[C12PacketUpdateSign.lIIIlIIllIlIII[3]] = lllllllllllllIlIIIlIlIIllIIIllll[C12PacketUpdateSign.lIIIlIIllIlIII[3]];
        lines[C12PacketUpdateSign.lIIIlIIllIlIII[4]] = lllllllllllllIlIIIlIlIIllIIIllll[C12PacketUpdateSign.lIIIlIIllIlIII[4]];
        this.lines = lines;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIIIlIlIIlIllIlIII) {
        lllllllllllllIlIIIlIlIIlIllIlIII.processUpdateSign(this);
    }
    
    public BlockPos getPosition() {
        return this.pos;
    }
    
    private static boolean lIllllllIlllIll(final int lllllllllllllIlIIIlIlIIlIlIllIll, final int lllllllllllllIlIIIlIlIIlIlIllIlI) {
        return lllllllllllllIlIIIlIlIIlIlIllIll >= lllllllllllllIlIIIlIlIIlIlIllIlI;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIIlIlIIlIlllIllI) throws IOException {
        lllllllllllllIlIIIlIlIIlIlllIllI.writeBlockPos(this.pos);
        int lllllllllllllIlIIIlIlIIlIlllIlIl = C12PacketUpdateSign.lIIIlIIllIlIII[1];
        "".length();
        if ("  ".length() > (117 + 63 - 97 + 61 ^ 144 + 107 - 238 + 135)) {
            return;
        }
        while (!lIllllllIlllIll(lllllllllllllIlIIIlIlIIlIlllIlIl, C12PacketUpdateSign.lIIIlIIllIlIII[0])) {
            final IChatComponent lllllllllllllIlIIIlIlIIlIlllIlII = this.lines[lllllllllllllIlIIIlIlIIlIlllIlIl];
            final String lllllllllllllIlIIIlIlIIlIlllIIll = IChatComponent.Serializer.componentToJson(lllllllllllllIlIIIlIlIIlIlllIlII);
            lllllllllllllIlIIIlIlIIlIlllIllI.writeString(lllllllllllllIlIIIlIlIIlIlllIIll);
            "".length();
            ++lllllllllllllIlIIIlIlIIlIlllIlIl;
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIIlIlIIllIIIIlIl) throws IOException {
        this.pos = lllllllllllllIlIIIlIlIIllIIIIlIl.readBlockPos();
        this.lines = new IChatComponent[C12PacketUpdateSign.lIIIlIIllIlIII[0]];
        int lllllllllllllIlIIIlIlIIllIIIIlII = C12PacketUpdateSign.lIIIlIIllIlIII[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIllllllIlllIll(lllllllllllllIlIIIlIlIIllIIIIlII, C12PacketUpdateSign.lIIIlIIllIlIII[0])) {
            final String lllllllllllllIlIIIlIlIIllIIIIIll = lllllllllllllIlIIIlIlIIllIIIIlIl.readStringFromBuffer(C12PacketUpdateSign.lIIIlIIllIlIII[5]);
            final IChatComponent lllllllllllllIlIIIlIlIIllIIIIIlI = IChatComponent.Serializer.jsonToComponent(lllllllllllllIlIIIlIlIIllIIIIIll);
            this.lines[lllllllllllllIlIIIlIlIIllIIIIlII] = lllllllllllllIlIIIlIlIIllIIIIIlI;
            ++lllllllllllllIlIIIlIlIIllIIIIlII;
        }
    }
    
    static {
        lIllllllIlllIlI();
    }
    
    public C12PacketUpdateSign() {
    }
    
    public IChatComponent[] getLines() {
        return this.lines;
    }
}
