// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import io.netty.channel.ChannelHandler;
import io.netty.util.CharsetUtil;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.ReplayingDecoder;

public class SocksCmdRequestDecoder extends ReplayingDecoder<State>
{
    private static final /* synthetic */ String[] lIIllIllIlIlII;
    private /* synthetic */ SocksAddressType addressType;
    private /* synthetic */ SocksRequest msg;
    private static final /* synthetic */ int[] lIIllIllIlIlIl;
    private /* synthetic */ String host;
    private /* synthetic */ byte reserved;
    private /* synthetic */ SocksProtocolVersion version;
    private /* synthetic */ int port;
    private /* synthetic */ SocksCmdType cmdType;
    private /* synthetic */ int fieldLength;
    
    private static void llIllIIlllIlIlI() {
        (lIIllIllIlIlII = new String[SocksCmdRequestDecoder.lIIllIllIlIlIl[3]])[SocksCmdRequestDecoder.lIIllIllIlIlIl[0]] = llIllIIlllIlIIl("5RDMotFPC3ROMIHTd/1+4RXNot6JaNp6ZOswsgDZQMo=", "XnQbR");
        SocksCmdRequestDecoder.lIIllIllIlIlII[SocksCmdRequestDecoder.lIIllIllIlIlIl[2]] = llIllIIlllIlIIl("CBLH56oF5DZ5XUyY6ATLenNEODXxrCihkYKDHRAQHRA=", "FENxY");
    }
    
    @Deprecated
    public static String getName() {
        return SocksCmdRequestDecoder.lIIllIllIlIlII[SocksCmdRequestDecoder.lIIllIllIlIlIl[0]];
    }
    
    static {
        llIllIIlllIlIll();
        llIllIIlllIlIlI();
        name = SocksCmdRequestDecoder.lIIllIllIlIlII[SocksCmdRequestDecoder.lIIllIllIlIlIl[2]];
    }
    
    private static void llIllIIlllIlIll() {
        (lIIllIllIlIlIl = new int[5])[0] = ((0x35 ^ 0x27) & ~(0x94 ^ 0x86));
        SocksCmdRequestDecoder.lIIllIllIlIlIl[1] = (0x68 ^ 0x53 ^ (0x75 ^ 0x5E));
        SocksCmdRequestDecoder.lIIllIllIlIlIl[2] = " ".length();
        SocksCmdRequestDecoder.lIIllIllIlIlIl[3] = "  ".length();
        SocksCmdRequestDecoder.lIIllIllIlIlIl[4] = (0x7 ^ 0xF);
    }
    
    public SocksCmdRequestDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
        this.msg = SocksCommonUtils.UNKNOWN_SOCKS_REQUEST;
    }
    
    private static String llIllIIlllIlIIl(final String lllllllllllllIIlIlIIllIIllIIIIll, final String lllllllllllllIIlIlIIllIIllIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIllIIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIllIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), SocksCmdRequestDecoder.lIIllIllIlIlIl[4]), "DES");
            final Cipher lllllllllllllIIlIlIIllIIllIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIllIIllIIIlIl.init(SocksCmdRequestDecoder.lIIllIllIlIlIl[3], lllllllllllllIIlIlIIllIIllIIIllI);
            return new String(lllllllllllllIIlIlIIllIIllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIllIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIllIIllIIIlII) {
            lllllllllllllIIlIlIIllIIllIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIIlllIllII(final Object lllllllllllllIIlIlIIllIIlIlllIll, final Object lllllllllllllIIlIlIIllIIlIlllIlI) {
        return lllllllllllllIIlIlIIllIIlIlllIll != lllllllllllllIIlIlIIllIIlIlllIlI;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIlIlIIllIIllIIllIl, final ByteBuf lllllllllllllIIlIlIIllIIllIlIIII, final List<Object> lllllllllllllIIlIlIIllIIllIIllll) throws Exception {
        Label_0092: {
            switch (SocksCmdRequestDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksCmdRequestDecoder$State[this.state().ordinal()]) {
                case 1: {
                    this.version = SocksProtocolVersion.valueOf(lllllllllllllIIlIlIIllIIllIlIIII.readByte());
                    if (!llIllIIlllIllII(this.version, SocksProtocolVersion.SOCKS5)) {
                        this.checkpoint(State.READ_CMD_HEADER);
                        break Label_0092;
                    }
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.cmdType = SocksCmdType.valueOf(lllllllllllllIIlIlIIllIIllIlIIII.readByte());
                    this.reserved = lllllllllllllIIlIlIIllIIllIlIIII.readByte();
                    this.addressType = SocksAddressType.valueOf(lllllllllllllIIlIlIIllIIllIlIIII.readByte());
                    this.checkpoint(State.READ_CMD_ADDRESS);
                }
                case 3: {
                    switch (SocksCmdRequestDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[this.addressType.ordinal()]) {
                        case 1: {
                            this.host = SocksCommonUtils.intToIp(lllllllllllllIIlIlIIllIIllIlIIII.readInt());
                            this.port = lllllllllllllIIlIlIIllIIllIlIIII.readUnsignedShort();
                            this.msg = new SocksCmdRequest(this.cmdType, this.addressType, this.host, this.port);
                            "".length();
                            if (-"  ".length() > 0) {
                                return;
                            }
                            break Label_0092;
                        }
                        case 2: {
                            this.fieldLength = lllllllllllllIIlIlIIllIIllIlIIII.readByte();
                            this.host = lllllllllllllIIlIlIIllIIllIlIIII.readBytes(this.fieldLength).toString(CharsetUtil.US_ASCII);
                            this.port = lllllllllllllIIlIlIIllIIllIlIIII.readUnsignedShort();
                            this.msg = new SocksCmdRequest(this.cmdType, this.addressType, this.host, this.port);
                            "".length();
                            if ("   ".length() == ((0x3B ^ 0x4) & ~(0x37 ^ 0x8))) {
                                return;
                            }
                            break Label_0092;
                        }
                        case 3: {
                            this.host = SocksCommonUtils.ipv6toStr(lllllllllllllIIlIlIIllIIllIlIIII.readBytes(SocksCmdRequestDecoder.lIIllIllIlIlIl[1]).array());
                            this.port = lllllllllllllIIlIlIIllIIllIlIIII.readUnsignedShort();
                            this.msg = new SocksCmdRequest(this.cmdType, this.addressType, this.host, this.port);
                            "".length();
                            if (-" ".length() >= 0) {
                                return;
                            }
                            break Label_0092;
                        }
                    }
                    break;
                }
            }
        }
        lllllllllllllIIlIlIIllIIllIIllIl.pipeline().remove(this);
        "".length();
        lllllllllllllIIlIlIIllIIllIIllll.add(this.msg);
        "".length();
    }
    
    enum State
    {
        READ_CMD_ADDRESS;
        
        private static final /* synthetic */ int[] lIIIIllIlIIlll;
        
        READ_CMD_HEADER, 
        CHECK_PROTOCOL_VERSION;
        
        private static final /* synthetic */ String[] lIIIIllIlIIlIl;
        
        private static String lIlllIlllIlIIll(String lllllllllllllIlIIlIIlIlIIllIllII, final String lllllllllllllIlIIlIIlIlIIllIlIll) {
            lllllllllllllIlIIlIIlIlIIllIllII = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIlIIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIlIIlIlIIllIllll = new StringBuilder();
            final char[] lllllllllllllIlIIlIIlIlIIllIlllI = lllllllllllllIlIIlIIlIlIIllIlIll.toCharArray();
            int lllllllllllllIlIIlIIlIlIIllIllIl = State.lIIIIllIlIIlll[0];
            final Exception lllllllllllllIlIIlIIlIlIIllIIlll = (Object)lllllllllllllIlIIlIIlIlIIllIllII.toCharArray();
            final double lllllllllllllIlIIlIIlIlIIllIIllI = lllllllllllllIlIIlIIlIlIIllIIlll.length;
            String lllllllllllllIlIIlIIlIlIIllIIlIl = (String)State.lIIIIllIlIIlll[0];
            while (lIlllIlllIllIII((int)lllllllllllllIlIIlIIlIlIIllIIlIl, (int)lllllllllllllIlIIlIIlIlIIllIIllI)) {
                final char lllllllllllllIlIIlIIlIlIIlllIIlI = lllllllllllllIlIIlIIlIlIIllIIlll[lllllllllllllIlIIlIIlIlIIllIIlIl];
                lllllllllllllIlIIlIIlIlIIllIllll.append((char)(lllllllllllllIlIIlIIlIlIIlllIIlI ^ lllllllllllllIlIIlIIlIlIIllIlllI[lllllllllllllIlIIlIIlIlIIllIllIl % lllllllllllllIlIIlIIlIlIIllIlllI.length]));
                "".length();
                ++lllllllllllllIlIIlIIlIlIIllIllIl;
                ++lllllllllllllIlIIlIIlIlIIllIIlIl;
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIlIIlIlIIllIllll);
        }
        
        private static boolean lIlllIlllIllIII(final int lllllllllllllIlIIlIIlIlIIllIIIIl, final int lllllllllllllIlIIlIIlIlIIllIIIII) {
            return lllllllllllllIlIIlIIlIlIIllIIIIl < lllllllllllllIlIIlIIlIlIIllIIIII;
        }
        
        static {
            lIlllIlllIlIlll();
            lIlllIlllIlIlII();
            final State[] $values = new State[State.lIIIIllIlIIlll[3]];
            $values[State.lIIIIllIlIIlll[0]] = State.CHECK_PROTOCOL_VERSION;
            $values[State.lIIIIllIlIIlll[1]] = State.READ_CMD_HEADER;
            $values[State.lIIIIllIlIIlll[2]] = State.READ_CMD_ADDRESS;
            $VALUES = $values;
        }
        
        private static void lIlllIlllIlIlll() {
            (lIIIIllIlIIlll = new int[4])[0] = ((0x16 ^ 0x44 ^ (0xF1 ^ 0xC2)) & (0x2B ^ 0x61 ^ (0x0 ^ 0x2B) ^ -" ".length()));
            State.lIIIIllIlIIlll[1] = " ".length();
            State.lIIIIllIlIIlll[2] = "  ".length();
            State.lIIIIllIlIIlll[3] = "   ".length();
        }
        
        private static void lIlllIlllIlIlII() {
            (lIIIIllIlIIlIl = new String[State.lIIIIllIlIIlll[3]])[State.lIIIIllIlIIlll[0]] = lIlllIlllIlIIlI("57fvU3ydvpAvfuafQFaTNvD/Cx/lhi1L", "qyJdW");
            State.lIIIIllIlIIlIl[State.lIIIIllIlIIlll[1]] = lIlllIlllIlIIll("KBcZNT45HxwuKT8THDQz", "zRXqa");
            State.lIIIIllIlIIlIl[State.lIIIIllIlIIlll[2]] = lIlllIlllIlIIll("IBEqNzgxGS8sJjYQOTY0IQ==", "rTksg");
        }
        
        private static String lIlllIlllIlIIlI(final String lllllllllllllIlIIlIIlIlIlIIIIIIl, final String lllllllllllllIlIIlIIlIlIIllllllI) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIIlIlIlIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIlIIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIlIIlIlIlIIIIIll = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIlIIlIlIlIIIIIll.init(State.lIIIIllIlIIlll[2], lllllllllllllIlIIlIIlIlIlIIIIlII);
                return new String(lllllllllllllIlIIlIIlIlIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIIlIlIlIIIIIlI) {
                lllllllllllllIlIIlIIlIlIlIIIIIlI.printStackTrace();
                return null;
            }
        }
    }
}
