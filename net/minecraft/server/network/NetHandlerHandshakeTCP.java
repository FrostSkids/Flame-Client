// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.network;

import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.handshake.client.C00Handshake;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.handshake.INetHandlerHandshakeServer;

public class NetHandlerHandshakeTCP implements INetHandlerHandshakeServer
{
    private static final /* synthetic */ int[] lllIllIIIIlIll;
    private final /* synthetic */ MinecraftServer server;
    private final /* synthetic */ NetworkManager networkManager;
    private static final /* synthetic */ String[] lllIllIIIIlIlI;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$EnumConnectionState;
    
    private static boolean lIlIIIllllllIlII(final Object llllllllllllIlIllIIllllllIIIIIIl) {
        return llllllllllllIlIllIIllllllIIIIIIl != null;
    }
    
    @Override
    public void onDisconnect(final IChatComponent llllllllllllIlIllIIllllllIllIIlI) {
    }
    
    private static void lIlIIIllllllIIII() {
        (lllIllIIIIlIlI = new String[NetHandlerHandshakeTCP.lllIllIIIIlIll[5]])[NetHandlerHandshakeTCP.lllIllIIIIlIll[1]] = lIlIIIlllllIlllI("9op13bPORPNnoW7SbRh9Nlp5F+hGd9VjV274FmVhC+Hn9glnGRbDxw==", "xjacK");
        NetHandlerHandshakeTCP.lllIllIIIIlIlI[NetHandlerHandshakeTCP.lllIllIIIIlIll[2]] = lIlIIIlllllIlllI("tswmc0oP3t9s9A3HhaXlfGH0YJN9JzB99HZZhbB6p9ND108RG3TtzA==", "NenNz");
        NetHandlerHandshakeTCP.lllIllIIIIlIlI[NetHandlerHandshakeTCP.lllIllIIIIlIll[3]] = lIlIIIlllllIllll("HjcHMAc+PVE4BSM8HyUCODdR", "WYqQk");
    }
    
    private static String lIlIIIlllllIlllI(final String llllllllllllIlIllIIllllllIlIIllI, final String llllllllllllIlIllIIllllllIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllllllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllllllIlIIlll.getBytes(StandardCharsets.UTF_8)), NetHandlerHandshakeTCP.lllIllIIIIlIll[6]), "DES");
            final Cipher llllllllllllIlIllIIllllllIlIlIlI = Cipher.getInstance("DES");
            llllllllllllIlIllIIllllllIlIlIlI.init(NetHandlerHandshakeTCP.lllIllIIIIlIll[3], llllllllllllIlIllIIllllllIlIlIll);
            return new String(llllllllllllIlIllIIllllllIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllllllIlIlIIl) {
            llllllllllllIlIllIIllllllIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIllllllIIIl();
        lIlIIIllllllIIII();
    }
    
    private static String lIlIIIlllllIllll(String llllllllllllIlIllIIllllllIIlIIll, final String llllllllllllIlIllIIllllllIIlIlll) {
        llllllllllllIlIllIIllllllIIlIIll = new String(Base64.getDecoder().decode(llllllllllllIlIllIIllllllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIllllllIIlIllI = new StringBuilder();
        final char[] llllllllllllIlIllIIllllllIIlIlIl = llllllllllllIlIllIIllllllIIlIlll.toCharArray();
        int llllllllllllIlIllIIllllllIIlIlII = NetHandlerHandshakeTCP.lllIllIIIIlIll[1];
        final byte llllllllllllIlIllIIllllllIIIlllI = (Object)llllllllllllIlIllIIllllllIIlIIll.toCharArray();
        final byte llllllllllllIlIllIIllllllIIIllIl = (byte)llllllllllllIlIllIIllllllIIIlllI.length;
        char llllllllllllIlIllIIllllllIIIllII = (char)NetHandlerHandshakeTCP.lllIllIIIIlIll[1];
        while (lIlIIIllllllIIll(llllllllllllIlIllIIllllllIIIllII, llllllllllllIlIllIIllllllIIIllIl)) {
            final char llllllllllllIlIllIIllllllIIllIIl = llllllllllllIlIllIIllllllIIIlllI[llllllllllllIlIllIIllllllIIIllII];
            llllllllllllIlIllIIllllllIIlIllI.append((char)(llllllllllllIlIllIIllllllIIllIIl ^ llllllllllllIlIllIIllllllIIlIlIl[llllllllllllIlIllIIllllllIIlIlII % llllllllllllIlIllIIllllllIIlIlIl.length]));
            "".length();
            ++llllllllllllIlIllIIllllllIIlIlII;
            ++llllllllllllIlIllIIllllllIIIllII;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIllllllIIlIllI);
    }
    
    private static void lIlIIIllllllIIIl() {
        (lllIllIIIIlIll = new int[7])[0] = (0x35 ^ 0x52 ^ (0xE8 ^ 0xA0));
        NetHandlerHandshakeTCP.lllIllIIIIlIll[1] = ((0x86 ^ 0xB1 ^ (0xB0 ^ 0xA6)) & (0x29 ^ 0x5E ^ (0x7 ^ 0x51) ^ -" ".length()));
        NetHandlerHandshakeTCP.lllIllIIIIlIll[2] = " ".length();
        NetHandlerHandshakeTCP.lllIllIIIIlIll[3] = "  ".length();
        NetHandlerHandshakeTCP.lllIllIIIIlIll[4] = (142 + 45 - 91 + 59 ^ 96 + 124 - 138 + 77);
        NetHandlerHandshakeTCP.lllIllIIIIlIll[5] = "   ".length();
        NetHandlerHandshakeTCP.lllIllIIIIlIll[6] = (0x9C ^ 0x94);
    }
    
    private static boolean lIlIIIllllllIIll(final int llllllllllllIlIllIIllllllIIIlIII, final int llllllllllllIlIllIIllllllIIIIlll) {
        return llllllllllllIlIllIIllllllIIIlIII < llllllllllllIlIllIIllllllIIIIlll;
    }
    
    private static boolean lIlIIIllllllIIlI(final int llllllllllllIlIllIIllllllIIIIlII, final int llllllllllllIlIllIIllllllIIIIIll) {
        return llllllllllllIlIllIIllllllIIIIlII > llllllllllllIlIllIIllllllIIIIIll;
    }
    
    @Override
    public void processHandshake(final C00Handshake llllllllllllIlIllIIllllllIlllIIl) {
        switch ($SWITCH_TABLE$net$minecraft$network$EnumConnectionState()[llllllllllllIlIllIIllllllIlllIIl.getRequestedState().ordinal()]) {
            case 4: {
                this.networkManager.setConnectionState(EnumConnectionState.LOGIN);
                if (lIlIIIllllllIIlI(llllllllllllIlIllIIllllllIlllIIl.getProtocolVersion(), NetHandlerHandshakeTCP.lllIllIIIIlIll[0])) {
                    final ChatComponentText llllllllllllIlIllIIllllllIlllIII = new ChatComponentText(NetHandlerHandshakeTCP.lllIllIIIIlIlI[NetHandlerHandshakeTCP.lllIllIIIIlIll[1]]);
                    this.networkManager.sendPacket(new S00PacketDisconnect(llllllllllllIlIllIIllllllIlllIII));
                    this.networkManager.closeChannel(llllllllllllIlIllIIllllllIlllIII);
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return;
                    }
                    break;
                }
                else if (lIlIIIllllllIIll(llllllllllllIlIllIIllllllIlllIIl.getProtocolVersion(), NetHandlerHandshakeTCP.lllIllIIIIlIll[0])) {
                    final ChatComponentText llllllllllllIlIllIIllllllIllIlll = new ChatComponentText(NetHandlerHandshakeTCP.lllIllIIIIlIlI[NetHandlerHandshakeTCP.lllIllIIIIlIll[2]]);
                    this.networkManager.sendPacket(new S00PacketDisconnect(llllllllllllIlIllIIllllllIllIlll));
                    this.networkManager.closeChannel(llllllllllllIlIllIIllllllIllIlll);
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                    break;
                }
                else {
                    this.networkManager.setNetHandler(new NetHandlerLoginServer(this.server, this.networkManager));
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                    break;
                }
                break;
            }
            case 3: {
                this.networkManager.setConnectionState(EnumConnectionState.STATUS);
                this.networkManager.setNetHandler(new NetHandlerStatusServer(this.server, this.networkManager));
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
                break;
            }
            default: {
                throw new UnsupportedOperationException(String.valueOf(new StringBuilder(NetHandlerHandshakeTCP.lllIllIIIIlIlI[NetHandlerHandshakeTCP.lllIllIIIIlIll[3]]).append(llllllllllllIlIllIIllllllIlllIIl.getRequestedState())));
            }
        }
    }
    
    public NetHandlerHandshakeTCP(final MinecraftServer llllllllllllIlIllIIllllllIllllll, final NetworkManager llllllllllllIlIllIIlllllllIIIIIl) {
        this.server = llllllllllllIlIllIIllllllIllllll;
        this.networkManager = llllllllllllIlIllIIlllllllIIIIIl;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$EnumConnectionState() {
        final int[] $switch_TABLE$net$minecraft$network$EnumConnectionState = NetHandlerHandshakeTCP.$SWITCH_TABLE$net$minecraft$network$EnumConnectionState;
        if (lIlIIIllllllIlII($switch_TABLE$net$minecraft$network$EnumConnectionState)) {
            return $switch_TABLE$net$minecraft$network$EnumConnectionState;
        }
        "".length();
        final int llllllllllllIlIllIIllllllIllIIII = (Object)new int[EnumConnectionState.values().length];
        try {
            llllllllllllIlIllIIllllllIllIIII[EnumConnectionState.HANDSHAKING.ordinal()] = NetHandlerHandshakeTCP.lllIllIIIIlIll[2];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIIllllllIllIIII[EnumConnectionState.LOGIN.ordinal()] = NetHandlerHandshakeTCP.lllIllIIIIlIll[4];
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIIllllllIllIIII[EnumConnectionState.PLAY.ordinal()] = NetHandlerHandshakeTCP.lllIllIIIIlIll[3];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIIllllllIllIIII[EnumConnectionState.STATUS.ordinal()] = NetHandlerHandshakeTCP.lllIllIIIIlIll[5];
            "".length();
            if (((0x2C ^ 0x1D ^ (0x3B ^ 0x29)) & (73 + 14 + 57 + 3 ^ 166 + 146 - 209 + 73 ^ -" ".length())) == (0x60 ^ 0x67 ^ "   ".length())) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        return NetHandlerHandshakeTCP.$SWITCH_TABLE$net$minecraft$network$EnumConnectionState = (int[])(Object)llllllllllllIlIllIIllllllIllIIII;
    }
}
