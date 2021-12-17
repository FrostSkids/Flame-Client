// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S06PacketUpdateHealth implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ float saturationLevel;
    private /* synthetic */ float health;
    private /* synthetic */ int foodLevel;
    
    public int getFoodLevel() {
        return this.foodLevel;
    }
    
    public float getHealth() {
        return this.health;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIllIIllIIIIIllllll) {
        lllllllllllllIIllIIllIIIIIllllll.handleUpdateHealth(this);
    }
    
    public float getSaturationLevel() {
        return this.saturationLevel;
    }
    
    public S06PacketUpdateHealth(final float lllllllllllllIIllIIllIIIIlIlIIIl, final int lllllllllllllIIllIIllIIIIlIlIlII, final float lllllllllllllIIllIIllIIIIlIIllll) {
        this.health = lllllllllllllIIllIIllIIIIlIlIIIl;
        this.foodLevel = lllllllllllllIIllIIllIIIIlIlIlII;
        this.saturationLevel = lllllllllllllIIllIIllIIIIlIIllll;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIllIIllIIIIlIIIlIl) throws IOException {
        lllllllllllllIIllIIllIIIIlIIIlIl.writeFloat(this.health);
        "".length();
        lllllllllllllIIllIIllIIIIlIIIlIl.writeVarIntToBuffer(this.foodLevel);
        lllllllllllllIIllIIllIIIIlIIIlIl.writeFloat(this.saturationLevel);
        "".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIllIIllIIIIlIIlIIl) throws IOException {
        this.health = lllllllllllllIIllIIllIIIIlIIlIIl.readFloat();
        this.foodLevel = lllllllllllllIIllIIllIIIIlIIlIIl.readVarIntFromBuffer();
        this.saturationLevel = lllllllllllllIIllIIllIIIIlIIlIIl.readFloat();
    }
    
    public S06PacketUpdateHealth() {
    }
}
