// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.Recycler;
import java.nio.ByteOrder;
import java.util.Locale;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.PlatformDependent;
import java.nio.charset.CoderResult;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharacterCodingException;
import io.netty.util.CharsetUtil;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.CharBuffer;
import io.netty.util.internal.logging.InternalLogger;

public final class ByteBufUtil
{
    private static final /* synthetic */ int[] llIlIIllIlllIl;
    private static final /* synthetic */ char[] HEXDUMP_TABLE;
    private static final /* synthetic */ int THREAD_LOCAL_BUFFER_SIZE;
    private static final /* synthetic */ String[] llIlIIllIlllII;
    private static final /* synthetic */ InternalLogger logger;
    
    private static boolean lIIlIIllIIIllIll(final int llllllllllllIllIlIlllIIlIllIIlll) {
        return llllllllllllIllIlIlllIIlIllIIlll == 0;
    }
    
    public static String hexDump(final ByteBuf llllllllllllIllIlIlllIlIlIlllIlI, final int llllllllllllIllIlIlllIlIlIlllIIl, final int llllllllllllIllIlIlllIlIlIlllIII) {
        if (lIIlIIllIIIllIlI(llllllllllllIllIlIlllIlIlIlllIII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[0]]).append(llllllllllllIllIlIlllIlIlIlllIII)));
        }
        if (lIIlIIllIIIllIll(llllllllllllIllIlIlllIlIlIlllIII)) {
            return ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[1]];
        }
        final int llllllllllllIllIlIlllIlIlIllIlll = llllllllllllIllIlIlllIlIlIlllIIl + llllllllllllIllIlIlllIlIlIlllIII;
        final char[] llllllllllllIllIlIlllIlIlIllIllI = new char[llllllllllllIllIlIlllIlIlIlllIII << ByteBufUtil.llIlIIllIlllIl[1]];
        int llllllllllllIllIlIlllIlIlIllIlIl = llllllllllllIllIlIlllIlIlIlllIIl;
        int llllllllllllIllIlIlllIlIlIllIlII = ByteBufUtil.llIlIIllIlllIl[0];
        while (lIIlIIllIIIlllII(llllllllllllIllIlIlllIlIlIllIlIl, llllllllllllIllIlIlllIlIlIllIlll)) {
            System.arraycopy(ByteBufUtil.HEXDUMP_TABLE, llllllllllllIllIlIlllIlIlIlllIlI.getUnsignedByte(llllllllllllIllIlIlllIlIlIllIlIl) << ByteBufUtil.llIlIIllIlllIl[1], llllllllllllIllIlIlllIlIlIllIllI, llllllllllllIllIlIlllIlIlIllIlII, ByteBufUtil.llIlIIllIlllIl[2]);
            ++llllllllllllIllIlIlllIlIlIllIlIl;
            llllllllllllIllIlIlllIlIlIllIlII += 2;
            "".length();
            if (((0x41 ^ 0x3F ^ (0x53 ^ 0x35)) & (0x24 ^ 0x6E ^ (0x96 ^ 0xC4) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return new String(llllllllllllIllIlIlllIlIlIllIllI);
    }
    
    private static boolean lIIlIIllIIlIIlIl(final int llllllllllllIllIlIlllIIllIIIIIII, final int llllllllllllIllIlIlllIIlIlllllll) {
        return llllllllllllIllIlIlllIIllIIIIIII == llllllllllllIllIlIlllIIlIlllllll;
    }
    
    private static int lIIlIIllIIIlllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public static ByteBuf encodeString(final ByteBufAllocator llllllllllllIllIlIlllIlIIIIIIIII, final CharBuffer llllllllllllIllIlIlllIIlllllllII, final Charset llllllllllllIllIlIlllIIllllllllI) {
        return encodeString0(llllllllllllIllIlIlllIlIIIIIIIII, (boolean)(ByteBufUtil.llIlIIllIlllIl[0] != 0), llllllllllllIllIlIlllIIlllllllII, llllllllllllIllIlIlllIIllllllllI);
    }
    
    static String decodeString(final ByteBuffer llllllllllllIllIlIlllIIlllIIlIII, final Charset llllllllllllIllIlIlllIIlllIIlIll) {
        final CharsetDecoder llllllllllllIllIlIlllIIlllIIlIlI = CharsetUtil.getDecoder(llllllllllllIllIlIlllIIlllIIlIll);
        final CharBuffer llllllllllllIllIlIlllIIlllIIlIIl = CharBuffer.allocate((int)(llllllllllllIllIlIlllIIlllIIlIII.remaining() * (double)llllllllllllIllIlIlllIIlllIIlIlI.maxCharsPerByte()));
        try {
            CoderResult llllllllllllIllIlIlllIIlllIIlllI = llllllllllllIllIlIlllIIlllIIlIlI.decode(llllllllllllIllIlIlllIIlllIIlIII, llllllllllllIllIlIlllIIlllIIlIIl, (boolean)(ByteBufUtil.llIlIIllIlllIl[1] != 0));
            if (lIIlIIllIIIllIll(llllllllllllIllIlIlllIIlllIIlllI.isUnderflow() ? 1 : 0)) {
                llllllllllllIllIlIlllIIlllIIlllI.throwException();
            }
            llllllllllllIllIlIlllIIlllIIlllI = llllllllllllIllIlIlllIIlllIIlIlI.flush(llllllllllllIllIlIlllIIlllIIlIIl);
            if (lIIlIIllIIIllIll(llllllllllllIllIlIlllIIlllIIlllI.isUnderflow() ? 1 : 0)) {
                llllllllllllIllIlIlllIIlllIIlllI.throwException();
            }
            "".length();
            if (-(0x85 ^ 0x81) >= 0) {
                return null;
            }
        }
        catch (CharacterCodingException llllllllllllIllIlIlllIIlllIIllIl) {
            throw new IllegalStateException(llllllllllllIllIlIlllIIlllIIllIl);
        }
        return llllllllllllIllIlIlllIIlllIIlIIl.flip().toString();
    }
    
    private static void lIIlIIllIIIllIII() {
        (llIlIIllIlllII = new String[ByteBufUtil.llIlIIllIlllIl[24]])[ByteBufUtil.llIlIIllIlllIl[0]] = lIIlIIllIIIlIlIl("Jj0fID8iYlE=", "JXqGK");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[1]] = lIIlIIllIIIlIlIl("", "RtHiq");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[2]] = lIIlIIllIIIlIllI("oV0jfAROIwTA7WE5uWD27kTdJD5lFIWj", "nQpWy");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[3]] = lIIlIIllIIIlIlIl("HSFdGCgAOgpYLBgiHBUsACEBWDkNPhY=", "tNsvM");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[15]] = lIIlIIllIIIlIllI("PHBnZSFnY86+K4WnN3OZNw==", "JTEpB");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[17]] = lIIlIIllIIIlIlIl("Gj8EADsDNBA=", "oQtoT");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[18]] = lIIlIIllIIIlIlll("LLyOFT0W1ujhIP9bnCw21X/VgV5v3mfyJx0TO6kB8k8=", "KKNUK");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[5]] = lIIlIIllIIIlIlIl("GQErKxEN", "inDGt");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[19]] = lIIlIIllIIIlIllI("ZF/h7CaDFZLtgCqHmmk7ZSryVirSb2gNBS1dpsPGEuY=", "MHgOB");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[20]] = lIIlIIllIIIlIlll("OOw4zdcwfIdLek20kirjkdJ7M/geUailFMb7YxDXC2Zkv0DjBfzWYPmRak7055bK3mYjDiPhd7c=", "wSfhV");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[21]] = lIIlIIllIIIlIllI("JtalNEfURkFGZM2lU1SjvEBanLmJoUMNbBm7ndegNppPYO93dJs90Q==", "eYDAX");
        ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[23]] = lIIlIIllIIIlIlll("eRxvppMuB2aQFyQU40CVWWzRoKEEJA7XG9CY9d7AuN4yGs5RbsFH6q+Qd86z/2MN", "iZSfI");
    }
    
    private static boolean lIIlIIllIIlIIllI(final int llllllllllllIllIlIlllIIlIllIIlIl) {
        return llllllllllllIllIlIlllIIlIllIIlIl >= 0;
    }
    
    private static boolean lIIlIIllIIlIIlII(final int llllllllllllIllIlIlllIIlIlllIlII, final int llllllllllllIllIlIlllIIlIlllIIll) {
        return llllllllllllIllIlIlllIIlIlllIlII <= llllllllllllIllIlIlllIIlIlllIIll;
    }
    
    public static int compare(final ByteBuf llllllllllllIllIlIlllIlIIlIlllII, final ByteBuf llllllllllllIllIlIlllIlIIllIIlII) {
        final int llllllllllllIllIlIlllIlIIllIIIll = llllllllllllIllIlIlllIlIIlIlllII.readableBytes();
        final int llllllllllllIllIlIlllIlIIllIIIlI = llllllllllllIllIlIlllIlIIllIIlII.readableBytes();
        final int llllllllllllIllIlIlllIlIIllIIIIl = Math.min(llllllllllllIllIlIlllIlIIllIIIll, llllllllllllIllIlIlllIlIIllIIIlI);
        final int llllllllllllIllIlIlllIlIIllIIIII = llllllllllllIllIlIlllIlIIllIIIIl >>> ByteBufUtil.llIlIIllIlllIl[2];
        final int llllllllllllIllIlIlllIlIIlIlllll = llllllllllllIllIlIlllIlIIllIIIIl & ByteBufUtil.llIlIIllIlllIl[3];
        int llllllllllllIllIlIlllIlIIlIllllI = llllllllllllIllIlIlllIlIIlIlllII.readerIndex();
        int llllllllllllIllIlIlllIlIIlIlllIl = llllllllllllIllIlIlllIlIIllIIlII.readerIndex();
        if (lIIlIIllIIIlllIl(llllllllllllIllIlIlllIlIIlIlllII.order(), llllllllllllIllIlIlllIlIIllIIlII.order())) {
            int llllllllllllIllIlIlllIlIIllIllII = llllllllllllIllIlIlllIlIIllIIIII;
            while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIIllIllII)) {
                final long llllllllllllIllIlIlllIlIIllIlllI = llllllllllllIllIlIlllIlIIlIlllII.getUnsignedInt(llllllllllllIllIlIlllIlIIlIllllI);
                final long llllllllllllIllIlIlllIlIIllIllIl = llllllllllllIllIlIlllIlIIllIIlII.getUnsignedInt(llllllllllllIllIlIlllIlIIlIlllIl);
                if (lIIlIIllIIIllllI(lIIlIIllIIlIIIlI(llllllllllllIllIlIlllIlIIllIlllI, llllllllllllIllIlIlllIlIIllIllIl))) {
                    return ByteBufUtil.llIlIIllIlllIl[1];
                }
                if (lIIlIIllIIIllIlI(lIIlIIllIIlIIIlI(llllllllllllIllIlIlllIlIIllIlllI, llllllllllllIllIlIlllIlIIllIllIl))) {
                    return ByteBufUtil.llIlIIllIlllIl[6];
                }
                llllllllllllIllIlIlllIlIIlIllllI += 4;
                llllllllllllIllIlIlllIlIIlIlllIl += 4;
                --llllllllllllIllIlIlllIlIIllIllII;
                "".length();
                if (((34 + 183 - 49 + 26 ^ 80 + 85 - 99 + 95) & (0xE6 ^ 0xB9 ^ (0xA8 ^ 0x94) ^ -" ".length())) != 0x0) {
                    return (9 + 62 - 10 + 88 ^ 40 + 92 - 103 + 103) & (69 + 47 - 76 + 95 ^ 21 + 139 - 96 + 86 ^ -" ".length());
                }
            }
            "".length();
            if ("  ".length() < 0) {
                return (0x45 ^ 0x51 ^ (0xE9 ^ 0xA9)) & (0x5C ^ 0x1E ^ (0xBD ^ 0xAB) ^ -" ".length());
            }
        }
        else {
            int llllllllllllIllIlIlllIlIIllIlIIl = llllllllllllIllIlIlllIlIIllIIIII;
            while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIIllIlIIl)) {
                final long llllllllllllIllIlIlllIlIIllIlIll = llllllllllllIllIlIlllIlIIlIlllII.getUnsignedInt(llllllllllllIllIlIlllIlIIlIllllI);
                final long llllllllllllIllIlIlllIlIIllIlIlI = (long)swapInt(llllllllllllIllIlIlllIlIIllIIlII.getInt(llllllllllllIllIlIlllIlIIlIlllIl)) & 0xFFFFFFFFL;
                if (lIIlIIllIIIllllI(lIIlIIllIIlIIIlI(llllllllllllIllIlIlllIlIIllIlIll, llllllllllllIllIlIlllIlIIllIlIlI))) {
                    return ByteBufUtil.llIlIIllIlllIl[1];
                }
                if (lIIlIIllIIIllIlI(lIIlIIllIIlIIIlI(llllllllllllIllIlIlllIlIIllIlIll, llllllllllllIllIlIlllIlIIllIlIlI))) {
                    return ByteBufUtil.llIlIIllIlllIl[6];
                }
                llllllllllllIllIlIlllIlIIlIllllI += 4;
                llllllllllllIllIlIlllIlIIlIlllIl += 4;
                --llllllllllllIllIlIlllIlIIllIlIIl;
                "".length();
                if (-"  ".length() >= 0) {
                    return (0x15 ^ 0x0) & ~(0x99 ^ 0x8C);
                }
            }
        }
        int llllllllllllIllIlIlllIlIIllIIllI = llllllllllllIllIlIlllIlIIlIlllll;
        while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIIllIIllI)) {
            final short llllllllllllIllIlIlllIlIIllIlIII = llllllllllllIllIlIlllIlIIlIlllII.getUnsignedByte(llllllllllllIllIlIlllIlIIlIllllI);
            final short llllllllllllIllIlIlllIlIIllIIlll = llllllllllllIllIlIlllIlIIllIIlII.getUnsignedByte(llllllllllllIllIlIlllIlIIlIlllIl);
            if (lIIlIIllIIlIIIll(llllllllllllIllIlIlllIlIIllIlIII, llllllllllllIllIlIlllIlIIllIIlll)) {
                return ByteBufUtil.llIlIIllIlllIl[1];
            }
            if (lIIlIIllIIIlllII(llllllllllllIllIlIlllIlIIllIlIII, llllllllllllIllIlIlllIlIIllIIlll)) {
                return ByteBufUtil.llIlIIllIlllIl[6];
            }
            ++llllllllllllIllIlIlllIlIIlIllllI;
            ++llllllllllllIllIlIlllIlIIlIlllIl;
            --llllllllllllIllIlIlllIlIIllIIllI;
            "".length();
            if (-" ".length() == " ".length()) {
                return (0x43 ^ 0x2F ^ (0x1B ^ 0x41)) & ("   ".length() ^ (0x23 ^ 0x16) ^ -" ".length());
            }
        }
        return llllllllllllIllIlIlllIlIIllIIIll - llllllllllllIllIlIlllIlIIllIIIlI;
    }
    
    private static boolean lIIlIIllIIlIlIII(final int llllllllllllIllIlIlllIIlIllIIIIl) {
        return llllllllllllIllIlIlllIIlIllIIIIl <= 0;
    }
    
    public static int swapMedium(final int llllllllllllIllIlIlllIlIIIlllllI) {
        int llllllllllllIllIlIlllIlIIIllllIl = (llllllllllllIllIlIlllIlIIIlllllI << ByteBufUtil.llIlIIllIlllIl[7] & ByteBufUtil.llIlIIllIlllIl[8]) | (llllllllllllIllIlIlllIlIIIlllllI & ByteBufUtil.llIlIIllIlllIl[9]) | (llllllllllllIllIlIlllIlIIIlllllI >>> ByteBufUtil.llIlIIllIlllIl[7] & ByteBufUtil.llIlIIllIlllIl[10]);
        if (lIIlIIllIIlIIIIl(llllllllllllIllIlIlllIlIIIllllIl & ByteBufUtil.llIlIIllIlllIl[11])) {
            llllllllllllIllIlIlllIlIIIllllIl |= ByteBufUtil.llIlIIllIlllIl[12];
        }
        return llllllllllllIllIlIlllIlIIIllllIl;
    }
    
    public static ByteBuf threadLocalDirectBuffer() {
        if (lIIlIIllIIlIlIII(ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE)) {
            return null;
        }
        if (lIIlIIllIIlIIIIl(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            return ThreadLocalUnsafeDirectByteBuf.newInstance();
        }
        return ThreadLocalDirectByteBuf.newInstance();
    }
    
    private ByteBufUtil() {
    }
    
    private static String lIIlIIllIIIlIllI(final String llllllllllllIllIlIlllIIllIlIIIII, final String llllllllllllIllIlIlllIIllIIlllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlllIIllIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllIIllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlllIIllIlIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlllIIllIlIIIlI.init(ByteBufUtil.llIlIIllIlllIl[2], llllllllllllIllIlIlllIIllIlIIIll);
            return new String(llllllllllllIllIlIlllIIllIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllIIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlllIIllIlIIIIl) {
            llllllllllllIllIlIlllIIllIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIllIIlIIIII(final int llllllllllllIllIlIlllIIlIlIlllII, final int llllllllllllIllIlIlllIIlIlIllIll) {
        return llllllllllllIllIlIlllIIlIlIlllII != llllllllllllIllIlIlllIIlIlIllIll;
    }
    
    private static String lIIlIIllIIIlIlll(final String llllllllllllIllIlIlllIIllIlIllIl, final String llllllllllllIllIlIlllIIllIlIllII) {
        try {
            final SecretKeySpec llllllllllllIllIlIlllIIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllIIllIlIllII.getBytes(StandardCharsets.UTF_8)), ByteBufUtil.llIlIIllIlllIl[19]), "DES");
            final Cipher llllllllllllIllIlIlllIIllIlIllll = Cipher.getInstance("DES");
            llllllllllllIllIlIlllIIllIlIllll.init(ByteBufUtil.llIlIIllIlllIl[2], llllllllllllIllIlIlllIIllIllIIII);
            return new String(llllllllllllIllIlIlllIIllIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlllIIllIlIlllI) {
            llllllllllllIllIlIlllIIllIlIlllI.printStackTrace();
            return null;
        }
    }
    
    private static int lIIlIIllIIlIIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public static boolean equals(final ByteBuf llllllllllllIllIlIlllIlIlIIIlIlI, final ByteBuf llllllllllllIllIlIlllIlIlIIIlIIl) {
        final int llllllllllllIllIlIlllIlIlIIIlIII = llllllllllllIllIlIlllIlIlIIIlIlI.readableBytes();
        if (lIIlIIllIIlIIIII(llllllllllllIllIlIlllIlIlIIIlIII, llllllllllllIllIlIlllIlIlIIIlIIl.readableBytes())) {
            return ByteBufUtil.llIlIIllIlllIl[0] != 0;
        }
        final int llllllllllllIllIlIlllIlIlIIIIlll = llllllllllllIllIlIlllIlIlIIIlIII >>> ByteBufUtil.llIlIIllIlllIl[3];
        final int llllllllllllIllIlIlllIlIlIIIIllI = llllllllllllIllIlIlllIlIlIIIlIII & ByteBufUtil.llIlIIllIlllIl[5];
        int llllllllllllIllIlIlllIlIlIIIIlIl = llllllllllllIllIlIlllIlIlIIIlIlI.readerIndex();
        int llllllllllllIllIlIlllIlIlIIIIlII = llllllllllllIllIlIlllIlIlIIIlIIl.readerIndex();
        if (lIIlIIllIIIlllIl(llllllllllllIllIlIlllIlIlIIIlIlI.order(), llllllllllllIllIlIlllIlIlIIIlIIl.order())) {
            int llllllllllllIllIlIlllIlIlIIIllIl = llllllllllllIllIlIlllIlIlIIIIlll;
            while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIlIIIllIl)) {
                if (lIIlIIllIIlIIIIl(lIIlIIllIIIlllll(llllllllllllIllIlIlllIlIlIIIlIlI.getLong(llllllllllllIllIlIlllIlIlIIIIlIl), llllllllllllIllIlIlllIlIlIIIlIIl.getLong(llllllllllllIllIlIlllIlIlIIIIlII)))) {
                    return ByteBufUtil.llIlIIllIlllIl[0] != 0;
                }
                llllllllllllIllIlIlllIlIlIIIIlIl += 8;
                llllllllllllIllIlIlllIlIlIIIIlII += 8;
                --llllllllllllIllIlIlllIlIlIIIllIl;
                "".length();
                if (((0x95 ^ 0xB2 ^ (0x2C ^ 0x3F)) & (112 + 153 - 220 + 119 ^ 95 + 100 - 155 + 104 ^ -" ".length())) != 0x0) {
                    return ((77 + 34 - 63 + 102 ^ 59 + 35 - 63 + 116) & (145 + 41 - 42 + 42 ^ 165 + 83 - 223 + 166 ^ -" ".length())) != 0x0;
                }
            }
            "".length();
            if (-"   ".length() > 0) {
                return (("   ".length() ^ (0x50 ^ 0x70)) & (0x34 ^ 0x75 ^ (0xB ^ 0x69) ^ -" ".length())) != 0x0;
            }
        }
        else {
            int llllllllllllIllIlIlllIlIlIIIllII = llllllllllllIllIlIlllIlIlIIIIlll;
            while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIlIIIllII)) {
                if (lIIlIIllIIlIIIIl(lIIlIIllIIIlllll(llllllllllllIllIlIlllIlIlIIIlIlI.getLong(llllllllllllIllIlIlllIlIlIIIIlIl), swapLong(llllllllllllIllIlIlllIlIlIIIlIIl.getLong(llllllllllllIllIlIlllIlIlIIIIlII))))) {
                    return ByteBufUtil.llIlIIllIlllIl[0] != 0;
                }
                llllllllllllIllIlIlllIlIlIIIIlIl += 8;
                llllllllllllIllIlIlllIlIlIIIIlII += 8;
                --llllllllllllIllIlIlllIlIlIIIllII;
                "".length();
                if (-" ".length() > 0) {
                    return ((0x5C ^ 0x69) & ~(0xA4 ^ 0x91)) != 0x0;
                }
            }
        }
        int llllllllllllIllIlIlllIlIlIIIlIll = llllllllllllIllIlIlllIlIlIIIIllI;
        while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIlIIIlIll)) {
            if (lIIlIIllIIlIIIII(llllllllllllIllIlIlllIlIlIIIlIlI.getByte(llllllllllllIllIlIlllIlIlIIIIlIl), llllllllllllIllIlIlllIlIlIIIlIIl.getByte(llllllllllllIllIlIlllIlIlIIIIlII))) {
                return ByteBufUtil.llIlIIllIlllIl[0] != 0;
            }
            ++llllllllllllIllIlIlllIlIlIIIIlIl;
            ++llllllllllllIllIlIlllIlIlIIIIlII;
            --llllllllllllIllIlIlllIlIlIIIlIll;
            "".length();
            if ("  ".length() <= 0) {
                return ((0x1D ^ 0x54) & ~(0x16 ^ 0x5F)) != 0x0;
            }
        }
        return ByteBufUtil.llIlIIllIlllIl[1] != 0;
    }
    
    public static int indexOf(final ByteBuf llllllllllllIllIlIlllIlIIlIIlIll, final int llllllllllllIllIlIlllIlIIlIIlIlI, final int llllllllllllIllIlIlllIlIIlIIlIIl, final byte llllllllllllIllIlIlllIlIIlIIlIII) {
        if (lIIlIIllIIlIIlII(llllllllllllIllIlIlllIlIIlIIlIlI, llllllllllllIllIlIlllIlIIlIIlIIl)) {
            return firstIndexOf(llllllllllllIllIlIlllIlIIlIIlIll, llllllllllllIllIlIlllIlIIlIIlIlI, llllllllllllIllIlIlllIlIIlIIlIIl, llllllllllllIllIlIlllIlIIlIIlIII);
        }
        return lastIndexOf(llllllllllllIllIlIlllIlIIlIIlIll, llllllllllllIllIlIlllIlIIlIIlIlI, llllllllllllIllIlIlllIlIIlIIlIIl, llllllllllllIllIlIlllIlIIlIIlIII);
    }
    
    static ByteBuf encodeString0(final ByteBufAllocator llllllllllllIllIlIlllIIllllIIIII, final boolean llllllllllllIllIlIlllIIlllIlllll, final CharBuffer llllllllllllIllIlIlllIIllllIIllI, final Charset llllllllllllIllIlIlllIIlllIlllIl) {
        final CharsetEncoder llllllllllllIllIlIlllIIllllIIlII = CharsetUtil.getEncoder(llllllllllllIllIlIlllIIlllIlllIl);
        final int llllllllllllIllIlIlllIIllllIIIll = (int)(llllllllllllIllIlIlllIIllllIIllI.remaining() * (double)llllllllllllIllIlIlllIIllllIIlII.maxBytesPerChar());
        boolean llllllllllllIllIlIlllIIllllIIIlI = ByteBufUtil.llIlIIllIlllIl[1] != 0;
        ByteBuf llllllllllllIllIlIlllIIllllIIIIl;
        if (lIIlIIllIIlIIIIl(llllllllllllIllIlIlllIIlllIlllll ? 1 : 0)) {
            final ByteBuf llllllllllllIllIlIlllIIllllIllIl = llllllllllllIllIlIlllIIllllIIIII.heapBuffer(llllllllllllIllIlIlllIIllllIIIll);
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIllIlIlllIIllllIIIIl = llllllllllllIllIlIlllIIllllIIIII.buffer(llllllllllllIllIlIlllIIllllIIIll);
        }
        try {
            final ByteBuffer llllllllllllIllIlIlllIIllllIllII = llllllllllllIllIlIlllIIllllIIIIl.internalNioBuffer(ByteBufUtil.llIlIIllIlllIl[0], llllllllllllIllIlIlllIIllllIIIll);
            final int llllllllllllIllIlIlllIIllllIlIll = llllllllllllIllIlIlllIIllllIllII.position();
            CoderResult llllllllllllIllIlIlllIIllllIlIlI = llllllllllllIllIlIlllIIllllIIlII.encode(llllllllllllIllIlIlllIIllllIIllI, llllllllllllIllIlIlllIIllllIllII, (boolean)(ByteBufUtil.llIlIIllIlllIl[1] != 0));
            if (lIIlIIllIIIllIll(llllllllllllIllIlIlllIIllllIlIlI.isUnderflow() ? 1 : 0)) {
                llllllllllllIllIlIlllIIllllIlIlI.throwException();
            }
            llllllllllllIllIlIlllIIllllIlIlI = llllllllllllIllIlIlllIIllllIIlII.flush(llllllllllllIllIlIlllIIllllIllII);
            if (lIIlIIllIIIllIll(llllllllllllIllIlIlllIIllllIlIlI.isUnderflow() ? 1 : 0)) {
                llllllllllllIllIlIlllIIllllIlIlI.throwException();
            }
            llllllllllllIllIlIlllIIllllIIIIl.writerIndex(llllllllllllIllIlIlllIIllllIIIIl.writerIndex() + llllllllllllIllIlIlllIIllllIllII.position() - llllllllllllIllIlIlllIIllllIlIll);
            "".length();
            llllllllllllIllIlIlllIIllllIIIlI = (ByteBufUtil.llIlIIllIlllIl[0] != 0);
            final double llllllllllllIllIlIlllIIlllIlIlIl = (double)llllllllllllIllIlIlllIIllllIIIIl;
            return (ByteBuf)llllllllllllIllIlIlllIIlllIlIlIl;
        }
        catch (CharacterCodingException llllllllllllIllIlIlllIIllllIlIIl) {
            throw new IllegalStateException(llllllllllllIllIlIlllIIllllIlIIl);
        }
        finally {
            if (lIIlIIllIIlIIIIl(llllllllllllIllIlIlllIIllllIIIlI ? 1 : 0)) {
                llllllllllllIllIlIlllIIllllIIIIl.release();
                "".length();
            }
        }
    }
    
    private static int firstIndexOf(final ByteBuf llllllllllllIllIlIlllIlIIIIllIll, int llllllllllllIllIlIlllIlIIIIlIllI, final int llllllllllllIllIlIlllIlIIIIlIlIl, final byte llllllllllllIllIlIlllIlIIIIllIII) {
        llllllllllllIllIlIlllIlIIIIlIllI = Math.max(llllllllllllIllIlIlllIlIIIIlIllI, ByteBufUtil.llIlIIllIlllIl[0]);
        if (!lIIlIIllIIIlllII(llllllllllllIllIlIlllIlIIIIlIllI, llllllllllllIllIlIlllIlIIIIlIlIl) || lIIlIIllIIIllIll(llllllllllllIllIlIlllIlIIIIllIll.capacity())) {
            return ByteBufUtil.llIlIIllIlllIl[6];
        }
        int llllllllllllIllIlIlllIlIIIIlllII = llllllllllllIllIlIlllIlIIIIlIllI;
        while (lIIlIIllIIIlllII(llllllllllllIllIlIlllIlIIIIlllII, llllllllllllIllIlIlllIlIIIIlIlIl)) {
            if (lIIlIIllIIlIIlIl(llllllllllllIllIlIlllIlIIIIllIll.getByte(llllllllllllIllIlIlllIlIIIIlllII), llllllllllllIllIlIlllIlIIIIllIII)) {
                return llllllllllllIllIlIlllIlIIIIlllII;
            }
            ++llllllllllllIllIlIlllIlIIIIlllII;
            "".length();
            if (null != null) {
                return (27 + 81 - 58 + 97 ^ 10 + 2 + 22 + 148) & (114 + 103 - 36 + 8 ^ 81 + 145 - 122 + 48 ^ -" ".length());
            }
        }
        return ByteBufUtil.llIlIIllIlllIl[6];
    }
    
    private static boolean lIIlIIllIIlIIIll(final int llllllllllllIllIlIlllIIlIlllIIII, final int llllllllllllIllIlIlllIIlIllIllll) {
        return llllllllllllIllIlIlllIIlIlllIIII > llllllllllllIllIlIlllIIlIllIllll;
    }
    
    private static boolean lIIlIIllIIlIIIIl(final int llllllllllllIllIlIlllIIlIllIlIIl) {
        return llllllllllllIllIlIlllIIlIllIlIIl != 0;
    }
    
    public static long swapLong(final long llllllllllllIllIlIlllIlIIIllIlIl) {
        return Long.reverseBytes(llllllllllllIllIlIlllIlIIIllIlIl);
    }
    
    static {
        lIIlIIllIIIllIIl();
        lIIlIIllIIIllIII();
        logger = InternalLoggerFactory.getInstance(ByteBufUtil.class);
        HEXDUMP_TABLE = new char[ByteBufUtil.llIlIIllIlllIl[13]];
        final char[] llllllllllllIllIlIlllIIllIlllIlI = ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[2]].toCharArray();
        int llllllllllllIllIlIlllIIllIllllIl = ByteBufUtil.llIlIIllIlllIl[0];
        while (lIIlIIllIIIlllII(llllllllllllIllIlIlllIIllIllllIl, ByteBufUtil.llIlIIllIlllIl[14])) {
            ByteBufUtil.HEXDUMP_TABLE[llllllllllllIllIlIlllIIllIllllIl << ByteBufUtil.llIlIIllIlllIl[1]] = llllllllllllIllIlIlllIIllIlllIlI[llllllllllllIllIlIlllIIllIllllIl >>> ByteBufUtil.llIlIIllIlllIl[15] & ByteBufUtil.llIlIIllIlllIl[16]];
            ByteBufUtil.HEXDUMP_TABLE[(llllllllllllIllIlIlllIIllIllllIl << ByteBufUtil.llIlIIllIlllIl[1]) + ByteBufUtil.llIlIIllIlllIl[1]] = llllllllllllIllIlIlllIIllIlllIlI[llllllllllllIllIlIlllIIllIllllIl & ByteBufUtil.llIlIIllIlllIl[16]];
            ++llllllllllllIllIlIlllIIllIllllIl;
            "".length();
            if (null != null) {
                return;
            }
        }
        final String llllllllllllIllIlIlllIIllIlllIIl = SystemPropertyUtil.get(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[3]], ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[15]]).toLowerCase(Locale.US).trim();
        ByteBufAllocator llllllllllllIllIlIlllIIllIlllIII = null;
        if (lIIlIIllIIlIIIIl(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[17]].equals(llllllllllllIllIlIlllIIllIlllIIl) ? 1 : 0)) {
            final ByteBufAllocator llllllllllllIllIlIlllIIllIllllII = UnpooledByteBufAllocator.DEFAULT;
            ByteBufUtil.logger.debug(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[18]], llllllllllllIllIlIlllIIllIlllIIl);
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else if (lIIlIIllIIlIIIIl(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[5]].equals(llllllllllllIllIlIlllIIllIlllIIl) ? 1 : 0)) {
            final ByteBufAllocator llllllllllllIllIlIlllIIllIlllIll = PooledByteBufAllocator.DEFAULT;
            ByteBufUtil.logger.debug(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[19]], llllllllllllIllIlIlllIIllIlllIIl);
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            llllllllllllIllIlIlllIIllIlllIII = UnpooledByteBufAllocator.DEFAULT;
            ByteBufUtil.logger.debug(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[20]], llllllllllllIllIlIlllIIllIlllIIl);
        }
        DEFAULT_ALLOCATOR = llllllllllllIllIlIlllIIllIlllIII;
        THREAD_LOCAL_BUFFER_SIZE = SystemPropertyUtil.getInt(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[21]], ByteBufUtil.llIlIIllIlllIl[22]);
        ByteBufUtil.logger.debug(ByteBufUtil.llIlIIllIlllII[ByteBufUtil.llIlIIllIlllIl[23]], (Object)ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE);
    }
    
    private static boolean lIIlIIllIIIlllII(final int llllllllllllIllIlIlllIIlIllllIII, final int llllllllllllIllIlIlllIIlIlllIlll) {
        return llllllllllllIllIlIlllIIlIllllIII < llllllllllllIllIlIlllIIlIlllIlll;
    }
    
    public static String hexDump(final ByteBuf llllllllllllIllIlIlllIlIllIIIIlI) {
        return hexDump(llllllllllllIllIlIlllIlIllIIIIlI, llllllllllllIllIlIlllIlIllIIIIlI.readerIndex(), llllllllllllIllIlIlllIlIllIIIIlI.readableBytes());
    }
    
    public static short swapShort(final short llllllllllllIllIlIlllIlIIlIIIIlI) {
        return Short.reverseBytes(llllllllllllIllIlIlllIlIIlIIIIlI);
    }
    
    private static boolean lIIlIIllIIlIIlll(final int llllllllllllIllIlIlllIIlIlllllII, final int llllllllllllIllIlIlllIIlIllllIll) {
        return llllllllllllIllIlIlllIIlIlllllII >= llllllllllllIllIlIlllIIlIllllIll;
    }
    
    private static boolean lIIlIIllIIIlllIl(final Object llllllllllllIllIlIlllIIlIllIllII, final Object llllllllllllIllIlIlllIIlIllIlIll) {
        return llllllllllllIllIlIlllIIlIllIllII == llllllllllllIllIlIlllIIlIllIlIll;
    }
    
    private static int lastIndexOf(final ByteBuf llllllllllllIllIlIlllIlIIIIIllII, int llllllllllllIllIlIlllIlIIIIIIlll, final int llllllllllllIllIlIlllIlIIIIIIllI, final byte llllllllllllIllIlIlllIlIIIIIIlIl) {
        llllllllllllIllIlIlllIlIIIIIIlll = Math.min(llllllllllllIllIlIlllIlIIIIIIlll, llllllllllllIllIlIlllIlIIIIIllII.capacity());
        if (!lIIlIIllIIlIIllI(llllllllllllIllIlIlllIlIIIIIIlll) || lIIlIIllIIIllIll(llllllllllllIllIlIlllIlIIIIIllII.capacity())) {
            return ByteBufUtil.llIlIIllIlllIl[6];
        }
        int llllllllllllIllIlIlllIlIIIIIllIl = llllllllllllIllIlIlllIlIIIIIIlll - ByteBufUtil.llIlIIllIlllIl[1];
        while (lIIlIIllIIlIIlll(llllllllllllIllIlIlllIlIIIIIllIl, llllllllllllIllIlIlllIlIIIIIIllI)) {
            if (lIIlIIllIIlIIlIl(llllllllllllIllIlIlllIlIIIIIllII.getByte(llllllllllllIllIlIlllIlIIIIIllIl), llllllllllllIllIlIlllIlIIIIIIlIl)) {
                return llllllllllllIllIlIlllIlIIIIIllIl;
            }
            --llllllllllllIllIlIlllIlIIIIIllIl;
            "".length();
            if ("   ".length() <= 0) {
                return (0x67 ^ 0x60) & ~(0x23 ^ 0x24);
            }
        }
        return ByteBufUtil.llIlIIllIlllIl[6];
    }
    
    private static boolean lIIlIIllIIIllIlI(final int llllllllllllIllIlIlllIIlIllIIIll) {
        return llllllllllllIllIlIlllIIlIllIIIll < 0;
    }
    
    private static void lIIlIIllIIIllIIl() {
        (llIlIIllIlllIl = new int[25])[0] = ((0xEE ^ 0xAD) & ~(0x6F ^ 0x2C));
        ByteBufUtil.llIlIIllIlllIl[1] = " ".length();
        ByteBufUtil.llIlIIllIlllIl[2] = "  ".length();
        ByteBufUtil.llIlIIllIlllIl[3] = "   ".length();
        ByteBufUtil.llIlIIllIlllIl[4] = (0x18 ^ 0x7D ^ (0xD7 ^ 0xAD));
        ByteBufUtil.llIlIIllIlllIl[5] = (0x9B ^ 0xC2 ^ (0x5 ^ 0x5B));
        ByteBufUtil.llIlIIllIlllIl[6] = -" ".length();
        ByteBufUtil.llIlIIllIlllIl[7] = (161 + 65 - 112 + 60 ^ 53 + 146 - 157 + 148);
        ByteBufUtil.llIlIIllIlllIl[8] = (-(0xFFFFB8FC & 0x4FF3) & (0xFFFF8BFF & 0xFF7CEF));
        ByteBufUtil.llIlIIllIlllIl[9] = (0xFFFFFFF2 & 0xFF0D);
        ByteBufUtil.llIlIIllIlllIl[10] = (0xA ^ 0x69) + (0x61 ^ 0x2A) - -(0x32 ^ 0x25) + (0x9C ^ 0xA6);
        ByteBufUtil.llIlIIllIlllIl[11] = (0xFFFFCD0F & 0x8032F0);
        ByteBufUtil.llIlIIllIlllIl[12] = -(0xFFFFF8CC & 0x1000733);
        ByteBufUtil.llIlIIllIlllIl[13] = (0xFFFFAEEF & 0x5510);
        ByteBufUtil.llIlIIllIlllIl[14] = (-(0xFFFFB5EE & 0x7EF5) & (0xFFFFBDF7 & 0x77EB));
        ByteBufUtil.llIlIIllIlllIl[15] = (0x16 ^ 0x12);
        ByteBufUtil.llIlIIllIlllIl[16] = (0xF4 ^ 0x86 ^ (0xD7 ^ 0xAA));
        ByteBufUtil.llIlIIllIlllIl[17] = (132 + 27 - 48 + 71 ^ 74 + 136 - 178 + 147);
        ByteBufUtil.llIlIIllIlllIl[18] = (0xC6 ^ 0xC0);
        ByteBufUtil.llIlIIllIlllIl[19] = (0x6B ^ 0x3F ^ (0x79 ^ 0x25));
        ByteBufUtil.llIlIIllIlllIl[20] = (" ".length() ^ (0x49 ^ 0x41));
        ByteBufUtil.llIlIIllIlllIl[21] = (0x2 ^ 0x58 ^ (0xD3 ^ 0x83));
        ByteBufUtil.llIlIIllIlllIl[22] = (0xFFFFFE62 & 0x1019D);
        ByteBufUtil.llIlIIllIlllIl[23] = (137 + 149 - 195 + 85 ^ 47 + 163 - 50 + 27);
        ByteBufUtil.llIlIIllIlllIl[24] = (0x60 ^ 0x5E ^ (0x0 ^ 0x32));
    }
    
    public static ByteBuf readBytes(final ByteBufAllocator llllllllllllIllIlIlllIlIIIlIllIl, final ByteBuf llllllllllllIllIlIlllIlIIIlIllII, final int llllllllllllIllIlIlllIlIIIlIIllI) {
        boolean llllllllllllIllIlIlllIlIIIlIlIlI = ByteBufUtil.llIlIIllIlllIl[1] != 0;
        final ByteBuf llllllllllllIllIlIlllIlIIIlIlIIl = llllllllllllIllIlIlllIlIIIlIllIl.buffer(llllllllllllIllIlIlllIlIIIlIIllI);
        try {
            llllllllllllIllIlIlllIlIIIlIllII.readBytes(llllllllllllIllIlIlllIlIIIlIlIIl);
            "".length();
            llllllllllllIllIlIlllIlIIIlIlIlI = (ByteBufUtil.llIlIIllIlllIl[0] != 0);
            final byte llllllllllllIllIlIlllIlIIIlIIIll = (byte)llllllllllllIllIlIlllIlIIIlIlIIl;
            return (ByteBuf)llllllllllllIllIlIlllIlIIIlIIIll;
        }
        finally {
            if (lIIlIIllIIlIIIIl(llllllllllllIllIlIlllIlIIIlIlIlI ? 1 : 0)) {
                llllllllllllIllIlIlllIlIIIlIlIIl.release();
                "".length();
            }
        }
    }
    
    public static int swapInt(final int llllllllllllIllIlIlllIlIIIlllIIl) {
        return Integer.reverseBytes(llllllllllllIllIlIlllIlIIIlllIIl);
    }
    
    private static boolean lIIlIIllIIIllllI(final int llllllllllllIllIlIlllIIlIlIlllll) {
        return llllllllllllIllIlIlllIIlIlIlllll > 0;
    }
    
    private static String lIIlIIllIIIlIlIl(String llllllllllllIllIlIlllIIllIIIlIll, final String llllllllllllIllIlIlllIIllIIIllll) {
        llllllllllllIllIlIlllIIllIIIlIll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlllIIllIIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlllIIllIIIlllI = new StringBuilder();
        final char[] llllllllllllIllIlIlllIIllIIIllIl = llllllllllllIllIlIlllIIllIIIllll.toCharArray();
        int llllllllllllIllIlIlllIIllIIIllII = ByteBufUtil.llIlIIllIlllIl[0];
        final long llllllllllllIllIlIlllIIllIIIIllI = (Object)((String)llllllllllllIllIlIlllIIllIIIlIll).toCharArray();
        final boolean llllllllllllIllIlIlllIIllIIIIlIl = llllllllllllIllIlIlllIIllIIIIllI.length != 0;
        int llllllllllllIllIlIlllIIllIIIIlII = ByteBufUtil.llIlIIllIlllIl[0];
        while (lIIlIIllIIIlllII(llllllllllllIllIlIlllIIllIIIIlII, llllllllllllIllIlIlllIIllIIIIlIl ? 1 : 0)) {
            final char llllllllllllIllIlIlllIIllIIlIIIl = llllllllllllIllIlIlllIIllIIIIllI[llllllllllllIllIlIlllIIllIIIIlII];
            llllllllllllIllIlIlllIIllIIIlllI.append((char)(llllllllllllIllIlIlllIIllIIlIIIl ^ llllllllllllIllIlIlllIIllIIIllIl[llllllllllllIllIlIlllIIllIIIllII % llllllllllllIllIlIlllIIllIIIllIl.length]));
            "".length();
            ++llllllllllllIllIlIlllIIllIIIllII;
            ++llllllllllllIllIlIlllIIllIIIIlII;
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlllIIllIIIlllI);
    }
    
    public static int hashCode(final ByteBuf llllllllllllIllIlIlllIlIlIlIIIlI) {
        final int llllllllllllIllIlIlllIlIlIlIIIIl = llllllllllllIllIlIlllIlIlIlIIIlI.readableBytes();
        final int llllllllllllIllIlIlllIlIlIlIIIII = llllllllllllIllIlIlllIlIlIlIIIIl >>> ByteBufUtil.llIlIIllIlllIl[2];
        final int llllllllllllIllIlIlllIlIlIIlllll = llllllllllllIllIlIlllIlIlIlIIIIl & ByteBufUtil.llIlIIllIlllIl[3];
        int llllllllllllIllIlIlllIlIlIIllllI = ByteBufUtil.llIlIIllIlllIl[1];
        int llllllllllllIllIlIlllIlIlIIlllIl = llllllllllllIllIlIlllIlIlIlIIIlI.readerIndex();
        if (lIIlIIllIIIlllIl(llllllllllllIllIlIlllIlIlIlIIIlI.order(), ByteOrder.BIG_ENDIAN)) {
            int llllllllllllIllIlIlllIlIlIlIIlIl = llllllllllllIllIlIlllIlIlIlIIIII;
            while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIlIlIIlIl)) {
                llllllllllllIllIlIlllIlIlIIllllI = ByteBufUtil.llIlIIllIlllIl[4] * llllllllllllIllIlIlllIlIlIIllllI + llllllllllllIllIlIlllIlIlIlIIIlI.getInt(llllllllllllIllIlIlllIlIlIIlllIl);
                llllllllllllIllIlIlllIlIlIIlllIl += 4;
                --llllllllllllIllIlIlllIlIlIlIIlIl;
                "".length();
                if (((0xFA ^ 0x9A) & ~(0x4B ^ 0x2B)) < 0) {
                    return (0x9B ^ 0xC5) & ~(0x28 ^ 0x76);
                }
            }
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (60 + 0 + 84 + 11 ^ 107 + 46 - 9 + 24) & (134 + 150 - 256 + 149 ^ 71 + 15 + 8 + 36 ^ -" ".length());
            }
        }
        else {
            int llllllllllllIllIlIlllIlIlIlIIlII = llllllllllllIllIlIlllIlIlIlIIIII;
            while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIlIlIIlII)) {
                llllllllllllIllIlIlllIlIlIIllllI = ByteBufUtil.llIlIIllIlllIl[4] * llllllllllllIllIlIlllIlIlIIllllI + swapInt(llllllllllllIllIlIlllIlIlIlIIIlI.getInt(llllllllllllIllIlIlllIlIlIIlllIl));
                llllllllllllIllIlIlllIlIlIIlllIl += 4;
                --llllllllllllIllIlIlllIlIlIlIIlII;
                "".length();
                if (null != null) {
                    return (0x4F ^ 0x45) & ~(0x70 ^ 0x7A);
                }
            }
        }
        int llllllllllllIllIlIlllIlIlIlIIIll = llllllllllllIllIlIlllIlIlIIlllll;
        while (lIIlIIllIIIllllI(llllllllllllIllIlIlllIlIlIlIIIll)) {
            llllllllllllIllIlIlllIlIlIIllllI = ByteBufUtil.llIlIIllIlllIl[4] * llllllllllllIllIlIlllIlIlIIllllI + llllllllllllIllIlIlllIlIlIlIIIlI.getByte(llllllllllllIllIlIlllIlIlIIlllIl++);
            --llllllllllllIllIlIlllIlIlIlIIIll;
            "".length();
            if ("  ".length() == ((152 + 6 - 39 + 37 ^ 94 + 105 - 155 + 132) & (11 + 45 + 107 + 15 ^ 89 + 12 + 43 + 14 ^ -" ".length()))) {
                return (0x55 ^ 0x1C ^ (0xEE ^ 0xBD)) & (0xDC ^ 0x87 ^ (0x42 ^ 0x3) ^ -" ".length());
            }
        }
        if (lIIlIIllIIIllIll(llllllllllllIllIlIlllIlIlIIllllI)) {
            llllllllllllIllIlIlllIlIlIIllllI = ByteBufUtil.llIlIIllIlllIl[1];
        }
        return llllllllllllIllIlIlllIlIlIIllllI;
    }
    
    static final class ThreadLocalUnsafeDirectByteBuf extends UnpooledUnsafeDirectByteBuf
    {
        private static final /* synthetic */ int[] llIllIIllIlllI;
        private static final /* synthetic */ Recycler<ThreadLocalUnsafeDirectByteBuf> RECYCLER;
        private final /* synthetic */ Recycler.Handle handle;
        
        @Override
        protected void deallocate() {
            if (lIIlIlllIIllIllI(this.capacity(), ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE)) {
                super.deallocate();
                "".length();
                if (((0x69 ^ 0x64 ^ (0x4D ^ 0xF)) & (0xEE ^ 0xAC ^ (0x46 ^ 0x4B) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                this.clear();
                "".length();
                ThreadLocalUnsafeDirectByteBuf.RECYCLER.recycle(this, this.handle);
                "".length();
            }
        }
        
        private ThreadLocalUnsafeDirectByteBuf(final Recycler.Handle llllllllllllIllIIlllIlllIIlIllII) {
            super(UnpooledByteBufAllocator.DEFAULT, ThreadLocalUnsafeDirectByteBuf.llIllIIllIlllI[1], ThreadLocalUnsafeDirectByteBuf.llIllIIllIlllI[2]);
            this.handle = llllllllllllIllIIlllIlllIIlIllII;
        }
        
        static ThreadLocalUnsafeDirectByteBuf newInstance() {
            final ThreadLocalUnsafeDirectByteBuf llllllllllllIllIIlllIlllIIllIIll = ThreadLocalUnsafeDirectByteBuf.RECYCLER.get();
            llllllllllllIllIIlllIlllIIllIIll.setRefCnt(ThreadLocalUnsafeDirectByteBuf.llIllIIllIlllI[0]);
            return llllllllllllIllIIlllIlllIIllIIll;
        }
        
        static {
            lIIlIlllIIllIlIl();
            RECYCLER = new Recycler<ThreadLocalUnsafeDirectByteBuf>() {
                @Override
                protected ThreadLocalUnsafeDirectByteBuf newObject(final Handle lllllllllllllIIIlIlIIlllIlIIlIll) {
                    return new ThreadLocalUnsafeDirectByteBuf(lllllllllllllIIIlIlIIlllIlIIlIll);
                }
            };
        }
        
        private static boolean lIIlIlllIIllIllI(final int llllllllllllIllIIlllIlllIIIlllll, final int llllllllllllIllIIlllIlllIIIllllI) {
            return llllllllllllIllIIlllIlllIIIlllll > llllllllllllIllIIlllIlllIIIllllI;
        }
        
        private static void lIIlIlllIIllIlIl() {
            (llIllIIllIlllI = new int[3])[0] = " ".length();
            ThreadLocalUnsafeDirectByteBuf.llIllIIllIlllI[1] = (-(0xFFFFFAAB & 0x1FF6) & (0xFFFF9FED & 0x7BB3));
            ThreadLocalUnsafeDirectByteBuf.llIllIIllIlllI[2] = (-1 & Integer.MAX_VALUE);
        }
    }
    
    static final class ThreadLocalDirectByteBuf extends UnpooledDirectByteBuf
    {
        private static final /* synthetic */ Recycler<ThreadLocalDirectByteBuf> RECYCLER;
        private static final /* synthetic */ int[] lIlllIlIIIIIIl;
        private final /* synthetic */ Recycler.Handle handle;
        
        static ThreadLocalDirectByteBuf newInstance() {
            final ThreadLocalDirectByteBuf llllllllllllIlllllIIIllIIIIllIIl = ThreadLocalDirectByteBuf.RECYCLER.get();
            llllllllllllIlllllIIIllIIIIllIIl.setRefCnt(ThreadLocalDirectByteBuf.lIlllIlIIIIIIl[0]);
            return llllllllllllIlllllIIIllIIIIllIIl;
        }
        
        @Override
        protected void deallocate() {
            if (lIIIIIlIIllIlIIl(this.capacity(), ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE)) {
                super.deallocate();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                this.clear();
                "".length();
                ThreadLocalDirectByteBuf.RECYCLER.recycle(this, this.handle);
                "".length();
            }
        }
        
        private static void lIIIIIlIIllIlIII() {
            (lIlllIlIIIIIIl = new int[3])[0] = " ".length();
            ThreadLocalDirectByteBuf.lIlllIlIIIIIIl[1] = (-(0xFFFFB7BF & 0x6A44) & (0xFFFFE7DB & 0x3B27));
            ThreadLocalDirectByteBuf.lIlllIlIIIIIIl[2] = (-1 & Integer.MAX_VALUE);
        }
        
        static {
            lIIIIIlIIllIlIII();
            RECYCLER = new Recycler<ThreadLocalDirectByteBuf>() {
                @Override
                protected ThreadLocalDirectByteBuf newObject(final Handle lllllllllllllIIlIlIIllIIlIIIllII) {
                    return new ThreadLocalDirectByteBuf(lllllllllllllIIlIlIIllIIlIIIllII);
                }
            };
        }
        
        private static boolean lIIIIIlIIllIlIIl(final int llllllllllllIlllllIIIllIIIIIIlIl, final int llllllllllllIlllllIIIllIIIIIIlII) {
            return llllllllllllIlllllIIIllIIIIIIlIl > llllllllllllIlllllIIIllIIIIIIlII;
        }
        
        private ThreadLocalDirectByteBuf(final Recycler.Handle llllllllllllIlllllIIIllIIIIlIIlI) {
            super(UnpooledByteBufAllocator.DEFAULT, ThreadLocalDirectByteBuf.lIlllIlIIIIIIl[1], ThreadLocalDirectByteBuf.lIlllIlIIIIIIl[2]);
            this.handle = llllllllllllIlllllIIIllIIIIlIIlI;
        }
    }
}
