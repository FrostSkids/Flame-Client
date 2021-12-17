// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.net.URL;
import java.security.AccessController;
import org.lwjgl.openal.AL;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.openal.OpenALException;
import java.io.BufferedInputStream;
import org.newdawn.slick.util.ResourceLoader;
import java.io.IOException;
import org.lwjgl.Sys;
import org.newdawn.slick.util.Log;
import org.lwjgl.openal.AL10;
import org.lwjgl.BufferUtils;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.nio.FloatBuffer;

public class SoundStore
{
    private /* synthetic */ float lastCurrentMusicVolume;
    private /* synthetic */ FloatBuffer sourcePos;
    private /* synthetic */ MODSound mod;
    private /* synthetic */ OpenALStreamPlayer stream;
    private static final /* synthetic */ String[] lIllllIIllIIIl;
    private /* synthetic */ boolean paused;
    private static final /* synthetic */ int[] lIllllIIlllIII;
    private /* synthetic */ float musicVolume;
    private /* synthetic */ boolean sounds;
    private /* synthetic */ boolean deferred;
    private /* synthetic */ float soundVolume;
    private /* synthetic */ FloatBuffer sourceVel;
    private /* synthetic */ boolean soundWorks;
    private /* synthetic */ boolean music;
    private /* synthetic */ int sourceCount;
    private static /* synthetic */ SoundStore store;
    private /* synthetic */ boolean inited;
    private /* synthetic */ HashMap loaded;
    private /* synthetic */ int currentMusic;
    private /* synthetic */ int maxSources;
    private /* synthetic */ IntBuffer sources;
    
    public Audio getOgg(final String llllllllllllIllllIlIlIIIIlIIllIl, final InputStream llllllllllllIllllIlIlIIIIlIIllII) throws IOException {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return new NullAudio();
        }
        if (lIIIIlIIIlIIlIll(this.inited ? 1 : 0)) {
            throw new RuntimeException(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[24]]);
        }
        if (lIIIIlIIIlIIIIll(this.deferred ? 1 : 0)) {
            return new DeferredSound(llllllllllllIllllIlIlIIIIlIIllIl, llllllllllllIllllIlIlIIIIlIIllII, SoundStore.lIllllIIlllIII[3]);
        }
        int llllllllllllIllllIlIlIIIIlIIllll = SoundStore.lIllllIIlllIII[0];
        if (lIIIIlIIIlIlIIlI(this.loaded.get(llllllllllllIllllIlIlIIIIlIIllIl))) {
            llllllllllllIllllIlIlIIIIlIIllll = this.loaded.get(llllllllllllIllllIlIlIIIIlIIllIl);
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        else {
            try {
                final IntBuffer llllllllllllIllllIlIlIIIIlIlIllI = BufferUtils.createIntBuffer(SoundStore.lIllllIIlllIII[3]);
                final OggDecoder llllllllllllIllllIlIlIIIIlIlIlIl = new OggDecoder();
                final OggData llllllllllllIllllIlIlIIIIlIlIlII = llllllllllllIllllIlIlIIIIlIlIlIl.getData(llllllllllllIllllIlIlIIIIlIIllII);
                AL10.alGenBuffers(llllllllllllIllllIlIlIIIIlIlIllI);
                final int value = llllllllllllIllllIlIlIIIIlIlIllI.get(SoundStore.lIllllIIlllIII[1]);
                int n;
                if (lIIIIlIIIlIIllII(llllllllllllIllllIlIlIIIIlIlIlII.channels, SoundStore.lIllllIIlllIII[3])) {
                    n = SoundStore.lIllllIIlllIII[25];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    n = SoundStore.lIllllIIlllIII[26];
                }
                AL10.alBufferData(value, n, llllllllllllIllllIlIlIIIIlIlIlII.data, llllllllllllIllllIlIlIIIIlIlIlII.rate);
                this.loaded.put(llllllllllllIllllIlIlIIIIlIIllIl, new Integer(llllllllllllIllllIlIlIIIIlIlIllI.get(SoundStore.lIllllIIlllIII[1])));
                "".length();
                llllllllllllIllllIlIlIIIIlIIllll = llllllllllllIllllIlIlIIIIlIlIllI.get(SoundStore.lIllllIIlllIII[1]);
                "".length();
                if ((64 + 110 - 125 + 132 ^ 158 + 51 - 125 + 93) <= ((0x81 ^ 0x98 ^ (0x61 ^ 0x75)) & (0x2D ^ 0x76 ^ (0x78 ^ 0x2E) ^ -" ".length()))) {
                    return null;
                }
            }
            catch (Exception llllllllllllIllllIlIlIIIIlIlIIll) {
                Log.error(llllllllllllIllllIlIlIIIIlIlIIll);
                Sys.alert(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[27]], String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[28]]).append(llllllllllllIllllIlIlIIIIlIIllIl).append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[29]]).append(llllllllllllIllllIlIlIIIIlIlIIll.getMessage())));
                throw new IOException(String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[30]]).append(llllllllllllIllllIlIlIIIIlIIllIl)));
            }
        }
        if (lIIIIlIIIlIIlllI(llllllllllllIllllIlIlIIIIlIIllll, SoundStore.lIllllIIlllIII[0])) {
            throw new IOException(String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[31]]).append(llllllllllllIllllIlIlIIIIlIIllIl)));
        }
        return new AudioImpl(this, llllllllllllIllllIlIlIIIIlIIllll);
    }
    
    public void pauseLoop() {
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0) && lIIIIlIIIlIlIIII(this.currentMusic, SoundStore.lIllllIIlllIII[0])) {
            this.paused = (SoundStore.lIllllIIlllIII[3] != 0);
            AL10.alSourcePause(this.currentMusic);
        }
    }
    
    public void setMusicPitch(final float llllllllllllIllllIlIlIIIllIlIlll) {
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0)) {
            AL10.alSourcef(this.sources.get(SoundStore.lIllllIIlllIII[1]), SoundStore.lIllllIIlllIII[14], llllllllllllIllllIlIlIIIllIlIlll);
        }
    }
    
    private static boolean lIIIIlIIIlIIlIll(final int llllllllllllIllllIlIIlllllIIllIl) {
        return llllllllllllIllllIlIIlllllIIllIl == 0;
    }
    
    void setMOD(final MODSound llllllllllllIllllIlIlIIIIlIIIIlI) {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return;
        }
        this.currentMusic = this.sources.get(SoundStore.lIllllIIlllIII[1]);
        this.stopSource(SoundStore.lIllllIIlllIII[1]);
        this.mod = llllllllllllIllllIlIlIIIIlIIIIlI;
        if (lIIIIlIIIlIlIIlI(llllllllllllIllllIlIlIIIIlIIIIlI)) {
            this.stream = null;
        }
        this.paused = (SoundStore.lIllllIIlllIII[1] != 0);
    }
    
    int playAsSoundAt(final int llllllllllllIllllIlIlIIlIIIIIllI, final float llllllllllllIllllIlIlIIlIIIIllIl, float llllllllllllIllllIlIlIIlIIIIIlII, final boolean llllllllllllIllllIlIlIIlIIIIIIll, final float llllllllllllIllllIlIlIIlIIIIIIlI, final float llllllllllllIllllIlIlIIlIIIIlIIl, final float llllllllllllIllllIlIlIIlIIIIIIII) {
        llllllllllllIllllIlIlIIlIIIIIlII *= this.soundVolume;
        if (lIIIIlIIIlIIlIll(lIIIIlIIIlIIllIl(llllllllllllIllllIlIlIIlIIIIIlII, 0.0f))) {
            llllllllllllIllllIlIlIIlIIIIIlII = 0.001f;
        }
        if (!lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0) || !lIIIIlIIIlIIIIll(this.sounds ? 1 : 0)) {
            return SoundStore.lIllllIIlllIII[0];
        }
        final int llllllllllllIllllIlIlIIlIIIlIIII = this.findFreeSource();
        if (lIIIIlIIIlIIlllI(llllllllllllIllllIlIlIIlIIIlIIII, SoundStore.lIllllIIlllIII[0])) {
            return SoundStore.lIllllIIlllIII[0];
        }
        AL10.alSourceStop(this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII));
        AL10.alSourcei(this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII), SoundStore.lIllllIIlllIII[13], llllllllllllIllllIlIlIIlIIIIIllI);
        AL10.alSourcef(this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII), SoundStore.lIllllIIlllIII[14], llllllllllllIllllIlIlIIlIIIIllIl);
        AL10.alSourcef(this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII), SoundStore.lIllllIIlllIII[6], llllllllllllIllllIlIlIIlIIIIIlII);
        final int value = this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII);
        final int n = SoundStore.lIllllIIlllIII[15];
        int n2;
        if (lIIIIlIIIlIIIIll(llllllllllllIllllIlIlIIlIIIIIIll ? 1 : 0)) {
            n2 = SoundStore.lIllllIIlllIII[3];
            "".length();
            if (-(0xC1 ^ 0xC4) >= 0) {
                return (0x1D ^ 0x9) & ~(0xB3 ^ 0xA7);
            }
        }
        else {
            n2 = SoundStore.lIllllIIlllIII[1];
        }
        AL10.alSourcei(value, n, n2);
        this.sourcePos.clear();
        "".length();
        this.sourceVel.clear();
        "".length();
        final FloatBuffer sourceVel = this.sourceVel;
        final float[] src = new float[SoundStore.lIllllIIlllIII[2]];
        src[SoundStore.lIllllIIlllIII[1]] = 0.0f;
        src[SoundStore.lIllllIIlllIII[3]] = 0.0f;
        src[SoundStore.lIllllIIlllIII[4]] = 0.0f;
        sourceVel.put(src);
        "".length();
        final FloatBuffer sourcePos = this.sourcePos;
        final float[] src2 = new float[SoundStore.lIllllIIlllIII[2]];
        src2[SoundStore.lIllllIIlllIII[1]] = llllllllllllIllllIlIlIIlIIIIIIlI;
        src2[SoundStore.lIllllIIlllIII[3]] = llllllllllllIllllIlIlIIlIIIIlIIl;
        src2[SoundStore.lIllllIIlllIII[4]] = llllllllllllIllllIlIlIIlIIIIIIII;
        sourcePos.put(src2);
        "".length();
        this.sourcePos.flip();
        "".length();
        this.sourceVel.flip();
        "".length();
        AL10.alSource(this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII), SoundStore.lIllllIIlllIII[10], this.sourcePos);
        AL10.alSource(this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII), SoundStore.lIllllIIlllIII[11], this.sourceVel);
        AL10.alSourcePlay(this.sources.get(llllllllllllIllllIlIlIIlIIIlIIII));
        return llllllllllllIllllIlIlIIlIIIlIIII;
    }
    
    public boolean musicOn() {
        return this.music;
    }
    
    public void setMaxSources(final int llllllllllllIllllIlIlIIlIIllllll) {
        this.maxSources = llllllllllllIllllIlIlIIlIIllllll;
    }
    
    private static boolean lIIIIlIIIlIIllll(final int llllllllllllIllllIlIIlllllIlllII, final int llllllllllllIllllIlIIlllllIllIll) {
        return llllllllllllIllllIlIIlllllIlllII < llllllllllllIllllIlIIlllllIllIll;
    }
    
    public Audio getWAV(final String llllllllllllIllllIlIlIIIIllllIlI, final InputStream llllllllllllIllllIlIlIIIIlllllIl) throws IOException {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return new NullAudio();
        }
        if (lIIIIlIIIlIIlIll(this.inited ? 1 : 0)) {
            throw new RuntimeException(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[21]]);
        }
        if (lIIIIlIIIlIIIIll(this.deferred ? 1 : 0)) {
            return new DeferredSound(llllllllllllIllllIlIlIIIIllllIlI, llllllllllllIllllIlIlIIIIlllllIl, SoundStore.lIllllIIlllIII[4]);
        }
        int llllllllllllIllllIlIlIIIIlllllII = SoundStore.lIllllIIlllIII[0];
        if (lIIIIlIIIlIlIIlI(this.loaded.get(llllllllllllIllllIlIlIIIIllllIlI))) {
            llllllllllllIllllIlIlIIIIlllllII = this.loaded.get(llllllllllllIllllIlIlIIIIllllIlI);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            try {
                final IntBuffer llllllllllllIllllIlIlIIIlIIIIIll = BufferUtils.createIntBuffer(SoundStore.lIllllIIlllIII[3]);
                final WaveData llllllllllllIllllIlIlIIIlIIIIIlI = WaveData.create(llllllllllllIllllIlIlIIIIlllllIl);
                AL10.alGenBuffers(llllllllllllIllllIlIlIIIlIIIIIll);
                AL10.alBufferData(llllllllllllIllllIlIlIIIlIIIIIll.get(SoundStore.lIllllIIlllIII[1]), llllllllllllIllllIlIlIIIlIIIIIlI.format, llllllllllllIllllIlIlIIIlIIIIIlI.data, llllllllllllIllllIlIlIIIlIIIIIlI.samplerate);
                this.loaded.put(llllllllllllIllllIlIlIIIIllllIlI, new Integer(llllllllllllIllllIlIlIIIlIIIIIll.get(SoundStore.lIllllIIlllIII[1])));
                "".length();
                llllllllllllIllllIlIlIIIIlllllII = llllllllllllIllllIlIlIIIlIIIIIll.get(SoundStore.lIllllIIlllIII[1]);
                "".length();
                if ((0x41 ^ 0x2A ^ (0xC ^ 0x63)) <= -" ".length()) {
                    return null;
                }
            }
            catch (Exception llllllllllllIllllIlIlIIIlIIIIIII) {
                Log.error(llllllllllllIllllIlIlIIIlIIIIIII);
                final IOException llllllllllllIllllIlIlIIIlIIIIIIl = new IOException(String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[22]]).append(llllllllllllIllllIlIlIIIIllllIlI)));
                llllllllllllIllllIlIlIIIlIIIIIIl.initCause(llllllllllllIllllIlIlIIIlIIIIIII);
                "".length();
                throw llllllllllllIllllIlIlIIIlIIIIIIl;
            }
        }
        if (lIIIIlIIIlIIlllI(llllllllllllIllllIlIlIIIIlllllII, SoundStore.lIllllIIlllIII[0])) {
            throw new IOException(String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[23]]).append(llllllllllllIllllIlIlIIIIllllIlI)));
        }
        return new AudioImpl(this, llllllllllllIllllIlIlIIIIlllllII);
    }
    
    private int getMusicSource() {
        return this.sources.get(SoundStore.lIllllIIlllIII[1]);
    }
    
    void setStream(final OpenALStreamPlayer llllllllllllIllllIlIlIIIIIllllII) {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return;
        }
        this.currentMusic = this.sources.get(SoundStore.lIllllIIlllIII[1]);
        this.stream = llllllllllllIllllIlIlIIIIIllllII;
        if (lIIIIlIIIlIlIIlI(llllllllllllIllllIlIlIIIIIllllII)) {
            this.mod = null;
        }
        this.paused = (SoundStore.lIllllIIlllIII[1] != 0);
    }
    
    private static boolean lIIIIlIIIlIIlllI(final int llllllllllllIllllIlIIllllllIIIII, final int llllllllllllIllllIlIIlllllIlllll) {
        return llllllllllllIllllIlIIllllllIIIII == llllllllllllIllllIlIIlllllIlllll;
    }
    
    public void setCurrentMusicVolume(float llllllllllllIllllIlIlIIlIllIIlII) {
        if (lIIIIlIIIlIIIllI(lIIIIlIIIlIIlIII(llllllllllllIllllIlIlIIlIllIIlII, 0.0f))) {
            llllllllllllIllllIlIlIIlIllIIlII = 0.0f;
        }
        if (lIIIIlIIIlIIIlll(lIIIIlIIIlIIlIIl(llllllllllllIllllIlIlIIlIllIIlII, 1.0f))) {
            llllllllllllIllllIlIlIIlIllIIlII = 1.0f;
        }
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0)) {
            this.lastCurrentMusicVolume = llllllllllllIllllIlIlIIlIllIIlII;
            AL10.alSourcef(this.sources.get(SoundStore.lIllllIIlllIII[1]), SoundStore.lIllllIIlllIII[6], this.lastCurrentMusicVolume * this.musicVolume);
        }
    }
    
    public float getMusicVolume() {
        return this.musicVolume;
    }
    
    public Audio getWAV(final String llllllllllllIllllIlIlIIIlIIlIIlI) throws IOException {
        return this.getWAV(llllllllllllIllllIlIlIIIlIIlIIlI, ResourceLoader.getResourceAsStream(llllllllllllIllllIlIlIIIlIIlIIlI));
    }
    
    private static int lIIIIlIIIlIIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Audio getAIF(final String llllllllllllIllllIlIlIIIlIIllIlI, InputStream llllllllllllIllllIlIlIIIlIIllIIl) throws IOException {
        llllllllllllIllllIlIlIIIlIIllIIl = (char)new BufferedInputStream((InputStream)llllllllllllIllllIlIlIIIlIIllIIl);
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return new NullAudio();
        }
        if (lIIIIlIIIlIIlIll(this.inited ? 1 : 0)) {
            throw new RuntimeException(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[7]]);
        }
        if (lIIIIlIIIlIIIIll(this.deferred ? 1 : 0)) {
            return new DeferredSound(llllllllllllIllllIlIlIIIlIIllIlI, (InputStream)llllllllllllIllllIlIlIIIlIIllIIl, SoundStore.lIllllIIlllIII[8]);
        }
        int llllllllllllIllllIlIlIIIlIIlllII = SoundStore.lIllllIIlllIII[0];
        if (lIIIIlIIIlIlIIlI(this.loaded.get(llllllllllllIllllIlIlIIIlIIllIlI))) {
            llllllllllllIllllIlIlIIIlIIlllII = this.loaded.get(llllllllllllIllllIlIlIIIlIIllIlI);
            "".length();
            if (((0xAA ^ 0xB4) & ~(0xA5 ^ 0xBB)) <= -" ".length()) {
                return null;
            }
        }
        else {
            try {
                final IntBuffer llllllllllllIllllIlIlIIIlIlIIIll = BufferUtils.createIntBuffer(SoundStore.lIllllIIlllIII[3]);
                final AiffData llllllllllllIllllIlIlIIIlIlIIIlI = AiffData.create((InputStream)llllllllllllIllllIlIlIIIlIIllIIl);
                AL10.alGenBuffers(llllllllllllIllllIlIlIIIlIlIIIll);
                AL10.alBufferData(llllllllllllIllllIlIlIIIlIlIIIll.get(SoundStore.lIllllIIlllIII[1]), llllllllllllIllllIlIlIIIlIlIIIlI.format, llllllllllllIllllIlIlIIIlIlIIIlI.data, llllllllllllIllllIlIlIIIlIlIIIlI.samplerate);
                this.loaded.put(llllllllllllIllllIlIlIIIlIIllIlI, new Integer(llllllllllllIllllIlIlIIIlIlIIIll.get(SoundStore.lIllllIIlllIII[1])));
                "".length();
                llllllllllllIllllIlIlIIIlIIlllII = llllllllllllIllllIlIlIIIlIlIIIll.get(SoundStore.lIllllIIlllIII[1]);
                "".length();
                if (((0x58 ^ 0x17 ^ (0xCE ^ 0xAB)) & (0x55 ^ 0x28 ^ (0xF9 ^ 0xAE) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            catch (Exception llllllllllllIllllIlIlIIIlIlIIIII) {
                Log.error(llllllllllllIllllIlIlIIIlIlIIIII);
                final IOException llllllllllllIllllIlIlIIIlIlIIIIl = new IOException(String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[19]]).append(llllllllllllIllllIlIlIIIlIIllIlI)));
                llllllllllllIllllIlIlIIIlIlIIIIl.initCause(llllllllllllIllllIlIlIIIlIlIIIII);
                "".length();
                throw llllllllllllIllllIlIlIIIlIlIIIIl;
            }
        }
        if (lIIIIlIIIlIIlllI(llllllllllllIllllIlIlIIIlIIlllII, SoundStore.lIllllIIlllIII[0])) {
            throw new IOException(String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[20]]).append(llllllllllllIllllIlIlIIIlIIllIlI)));
        }
        return new AudioImpl(this, llllllllllllIllllIlIlIIIlIIlllII);
    }
    
    private static boolean lIIIIlIIIlIlIIlI(final Object llllllllllllIllllIlIIlllllIlIIIl) {
        return llllllllllllIllllIlIIlllllIlIIIl != null;
    }
    
    public boolean isMusicOn() {
        return this.music;
    }
    
    private static boolean lIIIIlIIIlIIllII(final int llllllllllllIllllIlIIlllllIllIII, final int llllllllllllIllllIlIIlllllIlIlll) {
        return llllllllllllIllllIlIIlllllIllIII > llllllllllllIllllIlIIlllllIlIlll;
    }
    
    public void setSoundVolume(float llllllllllllIllllIlIlIIlIlIllllI) {
        if (lIIIIlIIIlIIIllI(lIIIIlIIIlIIlIlI(llllllllllllIllllIlIlIIlIlIllllI, 0.0f))) {
            llllllllllllIllllIlIlIIlIlIllllI = 0.0f;
        }
        this.soundVolume = llllllllllllIllllIlIlIIlIlIllllI;
    }
    
    public Audio getAIF(final InputStream llllllllllllIllllIlIlIIIlIlIllII) throws IOException {
        return this.getAIF(llllllllllllIllllIlIlIIIlIlIllII.toString(), llllllllllllIllllIlIlIIIlIlIllII);
    }
    
    public void setMusicOn(final boolean llllllllllllIllllIlIlIIlIllllIII) {
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0)) {
            this.music = llllllllllllIllllIlIlIIlIllllIII;
            if (lIIIIlIIIlIIIIll(llllllllllllIllllIlIlIIlIllllIII ? 1 : 0)) {
                this.restartLoop();
                this.setMusicVolume(this.musicVolume);
                "".length();
                if ((0x45 ^ 0x41) == "  ".length()) {
                    return;
                }
            }
            else {
                this.pauseLoop();
            }
        }
    }
    
    public float getSoundVolume() {
        return this.soundVolume;
    }
    
    public void poll(final int llllllllllllIllllIlIlIIIIIllIllI) {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return;
        }
        if (lIIIIlIIIlIIIIll(this.paused ? 1 : 0)) {
            return;
        }
        if (lIIIIlIIIlIIIIll(this.music ? 1 : 0)) {
            if (lIIIIlIIIlIlIIlI(this.mod)) {
                try {
                    this.mod.poll();
                    "".length();
                    if (((47 + 103 - 14 + 38 ^ 111 + 45 - 28 + 3) & (39 + 52 + 53 + 25 ^ 92 + 91 - 120 + 69 ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                catch (OpenALException llllllllllllIllllIlIlIIIIIlllIIl) {
                    Log.error(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[32]]);
                    Log.error((Throwable)llllllllllllIllllIlIlIIIIIlllIIl);
                    this.mod = null;
                }
            }
            if (lIIIIlIIIlIlIIlI(this.stream)) {
                try {
                    this.stream.update();
                    "".length();
                    if (-("   ".length() ^ (0x6D ^ 0x6A)) >= 0) {
                        return;
                    }
                }
                catch (OpenALException llllllllllllIllllIlIlIIIIIlllIII) {
                    Log.error(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[33]]);
                    Log.error((Throwable)llllllllllllIllllIlIlIIIIIlllIII);
                    this.mod = null;
                }
            }
        }
    }
    
    private static boolean lIIIIlIIIlIIIllI(final int llllllllllllIllllIlIIlllllIIlIll) {
        return llllllllllllIllllIlIIlllllIIlIll < 0;
    }
    
    public Audio getWAV(final InputStream llllllllllllIllllIlIlIIIlIIIlIlI) throws IOException {
        return this.getWAV(llllllllllllIllllIlIlIIIlIIIlIlI.toString(), llllllllllllIllllIlIlIIIlIIIlIlI);
    }
    
    private static int lIIIIlIIIlIIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public Audio getOgg(final InputStream llllllllllllIllllIlIlIIIIllIIIII) throws IOException {
        return this.getOgg(llllllllllllIllllIlIlIIIIllIIIII.toString(), llllllllllllIllllIlIlIIIIllIIIII);
    }
    
    public Audio getOgg(final String llllllllllllIllllIlIlIIIIllIIllI) throws IOException {
        return this.getOgg(llllllllllllIllllIlIlIIIIllIIllI, ResourceLoader.getResourceAsStream(llllllllllllIllllIlIlIIIIllIIllI));
    }
    
    void playAsMusic(final int llllllllllllIllllIlIlIIIlllIIlll, final float llllllllllllIllllIlIlIIIlllIIIIl, final float llllllllllllIllllIlIlIIIlllIIlIl, final boolean llllllllllllIllllIlIlIIIlllIIlII) {
        this.paused = (SoundStore.lIllllIIlllIII[1] != 0);
        this.setMOD(null);
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0)) {
            if (lIIIIlIIIlIlIIII(this.currentMusic, SoundStore.lIllllIIlllIII[0])) {
                AL10.alSourceStop(this.sources.get(SoundStore.lIllllIIlllIII[1]));
            }
            this.getMusicSource();
            "".length();
            AL10.alSourcei(this.sources.get(SoundStore.lIllllIIlllIII[1]), SoundStore.lIllllIIlllIII[13], llllllllllllIllllIlIlIIIlllIIlll);
            AL10.alSourcef(this.sources.get(SoundStore.lIllllIIlllIII[1]), SoundStore.lIllllIIlllIII[14], llllllllllllIllllIlIlIIIlllIIIIl);
            final int value = this.sources.get(SoundStore.lIllllIIlllIII[1]);
            final int n = SoundStore.lIllllIIlllIII[15];
            int n2;
            if (lIIIIlIIIlIIIIll(llllllllllllIllllIlIlIIIlllIIlII ? 1 : 0)) {
                n2 = SoundStore.lIllllIIlllIII[3];
                "".length();
                if ((0x1F ^ 0x67 ^ (0x6D ^ 0x11)) <= ((40 + 93 + 54 + 31 ^ 90 + 56 - 85 + 73) & (0xCB ^ 0xBF ^ (0x9D ^ 0xB5) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                n2 = SoundStore.lIllllIIlllIII[1];
            }
            AL10.alSourcei(value, n, n2);
            this.currentMusic = this.sources.get(SoundStore.lIllllIIlllIII[1]);
            if (lIIIIlIIIlIIlIll(this.music ? 1 : 0)) {
                this.pauseLoop();
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                AL10.alSourcePlay(this.sources.get(SoundStore.lIllllIIlllIII[1]));
            }
        }
    }
    
    public Audio getOggStream(final String llllllllllllIllllIlIlIIIIlllIIlI) throws IOException {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return new NullAudio();
        }
        this.setMOD(null);
        this.setStream(null);
        if (lIIIIlIIIlIlIIII(this.currentMusic, SoundStore.lIllllIIlllIII[0])) {
            AL10.alSourceStop(this.sources.get(SoundStore.lIllllIIlllIII[1]));
        }
        this.getMusicSource();
        "".length();
        this.currentMusic = this.sources.get(SoundStore.lIllllIIlllIII[1]);
        return new StreamSound(new OpenALStreamPlayer(this.currentMusic, llllllllllllIllllIlIlIIIIlllIIlI));
    }
    
    private static int lIIIIlIIIlIIIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    boolean isPlaying(final OpenALStreamPlayer llllllllllllIllllIlIlIIIllIIllIl) {
        int n;
        if (lIIIIlIIIlIlIIIl(this.stream, llllllllllllIllllIlIlIIIllIIllIl)) {
            n = SoundStore.lIllllIIlllIII[3];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return ((0x7E ^ 0x3F ^ (0x36 ^ 0x4B)) & (15 + 182 - 123 + 111 ^ 39 + 40 - 45 + 99 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SoundStore.lIllllIIlllIII[1];
        }
        return n != 0;
    }
    
    private static String lIIIIlIIIIllIIIl(String llllllllllllIllllIlIIllllllIlIll, final String llllllllllllIllllIlIIllllllIllll) {
        llllllllllllIllllIlIIllllllIlIll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIIllllllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIIllllllIlllI = new StringBuilder();
        final char[] llllllllllllIllllIlIIllllllIllIl = llllllllllllIllllIlIIllllllIllll.toCharArray();
        int llllllllllllIllllIlIIllllllIllII = SoundStore.lIllllIIlllIII[1];
        final char llllllllllllIllllIlIIllllllIIllI = (Object)((String)llllllllllllIllllIlIIllllllIlIll).toCharArray();
        final boolean llllllllllllIllllIlIIllllllIIlIl = llllllllllllIllllIlIIllllllIIllI.length != 0;
        int llllllllllllIllllIlIIllllllIIlII = SoundStore.lIllllIIlllIII[1];
        while (lIIIIlIIIlIIllll(llllllllllllIllllIlIIllllllIIlII, llllllllllllIllllIlIIllllllIIlIl ? 1 : 0)) {
            final char llllllllllllIllllIlIIlllllllIIIl = llllllllllllIllllIlIIllllllIIllI[llllllllllllIllllIlIIllllllIIlII];
            llllllllllllIllllIlIIllllllIlllI.append((char)(llllllllllllIllllIlIIlllllllIIIl ^ llllllllllllIllllIlIIllllllIllIl[llllllllllllIllllIlIIllllllIllII % llllllllllllIllllIlIIllllllIllIl.length]));
            "".length();
            ++llllllllllllIllllIlIIllllllIllII;
            ++llllllllllllIllllIlIIllllllIIlII;
            "".length();
            if (((0xA1 ^ 0xBA) & ~(0xA2 ^ 0xB9)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIIllllllIlllI);
    }
    
    public boolean isDeferredLoading() {
        return this.deferred;
    }
    
    public boolean isMusicPlaying() {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return SoundStore.lIllllIIlllIII[1] != 0;
        }
        final int llllllllllllIllllIlIlIIIIIllIIII = AL10.alGetSourcei(this.sources.get(SoundStore.lIllllIIlllIII[1]), SoundStore.lIllllIIlllIII[16]);
        int n;
        if (!lIIIIlIIIlIlIIII(llllllllllllIllllIlIlIIIIIllIIII, SoundStore.lIllllIIlllIII[17]) || lIIIIlIIIlIIlllI(llllllllllllIllllIlIlIIIIIllIIII, SoundStore.lIllllIIlllIII[18])) {
            n = SoundStore.lIllllIIlllIII[3];
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0x25 ^ 0x4A ^ (0x13 ^ 0x54)) & (153 + 64 - 98 + 117 ^ 53 + 183 - 184 + 144 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SoundStore.lIllllIIlllIII[1];
        }
        return n != 0;
    }
    
    private static String lIIIIlIIIIllIIlI(final String llllllllllllIllllIlIlIIIIIIIlIll, final String llllllllllllIllllIlIlIIIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIIIIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIlIIIIIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIlIIIIIIIllll.init(SoundStore.lIllllIIlllIII[4], llllllllllllIllllIlIlIIIIIIlIIII);
            return new String(llllllllllllIllllIlIlIIIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlIIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIIIIIIIlllI) {
            llllllllllllIllllIlIlIIIIIIIlllI.printStackTrace();
            return null;
        }
    }
    
    public void clear() {
        SoundStore.store = new SoundStore();
    }
    
    public Audio getMOD(final String llllllllllllIllllIlIlIIIllIIIlIl) throws IOException {
        return this.getMOD(llllllllllllIllllIlIlIIIllIIIlIl, ResourceLoader.getResourceAsStream(llllllllllllIllllIlIlIIIllIIIlIl));
    }
    
    static {
        lIIIIlIIIlIIIIlI();
        lIIIIlIIIIllIlII();
        SoundStore.store = new SoundStore();
    }
    
    private static int lIIIIlIIIlIIIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private int findFreeSource() {
        int llllllllllllIllllIlIlIIIllllIIIl = SoundStore.lIllllIIlllIII[3];
        while (lIIIIlIIIlIIllll(llllllllllllIllllIlIlIIIllllIIIl, this.sourceCount - SoundStore.lIllllIIlllIII[3])) {
            final int llllllllllllIllllIlIlIIIllllIIlI = AL10.alGetSourcei(this.sources.get(llllllllllllIllllIlIlIIIllllIIIl), SoundStore.lIllllIIlllIII[16]);
            if (lIIIIlIIIlIlIIII(llllllllllllIllllIlIlIIIllllIIlI, SoundStore.lIllllIIlllIII[17]) && lIIIIlIIIlIlIIII(llllllllllllIllllIlIlIIIllllIIlI, SoundStore.lIllllIIlllIII[18])) {
                return llllllllllllIllllIlIlIIIllllIIIl;
            }
            ++llllllllllllIllllIlIlIIIllllIIIl;
            "".length();
            if ((48 + 117 - 152 + 143 ^ 50 + 37 - 26 + 91) <= 0) {
                return (63 + 133 - 163 + 110 ^ 9 + 4 + 114 + 50) & (0x76 ^ 0x7A ^ (0x7E ^ 0x4C) ^ -" ".length());
            }
        }
        return SoundStore.lIllllIIlllIII[0];
    }
    
    private static boolean lIIIIlIIIlIIIlll(final int llllllllllllIllllIlIIlllllIIlIIl) {
        return llllllllllllIllllIlIIlllllIIlIIl > 0;
    }
    
    boolean isPlaying(final int llllllllllllIllllIlIlIIIllllIlll) {
        final int llllllllllllIllllIlIlIIIlllllIIl = AL10.alGetSourcei(this.sources.get(llllllllllllIllllIlIlIIIllllIlll), SoundStore.lIllllIIlllIII[16]);
        int n;
        if (lIIIIlIIIlIIlllI(llllllllllllIllllIlIlIIIlllllIIl, SoundStore.lIllllIIlllIII[17])) {
            n = SoundStore.lIllllIIlllIII[3];
            "".length();
            if ("  ".length() == 0) {
                return ((175 + 76 - 248 + 236 ^ 151 + 44 - 28 + 11) & (58 + 41 + 51 + 47 ^ 34 + 23 + 94 + 1 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SoundStore.lIllllIIlllIII[1];
        }
        return n != 0;
    }
    
    public Audio getMOD(final String llllllllllllIllllIlIlIIIlIlllIlI, final InputStream llllllllllllIllllIlIlIIIlIlllIIl) throws IOException {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return new NullAudio();
        }
        if (lIIIIlIIIlIIlIll(this.inited ? 1 : 0)) {
            throw new RuntimeException(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[9]]);
        }
        if (lIIIIlIIIlIIIIll(this.deferred ? 1 : 0)) {
            return new DeferredSound(llllllllllllIllllIlIlIIIlIlllIlI, llllllllllllIllllIlIlIIIlIlllIIl, SoundStore.lIllllIIlllIII[2]);
        }
        return new MODSound(this, llllllllllllIllllIlIlIIIlIlllIIl);
    }
    
    public void setSoundsOn(final boolean llllllllllllIllllIlIlIIlIlIIIllI) {
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0)) {
            this.sounds = llllllllllllIllllIlIlIIlIlIIIllI;
        }
    }
    
    private static String lIIIIlIIIIllIIll(final String llllllllllllIllllIlIIllllllllllI, final String llllllllllllIllllIlIIlllllllllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIIIIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlllllllllIl.getBytes(StandardCharsets.UTF_8)), SoundStore.lIllllIIlllIII[20]), "DES");
            final Cipher llllllllllllIllllIlIlIIIIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllIllllIlIlIIIIIIIIIlI.init(SoundStore.lIllllIIlllIII[4], llllllllllllIllllIlIlIIIIIIIIIll);
            return new String(llllllllllllIllllIlIlIIIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIllllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIIIIIIIIIIl) {
            llllllllllllIllllIlIlIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    public Audio getMOD(final InputStream llllllllllllIllllIlIlIIIlIllllll) throws IOException {
        return this.getMOD(llllllllllllIllllIlIlIIIlIllllll.toString(), llllllllllllIllllIlIlIIIlIllllll);
    }
    
    public static SoundStore get() {
        return SoundStore.store;
    }
    
    public float getCurrentMusicVolume() {
        return this.lastCurrentMusicVolume;
    }
    
    public int getSource(final int llllllllllllIllllIlIlIIlIlIIllII) {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return SoundStore.lIllllIIlllIII[0];
        }
        if (lIIIIlIIIlIIIllI(llllllllllllIllllIlIlIIlIlIIllII)) {
            return SoundStore.lIllllIIlllIII[0];
        }
        return this.sources.get(llllllllllllIllllIlIlIIlIlIIllII);
    }
    
    public void restartLoop() {
        if (lIIIIlIIIlIIIIll(this.music ? 1 : 0) && lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0) && lIIIIlIIIlIlIIII(this.currentMusic, SoundStore.lIllllIIlllIII[0])) {
            this.paused = (SoundStore.lIllllIIlllIII[1] != 0);
            AL10.alSourcePlay(this.currentMusic);
        }
    }
    
    private SoundStore() {
        this.loaded = new HashMap();
        this.currentMusic = SoundStore.lIllllIIlllIII[0];
        this.inited = (SoundStore.lIllllIIlllIII[1] != 0);
        this.musicVolume = 1.0f;
        this.soundVolume = 1.0f;
        this.lastCurrentMusicVolume = 1.0f;
        final FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(SoundStore.lIllllIIlllIII[2]);
        final float[] src = new float[SoundStore.lIllllIIlllIII[2]];
        src[SoundStore.lIllllIIlllIII[1]] = 0.0f;
        src[SoundStore.lIllllIIlllIII[3]] = 0.0f;
        src[SoundStore.lIllllIIlllIII[4]] = 0.0f;
        this.sourceVel = floatBuffer.put(src);
        this.sourcePos = BufferUtils.createFloatBuffer(SoundStore.lIllllIIlllIII[2]);
        this.maxSources = SoundStore.lIllllIIlllIII[5];
    }
    
    public void stopSoundEffect(final int llllllllllllIllllIlIlIIIIIlIlIlI) {
        AL10.alSourceStop(llllllllllllIllllIlIlIIIIIlIlIlI);
    }
    
    public void init() {
        if (lIIIIlIIIlIIIIll(this.inited ? 1 : 0)) {
            return;
        }
        Log.info(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[1]]);
        this.inited = (SoundStore.lIllllIIlllIII[3] != 0);
        AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
            private static final /* synthetic */ String[] lIllIlllIlIlll;
            private static final /* synthetic */ int[] lIllIllllIIIII;
            
            public Object run() {
                try {
                    AL.create();
                    SoundStore.this.soundWorks = (boolean)(SoundStore$1.lIllIllllIIIII[0] != 0);
                    "".length();
                    SoundStore.this.sounds = (boolean)(SoundStore$1.lIllIllllIIIII[0] != 0);
                    "".length();
                    SoundStore.this.music = (boolean)(SoundStore$1.lIllIllllIIIII[0] != 0);
                    "".length();
                    Log.info(SoundStore$1.lIllIlllIlIlll[SoundStore$1.lIllIllllIIIII[1]]);
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return null;
                    }
                }
                catch (Exception llllllllllllIllllllIIlIllIIIlIII) {
                    Log.error(SoundStore$1.lIllIlllIlIlll[SoundStore$1.lIllIllllIIIII[0]]);
                    Log.error(llllllllllllIllllllIIlIllIIIlIII);
                    SoundStore.this.soundWorks = (boolean)(SoundStore$1.lIllIllllIIIII[1] != 0);
                    "".length();
                    SoundStore.this.sounds = (boolean)(SoundStore$1.lIllIllllIIIII[1] != 0);
                    "".length();
                    SoundStore.this.music = (boolean)(SoundStore$1.lIllIllllIIIII[1] != 0);
                    "".length();
                }
                return null;
            }
            
            private static String lIIIIIIIIlIIIlIl(final String llllllllllllIllllllIIlIlIlllllIl, final String llllllllllllIllllllIIlIlIllllIlI) {
                try {
                    final SecretKeySpec llllllllllllIllllllIIlIllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIlIlIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllllllIIlIlIlllllll = Cipher.getInstance("Blowfish");
                    llllllllllllIllllllIIlIlIlllllll.init(SoundStore$1.lIllIllllIIIII[2], llllllllllllIllllllIIlIllIIIIIII);
                    return new String(llllllllllllIllllllIIlIlIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIlIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllllIIlIlIllllllI) {
                    llllllllllllIllllllIIlIlIllllllI.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIIIIIIIIlIlIIll();
                lIIIIIIIIlIIllII();
            }
            
            private static void lIIIIIIIIlIIllII() {
                (lIllIlllIlIlll = new String[SoundStore$1.lIllIllllIIIII[2]])[SoundStore$1.lIllIllllIIIII[1]] = lIIIIIIIIlIIIlIl("t/WrEZ6ueRgsiWj7Bpo73g==", "asUEX");
                SoundStore$1.lIllIlllIlIlll[SoundStore$1.lIllIllllIIIII[0]] = lIIIIIIIIlIIlIll("ZlRz6OHX6NihKN7+15RaDNixfo1qp924QHt0KkOenqI=", "uNXZx");
            }
            
            private static void lIIIIIIIIlIlIIll() {
                (lIllIllllIIIII = new int[4])[0] = " ".length();
                SoundStore$1.lIllIllllIIIII[1] = ((0x9B ^ 0x87 ^ (0x3 ^ 0x38)) & (0x92 ^ 0xB0 ^ (0x2D ^ 0x28) ^ -" ".length()));
                SoundStore$1.lIllIllllIIIII[2] = "  ".length();
                SoundStore$1.lIllIllllIIIII[3] = (0x84 ^ 0xA3 ^ (0xEB ^ 0xC4));
            }
            
            private static String lIIIIIIIIlIIlIll(final String llllllllllllIllllllIIlIlIlllIIII, final String llllllllllllIllllllIIlIlIllIllll) {
                try {
                    final SecretKeySpec llllllllllllIllllllIIlIlIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIlIlIllIllll.getBytes(StandardCharsets.UTF_8)), SoundStore$1.lIllIllllIIIII[3]), "DES");
                    final Cipher llllllllllllIllllllIIlIlIlllIIlI = Cipher.getInstance("DES");
                    llllllllllllIllllllIIlIlIlllIIlI.init(SoundStore$1.lIllIllllIIIII[2], llllllllllllIllllllIIlIlIlllIIll);
                    return new String(llllllllllllIllllllIIlIlIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIlIlIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllllIIlIlIlllIIIl) {
                    llllllllllllIllllllIIlIlIlllIIIl.printStackTrace();
                    return null;
                }
            }
        });
        "".length();
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0)) {
            this.sourceCount = SoundStore.lIllllIIlllIII[1];
            this.sources = BufferUtils.createIntBuffer(this.maxSources);
            while (lIIIIlIIIlIIlIll(AL10.alGetError())) {
                final IntBuffer llllllllllllIllllIlIlIIlIIllIlll = BufferUtils.createIntBuffer(SoundStore.lIllllIIlllIII[3]);
                try {
                    AL10.alGenSources(llllllllllllIllllIlIlIIlIIllIlll);
                    if (lIIIIlIIIlIIlIll(AL10.alGetError())) {
                        this.sourceCount += SoundStore.lIllllIIlllIII[3];
                        this.sources.put(llllllllllllIllllIlIlIIlIIllIlll.get(SoundStore.lIllllIIlllIII[1]));
                        "".length();
                        if (lIIIIlIIIlIIllII(this.sourceCount, this.maxSources - SoundStore.lIllllIIlllIII[3])) {
                            "".length();
                            if ("  ".length() >= "   ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return;
                    }
                }
                catch (OpenALException llllllllllllIllllIlIlIIlIIlllIII) {
                    "".length();
                    if (-" ".length() >= "   ".length()) {
                        return;
                    }
                    break;
                }
                "".length();
                if (((0xDB ^ 0x9D) & ~(0xCF ^ 0x89)) >= "   ".length()) {
                    return;
                }
            }
            Log.info(String.valueOf(new StringBuilder().append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[3]]).append(this.sourceCount).append(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[4]])));
            if (lIIIIlIIIlIIIIll(AL10.alGetError())) {
                this.sounds = (SoundStore.lIllllIIlllIII[1] != 0);
                this.music = (SoundStore.lIllllIIlllIII[1] != 0);
                this.soundWorks = (SoundStore.lIllllIIlllIII[1] != 0);
                Log.error(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[2]]);
                "".length();
                if (((0xC8 ^ 0x9E ^ "   ".length()) & (0xE1 ^ 0x94 ^ (0x2E ^ 0xE) ^ -" ".length())) == (30 + 38 + 59 + 47 ^ 77 + 48 - 38 + 83)) {
                    return;
                }
            }
            else {
                final FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(SoundStore.lIllllIIlllIII[7]);
                final float[] src = new float[SoundStore.lIllllIIlllIII[7]];
                src[SoundStore.lIllllIIlllIII[1]] = 0.0f;
                src[SoundStore.lIllllIIlllIII[3]] = 0.0f;
                src[SoundStore.lIllllIIlllIII[4]] = -1.0f;
                src[SoundStore.lIllllIIlllIII[2]] = 0.0f;
                src[SoundStore.lIllllIIlllIII[8]] = 1.0f;
                src[SoundStore.lIllllIIlllIII[9]] = 0.0f;
                final FloatBuffer llllllllllllIllllIlIlIIlIIllIllI = floatBuffer.put(src);
                final FloatBuffer floatBuffer2 = BufferUtils.createFloatBuffer(SoundStore.lIllllIIlllIII[2]);
                final float[] src2 = new float[SoundStore.lIllllIIlllIII[2]];
                src2[SoundStore.lIllllIIlllIII[1]] = 0.0f;
                src2[SoundStore.lIllllIIlllIII[3]] = 0.0f;
                src2[SoundStore.lIllllIIlllIII[4]] = 0.0f;
                final FloatBuffer llllllllllllIllllIlIlIIlIIllIlIl = floatBuffer2.put(src2);
                final FloatBuffer floatBuffer3 = BufferUtils.createFloatBuffer(SoundStore.lIllllIIlllIII[2]);
                final float[] src3 = new float[SoundStore.lIllllIIlllIII[2]];
                src3[SoundStore.lIllllIIlllIII[1]] = 0.0f;
                src3[SoundStore.lIllllIIlllIII[3]] = 0.0f;
                src3[SoundStore.lIllllIIlllIII[4]] = 0.0f;
                final FloatBuffer llllllllllllIllllIlIlIIlIIllIlII = floatBuffer3.put(src3);
                llllllllllllIllllIlIlIIlIIllIlII.flip();
                "".length();
                llllllllllllIllllIlIlIIlIIllIlIl.flip();
                "".length();
                llllllllllllIllllIlIlIIlIIllIllI.flip();
                "".length();
                AL10.alListener(SoundStore.lIllllIIlllIII[10], llllllllllllIllllIlIlIIlIIllIlII);
                AL10.alListener(SoundStore.lIllllIIlllIII[11], llllllllllllIllllIlIlIIlIIllIlIl);
                AL10.alListener(SoundStore.lIllllIIlllIII[12], llllllllllllIllllIlIlIIlIIllIllI);
                Log.info(SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[8]]);
            }
        }
    }
    
    private static int lIIIIlIIIlIIlIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void setMusicVolume(float llllllllllllIllllIlIlIIlIllIllIl) {
        if (lIIIIlIIIlIIIllI(lIIIIlIIIlIIIlII(llllllllllllIllllIlIlIIlIllIllIl, 0.0f))) {
            llllllllllllIllllIlIlIIlIllIllIl = 0.0f;
        }
        if (lIIIIlIIIlIIIlll(lIIIIlIIIlIIIlIl(llllllllllllIllllIlIlIIlIllIllIl, 1.0f))) {
            llllllllllllIllllIlIlIIlIllIllIl = 1.0f;
        }
        this.musicVolume = llllllllllllIllllIlIlIIlIllIllIl;
        if (lIIIIlIIIlIIIIll(this.soundWorks ? 1 : 0)) {
            AL10.alSourcef(this.sources.get(SoundStore.lIllllIIlllIII[1]), SoundStore.lIllllIIlllIII[6], this.lastCurrentMusicVolume * this.musicVolume);
        }
    }
    
    private static void lIIIIlIIIlIIIIlI() {
        (lIllllIIlllIII = new int[35])[0] = -" ".length();
        SoundStore.lIllllIIlllIII[1] = ((0x2D ^ 0x77) & ~(0x98 ^ 0xC2));
        SoundStore.lIllllIIlllIII[2] = "   ".length();
        SoundStore.lIllllIIlllIII[3] = " ".length();
        SoundStore.lIllllIIlllIII[4] = "  ".length();
        SoundStore.lIllllIIlllIII[5] = (0xE1 ^ 0xB0 ^ (0x19 ^ 0x8));
        SoundStore.lIllllIIlllIII[6] = (-(0xFFFFFFF3 & 0x4F2D) & (0xFFFFFF6F & 0x5FBA));
        SoundStore.lIllllIIlllIII[7] = (62 + 132 - 161 + 102 ^ 45 + 127 - 98 + 55);
        SoundStore.lIllllIIlllIII[8] = (0x60 ^ 0x17 ^ (0xD4 ^ 0xA7));
        SoundStore.lIllllIIlllIII[9] = (0x1A ^ 0x37 ^ (0x63 ^ 0x4B));
        SoundStore.lIllllIIlllIII[10] = (-(0xFFFFBFBC & 0x4F57) & (0xFFFFBF3F & 0x5FD7));
        SoundStore.lIllllIIlllIII[11] = (0xFFFF98F7 & 0x770E);
        SoundStore.lIllllIIlllIII[12] = (0xFFFF978F & 0x787F);
        SoundStore.lIllllIIlllIII[13] = (-(0xFFFFEDBF & 0x72F3) & (0xFFFFF6FF & 0x79BB));
        SoundStore.lIllllIIlllIII[14] = (-(0xFFFFCA05 & 0x7FFF) & (0xFFFFDBC7 & 0x7E3F));
        SoundStore.lIllllIIlllIII[15] = (-(0xFFFFEFF5 & 0x7D7B) & (0xFFFFFD7F & 0x7FF7));
        SoundStore.lIllllIIlllIII[16] = (0xFFFFF895 & 0x177A);
        SoundStore.lIllllIIlllIII[17] = (0xFFFF91FB & 0x7E16);
        SoundStore.lIllllIIlllIII[18] = (-(0xFFFFE265 & 0x5FDF) & (0xFFFFF2DF & 0x5F77));
        SoundStore.lIllllIIlllIII[19] = (0x33 ^ 0x34);
        SoundStore.lIllllIIlllIII[20] = (1 + 152 - 108 + 108 ^ 128 + 56 - 151 + 112);
        SoundStore.lIllllIIlllIII[21] = (44 + 88 + 3 + 46 ^ 172 + 19 - 175 + 172);
        SoundStore.lIllllIIlllIII[22] = (0x19 ^ 0x13);
        SoundStore.lIllllIIlllIII[23] = (0x7A ^ 0x69 ^ (0x1 ^ 0x19));
        SoundStore.lIllllIIlllIII[24] = (0xE3 ^ 0x9E ^ (0xF1 ^ 0x80));
        SoundStore.lIllllIIlllIII[25] = (-(0xFFFFFDFB & 0x4A75) & (0xFFFFFB77 & 0x5DFB));
        SoundStore.lIllllIIlllIII[26] = (-(0xFFFFF47D & 0x4FFB) & (0xFFFFD7FF & 0x7D79));
        SoundStore.lIllllIIlllIII[27] = (30 + 77 - 2 + 69 ^ 118 + 142 - 203 + 106);
        SoundStore.lIllllIIlllIII[28] = (0x5A ^ 0x54);
        SoundStore.lIllllIIlllIII[29] = (0x5 ^ 0xA);
        SoundStore.lIllllIIlllIII[30] = (0x36 ^ 0x61 ^ (0x1F ^ 0x58));
        SoundStore.lIllllIIlllIII[31] = (160 + 0 - 130 + 144 ^ 155 + 184 - 313 + 165);
        SoundStore.lIllllIIlllIII[32] = (0xA2 ^ 0xB0);
        SoundStore.lIllllIIlllIII[33] = (0x8B ^ 0x98);
        SoundStore.lIllllIIlllIII[34] = (0xB5 ^ 0x99 ^ (0x77 ^ 0x4F));
    }
    
    public void disable() {
        this.inited = (SoundStore.lIllllIIlllIII[3] != 0);
    }
    
    public Audio getOggStream(final URL llllllllllllIllllIlIlIIIIllIllII) throws IOException {
        if (lIIIIlIIIlIIlIll(this.soundWorks ? 1 : 0)) {
            return new NullAudio();
        }
        this.setMOD(null);
        this.setStream(null);
        if (lIIIIlIIIlIlIIII(this.currentMusic, SoundStore.lIllllIIlllIII[0])) {
            AL10.alSourceStop(this.sources.get(SoundStore.lIllllIIlllIII[1]));
        }
        this.getMusicSource();
        "".length();
        this.currentMusic = this.sources.get(SoundStore.lIllllIIlllIII[1]);
        return new StreamSound(new OpenALStreamPlayer(this.currentMusic, llllllllllllIllllIlIlIIIIllIllII));
    }
    
    private static boolean lIIIIlIIIlIIIIll(final int llllllllllllIllllIlIIlllllIIllll) {
        return llllllllllllIllllIlIIlllllIIllll != 0;
    }
    
    public boolean soundsOn() {
        return this.sounds;
    }
    
    public Audio getAIF(final String llllllllllllIllllIlIlIIIlIllIIlI) throws IOException {
        return this.getAIF(llllllllllllIllllIlIlIIIlIllIIlI, ResourceLoader.getResourceAsStream(llllllllllllIllllIlIlIIIlIllIIlI));
    }
    
    int playAsSound(final int llllllllllllIllllIlIlIIlIIIlllIl, final float llllllllllllIllllIlIlIIlIIlIIIIl, final float llllllllllllIllllIlIlIIlIIIllIll, final boolean llllllllllllIllllIlIlIIlIIIllIlI) {
        return this.playAsSoundAt(llllllllllllIllllIlIlIIlIIIlllIl, llllllllllllIllllIlIlIIlIIlIIIIl, llllllllllllIllllIlIlIIlIIIllIll, llllllllllllIllllIlIlIIlIIIllIlI, 0.0f, 0.0f, 0.0f);
    }
    
    private static void lIIIIlIIIIllIlII() {
        (lIllllIIllIIIl = new String[SoundStore.lIllllIIlllIII[34]])[SoundStore.lIllllIIlllIII[1]] = lIIIIlIIIIllIIIl("CgM6DCciAToLJy0KcwshNgM3C2Bt", "CmSxN");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[3]] = lIIIIlIIIIllIIlI("TbhiytKwLNc=", "EANQT");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[4]] = lIIIIlIIIIllIIIl("Zis7PDcHKGsqNjMWKDx5JxIqMDUnBic8", "FdKYY");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[2]] = lIIIIlIIIIllIIll("JxSlK+Ih9d6mjWtkzVIG0ON8n8ggVWEe", "xJDgR");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[8]] = lIIIIlIIIIllIIll("EgoWEu+IIElYbdMR+vcOL2nWORv7YSY+YcmMS3q1VUY=", "JeEYp");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[9]] = lIIIIlIIIIllIIll("TRSkr/76ddo1BsDfDWOLRj3VsOGT3CpBwxB7FNBQfu5frkXxoMrXYmxEA64uLW6tgujAaNeVua3Zxz9KCoA4NuBvSYc18DoIuKf79C3dUwU=", "WBcBb");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[7]] = lIIIIlIIIIllIIIl("KA8DbzxLAgIpLEsdAj0mDx1NPSYfBwFoGwQbAywbHwEfLWgCHU0hJgIaRWFmSzseLWgfBghoKwQAGSkhBQsfaCEFBxlgYUsDCDwgBApD", "knmHH");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[19]] = lIIIIlIIIIllIIll("k4Aep8jKq6Mqck/2pXxAJjtQ0XGeZ9Gg", "UVfIK");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[20]] = lIIIIlIIIIllIIll("Rks9oMyqPjtcwagcrvYnjCbmGsE5yV3j", "ieBxR");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[21]] = lIIIIlIIIIllIIlI("eqZXpuTRJT9V1mKc1EXqfo6TLdbbWKYMPo5YabfHClQ4+etit4Qnyj3d36maPthi1KRsFc15mlgvKSp6ILzpkkifpjyfXQUuxoyoYf0SPMo=", "vwnQq");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[22]] = lIIIIlIIIIllIIIl("HjUFIz88dBggejQ7DStgeA==", "XTlOZ");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[23]] = lIIIIlIIIIllIIIl("ODcyDD8IeScBcwE2MgppTQ==", "mYSnS");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[24]] = lIIIIlIIIIllIIll("wJS8YY4xHI5ZBO20UAo4KT0dynpjgUpVv2/gNsG6WmJAJRyJ7buTwhZNaZ7cI9qL5g7KopSjIcXW1blFnE2HN9rIgyOs8WgQLFhnmh2olOU=", "sSBEq");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[27]] = lIIIIlIIIIllIIlI("b+1fR3xnFUM=", "RUROd");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[28]] = lIIIIlIIIIllIIll("iTBlyxsVlcdDDx7zn02qzO9hUBHoNYKl", "SBKMa");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[29]] = lIIIIlIIIIllIIlI("0VAJwjallyA=", "BvuaA");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[30]] = lIIIIlIIIIllIIIl("Bg0kDgA2QzEDTD8MJAhWcw==", "ScEll");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[31]] = lIIIIlIIIIllIIIl("IwELCyYTTx4GahoACw1wVg==", "vojiJ");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[32]] = lIIIIlIIIIllIIIl("IjgjIApHPTg7EEcFISoWIAZxAjcjagEjGR4vI28XCWolJxEUaiUnERRqISMZEyw+PRU=", "gJQOx");
        SoundStore.lIllllIIllIIIl[SoundStore.lIllllIIlllIII[33]] = lIIIIlIIIIllIIll("CY7S5ZvEhYL/gTVhdF2aS7oFKxpdL8OVaKhGZkdY8hVrAYIfYv7E3hUDn5dA/dJ2MX2g2LMHP1o3irKaj8KtMQ==", "dTbao");
    }
    
    private static boolean lIIIIlIIIlIlIIII(final int llllllllllllIllllIlIIlllllIIIllI, final int llllllllllllIllllIlIIlllllIIIlIl) {
        return llllllllllllIllllIlIIlllllIIIllI != llllllllllllIllllIlIIlllllIIIlIl;
    }
    
    public boolean soundWorks() {
        return this.soundWorks;
    }
    
    void stopSource(final int llllllllllllIllllIlIlIIlIIlIlIll) {
        AL10.alSourceStop(this.sources.get(llllllllllllIllllIlIlIIlIIlIlIll));
    }
    
    public void setDeferredLoading(final boolean llllllllllllIllllIlIlIIllIIIIIIl) {
        this.deferred = llllllllllllIllllIlIlIIllIIIIIIl;
    }
    
    private static int lIIIIlIIIlIIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIIlIIIlIlIIIl(final Object llllllllllllIllllIlIIlllllIlIlII, final Object llllllllllllIllllIlIIlllllIlIIll) {
        return llllllllllllIllllIlIIlllllIlIlII == llllllllllllIllllIlIIlllllIlIIll;
    }
    
    public int getSourceCount() {
        return this.sourceCount;
    }
}
