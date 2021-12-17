// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.resources.I18n;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.client.settings.GameSettings;

public class GuiVideoSettings extends GuiScreen
{
    protected /* synthetic */ String screenTitle;
    private static final /* synthetic */ String[] llIlIlIlIIlIII;
    private static final /* synthetic */ int[] llIlIlIlIIlIlI;
    private static final /* synthetic */ GameSettings.Options[] videoOptions;
    private /* synthetic */ GameSettings guiGameSettings;
    private /* synthetic */ GuiScreen parentGuiScreen;
    private /* synthetic */ GuiListExtended optionsRowList;
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.optionsRowList.handleMouseInput();
    }
    
    private static void lIIlIlIIIlIIlIII() {
        (llIlIlIlIIlIlI = new int[23])[0] = (0x15 ^ 0x26 ^ (0x8F ^ 0xAC));
        GuiVideoSettings.llIlIlIlIIlIlI[1] = ((0x22 ^ 0x7C) & ~(0xD5 ^ 0x8B));
        GuiVideoSettings.llIlIlIlIIlIlI[2] = " ".length();
        GuiVideoSettings.llIlIlIlIIlIlI[3] = "  ".length();
        GuiVideoSettings.llIlIlIlIIlIlI[4] = "   ".length();
        GuiVideoSettings.llIlIlIlIIlIlI[5] = (0xC ^ 0x55 ^ (0x15 ^ 0x48));
        GuiVideoSettings.llIlIlIlIIlIlI[6] = (0x42 ^ 0x47);
        GuiVideoSettings.llIlIlIlIIlIlI[7] = (0x10 ^ 0x6C ^ (0xEE ^ 0x94));
        GuiVideoSettings.llIlIlIlIIlIlI[8] = (0x1F ^ 0x40 ^ (0x34 ^ 0x6C));
        GuiVideoSettings.llIlIlIlIIlIlI[9] = (0xA7 ^ 0xAF);
        GuiVideoSettings.llIlIlIlIIlIlI[10] = (0x76 ^ 0x7F);
        GuiVideoSettings.llIlIlIlIIlIlI[11] = (112 + 99 - 50 + 8 ^ 87 + 97 - 104 + 83);
        GuiVideoSettings.llIlIlIlIIlIlI[12] = (0x58 ^ 0x53);
        GuiVideoSettings.llIlIlIlIIlIlI[13] = (0xAF ^ 0xA3);
        GuiVideoSettings.llIlIlIlIIlIlI[14] = (0x1C ^ 0x11);
        GuiVideoSettings.llIlIlIlIIlIlI[15] = (0x87 ^ 0xB5 ^ (0xB8 ^ 0x84));
        GuiVideoSettings.llIlIlIlIIlIlI[16] = (142 + 63 - 144 + 110 ^ 62 + 110 - 163 + 155);
        GuiVideoSettings.llIlIlIlIIlIlI[17] = 127 + 99 - 216 + 190;
        GuiVideoSettings.llIlIlIlIIlIlI[18] = (0x1 ^ 0x65);
        GuiVideoSettings.llIlIlIlIIlIlI[19] = (68 + 73 - 10 + 40 ^ 81 + 15 + 12 + 68);
        GuiVideoSettings.llIlIlIlIIlIlI[20] = (0x9E ^ 0xBE);
        GuiVideoSettings.llIlIlIlIIlIlI[21] = (0xAA ^ 0x80 ^ (0x35 ^ 0x6));
        GuiVideoSettings.llIlIlIlIIlIlI[22] = (-" ".length() & (-1 & 0xFFFFFF));
    }
    
    private static boolean lIIlIlIIIlIIllll(final int llllllllllllIllIlIlIIllIllIIIIII, final int llllllllllllIllIlIlIIllIlIllllll) {
        return llllllllllllIllIlIlIIllIllIIIIII < llllllllllllIllIlIlIIllIlIllllll;
    }
    
    private static boolean lIIlIlIIIlIIlIlI(final Object llllllllllllIllIlIlIIllIlIllllII, final Object llllllllllllIllIlIlIIllIlIlllIll) {
        return llllllllllllIllIlIlIIllIlIllllII == llllllllllllIllIlIlIIllIlIlllIll;
    }
    
    private static boolean lIIlIlIIIlIIlIIl(final int llllllllllllIllIlIlIIllIlIllIlll) {
        return llllllllllllIllIlIlIIllIlIllIlll == 0;
    }
    
    private static String lIIlIlIIIlIIIIlI(final String llllllllllllIllIlIlIIllIllIlIIII, final String llllllllllllIllIlIlIIllIllIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIllIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIllIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIIllIllIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIIllIllIlIIlI.init(GuiVideoSettings.llIlIlIlIIlIlI[3], llllllllllllIllIlIlIIllIllIlIIll);
            return new String(llllllllllllIllIlIlIIllIllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIllIllIlIIIl) {
            llllllllllllIllIlIlIIllIllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIlIlIIllIllllIllI, final int llllllllllllIllIlIlIIllIllllIIIl, final float llllllllllllIllIlIlIIllIllllIIII) {
        this.drawDefaultBackground();
        this.optionsRowList.drawScreen(llllllllllllIllIlIlIIllIllllIllI, llllllllllllIllIlIlIIllIllllIIIl, llllllllllllIllIlIlIIllIllllIIII);
        this.drawCenteredString(this.fontRendererObj, this.screenTitle, this.width / GuiVideoSettings.llIlIlIlIIlIlI[3], GuiVideoSettings.llIlIlIlIIlIlI[6], GuiVideoSettings.llIlIlIlIIlIlI[22]);
        super.drawScreen(llllllllllllIllIlIlIIllIllllIllI, llllllllllllIllIlIlIIllIllllIIIl, llllllllllllIllIlIlIIllIllllIIII);
    }
    
    private static boolean lIIlIlIIIlIIllIl(final int llllllllllllIllIlIlIIllIllIIlIII, final int llllllllllllIllIlIlIIllIllIIIlll) {
        return llllllllllllIllIlIlIIllIllIIlIII == llllllllllllIllIlIlIIllIllIIIlll;
    }
    
    private static void lIIlIlIIIlIIIlll() {
        (llIlIlIlIIlIII = new String[GuiVideoSettings.llIlIlIlIIlIlI[4]])[GuiVideoSettings.llIlIlIlIIlIlI[1]] = lIIlIlIIIlIIIIlI("gHtHrqgQ3M+h8Oan1YNHuQ==", "ZDcYU");
        GuiVideoSettings.llIlIlIlIIlIII[GuiVideoSettings.llIlIlIlIIlIlI[2]] = lIIlIlIIIlIIIIlI("/y9d3qE6fWKm6t+N7zmG+QK086GAYKdE", "gNjMj");
        GuiVideoSettings.llIlIlIlIIlIII[GuiVideoSettings.llIlIlIlIIlIlI[3]] = lIIlIlIIIlIIIllI("ETc9agAZLDE=", "vBTDd");
    }
    
    @Override
    public void initGui() {
        this.screenTitle = I18n.format(GuiVideoSettings.llIlIlIlIIlIII[GuiVideoSettings.llIlIlIlIIlIlI[2]], new Object[GuiVideoSettings.llIlIlIlIIlIlI[1]]);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiVideoSettings.llIlIlIlIIlIlI[17], this.width / GuiVideoSettings.llIlIlIlIIlIlI[3] - GuiVideoSettings.llIlIlIlIIlIlI[18], this.height - GuiVideoSettings.llIlIlIlIIlIlI[19], I18n.format(GuiVideoSettings.llIlIlIlIIlIII[GuiVideoSettings.llIlIlIlIIlIlI[3]], new Object[GuiVideoSettings.llIlIlIlIIlIlI[1]])));
        "".length();
        if (lIIlIlIIIlIIlIIl(OpenGlHelper.vboSupported ? 1 : 0)) {
            final GameSettings.Options[] llllllllllllIllIlIlIIlllIIlllllI = new GameSettings.Options[GuiVideoSettings.videoOptions.length - GuiVideoSettings.llIlIlIlIIlIlI[2]];
            int llllllllllllIllIlIlIIlllIIllllIl = GuiVideoSettings.llIlIlIlIIlIlI[1];
            final char llllllllllllIllIlIlIIlllIIllIlIl;
            final byte llllllllllllIllIlIlIIlllIIllIllI = (byte)((GameSettings.Options[])(Object)(llllllllllllIllIlIlIIlllIIllIlIl = (char)(Object)GuiVideoSettings.videoOptions)).length;
            Exception llllllllllllIllIlIlIIlllIIllIlll = (Exception)GuiVideoSettings.llIlIlIlIIlIlI[1];
            "".length();
            if (-(0x6D ^ 0x0 ^ (0x4A ^ 0x22)) >= 0) {
                return;
            }
            while (!lIIlIlIIIlIIlIll((int)llllllllllllIllIlIlIIlllIIllIlll, llllllllllllIllIlIlIIlllIIllIllI)) {
                final GameSettings.Options llllllllllllIllIlIlIIlllIIllllII = llllllllllllIllIlIlIIlllIIllIlIl[llllllllllllIllIlIlIIlllIIllIlll];
                if (lIIlIlIIIlIIlIlI(llllllllllllIllIlIlIIlllIIllllII, GameSettings.Options.USE_VBO)) {
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                    break;
                }
                else {
                    llllllllllllIllIlIlIIlllIIlllllI[llllllllllllIllIlIlIIlllIIllllIl] = llllllllllllIllIlIlIIlllIIllllII;
                    ++llllllllllllIllIlIlIIlllIIllllIl;
                    ++llllllllllllIllIlIlIIlllIIllIlll;
                }
            }
            this.optionsRowList = new GuiOptionsRowList(this.mc, this.width, this.height, GuiVideoSettings.llIlIlIlIIlIlI[20], this.height - GuiVideoSettings.llIlIlIlIIlIlI[20], GuiVideoSettings.llIlIlIlIIlIlI[21], llllllllllllIllIlIlIIlllIIlllllI);
            "".length();
            if ((0xB0 ^ 0xB5) == 0x0) {
                return;
            }
        }
        else {
            this.optionsRowList = new GuiOptionsRowList(this.mc, this.width, this.height, GuiVideoSettings.llIlIlIlIIlIlI[20], this.height - GuiVideoSettings.llIlIlIlIIlIlI[20], GuiVideoSettings.llIlIlIlIIlIlI[21], GuiVideoSettings.videoOptions);
        }
    }
    
    static {
        lIIlIlIIIlIIlIII();
        lIIlIlIIIlIIIlll();
        final GameSettings.Options[] videoOptions2 = new GameSettings.Options[GuiVideoSettings.llIlIlIlIIlIlI[0]];
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[1]] = GameSettings.Options.GRAPHICS;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[2]] = GameSettings.Options.RENDER_DISTANCE;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[3]] = GameSettings.Options.AMBIENT_OCCLUSION;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[4]] = GameSettings.Options.FRAMERATE_LIMIT;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[5]] = GameSettings.Options.ANAGLYPH;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[6]] = GameSettings.Options.VIEW_BOBBING;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[7]] = GameSettings.Options.GUI_SCALE;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[8]] = GameSettings.Options.GAMMA;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[9]] = GameSettings.Options.RENDER_CLOUDS;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[10]] = GameSettings.Options.PARTICLES;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[11]] = GameSettings.Options.USE_FULLSCREEN;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[12]] = GameSettings.Options.ENABLE_VSYNC;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[13]] = GameSettings.Options.MIPMAP_LEVELS;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[14]] = GameSettings.Options.BLOCK_ALTERNATIVES;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[15]] = GameSettings.Options.USE_VBO;
        videoOptions2[GuiVideoSettings.llIlIlIlIIlIlI[16]] = GameSettings.Options.ENTITY_SHADOWS;
        videoOptions = videoOptions2;
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIllIlIlIIlllIIIllIlI, final int llllllllllllIllIlIlIIlllIIIllIIl, final int llllllllllllIllIlIlIIlllIIIllIII) throws IOException {
        final int llllllllllllIllIlIlIIlllIIIlllll = this.guiGameSettings.guiScale;
        super.mouseClicked(llllllllllllIllIlIlIIlllIIIllIlI, llllllllllllIllIlIlIIlllIIIllIIl, llllllllllllIllIlIlIIlllIIIllIII);
        this.optionsRowList.mouseClicked(llllllllllllIllIlIlIIlllIIIllIlI, llllllllllllIllIlIlIIlllIIIllIIl, llllllllllllIllIlIlIIlllIIIllIII);
        "".length();
        if (lIIlIlIIIlIIlllI(this.guiGameSettings.guiScale, llllllllllllIllIlIlIIlllIIIlllll)) {
            final ScaledResolution llllllllllllIllIlIlIIlllIIIllllI = new ScaledResolution(this.mc);
            final int llllllllllllIllIlIlIIlllIIIlllIl = llllllllllllIllIlIlIIlllIIIllllI.getScaledWidth();
            final int llllllllllllIllIlIlIIlllIIIlllII = llllllllllllIllIlIlIIlllIIIllllI.getScaledHeight();
            this.setWorldAndResolution(this.mc, llllllllllllIllIlIlIIlllIIIlllIl, llllllllllllIllIlIlIIlllIIIlllII);
        }
    }
    
    private static String lIIlIlIIIlIIIllI(String llllllllllllIllIlIlIIllIlllIIIII, final String llllllllllllIllIlIlIIllIllIlllll) {
        llllllllllllIllIlIlIIllIlllIIIII = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIIllIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIllIlllIIIll = new StringBuilder();
        final char[] llllllllllllIllIlIlIIllIlllIIIlI = llllllllllllIllIlIlIIllIllIlllll.toCharArray();
        int llllllllllllIllIlIlIIllIlllIIIIl = GuiVideoSettings.llIlIlIlIIlIlI[1];
        final Exception llllllllllllIllIlIlIIllIllIllIll = (Object)llllllllllllIllIlIlIIllIlllIIIII.toCharArray();
        final char llllllllllllIllIlIlIIllIllIllIlI = (char)llllllllllllIllIlIlIIllIllIllIll.length;
        byte llllllllllllIllIlIlIIllIllIllIIl = (byte)GuiVideoSettings.llIlIlIlIIlIlI[1];
        while (lIIlIlIIIlIIllll(llllllllllllIllIlIlIIllIllIllIIl, llllllllllllIllIlIlIIllIllIllIlI)) {
            final char llllllllllllIllIlIlIIllIlllIIllI = llllllllllllIllIlIlIIllIllIllIll[llllllllllllIllIlIlIIllIllIllIIl];
            llllllllllllIllIlIlIIllIlllIIIll.append((char)(llllllllllllIllIlIlIIllIlllIIllI ^ llllllllllllIllIlIlIIllIlllIIIlI[llllllllllllIllIlIlIIllIlllIIIIl % llllllllllllIllIlIlIIllIlllIIIlI.length]));
            "".length();
            ++llllllllllllIllIlIlIIllIlllIIIIl;
            ++llllllllllllIllIlIlIIllIllIllIIl;
            "".length();
            if ("  ".length() >= (0x5F ^ 0x5B)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIllIlllIIIll);
    }
    
    private static boolean lIIlIlIIIlIIlllI(final int llllllllllllIllIlIlIIllIlIllIlII, final int llllllllllllIllIlIlIIllIlIllIIll) {
        return llllllllllllIllIlIlIIllIlIllIlII != llllllllllllIllIlIlIIllIlIllIIll;
    }
    
    public GuiVideoSettings(final GuiScreen llllllllllllIllIlIlIIlllIlIIlIll, final GameSettings llllllllllllIllIlIlIIlllIlIIlIlI) {
        this.screenTitle = GuiVideoSettings.llIlIlIlIIlIII[GuiVideoSettings.llIlIlIlIIlIlI[1]];
        this.parentGuiScreen = llllllllllllIllIlIlIIlllIlIIlIll;
        this.guiGameSettings = llllllllllllIllIlIlIIlllIlIIlIlI;
    }
    
    private static boolean lIIlIlIIIlIIlIll(final int llllllllllllIllIlIlIIllIllIIIlII, final int llllllllllllIllIlIlIIllIllIIIIll) {
        return llllllllllllIllIlIlIIllIllIIIlII >= llllllllllllIllIlIlIIllIllIIIIll;
    }
    
    @Override
    protected void mouseReleased(final int llllllllllllIllIlIlIIlllIIIIIIlI, final int llllllllllllIllIlIlIIlllIIIIlIIl, final int llllllllllllIllIlIlIIlllIIIIIIII) {
        final int llllllllllllIllIlIlIIlllIIIIIlll = this.guiGameSettings.guiScale;
        super.mouseReleased(llllllllllllIllIlIlIIlllIIIIIIlI, llllllllllllIllIlIlIIlllIIIIlIIl, llllllllllllIllIlIlIIlllIIIIIIII);
        this.optionsRowList.mouseReleased(llllllllllllIllIlIlIIlllIIIIIIlI, llllllllllllIllIlIlIIlllIIIIlIIl, llllllllllllIllIlIlIIlllIIIIIIII);
        "".length();
        if (lIIlIlIIIlIIlllI(this.guiGameSettings.guiScale, llllllllllllIllIlIlIIlllIIIIIlll)) {
            final ScaledResolution llllllllllllIllIlIlIIlllIIIIIllI = new ScaledResolution(this.mc);
            final int llllllllllllIllIlIlIIlllIIIIIlIl = llllllllllllIllIlIlIIlllIIIIIllI.getScaledWidth();
            final int llllllllllllIllIlIlIIlllIIIIIlII = llllllllllllIllIlIlIIlllIIIIIllI.getScaledHeight();
            this.setWorldAndResolution(this.mc, llllllllllllIllIlIlIIlllIIIIIlIl, llllllllllllIllIlIlIIlllIIIIIlII);
        }
    }
    
    private static boolean lIIlIlIIIlIIllII(final int llllllllllllIllIlIlIIllIlIlllIIl) {
        return llllllllllllIllIlIlIIllIlIlllIIl != 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIlIlIIlllIIlIllII) throws IOException {
        if (lIIlIlIIIlIIllII(llllllllllllIllIlIlIIlllIIlIllII.enabled ? 1 : 0) && lIIlIlIIIlIIllIl(llllllllllllIllIlIlIIlllIIlIllII.id, GuiVideoSettings.llIlIlIlIIlIlI[17])) {
            this.mc.gameSettings.saveOptions();
            this.mc.displayGuiScreen(this.parentGuiScreen);
        }
    }
}
