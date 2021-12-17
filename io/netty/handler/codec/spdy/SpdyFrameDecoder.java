// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SpdyFrameDecoder
{
    private final /* synthetic */ int maxChunkSize;
    private /* synthetic */ byte flags;
    private final /* synthetic */ SpdyFrameDecoderDelegate delegate;
    private /* synthetic */ int numSettings;
    private static final /* synthetic */ String[] llIlIlIlIIllII;
    private /* synthetic */ State state;
    private /* synthetic */ int length;
    private static final /* synthetic */ int[] llIlIlIlIIlllI;
    private final /* synthetic */ int spdyVersion;
    private /* synthetic */ int streamId;
    
    private static void lIIlIlIIIlIlIlII() {
        (llIlIlIlIIllII = new String[SpdyFrameDecoder.llIlIlIlIIlllI[15]])[SpdyFrameDecoder.llIlIlIlIIlllI[1]] = lIIlIlIIIlIlIIII("Gl7cB0BQaMaMU96JST2vQQ==", "epKaM");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[2]] = lIIlIlIIIlIlIIII("vLK7POnvzKTTccRrQvGVxw==", "uBZug");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[3]] = lIIlIlIIIlIlIIII("R8EwRXq8lAFbQvo5UloaTsB7JjsTGzYA51o7XqjiirzY2a9lRBvarWXtcw8gUD8o", "KtNTK");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[9]] = lIIlIlIIIlIlIIII("hDmVwdzYyishBoU4RcRqgMDt+E9Fj1wx", "jmRWt");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[5]] = lIIlIlIIIlIlIIlI("LAIzGAYMCGU/GAQBIFkvFx4qCw==", "elEyj");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[6]] = lIIlIlIIIlIlIIll("nrpFjofft7VItQkbF0327VBJRgF5qinDrsMLBK50u7w=", "ALUhg");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[12]] = lIIlIlIIIlIlIIII("XBDCw5isJzY1SHLAvqHky7AdfisjOSXn", "xZeXu");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[11]] = lIIlIlIIIlIlIIll("tGF0dXBRhmz9OuTeSE1x9Ltu/MmsGQ88tDYZvHwQVkA=", "zfgNj");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[4]] = lIIlIlIIIlIlIIll("jiFyp5e73Z7QH7HJewLuzRnUndaY79gV", "oKyxL");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[13]] = lIIlIlIIIlIlIIlI("GyYjMB07LHUZNBMMEAMicg4nMBw3", "RHUQq");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[10]] = lIIlIlIIIlIlIIlI("LhcACQAOHVY/JSk9OT8zMikyKTgiWTAaDQoc", "gyvhl");
        SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[14]] = lIIlIlIIIlIlIIll("Nyj7X2tgIaqD8PkVv1+RklafXmZsOotk", "DQuiv");
    }
    
    public SpdyFrameDecoder(final SpdyVersion llllllllllllIllIlIlIIllIIIIlllIl, final SpdyFrameDecoderDelegate llllllllllllIllIlIlIIllIIIIllIIl) {
        this(llllllllllllIllIlIlIIllIIIIlllIl, llllllllllllIllIlIlIIllIIIIllIIl, SpdyFrameDecoder.llIlIlIlIIlllI[0]);
    }
    
    static {
        lIIlIlIIIlIlllIl();
        lIIlIlIIIlIlIlII();
    }
    
    private static boolean lIIlIlIIIllIIlII(final int llllllllllllIllIlIlIIlIlIllIIllI, final int llllllllllllIllIlIlIIlIlIllIIlIl) {
        return llllllllllllIllIlIlIIlIlIllIIllI >= llllllllllllIllIlIlIIlIlIllIIlIl;
    }
    
    public SpdyFrameDecoder(final SpdyVersion llllllllllllIllIlIlIIllIIIIIllll, final SpdyFrameDecoderDelegate llllllllllllIllIlIlIIllIIIIlIIlI, final int llllllllllllIllIlIlIIllIIIIlIIIl) {
        if (lIIlIlIIIlIllllI(llllllllllllIllIlIlIIllIIIIIllll)) {
            throw new NullPointerException(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[1]]);
        }
        if (lIIlIlIIIlIllllI(llllllllllllIllIlIlIIllIIIIlIIlI)) {
            throw new NullPointerException(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[2]]);
        }
        if (lIIlIlIIIlIlllll(llllllllllllIllIlIlIIllIIIIlIIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[3]]).append(llllllllllllIllIlIlIIllIIIIlIIIl)));
        }
        this.spdyVersion = llllllllllllIllIlIlIIllIIIIIllll.getVersion();
        this.delegate = llllllllllllIllIlIlIIllIIIIlIIlI;
        this.maxChunkSize = llllllllllllIllIlIlIIllIIIIlIIIl;
        this.state = State.READ_COMMON_HEADER;
    }
    
    private static boolean lIIlIlIIIllIIIlI(final int llllllllllllIllIlIlIIlIlIlIlIllI, final int llllllllllllIllIlIlIIlIlIlIlIlIl) {
        return llllllllllllIllIlIlIIlIlIlIlIllI != llllllllllllIllIlIlIIlIlIlIlIlIl;
    }
    
    private static String lIIlIlIIIlIlIIII(final String llllllllllllIllIlIlIIlIlIlllIIlI, final String llllllllllllIllIlIlIIlIlIlllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIlIlIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIlIlIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIIlIlIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIIlIlIlllIlII.init(SpdyFrameDecoder.llIlIlIlIIlllI[3], llllllllllllIllIlIlIIlIlIlllIlIl);
            return new String(llllllllllllIllIlIlIIlIlIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIlIlIlllIIll) {
            llllllllllllIllIlIlIIlIlIlllIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIIIllIIlIl(final int llllllllllllIllIlIlIIlIlIllIlIlI, final int llllllllllllIllIlIlIIlIlIllIlIIl) {
        return llllllllllllIllIlIlIIlIlIllIlIlI == llllllllllllIllIlIlIIlIlIllIlIIl;
    }
    
    private static String lIIlIlIIIlIlIIlI(String llllllllllllIllIlIlIIlIllIIIIIlI, final String llllllllllllIllIlIlIIlIllIIIIIIl) {
        llllllllllllIllIlIlIIlIllIIIIIlI = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIIlIllIIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIlIllIIIIlIl = new StringBuilder();
        final char[] llllllllllllIllIlIlIIlIllIIIIlII = llllllllllllIllIlIlIIlIllIIIIIIl.toCharArray();
        int llllllllllllIllIlIlIIlIllIIIIIll = SpdyFrameDecoder.llIlIlIlIIlllI[1];
        final byte llllllllllllIllIlIlIIlIlIlllllIl = (Object)((String)llllllllllllIllIlIlIIlIllIIIIIlI).toCharArray();
        final float llllllllllllIllIlIlIIlIlIlllllII = llllllllllllIllIlIlIIlIlIlllllIl.length;
        char llllllllllllIllIlIlIIlIlIllllIll = (char)SpdyFrameDecoder.llIlIlIlIIlllI[1];
        while (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlIllllIll, (int)llllllllllllIllIlIlIIlIlIlllllII)) {
            final char llllllllllllIllIlIlIIlIllIIIlIII = llllllllllllIllIlIlIIlIlIlllllIl[llllllllllllIllIlIlIIlIlIllllIll];
            llllllllllllIllIlIlIIlIllIIIIlIl.append((char)(llllllllllllIllIlIlIIlIllIIIlIII ^ llllllllllllIllIlIlIIlIllIIIIlII[llllllllllllIllIlIlIIlIllIIIIIll % llllllllllllIllIlIlIIlIllIIIIlII.length]));
            "".length();
            ++llllllllllllIllIlIlIIlIllIIIIIll;
            ++llllllllllllIllIlIlIIlIlIllllIll;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIlIllIIIIlIl);
    }
    
    private static String lIIlIlIIIlIlIIll(final String llllllllllllIllIlIlIIlIllIIlIlll, final String llllllllllllIllIlIlIIlIllIIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIlIllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIlIllIIlIlII.getBytes(StandardCharsets.UTF_8)), SpdyFrameDecoder.llIlIlIlIIlllI[4]), "DES");
            final Cipher llllllllllllIllIlIlIIlIllIIllIIl = Cipher.getInstance("DES");
            llllllllllllIllIlIlIIlIllIIllIIl.init(SpdyFrameDecoder.llIlIlIlIIlllI[3], llllllllllllIllIlIlIIlIllIIllIlI);
            return new String(llllllllllllIllIlIlIIlIllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIlIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIlIllIIllIII) {
            llllllllllllIllIlIlIIlIllIIllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIIIllIIIll(final int llllllllllllIllIlIlIIlIlIlIllIll) {
        return llllllllllllIllIlIlIIlIlIlIllIll == 0;
    }
    
    public void decode(final ByteBuf llllllllllllIllIlIlIIlIlllIlIlIl) {
        do {
            switch (SpdyFrameDecoder$1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[this.state.ordinal()]) {
                case 1: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                        return;
                    }
                    final int llllllllllllIllIlIlIIlIllllIlllI = llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex();
                    final int llllllllllllIllIlIlIIlIllllIllIl = llllllllllllIllIlIlIIlIllllIlllI + SpdyFrameDecoder.llIlIlIlIIlllI[5];
                    final int llllllllllllIllIlIlIIlIllllIllII = llllllllllllIllIlIlIIlIllllIlllI + SpdyFrameDecoder.llIlIlIlIIlllI[6];
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[4]);
                    "".length();
                    int n;
                    if (lIIlIlIIIllIIIIl(llllllllllllIllIlIlIIlIlllIlIlIl.getByte(llllllllllllIllIlIlIIlIllllIlllI) & SpdyFrameDecoder.llIlIlIlIIlllI[7])) {
                        n = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                    }
                    else {
                        n = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                    }
                    final boolean llllllllllllIllIlIlIIlIllllIlIll = n != 0;
                    int llllllllllllIllIlIlIIlIllllIlIlI;
                    int llllllllllllIllIlIlIIlIllllIlIIl;
                    if (lIIlIlIIIllIIIIl(llllllllllllIllIlIlIIlIllllIlIll ? 1 : 0)) {
                        final int llllllllllllIllIlIlIIlIlllllIIII = SpdyCodecUtil.getUnsignedShort(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIllllIlllI) & SpdyFrameDecoder.llIlIlIlIIlllI[8];
                        final int llllllllllllIllIlIlIIlIllllIllll = SpdyCodecUtil.getUnsignedShort(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIllllIlllI + SpdyFrameDecoder.llIlIlIlIIlllI[3]);
                        this.streamId = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                        "".length();
                        if (((0x5D ^ 0x3B ^ (0x64 ^ 0x27)) & (0x32 ^ 0x5 ^ (0x38 ^ 0x2A) ^ -" ".length())) != ((0x2B ^ 0x6E ^ (0x7F ^ 0x71)) & (0x12 ^ 0x61 ^ (0xA6 ^ 0x9E) ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIlIlIIlIllllIlIlI = this.spdyVersion;
                        llllllllllllIllIlIlIIlIllllIlIIl = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                        this.streamId = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIllllIlllI);
                    }
                    this.flags = llllllllllllIllIlIlIIlIlllIlIlIl.getByte(llllllllllllIllIlIlIIlIllllIllIl);
                    this.length = SpdyCodecUtil.getUnsignedMedium(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIllllIllII);
                    if (lIIlIlIIIllIIIlI(llllllllllllIllIlIlIIlIllllIlIlI, this.spdyVersion)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[9]]);
                        "".length();
                        if ((0x5C ^ 0x58) == "   ".length()) {
                            return;
                        }
                        break;
                    }
                    else if (lIIlIlIIIllIIIll(isValidFrameHeader(this.streamId, llllllllllllIllIlIlIIlIllllIlIIl, this.flags, this.length) ? 1 : 0)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[5]]);
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = getNextState(llllllllllllIllIlIlIIlIllllIlIIl, this.length);
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    if (lIIlIlIIIllIIIll(this.length)) {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readDataFrame(this.streamId, hasFlag(this.flags, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[2]), Unpooled.buffer(SpdyFrameDecoder.llIlIlIlIIlllI[1]));
                        "".length();
                        if (-(117 + 142 - 147 + 57 ^ 6 + 15 + 31 + 121) >= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        final int llllllllllllIllIlIlIIlIllllIlIII = Math.min(this.maxChunkSize, this.length);
                        if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), llllllllllllIllIlIlIIlIllllIlIII)) {
                            return;
                        }
                        final ByteBuf llllllllllllIllIlIlIIlIllllIIlll = llllllllllllIllIlIlIIlIlllIlIlIl.alloc().buffer(llllllllllllIllIlIlIIlIllllIlIII);
                        llllllllllllIllIlIlIIlIllllIIlll.writeBytes(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIllllIlIII);
                        "".length();
                        this.length -= llllllllllllIllIlIlIIlIllllIlIII;
                        if (lIIlIlIIIllIIIll(this.length)) {
                            this.state = State.READ_COMMON_HEADER;
                        }
                        int n2;
                        if (lIIlIlIIIllIIIll(this.length) && lIIlIlIIIllIIIIl(hasFlag(this.flags, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[2]) ? 1 : 0)) {
                            n2 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                            "".length();
                            if ("   ".length() == 0) {
                                return;
                            }
                        }
                        else {
                            n2 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                        }
                        final boolean llllllllllllIllIlIlIIlIlllIlIlII = n2 != 0;
                        this.delegate.readDataFrame(this.streamId, llllllllllllIllIlIlIIlIlllIlIlII, llllllllllllIllIlIlIIlIllllIIlll);
                        "".length();
                        if (((0x70 ^ 0x35) & ~(0xC ^ 0x49)) > ((0x6F ^ 0x57) & ~(0xB ^ 0x33))) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[10])) {
                        return;
                    }
                    final int llllllllllllIllIlIlIIlIllllIIllI = llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex();
                    this.streamId = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIllllIIllI);
                    final int llllllllllllIllIlIlIIlIllllIIlIl = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIllllIIllI + SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    final byte llllllllllllIllIlIlIIlIllllIIlII = (byte)(llllllllllllIllIlIlIIlIlllIlIlIl.getByte(llllllllllllIllIlIlIIlIllllIIllI + SpdyFrameDecoder.llIlIlIlIIlllI[4]) >> SpdyFrameDecoder.llIlIlIlIIlllI[6] & SpdyFrameDecoder.llIlIlIlIIlllI[11]);
                    final boolean llllllllllllIllIlIlIIlIlllIlIlII = hasFlag(this.flags, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[2]);
                    final boolean llllllllllllIllIlIlIIlIllllIIIll = hasFlag(this.flags, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[3]);
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[10]);
                    "".length();
                    this.length -= SpdyFrameDecoder.llIlIlIlIIlllI[10];
                    if (lIIlIlIIIllIIIll(this.streamId)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[6]]);
                        "".length();
                        if (-(0x2B ^ 0x2E ^ " ".length()) >= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_HEADER_BLOCK;
                        this.delegate.readSynStreamFrame(this.streamId, llllllllllllIllIlIlIIlIllllIIlIl, llllllllllllIllIlIlIIlIllllIIlII, llllllllllllIllIlIlIIlIlllIlIlII, llllllllllllIllIlIlIIlIllllIIIll);
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 4: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                        return;
                    }
                    this.streamId = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                    final boolean llllllllllllIllIlIlIIlIlllIlIlII = hasFlag(this.flags, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[2]);
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    "".length();
                    this.length -= SpdyFrameDecoder.llIlIlIlIIlllI[5];
                    if (lIIlIlIIIllIIIll(this.streamId)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[12]]);
                        "".length();
                        if ("   ".length() == "  ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_HEADER_BLOCK;
                        this.delegate.readSynReplyFrame(this.streamId, llllllllllllIllIlIlIIlIlllIlIlII);
                        "".length();
                        if (" ".length() <= -" ".length()) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 5: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                        return;
                    }
                    this.streamId = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                    final int llllllllllllIllIlIlIIlIlllIlIIll = SpdyCodecUtil.getSignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex() + SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[4]);
                    "".length();
                    if (!lIIlIlIIIllIIIIl(this.streamId) || lIIlIlIIIllIIIll(llllllllllllIllIlIlIIlIlllIlIIll)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[11]]);
                        "".length();
                        if ("   ".length() < "  ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readRstStreamFrame(this.streamId, llllllllllllIllIlIlIIlIlllIlIIll);
                        "".length();
                        if ((0xB4 ^ 0xB0) <= -" ".length()) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 6: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                        return;
                    }
                    final boolean llllllllllllIllIlIlIIlIllllIIIlI = hasFlag(this.flags, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[2]);
                    this.numSettings = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    "".length();
                    this.length -= SpdyFrameDecoder.llIlIlIlIIlllI[5];
                    if (!lIIlIlIIIllIIIll(this.length & SpdyFrameDecoder.llIlIlIlIIlllI[11]) || lIIlIlIIIllIIIlI(this.length >> SpdyFrameDecoder.llIlIlIlIIlllI[9], this.numSettings)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[4]]);
                        "".length();
                        if (-" ".length() >= (0x42 ^ 0x46)) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_SETTING;
                        this.delegate.readSettingsFrame(llllllllllllIllIlIlIIlIllllIIIlI);
                        "".length();
                        if ("   ".length() <= -" ".length()) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 7: {
                    if (lIIlIlIIIllIIIll(this.numSettings)) {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readSettingsEnd();
                        "".length();
                        if ((0x7E ^ 0x7A) == 0x0) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                            return;
                        }
                        final byte llllllllllllIllIlIlIIlIllllIIIIl = llllllllllllIllIlIlIIlIlllIlIlIl.getByte(llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                        final int llllllllllllIllIlIlIIlIllllIIIII = SpdyCodecUtil.getUnsignedMedium(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex() + SpdyFrameDecoder.llIlIlIlIIlllI[2]);
                        final int llllllllllllIllIlIlIIlIlllIlllll = SpdyCodecUtil.getSignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex() + SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                        final boolean llllllllllllIllIlIlIIlIlllIllllI = hasFlag(llllllllllllIllIlIlIIlIllllIIIIl, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[2]);
                        final boolean llllllllllllIllIlIlIIlIlllIlllIl = hasFlag(llllllllllllIllIlIlIIlIllllIIIIl, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[3]);
                        llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[4]);
                        "".length();
                        this.numSettings -= SpdyFrameDecoder.llIlIlIlIIlllI[2];
                        this.delegate.readSetting(llllllllllllIllIlIlIIlIllllIIIII, llllllllllllIllIlIlIIlIlllIlllll, llllllllllllIllIlIlIIlIlllIllllI, llllllllllllIllIlIlIIlIlllIlllIl);
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 8: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                        return;
                    }
                    final int llllllllllllIllIlIlIIlIlllIlllII = SpdyCodecUtil.getSignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    "".length();
                    this.state = State.READ_COMMON_HEADER;
                    this.delegate.readPingFrame(llllllllllllIllIlIlIIlIlllIlllII);
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    break;
                }
                case 9: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                        return;
                    }
                    final int llllllllllllIllIlIlIIlIlllIllIll = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                    final int llllllllllllIllIlIlIIlIlllIlIIll = SpdyCodecUtil.getSignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex() + SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[4]);
                    "".length();
                    this.state = State.READ_COMMON_HEADER;
                    this.delegate.readGoAwayFrame(llllllllllllIllIlIlIIlIlllIllIll, llllllllllllIllIlIlIIlIlllIlIIll);
                    "".length();
                    if (((146 + 60 - 105 + 75 ^ 26 + 74 - 47 + 87) & (0xE4 ^ 0xC7 ^ (0x4 ^ 0x1B) ^ -" ".length())) < 0) {
                        return;
                    }
                    break;
                }
                case 10: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                        return;
                    }
                    this.streamId = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                    final boolean llllllllllllIllIlIlIIlIlllIlIlII = hasFlag(this.flags, (byte)SpdyFrameDecoder.llIlIlIlIIlllI[2]);
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    "".length();
                    this.length -= SpdyFrameDecoder.llIlIlIlIIlllI[5];
                    if (lIIlIlIIIllIIIll(this.streamId)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[13]]);
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_HEADER_BLOCK;
                        this.delegate.readHeadersFrame(this.streamId, llllllllllllIllIlIlIIlIlllIlIlII);
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 11: {
                    if (lIIlIlIIIllIIIII(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                        return;
                    }
                    this.streamId = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex());
                    final int llllllllllllIllIlIlIIlIlllIllIlI = SpdyCodecUtil.getUnsignedInt(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIlIlIl.readerIndex() + SpdyFrameDecoder.llIlIlIlIIlllI[5]);
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(SpdyFrameDecoder.llIlIlIlIIlllI[4]);
                    "".length();
                    if (lIIlIlIIIllIIIll(llllllllllllIllIlIlIIlIlllIllIlI)) {
                        this.state = State.FRAME_ERROR;
                        this.delegate.readFrameError(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[10]]);
                        "".length();
                        if (" ".length() <= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readWindowUpdateFrame(this.streamId, llllllllllllIllIlIlIIlIlllIllIlI);
                        "".length();
                        if ("   ".length() < "   ".length()) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 12: {
                    if (lIIlIlIIIllIIIll(this.length)) {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readHeaderBlockEnd();
                        "".length();
                        if (" ".length() <= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (lIIlIlIIIllIIIll(llllllllllllIllIlIlIIlIlllIlIlIl.isReadable() ? 1 : 0)) {
                            return;
                        }
                        final int llllllllllllIllIlIlIIlIlllIllIIl = Math.min(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), this.length);
                        final ByteBuf llllllllllllIllIlIlIIlIlllIllIII = llllllllllllIllIlIlIIlIlllIlIlIl.alloc().buffer(llllllllllllIllIlIlIIlIlllIllIIl);
                        llllllllllllIllIlIlIIlIlllIllIII.writeBytes(llllllllllllIllIlIlIIlIlllIlIlIl, llllllllllllIllIlIlIIlIlllIllIIl);
                        "".length();
                        this.length -= llllllllllllIllIlIlIIlIlllIllIIl;
                        this.delegate.readHeaderBlock(llllllllllllIllIlIlIIlIlllIllIII);
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 13: {
                    final int llllllllllllIllIlIlIIlIlllIlIlll = Math.min(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes(), this.length);
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(llllllllllllIllIlIlIIlIlllIlIlll);
                    "".length();
                    this.length -= llllllllllllIllIlIlIIlIlllIlIlll;
                    if (!lIIlIlIIIllIIIll(this.length)) {
                        return;
                    }
                    this.state = State.READ_COMMON_HEADER;
                    "".length();
                    if (((122 + 16 - 20 + 44 ^ 25 + 100 - 83 + 105) & (0x20 ^ 0x19 ^ (0x8E ^ 0x86) ^ -" ".length())) > "  ".length()) {
                        return;
                    }
                    break;
                }
                case 14: {
                    llllllllllllIllIlIlIIlIlllIlIlIl.skipBytes(llllllllllllIllIlIlIIlIlllIlIlIl.readableBytes());
                    "".length();
                    return;
                }
                default: {
                    throw new Error(SpdyFrameDecoder.llIlIlIlIIllII[SpdyFrameDecoder.llIlIlIlIIlllI[14]]);
                }
            }
            "".length();
        } while (null == null);
    }
    
    private static boolean lIIlIlIIIlIlllll(final int llllllllllllIllIlIlIIlIlIlIllIIl) {
        return llllllllllllIllIlIlIIlIlIlIllIIl <= 0;
    }
    
    private static boolean lIIlIlIIIllIIIIl(final int llllllllllllIllIlIlIIlIlIlIlllIl) {
        return llllllllllllIllIlIlIIlIlIlIlllIl != 0;
    }
    
    private static void lIIlIlIIIlIlllIl() {
        (llIlIlIlIIlllI = new int[16])[0] = (-(0xFFFFFF1E & 0x5FB) & (0xFFFFFF39 & 0x25DF));
        SpdyFrameDecoder.llIlIlIlIIlllI[1] = ((129 + 98 - 89 + 45 ^ 44 + 16 - 55 + 126) & (0x61 ^ 0x12 ^ (0xC ^ 0x4B) ^ -" ".length()));
        SpdyFrameDecoder.llIlIlIlIIlllI[2] = " ".length();
        SpdyFrameDecoder.llIlIlIlIIlllI[3] = "  ".length();
        SpdyFrameDecoder.llIlIlIlIIlllI[4] = (0x90 ^ 0x98);
        SpdyFrameDecoder.llIlIlIlIIlllI[5] = (110 + 25 - 113 + 106 ^ 3 + 122 - 90 + 97);
        SpdyFrameDecoder.llIlIlIlIIlllI[6] = (0xA6 ^ 0x9C ^ (0x18 ^ 0x27));
        SpdyFrameDecoder.llIlIlIlIIlllI[7] = (0x71 ^ 0x69) + (0x65 ^ 0x35) - (0x12 ^ 0x37) + (0x8F ^ 0xB2);
        SpdyFrameDecoder.llIlIlIlIIlllI[8] = (-1 & 0x7FFF);
        SpdyFrameDecoder.llIlIlIlIIlllI[9] = "   ".length();
        SpdyFrameDecoder.llIlIlIlIIlllI[10] = (133 + 37 - 83 + 50 ^ 21 + 94 - 107 + 123);
        SpdyFrameDecoder.llIlIlIlIIlllI[11] = (54 + 81 - 86 + 112 ^ 141 + 156 - 268 + 137);
        SpdyFrameDecoder.llIlIlIlIIlllI[12] = (0xC7 ^ 0x87 ^ (0xE2 ^ 0xA4));
        SpdyFrameDecoder.llIlIlIlIIlllI[13] = (0x62 ^ 0x75 ^ (0x26 ^ 0x38));
        SpdyFrameDecoder.llIlIlIlIIlllI[14] = (0x6C ^ 0x67);
        SpdyFrameDecoder.llIlIlIlIIlllI[15] = (0x7F ^ 0x41 ^ (0x3B ^ 0x9));
    }
    
    private static boolean lIIlIlIIIlIllllI(final Object llllllllllllIllIlIlIIlIlIlIlllll) {
        return llllllllllllIllIlIlIIlIlIlIlllll == null;
    }
    
    private static boolean hasFlag(final byte llllllllllllIllIlIlIIlIllIllIIlI, final byte llllllllllllIllIlIlIIlIllIllIIll) {
        int n;
        if (lIIlIlIIIllIIIIl(llllllllllllIllIlIlIIlIllIllIIlI & llllllllllllIllIlIlIIlIllIllIIll)) {
            n = SpdyFrameDecoder.llIlIlIlIIlllI[2];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x92 ^ 0x98) & ~(0x7C ^ 0x76)) != 0x0;
            }
        }
        else {
            n = SpdyFrameDecoder.llIlIlIlIIlllI[1];
        }
        return n != 0;
    }
    
    private static boolean lIIlIlIIIllIIIII(final int llllllllllllIllIlIlIIlIlIllIIIlI, final int llllllllllllIllIlIlIIlIlIllIIIIl) {
        return llllllllllllIllIlIlIIlIlIllIIIlI < llllllllllllIllIlIlIIlIlIllIIIIl;
    }
    
    private static boolean isValidFrameHeader(final int llllllllllllIllIlIlIIlIllIlIIllI, final int llllllllllllIllIlIlIIlIllIlIIIIl, final byte llllllllllllIllIlIlIIlIllIlIIlII, final int llllllllllllIllIlIlIIlIllIlIIIll) {
        switch (llllllllllllIllIlIlIIlIllIlIIIIl) {
            case 0: {
                int n;
                if (lIIlIlIIIllIIIIl(llllllllllllIllIlIlIIlIllIlIIllI)) {
                    n = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0x25 ^ 0x10) & ~(0x51 ^ 0x64)) != 0x0;
                    }
                }
                else {
                    n = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n != 0;
            }
            case 1: {
                int n2;
                if (lIIlIlIIIllIIlII(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[10])) {
                    n2 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if (((0x4F ^ 0x5 ^ (0x46 ^ 0x34)) & (0x23 ^ 0x73 ^ (0x37 ^ 0x5F) ^ -" ".length())) != 0x0) {
                        return ((0xA1 ^ 0x8F ^ (0xBE ^ 0xB4)) & (0xE4 ^ 0xB5 ^ (0x24 ^ 0x51) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n2 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n2 != 0;
            }
            case 2: {
                int n3;
                if (lIIlIlIIIllIIlII(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                    n3 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if (-(0x10 ^ 0x4D ^ (0x6F ^ 0x36)) >= 0) {
                        return ((0xF9 ^ 0xAA ^ (0xAA ^ 0xAD)) & (0xED ^ 0x8F ^ (0x14 ^ 0x22) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n3 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n3 != 0;
            }
            case 3: {
                int n4;
                if (lIIlIlIIIllIIIll(llllllllllllIllIlIlIIlIllIlIIlII) && lIIlIlIIIllIIlIl(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                    n4 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if ((0x18 ^ 0x1D) <= 0) {
                        return ((0xD5 ^ 0x93) & ~(0x79 ^ 0x3F)) != 0x0;
                    }
                }
                else {
                    n4 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n4 != 0;
            }
            case 4: {
                int n5;
                if (lIIlIlIIIllIIlII(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                    n5 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if (" ".length() != " ".length()) {
                        return ((0x0 ^ 0x35) & ~(0x1E ^ 0x2B)) != 0x0;
                    }
                }
                else {
                    n5 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n5 != 0;
            }
            case 6: {
                int n6;
                if (lIIlIlIIIllIIlIl(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                    n6 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if (((0xF3 ^ 0xBB ^ (0x2A ^ 0x4E)) & (0xC7 ^ 0xAF ^ (0x74 ^ 0x30) ^ -" ".length())) != 0x0) {
                        return ((7 + 92 + 9 + 41 ^ 96 + 121 - 103 + 22) & (55 + 90 - 59 + 83 ^ 154 + 111 - 212 + 127 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n6 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n6 != 0;
            }
            case 7: {
                int n7;
                if (lIIlIlIIIllIIlIl(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                    n7 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x5F ^ 0x9 ^ (0x70 ^ 0x8)) & (0x65 ^ 0x6B ^ (0xE3 ^ 0xC3) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n7 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n7 != 0;
            }
            case 8: {
                int n8;
                if (lIIlIlIIIllIIlII(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[5])) {
                    n8 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if ("   ".length() >= (0x60 ^ 0x56 ^ (0x30 ^ 0x2))) {
                        return ((0x66 ^ 0x27 ^ (0x74 ^ 0x14)) & (0xD2 ^ 0xAB ^ (0x31 ^ 0x69) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n8 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n8 != 0;
            }
            case 9: {
                int n9;
                if (lIIlIlIIIllIIlIl(llllllllllllIllIlIlIIlIllIlIIIll, SpdyFrameDecoder.llIlIlIlIIlllI[4])) {
                    n9 = SpdyFrameDecoder.llIlIlIlIIlllI[2];
                    "".length();
                    if (null != null) {
                        return ((0xD1 ^ 0x90) & ~(0x58 ^ 0x19)) != 0x0;
                    }
                }
                else {
                    n9 = SpdyFrameDecoder.llIlIlIlIIlllI[1];
                }
                return n9 != 0;
            }
            default: {
                return SpdyFrameDecoder.llIlIlIlIIlllI[2] != 0;
            }
        }
    }
    
    private static State getNextState(final int llllllllllllIllIlIlIIlIllIlIllII, final int llllllllllllIllIlIlIIlIllIlIllIl) {
        switch (llllllllllllIllIlIlIIlIllIlIllII) {
            case 0: {
                return State.READ_DATA_FRAME;
            }
            case 1: {
                return State.READ_SYN_STREAM_FRAME;
            }
            case 2: {
                return State.READ_SYN_REPLY_FRAME;
            }
            case 3: {
                return State.READ_RST_STREAM_FRAME;
            }
            case 4: {
                return State.READ_SETTINGS_FRAME;
            }
            case 6: {
                return State.READ_PING_FRAME;
            }
            case 7: {
                return State.READ_GOAWAY_FRAME;
            }
            case 8: {
                return State.READ_HEADERS_FRAME;
            }
            case 9: {
                return State.READ_WINDOW_UPDATE_FRAME;
            }
            default: {
                if (lIIlIlIIIllIIIIl(llllllllllllIllIlIlIIlIllIlIllIl)) {
                    return State.DISCARD_FRAME;
                }
                return State.READ_COMMON_HEADER;
            }
        }
    }
    
    private enum State
    {
        READ_DATA_FRAME, 
        FRAME_ERROR, 
        READ_SYN_STREAM_FRAME, 
        DISCARD_FRAME, 
        READ_SYN_REPLY_FRAME, 
        READ_WINDOW_UPDATE_FRAME, 
        READ_SETTINGS_FRAME, 
        READ_SETTING, 
        READ_RST_STREAM_FRAME, 
        READ_GOAWAY_FRAME, 
        READ_PING_FRAME, 
        READ_COMMON_HEADER, 
        READ_HEADER_BLOCK;
        
        private static final /* synthetic */ String[] llllllllIIlIl;
        private static final /* synthetic */ int[] llllllllIlIIl;
        
        READ_HEADERS_FRAME;
        
        private static String lIllIIIllIIllIl(String lllllllllllllIlIlIIllIlIIIIIIlll, final String lllllllllllllIlIlIIllIlIIIIIIllI) {
            lllllllllllllIlIlIIllIlIIIIIIlll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIllIlIIIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIIllIlIIIIIlIlI = new StringBuilder();
            final char[] lllllllllllllIlIlIIllIlIIIIIlIIl = lllllllllllllIlIlIIllIlIIIIIIllI.toCharArray();
            int lllllllllllllIlIlIIllIlIIIIIlIII = State.llllllllIlIIl[0];
            final short lllllllllllllIlIlIIllIlIIIIIIIlI = (Object)((String)lllllllllllllIlIlIIllIlIIIIIIlll).toCharArray();
            final char lllllllllllllIlIlIIllIlIIIIIIIIl = (char)lllllllllllllIlIlIIllIlIIIIIIIlI.length;
            double lllllllllllllIlIlIIllIlIIIIIIIII = State.llllllllIlIIl[0];
            while (lIllIIIllIllIII((int)lllllllllllllIlIlIIllIlIIIIIIIII, lllllllllllllIlIlIIllIlIIIIIIIIl)) {
                final char lllllllllllllIlIlIIllIlIIIIIllIl = lllllllllllllIlIlIIllIlIIIIIIIlI[lllllllllllllIlIlIIllIlIIIIIIIII];
                lllllllllllllIlIlIIllIlIIIIIlIlI.append((char)(lllllllllllllIlIlIIllIlIIIIIllIl ^ lllllllllllllIlIlIIllIlIIIIIlIIl[lllllllllllllIlIlIIllIlIIIIIlIII % lllllllllllllIlIlIIllIlIIIIIlIIl.length]));
                "".length();
                ++lllllllllllllIlIlIIllIlIIIIIlIII;
                ++lllllllllllllIlIlIIllIlIIIIIIIII;
                "".length();
                if (" ".length() > "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIIllIlIIIIIlIlI);
        }
        
        private static void lIllIIIllIlIlIl() {
            (llllllllIIlIl = new String[State.llllllllIlIIl[14]])[State.llllllllIlIIl[0]] = lIllIIIllIIllIl("MQoHHAUgAAsVFS0QDh0bJwoU", "cOFXZ");
            State.llllllllIIlIl[State.llllllllIlIIl[1]] = lIllIIIllIIlllI("sW79ju+oplmFRhVGdmfxDg==", "MILtu");
            State.llllllllIIlIl[State.llllllllIlIIl[2]] = lIllIIIllIlIIII("vOL2koGxHfIE9XP+O3SDoe7aJLf0T9zq", "vPTDP");
            State.llllllllIIlIl[State.llllllllIlIIl[3]] = lIllIIIllIlIIII("GqI8EU9T7QaM0Ec93lL3ROWF687fPtZb", "tSfKJ");
            State.llllllllIIlIl[State.llllllllIlIIl[4]] = lIllIIIllIIlllI("vCnD7REtgZaeWvhl1lYEnlm2/7S9dDsO", "YJRHo");
            State.llllllllIIlIl[State.llllllllIlIIl[5]] = lIllIIIllIlIIII("LGO8kVvkKKw16EtL3Frt6qaNKPgrlmNb", "RSNlb");
            State.llllllllIIlIl[State.llllllllIlIIl[6]] = lIllIIIllIIlllI("jRhOsuhjDhNhYyek9kCS0A==", "eHxHc");
            State.llllllllIIlIl[State.llllllllIlIIl[7]] = lIllIIIllIlIIII("tgsmjv+Dlggk4JFmpMBa/Q==", "cgxLy");
            State.llllllllIIlIl[State.llllllllIlIIl[8]] = lIllIIIllIIlllI("A8vfyDBn5GzFoyuLqPQPFXdKua7xUF4t", "RQDol");
            State.llllllllIIlIl[State.llllllllIlIIl[9]] = lIllIIIllIIllIl("KhA0LicwEDQuPSoGKiwqORgw", "xUujx");
            State.llllllllIIlIl[State.llllllllIlIIl[10]] = lIllIIIllIIllIl("NyszJhcyJzwmBzIxJzIMJDo3PQ43Lz8n", "enrbH");
            State.llllllllIIlIl[State.llllllllIlIIl[11]] = lIllIIIllIlIIII("8z1ME7emyiQJJFSrMqZTrE4AuZa0lA1l", "aNCQh");
            State.llllllllIIlIl[State.llllllllIlIIl[12]] = lIllIIIllIIllIl("BTkRJhUTNB0jBgA9Bw==", "ApBeT");
            State.llllllllIIlIl[State.llllllllIlIIl[13]] = lIllIIIllIIllIl("LSQrCRE0MzgWGzk=", "kvjDT");
        }
        
        private static String lIllIIIllIIlllI(final String lllllllllllllIlIlIIllIIlllllIlIl, final String lllllllllllllIlIlIIllIIlllllIlII) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIllIIllllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIIlllllIlII.getBytes(StandardCharsets.UTF_8)), State.llllllllIlIIl[8]), "DES");
                final Cipher lllllllllllllIlIlIIllIIllllllIIl = Cipher.getInstance("DES");
                lllllllllllllIlIlIIllIIllllllIIl.init(State.llllllllIlIIl[2], lllllllllllllIlIlIIllIIllllllIlI);
                return new String(lllllllllllllIlIlIIllIIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIllIIllllllIII) {
                lllllllllllllIlIlIIllIIllllllIII.printStackTrace();
                return null;
            }
        }
        
        static {
            lIllIIIllIlIllI();
            lIllIIIllIlIlIl();
            final State[] $values = new State[State.llllllllIlIIl[14]];
            $values[State.llllllllIlIIl[0]] = State.READ_COMMON_HEADER;
            $values[State.llllllllIlIIl[1]] = State.READ_DATA_FRAME;
            $values[State.llllllllIlIIl[2]] = State.READ_SYN_STREAM_FRAME;
            $values[State.llllllllIlIIl[3]] = State.READ_SYN_REPLY_FRAME;
            $values[State.llllllllIlIIl[4]] = State.READ_RST_STREAM_FRAME;
            $values[State.llllllllIlIIl[5]] = State.READ_SETTINGS_FRAME;
            $values[State.llllllllIlIIl[6]] = State.READ_SETTING;
            $values[State.llllllllIlIIl[7]] = State.READ_PING_FRAME;
            $values[State.llllllllIlIIl[8]] = State.READ_GOAWAY_FRAME;
            $values[State.llllllllIlIIl[9]] = State.READ_HEADERS_FRAME;
            $values[State.llllllllIlIIl[10]] = State.READ_WINDOW_UPDATE_FRAME;
            $values[State.llllllllIlIIl[11]] = State.READ_HEADER_BLOCK;
            $values[State.llllllllIlIIl[12]] = State.DISCARD_FRAME;
            $values[State.llllllllIlIIl[13]] = State.FRAME_ERROR;
            $VALUES = $values;
        }
        
        private static String lIllIIIllIlIIII(final String lllllllllllllIlIlIIllIlIIIIllIlI, final String lllllllllllllIlIlIIllIlIIIIllIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIllIlIIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIlIIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIIllIlIIIIllllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIIllIlIIIIllllI.init(State.llllllllIlIIl[2], lllllllllllllIlIlIIllIlIIIIlllll);
                return new String(lllllllllllllIlIlIIllIlIIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIlIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIllIlIIIIlllIl) {
                lllllllllllllIlIlIIllIlIIIIlllIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIllIIIllIlIllI() {
            (llllllllIlIIl = new int[15])[0] = ((31 + 193 - 218 + 205 ^ 183 + 147 - 185 + 52) & (0xFF ^ 0xBA ^ (0xE9 ^ 0xBA) ^ -" ".length()));
            State.llllllllIlIIl[1] = " ".length();
            State.llllllllIlIIl[2] = "  ".length();
            State.llllllllIlIIl[3] = "   ".length();
            State.llllllllIlIIl[4] = (0xB6 ^ 0x9C ^ (0xBD ^ 0x93));
            State.llllllllIlIIl[5] = (0x9F ^ 0x9A);
            State.llllllllIlIIl[6] = (0x49 ^ 0x1F ^ (0xC7 ^ 0x97));
            State.llllllllIlIIl[7] = (0x66 ^ 0x61);
            State.llllllllIlIIl[8] = (0xB9 ^ 0xB1);
            State.llllllllIlIIl[9] = (0x34 ^ 0x1 ^ (0x95 ^ 0xA9));
            State.llllllllIlIIl[10] = (0xA5 ^ 0xAF);
            State.llllllllIlIIl[11] = (0xC8 ^ 0xC3);
            State.llllllllIlIIl[12] = (0x50 ^ 0x5C);
            State.llllllllIlIIl[13] = (0x6C ^ 0x26 ^ (0x6D ^ 0x2A));
            State.llllllllIlIIl[14] = (0xC3 ^ 0x8E ^ (0x44 ^ 0x7));
        }
        
        private static boolean lIllIIIllIllIII(final int lllllllllllllIlIlIIllIIllllIllll, final int lllllllllllllIlIlIIllIIllllIlllI) {
            return lllllllllllllIlIlIIllIIllllIllll < lllllllllllllIlIlIIllIIllllIlllI;
        }
    }
}
