// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.util.Arrays;
import io.netty.buffer.ByteBufHolder;
import io.netty.handler.codec.http.HttpConstants;
import io.netty.util.ReferenceCounted;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import io.netty.util.AbstractReferenceCounted;

public abstract class AbstractHttpData extends AbstractReferenceCounted implements HttpData
{
    private static final /* synthetic */ Pattern REPLACE_PATTERN;
    protected /* synthetic */ long definedSize;
    protected /* synthetic */ Charset charset;
    private static final /* synthetic */ String[] lIlIIIllIlIlII;
    protected /* synthetic */ boolean completed;
    private static final /* synthetic */ int[] lIlIIIllIllIll;
    protected /* synthetic */ long size;
    protected final /* synthetic */ String name;
    private static final /* synthetic */ Pattern STRIP_PATTERN;
    
    private static void lllIIIlllllIllI() {
        (lIlIIIllIllIll = new int[9])[0] = ((0xFA ^ 0xA4 ^ (0xD0 ^ 0xB6)) & (31 + 86 - 114 + 162 ^ 10 + 156 - 165 + 156 ^ -" ".length()));
        AbstractHttpData.lIlIIIllIllIll[1] = " ".length();
        AbstractHttpData.lIlIIIllIllIll[2] = "  ".length();
        AbstractHttpData.lIlIIIllIllIll[3] = "   ".length();
        AbstractHttpData.lIlIIIllIllIll[4] = (0x94 ^ 0x90);
        AbstractHttpData.lIlIIIllIllIll[5] = (0x47 ^ 0x62 ^ (0x1E ^ 0x3E));
        AbstractHttpData.lIlIIIllIllIll[6] = (0xBE ^ 0xA2 ^ (0x81 ^ 0x9B));
        AbstractHttpData.lIlIIIllIllIll[7] = (0xFC ^ 0x90 ^ (0x53 ^ 0x38));
        AbstractHttpData.lIlIIIllIllIll[8] = (" ".length() ^ (0x80 ^ 0x89));
    }
    
    private static String lllIIIllllIllII(String lllllllllllllIIIllllIIIIIIlIIIlI, final String lllllllllllllIIIllllIIIIIIlIIIIl) {
        lllllllllllllIIIllllIIIIIIlIIIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllllIIIIIIlIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllllIIIIIIlIIlIl = new StringBuilder();
        final char[] lllllllllllllIIIllllIIIIIIlIIlII = lllllllllllllIIIllllIIIIIIlIIIIl.toCharArray();
        int lllllllllllllIIIllllIIIIIIlIIIll = AbstractHttpData.lIlIIIllIllIll[0];
        final int lllllllllllllIIIllllIIIIIIIlllIl = (Object)((String)lllllllllllllIIIllllIIIIIIlIIIlI).toCharArray();
        final boolean lllllllllllllIIIllllIIIIIIIlllII = lllllllllllllIIIllllIIIIIIIlllIl.length != 0;
        byte lllllllllllllIIIllllIIIIIIIllIll = (byte)AbstractHttpData.lIlIIIllIllIll[0];
        while (lllIIIllllllIlI(lllllllllllllIIIllllIIIIIIIllIll, lllllllllllllIIIllllIIIIIIIlllII ? 1 : 0)) {
            final char lllllllllllllIIIllllIIIIIIlIlIII = lllllllllllllIIIllllIIIIIIIlllIl[lllllllllllllIIIllllIIIIIIIllIll];
            lllllllllllllIIIllllIIIIIIlIIlIl.append((char)(lllllllllllllIIIllllIIIIIIlIlIII ^ lllllllllllllIIIllllIIIIIIlIIlII[lllllllllllllIIIllllIIIIIIlIIIll % lllllllllllllIIIllllIIIIIIlIIlII.length]));
            "".length();
            ++lllllllllllllIIIllllIIIIIIlIIIll;
            ++lllllllllllllIIIllllIIIIIIIllIll;
            "".length();
            if ((116 + 79 - 121 + 79 ^ 42 + 5 + 55 + 54) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllllIIIIIIlIIlIl);
    }
    
    private static void lllIIIllllIlllI() {
        (lIlIIIllIlIlII = new String[AbstractHttpData.lIlIIIllIllIll[7]])[AbstractHttpData.lIlIIIllIllIll[0]] = lllIIIllllIIIIl("ckyGoRgKXkA=", "yeHdx");
        AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[1]] = lllIIIllllIIIIl("/07UCcSWXuc=", "XARxG");
        AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[2]] = lllIIIllllIllII("", "CmezW");
        AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[3]] = lllIIIllllIIIIl("oj3ppay1NA8lthJ/ey4WVQ==", "BGkWg");
        AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[4]] = lllIIIllllIllIl("uAfy8ciCXgE=", "TVBWF");
        AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[5]] = lllIIIllllIllII("QmdVMx4ZcxMxMUF8EzEsQw==", "jXomB");
        AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[6]] = lllIIIllllIIIIl("46G99uFl0jM=", "grWNt");
    }
    
    private static boolean lllIIIllllllIII(final int lllllllllllllIIIllllIIIIIIIlIIII) {
        return lllllllllllllIIIllllIIIIIIIlIIII != 0;
    }
    
    @Override
    protected void deallocate() {
        this.delete();
    }
    
    private static boolean lllIIIlllllIlll(final Object lllllllllllllIIIllllIIIIIIIlIIlI) {
        return lllllllllllllIIIllllIIIIIIIlIIlI == null;
    }
    
    @Override
    public ByteBuf content() {
        try {
            return this.getByteBuf();
        }
        catch (IOException lllllllllllllIIIllllIIIIIllIllIl) {
            throw new ChannelException(lllllllllllllIIIllllIIIIIllIllIl);
        }
    }
    
    @Override
    public HttpData retain(final int lllllllllllllIIIllllIIIIIlIllllI) {
        super.retain(lllllllllllllIIIllllIIIIIlIllllI);
        "".length();
        return this;
    }
    
    @Override
    public long length() {
        return this.size;
    }
    
    private static String lllIIIllllIIIIl(final String lllllllllllllIIIllllIIIIIIllIlll, final String lllllllllllllIIIllllIIIIIIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllIIIIIIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllIIIIIIlllIIl.init(AbstractHttpData.lIlIIIllIllIll[2], lllllllllllllIIIllllIIIIIIlllIlI);
            return new String(lllllllllllllIIIllllIIIIIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIIIIIlllIII) {
            lllllllllllllIIIllllIIIIIIlllIII.printStackTrace();
            return null;
        }
    }
    
    protected AbstractHttpData(String lllllllllllllIIIllllIIIIlIIIIlII, final Charset lllllllllllllIIIllllIIIIlIIIIIll, final long lllllllllllllIIIllllIIIIlIIIIIlI) {
        this.charset = HttpConstants.DEFAULT_CHARSET;
        if (lllIIIlllllIlll(lllllllllllllIIIllllIIIIlIIIIlII)) {
            throw new NullPointerException(AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[0]]);
        }
        lllllllllllllIIIllllIIIIlIIIIlII = AbstractHttpData.REPLACE_PATTERN.matcher(lllllllllllllIIIllllIIIIlIIIIlII).replaceAll(AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[1]]);
        lllllllllllllIIIllllIIIIlIIIIlII = AbstractHttpData.STRIP_PATTERN.matcher(lllllllllllllIIIllllIIIIlIIIIlII).replaceAll(AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[2]]);
        if (lllIIIllllllIII(lllllllllllllIIIllllIIIIlIIIIlII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[3]]);
        }
        this.name = lllllllllllllIIIllllIIIIlIIIIlII;
        if (lllIIIllllllIIl(lllllllllllllIIIllllIIIIlIIIIIll)) {
            this.setCharset(lllllllllllllIIIllllIIIIlIIIIIll);
        }
        this.definedSize = lllllllllllllIIIllllIIIIlIIIIIlI;
    }
    
    static {
        lllIIIlllllIllI();
        lllIIIllllIlllI();
        STRIP_PATTERN = Pattern.compile(AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[5]]);
        REPLACE_PATTERN = Pattern.compile(AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[6]]);
    }
    
    private static boolean lllIIIllllllIlI(final int lllllllllllllIIIllllIIIIIIIlIlll, final int lllllllllllllIIIllllIIIIIIIlIllI) {
        return lllllllllllllIIIllllIIIIIIIlIlll < lllllllllllllIIIllllIIIIIIIlIllI;
    }
    
    private static String lllIIIllllIllIl(final String lllllllllllllIIIllllIIIIIlIIIlII, final String lllllllllllllIIIllllIIIIIlIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIIIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), AbstractHttpData.lIlIIIllIllIll[8]), "DES");
            final Cipher lllllllllllllIIIllllIIIIIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIllllIIIIIlIIIllI.init(AbstractHttpData.lIlIIIllIllIll[2], lllllllllllllIIIllllIIIIIlIIIlll);
            return new String(lllllllllllllIIIllllIIIIIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIIIIlIIIlIl) {
            lllllllllllllIIIllllIIIIIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public boolean isCompleted() {
        return this.completed;
    }
    
    private static boolean lllIIIllllllIIl(final Object lllllllllllllIIIllllIIIIIIIlIlII) {
        return lllllllllllllIIIllllIIIIIIIlIlII != null;
    }
    
    @Override
    public void setCharset(final Charset lllllllllllllIIIllllIIIIIlllIIll) {
        if (lllIIIlllllIlll(lllllllllllllIIIllllIIIIIlllIIll)) {
            throw new NullPointerException(AbstractHttpData.lIlIIIllIlIlII[AbstractHttpData.lIlIIIllIllIll[4]]);
        }
        this.charset = lllllllllllllIIIllllIIIIIlllIIll;
    }
    
    @Override
    public HttpData retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public Charset getCharset() {
        return this.charset;
    }
}
