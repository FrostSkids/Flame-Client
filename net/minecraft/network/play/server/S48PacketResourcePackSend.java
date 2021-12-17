// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.util.Arrays;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S48PacketResourcePackSend implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ String url;
    private /* synthetic */ String hash;
    private static final /* synthetic */ int[] lllIlIIIIllIII;
    private static final /* synthetic */ String[] lllIlIIIIlIlll;
    
    private static String lIlIIIIlIlllllIl(final String llllllllllllIlIlllIIllIIllIllllI, final String llllllllllllIlIlllIIllIIllIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllIIlllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIllIIlllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIllIIlllIIIII.init(S48PacketResourcePackSend.lllIlIIIIllIII[4], llllllllllllIlIlllIIllIIlllIIIIl);
            return new String(llllllllllllIlIlllIIllIIlllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllIIllIlllll) {
            llllllllllllIlIlllIIllIIllIlllll.printStackTrace();
            return null;
        }
    }
    
    public S48PacketResourcePackSend(final String llllllllllllIlIlllIIllIlIIIlIIll, final String llllllllllllIlIlllIIllIlIIIIllll) {
        this.url = llllllllllllIlIlllIIllIlIIIlIIll;
        this.hash = llllllllllllIlIlllIIllIlIIIIllll;
        if (lIlIIIIllIIIIIII(llllllllllllIlIlllIIllIlIIIIllll.length(), S48PacketResourcePackSend.lllIlIIIIllIII[0])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(S48PacketResourcePackSend.lllIlIIIIlIlll[S48PacketResourcePackSend.lllIlIIIIllIII[1]]).append(llllllllllllIlIlllIIllIlIIIIllll.length()).append(S48PacketResourcePackSend.lllIlIIIIlIlll[S48PacketResourcePackSend.lllIlIIIIllIII[2]])));
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIlllIIllIlIIIIlIIl) throws IOException {
        this.url = llllllllllllIlIlllIIllIlIIIIlIIl.readStringFromBuffer(S48PacketResourcePackSend.lllIlIIIIllIII[3]);
        this.hash = llllllllllllIlIlllIIllIlIIIIlIIl.readStringFromBuffer(S48PacketResourcePackSend.lllIlIIIIllIII[0]);
    }
    
    private static boolean lIlIIIIllIIIIIII(final int llllllllllllIlIlllIIllIIllIlIllI, final int llllllllllllIlIlllIIllIIllIlIlIl) {
        return llllllllllllIlIlllIIllIIllIlIllI > llllllllllllIlIlllIIllIIllIlIlIl;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIlllIIllIlIIIIIlIl) throws IOException {
        llllllllllllIlIlllIIllIlIIIIIlIl.writeString(this.url);
        "".length();
        llllllllllllIlIlllIIllIlIIIIIlIl.writeString(this.hash);
        "".length();
    }
    
    private static String lIlIIIIlIlllllII(final String llllllllllllIlIlllIIllIIlllIlIll, final String llllllllllllIlIlllIIllIIlllIlIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllIIlllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIIlllIlIII.getBytes(StandardCharsets.UTF_8)), S48PacketResourcePackSend.lllIlIIIIllIII[5]), "DES");
            final Cipher llllllllllllIlIlllIIllIIlllIllIl = Cipher.getInstance("DES");
            llllllllllllIlIlllIIllIIlllIllIl.init(S48PacketResourcePackSend.lllIlIIIIllIII[4], llllllllllllIlIlllIIllIIlllIlllI);
            return new String(llllllllllllIlIlllIIllIIlllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllIIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllIIlllIllII) {
            llllllllllllIlIlllIIllIIlllIllII.printStackTrace();
            return null;
        }
    }
    
    public String getURL() {
        return this.url;
    }
    
    public String getHash() {
        return this.hash;
    }
    
    static {
        lIlIIIIlIlllllll();
        lIlIIIIlIllllllI();
    }
    
    private static void lIlIIIIlIlllllll() {
        (lllIlIIIIllIII = new int[6])[0] = (0x27 ^ 0xF);
        S48PacketResourcePackSend.lllIlIIIIllIII[1] = ((0x29 ^ 0xD) & ~(0x26 ^ 0x2));
        S48PacketResourcePackSend.lllIlIIIIllIII[2] = " ".length();
        S48PacketResourcePackSend.lllIlIIIIllIII[3] = (-" ".length() & (-1 & 0x7FFF));
        S48PacketResourcePackSend.lllIlIIIIllIII[4] = "  ".length();
        S48PacketResourcePackSend.lllIlIIIIllIII[5] = (0x65 ^ 0x6D);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIlllIIllIIllllllll) {
        llllllllllllIlIlllIIllIIllllllll.handleResourcePack(this);
    }
    
    private static void lIlIIIIlIllllllI() {
        (lllIlIIIIlIlll = new String[S48PacketResourcePackSend.lllIlIIIIllIII[4]])[S48PacketResourcePackSend.lllIlIIIIllIII[1]] = lIlIIIIlIlllllII("sPUNT6TwxZX80E581bVk6pKB9vs3oIo3rhTLQEltioo=", "PAGjj");
        S48PacketResourcePackSend.lllIlIIIIlIlll[S48PacketResourcePackSend.lllIlIIIIllIII[2]] = lIlIIIIlIlllllIl("u/fKHoxjOZI=", "PvJaU");
    }
    
    public S48PacketResourcePackSend() {
    }
}
