// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.nio;

import java.net.StandardProtocolFamily;
import java.net.ProtocolFamily;
import io.netty.channel.socket.InternetProtocolFamily;

final class ProtocolFamilyConverter
{
    private ProtocolFamilyConverter() {
    }
    
    public static ProtocolFamily convert(final InternetProtocolFamily llllllllllllIlIllIIIlIllIlIIlllI) {
        switch (ProtocolFamilyConverter$1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily[llllllllllllIlIllIIIlIllIlIIlllI.ordinal()]) {
            case 1: {
                return StandardProtocolFamily.INET;
            }
            case 2: {
                return StandardProtocolFamily.INET6;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
}
