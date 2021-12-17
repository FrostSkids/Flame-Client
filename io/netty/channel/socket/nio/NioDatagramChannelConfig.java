// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.nio;

import io.netty.channel.ChannelConfig;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.SocketException;
import io.netty.channel.ChannelException;
import io.netty.channel.socket.DatagramChannelConfig;
import java.util.Enumeration;
import java.net.InetAddress;
import java.nio.channels.NetworkChannel;
import io.netty.util.internal.PlatformDependent;
import java.net.NetworkInterface;
import java.nio.channels.DatagramChannel;
import java.lang.reflect.Method;
import io.netty.channel.socket.DefaultDatagramChannelConfig;

class NioDatagramChannelConfig extends DefaultDatagramChannelConfig
{
    private static final /* synthetic */ Method GET_OPTION;
    private static final /* synthetic */ Object IP_MULTICAST_IF;
    private static final /* synthetic */ int[] lllIIIIllIIlll;
    private static final /* synthetic */ Method SET_OPTION;
    private static final /* synthetic */ Object IP_MULTICAST_LOOP;
    private static final /* synthetic */ Object IP_MULTICAST_TTL;
    private final /* synthetic */ DatagramChannel javaChannel;
    private static final /* synthetic */ String[] lllIIIIllIIlIl;
    
    @Override
    public NetworkInterface getNetworkInterface() {
        return (NetworkInterface)this.getOption0(NioDatagramChannelConfig.IP_MULTICAST_IF);
    }
    
    private static boolean lIIlllIIllIlIlIl(final Object llllllllllllIllIIIIlIIlIllIlIIll) {
        return llllllllllllIllIIIIlIIlIllIlIIll == null;
    }
    
    static {
        lIIlllIIllIlIlII();
        lIIlllIIllIlIIll();
        final ClassLoader llllllllllllIllIIIIlIIllIIIlllIl = PlatformDependent.getClassLoader(DatagramChannel.class);
        Class<?> llllllllllllIllIIIIlIIllIIIlllII = null;
        try {
            llllllllllllIllIIIIlIIllIIIlllII = Class.forName(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[0]], (boolean)(NioDatagramChannelConfig.lllIIIIllIIlll[2] != 0), llllllllllllIllIIIIlIIllIIIlllIl);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        catch (Exception ex) {}
        Class<?> llllllllllllIllIIIIlIIllIIIllIll = null;
        try {
            llllllllllllIllIIIIlIIllIIIllIll = Class.forName(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[2]], (boolean)(NioDatagramChannelConfig.lllIIIIllIIlll[2] != 0), llllllllllllIllIIIIlIIllIIIlllIl);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        catch (Exception ex2) {}
        Object llllllllllllIllIIIIlIIllIIIllIlI = null;
        Object llllllllllllIllIIIIlIIllIIIllIIl = null;
        Object llllllllllllIllIIIIlIIllIIIllIII = null;
        Method llllllllllllIllIIIIlIIllIIIlIlll = null;
        Method llllllllllllIllIIIIlIIllIIIlIllI = null;
        if (lIIlllIIllIllIII(llllllllllllIllIIIIlIIllIIIlllII)) {
            try {
                llllllllllllIllIIIIlIIllIIIllIlI = llllllllllllIllIIIIlIIllIIIllIll.getDeclaredField(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[3]]).get(null);
                "".length();
                if (((3 + 143 - 73 + 157 ^ 58 + 65 + 28 + 33) & (0x13 ^ 0x5C ^ (0x87 ^ 0x96) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIIIlIIllIIlIIIlI) {
                throw new Error(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[4]], llllllllllllIllIIIIlIIllIIlIIIlI);
            }
            try {
                llllllllllllIllIIIIlIIllIIIllIIl = llllllllllllIllIIIIlIIllIIIllIll.getDeclaredField(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[5]]).get(null);
                "".length();
                if (((0x3D ^ 0x6A ^ (0xEE ^ 0xA7)) & (31 + 42 - 47 + 142 ^ 71 + 116 - 164 + 159 ^ -" ".length())) > "   ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIIIlIIllIIlIIIIl) {
                throw new Error(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[6]], llllllllllllIllIIIIlIIllIIlIIIIl);
            }
            try {
                llllllllllllIllIIIIlIIllIIIllIII = llllllllllllIllIIIIlIIllIIIllIll.getDeclaredField(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[7]]).get(null);
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIIIlIIllIIlIIIII) {
                throw new Error(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[1]], llllllllllllIllIIIIlIIllIIlIIIII);
            }
            try {
                final Class<NetworkChannel> clazz = NetworkChannel.class;
                final String name = NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[8]];
                final Class[] parameterTypes = new Class[NioDatagramChannelConfig.lllIIIIllIIlll[2]];
                parameterTypes[NioDatagramChannelConfig.lllIIIIllIIlll[0]] = llllllllllllIllIIIIlIIllIIIlllII;
                llllllllllllIllIIIIlIIllIIIlIlll = clazz.getDeclaredMethod(name, (Class[])parameterTypes);
                "".length();
                if (-" ".length() >= (0x6E ^ 0x37 ^ (0x5F ^ 0x2))) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIIIlIIllIIIlllll) {
                throw new Error(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[9]], llllllllllllIllIIIIlIIllIIIlllll);
            }
            try {
                final Class<NetworkChannel> clazz2 = NetworkChannel.class;
                final String name2 = NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[10]];
                final Class[] parameterTypes2 = new Class[NioDatagramChannelConfig.lllIIIIllIIlll[3]];
                parameterTypes2[NioDatagramChannelConfig.lllIIIIllIIlll[0]] = llllllllllllIllIIIIlIIllIIIlllII;
                parameterTypes2[NioDatagramChannelConfig.lllIIIIllIIlll[2]] = Object.class;
                llllllllllllIllIIIIlIIllIIIlIllI = clazz2.getDeclaredMethod(name2, (Class[])parameterTypes2);
                "".length();
                if ((0x4F ^ 0x4B) < " ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIIIlIIllIIIllllI) {
                throw new Error(NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[11]], llllllllllllIllIIIIlIIllIIIllllI);
            }
        }
        IP_MULTICAST_TTL = llllllllllllIllIIIIlIIllIIIllIlI;
        IP_MULTICAST_IF = llllllllllllIllIIIIlIIllIIIllIIl;
        IP_MULTICAST_LOOP = llllllllllllIllIIIIlIIllIIIllIII;
        GET_OPTION = llllllllllllIllIIIIlIIllIIIlIlll;
        SET_OPTION = llllllllllllIllIIIIlIIllIIIlIllI;
    }
    
    @Override
    protected void autoReadCleared() {
        ((NioDatagramChannel)this.channel).setReadPending((boolean)(NioDatagramChannelConfig.lllIIIIllIIlll[0] != 0));
    }
    
    @Override
    public InetAddress getInterface() {
        final NetworkInterface llllllllllllIllIIIIlIIllIlllIIII = this.getNetworkInterface();
        if (lIIlllIIllIlIlIl(llllllllllllIllIIIIlIIllIlllIIII)) {
            return null;
        }
        final Enumeration<InetAddress> llllllllllllIllIIIIlIIllIlllIIlI = llllllllllllIllIIIIlIIllIlllIIII.getInetAddresses();
        if (lIIlllIIllIlIllI(llllllllllllIllIIIIlIIllIlllIIlI.hasMoreElements() ? 1 : 0)) {
            return llllllllllllIllIIIIlIIllIlllIIlI.nextElement();
        }
        return null;
    }
    
    @Override
    public DatagramChannelConfig setAutoRead(final boolean llllllllllllIllIIIIlIIllIlIIllII) {
        super.setAutoRead(llllllllllllIllIIIIlIIllIlIIllII);
        "".length();
        return this;
    }
    
    @Override
    public int getTimeToLive() {
        return (int)this.getOption0(NioDatagramChannelConfig.IP_MULTICAST_TTL);
    }
    
    @Override
    public DatagramChannelConfig setInterface(final InetAddress llllllllllllIllIIIIlIIllIllIIlll) {
        try {
            this.setNetworkInterface(NetworkInterface.getByInetAddress(llllllllllllIllIIIIlIIllIllIIlll));
            "".length();
            "".length();
            if (((0xFC ^ 0x84 ^ (0x67 ^ 0x21)) & (128 + 64 - 174 + 164 ^ 4 + 1 + 105 + 26 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (SocketException llllllllllllIllIIIIlIIllIllIlIIl) {
            throw new ChannelException(llllllllllllIllIIIIlIIllIllIlIIl);
        }
        return this;
    }
    
    NioDatagramChannelConfig(final NioDatagramChannel llllllllllllIllIIIIlIIlllIIIIIll, final DatagramChannel llllllllllllIllIIIIlIIlllIIIIIlI) {
        super(llllllllllllIllIIIIlIIlllIIIIIll, llllllllllllIllIIIIlIIlllIIIIIlI.socket());
        this.javaChannel = llllllllllllIllIIIIlIIlllIIIIIlI;
    }
    
    @Override
    public DatagramChannelConfig setTimeToLive(final int llllllllllllIllIIIIlIIllIllllIII) {
        this.setOption0(NioDatagramChannelConfig.IP_MULTICAST_TTL, llllllllllllIllIIIIlIIllIllllIII);
        return this;
    }
    
    @Override
    public boolean isLoopbackModeDisabled() {
        return (boolean)this.getOption0(NioDatagramChannelConfig.IP_MULTICAST_LOOP);
    }
    
    private static boolean lIIlllIIllIllIII(final Object llllllllllllIllIIIIlIIlIllIlIlIl) {
        return llllllllllllIllIIIIlIIlIllIlIlIl != null;
    }
    
    private static void lIIlllIIllIlIIll() {
        (lllIIIIllIIlIl = new String[NioDatagramChannelConfig.lllIIIIllIIlll[12]])[NioDatagramChannelConfig.lllIIIIllIIlll[0]] = lIIlllIIllIIllIl("xEv0A1vXygId51HgLJmxhEbJjsShKmBA", "gPofu");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[2]] = lIIlllIIllIIlllI("HP7KHAIWDzeXwg32qzH0TXtIjCpQIcvbBLxIcwJ3Hj8=", "EkzNR");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[3]] = lIIlllIIllIIlllI("NRFGM4k8tRljXimEqNuC2spi8rdloTlr", "BTOus");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[4]] = lIIlllIIllIIlllI("kUHMe0jghV64jdwo3nqdt1q+cn3GPhqqk0lo7+vR5k1muIw8u11fRXYIBaFIZAWo", "Cfptp");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[5]] = lIIlllIIllIIlllI("/USzKWFRUGTR5lEh+74GlA==", "nwGEQ");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[6]] = lIIlllIIllIIlllI("Oswl+KOXk2v6QqZ/++lcjanGpaGUzXmZKhfCKqtRui/YDM4La/wtww==", "IIsXY");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[7]] = lIIlllIIllIIllll("Oj05DBs/OS8CDyA5OQ0BPD0=", "smfAN");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[1]] = lIIlllIIllIIllIl("LuC+Ngan/jp+0ldH1sMja4tYf/SD4aoIgmyS4+rlaNEZQiC5fOPszTigDpvfeaJh", "dAUyP");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[8]] = lIIlllIIllIIlllI("vgwpkiXVn5kzOY96jnEykg==", "Nhvlh");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[9]] = lIIlllIIllIIllll("AggfHAsVSR0dBwAdFFIQCQxRFQEVJgEGDQ4HWVtEDAwFGgsF", "aiqrd");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[10]] = lIIlllIIllIIlllI("TcZg0yo3F/f6UGxJc3oZcw==", "gLMVi");
        NioDatagramChannelConfig.lllIIIIllIIlIl[NioDatagramChannelConfig.lllIIIIllIIlll[11]] = lIIlllIIllIIllIl("5LkTFfUGbPpIE2I/uaw/ZVI9KycGSRo4HYtn22BK/z/KkRXVYdSE6A==", "oWUOM");
    }
    
    private Object getOption0(final Object llllllllllllIllIIIIlIIllIlIIIIIl) {
        if (lIIlllIIllIlIlll(PlatformDependent.javaVersion(), NioDatagramChannelConfig.lllIIIIllIIlll[1])) {
            throw new UnsupportedOperationException();
        }
        try {
            final Method get_OPTION = NioDatagramChannelConfig.GET_OPTION;
            final DatagramChannel javaChannel = this.javaChannel;
            final Object[] args = new Object[NioDatagramChannelConfig.lllIIIIllIIlll[2]];
            args[NioDatagramChannelConfig.lllIIIIllIIlll[0]] = llllllllllllIllIIIIlIIllIlIIIIIl;
            return get_OPTION.invoke(javaChannel, args);
        }
        catch (Exception llllllllllllIllIIIIlIIllIlIIIlIl) {
            throw new ChannelException(llllllllllllIllIIIIlIIllIlIIIlIl);
        }
    }
    
    private void setOption0(final Object llllllllllllIllIIIIlIIllIIlllIIl, final Object llllllllllllIllIIIIlIIllIIllIlIl) {
        if (lIIlllIIllIlIlll(PlatformDependent.javaVersion(), NioDatagramChannelConfig.lllIIIIllIIlll[1])) {
            throw new UnsupportedOperationException();
        }
        try {
            final Method set_OPTION = NioDatagramChannelConfig.SET_OPTION;
            final DatagramChannel javaChannel = this.javaChannel;
            final Object[] args = new Object[NioDatagramChannelConfig.lllIIIIllIIlll[3]];
            args[NioDatagramChannelConfig.lllIIIIllIIlll[0]] = llllllllllllIllIIIIlIIllIIlllIIl;
            args[NioDatagramChannelConfig.lllIIIIllIIlll[2]] = llllllllllllIllIIIIlIIllIIllIlIl;
            set_OPTION.invoke(javaChannel, args);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception llllllllllllIllIIIIlIIllIIlllIll) {
            throw new ChannelException(llllllllllllIllIIIIlIIllIIlllIll);
        }
    }
    
    private static boolean lIIlllIIllIlIllI(final int llllllllllllIllIIIIlIIlIllIlIIIl) {
        return llllllllllllIllIIIIlIIlIllIlIIIl != 0;
    }
    
    @Override
    public DatagramChannelConfig setLoopbackModeDisabled(final boolean llllllllllllIllIIIIlIIllIlIlIIlI) {
        this.setOption0(NioDatagramChannelConfig.IP_MULTICAST_LOOP, llllllllllllIllIIIIlIIllIlIlIIlI);
        return this;
    }
    
    private static void lIIlllIIllIlIlII() {
        (lllIIIIllIIlll = new int[13])[0] = ((0x6B ^ 0x7E ^ (0x15 ^ 0xA)) & (0x4 ^ 0x45 ^ (0x40 ^ 0xB) ^ -" ".length()));
        NioDatagramChannelConfig.lllIIIIllIIlll[1] = (0xA0 ^ 0xA7);
        NioDatagramChannelConfig.lllIIIIllIIlll[2] = " ".length();
        NioDatagramChannelConfig.lllIIIIllIIlll[3] = "  ".length();
        NioDatagramChannelConfig.lllIIIIllIIlll[4] = "   ".length();
        NioDatagramChannelConfig.lllIIIIllIIlll[5] = (0x6C ^ 0x11 ^ (0xD2 ^ 0xAB));
        NioDatagramChannelConfig.lllIIIIllIIlll[6] = (0xEE ^ 0x89 ^ (0xD2 ^ 0xB0));
        NioDatagramChannelConfig.lllIIIIllIIlll[7] = (143 + 98 - 164 + 82 ^ 125 + 86 - 165 + 107);
        NioDatagramChannelConfig.lllIIIIllIIlll[8] = (0x85 ^ 0x8D);
        NioDatagramChannelConfig.lllIIIIllIIlll[9] = (0x1E ^ 0xF ^ (0x4F ^ 0x57));
        NioDatagramChannelConfig.lllIIIIllIIlll[10] = (0xBB ^ 0xB1);
        NioDatagramChannelConfig.lllIIIIllIIlll[11] = (0xB ^ 0x4D ^ (0x3 ^ 0x4E));
        NioDatagramChannelConfig.lllIIIIllIIlll[12] = (0x84 ^ 0x88);
    }
    
    private static String lIIlllIIllIIlllI(final String llllllllllllIllIIIIlIIlIlllIllIl, final String llllllllllllIllIIIIlIIlIlllIllII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIlIllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIlIlllIllII.getBytes(StandardCharsets.UTF_8)), NioDatagramChannelConfig.lllIIIIllIIlll[8]), "DES");
            final Cipher llllllllllllIllIIIIlIIlIlllIllll = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIIlIlllIllll.init(NioDatagramChannelConfig.lllIIIIllIIlll[3], llllllllllllIllIIIIlIIlIllllIIII);
            return new String(llllllllllllIllIIIIlIIlIlllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIlIlllIlllI) {
            llllllllllllIllIIIIlIIlIlllIlllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllIIllIIllIl(final String llllllllllllIllIIIIlIIlIlllIIIII, final String llllllllllllIllIIIIlIIlIllIlllIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIlIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIlIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIlIIlIlllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIlIIlIlllIIIlI.init(NioDatagramChannelConfig.lllIIIIllIIlll[3], llllllllllllIllIIIIlIIlIlllIIIll);
            return new String(llllllllllllIllIIIIlIIlIlllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIlIlllIIIIl) {
            llllllllllllIllIIIIlIIlIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public DatagramChannelConfig setNetworkInterface(final NetworkInterface llllllllllllIllIIIIlIIllIlIlllIl) {
        this.setOption0(NioDatagramChannelConfig.IP_MULTICAST_IF, llllllllllllIllIIIIlIIllIlIlllIl);
        return this;
    }
    
    private static boolean lIIlllIIllIlIlll(final int llllllllllllIllIIIIlIIlIllIllIII, final int llllllllllllIllIIIIlIIlIllIlIlll) {
        return llllllllllllIllIIIIlIIlIllIllIII < llllllllllllIllIIIIlIIlIllIlIlll;
    }
    
    private static String lIIlllIIllIIllll(String llllllllllllIllIIIIlIIlIllllllIl, final String llllllllllllIllIIIIlIIlIllllllII) {
        llllllllllllIllIIIIlIIlIllllllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIIlIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIIllIIIIIIII = new StringBuilder();
        final char[] llllllllllllIllIIIIlIIlIllllllll = llllllllllllIllIIIIlIIlIllllllII.toCharArray();
        int llllllllllllIllIIIIlIIlIlllllllI = NioDatagramChannelConfig.lllIIIIllIIlll[0];
        final long llllllllllllIllIIIIlIIlIlllllIII = (Object)llllllllllllIllIIIIlIIlIllllllIl.toCharArray();
        final boolean llllllllllllIllIIIIlIIlIllllIlll = llllllllllllIllIIIIlIIlIlllllIII.length != 0;
        Exception llllllllllllIllIIIIlIIlIllllIllI = (Exception)NioDatagramChannelConfig.lllIIIIllIIlll[0];
        while (lIIlllIIllIlIlll((int)llllllllllllIllIIIIlIIlIllllIllI, llllllllllllIllIIIIlIIlIllllIlll ? 1 : 0)) {
            final char llllllllllllIllIIIIlIIllIIIIIIll = llllllllllllIllIIIIlIIlIlllllIII[llllllllllllIllIIIIlIIlIllllIllI];
            llllllllllllIllIIIIlIIllIIIIIIII.append((char)(llllllllllllIllIIIIlIIllIIIIIIll ^ llllllllllllIllIIIIlIIlIllllllll[llllllllllllIllIIIIlIIlIlllllllI % llllllllllllIllIIIIlIIlIllllllll.length]));
            "".length();
            ++llllllllllllIllIIIIlIIlIlllllllI;
            ++llllllllllllIllIIIIlIIlIllllIllI;
            "".length();
            if (((0x26 ^ 0x1F ^ (0x10 ^ 0x62)) & (76 + 139 - 98 + 127 ^ 53 + 59 + 46 + 33 ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIIllIIIIIIII);
    }
}
