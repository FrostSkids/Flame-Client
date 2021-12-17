// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;
import java.nio.charset.Charset;
import java.io.InputStream;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;
import java.io.File;
import java.io.IOException;

public class MixedAttribute implements Attribute
{
    private static final /* synthetic */ String[] lllIllllIlIIII;
    private final /* synthetic */ long limitSize;
    private /* synthetic */ Attribute attribute;
    private static final /* synthetic */ int[] lllIllllIlIIll;
    
    @Override
    public int compareTo(final InterfaceHttpData llllllllllllIlIlIllllllIlllIlIll) {
        return this.attribute.compareTo(llllllllllllIlIlIllllllIlllIlIll);
    }
    
    @Override
    public boolean isCompleted() {
        return this.attribute.isCompleted();
    }
    
    static {
        lIlIIllIIIIIIIll();
        lIlIIllIIIIIIIIl();
    }
    
    @Override
    public String getString() throws IOException {
        return this.attribute.getString();
    }
    
    @Override
    public void setContent(final File llllllllllllIlIlIllllllIllllllll) throws IOException {
        if (lIlIIllIIIIIIlIl(lIlIIllIIIIIllII(llllllllllllIlIlIllllllIllllllll.length(), this.limitSize)) && lIlIIllIIIIIIlll((this.attribute instanceof MemoryAttribute) ? 1 : 0)) {
            this.attribute = new DiskAttribute(this.attribute.getName());
        }
        this.attribute.setContent(llllllllllllIlIlIllllllIllllllll);
    }
    
    private static int lIlIIllIIIIIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public ByteBuf content() {
        return this.attribute.content();
    }
    
    @Override
    public long length() {
        return this.attribute.length();
    }
    
    @Override
    public void setContent(final InputStream llllllllllllIlIlIllllllIllllIlll) throws IOException {
        if (lIlIIllIIIIIIlll((this.attribute instanceof MemoryAttribute) ? 1 : 0)) {
            this.attribute = new DiskAttribute(this.attribute.getName());
        }
        this.attribute.setContent(llllllllllllIlIlIllllllIllllIlll);
    }
    
    @Override
    public void setValue(final String llllllllllllIlIlIllllllIlllIIIIl) throws IOException {
        this.attribute.setValue(llllllllllllIlIlIllllllIlllIIIIl);
    }
    
    @Override
    public Charset getCharset() {
        return this.attribute.getCharset();
    }
    
    @Override
    public Attribute copy() {
        return this.attribute.copy();
    }
    
    @Override
    public ByteBuf getByteBuf() throws IOException {
        return this.attribute.getByteBuf();
    }
    
    public MixedAttribute(final String llllllllllllIlIlIllllllllIIlIllI, final long llllllllllllIlIlIllllllllIIlIlII) {
        this.limitSize = llllllllllllIlIlIllllllllIIlIlII;
        this.attribute = new MemoryAttribute(llllllllllllIlIlIllllllllIIlIllI);
    }
    
    @Override
    public InterfaceHttpData.HttpDataType getHttpDataType() {
        return this.attribute.getHttpDataType();
    }
    
    private static int lIlIIllIIIIIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public boolean renameTo(final File llllllllllllIlIlIlllllllIIIlIllI) throws IOException {
        return this.attribute.renameTo(llllllllllllIlIlIlllllllIIIlIllI);
    }
    
    @Override
    public Attribute retain() {
        this.attribute.retain();
        "".length();
        return this;
    }
    
    private static int lIlIIllIIIIIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public ByteBuf getChunk(final int llllllllllllIlIlIllllllIllIllIll) throws IOException {
        return this.attribute.getChunk(llllllllllllIlIlIllllllIllIllIll);
    }
    
    private static String lIlIIllIIIIIIIII(final String llllllllllllIlIlIllllllIlIIIIIIl, final String llllllllllllIlIlIllllllIlIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIlIllllllIlIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlIllllllIlIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlIllllllIlIIIIlIl.init(MixedAttribute.lllIllllIlIIll[2], llllllllllllIlIlIllllllIlIIIIllI);
            return new String(llllllllllllIlIlIllllllIlIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllllIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIllllllIlIIIIlII) {
            llllllllllllIlIlIllllllIlIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIllIIIIIIIIl() {
        (lllIllllIlIIII = new String[MixedAttribute.lllIllllIlIIll[1]])[MixedAttribute.lllIllllIlIIll[0]] = lIlIIllIIIIIIIII("mZikilt7Cp8=", "Yfyms");
    }
    
    @Override
    public byte[] get() throws IOException {
        return this.attribute.get();
    }
    
    public MixedAttribute(final String llllllllllllIlIlIlllllllIlllIlIl, final String llllllllllllIlIlIlllllllIllIllIl, final long llllllllllllIlIlIlllllllIlllIIIl) {
        this.limitSize = llllllllllllIlIlIlllllllIlllIIIl;
        if (lIlIIllIIIIIIlIl(lIlIIllIIIIIIlII(llllllllllllIlIlIlllllllIllIllIl.length(), this.limitSize))) {
            try {
                this.attribute = new DiskAttribute(llllllllllllIlIlIlllllllIlllIlIl, llllllllllllIlIlIlllllllIllIllIl);
                "".length();
                if (-"   ".length() >= 0) {
                    throw null;
                }
                return;
            }
            catch (IOException llllllllllllIlIlIlllllllIllllIlI) {
                try {
                    this.attribute = new MemoryAttribute(llllllllllllIlIlIlllllllIlllIlIl, llllllllllllIlIlIlllllllIllIllIl);
                    "".length();
                    if (((0x80 ^ 0xAA ^ (0x52 ^ 0x32)) & (0x34 ^ 0x46 ^ (0x2C ^ 0x14) ^ -" ".length())) != 0x0) {
                        throw null;
                    }
                }
                catch (IOException llllllllllllIlIlIlllllllIllllIll) {
                    throw new IllegalArgumentException(llllllllllllIlIlIlllllllIllllIlI);
                }
                "".length();
                if ("   ".length() == -" ".length()) {
                    throw null;
                }
                return;
            }
        }
        try {
            this.attribute = new MemoryAttribute(llllllllllllIlIlIlllllllIlllIlIl, llllllllllllIlIlIlllllllIllIllIl);
            "".length();
            if ("   ".length() <= 0) {
                throw null;
            }
        }
        catch (IOException llllllllllllIlIlIlllllllIllllIIl) {
            throw new IllegalArgumentException(llllllllllllIlIlIlllllllIllllIIl);
        }
    }
    
    @Override
    public void setContent(final ByteBuf llllllllllllIlIlIlllllllIIIIIIll) throws IOException {
        if (lIlIIllIIIIIIlIl(lIlIIllIIIIIlIll(llllllllllllIlIlIlllllllIIIIIIll.readableBytes(), this.limitSize)) && lIlIIllIIIIIIlll((this.attribute instanceof MemoryAttribute) ? 1 : 0)) {
            this.attribute = new DiskAttribute(this.attribute.getName());
        }
        this.attribute.setContent(llllllllllllIlIlIlllllllIIIIIIll);
    }
    
    private static boolean lIlIIllIIIIIIlIl(final int llllllllllllIlIlIllllllIIllllIII) {
        return llllllllllllIlIlIllllllIIllllIII > 0;
    }
    
    @Override
    public boolean release() {
        return this.attribute.release();
    }
    
    @Override
    public String getString(final Charset llllllllllllIlIlIlllllllIIllIIIl) throws IOException {
        return this.attribute.getString(llllllllllllIlIlIlllllllIIllIIIl);
    }
    
    @Override
    public void delete() {
        this.attribute.delete();
    }
    
    @Override
    public String getName() {
        return this.attribute.getName();
    }
    
    @Override
    public void addContent(final ByteBuf llllllllllllIlIlIlllllllIlIllllI, final boolean llllllllllllIlIlIlllllllIlIllIII) throws IOException {
        if (lIlIIllIIIIIIlll((this.attribute instanceof MemoryAttribute) ? 1 : 0) && lIlIIllIIIIIIlIl(lIlIIllIIIIIIllI(this.attribute.length() + llllllllllllIlIlIlllllllIlIllllI.readableBytes(), this.limitSize))) {
            final DiskAttribute llllllllllllIlIlIlllllllIllIIIIl = new DiskAttribute(this.attribute.getName());
            if (lIlIIllIIIIIlIIl(((MemoryAttribute)this.attribute).getByteBuf())) {
                llllllllllllIlIlIlllllllIllIIIIl.addContent(((MemoryAttribute)this.attribute).getByteBuf(), (boolean)(MixedAttribute.lllIllllIlIIll[0] != 0));
            }
            this.attribute = llllllllllllIlIlIlllllllIllIIIIl;
        }
        this.attribute.addContent(llllllllllllIlIlIlllllllIlIllllI, llllllllllllIlIlIlllllllIlIllIII);
    }
    
    @Override
    public Attribute duplicate() {
        return this.attribute.duplicate();
    }
    
    @Override
    public void setCharset(final Charset llllllllllllIlIlIlllllllIIIIlIll) {
        this.attribute.setCharset(llllllllllllIlIlIlllllllIIIIlIll);
    }
    
    @Override
    public boolean release(final int llllllllllllIlIlIllllllIlIlllIII) {
        return this.attribute.release(llllllllllllIlIlIllllllIlIlllIII);
    }
    
    @Override
    public String getValue() throws IOException {
        return this.attribute.getValue();
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(MixedAttribute.lllIllllIlIIII[MixedAttribute.lllIllllIlIIll[0]]).append(this.attribute.toString()));
    }
    
    @Override
    public File getFile() throws IOException {
        return this.attribute.getFile();
    }
    
    @Override
    public int refCnt() {
        return this.attribute.refCnt();
    }
    
    private static boolean lIlIIllIIIIIlIIl(final Object llllllllllllIlIlIllllllIIlllllII) {
        return llllllllllllIlIlIllllllIIlllllII != null;
    }
    
    private static void lIlIIllIIIIIIIll() {
        (lllIllllIlIIll = new int[3])[0] = ((0x93 ^ 0xA3) & ~(0x75 ^ 0x45));
        MixedAttribute.lllIllllIlIIll[1] = " ".length();
        MixedAttribute.lllIllllIlIIll[2] = "  ".length();
    }
    
    private static boolean lIlIIllIIIIIIlll(final int llllllllllllIlIlIllllllIIllllIlI) {
        return llllllllllllIlIlIllllllIIllllIlI != 0;
    }
    
    private static int lIlIIllIIIIIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public Attribute retain(final int llllllllllllIlIlIllllllIllIIIIIl) {
        this.attribute.retain(llllllllllllIlIlIllllllIllIIIIIl);
        "".length();
        return this;
    }
    
    @Override
    public boolean isInMemory() {
        return this.attribute.isInMemory();
    }
}
