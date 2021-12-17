// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.group;

import io.netty.channel.ServerChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.Channel;

public final class ChannelMatchers
{
    private static final /* synthetic */ ChannelMatcher NON_SERVER_CHANNEL_MATCHER;
    private static final /* synthetic */ String[] lIIIIIllIIIllI;
    private static final /* synthetic */ ChannelMatcher ALL_MATCHER;
    private static final /* synthetic */ ChannelMatcher SERVER_CHANNEL_MATCHER;
    private static final /* synthetic */ int[] lIIIIIllIIIlll;
    
    public static ChannelMatcher all() {
        return ChannelMatchers.ALL_MATCHER;
    }
    
    public static ChannelMatcher isNot(final Channel lllllllllllllIlIIlllIIIIIIIIlIII) {
        return invert(is(lllllllllllllIlIIlllIIIIIIIIlIII));
    }
    
    public static ChannelMatcher compose(final ChannelMatcher... lllllllllllllIlIIllIlllllllllIlI) {
        if (lIllIllIllllIIl(lllllllllllllIlIIllIlllllllllIlI.length, ChannelMatchers.lIIIIIllIIIlll[0])) {
            throw new IllegalArgumentException(ChannelMatchers.lIIIIIllIIIllI[ChannelMatchers.lIIIIIllIIIlll[1]]);
        }
        if (lIllIllIllllIlI(lllllllllllllIlIIllIlllllllllIlI.length, ChannelMatchers.lIIIIIllIIIlll[0])) {
            return lllllllllllllIlIIllIlllllllllIlI[ChannelMatchers.lIIIIIllIIIlll[1]];
        }
        return new CompositeMatcher(lllllllllllllIlIIllIlllllllllIlI);
    }
    
    private static String lIllIllIlllIllI(final String lllllllllllllIlIIllIlllllllIllll, final String lllllllllllllIlIIllIlllllllIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIllllllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlllllllIlllI.getBytes(StandardCharsets.UTF_8)), ChannelMatchers.lIIIIIllIIIlll[2]), "DES");
            final Cipher lllllllllllllIlIIllIllllllllIIll = Cipher.getInstance("DES");
            lllllllllllllIlIIllIllllllllIIll.init(ChannelMatchers.lIIIIIllIIIlll[3], lllllllllllllIlIIllIllllllllIlII);
            return new String(lllllllllllllIlIIllIllllllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlllllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIllllllllIIlI) {
            lllllllllllllIlIIllIllllllllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIllIllllIIl(final int lllllllllllllIlIIllIlllllllIIlIl, final int lllllllllllllIlIIllIlllllllIIlII) {
        return lllllllllllllIlIIllIlllllllIIlIl < lllllllllllllIlIIllIlllllllIIlII;
    }
    
    public static ChannelMatcher invert(final ChannelMatcher lllllllllllllIlIIllIllllllllllII) {
        return new InvertMatcher(lllllllllllllIlIIllIllllllllllII);
    }
    
    private static void lIllIllIllllIII() {
        (lIIIIIllIIIlll = new int[4])[0] = " ".length();
        ChannelMatchers.lIIIIIllIIIlll[1] = ((0x71 ^ 0x6E ^ (0x4D ^ 0x5B)) & (85 + 26 - 101 + 133 ^ 61 + 79 - 28 + 22 ^ -" ".length()));
        ChannelMatchers.lIIIIIllIIIlll[2] = (0x39 ^ 0x31);
        ChannelMatchers.lIIIIIllIIIlll[3] = "  ".length();
    }
    
    public static ChannelMatcher isNonServerChannel() {
        return ChannelMatchers.NON_SERVER_CHANNEL_MATCHER;
    }
    
    private static void lIllIllIlllIlll() {
        (lIIIIIllIIIllI = new String[ChannelMatchers.lIIIIIllIIIlll[0]])[ChannelMatchers.lIIIIIllIIIlll[1]] = lIllIllIlllIllI("0bi+rXdUnHC+LiAxn3W+wKLChLYbzf0OFnnnLr/eMBGswIDHNpqxmFQibw7fBE0n", "CtqAI");
    }
    
    private static boolean lIllIllIllllIlI(final int lllllllllllllIlIIllIlllllllIlIIl, final int lllllllllllllIlIIllIlllllllIlIII) {
        return lllllllllllllIlIIllIlllllllIlIIl == lllllllllllllIlIIllIlllllllIlIII;
    }
    
    private ChannelMatchers() {
    }
    
    public static ChannelMatcher is(final Channel lllllllllllllIlIIlllIIIIIIIIIlIl) {
        return new InstanceMatcher(lllllllllllllIlIIlllIIIIIIIIIlIl);
    }
    
    public static ChannelMatcher isServerChannel() {
        return ChannelMatchers.SERVER_CHANNEL_MATCHER;
    }
    
    static {
        lIllIllIllllIII();
        lIllIllIlllIlll();
        ALL_MATCHER = new ChannelMatcher() {
            private static final /* synthetic */ int[] llIIlIlIlIIllI;
            
            private static void lIIIllIlIIlIlIIl() {
                (llIIlIlIlIIllI = new int[1])[0] = " ".length();
            }
            
            @Override
            public boolean matches(final Channel llllllllllllIlllIIIllIlIlllIIlIl) {
                return ChannelMatchers$1.llIIlIlIlIIllI[0] != 0;
            }
            
            static {
                lIIIllIlIIlIlIIl();
            }
        };
        SERVER_CHANNEL_MATCHER = isInstanceOf(ServerChannel.class);
        NON_SERVER_CHANNEL_MATCHER = isNotInstanceOf(ServerChannel.class);
    }
    
    public static ChannelMatcher isNotInstanceOf(final Class<? extends Channel> lllllllllllllIlIIllIllllllllllll) {
        return invert(isInstanceOf(lllllllllllllIlIIllIllllllllllll));
    }
    
    public static ChannelMatcher isInstanceOf(final Class<? extends Channel> lllllllllllllIlIIlllIIIIIIIIIIll) {
        return new ClassMatcher(lllllllllllllIlIIlllIIIIIIIIIIll);
    }
    
    private static final class CompositeMatcher implements ChannelMatcher
    {
        private final /* synthetic */ ChannelMatcher[] matchers;
        private static final /* synthetic */ int[] llIllIlIllllll;
        
        @Override
        public boolean matches(final Channel llllllllllllIllIIllIIllIIlllllII) {
            final ChannelMatcher[] llllllllllllIllIIllIIllIlIIIIIII = this.matchers;
            final int llllllllllllIllIIllIIllIIlllllll = llllllllllllIllIIllIIllIlIIIIIII.length;
            int llllllllllllIllIIllIIllIIllllllI = CompositeMatcher.llIllIlIllllll[0];
            while (lIIllIIIIIlIIlIl(llllllllllllIllIIllIIllIIllllllI, llllllllllllIllIIllIIllIIlllllll)) {
                final ChannelMatcher llllllllllllIllIIllIIllIlIIIIIIl = llllllllllllIllIIllIIllIlIIIIIII[llllllllllllIllIIllIIllIIllllllI];
                if (lIIllIIIIIlIIllI(llllllllllllIllIIllIIllIlIIIIIIl.matches(llllllllllllIllIIllIIllIIlllllII) ? 1 : 0)) {
                    return CompositeMatcher.llIllIlIllllll[0] != 0;
                }
                ++llllllllllllIllIIllIIllIIllllllI;
                "".length();
                if (((0x26 ^ 0x65) & ~(0x84 ^ 0xC7)) != 0x0) {
                    return ((0x87 ^ 0x88) & ~(0x24 ^ 0x2B)) != 0x0;
                }
            }
            return CompositeMatcher.llIllIlIllllll[1] != 0;
        }
        
        private static void lIIllIIIIIlIIlII() {
            (llIllIlIllllll = new int[2])[0] = ((0xAF ^ 0x99 ^ (0x48 ^ 0x63)) & (2 + 139 - 61 + 69 ^ 75 + 126 - 110 + 45 ^ -" ".length()));
            CompositeMatcher.llIllIlIllllll[1] = " ".length();
        }
        
        CompositeMatcher(final ChannelMatcher... llllllllllllIllIIllIIllIlIIIlIlI) {
            this.matchers = llllllllllllIllIIllIIllIlIIIlIlI;
        }
        
        private static boolean lIIllIIIIIlIIllI(final int llllllllllllIllIIllIIllIIlllIIII) {
            return llllllllllllIllIIllIIllIIlllIIII == 0;
        }
        
        private static boolean lIIllIIIIIlIIlIl(final int llllllllllllIllIIllIIllIIlllIIll, final int llllllllllllIllIIllIIllIIlllIIlI) {
            return llllllllllllIllIIllIIllIIlllIIll < llllllllllllIllIIllIIllIIlllIIlI;
        }
        
        static {
            lIIllIIIIIlIIlII();
        }
    }
    
    private static final class ClassMatcher implements ChannelMatcher
    {
        private final /* synthetic */ Class<? extends Channel> clazz;
        
        @Override
        public boolean matches(final Channel lllllllllllllIIIIIIIlIIlllllIIll) {
            return this.clazz.isInstance(lllllllllllllIIIIIIIlIIlllllIIll);
        }
        
        ClassMatcher(final Class<? extends Channel> lllllllllllllIIIIIIIlIIllllllIlI) {
            this.clazz = lllllllllllllIIIIIIIlIIllllllIlI;
        }
    }
    
    private static final class InvertMatcher implements ChannelMatcher
    {
        private static final /* synthetic */ int[] lIlllIllIlIllI;
        private final /* synthetic */ ChannelMatcher matcher;
        
        @Override
        public boolean matches(final Channel llllllllllllIllllIlllIIIIlIlIIlI) {
            int n;
            if (lIIIIIllIlIIllIl(this.matcher.matches(llllllllllllIllllIlllIIIIlIlIIlI) ? 1 : 0)) {
                n = InvertMatcher.lIlllIllIlIllI[0];
                "".length();
                if ("   ".length() == 0) {
                    return ((110 + 4 - 75 + 115 ^ 89 + 125 - 169 + 99) & (146 + 147 - 222 + 85 ^ 2 + 147 - 83 + 84 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = InvertMatcher.lIlllIllIlIllI[1];
            }
            return n != 0;
        }
        
        private static void lIIIIIllIlIIllII() {
            (lIlllIllIlIllI = new int[2])[0] = " ".length();
            InvertMatcher.lIlllIllIlIllI[1] = ((0x21 ^ 0x61) & ~(0x43 ^ 0x3));
        }
        
        InvertMatcher(final ChannelMatcher llllllllllllIllllIlllIIIIllIIlII) {
            this.matcher = llllllllllllIllllIlllIIIIllIIlII;
        }
        
        static {
            lIIIIIllIlIIllII();
        }
        
        private static boolean lIIIIIllIlIIllIl(final int llllllllllllIllllIlllIIIIlIIllll) {
            return llllllllllllIllllIlllIIIIlIIllll == 0;
        }
    }
    
    private static final class InstanceMatcher implements ChannelMatcher
    {
        private final /* synthetic */ Channel channel;
        private static final /* synthetic */ int[] llIIlIlIllllll;
        
        InstanceMatcher(final Channel llllllllllllIlllIIIlIlllIIllIlIl) {
            this.channel = llllllllllllIlllIIIlIlllIIllIlIl;
        }
        
        private static boolean lIIIllIlIllllIll(final Object llllllllllllIlllIIIlIlllIIlIllII, final Object llllllllllllIlllIIIlIlllIIlIlIll) {
            return llllllllllllIlllIIIlIlllIIlIllII == llllllllllllIlllIIIlIlllIIlIlIll;
        }
        
        private static void lIIIllIlIllllIlI() {
            (llIIlIlIllllll = new int[2])[0] = " ".length();
            InstanceMatcher.llIIlIlIllllll[1] = ((26 + 77 + 43 + 99 ^ 73 + 128 - 172 + 148) & (37 + 75 - 111 + 233 ^ 137 + 59 - 82 + 60 ^ -" ".length()));
        }
        
        static {
            lIIIllIlIllllIlI();
        }
        
        @Override
        public boolean matches(final Channel llllllllllllIlllIIIlIlllIIlIllll) {
            int n;
            if (lIIIllIlIllllIll(this.channel, llllllllllllIlllIIIlIlllIIlIllll)) {
                n = InstanceMatcher.llIIlIlIllllll[0];
                "".length();
                if ("  ".length() == 0) {
                    return ((0x79 ^ 0x27 ^ (0xDF ^ 0xBD)) & (0x33 ^ 0x65 ^ (0x50 ^ 0x3A) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = InstanceMatcher.llIIlIlIllllll[1];
            }
            return n != 0;
        }
    }
}
