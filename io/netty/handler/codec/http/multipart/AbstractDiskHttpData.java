// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.nio.charset.Charset;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpConstants;
import java.nio.channels.WritableByteChannel;
import java.io.FileInputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import io.netty.util.internal.EmptyArrays;
import java.nio.ByteBuffer;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import io.netty.util.internal.logging.InternalLogger;
import java.nio.channels.FileChannel;
import java.io.File;

public abstract class AbstractDiskHttpData extends AbstractHttpData
{
    private static final /* synthetic */ int[] llIIllllIIllll;
    protected /* synthetic */ File file;
    private /* synthetic */ FileChannel fileChannel;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] llIIllllIIlIlI;
    private /* synthetic */ boolean isRenamed;
    
    private File tempFile() throws IOException {
        final String llllllllllllIllIlllIllIIllIlIllI = this.getDiskFilename();
        String llllllllllllIllIlllIllIIllIlIlll;
        if (lIIlIIIIIIlIllII(llllllllllllIllIlllIllIIllIlIllI)) {
            final String llllllllllllIllIlllIllIIllIllIlI = String.valueOf(new StringBuilder().append((char)AbstractDiskHttpData.llIIllllIIllll[0]).append(llllllllllllIllIlllIllIIllIlIllI));
            "".length();
            if ((0x6C ^ 0x68) < "   ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIllIlllIllIIllIlIlll = this.getPostfix();
        }
        File llllllllllllIllIlllIllIIllIlIlIl;
        if (lIIlIIIIIIlIllIl(this.getBaseDirectory())) {
            final File llllllllllllIllIlllIllIIllIllIIl = File.createTempFile(this.getPrefix(), llllllllllllIllIlllIllIIllIlIlll);
            "".length();
            if (((0x4D ^ 0x27 ^ (0x4B ^ 0x2B)) & (0xFF ^ 0x8A ^ 2 + 15 - 2 + 112 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIllIlllIllIIllIlIlIl = File.createTempFile(this.getPrefix(), llllllllllllIllIlllIllIIllIlIlll, new File(this.getBaseDirectory()));
        }
        if (lIIlIIIIIIlIlllI(this.deleteOnExit() ? 1 : 0)) {
            llllllllllllIllIlllIllIIllIlIlIl.deleteOnExit();
        }
        return llllllllllllIllIlllIllIIllIlIlIl;
    }
    
    @Override
    public void setContent(final InputStream llllllllllllIllIlllIllIIlIIlIlIl) throws IOException {
        if (lIIlIIIIIIlIllIl(llllllllllllIllIlllIllIIlIIlIlIl)) {
            throw new NullPointerException(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[7]]);
        }
        if (lIIlIIIIIIlIllII(this.file)) {
            this.delete();
        }
        this.file = this.tempFile();
        final FileOutputStream llllllllllllIllIlllIllIIlIIlIlII = new FileOutputStream(this.file);
        final FileChannel llllllllllllIllIlllIllIIlIIlIIll = llllllllllllIllIlllIllIIlIIlIlII.getChannel();
        final byte[] llllllllllllIllIlllIllIIlIIlIIlI = new byte[AbstractDiskHttpData.llIIllllIIllll[8]];
        final ByteBuffer llllllllllllIllIlllIllIIlIIlIIIl = ByteBuffer.wrap(llllllllllllIllIlllIllIIlIIlIIlI);
        int llllllllllllIllIlllIllIIlIIlIIII = llllllllllllIllIlllIllIIlIIlIlIl.read(llllllllllllIllIlllIllIIlIIlIIlI);
        int llllllllllllIllIlllIllIIlIIIllll = AbstractDiskHttpData.llIIllllIIllll[1];
        while (lIIlIIIIIIllIIII(llllllllllllIllIlllIllIIlIIlIIII)) {
            llllllllllllIllIlllIllIIlIIlIIIl.position(llllllllllllIllIlllIllIIlIIlIIII).flip();
            "".length();
            llllllllllllIllIlllIllIIlIIIllll += llllllllllllIllIlllIllIIlIIlIIll.write(llllllllllllIllIlllIllIIlIIlIIIl);
            llllllllllllIllIlllIllIIlIIlIIII = llllllllllllIllIlllIllIIlIIlIlIl.read(llllllllllllIllIlllIllIIlIIlIIlI);
            "".length();
            if ("   ".length() > (0x9 ^ 0xD)) {
                return;
            }
        }
        llllllllllllIllIlllIllIIlIIlIIll.force((boolean)(AbstractDiskHttpData.llIIllllIIllll[1] != 0));
        llllllllllllIllIlllIllIIlIIlIIll.close();
        this.size = llllllllllllIllIlllIllIIlIIIllll;
        if (lIIlIIIIIIllIIII(lIIlIIIIIIllIllI(this.definedSize, 0L)) && lIIlIIIIIIllIIIl(lIIlIIIIIIllIllI(this.definedSize, this.size))) {
            this.file.delete();
            "".length();
            this.file = null;
            throw new IOException(String.valueOf(new StringBuilder().append(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[9]]).append(this.size).append(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[10]]).append(this.definedSize)));
        }
        this.isRenamed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
        this.completed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
    }
    
    private static int lIIlIIIIIIllIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIlIIIIIIlIlllI(final int llllllllllllIllIlllIlIlllllIlIIl) {
        return llllllllllllIllIlllIlIlllllIlIIl != 0;
    }
    
    @Override
    public byte[] get() throws IOException {
        if (lIIlIIIIIIlIllIl(this.file)) {
            return EmptyArrays.EMPTY_BYTES;
        }
        return readFrom(this.file);
    }
    
    @Override
    public void setContent(final ByteBuf llllllllllllIllIlllIllIIllIIIlII) throws IOException {
        if (lIIlIIIIIIlIllIl(llllllllllllIllIlllIllIIllIIIlII)) {
            throw new NullPointerException(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[1]]);
        }
        try {
            this.size = llllllllllllIllIlllIllIIllIIIlII.readableBytes();
            if (lIIlIIIIIIllIIII(lIIlIIIIIIlIllll(this.definedSize, 0L)) && lIIlIIIIIIllIIIl(lIIlIIIIIIlIllll(this.definedSize, this.size))) {
                throw new IOException(String.valueOf(new StringBuilder().append(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[2]]).append(this.size).append(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[3]]).append(this.definedSize)));
            }
            if (lIIlIIIIIIlIllIl(this.file)) {
                this.file = this.tempFile();
            }
            if (lIIlIIIIIIllIIlI(llllllllllllIllIlllIllIIllIIIlII.readableBytes())) {
                this.file.createNewFile();
                "".length();
                return;
            }
            final FileOutputStream llllllllllllIllIlllIllIIllIIlIIl = new FileOutputStream(this.file);
            final FileChannel llllllllllllIllIlllIllIIllIIlIII = llllllllllllIllIlllIllIIllIIlIIl.getChannel();
            final ByteBuffer llllllllllllIllIlllIllIIllIIIlll = llllllllllllIllIlllIllIIllIIIlII.nioBuffer();
            int llllllllllllIllIlllIllIIllIIIllI = AbstractDiskHttpData.llIIllllIIllll[1];
            while (lIIlIIIIIIllIIIl(lIIlIIIIIIlIllll(llllllllllllIllIlllIllIIllIIIllI, this.size))) {
                llllllllllllIllIlllIllIIllIIIllI += llllllllllllIllIlllIllIIllIIlIII.write(llllllllllllIllIlllIllIIllIIIlll);
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
            }
            llllllllllllIllIlllIllIIllIIIlII.readerIndex(llllllllllllIllIlllIllIIllIIIlII.readerIndex() + llllllllllllIllIlllIllIIllIIIllI);
            "".length();
            llllllllllllIllIlllIllIIllIIlIII.force((boolean)(AbstractDiskHttpData.llIIllllIIllll[1] != 0));
            llllllllllllIllIlllIllIIllIIlIII.close();
            llllllllllllIllIlllIllIIllIIlIIl.close();
            this.completed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
            llllllllllllIllIlllIllIIllIIIlII.release();
            "".length();
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        finally {
            llllllllllllIllIlllIllIIllIIIlII.release();
            "".length();
        }
    }
    
    private static int lIIlIIIIIIlllIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIlIIIIIIlIIIII(final String llllllllllllIllIlllIllIIIIlIIIIl, final String llllllllllllIllIlllIllIIIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIlllIllIIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIllIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), AbstractDiskHttpData.llIIllllIIllll[10]), "DES");
            final Cipher llllllllllllIllIlllIllIIIIlIIIll = Cipher.getInstance("DES");
            llllllllllllIllIlllIllIIIIlIIIll.init(AbstractDiskHttpData.llIIllllIIllll[3], llllllllllllIllIlllIllIIIIlIIlII);
            return new String(llllllllllllIllIlllIllIIIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIllIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIllIIIIlIIIlI) {
            llllllllllllIllIlllIllIIIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static int lIIlIIIIIIlIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public boolean renameTo(final File llllllllllllIllIlllIllIIIlIIlIIl) throws IOException {
        if (lIIlIIIIIIlIllIl(llllllllllllIllIlllIllIIIlIIlIIl)) {
            throw new NullPointerException(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[14]]);
        }
        if (lIIlIIIIIIlIllIl(this.file)) {
            throw new IOException(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[15]]);
        }
        if (!lIIlIIIIIIllIIlI(this.file.renameTo(llllllllllllIllIlllIllIIIlIIlIIl) ? 1 : 0)) {
            this.file = llllllllllllIllIlllIllIIIlIIlIIl;
            this.isRenamed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
            return AbstractDiskHttpData.llIIllllIIllll[2] != 0;
        }
        final FileInputStream llllllllllllIllIlllIllIIIlIlIIII = new FileInputStream(this.file);
        final FileOutputStream llllllllllllIllIlllIllIIIlIIllll = new FileOutputStream(llllllllllllIllIlllIllIIIlIIlIIl);
        final FileChannel llllllllllllIllIlllIllIIIlIIlllI = llllllllllllIllIlllIllIIIlIlIIII.getChannel();
        final FileChannel llllllllllllIllIlllIllIIIlIIllIl = llllllllllllIllIlllIllIIIlIIllll.getChannel();
        int llllllllllllIllIlllIllIIIlIIllII = AbstractDiskHttpData.llIIllllIIllll[16];
        long llllllllllllIllIlllIllIIIlIIlIll = 0L;
        while (lIIlIIIIIIllIIIl(lIIlIIIIIIllIlll(llllllllllllIllIlllIllIIIlIIlIll, this.size))) {
            if (lIIlIIIIIIllIIIl(lIIlIIIIIIllIlll(llllllllllllIllIlllIllIIIlIIllII, this.size - llllllllllllIllIlllIllIIIlIIlIll))) {
                llllllllllllIllIlllIllIIIlIIllII = (int)(this.size - llllllllllllIllIlllIllIIIlIIlIll);
            }
            llllllllllllIllIlllIllIIIlIIlIll += llllllllllllIllIlllIllIIIlIIlllI.transferTo(llllllllllllIllIlllIllIIIlIIlIll, llllllllllllIllIlllIllIIIlIIllII, llllllllllllIllIlllIllIIIlIIllIl);
            "".length();
            if (null != null) {
                return ((0xA ^ 0xE ^ (0x92 ^ 0x8F)) & (0xB3 ^ 0x9F ^ (0x95 ^ 0xA0) ^ -" ".length())) != 0x0;
            }
        }
        llllllllllllIllIlllIllIIIlIIlllI.close();
        llllllllllllIllIlllIllIIIlIIllIl.close();
        if (lIIlIIIIIIllIIlI(lIIlIIIIIIllIlll(llllllllllllIllIlllIllIIIlIIlIll, this.size))) {
            this.file.delete();
            "".length();
            this.file = llllllllllllIllIlllIllIIIlIIlIIl;
            this.isRenamed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
            return AbstractDiskHttpData.llIIllllIIllll[2] != 0;
        }
        llllllllllllIllIlllIllIIIlIIlIIl.delete();
        "".length();
        return AbstractDiskHttpData.llIIllllIIllll[1] != 0;
    }
    
    private static boolean lIIlIIIIIIllIIlI(final int llllllllllllIllIlllIlIlllllIIlll) {
        return llllllllllllIllIlllIlIlllllIIlll == 0;
    }
    
    private static int lIIlIIIIIIllIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public String getString() throws IOException {
        return this.getString(HttpConstants.DEFAULT_CHARSET);
    }
    
    private static boolean lIIlIIIIIIllIIIl(final int llllllllllllIllIlllIlIlllllIIlIl) {
        return llllllllllllIllIlllIlIlllllIIlIl < 0;
    }
    
    @Override
    public File getFile() throws IOException {
        return this.file;
    }
    
    protected abstract boolean deleteOnExit();
    
    private static String lIIlIIIIIIlIIIIl(String llllllllllllIllIlllIlIllllllllll, final String llllllllllllIllIlllIlIlllllllllI) {
        llllllllllllIllIlllIlIllllllllll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIlIllllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIllIIIIIIIIlI = new StringBuilder();
        final char[] llllllllllllIllIlllIllIIIIIIIIIl = llllllllllllIllIlllIlIlllllllllI.toCharArray();
        int llllllllllllIllIlllIllIIIIIIIIII = AbstractDiskHttpData.llIIllllIIllll[1];
        final Exception llllllllllllIllIlllIlIlllllllIlI = (Object)((String)llllllllllllIllIlllIlIllllllllll).toCharArray();
        final double llllllllllllIllIlllIlIlllllllIIl = llllllllllllIllIlllIlIlllllllIlI.length;
        long llllllllllllIllIlllIlIlllllllIII = AbstractDiskHttpData.llIIllllIIllll[1];
        while (lIIlIIIIIIllIlIl((int)llllllllllllIllIlllIlIlllllllIII, (int)llllllllllllIllIlllIlIlllllllIIl)) {
            final char llllllllllllIllIlllIllIIIIIIIlIl = llllllllllllIllIlllIlIlllllllIlI[llllllllllllIllIlllIlIlllllllIII];
            llllllllllllIllIlllIllIIIIIIIIlI.append((char)(llllllllllllIllIlllIllIIIIIIIlIl ^ llllllllllllIllIlllIllIIIIIIIIIl[llllllllllllIllIlllIllIIIIIIIIII % llllllllllllIllIlllIllIIIIIIIIIl.length]));
            "".length();
            ++llllllllllllIllIlllIllIIIIIIIIII;
            ++llllllllllllIllIlllIlIlllllllIII;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIllIIIIIIIIlI);
    }
    
    @Override
    public ByteBuf getByteBuf() throws IOException {
        if (lIIlIIIIIIlIllIl(this.file)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final byte[] llllllllllllIllIlllIllIIIllllIlI = readFrom(this.file);
        return Unpooled.wrappedBuffer(llllllllllllIllIlllIllIIIllllIlI);
    }
    
    @Override
    public void addContent(final ByteBuf llllllllllllIllIlllIllIIlIlIlllI, final boolean llllllllllllIllIlllIllIIlIlIllIl) throws IOException {
        if (lIIlIIIIIIlIllII(llllllllllllIllIlllIllIIlIlIlllI)) {
            try {
                final int llllllllllllIllIlllIllIIlIllIIll = llllllllllllIllIlllIllIIlIlIlllI.readableBytes();
                if (lIIlIIIIIIllIIII(lIIlIIIIIIllIIll(this.definedSize, 0L)) && lIIlIIIIIIllIIIl(lIIlIIIIIIllIIll(this.definedSize, this.size + llllllllllllIllIlllIllIIlIllIIll))) {
                    throw new IOException(String.valueOf(new StringBuilder().append(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[4]]).append(this.size + llllllllllllIllIlllIllIIlIllIIll).append(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[5]]).append(this.definedSize)));
                }
                ByteBuffer byteBuffer;
                if (lIIlIIIIIIllIlII(llllllllllllIllIlllIllIIlIlIlllI.nioBufferCount(), AbstractDiskHttpData.llIIllllIIllll[2])) {
                    byteBuffer = llllllllllllIllIlllIllIIlIlIlllI.nioBuffer();
                    "".length();
                    if ((0x5A ^ 0x5F) <= 0) {
                        return;
                    }
                }
                else {
                    byteBuffer = llllllllllllIllIlllIllIIlIlIlllI.copy().nioBuffer();
                }
                final ByteBuffer llllllllllllIllIlllIllIIlIllIIlI = byteBuffer;
                int llllllllllllIllIlllIllIIlIllIIIl = AbstractDiskHttpData.llIIllllIIllll[1];
                if (lIIlIIIIIIlIllIl(this.file)) {
                    this.file = this.tempFile();
                }
                if (lIIlIIIIIIlIllIl(this.fileChannel)) {
                    final FileOutputStream llllllllllllIllIlllIllIIlIllIlII = new FileOutputStream(this.file);
                    this.fileChannel = llllllllllllIllIlllIllIIlIllIlII.getChannel();
                }
                while (lIIlIIIIIIllIlIl(llllllllllllIllIlllIllIIlIllIIIl, llllllllllllIllIlllIllIIlIllIIll)) {
                    llllllllllllIllIlllIllIIlIllIIIl += this.fileChannel.write(llllllllllllIllIlllIllIIlIllIIlI);
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                this.size += llllllllllllIllIlllIllIIlIllIIll;
                llllllllllllIllIlllIllIIlIlIlllI.readerIndex(llllllllllllIllIlllIllIIlIlIlllI.readerIndex() + llllllllllllIllIlllIllIIlIllIIIl);
                "".length();
                llllllllllllIllIlllIllIIlIlIlllI.release();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            finally {
                llllllllllllIllIlllIllIIlIlIlllI.release();
                "".length();
            }
        }
        if (lIIlIIIIIIlIlllI(llllllllllllIllIlllIllIIlIlIllIl ? 1 : 0)) {
            if (lIIlIIIIIIlIllIl(this.file)) {
                this.file = this.tempFile();
            }
            if (lIIlIIIIIIlIllIl(this.fileChannel)) {
                final FileOutputStream llllllllllllIllIlllIllIIlIllIIII = new FileOutputStream(this.file);
                this.fileChannel = llllllllllllIllIlllIllIIlIllIIII.getChannel();
            }
            this.fileChannel.force((boolean)(AbstractDiskHttpData.llIIllllIIllll[1] != 0));
            this.fileChannel.close();
            this.fileChannel = null;
            this.completed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
            "".length();
            if (((80 + 136 - 192 + 163 ^ 153 + 55 - 97 + 67) & (0xA3 ^ 0x95 ^ (0x5E ^ 0x61) ^ -" ".length())) >= " ".length()) {
                return;
            }
        }
        else if (lIIlIIIIIIlIllIl(llllllllllllIllIlllIllIIlIlIlllI)) {
            throw new NullPointerException(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[6]]);
        }
    }
    
    private static void lIIlIIIIIIlIIIll() {
        (llIIllllIIlIlI = new String[AbstractDiskHttpData.llIIllllIIllll[18]])[AbstractDiskHttpData.llIIllllIIllll[1]] = lIIlIIIIIIlIIIII("0Gfh4GqQ0oI=", "xsPKs");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[2]] = lIIlIIIIIIlIIIIl("NR8cVQgcShscHR9QSA==", "zjhug");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[3]] = lIIlIIIIIIlIIIlI("IBHnNx0Owx8=", "BiBOj");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[4]] = lIIlIIIIIIlIIIIl("PiU8ax4XcDsiCxRqaA==", "qPHKq");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[5]] = lIIlIIIIIIlIIIIl("SlVw", "jkPWO");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[6]] = lIIlIIIIIIlIIIII("NtDlsOeyVMI=", "kAgFw");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[7]] = lIIlIIIIIIlIIIIl("BD8UMBo+JRYgDwA=", "mQdEn");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[9]] = lIIlIIIIIIlIIIIl("Oj04bj4TaD8nKxBybA==", "uHLNQ");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[10]] = lIIlIIIIIIlIIIII("rOc8UM/oCD0=", "Pjdee");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[11]] = lIIlIIIIIIlIIIlI("2/GwrZTkabk63iUHMbgvkBrp5bNSbDCU", "QjHnN");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[13]] = lIIlIIIIIIlIIIIl("", "bIzaZ");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[14]] = lIIlIIIIIIlIIIIl("EAsYEQ==", "tnkeW");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[15]] = lIIlIIIIIIlIIIlI("keQ3UPTvGj51yITdezrbwShznFFR33z/mKGtJvcnvPIyzyZuwhpm+w==", "nCaQa");
        AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[17]] = lIIlIIIIIIlIIIlI("3KD+s03dM9Wg5anbieMk0islh0rZbIRHUIzv1oY7ZzhoPdNjO3VuBQ==", "wjcJr");
    }
    
    private static boolean lIIlIIIIIIllIlIl(final int llllllllllllIllIlllIlIllllllIIII, final int llllllllllllIllIlllIlIlllllIllll) {
        return llllllllllllIllIlllIlIllllllIIII < llllllllllllIllIlllIlIlllllIllll;
    }
    
    protected abstract String getDiskFilename();
    
    protected abstract String getBaseDirectory();
    
    private static boolean lIIlIIIIIIlIllIl(final Object llllllllllllIllIlllIlIlllllIlIll) {
        return llllllllllllIllIlllIlIlllllIlIll == null;
    }
    
    private static int lIIlIIIIIIllIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public boolean isInMemory() {
        return AbstractDiskHttpData.llIIllllIIllll[1] != 0;
    }
    
    @Override
    public void delete() {
        if (lIIlIIIIIIlIllII(this.fileChannel)) {
            try {
                this.fileChannel.force((boolean)(AbstractDiskHttpData.llIIllllIIllll[1] != 0));
                this.fileChannel.close();
                "".length();
                if (" ".length() == -" ".length()) {
                    return;
                }
            }
            catch (IOException llllllllllllIllIlllIllIIlIIIIlII) {
                AbstractDiskHttpData.logger.warn(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[11]], llllllllllllIllIlllIllIIlIIIIlII);
            }
            this.fileChannel = null;
        }
        if (lIIlIIIIIIllIIlI(this.isRenamed ? 1 : 0)) {
            if (lIIlIIIIIIlIllII(this.file) && lIIlIIIIIIlIlllI(this.file.exists() ? 1 : 0)) {
                this.file.delete();
                "".length();
            }
            this.file = null;
        }
    }
    
    private static boolean lIIlIIIIIIllIlII(final int llllllllllllIllIlllIlIllllllIlII, final int llllllllllllIllIlllIlIllllllIIll) {
        return llllllllllllIllIlllIlIllllllIlII == llllllllllllIllIlllIlIllllllIIll;
    }
    
    private static boolean lIIlIIIIIIlIllII(final Object llllllllllllIllIlllIlIlllllIllIl) {
        return llllllllllllIllIlllIlIlllllIllIl != null;
    }
    
    @Override
    public void setContent(final File llllllllllllIllIlllIllIIlIlIIIIl) throws IOException {
        if (lIIlIIIIIIlIllII(this.file)) {
            this.delete();
        }
        this.file = llllllllllllIllIlllIllIIlIlIIIIl;
        this.size = llllllllllllIllIlllIllIIlIlIIIIl.length();
        this.isRenamed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
        this.completed = (AbstractDiskHttpData.llIIllllIIllll[2] != 0);
    }
    
    @Override
    public ByteBuf getChunk(final int llllllllllllIllIlllIllIIIllIlIlI) throws IOException {
        if (!lIIlIIIIIIlIllII(this.file) || lIIlIIIIIIllIIlI(llllllllllllIllIlllIllIIIllIlIlI)) {
            return Unpooled.EMPTY_BUFFER;
        }
        if (lIIlIIIIIIlIllIl(this.fileChannel)) {
            final FileInputStream llllllllllllIllIlllIllIIIlllIIlI = new FileInputStream(this.file);
            this.fileChannel = llllllllllllIllIlllIllIIIlllIIlI.getChannel();
        }
        int llllllllllllIllIlllIllIIIllIlllI = AbstractDiskHttpData.llIIllllIIllll[1];
        final ByteBuffer llllllllllllIllIlllIllIIIllIllIl = ByteBuffer.allocate(llllllllllllIllIlllIllIIIllIlIlI);
        while (lIIlIIIIIIllIlIl(llllllllllllIllIlllIllIIIllIlllI, llllllllllllIllIlllIllIIIllIlIlI)) {
            final int llllllllllllIllIlllIllIIIlllIIIl = this.fileChannel.read(llllllllllllIllIlllIllIIIllIllIl);
            if (lIIlIIIIIIllIlII(llllllllllllIllIlllIllIIIlllIIIl, AbstractDiskHttpData.llIIllllIIllll[12])) {
                this.fileChannel.close();
                this.fileChannel = null;
                "".length();
                if (((0x94 ^ 0xA2) & ~(0x32 ^ 0x4)) != 0x0) {
                    return null;
                }
                break;
            }
            else {
                llllllllllllIllIlllIllIIIllIlllI += llllllllllllIllIlllIllIIIlllIIIl;
                "".length();
                if ("   ".length() <= ((0xA1 ^ 0x81) & ~(0x33 ^ 0x13))) {
                    return null;
                }
                continue;
            }
        }
        if (lIIlIIIIIIllIIlI(llllllllllllIllIlllIllIIIllIlllI)) {
            return Unpooled.EMPTY_BUFFER;
        }
        llllllllllllIllIlllIllIIIllIllIl.flip();
        "".length();
        final ByteBuf llllllllllllIllIlllIllIIIllIllII = Unpooled.wrappedBuffer(llllllllllllIllIlllIllIIIllIllIl);
        llllllllllllIllIlllIllIIIllIllII.readerIndex(AbstractDiskHttpData.llIIllllIIllll[1]);
        "".length();
        llllllllllllIllIlllIllIIIllIllII.writerIndex(llllllllllllIllIlllIllIIIllIlllI);
        "".length();
        return llllllllllllIllIlllIllIIIllIllII;
    }
    
    static {
        lIIlIIIIIIlIlIll();
        lIIlIIIIIIlIIIll();
        logger = InternalLoggerFactory.getInstance(AbstractDiskHttpData.class);
    }
    
    protected abstract String getPostfix();
    
    protected AbstractDiskHttpData(final String llllllllllllIllIlllIllIIlllIIlIl, final Charset llllllllllllIllIlllIllIIlllIIlII, final long llllllllllllIllIlllIllIIlllIIIll) {
        super(llllllllllllIllIlllIllIIlllIIlIl, llllllllllllIllIlllIllIIlllIIlII, llllllllllllIllIlllIllIIlllIIIll);
    }
    
    private static byte[] readFrom(final File llllllllllllIllIlllIllIIIIlllIIl) throws IOException {
        final long llllllllllllIllIlllIllIIIIlllIII = llllllllllllIllIlllIllIIIIlllIIl.length();
        if (lIIlIIIIIIllIIII(lIIlIIIIIIlllIII(llllllllllllIllIlllIllIIIIlllIII, 2147483647L))) {
            throw new IllegalArgumentException(AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[17]]);
        }
        final FileInputStream llllllllllllIllIlllIllIIIIllIlll = new FileInputStream(llllllllllllIllIlllIllIIIIlllIIl);
        final FileChannel llllllllllllIllIlllIllIIIIllIllI = llllllllllllIllIlllIllIIIIllIlll.getChannel();
        final byte[] llllllllllllIllIlllIllIIIIllIlIl = new byte[(int)llllllllllllIllIlllIllIIIIlllIII];
        final ByteBuffer llllllllllllIllIlllIllIIIIllIlII = ByteBuffer.wrap(llllllllllllIllIlllIllIIIIllIlIl);
        int llllllllllllIllIlllIllIIIIllIIll = AbstractDiskHttpData.llIIllllIIllll[1];
        while (lIIlIIIIIIllIIIl(lIIlIIIIIIlllIII(llllllllllllIllIlllIllIIIIllIIll, llllllllllllIllIlllIllIIIIlllIII))) {
            llllllllllllIllIlllIllIIIIllIIll += llllllllllllIllIlllIllIIIIllIllI.read(llllllllllllIllIlllIllIIIIllIlII);
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        llllllllllllIllIlllIllIIIIllIllI.close();
        return llllllllllllIllIlllIllIIIIllIlIl;
    }
    
    @Override
    public String getString(final Charset llllllllllllIllIlllIllIIIlIllllI) throws IOException {
        if (lIIlIIIIIIlIllIl(this.file)) {
            return AbstractDiskHttpData.llIIllllIIlIlI[AbstractDiskHttpData.llIIllllIIllll[13]];
        }
        if (lIIlIIIIIIlIllIl(llllllllllllIllIlllIllIIIlIllllI)) {
            final byte[] llllllllllllIllIlllIllIIIllIIIII = readFrom(this.file);
            return new String(llllllllllllIllIlllIllIIIllIIIII, HttpConstants.DEFAULT_CHARSET.name());
        }
        final byte[] llllllllllllIllIlllIllIIIlIlllIl = readFrom(this.file);
        return new String(llllllllllllIllIlllIllIIIlIlllIl, llllllllllllIllIlllIllIIIlIllllI.name());
    }
    
    protected abstract String getPrefix();
    
    private static boolean lIIlIIIIIIllIIII(final int llllllllllllIllIlllIlIlllllIIIll) {
        return llllllllllllIllIlllIlIlllllIIIll > 0;
    }
    
    private static String lIIlIIIIIIlIIIlI(final String llllllllllllIllIlllIllIIIIIlIlII, final String llllllllllllIllIlllIllIIIIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlllIllIIIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIllIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIllIIIIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIllIIIIIlIllI.init(AbstractDiskHttpData.llIIllllIIllll[3], llllllllllllIllIlllIllIIIIIlIlll);
            return new String(llllllllllllIllIlllIllIIIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIllIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIllIIIIIlIlIl) {
            llllllllllllIllIlllIllIIIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIIIIlIlIll() {
        (llIIllllIIllll = new int[19])[0] = (0x9B ^ 0x81 ^ (0x19 ^ 0x5C));
        AbstractDiskHttpData.llIIllllIIllll[1] = ((31 + 82 + 66 + 18 ^ 128 + 44 - 72 + 43) & (0x2B ^ 0x42 ^ (0x15 ^ 0x36) ^ -" ".length()));
        AbstractDiskHttpData.llIIllllIIllll[2] = " ".length();
        AbstractDiskHttpData.llIIllllIIllll[3] = "  ".length();
        AbstractDiskHttpData.llIIllllIIllll[4] = "   ".length();
        AbstractDiskHttpData.llIIllllIIllll[5] = (0x6A ^ 0x6E);
        AbstractDiskHttpData.llIIllllIIllll[6] = (0x49 ^ 0x4C);
        AbstractDiskHttpData.llIIllllIIllll[7] = (0xC7 ^ 0xC1);
        AbstractDiskHttpData.llIIllllIIllll[8] = (-(0xFFFFEEB9 & 0x3DFE) & (0xFFFFEFB7 & 0x7CFF));
        AbstractDiskHttpData.llIIllllIIllll[9] = (0xC3 ^ 0xC4);
        AbstractDiskHttpData.llIIllllIIllll[10] = (0xDE ^ 0xA3 ^ (0xF8 ^ 0x8D));
        AbstractDiskHttpData.llIIllllIIllll[11] = (16 + 73 - 88 + 144 ^ 62 + 23 - 4 + 71);
        AbstractDiskHttpData.llIIllllIIllll[12] = -" ".length();
        AbstractDiskHttpData.llIIllllIIllll[13] = (0x38 ^ 0x32);
        AbstractDiskHttpData.llIIllllIIllll[14] = (0x75 ^ 0x7E);
        AbstractDiskHttpData.llIIllllIIllll[15] = (79 + 25 - 63 + 142 ^ 132 + 171 - 155 + 39);
        AbstractDiskHttpData.llIIllllIIllll[16] = (0xFFFFBB0F & 0x64F4);
        AbstractDiskHttpData.llIIllllIIllll[17] = (0x4F ^ 0x22 ^ (0xFA ^ 0x9A));
        AbstractDiskHttpData.llIIllllIIllll[18] = (0x37 ^ 0x39);
    }
}
