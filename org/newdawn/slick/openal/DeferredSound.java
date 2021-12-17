// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.io.IOException;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.loading.LoadingList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.InputStream;
import org.newdawn.slick.loading.DeferredResource;

public class DeferredSound extends AudioImpl implements DeferredResource
{
    private /* synthetic */ int type;
    private static final /* synthetic */ int[] lIlIIlllIlIllI;
    private static final /* synthetic */ String[] lIlIIlllIlIlIl;
    private /* synthetic */ Audio target;
    private /* synthetic */ InputStream in;
    private /* synthetic */ String ref;
    
    public String getDescription() {
        return this.ref;
    }
    
    private void checkTarget() {
        if (lllIlIIlIlIlIIl(this.target)) {
            throw new RuntimeException(DeferredSound.lIlIIlllIlIlIl[DeferredSound.lIlIIlllIlIllI[0]]);
        }
    }
    
    @Override
    public int playAsSoundEffect(final float lllllllllllllIIIlIllllllIIIIIIII, final float lllllllllllllIIIlIlllllIllllllll, final boolean lllllllllllllIIIlIlllllIlllllIlI) {
        this.checkTarget();
        return this.target.playAsSoundEffect(lllllllllllllIIIlIllllllIIIIIIII, lllllllllllllIIIlIlllllIllllllll, lllllllllllllIIIlIlllllIlllllIlI);
    }
    
    private static boolean lllIlIIlIlIlIll(final int lllllllllllllIIIlIlllllIlIllIlll, final int lllllllllllllIIIlIlllllIlIllIllI) {
        return lllllllllllllIIIlIlllllIlIllIlll < lllllllllllllIIIlIlllllIlIllIllI;
    }
    
    private static String lllIlIIlIlIIlIl(final String lllllllllllllIIIlIlllllIllIlIlIl, final String lllllllllllllIIIlIlllllIllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlllllIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlllllIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlllllIllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlllllIllIllIIl.init(DeferredSound.lIlIIlllIlIllI[2], lllllllllllllIIIlIlllllIllIllIlI);
            return new String(lllllllllllllIIIlIlllllIllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlllllIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlllllIllIllIII) {
            lllllllllllllIIIlIlllllIllIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isPlaying() {
        this.checkTarget();
        return this.target.isPlaying();
    }
    
    static {
        lllIlIIlIlIIlll();
        lllIlIIlIlIIllI();
        WAV = DeferredSound.lIlIIlllIlIllI[2];
        AIF = DeferredSound.lIlIIlllIlIllI[3];
        MOD = DeferredSound.lIlIIlllIlIllI[4];
        OGG = DeferredSound.lIlIIlllIlIllI[1];
    }
    
    private static boolean lllIlIIlIlIlIII(final int lllllllllllllIIIlIlllllIlIllIIII) {
        return lllllllllllllIIIlIlllllIlIllIIII != 0;
    }
    
    private static void lllIlIIlIlIIllI() {
        (lIlIIlllIlIlIl = new String[DeferredSound.lIlIIlllIlIllI[4]])[DeferredSound.lIlIIlllIlIllI[0]] = lllIlIIlIlIIlII("NQYcMhwEBkgjHlQHGzJREBcOMgMGFwx3AhsHBjNRFhcOOAMRUgQ4EBAbBjA=", "trhWq");
        DeferredSound.lIlIIlllIlIlIl[DeferredSound.lIlIIlllIlIllI[1]] = lllIlIIlIlIIlII("Ai0zIAE4JC8sETInYTYNIi0lZRYuMyR/Qg==", "WCAEb");
        DeferredSound.lIlIIlllIlIlIl[DeferredSound.lIlIIlllIlIllI[2]] = lllIlIIlIlIIlIl("ZB2DpUcEEFtx80Y0hHEt+9A2E8FSrCyRF55Z1A8Rwwk=", "eGAvI");
    }
    
    private static boolean lllIlIIlIlIlIlI(final Object lllllllllllllIIIlIlllllIlIllIlII) {
        return lllllllllllllIIIlIlllllIlIllIlII != null;
    }
    
    public DeferredSound(final String lllllllllllllIIIlIllllllIIlIIlII, final InputStream lllllllllllllIIIlIllllllIIlIIIll, final int lllllllllllllIIIlIllllllIIIllllI) {
        this.ref = lllllllllllllIIIlIllllllIIlIIlII;
        this.type = lllllllllllllIIIlIllllllIIIllllI;
        if (lllIlIIlIlIlIII(lllllllllllllIIIlIllllllIIlIIlII.equals(lllllllllllllIIIlIllllllIIlIIIll.toString()) ? 1 : 0)) {
            this.in = lllllllllllllIIIlIllllllIIlIIIll;
        }
        LoadingList.get().add(this);
    }
    
    @Override
    public int playAsSoundEffect(final float lllllllllllllIIIlIlllllIlllIlIlI, final float lllllllllllllIIIlIlllllIlllIlIIl, final boolean lllllllllllllIIIlIlllllIlllIlIII, final float lllllllllllllIIIlIlllllIlllIlllI, final float lllllllllllllIIIlIlllllIlllIllIl, final float lllllllllllllIIIlIlllllIlllIllII) {
        this.checkTarget();
        return this.target.playAsSoundEffect(lllllllllllllIIIlIlllllIlllIlIlI, lllllllllllllIIIlIlllllIlllIlIIl, lllllllllllllIIIlIlllllIlllIlIII, lllllllllllllIIIlIlllllIlllIlllI, lllllllllllllIIIlIlllllIlllIllIl, lllllllllllllIIIlIlllllIlllIllII);
    }
    
    private static boolean lllIlIIlIlIlIIl(final Object lllllllllllllIIIlIlllllIlIllIIlI) {
        return lllllllllllllIIIlIlllllIlIllIIlI == null;
    }
    
    @Override
    public void stop() {
        this.checkTarget();
        this.target.stop();
    }
    
    @Override
    public int playAsMusic(final float lllllllllllllIIIlIllllllIIIIllII, final float lllllllllllllIIIlIllllllIIIIlIll, final boolean lllllllllllllIIIlIllllllIIIIlIlI) {
        this.checkTarget();
        return this.target.playAsMusic(lllllllllllllIIIlIllllllIIIIllII, lllllllllllllIIIlIllllllIIIIlIll, lllllllllllllIIIlIllllllIIIIlIlI);
    }
    
    private static String lllIlIIlIlIIlII(String lllllllllllllIIIlIlllllIllIIIlll, final String lllllllllllllIIIlIlllllIllIIIIIl) {
        lllllllllllllIIIlIlllllIllIIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlllllIllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlllllIllIIIlIl = new StringBuilder();
        final char[] lllllllllllllIIIlIlllllIllIIIlII = lllllllllllllIIIlIlllllIllIIIIIl.toCharArray();
        int lllllllllllllIIIlIlllllIllIIIIll = DeferredSound.lIlIIlllIlIllI[0];
        final char lllllllllllllIIIlIlllllIlIllllIl = (Object)lllllllllllllIIIlIlllllIllIIIlll.toCharArray();
        final float lllllllllllllIIIlIlllllIlIllllII = lllllllllllllIIIlIlllllIlIllllIl.length;
        double lllllllllllllIIIlIlllllIlIlllIll = DeferredSound.lIlIIlllIlIllI[0];
        while (lllIlIIlIlIlIll((int)lllllllllllllIIIlIlllllIlIlllIll, (int)lllllllllllllIIIlIlllllIlIllllII)) {
            final char lllllllllllllIIIlIlllllIllIIlIII = lllllllllllllIIIlIlllllIlIllllIl[lllllllllllllIIIlIlllllIlIlllIll];
            lllllllllllllIIIlIlllllIllIIIlIl.append((char)(lllllllllllllIIIlIlllllIllIIlIII ^ lllllllllllllIIIlIlllllIllIIIlII[lllllllllllllIIIlIlllllIllIIIIll % lllllllllllllIIIlIlllllIllIIIlII.length]));
            "".length();
            ++lllllllllllllIIIlIlllllIllIIIIll;
            ++lllllllllllllIIIlIlllllIlIlllIll;
            "".length();
            if ((89 + 43 - 17 + 17 ^ 126 + 85 - 138 + 55) > (0x4C ^ 0x50 ^ (0x60 ^ 0x78))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlllllIllIIIlIl);
    }
    
    public void load() throws IOException {
        final boolean lllllllllllllIIIlIllllllIIIlIlll = SoundStore.get().isDeferredLoading();
        SoundStore.get().setDeferredLoading((boolean)(DeferredSound.lIlIIlllIlIllI[0] != 0));
        if (lllIlIIlIlIlIlI(this.in)) {
            switch (this.type) {
                case 1: {
                    this.target = SoundStore.get().getOgg(this.in);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.target = SoundStore.get().getWAV(this.in);
                    "".length();
                    if (-(93 + 12 + 9 + 55 ^ 76 + 149 - 93 + 41) > 0) {
                        return;
                    }
                    break;
                }
                case 3: {
                    this.target = SoundStore.get().getMOD(this.in);
                    "".length();
                    if ("   ".length() == (0x68 ^ 0x6C)) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.target = SoundStore.get().getAIF(this.in);
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    break;
                }
                default: {
                    Log.error(String.valueOf(new StringBuilder().append(DeferredSound.lIlIIlllIlIlIl[DeferredSound.lIlIIlllIlIllI[1]]).append(this.type)));
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
            }
        }
        else {
            switch (this.type) {
                case 1: {
                    this.target = SoundStore.get().getOgg(this.ref);
                    "".length();
                    if ("  ".length() > (0x7A ^ 0x4E ^ (0x49 ^ 0x79))) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.target = SoundStore.get().getWAV(this.ref);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 3: {
                    this.target = SoundStore.get().getMOD(this.ref);
                    "".length();
                    if (((0x15 ^ 0x33 ^ (0x30 ^ 0x37)) & (0x41 ^ 0x19 ^ (0x2F ^ 0x56) ^ -" ".length())) > "   ".length()) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.target = SoundStore.get().getAIF(this.ref);
                    "".length();
                    if (((0x53 ^ 0x3F ^ (0x16 ^ 0x3A)) & (140 + 177 - 174 + 98 ^ 81 + 47 - 81 + 130 ^ -" ".length())) < 0) {
                        return;
                    }
                    break;
                }
                default: {
                    Log.error(String.valueOf(new StringBuilder().append(DeferredSound.lIlIIlllIlIlIl[DeferredSound.lIlIIlllIlIllI[2]]).append(this.type)));
                    break;
                }
            }
        }
        SoundStore.get().setDeferredLoading(lllllllllllllIIIlIllllllIIIlIlll);
    }
    
    private static void lllIlIIlIlIIlll() {
        (lIlIIlllIlIllI = new int[5])[0] = ((0x70 ^ 0x6E) & ~(0x1C ^ 0x2));
        DeferredSound.lIlIIlllIlIllI[1] = " ".length();
        DeferredSound.lIlIIlllIlIllI[2] = "  ".length();
        DeferredSound.lIlIIlllIlIllI[3] = (0x55 ^ 0x51);
        DeferredSound.lIlIIlllIlIllI[4] = "   ".length();
    }
}
