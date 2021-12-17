// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import client.ui.MainMenu;
import net.minecraft.client.resources.I18n;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;

public class GuiMemoryErrorScreen extends GuiScreen
{
    private static final /* synthetic */ String[] lIIlIIIIlIllII;
    private static final /* synthetic */ int[] lIIlIIIIlIlllI;
    
    @Override
    protected void keyTyped(final char lllllllllllllIIlllIllIlIIllIllIl, final int lllllllllllllIIlllIllIlIIllIllII) throws IOException {
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIlllIllIlIIllIIllI, final int lllllllllllllIIlllIllIlIIllIIlIl, final float lllllllllllllIIlllIllIlIIllIIlII) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[1]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[9], GuiMemoryErrorScreen.lIIlIIIIlIlllI[10]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[11]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[0], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[3]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[14], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[15]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[16], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[17]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[18], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[19]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[20], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[21]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[22], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[23]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[24], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        this.drawString(this.fontRendererObj, GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[25]], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[12], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[26], GuiMemoryErrorScreen.lIIlIIIIlIlllI[13]);
        super.drawScreen(lllllllllllllIIlllIllIlIIllIIllI, lllllllllllllIIlllIllIlIIllIIlIl, lllllllllllllIIlllIllIlIIllIIlII);
    }
    
    private static String llIIlIIllIllIIl(final String lllllllllllllIIlllIllIlIIlIllIII, final String lllllllllllllIIlllIllIlIIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIlIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIlIIlIlIlll.getBytes(StandardCharsets.UTF_8)), GuiMemoryErrorScreen.lIIlIIIIlIlllI[21]), "DES");
            final Cipher lllllllllllllIIlllIllIlIIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllIIlllIllIlIIlIllIlI.init(GuiMemoryErrorScreen.lIIlIIIIlIlllI[1], lllllllllllllIIlllIllIlIIlIllIll);
            return new String(lllllllllllllIIlllIllIlIIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIlIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIlIIlIllIIl) {
            lllllllllllllIIlllIllIlIIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        this.buttonList.add(new GuiOptionButton(GuiMemoryErrorScreen.lIIlIIIIlIlllI[0], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[2], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[4] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[5], I18n.format(GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[0]], new Object[GuiMemoryErrorScreen.lIIlIIIIlIlllI[0]])));
        "".length();
        this.buttonList.add(new GuiOptionButton(GuiMemoryErrorScreen.lIIlIIIIlIlllI[6], this.width / GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] - GuiMemoryErrorScreen.lIIlIIIIlIlllI[2] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[7], this.height / GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[4] + GuiMemoryErrorScreen.lIIlIIIIlIlllI[5], I18n.format(GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[6]], new Object[GuiMemoryErrorScreen.lIIlIIIIlIlllI[0]])));
        "".length();
    }
    
    private static void llIIlIIllIlllIl() {
        (lIIlIIIIlIllII = new String[GuiMemoryErrorScreen.lIIlIIIIlIlllI[27]])[GuiMemoryErrorScreen.lIIlIIIIlIlllI[0]] = llIIlIIllIlIlll("MTYvawM5Fy8xGzM=", "VCFEw");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[6]] = llIIlIIllIlIlll("Dwk8D3YTGTsO", "blRzX");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[1]] = llIIlIIllIllIII("6DHzqtw2/vC1iGem55Srcw==", "EwqTW");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[11]] = llIIlIIllIllIIl("RPzM4gR/8snMKMSVqloQzElkFYQfuCZwHagNJB+p/Ltjvkw+iRA0Bg==", "NOKcg");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[3]] = llIIlIIllIlIlll("OAcnA0QPADscAEwNK1AHDRo9FQBMDTdQBUwNOxdEBQFuBAwJTykRCQlPIQJEDhZuBAwJ", "loNpd");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[15]] = llIIlIIllIlIlll("Cw8aFnkXBx4DLCACTDo4IgYFGTxhAAMDeSMLBRk+YQ8AGzYiDxgSPWELAhgsJgY=", "AnlwY");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[17]] = llIIlIIllIlIlll("GwgPKgIPQw==", "vmbEp");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[19]] = llIIlIIllIlIlll("ER1DIzEgBAY9N2UeBiUmKVIAPDE3BxMnKiocT3M3LRdDMDY3AAY9N2UVAj4mZRoCIGM0BwonbQ==", "ErcSC");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[21]] = llIIlIIllIllIII("x7/QsCn4l9w8jU0aMASvWZqYMmrg1I4/uWjnmqWrWgEit1f7ObrqObbkgZZFpb8U+99vHG40ulXTpgOjrg70EQ==", "QCjSJ");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[23]] = llIIlIIllIllIIl("3+MOy0hyQXGkRA23zrjwf3K6EGJZ7JE3nDgLkFrpTDvNhpoq6b6al1IIBzM5UcHNc5vJ/msRwD2YEb+NPgooJQWp8du/rt5L", "NKfGR");
        GuiMemoryErrorScreen.lIIlIIIIlIllII[GuiMemoryErrorScreen.lIIlIIIIlIlllI[25]] = llIIlIIllIllIII("TqXiBGDyz3oNFJIc2YpESf+54M/wsTbGmNSdFjpcaH5eAO/+EtOxCPR19vjOKSsB3cs6W/N5v7c=", "RTkCn");
    }
    
    private static boolean llIIlIIlllIIIIl(final int lllllllllllllIIlllIllIlIIIlIIlll, final int lllllllllllllIIlllIllIlIIIlIIllI) {
        return lllllllllllllIIlllIllIlIIIlIIlll < lllllllllllllIIlllIllIlIIIlIIllI;
    }
    
    static {
        llIIlIIllIllllI();
        llIIlIIllIlllIl();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIlllIllIlIIllIllll) throws IOException {
        if (llIIlIIllIlllll(lllllllllllllIIlllIllIlIIllIllll.id)) {
            this.mc.displayGuiScreen(new MainMenu());
            "".length();
            if (((0x16 ^ 0x53) & ~(0x6E ^ 0x2B)) < 0) {
                return;
            }
        }
        else if (llIIlIIlllIIIII(lllllllllllllIIlllIllIlIIllIllll.id, GuiMemoryErrorScreen.lIIlIIIIlIlllI[6])) {
            this.mc.shutdown();
        }
    }
    
    private static boolean llIIlIIllIlllll(final int lllllllllllllIIlllIllIlIIIlIIlII) {
        return lllllllllllllIIlllIllIlIIIlIIlII == 0;
    }
    
    private static boolean llIIlIIlllIIIII(final int lllllllllllllIIlllIllIlIIIlIlIll, final int lllllllllllllIIlllIllIlIIIlIlIlI) {
        return lllllllllllllIIlllIllIlIIIlIlIll == lllllllllllllIIlllIllIlIIIlIlIlI;
    }
    
    private static void llIIlIIllIllllI() {
        (lIIlIIIIlIlllI = new int[28])[0] = ((0xB ^ 0x48 ^ (0x31 ^ 0x2E)) & (0xBB ^ 0xA2 ^ (0x6A ^ 0x2F) ^ -" ".length()));
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[1] = "  ".length();
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[2] = (0x6F ^ 0x53) + (58 + 113 - 104 + 74) - (0xA ^ 0x71) + (0x5E ^ 0x13);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[3] = (0x88 ^ 0x8C);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[4] = (0x3 ^ 0x15 ^ (0x29 ^ 0x47));
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[5] = (123 + 142 - 157 + 44 ^ 13 + 6 + 104 + 25);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[6] = " ".length();
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[7] = 113 + 70 - 37 + 14;
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[8] = (0x8 ^ 0x34);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[9] = (90 + 49 - 102 + 92 ^ 73 + 133 - 96 + 39);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[10] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[11] = "   ".length();
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[12] = 12 + 4 + 71 + 53;
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[13] = (0xFFFFA0FD & 0xA0FFA2);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[14] = (0x3 ^ 0x11);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[15] = (0x85 ^ 0xA2 ^ (0x23 ^ 0x1));
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[16] = (0x5B ^ 0x7C ^ (0x44 ^ 0x78));
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[17] = (0x28 ^ 0x2E);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[18] = (0x99 ^ 0xAC ^ (0x6C ^ 0x7D));
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[19] = (0xA4 ^ 0xA3);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[20] = (0x54 ^ 0x62);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[21] = (0xC8 ^ 0xC0);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[22] = (0x1D ^ 0x22);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[23] = (0x2 ^ 0xB);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[24] = (0xC9 ^ 0xAF ^ (0x2E ^ 0x0));
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[25] = (167 + 159 - 193 + 42 ^ 107 + 96 - 106 + 68);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[26] = (0xD9 ^ 0x88);
        GuiMemoryErrorScreen.lIIlIIIIlIlllI[27] = (0x4 ^ 0xF);
    }
    
    private static String llIIlIIllIllIII(final String lllllllllllllIIlllIllIlIIIllIIll, final String lllllllllllllIIlllIllIlIIIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIlIIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIllIlIIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIllIlIIIllIlIl.init(GuiMemoryErrorScreen.lIIlIIIIlIlllI[1], lllllllllllllIIlllIllIlIIIllIllI);
            return new String(lllllllllllllIIlllIllIlIIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIlIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIlIIIllIlII) {
            lllllllllllllIIlllIllIlIIIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIIllIlIlll(String lllllllllllllIIlllIllIlIIlIIIIll, final String lllllllllllllIIlllIllIlIIlIIIlll) {
        lllllllllllllIIlllIllIlIIlIIIIll = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIllIlIIlIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIllIlIIlIIIllI = new StringBuilder();
        final char[] lllllllllllllIIlllIllIlIIlIIIlIl = lllllllllllllIIlllIllIlIIlIIIlll.toCharArray();
        int lllllllllllllIIlllIllIlIIlIIIlII = GuiMemoryErrorScreen.lIIlIIIIlIlllI[0];
        final long lllllllllllllIIlllIllIlIIIlllllI = (Object)((String)lllllllllllllIIlllIllIlIIlIIIIll).toCharArray();
        final Exception lllllllllllllIIlllIllIlIIIllllIl = (Exception)lllllllllllllIIlllIllIlIIIlllllI.length;
        double lllllllllllllIIlllIllIlIIIllllII = GuiMemoryErrorScreen.lIIlIIIIlIlllI[0];
        while (llIIlIIlllIIIIl((int)lllllllllllllIIlllIllIlIIIllllII, (int)lllllllllllllIIlllIllIlIIIllllIl)) {
            final char lllllllllllllIIlllIllIlIIlIIlIIl = lllllllllllllIIlllIllIlIIIlllllI[lllllllllllllIIlllIllIlIIIllllII];
            lllllllllllllIIlllIllIlIIlIIIllI.append((char)(lllllllllllllIIlllIllIlIIlIIlIIl ^ lllllllllllllIIlllIllIlIIlIIIlIl[lllllllllllllIIlllIllIlIIlIIIlII % lllllllllllllIIlllIllIlIIlIIIlIl.length]));
            "".length();
            ++lllllllllllllIIlllIllIlIIlIIIlII;
            ++lllllllllllllIIlllIllIlIIIllllII;
            "".length();
            if (((0x0 ^ 0x3E) & ~(0x5C ^ 0x62)) != ((0x9 ^ 0x20) & ~(0xE8 ^ 0xC1))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIllIlIIlIIIllI);
    }
}
