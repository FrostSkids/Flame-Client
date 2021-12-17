// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.stream;

import net.minecraft.client.stream.IngestServerTester;
import tv.twitch.broadcast.IngestServer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.Minecraft;
import java.util.Arrays;
import net.minecraft.client.gui.GuiSlot;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.gui.GuiScreen;

public class GuiIngestServers extends GuiScreen
{
    private /* synthetic */ String field_152310_f;
    private static final /* synthetic */ String[] lIIIllIlIlIlII;
    private /* synthetic */ ServerList field_152311_g;
    private static final /* synthetic */ int[] lIIIllIlIlIllI;
    private final /* synthetic */ GuiScreen field_152309_a;
    
    private static void llIIIlIIlIIlIlI() {
        (lIIIllIlIlIllI = new int[12])[0] = ((0 + 99 + 67 + 1 ^ 83 + 42 - 23 + 75) & (0xA ^ 0x43 ^ (0xFB ^ 0xA4) ^ -" ".length()));
        GuiIngestServers.lIIIllIlIlIllI[1] = " ".length();
        GuiIngestServers.lIIIllIlIlIllI[2] = "  ".length();
        GuiIngestServers.lIIIllIlIlIllI[3] = 3 + 32 + 10 + 110;
        GuiIngestServers.lIIIllIlIlIllI[4] = (0x12 ^ 0x37 ^ (0x22 ^ 0x1F));
        GuiIngestServers.lIIIllIlIlIllI[5] = (0x9E ^ 0x98);
        GuiIngestServers.lIIIllIlIlIllI[6] = 146 + 50 - 97 + 51;
        GuiIngestServers.lIIIllIlIlIllI[7] = (0xBA ^ 0xAE);
        GuiIngestServers.lIIIllIlIlIllI[8] = (0x4A ^ 0x78 ^ (0x65 ^ 0x52));
        GuiIngestServers.lIIIllIlIlIllI[9] = "   ".length();
        GuiIngestServers.lIIIllIlIlIllI[10] = (-1 & 0xFFFFFF);
        GuiIngestServers.lIIIllIlIlIllI[11] = (0x33 ^ 0x5C ^ (0x6E ^ 0x5));
    }
    
    private static boolean llIIIlIIlIIlllI(final int lllllllllllllIlIIIIIIIIlIIlIlIIl, final int lllllllllllllIlIIIIIIIIlIIlIlIII) {
        return lllllllllllllIlIIIIIIIIlIIlIlIIl < lllllllllllllIlIIIIIIIIlIIlIlIII;
    }
    
    private static boolean llIIIlIIlIIlIll(final int lllllllllllllIlIIIIIIIIlIIlIIlII) {
        return lllllllllllllIlIIIIIIIIlIIlIIlII == 0;
    }
    
    @Override
    public void onGuiClosed() {
        if (llIIIlIIlIIllII(this.mc.getTwitchStream().func_152908_z() ? 1 : 0)) {
            this.mc.getTwitchStream().func_152932_y().func_153039_l();
        }
    }
    
    @Override
    public void initGui() {
        this.field_152310_f = I18n.format(GuiIngestServers.lIIIllIlIlIlII[GuiIngestServers.lIIIllIlIlIllI[0]], new Object[GuiIngestServers.lIIIllIlIlIllI[0]]);
        this.field_152311_g = new ServerList(this.mc);
        if (llIIIlIIlIIlIll(this.mc.getTwitchStream().func_152908_z() ? 1 : 0)) {
            this.mc.getTwitchStream().func_152909_x();
        }
        this.buttonList.add(new GuiButton(GuiIngestServers.lIIIllIlIlIllI[1], this.width / GuiIngestServers.lIIIllIlIlIllI[2] - GuiIngestServers.lIIIllIlIlIllI[3], this.height - GuiIngestServers.lIIIllIlIlIllI[4] - GuiIngestServers.lIIIllIlIlIllI[5], GuiIngestServers.lIIIllIlIlIllI[6], GuiIngestServers.lIIIllIlIlIllI[7], I18n.format(GuiIngestServers.lIIIllIlIlIlII[GuiIngestServers.lIIIllIlIlIllI[1]], new Object[GuiIngestServers.lIIIllIlIlIllI[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiIngestServers.lIIIllIlIlIllI[2], this.width / GuiIngestServers.lIIIllIlIlIllI[2] + GuiIngestServers.lIIIllIlIlIllI[8], this.height - GuiIngestServers.lIIIllIlIlIllI[4] - GuiIngestServers.lIIIllIlIlIllI[5], GuiIngestServers.lIIIllIlIlIllI[6], GuiIngestServers.lIIIllIlIlIllI[7], I18n.format(GuiIngestServers.lIIIllIlIlIlII[GuiIngestServers.lIIIllIlIlIllI[2]], new Object[GuiIngestServers.lIIIllIlIlIllI[0]])));
        "".length();
    }
    
    public GuiIngestServers(final GuiScreen lllllllllllllIlIIIIIIIIlIlllIIlI) {
        this.field_152309_a = lllllllllllllIlIIIIIIIIlIlllIIlI;
    }
    
    private static String llIIIlIIlIIIIlI(String lllllllllllllIlIIIIIIIIlIIlllIII, final String lllllllllllllIlIIIIIIIIlIIllIlll) {
        lllllllllllllIlIIIIIIIIlIIlllIII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIIIIlIIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIIIlIIlllIll = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIIIlIIlllIlI = lllllllllllllIlIIIIIIIIlIIllIlll.toCharArray();
        int lllllllllllllIlIIIIIIIIlIIlllIIl = GuiIngestServers.lIIIllIlIlIllI[0];
        final int lllllllllllllIlIIIIIIIIlIIllIIll = (Object)((String)lllllllllllllIlIIIIIIIIlIIlllIII).toCharArray();
        final String lllllllllllllIlIIIIIIIIlIIllIIlI = (String)lllllllllllllIlIIIIIIIIlIIllIIll.length;
        short lllllllllllllIlIIIIIIIIlIIllIIIl = (short)GuiIngestServers.lIIIllIlIlIllI[0];
        while (llIIIlIIlIIlllI(lllllllllllllIlIIIIIIIIlIIllIIIl, (int)lllllllllllllIlIIIIIIIIlIIllIIlI)) {
            final char lllllllllllllIlIIIIIIIIlIIlllllI = lllllllllllllIlIIIIIIIIlIIllIIll[lllllllllllllIlIIIIIIIIlIIllIIIl];
            lllllllllllllIlIIIIIIIIlIIlllIll.append((char)(lllllllllllllIlIIIIIIIIlIIlllllI ^ lllllllllllllIlIIIIIIIIlIIlllIlI[lllllllllllllIlIIIIIIIIlIIlllIIl % lllllllllllllIlIIIIIIIIlIIlllIlI.length]));
            "".length();
            ++lllllllllllllIlIIIIIIIIlIIlllIIl;
            ++lllllllllllllIlIIIIIIIIlIIllIIIl;
            "".length();
            if (((0x2 ^ 0x51) & ~(0x40 ^ 0x13)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIIIlIIlllIll);
    }
    
    private static boolean llIIIlIIlIIllIl(final int lllllllllllllIlIIIIIIIIlIIlIllIl, final int lllllllllllllIlIIIIIIIIlIIlIllII) {
        return lllllllllllllIlIIIIIIIIlIIlIllIl == lllllllllllllIlIIIIIIIIlIIlIllII;
    }
    
    private static boolean llIIIlIIlIIllII(final int lllllllllllllIlIIIIIIIIlIIlIIllI) {
        return lllllllllllllIlIIIIIIIIlIIlIIllI != 0;
    }
    
    static {
        llIIIlIIlIIlIlI();
        llIIIlIIlIIIlII();
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.field_152311_g.handleMouseInput();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIIIIIIIIlIllIIlIl) throws IOException {
        if (llIIIlIIlIIllII(lllllllllllllIlIIIIIIIIlIllIIlIl.enabled ? 1 : 0)) {
            if (llIIIlIIlIIllIl(lllllllllllllIlIIIIIIIIlIllIIlIl.id, GuiIngestServers.lIIIllIlIlIllI[1])) {
                this.mc.displayGuiScreen(this.field_152309_a);
                "".length();
                if (-(0xC0 ^ 0xC4) > 0) {
                    return;
                }
            }
            else {
                this.mc.gameSettings.streamPreferredServer = GuiIngestServers.lIIIllIlIlIlII[GuiIngestServers.lIIIllIlIlIllI[9]];
                this.mc.gameSettings.saveOptions();
            }
        }
    }
    
    private static String llIIIlIIlIIIIll(final String lllllllllllllIlIIIIIIIIlIlIIllIl, final String lllllllllllllIlIIIIIIIIlIlIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIIIlIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIIIIlIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIIIIlIlIIllll.init(GuiIngestServers.lIIIllIlIlIllI[2], lllllllllllllIlIIIIIIIIlIlIlIIII);
            return new String(lllllllllllllIlIIIIIIIIlIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIIIlIlIIlllI) {
            lllllllllllllIlIIIIIIIIlIlIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIlIIlIIIlII() {
        (lIIIllIlIlIlII = new String[GuiIngestServers.lIIIllIlIlIllI[11]])[GuiIngestServers.lIIIllIlIlIllI[0]] = llIIIlIIlIIIIlI("JhISGT4nEUgDJTsHBx1/IAwBFSI9TBIZJSUH", "IbfpQ");
        GuiIngestServers.lIIIllIlIlIlII[GuiIngestServers.lIIIllIlIlIllI[1]] = llIIIlIIlIIIIlI("FjQqbC4eLyY=", "qACBJ");
        GuiIngestServers.lIIIllIlIlIlII[GuiIngestServers.lIIIllIlIlIllI[2]] = llIIIlIIlIIIIll("3oPgpLoMPTYnB6TYLNrhj/+PjYldFmzABeYepZejG40=", "HtWCW");
        GuiIngestServers.lIIIllIlIlIlII[GuiIngestServers.lIIIllIlIlIllI[9]] = llIIIlIIlIIIIlI("", "OnMsv");
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIIIIIIIIlIlIlllIl, final int lllllllllllllIlIIIIIIIIlIlIlllII, final float lllllllllllllIlIIIIIIIIlIlIllIll) {
        this.drawDefaultBackground();
        this.field_152311_g.drawScreen(lllllllllllllIlIIIIIIIIlIlIlllIl, lllllllllllllIlIIIIIIIIlIlIlllII, lllllllllllllIlIIIIIIIIlIlIllIll);
        this.drawCenteredString(this.fontRendererObj, this.field_152310_f, this.width / GuiIngestServers.lIIIllIlIlIllI[2], GuiIngestServers.lIIIllIlIlIllI[7], GuiIngestServers.lIIIllIlIlIllI[10]);
        super.drawScreen(lllllllllllllIlIIIIIIIIlIlIlllIl, lllllllllllllIlIIIIIIIIlIlIlllII, lllllllllllllIlIIIIIIIIlIlIllIll);
    }
    
    class ServerList extends GuiSlot
    {
        private static final /* synthetic */ int[] llIlIllIIlIIlI;
        private static final /* synthetic */ String[] llIlIllIIlIIII;
        
        private static int lIIlIlIlIIIlIlIl(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        static {
            lIIlIlIlIIIlIlII();
            lIIlIlIlIIIlIIlI();
        }
        
        private static boolean lIIlIlIlIIIlIlll(final Object llllllllllllIllIlIIllIlIIlllIIll, final Object llllllllllllIllIlIIllIlIIlllIIIl) {
            return llllllllllllIllIlIIllIlIIlllIIll == llllllllllllIllIlIIllIlIIlllIIIl;
        }
        
        private static void lIIlIlIlIIIlIIlI() {
            (llIlIllIIlIIII = new String[ServerList.llIlIllIIlIIlI[16]])[ServerList.llIlIllIIlIIlI[2]] = lIIlIlIlIIIIllII("KhMLOyMTCRUQOhMRJDI=", "vhxOQ");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[3]] = lIIlIlIlIIIIllIl("fIgaCmW4Nx8=", "PIPXN");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[4]] = lIIlIlIlIIIIllIl("zepeyPV//94=", "qzKgk");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[5]] = lIIlIlIlIIIIlllI("46PSyYBIKqM=", "bLgaG");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[6]] = lIIlIlIlIIIIllIl("L7B4Ob/cbxU=", "WUzpl");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[7]] = lIIlIlIlIIIIllII("YUZiQQ==", "PtQuc");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[8]] = lIIlIlIlIIIIlllI("CseMW9OgP6Q=", "gJyes");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[9]] = lIIlIlIlIIIIllIl("0GMwCMz0be8=", "mIdFG");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[10]] = lIIlIlIlIIIIlllI("3nF7yo1uby7x4Tc+ID4Ieg==", "xPNxm");
            ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[11]] = lIIlIlIlIIIIlllI("KRJ/beSNPT3gUX15r+4aRw==", "jarYb");
        }
        
        @Override
        protected int getSize() {
            return this.mc.getTwitchStream().func_152925_v().length;
        }
        
        @Override
        protected int getScrollBarX() {
            return super.getScrollBarX() + ServerList.llIlIllIIlIIlI[15];
        }
        
        private static String lIIlIlIlIIIIllII(String llllllllllllIllIlIIllIlIlIllIIIl, final String llllllllllllIllIlIIllIlIlIllIIII) {
            llllllllllllIllIlIIllIlIlIllIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIIllIlIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIIllIlIlIllIlII = new StringBuilder();
            final char[] llllllllllllIllIlIIllIlIlIllIIll = llllllllllllIllIlIIllIlIlIllIIII.toCharArray();
            int llllllllllllIllIlIIllIlIlIllIIlI = ServerList.llIlIllIIlIIlI[2];
            final int llllllllllllIllIlIIllIlIlIlIllII = (Object)llllllllllllIllIlIIllIlIlIllIIIl.toCharArray();
            final int llllllllllllIllIlIIllIlIlIlIlIlI = llllllllllllIllIlIIllIlIlIlIllII.length;
            String llllllllllllIllIlIIllIlIlIlIlIIl = (String)ServerList.llIlIllIIlIIlI[2];
            while (lIIlIlIlIIIllIII((int)llllllllllllIllIlIIllIlIlIlIlIIl, llllllllllllIllIlIIllIlIlIlIlIlI)) {
                final char llllllllllllIllIlIIllIlIlIllIlll = llllllllllllIllIlIIllIlIlIlIllII[llllllllllllIllIlIIllIlIlIlIlIIl];
                llllllllllllIllIlIIllIlIlIllIlII.append((char)(llllllllllllIllIlIIllIlIlIllIlll ^ llllllllllllIllIlIIllIlIlIllIIll[llllllllllllIllIlIIllIlIlIllIIlI % llllllllllllIllIlIIllIlIlIllIIll.length]));
                "".length();
                ++llllllllllllIllIlIIllIlIlIllIIlI;
                ++llllllllllllIllIlIIllIlIlIlIlIIl;
                "".length();
                if ("   ".length() >= (0x46 ^ 0x42)) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIIllIlIlIllIlII);
        }
        
        @Override
        protected void drawBackground() {
        }
        
        private static boolean lIIlIlIlIIIllIIl(final int llllllllllllIllIlIIllIlIIllIIlll) {
            return llllllllllllIllIlIIllIlIIllIIlll == 0;
        }
        
        private static String lIIlIlIlIIIIllIl(final String llllllllllllIllIlIIllIlIlIIllIII, final String llllllllllllIllIlIIllIlIlIIllIIl) {
            try {
                final SecretKeySpec llllllllllllIllIlIIllIlIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIlIlIIllIIl.getBytes(StandardCharsets.UTF_8)), ServerList.llIlIllIIlIIlI[10]), "DES");
                final Cipher llllllllllllIllIlIIllIlIlIIlllIl = Cipher.getInstance("DES");
                llllllllllllIllIlIIllIlIlIIlllIl.init(ServerList.llIlIllIIlIIlI[4], llllllllllllIllIlIIllIlIlIIlllll);
                return new String(llllllllllllIllIlIIllIlIlIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIllIlIlIIllIll) {
                llllllllllllIllIlIIllIlIlIIllIll.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlIlIlIIIlIlII() {
            (llIlIllIIlIIlI = new int[17])[0] = (0x24 ^ 0x11 ^ (0x92 ^ 0x87));
            ServerList.llIlIllIIlIIlI[1] = (0x33 ^ 0x3D ^ (0xA4 ^ 0x89));
            ServerList.llIlIllIIlIIlI[2] = ((27 + 16 + 93 + 19 ^ 117 + 18 - 47 + 74) & (22 + 250 - 137 + 119 ^ 87 + 57 + 54 + 1 ^ -" ".length()));
            ServerList.llIlIllIIlIIlI[3] = " ".length();
            ServerList.llIlIllIIlIIlI[4] = "  ".length();
            ServerList.llIlIllIIlIIlI[5] = "   ".length();
            ServerList.llIlIllIIlIIlI[6] = (121 + 166 - 194 + 76 ^ 94 + 99 - 110 + 90);
            ServerList.llIlIllIIlIIlI[7] = (30 + 91 + 12 + 18 ^ 119 + 145 - 164 + 46);
            ServerList.llIlIllIIlIIlI[8] = (12 + 114 + 44 + 21 ^ 122 + 40 + 5 + 18);
            ServerList.llIlIllIIlIIlI[9] = (0xCB ^ 0x9D ^ (0x51 ^ 0x0));
            ServerList.llIlIllIIlIIlI[10] = ("  ".length() ^ (0x68 ^ 0x62));
            ServerList.llIlIllIIlIIlI[11] = (112 + 57 - 160 + 146 ^ 10 + 131 - 70 + 75);
            ServerList.llIlIllIIlIIlI[12] = (-1 & 0xFFFFFF);
            ServerList.llIlIllIIlIIlI[13] = (-(0xFFFFFDFF & 0x4BCF) & (0xFFFFFDFE & 0x307BFF));
            ServerList.llIlIllIIlIIlI[14] = (0xFFFFF1A0 & 0x808EDF);
            ServerList.llIlIllIIlIIlI[15] = (0xB2 ^ 0xBD);
            ServerList.llIlIllIIlIIlI[16] = (0x11 ^ 0x7F ^ (0x4D ^ 0x29));
        }
        
        @Override
        protected void elementClicked(final int llllllllllllIllIlIIllIlIlllIlIIl, final boolean llllllllllllIllIlIIllIlIlllIllIl, final int llllllllllllIllIlIIllIlIlllIllII, final int llllllllllllIllIlIIllIlIlllIlIll) {
            this.mc.gameSettings.streamPreferredServer = this.mc.getTwitchStream().func_152925_v()[llllllllllllIllIlIIllIlIlllIlIIl].serverUrl;
            this.mc.gameSettings.saveOptions();
        }
        
        private static boolean lIIlIlIlIIIllIII(final int llllllllllllIllIlIIllIlIIlllllIl, final int llllllllllllIllIlIIllIlIIlllllII) {
            return llllllllllllIllIlIIllIlIIlllllIl < llllllllllllIllIlIIllIlIIlllllII;
        }
        
        @Override
        protected boolean isSelected(final int llllllllllllIllIlIIllIlIlllIIlIl) {
            return this.mc.getTwitchStream().func_152925_v()[llllllllllllIllIlIIllIlIlllIIlIl].serverUrl.equals(this.mc.gameSettings.streamPreferredServer);
        }
        
        private static boolean lIIlIlIlIIIlIllI(final Object llllllllllllIllIlIIllIlIIllllIIl) {
            return llllllllllllIllIlIIllIlIIllllIIl != null;
        }
        
        private static String lIIlIlIlIIIIlllI(final String llllllllllllIllIlIIllIlIlIIIllIl, final String llllllllllllIllIlIIllIlIlIIIllII) {
            try {
                final SecretKeySpec llllllllllllIllIlIIllIlIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIlIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIIllIlIlIIIllll = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIIllIlIlIIIllll.init(ServerList.llIlIllIIlIIlI[4], llllllllllllIllIlIIllIlIlIIlIIII);
                return new String(llllllllllllIllIlIIllIlIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIlIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIllIlIlIIIlllI) {
                llllllllllllIllIlIIllIlIlIIIlllI.printStackTrace();
                return null;
            }
        }
        
        public ServerList(final Minecraft llllllllllllIllIlIIllIlIllllIlIl) {
            super(llllllllllllIllIlIIllIlIllllIlIl, GuiIngestServers.this.width, GuiIngestServers.this.height, ServerList.llIlIllIIlIIlI[0], GuiIngestServers.this.height - ServerList.llIlIllIIlIIlI[1], (int)(llllllllllllIllIlIIllIlIllllIlIl.fontRendererObj.FONT_HEIGHT * 3.5));
            this.setShowSelectionBox((boolean)(ServerList.llIlIllIIlIIlI[2] != 0));
        }
        
        private static boolean lIIlIlIlIIIllIlI(final int llllllllllllIllIlIIllIlIIllIllII) {
            return llllllllllllIllIlIIllIlIIllIllII != 0;
        }
        
        @Override
        protected void drawSlot(final int llllllllllllIllIlIIllIlIllIIlIll, int llllllllllllIllIlIIllIlIllIIlIlI, final int llllllllllllIllIlIIllIlIllIlIlIl, final int llllllllllllIllIlIIllIlIllIlIlII, final int llllllllllllIllIlIIllIlIllIlIIll, final int llllllllllllIllIlIIllIlIllIlIIlI) {
            final IngestServer llllllllllllIllIlIIllIlIllIlIIIl = this.mc.getTwitchStream().func_152925_v()[llllllllllllIllIlIIllIlIllIIlIll];
            String llllllllllllIllIlIIllIlIllIlIIII = llllllllllllIllIlIIllIlIllIlIIIl.serverUrl.replaceAll(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[2]], ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[3]]);
            String llllllllllllIllIlIIllIlIllIIllll = String.valueOf(new StringBuilder(String.valueOf((int)llllllllllllIllIlIIllIlIllIlIIIl.bitrateKbps)).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[4]]));
            String llllllllllllIllIlIIllIlIllIIlllI = null;
            final IngestServerTester llllllllllllIllIlIIllIlIllIIllIl = this.mc.getTwitchStream().func_152932_y();
            if (lIIlIlIlIIIlIllI(llllllllllllIllIlIIllIlIllIIllIl)) {
                if (lIIlIlIlIIIlIlll(llllllllllllIllIlIIllIlIllIlIIIl, llllllllllllIllIlIIllIlIllIIllIl.func_153040_c())) {
                    llllllllllllIllIlIIllIlIllIlIIII = String.valueOf(new StringBuilder().append(EnumChatFormatting.GREEN).append(llllllllllllIllIlIIllIlIllIlIIII));
                    llllllllllllIllIlIIllIlIllIIllll = String.valueOf(new StringBuilder(String.valueOf((int)(llllllllllllIllIlIIllIlIllIIllIl.func_153030_h() * 100.0f))).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[5]]));
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                }
                else if (lIIlIlIlIIIllIII(llllllllllllIllIlIIllIlIllIIlIll, llllllllllllIllIlIIllIlIllIIllIl.func_153028_p())) {
                    if (lIIlIlIlIIIllIIl(lIIlIlIlIIIlIlIl(llllllllllllIllIlIIllIlIllIlIIIl.bitrateKbps, 0.0f))) {
                        llllllllllllIllIlIIllIlIllIIllll = String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[6]]));
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                    }
                }
                else {
                    llllllllllllIllIlIIllIlIllIIllll = String.valueOf(new StringBuilder().append(EnumChatFormatting.OBFUSCATED).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[7]]).append(EnumChatFormatting.RESET).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[8]]));
                    "".length();
                    if (((0x3E ^ 0x7C) & ~(0xD5 ^ 0x97)) <= -" ".length()) {
                        return;
                    }
                }
            }
            else if (lIIlIlIlIIIllIIl(lIIlIlIlIIIlIlIl(llllllllllllIllIlIIllIlIllIlIIIl.bitrateKbps, 0.0f))) {
                llllllllllllIllIlIIllIlIllIIllll = String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[9]]));
            }
            llllllllllllIllIlIIllIlIllIIlIlI -= 15;
            if (lIIlIlIlIIIllIlI(this.isSelected(llllllllllllIllIlIIllIlIllIIlIll) ? 1 : 0)) {
                llllllllllllIllIlIIllIlIllIIlllI = String.valueOf(new StringBuilder().append(EnumChatFormatting.BLUE).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[10]]));
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else if (lIIlIlIlIIIllIlI(llllllllllllIllIlIIllIlIllIlIIIl.defaultServer ? 1 : 0)) {
                llllllllllllIllIlIIllIlIllIIlllI = String.valueOf(new StringBuilder().append(EnumChatFormatting.GREEN).append(ServerList.llIlIllIIlIIII[ServerList.llIlIllIIlIIlI[11]]));
            }
            GuiIngestServers.this.drawString(GuiIngestServers.this.fontRendererObj, llllllllllllIllIlIIllIlIllIlIIIl.serverName, llllllllllllIllIlIIllIlIllIIlIlI + ServerList.llIlIllIIlIIlI[4], llllllllllllIllIlIIllIlIllIlIlIl + ServerList.llIlIllIIlIIlI[7], ServerList.llIlIllIIlIIlI[12]);
            GuiIngestServers.this.drawString(GuiIngestServers.this.fontRendererObj, llllllllllllIllIlIIllIlIllIlIIII, llllllllllllIllIlIIllIlIllIIlIlI + ServerList.llIlIllIIlIIlI[4], llllllllllllIllIlIIllIlIllIlIlIl + GuiIngestServers.this.fontRendererObj.FONT_HEIGHT + ServerList.llIlIllIIlIIlI[7] + ServerList.llIlIllIIlIIlI[5], ServerList.llIlIllIIlIIlI[13]);
            GuiIngestServers.this.drawString(GuiIngestServers.this.fontRendererObj, llllllllllllIllIlIIllIlIllIIllll, this.getScrollBarX() - ServerList.llIlIllIIlIIlI[7] - GuiIngestServers.this.fontRendererObj.getStringWidth(llllllllllllIllIlIIllIlIllIIllll), llllllllllllIllIlIIllIlIllIlIlIl + ServerList.llIlIllIIlIIlI[7], ServerList.llIlIllIIlIIlI[14]);
            if (lIIlIlIlIIIlIllI(llllllllllllIllIlIIllIlIllIIlllI)) {
                GuiIngestServers.this.drawString(GuiIngestServers.this.fontRendererObj, llllllllllllIllIlIIllIlIllIIlllI, this.getScrollBarX() - ServerList.llIlIllIIlIIlI[7] - GuiIngestServers.this.fontRendererObj.getStringWidth(llllllllllllIllIlIIllIlIllIIlllI), llllllllllllIllIlIIllIlIllIlIlIl + ServerList.llIlIllIIlIIlI[7] + ServerList.llIlIllIIlIIlI[5] + GuiIngestServers.this.fontRendererObj.FONT_HEIGHT, ServerList.llIlIllIIlIIlI[14]);
            }
        }
    }
}
