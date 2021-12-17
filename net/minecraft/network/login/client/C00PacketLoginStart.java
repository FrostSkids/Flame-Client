// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.login.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import java.util.UUID;
import net.minecraft.network.PacketBuffer;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.login.INetHandlerLoginServer;
import net.minecraft.network.Packet;

public class C00PacketLoginStart implements Packet<INetHandlerLoginServer>
{
    private /* synthetic */ GameProfile profile;
    private static final /* synthetic */ int[] lllIIIIlIIlIIl;
    
    public C00PacketLoginStart(final GameProfile llllllllllllIllIIIIllIIIIIIIIlIl) {
        this.profile = llllllllllllIllIIIIllIIIIIIIIlIl;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIIIlIlllllllllll) throws IOException {
        this.profile = new GameProfile((UUID)null, llllllllllllIllIIIIlIlllllllllll.readStringFromBuffer(C00PacketLoginStart.lllIIIIlIIlIIl[0]));
    }
    
    private static void lIIlllIIIllllllI() {
        (lllIIIIlIIlIIl = new int[1])[0] = (0xA1 ^ 0xB1);
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIIIlIlllllllIlll) throws IOException {
        llllllllllllIllIIIIlIlllllllIlll.writeString(this.profile.getName());
        "".length();
    }
    
    public GameProfile getProfile() {
        return this.profile;
    }
    
    public C00PacketLoginStart() {
    }
    
    static {
        lIIlllIIIllllllI();
    }
    
    @Override
    public void processPacket(final INetHandlerLoginServer llllllllllllIllIIIIlIlllllllIIll) {
        llllllllllllIllIIIIlIlllllllIIll.processLoginStart(this);
    }
}
