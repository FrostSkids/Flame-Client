// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S2FPacketSetSlot implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int slot;
    private /* synthetic */ int windowId;
    private /* synthetic */ ItemStack item;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIIIIIIIIIlIIllll) throws IOException {
        llllllllllllIlllIIIIIIIIIlIIllll.writeByte(this.windowId);
        "".length();
        llllllllllllIlllIIIIIIIIIlIIllll.writeShort(this.slot);
        "".length();
        llllllllllllIlllIIIIIIIIIlIIllll.writeItemStackToBuffer(this.item);
    }
    
    private static boolean lIIIlllIlllllIIl(final Object llllllllllllIlllIIIIIIIIIIlllllI) {
        return llllllllllllIlllIIIIIIIIIIlllllI == null;
    }
    
    public ItemStack func_149174_e() {
        return this.item;
    }
    
    public int func_149173_d() {
        return this.slot;
    }
    
    public int func_149175_c() {
        return this.windowId;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIIIIIIIIIlIllIll) {
        llllllllllllIlllIIIIIIIIIlIllIll.handleSetSlot(this);
    }
    
    public S2FPacketSetSlot() {
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIIIIIIIIIlIlIIll) throws IOException {
        this.windowId = llllllllllllIlllIIIIIIIIIlIlIIll.readByte();
        this.slot = llllllllllllIlllIIIIIIIIIlIlIIll.readShort();
        this.item = llllllllllllIlllIIIIIIIIIlIlIIll.readItemStackFromBuffer();
    }
    
    public S2FPacketSetSlot(final int llllllllllllIlllIIIIIIIIIllIIlIl, final int llllllllllllIlllIIIIIIIIIllIIIII, final ItemStack llllllllllllIlllIIIIIIIIIllIIIll) {
        this.windowId = llllllllllllIlllIIIIIIIIIllIIlIl;
        this.slot = llllllllllllIlllIIIIIIIIIllIIIII;
        ItemStack copy;
        if (lIIIlllIlllllIIl(llllllllllllIlllIIIIIIIIIllIIIll)) {
            copy = null;
            "".length();
            if (" ".length() != " ".length()) {
                throw null;
            }
        }
        else {
            copy = llllllllllllIlllIIIIIIIIIllIIIll.copy();
        }
        this.item = copy;
    }
}
