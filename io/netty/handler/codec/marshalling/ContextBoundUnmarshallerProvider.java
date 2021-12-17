// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.MarshallerFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.Attribute;
import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Unmarshaller;
import io.netty.util.AttributeKey;

public class ContextBoundUnmarshallerProvider extends DefaultUnmarshallerProvider
{
    private static final /* synthetic */ AttributeKey<Unmarshaller> UNMARSHALLER;
    private static final /* synthetic */ int[] llIllllllllIlI;
    private static final /* synthetic */ String[] llIlllllllIIII;
    
    @Override
    public Unmarshaller getUnmarshaller(final ChannelHandlerContext llllllllllllIllIIIlIlIIlIIIIIIlI) throws Exception {
        final Attribute<Unmarshaller> llllllllllllIllIIIlIlIIlIIIIIIIl = llllllllllllIllIIIlIlIIlIIIIIIlI.attr(ContextBoundUnmarshallerProvider.UNMARSHALLER);
        Unmarshaller llllllllllllIllIIIlIlIIlIIIIIIII = llllllllllllIllIIIlIlIIlIIIIIIIl.get();
        if (lIIllIlllIlIIlll(llllllllllllIllIIIlIlIIlIIIIIIII)) {
            llllllllllllIllIIIlIlIIlIIIIIIII = super.getUnmarshaller(llllllllllllIllIIIlIlIIlIIIIIIlI);
            llllllllllllIllIIIlIlIIlIIIIIIIl.set(llllllllllllIllIIIlIlIIlIIIIIIII);
        }
        return llllllllllllIllIIIlIlIIlIIIIIIII;
    }
    
    private static String lIIllIlllIIIllII(String llllllllllllIllIIIlIlIIIlllIllII, final String llllllllllllIllIIIlIlIIIllllIIII) {
        llllllllllllIllIIIlIlIIIlllIllII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlIlIIIlllIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIlIIIlllIllll = new StringBuilder();
        final char[] llllllllllllIllIIIlIlIIIlllIlllI = llllllllllllIllIIIlIlIIIllllIIII.toCharArray();
        int llllllllllllIllIIIlIlIIIlllIllIl = ContextBoundUnmarshallerProvider.llIllllllllIlI[0];
        final Exception llllllllllllIllIIIlIlIIIlllIIlll = (Object)((String)llllllllllllIllIIIlIlIIIlllIllII).toCharArray();
        final byte llllllllllllIllIIIlIlIIIlllIIllI = (byte)llllllllllllIllIIIlIlIIIlllIIlll.length;
        int llllllllllllIllIIIlIlIIIlllIIlIl = ContextBoundUnmarshallerProvider.llIllllllllIlI[0];
        while (lIIllIlllIlIlIII(llllllllllllIllIIIlIlIIIlllIIlIl, llllllllllllIllIIIlIlIIIlllIIllI)) {
            final char llllllllllllIllIIIlIlIIIllllIIlI = llllllllllllIllIIIlIlIIIlllIIlll[llllllllllllIllIIIlIlIIIlllIIlIl];
            llllllllllllIllIIIlIlIIIlllIllll.append((char)(llllllllllllIllIIIlIlIIIllllIIlI ^ llllllllllllIllIIIlIlIIIlllIlllI[llllllllllllIllIIIlIlIIIlllIllIl % llllllllllllIllIIIlIlIIIlllIlllI.length]));
            "".length();
            ++llllllllllllIllIIIlIlIIIlllIllIl;
            ++llllllllllllIllIIIlIlIIIlllIIlIl;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIlIIIlllIllll);
    }
    
    static {
        lIIllIlllIlIIllI();
        lIIllIlllIIIllIl();
        UNMARSHALLER = AttributeKey.valueOf(String.valueOf(new StringBuilder().append(ContextBoundUnmarshallerProvider.class.getName()).append(ContextBoundUnmarshallerProvider.llIlllllllIIII[ContextBoundUnmarshallerProvider.llIllllllllIlI[0]])));
    }
    
    private static void lIIllIlllIIIllIl() {
        (llIlllllllIIII = new String[ContextBoundUnmarshallerProvider.llIllllllllIlI[1]])[ContextBoundUnmarshallerProvider.llIllllllllIlI[0]] = lIIllIlllIIIllII("dBILIxUIFA0vGBYCFw==", "ZGEnT");
    }
    
    public ContextBoundUnmarshallerProvider(final MarshallerFactory llllllllllllIllIIIlIlIIlIIIIllII, final MarshallingConfiguration llllllllllllIllIIIlIlIIlIIIIlIll) {
        super(llllllllllllIllIIIlIlIIlIIIIllII, llllllllllllIllIIIlIlIIlIIIIlIll);
    }
    
    private static void lIIllIlllIlIIllI() {
        (llIllllllllIlI = new int[2])[0] = ((0x92 ^ 0xB5) & ~(0xB9 ^ 0x9E));
        ContextBoundUnmarshallerProvider.llIllllllllIlI[1] = " ".length();
    }
    
    private static boolean lIIllIlllIlIIlll(final Object llllllllllllIllIIIlIlIIIllIllllI) {
        return llllllllllllIllIIIlIlIIIllIllllI == null;
    }
    
    private static boolean lIIllIlllIlIlIII(final int llllllllllllIllIIIlIlIIIlllIIIIl, final int llllllllllllIllIIIlIlIIIlllIIIII) {
        return llllllllllllIllIIIlIlIIIlllIIIIl < llllllllllllIllIIIlIlIIIlllIIIII;
    }
}
