// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.ReferenceCounted;
import com.sun.nio.sctp.MessageInfo;
import io.netty.buffer.DefaultByteBufHolder;

public final class SctpMessage extends DefaultByteBufHolder
{
    private final /* synthetic */ int protocolIdentifier;
    private static final /* synthetic */ int[] lIIIllllllIIll;
    private static final /* synthetic */ String[] lIIIlllllIlIll;
    private final /* synthetic */ MessageInfo msgInfo;
    private final /* synthetic */ int streamIdentifier;
    
    private static boolean llIIlIIIlIIlIlI(final Object lllllllllllllIIllllIIIIllIlIIllI) {
        return lllllllllllllIIllllIIIIllIlIIllI == null;
    }
    
    @Override
    public SctpMessage copy() {
        if (llIIlIIIlIIlIlI(this.msgInfo)) {
            return new SctpMessage(this.protocolIdentifier, this.streamIdentifier, this.content().copy());
        }
        return new SctpMessage(this.msgInfo, this.content().copy());
    }
    
    private static boolean llIIlIIIlIIlllI(final int lllllllllllllIIllllIIIIllIlIIIIl, final int lllllllllllllIIllllIIIIllIlIIIII) {
        return lllllllllllllIIllllIIIIllIlIIIIl != lllllllllllllIIllllIIIIllIlIIIII;
    }
    
    public int streamIdentifier() {
        return this.streamIdentifier;
    }
    
    private static boolean llIIlIIIlIIlIll(final Object lllllllllllllIIllllIIIIllIlIllII) {
        return lllllllllllllIIllllIIIIllIlIllII != null;
    }
    
    private static String llIIlIIIIllllIl(String lllllllllllllIIllllIIIIllIlllllI, final String lllllllllllllIIllllIIIIllIllllIl) {
        lllllllllllllIIllllIIIIllIlllllI = new String(Base64.getDecoder().decode(lllllllllllllIIllllIIIIllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIIIlllIIIIIl = new StringBuilder();
        final char[] lllllllllllllIIllllIIIIlllIIIIII = lllllllllllllIIllllIIIIllIllllIl.toCharArray();
        int lllllllllllllIIllllIIIIllIllllll = SctpMessage.lIIIllllllIIll[0];
        final String lllllllllllllIIllllIIIIllIlllIIl = (Object)lllllllllllllIIllllIIIIllIlllllI.toCharArray();
        final Exception lllllllllllllIIllllIIIIllIlllIII = (Exception)lllllllllllllIIllllIIIIllIlllIIl.length;
        short lllllllllllllIIllllIIIIllIllIlll = (short)SctpMessage.lIIIllllllIIll[0];
        while (llIIlIIIlIlIIIl(lllllllllllllIIllllIIIIllIllIlll, (int)lllllllllllllIIllllIIIIllIlllIII)) {
            final char lllllllllllllIIllllIIIIlllIIIlII = lllllllllllllIIllllIIIIllIlllIIl[lllllllllllllIIllllIIIIllIllIlll];
            lllllllllllllIIllllIIIIlllIIIIIl.append((char)(lllllllllllllIIllllIIIIlllIIIlII ^ lllllllllllllIIllllIIIIlllIIIIII[lllllllllllllIIllllIIIIllIllllll % lllllllllllllIIllllIIIIlllIIIIII.length]));
            "".length();
            ++lllllllllllllIIllllIIIIllIllllll;
            ++lllllllllllllIIllllIIIIllIllIlll;
            "".length();
            if (((58 + 0 + 80 + 87 ^ 24 + 48 + 55 + 34) & (109 + 67 - 149 + 166 ^ 73 + 56 - 52 + 52 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIIIlllIIIIIl);
    }
    
    public SctpMessage(final MessageInfo lllllllllllllIIllllIIIlIIIlIlllI, final ByteBuf lllllllllllllIIllllIIIlIIIlIllIl) {
        super(lllllllllllllIIllllIIIlIIIlIllIl);
        if (llIIlIIIlIIlIlI(lllllllllllllIIllllIIIlIIIlIlllI)) {
            throw new NullPointerException(SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[0]]);
        }
        this.msgInfo = lllllllllllllIIllllIIIlIIIlIlllI;
        this.streamIdentifier = lllllllllllllIIllllIIIlIIIlIlllI.streamNumber();
        this.protocolIdentifier = lllllllllllllIIllllIIIlIIIlIlllI.payloadProtocolID();
    }
    
    public boolean isComplete() {
        if (llIIlIIIlIIlIll(this.msgInfo)) {
            return this.msgInfo.isComplete();
        }
        return SctpMessage.lIIIllllllIIll[1] != 0;
    }
    
    public SctpMessage(final int lllllllllllllIIllllIIIlIIIlllIII, final int lllllllllllllIIllllIIIlIIIlllIll, final ByteBuf lllllllllllllIIllllIIIlIIIllIllI) {
        super(lllllllllllllIIllllIIIlIIIllIllI);
        this.protocolIdentifier = lllllllllllllIIllllIIIlIIIlllIII;
        this.streamIdentifier = lllllllllllllIIllllIIIlIIIlllIll;
        this.msgInfo = null;
    }
    
    private static boolean llIIlIIIlIIllIl(final Object lllllllllllllIIllllIIIIllIlIllll, final Object lllllllllllllIIllllIIIIllIlIlllI) {
        return lllllllllllllIIllllIIIIllIlIllll != lllllllllllllIIllllIIIIllIlIlllI;
    }
    
    @Override
    public int hashCode() {
        int lllllllllllllIIllllIIIlIIIIlIlII = this.streamIdentifier;
        lllllllllllllIIllllIIIlIIIIlIlII = SctpMessage.lIIIllllllIIll[2] * lllllllllllllIIllllIIIlIIIIlIlII + this.protocolIdentifier;
        lllllllllllllIIllllIIIlIIIIlIlII = SctpMessage.lIIIllllllIIll[2] * lllllllllllllIIllllIIIlIIIIlIlII + this.content().hashCode();
        return lllllllllllllIIllllIIIlIIIIlIlII;
    }
    
    static {
        llIIlIIIlIIlIIl();
        llIIlIIIlIIIllI();
    }
    
    @Override
    public String toString() {
        if (llIIlIIIlIIllll(this.refCnt())) {
            return String.valueOf(new StringBuilder().append(SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[1]]).append(this.streamIdentifier).append(SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[3]]).append(this.protocolIdentifier).append(SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[4]]));
        }
        return String.valueOf(new StringBuilder().append(SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[5]]).append(this.streamIdentifier).append(SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[6]]).append(this.protocolIdentifier).append(SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[7]]).append(ByteBufUtil.hexDump(this.content())).append((char)SctpMessage.lIIIllllllIIll[8]));
    }
    
    @Override
    public SctpMessage duplicate() {
        if (llIIlIIIlIIlIlI(this.msgInfo)) {
            return new SctpMessage(this.protocolIdentifier, this.streamIdentifier, this.content().duplicate());
        }
        return new SctpMessage(this.msgInfo, this.content().copy());
    }
    
    private static void llIIlIIIlIIlIIl() {
        (lIIIllllllIIll = new int[11])[0] = ((0x14 ^ 0x3B) & ~(0x47 ^ 0x68));
        SctpMessage.lIIIllllllIIll[1] = " ".length();
        SctpMessage.lIIIllllllIIll[2] = (0x37 ^ 0x1B ^ (0x87 ^ 0xB4));
        SctpMessage.lIIIllllllIIll[3] = "  ".length();
        SctpMessage.lIIIllllllIIll[4] = "   ".length();
        SctpMessage.lIIIllllllIIll[5] = (0x43 ^ 0x47);
        SctpMessage.lIIIllllllIIll[6] = (0x48 ^ 0xC ^ (0x24 ^ 0x65));
        SctpMessage.lIIIllllllIIll[7] = (0xD1 ^ 0x87 ^ (0x45 ^ 0x15));
        SctpMessage.lIIIllllllIIll[8] = (0xFC ^ 0xB9 ^ (0x29 ^ 0x11));
        SctpMessage.lIIIllllllIIll[9] = (0x46 ^ 0x41);
        SctpMessage.lIIIllllllIIll[10] = (0x3B ^ 0x33);
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIllllIIIlIIIIlllII) {
        if (llIIlIIIlIIllII(this, lllllllllllllIIllllIIIlIIIIlllII)) {
            return SctpMessage.lIIIllllllIIll[1] != 0;
        }
        if (!llIIlIIIlIIlIll(lllllllllllllIIllllIIIlIIIIlllII) || llIIlIIIlIIllIl(this.getClass(), lllllllllllllIIllllIIIlIIIIlllII.getClass())) {
            return SctpMessage.lIIIllllllIIll[0] != 0;
        }
        final SctpMessage lllllllllllllIIllllIIIlIIIIllIll = (SctpMessage)lllllllllllllIIllllIIIlIIIIlllII;
        if (llIIlIIIlIIlllI(this.protocolIdentifier, lllllllllllllIIllllIIIlIIIIllIll.protocolIdentifier)) {
            return SctpMessage.lIIIllllllIIll[0] != 0;
        }
        if (llIIlIIIlIIlllI(this.streamIdentifier, lllllllllllllIIllllIIIlIIIIllIll.streamIdentifier)) {
            return SctpMessage.lIIIllllllIIll[0] != 0;
        }
        if (llIIlIIIlIIllll(this.content().equals(lllllllllllllIIllllIIIlIIIIllIll.content()) ? 1 : 0)) {
            return SctpMessage.lIIIllllllIIll[0] != 0;
        }
        return SctpMessage.lIIIllllllIIll[1] != 0;
    }
    
    private static void llIIlIIIlIIIllI() {
        (lIIIlllllIlIll = new String[SctpMessage.lIIIllllllIIll[9]])[SctpMessage.lIIIllllllIIll[0]] = llIIlIIIIllllIl("DhIRLj4FDg==", "cavgP");
        SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[1]] = llIIlIIIIllllIl("MicDNA0TJRohMBIwBSEqDA0TISUVLREtLhN5", "aDwDK");
        SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[3]] = llIIlIIIIlllllI("7KWwvxW9+dpKMuKTI4UccfP06TmbF6K5", "lQNuu");
        SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[4]] = llIIlIIIIllllIl("YmctLDsvemELHQsCDWQy", "NGIMO");
        SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[5]] = llIIlIIIIllllIl("HTUOKS88Nxc8Ej0iCDwIIx8ePAc6PxwwDDxr", "NVzYi");
        SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[6]] = llIIlIIIlIIIIIl("Y/OxTpYFwXukdkrnF7gj/lWap7cxroBH", "oGRhD");
        SctpMessage.lIIIlllllIlIll[SctpMessage.lIIIllllllIIll[7]] = llIIlIIIIlllllI("2wYc1E+B43c=", "JbyuX");
    }
    
    public MessageInfo messageInfo() {
        return this.msgInfo;
    }
    
    private static boolean llIIlIIIlIIllll(final int lllllllllllllIIllllIIIIllIlIIlII) {
        return lllllllllllllIIllllIIIIllIlIIlII == 0;
    }
    
    private static String llIIlIIIIlllllI(final String lllllllllllllIIllllIIIIllllIIIII, final String lllllllllllllIIllllIIIIlllIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIIIllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIIIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIIIllllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIIIllllIIIlI.init(SctpMessage.lIIIllllllIIll[3], lllllllllllllIIllllIIIIllllIIIll);
            return new String(lllllllllllllIIllllIIIIllllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIIIllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIIIllllIIIIl) {
            lllllllllllllIIllllIIIIllllIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public SctpMessage retain(final int lllllllllllllIIllllIIIlIIIIIIlIl) {
        super.retain(lllllllllllllIIllllIIIlIIIIIIlIl);
        "".length();
        return this;
    }
    
    private static boolean llIIlIIIlIlIIIl(final int lllllllllllllIIllllIIIIllIllIIll, final int lllllllllllllIIllllIIIIllIllIIlI) {
        return lllllllllllllIIllllIIIIllIllIIll < lllllllllllllIIllllIIIIllIllIIlI;
    }
    
    private static String llIIlIIIlIIIIIl(final String lllllllllllllIIllllIIIIlllIlIIIl, final String lllllllllllllIIllllIIIIlllIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIIIlllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), SctpMessage.lIIIllllllIIll[10]), "DES");
            final Cipher lllllllllllllIIllllIIIIlllIlIlIl = Cipher.getInstance("DES");
            lllllllllllllIIllllIIIIlllIlIlIl.init(SctpMessage.lIIIllllllIIll[3], lllllllllllllIIllllIIIIlllIlIllI);
            return new String(lllllllllllllIIllllIIIIlllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIIIlllIlIlII) {
            lllllllllllllIIllllIIIIlllIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public SctpMessage retain() {
        super.retain();
        "".length();
        return this;
    }
    
    public int protocolIdentifier() {
        return this.protocolIdentifier;
    }
    
    private static boolean llIIlIIIlIIllII(final Object lllllllllllllIIllllIIIIllIlIlIIl, final Object lllllllllllllIIllllIIIIllIlIlIII) {
        return lllllllllllllIIllllIIIIllIlIlIIl == lllllllllllllIIllllIIIIllIlIlIII;
    }
}
