// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandler;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

public class SocksInitResponseDecoder extends ReplayingDecoder<State>
{
    private static final /* synthetic */ String[] lIIlIlIIlllIII;
    private /* synthetic */ SocksResponse msg;
    private static final /* synthetic */ int[] lIIlIlIIlllIlI;
    private /* synthetic */ SocksAuthScheme authScheme;
    private /* synthetic */ SocksProtocolVersion version;
    
    static {
        llIlIIIIIIIlIll();
        llIlIIIIIIIlIlI();
        name = SocksInitResponseDecoder.lIIlIlIIlllIII[SocksInitResponseDecoder.lIIlIlIIlllIlI[1]];
    }
    
    public SocksInitResponseDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
        this.msg = SocksCommonUtils.UNKNOWN_SOCKS_RESPONSE;
    }
    
    @Deprecated
    public static String getName() {
        return SocksInitResponseDecoder.lIIlIlIIlllIII[SocksInitResponseDecoder.lIIlIlIIlllIlI[0]];
    }
    
    private static void llIlIIIIIIIlIll() {
        (lIIlIlIIlllIlI = new int[3])[0] = ((0x30 ^ 0x3A) & ~(0x4C ^ 0x46));
        SocksInitResponseDecoder.lIIlIlIIlllIlI[1] = " ".length();
        SocksInitResponseDecoder.lIIlIlIIlllIlI[2] = "  ".length();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIllIlIIIlIlllIlIII, final ByteBuf lllllllllllllIIllIlIIIlIlllIIlll, final List<Object> lllllllllllllIIllIlIIIlIlllIIIlI) throws Exception {
        Label_0166: {
            switch (SocksInitResponseDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksInitResponseDecoder$State[this.state().ordinal()]) {
                case 1: {
                    this.version = SocksProtocolVersion.valueOf(lllllllllllllIIllIlIIIlIlllIIlll.readByte());
                    if (!llIlIIIIIIIllII(this.version, SocksProtocolVersion.SOCKS5)) {
                        this.checkpoint(State.READ_PREFFERED_AUTH_TYPE);
                        break Label_0166;
                    }
                    "".length();
                    if (((0x43 ^ 0x5 ^ (0xF5 ^ 0x97)) & (0x74 ^ 0x8 ^ (0x7D ^ 0x25) ^ -" ".length())) != ((33 + 47 + 19 + 43 ^ 126 + 69 - 30 + 11) & (49 + 30 - 66 + 115 ^ 188 + 77 - 76 + 1 ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.authScheme = SocksAuthScheme.valueOf(lllllllllllllIIllIlIIIlIlllIIlll.readByte());
                    this.msg = new SocksInitResponse(this.authScheme);
                    break;
                }
            }
        }
        lllllllllllllIIllIlIIIlIlllIlIII.pipeline().remove(this);
        "".length();
        lllllllllllllIIllIlIIIlIlllIIIlI.add(this.msg);
        "".length();
    }
    
    private static boolean llIlIIIIIIIllII(final Object lllllllllllllIIllIlIIIlIllIlIIlI, final Object lllllllllllllIIllIlIIIlIllIlIIIl) {
        return lllllllllllllIIllIlIIIlIllIlIIlI != lllllllllllllIIllIlIIIlIllIlIIIl;
    }
    
    private static void llIlIIIIIIIlIlI() {
        (lIIlIlIIlllIII = new String[SocksInitResponseDecoder.lIIlIlIIlllIlI[2]])[SocksInitResponseDecoder.lIIlIlIIlllIlI[0]] = llIlIIIIIIIIllI("uJgLyUhTVwsJf9ZOIfIwnank4cmvdalZeuoMB9yfuok=", "Ynffr");
        SocksInitResponseDecoder.lIIlIlIIlllIII[SocksInitResponseDecoder.lIIlIlIIlllIlI[1]] = llIlIIIIIIIIllI("7wIu/4T6RITSsx1s3N/fBE17yPFYmX4BPnNQRVe9Qes=", "kbdxp");
    }
    
    private static String llIlIIIIIIIIllI(final String lllllllllllllIIllIlIIIlIllIllIII, final String lllllllllllllIIllIlIIIlIllIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIIlIllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIIlIllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIIIlIllIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIIIlIllIlllII.init(SocksInitResponseDecoder.lIIlIlIIlllIlI[2], lllllllllllllIIllIlIIIlIllIlllIl);
            return new String(lllllllllllllIIllIlIIIlIllIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIIlIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIIlIllIllIll) {
            lllllllllllllIIllIlIIIlIllIllIll.printStackTrace();
            return null;
        }
    }
    
    enum State
    {
        private static final /* synthetic */ int[] lIIIllIIllIlll;
        
        READ_PREFFERED_AUTH_TYPE, 
        CHECK_PROTOCOL_VERSION;
        
        private static final /* synthetic */ String[] lIIIllIIllIllI;
        
        private static boolean llIIIIlllIlllll(final int lllllllllllllIlIIIIIlIIIlIIIIIIl, final int lllllllllllllIlIIIIIlIIIlIIIIIII) {
            return lllllllllllllIlIIIIIlIIIlIIIIIIl < lllllllllllllIlIIIIIlIIIlIIIIIII;
        }
        
        static {
            llIIIIlllIllllI();
            llIIIIlllIlllIl();
            final State[] $values = new State[State.lIIIllIIllIlll[2]];
            $values[State.lIIIllIIllIlll[0]] = State.CHECK_PROTOCOL_VERSION;
            $values[State.lIIIllIIllIlll[1]] = State.READ_PREFFERED_AUTH_TYPE;
            $VALUES = $values;
        }
        
        private static void llIIIIlllIllllI() {
            (lIIIllIIllIlll = new int[4])[0] = ((0x6A ^ 0x2C ^ (0x92 ^ 0x96)) & (0x8A ^ 0x82 ^ (0xC5 ^ 0x8F) ^ -" ".length()));
            State.lIIIllIIllIlll[1] = " ".length();
            State.lIIIllIIllIlll[2] = "  ".length();
            State.lIIIllIIllIlll[3] = (0x14 ^ 0x27 ^ (0x43 ^ 0x78));
        }
        
        private static String llIIIIlllIlllII(final String lllllllllllllIlIIIIIlIIIlIIIlIIl, final String lllllllllllllIlIIIIIlIIIlIIIIllI) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIIlIIIlIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIIIlIIIIllI.getBytes(StandardCharsets.UTF_8)), State.lIIIllIIllIlll[3]), "DES");
                final Cipher lllllllllllllIlIIIIIlIIIlIIIlIll = Cipher.getInstance("DES");
                lllllllllllllIlIIIIIlIIIlIIIlIll.init(State.lIIIllIIllIlll[2], lllllllllllllIlIIIIIlIIIlIIIllII);
                return new String(lllllllllllllIlIIIIIlIIIlIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIIlIIIlIIIlIlI) {
                lllllllllllllIlIIIIIlIIIlIIIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIIlllIlllIl() {
            (lIIIllIIllIllI = new String[State.lIIIllIIllIlll[2]])[State.lIIIllIIllIlll[0]] = llIIIIlllIllIll("JRE0Ezg5CSMfJykaPhwsMBwjAzopFw==", "fYqPs");
            State.lIIIllIIllIllI[State.lIIIllIIllIlll[1]] = llIIIIlllIlllII("MswAwQR8TqyMMOc10IBElR3TE8p6oo0dfa0aftXOiGI=", "kRYYX");
        }
        
        private static String llIIIIlllIllIll(String lllllllllllllIlIIIIIlIIIlIIllIIl, final String lllllllllllllIlIIIIIlIIIlIIllIII) {
            lllllllllllllIlIIIIIlIIIlIIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIIIlIIIlIIlllII = new StringBuilder();
            final char[] lllllllllllllIlIIIIIlIIIlIIllIll = lllllllllllllIlIIIIIlIIIlIIllIII.toCharArray();
            int lllllllllllllIlIIIIIlIIIlIIllIlI = State.lIIIllIIllIlll[0];
            final int lllllllllllllIlIIIIIlIIIlIIlIlII = (Object)lllllllllllllIlIIIIIlIIIlIIllIIl.toCharArray();
            final short lllllllllllllIlIIIIIlIIIlIIlIIll = (short)lllllllllllllIlIIIIIlIIIlIIlIlII.length;
            boolean lllllllllllllIlIIIIIlIIIlIIlIIlI = State.lIIIllIIllIlll[0] != 0;
            while (llIIIIlllIlllll(lllllllllllllIlIIIIIlIIIlIIlIIlI ? 1 : 0, lllllllllllllIlIIIIIlIIIlIIlIIll)) {
                final char lllllllllllllIlIIIIIlIIIlIIlllll = lllllllllllllIlIIIIIlIIIlIIlIlII[lllllllllllllIlIIIIIlIIIlIIlIIlI];
                lllllllllllllIlIIIIIlIIIlIIlllII.append((char)(lllllllllllllIlIIIIIlIIIlIIlllll ^ lllllllllllllIlIIIIIlIIIlIIllIll[lllllllllllllIlIIIIIlIIIlIIllIlI % lllllllllllllIlIIIIIlIIIlIIllIll.length]));
                "".length();
                ++lllllllllllllIlIIIIIlIIIlIIllIlI;
                ++lllllllllllllIlIIIIIlIIIlIIlIIlI;
                "".length();
                if (-(0x75 ^ 0x18 ^ (0x19 ^ 0x70)) >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIIIlIIIlIIlllII);
        }
    }
}
