// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.net.SocketAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CombinedChannelDuplexHandler<I extends ChannelInboundHandler, O extends ChannelOutboundHandler> extends ChannelDuplexHandler
{
    private static final /* synthetic */ String[] lIlllIlIlIIlIl;
    private /* synthetic */ I inboundHandler;
    private /* synthetic */ O outboundHandler;
    private static final /* synthetic */ int[] lIlllIlIlIlllI;
    
    @Override
    public void channelUnregistered(final ChannelHandlerContext llllllllllllIllllIlllllllIIlIlIl) throws Exception {
        this.inboundHandler.channelUnregistered(llllllllllllIllllIlllllllIIlIlIl);
    }
    
    protected final O outboundHandler() {
        return this.outboundHandler;
    }
    
    private static void lIIIIIlIlllIIIIl() {
        (lIlllIlIlIlllI = new int[12])[0] = ((0x8E ^ 0x94) & ~(0xAB ^ 0xB1));
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[1] = " ".length();
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[2] = "  ".length();
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[3] = "   ".length();
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[4] = (0x9 ^ 0xD);
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[5] = (0x72 ^ 0x77);
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[6] = (0xC4 ^ 0xA5 ^ (0xC1 ^ 0xA6));
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[7] = (0x20 ^ 0x45 ^ (0x1 ^ 0x63));
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[8] = (0xEC ^ 0x88 ^ (0x67 ^ 0xB));
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[9] = (0x68 ^ 0x4B ^ (0x97 ^ 0xBD));
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[10] = (157 + 92 - 206 + 157 ^ 136 + 177 - 265 + 146);
        CombinedChannelDuplexHandler.lIlllIlIlIlllI[11] = (0x1 ^ 0xA);
    }
    
    @Override
    public void write(final ChannelHandlerContext llllllllllllIllllIllllllIIlIIlII, final Object llllllllllllIllllIllllllIIlIIIll, final ChannelPromise llllllllllllIllllIllllllIIIllllI) throws Exception {
        this.outboundHandler.write(llllllllllllIllllIllllllIIlIIlII, llllllllllllIllllIllllllIIlIIIll, llllllllllllIllllIllllllIIIllllI);
    }
    
    private static boolean lIIIIIlIlllIIlII(final int llllllllllllIllllIlllllIllIlIllI) {
        return llllllllllllIllllIlllllIllIlIllI != 0;
    }
    
    private static String lIIIIIlIllIIIlll(final String llllllllllllIllllIllllllIIIIlIlI, final String llllllllllllIllllIllllllIIIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIllllllIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllllllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), CombinedChannelDuplexHandler.lIlllIlIlIlllI[8]), "DES");
            final Cipher llllllllllllIllllIllllllIIIIllII = Cipher.getInstance("DES");
            llllllllllllIllllIllllllIIIIllII.init(CombinedChannelDuplexHandler.lIlllIlIlIlllI[2], llllllllllllIllllIllllllIIIIllIl);
            return new String(llllllllllllIllllIllllllIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllllllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllllllIIIIlIll) {
            llllllllllllIllllIllllllIIIIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIllllIllllllIlllllll, final Throwable llllllllllllIllllIllllllIllllllI) throws Exception {
        this.inboundHandler.exceptionCaught(llllllllllllIllllIllllllIlllllll, llllllllllllIllllIllllllIllllllI);
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext llllllllllllIllllIlllllllIlIlIII) throws Exception {
        if (lIIIIIlIlllIIIll(this.inboundHandler)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[8]]).append(ChannelPipeline.class.getSimpleName()).append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[9]]).append(CombinedChannelDuplexHandler.class.getSimpleName()).append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[10]])));
        }
        try {
            this.inboundHandler.handlerAdded(llllllllllllIllllIlllllllIlIlIII);
            this.outboundHandler.handlerAdded(llllllllllllIllllIlllllllIlIlIII);
            "".length();
            if (-" ".length() >= ((0x1E ^ 0x2) & ~(0x7D ^ 0x61))) {
                return;
            }
        }
        finally {
            this.outboundHandler.handlerAdded(llllllllllllIllllIlllllllIlIlIII);
        }
    }
    
    @Override
    public void read(final ChannelHandlerContext llllllllllllIllllIllllllIIlIlIlI) throws Exception {
        this.outboundHandler.read(llllllllllllIllllIllllllIIlIlIlI);
    }
    
    @Override
    public void channelReadComplete(final ChannelHandlerContext llllllllllllIllllIllllllIllIIllI) throws Exception {
        this.inboundHandler.channelReadComplete(llllllllllllIllllIllllllIllIIllI);
    }
    
    private static boolean lIIIIIlIlllIIIlI(final Object llllllllllllIllllIlllllIllIllIlI) {
        return llllllllllllIllllIlllllIllIllIlI != null;
    }
    
    static {
        lIIIIIlIlllIIIIl();
        lIIIIIlIllIIlIll();
    }
    
    @Override
    public void channelRegistered(final ChannelHandlerContext llllllllllllIllllIlllllllIIllIIl) throws Exception {
        this.inboundHandler.channelRegistered(llllllllllllIllllIlllllllIIllIIl);
    }
    
    private static void lIIIIIlIllIIlIll() {
        (lIlllIlIlIIlIl = new String[CombinedChannelDuplexHandler.lIlllIlIlIlllI[11]])[CombinedChannelDuplexHandler.lIlllIlIlIlllI[0]] = lIIIIIlIllIIIIIl("wanfVa07GmdcGVsWzK30gMfDxWlyTBb+uljjcf3rwOg=", "JuFEQ");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[1]] = lIIIIIlIllIIIIlI("bw8nHVAsFygdBD0NJRoVK1gxBwQnWCgBHmIcIwgROhQyThMgFjUaAjobMgECYQ==", "OxFnp");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[2]] = lIIIIIlIllIIIIIl("8DbmAOSYr97I8z843SlVMg==", "xNHVe");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[3]] = lIIIIIlIllIIIIlI("LjY8IyQ0LSwJKi8nJCQ5", "ACHAK");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[4]] = lIIIIIlIllIIIlll("Gg2GnvPp32snODp/YzVSQ4cHdsism7ZAe4kJ+qoYHNMnZLtujVfu6w==", "vYmFg");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[5]] = lIIIIIlIllIIIlll("kobjS/zoYe9AyR4aGgtPSTnA0RNB4hWJ", "LKiYk");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[6]] = lIIIIIlIllIIIlll("tJqIzorZP3ysmOwBRpLkvpPqYwDfuGGmxIHJfi5Qi+RhcTuSQ9zCwQ==", "mQHeX");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[7]] = lIIIIIlIllIIIIIl("W4ljy6WIr1EgFyQVjzJQ1dhPYFcZ4iRf", "QPxoI");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[8]] = lIIIIIlIllIIIlll("7Stj2G8QtSyax3/OkX/x+5ui7oQV1Fu/pOTuvJomVH+FxYWh0UasIAWdWMstwbDB", "APrHd");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[9]] = lIIIIIlIllIIIIIl("U4euTpEPSE4=", "EIHKx");
        CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[10]] = lIIIIIlIllIIIIIl("Zw5uqOqNPlfCc317ZT3Gxn5e5CpUBUaqjA6Xfo1arh1COH2wC6ZuASHtoRT21F7j", "ACcud");
    }
    
    protected final void init(final I llllllllllllIllllIllllllllIIIIlI, final O llllllllllllIllllIllllllllIIIIIl) {
        this.validate(llllllllllllIllllIllllllllIIIIlI, llllllllllllIllllIllllllllIIIIIl);
        this.inboundHandler = llllllllllllIllllIllllllllIIIIlI;
        this.outboundHandler = llllllllllllIllllIllllllllIIIIIl;
    }
    
    @Override
    public void disconnect(final ChannelHandlerContext llllllllllllIllllIllllllIlIIIllI, final ChannelPromise llllllllllllIllllIllllllIlIIIlIl) throws Exception {
        this.outboundHandler.disconnect(llllllllllllIllllIllllllIlIIIllI, llllllllllllIllllIllllllIlIIIlIl);
    }
    
    @Override
    public void connect(final ChannelHandlerContext llllllllllllIllllIllllllIlIlIIll, final SocketAddress llllllllllllIllllIllllllIlIlIIlI, final SocketAddress llllllllllllIllllIllllllIlIlIIIl, final ChannelPromise llllllllllllIllllIllllllIlIlIIII) throws Exception {
        this.outboundHandler.connect(llllllllllllIllllIllllllIlIlIIll, llllllllllllIllllIllllllIlIlIIlI, llllllllllllIllllIllllllIlIlIIIl, llllllllllllIllllIllllllIlIlIIII);
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext llllllllllllIllllIlllllllIIIllll) throws Exception {
        this.inboundHandler.channelActive(llllllllllllIllllIlllllllIIIllll);
    }
    
    @Override
    public void bind(final ChannelHandlerContext llllllllllllIllllIllllllIlIlllII, final SocketAddress llllllllllllIllllIllllllIlIlllll, final ChannelPromise llllllllllllIllllIllllllIlIllllI) throws Exception {
        this.outboundHandler.bind(llllllllllllIllllIllllllIlIlllII, llllllllllllIllllIllllllIlIlllll, llllllllllllIllllIllllllIlIllllI);
    }
    
    @Override
    public void userEventTriggered(final ChannelHandlerContext llllllllllllIllllIllllllIlllIllI, final Object llllllllllllIllllIllllllIllllIII) throws Exception {
        this.inboundHandler.userEventTriggered(llllllllllllIllllIllllllIlllIllI, llllllllllllIllllIllllllIllllIII);
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIllllIllllllIllIllIl, final Object llllllllllllIllllIllllllIllIllII) throws Exception {
        this.inboundHandler.channelRead(llllllllllllIllllIllllllIllIllIl, llllllllllllIllllIllllllIllIllII);
    }
    
    private void validate(final I llllllllllllIllllIlllllllIllIllI, final O llllllllllllIllllIlllllllIlllIII) {
        if (lIIIIIlIlllIIIlI(this.inboundHandler)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[0]]).append(CombinedChannelDuplexHandler.class.getSimpleName()).append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[1]])));
        }
        if (lIIIIIlIlllIIIll(llllllllllllIllllIlllllllIllIllI)) {
            throw new NullPointerException(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[2]]);
        }
        if (lIIIIIlIlllIIIll(llllllllllllIllllIlllllllIlllIII)) {
            throw new NullPointerException(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[3]]);
        }
        if (lIIIIIlIlllIIlII((llllllllllllIllllIlllllllIllIllI instanceof ChannelOutboundHandler) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[4]]).append(ChannelOutboundHandler.class.getSimpleName()).append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[5]])));
        }
        if (lIIIIIlIlllIIlII((llllllllllllIllllIlllllllIlllIII instanceof ChannelInboundHandler) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[6]]).append(ChannelInboundHandler.class.getSimpleName()).append(CombinedChannelDuplexHandler.lIlllIlIlIIlIl[CombinedChannelDuplexHandler.lIlllIlIlIlllI[7]])));
        }
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIllllIlllllllIIIIlll) throws Exception {
        this.inboundHandler.channelInactive(llllllllllllIllllIlllllllIIIIlll);
    }
    
    private static String lIIIIIlIllIIIIlI(String llllllllllllIllllIlllllIllllIlIl, final String llllllllllllIllllIlllllIlllllIIl) {
        llllllllllllIllllIlllllIllllIlIl = new String(Base64.getDecoder().decode(llllllllllllIllllIlllllIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlllllIlllllIII = new StringBuilder();
        final char[] llllllllllllIllllIlllllIllllIlll = llllllllllllIllllIlllllIlllllIIl.toCharArray();
        int llllllllllllIllllIlllllIllllIllI = CombinedChannelDuplexHandler.lIlllIlIlIlllI[0];
        final float llllllllllllIllllIlllllIllllIIII = (Object)llllllllllllIllllIlllllIllllIlIl.toCharArray();
        final boolean llllllllllllIllllIlllllIlllIllll = llllllllllllIllllIlllllIllllIIII.length != 0;
        Exception llllllllllllIllllIlllllIlllIlllI = (Exception)CombinedChannelDuplexHandler.lIlllIlIlIlllI[0];
        while (lIIIIIlIlllIIlIl((int)llllllllllllIllllIlllllIlllIlllI, llllllllllllIllllIlllllIlllIllll ? 1 : 0)) {
            final char llllllllllllIllllIlllllIlllllIll = llllllllllllIllllIlllllIllllIIII[llllllllllllIllllIlllllIlllIlllI];
            llllllllllllIllllIlllllIlllllIII.append((char)(llllllllllllIllllIlllllIlllllIll ^ llllllllllllIllllIlllllIllllIlll[llllllllllllIllllIlllllIllllIllI % llllllllllllIllllIlllllIllllIlll.length]));
            "".length();
            ++llllllllllllIllllIlllllIllllIllI;
            ++llllllllllllIllllIlllllIlllIlllI;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlllllIlllllIII);
    }
    
    private static boolean lIIIIIlIlllIIIll(final Object llllllllllllIllllIlllllIllIllIII) {
        return llllllllllllIllllIlllllIllIllIII == null;
    }
    
    protected CombinedChannelDuplexHandler() {
    }
    
    @Override
    public void handlerRemoved(final ChannelHandlerContext llllllllllllIllllIlllllllIlIIIlI) throws Exception {
        try {
            this.inboundHandler.handlerRemoved(llllllllllllIllllIlllllllIlIIIlI);
            this.outboundHandler.handlerRemoved(llllllllllllIllllIlllllllIlIIIlI);
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        finally {
            this.outboundHandler.handlerRemoved(llllllllllllIllllIlllllllIlIIIlI);
        }
    }
    
    @Override
    public void close(final ChannelHandlerContext llllllllllllIllllIllllllIIlllIlI, final ChannelPromise llllllllllllIllllIllllllIIllllII) throws Exception {
        this.outboundHandler.close(llllllllllllIllllIllllllIIlllIlI, llllllllllllIllllIllllllIIllllII);
    }
    
    @Override
    public void deregister(final ChannelHandlerContext llllllllllllIllllIllllllIIllIIIl, final ChannelPromise llllllllllllIllllIllllllIIllIIII) throws Exception {
        this.outboundHandler.deregister(llllllllllllIllllIllllllIIllIIIl, llllllllllllIllllIllllllIIllIIII);
    }
    
    public CombinedChannelDuplexHandler(final I llllllllllllIllllIllllllllIIlIII, final O llllllllllllIllllIllllllllIIlIlI) {
        this.init(llllllllllllIllllIllllllllIIlIII, llllllllllllIllllIllllllllIIlIlI);
    }
    
    private static boolean lIIIIIlIlllIIlIl(final int llllllllllllIllllIlllllIllIlllIl, final int llllllllllllIllllIlllllIllIlllII) {
        return llllllllllllIllllIlllllIllIlllIl < llllllllllllIllllIlllllIllIlllII;
    }
    
    private static String lIIIIIlIllIIIIIl(final String llllllllllllIllllIlllllIlllIIlIl, final String llllllllllllIllllIlllllIlllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlllllIlllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllllIlllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlllllIlllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlllllIlllIIlll.init(CombinedChannelDuplexHandler.lIlllIlIlIlllI[2], llllllllllllIllllIlllllIlllIlIII);
            return new String(llllllllllllIllllIlllllIlllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllllIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllllIlllIIllI) {
            llllllllllllIllllIlllllIlllIIllI.printStackTrace();
            return null;
        }
    }
    
    protected final I inboundHandler() {
        return this.inboundHandler;
    }
    
    @Override
    public void flush(final ChannelHandlerContext llllllllllllIllllIllllllIIIllIlI) throws Exception {
        this.outboundHandler.flush(llllllllllllIllllIllllllIIIllIlI);
    }
    
    @Override
    public void channelWritabilityChanged(final ChannelHandlerContext llllllllllllIllllIllllllIIIlIIlI) throws Exception {
        this.inboundHandler.channelWritabilityChanged(llllllllllllIllllIllllllIIIlIIlI);
    }
}
