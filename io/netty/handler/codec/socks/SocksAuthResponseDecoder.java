// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelHandler;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

public class SocksAuthResponseDecoder extends ReplayingDecoder<State>
{
    private /* synthetic */ SocksSubnegotiationVersion version;
    private /* synthetic */ SocksResponse msg;
    private static final /* synthetic */ int[] lllIIllIIIlIlI;
    private static final /* synthetic */ String[] lllIIllIIIlIIl;
    private /* synthetic */ SocksAuthStatus authStatus;
    
    public SocksAuthResponseDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
        this.msg = SocksCommonUtils.UNKNOWN_SOCKS_RESPONSE;
    }
    
    private static void lIlIIIIIIIIlllII() {
        (lllIIllIIIlIIl = new String[SocksAuthResponseDecoder.lllIIllIIIlIlI[2]])[SocksAuthResponseDecoder.lllIIllIIIlIlI[0]] = lIlIIIIIIIIllIll("JRgsOzkpFjokIikFKiM6ORk8NTUyEiw/LjMF", "vWopj");
        SocksAuthResponseDecoder.lllIIllIIIlIIl[SocksAuthResponseDecoder.lllIIllIIIlIlI[1]] = lIlIIIIIIIIllIll("ETghHh4dNjcBBR0lJwYdDTkxEBIGMiEaCQcl", "BwbUM");
    }
    
    private static void lIlIIIIIIIIlllIl() {
        (lllIIllIIIlIlI = new int[3])[0] = ((0xCB ^ 0x8A) & ~(0x50 ^ 0x11));
        SocksAuthResponseDecoder.lllIIllIIIlIlI[1] = " ".length();
        SocksAuthResponseDecoder.lllIIllIIIlIlI[2] = "  ".length();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlIllllIIIlIIIIIllIl, final ByteBuf llllllllllllIlIllllIIIlIIIIIllII, final List<Object> llllllllllllIlIllllIIIlIIIIIlIll) throws Exception {
        Label_0101: {
            switch (SocksAuthResponseDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksAuthResponseDecoder$State[this.state().ordinal()]) {
                case 1: {
                    this.version = SocksSubnegotiationVersion.valueOf(llllllllllllIlIllllIIIlIIIIIllII.readByte());
                    if (!lIlIIIIIIIllIIlI(this.version, SocksSubnegotiationVersion.AUTH_PASSWORD)) {
                        this.checkpoint(State.READ_AUTH_RESPONSE);
                        break Label_0101;
                    }
                    "".length();
                    if (" ".length() == ((0x9A ^ 0x80) & ~(0x5C ^ 0x46))) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.authStatus = SocksAuthStatus.valueOf(llllllllllllIlIllllIIIlIIIIIllII.readByte());
                    this.msg = new SocksAuthResponse(this.authStatus);
                    break;
                }
            }
        }
        llllllllllllIlIllllIIIlIIIIIllIl.pipeline().remove(this);
        "".length();
        llllllllllllIlIllllIIIlIIIIIlIll.add(this.msg);
        "".length();
    }
    
    private static boolean lIlIIIIIIIllIIlI(final Object llllllllllllIlIllllIIIIllllIlIII, final Object llllllllllllIlIllllIIIIllllIIlll) {
        return llllllllllllIlIllllIIIIllllIlIII != llllllllllllIlIllllIIIIllllIIlll;
    }
    
    private static boolean lIlIIIIIIIllIIll(final int llllllllllllIlIllllIIIIllllIllII, final int llllllllllllIlIllllIIIIllllIlIll) {
        return llllllllllllIlIllllIIIIllllIllII < llllllllllllIlIllllIIIIllllIlIll;
    }
    
    private static String lIlIIIIIIIIllIll(String llllllllllllIlIllllIIIIlllllIlll, final String llllllllllllIlIllllIIIIllllllIll) {
        llllllllllllIlIllllIIIIlllllIlll = new String(Base64.getDecoder().decode(llllllllllllIlIllllIIIIlllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIIIIllllllIlI = new StringBuilder();
        final char[] llllllllllllIlIllllIIIIllllllIIl = llllllllllllIlIllllIIIIllllllIll.toCharArray();
        int llllllllllllIlIllllIIIIllllllIII = SocksAuthResponseDecoder.lllIIllIIIlIlI[0];
        final float llllllllllllIlIllllIIIIlllllIIlI = (Object)llllllllllllIlIllllIIIIlllllIlll.toCharArray();
        final char llllllllllllIlIllllIIIIlllllIIIl = (char)llllllllllllIlIllllIIIIlllllIIlI.length;
        byte llllllllllllIlIllllIIIIlllllIIII = (byte)SocksAuthResponseDecoder.lllIIllIIIlIlI[0];
        while (lIlIIIIIIIllIIll(llllllllllllIlIllllIIIIlllllIIII, llllllllllllIlIllllIIIIlllllIIIl)) {
            final char llllllllllllIlIllllIIIIlllllllIl = llllllllllllIlIllllIIIIlllllIIlI[llllllllllllIlIllllIIIIlllllIIII];
            llllllllllllIlIllllIIIIllllllIlI.append((char)(llllllllllllIlIllllIIIIlllllllIl ^ llllllllllllIlIllllIIIIllllllIIl[llllllllllllIlIllllIIIIllllllIII % llllllllllllIlIllllIIIIllllllIIl.length]));
            "".length();
            ++llllllllllllIlIllllIIIIllllllIII;
            ++llllllllllllIlIllllIIIIlllllIIII;
            "".length();
            if ((0xCD ^ 0xB1 ^ (0x56 ^ 0x2F)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIIIIllllllIlI);
    }
    
    static {
        lIlIIIIIIIIlllIl();
        lIlIIIIIIIIlllII();
        name = SocksAuthResponseDecoder.lllIIllIIIlIIl[SocksAuthResponseDecoder.lllIIllIIIlIlI[1]];
    }
    
    @Deprecated
    public static String getName() {
        return SocksAuthResponseDecoder.lllIIllIIIlIIl[SocksAuthResponseDecoder.lllIIllIIIlIlI[0]];
    }
    
    enum State
    {
        private static final /* synthetic */ int[] llIlIIIlIlllII;
        
        READ_AUTH_RESPONSE, 
        CHECK_PROTOCOL_VERSION;
        
        private static final /* synthetic */ String[] llIlIIIlIllIlI;
        
        private static String lIIlIIIlllllIllI(final String llllllllllllIllIllIIllIllIIlIlII, final String llllllllllllIllIllIIllIllIIlIlIl) {
            try {
                final SecretKeySpec llllllllllllIllIllIIllIllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllIIllIllIIllIII = Cipher.getInstance("Blowfish");
                llllllllllllIllIllIIllIllIIllIII.init(State.llIlIIIlIlllII[2], llllllllllllIllIllIIllIllIIllIIl);
                return new String(llllllllllllIllIllIIllIllIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIllIllIIlIlll) {
                llllllllllllIllIllIIllIllIIlIlll.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIlIIIlllllllll();
            lIIlIIIlllllIlll();
            final State[] $values = new State[State.llIlIIIlIlllII[2]];
            $values[State.llIlIIIlIlllII[0]] = State.CHECK_PROTOCOL_VERSION;
            $values[State.llIlIIIlIlllII[1]] = State.READ_AUTH_RESPONSE;
            $VALUES = $values;
        }
        
        private static boolean lIIlIIlIIIIIIIII(final int llllllllllllIllIllIIllIlIlllIllI, final int llllllllllllIllIllIIllIlIlllIlIl) {
            return llllllllllllIllIllIIllIlIlllIllI < llllllllllllIllIllIIllIlIlllIlIl;
        }
        
        private static void lIIlIIIlllllIlll() {
            (llIlIIIlIllIlI = new String[State.llIlIIIlIlllII[2]])[State.llIlIIIlIlllII[0]] = lIIlIIIlllllIlIl("FRIJCR4JCh4FARkZAwYKAB8eGRwZFA==", "VZLJU");
            State.llIlIIIlIllIlI[State.llIlIIIlIlllII[1]] = lIIlIIIlllllIllI("YJgGi7Bgp496JB8NpDS2h+0lK2ZGy9pi", "rYsAA");
        }
        
        private static String lIIlIIIlllllIlIl(String llllllllllllIllIllIIllIllIIIIIIl, final String llllllllllllIllIllIIllIllIIIIlIl) {
            llllllllllllIllIllIIllIllIIIIIIl = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIIllIllIIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllIIllIllIIIIlII = new StringBuilder();
            final char[] llllllllllllIllIllIIllIllIIIIIll = llllllllllllIllIllIIllIllIIIIlIl.toCharArray();
            int llllllllllllIllIllIIllIllIIIIIlI = State.llIlIIIlIlllII[0];
            final short llllllllllllIllIllIIllIlIlllllII = (Object)((String)llllllllllllIllIllIIllIllIIIIIIl).toCharArray();
            final String llllllllllllIllIllIIllIlIllllIll = (String)llllllllllllIllIllIIllIlIlllllII.length;
            Exception llllllllllllIllIllIIllIlIllllIlI = (Exception)State.llIlIIIlIlllII[0];
            while (lIIlIIlIIIIIIIII((int)llllllllllllIllIllIIllIlIllllIlI, (int)llllllllllllIllIllIIllIlIllllIll)) {
                final char llllllllllllIllIllIIllIllIIIIlll = llllllllllllIllIllIIllIlIlllllII[llllllllllllIllIllIIllIlIllllIlI];
                llllllllllllIllIllIIllIllIIIIlII.append((char)(llllllllllllIllIllIIllIllIIIIlll ^ llllllllllllIllIllIIllIllIIIIIll[llllllllllllIllIllIIllIllIIIIIlI % llllllllllllIllIllIIllIllIIIIIll.length]));
                "".length();
                ++llllllllllllIllIllIIllIllIIIIIlI;
                ++llllllllllllIllIllIIllIlIllllIlI;
                "".length();
                if ("   ".length() < "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllIIllIllIIIIlII);
        }
        
        private static void lIIlIIIlllllllll() {
            (llIlIIIlIlllII = new int[3])[0] = ((0x63 ^ 0x5B) & ~(0x52 ^ 0x6A));
            State.llIlIIIlIlllII[1] = " ".length();
            State.llIlIIIlIlllII[2] = "  ".length();
        }
    }
}
