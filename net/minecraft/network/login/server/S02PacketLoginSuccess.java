// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.login.server;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import java.util.UUID;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.login.INetHandlerLoginClient;
import net.minecraft.network.Packet;

public class S02PacketLoginSuccess implements Packet<INetHandlerLoginClient>
{
    private static final /* synthetic */ int[] lllIIlIllllIII;
    private static final /* synthetic */ String[] lllIIlIlllIlll;
    private /* synthetic */ GameProfile profile;
    
    private static void lIIllllllllIlIIl() {
        (lllIIlIllllIII = new int[4])[0] = (0x64 ^ 0x40);
        S02PacketLoginSuccess.lllIIlIllllIII[1] = (0xB0 ^ 0x8B ^ (0xA6 ^ 0x8D));
        S02PacketLoginSuccess.lllIIlIllllIII[2] = ((0xAA ^ 0x83 ^ (0xD3 ^ 0xC3)) & (0x7F ^ 0x15 ^ (0xC9 ^ 0x9A) ^ -" ".length()));
        S02PacketLoginSuccess.lllIIlIllllIII[3] = " ".length();
    }
    
    public GameProfile getProfile() {
        return this.profile;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllllIIlIlIIIIIllI) throws IOException {
        final UUID llllllllllllIlIllllIIlIlIIIIlIII = this.profile.getId();
        String string;
        if (lIIllllllllIlIlI(llllllllllllIlIllllIIlIlIIIIlIII)) {
            string = S02PacketLoginSuccess.lllIIlIlllIlll[S02PacketLoginSuccess.lllIIlIllllIII[2]];
            "".length();
            if (-" ".length() >= (63 + 55 - 84 + 153 ^ 184 + 87 - 88 + 8)) {
                return;
            }
        }
        else {
            string = llllllllllllIlIllllIIlIlIIIIlIII.toString();
        }
        llllllllllllIlIllllIIlIlIIIIIllI.writeString(string);
        "".length();
        llllllllllllIlIllllIIlIlIIIIIllI.writeString(this.profile.getName());
        "".length();
    }
    
    private static String lIIllllllllIIlll(String llllllllllllIlIllllIIlIIlllIlIII, final String llllllllllllIlIllllIIlIIlllIIlll) {
        llllllllllllIlIllllIIlIIlllIlIII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIIlIIlllIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIIlIIlllIlIll = new StringBuilder();
        final char[] llllllllllllIlIllllIIlIIlllIlIlI = llllllllllllIlIllllIIlIIlllIIlll.toCharArray();
        int llllllllllllIlIllllIIlIIlllIlIIl = S02PacketLoginSuccess.lllIIlIllllIII[2];
        final double llllllllllllIlIllllIIlIIlllIIIll = (Object)((String)llllllllllllIlIllllIIlIIlllIlIII).toCharArray();
        final int llllllllllllIlIllllIIlIIlllIIIlI = llllllllllllIlIllllIIlIIlllIIIll.length;
        short llllllllllllIlIllllIIlIIlllIIIIl = (short)S02PacketLoginSuccess.lllIIlIllllIII[2];
        while (lIIllllllllIlIll(llllllllllllIlIllllIIlIIlllIIIIl, llllllllllllIlIllllIIlIIlllIIIlI)) {
            final char llllllllllllIlIllllIIlIIlllIlllI = llllllllllllIlIllllIIlIIlllIIIll[llllllllllllIlIllllIIlIIlllIIIIl];
            llllllllllllIlIllllIIlIIlllIlIll.append((char)(llllllllllllIlIllllIIlIIlllIlllI ^ llllllllllllIlIllllIIlIIlllIlIlI[llllllllllllIlIllllIIlIIlllIlIIl % llllllllllllIlIllllIIlIIlllIlIlI.length]));
            "".length();
            ++llllllllllllIlIllllIIlIIlllIlIIl;
            ++llllllllllllIlIllllIIlIIlllIIIIl;
            "".length();
            if (-" ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIIlIIlllIlIll);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllllIIlIlIIIlIllI) throws IOException {
        final String llllllllllllIlIllllIIlIlIIIlIlIl = llllllllllllIlIllllIIlIlIIIlIllI.readStringFromBuffer(S02PacketLoginSuccess.lllIIlIllllIII[0]);
        final String llllllllllllIlIllllIIlIlIIIlIlII = llllllllllllIlIllllIIlIlIIIlIllI.readStringFromBuffer(S02PacketLoginSuccess.lllIIlIllllIII[1]);
        final UUID llllllllllllIlIllllIIlIlIIIlIIll = UUID.fromString(llllllllllllIlIllllIIlIlIIIlIlIl);
        this.profile = new GameProfile(llllllllllllIlIllllIIlIlIIIlIIll, llllllllllllIlIllllIIlIlIIIlIlII);
    }
    
    @Override
    public void processPacket(final INetHandlerLoginClient llllllllllllIlIllllIIlIlIIIIIIIl) {
        llllllllllllIlIllllIIlIlIIIIIIIl.handleLoginSuccess(this);
    }
    
    public S02PacketLoginSuccess(final GameProfile llllllllllllIlIllllIIlIlIIIlllll) {
        this.profile = llllllllllllIlIllllIIlIlIIIlllll;
    }
    
    private static boolean lIIllllllllIlIll(final int llllllllllllIlIllllIIlIIllIlllIl, final int llllllllllllIlIllllIIlIIllIlllII) {
        return llllllllllllIlIllllIIlIIllIlllIl < llllllllllllIlIllllIIlIIllIlllII;
    }
    
    private static void lIIllllllllIlIII() {
        (lllIIlIlllIlll = new String[S02PacketLoginSuccess.lllIIlIllllIII[3]])[S02PacketLoginSuccess.lllIIlIllllIII[2]] = lIIllllllllIIlll("", "ofqQf");
    }
    
    public S02PacketLoginSuccess() {
    }
    
    static {
        lIIllllllllIlIIl();
        lIIllllllllIlIII();
    }
    
    private static boolean lIIllllllllIlIlI(final Object llllllllllllIlIllllIIlIIllIllIlI) {
        return llllllllllllIlIllllIIlIIllIllIlI == null;
    }
}
