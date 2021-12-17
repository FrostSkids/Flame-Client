// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C14PacketTabComplete implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ BlockPos targetBlock;
    private static final /* synthetic */ int[] lIllIlIllIllIl;
    private /* synthetic */ String message;
    
    public C14PacketTabComplete(final String llllllllllllIllllllllIlIllIlIIlI, final BlockPos llllllllllllIllllllllIlIllIlIlII) {
        this.message = llllllllllllIllllllllIlIllIlIIlI;
        this.targetBlock = llllllllllllIllllllllIlIllIlIlII;
    }
    
    private static boolean lllllllIIIIllll(final Object llllllllllllIllllllllIlIlIlIllIl) {
        return llllllllllllIllllllllIlIlIlIllIl != null;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllllllllIlIllIIIIII) throws IOException {
        llllllllllllIllllllllIlIllIIIIII.writeString(StringUtils.substring(this.message, C14PacketTabComplete.lIllIlIllIllIl[1], C14PacketTabComplete.lIllIlIllIllIl[0]));
        "".length();
        int n;
        if (lllllllIIIIllll(this.targetBlock)) {
            n = C14PacketTabComplete.lIllIlIllIllIl[2];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            n = C14PacketTabComplete.lIllIlIllIllIl[1];
        }
        final boolean llllllllllllIllllllllIlIllIIIIlI = n != 0;
        llllllllllllIllllllllIlIllIIIIII.writeBoolean(llllllllllllIllllllllIlIllIIIIlI);
        "".length();
        if (lllllllIIIIlllI(llllllllllllIllllllllIlIllIIIIlI ? 1 : 0)) {
            llllllllllllIllllllllIlIllIIIIII.writeBlockPos(this.targetBlock);
        }
    }
    
    public C14PacketTabComplete(final String llllllllllllIllllllllIlIllIlllII) {
        this(llllllllllllIllllllllIlIllIlllII, null);
    }
    
    public C14PacketTabComplete() {
    }
    
    private static void lllllllIIIIllIl() {
        (lIllIlIllIllIl = new int[3])[0] = (-" ".length() & (-1 & 0x7FFF));
        C14PacketTabComplete.lIllIlIllIllIl[1] = ("   ".length() & ("   ".length() ^ -" ".length()));
        C14PacketTabComplete.lIllIlIllIllIl[2] = " ".length();
    }
    
    static {
        lllllllIIIIllIl();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer llllllllllllIllllllllIlIlIlllIIl) {
        llllllllllllIllllllllIlIlIlllIIl.processTabComplete(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllllllllIlIllIIllII) throws IOException {
        this.message = llllllllllllIllllllllIlIllIIllII.readStringFromBuffer(C14PacketTabComplete.lIllIlIllIllIl[0]);
        final boolean llllllllllllIllllllllIlIllIIlIll = llllllllllllIllllllllIlIllIIllII.readBoolean();
        if (lllllllIIIIlllI(llllllllllllIllllllllIlIllIIlIll ? 1 : 0)) {
            this.targetBlock = llllllllllllIllllllllIlIllIIllII.readBlockPos();
        }
    }
    
    public BlockPos getTargetBlock() {
        return this.targetBlock;
    }
    
    private static boolean lllllllIIIIlllI(final int llllllllllllIllllllllIlIlIlIlIll) {
        return llllllllllllIllllllllIlIlIlIlIll != 0;
    }
}
