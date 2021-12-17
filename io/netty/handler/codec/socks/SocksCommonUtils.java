// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import io.netty.util.internal.StringUtil;

final class SocksCommonUtils
{
    private static final /* synthetic */ char[] ipv6conseqZeroFiller;
    private static final /* synthetic */ int[] llIIlIIIlIIlll;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    public static String ipv6toCompressedForm(final byte[] llllllllllllIlllIIllIIIlIlllIlll) {
        if (lIIIlIllllIlIIlI(SocksCommonUtils.$assertionsDisabled ? 1 : 0) && lIIIlIllllIlIIll(llllllllllllIlllIIllIIIlIlllIlll.length, SocksCommonUtils.llIIlIIIlIIlll[3])) {
            throw new AssertionError();
        }
        int llllllllllllIlllIIllIIIlIllllIlI = SocksCommonUtils.llIIlIIIlIIlll[5];
        int llllllllllllIlllIIllIIIlIllllIIl = SocksCommonUtils.llIIlIIIlIIlll[6];
        int llllllllllllIlllIIllIIIlIlllllII = SocksCommonUtils.llIIlIIIlIIlll[6];
        while (lIIIlIllllIlIlII(llllllllllllIlllIIllIIIlIlllllII, SocksCommonUtils.llIIlIIIlIIlll[4])) {
            int llllllllllllIlllIIllIIIlIllllllI = llllllllllllIlllIIllIIIlIlllllII * SocksCommonUtils.llIIlIIIlIIlll[7];
            int llllllllllllIlllIIllIIIlIlllllIl = SocksCommonUtils.llIIlIIIlIIlll[6];
            while (lIIIlIllllIlIlII(llllllllllllIlllIIllIIIlIllllllI, llllllllllllIlllIIllIIIlIlllIlll.length) && lIIIlIllllIlIIlI(llllllllllllIlllIIllIIIlIlllIlll[llllllllllllIlllIIllIIIlIllllllI]) && lIIIlIllllIlIIlI(llllllllllllIlllIIllIIIlIlllIlll[llllllllllllIlllIIllIIIlIllllllI + SocksCommonUtils.llIIlIIIlIIlll[8]])) {
                llllllllllllIlllIIllIIIlIllllllI += 2;
                ++llllllllllllIlllIIllIIIlIlllllIl;
                "".length();
                if ((69 + 10 - 60 + 110 ^ 74 + 87 - 127 + 99) < 0) {
                    return null;
                }
            }
            if (lIIIlIllllIlIllI(llllllllllllIlllIIllIIIlIlllllIl, llllllllllllIlllIIllIIIlIllllIIl)) {
                llllllllllllIlllIIllIIIlIllllIlI = llllllllllllIlllIIllIIIlIlllllII;
                llllllllllllIlllIIllIIIlIllllIIl = llllllllllllIlllIIllIIIlIlllllIl;
            }
            llllllllllllIlllIIllIIIlIlllllII = llllllllllllIlllIIllIIIlIllllllI / SocksCommonUtils.llIIlIIIlIIlll[7] + SocksCommonUtils.llIIlIIIlIIlll[8];
            "".length();
            if (((0xC2 ^ 0xAA ^ (0x10 ^ 0x4C)) & (0xEF ^ 0x8D ^ (0x10 ^ 0x46) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        if (!lIIIlIllllIlIIll(llllllllllllIlllIIllIIIlIllllIlI, SocksCommonUtils.llIIlIIIlIIlll[5]) || lIIIlIllllIlIlII(llllllllllllIlllIIllIIIlIllllIIl, SocksCommonUtils.llIIlIIIlIIlll[7])) {
            return ipv6toStr(llllllllllllIlllIIllIIIlIlllIlll);
        }
        final StringBuilder llllllllllllIlllIIllIIIlIllllIII = new StringBuilder(SocksCommonUtils.llIIlIIIlIIlll[9]);
        ipv6toStr(llllllllllllIlllIIllIIIlIllllIII, llllllllllllIlllIIllIIIlIlllIlll, SocksCommonUtils.llIIlIIIlIIlll[6], llllllllllllIlllIIllIIIlIllllIlI);
        llllllllllllIlllIIllIIIlIllllIII.append(SocksCommonUtils.ipv6conseqZeroFiller);
        "".length();
        ipv6toStr(llllllllllllIlllIIllIIIlIllllIII, llllllllllllIlllIIllIIIlIlllIlll, llllllllllllIlllIIllIIIlIllllIlI + llllllllllllIlllIIllIIIlIllllIIl, SocksCommonUtils.llIIlIIIlIIlll[4]);
        return String.valueOf(llllllllllllIlllIIllIIIlIllllIII);
    }
    
    public static String ipv6toStr(final byte[] llllllllllllIlllIIllIIIlIllIllll) {
        if (lIIIlIllllIlIIlI(SocksCommonUtils.$assertionsDisabled ? 1 : 0) && lIIIlIllllIlIIll(llllllllllllIlllIIllIIIlIllIllll.length, SocksCommonUtils.llIIlIIIlIIlll[3])) {
            throw new AssertionError();
        }
        final StringBuilder llllllllllllIlllIIllIIIlIllIlllI = new StringBuilder(SocksCommonUtils.llIIlIIIlIIlll[9]);
        ipv6toStr(llllllllllllIlllIIllIIIlIllIlllI, llllllllllllIlllIIllIIIlIllIllll, SocksCommonUtils.llIIlIIIlIIlll[6], SocksCommonUtils.llIIlIIIlIIlll[4]);
        return String.valueOf(llllllllllllIlllIIllIIIlIllIlllI);
    }
    
    private static boolean lIIIlIllllIlIllI(final int llllllllllllIlllIIllIIIlIlIIllIl, final int llllllllllllIlllIIllIIIlIlIIllII) {
        return llllllllllllIlllIIllIIIlIlIIllIl > llllllllllllIlllIIllIIIlIlIIllII;
    }
    
    static {
        lIIIlIllllIlIIIl();
        SECOND_ADDRESS_OCTET_SHIFT = SocksCommonUtils.llIIlIIIlIIlll[3];
        FIRST_ADDRESS_OCTET_SHIFT = SocksCommonUtils.llIIlIIIlIIlll[0];
        XOR_DEFAULT_VALUE = SocksCommonUtils.llIIlIIIlIIlll[1];
        THIRD_ADDRESS_OCTET_SHIFT = SocksCommonUtils.llIIlIIIlIIlll[4];
        ipv6hextetSeparator = (char)SocksCommonUtils.llIIlIIIlIIlll[10];
        int $assertionsDisabled2;
        if (lIIIlIllllIlIIlI(SocksCommonUtils.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = SocksCommonUtils.llIIlIIIlIIlll[8];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = SocksCommonUtils.llIIlIIIlIIlll[6];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        UNKNOWN_SOCKS_REQUEST = new UnknownSocksRequest();
        UNKNOWN_SOCKS_RESPONSE = new UnknownSocksResponse();
        final char[] ipv6conseqZeroFiller2 = new char[SocksCommonUtils.llIIlIIIlIIlll[7]];
        ipv6conseqZeroFiller2[SocksCommonUtils.llIIlIIIlIIlll[6]] = (char)SocksCommonUtils.llIIlIIIlIIlll[10];
        ipv6conseqZeroFiller2[SocksCommonUtils.llIIlIIIlIIlll[8]] = (char)SocksCommonUtils.llIIlIIIlIIlll[10];
        ipv6conseqZeroFiller = ipv6conseqZeroFiller2;
    }
    
    private static void lIIIlIllllIlIIIl() {
        (llIIlIIIlIIlll = new int[11])[0] = (0x17 ^ 0x18 ^ (0x6B ^ 0x7C));
        SocksCommonUtils.llIIlIIIlIIlll[1] = 18 + 99 + 44 + 94;
        SocksCommonUtils.llIIlIIIlIIlll[2] = (0x2 ^ 0x2C);
        SocksCommonUtils.llIIlIIIlIIlll[3] = (0 + 47 - 24 + 146 ^ 184 + 166 - 319 + 154);
        SocksCommonUtils.llIIlIIIlIIlll[4] = (93 + 92 - 40 + 57 ^ 23 + 126 - 143 + 188);
        SocksCommonUtils.llIIlIIIlIIlll[5] = -" ".length();
        SocksCommonUtils.llIIlIIIlIIlll[6] = ((0xC4 ^ 0x92 ^ (0xF8 ^ 0xBA)) & (((0xDE ^ 0x9B) & ~(0x75 ^ 0x30)) ^ (0x1E ^ 0xA) ^ -" ".length()));
        SocksCommonUtils.llIIlIIIlIIlll[7] = "  ".length();
        SocksCommonUtils.llIIlIIIlIIlll[8] = " ".length();
        SocksCommonUtils.llIIlIIIlIIlll[9] = (0xD6 ^ 0x8C ^ (0x61 ^ 0x1C));
        SocksCommonUtils.llIIlIIIlIIlll[10] = (0x77 ^ 0x15 ^ (0xE9 ^ 0xB1));
    }
    
    private static boolean lIIIlIllllIlIIll(final int llllllllllllIlllIIllIIIlIlIIIlll, final int llllllllllllIlllIIllIIIlIlIIIllI) {
        return llllllllllllIlllIIllIIIlIlIIIlll != llllllllllllIlllIIllIIIlIlIIIllI;
    }
    
    private static void appendHextet(final StringBuilder llllllllllllIlllIIllIIIlIlIllIIl, final byte[] llllllllllllIlllIIllIIIlIlIllIII, final int llllllllllllIlllIIllIIIlIlIlIlll) {
        StringUtil.toHexString(llllllllllllIlllIIllIIIlIlIllIIl, llllllllllllIlllIIllIIIlIlIllIII, llllllllllllIlllIIllIIIlIlIlIlll << SocksCommonUtils.llIIlIIIlIIlll[8], SocksCommonUtils.llIIlIIIlIIlll[7]);
        "".length();
    }
    
    private SocksCommonUtils() {
    }
    
    public static String intToIp(final int llllllllllllIlllIIllIIIllIIIIlIl) {
        return String.valueOf(new StringBuilder().append(String.valueOf(llllllllllllIlllIIllIIIllIIIIlIl >> SocksCommonUtils.llIIlIIIlIIlll[0] & SocksCommonUtils.llIIlIIIlIIlll[1])).append((char)SocksCommonUtils.llIIlIIIlIIlll[2]).append(llllllllllllIlllIIllIIIllIIIIlIl >> SocksCommonUtils.llIIlIIIlIIlll[3] & SocksCommonUtils.llIIlIIIlIIlll[1]).append((char)SocksCommonUtils.llIIlIIIlIIlll[2]).append(llllllllllllIlllIIllIIIllIIIIlIl >> SocksCommonUtils.llIIlIIIlIIlll[4] & SocksCommonUtils.llIIlIIIlIIlll[1]).append((char)SocksCommonUtils.llIIlIIIlIIlll[2]).append(llllllllllllIlllIIllIIIllIIIIlIl & SocksCommonUtils.llIIlIIIlIIlll[1]));
    }
    
    private static boolean lIIIlIllllIlIlII(final int llllllllllllIlllIIllIIIlIlIlIIIl, final int llllllllllllIlllIIllIIIlIlIlIIII) {
        return llllllllllllIlllIIllIIIlIlIlIIIl < llllllllllllIlllIIllIIIlIlIlIIII;
    }
    
    private static boolean lIIIlIllllIlIIlI(final int llllllllllllIlllIIllIIIlIlIIlIlI) {
        return llllllllllllIlllIIllIIIlIlIIlIlI == 0;
    }
    
    private static void ipv6toStr(final StringBuilder llllllllllllIlllIIllIIIlIllIIllI, final byte[] llllllllllllIlllIIllIIIlIllIIIII, final int llllllllllllIlllIIllIIIlIlIlllll, int llllllllllllIlllIIllIIIlIllIIIll) {
        --llllllllllllIlllIIllIIIlIllIIIll;
        int llllllllllllIlllIIllIIIlIllIIIlI = llllllllllllIlllIIllIIIlIlIlllll;
        while (lIIIlIllllIlIlII(llllllllllllIlllIIllIIIlIllIIIlI, llllllllllllIlllIIllIIIlIllIIIll)) {
            appendHextet(llllllllllllIlllIIllIIIlIllIIllI, llllllllllllIlllIIllIIIlIllIIIII, llllllllllllIlllIIllIIIlIllIIIlI);
            llllllllllllIlllIIllIIIlIllIIllI.append((char)SocksCommonUtils.llIIlIIIlIIlll[10]);
            "".length();
            ++llllllllllllIlllIIllIIIlIllIIIlI;
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        appendHextet(llllllllllllIlllIIllIIIlIllIIllI, llllllllllllIlllIIllIIIlIllIIIII, llllllllllllIlllIIllIIIlIllIIIlI);
    }
}
