// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Arrays;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteOrder;

public class LengthFieldBasedFrameDecoder extends ByteToMessageDecoder
{
    private /* synthetic */ long tooLongFrameLength;
    private final /* synthetic */ ByteOrder byteOrder;
    private final /* synthetic */ int lengthFieldOffset;
    private static final /* synthetic */ int[] lIIIllIlIIIIll;
    private final /* synthetic */ int initialBytesToStrip;
    private final /* synthetic */ boolean failFast;
    private final /* synthetic */ int lengthFieldEndOffset;
    private final /* synthetic */ int lengthFieldLength;
    private /* synthetic */ long bytesToDiscard;
    private final /* synthetic */ int lengthAdjustment;
    private static final /* synthetic */ String[] lIIIllIIlIlllI;
    private final /* synthetic */ int maxFrameLength;
    private /* synthetic */ boolean discardingTooLongFrame;
    
    private static String llIIIIlllIIIIIl(final String lllllllllllllIlIIIIIIlIIIIIlllIl, final String lllllllllllllIlIIIIIIlIIIIIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIlIIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIIlIIIIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIIlIIIIIlllll.init(LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[2], lllllllllllllIlIIIIIIlIIIIlIIIII);
            return new String(lllllllllllllIlIIIIIIlIIIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIlIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIlIIIIIllllI) {
            lllllllllllllIlIIIIIIlIIIIIllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIIIIlllII(final Object lllllllllllllIlIIIIIIlIIIIIIlllI) {
        return lllllllllllllIlIIIIIIlIIIIIIlllI != null;
    }
    
    protected ByteBuf extractFrame(final ChannelHandlerContext lllllllllllllIlIIIIIIlIIIlIlIlII, final ByteBuf lllllllllllllIlIIIIIIlIIIlIlIIll, final int lllllllllllllIlIIIIIIlIIIlIlIlll, final int lllllllllllllIlIIIIIIlIIIlIlIIIl) {
        final ByteBuf lllllllllllllIlIIIIIIlIIIlIlIlIl = lllllllllllllIlIIIIIIlIIIlIlIlII.alloc().buffer(lllllllllllllIlIIIIIIlIIIlIlIIIl);
        lllllllllllllIlIIIIIIlIIIlIlIlIl.writeBytes(lllllllllllllIlIIIIIIlIIIlIlIIll, lllllllllllllIlIIIIIIlIIIlIlIlll, lllllllllllllIlIIIIIIlIIIlIlIIIl);
        "".length();
        return lllllllllllllIlIIIIIIlIIIlIlIlIl;
    }
    
    private static boolean llIIIlIIIlIIIII(final int lllllllllllllIlIIIIIIlIIIIIIIIlI) {
        return lllllllllllllIlIIIIIIlIIIIIIIIlI > 0;
    }
    
    private static int llIIIlIIIlIIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected long getUnadjustedFrameLength(ByteBuf lllllllllllllIlIIIIIIlIIIllIllIl, final int lllllllllllllIlIIIIIIlIIIllIllII, final int lllllllllllllIlIIIIIIlIIIllIlIll, final ByteOrder lllllllllllllIlIIIIIIlIIIllIlIlI) {
        lllllllllllllIlIIIIIIlIIIllIllIl = lllllllllllllIlIIIIIIlIIIllIllIl.order(lllllllllllllIlIIIIIIlIIIllIlIlI);
        long lllllllllllllIlIIIIIIlIIIllIllll = 0L;
        switch (lllllllllllllIlIIIIIIlIIIllIlIll) {
            case 1: {
                lllllllllllllIlIIIIIIlIIIllIllll = lllllllllllllIlIIIIIIlIIIllIllIl.getUnsignedByte(lllllllllllllIlIIIIIIlIIIllIllII);
                "".length();
                if ((143 + 152 - 119 + 8 ^ 44 + 117 - 129 + 157) == 0x0) {
                    return 0L;
                }
                break;
            }
            case 2: {
                lllllllllllllIlIIIIIIlIIIllIllll = lllllllllllllIlIIIIIIlIIIllIllIl.getUnsignedShort(lllllllllllllIlIIIIIIlIIIllIllII);
                "".length();
                if ((0x88 ^ 0x8C) <= "   ".length()) {
                    return 0L;
                }
                break;
            }
            case 3: {
                lllllllllllllIlIIIIIIlIIIllIllll = lllllllllllllIlIIIIIIlIIIllIllIl.getUnsignedMedium(lllllllllllllIlIIIIIIlIIIllIllII);
                "".length();
                if (((0x74 ^ 0xE ^ (0x25 ^ 0x2)) & (0x30 ^ 0x16 ^ (0xDE ^ 0xA5) ^ -" ".length())) != 0x0) {
                    return 0L;
                }
                break;
            }
            case 4: {
                lllllllllllllIlIIIIIIlIIIllIllll = lllllllllllllIlIIIIIIlIIIllIllIl.getUnsignedInt(lllllllllllllIlIIIIIIlIIIllIllII);
                "".length();
                if ((0x8E ^ 0xB7 ^ (0x12 ^ 0x2F)) == 0x0) {
                    return 0L;
                }
                break;
            }
            case 8: {
                lllllllllllllIlIIIIIIlIIIllIllll = lllllllllllllIlIIIIIIlIIIllIllIl.getLong(lllllllllllllIlIIIIIIlIIIllIllII);
                "".length();
                if ("  ".length() > (49 + 6 - 19 + 163 ^ 124 + 95 - 191 + 167)) {
                    return 0L;
                }
                break;
            }
            default: {
                throw new DecoderException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[18]]).append(this.lengthFieldLength).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[19]])));
            }
        }
        return lllllllllllllIlIIIIIIlIIIllIllll;
    }
    
    public LengthFieldBasedFrameDecoder(final int lllllllllllllIlIIIIIIlIIllIllIll, final int lllllllllllllIlIIIIIIlIIlllIIIII, final int lllllllllllllIlIIIIIIlIIllIlllll, final int lllllllllllllIlIIIIIIlIIllIllllI, final int lllllllllllllIlIIIIIIlIIllIlllIl) {
        this(lllllllllllllIlIIIIIIlIIllIllIll, lllllllllllllIlIIIIIIlIIlllIIIII, lllllllllllllIlIIIIIIlIIllIlllll, lllllllllllllIlIIIIIIlIIllIllllI, lllllllllllllIlIIIIIIlIIllIlllIl, (boolean)(LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[1] != 0));
    }
    
    private static boolean llIIIlIIIIllllI(final int lllllllllllllIlIIIIIIlIIIIIIlIlI) {
        return lllllllllllllIlIIIIIIlIIIIIIlIlI != 0;
    }
    
    private static boolean llIIIlIIIIllIIl(final int lllllllllllllIlIIIIIIlIIIIIIIlII) {
        return lllllllllllllIlIIIIIIlIIIIIIIlII <= 0;
    }
    
    private static boolean llIIIlIIIIllIII(final Object lllllllllllllIlIIIIIIlIIIIIIllII) {
        return lllllllllllllIlIIIIIIlIIIIIIllII == null;
    }
    
    static {
        llIIIlIIIIlIlll();
        llIIIIlllIIllIl();
    }
    
    private static String llIIIIlllIIllII(String lllllllllllllIlIIIIIIlIIIIlllIlI, final String lllllllllllllIlIIIIIIlIIIIlllIIl) {
        lllllllllllllIlIIIIIIlIIIIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIIlIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIlIIIIllllIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIlIIIIllllII = lllllllllllllIlIIIIIIlIIIIlllIIl.toCharArray();
        int lllllllllllllIlIIIIIIlIIIIlllIll = LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0];
        final char lllllllllllllIlIIIIIIlIIIIllIlIl = (Object)lllllllllllllIlIIIIIIlIIIIlllIlI.toCharArray();
        final char lllllllllllllIlIIIIIIlIIIIllIlII = (char)lllllllllllllIlIIIIIIlIIIIllIlIl.length;
        byte lllllllllllllIlIIIIIIlIIIIllIIll = (byte)LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0];
        while (llIIIlIIIIlllll(lllllllllllllIlIIIIIIlIIIIllIIll, lllllllllllllIlIIIIIIlIIIIllIlII)) {
            final char lllllllllllllIlIIIIIIlIIIlIIIIII = lllllllllllllIlIIIIIIlIIIIllIlIl[lllllllllllllIlIIIIIIlIIIIllIIll];
            lllllllllllllIlIIIIIIlIIIIllllIl.append((char)(lllllllllllllIlIIIIIIlIIIlIIIIII ^ lllllllllllllIlIIIIIIlIIIIllllII[lllllllllllllIlIIIIIIlIIIIlllIll % lllllllllllllIlIIIIIIlIIIIllllII.length]));
            "".length();
            ++lllllllllllllIlIIIIIIlIIIIlllIll;
            ++lllllllllllllIlIIIIIIlIIIIllIIll;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIlIIIIllllIl);
    }
    
    private void failIfNecessary(final boolean lllllllllllllIlIIIIIIlIIIllIIIIl) {
        if (llIIIlIIIlIIIlI(llIIIlIIIlIIIIl(this.bytesToDiscard, 0L))) {
            final long lllllllllllllIlIIIIIIlIIIllIIlIl = this.tooLongFrameLength;
            this.tooLongFrameLength = 0L;
            this.discardingTooLongFrame = (LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0] != 0);
            if (!llIIIlIIIIllllI(this.failFast ? 1 : 0) || (llIIIlIIIIllllI(this.failFast ? 1 : 0) && llIIIlIIIIllllI(lllllllllllllIlIIIIIIlIIIllIIIIl ? 1 : 0))) {
                this.fail(lllllllllllllIlIIIIIIlIIIllIIlIl);
            }
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        else if (llIIIlIIIIllllI(this.failFast ? 1 : 0) && llIIIlIIIIllllI(lllllllllllllIlIIIIIIlIIIllIIIIl ? 1 : 0)) {
            this.fail(this.tooLongFrameLength);
        }
    }
    
    @Override
    protected final void decode(final ChannelHandlerContext lllllllllllllIlIIIIIIlIIlIlIIIll, final ByteBuf lllllllllllllIlIIIIIIlIIlIIlllIl, final List<Object> lllllllllllllIlIIIIIIlIIlIlIIIIl) throws Exception {
        final Object lllllllllllllIlIIIIIIlIIlIlIIIII = this.decode(lllllllllllllIlIIIIIIlIIlIlIIIll, lllllllllllllIlIIIIIIlIIlIIlllIl);
        if (llIIIlIIIIlllII(lllllllllllllIlIIIIIIlIIlIlIIIII)) {
            lllllllllllllIlIIIIIIlIIlIlIIIIl.add(lllllllllllllIlIIIIIIlIIlIlIIIII);
            "".length();
        }
    }
    
    public LengthFieldBasedFrameDecoder(final ByteOrder lllllllllllllIlIIIIIIlIIlIlllIII, final int lllllllllllllIlIIIIIIlIIlIlIllll, final int lllllllllllllIlIIIIIIlIIlIllIllI, final int lllllllllllllIlIIIIIIlIIlIllIlIl, final int lllllllllllllIlIIIIIIlIIlIllIlII, final int lllllllllllllIlIIIIIIlIIlIlIlIll, final boolean lllllllllllllIlIIIIIIlIIlIllIIlI) {
        if (llIIIlIIIIllIII(lllllllllllllIlIIIIIIlIIlIlllIII)) {
            throw new NullPointerException(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0]]);
        }
        if (llIIIlIIIIllIIl(lllllllllllllIlIIIIIIlIIlIlIllll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[1]]).append(lllllllllllllIlIIIIIIlIIlIlIllll)));
        }
        if (llIIIlIIIIllIlI(lllllllllllllIlIIIIIIlIIlIllIllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[2]]).append(lllllllllllllIlIIIIIIlIIlIllIllI)));
        }
        if (llIIIlIIIIllIlI(lllllllllllllIlIIIIIIlIIlIlIlIll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[3]]).append(lllllllllllllIlIIIIIIlIIlIlIlIll)));
        }
        if (llIIIlIIIIllIll(lllllllllllllIlIIIIIIlIIlIllIllI, lllllllllllllIlIIIIIIlIIlIlIllll - lllllllllllllIlIIIIIIlIIlIllIlIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[4]]).append(lllllllllllllIlIIIIIIlIIlIlIllll).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[5]]).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[6]]).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[7]]).append(lllllllllllllIlIIIIIIlIIlIllIllI).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[8]]).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[9]]).append(lllllllllllllIlIIIIIIlIIlIllIlIl).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[10]])));
        }
        this.byteOrder = lllllllllllllIlIIIIIIlIIlIlllIII;
        this.maxFrameLength = lllllllllllllIlIIIIIIlIIlIlIllll;
        this.lengthFieldOffset = lllllllllllllIlIIIIIIlIIlIllIllI;
        this.lengthFieldLength = lllllllllllllIlIIIIIIlIIlIllIlIl;
        this.lengthAdjustment = lllllllllllllIlIIIIIIlIIlIllIlII;
        this.lengthFieldEndOffset = lllllllllllllIlIIIIIIlIIlIllIllI + lllllllllllllIlIIIIIIlIIlIllIlIl;
        this.initialBytesToStrip = lllllllllllllIlIIIIIIlIIlIlIlIll;
        this.failFast = lllllllllllllIlIIIIIIlIIlIllIIlI;
    }
    
    public LengthFieldBasedFrameDecoder(final int lllllllllllllIlIIIIIIlIIllIIlllI, final int lllllllllllllIlIIIIIIlIIllIIIllI, final int lllllllllllllIlIIIIIIlIIllIIllII, final int lllllllllllllIlIIIIIIlIIllIIlIll, final int lllllllllllllIlIIIIIIlIIllIIIIll, final boolean lllllllllllllIlIIIIIIlIIllIIIIlI) {
        this(ByteOrder.BIG_ENDIAN, lllllllllllllIlIIIIIIlIIllIIlllI, lllllllllllllIlIIIIIIlIIllIIIllI, lllllllllllllIlIIIIIIlIIllIIllII, lllllllllllllIlIIIIIIlIIllIIlIll, lllllllllllllIlIIIIIIlIIllIIIIll, lllllllllllllIlIIIIIIlIIllIIIIlI);
    }
    
    public LengthFieldBasedFrameDecoder(final int lllllllllllllIlIIIIIIlIIlllIlIll, final int lllllllllllllIlIIIIIIlIIlllIlIlI, final int lllllllllllllIlIIIIIIlIIlllIlIIl) {
        this(lllllllllllllIlIIIIIIlIIlllIlIll, lllllllllllllIlIIIIIIlIIlllIlIlI, lllllllllllllIlIIIIIIlIIlllIlIIl, LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0], LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0]);
    }
    
    private static boolean llIIIlIIIIlllll(final int lllllllllllllIlIIIIIIlIIIIIlIlIl, final int lllllllllllllIlIIIIIIlIIIIIlIlII) {
        return lllllllllllllIlIIIIIIlIIIIIlIlIl < lllllllllllllIlIIIIIIlIIIIIlIlII;
    }
    
    private static String llIIIIlllIIIIlI(final String lllllllllllllIlIIIIIIlIIIIlIlIlI, final String lllllllllllllIlIIIIIIlIIIIlIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIlIIIIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIlIIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[8]), "DES");
            final Cipher lllllllllllllIlIIIIIIlIIIIlIllII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIIlIIIIlIllII.init(LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[2], lllllllllllllIlIIIIIIlIIIIlIllIl);
            return new String(lllllllllllllIlIIIIIIlIIIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIlIIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIlIIIIlIlIll) {
            lllllllllllllIlIIIIIIlIIIIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private void fail(final long lllllllllllllIlIIIIIIlIIIlIIlIlI) {
        if (llIIIlIIIlIIIII(llIIIlIIIlIIIll(lllllllllllllIlIIIIIIlIIIlIIlIlI, 0L))) {
            throw new TooLongFrameException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[20]]).append(this.maxFrameLength).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[21]]).append(lllllllllllllIlIIIIIIlIIIlIIlIlI).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[22]])));
        }
        throw new TooLongFrameException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[23]]).append(this.maxFrameLength).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[24]])));
    }
    
    private static void llIIIlIIIIlIlll() {
        (lIIIllIlIIIIll = new int[26])[0] = ((73 + 22 - 79 + 118 ^ 81 + 68 - 55 + 35) & (20 + 115 - 121 + 139 ^ 140 + 96 - 118 + 40 ^ -" ".length()));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[1] = " ".length();
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[2] = "  ".length();
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[3] = "   ".length();
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[4] = (0xC0 ^ 0xAB ^ (0xD ^ 0x62));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[5] = (0x9A ^ 0x9F);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[6] = (47 + 71 - 43 + 69 ^ 97 + 63 - 19 + 9);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[7] = (0x60 ^ 0x67);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[8] = (0xCE ^ 0xC6);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[9] = (0xA ^ 0x3);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[10] = (0x4C ^ 0x39 ^ 2 + 54 - 12 + 83);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[11] = (0xA2 ^ 0xA9);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[12] = (0x30 ^ 0x18 ^ (0x6E ^ 0x4A));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[13] = (0xDA ^ 0x8F ^ (0x22 ^ 0x7A));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[14] = (0x23 ^ 0x2D);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[15] = (0x79 ^ 0x76);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[16] = (0x9E ^ 0x8E);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[17] = (0x5F ^ 0x6A ^ (0x4C ^ 0x68));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[18] = (0x93 ^ 0x85 ^ (0x91 ^ 0x95));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[19] = (0x1E ^ 0x7D ^ (0x67 ^ 0x17));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[20] = (91 + 79 - 87 + 67 ^ 125 + 35 - 82 + 52);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[21] = (0x54 ^ 0x7F ^ (0x7F ^ 0x41));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[22] = (32 + 50 - 50 + 95 ^ (0xE5 ^ 0x8C));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[23] = (0x2F ^ 0x38);
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[24] = (0x75 ^ 0x1D ^ (0xF6 ^ 0x86));
        LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[25] = (0x60 ^ 0x2D ^ (0xF0 ^ 0xA4));
    }
    
    private static int llIIIlIIIIlllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIIIlIIIIllIlI(final int lllllllllllllIlIIIIIIlIIIIIIIllI) {
        return lllllllllllllIlIIIIIIlIIIIIIIllI < 0;
    }
    
    private static boolean llIIIlIIIlIIIlI(final int lllllllllllllIlIIIIIIlIIIIIIlIII) {
        return lllllllllllllIlIIIIIIlIIIIIIlIII == 0;
    }
    
    private static void llIIIIlllIIllIl() {
        (lIIIllIIlIlllI = new String[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[25]])[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0]] = llIIIIlllIIIIIl("Rs3zWNenoVGhmHK8rP8KRA==", "EbqSl");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[1]] = llIIIIlllIIIIIl("9C2G4MNZbPsgCesfq5jJRUU1PMnFiW3AUsGYS0Tsll6cr4xhNAoQ2JKJQj5X6+kP", "qVwCK");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[2]] = llIIIIlllIIIIlI("Fu1L0jbJXCcVKAmpRPGovvo1IVyOqDLU12EZ/D5NxaPyvoIMKercVkocpFLImQ0nhuUtGyoWhOw=", "dIPJm");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[3]] = llIIIIlllIIIIlI("SJQvfZC/DrjsyIi5n0QRhAwSwcMacrw+woRsXFHhB+PyC01zQJQ7sSofIfbruc7RANQ47ndQ5Ds=", "dujfB");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[4]] = llIIIIlllIIIIlI("3atiYFnO3Uvo2epSv5y4XlnXKECqdemF", "WYwEe");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[5]] = llIIIIlllIIIIlI("6D96Qt9ZZpw=", "VqkqF");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[6]] = llIIIIlllIIIIIl("1sEYr+O79Ov0b7Lu6GsmOGlCDlKfntlVrO1DvlEVIQhVbnJDJ/5aSg==", "ykZNH");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[7]] = llIIIIlllIIIIIl("zCV/XkmEPlr/3LrPuUTytoI5otQdzShJ", "eBygF");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[8]] = llIIIIlllIIIIlI("J35FydlGDbo=", "gTDei");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[9]] = llIIIIlllIIIIIl("917hGYTf0i70iswQLpM21uhWMa0myBQv", "SWPrM");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[10]] = llIIIIlllIIllII("emY=", "SHbwZ");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[11]] = llIIIIlllIIIIIl("QjkicQJ/MlpamPKi2wXPE/e8CW99g9r0UJSFisU7z3t8nLOoX9DcqA==", "ouzpv");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[12]] = llIIIIlllIIIIlI("EZYGmGm+BrWU3bXMGvGEpMHIeQRkuX5v", "rGPLt");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[13]] = llIIIIlllIIIIlI("GTKBRQsfb9ba1bzSg4+2tA==", "otXUk");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[14]] = llIIIIlllIIIIlI("P4da/q3kI8nYNH8joVp0CVXbVvceLWqo8Naci5q0x+0=", "nKpoL");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[15]] = llIIIIlllIIllII("Mg0QGCQHDB5NMQEIFwh3HwwUCiMbSVI=", "sizmW");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[16]] = llIIIIlllIIIIlI("ByEFktdLHIB5NzoyqvuWMA==", "JyTrc");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[17]] = llIIIIlllIIIIlI("7QX4DKaJ4Cg56/gcAjGV8xNLoMmtkCJBifudaUF77z8=", "RvlXq");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[18]] = llIIIIlllIIllII("BwQXGyQCBRYaMRZKCAs6FR4MKD0XBgAiMRwNEAZuUg==", "rjdnT");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[19]] = llIIIIlllIIIIlI("Pv30/1df7uN+CinIIohh/nMVFkqaNUNP8lumGTtECSE=", "JAAzu");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[20]] = llIIIIlllIIIIIl("HxyUtishoQmlw30GiWaxDov0buky7QhJreUJLxf6hYg=", "tBAjN");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[21]] = llIIIIlllIIIIlI("wa7QMxmG4lI=", "ussvK");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[22]] = llIIIIlllIIIIIl("oLQPSxFRVwuqrB5F3FTN7A==", "HzOFz");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[23]] = llIIIIlllIIllII("IDMvAwIVMiFWFxM2KBNRDTIrEQUJdyAOEgQyIQVR", "aWEvq");
        LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[24]] = llIIIIlllIIllII("Q0J1Ag8QDDQUAgoBMg==", "coUff");
    }
    
    private static int llIIIlIIIlIIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected Object decode(final ChannelHandlerContext lllllllllllllIlIIIIIIlIIlIIIllII, final ByteBuf lllllllllllllIlIIIIIIlIIlIIIIIlI) throws Exception {
        if (llIIIlIIIIllllI(this.discardingTooLongFrame ? 1 : 0)) {
            long lllllllllllllIlIIIIIIlIIlIIlIIII = this.bytesToDiscard;
            final int lllllllllllllIlIIIIIIlIIlIIIllll = (int)Math.min(lllllllllllllIlIIIIIIlIIlIIlIIII, lllllllllllllIlIIIIIIlIIlIIIIIlI.readableBytes());
            lllllllllllllIlIIIIIIlIIlIIIIIlI.skipBytes(lllllllllllllIlIIIIIIlIIlIIIllll);
            "".length();
            lllllllllllllIlIIIIIIlIIlIIlIIII -= lllllllllllllIlIIIIIIlIIlIIIllll;
            this.bytesToDiscard = lllllllllllllIlIIIIIIlIIlIIlIIII;
            this.failIfNecessary((boolean)(LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[0] != 0));
        }
        if (llIIIlIIIIlllll(lllllllllllllIlIIIIIIlIIlIIIIIlI.readableBytes(), this.lengthFieldEndOffset)) {
            return null;
        }
        final int lllllllllllllIlIIIIIIlIIlIIIlIlI = lllllllllllllIlIIIIIIlIIlIIIIIlI.readerIndex() + this.lengthFieldOffset;
        long lllllllllllllIlIIIIIIlIIlIIIlIIl = this.getUnadjustedFrameLength(lllllllllllllIlIIIIIIlIIlIIIIIlI, lllllllllllllIlIIIIIIlIIlIIIlIlI, this.lengthFieldLength, this.byteOrder);
        if (llIIIlIIIIllIlI(llIIIlIIIIlllIl(lllllllllllllIlIIIIIIlIIlIIIlIIl, 0L))) {
            lllllllllllllIlIIIIIIlIIlIIIIIlI.skipBytes(this.lengthFieldEndOffset);
            "".length();
            throw new CorruptedFrameException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[11]]).append(lllllllllllllIlIIIIIIlIIlIIIlIIl)));
        }
        lllllllllllllIlIIIIIIlIIlIIIlIIl += this.lengthAdjustment + this.lengthFieldEndOffset;
        if (llIIIlIIIIllIlI(llIIIlIIIIlllIl(lllllllllllllIlIIIIIIlIIlIIIlIIl, this.lengthFieldEndOffset))) {
            lllllllllllllIlIIIIIIlIIlIIIIIlI.skipBytes(this.lengthFieldEndOffset);
            "".length();
            throw new CorruptedFrameException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[12]]).append(lllllllllllllIlIIIIIIlIIlIIIlIIl).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[13]]).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[14]]).append(this.lengthFieldEndOffset)));
        }
        if (llIIIlIIIlIIIII(llIIIlIIIIlllIl(lllllllllllllIlIIIIIIlIIlIIIlIIl, this.maxFrameLength))) {
            final long lllllllllllllIlIIIIIIlIIlIIIlllI = lllllllllllllIlIIIIIIlIIlIIIlIIl - lllllllllllllIlIIIIIIlIIlIIIIIlI.readableBytes();
            this.tooLongFrameLength = lllllllllllllIlIIIIIIlIIlIIIlIIl;
            if (llIIIlIIIIllIlI(llIIIlIIIIlllIl(lllllllllllllIlIIIIIIlIIlIIIlllI, 0L))) {
                lllllllllllllIlIIIIIIlIIlIIIIIlI.skipBytes((int)lllllllllllllIlIIIIIIlIIlIIIlIIl);
                "".length();
                "".length();
                if (((124 + 56 - 156 + 123 ^ 68 + 164 - 114 + 65) & (0x5D ^ 0x16 ^ (0xFD ^ 0x92) ^ -" ".length())) >= " ".length()) {
                    return null;
                }
            }
            else {
                this.discardingTooLongFrame = (LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[1] != 0);
                this.bytesToDiscard = lllllllllllllIlIIIIIIlIIlIIIlllI;
                lllllllllllllIlIIIIIIlIIlIIIIIlI.skipBytes(lllllllllllllIlIIIIIIlIIlIIIIIlI.readableBytes());
                "".length();
            }
            this.failIfNecessary((boolean)(LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[1] != 0));
            return null;
        }
        final int lllllllllllllIlIIIIIIlIIlIIIlIII = (int)lllllllllllllIlIIIIIIlIIlIIIlIIl;
        if (llIIIlIIIIlllll(lllllllllllllIlIIIIIIlIIlIIIIIlI.readableBytes(), lllllllllllllIlIIIIIIlIIlIIIlIII)) {
            return null;
        }
        if (llIIIlIIIIllIll(this.initialBytesToStrip, lllllllllllllIlIIIIIIlIIlIIIlIII)) {
            lllllllllllllIlIIIIIIlIIlIIIIIlI.skipBytes(lllllllllllllIlIIIIIIlIIlIIIlIII);
            "".length();
            throw new CorruptedFrameException(String.valueOf(new StringBuilder().append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[15]]).append(lllllllllllllIlIIIIIIlIIlIIIlIIl).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[16]]).append(LengthFieldBasedFrameDecoder.lIIIllIIlIlllI[LengthFieldBasedFrameDecoder.lIIIllIlIIIIll[17]]).append(this.initialBytesToStrip)));
        }
        lllllllllllllIlIIIIIIlIIlIIIIIlI.skipBytes(this.initialBytesToStrip);
        "".length();
        final int lllllllllllllIlIIIIIIlIIlIIIIlll = lllllllllllllIlIIIIIIlIIlIIIIIlI.readerIndex();
        final int lllllllllllllIlIIIIIIlIIlIIIIllI = lllllllllllllIlIIIIIIlIIlIIIlIII - this.initialBytesToStrip;
        final ByteBuf lllllllllllllIlIIIIIIlIIlIIIIlIl = this.extractFrame(lllllllllllllIlIIIIIIlIIlIIIllII, lllllllllllllIlIIIIIIlIIlIIIIIlI, lllllllllllllIlIIIIIIlIIlIIIIlll, lllllllllllllIlIIIIIIlIIlIIIIllI);
        lllllllllllllIlIIIIIIlIIlIIIIIlI.readerIndex(lllllllllllllIlIIIIIIlIIlIIIIlll + lllllllllllllIlIIIIIIlIIlIIIIllI);
        "".length();
        return lllllllllllllIlIIIIIIlIIlIIIIlIl;
    }
    
    private static boolean llIIIlIIIIllIll(final int lllllllllllllIlIIIIIIlIIIIIlIIIl, final int lllllllllllllIlIIIIIIlIIIIIlIIII) {
        return lllllllllllllIlIIIIIIlIIIIIlIIIl > lllllllllllllIlIIIIIIlIIIIIlIIII;
    }
}
