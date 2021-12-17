// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S1FPacketSetExperience implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int totalExperience;
    private /* synthetic */ int level;
    private /* synthetic */ float field_149401_a;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllllIlIIIIIIlIIllI) throws IOException {
        llllllllllllIlllllIlIIIIIIlIIllI.writeFloat(this.field_149401_a);
        "".length();
        llllllllllllIlllllIlIIIIIIlIIllI.writeVarIntToBuffer(this.level);
        llllllllllllIlllllIlIIIIIIlIIllI.writeVarIntToBuffer(this.totalExperience);
    }
    
    public S1FPacketSetExperience(final float llllllllllllIlllllIlIIIIIIllIlII, final int llllllllllllIlllllIlIIIIIIllIIll, final int llllllllllllIlllllIlIIIIIIllIIlI) {
        this.field_149401_a = llllllllllllIlllllIlIIIIIIllIlII;
        this.totalExperience = llllllllllllIlllllIlIIIIIIllIIll;
        this.level = llllllllllllIlllllIlIIIIIIllIIlI;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllllIlIIIIIIlIIIII) {
        llllllllllllIlllllIlIIIIIIlIIIII.handleSetExperience(this);
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public S1FPacketSetExperience() {
    }
    
    public int getTotalExperience() {
        return this.totalExperience;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllllIlIIIIIIlIllII) throws IOException {
        this.field_149401_a = llllllllllllIlllllIlIIIIIIlIllII.readFloat();
        this.level = llllllllllllIlllllIlIIIIIIlIllII.readVarIntFromBuffer();
        this.totalExperience = llllllllllllIlllllIlIIIIIIlIllII.readVarIntFromBuffer();
    }
    
    public float func_149397_c() {
        return this.field_149401_a;
    }
}
