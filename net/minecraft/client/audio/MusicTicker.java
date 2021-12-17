// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ITickable;

public class MusicTicker implements ITickable
{
    private static final /* synthetic */ int[] llIIIllIlIIllI;
    private /* synthetic */ ISound currentMusic;
    private final /* synthetic */ Minecraft mc;
    private final /* synthetic */ Random rand;
    private /* synthetic */ int timeUntilNextMusic;
    
    private static void lIIIlIlIIllIIIlI() {
        (llIIIllIlIIllI = new int[5])[0] = (0xC1 ^ 0xA5);
        MusicTicker.llIIIllIlIIllI[1] = ((0x60 ^ 0x56) & ~(0x17 ^ 0x21));
        MusicTicker.llIIIllIlIIllI[2] = "  ".length();
        MusicTicker.llIIIllIlIIllI[3] = " ".length();
        MusicTicker.llIIIllIlIIllI[4] = (-1 & Integer.MAX_VALUE);
    }
    
    public void func_181557_a() {
        if (lIIIlIlIIllIIIll(this.currentMusic)) {
            this.mc.getSoundHandler().stopSound(this.currentMusic);
            this.currentMusic = null;
            this.timeUntilNextMusic = MusicTicker.llIIIllIlIIllI[1];
        }
    }
    
    private static boolean lIIIlIlIIllIIlII(final int llllllllllllIlllIlIIlIlIIIllIIlI) {
        return llllllllllllIlllIlIIlIlIIIllIIlI == 0;
    }
    
    public void func_181558_a(final MusicType llllllllllllIlllIlIIlIlIIIlllIll) {
        this.currentMusic = PositionedSoundRecord.create(llllllllllllIlllIlIIlIlIIIlllIll.getMusicLocation());
        this.mc.getSoundHandler().playSound(this.currentMusic);
        this.timeUntilNextMusic = MusicTicker.llIIIllIlIIllI[4];
    }
    
    @Override
    public void update() {
        final MusicType llllllllllllIlllIlIIlIlIIlIIIIll = this.mc.getAmbientMusicType();
        if (lIIIlIlIIllIIIll(this.currentMusic)) {
            if (lIIIlIlIIllIIlII(llllllllllllIlllIlIIlIlIIlIIIIll.getMusicLocation().equals(this.currentMusic.getSoundLocation()) ? 1 : 0)) {
                this.mc.getSoundHandler().stopSound(this.currentMusic);
                this.timeUntilNextMusic = MathHelper.getRandomIntegerInRange(this.rand, MusicTicker.llIIIllIlIIllI[1], llllllllllllIlllIlIIlIlIIlIIIIll.getMinDelay() / MusicTicker.llIIIllIlIIllI[2]);
            }
            if (lIIIlIlIIllIIlII(this.mc.getSoundHandler().isSoundPlaying(this.currentMusic) ? 1 : 0)) {
                this.currentMusic = null;
                this.timeUntilNextMusic = Math.min(MathHelper.getRandomIntegerInRange(this.rand, llllllllllllIlllIlIIlIlIIlIIIIll.getMinDelay(), llllllllllllIlllIlIIlIlIIlIIIIll.getMaxDelay()), this.timeUntilNextMusic);
            }
        }
        if (lIIIlIlIIllIIlIl(this.currentMusic)) {
            final int timeUntilNextMusic = this.timeUntilNextMusic;
            this.timeUntilNextMusic = timeUntilNextMusic - MusicTicker.llIIIllIlIIllI[3];
            if (lIIIlIlIIllIIllI(timeUntilNextMusic)) {
                this.func_181558_a(llllllllllllIlllIlIIlIlIIlIIIIll);
            }
        }
    }
    
    private static boolean lIIIlIlIIllIIlIl(final Object llllllllllllIlllIlIIlIlIIIllIlII) {
        return llllllllllllIlllIlIIlIlIIIllIlII == null;
    }
    
    static {
        lIIIlIlIIllIIIlI();
    }
    
    private static boolean lIIIlIlIIllIIIll(final Object llllllllllllIlllIlIIlIlIIIllIllI) {
        return llllllllllllIlllIlIIlIlIIIllIllI != null;
    }
    
    private static boolean lIIIlIlIIllIIllI(final int llllllllllllIlllIlIIlIlIIIllIIII) {
        return llllllllllllIlllIlIIlIlIIIllIIII <= 0;
    }
    
    public MusicTicker(final Minecraft llllllllllllIlllIlIIlIlIIlIIlIIl) {
        this.rand = new Random();
        this.timeUntilNextMusic = MusicTicker.llIIIllIlIIllI[0];
        this.mc = llllllllllllIlllIlIIlIlIIlIIlIIl;
    }
    
    public enum MusicType
    {
        private final /* synthetic */ int minDelay;
        private final /* synthetic */ ResourceLocation musicLocation;
        
        MENU(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[0]], MusicType.lIllIllIIlllll[0], new ResourceLocation(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[1]]), MusicType.lIllIllIIlllll[2], MusicType.lIllIllIIlllll[3]), 
        NETHER(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[15]], MusicType.lIllIllIIlllll[8], new ResourceLocation(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[16]]), MusicType.lIllIllIIlllll[10], MusicType.lIllIllIIlllll[11]), 
        END(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[19]], MusicType.lIllIllIIlllll[12], new ResourceLocation(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[20]]), MusicType.lIllIllIIlllll[21], MusicType.lIllIllIIlllll[7]);
        
        private static final /* synthetic */ int[] lIllIllIIlllll;
        
        CREATIVE(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[8]], MusicType.lIllIllIIlllll[4], new ResourceLocation(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[9]]), MusicType.lIllIllIIlllll[10], MusicType.lIllIllIIlllll[11]);
        
        private final /* synthetic */ int maxDelay;
        
        END_BOSS(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[17]], MusicType.lIllIllIIlllll[9], new ResourceLocation(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[18]]), MusicType.lIllIllIIlllll[0], MusicType.lIllIllIIlllll[0]), 
        CREDITS(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[12]], MusicType.lIllIllIIlllll[5], new ResourceLocation(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[13]]), MusicType.lIllIllIIlllll[14], MusicType.lIllIllIIlllll[14]), 
        GAME(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[4]], MusicType.lIllIllIIlllll[1], new ResourceLocation(MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[5]]), MusicType.lIllIllIIlllll[6], MusicType.lIllIllIIlllll[7]);
        
        private static final /* synthetic */ String[] lIllIllIIlllIl;
        
        private static void llllllllIIlIllI() {
            (lIllIllIIlllll = new int[23])[0] = ((0x77 ^ 0x3A ^ (0xD ^ 0x8)) & (132 + 47 - 171 + 237 ^ 143 + 35 - 107 + 118 ^ -" ".length()));
            MusicType.lIllIllIIlllll[1] = " ".length();
            MusicType.lIllIllIIlllll[2] = (0x6 ^ 0x5D ^ (0x7D ^ 0x32));
            MusicType.lIllIllIIlllll[3] = (-(0xFFFFB5A8 & 0x5BDF) & (0xFFFFFBDF & 0x17FF));
            MusicType.lIllIllIIlllll[4] = "  ".length();
            MusicType.lIllIllIIlllll[5] = "   ".length();
            MusicType.lIllIllIIlllll[6] = (0xFFFFEFED & 0x3EF2);
            MusicType.lIllIllIIlllll[7] = (0xFFFFDFF1 & 0x7DCE);
            MusicType.lIllIllIIlllll[8] = (0x7E ^ 0x4B ^ (0x4F ^ 0x7E));
            MusicType.lIllIllIIlllll[9] = (0x2C ^ 0x29);
            MusicType.lIllIllIIlllll[10] = (-(0xFFFFD35D & 0x7CAB) & (0xFFFFF4BD & 0x5FFA));
            MusicType.lIllIllIIlllll[11] = (-(0xFFFFF777 & 0x39E9) & (0xFFFFBFFC & 0x7F73));
            MusicType.lIllIllIIlllll[12] = (46 + 63 - 43 + 85 ^ 23 + 77 - 25 + 70);
            MusicType.lIllIllIIlllll[13] = (0x85 ^ 0x82);
            MusicType.lIllIllIIlllll[14] = (-1 & Integer.MAX_VALUE);
            MusicType.lIllIllIIlllll[15] = (56 + 69 - 80 + 96 ^ 29 + 65 - 18 + 57);
            MusicType.lIllIllIIlllll[16] = (0xD6 ^ 0x94 ^ (0x2B ^ 0x60));
            MusicType.lIllIllIIlllll[17] = (0x27 ^ 0x2D);
            MusicType.lIllIllIIlllll[18] = (0x7 ^ 0x71 ^ (0xC5 ^ 0xB8));
            MusicType.lIllIllIIlllll[19] = (0x86 ^ 0x83 ^ (0x29 ^ 0x20));
            MusicType.lIllIllIIlllll[20] = (((0xE6 ^ 0xB1) & ~(0x6E ^ 0x39)) ^ (0x74 ^ 0x79));
            MusicType.lIllIllIIlllll[21] = (0xFFFFF7F1 & 0x1F7E);
            MusicType.lIllIllIIlllll[22] = (0x51 ^ 0x5F);
        }
        
        private static String llllllllIIIllII(final String llllllllllllIlllllllIIIIlllIlllI, final String llllllllllllIlllllllIIIIlllIllIl) {
            try {
                final SecretKeySpec llllllllllllIlllllllIIIIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIIIlllIllIl.getBytes(StandardCharsets.UTF_8)), MusicType.lIllIllIIlllll[15]), "DES");
                final Cipher llllllllllllIlllllllIIIIllllIIlI = Cipher.getInstance("DES");
                llllllllllllIlllllllIIIIllllIIlI.init(MusicType.lIllIllIIlllll[4], llllllllllllIlllllllIIIIllllIIll);
                return new String(llllllllllllIlllllllIIIIllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllllIIIIllllIIIl) {
                llllllllllllIlllllllIIIIllllIIIl.printStackTrace();
                return null;
            }
        }
        
        private static String llllllllIIIllIl(String llllllllllllIlllllllIIIIllIIlllI, final String llllllllllllIlllllllIIIIllIlIIlI) {
            llllllllllllIlllllllIIIIllIIlllI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllllIIIIllIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllllllIIIIllIlIIIl = new StringBuilder();
            final char[] llllllllllllIlllllllIIIIllIlIIII = llllllllllllIlllllllIIIIllIlIIlI.toCharArray();
            int llllllllllllIlllllllIIIIllIIllll = MusicType.lIllIllIIlllll[0];
            final byte llllllllllllIlllllllIIIIllIIlIIl = (Object)((String)llllllllllllIlllllllIIIIllIIlllI).toCharArray();
            final int llllllllllllIlllllllIIIIllIIlIII = llllllllllllIlllllllIIIIllIIlIIl.length;
            float llllllllllllIlllllllIIIIllIIIlll = MusicType.lIllIllIIlllll[0];
            while (llllllllIIlIlll((int)llllllllllllIlllllllIIIIllIIIlll, llllllllllllIlllllllIIIIllIIlIII)) {
                final char llllllllllllIlllllllIIIIllIlIlII = llllllllllllIlllllllIIIIllIIlIIl[llllllllllllIlllllllIIIIllIIIlll];
                llllllllllllIlllllllIIIIllIlIIIl.append((char)(llllllllllllIlllllllIIIIllIlIlII ^ llllllllllllIlllllllIIIIllIlIIII[llllllllllllIlllllllIIIIllIIllll % llllllllllllIlllllllIIIIllIlIIII.length]));
                "".length();
                ++llllllllllllIlllllllIIIIllIIllll;
                ++llllllllllllIlllllllIIIIllIIIlll;
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllllllIIIIllIlIIIl);
        }
        
        private static String llllllllIIIlIll(final String llllllllllllIlllllllIIIIlllIIIll, final String llllllllllllIlllllllIIIIlllIIIII) {
            try {
                final SecretKeySpec llllllllllllIlllllllIIIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllllllIIIIlllIIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIlllllllIIIIlllIIlIl.init(MusicType.lIllIllIIlllll[4], llllllllllllIlllllllIIIIlllIIllI);
                return new String(llllllllllllIlllllllIIIIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllllIIIIlllIIlII) {
                llllllllllllIlllllllIIIIlllIIlII.printStackTrace();
                return null;
            }
        }
        
        public ResourceLocation getMusicLocation() {
            return this.musicLocation;
        }
        
        public int getMaxDelay() {
            return this.maxDelay;
        }
        
        static {
            llllllllIIlIllI();
            llllllllIIlIlIl();
            final MusicType[] enum$VALUES = new MusicType[MusicType.lIllIllIIlllll[13]];
            enum$VALUES[MusicType.lIllIllIIlllll[0]] = MusicType.MENU;
            enum$VALUES[MusicType.lIllIllIIlllll[1]] = MusicType.GAME;
            enum$VALUES[MusicType.lIllIllIIlllll[4]] = MusicType.CREATIVE;
            enum$VALUES[MusicType.lIllIllIIlllll[5]] = MusicType.CREDITS;
            enum$VALUES[MusicType.lIllIllIIlllll[8]] = MusicType.NETHER;
            enum$VALUES[MusicType.lIllIllIIlllll[9]] = MusicType.END_BOSS;
            enum$VALUES[MusicType.lIllIllIIlllll[12]] = MusicType.END;
            ENUM$VALUES = enum$VALUES;
        }
        
        private MusicType(final String llllllllllllIlllllllIIIlIIIIllIl, final int llllllllllllIlllllllIIIlIIIIllII, final ResourceLocation llllllllllllIlllllllIIIlIIIIlIll, final int llllllllllllIlllllllIIIlIIIIlIlI, final int llllllllllllIlllllllIIIlIIIIllll) {
            this.musicLocation = llllllllllllIlllllllIIIlIIIIlIll;
            this.minDelay = llllllllllllIlllllllIIIlIIIIlIlI;
            this.maxDelay = llllllllllllIlllllllIIIlIIIIllll;
        }
        
        private static void llllllllIIlIlIl() {
            (lIllIllIIlllIl = new String[MusicType.lIllIllIIlllll[22]])[MusicType.lIllIllIIlllll[0]] = llllllllIIIlIll("bua086WnXPU=", "ozpff");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[1]] = llllllllIIIllII("rfOAXGWkkOXq4Y/7gNYOH6mjROAR5zgF", "DcSKo");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[4]] = llllllllIIIllII("q+4wp6zuWBY=", "jweru");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[5]] = llllllllIIIllIl("LxwUJCUwFBw1fC8ACSglbBIbLCM=", "BuzAF");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[8]] = llllllllIIIlIll("nQYpKfr4RsvV+vsqJViRQA==", "rIIBt");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[9]] = llllllllIIIllII("9AovXZfcFIrhfhmOaP+Ew7IPyxeebW7fNSPqXsyRpXo=", "aERtQ");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[12]] = llllllllIIIlIll("jpMPEoOd8L8=", "pAOSB");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[13]] = llllllllIIIllII("OMfgmwX0YO7p90LyUiqI0hDrEM2QIdu/frXCayxhZYXxHtduOwRrfw==", "hABhA");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[15]] = llllllllIIIllIl("LAoMEA4w", "bOXXK");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[16]] = llllllllIIIllII("j4NIsCHbWbcUHEZQADkyt1BJLOI8cFCGQbWmd1cNK9Y=", "yVXUt");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[17]] = llllllllIIIlIll("FVbiYhwaUlBzUdgwtfIWiw==", "FMBBs");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[18]] = llllllllIIIllII("DGCd63S6W2c7V2zo9Uma0VR+1dto6MbbHx4P2bDs/XU=", "IZmGH");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[19]] = llllllllIIIlIll("HOqmzoVh6RA=", "qwnls");
            MusicType.lIllIllIIlllIl[MusicType.lIllIllIIlllll[20]] = llllllllIIIlIll("clQkw4uaFhXqWzPzWErqsFxX810JztDwS4aCwmHBJiI=", "tEgqm");
        }
        
        public int getMinDelay() {
            return this.minDelay;
        }
        
        private static boolean llllllllIIlIlll(final int llllllllllllIlllllllIIIIllIIIIll, final int llllllllllllIlllllllIIIIllIIIIlI) {
            return llllllllllllIlllllllIIIIllIIIIll < llllllllllllIlllllllIIIIllIIIIlI;
        }
    }
}
