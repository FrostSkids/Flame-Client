// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandler;
import io.netty.util.CharsetUtil;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.handler.codec.ReplayingDecoder;

public class SocksAuthRequestDecoder extends ReplayingDecoder<State>
{
    private /* synthetic */ String username;
    private static final /* synthetic */ int[] lIIllIlIlIllII;
    private /* synthetic */ String password;
    private /* synthetic */ SocksSubnegotiationVersion version;
    private /* synthetic */ int fieldLength;
    private static final /* synthetic */ String[] lIIllIlIlIlIlI;
    private /* synthetic */ SocksRequest msg;
    
    private static String llIllIIIlllllII(String lllllllllllllIIlIlIlIlIIIlIlIIIl, final String lllllllllllllIIlIlIlIlIIIlIlIIII) {
        lllllllllllllIIlIlIlIlIIIlIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIlIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlIlIIIlIlIlII = new StringBuilder();
        final char[] lllllllllllllIIlIlIlIlIIIlIlIIll = lllllllllllllIIlIlIlIlIIIlIlIIII.toCharArray();
        int lllllllllllllIIlIlIlIlIIIlIlIIlI = SocksAuthRequestDecoder.lIIllIlIlIllII[0];
        final float lllllllllllllIIlIlIlIlIIIlIIllII = (Object)lllllllllllllIIlIlIlIlIIIlIlIIIl.toCharArray();
        final String lllllllllllllIIlIlIlIlIIIlIIlIll = (String)lllllllllllllIIlIlIlIlIIIlIIllII.length;
        byte lllllllllllllIIlIlIlIlIIIlIIlIlI = (byte)SocksAuthRequestDecoder.lIIllIlIlIllII[0];
        while (llIllIIlIIIIIll(lllllllllllllIIlIlIlIlIIIlIIlIlI, (int)lllllllllllllIIlIlIlIlIIIlIIlIll)) {
            final char lllllllllllllIIlIlIlIlIIIlIlIlll = lllllllllllllIIlIlIlIlIIIlIIllII[lllllllllllllIIlIlIlIlIIIlIIlIlI];
            lllllllllllllIIlIlIlIlIIIlIlIlII.append((char)(lllllllllllllIIlIlIlIlIIIlIlIlll ^ lllllllllllllIIlIlIlIlIIIlIlIIll[lllllllllllllIIlIlIlIlIIIlIlIIlI % lllllllllllllIIlIlIlIlIIIlIlIIll.length]));
            "".length();
            ++lllllllllllllIIlIlIlIlIIIlIlIIlI;
            ++lllllllllllllIIlIlIlIlIIIlIIlIlI;
            "".length();
            if (((0xB4 ^ 0xB1) & ~(0x5 ^ 0x0)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlIlIIIlIlIlII);
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIlIlIlIlIIIlllIIII, final ByteBuf lllllllllllllIIlIlIlIlIIIllIllll, final List<Object> lllllllllllllIIlIlIlIlIIIllIlllI) throws Exception {
        Label_0131: {
            switch (SocksAuthRequestDecoder$1.$SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State[this.state().ordinal()]) {
                case 1: {
                    this.version = SocksSubnegotiationVersion.valueOf(lllllllllllllIIlIlIlIlIIIllIllll.readByte());
                    if (!llIllIIlIIIIIlI(this.version, SocksSubnegotiationVersion.AUTH_PASSWORD)) {
                        this.checkpoint(State.READ_USERNAME);
                        break Label_0131;
                    }
                    "".length();
                    if ("  ".length() == ((160 + 35 - 81 + 94 ^ 81 + 85 - 91 + 120) & (0xA1 ^ 0x9F ^ (0x21 ^ 0xC) ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.fieldLength = lllllllllllllIIlIlIlIlIIIllIllll.readByte();
                    this.username = lllllllllllllIIlIlIlIlIIIllIllll.readBytes(this.fieldLength).toString(CharsetUtil.US_ASCII);
                    this.checkpoint(State.READ_PASSWORD);
                }
                case 3: {
                    this.fieldLength = lllllllllllllIIlIlIlIlIIIllIllll.readByte();
                    this.password = lllllllllllllIIlIlIlIlIIIllIllll.readBytes(this.fieldLength).toString(CharsetUtil.US_ASCII);
                    this.msg = new SocksAuthRequest(this.username, this.password);
                    break;
                }
            }
        }
        lllllllllllllIIlIlIlIlIIIlllIIII.pipeline().remove(this);
        "".length();
        lllllllllllllIIlIlIlIlIIIllIlllI.add(this.msg);
        "".length();
    }
    
    private static boolean llIllIIlIIIIIll(final int lllllllllllllIIlIlIlIlIIIlIIIllI, final int lllllllllllllIIlIlIlIlIIIlIIIlIl) {
        return lllllllllllllIIlIlIlIlIIIlIIIllI < lllllllllllllIIlIlIlIlIIIlIIIlIl;
    }
    
    private static void llIllIIIlllllIl() {
        (lIIllIlIlIlIlI = new String[SocksAuthRequestDecoder.lIIllIlIlIllII[2]])[SocksAuthRequestDecoder.lIIllIlIlIllII[0]] = llIllIIIllllIll("N4sZmiHPehjP4L1+fIY3gO76+bjNbms3AOHnzD/rOvM=", "eGKeV");
        SocksAuthRequestDecoder.lIIllIlIlIlIlI[SocksAuthRequestDecoder.lIIllIlIlIllII[1]] = llIllIIIlllllII("GSY1BD8VKCMbJBU7Mx45DzoiECgPKjkLKRg=", "JivOl");
    }
    
    private static void llIllIIlIIIIIIl() {
        (lIIllIlIlIllII = new int[4])[0] = ((0x1A ^ 0x3F) & ~(0x46 ^ 0x63));
        SocksAuthRequestDecoder.lIIllIlIlIllII[1] = " ".length();
        SocksAuthRequestDecoder.lIIllIlIlIllII[2] = "  ".length();
        SocksAuthRequestDecoder.lIIllIlIlIllII[3] = (0x60 ^ 0x68);
    }
    
    private static String llIllIIIllllIll(final String lllllllllllllIIlIlIlIlIIIllIIllI, final String lllllllllllllIIlIlIlIlIIIllIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIlIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIlIIIllIIIll.getBytes(StandardCharsets.UTF_8)), SocksAuthRequestDecoder.lIIllIlIlIllII[3]), "DES");
            final Cipher lllllllllllllIIlIlIlIlIIIllIlIII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIlIlIIIllIlIII.init(SocksAuthRequestDecoder.lIIllIlIlIllII[2], lllllllllllllIIlIlIlIlIIIllIlIIl);
            return new String(lllllllllllllIIlIlIlIlIIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIlIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIlIIIllIIlll) {
            lllllllllllllIIlIlIlIlIIIllIIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIllIIlIIIIIIl();
        llIllIIIlllllIl();
        name = SocksAuthRequestDecoder.lIIllIlIlIlIlI[SocksAuthRequestDecoder.lIIllIlIlIllII[1]];
    }
    
    @Deprecated
    public static String getName() {
        return SocksAuthRequestDecoder.lIIllIlIlIlIlI[SocksAuthRequestDecoder.lIIllIlIlIllII[0]];
    }
    
    private static boolean llIllIIlIIIIIlI(final Object lllllllllllllIIlIlIlIlIIIlIIIIlI, final Object lllllllllllllIIlIlIlIlIIIlIIIIIl) {
        return lllllllllllllIIlIlIlIlIIIlIIIIlI != lllllllllllllIIlIlIlIlIIIlIIIIIl;
    }
    
    public SocksAuthRequestDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
        this.msg = SocksCommonUtils.UNKNOWN_SOCKS_REQUEST;
    }
    
    enum State
    {
        private static final /* synthetic */ int[] lIIlIIIIIllllI;
        
        CHECK_PROTOCOL_VERSION, 
        READ_USERNAME;
        
        private static final /* synthetic */ String[] lIIlIIIIIlllIl;
        
        READ_PASSWORD;
        
        private static String llIIlIIlIlIIlII(String lllllllllllllIIlllIlllIIlllIIlIl, final String lllllllllllllIIlllIlllIIlllIlIIl) {
            lllllllllllllIIlllIlllIIlllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlllIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlllIlllIIlllIlIII = new StringBuilder();
            final char[] lllllllllllllIIlllIlllIIlllIIlll = lllllllllllllIIlllIlllIIlllIlIIl.toCharArray();
            int lllllllllllllIIlllIlllIIlllIIllI = State.lIIlIIIIIllllI[0];
            final float lllllllllllllIIlllIlllIIlllIIIII = (Object)lllllllllllllIIlllIlllIIlllIIlIl.toCharArray();
            final Exception lllllllllllllIIlllIlllIIllIlllll = (Exception)lllllllllllllIIlllIlllIIlllIIIII.length;
            String lllllllllllllIIlllIlllIIllIllllI = (String)State.lIIlIIIIIllllI[0];
            while (llIIlIIlIlIIlll((int)lllllllllllllIIlllIlllIIllIllllI, (int)lllllllllllllIIlllIlllIIllIlllll)) {
                final char lllllllllllllIIlllIlllIIlllIlIll = lllllllllllllIIlllIlllIIlllIIIII[lllllllllllllIIlllIlllIIllIllllI];
                lllllllllllllIIlllIlllIIlllIlIII.append((char)(lllllllllllllIIlllIlllIIlllIlIll ^ lllllllllllllIIlllIlllIIlllIIlll[lllllllllllllIIlllIlllIIlllIIllI % lllllllllllllIIlllIlllIIlllIIlll.length]));
                "".length();
                ++lllllllllllllIIlllIlllIIlllIIllI;
                ++lllllllllllllIIlllIlllIIllIllllI;
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlllIlllIIlllIlIII);
        }
        
        private static void llIIlIIlIlIIllI() {
            (lIIlIIIIIllllI = new int[5])[0] = ((0x2D ^ 0x15 ^ (0x1B ^ 0x11)) & (0x7C ^ 0x1 ^ (0xC5 ^ 0x8A) ^ -" ".length()));
            State.lIIlIIIIIllllI[1] = " ".length();
            State.lIIlIIIIIllllI[2] = "  ".length();
            State.lIIlIIIIIllllI[3] = "   ".length();
            State.lIIlIIIIIllllI[4] = (85 + 54 - 93 + 85 ^ 99 + 46 - 138 + 132);
        }
        
        static {
            llIIlIIlIlIIllI();
            llIIlIIlIlIIlIl();
            final State[] $values = new State[State.lIIlIIIIIllllI[3]];
            $values[State.lIIlIIIIIllllI[0]] = State.CHECK_PROTOCOL_VERSION;
            $values[State.lIIlIIIIIllllI[1]] = State.READ_USERNAME;
            $values[State.lIIlIIIIIllllI[2]] = State.READ_PASSWORD;
            $VALUES = $values;
        }
        
        private static String llIIlIIlIlIIIll(final String lllllllllllllIIlllIlllIIllIIlIII, final String lllllllllllllIIlllIlllIIllIIIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIlllIlllIIllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlllIlllIIllIIlIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlllIlllIIllIIlIlI.init(State.lIIlIIIIIllllI[2], lllllllllllllIIlllIlllIIllIIlIll);
                return new String(lllllllllllllIIlllIlllIIllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlllIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllIlllIIllIIlIIl) {
                lllllllllllllIIlllIlllIIllIIlIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIIlIIlIlIIlll(final int lllllllllllllIIlllIlllIIllIIIIII, final int lllllllllllllIIlllIlllIIlIllllll) {
            return lllllllllllllIIlllIlllIIllIIIIII < lllllllllllllIIlllIlllIIlIllllll;
        }
        
        private static String llIIlIIlIlIIIlI(final String lllllllllllllIIlllIlllIIllIlIlIl, final String lllllllllllllIIlllIlllIIllIlIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlllIlllIIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllIIllIlIIlI.getBytes(StandardCharsets.UTF_8)), State.lIIlIIIIIllllI[4]), "DES");
                final Cipher lllllllllllllIIlllIlllIIllIlIlll = Cipher.getInstance("DES");
                lllllllllllllIIlllIlllIIllIlIlll.init(State.lIIlIIIIIllllI[2], lllllllllllllIIlllIlllIIllIllIII);
                return new String(lllllllllllllIIlllIlllIIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlllIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllIlllIIllIlIllI) {
                lllllllllllllIIlllIlllIIllIlIllI.printStackTrace();
                return null;
            }
        }
        
        private static void llIIlIIlIlIIlIl() {
            (lIIlIIIIIlllIl = new String[State.lIIlIIIIIllllI[3]])[State.lIIlIIIIIllllI[0]] = llIIlIIlIlIIIlI("7Zo4UYlrxcECRlQxAyo2pP8Yr5YwlS2a", "rklZl");
            State.lIIlIIIIIlllIl[State.lIIlIIIIIllllI[1]] = llIIlIIlIlIIIll("VrN4PIqJzhl7nXFbSyVi2g==", "CoBKc");
            State.lIIlIIIIIlllIl[State.lIIlIIIIIllllI[2]] = llIIlIIlIlIIlII("Nwc7ICo1Ayk3IioQPg==", "eBzdu");
        }
    }
}
