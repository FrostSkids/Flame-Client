// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.io.InputStream;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.openal.SoundStore;
import java.net.URL;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.openal.Audio;

public class Sound
{
    private /* synthetic */ Audio sound;
    private static final /* synthetic */ int[] llIlIlIIlIIIlI;
    private static final /* synthetic */ String[] llIlIlIIlIIIIl;
    
    public void play() {
        this.play(1.0f, 1.0f);
    }
    
    private static String lIIlIIllllIIIIII(final String llllllllllllIllIlIlIlllIIIlIIIII, final String llllllllllllIllIlIlIlllIIIIlllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlllIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlllIIIIlllll.getBytes(StandardCharsets.UTF_8)), Sound.llIlIlIIlIIIlI[8]), "DES");
            final Cipher llllllllllllIllIlIlIlllIIIlIIlII = Cipher.getInstance("DES");
            llllllllllllIllIlIlIlllIIIlIIlII.init(Sound.llIlIlIIlIIIlI[2], llllllllllllIllIlIlIlllIIIlIIlIl);
            return new String(llllllllllllIllIlIlIlllIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlllIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlllIIIlIIIll) {
            llllllllllllIllIlIlIlllIIIlIIIll.printStackTrace();
            return null;
        }
    }
    
    public void playAt(final float llllllllllllIllIlIlIlllIIlIlIlII, final float llllllllllllIllIlIlIlllIIlIIllll, final float llllllllllllIllIlIlIlllIIlIlIIlI) {
        this.playAt(1.0f, 1.0f, llllllllllllIllIlIlIlllIIlIlIlII, llllllllllllIllIlIlIlllIIlIIllll, llllllllllllIllIlIlIlllIIlIlIIlI);
    }
    
    private static boolean lIIlIIllllIIIllI(final int llllllllllllIllIlIlIllIlllllIlIl, final int llllllllllllIllIlIlIllIlllllIlII) {
        return llllllllllllIllIlIlIllIlllllIlIl < llllllllllllIllIlIlIllIlllllIlII;
    }
    
    public void loop() {
        this.loop(1.0f, 1.0f);
    }
    
    public boolean playing() {
        return this.sound.isPlaying();
    }
    
    private static String lIIlIIlllIllllll(final String llllllllllllIllIlIlIllIllllllIll, final String llllllllllllIllIlIlIllIllllllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlllIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIllllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIllIlllllllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIllIlllllllll.init(Sound.llIlIlIIlIIIlI[2], llllllllllllIllIlIlIlllIIIIIIIII);
            return new String(llllllllllllIllIlIlIllIlllllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIllllllllI) {
            llllllllllllIllIlIlIllIllllllllI.printStackTrace();
            return null;
        }
    }
    
    public Sound(final URL llllllllllllIllIlIlIlllIIlllIlII) throws SlickException {
        SoundStore.get().init();
        final String llllllllllllIllIlIlIlllIIlllIIll = llllllllllllIllIlIlIlllIIlllIlII.getFile();
        try {
            if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllIIll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[7]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getOgg(llllllllllllIllIlIlIlllIIlllIlII.openStream());
                "".length();
                if (-" ".length() > 0) {
                    throw null;
                }
            }
            else if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllIIll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[8]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getWAV(llllllllllllIllIlIlIlllIIlllIlII.openStream());
                "".length();
                if (-(0x1C ^ 0x18) > 0) {
                    throw null;
                }
            }
            else if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllIIll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[9]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getAIF(llllllllllllIllIlIlIlllIIlllIlII.openStream());
                "".length();
                if (((0x1F ^ 0x50) & ~(0x36 ^ 0x79)) != 0x0) {
                    throw null;
                }
            }
            else {
                if (lIIlIIllllIIIlIl(llllllllllllIllIlIlIlllIIlllIIll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[10]]) ? 1 : 0) && !lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllIIll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[11]]) ? 1 : 0)) {
                    throw new SlickException(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[12]]);
                }
                this.sound = SoundStore.get().getMOD(llllllllllllIllIlIlIlllIIlllIlII.openStream());
                "".length();
                if (" ".length() != " ".length()) {
                    throw null;
                }
            }
            "".length();
            if (((0x50 ^ 0x43) & ~(0x86 ^ 0x95)) != ((0x5F ^ 0x65) & ~(0x15 ^ 0x2F))) {
                throw null;
            }
        }
        catch (Exception llllllllllllIllIlIlIlllIIlllIllI) {
            Log.error(llllllllllllIllIlIlIlllIIlllIllI);
            throw new SlickException(String.valueOf(new StringBuilder().append(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[13]]).append(llllllllllllIllIlIlIlllIIlllIIll)));
        }
    }
    
    private static void lIIlIIllllIIIIll() {
        (llIlIlIIlIIIlI = new int[22])[0] = ((0x53 ^ 0x3C ^ (0x1B ^ 0x22)) & (0x4A ^ 0x66 ^ (0x34 ^ 0x4E) ^ -" ".length()));
        Sound.llIlIlIIlIIIlI[1] = " ".length();
        Sound.llIlIlIIlIIIlI[2] = "  ".length();
        Sound.llIlIlIIlIIIlI[3] = "   ".length();
        Sound.llIlIlIIlIIIlI[4] = (0xD6 ^ 0xA5 ^ (0x19 ^ 0x6E));
        Sound.llIlIlIIlIIIlI[5] = (0x8F ^ 0x8A);
        Sound.llIlIlIIlIIIlI[6] = (50 + 87 - 42 + 38 ^ 69 + 127 - 125 + 60);
        Sound.llIlIlIIlIIIlI[7] = (0x6C ^ 0x60 ^ (0xB2 ^ 0xB9));
        Sound.llIlIlIIlIIIlI[8] = (0x66 ^ 0x6E);
        Sound.llIlIlIIlIIIlI[9] = (0x9E ^ 0x97);
        Sound.llIlIlIIlIIIlI[10] = (0x38 ^ 0x70 ^ (0x31 ^ 0x73));
        Sound.llIlIlIIlIIIlI[11] = (0 + 122 + 31 + 22 ^ 137 + 138 - 231 + 120);
        Sound.llIlIlIIlIIIlI[12] = (0x53 ^ 0x75 ^ (0x5A ^ 0x70));
        Sound.llIlIlIIlIIIlI[13] = (34 + 137 - 130 + 136 ^ 88 + 56 + 43 + 1);
        Sound.llIlIlIIlIIIlI[14] = (0xF7 ^ 0x9C ^ (0xC ^ 0x69));
        Sound.llIlIlIIlIIIlI[15] = (0x27 ^ 0x28);
        Sound.llIlIlIIlIIIlI[16] = (0xD7 ^ 0xC0 ^ (0x99 ^ 0x9E));
        Sound.llIlIlIIlIIIlI[17] = (0x66 ^ 0x46 ^ (0x87 ^ 0xB6));
        Sound.llIlIlIIlIIIlI[18] = (0x8A ^ 0x98);
        Sound.llIlIlIIlIIIlI[19] = (0x85 ^ 0x96);
        Sound.llIlIlIIlIIIlI[20] = (0xD1 ^ 0xC5);
        Sound.llIlIlIIlIIIlI[21] = (0x3D ^ 0x28);
    }
    
    public void stop() {
        this.sound.stop();
    }
    
    public void play(final float llllllllllllIllIlIlIlllIIlIllllI, final float llllllllllllIllIlIlIlllIIlIlllIl) {
        this.sound.playAsSoundEffect(llllllllllllIllIlIlIlllIIlIllllI, llllllllllllIllIlIlIlllIIlIlllIl * SoundStore.get().getSoundVolume(), (boolean)(Sound.llIlIlIIlIIIlI[0] != 0));
        "".length();
    }
    
    private static boolean lIIlIIllllIIIlII(final int llllllllllllIllIlIlIllIlllllIIlI) {
        return llllllllllllIllIlIlIllIlllllIIlI != 0;
    }
    
    public void playAt(final float llllllllllllIllIlIlIlllIIlIIIIII, final float llllllllllllIllIlIlIlllIIIllllll, final float llllllllllllIllIlIlIlllIIlIIIlII, final float llllllllllllIllIlIlIlllIIIllllIl, final float llllllllllllIllIlIlIlllIIIllllII) {
        this.sound.playAsSoundEffect(llllllllllllIllIlIlIlllIIlIIIIII, llllllllllllIllIlIlIlllIIIllllll * SoundStore.get().getSoundVolume(), (boolean)(Sound.llIlIlIIlIIIlI[0] != 0), llllllllllllIllIlIlIlllIIlIIIlII, llllllllllllIllIlIlIlllIIIllllIl, llllllllllllIllIlIlIlllIIIllllII);
        "".length();
    }
    
    private static boolean lIIlIIllllIIIlIl(final int llllllllllllIllIlIlIllIlllllIIII) {
        return llllllllllllIllIlIlIllIlllllIIII == 0;
    }
    
    private static void lIIlIIllllIIIIlI() {
        (llIlIlIIlIIIIl = new String[Sound.llIlIlIIlIIIlI[21]])[Sound.llIlIlIIlIIIlI[0]] = lIIlIIlllIllllll("sgwt/2d/8zg=", "realt");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[1]] = lIIlIIllllIIIIII("S0VjEbyz1Vo=", "ZdQat");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[2]] = lIIlIIlllIllllll("SKIQXmLYVhg=", "YIpVv");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[3]] = lIIlIIllllIIIIII("6H/QVEai/h4=", "HWSqw");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[4]] = lIIlIIlllIllllll("4yrmaQTXQ7A=", "beQDA");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[5]] = lIIlIIlllIllllll("zBJBanSb50kl/HSqR1PJpzjuGK2wO90++AcsQZD/pC/fr4mn+14RNNhcOMyw4DJc2mxsdEPajRr/ujfGF5jSFg==", "ZJMvI");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[6]] = lIIlIIllllIIIIII("SKidhxWm6trULF+CFnDiQBzNCF0vJqGe", "jmWbK");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[7]] = lIIlIIllllIIIIIl("Zx0eEw==", "IrytE");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[8]] = lIIlIIllllIIIIIl("Yi0vGA==", "LZNnA");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[9]] = lIIlIIlllIllllll("AESPg1mYST8=", "Wohwk");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[10]] = lIIlIIllllIIIIIl("eTYE", "WNimM");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[11]] = lIIlIIlllIllllll("K+d4QAM/kkA=", "QIYvj");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[12]] = lIIlIIllllIIIIIl("BjkqHnFnLytLcWc6KQN9aXknDjdld2gQMD93Jwk1aXkpADZpNjQCcSoiNBU0JyMqHnE6IjYXPjsjIwN/", "IWFgQ");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[13]] = lIIlIIlllIllllll("Qcz52p4EK5iiGH02xwEsr7HT1Nt5NMTX", "gQQRG");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[14]] = lIIlIIllllIIIIII("zPImESdE7Kk=", "WzIes");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[15]] = lIIlIIllllIIIIIl("VDITIw==", "zErUi");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[16]] = lIIlIIllllIIIIIl("bxUQCQ==", "AtyoE");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[17]] = lIIlIIllllIIIIII("aRQ4dq4++cw=", "rcCbE");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[18]] = lIIlIIllllIIIIIl("Qjo6AQ==", "lWUes");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[19]] = lIIlIIlllIllllll("guAJNbYUgyPahmRet0yIFYP25sEI6jVXIbk13F0xweCQOj30jfFpANL+VZt/b2FzgGZ5VexHbhNav3cw1PtZXA==", "vDxOY");
        Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[20]] = lIIlIIllllIIIIIl("AyMRPTMhYgw+diktGTV2Ni0NPzJ/Yg==", "EBxQV");
    }
    
    public Sound(final InputStream llllllllllllIllIlIlIlllIIlllllIl, final String llllllllllllIllIlIlIlllIIlllllII) throws SlickException {
        SoundStore.get().init();
        try {
            if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllllII.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[0]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getOgg(llllllllllllIllIlIlIlllIIlllllIl);
                "".length();
                if ((0x31 ^ 0x35) == 0x0) {
                    throw null;
                }
            }
            else if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllllII.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[1]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getWAV(llllllllllllIllIlIlIlllIIlllllIl);
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            else if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllllII.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[2]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getAIF(llllllllllllIllIlIlIlllIIlllllIl);
                "".length();
                if ("   ".length() > "   ".length()) {
                    throw null;
                }
            }
            else {
                if (lIIlIIllllIIIlIl(llllllllllllIllIlIlIlllIIlllllII.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[3]]) ? 1 : 0) && !lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIlllllII.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[4]]) ? 1 : 0)) {
                    throw new SlickException(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[5]]);
                }
                this.sound = SoundStore.get().getMOD(llllllllllllIllIlIlIlllIIlllllIl);
                "".length();
                if ("   ".length() < 0) {
                    throw null;
                }
            }
            "".length();
            if (-" ".length() >= 0) {
                throw null;
            }
        }
        catch (Exception llllllllllllIllIlIlIlllIlIIIIIlI) {
            Log.error(llllllllllllIllIlIlIlllIlIIIIIlI);
            throw new SlickException(String.valueOf(new StringBuilder().append(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[6]]).append(llllllllllllIllIlIlIlllIIlllllII)));
        }
    }
    
    public Sound(final String llllllllllllIllIlIlIlllIIllIIlll) throws SlickException {
        SoundStore.get().init();
        try {
            if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIllIIlll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[14]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getOgg(llllllllllllIllIlIlIlllIIllIIlll);
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            else if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIllIIlll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[15]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getWAV(llllllllllllIllIlIlIlllIIllIIlll);
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            else if (lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIllIIlll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[16]]) ? 1 : 0)) {
                this.sound = SoundStore.get().getAIF(llllllllllllIllIlIlIlllIIllIIlll);
                "".length();
                if ((78 + 62 - 21 + 30 ^ 32 + 6 + 50 + 57) <= -" ".length()) {
                    throw null;
                }
            }
            else {
                if (lIIlIIllllIIIlIl(llllllllllllIllIlIlIlllIIllIIlll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[17]]) ? 1 : 0) && !lIIlIIllllIIIlII(llllllllllllIllIlIlIlllIIllIIlll.toLowerCase().endsWith(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[18]]) ? 1 : 0)) {
                    throw new SlickException(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[19]]);
                }
                this.sound = SoundStore.get().getMOD(llllllllllllIllIlIlIlllIIllIIlll);
                "".length();
                if (((149 + 174 - 314 + 218 ^ 100 + 112 - 96 + 61) & (0x32 ^ 0x5 ^ (0x41 ^ 0x24) ^ -" ".length())) > ((0x18 ^ 0x74 ^ (0xB ^ 0x7E)) & (0xC ^ 0x77 ^ (0xF4 ^ 0x96) ^ -" ".length()))) {
                    throw null;
                }
            }
            "".length();
            if (((0xAF ^ 0xB0 ^ (0xD5 ^ 0x98)) & (0x5A ^ 0xA ^ "  ".length() ^ -" ".length())) == (23 + 42 + 64 + 16 ^ 29 + 116 - 130 + 134)) {
                throw null;
            }
        }
        catch (Exception llllllllllllIllIlIlIlllIIllIlIll) {
            Log.error(llllllllllllIllIlIlIlllIIllIlIll);
            throw new SlickException(String.valueOf(new StringBuilder().append(Sound.llIlIlIIlIIIIl[Sound.llIlIlIIlIIIlI[20]]).append(llllllllllllIllIlIlIlllIIllIIlll)));
        }
    }
    
    private static String lIIlIIllllIIIIIl(String llllllllllllIllIlIlIlllIIIIIllIl, final String llllllllllllIllIlIlIlllIIIIlIIIl) {
        llllllllllllIllIlIlIlllIIIIIllIl = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIlllIIIIIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIlllIIIIlIIII = new StringBuilder();
        final char[] llllllllllllIllIlIlIlllIIIIIllll = llllllllllllIllIlIlIlllIIIIlIIIl.toCharArray();
        int llllllllllllIllIlIlIlllIIIIIlllI = Sound.llIlIlIIlIIIlI[0];
        final byte llllllllllllIllIlIlIlllIIIIIlIII = (Object)((String)llllllllllllIllIlIlIlllIIIIIllIl).toCharArray();
        final int llllllllllllIllIlIlIlllIIIIIIlll = llllllllllllIllIlIlIlllIIIIIlIII.length;
        String llllllllllllIllIlIlIlllIIIIIIllI = (String)Sound.llIlIlIIlIIIlI[0];
        while (lIIlIIllllIIIllI((int)llllllllllllIllIlIlIlllIIIIIIllI, llllllllllllIllIlIlIlllIIIIIIlll)) {
            final char llllllllllllIllIlIlIlllIIIIlIIll = llllllllllllIllIlIlIlllIIIIIlIII[llllllllllllIllIlIlIlllIIIIIIllI];
            llllllllllllIllIlIlIlllIIIIlIIII.append((char)(llllllllllllIllIlIlIlllIIIIlIIll ^ llllllllllllIllIlIlIlllIIIIIllll[llllllllllllIllIlIlIlllIIIIIlllI % llllllllllllIllIlIlIlllIIIIIllll.length]));
            "".length();
            ++llllllllllllIllIlIlIlllIIIIIlllI;
            ++llllllllllllIllIlIlIlllIIIIIIllI;
            "".length();
            if ((0xFD ^ 0xA8 ^ (0x67 ^ 0x36)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIlllIIIIlIIII);
    }
    
    public void loop(final float llllllllllllIllIlIlIlllIIIllIIIl, final float llllllllllllIllIlIlIlllIIIllIIll) {
        this.sound.playAsSoundEffect(llllllllllllIllIlIlIlllIIIllIIIl, llllllllllllIllIlIlIlllIIIllIIll * SoundStore.get().getSoundVolume(), (boolean)(Sound.llIlIlIIlIIIlI[1] != 0));
        "".length();
    }
    
    static {
        lIIlIIllllIIIIll();
        lIIlIIllllIIIIlI();
    }
}
