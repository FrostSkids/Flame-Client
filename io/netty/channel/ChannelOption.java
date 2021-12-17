// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.PlatformDependent;
import io.netty.buffer.ByteBufAllocator;
import java.util.concurrent.ConcurrentMap;
import java.net.InetAddress;
import java.net.NetworkInterface;
import io.netty.util.UniqueName;

public class ChannelOption<T> extends UniqueName
{
    private static final /* synthetic */ int[] lllIIlIIllIllI;
    private static final /* synthetic */ String[] lllIIlIIllIlII;
    private static final /* synthetic */ ConcurrentMap<String, Boolean> names;
    
    static {
        lIIlllllIlIllllI();
        lIIlllllIlIllIIl();
        names = PlatformDependent.newConcurrentHashMap();
        ALLOCATOR = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[1]]);
        RCVBUF_ALLOCATOR = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[2]]);
        MESSAGE_SIZE_ESTIMATOR = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[3]]);
        CONNECT_TIMEOUT_MILLIS = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[4]]);
        MAX_MESSAGES_PER_READ = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[5]]);
        WRITE_SPIN_COUNT = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[6]]);
        WRITE_BUFFER_HIGH_WATER_MARK = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[7]]);
        WRITE_BUFFER_LOW_WATER_MARK = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[8]]);
        ALLOW_HALF_CLOSURE = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[9]]);
        AUTO_READ = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[10]]);
        AUTO_CLOSE = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[11]]);
        SO_BROADCAST = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[12]]);
        SO_KEEPALIVE = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[13]]);
        SO_SNDBUF = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[14]]);
        SO_RCVBUF = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[15]]);
        SO_REUSEADDR = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[16]]);
        SO_LINGER = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[17]]);
        SO_BACKLOG = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[18]]);
        SO_TIMEOUT = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[19]]);
        IP_TOS = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[20]]);
        IP_MULTICAST_ADDR = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[21]]);
        IP_MULTICAST_IF = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[22]]);
        IP_MULTICAST_TTL = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[23]]);
        IP_MULTICAST_LOOP_DISABLED = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[24]]);
        TCP_NODELAY = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[25]]);
        AIO_READ_TIMEOUT = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[26]]);
        AIO_WRITE_TIMEOUT = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[27]]);
        DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION = valueOf(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[28]]);
    }
    
    private static void lIIlllllIlIllllI() {
        (lllIIlIIllIllI = new int[30])[0] = ((0x54 ^ 0xF) & ~(0x42 ^ 0x19));
        ChannelOption.lllIIlIIllIllI[1] = " ".length();
        ChannelOption.lllIIlIIllIllI[2] = "  ".length();
        ChannelOption.lllIIlIIllIllI[3] = "   ".length();
        ChannelOption.lllIIlIIllIllI[4] = (0x59 ^ 0x5D);
        ChannelOption.lllIIlIIllIllI[5] = (2 + 94 - 14 + 49 ^ 91 + 133 - 115 + 25);
        ChannelOption.lllIIlIIllIllI[6] = (0x99 ^ 0x9F);
        ChannelOption.lllIIlIIllIllI[7] = (0xC0 ^ 0xC7);
        ChannelOption.lllIIlIIllIllI[8] = (0xA2 ^ 0xAA);
        ChannelOption.lllIIlIIllIllI[9] = (105 + 157 - 240 + 150 ^ 133 + 107 - 183 + 108);
        ChannelOption.lllIIlIIllIllI[10] = (0x6F ^ 0x65);
        ChannelOption.lllIIlIIllIllI[11] = (71 + 6 + 29 + 51 ^ 21 + 121 - 38 + 46);
        ChannelOption.lllIIlIIllIllI[12] = (0x43 ^ 0x4F);
        ChannelOption.lllIIlIIllIllI[13] = (0x5C ^ 0x51);
        ChannelOption.lllIIlIIllIllI[14] = (0xA0 ^ 0x91 ^ (0x5F ^ 0x60));
        ChannelOption.lllIIlIIllIllI[15] = (43 + 117 - 135 + 134 ^ 55 + 107 - 44 + 26);
        ChannelOption.lllIIlIIllIllI[16] = (0xB2 ^ 0xA2);
        ChannelOption.lllIIlIIllIllI[17] = (0x2 ^ 0x13);
        ChannelOption.lllIIlIIllIllI[18] = (0xAC ^ 0xBE);
        ChannelOption.lllIIlIIllIllI[19] = (0x41 ^ 0x52);
        ChannelOption.lllIIlIIllIllI[20] = (0xB7 ^ 0xA3);
        ChannelOption.lllIIlIIllIllI[21] = (0x8A ^ 0x86 ^ (0xDE ^ 0xC7));
        ChannelOption.lllIIlIIllIllI[22] = (0xB6 ^ 0x8E ^ (0xB1 ^ 0x9F));
        ChannelOption.lllIIlIIllIllI[23] = (0xA4 ^ 0xB3);
        ChannelOption.lllIIlIIllIllI[24] = (0xAD ^ 0xB5);
        ChannelOption.lllIIlIIllIllI[25] = (0x82 ^ 0x9B);
        ChannelOption.lllIIlIIllIllI[26] = (0xFE ^ 0x9E ^ (0x22 ^ 0x58));
        ChannelOption.lllIIlIIllIllI[27] = (94 + 140 - 233 + 190 ^ 131 + 35 - 96 + 94);
        ChannelOption.lllIIlIIllIllI[28] = (0x5B ^ 0x19 ^ (0x2A ^ 0x74));
        ChannelOption.lllIIlIIllIllI[29] = (0x46 ^ 0x5B);
    }
    
    private static void lIIlllllIlIllIIl() {
        (lllIIlIIllIlII = new String[ChannelOption.lllIIlIIllIllI[29]])[ChannelOption.lllIIlIIllIllI[0]] = lIIlllllIlIlIIII("V3BjR4685fc=", "pURhU");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[1]] = lIIlllllIlIlIIIl("DCYjNhcMPiAr", "MjoyT");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[2]] = lIIlllllIlIlIIII("nC7j3DLmia+peKRDjR90KX4Q8zmIm3RN", "BtXaq");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[3]] = lIIlllllIlIlIIlI("Rf2WWTCntPB8NjCzrUXY+ykBArBgmkEU", "Theyx");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[4]] = lIIlllllIlIlIIlI("z8jeGVr4wY6iYjYlQnV/0GcRofnmGkTs", "XIZqj");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[5]] = lIIlllllIlIlIIII("MRwhhqa0P1+kqG9+tJq8gbIcTtJ4j2/m", "ytHZL");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[6]] = lIIlllllIlIlIIII("Yd2vj7+28qQ8sV3pMaPUo8NI3HjcDO8e", "klIpF");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[7]] = lIIlllllIlIlIIlI("686P3sXumgk70RvrzPJ8sX93+JOgMAAmGfq6Bf3aBho=", "lBree");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[8]] = lIIlllllIlIlIIII("Yz5sYBPWiehJnoBb6RKQOWw3ToM5YbQltx1jo1rZjEk=", "XVJRC");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[9]] = lIIlllllIlIlIIIl("DD8NJBMSOwAnAhIwDSQXGCEE", "MsAkD");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[10]] = lIIlllllIlIlIIlI("kxq46euYwEDD91pNFiTsyQ==", "FVGQy");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[11]] = lIIlllllIlIlIIIl("MDM7OykyKiAnMw==", "qfotv");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[12]] = lIIlllllIlIlIIIl("GjouDzkGNDUOKhoh", "IuqMk");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[13]] = lIIlllllIlIlIIII("gu/+smxCdD+jIT11MKFMRA==", "fUVPP");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[14]] = lIIlllllIlIlIIIl("EA4YOygHAxIu", "CAGhf");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[15]] = lIIlllllIlIlIIII("F6y4MAwLQOobWJwaphtEGA==", "hWQeW");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[16]] = lIIlllllIlIlIIIl("Fxg0JxERBC40EAAF", "DWkuT");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[17]] = lIIlllllIlIlIIII("uvotBa8COhSeMvd0U7/Q4Q==", "qpFTq");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[18]] = lIIlllllIlIlIIIl("AAkmIQUQDTUsAw==", "SFycD");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[19]] = lIIlllllIlIlIIII("LKUyRJsoGEfRqXUC4ra2gA==", "aSpkp");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[20]] = lIIlllllIlIlIIII("dBcRk7iNOPg=", "EUKrh");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[21]] = lIIlllllIlIlIIIl("KDoMLBYtPhoiAjI+DCAHJTg=", "ajSaC");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[22]] = lIIlllllIlIlIIII("A9AizBTC/dvwgqXPtjE1vA==", "uWNgP");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[23]] = lIIlllllIlIlIIIl("MQMxIw80ByctGysHMToONA==", "xSnnZ");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[24]] = lIIlllllIlIlIIlI("rpsAkwCOg4ULf74LnIGCNPSWvGU/yif2pmdXfN/RQ98=", "xjEGy");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[25]] = lIIlllllIlIlIIIl("PgcRBQslAAQWBDM=", "jDAZE");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[26]] = lIIlllllIlIlIIII("znz1TGdRggj/G5ZI9vFRWo6kKfnMNWgU", "ysevG");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[27]] = lIIlllllIlIlIIII("Na4rBF6eux1cBPzBsBvnHSJsBeNTl7Yx", "HOQjU");
        ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[28]] = lIIlllllIlIlIIIl("JxkRIAwxGQg+CCsZCy8OLwcEIh8qDgA+BC0HFyQMKgsRMwo3EQov", "cXEaK");
    }
    
    private static String lIIlllllIlIlIIII(final String llllllllllllIlIllllIlIllllIllIII, final String llllllllllllIlIllllIlIllllIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlIllllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), ChannelOption.lllIIlIIllIllI[8]), "DES");
            final Cipher llllllllllllIlIllllIlIllllIllIlI = Cipher.getInstance("DES");
            llllllllllllIlIllllIlIllllIllIlI.init(ChannelOption.lllIIlIIllIllI[2], llllllllllllIlIllllIlIllllIllIll);
            return new String(llllllllllllIlIllllIlIllllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlIllllIllIIl) {
            llllllllllllIlIllllIlIllllIllIIl.printStackTrace();
            return null;
        }
    }
    
    public void validate(final T llllllllllllIlIllllIlIlllllllIII) {
        if (lIIlllllIlIlllll(llllllllllllIlIllllIlIlllllllIII)) {
            throw new NullPointerException(ChannelOption.lllIIlIIllIlII[ChannelOption.lllIIlIIllIllI[0]]);
        }
    }
    
    @Deprecated
    protected ChannelOption(final String llllllllllllIlIllllIlIllllllllII) {
        super(ChannelOption.names, llllllllllllIlIllllIlIllllllllII, new Object[ChannelOption.lllIIlIIllIllI[0]]);
    }
    
    private static boolean lIIlllllIllIIIII(final int llllllllllllIlIllllIlIllllIIIIll, final int llllllllllllIlIllllIlIllllIIIIlI) {
        return llllllllllllIlIllllIlIllllIIIIll < llllllllllllIlIllllIlIllllIIIIlI;
    }
    
    private static String lIIlllllIlIlIIlI(final String llllllllllllIlIllllIlIllllIIlIIl, final String llllllllllllIlIllllIlIllllIIlIII) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlIllllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIllllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIlIllllIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIlIllllIIllIl.init(ChannelOption.lllIIlIIllIllI[2], llllllllllllIlIllllIlIllllIIlllI);
            return new String(llllllllllllIlIllllIlIllllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlIllllIIllII) {
            llllllllllllIlIllllIlIllllIIllII.printStackTrace();
            return null;
        }
    }
    
    public static <T> ChannelOption<T> valueOf(final String llllllllllllIlIllllIllIIIIIIIIll) {
        return new ChannelOption<T>(llllllllllllIlIllllIllIIIIIIIIll);
    }
    
    private static boolean lIIlllllIlIlllll(final Object llllllllllllIlIllllIlIllllIIIIII) {
        return llllllllllllIlIllllIlIllllIIIIII == null;
    }
    
    private static String lIIlllllIlIlIIIl(String llllllllllllIlIllllIlIlllllIlIII, final String llllllllllllIlIllllIlIlllllIllII) {
        llllllllllllIlIllllIlIlllllIlIII = new String(Base64.getDecoder().decode(llllllllllllIlIllllIlIlllllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIlIlllllIlIll = new StringBuilder();
        final char[] llllllllllllIlIllllIlIlllllIlIlI = llllllllllllIlIllllIlIlllllIllII.toCharArray();
        int llllllllllllIlIllllIlIlllllIlIIl = ChannelOption.lllIIlIIllIllI[0];
        final int llllllllllllIlIllllIlIlllllIIIll = (Object)llllllllllllIlIllllIlIlllllIlIII.toCharArray();
        final int llllllllllllIlIllllIlIlllllIIIlI = llllllllllllIlIllllIlIlllllIIIll.length;
        boolean llllllllllllIlIllllIlIlllllIIIIl = ChannelOption.lllIIlIIllIllI[0] != 0;
        while (lIIlllllIllIIIII(llllllllllllIlIllllIlIlllllIIIIl ? 1 : 0, llllllllllllIlIllllIlIlllllIIIlI)) {
            final char llllllllllllIlIllllIlIlllllIlllI = llllllllllllIlIllllIlIlllllIIIll[llllllllllllIlIllllIlIlllllIIIIl];
            llllllllllllIlIllllIlIlllllIlIll.append((char)(llllllllllllIlIllllIlIlllllIlllI ^ llllllllllllIlIllllIlIlllllIlIlI[llllllllllllIlIllllIlIlllllIlIIl % llllllllllllIlIllllIlIlllllIlIlI.length]));
            "".length();
            ++llllllllllllIlIllllIlIlllllIlIIl;
            ++llllllllllllIlIllllIlIlllllIIIIl;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIlIlllllIlIll);
    }
}
