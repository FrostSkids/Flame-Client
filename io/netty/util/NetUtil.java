// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.List;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.net.SocketException;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.Inet6Address;
import java.net.NetworkInterface;
import io.netty.util.internal.logging.InternalLogger;
import java.net.Inet4Address;
import java.net.InetAddress;

public final class NetUtil
{
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lllIlIIlIlIlIl;
    public static final /* synthetic */ Inet6Address LOCALHOST6;
    private static final /* synthetic */ String[] lllIlIIlIlIIIl;
    
    private static boolean lIlIIIlIIIlllIlI(final int llllllllllllIlIllIllllIlIlllIIlI, final int llllllllllllIlIllIllllIlIlllIIIl) {
        return llllllllllllIlIllIllllIlIlllIIlI >= llllllllllllIlIllIllllIlIlllIIIl;
    }
    
    private static boolean lIlIIIlIIIlllIll(final int llllllllllllIlIllIllllIlIlIllIll) {
        return llllllllllllIlIllIllllIlIlIllIll < 0;
    }
    
    private static boolean lIlIIIlIIIlllIIl(final int llllllllllllIlIllIllllIlIlIllIIl) {
        return llllllllllllIlIllIllllIlIlIllIIl > 0;
    }
    
    private NetUtil() {
    }
    
    private static String lIlIIIlIIIlIlIlI(final String llllllllllllIlIllIllllIllIlIIIIl, final String llllllllllllIlIllIllllIllIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIllllIllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllllIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllllIllIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllllIllIlIIlIl.init(NetUtil.lllIlIIlIlIlIl[4], llllllllllllIlIllIllllIllIlIIllI);
            return new String(llllllllllllIlIllIllllIllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllllIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllllIllIlIIlII) {
            llllllllllllIlIllIllllIllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    public static byte[] createByteArrayFromIpAddressString(String llllllllllllIlIllIlllllIIlIIlIIl) {
        if (lIlIIIlIIIllIIll(isValidIpV4Address(llllllllllllIlIllIlllllIIlIIlIIl) ? 1 : 0)) {
            final StringTokenizer llllllllllllIlIllIlllllIIlIllIII = new StringTokenizer(llllllllllllIlIllIlllllIIlIIlIIl, NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[0]]);
            final byte[] llllllllllllIlIllIlllllIIlIlIlll = new byte[NetUtil.lllIlIIlIlIlIl[1]];
            int llllllllllllIlIllIlllllIIlIllIIl = NetUtil.lllIlIIlIlIlIl[0];
            while (lIlIIIlIIIllIlII(llllllllllllIlIllIlllllIIlIllIIl, NetUtil.lllIlIIlIlIlIl[1])) {
                final String llllllllllllIlIllIlllllIIlIllIll = llllllllllllIlIllIlllllIIlIllIII.nextToken();
                final int llllllllllllIlIllIlllllIIlIllIlI = Integer.parseInt(llllllllllllIlIllIlllllIIlIllIll);
                llllllllllllIlIllIlllllIIlIlIlll[llllllllllllIlIllIlllllIIlIllIIl] = (byte)llllllllllllIlIllIlllllIIlIllIlI;
                ++llllllllllllIlIllIlllllIIlIllIIl;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return llllllllllllIlIllIlllllIIlIlIlll;
        }
        if (lIlIIIlIIIllIIll(isValidIpV6Address(llllllllllllIlIllIlllllIIlIIlIIl) ? 1 : 0)) {
            if (lIlIIIlIIIllIlIl(llllllllllllIlIllIlllllIIlIIlIIl.charAt(NetUtil.lllIlIIlIlIlIl[0]), NetUtil.lllIlIIlIlIlIl[2])) {
                llllllllllllIlIllIlllllIIlIIlIIl = llllllllllllIlIllIlllllIIlIIlIIl.substring(NetUtil.lllIlIIlIlIlIl[3], llllllllllllIlIllIlllllIIlIIlIIl.length() - NetUtil.lllIlIIlIlIlIl[3]);
            }
            final StringTokenizer llllllllllllIlIllIlllllIIlIlIIlI = new StringTokenizer(llllllllllllIlIllIlllllIIlIIlIIl, NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[3]], (boolean)(NetUtil.lllIlIIlIlIlIl[3] != 0));
            final ArrayList<String> llllllllllllIlIllIlllllIIlIlIIIl = new ArrayList<String>();
            final ArrayList<String> llllllllllllIlIllIlllllIIlIlIIII = new ArrayList<String>();
            String llllllllllllIlIllIlllllIIlIIllll = NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[4]];
            String llllllllllllIlIllIlllllIIlIIlllI = NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[5]];
            int llllllllllllIlIllIlllllIIlIIllIl = NetUtil.lllIlIIlIlIlIl[6];
            while (lIlIIIlIIIllIIll(llllllllllllIlIllIlllllIIlIlIIlI.hasMoreTokens() ? 1 : 0)) {
                llllllllllllIlIllIlllllIIlIIlllI = llllllllllllIlIllIlllllIIlIIllll;
                llllllllllllIlIllIlllllIIlIIllll = llllllllllllIlIllIlllllIIlIlIIlI.nextToken();
                if (lIlIIIlIIIllIIll(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[1]].equals(llllllllllllIlIllIlllllIIlIIllll) ? 1 : 0)) {
                    if (lIlIIIlIIIllIIll(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[7]].equals(llllllllllllIlIllIlllllIIlIIlllI) ? 1 : 0)) {
                        llllllllllllIlIllIlllllIIlIIllIl = llllllllllllIlIllIlllllIIlIlIIIl.size();
                        "".length();
                        if (-" ".length() >= " ".length()) {
                            return null;
                        }
                        continue;
                    }
                    else {
                        if (!lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIlIIlllI.isEmpty() ? 1 : 0)) {
                            continue;
                        }
                        llllllllllllIlIllIlllllIIlIlIIIl.add(llllllllllllIlIllIlllllIIlIIlllI);
                        "".length();
                        "".length();
                        if (((0x1D ^ 0x18) & ~(0xAF ^ 0xAA) & ~((0x4 ^ 0x21) & ~(0x4D ^ 0x68))) != 0x0) {
                            return null;
                        }
                        continue;
                    }
                }
                else {
                    if (!lIlIIIlIIIllIIll(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[8]].equals(llllllllllllIlIllIlllllIIlIIllll) ? 1 : 0)) {
                        continue;
                    }
                    llllllllllllIlIllIlllllIIlIlIIII.add(llllllllllllIlIllIlllllIIlIIlllI);
                    "".length();
                    "".length();
                    if (-(55 + 27 + 77 + 14 ^ 122 + 128 - 185 + 104) >= 0) {
                        return null;
                    }
                    continue;
                }
            }
            if (lIlIIIlIIIllIIll(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[9]].equals(llllllllllllIlIllIlllllIIlIIlllI) ? 1 : 0)) {
                if (lIlIIIlIIIllIIll(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[10]].equals(llllllllllllIlIllIlllllIIlIIllll) ? 1 : 0)) {
                    llllllllllllIlIllIlllllIIlIIllIl = llllllllllllIlIllIlllllIIlIlIIIl.size();
                    "".length();
                    if (-"   ".length() > 0) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlIllIlllllIIlIlIIIl.add(llllllllllllIlIllIlllllIIlIIllll);
                    "".length();
                    "".length();
                    if ("   ".length() == -" ".length()) {
                        return null;
                    }
                }
            }
            else if (lIlIIIlIIIllIIll(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[11]].equals(llllllllllllIlIllIlllllIIlIIlllI) ? 1 : 0)) {
                llllllllllllIlIllIlllllIIlIlIIII.add(llllllllllllIlIllIlllllIIlIIllll);
                "".length();
            }
            int llllllllllllIlIllIlllllIIlIIllII = NetUtil.lllIlIIlIlIlIl[10];
            if (lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIlIlIIII.isEmpty() ? 1 : 0)) {
                llllllllllllIlIllIlllllIIlIIllII -= 2;
            }
            if (lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIlIIllIl, NetUtil.lllIlIIlIlIlIl[6])) {
                final int llllllllllllIlIllIlllllIIlIlIlIl = llllllllllllIlIllIlllllIIlIIllII - llllllllllllIlIllIlllllIIlIlIIIl.size();
                int llllllllllllIlIllIlllllIIlIlIllI = NetUtil.lllIlIIlIlIlIl[0];
                while (lIlIIIlIIIllIlII(llllllllllllIlIllIlllllIIlIlIllI, llllllllllllIlIllIlllllIIlIlIlIl)) {
                    llllllllllllIlIllIlllllIIlIlIIIl.add(llllllllllllIlIllIlllllIIlIIllIl, NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[12]]);
                    ++llllllllllllIlIllIlllllIIlIlIllI;
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return null;
                    }
                }
            }
            final byte[] llllllllllllIlIllIlllllIIlIIlIll = new byte[NetUtil.lllIlIIlIlIlIl[13]];
            int llllllllllllIlIllIlllllIIlIlIlII = NetUtil.lllIlIIlIlIlIl[0];
            while (lIlIIIlIIIllIlII(llllllllllllIlIllIlllllIIlIlIlII, llllllllllllIlIllIlllllIIlIlIIIl.size())) {
                convertToBytes(llllllllllllIlIllIlllllIIlIlIIIl.get(llllllllllllIlIllIlllllIIlIlIlII), llllllllllllIlIllIlllllIIlIIlIll, llllllllllllIlIllIlllllIIlIlIlII * NetUtil.lllIlIIlIlIlIl[4]);
                ++llllllllllllIlIllIlllllIIlIlIlII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            int llllllllllllIlIllIlllllIIlIlIIll = NetUtil.lllIlIIlIlIlIl[0];
            while (lIlIIIlIIIllIlII(llllllllllllIlIllIlllllIIlIlIIll, llllllllllllIlIllIlllllIIlIlIIII.size())) {
                llllllllllllIlIllIlllllIIlIIlIll[llllllllllllIlIllIlllllIIlIlIIll + NetUtil.lllIlIIlIlIlIl[14]] = (byte)(Integer.parseInt(llllllllllllIlIllIlllllIIlIlIIII.get(llllllllllllIlIllIlllllIIlIlIIll)) & NetUtil.lllIlIIlIlIlIl[15]);
                ++llllllllllllIlIllIlllllIIlIlIIll;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            return llllllllllllIlIllIlllllIIlIIlIll;
        }
        return null;
    }
    
    private static boolean lIlIIIlIIIllllII(final Object llllllllllllIlIllIllllIlIllIIIll) {
        return llllllllllllIlIllIllllIlIllIIIll != null;
    }
    
    private static void lIlIIIlIIIllIIlI() {
        (lllIlIIlIlIlIl = new int[39])[0] = ("  ".length() & ~"  ".length());
        NetUtil.lllIlIIlIlIlIl[1] = (45 + 31 - 34 + 104 ^ 45 + 143 - 139 + 101);
        NetUtil.lllIlIIlIlIlIl[2] = (0x1D ^ 0x60 ^ (0x9A ^ 0xBC));
        NetUtil.lllIlIIlIlIlIl[3] = " ".length();
        NetUtil.lllIlIIlIlIlIl[4] = "  ".length();
        NetUtil.lllIlIIlIlIlIl[5] = "   ".length();
        NetUtil.lllIlIIlIlIlIl[6] = -" ".length();
        NetUtil.lllIlIIlIlIlIl[7] = (0xBA ^ 0xBF);
        NetUtil.lllIlIIlIlIlIl[8] = (0x98 ^ 0x9E);
        NetUtil.lllIlIIlIlIlIl[9] = (0x8E ^ 0x89);
        NetUtil.lllIlIIlIlIlIl[10] = (0x9 ^ 0x1);
        NetUtil.lllIlIIlIlIlIl[11] = (143 + 140 - 263 + 135 ^ 10 + 65 - 7 + 78);
        NetUtil.lllIlIIlIlIlIl[12] = (0x72 ^ 0x78);
        NetUtil.lllIlIIlIlIlIl[13] = (41 + 68 - 77 + 120 ^ 15 + 108 - 121 + 134);
        NetUtil.lllIlIIlIlIlIl[14] = (0x2 ^ 0xE);
        NetUtil.lllIlIIlIlIlIl[15] = 139 + 159 - 237 + 169 + (132 + 123 - 72 + 30) - (0xFFFF89DF & 0x773D) + (0xED ^ 0x8C);
        NetUtil.lllIlIIlIlIlIl[16] = (0x2C ^ 0x52 ^ (0x7E ^ 0xF));
        NetUtil.lllIlIIlIlIlIl[17] = (0x44 ^ 0x4F);
        NetUtil.lllIlIIlIlIlIl[18] = (0x31 ^ 0x3C);
        NetUtil.lllIlIIlIlIlIl[19] = (0x99 ^ 0x97);
        NetUtil.lllIlIIlIlIlIl[20] = (58 + 75 + 24 + 52 ^ 94 + 122 - 104 + 28);
        NetUtil.lllIlIIlIlIlIl[21] = (0x0 ^ 0x3A);
        NetUtil.lllIlIIlIlIlIl[22] = (0x7B ^ 0x4B);
        NetUtil.lllIlIIlIlIlIl[23] = (0xB ^ 0x32);
        NetUtil.lllIlIIlIlIlIl[24] = (0x78 ^ 0x39);
        NetUtil.lllIlIIlIlIlIl[25] = (0x3E ^ 0x53 ^ (0x23 ^ 0x8));
        NetUtil.lllIlIIlIlIlIl[26] = (0x6A ^ 0xB);
        NetUtil.lllIlIIlIlIlIl[27] = (0x14 ^ 0x72);
        NetUtil.lllIlIIlIlIlIl[28] = (0xD5 ^ 0x90 ^ (0x1E ^ 0x75));
        NetUtil.lllIlIIlIlIlIl[29] = 20 + 45 + 39 + 23;
        NetUtil.lllIlIIlIlIlIl[30] = (0x38 ^ 0x29);
        NetUtil.lllIlIIlIlIlIl[31] = (0xFD ^ 0xBE ^ (0x7A ^ 0x2B));
        NetUtil.lllIlIIlIlIlIl[32] = 63 + 41 - 28 + 124;
        NetUtil.lllIlIIlIlIlIl[33] = 58 + 94 - 94 + 70;
        NetUtil.lllIlIIlIlIlIl[34] = (0x1 ^ 0x59 ^ (0xF4 ^ 0xBF));
        NetUtil.lllIlIIlIlIlIl[35] = (0xB5 ^ 0xA1);
        NetUtil.lllIlIIlIlIlIl[36] = (0x21 ^ 0x34);
        NetUtil.lllIlIIlIlIlIl[37] = (0x3D ^ 0x2B);
        NetUtil.lllIlIIlIlIlIl[38] = (0x38 ^ 0x2F);
    }
    
    private static boolean lIlIIIlIIIllIlIl(final int llllllllllllIlIllIllllIlIlllIllI, final int llllllllllllIlIllIllllIlIlllIlIl) {
        return llllllllllllIlIllIllllIlIlllIllI == llllllllllllIlIllIllllIlIlllIlIl;
    }
    
    public static boolean isValidIpV4Address(final String llllllllllllIlIllIllllIlllllIIII) {
        int llllllllllllIlIllIllllIllllIllll = NetUtil.lllIlIIlIlIlIl[0];
        final int llllllllllllIlIllIllllIllllIllIl = llllllllllllIlIllIllllIlllllIIII.length();
        if (lIlIIIlIIIlllIII(llllllllllllIlIllIllllIllllIllIl, NetUtil.lllIlIIlIlIlIl[16])) {
            return NetUtil.lllIlIIlIlIlIl[0] != 0;
        }
        final StringBuilder llllllllllllIlIllIllllIllllIllII = new StringBuilder();
        int llllllllllllIlIllIllllIllllIlllI = NetUtil.lllIlIIlIlIlIl[0];
        while (lIlIIIlIIIllIlII(llllllllllllIlIllIllllIllllIlllI, llllllllllllIlIllIllllIllllIllIl)) {
            final char llllllllllllIlIllIllllIlllllIIIl = llllllllllllIlIllIllllIlllllIIII.charAt(llllllllllllIlIllIllllIllllIlllI);
            if (lIlIIIlIIIllIlIl(llllllllllllIlIllIllllIlllllIIIl, NetUtil.lllIlIIlIlIlIl[28])) {
                if (lIlIIIlIIIlllIII(++llllllllllllIlIllIllllIllllIllll, NetUtil.lllIlIIlIlIlIl[5])) {
                    return NetUtil.lllIlIIlIlIlIl[0] != 0;
                }
                if (lIlIIIlIIIllIllI(llllllllllllIlIllIllllIllllIllII.length())) {
                    return NetUtil.lllIlIIlIlIlIl[0] != 0;
                }
                if (lIlIIIlIIIlllIII(Integer.parseInt(String.valueOf(llllllllllllIlIllIllllIllllIllII)), NetUtil.lllIlIIlIlIlIl[15])) {
                    return NetUtil.lllIlIIlIlIlIl[0] != 0;
                }
                llllllllllllIlIllIllllIllllIllII.delete(NetUtil.lllIlIIlIlIlIl[0], llllllllllllIlIllIllllIllllIllII.length());
                "".length();
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0xC6 ^ 0x90) & ~(0x3D ^ 0x6B)) != 0x0;
                }
            }
            else {
                if (lIlIIIlIIIllIllI(Character.isDigit(llllllllllllIlIllIllllIlllllIIIl) ? 1 : 0)) {
                    return NetUtil.lllIlIIlIlIlIl[0] != 0;
                }
                if (lIlIIIlIIIlllIII(llllllllllllIlIllIllllIllllIllII.length(), NetUtil.lllIlIIlIlIlIl[4])) {
                    return NetUtil.lllIlIIlIlIlIl[0] != 0;
                }
                llllllllllllIlIllIllllIllllIllII.append(llllllllllllIlIllIllllIlllllIIIl);
                "".length();
            }
            ++llllllllllllIlIllIllllIllllIlllI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x36 ^ 0x18) & ~(0xC ^ 0x22)) != 0x0;
            }
        }
        if (!lIlIIIlIIIllIIll(llllllllllllIlIllIllllIllllIllII.length()) || lIlIIIlIIIlllIII(Integer.parseInt(String.valueOf(llllllllllllIlIllIllllIllllIllII)), NetUtil.lllIlIIlIlIlIl[15])) {
            return NetUtil.lllIlIIlIlIlIl[0] != 0;
        }
        int n;
        if (lIlIIIlIIIllIlIl(llllllllllllIlIllIllllIllllIllll, NetUtil.lllIlIIlIlIlIl[5])) {
            n = NetUtil.lllIlIIlIlIlIl[3];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x19 ^ 0x11) & ~(0x55 ^ 0x5D)) != 0x0;
            }
        }
        else {
            n = NetUtil.lllIlIIlIlIlIl[0];
        }
        return n != 0;
    }
    
    private static boolean lIlIIIlIIIllIlII(final int llllllllllllIlIllIllllIlIllIlllI, final int llllllllllllIlIllIllllIlIllIllIl) {
        return llllllllllllIlIllIllllIlIllIlllI < llllllllllllIlIllIllllIlIllIllIl;
    }
    
    public static boolean isValidIp4Word(final String llllllllllllIlIllIllllIlllllllIl) {
        if (!lIlIIIlIIIlllIlI(llllllllllllIlIllIllllIlllllllIl.length(), NetUtil.lllIlIIlIlIlIl[3]) || lIlIIIlIIIlllIII(llllllllllllIlIllIllllIlllllllIl.length(), NetUtil.lllIlIIlIlIlIl[5])) {
            return NetUtil.lllIlIIlIlIlIl[0] != 0;
        }
        int llllllllllllIlIllIllllIlllllllll = NetUtil.lllIlIIlIlIlIl[0];
        while (lIlIIIlIIIllIlII(llllllllllllIlIllIllllIlllllllll, llllllllllllIlIllIllllIlllllllIl.length())) {
            final char llllllllllllIlIllIlllllIIIIIIIII = llllllllllllIlIllIllllIlllllllIl.charAt(llllllllllllIlIllIllllIlllllllll);
            if (!lIlIIIlIIIlllIlI(llllllllllllIlIllIlllllIIIIIIIII, NetUtil.lllIlIIlIlIlIl[22]) || lIlIIIlIIIlllIII(llllllllllllIlIllIlllllIIIIIIIII, NetUtil.lllIlIIlIlIlIl[23])) {
                return NetUtil.lllIlIIlIlIlIl[0] != 0;
            }
            ++llllllllllllIlIllIllllIlllllllll;
            "".length();
            if ("   ".length() == 0) {
                return ((0x81 ^ 0xA0 ^ (0x4D ^ 0x25)) & (0x6 ^ 0xB ^ (0xEE ^ 0xAA) ^ -" ".length())) != 0x0;
            }
        }
        int n;
        if (lIlIIIlIIIllllIl(Integer.parseInt(llllllllllllIlIllIllllIlllllllIl), NetUtil.lllIlIIlIlIlIl[15])) {
            n = NetUtil.lllIlIIlIlIlIl[3];
            "".length();
            if (" ".length() == -" ".length()) {
                return ((0x3C ^ 0x30) & ~(0x16 ^ 0x1A)) != 0x0;
            }
        }
        else {
            n = NetUtil.lllIlIIlIlIlIl[0];
        }
        return n != 0;
    }
    
    private static String lIlIIIlIIIlIllII(String llllllllllllIlIllIllllIllIIIIIIl, final String llllllllllllIlIllIllllIllIIIIIII) {
        llllllllllllIlIllIllllIllIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlIllIllllIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIllllIllIIIIlII = new StringBuilder();
        final char[] llllllllllllIlIllIllllIllIIIIIll = llllllllllllIlIllIllllIllIIIIIII.toCharArray();
        int llllllllllllIlIllIllllIllIIIIIlI = NetUtil.lllIlIIlIlIlIl[0];
        final byte llllllllllllIlIllIllllIlIlllllII = (Object)llllllllllllIlIllIllllIllIIIIIIl.toCharArray();
        final Exception llllllllllllIlIllIllllIlIllllIll = (Exception)llllllllllllIlIllIllllIlIlllllII.length;
        int llllllllllllIlIllIllllIlIllllIlI = NetUtil.lllIlIIlIlIlIl[0];
        while (lIlIIIlIIIllIlII(llllllllllllIlIllIllllIlIllllIlI, (int)llllllllllllIlIllIllllIlIllllIll)) {
            final char llllllllllllIlIllIllllIllIIIIlll = llllllllllllIlIllIllllIlIlllllII[llllllllllllIlIllIllllIlIllllIlI];
            llllllllllllIlIllIllllIllIIIIlII.append((char)(llllllllllllIlIllIllllIllIIIIlll ^ llllllllllllIlIllIllllIllIIIIIll[llllllllllllIlIllIllllIllIIIIIlI % llllllllllllIlIllIllllIllIIIIIll.length]));
            "".length();
            ++llllllllllllIlIllIllllIllIIIIIlI;
            ++llllllllllllIlIllIllllIlIllllIlI;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIllllIllIIIIlII);
    }
    
    static {
        lIlIIIlIIIllIIlI();
        lIlIIIlIIIllIIIl();
        logger = InternalLoggerFactory.getInstance(NetUtil.class);
        final byte[] array = new byte[NetUtil.lllIlIIlIlIlIl[1]];
        array[NetUtil.lllIlIIlIlIlIl[0]] = (byte)NetUtil.lllIlIIlIlIlIl[29];
        array[NetUtil.lllIlIIlIlIlIl[3]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array[NetUtil.lllIlIIlIlIlIl[4]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array[NetUtil.lllIlIIlIlIlIl[5]] = (byte)NetUtil.lllIlIIlIlIlIl[3];
        final byte[] llllllllllllIlIllIllllIlllIIIIIl = array;
        final byte[] array2 = new byte[NetUtil.lllIlIIlIlIlIl[13]];
        array2[NetUtil.lllIlIIlIlIlIl[0]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[3]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[4]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[5]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[1]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[7]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[8]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[9]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[10]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[11]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[12]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[17]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[14]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[18]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[19]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        array2[NetUtil.lllIlIIlIlIlIl[16]] = (byte)NetUtil.lllIlIIlIlIlIl[3];
        final byte[] llllllllllllIlIllIllllIlllIIIIII = array2;
        Inet4Address llllllllllllIlIllIllllIllIllllll = null;
        try {
            llllllllllllIlIllIllllIllIllllll = (Inet4Address)InetAddress.getByAddress(llllllllllllIlIllIllllIlllIIIIIl);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        catch (Exception llllllllllllIlIllIllllIlllIlIlII) {
            PlatformDependent.throwException(llllllllllllIlIllIllllIlllIlIlII);
        }
        LOCALHOST4 = llllllllllllIlIllIllllIllIllllll;
        Inet6Address llllllllllllIlIllIllllIllIlllllI = null;
        try {
            llllllllllllIlIllIllllIllIlllllI = (Inet6Address)InetAddress.getByAddress(llllllllllllIlIllIllllIlllIIIIII);
            "".length();
            if (((0x91 ^ 0x81) & ~(0x8B ^ 0x9B)) >= " ".length()) {
                return;
            }
        }
        catch (Exception llllllllllllIlIllIllllIlllIlIIll) {
            PlatformDependent.throwException(llllllllllllIlIllIllllIlllIlIIll);
        }
        LOCALHOST6 = llllllllllllIlIllIllllIllIlllllI;
        final List<NetworkInterface> llllllllllllIlIllIllllIllIllllIl = new ArrayList<NetworkInterface>();
        try {
            final Enumeration<NetworkInterface> llllllllllllIlIllIllllIlllIlIIIl = NetworkInterface.getNetworkInterfaces();
            while (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIlIIIl.hasMoreElements() ? 1 : 0)) {
                final NetworkInterface llllllllllllIlIllIllllIlllIlIIlI = llllllllllllIlIllIllllIlllIlIIIl.nextElement();
                if (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIlIIlI.getInetAddresses().hasMoreElements() ? 1 : 0)) {
                    llllllllllllIlIllIllllIllIllllIl.add(llllllllllllIlIllIllllIlllIlIIlI);
                    "".length();
                }
                "".length();
                if (((0x18 ^ 0x31 ^ (0x39 ^ 0xE)) & (" ".length() ^ (0x10 ^ 0xF) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        catch (SocketException llllllllllllIlIllIllllIlllIlIIII) {
            NetUtil.logger.warn(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[17]], llllllllllllIlIllIllllIlllIlIIII);
        }
        NetworkInterface llllllllllllIlIllIllllIllIllllII = null;
        InetAddress llllllllllllIlIllIllllIllIlllIll = null;
        final Iterator llllllllllllIlIllIllllIlllIIllII = llllllllllllIlIllIllllIllIllllIl.iterator();
    Label_0688:
        while (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIIllII.hasNext() ? 1 : 0)) {
            final NetworkInterface llllllllllllIlIllIllllIlllIIllIl = llllllllllllIlIllIllllIlllIIllII.next();
            final Enumeration<InetAddress> llllllllllllIlIllIllllIlllIIlllI = llllllllllllIlIllIllllIlllIIllIl.getInetAddresses();
            while (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIIlllI.hasMoreElements() ? 1 : 0)) {
                final InetAddress llllllllllllIlIllIllllIlllIIllll = llllllllllllIlIllIllllIlllIIlllI.nextElement();
                if (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIIllll.isLoopbackAddress() ? 1 : 0)) {
                    llllllllllllIlIllIllllIllIllllII = llllllllllllIlIllIllllIlllIIllIl;
                    llllllllllllIlIllIllllIllIlllIll = llllllllllllIlIllIllllIlllIIllll;
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                    break Label_0688;
                }
                else {
                    "".length();
                    if ("  ".length() >= (147 + 105 - 197 + 97 ^ 76 + 154 - 207 + 133)) {
                        return;
                    }
                    continue;
                }
            }
            "".length();
            if ("   ".length() > (0x1B ^ 0x1F)) {
                return;
            }
        }
        if (lIlIIIlIIIlllllI(llllllllllllIlIllIllllIllIllllII)) {
            try {
                final Iterator llllllllllllIlIllIllllIlllIIlIIl = llllllllllllIlIllIllllIllIllllIl.iterator();
                while (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIIlIIl.hasNext() ? 1 : 0)) {
                    final NetworkInterface llllllllllllIlIllIllllIlllIIlIlI = llllllllllllIlIllIllllIlllIIlIIl.next();
                    if (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIIlIlI.isLoopback() ? 1 : 0)) {
                        final Enumeration<InetAddress> llllllllllllIlIllIllllIlllIIlIll = llllllllllllIlIllIllllIlllIIlIlI.getInetAddresses();
                        if (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIlllIIlIll.hasMoreElements() ? 1 : 0)) {
                            llllllllllllIlIllIllllIllIllllII = llllllllllllIlIllIllllIlllIIlIlI;
                            llllllllllllIlIllIllllIllIlllIll = llllllllllllIlIllIllllIlllIIlIll.nextElement();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                    }
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                if (lIlIIIlIIIlllllI(llllllllllllIlIllIllllIllIllllII)) {
                    NetUtil.logger.warn(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[14]]);
                }
                "".length();
                if (" ".length() >= (0x45 ^ 0x41)) {
                    return;
                }
            }
            catch (SocketException llllllllllllIlIllIllllIlllIIlIII) {
                NetUtil.logger.warn(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[18]], llllllllllllIlIllIllllIlllIIlIII);
            }
        }
        if (lIlIIIlIIIllllII(llllllllllllIlIllIllllIllIllllII)) {
            final InternalLogger logger2 = NetUtil.logger;
            final String s = NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[19]];
            final Object[] array3 = new Object[NetUtil.lllIlIIlIlIlIl[5]];
            array3[NetUtil.lllIlIIlIlIlIl[0]] = llllllllllllIlIllIllllIllIllllII.getName();
            array3[NetUtil.lllIlIIlIlIlIl[3]] = llllllllllllIlIllIllllIllIllllII.getDisplayName();
            array3[NetUtil.lllIlIIlIlIlIl[4]] = llllllllllllIlIllIllllIllIlllIll.getHostAddress();
            logger2.debug(s, array3);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else if (lIlIIIlIIIlllllI(llllllllllllIlIllIllllIllIlllIll)) {
            try {
                if (lIlIIIlIIIllllII(NetworkInterface.getByInetAddress(NetUtil.LOCALHOST6))) {
                    NetUtil.logger.debug(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[16]], llllllllllllIlIllIllllIllIlllllI);
                    llllllllllllIlIllIllllIllIlllIll = llllllllllllIlIllIllllIllIlllllI;
                }
                if (lIlIIIlIIIlllllI(llllllllllllIlIllIllllIllIlllIll)) {
                    NetUtil.logger.debug(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[13]], llllllllllllIlIllIllllIllIllllll);
                    llllllllllllIlIllIllllIllIlllIll = llllllllllllIlIllIllllIllIllllll;
                    "".length();
                    if ((0x46 ^ 0x76 ^ (0x7E ^ 0x4A)) <= 0) {
                        return;
                    }
                }
            }
            catch (Exception llllllllllllIlIllIllllIlllIIIlll) {
                if (lIlIIIlIIIlllllI(llllllllllllIlIllIllllIllIlllIll)) {
                    NetUtil.logger.debug(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[30]], llllllllllllIlIllIllllIllIllllll);
                    llllllllllllIlIllIllllIllIlllIll = llllllllllllIlIllIllllIllIllllll;
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
            }
            finally {
                if (lIlIIIlIIIlllllI(llllllllllllIlIllIllllIllIlllIll)) {
                    NetUtil.logger.debug(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[31]], llllllllllllIlIllIllllIllIllllll);
                    llllllllllllIlIllIllllIllIlllIll = llllllllllllIlIllIllllIllIllllll;
                }
            }
        }
        LOOPBACK_IF = llllllllllllIlIllIllllIllIllllII;
        LOCALHOST = llllllllllllIlIllIllllIllIlllIll;
        int n;
        if (lIlIIIlIIIllIIll(PlatformDependent.isWindows() ? 1 : 0)) {
            n = NetUtil.lllIlIIlIlIlIl[32];
            "".length();
            if ((0x62 ^ 0x66) < "   ".length()) {
                return;
            }
        }
        else {
            n = NetUtil.lllIlIIlIlIlIl[33];
        }
        int llllllllllllIlIllIllllIllIlllIlI = n;
        final File llllllllllllIlIllIllllIllIlllIIl = new File(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[34]]);
        if (lIlIIIlIIIllIIll(llllllllllllIlIllIllllIllIlllIIl.exists() ? 1 : 0)) {
            BufferedReader llllllllllllIlIllIllllIlllIIIIlI = null;
            try {
                llllllllllllIlIllIllllIlllIIIIlI = new BufferedReader(new FileReader(llllllllllllIlIllIllllIllIlllIIl));
                llllllllllllIlIllIllllIllIlllIlI = Integer.parseInt(llllllllllllIlIllIllllIlllIIIIlI.readLine());
                if (lIlIIIlIIIllIIll(NetUtil.logger.isDebugEnabled() ? 1 : 0)) {
                    NetUtil.logger.debug(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[35]], llllllllllllIlIllIllllIllIlllIIl, llllllllllllIlIllIllllIllIlllIlI);
                }
                if (lIlIIIlIIIllllII(llllllllllllIlIllIllllIlllIIIIlI)) {
                    try {
                        llllllllllllIlIllIllllIlllIIIIlI.close();
                        "".length();
                        if ("   ".length() < ((0x2E ^ 0x4D ^ (0x5E ^ 0x17)) & (0x2B ^ 0x6A ^ (0x4D ^ 0x26) ^ -" ".length()))) {
                            return;
                        }
                    }
                    catch (Exception llllllllllllIlIllIllllIlllIIIllI) {
                        "".length();
                        if (((0xB4 ^ 0xA0) & ~(0x21 ^ 0x35)) != 0x0) {
                            return;
                        }
                    }
                }
            }
            catch (Exception llllllllllllIlIllIllllIlllIIIlIl) {
                NetUtil.logger.debug(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[36]], llllllllllllIlIllIllllIllIlllIIl, llllllllllllIlIllIllllIlllIIIlIl);
                if (lIlIIIlIIIllllII(llllllllllllIlIllIllllIlllIIIIlI)) {
                    try {
                        llllllllllllIlIllIllllIlllIIIIlI.close();
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    catch (Exception llllllllllllIlIllIllllIlllIIIlII) {
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    }
                }
            }
            finally {
                if (lIlIIIlIIIllllII(llllllllllllIlIllIllllIlllIIIIlI)) {
                    try {
                        llllllllllllIlIllIllllIlllIIIIlI.close();
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    catch (Exception ex) {}
                }
            }
            "".length();
            if (((8 + 26 + 149 + 15 ^ 57 + 122 - 105 + 55) & (0x75 ^ 0x71 ^ (0x4B ^ 0x8) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIlIIIlIIIllIIll(NetUtil.logger.isDebugEnabled() ? 1 : 0)) {
            NetUtil.logger.debug(NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[37]], llllllllllllIlIllIllllIllIlllIIl, llllllllllllIlIllIllllIllIlllIlI);
        }
        SOMAXCONN = llllllllllllIlIllIllllIllIlllIlI;
    }
    
    private static boolean lIlIIIlIIIlllllI(final Object llllllllllllIlIllIllllIlIllIIIIl) {
        return llllllllllllIlIllIllllIlIllIIIIl == null;
    }
    
    private static void lIlIIIlIIIllIIIl() {
        (lllIlIIlIlIIIl = new String[NetUtil.lllIlIIlIlIlIl[38]])[NetUtil.lllIlIIlIlIlIl[0]] = lIlIIIlIIIlIlIlI("AS3+xbzsqrQ=", "xepBh");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[3]] = lIlIIIlIIIlIlIlI("FjGUmJHPLRk=", "LuYyU");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[4]] = lIlIIIlIIIlIlIll("jeeSUITmzY0=", "NEjco");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[5]] = lIlIIIlIIIlIlIll("W5m55wiNjE8=", "lcmJf");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[1]] = lIlIIIlIIIlIllII("fA==", "FxfNU");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[7]] = lIlIIIlIIIlIlIll("OC9fK22a9TI=", "qQeFk");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[8]] = lIlIIIlIIIlIllII("VA==", "zrTgS");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[9]] = lIlIIIlIIIlIllII("Ww==", "aBzEh");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[10]] = lIlIIIlIIIlIllII("Yg==", "Xouou");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[11]] = lIlIIIlIIIlIlIlI("8Xnglhhht3E=", "ePhqA");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[12]] = lIlIIIlIIIlIlIlI("SsO2W3xft7E=", "Ffoee");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[17]] = lIlIIIlIIIlIlIll("A2C6IitRb5selflKQ2hWRb8dH3GD72SF6sEv0DmhCefCOSKsy3tSOjRci49aA2NdVuELaFELn6Ov32ptnYOOBA==", "XUiAO");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[14]] = lIlIIIlIIIlIllII("ES0QGAozbA0bTzElFxBPIyQcVAM4IwkWDjQnWR0BIykLEg40KQ==", "WLyto");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[18]] = lIlIIIlIIIlIlIlI("rdwYsiqKQRYzU/8mYFXjULJf0kd5rP/j8M5NOde+RkQTkfgQoI3zcw==", "UOBsg");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[19]] = lIlIIIlIIIlIlIll("cBEKtxBwwe2MFc31ZMoYC59vDLYVJ3lbqwFsGKZNa9E=", "GAQAq");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[16]] = lIlIIIlIIIlIlIll("fYHZ3lwnUbdh5FUvnUgg/Ksh6v5W3fEWaVHDgxlTwZDVRdxljBpnDnsMUja9Aw/N", "TodMM");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[13]] = lIlIIIlIIIlIlIlI("rwHkMAmGaWBORMI/RN5C/sn8jB1jzEG1fME9zXT+EQEjTfL7M0TcDGbWoWJpGWvQ", "biOWY");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[30]] = lIlIIIlIIIlIlIll("Jm5P8CwlX128Podh6yubupHsUc0hT2Dc0pzbcCwN4D+Ats5kuaXaEZGY96JqhAZB", "xWhyC");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[31]] = lIlIIIlIIIlIllII("HCYiGghpPSoGC2Q2JBAKLXUCJBl9dScbDCg5IxscPXUqEAs7MDgHVWkuNg==", "IUKto");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[34]] = lIlIIIlIIIlIllII("ZzQaBxtnNxEbVyYhHEcbJzYNRwsnKQkQGycqBg==", "HDhhx");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[35]] = lIlIIIlIIIlIlIlI("SSMiX2R8iME=", "OQdIL");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[36]] = lIlIIIlIIIlIlIlI("1otZ5Q7DNTuF4neGtdKU6VL+dPpf5yz6UM8XcKDLe2Av+J6roORQ5g==", "kMCEw");
        NetUtil.lllIlIIlIlIIIl[NetUtil.lllIlIIlIlIlIl[37]] = lIlIIIlIIIlIlIll("OfYTQjNHaXgkK1o8zHIINSmBLd30CfpI", "wYFVf");
    }
    
    static int getIntValue(char llllllllllllIlIllIlllllIIIlIlIII) {
        switch (llllllllllllIlIllIlllllIIIlIlIII) {
            case '0': {
                return NetUtil.lllIlIIlIlIlIl[0];
            }
            case '1': {
                return NetUtil.lllIlIIlIlIlIl[3];
            }
            case '2': {
                return NetUtil.lllIlIIlIlIlIl[4];
            }
            case '3': {
                return NetUtil.lllIlIIlIlIlIl[5];
            }
            case '4': {
                return NetUtil.lllIlIIlIlIlIl[1];
            }
            case '5': {
                return NetUtil.lllIlIIlIlIlIl[7];
            }
            case '6': {
                return NetUtil.lllIlIIlIlIlIl[8];
            }
            case '7': {
                return NetUtil.lllIlIIlIlIlIl[9];
            }
            case '8': {
                return NetUtil.lllIlIIlIlIlIl[10];
            }
            case '9': {
                return NetUtil.lllIlIIlIlIlIl[11];
            }
            default: {
                llllllllllllIlIllIlllllIIIlIlIII = Character.toLowerCase(llllllllllllIlIllIlllllIIIlIlIII);
                switch (llllllllllllIlIllIlllllIIIlIlIII) {
                    case 'a': {
                        return NetUtil.lllIlIIlIlIlIl[12];
                    }
                    case 'b': {
                        return NetUtil.lllIlIIlIlIlIl[17];
                    }
                    case 'c': {
                        return NetUtil.lllIlIIlIlIlIl[14];
                    }
                    case 'd': {
                        return NetUtil.lllIlIIlIlIlIl[18];
                    }
                    case 'e': {
                        return NetUtil.lllIlIIlIlIlIl[19];
                    }
                    case 'f': {
                        return NetUtil.lllIlIIlIlIlIl[16];
                    }
                    default: {
                        return NetUtil.lllIlIIlIlIlIl[0];
                    }
                }
                break;
            }
        }
    }
    
    private static String lIlIIIlIIIlIlIll(final String llllllllllllIlIllIllllIllIIlIllI, final String llllllllllllIlIllIllllIllIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIllllIllIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllllIllIIlIIll.getBytes(StandardCharsets.UTF_8)), NetUtil.lllIlIIlIlIlIl[10]), "DES");
            final Cipher llllllllllllIlIllIllllIllIIllIII = Cipher.getInstance("DES");
            llllllllllllIlIllIllllIllIIllIII.init(NetUtil.lllIlIIlIlIlIl[4], llllllllllllIlIllIllllIllIIllIIl);
            return new String(llllllllllllIlIllIllllIllIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllllIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllllIllIIlIlll) {
            llllllllllllIlIllIllllIllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIlIIIllIllI(final int llllllllllllIlIllIllllIlIlIlllIl) {
        return llllllllllllIlIllIllllIlIlIlllIl == 0;
    }
    
    public static boolean isValidIpV6Address(final String llllllllllllIlIllIlllllIIIIIllll) {
        final int llllllllllllIlIllIlllllIIIIlIlll = llllllllllllIlIllIlllllIIIIIllll.length();
        boolean llllllllllllIlIllIlllllIIIIlIllI = NetUtil.lllIlIIlIlIlIl[0] != 0;
        int llllllllllllIlIllIlllllIIIIlIlIl = NetUtil.lllIlIIlIlIlIl[0];
        int llllllllllllIlIllIlllllIIIIlIlII = NetUtil.lllIlIIlIlIlIl[0];
        int llllllllllllIlIllIlllllIIIIlIIll = NetUtil.lllIlIIlIlIlIl[0];
        final StringBuilder llllllllllllIlIllIlllllIIIIlIIlI = new StringBuilder();
        char llllllllllllIlIllIlllllIIIIlIIIl = (char)NetUtil.lllIlIIlIlIlIl[0];
        int llllllllllllIlIllIlllllIIIIlIIII = NetUtil.lllIlIIlIlIlIl[0];
        if (lIlIIIlIIIllIlII(llllllllllllIlIllIlllllIIIIlIlll, NetUtil.lllIlIIlIlIlIl[4])) {
            return NetUtil.lllIlIIlIlIlIl[0] != 0;
        }
        int llllllllllllIlIllIlllllIIIIllIIl = NetUtil.lllIlIIlIlIlIl[0];
        while (lIlIIIlIIIllIlII(llllllllllllIlIllIlllllIIIIllIIl, llllllllllllIlIllIlllllIIIIlIlll)) {
            final char llllllllllllIlIllIlllllIIIIllIlI = llllllllllllIlIllIlllllIIIIlIIIl;
            llllllllllllIlIllIlllllIIIIlIIIl = llllllllllllIlIllIlllllIIIIIllll.charAt(llllllllllllIlIllIlllllIIIIllIIl);
            Label_0895: {
                switch (llllllllllllIlIllIlllllIIIIlIIIl) {
                    case '[': {
                        if (lIlIIIlIIIllIIll(llllllllllllIlIllIlllllIIIIllIIl)) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIIllll.charAt(llllllllllllIlIllIlllllIIIIlIlll - NetUtil.lllIlIIlIlIlIl[3]), NetUtil.lllIlIIlIlIlIl[20])) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        llllllllllllIlIllIlllllIIIIlIIII = NetUtil.lllIlIIlIlIlIl[3];
                        if (lIlIIIlIIIllIlII(llllllllllllIlIllIlllllIIIIlIlll, NetUtil.lllIlIIlIlIlIl[1])) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        break Label_0895;
                    }
                    case ']': {
                        if (lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIllIIl, llllllllllllIlIllIlllllIIIIlIlll - NetUtil.lllIlIIlIlIlIl[3])) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIIllll.charAt(NetUtil.lllIlIIlIlIlIl[0]), NetUtil.lllIlIIlIlIlIl[2])) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        break Label_0895;
                    }
                    case '.': {
                        if (lIlIIIlIIIlllIII(++llllllllllllIlIllIlllllIIIIlIlII, NetUtil.lllIlIIlIlIlIl[5])) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIllIllI(isValidIp4Word(String.valueOf(llllllllllllIlIllIlllllIIIIlIIlI)) ? 1 : 0)) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIlIlIl, NetUtil.lllIlIIlIlIlIl[8]) && lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIIIlIllI ? 1 : 0)) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIllIlIl(llllllllllllIlIllIlllllIIIIlIlIl, NetUtil.lllIlIIlIlIlIl[9]) && lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIIllll.charAt(llllllllllllIlIllIlllllIIIIlIIII), NetUtil.lllIlIIlIlIlIl[21]) && lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIIllll.charAt(NetUtil.lllIlIIlIlIlIl[3] + llllllllllllIlIllIlllllIIIIlIIII), NetUtil.lllIlIIlIlIlIl[21])) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        llllllllllllIlIllIlllllIIIIlIIlI.delete(NetUtil.lllIlIIlIlIlIl[0], llllllllllllIlIllIlllllIIIIlIIlI.length());
                        "".length();
                        "".length();
                        if (-(0xBA ^ 0x9D ^ (0x28 ^ 0xB)) > 0) {
                            return ((155 + 23 - 91 + 76 ^ 33 + 64 + 21 + 58) & (114 + 10 - 81 + 120 ^ 15 + 80 - 37 + 118 ^ -" ".length())) != 0x0;
                        }
                        break Label_0895;
                    }
                    case ':': {
                        if (lIlIIIlIIIllIlIl(llllllllllllIlIllIlllllIIIIllIIl, llllllllllllIlIllIlllllIIIIlIIII) && (!lIlIIIlIIIlllIII(llllllllllllIlIllIlllllIIIIIllll.length(), llllllllllllIlIllIlllllIIIIllIIl) || lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIIllll.charAt(llllllllllllIlIllIlllllIIIIllIIl + NetUtil.lllIlIIlIlIlIl[3]), NetUtil.lllIlIIlIlIlIl[21]))) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIlllIII(++llllllllllllIlIllIlllllIIIIlIlIl, NetUtil.lllIlIIlIlIlIl[9])) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIlllIIl(llllllllllllIlIllIlllllIIIIlIlII)) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        if (lIlIIIlIIIllIlIl(llllllllllllIlIllIlllllIIIIllIlI, NetUtil.lllIlIIlIlIlIl[21])) {
                            if (lIlIIIlIIIllIIll(llllllllllllIlIllIlllllIIIIlIllI ? 1 : 0)) {
                                return NetUtil.lllIlIIlIlIlIl[0] != 0;
                            }
                            llllllllllllIlIllIlllllIIIIlIllI = (NetUtil.lllIlIIlIlIlIl[3] != 0);
                        }
                        llllllllllllIlIllIlllllIIIIlIIlI.delete(NetUtil.lllIlIIlIlIlIl[0], llllllllllllIlIllIlllllIIIIlIIlI.length());
                        "".length();
                        "".length();
                        if (-" ".length() > (0x96 ^ 0xB0 ^ (0x3E ^ 0x1C))) {
                            return ((0x4D ^ 0x53 ^ (0x27 ^ 0x2A)) & (140 + 25 - 14 + 22 ^ 169 + 131 - 248 + 138 ^ -" ".length())) != 0x0;
                        }
                        break Label_0895;
                    }
                    case '%': {
                        if (lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIIIlIlIl)) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        ++llllllllllllIlIllIlllllIIIIlIIll;
                        if (lIlIIIlIIIlllIlI(llllllllllllIlIllIlllllIIIIllIIl + NetUtil.lllIlIIlIlIlIl[3], llllllllllllIlIllIlllllIIIIlIlll)) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        try {
                            if (lIlIIIlIIIlllIll(Integer.parseInt(llllllllllllIlIllIlllllIIIIIllll.substring(llllllllllllIlIllIlllllIIIIllIIl + NetUtil.lllIlIIlIlIlIl[3])))) {
                                return NetUtil.lllIlIIlIlIlIl[0] != 0;
                            }
                            "".length();
                            if ((0x42 ^ 0x46) == ((0x21 ^ 0x62) & ~(0x17 ^ 0x54))) {
                                return ((0x63 ^ 0x67) & ~(0x5B ^ 0x5F)) != 0x0;
                            }
                            break Label_0895;
                        }
                        catch (NumberFormatException llllllllllllIlIllIlllllIIIIllIll) {
                            return NetUtil.lllIlIIlIlIlIl[0] != 0;
                        }
                        break;
                    }
                }
                if (lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIIIlIIll)) {
                    if (lIlIIIlIIIllllII(llllllllllllIlIllIlllllIIIIlIIlI) && lIlIIIlIIIlllIII(llllllllllllIlIllIlllllIIIIlIIlI.length(), NetUtil.lllIlIIlIlIlIl[5])) {
                        return NetUtil.lllIlIIlIlIlIl[0] != 0;
                    }
                    if (lIlIIIlIIIllIllI(isValidHexChar(llllllllllllIlIllIlllllIIIIlIIIl) ? 1 : 0)) {
                        return NetUtil.lllIlIIlIlIlIl[0] != 0;
                    }
                }
                llllllllllllIlIllIlllllIIIIlIIlI.append(llllllllllllIlIllIlllllIIIIlIIIl);
                "".length();
            }
            ++llllllllllllIlIllIlllllIIIIllIIl;
            "".length();
            if ("   ".length() < " ".length()) {
                return ((0xC8 ^ 0x82) & ~(0x6C ^ 0x26)) != 0x0;
            }
        }
        if (lIlIIIlIIIlllIIl(llllllllllllIlIllIlllllIIIIlIlII)) {
            if (!lIlIIIlIIIllIlIl(llllllllllllIlIllIlllllIIIIlIlII, NetUtil.lllIlIIlIlIlIl[5]) || !lIlIIIlIIIllIIll(isValidIp4Word(String.valueOf(llllllllllllIlIllIlllllIIIIlIIlI)) ? 1 : 0) || lIlIIIlIIIlllIlI(llllllllllllIlIllIlllllIIIIlIlIl, NetUtil.lllIlIIlIlIlIl[9])) {
                return NetUtil.lllIlIIlIlIlIl[0] != 0;
            }
        }
        else {
            if (lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIlIlIl, NetUtil.lllIlIIlIlIlIl[9]) && lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIIIlIllI ? 1 : 0)) {
                return NetUtil.lllIlIIlIlIlIl[0] != 0;
            }
            if (lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIIIlIIll) && lIlIIIlIIIllIllI(llllllllllllIlIllIlllllIIIIlIIlI.length()) && lIlIIIlIIIllIlIl(llllllllllllIlIllIlllllIIIIIllll.charAt(llllllllllllIlIllIlllllIIIIlIlll - NetUtil.lllIlIIlIlIlIl[3] - llllllllllllIlIllIlllllIIIIlIIII), NetUtil.lllIlIIlIlIlIl[21]) && lIlIIIlIIIllIlll(llllllllllllIlIllIlllllIIIIIllll.charAt(llllllllllllIlIllIlllllIIIIlIlll - NetUtil.lllIlIIlIlIlIl[4] - llllllllllllIlIllIlllllIIIIlIIII), NetUtil.lllIlIIlIlIlIl[21])) {
                return NetUtil.lllIlIIlIlIlIl[0] != 0;
            }
        }
        return NetUtil.lllIlIIlIlIlIl[3] != 0;
    }
    
    private static boolean lIlIIIlIIIllIIll(final int llllllllllllIlIllIllllIlIlIlllll) {
        return llllllllllllIlIllIllllIlIlIlllll != 0;
    }
    
    private static void convertToBytes(final String llllllllllllIlIllIlllllIIIllIIII, final byte[] llllllllllllIlIllIlllllIIIlIllll, final int llllllllllllIlIllIlllllIIIlIlllI) {
        final int llllllllllllIlIllIlllllIIIllIIll = llllllllllllIlIllIlllllIIIllIIII.length();
        int llllllllllllIlIllIlllllIIIllIIlI = NetUtil.lllIlIIlIlIlIl[0];
        llllllllllllIlIllIlllllIIIlIllll[llllllllllllIlIllIlllllIIIlIlllI] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        llllllllllllIlIllIlllllIIIlIllll[llllllllllllIlIllIlllllIIIlIlllI + NetUtil.lllIlIIlIlIlIl[3]] = (byte)NetUtil.lllIlIIlIlIlIl[0];
        if (lIlIIIlIIIlllIII(llllllllllllIlIllIlllllIIIllIIll, NetUtil.lllIlIIlIlIlIl[5])) {
            final int llllllllllllIlIllIlllllIIIlllIIl = getIntValue(llllllllllllIlIllIlllllIIIllIIII.charAt(llllllllllllIlIllIlllllIIIllIIlI++));
            llllllllllllIlIllIlllllIIIlIllll[llllllllllllIlIllIlllllIIIlIlllI] |= (byte)(llllllllllllIlIllIlllllIIIlllIIl << NetUtil.lllIlIIlIlIlIl[1]);
        }
        if (lIlIIIlIIIlllIII(llllllllllllIlIllIlllllIIIllIIll, NetUtil.lllIlIIlIlIlIl[4])) {
            final int llllllllllllIlIllIlllllIIIlllIII = getIntValue(llllllllllllIlIllIlllllIIIllIIII.charAt(llllllllllllIlIllIlllllIIIllIIlI++));
            llllllllllllIlIllIlllllIIIlIllll[llllllllllllIlIllIlllllIIIlIlllI] |= (byte)llllllllllllIlIllIlllllIIIlllIII;
        }
        if (lIlIIIlIIIlllIII(llllllllllllIlIllIlllllIIIllIIll, NetUtil.lllIlIIlIlIlIl[3])) {
            final int llllllllllllIlIllIlllllIIIllIlll = getIntValue(llllllllllllIlIllIlllllIIIllIIII.charAt(llllllllllllIlIllIlllllIIIllIIlI++));
            final int n = llllllllllllIlIllIlllllIIIlIlllI + NetUtil.lllIlIIlIlIlIl[3];
            llllllllllllIlIllIlllllIIIlIllll[n] |= (byte)(llllllllllllIlIllIlllllIIIllIlll << NetUtil.lllIlIIlIlIlIl[1]);
        }
        final int llllllllllllIlIllIlllllIIIllIIIl = getIntValue(llllllllllllIlIllIlllllIIIllIIII.charAt(llllllllllllIlIllIlllllIIIllIIlI));
        final int n2 = llllllllllllIlIllIlllllIIIlIlllI + NetUtil.lllIlIIlIlIlIl[3];
        llllllllllllIlIllIlllllIIIlIllll[n2] |= (byte)(llllllllllllIlIllIlllllIIIllIIIl & NetUtil.lllIlIIlIlIlIl[16]);
    }
    
    private static boolean lIlIIIlIIIllllIl(final int llllllllllllIlIllIllllIlIllIlIlI, final int llllllllllllIlIllIllllIlIllIlIIl) {
        return llllllllllllIlIllIllllIlIllIlIlI <= llllllllllllIlIllIllllIlIllIlIIl;
    }
    
    static boolean isValidHexChar(final char llllllllllllIlIllIllllIllllllIII) {
        int n;
        if ((lIlIIIlIIIlllIlI(llllllllllllIlIllIllllIllllllIII, NetUtil.lllIlIIlIlIlIl[22]) && !lIlIIIlIIIlllIII(llllllllllllIlIllIllllIllllllIII, NetUtil.lllIlIIlIlIlIl[23])) || (lIlIIIlIIIlllIlI(llllllllllllIlIllIllllIllllllIII, NetUtil.lllIlIIlIlIlIl[24]) && !lIlIIIlIIIlllIII(llllllllllllIlIllIllllIllllllIII, NetUtil.lllIlIIlIlIlIl[25])) || (lIlIIIlIIIlllIlI(llllllllllllIlIllIllllIllllllIII, NetUtil.lllIlIIlIlIlIl[26]) && lIlIIIlIIIllllIl(llllllllllllIlIllIllllIllllllIII, NetUtil.lllIlIIlIlIlIl[27]))) {
            n = NetUtil.lllIlIIlIlIlIl[3];
            "".length();
            if (-" ".length() >= ((0x63 ^ 0x70) & ~(0x9C ^ 0x8F))) {
                return ((0x2B ^ 0x7C) & ~(0xE7 ^ 0xB0)) != 0x0;
            }
        }
        else {
            n = NetUtil.lllIlIIlIlIlIl[0];
        }
        return n != 0;
    }
    
    private static boolean lIlIIIlIIIllIlll(final int llllllllllllIlIllIllllIlIlIlIllI, final int llllllllllllIlIllIllllIlIlIlIlIl) {
        return llllllllllllIlIllIllllIlIlIlIllI != llllllllllllIlIllIllllIlIlIlIlIl;
    }
    
    private static boolean lIlIIIlIIIlllIII(final int llllllllllllIlIllIllllIlIllIIllI, final int llllllllllllIlIllIllllIlIllIIlIl) {
        return llllllllllllIlIllIllllIlIllIIllI > llllllllllllIlIllIllllIlIllIIlIl;
    }
}
