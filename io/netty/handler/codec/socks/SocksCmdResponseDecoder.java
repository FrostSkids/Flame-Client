// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandler;
import io.netty.util.CharsetUtil;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

public class SocksCmdResponseDecoder extends ReplayingDecoder<State>
{
    private /* synthetic */ int port;
    private /* synthetic */ SocksCmdStatus cmdStatus;
    private static final /* synthetic */ String[] lIllIIlIIIllIl;
    private /* synthetic */ SocksResponse msg;
    private /* synthetic */ int fieldLength;
    private static final /* synthetic */ int[] lIllIIlIIlIlII;
    private /* synthetic */ SocksAddressType addressType;
    private /* synthetic */ byte reserved;
    private /* synthetic */ SocksProtocolVersion version;
    private /* synthetic */ String host;
    
    private static void lllllIIlIllllIl() {
        (lIllIIlIIIllIl = new String[SocksCmdResponseDecoder.lIllIIlIIlIlII[3]])[SocksCmdResponseDecoder.lIllIIlIIlIlII[0]] = lllllIIlIllllII("wICuqQ2DdH3C6DjuXuT3MoOnge12tj9ds51FaOuT6nI=", "uHuRy");
        SocksCmdResponseDecoder.lIllIIlIIIllIl[SocksCmdResponseDecoder.lIllIIlIIlIlII[2]] = lllllIIlIllllII("NuvYusYjNURV8RuIElqkDDn7N2wUU5SL0GUczUi1kTs=", "fsbSq");
    }
    
    public SocksCmdResponseDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
        this.msg = SocksCommonUtils.UNKNOWN_SOCKS_RESPONSE;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIIIlIIIllllIlIlll, final ByteBuf lllllllllllllIIIIIlIIIllllIlIIII, final List<Object> lllllllllllllIIIIIlIIIllllIIllll) throws Exception {
        Label_0139: {
            switch (SocksCmdResponseDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksCmdResponseDecoder$State[this.state().ordinal()]) {
                case 1: {
                    this.version = SocksProtocolVersion.valueOf(lllllllllllllIIIIIlIIIllllIlIIII.readByte());
                    if (!lllllIIllIIIllI(this.version, SocksProtocolVersion.SOCKS5)) {
                        this.checkpoint(State.READ_CMD_HEADER);
                        break Label_0139;
                    }
                    "".length();
                    if (((0x4F ^ 0x5C ^ "   ".length()) & (0x82 ^ 0xA6 ^ (0xAA ^ 0x9E) ^ -" ".length())) > (126 + 39 - 67 + 86 ^ 56 + 111 - 116 + 137)) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.cmdStatus = SocksCmdStatus.valueOf(lllllllllllllIIIIIlIIIllllIlIIII.readByte());
                    this.reserved = lllllllllllllIIIIIlIIIllllIlIIII.readByte();
                    this.addressType = SocksAddressType.valueOf(lllllllllllllIIIIIlIIIllllIlIIII.readByte());
                    this.checkpoint(State.READ_CMD_ADDRESS);
                }
                case 3: {
                    switch (SocksCmdResponseDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[this.addressType.ordinal()]) {
                        case 1: {
                            this.host = SocksCommonUtils.intToIp(lllllllllllllIIIIIlIIIllllIlIIII.readInt());
                            this.port = lllllllllllllIIIIIlIIIllllIlIIII.readUnsignedShort();
                            this.msg = new SocksCmdResponse(this.cmdStatus, this.addressType, this.host, this.port);
                            "".length();
                            if (-"  ".length() >= 0) {
                                return;
                            }
                            break Label_0139;
                        }
                        case 2: {
                            this.fieldLength = lllllllllllllIIIIIlIIIllllIlIIII.readByte();
                            this.host = lllllllllllllIIIIIlIIIllllIlIIII.readBytes(this.fieldLength).toString(CharsetUtil.US_ASCII);
                            this.port = lllllllllllllIIIIIlIIIllllIlIIII.readUnsignedShort();
                            this.msg = new SocksCmdResponse(this.cmdStatus, this.addressType, this.host, this.port);
                            "".length();
                            if ("  ".length() > (0x86 ^ 0x82)) {
                                return;
                            }
                            break Label_0139;
                        }
                        case 3: {
                            this.host = SocksCommonUtils.ipv6toStr(lllllllllllllIIIIIlIIIllllIlIIII.readBytes(SocksCmdResponseDecoder.lIllIIlIIlIlII[1]).array());
                            this.port = lllllllllllllIIIIIlIIIllllIlIIII.readUnsignedShort();
                            this.msg = new SocksCmdResponse(this.cmdStatus, this.addressType, this.host, this.port);
                            "".length();
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                            break Label_0139;
                        }
                    }
                    break;
                }
            }
        }
        lllllllllllllIIIIIlIIIllllIlIlll.pipeline().remove(this);
        "".length();
        lllllllllllllIIIIIlIIIllllIIllll.add(this.msg);
        "".length();
    }
    
    @Deprecated
    public static String getName() {
        return SocksCmdResponseDecoder.lIllIIlIIIllIl[SocksCmdResponseDecoder.lIllIIlIIlIlII[0]];
    }
    
    private static String lllllIIlIllllII(final String lllllllllllllIIIIIlIIIlllIllllIl, final String lllllllllllllIIIIIlIIIlllIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIIIllllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIIIlllIllllII.getBytes(StandardCharsets.UTF_8)), SocksCmdResponseDecoder.lIllIIlIIlIlII[4]), "DES");
            final Cipher lllllllllllllIIIIIlIIIllllIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIIIIlIIIllllIIIIII.init(SocksCmdResponseDecoder.lIllIIlIIlIlII[3], lllllllllllllIIIIIlIIIllllIIIIlI);
            return new String(lllllllllllllIIIIIlIIIllllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIIIlllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIIIlllIlllllI) {
            lllllllllllllIIIIIlIIIlllIlllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIIllIIIllI(final Object lllllllllllllIIIIIlIIIlllIllIlII, final Object lllllllllllllIIIIIlIIIlllIllIIll) {
        return lllllllllllllIIIIIlIIIlllIllIlII != lllllllllllllIIIIIlIIIlllIllIIll;
    }
    
    private static void lllllIIllIIIlIl() {
        (lIllIIlIIlIlII = new int[5])[0] = ((0xB5 ^ 0x96) & ~(0x64 ^ 0x47));
        SocksCmdResponseDecoder.lIllIIlIIlIlII[1] = (0x78 ^ 0x68);
        SocksCmdResponseDecoder.lIllIIlIIlIlII[2] = " ".length();
        SocksCmdResponseDecoder.lIllIIlIIlIlII[3] = "  ".length();
        SocksCmdResponseDecoder.lIllIIlIIlIlII[4] = (128 + 100 - 221 + 171 ^ 167 + 179 - 272 + 112);
    }
    
    static {
        lllllIIllIIIlIl();
        lllllIIlIllllIl();
        name = SocksCmdResponseDecoder.lIllIIlIIIllIl[SocksCmdResponseDecoder.lIllIIlIIlIlII[2]];
    }
    
    enum State
    {
        READ_CMD_ADDRESS, 
        CHECK_PROTOCOL_VERSION, 
        READ_CMD_HEADER;
        
        private static final /* synthetic */ int[] lIIllllIIIllll;
        private static final /* synthetic */ String[] lIIllllIIIllIl;
        
        private static void llIlllIlIlIIllI() {
            (lIIllllIIIllIl = new String[State.lIIllllIIIllll[3]])[State.lIIllllIIIllll[0]] = llIlllIlIlIIIll("EgI0NjwOGiM6Ix4JPjkoBw8jJj4eBA==", "QJquw");
            State.lIIllllIIIllIl[State.lIIllllIIIllll[1]] = llIlllIlIlIIlII("DoLrKNPAAfI63FL9BG3YnQ==", "SahsC");
            State.lIIllllIIIllIl[State.lIIllllIIIllll[2]] = llIlllIlIlIIlIl("jWwdcXXCksXOqjRxiHcAeStDpnMjqbJ3", "uWXua");
        }
        
        private static void llIlllIlIllIIII() {
            (lIIllllIIIllll = new int[5])[0] = ((0xCE ^ 0xA6 ^ (0xE8 ^ 0x8B)) & (0x4E ^ 0x63 ^ (0xA3 ^ 0x85) ^ -" ".length()));
            State.lIIllllIIIllll[1] = " ".length();
            State.lIIllllIIIllll[2] = "  ".length();
            State.lIIllllIIIllll[3] = "   ".length();
            State.lIIllllIIIllll[4] = (0x79 ^ 0x71);
        }
        
        static {
            llIlllIlIllIIII();
            llIlllIlIlIIllI();
            final State[] $values = new State[State.lIIllllIIIllll[3]];
            $values[State.lIIllllIIIllll[0]] = State.CHECK_PROTOCOL_VERSION;
            $values[State.lIIllllIIIllll[1]] = State.READ_CMD_HEADER;
            $values[State.lIIllllIIIllll[2]] = State.READ_CMD_ADDRESS;
            $VALUES = $values;
        }
        
        private static boolean llIlllIlIllIIIl(final int lllllllllllllIIlIIlIlllIIlIlllIl, final int lllllllllllllIIlIIlIlllIIlIlllII) {
            return lllllllllllllIIlIIlIlllIIlIlllIl < lllllllllllllIIlIIlIlllIIlIlllII;
        }
        
        private static String llIlllIlIlIIlII(final String lllllllllllllIIlIIlIlllIIllIIIll, final String lllllllllllllIIlIIlIlllIIllIIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIlIlllIIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlllIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIlIlllIIllIIlll = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIlIlllIIllIIlll.init(State.lIIllllIIIllll[2], lllllllllllllIIlIIlIlllIIllIlIII);
                return new String(lllllllllllllIIlIIlIlllIIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlllIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIlIlllIIllIIllI) {
                lllllllllllllIIlIIlIlllIIllIIllI.printStackTrace();
                return null;
            }
        }
        
        private static String llIlllIlIlIIIll(String lllllllllllllIIlIIlIlllIlIIIIIlI, final String lllllllllllllIIlIIlIlllIlIIIIllI) {
            lllllllllllllIIlIIlIlllIlIIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIIlIlllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIlIlllIlIIIIlIl = new StringBuilder();
            final char[] lllllllllllllIIlIIlIlllIlIIIIlII = lllllllllllllIIlIIlIlllIlIIIIllI.toCharArray();
            int lllllllllllllIIlIIlIlllIlIIIIIll = State.lIIllllIIIllll[0];
            final boolean lllllllllllllIIlIIlIlllIIlllllIl = (Object)lllllllllllllIIlIIlIlllIlIIIIIlI.toCharArray();
            final short lllllllllllllIIlIIlIlllIIlllllII = (short)lllllllllllllIIlIIlIlllIIlllllIl.length;
            byte lllllllllllllIIlIIlIlllIIllllIll = (byte)State.lIIllllIIIllll[0];
            while (llIlllIlIllIIIl(lllllllllllllIIlIIlIlllIIllllIll, lllllllllllllIIlIIlIlllIIlllllII)) {
                final char lllllllllllllIIlIIlIlllIlIIIlIII = lllllllllllllIIlIIlIlllIIlllllIl[lllllllllllllIIlIIlIlllIIllllIll];
                lllllllllllllIIlIIlIlllIlIIIIlIl.append((char)(lllllllllllllIIlIIlIlllIlIIIlIII ^ lllllllllllllIIlIIlIlllIlIIIIlII[lllllllllllllIIlIIlIlllIlIIIIIll % lllllllllllllIIlIIlIlllIlIIIIlII.length]));
                "".length();
                ++lllllllllllllIIlIIlIlllIlIIIIIll;
                ++lllllllllllllIIlIIlIlllIIllllIll;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIlIlllIlIIIIlIl);
        }
        
        private static String llIlllIlIlIIlIl(final String lllllllllllllIIlIIlIlllIIlllIIlI, final String lllllllllllllIIlIIlIlllIIllIllll) {
            try {
                final SecretKeySpec lllllllllllllIIlIIlIlllIIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlllIIllIllll.getBytes(StandardCharsets.UTF_8)), State.lIIllllIIIllll[4]), "DES");
                final Cipher lllllllllllllIIlIIlIlllIIlllIlII = Cipher.getInstance("DES");
                lllllllllllllIIlIIlIlllIIlllIlII.init(State.lIIllllIIIllll[2], lllllllllllllIIlIIlIlllIIlllIlIl);
                return new String(lllllllllllllIIlIIlIlllIIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlllIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIlIlllIIlllIIll) {
                lllllllllllllIIlIIlIlllIIlllIIll.printStackTrace();
                return null;
            }
        }
    }
}
