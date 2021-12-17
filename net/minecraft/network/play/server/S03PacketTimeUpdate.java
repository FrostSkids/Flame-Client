// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S03PacketTimeUpdate implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ long worldTime;
    private /* synthetic */ long totalWorldTime;
    
    private static boolean lIIllllllllIIIlI(final int llllllllllllIlIllllIIlIlIIlIlIIl) {
        return llllllllllllIlIllllIIlIlIIlIlIIl == 0;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllllIIlIlIlIIIIIl) throws IOException {
        this.totalWorldTime = llllllllllllIlIllllIIlIlIlIIIIIl.readLong();
        this.worldTime = llllllllllllIlIllllIIlIlIlIIIIIl.readLong();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIllllIIlIlIIllIlIl) {
        llllllllllllIlIllllIIlIlIIllIlIl.handleTimeUpdate(this);
    }
    
    public S03PacketTimeUpdate(final long llllllllllllIlIllllIIlIlIlIIllIl, final long llllllllllllIlIllllIIlIlIlIIllII, final boolean llllllllllllIlIllllIIlIlIlIIIlll) {
        this.totalWorldTime = llllllllllllIlIllllIIlIlIlIIllIl;
        this.worldTime = llllllllllllIlIllllIIlIlIlIIllII;
        if (lIIllllllllIIIlI(llllllllllllIlIllllIIlIlIlIIIlll ? 1 : 0)) {
            this.worldTime = -this.worldTime;
            if (lIIllllllllIIIlI(lIIllllllllIIIIl(this.worldTime, 0L))) {
                this.worldTime = -1L;
            }
        }
    }
    
    public S03PacketTimeUpdate() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllllIIlIlIIlllIll) throws IOException {
        llllllllllllIlIllllIIlIlIIlllIll.writeLong(this.totalWorldTime);
        "".length();
        llllllllllllIlIllllIIlIlIIlllIll.writeLong(this.worldTime);
        "".length();
    }
    
    public long getWorldTime() {
        return this.worldTime;
    }
    
    public long getTotalWorldTime() {
        return this.totalWorldTime;
    }
    
    private static int lIIllllllllIIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
}
