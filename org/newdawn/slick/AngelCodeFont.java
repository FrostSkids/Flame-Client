// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Iterator;
import java.io.IOException;
import org.newdawn.slick.util.Log;
import java.util.List;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.util.ResourceLoader;
import java.util.Map;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.LinkedHashMap;
import org.newdawn.slick.opengl.renderer.SGL;

public class AngelCodeFont implements Font
{
    private /* synthetic */ boolean displayListCaching;
    private /* synthetic */ CharDef[] chars;
    private /* synthetic */ int lineHeight;
    private /* synthetic */ int baseDisplayListID;
    private static /* synthetic */ SGL GL;
    private /* synthetic */ Image fontImage;
    private static final /* synthetic */ int[] lIIllllllIllll;
    private /* synthetic */ int eldestDisplayListID;
    private static final /* synthetic */ String[] lIIllllllIlllI;
    private final /* synthetic */ LinkedHashMap displayLists;
    private /* synthetic */ DisplayList eldestDisplayList;
    
    private void render(final String lllllllllllllIIlIIIllllIlIlllIlI, final int lllllllllllllIIlIIIllllIllIIIIIl, final int lllllllllllllIIlIIIllllIllIIIIII) {
        AngelCodeFont.GL.glBegin(AngelCodeFont.lIIllllllIllll[12]);
        int lllllllllllllIIlIIIllllIlIllllll = AngelCodeFont.lIIllllllIllll[3];
        int lllllllllllllIIlIIIllllIlIlllllI = AngelCodeFont.lIIllllllIllll[3];
        CharDef lllllllllllllIIlIIIllllIlIllllIl = null;
        final char[] lllllllllllllIIlIIIllllIlIllllII = lllllllllllllIIlIIIllllIlIlllIlI.toCharArray();
        int lllllllllllllIIlIIIllllIllIIIlII = AngelCodeFont.lIIllllllIllll[3];
        while (llIlllllIlIIlIl(lllllllllllllIIlIIIllllIllIIIlII, lllllllllllllIIlIIIllllIlIllllII.length)) {
            final int lllllllllllllIIlIIIllllIllIIIllI = lllllllllllllIIlIIIllllIlIllllII[lllllllllllllIIlIIIllllIllIIIlII];
            if (llIlllllIlIIlII(lllllllllllllIIlIIIllllIllIIIllI, AngelCodeFont.lIIllllllIllll[15])) {
                lllllllllllllIIlIIIllllIlIllllll = AngelCodeFont.lIIllllllIllll[3];
                lllllllllllllIIlIIIllllIlIlllllI += this.getLineHeight();
                "".length();
                if (((0xE9 ^ 0xC1 ^ (0x9F ^ 0x8B)) & (45 + 40 - 7 + 70 ^ 47 + 70 - 10 + 61 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (llIlllllIlIIllI(lllllllllllllIIlIIIllllIllIIIllI, this.chars.length)) {
                "".length();
                if ((0x9F ^ 0x9A) <= 0) {
                    return;
                }
            }
            else {
                final CharDef lllllllllllllIIlIIIllllIllIIIlIl = this.chars[lllllllllllllIIlIIIllllIllIIIllI];
                if (llIlllllIIlllll(lllllllllllllIIlIIIllllIllIIIlIl)) {
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
                else {
                    if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIlIllllIl)) {
                        lllllllllllllIIlIIIllllIlIllllll += lllllllllllllIIlIIIllllIlIllllIl.getKerning(lllllllllllllIIlIIIllllIllIIIllI);
                    }
                    lllllllllllllIIlIIIllllIlIllllIl = lllllllllllllIIlIIIllllIllIIIlIl;
                    if (llIlllllIlIIllI(lllllllllllllIIlIIIllllIllIIIlII, lllllllllllllIIlIIIllllIllIIIIIl) && llIlllllIlIIlll(lllllllllllllIIlIIIllllIllIIIlII, lllllllllllllIIlIIIllllIllIIIIII)) {
                        lllllllllllllIIlIIIllllIllIIIlIl.draw((float)lllllllllllllIIlIIIllllIlIllllll, (float)lllllllllllllIIlIIIllllIlIlllllI);
                    }
                    lllllllllllllIIlIIIllllIlIllllll += lllllllllllllIIlIIIllllIllIIIlIl.xadvance;
                }
            }
            ++lllllllllllllIIlIIIllllIllIIIlII;
            "".length();
            if ("  ".length() >= (0x79 ^ 0x7D)) {
                return;
            }
        }
        AngelCodeFont.GL.glEnd();
    }
    
    private static void llIlllllIIllIll() {
        (lIIllllllIlllI = new String[AngelCodeFont.lIIllllllIllll[17]])[AngelCodeFont.lIIllllllIllll[3]] = llIlllllIIllIII("BQIpBxBGCQ==", "fjHuc");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[0]] = llIlllllIIllIIl("Mj8KzsSXUeg=", "wOZoL");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[6]] = llIlllllIIllIII("LwQ5HRgqBjhTEg==", "DaKsq");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[7]] = llIlllllIIllIlI("F4x5qwokEu8=", "vCmko");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[8]] = llIlllllIIllIlI("jHsi1y5cKKQ=", "lgRmp");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[10]] = llIlllllIIllIIl("TiSGwB8H52BiMOVCPztNWpbT9hg00TiJdz1yuHUlxwc=", "PoPex");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[11]] = llIlllllIIllIII("b24=", "OSssZ");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[12]] = llIlllllIIllIIl("zVhu8T2RQOv3JwBRtPv4jvVZSqvMTcCf", "zNuvM");
        AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[9]] = llIlllllIIllIIl("lY9dpXWU98cVFnTBlaotjzVWsiwtluzVhJiUVx1YzzG/MuVqiEIjP0mF9Aas1uPjvbG6HUClwd0=", "KpgTq");
    }
    
    public int getYOffset(final String lllllllllllllIIlIIIllllIlIlIIlII) {
        DisplayList lllllllllllllIIlIIIllllIlIlIIIll = null;
        if (llIlllllIIlllIl(this.displayListCaching ? 1 : 0)) {
            lllllllllllllIIlIIIllllIlIlIIIll = this.displayLists.get(lllllllllllllIIlIIIllllIlIlIIlII);
            if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIlIlIIIll) && llIlllllIlIIIII(lllllllllllllIIlIIIllllIlIlIIIll.yOffset)) {
                return lllllllllllllIIlIIIllllIlIlIIIll.yOffset;
            }
        }
        int lllllllllllllIIlIIIllllIlIlIIIlI = lllllllllllllIIlIIIllllIlIlIIlII.indexOf(AngelCodeFont.lIIllllllIllll[15]);
        if (llIlllllIlIIlII(lllllllllllllIIlIIIllllIlIlIIIlI, AngelCodeFont.lIIllllllIllll[1])) {
            lllllllllllllIIlIIIllllIlIlIIIlI = lllllllllllllIIlIIIllllIlIlIIlII.length();
        }
        int lllllllllllllIIlIIIllllIlIlIIIIl = AngelCodeFont.lIIllllllIllll[16];
        int lllllllllllllIIlIIIllllIlIlIIllI = AngelCodeFont.lIIllllllIllll[3];
        while (llIlllllIlIIlIl(lllllllllllllIIlIIIllllIlIlIIllI, lllllllllllllIIlIIIllllIlIlIIIlI)) {
            final int lllllllllllllIIlIIIllllIlIlIlIII = lllllllllllllIIlIIIllllIlIlIIlII.charAt(lllllllllllllIIlIIIllllIlIlIIllI);
            final CharDef lllllllllllllIIlIIIllllIlIlIIlll = this.chars[lllllllllllllIIlIIIllllIlIlIlIII];
            if (llIlllllIIlllll(lllllllllllllIIlIIIllllIlIlIIlll)) {
                "".length();
                if (-(16 + 136 - 148 + 166 ^ 0 + 138 - 10 + 47) >= 0) {
                    return (0x97 ^ 0xC2 ^ (0xC8 ^ 0x94)) & (0x39 ^ 0x2A ^ (0xB1 ^ 0xAB) ^ -" ".length());
                }
            }
            else {
                lllllllllllllIIlIIIllllIlIlIIIIl = Math.min(lllllllllllllIIlIIIllllIlIlIIlll.yoffset, lllllllllllllIIlIIIllllIlIlIIIIl);
            }
            ++lllllllllllllIIlIIIllllIlIlIIllI;
            "".length();
            if ((0x11 ^ 0x15) != (0xBD ^ 0xB9)) {
                return (0xB4 ^ 0xAE) & ~(0x67 ^ 0x7D);
            }
        }
        if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIlIlIIIll)) {
            lllllllllllllIIlIIIllllIlIlIIIll.yOffset = new Short((short)lllllllllllllIIlIIIllllIlIlIIIIl);
        }
        return lllllllllllllIIlIIIllllIlIlIIIIl;
    }
    
    private static String llIlllllIIllIII(String lllllllllllllIIlIIIllllIIIlllllI, final String lllllllllllllIIlIIIllllIIlIIIIlI) {
        lllllllllllllIIlIIIllllIIIlllllI = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIllllIIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIllllIIlIIIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIIIllllIIlIIIIII = lllllllllllllIIlIIIllllIIlIIIIlI.toCharArray();
        int lllllllllllllIIlIIIllllIIIllllll = AngelCodeFont.lIIllllllIllll[3];
        final float lllllllllllllIIlIIIllllIIIlllIIl = (Object)lllllllllllllIIlIIIllllIIIlllllI.toCharArray();
        final boolean lllllllllllllIIlIIIllllIIIlllIII = lllllllllllllIIlIIIllllIIIlllIIl.length != 0;
        byte lllllllllllllIIlIIIllllIIIllIlll = (byte)AngelCodeFont.lIIllllllIllll[3];
        while (llIlllllIlIIlIl(lllllllllllllIIlIIIllllIIIllIlll, lllllllllllllIIlIIIllllIIIlllIII ? 1 : 0)) {
            final char lllllllllllllIIlIIIllllIIlIIIlII = lllllllllllllIIlIIIllllIIIlllIIl[lllllllllllllIIlIIIllllIIIllIlll];
            lllllllllllllIIlIIIllllIIlIIIIIl.append((char)(lllllllllllllIIlIIIllllIIlIIIlII ^ lllllllllllllIIlIIIllllIIlIIIIII[lllllllllllllIIlIIIllllIIIllllll % lllllllllllllIIlIIIllllIIlIIIIII.length]));
            "".length();
            ++lllllllllllllIIlIIIllllIIIllllll;
            ++lllllllllllllIIlIIIllllIIIllIlll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIllllIIlIIIIIl);
    }
    
    private static boolean llIlllllIlIIllI(final int lllllllllllllIIlIIIllllIIIIlIlIl, final int lllllllllllllIIlIIIllllIIIIlIlII) {
        return lllllllllllllIIlIIIllllIIIIlIlIl >= lllllllllllllIIlIIIllllIIIIlIlII;
    }
    
    private static boolean llIlllllIlIIlIl(final int lllllllllllllIIlIIIllllIIIIlIIIl, final int lllllllllllllIIlIIIllllIIIIlIIII) {
        return lllllllllllllIIlIIIllllIIIIlIIIl < lllllllllllllIIlIIIllllIIIIlIIII;
    }
    
    private static void llIlllllIIlllII() {
        (lIIllllllIllll = new int[18])[0] = " ".length();
        AngelCodeFont.lIIllllllIllll[1] = -" ".length();
        AngelCodeFont.lIIllllllIllll[2] = (0x88 ^ 0x83) + (11 + 142 - 126 + 139) - (97 + 140 - 170 + 109) + (77 + 108 - 147 + 161);
        AngelCodeFont.lIIllllllIllll[3] = ((0xC5 ^ 0x84) & ~(0x3A ^ 0x7B));
        AngelCodeFont.lIIllllllIllll[4] = (0x46 ^ 0x6);
        AngelCodeFont.lIIllllllIllll[5] = (0xFF ^ 0x8A) + (0x82 ^ 0xA8) - (0xF5 ^ 0xAD) + (106 + 47 - 49 + 80);
        AngelCodeFont.lIIllllllIllll[6] = "  ".length();
        AngelCodeFont.lIIllllllIllll[7] = "   ".length();
        AngelCodeFont.lIIllllllIllll[8] = (0x70 ^ 0x12 ^ (0xDD ^ 0xBB));
        AngelCodeFont.lIIllllllIllll[9] = (0xBA ^ 0x84 ^ (0xE ^ 0x38));
        AngelCodeFont.lIIllllllIllll[10] = (0x58 ^ 0x4F ^ (0x3A ^ 0x28));
        AngelCodeFont.lIIllllllIllll[11] = (0xC4 ^ 0x82 ^ (0xD ^ 0x4D));
        AngelCodeFont.lIIllllllIllll[12] = (178 + 1 - 63 + 74 ^ 124 + 127 - 131 + 65);
        AngelCodeFont.lIIllllllIllll[13] = (0xAD ^ 0x8D);
        AngelCodeFont.lIIllllllIllll[14] = (-(0xFFFFE3F7 & 0x7C69) & (0xFFFFF3FD & 0x7F63));
        AngelCodeFont.lIIllllllIllll[15] = (0x90 ^ 0x9A);
        AngelCodeFont.lIIllllllIllll[16] = (0xFFFFAFF1 & 0x771E);
        AngelCodeFont.lIIllllllIllll[17] = (0x3B ^ 0x24 ^ (0x89 ^ 0x9F));
    }
    
    public AngelCodeFont(final String lllllllllllllIIlIIIlllllIllIlllI, final String lllllllllllllIIlIIIlllllIllIllIl, final boolean lllllllllllllIIlIIIlllllIlllIIII) throws SlickException {
        this.displayListCaching = (AngelCodeFont.lIIllllllIllll[0] != 0);
        this.baseDisplayListID = AngelCodeFont.lIIllllllIllll[1];
        this.displayLists = new LinkedHashMap(AngelCodeFont.lIIllllllIllll[2], 1.0f, (boolean)(AngelCodeFont.lIIllllllIllll[0] != 0)) {
            private static final /* synthetic */ int[] llIIIIllIIllIl;
            
            private static void lIIIlIIIIIllIIlI() {
                (llIIIIllIIllIl = new int[1])[0] = ((0xE0 ^ 0xC5 ^ (0xEF ^ 0xC5)) & (0x3A ^ 0x7B ^ (0x3F ^ 0x71) ^ -" ".length()));
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlllIllIlIllIIIIIlII) {
                AngelCodeFont.this.eldestDisplayList = llllllllllllIlllIllIlIllIIIIIlII.getValue();
                "".length();
                AngelCodeFont.this.eldestDisplayListID = AngelCodeFont.this.eldestDisplayList.id;
                "".length();
                return AngelCodeFont$1.llIIIIllIIllIl[0] != 0;
            }
            
            static {
                lIIIlIIIIIllIIlI();
            }
        };
        this.fontImage = new Image(lllllllllllllIIlIIIlllllIllIllIl);
        this.displayListCaching = lllllllllllllIIlIIIlllllIlllIIII;
        this.parseFnt(ResourceLoader.getResourceAsStream(lllllllllllllIIlIIIlllllIllIlllI));
    }
    
    static {
        llIlllllIIlllII();
        llIlllllIIllIll();
        DISPLAY_LIST_CACHE_SIZE = AngelCodeFont.lIIllllllIllll[2];
        MAX_CHAR = AngelCodeFont.lIIllllllIllll[5];
        AngelCodeFont.GL = Renderer.get();
    }
    
    public void drawString(final float lllllllllllllIIlIIIllllIllllIIII, final float lllllllllllllIIlIIIllllIlllIllll, final String lllllllllllllIIlIIIllllIllllIIll, final Color lllllllllllllIIlIIIllllIlllIllIl) {
        this.drawString(lllllllllllllIIlIIIllllIllllIIII, lllllllllllllIIlIIIllllIlllIllll, lllllllllllllIIlIIIllllIllllIIll, lllllllllllllIIlIIIllllIlllIllIl, AngelCodeFont.lIIllllllIllll[3], lllllllllllllIIlIIIllllIllllIIll.length() - AngelCodeFont.lIIllllllIllll[0]);
    }
    
    public AngelCodeFont(final String lllllllllllllIIlIIIlllllIllllllI, final Image lllllllllllllIIlIIIlllllIllllIIl, final boolean lllllllllllllIIlIIIlllllIlllllII) throws SlickException {
        this.displayListCaching = (AngelCodeFont.lIIllllllIllll[0] != 0);
        this.baseDisplayListID = AngelCodeFont.lIIllllllIllll[1];
        this.displayLists = new LinkedHashMap(AngelCodeFont.lIIllllllIllll[2], 1.0f, (boolean)(AngelCodeFont.lIIllllllIllll[0] != 0)) {
            private static final /* synthetic */ int[] llIIIIllIIllIl;
            
            private static void lIIIlIIIIIllIIlI() {
                (llIIIIllIIllIl = new int[1])[0] = ((0xE0 ^ 0xC5 ^ (0xEF ^ 0xC5)) & (0x3A ^ 0x7B ^ (0x3F ^ 0x71) ^ -" ".length()));
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlllIllIlIllIIIIIlII) {
                AngelCodeFont.this.eldestDisplayList = llllllllllllIlllIllIlIllIIIIIlII.getValue();
                "".length();
                AngelCodeFont.this.eldestDisplayListID = AngelCodeFont.this.eldestDisplayList.id;
                "".length();
                return AngelCodeFont$1.llIIIIllIIllIl[0] != 0;
            }
            
            static {
                lIIIlIIIIIllIIlI();
            }
        };
        this.fontImage = lllllllllllllIIlIIIlllllIllllIIl;
        this.displayListCaching = lllllllllllllIIlIIIlllllIlllllII;
        this.parseFnt(ResourceLoader.getResourceAsStream(lllllllllllllIIlIIIlllllIllllllI));
    }
    
    private static boolean llIlllllIlIIlll(final int lllllllllllllIIlIIIllllIIIIIllIl, final int lllllllllllllIIlIIIllllIIIIIllII) {
        return lllllllllllllIIlIIIllllIIIIIllIl <= lllllllllllllIIlIIIllllIIIIIllII;
    }
    
    private void parseFnt(final InputStream lllllllllllllIIlIIIlllllIIlIIlIl) throws SlickException {
        if (llIlllllIIlllIl(this.displayListCaching ? 1 : 0)) {
            this.baseDisplayListID = AngelCodeFont.GL.glGenLists(AngelCodeFont.lIIllllllIllll[2]);
            if (llIlllllIIllllI(this.baseDisplayListID)) {
                this.displayListCaching = (AngelCodeFont.lIIllllllIllll[3] != 0);
            }
        }
        try {
            final BufferedReader lllllllllllllIIlIIIlllllIIlIllll = new BufferedReader(new InputStreamReader(lllllllllllllIIlIIIlllllIIlIIlIl));
            final String lllllllllllllIIlIIIlllllIIlIlllI = lllllllllllllIIlIIIlllllIIlIllll.readLine();
            final String lllllllllllllIIlIIIlllllIIlIllIl = lllllllllllllIIlIIIlllllIIlIllll.readLine();
            final String lllllllllllllIIlIIIlllllIIlIllII = lllllllllllllIIlIIIlllllIIlIllll.readLine();
            final Map lllllllllllllIIlIIIlllllIIlIlIll = new HashMap(AngelCodeFont.lIIllllllIllll[4]);
            final List lllllllllllllIIlIIIlllllIIlIlIlI = new ArrayList(AngelCodeFont.lIIllllllIllll[5]);
            int lllllllllllllIIlIIIlllllIIlIlIIl = AngelCodeFont.lIIllllllIllll[3];
            boolean lllllllllllllIIlIIIlllllIIlIlIII = AngelCodeFont.lIIllllllIllll[3] != 0;
            while (llIlllllIIllllI(lllllllllllllIIlIIIlllllIIlIlIII ? 1 : 0)) {
                final String lllllllllllllIIlIIIlllllIIlllIIl = lllllllllllllIIlIIIlllllIIlIllll.readLine();
                if (llIlllllIIlllll(lllllllllllllIIlIIIlllllIIlllIIl)) {
                    lllllllllllllIIlIIIlllllIIlIlIII = (AngelCodeFont.lIIllllllIllll[0] != 0);
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                }
                else {
                    if (llIlllllIIlllIl(lllllllllllllIIlIIIlllllIIlllIIl.startsWith(AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[3]]) ? 1 : 0)) {
                        "".length();
                        if ("  ".length() <= ((0x10 ^ 0x30 ^ (0x8E ^ 0x9A)) & (0x5B ^ 0x3F ^ (0x37 ^ 0x67) ^ -" ".length()))) {
                            return;
                        }
                    }
                    else if (llIlllllIIlllIl(lllllllllllllIIlIIIlllllIIlllIIl.startsWith(AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[0]]) ? 1 : 0)) {
                        final CharDef lllllllllllllIIlIIIlllllIIllllll = this.parseChar(lllllllllllllIIlIIIlllllIIlllIIl);
                        if (llIlllllIlIIIII(lllllllllllllIIlIIIlllllIIllllll)) {
                            lllllllllllllIIlIIIlllllIIlIlIIl = Math.max(lllllllllllllIIlIIIlllllIIlIlIIl, lllllllllllllIIlIIIlllllIIllllll.id);
                            lllllllllllllIIlIIIlllllIIlIlIlI.add(lllllllllllllIIlIIIlllllIIllllll);
                            "".length();
                        }
                    }
                    if (llIlllllIIlllIl(lllllllllllllIIlIIIlllllIIlllIIl.startsWith(AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[6]]) ? 1 : 0)) {
                        "".length();
                        if ((112 + 121 - 110 + 67 ^ 127 + 23 - 37 + 73) < 0) {
                            return;
                        }
                    }
                    else if (llIlllllIIlllIl(lllllllllllllIIlIIIlllllIIlllIIl.startsWith(AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[7]]) ? 1 : 0)) {
                        final StringTokenizer lllllllllllllIIlIIIlllllIIlllllI = new StringTokenizer(lllllllllllllIIlIIIlllllIIlllIIl, AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[8]]);
                        lllllllllllllIIlIIIlllllIIlllllI.nextToken();
                        "".length();
                        lllllllllllllIIlIIIlllllIIlllllI.nextToken();
                        "".length();
                        final short lllllllllllllIIlIIIlllllIIllllIl = Short.parseShort(lllllllllllllIIlIIIlllllIIlllllI.nextToken());
                        lllllllllllllIIlIIIlllllIIlllllI.nextToken();
                        "".length();
                        final int lllllllllllllIIlIIIlllllIIllllII = Integer.parseInt(lllllllllllllIIlIIIlllllIIlllllI.nextToken());
                        lllllllllllllIIlIIIlllllIIlllllI.nextToken();
                        "".length();
                        final int lllllllllllllIIlIIIlllllIIlllIll = Integer.parseInt(lllllllllllllIIlIIIlllllIIlllllI.nextToken());
                        List lllllllllllllIIlIIIlllllIIlllIlI = lllllllllllllIIlIIIlllllIIlIlIll.get(new Short(lllllllllllllIIlIIIlllllIIllllIl));
                        if (llIlllllIIlllll(lllllllllllllIIlIIIlllllIIlllIlI)) {
                            lllllllllllllIIlIIIlllllIIlllIlI = new ArrayList();
                            lllllllllllllIIlIIIlllllIIlIlIll.put(new Short(lllllllllllllIIlIIIlllllIIllllIl), lllllllllllllIIlIIIlllllIIlllIlI);
                            "".length();
                        }
                        lllllllllllllIIlIIIlllllIIlllIlI.add(new Short((short)(lllllllllllllIIlIIIlllllIIlllIll << AngelCodeFont.lIIllllllIllll[9] | lllllllllllllIIlIIIlllllIIllllII)));
                        "".length();
                    }
                }
                "".length();
                if (" ".length() >= "   ".length()) {
                    return;
                }
            }
            this.chars = new CharDef[lllllllllllllIIlIIIlllllIIlIlIIl + AngelCodeFont.lIIllllllIllll[0]];
            final Iterator lllllllllllllIIlIIIlllllIIllIlll = lllllllllllllIIlIIIlllllIIlIlIlI.iterator();
            while (llIlllllIIlllIl(lllllllllllllIIlIIIlllllIIllIlll.hasNext() ? 1 : 0)) {
                final CharDef lllllllllllllIIlIIIlllllIIlllIII = lllllllllllllIIlIIIlllllIIllIlll.next();
                this.chars[lllllllllllllIIlIIIlllllIIlllIII.id] = lllllllllllllIIlIIIlllllIIlllIII;
                "".length();
                if (null != null) {
                    return;
                }
            }
            final Iterator lllllllllllllIIlIIIlllllIIllIIII = lllllllllllllIIlIIIlllllIIlIlIll.entrySet().iterator();
            while (llIlllllIIlllIl(lllllllllllllIIlIIIlllllIIllIIII.hasNext() ? 1 : 0)) {
                final Map.Entry lllllllllllllIIlIIIlllllIIllIlIl = lllllllllllllIIlIIIlllllIIllIIII.next();
                final short lllllllllllllIIlIIIlllllIIllIlII = lllllllllllllIIlIIIlllllIIllIlIl.getKey();
                final List lllllllllllllIIlIIIlllllIIllIIll = lllllllllllllIIlIIIlllllIIllIlIl.getValue();
                final short[] lllllllllllllIIlIIIlllllIIllIIlI = new short[lllllllllllllIIlIIIlllllIIllIIll.size()];
                int lllllllllllllIIlIIIlllllIIllIIIl = AngelCodeFont.lIIllllllIllll[3];
                final Iterator lllllllllllllIIlIIIlllllIIllIllI = lllllllllllllIIlIIIlllllIIllIIll.iterator();
                while (llIlllllIIlllIl(lllllllllllllIIlIIIlllllIIllIllI.hasNext() ? 1 : 0)) {
                    lllllllllllllIIlIIIlllllIIllIIlI[lllllllllllllIIlIIIlllllIIllIIIl] = lllllllllllllIIlIIIlllllIIllIllI.next();
                    ++lllllllllllllIIlIIIlllllIIllIIIl;
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                }
                this.chars[lllllllllllllIIlIIIlllllIIllIlII].kerning = lllllllllllllIIlIIIlllllIIllIIlI;
                "".length();
                if (null != null) {
                    return;
                }
            }
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIIlIIIlllllIIlIIlll) {
            Log.error(lllllllllllllIIlIIIlllllIIlIIlll);
            throw new SlickException(String.valueOf(new StringBuilder().append(AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[10]]).append(lllllllllllllIIlIIIlllllIIlIIlIl)));
        }
    }
    
    public AngelCodeFont(final String lllllllllllllIIlIIIllllllIIlIIIl, final Image lllllllllllllIIlIIIllllllIIIllIl) throws SlickException {
        this.displayListCaching = (AngelCodeFont.lIIllllllIllll[0] != 0);
        this.baseDisplayListID = AngelCodeFont.lIIllllllIllll[1];
        this.displayLists = new LinkedHashMap(AngelCodeFont.lIIllllllIllll[2], 1.0f, (boolean)(AngelCodeFont.lIIllllllIllll[0] != 0)) {
            private static final /* synthetic */ int[] llIIIIllIIllIl;
            
            private static void lIIIlIIIIIllIIlI() {
                (llIIIIllIIllIl = new int[1])[0] = ((0xE0 ^ 0xC5 ^ (0xEF ^ 0xC5)) & (0x3A ^ 0x7B ^ (0x3F ^ 0x71) ^ -" ".length()));
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlllIllIlIllIIIIIlII) {
                AngelCodeFont.this.eldestDisplayList = llllllllllllIlllIllIlIllIIIIIlII.getValue();
                "".length();
                AngelCodeFont.this.eldestDisplayListID = AngelCodeFont.this.eldestDisplayList.id;
                "".length();
                return AngelCodeFont$1.llIIIIllIIllIl[0] != 0;
            }
            
            static {
                lIIIlIIIIIllIIlI();
            }
        };
        this.fontImage = lllllllllllllIIlIIIllllllIIIllIl;
        this.parseFnt(ResourceLoader.getResourceAsStream(lllllllllllllIIlIIIllllllIIlIIIl));
    }
    
    public int getLineHeight() {
        return this.lineHeight;
    }
    
    public int getWidth(final String lllllllllllllIIlIIIllllIIlllIIIl) {
        DisplayList lllllllllllllIIlIIIllllIIlllIIII = null;
        if (llIlllllIIlllIl(this.displayListCaching ? 1 : 0)) {
            lllllllllllllIIlIIIllllIIlllIIII = this.displayLists.get(lllllllllllllIIlIIIllllIIlllIIIl);
            if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIIlllIIII) && llIlllllIlIIIII(lllllllllllllIIlIIIllllIIlllIIII.width)) {
                return lllllllllllllIIlIIIllllIIlllIIII.width;
            }
        }
        int lllllllllllllIIlIIIllllIIllIllll = AngelCodeFont.lIIllllllIllll[3];
        int lllllllllllllIIlIIIllllIIllIlllI = AngelCodeFont.lIIllllllIllll[3];
        CharDef lllllllllllllIIlIIIllllIIllIllIl = null;
        int lllllllllllllIIlIIIllllIIlllIlII = AngelCodeFont.lIIllllllIllll[3];
        final int lllllllllllllIIlIIIllllIIlllIIll = lllllllllllllIIlIIIllllIIlllIIIl.length();
        while (llIlllllIlIIlIl(lllllllllllllIIlIIIllllIIlllIlII, lllllllllllllIIlIIIllllIIlllIIll)) {
            final int lllllllllllllIIlIIIllllIIlllIllI = lllllllllllllIIlIIIllllIIlllIIIl.charAt(lllllllllllllIIlIIIllllIIlllIlII);
            if (llIlllllIlIIlII(lllllllllllllIIlIIIllllIIlllIllI, AngelCodeFont.lIIllllllIllll[15])) {
                lllllllllllllIIlIIIllllIIllIlllI = AngelCodeFont.lIIllllllIllll[3];
                "".length();
                if (-"   ".length() >= 0) {
                    return (0xE0 ^ 0xB0 ^ (0x94 ^ 0x8B)) & (0x30 ^ 0x70 ^ (0x84 ^ 0x8B) ^ -" ".length());
                }
            }
            else if (llIlllllIlIIllI(lllllllllllllIIlIIIllllIIlllIllI, this.chars.length)) {
                "".length();
                if (-"  ".length() > 0) {
                    return (0xD9 ^ 0x94) & ~(0xD ^ 0x40);
                }
            }
            else {
                final CharDef lllllllllllllIIlIIIllllIIlllIlIl = this.chars[lllllllllllllIIlIIIllllIIlllIllI];
                if (llIlllllIIlllll(lllllllllllllIIlIIIllllIIlllIlIl)) {
                    "".length();
                    if (-"  ".length() >= 0) {
                        return (224 + 225 - 231 + 20 ^ 36 + 150 - 181 + 180) & (110 + 124 - 130 + 23 ^ (0x4B ^ 0x63) ^ -" ".length());
                    }
                }
                else {
                    if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIIllIllIl)) {
                        lllllllllllllIIlIIIllllIIllIlllI += lllllllllllllIIlIIIllllIIllIllIl.getKerning(lllllllllllllIIlIIIllllIIlllIllI);
                    }
                    lllllllllllllIIlIIIllllIIllIllIl = lllllllllllllIIlIIIllllIIlllIlIl;
                    if (llIlllllIlIIlIl(lllllllllllllIIlIIIllllIIlllIlII, lllllllllllllIIlIIIllllIIlllIIll - AngelCodeFont.lIIllllllIllll[0])) {
                        lllllllllllllIIlIIIllllIIllIlllI += lllllllllllllIIlIIIllllIIlllIlIl.xadvance;
                        "".length();
                        if (((0x19 ^ 0x73 ^ (0x32 ^ 0x45)) & (0x38 ^ 0x6 ^ (0x3F ^ 0x1C) ^ -" ".length())) != ((50 + 76 + 25 + 26 ^ 133 + 127 - 116 + 1) & (0xA8 ^ 0x86 ^ (0x91 ^ 0x9F) ^ -" ".length()))) {
                            return (0xD ^ 0x42 ^ (0xA3 ^ 0x8E)) & (0x68 ^ 0x70 ^ (0x5C ^ 0x26) ^ -" ".length());
                        }
                    }
                    else {
                        lllllllllllllIIlIIIllllIIllIlllI += lllllllllllllIIlIIIllllIIlllIlIl.width;
                    }
                    lllllllllllllIIlIIIllllIIllIllll = Math.max(lllllllllllllIIlIIIllllIIllIllll, lllllllllllllIIlIIIllllIIllIlllI);
                }
            }
            ++lllllllllllllIIlIIIllllIIlllIlII;
            "".length();
            if (null != null) {
                return ("  ".length() ^ (0x2D ^ 0x2B)) & (60 + 27 + 49 + 18 ^ 157 + 74 - 203 + 130 ^ -" ".length());
            }
        }
        if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIIlllIIII)) {
            lllllllllllllIIlIIIllllIIlllIIII.width = new Short((short)lllllllllllllIIlIIIllllIIllIllll);
        }
        return lllllllllllllIIlIIIllllIIllIllll;
    }
    
    private static String llIlllllIIllIlI(final String lllllllllllllIIlIIIllllIIIIlllll, final String lllllllllllllIIlIIIllllIIIIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIllllIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIllllIIIIllllI.getBytes(StandardCharsets.UTF_8)), AngelCodeFont.lIIllllllIllll[9]), "DES");
            final Cipher lllllllllllllIIlIIIllllIIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllIIlIIIllllIIIlIIIll.init(AngelCodeFont.lIIllllllIllll[6], lllllllllllllIIlIIIllllIIIlIIlII);
            return new String(lllllllllllllIIlIIIllllIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIllllIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIllllIIIlIIIlI) {
            lllllllllllllIIlIIIllllIIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllllIlIIIII(final Object lllllllllllllIIlIIIllllIIIIIIllI) {
        return lllllllllllllIIlIIIllllIIIIIIllI != null;
    }
    
    public void drawString(final float lllllllllllllIIlIIIllllIllIllIIl, final float lllllllllllllIIlIIIllllIllIllIII, final String lllllllllllllIIlIIIllllIllIllllI, final Color lllllllllllllIIlIIIllllIllIlIllI, final int lllllllllllllIIlIIIllllIllIlllII, final int lllllllllllllIIlIIIllllIllIllIll) {
        this.fontImage.bind();
        lllllllllllllIIlIIIllllIllIlIllI.bind();
        AngelCodeFont.GL.glTranslatef(lllllllllllllIIlIIIllllIllIllIIl, lllllllllllllIIlIIIllllIllIllIII, 0.0f);
        if (llIlllllIIlllIl(this.displayListCaching ? 1 : 0) && llIlllllIIllllI(lllllllllllllIIlIIIllllIllIlllII) && llIlllllIlIIlII(lllllllllllllIIlIIIllllIllIllIll, lllllllllllllIIlIIIllllIllIllllI.length() - AngelCodeFont.lIIllllllIllll[0])) {
            DisplayList lllllllllllllIIlIIIllllIlllIIIlI = this.displayLists.get(lllllllllllllIIlIIIllllIllIllllI);
            if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIlllIIIlI)) {
                AngelCodeFont.GL.glCallList(lllllllllllllIIlIIIllllIlllIIIlI.id);
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIIIllllIlllIIIlI = new DisplayList();
                lllllllllllllIIlIIIllllIlllIIIlI.text = lllllllllllllIIlIIIllllIllIllllI;
                final int lllllllllllllIIlIIIllllIlllIIIll = this.displayLists.size();
                if (llIlllllIlIIlIl(lllllllllllllIIlIIIllllIlllIIIll, AngelCodeFont.lIIllllllIllll[2])) {
                    lllllllllllllIIlIIIllllIlllIIIlI.id = this.baseDisplayListID + lllllllllllllIIlIIIllllIlllIIIll;
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIIIllllIlllIIIlI.id = this.eldestDisplayListID;
                    this.displayLists.remove(this.eldestDisplayList.text);
                    "".length();
                }
                this.displayLists.put(lllllllllllllIIlIIIllllIllIllllI, lllllllllllllIIlIIIllllIlllIIIlI);
                "".length();
                AngelCodeFont.GL.glNewList(lllllllllllllIIlIIIllllIlllIIIlI.id, AngelCodeFont.lIIllllllIllll[14]);
                this.render(lllllllllllllIIlIIIllllIllIllllI, lllllllllllllIIlIIIllllIllIlllII, lllllllllllllIIlIIIllllIllIllIll);
                AngelCodeFont.GL.glEndList();
            }
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            this.render(lllllllllllllIIlIIIllllIllIllllI, lllllllllllllIIlIIIllllIllIlllII, lllllllllllllIIlIIIllllIllIllIll);
        }
        AngelCodeFont.GL.glTranslatef(-lllllllllllllIIlIIIllllIllIllIIl, -lllllllllllllIIlIIIllllIllIllIII, 0.0f);
    }
    
    public int getHeight(final String lllllllllllllIIlIIIllllIlIIIIlll) {
        DisplayList lllllllllllllIIlIIIllllIlIIIlIll = null;
        if (llIlllllIIlllIl(this.displayListCaching ? 1 : 0)) {
            lllllllllllllIIlIIIllllIlIIIlIll = this.displayLists.get(lllllllllllllIIlIIIllllIlIIIIlll);
            if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIlIIIlIll) && llIlllllIlIIIII(lllllllllllllIIlIIIllllIlIIIlIll.height)) {
                return lllllllllllllIIlIIIllllIlIIIlIll.height;
            }
        }
        int lllllllllllllIIlIIIllllIlIIIlIlI = AngelCodeFont.lIIllllllIllll[3];
        int lllllllllllllIIlIIIllllIlIIIlIIl = AngelCodeFont.lIIllllllIllll[3];
        int lllllllllllllIIlIIIllllIlIIIlllI = AngelCodeFont.lIIllllllIllll[3];
        while (llIlllllIlIIlIl(lllllllllllllIIlIIIllllIlIIIlllI, lllllllllllllIIlIIIllllIlIIIIlll.length())) {
            final int lllllllllllllIIlIIIllllIlIIlIIII = lllllllllllllIIlIIIllllIlIIIIlll.charAt(lllllllllllllIIlIIIllllIlIIIlllI);
            if (llIlllllIlIIlII(lllllllllllllIIlIIIllllIlIIlIIII, AngelCodeFont.lIIllllllIllll[15])) {
                ++lllllllllllllIIlIIIllllIlIIIlIlI;
                lllllllllllllIIlIIIllllIlIIIlIIl = AngelCodeFont.lIIllllllIllll[3];
                "".length();
                if (-"  ".length() > 0) {
                    return (0x34 ^ 0x29) & ~(0x5E ^ 0x43);
                }
            }
            else if (llIlllllIlIIlII(lllllllllllllIIlIIIllllIlIIlIIII, AngelCodeFont.lIIllllllIllll[13])) {
                "".length();
                if (" ".length() == 0) {
                    return (0xA9 ^ 0xBB) & ~(0x96 ^ 0x84);
                }
            }
            else {
                final CharDef lllllllllllllIIlIIIllllIlIIIllll = this.chars[lllllllllllllIIlIIIllllIlIIlIIII];
                if (llIlllllIIlllll(lllllllllllllIIlIIIllllIlIIIllll)) {
                    "".length();
                    if ("   ".length() <= 0) {
                        return (0xB8 ^ 0x80) & ~(0x7E ^ 0x46);
                    }
                }
                else {
                    lllllllllllllIIlIIIllllIlIIIlIIl = Math.max(lllllllllllllIIlIIIllllIlIIIllll.height + lllllllllllllIIlIIIllllIlIIIllll.yoffset, lllllllllllllIIlIIIllllIlIIIlIIl);
                }
            }
            ++lllllllllllllIIlIIIllllIlIIIlllI;
            "".length();
            if ((92 + 12 + 1 + 37 ^ 33 + 33 - 59 + 131) > (0x2D ^ 0x24 ^ (0x70 ^ 0x7D))) {
                return (0x19 ^ 0x16 ^ (0x95 ^ 0x8D)) & (74 + 145 - 114 + 106 ^ 10 + 68 + 21 + 97 ^ -" ".length());
            }
        }
        lllllllllllllIIlIIIllllIlIIIlIIl += lllllllllllllIIlIIIllllIlIIIlIlI * this.getLineHeight();
        if (llIlllllIlIIIII(lllllllllllllIIlIIIllllIlIIIlIll)) {
            lllllllllllllIIlIIIllllIlIIIlIll.height = new Short((short)lllllllllllllIIlIIIllllIlIIIlIIl);
        }
        return lllllllllllllIIlIIIllllIlIIIlIIl;
    }
    
    public AngelCodeFont(final String lllllllllllllIIlIIIllllllIIIlIII, final String lllllllllllllIIlIIIllllllIIIIlII) throws SlickException {
        this.displayListCaching = (AngelCodeFont.lIIllllllIllll[0] != 0);
        this.baseDisplayListID = AngelCodeFont.lIIllllllIllll[1];
        this.displayLists = new LinkedHashMap(AngelCodeFont.lIIllllllIllll[2], 1.0f, (boolean)(AngelCodeFont.lIIllllllIllll[0] != 0)) {
            private static final /* synthetic */ int[] llIIIIllIIllIl;
            
            private static void lIIIlIIIIIllIIlI() {
                (llIIIIllIIllIl = new int[1])[0] = ((0xE0 ^ 0xC5 ^ (0xEF ^ 0xC5)) & (0x3A ^ 0x7B ^ (0x3F ^ 0x71) ^ -" ".length()));
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlllIllIlIllIIIIIlII) {
                AngelCodeFont.this.eldestDisplayList = llllllllllllIlllIllIlIllIIIIIlII.getValue();
                "".length();
                AngelCodeFont.this.eldestDisplayListID = AngelCodeFont.this.eldestDisplayList.id;
                "".length();
                return AngelCodeFont$1.llIIIIllIIllIl[0] != 0;
            }
            
            static {
                lIIIlIIIIIllIIlI();
            }
        };
        this.fontImage = new Image(lllllllllllllIIlIIIllllllIIIIlII);
        this.parseFnt(ResourceLoader.getResourceAsStream(lllllllllllllIIlIIIllllllIIIlIII));
    }
    
    public AngelCodeFont(final String lllllllllllllIIlIIIlllllIlIllIIl, final InputStream lllllllllllllIIlIIIlllllIlIllIII, final InputStream lllllllllllllIIlIIIlllllIlIlIlll, final boolean lllllllllllllIIlIIIlllllIlIlIIIl) throws SlickException {
        this.displayListCaching = (AngelCodeFont.lIIllllllIllll[0] != 0);
        this.baseDisplayListID = AngelCodeFont.lIIllllllIllll[1];
        this.displayLists = new LinkedHashMap(AngelCodeFont.lIIllllllIllll[2], 1.0f, (boolean)(AngelCodeFont.lIIllllllIllll[0] != 0)) {
            private static final /* synthetic */ int[] llIIIIllIIllIl;
            
            private static void lIIIlIIIIIllIIlI() {
                (llIIIIllIIllIl = new int[1])[0] = ((0xE0 ^ 0xC5 ^ (0xEF ^ 0xC5)) & (0x3A ^ 0x7B ^ (0x3F ^ 0x71) ^ -" ".length()));
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlllIllIlIllIIIIIlII) {
                AngelCodeFont.this.eldestDisplayList = llllllllllllIlllIllIlIllIIIIIlII.getValue();
                "".length();
                AngelCodeFont.this.eldestDisplayListID = AngelCodeFont.this.eldestDisplayList.id;
                "".length();
                return AngelCodeFont$1.llIIIIllIIllIl[0] != 0;
            }
            
            static {
                lIIIlIIIIIllIIlI();
            }
        };
        this.fontImage = new Image(lllllllllllllIIlIIIlllllIlIlIlll, lllllllllllllIIlIIIlllllIlIllIIl, (boolean)(AngelCodeFont.lIIllllllIllll[3] != 0));
        this.displayListCaching = lllllllllllllIIlIIIlllllIlIlIIIl;
        this.parseFnt(lllllllllllllIIlIIIlllllIlIllIII);
    }
    
    public void drawString(final float lllllllllllllIIlIIIlllllIIIIIIlI, final float lllllllllllllIIlIIIlllllIIIIIIIl, final String lllllllllllllIIlIIIllllIllllllII) {
        this.drawString(lllllllllllllIIlIIIlllllIIIIIIlI, lllllllllllllIIlIIIlllllIIIIIIIl, lllllllllllllIIlIIIllllIllllllII, Color.white);
    }
    
    private static boolean llIlllllIlIIIIl(final int lllllllllllllIIlIIIlllIllllllllI) {
        return lllllllllllllIIlIIIlllIllllllllI < 0;
    }
    
    private static boolean llIlllllIlIIIll(final int lllllllllllllIIlIIIlllIllllllIll, final int lllllllllllllIIlIIIlllIllllllIlI) {
        return lllllllllllllIIlIIIlllIllllllIll != lllllllllllllIIlIIIlllIllllllIlI;
    }
    
    private CharDef parseChar(final String lllllllllllllIIlIIIlllllIIIIlIlI) throws SlickException {
        final CharDef lllllllllllllIIlIIIlllllIIIIllIl = new CharDef();
        final StringTokenizer lllllllllllllIIlIIIlllllIIIIllII = new StringTokenizer(lllllllllllllIIlIIIlllllIIIIlIlI, AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[11]]);
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.id = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        if (llIlllllIlIIIIl(lllllllllllllIIlIIIlllllIIIIllIl.id)) {
            return null;
        }
        if (llIlllllIlIIIlI(lllllllllllllIIlIIIlllllIIIIllIl.id, AngelCodeFont.lIIllllllIllll[5])) {
            throw new SlickException(String.valueOf(new StringBuilder().append(AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[12]]).append(lllllllllllllIIlIIIlllllIIIIllIl.id).append(AngelCodeFont.lIIllllllIlllI[AngelCodeFont.lIIllllllIllll[9]]).append(AngelCodeFont.lIIllllllIllll[5])));
        }
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.x = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.y = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.width = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.height = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.xoffset = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.yoffset = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        lllllllllllllIIlIIIlllllIIIIllII.nextToken();
        "".length();
        lllllllllllllIIlIIIlllllIIIIllIl.xadvance = Short.parseShort(lllllllllllllIIlIIIlllllIIIIllII.nextToken());
        lllllllllllllIIlIIIlllllIIIIllIl.init();
        if (llIlllllIlIIIll(lllllllllllllIIlIIIlllllIIIIllIl.id, AngelCodeFont.lIIllllllIllll[13])) {
            this.lineHeight = Math.max(lllllllllllllIIlIIIlllllIIIIllIl.height + lllllllllllllIIlIIIlllllIIIIllIl.yoffset, this.lineHeight);
        }
        return lllllllllllllIIlIIIlllllIIIIllIl;
    }
    
    private static boolean llIlllllIlIIlII(final int lllllllllllllIIlIIIllllIIIIllIIl, final int lllllllllllllIIlIIIllllIIIIllIII) {
        return lllllllllllllIIlIIIllllIIIIllIIl == lllllllllllllIIlIIIllllIIIIllIII;
    }
    
    public AngelCodeFont(final String lllllllllllllIIlIIIlllllIllIIllI, final InputStream lllllllllllllIIlIIIlllllIllIIlIl, final InputStream lllllllllllllIIlIIIlllllIllIIIII) throws SlickException {
        this.displayListCaching = (AngelCodeFont.lIIllllllIllll[0] != 0);
        this.baseDisplayListID = AngelCodeFont.lIIllllllIllll[1];
        this.displayLists = new LinkedHashMap(AngelCodeFont.lIIllllllIllll[2], 1.0f, (boolean)(AngelCodeFont.lIIllllllIllll[0] != 0)) {
            private static final /* synthetic */ int[] llIIIIllIIllIl;
            
            private static void lIIIlIIIIIllIIlI() {
                (llIIIIllIIllIl = new int[1])[0] = ((0xE0 ^ 0xC5 ^ (0xEF ^ 0xC5)) & (0x3A ^ 0x7B ^ (0x3F ^ 0x71) ^ -" ".length()));
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlllIllIlIllIIIIIlII) {
                AngelCodeFont.this.eldestDisplayList = llllllllllllIlllIllIlIllIIIIIlII.getValue();
                "".length();
                AngelCodeFont.this.eldestDisplayListID = AngelCodeFont.this.eldestDisplayList.id;
                "".length();
                return AngelCodeFont$1.llIIIIllIIllIl[0] != 0;
            }
            
            static {
                lIIIlIIIIIllIIlI();
            }
        };
        this.fontImage = new Image(lllllllllllllIIlIIIlllllIllIIIII, lllllllllllllIIlIIIlllllIllIIllI, (boolean)(AngelCodeFont.lIIllllllIllll[3] != 0));
        this.parseFnt(lllllllllllllIIlIIIlllllIllIIlIl);
    }
    
    private static String llIlllllIIllIIl(final String lllllllllllllIIlIIIllllIIIlIllII, final String lllllllllllllIIlIIIllllIIIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIllllIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIllllIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIllllIIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIllllIIIllIIII.init(AngelCodeFont.lIIllllllIllll[6], lllllllllllllIIlIIIllllIIIllIIIl);
            return new String(lllllllllllllIIlIIIllllIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIllllIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIllllIIIlIllll) {
            lllllllllllllIIlIIIllllIIIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllllIIlllll(final Object lllllllllllllIIlIIIllllIIIIIIlII) {
        return lllllllllllllIIlIIIllllIIIIIIlII == null;
    }
    
    private static boolean llIlllllIlIIIlI(final int lllllllllllllIIlIIIllllIIIIIlIIl, final int lllllllllllllIIlIIIllllIIIIIlIII) {
        return lllllllllllllIIlIIIllllIIIIIlIIl > lllllllllllllIIlIIIllllIIIIIlIII;
    }
    
    private static boolean llIlllllIIllllI(final int lllllllllllllIIlIIIllllIIIIIIIII) {
        return lllllllllllllIIlIIIllllIIIIIIIII == 0;
    }
    
    private static boolean llIlllllIIlllIl(final int lllllllllllllIIlIIIllllIIIIIIIlI) {
        return lllllllllllllIIlIIIllllIIIIIIIlI != 0;
    }
    
    private static class DisplayList
    {
        /* synthetic */ Short yOffset;
        /* synthetic */ Short width;
        /* synthetic */ int id;
        /* synthetic */ String text;
        /* synthetic */ Short height;
    }
    
    private class CharDef
    {
        public /* synthetic */ short width;
        public /* synthetic */ short height;
        public /* synthetic */ short[] kerning;
        public /* synthetic */ Image image;
        public /* synthetic */ short x;
        public /* synthetic */ short id;
        public /* synthetic */ short yoffset;
        private static final /* synthetic */ int[] lIIIllIIllIlII;
        public /* synthetic */ short xoffset;
        public /* synthetic */ short xadvance;
        private static final /* synthetic */ String[] lIIIllIIlIlIlI;
        public /* synthetic */ short y;
        
        private static String llIIIIllIllIllI(final String lllllllllllllIlIIIIIlIIIllIlllII, final String lllllllllllllIlIIIIIlIIIllIllIll) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIIlIIIlllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIIIllIllIll.getBytes(StandardCharsets.UTF_8)), CharDef.lIIIllIIllIlII[5]), "DES");
                final Cipher lllllllllllllIlIIIIIlIIIlllIIIII = Cipher.getInstance("DES");
                lllllllllllllIlIIIIIlIIIlllIIIII.init(CharDef.lIIIllIIllIlII[2], lllllllllllllIlIIIIIlIIIlllIIIIl);
                return new String(lllllllllllllIlIIIIIlIIIlllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIIlIIIllIlllll) {
                lllllllllllllIlIIIIIlIIIllIlllll.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIIllIllIlll() {
            (lIIIllIIlIlIlI = new String[CharDef.lIIIllIIllIlII[6]])[CharDef.lIIIllIIllIlII[0]] = llIIIIllIllIlII("vMnr7rlYU8rg/dPBy5aoTw==", "xSlGk");
            CharDef.lIIIllIIlIlIlI[CharDef.lIIIllIIllIlII[1]] = llIIIIllIllIlII("ktchdWCZWoo=", "xqxEa");
            CharDef.lIIIllIIlIlIlI[CharDef.lIIIllIIllIlII[2]] = llIIIIllIllIlIl("cTxs", "QEQTi");
            CharDef.lIIIllIIlIlIlI[CharDef.lIIIllIIllIlII[3]] = llIIIIllIllIllI("j3LCFM61uzo=", "gHljj");
        }
        
        public void init() {
            this.image = AngelCodeFont.this.fontImage.getSubImage(this.x, this.y, this.width, this.height);
        }
        
        public int getKerning(final int lllllllllllllIlIIIIIlIIlIIIIIIll) {
            if (llIIIIlllIlIlll(this.kerning)) {
                return CharDef.lIIIllIIllIlII[0];
            }
            int lllllllllllllIlIIIIIlIIlIIIIIIlI = CharDef.lIIIllIIllIlII[0];
            int lllllllllllllIlIIIIIlIIlIIIIIIIl = this.kerning.length - CharDef.lIIIllIIllIlII[1];
            while (llIIIIlllIllIII(lllllllllllllIlIIIIIlIIlIIIIIIlI, lllllllllllllIlIIIIIlIIlIIIIIIIl)) {
                final int lllllllllllllIlIIIIIlIIlIIIIIlll = lllllllllllllIlIIIIIlIIlIIIIIIlI + lllllllllllllIlIIIIIlIIlIIIIIIIl >>> CharDef.lIIIllIIllIlII[1];
                final int lllllllllllllIlIIIIIlIIlIIIIIllI = this.kerning[lllllllllllllIlIIIIIlIIlIIIIIlll];
                final int lllllllllllllIlIIIIIlIIlIIIIIlIl = lllllllllllllIlIIIIIlIIlIIIIIllI & CharDef.lIIIllIIllIlII[4];
                if (llIIIIlllIllIIl(lllllllllllllIlIIIIIlIIlIIIIIlIl, lllllllllllllIlIIIIIlIIlIIIIIIll)) {
                    lllllllllllllIlIIIIIlIIlIIIIIIlI = lllllllllllllIlIIIIIlIIlIIIIIlll + CharDef.lIIIllIIllIlII[1];
                    "".length();
                    if (" ".length() < 0) {
                        return (68 + 121 - 92 + 50 ^ 120 + 127 - 166 + 86) & (0x2 ^ 0x9 ^ (0x8F ^ 0xB0) ^ -" ".length());
                    }
                }
                else {
                    if (!llIIIIlllIllIlI(lllllllllllllIlIIIIIlIIlIIIIIlIl, lllllllllllllIlIIIIIlIIlIIIIIIll)) {
                        return lllllllllllllIlIIIIIlIIlIIIIIllI >> CharDef.lIIIllIIllIlII[5];
                    }
                    lllllllllllllIlIIIIIlIIlIIIIIIIl = lllllllllllllIlIIIIIlIIlIIIIIlll - CharDef.lIIIllIIllIlII[1];
                    "".length();
                    if (" ".length() >= (0x8E ^ 0x8A)) {
                        return (0x9B ^ 0x8F) & ~(0xAF ^ 0xBB);
                    }
                }
                "".length();
                if (" ".length() == 0) {
                    return " ".length() & ~" ".length() & ~((0x6E ^ 0x4F) & ~(0x1A ^ 0x3B));
                }
            }
            return CharDef.lIIIllIIllIlII[0];
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder().append(CharDef.lIIIllIIlIlIlI[CharDef.lIIIllIIllIlII[0]]).append(this.id).append(CharDef.lIIIllIIlIlIlI[CharDef.lIIIllIIllIlII[1]]).append(this.x).append(CharDef.lIIIllIIlIlIlI[CharDef.lIIIllIIllIlII[2]]).append(this.y).append(CharDef.lIIIllIIlIlIlI[CharDef.lIIIllIIllIlII[3]]));
        }
        
        private static String llIIIIllIllIlII(final String lllllllllllllIlIIIIIlIIIlllIlIIl, final String lllllllllllllIlIIIIIlIIIlllIlIII) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIIlIIIlllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIIIlllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIIIlIIIlllIllIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIIIlIIIlllIllIl.init(CharDef.lIIIllIIllIlII[2], lllllllllllllIlIIIIIlIIIlllIlllI);
                return new String(lllllllllllllIlIIIIIlIIIlllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIIlIIIlllIllII) {
                lllllllllllllIlIIIIIlIIIlllIllII.printStackTrace();
                return null;
            }
        }
        
        static {
            llIIIIlllIlIllI();
            llIIIIllIllIlll();
        }
        
        private static void llIIIIlllIlIllI() {
            (lIIIllIIllIlII = new int[7])[0] = ((0x3E ^ 0x15) & ~(0xF ^ 0x24));
            CharDef.lIIIllIIllIlII[1] = " ".length();
            CharDef.lIIIllIIllIlII[2] = "  ".length();
            CharDef.lIIIllIIllIlII[3] = "   ".length();
            CharDef.lIIIllIIllIlII[4] = (0x5C ^ 0x42) + (0xB3 ^ 0x96) - -(10 + 113 - 63 + 95) + (0x35 ^ 0x14);
            CharDef.lIIIllIIllIlII[5] = (0xA6 ^ 0xA3 ^ (0x50 ^ 0x5D));
            CharDef.lIIIllIIllIlII[6] = (0xF8 ^ 0xB6 ^ (0x34 ^ 0x7E));
        }
        
        public void draw(final float lllllllllllllIlIIIIIlIIlIIIlIIll, final float lllllllllllllIlIIIIIlIIlIIIlIIlI) {
            this.image.drawEmbedded(lllllllllllllIlIIIIIlIIlIIIlIIll + this.xoffset, lllllllllllllIlIIIIIlIIlIIIlIIlI + this.yoffset, this.width, this.height);
        }
        
        private static boolean llIIIIlllIllIlI(final int lllllllllllllIlIIIIIlIIIlIllIllI, final int lllllllllllllIlIIIIIlIIIlIllIlIl) {
            return lllllllllllllIlIIIIIlIIIlIllIllI > lllllllllllllIlIIIIIlIIIlIllIlIl;
        }
        
        private static String llIIIIllIllIlIl(String lllllllllllllIlIIIIIlIIIllIIlIIl, final String lllllllllllllIlIIIIIlIIIllIIllIl) {
            lllllllllllllIlIIIIIlIIIllIIlIIl = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIlIIIllIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIIIlIIIllIIllII = new StringBuilder();
            final char[] lllllllllllllIlIIIIIlIIIllIIlIll = lllllllllllllIlIIIIIlIIIllIIllIl.toCharArray();
            int lllllllllllllIlIIIIIlIIIllIIlIlI = CharDef.lIIIllIIllIlII[0];
            final short lllllllllllllIlIIIIIlIIIllIIIlII = (Object)((String)lllllllllllllIlIIIIIlIIIllIIlIIl).toCharArray();
            final double lllllllllllllIlIIIIIlIIIllIIIIll = lllllllllllllIlIIIIIlIIIllIIIlII.length;
            String lllllllllllllIlIIIIIlIIIllIIIIlI = (String)CharDef.lIIIllIIllIlII[0];
            while (llIIIIlllIllIIl((int)lllllllllllllIlIIIIIlIIIllIIIIlI, (int)lllllllllllllIlIIIIIlIIIllIIIIll)) {
                final char lllllllllllllIlIIIIIlIIIllIIllll = lllllllllllllIlIIIIIlIIIllIIIlII[lllllllllllllIlIIIIIlIIIllIIIIlI];
                lllllllllllllIlIIIIIlIIIllIIllII.append((char)(lllllllllllllIlIIIIIlIIIllIIllll ^ lllllllllllllIlIIIIIlIIIllIIlIll[lllllllllllllIlIIIIIlIIIllIIlIlI % lllllllllllllIlIIIIIlIIIllIIlIll.length]));
                "".length();
                ++lllllllllllllIlIIIIIlIIIllIIlIlI;
                ++lllllllllllllIlIIIIIlIIIllIIIIlI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIIIlIIIllIIllII);
        }
        
        private static boolean llIIIIlllIllIIl(final int lllllllllllllIlIIIIIlIIIlIlllllI, final int lllllllllllllIlIIIIIlIIIlIllllIl) {
            return lllllllllllllIlIIIIIlIIIlIlllllI < lllllllllllllIlIIIIIlIIIlIllllIl;
        }
        
        private static boolean llIIIIlllIllIII(final int lllllllllllllIlIIIIIlIIIlIlllIlI, final int lllllllllllllIlIIIIIlIIIlIlllIIl) {
            return lllllllllllllIlIIIIIlIIIlIlllIlI <= lllllllllllllIlIIIIIlIIIlIlllIIl;
        }
        
        private static boolean llIIIIlllIlIlll(final Object lllllllllllllIlIIIIIlIIIlIllIIll) {
            return lllllllllllllIlIIIIIlIIIlIllIIll == null;
        }
    }
}
