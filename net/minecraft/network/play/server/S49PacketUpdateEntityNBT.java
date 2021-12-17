// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S49PacketUpdateEntityNBT implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityId;
    private /* synthetic */ NBTTagCompound tagCompound;
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIIllIlIllIIlllIIl) {
        lllllllllllllIIIIllIlIllIIlllIIl.handleEntityNBT(this);
    }
    
    public S49PacketUpdateEntityNBT() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIllIlIllIIllllll) throws IOException {
        lllllllllllllIIIIllIlIllIIllllll.writeVarIntToBuffer(this.entityId);
        lllllllllllllIIIIllIlIllIIllllll.writeNBTTagCompoundToBuffer(this.tagCompound);
    }
    
    public S49PacketUpdateEntityNBT(final int lllllllllllllIIIIllIlIllIlIIllll, final NBTTagCompound lllllllllllllIIIIllIlIllIlIIlllI) {
        this.entityId = lllllllllllllIIIIllIlIllIlIIllll;
        this.tagCompound = lllllllllllllIIIIllIlIllIlIIlllI;
    }
    
    public Entity getEntity(final World lllllllllllllIIIIllIlIllIIllIIII) {
        return lllllllllllllIIIIllIlIllIIllIIII.getEntityByID(this.entityId);
    }
    
    public NBTTagCompound getTagCompound() {
        return this.tagCompound;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIllIlIllIlIIIlIl) throws IOException {
        this.entityId = lllllllllllllIIIIllIlIllIlIIIlIl.readVarIntFromBuffer();
        this.tagCompound = lllllllllllllIIIIllIlIllIlIIIlIl.readNBTTagCompoundFromBuffer();
    }
}
