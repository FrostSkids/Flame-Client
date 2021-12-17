// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.awt.Color;
import net.minecraft.entity.item.EntityItemFrame;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import client.hud.mod.HudMod;

public class TargetHUD extends HudMod
{
    private static final /* synthetic */ String[] lIIIllIIIIlIII;
    private static final /* synthetic */ int[] lIIIllIIIIlIIl;
    /* synthetic */ EntityLivingBase target;
    
    private static boolean llIIIIlIlIlIIlI(final int lllllllllllllIlIIIIIllllIIllIllI) {
        return lllllllllllllIlIIIIIllllIIllIllI == 0;
    }
    
    private static void llIIIIlIlIIllll() {
        (lIIIllIIIIlIII = new String[TargetHUD.lIIIllIIIIlIIl[5]])[TargetHUD.lIIIllIIIIlIIl[0]] = llIIIIlIlIIllIl("GBkrMiI4MAwR", "LxYUG");
        TargetHUD.lIIIllIIIIlIII[TargetHUD.lIIIllIIIIlIIl[2]] = llIIIIlIlIIlllI("GFkBFaf4jUDsj8SYa13AtA==", "KdLji");
        TargetHUD.lIIIllIIIIlIII[TargetHUD.lIIIllIIIIlIIl[3]] = llIIIIlIlIIllIl("w6VwQUh7YsOhROKcnA==", "BFpxK");
        TargetHUD.lIIIllIIIIlIII[TargetHUD.lIIIllIIIIlIIl[8]] = llIIIIlIlIIlllI("gISmfA8NstY=", "PsoOm");
    }
    
    @Override
    public void draw() {
        this.renderTargetHud();
        super.draw();
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT * TargetHUD.lIIIllIIIIlIIl[3] + TargetHUD.lIIIllIIIIlIIl[5];
    }
    
    private static String llIIIIlIlIIlllI(final String lllllllllllllIlIIIIIllllIlIIIIIl, final String lllllllllllllIlIIIIIllllIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIllllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIllllIlIIIIII.getBytes(StandardCharsets.UTF_8)), TargetHUD.lIIIllIIIIlIIl[10]), "DES");
            final Cipher lllllllllllllIlIIIIIllllIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIllllIlIIIlIl.init(TargetHUD.lIIIllIIIIlIIl[3], lllllllllllllIlIIIIIllllIlIIIllI);
            return new String(lllllllllllllIlIIIIIllllIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIllllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIllllIlIIIlII) {
            lllllllllllllIlIIIIIllllIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIlIIIIIllllIllIlIll, final int lllllllllllllIlIIIIIllllIllIllIl) {
        this.fr.drawStringWithShadow(TargetHUD.lIIIllIIIIlIII[TargetHUD.lIIIllIIIIlIIl[2]], (float)(this.getX() + TargetHUD.lIIIllIIIIlIIl[3]), (float)(this.getY() + TargetHUD.lIIIllIIIIlIIl[3]), TargetHUD.lIIIllIIIIlIIl[4]);
        "".length();
        this.fr.drawStringWithShadow(TargetHUD.lIIIllIIIIlIII[TargetHUD.lIIIllIIIIlIIl[3]], (float)(this.getX() + TargetHUD.lIIIllIIIIlIIl[3]), (float)(this.getY() + TargetHUD.lIIIllIIIIlIIl[3] + this.fr.FONT_HEIGHT), TargetHUD.lIIIllIIIIlIIl[4]);
        "".length();
        super.renderDummy(lllllllllllllIlIIIIIllllIllIlIll, lllllllllllllIlIIIIIllllIllIllIl);
    }
    
    static {
        llIIIIlIlIlIIIl();
        llIIIIlIlIIllll();
    }
    
    private static void llIIIIlIlIlIIIl() {
        (lIIIllIIIIlIIl = new int[11])[0] = ((0xD9 ^ 0x9B ^ (0x48 ^ 0x11)) & (119 + 137 - 160 + 42 ^ 34 + 35 + 52 + 24 ^ -" ".length()));
        TargetHUD.lIIIllIIIIlIIl[1] = (0x5A ^ 0x73 ^ (0xEC ^ 0xA1));
        TargetHUD.lIIIllIIIIlIIl[2] = " ".length();
        TargetHUD.lIIIllIIIIlIIl[3] = "  ".length();
        TargetHUD.lIIIllIIIIlIIl[4] = -" ".length();
        TargetHUD.lIIIllIIIIlIIl[5] = (41 + 24 - 33 + 100 ^ 85 + 32 - 85 + 96);
        TargetHUD.lIIIllIIIIlIIl[6] = 159 + 106 - 242 + 147;
        TargetHUD.lIIIllIIIIlIIl[7] = (0x5A ^ 0x22);
        TargetHUD.lIIIllIIIIlIIl[8] = "   ".length();
        TargetHUD.lIIIllIIIIlIIl[9] = 106 + 83 - 33 + 0 + (0x62 ^ 0x5) - (0xC2 ^ 0xAA) + (0x60 ^ 0x4);
        TargetHUD.lIIIllIIIIlIIl[10] = (0x8F ^ 0x87);
    }
    
    private static String llIIIIlIlIIllIl(String lllllllllllllIlIIIIIllllIlIlIIll, final String lllllllllllllIlIIIIIllllIlIlIIlI) {
        lllllllllllllIlIIIIIllllIlIlIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIllllIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIllllIlIlIllI = new StringBuilder();
        final char[] lllllllllllllIlIIIIIllllIlIlIlIl = lllllllllllllIlIIIIIllllIlIlIIlI.toCharArray();
        int lllllllllllllIlIIIIIllllIlIlIlII = TargetHUD.lIIIllIIIIlIIl[0];
        final float lllllllllllllIlIIIIIllllIlIIlllI = (Object)lllllllllllllIlIIIIIllllIlIlIIll.toCharArray();
        final int lllllllllllllIlIIIIIllllIlIIllIl = lllllllllllllIlIIIIIllllIlIIlllI.length;
        char lllllllllllllIlIIIIIllllIlIIllII = (char)TargetHUD.lIIIllIIIIlIIl[0];
        while (llIIIIlIlIlIlII(lllllllllllllIlIIIIIllllIlIIllII, lllllllllllllIlIIIIIllllIlIIllIl)) {
            final char lllllllllllllIlIIIIIllllIlIllIIl = lllllllllllllIlIIIIIllllIlIIlllI[lllllllllllllIlIIIIIllllIlIIllII];
            lllllllllllllIlIIIIIllllIlIlIllI.append((char)(lllllllllllllIlIIIIIllllIlIllIIl ^ lllllllllllllIlIIIIIllllIlIlIlIl[lllllllllllllIlIIIIIllllIlIlIlII % lllllllllllllIlIIIIIllllIlIlIlIl.length]));
            "".length();
            ++lllllllllllllIlIIIIIllllIlIlIlII;
            ++lllllllllllllIlIIIIIllllIlIIllII;
            "".length();
            if (((0xB2 ^ 0x81) & ~(0x83 ^ 0xB0)) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIllllIlIlIllI);
    }
    
    @Override
    public int getWidth() {
        return TargetHUD.lIIIllIIIIlIIl[1];
    }
    
    public TargetHUD() {
        super(TargetHUD.lIIIllIIIIlIII[TargetHUD.lIIIllIIIIlIIl[0]], TargetHUD.lIIIllIIIIlIIl[1], TargetHUD.lIIIllIIIIlIIl[1]);
    }
    
    private void renderTargetHud() {
        if (llIIIIlIlIlIIlI((this.mc.pointedEntity instanceof EntityItemFrame) ? 1 : 0)) {
            this.target = (EntityLivingBase)this.mc.pointedEntity;
            if (llIIIIlIlIlIIll(this.target)) {
                this.fr.drawStringWithShadow(this.target.getName(), (float)(this.getX() + TargetHUD.lIIIllIIIIlIIl[3]), (float)(this.getY() + TargetHUD.lIIIllIIIIlIIl[3]), new Color(TargetHUD.lIIIllIIIIlIIl[6], TargetHUD.lIIIllIIIIlIIl[0], TargetHUD.lIIIllIIIIlIIl[0], TargetHUD.lIIIllIIIIlIIl[7]).getRGB());
                "".length();
                this.fr.drawStringWithShadow(String.valueOf(new StringBuilder(String.valueOf((int)this.target.getHealth())).append(TargetHUD.lIIIllIIIIlIII[TargetHUD.lIIIllIIIIlIIl[8]])), (float)(this.getX() + TargetHUD.lIIIllIIIIlIIl[3]), (float)(this.getY() + TargetHUD.lIIIllIIIIlIIl[3] + this.fr.FONT_HEIGHT), new Color(TargetHUD.lIIIllIIIIlIIl[9], TargetHUD.lIIIllIIIIlIIl[6], TargetHUD.lIIIllIIIIlIIl[0], TargetHUD.lIIIllIIIIlIIl[9]).getRGB());
                "".length();
            }
        }
    }
    
    private static boolean llIIIIlIlIlIlII(final int lllllllllllllIlIIIIIllllIIlllIll, final int lllllllllllllIlIIIIIllllIIlllIlI) {
        return lllllllllllllIlIIIIIllllIIlllIll < lllllllllllllIlIIIIIllllIIlllIlI;
    }
    
    private static boolean llIIIIlIlIlIIll(final Object lllllllllllllIlIIIIIllllIIlllIII) {
        return lllllllllllllIlIIIIIllllIIlllIII != null;
    }
}
