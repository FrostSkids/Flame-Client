// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.rxtx;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;

public interface RxtxChannelConfig extends ChannelConfig
{
    RxtxChannelConfig setParitybit(final Paritybit p0);
    
    Stopbits getStopbits();
    
    RxtxChannelConfig setDtr(final boolean p0);
    
    Paritybit getParitybit();
    
    RxtxChannelConfig setMaxMessagesPerRead(final int p0);
    
    RxtxChannelConfig setStopbits(final Stopbits p0);
    
    RxtxChannelConfig setWriteBufferHighWaterMark(final int p0);
    
    RxtxChannelConfig setAllocator(final ByteBufAllocator p0);
    
    RxtxChannelConfig setAutoClose(final boolean p0);
    
    RxtxChannelConfig setRts(final boolean p0);
    
    Databits getDatabits();
    
    RxtxChannelConfig setWaitTimeMillis(final int p0);
    
    RxtxChannelConfig setMessageSizeEstimator(final MessageSizeEstimator p0);
    
    RxtxChannelConfig setWriteBufferLowWaterMark(final int p0);
    
    int getWaitTimeMillis();
    
    RxtxChannelConfig setWriteSpinCount(final int p0);
    
    RxtxChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator p0);
    
    RxtxChannelConfig setDatabits(final Databits p0);
    
    RxtxChannelConfig setReadTimeout(final int p0);
    
    int getReadTimeout();
    
    boolean isRts();
    
    boolean isDtr();
    
    RxtxChannelConfig setAutoRead(final boolean p0);
    
    int getBaudrate();
    
    RxtxChannelConfig setBaudrate(final int p0);
    
    RxtxChannelConfig setConnectTimeoutMillis(final int p0);
    
    public enum Stopbits
    {
        private static final /* synthetic */ String[] lllllIIllllII;
        private final /* synthetic */ int value;
        
        STOPBITS_1(Stopbits.lllllIIllllll[1]), 
        STOPBITS_2(Stopbits.lllllIIllllll[2]), 
        STOPBITS_1_5(Stopbits.lllllIIllllll[3]);
        
        private static final /* synthetic */ int[] lllllIIllllll;
        
        public static Stopbits valueOf(final int lllllllllllllIlIlIlllIIllllIIlIl) {
            final Stopbits[] lllllllllllllIlIlIlllIIllllIlIII = values();
            final int lllllllllllllIlIlIlllIIllllIIlll = lllllllllllllIlIlIlllIIllllIlIII.length;
            int lllllllllllllIlIlIlllIIllllIIllI = Stopbits.lllllIIllllll[0];
            while (lIlIlllIIIllIlI(lllllllllllllIlIlIlllIIllllIIllI, lllllllllllllIlIlIlllIIllllIIlll)) {
                final Stopbits lllllllllllllIlIlIlllIIllllIlIIl = lllllllllllllIlIlIlllIIllllIlIII[lllllllllllllIlIlIlllIIllllIIllI];
                if (lIlIlllIIIllIll(lllllllllllllIlIlIlllIIllllIlIIl.value, lllllllllllllIlIlIlllIIllllIIlIl)) {
                    return lllllllllllllIlIlIlllIIllllIlIIl;
                }
                ++lllllllllllllIlIlIlllIIllllIIllI;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(Stopbits.lllllIIllllII[Stopbits.lllllIIllllll[0]]).append(Stopbits.class.getSimpleName()).append(Stopbits.lllllIIllllII[Stopbits.lllllIIllllll[1]]).append(lllllllllllllIlIlIlllIIllllIIlIl)));
        }
        
        private Stopbits(final int lllllllllllllIlIlIlllIIlllllIllI) {
            this.value = lllllllllllllIlIlIlllIIlllllIllI;
        }
        
        private static String lIlIlllIIIIlIll(final String lllllllllllllIlIlIlllIIlllIlIllI, final String lllllllllllllIlIlIlllIIlllIlIlIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlllIIlllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIlllIIlllIllIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIlllIIlllIllIlI.init(Stopbits.lllllIIllllll[2], lllllllllllllIlIlIlllIIlllIllIll);
                return new String(lllllllllllllIlIlIlllIIlllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlllIIlllIllIIl) {
                lllllllllllllIlIlIlllIIlllIllIIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIlllIIIIlIIl(String lllllllllllllIlIlIlllIIllIllIllI, final String lllllllllllllIlIlIlllIIllIlllIlI) {
            lllllllllllllIlIlIlllIIllIllIllI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIlllIIllIllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIlllIIllIlllIIl = new StringBuilder();
            final char[] lllllllllllllIlIlIlllIIllIlllIII = lllllllllllllIlIlIlllIIllIlllIlI.toCharArray();
            int lllllllllllllIlIlIlllIIllIllIlll = Stopbits.lllllIIllllll[0];
            final double lllllllllllllIlIlIlllIIllIllIIIl = (Object)((String)lllllllllllllIlIlIlllIIllIllIllI).toCharArray();
            final double lllllllllllllIlIlIlllIIllIllIIII = lllllllllllllIlIlIlllIIllIllIIIl.length;
            String lllllllllllllIlIlIlllIIllIlIllll = (String)Stopbits.lllllIIllllll[0];
            while (lIlIlllIIIllIlI((int)lllllllllllllIlIlIlllIIllIlIllll, (int)lllllllllllllIlIlIlllIIllIllIIII)) {
                final char lllllllllllllIlIlIlllIIllIllllII = lllllllllllllIlIlIlllIIllIllIIIl[lllllllllllllIlIlIlllIIllIlIllll];
                lllllllllllllIlIlIlllIIllIlllIIl.append((char)(lllllllllllllIlIlIlllIIllIllllII ^ lllllllllllllIlIlIlllIIllIlllIII[lllllllllllllIlIlIlllIIllIllIlll % lllllllllllllIlIlIlllIIllIlllIII.length]));
                "".length();
                ++lllllllllllllIlIlIlllIIllIllIlll;
                ++lllllllllllllIlIlIlllIIllIlIllll;
                "".length();
                if ("   ".length() < " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIlllIIllIlllIIl);
        }
        
        private static boolean lIlIlllIIIllIlI(final int lllllllllllllIlIlIlllIIllIlIIlll, final int lllllllllllllIlIlIlllIIllIlIIllI) {
            return lllllllllllllIlIlIlllIIllIlIIlll < lllllllllllllIlIlIlllIIllIlIIllI;
        }
        
        private static void lIlIlllIIIIllII() {
            (lllllIIllllII = new String[Stopbits.lllllIIllllll[5]])[Stopbits.lllllIIllllll[0]] = lIlIlllIIIIlIIl("Dz0SCRsNPVk=", "zSygt");
            Stopbits.lllllIIllllII[Stopbits.lllllIIllllll[1]] = lIlIlllIIIIlIlI("ZM7rWpRi8BvhjNYtV0ERkA==", "dVGUA");
            Stopbits.lllllIIllllII[Stopbits.lllllIIllllll[2]] = lIlIlllIIIIlIll("mxWHi6+98p8PlgGUor+qqQ==", "SPLKL");
            Stopbits.lllllIIllllII[Stopbits.lllllIIllllll[3]] = lIlIlllIIIIlIIl("IjwfIQo4PAMueg==", "qhPqH");
            Stopbits.lllllIIllllII[Stopbits.lllllIIllllll[4]] = lIlIlllIIIIlIlI("u6ZYQ8bcaXJsmMVIDQgiMw==", "xwdSS");
        }
        
        private static String lIlIlllIIIIlIlI(final String lllllllllllllIlIlIlllIIlllIIlIll, final String lllllllllllllIlIlIlllIIlllIIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlllIIlllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), Stopbits.lllllIIllllll[6]), "DES");
                final Cipher lllllllllllllIlIlIlllIIlllIIllIl = Cipher.getInstance("DES");
                lllllllllllllIlIlIlllIIlllIIllIl.init(Stopbits.lllllIIllllll[2], lllllllllllllIlIlIlllIIlllIIlllI);
                return new String(lllllllllllllIlIlIlllIIlllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIIlllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlllIIlllIIllII) {
                lllllllllllllIlIlIlllIIlllIIllII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIlllIIIllIll(final int lllllllllllllIlIlIlllIIllIlIlIll, final int lllllllllllllIlIlIlllIIllIlIlIlI) {
            return lllllllllllllIlIlIlllIIllIlIlIll == lllllllllllllIlIlIlllIIllIlIlIlI;
        }
        
        private static void lIlIlllIIIllIIl() {
            (lllllIIllllll = new int[7])[0] = ((0xB5 ^ 0xA7) & ~(0xB6 ^ 0xA4));
            Stopbits.lllllIIllllll[1] = " ".length();
            Stopbits.lllllIIllllll[2] = "  ".length();
            Stopbits.lllllIIllllll[3] = "   ".length();
            Stopbits.lllllIIllllll[4] = (0x2B ^ 0x4E ^ (0x2E ^ 0x4F));
            Stopbits.lllllIIllllll[5] = (22 + 104 - 52 + 120 ^ 11 + 111 + 14 + 63);
            Stopbits.lllllIIllllll[6] = (0x7E ^ 0x76);
        }
        
        static {
            lIlIlllIIIllIIl();
            lIlIlllIIIIllII();
            final Stopbits[] $values = new Stopbits[Stopbits.lllllIIllllll[3]];
            $values[Stopbits.lllllIIllllll[0]] = Stopbits.STOPBITS_1;
            $values[Stopbits.lllllIIllllll[1]] = Stopbits.STOPBITS_2;
            $values[Stopbits.lllllIIllllll[2]] = Stopbits.STOPBITS_1_5;
            $VALUES = $values;
        }
        
        public int value() {
            return this.value;
        }
    }
    
    public enum Paritybit
    {
        SPACE(Paritybit.lIllIlIlIllllI[4]), 
        EVEN(Paritybit.lIllIlIlIllllI[2]);
        
        private static final /* synthetic */ String[] lIllIlIlIlIllI;
        
        NONE(Paritybit.lIllIlIlIllllI[0]), 
        MARK(Paritybit.lIllIlIlIllllI[3]);
        
        private final /* synthetic */ int value;
        private static final /* synthetic */ int[] lIllIlIlIllllI;
        
        ODD(Paritybit.lIllIlIlIllllI[1]);
        
        private static String llllllIllIlIIll(String llllllllllllIlllllllllIlIllIIIII, final String llllllllllllIlllllllllIlIllIIlII) {
            llllllllllllIlllllllllIlIllIIIII = new String(Base64.getDecoder().decode(llllllllllllIlllllllllIlIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllllllllIlIllIIIll = new StringBuilder();
            final char[] llllllllllllIlllllllllIlIllIIIlI = llllllllllllIlllllllllIlIllIIlII.toCharArray();
            int llllllllllllIlllllllllIlIllIIIIl = Paritybit.lIllIlIlIllllI[0];
            final boolean llllllllllllIlllllllllIlIlIllIll = (Object)llllllllllllIlllllllllIlIllIIIII.toCharArray();
            final Exception llllllllllllIlllllllllIlIlIllIlI = (Exception)llllllllllllIlllllllllIlIlIllIll.length;
            char llllllllllllIlllllllllIlIlIllIIl = (char)Paritybit.lIllIlIlIllllI[0];
            while (llllllIllIllIIl(llllllllllllIlllllllllIlIlIllIIl, (int)llllllllllllIlllllllllIlIlIllIlI)) {
                final char llllllllllllIlllllllllIlIllIIllI = llllllllllllIlllllllllIlIlIllIll[llllllllllllIlllllllllIlIlIllIIl];
                llllllllllllIlllllllllIlIllIIIll.append((char)(llllllllllllIlllllllllIlIllIIllI ^ llllllllllllIlllllllllIlIllIIIlI[llllllllllllIlllllllllIlIllIIIIl % llllllllllllIlllllllllIlIllIIIlI.length]));
                "".length();
                ++llllllllllllIlllllllllIlIllIIIIl;
                ++llllllllllllIlllllllllIlIlIllIIl;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllllllllIlIllIIIll);
        }
        
        private static void llllllIllIlIlII() {
            (lIllIlIlIlIllI = new String[Paritybit.lIllIlIlIllllI[7]])[Paritybit.lIllIlIlIllllI[0]] = llllllIllIIlllI("0q/qMolumugIKYajOlVM/g==", "RoiMD");
            Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[1]] = llllllIllIIlllI("OVEY9vIR1Ul68jBun5oByg==", "qCjHD");
            Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[2]] = llllllIllIlIIll("OwMdIw==", "uLSfk");
            Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[3]] = llllllIllIIlllI("ogRELilGyz8=", "JuYsY");
            Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[4]] = llllllIllIIlllI("i48vX9mZoNs=", "LjDHG");
            Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[5]] = llllllIllIlIIll("DwIwKg==", "BCbaj");
            Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[6]] = llllllIllIIlllI("6yUy0rJ9olc=", "kVEIc");
        }
        
        private static String llllllIllIIlllI(final String llllllllllllIlllllllllIlIlllIIll, final String llllllllllllIlllllllllIlIlllIlII) {
            try {
                final SecretKeySpec llllllllllllIlllllllllIlIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIlIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllllllllIlIlllIlll = Cipher.getInstance("Blowfish");
                llllllllllllIlllllllllIlIlllIlll.init(Paritybit.lIllIlIlIllllI[2], llllllllllllIlllllllllIlIllllIII);
                return new String(llllllllllllIlllllllllIlIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllllllIlIlllIllI) {
                llllllllllllIlllllllllIlIlllIllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean llllllIllIllIIl(final int llllllllllllIlllllllllIlIlIlIIIl, final int llllllllllllIlllllllllIlIlIlIIII) {
            return llllllllllllIlllllllllIlIlIlIIIl < llllllllllllIlllllllllIlIlIlIIII;
        }
        
        public int value() {
            return this.value;
        }
        
        private static void llllllIllIllIII() {
            (lIllIlIlIllllI = new int[8])[0] = ((0x27 ^ 0x4D ^ (0x2F ^ 0x0)) & (0x73 ^ 0x4D ^ (0x67 ^ 0x1C) ^ -" ".length()));
            Paritybit.lIllIlIlIllllI[1] = " ".length();
            Paritybit.lIllIlIlIllllI[2] = "  ".length();
            Paritybit.lIllIlIlIllllI[3] = "   ".length();
            Paritybit.lIllIlIlIllllI[4] = (0x3D ^ 0x5C ^ (0x15 ^ 0x70));
            Paritybit.lIllIlIlIllllI[5] = (0x74 ^ 0x71);
            Paritybit.lIllIlIlIllllI[6] = (0xB7 ^ 0xB1);
            Paritybit.lIllIlIlIllllI[7] = (12 + 77 - 13 + 92 ^ 55 + 158 - 109 + 71);
        }
        
        private Paritybit(final int llllllllllllIlllllllllIllIIlIIll) {
            this.value = llllllllllllIlllllllllIllIIlIIll;
        }
        
        private static boolean llllllIllIllIlI(final int llllllllllllIlllllllllIlIlIlIlIl, final int llllllllllllIlllllllllIlIlIlIlII) {
            return llllllllllllIlllllllllIlIlIlIlIl == llllllllllllIlllllllllIlIlIlIlII;
        }
        
        public static Paritybit valueOf(final int llllllllllllIlllllllllIllIIIIIlI) {
            final Paritybit[] llllllllllllIlllllllllIllIIIIlIl = values();
            final int llllllllllllIlllllllllIllIIIIlII = llllllllllllIlllllllllIllIIIIlIl.length;
            int llllllllllllIlllllllllIllIIIIIll = Paritybit.lIllIlIlIllllI[0];
            while (llllllIllIllIIl(llllllllllllIlllllllllIllIIIIIll, llllllllllllIlllllllllIllIIIIlII)) {
                final Paritybit llllllllllllIlllllllllIllIIIIllI = llllllllllllIlllllllllIllIIIIlIl[llllllllllllIlllllllllIllIIIIIll];
                if (llllllIllIllIlI(llllllllllllIlllllllllIllIIIIllI.value, llllllllllllIlllllllllIllIIIIIlI)) {
                    return llllllllllllIlllllllllIllIIIIllI;
                }
                ++llllllllllllIlllllllllIllIIIIIll;
                "".length();
                if (-" ".length() >= ((0xB1 ^ 0x91 ^ (0x8B ^ 0xA3)) & (48 + 112 - 1 + 10 ^ 98 + 74 - 134 + 123 ^ -" ".length()))) {
                    return null;
                }
            }
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[0]]).append(Paritybit.class.getSimpleName()).append(Paritybit.lIllIlIlIlIllI[Paritybit.lIllIlIlIllllI[1]]).append(llllllllllllIlllllllllIllIIIIIlI)));
        }
        
        static {
            llllllIllIllIII();
            llllllIllIlIlII();
            final Paritybit[] $values = new Paritybit[Paritybit.lIllIlIlIllllI[5]];
            $values[Paritybit.lIllIlIlIllllI[0]] = Paritybit.NONE;
            $values[Paritybit.lIllIlIlIllllI[1]] = Paritybit.ODD;
            $values[Paritybit.lIllIlIlIllllI[2]] = Paritybit.EVEN;
            $values[Paritybit.lIllIlIlIllllI[3]] = Paritybit.MARK;
            $values[Paritybit.lIllIlIlIllllI[4]] = Paritybit.SPACE;
            $VALUES = $values;
        }
    }
    
    public enum Databits
    {
        DATABITS_5(Databits.llIlIlIllIIIll[3]), 
        DATABITS_8(Databits.llIlIlIllIIIll[8]), 
        DATABITS_6(Databits.llIlIlIllIIIll[5]);
        
        private final /* synthetic */ int value;
        private static final /* synthetic */ String[] llIlIlIllIIIIl;
        
        DATABITS_7(Databits.llIlIlIllIIIll[7]);
        
        private static final /* synthetic */ int[] llIlIlIllIIIll;
        
        private static String lIIlIlIIIlllllIl(String llllllllllllIllIlIlIIIllIllllIIl, final String llllllllllllIllIlIlIIIllIllllIII) {
            llllllllllllIllIlIlIIIllIllllIIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIIIllIllllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlIIIllIlllllII = new StringBuilder();
            final char[] llllllllllllIllIlIlIIIllIllllIll = llllllllllllIllIlIlIIIllIllllIII.toCharArray();
            int llllllllllllIllIlIlIIIllIllllIlI = Databits.llIlIlIllIIIll[0];
            final float llllllllllllIllIlIlIIIllIlllIlII = (Object)((String)llllllllllllIllIlIlIIIllIllllIIl).toCharArray();
            final float llllllllllllIllIlIlIIIllIlllIIll = llllllllllllIllIlIlIIIllIlllIlII.length;
            float llllllllllllIllIlIlIIIllIlllIIlI = Databits.llIlIlIllIIIll[0];
            while (lIIlIlIIlIIIIlII((int)llllllllllllIllIlIlIIIllIlllIIlI, (int)llllllllllllIllIlIlIIIllIlllIIll)) {
                final char llllllllllllIllIlIlIIIllIlllllll = llllllllllllIllIlIlIIIllIlllIlII[llllllllllllIllIlIlIIIllIlllIIlI];
                llllllllllllIllIlIlIIIllIlllllII.append((char)(llllllllllllIllIlIlIIIllIlllllll ^ llllllllllllIllIlIlIIIllIllllIll[llllllllllllIllIlIlIIIllIllllIlI % llllllllllllIllIlIlIIIllIllllIll.length]));
                "".length();
                ++llllllllllllIllIlIlIIIllIllllIlI;
                ++llllllllllllIllIlIlIIIllIlllIIlI;
                "".length();
                if ((0x3A ^ 0x3E) != (0xAA ^ 0xAE)) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlIIIllIlllllII);
        }
        
        static {
            lIIlIlIIlIIIIIll();
            lIIlIlIIIlllllll();
            final Databits[] $values = new Databits[Databits.llIlIlIllIIIll[6]];
            $values[Databits.llIlIlIllIIIll[0]] = Databits.DATABITS_5;
            $values[Databits.llIlIlIllIIIll[1]] = Databits.DATABITS_6;
            $values[Databits.llIlIlIllIIIll[2]] = Databits.DATABITS_7;
            $values[Databits.llIlIlIllIIIll[4]] = Databits.DATABITS_8;
            $VALUES = $values;
        }
        
        private static void lIIlIlIIIlllllll() {
            (llIlIlIllIIIIl = new String[Databits.llIlIlIllIIIll[5]])[Databits.llIlIlIllIIIll[0]] = lIIlIlIIIlllllIl("ByY/NjkFJnQ=", "rHTXV");
            Databits.llIlIlIllIIIIl[Databits.llIlIlIllIIIll[1]] = lIIlIlIIIlllllIl("QyIOKjYGbk8=", "cToFC");
            Databits.llIlIlIllIIIIl[Databits.llIlIlIllIIIll[2]] = lIIlIlIIIlllllIl("EiwYLhMfOR8wZA==", "VmLoQ");
            Databits.llIlIlIllIIIIl[Databits.llIlIlIllIIIll[4]] = lIIlIlIIIllllllI("DdlzTDw0y91MpXMo4w05SA==", "pJoua");
            Databits.llIlIlIllIIIIl[Databits.llIlIlIllIIIll[6]] = lIIlIlIIIlllllIl("FS0FIwEYOAI9dA==", "QlQbC");
            Databits.llIlIlIllIIIIl[Databits.llIlIlIllIIIll[3]] = lIIlIlIIIllllllI("arXMxerbd4rPYvKR1nQxAw==", "ogeCu");
        }
        
        private static String lIIlIlIIIllllllI(final String llllllllllllIllIlIlIIIllIllIIlll, final String llllllllllllIllIlIlIIIllIllIlIII) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIIIllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIllIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIlIIIllIllIlIll = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIlIIIllIllIlIll.init(Databits.llIlIlIllIIIll[2], llllllllllllIllIlIlIIIllIllIllII);
                return new String(llllllllllllIllIlIlIIIllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIllIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIIIllIllIlIlI) {
                llllllllllllIllIlIlIIIllIllIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlIlIIlIIIIlIl(final int llllllllllllIllIlIlIIIllIllIIIIl, final int llllllllllllIllIlIlIIIllIllIIIII) {
            return llllllllllllIllIlIlIIIllIllIIIIl == llllllllllllIllIlIlIIIllIllIIIII;
        }
        
        public int value() {
            return this.value;
        }
        
        public static Databits valueOf(final int llllllllllllIllIlIlIIIlllIIIllIl) {
            final Databits[] llllllllllllIllIlIlIIIlllIIlIIIl = values();
            final int llllllllllllIllIlIlIIIlllIIlIIII = llllllllllllIllIlIlIIIlllIIlIIIl.length;
            int llllllllllllIllIlIlIIIlllIIIllll = Databits.llIlIlIllIIIll[0];
            while (lIIlIlIIlIIIIlII(llllllllllllIllIlIlIIIlllIIIllll, llllllllllllIllIlIlIIIlllIIlIIII)) {
                final Databits llllllllllllIllIlIlIIIlllIIlIIlI = llllllllllllIllIlIlIIIlllIIlIIIl[llllllllllllIllIlIlIIIlllIIIllll];
                if (lIIlIlIIlIIIIlIl(llllllllllllIllIlIlIIIlllIIlIIlI.value, llllllllllllIllIlIlIIIlllIIIllIl)) {
                    return llllllllllllIllIlIlIIIlllIIlIIlI;
                }
                ++llllllllllllIllIlIlIIIlllIIIllll;
                "".length();
                if (-(0x67 ^ 0x63) > 0) {
                    return null;
                }
            }
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(Databits.llIlIlIllIIIIl[Databits.llIlIlIllIIIll[0]]).append(Databits.class.getSimpleName()).append(Databits.llIlIlIllIIIIl[Databits.llIlIlIllIIIll[1]]).append(llllllllllllIllIlIlIIIlllIIIllIl)));
        }
        
        private Databits(final int llllllllllllIllIlIlIIIlllIIlllll) {
            this.value = llllllllllllIllIlIlIIIlllIIlllll;
        }
        
        private static void lIIlIlIIlIIIIIll() {
            (llIlIlIllIIIll = new int[9])[0] = ((49 + 125 - 167 + 192 ^ 111 + 96 - 198 + 138) & (0x1C ^ 0x3A ^ (0xDA ^ 0xA8) ^ -" ".length()));
            Databits.llIlIlIllIIIll[1] = " ".length();
            Databits.llIlIlIllIIIll[2] = "  ".length();
            Databits.llIlIlIllIIIll[3] = (0x1B ^ 0x44 ^ (0x4B ^ 0x11));
            Databits.llIlIlIllIIIll[4] = "   ".length();
            Databits.llIlIlIllIIIll[5] = (0x6A ^ 0x61 ^ (0x88 ^ 0x85));
            Databits.llIlIlIllIIIll[6] = (0x14 ^ 0x10);
            Databits.llIlIlIllIIIll[7] = (86 + 78 - 159 + 133 ^ 33 + 80 + 16 + 12);
            Databits.llIlIlIllIIIll[8] = (0x50 ^ 0x58);
        }
        
        private static boolean lIIlIlIIlIIIIlII(final int llllllllllllIllIlIlIIIllIlIlllIl, final int llllllllllllIllIlIlIIIllIlIlllII) {
            return llllllllllllIllIlIlIIIllIlIlllIl < llllllllllllIllIlIlIIIllIlIlllII;
        }
    }
}
