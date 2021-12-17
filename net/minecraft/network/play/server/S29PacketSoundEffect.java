// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.MathHelper;
import org.apache.commons.lang3.Validate;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S29PacketSoundEffect implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ String soundName;
    private /* synthetic */ int posY;
    private static final /* synthetic */ String[] lIIlIIIlllIIIl;
    private /* synthetic */ int posX;
    private /* synthetic */ int soundPitch;
    private static final /* synthetic */ int[] lIIlIIIlllIIll;
    private /* synthetic */ float soundVolume;
    private /* synthetic */ int posZ;
    
    private static String llIIlIlllIIlIII(final String lllllllllllllIIlllIIIllllIIlIIII, final String lllllllllllllIIlllIIIllllIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIllllIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIllllIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIllllIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIllllIIlIIlI.init(S29PacketSoundEffect.lIIlIIIlllIIll[4], lllllllllllllIIlllIIIllllIIlIIll);
            return new String(lllllllllllllIIlllIIIllllIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIllllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIllllIIlIIIl) {
            lllllllllllllIIlllIIIllllIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public S29PacketSoundEffect(final String lllllllllllllIIlllIIIlllllIIIlIl, final double lllllllllllllIIlllIIIlllllIIIlII, final double lllllllllllllIIlllIIIlllllIIIIll, final double lllllllllllllIIlllIIIlllllIIIIlI, final float lllllllllllllIIlllIIIlllllIIlIII, float lllllllllllllIIlllIIIlllllIIIlll) {
        this.posY = S29PacketSoundEffect.lIIlIIIlllIIll[0];
        Validate.notNull((Object)lllllllllllllIIlllIIIlllllIIIlIl, S29PacketSoundEffect.lIIlIIIlllIIIl[S29PacketSoundEffect.lIIlIIIlllIIll[1]], new Object[S29PacketSoundEffect.lIIlIIIlllIIll[1]]);
        "".length();
        this.soundName = lllllllllllllIIlllIIIlllllIIIlIl;
        this.posX = (int)(lllllllllllllIIlllIIIlllllIIIlII * 8.0);
        this.posY = (int)(lllllllllllllIIlllIIIlllllIIIIll * 8.0);
        this.posZ = (int)(lllllllllllllIIlllIIIlllllIIIIlI * 8.0);
        this.soundVolume = lllllllllllllIIlllIIIlllllIIlIII;
        this.soundPitch = (int)(lllllllllllllIIlllIIIlllllIIIlll * 63.0f);
        lllllllllllllIIlllIIIlllllIIIlll = MathHelper.clamp_float(lllllllllllllIIlllIIIlllllIIIlll, 0.0f, 255.0f);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIlllIIIllllIIllllI) {
        lllllllllllllIIlllIIIllllIIllllI.handleSoundEffect(this);
    }
    
    public S29PacketSoundEffect() {
        this.posY = S29PacketSoundEffect.lIIlIIIlllIIll[0];
    }
    
    public double getX() {
        return this.posX / 8.0f;
    }
    
    public float getPitch() {
        return this.soundPitch / 63.0f;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlllIIIllllIlllIlI) throws IOException {
        this.soundName = lllllllllllllIIlllIIIllllIlllIlI.readStringFromBuffer(S29PacketSoundEffect.lIIlIIIlllIIll[2]);
        this.posX = lllllllllllllIIlllIIIllllIlllIlI.readInt();
        this.posY = lllllllllllllIIlllIIIllllIlllIlI.readInt();
        this.posZ = lllllllllllllIIlllIIIllllIlllIlI.readInt();
        this.soundVolume = lllllllllllllIIlllIIIllllIlllIlI.readFloat();
        this.soundPitch = lllllllllllllIIlllIIIllllIlllIlI.readUnsignedByte();
    }
    
    public String getSoundName() {
        return this.soundName;
    }
    
    public double getY() {
        return this.posY / 8.0f;
    }
    
    public double getZ() {
        return this.posZ / 8.0f;
    }
    
    public float getVolume() {
        return this.soundVolume;
    }
    
    private static void llIIlIlllIIllIl() {
        (lIIlIIIlllIIll = new int[5])[0] = (-1 & Integer.MAX_VALUE);
        S29PacketSoundEffect.lIIlIIIlllIIll[1] = ((0x1B ^ 0x59) & ~(0x4A ^ 0x8));
        S29PacketSoundEffect.lIIlIIIlllIIll[2] = (0xFFFF9B28 & 0x65D7);
        S29PacketSoundEffect.lIIlIIIlllIIll[3] = " ".length();
        S29PacketSoundEffect.lIIlIIIlllIIll[4] = "  ".length();
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlllIIIllllIllIlII) throws IOException {
        lllllllllllllIIlllIIIllllIllIlII.writeString(this.soundName);
        "".length();
        lllllllllllllIIlllIIIllllIllIlII.writeInt(this.posX);
        "".length();
        lllllllllllllIIlllIIIllllIllIlII.writeInt(this.posY);
        "".length();
        lllllllllllllIIlllIIIllllIllIlII.writeInt(this.posZ);
        "".length();
        lllllllllllllIIlllIIIllllIllIlII.writeFloat(this.soundVolume);
        "".length();
        lllllllllllllIIlllIIIllllIllIlII.writeByte(this.soundPitch);
        "".length();
    }
    
    static {
        llIIlIlllIIllIl();
        llIIlIlllIIlIIl();
    }
    
    private static void llIIlIlllIIlIIl() {
        (lIIlIIIlllIIIl = new String[S29PacketSoundEffect.lIIlIIIlllIIll[3]])[S29PacketSoundEffect.lIIlIIIlllIIll[1]] = llIIlIlllIIlIII("5bLdj2JO5PA=", "woIWi");
    }
}
