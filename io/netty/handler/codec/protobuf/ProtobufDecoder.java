// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.protobuf;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandler;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageDecoder;

@ChannelHandler.Sharable
public class ProtobufDecoder extends MessageToMessageDecoder<ByteBuf>
{
    private static final /* synthetic */ boolean HAS_PARSER;
    private static final /* synthetic */ String[] llIIllIIIIllII;
    private final /* synthetic */ MessageLite prototype;
    private final /* synthetic */ ExtensionRegistry extensionRegistry;
    private static final /* synthetic */ int[] llIIllIIIIllIl;
    
    private static boolean lIIIlllIIlIllIII(final Object llllllllllllIlllIIIIlIIlIllllIIl) {
        return llllllllllllIlllIIIIlIIlIllllIIl == null;
    }
    
    public ProtobufDecoder(final MessageLite llllllllllllIlllIIIIlIIlllIIIIlI, final ExtensionRegistry llllllllllllIlllIIIIlIIllIlllllI) {
        if (lIIIlllIIlIllIII(llllllllllllIlllIIIIlIIlllIIIIlI)) {
            throw new NullPointerException(ProtobufDecoder.llIIllIIIIllII[ProtobufDecoder.llIIllIIIIllIl[0]]);
        }
        this.prototype = llllllllllllIlllIIIIlIIlllIIIIlI.getDefaultInstanceForType();
        this.extensionRegistry = llllllllllllIlllIIIIlIIllIlllllI;
    }
    
    private static boolean lIIIlllIIlIllIIl(final int llllllllllllIlllIIIIlIIlIlllIlll) {
        return llllllllllllIlllIIIIlIIlIlllIlll != 0;
    }
    
    static {
        lIIIlllIIlIlIlll();
        lIIIlllIIlIlIllI();
        boolean llllllllllllIlllIIIIlIIllIIllIIl = ProtobufDecoder.llIIllIIIIllIl[0] != 0;
        try {
            MessageLite.class.getDeclaredMethod(ProtobufDecoder.llIIllIIIIllII[ProtobufDecoder.llIIllIIIIllIl[1]], (Class<?>[])new Class[ProtobufDecoder.llIIllIIIIllIl[0]]);
            "".length();
            llllllllllllIlllIIIIlIIllIIllIIl = (ProtobufDecoder.llIIllIIIIllIl[1] != 0);
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        catch (Throwable t) {}
        HAS_PARSER = llllllllllllIlllIIIIlIIllIIllIIl;
    }
    
    private static String lIIIlllIIlIlIlIl(String llllllllllllIlllIIIIlIIllIIIIlll, final String llllllllllllIlllIIIIlIIllIIIlIll) {
        llllllllllllIlllIIIIlIIllIIIIlll = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIlIIllIIIlIlI = new StringBuilder();
        final char[] llllllllllllIlllIIIIlIIllIIIlIIl = llllllllllllIlllIIIIlIIllIIIlIll.toCharArray();
        int llllllllllllIlllIIIIlIIllIIIlIII = ProtobufDecoder.llIIllIIIIllIl[0];
        final int llllllllllllIlllIIIIlIIllIIIIIlI = (Object)llllllllllllIlllIIIIlIIllIIIIlll.toCharArray();
        final short llllllllllllIlllIIIIlIIllIIIIIIl = (short)llllllllllllIlllIIIIlIIllIIIIIlI.length;
        boolean llllllllllllIlllIIIIlIIllIIIIIII = ProtobufDecoder.llIIllIIIIllIl[0] != 0;
        while (lIIIlllIIlIllIlI(llllllllllllIlllIIIIlIIllIIIIIII ? 1 : 0, llllllllllllIlllIIIIlIIllIIIIIIl)) {
            final char llllllllllllIlllIIIIlIIllIIIllIl = llllllllllllIlllIIIIlIIllIIIIIlI[llllllllllllIlllIIIIlIIllIIIIIII];
            llllllllllllIlllIIIIlIIllIIIlIlI.append((char)(llllllllllllIlllIIIIlIIllIIIllIl ^ llllllllllllIlllIIIIlIIllIIIlIIl[llllllllllllIlllIIIIlIIllIIIlIII % llllllllllllIlllIIIIlIIllIIIlIIl.length]));
            "".length();
            ++llllllllllllIlllIIIIlIIllIIIlIII;
            ++llllllllllllIlllIIIIlIIllIIIIIII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIlIIllIIIlIlI);
    }
    
    public ProtobufDecoder(final MessageLite llllllllllllIlllIIIIlIIlllIIIlll) {
        this(llllllllllllIlllIIIIlIIlllIIIlll, null);
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlllIIIIlIIllIllIlII, final ByteBuf llllllllllllIlllIIIIlIIllIlIllIl, final List<Object> llllllllllllIlllIIIIlIIllIlIllII) throws Exception {
        final int llllllllllllIlllIIIIlIIllIlIllll = llllllllllllIlllIIIIlIIllIlIllIl.readableBytes();
        byte[] llllllllllllIlllIIIIlIIllIllIIIl = null;
        int llllllllllllIlllIIIIlIIllIllIIII = 0;
        if (lIIIlllIIlIllIIl(llllllllllllIlllIIIIlIIllIlIllIl.hasArray() ? 1 : 0)) {
            final byte[] llllllllllllIlllIIIIlIIllIllIlll = llllllllllllIlllIIIIlIIllIlIllIl.array();
            final int llllllllllllIlllIIIIlIIllIllIllI = llllllllllllIlllIIIIlIIllIlIllIl.arrayOffset() + llllllllllllIlllIIIIlIIllIlIllIl.readerIndex();
            "".length();
            if ("   ".length() > (0xAA ^ 0xAE)) {
                return;
            }
        }
        else {
            llllllllllllIlllIIIIlIIllIllIIIl = new byte[llllllllllllIlllIIIIlIIllIlIllll];
            llllllllllllIlllIIIIlIIllIlIllIl.getBytes(llllllllllllIlllIIIIlIIllIlIllIl.readerIndex(), llllllllllllIlllIIIIlIIllIllIIIl, ProtobufDecoder.llIIllIIIIllIl[0], llllllllllllIlllIIIIlIIllIlIllll);
            "".length();
            llllllllllllIlllIIIIlIIllIllIIII = ProtobufDecoder.llIIllIIIIllIl[0];
        }
        if (lIIIlllIIlIllIII(this.extensionRegistry)) {
            if (lIIIlllIIlIllIIl(ProtobufDecoder.HAS_PARSER ? 1 : 0)) {
                llllllllllllIlllIIIIlIIllIlIllII.add(this.prototype.getParserForType().parseFrom(llllllllllllIlllIIIIlIIllIllIIIl, llllllllllllIlllIIIIlIIllIllIIII, llllllllllllIlllIIIIlIIllIlIllll));
                "".length();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                llllllllllllIlllIIIIlIIllIlIllII.add(this.prototype.newBuilderForType().mergeFrom(llllllllllllIlllIIIIlIIllIllIIIl, llllllllllllIlllIIIIlIIllIllIIII, llllllllllllIlllIIIIlIIllIlIllll).build());
                "".length();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
        }
        else if (lIIIlllIIlIllIIl(ProtobufDecoder.HAS_PARSER ? 1 : 0)) {
            llllllllllllIlllIIIIlIIllIlIllII.add(this.prototype.getParserForType().parseFrom(llllllllllllIlllIIIIlIIllIllIIIl, llllllllllllIlllIIIIlIIllIllIIII, llllllllllllIlllIIIIlIIllIlIllll, (ExtensionRegistryLite)this.extensionRegistry));
            "".length();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            llllllllllllIlllIIIIlIIllIlIllII.add(this.prototype.newBuilderForType().mergeFrom(llllllllllllIlllIIIIlIIllIllIIIl, llllllllllllIlllIIIIlIIllIllIIII, llllllllllllIlllIIIIlIIllIlIllll, (ExtensionRegistryLite)this.extensionRegistry).build());
            "".length();
        }
    }
    
    private static void lIIIlllIIlIlIlll() {
        (llIIllIIIIllIl = new int[3])[0] = ((0x9D ^ 0x8C) & ~(0x86 ^ 0x97));
        ProtobufDecoder.llIIllIIIIllIl[1] = " ".length();
        ProtobufDecoder.llIIllIIIIllIl[2] = "  ".length();
    }
    
    private static boolean lIIIlllIIlIllIlI(final int llllllllllllIlllIIIIlIIlIlllllII, final int llllllllllllIlllIIIIlIIlIllllIll) {
        return llllllllllllIlllIIIIlIIlIlllllII < llllllllllllIlllIIIIlIIlIllllIll;
    }
    
    private static void lIIIlllIIlIlIllI() {
        (llIIllIIIIllII = new String[ProtobufDecoder.llIIllIIIIllIl[2]])[ProtobufDecoder.llIIllIIIIllIl[0]] = lIIIlllIIlIlIlIl("BAMKDDcACBUd", "tqexX");
        ProtobufDecoder.llIIllIIIIllII[ProtobufDecoder.llIIllIIIIllIl[1]] = lIIIlllIIlIlIlIl("KD8iIgY9KTMAISAoAgsXKg==", "OZVrg");
    }
}
