// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.io.FileInputStream;
import io.netty.handler.codec.http.HttpConstants;
import java.nio.charset.Charset;
import java.io.InputStream;
import io.netty.buffer.Unpooled;
import io.netty.buffer.CompositeByteBuf;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;

public abstract class AbstractMemoryHttpData extends AbstractHttpData
{
    private /* synthetic */ int chunkPosition;
    private static final /* synthetic */ int[] lllllIIlIllII;
    protected /* synthetic */ boolean isRenamed;
    private /* synthetic */ ByteBuf byteBuf;
    private static final /* synthetic */ String[] lllllIIlIIlII;
    
    private static boolean lIlIllIlllIlllI(final int lllllllllllllIlIlIlllIlllIllIIIl) {
        return lllllllllllllIlIlIlllIlllIllIIIl > 0;
    }
    
    private static int lIlIllIllllIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIlIllIllIlIlII(final String lllllllllllllIlIlIlllIllllIIlIII, final String lllllllllllllIlIlIlllIllllIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlllIllllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), AbstractMemoryHttpData.lllllIIlIllII[10]), "DES");
            final Cipher lllllllllllllIlIlIlllIllllIIllII = Cipher.getInstance("DES");
            lllllllllllllIlIlIlllIllllIIllII.init(AbstractMemoryHttpData.lllllIIlIllII[2], lllllllllllllIlIlIlllIllllIIllIl);
            return new String(lllllllllllllIlIlIlllIllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlllIllllIIlIll) {
            lllllllllllllIlIlIlllIllllIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static int lIlIllIlllIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void setContent(final ByteBuf lllllllllllllIlIlIllllIIIlllIIIl) throws IOException {
        if (lIlIllIlllIllIl(lllllllllllllIlIlIllllIIIlllIIIl)) {
            throw new NullPointerException(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[0]]);
        }
        final long lllllllllllllIlIlIllllIIIlllIIII = lllllllllllllIlIlIllllIIIlllIIIl.readableBytes();
        if (lIlIllIlllIlllI(lIlIllIlllIllII(this.definedSize, 0L)) && lIlIllIlllIllll(lIlIllIlllIllII(this.definedSize, lllllllllllllIlIlIllllIIIlllIIII))) {
            throw new IOException(String.valueOf(new StringBuilder().append(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[1]]).append(lllllllllllllIlIlIllllIIIlllIIII).append(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[2]]).append(this.definedSize)));
        }
        if (lIlIllIllllIIII(this.byteBuf)) {
            this.byteBuf.release();
            "".length();
        }
        this.byteBuf = lllllllllllllIlIlIllllIIIlllIIIl;
        this.size = lllllllllllllIlIlIllllIIIlllIIII;
        this.completed = (AbstractMemoryHttpData.lllllIIlIllII[1] != 0);
    }
    
    private static boolean lIlIllIllllIllI(final int lllllllllllllIlIlIlllIlllIlllllI, final int lllllllllllllIlIlIlllIlllIllllIl) {
        return lllllllllllllIlIlIlllIlllIlllllI < lllllllllllllIlIlIlllIlllIllllIl;
    }
    
    @Override
    public File getFile() throws IOException {
        throw new IOException(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[15]]);
    }
    
    private static boolean lIlIllIlllIllIl(final Object lllllllllllllIlIlIlllIlllIlllIIl) {
        return lllllllllllllIlIlIlllIlllIlllIIl == null;
    }
    
    @Override
    public boolean renameTo(final File lllllllllllllIlIlIllllIIIIIIIIll) throws IOException {
        if (lIlIllIlllIllIl(lllllllllllllIlIlIllllIIIIIIIIll)) {
            throw new NullPointerException(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[14]]);
        }
        if (lIlIllIlllIllIl(this.byteBuf)) {
            lllllllllllllIlIlIllllIIIIIIIIll.createNewFile();
            "".length();
            this.isRenamed = (AbstractMemoryHttpData.lllllIIlIllII[1] != 0);
            return AbstractMemoryHttpData.lllllIIlIllII[1] != 0;
        }
        final int lllllllllllllIlIlIllllIIIIIIIIlI = this.byteBuf.readableBytes();
        final FileOutputStream lllllllllllllIlIlIllllIIIIIIIIIl = new FileOutputStream(lllllllllllllIlIlIllllIIIIIIIIll);
        final FileChannel lllllllllllllIlIlIllllIIIIIIIIII = lllllllllllllIlIlIllllIIIIIIIIIl.getChannel();
        int lllllllllllllIlIlIlllIllllllllll = AbstractMemoryHttpData.lllllIIlIllII[0];
        if (lIlIllIllllIlll(this.byteBuf.nioBufferCount(), AbstractMemoryHttpData.lllllIIlIllII[1])) {
            final ByteBuffer lllllllllllllIlIlIllllIIIIIIIllI = this.byteBuf.nioBuffer();
            while (lIlIllIllllIllI(lllllllllllllIlIlIlllIllllllllll, lllllllllllllIlIlIllllIIIIIIIIlI)) {
                lllllllllllllIlIlIlllIllllllllll += lllllllllllllIlIlIllllIIIIIIIIII.write(lllllllllllllIlIlIllllIIIIIIIllI);
                "".length();
                if (((0x9A ^ 0x8A ^ ((0x58 ^ 0x1B) & ~(0xD9 ^ 0x9A))) & (0x7C ^ 0x2E ^ (0xEF ^ 0xAD) ^ -" ".length())) < 0) {
                    return ((22 + 6 + 185 + 2 ^ 112 + 4 + 6 + 13) & (0xF3 ^ 0xA0 ^ "   ".length() ^ -" ".length())) != 0x0;
                }
            }
            "".length();
            if (null != null) {
                return ((15 + 28 + 129 + 21 ^ 11 + 91 + 22 + 73) & (2 + 14 + 13 + 110 ^ 86 + 48 - 22 + 31 ^ -" ".length())) != 0x0;
            }
        }
        else {
            final ByteBuffer[] lllllllllllllIlIlIllllIIIIIIIlIl = this.byteBuf.nioBuffers();
            while (lIlIllIllllIllI(lllllllllllllIlIlIlllIllllllllll, lllllllllllllIlIlIllllIIIIIIIIlI)) {
                lllllllllllllIlIlIlllIllllllllll += (int)lllllllllllllIlIlIllllIIIIIIIIII.write(lllllllllllllIlIlIllllIIIIIIIlIl);
                "".length();
                if (null != null) {
                    return ((0x5F ^ 0x5A) & ~(0x12 ^ 0x17)) != 0x0;
                }
            }
        }
        lllllllllllllIlIlIllllIIIIIIIIII.force((boolean)(AbstractMemoryHttpData.lllllIIlIllII[0] != 0));
        lllllllllllllIlIlIllllIIIIIIIIII.close();
        lllllllllllllIlIlIllllIIIIIIIIIl.close();
        this.isRenamed = (AbstractMemoryHttpData.lllllIIlIllII[1] != 0);
        int n;
        if (lIlIllIllllIlll(lllllllllllllIlIlIlllIllllllllll, lllllllllllllIlIlIllllIIIIIIIIlI)) {
            n = AbstractMemoryHttpData.lllllIIlIllII[1];
            "".length();
            if ("  ".length() >= (0x3A ^ 0x3E)) {
                return ((0x60 ^ 0x23) & ~(0xE0 ^ 0xA3)) != 0x0;
            }
        }
        else {
            n = AbstractMemoryHttpData.lllllIIlIllII[0];
        }
        return n != 0;
    }
    
    @Override
    public void addContent(final ByteBuf lllllllllllllIlIlIllllIIIlIlIIIl, final boolean lllllllllllllIlIlIllllIIIlIlIIII) throws IOException {
        if (lIlIllIllllIIII(lllllllllllllIlIlIllllIIIlIlIIIl)) {
            final long lllllllllllllIlIlIllllIIIlIlIIll = lllllllllllllIlIlIllllIIIlIlIIIl.readableBytes();
            if (lIlIllIlllIlllI(lIlIllIllllIIlI(this.definedSize, 0L)) && lIlIllIlllIllll(lIlIllIllllIIlI(this.definedSize, this.size + lllllllllllllIlIlIllllIIIlIlIIll))) {
                throw new IOException(String.valueOf(new StringBuilder().append(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[7]]).append(this.size + lllllllllllllIlIlIllllIIIlIlIIll).append(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[8]]).append(this.definedSize)));
            }
            this.size += lllllllllllllIlIlIllllIIIlIlIIll;
            if (lIlIllIlllIllIl(this.byteBuf)) {
                this.byteBuf = lllllllllllllIlIlIllllIIIlIlIIIl;
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            else if (lIlIllIllllIIll((this.byteBuf instanceof CompositeByteBuf) ? 1 : 0)) {
                final CompositeByteBuf lllllllllllllIlIlIllllIIIlIlIlIl = (CompositeByteBuf)this.byteBuf;
                lllllllllllllIlIlIllllIIIlIlIlIl.addComponent(lllllllllllllIlIlIllllIIIlIlIIIl);
                "".length();
                lllllllllllllIlIlIllllIIIlIlIlIl.writerIndex(lllllllllllllIlIlIllllIIIlIlIlIl.writerIndex() + lllllllllllllIlIlIllllIIIlIlIIIl.readableBytes());
                "".length();
                "".length();
                if (((8 + 153 - 73 + 79 ^ 85 + 49 - 47 + 104) & (0x61 ^ 0x18 ^ (0x45 ^ 0x24) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                final CompositeByteBuf compositeBuffer;
                final CompositeByteBuf lllllllllllllIlIlIllllIIIlIlIlII = compositeBuffer = Unpooled.compositeBuffer(AbstractMemoryHttpData.lllllIIlIllII[9]);
                final ByteBuf[] lllllllllllllIIlIllllIllIIIllIll = new ByteBuf[AbstractMemoryHttpData.lllllIIlIllII[2]];
                lllllllllllllIIlIllllIllIIIllIll[AbstractMemoryHttpData.lllllIIlIllII[0]] = this.byteBuf;
                lllllllllllllIIlIllllIllIIIllIll[AbstractMemoryHttpData.lllllIIlIllII[1]] = lllllllllllllIlIlIllllIIIlIlIIIl;
                compositeBuffer.addComponents(lllllllllllllIIlIllllIllIIIllIll);
                "".length();
                lllllllllllllIlIlIllllIIIlIlIlII.writerIndex(this.byteBuf.readableBytes() + lllllllllllllIlIlIllllIIIlIlIIIl.readableBytes());
                "".length();
                this.byteBuf = lllllllllllllIlIlIllllIIIlIlIlII;
            }
        }
        if (lIlIllIllllIIll(lllllllllllllIlIlIllllIIIlIlIIII ? 1 : 0)) {
            this.completed = (AbstractMemoryHttpData.lllllIIlIllII[1] != 0);
            "".length();
            if (((0xFC ^ 0x84 ^ (0x91 ^ 0xBD)) & (0x8C ^ 0x85 ^ (0xF3 ^ 0xAE) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIlIllIlllIllIl(lllllllllllllIlIlIllllIIIlIlIIIl)) {
            throw new NullPointerException(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[10]]);
        }
    }
    
    @Override
    public void setContent(final InputStream lllllllllllllIlIlIllllIIIlIlllll) throws IOException {
        if (lIlIllIlllIllIl(lllllllllllllIlIlIllllIIIlIlllll)) {
            throw new NullPointerException(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[3]]);
        }
        final ByteBuf lllllllllllllIlIlIllllIIIllIIlII = Unpooled.buffer();
        final byte[] lllllllllllllIlIlIllllIIIllIIIll = new byte[AbstractMemoryHttpData.lllllIIlIllII[4]];
        int lllllllllllllIlIlIllllIIIllIIIlI = lllllllllllllIlIlIllllIIIlIlllll.read(lllllllllllllIlIlIllllIIIllIIIll);
        int lllllllllllllIlIlIllllIIIllIIIIl = AbstractMemoryHttpData.lllllIIlIllII[0];
        while (lIlIllIlllIlllI(lllllllllllllIlIlIllllIIIllIIIlI)) {
            lllllllllllllIlIlIllllIIIllIIlII.writeBytes(lllllllllllllIlIlIllllIIIllIIIll, AbstractMemoryHttpData.lllllIIlIllII[0], lllllllllllllIlIlIllllIIIllIIIlI);
            "".length();
            lllllllllllllIlIlIllllIIIllIIIIl += lllllllllllllIlIlIllllIIIllIIIlI;
            lllllllllllllIlIlIllllIIIllIIIlI = lllllllllllllIlIlIllllIIIlIlllll.read(lllllllllllllIlIlIllllIIIllIIIll);
            "".length();
            if (((0x4E ^ 0x3A ^ (0x75 ^ 0x36)) & (108 + 108 - 205 + 169 ^ 123 + 28 - 35 + 15 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        this.size = lllllllllllllIlIlIllllIIIllIIIIl;
        if (lIlIllIlllIlllI(lIlIllIllllIIIl(this.definedSize, 0L)) && lIlIllIlllIllll(lIlIllIllllIIIl(this.definedSize, this.size))) {
            throw new IOException(String.valueOf(new StringBuilder().append(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[5]]).append(this.size).append(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[6]]).append(this.definedSize)));
        }
        if (lIlIllIllllIIII(this.byteBuf)) {
            this.byteBuf.release();
            "".length();
        }
        this.byteBuf = lllllllllllllIlIlIllllIIIllIIlII;
        this.completed = (AbstractMemoryHttpData.lllllIIlIllII[1] != 0);
    }
    
    static {
        lIlIllIlllIlIll();
        lIlIllIllIllIll();
    }
    
    private static boolean lIlIllIlllIllll(final int lllllllllllllIlIlIlllIlllIllIIll) {
        return lllllllllllllIlIlIlllIlllIllIIll < 0;
    }
    
    protected AbstractMemoryHttpData(final String lllllllllllllIlIlIllllIIlIIIIIlI, final Charset lllllllllllllIlIlIllllIIlIIIIIII, final long lllllllllllllIlIlIllllIIIllllllI) {
        super(lllllllllllllIlIlIllllIIlIIIIIlI, lllllllllllllIlIlIllllIIlIIIIIII, lllllllllllllIlIlIllllIIIllllllI);
    }
    
    private static void lIlIllIlllIlIll() {
        (lllllIIlIllII = new int[17])[0] = ((0x25 ^ 0x4 ^ (0x25 ^ 0xF)) & (3 + 1 + 147 + 56 ^ 103 + 132 - 98 + 59 ^ -" ".length()));
        AbstractMemoryHttpData.lllllIIlIllII[1] = " ".length();
        AbstractMemoryHttpData.lllllIIlIllII[2] = "  ".length();
        AbstractMemoryHttpData.lllllIIlIllII[3] = "   ".length();
        AbstractMemoryHttpData.lllllIIlIllII[4] = (0xFFFFC75C & 0x78A3);
        AbstractMemoryHttpData.lllllIIlIllII[5] = (0x7D ^ 0x12 ^ (0x61 ^ 0xA));
        AbstractMemoryHttpData.lllllIIlIllII[6] = (125 + 176 - 206 + 89 ^ 90 + 184 - 106 + 21);
        AbstractMemoryHttpData.lllllIIlIllII[7] = (0x1F ^ 0x19);
        AbstractMemoryHttpData.lllllIIlIllII[8] = (100 + 133 - 92 + 43 ^ 97 + 75 - 0 + 19);
        AbstractMemoryHttpData.lllllIIlIllII[9] = (-1 & Integer.MAX_VALUE);
        AbstractMemoryHttpData.lllllIIlIllII[10] = (0xF ^ 0x4D ^ (0x8C ^ 0xC6));
        AbstractMemoryHttpData.lllllIIlIllII[11] = (87 + 131 - 162 + 110 ^ 111 + 22 + 22 + 20);
        AbstractMemoryHttpData.lllllIIlIllII[12] = (0x1C ^ 0x16);
        AbstractMemoryHttpData.lllllIIlIllII[13] = (138 + 168 - 290 + 173 ^ 172 + 56 - 57 + 11);
        AbstractMemoryHttpData.lllllIIlIllII[14] = (0x3E ^ 0x32);
        AbstractMemoryHttpData.lllllIIlIllII[15] = (0x1C ^ 0x11);
        AbstractMemoryHttpData.lllllIIlIllII[16] = (0x4B ^ 0x45);
    }
    
    private static String lIlIllIllIllIII(String lllllllllllllIlIlIlllIlllllIIlll, final String lllllllllllllIlIlIlllIlllllIlIll) {
        lllllllllllllIlIlIlllIlllllIIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlllIlllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlllIlllllIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIlllIlllllIlIIl = lllllllllllllIlIlIlllIlllllIlIll.toCharArray();
        int lllllllllllllIlIlIlllIlllllIlIII = AbstractMemoryHttpData.lllllIIlIllII[0];
        final byte lllllllllllllIlIlIlllIlllllIIIlI = (Object)lllllllllllllIlIlIlllIlllllIIlll.toCharArray();
        final float lllllllllllllIlIlIlllIlllllIIIIl = lllllllllllllIlIlIlllIlllllIIIlI.length;
        char lllllllllllllIlIlIlllIlllllIIIII = (char)AbstractMemoryHttpData.lllllIIlIllII[0];
        while (lIlIllIllllIllI(lllllllllllllIlIlIlllIlllllIIIII, (int)lllllllllllllIlIlIlllIlllllIIIIl)) {
            final char lllllllllllllIlIlIlllIlllllIllIl = lllllllllllllIlIlIlllIlllllIIIlI[lllllllllllllIlIlIlllIlllllIIIII];
            lllllllllllllIlIlIlllIlllllIlIlI.append((char)(lllllllllllllIlIlIlllIlllllIllIl ^ lllllllllllllIlIlIlllIlllllIlIIl[lllllllllllllIlIlIlllIlllllIlIII % lllllllllllllIlIlIlllIlllllIlIIl.length]));
            "".length();
            ++lllllllllllllIlIlIlllIlllllIlIII;
            ++lllllllllllllIlIlIlllIlllllIIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlllIlllllIlIlI);
    }
    
    @Override
    public String getString(Charset lllllllllllllIlIlIllllIIIIlIIIIl) {
        if (lIlIllIlllIllIl(this.byteBuf)) {
            return AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[13]];
        }
        if (lIlIllIlllIllIl(lllllllllllllIlIlIllllIIIIlIIIIl)) {
            lllllllllllllIlIlIllllIIIIlIIIIl = HttpConstants.DEFAULT_CHARSET;
        }
        return this.byteBuf.toString(lllllllllllllIlIlIllllIIIIlIIIIl);
    }
    
    private static boolean lIlIllIllllIIII(final Object lllllllllllllIlIlIlllIlllIlllIll) {
        return lllllllllllllIlIlIlllIlllIlllIll != null;
    }
    
    private static String lIlIllIllIIllII(final String lllllllllllllIlIlIlllIllllIlIlIl, final String lllllllllllllIlIlIlllIllllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlllIllllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIllllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlllIllllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlllIllllIllIIl.init(AbstractMemoryHttpData.lllllIIlIllII[2], lllllllllllllIlIlIlllIllllIllIlI);
            return new String(lllllllllllllIlIlIlllIllllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlllIllllIllIII) {
            lllllllllllllIlIlIlllIllllIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setContent(final File lllllllllllllIlIlIllllIIIIlllIIl) throws IOException {
        if (lIlIllIlllIllIl(lllllllllllllIlIlIllllIIIIlllIIl)) {
            throw new NullPointerException(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[11]]);
        }
        final long lllllllllllllIlIlIllllIIIlIIIIII = lllllllllllllIlIlIllllIIIIlllIIl.length();
        if (lIlIllIlllIlllI(lIlIllIllllIlII(lllllllllllllIlIlIllllIIIlIIIIII, 2147483647L))) {
            throw new IllegalArgumentException(AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[12]]);
        }
        final FileInputStream lllllllllllllIlIlIllllIIIIllllll = new FileInputStream(lllllllllllllIlIlIllllIIIIlllIIl);
        final FileChannel lllllllllllllIlIlIllllIIIIlllllI = lllllllllllllIlIlIllllIIIIllllll.getChannel();
        final byte[] lllllllllllllIlIlIllllIIIIllllIl = new byte[(int)lllllllllllllIlIlIllllIIIlIIIIII];
        final ByteBuffer lllllllllllllIlIlIllllIIIIllllII = ByteBuffer.wrap(lllllllllllllIlIlIllllIIIIllllIl);
        int lllllllllllllIlIlIllllIIIIlllIll = AbstractMemoryHttpData.lllllIIlIllII[0];
        while (lIlIllIlllIllll(lIlIllIllllIlII(lllllllllllllIlIlIllllIIIIlllIll, lllllllllllllIlIlIllllIIIlIIIIII))) {
            lllllllllllllIlIlIllllIIIIlllIll += lllllllllllllIlIlIllllIIIIlllllI.read(lllllllllllllIlIlIllllIIIIllllII);
            "".length();
            if (" ".length() > (28 + 69 + 25 + 6 ^ 58 + 106 - 136 + 104)) {
                return;
            }
        }
        lllllllllllllIlIlIllllIIIIlllllI.close();
        lllllllllllllIlIlIllllIIIIllllll.close();
        lllllllllllllIlIlIllllIIIIllllII.flip();
        "".length();
        if (lIlIllIllllIIII(this.byteBuf)) {
            this.byteBuf.release();
            "".length();
        }
        final int lllllllllllllIlIIlIIIlIIIIlllIll = AbstractMemoryHttpData.lllllIIlIllII[9];
        final ByteBuffer[] lllllllllllllIlIIlIIIlIIIIlllIlI = new ByteBuffer[AbstractMemoryHttpData.lllllIIlIllII[1]];
        lllllllllllllIlIIlIIIlIIIIlllIlI[AbstractMemoryHttpData.lllllIIlIllII[0]] = lllllllllllllIlIlIllllIIIIllllII;
        this.byteBuf = Unpooled.wrappedBuffer(lllllllllllllIlIIlIIIlIIIIlllIll, lllllllllllllIlIIlIIIlIIIIlllIlI);
        this.size = lllllllllllllIlIlIllllIIIlIIIIII;
        this.completed = (AbstractMemoryHttpData.lllllIIlIllII[1] != 0);
    }
    
    private static void lIlIllIllIllIll() {
        (lllllIIlIIlII = new String[AbstractMemoryHttpData.lllllIIlIllII[16]])[AbstractMemoryHttpData.lllllIIlIllII[0]] = lIlIllIllIIllII("pfeff2dxFEI=", "PeLVr");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[1]] = lIlIllIllIIllII("7+nss7HqjyOPlBBk7Kzgxg==", "CLcZm");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[2]] = lIlIllIllIIllII("hvMY6nzCCGY=", "hePqo");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[3]] = lIlIllIllIlIlII("24Z2Vbuzb6xhgXqQY+QECw==", "QICOs");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[5]] = lIlIllIllIIllII("bAUDw0DaOoiR3BL70C3WxQ==", "TBVPE");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[6]] = lIlIllIllIIllII("Z5d2y/SLuCE=", "eUqEN");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[7]] = lIlIllIllIlIlII("krnXzVI+kXckgt7HVWgvIw==", "krvdB");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[8]] = lIlIllIllIIllII("FQvMGcJMgYE=", "UFyyc");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[10]] = lIlIllIllIlIlII("LWtkPUrbmMY=", "ZvXuk");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[11]] = lIlIllIllIllIII("NjM1PA==", "PZYYd");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[12]] = lIlIllIllIIllII("TkhoOPar87q2La/gU/ZrhpD9lbJfCs5APATisolhyRedxQoxcX/9Fw==", "PNpRy");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[13]] = lIlIllIllIIllII("oFrn5X7RUhE=", "Qdhkb");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[14]] = lIlIllIllIIllII("i9O6XhpdMZY=", "qLqPQ");
        AbstractMemoryHttpData.lllllIIlIIlII[AbstractMemoryHttpData.lllllIIlIllII[15]] = lIlIllIllIllIII("FAEScgI/HhQ3Az8AEjcUegwfchF6CA8+FQ==", "ZnfRp");
    }
    
    private static boolean lIlIllIllllIIll(final int lllllllllllllIlIlIlllIlllIllIlll) {
        return lllllllllllllIlIlIlllIlllIllIlll != 0;
    }
    
    @Override
    public boolean isInMemory() {
        return AbstractMemoryHttpData.lllllIIlIllII[1] != 0;
    }
    
    @Override
    public byte[] get() {
        if (lIlIllIlllIllIl(this.byteBuf)) {
            return Unpooled.EMPTY_BUFFER.array();
        }
        final byte[] lllllllllllllIlIlIllllIIIIlIllII = new byte[this.byteBuf.readableBytes()];
        this.byteBuf.getBytes(this.byteBuf.readerIndex(), lllllllllllllIlIlIllllIIIIlIllII);
        "".length();
        return lllllllllllllIlIlIllllIIIIlIllII;
    }
    
    @Override
    public String getString() {
        return this.getString(HttpConstants.DEFAULT_CHARSET);
    }
    
    private static boolean lIlIllIllllIlll(final int lllllllllllllIlIlIlllIllllIIIIlI, final int lllllllllllllIlIlIlllIllllIIIIIl) {
        return lllllllllllllIlIlIlllIllllIIIIlI == lllllllllllllIlIlIlllIllllIIIIIl;
    }
    
    private static boolean lIlIllIllllIlIl(final int lllllllllllllIlIlIlllIlllIllIlIl) {
        return lllllllllllllIlIlIlllIlllIllIlIl == 0;
    }
    
    @Override
    public ByteBuf getChunk(final int lllllllllllllIlIlIllllIIIIIlIIlI) throws IOException {
        if (!lIlIllIllllIIII(this.byteBuf) || !lIlIllIllllIIll(lllllllllllllIlIlIllllIIIIIlIIlI) || lIlIllIllllIlIl(this.byteBuf.readableBytes())) {
            this.chunkPosition = AbstractMemoryHttpData.lllllIIlIllII[0];
            return Unpooled.EMPTY_BUFFER;
        }
        final int lllllllllllllIlIlIllllIIIIIlIllI = this.byteBuf.readableBytes() - this.chunkPosition;
        if (lIlIllIllllIlIl(lllllllllllllIlIlIllllIIIIIlIllI)) {
            this.chunkPosition = AbstractMemoryHttpData.lllllIIlIllII[0];
            return Unpooled.EMPTY_BUFFER;
        }
        int lllllllllllllIlIlIllllIIIIIlIlIl = lllllllllllllIlIlIllllIIIIIlIIlI;
        if (lIlIllIllllIllI(lllllllllllllIlIlIllllIIIIIlIllI, lllllllllllllIlIlIllllIIIIIlIIlI)) {
            lllllllllllllIlIlIllllIIIIIlIlIl = lllllllllllllIlIlIllllIIIIIlIllI;
        }
        final ByteBuf lllllllllllllIlIlIllllIIIIIlIlII = this.byteBuf.slice(this.chunkPosition, lllllllllllllIlIlIllllIIIIIlIlIl).retain();
        this.chunkPosition += lllllllllllllIlIlIllllIIIIIlIlIl;
        return lllllllllllllIlIlIllllIIIIIlIlII;
    }
    
    private static int lIlIllIllllIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void delete() {
        if (lIlIllIllllIIII(this.byteBuf)) {
            this.byteBuf.release();
            "".length();
            this.byteBuf = null;
        }
    }
    
    @Override
    public ByteBuf getByteBuf() {
        return this.byteBuf;
    }
    
    private static int lIlIllIllllIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
}
