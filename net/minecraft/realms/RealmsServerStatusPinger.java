// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.net.UnknownHostException;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.ServerStatusResponse;
import net.minecraft.network.Packet;
import net.minecraft.network.status.client.C01PacketPing;
import org.apache.commons.lang3.ArrayUtils;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.server.S01PacketPong;
import net.minecraft.network.status.INetHandlerStatusClient;
import java.net.InetAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import org.apache.logging.log4j.Logger;
import net.minecraft.network.NetworkManager;
import java.util.List;

public class RealmsServerStatusPinger
{
    private final /* synthetic */ List<NetworkManager> connections;
    private static final /* synthetic */ String[] lllIlIlIIIllll;
    private static final /* synthetic */ Logger LOGGER;
    private static final /* synthetic */ int[] lllIlIlIIlIIIl;
    
    private static boolean lIlIIIlIllIllIlI(final int llllllllllllIlIllIllIlIlIIllIIII) {
        return llllllllllllIlIllIllIlIlIIllIIII == 0;
    }
    
    public void removeAll() {
        synchronized (this.connections) {
            final Iterator<NetworkManager> llllllllllllIlIllIllIlIlIlIIlIII = this.connections.iterator();
            "".length();
            if (((158 + 49 - 90 + 74 ^ 63 + 68 - 5 + 61) & (28 + 111 - 80 + 69 ^ 101 + 65 - 117 + 83 ^ -" ".length())) < 0) {
                return;
            }
            while (!lIlIIIlIllIllIlI(llllllllllllIlIllIllIlIlIlIIlIII.hasNext() ? 1 : 0)) {
                final NetworkManager llllllllllllIlIllIllIlIlIlIIIlll = llllllllllllIlIllIllIlIlIlIIlIII.next();
                if (lIlIIIlIllIllIll(llllllllllllIlIllIllIlIlIlIIIlll.isChannelOpen() ? 1 : 0)) {
                    llllllllllllIlIllIllIlIlIlIIlIII.remove();
                    llllllllllllIlIllIllIlIlIlIIIlll.closeChannel(new ChatComponentText(RealmsServerStatusPinger.lllIlIlIIIllll[RealmsServerStatusPinger.lllIlIlIIlIIIl[1]]));
                }
            }
            // monitorexit(this.connections)
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
    }
    
    private static String lIlIIIlIllIlIIII(final String llllllllllllIlIllIllIlIlIIlllIIl, final String llllllllllllIlIllIllIlIlIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIlIlIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIlIlIIlllIlI.getBytes(StandardCharsets.UTF_8)), RealmsServerStatusPinger.lllIlIlIIlIIIl[3]), "DES");
            final Cipher llllllllllllIlIllIllIlIlIIllllIl = Cipher.getInstance("DES");
            llllllllllllIlIllIllIlIlIIllllIl.init(RealmsServerStatusPinger.lllIlIlIIlIIIl[2], llllllllllllIlIllIllIlIlIIlllllI);
            return new String(llllllllllllIlIllIllIlIlIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIlIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIlIlIIllllII) {
            llllllllllllIlIllIllIlIlIIllllII.printStackTrace();
            return null;
        }
    }
    
    public void pingServer(final String llllllllllllIlIllIllIlIlIlIlllIl, final RealmsServerPing llllllllllllIlIllIllIlIlIllIIIlI) throws UnknownHostException {
        if (lIlIIIlIllIllIIl(llllllllllllIlIllIllIlIlIlIlllIl) && lIlIIIlIllIllIlI(llllllllllllIlIllIllIlIlIlIlllIl.startsWith(RealmsServerStatusPinger.lllIlIlIIIllll[RealmsServerStatusPinger.lllIlIlIIlIIIl[0]]) ? 1 : 0) && lIlIIIlIllIllIlI(llllllllllllIlIllIllIlIlIlIlllIl.isEmpty() ? 1 : 0)) {
            final RealmsServerAddress llllllllllllIlIllIllIlIlIllIIIIl = RealmsServerAddress.parseString(llllllllllllIlIllIllIlIlIlIlllIl);
            final NetworkManager llllllllllllIlIllIllIlIlIllIIIII = NetworkManager.func_181124_a(InetAddress.getByName(llllllllllllIlIllIllIlIlIllIIIIl.getHost()), llllllllllllIlIllIllIlIlIllIIIIl.getPort(), (boolean)(RealmsServerStatusPinger.lllIlIlIIlIIIl[0] != 0));
            this.connections.add(llllllllllllIlIllIllIlIlIllIIIII);
            "".length();
            llllllllllllIlIllIllIlIlIllIIIII.setNetHandler(new INetHandlerStatusClient() {
                private static final /* synthetic */ String[] llIIllIIlIIIII;
                private static final /* synthetic */ int[] llIIllIIlIIIIl;
                private /* synthetic */ boolean field_154345_e = RealmsServerStatusPinger$1.llIIllIIlIIIIl[0];
                
                private static boolean lIIIlllIlIIIIllI(final int llllllllllllIlllIIIIIlllIIIlllIl, final int llllllllllllIlllIIIIIlllIIIlllII) {
                    return llllllllllllIlllIIIIIlllIIIlllIl >= llllllllllllIlllIIIIIlllIIIlllII;
                }
                
                private static boolean lIIIlllIlIIIlIII(final int llllllllllllIlllIIIIIlllIIIlIIlI) {
                    return llllllllllllIlllIIIIIlllIIIlIIlI == 0;
                }
                
                static {
                    lIIIlllIlIIIIIlI();
                    lIIIlllIlIIIIIIl();
                }
                
                private static String lIIIlllIlIIIIIII(final String llllllllllllIlllIIIIIlllIlIIlIlI, final String llllllllllllIlllIIIIIlllIlIIlIIl) {
                    try {
                        final SecretKeySpec llllllllllllIlllIIIIIlllIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIlllIIIIIlllIlIIllII = Cipher.getInstance("Blowfish");
                        llllllllllllIlllIIIIIlllIlIIllII.init(RealmsServerStatusPinger$1.llIIllIIlIIIIl[2], llllllllllllIlllIIIIIlllIlIIllIl);
                        return new String(llllllllllllIlllIIIIIlllIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlllIIIIIlllIlIIlIll) {
                        llllllllllllIlllIIIIIlllIlIIlIll.printStackTrace();
                        return null;
                    }
                }
                
                private static String lIIIlllIIllllllI(String llllllllllllIlllIIIIIlllIIllIlIl, final String llllllllllllIlllIIIIIlllIIlllIIl) {
                    llllllllllllIlllIIIIIlllIIllIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIIlllIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIlllIIIIIlllIIlllIII = new StringBuilder();
                    final char[] llllllllllllIlllIIIIIlllIIllIlll = llllllllllllIlllIIIIIlllIIlllIIl.toCharArray();
                    int llllllllllllIlllIIIIIlllIIllIllI = RealmsServerStatusPinger$1.llIIllIIlIIIIl[0];
                    final long llllllllllllIlllIIIIIlllIIllIIII = (Object)llllllllllllIlllIIIIIlllIIllIlIl.toCharArray();
                    final short llllllllllllIlllIIIIIlllIIlIllll = (short)llllllllllllIlllIIIIIlllIIllIIII.length;
                    char llllllllllllIlllIIIIIlllIIlIlllI = (char)RealmsServerStatusPinger$1.llIIllIIlIIIIl[0];
                    while (lIIIlllIlIIIIlll(llllllllllllIlllIIIIIlllIIlIlllI, llllllllllllIlllIIIIIlllIIlIllll)) {
                        final char llllllllllllIlllIIIIIlllIIlllIll = llllllllllllIlllIIIIIlllIIllIIII[llllllllllllIlllIIIIIlllIIlIlllI];
                        llllllllllllIlllIIIIIlllIIlllIII.append((char)(llllllllllllIlllIIIIIlllIIlllIll ^ llllllllllllIlllIIIIIlllIIllIlll[llllllllllllIlllIIIIIlllIIllIllI % llllllllllllIlllIIIIIlllIIllIlll.length]));
                        "".length();
                        ++llllllllllllIlllIIIIIlllIIllIllI;
                        ++llllllllllllIlllIIIIIlllIIlIlllI;
                        "".length();
                        if ("  ".length() < "  ".length()) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIlllIIIIIlllIIlllIII);
                }
                
                private static boolean lIIIlllIlIIIIIll(final Object llllllllllllIlllIIIIIlllIIIlIllI) {
                    return llllllllllllIlllIIIIIlllIIIlIllI != null;
                }
                
                @Override
                public void handlePong(final S01PacketPong llllllllllllIlllIIIIIlllIlIllIIl) {
                    llllllllllllIlIllIllIlIlIllIIIII.closeChannel(new ChatComponentText(RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[5]]));
                }
                
                private static void lIIIlllIlIIIIIlI() {
                    (llIIllIIlIIIIl = new int[9])[0] = ((0x9E ^ 0xB3) & ~(0x86 ^ 0xAB));
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[1] = " ".length();
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[2] = "  ".length();
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[3] = "   ".length();
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[4] = (0xB8 ^ 0xBC);
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[5] = (0x31 ^ 0x34);
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[6] = (0x39 ^ 0x3F);
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[7] = (109 + 134 - 191 + 118 ^ 0 + 100 + 69 + 4);
                    RealmsServerStatusPinger$1.llIIllIIlIIIIl[8] = (0x6 ^ 0x5D ^ (0x93 ^ 0xC0));
                }
                
                @Override
                public void handleServerInfo(final S00PacketServerInfo llllllllllllIlllIIIIIlllIllIIIlI) {
                    final ServerStatusResponse llllllllllllIlllIIIIIlllIllIIllI = llllllllllllIlllIIIIIlllIllIIIlI.getResponse();
                    if (lIIIlllIlIIIIIll(llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData())) {
                        llllllllllllIlIllIllIlIlIllIIIlI.nrOfPlayers = String.valueOf(llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData().getOnlinePlayerCount());
                        if (lIIIlllIlIIIIlII(ArrayUtils.isNotEmpty((Object[])llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData().getPlayers()) ? 1 : 0)) {
                            final StringBuilder llllllllllllIlllIIIIIlllIllIIlIl = new StringBuilder();
                            final byte llllllllllllIlllIIIIIlllIlIlllII;
                            final boolean llllllllllllIlllIIIIIlllIlIlllIl = ((GameProfile[])(Object)(llllllllllllIlllIIIIIlllIlIlllII = (byte)(Object)llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData().getPlayers())).length != 0;
                            boolean llllllllllllIlllIIIIIlllIlIllllI = RealmsServerStatusPinger$1.llIIllIIlIIIIl[0] != 0;
                            "".length();
                            if (((6 + 1 + 11 + 118 ^ 68 + 93 - 44 + 73) & (0x4E ^ 0x37 ^ (0xC2 ^ 0x8D) ^ -" ".length())) <= -" ".length()) {
                                return;
                            }
                            while (!lIIIlllIlIIIIllI(llllllllllllIlllIIIIIlllIlIllllI ? 1 : 0, llllllllllllIlllIIIIIlllIlIlllIl ? 1 : 0)) {
                                final GameProfile llllllllllllIlllIIIIIlllIllIIlII = llllllllllllIlllIIIIIlllIlIlllII[llllllllllllIlllIIIIIlllIlIllllI];
                                if (lIIIlllIlIIIIlIl(llllllllllllIlllIIIIIlllIllIIlIl.length())) {
                                    llllllllllllIlllIIIIIlllIllIIlIl.append(RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[0]]);
                                    "".length();
                                }
                                llllllllllllIlllIIIIIlllIllIIlIl.append(llllllllllllIlllIIIIIlllIllIIlII.getName());
                                "".length();
                                ++llllllllllllIlllIIIIIlllIlIllllI;
                            }
                            if (lIIIlllIlIIIIlll(llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData().getPlayers().length, llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData().getOnlinePlayerCount())) {
                                if (lIIIlllIlIIIIlIl(llllllllllllIlllIIIIIlllIllIIlIl.length())) {
                                    llllllllllllIlllIIIIIlllIllIIlIl.append(RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[1]]);
                                    "".length();
                                }
                                llllllllllllIlllIIIIIlllIllIIlIl.append(RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[2]]).append(llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData().getOnlinePlayerCount() - llllllllllllIlllIIIIIlllIllIIllI.getPlayerCountData().getPlayers().length).append(RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[3]]);
                                "".length();
                            }
                            llllllllllllIlIllIllIlIlIllIIIlI.playerList = String.valueOf(llllllllllllIlllIIIIIlllIllIIlIl);
                            "".length();
                            if (" ".length() > "   ".length()) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIlIllIllIlIlIllIIIlI.playerList = RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[4]];
                    }
                    llllllllllllIlIllIllIlIlIllIIIII.sendPacket(new C01PacketPing(Realms.currentTimeMillis()));
                    this.field_154345_e = (RealmsServerStatusPinger$1.llIIllIIlIIIIl[1] != 0);
                }
                
                private static boolean lIIIlllIlIIIIlII(final int llllllllllllIlllIIIIIlllIIIlIlII) {
                    return llllllllllllIlllIIIIIlllIIIlIlII != 0;
                }
                
                private static boolean lIIIlllIlIIIIlIl(final int llllllllllllIlllIIIIIlllIIIlIIII) {
                    return llllllllllllIlllIIIIIlllIIIlIIII > 0;
                }
                
                @Override
                public void onDisconnect(final IChatComponent llllllllllllIlllIIIIIlllIlIlIlII) {
                    if (lIIIlllIlIIIlIII(this.field_154345_e ? 1 : 0)) {
                        RealmsServerStatusPinger.LOGGER.error(String.valueOf(new StringBuilder(RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[6]]).append(llllllllllllIlIllIllIlIlIlIlllIl).append(RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[7]]).append(llllllllllllIlllIIIIIlllIlIlIlII.getUnformattedText())));
                    }
                }
                
                private static String lIIIlllIIlllllll(final String llllllllllllIlllIIIIIlllIIlIIlIl, final String llllllllllllIlllIIIIIlllIIlIIlII) {
                    try {
                        final SecretKeySpec llllllllllllIlllIIIIIlllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlllIIlIIlII.getBytes(StandardCharsets.UTF_8)), RealmsServerStatusPinger$1.llIIllIIlIIIIl[8]), "DES");
                        final Cipher llllllllllllIlllIIIIIlllIIlIIlll = Cipher.getInstance("DES");
                        llllllllllllIlllIIIIIlllIIlIIlll.init(RealmsServerStatusPinger$1.llIIllIIlIIIIl[2], llllllllllllIlllIIIIIlllIIlIlIII);
                        return new String(llllllllllllIlllIIIIIlllIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlllIIIIIlllIIlIIllI) {
                        llllllllllllIlllIIIIIlllIIlIIllI.printStackTrace();
                        return null;
                    }
                }
                
                private static boolean lIIIlllIlIIIIlll(final int llllllllllllIlllIIIIIlllIIIllIIl, final int llllllllllllIlllIIIIIlllIIIllIII) {
                    return llllllllllllIlllIIIIIlllIIIllIIl < llllllllllllIlllIIIIIlllIIIllIII;
                }
                
                private static void lIIIlllIlIIIIIIl() {
                    (llIIllIIlIIIII = new String[RealmsServerStatusPinger$1.llIIllIIlIIIIl[8]])[RealmsServerStatusPinger$1.llIIllIIlIIIIl[0]] = lIIIlllIIllllllI("Yw==", "iPfZn");
                    RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[1]] = lIIIlllIIllllllI("RQ==", "OjTHj");
                    RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[2]] = lIIIlllIIlllllll("dliZw1OKXvOUogAHaYYYkQ==", "thTJZ");
                    RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[3]] = lIIIlllIIlllllll("VNZtTHKesd5W8YafNR2wVQ==", "vRIMR");
                    RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[4]] = lIIIlllIIllllllI("", "SrNcg");
                    RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[5]] = lIIIlllIIllllllI("Egc/Aj88CzU=", "TnQkL");
                    RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[6]] = lIIIlllIlIIIIIII("hTFjWotG9lxtxXqtz8tZ2Q==", "qHGqm");
                    RealmsServerStatusPinger$1.llIIllIIlIIIII[RealmsServerStatusPinger$1.llIIllIIlIIIIl[7]] = lIIIlllIIlllllll("bq2V/g48EiU=", "LUgOc");
                }
            });
            try {
                llllllllllllIlIllIllIlIlIllIIIII.sendPacket(new C00Handshake(RealmsSharedConstants.NETWORK_PROTOCOL_VERSION, llllllllllllIlIllIllIlIlIllIIIIl.getHost(), llllllllllllIlIllIllIlIlIllIIIIl.getPort(), EnumConnectionState.STATUS));
                llllllllllllIlIllIllIlIlIllIIIII.sendPacket(new C00PacketServerQuery());
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIlIllIllIlIlIlIlllll) {
                RealmsServerStatusPinger.LOGGER.error((Object)llllllllllllIlIllIllIlIlIlIlllll);
            }
        }
    }
    
    public void tick() {
        synchronized (this.connections) {
            final Iterator<NetworkManager> llllllllllllIlIllIllIlIlIlIlIIll = this.connections.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIIlIllIllIlI(llllllllllllIlIllIllIlIlIlIlIIll.hasNext() ? 1 : 0)) {
                final NetworkManager llllllllllllIlIllIllIlIlIlIlIIlI = llllllllllllIlIllIllIlIlIlIlIIll.next();
                if (lIlIIIlIllIllIll(llllllllllllIlIllIllIlIlIlIlIIlI.isChannelOpen() ? 1 : 0)) {
                    llllllllllllIlIllIllIlIlIlIlIIlI.processReceivedPackets();
                    "".length();
                    if (((40 + 72 - 79 + 98 ^ 157 + 50 - 126 + 104) & (0x4E ^ 0x2 ^ (0xF2 ^ 0x84) ^ -" ".length())) == " ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    llllllllllllIlIllIllIlIlIlIlIIll.remove();
                    llllllllllllIlIllIllIlIlIlIlIIlI.checkDisconnected();
                }
            }
            // monitorexit(this.connections)
            "".length();
            if (-(103 + 80 - 151 + 139 ^ 66 + 61 - 22 + 70) >= 0) {
                return;
            }
        }
    }
    
    public RealmsServerStatusPinger() {
        this.connections = Collections.synchronizedList((List<NetworkManager>)Lists.newArrayList());
    }
    
    private static void lIlIIIlIllIlIIIl() {
        (lllIlIlIIIllll = new String[RealmsServerStatusPinger.lllIlIlIIlIIIl[2]])[RealmsServerStatusPinger.lllIlIlIIlIIIl[0]] = lIlIIIlIllIlIIII("vdGFdIE3uI8=", "EaRUJ");
        RealmsServerStatusPinger.lllIlIlIIIllll[RealmsServerStatusPinger.lllIlIlIIlIIIl[1]] = lIlIIIlIllIlIIII("pXHFPhvD7GA/bBmUvk3Q8Q==", "idQMi");
    }
    
    private static boolean lIlIIIlIllIllIll(final int llllllllllllIlIllIllIlIlIIllIIlI) {
        return llllllllllllIlIllIllIlIlIIllIIlI != 0;
    }
    
    private static boolean lIlIIIlIllIllIIl(final Object llllllllllllIlIllIllIlIlIIllIlII) {
        return llllllllllllIlIllIllIlIlIIllIlII != null;
    }
    
    static {
        lIlIIIlIllIllIII();
        lIlIIIlIllIlIIIl();
        LOGGER = LogManager.getLogger();
    }
    
    private static void lIlIIIlIllIllIII() {
        (lllIlIlIIlIIIl = new int[4])[0] = ((0x3A ^ 0x2C ^ (0x0 ^ 0x37)) & (0x69 ^ 0x30 ^ (0x4F ^ 0x37) ^ -" ".length()));
        RealmsServerStatusPinger.lllIlIlIIlIIIl[1] = " ".length();
        RealmsServerStatusPinger.lllIlIlIIlIIIl[2] = "  ".length();
        RealmsServerStatusPinger.lllIlIlIIlIIIl[3] = (0x4 ^ 0xC);
    }
}
