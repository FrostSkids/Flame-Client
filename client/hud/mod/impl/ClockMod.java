// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.awt.Color;
import java.time.temporal.TemporalAccessor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import client.hud.mod.HudMod;

public class ClockMod extends HudMod
{
    private static final /* synthetic */ int[] llllIlIllIllI;
    private static final /* synthetic */ String[] llllIlIllIlII;
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
    
    public ClockMod() {
        super(ClockMod.llllIlIllIlII[ClockMod.llllIlIllIllI[0]], ClockMod.llllIlIllIllI[1], ClockMod.llllIlIllIllI[2]);
    }
    
    static {
        lIlIlIlIlIlllll();
        lIlIlIlIlIlIlIl();
    }
    
    private static void lIlIlIlIlIlIlIl() {
        (llllIlIllIlII = new String[ClockMod.llllIlIllIllI[6]])[ClockMod.llllIlIllIllI[0]] = lIlIlIlIlIlIIll("rZDLnYu2oCo=", "XMDbF");
        ClockMod.llllIlIllIlII[ClockMod.llllIlIllIllI[3]] = lIlIlIlIlIlIlII("w4NlX2J3VGVfaA==", "dUoRG");
        ClockMod.llllIlIllIlII[ClockMod.llllIlIllIllI[1]] = lIlIlIlIlIlIlII("w5JsCWsYGHjDhmcU", "uXaQu");
    }
    
    private static String lIlIlIlIlIlIlII(String lllllllllllllIlIllIlIllIlIlIIIIl, final String lllllllllllllIlIllIlIllIlIIlllll) {
        lllllllllllllIlIllIlIllIlIlIIIIl = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIlIllIlIlIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlIllIlIlIIllI = new StringBuilder();
        final char[] lllllllllllllIlIllIlIllIlIlIIlIl = lllllllllllllIlIllIlIllIlIIlllll.toCharArray();
        int lllllllllllllIlIllIlIllIlIlIIIll = ClockMod.llllIlIllIllI[0];
        final boolean lllllllllllllIlIllIlIllIlIIllIll = (Object)((String)lllllllllllllIlIllIlIllIlIlIIIIl).toCharArray();
        final float lllllllllllllIlIllIlIllIlIIllIIl = lllllllllllllIlIllIlIllIlIIllIll.length;
        Exception lllllllllllllIlIllIlIllIlIIllIII = (Exception)ClockMod.llllIlIllIllI[0];
        while (lIlIlIlIllIIIII((int)lllllllllllllIlIllIlIllIlIIllIII, (int)lllllllllllllIlIllIlIllIlIIllIIl)) {
            final char lllllllllllllIlIllIlIllIlIlIlIlI = lllllllllllllIlIllIlIllIlIIllIll[lllllllllllllIlIllIlIllIlIIllIII];
            lllllllllllllIlIllIlIllIlIlIIllI.append((char)(lllllllllllllIlIllIlIllIlIlIlIlI ^ lllllllllllllIlIllIlIllIlIlIIlIl[lllllllllllllIlIllIlIllIlIlIIIll % lllllllllllllIlIllIlIllIlIlIIlIl.length]));
            "".length();
            ++lllllllllllllIlIllIlIllIlIlIIIll;
            ++lllllllllllllIlIllIlIllIlIIllIII;
            "".length();
            if (" ".length() >= (0xA8 ^ 0x9A ^ (0xA8 ^ 0x9E))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlIllIlIlIIllI);
    }
    
    private static String lIlIlIlIlIlIIll(final String lllllllllllllIlIllIlIllIlIIIIIll, final String lllllllllllllIlIllIlIllIlIIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIllIlIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIllIlIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIllIlIIIlIII.init(ClockMod.llllIlIllIllI[1], lllllllllllllIlIllIlIllIlIIIlIlI);
            return new String(lllllllllllllIlIllIlIllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIllIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIllIlIIIIlll) {
            lllllllllllllIlIllIlIllIlIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private String getTime() {
        final DateTimeFormatter lllllllllllllIlIllIlIllIllIIIlIl = DateTimeFormatter.ofPattern(ClockMod.llllIlIllIlII[ClockMod.llllIlIllIllI[1]]);
        final LocalDateTime lllllllllllllIlIllIlIllIllIIIlII = LocalDateTime.now();
        return lllllllllllllIlIllIlIllIllIIIlIl.format(lllllllllllllIlIllIlIllIllIIIlII);
    }
    
    private static void lIlIlIlIlIlllll() {
        (llllIlIllIllI = new int[7])[0] = ((0x60 ^ 0x59) & ~(0xB ^ 0x32));
        ClockMod.llllIlIllIllI[1] = "  ".length();
        ClockMod.llllIlIllIllI[2] = (0x23 ^ 0x79 ^ (0xDA ^ 0xBF));
        ClockMod.llllIlIllIllI[3] = " ".length();
        ClockMod.llllIlIllIllI[4] = 183 + 136 - 276 + 206 + (0x73 ^ 0x3) - (177 + 161 - 130 + 22) + (0x28 ^ 0x54);
        ClockMod.llllIlIllIllI[5] = (204 + 205 - 228 + 54 ^ 154 + 74 - 132 + 94);
        ClockMod.llllIlIllIllI[6] = "   ".length();
    }
    
    private static boolean lIlIlIlIllIIIII(final int lllllllllllllIlIllIlIllIIllllIII, final int lllllllllllllIlIllIlIllIIlllIllI) {
        return lllllllllllllIlIllIlIllIIllllIII < lllllllllllllIlIllIlIllIIlllIllI;
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIlIllIlIllIllIIlllI, final int lllllllllllllIlIllIlIllIllIlIIIl) {
        this.fr.drawStringWithShadow(this.getTime(), (float)(this.getX() + ClockMod.llllIlIllIllI[3]), (float)(this.getY() + ClockMod.llllIlIllIllI[3]), new Color(ClockMod.llllIlIllIllI[4], ClockMod.llllIlIllIllI[5], ClockMod.llllIlIllIllI[5]).getRGB());
        "".length();
        super.renderDummy(lllllllllllllIlIllIlIllIllIIlllI, lllllllllllllIlIllIlIllIllIlIIIl);
    }
    
    @Override
    public void draw() {
        this.fr.drawStringWithShadow(this.getTime(), (float)(this.getX() + ClockMod.llllIlIllIllI[3]), (float)(this.getY() + ClockMod.llllIlIllIllI[3]), new Color(ClockMod.llllIlIllIllI[4], ClockMod.llllIlIllIllI[5], ClockMod.llllIlIllIllI[5]).getRGB());
        "".length();
    }
    
    @Override
    public int getWidth() {
        return this.fr.getStringWidth(ClockMod.llllIlIllIlII[ClockMod.llllIlIllIllI[3]]);
    }
}
