// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.login.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.util.CryptManager;
import net.minecraft.network.PacketBuffer;
import java.security.PublicKey;
import net.minecraft.network.login.INetHandlerLoginClient;
import net.minecraft.network.Packet;

public class S01PacketEncryptionRequest implements Packet<INetHandlerLoginClient>
{
    private /* synthetic */ byte[] verifyToken;
    private static final /* synthetic */ int[] llIlIlllllIIlI;
    private /* synthetic */ PublicKey publicKey;
    private /* synthetic */ String hashedServerId;
    
    public PublicKey getPublicKey() {
        return this.publicKey;
    }
    
    public S01PacketEncryptionRequest(final String llllllllllllIllIlIIIlIlIlllIlllI, final PublicKey llllllllllllIllIlIIIlIlIlllIllIl, final byte[] llllllllllllIllIlIIIlIlIllllIIII) {
        this.hashedServerId = llllllllllllIllIlIIIlIlIlllIlllI;
        this.publicKey = llllllllllllIllIlIIIlIlIlllIllIl;
        this.verifyToken = llllllllllllIllIlIIIlIlIllllIIII;
    }
    
    @Override
    public void processPacket(final INetHandlerLoginClient llllllllllllIllIlIIIlIlIllIllIlI) {
        llllllllllllIllIlIIIlIlIllIllIlI.handleEncryptionRequest(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIlIIIlIlIlllIlIII) throws IOException {
        this.hashedServerId = llllllllllllIllIlIIIlIlIlllIlIII.readStringFromBuffer(S01PacketEncryptionRequest.llIlIlllllIIlI[0]);
        this.publicKey = CryptManager.decodePublicKey(llllllllllllIllIlIIIlIlIlllIlIII.readByteArray());
        this.verifyToken = llllllllllllIllIlIIIlIlIlllIlIII.readByteArray();
    }
    
    public S01PacketEncryptionRequest() {
    }
    
    public byte[] getVerifyToken() {
        return this.verifyToken;
    }
    
    private static void lIIlIllIIIIIlIII() {
        (llIlIlllllIIlI = new int[1])[0] = (0x25 ^ 0x37 ^ (0x5C ^ 0x5A));
    }
    
    static {
        lIIlIllIIIIIlIII();
    }
    
    public String getServerId() {
        return this.hashedServerId;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIlIIIlIlIlllIIIII) throws IOException {
        llllllllllllIllIlIIIlIlIlllIIIII.writeString(this.hashedServerId);
        "".length();
        llllllllllllIllIlIIIlIlIlllIIIII.writeByteArray(this.publicKey.getEncoded());
        llllllllllllIllIlIIIlIlIlllIIIII.writeByteArray(this.verifyToken);
    }
}
