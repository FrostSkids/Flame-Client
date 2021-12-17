// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.util.ReferenceCounted;
import io.netty.buffer.Unpooled;
import io.netty.util.IllegalReferenceCountException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.internal.StringUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.buffer.ByteBuf;

public class DefaultSpdyDataFrame extends DefaultSpdyStreamFrame implements SpdyDataFrame
{
    private final /* synthetic */ ByteBuf data;
    private static final /* synthetic */ int[] llIllIIlIIlIll;
    private static final /* synthetic */ String[] llIllIIIIllIlI;
    
    @Override
    public boolean release(final int llllllllllllIllIIlllllIlIIIIllII) {
        return this.data.release(llllllllllllIllIIlllllIlIIIIllII);
    }
    
    private static void lIIlIllIIlIllIlI() {
        (llIllIIIIllIlI = new String[DefaultSpdyDataFrame.llIllIIlIIlIll[8]])[DefaultSpdyDataFrame.llIllIIlIIlIll[0]] = lIIlIllIIlIlIlll("fq4v390klkg=", "vcfCg");
        DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[2]] = lIIlIllIIlIllIII("DyQWB3QbJBsKOwohQgU1BSsNEnQOPQEDMQ9lU1BjXHJQV2FLJxsSMRg=", "kEbfT");
        DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[3]] = lIIlIllIIlIllIIl("qATtNhUhhSA=", "tQxWA");
        DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[5]] = lIIlIllIIlIllIII("ZGt1ciU9NC4zG2QPD3JLaQ==", "IFKRv");
        DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[6]] = lIIlIllIIlIllIIl("vOI6okCCFK0SmuZlsCRcRw==", "ylTyw");
        DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[7]] = lIIlIllIIlIllIIl("J17lqX54qcE=", "TBtkM");
    }
    
    private static String lIIlIllIIlIllIII(String llllllllllllIllIIlllllIIlIlllIII, final String llllllllllllIllIIlllllIIlIllllII) {
        llllllllllllIllIIlllllIIlIlllIII = new String(Base64.getDecoder().decode(llllllllllllIllIIlllllIIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlllllIIlIlllIll = new StringBuilder();
        final char[] llllllllllllIllIIlllllIIlIlllIlI = llllllllllllIllIIlllllIIlIllllII.toCharArray();
        int llllllllllllIllIIlllllIIlIlllIIl = DefaultSpdyDataFrame.llIllIIlIIlIll[0];
        final boolean llllllllllllIllIIlllllIIlIllIIll = (Object)llllllllllllIllIIlllllIIlIlllIII.toCharArray();
        final int llllllllllllIllIIlllllIIlIllIIlI = llllllllllllIllIIlllllIIlIllIIll.length;
        float llllllllllllIllIIlllllIIlIllIIIl = DefaultSpdyDataFrame.llIllIIlIIlIll[0];
        while (lIIlIllIllIlIlII((int)llllllllllllIllIIlllllIIlIllIIIl, llllllllllllIllIIlllllIIlIllIIlI)) {
            final char llllllllllllIllIIlllllIIlIlllllI = llllllllllllIllIIlllllIIlIllIIll[llllllllllllIllIIlllllIIlIllIIIl];
            llllllllllllIllIIlllllIIlIlllIll.append((char)(llllllllllllIllIIlllllIIlIlllllI ^ llllllllllllIllIIlllllIIlIlllIlI[llllllllllllIllIIlllllIIlIlllIIl % llllllllllllIllIIlllllIIlIlllIlI.length]));
            "".length();
            ++llllllllllllIllIIlllllIIlIlllIIl;
            ++llllllllllllIllIIlllllIIlIllIIIl;
            "".length();
            if ((0x21 ^ 0x37 ^ (0xF ^ 0x1D)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlllllIIlIlllIll);
    }
    
    private static boolean lIIlIllIllIlIIll(final int llllllllllllIllIIlllllIIlIlIIlII) {
        return llllllllllllIllIIlllllIIlIlIIlII == 0;
    }
    
    @Override
    public SpdyDataFrame duplicate() {
        final SpdyDataFrame llllllllllllIllIIlllllIlIIlIIIll = new DefaultSpdyDataFrame(this.streamId(), this.content().duplicate());
        llllllllllllIllIIlllllIlIIlIIIll.setLast(this.isLast());
        "".length();
        return llllllllllllIllIIlllllIlIIlIIIll;
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIllIIlllllIlIIIIlIII = new StringBuilder();
        llllllllllllIllIIlllllIlIIIIlIII.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append(DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[3]]);
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append(this.isLast());
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append((char)DefaultSpdyDataFrame.llIllIIlIIlIll[4]);
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append(DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[5]]);
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append(this.streamId());
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIllIIlllllIlIIIIlIII.append(DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[6]]);
        "".length();
        if (lIIlIllIllIlIIll(this.refCnt())) {
            llllllllllllIllIIlllllIlIIIIlIII.append(DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[7]]);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else {
            llllllllllllIllIIlllllIlIIIIlIII.append(this.content().readableBytes());
            "".length();
        }
        return String.valueOf(llllllllllllIllIIlllllIlIIIIlIII);
    }
    
    @Override
    public boolean release() {
        return this.data.release();
    }
    
    @Override
    public SpdyDataFrame setStreamId(final int llllllllllllIllIIlllllIlIIllIllI) {
        super.setStreamId(llllllllllllIllIIlllllIlIIllIllI);
        "".length();
        return this;
    }
    
    static {
        lIIlIllIllIIllll();
        lIIlIllIIlIllIlI();
    }
    
    private static String lIIlIllIIlIllIIl(final String llllllllllllIllIIlllllIIllIIllIl, final String llllllllllllIllIIlllllIIllIIllII) {
        try {
            final SecretKeySpec llllllllllllIllIIlllllIIllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllllIIllIIllII.getBytes(StandardCharsets.UTF_8)), DefaultSpdyDataFrame.llIllIIlIIlIll[9]), "DES");
            final Cipher llllllllllllIllIIlllllIIllIIllll = Cipher.getInstance("DES");
            llllllllllllIllIIlllllIIllIIllll.init(DefaultSpdyDataFrame.llIllIIlIIlIll[3], llllllllllllIllIIlllllIIllIlIIII);
            return new String(llllllllllllIllIIlllllIIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllllIIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllllIIllIIlllI) {
            llllllllllllIllIIlllllIIllIIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public SpdyDataFrame retain() {
        this.data.retain();
        "".length();
        return this;
    }
    
    @Override
    public SpdyDataFrame copy() {
        final SpdyDataFrame llllllllllllIllIIlllllIlIIlIlIIl = new DefaultSpdyDataFrame(this.streamId(), this.content().copy());
        llllllllllllIllIIlllllIlIIlIlIIl.setLast(this.isLast());
        "".length();
        return llllllllllllIllIIlllllIlIIlIlIIl;
    }
    
    public DefaultSpdyDataFrame(final int llllllllllllIllIIlllllIlIlIIIIll, final ByteBuf llllllllllllIllIIlllllIlIlIIIIlI) {
        super(llllllllllllIllIIlllllIlIlIIIIll);
        if (lIIlIllIllIlIIII(llllllllllllIllIIlllllIlIlIIIIlI)) {
            throw new NullPointerException(DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[0]]);
        }
        this.data = validate(llllllllllllIllIIlllllIlIlIIIIlI);
    }
    
    @Override
    public ByteBuf content() {
        if (lIIlIllIllIlIIlI(this.data.refCnt())) {
            throw new IllegalReferenceCountException(this.data.refCnt());
        }
        return this.data;
    }
    
    @Override
    public int refCnt() {
        return this.data.refCnt();
    }
    
    private static boolean lIIlIllIllIlIIII(final Object llllllllllllIllIIlllllIIlIlIIllI) {
        return llllllllllllIllIIlllllIIlIlIIllI == null;
    }
    
    private static String lIIlIllIIlIlIlll(final String llllllllllllIllIIlllllIIllIllIlI, final String llllllllllllIllIIlllllIIllIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIlllllIIllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllllIIllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllllIIllIlllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllllIIllIlllII.init(DefaultSpdyDataFrame.llIllIIlIIlIll[3], llllllllllllIllIIlllllIIllIlllIl);
            return new String(llllllllllllIllIIlllllIIllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllllIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllllIIllIllIll) {
            llllllllllllIllIIlllllIIllIllIll.printStackTrace();
            return null;
        }
    }
    
    private static ByteBuf validate(final ByteBuf llllllllllllIllIIlllllIlIIllllII) {
        if (lIIlIllIllIlIIIl(llllllllllllIllIIlllllIlIIllllII.readableBytes(), DefaultSpdyDataFrame.llIllIIlIIlIll[1])) {
            throw new IllegalArgumentException(DefaultSpdyDataFrame.llIllIIIIllIlI[DefaultSpdyDataFrame.llIllIIlIIlIll[2]]);
        }
        return llllllllllllIllIIlllllIlIIllllII;
    }
    
    public DefaultSpdyDataFrame(final int llllllllllllIllIIlllllIlIlIIlIlI) {
        this(llllllllllllIllIIlllllIlIlIIlIlI, Unpooled.buffer(DefaultSpdyDataFrame.llIllIIlIIlIll[0]));
    }
    
    private static boolean lIIlIllIllIlIlII(final int llllllllllllIllIIlllllIIlIlIllIl, final int llllllllllllIllIIlllllIIlIlIllII) {
        return llllllllllllIllIIlllllIIlIlIllIl < llllllllllllIllIIlllllIIlIlIllII;
    }
    
    private static boolean lIIlIllIllIlIIlI(final int llllllllllllIllIIlllllIIlIlIIIlI) {
        return llllllllllllIllIIlllllIIlIlIIIlI <= 0;
    }
    
    @Override
    public SpdyDataFrame retain(final int llllllllllllIllIIlllllIlIIIlIlIl) {
        this.data.retain(llllllllllllIllIIlllllIlIIIlIlIl);
        "".length();
        return this;
    }
    
    private static void lIIlIllIllIIllll() {
        (llIllIIlIIlIll = new int[10])[0] = ((0x9A ^ 0x95 ^ (0x72 ^ 0x3D)) & (0x1A ^ 0x11 ^ (0x1A ^ 0x51) ^ -" ".length()));
        DefaultSpdyDataFrame.llIllIIlIIlIll[1] = (-1 & 0xFFFFFF);
        DefaultSpdyDataFrame.llIllIIlIIlIll[2] = " ".length();
        DefaultSpdyDataFrame.llIllIIlIIlIll[3] = "  ".length();
        DefaultSpdyDataFrame.llIllIIlIIlIll[4] = (0x5 ^ 0x46 ^ (0xDD ^ 0xB7));
        DefaultSpdyDataFrame.llIllIIlIIlIll[5] = "   ".length();
        DefaultSpdyDataFrame.llIllIIlIIlIll[6] = (0xA2 ^ 0xAD ^ (0x3A ^ 0x31));
        DefaultSpdyDataFrame.llIllIIlIIlIll[7] = (0x3F ^ 0x1E ^ (0xB1 ^ 0x95));
        DefaultSpdyDataFrame.llIllIIlIIlIll[8] = (0x2B ^ 0x2D);
        DefaultSpdyDataFrame.llIllIIlIIlIll[9] = (0x6D ^ 0x65);
    }
    
    private static boolean lIIlIllIllIlIIIl(final int llllllllllllIllIIlllllIIlIlIlIIl, final int llllllllllllIllIIlllllIIlIlIlIII) {
        return llllllllllllIllIIlllllIIlIlIlIIl > llllllllllllIllIIlllllIIlIlIlIII;
    }
    
    @Override
    public SpdyDataFrame setLast(final boolean llllllllllllIllIIlllllIlIIllIIlI) {
        super.setLast(llllllllllllIllIIlllllIlIIllIIlI);
        "".length();
        return this;
    }
}
