// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.internal.StringUtil;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.DefaultByteBufHolder;

public abstract class WebSocketFrame extends DefaultByteBufHolder
{
    private static final /* synthetic */ String[] llIIIllIIIIIll;
    private static final /* synthetic */ int[] llIIIllIIIIlII;
    private final /* synthetic */ boolean finalFragment;
    private final /* synthetic */ int rsv;
    
    @Override
    public WebSocketFrame retain() {
        super.retain();
        "".length();
        return this;
    }
    
    private static void lIIIlIIlllllIIIl() {
        (llIIIllIIIIlII = new int[4])[0] = " ".length();
        WebSocketFrame.llIIIllIIIIlII[1] = ((0xB8 ^ 0xA4 ^ (0xCA ^ 0xB6)) & (57 + 42 - 98 + 205 ^ 30 + 65 + 58 + 21 ^ -" ".length()));
        WebSocketFrame.llIIIllIIIIlII[2] = (0x56 ^ 0x11 ^ (0x4C ^ 0x22));
        WebSocketFrame.llIIIllIIIIlII[3] = "  ".length();
    }
    
    public boolean isFinalFragment() {
        return this.finalFragment;
    }
    
    protected WebSocketFrame(final boolean llllllllllllIlllIlIlIIIllIlIIIll, final int llllllllllllIlllIlIlIIIllIIllllI, final ByteBuf llllllllllllIlllIlIlIIIllIIlllIl) {
        super(llllllllllllIlllIlIlIIIllIIlllIl);
        this.finalFragment = llllllllllllIlllIlIlIIIllIlIIIll;
        this.rsv = llllllllllllIlllIlIlIIIllIIllllI;
    }
    
    public int rsv() {
        return this.rsv;
    }
    
    static {
        lIIIlIIlllllIIIl();
        lIIIlIIlllllIIII();
    }
    
    protected WebSocketFrame(final ByteBuf llllllllllllIlllIlIlIIIllIlIlIll) {
        this((boolean)(WebSocketFrame.llIIIllIIIIlII[0] != 0), WebSocketFrame.llIIIllIIIIlII[1], llllllllllllIlllIlIlIIIllIlIlIll);
    }
    
    @Override
    public WebSocketFrame retain(final int llllllllllllIlllIlIlIIIllIIIllIl) {
        super.retain(llllllllllllIlllIlIlIIIllIIIllIl);
        "".length();
        return this;
    }
    
    @Override
    public abstract WebSocketFrame copy();
    
    private static String lIIIlIIllllIllll(final String llllllllllllIlllIlIlIIIlIllIlIIl, final String llllllllllllIlllIlIlIIIlIllIlIII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIIlIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIIlIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIIIlIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIIIlIllIllIl.init(WebSocketFrame.llIIIllIIIIlII[3], llllllllllllIlllIlIlIIIlIllIlllI);
            return new String(llllllllllllIlllIlIlIIIlIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIlIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIIlIllIllII) {
            llllllllllllIlllIlIlIIIlIllIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public abstract WebSocketFrame duplicate();
    
    private static void lIIIlIIlllllIIII() {
        (llIIIllIIIIIll = new String[WebSocketFrame.llIIIllIIIIlII[0]])[WebSocketFrame.llIIIllIIIIlII[1]] = lIIIlIIllllIllll("JWgbpsy7ueQ=", "iVUpl");
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(WebSocketFrame.llIIIllIIIIIll[WebSocketFrame.llIIIllIIIIlII[1]]).append(this.content().toString()).append((char)WebSocketFrame.llIIIllIIIIlII[2]));
    }
}
