// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.network.INetHandler;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S3DPacketDisplayScoreboard implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ String scoreName;
    private /* synthetic */ int position;
    private static final /* synthetic */ int[] lIlIIlllllllII;
    private static final /* synthetic */ String[] lIlIIllllllIII;
    
    public int func_149371_c() {
        return this.position;
    }
    
    public S3DPacketDisplayScoreboard() {
    }
    
    private static String lllIlIlIIlIIllI(final String lllllllllllllIIIlIllIlIlIIIIIllI, final String lllllllllllllIIIlIllIlIlIIIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllIlIlIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIlIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIllIlIlIIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIllIlIlIIIIlIII.init(S3DPacketDisplayScoreboard.lIlIIlllllllII[3], lllllllllllllIIIlIllIlIlIIIIlIIl);
            return new String(lllllllllllllIIIlIllIlIlIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllIlIlIIIIIlll) {
            lllllllllllllIIIlIllIlIlIIIIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIlIllIlIlIIIllIlI) {
        lllllllllllllIIIlIllIlIlIIIllIlI.handleDisplayScoreboard(this);
    }
    
    private static void lllIlIlIIlIIlll() {
        (lIlIIllllllIII = new String[S3DPacketDisplayScoreboard.lIlIIlllllllII[2]])[S3DPacketDisplayScoreboard.lIlIIlllllllII[0]] = lllIlIlIIlIIllI("VxtRjoi/37g=", "StNxE");
    }
    
    public S3DPacketDisplayScoreboard(final int lllllllllllllIIIlIllIlIlIIlIlllI, final ScoreObjective lllllllllllllIIIlIllIlIlIIlIlIlI) {
        this.position = lllllllllllllIIIlIllIlIlIIlIlllI;
        if (lllIlIlIIlIllII(lllllllllllllIIIlIllIlIlIIlIlIlI)) {
            this.scoreName = S3DPacketDisplayScoreboard.lIlIIllllllIII[S3DPacketDisplayScoreboard.lIlIIlllllllII[0]];
            "".length();
            if ("   ".length() < 0) {
                throw null;
            }
        }
        else {
            this.scoreName = lllllllllllllIIIlIllIlIlIIlIlIlI.getName();
        }
    }
    
    private static boolean lllIlIlIIlIllII(final Object lllllllllllllIIIlIllIlIIllllllll) {
        return lllllllllllllIIIlIllIlIIllllllll == null;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIlIllIlIlIIlIIIII) throws IOException {
        lllllllllllllIIIlIllIlIlIIlIIIII.writeByte(this.position);
        "".length();
        lllllllllllllIIIlIllIlIlIIlIIIII.writeString(this.scoreName);
        "".length();
    }
    
    private static void lllIlIlIIlIlIll() {
        (lIlIIlllllllII = new int[4])[0] = ((((0x5A ^ 0x60) & ~(0xFA ^ 0xC0)) ^ (0x20 ^ 0x71)) & (0xA4 ^ 0x8B ^ (0x4D ^ 0x33) ^ -" ".length()));
        S3DPacketDisplayScoreboard.lIlIIlllllllII[1] = (0x7E ^ 0x6E);
        S3DPacketDisplayScoreboard.lIlIIlllllllII[2] = " ".length();
        S3DPacketDisplayScoreboard.lIlIIlllllllII[3] = "  ".length();
    }
    
    public String func_149370_d() {
        return this.scoreName;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIlIllIlIlIIlIIllI) throws IOException {
        this.position = lllllllllllllIIIlIllIlIlIIlIIllI.readByte();
        this.scoreName = lllllllllllllIIIlIllIlIlIIlIIllI.readStringFromBuffer(S3DPacketDisplayScoreboard.lIlIIlllllllII[1]);
    }
    
    static {
        lllIlIlIIlIlIll();
        lllIlIlIIlIIlll();
    }
}
