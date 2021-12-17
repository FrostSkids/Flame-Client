// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import com.sun.nio.sctp.SendFailedNotification;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import com.sun.nio.sctp.ShutdownNotification;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.sun.nio.sctp.Notification;
import com.sun.nio.sctp.HandlerResult;
import com.sun.nio.sctp.AssociationChangeNotification;
import com.sun.nio.sctp.AbstractNotificationHandler;

public final class SctpNotificationHandler extends AbstractNotificationHandler<Object>
{
    private static final /* synthetic */ int[] lIllIlIIIllIIl;
    private final /* synthetic */ SctpChannel sctpChannel;
    private static final /* synthetic */ String[] lIllIlIIIlIlll;
    
    private static void llllllIIIIIIIll() {
        (lIllIlIIIllIIl = new int[2])[0] = ((180 + 65 - 219 + 173 ^ 157 + 67 - 76 + 18) & (88 + 102 - 160 + 133 ^ 129 + 110 - 122 + 77 ^ -" ".length()));
        SctpNotificationHandler.lIllIlIIIllIIl[1] = " ".length();
    }
    
    private static void llllllIIIIIIIlI() {
        (lIllIlIIIlIlll = new String[SctpNotificationHandler.lIllIlIIIllIIl[1]])[SctpNotificationHandler.lIllIlIIIllIIl[0]] = llllllIIIIIIIIl("KyEkKC8wIz42CTQ=", "XBPXl");
    }
    
    @Override
    public HandlerResult handleNotification(final AssociationChangeNotification lllllllllllllIIIIIIIlIIIlllIIIII, final Object lllllllllllllIIIIIIIlIIIlllIIIlI) {
        this.fireEvent(lllllllllllllIIIIIIIlIIIlllIIIII);
        return HandlerResult.CONTINUE;
    }
    
    private static boolean llllllIIIIIIlII(final Object lllllllllllllIIIIIIIlIIIlIlIIlll) {
        return lllllllllllllIIIIIIIlIIIlIlIIlll == null;
    }
    
    private static String llllllIIIIIIIIl(String lllllllllllllIIIIIIIlIIIlIllIlIl, final String lllllllllllllIIIIIIIlIIIlIlllIIl) {
        lllllllllllllIIIIIIIlIIIlIllIlIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIlIIIlIllIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIlIIIlIlllIII = new StringBuilder();
        final char[] lllllllllllllIIIIIIIlIIIlIllIlll = lllllllllllllIIIIIIIlIIIlIlllIIl.toCharArray();
        int lllllllllllllIIIIIIIlIIIlIllIllI = SctpNotificationHandler.lIllIlIIIllIIl[0];
        final char lllllllllllllIIIIIIIlIIIlIllIIII = (Object)((String)lllllllllllllIIIIIIIlIIIlIllIlIl).toCharArray();
        final float lllllllllllllIIIIIIIlIIIlIlIllll = lllllllllllllIIIIIIIlIIIlIllIIII.length;
        float lllllllllllllIIIIIIIlIIIlIlIlllI = SctpNotificationHandler.lIllIlIIIllIIl[0];
        while (llllllIIIIIIlIl((int)lllllllllllllIIIIIIIlIIIlIlIlllI, (int)lllllllllllllIIIIIIIlIIIlIlIllll)) {
            final char lllllllllllllIIIIIIIlIIIlIlllIll = lllllllllllllIIIIIIIlIIIlIllIIII[lllllllllllllIIIIIIIlIIIlIlIlllI];
            lllllllllllllIIIIIIIlIIIlIlllIII.append((char)(lllllllllllllIIIIIIIlIIIlIlllIll ^ lllllllllllllIIIIIIIlIIIlIllIlll[lllllllllllllIIIIIIIlIIIlIllIllI % lllllllllllllIIIIIIIlIIIlIllIlll.length]));
            "".length();
            ++lllllllllllllIIIIIIIlIIIlIllIllI;
            ++lllllllllllllIIIIIIIlIIIlIlIlllI;
            "".length();
            if ("   ".length() < ((0xA1 ^ 0x96) & ~(0x2E ^ 0x19))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIlIIIlIlllIII);
    }
    
    static {
        llllllIIIIIIIll();
        llllllIIIIIIIlI();
    }
    
    @Override
    public HandlerResult handleNotification(final ShutdownNotification lllllllllllllIIIIIIIlIIIllIIlllI, final Object lllllllllllllIIIIIIIlIIIllIIllIl) {
        this.fireEvent(lllllllllllllIIIIIIIlIIIllIIlllI);
        this.sctpChannel.close();
        "".length();
        return HandlerResult.RETURN;
    }
    
    private static boolean llllllIIIIIIlIl(final int lllllllllllllIIIIIIIlIIIlIlIlIlI, final int lllllllllllllIIIIIIIlIIIlIlIlIIl) {
        return lllllllllllllIIIIIIIlIIIlIlIlIlI < lllllllllllllIIIIIIIlIIIlIlIlIIl;
    }
    
    @Override
    public HandlerResult handleNotification(final PeerAddressChangeNotification lllllllllllllIIIIIIIlIIIllIlllII, final Object lllllllllllllIIIIIIIlIIIllIllIll) {
        this.fireEvent(lllllllllllllIIIIIIIlIIIllIlllII);
        return HandlerResult.CONTINUE;
    }
    
    public SctpNotificationHandler(final SctpChannel lllllllllllllIIIIIIIlIIIlllIlIIl) {
        if (llllllIIIIIIlII(lllllllllllllIIIIIIIlIIIlllIlIIl)) {
            throw new NullPointerException(SctpNotificationHandler.lIllIlIIIlIlll[SctpNotificationHandler.lIllIlIIIllIIl[0]]);
        }
        this.sctpChannel = lllllllllllllIIIIIIIlIIIlllIlIIl;
    }
    
    @Override
    public HandlerResult handleNotification(final SendFailedNotification lllllllllllllIIIIIIIlIIIllIlIIlI, final Object lllllllllllllIIIIIIIlIIIllIlIlII) {
        this.fireEvent(lllllllllllllIIIIIIIlIIIllIlIIlI);
        return HandlerResult.CONTINUE;
    }
    
    private void fireEvent(final Notification lllllllllllllIIIIIIIlIIIllIIIlIl) {
        this.sctpChannel.pipeline().fireUserEventTriggered(lllllllllllllIIIIIIIlIIIllIIIlIl);
        "".length();
    }
}
