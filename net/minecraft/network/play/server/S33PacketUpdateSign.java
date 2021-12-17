// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S33PacketUpdateSign implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ int[] llIllIIIIIlIll;
    private /* synthetic */ World world;
    private /* synthetic */ BlockPos blockPos;
    private /* synthetic */ IChatComponent[] lines;
    
    public BlockPos getPos() {
        return this.blockPos;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIlIIIIllIlIlllIll) throws IOException {
        this.blockPos = llllllllllllIllIlIIIIllIlIlllIll.readBlockPos();
        this.lines = new IChatComponent[S33PacketUpdateSign.llIllIIIIIlIll[0]];
        int llllllllllllIllIlIIIIllIlIlllIlI = S33PacketUpdateSign.llIllIIIIIlIll[1];
        "".length();
        if ((0x6B ^ 0x6F) > (0x88 ^ 0x8C)) {
            return;
        }
        while (!lIIlIllIIIlllIlI(llllllllllllIllIlIIIIllIlIlllIlI, S33PacketUpdateSign.llIllIIIIIlIll[0])) {
            this.lines[llllllllllllIllIlIIIIllIlIlllIlI] = llllllllllllIllIlIIIIllIlIlllIll.readChatComponent();
            ++llllllllllllIllIlIIIIllIlIlllIlI;
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIlIIIIllIlIlIlIlI) {
        llllllllllllIllIlIIIIllIlIlIlIlI.handleUpdateSign(this);
    }
    
    private static boolean lIIlIllIIIlllIlI(final int llllllllllllIllIlIIIIllIlIIllIll, final int llllllllllllIllIlIIIIllIlIIllIlI) {
        return llllllllllllIllIlIIIIllIlIIllIll >= llllllllllllIllIlIIIIllIlIIllIlI;
    }
    
    public S33PacketUpdateSign() {
    }
    
    private static void lIIlIllIIIlllIIl() {
        (llIllIIIIIlIll = new int[5])[0] = (0x42 ^ 0x46);
        S33PacketUpdateSign.llIllIIIIIlIll[1] = ((0x96 ^ 0x9D ^ (0x32 ^ 0x29)) & (0xE3 ^ 0x9D ^ (0xD3 ^ 0xBD) ^ -" ".length()));
        S33PacketUpdateSign.llIllIIIIIlIll[2] = " ".length();
        S33PacketUpdateSign.llIllIIIIIlIll[3] = "  ".length();
        S33PacketUpdateSign.llIllIIIIIlIll[4] = "   ".length();
    }
    
    public S33PacketUpdateSign(final World llllllllllllIllIlIIIIllIllIIIllI, final BlockPos llllllllllllIllIlIIIIllIllIIIIIl, final IChatComponent[] llllllllllllIllIlIIIIllIllIIIIII) {
        this.world = llllllllllllIllIlIIIIllIllIIIllI;
        this.blockPos = llllllllllllIllIlIIIIllIllIIIIIl;
        final IChatComponent[] lines = new IChatComponent[S33PacketUpdateSign.llIllIIIIIlIll[0]];
        lines[S33PacketUpdateSign.llIllIIIIIlIll[1]] = llllllllllllIllIlIIIIllIllIIIIII[S33PacketUpdateSign.llIllIIIIIlIll[1]];
        lines[S33PacketUpdateSign.llIllIIIIIlIll[2]] = llllllllllllIllIlIIIIllIllIIIIII[S33PacketUpdateSign.llIllIIIIIlIll[2]];
        lines[S33PacketUpdateSign.llIllIIIIIlIll[3]] = llllllllllllIllIlIIIIllIllIIIIII[S33PacketUpdateSign.llIllIIIIIlIll[3]];
        lines[S33PacketUpdateSign.llIllIIIIIlIll[4]] = llllllllllllIllIlIIIIllIllIIIIII[S33PacketUpdateSign.llIllIIIIIlIll[4]];
        this.lines = lines;
    }
    
    public IChatComponent[] getLines() {
        return this.lines;
    }
    
    static {
        lIIlIllIIIlllIIl();
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIlIIIIllIlIllIIlI) throws IOException {
        llllllllllllIllIlIIIIllIlIllIIlI.writeBlockPos(this.blockPos);
        int llllllllllllIllIlIIIIllIlIllIIIl = S33PacketUpdateSign.llIllIIIIIlIll[1];
        "".length();
        if ((71 + 163 - 64 + 16 ^ 18 + 47 + 3 + 122) != (0xAD ^ 0x92 ^ (0x7A ^ 0x41))) {
            return;
        }
        while (!lIIlIllIIIlllIlI(llllllllllllIllIlIIIIllIlIllIIIl, S33PacketUpdateSign.llIllIIIIIlIll[0])) {
            llllllllllllIllIlIIIIllIlIllIIlI.writeChatComponent(this.lines[llllllllllllIllIlIIIIllIlIllIIIl]);
            ++llllllllllllIllIlIIIIllIlIllIIIl;
        }
    }
}
