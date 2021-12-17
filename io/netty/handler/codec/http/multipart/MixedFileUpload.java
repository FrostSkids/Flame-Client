// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import io.netty.buffer.ByteBufHolder;
import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBuf;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class MixedFileUpload implements FileUpload
{
    private final /* synthetic */ long definedSize;
    private static final /* synthetic */ int[] lIIIIlllIllllI;
    private static final /* synthetic */ String[] lIIIIlllIlllII;
    private final /* synthetic */ long limitSize;
    private /* synthetic */ FileUpload fileUpload;
    
    private static String lIllllIIlllIIlI(final String lllllllllllllIlIIIllllIIIlllIIll, final String lllllllllllllIlIIIllllIIIlllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllllIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), MixedFileUpload.lIIIIlllIllllI[2]), "DES");
            final Cipher lllllllllllllIlIIIllllIIIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIllllIIIlllIlIl.init(MixedFileUpload.lIIIIlllIllllI[3], lllllllllllllIlIIIllllIIIlllIllI);
            return new String(lllllllllllllIlIIIllllIIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllllIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllllIIIlllIlII) {
            lllllllllllllIlIIIllllIIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean renameTo(final File lllllllllllllIlIIIllllIlIIIlIIIl) throws IOException {
        return this.fileUpload.renameTo(lllllllllllllIlIIIllllIlIIIlIIIl);
    }
    
    @Override
    public void setContent(final InputStream lllllllllllllIlIIIllllIIllllIIll) throws IOException {
        if (lIllllIIlllllIl((this.fileUpload instanceof MemoryFileUpload) ? 1 : 0)) {
            final FileUpload lllllllllllllIlIIIllllIIllllIlIl = this.fileUpload;
            this.fileUpload = new DiskFileUpload(this.fileUpload.getName(), this.fileUpload.getFilename(), this.fileUpload.getContentType(), this.fileUpload.getContentTransferEncoding(), this.fileUpload.getCharset(), this.definedSize);
            lllllllllllllIlIIIllllIIllllIlIl.release();
            "".length();
        }
        this.fileUpload.setContent(lllllllllllllIlIIIllllIIllllIIll);
    }
    
    @Override
    public byte[] get() throws IOException {
        return this.fileUpload.get();
    }
    
    private static int lIllllIIlllllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIllllIIllllllI(final Object lllllllllllllIlIIIllllIIIllIllII) {
        return lllllllllllllIlIIIllllIIIllIllII != null;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(MixedFileUpload.lIIIIlllIlllII[MixedFileUpload.lIIIIlllIllllI[0]]).append(this.fileUpload.toString()));
    }
    
    @Override
    public String getName() {
        return this.fileUpload.getName();
    }
    
    @Override
    public FileUpload copy() {
        return this.fileUpload.copy();
    }
    
    private static int lIllllIIllllIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void delete() {
        this.fileUpload.delete();
    }
    
    @Override
    public void setContent(final File lllllllllllllIlIIIllllIIllllllII) throws IOException {
        if (lIllllIIllllIll(lIllllIlIIIIIII(lllllllllllllIlIIIllllIIllllllII.length(), this.limitSize)) && lIllllIIlllllIl((this.fileUpload instanceof MemoryFileUpload) ? 1 : 0)) {
            final FileUpload lllllllllllllIlIIIllllIIlllllllI = this.fileUpload;
            this.fileUpload = new DiskFileUpload(lllllllllllllIlIIIllllIIlllllllI.getName(), lllllllllllllIlIIIllllIIlllllllI.getFilename(), lllllllllllllIlIIIllllIIlllllllI.getContentType(), lllllllllllllIlIIIllllIIlllllllI.getContentTransferEncoding(), lllllllllllllIlIIIllllIIlllllllI.getCharset(), this.definedSize);
            lllllllllllllIlIIIllllIIlllllllI.release();
            "".length();
        }
        this.fileUpload.setContent(lllllllllllllIlIIIllllIIllllllII);
    }
    
    private static void lIllllIIllllIIl() {
        (lIIIIlllIllllI = new int[4])[0] = ((0x7C ^ 0x1C) & ~(0x63 ^ 0x3));
        MixedFileUpload.lIIIIlllIllllI[1] = " ".length();
        MixedFileUpload.lIIIIlllIllllI[2] = (0xB1 ^ 0x95 ^ (0x4 ^ 0x28));
        MixedFileUpload.lIIIIlllIllllI[3] = "  ".length();
    }
    
    @Override
    public int compareTo(final InterfaceHttpData lllllllllllllIlIIIllllIIllIlIlII) {
        return this.fileUpload.compareTo(lllllllllllllIlIIIllllIIllIlIlII);
    }
    
    private static void lIllllIIlllIlII() {
        (lIIIIlllIlllII = new String[MixedFileUpload.lIIIIlllIllllI[1]])[MixedFileUpload.lIIIIlllIllllI[0]] = lIllllIIlllIIlI("0bkyDHr6Ew8=", "QWNRY");
    }
    
    @Override
    public void setFilename(final String lllllllllllllIlIIIllllIIllIllllI) {
        this.fileUpload.setFilename(lllllllllllllIlIIIllllIIllIllllI);
    }
    
    @Override
    public FileUpload retain(final int lllllllllllllIlIIIllllIIlIllIIIl) {
        this.fileUpload.retain(lllllllllllllIlIIIllllIIlIllIIIl);
        "".length();
        return this;
    }
    
    @Override
    public void setCharset(final Charset lllllllllllllIlIIIllllIlIIIIlIll) {
        this.fileUpload.setCharset(lllllllllllllIlIIIllllIlIIIIlIll);
    }
    
    @Override
    public ByteBuf content() {
        return this.fileUpload.content();
    }
    
    @Override
    public boolean release() {
        return this.fileUpload.release();
    }
    
    @Override
    public String getFilename() {
        return this.fileUpload.getFilename();
    }
    
    @Override
    public boolean isInMemory() {
        return this.fileUpload.isInMemory();
    }
    
    @Override
    public void setContentTransferEncoding(final String lllllllllllllIlIIIllllIIlllIIllI) {
        this.fileUpload.setContentTransferEncoding(lllllllllllllIlIIIllllIIlllIIllI);
    }
    
    @Override
    public String getString() throws IOException {
        return this.fileUpload.getString();
    }
    
    @Override
    public void addContent(final ByteBuf lllllllllllllIlIIIllllIlIlIIIlII, final boolean lllllllllllllIlIIIllllIlIlIIIIll) throws IOException {
        if (lIllllIIlllllIl((this.fileUpload instanceof MemoryFileUpload) ? 1 : 0) && lIllllIIllllIll(lIllllIIlllllII(this.fileUpload.length() + lllllllllllllIlIIIllllIlIlIIIlII.readableBytes(), this.limitSize))) {
            final DiskFileUpload lllllllllllllIlIIIllllIlIlIIIlll = new DiskFileUpload(this.fileUpload.getName(), this.fileUpload.getFilename(), this.fileUpload.getContentType(), this.fileUpload.getContentTransferEncoding(), this.fileUpload.getCharset(), this.definedSize);
            final ByteBuf lllllllllllllIlIIIllllIlIlIIIllI = this.fileUpload.getByteBuf();
            if (lIllllIIllllllI(lllllllllllllIlIIIllllIlIlIIIllI) && lIllllIIlllllIl(lllllllllllllIlIIIllllIlIlIIIllI.isReadable() ? 1 : 0)) {
                lllllllllllllIlIIIllllIlIlIIIlll.addContent(lllllllllllllIlIIIllllIlIlIIIllI.retain(), (boolean)(MixedFileUpload.lIIIIlllIllllI[0] != 0));
            }
            this.fileUpload.release();
            "".length();
            this.fileUpload = lllllllllllllIlIIIllllIlIlIIIlll;
        }
        this.fileUpload.addContent(lllllllllllllIlIIIllllIlIlIIIlII, lllllllllllllIlIIIllllIlIlIIIIll);
    }
    
    @Override
    public void setContent(final ByteBuf lllllllllllllIlIIIllllIlIIIIIlIl) throws IOException {
        if (lIllllIIllllIll(lIllllIIlllllll(lllllllllllllIlIIIllllIlIIIIIlIl.readableBytes(), this.limitSize)) && lIllllIIlllllIl((this.fileUpload instanceof MemoryFileUpload) ? 1 : 0)) {
            final FileUpload lllllllllllllIlIIIllllIlIIIIIlll = this.fileUpload;
            this.fileUpload = new DiskFileUpload(lllllllllllllIlIIIllllIlIIIIIlll.getName(), lllllllllllllIlIIIllllIlIIIIIlll.getFilename(), lllllllllllllIlIIIllllIlIIIIIlll.getContentType(), lllllllllllllIlIIIllllIlIIIIIlll.getContentTransferEncoding(), lllllllllllllIlIIIllllIlIIIIIlll.getCharset(), this.definedSize);
            lllllllllllllIlIIIllllIlIIIIIlll.release();
            "".length();
        }
        this.fileUpload.setContent(lllllllllllllIlIIIllllIlIIIIIlIl);
    }
    
    private static boolean lIllllIIllllIll(final int lllllllllllllIlIIIllllIIIllIlIII) {
        return lllllllllllllIlIIIllllIIIllIlIII > 0;
    }
    
    @Override
    public boolean release(final int lllllllllllllIlIIIllllIIlIlIlIlI) {
        return this.fileUpload.release(lllllllllllllIlIIIllllIIlIlIlIlI);
    }
    
    @Override
    public String getContentTransferEncoding() {
        return this.fileUpload.getContentTransferEncoding();
    }
    
    public MixedFileUpload(final String lllllllllllllIlIIIllllIlIlIllIll, final String lllllllllllllIlIIIllllIlIlIllIlI, final String lllllllllllllIlIIIllllIlIlIllIIl, final String lllllllllllllIlIIIllllIlIlIllIII, final Charset lllllllllllllIlIIIllllIlIlIlIlll, final long lllllllllllllIlIIIllllIlIlIlIllI, final long lllllllllllllIlIIIllllIlIlIlIlIl) {
        this.limitSize = lllllllllllllIlIIIllllIlIlIlIlIl;
        if (lIllllIIllllIll(lIllllIIllllIlI(lllllllllllllIlIIIllllIlIlIlIllI, this.limitSize))) {
            this.fileUpload = new DiskFileUpload(lllllllllllllIlIIIllllIlIlIllIll, lllllllllllllIlIIIllllIlIlIllIlI, lllllllllllllIlIIIllllIlIlIllIIl, lllllllllllllIlIIIllllIlIlIllIII, lllllllllllllIlIIIllllIlIlIlIlll, lllllllllllllIlIIIllllIlIlIlIllI);
            "".length();
            if ((0x16 ^ 0x12) <= 0) {
                throw null;
            }
        }
        else {
            this.fileUpload = new MemoryFileUpload(lllllllllllllIlIIIllllIlIlIllIll, lllllllllllllIlIIIllllIlIlIllIlI, lllllllllllllIlIIIllllIlIlIllIIl, lllllllllllllIlIIIllllIlIlIllIII, lllllllllllllIlIIIllllIlIlIlIlll, lllllllllllllIlIIIllllIlIlIlIllI);
        }
        this.definedSize = lllllllllllllIlIIIllllIlIlIlIllI;
    }
    
    @Override
    public String getContentType() {
        return this.fileUpload.getContentType();
    }
    
    @Override
    public boolean isCompleted() {
        return this.fileUpload.isCompleted();
    }
    
    @Override
    public ByteBuf getChunk(final int lllllllllllllIlIIIllllIIllIIlIIl) throws IOException {
        return this.fileUpload.getChunk(lllllllllllllIlIIIllllIIllIIlIIl);
    }
    
    @Override
    public InterfaceHttpData.HttpDataType getHttpDataType() {
        return this.fileUpload.getHttpDataType();
    }
    
    private static int lIllllIlIIIIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lIllllIIllllIIl();
        lIllllIIlllIlII();
    }
    
    @Override
    public FileUpload duplicate() {
        return this.fileUpload.duplicate();
    }
    
    @Override
    public int refCnt() {
        return this.fileUpload.refCnt();
    }
    
    @Override
    public void setContentType(final String lllllllllllllIlIIIllllIIlllIllII) {
        this.fileUpload.setContentType(lllllllllllllIlIIIllllIIlllIllII);
    }
    
    @Override
    public File getFile() throws IOException {
        return this.fileUpload.getFile();
    }
    
    private static boolean lIllllIIlllllIl(final int lllllllllllllIlIIIllllIIIllIlIlI) {
        return lllllllllllllIlIIIllllIIIllIlIlI != 0;
    }
    
    @Override
    public String getString(final Charset lllllllllllllIlIIIllllIlIIlIIIlI) throws IOException {
        return this.fileUpload.getString(lllllllllllllIlIIIllllIlIIlIIIlI);
    }
    
    @Override
    public long length() {
        return this.fileUpload.length();
    }
    
    @Override
    public FileUpload retain() {
        this.fileUpload.retain();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getByteBuf() throws IOException {
        return this.fileUpload.getByteBuf();
    }
    
    @Override
    public Charset getCharset() {
        return this.fileUpload.getCharset();
    }
    
    private static int lIllllIIlllllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
}
