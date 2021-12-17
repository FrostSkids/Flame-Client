// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S28PacketEffect implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int soundType;
    private /* synthetic */ int soundData;
    private /* synthetic */ boolean serverWide;
    private /* synthetic */ BlockPos soundPos;
    
    public BlockPos getSoundPos() {
        return this.soundPos;
    }
    
    public boolean isSoundServerwide() {
        return this.serverWide;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlIIlIlIIlllIllll) throws IOException {
        lllllllllllllIlIlIIlIlIIlllIllll.writeInt(this.soundType);
        "".length();
        lllllllllllllIlIlIIlIlIIlllIllll.writeBlockPos(this.soundPos);
        lllllllllllllIlIlIIlIlIIlllIllll.writeInt(this.soundData);
        "".length();
        lllllllllllllIlIlIIlIlIIlllIllll.writeBoolean(this.serverWide);
        "".length();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIlIIlIlIIlllIIlll) {
        lllllllllllllIlIlIIlIlIIlllIIlll.handleEffect(this);
    }
    
    public int getSoundData() {
        return this.soundData;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlIIlIlIIllllIlIl) throws IOException {
        this.soundType = lllllllllllllIlIlIIlIlIIllllIlIl.readInt();
        this.soundPos = lllllllllllllIlIlIIlIlIIllllIlIl.readBlockPos();
        this.soundData = lllllllllllllIlIlIIlIlIIllllIlIl.readInt();
        this.serverWide = lllllllllllllIlIlIIlIlIIllllIlIl.readBoolean();
    }
    
    public S28PacketEffect(final int lllllllllllllIlIlIIlIlIIllllllII, final BlockPos lllllllllllllIlIlIIlIlIIlllllIll, final int lllllllllllllIlIlIIlIlIIlllllIlI, final boolean lllllllllllllIlIlIIlIlIIlllllIIl) {
        this.soundType = lllllllllllllIlIlIIlIlIIllllllII;
        this.soundPos = lllllllllllllIlIlIIlIlIIlllllIll;
        this.soundData = lllllllllllllIlIlIIlIlIIlllllIlI;
        this.serverWide = lllllllllllllIlIlIIlIlIIlllllIIl;
    }
    
    public S28PacketEffect() {
    }
    
    public int getSoundType() {
        return this.soundType;
    }
}
