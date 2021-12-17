// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.DataWatcher;
import java.util.List;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S1CPacketEntityMetadata implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityId;
    private /* synthetic */ List<DataWatcher.WatchableObject> field_149378_b;
    
    private static boolean lIlIlllIlIIIIIl(final int lllllllllllllIlIlIllIllIlIlIlIll) {
        return lllllllllllllIlIlIllIllIlIlIlIll != 0;
    }
    
    public S1CPacketEntityMetadata() {
    }
    
    public S1CPacketEntityMetadata(final int lllllllllllllIlIlIllIllIllIIlIll, final DataWatcher lllllllllllllIlIlIllIllIllIIlllI, final boolean lllllllllllllIlIlIllIllIllIIlIIl) {
        this.entityId = lllllllllllllIlIlIllIllIllIIlIll;
        if (lIlIlllIlIIIIIl(lllllllllllllIlIlIllIllIllIIlIIl ? 1 : 0)) {
            this.field_149378_b = lllllllllllllIlIlIllIllIllIIlllI.getAllWatched();
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            this.field_149378_b = lllllllllllllIlIlIllIllIllIIlllI.getChanged();
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIlIllIllIlIllIlll) {
        lllllllllllllIlIlIllIllIlIllIlll.handleEntityMetadata(this);
    }
    
    public List<DataWatcher.WatchableObject> func_149376_c() {
        return this.field_149378_b;
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlIllIllIlIllllll) throws IOException {
        lllllllllllllIlIlIllIllIlIllllll.writeVarIntToBuffer(this.entityId);
        DataWatcher.writeWatchedListToPacketBuffer(this.field_149378_b, lllllllllllllIlIlIllIllIlIllllll);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlIllIllIllIIIlIl) throws IOException {
        this.entityId = lllllllllllllIlIlIllIllIllIIIlIl.readVarIntFromBuffer();
        this.field_149378_b = DataWatcher.readWatchedListFromPacketBuffer(lllllllllllllIlIlIllIllIllIIIlIl);
    }
}
