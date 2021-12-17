// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.network;

import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.Packet;
import net.minecraft.network.status.server.S01PacketPong;
import net.minecraft.network.status.client.C01PacketPing;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ChatComponentText;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.status.INetHandlerStatusServer;

public class NetHandlerStatusServer implements INetHandlerStatusServer
{
    private /* synthetic */ boolean field_183008_d;
    private final /* synthetic */ NetworkManager networkManager;
    private static final /* synthetic */ IChatComponent field_183007_a;
    private static final /* synthetic */ String[] lllIlIIIIlIIIl;
    private static final /* synthetic */ int[] lllIlIIIIlIlII;
    private final /* synthetic */ MinecraftServer server;
    
    static {
        lIlIIIIlIlllIIll();
        lIlIIIIlIllIIlIl();
        field_183007_a = new ChatComponentText(NetHandlerStatusServer.lllIlIIIIlIIIl[NetHandlerStatusServer.lllIlIIIIlIlII[0]]);
    }
    
    private static void lIlIIIIlIllIIlIl() {
        (lllIlIIIIlIIIl = new String[NetHandlerStatusServer.lllIlIIIIlIlII[1]])[NetHandlerStatusServer.lllIlIIIIlIlII[0]] = lIlIIIIlIllIIlII("jyV7ZLFsjEw+/LcSkz53SchVMrkfdIIAVUpZMfWqezHGeOa3HPvg1Q==", "IYKyn");
    }
    
    private static boolean lIlIIIIlIlllIlII(final int llllllllllllIlIlllIIllIlIlIlllll) {
        return llllllllllllIlIlllIIllIlIlIlllll != 0;
    }
    
    private static String lIlIIIIlIllIIlII(final String llllllllllllIlIlllIIllIlIllIIllI, final String llllllllllllIlIlllIIllIlIllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllIlIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), NetHandlerStatusServer.lllIlIIIIlIlII[2]), "DES");
            final Cipher llllllllllllIlIlllIIllIlIllIlIII = Cipher.getInstance("DES");
            llllllllllllIlIlllIIllIlIllIlIII.init(NetHandlerStatusServer.lllIlIIIIlIlII[3], llllllllllllIlIlllIIllIlIllIlIIl);
            return new String(llllllllllllIlIlllIIllIlIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllIlIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllIlIllIIlll) {
            llllllllllllIlIlllIIllIlIllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIIlIlllIIll() {
        (lllIlIIIIlIlII = new int[4])[0] = ((158 + 103 - 174 + 160 ^ 92 + 150 - 94 + 16) & (124 + 94 - 28 + 15 ^ 157 + 95 - 174 + 80 ^ -" ".length()));
        NetHandlerStatusServer.lllIlIIIIlIlII[1] = " ".length();
        NetHandlerStatusServer.lllIlIIIIlIlII[2] = (0xCC ^ 0xC4);
        NetHandlerStatusServer.lllIlIIIIlIlII[3] = "  ".length();
    }
    
    @Override
    public void onDisconnect(final IChatComponent llllllllllllIlIlllIIllIlIllllIII) {
    }
    
    @Override
    public void processPing(final C01PacketPing llllllllllllIlIlllIIllIlIlllIIII) {
        this.networkManager.sendPacket(new S01PacketPong(llllllllllllIlIlllIIllIlIlllIIII.getClientTime()));
        this.networkManager.closeChannel(NetHandlerStatusServer.field_183007_a);
    }
    
    @Override
    public void processServerQuery(final C00PacketServerQuery llllllllllllIlIlllIIllIlIlllIlIl) {
        if (lIlIIIIlIlllIlII(this.field_183008_d ? 1 : 0)) {
            this.networkManager.closeChannel(NetHandlerStatusServer.field_183007_a);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.field_183008_d = (NetHandlerStatusServer.lllIlIIIIlIlII[1] != 0);
            this.networkManager.sendPacket(new S00PacketServerInfo(this.server.getServerStatusResponse()));
        }
    }
    
    public NetHandlerStatusServer(final MinecraftServer llllllllllllIlIlllIIllIlIllllIll, final NetworkManager llllllllllllIlIlllIIllIlIllllIlI) {
        this.server = llllllllllllIlIlllIIllIlIllllIll;
        this.networkManager = llllllllllllIlIlllIIllIlIllllIlI;
    }
}
