// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import java.io.IOException;
import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.network.NetHandlerPlayClient;

public class GuiDownloadTerrain extends GuiScreen
{
    private static final /* synthetic */ String[] lIlIIlllIlIIIl;
    private /* synthetic */ NetHandlerPlayClient netHandlerPlayClient;
    private static final /* synthetic */ int[] lIlIIlllIlIIlI;
    private /* synthetic */ int progress;
    
    private static boolean lllIlIIlIIllIII(final int lllllllllllllIIIlIlllllllIIllllI, final int lllllllllllllIIIlIlllllllIIlllIl) {
        return lllllllllllllIIIlIlllllllIIllllI < lllllllllllllIIIlIlllllllIIlllIl;
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
    }
    
    private static boolean lllIlIIlIIlIlll(final int lllllllllllllIIIlIlllllllIIllIll) {
        return lllllllllllllIIIlIlllllllIIllIll == 0;
    }
    
    private static String lllIlIIlIIlIlII(String lllllllllllllIIIlIlllllllIlIlIIl, final String lllllllllllllIIIlIlllllllIlIllIl) {
        lllllllllllllIIIlIlllllllIlIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlllllllIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlllllllIlIllII = new StringBuilder();
        final char[] lllllllllllllIIIlIlllllllIlIlIll = lllllllllllllIIIlIlllllllIlIllIl.toCharArray();
        int lllllllllllllIIIlIlllllllIlIlIlI = GuiDownloadTerrain.lIlIIlllIlIIlI[2];
        final Exception lllllllllllllIIIlIlllllllIlIIlII = (Object)lllllllllllllIIIlIlllllllIlIlIIl.toCharArray();
        final short lllllllllllllIIIlIlllllllIlIIIll = (short)lllllllllllllIIIlIlllllllIlIIlII.length;
        String lllllllllllllIIIlIlllllllIlIIIlI = (String)GuiDownloadTerrain.lIlIIlllIlIIlI[2];
        while (lllIlIIlIIllIII((int)lllllllllllllIIIlIlllllllIlIIIlI, lllllllllllllIIIlIlllllllIlIIIll)) {
            final char lllllllllllllIIIlIlllllllIlIllll = lllllllllllllIIIlIlllllllIlIIlII[lllllllllllllIIIlIlllllllIlIIIlI];
            lllllllllllllIIIlIlllllllIlIllII.append((char)(lllllllllllllIIIlIlllllllIlIllll ^ lllllllllllllIIIlIlllllllIlIlIll[lllllllllllllIIIlIlllllllIlIlIlI % lllllllllllllIIIlIlllllllIlIlIll.length]));
            "".length();
            ++lllllllllllllIIIlIlllllllIlIlIlI;
            ++lllllllllllllIIIlIlllllllIlIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlllllllIlIllII);
    }
    
    private static void lllIlIIlIIlIlIl() {
        (lIlIIlllIlIIIl = new String[GuiDownloadTerrain.lIlIIlllIlIIlI[0]])[GuiDownloadTerrain.lIlIIlllIlIIlI[2]] = lllIlIIlIIlIlII("BQAWOQgYGRs0BBpbHiIWBhkVLAUBGx0ZBBoHGyQP", "huzMa");
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIIlIlllllllIllllII, final int lllllllllllllIIIlIlllllllIlllIll, final float lllllllllllllIIIlIlllllllIlllllI) {
        this.drawBackground(GuiDownloadTerrain.lIlIIlllIlIIlI[2]);
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiDownloadTerrain.lIlIIlllIlIIIl[GuiDownloadTerrain.lIlIIlllIlIIlI[2]], new Object[GuiDownloadTerrain.lIlIIlllIlIIlI[2]]), this.width / GuiDownloadTerrain.lIlIIlllIlIIlI[3], this.height / GuiDownloadTerrain.lIlIIlllIlIIlI[3] - GuiDownloadTerrain.lIlIIlllIlIIlI[4], GuiDownloadTerrain.lIlIIlllIlIIlI[5]);
        super.drawScreen(lllllllllllllIIIlIlllllllIllllII, lllllllllllllIIIlIlllllllIlllIll, lllllllllllllIIIlIlllllllIlllllI);
    }
    
    private static void lllIlIIlIIlIllI() {
        (lIlIIlllIlIIlI = new int[6])[0] = " ".length();
        GuiDownloadTerrain.lIlIIlllIlIIlI[1] = (0xB4 ^ 0xA0);
        GuiDownloadTerrain.lIlIIlllIlIIlI[2] = ((0x3E ^ 0x6D) & ~(0x58 ^ 0xB));
        GuiDownloadTerrain.lIlIIlllIlIIlI[3] = "  ".length();
        GuiDownloadTerrain.lIlIIlllIlIIlI[4] = (121 + 51 - 133 + 93 ^ 46 + 19 - 52 + 169);
        GuiDownloadTerrain.lIlIIlllIlIIlI[5] = (-1 & 0xFFFFFF);
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIIIlIllllllllIIllIl, final int lllllllllllllIIIlIllllllllIIllII) throws IOException {
    }
    
    @Override
    public void updateScreen() {
        this.progress += GuiDownloadTerrain.lIlIIlllIlIIlI[0];
        if (lllIlIIlIIlIlll(this.progress % GuiDownloadTerrain.lIlIIlllIlIIlI[1])) {
            this.netHandlerPlayClient.addToSendQueue(new C00PacketKeepAlive());
        }
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return GuiDownloadTerrain.lIlIIlllIlIIlI[2] != 0;
    }
    
    public GuiDownloadTerrain(final NetHandlerPlayClient lllllllllllllIIIlIllllllllIlIIIl) {
        this.netHandlerPlayClient = lllllllllllllIIIlIllllllllIlIIIl;
    }
    
    static {
        lllIlIIlIIlIllI();
        lllIlIIlIIlIlIl();
    }
}
