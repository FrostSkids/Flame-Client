// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S30PacketWindowItems implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int windowId;
    private static final /* synthetic */ int[] llIIlIlllllIll;
    private /* synthetic */ ItemStack[] itemStacks;
    
    private static boolean lIIIlllIIIIlllll(final int llllllllllllIlllIIIIlllIIIlIIIII, final int llllllllllllIlllIIIIlllIIIIlllll) {
        return llllllllllllIlllIIIIlllIIIlIIIII >= llllllllllllIlllIIIIlllIIIIlllll;
    }
    
    public S30PacketWindowItems(final int llllllllllllIlllIIIIlllIIlIlIIIl, final List<ItemStack> llllllllllllIlllIIIIlllIIlIlIIII) {
        this.windowId = llllllllllllIlllIIIIlllIIlIlIIIl;
        this.itemStacks = new ItemStack[llllllllllllIlllIIIIlllIIlIlIIII.size()];
        int llllllllllllIlllIIIIlllIIlIlIlII = S30PacketWindowItems.llIIlIlllllIll[0];
        "".length();
        if (-" ".length() > ((144 + 88 - 128 + 89 ^ 9 + 150 - 139 + 133) & (0xDC ^ 0xB2 ^ (0x63 ^ 0x55) ^ -" ".length()))) {
            throw null;
        }
        while (!lIIIlllIIIIlllll(llllllllllllIlllIIIIlllIIlIlIlII, this.itemStacks.length)) {
            final ItemStack llllllllllllIlllIIIIlllIIlIlIIll = llllllllllllIlllIIIIlllIIlIlIIII.get(llllllllllllIlllIIIIlllIIlIlIlII);
            final ItemStack[] itemStacks = this.itemStacks;
            final int n = llllllllllllIlllIIIIlllIIlIlIlII;
            ItemStack copy;
            if (lIIIlllIIIIllllI(llllllllllllIlllIIIIlllIIlIlIIll)) {
                copy = null;
                "".length();
                if ("  ".length() <= -" ".length()) {
                    throw null;
                }
            }
            else {
                copy = llllllllllllIlllIIIIlllIIlIlIIll.copy();
            }
            itemStacks[n] = copy;
            ++llllllllllllIlllIIIIlllIIlIlIlII;
        }
    }
    
    private static boolean lIIIlllIIIIllllI(final Object llllllllllllIlllIIIIlllIIIIlllIl) {
        return llllllllllllIlllIIIIlllIIIIlllIl == null;
    }
    
    public int func_148911_c() {
        return this.windowId;
    }
    
    static {
        lIIIlllIIIIlllIl();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIIIIlllIIlIIlIII) throws IOException {
        this.windowId = llllllllllllIlllIIIIlllIIlIIlIII.readUnsignedByte();
        final int llllllllllllIlllIIIIlllIIlIIIlll = llllllllllllIlllIIIIlllIIlIIlIII.readShort();
        this.itemStacks = new ItemStack[llllllllllllIlllIIIIlllIIlIIIlll];
        int llllllllllllIlllIIIIlllIIlIIIllI = S30PacketWindowItems.llIIlIlllllIll[0];
        "".length();
        if ((103 + 28 - 77 + 142 ^ 173 + 21 - 142 + 140) < 0) {
            return;
        }
        while (!lIIIlllIIIIlllll(llllllllllllIlllIIIIlllIIlIIIllI, llllllllllllIlllIIIIlllIIlIIIlll)) {
            this.itemStacks[llllllllllllIlllIIIIlllIIlIIIllI] = llllllllllllIlllIIIIlllIIlIIlIII.readItemStackFromBuffer();
            ++llllllllllllIlllIIIIlllIIlIIIllI;
        }
    }
    
    public S30PacketWindowItems() {
    }
    
    public ItemStack[] getItemStacks() {
        return this.itemStacks;
    }
    
    private static void lIIIlllIIIIlllIl() {
        (llIIlIlllllIll = new int[1])[0] = ((0x3C ^ 0x2) & ~(0x40 ^ 0x7E));
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIIIIlllIIIllIlll) throws IOException {
        llllllllllllIlllIIIIlllIIIllIlll.writeByte(this.windowId);
        "".length();
        llllllllllllIlllIIIIlllIIIllIlll.writeShort(this.itemStacks.length);
        "".length();
        final double llllllllllllIlllIIIIlllIIIllIIll;
        final short llllllllllllIlllIIIIlllIIIllIlII = (short)((ItemStack[])(Object)(llllllllllllIlllIIIIlllIIIllIIll = (double)(Object)this.itemStacks)).length;
        double llllllllllllIlllIIIIlllIIIllIlIl = S30PacketWindowItems.llIIlIlllllIll[0];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return;
        }
        while (!lIIIlllIIIIlllll((int)llllllllllllIlllIIIIlllIIIllIlIl, llllllllllllIlllIIIIlllIIIllIlII)) {
            final ItemStack llllllllllllIlllIIIIlllIIIlllIIl = llllllllllllIlllIIIIlllIIIllIIll[llllllllllllIlllIIIIlllIIIllIlIl];
            llllllllllllIlllIIIIlllIIIllIlll.writeItemStackToBuffer(llllllllllllIlllIIIIlllIIIlllIIl);
            ++llllllllllllIlllIIIIlllIIIllIlIl;
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIIIIlllIIIlIllIl) {
        llllllllllllIlllIIIIlllIIIlIllIl.handleWindowItems(this);
    }
}
