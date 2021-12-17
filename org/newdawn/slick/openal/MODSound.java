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
import java.io.InputStream;
import ibxm.OpenALMODPlayer;
import ibxm.Module;

public class MODSound extends AudioImpl
{
    private /* synthetic */ SoundStore store;
    private static final /* synthetic */ String[] lllIlllIlIIlII;
    private /* synthetic */ Module module;
    private static /* synthetic */ OpenALMODPlayer player;
    private static final /* synthetic */ int[] lllIlllIlIIlIl;
    
    @Override
    public float getPosition() {
        throw new RuntimeException(MODSound.lllIlllIlIIlII[MODSound.lllIlllIlIIlIl[0]]);
    }
    
    public void poll() {
        MODSound.player.update();
    }
    
    @Override
    public boolean setPosition(final float llllllllllllIlIllIIIIlIIIllllIll) {
        throw new RuntimeException(MODSound.lllIlllIlIIlII[MODSound.lllIlllIlIIlIl[1]]);
    }
    
    static {
        lIlIIlIllIllIIII();
        lIlIIlIllIlIllll();
        MODSound.player = new OpenALMODPlayer();
    }
    
    private static boolean lIlIIlIllIllIIIl(final int llllllllllllIlIllIIIIlIIIllIllII) {
        return llllllllllllIlIllIIIIlIIIllIllII > 0;
    }
    
    @Override
    public int playAsMusic(final float llllllllllllIlIllIIIIlIIlIIlIlIl, final float llllllllllllIlIllIIIIlIIlIIlIIII, final boolean llllllllllllIlIllIIIIlIIlIIIllll) {
        this.cleanUpSource();
        MODSound.player.play(this.module, this.store.getSource(MODSound.lllIlllIlIIlIl[0]), llllllllllllIlIllIIIIlIIlIIIllll, SoundStore.get().isMusicOn());
        MODSound.player.setup(llllllllllllIlIllIIIIlIIlIIlIlIl, 1.0f);
        this.store.setCurrentMusicVolume(llllllllllllIlIllIIIIlIIlIIlIIII);
        this.store.setMOD(this);
        return this.store.getSource(MODSound.lllIlllIlIIlIl[0]);
    }
    
    private static void lIlIIlIllIlIllll() {
        (lllIlllIlIIlII = new String[MODSound.lllIlllIlIIlIl[5]])[MODSound.lllIlllIlIIlIl[0]] = lIlIIlIllIlIlllI("eo58gGextQLLFR75YhxHDFeKoa6yXK1xDY/InpiYR0GodwjaUGAyBdCkDOKpPsLdXVR/Qb04gxI=", "Ajlza");
        MODSound.lllIlllIlIIlII[MODSound.lllIlllIlIIlIl[1]] = lIlIIlIllIlIlllI("BYPY9RqXJGmgVuwudAUBfP1nDDeYt028WLc5c5QkJNoSfwQoHARgqi629Yi3WfHRiwq2xw/IJ1M=", "PQLpt");
    }
    
    public MODSound(final SoundStore llllllllllllIlIllIIIIlIIlIIlllll, final InputStream llllllllllllIlIllIIIIlIIlIIllIll) throws IOException {
        this.store = llllllllllllIlIllIIIIlIIlIIlllll;
        this.module = OpenALMODPlayer.loadModule(llllllllllllIlIllIIIIlIIlIIllIll);
    }
    
    private void cleanUpSource() {
        AL10.alSourceStop(this.store.getSource(MODSound.lllIlllIlIIlIl[0]));
        final IntBuffer llllllllllllIlIllIIIIlIIlIIIlIlI = BufferUtils.createIntBuffer(MODSound.lllIlllIlIIlIl[1]);
        int llllllllllllIlIllIIIIlIIlIIIlIIl = AL10.alGetSourcei(this.store.getSource(MODSound.lllIlllIlIIlIl[0]), MODSound.lllIlllIlIIlIl[2]);
        while (lIlIIlIllIllIIIl(llllllllllllIlIllIIIIlIIlIIIlIIl)) {
            AL10.alSourceUnqueueBuffers(this.store.getSource(MODSound.lllIlllIlIIlIl[0]), llllllllllllIlIllIIIIlIIlIIIlIlI);
            --llllllllllllIlIllIIIIlIIlIIIlIIl;
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        AL10.alSourcei(this.store.getSource(MODSound.lllIlllIlIIlIl[0]), MODSound.lllIlllIlIIlIl[3], MODSound.lllIlllIlIIlIl[0]);
    }
    
    private static void lIlIIlIllIllIIII() {
        (lllIlllIlIIlIl = new int[7])[0] = ((0x27 ^ 0xB) & ~(0xB5 ^ 0x99));
        MODSound.lllIlllIlIIlIl[1] = " ".length();
        MODSound.lllIlllIlIIlIl[2] = (0xFFFFD2B5 & 0x3D5F);
        MODSound.lllIlllIlIIlIl[3] = (-(0xFFFFBDA5 & 0x6AFF) & (0xFFFFF9FF & 0x3EAD));
        MODSound.lllIlllIlIIlIl[4] = -" ".length();
        MODSound.lllIlllIlIIlIl[5] = "  ".length();
        MODSound.lllIlllIlIIlIl[6] = (0x16 ^ 0x73 ^ (0xFA ^ 0x97));
    }
    
    private static String lIlIIlIllIlIlllI(final String llllllllllllIlIllIIIIlIIIlllIIIl, final String llllllllllllIlIllIIIIlIIIlllIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIlIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIlIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), MODSound.lllIlllIlIIlIl[6]), "DES");
            final Cipher llllllllllllIlIllIIIIlIIIlllIlIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIlIIIlllIlIl.init(MODSound.lllIlllIlIIlIl[5], llllllllllllIlIllIIIIlIIIlllIllI);
            return new String(llllllllllllIlIllIIIIlIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIlIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIlIIIlllIlII) {
            llllllllllllIlIllIIIIlIIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void stop() {
        this.store.setMOD(null);
    }
    
    @Override
    public int playAsSoundEffect(final float llllllllllllIlIllIIIIlIIlIIIIIll, final float llllllllllllIlIllIIIIlIIlIIIIIlI, final boolean llllllllllllIlIllIIIIlIIlIIIIIIl) {
        return MODSound.lllIlllIlIIlIl[4];
    }
}
