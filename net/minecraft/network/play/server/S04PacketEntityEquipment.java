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

public class S04PacketEntityEquipment implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ ItemStack itemStack;
    private /* synthetic */ int equipmentSlot;
    private /* synthetic */ int entityID;
    
    public S04PacketEntityEquipment() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIllIlIIIllIlIIIl) throws IOException {
        llllllllllllIlllIllIlIIIllIlIIIl.writeVarIntToBuffer(this.entityID);
        llllllllllllIlllIllIlIIIllIlIIIl.writeShort(this.equipmentSlot);
        "".length();
        llllllllllllIlllIllIlIIIllIlIIIl.writeItemStackToBuffer(this.itemStack);
    }
    
    public int getEntityID() {
        return this.entityID;
    }
    
    public ItemStack getItemStack() {
        return this.itemStack;
    }
    
    public S04PacketEntityEquipment(final int llllllllllllIlllIllIlIIIllIlllll, final int llllllllllllIlllIllIlIIIllIllllI, final ItemStack llllllllllllIlllIllIlIIIlllIIIIl) {
        this.entityID = llllllllllllIlllIllIlIIIllIlllll;
        this.equipmentSlot = llllllllllllIlllIllIlIIIllIllllI;
        ItemStack copy;
        if (lIIIlIIIIlIIllll(llllllllllllIlllIllIlIIIlllIIIIl)) {
            copy = null;
            "".length();
            if ("  ".length() > "  ".length()) {
                throw null;
            }
        }
        else {
            copy = llllllllllllIlllIllIlIIIlllIIIIl.copy();
        }
        this.itemStack = copy;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIllIlIIIllIllIIl) throws IOException {
        this.entityID = llllllllllllIlllIllIlIIIllIllIIl.readVarIntFromBuffer();
        this.equipmentSlot = llllllllllllIlllIllIlIIIllIllIIl.readShort();
        this.itemStack = llllllllllllIlllIllIlIIIllIllIIl.readItemStackFromBuffer();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIllIlIIIllIIllIl) {
        llllllllllllIlllIllIlIIIllIIllIl.handleEntityEquipment(this);
    }
    
    private static boolean lIIIlIIIIlIIllll(final Object llllllllllllIlllIllIlIIIlIllllII) {
        return llllllllllllIlllIllIlIIIlIllllII == null;
    }
    
    public int getEquipmentSlot() {
        return this.equipmentSlot;
    }
}
