// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.status.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.util.EnumTypeAdapterFactory;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import net.minecraft.network.ServerStatusResponse;
import com.google.gson.Gson;
import net.minecraft.network.status.INetHandlerStatusClient;
import net.minecraft.network.Packet;

public class S00PacketServerInfo implements Packet<INetHandlerStatusClient>
{
    private static final /* synthetic */ Gson GSON;
    private /* synthetic */ ServerStatusResponse response;
    private static final /* synthetic */ int[] llIIIIlIllIlll;
    
    static {
        lIIIIlllllllllll();
        GSON = new GsonBuilder().registerTypeAdapter((Type)ServerStatusResponse.MinecraftProtocolVersionIdentifier.class, (Object)new ServerStatusResponse.MinecraftProtocolVersionIdentifier.Serializer()).registerTypeAdapter((Type)ServerStatusResponse.PlayerCountData.class, (Object)new ServerStatusResponse.PlayerCountData.Serializer()).registerTypeAdapter((Type)ServerStatusResponse.class, (Object)new ServerStatusResponse.Serializer()).registerTypeHierarchyAdapter((Class)IChatComponent.class, (Object)new IChatComponent.Serializer()).registerTypeHierarchyAdapter((Class)ChatStyle.class, (Object)new ChatStyle.Serializer()).registerTypeAdapterFactory((TypeAdapterFactory)new EnumTypeAdapterFactory()).create();
    }
    
    public ServerStatusResponse getResponse() {
        return this.response;
    }
    
    @Override
    public void processPacket(final INetHandlerStatusClient llllllllllllIlllIllIlllIIIlIIlll) {
        llllllllllllIlllIllIlllIIIlIIlll.handleServerInfo(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIllIlllIIIllIlII) throws IOException {
        llllllllllllIlllIllIlllIIIllIlII.writeString(S00PacketServerInfo.GSON.toJson((Object)this.response));
        "".length();
    }
    
    private static void lIIIIlllllllllll() {
        (llIIIIlIllIlll = new int[1])[0] = (-1 & 0x7FFF);
    }
    
    public S00PacketServerInfo(final ServerStatusResponse llllllllllllIlllIllIlllIIIllllll) {
        this.response = llllllllllllIlllIllIlllIIIllllll;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIllIlllIIIlllIll) throws IOException {
        this.response = (ServerStatusResponse)S00PacketServerInfo.GSON.fromJson(llllllllllllIlllIllIlllIIIlllIll.readStringFromBuffer(S00PacketServerInfo.llIIIIlIllIlll[0]), (Class)ServerStatusResponse.class);
    }
    
    public S00PacketServerInfo() {
    }
}
