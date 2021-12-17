// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import io.netty.channel.ChannelException;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.ReferenceCounted;
import io.netty.handler.codec.http.HttpConstants;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;

public class DiskAttribute extends AbstractDiskHttpData implements Attribute
{
    private static final /* synthetic */ String[] lIllllIIIIIIIl;
    public static /* synthetic */ String baseDirectory;
    public static /* synthetic */ boolean deleteOnExitTemporaryFile;
    private static final /* synthetic */ int[] lIllllIIIIIlIl;
    
    @Override
    public String toString() {
        try {
            return String.valueOf(new StringBuilder().append(this.getName()).append((char)DiskAttribute.lIllllIIIIIlIl[3]).append(this.getValue()));
        }
        catch (IOException llllllllllllIllllIllIIlIllIlIlll) {
            return String.valueOf(new StringBuilder().append(this.getName()).append(DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[4]]));
        }
    }
    
    @Override
    protected String getPostfix() {
        return DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[6]];
    }
    
    @Override
    protected String getPrefix() {
        return DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[7]];
    }
    
    private static void lIIIIIlllIlIlIII() {
        (lIllllIIIIIIIl = new String[DiskAttribute.lIllllIIIIIlIl[10]])[DiskAttribute.lIllllIIIIIlIl[0]] = lIIIIIlllIlIIIll("sDrS8aqHnlo=", "MfOQi");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[1]] = lIIIIIlllIlIIlIl("EwImBiMkQysHISACOg1s", "PcHhL");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[2]] = lIIIIIlllIlIIlIl("dB0PNzp0", "TjfCR");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[4]] = lIIIIIlllIlIIllI("LMG8cwzq4pysVWQFLa8oZQ==", "zHeFq");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[5]] = lIIIIIlllIlIIllI("KYQYzQFHtlA=", "aIkIW");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[6]] = lIIIIIlllIlIIllI("jcpftJ7R5JA=", "ksAmu");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[7]] = lIIIIIlllIlIIlIl("LgcwFSY=", "osDgy");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[8]] = lIIIIIlllIlIIllI("j+I/Mm/h86Y=", "zJImR");
        DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[9]] = lIIIIIlllIlIIllI("ZTE5nDnDzEU=", "xABhe");
    }
    
    @Override
    public int compareTo(final InterfaceHttpData llllllllllllIllllIllIIlIlllIIIII) {
        if (lIIIIIlllIllIIll((llllllllllllIllllIllIIlIlllIIIII instanceof Attribute) ? 1 : 0)) {
            throw new ClassCastException(String.valueOf(new StringBuilder().append(DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[1]]).append(this.getHttpDataType()).append(DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[2]]).append(llllllllllllIllllIllIIlIlllIIIII.getHttpDataType())));
        }
        return this.compareTo((Attribute)llllllllllllIllllIllIIlIlllIIIII);
    }
    
    @Override
    public void setValue(final String llllllllllllIllllIllIIllIIIIIIII) throws IOException {
        if (lIIIIIlllIlIllll(llllllllllllIllllIllIIllIIIIIIII)) {
            throw new NullPointerException(DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[0]]);
        }
        final byte[] llllllllllllIllllIllIIllIIIIIIll = llllllllllllIllllIllIIllIIIIIIII.getBytes(this.charset.name());
        final ByteBuf llllllllllllIllllIllIIllIIIIIIlI = Unpooled.wrappedBuffer(llllllllllllIllllIllIIllIIIIIIll);
        if (lIIIIIlllIllIIII(lIIIIIlllIlIlllI(this.definedSize, 0L))) {
            this.definedSize = llllllllllllIllllIllIIllIIIIIIlI.readableBytes();
        }
        this.setContent(llllllllllllIllllIllIIllIIIIIIlI);
    }
    
    @Override
    protected String getDiskFilename() {
        return String.valueOf(new StringBuilder().append(this.getName()).append(DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[5]]));
    }
    
    private static int lIIIIIlllIlIlllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIIIIlllIlIIIll(final String llllllllllllIllllIllIIlIIlIlIIII, final String llllllllllllIllllIllIIlIIlIIllll) {
        try {
            final SecretKeySpec llllllllllllIllllIllIIlIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIIlIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIIlIIlIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIIlIIlIlIlII.init(DiskAttribute.lIllllIIIIIlIl[2], llllllllllllIllllIllIIlIIlIlIlIl);
            return new String(llllllllllllIllllIllIIlIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIIlIIlIlIIll) {
            llllllllllllIllllIllIIlIIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected boolean deleteOnExit() {
        return DiskAttribute.deleteOnExitTemporaryFile;
    }
    
    private static String lIIIIIlllIlIIllI(final String llllllllllllIllllIllIIlIIlllIlIl, final String llllllllllllIllllIllIIlIIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIllllIllIIlIIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), DiskAttribute.lIllllIIIIIlIl[9]), "DES");
            final Cipher llllllllllllIllllIllIIlIIllllIIl = Cipher.getInstance("DES");
            llllllllllllIllllIllIIlIIllllIIl.init(DiskAttribute.lIllllIIIIIlIl[2], llllllllllllIllllIllIIlIIllllIlI);
            return new String(llllllllllllIllllIllIIlIIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIIlIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIIlIIllllIII) {
            llllllllllllIllllIllIIlIIllllIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlllIlIllIl() {
        (lIllllIIIIIlIl = new int[11])[0] = ((123 + 158 - 254 + 138 ^ 117 + 101 - 215 + 139) & (0x9 ^ 0x46 ^ (0x4C ^ 0x28) ^ -" ".length()));
        DiskAttribute.lIllllIIIIIlIl[1] = " ".length();
        DiskAttribute.lIllllIIIIIlIl[2] = "  ".length();
        DiskAttribute.lIllllIIIIIlIl[3] = (124 + 219 - 319 + 228 ^ 70 + 140 - 39 + 22);
        DiskAttribute.lIllllIIIIIlIl[4] = "   ".length();
        DiskAttribute.lIllllIIIIIlIl[5] = (34 + 139 - 155 + 179 ^ 91 + 6 + 74 + 22);
        DiskAttribute.lIllllIIIIIlIl[6] = (17 + 106 - 38 + 97 ^ 153 + 4 + 17 + 5);
        DiskAttribute.lIllllIIIIIlIl[7] = (0x9C ^ 0x9A);
        DiskAttribute.lIllllIIIIIlIl[8] = (58 + 74 - 69 + 69 ^ 19 + 109 - 120 + 123);
        DiskAttribute.lIllllIIIIIlIl[9] = (85 + 51 - 66 + 93 ^ 25 + 32 + 54 + 60);
        DiskAttribute.lIllllIIIIIlIl[10] = (0xAD ^ 0xA4);
    }
    
    private static boolean lIIIIIlllIllIlIl(final int llllllllllllIllllIllIIlIIlIIlIlI, final int llllllllllllIllllIllIIlIIlIIlIIl) {
        return llllllllllllIllllIllIIlIIlIIlIlI < llllllllllllIllllIllIIlIIlIIlIIl;
    }
    
    @Override
    public Attribute retain(final int llllllllllllIllllIllIIlIlIlIllll) {
        super.retain(llllllllllllIllllIllIIlIlIlIllll);
        "".length();
        return this;
    }
    
    @Override
    public String getValue() throws IOException {
        final byte[] llllllllllllIllllIllIIllIIIIllII = this.get();
        return new String(llllllllllllIllllIllIIllIIIIllII, this.charset.name());
    }
    
    @Override
    public void addContent(final ByteBuf llllllllllllIllllIllIIlIllllIlII, final boolean llllllllllllIllllIllIIlIllllIlll) throws IOException {
        final int llllllllllllIllllIllIIlIllllIllI = llllllllllllIllllIllIIlIllllIlII.readableBytes();
        if (lIIIIIlllIllIIII(lIIIIIlllIllIIIl(this.definedSize, 0L)) && lIIIIIlllIllIIlI(lIIIIIlllIllIIIl(this.definedSize, this.size + llllllllllllIllllIllIIlIllllIllI))) {
            this.definedSize = this.size + llllllllllllIllllIllIIlIllllIllI;
        }
        super.addContent(llllllllllllIllllIllIIlIllllIlII, llllllllllllIllllIllIIlIllllIlll);
    }
    
    @Override
    public Attribute retain() {
        super.retain();
        "".length();
        return this;
    }
    
    private static boolean lIIIIIlllIllIlII(final Object llllllllllllIllllIllIIlIIlIIIlll) {
        return llllllllllllIllllIllIIlIIlIIIlll != null;
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
    
    public DiskAttribute(final String llllllllllllIllllIllIIllIIIlIlIl, final String llllllllllllIllllIllIIllIIIlIIIl) throws IOException {
        super(llllllllllllIllllIllIIllIIIlIlIl, HttpConstants.DEFAULT_CHARSET, 0L);
        this.setValue(llllllllllllIllllIllIIllIIIlIIIl);
    }
    
    private static String lIIIIIlllIlIIlIl(String llllllllllllIllllIllIIlIIllIIIlI, final String llllllllllllIllllIllIIlIIllIIIIl) {
        llllllllllllIllllIllIIlIIllIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllllIllIIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllIIlIIllIIlIl = new StringBuilder();
        final char[] llllllllllllIllllIllIIlIIllIIlII = llllllllllllIllllIllIIlIIllIIIIl.toCharArray();
        int llllllllllllIllllIllIIlIIllIIIll = DiskAttribute.lIllllIIIIIlIl[0];
        final long llllllllllllIllllIllIIlIIlIlllIl = (Object)llllllllllllIllllIllIIlIIllIIIlI.toCharArray();
        final float llllllllllllIllllIllIIlIIlIlllII = llllllllllllIllllIllIIlIIlIlllIl.length;
        long llllllllllllIllllIllIIlIIlIllIll = DiskAttribute.lIllllIIIIIlIl[0];
        while (lIIIIIlllIllIlIl((int)llllllllllllIllllIllIIlIIlIllIll, (int)llllllllllllIllllIllIIlIIlIlllII)) {
            final char llllllllllllIllllIllIIlIIllIlIII = llllllllllllIllllIllIIlIIlIlllIl[llllllllllllIllllIllIIlIIlIllIll];
            llllllllllllIllllIllIIlIIllIIlIl.append((char)(llllllllllllIllllIllIIlIIllIlIII ^ llllllllllllIllllIllIIlIIllIIlII[llllllllllllIllllIllIIlIIllIIIll % llllllllllllIllllIllIIlIIllIIlII.length]));
            "".length();
            ++llllllllllllIllllIllIIlIIllIIIll;
            ++llllllllllllIllllIllIIlIIlIllIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllIIlIIllIIlIl);
    }
    
    private static boolean lIIIIIlllIlIllll(final Object llllllllllllIllllIllIIlIIlIIIlIl) {
        return llllllllllllIllllIllIIlIIlIIIlIl == null;
    }
    
    private static boolean lIIIIIlllIllIIII(final int llllllllllllIllllIllIIlIIIllllll) {
        return llllllllllllIllllIllIIlIIIllllll > 0;
    }
    
    private static boolean lIIIIIlllIllIIlI(final int llllllllllllIllllIllIIlIIlIIIIIl) {
        return llllllllllllIllllIllIIlIIlIIIIIl < 0;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllllIllIIlIlllIIlll) {
        if (lIIIIIlllIllIIll((llllllllllllIllllIllIIlIlllIIlll instanceof Attribute) ? 1 : 0)) {
            return DiskAttribute.lIllllIIIIIlIl[0] != 0;
        }
        final Attribute llllllllllllIllllIllIIlIlllIlIIl = (Attribute)llllllllllllIllllIllIIlIlllIIlll;
        return this.getName().equalsIgnoreCase(llllllllllllIllllIllIIlIlllIlIIl.getName());
    }
    
    public DiskAttribute(final String llllllllllllIllllIllIIllIIIllIlI) {
        super(llllllllllllIllllIllIIllIIIllIlI, HttpConstants.DEFAULT_CHARSET, 0L);
    }
    
    @Override
    protected String getBaseDirectory() {
        return DiskAttribute.baseDirectory;
    }
    
    @Override
    public InterfaceHttpData.HttpDataType getHttpDataType() {
        return InterfaceHttpData.HttpDataType.Attribute;
    }
    
    public int compareTo(final Attribute llllllllllllIllllIllIIlIllIllIlI) {
        return this.getName().compareToIgnoreCase(llllllllllllIllllIllIIlIllIllIlI.getName());
    }
    
    static {
        lIIIIIlllIlIllIl();
        lIIIIIlllIlIlIII();
        postfix = DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[8]];
        prefix = DiskAttribute.lIllllIIIIIIIl[DiskAttribute.lIllllIIIIIlIl[9]];
        DiskAttribute.deleteOnExitTemporaryFile = (DiskAttribute.lIllllIIIIIlIl[1] != 0);
    }
    
    @Override
    public Attribute copy() {
        final DiskAttribute llllllllllllIllllIllIIlIllIIIllI = new DiskAttribute(this.getName());
        llllllllllllIllllIllIIlIllIIIllI.setCharset(this.getCharset());
        final ByteBuf llllllllllllIllllIllIIlIllIIIlIl = this.content();
        if (lIIIIIlllIllIlII(llllllllllllIllllIllIIlIllIIIlIl)) {
            try {
                llllllllllllIllllIllIIlIllIIIllI.setContent(llllllllllllIllllIllIIlIllIIIlIl.copy());
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (IOException llllllllllllIllllIllIIlIllIIlIII) {
                throw new ChannelException(llllllllllllIllllIllIIlIllIIlIII);
            }
        }
        return llllllllllllIllllIllIIlIllIIIllI;
    }
    
    private static int lIIIIIlllIllIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public Attribute duplicate() {
        final DiskAttribute llllllllllllIllllIllIIlIlIlllIlI = new DiskAttribute(this.getName());
        llllllllllllIllllIllIIlIlIlllIlI.setCharset(this.getCharset());
        final ByteBuf llllllllllllIllllIllIIlIlIlllIIl = this.content();
        if (lIIIIIlllIllIlII(llllllllllllIllllIllIIlIlIlllIIl)) {
            try {
                llllllllllllIllllIllIIlIlIlllIlI.setContent(llllllllllllIllllIllIIlIlIlllIIl.duplicate());
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (IOException llllllllllllIllllIllIIlIlIllllII) {
                throw new ChannelException(llllllllllllIllllIllIIlIlIllllII);
            }
        }
        return llllllllllllIllllIllIIlIlIlllIlI;
    }
    
    private static boolean lIIIIIlllIllIIll(final int llllllllllllIllllIllIIlIIlIIIIll) {
        return llllllllllllIllllIllIIlIIlIIIIll == 0;
    }
}
