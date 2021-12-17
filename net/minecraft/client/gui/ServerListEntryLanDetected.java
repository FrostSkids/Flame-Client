// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.LanServerDetector;

public class ServerListEntryLanDetected implements GuiListExtended.IGuiListEntry
{
    private static final /* synthetic */ int[] llIIlIlIllIlIl;
    protected final /* synthetic */ LanServerDetector.LanServer field_148291_b;
    private /* synthetic */ long field_148290_d;
    protected final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ String[] llIIlIlIllIlII;
    private final /* synthetic */ GuiMultiplayer field_148292_c;
    
    @Override
    public boolean mousePressed(final int llllllllllllIlllIIIllIIlIIIlIllI, final int llllllllllllIlllIIIllIIlIIIlIlIl, final int llllllllllllIlllIIIllIIlIIIlIlII, final int llllllllllllIlllIIIllIIlIIIlIIll, final int llllllllllllIlllIIIllIIlIIIlIIlI, final int llllllllllllIlllIIIllIIlIIIlIIIl) {
        this.field_148292_c.selectServer(llllllllllllIlllIIIllIIlIIIlIllI);
        if (lIIIllIlIlIIlIll(lIIIllIlIlIIlIlI(Minecraft.getSystemTime() - this.field_148290_d, 250L))) {
            this.field_148292_c.connectToSelected();
        }
        this.field_148290_d = Minecraft.getSystemTime();
        return ServerListEntryLanDetected.llIIlIlIllIlIl[0] != 0;
    }
    
    private static boolean lIIIllIlIlIIlIll(final int llllllllllllIlllIIIllIIIlllIIIIl) {
        return llllllllllllIlllIIIllIIIlllIIIIl < 0;
    }
    
    public LanServerDetector.LanServer getLanServer() {
        return this.field_148291_b;
    }
    
    private static boolean lIIIllIlIlIIllII(final int llllllllllllIlllIIIllIIIlllIIllI, final int llllllllllllIlllIIIllIIIlllIIlIl) {
        return llllllllllllIlllIIIllIIIlllIIllI < llllllllllllIlllIIIllIIIlllIIlIl;
    }
    
    static {
        lIIIllIlIlIIlIII();
        lIIIllIlIlIIIlll();
    }
    
    protected ServerListEntryLanDetected(final GuiMultiplayer llllllllllllIlllIIIllIIlIIlIllIl, final LanServerDetector.LanServer llllllllllllIlllIIIllIIlIIlIllII) {
        this.field_148290_d = 0L;
        this.field_148292_c = llllllllllllIlllIIIllIIlIIlIllIl;
        this.field_148291_b = llllllllllllIlllIIIllIIlIIlIllII;
        this.mc = Minecraft.getMinecraft();
    }
    
    @Override
    public void drawEntry(final int llllllllllllIlllIIIllIIlIIlIIlII, final int llllllllllllIlllIIIllIIlIIlIIIll, final int llllllllllllIlllIIIllIIlIIlIIIlI, final int llllllllllllIlllIIIllIIlIIlIIIIl, final int llllllllllllIlllIIIllIIlIIlIIIII, final int llllllllllllIlllIIIllIIlIIIlllll, final int llllllllllllIlllIIIllIIlIIIllllI, final boolean llllllllllllIlllIIIllIIlIIIlllIl) {
        this.mc.fontRendererObj.drawString(I18n.format(ServerListEntryLanDetected.llIIlIlIllIlII[ServerListEntryLanDetected.llIIlIlIllIlIl[0]], new Object[ServerListEntryLanDetected.llIIlIlIllIlIl[0]]), llllllllllllIlllIIIllIIlIIlIIIll + ServerListEntryLanDetected.llIIlIlIllIlIl[1] + ServerListEntryLanDetected.llIIlIlIllIlIl[2], llllllllllllIlllIIIllIIlIIlIIIlI + ServerListEntryLanDetected.llIIlIlIllIlIl[3], ServerListEntryLanDetected.llIIlIlIllIlIl[4]);
        "".length();
        this.mc.fontRendererObj.drawString(this.field_148291_b.getServerMotd(), llllllllllllIlllIIIllIIlIIlIIIll + ServerListEntryLanDetected.llIIlIlIllIlIl[1] + ServerListEntryLanDetected.llIIlIlIllIlIl[2], llllllllllllIlllIIIllIIlIIlIIIlI + ServerListEntryLanDetected.llIIlIlIllIlIl[5], ServerListEntryLanDetected.llIIlIlIllIlIl[6]);
        "".length();
        if (lIIIllIlIlIIlIIl(this.mc.gameSettings.hideServerAddress ? 1 : 0)) {
            this.mc.fontRendererObj.drawString(I18n.format(ServerListEntryLanDetected.llIIlIlIllIlII[ServerListEntryLanDetected.llIIlIlIllIlIl[3]], new Object[ServerListEntryLanDetected.llIIlIlIllIlIl[0]]), llllllllllllIlllIIIllIIlIIlIIIll + ServerListEntryLanDetected.llIIlIlIllIlIl[1] + ServerListEntryLanDetected.llIIlIlIllIlIl[2], llllllllllllIlllIIIllIIlIIlIIIlI + ServerListEntryLanDetected.llIIlIlIllIlIl[5] + ServerListEntryLanDetected.llIIlIlIllIlIl[7], ServerListEntryLanDetected.llIIlIlIllIlIl[8]);
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            this.mc.fontRendererObj.drawString(this.field_148291_b.getServerIpPort(), llllllllllllIlllIIIllIIlIIlIIIll + ServerListEntryLanDetected.llIIlIlIllIlIl[1] + ServerListEntryLanDetected.llIIlIlIllIlIl[2], llllllllllllIlllIIIllIIlIIlIIIlI + ServerListEntryLanDetected.llIIlIlIllIlIl[5] + ServerListEntryLanDetected.llIIlIlIllIlIl[7], ServerListEntryLanDetected.llIIlIlIllIlIl[8]);
            "".length();
        }
    }
    
    private static boolean lIIIllIlIlIIlIIl(final int llllllllllllIlllIIIllIIIlllIIIll) {
        return llllllllllllIlllIIIllIIIlllIIIll != 0;
    }
    
    private static String lIIIllIlIlIIIllI(String llllllllllllIlllIIIllIIIllllIIIl, final String llllllllllllIlllIIIllIIIllllIlIl) {
        llllllllllllIlllIIIllIIIllllIIIl = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIllIIIllllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIllIIIllllIlII = new StringBuilder();
        final char[] llllllllllllIlllIIIllIIIllllIIll = llllllllllllIlllIIIllIIIllllIlIl.toCharArray();
        int llllllllllllIlllIIIllIIIllllIIlI = ServerListEntryLanDetected.llIIlIlIllIlIl[0];
        final double llllllllllllIlllIIIllIIIlllIllII = (Object)((String)llllllllllllIlllIIIllIIIllllIIIl).toCharArray();
        final byte llllllllllllIlllIIIllIIIlllIlIll = (byte)llllllllllllIlllIIIllIIIlllIllII.length;
        boolean llllllllllllIlllIIIllIIIlllIlIlI = ServerListEntryLanDetected.llIIlIlIllIlIl[0] != 0;
        while (lIIIllIlIlIIllII(llllllllllllIlllIIIllIIIlllIlIlI ? 1 : 0, llllllllllllIlllIIIllIIIlllIlIll)) {
            final char llllllllllllIlllIIIllIIIllllIlll = llllllllllllIlllIIIllIIIlllIllII[llllllllllllIlllIIIllIIIlllIlIlI];
            llllllllllllIlllIIIllIIIllllIlII.append((char)(llllllllllllIlllIIIllIIIllllIlll ^ llllllllllllIlllIIIllIIIllllIIll[llllllllllllIlllIIIllIIIllllIIlI % llllllllllllIlllIIIllIIIllllIIll.length]));
            "".length();
            ++llllllllllllIlllIIIllIIIllllIIlI;
            ++llllllllllllIlllIIIllIIIlllIlIlI;
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIllIIIllllIlII);
    }
    
    private static void lIIIllIlIlIIlIII() {
        (llIIlIlIllIlIl = new int[10])[0] = ((0x2E ^ 0x6A) & ~(0xE2 ^ 0xA6));
        ServerListEntryLanDetected.llIIlIlIllIlIl[1] = (0x9B ^ 0x8F ^ (0xA0 ^ 0x94));
        ServerListEntryLanDetected.llIIlIlIllIlIl[2] = "   ".length();
        ServerListEntryLanDetected.llIIlIlIllIlIl[3] = " ".length();
        ServerListEntryLanDetected.llIIlIlIllIlIl[4] = (-" ".length() & (-1 & 0xFFFFFF));
        ServerListEntryLanDetected.llIIlIlIllIlIl[5] = (0xF8 ^ 0x8D ^ (0xD4 ^ 0xAD));
        ServerListEntryLanDetected.llIIlIlIllIlIl[6] = (0xFFFFA1A4 & 0x80DEDB);
        ServerListEntryLanDetected.llIIlIlIllIlIl[7] = (0x46 ^ 0x4D);
        ServerListEntryLanDetected.llIIlIlIllIlIl[8] = (0xFFFFF0B6 & 0x303F79);
        ServerListEntryLanDetected.llIIlIlIllIlIl[9] = "  ".length();
    }
    
    private static void lIIIllIlIlIIIlll() {
        (llIIlIlIllIlII = new String[ServerListEntryLanDetected.llIIlIlIllIlIl[9]])[ServerListEntryLanDetected.llIIlIlIllIlIl[0]] = lIIIllIlIlIIIllI("BDQYFwMaIxM2SBw8AigD", "hUvDf");
        ServerListEntryLanDetected.llIIlIlIllIlII[ServerListEntryLanDetected.llIIlIlIllIlIl[3]] = lIIIllIlIlIIIllI("GQM7FC8eNTIDOg8UeRklDgIyHw0OAiUUPxk=", "jfWqL");
    }
    
    @Override
    public void mouseReleased(final int llllllllllllIlllIIIllIIlIIIIlIIl, final int llllllllllllIlllIIIllIIlIIIIlIII, final int llllllllllllIlllIIIllIIlIIIIIlll, final int llllllllllllIlllIIIllIIlIIIIIllI, final int llllllllllllIlllIIIllIIlIIIIIlIl, final int llllllllllllIlllIIIllIIlIIIIIlII) {
    }
    
    private static int lIIIllIlIlIIlIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void setSelected(final int llllllllllllIlllIIIllIIlIIIIllIl, final int llllllllllllIlllIIIllIIlIIIIllII, final int llllllllllllIlllIIIllIIlIIIIlIll) {
    }
}
