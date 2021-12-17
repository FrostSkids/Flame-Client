// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.List;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.PrematureChannelClosureException;
import io.netty.channel.ChannelHandlerContext;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import io.netty.channel.CombinedChannelDuplexHandler;

public final class HttpClientCodec extends CombinedChannelDuplexHandler<HttpResponseDecoder, HttpRequestEncoder>
{
    private final /* synthetic */ boolean failOnMissingResponse;
    private static final /* synthetic */ int[] lIlIIlllllIIll;
    private final /* synthetic */ AtomicLong requestResponseCounter;
    private final /* synthetic */ Queue<HttpMethod> queue;
    private /* synthetic */ boolean done;
    
    private static void lllIlIlIIIlIllI() {
        (lIlIIlllllIIll = new int[4])[0] = (0xFFFFF4EC & 0x1B13);
        HttpClientCodec.lIlIIlllllIIll[1] = (0xFFFFA876 & 0x7789);
        HttpClientCodec.lIlIIlllllIIll[2] = ((33 + 63 - 50 + 110 ^ 51 + 54 + 4 + 29) & (120 + 127 - 221 + 142 ^ 121 + 167 - 220 + 122 ^ -" ".length()));
        HttpClientCodec.lIlIIlllllIIll[3] = " ".length();
    }
    
    static {
        lllIlIlIIIlIllI();
    }
    
    public HttpClientCodec(final int lllllllllllllIIIlIllIllIIIlIIllI, final int lllllllllllllIIIlIllIllIIIlIlIlI, final int lllllllllllllIIIlIllIllIIIlIIlII, final boolean lllllllllllllIIIlIllIllIIIlIIIll) {
        this(lllllllllllllIIIlIllIllIIIlIIllI, lllllllllllllIIIlIllIllIIIlIlIlI, lllllllllllllIIIlIllIllIIIlIIlII, lllllllllllllIIIlIllIllIIIlIIIll, (boolean)(HttpClientCodec.lIlIIlllllIIll[3] != 0));
    }
    
    public boolean isSingleDecode() {
        return ((CombinedChannelDuplexHandler<HttpResponseDecoder, O>)this).inboundHandler().isSingleDecode();
    }
    
    public void setSingleDecode(final boolean lllllllllllllIIIlIllIllIIlIIIIll) {
        ((CombinedChannelDuplexHandler<HttpResponseDecoder, O>)this).inboundHandler().setSingleDecode(lllllllllllllIIIlIllIllIIlIIIIll);
    }
    
    public HttpClientCodec(final int lllllllllllllIIIlIllIllIIIIllIll, final int lllllllllllllIIIlIllIllIIIIllIlI, final int lllllllllllllIIIlIllIllIIIIlIIll, final boolean lllllllllllllIIIlIllIllIIIIllIII, final boolean lllllllllllllIIIlIllIllIIIIlIlll) {
        this.queue = new ArrayDeque<HttpMethod>();
        this.requestResponseCounter = new AtomicLong();
        ((CombinedChannelDuplexHandler<Decoder, Encoder>)this).init(new Decoder(lllllllllllllIIIlIllIllIIIIllIll, lllllllllllllIIIlIllIllIIIIllIlI, lllllllllllllIIIlIllIllIIIIlIIll, lllllllllllllIIIlIllIllIIIIlIlll), new Encoder());
        this.failOnMissingResponse = lllllllllllllIIIlIllIllIIIIllIII;
    }
    
    public HttpClientCodec() {
        this(HttpClientCodec.lIlIIlllllIIll[0], HttpClientCodec.lIlIIlllllIIll[1], HttpClientCodec.lIlIIlllllIIll[1], (boolean)(HttpClientCodec.lIlIIlllllIIll[2] != 0));
    }
    
    public HttpClientCodec(final int lllllllllllllIIIlIllIllIIIlllIII, final int lllllllllllllIIIlIllIllIIIllIIll, final int lllllllllllllIIIlIllIllIIIllIllI) {
        this(lllllllllllllIIIlIllIllIIIlllIII, lllllllllllllIIIlIllIllIIIllIIll, lllllllllllllIIIlIllIllIIIllIllI, (boolean)(HttpClientCodec.lIlIIlllllIIll[2] != 0));
    }
    
    private final class Decoder extends HttpResponseDecoder
    {
        private static final /* synthetic */ String[] llIIIIlllIllIl;
        private static final /* synthetic */ int[] llIIIIlllIlllI;
        
        static {
            lIIIlIIIIllIlIIl();
            lIIIlIIIIllIlIII();
        }
        
        Decoder(final int llllllllllllIlllIllIIllllIIlllIl, final int llllllllllllIlllIllIIllllIIlIllI, final int llllllllllllIlllIllIIllllIIlIlIl, final boolean llllllllllllIlllIllIIllllIIlIlII) {
            super(llllllllllllIlllIllIIllllIIlllIl, llllllllllllIlllIllIIllllIIlIllI, llllllllllllIlllIllIIllllIIlIlIl, llllllllllllIlllIllIIllllIIlIlII);
        }
        
        private void decrement(final Object llllllllllllIlllIllIIlllIllllIlI) {
            if (lIIIlIIIIllIllIl(llllllllllllIlllIllIIlllIllllIlI)) {
                return;
            }
            if (lIIIlIIIIllIlIlI((llllllllllllIlllIllIIlllIllllIlI instanceof LastHttpContent) ? 1 : 0)) {
                HttpClientCodec.this.requestResponseCounter.decrementAndGet();
            }
        }
        
        @Override
        public void channelInactive(final ChannelHandlerContext llllllllllllIlllIllIIlllIllIIIll) throws Exception {
            super.channelInactive(llllllllllllIlllIllIIlllIllIIIll);
            if (lIIIlIIIIllIlIlI(HttpClientCodec.this.failOnMissingResponse ? 1 : 0)) {
                final long llllllllllllIlllIllIIlllIllIIlIl = HttpClientCodec.this.requestResponseCounter.get();
                if (lIIIlIIIIlllIIII(lIIIlIIIIllIllll(llllllllllllIlllIllIIlllIllIIlIl, 0L))) {
                    llllllllllllIlllIllIIlllIllIIIll.fireExceptionCaught(new PrematureChannelClosureException(String.valueOf(new StringBuilder().append(Decoder.llIIIIlllIllIl[Decoder.llIIIIlllIlllI[2]]).append(llllllllllllIlllIllIIlllIllIIlIl).append(Decoder.llIIIIlllIllIl[Decoder.llIIIIlllIlllI[1]]))));
                    "".length();
                }
            }
        }
        
        private static void lIIIlIIIIllIlIII() {
            (llIIIIlllIllIl = new String[Decoder.llIIIIlllIlllI[4]])[Decoder.llIIIIlllIlllI[2]] = lIIIlIIIIllIIlIl("nFUqjLh78YaTlyvUZrt2f2lp037kbOi+pcSzs1zMFkY=", "TDDnt");
            Decoder.llIIIIlllIllIl[Decoder.llIIIIlllIlllI[1]] = lIIIlIIIIllIIlll("YwUPOz8qBgFoPiYbFiciMA1OO2U=", "ChfHL");
        }
        
        private static String lIIIlIIIIllIIlIl(final String llllllllllllIlllIllIIlllIIlllllI, final String llllllllllllIlllIllIIlllIIllllll) {
            try {
                final SecretKeySpec llllllllllllIlllIllIIlllIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlllIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIllIIlllIlIIIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIlllIllIIlllIlIIIIlI.init(Decoder.llIIIIlllIlllI[4], llllllllllllIlllIllIIlllIlIIIIll);
                return new String(llllllllllllIlllIllIIlllIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlllIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllIIlllIlIIIIIl) {
                llllllllllllIlllIllIIlllIlIIIIIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected boolean isContentAlwaysEmpty(final HttpMessage llllllllllllIlllIllIIlllIlllIIIl) {
            final int llllllllllllIlllIllIIlllIlllIIII = ((HttpResponse)llllllllllllIlllIllIIlllIlllIIIl).getStatus().code();
            if (lIIIlIIIIllIlllI(llllllllllllIlllIllIIlllIlllIIII, Decoder.llIIIIlllIlllI[0])) {
                return Decoder.llIIIIlllIlllI[1] != 0;
            }
            final HttpMethod llllllllllllIlllIllIIlllIllIllll = HttpClientCodec.this.queue.poll();
            final char llllllllllllIlllIllIIlllIllIlllI = llllllllllllIlllIllIIlllIllIllll.name().charAt(Decoder.llIIIIlllIlllI[2]);
            switch (llllllllllllIlllIllIIlllIllIlllI) {
                case 'H': {
                    if (lIIIlIIIIllIlIlI(HttpMethod.HEAD.equals(llllllllllllIlllIllIIlllIllIllll) ? 1 : 0)) {
                        return Decoder.llIIIIlllIlllI[1] != 0;
                    }
                    break;
                }
                case 'C': {
                    if (lIIIlIIIIllIlllI(llllllllllllIlllIllIIlllIlllIIII, Decoder.llIIIIlllIlllI[3]) && lIIIlIIIIllIlIlI(HttpMethod.CONNECT.equals(llllllllllllIlllIllIIlllIllIllll) ? 1 : 0)) {
                        HttpClientCodec.this.done = (boolean)(Decoder.llIIIIlllIlllI[1] != 0);
                        "".length();
                        HttpClientCodec.this.queue.clear();
                        return Decoder.llIIIIlllIlllI[1] != 0;
                    }
                    break;
                }
            }
            return super.isContentAlwaysEmpty(llllllllllllIlllIllIIlllIlllIIIl);
        }
        
        private static boolean lIIIlIIIIllIllII(final int llllllllllllIlllIllIIlllIIllIlII, final int llllllllllllIlllIllIIlllIIllIIll) {
            return llllllllllllIlllIllIIlllIIllIlII < llllllllllllIlllIllIIlllIIllIIll;
        }
        
        private static boolean lIIIlIIIIllIlIlI(final int llllllllllllIlllIllIIlllIIlIllll) {
            return llllllllllllIlllIllIIlllIIlIllll != 0;
        }
        
        private static boolean lIIIlIIIIllIlIll(final int llllllllllllIlllIllIIlllIIlIllIl) {
            return llllllllllllIlllIllIIlllIIlIllIl == 0;
        }
        
        private static boolean lIIIlIIIIllIllIl(final Object llllllllllllIlllIllIIlllIIllIIIl) {
            return llllllllllllIlllIllIIlllIIllIIIl == null;
        }
        
        @Override
        protected void decode(final ChannelHandlerContext llllllllllllIlllIllIIllllIIIIIll, final ByteBuf llllllllllllIlllIllIIllllIIIIllI, final List<Object> llllllllllllIlllIllIIllllIIIIlIl) throws Exception {
            if (lIIIlIIIIllIlIlI(HttpClientCodec.this.done ? 1 : 0)) {
                final int llllllllllllIlllIllIIllllIIIllII = this.actualReadableBytes();
                if (lIIIlIIIIllIlIll(llllllllllllIlllIllIIllllIIIllII)) {
                    return;
                }
                llllllllllllIlllIllIIllllIIIIlIl.add(llllllllllllIlllIllIIllllIIIIllI.readBytes(llllllllllllIlllIllIIllllIIIllII));
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final int llllllllllllIlllIllIIllllIIIlIIl = llllllllllllIlllIllIIllllIIIIlIl.size();
                super.decode(llllllllllllIlllIllIIllllIIIIIll, llllllllllllIlllIllIIllllIIIIllI, llllllllllllIlllIllIIllllIIIIlIl);
                if (lIIIlIIIIllIlIlI(HttpClientCodec.this.failOnMissingResponse ? 1 : 0)) {
                    final int llllllllllllIlllIllIIllllIIIlIlI = llllllllllllIlllIllIIllllIIIIlIl.size();
                    int llllllllllllIlllIllIIllllIIIlIll = llllllllllllIlllIllIIllllIIIlIIl;
                    while (lIIIlIIIIllIllII(llllllllllllIlllIllIIllllIIIlIll, llllllllllllIlllIllIIllllIIIlIlI)) {
                        this.decrement(llllllllllllIlllIllIIllllIIIIlIl.get(llllllllllllIlllIllIIllllIIIlIll));
                        ++llllllllllllIlllIllIIllllIIIlIll;
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                    }
                }
            }
        }
        
        private static boolean lIIIlIIIIllIlllI(final int llllllllllllIlllIllIIlllIIlllIII, final int llllllllllllIlllIllIIlllIIllIlll) {
            return llllllllllllIlllIllIIlllIIlllIII == llllllllllllIlllIllIIlllIIllIlll;
        }
        
        private static boolean lIIIlIIIIlllIIII(final int llllllllllllIlllIllIIlllIIlIlIll) {
            return llllllllllllIlllIllIIlllIIlIlIll > 0;
        }
        
        private static void lIIIlIIIIllIlIIl() {
            (llIIIIlllIlllI = new int[5])[0] = (66 + 192 - 208 + 173 ^ 67 + 160 - 185 + 145);
            Decoder.llIIIIlllIlllI[1] = " ".length();
            Decoder.llIIIIlllIlllI[2] = ((0x9F ^ 0x98) & ~(0x5C ^ 0x5B));
            Decoder.llIIIIlllIlllI[3] = 54 + 160 - 195 + 181;
            Decoder.llIIIIlllIlllI[4] = "  ".length();
        }
        
        private static String lIIIlIIIIllIIlll(String llllllllllllIlllIllIIlllIlIlIlIl, final String llllllllllllIlllIllIIlllIlIIllll) {
            llllllllllllIlllIllIIlllIlIlIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllIIlllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIllIIlllIlIlIIll = new StringBuilder();
            final char[] llllllllllllIlllIllIIlllIlIlIIlI = llllllllllllIlllIllIIlllIlIIllll.toCharArray();
            int llllllllllllIlllIllIIlllIlIlIIIl = Decoder.llIIIIlllIlllI[2];
            final long llllllllllllIlllIllIIlllIlIIlIll = (Object)llllllllllllIlllIllIIlllIlIlIlIl.toCharArray();
            final int llllllllllllIlllIllIIlllIlIIlIlI = llllllllllllIlllIllIIlllIlIIlIll.length;
            float llllllllllllIlllIllIIlllIlIIlIIl = Decoder.llIIIIlllIlllI[2];
            while (lIIIlIIIIllIllII((int)llllllllllllIlllIllIIlllIlIIlIIl, llllllllllllIlllIllIIlllIlIIlIlI)) {
                final char llllllllllllIlllIllIIlllIlIlIllI = llllllllllllIlllIllIIlllIlIIlIll[llllllllllllIlllIllIIlllIlIIlIIl];
                llllllllllllIlllIllIIlllIlIlIIll.append((char)(llllllllllllIlllIllIIlllIlIlIllI ^ llllllllllllIlllIllIIlllIlIlIIlI[llllllllllllIlllIllIIlllIlIlIIIl % llllllllllllIlllIllIIlllIlIlIIlI.length]));
                "".length();
                ++llllllllllllIlllIllIIlllIlIlIIIl;
                ++llllllllllllIlllIllIIlllIlIIlIIl;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIllIIlllIlIlIIll);
        }
        
        private static int lIIIlIIIIllIllll(final long n, final long n2) {
            return lcmp(n, n2);
        }
    }
    
    private final class Encoder extends HttpRequestEncoder
    {
        private static boolean lIlIIlIIllllIIII(final int llllllllllllIlIllIIlIIIIIlIIIlll) {
            return llllllllllllIlIllIIlIIIIIlIIIlll == 0;
        }
        
        private static boolean lIlIIlIIlllIllll(final int llllllllllllIlIllIIlIIIIIlIIlIIl) {
            return llllllllllllIlIllIIlIIIIIlIIlIIl != 0;
        }
        
        @Override
        protected void encode(final ChannelHandlerContext llllllllllllIlIllIIlIIIIIlIllIII, final Object llllllllllllIlIllIIlIIIIIlIlIlll, final List<Object> llllllllllllIlIllIIlIIIIIlIlIIlI) throws Exception {
            if (lIlIIlIIlllIllll((llllllllllllIlIllIIlIIIIIlIlIlll instanceof HttpRequest) ? 1 : 0) && lIlIIlIIllllIIII(HttpClientCodec.this.done ? 1 : 0)) {
                HttpClientCodec.this.queue.offer(((HttpRequest)llllllllllllIlIllIIlIIIIIlIlIlll).getMethod());
                "".length();
            }
            super.encode(llllllllllllIlIllIIlIIIIIlIllIII, llllllllllllIlIllIIlIIIIIlIlIlll, llllllllllllIlIllIIlIIIIIlIlIIlI);
            if (lIlIIlIIlllIllll(HttpClientCodec.this.failOnMissingResponse ? 1 : 0) && lIlIIlIIlllIllll((llllllllllllIlIllIIlIIIIIlIlIlll instanceof LastHttpContent) ? 1 : 0)) {
                HttpClientCodec.this.requestResponseCounter.incrementAndGet();
            }
        }
    }
}
