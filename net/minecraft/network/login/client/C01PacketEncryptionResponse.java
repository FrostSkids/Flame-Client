// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.login.client;

import java.security.Key;
import java.security.PublicKey;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.util.CryptManager;
import javax.crypto.SecretKey;
import java.security.PrivateKey;
import net.minecraft.network.login.INetHandlerLoginServer;
import net.minecraft.network.Packet;

public class C01PacketEncryptionResponse implements Packet<INetHandlerLoginServer>
{
    private /* synthetic */ byte[] secretKeyEncrypted;
    private static final /* synthetic */ int[] llIIIlllllIllI;
    private /* synthetic */ byte[] verifyTokenEncrypted;
    
    @Override
    public void processPacket(final INetHandlerLoginServer llllllllllllIlllIIllllIIIlIllIIl) {
        llllllllllllIlllIIllllIIIlIllIIl.processEncryptionResponse(this);
    }
    
    public C01PacketEncryptionResponse() {
        this.secretKeyEncrypted = new byte[C01PacketEncryptionResponse.llIIIlllllIllI[0]];
        this.verifyTokenEncrypted = new byte[C01PacketEncryptionResponse.llIIIlllllIllI[0]];
    }
    
    public SecretKey getSecretKey(final PrivateKey llllllllllllIlllIIllllIIIlIlIlIl) {
        return CryptManager.decryptSharedKey(llllllllllllIlllIIllllIIIlIlIlIl, this.secretKeyEncrypted);
    }
    
    static {
        lIIIlIllIlIlIIII();
    }
    
    private static void lIIIlIllIlIlIIII() {
        (llIIIlllllIllI = new int[1])[0] = ((87 + 153 - 182 + 131 ^ 162 + 31 - 154 + 124) & (0x6C ^ 0x3C ^ (0x35 ^ 0x7B) ^ -" ".length()) & (((0x42 ^ 0x70 ^ (0x87 ^ 0xBC)) & (0xE0 ^ 0xC2 ^ (0x5A ^ 0x71) ^ -" ".length())) ^ -" ".length()));
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIIllllIIIllIIlll) throws IOException {
        this.secretKeyEncrypted = llllllllllllIlllIIllllIIIllIIlll.readByteArray();
        this.verifyTokenEncrypted = llllllllllllIlllIIllllIIIllIIlll.readByteArray();
    }
    
    public C01PacketEncryptionResponse(final SecretKey llllllllllllIlllIIllllIIIllIllIl, final PublicKey llllllllllllIlllIIllllIIIllIllII, final byte[] llllllllllllIlllIIllllIIIllIlIll) {
        this.secretKeyEncrypted = new byte[C01PacketEncryptionResponse.llIIIlllllIllI[0]];
        this.verifyTokenEncrypted = new byte[C01PacketEncryptionResponse.llIIIlllllIllI[0]];
        this.secretKeyEncrypted = CryptManager.encryptData(llllllllllllIlllIIllllIIIllIllII, llllllllllllIlllIIllllIIIllIllIl.getEncoded());
        this.verifyTokenEncrypted = CryptManager.encryptData(llllllllllllIlllIIllllIIIllIllII, llllllllllllIlllIIllllIIIllIlIll);
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIIllllIIIlIlllll) throws IOException {
        llllllllllllIlllIIllllIIIlIlllll.writeByteArray(this.secretKeyEncrypted);
        llllllllllllIlllIIllllIIIlIlllll.writeByteArray(this.verifyTokenEncrypted);
    }
    
    public byte[] getVerifyToken(final PrivateKey llllllllllllIlllIIllllIIIlIIllll) {
        byte[] array;
        if (lIIIlIllIlIlIIIl(llllllllllllIlllIIllllIIIlIIllll)) {
            array = this.verifyTokenEncrypted;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            array = CryptManager.decryptData(llllllllllllIlllIIllllIIIlIIllll, this.verifyTokenEncrypted);
        }
        return array;
    }
    
    private static boolean lIIIlIllIlIlIIIl(final Object llllllllllllIlllIIllllIIIlIIIlll) {
        return llllllllllllIlllIIllllIIIlIIIlll == null;
    }
}
