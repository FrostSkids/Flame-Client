// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.client.multiplayer.WorldClient;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import client.ui.MainMenu;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.GlStateManager;

public class GuiGameOver extends GuiScreen implements GuiYesNoCallback
{
    private /* synthetic */ boolean field_146346_f;
    private /* synthetic */ int enableButtonsTimer;
    private static final /* synthetic */ String[] llIIIlIIIIlIll;
    private static final /* synthetic */ int[] llIIIlIIIlIlII;
    
    @Override
    public void drawScreen(final int llllllllllllIlllIllIIIlIlllllIlI, final int llllllllllllIlllIllIIIlIllllllll, final float llllllllllllIlllIllIIIlIlllllIII) {
        this.drawGradientRect(GuiGameOver.llIIIlIIIlIlII[0], GuiGameOver.llIIIlIIIlIlII[0], this.width, this.height, GuiGameOver.llIIIlIIIlIlII[12], GuiGameOver.llIIIlIIIlIlII[13]);
        GlStateManager.pushMatrix();
        GlStateManager.scale(2.0f, 2.0f, 2.0f);
        final boolean llllllllllllIlllIllIIIlIllllllIl = this.mc.theWorld.getWorldInfo().isHardcoreModeEnabled();
        String s;
        if (lIIIlIIIllIIlIlI(llllllllllllIlllIllIIIlIllllllIl ? 1 : 0)) {
            s = I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[14]], new Object[GuiGameOver.llIIIlIIIlIlII[0]]);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            s = I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[15]], new Object[GuiGameOver.llIIIlIIIlIlII[0]]);
        }
        final String llllllllllllIlllIllIIIlIllllllII = s;
        this.drawCenteredString(this.fontRendererObj, llllllllllllIlllIllIIIlIllllllII, this.width / GuiGameOver.llIIIlIIIlIlII[2] / GuiGameOver.llIIIlIIIlIlII[2], GuiGameOver.llIIIlIIIlIlII[16], GuiGameOver.llIIIlIIIlIlII[17]);
        GlStateManager.popMatrix();
        if (lIIIlIIIllIIlIlI(llllllllllllIlllIllIIIlIllllllIl ? 1 : 0)) {
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[18]], new Object[GuiGameOver.llIIIlIIIlIlII[0]]), this.width / GuiGameOver.llIIIlIIIlIlII[2], GuiGameOver.llIIIlIIIlIlII[19], GuiGameOver.llIIIlIIIlIlII[17]);
        }
        this.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[20]], new Object[GuiGameOver.llIIIlIIIlIlII[0]]))).append(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[21]]).append(EnumChatFormatting.YELLOW).append(this.mc.thePlayer.getScore())), this.width / GuiGameOver.llIIIlIIIlIlII[2], GuiGameOver.llIIIlIIIlIlII[3], GuiGameOver.llIIIlIIIlIlII[17]);
        super.drawScreen(llllllllllllIlllIllIIIlIlllllIlI, llllllllllllIlllIllIIIlIllllllll, llllllllllllIlllIllIIIlIlllllIII);
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllIllIIIllIIIlIIII) throws IOException {
        switch (llllllllllllIlllIllIIIllIIIlIIII.id) {
            case 0: {
                this.mc.thePlayer.respawnPlayer();
                this.mc.displayGuiScreen(null);
                "".length();
                if ((55 + 61 + 7 + 66 ^ 75 + 47 - 13 + 76) == ((0x1E ^ 0x5A ^ ((0x59 ^ 0x74) & ~(0x55 ^ 0x78))) & (0xF5 ^ 0xB9 ^ (0x42 ^ 0x4A) ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 1: {
                if (!lIIIlIIIllIIlIlI(this.mc.theWorld.getWorldInfo().isHardcoreModeEnabled() ? 1 : 0)) {
                    final GuiYesNo llllllllllllIlllIllIIIllIIIlIIlI = new GuiYesNo(this, I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[4]], new Object[GuiGameOver.llIIIlIIIlIlII[0]]), GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[8]], I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[9]], new Object[GuiGameOver.llIIIlIIIlIlII[0]]), I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[10]], new Object[GuiGameOver.llIIIlIIIlIlII[0]]), GuiGameOver.llIIIlIIIlIlII[0]);
                    this.mc.displayGuiScreen(llllllllllllIlllIllIIIllIIIlIIlI);
                    llllllllllllIlllIllIIIllIIIlIIlI.setButtonDelay(GuiGameOver.llIIIlIIIlIlII[11]);
                    break;
                }
                this.mc.displayGuiScreen(new MainMenu());
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
        }
    }
    
    private static boolean lIIIlIIIllIIllIl(final int llllllllllllIlllIllIIIlIlIlIIIll, final int llllllllllllIlllIllIIIlIlIlIIIIl) {
        return llllllllllllIlllIllIIIlIlIlIIIll == llllllllllllIlllIllIIIlIlIlIIIIl;
    }
    
    private static boolean lIIIlIIIllIIlIlI(final int llllllllllllIlllIllIIIlIlIIlIIIl) {
        return llllllllllllIlllIllIIIlIlIIlIIIl != 0;
    }
    
    private static String lIIIlIIIlIllIlII(final String llllllllllllIlllIllIIIlIlllIIIll, final String llllllllllllIlllIllIIIlIlllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIlIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), GuiGameOver.llIIIlIIIlIlII[14]), "DES");
            final Cipher llllllllllllIlllIllIIIlIlllIIlll = Cipher.getInstance("DES");
            llllllllllllIlllIllIIIlIlllIIlll.init(GuiGameOver.llIIIlIIIlIlII[2], llllllllllllIlllIllIIIlIlllIlIII);
            return new String(llllllllllllIlllIllIIIlIlllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIlIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIlIlllIIllI) {
            llllllllllllIlllIllIIIlIlllIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return GuiGameOver.llIIIlIIIlIlII[0] != 0;
    }
    
    private static boolean lIIIlIIIllIIllII(final int llllllllllllIlllIllIIIlIlIIIllII) {
        return llllllllllllIlllIllIIIlIlIIIllII == 0;
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlllIllIIIllIIIllIIl, final int llllllllllllIlllIllIIIllIIIllIII) throws IOException {
    }
    
    public GuiGameOver() {
        this.field_146346_f = (GuiGameOver.llIIIlIIIlIlII[0] != 0);
    }
    
    private static String lIIIlIIIlIllIIIl(final String llllllllllllIlllIllIIIlIlIllIllI, final String llllllllllllIlllIllIIIlIlIllIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIlIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIlIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIIlIlIllllII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIIlIlIllllII.init(GuiGameOver.llIIIlIIIlIlII[2], llllllllllllIlllIllIIIlIlIllllIl);
            return new String(llllllllllllIlllIllIIIlIlIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIlIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIlIlIlllIll) {
            llllllllllllIlllIllIIIlIlIlllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        this.enableButtonsTimer += GuiGameOver.llIIIlIIIlIlII[1];
        if (lIIIlIIIllIIllIl(this.enableButtonsTimer, GuiGameOver.llIIIlIIIlIlII[11])) {
            final long llllllllllllIlllIllIIIlIlllIllIl = (long)this.buttonList.iterator();
            "".length();
            if (((0x33 ^ 0x53) & ~(0x4C ^ 0x2C)) >= "   ".length()) {
                return;
            }
            while (!lIIIlIIIllIIllII(((Iterator)llllllllllllIlllIllIIIlIlllIllIl).hasNext() ? 1 : 0)) {
                final GuiButton llllllllllllIlllIllIIIlIllllIIII = ((Iterator<GuiButton>)llllllllllllIlllIllIIIlIlllIllIl).next();
                llllllllllllIlllIllIIIlIllllIIII.enabled = (GuiGameOver.llIIIlIIIlIlII[1] != 0);
            }
        }
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        if (lIIIlIIIllIIlIlI(this.mc.theWorld.getWorldInfo().isHardcoreModeEnabled() ? 1 : 0)) {
            if (lIIIlIIIllIIlIlI(this.mc.isIntegratedServerRunning() ? 1 : 0)) {
                this.buttonList.add(new GuiButton(GuiGameOver.llIIIlIIIlIlII[1], this.width / GuiGameOver.llIIIlIIIlIlII[2] - GuiGameOver.llIIIlIIIlIlII[3], this.height / GuiGameOver.llIIIlIIIlIlII[4] + GuiGameOver.llIIIlIIIlIlII[5], I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[0]], new Object[GuiGameOver.llIIIlIIIlIlII[0]])));
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.buttonList.add(new GuiButton(GuiGameOver.llIIIlIIIlIlII[1], this.width / GuiGameOver.llIIIlIIIlIlII[2] - GuiGameOver.llIIIlIIIlIlII[3], this.height / GuiGameOver.llIIIlIIIlIlII[4] + GuiGameOver.llIIIlIIIlIlII[5], I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[1]], new Object[GuiGameOver.llIIIlIIIlIlII[0]])));
                "".length();
                "".length();
                if (((54 + 104 - 92 + 78 ^ 99 + 42 - 81 + 77) & (0xB ^ 0x50 ^ (0x49 ^ 0xB) ^ -" ".length())) > 0) {
                    return;
                }
            }
        }
        else {
            this.buttonList.add(new GuiButton(GuiGameOver.llIIIlIIIlIlII[0], this.width / GuiGameOver.llIIIlIIIlIlII[2] - GuiGameOver.llIIIlIIIlIlII[3], this.height / GuiGameOver.llIIIlIIIlIlII[4] + GuiGameOver.llIIIlIIIlIlII[6], I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[2]], new Object[GuiGameOver.llIIIlIIIlIlII[0]])));
            "".length();
            this.buttonList.add(new GuiButton(GuiGameOver.llIIIlIIIlIlII[1], this.width / GuiGameOver.llIIIlIIIlIlII[2] - GuiGameOver.llIIIlIIIlIlII[3], this.height / GuiGameOver.llIIIlIIIlIlII[4] + GuiGameOver.llIIIlIIIlIlII[5], I18n.format(GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[7]], new Object[GuiGameOver.llIIIlIIIlIlII[0]])));
            "".length();
            if (lIIIlIIIllIIlIll(this.mc.getSession())) {
                this.buttonList.get(GuiGameOver.llIIIlIIIlIlII[1]).enabled = (GuiGameOver.llIIIlIIIlIlII[0] != 0);
            }
        }
        final double llllllllllllIlllIllIIIllIIIllIll = (double)this.buttonList.iterator();
        "".length();
        if ("   ".length() == (0x99 ^ 0x9D)) {
            return;
        }
        while (!lIIIlIIIllIIllII(((Iterator)llllllllllllIlllIllIIIllIIIllIll).hasNext() ? 1 : 0)) {
            final GuiButton llllllllllllIlllIllIIIllIIIllllI = ((Iterator<GuiButton>)llllllllllllIlllIllIIIllIIIllIll).next();
            llllllllllllIlllIllIIIllIIIllllI.enabled = (GuiGameOver.llIIIlIIIlIlII[0] != 0);
        }
    }
    
    static {
        lIIIlIIIllIIlIIl();
        lIIIlIIIlIlllIll();
    }
    
    private static void lIIIlIIIlIlllIll() {
        (llIIIlIIIIlIll = new String[GuiGameOver.llIIIlIIIlIlII[22]])[GuiGameOver.llIIIlIIIlIlII[0]] = lIIIlIIIlIllIIIl("1wxXO/Pa3So+wsqXXbAudnUag2bYMuHI", "LOBqp");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[1]] = lIIIlIIIlIllIlII("C4/gkPrr9CJN0gFp72+saCQ6jVh3DY2/", "MhTtP");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[2]] = lIIIlIIIlIllIIIl("L4fWU/d/LKqCY7vCW1232XGIhy4btNTh", "MIaRH");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[7]] = lIIIlIIIlIllIIIl("rReq2+vKhHaaCwv0P7Fa7lSYSMW6e72s", "RZCri");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[4]] = lIIIlIIIlIllIIIl("TUxSjMdYRCJLoszR94jjK2/X1UZ1jd9O36sMiYtblE4=", "EQxUQ");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[8]] = lIIIlIIIlIlllIlI("", "mwbWa");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[9]] = lIIIlIIIlIlllIlI("PCMiOwsLJTEqBjZoNyYXNCMQLBE9Iy0=", "XFCOc");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[10]] = lIIIlIIIlIlllIlI("LyAOLhsYJh0/FiVrHT8AOyQYNA==", "KEoZs");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[14]] = lIIIlIIIlIlllIlI("Cz0QAR08OwMQEAF2BRwBAz1fHRQdPBIaBwo=", "oXquu");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[15]] = lIIIlIIIlIlllIlI("KxICICIcFBExLyFZFz0+IxI=", "OwcTJ");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[18]] = lIIIlIIIlIllIlII("tFwlOs5LOLNPhNJquZ36uIwMWc14QoneeoyvW2FRf7o=", "kinff");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[20]] = lIIIlIIIlIllIIIl("PGwDq/PLSMz8cPxMXhn4ckb+kZUUcqLj", "DUdfa");
        GuiGameOver.llIIIlIIIIlIll[GuiGameOver.llIIIlIIIlIlII[21]] = lIIIlIIIlIllIlII("x5yVSUhdJAo=", "jlXHf");
    }
    
    private static boolean lIIIlIIIllIIlllI(final int llllllllllllIlllIllIIIlIlIIlllII, final int llllllllllllIlllIllIIIlIlIIllIlI) {
        return llllllllllllIlllIllIIIlIlIIlllII < llllllllllllIlllIllIIIlIlIIllIlI;
    }
    
    @Override
    public void confirmClicked(final boolean llllllllllllIlllIllIIIllIIIIlIll, final int llllllllllllIlllIllIIIllIIIIlIlI) {
        if (lIIIlIIIllIIlIlI(llllllllllllIlllIllIIIllIIIIlIll ? 1 : 0)) {
            this.mc.theWorld.sendQuittingDisconnectingPacket();
            this.mc.loadWorld(null);
            this.mc.displayGuiScreen(new MainMenu());
            "".length();
            if (" ".length() == ((0xBB ^ 0x94) & ~(0xC ^ 0x23))) {
                return;
            }
        }
        else {
            this.mc.thePlayer.respawnPlayer();
            this.mc.displayGuiScreen(null);
        }
    }
    
    private static boolean lIIIlIIIllIIlIll(final Object llllllllllllIlllIllIIIlIlIIlIlIl) {
        return llllllllllllIlllIllIIIlIlIIlIlIl == null;
    }
    
    private static void lIIIlIIIllIIlIIl() {
        (llIIIlIIIlIlII = new int[23])[0] = ((0x6F ^ 0x2B) & ~(0x32 ^ 0x76));
        GuiGameOver.llIIIlIIIlIlII[1] = " ".length();
        GuiGameOver.llIIIlIIIlIlII[2] = "  ".length();
        GuiGameOver.llIIIlIIIlIlII[3] = (0x26 ^ 0x42);
        GuiGameOver.llIIIlIIIlIlII[4] = (0xC ^ 0x8);
        GuiGameOver.llIIIlIIIlIlII[5] = (0x5D ^ 0x50 ^ (0x13 ^ 0x7E));
        GuiGameOver.llIIIlIIIlIlII[6] = (0x27 ^ 0x40 ^ (0x4E ^ 0x61));
        GuiGameOver.llIIIlIIIlIlII[7] = "   ".length();
        GuiGameOver.llIIIlIIIlIlII[8] = (0x43 ^ 0x46);
        GuiGameOver.llIIIlIIIlIlII[9] = (0x46 ^ 0x48 ^ (0x1C ^ 0x14));
        GuiGameOver.llIIIlIIIlIlII[10] = (111 + 10 - 12 + 90 ^ 183 + 64 - 178 + 123);
        GuiGameOver.llIIIlIIIlIlII[11] = (0x39 ^ 0x7A ^ (0x7D ^ 0x2A));
        GuiGameOver.llIIIlIIIlIlII[12] = (-(0xFFFFDE7F & 0x6BFC) & (0xFFFFDF7F & 0x60506AFB));
        GuiGameOver.llIIIlIIIlIlII[13] = -(-(0xFFFFB8C3 & 0x573F) & (0xFFFFDFDA & 0x5F7FFFF7));
        GuiGameOver.llIIIlIIIlIlII[14] = (0xA ^ 0x42 ^ (0xDF ^ 0x9F));
        GuiGameOver.llIIIlIIIlIlII[15] = (0x76 ^ 0x65 ^ (0x90 ^ 0x8A));
        GuiGameOver.llIIIlIIIlIlII[16] = (0xBD ^ 0xA3);
        GuiGameOver.llIIIlIIIlIlII[17] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiGameOver.llIIIlIIIlIlII[18] = (0x24 ^ 0x56 ^ (0xD5 ^ 0xAD));
        GuiGameOver.llIIIlIIIlIlII[19] = (0x29 ^ 0x7) + (0xB3 ^ 0x80) - -(0x36 ^ 0x13) + (0x7D ^ 0x77);
        GuiGameOver.llIIIlIIIlIlII[20] = (109 + 86 - 134 + 97 ^ 104 + 47 - 138 + 136);
        GuiGameOver.llIIIlIIIlIlII[21] = (0x1C ^ 0x10);
        GuiGameOver.llIIIlIIIlIlII[22] = (0x3D ^ 0x30);
    }
    
    private static String lIIIlIIIlIlllIlI(String llllllllllllIlllIllIIIlIllIlIIII, final String llllllllllllIlllIllIIIlIllIIlllI) {
        llllllllllllIlllIllIIIlIllIlIIII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIllIIIlIllIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIIlIllIlIIll = new StringBuilder();
        final char[] llllllllllllIlllIllIIIlIllIlIIlI = llllllllllllIlllIllIIIlIllIIlllI.toCharArray();
        int llllllllllllIlllIllIIIlIllIlIIIl = GuiGameOver.llIIIlIIIlIlII[0];
        final String llllllllllllIlllIllIIIlIllIIlIII = (Object)((String)llllllllllllIlllIllIIIlIllIlIIII).toCharArray();
        final short llllllllllllIlllIllIIIlIllIIIllI = (short)llllllllllllIlllIllIIIlIllIIlIII.length;
        Exception llllllllllllIlllIllIIIlIllIIIlII = (Exception)GuiGameOver.llIIIlIIIlIlII[0];
        while (lIIIlIIIllIIlllI((int)llllllllllllIlllIllIIIlIllIIIlII, llllllllllllIlllIllIIIlIllIIIllI)) {
            final char llllllllllllIlllIllIIIlIllIlIllI = llllllllllllIlllIllIIIlIllIIlIII[llllllllllllIlllIllIIIlIllIIIlII];
            llllllllllllIlllIllIIIlIllIlIIll.append((char)(llllllllllllIlllIllIIIlIllIlIllI ^ llllllllllllIlllIllIIIlIllIlIIlI[llllllllllllIlllIllIIIlIllIlIIIl % llllllllllllIlllIllIIIlIllIlIIlI.length]));
            "".length();
            ++llllllllllllIlllIllIIIlIllIlIIIl;
            ++llllllllllllIlllIllIIIlIllIIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIIlIllIlIIll);
    }
}
