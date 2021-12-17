// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.audio.SoundCategory;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.settings.GameSettings;

public class GuiScreenOptionsSounds extends GuiScreen
{
    protected /* synthetic */ String field_146507_a;
    private static final /* synthetic */ int[] llIlIlIllIIlIl;
    private static final /* synthetic */ String[] llIlIlIllIIlII;
    private final /* synthetic */ GuiScreen field_146505_f;
    private /* synthetic */ String field_146508_h;
    private final /* synthetic */ GameSettings game_settings_4;
    
    private static void lIIlIlIIlIIIlIlI() {
        (llIlIlIllIIlIl = new int[17])[0] = ((0x66 ^ 0x36) & ~(0xFC ^ 0xAC));
        GuiScreenOptionsSounds.llIlIlIllIIlIl[1] = " ".length();
        GuiScreenOptionsSounds.llIlIlIllIIlIl[2] = "  ".length();
        GuiScreenOptionsSounds.llIlIlIllIIlIl[3] = (0x74 ^ 0x3) + (0x1A ^ 0x2F) - (0x99 ^ 0x8A) + "  ".length();
        GuiScreenOptionsSounds.llIlIlIllIIlIl[4] = 14 + 0 - 10 + 145 + (20 + 66 - 20 + 85) - (0xFFFFCB65 & 0x35BA) + (5 + 141 - 19 + 21);
        GuiScreenOptionsSounds.llIlIlIllIIlIl[5] = (0x1C ^ 0x1A);
        GuiScreenOptionsSounds.llIlIlIllIIlIl[6] = (0x1E ^ 0x17 ^ (0x7F ^ 0x7A));
        GuiScreenOptionsSounds.llIlIlIllIIlIl[7] = (0xD1 ^ 0x90 ^ (0x2D ^ 0x74));
        GuiScreenOptionsSounds.llIlIlIllIIlIl[8] = 46 + 17 - 5 + 98 + (93 + 126 - 119 + 80) - (0xFFFF9DB9 & 0x6377) + (92 + 44 + 27 + 6);
        GuiScreenOptionsSounds.llIlIlIllIIlIl[9] = (0x22 ^ 0x46);
        GuiScreenOptionsSounds.llIlIlIllIIlIl[10] = (0x2D ^ 0x23) + "   ".length() - -(0xDB ^ 0xB9) + (0xB3 ^ 0x86);
        GuiScreenOptionsSounds.llIlIlIllIIlIl[11] = "   ".length();
        GuiScreenOptionsSounds.llIlIlIllIIlIl[12] = (109 + 60 - 63 + 54 ^ 25 + 39 + 91 + 20);
        GuiScreenOptionsSounds.llIlIlIllIIlIl[13] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiScreenOptionsSounds.llIlIlIllIIlIl[14] = (0xB3 ^ 0x9B ^ (0x42 ^ 0x6E));
        GuiScreenOptionsSounds.llIlIlIllIIlIl[15] = (0x6 ^ 0x3);
        GuiScreenOptionsSounds.llIlIlIllIIlIl[16] = (0x89 ^ 0x81);
    }
    
    private static void lIIlIlIIlIIIlIIl() {
        (llIlIlIllIIlII = new String[GuiScreenOptionsSounds.llIlIlIllIIlIl[15]])[GuiScreenOptionsSounds.llIlIlIllIIlIl[0]] = lIIlIlIIlIIIIllI("4GerX+xuzYM=", "AlCQi");
        GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[1]] = lIIlIlIIlIIIIlll("2be1u4WFosrujaqBW8P75XFvjMVqGLk+", "QjqBS");
        GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[2]] = lIIlIlIIlIIIlIII("JjcAOTonNFo/My8=", "IGtPU");
        GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[11]] = lIIlIlIIlIIIIlll("nf6Xlk7KR3va0Luvj1Slfw==", "JgOlt");
        GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[14]] = lIIlIlIIlIIIlIII("Rw==", "bQmiV");
    }
    
    private static boolean lIIlIlIIlIIIlIll(final Object llllllllllllIllIlIlIIIlIlllIIllI, final Object llllllllllllIllIlIlIIIlIlllIIlIl) {
        return llllllllllllIllIlIlIIIlIlllIIllI != llllllllllllIllIlIlIIIlIlllIIlIl;
    }
    
    public GuiScreenOptionsSounds(final GuiScreen llllllllllllIllIlIlIIIllIlIlIlll, final GameSettings llllllllllllIllIlIlIIIllIlIlIllI) {
        this.field_146507_a = GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[0]];
        this.field_146505_f = llllllllllllIllIlIlIIIllIlIlIlll;
        this.game_settings_4 = llllllllllllIllIlIlIIIllIlIlIllI;
    }
    
    private static boolean lIIlIlIIlIIlIIII(final int llllllllllllIllIlIlIIIlIlllIIIIl) {
        return llllllllllllIllIlIlIIIlIlllIIIIl == 0;
    }
    
    private static String lIIlIlIIlIIIIllI(final String llllllllllllIllIlIlIIIllIIIlllll, final String llllllllllllIllIlIlIIIllIIIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIIllIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIllIIIlllII.getBytes(StandardCharsets.UTF_8)), GuiScreenOptionsSounds.llIlIlIllIIlIl[16]), "DES");
            final Cipher llllllllllllIllIlIlIIIllIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllIllIlIlIIIllIIlIIIIl.init(GuiScreenOptionsSounds.llIlIlIllIIlIl[2], llllllllllllIllIlIlIIIllIIlIIIlI);
            return new String(llllllllllllIllIlIlIIIllIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIIllIIlIIIII) {
            llllllllllllIllIlIlIIIllIIlIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIIlIIIlllI(final int llllllllllllIllIlIlIIIlIllllIIlI, final int llllllllllllIllIlIlIIIlIllllIIIl) {
        return llllllllllllIllIlIlIIIlIllllIIlI == llllllllllllIllIlIlIIIlIllllIIIl;
    }
    
    private static boolean lIIlIlIIlIIlIIIl(final int llllllllllllIllIlIlIIIlIlllIlIlI, final int llllllllllllIllIlIlIIIlIlllIlIIl) {
        return llllllllllllIllIlIlIIIlIlllIlIlI < llllllllllllIllIlIlIIIlIlllIlIIl;
    }
    
    private static String lIIlIlIIlIIIIlll(final String llllllllllllIllIlIlIIIllIIIlIIII, final String llllllllllllIllIlIlIIIllIIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIIllIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIIIllIIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIIIllIIIlIlII.init(GuiScreenOptionsSounds.llIlIlIllIIlIl[2], llllllllllllIllIlIlIIIllIIIlIlIl);
            return new String(llllllllllllIllIlIlIIIllIIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIIllIIIlIIll) {
            llllllllllllIllIlIlIIIllIIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static int lIIlIlIIlIIIllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIlIlIIlIIIllII(final int llllllllllllIllIlIlIIIlIlllIlllI, final int llllllllllllIllIlIlIIIlIlllIllIl) {
        return llllllllllllIllIlIlIIIlIlllIlllI >= llllllllllllIllIlIlIIIlIlllIllIl;
    }
    
    private static boolean lIIlIlIIlIIIllIl(final int llllllllllllIllIlIlIIIlIlllIIIll) {
        return llllllllllllIllIlIlIIIlIlllIIIll != 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIlIlIIIllIIlllllI) throws IOException {
        if (lIIlIlIIlIIIllIl(llllllllllllIllIlIlIIIllIIlllllI.enabled ? 1 : 0) && lIIlIlIIlIIIlllI(llllllllllllIllIlIlIIIllIIlllllI.id, GuiScreenOptionsSounds.llIlIlIllIIlIl[8])) {
            this.mc.gameSettings.saveOptions();
            this.mc.displayGuiScreen(this.field_146505_f);
        }
    }
    
    protected String getSoundVolume(final SoundCategory llllllllllllIllIlIlIIIllIIlIllIl) {
        final float llllllllllllIllIlIlIIIllIIlIllII = this.game_settings_4.getSoundLevel(llllllllllllIllIlIlIIIllIIlIllIl);
        String s;
        if (lIIlIlIIlIIlIIII(lIIlIlIIlIIIllll(llllllllllllIllIlIlIIIllIIlIllII, 0.0f))) {
            s = this.field_146508_h;
            "".length();
            if (-" ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            s = String.valueOf(new StringBuilder(String.valueOf((int)(llllllllllllIllIlIlIIIllIIlIllII * 100.0f))).append(GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[14]]));
        }
        return s;
    }
    
    @Override
    public void initGui() {
        int llllllllllllIllIlIlIIIllIlIIlIll = GuiScreenOptionsSounds.llIlIlIllIIlIl[0];
        this.field_146507_a = I18n.format(GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[1]], new Object[GuiScreenOptionsSounds.llIlIlIllIIlIl[0]]);
        this.field_146508_h = I18n.format(GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[2]], new Object[GuiScreenOptionsSounds.llIlIlIllIIlIl[0]]);
        this.buttonList.add(new Button(SoundCategory.MASTER.getCategoryId(), this.width / GuiScreenOptionsSounds.llIlIlIllIIlIl[2] - GuiScreenOptionsSounds.llIlIlIllIIlIl[3] + llllllllllllIllIlIlIIIllIlIIlIll % GuiScreenOptionsSounds.llIlIlIllIIlIl[2] * GuiScreenOptionsSounds.llIlIlIllIIlIl[4], this.height / GuiScreenOptionsSounds.llIlIlIllIIlIl[5] - GuiScreenOptionsSounds.llIlIlIllIIlIl[6] + GuiScreenOptionsSounds.llIlIlIllIIlIl[7] * (llllllllllllIllIlIlIIIllIlIIlIll >> GuiScreenOptionsSounds.llIlIlIllIIlIl[1]), SoundCategory.MASTER, (boolean)(GuiScreenOptionsSounds.llIlIlIllIIlIl[1] != 0)));
        "".length();
        llllllllllllIllIlIlIIIllIlIIlIll += 2;
        final float llllllllllllIllIlIlIIIllIlIIIlII;
        final long llllllllllllIllIlIlIIIllIlIIIlIl = ((SoundCategory[])(Object)(llllllllllllIllIlIlIIIllIlIIIlII = (float)(Object)SoundCategory.values())).length;
        char llllllllllllIllIlIlIIIllIlIIIllI = (char)GuiScreenOptionsSounds.llIlIlIllIIlIl[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIlIIlIIIllII(llllllllllllIllIlIlIIIllIlIIIllI, (int)llllllllllllIllIlIlIIIllIlIIIlIl)) {
            final SoundCategory llllllllllllIllIlIlIIIllIlIIlIlI = llllllllllllIllIlIlIIIllIlIIIlII[llllllllllllIllIlIlIIIllIlIIIllI];
            if (lIIlIlIIlIIIlIll(llllllllllllIllIlIlIIIllIlIIlIlI, SoundCategory.MASTER)) {
                this.buttonList.add(new Button(llllllllllllIllIlIlIIIllIlIIlIlI.getCategoryId(), this.width / GuiScreenOptionsSounds.llIlIlIllIIlIl[2] - GuiScreenOptionsSounds.llIlIlIllIIlIl[3] + llllllllllllIllIlIlIIIllIlIIlIll % GuiScreenOptionsSounds.llIlIlIllIIlIl[2] * GuiScreenOptionsSounds.llIlIlIllIIlIl[4], this.height / GuiScreenOptionsSounds.llIlIlIllIIlIl[5] - GuiScreenOptionsSounds.llIlIlIllIIlIl[6] + GuiScreenOptionsSounds.llIlIlIllIIlIl[7] * (llllllllllllIllIlIlIIIllIlIIlIll >> GuiScreenOptionsSounds.llIlIlIllIIlIl[1]), llllllllllllIllIlIlIIIllIlIIlIlI, (boolean)(GuiScreenOptionsSounds.llIlIlIllIIlIl[0] != 0)));
                "".length();
                ++llllllllllllIllIlIlIIIllIlIIlIll;
            }
            ++llllllllllllIllIlIlIIIllIlIIIllI;
        }
        this.buttonList.add(new GuiButton(GuiScreenOptionsSounds.llIlIlIllIIlIl[8], this.width / GuiScreenOptionsSounds.llIlIlIllIIlIl[2] - GuiScreenOptionsSounds.llIlIlIllIIlIl[9], this.height / GuiScreenOptionsSounds.llIlIlIllIIlIl[5] + GuiScreenOptionsSounds.llIlIlIllIIlIl[10], I18n.format(GuiScreenOptionsSounds.llIlIlIllIIlII[GuiScreenOptionsSounds.llIlIlIllIIlIl[11]], new Object[GuiScreenOptionsSounds.llIlIlIllIIlIl[0]])));
        "".length();
    }
    
    private static String lIIlIlIIlIIIlIII(String llllllllllllIllIlIlIIIlIllllllIl, final String llllllllllllIllIlIlIIIlIllllllII) {
        llllllllllllIllIlIlIIIlIllllllIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIIIlIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIIllIIIIIIII = new StringBuilder();
        final char[] llllllllllllIllIlIlIIIlIllllllll = llllllllllllIllIlIlIIIlIllllllII.toCharArray();
        int llllllllllllIllIlIlIIIlIlllllllI = GuiScreenOptionsSounds.llIlIlIllIIlIl[0];
        final float llllllllllllIllIlIlIIIlIlllllIII = (Object)llllllllllllIllIlIlIIIlIllllllIl.toCharArray();
        final char llllllllllllIllIlIlIIIlIllllIlll = (char)llllllllllllIllIlIlIIIlIlllllIII.length;
        float llllllllllllIllIlIlIIIlIllllIllI = GuiScreenOptionsSounds.llIlIlIllIIlIl[0];
        while (lIIlIlIIlIIlIIIl((int)llllllllllllIllIlIlIIIlIllllIllI, llllllllllllIllIlIlIIIlIllllIlll)) {
            final char llllllllllllIllIlIlIIIllIIIIIIll = llllllllllllIllIlIlIIIlIlllllIII[llllllllllllIllIlIlIIIlIllllIllI];
            llllllllllllIllIlIlIIIllIIIIIIII.append((char)(llllllllllllIllIlIlIIIllIIIIIIll ^ llllllllllllIllIlIlIIIlIllllllll[llllllllllllIllIlIlIIIlIlllllllI % llllllllllllIllIlIlIIIlIllllllll.length]));
            "".length();
            ++llllllllllllIllIlIlIIIlIlllllllI;
            ++llllllllllllIllIlIlIIIlIllllIllI;
            "".length();
            if ((0x94 ^ 0x91) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIIllIIIIIIII);
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIlIlIIIllIIlllIII, final int llllllllllllIllIlIlIIIllIIllIlll, final float llllllllllllIllIlIlIIIllIIllIIlI) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.field_146507_a, this.width / GuiScreenOptionsSounds.llIlIlIllIIlIl[2], GuiScreenOptionsSounds.llIlIlIllIIlIl[12], GuiScreenOptionsSounds.llIlIlIllIIlIl[13]);
        super.drawScreen(llllllllllllIllIlIlIIIllIIlllIII, llllllllllllIllIlIlIIIllIIllIlll, llllllllllllIllIlIlIIIllIIllIIlI);
    }
    
    static {
        lIIlIlIIlIIIlIlI();
        lIIlIlIIlIIIlIIl();
    }
    
    class Button extends GuiButton
    {
        private final /* synthetic */ String field_146152_s;
        public /* synthetic */ float field_146156_o;
        private static final /* synthetic */ String[] lIIlIlllIIlllI;
        public /* synthetic */ boolean field_146155_p;
        private final /* synthetic */ SoundCategory field_146153_r;
        private static final /* synthetic */ int[] lIIlIlllIlIIII;
        
        private static boolean llIlIIlllllllII(final int lllllllllllllIIllIIIIIllIlIIlIIl) {
            return lllllllllllllIIllIIIIIllIlIIlIIl != 0;
        }
        
        static {
            llIlIIllllllIll();
            llIlIIlllllIllI();
        }
        
        @Override
        protected void mouseDragged(final Minecraft lllllllllllllIIllIIIIIlllIIIIIll, final int lllllllllllllIIllIIIIIllIllllllI, final int lllllllllllllIIllIIIIIlllIIIIIIl) {
            if (llIlIIlllllllII(this.visible ? 1 : 0)) {
                if (llIlIIlllllllII(this.field_146155_p ? 1 : 0)) {
                    this.field_146156_o = (lllllllllllllIIllIIIIIllIllllllI - (this.xPosition + Button.lIIlIlllIlIIII[6])) / (float)(this.width - Button.lIIlIlllIlIIII[7]);
                    this.field_146156_o = MathHelper.clamp_float(this.field_146156_o, 0.0f, 1.0f);
                    lllllllllllllIIllIIIIIlllIIIIIll.gameSettings.setSoundLevel(this.field_146153_r, this.field_146156_o);
                    lllllllllllllIIllIIIIIlllIIIIIll.gameSettings.saveOptions();
                    this.displayString = String.valueOf(new StringBuilder(String.valueOf(this.field_146152_s)).append(Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[8]]).append(GuiScreenOptionsSounds.this.getSoundVolume(this.field_146153_r)));
                }
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                this.drawTexturedModalRect(this.xPosition + (int)(this.field_146156_o * (this.width - Button.lIIlIlllIlIIII[7])), this.yPosition, Button.lIIlIlllIlIIII[3], Button.lIIlIlllIlIIII[9], Button.lIIlIlllIlIIII[6], Button.lIIlIlllIlIIII[2]);
                this.drawTexturedModalRect(this.xPosition + (int)(this.field_146156_o * (this.width - Button.lIIlIlllIlIIII[7])) + Button.lIIlIlllIlIIII[6], this.yPosition, Button.lIIlIlllIlIIII[10], Button.lIIlIlllIlIIII[9], Button.lIIlIlllIlIIII[6], Button.lIIlIlllIlIIII[2]);
            }
        }
        
        @Override
        public void playPressSound(final SoundHandler lllllllllllllIIllIIIIIllIlllIIII) {
        }
        
        private static String llIlIIlllllIlII(final String lllllllllllllIIllIIIIIllIlIlllll, final String lllllllllllllIIllIIIIIllIlIllllI) {
            try {
                final SecretKeySpec lllllllllllllIIllIIIIIllIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIllIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIIIIIllIllIIIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIIIIIllIllIIIll.init(Button.lIIlIlllIlIIII[5], lllllllllllllIIllIIIIIllIllIIlII);
                return new String(lllllllllllllIIllIIIIIllIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIIIIllIllIIIlI) {
                lllllllllllllIIllIIIIIllIllIIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void llIlIIllllllIll() {
            (lIIlIlllIlIIII = new int[13])[0] = (0xFFFFE5BE & 0x1B77);
            Button.lIIlIlllIlIIII[1] = 119 + 7 - 122 + 146;
            Button.lIIlIlllIlIIII[2] = (0x31 ^ 0x3A ^ (0x67 ^ 0x78));
            Button.lIIlIlllIlIIII[3] = ((0x40 ^ 0x63 ^ (0x9C ^ 0xA2)) & (0xA ^ 0x39 ^ (0x52 ^ 0x7C) ^ -" ".length()));
            Button.lIIlIlllIlIIII[4] = " ".length();
            Button.lIIlIlllIlIIII[5] = "  ".length();
            Button.lIIlIlllIlIIII[6] = (0x22 ^ 0x26);
            Button.lIIlIlllIlIIII[7] = (0xB ^ 0x3);
            Button.lIIlIlllIlIIII[8] = "   ".length();
            Button.lIIlIlllIlIIII[9] = (0x2 ^ 0x40);
            Button.lIIlIlllIlIIII[10] = 34 + 86 - 77 + 153;
            Button.lIIlIlllIlIIII[11] = (0xCE ^ 0x84 ^ (0x67 ^ 0x28));
            Button.lIIlIlllIlIIII[12] = (0x2D ^ 0x73 ^ (0xE0 ^ 0xB8));
        }
        
        @Override
        public void mouseReleased(final int lllllllllllllIIllIIIIIllIllIllII, final int lllllllllllllIIllIIIIIllIllIlIll) {
            if (llIlIIlllllllII(this.field_146155_p ? 1 : 0)) {
                if (llIlIIlllllllIl(this.field_146153_r, SoundCategory.MASTER)) {
                    final short lllllllllllllIIllIIIIIllIllIlIIl = (short)1.0f;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    GuiScreenOptionsSounds.this.game_settings_4.getSoundLevel(this.field_146153_r);
                    "".length();
                }
                GuiScreenOptionsSounds.this.mc.getSoundHandler().playSound(PositionedSoundRecord.create(new ResourceLocation(Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[11]]), 1.0f));
            }
            this.field_146155_p = (Button.lIIlIlllIlIIII[3] != 0);
        }
        
        @Override
        public boolean mousePressed(final Minecraft lllllllllllllIIllIIIIIllIlllIlII, final int lllllllllllllIIllIIIIIllIlllIlll, final int lllllllllllllIIllIIIIIllIlllIllI) {
            if (llIlIIlllllllII(super.mousePressed(lllllllllllllIIllIIIIIllIlllIlII, lllllllllllllIIllIIIIIllIlllIlll, lllllllllllllIIllIIIIIllIlllIllI) ? 1 : 0)) {
                this.field_146156_o = (lllllllllllllIIllIIIIIllIlllIlll - (this.xPosition + Button.lIIlIlllIlIIII[6])) / (float)(this.width - Button.lIIlIlllIlIIII[7]);
                this.field_146156_o = MathHelper.clamp_float(this.field_146156_o, 0.0f, 1.0f);
                lllllllllllllIIllIIIIIllIlllIlII.gameSettings.setSoundLevel(this.field_146153_r, this.field_146156_o);
                lllllllllllllIIllIIIIIllIlllIlII.gameSettings.saveOptions();
                this.displayString = String.valueOf(new StringBuilder(String.valueOf(this.field_146152_s)).append(Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[6]]).append(GuiScreenOptionsSounds.this.getSoundVolume(this.field_146153_r)));
                this.field_146155_p = (Button.lIIlIlllIlIIII[4] != 0);
                return Button.lIIlIlllIlIIII[4] != 0;
            }
            return Button.lIIlIlllIlIIII[3] != 0;
        }
        
        private static void llIlIIlllllIllI() {
            (lIIlIlllIIlllI = new String[Button.lIIlIlllIlIIII[12]])[Button.lIIlIlllIlIIII[3]] = llIlIIlllllIlII("7JQMSh2G9Dk=", "IUwUI");
            Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[4]] = llIlIIlllllIlII("YqB1cH1Dx3dwwgmqFm0rPQ==", "aEltY");
            Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[5]] = llIlIIlllllIlIl("EG5dhTPlvOg=", "wVpBz");
            Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[8]] = llIlIIlllllIlIl("JsvNZJQk+OE=", "reEHG");
            Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[6]] = llIlIIlllllIlIl("9eLTSocIgT8=", "fSSHO");
            Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[11]] = llIlIIlllllIlII("rr+BBsd7iH16//1RyIMuE4ipSsMhqU+W", "SRNSB");
        }
        
        private static boolean llIlIIlllllllIl(final Object lllllllllllllIIllIIIIIllIlIIllII, final Object lllllllllllllIIllIIIIIllIlIIlIll) {
            return lllllllllllllIIllIIIIIllIlIIllII == lllllllllllllIIllIIIIIllIlIIlIll;
        }
        
        public Button(final int lllllllllllllIIllIIIIIlllIIIlllI, final int lllllllllllllIIllIIIIIlllIIlIlII, final int lllllllllllllIIllIIIIIlllIIlIIll, final SoundCategory lllllllllllllIIllIIIIIlllIIIlIll, final boolean lllllllllllllIIllIIIIIlllIIIlIlI) {
            int llllllllllllIlllIIIIIlIlIIIlIlIl;
            if (llIlIIlllllllII(lllllllllllllIIllIIIIIlllIIIlIlI ? 1 : 0)) {
                llllllllllllIlllIIIIIlIlIIIlIlIl = Button.lIIlIlllIlIIII[0];
                "".length();
                if (-(16 + 70 + 42 + 57 ^ 43 + 148 - 129 + 127) > 0) {
                    throw null;
                }
            }
            else {
                llllllllllllIlllIIIIIlIlIIIlIlIl = Button.lIIlIlllIlIIII[1];
            }
            super(lllllllllllllIIllIIIIIlllIIIlllI, lllllllllllllIIllIIIIIlllIIlIlII, lllllllllllllIIllIIIIIlllIIlIIll, llllllllllllIlllIIIIIlIlIIIlIlIl, Button.lIIlIlllIlIIII[2], Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[3]]);
            this.field_146156_o = 1.0f;
            this.field_146153_r = lllllllllllllIIllIIIIIlllIIIlIll;
            this.field_146152_s = I18n.format(String.valueOf(new StringBuilder(Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[4]]).append(lllllllllllllIIllIIIIIlllIIIlIll.getCategoryName())), new Object[Button.lIIlIlllIlIIII[3]]);
            this.displayString = String.valueOf(new StringBuilder(String.valueOf(this.field_146152_s)).append(Button.lIIlIlllIIlllI[Button.lIIlIlllIlIIII[5]]).append(GuiScreenOptionsSounds.this.getSoundVolume(lllllllllllllIIllIIIIIlllIIIlIll)));
            this.field_146156_o = GuiScreenOptionsSounds.this.game_settings_4.getSoundLevel(lllllllllllllIIllIIIIIlllIIIlIll);
        }
        
        @Override
        protected int getHoverState(final boolean lllllllllllllIIllIIIIIlllIIIlIII) {
            return Button.lIIlIlllIlIIII[3];
        }
        
        private static String llIlIIlllllIlIl(final String lllllllllllllIIllIIIIIllIlIlIlII, final String lllllllllllllIIllIIIIIllIlIlIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIllIIIIIllIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), Button.lIIlIlllIlIIII[7]), "DES");
                final Cipher lllllllllllllIIllIIIIIllIlIlIllI = Cipher.getInstance("DES");
                lllllllllllllIIllIIIIIllIlIlIllI.init(Button.lIIlIlllIlIIII[5], lllllllllllllIIllIIIIIllIlIlIlll);
                return new String(lllllllllllllIIllIIIIIllIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIllIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIIIIllIlIlIlIl) {
                lllllllllllllIIllIIIIIllIlIlIlIl.printStackTrace();
                return null;
            }
        }
    }
}
