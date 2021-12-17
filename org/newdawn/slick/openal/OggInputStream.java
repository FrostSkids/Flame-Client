// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import org.lwjgl.BufferUtils;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.util.Log;
import com.jcraft.jogg.Page;
import com.jcraft.jogg.StreamState;
import com.jcraft.jorbis.Info;
import com.jcraft.jorbis.Comment;
import java.nio.ByteBuffer;
import com.jcraft.jorbis.Block;
import com.jcraft.jogg.SyncState;
import com.jcraft.jogg.Packet;
import com.jcraft.jorbis.DspState;
import java.io.InputStream;

public class OggInputStream extends InputStream implements AudioInputStream
{
    private /* synthetic */ DspState dspState;
    /* synthetic */ byte[] buffer;
    private /* synthetic */ byte[] convbuffer;
    /* synthetic */ boolean inited;
    private /* synthetic */ Packet packet;
    private /* synthetic */ InputStream input;
    private /* synthetic */ int total;
    private static final /* synthetic */ int[] llIlIlIIIlllII;
    /* synthetic */ int bytes;
    private /* synthetic */ boolean endOfStream;
    private /* synthetic */ SyncState syncState;
    /* synthetic */ boolean bigEndian;
    private /* synthetic */ int convsize;
    private /* synthetic */ Block vorbisBlock;
    private /* synthetic */ ByteBuffer pcmBuffer;
    private static final /* synthetic */ String[] llIlIlIIIllIll;
    private /* synthetic */ Comment comment;
    private /* synthetic */ Info oggInfo;
    /* synthetic */ boolean endOfBitStream;
    private /* synthetic */ StreamState streamState;
    private /* synthetic */ Page page;
    private /* synthetic */ int readIndex;
    
    public int getRate() {
        return this.oggInfo.rate;
    }
    
    private static boolean lIIlIIlllIllIlIl(final int llllllllllllIllIlIlIlllIlllIIIII, final int llllllllllllIllIlIlIlllIllIlllll) {
        return llllllllllllIllIlIlIlllIlllIIIII < llllllllllllIllIlIlIlllIllIlllll;
    }
    
    public boolean atEnd() {
        int n;
        if (lIIlIIlllIllIIlI(this.endOfStream ? 1 : 0) && lIIlIIlllIlllIll(this.readIndex, this.pcmBuffer.position())) {
            n = OggInputStream.llIlIlIIIlllII[2];
            "".length();
            if ("  ".length() == (0xB9 ^ 0xAC ^ (0x51 ^ 0x40))) {
                return ((0x26 ^ 0x1F ^ (0x3E ^ 0x44)) & (8 + 91 - 20 + 56 ^ 95 + 148 - 105 + 58 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = OggInputStream.llIlIlIIIlllII[1];
        }
        return n != 0;
    }
    
    private static boolean lIIlIIlllIllIlll(final int llllllllllllIllIlIlIlllIllIlIlIl) {
        return llllllllllllIllIlIlIlllIllIlIlIl == 0;
    }
    
    private static boolean lIIlIIlllIllIlII(final int llllllllllllIllIlIlIlllIllIIllII, final int llllllllllllIllIlIlIlllIllIIlIll) {
        return llllllllllllIllIlIlIlllIllIIllII != llllllllllllIllIlIlIlllIllIIlIll;
    }
    
    public int getLength() {
        return this.total;
    }
    
    static {
        lIIlIIlllIllIIIl();
        lIIlIIlllIllIIII();
    }
    
    private boolean getPageAndPacket() {
        int llllllllllllIllIlIlIllllIllIllIl = this.syncState.buffer(OggInputStream.llIlIlIIIlllII[4]);
        this.buffer = this.syncState.data;
        if (lIIlIIlllIllIIll(this.buffer)) {
            this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
            return OggInputStream.llIlIlIIIlllII[1] != 0;
        }
        try {
            this.bytes = this.input.read(this.buffer, llllllllllllIllIlIlIllllIllIllIl, OggInputStream.llIlIlIIIlllII[4]);
            "".length();
            if (null != null) {
                return ((73 + 56 - 72 + 88 ^ 85 + 57 - 15 + 48) & (0xEA ^ 0xAF ^ (0x2B ^ 0x50) ^ -" ".length())) != 0x0;
            }
        }
        catch (Exception llllllllllllIllIlIlIllllIlllIIIl) {
            Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[1]]);
            Log.error(llllllllllllIllIlIlIllllIlllIIIl);
            this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
            return OggInputStream.llIlIlIIIlllII[1] != 0;
        }
        this.syncState.wrote(this.bytes);
        "".length();
        if (lIIlIIlllIllIlII(this.syncState.pageout(this.page), OggInputStream.llIlIlIIIlllII[2])) {
            if (lIIlIIlllIllIlIl(this.bytes, OggInputStream.llIlIlIIIlllII[4])) {
                return OggInputStream.llIlIlIIIlllII[1] != 0;
            }
            Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[2]]);
            this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
            return OggInputStream.llIlIlIIIlllII[1] != 0;
        }
        else {
            this.streamState.init(this.page.serialno());
            this.oggInfo.init();
            this.comment.init();
            if (lIIlIIlllIllIllI(this.streamState.pagein(this.page))) {
                Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[5]]);
                this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                return OggInputStream.llIlIlIIIlllII[1] != 0;
            }
            if (lIIlIIlllIllIlII(this.streamState.packetout(this.packet), OggInputStream.llIlIlIIIlllII[2])) {
                Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[6]]);
                this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                return OggInputStream.llIlIlIIIlllII[1] != 0;
            }
            if (lIIlIIlllIllIllI(this.oggInfo.synthesis_headerin(this.comment, this.packet))) {
                Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[7]]);
                this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                return OggInputStream.llIlIlIIIlllII[1] != 0;
            }
            int llllllllllllIllIlIlIllllIllIllII = OggInputStream.llIlIlIIIlllII[1];
            while (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIllIllII, OggInputStream.llIlIlIIIlllII[5])) {
                while (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIllIllII, OggInputStream.llIlIlIIIlllII[5])) {
                    int llllllllllllIllIlIlIllllIlllIIII = this.syncState.pageout(this.page);
                    if (lIIlIIlllIllIlll(llllllllllllIllIlIlIllllIlllIIII)) {
                        "".length();
                        if (-(0x22 ^ 0x33 ^ (0x5F ^ 0x4B)) >= 0) {
                            return ((0x76 ^ 0x7C ^ (0x5A ^ 0x77)) & (90 + 47 - 101 + 119 ^ 83 + 111 - 86 + 80 ^ -" ".length())) != 0x0;
                        }
                        break;
                    }
                    else {
                        if (lIIlIIlllIlllIII(llllllllllllIllIlIlIllllIlllIIII, OggInputStream.llIlIlIIIlllII[2])) {
                            this.streamState.pagein(this.page);
                            "".length();
                            while (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIllIllII, OggInputStream.llIlIlIIIlllII[5])) {
                                llllllllllllIllIlIlIllllIlllIIII = this.streamState.packetout(this.packet);
                                if (lIIlIIlllIllIlll(llllllllllllIllIlIlIllllIlllIIII)) {
                                    "".length();
                                    if (-"   ".length() >= 0) {
                                        return ((34 + 8 + 109 + 10 ^ 25 + 135 - 25 + 34) & (74 + 132 - 131 + 58 ^ 46 + 100 - 125 + 120 ^ -" ".length())) != 0x0;
                                    }
                                    break;
                                }
                                else {
                                    if (lIIlIIlllIlllIII(llllllllllllIllIlIlIllllIlllIIII, OggInputStream.llIlIlIIIlllII[8])) {
                                        Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[9]]);
                                        this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                                        return OggInputStream.llIlIlIIIlllII[1] != 0;
                                    }
                                    this.oggInfo.synthesis_headerin(this.comment, this.packet);
                                    "".length();
                                    ++llllllllllllIllIlIlIllllIllIllII;
                                    "".length();
                                    if (null != null) {
                                        return ((0x6C ^ 0x36) & ~(0x72 ^ 0x28)) != 0x0;
                                    }
                                    continue;
                                }
                            }
                        }
                        "".length();
                        if (null != null) {
                            return ((139 + 201 - 158 + 33 ^ 26 + 24 + 46 + 37) & (115 + 97 - 192 + 221 ^ 23 + 111 - 13 + 42 ^ -" ".length())) != 0x0;
                        }
                        continue;
                    }
                }
                llllllllllllIllIlIlIllllIllIllIl = this.syncState.buffer(OggInputStream.llIlIlIIIlllII[4]);
                this.buffer = this.syncState.data;
                try {
                    this.bytes = this.input.read(this.buffer, llllllllllllIllIlIlIllllIllIllIl, OggInputStream.llIlIlIIIlllII[4]);
                    "".length();
                    if (((0xC5 ^ 0xB4 ^ (0xE3 ^ 0xA8)) & (0x1D ^ 0x24 ^ "   ".length() ^ -" ".length())) > " ".length()) {
                        return ((0x48 ^ 0x5F ^ "  ".length()) & (0xF2 ^ 0xA1 ^ (0xEB ^ 0xAD) ^ -" ".length())) != 0x0;
                    }
                }
                catch (Exception llllllllllllIllIlIlIllllIllIllll) {
                    Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[10]]);
                    Log.error(llllllllllllIllIlIlIllllIllIllll);
                    this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                    return OggInputStream.llIlIlIIIlllII[1] != 0;
                }
                if (lIIlIIlllIllIlll(this.bytes) && lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIllIllII, OggInputStream.llIlIlIIIlllII[5])) {
                    Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[11]]);
                    this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                    return OggInputStream.llIlIlIIIlllII[1] != 0;
                }
                this.syncState.wrote(this.bytes);
                "".length();
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return ((0xA ^ 0x48 ^ (0xAF ^ 0xAB)) & (0xD4 ^ 0x9E ^ (0xBB ^ 0xB7) ^ -" ".length())) != 0x0;
                }
            }
            this.convsize = OggInputStream.llIlIlIIIlllII[4] / this.oggInfo.channels;
            this.dspState.synthesis_init(this.oggInfo);
            "".length();
            this.vorbisBlock.init(this.dspState);
            return OggInputStream.llIlIlIIIlllII[2] != 0;
        }
    }
    
    private static String lIIlIIlllIlIllll(final String llllllllllllIllIlIlIllllIIIIIllI, final String llllllllllllIllIlIlIllllIIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllllIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIllllIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIllllIIIIlIlI.init(OggInputStream.llIlIlIIIlllII[5], llllllllllllIllIlIlIllllIIIIlIll);
            return new String(llllllllllllIllIlIlIllllIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllllIIIIlIIl) {
            llllllllllllIllIlIlIllllIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIlllIlIlllI(String llllllllllllIllIlIlIlllIllllIIll, final String llllllllllllIllIlIlIlllIllllIlll) {
        llllllllllllIllIlIlIlllIllllIIll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIlllIllllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIlllIllllIllI = new StringBuilder();
        final char[] llllllllllllIllIlIlIlllIllllIlIl = llllllllllllIllIlIlIlllIllllIlll.toCharArray();
        int llllllllllllIllIlIlIlllIllllIlII = OggInputStream.llIlIlIIIlllII[1];
        final short llllllllllllIllIlIlIlllIlllIlllI = (Object)((String)llllllllllllIllIlIlIlllIllllIIll).toCharArray();
        final double llllllllllllIllIlIlIlllIlllIllIl = llllllllllllIllIlIlIlllIlllIlllI.length;
        int llllllllllllIllIlIlIlllIlllIllII = OggInputStream.llIlIlIIIlllII[1];
        while (lIIlIIlllIllIlIl(llllllllllllIllIlIlIlllIlllIllII, (int)llllllllllllIllIlIlIlllIlllIllIl)) {
            final char llllllllllllIllIlIlIlllIlllllIIl = llllllllllllIllIlIlIlllIlllIlllI[llllllllllllIllIlIlIlllIlllIllII];
            llllllllllllIllIlIlIlllIllllIllI.append((char)(llllllllllllIllIlIlIlllIlllllIIl ^ llllllllllllIllIlIlIlllIllllIlIl[llllllllllllIllIlIlIlllIllllIlII % llllllllllllIllIlIlIlllIllllIlIl.length]));
            "".length();
            ++llllllllllllIllIlIlIlllIllllIlII;
            ++llllllllllllIllIlIlIlllIlllIllII;
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIlllIllllIllI);
    }
    
    private static boolean lIIlIIlllIllIIll(final Object llllllllllllIllIlIlIlllIllIllIIl) {
        return llllllllllllIllIlIlIlllIllIllIIl == null;
    }
    
    private static boolean lIIlIIlllIllIIlI(final int llllllllllllIllIlIlIlllIllIlIlll) {
        return llllllllllllIllIlIlIlllIllIlIlll != 0;
    }
    
    private static void lIIlIIlllIllIIII() {
        (llIlIlIIIllIll = new String[OggInputStream.llIlIlIIIlllII[19]])[OggInputStream.llIlIlIIIlllII[1]] = lIIlIIlllIlIllIl("M1EEbXbS7fNqoHnM5GvxV44aLoTY2zmRUvWQgk/Q0MA=", "JvJUq");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[2]] = lIIlIIlllIlIllIl("qMmBZ2+5dHUL/pUkd6OJ6/n0MZbrd5CNMKjrKgdx+hIuF8s6I419WE8b5Dxz2TIM", "xnzMj");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[5]] = lIIlIIlllIlIlllI("PAAEDh1ZABMACxAcEUEJEAAFFU8JExEETxYUVi4IHlIUCBsKBgQEDhRSEgAbGFw=", "yrvao");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[6]] = lIIlIIlllIlIlllI("ADUbIztlNQwtLSwpDmwgKy4dJSgpZwEpKCEiG2w5JCQCKT1r", "EGiLI");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[7]] = lIIlIIlllIlIllll("IU9+lML/KUlCyfEPOqklRyHNlGwjgx8gyullCblZPJ43ULYegNhb2Zez5ZGPNIfcxBF0vwnykH0=", "saKda");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[9]] = lIIlIIlllIlIllIl("mbrHXUbGFXZqWVQDVZMD7sBSA4UYiKXSh6O9tPPYTidgwVJc7USJDw==", "HzvOW");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[10]] = lIIlIIlllIlIllIl("d2gtG7tfCBzaAMm+/9dAt7XorkE8/s46", "bHSQa");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[11]] = lIIlIIlllIlIllIl("CxVXG0NrBiGvA7eDSfSkXYabZog8ZZzOMkLnTX9X4W8l/LUunM/WS23Ijr3wjEdY", "MYpde");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[12]] = lIIlIIlllIlIlllI("BAcDJRQ3HFE4E2cFGCQSLgYWdwUmHBB3CClIEz4VNBwDMgAqU1E0DikcGDkULgYWeU9p", "GhqWa");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[16]] = lIIlIIlllIlIllll("OVJKBAsh8LnQ6/8gLCNw8BrQbysmTapIs3PrqqEOe3afdyzOV7u7/DQOj1hKYCHcYwaZvpgpg+Q=", "nXKYv");
        OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[17]] = lIIlIIlllIlIllll("WVYEJ1mult3WCJbJIMXkG+aBn/IyvDnS6Mxw2LP75EU=", "YCPun");
    }
    
    private void readPCM() throws IOException {
        boolean llllllllllllIllIlIlIllllIlIIlIll = OggInputStream.llIlIlIIIlllII[1] != 0;
        do {
            if (lIIlIIlllIllIIlI(this.endOfBitStream ? 1 : 0)) {
                if (lIIlIIlllIllIlll(this.getPageAndPacket() ? 1 : 0)) {
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                    this.syncState.clear();
                    "".length();
                    this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                    return;
                }
                else {
                    this.endOfBitStream = (OggInputStream.llIlIlIIIlllII[1] != 0);
                }
            }
            if (lIIlIIlllIllIlll(this.inited ? 1 : 0)) {
                this.inited = (OggInputStream.llIlIlIIIlllII[2] != 0);
                return;
            }
            final float[][][] llllllllllllIllIlIlIllllIlIIlllI = new float[OggInputStream.llIlIlIIIlllII[2]][][];
            final int[] llllllllllllIllIlIlIllllIlIIllIl = new int[this.oggInfo.channels];
            while (lIIlIIlllIllIlll(this.endOfBitStream ? 1 : 0)) {
                while (lIIlIIlllIllIlll(this.endOfBitStream ? 1 : 0)) {
                    int llllllllllllIllIlIlIllllIlIlIIIl = this.syncState.pageout(this.page);
                    if (lIIlIIlllIllIlll(llllllllllllIllIlIlIllllIlIlIIIl)) {
                        "".length();
                        if (" ".length() == 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (lIIlIIlllIlllIII(llllllllllllIllIlIlIllllIlIlIIIl, OggInputStream.llIlIlIIIlllII[8])) {
                            Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[12]]);
                            "".length();
                            if (-" ".length() >= ((0x3D ^ 0x7D) & ~(0xE7 ^ 0xA7))) {
                                return;
                            }
                        }
                        else {
                            this.streamState.pagein(this.page);
                            "".length();
                            while (true) {
                                llllllllllllIllIlIlIllllIlIlIIIl = this.streamState.packetout(this.packet);
                                if (lIIlIIlllIllIlll(llllllllllllIllIlIlIllllIlIlIIIl)) {
                                    "".length();
                                    if ("   ".length() > (0x3A ^ 0x3E)) {
                                        return;
                                    }
                                    if (lIIlIIlllIllIIlI(this.page.eos())) {
                                        this.endOfBitStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                                    }
                                    if (lIIlIIlllIllIlll(this.endOfBitStream ? 1 : 0) && lIIlIIlllIllIIlI(llllllllllllIllIlIlIllllIlIIlIll ? 1 : 0)) {
                                        return;
                                    }
                                    break;
                                }
                                else if (lIIlIIlllIlllIII(llllllllllllIllIlIlIllllIlIlIIIl, OggInputStream.llIlIlIIIlllII[8])) {
                                    "".length();
                                    if (-" ".length() >= "   ".length()) {
                                        return;
                                    }
                                    continue;
                                }
                                else {
                                    if (lIIlIIlllIllIlll(this.vorbisBlock.synthesis(this.packet))) {
                                        this.dspState.synthesis_blockin(this.vorbisBlock);
                                        "".length();
                                    }
                                    int llllllllllllIllIlIlIllllIlIlIIlI;
                                    while (lIIlIIlllIlllIIl(llllllllllllIllIlIlIllllIlIlIIlI = this.dspState.synthesis_pcmout(llllllllllllIllIlIlIllllIlIIlllI, llllllllllllIllIlIlIllllIlIIllIl))) {
                                        final float[][] llllllllllllIllIlIlIllllIlIlIlIl = llllllllllllIllIlIlIllllIlIIlllI[OggInputStream.llIlIlIIIlllII[1]];
                                        int convsize;
                                        if (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIlIlIIlI, this.convsize)) {
                                            convsize = llllllllllllIllIlIlIllllIlIlIIlI;
                                            "".length();
                                            if ("   ".length() <= "  ".length()) {
                                                return;
                                            }
                                        }
                                        else {
                                            convsize = this.convsize;
                                        }
                                        final int llllllllllllIllIlIlIllllIlIlIlII = convsize;
                                        int llllllllllllIllIlIlIllllIlIlIllI = OggInputStream.llIlIlIIIlllII[1];
                                        while (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIlIlIllI, this.oggInfo.channels)) {
                                            int llllllllllllIllIlIlIllllIlIllIII = llllllllllllIllIlIlIllllIlIlIllI * OggInputStream.llIlIlIIIlllII[5];
                                            final int llllllllllllIllIlIlIllllIlIlIlll = llllllllllllIllIlIlIllllIlIIllIl[llllllllllllIllIlIlIllllIlIlIllI];
                                            int llllllllllllIllIlIlIllllIlIllIIl = OggInputStream.llIlIlIIIlllII[1];
                                            while (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIlIllIIl, llllllllllllIllIlIlIllllIlIlIlII)) {
                                                int llllllllllllIllIlIlIllllIlIllIlI = (int)(llllllllllllIllIlIlIllllIlIlIlIl[llllllllllllIllIlIlIllllIlIlIllI][llllllllllllIllIlIlIllllIlIlIlll + llllllllllllIllIlIlIllllIlIllIIl] * 32767.0);
                                                if (lIIlIIlllIlllIlI(llllllllllllIllIlIlIllllIlIllIlI, OggInputStream.llIlIlIIIlllII[13])) {
                                                    llllllllllllIllIlIlIllllIlIllIlI = OggInputStream.llIlIlIIIlllII[13];
                                                }
                                                if (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIlIllIlI, OggInputStream.llIlIlIIIlllII[14])) {
                                                    llllllllllllIllIlIlIllllIlIllIlI = OggInputStream.llIlIlIIIlllII[14];
                                                }
                                                if (lIIlIIlllIllIllI(llllllllllllIllIlIlIllllIlIllIlI)) {
                                                    llllllllllllIllIlIlIllllIlIllIlI |= OggInputStream.llIlIlIIIlllII[15];
                                                }
                                                if (lIIlIIlllIllIIlI(this.bigEndian ? 1 : 0)) {
                                                    this.convbuffer[llllllllllllIllIlIlIllllIlIllIII] = (byte)(llllllllllllIllIlIlIllllIlIllIlI >>> OggInputStream.llIlIlIIIlllII[12]);
                                                    this.convbuffer[llllllllllllIllIlIlIllllIlIllIII + OggInputStream.llIlIlIIIlllII[2]] = (byte)llllllllllllIllIlIlIllllIlIllIlI;
                                                    "".length();
                                                    if ("   ".length() != "   ".length()) {
                                                        return;
                                                    }
                                                }
                                                else {
                                                    this.convbuffer[llllllllllllIllIlIlIllllIlIllIII] = (byte)llllllllllllIllIlIlIllllIlIllIlI;
                                                    this.convbuffer[llllllllllllIllIlIlIllllIlIllIII + OggInputStream.llIlIlIIIlllII[2]] = (byte)(llllllllllllIllIlIlIllllIlIllIlI >>> OggInputStream.llIlIlIIIlllII[12]);
                                                }
                                                llllllllllllIllIlIlIllllIlIllIII += OggInputStream.llIlIlIIIlllII[5] * this.oggInfo.channels;
                                                ++llllllllllllIllIlIlIllllIlIllIIl;
                                                "".length();
                                                if ("   ".length() < 0) {
                                                    return;
                                                }
                                            }
                                            ++llllllllllllIllIlIlIllllIlIlIllI;
                                            "".length();
                                            if ((0xA2 ^ 0x87 ^ (0xB3 ^ 0x92)) != (0xCB ^ 0xC3 ^ (0x65 ^ 0x69))) {
                                                return;
                                            }
                                        }
                                        final int llllllllllllIllIlIlIllllIlIlIIll = OggInputStream.llIlIlIIIlllII[5] * this.oggInfo.channels * llllllllllllIllIlIlIllllIlIlIlII;
                                        if (lIIlIIlllIlllIll(llllllllllllIllIlIlIllllIlIlIIll, this.pcmBuffer.remaining())) {
                                            Log.warn(String.valueOf(new StringBuilder().append(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[16]]).append(llllllllllllIllIlIlIllllIlIlIIll)));
                                            "".length();
                                            if (" ".length() <= -" ".length()) {
                                                return;
                                            }
                                        }
                                        else {
                                            this.pcmBuffer.put(this.convbuffer, OggInputStream.llIlIlIIIlllII[1], llllllllllllIllIlIlIllllIlIlIIll);
                                            "".length();
                                        }
                                        llllllllllllIllIlIlIllllIlIIlIll = (OggInputStream.llIlIlIIIlllII[2] != 0);
                                        this.dspState.synthesis_read(llllllllllllIllIlIlIllllIlIlIlII);
                                        "".length();
                                        "".length();
                                        if (null != null) {
                                            return;
                                        }
                                    }
                                    "".length();
                                    if (-"  ".length() >= 0) {
                                        return;
                                    }
                                    continue;
                                }
                            }
                        }
                        "".length();
                        if ((0x6E ^ 0x6A) < "  ".length()) {
                            return;
                        }
                        continue;
                    }
                }
                if (lIIlIIlllIllIlll(this.endOfBitStream ? 1 : 0)) {
                    this.bytes = OggInputStream.llIlIlIIIlllII[1];
                    final int llllllllllllIllIlIlIllllIlIIllll = this.syncState.buffer(OggInputStream.llIlIlIIIlllII[4]);
                    Label_1057: {
                        if (lIIlIIlllIllllII(llllllllllllIllIlIlIllllIlIIllll)) {
                            this.buffer = this.syncState.data;
                            try {
                                this.bytes = this.input.read(this.buffer, llllllllllllIllIlIlIllllIlIIllll, OggInputStream.llIlIlIIIlllII[4]);
                                "".length();
                                if ("  ".length() < 0) {
                                    return;
                                }
                                break Label_1057;
                            }
                            catch (Exception llllllllllllIllIlIlIllllIlIlIIII) {
                                Log.error(OggInputStream.llIlIlIIIllIll[OggInputStream.llIlIlIIIlllII[17]]);
                                Log.error(llllllllllllIllIlIlIllllIlIlIIII);
                                this.endOfStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                                return;
                            }
                        }
                        this.bytes = OggInputStream.llIlIlIIIlllII[1];
                    }
                    this.syncState.wrote(this.bytes);
                    "".length();
                    if (lIIlIIlllIllIlll(this.bytes)) {
                        this.endOfBitStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
                    }
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    continue;
                }
            }
            this.streamState.clear();
            this.vorbisBlock.clear();
            "".length();
            this.dspState.clear();
            this.oggInfo.clear();
            "".length();
        } while (((0x2F ^ 0xA) & ~(0x25 ^ 0x0)) == 0x0);
    }
    
    private static boolean lIIlIIlllIlllIlI(final int llllllllllllIllIlIlIlllIllIlllII, final int llllllllllllIllIlIlIlllIllIllIll) {
        return llllllllllllIllIlIlIlllIllIlllII > llllllllllllIllIlIlIlllIllIllIll;
    }
    
    private static boolean lIIlIIlllIlllIIl(final int llllllllllllIllIlIlIlllIllIIllll) {
        return llllllllllllIllIlIlIlllIllIIllll > 0;
    }
    
    @Override
    public int read(final byte[] llllllllllllIllIlIlIllllIIlIIlll, final int llllllllllllIllIlIlIllllIIlIlIlI, final int llllllllllllIllIlIlIllllIIlIIllI) throws IOException {
        int llllllllllllIllIlIlIllllIIlIllIl = OggInputStream.llIlIlIIIlllII[1];
        while (lIIlIIlllIllIlIl(llllllllllllIllIlIlIllllIIlIllIl, llllllllllllIllIlIlIllllIIlIIllI)) {
            try {
                final int llllllllllllIllIlIlIllllIIlIllll = this.read();
                if (lIIlIIlllIllllII(llllllllllllIllIlIlIllllIIlIllll)) {
                    llllllllllllIllIlIlIllllIIlIIlll[llllllllllllIllIlIlIllllIIlIllIl] = (byte)llllllllllllIllIlIlIllllIIlIllll;
                    "".length();
                    if (null != null) {
                        return (0xDB ^ 0x9D) & ~(0x75 ^ 0x33);
                    }
                    "".length();
                    if ("  ".length() <= 0) {
                        return (33 + 61 + 107 + 46 ^ 77 + 20 - 42 + 115) & (0x63 ^ 0x10 ^ (0x23 ^ 0xD) ^ -" ".length());
                    }
                }
                else {
                    if (lIIlIIlllIllIlll(llllllllllllIllIlIlIllllIIlIllIl)) {
                        return OggInputStream.llIlIlIIIlllII[8];
                    }
                    return llllllllllllIllIlIlIllllIIlIllIl;
                }
            }
            catch (IOException llllllllllllIllIlIlIllllIIlIlllI) {
                Log.error(llllllllllllIllIlIlIllllIIlIlllI);
                return llllllllllllIllIlIlIllllIIlIllIl;
            }
            ++llllllllllllIllIlIlIllllIIlIllIl;
            "".length();
            if (((0x81 ^ 0x97 ^ (0x4C ^ 0x1B)) & (0xA ^ 0x78 ^ (0x70 ^ 0x43) ^ -" ".length())) >= "  ".length()) {
                return (135 + 83 - 210 + 147 ^ 66 + 106 - 108 + 67) & (55 + 44 - 44 + 122 ^ 63 + 42 - 90 + 154 ^ -" ".length());
            }
        }
        return llllllllllllIllIlIlIllllIIlIIllI;
    }
    
    private static boolean lIIlIIlllIlllIII(final int llllllllllllIllIlIlIlllIlllIlIII, final int llllllllllllIllIlIlIlllIlllIIlll) {
        return llllllllllllIllIlIlIlllIlllIlIII == llllllllllllIllIlIlIlllIlllIIlll;
    }
    
    public int getChannels() {
        return this.oggInfo.channels;
    }
    
    private void init() throws IOException {
        this.initVorbis();
        this.readPCM();
    }
    
    @Override
    public void close() throws IOException {
    }
    
    private static String lIIlIIlllIlIllIl(final String llllllllllllIllIlIlIllllIIIlIlIl, final String llllllllllllIllIlIlIllllIIIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllllIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllllIIIlIlII.getBytes(StandardCharsets.UTF_8)), OggInputStream.llIlIlIIIlllII[12]), "DES");
            final Cipher llllllllllllIllIlIlIllllIIIlIlll = Cipher.getInstance("DES");
            llllllllllllIllIlIlIllllIIIlIlll.init(OggInputStream.llIlIlIIIlllII[5], llllllllllllIllIlIlIllllIIIllIII);
            return new String(llllllllllllIllIlIlIllllIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllllIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllllIIIlIllI) {
            llllllllllllIllIlIlIllllIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIlllIllIllI(final int llllllllllllIllIlIlIlllIllIlIIIl) {
        return llllllllllllIllIlIlIlllIllIlIIIl < 0;
    }
    
    private static void lIIlIIlllIllIIIl() {
        (llIlIlIIIlllII = new int[20])[0] = (0xFFFFC110 & 0x7EEF);
        OggInputStream.llIlIlIIIlllII[1] = ((0x9A ^ 0xC2 ^ (0x53 ^ 0x25)) & (0x78 ^ 0x62 ^ (0x8 ^ 0x3C) ^ -" ".length()));
        OggInputStream.llIlIlIIIlllII[2] = " ".length();
        OggInputStream.llIlIlIIIlllII[3] = (0xFFFFCE33 & 0x1F71CC);
        OggInputStream.llIlIlIIIlllII[4] = (-(0xFFFFECEF & 0x7FF4) & (0xFFFFFEEF & 0x7DF3));
        OggInputStream.llIlIlIIIlllII[5] = "  ".length();
        OggInputStream.llIlIlIIIlllII[6] = "   ".length();
        OggInputStream.llIlIlIIIlllII[7] = (0xAE ^ 0xAA);
        OggInputStream.llIlIlIIIlllII[8] = -" ".length();
        OggInputStream.llIlIlIIIlllII[9] = (0xD ^ 0x40 ^ (0x8F ^ 0xC7));
        OggInputStream.llIlIlIIIlllII[10] = (0x21 ^ 0x27);
        OggInputStream.llIlIlIIIlllII[11] = (0x52 ^ 0x46 ^ (0xAD ^ 0xBE));
        OggInputStream.llIlIlIIIlllII[12] = (160 + 89 - 158 + 81 ^ 54 + 24 + 55 + 31);
        OggInputStream.llIlIlIIIlllII[13] = (-" ".length() & (-1 & 0x7FFF));
        OggInputStream.llIlIlIIIlllII[14] = -(-(0xFFFFF73E & 0x7EE7) & (0xFFFFFE7D & 0xF7A7));
        OggInputStream.llIlIlIIIlllII[15] = (0xFFFFA755 & 0xD8AA);
        OggInputStream.llIlIlIIIlllII[16] = (0x78 ^ 0x73 ^ "  ".length());
        OggInputStream.llIlIlIIIlllII[17] = (0xC1 ^ 0x96 ^ (0x44 ^ 0x19));
        OggInputStream.llIlIlIIIlllII[18] = (0xFFFFCB66 & 0x3599);
        OggInputStream.llIlIlIIIlllII[19] = (0x7 ^ 0x4A ^ (0x19 ^ 0x5F));
    }
    
    @Override
    public int available() {
        int n;
        if (lIIlIIlllIllIIlI(this.endOfStream ? 1 : 0)) {
            n = OggInputStream.llIlIlIIIlllII[1];
            "".length();
            if (-" ".length() > 0) {
                return (0x2C ^ 0x7) & ~(0x56 ^ 0x7D);
            }
        }
        else {
            n = OggInputStream.llIlIlIIIlllII[2];
        }
        return n;
    }
    
    private static boolean lIIlIIlllIlllIll(final int llllllllllllIllIlIlIlllIlllIIlII, final int llllllllllllIllIlIlIlllIlllIIIll) {
        return llllllllllllIllIlIlIlllIlllIIlII >= llllllllllllIllIlIlIlllIlllIIIll;
    }
    
    private void initVorbis() {
        this.syncState.init();
    }
    
    public OggInputStream(final InputStream llllllllllllIllIlIlIlllllIIIlIlI) throws IOException {
        this.convsize = OggInputStream.llIlIlIIIlllII[0];
        this.convbuffer = new byte[this.convsize];
        this.oggInfo = new Info();
        this.syncState = new SyncState();
        this.streamState = new StreamState();
        this.page = new Page();
        this.packet = new Packet();
        this.comment = new Comment();
        this.dspState = new DspState();
        this.vorbisBlock = new Block(this.dspState);
        this.bytes = OggInputStream.llIlIlIIIlllII[1];
        this.bigEndian = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
        this.endOfBitStream = (OggInputStream.llIlIlIIIlllII[2] != 0);
        this.inited = (OggInputStream.llIlIlIIIlllII[1] != 0);
        this.pcmBuffer = BufferUtils.createByteBuffer(OggInputStream.llIlIlIIIlllII[3]);
        this.input = llllllllllllIllIlIlIlllllIIIlIlI;
        this.total = llllllllllllIllIlIlIlllllIIIlIlI.available();
        this.init();
    }
    
    private static boolean lIIlIIlllIllllII(final int llllllllllllIllIlIlIlllIllIlIIll) {
        return llllllllllllIllIlIlIlllIllIlIIll >= 0;
    }
    
    @Override
    public int read(final byte[] llllllllllllIllIlIlIllllIIlIIIII) throws IOException {
        return this.read(llllllllllllIllIlIlIllllIIlIIIII, OggInputStream.llIlIlIIIlllII[1], llllllllllllIllIlIlIllllIIlIIIII.length);
    }
    
    @Override
    public int read() throws IOException {
        if (lIIlIIlllIlllIll(this.readIndex, this.pcmBuffer.position())) {
            this.pcmBuffer.clear();
            "".length();
            this.readPCM();
            this.readIndex = OggInputStream.llIlIlIIIlllII[1];
        }
        if (lIIlIIlllIlllIll(this.readIndex, this.pcmBuffer.position())) {
            return OggInputStream.llIlIlIIIlllII[8];
        }
        int llllllllllllIllIlIlIllllIIlllIlI = this.pcmBuffer.get(this.readIndex);
        if (lIIlIIlllIllIllI(llllllllllllIllIlIlIllllIIlllIlI)) {
            llllllllllllIllIlIlIllllIIlllIlI += OggInputStream.llIlIlIIIlllII[18];
        }
        this.readIndex += OggInputStream.llIlIlIIIlllII[2];
        return llllllllllllIllIlIlIllllIIlllIlI;
    }
}
