// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import net.minecraft.potion.PotionEffect;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S1DPacketEntityEffect implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ byte hideParticles;
    private /* synthetic */ int duration;
    private /* synthetic */ byte amplifier;
    private /* synthetic */ byte effectId;
    private static final /* synthetic */ int[] llIlIIllIIIllI;
    private /* synthetic */ int entityId;
    
    static {
        lIIlIIlIllIlIIII();
    }
    
    private static boolean lIIlIIlIllIlIIll(final int llllllllllllIllIllIIIIIIIIIlIlll, final int llllllllllllIllIllIIIIIIIIIlIllI) {
        return llllllllllllIllIllIIIIIIIIIlIlll == llllllllllllIllIllIIIIIIIIIlIllI;
    }
    
    public S1DPacketEntityEffect() {
    }
    
    private static boolean lIIlIIlIllIlIIIl(final int llllllllllllIllIllIIIIIIIIIlIIll, final int llllllllllllIllIllIIIIIIIIIlIIlI) {
        return llllllllllllIllIllIIIIIIIIIlIIll > llllllllllllIllIllIIIIIIIIIlIIlI;
    }
    
    private static boolean lIIlIIlIllIlIIlI(final int llllllllllllIllIllIIIIIIIIIlIIII) {
        return llllllllllllIllIllIIIIIIIIIlIIII != 0;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIIIIIIIIllIllI) throws IOException {
        llllllllllllIllIllIIIIIIIIllIllI.writeVarIntToBuffer(this.entityId);
        llllllllllllIllIllIIIIIIIIllIllI.writeByte(this.effectId);
        "".length();
        llllllllllllIllIllIIIIIIIIllIllI.writeByte(this.amplifier);
        "".length();
        llllllllllllIllIllIIIIIIIIllIllI.writeVarIntToBuffer(this.duration);
        llllllllllllIllIllIIIIIIIIllIllI.writeByte(this.hideParticles);
        "".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIIIIIIIIllllII) throws IOException {
        this.entityId = llllllllllllIllIllIIIIIIIIllllII.readVarIntFromBuffer();
        this.effectId = llllllllllllIllIllIIIIIIIIllllII.readByte();
        this.amplifier = llllllllllllIllIllIIIIIIIIllllII.readByte();
        this.duration = llllllllllllIllIllIIIIIIIIllllII.readVarIntFromBuffer();
        this.hideParticles = llllllllllllIllIllIIIIIIIIllllII.readByte();
    }
    
    public byte getEffectId() {
        return this.effectId;
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    public boolean func_179707_f() {
        if (lIIlIIlIllIlIIlI(this.hideParticles)) {
            return S1DPacketEntityEffect.llIlIIllIIIllI[2] != 0;
        }
        return S1DPacketEntityEffect.llIlIIllIIIllI[3] != 0;
    }
    
    public S1DPacketEntityEffect(final int llllllllllllIllIllIIIIIIIlIIIIll, final PotionEffect llllllllllllIllIllIIIIIIIlIIIlIl) {
        this.entityId = llllllllllllIllIllIIIIIIIlIIIIll;
        this.effectId = (byte)(llllllllllllIllIllIIIIIIIlIIIlIl.getPotionID() & S1DPacketEntityEffect.llIlIIllIIIllI[0]);
        this.amplifier = (byte)(llllllllllllIllIllIIIIIIIlIIIlIl.getAmplifier() & S1DPacketEntityEffect.llIlIIllIIIllI[0]);
        if (lIIlIIlIllIlIIIl(llllllllllllIllIllIIIIIIIlIIIlIl.getDuration(), S1DPacketEntityEffect.llIlIIllIIIllI[1])) {
            this.duration = S1DPacketEntityEffect.llIlIIllIIIllI[1];
            "".length();
            if (" ".length() > "  ".length()) {
                throw null;
            }
        }
        else {
            this.duration = llllllllllllIllIllIIIIIIIlIIIlIl.getDuration();
        }
        int n;
        if (lIIlIIlIllIlIIlI(llllllllllllIllIllIIIIIIIlIIIlIl.getIsShowParticles() ? 1 : 0)) {
            n = S1DPacketEntityEffect.llIlIIllIIIllI[2];
            "".length();
            if ((0x38 ^ 0x3C) < 0) {
                throw null;
            }
        }
        else {
            n = S1DPacketEntityEffect.llIlIIllIIIllI[3];
        }
        this.hideParticles = (byte)n;
    }
    
    public byte getAmplifier() {
        return this.amplifier;
    }
    
    private static void lIIlIIlIllIlIIII() {
        (llIlIIllIIIllI = new int[4])[0] = 144 + 119 - 145 + 137;
        S1DPacketEntityEffect.llIlIIllIIIllI[1] = (-1 & 0x7FFF);
        S1DPacketEntityEffect.llIlIIllIIIllI[2] = " ".length();
        S1DPacketEntityEffect.llIlIIllIIIllI[3] = ((0x26 ^ 0x3C ^ (0x5D ^ 0x53)) & (0xD6 ^ 0xBB ^ (0xF5 ^ 0x8C) ^ -" ".length()));
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllIIIIIIIIlIllll) {
        llllllllllllIllIllIIIIIIIIlIllll.handleEntityEffect(this);
    }
    
    public boolean func_149429_c() {
        if (lIIlIIlIllIlIIll(this.duration, S1DPacketEntityEffect.llIlIIllIIIllI[1])) {
            return S1DPacketEntityEffect.llIlIIllIIIllI[2] != 0;
        }
        return S1DPacketEntityEffect.llIlIIllIIIllI[3] != 0;
    }
}
