// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import client.hud.mod.HudMod;

public class PingHud extends HudMod
{
    private static final /* synthetic */ int[] llIIIIlllIIIlI;
    private static final /* synthetic */ String[] llIIIIllIlllII;
    
    static {
        lIIIlIIIIlIlIIII();
        lIIIlIIIIlIIlIll();
    }
    
    private static void lIIIlIIIIlIlIIII() {
        (llIIIIlllIIIlI = new int[8])[0] = ((0x24 ^ 0xB) & ~(0x9C ^ 0xB3));
        PingHud.llIIIIlllIIIlI[1] = "   ".length();
        PingHud.llIIIIlllIIIlI[2] = (45 + 82 - 24 + 38 ^ 35 + 41 - 13 + 91);
        PingHud.llIIIIlllIIIlI[3] = " ".length();
        PingHud.llIIIIlllIIIlI[4] = -" ".length();
        PingHud.llIIIIlllIIIlI[5] = "  ".length();
        PingHud.llIIIIlllIIIlI[6] = (0xA ^ 0xE);
        PingHud.llIIIIlllIIIlI[7] = (118 + 78 - 143 + 129 ^ 151 + 43 - 115 + 111);
    }
    
    private static String lIIIlIIIIlIIIIlI(final String llllllllllllIlllIllIlIIIlIIlllIl, final String llllllllllllIlllIllIlIIIlIIllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIlIIIlIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIlIIIlIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIlIIIlIlIIIIl.init(PingHud.llIIIIlllIIIlI[5], llllllllllllIlllIllIlIIIlIlIIIlI);
            return new String(llllllllllllIlllIllIlIIIlIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlIIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIlIIIlIlIIIII) {
            llllllllllllIlllIllIlIIIlIlIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void renderDummy(final int llllllllllllIlllIllIlIIIlIllIIIl, final int llllllllllllIlllIllIlIIIlIllIIII) {
        this.fr.drawStringWithShadow(PingHud.llIIIIllIlllII[PingHud.llIIIIlllIIIlI[5]], (float)this.getX(), (float)this.getY(), PingHud.llIIIIlllIIIlI[4]);
        "".length();
        super.renderDummy(llllllllllllIlllIllIlIIIlIllIIIl, llllllllllllIlllIllIlIIIlIllIIII);
    }
    
    private static String lIIIlIIIIlIIlIlI(final String llllllllllllIlllIllIlIIIlIIlIIII, final String llllllllllllIlllIllIlIIIlIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIlIIIlIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlIIIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), PingHud.llIIIIlllIIIlI[7]), "DES");
            final Cipher llllllllllllIlllIllIlIIIlIIlIlII = Cipher.getInstance("DES");
            llllllllllllIlllIllIlIIIlIIlIlII.init(PingHud.llIIIIlllIIIlI[5], llllllllllllIlllIllIlIIIlIIlIlIl);
            return new String(llllllllllllIlllIllIlIIIlIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlIIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIlIIIlIIlIIll) {
            llllllllllllIlllIllIlIIIlIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIIIlIlIIIl(final Object llllllllllllIlllIllIlIIIIllIllll) {
        return llllllllllllIlllIllIlIIIIllIllll != null;
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
    
    private static void lIIIlIIIIlIIlIll() {
        (llIIIIllIlllII = new String[PingHud.llIIIIlllIIIlI[6]])[PingHud.llIIIIlllIIIlI[0]] = lIIIlIIIIlIIIIlI("O+/r99Ep6po=", "iVKxO");
        PingHud.llIIIIllIlllII[PingHud.llIIIIlllIIIlI[3]] = lIIIlIIIIlIIlIIl("w7BhND8mMMOyVGzDr2F1", "WUdVH");
        PingHud.llIIIIllIlllII[PingHud.llIIIIlllIIIlI[5]] = lIIIlIIIIlIIlIlI("O3uXwDxzmDj72DzdoiNRgO7J2zn2g/3k", "lhTYp");
        PingHud.llIIIIllIlllII[PingHud.llIIIIlllIIIlI[1]] = lIIIlIIIIlIIlIlI("RXfMp9FEZ49UTOxWSeyj3g==", "MEWjV");
    }
    
    @Override
    public int getWidth() {
        return this.fr.getStringWidth(PingHud.llIIIIllIlllII[PingHud.llIIIIlllIIIlI[1]]);
    }
    
    private static boolean lIIIlIIIIlIlIIlI(final int llllllllllllIlllIllIlIIIIlllIIlI, final int llllllllllllIlllIllIlIIIIlllIIIl) {
        return llllllllllllIlllIllIlIIIIlllIIlI < llllllllllllIlllIllIlIIIIlllIIIl;
    }
    
    private static String lIIIlIIIIlIIlIIl(String llllllllllllIlllIllIlIIIIlllllIl, final String llllllllllllIlllIllIlIIIIlllllII) {
        llllllllllllIlllIllIlIIIIlllllIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllIlIIIIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIlIIIlIIIIIII = new StringBuilder();
        final char[] llllllllllllIlllIllIlIIIIlllllll = llllllllllllIlllIllIlIIIIlllllII.toCharArray();
        int llllllllllllIlllIllIlIIIIllllllI = PingHud.llIIIIlllIIIlI[0];
        final float llllllllllllIlllIllIlIIIIllllIII = (Object)llllllllllllIlllIllIlIIIIlllllIl.toCharArray();
        final short llllllllllllIlllIllIlIIIIlllIlll = (short)llllllllllllIlllIllIlIIIIllllIII.length;
        boolean llllllllllllIlllIllIlIIIIlllIllI = PingHud.llIIIIlllIIIlI[0] != 0;
        while (lIIIlIIIIlIlIIlI(llllllllllllIlllIllIlIIIIlllIllI ? 1 : 0, llllllllllllIlllIllIlIIIIlllIlll)) {
            final char llllllllllllIlllIllIlIIIlIIIIIll = llllllllllllIlllIllIlIIIIllllIII[llllllllllllIlllIllIlIIIIlllIllI];
            llllllllllllIlllIllIlIIIlIIIIIII.append((char)(llllllllllllIlllIllIlIIIlIIIIIll ^ llllllllllllIlllIllIlIIIIlllllll[llllllllllllIlllIllIlIIIIllllllI % llllllllllllIlllIllIlIIIIlllllll.length]));
            "".length();
            ++llllllllllllIlllIllIlIIIIllllllI;
            ++llllllllllllIlllIllIlIIIIlllIllI;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIlIIIlIIIIIII);
    }
    
    public PingHud() {
        super(PingHud.llIIIIllIlllII[PingHud.llIIIIlllIIIlI[0]], PingHud.llIIIIlllIIIlI[1], PingHud.llIIIIlllIIIlI[2]);
    }
    
    @Override
    public void draw() {
        if (lIIIlIIIIlIlIIIl(this.mc.getNetHandler()) && lIIIlIIIIlIlIIIl(this.mc.thePlayer) && lIIIlIIIIlIlIIIl(this.mc.getNetHandler().getPlayerInfo(this.mc.thePlayer.getUniqueID()))) {
            this.fr.drawStringWithShadow(String.valueOf(new StringBuilder(PingHud.llIIIIllIlllII[PingHud.llIIIIlllIIIlI[3]]).append(this.mc.getNetHandler().getPlayerInfo(this.mc.thePlayer.getUniqueID()).getResponseTime())), (float)this.getX(), (float)this.getY(), PingHud.llIIIIlllIIIlI[4]);
            "".length();
        }
        super.draw();
    }
}
