// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S39PacketPlayerAbilities implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ boolean creativeMode;
    private /* synthetic */ boolean allowFlying;
    private /* synthetic */ float walkSpeed;
    private /* synthetic */ boolean invulnerable;
    private /* synthetic */ float flySpeed;
    private /* synthetic */ boolean flying;
    private static final /* synthetic */ int[] llIlIIIllllIlI;
    
    public void setWalkSpeed(final float llllllllllllIllIllIIlIlIIIIllIII) {
        this.walkSpeed = llllllllllllIllIllIIlIlIIIIllIII;
    }
    
    public S39PacketPlayerAbilities(final PlayerCapabilities llllllllllllIllIllIIlIlIIllIIllI) {
        this.setInvulnerable(llllllllllllIllIllIIlIlIIllIIllI.disableDamage);
        this.setFlying(llllllllllllIllIllIIlIlIIllIIllI.isFlying);
        this.setAllowFlying(llllllllllllIllIllIIlIlIIllIIllI.allowFlying);
        this.setCreativeMode(llllllllllllIllIllIIlIlIIllIIllI.isCreativeMode);
        this.setFlySpeed(llllllllllllIllIllIIlIlIIllIIllI.getFlySpeed());
        this.setWalkSpeed(llllllllllllIllIllIIlIlIIllIIllI.getWalkSpeed());
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIIlIlIIlIllllI) throws IOException {
        final byte llllllllllllIllIllIIlIlIIllIIIII = llllllllllllIllIllIIlIlIIlIllllI.readByte();
        int invulnerable;
        if (lIIlIIlIIIllIllI(llllllllllllIllIllIIlIlIIllIIIII & S39PacketPlayerAbilities.llIlIIIllllIlI[0])) {
            invulnerable = S39PacketPlayerAbilities.llIlIIIllllIlI[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            invulnerable = S39PacketPlayerAbilities.llIlIIIllllIlI[1];
        }
        this.setInvulnerable((boolean)(invulnerable != 0));
        int flying;
        if (lIIlIIlIIIllIllI(llllllllllllIllIllIIlIlIIllIIIII & S39PacketPlayerAbilities.llIlIIIllllIlI[2])) {
            flying = S39PacketPlayerAbilities.llIlIIIllllIlI[0];
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        else {
            flying = S39PacketPlayerAbilities.llIlIIIllllIlI[1];
        }
        this.setFlying((boolean)(flying != 0));
        int allowFlying;
        if (lIIlIIlIIIllIllI(llllllllllllIllIllIIlIlIIllIIIII & S39PacketPlayerAbilities.llIlIIIllllIlI[3])) {
            allowFlying = S39PacketPlayerAbilities.llIlIIIllllIlI[0];
            "".length();
            if (" ".length() < -" ".length()) {
                return;
            }
        }
        else {
            allowFlying = S39PacketPlayerAbilities.llIlIIIllllIlI[1];
        }
        this.setAllowFlying((boolean)(allowFlying != 0));
        int creativeMode;
        if (lIIlIIlIIIllIllI(llllllllllllIllIllIIlIlIIllIIIII & S39PacketPlayerAbilities.llIlIIIllllIlI[4])) {
            creativeMode = S39PacketPlayerAbilities.llIlIIIllllIlI[0];
            "".length();
            if (((0xA6 ^ 0x9D) & ~(0x40 ^ 0x7B)) == (0x9 ^ 0xD)) {
                return;
            }
        }
        else {
            creativeMode = S39PacketPlayerAbilities.llIlIIIllllIlI[1];
        }
        this.setCreativeMode((boolean)(creativeMode != 0));
        this.setFlySpeed(llllllllllllIllIllIIlIlIIlIllllI.readFloat());
        this.setWalkSpeed(llllllllllllIllIllIIlIlIIlIllllI.readFloat());
    }
    
    public float getFlySpeed() {
        return this.flySpeed;
    }
    
    public void setFlySpeed(final float llllllllllllIllIllIIlIlIIIlIIIll) {
        this.flySpeed = llllllllllllIllIllIIlIlIIIlIIIll;
    }
    
    public S39PacketPlayerAbilities() {
    }
    
    public void setFlying(final boolean llllllllllllIllIllIIlIlIIIlllllI) {
        this.flying = llllllllllllIllIllIIlIlIIIlllllI;
    }
    
    private static void lIIlIIlIIIllIlIl() {
        (llIlIIIllllIlI = new int[5])[0] = " ".length();
        S39PacketPlayerAbilities.llIlIIIllllIlI[1] = ((0xD4 ^ 0x8C) & ~(0x44 ^ 0x1C));
        S39PacketPlayerAbilities.llIlIIIllllIlI[2] = "  ".length();
        S39PacketPlayerAbilities.llIlIIIllllIlI[3] = (0x6D ^ 0x31 ^ (0x2B ^ 0x73));
        S39PacketPlayerAbilities.llIlIIIllllIlI[4] = (52 + 138 - 141 + 103 ^ 89 + 41 - 100 + 114);
    }
    
    public boolean isCreativeMode() {
        return this.creativeMode;
    }
    
    public void setAllowFlying(final boolean llllllllllllIllIllIIlIlIIIllIlIl) {
        this.allowFlying = llllllllllllIllIllIIlIlIIIllIlIl;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIIlIlIIlIlIlIl) throws IOException {
        byte llllllllllllIllIllIIlIlIIlIlIlll = (byte)S39PacketPlayerAbilities.llIlIIIllllIlI[1];
        if (lIIlIIlIIIllIlll(this.isInvulnerable() ? 1 : 0)) {
            llllllllllllIllIllIIlIlIIlIlIlll |= (byte)S39PacketPlayerAbilities.llIlIIIllllIlI[0];
        }
        if (lIIlIIlIIIllIlll(this.isFlying() ? 1 : 0)) {
            llllllllllllIllIllIIlIlIIlIlIlll |= (byte)S39PacketPlayerAbilities.llIlIIIllllIlI[2];
        }
        if (lIIlIIlIIIllIlll(this.isAllowFlying() ? 1 : 0)) {
            llllllllllllIllIllIIlIlIIlIlIlll |= (byte)S39PacketPlayerAbilities.llIlIIIllllIlI[3];
        }
        if (lIIlIIlIIIllIlll(this.isCreativeMode() ? 1 : 0)) {
            llllllllllllIllIllIIlIlIIlIlIlll |= (byte)S39PacketPlayerAbilities.llIlIIIllllIlI[4];
        }
        llllllllllllIllIllIIlIlIIlIlIlIl.writeByte(llllllllllllIllIllIIlIlIIlIlIlll);
        "".length();
        llllllllllllIllIllIIlIlIIlIlIlIl.writeFloat(this.flySpeed);
        "".length();
        llllllllllllIllIllIIlIlIIlIlIlIl.writeFloat(this.walkSpeed);
        "".length();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllIIlIlIIlIIlllI) {
        llllllllllllIllIllIIlIlIIlIIlllI.handlePlayerAbilities(this);
    }
    
    public boolean isAllowFlying() {
        return this.allowFlying;
    }
    
    public void setInvulnerable(final boolean llllllllllllIllIllIIlIlIIlIIIlIl) {
        this.invulnerable = llllllllllllIllIllIIlIlIIlIIIlIl;
    }
    
    public float getWalkSpeed() {
        return this.walkSpeed;
    }
    
    public void setCreativeMode(final boolean llllllllllllIllIllIIlIlIIIlIllII) {
        this.creativeMode = llllllllllllIllIllIIlIlIIIlIllII;
    }
    
    static {
        lIIlIIlIIIllIlIl();
    }
    
    private static boolean lIIlIIlIIIllIllI(final int llllllllllllIllIllIIlIlIIIIlIIII) {
        return llllllllllllIllIllIIlIlIIIIlIIII > 0;
    }
    
    private static boolean lIIlIIlIIIllIlll(final int llllllllllllIllIllIIlIlIIIIlIIlI) {
        return llllllllllllIllIllIIlIlIIIIlIIlI != 0;
    }
    
    public boolean isFlying() {
        return this.flying;
    }
    
    public boolean isInvulnerable() {
        return this.invulnerable;
    }
}
