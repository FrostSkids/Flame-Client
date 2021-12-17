// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.multiplayer.ServerAddress;

public class RealmsServerAddress
{
    private final /* synthetic */ int port;
    private final /* synthetic */ String host;
    
    public static RealmsServerAddress parseString(final String llllllllllllIlIllIIlIllIIllIlIlI) {
        final ServerAddress llllllllllllIlIllIIlIllIIllIlIll = ServerAddress.func_78860_a(llllllllllllIlIllIIlIllIIllIlIlI);
        return new RealmsServerAddress(llllllllllllIlIllIIlIllIIllIlIll.getIP(), llllllllllllIlIllIIlIllIIllIlIll.getPort());
    }
    
    protected RealmsServerAddress(final String llllllllllllIlIllIIlIllIIllllIIl, final int llllllllllllIlIllIIlIllIIllllIII) {
        this.host = llllllllllllIlIllIIlIllIIllllIIl;
        this.port = llllllllllllIlIllIIlIllIIllllIII;
    }
    
    public int getPort() {
        return this.port;
    }
    
    public String getHost() {
        return this.host;
    }
}
