// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import io.netty.buffer.Unpooled;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.nio.charset.Charset;
import io.netty.util.AbstractReferenceCounted;

final class InternalAttribute extends AbstractReferenceCounted implements InterfaceHttpData
{
    private final /* synthetic */ Charset charset;
    private /* synthetic */ int size;
    private static final /* synthetic */ int[] lIIIIlIlIllIIl;
    private static final /* synthetic */ String[] lIIIIlIlIlIIll;
    private final /* synthetic */ List<ByteBuf> value;
    
    private static boolean lIlllIlIIIIlllI(final int lllllllllllllIlIIlIlIlIllIlllIll) {
        return lllllllllllllIlIIlIlIlIllIlllIll != 0;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIIlIlIllIIIlIllIl) {
        if (lIlllIlIIIIllIl((lllllllllllllIlIIlIlIllIIIlIllIl instanceof Attribute) ? 1 : 0)) {
            return InternalAttribute.lIIIIlIlIllIIl[0] != 0;
        }
        final Attribute lllllllllllllIlIIlIlIllIIIlIlIll = (Attribute)lllllllllllllIlIIlIlIllIIIlIllIl;
        return this.getName().equalsIgnoreCase(lllllllllllllIlIIlIlIllIIIlIlIll.getName());
    }
    
    private static String lIlllIIlllllIlI(final String lllllllllllllIlIIlIlIlIllllIIIII, final String lllllllllllllIlIIlIlIlIlllIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIlIllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIlIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIlIllllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIlIllllIIlII.init(InternalAttribute.lIIIIlIlIllIIl[2], lllllllllllllIlIIlIlIlIllllIIlIl);
            return new String(lllllllllllllIlIIlIlIlIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIlIllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIlIllllIIIll) {
            lllllllllllllIlIIlIlIlIllllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIlIIIIllll(final int lllllllllllllIlIIlIlIlIlllIIIIlI, final int lllllllllllllIlIIlIlIlIlllIIIIIl) {
        return lllllllllllllIlIIlIlIlIlllIIIIlI < lllllllllllllIlIIlIlIlIlllIIIIIl;
    }
    
    private static void lIlllIlIIIIlIlI() {
        (lIIIIlIlIllIIl = new int[8])[0] = ((0x31 ^ 0x2A ^ (0x26 ^ 0x7C)) & (0xE0 ^ 0x85 ^ (0x20 ^ 0x4) ^ -" ".length()));
        InternalAttribute.lIIIIlIlIllIIl[1] = " ".length();
        InternalAttribute.lIIIIlIlIllIIl[2] = "  ".length();
        InternalAttribute.lIIIIlIlIllIIl[3] = "   ".length();
        InternalAttribute.lIIIIlIlIllIIl[4] = (0x5B ^ 0x67 ^ (0x39 ^ 0x1));
        InternalAttribute.lIIIIlIlIllIIl[5] = (0xA4 ^ 0xA1);
        InternalAttribute.lIIIIlIlIllIIl[6] = (0xF8 ^ 0xAA ^ (0xE9 ^ 0xBD));
        InternalAttribute.lIIIIlIlIllIIl[7] = (0x9A ^ 0x92);
    }
    
    private static String lIlllIIlllllIll(String lllllllllllllIlIIlIlIlIlllIIllIl, final String lllllllllllllIlIIlIlIlIlllIIllII) {
        lllllllllllllIlIIlIlIlIlllIIllIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIlIlIlllIIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlIlIlllIlIIII = new StringBuilder();
        final char[] lllllllllllllIlIIlIlIlIlllIIllll = lllllllllllllIlIIlIlIlIlllIIllII.toCharArray();
        int lllllllllllllIlIIlIlIlIlllIIlllI = InternalAttribute.lIIIIlIlIllIIl[0];
        final short lllllllllllllIlIIlIlIlIlllIIlIII = (Object)((String)lllllllllllllIlIIlIlIlIlllIIllIl).toCharArray();
        final short lllllllllllllIlIIlIlIlIlllIIIlll = (short)lllllllllllllIlIIlIlIlIlllIIlIII.length;
        double lllllllllllllIlIIlIlIlIlllIIIllI = InternalAttribute.lIIIIlIlIllIIl[0];
        while (lIlllIlIIIIllll((int)lllllllllllllIlIIlIlIlIlllIIIllI, lllllllllllllIlIIlIlIlIlllIIIlll)) {
            final char lllllllllllllIlIIlIlIlIlllIlIIll = lllllllllllllIlIIlIlIlIlllIIlIII[lllllllllllllIlIIlIlIlIlllIIIllI];
            lllllllllllllIlIIlIlIlIlllIlIIII.append((char)(lllllllllllllIlIIlIlIlIlllIlIIll ^ lllllllllllllIlIIlIlIlIlllIIllll[lllllllllllllIlIIlIlIlIlllIIlllI % lllllllllllllIlIIlIlIlIlllIIllll.length]));
            "".length();
            ++lllllllllllllIlIIlIlIlIlllIIlllI;
            ++lllllllllllllIlIIlIlIlIlllIIIllI;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlIlIlllIlIIII);
    }
    
    public void setValue(final String lllllllllllllIlIIlIlIllIIIlllllI, final int lllllllllllllIlIIlIlIllIIIllllIl) {
        if (lIlllIlIIIIlIll(lllllllllllllIlIIlIlIllIIIlllllI)) {
            throw new NullPointerException(InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[2]]);
        }
        final ByteBuf lllllllllllllIlIIlIlIllIIIllllII = Unpooled.copiedBuffer(lllllllllllllIlIIlIlIllIIIlllllI, this.charset);
        final ByteBuf lllllllllllllIlIIlIlIllIIIlllIll = this.value.set(lllllllllllllIlIIlIlIllIIIllllIl, lllllllllllllIlIIlIlIllIIIllllII);
        if (lIlllIlIIIIllII(lllllllllllllIlIIlIlIllIIIlllIll)) {
            this.size -= lllllllllllllIlIIlIlIllIIIlllIll.readableBytes();
            lllllllllllllIlIIlIlIllIIIlllIll.release();
            "".length();
        }
        this.size += lllllllllllllIlIIlIlIllIIIllllII.readableBytes();
    }
    
    static {
        lIlllIlIIIIlIlI();
        lIlllIIllllllII();
    }
    
    public int size() {
        return this.size;
    }
    
    private static boolean lIlllIlIIIIllII(final Object lllllllllllllIlIIlIlIlIllIllllll) {
        return lllllllllllllIlIIlIlIlIllIllllll != null;
    }
    
    public int compareTo(final InternalAttribute lllllllllllllIlIIlIlIllIIIIlIlIl) {
        return this.getName().compareToIgnoreCase(lllllllllllllIlIIlIlIllIIIIlIlIl.getName());
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIlIIlIlIllIIIIIlIIl = new StringBuilder();
        final Iterator lllllllllllllIlIIlIlIllIIIIIlIll = this.value.iterator();
        while (lIlllIlIIIIlllI(lllllllllllllIlIIlIlIllIIIIIlIll.hasNext() ? 1 : 0)) {
            final ByteBuf lllllllllllllIlIIlIlIllIIIIIllII = lllllllllllllIlIIlIlIllIIIIIlIll.next();
            lllllllllllllIlIIlIlIllIIIIIlIIl.append(lllllllllllllIlIIlIlIllIIIIIllII.toString(this.charset));
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlIllIIIIIlIIl);
    }
    
    @Override
    public int compareTo(final InterfaceHttpData lllllllllllllIlIIlIlIllIIIlIIIII) {
        if (lIlllIlIIIIllIl((lllllllllllllIlIIlIlIllIIIlIIIII instanceof InternalAttribute) ? 1 : 0)) {
            throw new ClassCastException(String.valueOf(new StringBuilder().append(InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[3]]).append(this.getHttpDataType()).append(InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[4]]).append(lllllllllllllIlIIlIlIllIIIlIIIII.getHttpDataType())));
        }
        return this.compareTo((InternalAttribute)lllllllllllllIlIIlIlIllIIIlIIIII);
    }
    
    public void addValue(final String lllllllllllllIlIIlIlIllIIlIlIIlI) {
        if (lIlllIlIIIIlIll(lllllllllllllIlIIlIlIllIIlIlIIlI)) {
            throw new NullPointerException(InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[0]]);
        }
        final ByteBuf lllllllllllllIlIIlIlIllIIlIlIlII = Unpooled.copiedBuffer(lllllllllllllIlIIlIlIllIIlIlIIlI, this.charset);
        this.value.add(lllllllllllllIlIIlIlIllIIlIlIlII);
        "".length();
        this.size += lllllllllllllIlIIlIlIllIIlIlIlII.readableBytes();
    }
    
    private static void lIlllIIllllllII() {
        (lIIIIlIlIlIIll = new String[InternalAttribute.lIIIIlIlIllIIl[6]])[InternalAttribute.lIIIIlIlIllIIl[0]] = lIlllIIlllllIIl("vqLpkmBESrs=", "tBcgN");
        InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[1]] = lIlllIIlllllIlI("pATauy2vWL4=", "qfvhV");
        InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[2]] = lIlllIIlllllIll("MyI6Nig=", "ECVCM");
        InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[3]] = lIlllIIlllllIlI("/SAirUMSiKzVwlF88byubw==", "SyTyS");
        InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[4]] = lIlllIIlllllIlI("h+gS1HqFh4Y=", "JQaZO");
        InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[5]] = lIlllIIlllllIll("IBYmPBgHGT4YHh0KOzsfHR0=", "ixRYj");
    }
    
    private static boolean lIlllIlIIIIlIll(final Object lllllllllllllIlIIlIlIlIllIllllIl) {
        return lllllllllllllIlIIlIlIlIllIllllIl == null;
    }
    
    @Override
    protected void deallocate() {
    }
    
    public ByteBuf toByteBuf() {
        return Unpooled.compositeBuffer().addComponents(this.value).writerIndex(this.size()).readerIndex(InternalAttribute.lIIIIlIlIllIIl[0]);
    }
    
    private static boolean lIlllIlIIIIllIl(final int lllllllllllllIlIIlIlIlIllIlllIIl) {
        return lllllllllllllIlIIlIlIlIllIlllIIl == 0;
    }
    
    @Override
    public HttpDataType getHttpDataType() {
        return HttpDataType.InternalAttribute;
    }
    
    private static String lIlllIIlllllIIl(final String lllllllllllllIlIIlIlIlIllllIllIl, final String lllllllllllllIlIIlIlIlIllllIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIlIlllllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIlIllllIlllI.getBytes(StandardCharsets.UTF_8)), InternalAttribute.lIIIIlIlIllIIl[7]), "DES");
            final Cipher lllllllllllllIlIIlIlIlIlllllIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIlIlllllIIIl.init(InternalAttribute.lIIIIlIlIllIIl[2], lllllllllllllIlIIlIlIlIlllllIIlI);
            return new String(lllllllllllllIlIIlIlIlIlllllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIlIllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIlIlllllIIII) {
            lllllllllllllIlIIlIlIlIlllllIIII.printStackTrace();
            return null;
        }
    }
    
    public void addValue(final String lllllllllllllIlIIlIlIllIIlIIlIll, final int lllllllllllllIlIIlIlIllIIlIIIllI) {
        if (lIlllIlIIIIlIll(lllllllllllllIlIIlIlIllIIlIIlIll)) {
            throw new NullPointerException(InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[1]]);
        }
        final ByteBuf lllllllllllllIlIIlIlIllIIlIIlIIl = Unpooled.copiedBuffer(lllllllllllllIlIIlIlIllIIlIIlIll, this.charset);
        this.value.add(lllllllllllllIlIIlIlIllIIlIIIllI, lllllllllllllIlIIlIlIllIIlIIlIIl);
        this.size += lllllllllllllIlIIlIlIllIIlIIlIIl.readableBytes();
    }
    
    @Override
    public String getName() {
        return InternalAttribute.lIIIIlIlIlIIll[InternalAttribute.lIIIIlIlIllIIl[5]];
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
    
    InternalAttribute(final Charset lllllllllllllIlIIlIlIllIIlIllIll) {
        this.value = new ArrayList<ByteBuf>();
        this.charset = lllllllllllllIlIIlIlIllIIlIllIll;
    }
}
