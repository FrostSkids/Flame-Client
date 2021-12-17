// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.net.IDN;
import java.util.Arrays;
import io.netty.util.CharsetUtil;
import io.netty.util.NetUtil;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class SocksCmdResponse extends SocksResponse
{
    private final /* synthetic */ SocksCmdStatus cmdStatus;
    private static final /* synthetic */ byte[] IPv4_HOSTNAME_ZEROED;
    private final /* synthetic */ int port;
    private static final /* synthetic */ String[] llIllIlIIIlIlI;
    private static final /* synthetic */ byte[] DOMAIN_ZEROED;
    private static final /* synthetic */ byte[] IPv6_HOSTNAME_ZEROED;
    private static final /* synthetic */ int[] llIllIlIIIlIll;
    private final /* synthetic */ SocksAddressType addressType;
    private final /* synthetic */ String host;
    
    private static boolean lIIlIllllIIllIII(final int llllllllllllIllIIllIlllllIIlIlIl, final int llllllllllllIllIIllIlllllIIlIlII) {
        return llllllllllllIllIIllIlllllIIlIlIl < llllllllllllIllIIllIlllllIIlIlII;
    }
    
    static {
        lIIlIllllIIlIIlI();
        lIIlIllllIIlIIIl();
        final byte[] domain_ZEROED = new byte[SocksCmdResponse.llIllIlIIIlIll[1]];
        domain_ZEROED[SocksCmdResponse.llIllIlIIIlIll[0]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        DOMAIN_ZEROED = domain_ZEROED;
        final byte[] iPv4_HOSTNAME_ZEROED = new byte[SocksCmdResponse.llIllIlIIIlIll[5]];
        iPv4_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[0]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv4_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[1]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv4_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[2]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv4_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[4]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        IPv4_HOSTNAME_ZEROED = iPv4_HOSTNAME_ZEROED;
        final byte[] iPv6_HOSTNAME_ZEROED = new byte[SocksCmdResponse.llIllIlIIIlIll[9]];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[0]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[1]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[2]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[4]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[5]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[6]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[8]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[10]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[11]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[12]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[13]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[14]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[15]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[16]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[17]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        iPv6_HOSTNAME_ZEROED[SocksCmdResponse.llIllIlIIIlIll[18]] = (byte)SocksCmdResponse.llIllIlIIIlIll[0];
        IPv6_HOSTNAME_ZEROED = iPv6_HOSTNAME_ZEROED;
    }
    
    public SocksCmdStatus cmdStatus() {
        return this.cmdStatus;
    }
    
    private static boolean lIIlIllllIIlIIll(final Object llllllllllllIllIIllIlllllIIIllII) {
        return llllllllllllIllIIllIlllllIIIllII == null;
    }
    
    private static void lIIlIllllIIlIIlI() {
        (llIllIlIIIlIll = new int[19])[0] = ((0x7E ^ 0x27) & ~(0x4F ^ 0x16));
        SocksCmdResponse.llIllIlIIIlIll[1] = " ".length();
        SocksCmdResponse.llIllIlIIIlIll[2] = "  ".length();
        SocksCmdResponse.llIllIlIIIlIll[3] = 106 + 129 - 67 + 35 + (0x0 ^ 0x3B) - (13 + 61 + 97 + 70) + (144 + 174 - 266 + 182);
        SocksCmdResponse.llIllIlIIIlIll[4] = "   ".length();
        SocksCmdResponse.llIllIlIIIlIll[5] = (0x8A ^ 0x8E);
        SocksCmdResponse.llIllIlIIIlIll[6] = (0x40 ^ 0x11 ^ (0x37 ^ 0x63));
        SocksCmdResponse.llIllIlIIIlIll[7] = (-1 & 0xFFFF);
        SocksCmdResponse.llIllIlIIIlIll[8] = (0xB8 ^ 0xBE);
        SocksCmdResponse.llIllIlIIIlIll[9] = (0x14 ^ 0x4);
        SocksCmdResponse.llIllIlIIIlIll[10] = (0x50 ^ 0x57);
        SocksCmdResponse.llIllIlIIIlIll[11] = (0x3F ^ 0x7 ^ (0x65 ^ 0x55));
        SocksCmdResponse.llIllIlIIIlIll[12] = (115 + 113 - 114 + 19 ^ 52 + 136 - 128 + 80);
        SocksCmdResponse.llIllIlIIIlIll[13] = (0x7 ^ 0x72 ^ 122 + 37 - 99 + 67);
        SocksCmdResponse.llIllIlIIIlIll[14] = (0x65 ^ 0x6E);
        SocksCmdResponse.llIllIlIIIlIll[15] = (0x9C ^ 0x90);
        SocksCmdResponse.llIllIlIIIlIll[16] = (98 + 53 - 32 + 44 ^ 103 + 20 - 33 + 84);
        SocksCmdResponse.llIllIlIIIlIll[17] = (109 + 175 - 249 + 145 ^ 82 + 83 - 2 + 23);
        SocksCmdResponse.llIllIlIIIlIll[18] = (0x7 ^ 0x8);
    }
    
    private static boolean lIIlIllllIIlIlII(final Object llllllllllllIllIIllIlllllIIIlllI) {
        return llllllllllllIllIIllIlllllIIIlllI != null;
    }
    
    private static String lIIlIllllIIIllll(final String llllllllllllIllIIllIllllllIIIIII, final String llllllllllllIllIIllIlllllIllllll) {
        try {
            final SecretKeySpec llllllllllllIllIIllIllllllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlllllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIllllllIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIllllllIIIlII.init(SocksCmdResponse.llIllIlIIIlIll[2], llllllllllllIllIIllIllllllIIIlIl);
            return new String(llllllllllllIllIIllIllllllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIllllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIllllllIIIIll) {
            llllllllllllIllIIllIllllllIIIIll.printStackTrace();
            return null;
        }
    }
    
    public SocksCmdResponse(final SocksCmdStatus llllllllllllIllIIllIllllllllIlII, final SocksAddressType llllllllllllIllIIllIllllllllIIII) {
        this(llllllllllllIllIIllIllllllllIlII, llllllllllllIllIIllIllllllllIIII, null, SocksCmdResponse.llIllIlIIIlIll[0]);
    }
    
    private static boolean lIIlIllllIIlIlIl(final int llllllllllllIllIIllIlllllIIIlIlI) {
        return llllllllllllIllIIllIlllllIIIlIlI == 0;
    }
    
    private static String lIIlIllllIIlIIII(String llllllllllllIllIIllIlllllIlIIIII, final String llllllllllllIllIIllIlllllIIlllll) {
        llllllllllllIllIIllIlllllIlIIIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllIlllllIlIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIlllllIlIIIll = new StringBuilder();
        final char[] llllllllllllIllIIllIlllllIlIIIlI = llllllllllllIllIIllIlllllIIlllll.toCharArray();
        int llllllllllllIllIIllIlllllIlIIIIl = SocksCmdResponse.llIllIlIIIlIll[0];
        final int llllllllllllIllIIllIlllllIIllIll = (Object)((String)llllllllllllIllIIllIlllllIlIIIII).toCharArray();
        final String llllllllllllIllIIllIlllllIIllIlI = (String)llllllllllllIllIIllIlllllIIllIll.length;
        float llllllllllllIllIIllIlllllIIllIIl = SocksCmdResponse.llIllIlIIIlIll[0];
        while (lIIlIllllIIllIII((int)llllllllllllIllIIllIlllllIIllIIl, (int)llllllllllllIllIIllIlllllIIllIlI)) {
            final char llllllllllllIllIIllIlllllIlIIllI = llllllllllllIllIIllIlllllIIllIll[llllllllllllIllIIllIlllllIIllIIl];
            llllllllllllIllIIllIlllllIlIIIll.append((char)(llllllllllllIllIIllIlllllIlIIllI ^ llllllllllllIllIIllIlllllIlIIIlI[llllllllllllIllIIllIlllllIlIIIIl % llllllllllllIllIIllIlllllIlIIIlI.length]));
            "".length();
            ++llllllllllllIllIIllIlllllIlIIIIl;
            ++llllllllllllIllIIllIlllllIIllIIl;
            "".length();
            if (-(24 + 16 + 25 + 115 ^ 151 + 88 - 199 + 136) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIlllllIlIIIll);
    }
    
    private static boolean lIIlIllllIIlIllI(final int llllllllllllIllIIllIlllllIIlIIIl, final int llllllllllllIllIIllIlllllIIlIIII) {
        return llllllllllllIllIIllIlllllIIlIIIl > llllllllllllIllIIllIlllllIIlIIII;
    }
    
    @Override
    public void encodeAsByteBuf(final ByteBuf llllllllllllIllIIllIllllllIIllIl) {
        llllllllllllIllIIllIllllllIIllIl.writeByte(this.protocolVersion().byteValue());
        "".length();
        llllllllllllIllIIllIllllllIIllIl.writeByte(this.cmdStatus.byteValue());
        "".length();
        llllllllllllIllIIllIllllllIIllIl.writeByte(SocksCmdResponse.llIllIlIIIlIll[0]);
        "".length();
        llllllllllllIllIIllIllllllIIllIl.writeByte(this.addressType.byteValue());
        "".length();
        switch (SocksCmdResponse$1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[this.addressType.ordinal()]) {
            case 1: {
                byte[] array;
                if (lIIlIllllIIlIIll(this.host)) {
                    array = SocksCmdResponse.IPv4_HOSTNAME_ZEROED;
                    "".length();
                    if (((0x20 ^ 0x13) & ~(0xAC ^ 0x9F)) > " ".length()) {
                        return;
                    }
                }
                else {
                    array = NetUtil.createByteArrayFromIpAddressString(this.host);
                }
                final byte[] llllllllllllIllIIllIllllllIlIIIl = array;
                llllllllllllIllIIllIllllllIIllIl.writeBytes(llllllllllllIllIIllIllllllIlIIIl);
                "".length();
                llllllllllllIllIIllIllllllIIllIl.writeShort(this.port);
                "".length();
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                byte[] array2;
                if (lIIlIllllIIlIIll(this.host)) {
                    array2 = SocksCmdResponse.DOMAIN_ZEROED;
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                }
                else {
                    array2 = this.host.getBytes(CharsetUtil.US_ASCII);
                }
                final byte[] llllllllllllIllIIllIllllllIlIIII = array2;
                llllllllllllIllIIllIllllllIIllIl.writeByte(llllllllllllIllIIllIllllllIlIIII.length);
                "".length();
                llllllllllllIllIIllIllllllIIllIl.writeBytes(llllllllllllIllIIllIllllllIlIIII);
                "".length();
                llllllllllllIllIIllIllllllIIllIl.writeShort(this.port);
                "".length();
                "".length();
                if (((0x21 ^ 0x13 ^ (0xE3 ^ 0x93)) & (0x8A ^ 0x94 ^ (0x2F ^ 0x73) ^ -" ".length())) != ((0xDC ^ 0x8B ^ (0x4A ^ 0x4E)) & (0x49 ^ 0xB ^ (0x12 ^ 0x3) ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 3: {
                byte[] array3;
                if (lIIlIllllIIlIIll(this.host)) {
                    array3 = SocksCmdResponse.IPv6_HOSTNAME_ZEROED;
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
                else {
                    array3 = NetUtil.createByteArrayFromIpAddressString(this.host);
                }
                final byte[] llllllllllllIllIIllIllllllIIllll = array3;
                llllllllllllIllIIllIllllllIIllIl.writeBytes(llllllllllllIllIIllIllllllIIllll);
                "".length();
                llllllllllllIllIIllIllllllIIllIl.writeShort(this.port);
                "".length();
                "".length();
                if ((0xA4 ^ 0x86 ^ (0x96 ^ 0xB0)) < 0) {
                    return;
                }
                break;
            }
        }
    }
    
    public SocksAddressType addressType() {
        return this.addressType;
    }
    
    private static String lIIlIllllIIIlllI(final String llllllllllllIllIIllIlllllIllIlIl, final String llllllllllllIllIIllIlllllIllIlII) {
        try {
            final SecretKeySpec llllllllllllIllIIllIlllllIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlllllIllIlII.getBytes(StandardCharsets.UTF_8)), SocksCmdResponse.llIllIlIIIlIll[11]), "DES");
            final Cipher llllllllllllIllIIllIlllllIllIlll = Cipher.getInstance("DES");
            llllllllllllIllIIllIlllllIllIlll.init(SocksCmdResponse.llIllIlIIIlIll[2], llllllllllllIllIIllIlllllIlllIII);
            return new String(llllllllllllIllIIllIlllllIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlllllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIlllllIllIllI) {
            llllllllllllIllIIllIlllllIllIllI.printStackTrace();
            return null;
        }
    }
    
    public SocksCmdResponse(final SocksCmdStatus llllllllllllIllIIllIlllllllIlIIl, final SocksAddressType llllllllllllIllIIllIlllllllIIIll, String llllllllllllIllIIllIlllllllIIIlI, final int llllllllllllIllIIllIlllllllIIIIl) {
        super(SocksResponseType.CMD);
        if (lIIlIllllIIlIIll(llllllllllllIllIIllIlllllllIlIIl)) {
            throw new NullPointerException(SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[0]]);
        }
        if (lIIlIllllIIlIIll(llllllllllllIllIIllIlllllllIIIll)) {
            throw new NullPointerException(SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[1]]);
        }
        if (lIIlIllllIIlIlII(llllllllllllIllIIllIlllllllIIIlI)) {
            switch (SocksCmdResponse$1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[llllllllllllIllIIllIlllllllIIIll.ordinal()]) {
                case 1: {
                    if (lIIlIllllIIlIlIl(NetUtil.isValidIpV4Address((String)llllllllllllIllIIllIlllllllIIIlI) ? 1 : 0)) {
                        throw new IllegalArgumentException(String.valueOf(new StringBuilder().append((String)llllllllllllIllIIllIlllllllIIIlI).append(SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[2]])));
                    }
                    break;
                }
                case 2: {
                    if (lIIlIllllIIlIllI(IDN.toASCII((String)llllllllllllIllIIllIlllllllIIIlI).length(), SocksCmdResponse.llIllIlIIIlIll[3])) {
                        throw new IllegalArgumentException(String.valueOf(new StringBuilder().append((String)llllllllllllIllIIllIlllllllIIIlI).append(SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[4]]).append(IDN.toASCII((String)llllllllllllIllIIllIlllllllIIIlI)).append(SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[5]])));
                    }
                    break;
                }
                case 3: {
                    if (lIIlIllllIIlIlIl(NetUtil.isValidIpV6Address((String)llllllllllllIllIIllIlllllllIIIlI) ? 1 : 0)) {
                        throw new IllegalArgumentException(String.valueOf(new StringBuilder().append((String)llllllllllllIllIIllIlllllllIIIlI).append(SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[6]])));
                    }
                    break;
                }
            }
            llllllllllllIllIIllIlllllllIIIlI = IDN.toASCII((String)llllllllllllIllIIllIlllllllIIIlI);
        }
        if (!lIIlIllllIIlIlll(llllllllllllIllIIllIlllllllIIIIl) || lIIlIllllIIlIllI(llllllllllllIllIIllIlllllllIIIIl, SocksCmdResponse.llIllIlIIIlIll[7])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(llllllllllllIllIIllIlllllllIIIIl).append(SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[8]])));
        }
        this.cmdStatus = llllllllllllIllIIllIlllllllIlIIl;
        this.addressType = llllllllllllIllIIllIlllllllIIIll;
        this.host = (String)llllllllllllIllIIllIlllllllIIIlI;
        this.port = llllllllllllIllIIllIlllllllIIIIl;
    }
    
    private static void lIIlIllllIIlIIIl() {
        (llIllIlIIIlIlI = new String[SocksCmdResponse.llIllIlIIIlIll[10]])[SocksCmdResponse.llIllIlIIIlIll[0]] = lIIlIllllIIIlllI("unXCMRpsC1aKQoKIhrIyRw==", "bUDba");
        SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[1]] = lIIlIllllIIIllll("yKLt7AnYMBY7MDrzSAdvwA==", "VEFwE");
        SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[2]] = lIIlIllllIIlIIII("QjM0cDwNLmcxchQ7Kzk2QhMXJmZCOyM0IAcpNA==", "bZGPR");
        SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[4]] = lIIlIllllIIIlllI("ALr/a0KSGBg=", "ILByA");
        SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[5]] = lIIlIllllIIlIIII("Yz0XCR0mPBxKSnZtTwkQIipPBhEuMRs=", "CXojx");
        SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[6]] = lIIlIllllIIIllll("rDoRPUEFttYvGBr6VXW2dJrGM0L6wXYwqkaLfv3UNJs=", "vnrNV");
        SocksCmdResponse.llIllIlIIIlIlI[SocksCmdResponse.llIllIlIIIlIll[8]] = lIIlIllllIIIlllI("FfVqJ9kbHdOBCfRdBjg9bAqCxgp9U17b/Rczr1nstaw81yspYbu4UQ==", "fqZXE");
    }
    
    public String host() {
        if (lIIlIllllIIlIlII(this.host)) {
            return IDN.toUnicode(this.host);
        }
        return null;
    }
    
    public int port() {
        return this.port;
    }
    
    private static boolean lIIlIllllIIlIlll(final int llllllllllllIllIIllIlllllIIIlIII) {
        return llllllllllllIllIIllIlllllIIIlIII >= 0;
    }
}
