// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.network;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import com.google.common.collect.Lists;
import net.minecraft.client.multiplayer.ThreadLanServerPing;
import java.util.Collections;
import java.util.List;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.DatagramPacket;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.InetAddress;
import java.net.MulticastSocket;
import org.apache.logging.log4j.LogManager;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

public class LanServerDetector
{
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] lllIIIllIlIIII;
    private static final /* synthetic */ AtomicInteger field_148551_a;
    
    static {
        lIIlllIllllllllI();
        field_148551_a = new AtomicInteger(LanServerDetector.lllIIIllIlIIII[0]);
        logger = LogManager.getLogger();
    }
    
    private static void lIIlllIllllllllI() {
        (lllIIIllIlIIII = new int[1])[0] = ((0x2 ^ 0x22) & ~(0x2 ^ 0x22));
    }
    
    public static class ThreadLanServerFind extends Thread
    {
        private static final /* synthetic */ int[] llIlIlIlllIIII;
        private final /* synthetic */ LanServerList localServerList;
        private final /* synthetic */ MulticastSocket socket;
        private final /* synthetic */ InetAddress broadcastAddress;
        private static final /* synthetic */ String[] llIlIlIllIllll;
        
        private static String lIIlIlIIlIlIIlII(final String llllllllllllIllIlIlIIIIlIlIIllll, final String llllllllllllIllIlIlIIIIlIlIlIIII) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIIIIlIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), ThreadLanServerFind.llIlIlIlllIIII[8]), "DES");
                final Cipher llllllllllllIllIlIlIIIIlIlIlIIll = Cipher.getInstance("DES");
                llllllllllllIllIlIlIIIIlIlIlIIll.init(ThreadLanServerFind.llIlIlIlllIIII[5], llllllllllllIllIlIlIIIIlIlIlIlII);
                return new String(llllllllllllIllIlIlIIIIlIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIIIIlIlIlIIlI) {
                llllllllllllIllIlIlIIIIlIlIlIIlI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void run() {
            final byte[] llllllllllllIllIlIlIIIIlIllIIIIl = new byte[ThreadLanServerFind.llIlIlIlllIIII[4]];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIlIIlIlIIlll(this.isInterrupted() ? 1 : 0)) {
                final DatagramPacket llllllllllllIllIlIlIIIIlIllIIIII = new DatagramPacket(llllllllllllIllIlIlIIIIlIllIIIIl, llllllllllllIllIlIlIIIIlIllIIIIl.length);
                try {
                    this.socket.receive(llllllllllllIllIlIlIIIIlIllIIIII);
                    "".length();
                    if (((0x69 ^ 0x7E) & ~(0xBC ^ 0xAB)) < 0) {
                        return;
                    }
                }
                catch (SocketTimeoutException llllllllllllIllIlIlIIIIlIlIlllll) {
                    "".length();
                    if ((0x28 ^ 0xE ^ (0x6 ^ 0x24)) != (0xE0 ^ 0xC5 ^ (0x9B ^ 0xBA))) {
                        return;
                    }
                    continue;
                }
                catch (IOException llllllllllllIllIlIlIIIIlIlIllllI) {
                    LanServerDetector.logger.error(ThreadLanServerFind.llIlIlIllIllll[ThreadLanServerFind.llIlIlIlllIIII[5]], (Throwable)llllllllllllIllIlIlIIIIlIlIllllI);
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                    break;
                }
                final String llllllllllllIllIlIlIIIIlIlIlllIl = new String(llllllllllllIllIlIlIIIIlIllIIIII.getData(), llllllllllllIllIlIlIIIIlIllIIIII.getOffset(), llllllllllllIllIlIlIIIIlIllIIIII.getLength());
                LanServerDetector.logger.debug(String.valueOf(new StringBuilder().append(llllllllllllIllIlIlIIIIlIllIIIII.getAddress()).append(ThreadLanServerFind.llIlIlIllIllll[ThreadLanServerFind.llIlIlIlllIIII[6]]).append(llllllllllllIllIlIlIIIIlIlIlllIl)));
                this.localServerList.func_77551_a(llllllllllllIllIlIlIIIIlIlIlllIl, llllllllllllIllIlIlIIIIlIllIIIII.getAddress());
            }
            try {
                this.socket.leaveGroup(this.broadcastAddress);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            catch (IOException ex) {}
            this.socket.close();
        }
        
        private static String lIIlIlIIlIlIIIll(String llllllllllllIllIlIlIIIIlIIllllII, final String llllllllllllIllIlIlIIIIlIIlllIll) {
            llllllllllllIllIlIlIIIIlIIllllII = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIIIIlIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlIIIIlIIllllll = new StringBuilder();
            final char[] llllllllllllIllIlIlIIIIlIIlllllI = llllllllllllIllIlIlIIIIlIIlllIll.toCharArray();
            int llllllllllllIllIlIlIIIIlIIllllIl = ThreadLanServerFind.llIlIlIlllIIII[0];
            final char llllllllllllIllIlIlIIIIlIIllIlll = (Object)llllllllllllIllIlIlIIIIlIIllllII.toCharArray();
            final double llllllllllllIllIlIlIIIIlIIllIllI = llllllllllllIllIlIlIIIIlIIllIlll.length;
            double llllllllllllIllIlIlIIIIlIIllIlIl = ThreadLanServerFind.llIlIlIlllIIII[0];
            while (lIIlIlIIlIlIlIII((int)llllllllllllIllIlIlIIIIlIIllIlIl, (int)llllllllllllIllIlIlIIIIlIIllIllI)) {
                final char llllllllllllIllIlIlIIIIlIlIIIIlI = llllllllllllIllIlIlIIIIlIIllIlll[llllllllllllIllIlIlIIIIlIIllIlIl];
                llllllllllllIllIlIlIIIIlIIllllll.append((char)(llllllllllllIllIlIlIIIIlIlIIIIlI ^ llllllllllllIllIlIlIIIIlIIlllllI[llllllllllllIllIlIlIIIIlIIllllIl % llllllllllllIllIlIlIIIIlIIlllllI.length]));
                "".length();
                ++llllllllllllIllIlIlIIIIlIIllllIl;
                ++llllllllllllIllIlIlIIIIlIIllIlIl;
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlIIIIlIIllllll);
        }
        
        public ThreadLanServerFind(final LanServerList llllllllllllIllIlIlIIIIlIllIlIIl) throws IOException {
            super(String.valueOf(new StringBuilder(ThreadLanServerFind.llIlIlIllIllll[ThreadLanServerFind.llIlIlIlllIIII[0]]).append(LanServerDetector.field_148551_a.incrementAndGet())));
            this.localServerList = llllllllllllIllIlIlIIIIlIllIlIIl;
            this.setDaemon((boolean)(ThreadLanServerFind.llIlIlIlllIIII[1] != 0));
            this.socket = new MulticastSocket(ThreadLanServerFind.llIlIlIlllIIII[2]);
            this.broadcastAddress = InetAddress.getByName(ThreadLanServerFind.llIlIlIllIllll[ThreadLanServerFind.llIlIlIlllIIII[1]]);
            this.socket.setSoTimeout(ThreadLanServerFind.llIlIlIlllIIII[3]);
            this.socket.joinGroup(this.broadcastAddress);
        }
        
        static {
            lIIlIlIIlIlIIllI();
            lIIlIlIIlIlIIlIl();
        }
        
        private static void lIIlIlIIlIlIIllI() {
            (llIlIlIlllIIII = new int[9])[0] = ((0x5E ^ 0x4B) & ~(0xB4 ^ 0xA1));
            ThreadLanServerFind.llIlIlIlllIIII[1] = " ".length();
            ThreadLanServerFind.llIlIlIlllIIII[2] = (-(0xFFFF92AB & 0x6FF5) & (0xFFFF9BFF & 0x77FD));
            ThreadLanServerFind.llIlIlIlllIIII[3] = (-(0xFFFFED76 & 0x3AFF) & (0xFFFFBFFD & 0x7BFF));
            ThreadLanServerFind.llIlIlIlllIIII[4] = (-(0xFFFFF5DC & 0x7BEF) & (0xFFFFFDEF & 0x77DB));
            ThreadLanServerFind.llIlIlIlllIIII[5] = "  ".length();
            ThreadLanServerFind.llIlIlIlllIIII[6] = "   ".length();
            ThreadLanServerFind.llIlIlIlllIIII[7] = (0xB1 ^ 0xB5);
            ThreadLanServerFind.llIlIlIlllIIII[8] = (11 + 107 - 109 + 127 ^ 16 + 115 - 93 + 90);
        }
        
        private static boolean lIIlIlIIlIlIlIII(final int llllllllllllIllIlIlIIIIlIIllIIIl, final int llllllllllllIllIlIlIIIIlIIllIIII) {
            return llllllllllllIllIlIlIIIIlIIllIIIl < llllllllllllIllIlIlIIIIlIIllIIII;
        }
        
        private static boolean lIIlIlIIlIlIIlll(final int llllllllllllIllIlIlIIIIlIIlIlllI) {
            return llllllllllllIllIlIlIIIIlIIlIlllI != 0;
        }
        
        private static void lIIlIlIIlIlIIlIl() {
            (llIlIlIllIllll = new String[ThreadLanServerFind.llIlIlIlllIIII[7]])[ThreadLanServerFind.llIlIlIlllIIII[0]] = lIIlIlIIlIlIIIll("NicKOxAIMAEaMR8yAQsBFTRESw==", "zFdhu");
            ThreadLanServerFind.llIlIlIllIllll[ThreadLanServerFind.llIlIlIlllIIII[1]] = lIIlIlIIlIlIIlII("mtTyBv1llCnIuberNunrLw==", "QEIry");
            ThreadLanServerFind.llIlIlIllIllll[ThreadLanServerFind.llIlIlIlllIIII[5]] = lIIlIlIIlIlIIlII("89vGd8dwQWJm2N7ryiK50J/rVbmaaePL", "ZtZcp");
            ThreadLanServerFind.llIlIlIllIllll[ThreadLanServerFind.llIlIlIlllIIII[6]] = lIIlIlIIlIlIIlII("6feURsklslk=", "bQRLm");
        }
    }
    
    public static class LanServerList
    {
        private /* synthetic */ List<LanServer> listOfLanServers;
        /* synthetic */ boolean wasUpdated;
        private static final /* synthetic */ String[] lllIIIIIIlIIlI;
        private static final /* synthetic */ int[] lllIIIIIIlIllI;
        
        private static boolean lIIllIllllllIlll(final int llllllllllllIllIIIlIIIIlllIIllll) {
            return llllllllllllIllIIIlIIIIlllIIllll != 0;
        }
        
        public synchronized boolean getWasUpdated() {
            return this.wasUpdated;
        }
        
        static {
            lIIllIllllllIlIl();
            lIIllIllllllIIlI();
        }
        
        private static String lIIllIlllllIllll(final String llllllllllllIllIIIlIIIIlllIllIII, final String llllllllllllIllIIIlIIIIlllIlIlll) {
            try {
                final SecretKeySpec llllllllllllIllIIIlIIIIlllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIIIlllIlIlll.getBytes(StandardCharsets.UTF_8)), LanServerList.lllIIIIIIlIllI[2]), "DES");
                final Cipher llllllllllllIllIIIlIIIIlllIllIlI = Cipher.getInstance("DES");
                llllllllllllIllIIIlIIIIlllIllIlI.init(LanServerList.lllIIIIIIlIllI[3], llllllllllllIllIIIlIIIIlllIllIll);
                return new String(llllllllllllIllIIIlIIIIlllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIIIlllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIlIIIIlllIllIIl) {
                llllllllllllIllIIIlIIIIlllIllIIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllIllllllIIlI() {
            (lllIIIIIIlIIlI = new String[LanServerList.lllIIIIIIlIllI[1]])[LanServerList.lllIIIIIIlIllI[0]] = lIIllIlllllIllll("Erojxt6JiHk=", "HLWit");
        }
        
        public synchronized List<LanServer> getLanServers() {
            return Collections.unmodifiableList((List<? extends LanServer>)this.listOfLanServers);
        }
        
        public synchronized void func_77551_a(final String llllllllllllIllIIIlIIIIllllIIllI, final InetAddress llllllllllllIllIIIlIIIIllllIIlIl) {
            final String llllllllllllIllIIIlIIIIllllIlIll = ThreadLanServerPing.getMotdFromPingResponse(llllllllllllIllIIIlIIIIllllIIllI);
            String llllllllllllIllIIIlIIIIllllIlIlI = ThreadLanServerPing.getAdFromPingResponse(llllllllllllIllIIIlIIIIllllIIllI);
            if (lIIllIllllllIllI(llllllllllllIllIIIlIIIIllllIlIlI)) {
                llllllllllllIllIIIlIIIIllllIlIlI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIIlIIIIllllIIlIl.getHostAddress())).append(LanServerList.lllIIIIIIlIIlI[LanServerList.lllIIIIIIlIllI[0]]).append(llllllllllllIllIIIlIIIIllllIlIlI));
                boolean llllllllllllIllIIIlIIIIllllIlIIl = LanServerList.lllIIIIIIlIllI[0] != 0;
                final boolean llllllllllllIllIIIlIIIIllllIIIII = (boolean)this.listOfLanServers.iterator();
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!lIIllIlllllllIII(((Iterator)llllllllllllIllIIIlIIIIllllIIIII).hasNext() ? 1 : 0)) {
                    final LanServer llllllllllllIllIIIlIIIIllllIlIII = ((Iterator<LanServer>)llllllllllllIllIIIlIIIIllllIIIII).next();
                    if (lIIllIllllllIlll(llllllllllllIllIIIlIIIIllllIlIII.getServerIpPort().equals(llllllllllllIllIIIlIIIIllllIlIlI) ? 1 : 0)) {
                        llllllllllllIllIIIlIIIIllllIlIII.updateLastSeen();
                        llllllllllllIllIIIlIIIIllllIlIIl = (LanServerList.lllIIIIIIlIllI[1] != 0);
                        "".length();
                        if ("   ".length() <= ((0x11 ^ 0x1D ^ (0x50 ^ 0x9)) & (0xC5 ^ 0xBD ^ (0x87 ^ 0xAA) ^ -" ".length()))) {
                            return;
                        }
                        break;
                    }
                }
                if (lIIllIlllllllIII(llllllllllllIllIIIlIIIIllllIlIIl ? 1 : 0)) {
                    this.listOfLanServers.add(new LanServer(llllllllllllIllIIIlIIIIllllIlIll, llllllllllllIllIIIlIIIIllllIlIlI));
                    "".length();
                    this.wasUpdated = (LanServerList.lllIIIIIIlIllI[1] != 0);
                }
            }
        }
        
        private static boolean lIIllIlllllllIII(final int llllllllllllIllIIIlIIIIlllIIllIl) {
            return llllllllllllIllIIIlIIIIlllIIllIl == 0;
        }
        
        public LanServerList() {
            this.listOfLanServers = (List<LanServer>)Lists.newArrayList();
        }
        
        public synchronized void setWasNotUpdated() {
            this.wasUpdated = (LanServerList.lllIIIIIIlIllI[0] != 0);
        }
        
        private static boolean lIIllIllllllIllI(final Object llllllllllllIllIIIlIIIIlllIlIIIl) {
            return llllllllllllIllIIIlIIIIlllIlIIIl != null;
        }
        
        private static void lIIllIllllllIlIl() {
            (lllIIIIIIlIllI = new int[4])[0] = ((0x6 ^ 0x17) & ~(0x16 ^ 0x7));
            LanServerList.lllIIIIIIlIllI[1] = " ".length();
            LanServerList.lllIIIIIIlIllI[2] = (0xBB ^ 0xB3);
            LanServerList.lllIIIIIIlIllI[3] = "  ".length();
        }
    }
    
    public static class LanServer
    {
        private /* synthetic */ long timeLastSeen;
        private /* synthetic */ String lanServerMotd;
        private /* synthetic */ String lanServerIpPort;
        
        public LanServer(final String llllllllllllIllIlllllIlIIIIIllIl, final String llllllllllllIllIlllllIlIIIIIllll) {
            this.lanServerMotd = llllllllllllIllIlllllIlIIIIIllIl;
            this.lanServerIpPort = llllllllllllIllIlllllIlIIIIIllll;
            this.timeLastSeen = Minecraft.getSystemTime();
        }
        
        public void updateLastSeen() {
            this.timeLastSeen = Minecraft.getSystemTime();
        }
        
        public String getServerIpPort() {
            return this.lanServerIpPort;
        }
        
        public String getServerMotd() {
            return this.lanServerMotd;
        }
    }
}
