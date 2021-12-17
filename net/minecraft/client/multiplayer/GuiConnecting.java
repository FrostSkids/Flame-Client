// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import java.net.UnknownHostException;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.Packet;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import net.minecraft.client.network.NetHandlerLoginClient;
import java.net.InetAddress;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.resources.I18n;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.client.gui.GuiButton;
import java.io.IOException;
import org.apache.logging.log4j.Logger;
import net.minecraft.network.NetworkManager;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.gui.GuiScreen;

public class GuiConnecting extends GuiScreen
{
    private static final /* synthetic */ AtomicInteger CONNECTION_ID;
    private /* synthetic */ NetworkManager networkManager;
    private static final /* synthetic */ int[] lIlllllIllIlII;
    private static final /* synthetic */ String[] lIlllllIlIllll;
    private final /* synthetic */ GuiScreen previousGuiScreen;
    private /* synthetic */ boolean cancel;
    private static final /* synthetic */ Logger logger;
    
    private static boolean lIIIIlIllIIIlIlI(final int llllllllllllIllllIIlIlllIllllIll) {
        return llllllllllllIllllIIlIlllIllllIll != 0;
    }
    
    static /* synthetic */ void access$2(final GuiConnecting llllllllllllIllllIIlIllllIllllII, final NetworkManager llllllllllllIllllIIlIllllIlllIll) {
        llllllllllllIllllIIlIllllIllllII.networkManager = llllllllllllIllllIIlIllllIlllIll;
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIllllIIlIlllllIllIIl, final int llllllllllllIllllIIlIlllllIllIII) throws IOException {
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllllIIlIlllllIlIIIl) throws IOException {
        if (lIIIIlIllIIIllII(llllllllllllIllllIIlIlllllIlIIIl.id)) {
            this.cancel = (GuiConnecting.lIlllllIllIlII[1] != 0);
            if (lIIIIlIllIIIlIIl(this.networkManager)) {
                this.networkManager.closeChannel(new ChatComponentText(GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[4]]));
            }
            this.mc.displayGuiScreen(this.previousGuiScreen);
        }
    }
    
    private static String lIIIIlIllIIIIIII(final String llllllllllllIllllIIlIllllIlIllll, final String llllllllllllIllllIIlIllllIlIllII) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIllllIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIllllIlIllII.getBytes(StandardCharsets.UTF_8)), GuiConnecting.lIlllllIllIlII[13]), "DES");
            final Cipher llllllllllllIllllIIlIllllIllIIIl = Cipher.getInstance("DES");
            llllllllllllIllllIIlIllllIllIIIl.init(GuiConnecting.lIlllllIllIlII[2], llllllllllllIllllIIlIllllIllIIlI);
            return new String(llllllllllllIllllIIlIllllIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIllllIllIIII) {
            llllllllllllIllllIIlIllllIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIlIllIIIIIlI(String llllllllllllIllllIIlIllllIIllIlI, final String llllllllllllIllllIIlIllllIIllIIl) {
        llllllllllllIllllIIlIllllIIllIlI = new String(Base64.getDecoder().decode(llllllllllllIllllIIlIllllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlIllllIIlllIl = new StringBuilder();
        final char[] llllllllllllIllllIIlIllllIIlllII = llllllllllllIllllIIlIllllIIllIIl.toCharArray();
        int llllllllllllIllllIIlIllllIIllIll = GuiConnecting.lIlllllIllIlII[0];
        final boolean llllllllllllIllllIIlIllllIIlIlIl = (Object)llllllllllllIllllIIlIllllIIllIlI.toCharArray();
        final long llllllllllllIllllIIlIllllIIlIlII = llllllllllllIllllIIlIllllIIlIlIl.length;
        boolean llllllllllllIllllIIlIllllIIlIIll = GuiConnecting.lIlllllIllIlII[0] != 0;
        while (lIIIIlIllIIIlllI(llllllllllllIllllIIlIllllIIlIIll ? 1 : 0, (int)llllllllllllIllllIIlIllllIIlIlII)) {
            final char llllllllllllIllllIIlIllllIlIIIII = llllllllllllIllllIIlIllllIIlIlIl[llllllllllllIllllIIlIllllIIlIIll];
            llllllllllllIllllIIlIllllIIlllIl.append((char)(llllllllllllIllllIIlIllllIlIIIII ^ llllllllllllIllllIIlIllllIIlllII[llllllllllllIllllIIlIllllIIllIll % llllllllllllIllllIIlIllllIIlllII.length]));
            "".length();
            ++llllllllllllIllllIIlIllllIIllIll;
            ++llllllllllllIllllIIlIllllIIlIIll;
            "".length();
            if (((199 + 205 - 287 + 105 ^ 104 + 70 - 132 + 153) & (0x74 ^ 0x25 ^ (0x1B ^ 0x57) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlIllllIIlllIl);
    }
    
    private static boolean lIIIIlIllIIIllII(final int llllllllllllIllllIIlIlllIllllIIl) {
        return llllllllllllIllllIIlIlllIllllIIl == 0;
    }
    
    private static boolean lIIIIlIllIIIlIIl(final Object llllllllllllIllllIIlIlllIlllllll) {
        return llllllllllllIllllIIlIlllIlllllll != null;
    }
    
    private static boolean lIIIIlIllIIIlllI(final int llllllllllllIllllIIlIllllIIIIIlI, final int llllllllllllIllllIIlIllllIIIIIIl) {
        return llllllllllllIllllIIlIllllIIIIIlI < llllllllllllIllllIIlIllllIIIIIIl;
    }
    
    private static void lIIIIlIllIIIIIll() {
        (lIlllllIlIllll = new String[GuiConnecting.lIlllllIllIlII[12]])[GuiConnecting.lIlllllIllIlII[0]] = lIIIIlIllIIIIIII("C8Eim12qQx7tWFWKMTDeCw==", "BiqIN");
        GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[1]] = lIIIIlIllIIIIIII("w4uTCqxuic4=", "CAgHG");
        GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[2]] = lIIIIlIllIIIIIIl("T80/PPvu/nBpXDaGiV47zLvaYIrdwDu6", "cnotS");
        GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[7]] = lIIIIlIllIIIIIlI("IBAaXgQmCxAVCw==", "Gespg");
        GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[4]] = lIIIIlIllIIIIIIl("vUu1CDRdnhg=", "XFxtC");
        GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[8]] = lIIIIlIllIIIIIII("F/9YXjiZ+ka9SrMSnd/r5D7fQe4Pus9a", "gWosg");
        GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[11]] = lIIIIlIllIIIIIII("O/gtFkIKL00v5nGLz5p0y/3yLJCtIq+y", "FAsLN");
    }
    
    public GuiConnecting(final GuiScreen llllllllllllIllllIIlIllllllIlIlI, final Minecraft llllllllllllIllllIIlIllllllIlIIl, final String llllllllllllIllllIIlIllllllIlIII, final int llllllllllllIllllIIlIllllllIllII) {
        this.mc = llllllllllllIllllIIlIllllllIlIIl;
        this.previousGuiScreen = llllllllllllIllllIIlIllllllIlIlI;
        llllllllllllIllllIIlIllllllIlIIl.loadWorld(null);
        this.connect(llllllllllllIllllIIlIllllllIlIII, llllllllllllIllllIIlIllllllIllII);
    }
    
    private static void lIIIIlIllIIIlIII() {
        (lIlllllIllIlII = new int[14])[0] = ((0x3E ^ 0x72) & ~(0xD9 ^ 0x95));
        GuiConnecting.lIlllllIllIlII[1] = " ".length();
        GuiConnecting.lIlllllIllIlII[2] = "  ".length();
        GuiConnecting.lIlllllIllIlII[3] = (0x5A ^ 0x3E);
        GuiConnecting.lIlllllIllIlII[4] = (0xBA ^ 0xBE);
        GuiConnecting.lIlllllIllIlII[5] = (0x28 ^ 0x62 ^ (0x7 ^ 0x35));
        GuiConnecting.lIlllllIllIlII[6] = (0xF ^ 0x3);
        GuiConnecting.lIlllllIllIlII[7] = "   ".length();
        GuiConnecting.lIlllllIllIlII[8] = (34 + 3 + 33 + 88 ^ 68 + 151 - 213 + 149);
        GuiConnecting.lIlllllIllIlII[9] = (0x86 ^ 0xB4);
        GuiConnecting.lIlllllIllIlII[10] = (-1 & 0xFFFFFF);
        GuiConnecting.lIlllllIllIlII[11] = (0x9A ^ 0x9C);
        GuiConnecting.lIlllllIllIlII[12] = (0x5C ^ 0x5A ^ " ".length());
        GuiConnecting.lIlllllIllIlII[13] = (0x24 ^ 0x2C);
    }
    
    @Override
    public void updateScreen() {
        if (lIIIIlIllIIIlIIl(this.networkManager)) {
            if (lIIIIlIllIIIlIlI(this.networkManager.isChannelOpen() ? 1 : 0)) {
                this.networkManager.processReceivedPackets();
                "".length();
                if (((60 + 15 - 5 + 83 ^ 97 + 18 + 5 + 48) & (39 + 121 - 95 + 74 ^ 48 + 93 - 83 + 128 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                this.networkManager.checkDisconnected();
            }
        }
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiConnecting.lIlllllIllIlII[0], this.width / GuiConnecting.lIlllllIllIlII[2] - GuiConnecting.lIlllllIllIlII[3], this.height / GuiConnecting.lIlllllIllIlII[4] + GuiConnecting.lIlllllIllIlII[5] + GuiConnecting.lIlllllIllIlII[6], I18n.format(GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[7]], new Object[GuiConnecting.lIlllllIllIlII[0]])));
        "".length();
    }
    
    static {
        lIIIIlIllIIIlIII();
        lIIIIlIllIIIIIll();
        CONNECTION_ID = new AtomicInteger(GuiConnecting.lIlllllIllIlII[0]);
        logger = LogManager.getLogger();
    }
    
    private static boolean lIIIIlIllIIIllIl(final Object llllllllllllIllllIIlIlllIlllllIl) {
        return llllllllllllIllllIIlIlllIlllllIl == null;
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllllIIlIlllllIIlIIl, final int llllllllllllIllllIIlIlllllIIlIII, final float llllllllllllIllllIIlIlllllIIIIll) {
        this.drawDefaultBackground();
        if (lIIIIlIllIIIllIl(this.networkManager)) {
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[8]], new Object[GuiConnecting.lIlllllIllIlII[0]]), this.width / GuiConnecting.lIlllllIllIlII[2], this.height / GuiConnecting.lIlllllIllIlII[2] - GuiConnecting.lIlllllIllIlII[9], GuiConnecting.lIlllllIllIlII[10]);
            "".length();
            if (((0xF5 ^ 0xA4) & ~(0xE6 ^ 0xB7)) > ((0x48 ^ 0x76) & ~(0x50 ^ 0x6E))) {
                return;
            }
        }
        else {
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[11]], new Object[GuiConnecting.lIlllllIllIlII[0]]), this.width / GuiConnecting.lIlllllIllIlII[2], this.height / GuiConnecting.lIlllllIllIlII[2] - GuiConnecting.lIlllllIllIlII[9], GuiConnecting.lIlllllIllIlII[10]);
        }
        super.drawScreen(llllllllllllIllllIIlIlllllIIlIIl, llllllllllllIllllIIlIlllllIIlIII, llllllllllllIllllIIlIlllllIIIIll);
    }
    
    private static String lIIIIlIllIIIIIIl(final String llllllllllllIllllIIlIllllIIIlIlI, final String llllllllllllIllllIIlIllllIIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIllllIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIllllIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlIllllIIIllII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlIllllIIIllII.init(GuiConnecting.lIlllllIllIlII[2], llllllllllllIllllIIlIllllIIIllIl);
            return new String(llllllllllllIllllIIlIllllIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIllllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIllllIIIlIll) {
            llllllllllllIllllIIlIllllIIIlIll.printStackTrace();
            return null;
        }
    }
    
    public GuiConnecting(final GuiScreen llllllllllllIllllIIlIllllllllllI, final Minecraft llllllllllllIllllIIlIlllllllllIl, final ServerData llllllllllllIllllIIlIlllllllllII) {
        this.mc = llllllllllllIllllIIlIlllllllllIl;
        this.previousGuiScreen = llllllllllllIllllIIlIllllllllllI;
        final ServerAddress llllllllllllIllllIIlIllllllllIll = ServerAddress.func_78860_a(llllllllllllIllllIIlIlllllllllII.serverIP);
        llllllllllllIllllIIlIlllllllllIl.loadWorld(null);
        llllllllllllIllllIIlIlllllllllIl.setServerData(llllllllllllIllllIIlIlllllllllII);
        this.connect(llllllllllllIllllIIlIllllllllIll.getIP(), llllllllllllIllllIIlIllllllllIll.getPort());
    }
    
    private void connect(final String llllllllllllIllllIIlIlllllIlllll, final int llllllllllllIllllIIlIllllllIIIIl) {
        GuiConnecting.logger.info(String.valueOf(new StringBuilder(GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[0]]).append(llllllllllllIllllIIlIlllllIlllll).append(GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[1]]).append(llllllllllllIllllIIlIllllllIIIIl)));
        new Thread(String.valueOf(new StringBuilder(GuiConnecting.lIlllllIlIllll[GuiConnecting.lIlllllIllIlII[2]]).append(GuiConnecting.CONNECTION_ID.incrementAndGet()))) {
            private static final /* synthetic */ String[] lIlllIllIllIll;
            private static final /* synthetic */ int[] lIllllIIIIllll;
            
            private static String lIIIIIllIlIllIll(final String llllllllllllIllllIlIlllIIllllIIl, final String llllllllllllIllllIlIlllIIllllIlI) {
                try {
                    final SecretKeySpec llllllllllllIllllIlIlllIIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlllIIllllIlI.getBytes(StandardCharsets.UTF_8)), GuiConnecting$1.lIllllIIIIllll[9]), "DES");
                    final Cipher llllllllllllIllllIlIlllIIlllllIl = Cipher.getInstance("DES");
                    llllllllllllIllllIlIlllIIlllllIl.init(GuiConnecting$1.lIllllIIIIllll[3], llllllllllllIllllIlIlllIIllllllI);
                    return new String(llllllllllllIllllIlIlllIIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlllIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIlIlllIIlllllII) {
                    llllllllllllIllllIlIlllIIlllllII.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIIIIlllllIllll(final int llllllllllllIllllIlIlllIIlllIIll, final int llllllllllllIllllIlIlllIIlllIIlI) {
                return llllllllllllIllllIlIlllIIlllIIll < llllllllllllIllllIlIlllIIlllIIlI;
            }
            
            static {
                lIIIIIlllllIllII();
                lIIIIIllIlIlllll();
            }
            
            private static String lIIIIIllIlIllIIl(final String llllllllllllIllllIlIlllIlIIIlIII, final String llllllllllllIllllIlIlllIlIIIIlll) {
                try {
                    final SecretKeySpec llllllllllllIllllIlIlllIlIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllllIlIlllIlIIIlIlI = Cipher.getInstance("Blowfish");
                    llllllllllllIllllIlIlllIlIIIlIlI.init(GuiConnecting$1.lIllllIIIIllll[3], llllllllllllIllllIlIlllIlIIIlIll);
                    return new String(llllllllllllIllllIlIlllIlIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIlIlllIlIIIlIIl) {
                    llllllllllllIllllIlIlllIlIIIlIIl.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIIIIlllllIllII() {
                (lIllllIIIIllll = new int[11])[0] = (0xF ^ 0x20);
                GuiConnecting$1.lIllllIIIIllll[1] = ((142 + 163 - 249 + 117 ^ 105 + 104 - 55 + 27) & (0x36 ^ 0x0 ^ (0xA3 ^ 0x8D) ^ -" ".length()));
                GuiConnecting$1.lIllllIIIIllll[2] = " ".length();
                GuiConnecting$1.lIllllIIIIllll[3] = "  ".length();
                GuiConnecting$1.lIllllIIIIllll[4] = "   ".length();
                GuiConnecting$1.lIllllIIIIllll[5] = (0xB1 ^ 0xB5);
                GuiConnecting$1.lIllllIIIIllll[6] = (0x4A ^ 0x4F);
                GuiConnecting$1.lIllllIIIIllll[7] = ("  ".length() ^ (0x6 ^ 0x2));
                GuiConnecting$1.lIllllIIIIllll[8] = (0x28 ^ 0x2F);
                GuiConnecting$1.lIllllIIIIllll[9] = (0x1 ^ 0x9);
                GuiConnecting$1.lIllllIIIIllll[10] = (0x63 ^ 0x6A);
            }
            
            private static void lIIIIIllIlIlllll() {
                (lIlllIllIllIll = new String[GuiConnecting$1.lIllllIIIIllll[10]])[GuiConnecting$1.lIllllIIIIllll[1]] = lIIIIIllIlIllIIl("jVijm9c/BEScEevhwrQipWzuc8J7Y0N4VwUa+N442Do=", "ISxYS");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[2]] = lIIIIIllIlIllIlI("Ggc/ODQaHH8wMBAENDI=", "yhQVQ");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[3]] = lIIIIIllIlIllIll("WNYv3mOAzM9aKbvP6p5GdIIQrug6uZVQDmj3OhOQZPI=", "wQYdY");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[4]] = lIIIIIllIlIllIIl("Acr7ArqLsPkd8o2/1IZSQg==", "DJaeB");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[5]] = lIIIIIllIlIllIll("jPFaUsSly0UagOtPSbaHmohK6BJPSyx5UwO4lE9A4SA=", "GGXvz");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[6]] = lIIIIIllIlIllIlI("Vw==", "mTiPV");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[7]] = lIIIIIllIlIllIlI("", "ZoBnR");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[8]] = lIIIIIllIlIllIlI("IQQ5GAAhH3kQBCsHMhI=", "BkWve");
                GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[9]] = lIIIIIllIlIllIlI("JRwkKQMvGzIpGG8SMiQJMxw0GAkgBjgk", "AuWJl");
            }
            
            private static boolean lIIIIIlllllIllIl(final int llllllllllllIllllIlIlllIIllIlllI) {
                return llllllllllllIllllIlIlllIIllIlllI != 0;
            }
            
            private static String lIIIIIllIlIllIlI(String llllllllllllIllllIlIlllIlIIllIII, final String llllllllllllIllllIlIlllIlIIlllII) {
                llllllllllllIllllIlIlllIlIIllIII = new String(Base64.getDecoder().decode(llllllllllllIllllIlIlllIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllllIlIlllIlIIllIll = new StringBuilder();
                final char[] llllllllllllIllllIlIlllIlIIllIlI = llllllllllllIllllIlIlllIlIIlllII.toCharArray();
                int llllllllllllIllllIlIlllIlIIllIIl = GuiConnecting$1.lIllllIIIIllll[1];
                final float llllllllllllIllllIlIlllIlIIlIIll = (Object)llllllllllllIllllIlIlllIlIIllIII.toCharArray();
                final short llllllllllllIllllIlIlllIlIIlIIlI = (short)llllllllllllIllllIlIlllIlIIlIIll.length;
                String llllllllllllIllllIlIlllIlIIlIIIl = (String)GuiConnecting$1.lIllllIIIIllll[1];
                while (lIIIIIlllllIllll((int)llllllllllllIllllIlIlllIlIIlIIIl, llllllllllllIllllIlIlllIlIIlIIlI)) {
                    final char llllllllllllIllllIlIlllIlIIllllI = llllllllllllIllllIlIlllIlIIlIIll[llllllllllllIllllIlIlllIlIIlIIIl];
                    llllllllllllIllllIlIlllIlIIllIll.append((char)(llllllllllllIllllIlIlllIlIIllllI ^ llllllllllllIllllIlIlllIlIIllIlI[llllllllllllIllllIlIlllIlIIllIIl % llllllllllllIllllIlIlllIlIIllIlI.length]));
                    "".length();
                    ++llllllllllllIllllIlIlllIlIIllIIl;
                    ++llllllllllllIllllIlIlllIlIIlIIIl;
                    "".length();
                    if (((0x83 ^ 0xA5 ^ (0xC9 ^ 0xAA)) & (0xBF ^ 0xB2 ^ (0x16 ^ 0x5E) ^ -" ".length())) == " ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllllIlIlllIlIIllIll);
            }
            
            private static boolean lIIIIIlllllIlllI(final Object llllllllllllIllllIlIlllIIlllIIII) {
                return llllllllllllIllllIlIlllIIlllIIII != null;
            }
            
            @Override
            public void run() {
                InetAddress llllllllllllIllllIlIlllIlIllIIIl = null;
                try {
                    if (lIIIIIlllllIllIl(GuiConnecting.this.cancel ? 1 : 0)) {
                        return;
                    }
                    llllllllllllIllllIlIlllIlIllIIIl = InetAddress.getByName(llllllllllllIllllIIlIlllllIlllll);
                    GuiConnecting.access$2(GuiConnecting.this, NetworkManager.func_181124_a(llllllllllllIllllIlIlllIlIllIIIl, llllllllllllIllllIIlIllllllIIIIl, GuiConnecting.this.mc.gameSettings.func_181148_f()));
                    GuiConnecting.this.networkManager.setNetHandler(new NetHandlerLoginClient(GuiConnecting.this.networkManager, GuiConnecting.this.mc, GuiConnecting.this.previousGuiScreen));
                    GuiConnecting.this.networkManager.sendPacket(new C00Handshake(GuiConnecting$1.lIllllIIIIllll[0], llllllllllllIllllIIlIlllllIlllll, llllllllllllIllllIIlIllllllIIIIl, EnumConnectionState.LOGIN));
                    GuiConnecting.this.networkManager.sendPacket(new C00PacketLoginStart(GuiConnecting.this.mc.getSession().getProfile()));
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                }
                catch (UnknownHostException llllllllllllIllllIlIlllIlIllIIII) {
                    if (lIIIIIlllllIllIl(GuiConnecting.this.cancel ? 1 : 0)) {
                        return;
                    }
                    GuiConnecting.logger.error(GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[1]], (Throwable)llllllllllllIllllIlIlllIlIllIIII);
                    final Minecraft access$1 = GuiConnecting.this.mc;
                    final GuiScreen access$2 = GuiConnecting.this.previousGuiScreen;
                    final String llllllllllllIlIllIllllIIllllIIII = GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[2]];
                    final String lllllllllllllIlIIlIlllIIlIIIIIlI = GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[3]];
                    final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[GuiConnecting$1.lIllllIIIIllll[2]];
                    lllllllllllllIlIIlIlllIIlIIIIIIl[GuiConnecting$1.lIllllIIIIllll[1]] = GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[4]];
                    access$1.displayGuiScreen(new GuiDisconnected(access$2, llllllllllllIlIllIllllIIllllIIII, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl)));
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                catch (Exception llllllllllllIllllIlIlllIlIlIllll) {
                    if (lIIIIIlllllIllIl(GuiConnecting.this.cancel ? 1 : 0)) {
                        return;
                    }
                    GuiConnecting.logger.error(GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[5]], (Throwable)llllllllllllIllllIlIlllIlIlIllll);
                    String llllllllllllIllllIlIlllIlIlIlllI = llllllllllllIllllIlIlllIlIlIllll.toString();
                    if (lIIIIIlllllIlllI(llllllllllllIllllIlIlllIlIllIIIl)) {
                        final String llllllllllllIllllIlIlllIlIlIllIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllllIlIlllIlIllIIIl.toString())).append(GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[6]]).append(llllllllllllIllllIIlIllllllIIIIl));
                        llllllllllllIllllIlIlllIlIlIlllI = llllllllllllIllllIlIlllIlIlIlllI.replaceAll(llllllllllllIllllIlIlllIlIlIllIl, GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[7]]);
                    }
                    final Minecraft access$3 = GuiConnecting.this.mc;
                    final GuiScreen access$4 = GuiConnecting.this.previousGuiScreen;
                    final String llllllllllllIlIllIllllIIllllIIII2 = GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[8]];
                    final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = GuiConnecting$1.lIlllIllIllIll[GuiConnecting$1.lIllllIIIIllll[9]];
                    final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[GuiConnecting$1.lIllllIIIIllll[2]];
                    lllllllllllllIlIIlIlllIIlIIIIIIl2[GuiConnecting$1.lIllllIIIIllll[1]] = llllllllllllIllllIlIlllIlIlIlllI;
                    access$3.displayGuiScreen(new GuiDisconnected(access$4, llllllllllllIlIllIllllIIllllIIII2, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2)));
                }
            }
        }.start();
    }
}
