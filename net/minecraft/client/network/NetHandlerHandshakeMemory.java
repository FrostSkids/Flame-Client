// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.network;

import net.minecraft.util.IChatComponent;
import net.minecraft.network.INetHandler;
import net.minecraft.server.network.NetHandlerLoginServer;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.handshake.INetHandlerHandshakeServer;

public class NetHandlerHandshakeMemory implements INetHandlerHandshakeServer
{
    private final /* synthetic */ MinecraftServer mcServer;
    private final /* synthetic */ NetworkManager networkManager;
    
    @Override
    public void processHandshake(final C00Handshake llllllllllllIlIlllIllIlIIlllIIll) {
        this.networkManager.setConnectionState(llllllllllllIlIlllIllIlIIlllIIll.getRequestedState());
        this.networkManager.setNetHandler(new NetHandlerLoginServer(this.mcServer, this.networkManager));
    }
    
    public NetHandlerHandshakeMemory(final MinecraftServer llllllllllllIlIlllIllIlIIlllllIl, final NetworkManager llllllllllllIlIlllIllIlIIllllIIl) {
        this.mcServer = llllllllllllIlIlllIllIlIIlllllIl;
        this.networkManager = llllllllllllIlIlllIllIlIIllllIIl;
    }
    
    @Override
    public void onDisconnect(final IChatComponent llllllllllllIlIlllIllIlIIlllIIIl) {
    }
}
