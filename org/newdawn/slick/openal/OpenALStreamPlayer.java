// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.util.ResourceLoader;
import org.lwjgl.openal.OpenALException;
import org.lwjgl.openal.AL10;
import java.io.IOException;
import org.newdawn.slick.util.Log;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class OpenALStreamPlayer
{
    private /* synthetic */ byte[] buffer;
    private /* synthetic */ int remainingBufferCount;
    private static final /* synthetic */ int[] lIIIIIIllIIIlI;
    private /* synthetic */ float positionOffset;
    private /* synthetic */ boolean loop;
    private /* synthetic */ float pitch;
    private /* synthetic */ IntBuffer bufferNames;
    private /* synthetic */ int source;
    private static final /* synthetic */ String[] lIIIIIIllIIIII;
    private /* synthetic */ String ref;
    private /* synthetic */ boolean done;
    private /* synthetic */ ByteBuffer bufferData;
    private /* synthetic */ URL url;
    private /* synthetic */ IntBuffer unqueued;
    private /* synthetic */ AudioInputStream audio;
    
    private static boolean lIllIlIIlIIIIIl(final Object lllllllllllllIlIlIIIIIllIIlllIIl) {
        return lllllllllllllIlIlIIIIIllIIlllIIl == null;
    }
    
    public boolean setPosition(final float lllllllllllllIlIlIIIIIllIlllIlll) {
        try {
            if (lIllIlIIlIIIIlI(lIllIlIIlIIIlll(this.getPosition(), lllllllllllllIlIlIIIIIllIlllIlll))) {
                this.initStreams();
            }
            final float lllllllllllllIlIlIIIIIllIlllllIl = (float)this.audio.getRate();
            float lllllllllllllIlIlIIIIIllIlllllII;
            if (lIllIlIIlIIIlII(this.audio.getChannels(), OpenALStreamPlayer.lIIIIIIllIIIlI[1])) {
                final float lllllllllllllIlIlIIIIIlllIIIIIII = 4.0f;
                "".length();
                if (-"  ".length() > 0) {
                    return ((0xCB ^ 0x80) & ~(0xED ^ 0xA6)) != 0x0;
                }
            }
            else {
                lllllllllllllIlIlIIIIIllIlllllII = 2.0f;
            }
            while (lIllIlIIlIIlIIl(lIllIlIIlIIlIII(this.positionOffset, lllllllllllllIlIlIIIIIllIlllIlll))) {
                final int lllllllllllllIlIlIIIIIllIllllllI = this.audio.read(this.buffer);
                if (!lIllIlIIlIIIllI(lllllllllllllIlIlIIIIIllIllllllI, OpenALStreamPlayer.lIIIIIIllIIIlI[9])) {
                    if (lIllIlIIlIIIIll(this.loop ? 1 : 0)) {
                        this.initStreams();
                        "".length();
                        if ("  ".length() <= -" ".length()) {
                            return ((0xAD ^ 0x90) & ~(0x2A ^ 0x17)) != 0x0;
                        }
                    }
                    else {
                        this.done = (OpenALStreamPlayer.lIIIIIIllIIIlI[1] != 0);
                    }
                    return OpenALStreamPlayer.lIIIIIIllIIIlI[4] != 0;
                }
                final float lllllllllllllIlIlIIIIIllIlllllll = lllllllllllllIlIlIIIIIllIllllllI / lllllllllllllIlIlIIIIIllIlllllII / lllllllllllllIlIlIIIIIllIlllllIl;
                this.positionOffset += lllllllllllllIlIlIIIIIllIlllllll;
                "".length();
                if (" ".length() < -" ".length()) {
                    return ((74 + 98 + 31 + 40 ^ 51 + 55 + 38 + 3) & (0x77 ^ 0x32 ^ (0x44 ^ 0x61) ^ -" ".length())) != 0x0;
                }
                "".length();
                if (" ".length() < 0) {
                    return ((0x7F ^ 0x13 ^ (0xD2 ^ 0xB9)) & (0xB0 ^ 0x9D ^ (0x3B ^ 0x11) ^ -" ".length())) != 0x0;
                }
            }
            this.startPlayback();
            return OpenALStreamPlayer.lIIIIIIllIIIlI[1] != 0;
        }
        catch (IOException lllllllllllllIlIlIIIIIllIllllIll) {
            Log.error(lllllllllllllIlIlIIIIIllIllllIll);
            return OpenALStreamPlayer.lIIIIIIllIIIlI[4] != 0;
        }
    }
    
    public boolean stream(final int lllllllllllllIlIlIIIIIlllIIIllII) {
        try {
            final int lllllllllllllIlIlIIIIIlllIIIllll = this.audio.read(this.buffer);
            if (lIllIlIIlIIIllI(lllllllllllllIlIlIIIIIlllIIIllll, OpenALStreamPlayer.lIIIIIIllIIIlI[9])) {
                this.bufferData.clear();
                "".length();
                this.bufferData.put(this.buffer, OpenALStreamPlayer.lIIIIIIllIIIlI[4], lllllllllllllIlIlIIIIIlllIIIllll);
                "".length();
                this.bufferData.flip();
                "".length();
                int n;
                if (lIllIlIIlIIIlII(this.audio.getChannels(), OpenALStreamPlayer.lIIIIIIllIIIlI[1])) {
                    n = OpenALStreamPlayer.lIIIIIIllIIIlI[10];
                    "".length();
                    if (-(0xC2 ^ 0xC7) >= 0) {
                        return ((0xF ^ 0x57) & ~(0x63 ^ 0x3B)) != 0x0;
                    }
                }
                else {
                    n = OpenALStreamPlayer.lIIIIIIllIIIlI[11];
                }
                final int lllllllllllllIlIlIIIIIlllIIlIIII = n;
                try {
                    AL10.alBufferData(lllllllllllllIlIlIIIIIlllIIIllII, lllllllllllllIlIlIIIIIlllIIlIIII, this.bufferData, this.audio.getRate());
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return ((0x41 ^ 0x4F) & ~(0x7B ^ 0x75)) != 0x0;
                    }
                }
                catch (OpenALException lllllllllllllIlIlIIIIIlllIIlIIIl) {
                    Log.error(String.valueOf(new StringBuilder().append(OpenALStreamPlayer.lIIIIIIllIIIII[OpenALStreamPlayer.lIIIIIIllIIIlI[4]]).append(lllllllllllllIlIlIIIIIlllIIIllII).append(OpenALStreamPlayer.lIIIIIIllIIIII[OpenALStreamPlayer.lIIIIIIllIIIlI[1]]).append(lllllllllllllIlIlIIIIIlllIIlIIII).append(OpenALStreamPlayer.lIIIIIIllIIIII[OpenALStreamPlayer.lIIIIIIllIIIlI[12]]).append(lllllllllllllIlIlIIIIIlllIIIllll).append(OpenALStreamPlayer.lIIIIIIllIIIII[OpenALStreamPlayer.lIIIIIIllIIIlI[2]]).append(this.audio.getRate())), (Throwable)lllllllllllllIlIlIIIIIlllIIlIIIl);
                    return OpenALStreamPlayer.lIIIIIIllIIIlI[4] != 0;
                }
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return (" ".length() & ~" ".length()) != 0x0;
                }
            }
            else {
                if (!lIllIlIIlIIIIll(this.loop ? 1 : 0)) {
                    this.done = (OpenALStreamPlayer.lIIIIIIllIIIlI[1] != 0);
                    return OpenALStreamPlayer.lIIIIIIllIIIlI[4] != 0;
                }
                this.initStreams();
                this.stream(lllllllllllllIlIlIIIIIlllIIIllII);
                "".length();
                "".length();
                if ((0x82 ^ 0x87) <= 0) {
                    return ((0xBA ^ 0xAC) & ~(0x65 ^ 0x73)) != 0x0;
                }
            }
            return OpenALStreamPlayer.lIIIIIIllIIIlI[1] != 0;
        }
        catch (IOException lllllllllllllIlIlIIIIIlllIIIlllI) {
            Log.error(lllllllllllllIlIlIIIIIlllIIIlllI);
            return OpenALStreamPlayer.lIIIIIIllIIIlI[4] != 0;
        }
    }
    
    private static boolean lIllIlIIlIIlIlI(final int lllllllllllllIlIlIIIIIllIlIIIIlI, final int lllllllllllllIlIlIIIIIllIlIIIIIl) {
        return lllllllllllllIlIlIIIIIllIlIIIIlI < lllllllllllllIlIlIIIIIllIlIIIIIl;
    }
    
    public String getSource() {
        String s;
        if (lIllIlIIlIIIIIl(this.url)) {
            s = this.ref;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            s = this.url.toString();
        }
        return s;
    }
    
    private static void lIllIlIIIlllIll() {
        (lIIIIIIllIIIII = new String[OpenALStreamPlayer.lIIIIIIllIIIlI[16]])[OpenALStreamPlayer.lIIIIIIllIIIlI[4]] = lIllIlIIIlllIIl("FTghIwE3eTwgRD82Jz9EMSwuKQEhY2g=", "SYHOd");
        OpenALStreamPlayer.lIIIIIIllIIIII[OpenALStreamPlayer.lIIIIIIllIIIlI[1]] = lIllIlIIIlllIlI("KxhBOF8qKRM=", "pZLNP");
        OpenALStreamPlayer.lIIIIIIllIIIII[OpenALStreamPlayer.lIIIIIIllIIIlI[12]] = lIllIlIIIlllIIl("bQ==", "MLONF");
        OpenALStreamPlayer.lIIIIIIllIIIII[OpenALStreamPlayer.lIIIIIIllIIIlI[2]] = lIllIlIIIlllIlI("MoQikS+Ai58=", "oAFyU");
    }
    
    public boolean done() {
        return this.done;
    }
    
    private static boolean lIllIlIIlIIIIll(final int lllllllllllllIlIlIIIIIllIIllIlll) {
        return lllllllllllllIlIlIIIIIllIIllIlll != 0;
    }
    
    private static int lIllIlIIlIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void initStreams() throws IOException {
        if (lIllIlIIlIIIIII(this.audio)) {
            this.audio.close();
        }
        OggInputStream lllllllllllllIlIlIIIIIllllIIlIII = null;
        if (lIllIlIIlIIIIII(this.url)) {
            final OggInputStream lllllllllllllIlIlIIIIIllllIIlIlI = new OggInputStream(this.url.openStream());
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIlIlIIIIIllllIIlIII = new OggInputStream(ResourceLoader.getResourceAsStream(this.ref));
        }
        this.audio = lllllllllllllIlIlIIIIIllllIIlIII;
        this.positionOffset = 0.0f;
    }
    
    private void removeBuffers() {
        final IntBuffer lllllllllllllIlIlIIIIIlllIlllllI = BufferUtils.createIntBuffer(OpenALStreamPlayer.lIIIIIIllIIIlI[1]);
        int lllllllllllllIlIlIIIIIlllIllllIl = AL10.alGetSourcei(this.source, OpenALStreamPlayer.lIIIIIIllIIIlI[3]);
        while (lIllIlIIlIIIIlI(lllllllllllllIlIlIIIIIlllIllllIl)) {
            AL10.alSourceUnqueueBuffers(this.source, lllllllllllllIlIlIIIIIlllIlllllI);
            --lllllllllllllIlIlIIIIIlllIllllIl;
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
    }
    
    public void setup(final float lllllllllllllIlIlIIIIIlllIllIIII) {
        this.pitch = lllllllllllllIlIlIIIIIlllIllIIII;
    }
    
    private static String lIllIlIIIlllIIl(String lllllllllllllIlIlIIIIIllIlIllIlI, final String lllllllllllllIlIlIIIIIllIlIllIIl) {
        lllllllllllllIlIlIIIIIllIlIllIlI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIIIllIlIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIIllIlIlllIl = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIIllIlIlllII = lllllllllllllIlIlIIIIIllIlIllIIl.toCharArray();
        int lllllllllllllIlIlIIIIIllIlIllIll = OpenALStreamPlayer.lIIIIIIllIIIlI[4];
        final short lllllllllllllIlIlIIIIIllIlIlIlIl = (Object)((String)lllllllllllllIlIlIIIIIllIlIllIlI).toCharArray();
        final char lllllllllllllIlIlIIIIIllIlIlIlII = (char)lllllllllllllIlIlIIIIIllIlIlIlIl.length;
        byte lllllllllllllIlIlIIIIIllIlIlIIll = (byte)OpenALStreamPlayer.lIIIIIIllIIIlI[4];
        while (lIllIlIIlIIlIlI(lllllllllllllIlIlIIIIIllIlIlIIll, lllllllllllllIlIlIIIIIllIlIlIlII)) {
            final char lllllllllllllIlIlIIIIIllIllIIIII = lllllllllllllIlIlIIIIIllIlIlIlIl[lllllllllllllIlIlIIIIIllIlIlIIll];
            lllllllllllllIlIlIIIIIllIlIlllIl.append((char)(lllllllllllllIlIlIIIIIllIllIIIII ^ lllllllllllllIlIlIIIIIllIlIlllII[lllllllllllllIlIlIIIIIllIlIllIll % lllllllllllllIlIlIIIIIllIlIlllII.length]));
            "".length();
            ++lllllllllllllIlIlIIIIIllIlIllIll;
            ++lllllllllllllIlIlIIIIIllIlIlIIll;
            "".length();
            if (((0x23 ^ 0x4A ^ 82 + 95 - 64 + 14) & (0x14 ^ 0x75 ^ (0x14 ^ 0x63) ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIIllIlIlllIl);
    }
    
    private static String lIllIlIIIlllIlI(final String lllllllllllllIlIlIIIIIllIlIIlIlI, final String lllllllllllllIlIlIIIIIllIlIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIIllIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIIllIlIIIlll.getBytes(StandardCharsets.UTF_8)), OpenALStreamPlayer.lIIIIIIllIIIlI[17]), "DES");
            final Cipher lllllllllllllIlIlIIIIIllIlIIllII = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIIIllIlIIllII.init(OpenALStreamPlayer.lIIIIIIllIIIlI[12], lllllllllllllIlIlIIIIIllIlIIllIl);
            return new String(lllllllllllllIlIlIIIIIllIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIIllIlIIlIll) {
            lllllllllllllIlIlIIIIIllIlIIlIll.printStackTrace();
            return null;
        }
    }
    
    public void play(final boolean lllllllllllllIlIlIIIIIlllIllIllI) throws IOException {
        this.loop = lllllllllllllIlIlIIIIIlllIllIllI;
        this.initStreams();
        this.done = (OpenALStreamPlayer.lIIIIIIllIIIlI[4] != 0);
        AL10.alSourceStop(this.source);
        this.removeBuffers();
        this.startPlayback();
    }
    
    private static boolean lIllIlIIlIIIlII(final int lllllllllllllIlIlIIIIIllIIlllllI, final int lllllllllllllIlIlIIIIIllIIllllIl) {
        return lllllllllllllIlIlIIIIIllIIlllllI > lllllllllllllIlIlIIIIIllIIllllIl;
    }
    
    public float getPosition() {
        return this.positionOffset + AL10.alGetSourcef(this.source, OpenALStreamPlayer.lIIIIIIllIIIlI[15]);
    }
    
    private static boolean lIllIlIIlIIlIIl(final int lllllllllllllIlIlIIIIIllIIllIIll) {
        return lllllllllllllIlIlIIIIIllIIllIIll < 0;
    }
    
    public void update() {
        if (lIllIlIIlIIIIll(this.done ? 1 : 0)) {
            return;
        }
        final float lllllllllllllIlIlIIIIIlllIlIIIII = (float)this.audio.getRate();
        float lllllllllllllIlIlIIIIIlllIIlllll;
        if (lIllIlIIlIIIlII(this.audio.getChannels(), OpenALStreamPlayer.lIIIIIIllIIIlI[1])) {
            final float lllllllllllllIlIlIIIIIlllIlIIlII = 4.0f;
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            lllllllllllllIlIlIIIIIlllIIlllll = 2.0f;
        }
        int lllllllllllllIlIlIIIIIlllIIllllI = AL10.alGetSourcei(this.source, OpenALStreamPlayer.lIIIIIIllIIIlI[5]);
        while (lIllIlIIlIIIIlI(lllllllllllllIlIlIIIIIlllIIllllI)) {
            this.unqueued.clear();
            "".length();
            AL10.alSourceUnqueueBuffers(this.source, this.unqueued);
            final int lllllllllllllIlIlIIIIIlllIlIIIll = this.unqueued.get(OpenALStreamPlayer.lIIIIIIllIIIlI[4]);
            final float lllllllllllllIlIlIIIIIlllIlIIIlI = AL10.alGetBufferi(lllllllllllllIlIlIIIIIlllIlIIIll, OpenALStreamPlayer.lIIIIIIllIIIlI[6]) / lllllllllllllIlIlIIIIIlllIIlllll / lllllllllllllIlIlIIIIIlllIlIIIII;
            this.positionOffset += lllllllllllllIlIlIIIIIlllIlIIIlI;
            if (lIllIlIIlIIIIll(this.stream(lllllllllllllIlIlIIIIIlllIlIIIll) ? 1 : 0)) {
                AL10.alSourceQueueBuffers(this.source, this.unqueued);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.remainingBufferCount -= OpenALStreamPlayer.lIIIIIIllIIIlI[1];
                if (lIllIlIIlIIIlIl(this.remainingBufferCount)) {
                    this.done = (OpenALStreamPlayer.lIIIIIIllIIIlI[1] != 0);
                }
            }
            --lllllllllllllIlIlIIIIIlllIIllllI;
            "".length();
            if (-(0x5A ^ 0x6B ^ (0x20 ^ 0x14)) >= 0) {
                return;
            }
        }
        final int lllllllllllllIlIlIIIIIlllIIlllIl = AL10.alGetSourcei(this.source, OpenALStreamPlayer.lIIIIIIllIIIlI[7]);
        if (lIllIlIIlIIIllI(lllllllllllllIlIlIIIIIlllIIlllIl, OpenALStreamPlayer.lIIIIIIllIIIlI[8])) {
            AL10.alSourcePlay(this.source);
        }
    }
    
    public OpenALStreamPlayer(final int lllllllllllllIlIlIIIIIllllIllIlI, final String lllllllllllllIlIlIIIIIllllIllIIl) {
        this.buffer = new byte[OpenALStreamPlayer.lIIIIIIllIIIlI[0]];
        this.bufferData = BufferUtils.createByteBuffer(OpenALStreamPlayer.lIIIIIIllIIIlI[0]);
        this.unqueued = BufferUtils.createIntBuffer(OpenALStreamPlayer.lIIIIIIllIIIlI[1]);
        this.done = (OpenALStreamPlayer.lIIIIIIllIIIlI[1] != 0);
        this.source = lllllllllllllIlIlIIIIIllllIllIlI;
        this.ref = lllllllllllllIlIlIIIIIllllIllIIl;
        this.bufferNames = BufferUtils.createIntBuffer(OpenALStreamPlayer.lIIIIIIllIIIlI[2]);
        AL10.alGenBuffers(this.bufferNames);
    }
    
    private static boolean lIllIlIIlIIIIII(final Object lllllllllllllIlIlIIIIIllIIlllIll) {
        return lllllllllllllIlIlIIIIIllIIlllIll != null;
    }
    
    public OpenALStreamPlayer(final int lllllllllllllIlIlIIIIIllllIIlllI, final URL lllllllllllllIlIlIIIIIllllIlIIII) {
        this.buffer = new byte[OpenALStreamPlayer.lIIIIIIllIIIlI[0]];
        this.bufferData = BufferUtils.createByteBuffer(OpenALStreamPlayer.lIIIIIIllIIIlI[0]);
        this.unqueued = BufferUtils.createIntBuffer(OpenALStreamPlayer.lIIIIIIllIIIlI[1]);
        this.done = (OpenALStreamPlayer.lIIIIIIllIIIlI[1] != 0);
        this.source = lllllllllllllIlIlIIIIIllllIIlllI;
        this.url = lllllllllllllIlIlIIIIIllllIlIIII;
        this.bufferNames = BufferUtils.createIntBuffer(OpenALStreamPlayer.lIIIIIIllIIIlI[2]);
        AL10.alGenBuffers(this.bufferNames);
    }
    
    static {
        lIllIlIIIllllll();
        lIllIlIIIlllIll();
        BUFFER_COUNT = OpenALStreamPlayer.lIIIIIIllIIIlI[2];
        sectionSize = OpenALStreamPlayer.lIIIIIIllIIIlI[0];
    }
    
    private static boolean lIllIlIIlIIIIlI(final int lllllllllllllIlIlIIIIIllIIllIIIl) {
        return lllllllllllllIlIlIIIIIllIIllIIIl > 0;
    }
    
    private void startPlayback() {
        AL10.alSourcei(this.source, OpenALStreamPlayer.lIIIIIIllIIIlI[13], OpenALStreamPlayer.lIIIIIIllIIIlI[4]);
        AL10.alSourcef(this.source, OpenALStreamPlayer.lIIIIIIllIIIlI[14], this.pitch);
        this.remainingBufferCount = OpenALStreamPlayer.lIIIIIIllIIIlI[2];
        int lllllllllllllIlIlIIIIIllIlllIIII = OpenALStreamPlayer.lIIIIIIllIIIlI[4];
        while (lIllIlIIlIIlIlI(lllllllllllllIlIlIIIIIllIlllIIII, OpenALStreamPlayer.lIIIIIIllIIIlI[2])) {
            this.stream(this.bufferNames.get(lllllllllllllIlIlIIIIIllIlllIIII));
            "".length();
            ++lllllllllllllIlIlIIIIIllIlllIIII;
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        AL10.alSourceQueueBuffers(this.source, this.bufferNames);
        AL10.alSourcePlay(this.source);
    }
    
    private static void lIllIlIIIllllll() {
        (lIIIIIIllIIIlI = new int[18])[0] = (0xFFFFCC12 & 0x173ED);
        OpenALStreamPlayer.lIIIIIIllIIIlI[1] = " ".length();
        OpenALStreamPlayer.lIIIIIIllIIIlI[2] = "   ".length();
        OpenALStreamPlayer.lIIIIIIllIIIlI[3] = (0xFFFFBC37 & 0x53DD);
        OpenALStreamPlayer.lIIIIIIllIIIlI[4] = ((0x87 ^ 0xAB ^ (0x8C ^ 0x80)) & (0x7B ^ 0x46 ^ (0x89 ^ 0x94) ^ -" ".length()));
        OpenALStreamPlayer.lIIIIIIllIIIlI[5] = (-(0xFFFFCFFD & 0x3EEB) & (0xFFFFBFFF & 0x5EFE));
        OpenALStreamPlayer.lIIIIIIllIIIlI[6] = (-(0xFFFFDEFE & 0x3D53) & (0xFFFFFDDD & 0x3E77));
        OpenALStreamPlayer.lIIIIIIllIIIlI[7] = (-(102 + 142 - 197 + 116) & (0xFFFFB0FE & 0x5FB3));
        OpenALStreamPlayer.lIIIIIIllIIIlI[8] = (-(0xFFFF9DFE & 0x6AEF) & (0xFFFF9CFF & 0x7BFF));
        OpenALStreamPlayer.lIIIIIIllIIIlI[9] = -" ".length();
        OpenALStreamPlayer.lIIIIIIllIIIlI[10] = (0xFFFFD1F3 & 0x3F0F);
        OpenALStreamPlayer.lIIIIIIllIIIlI[11] = (-(0xFFFFAFA7 & 0x7AF9) & (0xFFFFBFB9 & 0x7BE7));
        OpenALStreamPlayer.lIIIIIIllIIIlI[12] = "  ".length();
        OpenALStreamPlayer.lIIIIIIllIIIlI[13] = (-(0xFFFFF6AB & 0x4FFD) & (0xFFFFD7FF & 0x7EAF));
        OpenALStreamPlayer.lIIIIIIllIIIlI[14] = (-(0xFFFFDFFF & 0x63FD) & (-1 & 0x53FF));
        OpenALStreamPlayer.lIIIIIIllIIIlI[15] = (-(0xFFFFBFD7 & 0x63F9) & (0xFFFFBBF6 & 0x77FD));
        OpenALStreamPlayer.lIIIIIIllIIIlI[16] = (104 + 125 - 153 + 55 ^ 5 + 13 - 0 + 117);
        OpenALStreamPlayer.lIIIIIIllIIIlI[17] = (0x43 ^ 0x13 ^ (0x6A ^ 0x32));
    }
    
    private static int lIllIlIIlIIlIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIllIlIIlIIIlIl(final int lllllllllllllIlIlIIIIIllIIllIlIl) {
        return lllllllllllllIlIlIIIIIllIIllIlIl == 0;
    }
    
    private static boolean lIllIlIIlIIIllI(final int lllllllllllllIlIlIIIIIllIIlIlllI, final int lllllllllllllIlIlIIIIIllIIlIllIl) {
        return lllllllllllllIlIlIIIIIllIIlIlllI != lllllllllllllIlIlIIIIIllIIlIllIl;
    }
}
