// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.oio;

import java.util.Arrays;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.Channels;
import java.io.EOFException;
import io.netty.channel.FileRegion;
import io.netty.channel.Channel;
import java.io.IOException;
import java.nio.channels.NotYetConnectedException;
import io.netty.buffer.ByteBuf;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.channels.WritableByteChannel;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class OioByteStreamChannel extends AbstractOioByteChannel
{
    private static final /* synthetic */ int[] lIIIIIllIllIlI;
    private static final /* synthetic */ OutputStream CLOSED_OUT;
    private static final /* synthetic */ String[] lIIIIIIllIllll;
    private /* synthetic */ InputStream is;
    private static final /* synthetic */ InputStream CLOSED_IN;
    private /* synthetic */ WritableByteChannel outChannel;
    private /* synthetic */ OutputStream os;
    
    private static void lIllIlIIlllIIlI() {
        (lIIIIIIllIllll = new String[OioByteStreamChannel.lIIIIIllIllIlI[7]])[OioByteStreamChannel.lIIIIIllIllIlI[0]] = lIllIlIIllIlIll("L+SqLj1lJs3mL0ZLSZTsp9/CQcuXEk2E", "MHLYR");
        OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[1]] = lIllIlIIllIllIl("OwAeOjAgVR0rNnQGDz5lNRkYLyQwDA==", "TujJE");
        OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[2]] = lIllIlIIllIlllI("QOC+P4EUoBw=", "NpRba");
        OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[3]] = lIllIlIIllIllIl("HzE=", "pBODV");
        OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[4]] = lIllIlIIllIlIll("fhkXbSwL10hzSek1JYBZ/oR46HOG8MbL0yU57NcvDes=", "HxoKx");
        OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[5]] = lIllIlIIllIlllI("yeIreITb4deXySe2KaBjww==", "XdtLT");
        OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[6]] = lIllIlIIllIllIl("FDw3TD0YJTpMJQQmNwly", "vIClR");
    }
    
    private static int lIllIlllIIllllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIllIlllIlIIIlI(final int lllllllllllllIlIIllIlllIIIllIIll) {
        return lllllllllllllIlIIllIlllIIIllIIll < 0;
    }
    
    private static String lIllIlIIllIllIl(String lllllllllllllIlIIllIlllIIllIlIll, final String lllllllllllllIlIIllIlllIIllIlIlI) {
        lllllllllllllIlIIllIlllIIllIlIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIllIlllIIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIlllIIllIlllI = new StringBuilder();
        final char[] lllllllllllllIlIIllIlllIIllIllIl = lllllllllllllIlIIllIlllIIllIlIlI.toCharArray();
        int lllllllllllllIlIIllIlllIIllIllII = OioByteStreamChannel.lIIIIIllIllIlI[0];
        final long lllllllllllllIlIIllIlllIIllIIllI = (Object)((String)lllllllllllllIlIIllIlllIIllIlIll).toCharArray();
        final String lllllllllllllIlIIllIlllIIllIIlIl = (String)lllllllllllllIlIIllIlllIIllIIllI.length;
        String lllllllllllllIlIIllIlllIIllIIlII = (String)OioByteStreamChannel.lIIIIIllIllIlI[0];
        while (lIllIlllIlIIIll((int)lllllllllllllIlIIllIlllIIllIIlII, (int)lllllllllllllIlIIllIlllIIllIIlIl)) {
            final char lllllllllllllIlIIllIlllIIlllIIIl = lllllllllllllIlIIllIlllIIllIIllI[lllllllllllllIlIIllIlllIIllIIlII];
            lllllllllllllIlIIllIlllIIllIlllI.append((char)(lllllllllllllIlIIllIlllIIlllIIIl ^ lllllllllllllIlIIllIlllIIllIllIl[lllllllllllllIlIIllIlllIIllIllII % lllllllllllllIlIIllIlllIIllIllIl.length]));
            "".length();
            ++lllllllllllllIlIIllIlllIIllIllII;
            ++lllllllllllllIlIIllIlllIIllIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIlllIIllIlllI);
    }
    
    protected final void activate(final InputStream lllllllllllllIlIIllIlllIlIlllIlI, final OutputStream lllllllllllllIlIIllIlllIlIllllII) {
        if (lIllIlllIIllIlI(this.is)) {
            throw new IllegalStateException(OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[0]]);
        }
        if (lIllIlllIIllIlI(this.os)) {
            throw new IllegalStateException(OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[1]]);
        }
        if (lIllIlllIIllIll(lllllllllllllIlIIllIlllIlIlllIlI)) {
            throw new NullPointerException(OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[2]]);
        }
        if (lIllIlllIIllIll(lllllllllllllIlIIllIlllIlIllllII)) {
            throw new NullPointerException(OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[3]]);
        }
        this.is = lllllllllllllIlIIllIlllIlIlllIlI;
        this.os = lllllllllllllIlIIllIlllIlIllllII;
    }
    
    private static String lIllIlIIllIlIll(final String lllllllllllllIlIIllIlllIIlIIlllI, final String lllllllllllllIlIIllIlllIIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIlllIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIlllIIlIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIlllIIlIlIIII.init(OioByteStreamChannel.lIIIIIllIllIlI[2], lllllllllllllIlIIllIlllIIlIlIIIl);
            return new String(lllllllllllllIlIIllIlllIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIlllIIlIIllll) {
            lllllllllllllIlIIllIlllIIlIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void doWriteBytes(final ByteBuf lllllllllllllIlIIllIlllIlIIllIIl) throws Exception {
        final OutputStream lllllllllllllIlIIllIlllIlIIllIll = this.os;
        if (lIllIlllIIllIll(lllllllllllllIlIIllIlllIlIIllIll)) {
            throw new NotYetConnectedException();
        }
        lllllllllllllIlIIllIlllIlIIllIIl.readBytes(lllllllllllllIlIIllIlllIlIIllIll, lllllllllllllIlIIllIlllIlIIllIIl.readableBytes());
        "".length();
    }
    
    private static boolean lIllIlllIIlllIl(final Object lllllllllllllIlIIllIlllIIlIIIIlI, final Object lllllllllllllIlIIllIlllIIlIIIIIl) {
        return lllllllllllllIlIIllIlllIIlIIIIlI != lllllllllllllIlIIllIlllIIlIIIIIl;
    }
    
    private static boolean lIllIlllIIlllII(final Object lllllllllllllIlIIllIlllIIIllllII, final Object lllllllllllllIlIIllIlllIIIlllIll) {
        return lllllllllllllIlIIllIlllIIIllllII == lllllllllllllIlIIllIlllIIIlllIll;
    }
    
    private static void lIllIlllIIllIIl() {
        (lIIIIIllIllIlI = new int[9])[0] = ((((0x2E ^ 0x1F) & ~(0x8A ^ 0xBB)) ^ (0x5F ^ 0x5A)) & (0x1B ^ 0x6E ^ (0x62 ^ 0x12) ^ -" ".length()));
        OioByteStreamChannel.lIIIIIllIllIlI[1] = " ".length();
        OioByteStreamChannel.lIIIIIllIllIlI[2] = "  ".length();
        OioByteStreamChannel.lIIIIIllIllIlI[3] = "   ".length();
        OioByteStreamChannel.lIIIIIllIllIlI[4] = (98 + 10 - 60 + 93 ^ 129 + 88 - 163 + 83);
        OioByteStreamChannel.lIIIIIllIllIlI[5] = (0x26 ^ 0x23);
        OioByteStreamChannel.lIIIIIllIllIlI[6] = (0x16 ^ 0x42 ^ (0xC ^ 0x5E));
        OioByteStreamChannel.lIIIIIllIllIlI[7] = (0x37 ^ 0x30);
        OioByteStreamChannel.lIIIIIllIllIlI[8] = (0x9 ^ 0x1);
    }
    
    @Override
    protected int available() {
        try {
            return this.is.available();
        }
        catch (IOException lllllllllllllIlIIllIlllIlIlIllIl) {
            return OioByteStreamChannel.lIIIIIllIllIlI[0];
        }
    }
    
    private static boolean lIllIlllIIlllll(final int lllllllllllllIlIIllIlllIIIllIlll) {
        return lllllllllllllIlIIllIlllIIIllIlll == 0;
    }
    
    private static boolean lIllIlllIlIIIll(final int lllllllllllllIlIIllIlllIIlIIIllI, final int lllllllllllllIlIIllIlllIIlIIIlIl) {
        return lllllllllllllIlIIllIlllIIlIIIllI < lllllllllllllIlIIllIlllIIlIIIlIl;
    }
    
    protected OioByteStreamChannel(final Channel lllllllllllllIlIIllIlllIllIIIIlI) {
        super(lllllllllllllIlIIllIlllIllIIIIlI);
    }
    
    private static int lIllIlllIlIIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIllIlllIIllIll(final Object lllllllllllllIlIIllIlllIIIlllIIl) {
        return lllllllllllllIlIIllIlllIIIlllIIl == null;
    }
    
    private static void checkEOF(final FileRegion lllllllllllllIlIIllIlllIlIIIIllI) throws IOException {
        if (lIllIlllIlIIIlI(lIllIlllIlIIIIl(lllllllllllllIlIIllIlllIlIIIIllI.transfered(), lllllllllllllIlIIllIlllIlIIIIllI.count()))) {
            throw new EOFException(String.valueOf(new StringBuilder().append(OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[4]]).append(lllllllllllllIlIIllIlllIlIIIIllI.count()).append(OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[5]]).append(OioByteStreamChannel.lIIIIIIllIllll[OioByteStreamChannel.lIIIIIllIllIlI[6]]).append(lllllllllllllIlIIllIlllIlIIIIllI.transfered())));
        }
    }
    
    @Override
    protected void doWriteFileRegion(final FileRegion lllllllllllllIlIIllIlllIlIIlIIII) throws Exception {
        final OutputStream lllllllllllllIlIIllIlllIlIIIllll = this.os;
        if (lIllIlllIIllIll(lllllllllllllIlIIllIlllIlIIIllll)) {
            throw new NotYetConnectedException();
        }
        if (lIllIlllIIllIll(this.outChannel)) {
            this.outChannel = Channels.newChannel(lllllllllllllIlIIllIlllIlIIIllll);
        }
        long lllllllllllllIlIIllIlllIlIIIlllI = 0L;
        do {
            final long lllllllllllllIlIIllIlllIlIIlIIlI = lllllllllllllIlIIllIlllIlIIlIIII.transferTo(this.outChannel, lllllllllllllIlIIllIlllIlIIIlllI);
            if (lIllIlllIIlllll(lIllIlllIIllllI(lllllllllllllIlIIllIlllIlIIlIIlI, -1L))) {
                checkEOF(lllllllllllllIlIIllIlllIlIIlIIII);
                return;
            }
            lllllllllllllIlIIllIlllIlIIIlllI += lllllllllllllIlIIllIlllIlIIlIIlI;
            if (lIllIlllIlIIIII(lIllIlllIIllllI(lllllllllllllIlIIllIlllIlIIIlllI, lllllllllllllIlIIllIlllIlIIlIIII.count()))) {
                return;
            }
            "".length();
        } while ("  ".length() > " ".length());
    }
    
    private static boolean lIllIlllIlIIIII(final int lllllllllllllIlIIllIlllIIIllIlIl) {
        return lllllllllllllIlIIllIlllIIIllIlIl >= 0;
    }
    
    @Override
    public boolean isActive() {
        final InputStream lllllllllllllIlIIllIlllIlIllIlII = this.is;
        if (!lIllIlllIIllIlI(lllllllllllllIlIIllIlllIlIllIlII) || lIllIlllIIlllII(lllllllllllllIlIIllIlllIlIllIlII, OioByteStreamChannel.CLOSED_IN)) {
            return OioByteStreamChannel.lIIIIIllIllIlI[0] != 0;
        }
        final OutputStream lllllllllllllIlIIllIlllIlIllIIll = this.os;
        int n;
        if (lIllIlllIIllIlI(lllllllllllllIlIIllIlllIlIllIIll) && lIllIlllIIlllIl(lllllllllllllIlIIllIlllIlIllIIll, OioByteStreamChannel.CLOSED_OUT)) {
            n = OioByteStreamChannel.lIIIIIllIllIlI[1];
            "".length();
            if (null != null) {
                return ((0xD2 ^ 0x8B) & ~(0x9F ^ 0xC6)) != 0x0;
            }
        }
        else {
            n = OioByteStreamChannel.lIIIIIllIllIlI[0];
        }
        return n != 0;
    }
    
    @Override
    protected void doClose() throws Exception {
        final InputStream lllllllllllllIlIIllIlllIlIIIIIII = this.is;
        final OutputStream lllllllllllllIlIIllIlllIIlllllll = this.os;
        this.is = OioByteStreamChannel.CLOSED_IN;
        this.os = OioByteStreamChannel.CLOSED_OUT;
        try {
            if (lIllIlllIIllIlI(lllllllllllllIlIIllIlllIlIIIIIII)) {
                lllllllllllllIlIIllIlllIlIIIIIII.close();
            }
            if (lIllIlllIIllIlI(lllllllllllllIlIIllIlllIIlllllll)) {
                lllllllllllllIlIIllIlllIIlllllll.close();
                "".length();
                if (-" ".length() == " ".length()) {
                    return;
                }
            }
        }
        finally {
            if (lIllIlllIIllIlI(lllllllllllllIlIIllIlllIIlllllll)) {
                lllllllllllllIlIIllIlllIIlllllll.close();
            }
        }
    }
    
    static {
        lIllIlllIIllIIl();
        lIllIlIIlllIIlI();
        CLOSED_IN = new InputStream() {
            private static final /* synthetic */ int[] lIIlllIllIIlII;
            
            @Override
            public int read() {
                return OioByteStreamChannel$1.lIIlllIllIIlII[0];
            }
            
            private static void llIlllIIIIIlIII() {
                (lIIlllIllIIlII = new int[1])[0] = -" ".length();
            }
            
            static {
                llIlllIIIIIlIII();
            }
        };
        CLOSED_OUT = new OutputStream() {
            @Override
            public void write(final int llllllllllllIlllIIIlIIlIIllIIIll) throws IOException {
                throw new ClosedChannelException();
            }
        };
    }
    
    @Override
    protected int doReadBytes(final ByteBuf lllllllllllllIlIIllIlllIlIlIIlIl) throws Exception {
        final int lllllllllllllIlIIllIlllIlIlIIlII = Math.max(OioByteStreamChannel.lIIIIIllIllIlI[1], Math.min(this.available(), lllllllllllllIlIIllIlllIlIlIIlIl.maxWritableBytes()));
        return lllllllllllllIlIIllIlllIlIlIIlIl.writeBytes(this.is, lllllllllllllIlIIllIlllIlIlIIlII);
    }
    
    private static boolean lIllIlllIIllIlI(final Object lllllllllllllIlIIllIlllIIIllllll) {
        return lllllllllllllIlIIllIlllIIIllllll != null;
    }
    
    private static String lIllIlIIllIlllI(final String lllllllllllllIlIIllIlllIIlIllIll, final String lllllllllllllIlIIllIlllIIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIlllIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlllIIlIllIlI.getBytes(StandardCharsets.UTF_8)), OioByteStreamChannel.lIIIIIllIllIlI[8]), "DES");
            final Cipher lllllllllllllIlIIllIlllIIlIlllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIllIlllIIlIlllIl.init(OioByteStreamChannel.lIIIIIllIllIlI[2], lllllllllllllIlIIllIlllIIlIllllI);
            return new String(lllllllllllllIlIIllIlllIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlllIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIlllIIlIlllII) {
            lllllllllllllIlIIllIlllIIlIlllII.printStackTrace();
            return null;
        }
    }
}
