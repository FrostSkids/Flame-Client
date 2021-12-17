// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.io.IOException;
import org.newdawn.slick.util.Log;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.newdawn.slick.util.ResourceLoader;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;

public class PackedSpriteSheet
{
    private static final /* synthetic */ String[] llIlIllIllllIl;
    private static final /* synthetic */ int[] llIlIllIllllll;
    private /* synthetic */ HashMap sections;
    private /* synthetic */ String basePath;
    private /* synthetic */ Image image;
    private /* synthetic */ int filter;
    
    public Image getFullImage() {
        return this.image;
    }
    
    private static boolean lIIlIlIllIIIlIll(final int llllllllllllIllIlIIlIIlIIlIIIlIl) {
        return llllllllllllIllIlIIlIIlIIlIIIlIl != 0;
    }
    
    public PackedSpriteSheet(String llllllllllllIllIlIIlIIlIlIllIIII, final Color llllllllllllIllIlIIlIIlIlIlIllll) throws SlickException {
        this.sections = new HashMap();
        this.filter = PackedSpriteSheet.llIlIllIllllll[0];
        llllllllllllIllIlIIlIIlIlIllIIII = (short)((String)llllllllllllIllIlIIlIIlIlIllIIII).replace((char)PackedSpriteSheet.llIlIllIllllll[1], (char)PackedSpriteSheet.llIlIllIllllll[2]);
        this.basePath = ((String)llllllllllllIllIlIIlIIlIlIllIIII).substring(PackedSpriteSheet.llIlIllIllllll[3], ((String)llllllllllllIllIlIIlIIlIlIllIIII).lastIndexOf(PackedSpriteSheet.llIlIllIllllIl[PackedSpriteSheet.llIlIllIllllll[3]]) + PackedSpriteSheet.llIlIllIllllll[4]);
        this.loadDefinition((String)llllllllllllIllIlIIlIIlIlIllIIII, llllllllllllIllIlIIlIIlIlIlIllll);
    }
    
    private static boolean lIIlIlIllIIIllII(final int llllllllllllIllIlIIlIIlIIlIIlIlI, final int llllllllllllIllIlIIlIIlIIlIIlIIl) {
        return llllllllllllIllIlIIlIIlIIlIIlIlI < llllllllllllIllIlIIlIIlIIlIIlIIl;
    }
    
    public PackedSpriteSheet(final String llllllllllllIllIlIIlIIlIlIlIIlll, final int llllllllllllIllIlIIlIIlIlIlIIllI) throws SlickException {
        this(llllllllllllIllIlIIlIIlIlIlIIlll, llllllllllllIllIlIIlIIlIlIlIIllI, null);
    }
    
    private static void lIIlIlIllIIIIlII() {
        (llIlIllIllllIl = new String[PackedSpriteSheet.llIlIllIllllll[6]])[PackedSpriteSheet.llIlIllIllllll[3]] = lIIlIlIlIllllllI("Yg==", "MCkdk");
        PackedSpriteSheet.llIlIllIllllIl[PackedSpriteSheet.llIlIllIllllll[4]] = lIIlIlIlIlllllll("YXSp5+CWzAw=", "dPdya");
        PackedSpriteSheet.llIlIllIllllIl[PackedSpriteSheet.llIlIllIllllll[0]] = lIIlIlIlIlllllll("k3FhbqKPX4oE3nPsXb4CdBrfNU+eQV2s3gg715cx+BNc+viMK41hHQ==", "HczDs");
        PackedSpriteSheet.llIlIllIllllIl[PackedSpriteSheet.llIlIllIllllll[5]] = lIIlIlIlIllllllI("CxA6HAwpUScfST0DPBMMPgJzFAwrGD0ZHSQePQNJKxg/FUlgUToeHywdOhRJKx4hHQg5Tg==", "MqSpi");
    }
    
    public PackedSpriteSheet(final String llllllllllllIllIlIIlIIlIlIlllIlI) throws SlickException {
        this(llllllllllllIllIlIIlIIlIlIlllIlI, null);
    }
    
    private static String lIIlIlIlIlllllll(final String llllllllllllIllIlIIlIIlIIlIlIIlI, final String llllllllllllIllIlIIlIIlIIlIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIlIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), PackedSpriteSheet.llIlIllIllllll[7]), "DES");
            final Cipher llllllllllllIllIlIIlIIlIIlIlIlII = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIIlIIlIlIlII.init(PackedSpriteSheet.llIlIllIllllll[0], llllllllllllIllIlIIlIIlIIlIlIlIl);
            return new String(llllllllllllIllIlIIlIIlIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIlIIlIlIIll) {
            llllllllllllIllIlIIlIIlIIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    public SpriteSheet getSpriteSheet(final String llllllllllllIllIlIIlIIlIlIIIlIII) {
        final Image llllllllllllIllIlIIlIIlIlIIIIlll = this.getSprite(llllllllllllIllIlIIlIIlIlIIIlIII);
        final Section llllllllllllIllIlIIlIIlIlIIIIllI = this.sections.get(llllllllllllIllIlIIlIIlIlIIIlIII);
        return new SpriteSheet(llllllllllllIllIlIIlIIlIlIIIIlll, llllllllllllIllIlIIlIIlIlIIIIllI.width / llllllllllllIllIlIIlIIlIlIIIIllI.tilesx, llllllllllllIllIlIIlIIlIlIIIIllI.height / llllllllllllIllIlIIlIIlIlIIIIllI.tilesy);
    }
    
    private void loadDefinition(final String llllllllllllIllIlIIlIIlIIllllIIl, final Color llllllllllllIllIlIIlIIlIIllllIII) throws SlickException {
        final BufferedReader llllllllllllIllIlIIlIIlIIlllIlll = new BufferedReader(new InputStreamReader(ResourceLoader.getResourceAsStream(llllllllllllIllIlIIlIIlIIllllIIl)));
        try {
            this.image = new Image(String.valueOf(new StringBuilder().append(this.basePath).append(llllllllllllIllIlIIlIIlIIlllIlll.readLine())), (boolean)(PackedSpriteSheet.llIlIllIllllll[3] != 0), this.filter, llllllllllllIllIlIIlIIlIIllllIII);
            while (lIIlIlIllIIIlIll(llllllllllllIllIlIIlIIlIIlllIlll.ready() ? 1 : 0)) {
                if (lIIlIlIllIIIlIlI(llllllllllllIllIlIIlIIlIIlllIlll.readLine())) {
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    break;
                }
                else {
                    final Section llllllllllllIllIlIIlIIlIIlllllII = new Section(llllllllllllIllIlIIlIIlIIlllIlll);
                    this.sections.put(llllllllllllIllIlIIlIIlIIlllllII.name, llllllllllllIllIlIIlIIlIIlllllII);
                    "".length();
                    if (lIIlIlIllIIIlIlI(llllllllllllIllIlIIlIIlIIlllIlll.readLine())) {
                        "".length();
                        if ((0x67 ^ 0x63) <= "  ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                        continue;
                    }
                }
            }
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        catch (Exception llllllllllllIllIlIIlIIlIIllllIll) {
            Log.error(llllllllllllIllIlIIlIIlIIllllIll);
            throw new SlickException(PackedSpriteSheet.llIlIllIllllIl[PackedSpriteSheet.llIlIllIllllll[5]], llllllllllllIllIlIIlIIlIIllllIll);
        }
    }
    
    private static void lIIlIlIllIIIlIIl() {
        (llIlIllIllllll = new int[8])[0] = "  ".length();
        PackedSpriteSheet.llIlIllIllllll[1] = (0x14 ^ 0x42 ^ (0x1F ^ 0x15));
        PackedSpriteSheet.llIlIllIllllll[2] = (0x3D ^ 0x12);
        PackedSpriteSheet.llIlIllIllllll[3] = ((0x44 ^ 0x4D) & ~(0x9E ^ 0x97));
        PackedSpriteSheet.llIlIllIllllll[4] = " ".length();
        PackedSpriteSheet.llIlIllIllllll[5] = "   ".length();
        PackedSpriteSheet.llIlIllIllllll[6] = (0xD4 ^ 0xAD ^ (0x4C ^ 0x31));
        PackedSpriteSheet.llIlIllIllllll[7] = (29 + 19 - 26 + 114 ^ 36 + 70 + 13 + 9);
    }
    
    public PackedSpriteSheet(String llllllllllllIllIlIIlIIlIlIIlllII, final int llllllllllllIllIlIIlIIlIlIIlllll, final Color llllllllllllIllIlIIlIIlIlIIllIlI) throws SlickException {
        this.sections = new HashMap();
        this.filter = PackedSpriteSheet.llIlIllIllllll[0];
        this.filter = llllllllllllIllIlIIlIIlIlIIlllll;
        llllllllllllIllIlIIlIIlIlIIlllII = llllllllllllIllIlIIlIIlIlIIlllII.replace((char)PackedSpriteSheet.llIlIllIllllll[1], (char)PackedSpriteSheet.llIlIllIllllll[2]);
        this.basePath = llllllllllllIllIlIIlIIlIlIIlllII.substring(PackedSpriteSheet.llIlIllIllllll[3], llllllllllllIllIlIIlIIlIlIIlllII.lastIndexOf(PackedSpriteSheet.llIlIllIllllIl[PackedSpriteSheet.llIlIllIllllll[4]]) + PackedSpriteSheet.llIlIllIllllll[4]);
        this.loadDefinition(llllllllllllIllIlIIlIIlIlIIlllII, llllllllllllIllIlIIlIIlIlIIllIlI);
    }
    
    private static String lIIlIlIlIllllllI(String llllllllllllIllIlIIlIIlIIllIIIlI, final String llllllllllllIllIlIIlIIlIIllIIIIl) {
        llllllllllllIllIlIIlIIlIIllIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlIIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIIlIIllIIlIl = new StringBuilder();
        final char[] llllllllllllIllIlIIlIIlIIllIIlII = llllllllllllIllIlIIlIIlIIllIIIIl.toCharArray();
        int llllllllllllIllIlIIlIIlIIllIIIll = PackedSpriteSheet.llIlIllIllllll[3];
        final double llllllllllllIllIlIIlIIlIIlIlllIl = (Object)llllllllllllIllIlIIlIIlIIllIIIlI.toCharArray();
        final byte llllllllllllIllIlIIlIIlIIlIlllII = (byte)llllllllllllIllIlIIlIIlIIlIlllIl.length;
        String llllllllllllIllIlIIlIIlIIlIllIll = (String)PackedSpriteSheet.llIlIllIllllll[3];
        while (lIIlIlIllIIIllII((int)llllllllllllIllIlIIlIIlIIlIllIll, llllllllllllIllIlIIlIIlIIlIlllII)) {
            final char llllllllllllIllIlIIlIIlIIllIlIII = llllllllllllIllIlIIlIIlIIlIlllIl[llllllllllllIllIlIIlIIlIIlIllIll];
            llllllllllllIllIlIIlIIlIIllIIlIl.append((char)(llllllllllllIllIlIIlIIlIIllIlIII ^ llllllllllllIllIlIIlIIlIIllIIlII[llllllllllllIllIlIIlIIlIIllIIIll % llllllllllllIllIlIIlIIlIIllIIlII.length]));
            "".length();
            ++llllllllllllIllIlIIlIIlIIllIIIll;
            ++llllllllllllIllIlIIlIIlIIlIllIll;
            "".length();
            if (((0x6C ^ 0x2C) & ~(0x4B ^ 0xB)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIIlIIllIIlIl);
    }
    
    public Image getSprite(final String llllllllllllIllIlIIlIIlIlIIlIIlI) {
        final Section llllllllllllIllIlIIlIIlIlIIlIIIl = this.sections.get(llllllllllllIllIlIIlIIlIlIIlIIlI);
        if (lIIlIlIllIIIlIlI(llllllllllllIllIlIIlIIlIlIIlIIIl)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(PackedSpriteSheet.llIlIllIllllIl[PackedSpriteSheet.llIlIllIllllll[0]]).append(llllllllllllIllIlIIlIIlIlIIlIIlI)));
        }
        return this.image.getSubImage(llllllllllllIllIlIIlIIlIlIIlIIIl.x, llllllllllllIllIlIIlIIlIlIIlIIIl.y, llllllllllllIllIlIIlIIlIlIIlIIIl.width, llllllllllllIllIlIIlIIlIlIIlIIIl.height);
    }
    
    static {
        lIIlIlIllIIIlIIl();
        lIIlIlIllIIIIlII();
    }
    
    private static boolean lIIlIlIllIIIlIlI(final Object llllllllllllIllIlIIlIIlIIlIIIlll) {
        return llllllllllllIllIlIIlIIlIIlIIIlll == null;
    }
    
    private class Section
    {
        private static final /* synthetic */ int[] lIIIIllIIIIIII;
        public /* synthetic */ int width;
        public /* synthetic */ String name;
        public /* synthetic */ int x;
        public /* synthetic */ int y;
        public /* synthetic */ int tilesy;
        public /* synthetic */ int tilesx;
        public /* synthetic */ int height;
        
        public Section(final BufferedReader lllllllllllllIlIIlIlIIIIIllllllI) throws IOException {
            this.name = lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim();
            this.x = Integer.parseInt(lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim());
            this.y = Integer.parseInt(lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim());
            this.width = Integer.parseInt(lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim());
            this.height = Integer.parseInt(lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim());
            this.tilesx = Integer.parseInt(lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim());
            this.tilesy = Integer.parseInt(lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim());
            lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim();
            "".length();
            lllllllllllllIlIIlIlIIIIIllllllI.readLine().trim();
            "".length();
            this.tilesx = Math.max(Section.lIIIIllIIIIIII[0], this.tilesx);
            this.tilesy = Math.max(Section.lIIIIllIIIIIII[0], this.tilesy);
        }
        
        private static void lIlllIlIllIllII() {
            (lIIIIllIIIIIII = new int[1])[0] = " ".length();
        }
        
        static {
            lIlllIlIllIllII();
        }
    }
}
