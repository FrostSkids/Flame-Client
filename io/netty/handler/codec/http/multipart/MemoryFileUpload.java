// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.charset.Charset;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.buffer.ByteBufHolder;

public class MemoryFileUpload extends AbstractMemoryHttpData implements FileUpload
{
    private /* synthetic */ String filename;
    private static final /* synthetic */ String[] lIIIIIIllllIlI;
    private static final /* synthetic */ int[] lIIIIIlIIIIllI;
    private /* synthetic */ String contentTransferEncoding;
    private /* synthetic */ String contentType;
    
    @Override
    public FileUpload retain(final int lllllllllllllIlIIlllllIlIlIIlIlI) {
        super.retain(lllllllllllllIlIIlllllIlIlIIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public InterfaceHttpData.HttpDataType getHttpDataType() {
        return InterfaceHttpData.HttpDataType.FileUpload;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIIlllllIllIIlIIIl) {
        if (lIllIlIlIllIIIl((lllllllllllllIlIIlllllIllIIlIIIl instanceof Attribute) ? 1 : 0)) {
            return MemoryFileUpload.lIIIIIlIIIIllI[0] != 0;
        }
        final Attribute lllllllllllllIlIIlllllIllIIlIIII = (Attribute)lllllllllllllIlIIlllllIllIIlIIIl;
        return this.getName().equalsIgnoreCase(lllllllllllllIlIIlllllIllIIlIIII.getName());
    }
    
    @Override
    public FileUpload copy() {
        final MemoryFileUpload lllllllllllllIlIIlllllIlIllIIIlI = new MemoryFileUpload(this.getName(), this.getFilename(), this.getContentType(), this.getContentTransferEncoding(), this.getCharset(), this.size);
        final ByteBuf lllllllllllllIlIIlllllIlIllIIIIl = this.content();
        if (lIllIlIlIllIIll(lllllllllllllIlIIlllllIlIllIIIIl)) {
            try {
                lllllllllllllIlIIlllllIlIllIIIlI.setContent(lllllllllllllIlIIlllllIlIllIIIIl.copy());
                return lllllllllllllIlIIlllllIlIllIIIlI;
            }
            catch (IOException lllllllllllllIlIIlllllIlIllIIlII) {
                throw new ChannelException(lllllllllllllIlIIlllllIlIllIIlII);
            }
        }
        return lllllllllllllIlIIlllllIlIllIIIlI;
    }
    
    public MemoryFileUpload(final String lllllllllllllIlIIlllllIllIlIllll, final String lllllllllllllIlIIlllllIllIlIlllI, final String lllllllllllllIlIIlllllIllIlIIllI, final String lllllllllllllIlIIlllllIllIlIllII, final Charset lllllllllllllIlIIlllllIllIlIIlII, final long lllllllllllllIlIIlllllIllIlIlIlI) {
        super(lllllllllllllIlIIlllllIllIlIllll, lllllllllllllIlIIlllllIllIlIIlII, lllllllllllllIlIIlllllIllIlIlIlI);
        this.setFilename(lllllllllllllIlIIlllllIllIlIlllI);
        this.setContentType(lllllllllllllIlIIlllllIllIlIIllI);
        this.setContentTransferEncoding(lllllllllllllIlIIlllllIllIlIllII);
    }
    
    private static String lIllIlIlIIlIllI(String lllllllllllllIlIIlllllIIlllllllI, final String lllllllllllllIlIIlllllIIllllllIl) {
        lllllllllllllIlIIlllllIIlllllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIlllllIIlllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllllIlIIIIIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIlllllIlIIIIIIII = lllllllllllllIlIIlllllIIllllllIl.toCharArray();
        int lllllllllllllIlIIlllllIIllllllll = MemoryFileUpload.lIIIIIlIIIIllI[0];
        final boolean lllllllllllllIlIIlllllIIlllllIIl = (Object)lllllllllllllIlIIlllllIIlllllllI.toCharArray();
        final short lllllllllllllIlIIlllllIIlllllIII = (short)lllllllllllllIlIIlllllIIlllllIIl.length;
        char lllllllllllllIlIIlllllIIllllIlll = (char)MemoryFileUpload.lIIIIIlIIIIllI[0];
        while (lIllIlIlIllIlII(lllllllllllllIlIIlllllIIllllIlll, lllllllllllllIlIIlllllIIlllllIII)) {
            final char lllllllllllllIlIIlllllIlIIIIIlII = lllllllllllllIlIIlllllIIlllllIIl[lllllllllllllIlIIlllllIIllllIlll];
            lllllllllllllIlIIlllllIlIIIIIIIl.append((char)(lllllllllllllIlIIlllllIlIIIIIlII ^ lllllllllllllIlIIlllllIlIIIIIIII[lllllllllllllIlIIlllllIIllllllll % lllllllllllllIlIIlllllIlIIIIIIII.length]));
            "".length();
            ++lllllllllllllIlIIlllllIIllllllll;
            ++lllllllllllllIlIIlllllIIllllIlll;
            "".length();
            if (-(0x8D ^ 0x88) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllllIlIIIIIIIl);
    }
    
    @Override
    public void setFilename(final String lllllllllllllIlIIlllllIllIIllIll) {
        if (lIllIlIlIllIIII(lllllllllllllIlIIlllllIllIIllIll)) {
            throw new NullPointerException(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[0]]);
        }
        this.filename = lllllllllllllIlIIlllllIllIIllIll;
    }
    
    private static void lIllIlIlIlIlIlI() {
        (lIIIIIIllllIlI = new String[MemoryFileUpload.lIIIIIlIIIIllI[19]])[MemoryFileUpload.lIIIIIlIIIIllI[0]] = lIllIlIlIIlIlIl("54i4Ult7eaDkIg77WDPkFw==", "jvVpr");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[1]] = lIllIlIlIIlIllI("KyY6LwMcZzcuARgmJiRM", "hGTAl");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[2]] = lIllIlIlIIlIlIl("xSIurapThy4=", "CySSk");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[3]] = lIllIlIlIIlIllI("KCIbABQlOSENAS4=", "KMutq");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[4]] = lIllIlIlIIllIII("pEHsQpbe4zFkTa/6roH8oq9j+9pZB+B8TPiGTZxuvL5MWFokxWrwiw==", "BFccr");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[5]] = lIllIlIlIIllIII("q7NyDIxV7eU=", "pqxWg");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[6]] = lIllIlIlIIllIII("qpGFfwQVVadNrlLcTPQACw==", "jaVLv");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[7]] = lIllIlIlIIllIII("wldSGYrhXw0=", "BZYUv");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[8]] = lIllIlIlIIllIII("0vhu5tPL+Tw=", "JpYsI");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[9]] = lIllIlIlIIllIII("qt15svsEduHW0apKqHni8g==", "FnHQI");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[10]] = lIllIlIlIIllIII("3cySjpW25qw=", "QAFvZ");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[11]] = lIllIlIlIIllIII("rYbRMIKwVEKEauf9St6F5g==", "kKjTa");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[12]] = lIllIlIlIIlIlIl("7dhfXMs1rPs=", "VjCqd");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[13]] = lIllIlIlIIlIllI("V0g=", "ZBsNj");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[14]] = lIllIlIlIIlIllI("Jh8tNwALBG4PAAsXNys=", "epCCe");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[15]] = lIllIlIlIIlIlIl("BhkAYu/8q9g=", "deJzq");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[16]] = lIllIlIlIIllIII("JHw/pSiTwO8=", "zoryO");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[17]] = lIllIlIlIIlIllI("AgI9ISskGTU1fWE=", "AmPQG");
        MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[18]] = lIllIlIlIIlIlIl("yaZ95qD+cCja66SuQUt3Zw==", "XwSUJ");
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[4]]).append(this.getName()).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[5]]).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[6]]).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[7]]).append(this.filename).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[8]]).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[9]]).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[10]]).append(this.contentType);
        String value;
        if (lIllIlIlIllIIll(this.charset)) {
            value = String.valueOf(new StringBuilder().append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[11]]).append(this.charset).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[12]]));
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        else {
            value = MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[13]];
        }
        return String.valueOf(append.append(value).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[14]]).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[15]]).append(this.length()).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[16]]).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[17]]).append(this.isCompleted()).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[18]]).append(this.isInMemory()));
    }
    
    private static boolean lIllIlIlIllIIlI(final int lllllllllllllIlIIlllllIIllIlllll) {
        return lllllllllllllIlIIlllllIIllIlllll != 0;
    }
    
    static {
        lIllIlIlIlIllll();
        lIllIlIlIlIlIlI();
    }
    
    @Override
    public void setContentTransferEncoding(final String lllllllllllllIlIIlllllIlIllIlllI) {
        this.contentTransferEncoding = lllllllllllllIlIIlllllIlIllIlllI;
    }
    
    @Override
    public String getContentType() {
        return this.contentType;
    }
    
    @Override
    public void setContentType(final String lllllllllllllIlIIlllllIlIllllIlI) {
        if (lIllIlIlIllIIII(lllllllllllllIlIIlllllIlIllllIlI)) {
            throw new NullPointerException(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[3]]);
        }
        this.contentType = lllllllllllllIlIIlllllIlIllllIlI;
    }
    
    private static boolean lIllIlIlIllIIIl(final int lllllllllllllIlIIlllllIIllIlllIl) {
        return lllllllllllllIlIIlllllIIllIlllIl == 0;
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
    
    private static boolean lIllIlIlIllIlII(final int lllllllllllllIlIIlllllIIlllIIllI, final int lllllllllllllIlIIlllllIIlllIIlIl) {
        return lllllllllllllIlIIlllllIIlllIIllI < lllllllllllllIlIIlllllIIlllIIlIl;
    }
    
    private static String lIllIlIlIIlIlIl(final String lllllllllllllIlIIlllllIIlllIllII, final String lllllllllllllIlIIlllllIIlllIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllllIIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllllIIlllIlIll.getBytes(StandardCharsets.UTF_8)), MemoryFileUpload.lIIIIIlIIIIllI[8]), "DES");
            final Cipher lllllllllllllIlIIlllllIIllllIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIlllllIIllllIIII.init(MemoryFileUpload.lIIIIIlIIIIllI[2], lllllllllllllIlIIlllllIIllllIIIl);
            return new String(lllllllllllllIlIIlllllIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllllIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllllIIlllIllll) {
            lllllllllllllIlIIlllllIIlllIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlIlIllIIII(final Object lllllllllllllIlIIlllllIIlllIIIIl) {
        return lllllllllllllIlIIlllllIIlllIIIIl == null;
    }
    
    @Override
    public int compareTo(final InterfaceHttpData lllllllllllllIlIIlllllIllIIIlIIl) {
        if (lIllIlIlIllIIIl((lllllllllllllIlIIlllllIllIIIlIIl instanceof FileUpload) ? 1 : 0)) {
            throw new ClassCastException(String.valueOf(new StringBuilder().append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[1]]).append(this.getHttpDataType()).append(MemoryFileUpload.lIIIIIIllllIlI[MemoryFileUpload.lIIIIIlIIIIllI[2]]).append(lllllllllllllIlIIlllllIllIIIlIIl.getHttpDataType())));
        }
        return this.compareTo((FileUpload)lllllllllllllIlIIlllllIllIIIlIIl);
    }
    
    @Override
    public FileUpload retain() {
        super.retain();
        "".length();
        return this;
    }
    
    public int compareTo(final FileUpload lllllllllllllIlIIlllllIllIIIIIlI) {
        final int lllllllllllllIlIIlllllIllIIIIIIl = this.getName().compareToIgnoreCase(lllllllllllllIlIIlllllIllIIIIIlI.getName());
        if (lIllIlIlIllIIlI(lllllllllllllIlIIlllllIllIIIIIIl)) {
            return lllllllllllllIlIIlllllIllIIIIIIl;
        }
        return lllllllllllllIlIIlllllIllIIIIIIl;
    }
    
    @Override
    public String getContentTransferEncoding() {
        return this.contentTransferEncoding;
    }
    
    @Override
    public FileUpload duplicate() {
        final MemoryFileUpload lllllllllllllIlIIlllllIlIlIlIllI = new MemoryFileUpload(this.getName(), this.getFilename(), this.getContentType(), this.getContentTransferEncoding(), this.getCharset(), this.size);
        final ByteBuf lllllllllllllIlIIlllllIlIlIlIlIl = this.content();
        if (lIllIlIlIllIIll(lllllllllllllIlIIlllllIlIlIlIlIl)) {
            try {
                lllllllllllllIlIIlllllIlIlIlIllI.setContent(lllllllllllllIlIIlllllIlIlIlIlIl.duplicate());
                return lllllllllllllIlIIlllllIlIlIlIllI;
            }
            catch (IOException lllllllllllllIlIIlllllIlIlIllIII) {
                throw new ChannelException(lllllllllllllIlIIlllllIlIlIllIII);
            }
        }
        return lllllllllllllIlIIlllllIlIlIlIllI;
    }
    
    private static boolean lIllIlIlIllIIll(final Object lllllllllllllIlIIlllllIIlllIIIll) {
        return lllllllllllllIlIIlllllIIlllIIIll != null;
    }
    
    private static String lIllIlIlIIllIII(final String lllllllllllllIlIIlllllIlIIIlIIIl, final String lllllllllllllIlIIlllllIlIIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllllIlIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllllIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllllIlIIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllllIlIIIlIlIl.init(MemoryFileUpload.lIIIIIlIIIIllI[2], lllllllllllllIlIIlllllIlIIIlIllI);
            return new String(lllllllllllllIlIIlllllIlIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllllIlIIIlIlII) {
            lllllllllllllIlIIlllllIlIIIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIlIlIlIllll() {
        (lIIIIIlIIIIllI = new int[20])[0] = ((0xF4 ^ 0xA7) & ~(0x4D ^ 0x1E));
        MemoryFileUpload.lIIIIIlIIIIllI[1] = " ".length();
        MemoryFileUpload.lIIIIIlIIIIllI[2] = "  ".length();
        MemoryFileUpload.lIIIIIlIIIIllI[3] = "   ".length();
        MemoryFileUpload.lIIIIIlIIIIllI[4] = (26 + 40 + 67 + 7 ^ 99 + 114 - 179 + 102);
        MemoryFileUpload.lIIIIIlIIIIllI[5] = (0x68 ^ 0x2 ^ (0xEE ^ 0x81));
        MemoryFileUpload.lIIIIIlIIIIllI[6] = (66 + 139 - 82 + 40 ^ 97 + 164 - 243 + 147);
        MemoryFileUpload.lIIIIIlIIIIllI[7] = (78 + 77 - 126 + 111 ^ 82 + 24 - 14 + 47);
        MemoryFileUpload.lIIIIIlIIIIllI[8] = (0x9C ^ 0x94);
        MemoryFileUpload.lIIIIIlIIIIllI[9] = (0x73 ^ 0x52 ^ (0x3B ^ 0x13));
        MemoryFileUpload.lIIIIIlIIIIllI[10] = (180 + 36 - 156 + 124 ^ 155 + 108 - 249 + 164);
        MemoryFileUpload.lIIIIIlIIIIllI[11] = (0xC ^ 0x1A ^ (0x55 ^ 0x48));
        MemoryFileUpload.lIIIIIlIIIIllI[12] = (0x6 ^ 0xA);
        MemoryFileUpload.lIIIIIlIIIIllI[13] = (160 + 131 - 149 + 40 ^ 177 + 117 - 144 + 37);
        MemoryFileUpload.lIIIIIlIIIIllI[14] = (0x6F ^ 0x61);
        MemoryFileUpload.lIIIIIlIIIIllI[15] = (51 + 131 - 132 + 153 ^ 146 + 195 - 328 + 183);
        MemoryFileUpload.lIIIIIlIIIIllI[16] = (0x43 ^ 0x53);
        MemoryFileUpload.lIIIIIlIIIIllI[17] = (0xD6 ^ 0xC7);
        MemoryFileUpload.lIIIIIlIIIIllI[18] = (0xBE ^ 0xAC);
        MemoryFileUpload.lIIIIIlIIIIllI[19] = (0x2B ^ 0x38);
    }
    
    @Override
    public String getFilename() {
        return this.filename;
    }
}
