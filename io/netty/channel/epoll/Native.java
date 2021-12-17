// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import io.netty.channel.DefaultFileRegion;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import java.net.Inet6Address;
import java.net.InetAddress;
import io.netty.util.internal.NativeLibraryLoader;
import io.netty.util.internal.PlatformDependent;
import java.util.Locale;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.channel.ChannelException;
import java.io.IOException;
import java.net.InetSocketAddress;

final class Native
{
    private static final /* synthetic */ byte[] IPV4_MAPPED_IPV6_PREFIX;
    private static final /* synthetic */ String[] llIllllIllIIII;
    private static final /* synthetic */ int[] llIllllIllIIIl;
    
    private static void lIIllIlIlIlllllI() {
        (llIllllIllIIIl = new int[15])[0] = ((0x97 ^ 0xBE) & ~(0x8B ^ 0xA2));
        Native.llIllllIllIIIl[1] = (0x50 ^ 0x66 ^ (0x70 ^ 0x56));
        Native.llIllllIllIIIl[2] = (64 + 169 - 170 + 110 ^ 46 + 32 - 47 + 130);
        Native.llIllllIllIIIl[3] = " ".length();
        Native.llIllllIllIIIl[4] = "  ".length();
        Native.llIllllIllIIIl[5] = (0x89 ^ 0x81);
        Native.llIllllIllIIIl[6] = (0x94 ^ 0x90);
        Native.llIllllIllIIIl[7] = "   ".length();
        Native.llIllllIllIIIl[8] = (0x7E ^ 0x11 ^ (0x6C ^ 0x6));
        Native.llIllllIllIIIl[9] = (0x72 ^ 0x13 ^ (0xE ^ 0x69));
        Native.llIllllIllIIIl[10] = (0x69 ^ 0x6E);
        Native.llIllllIllIIIl[11] = (0x48 ^ 0x38 ^ (0x65 ^ 0x1C));
        Native.llIllllIllIIIl[12] = (0x85 ^ 0x8F);
        Native.llIllllIllIIIl[13] = -" ".length();
        Native.llIllllIllIIIl[14] = (0x46 ^ 0x4D);
    }
    
    public static int socketStreamFd() {
        try {
            return socketStream();
        }
        catch (IOException llllllllllllIllIIIllIlIlIlllIIII) {
            throw new ChannelException(llllllllllllIllIIIllIlIlIlllIIII);
        }
    }
    
    static {
        lIIllIlIlIlllllI();
        lIIllIlIlIllllIl();
        EPOLLIN = Native.llIllllIllIIIl[3];
        EPOLLOUT = Native.llIllllIllIIIl[4];
        EPOLLRDHUP = Native.llIllllIllIIIl[5];
        EPOLLACCEPT = Native.llIllllIllIIIl[6];
        final byte[] ipv4_MAPPED_IPV6_PREFIX = new byte[Native.llIllllIllIIIl[2]];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[0]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[3]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[4]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[7]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[6]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[8]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[9]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[10]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[5]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[11]] = (byte)Native.llIllllIllIIIl[0];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[12]] = (byte)Native.llIllllIllIIIl[13];
        ipv4_MAPPED_IPV6_PREFIX[Native.llIllllIllIIIl[14]] = (byte)Native.llIllllIllIIIl[13];
        IPV4_MAPPED_IPV6_PREFIX = ipv4_MAPPED_IPV6_PREFIX;
        final String llllllllllllIllIIIllIlIlIlIIIIll = SystemPropertyUtil.get(Native.llIllllIllIIII[Native.llIllllIllIIIl[0]]).toLowerCase(Locale.UK).trim();
        if (lIIllIlIllIIIIII(llllllllllllIllIIIllIlIlIlIIIIll.startsWith(Native.llIllllIllIIII[Native.llIllllIllIIIl[3]]) ? 1 : 0)) {
            throw new IllegalStateException(Native.llIllllIllIIII[Native.llIllllIllIIIl[4]]);
        }
        NativeLibraryLoader.load(Native.llIllllIllIIII[Native.llIllllIllIIIl[7]], PlatformDependent.getClassLoader(Native.class));
        IOV_MAX = iovMax();
    }
    
    private static boolean lIIllIlIlIllllll(final int llllllllllllIllIIIllIlIlIIllIIll) {
        return llllllllllllIllIIIllIlIlIIllIIll != 0;
    }
    
    public static void bind(final int llllllllllllIllIIIllIlIlIllIIlll, final InetAddress llllllllllllIllIIIllIlIlIllIIIlI, final int llllllllllllIllIIIllIlIlIllIIIIl) throws IOException {
        final NativeInetAddress llllllllllllIllIIIllIlIlIllIIlII = toNativeInetAddress(llllllllllllIllIIIllIlIlIllIIIlI);
        bind(llllllllllllIllIIIllIlIlIllIIlll, llllllllllllIllIIIllIlIlIllIIlII.address, llllllllllllIllIIIllIlIlIllIIlII.scopeId, llllllllllllIllIIIllIlIlIllIIIIl);
    }
    
    private static NativeInetAddress toNativeInetAddress(final InetAddress llllllllllllIllIIIllIlIlIlIIlIll) {
        final byte[] llllllllllllIllIIIllIlIlIlIIlIlI = llllllllllllIllIIIllIlIlIlIIlIll.getAddress();
        if (lIIllIlIlIllllll((llllllllllllIllIIIllIlIlIlIIlIll instanceof Inet6Address) ? 1 : 0)) {
            return new NativeInetAddress(llllllllllllIllIIIllIlIlIlIIlIlI, ((Inet6Address)llllllllllllIllIIIllIlIlIlIIlIll).getScopeId());
        }
        return new NativeInetAddress(ipv4MappedIpv6Address(llllllllllllIllIIIllIlIlIlIIlIlI));
    }
    
    public static int sendToAddress(final int llllllllllllIllIIIllIlIllIIIIIIl, final long llllllllllllIllIIIllIlIllIIIIIII, final int llllllllllllIllIIIllIlIlIlllIlll, final int llllllllllllIllIIIllIlIlIlllIllI, final InetAddress llllllllllllIllIIIllIlIlIlllIlIl, final int llllllllllllIllIIIllIlIlIlllllII) throws IOException {
        int llllllllllllIllIIIllIlIlIllllIlI = 0;
        byte[] llllllllllllIllIIIllIlIlIllllIll = null;
        if (lIIllIlIlIllllll((llllllllllllIllIIIllIlIlIlllIlIl instanceof Inet6Address) ? 1 : 0)) {
            final byte[] llllllllllllIllIIIllIlIllIIIIIll = llllllllllllIllIIIllIlIlIlllIlIl.getAddress();
            final int llllllllllllIllIIIllIlIllIIIIIlI = ((Inet6Address)llllllllllllIllIIIllIlIlIlllIlIl).getScopeId();
            "".length();
            if ((0x47 ^ 0x43) <= 0) {
                return (0xF4 ^ 0xB9) & ~(0x41 ^ 0xC);
            }
        }
        else {
            llllllllllllIllIIIllIlIlIllllIlI = Native.llIllllIllIIIl[0];
            llllllllllllIllIIIllIlIlIllllIll = ipv4MappedIpv6Address(llllllllllllIllIIIllIlIlIlllIlIl.getAddress());
        }
        return sendToAddress(llllllllllllIllIIIllIlIllIIIIIIl, llllllllllllIllIIIllIlIllIIIIIII, llllllllllllIllIIIllIlIlIlllIlll, llllllllllllIllIIIllIlIlIlllIllI, llllllllllllIllIIIllIlIlIllllIll, llllllllllllIllIIIllIlIlIllllIlI, llllllllllllIllIIIllIlIlIlllllII);
    }
    
    public static int socketDgramFd() {
        try {
            return socketDgram();
        }
        catch (IOException llllllllllllIllIIIllIlIlIllIllIl) {
            throw new ChannelException(llllllllllllIllIIIllIlIlIllIllIl);
        }
    }
    
    public static boolean connect(final int llllllllllllIllIIIllIlIlIlIlIIIl, final InetAddress llllllllllllIllIIIllIlIlIlIlIIII, final int llllllllllllIllIIIllIlIlIlIIllll) throws IOException {
        final NativeInetAddress llllllllllllIllIIIllIlIlIlIlIIlI = toNativeInetAddress(llllllllllllIllIIIllIlIlIlIlIIII);
        return connect(llllllllllllIllIIIllIlIlIlIlIIIl, llllllllllllIllIIIllIlIlIlIlIIlI.address, llllllllllllIllIIIllIlIlIlIlIIlI.scopeId, llllllllllllIllIIIllIlIlIlIIllll);
    }
    
    private static byte[] ipv4MappedIpv6Address(final byte[] llllllllllllIllIIIllIlIlIlIlllIl) {
        final byte[] llllllllllllIllIIIllIlIlIlIlllII = new byte[Native.llIllllIllIIIl[1]];
        System.arraycopy(Native.IPV4_MAPPED_IPV6_PREFIX, Native.llIllllIllIIIl[0], llllllllllllIllIIIllIlIlIlIlllII, Native.llIllllIllIIIl[0], Native.IPV4_MAPPED_IPV6_PREFIX.length);
        System.arraycopy(llllllllllllIllIIIllIlIlIlIlllIl, Native.llIllllIllIIIl[0], llllllllllllIllIIIllIlIlIlIlllII, Native.llIllllIllIIIl[2], llllllllllllIllIIIllIlIlIlIlllIl.length);
        return llllllllllllIllIIIllIlIlIlIlllII;
    }
    
    public static int sendTo(final int llllllllllllIllIIIllIlIllIIllIll, final ByteBuffer llllllllllllIllIIIllIlIllIIlIIlI, final int llllllllllllIllIIIllIlIllIIllIIl, final int llllllllllllIllIIIllIlIllIIllIII, final InetAddress llllllllllllIllIIIllIlIllIIIllll, final int llllllllllllIllIIIllIlIllIIlIllI) throws IOException {
        int llllllllllllIllIIIllIlIllIIlIlII = 0;
        byte[] llllllllllllIllIIIllIlIllIIlIlIl = null;
        if (lIIllIlIlIllllll((llllllllllllIllIIIllIlIllIIIllll instanceof Inet6Address) ? 1 : 0)) {
            final byte[] llllllllllllIllIIIllIlIllIIlllIl = llllllllllllIllIIIllIlIllIIIllll.getAddress();
            final int llllllllllllIllIIIllIlIllIIlllII = ((Inet6Address)llllllllllllIllIIIllIlIllIIIllll).getScopeId();
            "".length();
            if ((0xC3 ^ 0xC7) <= " ".length()) {
                return (0xD2 ^ 0xB1) & ~(0xCA ^ 0xA9);
            }
        }
        else {
            llllllllllllIllIIIllIlIllIIlIlII = Native.llIllllIllIIIl[0];
            llllllllllllIllIIIllIlIllIIlIlIl = ipv4MappedIpv6Address(llllllllllllIllIIIllIlIllIIIllll.getAddress());
        }
        return sendTo(llllllllllllIllIIIllIlIllIIllIll, llllllllllllIllIIIllIlIllIIlIIlI, llllllllllllIllIIIllIlIllIIllIIl, llllllllllllIllIIIllIlIllIIllIII, llllllllllllIllIIIllIlIllIIlIlIl, llllllllllllIllIIIllIlIllIIlIlII, llllllllllllIllIIIllIlIllIIlIllI);
    }
    
    private static String lIIllIlIlIllllII(final String llllllllllllIllIIIllIlIlIIlllIlI, final String llllllllllllIllIIIllIlIlIIllIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIlIlIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIlIlIIllIlll.getBytes(StandardCharsets.UTF_8)), Native.llIllllIllIIIl[5]), "DES");
            final Cipher llllllllllllIllIIIllIlIlIIllllII = Cipher.getInstance("DES");
            llllllllllllIllIIIllIlIlIIllllII.init(Native.llIllllIllIIIl[4], llllllllllllIllIIIllIlIlIIllllIl);
            return new String(llllllllllllIllIIIllIlIlIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIlIlIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIlIlIIlllIll) {
            llllllllllllIllIIIllIlIlIIlllIll.printStackTrace();
            return null;
        }
    }
    
    private Native() {
    }
    
    private static void lIIllIlIlIllllIl() {
        (llIllllIllIIII = new String[Native.llIllllIllIIIl[6]])[Native.llIllllIllIIIl[0]] = lIIllIlIlIllllII("I3xfVXBALdQ=", "BwIeR");
        Native.llIllllIllIIII[Native.llIllllIllIIIl[3]] = lIIllIlIlIllllII("jD9ViQyVYp4=", "SMpmA");
        Native.llIllllIllIIII[Native.llIllllIllIIIl[4]] = lIIllIlIlIllllII("fMH2BKoYbUfoMiqtIoIuaYbo3p1WklOq", "YxqPu");
        Native.llIllllIllIIII[Native.llIllllIllIIIl[7]] = lIIllIlIlIllllII("2jd94BhAFBaCWsiSe61XIanl/oYJzhQlJ1NidxqxtwE=", "Spiht");
    }
    
    private static boolean lIIllIlIllIIIIII(final int llllllllllllIllIIIllIlIlIIllIIIl) {
        return llllllllllllIllIIIllIlIlIIllIIIl == 0;
    }
    
    private static class NativeInetAddress
    {
        final /* synthetic */ byte[] address;
        final /* synthetic */ int scopeId;
        private static final /* synthetic */ int[] llllIllIIIIll;
        
        NativeInetAddress(final byte[] lllllllllllllIlIllIlIIlllIIIlllI) {
            this(lllllllllllllIlIllIlIIlllIIIlllI, NativeInetAddress.llllIllIIIIll[0]);
        }
        
        private static void lIlIlIlIlllIIll() {
            (llllIllIIIIll = new int[1])[0] = ((0xBC ^ 0xB5) & ~(0x58 ^ 0x51));
        }
        
        NativeInetAddress(final byte[] lllllllllllllIlIllIlIIlllIIlIIll, final int lllllllllllllIlIllIlIIlllIIlIlIl) {
            this.address = lllllllllllllIlIllIlIIlllIIlIIll;
            this.scopeId = lllllllllllllIlIllIlIIlllIIlIlIl;
        }
        
        static {
            lIlIlIlIlllIIll();
        }
    }
}
