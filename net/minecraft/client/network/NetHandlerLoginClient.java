// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.network;

import net.minecraft.network.INetHandler;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import net.minecraft.client.gui.GuiDisconnected;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.network.login.server.S00PacketDisconnect;
import org.apache.logging.log4j.LogManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.security.PublicKey;
import net.minecraft.network.Packet;
import javax.crypto.SecretKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import com.mojang.authlib.exceptions.AuthenticationException;
import java.math.BigInteger;
import net.minecraft.util.CryptManager;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S03PacketEnableCompression;
import org.apache.logging.log4j.Logger;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.login.INetHandlerLoginClient;

public class NetHandlerLoginClient implements INetHandlerLoginClient
{
    private final /* synthetic */ NetworkManager networkManager;
    private static final /* synthetic */ String[] llIIIIlllllIIl;
    private final /* synthetic */ Minecraft mc;
    private final /* synthetic */ GuiScreen previousGuiScreen;
    private static final /* synthetic */ int[] llIIIIlllllllI;
    private /* synthetic */ GameProfile gameProfile;
    private static final /* synthetic */ Logger logger;
    
    private static void lIIIlIIIlIIlIlII() {
        (llIIIIlllllIIl = new String[NetHandlerLoginClient.llIIIIlllllllI[8]])[NetHandlerLoginClient.llIIIIlllllllI[1]] = lIIIlIIIlIIIlIII("0qk7DiIMJmmM+TObOQQR1pTo8m8PrejdXgeWOpIsIDRU7yL8cVwKSQye3gmzV0BnZFZiC8xR3rfjpwTXpqNjQQ==", "KzYMG");
        NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[2]] = lIIIlIIIlIIIlIII("kupDRSSKnQKv/F0m6zBF8lXBW+kEvA05WW2X7Bq6sAk=", "Afbyb");
        NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[3]] = lIIIlIIIlIIIlIII("Dgxpc/hBfZczBymra5fynkBbFwEHH5Bf4TNUgwQPVRALFwH2ctizsM4XWcJJvbtx", "rXFTU");
        NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[4]] = lIIIlIIIlIIIlIIl("L7Cl+VcawqsKGOy6UwZJaaiCjLxkNvvW6JVj51sNKDk=", "nurnY");
        NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[5]] = lIIIlIIIlIIlIIlI("Fw4iDA0dCTQMFl0LPggLHSEwBg4WAxgBBBxJOAEUEgs4CzEWFCIGDR0=", "sgQob");
        NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[6]] = lIIIlIIIlIIIlIIl("z4MjOxN1I3tu7McfLuNpgQtIjhBtfknpUH0jOTG1hGE=", "PwzDw");
        NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[7]] = lIIIlIIIlIIIlIII("Sj0eUFoByl0og5JcV6nyiA==", "YQDMI");
    }
    
    @Override
    public void handleEnableCompression(final S03PacketEnableCompression llllllllllllIlllIllIIlIlIlIllIII) {
        if (lIIIlIIIlIIllIlI(this.networkManager.isLocalChannel() ? 1 : 0)) {
            this.networkManager.setCompressionTreshold(llllllllllllIlllIllIIlIlIlIllIII.getCompressionTreshold());
        }
    }
    
    @Override
    public void handleEncryptionRequest(final S01PacketEncryptionRequest llllllllllllIlllIllIIlIlIlllIllI) {
        final SecretKey llllllllllllIlllIllIIlIlIlllllll = CryptManager.createNewSharedKey();
        final String llllllllllllIlllIllIIlIlIllllllI = llllllllllllIlllIllIIlIlIlllIllI.getServerId();
        final PublicKey llllllllllllIlllIllIIlIlIlllllIl = llllllllllllIlllIllIIlIlIlllIllI.getPublicKey();
        final String llllllllllllIlllIllIIlIlIlllllII = new BigInteger(CryptManager.getServerIdHash(llllllllllllIlllIllIIlIlIllllllI, llllllllllllIlllIllIIlIlIlllllIl, llllllllllllIlllIllIIlIlIlllllll)).toString(NetHandlerLoginClient.llIIIIlllllllI[0]);
        Label_0393: {
            if (lIIIlIIIlIIllIII(this.mc.getCurrentServerData()) && lIIIlIIIlIIllIIl(this.mc.getCurrentServerData().func_181041_d() ? 1 : 0)) {
                try {
                    this.getSessionService().joinServer(this.mc.getSession().getProfile(), this.mc.getSession().getToken(), llllllllllllIlllIllIIlIlIlllllII);
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                    break Label_0393;
                }
                catch (AuthenticationException llllllllllllIlllIllIIlIlIllllIll) {
                    NetHandlerLoginClient.logger.warn(NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[1]]);
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    break Label_0393;
                }
            }
            try {
                this.getSessionService().joinServer(this.mc.getSession().getProfile(), this.mc.getSession().getToken(), llllllllllllIlllIllIIlIlIlllllII);
                "".length();
                if (((0xA3 ^ 0xA8) & ~(0x27 ^ 0x2C)) >= "   ".length()) {
                    return;
                }
            }
            catch (AuthenticationUnavailableException llllllllllllIlllIllIIlIlIllllIlI) {
                final NetworkManager networkManager = this.networkManager;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[2]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[NetHandlerLoginClient.llIIIIlllllllI[2]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerLoginClient.llIIIIlllllllI[1]] = new ChatComponentTranslation(NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[3]], new Object[NetHandlerLoginClient.llIIIIlllllllI[1]]);
                networkManager.closeChannel(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
                return;
            }
            catch (InvalidCredentialsException llllllllllllIlllIllIIlIlIllllIIl) {
                final NetworkManager networkManager2 = this.networkManager;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[4]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[NetHandlerLoginClient.llIIIIlllllllI[2]];
                lllllllllllllIlIIlIlllIIlIIIIIIl2[NetHandlerLoginClient.llIIIIlllllllI[1]] = new ChatComponentTranslation(NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[5]], new Object[NetHandlerLoginClient.llIIIIlllllllI[1]]);
                networkManager2.closeChannel(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2));
                return;
            }
            catch (AuthenticationException llllllllllllIlllIllIIlIlIllllIII) {
                final NetworkManager networkManager3 = this.networkManager;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI3 = NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[6]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl3 = new Object[NetHandlerLoginClient.llIIIIlllllllI[2]];
                lllllllllllllIlIIlIlllIIlIIIIIIl3[NetHandlerLoginClient.llIIIIlllllllI[1]] = llllllllllllIlllIllIIlIlIllllIII.getMessage();
                networkManager3.closeChannel(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI3, lllllllllllllIlIIlIlllIIlIIIIIIl3));
                return;
            }
        }
        this.networkManager.sendPacket(new C01PacketEncryptionResponse(llllllllllllIlllIllIIlIlIlllllll, llllllllllllIlllIllIIlIlIlllllIl, llllllllllllIlllIllIIlIlIlllIllI.getVerifyToken()), new GenericFutureListener<Future<? super Void>>() {
            @Override
            public void operationComplete(final Future<? super Void> llllllllllllIllllIlllIllIIIIIIlI) throws Exception {
                NetHandlerLoginClient.this.networkManager.enableEncryption(llllllllllllIlllIllIIlIlIlllllll);
            }
        }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[NetHandlerLoginClient.llIIIIlllllllI[1]]);
    }
    
    private static boolean lIIIlIIIlIIllIIl(final int llllllllllllIlllIllIIlIlIIIllIlI) {
        return llllllllllllIlllIllIIlIlIIIllIlI != 0;
    }
    
    private static String lIIIlIIIlIIlIIlI(String llllllllllllIlllIllIIlIlIIllIlll, final String llllllllllllIlllIllIIlIlIIllIllI) {
        llllllllllllIlllIllIIlIlIIllIlll = new String(Base64.getDecoder().decode(llllllllllllIlllIllIIlIlIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIlIlIIlllIlI = new StringBuilder();
        final char[] llllllllllllIlllIllIIlIlIIlllIIl = llllllllllllIlllIllIIlIlIIllIllI.toCharArray();
        int llllllllllllIlllIllIIlIlIIlllIII = NetHandlerLoginClient.llIIIIlllllllI[1];
        final double llllllllllllIlllIllIIlIlIIllIIlI = (Object)llllllllllllIlllIllIIlIlIIllIlll.toCharArray();
        final int llllllllllllIlllIllIIlIlIIllIIIl = llllllllllllIlllIllIIlIlIIllIIlI.length;
        int llllllllllllIlllIllIIlIlIIllIIII = NetHandlerLoginClient.llIIIIlllllllI[1];
        while (lIIIlIIIlIIllIll(llllllllllllIlllIllIIlIlIIllIIII, llllllllllllIlllIllIIlIlIIllIIIl)) {
            final char llllllllllllIlllIllIIlIlIIllllIl = llllllllllllIlllIllIIlIlIIllIIlI[llllllllllllIlllIllIIlIlIIllIIII];
            llllllllllllIlllIllIIlIlIIlllIlI.append((char)(llllllllllllIlllIllIIlIlIIllllIl ^ llllllllllllIlllIllIIlIlIIlllIIl[llllllllllllIlllIllIIlIlIIlllIII % llllllllllllIlllIllIIlIlIIlllIIl.length]));
            "".length();
            ++llllllllllllIlllIllIIlIlIIlllIII;
            ++llllllllllllIlllIllIIlIlIIllIIII;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIlIlIIlllIlI);
    }
    
    static {
        lIIIlIIIlIIlIllI();
        lIIIlIIIlIIlIlII();
        logger = LogManager.getLogger();
    }
    
    @Override
    public void handleDisconnect(final S00PacketDisconnect llllllllllllIlllIllIIlIlIlIlllII) {
        this.networkManager.closeChannel(llllllllllllIlllIllIIlIlIlIlllII.func_149603_c());
    }
    
    private static String lIIIlIIIlIIIlIII(final String llllllllllllIlllIllIIlIlIlIIlIlI, final String llllllllllllIlllIllIIlIlIlIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIlIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), NetHandlerLoginClient.llIIIIlllllllI[9]), "DES");
            final Cipher llllllllllllIlllIllIIlIlIlIIlllI = Cipher.getInstance("DES");
            llllllllllllIlllIllIIlIlIlIIlllI.init(NetHandlerLoginClient.llIIIIlllllllI[3], llllllllllllIlllIllIIlIlIlIIllll);
            return new String(llllllllllllIlllIllIIlIlIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIlIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIlIlIIllIl) {
            llllllllllllIlllIllIIlIlIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIIlIIllIII(final Object llllllllllllIlllIllIIlIlIIIlllII) {
        return llllllllllllIlllIllIIlIlIIIlllII != null;
    }
    
    @Override
    public void onDisconnect(final IChatComponent llllllllllllIlllIllIIlIlIllIIIlI) {
        this.mc.displayGuiScreen(new GuiDisconnected(this.previousGuiScreen, NetHandlerLoginClient.llIIIIlllllIIl[NetHandlerLoginClient.llIIIIlllllllI[7]], llllllllllllIlllIllIIlIlIllIIIlI));
    }
    
    private static boolean lIIIlIIIlIIllIll(final int llllllllllllIlllIllIIlIlIIIlllll, final int llllllllllllIlllIllIIlIlIIIllllI) {
        return llllllllllllIlllIllIIlIlIIIlllll < llllllllllllIlllIllIIlIlIIIllllI;
    }
    
    private static void lIIIlIIIlIIlIllI() {
        (llIIIIlllllllI = new int[10])[0] = (0x31 ^ 0x21);
        NetHandlerLoginClient.llIIIIlllllllI[1] = ((0x23 ^ 0x27) & ~(0x5A ^ 0x5E));
        NetHandlerLoginClient.llIIIIlllllllI[2] = " ".length();
        NetHandlerLoginClient.llIIIIlllllllI[3] = "  ".length();
        NetHandlerLoginClient.llIIIIlllllllI[4] = "   ".length();
        NetHandlerLoginClient.llIIIIlllllllI[5] = (113 + 91 - 118 + 55 ^ 98 + 54 - 124 + 109);
        NetHandlerLoginClient.llIIIIlllllllI[6] = (0x58 ^ 0x5D);
        NetHandlerLoginClient.llIIIIlllllllI[7] = (0x0 ^ 0x6);
        NetHandlerLoginClient.llIIIIlllllllI[8] = (0xAF ^ 0xA8);
        NetHandlerLoginClient.llIIIIlllllllI[9] = (66 + 87 - 95 + 82 ^ 93 + 123 - 212 + 128);
    }
    
    public NetHandlerLoginClient(final NetworkManager llllllllllllIlllIllIIlIllIIIlIll, final Minecraft llllllllllllIlllIllIIlIllIIIlllI, final GuiScreen llllllllllllIlllIllIIlIllIIIlIIl) {
        this.networkManager = llllllllllllIlllIllIIlIllIIIlIll;
        this.mc = llllllllllllIlllIllIIlIllIIIlllI;
        this.previousGuiScreen = llllllllllllIlllIllIIlIllIIIlIIl;
    }
    
    private MinecraftSessionService getSessionService() {
        return this.mc.getSessionService();
    }
    
    private static boolean lIIIlIIIlIIllIlI(final int llllllllllllIlllIllIIlIlIIIllIII) {
        return llllllllllllIlllIllIIlIlIIIllIII == 0;
    }
    
    private static String lIIIlIIIlIIIlIIl(final String llllllllllllIlllIllIIlIlIIlIIlll, final String llllllllllllIlllIllIIlIlIIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIlIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIlIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIlIlIIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIlIlIIlIlIIl.init(NetHandlerLoginClient.llIIIIlllllllI[3], llllllllllllIlllIllIIlIlIIlIlIlI);
            return new String(llllllllllllIlllIllIIlIlIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIlIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIlIIlIlIII) {
            llllllllllllIlllIllIIlIlIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handleLoginSuccess(final S02PacketLoginSuccess llllllllllllIlllIllIIlIlIllIlIlI) {
        this.gameProfile = llllllllllllIlllIllIIlIlIllIlIlI.getProfile();
        this.networkManager.setConnectionState(EnumConnectionState.PLAY);
        this.networkManager.setNetHandler(new NetHandlerPlayClient(this.mc, this.previousGuiScreen, this.networkManager, this.gameProfile));
    }
}
