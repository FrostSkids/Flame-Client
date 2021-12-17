// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import java.util.Arrays;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.jcraft.jzlib.JZlib;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.jcraft.jzlib.Inflater;

public class JZlibDecoder extends ZlibDecoder
{
    private static final /* synthetic */ int[] llIlllIIIIlIll;
    private static final /* synthetic */ String[] llIlllIIIIlIlI;
    private /* synthetic */ byte[] dictionary;
    private volatile /* synthetic */ boolean finished;
    private final /* synthetic */ Inflater z;
    
    private static boolean lIIllIIlIIIIllIl(final int llllllllllllIllIIlIlIlIlIllIllII, final int llllllllllllIllIIlIlIlIlIllIlIll) {
        return llllllllllllIllIIlIlIlIlIllIllII < llllllllllllIllIIlIlIlIlIllIlIll;
    }
    
    public JZlibDecoder(final ZlibWrapper llllllllllllIllIIlIlIlIlllIlIlll) {
        this.z = new Inflater();
        if (lIIllIIlIIIIlIII(llllllllllllIllIIlIlIlIlllIlIlll)) {
            throw new NullPointerException(JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[0]]);
        }
        final int llllllllllllIllIIlIlIlIlllIlIllI = this.z.init(ZlibUtil.convertWrapperType(llllllllllllIllIIlIlIlIlllIlIlll));
        if (lIIllIIlIIIIlIIl(llllllllllllIllIIlIlIlIlllIlIllI)) {
            ZlibUtil.fail(this.z, JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[1]], llllllllllllIllIIlIlIlIlllIlIllI);
        }
    }
    
    private static void lIIllIIlIIIIIlll() {
        (llIlllIIIIlIll = new int[9])[0] = ((0x2 ^ 0x4D) & ~(0x15 ^ 0x5A));
        JZlibDecoder.llIlllIIIIlIll[1] = " ".length();
        JZlibDecoder.llIlllIIIIlIll[2] = "  ".length();
        JZlibDecoder.llIlllIIIIlIll[3] = "   ".length();
        JZlibDecoder.llIlllIIIIlIll[4] = (0x47 ^ 0x1A ^ (0x64 ^ 0x3D));
        JZlibDecoder.llIlllIIIIlIll[5] = (0x5F ^ 0xF ^ (0xEB ^ 0xBE));
        JZlibDecoder.llIlllIIIIlIll[6] = (107 + 15 - 103 + 109 ^ 58 + 48 + 9 + 19);
        JZlibDecoder.llIlllIIIIlIll[7] = (0x2C ^ 0x2B);
        JZlibDecoder.llIlllIIIIlIll[8] = (0x5F ^ 0x57);
    }
    
    private static String lIIllIIlIIIIIlII(final String llllllllllllIllIIlIlIlIllIIIllII, final String llllllllllllIllIIlIlIlIllIIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIlIllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIlIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIlIlIllIIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIlIlIllIIIlllI.init(JZlibDecoder.llIlllIIIIlIll[2], llllllllllllIllIIlIlIlIllIIIllll);
            return new String(llllllllllllIllIIlIlIlIllIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIlIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIlIllIIIllIl) {
            llllllllllllIllIIlIlIlIllIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIlIIIIlIII(final Object llllllllllllIllIIlIlIlIlIllIlIIl) {
        return llllllllllllIllIIlIlIlIlIllIlIIl == null;
    }
    
    public JZlibDecoder(final byte[] llllllllllllIllIIlIlIlIlllIIlIll) {
        this.z = new Inflater();
        if (lIIllIIlIIIIlIII(llllllllllllIllIIlIlIlIlllIIlIll)) {
            throw new NullPointerException(JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[2]]);
        }
        this.dictionary = llllllllllllIllIIlIlIlIlllIIlIll;
        final int llllllllllllIllIIlIlIlIlllIIllIl = this.z.inflateInit(JZlib.W_ZLIB);
        if (lIIllIIlIIIIlIIl(llllllllllllIllIIlIlIlIlllIIllIl)) {
            ZlibUtil.fail(this.z, JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[3]], llllllllllllIllIIlIlIlIlllIIllIl);
        }
    }
    
    public JZlibDecoder() {
        this(ZlibWrapper.ZLIB);
    }
    
    private static boolean lIIllIIlIIIIlIIl(final int llllllllllllIllIIlIlIlIlIllIIlll) {
        return llllllllllllIllIIlIlIlIlIllIIlll != 0;
    }
    
    static {
        lIIllIIlIIIIIlll();
        lIIllIIlIIIIIllI();
    }
    
    @Override
    public boolean isClosed() {
        return this.finished;
    }
    
    private static boolean lIIllIIlIIIIlIlI(final int llllllllllllIllIIlIlIlIlIllIIlIl) {
        return llllllllllllIllIIlIlIlIlIllIIlIl == 0;
    }
    
    private static boolean lIIllIIlIIIIlIll(final int llllllllllllIllIIlIlIlIlIllIIIIl) {
        return llllllllllllIllIIlIlIlIlIllIIIIl > 0;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIllIIlIlIlIllIlIllII, final ByteBuf llllllllllllIllIIlIlIlIllIlIllll, final List<Object> llllllllllllIllIIlIlIlIllIlIlIlI) throws Exception {
        if (lIIllIIlIIIIlIIl(this.finished ? 1 : 0)) {
            llllllllllllIllIIlIlIlIllIlIllll.skipBytes(llllllllllllIllIIlIlIlIllIlIllll.readableBytes());
            "".length();
            return;
        }
        if (lIIllIIlIIIIlIlI(llllllllllllIllIIlIlIlIllIlIllll.isReadable() ? 1 : 0)) {
            return;
        }
        try {
            final int llllllllllllIllIIlIlIlIllIllIlIl = llllllllllllIllIIlIlIlIllIlIllll.readableBytes();
            this.z.avail_in = llllllllllllIllIIlIlIlIllIllIlIl;
            if (lIIllIIlIIIIlIIl(llllllllllllIllIIlIlIlIllIlIllll.hasArray() ? 1 : 0)) {
                this.z.next_in = llllllllllllIllIIlIlIlIllIlIllll.array();
                this.z.next_in_index = llllllllllllIllIIlIlIlIllIlIllll.arrayOffset() + llllllllllllIllIIlIlIlIllIlIllll.readerIndex();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final byte[] llllllllllllIllIIlIlIlIllIlllIIl = new byte[llllllllllllIllIIlIlIlIllIllIlIl];
                llllllllllllIllIIlIlIlIllIlIllll.getBytes(llllllllllllIllIIlIlIlIllIlIllll.readerIndex(), llllllllllllIllIIlIlIlIllIlllIIl);
                "".length();
                this.z.next_in = llllllllllllIllIIlIlIlIllIlllIIl;
                this.z.next_in_index = JZlibDecoder.llIlllIIIIlIll[0];
            }
            final int llllllllllllIllIIlIlIlIllIllIlII = this.z.next_in_index;
            final int llllllllllllIllIIlIlIlIllIllIIll = llllllllllllIllIIlIlIlIllIllIlIl << JZlibDecoder.llIlllIIIIlIll[1];
            final ByteBuf llllllllllllIllIIlIlIlIllIllIIlI = llllllllllllIllIIlIlIlIllIlIllII.alloc().heapBuffer(llllllllllllIllIIlIlIlIllIllIIll);
            Label_0823: {
                try {
                    do {
                        llllllllllllIllIIlIlIlIllIllIIlI.ensureWritable(this.z.avail_out = llllllllllllIllIIlIlIlIllIllIIll);
                        "".length();
                        this.z.next_out = llllllllllllIllIIlIlIlIllIllIIlI.array();
                        this.z.next_out_index = llllllllllllIllIIlIlIlIllIllIIlI.arrayOffset() + llllllllllllIllIIlIlIlIllIllIIlI.writerIndex();
                        final int llllllllllllIllIIlIlIlIllIlllIII = this.z.next_out_index;
                        int llllllllllllIllIIlIlIlIllIllIlll = this.z.inflate(JZlibDecoder.llIlllIIIIlIll[2]);
                        final int llllllllllllIllIIlIlIlIllIllIllI = this.z.next_out_index - llllllllllllIllIIlIlIlIllIlllIII;
                        if (lIIllIIlIIIIlIll(llllllllllllIllIIlIlIlIllIllIllI)) {
                            llllllllllllIllIIlIlIlIllIllIIlI.writerIndex(llllllllllllIllIIlIlIlIllIllIIlI.writerIndex() + llllllllllllIllIIlIlIlIllIllIllI);
                            "".length();
                        }
                        Label_0646: {
                            switch (llllllllllllIllIIlIlIlIllIllIlll) {
                                case 2: {
                                    if (lIIllIIlIIIIlIII(this.dictionary)) {
                                        ZlibUtil.fail(this.z, JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[4]], llllllllllllIllIIlIlIlIllIllIlll);
                                        "".length();
                                        if (((0x48 ^ 0xD) & ~(0x39 ^ 0x7C)) < -" ".length()) {
                                            return;
                                        }
                                        break;
                                    }
                                    else {
                                        llllllllllllIllIIlIlIlIllIllIlll = this.z.inflateSetDictionary(this.dictionary, this.dictionary.length);
                                        if (!lIIllIIlIIIIlIIl(llllllllllllIllIIlIlIlIllIllIlll)) {
                                            break;
                                        }
                                        ZlibUtil.fail(this.z, JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[5]], llllllllllllIllIIlIlIlIllIllIlll);
                                        "".length();
                                        if (-" ".length() > "  ".length()) {
                                            return;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                case 1: {
                                    this.finished = (JZlibDecoder.llIlllIIIIlIll[1] != 0);
                                    this.z.inflateEnd();
                                    "".length();
                                    "".length();
                                    if (-" ".length() == "   ".length()) {
                                        return;
                                    }
                                    break Label_0646;
                                }
                                case 0: {
                                    "".length();
                                    if (" ".length() < 0) {
                                        return;
                                    }
                                    break;
                                }
                                case -5: {
                                    if (!lIIllIIlIIIIllII(this.z.avail_in)) {
                                        break;
                                    }
                                    "".length();
                                    if ((0x31 ^ 0x35) < ((0xCA ^ 0xC1) & ~(0x8E ^ 0x85))) {
                                        return;
                                    }
                                    break Label_0646;
                                }
                                default: {
                                    ZlibUtil.fail(this.z, JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[6]], llllllllllllIllIIlIlIlIllIllIlll);
                                    break;
                                }
                            }
                            "".length();
                            continue;
                        }
                        llllllllllllIllIIlIlIlIllIlIllll.skipBytes(this.z.next_in_index - llllllllllllIllIIlIlIlIllIllIlII);
                        "".length();
                        if (lIIllIIlIIIIlIIl(llllllllllllIllIIlIlIlIllIllIIlI.isReadable() ? 1 : 0)) {
                            llllllllllllIllIIlIlIlIllIlIlIlI.add(llllllllllllIllIIlIlIlIllIllIIlI);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0823;
                        }
                        else {
                            llllllllllllIllIIlIlIlIllIllIIlI.release();
                            "".length();
                            "".length();
                            if (-(22 + 109 - 22 + 34 ^ 51 + 21 - 35 + 102) > 0) {
                                return;
                            }
                            break Label_0823;
                        }
                    } while (((0x46 ^ 0x1F) & ~(0x47 ^ 0x1E) & ~((0x27 ^ 0x11) & ~(0x6E ^ 0x58)) & ~((0x33 ^ 0x35) & ~(0xC5 ^ 0xC3))) != "   ".length());
                    return;
                }
                finally {
                    llllllllllllIllIIlIlIlIllIlIllll.skipBytes(this.z.next_in_index - llllllllllllIllIIlIlIlIllIllIlII);
                    "".length();
                    if (lIIllIIlIIIIlIIl(llllllllllllIllIIlIlIlIllIllIIlI.isReadable() ? 1 : 0)) {
                        llllllllllllIllIIlIlIlIllIlIlIlI.add(llllllllllllIllIIlIlIlIllIllIIlI);
                        "".length();
                        "".length();
                        if ((0x9 ^ 0xD) == 0x0) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIIlIlIlIllIllIIlI.release();
                        "".length();
                    }
                }
            }
            this.z.next_in = null;
            this.z.next_out = null;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        finally {
            this.z.next_in = null;
            this.z.next_out = null;
        }
    }
    
    private static String lIIllIIlIIIIIlIl(String llllllllllllIllIIlIlIlIlIlllIlll, final String llllllllllllIllIIlIlIlIlIllllIll) {
        llllllllllllIllIIlIlIlIlIlllIlll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIlIlIlIlllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIlIlIlIllllIlI = new StringBuilder();
        final char[] llllllllllllIllIIlIlIlIlIllllIIl = llllllllllllIllIIlIlIlIlIllllIll.toCharArray();
        int llllllllllllIllIIlIlIlIlIllllIII = JZlibDecoder.llIlllIIIIlIll[0];
        final long llllllllllllIllIIlIlIlIlIlllIIlI = (Object)((String)llllllllllllIllIIlIlIlIlIlllIlll).toCharArray();
        final byte llllllllllllIllIIlIlIlIlIlllIIIl = (byte)llllllllllllIllIIlIlIlIlIlllIIlI.length;
        double llllllllllllIllIIlIlIlIlIlllIIII = JZlibDecoder.llIlllIIIIlIll[0];
        while (lIIllIIlIIIIllIl((int)llllllllllllIllIIlIlIlIlIlllIIII, llllllllllllIllIIlIlIlIlIlllIIIl)) {
            final char llllllllllllIllIIlIlIlIlIlllllIl = llllllllllllIllIIlIlIlIlIlllIIlI[llllllllllllIllIIlIlIlIlIlllIIII];
            llllllllllllIllIIlIlIlIlIllllIlI.append((char)(llllllllllllIllIIlIlIlIlIlllllIl ^ llllllllllllIllIIlIlIlIlIllllIIl[llllllllllllIllIIlIlIlIlIllllIII % llllllllllllIllIIlIlIlIlIllllIIl.length]));
            "".length();
            ++llllllllllllIllIIlIlIlIlIllllIII;
            ++llllllllllllIllIIlIlIlIlIlllIIII;
            "".length();
            if ((14 + 136 - 33 + 31 ^ 4 + 6 + 91 + 43) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIlIlIlIllllIlI);
    }
    
    private static void lIIllIIlIIIIIllI() {
        (llIlllIIIIlIlI = new String[JZlibDecoder.llIlllIIIIlIll[7]])[JZlibDecoder.llIlllIIIIlIll[0]] = lIIllIIlIIIIIIll("1fEpH2tT6Hg=", "vPKXJ");
        JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[1]] = lIIllIIlIIIIIIll("6WATA19UxHfG1Pp61bDZbHFsebTeLfLI", "FLAoH");
        JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[2]] = lIIllIIlIIIIIlII("RRouCqFGU+YnbRby419baw==", "vPPKQ");
        JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[3]] = lIIllIIlIIIIIlII("izljQB610+El5o6nkqmS5O5YrxkZ4rW+", "emgCH");
        JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[4]] = lIIllIIlIIIIIlIl("DwoRJxwbHRc7AgIAHGgXCgYePQMO", "korHq");
        JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[5]] = lIIllIIlIIIIIlIl("BTMlAjEHcjgBdBA3OE4gCzdsCj0AJiUBOgIgNQ==", "cRLnT");
        JZlibDecoder.llIlllIIIIlIlI[JZlibDecoder.llIlllIIIIlIll[6]] = lIIllIIlIIIIIlIl("Fh05KQgCCj81FhsXNGYDExE2MxcX", "rxZFe");
    }
    
    private static boolean lIIllIIlIIIIllII(final int llllllllllllIllIIlIlIlIlIllIIIll) {
        return llllllllllllIllIIlIlIlIlIllIIIll <= 0;
    }
    
    private static String lIIllIIlIIIIIIll(final String llllllllllllIllIIlIlIlIllIIlIlll, final String llllllllllllIllIIlIlIlIllIIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIlIllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIlIllIIlIllI.getBytes(StandardCharsets.UTF_8)), JZlibDecoder.llIlllIIIIlIll[8]), "DES");
            final Cipher llllllllllllIllIIlIlIlIllIIllIll = Cipher.getInstance("DES");
            llllllllllllIllIIlIlIlIllIIllIll.init(JZlibDecoder.llIlllIIIIlIll[2], llllllllllllIllIIlIlIlIllIIlllII);
            return new String(llllllllllllIllIIlIlIlIllIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIlIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIlIllIIllIlI) {
            llllllllllllIllIIlIlIlIllIIllIlI.printStackTrace();
            return null;
        }
    }
}
