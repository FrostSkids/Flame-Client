// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.IProgressUpdate;

public class GuiScreenWorking extends GuiScreen implements IProgressUpdate
{
    private static final /* synthetic */ String[] lIllllIIIIlIlI;
    private /* synthetic */ int progress;
    private static final /* synthetic */ int[] lIllllIIllIIII;
    private /* synthetic */ String field_146591_a;
    private /* synthetic */ boolean doneWorking;
    private /* synthetic */ String field_146589_f;
    
    @Override
    public void setLoadingProgress(final int llllllllllllIllllIlIlIlIllIlIlIl) {
        this.progress = llllllllllllIllllIlIlIlIllIlIlIl;
    }
    
    @Override
    public void displayLoadingString(final String llllllllllllIllllIlIlIlIllIllIll) {
        this.field_146589_f = llllllllllllIllllIlIlIlIllIllIll;
        this.setLoadingProgress(GuiScreenWorking.lIllllIIllIIII[0]);
    }
    
    private static void lIIIIIllllIIIIll() {
        (lIllllIIIIlIlI = new String[GuiScreenWorking.lIllllIIllIIII[8]])[GuiScreenWorking.lIllllIIllIIII[0]] = lIIIIIllllIIIIII("", "MAulj");
        GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[1]] = lIIIIIllllIIIIIl("T1AWSTFdCJQ=", "GaQKv");
        GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[2]] = lIIIIIllllIIIIlI("DgqRLVX1V6SbFhFVn4GbUw==", "exbEe");
        GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[5]] = lIIIIIllllIIIIII("Tw==", "oOJSu");
        GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[6]] = lIIIIIllllIIIIIl("RpnFudlfHC4=", "hYCun");
    }
    
    @Override
    public void resetProgressAndMessage(final String llllllllllllIllllIlIlIlIlllIIIll) {
        this.field_146591_a = llllllllllllIllllIlIlIlIlllIIIll;
        this.displayLoadingString(GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[2]]);
    }
    
    private static String lIIIIIllllIIIIII(String llllllllllllIllllIlIlIlIIllIllll, final String llllllllllllIllllIlIlIlIIlllIIll) {
        llllllllllllIllllIlIlIlIIllIllll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIlIlIIllIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIlIlIIlllIIlI = new StringBuilder();
        final char[] llllllllllllIllllIlIlIlIIlllIIIl = llllllllllllIllllIlIlIlIIlllIIll.toCharArray();
        int llllllllllllIllllIlIlIlIIlllIIII = GuiScreenWorking.lIllllIIllIIII[0];
        final Exception llllllllllllIllllIlIlIlIIllIlIlI = (Object)((String)llllllllllllIllllIlIlIlIIllIllll).toCharArray();
        final char llllllllllllIllllIlIlIlIIllIlIIl = (char)llllllllllllIllllIlIlIlIIllIlIlI.length;
        short llllllllllllIllllIlIlIlIIllIlIII = (short)GuiScreenWorking.lIllllIIllIIII[0];
        while (lIIIIlIIIIllIIII(llllllllllllIllllIlIlIlIIllIlIII, llllllllllllIllllIlIlIlIIllIlIIl)) {
            final char llllllllllllIllllIlIlIlIIlllIlIl = llllllllllllIllllIlIlIlIIllIlIlI[llllllllllllIllllIlIlIlIIllIlIII];
            llllllllllllIllllIlIlIlIIlllIIlI.append((char)(llllllllllllIllllIlIlIlIIlllIlIl ^ llllllllllllIllllIlIlIlIIlllIIIl[llllllllllllIllllIlIlIlIIlllIIII % llllllllllllIllllIlIlIlIIlllIIIl.length]));
            "".length();
            ++llllllllllllIllllIlIlIlIIlllIIII;
            ++llllllllllllIllllIlIlIlIIllIlIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIlIlIIlllIIlI);
    }
    
    private static boolean lIIIIlIIIIlIlllI(final int llllllllllllIllllIlIlIlIIllIIIIl) {
        return llllllllllllIllllIlIlIlIIllIIIIl != 0;
    }
    
    private static void lIIIIlIIIIlIllIl() {
        (lIllllIIllIIII = new int[10])[0] = ((20 + 7 + 96 + 101 ^ 65 + 110 - 171 + 183) & (0x9 ^ 0x7 ^ (0xF8 ^ 0xAD) ^ -" ".length()));
        GuiScreenWorking.lIllllIIllIIII[1] = " ".length();
        GuiScreenWorking.lIllllIIllIIII[2] = "  ".length();
        GuiScreenWorking.lIllllIIllIIII[3] = (40 + 13 + 1 + 73 ^ (0xB6 ^ 0x8F));
        GuiScreenWorking.lIllllIIllIIII[4] = (-1 & 0xFFFFFF);
        GuiScreenWorking.lIllllIIllIIII[5] = "   ".length();
        GuiScreenWorking.lIllllIIllIIII[6] = (0x6D ^ 0x7E ^ (0xA3 ^ 0xB4));
        GuiScreenWorking.lIllllIIllIIII[7] = (0x1F ^ 0x45);
        GuiScreenWorking.lIllllIIllIIII[8] = (0x14 ^ 0x11);
        GuiScreenWorking.lIllllIIllIIII[9] = (0xC4 ^ 0xBC ^ (0x5F ^ 0x2F));
    }
    
    public GuiScreenWorking() {
        this.field_146591_a = GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[0]];
        this.field_146589_f = GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[1]];
    }
    
    @Override
    public void setDoneWorking() {
        this.doneWorking = (GuiScreenWorking.lIllllIIllIIII[1] != 0);
    }
    
    static {
        lIIIIlIIIIlIllIl();
        lIIIIIllllIIIIll();
    }
    
    private static String lIIIIIllllIIIIlI(final String llllllllllllIllllIlIlIlIlIIIIIlI, final String llllllllllllIllllIlIlIlIlIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIlIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIlIlIlIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIlIlIlIIIIllI.init(GuiScreenWorking.lIllllIIllIIII[2], llllllllllllIllllIlIlIlIlIIIIlll);
            return new String(llllllllllllIllllIlIlIlIlIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIlIlIIIIlIl) {
            llllllllllllIllllIlIlIlIlIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void displaySavingString(final String llllllllllllIllllIlIlIlIllllIIll) {
        this.resetProgressAndMessage(llllllllllllIllllIlIlIlIllllIIll);
    }
    
    private static boolean lIIIIlIIIIlIllll(final int llllllllllllIllllIlIlIlIIlIlllll) {
        return llllllllllllIllllIlIlIlIIlIlllll == 0;
    }
    
    private static boolean lIIIIlIIIIllIIII(final int llllllllllllIllllIlIlIlIIllIIlII, final int llllllllllllIllllIlIlIlIIllIIIll) {
        return llllllllllllIllllIlIlIlIIllIIlII < llllllllllllIllllIlIlIlIIllIIIll;
    }
    
    private static String lIIIIIllllIIIIIl(final String llllllllllllIllllIlIlIlIlIIlIlll, final String llllllllllllIllllIlIlIlIlIIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIlIlIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlIlIlIIllIIl.getBytes(StandardCharsets.UTF_8)), GuiScreenWorking.lIllllIIllIIII[9]), "DES");
            final Cipher llllllllllllIllllIlIlIlIlIIllllI = Cipher.getInstance("DES");
            llllllllllllIllllIlIlIlIlIIllllI.init(GuiScreenWorking.lIllllIIllIIII[2], llllllllllllIllllIlIlIlIlIlIIIII);
            return new String(llllllllllllIllllIlIlIlIlIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlIlIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIlIlIIlllII) {
            llllllllllllIllllIlIlIlIlIIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllllIlIlIlIlIllIlII, final int llllllllllllIllllIlIlIlIlIllIIlI, final float llllllllllllIllllIlIlIlIlIlIllII) {
        if (lIIIIlIIIIlIlllI(this.doneWorking ? 1 : 0)) {
            if (lIIIIlIIIIlIllll(this.mc.func_181540_al() ? 1 : 0)) {
                this.mc.displayGuiScreen(null);
                "".length();
                if (((0x9C ^ 0xA4 ^ (0x68 ^ 0x55)) & (0x6F ^ 0x62 ^ (0x9D ^ 0x95) ^ -" ".length())) < 0) {
                    return;
                }
            }
        }
        else {
            this.drawDefaultBackground();
            this.drawCenteredString(this.fontRendererObj, this.field_146591_a, this.width / GuiScreenWorking.lIllllIIllIIII[2], GuiScreenWorking.lIllllIIllIIII[3], GuiScreenWorking.lIllllIIllIIII[4]);
            this.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(String.valueOf(this.field_146589_f)).append(GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[5]]).append(this.progress).append(GuiScreenWorking.lIllllIIIIlIlI[GuiScreenWorking.lIllllIIllIIII[6]])), this.width / GuiScreenWorking.lIllllIIllIIII[2], GuiScreenWorking.lIllllIIllIIII[7], GuiScreenWorking.lIllllIIllIIII[4]);
            super.drawScreen(llllllllllllIllllIlIlIlIlIllIlII, llllllllllllIllllIlIlIlIlIllIIlI, llllllllllllIllllIlIlIlIlIlIllII);
        }
    }
}
