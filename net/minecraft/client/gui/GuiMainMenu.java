// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.realms.RealmsBridge;
import net.minecraft.world.demo.DemoWorldServer;
import java.util.Arrays;
import org.lwjgl.util.glu.Project;
import java.lang.reflect.Method;
import java.net.URI;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.ISaveFormat;
import java.util.List;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumChatFormatting;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.resources.I18n;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.util.ResourceLocation;

public class GuiMainMenu extends GuiScreen implements GuiYesNoCallback
{
    private /* synthetic */ String splashText;
    private final /* synthetic */ Object threadLock;
    private /* synthetic */ int panoramaTimer;
    private /* synthetic */ int field_92020_v;
    private static final /* synthetic */ String[] lIlllIIlllIIII;
    private /* synthetic */ String openGLWarningLink;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ int field_92023_s;
    private /* synthetic */ int field_92019_w;
    private /* synthetic */ DynamicTexture viewportTexture;
    private /* synthetic */ ResourceLocation backgroundTexture;
    private static final /* synthetic */ ResourceLocation minecraftTitleTextures;
    private /* synthetic */ int field_92022_t;
    private /* synthetic */ int field_92021_u;
    private /* synthetic */ GuiButton buttonResetDemo;
    private static final /* synthetic */ int[] lIlllIlIIllIII;
    private /* synthetic */ String openGLWarning2;
    private static final /* synthetic */ ResourceLocation[] titlePanoramaPaths;
    private /* synthetic */ GuiButton realmsButton;
    private /* synthetic */ float updateCounter;
    private /* synthetic */ int field_92024_r;
    private /* synthetic */ String openGLWarning1;
    
    private static boolean lIIIIIlIlIlIllIl(final int llllllllllllIlllllIIIIIlIlllllll) {
        return llllllllllllIlllllIIIIIlIlllllll < 0;
    }
    
    @Override
    public void initGui() {
        this.viewportTexture = new DynamicTexture(GuiMainMenu.lIlllIlIIllIII[17], GuiMainMenu.lIlllIlIIllIII[17]);
        this.backgroundTexture = this.mc.getTextureManager().getDynamicTextureLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[18]], this.viewportTexture);
        final Calendar llllllllllllIlllllIIIIlIlIlIlllI = Calendar.getInstance();
        llllllllllllIlllllIIIIlIlIlIlllI.setTime(new Date());
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIlIlllI.get(GuiMainMenu.lIlllIlIIllIII[3]) + GuiMainMenu.lIlllIlIIllIII[1], GuiMainMenu.lIlllIlIIllIII[13]) && lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIlIlllI.get(GuiMainMenu.lIlllIlIIllIII[6]), GuiMainMenu.lIlllIlIIllIII[19])) {
            this.splashText = GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[20]];
            "".length();
            if ((0x7D ^ 0x78) == 0x0) {
                return;
            }
        }
        else if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIlIlllI.get(GuiMainMenu.lIlllIlIIllIII[3]) + GuiMainMenu.lIlllIlIIllIII[1], GuiMainMenu.lIlllIlIIllIII[1]) && lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIlIlllI.get(GuiMainMenu.lIlllIlIIllIII[6]), GuiMainMenu.lIlllIlIIllIII[1])) {
            this.splashText = GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[21]];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIlIlllI.get(GuiMainMenu.lIlllIlIIllIII[3]) + GuiMainMenu.lIlllIlIIllIII[1], GuiMainMenu.lIlllIlIIllIII[10]) && lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIlIlllI.get(GuiMainMenu.lIlllIlIIllIII[6]), GuiMainMenu.lIlllIlIIllIII[22])) {
            this.splashText = GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[23]];
        }
        final int llllllllllllIlllllIIIIlIlIlIllIl = GuiMainMenu.lIlllIlIIllIII[19];
        final int llllllllllllIlllllIIIIlIlIlIllII = this.height / GuiMainMenu.lIlllIlIIllIII[5] + GuiMainMenu.lIlllIlIIllIII[24];
        if (lIIIIIlIlIlIlIIl(this.mc.isDemo() ? 1 : 0)) {
            this.addDemoButtons(llllllllllllIlllllIIIIlIlIlIllII, GuiMainMenu.lIlllIlIIllIII[19]);
            "".length();
            if ((0x12 ^ 0x16) <= "  ".length()) {
                return;
            }
        }
        else {
            this.addSingleplayerMultiplayerButtons(llllllllllllIlllllIIIIlIlIlIllII, GuiMainMenu.lIlllIlIIllIII[19]);
        }
        this.buttonList.add(new GuiButton(GuiMainMenu.lIlllIlIIllIII[0], this.width / GuiMainMenu.lIlllIlIIllIII[3] - GuiMainMenu.lIlllIlIIllIII[25], llllllllllllIlllllIIIIlIlIlIllII + GuiMainMenu.lIlllIlIIllIII[26] + GuiMainMenu.lIlllIlIIllIII[13], GuiMainMenu.lIlllIlIIllIII[27], GuiMainMenu.lIlllIlIIllIII[28], I18n.format(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[28]], new Object[GuiMainMenu.lIlllIlIIllIII[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiMainMenu.lIlllIlIIllIII[5], this.width / GuiMainMenu.lIlllIlIIllIII[3] + GuiMainMenu.lIlllIlIIllIII[3], llllllllllllIlllllIIIIlIlIlIllII + GuiMainMenu.lIlllIlIIllIII[26] + GuiMainMenu.lIlllIlIIllIII[13], GuiMainMenu.lIlllIlIIllIII[27], GuiMainMenu.lIlllIlIIllIII[28], I18n.format(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[29]], new Object[GuiMainMenu.lIlllIlIIllIII[0]])));
        "".length();
        this.buttonList.add(new GuiButtonLanguage(GuiMainMenu.lIlllIlIIllIII[6], this.width / GuiMainMenu.lIlllIlIIllIII[3] - GuiMainMenu.lIlllIlIIllIII[30], llllllllllllIlllllIIIIlIlIlIllII + GuiMainMenu.lIlllIlIIllIII[26] + GuiMainMenu.lIlllIlIIllIII[13]));
        "".length();
        synchronized (this.threadLock) {
            this.field_92023_s = this.fontRendererObj.getStringWidth(this.openGLWarning1);
            this.field_92024_r = this.fontRendererObj.getStringWidth(this.openGLWarning2);
            final int llllllllllllIlllllIIIIlIlIlIlIll = Math.max(this.field_92023_s, this.field_92024_r);
            this.field_92022_t = (this.width - llllllllllllIlllllIIIIlIlIlIlIll) / GuiMainMenu.lIlllIlIIllIII[3];
            this.field_92021_u = this.buttonList.get(GuiMainMenu.lIlllIlIIllIII[0]).yPosition - GuiMainMenu.lIlllIlIIllIII[19];
            this.field_92020_v = this.field_92022_t + llllllllllllIlllllIIIIlIlIlIlIll;
            this.field_92019_w = this.field_92021_u + GuiMainMenu.lIlllIlIIllIII[19];
            // monitorexit(this.threadLock)
            "".length();
            if ((0x2B ^ 0x47 ^ (0x4F ^ 0x27)) != (125 + 92 - 44 + 23 ^ 167 + 14 - 167 + 178)) {
                return;
            }
        }
        this.mc.func_181537_a((boolean)(GuiMainMenu.lIlllIlIIllIII[0] != 0));
    }
    
    static {
        lIIIIIlIlIlIIIll();
        lIIIIIlIIIllIIll();
        field_175373_f = new AtomicInteger(GuiMainMenu.lIlllIlIIllIII[0]);
        logger = LogManager.getLogger();
        RANDOM = new Random();
        splashTexts = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[0]]);
        minecraftTitleTextures = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[1]]);
        final ResourceLocation[] titlePanoramaPaths2 = new ResourceLocation[GuiMainMenu.lIlllIlIIllIII[2]];
        titlePanoramaPaths2[GuiMainMenu.lIlllIlIIllIII[0]] = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[3]]);
        titlePanoramaPaths2[GuiMainMenu.lIlllIlIIllIII[1]] = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[4]]);
        titlePanoramaPaths2[GuiMainMenu.lIlllIlIIllIII[3]] = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[5]]);
        titlePanoramaPaths2[GuiMainMenu.lIlllIlIIllIII[4]] = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[6]]);
        titlePanoramaPaths2[GuiMainMenu.lIlllIlIIllIII[5]] = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[2]]);
        titlePanoramaPaths2[GuiMainMenu.lIlllIlIIllIII[6]] = new ResourceLocation(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[7]]);
        titlePanoramaPaths = titlePanoramaPaths2;
        field_96138_a = String.valueOf(new StringBuilder(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[8]]).append(EnumChatFormatting.UNDERLINE).append(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[9]]).append(EnumChatFormatting.RESET).append(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[10]]));
    }
    
    private static boolean lIIIIIlIlIlIIlII(final int llllllllllllIlllllIIIIIllIIIIIIl) {
        return llllllllllllIlllllIIIIIllIIIIIIl == 0;
    }
    
    private static void lIIIIIlIlIlIIIll() {
        (lIlllIlIIllIII = new int[70])[0] = ((0xCE ^ 0xC3) & ~(0xCF ^ 0xC2));
        GuiMainMenu.lIlllIlIIllIII[1] = " ".length();
        GuiMainMenu.lIlllIlIIllIII[2] = (0x48 ^ 0x4E);
        GuiMainMenu.lIlllIlIIllIII[3] = "  ".length();
        GuiMainMenu.lIlllIlIIllIII[4] = "   ".length();
        GuiMainMenu.lIlllIlIIllIII[5] = (0x6 ^ 0x2);
        GuiMainMenu.lIlllIlIIllIII[6] = (0xE0 ^ 0xAF ^ (0x5E ^ 0x14));
        GuiMainMenu.lIlllIlIIllIII[7] = (0x3 ^ 0x7 ^ "   ".length());
        GuiMainMenu.lIlllIlIIllIII[8] = (0x4 ^ 0x66 ^ (0x2C ^ 0x46));
        GuiMainMenu.lIlllIlIIllIII[9] = (0x88 ^ 0x80 ^ " ".length());
        GuiMainMenu.lIlllIlIIllIII[10] = (0xBC ^ 0xB6);
        GuiMainMenu.lIlllIlIIllIII[11] = (0x79 ^ 0x72);
        GuiMainMenu.lIlllIlIIllIII[12] = (-(0xFFFFFCF7 & 0x3FD9) & (-1 & 0x77F7FFF));
        GuiMainMenu.lIlllIlIIllIII[13] = (0x68 ^ 0x64);
        GuiMainMenu.lIlllIlIIllIII[14] = (0x32 ^ 0x3F);
        GuiMainMenu.lIlllIlIIllIII[15] = (0x17 ^ 0x50 ^ (0x34 ^ 0x7D));
        GuiMainMenu.lIlllIlIIllIII[16] = (0xD ^ 0x2);
        GuiMainMenu.lIlllIlIIllIII[17] = (0xFFFFC7AF & 0x3950);
        GuiMainMenu.lIlllIlIIllIII[18] = (0x82 ^ 0x92);
        GuiMainMenu.lIlllIlIIllIII[19] = (0x43 ^ 0x5B);
        GuiMainMenu.lIlllIlIIllIII[20] = (77 + 117 - 142 + 85 ^ 13 + 36 + 64 + 39);
        GuiMainMenu.lIlllIlIIllIII[21] = (0x70 ^ 0x62);
        GuiMainMenu.lIlllIlIIllIII[22] = (0x6E ^ 0x71);
        GuiMainMenu.lIlllIlIIllIII[23] = (0xBC ^ 0xAF);
        GuiMainMenu.lIlllIlIIllIII[24] = (0xF3 ^ 0xC3);
        GuiMainMenu.lIlllIlIIllIII[25] = (0xFC ^ 0x87 ^ (0x8D ^ 0x92));
        GuiMainMenu.lIlllIlIIllIII[26] = (0xDF ^ 0x90 ^ (0xA1 ^ 0xA6));
        GuiMainMenu.lIlllIlIIllIII[27] = (0xCD ^ 0xBB ^ (0xA5 ^ 0xB1));
        GuiMainMenu.lIlllIlIIllIII[28] = (0x10 ^ 0x4);
        GuiMainMenu.lIlllIlIIllIII[29] = (88 + 60 - 129 + 126 ^ 72 + 44 - 57 + 73);
        GuiMainMenu.lIlllIlIIllIII[30] = (0xED ^ 0x91);
        GuiMainMenu.lIlllIlIIllIII[31] = (0x2D ^ 0x3B);
        GuiMainMenu.lIlllIlIIllIII[32] = (0x50 ^ 0x47);
        GuiMainMenu.lIlllIlIIllIII[33] = (84 + 90 - 78 + 82 ^ 65 + 121 - 66 + 51);
        GuiMainMenu.lIlllIlIIllIII[34] = (0x2F ^ 0x4C ^ (0xFA ^ 0x83));
        GuiMainMenu.lIlllIlIIllIII[35] = (0xB9 ^ 0x86 ^ (0xB8 ^ 0x9C));
        GuiMainMenu.lIlllIlIIllIII[36] = (0x3F ^ 0x23);
        GuiMainMenu.lIlllIlIIllIII[37] = (29 + 10 + 89 + 7 ^ 62 + 38 + 30 + 24);
        GuiMainMenu.lIlllIlIIllIII[38] = (0x7D ^ 0x21 ^ (0xE1 ^ 0xA3));
        GuiMainMenu.lIlllIlIIllIII[39] = (0x1B ^ 0x72 ^ (0x59 ^ 0x10));
        GuiMainMenu.lIlllIlIIllIII[40] = (0x50 ^ 0x71);
        GuiMainMenu.lIlllIlIIllIII[41] = (0x94 ^ 0xB6);
        GuiMainMenu.lIlllIlIIllIII[42] = (0x40 ^ 0x63);
        GuiMainMenu.lIlllIlIIllIII[43] = (-(0x5C ^ 0x77) & (0xFFFFF76B & 0x1FBF));
        GuiMainMenu.lIlllIlIIllIII[44] = (0xFFFFBF4F & 0x57B0);
        GuiMainMenu.lIlllIlIIllIII[45] = (0xFFFFDF46 & 0x23BB);
        GuiMainMenu.lIlllIlIIllIII[46] = (0xFFFF8F33 & 0x73CF);
        GuiMainMenu.lIlllIlIIllIII[47] = (0x1B ^ 0x1E) + (0xF0 ^ 0xBB) - -(22 + 152 - 162 + 141) + (0x38 ^ 0x2E);
        GuiMainMenu.lIlllIlIIllIII[48] = (-(0xBD ^ 0xBA) & (0xFFFFEDE7 & 0x1FFF));
        GuiMainMenu.lIlllIlIIllIII[49] = (0xFFFFFAB5 & 0x2D4B);
        GuiMainMenu.lIlllIlIIllIII[50] = (0xFFFFAE0B & 0x77F5);
        GuiMainMenu.lIlllIlIIllIII[51] = (-(0xFFFFFDFF & 0x3AF) & (0xFFFFF9EF & 0x2FBE));
        GuiMainMenu.lIlllIlIIllIII[52] = (0xFFFF8D1A & 0x73F7);
        GuiMainMenu.lIlllIlIIllIII[53] = -(0xFFFFD953 & 0x7F0026AD);
        GuiMainMenu.lIlllIlIIllIII[54] = (-1 & 0xFFFFFF);
        GuiMainMenu.lIlllIlIIllIII[55] = (0x2E ^ 0x62 ^ (0xA1 ^ 0x8E));
        GuiMainMenu.lIlllIlIIllIII[56] = (0xB5 ^ 0x99);
        GuiMainMenu.lIlllIlIIllIII[57] = (0x63 ^ 0xC) + (0x75 ^ 0x49) - (0xF3 ^ 0xB8) + (0x41 ^ 0x60);
        GuiMainMenu.lIlllIlIIllIII[58] = (0x7A ^ 0x18 ^ (0x12 ^ 0xE));
        GuiMainMenu.lIlllIlIIllIII[59] = 143 + 75 - 114 + 51;
        GuiMainMenu.lIlllIlIIllIII[60] = (0x8C ^ 0xA1);
        GuiMainMenu.lIlllIlIIllIII[61] = (0x54 ^ 0xE);
        GuiMainMenu.lIlllIlIIllIII[62] = -(0x1B ^ 0x40 ^ (0xD5 ^ 0x86));
        GuiMainMenu.lIlllIlIIllIII[63] = -(0xFFFFE7C3 & 0x193C);
        GuiMainMenu.lIlllIlIIllIII[64] = (0x5A ^ 0x70 ^ (0x2C ^ 0x22));
        GuiMainMenu.lIlllIlIIllIII[65] = (0x29 ^ 0x6D ^ (0x1A ^ 0x7B));
        GuiMainMenu.lIlllIlIIllIII[66] = -" ".length();
        GuiMainMenu.lIlllIlIIllIII[67] = (132 + 79 - 80 + 19 ^ 117 + 5 + 16 + 38);
        GuiMainMenu.lIlllIlIIllIII[68] = (0xFFFFA976 & 0x55205689);
        GuiMainMenu.lIlllIlIIllIII[69] = (0x18 ^ 0x3F);
    }
    
    private static String lIIIIIlIIIIllIlI(final String llllllllllllIlllllIIIIIllIlllIlI, final String llllllllllllIlllllIIIIIllIlllIIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIIllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIIIIllIllllII = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIIIIllIllllII.init(GuiMainMenu.lIlllIlIIllIII[3], llllllllllllIlllllIIIIIllIllllIl);
            return new String(llllllllllllIlllllIIIIIllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIIllIlllIll) {
            llllllllllllIlllllIIIIIllIlllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlllllIIIIIlllIllIII, final int llllllllllllIlllllIIIIIlllIlIIlI, final int llllllllllllIlllllIIIIIlllIlIIIl) throws IOException {
        super.mouseClicked(llllllllllllIlllllIIIIIlllIllIII, llllllllllllIlllllIIIIIlllIlIIlI, llllllllllllIlllllIIIIIlllIlIIIl);
        synchronized (this.threadLock) {
            if (lIIIIIlIlIlIlllI(this.openGLWarning1.length()) && lIIIIIlIlIlIlIlI(llllllllllllIlllllIIIIIlllIllIII, this.field_92022_t) && lIIIIIlIlIlIllll(llllllllllllIlllllIIIIIlllIllIII, this.field_92020_v) && lIIIIIlIlIlIlIlI(llllllllllllIlllllIIIIIlllIlIIlI, this.field_92021_u) && lIIIIIlIlIlIllll(llllllllllllIlllllIIIIIlllIlIIlI, this.field_92019_w)) {
                final GuiConfirmOpenLink llllllllllllIlllllIIIIIlllIlIlIl = new GuiConfirmOpenLink(this, this.openGLWarningLink, GuiMainMenu.lIlllIlIIllIII[14], (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0));
                llllllllllllIlllllIIIIIlllIlIlIl.disableSecurityWarning();
                this.mc.displayGuiScreen(llllllllllllIlllllIIIIIlllIlIlIl);
            }
            // monitorexit(this.threadLock)
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
    }
    
    private void addDemoButtons(final int llllllllllllIlllllIIIIlIlIIlIlIl, final int llllllllllllIlllllIIIIlIlIIIllll) {
        this.buttonList.add(new GuiButton(GuiMainMenu.lIlllIlIIllIII[11], this.width / GuiMainMenu.lIlllIlIIllIII[3] - GuiMainMenu.lIlllIlIIllIII[25], llllllllllllIlllllIIIIlIlIIlIlIl, I18n.format(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[33]], new Object[GuiMainMenu.lIlllIlIIllIII[0]])));
        "".length();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton buttonResetDemo = new GuiButton(GuiMainMenu.lIlllIlIIllIII[13], this.width / GuiMainMenu.lIlllIlIIllIII[3] - GuiMainMenu.lIlllIlIIllIII[25], llllllllllllIlllllIIIIlIlIIlIlIl + llllllllllllIlllllIIIIlIlIIIllll * GuiMainMenu.lIlllIlIIllIII[1], I18n.format(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[34]], new Object[GuiMainMenu.lIlllIlIIllIII[0]]));
        this.buttonResetDemo = buttonResetDemo;
        buttonList.add(buttonResetDemo);
        "".length();
        final ISaveFormat llllllllllllIlllllIIIIlIlIIlIIll = this.mc.getSaveLoader();
        final WorldInfo llllllllllllIlllllIIIIlIlIIlIIlI = llllllllllllIlllllIIIIlIlIIlIIll.getWorldInfo(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[35]]);
        if (lIIIIIlIlIlIIlIl(llllllllllllIlllllIIIIlIlIIlIIlI)) {
            this.buttonResetDemo.enabled = (GuiMainMenu.lIlllIlIIllIII[0] != 0);
        }
    }
    
    private void addSingleplayerMultiplayerButtons(final int llllllllllllIlllllIIIIlIlIIlllIl, final int llllllllllllIlllllIIIIlIlIIlllII) {
        this.buttonList.add(new GuiButton(GuiMainMenu.lIlllIlIIllIII[1], this.width / GuiMainMenu.lIlllIlIIllIII[3] - GuiMainMenu.lIlllIlIIllIII[25], llllllllllllIlllllIIIIlIlIIlllIl, I18n.format(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[31]], new Object[GuiMainMenu.lIlllIlIIllIII[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiMainMenu.lIlllIlIIllIII[3], this.width / GuiMainMenu.lIlllIlIIllIII[3] - GuiMainMenu.lIlllIlIIllIII[25], llllllllllllIlllllIIIIlIlIIlllIl + llllllllllllIlllllIIIIlIlIIlllII * GuiMainMenu.lIlllIlIIllIII[1], I18n.format(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[32]], new Object[GuiMainMenu.lIlllIlIIllIII[0]])));
        "".length();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton realmsButton = new GuiButton(GuiMainMenu.lIlllIlIIllIII[15], this.width / GuiMainMenu.lIlllIlIIllIII[3] - GuiMainMenu.lIlllIlIIllIII[25], llllllllllllIlllllIIIIlIlIIlllIl + llllllllllllIlllllIIIIlIlIIlllII * GuiMainMenu.lIlllIlIIllIII[3], I18n.format(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[19]], new Object[GuiMainMenu.lIlllIlIIllIII[0]]));
        this.realmsButton = realmsButton;
        buttonList.add(realmsButton);
        "".length();
    }
    
    private static boolean lIIIIIlIlIllIIII(final int llllllllllllIlllllIIIIIllIIlIIlI, final int llllllllllllIlllllIIIIIllIIlIIIl) {
        return llllllllllllIlllllIIIIIllIIlIIlI < llllllllllllIlllllIIIIIllIIlIIIl;
    }
    
    private static boolean lIIIIIlIlIlIllll(final int llllllllllllIlllllIIIIIllIIIlllI, final int llllllllllllIlllllIIIIIllIIIllIl) {
        return llllllllllllIlllllIIIIIllIIIlllI <= llllllllllllIlllllIIIIIllIIIllIl;
    }
    
    private void rotateAndBlurSkybox(final float llllllllllllIlllllIIIIlIIIllIllI) {
        this.mc.getTextureManager().bindTexture(this.backgroundTexture);
        GL11.glTexParameteri(GuiMainMenu.lIlllIlIIllIII[48], GuiMainMenu.lIlllIlIIllIII[49], GuiMainMenu.lIlllIlIIllIII[50]);
        GL11.glTexParameteri(GuiMainMenu.lIlllIlIIllIII[48], GuiMainMenu.lIlllIlIIllIII[51], GuiMainMenu.lIlllIlIIllIII[50]);
        GL11.glCopyTexSubImage2D(GuiMainMenu.lIlllIlIIllIII[48], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[17], GuiMainMenu.lIlllIlIIllIII[17]);
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GuiMainMenu.lIlllIlIIllIII[45], GuiMainMenu.lIlllIlIIllIII[46], GuiMainMenu.lIlllIlIIllIII[1], GuiMainMenu.lIlllIlIIllIII[0]);
        GlStateManager.colorMask((boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[0] != 0));
        final Tessellator llllllllllllIlllllIIIIlIIIllIlIl = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllllIIIIlIIIllIlII = llllllllllllIlllllIIIIlIIIllIlIl.getWorldRenderer();
        llllllllllllIlllllIIIIlIIIllIlII.begin(GuiMainMenu.lIlllIlIIllIII[7], DefaultVertexFormats.POSITION_TEX_COLOR);
        GlStateManager.disableAlpha();
        final int llllllllllllIlllllIIIIlIIIllIIll = GuiMainMenu.lIlllIlIIllIII[4];
        int llllllllllllIlllllIIIIlIIIllIIlI = GuiMainMenu.lIlllIlIIllIII[0];
        "".length();
        if (" ".length() >= (0x56 ^ 0x7A ^ (0x8D ^ 0xA5))) {
            return;
        }
        while (!lIIIIIlIlIlIlIlI(llllllllllllIlllllIIIIlIIIllIIlI, llllllllllllIlllllIIIIlIIIllIIll)) {
            final float llllllllllllIlllllIIIIlIIIllIIIl = 1.0f / (llllllllllllIlllllIIIIlIIIllIIlI + GuiMainMenu.lIlllIlIIllIII[1]);
            final int llllllllllllIlllllIIIIlIIIllIIII = this.width;
            final int llllllllllllIlllllIIIIlIIIlIllll = this.height;
            final float llllllllllllIlllllIIIIlIIIlIlllI = (llllllllllllIlllllIIIIlIIIllIIlI - llllllllllllIlllllIIIIlIIIllIIll / GuiMainMenu.lIlllIlIIllIII[3]) / 256.0f;
            llllllllllllIlllllIIIIlIIIllIlII.pos(llllllllllllIlllllIIIIlIIIllIIII, llllllllllllIlllllIIIIlIIIlIllll, this.zLevel).tex(0.0f + llllllllllllIlllllIIIIlIIIlIlllI, 1.0).color(1.0f, 1.0f, 1.0f, llllllllllllIlllllIIIIlIIIllIIIl).endVertex();
            llllllllllllIlllllIIIIlIIIllIlII.pos(llllllllllllIlllllIIIIlIIIllIIII, 0.0, this.zLevel).tex(1.0f + llllllllllllIlllllIIIIlIIIlIlllI, 1.0).color(1.0f, 1.0f, 1.0f, llllllllllllIlllllIIIIlIIIllIIIl).endVertex();
            llllllllllllIlllllIIIIlIIIllIlII.pos(0.0, 0.0, this.zLevel).tex(1.0f + llllllllllllIlllllIIIIlIIIlIlllI, 0.0).color(1.0f, 1.0f, 1.0f, llllllllllllIlllllIIIIlIIIllIIIl).endVertex();
            llllllllllllIlllllIIIIlIIIllIlII.pos(0.0, llllllllllllIlllllIIIIlIIIlIllll, this.zLevel).tex(0.0f + llllllllllllIlllllIIIIlIIIlIlllI, 0.0).color(1.0f, 1.0f, 1.0f, llllllllllllIlllllIIIIlIIIllIIIl).endVertex();
            ++llllllllllllIlllllIIIIlIIIllIIlI;
        }
        llllllllllllIlllllIIIIlIIIllIlIl.draw();
        GlStateManager.enableAlpha();
        GlStateManager.colorMask((boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0));
    }
    
    private static String lIIIIIlIIIIllIIl(String llllllllllllIlllllIIIIIllIlIIlIl, final String llllllllllllIlllllIIIIIllIlIlIIl) {
        llllllllllllIlllllIIIIIllIlIIlIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIIIIIllIlIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIIIIllIlIlIII = new StringBuilder();
        final char[] llllllllllllIlllllIIIIIllIlIIlll = llllllllllllIlllllIIIIIllIlIlIIl.toCharArray();
        int llllllllllllIlllllIIIIIllIlIIllI = GuiMainMenu.lIlllIlIIllIII[0];
        final Exception llllllllllllIlllllIIIIIllIlIIIII = (Object)((String)llllllllllllIlllllIIIIIllIlIIlIl).toCharArray();
        final byte llllllllllllIlllllIIIIIllIIlllll = (byte)llllllllllllIlllllIIIIIllIlIIIII.length;
        String llllllllllllIlllllIIIIIllIIllllI = (String)GuiMainMenu.lIlllIlIIllIII[0];
        while (lIIIIIlIlIllIIII((int)llllllllllllIlllllIIIIIllIIllllI, llllllllllllIlllllIIIIIllIIlllll)) {
            final char llllllllllllIlllllIIIIIllIlIlIll = llllllllllllIlllllIIIIIllIlIIIII[llllllllllllIlllllIIIIIllIIllllI];
            llllllllllllIlllllIIIIIllIlIlIII.append((char)(llllllllllllIlllllIIIIIllIlIlIll ^ llllllllllllIlllllIIIIIllIlIIlll[llllllllllllIlllllIIIIIllIlIIllI % llllllllllllIlllllIIIIIllIlIIlll.length]));
            "".length();
            ++llllllllllllIlllllIIIIIllIlIIllI;
            ++llllllllllllIlllllIIIIIllIIllllI;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIIIIllIlIlIII);
    }
    
    private void renderSkybox(final int llllllllllllIlllllIIIIlIIIIIllIl, final int llllllllllllIlllllIIIIlIIIIlIlll, final float llllllllllllIlllllIIIIlIIIIlIllI) {
        this.mc.getFramebuffer().unbindFramebuffer();
        GlStateManager.viewport(GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[17], GuiMainMenu.lIlllIlIIllIII[17]);
        this.drawPanorama(llllllllllllIlllllIIIIlIIIIIllIl, llllllllllllIlllllIIIIlIIIIlIlll, llllllllllllIlllllIIIIlIIIIlIllI);
        this.rotateAndBlurSkybox(llllllllllllIlllllIIIIlIIIIlIllI);
        this.rotateAndBlurSkybox(llllllllllllIlllllIIIIlIIIIlIllI);
        this.rotateAndBlurSkybox(llllllllllllIlllllIIIIlIIIIlIllI);
        this.rotateAndBlurSkybox(llllllllllllIlllllIIIIlIIIIlIllI);
        this.rotateAndBlurSkybox(llllllllllllIlllllIIIIlIIIIlIllI);
        this.rotateAndBlurSkybox(llllllllllllIlllllIIIIlIIIIlIllI);
        this.rotateAndBlurSkybox(llllllllllllIlllllIIIIlIIIIlIllI);
        this.mc.getFramebuffer().bindFramebuffer((boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0));
        GlStateManager.viewport(GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], this.mc.displayWidth, this.mc.displayHeight);
        float n;
        if (lIIIIIlIlIlIlIll(this.width, this.height)) {
            n = 120.0f / this.width;
            "".length();
            if (((0x2E ^ 0x6A) & ~(0x44 ^ 0x0)) != 0x0) {
                return;
            }
        }
        else {
            n = 120.0f / this.height;
        }
        final float llllllllllllIlllllIIIIlIIIIlIlIl = n;
        final float llllllllllllIlllllIIIIlIIIIlIlII = this.height * llllllllllllIlllllIIIIlIIIIlIlIl / 256.0f;
        final float llllllllllllIlllllIIIIlIIIIlIIll = this.width * llllllllllllIlllllIIIIlIIIIlIlIl / 256.0f;
        final int llllllllllllIlllllIIIIlIIIIlIIlI = this.width;
        final int llllllllllllIlllllIIIIlIIIIlIIIl = this.height;
        final Tessellator llllllllllllIlllllIIIIlIIIIlIIII = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllllIIIIlIIIIIllll = llllllllllllIlllllIIIIlIIIIlIIII.getWorldRenderer();
        llllllllllllIlllllIIIIlIIIIIllll.begin(GuiMainMenu.lIlllIlIIllIII[7], DefaultVertexFormats.POSITION_TEX_COLOR);
        llllllllllllIlllllIIIIlIIIIIllll.pos(0.0, llllllllllllIlllllIIIIlIIIIlIIIl, this.zLevel).tex(0.5f - llllllllllllIlllllIIIIlIIIIlIlII, 0.5f + llllllllllllIlllllIIIIlIIIIlIIll).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        llllllllllllIlllllIIIIlIIIIIllll.pos(llllllllllllIlllllIIIIlIIIIlIIlI, llllllllllllIlllllIIIIlIIIIlIIIl, this.zLevel).tex(0.5f - llllllllllllIlllllIIIIlIIIIlIlII, 0.5f - llllllllllllIlllllIIIIlIIIIlIIll).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        llllllllllllIlllllIIIIlIIIIIllll.pos(llllllllllllIlllllIIIIlIIIIlIIlI, 0.0, this.zLevel).tex(0.5f + llllllllllllIlllllIIIIlIIIIlIlII, 0.5f - llllllllllllIlllllIIIIlIIIIlIIll).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        llllllllllllIlllllIIIIlIIIIIllll.pos(0.0, 0.0, this.zLevel).tex(0.5f + llllllllllllIlllllIIIIlIIIIlIlII, 0.5f + llllllllllllIlllllIIIIlIIIIlIIll).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        llllllllllllIlllllIIIIlIIIIlIIII.draw();
    }
    
    private static boolean lIIIIIlIlIlIlIll(final int llllllllllllIlllllIIIIIllIIIlIlI, final int llllllllllllIlllllIIIIIllIIIlIIl) {
        return llllllllllllIlllllIIIIIllIIIlIlI > llllllllllllIlllllIIIIIllIIIlIIl;
    }
    
    private static int lIIIIIlIlIlIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlllllIIIIlIlIllIlll, final int llllllllllllIlllllIIIIlIlIllIllI) throws IOException {
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllllIIIIIlllllIllI, final int llllllllllllIlllllIIIIIlllllIlIl, final float llllllllllllIlllllIIIIIllllIlIII) {
        GlStateManager.disableAlpha();
        this.renderSkybox(llllllllllllIlllllIIIIIlllllIllI, llllllllllllIlllllIIIIIlllllIlIl, llllllllllllIlllllIIIIIllllIlIII);
        GlStateManager.enableAlpha();
        final Tessellator llllllllllllIlllllIIIIIlllllIIll = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllllIIIIIlllllIIlI = llllllllllllIlllllIIIIIlllllIIll.getWorldRenderer();
        final int llllllllllllIlllllIIIIIlllllIIIl = GuiMainMenu.lIlllIlIIllIII[52];
        final int llllllllllllIlllllIIIIIlllllIIII = this.width / GuiMainMenu.lIlllIlIIllIII[3] - llllllllllllIlllllIIIIIlllllIIIl / GuiMainMenu.lIlllIlIIllIII[3];
        final int llllllllllllIlllllIIIIIllllIllll = GuiMainMenu.lIlllIlIIllIII[38];
        this.drawGradientRect(GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], this.width, this.height, GuiMainMenu.lIlllIlIIllIII[53], GuiMainMenu.lIlllIlIIllIII[54]);
        this.drawGradientRect(GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], this.width, this.height, GuiMainMenu.lIlllIlIIllIII[0], Integer.MIN_VALUE);
        this.mc.getTextureManager().bindTexture(GuiMainMenu.minecraftTitleTextures);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        if (lIIIIIlIlIlIllIl(lIIIIIlIlIlIllII(this.updateCounter, 1.0E-4))) {
            this.drawTexturedModalRect(llllllllllllIlllllIIIIIlllllIIII + GuiMainMenu.lIlllIlIIllIII[0], llllllllllllIlllllIIIIIllllIllll + GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[55], GuiMainMenu.lIlllIlIIllIII[56]);
            this.drawTexturedModalRect(llllllllllllIlllllIIIIIlllllIIII + GuiMainMenu.lIlllIlIIllIII[55], llllllllllllIlllllIIIIIllllIllll + GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[57], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[35], GuiMainMenu.lIlllIlIIllIII[56]);
            this.drawTexturedModalRect(llllllllllllIlllllIIIIIlllllIIII + GuiMainMenu.lIlllIlIIllIII[55] + GuiMainMenu.lIlllIlIIllIII[34], llllllllllllIlllllIIIIIllllIllll + GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[58], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[4], GuiMainMenu.lIlllIlIIllIII[56]);
            this.drawTexturedModalRect(llllllllllllIlllllIIIIIlllllIIII + GuiMainMenu.lIlllIlIIllIII[55] + GuiMainMenu.lIlllIlIIllIII[34] + GuiMainMenu.lIlllIlIIllIII[4], llllllllllllIlllllIIIIIllllIllll + GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[55], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[34], GuiMainMenu.lIlllIlIIllIII[56]);
            this.drawTexturedModalRect(llllllllllllIlllllIIIIIlllllIIII + GuiMainMenu.lIlllIlIIllIII[59], llllllllllllIlllllIIIIIllllIllll + GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[60], GuiMainMenu.lIlllIlIIllIII[59], GuiMainMenu.lIlllIlIIllIII[56]);
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            this.drawTexturedModalRect(llllllllllllIlllllIIIIIlllllIIII + GuiMainMenu.lIlllIlIIllIII[0], llllllllllllIlllllIIIIIllllIllll + GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[59], GuiMainMenu.lIlllIlIIllIII[56]);
            this.drawTexturedModalRect(llllllllllllIlllllIIIIIlllllIIII + GuiMainMenu.lIlllIlIIllIII[59], llllllllllllIlllllIIIIIllllIllll + GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[60], GuiMainMenu.lIlllIlIIllIII[59], GuiMainMenu.lIlllIlIIllIII[56]);
        }
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)(this.width / GuiMainMenu.lIlllIlIIllIII[3] + GuiMainMenu.lIlllIlIIllIII[61]), 70.0f, 0.0f);
        GlStateManager.rotate(-20.0f, 0.0f, 0.0f, 1.0f);
        float llllllllllllIlllllIIIIIllllIlllI = 1.8f - MathHelper.abs(MathHelper.sin(Minecraft.getSystemTime() % 1000L / 1000.0f * 3.1415927f * 2.0f) * 0.1f);
        llllllllllllIlllllIIIIIllllIlllI = llllllllllllIlllllIIIIIllllIlllI * 100.0f / (this.fontRendererObj.getStringWidth(this.splashText) + GuiMainMenu.lIlllIlIIllIII[39]);
        GlStateManager.scale(llllllllllllIlllllIIIIIllllIlllI, llllllllllllIlllllIIIIIllllIlllI, llllllllllllIlllllIIIIIllllIlllI);
        this.drawCenteredString(this.fontRendererObj, this.splashText, GuiMainMenu.lIlllIlIIllIII[0], GuiMainMenu.lIlllIlIIllIII[62], GuiMainMenu.lIlllIlIIllIII[63]);
        GlStateManager.popMatrix();
        String llllllllllllIlllllIIIIIllllIllIl = GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[64]];
        if (lIIIIIlIlIlIlIIl(this.mc.isDemo() ? 1 : 0)) {
            llllllllllllIlllllIIIIIllllIllIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllllIIIIIllllIllIl)).append(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[65]]));
        }
        this.drawString(this.fontRendererObj, llllllllllllIlllllIIIIIllllIllIl, GuiMainMenu.lIlllIlIIllIII[3], this.height - GuiMainMenu.lIlllIlIIllIII[10], GuiMainMenu.lIlllIlIIllIII[66]);
        final String llllllllllllIlllllIIIIIllllIllII = GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[67]];
        this.drawString(this.fontRendererObj, llllllllllllIlllllIIIIIllllIllII, this.width - this.fontRendererObj.getStringWidth(llllllllllllIlllllIIIIIllllIllII) - GuiMainMenu.lIlllIlIIllIII[3], this.height - GuiMainMenu.lIlllIlIIllIII[10], GuiMainMenu.lIlllIlIIllIII[66]);
        if (lIIIIIlIlIlIIlll(this.openGLWarning1) && lIIIIIlIlIlIlllI(this.openGLWarning1.length())) {
            Gui.drawRect(this.field_92022_t - GuiMainMenu.lIlllIlIIllIII[3], this.field_92021_u - GuiMainMenu.lIlllIlIIllIII[3], this.field_92020_v + GuiMainMenu.lIlllIlIIllIII[3], this.field_92019_w - GuiMainMenu.lIlllIlIIllIII[1], GuiMainMenu.lIlllIlIIllIII[68]);
            this.drawString(this.fontRendererObj, this.openGLWarning1, this.field_92022_t, this.field_92021_u, GuiMainMenu.lIlllIlIIllIII[66]);
            this.drawString(this.fontRendererObj, this.openGLWarning2, (this.width - this.field_92024_r) / GuiMainMenu.lIlllIlIIllIII[3], this.buttonList.get(GuiMainMenu.lIlllIlIIllIII[0]).yPosition - GuiMainMenu.lIlllIlIIllIII[13], GuiMainMenu.lIlllIlIIllIII[66]);
        }
        super.drawScreen(llllllllllllIlllllIIIIIlllllIllI, llllllllllllIlllllIIIIIlllllIlIl, llllllllllllIlllllIIIIIllllIlIII);
    }
    
    @Override
    public void confirmClicked(final boolean llllllllllllIlllllIIIIlIIlllIIIl, final int llllllllllllIlllllIIIIlIIlllIIII) {
        if (lIIIIIlIlIlIlIIl(llllllllllllIlllllIIIIlIIlllIIIl ? 1 : 0) && lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIIlllIIII, GuiMainMenu.lIlllIlIIllIII[13])) {
            final ISaveFormat llllllllllllIlllllIIIIlIIllIllll = this.mc.getSaveLoader();
            llllllllllllIlllllIIIIlIIllIllll.flushCache();
            llllllllllllIlllllIIIIlIIllIllll.deleteWorldDirectory(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[22]]);
            "".length();
            this.mc.displayGuiScreen(this);
            "".length();
            if ((0x15 ^ 0x11) <= ((0xE4 ^ 0xC4) & ~(0x8B ^ 0xAB))) {
                return;
            }
        }
        else if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIIlllIIII, GuiMainMenu.lIlllIlIIllIII[14])) {
            if (lIIIIIlIlIlIlIIl(llllllllllllIlllllIIIIlIIlllIIIl ? 1 : 0)) {
                try {
                    final Class<?> llllllllllllIlllllIIIIlIIllIlllI = Class.forName(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[39]]);
                    final Object llllllllllllIlllllIIIIlIIllIllIl = llllllllllllIlllllIIIIlIIllIlllI.getMethod(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[40]], (Class<?>[])new Class[GuiMainMenu.lIlllIlIIllIII[0]]).invoke(null, new Object[GuiMainMenu.lIlllIlIIllIII[0]]);
                    final Class<?> clazz = llllllllllllIlllllIIIIlIIllIlllI;
                    final String name = GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[41]];
                    final Class[] parameterTypes = new Class[GuiMainMenu.lIlllIlIIllIII[1]];
                    parameterTypes[GuiMainMenu.lIlllIlIIllIII[0]] = URI.class;
                    final Method method = clazz.getMethod(name, (Class[])parameterTypes);
                    final Object obj = llllllllllllIlllllIIIIlIIllIllIl;
                    final Object[] args = new Object[GuiMainMenu.lIlllIlIIllIII[1]];
                    args[GuiMainMenu.lIlllIlIIllIII[0]] = new URI(this.openGLWarningLink);
                    method.invoke(obj, args);
                    "".length();
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                catch (Throwable llllllllllllIlllllIIIIlIIllIllII) {
                    GuiMainMenu.logger.error(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[42]], llllllllllllIlllllIIIIlIIllIllII);
                }
            }
            this.mc.displayGuiScreen(this);
        }
    }
    
    private static boolean lIIIIIlIlIlIIlll(final Object llllllllllllIlllllIIIIIllIIIIlll) {
        return llllllllllllIlllllIIIIIllIIIIlll != null;
    }
    
    private void drawPanorama(final int llllllllllllIlllllIIIIlIIlIllIIl, final int llllllllllllIlllllIIIIlIIlIllIII, final float llllllllllllIlllllIIIIlIIlIIlIll) {
        final Tessellator llllllllllllIlllllIIIIlIIlIlIllI = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllllIIIIlIIlIlIlIl = llllllllllllIlllllIIIIlIIlIlIllI.getWorldRenderer();
        GlStateManager.matrixMode(GuiMainMenu.lIlllIlIIllIII[43]);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        Project.gluPerspective(120.0f, 1.0f, 0.05f, 10.0f);
        GlStateManager.matrixMode(GuiMainMenu.lIlllIlIIllIII[44]);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.rotate(180.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(90.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.disableCull();
        GlStateManager.depthMask((boolean)(GuiMainMenu.lIlllIlIIllIII[0] != 0));
        GlStateManager.tryBlendFuncSeparate(GuiMainMenu.lIlllIlIIllIII[45], GuiMainMenu.lIlllIlIIllIII[46], GuiMainMenu.lIlllIlIIllIII[1], GuiMainMenu.lIlllIlIIllIII[0]);
        final int llllllllllllIlllllIIIIlIIlIlIlII = GuiMainMenu.lIlllIlIIllIII[8];
        int llllllllllllIlllllIIIIlIIlIlIIll = GuiMainMenu.lIlllIlIIllIII[0];
        "".length();
        if ("   ".length() == (145 + 23 - 30 + 54 ^ 46 + 60 + 18 + 72)) {
            return;
        }
        while (!lIIIIIlIlIlIlIlI(llllllllllllIlllllIIIIlIIlIlIIll, llllllllllllIlllllIIIIlIIlIlIlII * llllllllllllIlllllIIIIlIIlIlIlII)) {
            GlStateManager.pushMatrix();
            final float llllllllllllIlllllIIIIlIIlIlIIlI = (llllllllllllIlllllIIIIlIIlIlIIll % llllllllllllIlllllIIIIlIIlIlIlII / (float)llllllllllllIlllllIIIIlIIlIlIlII - 0.5f) / 64.0f;
            final float llllllllllllIlllllIIIIlIIlIlIIIl = (llllllllllllIlllllIIIIlIIlIlIIll / llllllllllllIlllllIIIIlIIlIlIlII / (float)llllllllllllIlllllIIIIlIIlIlIlII - 0.5f) / 64.0f;
            final float llllllllllllIlllllIIIIlIIlIlIIII = 0.0f;
            GlStateManager.translate(llllllllllllIlllllIIIIlIIlIlIIlI, llllllllllllIlllllIIIIlIIlIlIIIl, llllllllllllIlllllIIIIlIIlIlIIII);
            GlStateManager.rotate(MathHelper.sin((this.panoramaTimer + llllllllllllIlllllIIIIlIIlIIlIll) / 400.0f) * 25.0f + 20.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(-(this.panoramaTimer + llllllllllllIlllllIIIIlIIlIIlIll) * 0.1f, 0.0f, 1.0f, 0.0f);
            int llllllllllllIlllllIIIIlIIlIIllll = GuiMainMenu.lIlllIlIIllIII[0];
            "".length();
            if (((67 + 22 + 11 + 39 ^ 2 + 85 - 61 + 126) & (0x11 ^ 0x76 ^ (0x33 ^ 0x47) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIIIIlIlIlIlIlI(llllllllllllIlllllIIIIlIIlIIllll, GuiMainMenu.lIlllIlIIllIII[2])) {
                GlStateManager.pushMatrix();
                if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIIlIIllll, GuiMainMenu.lIlllIlIIllIII[1])) {
                    GlStateManager.rotate(90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIIlIIllll, GuiMainMenu.lIlllIlIIllIII[3])) {
                    GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
                }
                if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIIlIIllll, GuiMainMenu.lIlllIlIIllIII[4])) {
                    GlStateManager.rotate(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIIlIIllll, GuiMainMenu.lIlllIlIIllIII[5])) {
                    GlStateManager.rotate(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIIlIIllll, GuiMainMenu.lIlllIlIIllIII[6])) {
                    GlStateManager.rotate(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                this.mc.getTextureManager().bindTexture(GuiMainMenu.titlePanoramaPaths[llllllllllllIlllllIIIIlIIlIIllll]);
                llllllllllllIlllllIIIIlIIlIlIlIl.begin(GuiMainMenu.lIlllIlIIllIII[7], DefaultVertexFormats.POSITION_TEX_COLOR);
                final int llllllllllllIlllllIIIIlIIlIIlllI = GuiMainMenu.lIlllIlIIllIII[47] / (llllllllllllIlllllIIIIlIIlIlIIll + GuiMainMenu.lIlllIlIIllIII[1]);
                final float llllllllllllIlllllIIIIlIIlIIllIl = 0.0f;
                llllllllllllIlllllIIIIlIIlIlIlIl.pos(-1.0, -1.0, 1.0).tex(0.0, 0.0).color(GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], llllllllllllIlllllIIIIlIIlIIlllI).endVertex();
                llllllllllllIlllllIIIIlIIlIlIlIl.pos(1.0, -1.0, 1.0).tex(1.0, 0.0).color(GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], llllllllllllIlllllIIIIlIIlIIlllI).endVertex();
                llllllllllllIlllllIIIIlIIlIlIlIl.pos(1.0, 1.0, 1.0).tex(1.0, 1.0).color(GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], llllllllllllIlllllIIIIlIIlIIlllI).endVertex();
                llllllllllllIlllllIIIIlIIlIlIlIl.pos(-1.0, 1.0, 1.0).tex(0.0, 1.0).color(GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], GuiMainMenu.lIlllIlIIllIII[47], llllllllllllIlllllIIIIlIIlIIlllI).endVertex();
                llllllllllllIlllllIIIIlIIlIlIllI.draw();
                GlStateManager.popMatrix();
                ++llllllllllllIlllllIIIIlIIlIIllll;
            }
            GlStateManager.popMatrix();
            GlStateManager.colorMask((boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[0] != 0));
            ++llllllllllllIlllllIIIIlIIlIlIIll;
        }
        llllllllllllIlllllIIIIlIIlIlIlIl.setTranslation(0.0, 0.0, 0.0);
        GlStateManager.colorMask((boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0), (boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0));
        GlStateManager.matrixMode(GuiMainMenu.lIlllIlIIllIII[43]);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(GuiMainMenu.lIlllIlIIllIII[44]);
        GlStateManager.popMatrix();
        GlStateManager.depthMask((boolean)(GuiMainMenu.lIlllIlIIllIII[1] != 0));
        GlStateManager.enableCull();
        GlStateManager.enableDepth();
    }
    
    private static boolean lIIIIIlIlIlIlIIl(final int llllllllllllIlllllIIIIIllIIIIIll) {
        return llllllllllllIlllllIIIIIllIIIIIll != 0;
    }
    
    @Override
    public void updateScreen() {
        this.panoramaTimer += GuiMainMenu.lIlllIlIIllIII[1];
    }
    
    private static boolean lIIIIIlIlIlIlIlI(final int llllllllllllIlllllIIIIIllIIlIllI, final int llllllllllllIlllllIIIIIllIIlIlIl) {
        return llllllllllllIlllllIIIIIllIIlIllI >= llllllllllllIlllllIIIIIllIIlIlIl;
    }
    
    private static boolean lIIIIIlIlIlIlllI(final int llllllllllllIlllllIIIIIlIlllllIl) {
        return llllllllllllIlllllIIIIIlIlllllIl > 0;
    }
    
    private static String lIIIIIlIIIIllIII(final String llllllllllllIlllllIIIIIlllIIIlll, final String llllllllllllIlllllIIIIIlllIIIllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIIlllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), GuiMainMenu.lIlllIlIIllIII[8]), "DES");
            final Cipher llllllllllllIlllllIIIIIlllIIlIIl = Cipher.getInstance("DES");
            llllllllllllIlllllIIIIIlllIIlIIl.init(GuiMainMenu.lIlllIlIIllIII[3], llllllllllllIlllllIIIIIlllIIlIlI);
            return new String(llllllllllllIlllllIIIIIlllIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIIlllIIlIII) {
            llllllllllllIlllllIIIIIlllIIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllllIIIIlIlIIIIIIl) throws IOException {
        if (lIIIIIlIlIlIIlII(llllllllllllIlllllIIIIlIlIIIIIIl.id)) {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        }
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIIIIIIl.id, GuiMainMenu.lIlllIlIIllIII[6])) {
            this.mc.displayGuiScreen(new GuiLanguage(this, this.mc.gameSettings, this.mc.getLanguageManager()));
        }
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIIIIIIl.id, GuiMainMenu.lIlllIlIIllIII[1])) {
            this.mc.displayGuiScreen(new GuiSelectWorld(this));
        }
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIIIIIIl.id, GuiMainMenu.lIlllIlIIllIII[3])) {
            this.mc.displayGuiScreen(new GuiMultiplayer(this));
        }
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIIIIIIl.id, GuiMainMenu.lIlllIlIIllIII[15]) && lIIIIIlIlIlIlIIl(this.realmsButton.visible ? 1 : 0)) {
            this.switchToRealms();
        }
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIIIIIIl.id, GuiMainMenu.lIlllIlIIllIII[5])) {
            this.mc.shutdown();
        }
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIIIIIIl.id, GuiMainMenu.lIlllIlIIllIII[11])) {
            this.mc.launchIntegratedServer(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[36]], GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[37]], DemoWorldServer.demoWorldSettings);
        }
        if (lIIIIIlIlIlIlIII(llllllllllllIlllllIIIIlIlIIIIIIl.id, GuiMainMenu.lIlllIlIIllIII[13])) {
            final ISaveFormat llllllllllllIlllllIIIIlIlIIIIlIl = this.mc.getSaveLoader();
            final WorldInfo llllllllllllIlllllIIIIlIlIIIIlII = llllllllllllIlllllIIIIlIlIIIIlIl.getWorldInfo(GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[38]]);
            if (lIIIIIlIlIlIIlll(llllllllllllIlllllIIIIlIlIIIIlII)) {
                final GuiYesNo llllllllllllIlllllIIIIlIlIIIIIll = GuiSelectWorld.func_152129_a(this, llllllllllllIlllllIIIIlIlIIIIlII.getWorldName(), GuiMainMenu.lIlllIlIIllIII[13]);
                this.mc.displayGuiScreen(llllllllllllIlllllIIIIlIlIIIIIll);
            }
        }
    }
    
    private static boolean lIIIIIlIlIlIIllI(final int llllllllllllIlllllIIIIIlIllllIlI, final int llllllllllllIlllllIIIIIlIllllIIl) {
        return llllllllllllIlllllIIIIIlIllllIlI != llllllllllllIlllllIIIIIlIllllIIl;
    }
    
    public GuiMainMenu() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   net/minecraft/client/gui/GuiScreen.<init>:()V
        //     4: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //     5: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //     8: iconst_1       
        //     9: iaload         
        //    10: putfield        net/minecraft/client/gui/GuiMainMenu.field_175375_v:Z
        //    13: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //    14: new             Ljava/lang/Object;
        //    17: dup            
        //    18: invokespecial   java/lang/Object.<init>:()V
        //    21: putfield        net/minecraft/client/gui/GuiMainMenu.threadLock:Ljava/lang/Object;
        //    24: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //    25: getstatic       net/minecraft/client/gui/GuiMainMenu.field_96138_a:Ljava/lang/String;
        //    28: putfield        net/minecraft/client/gui/GuiMainMenu.openGLWarning2:Ljava/lang/String;
        //    31: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //    32: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIIlllIIII:[Ljava/lang/String;
        //    35: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //    38: bipush          11
        //    40: iaload         
        //    41: aaload         
        //    42: putfield        net/minecraft/client/gui/GuiMainMenu.splashText:Ljava/lang/String;
        //    45: aconst_null    
        //    46: astore_1        /* llllllllllllIlllllIIIIlIllIIIllI */
        //    47: invokestatic    com/google/common/collect/Lists.newArrayList:()Ljava/util/ArrayList;
        //    50: astore_2        /* llllllllllllIlllllIIIIlIllIIIIII */
        //    51: new             Ljava/io/BufferedReader;
        //    54: dup            
        //    55: new             Ljava/io/InputStreamReader;
        //    58: dup            
        //    59: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //    62: invokevirtual   net/minecraft/client/Minecraft.getResourceManager:()Lnet/minecraft/client/resources/IResourceManager;
        //    65: getstatic       net/minecraft/client/gui/GuiMainMenu.splashTexts:Lnet/minecraft/util/ResourceLocation;
        //    68: invokeinterface net/minecraft/client/resources/IResourceManager.getResource:(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;
        //    73: invokeinterface net/minecraft/client/resources/IResource.getInputStream:()Ljava/io/InputStream;
        //    78: getstatic       org/apache/commons/io/Charsets.UTF_8:Ljava/nio/charset/Charset;
        //    81: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    84: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    87: astore_1        /* llllllllllllIlllllIIIIlIllIIIllI */
        //    88: ldc             ""
        //    90: invokevirtual   java/lang/String.length:()I
        //    93: pop            
        //    94: ldc_w           " "
        //    97: invokevirtual   java/lang/String.length:()I
        //   100: ifne            133
        //   103: aconst_null    
        //   104: athrow         
        //   105: aload_3         /* llllllllllllIlllllIIIIlIllIIIlII */
        //   106: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   109: astore_3        /* llllllllllllIlllllIIIIlIllIIIlII */
        //   110: aload_3         /* llllllllllllIlllllIIIIlIllIIIlII */
        //   111: invokevirtual   java/lang/String.isEmpty:()Z
        //   114: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlII:(I)Z
        //   117: ifeq            133
        //   120: aload_2         /* llllllllllllIlllllIIIIlIllIIIlIl */
        //   121: aload_3         /* llllllllllllIlllllIIIIlIllIIIlII */
        //   122: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   127: ldc             ""
        //   129: invokevirtual   java/lang/String.length:()I
        //   132: pop2           
        //   133: aload_1         /* llllllllllllIlllllIIIIlIllIIIllI */
        //   134: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   137: dup            
        //   138: astore_3        /* llllllllllllIlllllIIIIlIllIIIIll */
        //   139: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlIl:(Ljava/lang/Object;)Z
        //   142: ifeq            105
        //   145: aload_2         /* llllllllllllIlllllIIIIlIllIIIlIl */
        //   146: invokeinterface java/util/List.isEmpty:()Z
        //   151: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlII:(I)Z
        //   154: ifeq            332
        //   157: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //   158: aload_2         /* llllllllllllIlllllIIIIlIllIIIlIl */
        //   159: getstatic       net/minecraft/client/gui/GuiMainMenu.RANDOM:Ljava/util/Random;
        //   162: aload_2         /* llllllllllllIlllllIIIIlIllIIIlIl */
        //   163: invokeinterface java/util/List.size:()I
        //   168: invokevirtual   java/util/Random.nextInt:(I)I
        //   171: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   176: checkcast       Ljava/lang/String;
        //   179: putfield        net/minecraft/client/gui/GuiMainMenu.splashText:Ljava/lang/String;
        //   182: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //   183: getfield        net/minecraft/client/gui/GuiMainMenu.splashText:Ljava/lang/String;
        //   186: invokevirtual   java/lang/String.hashCode:()I
        //   189: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //   192: bipush          12
        //   194: iaload         
        //   195: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIllI:(II)Z
        //   198: ifeq            157
        //   201: ldc             ""
        //   203: invokevirtual   java/lang/String.length:()I
        //   206: pop            
        //   207: ldc             "  "
        //   209: invokevirtual   java/lang/String.length:()I
        //   212: ineg           
        //   213: ifle            332
        //   216: aconst_null    
        //   217: athrow         
        //   218: astore_2        /* llllllllllllIlllllIIIIlIllIIIIII */
        //   219: aload_1         /* llllllllllllIlllllIIIIlIllIIIllI */
        //   220: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlll:(Ljava/lang/Object;)Z
        //   223: ifeq            363
        //   226: aload_1         /* llllllllllllIlllllIIIIlIllIIIllI */
        //   227: invokevirtual   java/io/BufferedReader.close:()V
        //   230: ldc             ""
        //   232: invokevirtual   java/lang/String.length:()I
        //   235: pop            
        //   236: ldc             "  "
        //   238: invokevirtual   java/lang/String.length:()I
        //   241: ldc_w           " "
        //   244: invokevirtual   java/lang/String.length:()I
        //   247: ineg           
        //   248: if_icmpgt       363
        //   251: aconst_null    
        //   252: athrow         
        //   253: astore          llllllllllllIlllllIIIIlIlIllllIl
        //   255: ldc             ""
        //   257: invokevirtual   java/lang/String.length:()I
        //   260: pop            
        //   261: bipush          122
        //   263: bipush          97
        //   265: iadd           
        //   266: sipush          128
        //   269: isub           
        //   270: bipush          90
        //   272: iadd           
        //   273: bipush          68
        //   275: bipush          75
        //   277: iadd           
        //   278: bipush          57
        //   280: isub           
        //   281: bipush          91
        //   283: iadd           
        //   284: ixor           
        //   285: ineg           
        //   286: iflt            363
        //   289: aconst_null    
        //   290: athrow         
        //   291: astore          llllllllllllIlllllIIIIlIlIlllllI
        //   293: aload_1         /* llllllllllllIlllllIIIIlIllIIIllI */
        //   294: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlll:(Ljava/lang/Object;)Z
        //   297: ifeq            329
        //   300: aload_1         /* llllllllllllIlllllIIIIlIllIIIllI */
        //   301: invokevirtual   java/io/BufferedReader.close:()V
        //   304: ldc             ""
        //   306: invokevirtual   java/lang/String.length:()I
        //   309: pop            
        //   310: ldc_w           " "
        //   313: invokevirtual   java/lang/String.length:()I
        //   316: ldc_w           "   "
        //   319: invokevirtual   java/lang/String.length:()I
        //   322: if_icmpne       329
        //   325: aconst_null    
        //   326: athrow         
        //   327: astore          llllllllllllIlllllIIIIlIlIllllIl
        //   329: aload           llllllllllllIlllllIIIIlIlIlllllI
        //   331: athrow         
        //   332: aload_1         /* llllllllllllIlllllIIIIlIllIIIllI */
        //   333: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlll:(Ljava/lang/Object;)Z
        //   336: ifeq            363
        //   339: aload_1         /* llllllllllllIlllllIIIIlIllIIIllI */
        //   340: invokevirtual   java/io/BufferedReader.close:()V
        //   343: ldc             ""
        //   345: invokevirtual   java/lang/String.length:()I
        //   348: pop            
        //   349: ldc_w           " "
        //   352: invokevirtual   java/lang/String.length:()I
        //   355: ineg           
        //   356: iflt            363
        //   359: aconst_null    
        //   360: athrow         
        //   361: astore          llllllllllllIlllllIIIIlIlIllllIl
        //   363: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //   364: getstatic       net/minecraft/client/gui/GuiMainMenu.RANDOM:Ljava/util/Random;
        //   367: invokevirtual   java/util/Random.nextFloat:()F
        //   370: putfield        net/minecraft/client/gui/GuiMainMenu.updateCounter:F
        //   373: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //   374: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIIlllIIII:[Ljava/lang/String;
        //   377: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //   380: bipush          13
        //   382: iaload         
        //   383: aaload         
        //   384: putfield        net/minecraft/client/gui/GuiMainMenu.openGLWarning1:Ljava/lang/String;
        //   387: invokestatic    org/lwjgl/opengl/GLContext.getCapabilities:()Lorg/lwjgl/opengl/ContextCapabilities;
        //   390: getfield        org/lwjgl/opengl/ContextCapabilities.OpenGL20:Z
        //   393: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlII:(I)Z
        //   396: ifeq            472
        //   399: invokestatic    net/minecraft/client/renderer/OpenGlHelper.areShadersSupported:()Z
        //   402: invokestatic    net/minecraft/client/gui/GuiMainMenu.lIIIIIlIlIlIIlII:(I)Z
        //   405: ifeq            472
        //   408: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //   409: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIIlllIIII:[Ljava/lang/String;
        //   412: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //   415: bipush          14
        //   417: iaload         
        //   418: aaload         
        //   419: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //   422: iconst_0       
        //   423: iaload         
        //   424: anewarray       Ljava/lang/Object;
        //   427: invokestatic    net/minecraft/client/resources/I18n.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   430: putfield        net/minecraft/client/gui/GuiMainMenu.openGLWarning1:Ljava/lang/String;
        //   433: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //   434: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIIlllIIII:[Ljava/lang/String;
        //   437: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //   440: bipush          15
        //   442: iaload         
        //   443: aaload         
        //   444: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //   447: iconst_0       
        //   448: iaload         
        //   449: anewarray       Ljava/lang/Object;
        //   452: invokestatic    net/minecraft/client/resources/I18n.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   455: putfield        net/minecraft/client/gui/GuiMainMenu.openGLWarning2:Ljava/lang/String;
        //   458: aload_0         /* llllllllllllIlllllIIIIlIllIIIIlI */
        //   459: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIIlllIIII:[Ljava/lang/String;
        //   462: getstatic       net/minecraft/client/gui/GuiMainMenu.lIlllIlIIllIII:[I
        //   465: bipush          16
        //   467: iaload         
        //   468: aaload         
        //   469: putfield        net/minecraft/client/gui/GuiMainMenu.openGLWarningLink:Ljava/lang/String;
        //   472: return         
        //    StackMapTable: 00 0C FF 00 69 00 04 07 00 02 07 03 D5 07 04 2F 07 00 6E 00 00 FA 00 1B FC 00 17 07 00 6E FF 00 3C 00 02 07 00 02 07 03 D5 00 01 07 01 76 FF 00 22 00 03 07 00 02 07 03 D5 07 01 76 00 01 07 01 76 FF 00 25 00 02 07 00 02 07 03 D5 00 01 07 00 E1 FF 00 23 00 05 07 00 02 07 03 D5 00 00 07 00 E1 00 01 07 01 76 01 FF 00 02 00 04 07 00 02 07 03 D5 07 04 2F 07 00 6E 00 00 5C 07 01 76 FF 00 01 00 03 07 00 02 07 03 D5 07 00 8F 00 00 FB 00 6C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  47     201    218    291    Ljava/io/IOException;
        //  226    230    253    291    Ljava/io/IOException;
        //  47     219    291    332    Any
        //  300    304    327    329    Ljava/io/IOException;
        //  339    343    361    363    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void switchToRealms() {
        final RealmsBridge llllllllllllIlllllIIIIlIIllllIlI = new RealmsBridge();
        llllllllllllIlllllIIIIlIIllllIlI.switchToRealms(this);
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return GuiMainMenu.lIlllIlIIllIII[0] != 0;
    }
    
    private static void lIIIIIlIIIllIIll() {
        (lIlllIIlllIIII = new String[GuiMainMenu.lIlllIlIIllIII[69]])[GuiMainMenu.lIlllIlIIllIII[0]] = lIIIIIlIIIIllIII("zRY9B238C7v9HaA53szFU+1oPCku9Rkm", "AAsjd");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[1]] = lIIIIIlIIIIllIIl("ES8MBjMXLwddIRAjWwYvESYRXSsMJBERNAQsAFw2Cy0=", "eJtrF");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[3]] = lIIIIIlIIIIllIIl("HwcRIgUZBxp5Fx4LRiIZHw4MeRIKAQIxAgQXBzJfGwMHOQIKDwgJQEUSBzE=", "kbiVp");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[4]] = lIIIIIlIIIIllIII("/uWkGW1GU0Ogw7K5+3tdIXppNZfTwVhiarYI9TwIcBbwXcjo/x3QSPkVV1w1KGaF", "ZGIvf");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[5]] = lIIIIIlIIIIllIII("CpWeNjDUXEQpE2/5vlM2aAfpLnM/XjlAJ2UGCDCXYIS27SkuYUQgHcR/nAia55yv", "aOsoj");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[6]] = lIIIIIlIIIIllIIl("Ejc3GAcUNzxDFRM7YBgbEj4qQxAHMSQLAAknIQhdFjMhAwAHPy4zQUgiIQs=", "fROlr");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[2]] = lIIIIIlIIIIllIII("81PxhY9rKpgiG3IXjVawZ/nPFCahu3wHLckieKmQ9K+2ekxYpa1W2C40PsgAE5UJ", "lHxgp");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[7]] = lIIIIIlIIIIllIIl("EgQuFToUBCVOKBMIeRUmEg0zTi0HAj0GPQkUOAVgFgA4Dj0HDDc+ekgROAY=", "faVaO");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[8]] = lIIIIIlIIIIllIlI("XphbOf4xIhhiVhj+UCUkAg==", "zjgnd");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[9]] = lIIIIIlIIIIllIII("0dv849rL+as=", "XJmjE");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[10]] = lIIIIIlIIIIllIIl("YwQNJk8uDRAxTyoMBDsdLgMWPQAtTA==", "CbbTo");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[11]] = lIIIIIlIIIIllIII("NjoDlUPOpxAbyL08dOoZyQ==", "QnGqZ");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[13]] = lIIIIIlIIIIllIII("2KAd/muwEQE=", "twuQQ");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[14]] = lIIIIIlIIIIllIII("c0crxfEtuJ5l+A9rCkNvyQ==", "KnLRS");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[15]] = lIIIIIlIIIIllIIl("GgsVAylADQ0LKwJQ", "nbaoL");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[16]] = lIIIIIlIIIIllIII("4RsXRrz9w5uPnfXw/6qT7d/tshZxIoTiDUQOXMOuGIzGkYgtNjGPdcIJ5beDPqsxbk8D+SDD1tl9RK7EIKld0xFU85M7kmb8", "GJZwx");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[18]] = lIIIIIlIIIIllIIl("LCMrGx08LT0eHg==", "NBHpz");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[20]] = lIIIIIlIIIIllIII("7YMXQtGmSWh4ah/n6Au4tg==", "aeeYz");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[21]] = lIIIIIlIIIIllIlI("SCZEGL9/+/8TQp/azN1EUA==", "SDyDt");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[23]] = lIIIIIlIIIIllIIl("JScGAyYlJyYDJgUHSEwaGgcGBzBL", "jhilI");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[28]] = lIIIIIlIIIIllIIl("DCQFEmEOMR8OIA8y", "aAkgO");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[29]] = lIIIIIlIIIIllIIl("DiYlHWUSNiIc", "cCKhK");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[31]] = lIIIIIlIIIIllIIl("NSMfLEkrLx8+Cz02HTgePTQ=", "XFqYg");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[32]] = lIIIIIlIIIIllIIl("AzQUPHwDJBY9Ox49GzA3HA==", "nQzIR");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[19]] = lIIIIIlIIIIllIIl("PQwrI30/Byk/PTU=", "PiEVS");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[33]] = lIIIIIlIIIIllIII("6ZBQA9TUkTyc7y4XARhLxQ==", "LJACS");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[34]] = lIIIIIlIIIIllIlI("Ydqnv3sySVY6xgavCR8DEw==", "WcInq");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[35]] = lIIIIIlIIIIllIlI("/MFnDGg/r+7tJgkeaV+gPA==", "tSAnE");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[36]] = lIIIIIlIIIIllIIl("Nj8JLhwlNRYtJw==", "rZdAC");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[37]] = lIIIIIlIIIIllIlI("SEa9x9w8k2EHGalG8jL73A==", "tuPYi");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[38]] = lIIIIIlIIIIllIlI("/Ea/9hFLvYvSBUsG7e3csQ==", "iOFME");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[22]] = lIIIIIlIIIIllIII("CgxvLXkMZfb/KflblNrSxg==", "BWLnC");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[39]] = lIIIIIlIIIIllIlI("6qozDVY386Yy1Vc9VgGq/kzEesZX7SrH", "NUDQA");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[40]] = lIIIIIlIIIIllIIl("MxYbJhwnGBsNCQ==", "Tsoby");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[41]] = lIIIIIlIIIIllIlI("BE0MQ0DPN6c=", "ajcJU");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[42]] = lIIIIIlIIIIllIIl("NQAFHTIYSARROQYKHlE6HwEb", "vopqV");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[64]] = lIIIIIlIIIIllIlI("kL/DxMUm5cZz+FoDO22BFA==", "IHZUD");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[65]] = lIIIIIlIIIIllIIl("TwMNHyc=", "oGhrH");
        GuiMainMenu.lIlllIIlllIIII[GuiMainMenu.lIlllIlIIllIII[67]] = lIIIIIlIIIIllIII("SVRJV3pzlJ+hl9sO+5tsozNSfqsqHabJO+3xSRMFmnIcKcuJGMeQ2w==", "caoUI");
    }
    
    private static boolean lIIIIIlIlIlIlIII(final int llllllllllllIlllllIIIIIllIIllIlI, final int llllllllllllIlllllIIIIIllIIllIIl) {
        return llllllllllllIlllllIIIIIllIIllIlI == llllllllllllIlllllIIIIIllIIllIIl;
    }
    
    private static boolean lIIIIIlIlIlIIlIl(final Object llllllllllllIlllllIIIIIllIIIIlIl) {
        return llllllllllllIlllllIIIIIllIIIIlIl == null;
    }
}
