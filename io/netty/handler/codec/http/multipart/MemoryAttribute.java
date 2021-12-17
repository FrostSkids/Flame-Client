// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpConstants;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.util.ReferenceCounted;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBufHolder;

public class MemoryAttribute extends AbstractMemoryHttpData implements Attribute
{
    private static final /* synthetic */ int[] lIIllllIIIlllI;
    private static final /* synthetic */ String[] lIIllllIIIlIlI;
    
    @Override
    public InterfaceHttpData.HttpDataType getHttpDataType() {
        return InterfaceHttpData.HttpDataType.Attribute;
    }
    
    private static boolean llIlllIlIlIllII(final int lllllllllllllIIlIIlIlllIlIIllllI) {
        return lllllllllllllIIlIIlIlllIlIIllllI < 0;
    }
    
    private static boolean llIlllIlIlIllIl(final int lllllllllllllIIlIIlIlllIlIlIIIII) {
        return lllllllllllllIIlIIlIlllIlIlIIIII == 0;
    }
    
    private static String llIlllIlIlIIIII(final String lllllllllllllIIlIIlIlllIllIlIIlI, final String lllllllllllllIIlIIlIlllIllIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlllIllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), MemoryAttribute.lIIllllIIIlllI[5]), "DES");
            final Cipher lllllllllllllIIlIIlIlllIllIlIllI = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIlllIllIlIllI.init(MemoryAttribute.lIIllllIIIlllI[2], lllllllllllllIIlIIlIlllIllIlIlll);
            return new String(lllllllllllllIIlIIlIlllIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlllIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlllIllIlIlIl) {
            lllllllllllllIIlIIlIlllIllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static int llIlllIlIlIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void llIlllIlIlIIlll() {
        (lIIllllIIIlllI = new int[6])[0] = ((83 + 202 - 90 + 43 ^ 83 + 104 - 152 + 146) & (0x69 ^ 0x3A ^ (0x16 ^ 0x1E) ^ -" ".length()));
        MemoryAttribute.lIIllllIIIlllI[1] = " ".length();
        MemoryAttribute.lIIllllIIIlllI[2] = "  ".length();
        MemoryAttribute.lIIllllIIIlllI[3] = (0x66 ^ 0x5B);
        MemoryAttribute.lIIllllIIIlllI[4] = "   ".length();
        MemoryAttribute.lIIllllIIIlllI[5] = (0xB ^ 0x6E ^ (0xED ^ 0x80));
    }
    
    private static boolean llIlllIlIlIllll(final int lllllllllllllIIlIIlIlllIlIlIIlll, final int lllllllllllllIIlIIlIlllIlIlIIllI) {
        return lllllllllllllIIlIIlIlllIlIlIIlll < lllllllllllllIIlIIlIlllIlIlIIllI;
    }
    
    @Override
    public Attribute duplicate() {
        final MemoryAttribute lllllllllllllIIlIIlIllllIIIlIlll = new MemoryAttribute(this.getName());
        lllllllllllllIIlIIlIllllIIIlIlll.setCharset(this.getCharset());
        final ByteBuf lllllllllllllIIlIIlIllllIIIlIllI = this.content();
        if (llIlllIlIlIlllI(lllllllllllllIIlIIlIllllIIIlIllI)) {
            try {
                lllllllllllllIIlIIlIllllIIIlIlll.setContent(lllllllllllllIIlIIlIllllIIIlIllI.duplicate());
                "".length();
                if ("  ".length() == " ".length()) {
                    return null;
                }
            }
            catch (IOException lllllllllllllIIlIIlIllllIIIllIIl) {
                throw new ChannelException(lllllllllllllIIlIIlIllllIIIllIIl);
            }
        }
        return lllllllllllllIIlIIlIllllIIIlIlll;
    }
    
    @Override
    public Attribute copy() {
        final MemoryAttribute lllllllllllllIIlIIlIllllIIlIIIll = new MemoryAttribute(this.getName());
        lllllllllllllIIlIIlIllllIIlIIIll.setCharset(this.getCharset());
        final ByteBuf lllllllllllllIIlIIlIllllIIlIIIlI = this.content();
        if (llIlllIlIlIlllI(lllllllllllllIIlIIlIllllIIlIIIlI)) {
            try {
                lllllllllllllIIlIIlIllllIIlIIIll.setContent(lllllllllllllIIlIIlIllllIIlIIIlI.copy());
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (IOException lllllllllllllIIlIIlIllllIIlIIlIl) {
                throw new ChannelException(lllllllllllllIIlIIlIllllIIlIIlIl);
            }
        }
        return lllllllllllllIIlIIlIllllIIlIIIll;
    }
    
    private static String llIlllIlIIlllll(final String lllllllllllllIIlIIlIlllIlIlIllIl, final String lllllllllllllIIlIIlIlllIlIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlllIlIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlllIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIlllIlIllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIlllIlIllIIIl.init(MemoryAttribute.lIIllllIIIlllI[2], lllllllllllllIIlIIlIlllIlIllIIlI);
            return new String(lllllllllllllIIlIIlIlllIlIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlllIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlllIlIllIIII) {
            lllllllllllllIIlIIlIlllIlIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
    
    @Override
    public Attribute retain(final int lllllllllllllIIlIIlIllllIIIIlIll) {
        super.retain(lllllllllllllIIlIIlIllllIIIIlIll);
        "".length();
        return this;
    }
    
    private static void llIlllIlIlIIIlI() {
        (lIIllllIIIlIlI = new String[MemoryAttribute.lIIllllIIIlllI[4]])[MemoryAttribute.lIIllllIIIlllI[0]] = llIlllIlIIlllll("vAkaloyYU6Q=", "pilix");
        MemoryAttribute.lIIllllIIIlIlI[MemoryAttribute.lIIllllIIIlllI[1]] = llIlllIlIlIIIII("CtGlXHE6VJVTIkcI1MogNg==", "vsjBU");
        MemoryAttribute.lIIllllIIIlIlI[MemoryAttribute.lIIllllIIIlllI[2]] = llIlllIlIlIIIIl("cwIrAxlz", "SuBwq");
    }
    
    @Override
    public Attribute retain() {
        super.retain();
        "".length();
        return this;
    }
    
    public int compareTo(final Attribute lllllllllllllIIlIIlIllllIIlIllIl) {
        return this.getName().compareToIgnoreCase(lllllllllllllIIlIIlIllllIIlIllIl.getName());
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIIlIllllIIlllIlI) {
        if (llIlllIlIlIllIl((lllllllllllllIIlIIlIllllIIlllIlI instanceof Attribute) ? 1 : 0)) {
            return MemoryAttribute.lIIllllIIIlllI[0] != 0;
        }
        final Attribute lllllllllllllIIlIIlIllllIIllllII = (Attribute)lllllllllllllIIlIIlIllllIIlllIlI;
        return this.getName().equalsIgnoreCase(lllllllllllllIIlIIlIllllIIllllII.getName());
    }
    
    private static boolean llIlllIlIlIlIlI(final int lllllllllllllIIlIIlIlllIlIIlllII) {
        return lllllllllllllIIlIIlIlllIlIIlllII > 0;
    }
    
    public MemoryAttribute(final String lllllllllllllIIlIIlIllllIllIlIlI) {
        super(lllllllllllllIIlIIlIllllIllIlIlI, HttpConstants.DEFAULT_CHARSET, 0L);
    }
    
    private static boolean llIlllIlIlIlIIl(final Object lllllllllllllIIlIIlIlllIlIlIIIlI) {
        return lllllllllllllIIlIIlIlllIlIlIIIlI == null;
    }
    
    static {
        llIlllIlIlIIlll();
        llIlllIlIlIIIlI();
    }
    
    @Override
    public int compareTo(final InterfaceHttpData lllllllllllllIIlIIlIllllIIllIlIl) {
        if (llIlllIlIlIllIl((lllllllllllllIIlIIlIllllIIllIlIl instanceof Attribute) ? 1 : 0)) {
            throw new ClassCastException(String.valueOf(new StringBuilder().append(MemoryAttribute.lIIllllIIIlIlI[MemoryAttribute.lIIllllIIIlllI[1]]).append(this.getHttpDataType()).append(MemoryAttribute.lIIllllIIIlIlI[MemoryAttribute.lIIllllIIIlllI[2]]).append(lllllllllllllIIlIIlIllllIIllIlIl.getHttpDataType())));
        }
        return this.compareTo((Attribute)lllllllllllllIIlIIlIllllIIllIlIl);
    }
    
    public MemoryAttribute(final String lllllllllllllIIlIIlIllllIllIIIlI, final String lllllllllllllIIlIIlIllllIllIIlII) throws IOException {
        super(lllllllllllllIIlIIlIllllIllIIIlI, HttpConstants.DEFAULT_CHARSET, 0L);
        this.setValue(lllllllllllllIIlIIlIllllIllIIlII);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(this.getName()).append((char)MemoryAttribute.lIIllllIIIlllI[3]).append(this.getValue()));
    }
    
    private static boolean llIlllIlIlIlllI(final Object lllllllllllllIIlIIlIlllIlIlIIlII) {
        return lllllllllllllIIlIIlIlllIlIlIIlII != null;
    }
    
    private static String llIlllIlIlIIIIl(String lllllllllllllIIlIIlIlllIlIllllll, final String lllllllllllllIIlIIlIlllIlIlllllI) {
        lllllllllllllIIlIIlIlllIlIllllll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIlllIlIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIlllIllIIIIlI = new StringBuilder();
        final char[] lllllllllllllIIlIIlIlllIllIIIIIl = lllllllllllllIIlIIlIlllIlIlllllI.toCharArray();
        int lllllllllllllIIlIIlIlllIllIIIIII = MemoryAttribute.lIIllllIIIlllI[0];
        final String lllllllllllllIIlIIlIlllIlIlllIlI = (Object)((String)lllllllllllllIIlIIlIlllIlIllllll).toCharArray();
        final byte lllllllllllllIIlIIlIlllIlIlllIIl = (byte)lllllllllllllIIlIIlIlllIlIlllIlI.length;
        int lllllllllllllIIlIIlIlllIlIlllIII = MemoryAttribute.lIIllllIIIlllI[0];
        while (llIlllIlIlIllll(lllllllllllllIIlIIlIlllIlIlllIII, lllllllllllllIIlIIlIlllIlIlllIIl)) {
            final char lllllllllllllIIlIIlIlllIllIIIlIl = lllllllllllllIIlIIlIlllIlIlllIlI[lllllllllllllIIlIIlIlllIlIlllIII];
            lllllllllllllIIlIIlIlllIllIIIIlI.append((char)(lllllllllllllIIlIIlIlllIllIIIlIl ^ lllllllllllllIIlIIlIlllIllIIIIIl[lllllllllllllIIlIIlIlllIllIIIIII % lllllllllllllIIlIIlIlllIllIIIIIl.length]));
            "".length();
            ++lllllllllllllIIlIIlIlllIllIIIIII;
            ++lllllllllllllIIlIIlIlllIlIlllIII;
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIlllIllIIIIlI);
    }
    
    private static int llIlllIlIlIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public String getValue() {
        return this.getByteBuf().toString(this.charset);
    }
    
    @Override
    public void addContent(final ByteBuf lllllllllllllIIlIIlIllllIlIIlIll, final boolean lllllllllllllIIlIIlIllllIlIIIllI) throws IOException {
        final int lllllllllllllIIlIIlIllllIlIIlIIl = lllllllllllllIIlIIlIllllIlIIlIll.readableBytes();
        if (llIlllIlIlIlIlI(llIlllIlIlIlIll(this.definedSize, 0L)) && llIlllIlIlIllII(llIlllIlIlIlIll(this.definedSize, this.size + lllllllllllllIIlIIlIllllIlIIlIIl))) {
            this.definedSize = this.size + lllllllllllllIIlIIlIllllIlIIlIIl;
        }
        super.addContent(lllllllllllllIIlIIlIllllIlIIlIll, lllllllllllllIIlIIlIllllIlIIIllI);
    }
    
    @Override
    public void setValue(final String lllllllllllllIIlIIlIllllIlIlIlll) throws IOException {
        if (llIlllIlIlIlIIl(lllllllllllllIIlIIlIllllIlIlIlll)) {
            throw new NullPointerException(MemoryAttribute.lIIllllIIIlIlI[MemoryAttribute.lIIllllIIIlllI[0]]);
        }
        final byte[] lllllllllllllIIlIIlIllllIlIlIllI = lllllllllllllIIlIIlIllllIlIlIlll.getBytes(this.charset.name());
        final ByteBuf lllllllllllllIIlIIlIllllIlIlIlIl = Unpooled.wrappedBuffer(lllllllllllllIIlIIlIllllIlIlIllI);
        if (llIlllIlIlIlIlI(llIlllIlIlIlIII(this.definedSize, 0L))) {
            this.definedSize = lllllllllllllIIlIIlIllllIlIlIlIl.readableBytes();
        }
        this.setContent(lllllllllllllIIlIIlIllllIlIlIlIl);
    }
}
