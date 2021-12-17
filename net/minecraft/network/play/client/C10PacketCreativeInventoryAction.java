// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C10PacketCreativeInventoryAction implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ int slotId;
    private /* synthetic */ ItemStack stack;
    
    public C10PacketCreativeInventoryAction() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIIIIlIIIlllIIlIlIIl) {
        lllllllllllllIIIIlIIIlllIIlIlIIl.processCreativeInventoryAction(this);
    }
    
    public C10PacketCreativeInventoryAction(final int lllllllllllllIIIIlIIIlllIIllIIIl, final ItemStack lllllllllllllIIIIlIIIlllIIlIllIl) {
        this.slotId = lllllllllllllIIIIlIIIlllIIllIIIl;
        ItemStack copy;
        if (llllIllIIIlIIII(lllllllllllllIIIIlIIIlllIIlIllIl)) {
            copy = lllllllllllllIIIIlIIIlllIIlIllIl.copy();
            "".length();
            if (-" ".length() == "  ".length()) {
                throw null;
            }
        }
        else {
            copy = null;
        }
        this.stack = copy;
    }
    
    private static boolean llllIllIIIlIIII(final Object lllllllllllllIIIIlIIIlllIIIIllll) {
        return lllllllllllllIIIIlIIIlllIIIIllll != null;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIlIIIlllIIIllIll) throws IOException {
        lllllllllllllIIIIlIIIlllIIIllIll.writeShort(this.slotId);
        "".length();
        lllllllllllllIIIIlIIIlllIIIllIll.writeItemStackToBuffer(this.stack);
    }
    
    public ItemStack getStack() {
        return this.stack;
    }
    
    public int getSlotId() {
        return this.slotId;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIlIIIlllIIlIIIIl) throws IOException {
        this.slotId = lllllllllllllIIIIlIIIlllIIlIIIIl.readShort();
        this.stack = lllllllllllllIIIIlIIIlllIIlIIIIl.readItemStackFromBuffer();
    }
}
