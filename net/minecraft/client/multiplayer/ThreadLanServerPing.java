// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;
import java.net.DatagramSocket;

public class ThreadLanServerPing extends Thread
{
    private final /* synthetic */ DatagramSocket socket;
    private final /* synthetic */ String address;
    private final /* synthetic */ String motd;
    private static final /* synthetic */ int[] llIlllllIIIIII;
    private /* synthetic */ boolean isStopping;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] llIllllIlllIlI;
    private static final /* synthetic */ AtomicInteger field_148658_a;
    
    private static void lIIllIlIlllIlIII() {
        (llIllllIlllIlI = new String[ThreadLanServerPing.llIlllllIIIIII[21]])[ThreadLanServerPing.llIlllllIIIIII[0]] = lIIllIlIlllIIIII("HyodGAMhPRY5NjolFC4Uc2g=", "SKsKf");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[1]] = lIIllIlIlllIIIIl("sN4XkKlq/aAtz7sV0yYPPQ==", "srdLo");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[3]] = lIIllIlIlllIIIlI("a/Kdsach/p1hQ86u6vxPFW1ThLeXMCxZ", "EHLNk");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[4]] = lIIllIlIlllIIIII("GAMtJxUe", "CNbsQ");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[5]] = lIIllIlIlllIIIII("GWUjBDEGFzUKIR8=", "BJnKe");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[6]] = lIIllIlIlllIIIlI("FwzyKtg5MDM=", "GoUvt");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[7]] = lIIllIlIlllIIIII("NzokGgkx", "lwkNM");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[8]] = lIIllIlIlllIIIII("IisVNgshJUYrDQ==", "OBfEb");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[9]] = lIIllIlIlllIIIIl("hXYkGsqRE1s=", "hAUFv");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[10]] = lIIllIlIlllIIIII("Njo+IQ4w", "mwquJ");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[11]] = lIIllIlIlllIIIII("OzoYOwY4NEsmAA==", "VSkHo");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[12]] = lIIllIlIlllIIIIl("597xYuYNdCA=", "MalDq");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[13]] = lIIllIlIlllIIIII("EEoIBhMPOA==", "KeEIG");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[14]] = lIIllIlIlllIIIlI("RyfU1PDHOl8=", "XHrBV");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[15]] = lIIllIlIlllIIIIl("/p17fgXDtrE=", "PiIuU");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[16]] = lIIllIlIlllIIIIl("X3k2kwLohOo=", "qPjkU");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[17]] = lIIllIlIlllIIIII("OkQvFgclNg==", "akbYS");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[18]] = lIIllIlIlllIIIlI("jAnQaeFh8mc=", "meiph");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[19]] = lIIllIlIlllIIIIl("zY8Oqkg2Xi8=", "BsXJl");
        ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[20]] = lIIllIlIlllIIIIl("HJ7ZGqSJhEc=", "uIHau");
    }
    
    private static String lIIllIlIlllIIIlI(final String llllllllllllIllIIIllIIllIIIlIIII, final String llllllllllllIllIIIllIIllIIIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIllIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIllIIIIllll.getBytes(StandardCharsets.UTF_8)), ThreadLanServerPing.llIlllllIIIIII[9]), "DES");
            final Cipher llllllllllllIllIIIllIIllIIIlIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIIllIIllIIIlIIlI.init(ThreadLanServerPing.llIlllllIIIIII[3], llllllllllllIllIIIllIIllIIIlIIll);
            return new String(llllllllllllIllIIIllIIllIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIllIIIlIIIl) {
            llllllllllllIllIIIllIIllIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void interrupt() {
        super.interrupt();
        this.isStopping = (ThreadLanServerPing.llIlllllIIIIII[0] != 0);
    }
    
    @Override
    public void run() {
        final String llllllllllllIllIIIllIIllIlIIIIlI = getPingResponse(this.motd, this.address);
        final byte[] llllllllllllIllIIIllIIllIlIIIIIl = llllllllllllIllIIIllIIllIlIIIIlI.getBytes();
        "".length();
        if (" ".length() <= ((72 + 132 - 74 + 71 ^ 44 + 140 - 117 + 85) & (0x88 ^ 0x9C ^ (0x84 ^ 0xC1) ^ -" ".length()))) {
            return;
        }
        while (lIIllIlIlllIllII(this.isInterrupted() ? 1 : 0) && !lIIllIlIlllIllII(this.isStopping ? 1 : 0)) {
            try {
                final InetAddress llllllllllllIllIIIllIIllIlIIIIII = InetAddress.getByName(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[1]]);
                final DatagramPacket llllllllllllIllIIIllIIllIIllllll = new DatagramPacket(llllllllllllIllIIIllIIllIlIIIIIl, llllllllllllIllIIIllIIllIlIIIIIl.length, llllllllllllIllIIIllIIllIlIIIIII, ThreadLanServerPing.llIlllllIIIIII[2]);
                this.socket.send(llllllllllllIllIIIllIIllIIllllll);
                "".length();
                if ((0x7A ^ 0x60 ^ (0x92 ^ 0x8C)) == 0x0) {
                    return;
                }
            }
            catch (IOException llllllllllllIllIIIllIIllIIlllllI) {
                ThreadLanServerPing.logger.warn(String.valueOf(new StringBuilder(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[3]]).append(llllllllllllIllIIIllIIllIIlllllI.getMessage())));
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
                break;
            }
            try {
                Thread.sleep(1500L);
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                continue;
            }
            catch (InterruptedException ex) {}
        }
    }
    
    public static String getAdFromPingResponse(final String llllllllllllIllIIIllIIllIIlIIIIl) {
        final int llllllllllllIllIIIllIIllIIlIIIII = llllllllllllIllIIIllIIllIIlIIIIl.indexOf(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[13]]);
        if (lIIllIlIlllIllIl(llllllllllllIllIIIllIIllIIlIIIII)) {
            return null;
        }
        final int llllllllllllIllIIIllIIllIIIlllll = llllllllllllIllIIIllIIllIIlIIIIl.indexOf(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[14]], llllllllllllIllIIIllIIllIIlIIIII + ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[15]].length());
        if (lIIllIlIlllIllll(llllllllllllIllIIIllIIllIIIlllll)) {
            return null;
        }
        final int llllllllllllIllIIIllIIllIIIllllI = llllllllllllIllIIIllIIllIIlIIIIl.indexOf(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[16]], llllllllllllIllIIIllIIllIIlIIIII + ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[17]].length());
        if (lIIllIlIlllIllIl(llllllllllllIllIIIllIIllIIIllllI)) {
            return null;
        }
        final int llllllllllllIllIIIllIIllIIIlllIl = llllllllllllIllIIIllIIllIIlIIIIl.indexOf(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[18]], llllllllllllIllIIIllIIllIIIllllI + ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[19]].length());
        String substring;
        if (lIIllIlIlllIlllI(llllllllllllIllIIIllIIllIIIlllIl, llllllllllllIllIIIllIIllIIIllllI)) {
            substring = null;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        else {
            substring = llllllllllllIllIIIllIIllIIlIIIIl.substring(llllllllllllIllIIIllIIllIIIllllI + ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[20]].length(), llllllllllllIllIIIllIIllIIIlllIl);
        }
        return substring;
    }
    
    public static String getPingResponse(final String llllllllllllIllIIIllIIllIIllIIll, final String llllllllllllIllIIIllIIllIIllIIII) {
        return String.valueOf(new StringBuilder(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[4]]).append(llllllllllllIllIIIllIIllIIllIIll).append(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[5]]).append(llllllllllllIllIIIllIIllIIllIIII).append(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[6]]));
    }
    
    private static String lIIllIlIlllIIIIl(final String llllllllllllIllIIIllIIllIIIIIIll, final String llllllllllllIllIIIllIIllIIIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIllIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIllIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIIllIIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIIllIIIIIlIl.init(ThreadLanServerPing.llIlllllIIIIII[3], llllllllllllIllIIIllIIllIIIIIllI);
            return new String(llllllllllllIllIIIllIIllIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIllIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIllIIIIIlII) {
            llllllllllllIllIIIllIIllIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIlIlllIIIII(String llllllllllllIllIIIllIIlIlllIlllI, final String llllllllllllIllIIIllIIlIllllIIlI) {
        llllllllllllIllIIIllIIlIlllIlllI = new String(Base64.getDecoder().decode(llllllllllllIllIIIllIIlIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIIlIllllIIIl = new StringBuilder();
        final char[] llllllllllllIllIIIllIIlIllllIIII = llllllllllllIllIIIllIIlIllllIIlI.toCharArray();
        int llllllllllllIllIIIllIIlIlllIllll = ThreadLanServerPing.llIlllllIIIIII[0];
        final float llllllllllllIllIIIllIIlIlllIlIIl = (Object)llllllllllllIllIIIllIIlIlllIlllI.toCharArray();
        final Exception llllllllllllIllIIIllIIlIlllIlIII = (Exception)llllllllllllIllIIIllIIlIlllIlIIl.length;
        double llllllllllllIllIIIllIIlIlllIIlll = ThreadLanServerPing.llIlllllIIIIII[0];
        while (lIIllIlIlllIlllI((int)llllllllllllIllIIIllIIlIlllIIlll, (int)llllllllllllIllIIIllIIlIlllIlIII)) {
            final char llllllllllllIllIIIllIIlIllllIlII = llllllllllllIllIIIllIIlIlllIlIIl[llllllllllllIllIIIllIIlIlllIIlll];
            llllllllllllIllIIIllIIlIllllIIIl.append((char)(llllllllllllIllIIIllIIlIllllIlII ^ llllllllllllIllIIIllIIlIllllIIII[llllllllllllIllIIIllIIlIlllIllll % llllllllllllIllIIIllIIlIllllIIII.length]));
            "".length();
            ++llllllllllllIllIIIllIIlIlllIllll;
            ++llllllllllllIllIIIllIIlIlllIIlll;
            "".length();
            if ((0x3D ^ 0x39) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIIlIllllIIIl);
    }
    
    static {
        lIIllIlIlllIlIll();
        lIIllIlIlllIlIII();
        field_148658_a = new AtomicInteger(ThreadLanServerPing.llIlllllIIIIII[0]);
        logger = LogManager.getLogger();
    }
    
    private static boolean lIIllIlIlllIlllI(final int llllllllllllIllIIIllIIlIlllIIIll, final int llllllllllllIllIIIllIIlIlllIIIlI) {
        return llllllllllllIllIIIllIIlIlllIIIll < llllllllllllIllIIIllIIlIlllIIIlI;
    }
    
    private static void lIIllIlIlllIlIll() {
        (llIlllllIIIIII = new int[22])[0] = ((51 + 107 - 129 + 132 ^ 15 + 163 - 74 + 88) & (111 + 63 - 80 + 71 ^ 60 + 73 - 107 + 170 ^ -" ".length()));
        ThreadLanServerPing.llIlllllIIIIII[1] = " ".length();
        ThreadLanServerPing.llIlllllIIIIII[2] = (-(0xFFFFF031 & 0x6FCF) & (0xFFFFF97F & 0x77DD));
        ThreadLanServerPing.llIlllllIIIIII[3] = "  ".length();
        ThreadLanServerPing.llIlllllIIIIII[4] = "   ".length();
        ThreadLanServerPing.llIlllllIIIIII[5] = (0x87 ^ 0x83);
        ThreadLanServerPing.llIlllllIIIIII[6] = (102 + 73 - 150 + 103 ^ 15 + 88 - 41 + 71);
        ThreadLanServerPing.llIlllllIIIIII[7] = (0x81 ^ 0xC2 ^ (0x71 ^ 0x34));
        ThreadLanServerPing.llIlllllIIIIII[8] = (0x49 ^ 0x4E);
        ThreadLanServerPing.llIlllllIIIIII[9] = (0x3B ^ 0x7F ^ (0x11 ^ 0x5D));
        ThreadLanServerPing.llIlllllIIIIII[10] = (0x5C ^ 0x55);
        ThreadLanServerPing.llIlllllIIIIII[11] = (7 + 34 + 106 + 34 ^ 55 + 25 - 18 + 129);
        ThreadLanServerPing.llIlllllIIIIII[12] = (0x24 ^ 0x2F);
        ThreadLanServerPing.llIlllllIIIIII[13] = (0x57 ^ 0x5B);
        ThreadLanServerPing.llIlllllIIIIII[14] = (0x36 ^ 0x7D ^ (0xD5 ^ 0x93));
        ThreadLanServerPing.llIlllllIIIIII[15] = (((0xF0 ^ 0xB9) & ~(0x69 ^ 0x20)) ^ (0x73 ^ 0x7D));
        ThreadLanServerPing.llIlllllIIIIII[16] = (0xA9 ^ 0xA6);
        ThreadLanServerPing.llIlllllIIIIII[17] = (132 + 168 - 284 + 154 ^ 136 + 154 - 229 + 125);
        ThreadLanServerPing.llIlllllIIIIII[18] = (0x7F ^ 0x6E);
        ThreadLanServerPing.llIlllllIIIIII[19] = (0x96 ^ 0x84);
        ThreadLanServerPing.llIlllllIIIIII[20] = (0x40 ^ 0x53);
        ThreadLanServerPing.llIlllllIIIIII[21] = (0xB6 ^ 0xA2);
    }
    
    public static String getMotdFromPingResponse(final String llllllllllllIllIIIllIIllIIlIlIIl) {
        final int llllllllllllIllIIIllIIllIIlIlIll = llllllllllllIllIIIllIIllIIlIlIIl.indexOf(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[7]]);
        if (lIIllIlIlllIllIl(llllllllllllIllIIIllIIllIIlIlIll)) {
            return ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[8]];
        }
        final int llllllllllllIllIIIllIIllIIlIlIlI = llllllllllllIllIIIllIIllIIlIlIIl.indexOf(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[9]], llllllllllllIllIIIllIIllIIlIlIll + ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[10]].length());
        String substring;
        if (lIIllIlIlllIlllI(llllllllllllIllIIIllIIllIIlIlIlI, llllllllllllIllIIIllIIllIIlIlIll)) {
            substring = ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[11]];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            substring = llllllllllllIllIIIllIIllIIlIlIIl.substring(llllllllllllIllIIIllIIllIIlIlIll + ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[12]].length(), llllllllllllIllIIIllIIllIIlIlIlI);
        }
        return substring;
    }
    
    private static boolean lIIllIlIlllIllIl(final int llllllllllllIllIIIllIIlIllIlllII) {
        return llllllllllllIllIIIllIIlIllIlllII < 0;
    }
    
    private static boolean lIIllIlIlllIllII(final int llllllllllllIllIIIllIIlIlllIIIII) {
        return llllllllllllIllIIIllIIlIlllIIIII == 0;
    }
    
    private static boolean lIIllIlIlllIllll(final int llllllllllllIllIIIllIIlIllIllllI) {
        return llllllllllllIllIIIllIIlIllIllllI >= 0;
    }
    
    public ThreadLanServerPing(final String llllllllllllIllIIIllIIllIlIIllIl, final String llllllllllllIllIIIllIIllIlIIlIIl) throws IOException {
        super(String.valueOf(new StringBuilder(ThreadLanServerPing.llIllllIlllIlI[ThreadLanServerPing.llIlllllIIIIII[0]]).append(ThreadLanServerPing.field_148658_a.incrementAndGet())));
        this.isStopping = (ThreadLanServerPing.llIlllllIIIIII[1] != 0);
        this.motd = llllllllllllIllIIIllIIllIlIIllIl;
        this.address = llllllllllllIllIIIllIIllIlIIlIIl;
        this.setDaemon((boolean)(ThreadLanServerPing.llIlllllIIIIII[1] != 0));
        this.socket = new DatagramSocket();
    }
}
