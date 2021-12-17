// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import org.apache.logging.log4j.LogManager;
import java.net.UnknownHostException;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.Packet;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.network.NetHandlerLoginClient;
import net.minecraft.client.Minecraft;
import java.net.InetAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.NetworkManager;
import org.apache.logging.log4j.Logger;

public class RealmsConnect
{
    private static final /* synthetic */ int[] lIIllIIIIlIlIl;
    private static final /* synthetic */ String[] lIIllIIIIlIlII;
    private final /* synthetic */ RealmsScreen onlineScreen;
    private static final /* synthetic */ Logger LOGGER;
    private /* synthetic */ NetworkManager connection;
    private volatile /* synthetic */ boolean aborted;
    
    public void connect(final String lllllllllllllIIlIllIllIlIlIIllII, final int lllllllllllllIIlIllIllIlIlIIlllI) {
        Realms.setConnectedToRealms((boolean)(RealmsConnect.lIIllIIIIlIlIl[1] != 0));
        new Thread(RealmsConnect.lIIllIIIIlIlII[RealmsConnect.lIIllIIIIlIlIl[0]]) {
            private static final /* synthetic */ String[] lIIllIIIIIllII;
            private static final /* synthetic */ int[] lIIllIIIIlIIll;
            
            private static void llIlIlIllIlIlll() {
                (lIIllIIIIlIIll = new int[12])[0] = (0xCD ^ 0xA5 ^ (0xF5 ^ 0xB2));
                RealmsConnect$1.lIIllIIIIlIIll[1] = ((0xBB ^ 0x99) & ~(0x37 ^ 0x15));
                RealmsConnect$1.lIIllIIIIlIIll[2] = " ".length();
                RealmsConnect$1.lIIllIIIIlIIll[3] = "  ".length();
                RealmsConnect$1.lIIllIIIIlIIll[4] = "   ".length();
                RealmsConnect$1.lIIllIIIIlIIll[5] = (0xF3 ^ 0x86 ^ (0x7B ^ 0xA));
                RealmsConnect$1.lIIllIIIIlIIll[6] = (0x85 ^ 0x80);
                RealmsConnect$1.lIIllIIIIlIIll[7] = (0x67 ^ 0x73 ^ (0xA2 ^ 0xB0));
                RealmsConnect$1.lIIllIIIIlIIll[8] = (0x1A ^ 0x1D);
                RealmsConnect$1.lIIllIIIIlIIll[9] = (0x61 ^ 0x75 ^ (0x88 ^ 0x94));
                RealmsConnect$1.lIIllIIIIlIIll[10] = (0x31 ^ 0x38);
                RealmsConnect$1.lIIllIIIIlIIll[11] = (0xCB ^ 0xC1);
            }
            
            private static String llIlIlIlIIlIIlI(final String lllllllllllllIIlIllIllIlIlllllll, final String lllllllllllllIIlIllIllIlIllllllI) {
                try {
                    final SecretKeySpec lllllllllllllIIlIllIllIllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIllIlIllllllI.getBytes(StandardCharsets.UTF_8)), RealmsConnect$1.lIIllIIIIlIIll[9]), "DES");
                    final Cipher lllllllllllllIIlIllIllIllIIIIIIl = Cipher.getInstance("DES");
                    lllllllllllllIIlIllIllIllIIIIIIl.init(RealmsConnect$1.lIIllIIIIlIIll[3], lllllllllllllIIlIllIllIllIIIIIlI);
                    return new String(lllllllllllllIIlIllIllIllIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIllIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIllIllIllIIIIIII) {
                    lllllllllllllIIlIllIllIllIIIIIII.printStackTrace();
                    return null;
                }
            }
            
            private static String llIlIlIlIIlIlII(final String lllllllllllllIIlIllIllIllIIIlIlI, final String lllllllllllllIIlIllIllIllIIIlIIl) {
                try {
                    final SecretKeySpec lllllllllllllIIlIllIllIllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIllIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIllIllIllIIIlllI = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIllIllIllIIIlllI.init(RealmsConnect$1.lIIllIIIIlIIll[3], lllllllllllllIIlIllIllIllIIIllll);
                    return new String(lllllllllllllIIlIllIllIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIllIllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIllIllIllIIIllIl) {
                    lllllllllllllIIlIllIllIllIIIllIl.printStackTrace();
                    return null;
                }
            }
            
            private static boolean llIlIlIllIllIIl(final Object lllllllllllllIIlIllIllIlIlIlllII) {
                return lllllllllllllIIlIllIllIlIlIlllII != null;
            }
            
            private static String llIlIlIlIIlIIll(String lllllllllllllIIlIllIllIlIllIlIlI, final String lllllllllllllIIlIllIllIlIllIlIIl) {
                lllllllllllllIIlIllIllIlIllIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIllIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlIllIllIlIllIllIl = new StringBuilder();
                final char[] lllllllllllllIIlIllIllIlIllIllII = lllllllllllllIIlIllIllIlIllIlIIl.toCharArray();
                int lllllllllllllIIlIllIllIlIllIlIll = RealmsConnect$1.lIIllIIIIlIIll[1];
                final char lllllllllllllIIlIllIllIlIllIIlIl = (Object)lllllllllllllIIlIllIllIlIllIlIlI.toCharArray();
                final double lllllllllllllIIlIllIllIlIllIIlII = lllllllllllllIIlIllIllIlIllIIlIl.length;
                short lllllllllllllIIlIllIllIlIllIIIll = (short)RealmsConnect$1.lIIllIIIIlIIll[1];
                while (llIlIlIllIllIlI(lllllllllllllIIlIllIllIlIllIIIll, (int)lllllllllllllIIlIllIllIlIllIIlII)) {
                    final char lllllllllllllIIlIllIllIlIlllIIII = lllllllllllllIIlIllIllIlIllIIlIl[lllllllllllllIIlIllIllIlIllIIIll];
                    lllllllllllllIIlIllIllIlIllIllIl.append((char)(lllllllllllllIIlIllIllIlIlllIIII ^ lllllllllllllIIlIllIllIlIllIllII[lllllllllllllIIlIllIllIlIllIlIll % lllllllllllllIIlIllIllIlIllIllII.length]));
                    "".length();
                    ++lllllllllllllIIlIllIllIlIllIlIll;
                    ++lllllllllllllIIlIllIllIlIllIIIll;
                    "".length();
                    if (((114 + 145 - 233 + 121 ^ 157 + 19 - 125 + 143) & (0x35 ^ 0x4D ^ (0x7 ^ 0x2E) ^ -" ".length())) < ((0x8D ^ 0xBF ^ 14 + 51 - 29 + 91) & (0x4C ^ 0x24 ^ (0x3B ^ 0x1E) ^ -" ".length()))) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlIllIllIlIllIllIl);
            }
            
            @Override
            public void run() {
                InetAddress lllllllllllllIIlIllIllIllIIlllIl = null;
                try {
                    lllllllllllllIIlIllIllIllIIlllIl = InetAddress.getByName(lllllllllllllIIlIllIllIlIlIIllII);
                    if (llIlIlIllIllIII(RealmsConnect.this.aborted ? 1 : 0)) {
                        return;
                    }
                    RealmsConnect.access$1(RealmsConnect.this, NetworkManager.func_181124_a(lllllllllllllIIlIllIllIllIIlllIl, lllllllllllllIIlIllIllIlIlIIlllI, Minecraft.getMinecraft().gameSettings.func_181148_f()));
                    if (llIlIlIllIllIII(RealmsConnect.this.aborted ? 1 : 0)) {
                        return;
                    }
                    RealmsConnect.this.connection.setNetHandler(new NetHandlerLoginClient(RealmsConnect.this.connection, Minecraft.getMinecraft(), RealmsConnect.this.onlineScreen.getProxy()));
                    if (llIlIlIllIllIII(RealmsConnect.this.aborted ? 1 : 0)) {
                        return;
                    }
                    RealmsConnect.this.connection.sendPacket(new C00Handshake(RealmsConnect$1.lIIllIIIIlIIll[0], lllllllllllllIIlIllIllIlIlIIllII, lllllllllllllIIlIllIllIlIlIIlllI, EnumConnectionState.LOGIN));
                    if (llIlIlIllIllIII(RealmsConnect.this.aborted ? 1 : 0)) {
                        return;
                    }
                    RealmsConnect.this.connection.sendPacket(new C00PacketLoginStart(Minecraft.getMinecraft().getSession().getProfile()));
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                catch (UnknownHostException lllllllllllllIIlIllIllIllIIlllII) {
                    Realms.clearResourcePack();
                    if (llIlIlIllIllIII(RealmsConnect.this.aborted ? 1 : 0)) {
                        return;
                    }
                    RealmsConnect.LOGGER.error(RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[1]], (Throwable)lllllllllllllIIlIllIllIllIIlllII);
                    Minecraft.getMinecraft().getResourcePackRepository().func_148529_f();
                    final RealmsScreen access$3 = RealmsConnect.this.onlineScreen;
                    final String llllllllllllIlllIlIlIlIIllIllIlI = RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[2]];
                    final String lllllllllllllIlIIlIlllIIlIIIIIlI = RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[3]];
                    final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[RealmsConnect$1.lIIllIIIIlIIll[2]];
                    lllllllllllllIlIIlIlllIIlIIIIIIl[RealmsConnect$1.lIIllIIIIlIIll[1]] = String.valueOf(new StringBuilder(RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[4]]).append(lllllllllllllIIlIllIllIlIlIIllII).append(RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[5]]));
                    Realms.setScreen(new DisconnectedRealmsScreen(access$3, llllllllllllIlllIlIlIlIIllIllIlI, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl)));
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
                catch (Exception lllllllllllllIIlIllIllIllIIllIll) {
                    Realms.clearResourcePack();
                    if (llIlIlIllIllIII(RealmsConnect.this.aborted ? 1 : 0)) {
                        return;
                    }
                    RealmsConnect.LOGGER.error(RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[6]], (Throwable)lllllllllllllIIlIllIllIllIIllIll);
                    String lllllllllllllIIlIllIllIllIIllIlI = lllllllllllllIIlIllIllIllIIllIll.toString();
                    if (llIlIlIllIllIIl(lllllllllllllIIlIllIllIllIIlllIl)) {
                        final String lllllllllllllIIlIllIllIllIIllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlIllIllIllIIlllIl.toString())).append(RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[7]]).append(lllllllllllllIIlIllIllIlIlIIlllI));
                        lllllllllllllIIlIllIllIllIIllIlI = lllllllllllllIIlIllIllIllIIllIlI.replaceAll(lllllllllllllIIlIllIllIllIIllIIl, RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[8]]);
                    }
                    final RealmsScreen access$4 = RealmsConnect.this.onlineScreen;
                    final String llllllllllllIlllIlIlIlIIllIllIlI2 = RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[9]];
                    final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[10]];
                    final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[RealmsConnect$1.lIIllIIIIlIIll[2]];
                    lllllllllllllIlIIlIlllIIlIIIIIIl2[RealmsConnect$1.lIIllIIIIlIIll[1]] = lllllllllllllIIlIllIllIllIIllIlI;
                    Realms.setScreen(new DisconnectedRealmsScreen(access$4, llllllllllllIlllIlIlIlIIllIllIlI2, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2)));
                }
            }
            
            private static void llIlIlIlIIlIlIl() {
                (lIIllIIIIIllII = new String[RealmsConnect$1.lIIllIIIIlIIll[11]])[RealmsConnect$1.lIIllIIIIlIIll[1]] = llIlIlIlIIlIIlI("EkgVq1xx1Ls0G8at5d3IvqfX0ZHjFQmab2Nkdd5aZAM=", "qhQsn");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[2]] = llIlIlIlIIlIIll("MhYKOBcyDUowEzgVATI=", "QydVr");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[3]] = llIlIlIlIIlIIll("KiYjCSggITUJM2AoNQQiPCYzOCIvPD8E", "NOPjG");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[4]] = llIlIlIlIIlIlII("QaxkpoezGeltAbje6obm6Q==", "Ydrxh");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[5]] = llIlIlIlIIlIlII("8B67fFnMlw8=", "vwjBm");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[6]] = llIlIlIlIIlIlII("twjEF5Cg0FzfJQJjfkxkNJvj9BslVT34gJFhSuDNphg=", "AWTeV");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[7]] = llIlIlIlIIlIIlI("WlaJ4nOxFBQ=", "VGdgw");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[8]] = llIlIlIlIIlIIlI("YjgGueMjt/k=", "ETGaI");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[9]] = llIlIlIlIIlIIlI("UTmP8K5sjso00S7kdui58A==", "NmJTc");
                RealmsConnect$1.lIIllIIIIIllII[RealmsConnect$1.lIIllIIIIlIIll[10]] = llIlIlIlIIlIlII("6CwxEWbCjXnCQZKv6SAPqZA6KojoNxPcV+2I/kbGcEw=", "GIQbP");
            }
            
            static {
                llIlIlIllIlIlll();
                llIlIlIlIIlIlIl();
            }
            
            private static boolean llIlIlIllIllIII(final int lllllllllllllIIlIllIllIlIlIllIlI) {
                return lllllllllllllIIlIllIllIlIlIllIlI != 0;
            }
            
            private static boolean llIlIlIllIllIlI(final int lllllllllllllIIlIllIllIlIlIlllll, final int lllllllllllllIIlIllIllIlIlIllllI) {
                return lllllllllllllIIlIllIllIlIlIlllll < lllllllllllllIIlIllIllIlIlIllllI;
            }
        }.start();
    }
    
    private static boolean llIlIlIllIllllI(final Object lllllllllllllIIlIllIllIlIIIlllIl) {
        return lllllllllllllIIlIllIllIlIIIlllIl != null;
    }
    
    public RealmsConnect(final RealmsScreen lllllllllllllIIlIllIllIlIlIlIllI) {
        this.aborted = (RealmsConnect.lIIllIIIIlIlIl[0] != 0);
        this.onlineScreen = lllllllllllllIIlIllIllIlIlIlIllI;
    }
    
    private static String llIlIlIllIllIll(String lllllllllllllIIlIllIllIlIIlIlIll, final String lllllllllllllIIlIllIllIlIIlIlIlI) {
        lllllllllllllIIlIllIllIlIIlIlIll = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIllIllIlIIlIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIllIlIIlIlllI = new StringBuilder();
        final char[] lllllllllllllIIlIllIllIlIIlIllIl = lllllllllllllIIlIllIllIlIIlIlIlI.toCharArray();
        int lllllllllllllIIlIllIllIlIIlIllII = RealmsConnect.lIIllIIIIlIlIl[0];
        final byte lllllllllllllIIlIllIllIlIIlIIllI = (Object)((String)lllllllllllllIIlIllIllIlIIlIlIll).toCharArray();
        final float lllllllllllllIIlIllIllIlIIlIIlIl = lllllllllllllIIlIllIllIlIIlIIllI.length;
        String lllllllllllllIIlIllIllIlIIlIIlII = (String)RealmsConnect.lIIllIIIIlIlIl[0];
        while (llIlIlIlllIIIII((int)lllllllllllllIIlIllIllIlIIlIIlII, (int)lllllllllllllIIlIllIllIlIIlIIlIl)) {
            final char lllllllllllllIIlIllIllIlIIllIIIl = lllllllllllllIIlIllIllIlIIlIIllI[lllllllllllllIIlIllIllIlIIlIIlII];
            lllllllllllllIIlIllIllIlIIlIlllI.append((char)(lllllllllllllIIlIllIllIlIIllIIIl ^ lllllllllllllIIlIllIllIlIIlIllIl[lllllllllllllIIlIllIllIlIIlIllII % lllllllllllllIIlIllIllIlIIlIllIl.length]));
            "".length();
            ++lllllllllllllIIlIllIllIlIIlIllII;
            ++lllllllllllllIIlIllIllIlIIlIIlII;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIllIlIIlIlllI);
    }
    
    public void tick() {
        if (llIlIlIllIllllI(this.connection)) {
            if (llIlIlIllIlllll(this.connection.isChannelOpen() ? 1 : 0)) {
                this.connection.processReceivedPackets();
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                this.connection.checkDisconnected();
            }
        }
    }
    
    static {
        llIlIlIllIlllIl();
        llIlIlIllIlllII();
        LOGGER = LogManager.getLogger();
    }
    
    private static boolean llIlIlIllIlllll(final int lllllllllllllIIlIllIllIlIIIllIll) {
        return lllllllllllllIIlIllIllIlIIIllIll != 0;
    }
    
    private static boolean llIlIlIlllIIIII(final int lllllllllllllIIlIllIllIlIIlIIIII, final int lllllllllllllIIlIllIllIlIIIlllll) {
        return lllllllllllllIIlIllIllIlIIlIIIII < lllllllllllllIIlIllIllIlIIIlllll;
    }
    
    static /* synthetic */ void access$1(final RealmsConnect lllllllllllllIIlIllIllIlIlIIIIII, final NetworkManager lllllllllllllIIlIllIllIlIIllllll) {
        lllllllllllllIIlIllIllIlIlIIIIII.connection = lllllllllllllIIlIllIllIlIIllllll;
    }
    
    private static void llIlIlIllIlllIl() {
        (lIIllIIIIlIlIl = new int[2])[0] = ((0x1C ^ 0x1B) & ~(0xBD ^ 0xBA));
        RealmsConnect.lIIllIIIIlIlIl[1] = " ".length();
    }
    
    private static void llIlIlIllIlllII() {
        (lIIllIIIIlIlII = new String[RealmsConnect.lIIllIIIIlIlIl[1]])[RealmsConnect.lIIllIIIIlIlIl[0]] = llIlIlIllIllIll("IwMsJCoCSy4nKR8DLjxqBQc+Iw==", "qfMHG");
    }
    
    public void abort() {
        this.aborted = (RealmsConnect.lIIllIIIIlIlIl[1] != 0);
    }
}
