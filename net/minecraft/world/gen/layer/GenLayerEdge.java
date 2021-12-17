// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GenLayerEdge extends GenLayer
{
    private static final /* synthetic */ int[] lIlIIlIIlIIIIl;
    private final /* synthetic */ Mode field_151627_c;
    
    private static boolean lllIIlIlIllIllI(final int lllllllllllllIIIlllIIIlIIlllllII, final int lllllllllllllIIIlllIIIlIIllllIll) {
        return lllllllllllllIIIlllIIIlIIlllllII == lllllllllllllIIIlllIIIlIIllllIll;
    }
    
    static {
        lllIIlIlIllIlIl();
    }
    
    private static boolean lllIIlIlIlllIIl(final int lllllllllllllIIIlllIIIlIIlllIIll) {
        return lllllllllllllIIIlllIIIlIIlllIIll != 0;
    }
    
    private static boolean lllIIlIlIlllIlI(final int lllllllllllllIIIlllIIIlIIllllIII, final int lllllllllllllIIIlllIIIlIIlllIlll) {
        return lllllllllllllIIIlllIIIlIIllllIII >= lllllllllllllIIIlllIIIlIIlllIlll;
    }
    
    private static boolean lllIIlIlIllIlll(final int lllllllllllllIIIlllIIIlIIllIlllI, final int lllllllllllllIIIlllIIIlIIllIllIl) {
        return lllllllllllllIIIlllIIIlIIllIlllI != lllllllllllllIIIlllIIIlIIllIllIl;
    }
    
    private int[] getIntsHeatIce(final int lllllllllllllIIIlllIIIlIllIIIlIl, final int lllllllllllllIIIlllIIIlIlIllIIII, final int lllllllllllllIIIlllIIIlIlIlIllll, final int lllllllllllllIIIlllIIIlIlIlIlllI) {
        final int lllllllllllllIIIlllIIIlIllIIIIIl = lllllllllllllIIIlllIIIlIllIIIlIl - GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int lllllllllllllIIIlllIIIlIllIIIIII = lllllllllllllIIIlllIIIlIlIllIIII - GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int lllllllllllllIIIlllIIIlIlIllllll = GenLayerEdge.lIlIIlIIlIIIIl[0] + lllllllllllllIIIlllIIIlIlIlIllll + GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int lllllllllllllIIIlllIIIlIlIlllllI = GenLayerEdge.lIlIIlIIlIIIIl[0] + lllllllllllllIIIlllIIIlIlIlIlllI + GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int[] lllllllllllllIIIlllIIIlIlIllllIl = this.parent.getInts(lllllllllllllIIIlllIIIlIllIIIIIl, lllllllllllllIIIlllIIIlIllIIIIII, lllllllllllllIIIlllIIIlIlIllllll, lllllllllllllIIIlllIIIlIlIlllllI);
        final int[] lllllllllllllIIIlllIIIlIlIllllII = IntCache.getIntCache(lllllllllllllIIIlllIIIlIlIlIllll * lllllllllllllIIIlllIIIlIlIlIlllI);
        int lllllllllllllIIIlllIIIlIlIlllIll = GenLayerEdge.lIlIIlIIlIIIIl[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllIIlIlIlllIlI(lllllllllllllIIIlllIIIlIlIlllIll, lllllllllllllIIIlllIIIlIlIlIlllI)) {
            int lllllllllllllIIIlllIIIlIlIlllIlI = GenLayerEdge.lIlIIlIIlIIIIl[1];
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
            while (!lllIIlIlIlllIlI(lllllllllllllIIIlllIIIlIlIlllIlI, lllllllllllllIIIlllIIIlIlIlIllll)) {
                int lllllllllllllIIIlllIIIlIlIlllIIl = lllllllllllllIIIlllIIIlIlIllllIl[lllllllllllllIIIlllIIIlIlIlllIlI + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIlIlllIll + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlIllllll];
                if (lllIIlIlIllIllI(lllllllllllllIIIlllIIIlIlIlllIIl, GenLayerEdge.lIlIIlIIlIIIIl[3])) {
                    final int lllllllllllllIIIlllIIIlIlIlllIII = lllllllllllllIIIlllIIIlIlIllllIl[lllllllllllllIIIlllIIIlIlIlllIlI + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIlIlllIll + GenLayerEdge.lIlIIlIIlIIIIl[0] - GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlIllllll];
                    final int lllllllllllllIIIlllIIIlIlIllIlll = lllllllllllllIIIlllIIIlIlIllllIl[lllllllllllllIIIlllIIIlIlIlllIlI + GenLayerEdge.lIlIIlIIlIIIIl[0] + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIlIlllIll + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlIllllll];
                    final int lllllllllllllIIIlllIIIlIlIllIllI = lllllllllllllIIIlllIIIlIlIllllIl[lllllllllllllIIIlllIIIlIlIlllIlI + GenLayerEdge.lIlIIlIIlIIIIl[0] - GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIlIlllIll + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlIllllll];
                    final int lllllllllllllIIIlllIIIlIlIllIlIl = lllllllllllllIIIlllIIIlIlIllllIl[lllllllllllllIIIlllIIIlIlIlllIlI + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIlIlllIll + GenLayerEdge.lIlIIlIIlIIIIl[0] + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlIllllll];
                    int n;
                    if (lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIlllIII, GenLayerEdge.lIlIIlIIlIIIIl[4]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIllIlll, GenLayerEdge.lIlIIlIIlIIIIl[4]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIllIllI, GenLayerEdge.lIlIIlIIlIIIIl[4]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIllIlIl, GenLayerEdge.lIlIIlIIlIIIIl[4])) {
                        n = GenLayerEdge.lIlIIlIIlIIIIl[1];
                        "".length();
                        if (-"  ".length() > 0) {
                            return null;
                        }
                    }
                    else {
                        n = GenLayerEdge.lIlIIlIIlIIIIl[0];
                    }
                    final boolean lllllllllllllIIIlllIIIlIlIllIlII = n != 0;
                    int n2;
                    if (lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIlllIII, GenLayerEdge.lIlIIlIIlIIIIl[0]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIllIlll, GenLayerEdge.lIlIIlIIlIIIIl[0]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIllIllI, GenLayerEdge.lIlIIlIIlIIIIl[0]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIlIllIlIl, GenLayerEdge.lIlIIlIIlIIIIl[0])) {
                        n2 = GenLayerEdge.lIlIIlIIlIIIIl[1];
                        "".length();
                        if (((128 + 204 - 286 + 179 ^ 84 + 72 - 20 + 26) & (28 + 63 - 81 + 192 ^ 3 + 77 + 54 + 3 ^ -" ".length())) > 0) {
                            return null;
                        }
                    }
                    else {
                        n2 = GenLayerEdge.lIlIIlIIlIIIIl[0];
                    }
                    final boolean lllllllllllllIIIlllIIIlIlIllIIll = n2 != 0;
                    if (!lllIIlIlIlllIII(lllllllllllllIIIlllIIIlIlIllIIll ? 1 : 0) || lllIIlIlIlllIIl(lllllllllllllIIIlllIIIlIlIllIlII ? 1 : 0)) {
                        lllllllllllllIIIlllIIIlIlIlllIIl = GenLayerEdge.lIlIIlIIlIIIIl[2];
                    }
                }
                lllllllllllllIIIlllIIIlIlIllllII[lllllllllllllIIIlllIIIlIlIlllIlI + lllllllllllllIIIlllIIIlIlIlllIll * lllllllllllllIIIlllIIIlIlIlIllll] = lllllllllllllIIIlllIIIlIlIlllIIl;
                ++lllllllllllllIIIlllIIIlIlIlllIlI;
            }
            ++lllllllllllllIIIlllIIIlIlIlllIll;
        }
        return lllllllllllllIIIlllIIIlIlIllllII;
    }
    
    private static boolean lllIIlIlIlllIII(final int lllllllllllllIIIlllIIIlIIlllIIIl) {
        return lllllllllllllIIIlllIIIlIIlllIIIl == 0;
    }
    
    public GenLayerEdge(final long lllllllllllllIIIlllIIIllIIlIllII, final GenLayer lllllllllllllIIIlllIIIllIIlIIlll, final Mode lllllllllllllIIIlllIIIllIIlIIllI) {
        super(lllllllllllllIIIlllIIIllIIlIllII);
        this.parent = lllllllllllllIIIlllIIIllIIlIIlll;
        this.field_151627_c = lllllllllllllIIIlllIIIllIIlIIllI;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$world$gen$layer$GenLayerEdge$Mode() {
        final int[] $switch_TABLE$net$minecraft$world$gen$layer$GenLayerEdge$Mode = GenLayerEdge.$SWITCH_TABLE$net$minecraft$world$gen$layer$GenLayerEdge$Mode;
        if (lllIIlIlIlllIll($switch_TABLE$net$minecraft$world$gen$layer$GenLayerEdge$Mode)) {
            return $switch_TABLE$net$minecraft$world$gen$layer$GenLayerEdge$Mode;
        }
        "".length();
        final int lllllllllllllIIIlllIIIlIIlllllll = (Object)new int[Mode.values().length];
        try {
            lllllllllllllIIIlllIIIlIIlllllll[Mode.COOL_WARM.ordinal()] = GenLayerEdge.lIlIIlIIlIIIIl[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIlllIIIlIIlllllll[Mode.HEAT_ICE.ordinal()] = GenLayerEdge.lIlIIlIIlIIIIl[4];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIlllIIIlIIlllllll[Mode.SPECIAL.ordinal()] = GenLayerEdge.lIlIIlIIlIIIIl[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return GenLayerEdge.$SWITCH_TABLE$net$minecraft$world$gen$layer$GenLayerEdge$Mode = (int[])(Object)lllllllllllllIIIlllIIIlIIlllllll;
    }
    
    private int[] getIntsSpecial(final int lllllllllllllIIIlllIIIlIlIIlIIll, final int lllllllllllllIIIlllIIIlIlIIlIIlI, final int lllllllllllllIIIlllIIIlIlIIlIIIl, final int lllllllllllllIIIlllIIIlIlIIlIIII) {
        final int[] lllllllllllllIIIlllIIIlIlIIIllll = this.parent.getInts(lllllllllllllIIIlllIIIlIlIIlIIll, lllllllllllllIIIlllIIIlIlIIlIIlI, lllllllllllllIIIlllIIIlIlIIlIIIl, lllllllllllllIIIlllIIIlIlIIlIIII);
        final int[] lllllllllllllIIIlllIIIlIlIIIlllI = IntCache.getIntCache(lllllllllllllIIIlllIIIlIlIIlIIIl * lllllllllllllIIIlllIIIlIlIIlIIII);
        int lllllllllllllIIIlllIIIlIlIIIllIl = GenLayerEdge.lIlIIlIIlIIIIl[1];
        "".length();
        if (-" ".length() > 0) {
            return null;
        }
        while (!lllIIlIlIlllIlI(lllllllllllllIIIlllIIIlIlIIIllIl, lllllllllllllIIIlllIIIlIlIIlIIII)) {
            int lllllllllllllIIIlllIIIlIlIIIllII = GenLayerEdge.lIlIIlIIlIIIIl[1];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lllIIlIlIlllIlI(lllllllllllllIIIlllIIIlIlIIIllII, lllllllllllllIIIlllIIIlIlIIlIIIl)) {
                this.initChunkSeed(lllllllllllllIIIlllIIIlIlIIIllII + lllllllllllllIIIlllIIIlIlIIlIIll, lllllllllllllIIIlllIIIlIlIIIllIl + lllllllllllllIIIlllIIIlIlIIlIIlI);
                int lllllllllllllIIIlllIIIlIlIIIlIll = lllllllllllllIIIlllIIIlIlIIIllll[lllllllllllllIIIlllIIIlIlIIIllII + lllllllllllllIIIlllIIIlIlIIIllIl * lllllllllllllIIIlllIIIlIlIIlIIIl];
                if (lllIIlIlIlllIIl(lllllllllllllIIIlllIIIlIlIIIlIll) && lllIIlIlIlllIII(this.nextInt(GenLayerEdge.lIlIIlIIlIIIIl[5]))) {
                    lllllllllllllIIIlllIIIlIlIIIlIll |= (GenLayerEdge.lIlIIlIIlIIIIl[0] + this.nextInt(GenLayerEdge.lIlIIlIIlIIIIl[6]) << GenLayerEdge.lIlIIlIIlIIIIl[7] & GenLayerEdge.lIlIIlIIlIIIIl[8]);
                }
                lllllllllllllIIIlllIIIlIlIIIlllI[lllllllllllllIIIlllIIIlIlIIIllII + lllllllllllllIIIlllIIIlIlIIIllIl * lllllllllllllIIIlllIIIlIlIIlIIIl] = lllllllllllllIIIlllIIIlIlIIIlIll;
                ++lllllllllllllIIIlllIIIlIlIIIllII;
            }
            ++lllllllllllllIIIlllIIIlIlIIIllIl;
        }
        return lllllllllllllIIIlllIIIlIlIIIlllI;
    }
    
    private static boolean lllIIlIlIlllIll(final Object lllllllllllllIIIlllIIIlIIlllIlIl) {
        return lllllllllllllIIIlllIIIlIIlllIlIl != null;
    }
    
    private int[] getIntsCoolWarm(final int lllllllllllllIIIlllIIIlIlllIllIl, final int lllllllllllllIIIlllIIIlIlllIllII, final int lllllllllllllIIIlllIIIlIllllllll, final int lllllllllllllIIIlllIIIlIlllIlIlI) {
        final int lllllllllllllIIIlllIIIlIllllllIl = lllllllllllllIIIlllIIIlIlllIllIl - GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int lllllllllllllIIIlllIIIlIllllllII = lllllllllllllIIIlllIIIlIlllIllII - GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int lllllllllllllIIIlllIIIlIlllllIll = GenLayerEdge.lIlIIlIIlIIIIl[0] + lllllllllllllIIIlllIIIlIllllllll + GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int lllllllllllllIIIlllIIIlIlllllIlI = GenLayerEdge.lIlIIlIIlIIIIl[0] + lllllllllllllIIIlllIIIlIlllIlIlI + GenLayerEdge.lIlIIlIIlIIIIl[0];
        final int[] lllllllllllllIIIlllIIIlIlllllIIl = this.parent.getInts(lllllllllllllIIIlllIIIlIllllllIl, lllllllllllllIIIlllIIIlIllllllII, lllllllllllllIIIlllIIIlIlllllIll, lllllllllllllIIIlllIIIlIlllllIlI);
        final int[] lllllllllllllIIIlllIIIlIlllllIII = IntCache.getIntCache(lllllllllllllIIIlllIIIlIllllllll * lllllllllllllIIIlllIIIlIlllIlIlI);
        int lllllllllllllIIIlllIIIlIllllIlll = GenLayerEdge.lIlIIlIIlIIIIl[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllIIlIlIlllIlI(lllllllllllllIIIlllIIIlIllllIlll, lllllllllllllIIIlllIIIlIlllIlIlI)) {
            int lllllllllllllIIIlllIIIlIllllIllI = GenLayerEdge.lIlIIlIIlIIIIl[1];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
            while (!lllIIlIlIlllIlI(lllllllllllllIIIlllIIIlIllllIllI, lllllllllllllIIIlllIIIlIllllllll)) {
                this.initChunkSeed(lllllllllllllIIIlllIIIlIllllIllI + lllllllllllllIIIlllIIIlIlllIllIl, lllllllllllllIIIlllIIIlIllllIlll + lllllllllllllIIIlllIIIlIlllIllII);
                int lllllllllllllIIIlllIIIlIllllIlIl = lllllllllllllIIIlllIIIlIlllllIIl[lllllllllllllIIIlllIIIlIllllIllI + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIllllIlll + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlllllIll];
                if (lllIIlIlIllIllI(lllllllllllllIIIlllIIIlIllllIlIl, GenLayerEdge.lIlIIlIIlIIIIl[0])) {
                    final int lllllllllllllIIIlllIIIlIllllIlII = lllllllllllllIIIlllIIIlIlllllIIl[lllllllllllllIIIlllIIIlIllllIllI + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIllllIlll + GenLayerEdge.lIlIIlIIlIIIIl[0] - GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlllllIll];
                    final int lllllllllllllIIIlllIIIlIllllIIll = lllllllllllllIIIlllIIIlIlllllIIl[lllllllllllllIIIlllIIIlIllllIllI + GenLayerEdge.lIlIIlIIlIIIIl[0] + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIllllIlll + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlllllIll];
                    final int lllllllllllllIIIlllIIIlIllllIIlI = lllllllllllllIIIlllIIIlIlllllIIl[lllllllllllllIIIlllIIIlIllllIllI + GenLayerEdge.lIlIIlIIlIIIIl[0] - GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIllllIlll + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlllllIll];
                    final int lllllllllllllIIIlllIIIlIllllIIIl = lllllllllllllIIIlllIIIlIlllllIIl[lllllllllllllIIIlllIIIlIllllIllI + GenLayerEdge.lIlIIlIIlIIIIl[0] + (lllllllllllllIIIlllIIIlIllllIlll + GenLayerEdge.lIlIIlIIlIIIIl[0] + GenLayerEdge.lIlIIlIIlIIIIl[0]) * lllllllllllllIIIlllIIIlIlllllIll];
                    int n;
                    if (lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIlII, GenLayerEdge.lIlIIlIIlIIIIl[2]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIIll, GenLayerEdge.lIlIIlIIlIIIIl[2]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIIlI, GenLayerEdge.lIlIIlIIlIIIIl[2]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIIIl, GenLayerEdge.lIlIIlIIlIIIIl[2])) {
                        n = GenLayerEdge.lIlIIlIIlIIIIl[1];
                        "".length();
                        if ("   ".length() <= -" ".length()) {
                            return null;
                        }
                    }
                    else {
                        n = GenLayerEdge.lIlIIlIIlIIIIl[0];
                    }
                    final boolean lllllllllllllIIIlllIIIlIllllIIII = n != 0;
                    int n2;
                    if (lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIlII, GenLayerEdge.lIlIIlIIlIIIIl[3]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIIll, GenLayerEdge.lIlIIlIIlIIIIl[3]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIIlI, GenLayerEdge.lIlIIlIIlIIIIl[3]) && lllIIlIlIllIlll(lllllllllllllIIIlllIIIlIllllIIIl, GenLayerEdge.lIlIIlIIlIIIIl[3])) {
                        n2 = GenLayerEdge.lIlIIlIIlIIIIl[1];
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else {
                        n2 = GenLayerEdge.lIlIIlIIlIIIIl[0];
                    }
                    final boolean lllllllllllllIIIlllIIIlIlllIllll = n2 != 0;
                    if (!lllIIlIlIlllIII(lllllllllllllIIIlllIIIlIllllIIII ? 1 : 0) || lllIIlIlIlllIIl(lllllllllllllIIIlllIIIlIlllIllll ? 1 : 0)) {
                        lllllllllllllIIIlllIIIlIllllIlIl = GenLayerEdge.lIlIIlIIlIIIIl[4];
                    }
                }
                lllllllllllllIIIlllIIIlIlllllIII[lllllllllllllIIIlllIIIlIllllIllI + lllllllllllllIIIlllIIIlIllllIlll * lllllllllllllIIIlllIIIlIllllllll] = lllllllllllllIIIlllIIIlIllllIlIl;
                ++lllllllllllllIIIlllIIIlIllllIllI;
            }
            ++lllllllllllllIIIlllIIIlIllllIlll;
        }
        return lllllllllllllIIIlllIIIlIlllllIII;
    }
    
    private static void lllIIlIlIllIlIl() {
        (lIlIIlIIlIIIIl = new int[9])[0] = " ".length();
        GenLayerEdge.lIlIIlIIlIIIIl[1] = ((42 + 29 - 62 + 136 ^ 94 + 47 + 18 + 36) & (0x80 ^ 0xC0 ^ (0x3B ^ 0x29) ^ -" ".length()));
        GenLayerEdge.lIlIIlIIlIIIIl[2] = "   ".length();
        GenLayerEdge.lIlIIlIIlIIIIl[3] = (0xC3 ^ 0xC7);
        GenLayerEdge.lIlIIlIIlIIIIl[4] = "  ".length();
        GenLayerEdge.lIlIIlIIlIIIIl[5] = (0x5A ^ 0xF ^ (0xDE ^ 0x86));
        GenLayerEdge.lIlIIlIIlIIIIl[6] = (0x96 ^ 0xA3 ^ (0x7A ^ 0x40));
        GenLayerEdge.lIlIIlIIlIIIIl[7] = (0x42 ^ 0x4A);
        GenLayerEdge.lIlIIlIIlIIIIl[8] = (-(110 + 115 - 22 + 14) & (0xFFFFAFD8 & 0x5FFF));
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIIlllIIIllIIIlllll, final int lllllllllllllIIIlllIIIllIIIllIIl, final int lllllllllllllIIIlllIIIllIIIllIII, final int lllllllllllllIIIlllIIIllIIIlIlll) {
        switch ($SWITCH_TABLE$net$minecraft$world$gen$layer$GenLayerEdge$Mode()[this.field_151627_c.ordinal()]) {
            default: {
                return this.getIntsCoolWarm(lllllllllllllIIIlllIIIllIIIlllll, lllllllllllllIIIlllIIIllIIIllIIl, lllllllllllllIIIlllIIIllIIIllIII, lllllllllllllIIIlllIIIllIIIlIlll);
            }
            case 2: {
                return this.getIntsHeatIce(lllllllllllllIIIlllIIIllIIIlllll, lllllllllllllIIIlllIIIllIIIllIIl, lllllllllllllIIIlllIIIllIIIllIII, lllllllllllllIIIlllIIIllIIIlIlll);
            }
            case 3: {
                return this.getIntsSpecial(lllllllllllllIIIlllIIIllIIIlllll, lllllllllllllIIIlllIIIllIIIllIIl, lllllllllllllIIIlllIIIllIIIllIII, lllllllllllllIIIlllIIIllIIIlIlll);
            }
        }
    }
    
    public enum Mode
    {
        private static final /* synthetic */ String[] lIIIIlIlIlIIII;
        private static final /* synthetic */ int[] lIIIIlIlIlIIIl;
        
        HEAT_ICE(Mode.lIIIIlIlIlIIII[Mode.lIIIIlIlIlIIIl[1]], Mode.lIIIIlIlIlIIIl[1]), 
        COOL_WARM(Mode.lIIIIlIlIlIIII[Mode.lIIIIlIlIlIIIl[0]], Mode.lIIIIlIlIlIIIl[0]), 
        SPECIAL(Mode.lIIIIlIlIlIIII[Mode.lIIIIlIlIlIIIl[2]], Mode.lIIIIlIlIlIIIl[2]);
        
        private static boolean lIlllIIlllIllIl(final int lllllllllllllIlIIlIllIIIllIllIlI, final int lllllllllllllIlIIlIllIIIllIllIIl) {
            return lllllllllllllIlIIlIllIIIllIllIlI < lllllllllllllIlIIlIllIIIllIllIIl;
        }
        
        private static String lIlllIIlllIlIIl(final String lllllllllllllIlIIlIllIIIlllllIII, final String lllllllllllllIlIIlIllIIIlllllIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIllIIIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), Mode.lIIIIlIlIlIIIl[4]), "DES");
                final Cipher lllllllllllllIlIIlIllIIIllllllII = Cipher.getInstance("DES");
                lllllllllllllIlIIlIllIIIllllllII.init(Mode.lIIIIlIlIlIIIl[2], lllllllllllllIlIIlIllIIIllllllIl);
                return new String(lllllllllllllIlIIlIllIIIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIllIIIlllllIll) {
                lllllllllllllIlIIlIllIIIlllllIll.printStackTrace();
                return null;
            }
        }
        
        private static void lIlllIIlllIlIll() {
            (lIIIIlIlIlIIII = new String[Mode.lIIIIlIlIlIIIl[3]])[Mode.lIIIIlIlIlIIIl[0]] = lIlllIIlllIlIIl("0wI8AhiVPDW1XjVafv5xqw==", "xsQgL");
            Mode.lIIIIlIlIlIIII[Mode.lIIIIlIlIlIIIl[1]] = lIlllIIlllIlIIl("wO4bqiwgRMCokT35Cb0vxw==", "AGnDj");
            Mode.lIIIIlIlIlIIII[Mode.lIIIIlIlIlIIIl[2]] = lIlllIIlllIlIlI("BwoiABEVFg==", "TZgCX");
        }
        
        static {
            lIlllIIlllIllII();
            lIlllIIlllIlIll();
            final Mode[] enum$VALUES = new Mode[Mode.lIIIIlIlIlIIIl[3]];
            enum$VALUES[Mode.lIIIIlIlIlIIIl[0]] = Mode.COOL_WARM;
            enum$VALUES[Mode.lIIIIlIlIlIIIl[1]] = Mode.HEAT_ICE;
            enum$VALUES[Mode.lIIIIlIlIlIIIl[2]] = Mode.SPECIAL;
            ENUM$VALUES = enum$VALUES;
        }
        
        private Mode(final String lllllllllllllIlIIlIllIIlIIIIlIll, final int lllllllllllllIlIIlIllIIlIIIIlIlI) {
        }
        
        private static String lIlllIIlllIlIlI(String lllllllllllllIlIIlIllIIIlllIIlIl, final String lllllllllllllIlIIlIllIIIlllIIlII) {
            lllllllllllllIlIIlIllIIIlllIIlIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIllIIIlllIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIlIllIIIlllIlIII = new StringBuilder();
            final char[] lllllllllllllIlIIlIllIIIlllIIlll = lllllllllllllIlIIlIllIIIlllIIlII.toCharArray();
            int lllllllllllllIlIIlIllIIIlllIIllI = Mode.lIIIIlIlIlIIIl[0];
            final double lllllllllllllIlIIlIllIIIlllIIIII = (Object)((String)lllllllllllllIlIIlIllIIIlllIIlIl).toCharArray();
            final long lllllllllllllIlIIlIllIIIllIlllll = lllllllllllllIlIIlIllIIIlllIIIII.length;
            long lllllllllllllIlIIlIllIIIllIllllI = Mode.lIIIIlIlIlIIIl[0];
            while (lIlllIIlllIllIl((int)lllllllllllllIlIIlIllIIIllIllllI, (int)lllllllllllllIlIIlIllIIIllIlllll)) {
                final char lllllllllllllIlIIlIllIIIlllIlIll = lllllllllllllIlIIlIllIIIlllIIIII[lllllllllllllIlIIlIllIIIllIllllI];
                lllllllllllllIlIIlIllIIIlllIlIII.append((char)(lllllllllllllIlIIlIllIIIlllIlIll ^ lllllllllllllIlIIlIllIIIlllIIlll[lllllllllllllIlIIlIllIIIlllIIllI % lllllllllllllIlIIlIllIIIlllIIlll.length]));
                "".length();
                ++lllllllllllllIlIIlIllIIIlllIIllI;
                ++lllllllllllllIlIIlIllIIIllIllllI;
                "".length();
                if (" ".length() == -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIlIllIIIlllIlIII);
        }
        
        private static void lIlllIIlllIllII() {
            (lIIIIlIlIlIIIl = new int[5])[0] = ((0x8C ^ 0xA7) & ~(0x9A ^ 0xB1));
            Mode.lIIIIlIlIlIIIl[1] = " ".length();
            Mode.lIIIIlIlIlIIIl[2] = "  ".length();
            Mode.lIIIIlIlIlIIIl[3] = "   ".length();
            Mode.lIIIIlIlIlIIIl[4] = (0x6E ^ 0x66);
        }
    }
}
