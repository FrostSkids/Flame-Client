// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelHandler;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpHeaders;
import java.net.URI;

public class WebSocketClientProtocolHandler extends WebSocketProtocolHandler
{
    private final /* synthetic */ boolean handleCloseFrames;
    private static final /* synthetic */ int[] llIIIlllIlIllI;
    private final /* synthetic */ WebSocketClientHandshaker handshaker;
    
    public WebSocketClientProtocolHandler(final URI llllllllllllIlllIlIIIIIlIIIIIllI, final WebSocketVersion llllllllllllIlllIlIIIIIlIIIIIlIl, final String llllllllllllIlllIlIIIIIlIIIIIlII, final boolean llllllllllllIlllIlIIIIIlIIIIIIll, final HttpHeaders llllllllllllIlllIlIIIIIlIIIIlIlI, final int llllllllllllIlllIlIIIIIlIIIIIIIl, final boolean llllllllllllIlllIlIIIIIlIIIIIIII) {
        this(WebSocketClientHandshakerFactory.newHandshaker(llllllllllllIlllIlIIIIIlIIIIIllI, llllllllllllIlllIlIIIIIlIIIIIlIl, llllllllllllIlllIlIIIIIlIIIIIlII, llllllllllllIlllIlIIIIIlIIIIIIll, llllllllllllIlllIlIIIIIlIIIIlIlI, llllllllllllIlllIlIIIIIlIIIIIIIl), llllllllllllIlllIlIIIIIlIIIIIIII);
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlllIlIIIIIIllIlIIlI, final WebSocketFrame llllllllllllIlllIlIIIIIIllIlIIIl, final List<Object> llllllllllllIlllIlIIIIIIllIlIIII) throws Exception {
        if (lIIIlIlIlllIlllI(this.handleCloseFrames ? 1 : 0) && lIIIlIlIlllIlllI((llllllllllllIlllIlIIIIIIllIlIIIl instanceof CloseWebSocketFrame) ? 1 : 0)) {
            llllllllllllIlllIlIIIIIIllIlIIlI.close();
            "".length();
            return;
        }
        super.decode(llllllllllllIlllIlIIIIIIllIlIIlI, llllllllllllIlllIlIIIIIIllIlIIIl, llllllllllllIlllIlIIIIIIllIlIIII);
    }
    
    private static boolean lIIIlIlIlllIllll(final Object llllllllllllIlllIlIIIIIIlIllIIII) {
        return llllllllllllIlllIlIIIIIIlIllIIII == null;
    }
    
    static {
        lIIIlIlIlllIllIl();
    }
    
    private static boolean lIIIlIlIlllIlllI(final int llllllllllllIlllIlIIIIIIlIlIlllI) {
        return llllllllllllIlllIlIIIIIIlIlIlllI != 0;
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext llllllllllllIlllIlIIIIIIllIIlIll) {
        final ChannelPipeline llllllllllllIlllIlIIIIIIllIIlIlI = llllllllllllIlllIlIIIIIIllIIlIll.pipeline();
        if (lIIIlIlIlllIllll(llllllllllllIlllIlIIIIIIllIIlIlI.get(WebSocketClientProtocolHandshakeHandler.class))) {
            llllllllllllIlllIlIIIIIIllIIlIll.pipeline().addBefore(llllllllllllIlllIlIIIIIIllIIlIll.name(), WebSocketClientProtocolHandshakeHandler.class.getName(), new WebSocketClientProtocolHandshakeHandler(this.handshaker));
            "".length();
        }
    }
    
    public WebSocketClientProtocolHandler(final URI llllllllllllIlllIlIIIIIIllllIIII, final WebSocketVersion llllllllllllIlllIlIIIIIIlllIllll, final String llllllllllllIlllIlIIIIIIllllIlIl, final boolean llllllllllllIlllIlIIIIIIllllIlII, final HttpHeaders llllllllllllIlllIlIIIIIIlllIllII, final int llllllllllllIlllIlIIIIIIlllIlIll) {
        this(llllllllllllIlllIlIIIIIIllllIIII, llllllllllllIlllIlIIIIIIlllIllll, llllllllllllIlllIlIIIIIIllllIlIl, llllllllllllIlllIlIIIIIIllllIlII, llllllllllllIlllIlIIIIIIlllIllII, llllllllllllIlllIlIIIIIIlllIlIll, (boolean)(WebSocketClientProtocolHandler.llIIIlllIlIllI[0] != 0));
    }
    
    public WebSocketClientProtocolHandler(final WebSocketClientHandshaker llllllllllllIlllIlIIIIIIlllIIIll, final boolean llllllllllllIlllIlIIIIIIlllIIlIl) {
        this.handshaker = llllllllllllIlllIlIIIIIIlllIIIll;
        this.handleCloseFrames = llllllllllllIlllIlIIIIIIlllIIlIl;
    }
    
    public WebSocketClientProtocolHandler(final WebSocketClientHandshaker llllllllllllIlllIlIIIIIIllIllllI) {
        this(llllllllllllIlllIlIIIIIIllIllllI, (boolean)(WebSocketClientProtocolHandler.llIIIlllIlIllI[0] != 0));
    }
    
    private static void lIIIlIlIlllIllIl() {
        (llIIIlllIlIllI = new int[1])[0] = " ".length();
    }
    
    public enum ClientHandshakeStateEvent
    {
        private static final /* synthetic */ String[] lIIllIIIllllll;
        
        HANDSHAKE_COMPLETE, 
        HANDSHAKE_ISSUED;
        
        private static final /* synthetic */ int[] lIIllIIllIIIll;
        
        static {
            llIlIllllIIlIll();
            llIlIllIllllIll();
            final ClientHandshakeStateEvent[] $values = new ClientHandshakeStateEvent[ClientHandshakeStateEvent.lIIllIIllIIIll[2]];
            $values[ClientHandshakeStateEvent.lIIllIIllIIIll[0]] = ClientHandshakeStateEvent.HANDSHAKE_ISSUED;
            $values[ClientHandshakeStateEvent.lIIllIIllIIIll[1]] = ClientHandshakeStateEvent.HANDSHAKE_COMPLETE;
            $VALUES = $values;
        }
        
        private static void llIlIllllIIlIll() {
            (lIIllIIllIIIll = new int[3])[0] = ((0xA4 ^ 0xA3) & ~(0x42 ^ 0x45));
            ClientHandshakeStateEvent.lIIllIIllIIIll[1] = " ".length();
            ClientHandshakeStateEvent.lIIllIIllIIIll[2] = "  ".length();
        }
        
        private static String llIlIllIlllIlll(final String lllllllllllllIIlIlIllllllllIIlIl, final String lllllllllllllIIlIlIllllllllIIlII) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIllllllllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllllllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIllllllllIlIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIllllllllIlIIl.init(ClientHandshakeStateEvent.lIIllIIllIIIll[2], lllllllllllllIIlIlIllllllllIlIlI);
                return new String(lllllllllllllIIlIlIllllllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIllllllllIlIII) {
                lllllllllllllIIlIlIllllllllIlIII.printStackTrace();
                return null;
            }
        }
        
        private static void llIlIllIllllIll() {
            (lIIllIIIllllll = new String[ClientHandshakeStateEvent.lIIllIIllIIIll[2]])[ClientHandshakeStateEvent.lIIllIIllIIIll[0]] = llIlIllIlllIlll("ifmBMqlQSSHlq3PzR2P21wCDQOFze1D1", "NxlGM");
            ClientHandshakeStateEvent.lIIllIIIllllll[ClientHandshakeStateEvent.lIIllIIllIIIll[1]] = llIlIllIlllIlll("J87fxZTd9FMCNplcwQ6dL4/SUoO7Nyji", "QeIWZ");
        }
    }
}
