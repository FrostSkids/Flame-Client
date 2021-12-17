// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.network;

import org.apache.logging.log4j.LogManager;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.client.C00PacketLoginStart;
import com.google.common.base.Charsets;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import net.minecraft.network.login.server.S03PacketEnableCompression;
import java.security.PrivateKey;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.util.UUID;
import java.math.BigInteger;
import net.minecraft.util.CryptManager;
import org.apache.commons.lang3.Validate;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.Packet;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.util.ChatComponentText;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.server.MinecraftServer;
import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.EntityPlayerMP;
import javax.crypto.SecretKey;
import org.apache.logging.log4j.Logger;
import net.minecraft.network.NetworkManager;
import java.util.Random;
import net.minecraft.util.ITickable;
import net.minecraft.network.login.INetHandlerLoginServer;

public class NetHandlerLoginServer implements INetHandlerLoginServer, ITickable
{
    private static final /* synthetic */ int[] lIIllllllIIlll;
    private static final /* synthetic */ Random RANDOM;
    private /* synthetic */ String serverId;
    public final /* synthetic */ NetworkManager networkManager;
    private static final /* synthetic */ String[] lIIllllllIIllI;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ int connectionTimer;
    private /* synthetic */ SecretKey secretKey;
    private /* synthetic */ EntityPlayerMP field_181025_l;
    private /* synthetic */ LoginState currentLoginState;
    private /* synthetic */ GameProfile loginGameProfile;
    private final /* synthetic */ MinecraftServer server;
    private final /* synthetic */ byte[] verifyToken;
    private static final /* synthetic */ AtomicInteger AUTHENTICATOR_THREAD_ID;
    
    public void closeConnection(final String lllllllllllllIIlIIlIIIIlIIIllIll) {
        try {
            NetHandlerLoginServer.logger.info(String.valueOf(new StringBuilder(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[4]]).append(this.getConnectionInfo()).append(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[5]]).append(lllllllllllllIIlIIlIIIIlIIIllIll)));
            final ChatComponentText lllllllllllllIIlIIlIIIIlIIIllIlI = new ChatComponentText(lllllllllllllIIlIIlIIIIlIIIllIll);
            this.networkManager.sendPacket(new S00PacketDisconnect(lllllllllllllIIlIIlIIIIlIIIllIlI));
            this.networkManager.closeChannel(lllllllllllllIIlIIlIIIIlIIIllIlI);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        catch (Exception lllllllllllllIIlIIlIIIIlIIIllIIl) {
            NetHandlerLoginServer.logger.error(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[1]], (Throwable)lllllllllllllIIlIIlIIIIlIIIllIIl);
        }
    }
    
    public String getConnectionInfo() {
        String s;
        if (llIlllllIIIIlIl(this.loginGameProfile)) {
            s = String.valueOf(new StringBuilder(String.valueOf(this.loginGameProfile.toString())).append(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[7]]).append(this.networkManager.getRemoteAddress().toString()).append(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[8]]));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            s = String.valueOf(this.networkManager.getRemoteAddress());
        }
        return s;
    }
    
    @Override
    public void update() {
        if (llIlllllIIIIIIl(this.currentLoginState, LoginState.READY_TO_ACCEPT)) {
            this.tryAcceptPlayer();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llIlllllIIIIIIl(this.currentLoginState, LoginState.DELAY_ACCEPT)) {
            final EntityPlayerMP lllllllllllllIIlIIlIIIIlIIlIIIlI = this.server.getConfigurationManager().getPlayerByUUID(this.loginGameProfile.getId());
            if (llIlllllIIIIIlI(lllllllllllllIIlIIlIIIIlIIlIIIlI)) {
                this.currentLoginState = LoginState.READY_TO_ACCEPT;
                this.server.getConfigurationManager().initializeConnectionToPlayer(this.networkManager, this.field_181025_l);
                this.field_181025_l = null;
            }
        }
        final int connectionTimer = this.connectionTimer;
        this.connectionTimer = connectionTimer + NetHandlerLoginServer.lIIllllllIIlll[2];
        if (llIlllllIIIIIll(connectionTimer, NetHandlerLoginServer.lIIllllllIIlll[3])) {
            this.closeConnection(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[2]]);
        }
    }
    
    private static boolean llIlllllIIIIlII(final int lllllllllllllIIlIIlIIIIIlIIllIII) {
        return lllllllllllllIIlIIlIIIIIlIIllIII == 0;
    }
    
    @Override
    public void onDisconnect(final IChatComponent lllllllllllllIIlIIlIIIIlIIIIlIIl) {
        NetHandlerLoginServer.logger.info(String.valueOf(new StringBuilder(String.valueOf(this.getConnectionInfo())).append(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[6]]).append(lllllllllllllIIlIIlIIIIlIIIIlIIl.getUnformattedText())));
    }
    
    private static String llIllllIllllllI(final String lllllllllllllIIlIIlIIIIIlIllIIIl, final String lllllllllllllIIlIIlIIIIIlIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIIIIlIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), NetHandlerLoginServer.lIIllllllIIlll[9]), "DES");
            final Cipher lllllllllllllIIlIIlIIIIIlIllIIll = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIIIIIlIllIIll.init(NetHandlerLoginServer.lIIllllllIIlll[4], lllllllllllllIIlIIlIIIIIlIllIlII);
            return new String(lllllllllllllIIlIIlIIIIIlIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIIIIlIllIIlI) {
            lllllllllllllIIlIIlIIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void llIlllllIIIIIII() {
        (lIIllllllIIlll = new int[15])[0] = ((0xFD ^ 0xBB ^ (0xF1 ^ 0x8B)) & (152 + 85 - 151 + 166 ^ 0 + 89 + 76 + 27 ^ -" ".length()));
        NetHandlerLoginServer.lIIllllllIIlll[1] = (0x6F ^ 0x6B);
        NetHandlerLoginServer.lIIllllllIIlll[2] = " ".length();
        NetHandlerLoginServer.lIIllllllIIlll[3] = (0xFFFF9A5E & 0x67F9);
        NetHandlerLoginServer.lIIllllllIIlll[4] = "  ".length();
        NetHandlerLoginServer.lIIllllllIIlll[5] = "   ".length();
        NetHandlerLoginServer.lIIllllllIIlll[6] = (66 + 149 - 45 + 15 ^ 72 + 136 - 38 + 18);
        NetHandlerLoginServer.lIIllllllIIlll[7] = (0x36 ^ 0x7 ^ (0xB3 ^ 0x84));
        NetHandlerLoginServer.lIIllllllIIlll[8] = (0xBD ^ 0xBA);
        NetHandlerLoginServer.lIIllllllIIlll[9] = (0x2C ^ 0x52 ^ (0xC9 ^ 0xBF));
        NetHandlerLoginServer.lIIllllllIIlll[10] = (0x30 ^ 0x39);
        NetHandlerLoginServer.lIIllllllIIlll[11] = (0xD9 ^ 0xA4 ^ (0xF7 ^ 0x80));
        NetHandlerLoginServer.lIIllllllIIlll[12] = (0x92 ^ 0x99);
        NetHandlerLoginServer.lIIllllllIIlll[13] = (129 + 34 - 136 + 146 ^ 116 + 72 - 38 + 11);
        NetHandlerLoginServer.lIIllllllIIlll[14] = (0x5B ^ 0x7 ^ (0xDC ^ 0x8D));
    }
    
    @Override
    public void processEncryptionResponse(final C01PacketEncryptionResponse lllllllllllllIIlIIlIIIIIllllIllI) {
        int n;
        if (llIlllllIIIIIIl(this.currentLoginState, LoginState.KEY)) {
            n = NetHandlerLoginServer.lIIllllllIIlll[2];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = NetHandlerLoginServer.lIIllllllIIlll[0];
        }
        Validate.validState((boolean)(n != 0), NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[10]], new Object[NetHandlerLoginServer.lIIllllllIIlll[0]]);
        final PrivateKey lllllllllllllIIlIIlIIIIIlllllIII = this.server.getKeyPair().getPrivate();
        if (llIlllllIIIIlII(Arrays.equals(this.verifyToken, lllllllllllllIIlIIlIIIIIllllIllI.getVerifyToken(lllllllllllllIIlIIlIIIIIlllllIII)) ? 1 : 0)) {
            throw new IllegalStateException(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[11]]);
        }
        this.secretKey = lllllllllllllIIlIIlIIIIIllllIllI.getSecretKey(lllllllllllllIIlIIlIIIIIlllllIII);
        this.currentLoginState = LoginState.AUTHENTICATING;
        this.networkManager.enableEncryption(this.secretKey);
        new Thread(String.valueOf(new StringBuilder(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[12]]).append(NetHandlerLoginServer.AUTHENTICATOR_THREAD_ID.incrementAndGet()))) {
            private static final /* synthetic */ int[] lIIlllllIllIIl;
            private static final /* synthetic */ String[] lIIlllllIlIlll;
            
            private static void llIllllIllIIlIl() {
                (lIIlllllIllIIl = new int[11])[0] = (151 + 121 - 184 + 75 ^ 71 + 141 - 166 + 133);
                NetHandlerLoginServer$2.lIIlllllIllIIl[1] = (" ".length() & ~" ".length());
                NetHandlerLoginServer$2.lIIlllllIllIIl[2] = " ".length();
                NetHandlerLoginServer$2.lIIlllllIllIIl[3] = "  ".length();
                NetHandlerLoginServer$2.lIIlllllIllIIl[4] = "   ".length();
                NetHandlerLoginServer$2.lIIlllllIllIIl[5] = (0x7F ^ 0x7B);
                NetHandlerLoginServer$2.lIIlllllIllIIl[6] = (0xC3 ^ 0xC6);
                NetHandlerLoginServer$2.lIIlllllIllIIl[7] = (0x67 ^ 0x61);
                NetHandlerLoginServer$2.lIIlllllIllIIl[8] = (0x9 ^ 0xE);
                NetHandlerLoginServer$2.lIIlllllIllIIl[9] = (0x7B ^ 0x73);
                NetHandlerLoginServer$2.lIIlllllIllIIl[10] = (0x13 ^ 0x1A);
            }
            
            static {
                llIllllIllIIlIl();
                llIllllIllIIIlI();
            }
            
            private static String llIllllIllIIIIl(String lllllllllllllIIlIIlIIIllIIIlIlII, final String lllllllllllllIIlIIlIIIllIIIllIII) {
                lllllllllllllIIlIIlIIIllIIIlIlII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIIIllIIIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlIIlIIIllIIIlIlll = new StringBuilder();
                final char[] lllllllllllllIIlIIlIIIllIIIlIllI = lllllllllllllIIlIIlIIIllIIIllIII.toCharArray();
                int lllllllllllllIIlIIlIIIllIIIlIlIl = NetHandlerLoginServer$2.lIIlllllIllIIl[1];
                final String lllllllllllllIIlIIlIIIllIIIIllll = (Object)((String)lllllllllllllIIlIIlIIIllIIIlIlII).toCharArray();
                final byte lllllllllllllIIlIIlIIIllIIIIlllI = (byte)lllllllllllllIIlIIlIIIllIIIIllll.length;
                short lllllllllllllIIlIIlIIIllIIIIllIl = (short)NetHandlerLoginServer$2.lIIlllllIllIIl[1];
                while (llIllllIllIlIII(lllllllllllllIIlIIlIIIllIIIIllIl, lllllllllllllIIlIIlIIIllIIIIlllI)) {
                    final char lllllllllllllIIlIIlIIIllIIIllIlI = lllllllllllllIIlIIlIIIllIIIIllll[lllllllllllllIIlIIlIIIllIIIIllIl];
                    lllllllllllllIIlIIlIIIllIIIlIlll.append((char)(lllllllllllllIIlIIlIIIllIIIllIlI ^ lllllllllllllIIlIIlIIIllIIIlIllI[lllllllllllllIIlIIlIIIllIIIlIlIl % lllllllllllllIIlIIlIIIllIIIlIllI.length]));
                    "".length();
                    ++lllllllllllllIIlIIlIIIllIIIlIlIl;
                    ++lllllllllllllIIlIIlIIIllIIIIllIl;
                    "".length();
                    if (((119 + 43 - 40 + 24 ^ 40 + 86 - 41 + 113) & (12 + 63 + 69 + 70 ^ 64 + 107 - 170 + 129 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlIIlIIIllIIIlIlll);
            }
            
            private static String llIllllIlIllllI(final String lllllllllllllIIlIIlIIIlIllllIlIl, final String lllllllllllllIIlIIlIIIlIllllIlII) {
                try {
                    final SecretKeySpec lllllllllllllIIlIIlIIIlIlllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIlIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIIlIIIlIlllllIIl = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIIlIIIlIlllllIIl.init(NetHandlerLoginServer$2.lIIlllllIllIIl[3], lllllllllllllIIlIIlIIIlIlllllIlI);
                    return new String(lllllllllllllIIlIIlIIIlIlllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIlIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIIlIIIlIlllllIII) {
                    lllllllllllllIIlIIlIIIlIlllllIII.printStackTrace();
                    return null;
                }
            }
            
            private static boolean llIllllIllIlIII(final int lllllllllllllIIlIIlIIIlIlllIllll, final int lllllllllllllIIlIIlIIIlIlllIlllI) {
                return lllllllllllllIIlIIlIIIlIlllIllll < lllllllllllllIIlIIlIIIlIlllIlllI;
            }
            
            private static boolean llIllllIllIIlll(final int lllllllllllllIIlIIlIIIlIlllIlIlI) {
                return lllllllllllllIIlIIlIIIlIlllIlIlI != 0;
            }
            
            private static void llIllllIllIIIlI() {
                (lIIlllllIlIlll = new String[NetHandlerLoginServer$2.lIIlllllIllIIl[10]])[NetHandlerLoginServer$2.lIIlllllIllIIl[1]] = llIllllIlIlllII("1gfpT1CIoAdNjP48kSQfPQ==", "LeJKx");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[2]] = llIllllIlIllllI("NbrqK8TrN6U=", "AwgiN");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[3]] = llIllllIlIlllII("IW0DGXOrx+SSqvuABiyH4MIDa7AzY2tQ/ehyii8bo+72flnpF7OHlktP3gaLt0NZyG3ME04w5B0=", "nUniC");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[4]] = llIllllIlIllllI("YMkxs/7OtZhw1G+qraBy8g78Bj1VWvGpl2r61mcmD3M=", "owbaG");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[5]] = llIllllIlIllllI("wul4PlaZCm1MfIfQNDr9KQ==", "EQZpi");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[6]] = llIllllIlIlllII("W38WZqxV6ZRYIUVqwiTmFg9jaTaXb017v5XPjWCikK61zuePck1rQw==", "xgmVb");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[7]] = llIllllIllIIIIl("KxYiCQgEFz8CDB4KOQ9NGQYkFwgYEHYAHw9DMg4aBEM0FBlKFD8NAUoPMxVNHgszDE0DDXYAAxMUNxhM", "jcVam");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[8]] = llIllllIllIIIIl("Fjo3JgI5OyotBiMmLCBHJCoxOAIlPGMvFTJvJyEQOWFjHgsyLjArRyM9Om4GMC4qIEc7LjcrFXtvMCEVJTZi", "WOCNg");
                NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[9]] = llIllllIlIlllII("6boZQ12hdsBjIebVNqbht2QDcXX29CBoJ8o/hD5Xs8Uhyle+R8xxdiN1gsU9cfc92K+QXxuXGJ3t//m0ChpS8A==", "oonlo");
            }
            
            private static boolean llIllllIllIIllI(final Object lllllllllllllIIlIIlIIIlIlllIllII) {
                return lllllllllllllIIlIIlIIIlIlllIllII != null;
            }
            
            @Override
            public void run() {
                final GameProfile lllllllllllllIIlIIlIIIllIIlIlIIl = NetHandlerLoginServer.this.loginGameProfile;
                try {
                    final String lllllllllllllIIlIIlIIIllIIlIlIII = new BigInteger(CryptManager.getServerIdHash(NetHandlerLoginServer.this.serverId, NetHandlerLoginServer.this.server.getKeyPair().getPublic(), NetHandlerLoginServer.this.secretKey)).toString(NetHandlerLoginServer$2.lIIlllllIllIIl[0]);
                    NetHandlerLoginServer.access$4(NetHandlerLoginServer.this, NetHandlerLoginServer.this.server.getMinecraftSessionService().hasJoinedServer(new GameProfile((UUID)null, lllllllllllllIIlIIlIIIllIIlIlIIl.getName()), lllllllllllllIIlIIlIIIllIIlIlIII));
                    if (llIllllIllIIllI(NetHandlerLoginServer.this.loginGameProfile)) {
                        NetHandlerLoginServer.logger.info(String.valueOf(new StringBuilder(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[1]]).append(NetHandlerLoginServer.this.loginGameProfile.getName()).append(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[2]]).append(NetHandlerLoginServer.this.loginGameProfile.getId())));
                        NetHandlerLoginServer.access$6(NetHandlerLoginServer.this, LoginState.READY_TO_ACCEPT);
                        "".length();
                        if (((0xEA ^ 0xC6 ^ (0x4B ^ 0x29)) & (0x2F ^ 0x3B ^ (0x10 ^ 0x4A) ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    else if (llIllllIllIIlll(NetHandlerLoginServer.this.server.isSinglePlayer() ? 1 : 0)) {
                        NetHandlerLoginServer.logger.warn(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[3]]);
                        NetHandlerLoginServer.access$4(NetHandlerLoginServer.this, NetHandlerLoginServer.this.getOfflineProfile(lllllllllllllIIlIIlIIIllIIlIlIIl));
                        NetHandlerLoginServer.access$6(NetHandlerLoginServer.this, LoginState.READY_TO_ACCEPT);
                        "".length();
                        if ("  ".length() < " ".length()) {
                            return;
                        }
                    }
                    else {
                        NetHandlerLoginServer.this.closeConnection(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[4]]);
                        NetHandlerLoginServer.logger.error(String.valueOf(new StringBuilder(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[5]]).append(NetHandlerLoginServer.this.loginGameProfile.getName()).append(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[6]])));
                        "".length();
                        if ("  ".length() <= ((0x30 ^ 0x3F) & ~(0x1A ^ 0x15))) {
                            return;
                        }
                    }
                }
                catch (AuthenticationUnavailableException lllllllllllllIIlIIlIIIllIIlIIlll) {
                    if (llIllllIllIIlll(NetHandlerLoginServer.this.server.isSinglePlayer() ? 1 : 0)) {
                        NetHandlerLoginServer.logger.warn(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[7]]);
                        NetHandlerLoginServer.access$4(NetHandlerLoginServer.this, NetHandlerLoginServer.this.getOfflineProfile(lllllllllllllIIlIIlIIIllIIlIlIIl));
                        NetHandlerLoginServer.access$6(NetHandlerLoginServer.this, LoginState.READY_TO_ACCEPT);
                        "".length();
                        if ("   ".length() < -" ".length()) {
                            return;
                        }
                    }
                    else {
                        NetHandlerLoginServer.this.closeConnection(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[8]]);
                        NetHandlerLoginServer.logger.error(NetHandlerLoginServer$2.lIIlllllIlIlll[NetHandlerLoginServer$2.lIIlllllIllIIl[9]]);
                    }
                }
            }
            
            private static String llIllllIlIlllII(final String lllllllllllllIIlIIlIIIllIIIIIIlI, final String lllllllllllllIIlIIlIIIllIIIIIIll) {
                try {
                    final SecretKeySpec lllllllllllllIIlIIlIIIllIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), NetHandlerLoginServer$2.lIIlllllIllIIl[9]), "DES");
                    final Cipher lllllllllllllIIlIIlIIIllIIIIIllI = Cipher.getInstance("DES");
                    lllllllllllllIIlIIlIIIllIIIIIllI.init(NetHandlerLoginServer$2.lIIlllllIllIIl[3], lllllllllllllIIlIIlIIIllIIIIIlll);
                    return new String(lllllllllllllIIlIIlIIIllIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIllIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIIlIIIllIIIIIlIl) {
                    lllllllllllllIIlIIlIIIllIIIIIlIl.printStackTrace();
                    return null;
                }
            }
        }.start();
    }
    
    private static String llIllllIlllllIl(final String lllllllllllllIIlIIlIIIIIlIlllllI, final String lllllllllllllIIlIIlIIIIIlIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIIIIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIIIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIIIIIllIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIIIIIllIIIIII.init(NetHandlerLoginServer.lIIllllllIIlll[4], lllllllllllllIIlIIlIIIIIllIIIIIl);
            return new String(lllllllllllllIIlIIlIIIIIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIIIIlIllllll) {
            lllllllllllllIIlIIlIIIIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllllIIIIIIl(final Object lllllllllllllIIlIIlIIIIIlIlIIIIl, final Object lllllllllllllIIlIIlIIIIIlIlIIIII) {
        return lllllllllllllIIlIIlIIIIIlIlIIIIl == lllllllllllllIIlIIlIIIIIlIlIIIII;
    }
    
    static /* synthetic */ void access$4(final NetHandlerLoginServer lllllllllllllIIlIIlIIIIIlllIIIll, final GameProfile lllllllllllllIIlIIlIIIIIlllIIIlI) {
        lllllllllllllIIlIIlIIIIIlllIIIll.loginGameProfile = lllllllllllllIIlIIlIIIIIlllIIIlI;
    }
    
    private static boolean llIlllllIIIIIlI(final Object lllllllllllllIIlIIlIIIIIlIIlllII) {
        return lllllllllllllIIlIIlIIIIIlIIlllII == null;
    }
    
    private static boolean llIlllllIIIIlIl(final Object lllllllllllllIIlIIlIIIIIlIIllllI) {
        return lllllllllllllIIlIIlIIIIIlIIllllI != null;
    }
    
    private static boolean llIlllllIIIIIll(final int lllllllllllllIIlIIlIIIIIlIlIlIIl, final int lllllllllllllIIlIIlIIIIIlIlIlIII) {
        return lllllllllllllIIlIIlIIIIIlIlIlIIl == lllllllllllllIIlIIlIIIIIlIlIlIII;
    }
    
    public void tryAcceptPlayer() {
        if (llIlllllIIIIlII(this.loginGameProfile.isComplete() ? 1 : 0)) {
            this.loginGameProfile = this.getOfflineProfile(this.loginGameProfile);
        }
        final String lllllllllllllIIlIIlIIIIlIIIlIIIl = this.server.getConfigurationManager().allowUserToConnect(this.networkManager.getRemoteAddress(), this.loginGameProfile);
        if (llIlllllIIIIlIl(lllllllllllllIIlIIlIIIIlIIIlIIIl)) {
            this.closeConnection(lllllllllllllIIlIIlIIIIlIIIlIIIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.currentLoginState = LoginState.ACCEPTED;
            if (llIlllllIIIIllI(this.server.getNetworkCompressionTreshold()) && llIlllllIIIIlII(this.networkManager.isLocalChannel() ? 1 : 0)) {
                this.networkManager.sendPacket(new S03PacketEnableCompression(this.server.getNetworkCompressionTreshold()), new ChannelFutureListener() {
                    @Override
                    public void operationComplete(final ChannelFuture llllllllllllIlllIIllIIIllIIlIIII) throws Exception {
                        NetHandlerLoginServer.this.networkManager.setCompressionTreshold(NetHandlerLoginServer.this.server.getNetworkCompressionTreshold());
                    }
                }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[NetHandlerLoginServer.lIIllllllIIlll[0]]);
            }
            this.networkManager.sendPacket(new S02PacketLoginSuccess(this.loginGameProfile));
            final EntityPlayerMP lllllllllllllIIlIIlIIIIlIIIlIIII = this.server.getConfigurationManager().getPlayerByUUID(this.loginGameProfile.getId());
            if (llIlllllIIIIlIl(lllllllllllllIIlIIlIIIIlIIIlIIII)) {
                this.currentLoginState = LoginState.DELAY_ACCEPT;
                this.field_181025_l = this.server.getConfigurationManager().createPlayerForUser(this.loginGameProfile);
                "".length();
                if ("  ".length() == (0x5E ^ 0x5A)) {
                    return;
                }
            }
            else {
                this.server.getConfigurationManager().initializeConnectionToPlayer(this.networkManager, this.server.getConfigurationManager().createPlayerForUser(this.loginGameProfile));
            }
        }
    }
    
    private static boolean llIlllllIIIlIII(final int lllllllllllllIIlIIlIIIIIlIlIIlIl, final int lllllllllllllIIlIIlIIIIIlIlIIlII) {
        return lllllllllllllIIlIIlIIIIIlIlIIlIl < lllllllllllllIIlIIlIIIIIlIlIIlII;
    }
    
    private static boolean llIlllllIIIIlll(final int lllllllllllllIIlIIlIIIIIlIIllIlI) {
        return lllllllllllllIIlIIlIIIIIlIIllIlI != 0;
    }
    
    public NetHandlerLoginServer(final MinecraftServer lllllllllllllIIlIIlIIIIlIIlIlIlI, final NetworkManager lllllllllllllIIlIIlIIIIlIIlIIllI) {
        this.verifyToken = new byte[NetHandlerLoginServer.lIIllllllIIlll[1]];
        this.currentLoginState = LoginState.HELLO;
        this.serverId = NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[0]];
        this.server = lllllllllllllIIlIIlIIIIlIIlIlIlI;
        this.networkManager = lllllllllllllIIlIIlIIIIlIIlIIllI;
        NetHandlerLoginServer.RANDOM.nextBytes(this.verifyToken);
    }
    
    protected GameProfile getOfflineProfile(final GameProfile lllllllllllllIIlIIlIIIIIlllIllll) {
        final UUID lllllllllllllIIlIIlIIIIIllllIIII = UUID.nameUUIDFromBytes(String.valueOf(new StringBuilder(NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[13]]).append(lllllllllllllIIlIIlIIIIIlllIllll.getName())).getBytes(Charsets.UTF_8));
        return new GameProfile(lllllllllllllIIlIIlIIIIIllllIIII, lllllllllllllIIlIIlIIIIIlllIllll.getName());
    }
    
    private static boolean llIlllllIIIIllI(final int lllllllllllllIIlIIlIIIIIlIIlIllI) {
        return lllllllllllllIIlIIlIIIIIlIIlIllI >= 0;
    }
    
    @Override
    public void processLoginStart(final C00PacketLoginStart lllllllllllllIIlIIlIIIIlIIIIIIII) {
        int n;
        if (llIlllllIIIIIIl(this.currentLoginState, LoginState.HELLO)) {
            n = NetHandlerLoginServer.lIIllllllIIlll[2];
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            n = NetHandlerLoginServer.lIIllllllIIlll[0];
        }
        Validate.validState((boolean)(n != 0), NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[9]], new Object[NetHandlerLoginServer.lIIllllllIIlll[0]]);
        this.loginGameProfile = lllllllllllllIIlIIlIIIIlIIIIIIII.getProfile();
        if (llIlllllIIIIlll(this.server.isServerInOnlineMode() ? 1 : 0) && llIlllllIIIIlII(this.networkManager.isLocalChannel() ? 1 : 0)) {
            this.currentLoginState = LoginState.KEY;
            this.networkManager.sendPacket(new S01PacketEncryptionRequest(this.serverId, this.server.getKeyPair().getPublic(), this.verifyToken));
            "".length();
            if ((0x40 ^ 0x77 ^ (0x1E ^ 0x2C)) <= 0) {
                return;
            }
        }
        else {
            this.currentLoginState = LoginState.READY_TO_ACCEPT;
        }
    }
    
    private static void llIllllIlllllll() {
        (lIIllllllIIllI = new String[NetHandlerLoginServer.lIIllllllIIlll[14]])[NetHandlerLoginServer.lIIllllllIIlll[0]] = llIllllIlllllII("", "gCqUn");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[2]] = llIllllIlllllII("PyoYIUcfKhhqCwQrEGoTBGUbJQBLLBk=", "kEwJg");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[4]] = llIllllIlllllIl("xEYvZBTV2J0NGF6Q+SwJZA==", "XllDj");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[5]] = llIllllIlllllII("UUk=", "kiKPp");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[1]] = llIllllIlllllII("ITkVOyZEPA89OBc/RzA9FygIOjoBKBM9OgNrFzg1HS4V", "dKgTT");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[6]] = llIllllIlllllIl("MGO5akvFtd8QRrTXZubXQwM1S1Y3L0CG", "nMyIB");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[7]] = llIllllIllllllI("wGElNW7KOwg=", "vmTPz");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[8]] = llIllllIllllllI("4y7YITIg1G8=", "VOTPB");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[9]] = llIllllIllllllI("pkrfHCk7oIkhVoXGhhF4YQMiiJnD//Q+", "krTrG");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[10]] = llIllllIllllllI("YCBPfvalEbkrcXTASFuFY2H1WuYU8Hhx", "GWQso");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[11]] = llIllllIlllllIl("oMJEFmCrMISIOJYn6GjNwA==", "FizEc");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[12]] = llIllllIlllllIl("a2YS7+coOHrErHTxNxoLZNfDjG+12FbL", "AYMnA");
        NetHandlerLoginServer.lIIllllllIIllI[NetHandlerLoginServer.lIIllllllIIlll[13]] = llIllllIlllllIl("dB4tnL91V3B4jgdncb7lHA==", "WbTuV");
    }
    
    static {
        llIlllllIIIIIII();
        llIllllIlllllll();
        AUTHENTICATOR_THREAD_ID = new AtomicInteger(NetHandlerLoginServer.lIIllllllIIlll[0]);
        logger = LogManager.getLogger();
        RANDOM = new Random();
    }
    
    private static String llIllllIlllllII(String lllllllllllllIIlIIlIIIIIllIIlllI, final String lllllllllllllIIlIIlIIIIIllIlIIlI) {
        lllllllllllllIIlIIlIIIIIllIIlllI = new String(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIIIllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIIIIIllIlIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIIlIIIIIllIlIIII = lllllllllllllIIlIIlIIIIIllIlIIlI.toCharArray();
        int lllllllllllllIIlIIlIIIIIllIIllll = NetHandlerLoginServer.lIIllllllIIlll[0];
        final char lllllllllllllIIlIIlIIIIIllIIlIIl = (Object)lllllllllllllIIlIIlIIIIIllIIlllI.toCharArray();
        final short lllllllllllllIIlIIlIIIIIllIIlIII = (short)lllllllllllllIIlIIlIIIIIllIIlIIl.length;
        String lllllllllllllIIlIIlIIIIIllIIIlll = (String)NetHandlerLoginServer.lIIllllllIIlll[0];
        while (llIlllllIIIlIII((int)lllllllllllllIIlIIlIIIIIllIIIlll, lllllllllllllIIlIIlIIIIIllIIlIII)) {
            final char lllllllllllllIIlIIlIIIIIllIlIlII = lllllllllllllIIlIIlIIIIIllIIlIIl[lllllllllllllIIlIIlIIIIIllIIIlll];
            lllllllllllllIIlIIlIIIIIllIlIIIl.append((char)(lllllllllllllIIlIIlIIIIIllIlIlII ^ lllllllllllllIIlIIlIIIIIllIlIIII[lllllllllllllIIlIIlIIIIIllIIllll % lllllllllllllIIlIIlIIIIIllIlIIII.length]));
            "".length();
            ++lllllllllllllIIlIIlIIIIIllIIllll;
            ++lllllllllllllIIlIIlIIIIIllIIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIIIIIllIlIIIl);
    }
    
    static /* synthetic */ void access$6(final NetHandlerLoginServer lllllllllllllIIlIIlIIIIIllIlllll, final LoginState lllllllllllllIIlIIlIIIIIllIllllI) {
        lllllllllllllIIlIIlIIIIIllIlllll.currentLoginState = lllllllllllllIIlIIlIIIIIllIllllI;
    }
    
    enum LoginState
    {
        DELAY_ACCEPT(LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[4]], LoginState.lIlIIlIIIIllIl[4]), 
        HELLO(LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[0]], LoginState.lIlIIlIIIIllIl[0]);
        
        private static final /* synthetic */ int[] lIlIIlIIIIllIl;
        
        KEY(LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[1]], LoginState.lIlIIlIIIIllIl[1]), 
        ACCEPTED(LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[5]], LoginState.lIlIIlIIIIllIl[5]), 
        READY_TO_ACCEPT(LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[3]], LoginState.lIlIIlIIIIllIl[3]), 
        AUTHENTICATING(LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[2]], LoginState.lIlIIlIIIIllIl[2]);
        
        private static final /* synthetic */ String[] lIlIIlIIIIllII;
        
        static {
            lllIIlIIlllllIl();
            lllIIlIIlllllII();
            final LoginState[] enum$VALUES = new LoginState[LoginState.lIlIIlIIIIllIl[6]];
            enum$VALUES[LoginState.lIlIIlIIIIllIl[0]] = LoginState.HELLO;
            enum$VALUES[LoginState.lIlIIlIIIIllIl[1]] = LoginState.KEY;
            enum$VALUES[LoginState.lIlIIlIIIIllIl[2]] = LoginState.AUTHENTICATING;
            enum$VALUES[LoginState.lIlIIlIIIIllIl[3]] = LoginState.READY_TO_ACCEPT;
            enum$VALUES[LoginState.lIlIIlIIIIllIl[4]] = LoginState.DELAY_ACCEPT;
            enum$VALUES[LoginState.lIlIIlIIIIllIl[5]] = LoginState.ACCEPTED;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lllIIlIIllllIlI(final String lllllllllllllIIIlllIIlIllllIIlII, final String lllllllllllllIIIlllIIlIllllIIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIIlllIIlIllllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlllIIlIllllIlIII = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlllIIlIllllIlIII.init(LoginState.lIlIIlIIIIllIl[2], lllllllllllllIIIlllIIlIllllIlIIl);
                return new String(lllllllllllllIIIlllIIlIllllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlllIIlIllllIIlll) {
                lllllllllllllIIIlllIIlIllllIIlll.printStackTrace();
                return null;
            }
        }
        
        private static void lllIIlIIlllllII() {
            (lIlIIlIIIIllII = new String[LoginState.lIlIIlIIIIllIl[6]])[LoginState.lIlIIlIIIIllIl[0]] = lllIIlIIllllIIl("Pyg8ND0=", "wmpxr");
            LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[1]] = lllIIlIIllllIlI("WmIPWHUI3OQ=", "jDkDK");
            LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[2]] = lllIIlIIllllIll("H3+X28eWWowmg2J9R65r1w==", "CBhGV");
            LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[3]] = lllIIlIIllllIll("lKRzq5/y35zDDox7Vzw4hg==", "mHyuY");
            LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[4]] = lllIIlIIllllIlI("d4hzByfdtC/Jl4c3EqWPgw==", "cYSIv");
            LoginState.lIlIIlIIIIllII[LoginState.lIlIIlIIIIllIl[5]] = lllIIlIIllllIIl("OTIQJh0sNBc=", "xqScM");
        }
        
        private static String lllIIlIIllllIll(final String lllllllllllllIIIlllIIllIIIIIlIIl, final String lllllllllllllIIIlllIIllIIIIIlIII) {
            try {
                final SecretKeySpec lllllllllllllIIIlllIIllIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIllIIIIIlIII.getBytes(StandardCharsets.UTF_8)), LoginState.lIlIIlIIIIllIl[7]), "DES");
                final Cipher lllllllllllllIIIlllIIllIIIIIllIl = Cipher.getInstance("DES");
                lllllllllllllIIIlllIIllIIIIIllIl.init(LoginState.lIlIIlIIIIllIl[2], lllllllllllllIIIlllIIllIIIIIlllI);
                return new String(lllllllllllllIIIlllIIllIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIllIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlllIIllIIIIIllII) {
                lllllllllllllIIIlllIIllIIIIIllII.printStackTrace();
                return null;
            }
        }
        
        private LoginState(final String lllllllllllllIIIlllIIllIIIIlllII, final int lllllllllllllIIIlllIIllIIIIllIll) {
        }
        
        private static boolean lllIIlIIllllllI(final int lllllllllllllIIIlllIIlIlllIllllI, final int lllllllllllllIIIlllIIlIlllIlllIl) {
            return lllllllllllllIIIlllIIlIlllIllllI < lllllllllllllIIIlllIIlIlllIlllIl;
        }
        
        private static void lllIIlIIlllllIl() {
            (lIlIIlIIIIllIl = new int[8])[0] = ((0xD ^ 0x4F) & ~(0x14 ^ 0x56));
            LoginState.lIlIIlIIIIllIl[1] = " ".length();
            LoginState.lIlIIlIIIIllIl[2] = "  ".length();
            LoginState.lIlIIlIIIIllIl[3] = "   ".length();
            LoginState.lIlIIlIIIIllIl[4] = (193 + 164 - 272 + 111 ^ 21 + 36 + 42 + 93);
            LoginState.lIlIIlIIIIllIl[5] = (81 + 13 - 6 + 87 ^ 140 + 36 - 133 + 127);
            LoginState.lIlIIlIIIIllIl[6] = (0x21 ^ 0x27);
            LoginState.lIlIIlIIIIllIl[7] = (0x5C ^ 0x54);
        }
        
        private static String lllIIlIIllllIIl(String lllllllllllllIIIlllIIlIlllllIllI, final String lllllllllllllIIIlllIIlIllllllIlI) {
            lllllllllllllIIIlllIIlIlllllIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIlllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIlllIIlIllllllIIl = new StringBuilder();
            final char[] lllllllllllllIIIlllIIlIllllllIII = lllllllllllllIIIlllIIlIllllllIlI.toCharArray();
            int lllllllllllllIIIlllIIlIlllllIlll = LoginState.lIlIIlIIIIllIl[0];
            final int lllllllllllllIIIlllIIlIlllllIIIl = (Object)lllllllllllllIIIlllIIlIlllllIllI.toCharArray();
            final boolean lllllllllllllIIIlllIIlIlllllIIII = lllllllllllllIIIlllIIlIlllllIIIl.length != 0;
            long lllllllllllllIIIlllIIlIllllIllll = LoginState.lIlIIlIIIIllIl[0];
            while (lllIIlIIllllllI((int)lllllllllllllIIIlllIIlIllllIllll, lllllllllllllIIIlllIIlIlllllIIII ? 1 : 0)) {
                final char lllllllllllllIIIlllIIlIlllllllII = lllllllllllllIIIlllIIlIlllllIIIl[lllllllllllllIIIlllIIlIllllIllll];
                lllllllllllllIIIlllIIlIllllllIIl.append((char)(lllllllllllllIIIlllIIlIlllllllII ^ lllllllllllllIIIlllIIlIllllllIII[lllllllllllllIIIlllIIlIlllllIlll % lllllllllllllIIIlllIIlIllllllIII.length]));
                "".length();
                ++lllllllllllllIIIlllIIlIlllllIlll;
                ++lllllllllllllIIIlllIIlIllllIllll;
                "".length();
                if (-" ".length() >= " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIlllIIlIllllllIIl);
        }
    }
}
