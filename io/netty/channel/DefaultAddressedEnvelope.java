// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.ReferenceCounted;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.internal.StringUtil;
import java.net.SocketAddress;

public class DefaultAddressedEnvelope<M, A extends SocketAddress> implements AddressedEnvelope<M, A>
{
    private final /* synthetic */ A recipient;
    private final /* synthetic */ A sender;
    private final /* synthetic */ M message;
    private static final /* synthetic */ String[] lllIllIllIIlll;
    private static final /* synthetic */ int[] lllIllIllIlIII;
    
    @Override
    public String toString() {
        if (lIlIIlIlIIlIIIlI(this.sender)) {
            return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append((char)DefaultAddressedEnvelope.lllIllIllIlIII[2]).append(this.sender).append(DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[1]]).append(this.recipient).append(DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[3]]).append(this.message).append((char)DefaultAddressedEnvelope.lllIllIllIlIII[4]));
        }
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[5]]).append(this.recipient).append(DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[6]]).append(this.message).append((char)DefaultAddressedEnvelope.lllIllIllIlIII[4]));
    }
    
    private static boolean lIlIIlIlIIlIIIlI(final Object llllllllllllIlIllIIIllIlllllIIII) {
        return llllllllllllIlIllIIIllIlllllIIII != null;
    }
    
    @Override
    public A recipient() {
        return this.recipient;
    }
    
    private static void lIlIIlIlIIIlllll() {
        (lllIllIllIlIII = new int[9])[0] = ((0xB6 ^ 0xA2 ^ (0x31 ^ 0x60)) & (0x66 ^ 0x33 ^ (0x3A ^ 0x2A) ^ -" ".length()));
        DefaultAddressedEnvelope.lllIllIllIlIII[1] = " ".length();
        DefaultAddressedEnvelope.lllIllIllIlIII[2] = (0x6B ^ 0x6F ^ (0xBC ^ 0x90));
        DefaultAddressedEnvelope.lllIllIllIlIII[3] = "  ".length();
        DefaultAddressedEnvelope.lllIllIllIlIII[4] = (92 + 87 - 54 + 9 ^ 15 + 166 - 115 + 109);
        DefaultAddressedEnvelope.lllIllIllIlIII[5] = "   ".length();
        DefaultAddressedEnvelope.lllIllIllIlIII[6] = (0x77 ^ 0x73);
        DefaultAddressedEnvelope.lllIllIllIlIII[7] = (0x5C ^ 0x59);
        DefaultAddressedEnvelope.lllIllIllIlIII[8] = (0xCE ^ 0xC6);
    }
    
    @Override
    public boolean release() {
        return ReferenceCountUtil.release(this.message);
    }
    
    @Override
    public M content() {
        return this.message;
    }
    
    @Override
    public AddressedEnvelope<M, A> retain(final int llllllllllllIlIllIIIlllIIIllllIl) {
        ReferenceCountUtil.retain(this.message, llllllllllllIlIllIIIlllIIIllllIl);
        "".length();
        return this;
    }
    
    private static String lIlIIlIlIIIlllIl(String llllllllllllIlIllIIIlllIIIIIlIll, final String llllllllllllIlIllIIIlllIIIIIlIlI) {
        llllllllllllIlIllIIIlllIIIIIlIll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIlllIIIIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIlllIIIIIlllI = new StringBuilder();
        final char[] llllllllllllIlIllIIIlllIIIIIllIl = llllllllllllIlIllIIIlllIIIIIlIlI.toCharArray();
        int llllllllllllIlIllIIIlllIIIIIllII = DefaultAddressedEnvelope.lllIllIllIlIII[0];
        final int llllllllllllIlIllIIIlllIIIIIIllI = (Object)((String)llllllllllllIlIllIIIlllIIIIIlIll).toCharArray();
        final long llllllllllllIlIllIIIlllIIIIIIlIl = llllllllllllIlIllIIIlllIIIIIIllI.length;
        byte llllllllllllIlIllIIIlllIIIIIIlII = (byte)DefaultAddressedEnvelope.lllIllIllIlIII[0];
        while (lIlIIlIlIIlIIIll(llllllllllllIlIllIIIlllIIIIIIlII, (int)llllllllllllIlIllIIIlllIIIIIIlIl)) {
            final char llllllllllllIlIllIIIlllIIIIlIIIl = llllllllllllIlIllIIIlllIIIIIIllI[llllllllllllIlIllIIIlllIIIIIIlII];
            llllllllllllIlIllIIIlllIIIIIlllI.append((char)(llllllllllllIlIllIIIlllIIIIlIIIl ^ llllllllllllIlIllIIIlllIIIIIllIl[llllllllllllIlIllIIIlllIIIIIllII % llllllllllllIlIllIIIlllIIIIIllIl.length]));
            "".length();
            ++llllllllllllIlIllIIIlllIIIIIllII;
            ++llllllllllllIlIllIIIlllIIIIIIlII;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIlllIIIIIlllI);
    }
    
    private static String lIlIIlIlIIIllIll(final String llllllllllllIlIllIIIllIllllllIll, final String llllllllllllIlIllIIIllIllllllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIllIllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIllIllllllIlI.getBytes(StandardCharsets.UTF_8)), DefaultAddressedEnvelope.lllIllIllIlIII[8]), "DES");
            final Cipher llllllllllllIlIllIIIllIlllllllIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIIllIlllllllIl.init(DefaultAddressedEnvelope.lllIllIllIlIII[3], llllllllllllIlIllIIIllIllllllllI);
            return new String(llllllllllllIlIllIIIllIlllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIllIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIllIlllllllII) {
            llllllllllllIlIllIIIllIlllllllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIlIlIIIllllI() {
        (lllIllIllIIlll = new String[DefaultAddressedEnvelope.lllIllIllIlIII[7]])[DefaultAddressedEnvelope.lllIllIllIlIII[0]] = lIlIIlIlIIIllIll("gC7FWay5oR8=", "qnHsZ");
        DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[1]] = lIlIIlIlIIIlllII("iiIidnZLIDE=", "tcPPU");
        DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[3]] = lIlIIlIlIIIlllIl("fXQ=", "QTHnp");
        DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[5]] = lIlIIlIlIIIllIll("pgaTImfcGxQ=", "dDWcc");
        DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[6]] = lIlIIlIlIIIlllIl("XkY=", "rfSxP");
    }
    
    @Override
    public A sender() {
        return this.sender;
    }
    
    private static boolean lIlIIlIlIIlIIIll(final int llllllllllllIlIllIIIllIlllllIIll, final int llllllllllllIlIllIIIllIlllllIIlI) {
        return llllllllllllIlIllIIIllIlllllIIll < llllllllllllIlIllIIIllIlllllIIlI;
    }
    
    public DefaultAddressedEnvelope(final M llllllllllllIlIllIIIlllIIlIlIllI, final A llllllllllllIlIllIIIlllIIlIlIlIl) {
        this(llllllllllllIlIllIIIlllIIlIlIllI, llllllllllllIlIllIIIlllIIlIlIlIl, null);
    }
    
    private static boolean lIlIIlIlIIlIIIII(final Object llllllllllllIlIllIIIllIllllIlllI) {
        return llllllllllllIlIllIIIllIllllIlllI == null;
    }
    
    @Override
    public AddressedEnvelope<M, A> retain() {
        ReferenceCountUtil.retain(this.message);
        "".length();
        return this;
    }
    
    private static String lIlIIlIlIIIlllII(final String llllllllllllIlIllIIIlllIIIlIIIII, final String llllllllllllIlIllIIIlllIIIIlllll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIlllIIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIlllIIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIlllIIIlIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIlllIIIlIIIlI.init(DefaultAddressedEnvelope.lllIllIllIlIII[3], llllllllllllIlIllIIIlllIIIlIIIll);
            return new String(llllllllllllIlIllIIIlllIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIlllIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIlllIIIlIIIIl) {
            llllllllllllIlIllIIIlllIIIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    public DefaultAddressedEnvelope(final M llllllllllllIlIllIIIlllIIlIlllIl, final A llllllllllllIlIllIIIlllIIllIIIII, final A llllllllllllIlIllIIIlllIIlIlllll) {
        if (lIlIIlIlIIlIIIII(llllllllllllIlIllIIIlllIIlIlllIl)) {
            throw new NullPointerException(DefaultAddressedEnvelope.lllIllIllIIlll[DefaultAddressedEnvelope.lllIllIllIlIII[0]]);
        }
        this.message = llllllllllllIlIllIIIlllIIlIlllIl;
        this.sender = llllllllllllIlIllIIIlllIIlIlllll;
        this.recipient = llllllllllllIlIllIIIlllIIllIIIII;
    }
    
    @Override
    public boolean release(final int llllllllllllIlIllIIIlllIIIllIllI) {
        return ReferenceCountUtil.release(this.message, llllllllllllIlIllIIIlllIIIllIllI);
    }
    
    @Override
    public int refCnt() {
        if (lIlIIlIlIIlIIIIl((this.message instanceof ReferenceCounted) ? 1 : 0)) {
            return ((ReferenceCounted)this.message).refCnt();
        }
        return DefaultAddressedEnvelope.lllIllIllIlIII[1];
    }
    
    static {
        lIlIIlIlIIIlllll();
        lIlIIlIlIIIllllI();
    }
    
    private static boolean lIlIIlIlIIlIIIIl(final int llllllllllllIlIllIIIllIllllIllII) {
        return llllllllllllIlIllIIIllIllllIllII != 0;
    }
}
