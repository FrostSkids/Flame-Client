// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.awt.Color;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import client.hud.mod.HudMod;

public class Direction extends HudMod
{
    private static final /* synthetic */ String[] lIIIllIIlIIllI;
    private static final /* synthetic */ int[] lIIIllIIlIIlll;
    
    private static String llIIIIllIlIllll(final String lllllllllllllIlIIIIIlIlIIIlIIlII, final String lllllllllllllIlIIIIIlIlIIIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIlIIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), Direction.lIIIllIIlIIlll[9]), "DES");
            final Cipher lllllllllllllIlIIIIIlIlIIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlIlIIIlIlIII.init(Direction.lIIIllIIlIIlll[1], lllllllllllllIlIIIIIlIlIIIlIlIIl);
            return new String(lllllllllllllIlIIIIIlIlIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIlIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIlIIIlIIlll) {
            lllllllllllllIlIIIIIlIlIIIlIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getWidth() {
        return this.fr.getStringWidth(this.getCoordsPlaceholder());
    }
    
    public Direction() {
        super(Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[0]], Direction.lIIIllIIlIIlll[1], Direction.lIIIllIIlIIlll[2]);
    }
    
    private static void llIIIIllIllIIIl() {
        (lIIIllIIlIIllI = new String[Direction.lIIIllIIlIIlll[17]])[Direction.lIIIllIIlIIlll[0]] = llIIIIllIlIlllI("bQUXiwlkjVEetGtDF+KCFw==", "Gvgyu");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[3]] = llIIIIllIlIlllI("Bj1+DLLIYEX+w43xcjrxQQ==", "HGYkC");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[1]] = llIIIIllIlIllll("CiT+F0+fiA0=", "WJVcA");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[4]] = llIIIIllIllIIII("w61BHh8eLxYuHwMkw5JqTMOLfFUJ", "JuZvl");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[5]] = llIIIIllIllIIII("w7V+IC4HNykQLho8w61UfcOSZGo3EA==", "RJdGu");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[6]] = llIIIIllIllIIII("w45TJTECDAQVMR8Hw4BRYsOXX0c2", "igaXp");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[7]] = llIIIIllIlIlllI("4JMZGYsNZMudV1uY2KdeyQwMMlaYl8sC", "UmIlI");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[8]] = llIIIIllIlIllll("91ANL7OQBKrMqu6bOO4qlNbE2roaLOPe", "vvEYM");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[9]] = llIIIIllIlIllll("+ae3KHGyvF9XbIDyQFQwgBWoOwi957OE", "xmlGv");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[10]] = llIIIIllIlIllll("SN8E12lVZOkHGkLYjsG+zkpsUJXYlE4d", "rEHkI");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[11]] = llIIIIllIlIlllI("OIirfjqrZ0+KKYTSLZXx1try5j0OCjr/", "Canda");
        Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[14]] = llIIIIllIlIllll("SUl+KvWTaPpmbdRSTzkbkB3UzWk2kpWJ", "EpmnL");
    }
    
    private static String llIIIIllIllIIII(String lllllllllllllIlIIIIIlIlIIlIIIIll, final String lllllllllllllIlIIIIIlIlIIlIIIlll) {
        lllllllllllllIlIIIIIlIlIIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlIlIIlIIIllI = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlIlIIlIIIlIl = lllllllllllllIlIIIIIlIlIIlIIIlll.toCharArray();
        int lllllllllllllIlIIIIIlIlIIlIIIlII = Direction.lIIIllIIlIIlll[0];
        final Exception lllllllllllllIlIIIIIlIlIIIlllllI = (Object)lllllllllllllIlIIIIIlIlIIlIIIIll.toCharArray();
        final short lllllllllllllIlIIIIIlIlIIIllllIl = (short)lllllllllllllIlIIIIIlIlIIIlllllI.length;
        short lllllllllllllIlIIIIIlIlIIIllllII = (short)Direction.lIIIllIIlIIlll[0];
        while (llIIIIllIllIIll(lllllllllllllIlIIIIIlIlIIIllllII, lllllllllllllIlIIIIIlIlIIIllllIl)) {
            final char lllllllllllllIlIIIIIlIlIIlIIlIIl = lllllllllllllIlIIIIIlIlIIIlllllI[lllllllllllllIlIIIIIlIlIIIllllII];
            lllllllllllllIlIIIIIlIlIIlIIIllI.append((char)(lllllllllllllIlIIIIIlIlIIlIIlIIl ^ lllllllllllllIlIIIIIlIlIIlIIIlIl[lllllllllllllIlIIIIIlIlIIlIIIlII % lllllllllllllIlIIIIIlIlIIlIIIlIl.length]));
            "".length();
            ++lllllllllllllIlIIIIIlIlIIlIIIlII;
            ++lllllllllllllIlIIIIIlIlIIIllllII;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlIlIIlIIIllI);
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIlIIIIIlIlIIlIllIlI, final int lllllllllllllIlIIIIIlIlIIlIlllII) {
        this.fr.drawStringWithShadow(Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[14]], (float)this.getX(), (float)this.getY(), new Color(Direction.lIIIllIIlIIlll[12], Direction.lIIIllIIlIIlll[0], Direction.lIIIllIIlIIlll[12], Direction.lIIIllIIlIIlll[13]).getRGB());
        "".length();
        super.renderDummy(lllllllllllllIlIIIIIlIlIIlIllIlI, lllllllllllllIlIIIIIlIlIIlIlllII);
    }
    
    private static void llIIIIllIllIIlI() {
        (lIIIllIIlIIlll = new int[18])[0] = ((0x37 ^ 0x8) & ~(0x89 ^ 0xB6));
        Direction.lIIIllIIlIIlll[1] = "  ".length();
        Direction.lIIIllIIlIIlll[2] = (0x28 ^ 0x1D);
        Direction.lIIIllIIlIIlll[3] = " ".length();
        Direction.lIIIllIIlIIlll[4] = "   ".length();
        Direction.lIIIllIIlIIlll[5] = (0x2E ^ 0x2A);
        Direction.lIIIllIIlIIlll[6] = (0xEE ^ 0xB4 ^ (0x70 ^ 0x2F));
        Direction.lIIIllIIlIIlll[7] = (0x3C ^ 0x29 ^ (0x73 ^ 0x60));
        Direction.lIIIllIIlIIlll[8] = (0x2 ^ 0x7F ^ (0x2A ^ 0x50));
        Direction.lIIIllIIlIIlll[9] = (0xFF ^ 0xAB ^ (0xC8 ^ 0x94));
        Direction.lIIIllIIlIIlll[10] = (0xCA ^ 0xC3);
        Direction.lIIIllIIlIIlll[11] = (0x39 ^ 0x52 ^ (0x54 ^ 0x35));
        Direction.lIIIllIIlIIlll[12] = 82 + 43 - 52 + 97;
        Direction.lIIIllIIlIIlll[13] = 162 + 49 - 136 + 166 + (60 + 118 + 11 + 9) - (0xFFFFE3F9 & 0x1DB6) + (116 + 130 - 53 + 55);
        Direction.lIIIllIIlIIlll[14] = (0x82 ^ 0x89);
        Direction.lIIIllIIlIIlll[15] = (-(0xFFFFF6DD & 0x6F3A) & (0xFFFFF77F & 0x6FFF));
        Direction.lIIIllIIlIIlll[16] = (0x7A ^ 0x57);
        Direction.lIIIllIIlIIlll[17] = (0x41 ^ 0xA ^ (0xE8 ^ 0xAF));
    }
    
    private static boolean llIIIIllIllIIll(final int lllllllllllllIlIIIIIlIlIIIIllllI, final int lllllllllllllIlIIIIIlIlIIIIlllIl) {
        return lllllllllllllIlIIIIIlIlIIIIllllI < lllllllllllllIlIIIIIlIlIIIIlllIl;
    }
    
    private static String llIIIIllIlIlllI(final String lllllllllllllIlIIIIIlIlIIIllIIIl, final String lllllllllllllIlIIIIIlIlIIIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIlIIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIlIlIIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIlIlIIIllIlIl.init(Direction.lIIIllIIlIIlll[1], lllllllllllllIlIIIIIlIlIIIllIllI);
            return new String(lllllllllllllIlIIIIIlIlIIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIlIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIlIIIllIlII) {
            lllllllllllllIlIIIIIlIlIIIllIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIIllIllIIlI();
        llIIIIllIllIIIl();
    }
    
    private int getDirectionFacing() {
        int lllllllllllllIlIIIIIlIlIIlIlIlIl = (int)this.mc.renderViewEntity.rotationYaw;
        lllllllllllllIlIIIIIlIlIIlIlIlIl += 1000;
        lllllllllllllIlIIIIIlIlIIlIlIlIl += 22;
        lllllllllllllIlIIIIIlIlIIlIlIlIl %= Direction.lIIIllIIlIIlll[15];
        return lllllllllllllIlIIIIIlIlIIlIlIlIl / Direction.lIIIllIIlIIlll[16];
    }
    
    private String getCoordsPlaceholder() {
        return Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[3]];
    }
    
    @Override
    public void draw() {
        String lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[1]];
        switch (this.getDirectionFacing()) {
            case 0: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[4]];
                "".length();
                if (" ".length() <= -" ".length()) {
                    return;
                }
                break;
            }
            case 1: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[5]];
                "".length();
                if ((0xC ^ 0x8) < " ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[6]];
                "".length();
                if ("  ".length() >= (0x17 ^ 0x13)) {
                    return;
                }
                break;
            }
            case 3: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[7]];
                "".length();
                if (((0x51 ^ 0x60 ^ (0x7D ^ 0x66)) & (117 + 153 - 110 + 11 ^ 60 + 95 - 94 + 68 ^ -" ".length())) > 0) {
                    return;
                }
                break;
            }
            case 4: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[8]];
                "".length();
                if ((0x58 ^ 0x5D) == 0x0) {
                    return;
                }
                break;
            }
            case 5: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[9]];
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                break;
            }
            case 6: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[10]];
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                break;
            }
            case 7: {
                lllllllllllllIlIIIIIlIlIIllIIlII = Direction.lIIIllIIlIIllI[Direction.lIIIllIIlIIlll[11]];
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                break;
            }
        }
        super.draw();
        this.fr.drawStringWithShadow(lllllllllllllIlIIIIIlIlIIllIIlII, (float)this.getX(), (float)this.getY(), new Color(Direction.lIIIllIIlIIlll[12], Direction.lIIIllIIlIIlll[0], Direction.lIIIllIIlIIlll[12], Direction.lIIIllIIlIIlll[13]).getRGB());
        "".length();
    }
}
