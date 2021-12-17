// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.Minecraft;

public class ServerListEntryLanScan implements GuiListExtended.IGuiListEntry
{
    private final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ int[] llIIIIlllllIlI;
    private static final /* synthetic */ String[] llIIIIllllIllI;
    
    @Override
    public void setSelected(final int llllllllllllIlllIllIIllIIIlIlIII, final int llllllllllllIlllIllIIllIIIlIIlll, final int llllllllllllIlllIllIIllIIIlIIllI) {
    }
    
    private static void lIIIlIIIlIIIIIll() {
        (llIIIIllllIllI = new String[ServerListEntryLanScan.llIIIIlllllIlI[7]])[ServerListEntryLanScan.llIIIIlllllIlI[1]] = lIIIlIIIIllllllI("PSk/MgEjPjQTSiIrMA8KOCY2", "QHQad");
        ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[2]] = lIIIlIIIIllllllI("LTkEPi4zLg8fZTI7CwMlKDYN", "AXjmK");
        ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[0]] = lIIIlIIIIllllllI("LG8eSAI=", "cOqhm");
        ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[4]] = lIIIlIIIIllllllI("GXoDejw=", "vZLZS");
        ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[5]] = lIIIlIIIIlllllll("dxaOH26rs3Y=", "MWlHq");
    }
    
    static {
        lIIIlIIIlIIIlIlI();
        lIIIlIIIlIIIIIll();
    }
    
    private static String lIIIlIIIIllllllI(String llllllllllllIlllIllIIllIIIIIlIII, final String llllllllllllIlllIllIIllIIIIIIlll) {
        llllllllllllIlllIllIIllIIIIIlIII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIllIIllIIIIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIllIIIIIlIll = new StringBuilder();
        final char[] llllllllllllIlllIllIIllIIIIIlIlI = llllllllllllIlllIllIIllIIIIIIlll.toCharArray();
        int llllllllllllIlllIllIIllIIIIIlIIl = ServerListEntryLanScan.llIIIIlllllIlI[1];
        final double llllllllllllIlllIllIIllIIIIIIIll = (Object)((String)llllllllllllIlllIllIIllIIIIIlIII).toCharArray();
        final long llllllllllllIlllIllIIllIIIIIIIlI = llllllllllllIlllIllIIllIIIIIIIll.length;
        float llllllllllllIlllIllIIllIIIIIIIIl = ServerListEntryLanScan.llIIIIlllllIlI[1];
        while (lIIIlIIIlIIIlIll((int)llllllllllllIlllIllIIllIIIIIIIIl, (int)llllllllllllIlllIllIIllIIIIIIIlI)) {
            final char llllllllllllIlllIllIIllIIIIIlllI = llllllllllllIlllIllIIllIIIIIIIll[llllllllllllIlllIllIIllIIIIIIIIl];
            llllllllllllIlllIllIIllIIIIIlIll.append((char)(llllllllllllIlllIllIIllIIIIIlllI ^ llllllllllllIlllIllIIllIIIIIlIlI[llllllllllllIlllIllIIllIIIIIlIIl % llllllllllllIlllIllIIllIIIIIlIlI.length]));
            "".length();
            ++llllllllllllIlllIllIIllIIIIIlIIl;
            ++llllllllllllIlllIllIIllIIIIIIIIl;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIllIIIIIlIll);
    }
    
    private static void lIIIlIIIlIIIlIlI() {
        (llIIIIlllllIlI = new int[9])[0] = "  ".length();
        ServerListEntryLanScan.llIIIIlllllIlI[1] = ((154 + 144 - 294 + 236 ^ 90 + 174 - 148 + 59) & (17 + 154 - 80 + 108 ^ 49 + 128 - 87 + 62 ^ -" ".length()));
        ServerListEntryLanScan.llIIIIlllllIlI[2] = " ".length();
        ServerListEntryLanScan.llIIIIlllllIlI[3] = (-" ".length() & (-1 & 0xFFFFFF));
        ServerListEntryLanScan.llIIIIlllllIlI[4] = "   ".length();
        ServerListEntryLanScan.llIIIIlllllIlI[5] = (0x6C ^ 0x79 ^ (0x19 ^ 0x8));
        ServerListEntryLanScan.llIIIIlllllIlI[6] = (-(0xFFFF9B43 & 0x7FBD) & (0xFFFFDFDE & 0x80BBA1));
        ServerListEntryLanScan.llIIIIlllllIlI[7] = (0xC5 ^ 0xC0);
        ServerListEntryLanScan.llIIIIlllllIlI[8] = (0xC ^ 0x6E ^ (0xC1 ^ 0xAB));
    }
    
    public ServerListEntryLanScan() {
        this.mc = Minecraft.getMinecraft();
    }
    
    @Override
    public boolean mousePressed(final int llllllllllllIlllIllIIllIIIlIIlII, final int llllllllllllIlllIllIIllIIIlIIIll, final int llllllllllllIlllIllIIllIIIlIIIlI, final int llllllllllllIlllIllIIllIIIlIIIIl, final int llllllllllllIlllIllIIllIIIlIIIII, final int llllllllllllIlllIllIIllIIIIlllll) {
        return ServerListEntryLanScan.llIIIIlllllIlI[1] != 0;
    }
    
    @Override
    public void drawEntry(final int llllllllllllIlllIllIIllIIIlllIlI, final int llllllllllllIlllIllIIllIIIlllIIl, final int llllllllllllIlllIllIIllIIIlllIII, final int llllllllllllIlllIllIIllIIIllIlll, final int llllllllllllIlllIllIIllIIIllIllI, final int llllllllllllIlllIllIIllIIIllIlIl, final int llllllllllllIlllIllIIllIIIllIlII, final boolean llllllllllllIlllIllIIllIIIllIIll) {
        final int llllllllllllIlllIllIIllIIIllIIlI = llllllllllllIlllIllIIllIIIlllIII + llllllllllllIlllIllIIllIIIllIllI / ServerListEntryLanScan.llIIIIlllllIlI[0] - this.mc.fontRendererObj.FONT_HEIGHT / ServerListEntryLanScan.llIIIIlllllIlI[0];
        this.mc.fontRendererObj.drawString(I18n.format(ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[1]], new Object[ServerListEntryLanScan.llIIIIlllllIlI[1]]), this.mc.currentScreen.width / ServerListEntryLanScan.llIIIIlllllIlI[0] - this.mc.fontRendererObj.getStringWidth(I18n.format(ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[2]], new Object[ServerListEntryLanScan.llIIIIlllllIlI[1]])) / ServerListEntryLanScan.llIIIIlllllIlI[0], llllllllllllIlllIllIIllIIIllIIlI, ServerListEntryLanScan.llIIIIlllllIlI[3]);
        "".length();
        final String llllllllllllIlllIllIIllIIIlIllll;
        switch ((int)(Minecraft.getSystemTime() / 300L % 4L)) {
            default: {
                final String llllllllllllIlllIllIIllIIIllIIIl = ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[0]];
                "".length();
                if (" ".length() < -" ".length()) {
                    return;
                }
                break;
            }
            case 1:
            case 3: {
                final String llllllllllllIlllIllIIllIIIllIIII = ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[4]];
                "".length();
                if ("  ".length() < " ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIlllIllIIllIIIlIllll = ServerListEntryLanScan.llIIIIllllIllI[ServerListEntryLanScan.llIIIIlllllIlI[5]];
                break;
            }
        }
        this.mc.fontRendererObj.drawString(llllllllllllIlllIllIIllIIIlIllll, this.mc.currentScreen.width / ServerListEntryLanScan.llIIIIlllllIlI[0] - this.mc.fontRendererObj.getStringWidth(llllllllllllIlllIllIIllIIIlIllll) / ServerListEntryLanScan.llIIIIlllllIlI[0], llllllllllllIlllIllIIllIIIllIIlI + this.mc.fontRendererObj.FONT_HEIGHT, ServerListEntryLanScan.llIIIIlllllIlI[6]);
        "".length();
    }
    
    private static String lIIIlIIIIlllllll(final String llllllllllllIlllIllIIlIllllllIII, final String llllllllllllIlllIllIIlIlllllIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIllllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIlllllIlll.getBytes(StandardCharsets.UTF_8)), ServerListEntryLanScan.llIIIIlllllIlI[8]), "DES");
            final Cipher llllllllllllIlllIllIIlIllllllIlI = Cipher.getInstance("DES");
            llllllllllllIlllIllIIlIllllllIlI.init(ServerListEntryLanScan.llIIIIlllllIlI[0], llllllllllllIlllIllIIlIllllllIll);
            return new String(llllllllllllIlllIllIIlIllllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIllllllIIl) {
            llllllllllllIlllIllIIlIllllllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void mouseReleased(final int llllllllllllIlllIllIIllIIIIlllIl, final int llllllllllllIlllIllIIllIIIIlllII, final int llllllllllllIlllIllIIllIIIIllIll, final int llllllllllllIlllIllIIllIIIIllIlI, final int llllllllllllIlllIllIIllIIIIllIIl, final int llllllllllllIlllIllIIllIIIIllIII) {
    }
    
    private static boolean lIIIlIIIlIIIlIll(final int llllllllllllIlllIllIIlIlllllIIII, final int llllllllllllIlllIllIIlIllllIllll) {
        return llllllllllllIlllIllIIlIlllllIIII < llllllllllllIlllIllIIlIllllIllll;
    }
}
