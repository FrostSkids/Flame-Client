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

public class C0EPacketClickWindow implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ ItemStack clickedItem;
    private /* synthetic */ int windowId;
    private /* synthetic */ int usedButton;
    private /* synthetic */ short actionNumber;
    private /* synthetic */ int slotId;
    private /* synthetic */ int mode;
    
    public int getUsedButton() {
        return this.usedButton;
    }
    
    public int getWindowId() {
        return this.windowId;
    }
    
    public short getActionNumber() {
        return this.actionNumber;
    }
    
    public C0EPacketClickWindow(final int lllllllllllllIlIlIIlIIIIllIlIllI, final int lllllllllllllIlIlIIlIIIIllIlIlIl, final int lllllllllllllIlIlIIlIIIIllIllIll, final int lllllllllllllIlIlIIlIIIIllIlIIll, final ItemStack lllllllllllllIlIlIIlIIIIllIlIIlI, final short lllllllllllllIlIlIIlIIIIllIllIII) {
        this.windowId = lllllllllllllIlIlIIlIIIIllIlIllI;
        this.slotId = lllllllllllllIlIlIIlIIIIllIlIlIl;
        this.usedButton = lllllllllllllIlIlIIlIIIIllIllIll;
        ItemStack copy;
        if (lIllIIllIIIIlll(lllllllllllllIlIlIIlIIIIllIlIIlI)) {
            copy = lllllllllllllIlIlIIlIIIIllIlIIlI.copy();
            "".length();
            if ((0x73 ^ 0x63 ^ (0x51 ^ 0x45)) <= 0) {
                throw null;
            }
        }
        else {
            copy = null;
        }
        this.clickedItem = copy;
        this.actionNumber = lllllllllllllIlIlIIlIIIIllIllIII;
        this.mode = lllllllllllllIlIlIIlIIIIllIlIIll;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlIIlIIIIllIIIlIl) throws IOException {
        this.windowId = lllllllllllllIlIlIIlIIIIllIIIlIl.readByte();
        this.slotId = lllllllllllllIlIlIIlIIIIllIIIlIl.readShort();
        this.usedButton = lllllllllllllIlIlIIlIIIIllIIIlIl.readByte();
        this.actionNumber = lllllllllllllIlIlIIlIIIIllIIIlIl.readShort();
        this.mode = lllllllllllllIlIlIIlIIIIllIIIlIl.readByte();
        this.clickedItem = lllllllllllllIlIlIIlIIIIllIIIlIl.readItemStackFromBuffer();
    }
    
    public int getSlotId() {
        return this.slotId;
    }
    
    public ItemStack getClickedItem() {
        return this.clickedItem;
    }
    
    public C0EPacketClickWindow() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIlIIlIIIIllIIlIll) {
        lllllllllllllIlIlIIlIIIIllIIlIll.processClickWindow(this);
    }
    
    public int getMode() {
        return this.mode;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlIIlIIIIlIllllll) throws IOException {
        lllllllllllllIlIlIIlIIIIlIllllll.writeByte(this.windowId);
        "".length();
        lllllllllllllIlIlIIlIIIIlIllllll.writeShort(this.slotId);
        "".length();
        lllllllllllllIlIlIIlIIIIlIllllll.writeByte(this.usedButton);
        "".length();
        lllllllllllllIlIlIIlIIIIlIllllll.writeShort(this.actionNumber);
        "".length();
        lllllllllllllIlIlIIlIIIIlIllllll.writeByte(this.mode);
        "".length();
        lllllllllllllIlIlIIlIIIIlIllllll.writeItemStackToBuffer(this.clickedItem);
    }
    
    private static boolean lIllIIllIIIIlll(final Object lllllllllllllIlIlIIlIIIIlIlIIlll) {
        return lllllllllllllIlIlIIlIIIIlIlIIlll != null;
    }
}
