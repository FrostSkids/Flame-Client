// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import io.netty.util.ReferenceCounted;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import io.netty.channel.ChannelException;

public class DiskFileUpload extends AbstractDiskHttpData implements FileUpload
{
    private static final /* synthetic */ String[] llIIIlIlllIIII;
    public static /* synthetic */ boolean deleteOnExitTemporaryFile;
    private static final /* synthetic */ int[] llIIIlIlllIllI;
    private /* synthetic */ String contentType;
    public static /* synthetic */ String baseDirectory;
    private /* synthetic */ String filename;
    private /* synthetic */ String contentTransferEncoding;
    
    @Override
    public void setFilename(final String llllllllllllIlllIlIlIIlllIIlIlII) {
        if (lIIIlIIlllIlIIIl(llllllllllllIlllIlIlIIlllIIlIlII)) {
            throw new NullPointerException(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[0]]);
        }
        this.filename = llllllllllllIlllIlIlIIlllIIlIlII;
    }
    
    @Override
    public void setContentTransferEncoding(final String llllllllllllIlllIlIlIIllIllIIlll) {
        this.contentTransferEncoding = llllllllllllIlllIlIlIIllIllIIlll;
    }
    
    @Override
    protected String getBaseDirectory() {
        return DiskFileUpload.baseDirectory;
    }
    
    @Override
    protected String getPostfix() {
        return DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[22]];
    }
    
    @Override
    public FileUpload copy() {
        final DiskFileUpload llllllllllllIlllIlIlIIllIlIlIIll = new DiskFileUpload(this.getName(), this.getFilename(), this.getContentType(), this.getContentTransferEncoding(), this.getCharset(), this.size);
        final ByteBuf llllllllllllIlllIlIlIIllIlIlIIlI = this.content();
        if (lIIIlIIlllIlIlII(llllllllllllIlllIlIlIIllIlIlIIlI)) {
            try {
                llllllllllllIlllIlIlIIllIlIlIIll.setContent(llllllllllllIlllIlIlIIllIlIlIIlI.copy());
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            catch (IOException llllllllllllIlllIlIlIIllIlIlIlIl) {
                throw new ChannelException(llllllllllllIlllIlIlIIllIlIlIlIl);
            }
        }
        return llllllllllllIlllIlIlIIllIlIlIIll;
    }
    
    @Override
    public String getContentType() {
        return this.contentType;
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
    
    private static String lIIIlIIllIllIlII(final String llllllllllllIlllIlIlIIlIlllIlIlI, final String llllllllllllIlllIlIlIIlIlllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIlIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIlIlllIlIIl.getBytes(StandardCharsets.UTF_8)), DiskFileUpload.llIIIlIlllIllI[8]), "DES");
            final Cipher llllllllllllIlllIlIlIIlIlllIlllI = Cipher.getInstance("DES");
            llllllllllllIlllIlIlIIlIlllIlllI.init(DiskFileUpload.llIIIlIlllIllI[2], llllllllllllIlllIlIlIIlIlllIllll);
            return new String(llllllllllllIlllIlIlIIlIlllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIlIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIlIlllIllIl) {
            llllllllllllIlllIlIlIIlIlllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIlllIlIlll(final int llllllllllllIlllIlIlIIlIllIlIlll, final int llllllllllllIlllIlIlIIlIllIlIllI) {
        return llllllllllllIlllIlIlIIlIllIlIlll < llllllllllllIlllIlIlIIlIllIlIllI;
    }
    
    private static void lIIIlIIlllIIllII() {
        (llIIIlIlllIIII = new String[DiskFileUpload.llIIIlIlllIllI[26]])[DiskFileUpload.llIIIlIlllIllI[0]] = lIIIlIIllIllIIlI("BAgmAg0DDC8=", "baJgc");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[1]] = lIIIlIIllIllIlII("nCGdPJ03mA/XOpyG//DBxg==", "mGElM");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[2]] = lIIIlIIllIllIllI("PPo0FIxy4TA=", "pRrTQ");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[3]] = lIIIlIIllIllIIlI("LyQlLiMiPx8jNik=", "LKKZF");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[4]] = lIIIlIIllIllIIlI("GSEmPCw0OmUMICk+JzsgLicnJnN6KCc6JHcqKTwoYW4mKSQ/c2o=", "ZNHHI");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[5]] = lIIIlIIllIllIIlI("SlFF", "hjetX");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[6]] = lIIIlIIllIllIIlI("NDkCAzQzPQs=", "RPnfZ");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[7]] = lIIIlIIllIllIllI("naE7tQZ6ENY=", "gVtQu");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[8]] = lIIIlIIllIllIllI("JnPfJLiztEo=", "UQEpD");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[9]] = lIIIlIIllIllIlII("cU7ctLM+Gnj3xdgrkM6sMA==", "aZhxg");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[10]] = lIIIlIIllIllIIlI("f0g=", "EhqyO");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[11]] = lIIIlIIllIllIlII("KWk5mAbVGy5b17mr1VdmwA==", "lrvUc");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[12]] = lIIIlIIllIllIllI("5DPL4H8lCRo=", "VvRwk");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[13]] = lIIIlIIllIllIllI("I82WZryw0HE=", "ueMBn");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[14]] = lIIIlIIllIllIllI("El42tw6/xjp/AxZrlA5DaA==", "riPRo");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[15]] = lIIIlIIllIllIIlI("X1A=", "epwOu");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[16]] = lIIIlIIllIllIlII("//cLnRC/TVo=", "qyveC");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[17]] = lIIIlIIllIllIlII("qbn6mzNhcxLbuT2jQ4nopg==", "Mhwfp");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[18]] = lIIIlIIllIllIllI("ar6nKssfh8cxsaVK6cebXw==", "nHjaY");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[19]] = lIIIlIIllIllIllI("WuN/QNy0qvVby7OXGLFNEA==", "lVigX");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[20]] = lIIIlIIllIllIlII("d8vPz+Vk/64=", "SRwLT");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[21]] = lIIIlIIllIllIllI("ANXFMGzozuHhhXgYlCUtr4nwjFNtOw+U", "BTqPl");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[22]] = lIIIlIIllIllIllI("ycutV/7uFek=", "Ogjlu");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[23]] = lIIIlIIllIllIllI("tldv13VnKz4=", "YZHRj");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[24]] = lIIIlIIllIllIlII("pFn0R9SkXh8=", "LwnJK");
        DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[25]] = lIIIlIIllIllIIlI("RzELIQ==", "iEfQi");
    }
    
    @Override
    public FileUpload duplicate() {
        final DiskFileUpload llllllllllllIlllIlIlIIllIlIIIlll = new DiskFileUpload(this.getName(), this.getFilename(), this.getContentType(), this.getContentTransferEncoding(), this.getCharset(), this.size);
        final ByteBuf llllllllllllIlllIlIlIIllIlIIIllI = this.content();
        if (lIIIlIIlllIlIlII(llllllllllllIlllIlIlIIllIlIIIllI)) {
            try {
                llllllllllllIlllIlIlIIllIlIIIlll.setContent(llllllllllllIlllIlIlIIllIlIIIllI.duplicate());
                "".length();
                if ((0xC7 ^ 0xC3) < -" ".length()) {
                    return null;
                }
            }
            catch (IOException llllllllllllIlllIlIlIIllIlIIlIIl) {
                throw new ChannelException(llllllllllllIlllIlIlIIllIlIIlIIl);
            }
        }
        return llllllllllllIlllIlIlIIllIlIIIlll;
    }
    
    private static boolean lIIIlIIlllIlIIIl(final Object llllllllllllIlllIlIlIIlIllIlIIlI) {
        return llllllllllllIlllIlIlIIlIllIlIIlI == null;
    }
    
    @Override
    public InterfaceHttpData.HttpDataType getHttpDataType() {
        return InterfaceHttpData.HttpDataType.FileUpload;
    }
    
    public DiskFileUpload(final String llllllllllllIlllIlIlIIlllIllIIII, final String llllllllllllIlllIlIlIIlllIlIlllI, final String llllllllllllIlllIlIlIIlllIlIllII, final String llllllllllllIlllIlIlIIlllIlIlIll, final Charset llllllllllllIlllIlIlIIlllIIlllll, final long llllllllllllIlllIlIlIIlllIIllllI) {
        super(llllllllllllIlllIlIlIIlllIllIIII, llllllllllllIlllIlIlIIlllIIlllll, llllllllllllIlllIlIlIIlllIIllllI);
        this.setFilename(llllllllllllIlllIlIlIIlllIlIlllI);
        this.setContentType(llllllllllllIlllIlIlIIlllIlIllII);
        this.setContentTransferEncoding(llllllllllllIlllIlIlIIlllIlIlIll);
    }
    
    @Override
    public void setContentType(final String llllllllllllIlllIlIlIIllIlllIlIl) {
        if (lIIIlIIlllIlIIIl(llllllllllllIlllIlIlIIllIlllIlIl)) {
            throw new NullPointerException(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[3]]);
        }
        this.contentType = llllllllllllIlllIlIlIIllIlllIlIl;
    }
    
    private static boolean lIIIlIIlllIlIIlI(final int llllllllllllIlllIlIlIIlIllIIlllI) {
        return llllllllllllIlllIlIlIIlIllIIlllI == 0;
    }
    
    @Override
    protected String getDiskFilename() {
        final File llllllllllllIlllIlIlIIllIlIllllI = new File(this.filename);
        return llllllllllllIlllIlIlIIllIlIllllI.getName();
    }
    
    @Override
    public String getContentTransferEncoding() {
        return this.contentTransferEncoding;
    }
    
    private static boolean lIIIlIIlllIlIIll(final int llllllllllllIlllIlIlIIlIllIlIIII) {
        return llllllllllllIlllIlIlIIlIllIlIIII != 0;
    }
    
    @Override
    public int compareTo(final InterfaceHttpData llllllllllllIlllIlIlIIlllIIIIlII) {
        if (lIIIlIIlllIlIIlI((llllllllllllIlllIlIlIIlllIIIIlII instanceof FileUpload) ? 1 : 0)) {
            throw new ClassCastException(String.valueOf(new StringBuilder().append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[1]]).append(this.getHttpDataType()).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[2]]).append(llllllllllllIlllIlIlIIlllIIIIlII.getHttpDataType())));
        }
        return this.compareTo((FileUpload)llllllllllllIlllIlIlIIlllIIIIlII);
    }
    
    @Override
    protected boolean deleteOnExit() {
        return DiskFileUpload.deleteOnExitTemporaryFile;
    }
    
    @Override
    protected String getPrefix() {
        return DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[23]];
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[4]]).append(this.getName()).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[5]]).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[6]]).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[7]]).append(this.filename).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[8]]).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[9]]).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[10]]).append(this.contentType);
        String value;
        if (lIIIlIIlllIlIlII(this.charset)) {
            value = String.valueOf(new StringBuilder().append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[11]]).append(this.charset).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[12]]));
            "".length();
            if (((0x22 ^ 0x1A ^ (0xC ^ 0x78)) & (89 + 44 + 89 + 13 ^ 46 + 30 + 52 + 39 ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        else {
            value = DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[13]];
        }
        final StringBuilder append2 = append.append(value).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[14]]).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[15]]).append(this.length()).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[16]]).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[17]]).append(this.isCompleted()).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[18]]).append(this.isInMemory()).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[19]]);
        String absolutePath;
        if (lIIIlIIlllIlIlII(this.file)) {
            absolutePath = this.file.getAbsolutePath();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            absolutePath = DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[20]];
        }
        return String.valueOf(append2.append(absolutePath).append(DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[21]]).append(DiskFileUpload.deleteOnExitTemporaryFile));
    }
    
    @Override
    public FileUpload retain() {
        super.retain();
        "".length();
        return this;
    }
    
    private static String lIIIlIIllIllIIlI(String llllllllllllIlllIlIlIIllIIIIIIIl, final String llllllllllllIlllIlIlIIlIlllllIll) {
        llllllllllllIlllIlIlIIllIIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIlIIllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlIIlIllllllll = new StringBuilder();
        final char[] llllllllllllIlllIlIlIIlIlllllllI = llllllllllllIlllIlIlIIlIlllllIll.toCharArray();
        int llllllllllllIlllIlIlIIlIllllllIl = DiskFileUpload.llIIIlIlllIllI[0];
        final float llllllllllllIlllIlIlIIlIllllIlll = (Object)llllllllllllIlllIlIlIIllIIIIIIIl.toCharArray();
        final Exception llllllllllllIlllIlIlIIlIllllIllI = (Exception)llllllllllllIlllIlIlIIlIllllIlll.length;
        char llllllllllllIlllIlIlIIlIllllIlIl = (char)DiskFileUpload.llIIIlIlllIllI[0];
        while (lIIIlIIlllIlIlll(llllllllllllIlllIlIlIIlIllllIlIl, (int)llllllllllllIlllIlIlIIlIllllIllI)) {
            final char llllllllllllIlllIlIlIIllIIIIIIlI = llllllllllllIlllIlIlIIlIllllIlll[llllllllllllIlllIlIlIIlIllllIlIl];
            llllllllllllIlllIlIlIIlIllllllll.append((char)(llllllllllllIlllIlIlIIllIIIIIIlI ^ llllllllllllIlllIlIlIIlIlllllllI[llllllllllllIlllIlIlIIlIllllllIl % llllllllllllIlllIlIlIIlIlllllllI.length]));
            "".length();
            ++llllllllllllIlllIlIlIIlIllllllIl;
            ++llllllllllllIlllIlIlIIlIllllIlIl;
            "".length();
            if ((0x4E ^ 0x63 ^ (0x8C ^ 0xA4)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlIIlIllllllll);
    }
    
    private static boolean lIIIlIIlllIlIlII(final Object llllllllllllIlllIlIlIIlIllIlIlII) {
        return llllllllllllIlllIlIlIIlIllIlIlII != null;
    }
    
    static {
        lIIIlIIlllIlIIII();
        lIIIlIIlllIIllII();
        prefix = DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[24]];
        postfix = DiskFileUpload.llIIIlIlllIIII[DiskFileUpload.llIIIlIlllIllI[25]];
        DiskFileUpload.deleteOnExitTemporaryFile = (DiskFileUpload.llIIIlIlllIllI[1] != 0);
    }
    
    @Override
    public FileUpload retain(final int llllllllllllIlllIlIlIIllIIllllII) {
        super.retain(llllllllllllIlllIlIlIIllIIllllII);
        "".length();
        return this;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlllIlIlIIlllIIIllII) {
        if (lIIIlIIlllIlIIlI((llllllllllllIlllIlIlIIlllIIIllII instanceof Attribute) ? 1 : 0)) {
            return DiskFileUpload.llIIIlIlllIllI[0] != 0;
        }
        final Attribute llllllllllllIlllIlIlIIlllIIIlIll = (Attribute)llllllllllllIlllIlIlIIlllIIIllII;
        return this.getName().equalsIgnoreCase(llllllllllllIlllIlIlIIlllIIIlIll.getName());
    }
    
    private static void lIIIlIIlllIlIIII() {
        (llIIIlIlllIllI = new int[27])[0] = ((0xBC ^ 0x9D ^ ((0xBF ^ 0xA4) & ~(0xA2 ^ 0xB9))) & (0xBC ^ 0x93 ^ (0x5 ^ 0xB) ^ -" ".length()));
        DiskFileUpload.llIIIlIlllIllI[1] = " ".length();
        DiskFileUpload.llIIIlIlllIllI[2] = "  ".length();
        DiskFileUpload.llIIIlIlllIllI[3] = "   ".length();
        DiskFileUpload.llIIIlIlllIllI[4] = (0x22 ^ 0x26);
        DiskFileUpload.llIIIlIlllIllI[5] = (0x49 ^ 0x4C);
        DiskFileUpload.llIIIlIlllIllI[6] = (0x94 ^ 0x92);
        DiskFileUpload.llIIIlIlllIllI[7] = (0x8A ^ 0x8D);
        DiskFileUpload.llIIIlIlllIllI[8] = (0x7 ^ 0xF);
        DiskFileUpload.llIIIlIlllIllI[9] = (0x1A ^ 0x13);
        DiskFileUpload.llIIIlIlllIllI[10] = (83 + 157 - 88 + 10 ^ 63 + 99 - 18 + 24);
        DiskFileUpload.llIIIlIlllIllI[11] = (0x8C ^ 0x87);
        DiskFileUpload.llIIIlIlllIllI[12] = (0x86 ^ 0xA3 ^ (0x12 ^ 0x3B));
        DiskFileUpload.llIIIlIlllIllI[13] = (0xFC ^ 0xB9 ^ (0xFA ^ 0xB2));
        DiskFileUpload.llIIIlIlllIllI[14] = (0xC2 ^ 0xBA ^ (0x3E ^ 0x48));
        DiskFileUpload.llIIIlIlllIllI[15] = (0x2E ^ 0x21);
        DiskFileUpload.llIIIlIlllIllI[16] = (0x65 ^ 0x4F ^ (0x88 ^ 0xB2));
        DiskFileUpload.llIIIlIlllIllI[17] = (0x6D ^ 0x9 ^ (0xE7 ^ 0x92));
        DiskFileUpload.llIIIlIlllIllI[18] = (0x81 ^ 0x93);
        DiskFileUpload.llIIIlIlllIllI[19] = (0x5C ^ 0x2D ^ (0xE9 ^ 0x8B));
        DiskFileUpload.llIIIlIlllIllI[20] = (66 + 30 - 80 + 130 ^ 113 + 7 - 114 + 128);
        DiskFileUpload.llIIIlIlllIllI[21] = (0x2F ^ 0x6D ^ (0xD2 ^ 0x85));
        DiskFileUpload.llIIIlIlllIllI[22] = (0x25 ^ 0x33);
        DiskFileUpload.llIIIlIlllIllI[23] = (0x69 ^ 0x4C ^ (0x76 ^ 0x44));
        DiskFileUpload.llIIIlIlllIllI[24] = (0xD8 ^ 0xC0);
        DiskFileUpload.llIIIlIlllIllI[25] = (161 + 119 - 100 + 37 ^ 45 + 93 - 12 + 66);
        DiskFileUpload.llIIIlIlllIllI[26] = ("  ".length() ^ (0xAF ^ 0xB7));
    }
    
    public int compareTo(final FileUpload llllllllllllIlllIlIlIIllIlllllIl) {
        final int llllllllllllIlllIlIlIIllIlllllII = this.getName().compareToIgnoreCase(llllllllllllIlllIlIlIIllIlllllIl.getName());
        if (lIIIlIIlllIlIIll(llllllllllllIlllIlIlIIllIlllllII)) {
            return llllllllllllIlllIlIlIIllIlllllII;
        }
        return llllllllllllIlllIlIlIIllIlllllII;
    }
    
    private static String lIIIlIIllIllIllI(final String llllllllllllIlllIlIlIIlIllIlllIl, final String llllllllllllIlllIlIlIIlIllIllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIlIlllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIlIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIIlIlllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIIlIlllIIIIl.init(DiskFileUpload.llIIIlIlllIllI[2], llllllllllllIlllIlIlIIlIlllIIIlI);
            return new String(llllllllllllIlllIlIlIIlIlllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIlIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIlIlllIIIII) {
            llllllllllllIlllIlIlIIlIlllIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getFilename() {
        return this.filename;
    }
}
