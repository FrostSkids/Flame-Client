// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.newdawn.slick.openal.AudioImpl;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.URL;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.openal.SoundStore;
import java.io.InputStream;
import java.util.ArrayList;
import org.newdawn.slick.openal.Audio;

public class Music
{
    private /* synthetic */ float volume;
    private /* synthetic */ boolean playing;
    private /* synthetic */ Audio sound;
    private static final /* synthetic */ String[] lIlIlllllIllIl;
    private /* synthetic */ ArrayList listeners;
    private /* synthetic */ int fadeDuration;
    private /* synthetic */ boolean stopAfterFade;
    private /* synthetic */ float requiredPosition;
    private /* synthetic */ boolean positioning;
    private static final /* synthetic */ int[] lIlIllllllIIII;
    private /* synthetic */ int fadeTime;
    private /* synthetic */ float fadeEndGain;
    private /* synthetic */ float fadeStartGain;
    private static /* synthetic */ Music currentMusic;
    
    public boolean playing() {
        int n;
        if (llllIlIlIllllII(Music.currentMusic, this) && llllIlIlIllIllI(this.playing ? 1 : 0)) {
            n = Music.lIlIllllllIIII[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0x84 ^ 0x9D) & ~(0x15 ^ 0xC)) != 0x0;
            }
        }
        else {
            n = Music.lIlIllllllIIII[0];
        }
        return n != 0;
    }
    
    private static boolean llllIlIlIllIlII(final Object lllllllllllllIIIIlIIlIllllIIlIIl) {
        return lllllllllllllIIIIlIIlIllllIIlIIl != null;
    }
    
    private void startMusic(final float lllllllllllllIIIIlIIllIIIIllllIl, float lllllllllllllIIIIlIIllIIIIlllIII, final boolean lllllllllllllIIIIlIIllIIIIllIlll) {
        if (llllIlIlIllIlII(Music.currentMusic)) {
            Music.currentMusic.stop();
            Music.currentMusic.fireMusicSwapped(this);
        }
        Music.currentMusic = this;
        if (llllIlIlIlllIlI(llllIlIlIlllIII(lllllllllllllIIIIlIIllIIIIlllIII, 0.0f))) {
            lllllllllllllIIIIlIIllIIIIlllIII = 0.0f;
        }
        if (llllIlIlIlllIll(llllIlIlIlllIIl(lllllllllllllIIIIlIIllIIIIlllIII, 1.0f))) {
            lllllllllllllIIIIlIIllIIIIlllIII = 1.0f;
        }
        this.sound.playAsMusic(lllllllllllllIIIIlIIllIIIIllllIl, lllllllllllllIIIIlIIllIIIIlllIII, lllllllllllllIIIIlIIllIIIIllIlll);
        "".length();
        this.playing = (Music.lIlIllllllIIII[1] != 0);
        this.setVolume(lllllllllllllIIIIlIIllIIIIlllIII);
        if (llllIlIlIllIllI(llllIlIlIlllIIl(this.requiredPosition, -1.0f))) {
            this.setPosition(this.requiredPosition);
            "".length();
        }
    }
    
    public Music(final InputStream lllllllllllllIIIIlIIllIIlIIlIIll, final String lllllllllllllIIIIlIIllIIlIIlIlIl) throws SlickException {
        this.listeners = new ArrayList();
        this.volume = 1.0f;
        this.requiredPosition = -1.0f;
        SoundStore.get().init();
        try {
            if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIlIlIl.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[0]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getOgg(lllllllllllllIIIIlIIllIIlIIlIIll);
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            else if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIlIlIl.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[1]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getWAV(lllllllllllllIIIIlIIllIIlIIlIIll);
                "".length();
                if ((0x5A ^ 0x62 ^ (0x3E ^ 0x2)) < 0) {
                    throw null;
                }
            }
            else if (!llllIlIlIllIlIl(lllllllllllllIIIIlIIllIIlIIlIlIl.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[2]]) ? 1 : 0) || llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIlIlIl.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[3]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getMOD(lllllllllllllIIIIlIIllIIlIIlIIll);
                "".length();
                if ((0x43 ^ 0x47) < 0) {
                    throw null;
                }
            }
            else {
                if (llllIlIlIllIlIl(lllllllllllllIIIIlIIllIIlIIlIlIl.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[4]]) ? 1 : 0) && !llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIlIlIl.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[5]]) ? 1 : 0)) {
                    throw new SlickException(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[6]]);
                }
                this.sound = SoundStore.get().getAIF(lllllllllllllIIIIlIIllIIlIIlIIll);
                "".length();
                if (-(0x7E ^ 0x7A) > 0) {
                    throw null;
                }
            }
            "".length();
            if ((0x2C ^ 0x40 ^ (0xAC ^ 0xC4)) != (0xEE ^ 0xC7 ^ (0x87 ^ 0xAA))) {
                throw null;
            }
        }
        catch (Exception lllllllllllllIIIIlIIllIIlIIllIII) {
            Log.error(lllllllllllllIIIIlIIllIIlIIllIII);
            throw new SlickException(String.valueOf(new StringBuilder().append(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[7]]).append(lllllllllllllIIIIlIIllIIlIIlIlIl)));
        }
    }
    
    public Music(final URL lllllllllllllIIIIlIIllIIlIIIIlIl, final boolean lllllllllllllIIIIlIIllIIlIIIIlII) throws SlickException {
        this.listeners = new ArrayList();
        this.volume = 1.0f;
        this.requiredPosition = -1.0f;
        SoundStore.get().init();
        final String lllllllllllllIIIIlIIllIIlIIIIlll = lllllllllllllIIIIlIIllIIlIIIIlIl.getFile();
        try {
            if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIIIlll.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[8]]) ? 1 : 0)) {
                if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIIIlII ? 1 : 0)) {
                    this.sound = SoundStore.get().getOggStream(lllllllllllllIIIIlIIllIIlIIIIlIl);
                    "".length();
                    if (" ".length() < -" ".length()) {
                        throw null;
                    }
                }
                else {
                    this.sound = SoundStore.get().getOgg(lllllllllllllIIIIlIIllIIlIIIIlIl.openStream());
                    "".length();
                    if ((0x49 ^ 0x4D) < -" ".length()) {
                        throw null;
                    }
                }
            }
            else if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIIIlll.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[9]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getWAV(lllllllllllllIIIIlIIllIIlIIIIlIl.openStream());
                "".length();
                if (((35 + 5 - 6 + 110 ^ 26 + 15 + 139 + 15) & (0xBC ^ 0x96 ^ (0x38 ^ 0x41) ^ -" ".length())) > 0) {
                    throw null;
                }
            }
            else if (!llllIlIlIllIlIl(lllllllllllllIIIIlIIllIIlIIIIlll.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[10]]) ? 1 : 0) || llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIIIlll.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[11]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getMOD(lllllllllllllIIIIlIIllIIlIIIIlIl.openStream());
                "".length();
                if (((0xD7 ^ 0x86) & ~(0x2A ^ 0x7B)) > ((0x57 ^ 0x68) & ~(0xB5 ^ 0x8A))) {
                    throw null;
                }
            }
            else {
                if (llllIlIlIllIlIl(lllllllllllllIIIIlIIllIIlIIIIlll.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[12]]) ? 1 : 0) && !llllIlIlIllIllI(lllllllllllllIIIIlIIllIIlIIIIlll.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[13]]) ? 1 : 0)) {
                    throw new SlickException(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[14]]);
                }
                this.sound = SoundStore.get().getAIF(lllllllllllllIIIIlIIllIIlIIIIlIl.openStream());
                "".length();
                if (-"  ".length() >= 0) {
                    throw null;
                }
            }
            "".length();
            if (((0xB ^ 0x2D ^ (0x35 ^ 0x41)) & (0x13 ^ 0xC ^ (0x21 ^ 0x6C) ^ -" ".length())) > (80 + 23 + 44 + 46 ^ 37 + 160 - 147 + 147)) {
                throw null;
            }
        }
        catch (Exception lllllllllllllIIIIlIIllIIlIIIlIll) {
            Log.error(lllllllllllllIIIIlIIllIIlIIIlIll);
            throw new SlickException(String.valueOf(new StringBuilder().append(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[15]]).append(lllllllllllllIIIIlIIllIIlIIIIlIl)));
        }
    }
    
    private static String llllIlIlIIlllII(final String lllllllllllllIIIIlIIlIlllllIIIIl, final String lllllllllllllIIIIlIIlIllllIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIlllllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIllllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIlIlllllIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIlIlllllIIIll.init(Music.lIlIllllllIIII[2], lllllllllllllIIIIlIIlIlllllIIlII);
            return new String(lllllllllllllIIIIlIIlIlllllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIlllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIlllllIIIlI) {
            lllllllllllllIIIIlIIlIlllllIIIlI.printStackTrace();
            return null;
        }
    }
    
    public void addListener(final MusicListener lllllllllllllIIIIlIIllIIIlllIIII) {
        this.listeners.add(lllllllllllllIIIIlIIllIIIlllIIII);
        "".length();
    }
    
    public float getPosition() {
        return this.sound.getPosition();
    }
    
    public boolean setPosition(final float lllllllllllllIIIIlIIllIIIIIIIlll) {
        if (llllIlIlIllIllI(this.playing ? 1 : 0)) {
            this.requiredPosition = -1.0f;
            this.positioning = (Music.lIlIllllllIIII[1] != 0);
            this.playing = (Music.lIlIllllllIIII[0] != 0);
            final boolean lllllllllllllIIIIlIIllIIIIIIlIIl = this.sound.setPosition(lllllllllllllIIIIlIIllIIIIIIIlll);
            this.playing = (Music.lIlIllllllIIII[1] != 0);
            this.positioning = (Music.lIlIllllllIIII[0] != 0);
            return lllllllllllllIIIIlIIllIIIIIIlIIl;
        }
        this.requiredPosition = lllllllllllllIIIIlIIllIIIIIIIlll;
        return Music.lIlIllllllIIII[0] != 0;
    }
    
    private static boolean llllIlIlIllIllI(final int lllllllllllllIIIIlIIlIllllIIIIll) {
        return lllllllllllllIIIIlIIlIllllIIIIll != 0;
    }
    
    static {
        llllIlIlIllIIll();
        llllIlIlIllIIIl();
    }
    
    private static void llllIlIlIllIIll() {
        (lIlIllllllIIII = new int[25])[0] = ((124 + 14 - 10 + 16 ^ 7 + 52 + 35 + 85) & ("   ".length() ^ (0xE0 ^ 0xC0) ^ -" ".length()));
        Music.lIlIllllllIIII[1] = " ".length();
        Music.lIlIllllllIIII[2] = "  ".length();
        Music.lIlIllllllIIII[3] = "   ".length();
        Music.lIlIllllllIIII[4] = (0x5F ^ 0x5B);
        Music.lIlIllllllIIII[5] = (0x46 ^ 0x1C ^ (0x50 ^ 0xF));
        Music.lIlIllllllIIII[6] = (29 + 137 - 97 + 127 ^ 164 + 86 - 105 + 49);
        Music.lIlIllllllIIII[7] = (158 + 21 - 177 + 178 ^ 51 + 129 - 61 + 60);
        Music.lIlIllllllIIII[8] = (138 + 71 - 92 + 31 ^ 41 + 35 + 17 + 63);
        Music.lIlIllllllIIII[9] = (53 + 19 + 38 + 21 ^ 99 + 85 - 46 + 0);
        Music.lIlIllllllIIII[10] = (0xAA ^ 0xA0 ^ ((0x7A ^ 0x53) & ~(0x6E ^ 0x47)));
        Music.lIlIllllllIIII[11] = (0xB6 ^ 0xBD);
        Music.lIlIllllllIIII[12] = (0x12 ^ 0x5E ^ (0x31 ^ 0x71));
        Music.lIlIllllllIIII[13] = (1 + 44 + 81 + 26 ^ 135 + 6 - 70 + 78);
        Music.lIlIllllllIIII[14] = (125 + 59 - 150 + 171 ^ 153 + 62 - 149 + 129);
        Music.lIlIllllllIIII[15] = (0x25 ^ 0x5B ^ (0x30 ^ 0x41));
        Music.lIlIllllllIIII[16] = (0x47 ^ 0x57);
        Music.lIlIllllllIIII[17] = (0xBE ^ 0xAF);
        Music.lIlIllllllIIII[18] = (0xA9 ^ 0xBB);
        Music.lIlIllllllIIII[19] = (0x68 ^ 0x7B);
        Music.lIlIllllllIIII[20] = (0xA5 ^ 0xB1);
        Music.lIlIllllllIIII[21] = (0x18 ^ 0xD);
        Music.lIlIllllllIIII[22] = (0x35 ^ 0x23);
        Music.lIlIllllllIIII[23] = (0x5B ^ 0x4C);
        Music.lIlIllllllIIII[24] = (0x35 ^ 0x3A ^ (0x9A ^ 0x8D));
    }
    
    public Music(final String lllllllllllllIIIIlIIllIIIllllIII, final boolean lllllllllllllIIIIlIIllIIIllllIlI) throws SlickException {
        this.listeners = new ArrayList();
        this.volume = 1.0f;
        this.requiredPosition = -1.0f;
        SoundStore.get().init();
        try {
            if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIIllllIII.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[16]]) ? 1 : 0)) {
                if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIIllllIlI ? 1 : 0)) {
                    this.sound = SoundStore.get().getOggStream(lllllllllllllIIIIlIIllIIIllllIII);
                    "".length();
                    if ((0xA6 ^ 0xA2) < -" ".length()) {
                        throw null;
                    }
                }
                else {
                    this.sound = SoundStore.get().getOgg(lllllllllllllIIIIlIIllIIIllllIII);
                    "".length();
                    if (-(0x92 ^ 0x96) >= 0) {
                        throw null;
                    }
                }
            }
            else if (llllIlIlIllIllI(lllllllllllllIIIIlIIllIIIllllIII.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[17]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getWAV(lllllllllllllIIIIlIIllIIIllllIII);
                "".length();
                if (((0x5 ^ 0x3D) & ~(0x4D ^ 0x75)) != 0x0) {
                    throw null;
                }
            }
            else if (!llllIlIlIllIlIl(lllllllllllllIIIIlIIllIIIllllIII.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[18]]) ? 1 : 0) || llllIlIlIllIllI(lllllllllllllIIIIlIIllIIIllllIII.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[19]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getMOD(lllllllllllllIIIIlIIllIIIllllIII);
                "".length();
                if (-" ".length() >= " ".length()) {
                    throw null;
                }
            }
            else {
                if (llllIlIlIllIlIl(lllllllllllllIIIIlIIllIIIllllIII.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[20]]) ? 1 : 0) && !llllIlIlIllIllI(lllllllllllllIIIIlIIllIIIllllIII.toLowerCase().endsWith(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[21]]) ? 1 : 0)) {
                    throw new SlickException(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[22]]);
                }
                this.sound = SoundStore.get().getAIF(lllllllllllllIIIIlIIllIIIllllIII);
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            "".length();
            if (null != null) {
                throw null;
            }
        }
        catch (Exception lllllllllllllIIIIlIIllIIIlllllIl) {
            Log.error(lllllllllllllIIIIlIIllIIIlllllIl);
            throw new SlickException(String.valueOf(new StringBuilder().append(Music.lIlIlllllIllIl[Music.lIlIllllllIIII[23]]).append(lllllllllllllIIIIlIIllIIIllllIII)));
        }
    }
    
    public void removeListener(final MusicListener lllllllllllllIIIIlIIllIIIllIlIlI) {
        this.listeners.remove(lllllllllllllIIIIlIIllIIIllIlIlI);
        "".length();
    }
    
    private static int llllIlIlIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int llllIlIlIllllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void loop(final float lllllllllllllIIIIlIIllIIIlIIIlll, final float lllllllllllllIIIIlIIllIIIlIIIIll) {
        this.startMusic(lllllllllllllIIIIlIIllIIIlIIIlll, lllllllllllllIIIIlIIllIIIlIIIIll, (boolean)(Music.lIlIllllllIIII[1] != 0));
    }
    
    public void fade(final int lllllllllllllIIIIlIIllIIIIIlllII, final float lllllllllllllIIIIlIIllIIIIIlIlll, final boolean lllllllllllllIIIIlIIllIIIIIllIlI) {
        this.stopAfterFade = lllllllllllllIIIIlIIllIIIIIllIlI;
        this.fadeStartGain = this.volume;
        this.fadeEndGain = lllllllllllllIIIIlIIllIIIIIlIlll;
        this.fadeDuration = lllllllllllllIIIIlIIllIIIIIlllII;
        this.fadeTime = lllllllllllllIIIIlIIllIIIIIlllII;
    }
    
    private static boolean llllIlIlIllIlll(final int lllllllllllllIIIIlIIlIllllIIllII, final int lllllllllllllIIIIlIIlIllllIIlIll) {
        return lllllllllllllIIIIlIIlIllllIIllII < lllllllllllllIIIIlIIlIllllIIlIll;
    }
    
    private void fireMusicEnded() {
        this.playing = (Music.lIlIllllllIIII[0] != 0);
        int lllllllllllllIIIIlIIllIIIllIIlll = Music.lIlIllllllIIII[0];
        while (llllIlIlIllIlll(lllllllllllllIIIIlIIllIIIllIIlll, this.listeners.size())) {
            this.listeners.get(lllllllllllllIIIIlIIllIIIllIIlll).musicEnded(this);
            ++lllllllllllllIIIIlIIllIIIllIIlll;
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
    }
    
    void update(final int lllllllllllllIIIIlIIllIIIIIIlllI) {
        if (llllIlIlIllIlIl(this.playing ? 1 : 0)) {
            return;
        }
        if (llllIlIlIlllIll(this.fadeTime)) {
            this.fadeTime -= lllllllllllllIIIIlIIllIIIIIIlllI;
            if (llllIlIlIlllIlI(this.fadeTime)) {
                this.fadeTime = Music.lIlIllllllIIII[0];
                if (llllIlIlIllIllI(this.stopAfterFade ? 1 : 0)) {
                    this.stop();
                    return;
                }
            }
            final float lllllllllllllIIIIlIIllIIIIIlIIlI = (this.fadeEndGain - this.fadeStartGain) * (1.0f - this.fadeTime / (float)this.fadeDuration);
            this.setVolume(this.fadeStartGain + lllllllllllllIIIIlIIllIIIIIlIIlI);
        }
    }
    
    public void play(final float lllllllllllllIIIIlIIllIIIlIIllIl, final float lllllllllllllIIIIlIIllIIIlIIllll) {
        this.startMusic(lllllllllllllIIIIlIIllIIIlIIllIl, lllllllllllllIIIIlIIllIIIlIIllll, (boolean)(Music.lIlIllllllIIII[0] != 0));
    }
    
    private void fireMusicSwapped(final Music lllllllllllllIIIIlIIllIIIlIlllII) {
        this.playing = (Music.lIlIllllllIIII[0] != 0);
        int lllllllllllllIIIIlIIllIIIllIIIII = Music.lIlIllllllIIII[0];
        while (llllIlIlIllIlll(lllllllllllllIIIIlIIllIIIllIIIII, this.listeners.size())) {
            this.listeners.get(lllllllllllllIIIIlIIllIIIllIIIII).musicSwapped(this, lllllllllllllIIIIlIIllIIIlIlllII);
            ++lllllllllllllIIIIlIIllIIIllIIIII;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
    }
    
    private static String llllIlIlIlIllIl(final String lllllllllllllIIIIlIIlIllllIlIlII, final String lllllllllllllIIIIlIIlIllllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIllllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIllllIlIIll.getBytes(StandardCharsets.UTF_8)), Music.lIlIllllllIIII[8]), "DES");
            final Cipher lllllllllllllIIIIlIIlIllllIlIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIlIllllIlIllI.init(Music.lIlIllllllIIII[2], lllllllllllllIIIIlIIlIllllIlIlll);
            return new String(lllllllllllllIIIIlIIlIllllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIllllIlIlIl) {
            lllllllllllllIIIIlIIlIllllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public void resume() {
        this.playing = (Music.lIlIllllllIIII[1] != 0);
        AudioImpl.restartMusic();
    }
    
    public void stop() {
        this.sound.stop();
    }
    
    private static boolean llllIlIlIllIlIl(final int lllllllllllllIIIIlIIlIllllIIIIIl) {
        return lllllllllllllIIIIlIIlIllllIIIIIl == 0;
    }
    
    public static void poll(final int lllllllllllllIIIIlIIllIIlIlIlIlI) {
        if (llllIlIlIllIlII(Music.currentMusic)) {
            SoundStore.get().poll(lllllllllllllIIIIlIIllIIlIlIlIlI);
            if (llllIlIlIllIlIl(SoundStore.get().isMusicPlaying() ? 1 : 0)) {
                if (llllIlIlIllIlIl(Music.currentMusic.positioning ? 1 : 0)) {
                    final Music lllllllllllllIIIIlIIllIIlIlIllII = Music.currentMusic;
                    Music.currentMusic = null;
                    lllllllllllllIIIIlIIllIIlIlIllII.fireMusicEnded();
                    "".length();
                    if (((0xE3 ^ 0xA1) & ~(0x37 ^ 0x75)) > "  ".length()) {
                        return;
                    }
                }
            }
            else {
                Music.currentMusic.update(lllllllllllllIIIIlIIllIIlIlIlIlI);
            }
        }
    }
    
    public Music(final URL lllllllllllllIIIIlIIllIIlIIlllIl) throws SlickException {
        this(lllllllllllllIIIIlIIllIIlIIlllIl, (boolean)(Music.lIlIllllllIIII[0] != 0));
    }
    
    public void pause() {
        this.playing = (Music.lIlIllllllIIII[0] != 0);
        AudioImpl.pauseMusic();
    }
    
    public void loop() {
        this.loop(1.0f, 1.0f);
    }
    
    public void setVolume(float lllllllllllllIIIIlIIllIIIIlIIlIl) {
        if (llllIlIlIlllIll(llllIlIlIllllIl(lllllllllllllIIIIlIIllIIIIlIIlIl, 1.0f))) {
            lllllllllllllIIIIlIIllIIIIlIIlIl = 1.0f;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        else if (llllIlIlIlllIlI(llllIlIlIlllllI(lllllllllllllIIIIlIIllIIIIlIIlIl, 0.0f))) {
            lllllllllllllIIIIlIIllIIIIlIIlIl = 0.0f;
        }
        this.volume = lllllllllllllIIIIlIIllIIIIlIIlIl;
        if (llllIlIlIllllII(Music.currentMusic, this)) {
            SoundStore.get().setCurrentMusicVolume(lllllllllllllIIIIlIIllIIIIlIIlIl);
        }
    }
    
    public float getVolume() {
        return this.volume;
    }
    
    private static void llllIlIlIllIIIl() {
        (lIlIlllllIllIl = new String[Music.lIlIllllllIIII[24]])[Music.lIlIllllllIIII[0]] = llllIlIlIIlllII("D2prpRYoSjU=", "Ezgwy");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[1]] = llllIlIlIIlllII("bQTVDxnNbDM=", "uRsZN");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[2]] = llllIlIlIIlllII("2Q70hdtn1q0=", "fTRLx");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[3]] = llllIlIlIIlllII("5MmUcexH6eo=", "aOARY");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[4]] = llllIlIlIlIllIl("wxG8E4GQepo=", "CeTxy");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[5]] = llllIlIlIlIlllI("YxkkAC0=", "MxMfK");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[6]] = llllIlIlIIlllII("1r+LtlOiUxY+/WkBm220q/Em+recFeF6CMmFrx/VR42KB458+90rLfclRbpeUa5GwSm3Y0E3RAkoirBDqw43iA==", "pxcDq");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[7]] = llllIlIlIlIllIl("3z6SLgBUgu11yDYVN8pIi6y5iqqjCT9F", "iksMN");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[8]] = llllIlIlIIlllII("vc2BJC6DSlQ=", "ZKYwk");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[9]] = llllIlIlIlIlllI("exQSBg==", "UcspD");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[10]] = llllIlIlIIlllII("lt8e+oEUnr8=", "tywTF");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[11]] = llllIlIlIlIlllI("XAQJEw==", "rifww");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[12]] = llllIlIlIlIlllI("XxYtFQ==", "qwDsv");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[13]] = llllIlIlIIlllII("fyl1DrscZaQ=", "iUCOt");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[14]] = llllIlIlIlIlllI("HyEnNXJ+NyZgcn4iJCh+cGEkKzV8byoiNnBhKiU0fylrLSA1byg5ICIqJTg+KW84OSIgIDk4NzRh", "POKLR");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[15]] = llllIlIlIlIllIl("CS7XmtSO9ZBUr+0P/Y/ysFBA/0Kdygf/", "TQsfX");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[16]] = llllIlIlIlIllIl("i10Y18iKytA=", "OPCUc");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[17]] = llllIlIlIIlllII("6V4b/BrigWM=", "gJMFU");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[18]] = llllIlIlIlIlllI("Xj0a", "pEwTI");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[19]] = llllIlIlIIlllII("0QOyb9peSCo=", "xCRlk");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[20]] = llllIlIlIlIlllI("QjkRDQ==", "lXxkE");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[21]] = llllIlIlIIlllII("Y1vXS3XqEjA=", "xDJyL");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[22]] = llllIlIlIIlllII("Cm/jK4k3JqIl2v0KGJYjsP28KVzdza2RsH+gjq0e7GuzI2c4l8sYUBeu1GcpQIKwIyJaNZSjc7v7IUwn7HJqug==", "jERRA");
        Music.lIlIlllllIllIl[Music.lIlIllllllIIII[23]] = llllIlIlIlIllIl("YHYlRN3nbF2OZzfpuTPEfTosd+h0IqhS", "nXsdq");
    }
    
    public void play() {
        this.play(1.0f, 1.0f);
    }
    
    private static boolean llllIlIlIllllII(final Object lllllllllllllIIIIlIIlIllllIIIllI, final Object lllllllllllllIIIIlIIlIllllIIIlIl) {
        return lllllllllllllIIIIlIIlIllllIIIllI == lllllllllllllIIIIlIIlIllllIIIlIl;
    }
    
    private static boolean llllIlIlIlllIll(final int lllllllllllllIIIIlIIlIlllIllllIl) {
        return lllllllllllllIIIIlIIlIlllIllllIl > 0;
    }
    
    private static String llllIlIlIlIlllI(String lllllllllllllIIIIlIIlIllllllIIIl, final String lllllllllllllIIIIlIIlIllllllIIII) {
        lllllllllllllIIIIlIIlIllllllIIIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIlIllllllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlIllllllIlII = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlIllllllIIll = lllllllllllllIIIIlIIlIllllllIIII.toCharArray();
        int lllllllllllllIIIIlIIlIllllllIIlI = Music.lIlIllllllIIII[0];
        final double lllllllllllllIIIIlIIlIlllllIllII = (Object)((String)lllllllllllllIIIIlIIlIllllllIIIl).toCharArray();
        final float lllllllllllllIIIIlIIlIlllllIlIll = lllllllllllllIIIIlIIlIlllllIllII.length;
        String lllllllllllllIIIIlIIlIlllllIlIlI = (String)Music.lIlIllllllIIII[0];
        while (llllIlIlIllIlll((int)lllllllllllllIIIIlIIlIlllllIlIlI, (int)lllllllllllllIIIIlIIlIlllllIlIll)) {
            final char lllllllllllllIIIIlIIlIllllllIlll = lllllllllllllIIIIlIIlIlllllIllII[lllllllllllllIIIIlIIlIlllllIlIlI];
            lllllllllllllIIIIlIIlIllllllIlII.append((char)(lllllllllllllIIIIlIIlIllllllIlll ^ lllllllllllllIIIIlIIlIllllllIIll[lllllllllllllIIIIlIIlIllllllIIlI % lllllllllllllIIIIlIIlIllllllIIll.length]));
            "".length();
            ++lllllllllllllIIIIlIIlIllllllIIlI;
            ++lllllllllllllIIIIlIIlIlllllIlIlI;
            "".length();
            if ((0x9 ^ 0xD) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlIllllllIlII);
    }
    
    private static boolean llllIlIlIlllIlI(final int lllllllllllllIIIIlIIlIlllIllllll) {
        return lllllllllllllIIIIlIIlIlllIllllll < 0;
    }
    
    public Music(final String lllllllllllllIIIIlIIllIIlIlIIlIl) throws SlickException {
        this(lllllllllllllIIIIlIIllIIlIlIIlIl, (boolean)(Music.lIlIllllllIIII[0] != 0));
    }
    
    private static int llllIlIlIlllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llllIlIlIlllIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
}
