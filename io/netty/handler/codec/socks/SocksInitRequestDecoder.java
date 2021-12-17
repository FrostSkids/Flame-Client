// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.List;
import io.netty.handler.codec.ReplayingDecoder;

public class SocksInitRequestDecoder extends ReplayingDecoder<State>
{
    private /* synthetic */ SocksRequest msg;
    private /* synthetic */ SocksProtocolVersion version;
    private static final /* synthetic */ String[] lllIllIIlIlIll;
    private static final /* synthetic */ int[] lllIllIIlIllII;
    private /* synthetic */ byte authSchemeNum;
    private final /* synthetic */ List<SocksAuthScheme> authSchemes;
    
    @Deprecated
    public static String getName() {
        return SocksInitRequestDecoder.lllIllIIlIlIll[SocksInitRequestDecoder.lllIllIIlIllII[0]];
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlIllIIllIIIllIllIll, final ByteBuf llllllllllllIlIllIIllIIIllIllIlI, final List<Object> llllllllllllIlIllIIllIIIllIlIlIl) throws Exception {
        Label_0130: {
            switch (SocksInitRequestDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksInitRequestDecoder$State[this.state().ordinal()]) {
                case 1: {
                    this.version = SocksProtocolVersion.valueOf(llllllllllllIlIllIIllIIIllIllIlI.readByte());
                    if (!lIlIIlIIIlllIIII(this.version, SocksProtocolVersion.SOCKS5)) {
                        this.checkpoint(State.READ_AUTH_SCHEMES);
                        break Label_0130;
                    }
                    "".length();
                    if ((0xB0 ^ 0x84 ^ (0xA6 ^ 0x96)) <= ((0x65 ^ 0x8 ^ (0x86 ^ 0x89)) & (0x5E ^ 0x10 ^ (0xE9 ^ 0xC5) ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.authSchemes.clear();
                    this.authSchemeNum = llllllllllllIlIllIIllIIIllIllIlI.readByte();
                    int llllllllllllIlIllIIllIIIllIlllIl = SocksInitRequestDecoder.lllIllIIlIllII[0];
                    while (lIlIIlIIIlllIIIl(llllllllllllIlIllIIllIIIllIlllIl, this.authSchemeNum)) {
                        this.authSchemes.add(SocksAuthScheme.valueOf(llllllllllllIlIllIIllIIIllIllIlI.readByte()));
                        "".length();
                        ++llllllllllllIlIllIIllIIIllIlllIl;
                        "".length();
                        if ("   ".length() == -" ".length()) {
                            return;
                        }
                    }
                    this.msg = new SocksInitRequest(this.authSchemes);
                    break;
                }
            }
        }
        llllllllllllIlIllIIllIIIllIllIll.pipeline().remove(this);
        "".length();
        llllllllllllIlIllIIllIIIllIlIlIl.add(this.msg);
        "".length();
    }
    
    private static boolean lIlIIlIIIlllIIIl(final int llllllllllllIlIllIIllIIIlIllIlll, final int llllllllllllIlIllIIllIIIlIllIllI) {
        return llllllllllllIlIllIIllIIIlIllIlll < llllllllllllIlIllIIllIIIlIllIllI;
    }
    
    private static void lIlIIlIIIllIlllI() {
        (lllIllIIlIlIll = new String[SocksInitRequestDecoder.lllIllIIlIllII[2]])[SocksInitRequestDecoder.lllIllIIlIllII[0]] = lIlIIlIIIllIllII("eYOEQ380MZOC0F+W85JrWjkJdy+KzMJI8rN73i6SV2k=", "jtYsA");
        SocksInitRequestDecoder.lllIllIIlIlIll[SocksInitRequestDecoder.lllIllIIlIllII[1]] = lIlIIlIIIllIllIl("F6rncGs1qKB6caMp+78PRDY7yqlXBqdKEQjArDUTC1s=", "VZmha");
    }
    
    private static String lIlIIlIIIllIllIl(final String llllllllllllIlIllIIllIIIllIIlIlI, final String llllllllllllIlIllIIllIIIllIIlIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllIIIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIllIIIllIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIllIIIllIIlllI.init(SocksInitRequestDecoder.lllIllIIlIllII[2], llllllllllllIlIllIIllIIIllIIllll);
            return new String(llllllllllllIlIllIIllIIIllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIIIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllIIIllIIllIl) {
            llllllllllllIlIllIIllIIIllIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIlIIIllIllII(final String llllllllllllIlIllIIllIIIlIllllIl, final String llllllllllllIlIllIIllIIIlIllllII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllIIIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIIIlIllllII.getBytes(StandardCharsets.UTF_8)), SocksInitRequestDecoder.lllIllIIlIllII[3]), "DES");
            final Cipher llllllllllllIlIllIIllIIIllIIIIIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIllIIIllIIIIIl.init(SocksInitRequestDecoder.lllIllIIlIllII[2], llllllllllllIlIllIIllIIIllIIIIlI);
            return new String(llllllllllllIlIllIIllIIIllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIIIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllIIIllIIIIII) {
            llllllllllllIlIllIIllIIIllIIIIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIlIIIllIllll();
        lIlIIlIIIllIlllI();
        name = SocksInitRequestDecoder.lllIllIIlIlIll[SocksInitRequestDecoder.lllIllIIlIllII[1]];
    }
    
    public SocksInitRequestDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
        this.authSchemes = new ArrayList<SocksAuthScheme>();
        this.msg = SocksCommonUtils.UNKNOWN_SOCKS_REQUEST;
    }
    
    private static void lIlIIlIIIllIllll() {
        (lllIllIIlIllII = new int[4])[0] = ((0x7B ^ 0x55) & ~(0x84 ^ 0xAA));
        SocksInitRequestDecoder.lllIllIIlIllII[1] = " ".length();
        SocksInitRequestDecoder.lllIllIIlIllII[2] = "  ".length();
        SocksInitRequestDecoder.lllIllIIlIllII[3] = (0x41 ^ 0x58 ^ (0x12 ^ 0x3));
    }
    
    private static boolean lIlIIlIIIlllIIII(final Object llllllllllllIlIllIIllIIIlIllIIll, final Object llllllllllllIlIllIIllIIIlIllIIlI) {
        return llllllllllllIlIllIIllIIIlIllIIll != llllllllllllIlIllIIllIIIlIllIIlI;
    }
    
    enum State
    {
        CHECK_PROTOCOL_VERSION;
        
        private static final /* synthetic */ String[] llIIIllIlIIlll;
        private static final /* synthetic */ int[] llIIIllIlIlIIl;
        
        READ_AUTH_SCHEMES;
        
        static {
            lIIIlIlIIlllIlII();
            lIIIlIlIIllIlIIl();
            final State[] $values = new State[State.llIIIllIlIlIIl[2]];
            $values[State.llIIIllIlIlIIl[0]] = State.CHECK_PROTOCOL_VERSION;
            $values[State.llIIIllIlIlIIl[1]] = State.READ_AUTH_SCHEMES;
            $VALUES = $values;
        }
        
        private static boolean lIIIlIlIIlllIlIl(final int llllllllllllIlllIlIIlIIlIlIllllI, final int llllllllllllIlllIlIIlIIlIlIlllIl) {
            return llllllllllllIlllIlIIlIIlIlIllllI < llllllllllllIlllIlIIlIIlIlIlllIl;
        }
        
        private static String lIIIlIlIIllIIlll(String llllllllllllIlllIlIIlIIlIllIlIIl, final String llllllllllllIlllIlIIlIIlIllIlIII) {
            llllllllllllIlllIlIIlIIlIllIlIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIlIIlIIlIllIllII = new StringBuilder();
            final char[] llllllllllllIlllIlIIlIIlIllIlIll = llllllllllllIlllIlIIlIIlIllIlIII.toCharArray();
            int llllllllllllIlllIlIIlIIlIllIlIlI = State.llIIIllIlIlIIl[0];
            final long llllllllllllIlllIlIIlIIlIllIIlII = (Object)llllllllllllIlllIlIIlIIlIllIlIIl.toCharArray();
            final String llllllllllllIlllIlIIlIIlIllIIIll = (String)llllllllllllIlllIlIIlIIlIllIIlII.length;
            Exception llllllllllllIlllIlIIlIIlIllIIIlI = (Exception)State.llIIIllIlIlIIl[0];
            while (lIIIlIlIIlllIlIl((int)llllllllllllIlllIlIIlIIlIllIIIlI, (int)llllllllllllIlllIlIIlIIlIllIIIll)) {
                final char llllllllllllIlllIlIIlIIlIllIllll = llllllllllllIlllIlIIlIIlIllIIlII[llllllllllllIlllIlIIlIIlIllIIIlI];
                llllllllllllIlllIlIIlIIlIllIllII.append((char)(llllllllllllIlllIlIIlIIlIllIllll ^ llllllllllllIlllIlIIlIIlIllIlIll[llllllllllllIlllIlIIlIIlIllIlIlI % llllllllllllIlllIlIIlIIlIllIlIll.length]));
                "".length();
                ++llllllllllllIlllIlIIlIIlIllIlIlI;
                ++llllllllllllIlllIlIIlIIlIllIIIlI;
                "".length();
                if ((0xE9 ^ 0x83 ^ (0x46 ^ 0x28)) < "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIlIIlIIlIllIllII);
        }
        
        private static void lIIIlIlIIlllIlII() {
            (llIIIllIlIlIIl = new int[3])[0] = ((0x3B ^ 0x72 ^ (0x14 ^ 0x40)) & (0x1A ^ 0x5C ^ (0x67 ^ 0x3C) ^ -" ".length()));
            State.llIIIllIlIlIIl[1] = " ".length();
            State.llIIIllIlIlIIl[2] = "  ".length();
        }
        
        private static void lIIIlIlIIllIlIIl() {
            (llIIIllIlIIlll = new String[State.llIIIllIlIlIIl[2]])[State.llIIIllIlIlIIl[0]] = lIIIlIlIIllIIlll("IgUwLB0+HScgAi4OOiMJNwgnPB8uAw==", "aMuoV");
            State.llIIIllIlIIlll[State.llIIIllIlIlIIl[1]] = lIIIlIlIIllIlIII("0aHsbbd+fOIl8TG71E1fBVjmfw9SVDeI", "XHCoJ");
        }
        
        private static String lIIIlIlIIllIlIII(final String llllllllllllIlllIlIIlIIlIllllllI, final String llllllllllllIlllIlIIlIIlIlllllIl) {
            try {
                final SecretKeySpec llllllllllllIlllIlIIlIIllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlIIlIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIlIIlIIllIIIIIII = Cipher.getInstance("Blowfish");
                llllllllllllIlllIlIIlIIllIIIIIII.init(State.llIIIllIlIlIIl[2], llllllllllllIlllIlIIlIIllIIIIIIl);
                return new String(llllllllllllIlllIlIIlIIllIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIIlIIlIlllllll) {
                llllllllllllIlllIlIIlIIlIlllllll.printStackTrace();
                return null;
            }
        }
    }
}
