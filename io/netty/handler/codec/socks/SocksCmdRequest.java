// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import io.netty.util.CharsetUtil;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.IDN;
import io.netty.util.NetUtil;

public final class SocksCmdRequest extends SocksRequest
{
    private static final /* synthetic */ String[] lIllllIIIIlIIl;
    private final /* synthetic */ SocksCmdType cmdType;
    private static final /* synthetic */ int[] lIllllIIIIllII;
    private final /* synthetic */ int port;
    private final /* synthetic */ SocksAddressType addressType;
    private final /* synthetic */ String host;
    
    public SocksCmdRequest(final SocksCmdType llllllllllllIllllIllIIIlllIIIIll, final SocksAddressType llllllllllllIllllIllIIIllIllllIl, final String llllllllllllIllllIllIIIllIllllII, final int llllllllllllIllllIllIIIlllIIIIII) {
        super(SocksRequestType.CMD);
        if (lIIIIIllllIIIlIl(llllllllllllIllllIllIIIlllIIIIll)) {
            throw new NullPointerException(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[0]]);
        }
        if (lIIIIIllllIIIlIl(llllllllllllIllllIllIIIllIllllIl)) {
            throw new NullPointerException(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[1]]);
        }
        if (lIIIIIllllIIIlIl(llllllllllllIllllIllIIIllIllllII)) {
            throw new NullPointerException(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[2]]);
        }
        switch (SocksCmdRequest$1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[llllllllllllIllllIllIIIllIllllIl.ordinal()]) {
            case 1: {
                if (lIIIIIllllIIIllI(NetUtil.isValidIpV4Address(llllllllllllIllllIllIIIllIllllII) ? 1 : 0)) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(llllllllllllIllllIllIIIllIllllII).append(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[3]])));
                }
                break;
            }
            case 2: {
                if (lIIIIIllllIIIlll(IDN.toASCII(llllllllllllIllllIllIIIllIllllII).length(), SocksCmdRequest.lIllllIIIIllII[4])) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(llllllllllllIllllIllIIIllIllllII).append(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[5]]).append(IDN.toASCII(llllllllllllIllllIllIIIllIllllII)).append(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[6]])));
                }
                break;
            }
            case 3: {
                if (lIIIIIllllIIIllI(NetUtil.isValidIpV6Address(llllllllllllIllllIllIIIllIllllII) ? 1 : 0)) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(llllllllllllIllllIllIIIllIllllII).append(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[7]])));
                }
                break;
            }
        }
        if (!lIIIIIllllIIlIII(llllllllllllIllllIllIIIlllIIIIII) || lIIIIIllllIIlIIl(llllllllllllIllllIllIIIlllIIIIII, SocksCmdRequest.lIllllIIIIllII[8])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(llllllllllllIllllIllIIIlllIIIIII).append(SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[9]])));
        }
        this.cmdType = llllllllllllIllllIllIIIlllIIIIll;
        this.addressType = llllllllllllIllllIllIIIllIllllIl;
        this.host = IDN.toASCII(llllllllllllIllllIllIIIllIllllII);
        this.port = llllllllllllIllllIllIIIlllIIIIII;
    }
    
    private static void lIIIIIlllIllllll() {
        (lIllllIIIIlIIl = new String[SocksCmdRequest.lIllllIIIIllII[10]])[SocksCmdRequest.lIllllIIIIllII[0]] = lIIIIIlllIllllII("84KwBx+EwrU=", "GvOYT");
        SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[1]] = lIIIIIlllIllllIl("1zH1O/eG9ldDdVBLmFw/dg==", "vZCNg");
        SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[2]] = lIIIIIlllIlllllI("Jz8xMw==", "OPBGJ");
        SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[3]] = lIIIIIlllIllllII("K5kOXZ9pJQMt/blDc75Il85xJVv61+s8rQIgjz7BZKc=", "yUTUV");
        SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[5]] = lIIIIIlllIllllII("Oz3uwAejEA4=", "FYpXa");
        SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[6]] = lIIIIIlllIlllllI("RjQbLhUDNRBtQlNkQy4YByNDIRkLOBc=", "fQcMp");
        SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[7]] = lIIIIIlllIlllllI("ViY2VwoZO2UWRAAuKR4AVgYVAVJWLiETFhM8Ng==", "vOEwd");
        SocksCmdRequest.lIllllIIIIlIIl[SocksCmdRequest.lIllllIIIIllII[9]] = lIIIIIlllIlllllI("eigEZCQ1NVctJHojGDEkPjJXdGpmYQ9kdnp3QnF5bA==", "ZAwDJ");
    }
    
    public SocksAddressType addressType() {
        return this.addressType;
    }
    
    public SocksCmdType cmdType() {
        return this.cmdType;
    }
    
    private static boolean lIIIIIllllIIlIIl(final int llllllllllllIllllIllIIIlIlllIlII, final int llllllllllllIllllIllIIIlIlllIIll) {
        return llllllllllllIllllIllIIIlIlllIlII >= llllllllllllIllllIllIIIlIlllIIll;
    }
    
    public int port() {
        return this.port;
    }
    
    private static boolean lIIIIIllllIIIlll(final int llllllllllllIllllIllIIIlIllIllII, final int llllllllllllIllllIllIIIlIllIlIll) {
        return llllllllllllIllllIllIIIlIllIllII > llllllllllllIllllIllIIIlIllIlIll;
    }
    
    private static boolean lIIIIIllllIIllIl(final int llllllllllllIllllIllIIIlIlllIIII, final int llllllllllllIllllIllIIIlIllIllll) {
        return llllllllllllIllllIllIIIlIlllIIII < llllllllllllIllllIllIIIlIllIllll;
    }
    
    private static boolean lIIIIIllllIIIlIl(final Object llllllllllllIllllIllIIIlIllIlIIl) {
        return llllllllllllIllllIllIIIlIllIlIIl == null;
    }
    
    private static String lIIIIIlllIllllIl(final String llllllllllllIllllIllIIIllIlIIIIl, final String llllllllllllIllllIllIIIllIIllllI) {
        try {
            final SecretKeySpec llllllllllllIllllIllIIIllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIIIllIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIIIllIlIIIll.init(SocksCmdRequest.lIllllIIIIllII[2], llllllllllllIllllIllIIIllIlIIlII);
            return new String(llllllllllllIllllIllIIIllIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIIIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIIIllIlIIIlI) {
            llllllllllllIllllIllIIIllIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    public String host() {
        return IDN.toUnicode(this.host);
    }
    
    private static boolean lIIIIIllllIIIllI(final int llllllllllllIllllIllIIIlIllIIlll) {
        return llllllllllllIllllIllIIIlIllIIlll == 0;
    }
    
    private static String lIIIIIlllIlllllI(String llllllllllllIllllIllIIIllIIIllII, final String llllllllllllIllllIllIIIllIIIlIll) {
        llllllllllllIllllIllIIIllIIIllII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIllIIIllIIIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllIIIllIIIllll = new StringBuilder();
        final char[] llllllllllllIllllIllIIIllIIIlllI = llllllllllllIllllIllIIIllIIIlIll.toCharArray();
        int llllllllllllIllllIllIIIllIIIllIl = SocksCmdRequest.lIllllIIIIllII[0];
        final String llllllllllllIllllIllIIIllIIIIlll = (Object)((String)llllllllllllIllllIllIIIllIIIllII).toCharArray();
        final boolean llllllllllllIllllIllIIIllIIIIllI = llllllllllllIllllIllIIIllIIIIlll.length != 0;
        double llllllllllllIllllIllIIIllIIIIlIl = SocksCmdRequest.lIllllIIIIllII[0];
        while (lIIIIIllllIIllIl((int)llllllllllllIllllIllIIIllIIIIlIl, llllllllllllIllllIllIIIllIIIIllI ? 1 : 0)) {
            final char llllllllllllIllllIllIIIllIIlIIlI = llllllllllllIllllIllIIIllIIIIlll[llllllllllllIllllIllIIIllIIIIlIl];
            llllllllllllIllllIllIIIllIIIllll.append((char)(llllllllllllIllllIllIIIllIIlIIlI ^ llllllllllllIllllIllIIIllIIIlllI[llllllllllllIllllIllIIIllIIIllIl % llllllllllllIllllIllIIIllIIIlllI.length]));
            "".length();
            ++llllllllllllIllllIllIIIllIIIllIl;
            ++llllllllllllIllllIllIIIllIIIIlIl;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllIIIllIIIllll);
    }
    
    private static void lIIIIIllllIIIlII() {
        (lIllllIIIIllII = new int[11])[0] = ((0x74 ^ 0x63) & ~(0x89 ^ 0x9E));
        SocksCmdRequest.lIllllIIIIllII[1] = " ".length();
        SocksCmdRequest.lIllllIIIIllII[2] = "  ".length();
        SocksCmdRequest.lIllllIIIIllII[3] = "   ".length();
        SocksCmdRequest.lIllllIIIIllII[4] = 104 + 129 - 136 + 52 + (0x22 ^ 0x73) - (95 + 114 - 191 + 208) + (146 + 148 - 139 + 96);
        SocksCmdRequest.lIllllIIIIllII[5] = (0x2F ^ 0x4A ^ (0x6D ^ 0xC));
        SocksCmdRequest.lIllllIIIIllII[6] = (0x17 ^ 0x12);
        SocksCmdRequest.lIllllIIIIllII[7] = (0x6E ^ 0x68);
        SocksCmdRequest.lIllllIIIIllII[8] = (-(0xFFFFBFFE & 0x5BEF) & (0xFFFFFBFF & 0x11FED));
        SocksCmdRequest.lIllllIIIIllII[9] = (0x4F ^ 0x58 ^ (0xB8 ^ 0xA8));
        SocksCmdRequest.lIllllIIIIllII[10] = (0x2A ^ 0x22);
    }
    
    static {
        lIIIIIllllIIIlII();
        lIIIIIlllIllllll();
    }
    
    private static String lIIIIIlllIllllII(final String llllllllllllIllllIllIIIlIllllIlI, final String llllllllllllIllllIllIIIlIllllIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIllIIIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), SocksCmdRequest.lIllllIIIIllII[10]), "DES");
            final Cipher llllllllllllIllllIllIIIlIllllllI = Cipher.getInstance("DES");
            llllllllllllIllllIllIIIlIllllllI.init(SocksCmdRequest.lIllllIIIIllII[2], llllllllllllIllllIllIIIlIlllllll);
            return new String(llllllllllllIllllIllIIIlIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIIIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIIIlIlllllIl) {
            llllllllllllIllllIllIIIlIlllllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void encodeAsByteBuf(final ByteBuf llllllllllllIllllIllIIIllIlIlIIl) {
        llllllllllllIllllIllIIIllIlIlIIl.writeByte(this.protocolVersion().byteValue());
        "".length();
        llllllllllllIllllIllIIIllIlIlIIl.writeByte(this.cmdType.byteValue());
        "".length();
        llllllllllllIllllIllIIIllIlIlIIl.writeByte(SocksCmdRequest.lIllllIIIIllII[0]);
        "".length();
        llllllllllllIllllIllIIIllIlIlIIl.writeByte(this.addressType.byteValue());
        "".length();
        switch (SocksCmdRequest$1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[this.addressType.ordinal()]) {
            case 1: {
                llllllllllllIllllIllIIIllIlIlIIl.writeBytes(NetUtil.createByteArrayFromIpAddressString(this.host));
                "".length();
                llllllllllllIllllIllIIIllIlIlIIl.writeShort(this.port);
                "".length();
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIllllIllIIIllIlIlIIl.writeByte(this.host.length());
                "".length();
                llllllllllllIllllIllIIIllIlIlIIl.writeBytes(this.host.getBytes(CharsetUtil.US_ASCII));
                "".length();
                llllllllllllIllllIllIIIllIlIlIIl.writeShort(this.port);
                "".length();
                "".length();
                if (((0x2 ^ 0x2D ^ (0x76 ^ 0x4A)) & (114 + 132 - 200 + 94 ^ 80 + 53 - 105 + 131 ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 3: {
                llllllllllllIllllIllIIIllIlIlIIl.writeBytes(NetUtil.createByteArrayFromIpAddressString(this.host));
                "".length();
                llllllllllllIllllIllIIIllIlIlIIl.writeShort(this.port);
                "".length();
                break;
            }
        }
    }
    
    private static boolean lIIIIIllllIIlIII(final int llllllllllllIllllIllIIIlIllIIlIl) {
        return llllllllllllIllllIllIIIlIllIIlIl > 0;
    }
}
