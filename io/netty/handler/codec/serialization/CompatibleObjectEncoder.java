// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import io.netty.util.Attribute;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.ObjectOutputStream;
import io.netty.util.AttributeKey;
import java.io.Serializable;
import io.netty.handler.codec.MessageToByteEncoder;

public class CompatibleObjectEncoder extends MessageToByteEncoder<Serializable>
{
    private static final /* synthetic */ int[] lIlIlIlllIllII;
    private final /* synthetic */ int resetInterval;
    private /* synthetic */ int writtenObjects;
    private static final /* synthetic */ String[] lIlIlIlllIIlIl;
    private static final /* synthetic */ AttributeKey<ObjectOutputStream> OOS;
    
    private static boolean lllIlllllIIlIIl(final int lllllllllllllIIIIllllIlllIlllllI) {
        return lllllllllllllIIIIllllIlllIlllllI == 0;
    }
    
    private static void lllIlllllIIIlII() {
        (lIlIlIlllIllII = new int[5])[0] = (162 + 104 - 218 + 122 ^ 93 + 7 - 23 + 109);
        CompatibleObjectEncoder.lIlIlIlllIllII[1] = ((0x37 ^ 0x1) & ~(0x2 ^ 0x34));
        CompatibleObjectEncoder.lIlIlIlllIllII[2] = " ".length();
        CompatibleObjectEncoder.lIlIlIlllIllII[3] = "  ".length();
        CompatibleObjectEncoder.lIlIlIlllIllII[4] = (0x47 ^ 0x4F);
    }
    
    private static boolean lllIlllllIIIlll(final Object lllllllllllllIIIIllllIllllIIlIIl) {
        return lllllllllllllIIIIllllIllllIIlIIl != null;
    }
    
    public CompatibleObjectEncoder(final int lllllllllllllIIIIlllllIIIlIIIIll) {
        if (lllIlllllIIIlIl(lllllllllllllIIIIlllllIIIlIIIIll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(CompatibleObjectEncoder.lIlIlIlllIIlIl[CompatibleObjectEncoder.lIlIlIlllIllII[1]]).append(lllllllllllllIIIIlllllIIIlIIIIll)));
        }
        this.resetInterval = lllllllllllllIIIIlllllIIIlIIIIll;
    }
    
    private static boolean lllIlllllIIIllI(final Object lllllllllllllIIIIllllIllllIIIlIl) {
        return lllllllllllllIIIIllllIllllIIIlIl == null;
    }
    
    private static String lllIllllIllIIll(final String lllllllllllllIIIIllllIllllllIIIl, final String lllllllllllllIIIIllllIlllllIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIllllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIlllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllllIllllllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllllIllllllIlII.init(CompatibleObjectEncoder.lIlIlIlllIllII[3], lllllllllllllIIIIllllIllllllIlIl);
            return new String(lllllllllllllIIIIllllIllllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIllllllIIlI) {
            lllllllllllllIIIIllllIllllllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lllIllllIllIlll(final String lllllllllllllIIIIllllIllllIlIlll, final String lllllllllllllIIIIllllIllllIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIllllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), CompatibleObjectEncoder.lIlIlIlllIllII[4]), "DES");
            final Cipher lllllllllllllIIIIllllIllllIllIll = Cipher.getInstance("DES");
            lllllllllllllIIIIllllIllllIllIll.init(CompatibleObjectEncoder.lIlIlIlllIllII[3], lllllllllllllIIIIllllIllllIlllIl);
            return new String(lllllllllllllIIIIllllIllllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIllllIllIIl) {
            lllllllllllllIIIIllllIllllIllIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIlllllIIIlII();
        lllIllllIlllIII();
        OOS = AttributeKey.valueOf(String.valueOf(new StringBuilder().append(CompatibleObjectEncoder.class.getName()).append(CompatibleObjectEncoder.lIlIlIlllIIlIl[CompatibleObjectEncoder.lIlIlIlllIllII[2]])));
    }
    
    private static boolean lllIlllllIIIlIl(final int lllllllllllllIIIIllllIlllIlllIlI) {
        return lllllllllllllIIIIllllIlllIlllIlI < 0;
    }
    
    private static boolean lllIlllllIIlIII(final int lllllllllllllIIIIllllIllllIIIIIl) {
        return lllllllllllllIIIIllllIllllIIIIIl != 0;
    }
    
    protected ObjectOutputStream newObjectOutputStream(final OutputStream lllllllllllllIIIIlllllIIIIlllllI) throws Exception {
        return new ObjectOutputStream(lllllllllllllIIIIlllllIIIIlllllI);
    }
    
    private static void lllIllllIlllIII() {
        (lIlIlIlllIIlIl = new String[CompatibleObjectEncoder.lIlIlIlllIllII[3]])[CompatibleObjectEncoder.lIlIlIlllIllII[1]] = lllIllllIllIIll("UhVkGGi5jKI4oITdPpaulg==", "PQxIU");
        CompatibleObjectEncoder.lIlIlIlllIIlIl[CompatibleObjectEncoder.lIlIlIlllIllII[2]] = lllIllllIllIlll("uboWprvbjN8=", "fMaVh");
    }
    
    public CompatibleObjectEncoder() {
        this(CompatibleObjectEncoder.lIlIlIlllIllII[0]);
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIIIlllllIIIIlIIIIl, final Serializable lllllllllllllIIIIlllllIIIIIlIlll, final ByteBuf lllllllllllllIIIIlllllIIIIIlIllI) throws Exception {
        final Attribute<ObjectOutputStream> lllllllllllllIIIIlllllIIIIIllIll = lllllllllllllIIIIlllllIIIIlIIIIl.attr(CompatibleObjectEncoder.OOS);
        ObjectOutputStream lllllllllllllIIIIlllllIIIIIllIlI = lllllllllllllIIIIlllllIIIIIllIll.get();
        if (lllIlllllIIIllI(lllllllllllllIIIIlllllIIIIIllIlI)) {
            lllllllllllllIIIIlllllIIIIIllIlI = this.newObjectOutputStream(new ByteBufOutputStream(lllllllllllllIIIIlllllIIIIIlIllI));
            final ObjectOutputStream lllllllllllllIIIIlllllIIIIlIIlIl = lllllllllllllIIIIlllllIIIIIllIll.setIfAbsent(lllllllllllllIIIIlllllIIIIIllIlI);
            if (lllIlllllIIIlll(lllllllllllllIIIIlllllIIIIlIIlIl)) {
                lllllllllllllIIIIlllllIIIIIllIlI = lllllllllllllIIIIlllllIIIIlIIlIl;
            }
        }
        synchronized (lllllllllllllIIIIlllllIIIIIllIlI) {
            if (lllIlllllIIlIII(this.resetInterval)) {
                this.writtenObjects += CompatibleObjectEncoder.lIlIlIlllIllII[2];
                if (lllIlllllIIlIIl(this.writtenObjects % this.resetInterval)) {
                    lllllllllllllIIIIlllllIIIIIllIlI.reset();
                }
            }
            lllllllllllllIIIIlllllIIIIIllIlI.writeObject(lllllllllllllIIIIlllllIIIIIlIlll);
            lllllllllllllIIIIlllllIIIIIllIlI.flush();
            // monitorexit(lllllllllllllIIIIlllllIIIIIllIlI)
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
    }
}
