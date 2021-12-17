// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt.nio;

import com.barchart.udt.nio.ChannelUDT;
import com.barchart.udt.SocketUDT;
import io.netty.channel.Channel;
import java.util.Arrays;
import com.barchart.udt.nio.ServerSocketChannelUDT;
import com.barchart.udt.nio.SocketChannelUDT;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import io.netty.channel.ChannelException;
import com.barchart.udt.nio.SelectorProviderUDT;
import com.barchart.udt.nio.RendezvousChannelUDT;
import com.barchart.udt.TypeUDT;
import io.netty.channel.udt.UdtServerChannel;
import java.nio.channels.spi.SelectorProvider;
import com.barchart.udt.nio.KindUDT;
import io.netty.bootstrap.ChannelFactory;
import io.netty.channel.udt.UdtChannel;

public final class NioUdtProvider<T extends UdtChannel> implements ChannelFactory<T>
{
    private final /* synthetic */ KindUDT kind;
    private final /* synthetic */ TypeUDT type;
    private static final /* synthetic */ String[] llIllIIIllllII;
    private static final /* synthetic */ int[] llIllIIIlllllI;
    
    static RendezvousChannelUDT newRendezvousChannelUDT(final TypeUDT llllllllllllIllIIlllllllIlllllII) {
        try {
            return SelectorProviderUDT.from(llllllllllllIllIIlllllllIlllllII).openRendezvousChannel();
        }
        catch (IOException llllllllllllIllIIlllllllIllllllI) {
            throw new ChannelException(NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[2]], llllllllllllIllIIlllllllIllllllI);
        }
    }
    
    private static String lIIlIllIlIIlllIl(final String llllllllllllIllIIlllllllIlIIlIIl, final String llllllllllllIllIIlllllllIlIIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIIlllllllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllllllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllllllIlIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllllllIlIIllIl.init(NioUdtProvider.llIllIIIlllllI[2], llllllllllllIllIIlllllllIlIIlllI);
            return new String(llllllllllllIllIIlllllllIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllllllIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllllllIlIIllII) {
            llllllllllllIllIIlllllllIlIIllII.printStackTrace();
            return null;
        }
    }
    
    static SocketChannelUDT newConnectorChannelUDT(final TypeUDT llllllllllllIllIIllllllllIIIIIll) {
        try {
            return SelectorProviderUDT.from(llllllllllllIllIIllllllllIIIIIll).openSocketChannel();
        }
        catch (IOException llllllllllllIllIIllllllllIIIIlII) {
            throw new ChannelException(NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[1]], llllllllllllIllIIllllllllIIIIlII);
        }
    }
    
    static ServerSocketChannelUDT newAcceptorChannelUDT(final TypeUDT llllllllllllIllIIllllllllIIIlIIl) {
        try {
            return SelectorProviderUDT.from(llllllllllllIllIIllllllllIIIlIIl).openServerSocketChannel();
        }
        catch (IOException llllllllllllIllIIllllllllIIIlIlI) {
            throw new ChannelException(NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[0]], llllllllllllIllIIllllllllIIIlIlI);
        }
    }
    
    private static void lIIlIllIlIIllllI() {
        (llIllIIIllllII = new String[NioUdtProvider.llIllIIIlllllI[7]])[NioUdtProvider.llIllIIIlllllI[0]] = lIIlIllIlIIllIll("a7AlnbG/4QZca1gdx+DV8QwBe64ivg75V9VR4vGfrsdb4wUfSA7DMg==", "ooyyG");
        NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[1]] = lIIlIllIlIIlllII("DzIbBi8NcwYFagYjFwRqCHMBBSkCNgZKKQEyHAQvBQ==", "iSrjJ");
        NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[2]] = lIIlIllIlIIlllIl("fmxJynlz+Oa9lJJNJkLEuqxji08kYdglVKeH4eGt8SSZ8klal6zojw==", "ReUKe");
        NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[3]] = lIIlIllIlIIlllIl("/DVpMlmItnxcyeOuRxt8AA==", "KrcYR");
        NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[4]] = lIIlIllIlIIlllII("FQgcOC5CDgomLF8=", "bzsVI");
        NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[5]] = lIIlIllIlIIlllIl("0mO4dPOqw1EhdgXWBX2nvg==", "MwHnP");
        NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[6]] = lIIlIllIlIIlllIl("8Z20mPpiIFFTbvSYrFHNSA==", "yACDI");
    }
    
    private static void lIIlIllIlIlIIlII() {
        (llIllIIIlllllI = new int[9])[0] = ((0x25 ^ 0x2B) & ~(0x27 ^ 0x29));
        NioUdtProvider.llIllIIIlllllI[1] = " ".length();
        NioUdtProvider.llIllIIIlllllI[2] = "  ".length();
        NioUdtProvider.llIllIIIlllllI[3] = "   ".length();
        NioUdtProvider.llIllIIIlllllI[4] = (167 + 157 - 159 + 4 ^ 32 + 94 - 16 + 63);
        NioUdtProvider.llIllIIIlllllI[5] = (0x4F ^ 0x5F ^ (0xA1 ^ 0xB4));
        NioUdtProvider.llIllIIIlllllI[6] = (0x3E ^ 0x38);
        NioUdtProvider.llIllIIIlllllI[7] = (0xB9 ^ 0xA3 ^ (0x1D ^ 0x0));
        NioUdtProvider.llIllIIIlllllI[8] = (0x77 ^ 0x7F);
    }
    
    static {
        lIIlIllIlIlIIlII();
        lIIlIllIlIIllllI();
        BYTE_ACCEPTOR = new NioUdtProvider<UdtServerChannel>(TypeUDT.STREAM, KindUDT.ACCEPTOR);
        BYTE_CONNECTOR = new NioUdtProvider<UdtChannel>(TypeUDT.STREAM, KindUDT.CONNECTOR);
        BYTE_PROVIDER = (SelectorProvider)SelectorProviderUDT.STREAM;
        BYTE_RENDEZVOUS = new NioUdtProvider<UdtChannel>(TypeUDT.STREAM, KindUDT.RENDEZVOUS);
        MESSAGE_ACCEPTOR = new NioUdtProvider<UdtServerChannel>(TypeUDT.DATAGRAM, KindUDT.ACCEPTOR);
        MESSAGE_CONNECTOR = new NioUdtProvider<UdtChannel>(TypeUDT.DATAGRAM, KindUDT.CONNECTOR);
        MESSAGE_PROVIDER = (SelectorProvider)SelectorProviderUDT.DATAGRAM;
        MESSAGE_RENDEZVOUS = new NioUdtProvider<UdtChannel>(TypeUDT.DATAGRAM, KindUDT.RENDEZVOUS);
    }
    
    private static String lIIlIllIlIIllIll(final String llllllllllllIllIIlllllllIlIllIII, final String llllllllllllIllIIlllllllIlIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlllllllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllllllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), NioUdtProvider.llIllIIIlllllI[8]), "DES");
            final Cipher llllllllllllIllIIlllllllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllIllIIlllllllIlIllIlI.init(NioUdtProvider.llIllIIIlllllI[2], llllllllllllIllIIlllllllIlIllIll);
            return new String(llllllllllllIllIIlllllllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllllllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllllllIlIllIIl) {
            llllllllllllIllIIlllllllIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    public static SocketUDT socketUDT(final Channel llllllllllllIllIIlllllllIlllIllI) {
        final ChannelUDT llllllllllllIllIIlllllllIlllIlll = channelUDT(llllllllllllIllIIlllllllIlllIllI);
        if (lIIlIllIlIlIIllI(llllllllllllIllIIlllllllIlllIlll)) {
            return null;
        }
        return llllllllllllIllIIlllllllIlllIlll.socketUDT();
    }
    
    private static boolean lIIlIllIlIlIIllI(final Object llllllllllllIllIIlllllllIIlIlIII) {
        return llllllllllllIllIIlllllllIIlIlIII == null;
    }
    
    @Override
    public T newChannel() {
        switch (NioUdtProvider$1.$SwitchMap$com$barchart$udt$nio$KindUDT[this.kind.ordinal()]) {
            case 1: {
                switch (NioUdtProvider$1.$SwitchMap$com$barchart$udt$TypeUDT[this.type.ordinal()]) {
                    case 1: {
                        return (T)new NioUdtMessageAcceptorChannel();
                    }
                    case 2: {
                        return (T)new NioUdtByteAcceptorChannel();
                    }
                    default: {
                        throw new IllegalStateException(String.valueOf(new StringBuilder().append(NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[3]]).append(this.type)));
                    }
                }
                break;
            }
            case 2: {
                switch (NioUdtProvider$1.$SwitchMap$com$barchart$udt$TypeUDT[this.type.ordinal()]) {
                    case 1: {
                        return (T)new NioUdtMessageConnectorChannel();
                    }
                    case 2: {
                        return (T)new NioUdtByteConnectorChannel();
                    }
                    default: {
                        throw new IllegalStateException(String.valueOf(new StringBuilder().append(NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[4]]).append(this.type)));
                    }
                }
                break;
            }
            case 3: {
                switch (NioUdtProvider$1.$SwitchMap$com$barchart$udt$TypeUDT[this.type.ordinal()]) {
                    case 1: {
                        return (T)new NioUdtMessageRendezvousChannel();
                    }
                    case 2: {
                        return (T)new NioUdtByteRendezvousChannel();
                    }
                    default: {
                        throw new IllegalStateException(String.valueOf(new StringBuilder().append(NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[5]]).append(this.type)));
                    }
                }
                break;
            }
            default: {
                throw new IllegalStateException(String.valueOf(new StringBuilder().append(NioUdtProvider.llIllIIIllllII[NioUdtProvider.llIllIIIlllllI[6]]).append(this.kind)));
            }
        }
    }
    
    private static boolean lIIlIllIlIlIIlll(final int llllllllllllIllIIlllllllIIlIlIll, final int llllllllllllIllIIlllllllIIlIlIlI) {
        return llllllllllllIllIIlllllllIIlIlIll < llllllllllllIllIIlllllllIIlIlIlI;
    }
    
    public TypeUDT type() {
        return this.type;
    }
    
    private static String lIIlIllIlIIlllII(String llllllllllllIllIIlllllllIIllIllI, final String llllllllllllIllIIlllllllIIlllIlI) {
        llllllllllllIllIIlllllllIIllIllI = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlllllllIIllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlllllllIIlllIIl = new StringBuilder();
        final char[] llllllllllllIllIIlllllllIIlllIII = llllllllllllIllIIlllllllIIlllIlI.toCharArray();
        int llllllllllllIllIIlllllllIIllIlll = NioUdtProvider.llIllIIIlllllI[0];
        final int llllllllllllIllIIlllllllIIllIIIl = (Object)((String)llllllllllllIllIIlllllllIIllIllI).toCharArray();
        final String llllllllllllIllIIlllllllIIllIIII = (String)llllllllllllIllIIlllllllIIllIIIl.length;
        short llllllllllllIllIIlllllllIIlIllll = (short)NioUdtProvider.llIllIIIlllllI[0];
        while (lIIlIllIlIlIIlll(llllllllllllIllIIlllllllIIlIllll, (int)llllllllllllIllIIlllllllIIllIIII)) {
            final char llllllllllllIllIIlllllllIIllllII = llllllllllllIllIIlllllllIIllIIIl[llllllllllllIllIIlllllllIIlIllll];
            llllllllllllIllIIlllllllIIlllIIl.append((char)(llllllllllllIllIIlllllllIIllllII ^ llllllllllllIllIIlllllllIIlllIII[llllllllllllIllIIlllllllIIllIlll % llllllllllllIllIIlllllllIIlllIII.length]));
            "".length();
            ++llllllllllllIllIIlllllllIIllIlll;
            ++llllllllllllIllIIlllllllIIlIllll;
            "".length();
            if (((0x48 ^ 0x53) & ~(0x68 ^ 0x73)) != ((0x2 ^ 0x4A) & ~(0xEB ^ 0xA3))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlllllllIIlllIIl);
    }
    
    private static boolean lIIlIllIlIlIIlIl(final int llllllllllllIllIIlllllllIIlIIllI) {
        return llllllllllllIllIIlllllllIIlIIllI != 0;
    }
    
    public KindUDT kind() {
        return this.kind;
    }
    
    private NioUdtProvider(final TypeUDT llllllllllllIllIIlllllllIllIllIl, final KindUDT llllllllllllIllIIlllllllIllIllII) {
        this.type = llllllllllllIllIIlllllllIllIllIl;
        this.kind = llllllllllllIllIIlllllllIllIllII;
    }
    
    public static ChannelUDT channelUDT(final Channel llllllllllllIllIIllllllllIIIllIl) {
        if (lIIlIllIlIlIIlIl((llllllllllllIllIIllllllllIIIllIl instanceof NioUdtByteAcceptorChannel) ? 1 : 0)) {
            return (ChannelUDT)((NioUdtByteAcceptorChannel)llllllllllllIllIIllllllllIIIllIl).javaChannel();
        }
        if (lIIlIllIlIlIIlIl((llllllllllllIllIIllllllllIIIllIl instanceof NioUdtByteConnectorChannel) ? 1 : 0)) {
            return (ChannelUDT)((NioUdtByteConnectorChannel)llllllllllllIllIIllllllllIIIllIl).javaChannel();
        }
        if (lIIlIllIlIlIIlIl((llllllllllllIllIIllllllllIIIllIl instanceof NioUdtByteRendezvousChannel) ? 1 : 0)) {
            return (ChannelUDT)((NioUdtByteRendezvousChannel)llllllllllllIllIIllllllllIIIllIl).javaChannel();
        }
        if (lIIlIllIlIlIIlIl((llllllllllllIllIIllllllllIIIllIl instanceof NioUdtMessageAcceptorChannel) ? 1 : 0)) {
            return (ChannelUDT)((NioUdtMessageAcceptorChannel)llllllllllllIllIIllllllllIIIllIl).javaChannel();
        }
        if (lIIlIllIlIlIIlIl((llllllllllllIllIIllllllllIIIllIl instanceof NioUdtMessageConnectorChannel) ? 1 : 0)) {
            return (ChannelUDT)((NioUdtMessageConnectorChannel)llllllllllllIllIIllllllllIIIllIl).javaChannel();
        }
        if (lIIlIllIlIlIIlIl((llllllllllllIllIIllllllllIIIllIl instanceof NioUdtMessageRendezvousChannel) ? 1 : 0)) {
            return (ChannelUDT)((NioUdtMessageRendezvousChannel)llllllllllllIllIIllllllllIIIllIl).javaChannel();
        }
        return null;
    }
}
