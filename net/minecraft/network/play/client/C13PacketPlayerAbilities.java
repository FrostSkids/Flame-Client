// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import net.minecraft.entity.player.PlayerCapabilities;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C13PacketPlayerAbilities implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ boolean allowFlying;
    private static final /* synthetic */ int[] lIlllllIlIIlIl;
    private /* synthetic */ boolean creativeMode;
    private /* synthetic */ boolean invulnerable;
    private /* synthetic */ float walkSpeed;
    private /* synthetic */ float flySpeed;
    private /* synthetic */ boolean flying;
    
    public boolean isAllowFlying() {
        return this.allowFlying;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllllIIllIlIIlIIlllI) throws IOException {
        byte llllllllllllIllllIIllIlIIlIIllIl = (byte)C13PacketPlayerAbilities.lIlllllIlIIlIl[1];
        if (lIIIIlIlIllIIlII(this.isInvulnerable() ? 1 : 0)) {
            llllllllllllIllllIIllIlIIlIIllIl |= (byte)C13PacketPlayerAbilities.lIlllllIlIIlIl[0];
        }
        if (lIIIIlIlIllIIlII(this.isFlying() ? 1 : 0)) {
            llllllllllllIllllIIllIlIIlIIllIl |= (byte)C13PacketPlayerAbilities.lIlllllIlIIlIl[2];
        }
        if (lIIIIlIlIllIIlII(this.isAllowFlying() ? 1 : 0)) {
            llllllllllllIllllIIllIlIIlIIllIl |= (byte)C13PacketPlayerAbilities.lIlllllIlIIlIl[3];
        }
        if (lIIIIlIlIllIIlII(this.isCreativeMode() ? 1 : 0)) {
            llllllllllllIllllIIllIlIIlIIllIl |= (byte)C13PacketPlayerAbilities.lIlllllIlIIlIl[4];
        }
        llllllllllllIllllIIllIlIIlIIlllI.writeByte(llllllllllllIllllIIllIlIIlIIllIl);
        "".length();
        llllllllllllIllllIIllIlIIlIIlllI.writeFloat(this.flySpeed);
        "".length();
        llllllllllllIllllIIllIlIIlIIlllI.writeFloat(this.walkSpeed);
        "".length();
    }
    
    public C13PacketPlayerAbilities(final PlayerCapabilities llllllllllllIllllIIllIlIIlIllllI) {
        this.setInvulnerable(llllllllllllIllllIIllIlIIlIllllI.disableDamage);
        this.setFlying(llllllllllllIllllIIllIlIIlIllllI.isFlying);
        this.setAllowFlying(llllllllllllIllllIIllIlIIlIllllI.allowFlying);
        this.setCreativeMode(llllllllllllIllllIIllIlIIlIllllI.isCreativeMode);
        this.setFlySpeed(llllllllllllIllllIIllIlIIlIllllI.getFlySpeed());
        this.setWalkSpeed(llllllllllllIllllIIllIlIIlIllllI.getWalkSpeed());
    }
    
    private static void lIIIIlIlIllIIIlI() {
        (lIlllllIlIIlIl = new int[5])[0] = " ".length();
        C13PacketPlayerAbilities.lIlllllIlIIlIl[1] = ((0x3A ^ 0x22) & ~(0x1 ^ 0x19));
        C13PacketPlayerAbilities.lIlllllIlIIlIl[2] = "  ".length();
        C13PacketPlayerAbilities.lIlllllIlIIlIl[3] = (0x69 ^ 0x70 ^ (0x49 ^ 0x54));
        C13PacketPlayerAbilities.lIlllllIlIIlIl[4] = (" ".length() ^ (0x28 ^ 0x21));
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer llllllllllllIllllIIllIlIIlIIIllI) {
        llllllllllllIllllIIllIlIIlIIIllI.processPlayerAbilities(this);
    }
    
    public void setInvulnerable(final boolean llllllllllllIllllIIllIlIIIlllIll) {
        this.invulnerable = llllllllllllIllllIIllIlIIIlllIll;
    }
    
    public void setFlySpeed(final float llllllllllllIllllIIllIlIIIIllIlI) {
        this.flySpeed = llllllllllllIllllIIllIlIIIIllIlI;
    }
    
    private static boolean lIIIIlIlIllIIIll(final int llllllllllllIllllIIllIlIIIIIllII) {
        return llllllllllllIllllIIllIlIIIIIllII > 0;
    }
    
    private static boolean lIIIIlIlIllIIlII(final int llllllllllllIllllIIllIlIIIIIlllI) {
        return llllllllllllIllllIIllIlIIIIIlllI != 0;
    }
    
    public boolean isInvulnerable() {
        return this.invulnerable;
    }
    
    public boolean isFlying() {
        return this.flying;
    }
    
    public void setAllowFlying(final boolean llllllllllllIllllIIllIlIIIlIlIll) {
        this.allowFlying = llllllllllllIllllIIllIlIIIlIlIll;
    }
    
    static {
        lIIIIlIlIllIIIlI();
    }
    
    public C13PacketPlayerAbilities() {
    }
    
    public void setFlying(final boolean llllllllllllIllllIIllIlIIIllIlII) {
        this.flying = llllllllllllIllllIIllIlIIIllIlII;
    }
    
    public void setCreativeMode(final boolean llllllllllllIllllIIllIlIIIlIIIlI) {
        this.creativeMode = llllllllllllIllllIIllIlIIIlIIIlI;
    }
    
    public boolean isCreativeMode() {
        return this.creativeMode;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllllIIllIlIIlIlIlII) throws IOException {
        final byte llllllllllllIllllIIllIlIIlIlIllI = llllllllllllIllllIIllIlIIlIlIlII.readByte();
        int invulnerable;
        if (lIIIIlIlIllIIIll(llllllllllllIllllIIllIlIIlIlIllI & C13PacketPlayerAbilities.lIlllllIlIIlIl[0])) {
            invulnerable = C13PacketPlayerAbilities.lIlllllIlIIlIl[0];
            "".length();
            if (((0x8 ^ 0x32) & ~(0x69 ^ 0x53)) >= (0xC3 ^ 0xC7)) {
                return;
            }
        }
        else {
            invulnerable = C13PacketPlayerAbilities.lIlllllIlIIlIl[1];
        }
        this.setInvulnerable((boolean)(invulnerable != 0));
        int flying;
        if (lIIIIlIlIllIIIll(llllllllllllIllllIIllIlIIlIlIllI & C13PacketPlayerAbilities.lIlllllIlIIlIl[2])) {
            flying = C13PacketPlayerAbilities.lIlllllIlIIlIl[0];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            flying = C13PacketPlayerAbilities.lIlllllIlIIlIl[1];
        }
        this.setFlying((boolean)(flying != 0));
        int allowFlying;
        if (lIIIIlIlIllIIIll(llllllllllllIllllIIllIlIIlIlIllI & C13PacketPlayerAbilities.lIlllllIlIIlIl[3])) {
            allowFlying = C13PacketPlayerAbilities.lIlllllIlIIlIl[0];
            "".length();
            if ((0xBF ^ 0xBA) == 0x0) {
                return;
            }
        }
        else {
            allowFlying = C13PacketPlayerAbilities.lIlllllIlIIlIl[1];
        }
        this.setAllowFlying((boolean)(allowFlying != 0));
        int creativeMode;
        if (lIIIIlIlIllIIIll(llllllllllllIllllIIllIlIIlIlIllI & C13PacketPlayerAbilities.lIlllllIlIIlIl[4])) {
            creativeMode = C13PacketPlayerAbilities.lIlllllIlIIlIl[0];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            creativeMode = C13PacketPlayerAbilities.lIlllllIlIIlIl[1];
        }
        this.setCreativeMode((boolean)(creativeMode != 0));
        this.setFlySpeed(llllllllllllIllllIIllIlIIlIlIlII.readFloat());
        this.setWalkSpeed(llllllllllllIllllIIllIlIIlIlIlII.readFloat());
    }
    
    public void setWalkSpeed(final float llllllllllllIllllIIllIlIIIIlIllI) {
        this.walkSpeed = llllllllllllIllllIIllIlIIIIlIllI;
    }
}
