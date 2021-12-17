// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.util.Arrays;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.nio.CharBuffer;
import java.util.List;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.ByteOrder;

public final class Unpooled
{
    public static final /* synthetic */ ByteBuf EMPTY_BUFFER;
    public static final /* synthetic */ ByteOrder LITTLE_ENDIAN;
    private static final /* synthetic */ int[] lIIIIlllIIIlII;
    private static final /* synthetic */ ByteBufAllocator ALLOC;
    private static final /* synthetic */ String[] lIIIIlllIIIIII;
    public static final /* synthetic */ ByteOrder BIG_ENDIAN;
    
    public static ByteBuf copyFloat(final float lllllllllllllIlIIlIIIIlIllllIlll) {
        final ByteBuf lllllllllllllIlIIlIIIIlIllllIllI = buffer(Unpooled.lIIIIlllIIIlII[6]);
        lllllllllllllIlIIlIIIIlIllllIllI.writeFloat(lllllllllllllIlIIlIIIIlIllllIlll);
        "".length();
        return lllllllllllllIlIIlIIIIlIllllIllI;
    }
    
    public static CompositeByteBuf compositeBuffer(final int lllllllllllllIlIIlIIIlIIIIllIIIl) {
        return new CompositeByteBuf(Unpooled.ALLOC, (boolean)(Unpooled.lIIIIlllIIIlII[1] != 0), lllllllllllllIlIIlIIIlIIIIllIIIl);
    }
    
    public static ByteBuf unreleasableBuffer(final ByteBuf lllllllllllllIlIIlIIIIlIllIIlIII) {
        return new UnreleasableByteBuf(lllllllllllllIlIIlIIIIlIllIIlIII);
    }
    
    public static ByteBuf buffer(final int lllllllllllllIlIIlIIIlIIlIIlIIll, final int lllllllllllllIlIIlIIIlIIlIIlIIII) {
        return Unpooled.ALLOC.heapBuffer(lllllllllllllIlIIlIIIlIIlIIlIIll, lllllllllllllIlIIlIIIlIIlIIlIIII);
    }
    
    private static String lIllllIIIlIIIII(String lllllllllllllIlIIlIIIIlIlIlIIlll, final String lllllllllllllIlIIlIIIIlIlIlIIllI) {
        lllllllllllllIlIIlIIIIlIlIlIIlll = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIIIIlIlIlIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIIlIlIlIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIIlIlIlIlIIl = lllllllllllllIlIIlIIIIlIlIlIIllI.toCharArray();
        int lllllllllllllIlIIlIIIIlIlIlIlIII = Unpooled.lIIIIlllIIIlII[1];
        final long lllllllllllllIlIIlIIIIlIlIlIIIlI = (Object)((String)lllllllllllllIlIIlIIIIlIlIlIIlll).toCharArray();
        final short lllllllllllllIlIIlIIIIlIlIlIIIIl = (short)lllllllllllllIlIIlIIIIlIlIlIIIlI.length;
        String lllllllllllllIlIIlIIIIlIlIlIIIII = (String)Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl((int)lllllllllllllIlIIlIIIIlIlIlIIIII, lllllllllllllIlIIlIIIIlIlIlIIIIl)) {
            final char lllllllllllllIlIIlIIIIlIlIlIllIl = lllllllllllllIlIIlIIIIlIlIlIIIlI[lllllllllllllIlIIlIIIIlIlIlIIIII];
            lllllllllllllIlIIlIIIIlIlIlIlIlI.append((char)(lllllllllllllIlIIlIIIIlIlIlIllIl ^ lllllllllllllIlIIlIIIIlIlIlIlIIl[lllllllllllllIlIIlIIIIlIlIlIlIII % lllllllllllllIlIIlIIIIlIlIlIlIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIIIIlIlIlIlIII;
            ++lllllllllllllIlIIlIIIIlIlIlIIIII;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIIlIlIlIlIlI);
    }
    
    public static ByteBuf wrappedBuffer(final int lllllllllllllIlIIlIIIlIIIllIIIlI, final byte[]... lllllllllllllIlIIlIIIlIIIllIIIIl) {
        switch (lllllllllllllIlIIlIIIlIIIllIIIIl.length) {
            case 0: {
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
                break;
            }
            case 1: {
                if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIllIIIIl[Unpooled.lIIIIlllIIIlII[1]].length)) {
                    return wrappedBuffer(lllllllllllllIlIIlIIIlIIIllIIIIl[Unpooled.lIIIIlllIIIlII[1]]);
                }
                break;
            }
            default: {
                final List<ByteBuf> lllllllllllllIlIIlIIIlIIIllIIIll = new ArrayList<ByteBuf>(lllllllllllllIlIIlIIIlIIIllIIIIl.length);
                final byte[][] lllllllllllllIlIIlIIIlIIIllIIllI = lllllllllllllIlIIlIIIlIIIllIIIIl;
                final int lllllllllllllIlIIlIIIlIIIllIIlIl = lllllllllllllIlIIlIIIlIIIllIIllI.length;
                int lllllllllllllIlIIlIIIlIIIllIIlII = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIlIIIllIIlII, lllllllllllllIlIIlIIIlIIIllIIlIl)) {
                    final byte[] lllllllllllllIlIIlIIIlIIIllIIlll = lllllllllllllIlIIlIIIlIIIllIIllI[lllllllllllllIlIIlIIIlIIIllIIlII];
                    if (lIllllIIIllIIlI(lllllllllllllIlIIlIIIlIIIllIIlll)) {
                        "".length();
                        if ((0x2C ^ 0x28) != (0x9D ^ 0x99)) {
                            return null;
                        }
                        break;
                    }
                    else {
                        if (lIllllIIIllIIll(lllllllllllllIlIIlIIIlIIIllIIlll.length)) {
                            lllllllllllllIlIIlIIIlIIIllIIIll.add(wrappedBuffer(lllllllllllllIlIIlIIIlIIIllIIlll));
                            "".length();
                        }
                        ++lllllllllllllIlIIlIIIlIIIllIIlII;
                        "".length();
                        if (-" ".length() > 0) {
                            return null;
                        }
                        continue;
                    }
                }
                if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIIllIIIll.isEmpty() ? 1 : 0)) {
                    return new CompositeByteBuf(Unpooled.ALLOC, (boolean)(Unpooled.lIIIIlllIIIlII[1] != 0), lllllllllllllIlIIlIIIlIIIllIIIlI, lllllllllllllIlIIlIIIlIIIllIIIll);
                }
                break;
            }
        }
        return Unpooled.EMPTY_BUFFER;
    }
    
    public static ByteBuf copyShort(final int... lllllllllllllIlIIlIIIIllIlIIlIIl) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIllIlIIlIIl) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllIlIIlIIl.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIllIlIIlIII = buffer(lllllllllllllIlIIlIIIIllIlIIlIIl.length * Unpooled.lIIIIlllIIIlII[4]);
        final int[] lllllllllllllIlIIlIIIIllIlIIllII = lllllllllllllIlIIlIIIIllIlIIlIIl;
        final int lllllllllllllIlIIlIIIIllIlIIlIll = lllllllllllllIlIIlIIIIllIlIIllII.length;
        int lllllllllllllIlIIlIIIIllIlIIlIlI = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllIlIIlIlI, lllllllllllllIlIIlIIIIllIlIIlIll)) {
            final int lllllllllllllIlIIlIIIIllIlIIllIl = lllllllllllllIlIIlIIIIllIlIIllII[lllllllllllllIlIIlIIIIllIlIIlIlI];
            lllllllllllllIlIIlIIIIllIlIIlIII.writeShort(lllllllllllllIlIIlIIIIllIlIIllIl);
            "".length();
            ++lllllllllllllIlIIlIIIIllIlIIlIlI;
            "".length();
            if ((48 + 7 - 44 + 120 ^ 89 + 59 - 68 + 54) <= 0) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIllIlIIlIII;
    }
    
    public static ByteBuf copyInt(final int lllllllllllllIlIIlIIIIlllIIIIIIl) {
        final ByteBuf lllllllllllllIlIIlIIIIlllIIIIIII = buffer(Unpooled.lIIIIlllIIIlII[6]);
        lllllllllllllIlIIlIIIIlllIIIIIII.writeInt(lllllllllllllIlIIlIIIIlllIIIIIIl);
        "".length();
        return lllllllllllllIlIIlIIIIlllIIIIIII;
    }
    
    public static ByteBuf wrappedBuffer(final byte[] lllllllllllllIlIIlIIIlIIlIIIIIII, final int lllllllllllllIlIIlIIIlIIIlllllll, final int lllllllllllllIlIIlIIIlIIlIIIIIIl) {
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIlIIIIIIl)) {
            return Unpooled.EMPTY_BUFFER;
        }
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIIlllllll) && lIllllIIIlIllll(lllllllllllllIlIIlIIIlIIlIIIIIIl, lllllllllllllIlIIlIIIlIIlIIIIIII.length)) {
            return wrappedBuffer(lllllllllllllIlIIlIIIlIIlIIIIIII);
        }
        return wrappedBuffer(lllllllllllllIlIIlIIIlIIlIIIIIII).slice(lllllllllllllIlIIlIIIlIIIlllllll, lllllllllllllIlIIlIIIlIIlIIIIIIl);
    }
    
    public static ByteBuf copiedBuffer(final byte[]... lllllllllllllIlIIlIIIIllllllllII) {
        switch (lllllllllllllIlIIlIIIIllllllllII.length) {
            case 0: {
                return Unpooled.EMPTY_BUFFER;
            }
            case 1: {
                if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllllllllII[Unpooled.lIIIIlllIIIlII[1]].length)) {
                    return Unpooled.EMPTY_BUFFER;
                }
                return copiedBuffer(lllllllllllllIlIIlIIIIllllllllII[Unpooled.lIIIIlllIIIlII[1]]);
            }
            default: {
                int lllllllllllllIlIIlIIIIlllllllIll = Unpooled.lIIIIlllIIIlII[1];
                final byte[][] lllllllllllllIlIIlIIIlIIIIIIIIlI = lllllllllllllIlIIlIIIIllllllllII;
                final int lllllllllllllIlIIlIIIlIIIIIIIIIl = lllllllllllllIlIIlIIIlIIIIIIIIlI.length;
                int lllllllllllllIlIIlIIIlIIIIIIIIII = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIlIIIIIIIIII, lllllllllllllIlIIlIIIlIIIIIIIIIl)) {
                    final byte[] lllllllllllllIlIIlIIIlIIIIIIIIll = lllllllllllllIlIIlIIIlIIIIIIIIlI[lllllllllllllIlIIlIIIlIIIIIIIIII];
                    if (lIllllIIIllIIIl(Unpooled.lIIIIlllIIIlII[2] - lllllllllllllIlIIlIIIIlllllllIll, lllllllllllllIlIIlIIIlIIIIIIIIll.length)) {
                        throw new IllegalArgumentException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[1]]);
                    }
                    lllllllllllllIlIIlIIIIlllllllIll += lllllllllllllIlIIlIIIlIIIIIIIIll.length;
                    ++lllllllllllllIlIIlIIIlIIIIIIIIII;
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return null;
                    }
                }
                if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlllllllIll)) {
                    return Unpooled.EMPTY_BUFFER;
                }
                final byte[] lllllllllllllIlIIlIIIIlllllllIlI = new byte[lllllllllllllIlIIlIIIIlllllllIll];
                int lllllllllllllIlIIlIIIIlllllllllI = Unpooled.lIIIIlllIIIlII[1];
                int lllllllllllllIlIIlIIIIllllllllIl = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIlllllllllI, lllllllllllllIlIIlIIIIllllllllII.length)) {
                    final byte[] lllllllllllllIlIIlIIIIllllllllll = lllllllllllllIlIIlIIIIllllllllII[lllllllllllllIlIIlIIIIlllllllllI];
                    System.arraycopy(lllllllllllllIlIIlIIIIllllllllll, Unpooled.lIIIIlllIIIlII[1], lllllllllllllIlIIlIIIIlllllllIlI, lllllllllllllIlIIlIIIIllllllllIl, lllllllllllllIlIIlIIIIllllllllll.length);
                    lllllllllllllIlIIlIIIIllllllllIl += lllllllllllllIlIIlIIIIllllllllll.length;
                    ++lllllllllllllIlIIlIIIIlllllllllI;
                    "".length();
                    if ((0x22 ^ 0x6F ^ (0x58 ^ 0x11)) <= " ".length()) {
                        return null;
                    }
                }
                return wrappedBuffer(lllllllllllllIlIIlIIIIlllllllIlI);
            }
        }
    }
    
    public static ByteBuf copiedBuffer(final ByteBuf lllllllllllllIlIIlIIIlIIIIIIllII) {
        final int lllllllllllllIlIIlIIIlIIIIIIllIl = lllllllllllllIlIIlIIIlIIIIIIllII.readableBytes();
        if (lIllllIIIllIIll(lllllllllllllIlIIlIIIlIIIIIIllIl)) {
            final ByteBuf lllllllllllllIlIIlIIIlIIIIIIllll = buffer(lllllllllllllIlIIlIIIlIIIIIIllIl);
            lllllllllllllIlIIlIIIlIIIIIIllll.writeBytes(lllllllllllllIlIIlIIIlIIIIIIllII, lllllllllllllIlIIlIIIlIIIIIIllII.readerIndex(), lllllllllllllIlIIlIIIlIIIIIIllIl);
            "".length();
            return lllllllllllllIlIIlIIIlIIIIIIllll;
        }
        return Unpooled.EMPTY_BUFFER;
    }
    
    private static boolean lIllllIIIlIllll(final int lllllllllllllIlIIlIIIIlIlIIIllll, final int lllllllllllllIlIIlIIIIlIlIIIlllI) {
        return lllllllllllllIlIIlIIIIlIlIIIllll == lllllllllllllIlIIlIIIIlIlIIIlllI;
    }
    
    public static ByteBuf copiedBuffer(final byte[] lllllllllllllIlIIlIIIlIIIIlIIlII, final int lllllllllllllIlIIlIIIlIIIIlIIIll, final int lllllllllllllIlIIlIIIlIIIIlIIllI) {
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIIIlIIllI)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final byte[] lllllllllllllIlIIlIIIlIIIIlIIlIl = new byte[lllllllllllllIlIIlIIIlIIIIlIIllI];
        System.arraycopy(lllllllllllllIlIIlIIIlIIIIlIIlII, lllllllllllllIlIIlIIIlIIIIlIIIll, lllllllllllllIlIIlIIIlIIIIlIIlIl, Unpooled.lIIIIlllIIIlII[1], lllllllllllllIlIIlIIIlIIIIlIIllI);
        return wrappedBuffer(lllllllllllllIlIIlIIIlIIIIlIIlIl);
    }
    
    private Unpooled() {
    }
    
    private static ByteBuf copiedBuffer(final CharBuffer lllllllllllllIlIIlIIIIlllIIIllIl, final Charset lllllllllllllIlIIlIIIIlllIIIlIlI) {
        return ByteBufUtil.encodeString0(Unpooled.ALLOC, (boolean)(Unpooled.lIIIIlllIIIlII[3] != 0), lllllllllllllIlIIlIIIIlllIIIllIl, lllllllllllllIlIIlIIIIlllIIIlIlI);
    }
    
    public static ByteBuf wrappedBuffer(final ByteBuf lllllllllllllIlIIlIIIlIIIllllIIl) {
        if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIllllIIl.isReadable() ? 1 : 0)) {
            return lllllllllllllIlIIlIIIlIIIllllIIl.slice();
        }
        return Unpooled.EMPTY_BUFFER;
    }
    
    public static ByteBuf copyDouble(final double... lllllllllllllIlIIlIIIIlIllIlIIIl) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIlIllIlIIIl) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlIllIlIIIl.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIlIllIlIIII = buffer(lllllllllllllIlIIlIIIIlIllIlIIIl.length * Unpooled.lIIIIlllIIIlII[10]);
        final double[] lllllllllllllIlIIlIIIIlIllIlIlII = lllllllllllllIlIIlIIIIlIllIlIIIl;
        final int lllllllllllllIlIIlIIIIlIllIlIIll = lllllllllllllIlIIlIIIIlIllIlIlII.length;
        int lllllllllllllIlIIlIIIIlIllIlIIlI = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIlIllIlIIlI, lllllllllllllIlIIlIIIIlIllIlIIll)) {
            final double lllllllllllllIlIIlIIIIlIllIlIlIl = lllllllllllllIlIIlIIIIlIllIlIlII[lllllllllllllIlIIlIIIIlIllIlIIlI];
            lllllllllllllIlIIlIIIIlIllIlIIII.writeDouble(lllllllllllllIlIIlIIIIlIllIlIlIl);
            "".length();
            ++lllllllllllllIlIIlIIIIlIllIlIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIlIllIlIIII;
    }
    
    public static ByteBuf directBuffer() {
        return Unpooled.ALLOC.directBuffer();
    }
    
    private static String lIllllIIIIllllI(final String lllllllllllllIlIIlIIIIlIlIIlIlll, final String lllllllllllllIlIIlIIIIlIlIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIIlIlIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIlIlIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIIIlIlIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIIIlIlIIllIIl.init(Unpooled.lIIIIlllIIIlII[4], lllllllllllllIlIIlIIIIlIlIIllIlI);
            return new String(lllllllllllllIlIIlIIIIlIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIlIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIIlIlIIllIII) {
            lllllllllllllIlIIlIIIIlIlIIllIII.printStackTrace();
            return null;
        }
    }
    
    public static ByteBuf copyInt(final int... lllllllllllllIlIIlIIIIllIlllIIIl) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIllIlllIIIl) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllIlllIIIl.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIllIlllIIlI = buffer(lllllllllllllIlIIlIIIIllIlllIIIl.length * Unpooled.lIIIIlllIIIlII[6]);
        final int[] lllllllllllllIlIIlIIIIllIlllIllI = lllllllllllllIlIIlIIIIllIlllIIIl;
        final int lllllllllllllIlIIlIIIIllIlllIlIl = lllllllllllllIlIIlIIIIllIlllIllI.length;
        int lllllllllllllIlIIlIIIIllIlllIlII = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllIlllIlII, lllllllllllllIlIIlIIIIllIlllIlIl)) {
            final int lllllllllllllIlIIlIIIIllIlllIlll = lllllllllllllIlIIlIIIIllIlllIllI[lllllllllllllIlIIlIIIIllIlllIlII];
            lllllllllllllIlIIlIIIIllIlllIIlI.writeInt(lllllllllllllIlIIlIIIIllIlllIlll);
            "".length();
            ++lllllllllllllIlIIlIIIIllIlllIlII;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIllIlllIIlI;
    }
    
    public static ByteBuf wrappedBuffer(final byte[]... lllllllllllllIlIIlIIIlIIIlllIlIl) {
        return wrappedBuffer(Unpooled.lIIIIlllIIIlII[0], lllllllllllllIlIIlIIIlIIIlllIlIl);
    }
    
    private static boolean lIllllIIIllIlIl(final Object lllllllllllllIlIIlIIIIlIlIIIlIII) {
        return lllllllllllllIlIIlIIIIlIlIIIlIII != null;
    }
    
    public static ByteBuf copyFloat(final float... lllllllllllllIlIIlIIIIlIlllIIlll) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIlIlllIIlll) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlIlllIIlll.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIlIlllIlIII = buffer(lllllllllllllIlIIlIIIIlIlllIIlll.length * Unpooled.lIIIIlllIIIlII[6]);
        final float[] lllllllllllllIlIIlIIIIlIlllIllII = lllllllllllllIlIIlIIIIlIlllIIlll;
        final int lllllllllllllIlIIlIIIIlIlllIlIll = lllllllllllllIlIIlIIIIlIlllIllII.length;
        int lllllllllllllIlIIlIIIIlIlllIlIlI = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIlIlllIlIlI, lllllllllllllIlIIlIIIIlIlllIlIll)) {
            final float lllllllllllllIlIIlIIIIlIlllIllIl = lllllllllllllIlIIlIIIIlIlllIllII[lllllllllllllIlIIlIIIIlIlllIlIlI];
            lllllllllllllIlIIlIIIIlIlllIlIII.writeFloat(lllllllllllllIlIIlIIIIlIlllIllIl);
            "".length();
            ++lllllllllllllIlIIlIIIIlIlllIlIlI;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIlIlllIlIII;
    }
    
    public static ByteBuf wrappedBuffer(final byte[] lllllllllllllIlIIlIIIlIIlIIIIlll) {
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIlIIIIlll.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        return new UnpooledHeapByteBuf(Unpooled.ALLOC, lllllllllllllIlIIlIIIlIIlIIIIlll, lllllllllllllIlIIlIIIlIIlIIIIlll.length);
    }
    
    private static void lIllllIIIlIIIlI() {
        (lIIIIlllIIIIII = new String[Unpooled.lIIIIlllIIIlII[11]])[Unpooled.lIIIIlllIIIlII[1]] = lIllllIIIIllllI("dK0Fh7q1tjDm6lAp3cAGs88lQPylnT5wE+VCq9MhHQ5xo6q36adIAnSrj4uJy3XzZvuc/nV+6xk=", "xsYIX");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[3]] = lIllllIIIIlllll("sm6J9LJ5j9mhhblx99WOY+dgp51pXksKXJuneD4nPobdAk4D5BBjTEtflUD2IUFrCkOxJa52klI=", "GOCys");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[4]] = lIllllIIIIlllll("kaxV6DEc2lo3KmbZ2bfKLPiWICAkJP8+", "lHvZB");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[5]] = lIllllIIIlIIIII("ACYQYiU7OhQucTgrGyUlPG4aJHEgJhBiIiQrFis3PSsRYjMhKBMnIyduHDFxICEaYjM9KVs=", "TNuBQ");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[6]] = lIllllIIIlIIIII("AiETOw0YJgMgBgU7UDYaHypQOxEPKgI=", "kOpTc");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[7]] = lIllllIIIIllllI("2B27MhQT8E4=", "IJNjh");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[8]] = lIllllIIIIlllll("MMz1eMeypJw=", "EjkXj");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[9]] = lIllllIIIIlllll("kbVn4y9VOVk=", "UVbkU");
        Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[10]] = lIllllIIIIlllll("GUsVlR/5b3c=", "AErau");
    }
    
    public static ByteBuf copyShort(final int lllllllllllllIlIIlIIIIllIllIIlll) {
        final ByteBuf lllllllllllllIlIIlIIIIllIllIlIII = buffer(Unpooled.lIIIIlllIIIlII[4]);
        lllllllllllllIlIIlIIIIllIllIlIII.writeShort(lllllllllllllIlIIlIIIIllIllIIlll);
        "".length();
        return lllllllllllllIlIIlIIIIllIllIlIII;
    }
    
    public static ByteBuf buffer(final int lllllllllllllIlIIlIIIlIIlIIllIlI) {
        return Unpooled.ALLOC.heapBuffer(lllllllllllllIlIIlIIIlIIlIIllIlI);
    }
    
    private static void lIllllIIIlIllIl() {
        (lIIIIlllIIIlII = new int[12])[0] = (0x81 ^ 0xA5 ^ (0xA5 ^ 0x91));
        Unpooled.lIIIIlllIIIlII[1] = ((0xA7 ^ 0x96) & ~(0x68 ^ 0x59));
        Unpooled.lIIIIlllIIIlII[2] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        Unpooled.lIIIIlllIIIlII[3] = " ".length();
        Unpooled.lIIIIlllIIIlII[4] = "  ".length();
        Unpooled.lIIIIlllIIIlII[5] = "   ".length();
        Unpooled.lIIIIlllIIIlII[6] = (0x14 ^ 0x10);
        Unpooled.lIIIIlllIIIlII[7] = (0x73 ^ 0x2D ^ (0xC6 ^ 0x9D));
        Unpooled.lIIIIlllIIIlII[8] = (0x31 ^ 0x44 ^ (0x32 ^ 0x41));
        Unpooled.lIIIIlllIIIlII[9] = (0x2A ^ 0x2D);
        Unpooled.lIIIIlllIIIlII[10] = (0x93 ^ 0x9B);
        Unpooled.lIIIIlllIIIlII[11] = (65 + 112 + 12 + 0 ^ 156 + 58 - 122 + 88);
    }
    
    public static ByteBuf wrappedBuffer(final ByteBuf... lllllllllllllIlIIlIIIlIIIlllIIlI) {
        return wrappedBuffer(Unpooled.lIIIIlllIIIlII[0], lllllllllllllIlIIlIIIlIIIlllIIlI);
    }
    
    public static CompositeByteBuf compositeBuffer() {
        return compositeBuffer(Unpooled.lIIIIlllIIIlII[0]);
    }
    
    public static ByteBuf wrappedBuffer(final int lllllllllllllIlIIlIIIlIIIlIIllll, final ByteBuf... lllllllllllllIlIIlIIIlIIIlIIlllI) {
        switch (lllllllllllllIlIIlIIIlIIIlIIlllI.length) {
            case 0: {
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
                break;
            }
            case 1: {
                if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIlIIlllI[Unpooled.lIIIIlllIIIlII[1]].isReadable() ? 1 : 0)) {
                    return wrappedBuffer(lllllllllllllIlIIlIIIlIIIlIIlllI[Unpooled.lIIIIlllIIIlII[1]].order(Unpooled.BIG_ENDIAN));
                }
                break;
            }
            default: {
                final ByteBuf[] lllllllllllllIlIIlIIIlIIIlIlIIlI = lllllllllllllIlIIlIIIlIIIlIIlllI;
                final int lllllllllllllIlIIlIIIlIIIlIlIIIl = lllllllllllllIlIIlIIIlIIIlIlIIlI.length;
                int lllllllllllllIlIIlIIIlIIIlIlIIII = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIlIIIlIlIIII, lllllllllllllIlIIlIIIlIIIlIlIIIl)) {
                    final ByteBuf lllllllllllllIlIIlIIIlIIIlIlIIll = lllllllllllllIlIIlIIIlIIIlIlIIlI[lllllllllllllIlIIlIIIlIIIlIlIIII];
                    if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIlIlIIll.isReadable() ? 1 : 0)) {
                        return new CompositeByteBuf(Unpooled.ALLOC, (boolean)(Unpooled.lIIIIlllIIIlII[1] != 0), lllllllllllllIlIIlIIIlIIIlIIllll, lllllllllllllIlIIlIIIlIIIlIIlllI);
                    }
                    ++lllllllllllllIlIIlIIIlIIIlIlIIII;
                    "".length();
                    if (" ".length() == -" ".length()) {
                        return null;
                    }
                }
                break;
            }
        }
        return Unpooled.EMPTY_BUFFER;
    }
    
    private static boolean lIllllIIIllIIII(final int lllllllllllllIlIIlIIIIlIlIIIIIII) {
        return lllllllllllllIlIIlIIIIlIlIIIIIII != 0;
    }
    
    public static ByteBuf copyLong(final long... lllllllllllllIlIIlIIIIllIIIlIlll) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIllIIIlIlll) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllIIIlIlll.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIllIIIllIII = buffer(lllllllllllllIlIIlIIIIllIIIlIlll.length * Unpooled.lIIIIlllIIIlII[10]);
        final long[] lllllllllllllIlIIlIIIIllIIIlllII = lllllllllllllIlIIlIIIIllIIIlIlll;
        final int lllllllllllllIlIIlIIIIllIIIllIll = lllllllllllllIlIIlIIIIllIIIlllII.length;
        int lllllllllllllIlIIlIIIIllIIIllIlI = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllIIIllIlI, lllllllllllllIlIIlIIIIllIIIllIll)) {
            final long lllllllllllllIlIIlIIIIllIIIlllIl = lllllllllllllIlIIlIIIIllIIIlllII[lllllllllllllIlIIlIIIIllIIIllIlI];
            lllllllllllllIlIIlIIIIllIIIllIII.writeLong(lllllllllllllIlIIlIIIIllIIIlllIl);
            "".length();
            ++lllllllllllllIlIIlIIIIllIIIllIlI;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIllIIIllIII;
    }
    
    public static ByteBuf copyBoolean(final boolean... lllllllllllllIlIIlIIIIlIllllllll) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIlIllllllll) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlIllllllll.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIllIIIIIIII = buffer(lllllllllllllIlIIlIIIIlIllllllll.length);
        final boolean[] lllllllllllllIlIIlIIIIllIIIIIlII = lllllllllllllIlIIlIIIIlIllllllll;
        final int lllllllllllllIlIIlIIIIllIIIIIIll = lllllllllllllIlIIlIIIIllIIIIIlII.length;
        int lllllllllllllIlIIlIIIIllIIIIIIlI = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllIIIIIIlI, lllllllllllllIlIIlIIIIllIIIIIIll)) {
            final boolean lllllllllllllIlIIlIIIIllIIIIIlIl = lllllllllllllIlIIlIIIIllIIIIIlII[lllllllllllllIlIIlIIIIllIIIIIIlI];
            lllllllllllllIlIIlIIIIllIIIIIIII.writeBoolean(lllllllllllllIlIIlIIIIllIIIIIlIl);
            "".length();
            ++lllllllllllllIlIIlIIIIllIIIIIIlI;
            "".length();
            if ((0x28 ^ 0x62 ^ (0xCC ^ 0x82)) < -" ".length()) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIllIIIIIIII;
    }
    
    public static ByteBuf copiedBuffer(final byte[] lllllllllllllIlIIlIIIlIIIIlIllIl) {
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIIIlIllIl.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        return wrappedBuffer(lllllllllllllIlIIlIIIlIIIIlIllIl.clone());
    }
    
    public static ByteBuf copiedBuffer(final ByteBuffer... lllllllllllllIlIIlIIIIlllIllllll) {
        switch (lllllllllllllIlIIlIIIIlllIllllll.length) {
            case 0: {
                return Unpooled.EMPTY_BUFFER;
            }
            case 1: {
                return copiedBuffer(lllllllllllllIlIIlIIIIlllIllllll[Unpooled.lIIIIlllIIIlII[1]]);
            }
            default: {
                ByteOrder lllllllllllllIlIIlIIIIllllIIIIlI = null;
                int lllllllllllllIlIIlIIIIllllIIIIIl = Unpooled.lIIIIlllIIIlII[1];
                final ByteBuffer[] lllllllllllllIlIIlIIIIllllIIlIll = lllllllllllllIlIIlIIIIlllIllllll;
                final int lllllllllllllIlIIlIIIIllllIIlIlI = lllllllllllllIlIIlIIIIllllIIlIll.length;
                int lllllllllllllIlIIlIIIIllllIIlIIl = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllllIIlIIl, lllllllllllllIlIIlIIIIllllIIlIlI)) {
                    final ByteBuffer lllllllllllllIlIIlIIIIllllIIllII = lllllllllllllIlIIlIIIIllllIIlIll[lllllllllllllIlIIlIIIIllllIIlIIl];
                    final int lllllllllllllIlIIlIIIIllllIIllIl = lllllllllllllIlIIlIIIIllllIIllII.remaining();
                    if (lIllllIIIllIlII(lllllllllllllIlIIlIIIIllllIIllIl)) {
                        "".length();
                        if (-(0x69 ^ 0x73 ^ (0x3B ^ 0x25)) > 0) {
                            return null;
                        }
                    }
                    else {
                        if (lIllllIIIllIIIl(Unpooled.lIIIIlllIIIlII[2] - lllllllllllllIlIIlIIIIllllIIIIIl, lllllllllllllIlIIlIIIIllllIIllIl)) {
                            throw new IllegalArgumentException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[5]]);
                        }
                        lllllllllllllIlIIlIIIIllllIIIIIl += lllllllllllllIlIIlIIIIllllIIllIl;
                        if (lIllllIIIllIlIl(lllllllllllllIlIIlIIIIllllIIIIlI)) {
                            if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllllIIIIlI.equals(lllllllllllllIlIIlIIIIllllIIllII.order()) ? 1 : 0)) {
                                throw new IllegalArgumentException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[6]]);
                            }
                        }
                        else {
                            lllllllllllllIlIIlIIIIllllIIIIlI = lllllllllllllIlIIlIIIIllllIIllII.order();
                        }
                    }
                    ++lllllllllllllIlIIlIIIIllllIIlIIl;
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllllIIIIIl)) {
                    return Unpooled.EMPTY_BUFFER;
                }
                final byte[] lllllllllllllIlIIlIIIIllllIIIIII = new byte[lllllllllllllIlIIlIIIIllllIIIIIl];
                int lllllllllllllIlIIlIIIIllllIIIlIl = Unpooled.lIIIIlllIIIlII[1];
                int lllllllllllllIlIIlIIIIllllIIIlII = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllllIIIlIl, lllllllllllllIlIIlIIIIlllIllllll.length)) {
                    final ByteBuffer lllllllllllllIlIIlIIIIllllIIlIII = lllllllllllllIlIIlIIIIlllIllllll[lllllllllllllIlIIlIIIIllllIIIlIl];
                    final int lllllllllllllIlIIlIIIIllllIIIlll = lllllllllllllIlIIlIIIIllllIIlIII.remaining();
                    final int lllllllllllllIlIIlIIIIllllIIIllI = lllllllllllllIlIIlIIIIllllIIlIII.position();
                    lllllllllllllIlIIlIIIIllllIIlIII.get(lllllllllllllIlIIlIIIIllllIIIIII, lllllllllllllIlIIlIIIIllllIIIlII, lllllllllllllIlIIlIIIIllllIIIlll);
                    "".length();
                    lllllllllllllIlIIlIIIIllllIIlIII.position(lllllllllllllIlIIlIIIIllllIIIllI);
                    "".length();
                    lllllllllllllIlIIlIIIIllllIIIlII += lllllllllllllIlIIlIIIIllllIIIlll;
                    ++lllllllllllllIlIIlIIIIllllIIIlIl;
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                }
                return wrappedBuffer(lllllllllllllIlIIlIIIIllllIIIIII).order(lllllllllllllIlIIlIIIIllllIIIIlI);
            }
        }
    }
    
    public static ByteBuf directBuffer(final int lllllllllllllIlIIlIIIlIIlIIIllIl, final int lllllllllllllIlIIlIIIlIIlIIIlIlI) {
        return Unpooled.ALLOC.directBuffer(lllllllllllllIlIIlIIIlIIlIIIllIl, lllllllllllllIlIIlIIIlIIlIIIlIlI);
    }
    
    static {
        lIllllIIIlIllIl();
        lIllllIIIlIIIlI();
        ALLOC = UnpooledByteBufAllocator.DEFAULT;
        BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        EMPTY_BUFFER = Unpooled.ALLOC.buffer(Unpooled.lIIIIlllIIIlII[1], Unpooled.lIIIIlllIIIlII[1]);
    }
    
    private static boolean lIllllIIIllIllI(final Object lllllllllllllIlIIlIIIIlIlIIIIlIl, final Object lllllllllllllIlIIlIIIIlIlIIIIlII) {
        return lllllllllllllIlIIlIIIIlIlIIIIlIl == lllllllllllllIlIIlIIIIlIlIIIIlII;
    }
    
    public static ByteBuf copyMedium(final int lllllllllllllIlIIlIIIIllIIllllIl) {
        final ByteBuf lllllllllllllIlIIlIIIIllIIlllllI = buffer(Unpooled.lIIIIlllIIIlII[5]);
        lllllllllllllIlIIlIIIIllIIlllllI.writeMedium(lllllllllllllIlIIlIIIIllIIllllIl);
        "".length();
        return lllllllllllllIlIIlIIIIllIIlllllI;
    }
    
    public static ByteBuf directBuffer(final int lllllllllllllIlIIlIIIlIIlIIlIllI) {
        return Unpooled.ALLOC.directBuffer(lllllllllllllIlIIlIIIlIIlIIlIllI);
    }
    
    private static boolean lIllllIIIlIlllI(final int lllllllllllllIlIIlIIIIlIIllllllI) {
        return lllllllllllllIlIIlIIIIlIIllllllI == 0;
    }
    
    public static ByteBuf copiedBuffer(final ByteBuffer lllllllllllllIlIIlIIIlIIIIIlIlll) {
        final int lllllllllllllIlIIlIIIlIIIIIllIlI = lllllllllllllIlIIlIIIlIIIIIlIlll.remaining();
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIIIIllIlI)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final byte[] lllllllllllllIlIIlIIIlIIIIIllIIl = new byte[lllllllllllllIlIIlIIIlIIIIIllIlI];
        final int lllllllllllllIlIIlIIIlIIIIIllIII = lllllllllllllIlIIlIIIlIIIIIlIlll.position();
        try {
            lllllllllllllIlIIlIIIlIIIIIlIlll.get(lllllllllllllIlIIlIIIlIIIIIllIIl);
            "".length();
            lllllllllllllIlIIlIIIlIIIIIlIlll.position(lllllllllllllIlIIlIIIlIIIIIllIII);
            "".length();
            "".length();
            if (-" ".length() == ((0xD2 ^ 0xB2) & ~(0x51 ^ 0x31))) {
                return null;
            }
        }
        finally {
            lllllllllllllIlIIlIIIlIIIIIlIlll.position(lllllllllllllIlIIlIIIlIIIIIllIII);
            "".length();
        }
        return wrappedBuffer(lllllllllllllIlIIlIIIlIIIIIllIIl).order(lllllllllllllIlIIlIIIlIIIIIlIlll.order());
    }
    
    public static ByteBuf copyMedium(final int... lllllllllllllIlIIlIIIIllIIlIllll) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIllIIlIllll) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllIIlIllll.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIllIIllIIII = buffer(lllllllllllllIlIIlIIIIllIIlIllll.length * Unpooled.lIIIIlllIIIlII[5]);
        final int[] lllllllllllllIlIIlIIIIllIIllIlII = lllllllllllllIlIIlIIIIllIIlIllll;
        final int lllllllllllllIlIIlIIIIllIIllIIll = lllllllllllllIlIIlIIIIllIIllIlII.length;
        int lllllllllllllIlIIlIIIIllIIllIIlI = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllIIllIIlI, lllllllllllllIlIIlIIIIllIIllIIll)) {
            final int lllllllllllllIlIIlIIIIllIIllIlIl = lllllllllllllIlIIlIIIIllIIllIlII[lllllllllllllIlIIlIIIIllIIllIIlI];
            lllllllllllllIlIIlIIIIllIIllIIII.writeMedium(lllllllllllllIlIIlIIIIllIIllIlIl);
            "".length();
            ++lllllllllllllIlIIlIIIIllIIllIIlI;
            "".length();
            if (-" ".length() >= ((0x5C ^ 0x6F) & ~(0xB8 ^ 0x8B))) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIllIIllIIII;
    }
    
    public static ByteBuf copyBoolean(final boolean lllllllllllllIlIIlIIIIllIIIIllIl) {
        final ByteBuf lllllllllllllIlIIlIIIIllIIIIlllI = buffer(Unpooled.lIIIIlllIIIlII[3]);
        lllllllllllllIlIIlIIIIllIIIIlllI.writeBoolean(lllllllllllllIlIIlIIIIllIIIIllIl);
        "".length();
        return lllllllllllllIlIIlIIIIllIIIIlllI;
    }
    
    public static ByteBuf copyDouble(final double lllllllllllllIlIIlIIIIlIllIlllll) {
        final ByteBuf lllllllllllllIlIIlIIIIlIllIllllI = buffer(Unpooled.lIIIIlllIIIlII[10]);
        lllllllllllllIlIIlIIIIlIllIllllI.writeDouble(lllllllllllllIlIIlIIIIlIllIlllll);
        "".length();
        return lllllllllllllIlIIlIIIIlIllIllllI;
    }
    
    public static ByteBuf wrappedBuffer(final int lllllllllllllIlIIlIIIlIIIIlllIll, final ByteBuffer... lllllllllllllIlIIlIIIlIIIIlllIlI) {
        switch (lllllllllllllIlIIlIIIlIIIIlllIlI.length) {
            case 0: {
                "".length();
                if (-(0x81 ^ 0xA7 ^ (0x8A ^ 0xA8)) > 0) {
                    return null;
                }
                break;
            }
            case 1: {
                if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIIlllIlI[Unpooled.lIIIIlllIIIlII[1]].hasRemaining() ? 1 : 0)) {
                    return wrappedBuffer(lllllllllllllIlIIlIIIlIIIIlllIlI[Unpooled.lIIIIlllIIIlII[1]].order(Unpooled.BIG_ENDIAN));
                }
                break;
            }
            default: {
                final List<ByteBuf> lllllllllllllIlIIlIIIlIIIIllllII = new ArrayList<ByteBuf>(lllllllllllllIlIIlIIIlIIIIlllIlI.length);
                final ByteBuffer[] lllllllllllllIlIIlIIIlIIIIllllll = lllllllllllllIlIIlIIIlIIIIlllIlI;
                final int lllllllllllllIlIIlIIIlIIIIlllllI = lllllllllllllIlIIlIIIlIIIIllllll.length;
                int lllllllllllllIlIIlIIIlIIIIllllIl = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIlIIIIllllIl, lllllllllllllIlIIlIIIlIIIIlllllI)) {
                    final ByteBuffer lllllllllllllIlIIlIIIlIIIlIIIIII = lllllllllllllIlIIlIIIlIIIIllllll[lllllllllllllIlIIlIIIlIIIIllllIl];
                    if (lIllllIIIllIIlI(lllllllllllllIlIIlIIIlIIIlIIIIII)) {
                        "".length();
                        if (-" ".length() >= 0) {
                            return null;
                        }
                        break;
                    }
                    else {
                        if (lIllllIIIllIIll(lllllllllllllIlIIlIIIlIIIlIIIIII.remaining())) {
                            lllllllllllllIlIIlIIIlIIIIllllII.add(wrappedBuffer(lllllllllllllIlIIlIIIlIIIlIIIIII.order(Unpooled.BIG_ENDIAN)));
                            "".length();
                        }
                        ++lllllllllllllIlIIlIIIlIIIIllllIl;
                        "".length();
                        if (-"  ".length() > 0) {
                            return null;
                        }
                        continue;
                    }
                }
                if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIIIllllII.isEmpty() ? 1 : 0)) {
                    return new CompositeByteBuf(Unpooled.ALLOC, (boolean)(Unpooled.lIIIIlllIIIlII[1] != 0), lllllllllllllIlIIlIIIlIIIIlllIll, lllllllllllllIlIIlIIIlIIIIllllII);
                }
                break;
            }
        }
        return Unpooled.EMPTY_BUFFER;
    }
    
    private static boolean lIllllIIIllIIll(final int lllllllllllllIlIIlIIIIlIIllllIlI) {
        return lllllllllllllIlIIlIIIIlIIllllIlI > 0;
    }
    
    public static ByteBuf copiedBuffer(final ByteBuf... lllllllllllllIlIIlIIIIlllllIIIlI) {
        switch (lllllllllllllIlIIlIIIIlllllIIIlI.length) {
            case 0: {
                return Unpooled.EMPTY_BUFFER;
            }
            case 1: {
                return copiedBuffer(lllllllllllllIlIIlIIIIlllllIIIlI[Unpooled.lIIIIlllIIIlII[1]]);
            }
            default: {
                ByteOrder lllllllllllllIlIIlIIIIlllllIIIIl = null;
                int lllllllllllllIlIIlIIIIlllllIIIII = Unpooled.lIIIIlllIIIlII[1];
                final ByteBuf[] lllllllllllllIlIIlIIIIlllllIlIIl = lllllllllllllIlIIlIIIIlllllIIIlI;
                final int lllllllllllllIlIIlIIIIlllllIlIII = lllllllllllllIlIIlIIIIlllllIlIIl.length;
                int lllllllllllllIlIIlIIIIlllllIIlll = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIlllllIIlll, lllllllllllllIlIIlIIIIlllllIlIII)) {
                    final ByteBuf lllllllllllllIlIIlIIIIlllllIlIlI = lllllllllllllIlIIlIIIIlllllIlIIl[lllllllllllllIlIIlIIIIlllllIIlll];
                    final int lllllllllllllIlIIlIIIIlllllIlIll = lllllllllllllIlIIlIIIIlllllIlIlI.readableBytes();
                    if (lIllllIIIllIlII(lllllllllllllIlIIlIIIIlllllIlIll)) {
                        "".length();
                        if (-(0x29 ^ 0x2D) > 0) {
                            return null;
                        }
                    }
                    else {
                        if (lIllllIIIllIIIl(Unpooled.lIIIIlllIIIlII[2] - lllllllllllllIlIIlIIIIlllllIIIII, lllllllllllllIlIIlIIIIlllllIlIll)) {
                            throw new IllegalArgumentException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[3]]);
                        }
                        lllllllllllllIlIIlIIIIlllllIIIII += lllllllllllllIlIIlIIIIlllllIlIll;
                        if (lIllllIIIllIlIl(lllllllllllllIlIIlIIIIlllllIIIIl)) {
                            if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlllllIIIIl.equals(lllllllllllllIlIIlIIIIlllllIlIlI.order()) ? 1 : 0)) {
                                throw new IllegalArgumentException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[4]]);
                            }
                        }
                        else {
                            lllllllllllllIlIIlIIIIlllllIIIIl = lllllllllllllIlIIlIIIIlllllIlIlI.order();
                        }
                    }
                    ++lllllllllllllIlIIlIIIIlllllIIlll;
                    "".length();
                    if (-(0x85 ^ 0x80) >= 0) {
                        return null;
                    }
                }
                if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlllllIIIII)) {
                    return Unpooled.EMPTY_BUFFER;
                }
                final byte[] lllllllllllllIlIIlIIIIllllIlllll = new byte[lllllllllllllIlIIlIIIIlllllIIIII];
                int lllllllllllllIlIIlIIIIlllllIIlII = Unpooled.lIIIIlllIIIlII[1];
                int lllllllllllllIlIIlIIIIlllllIIIll = Unpooled.lIIIIlllIIIlII[1];
                while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIlllllIIlII, lllllllllllllIlIIlIIIIlllllIIIlI.length)) {
                    final ByteBuf lllllllllllllIlIIlIIIIlllllIIllI = lllllllllllllIlIIlIIIIlllllIIIlI[lllllllllllllIlIIlIIIIlllllIIlII];
                    final int lllllllllllllIlIIlIIIIlllllIIlIl = lllllllllllllIlIIlIIIIlllllIIllI.readableBytes();
                    lllllllllllllIlIIlIIIIlllllIIllI.getBytes(lllllllllllllIlIIlIIIIlllllIIllI.readerIndex(), lllllllllllllIlIIlIIIIllllIlllll, lllllllllllllIlIIlIIIIlllllIIIll, lllllllllllllIlIIlIIIIlllllIIlIl);
                    "".length();
                    lllllllllllllIlIIlIIIIlllllIIIll += lllllllllllllIlIIlIIIIlllllIIlIl;
                    ++lllllllllllllIlIIlIIIIlllllIIlII;
                    "".length();
                    if (" ".length() < ((0xE ^ 0x1B) & ~(0x79 ^ 0x6C))) {
                        return null;
                    }
                }
                return wrappedBuffer(lllllllllllllIlIIlIIIIllllIlllll).order(lllllllllllllIlIIlIIIIlllllIIIIl);
            }
        }
    }
    
    private static boolean lIllllIIIllIlII(final int lllllllllllllIlIIlIIIIlIIlllllII) {
        return lllllllllllllIlIIlIIIIlIIlllllII <= 0;
    }
    
    public static ByteBuf copyLong(final long lllllllllllllIlIIlIIIIllIIlIIlIl) {
        final ByteBuf lllllllllllllIlIIlIIIIllIIlIIllI = buffer(Unpooled.lIIIIlllIIIlII[10]);
        lllllllllllllIlIIlIIIIllIIlIIllI.writeLong(lllllllllllllIlIIlIIIIllIIlIIlIl);
        "".length();
        return lllllllllllllIlIIlIIIIllIIlIIllI;
    }
    
    public static ByteBuf wrappedBuffer(final ByteBuffer... lllllllllllllIlIIlIIIlIIIlllIIII) {
        return wrappedBuffer(Unpooled.lIIIIlllIIIlII[0], lllllllllllllIlIIlIIIlIIIlllIIII);
    }
    
    public static ByteBuf copyShort(final short... lllllllllllllIlIIlIIIIllIlIllIIl) {
        if (!lIllllIIIllIlIl(lllllllllllllIlIIlIIIIllIlIllIIl) || lIllllIIIlIlllI(lllllllllllllIlIIlIIIIllIlIllIIl.length)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIIlIIIIllIlIllIlI = buffer(lllllllllllllIlIIlIIIIllIlIllIIl.length * Unpooled.lIIIIlllIIIlII[4]);
        final short[] lllllllllllllIlIIlIIIIllIlIllllI = lllllllllllllIlIIlIIIIllIlIllIIl;
        final int lllllllllllllIlIIlIIIIllIlIlllIl = lllllllllllllIlIIlIIIIllIlIllllI.length;
        int lllllllllllllIlIIlIIIIllIlIlllII = Unpooled.lIIIIlllIIIlII[1];
        while (lIllllIIIllIIIl(lllllllllllllIlIIlIIIIllIlIlllII, lllllllllllllIlIIlIIIIllIlIlllIl)) {
            final int lllllllllllllIlIIlIIIIllIlIlllll = lllllllllllllIlIIlIIIIllIlIllllI[lllllllllllllIlIIlIIIIllIlIlllII];
            lllllllllllllIlIIlIIIIllIlIllIlI.writeShort(lllllllllllllIlIIlIIIIllIlIlllll);
            "".length();
            ++lllllllllllllIlIIlIIIIllIlIlllII;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return lllllllllllllIlIIlIIIIllIlIllIlI;
    }
    
    public static ByteBuf copiedBuffer(final CharSequence lllllllllllllIlIIlIIIIlllIlIlIlI, final int lllllllllllllIlIIlIIIIlllIlIIlIl, final int lllllllllllllIlIIlIIIIlllIlIlIII, final Charset lllllllllllllIlIIlIIIIlllIlIIlll) {
        if (lIllllIIIllIIlI(lllllllllllllIlIIlIIIIlllIlIlIlI)) {
            throw new NullPointerException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[8]]);
        }
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlllIlIlIII)) {
            return Unpooled.EMPTY_BUFFER;
        }
        if (!lIllllIIIllIIII((lllllllllllllIlIIlIIIIlllIlIlIlI instanceof CharBuffer) ? 1 : 0)) {
            return copiedBuffer(CharBuffer.wrap(lllllllllllllIlIIlIIIIlllIlIlIlI, lllllllllllllIlIIlIIIIlllIlIIlIl, lllllllllllllIlIIlIIIIlllIlIIlIl + lllllllllllllIlIIlIIIIlllIlIlIII), lllllllllllllIlIIlIIIIlllIlIIlll);
        }
        CharBuffer lllllllllllllIlIIlIIIIlllIlIlIll = (CharBuffer)lllllllllllllIlIIlIIIIlllIlIlIlI;
        if (lIllllIIIllIIII(lllllllllllllIlIIlIIIIlllIlIlIll.hasArray() ? 1 : 0)) {
            return copiedBuffer(lllllllllllllIlIIlIIIIlllIlIlIll.array(), lllllllllllllIlIIlIIIIlllIlIlIll.arrayOffset() + lllllllllllllIlIIlIIIIlllIlIlIll.position() + lllllllllllllIlIIlIIIIlllIlIIlIl, lllllllllllllIlIIlIIIIlllIlIlIII, lllllllllllllIlIIlIIIIlllIlIIlll);
        }
        lllllllllllllIlIIlIIIIlllIlIlIll = lllllllllllllIlIIlIIIIlllIlIlIll.slice();
        lllllllllllllIlIIlIIIIlllIlIlIll.limit(lllllllllllllIlIIlIIIIlllIlIlIII);
        "".length();
        lllllllllllllIlIIlIIIIlllIlIlIll.position(lllllllllllllIlIIlIIIIlllIlIIlIl);
        "".length();
        return copiedBuffer(lllllllllllllIlIIlIIIIlllIlIlIll, lllllllllllllIlIIlIIIIlllIlIIlll);
    }
    
    public static ByteBuf buffer() {
        return Unpooled.ALLOC.heapBuffer();
    }
    
    private static boolean lIllllIIIllIIlI(final Object lllllllllllllIlIIlIIIIlIlIIIIIlI) {
        return lllllllllllllIlIIlIIIIlIlIIIIIlI == null;
    }
    
    public static ByteBuf copiedBuffer(final char[] lllllllllllllIlIIlIIIIlllIIlIIll, final int lllllllllllllIlIIlIIIIlllIIlIllI, final int lllllllllllllIlIIlIIIIlllIIlIIIl, final Charset lllllllllllllIlIIlIIIIlllIIlIIII) {
        if (lIllllIIIllIIlI(lllllllllllllIlIIlIIIIlllIIlIIll)) {
            throw new NullPointerException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[10]]);
        }
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIIlllIIlIIIl)) {
            return Unpooled.EMPTY_BUFFER;
        }
        return copiedBuffer(CharBuffer.wrap(lllllllllllllIlIIlIIIIlllIIlIIll, lllllllllllllIlIIlIIIIlllIIlIllI, lllllllllllllIlIIlIIIIlllIIlIIIl), lllllllllllllIlIIlIIIIlllIIlIIII);
    }
    
    public static ByteBuf copiedBuffer(final char[] lllllllllllllIlIIlIIIIlllIIlllIl, final Charset lllllllllllllIlIIlIIIIlllIIlllII) {
        if (lIllllIIIllIIlI(lllllllllllllIlIIlIIIIlllIIlllIl)) {
            throw new NullPointerException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[9]]);
        }
        return copiedBuffer(lllllllllllllIlIIlIIIIlllIIlllIl, Unpooled.lIIIIlllIIIlII[1], lllllllllllllIlIIlIIIIlllIIlllIl.length, lllllllllllllIlIIlIIIIlllIIlllII);
    }
    
    public static ByteBuf unmodifiableBuffer(final ByteBuf lllllllllllllIlIIlIIIIlllIIIIlll) {
        final ByteOrder lllllllllllllIlIIlIIIIlllIIIIllI = lllllllllllllIlIIlIIIIlllIIIIlll.order();
        if (lIllllIIIllIllI(lllllllllllllIlIIlIIIIlllIIIIllI, Unpooled.BIG_ENDIAN)) {
            return new ReadOnlyByteBuf(lllllllllllllIlIIlIIIIlllIIIIlll);
        }
        return new ReadOnlyByteBuf(lllllllllllllIlIIlIIIIlllIIIIlll.order(Unpooled.BIG_ENDIAN)).order(Unpooled.LITTLE_ENDIAN);
    }
    
    public static ByteBuf wrappedBuffer(final ByteBuffer lllllllllllllIlIIlIIIlIIIllllIll) {
        if (lIllllIIIlIlllI(lllllllllllllIlIIlIIIlIIIllllIll.hasRemaining() ? 1 : 0)) {
            return Unpooled.EMPTY_BUFFER;
        }
        if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIllllIll.hasArray() ? 1 : 0)) {
            return wrappedBuffer(lllllllllllllIlIIlIIIlIIIllllIll.array(), lllllllllllllIlIIlIIIlIIIllllIll.arrayOffset() + lllllllllllllIlIIlIIIlIIIllllIll.position(), lllllllllllllIlIIlIIIlIIIllllIll.remaining()).order(lllllllllllllIlIIlIIIlIIIllllIll.order());
        }
        if (lIllllIIIllIIII(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            if (!lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIllllIll.isReadOnly() ? 1 : 0)) {
                return new UnpooledUnsafeDirectByteBuf(Unpooled.ALLOC, lllllllllllllIlIIlIIIlIIIllllIll, lllllllllllllIlIIlIIIlIIIllllIll.remaining());
            }
            if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIllllIll.isDirect() ? 1 : 0)) {
                return new ReadOnlyUnsafeDirectByteBuf(Unpooled.ALLOC, lllllllllllllIlIIlIIIlIIIllllIll);
            }
            return new ReadOnlyByteBufferBuf(Unpooled.ALLOC, lllllllllllllIlIIlIIIlIIIllllIll);
        }
        else {
            if (lIllllIIIllIIII(lllllllllllllIlIIlIIIlIIIllllIll.isReadOnly() ? 1 : 0)) {
                return new ReadOnlyByteBufferBuf(Unpooled.ALLOC, lllllllllllllIlIIlIIIlIIIllllIll);
            }
            return new UnpooledDirectByteBuf(Unpooled.ALLOC, lllllllllllllIlIIlIIIlIIIllllIll, lllllllllllllIlIIlIIIlIIIllllIll.remaining());
        }
    }
    
    private static boolean lIllllIIIllIIIl(final int lllllllllllllIlIIlIIIIlIlIIIlIll, final int lllllllllllllIlIIlIIIIlIlIIIlIlI) {
        return lllllllllllllIlIIlIIIIlIlIIIlIll < lllllllllllllIlIIlIIIIlIlIIIlIlI;
    }
    
    private static String lIllllIIIIlllll(final String lllllllllllllIlIIlIIIIlIlIllllII, final String lllllllllllllIlIIlIIIIlIlIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIIlIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIlIlIlllIIl.getBytes(StandardCharsets.UTF_8)), Unpooled.lIIIIlllIIIlII[10]), "DES");
            final Cipher lllllllllllllIlIIlIIIIlIlIlllllI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIIIlIlIlllllI.init(Unpooled.lIIIIlllIIIlII[4], lllllllllllllIlIIlIIIIlIlIllllll);
            return new String(lllllllllllllIlIIlIIIIlIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIlIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIIlIlIllllIl) {
            lllllllllllllIlIIlIIIIlIlIllllIl.printStackTrace();
            return null;
        }
    }
    
    public static ByteBuf copiedBuffer(final CharSequence lllllllllllllIlIIlIIIIlllIllIIlI, final Charset lllllllllllllIlIIlIIIIlllIllIIll) {
        if (lIllllIIIllIIlI(lllllllllllllIlIIlIIIIlllIllIIlI)) {
            throw new NullPointerException(Unpooled.lIIIIlllIIIIII[Unpooled.lIIIIlllIIIlII[7]]);
        }
        if (lIllllIIIllIIII((lllllllllllllIlIIlIIIIlllIllIIlI instanceof CharBuffer) ? 1 : 0)) {
            return copiedBuffer((CharBuffer)lllllllllllllIlIIlIIIIlllIllIIlI, lllllllllllllIlIIlIIIIlllIllIIll);
        }
        return copiedBuffer(CharBuffer.wrap(lllllllllllllIlIIlIIIIlllIllIIlI), lllllllllllllIlIIlIIIIlllIllIIll);
    }
}
