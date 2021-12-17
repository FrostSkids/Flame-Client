// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.util.Iterator;
import net.minecraft.client.renderer.StitcherException;
import java.util.Arrays;
import net.minecraft.util.MathHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.util.Set;

public class Stitcher
{
    private final /* synthetic */ int maxHeight;
    private final /* synthetic */ boolean forcePowerOf2;
    private final /* synthetic */ int maxTileDimension;
    private final /* synthetic */ int maxWidth;
    private final /* synthetic */ Set<Holder> setStitchHolders;
    private final /* synthetic */ List<Slot> stitchSlots;
    private static final /* synthetic */ String[] llIIlIIlllIlII;
    private /* synthetic */ int currentWidth;
    private static final /* synthetic */ int[] llIIlIIlllIlIl;
    private final /* synthetic */ int mipmapLevelStitcher;
    private /* synthetic */ int currentHeight;
    
    public int getCurrentHeight() {
        return this.currentHeight;
    }
    
    private static void lIIIllIIlIlIIlII() {
        (llIIlIIlllIlII = new String[Stitcher.llIIlIIlllIlIl[3]])[Stitcher.llIIlIIlllIlIl[1]] = lIIIllIIlIlIIIll("npF2A/elabv1iTD84wS1fG3toex6b0QPTsNx6k6kRAgrbtojlxRllBVv/sCPESG4saQtzYcA2rPtYhpCdCKiltxmESC6sIslvKvzlEPtEDo=", "SmRhl");
    }
    
    private static boolean lIIIllIIlIlIllII(final int llllllllllllIlllIIlIIlIIIIllIlll, final int llllllllllllIlllIIlIIlIIIIllIllI) {
        return llllllllllllIlllIIlIIlIIIIllIlll > llllllllllllIlllIIlIIlIIIIllIllI;
    }
    
    public void addSprite(final TextureAtlasSprite llllllllllllIlllIIlIIlIIlIlllIll) {
        final Holder llllllllllllIlllIIlIIlIIlIlllIlI = new Holder(llllllllllllIlllIIlIIlIIlIlllIll, this.mipmapLevelStitcher);
        if (lIIIllIIlIlIIllI(this.maxTileDimension)) {
            llllllllllllIlllIIlIIlIIlIlllIlI.setNewDimension(this.maxTileDimension);
        }
        this.setStitchHolders.add(llllllllllllIlllIIlIIlIIlIlllIlI);
        "".length();
    }
    
    private static boolean lIIIllIIlIlIlIIl(final int llllllllllllIlllIIlIIlIIIIllIlII) {
        return llllllllllllIlllIIlIIlIIIIllIlII != 0;
    }
    
    private static String lIIIllIIlIlIIIll(final String llllllllllllIlllIIlIIlIIIlIIIlll, final String llllllllllllIlllIIlIIlIIIlIIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIIlIIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIlIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIIlIIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIIlIIIlIIlIIl.init(Stitcher.llIIlIIlllIlIl[4], llllllllllllIlllIIlIIlIIIlIIlIlI);
            return new String(llllllllllllIlllIIlIIlIIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIlIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIIlIIIlIIlIII) {
            llllllllllllIlllIIlIIlIIIlIIlIII.printStackTrace();
            return null;
        }
    }
    
    public Stitcher(final int llllllllllllIlllIIlIIlIIllIIlIlI, final int llllllllllllIlllIIlIIlIIllIIllll, final boolean llllllllllllIlllIIlIIlIIllIIlllI, final int llllllllllllIlllIIlIIlIIllIIllIl, final int llllllllllllIlllIIlIIlIIllIIllII) {
        this.setStitchHolders = (Set<Holder>)Sets.newHashSetWithExpectedSize(Stitcher.llIIlIIlllIlIl[0]);
        this.stitchSlots = (List<Slot>)Lists.newArrayListWithCapacity(Stitcher.llIIlIIlllIlIl[0]);
        this.mipmapLevelStitcher = llllllllllllIlllIIlIIlIIllIIllII;
        this.maxWidth = llllllllllllIlllIIlIIlIIllIIlIlI;
        this.maxHeight = llllllllllllIlllIIlIIlIIllIIllll;
        this.forcePowerOf2 = llllllllllllIlllIIlIIlIIllIIlllI;
        this.maxTileDimension = llllllllllllIlllIIlIIlIIllIIllIl;
    }
    
    public int getCurrentWidth() {
        return this.currentWidth;
    }
    
    static {
        lIIIllIIlIlIIlIl();
        lIIIllIIlIlIIlII();
    }
    
    private static boolean lIIIllIIlIlIIllI(final int llllllllllllIlllIIlIIlIIIIllIIII) {
        return llllllllllllIlllIIlIIlIIIIllIIII > 0;
    }
    
    private static boolean lIIIllIIlIlIlIll(final int llllllllllllIlllIIlIIlIIIIlIllIl, final int llllllllllllIlllIIlIIlIIIIlIllII) {
        return llllllllllllIlllIIlIIlIIIIlIllIl != llllllllllllIlllIIlIIlIIIIlIllII;
    }
    
    private static boolean lIIIllIIlIlIlIlI(final int llllllllllllIlllIIlIIlIIIIlllIll, final int llllllllllllIlllIIlIIlIIIIlllIlI) {
        return llllllllllllIlllIIlIIlIIIIlllIll <= llllllllllllIlllIIlIIlIIIIlllIlI;
    }
    
    private boolean expandAndAllocateSlot(final Holder llllllllllllIlllIIlIIlIIIlllIIlI) {
        final int llllllllllllIlllIIlIIlIIIlllIIIl = Math.min(llllllllllllIlllIIlIIlIIIlllIIlI.getWidth(), llllllllllllIlllIIlIIlIIIlllIIlI.getHeight());
        int n;
        if (lIIIllIIlIlIIlll(this.currentWidth) && lIIIllIIlIlIIlll(this.currentHeight)) {
            n = Stitcher.llIIlIIlllIlIl[3];
            "".length();
            if (((0xD9 ^ 0xC1) & ~(0x54 ^ 0x4C)) != 0x0) {
                return ((0x7B ^ 0x50) & ~(0xF ^ 0x24)) != 0x0;
            }
        }
        else {
            n = Stitcher.llIIlIIlllIlIl[1];
        }
        final boolean llllllllllllIlllIIlIIlIIIlllIIII = n != 0;
        boolean llllllllllllIlllIIlIIlIIIllIllIl;
        if (lIIIllIIlIlIlIIl(this.forcePowerOf2 ? 1 : 0)) {
            final int llllllllllllIlllIIlIIlIIIllIllII = MathHelper.roundUpToPowerOfTwo(this.currentWidth);
            final int llllllllllllIlllIIlIIlIIIllIlIll = MathHelper.roundUpToPowerOfTwo(this.currentHeight);
            final int llllllllllllIlllIIlIIlIIIllIlIlI = MathHelper.roundUpToPowerOfTwo(this.currentWidth + llllllllllllIlllIIlIIlIIIlllIIIl);
            final int llllllllllllIlllIIlIIlIIIllIlIIl = MathHelper.roundUpToPowerOfTwo(this.currentHeight + llllllllllllIlllIIlIIlIIIlllIIIl);
            int n2;
            if (lIIIllIIlIlIlIlI(llllllllllllIlllIIlIIlIIIllIlIlI, this.maxWidth)) {
                n2 = Stitcher.llIIlIIlllIlIl[3];
                "".length();
                if (null != null) {
                    return ((0xFF ^ 0xA4) & ~(0x31 ^ 0x6A)) != 0x0;
                }
            }
            else {
                n2 = Stitcher.llIIlIIlllIlIl[1];
            }
            final boolean llllllllllllIlllIIlIIlIIIllIlIII = n2 != 0;
            int n3;
            if (lIIIllIIlIlIlIlI(llllllllllllIlllIIlIIlIIIllIlIIl, this.maxHeight)) {
                n3 = Stitcher.llIIlIIlllIlIl[3];
                "".length();
                if ((0x64 ^ 0x34 ^ (0x41 ^ 0x15)) <= ((0x32 ^ 0x29 ^ (0xC0 ^ 0x91)) & (188 + 85 - 90 + 10 ^ 68 + 86 - 68 + 53 ^ -" ".length()))) {
                    return ((112 + 71 - 22 + 65 ^ 89 + 3 - 20 + 93) & (91 + 175 - 173 + 107 ^ 1 + 77 + 50 + 15 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n3 = Stitcher.llIIlIIlllIlIl[1];
            }
            final boolean llllllllllllIlllIIlIIlIIIllIIlll = n3 != 0;
            if (lIIIllIIlIlIIlll(llllllllllllIlllIIlIIlIIIllIlIII ? 1 : 0) && lIIIllIIlIlIIlll(llllllllllllIlllIIlIIlIIIllIIlll ? 1 : 0)) {
                return Stitcher.llIIlIIlllIlIl[1] != 0;
            }
            int n4;
            if (lIIIllIIlIlIlIll(llllllllllllIlllIIlIIlIIIllIllII, llllllllllllIlllIIlIIlIIIllIlIlI)) {
                n4 = Stitcher.llIIlIIlllIlIl[3];
                "".length();
                if (" ".length() != " ".length()) {
                    return ((0xA1 ^ 0x8F ^ (0xBF ^ 0x9D)) & (0xC1 ^ 0xA4 ^ (0xF4 ^ 0x9D) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n4 = Stitcher.llIIlIIlllIlIl[1];
            }
            final boolean llllllllllllIlllIIlIIlIIIllIIllI = n4 != 0;
            int n5;
            if (lIIIllIIlIlIlIll(llllllllllllIlllIIlIIlIIIllIlIll, llllllllllllIlllIIlIIlIIIllIlIIl)) {
                n5 = Stitcher.llIIlIIlllIlIl[3];
                "".length();
                if ((0x6D ^ 0x68) <= 0) {
                    return ((0x82 ^ 0xA7) & ~(0x9E ^ 0xBB)) != 0x0;
                }
            }
            else {
                n5 = Stitcher.llIIlIIlllIlIl[1];
            }
            final boolean llllllllllllIlllIIlIIlIIIllIIlIl = n5 != 0;
            if (lIIIllIIlIlIlIIl((llllllllllllIlllIIlIIlIIIllIIllI ^ llllllllllllIlllIIlIIlIIIllIIlIl) ? 1 : 0)) {
                int n6;
                if (lIIIllIIlIlIlIIl(llllllllllllIlllIIlIIlIIIllIIllI ? 1 : 0)) {
                    n6 = Stitcher.llIIlIIlllIlIl[1];
                    "".length();
                    if (((0x66 ^ 0x7) & ~(0x2C ^ 0x4D)) != ((0x15 ^ 0x30) & ~(0x8D ^ 0xA8))) {
                        return ((0x3B ^ 0xC) & ~(0x6 ^ 0x31)) != 0x0;
                    }
                }
                else {
                    n6 = Stitcher.llIIlIIlllIlIl[3];
                }
                final boolean llllllllllllIlllIIlIIlIIIllIllll = n6 != 0;
                "".length();
                if ((120 + 16 - 119 + 130 ^ 102 + 56 - 94 + 87) <= 0) {
                    return ((0x7B ^ 0x27 ^ (0xD8 ^ 0xA2)) & (0x2A ^ 0x5A ^ (0xF5 ^ 0xA3) ^ -" ".length())) != 0x0;
                }
            }
            else {
                int n7;
                if (lIIIllIIlIlIlIIl(llllllllllllIlllIIlIIlIIIllIlIII ? 1 : 0) && lIIIllIIlIlIlIlI(llllllllllllIlllIIlIIlIIIllIllII, llllllllllllIlllIIlIIlIIIllIlIll)) {
                    n7 = Stitcher.llIIlIIlllIlIl[3];
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((0x4F ^ 0x10) & ~(0x1E ^ 0x41)) != 0x0;
                    }
                }
                else {
                    n7 = Stitcher.llIIlIIlllIlIl[1];
                }
                final boolean llllllllllllIlllIIlIIlIIIllIlllI = n7 != 0;
                "".length();
                if ("   ".length() == "  ".length()) {
                    return ((0xAF ^ 0xB6) & ~(0x87 ^ 0x9E)) != 0x0;
                }
            }
        }
        else {
            int n8;
            if (lIIIllIIlIlIlIlI(this.currentWidth + llllllllllllIlllIIlIIlIIIlllIIIl, this.maxWidth)) {
                n8 = Stitcher.llIIlIIlllIlIl[3];
                "".length();
                if (null != null) {
                    return ((0x7 ^ 0x0) & ~(0x60 ^ 0x67)) != 0x0;
                }
            }
            else {
                n8 = Stitcher.llIIlIIlllIlIl[1];
            }
            final boolean llllllllllllIlllIIlIIlIIIllIIlII = n8 != 0;
            int n9;
            if (lIIIllIIlIlIlIlI(this.currentHeight + llllllllllllIlllIIlIIlIIIlllIIIl, this.maxHeight)) {
                n9 = Stitcher.llIIlIIlllIlIl[3];
                "".length();
                if (null != null) {
                    return ((0x55 ^ 0x7E) & ~(0xC ^ 0x27)) != 0x0;
                }
            }
            else {
                n9 = Stitcher.llIIlIIlllIlIl[1];
            }
            final boolean llllllllllllIlllIIlIIlIIIllIIIll = n9 != 0;
            if (lIIIllIIlIlIIlll(llllllllllllIlllIIlIIlIIIllIIlII ? 1 : 0) && lIIIllIIlIlIIlll(llllllllllllIlllIIlIIlIIIllIIIll ? 1 : 0)) {
                return Stitcher.llIIlIIlllIlIl[1] != 0;
            }
            int n10;
            if (lIIIllIIlIlIlIIl(llllllllllllIlllIIlIIlIIIllIIlII ? 1 : 0) && (!lIIIllIIlIlIIlll(llllllllllllIlllIIlIIlIIIlllIIII ? 1 : 0) || lIIIllIIlIlIlIlI(this.currentWidth, this.currentHeight))) {
                n10 = Stitcher.llIIlIIlllIlIl[3];
                "".length();
                if (((21 + 131 - 29 + 97 ^ 42 + 141 - 72 + 78) & (42 + 39 + 74 + 50 ^ 56 + 137 - 170 + 149 ^ -" ".length())) != 0x0) {
                    return ((0x4B ^ 0x8 ^ (0xEE ^ 0x8B)) & (0x2E ^ 0x4 ^ (0xA7 ^ 0xAB) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n10 = Stitcher.llIIlIIlllIlIl[1];
            }
            llllllllllllIlllIIlIIlIIIllIllIl = (n10 != 0);
        }
        final int llllllllllllIlllIIlIIlIIIllIIIlI = Math.max(llllllllllllIlllIIlIIlIIIlllIIlI.getWidth(), llllllllllllIlllIIlIIlIIIlllIIlI.getHeight());
        int n11;
        if (lIIIllIIlIlIlIIl(llllllllllllIlllIIlIIlIIIllIllIl ? 1 : 0)) {
            n11 = this.currentHeight;
            "".length();
            if (((0x1A ^ 0x5C) & ~(0x62 ^ 0x24)) > 0) {
                return ((0x92 ^ 0xB1) & ~(0x95 ^ 0xB6)) != 0x0;
            }
        }
        else {
            n11 = this.currentWidth;
        }
        final int roundUpToPowerOfTwo = MathHelper.roundUpToPowerOfTwo(n11 + llllllllllllIlllIIlIIlIIIllIIIlI);
        int llllllllllllIlllIIlIIlIIIIllIllI;
        if (lIIIllIIlIlIlIIl(llllllllllllIlllIIlIIlIIIllIllIl ? 1 : 0)) {
            llllllllllllIlllIIlIIlIIIIllIllI = this.maxHeight;
            "".length();
            if ((0xA6 ^ 0xA2) > (0x4D ^ 0x49)) {
                return ((0x2D ^ 0x75) & ~(0xE6 ^ 0xBE)) != 0x0;
            }
        }
        else {
            llllllllllllIlllIIlIIlIIIIllIllI = this.maxWidth;
        }
        if (lIIIllIIlIlIllII(roundUpToPowerOfTwo, llllllllllllIlllIIlIIlIIIIllIllI)) {
            return Stitcher.llIIlIIlllIlIl[1] != 0;
        }
        Slot llllllllllllIlllIIlIIlIIIllIIIII = null;
        if (lIIIllIIlIlIlIIl(llllllllllllIlllIIlIIlIIIllIllIl ? 1 : 0)) {
            if (lIIIllIIlIlIllII(llllllllllllIlllIIlIIlIIIlllIIlI.getWidth(), llllllllllllIlllIIlIIlIIIlllIIlI.getHeight())) {
                llllllllllllIlllIIlIIlIIIlllIIlI.rotate();
            }
            if (lIIIllIIlIlIIlll(this.currentHeight)) {
                this.currentHeight = llllllllllllIlllIIlIIlIIIlllIIlI.getHeight();
            }
            final Slot llllllllllllIlllIIlIIlIIIllIIIIl = new Slot(this.currentWidth, Stitcher.llIIlIIlllIlIl[1], llllllllllllIlllIIlIIlIIIlllIIlI.getWidth(), this.currentHeight);
            this.currentWidth += llllllllllllIlllIIlIIlIIIlllIIlI.getWidth();
            "".length();
            if ("  ".length() <= 0) {
                return ((0x32 ^ 0x27 ^ (0x6E ^ 0x73)) & (0x8 ^ 0x39 ^ (0x70 ^ 0x49) ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIlllIIlIIlIIIllIIIII = new Slot(Stitcher.llIIlIIlllIlIl[1], this.currentHeight, this.currentWidth, llllllllllllIlllIIlIIlIIIlllIIlI.getHeight());
            this.currentHeight += llllllllllllIlllIIlIIlIIIlllIIlI.getHeight();
        }
        llllllllllllIlllIIlIIlIIIllIIIII.addSlot(llllllllllllIlllIIlIIlIIIlllIIlI);
        "".length();
        this.stitchSlots.add(llllllllllllIlllIIlIIlIIIllIIIII);
        "".length();
        return Stitcher.llIIlIIlllIlIl[3] != 0;
    }
    
    private static int getMipmapDimension(final int llllllllllllIlllIIlIIlIIlIIIllIl, final int llllllllllllIlllIIlIIlIIlIIIllII) {
        final int n = llllllllllllIlllIIlIIlIIlIIIllIl >> llllllllllllIlllIIlIIlIIlIIIllII;
        int n2;
        if (lIIIllIIlIlIIlll(llllllllllllIlllIIlIIlIIlIIIllIl & (Stitcher.llIIlIIlllIlIl[3] << llllllllllllIlllIIlIIlIIlIIIllII) - Stitcher.llIIlIIlllIlIl[3])) {
            n2 = Stitcher.llIIlIIlllIlIl[1];
            "".length();
            if (((0x20 ^ 0x66) & ~(0x3A ^ 0x7C)) != 0x0) {
                return (0x15 ^ 0x21) & ~(0x13 ^ 0x27);
            }
        }
        else {
            n2 = Stitcher.llIIlIIlllIlIl[3];
        }
        return n + n2 << llllllllllllIlllIIlIIlIIlIIIllII;
    }
    
    private boolean allocateSlot(final Holder llllllllllllIlllIIlIIlIIlIIIIlIl) {
        int llllllllllllIlllIIlIIlIIlIIIIlII = Stitcher.llIIlIIlllIlIl[1];
        "".length();
        if ("  ".length() != "  ".length()) {
            return ((118 + 125 - 146 + 39 ^ 179 + 118 - 271 + 162) & (0xF2 ^ 0xBD ^ (0x9 ^ 0x72) ^ -" ".length())) != 0x0;
        }
        while (!lIIIllIIlIlIlIII(llllllllllllIlllIIlIIlIIlIIIIlII, this.stitchSlots.size())) {
            if (lIIIllIIlIlIlIIl(this.stitchSlots.get(llllllllllllIlllIIlIIlIIlIIIIlII).addSlot(llllllllllllIlllIIlIIlIIlIIIIlIl) ? 1 : 0)) {
                return Stitcher.llIIlIIlllIlIl[3] != 0;
            }
            llllllllllllIlllIIlIIlIIlIIIIlIl.rotate();
            if (lIIIllIIlIlIlIIl(this.stitchSlots.get(llllllllllllIlllIIlIIlIIlIIIIlII).addSlot(llllllllllllIlllIIlIIlIIlIIIIlIl) ? 1 : 0)) {
                return Stitcher.llIIlIIlllIlIl[3] != 0;
            }
            llllllllllllIlllIIlIIlIIlIIIIlIl.rotate();
            ++llllllllllllIlllIIlIIlIIlIIIIlII;
        }
        return this.expandAndAllocateSlot(llllllllllllIlllIIlIIlIIlIIIIlIl);
    }
    
    public void doStitch() {
        final Holder[] llllllllllllIlllIIlIIlIIlIlIlllI = this.setStitchHolders.toArray(new Holder[this.setStitchHolders.size()]);
        Arrays.sort(llllllllllllIlllIIlIIlIIlIlIlllI);
        final Exception llllllllllllIlllIIlIIlIIlIlIIllI;
        final boolean llllllllllllIlllIIlIIlIIlIlIIlll = ((Holder[])(Object)(llllllllllllIlllIIlIIlIIlIlIIllI = (Exception)(Object)llllllllllllIlllIIlIIlIIlIlIlllI)).length != 0;
        int llllllllllllIlllIIlIIlIIlIlIlIII = Stitcher.llIIlIIlllIlIl[1];
        "".length();
        if (((0x3B ^ 0x6A) & ~(0xC ^ 0x5D)) != 0x0) {
            return;
        }
        while (!lIIIllIIlIlIlIII(llllllllllllIlllIIlIIlIIlIlIlIII, llllllllllllIlllIIlIIlIIlIlIIlll ? 1 : 0)) {
            final Holder llllllllllllIlllIIlIIlIIlIlIllIl = llllllllllllIlllIIlIIlIIlIlIIllI[llllllllllllIlllIIlIIlIIlIlIlIII];
            if (lIIIllIIlIlIIlll(this.allocateSlot(llllllllllllIlllIIlIIlIIlIlIllIl) ? 1 : 0)) {
                final String format = Stitcher.llIIlIIlllIlII[Stitcher.llIIlIIlllIlIl[1]];
                final Object[] args = new Object[Stitcher.llIIlIIlllIlIl[2]];
                args[Stitcher.llIIlIIlllIlIl[1]] = llllllllllllIlllIIlIIlIIlIlIllIl.getAtlasSprite().getIconName();
                args[Stitcher.llIIlIIlllIlIl[3]] = llllllllllllIlllIIlIIlIIlIlIllIl.getAtlasSprite().getIconWidth();
                args[Stitcher.llIIlIIlllIlIl[4]] = llllllllllllIlllIIlIIlIIlIlIllIl.getAtlasSprite().getIconHeight();
                final String llllllllllllIlllIIlIIlIIlIlIllII = String.format(format, args);
                throw new StitcherException(llllllllllllIlllIIlIIlIIlIlIllIl, llllllllllllIlllIIlIIlIIlIlIllII);
            }
            ++llllllllllllIlllIIlIIlIIlIlIlIII;
        }
        if (lIIIllIIlIlIlIIl(this.forcePowerOf2 ? 1 : 0)) {
            this.currentWidth = MathHelper.roundUpToPowerOfTwo(this.currentWidth);
            this.currentHeight = MathHelper.roundUpToPowerOfTwo(this.currentHeight);
        }
    }
    
    public List<TextureAtlasSprite> getStichSlots() {
        final List<Slot> llllllllllllIlllIIlIIlIIlIIlllII = (List<Slot>)Lists.newArrayList();
        final int llllllllllllIlllIIlIIlIIlIIlIIll = (int)this.stitchSlots.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIIllIIlIlIIlll(((Iterator)llllllllllllIlllIIlIIlIIlIIlIIll).hasNext() ? 1 : 0)) {
            final Slot llllllllllllIlllIIlIIlIIlIIllIll = ((Iterator<Slot>)llllllllllllIlllIIlIIlIIlIIlIIll).next();
            llllllllllllIlllIIlIIlIIlIIllIll.getAllStitchSlots(llllllllllllIlllIIlIIlIIlIIlllII);
        }
        final List<TextureAtlasSprite> llllllllllllIlllIIlIIlIIlIIllIlI = (List<TextureAtlasSprite>)Lists.newArrayList();
        final byte llllllllllllIlllIIlIIlIIlIIlIIlI = (byte)llllllllllllIlllIIlIIlIIlIIlllII.iterator();
        "".length();
        if ("  ".length() <= 0) {
            return null;
        }
        while (!lIIIllIIlIlIIlll(((Iterator)llllllllllllIlllIIlIIlIIlIIlIIlI).hasNext() ? 1 : 0)) {
            final Slot llllllllllllIlllIIlIIlIIlIIllIIl = ((Iterator<Slot>)llllllllllllIlllIIlIIlIIlIIlIIlI).next();
            final Holder llllllllllllIlllIIlIIlIIlIIllIII = llllllllllllIlllIIlIIlIIlIIllIIl.getStitchHolder();
            final TextureAtlasSprite llllllllllllIlllIIlIIlIIlIIlIlll = llllllllllllIlllIIlIIlIIlIIllIII.getAtlasSprite();
            llllllllllllIlllIIlIIlIIlIIlIlll.initSprite(this.currentWidth, this.currentHeight, llllllllllllIlllIIlIIlIIlIIllIIl.getOriginX(), llllllllllllIlllIIlIIlIIlIIllIIl.getOriginY(), llllllllllllIlllIIlIIlIIlIIllIII.isRotated());
            llllllllllllIlllIIlIIlIIlIIllIlI.add(llllllllllllIlllIIlIIlIIlIIlIlll);
            "".length();
        }
        return llllllllllllIlllIIlIIlIIlIIllIlI;
    }
    
    private static boolean lIIIllIIlIlIIlll(final int llllllllllllIlllIIlIIlIIIIllIIlI) {
        return llllllllllllIlllIIlIIlIIIIllIIlI == 0;
    }
    
    private static void lIIIllIIlIlIIlIl() {
        (llIIlIIlllIlIl = new int[5])[0] = (-(-1 & 0x6FF) & (0xFFFFE7FE & 0x1FFF));
        Stitcher.llIIlIIlllIlIl[1] = ((0x47 ^ 0x1E) & ~(0x3A ^ 0x63));
        Stitcher.llIIlIIlllIlIl[2] = "   ".length();
        Stitcher.llIIlIIlllIlIl[3] = " ".length();
        Stitcher.llIIlIIlllIlIl[4] = "  ".length();
    }
    
    private static boolean lIIIllIIlIlIlIII(final int llllllllllllIlllIIlIIlIIIIllllll, final int llllllllllllIlllIIlIIlIIIIlllllI) {
        return llllllllllllIlllIIlIIlIIIIllllll >= llllllllllllIlllIIlIIlIIIIlllllI;
    }
    
    public static class Slot
    {
        private final /* synthetic */ int height;
        private /* synthetic */ Holder holder;
        private final /* synthetic */ int originY;
        private static final /* synthetic */ String[] lllllIIIllIlI;
        private /* synthetic */ List<Slot> subSlots;
        private static final /* synthetic */ int[] lllllIIIlllIl;
        private final /* synthetic */ int width;
        private final /* synthetic */ int originX;
        
        private static boolean lIlIllIlIlIlIIl(final int lllllllllllllIlIllIIIIIlIIIIIlIl, final int lllllllllllllIlIllIIIIIlIIIIIlII) {
            return lllllllllllllIlIllIIIIIlIIIIIlIl == lllllllllllllIlIllIIIIIlIIIIIlII;
        }
        
        private static void lIlIllIlIlIIllI() {
            (lllllIIIlllIl = new int[8])[0] = ((0x6C ^ 0x3B ^ (0x21 ^ 0x78)) & (0x13 ^ 0x60 ^ (0xE0 ^ 0x9D) ^ -" ".length()));
            Slot.lllllIIIlllIl[1] = " ".length();
            Slot.lllllIIIlllIl[2] = "  ".length();
            Slot.lllllIIIlllIl[3] = "   ".length();
            Slot.lllllIIIlllIl[4] = (0xF ^ 0x66 ^ (0xE1 ^ 0x8C));
            Slot.lllllIIIlllIl[5] = (0x20 ^ 0x2C ^ (0x44 ^ 0x4D));
            Slot.lllllIIIlllIl[6] = (0xAF ^ 0xBB ^ (0x60 ^ 0x9));
            Slot.lllllIIIlllIl[7] = (0x26 ^ 0x45 ^ (0x3B ^ 0x5E));
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder(Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[0]]).append(this.originX).append(Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[1]]).append(this.originY).append(Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[2]]).append(this.width).append(Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[3]]).append(this.height).append(Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[4]]).append(this.holder).append(Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[5]]).append(this.subSlots).append((char)Slot.lllllIIIlllIl[6]));
        }
        
        public Holder getStitchHolder() {
            return this.holder;
        }
        
        private static void lIlIllIlIlIIIlI() {
            (lllllIIIllIlI = new String[Slot.lllllIIIlllIl[7]])[Slot.lllllIIIlllIl[0]] = lIlIllIlIIllllI("IBYkACIcCCITMB0idg==", "szKtY");
            Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[1]] = lIlIllIlIIllllI("amoLFx0hIwo8SQ==", "FJdet");
            Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[2]] = lIlIllIlIlIIIII("BEdx9FhyL45O9xmaHDMwNg==", "UALSl");
            Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[3]] = lIlIllIlIIllllI("dHoZFwQ/MgVP", "XZqrm");
            Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[4]] = lIlIllIlIIllllI("QmEMBgkaNAoGTA==", "nAxcq");
            Slot.lllllIIIllIlI[Slot.lllllIIIlllIl[5]] = lIlIllIlIlIIIII("FrDJbUOKbZLJK313zX9vlQ==", "AnySf");
        }
        
        private static boolean lIlIllIlIlIllIl(final int lllllllllllllIlIllIIIIIIllllIIII) {
            return lllllllllllllIlIllIIIIIIllllIIII == 0;
        }
        
        public int getOriginY() {
            return this.originY;
        }
        
        private static String lIlIllIlIlIIIII(final String lllllllllllllIlIllIIIIIlIIIIlIll, final String lllllllllllllIlIllIIIIIlIIIIllII) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIIIlIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIIlIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIllIIIIIlIIIIllll = Cipher.getInstance("Blowfish");
                lllllllllllllIlIllIIIIIlIIIIllll.init(Slot.lllllIIIlllIl[2], lllllllllllllIlIllIIIIIlIIIlIIII);
                return new String(lllllllllllllIlIllIIIIIlIIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIlIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIIIlIIIIlllI) {
                lllllllllllllIlIllIIIIIlIIIIlllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIllIlIlIllII(final int lllllllllllllIlIllIIIIIlIIIIIIIl, final int lllllllllllllIlIllIIIIIlIIIIIIII) {
            return lllllllllllllIlIllIIIIIlIIIIIIIl >= lllllllllllllIlIllIIIIIlIIIIIIII;
        }
        
        static {
            lIlIllIlIlIIllI();
            lIlIllIlIlIIIlI();
        }
        
        private static boolean lIlIllIlIlIlIlI(final Object lllllllllllllIlIllIIIIIIllllIlII) {
            return lllllllllllllIlIllIIIIIIllllIlII == null;
        }
        
        public Slot(final int lllllllllllllIlIllIIIIIlIllIIIII, final int lllllllllllllIlIllIIIIIlIllIIlII, final int lllllllllllllIlIllIIIIIlIlIllllI, final int lllllllllllllIlIllIIIIIlIllIIIlI) {
            this.originX = lllllllllllllIlIllIIIIIlIllIIIII;
            this.originY = lllllllllllllIlIllIIIIIlIllIIlII;
            this.width = lllllllllllllIlIllIIIIIlIlIllllI;
            this.height = lllllllllllllIlIllIIIIIlIllIIIlI;
        }
        
        private static boolean lIlIllIlIlIlIll(final int lllllllllllllIlIllIIIIIIlllIlllI) {
            return lllllllllllllIlIllIIIIIIlllIlllI > 0;
        }
        
        public int getOriginX() {
            return this.originX;
        }
        
        private static boolean lIlIllIlIlIllll(final int lllllllllllllIlIllIIIIIIllllllIl, final int lllllllllllllIlIllIIIIIIllllllII) {
            return lllllllllllllIlIllIIIIIIllllllIl < lllllllllllllIlIllIIIIIIllllllII;
        }
        
        public void getAllStitchSlots(final List<Slot> lllllllllllllIlIllIIIIIlIIllIIlI) {
            if (lIlIllIlIlIIlll(this.holder)) {
                lllllllllllllIlIllIIIIIlIIllIIlI.add(this);
                "".length();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else if (lIlIllIlIlIIlll(this.subSlots)) {
                final short lllllllllllllIlIllIIIIIlIIllIIII = (short)this.subSlots.iterator();
                "".length();
                if (" ".length() < -" ".length()) {
                    return;
                }
                while (!lIlIllIlIlIllIl(((Iterator)lllllllllllllIlIllIIIIIlIIllIIII).hasNext() ? 1 : 0)) {
                    final Slot lllllllllllllIlIllIIIIIlIIllIlII = ((Iterator<Slot>)lllllllllllllIlIllIIIIIlIIllIIII).next();
                    lllllllllllllIlIllIIIIIlIIllIlII.getAllStitchSlots(lllllllllllllIlIllIIIIIlIIllIIlI);
                }
            }
        }
        
        private static boolean lIlIllIlIlIlIII(final int lllllllllllllIlIllIIIIIIlllllIIl, final int lllllllllllllIlIllIIIIIIlllllIII) {
            return lllllllllllllIlIllIIIIIIlllllIIl <= lllllllllllllIlIllIIIIIIlllllIII;
        }
        
        private static String lIlIllIlIIllllI(String lllllllllllllIlIllIIIIIlIIIlllIl, final String lllllllllllllIlIllIIIIIlIIIlllII) {
            lllllllllllllIlIllIIIIIlIIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIllIIIIIlIIlIIIII = new StringBuilder();
            final char[] lllllllllllllIlIllIIIIIlIIIlllll = lllllllllllllIlIllIIIIIlIIIlllII.toCharArray();
            int lllllllllllllIlIllIIIIIlIIIllllI = Slot.lllllIIIlllIl[0];
            final int lllllllllllllIlIllIIIIIlIIIllIII = (Object)lllllllllllllIlIllIIIIIlIIIlllIl.toCharArray();
            final int lllllllllllllIlIllIIIIIlIIIlIlll = lllllllllllllIlIllIIIIIlIIIllIII.length;
            boolean lllllllllllllIlIllIIIIIlIIIlIllI = Slot.lllllIIIlllIl[0] != 0;
            while (lIlIllIlIlIllll(lllllllllllllIlIllIIIIIlIIIlIllI ? 1 : 0, lllllllllllllIlIllIIIIIlIIIlIlll)) {
                final char lllllllllllllIlIllIIIIIlIIlIIIll = lllllllllllllIlIllIIIIIlIIIllIII[lllllllllllllIlIllIIIIIlIIIlIllI];
                lllllllllllllIlIllIIIIIlIIlIIIII.append((char)(lllllllllllllIlIllIIIIIlIIlIIIll ^ lllllllllllllIlIllIIIIIlIIIlllll[lllllllllllllIlIllIIIIIlIIIllllI % lllllllllllllIlIllIIIIIlIIIlllll.length]));
                "".length();
                ++lllllllllllllIlIllIIIIIlIIIllllI;
                ++lllllllllllllIlIllIIIIIlIIIlIllI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIllIIIIIlIIlIIIII);
        }
        
        private static boolean lIlIllIlIlIIlll(final Object lllllllllllllIlIllIIIIIIllllIllI) {
            return lllllllllllllIlIllIIIIIIllllIllI != null;
        }
        
        public boolean addSlot(final Holder lllllllllllllIlIllIIIIIlIlIIlIlI) {
            if (lIlIllIlIlIIlll(this.holder)) {
                return Slot.lllllIIIlllIl[0] != 0;
            }
            final int lllllllllllllIlIllIIIIIlIlIIlIIl = lllllllllllllIlIllIIIIIlIlIIlIlI.getWidth();
            final int lllllllllllllIlIllIIIIIlIlIIlIII = lllllllllllllIlIllIIIIIlIlIIlIlI.getHeight();
            if (!lIlIllIlIlIlIII(lllllllllllllIlIllIIIIIlIlIIlIIl, this.width) || !lIlIllIlIlIlIII(lllllllllllllIlIllIIIIIlIlIIlIII, this.height)) {
                return Slot.lllllIIIlllIl[0] != 0;
            }
            if (lIlIllIlIlIlIIl(lllllllllllllIlIllIIIIIlIlIIlIIl, this.width) && lIlIllIlIlIlIIl(lllllllllllllIlIllIIIIIlIlIIlIII, this.height)) {
                this.holder = lllllllllllllIlIllIIIIIlIlIIlIlI;
                return Slot.lllllIIIlllIl[1] != 0;
            }
            if (lIlIllIlIlIlIlI(this.subSlots)) {
                this.subSlots = (List<Slot>)Lists.newArrayListWithCapacity(Slot.lllllIIIlllIl[1]);
                this.subSlots.add(new Slot(this.originX, this.originY, lllllllllllllIlIllIIIIIlIlIIlIIl, lllllllllllllIlIllIIIIIlIlIIlIII));
                "".length();
                final int lllllllllllllIlIllIIIIIlIlIIIlll = this.width - lllllllllllllIlIllIIIIIlIlIIlIIl;
                final int lllllllllllllIlIllIIIIIlIlIIIllI = this.height - lllllllllllllIlIllIIIIIlIlIIlIII;
                if (lIlIllIlIlIlIll(lllllllllllllIlIllIIIIIlIlIIIllI) && lIlIllIlIlIlIll(lllllllllllllIlIllIIIIIlIlIIIlll)) {
                    final int lllllllllllllIlIllIIIIIlIlIIIlIl = Math.max(this.height, lllllllllllllIlIllIIIIIlIlIIIlll);
                    final int lllllllllllllIlIllIIIIIlIlIIIlII = Math.max(this.width, lllllllllllllIlIllIIIIIlIlIIIllI);
                    if (lIlIllIlIlIllII(lllllllllllllIlIllIIIIIlIlIIIlIl, lllllllllllllIlIllIIIIIlIlIIIlII)) {
                        this.subSlots.add(new Slot(this.originX, this.originY + lllllllllllllIlIllIIIIIlIlIIlIII, lllllllllllllIlIllIIIIIlIlIIlIIl, lllllllllllllIlIllIIIIIlIlIIIllI));
                        "".length();
                        this.subSlots.add(new Slot(this.originX + lllllllllllllIlIllIIIIIlIlIIlIIl, this.originY, lllllllllllllIlIllIIIIIlIlIIIlll, this.height));
                        "".length();
                        "".length();
                        if ("  ".length() < ((0x2A ^ 0x3 ^ (0xEA ^ 0x9C)) & (0x8A ^ 0x96 ^ (0x1E ^ 0x5D) ^ -" ".length()))) {
                            return ((57 + 52 - 62 + 123 ^ 33 + 9 + 47 + 49) & (120 + 154 - 248 + 153 ^ 10 + 64 - 4 + 77 ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        this.subSlots.add(new Slot(this.originX + lllllllllllllIlIllIIIIIlIlIIlIIl, this.originY, lllllllllllllIlIllIIIIIlIlIIIlll, lllllllllllllIlIllIIIIIlIlIIlIII));
                        "".length();
                        this.subSlots.add(new Slot(this.originX, this.originY + lllllllllllllIlIllIIIIIlIlIIlIII, this.width, lllllllllllllIlIllIIIIIlIlIIIllI));
                        "".length();
                        "".length();
                        if ("  ".length() <= 0) {
                            return ((0x45 ^ 0x5A ^ (0x3 ^ 0x47)) & (107 + 54 - 91 + 136 ^ 126 + 108 - 127 + 42 ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else if (lIlIllIlIlIllIl(lllllllllllllIlIllIIIIIlIlIIIlll)) {
                    this.subSlots.add(new Slot(this.originX, this.originY + lllllllllllllIlIllIIIIIlIlIIlIII, lllllllllllllIlIllIIIIIlIlIIlIIl, lllllllllllllIlIllIIIIIlIlIIIllI));
                    "".length();
                    "".length();
                    if (-(0x69 ^ 0x6C) >= 0) {
                        return ((0x78 ^ 0x2B) & ~(0xD3 ^ 0x80)) != 0x0;
                    }
                }
                else if (lIlIllIlIlIllIl(lllllllllllllIlIllIIIIIlIlIIIllI)) {
                    this.subSlots.add(new Slot(this.originX + lllllllllllllIlIllIIIIIlIlIIlIIl, this.originY, lllllllllllllIlIllIIIIIlIlIIIlll, lllllllllllllIlIllIIIIIlIlIIlIII));
                    "".length();
                }
            }
            final Iterator<Slot> iterator = this.subSlots.iterator();
            "".length();
            if (null != null) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
            }
            while (!lIlIllIlIlIllIl(iterator.hasNext() ? 1 : 0)) {
                final Slot lllllllllllllIlIllIIIIIlIlIIIIll = iterator.next();
                if (lIlIllIlIlIlllI(lllllllllllllIlIllIIIIIlIlIIIIll.addSlot(lllllllllllllIlIllIIIIIlIlIIlIlI) ? 1 : 0)) {
                    return Slot.lllllIIIlllIl[1] != 0;
                }
            }
            return Slot.lllllIIIlllIl[0] != 0;
        }
        
        private static boolean lIlIllIlIlIlllI(final int lllllllllllllIlIllIIIIIIllllIIlI) {
            return lllllllllllllIlIllIIIIIIllllIIlI != 0;
        }
    }
    
    public static class Holder implements Comparable<Holder>
    {
        private /* synthetic */ float scaleFactor;
        private final /* synthetic */ int mipmapLevelHolder;
        private final /* synthetic */ int width;
        private static final /* synthetic */ int[] lIIIIIIlllllIl;
        private static final /* synthetic */ String[] lIIIIIIllllIll;
        private final /* synthetic */ int height;
        private final /* synthetic */ TextureAtlasSprite theTexture;
        private /* synthetic */ boolean rotated;
        
        public void rotate() {
            int rotated;
            if (lIllIlIlIlIIIII(this.rotated ? 1 : 0)) {
                rotated = Holder.lIIIIIIlllllIl[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                rotated = Holder.lIIIIIIlllllIl[0];
            }
            this.rotated = (rotated != 0);
        }
        
        private static boolean lIllIlIlIlIIIII(final int lllllllllllllIlIIllllllIlIIIIlll) {
            return lllllllllllllIlIIllllllIlIIIIlll != 0;
        }
        
        public int getHeight() {
            int n;
            if (lIllIlIlIlIIIII(this.rotated ? 1 : 0)) {
                n = getMipmapDimension((int)(this.width * this.scaleFactor), this.mipmapLevelHolder);
                "".length();
                if (" ".length() <= -" ".length()) {
                    return (0x53 ^ 0x3) & ~(0x53 ^ 0x3);
                }
            }
            else {
                n = getMipmapDimension((int)(this.height * this.scaleFactor), this.mipmapLevelHolder);
            }
            return n;
        }
        
        public int getWidth() {
            int n;
            if (lIllIlIlIlIIIII(this.rotated ? 1 : 0)) {
                n = getMipmapDimension((int)(this.height * this.scaleFactor), this.mipmapLevelHolder);
                "".length();
                if (((171 + 121 - 130 + 19 ^ 33 + 136 - 32 + 0) & (((0xA9 ^ 0xB2) & ~(0x64 ^ 0x7F)) ^ (0x2D ^ 0x11) ^ -" ".length())) != 0x0) {
                    return (41 + 30 + 109 + 74 ^ 53 + 55 - 43 + 95) & (117 + 134 - 102 + 70 ^ 42 + 61 + 4 + 26 ^ -" ".length());
                }
            }
            else {
                n = getMipmapDimension((int)(this.width * this.scaleFactor), this.mipmapLevelHolder);
            }
            return n;
        }
        
        @Override
        public int compareTo(final Holder lllllllllllllIlIIllllllIllIIIlIl) {
            int lllllllllllllIlIIllllllIllIIIIll = 0;
            if (lIllIlIlIlIIIIl(this.getHeight(), lllllllllllllIlIIllllllIllIIIlIl.getHeight())) {
                if (lIllIlIlIlIIIIl(this.getWidth(), lllllllllllllIlIIllllllIllIIIlIl.getWidth())) {
                    if (lIllIlIlIlIIIlI(this.theTexture.getIconName())) {
                        int n;
                        if (lIllIlIlIlIIIlI(lllllllllllllIlIIllllllIllIIIlIl.theTexture.getIconName())) {
                            n = Holder.lIIIIIIlllllIl[1];
                            "".length();
                            if ("  ".length() < ((0x2A ^ 0x3A ^ (0x34 ^ 0x1B)) & (133 + 63 - 154 + 104 ^ 84 + 41 + 8 + 40 ^ -" ".length()))) {
                                return (42 + 166 - 198 + 165 ^ 18 + 25 + 27 + 114) & (0x1F ^ 0x3C ^ (0x7E ^ 0x4A) ^ -" ".length());
                            }
                        }
                        else {
                            n = Holder.lIIIIIIlllllIl[3];
                        }
                        return n;
                    }
                    return this.theTexture.getIconName().compareTo(lllllllllllllIlIIllllllIllIIIlIl.theTexture.getIconName());
                }
                else {
                    int n2;
                    if (lIllIlIlIlIIIll(this.getWidth(), lllllllllllllIlIIllllllIllIIIlIl.getWidth())) {
                        n2 = Holder.lIIIIIIlllllIl[0];
                        "".length();
                        if (" ".length() == 0) {
                            return (0x7 ^ 0x1D ^ (0xAF ^ 0x97)) & (0x5D ^ 0x3D ^ (0xF0 ^ 0xB2) ^ -" ".length());
                        }
                    }
                    else {
                        n2 = Holder.lIIIIIIlllllIl[3];
                    }
                    final int lllllllllllllIlIIllllllIllIIIlII = n2;
                    "".length();
                    if (((0x11 ^ 0x5A) & ~(0x43 ^ 0x8)) > 0) {
                        return " ".length() & ~" ".length();
                    }
                }
            }
            else {
                int n3;
                if (lIllIlIlIlIIIll(this.getHeight(), lllllllllllllIlIIllllllIllIIIlIl.getHeight())) {
                    n3 = Holder.lIIIIIIlllllIl[0];
                    "".length();
                    if (null != null) {
                        return (0x0 ^ 0x5B) & ~(0xE1 ^ 0xBA);
                    }
                }
                else {
                    n3 = Holder.lIIIIIIlllllIl[3];
                }
                lllllllllllllIlIIllllllIllIIIIll = n3;
            }
            return lllllllllllllIlIIllllllIllIIIIll;
        }
        
        public boolean isRotated() {
            return this.rotated;
        }
        
        private static String lIllIlIlIIlIlll(final String lllllllllllllIlIIllllllIlIIllIlI, final String lllllllllllllIlIIllllllIlIIllIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIllllllIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllllllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), Holder.lIIIIIIlllllIl[5]), "DES");
                final Cipher lllllllllllllIlIIllllllIlIIllllI = Cipher.getInstance("DES");
                lllllllllllllIlIIllllllIlIIllllI.init(Holder.lIIIIIIlllllIl[4], lllllllllllllIlIIllllllIlIIlllll);
                return new String(lllllllllllllIlIIllllllIlIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllllllIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIllllllIlIIlllIl) {
                lllllllllllllIlIIllllllIlIIlllIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIllIlIlIlIIIll(final int lllllllllllllIlIIllllllIlIIlIIII, final int lllllllllllllIlIIllllllIlIIIllll) {
            return lllllllllllllIlIIllllllIlIIlIIII < lllllllllllllIlIIllllllIlIIIllll;
        }
        
        private static String lIllIlIlIIllIIl(String lllllllllllllIlIIllllllIlIlIllII, final String lllllllllllllIlIIllllllIlIlIlIll) {
            lllllllllllllIlIIllllllIlIlIllII = new String(Base64.getDecoder().decode(lllllllllllllIlIIllllllIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIllllllIlIlIllll = new StringBuilder();
            final char[] lllllllllllllIlIIllllllIlIlIlllI = lllllllllllllIlIIllllllIlIlIlIll.toCharArray();
            int lllllllllllllIlIIllllllIlIlIllIl = Holder.lIIIIIIlllllIl[1];
            final int lllllllllllllIlIIllllllIlIlIIlll = (Object)lllllllllllllIlIIllllllIlIlIllII.toCharArray();
            final double lllllllllllllIlIIllllllIlIlIIllI = lllllllllllllIlIIllllllIlIlIIlll.length;
            long lllllllllllllIlIIllllllIlIlIIlIl = Holder.lIIIIIIlllllIl[1];
            while (lIllIlIlIlIIIll((int)lllllllllllllIlIIllllllIlIlIIlIl, (int)lllllllllllllIlIIllllllIlIlIIllI)) {
                final char lllllllllllllIlIIllllllIlIllIIlI = lllllllllllllIlIIllllllIlIlIIlll[lllllllllllllIlIIllllllIlIlIIlIl];
                lllllllllllllIlIIllllllIlIlIllll.append((char)(lllllllllllllIlIIllllllIlIllIIlI ^ lllllllllllllIlIIllllllIlIlIlllI[lllllllllllllIlIIllllllIlIlIllIl % lllllllllllllIlIIllllllIlIlIlllI.length]));
                "".length();
                ++lllllllllllllIlIIllllllIlIlIllIl;
                ++lllllllllllllIlIIllllllIlIlIIlIl;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIllllllIlIlIllll);
        }
        
        public TextureAtlasSprite getAtlasSprite() {
            return this.theTexture;
        }
        
        public void setNewDimension(final int lllllllllllllIlIIllllllIllIIllll) {
            if (lIllIlIlIIlllll(this.width, lllllllllllllIlIIllllllIllIIllll) && lIllIlIlIIlllll(this.height, lllllllllllllIlIIllllllIllIIllll)) {
                this.scaleFactor = lllllllllllllIlIIllllllIllIIllll / (float)Math.min(this.width, this.height);
            }
        }
        
        private static boolean lIllIlIlIIlllll(final int lllllllllllllIlIIllllllIlIIIllII, final int lllllllllllllIlIIllllllIlIIIlIll) {
            return lllllllllllllIlIIllllllIlIIIllII > lllllllllllllIlIIllllllIlIIIlIll;
        }
        
        static {
            lIllIlIlIIllllI();
            lIllIlIlIIllIlI();
        }
        
        private static boolean lIllIlIlIlIIIIl(final int lllllllllllllIlIIllllllIlIIlIlII, final int lllllllllllllIlIIllllllIlIIlIIll) {
            return lllllllllllllIlIIllllllIlIIlIlII == lllllllllllllIlIIllllllIlIIlIIll;
        }
        
        public Holder(final TextureAtlasSprite lllllllllllllIlIIllllllIlllIIIll, final int lllllllllllllIlIIllllllIlllIIlIl) {
            this.scaleFactor = 1.0f;
            this.theTexture = lllllllllllllIlIIllllllIlllIIIll;
            this.width = lllllllllllllIlIIllllllIlllIIIll.getIconWidth();
            this.height = lllllllllllllIlIIllllllIlllIIIll.getIconHeight();
            this.mipmapLevelHolder = lllllllllllllIlIIllllllIlllIIlIl;
            int rotated;
            if (lIllIlIlIIlllll(getMipmapDimension(this.height, lllllllllllllIlIIllllllIlllIIlIl), getMipmapDimension(this.width, lllllllllllllIlIIllllllIlllIIlIl))) {
                rotated = Holder.lIIIIIIlllllIl[0];
                "".length();
                if (" ".length() >= (0xE ^ 0xA)) {
                    throw null;
                }
            }
            else {
                rotated = Holder.lIIIIIIlllllIl[1];
            }
            this.rotated = (rotated != 0);
        }
        
        private static void lIllIlIlIIllIlI() {
            (lIIIIIIllllIll = new String[Holder.lIIIIIIlllllIl[4]])[Holder.lIIIIIIlllllIl[1]] = lIllIlIlIIlIlll("oFmaFGFON2+e0ga3yM2zjg==", "gzXmr");
            Holder.lIIIIIIllllIll[Holder.lIIIIIIlllllIl[0]] = lIllIlIlIIllIIl("aUYJKggiDhVy", "EfaOa");
        }
        
        private static boolean lIllIlIlIlIIIlI(final Object lllllllllllllIlIIllllllIlIIIlIIl) {
            return lllllllllllllIlIIllllllIlIIIlIIl == null;
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder(Holder.lIIIIIIllllIll[Holder.lIIIIIIlllllIl[1]]).append(this.width).append(Holder.lIIIIIIllllIll[Holder.lIIIIIIlllllIl[0]]).append(this.height).append((char)Holder.lIIIIIIlllllIl[2]));
        }
        
        private static void lIllIlIlIIllllI() {
            (lIIIIIIlllllIl = new int[6])[0] = " ".length();
            Holder.lIIIIIIlllllIl[1] = ((0x20 ^ 0x27 ^ (0x4 ^ 0x40)) & (0x6E ^ 0x3E ^ (0x67 ^ 0x74) ^ -" ".length()));
            Holder.lIIIIIIlllllIl[2] = (0xBA ^ 0xC7);
            Holder.lIIIIIIlllllIl[3] = -" ".length();
            Holder.lIIIIIIlllllIl[4] = "  ".length();
            Holder.lIIIIIIlllllIl[5] = (0x4A ^ 0x42);
        }
    }
}
