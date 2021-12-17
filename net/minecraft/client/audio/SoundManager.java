// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import paulscode.sound.Source;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;
import com.google.common.collect.Lists;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import java.util.Random;
import io.netty.util.internal.ThreadLocalRandom;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import paulscode.sound.SoundSystemLogger;
import java.net.MalformedURLException;
import net.minecraft.client.Minecraft;
import java.io.InputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URL;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import com.google.common.collect.Multimap;
import net.minecraft.client.settings.GameSettings;
import java.util.List;
import java.util.Map;

public class SoundManager
{
    private final /* synthetic */ SoundHandler sndHandler;
    private static final /* synthetic */ String[] llIlIlllIllllI;
    private final /* synthetic */ Map<String, ISound> playingSounds;
    private final /* synthetic */ Map<String, Integer> playingSoundsStopTime;
    private final /* synthetic */ Map<ISound, String> invPlayingSounds;
    private /* synthetic */ SoundSystemStarterThread sndSystem;
    private static final /* synthetic */ int[] llIlIlllIlllll;
    private final /* synthetic */ List<ITickableSound> tickableSounds;
    private final /* synthetic */ GameSettings options;
    private final /* synthetic */ Multimap<SoundCategory, String> categorySounds;
    private /* synthetic */ Map<ISound, SoundPoolEntry> playingSoundPoolEntries;
    private static final /* synthetic */ Marker LOG_MARKER;
    private final /* synthetic */ Map<ISound, Integer> delayedSounds;
    private /* synthetic */ boolean loaded;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ int playTime;
    
    public void stopAllSounds() {
        if (lIIlIlIllllIlIlI(this.loaded ? 1 : 0)) {
            final byte llllllllllllIllIlIIIllIlIllIllII = (byte)this.playingSounds.keySet().iterator();
            "".length();
            if (((0x7D ^ 0x75 ^ (0x98 ^ 0xAB)) & (85 + 22 - 18 + 160 ^ 90 + 74 - 97 + 127 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIlIlIllllIIllI(((Iterator)llllllllllllIllIlIIIllIlIllIllII).hasNext() ? 1 : 0)) {
                final String llllllllllllIllIlIIIllIlIllIllll = ((Iterator<String>)llllllllllllIllIlIIIllIlIllIllII).next();
                this.sndSystem.stop(llllllllllllIllIlIIIllIlIllIllll);
            }
            this.playingSounds.clear();
            this.delayedSounds.clear();
            this.tickableSounds.clear();
            this.categorySounds.clear();
            this.playingSoundPoolEntries.clear();
            this.playingSoundsStopTime.clear();
        }
    }
    
    static /* synthetic */ void access$1(final SoundManager llllllllllllIllIlIIIllIIlIlIlIIl, final SoundSystemStarterThread llllllllllllIllIlIIIllIIlIlIlIII) {
        llllllllllllIllIlIIIllIIlIlIlIIl.sndSystem = llllllllllllIllIlIIIllIIlIlIlIII;
    }
    
    private static URL getURLForSoundResource(final ResourceLocation llllllllllllIllIlIIIllIIlllIlIIl) {
        final String format = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[14]];
        final Object[] args = new Object[SoundManager.llIlIlllIlllll[3]];
        args[SoundManager.llIlIlllIlllll[0]] = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[15]];
        args[SoundManager.llIlIlllIlllll[1]] = llllllllllllIllIlIIIllIIlllIlIIl.getResourceDomain();
        args[SoundManager.llIlIlllIlllll[2]] = llllllllllllIllIlIIIllIIlllIlIIl.getResourcePath();
        final String llllllllllllIllIlIIIllIIlllIlIII = String.format(format, args);
        final URLStreamHandler llllllllllllIllIlIIIllIIlllIIlll = new URLStreamHandler() {
            @Override
            protected URLConnection openConnection(final URL lllllllllllllIIlIlIIIlllIllllIII) {
                return new URLConnection(lllllllllllllIIlIlIIIlllIllllIII) {
                    @Override
                    public void connect() throws IOException {
                    }
                    
                    @Override
                    public InputStream getInputStream() throws IOException {
                        return Minecraft.getMinecraft().getResourceManager().getResource(llllllllllllIllIlIIIllIIlllIlIIl).getInputStream();
                    }
                };
            }
        };
        try {
            return new URL(null, llllllllllllIllIlIIIllIIlllIlIII, llllllllllllIllIlIIIllIIlllIIlll);
        }
        catch (MalformedURLException llllllllllllIllIlIIIllIIlllIIllI) {
            throw new Error(SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[16]]);
        }
    }
    
    private synchronized void loadSoundSystem() {
        if (lIIlIlIllllIIllI(this.loaded ? 1 : 0)) {
            try {
                new Thread(new Runnable() {
                    private static final /* synthetic */ String[] lIIIlIllIlllII;
                    private static final /* synthetic */ int[] lIIIlIlllIIIII;
                    
                    private static void llIIIIIllllllII() {
                        (lIIIlIlllIIIII = new int[3])[0] = " ".length();
                        SoundManager$1.lIIIlIlllIIIII[1] = ((244 + 182 - 227 + 50 ^ 52 + 2 + 14 + 96) & (102 + 129 - 166 + 130 ^ 84 + 123 - 128 + 79 ^ -" ".length()));
                        SoundManager$1.lIIIlIlllIIIII[2] = "  ".length();
                    }
                    
                    private static void llIIIIIllllIlll() {
                        (lIIIlIllIlllII = new String[SoundManager$1.lIIIlIlllIIIII[0]])[SoundManager$1.lIIIlIlllIIIII[1]] = llIIIIIllllIllI("Lye/4UgWRrGa2AKV9IqKM+bFbwFguh2h", "gctXf");
                    }
                    
                    @Override
                    public void run() {
                        SoundSystemConfig.setLogger((SoundSystemLogger)new SoundSystemLogger() {
                            private static final /* synthetic */ String[] lIlllIIllIllll;
                            private static final /* synthetic */ int[] lIlllIIlllIIIl;
                            
                            static {
                                lIIIIIlIIIIllIll();
                                lIIIIIlIIIIlIlll();
                            }
                            
                            private static boolean lIIIIIlIIIIlllII(final int llllllllllllIlllllIIlIlllIlIlIIl) {
                                return llllllllllllIlllllIIlIlllIlIlIIl == 0;
                            }
                            
                            private static String lIIIIIlIIIIlIllI(final String llllllllllllIlllllIIlIlllIlIlllI, final String llllllllllllIlllllIIlIlllIlIllll) {
                                try {
                                    final SecretKeySpec llllllllllllIlllllIIlIlllIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIlIlllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                                    final Cipher llllllllllllIlllllIIlIlllIllIIlI = Cipher.getInstance("Blowfish");
                                    llllllllllllIlllllIIlIlllIllIIlI.init(SoundManager$1$1.lIlllIIlllIIIl[2], llllllllllllIlllllIIlIlllIllIIll);
                                    return new String(llllllllllllIlllllIIlIlllIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIlIlllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                                }
                                catch (Exception llllllllllllIlllllIIlIlllIllIIIl) {
                                    llllllllllllIlllllIIlIlllIllIIIl.printStackTrace();
                                    return null;
                                }
                            }
                            
                            private static void lIIIIIlIIIIlIlll() {
                                (lIlllIIllIllll = new String[SoundManager$1$1.lIlllIIlllIIIl[2]])[SoundManager$1$1.lIlllIIlllIIIl[0]] = lIIIIIlIIIIlIllI("QcHAr1UbvTfUDy+RoigxUPwAJ/VUu9Cm", "ESyWU");
                                SoundManager$1$1.lIlllIIllIllll[SoundManager$1$1.lIlllIIlllIIIl[1]] = lIIIIIlIIIIlIllI("jEKAgN74Y34=", "WXTft");
                            }
                            
                            private static void lIIIIIlIIIIllIll() {
                                (lIlllIIlllIIIl = new int[3])[0] = ((0xD ^ 0x59) & ~(0x6A ^ 0x3E));
                                SoundManager$1$1.lIlllIIlllIIIl[1] = " ".length();
                                SoundManager$1$1.lIlllIIlllIIIl[2] = "  ".length();
                            }
                            
                            public void importantMessage(final String llllllllllllIlllllIIlIllllIIIIlI, final int llllllllllllIlllllIIlIllllIIIIIl) {
                                if (lIIIIIlIIIIlllII(llllllllllllIlllllIIlIllllIIIIlI.isEmpty() ? 1 : 0)) {
                                    SoundManager.logger.warn(llllllllllllIlllllIIlIllllIIIIlI);
                                }
                            }
                            
                            public void errorMessage(final String llllllllllllIlllllIIlIlllIlllIIl, final String llllllllllllIlllllIIlIlllIlllIII, final int llllllllllllIlllllIIlIlllIlllIlI) {
                                if (lIIIIIlIIIIlllII(llllllllllllIlllllIIlIlllIlllIII.isEmpty() ? 1 : 0)) {
                                    SoundManager.logger.error(String.valueOf(new StringBuilder(SoundManager$1$1.lIlllIIllIllll[SoundManager$1$1.lIlllIIlllIIIl[0]]).append(llllllllllllIlllllIIlIlllIlllIIl).append(SoundManager$1$1.lIlllIIllIllll[SoundManager$1$1.lIlllIIlllIIIl[1]])));
                                    SoundManager.logger.error(llllllllllllIlllllIIlIlllIlllIII);
                                }
                            }
                            
                            public void message(final String llllllllllllIlllllIIlIllllIIIlll, final int llllllllllllIlllllIIlIllllIIIllI) {
                                if (lIIIIIlIIIIlllII(llllllllllllIlllllIIlIllllIIIlll.isEmpty() ? 1 : 0)) {
                                    SoundManager.logger.info(llllllllllllIlllllIIlIllllIIIlll);
                                }
                            }
                        });
                        final SoundManager this$0 = SoundManager.this;
                        final SoundManager this$2 = SoundManager.this;
                        this$2.getClass();
                        "".length();
                        SoundManager.access$1(this$0, new SoundSystemStarterThread((SoundSystemStarterThread)null));
                        SoundManager.access$2(SoundManager.this, (boolean)(SoundManager$1.lIIIlIlllIIIII[0] != 0));
                        SoundManager.this.sndSystem.setMasterVolume(SoundManager.this.options.getSoundLevel(SoundCategory.MASTER));
                        SoundManager.logger.info(SoundManager.LOG_MARKER, SoundManager$1.lIIIlIllIlllII[SoundManager$1.lIIIlIlllIIIII[1]]);
                    }
                    
                    private static String llIIIIIllllIllI(final String lllllllllllllIlIIIIlIlIIlllllllI, final String lllllllllllllIlIIIIlIlIIllllllIl) {
                        try {
                            final SecretKeySpec lllllllllllllIlIIIIlIlIlIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlIIllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                            final Cipher lllllllllllllIlIIIIlIlIlIIIIIIlI = Cipher.getInstance("Blowfish");
                            lllllllllllllIlIIIIlIlIlIIIIIIlI.init(SoundManager$1.lIIIlIlllIIIII[2], lllllllllllllIlIIIIlIlIlIIIIIIll);
                            return new String(lllllllllllllIlIIIIlIlIlIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlIIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception lllllllllllllIlIIIIlIlIlIIIIIIIl) {
                            lllllllllllllIlIIIIlIlIlIIIIIIIl.printStackTrace();
                            return null;
                        }
                    }
                    
                    static {
                        llIIIIIllllllII();
                        llIIIIIllllIlll();
                    }
                }, SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[3]]).start();
                "".length();
                if (((158 + 41 - 130 + 106 ^ 117 + 112 - 213 + 130) & (132 + 57 - 39 + 10 ^ 82 + 125 - 158 + 108 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            catch (RuntimeException llllllllllllIllIlIIIllIllIIlIIll) {
                SoundManager.logger.error(SoundManager.LOG_MARKER, SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[4]], (Throwable)llllllllllllIllIlIIIllIllIIlIIll);
                this.options.setSoundLevel(SoundCategory.MASTER, 0.0f);
                this.options.saveOptions();
            }
        }
    }
    
    static {
        lIIlIlIllllIIlIl();
        lIIlIlIllllIIlII();
        LOG_MARKER = MarkerManager.getMarker(SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[0]]);
        logger = LogManager.getLogger();
    }
    
    public boolean isSoundPlaying(final ISound llllllllllllIllIlIIIllIlIlIIlIll) {
        if (lIIlIlIllllIIllI(this.loaded ? 1 : 0)) {
            return SoundManager.llIlIlllIlllll[0] != 0;
        }
        final String llllllllllllIllIlIIIllIlIlIIlIlI = this.invPlayingSounds.get(llllllllllllIllIlIIIllIlIlIIlIll);
        int n;
        if (lIIlIlIlllllIIII(llllllllllllIllIlIIIllIlIlIIlIlI)) {
            n = SoundManager.llIlIlllIlllll[0];
            "".length();
            if (" ".length() <= -" ".length()) {
                return ((0x7D ^ 0x30 ^ (0xDD ^ 0x9E)) & (0x59 ^ 0x60 ^ (0x10 ^ 0x27) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIlIlIllllIIllI(this.sndSystem.playing(llllllllllllIllIlIIIllIlIlIIlIlI) ? 1 : 0) && (!lIIlIlIllllIlIlI(this.playingSoundsStopTime.containsKey(llllllllllllIllIlIIIllIlIlIIlIlI) ? 1 : 0) || lIIlIlIlllllIIIl(this.playingSoundsStopTime.get(llllllllllllIllIlIIIllIlIlIIlIlI), this.playTime))) {
            n = SoundManager.llIlIlllIlllll[0];
            "".length();
            if (-" ".length() > -" ".length()) {
                return ((0x89 ^ 0x9E) & ~(0xD ^ 0x1A)) != 0x0;
            }
        }
        else {
            n = SoundManager.llIlIlllIlllll[1];
        }
        return n != 0;
    }
    
    static /* synthetic */ void access$2(final SoundManager llllllllllllIllIlIIIllIIlIlIIlIl, final boolean llllllllllllIllIlIIIllIIlIlIIlII) {
        llllllllllllIllIlIIIllIIlIlIIlIl.loaded = llllllllllllIllIlIIIllIIlIlIIlII;
    }
    
    private static boolean lIIlIlIllllIllll(final int llllllllllllIllIlIIIllIIIllIlIll, final int llllllllllllIllIlIIIllIIIllIlIlI) {
        return llllllllllllIllIlIIIllIIIllIlIll >= llllllllllllIllIlIIIllIIIllIlIlI;
    }
    
    private static boolean lIIlIlIllllIlllI(final int llllllllllllIllIlIIIllIIIlIIlIlI) {
        return llllllllllllIllIlIIIllIIIlIIlIlI > 0;
    }
    
    private static int lIIlIlIlllllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIlIlIllllIlIlI(final int llllllllllllIllIlIIIllIIIlIlIIII) {
        return llllllllllllIllIlIIIllIIIlIlIIII != 0;
    }
    
    public void unloadSoundSystem() {
        if (lIIlIlIllllIlIlI(this.loaded ? 1 : 0)) {
            this.stopAllSounds();
            this.sndSystem.cleanup();
            this.loaded = (SoundManager.llIlIlllIlllll[0] != 0);
        }
    }
    
    private static boolean lIIlIlIllllIIlll(final Object llllllllllllIllIlIIIllIIIlIllIII) {
        return llllllllllllIllIlIIIllIIIlIllIII != null;
    }
    
    public void pauseAllSounds() {
        final boolean llllllllllllIllIlIIIllIIllllllll = (boolean)this.playingSounds.keySet().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIlIllllIIllI(((Iterator)llllllllllllIllIlIIIllIIllllllll).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIlIIIllIlIIIIIIlI = ((Iterator<String>)llllllllllllIllIlIIIllIIllllllll).next();
            final Logger logger = SoundManager.logger;
            final Marker log_MARKER = SoundManager.LOG_MARKER;
            final String s = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[12]];
            final Object[] array = new Object[SoundManager.llIlIlllIlllll[1]];
            array[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIlIIIIIIlI;
            logger.debug(log_MARKER, s, array);
            this.sndSystem.pause(llllllllllllIllIlIIIllIlIIIIIIlI);
        }
    }
    
    public void resumeAllSounds() {
        final char llllllllllllIllIlIIIllIIllllIlll = (char)this.playingSounds.keySet().iterator();
        "".length();
        if (" ".length() >= (0xC4 ^ 0xC0)) {
            return;
        }
        while (!lIIlIlIllllIIllI(((Iterator)llllllllllllIllIlIIIllIIllllIlll).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIlIIIllIIlllllIlI = ((Iterator<String>)llllllllllllIllIlIIIllIIllllIlll).next();
            final Logger logger = SoundManager.logger;
            final Marker log_MARKER = SoundManager.LOG_MARKER;
            final String s = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[13]];
            final Object[] array = new Object[SoundManager.llIlIlllIlllll[1]];
            array[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIIlllllIlI;
            logger.debug(log_MARKER, s, array);
            this.sndSystem.play(llllllllllllIllIlIIIllIIlllllIlI);
        }
    }
    
    private static boolean lIIlIlIllllIllIl(final int llllllllllllIllIlIIIllIIIllIIIll, final int llllllllllllIllIlIIIllIIIllIIIlI) {
        return llllllllllllIllIlIIIllIIIllIIIll <= llllllllllllIllIlIIIllIIIllIIIlI;
    }
    
    private static void lIIlIlIllllIIlIl() {
        (llIlIlllIlllll = new int[18])[0] = ((0x2E ^ 0x74 ^ (0x4F ^ 0xF)) & (94 + 178 - 267 + 212 ^ 177 + 146 - 263 + 135 ^ -" ".length()));
        SoundManager.llIlIlllIlllll[1] = " ".length();
        SoundManager.llIlIlllIlllll[2] = "  ".length();
        SoundManager.llIlIlllIlllll[3] = "   ".length();
        SoundManager.llIlIlllIlllll[4] = (0x83 ^ 0x87);
        SoundManager.llIlIlllIlllll[5] = (0x19 ^ 0x1C);
        SoundManager.llIlIlllIlllll[6] = (44 + 192 - 170 + 129 ^ 96 + 16 - 110 + 195);
        SoundManager.llIlIlllIlllll[7] = (0xE8 ^ 0xAA ^ (0x43 ^ 0x6));
        SoundManager.llIlIlllIlllll[8] = (0x1A ^ 0x12);
        SoundManager.llIlIlllIlllll[9] = (0x5 ^ 0xC);
        SoundManager.llIlIlllIlllll[10] = (0x2E ^ 0xB ^ (0x2E ^ 0x1));
        SoundManager.llIlIlllIlllll[11] = (0x56 ^ 0x23 ^ (0x70 ^ 0x11));
        SoundManager.llIlIlllIlllll[12] = (131 + 52 - 111 + 89 ^ 7 + 49 + 19 + 95);
        SoundManager.llIlIlllIlllll[13] = (0x8 ^ 0x5D ^ (0x7F ^ 0x26));
        SoundManager.llIlIlllIlllll[14] = (13 + 137 - 141 + 145 ^ 94 + 149 - 124 + 32);
        SoundManager.llIlIlllIlllll[15] = (0xEC ^ 0x94 ^ (0xE2 ^ 0x94));
        SoundManager.llIlIlllIlllll[16] = (0x33 ^ 0x3C);
        SoundManager.llIlIlllIlllll[17] = (0x24 ^ 0x34);
    }
    
    private float getSoundCategoryVolume(final SoundCategory llllllllllllIllIlIIIllIllIIIllIl) {
        float soundLevel;
        if (lIIlIlIllllIIlll(llllllllllllIllIlIIIllIllIIIllIl) && lIIlIlIllllIlIII(llllllllllllIllIlIIIllIllIIIllIl, SoundCategory.MASTER)) {
            soundLevel = this.options.getSoundLevel(llllllllllllIllIlIIIllIllIIIllIl);
            "".length();
            if (-" ".length() < -" ".length()) {
                return 0.0f;
            }
        }
        else {
            soundLevel = 1.0f;
        }
        return soundLevel;
    }
    
    private float getNormalizedVolume(final ISound llllllllllllIllIlIIIllIlIIIIlIIl, final SoundPoolEntry llllllllllllIllIlIIIllIlIIIIlIII, final SoundCategory llllllllllllIllIlIIIllIlIIIIlIll) {
        return (float)MathHelper.clamp_double(llllllllllllIllIlIIIllIlIIIIlIIl.getVolume() * llllllllllllIllIlIIIllIlIIIIlIII.getVolume(), 0.0, 1.0) * this.getSoundCategoryVolume(llllllllllllIllIlIIIllIlIIIIlIll);
    }
    
    public void playSound(final ISound llllllllllllIllIlIIIllIlIIlIIlII) {
        if (lIIlIlIllllIlIlI(this.loaded ? 1 : 0)) {
            if (lIIlIlIllllIllII(lIIlIlIlllllIIlI(this.sndSystem.getMasterVolume(), 0.0f))) {
                final Logger logger = SoundManager.logger;
                final Marker log_MARKER = SoundManager.LOG_MARKER;
                final String s = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[6]];
                final Object[] array = new Object[SoundManager.llIlIlllIlllll[1]];
                array[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIlIIlIIlII.getSoundLocation();
                logger.debug(log_MARKER, s, array);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                final SoundEventAccessorComposite llllllllllllIllIlIIIllIlIIlIllll = this.sndHandler.getSound(llllllllllllIllIlIIIllIlIIlIIlII.getSoundLocation());
                if (lIIlIlIlllllIIII(llllllllllllIllIlIIIllIlIIlIllll)) {
                    final Logger logger2 = SoundManager.logger;
                    final Marker log_MARKER2 = SoundManager.LOG_MARKER;
                    final String s2 = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[7]];
                    final Object[] array2 = new Object[SoundManager.llIlIlllIlllll[1]];
                    array2[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIlIIlIIlII.getSoundLocation();
                    logger2.warn(log_MARKER2, s2, array2);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    final SoundPoolEntry llllllllllllIllIlIIIllIlIIlIlllI = llllllllllllIllIlIIIllIlIIlIllll.cloneEntry();
                    if (lIIlIlIllllIlIll(llllllllllllIllIlIIIllIlIIlIlllI, SoundHandler.missing_sound)) {
                        final Logger logger3 = SoundManager.logger;
                        final Marker log_MARKER3 = SoundManager.LOG_MARKER;
                        final String s3 = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[8]];
                        final Object[] array3 = new Object[SoundManager.llIlIlllIlllll[1]];
                        array3[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIlIIlIllll.getSoundEventLocation();
                        logger3.warn(log_MARKER3, s3, array3);
                        "".length();
                        if (-(0x41 ^ 0x45) > 0) {
                            return;
                        }
                    }
                    else {
                        final float llllllllllllIllIlIIIllIlIIlIllIl = llllllllllllIllIlIIIllIlIIlIIlII.getVolume();
                        float llllllllllllIllIlIIIllIlIIlIllII = 16.0f;
                        if (lIIlIlIllllIlllI(lIIlIlIlllllIIll(llllllllllllIllIlIIIllIlIIlIllIl, 1.0f))) {
                            llllllllllllIllIlIIIllIlIIlIllII *= llllllllllllIllIlIIIllIlIIlIllIl;
                        }
                        final SoundCategory llllllllllllIllIlIIIllIlIIlIlIll = llllllllllllIllIlIIIllIlIIlIllll.getSoundCategory();
                        final float llllllllllllIllIlIIIllIlIIlIlIlI = this.getNormalizedVolume(llllllllllllIllIlIIIllIlIIlIIlII, llllllllllllIllIlIIIllIlIIlIlllI, llllllllllllIllIlIIIllIlIIlIlIll);
                        final double llllllllllllIllIlIIIllIlIIlIlIIl = this.getNormalizedPitch(llllllllllllIllIlIIIllIlIIlIIlII, llllllllllllIllIlIIIllIlIIlIlllI);
                        final ResourceLocation llllllllllllIllIlIIIllIlIIlIlIII = llllllllllllIllIlIIIllIlIIlIlllI.getSoundPoolEntryLocation();
                        if (lIIlIlIllllIIllI(lIIlIlIlllllIIll(llllllllllllIllIlIIIllIlIIlIlIlI, 0.0f))) {
                            final Logger logger4 = SoundManager.logger;
                            final Marker log_MARKER4 = SoundManager.LOG_MARKER;
                            final String s4 = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[9]];
                            final Object[] array4 = new Object[SoundManager.llIlIlllIlllll[1]];
                            array4[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIlIIlIlIII;
                            logger4.debug(log_MARKER4, s4, array4);
                            "".length();
                            if (-"  ".length() > 0) {
                                return;
                            }
                        }
                        else {
                            int n;
                            if (lIIlIlIllllIlIlI(llllllllllllIllIlIIIllIlIIlIIlII.canRepeat() ? 1 : 0) && lIIlIlIllllIIllI(llllllllllllIllIlIIIllIlIIlIIlII.getRepeatDelay())) {
                                n = SoundManager.llIlIlllIlllll[1];
                                "".length();
                                if (((0x7C ^ 0x6E ^ (0x6B ^ 0x70)) & (0xFC ^ 0xC1 ^ (0x16 ^ 0x22) ^ -" ".length())) != 0x0) {
                                    return;
                                }
                            }
                            else {
                                n = SoundManager.llIlIlllIlllll[0];
                            }
                            final boolean llllllllllllIllIlIIIllIlIIlIIlll = n != 0;
                            final String llllllllllllIllIlIIIllIlIIlIIllI = MathHelper.getRandomUuid(ThreadLocalRandom.current()).toString();
                            if (lIIlIlIllllIlIlI(llllllllllllIllIlIIIllIlIIlIlllI.isStreamingSound() ? 1 : 0)) {
                                this.sndSystem.newStreamingSource((boolean)(SoundManager.llIlIlllIlllll[0] != 0), llllllllllllIllIlIIIllIlIIlIIllI, getURLForSoundResource(llllllllllllIllIlIIIllIlIIlIlIII), llllllllllllIllIlIIIllIlIIlIlIII.toString(), llllllllllllIllIlIIIllIlIIlIIlll, llllllllllllIllIlIIIllIlIIlIIlII.getXPosF(), llllllllllllIllIlIIIllIlIIlIIlII.getYPosF(), llllllllllllIllIlIIIllIlIIlIIlII.getZPosF(), llllllllllllIllIlIIIllIlIIlIIlII.getAttenuationType().getTypeInt(), llllllllllllIllIlIIIllIlIIlIllII);
                                "".length();
                                if (-" ".length() >= "   ".length()) {
                                    return;
                                }
                            }
                            else {
                                this.sndSystem.newSource((boolean)(SoundManager.llIlIlllIlllll[0] != 0), llllllllllllIllIlIIIllIlIIlIIllI, getURLForSoundResource(llllllllllllIllIlIIIllIlIIlIlIII), llllllllllllIllIlIIIllIlIIlIlIII.toString(), llllllllllllIllIlIIIllIlIIlIIlll, llllllllllllIllIlIIIllIlIIlIIlII.getXPosF(), llllllllllllIllIlIIIllIlIIlIIlII.getYPosF(), llllllllllllIllIlIIIllIlIIlIIlII.getZPosF(), llllllllllllIllIlIIIllIlIIlIIlII.getAttenuationType().getTypeInt(), llllllllllllIllIlIIIllIlIIlIllII);
                            }
                            final Logger logger5 = SoundManager.logger;
                            final Marker log_MARKER5 = SoundManager.LOG_MARKER;
                            final String s5 = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[10]];
                            final Object[] array5 = new Object[SoundManager.llIlIlllIlllll[3]];
                            array5[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIlIIlIlllI.getSoundPoolEntryLocation();
                            array5[SoundManager.llIlIlllIlllll[1]] = llllllllllllIllIlIIIllIlIIlIllll.getSoundEventLocation();
                            array5[SoundManager.llIlIlllIlllll[2]] = llllllllllllIllIlIIIllIlIIlIIllI;
                            logger5.debug(log_MARKER5, s5, array5);
                            this.sndSystem.setPitch(llllllllllllIllIlIIIllIlIIlIIllI, (float)llllllllllllIllIlIIIllIlIIlIlIIl);
                            this.sndSystem.setVolume(llllllllllllIllIlIIIllIlIIlIIllI, llllllllllllIllIlIIIllIlIIlIlIlI);
                            this.sndSystem.play(llllllllllllIllIlIIIllIlIIlIIllI);
                            this.playingSoundsStopTime.put(llllllllllllIllIlIIIllIlIIlIIllI, this.playTime + SoundManager.llIlIlllIlllll[11]);
                            "".length();
                            this.playingSounds.put(llllllllllllIllIlIIIllIlIIlIIllI, llllllllllllIllIlIIIllIlIIlIIlII);
                            "".length();
                            this.playingSoundPoolEntries.put(llllllllllllIllIlIIIllIlIIlIIlII, llllllllllllIllIlIIIllIlIIlIlllI);
                            "".length();
                            if (lIIlIlIllllIlIII(llllllllllllIllIlIIIllIlIIlIlIll, SoundCategory.MASTER)) {
                                this.categorySounds.put((Object)llllllllllllIllIlIIIllIlIIlIlIll, (Object)llllllllllllIllIlIIIllIlIIlIIllI);
                                "".length();
                            }
                            if (lIIlIlIllllIlIlI((llllllllllllIllIlIIIllIlIIlIIlII instanceof ITickableSound) ? 1 : 0)) {
                                this.tickableSounds.add((ITickableSound)llllllllllllIllIlIIIllIlIIlIIlII);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }
    
    private static String lIIlIlIllllIIIIl(final String llllllllllllIllIlIIIllIIlIIllIII, final String llllllllllllIllIlIIIllIIlIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIllIIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIllIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), SoundManager.llIlIlllIlllll[8]), "DES");
            final Cipher llllllllllllIllIlIIIllIIlIIllIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIIIllIIlIIllIlI.init(SoundManager.llIlIlllIlllll[2], llllllllllllIllIlIIIllIIlIIllIll);
            return new String(llllllllllllIllIlIIIllIIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIllIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIllIIlIIllIIl) {
            llllllllllllIllIlIIIllIIlIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private float getNormalizedPitch(final ISound llllllllllllIllIlIIIllIlIIIlIlII, final SoundPoolEntry llllllllllllIllIlIIIllIlIIIlIIll) {
        return (float)MathHelper.clamp_double(llllllllllllIllIlIIIllIlIIIlIlII.getPitch() * llllllllllllIllIlIIIllIlIIIlIIll.getPitch(), 0.5, 2.0);
    }
    
    public void setSoundCategoryVolume(final SoundCategory llllllllllllIllIlIIIllIllIIIIIlI, final float llllllllllllIllIlIIIllIllIIIIIIl) {
        if (lIIlIlIllllIlIlI(this.loaded ? 1 : 0)) {
            if (lIIlIlIllllIlIll(llllllllllllIllIlIIIllIllIIIIIlI, SoundCategory.MASTER)) {
                this.sndSystem.setMasterVolume(llllllllllllIllIlIIIllIllIIIIIIl);
                "".length();
                if ((0x3 ^ 0x1B ^ (0x43 ^ 0x5F)) <= "   ".length()) {
                    return;
                }
            }
            else {
                final long llllllllllllIllIlIIIllIlIllllIIl = (long)this.categorySounds.get((Object)llllllllllllIllIlIIIllIllIIIIIlI).iterator();
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                while (!lIIlIlIllllIIllI(((Iterator)llllllllllllIllIlIIIllIlIllllIIl).hasNext() ? 1 : 0)) {
                    final String llllllllllllIllIlIIIllIllIIIIIII = ((Iterator<String>)llllllllllllIllIlIIIllIlIllllIIl).next();
                    final ISound llllllllllllIllIlIIIllIlIlllllll = this.playingSounds.get(llllllllllllIllIlIIIllIllIIIIIII);
                    final float llllllllllllIllIlIIIllIlIllllllI = this.getNormalizedVolume(llllllllllllIllIlIIIllIlIlllllll, this.playingSoundPoolEntries.get(llllllllllllIllIlIIIllIlIlllllll), llllllllllllIllIlIIIllIllIIIIIlI);
                    if (lIIlIlIllllIllII(lIIlIlIllllIlIIl(llllllllllllIllIlIIIllIlIllllllI, 0.0f))) {
                        this.stopSound(llllllllllllIllIlIIIllIlIlllllll);
                        "".length();
                        if (-" ".length() > -" ".length()) {
                            return;
                        }
                        continue;
                    }
                    else {
                        this.sndSystem.setVolume(llllllllllllIllIlIIIllIllIIIIIII, llllllllllllIllIlIIIllIlIllllllI);
                    }
                }
            }
        }
    }
    
    public void setListener(final EntityPlayer llllllllllllIllIlIIIllIIllIIlllI, final float llllllllllllIllIlIIIllIIlIlllIll) {
        if (lIIlIlIllllIlIlI(this.loaded ? 1 : 0) && lIIlIlIllllIIlll(llllllllllllIllIlIIIllIIllIIlllI)) {
            final float llllllllllllIllIlIIIllIIllIIllII = llllllllllllIllIlIIIllIIllIIlllI.prevRotationPitch + (llllllllllllIllIlIIIllIIllIIlllI.rotationPitch - llllllllllllIllIlIIIllIIllIIlllI.prevRotationPitch) * llllllllllllIllIlIIIllIIlIlllIll;
            final float llllllllllllIllIlIIIllIIllIIlIll = llllllllllllIllIlIIIllIIllIIlllI.prevRotationYaw + (llllllllllllIllIlIIIllIIllIIlllI.rotationYaw - llllllllllllIllIlIIIllIIllIIlllI.prevRotationYaw) * llllllllllllIllIlIIIllIIlIlllIll;
            final double llllllllllllIllIlIIIllIIllIIlIlI = llllllllllllIllIlIIIllIIllIIlllI.prevPosX + (llllllllllllIllIlIIIllIIllIIlllI.posX - llllllllllllIllIlIIIllIIllIIlllI.prevPosX) * llllllllllllIllIlIIIllIIlIlllIll;
            final double llllllllllllIllIlIIIllIIllIIlIIl = llllllllllllIllIlIIIllIIllIIlllI.prevPosY + (llllllllllllIllIlIIIllIIllIIlllI.posY - llllllllllllIllIlIIIllIIllIIlllI.prevPosY) * llllllllllllIllIlIIIllIIlIlllIll + llllllllllllIllIlIIIllIIllIIlllI.getEyeHeight();
            final double llllllllllllIllIlIIIllIIllIIlIII = llllllllllllIllIlIIIllIIllIIlllI.prevPosZ + (llllllllllllIllIlIIIllIIllIIlllI.posZ - llllllllllllIllIlIIIllIIllIIlllI.prevPosZ) * llllllllllllIllIlIIIllIIlIlllIll;
            final float llllllllllllIllIlIIIllIIllIIIlll = MathHelper.cos((llllllllllllIllIlIIIllIIllIIlIll + 90.0f) * 0.017453292f);
            final float llllllllllllIllIlIIIllIIllIIIllI = MathHelper.sin((llllllllllllIllIlIIIllIIllIIlIll + 90.0f) * 0.017453292f);
            final float llllllllllllIllIlIIIllIIllIIIlIl = MathHelper.cos(-llllllllllllIllIlIIIllIIllIIllII * 0.017453292f);
            final float llllllllllllIllIlIIIllIIllIIIlII = MathHelper.sin(-llllllllllllIllIlIIIllIIllIIllII * 0.017453292f);
            final float llllllllllllIllIlIIIllIIllIIIIll = MathHelper.cos((-llllllllllllIllIlIIIllIIllIIllII + 90.0f) * 0.017453292f);
            final float llllllllllllIllIlIIIllIIllIIIIlI = MathHelper.sin((-llllllllllllIllIlIIIllIIllIIllII + 90.0f) * 0.017453292f);
            final float llllllllllllIllIlIIIllIIllIIIIIl = llllllllllllIllIlIIIllIIllIIIlll * llllllllllllIllIlIIIllIIllIIIlIl;
            final float llllllllllllIllIlIIIllIIllIIIIII = llllllllllllIllIlIIIllIIllIIIllI * llllllllllllIllIlIIIllIIllIIIlIl;
            final float llllllllllllIllIlIIIllIIlIllllll = llllllllllllIllIlIIIllIIllIIIlll * llllllllllllIllIlIIIllIIllIIIIll;
            final float llllllllllllIllIlIIIllIIlIlllllI = llllllllllllIllIlIIIllIIllIIIllI * llllllllllllIllIlIIIllIIllIIIIll;
            this.sndSystem.setListenerPosition((float)llllllllllllIllIlIIIllIIllIIlIlI, (float)llllllllllllIllIlIIIllIIllIIlIIl, (float)llllllllllllIllIlIIIllIIllIIlIII);
            this.sndSystem.setListenerOrientation(llllllllllllIllIlIIIllIIllIIIIIl, llllllllllllIllIlIIIllIIllIIIlII, llllllllllllIllIlIIIllIIllIIIIII, llllllllllllIllIlIIIllIIlIllllll, llllllllllllIllIlIIIllIIllIIIIlI, llllllllllllIllIlIIIllIIlIlllllI);
        }
    }
    
    private static void lIIlIlIllllIIlII() {
        (llIlIlllIllllI = new String[SoundManager.llIlIlllIlllll[17]])[SoundManager.llIlIlllIlllll[0]] = lIIlIlIllllIIIIl("QLUrI7zON+s=", "lcPYL");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[1]] = lIIlIlIllllIIIIl("1CzcL9H/AtI=", "UTxZV");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[2]] = lIIlIlIllllIIIlI("Gp4hACeVQljdkLSNal8okAXJujhHLPIQvcl/HERSTH2ewdpWjyb50J6tn7RW7iy2", "HRewp");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[3]] = lIIlIlIllllIIIll("EAAZOgZjIwU2ECIdFXQuLA4IMRA=", "ColTb");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[4]] = lIIlIlIllllIIIll("Hx03AR56HDEPHi4GKwlMCQAwAAgJFjYaCTdBZToZKAEsAAt6ACMITCkAMAAIKU9jTgEvHCwN", "ZoEnl");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[5]] = lIIlIlIllllIIIIl("wu+Rufx+lO4Iw9IJXDzoOdCjucvl0ysNu8q1V5dZR43Vf4RJ4JBSrWOOI0h6qfSx/5dVjtkij6I=", "HmerU");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[6]] = lIIlIlIllllIIIll("Ax07JAg1EnIkFDEPOzofcAU9IRY0MyQxFiRMci8FfFY/NQskEyB0Dj8aJzkdcAEzJ1gqEyA7", "PvRTx");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[7]] = lIIlIlIllllIIIll("LB8VCRQcUQAEWAkdFRJYDB8fBRcOH1QYFwwfEC4OHB8AUVgCDA==", "yqtkx");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[8]] = lIIlIlIllllIIIll("PiASMigObgc/ZBsiEilkDiMDJD1LPRwlKg8LBTUqH3RTKzk=", "kNsPD");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[9]] = lIIlIlIllllIIIlI("APd6mc2XPW5EfrJDjpo8JgBToDw4E5zYXm5ZH3BPNPV/UcPmPXmWXZ/BSqu4lnhx", "cNdZE");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[10]] = lIIlIlIllllIIIlI("qM6Vkhd3unwcCiS2W5QsgwlIIiotquUyPfl5Hrn/LnpJJVc8YGFhmdwSufadf/cC", "UlqBT");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[12]] = lIIlIlIllllIIIIl("1brzJTd5FUk33S6IvtT1NQnUkoaOGtan", "VLLwc");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[13]] = lIIlIlIllllIIIIl("GemXudyatjkoCxSIJo79gUE8U7+PNZKC", "UhyIg");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[14]] = lIIlIlIllllIIIIl("jWBV+TDnre3kjRcoy3r+Ww==", "rdUCg");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[15]] = lIIlIlIllllIIIIl("2Dyo2cC1D7qHu3WdUzLOXQ==", "mSNOI");
        SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[16]] = lIIlIlIllllIIIlI("qo2uVx5K4Ho2KVTkSqIKGNt/hJWI5Q8pKeUUVzFu4tMfRUG7uRpJqg==", "FsWxJ");
    }
    
    private static boolean lIIlIlIllllIllII(final int llllllllllllIllIlIIIllIIIlIIllII) {
        return llllllllllllIllIlIIIllIIIlIIllII <= 0;
    }
    
    private static int lIIlIlIllllIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIlIlIlllllIIII(final Object llllllllllllIllIlIIIllIIIlIlIIlI) {
        return llllllllllllIllIlIIIllIIIlIlIIlI == null;
    }
    
    public void updateAllSounds() {
        this.playTime += SoundManager.llIlIlllIlllll[1];
        final Iterator<ITickableSound> iterator = this.tickableSounds.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIlIllllIIllI(iterator.hasNext() ? 1 : 0)) {
            final ITickableSound llllllllllllIllIlIIIllIlIllIIIlI = iterator.next();
            llllllllllllIllIlIIIllIlIllIIIlI.update();
            if (lIIlIlIllllIlIlI(llllllllllllIllIlIIIllIlIllIIIlI.isDonePlaying() ? 1 : 0)) {
                this.stopSound(llllllllllllIllIlIIIllIlIllIIIlI);
                "".length();
                if ((0x18 ^ 0x1C) == ((0xC1 ^ 0x9A) & ~(0x21 ^ 0x7A))) {
                    return;
                }
                continue;
            }
            else {
                final String llllllllllllIllIlIIIllIlIllIIIIl = this.invPlayingSounds.get(llllllllllllIllIlIIIllIlIllIIIlI);
                this.sndSystem.setVolume(llllllllllllIllIlIIIllIlIllIIIIl, this.getNormalizedVolume(llllllllllllIllIlIIIllIlIllIIIlI, this.playingSoundPoolEntries.get(llllllllllllIllIlIIIllIlIllIIIlI), this.sndHandler.getSound(llllllllllllIllIlIIIllIlIllIIIlI.getSoundLocation()).getSoundCategory()));
                this.sndSystem.setPitch(llllllllllllIllIlIIIllIlIllIIIIl, this.getNormalizedPitch(llllllllllllIllIlIIIllIlIllIIIlI, this.playingSoundPoolEntries.get(llllllllllllIllIlIIIllIlIllIIIlI)));
                this.sndSystem.setPosition(llllllllllllIllIlIIIllIlIllIIIIl, llllllllllllIllIlIIIllIlIllIIIlI.getXPosF(), llllllllllllIllIlIIIllIlIllIIIlI.getYPosF(), llllllllllllIllIlIIIllIlIllIIIlI.getZPosF());
            }
        }
        final Iterator<Map.Entry<String, ISound>> llllllllllllIllIlIIIllIlIllIIIII = this.playingSounds.entrySet().iterator();
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIIlIlIllllIIllI(llllllllllllIllIlIIIllIlIllIIIII.hasNext() ? 1 : 0)) {
            final Map.Entry<String, ISound> llllllllllllIllIlIIIllIlIlIlllll = llllllllllllIllIlIIIllIlIllIIIII.next();
            final String llllllllllllIllIlIIIllIlIlIllllI = llllllllllllIllIlIIIllIlIlIlllll.getKey();
            final ISound llllllllllllIllIlIIIllIlIlIlllIl = llllllllllllIllIlIIIllIlIlIlllll.getValue();
            if (lIIlIlIllllIIllI(this.sndSystem.playing(llllllllllllIllIlIIIllIlIlIllllI) ? 1 : 0)) {
                final int llllllllllllIllIlIIIllIlIlIlllII = this.playingSoundsStopTime.get(llllllllllllIllIlIIIllIlIlIllllI);
                if (!lIIlIlIllllIllIl(llllllllllllIllIlIIIllIlIlIlllII, this.playTime)) {
                    continue;
                }
                final int llllllllllllIllIlIIIllIlIlIllIll = llllllllllllIllIlIIIllIlIlIlllIl.getRepeatDelay();
                if (lIIlIlIllllIlIlI(llllllllllllIllIlIIIllIlIlIlllIl.canRepeat() ? 1 : 0) && lIIlIlIllllIlllI(llllllllllllIllIlIIIllIlIlIllIll)) {
                    this.delayedSounds.put(llllllllllllIllIlIIIllIlIlIlllIl, this.playTime + llllllllllllIllIlIIIllIlIlIllIll);
                    "".length();
                }
                llllllllllllIllIlIIIllIlIllIIIII.remove();
                final Logger logger = SoundManager.logger;
                final Marker log_MARKER = SoundManager.LOG_MARKER;
                final String s = SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[5]];
                final Object[] array = new Object[SoundManager.llIlIlllIlllll[1]];
                array[SoundManager.llIlIlllIlllll[0]] = llllllllllllIllIlIIIllIlIlIllllI;
                logger.debug(log_MARKER, s, array);
                this.sndSystem.removeSource(llllllllllllIllIlIIIllIlIlIllllI);
                this.playingSoundsStopTime.remove(llllllllllllIllIlIIIllIlIlIllllI);
                "".length();
                this.playingSoundPoolEntries.remove(llllllllllllIllIlIIIllIlIlIlllIl);
                "".length();
                try {
                    this.categorySounds.remove((Object)this.sndHandler.getSound(llllllllllllIllIlIIIllIlIlIlllIl.getSoundLocation()).getSoundCategory(), (Object)llllllllllllIllIlIIIllIlIlIllllI);
                    "".length();
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return;
                    }
                }
                catch (RuntimeException ex) {}
                if (!lIIlIlIllllIlIlI((llllllllllllIllIlIIIllIlIlIlllIl instanceof ITickableSound) ? 1 : 0)) {
                    continue;
                }
                this.tickableSounds.remove(llllllllllllIllIlIIIllIlIlIlllIl);
                "".length();
            }
        }
        final Iterator<Map.Entry<ISound, Integer>> llllllllllllIllIlIIIllIlIlIllIlI = this.delayedSounds.entrySet().iterator();
        "".length();
        if (((0x3F ^ 0x1D ^ (0xA6 ^ 0xC4)) & (86 + 70 - 32 + 9 ^ 52 + 149 - 178 + 174 ^ -" ".length()) & (((0x5A ^ 0x56 ^ (0x66 ^ 0x4D)) & (0x24 ^ 0x2B ^ (0xB1 ^ 0x99) ^ -" ".length())) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIlIlIllllIIllI(llllllllllllIllIlIIIllIlIlIllIlI.hasNext() ? 1 : 0)) {
            final Map.Entry<ISound, Integer> llllllllllllIllIlIIIllIlIlIllIIl = llllllllllllIllIlIIIllIlIlIllIlI.next();
            if (lIIlIlIllllIllll(this.playTime, llllllllllllIllIlIIIllIlIlIllIIl.getValue())) {
                final ISound llllllllllllIllIlIIIllIlIlIllIII = llllllllllllIllIlIIIllIlIlIllIIl.getKey();
                if (lIIlIlIllllIlIlI((llllllllllllIllIlIIIllIlIlIllIII instanceof ITickableSound) ? 1 : 0)) {
                    ((ITickableSound)llllllllllllIllIlIIIllIlIlIllIII).update();
                }
                this.playSound(llllllllllllIllIlIIIllIlIlIllIII);
                llllllllllllIllIlIIIllIlIlIllIlI.remove();
            }
        }
    }
    
    private static String lIIlIlIllllIIIll(String llllllllllllIllIlIIIllIIIlllIllI, final String llllllllllllIllIlIIIllIIIllllIlI) {
        llllllllllllIllIlIIIllIIIlllIllI = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIllIIIlllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIllIIIllllIIl = new StringBuilder();
        final char[] llllllllllllIllIlIIIllIIIllllIII = llllllllllllIllIlIIIllIIIllllIlI.toCharArray();
        int llllllllllllIllIlIIIllIIIlllIlll = SoundManager.llIlIlllIlllll[0];
        final float llllllllllllIllIlIIIllIIIlllIIIl = (Object)((String)llllllllllllIllIlIIIllIIIlllIllI).toCharArray();
        final String llllllllllllIllIlIIIllIIIlllIIII = (String)llllllllllllIllIlIIIllIIIlllIIIl.length;
        byte llllllllllllIllIlIIIllIIIllIllll = (byte)SoundManager.llIlIlllIlllll[0];
        while (lIIlIlIlllllIlII(llllllllllllIllIlIIIllIIIllIllll, (int)llllllllllllIllIlIIIllIIIlllIIII)) {
            final char llllllllllllIllIlIIIllIIIlllllII = llllllllllllIllIlIIIllIIIlllIIIl[llllllllllllIllIlIIIllIIIllIllll];
            llllllllllllIllIlIIIllIIIllllIIl.append((char)(llllllllllllIllIlIIIllIIIlllllII ^ llllllllllllIllIlIIIllIIIllllIII[llllllllllllIllIlIIIllIIIlllIlll % llllllllllllIllIlIIIllIIIllllIII.length]));
            "".length();
            ++llllllllllllIllIlIIIllIIIlllIlll;
            ++llllllllllllIllIlIIIllIIIllIllll;
            "".length();
            if (("  ".length() & ("  ".length() ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIllIIIllllIIl);
    }
    
    private static boolean lIIlIlIllllIIllI(final int llllllllllllIllIlIIIllIIIlIIlllI) {
        return llllllllllllIllIlIIIllIIIlIIlllI == 0;
    }
    
    private static boolean lIIlIlIlllllIIIl(final int llllllllllllIllIlIIIllIIIlIlllll, final int llllllllllllIllIlIIIllIIIlIllllI) {
        return llllllllllllIllIlIIIllIIIlIlllll > llllllllllllIllIlIIIllIIIlIllllI;
    }
    
    public SoundManager(final SoundHandler llllllllllllIllIlIIIllIllIlIIIII, final GameSettings llllllllllllIllIlIIIllIllIIlllll) {
        this.playTime = SoundManager.llIlIlllIlllll[0];
        this.playingSounds = (Map<String, ISound>)HashBiMap.create();
        this.invPlayingSounds = (Map<ISound, String>)((BiMap)this.playingSounds).inverse();
        this.playingSoundPoolEntries = (Map<ISound, SoundPoolEntry>)Maps.newHashMap();
        this.categorySounds = (Multimap<SoundCategory, String>)HashMultimap.create();
        this.tickableSounds = (List<ITickableSound>)Lists.newArrayList();
        this.delayedSounds = (Map<ISound, Integer>)Maps.newHashMap();
        this.playingSoundsStopTime = (Map<String, Integer>)Maps.newHashMap();
        this.sndHandler = llllllllllllIllIlIIIllIllIlIIIII;
        this.options = llllllllllllIllIlIIIllIllIIlllll;
        try {
            SoundSystemConfig.addLibrary((Class)LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec(SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[1]], (Class)CodecJOrbis.class);
            "".length();
            if (((0x3E ^ 0x68) & ~(0xD ^ 0x5B)) != 0x0) {
                throw null;
            }
        }
        catch (SoundSystemException llllllllllllIllIlIIIllIllIIllllI) {
            SoundManager.logger.error(SoundManager.LOG_MARKER, SoundManager.llIlIlllIllllI[SoundManager.llIlIlllIlllll[2]], (Throwable)llllllllllllIllIlIIIllIllIIllllI);
        }
    }
    
    private static boolean lIIlIlIlllllIlII(final int llllllllllllIllIlIIIllIIIllIIlll, final int llllllllllllIllIlIIIllIIIllIIllI) {
        return llllllllllllIllIlIIIllIIIllIIlll < llllllllllllIllIlIIIllIIIllIIllI;
    }
    
    public void reloadSoundSystem() {
        this.unloadSoundSystem();
        this.loadSoundSystem();
    }
    
    private static String lIIlIlIllllIIIlI(final String llllllllllllIllIlIIIllIIlIIIlIll, final String llllllllllllIllIlIIIllIIlIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIllIIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIllIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIllIIlIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIllIIlIIIllIl.init(SoundManager.llIlIlllIlllll[2], llllllllllllIllIlIIIllIIlIIIlllI);
            return new String(llllllllllllIllIlIIIllIIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIllIIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIllIIlIIIllII) {
            llllllllllllIllIlIIIllIIlIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIllllIlIII(final Object llllllllllllIllIlIIIllIIIlIllIll, final Object llllllllllllIllIlIIIllIIIlIllIlI) {
        return llllllllllllIllIlIIIllIIIlIllIll != llllllllllllIllIlIIIllIIIlIllIlI;
    }
    
    private static int lIIlIlIlllllIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void playDelayedSound(final ISound llllllllllllIllIlIIIllIIlllIllll, final int llllllllllllIllIlIIIllIIlllIlllI) {
        this.delayedSounds.put(llllllllllllIllIlIIIllIIlllIllll, this.playTime + llllllllllllIllIlIIIllIIlllIlllI);
        "".length();
    }
    
    public void stopSound(final ISound llllllllllllIllIlIIIllIlIIllllll) {
        if (lIIlIlIllllIlIlI(this.loaded ? 1 : 0)) {
            final String llllllllllllIllIlIIIllIlIlIIIIIl = this.invPlayingSounds.get(llllllllllllIllIlIIIllIlIIllllll);
            if (lIIlIlIllllIIlll(llllllllllllIllIlIIIllIlIlIIIIIl)) {
                this.sndSystem.stop(llllllllllllIllIlIIIllIlIlIIIIIl);
            }
        }
    }
    
    private static boolean lIIlIlIllllIlIll(final Object llllllllllllIllIlIIIllIIIlIlIlIl, final Object llllllllllllIllIlIIIllIIIlIlIlII) {
        return llllllllllllIllIlIIIllIIIlIlIlIl == llllllllllllIllIlIIIllIIIlIlIlII;
    }
    
    class SoundSystemStarterThread extends SoundSystem
    {
        private static final /* synthetic */ int[] llIIIIIllllllI;
        
        private SoundSystemStarterThread() {
        }
        
        public boolean playing(final String llllllllllllIlllIlllIlIIllIlIlII) {
            synchronized (SoundSystemConfig.THREAD_SYNC) {
                if (lIIIIllllIIIIllI(this.soundLibrary)) {
                    // monitorexit(SoundSystemConfig.THREAD_SYNC)
                    return SoundSystemStarterThread.llIIIIIllllllI[0] != 0;
                }
                final Source llllllllllllIlllIlllIlIIllIlIIll = this.soundLibrary.getSources().get(llllllllllllIlllIlllIlIIllIlIlII);
                int n;
                if (lIIIIllllIIIIllI(llllllllllllIlllIlllIlIIllIlIIll)) {
                    n = SoundSystemStarterThread.llIIIIIllllllI[0];
                    "".length();
                    if ("  ".length() == ((0x14 ^ 0x25 ^ (0x8F ^ 0x92)) & (0xB8 ^ 0x95 ^ " ".length() ^ -" ".length()))) {
                        return ((0xF8 ^ 0xA2 ^ (0xC5 ^ 0x83)) & (82 + 112 - 71 + 12 ^ 31 + 87 - 72 + 109 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIIllllIIIIlll(llllllllllllIlllIlllIlIIllIlIIll.playing() ? 1 : 0) && lIIIIllllIIIIlll(llllllllllllIlllIlllIlIIllIlIIll.paused() ? 1 : 0) && lIIIIllllIIIIlll(llllllllllllIlllIlllIlIIllIlIIll.preLoad ? 1 : 0)) {
                    n = SoundSystemStarterThread.llIIIIIllllllI[0];
                    "".length();
                    if (null != null) {
                        return ("   ".length() & ~"   ".length()) != 0x0;
                    }
                }
                else {
                    n = SoundSystemStarterThread.llIIIIIllllllI[1];
                }
                // monitorexit(SoundSystemConfig.THREAD_SYNC)
                return n != 0;
            }
        }
        
        private static boolean lIIIIllllIIIIlll(final int llllllllllllIlllIlllIlIIllIIIlll) {
            return llllllllllllIlllIlllIlIIllIIIlll == 0;
        }
        
        private static boolean lIIIIllllIIIIllI(final Object llllllllllllIlllIlllIlIIllIIlIIl) {
            return llllllllllllIlllIlllIlIIllIIlIIl == null;
        }
        
        private static void lIIIIllllIIIIlIl() {
            (llIIIIIllllllI = new int[2])[0] = ((0x25 ^ 0x6E ^ (0x90 ^ 0x89)) & (0x7B ^ 0x4F ^ (0x5C ^ 0x3A) ^ -" ".length()));
            SoundSystemStarterThread.llIIIIIllllllI[1] = " ".length();
        }
        
        static {
            lIIIIllllIIIIlIl();
        }
    }
}
