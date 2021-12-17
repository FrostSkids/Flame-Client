// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Arrays;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.util.HashMap;
import java.util.Iterator;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.http.FullHttpMessage;
import java.util.Map;
import io.netty.handler.codec.MessageToMessageDecoder;

public class SpdyHttpDecoder extends MessageToMessageDecoder<SpdyFrame>
{
    private static final /* synthetic */ int[] llIIIlllIIlIll;
    private final /* synthetic */ int maxContentLength;
    private final /* synthetic */ Map<Integer, FullHttpMessage> messageMap;
    private final /* synthetic */ int spdyVersion;
    private static final /* synthetic */ String[] llIIIlllIIIlll;
    private final /* synthetic */ boolean validateHeaders;
    
    private static String lIIIlIlIlIllllII(final String llllllllllllIlllIlIIIIllIllIIllI, final String llllllllllllIlllIlIIIIllIllIIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIIllIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIIllIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIIIllIllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIIIllIllIlIlI.init(SpdyHttpDecoder.llIIIlllIIlIll[2], llllllllllllIlllIlIIIIllIllIlIll);
            return new String(llllllllllllIlllIlIIIIllIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIIllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIIllIllIlIIl) {
            llllllllllllIlllIlIIIIllIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIlIllIIIlll() {
        (llIIIlllIIIlll = new String[SpdyHttpDecoder.llIIIlllIIlIll[10]])[SpdyHttpDecoder.llIIIlllIIlIll[1]] = lIIIlIlIlIlllIlI("GYaWy8j/XOI=", "RibMO");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[0]] = lIIIlIlIlIlllIll("LxsyEyssDi8+MA4fJDcwKlonJTc2Wig1ZCNaOj83Kw4jJiFiEyQkISUfOGpk", "BzJPD");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[2]] = lIIIlIlIlIllllII("L8J3kkeILoerZcaQP7lBxthuY55huW2PUznoF+QOL6I=", "xxbSQ");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[3]] = lIIIlIlIlIllllII("wK7shIDggV8=", "ulRWq");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[4]] = lIIIlIlIlIlllIlI("uMmMByeuUAg=", "jATtb");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[5]] = lIIIlIlIlIllllII("m+7jZjo1hpU=", "lzuCF");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[6]] = lIIIlIlIlIllllII("A6/GAV3dcPQ=", "nPnFI");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[7]] = lIIIlIlIlIlllIlI("VT3cFJzfRUpRfDyWTH/JxbfFt71JAAg5", "laVYH");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[8]] = lIIIlIlIlIllllII("NrcQZedMDnBSm4Yy+d1dxn9Bzt8wVjFj", "XSxsr");
        SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[9]] = lIIIlIlIlIlllIlI("HuzbaSzk3bM=", "MkMWr");
    }
    
    static {
        lIIIlIlIllIIlllI();
        lIIIlIlIllIIIlll();
    }
    
    private static FullHttpRequest createHttpRequest(final int llllllllllllIlllIlIIIIllllIIIlIl, final SpdyHeadersFrame llllllllllllIlllIlIIIIllllIIIlII) throws Exception {
        final SpdyHeaders llllllllllllIlllIlIIIIllllIIlIll = llllllllllllIlllIlIIIIllllIIIlII.headers();
        final HttpMethod llllllllllllIlllIlIIIIllllIIlIlI = SpdyHeaders.getMethod(llllllllllllIlllIlIIIIllllIIIlIl, llllllllllllIlllIlIIIIllllIIIlII);
        final String llllllllllllIlllIlIIIIllllIIlIIl = SpdyHeaders.getUrl(llllllllllllIlllIlIIIIllllIIIlIl, llllllllllllIlllIlIIIIllllIIIlII);
        final HttpVersion llllllllllllIlllIlIIIIllllIIlIII = SpdyHeaders.getVersion(llllllllllllIlllIlIIIIllllIIIlIl, llllllllllllIlllIlIIIIllllIIIlII);
        SpdyHeaders.removeMethod(llllllllllllIlllIlIIIIllllIIIlIl, llllllllllllIlllIlIIIIllllIIIlII);
        SpdyHeaders.removeUrl(llllllllllllIlllIlIIIIllllIIIlIl, llllllllllllIlllIlIIIIllllIIIlII);
        SpdyHeaders.removeVersion(llllllllllllIlllIlIIIIllllIIIlIl, llllllllllllIlllIlIIIIllllIIIlII);
        final FullHttpRequest llllllllllllIlllIlIIIIllllIIIlll = new DefaultFullHttpRequest(llllllllllllIlllIlIIIIllllIIlIII, llllllllllllIlllIlIIIIllllIIlIlI, llllllllllllIlllIlIIIIllllIIlIIl);
        SpdyHeaders.removeScheme(llllllllllllIlllIlIIIIllllIIIlIl, llllllllllllIlllIlIIIIllllIIIlII);
        final String llllllllllllIlllIlIIIIllllIIIllI = llllllllllllIlllIlIIIIllllIIlIll.get(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[4]]);
        llllllllllllIlllIlIIIIllllIIlIll.remove(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[5]]);
        "".length();
        llllllllllllIlllIlIIIIllllIIIlll.headers().set(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[6]], llllllllllllIlllIlIIIIllllIIIllI);
        "".length();
        final Iterator llllllllllllIlllIlIIIIllllIIlllI = llllllllllllIlllIlIIIIllllIIIlII.headers().iterator();
        while (lIIIlIlIllIlIIIl(llllllllllllIlllIlIIIIllllIIlllI.hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIlllIlIIIIllllIIllll = llllllllllllIlllIlIIIIllllIIlllI.next();
            llllllllllllIlllIlIIIIllllIIIlll.headers().add(llllllllllllIlllIlIIIIllllIIllll.getKey(), llllllllllllIlllIlIIIIllllIIllll.getValue());
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        HttpHeaders.setKeepAlive(llllllllllllIlllIlIIIIllllIIIlll, (boolean)(SpdyHttpDecoder.llIIIlllIIlIll[0] != 0));
        llllllllllllIlllIlIIIIllllIIIlll.headers().remove(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[7]]);
        "".length();
        return llllllllllllIlllIlIIIIllllIIIlll;
    }
    
    public SpdyHttpDecoder(final SpdyVersion llllllllllllIlllIlIIIlIIIlIIIlIl, final int llllllllllllIlllIlIIIlIIIlIIIlII, final boolean llllllllllllIlllIlIIIlIIIlIIIlll) {
        this(llllllllllllIlllIlIIIlIIIlIIIlIl, llllllllllllIlllIlIIIlIIIlIIIlII, new HashMap<Integer, FullHttpMessage>(), llllllllllllIlllIlIIIlIIIlIIIlll);
    }
    
    private static boolean lIIIlIlIllIIllll(final Object llllllllllllIlllIlIIIIllIlIllIIl) {
        return llllllllllllIlllIlIIIIllIlIllIIl == null;
    }
    
    protected FullHttpMessage removeMessage(final int llllllllllllIlllIlIIIlIIIIIlIlIl) {
        return this.messageMap.remove(llllllllllllIlllIlIIIlIIIIIlIlIl);
    }
    
    private static boolean lIIIlIlIllIlIIII(final int llllllllllllIlllIlIIIIllIlIlIIll) {
        return llllllllllllIlllIlIIIIllIlIlIIll <= 0;
    }
    
    protected SpdyHttpDecoder(final SpdyVersion llllllllllllIlllIlIIIlIIIIllIIII, final int llllllllllllIlllIlIIIlIIIIlIlIlI, final Map<Integer, FullHttpMessage> llllllllllllIlllIlIIIlIIIIlIlIIl, final boolean llllllllllllIlllIlIIIlIIIIlIllIl) {
        if (lIIIlIlIllIIllll(llllllllllllIlllIlIIIlIIIIllIIII)) {
            throw new NullPointerException(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[1]]);
        }
        if (lIIIlIlIllIlIIII(llllllllllllIlllIlIIIlIIIIlIlIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[0]]).append(llllllllllllIlllIlIIIlIIIIlIlIlI)));
        }
        this.spdyVersion = llllllllllllIlllIlIIIlIIIIllIIII.getVersion();
        this.maxContentLength = llllllllllllIlllIlIIIlIIIIlIlIlI;
        this.messageMap = llllllllllllIlllIlIIIlIIIIlIlIIl;
        this.validateHeaders = llllllllllllIlllIlIIIlIIIIlIllIl;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlllIlIIIIlllllIIIlI, final SpdyFrame llllllllllllIlllIlIIIIlllllIIlIl, final List<Object> llllllllllllIlllIlIIIIlllllIIIII) throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Could not show original bytecode, likely due to the same error.
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MethodBodyParseException: An error occurred while parsing the bytecode of method 'io/netty/handler/codec/spdy/SpdyHttpDecoder.decode:(Lio/netty/channel/ChannelHandlerContext;Lio/netty/handler/codec/spdy/SpdyFrame;Ljava/util/List<Ljava/lang/Object;>;)V'.
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:66)
        //     at com.strobel.assembler.metadata.MethodDefinition.tryLoadBody(MethodDefinition.java:729)
        //     at com.strobel.assembler.metadata.MethodDefinition.getBody(MethodDefinition.java:83)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:202)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // Caused by: java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 757
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.assembler.ir.ConstantPool.getEntry(ConstantPool.java:68)
        //     at com.strobel.assembler.metadata.ClassFileReader$Scope.lookupMethod(ClassFileReader.java:1238)
        //     at com.strobel.assembler.metadata.MethodReader.readBodyCore(MethodReader.java:203)
        //     at com.strobel.assembler.metadata.MethodReader.readBody(MethodReader.java:62)
        //     ... 16 more
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIIlIlIllIlIIlI(final int llllllllllllIlllIlIIIIllIlIlIlIl) {
        return llllllllllllIlllIlIIIIllIlIlIlIl == 0;
    }
    
    private static boolean lIIIlIlIllIlIIIl(final int llllllllllllIlllIlIIIIllIlIlIlll) {
        return llllllllllllIlllIlIIIIllIlIlIlll != 0;
    }
    
    private static void lIIIlIlIllIIlllI() {
        (llIIIlllIIlIll = new int[11])[0] = " ".length();
        SpdyHttpDecoder.llIIIlllIIlIll[1] = ((85 + 3 + 38 + 30 ^ 97 + 114 - 90 + 65) & (0x11 ^ 0x60 ^ (0xC2 ^ 0x95) ^ -" ".length()));
        SpdyHttpDecoder.llIIIlllIIlIll[2] = "  ".length();
        SpdyHttpDecoder.llIIIlllIIlIll[3] = "   ".length();
        SpdyHttpDecoder.llIIIlllIIlIll[4] = (0x48 ^ 0x64 ^ (0xB8 ^ 0x90));
        SpdyHttpDecoder.llIIIlllIIlIll[5] = (0x8F ^ 0x8A);
        SpdyHttpDecoder.llIIIlllIIlIll[6] = (106 + 53 + 25 + 6 ^ 110 + 78 - 154 + 150);
        SpdyHttpDecoder.llIIIlllIIlIll[7] = (9 + 80 - 30 + 79 ^ 76 + 27 + 20 + 18);
        SpdyHttpDecoder.llIIIlllIIlIll[8] = (0x8F ^ 0xB7 ^ (0xB4 ^ 0x84));
        SpdyHttpDecoder.llIIIlllIIlIll[9] = (0xA6 ^ 0xAF);
        SpdyHttpDecoder.llIIIlllIIlIll[10] = (142 + 109 - 139 + 92 ^ 6 + 29 + 125 + 38);
    }
    
    private static boolean lIIIlIlIllIlIlII(final int llllllllllllIlllIlIIIIllIllIIIII, final int llllllllllllIlllIlIIIIllIlIlllll) {
        return llllllllllllIlllIlIIIIllIllIIIII < llllllllllllIlllIlIIIIllIlIlllll;
    }
    
    public SpdyHttpDecoder(final SpdyVersion llllllllllllIlllIlIIIlIIIlIlIIll, final int llllllllllllIlllIlIIIlIIIlIIllll) {
        this(llllllllllllIlllIlIIIlIIIlIlIIll, llllllllllllIlllIlIIIlIIIlIIllll, new HashMap<Integer, FullHttpMessage>(), (boolean)(SpdyHttpDecoder.llIIIlllIIlIll[0] != 0));
    }
    
    protected FullHttpMessage putMessage(final int llllllllllllIlllIlIIIlIIIIlIIIII, final FullHttpMessage llllllllllllIlllIlIIIlIIIIIlllll) {
        return this.messageMap.put(llllllllllllIlllIlIIIlIIIIlIIIII, llllllllllllIlllIlIIIlIIIIIlllll);
    }
    
    private static FullHttpResponse createHttpResponse(final ChannelHandlerContext llllllllllllIlllIlIIIIlllIlIlIIl, final int llllllllllllIlllIlIIIIlllIlIllll, final SpdyHeadersFrame llllllllllllIlllIlIIIIlllIlIlllI, final boolean llllllllllllIlllIlIIIIlllIlIIllI) throws Exception {
        final HttpResponseStatus llllllllllllIlllIlIIIIlllIlIllII = SpdyHeaders.getStatus(llllllllllllIlllIlIIIIlllIlIllll, llllllllllllIlllIlIIIIlllIlIlllI);
        final HttpVersion llllllllllllIlllIlIIIIlllIlIlIll = SpdyHeaders.getVersion(llllllllllllIlllIlIIIIlllIlIllll, llllllllllllIlllIlIIIIlllIlIlllI);
        SpdyHeaders.removeStatus(llllllllllllIlllIlIIIIlllIlIllll, llllllllllllIlllIlIIIIlllIlIlllI);
        SpdyHeaders.removeVersion(llllllllllllIlllIlIIIIlllIlIllll, llllllllllllIlllIlIIIIlllIlIlllI);
        final FullHttpResponse llllllllllllIlllIlIIIIlllIlIlIlI = new DefaultFullHttpResponse(llllllllllllIlllIlIIIIlllIlIlIll, llllllllllllIlllIlIIIIlllIlIllII, llllllllllllIlllIlIIIIlllIlIlIIl.alloc().buffer(), llllllllllllIlllIlIIIIlllIlIIllI);
        final Iterator llllllllllllIlllIlIIIIlllIllIIIl = llllllllllllIlllIlIIIIlllIlIlllI.headers().iterator();
        while (lIIIlIlIllIlIIIl(llllllllllllIlllIlIIIIlllIllIIIl.hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIlllIlIIIIlllIllIIlI = llllllllllllIlllIlIIIIlllIllIIIl.next();
            llllllllllllIlllIlIIIIlllIlIlIlI.headers().add(llllllllllllIlllIlIIIIlllIllIIlI.getKey(), llllllllllllIlllIlIIIIlllIllIIlI.getValue());
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        HttpHeaders.setKeepAlive(llllllllllllIlllIlIIIIlllIlIlIlI, (boolean)(SpdyHttpDecoder.llIIIlllIIlIll[0] != 0));
        llllllllllllIlllIlIIIIlllIlIlIlI.headers().remove(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[8]]);
        "".length();
        llllllllllllIlllIlIIIIlllIlIlIlI.headers().remove(SpdyHttpDecoder.llIIIlllIIIlll[SpdyHttpDecoder.llIIIlllIIlIll[9]]);
        "".length();
        return llllllllllllIlllIlIIIIlllIlIlIlI;
    }
    
    private static boolean lIIIlIlIllIlIIll(final int llllllllllllIlllIlIIIIllIlIlllII, final int llllllllllllIlllIlIIIIllIlIllIll) {
        return llllllllllllIlllIlIIIIllIlIlllII > llllllllllllIlllIlIIIIllIlIllIll;
    }
    
    protected FullHttpMessage getMessage(final int llllllllllllIlllIlIIIlIIIIIllIIl) {
        return this.messageMap.get(llllllllllllIlllIlIIIlIIIIIllIIl);
    }
    
    private static String lIIIlIlIlIlllIll(String llllllllllllIlllIlIIIIllIlllllIl, final String llllllllllllIlllIlIIIIllIlllIlll) {
        llllllllllllIlllIlIIIIllIlllllIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIIIllIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIIIllIllllIll = new StringBuilder();
        final char[] llllllllllllIlllIlIIIIllIllllIlI = llllllllllllIlllIlIIIIllIlllIlll.toCharArray();
        int llllllllllllIlllIlIIIIllIllllIIl = SpdyHttpDecoder.llIIIlllIIlIll[1];
        final short llllllllllllIlllIlIIIIllIlllIIll = (Object)llllllllllllIlllIlIIIIllIlllllIl.toCharArray();
        final String llllllllllllIlllIlIIIIllIlllIIlI = (String)llllllllllllIlllIlIIIIllIlllIIll.length;
        float llllllllllllIlllIlIIIIllIlllIIIl = SpdyHttpDecoder.llIIIlllIIlIll[1];
        while (lIIIlIlIllIlIlII((int)llllllllllllIlllIlIIIIllIlllIIIl, (int)llllllllllllIlllIlIIIIllIlllIIlI)) {
            final char llllllllllllIlllIlIIIIllIllllllI = llllllllllllIlllIlIIIIllIlllIIll[llllllllllllIlllIlIIIIllIlllIIIl];
            llllllllllllIlllIlIIIIllIllllIll.append((char)(llllllllllllIlllIlIIIIllIllllllI ^ llllllllllllIlllIlIIIIllIllllIlI[llllllllllllIlllIlIIIIllIllllIIl % llllllllllllIlllIlIIIIllIllllIlI.length]));
            "".length();
            ++llllllllllllIlllIlIIIIllIllllIIl;
            ++llllllllllllIlllIlIIIIllIlllIIIl;
            "".length();
            if (-(0x4A ^ 0x1E ^ (0x62 ^ 0x32)) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIIIllIllllIll);
    }
    
    private static String lIIIlIlIlIlllIlI(final String llllllllllllIlllIlIIIIlllIIIlIll, final String llllllllllllIlllIlIIIIlllIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIIlllIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIIlllIIIlIlI.getBytes(StandardCharsets.UTF_8)), SpdyHttpDecoder.llIIIlllIIlIll[8]), "DES");
            final Cipher llllllllllllIlllIlIIIIlllIIIllll = Cipher.getInstance("DES");
            llllllllllllIlllIlIIIIlllIIIllll.init(SpdyHttpDecoder.llIIIlllIIlIll[2], llllllllllllIlllIlIIIIlllIIlIIII);
            return new String(llllllllllllIlllIlIIIIlllIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIIlllIIIlllI) {
            llllllllllllIlllIlIIIIlllIIIlllI.printStackTrace();
            return null;
        }
    }
    
    protected SpdyHttpDecoder(final SpdyVersion llllllllllllIlllIlIIIlIIIIllllIl, final int llllllllllllIlllIlIIIlIIIIllllII, final Map<Integer, FullHttpMessage> llllllllllllIlllIlIIIlIIIIlllIll) {
        this(llllllllllllIlllIlIIIlIIIIllllIl, llllllllllllIlllIlIIIlIIIIllllII, llllllllllllIlllIlIIIlIIIIlllIll, (boolean)(SpdyHttpDecoder.llIIIlllIIlIll[0] != 0));
    }
}
