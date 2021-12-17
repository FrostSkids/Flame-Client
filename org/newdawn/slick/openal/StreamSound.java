// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import java.io.IOException;
import org.newdawn.slick.util.Log;

public class StreamSound extends AudioImpl
{
    private static final /* synthetic */ String[] lllllIIIIIIll;
    private static final /* synthetic */ int[] lllllIIIIlIII;
    private /* synthetic */ OpenALStreamPlayer player;
    
    static {
        lIlIllIIlIllIlI();
        lIlIllIIlIllIII();
    }
    
    private static void lIlIllIIlIllIII() {
        (lllllIIIIIIll = new String[StreamSound.lllllIIIIlIII[1]])[StreamSound.lllllIIIIlIII[0]] = lIlIllIIlIlIlll("6kw7ume/ui7SoYT38nXpEnOE/Zfa+3ZnDyO21cKq5Zo=", "awJDU");
    }
    
    @Override
    public int playAsMusic(final float lllllllllllllIlIllIIIlIlIIlIlIll, final float lllllllllllllIlIllIIIlIlIIlIlllI, final boolean lllllllllllllIlIllIIIlIlIIlIllIl) {
        try {
            this.cleanUpSource();
            this.player.setup(lllllllllllllIlIllIIIlIlIIlIlIll);
            this.player.play(lllllllllllllIlIllIIIlIlIIlIllIl);
            SoundStore.get().setStream(this.player);
            "".length();
            if ("  ".length() <= 0) {
                return (0x81 ^ 0xB9) & ~(0xBD ^ 0x85);
            }
        }
        catch (IOException lllllllllllllIlIllIIIlIlIIllIIIl) {
            Log.error(String.valueOf(new StringBuilder().append(StreamSound.lllllIIIIIIll[StreamSound.lllllIIIIlIII[0]]).append(this.player.getSource())));
        }
        return SoundStore.get().getSource(StreamSound.lllllIIIIlIII[0]);
    }
    
    private void cleanUpSource() {
        final SoundStore lllllllllllllIlIllIIIlIlIIlIIlII = SoundStore.get();
        AL10.alSourceStop(lllllllllllllIlIllIIIlIlIIlIIlII.getSource(StreamSound.lllllIIIIlIII[0]));
        final IntBuffer lllllllllllllIlIllIIIlIlIIlIIIll = BufferUtils.createIntBuffer(StreamSound.lllllIIIIlIII[1]);
        int lllllllllllllIlIllIIIlIlIIlIIIlI = AL10.alGetSourcei(lllllllllllllIlIllIIIlIlIIlIIlII.getSource(StreamSound.lllllIIIIlIII[0]), StreamSound.lllllIIIIlIII[2]);
        while (lIlIllIIlIllIll(lllllllllllllIlIllIIIlIlIIlIIIlI)) {
            AL10.alSourceUnqueueBuffers(lllllllllllllIlIllIIIlIlIIlIIlII.getSource(StreamSound.lllllIIIIlIII[0]), lllllllllllllIlIllIIIlIlIIlIIIll);
            --lllllllllllllIlIllIIIlIlIIlIIIlI;
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        AL10.alSourcei(lllllllllllllIlIllIIIlIlIIlIIlII.getSource(StreamSound.lllllIIIIlIII[0]), StreamSound.lllllIIIIlIII[3], StreamSound.lllllIIIIlIII[0]);
    }
    
    @Override
    public float getPosition() {
        return this.player.getPosition();
    }
    
    private static String lIlIllIIlIlIlll(final String lllllllllllllIlIllIIIlIIllllIIII, final String lllllllllllllIlIllIIIlIIlllIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIlIIllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIlIIlllIllll.getBytes(StandardCharsets.UTF_8)), StreamSound.lllllIIIIlIII[4]), "DES");
            final Cipher lllllllllllllIlIllIIIlIIllllIlII = Cipher.getInstance("DES");
            lllllllllllllIlIllIIIlIIllllIlII.init(StreamSound.lllllIIIIlIII[5], lllllllllllllIlIllIIIlIIllllIlIl);
            return new String(lllllllllllllIlIllIIIlIIllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIlIIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIlIIllllIIll) {
            lllllllllllllIlIllIIIlIIllllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void stop() {
        SoundStore.get().setStream(null);
    }
    
    public StreamSound(final OpenALStreamPlayer lllllllllllllIlIllIIIlIlIIlllIll) {
        this.player = lllllllllllllIlIllIIIlIlIIlllIll;
    }
    
    @Override
    public int playAsSoundEffect(final float lllllllllllllIlIllIIIlIlIIIIlIlI, final float lllllllllllllIlIllIIIlIlIIIIIlIl, final boolean lllllllllllllIlIllIIIlIlIIIIIlII) {
        return this.playAsMusic(lllllllllllllIlIllIIIlIlIIIIlIlI, lllllllllllllIlIllIIIlIlIIIIIlIl, lllllllllllllIlIllIIIlIlIIIIIlII);
    }
    
    private static boolean lIlIllIIlIllIll(final int lllllllllllllIlIllIIIlIIlllIlIll) {
        return lllllllllllllIlIllIIIlIIlllIlIll > 0;
    }
    
    @Override
    public boolean setPosition(final float lllllllllllllIlIllIIIlIIllllllIl) {
        return this.player.setPosition(lllllllllllllIlIllIIIlIIllllllIl);
    }
    
    private static void lIlIllIIlIllIlI() {
        (lllllIIIIlIII = new int[6])[0] = ((0x32 ^ 0x2C ^ (0xF6 ^ 0xB1)) & (50 + 10 + 86 + 49 ^ 14 + 114 - 92 + 118 ^ -" ".length()));
        StreamSound.lllllIIIIlIII[1] = " ".length();
        StreamSound.lllllIIIIlIII[2] = (0xFFFF9AF7 & 0x751D);
        StreamSound.lllllIIIIlIII[3] = (-(0xFFFFAD77 & 0x7E89) & (0xFFFFBD1D & 0x7EEB));
        StreamSound.lllllIIIIlIII[4] = (0x11 ^ 0x77 ^ (0x7C ^ 0x12));
        StreamSound.lllllIIIIlIII[5] = "  ".length();
    }
    
    @Override
    public int playAsSoundEffect(final float lllllllllllllIlIllIIIlIlIIIlIIlI, final float lllllllllllllIlIllIIIlIlIIIllIII, final boolean lllllllllllllIlIllIIIlIlIIIlIlll, final float lllllllllllllIlIllIIIlIlIIIlIllI, final float lllllllllllllIlIllIIIlIlIIIlIlIl, final float lllllllllllllIlIllIIIlIlIIIlIlII) {
        return this.playAsMusic(lllllllllllllIlIllIIIlIlIIIlIIlI, lllllllllllllIlIllIIIlIlIIIllIII, lllllllllllllIlIllIIIlIlIIIlIlll);
    }
    
    @Override
    public boolean isPlaying() {
        return SoundStore.get().isPlaying(this.player);
    }
}
