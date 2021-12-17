// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.Language;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.resources.I18n;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.LanguageManager;
import net.minecraft.client.settings.GameSettings;

public class GuiLanguage extends GuiScreen
{
    protected /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ String[] lIlIllIllIIIIl;
    private /* synthetic */ List list;
    private static final /* synthetic */ int[] lIlIllIllIlIll;
    private final /* synthetic */ GameSettings game_settings_3;
    private final /* synthetic */ LanguageManager languageManager;
    private /* synthetic */ GuiOptionButton confirmSettingsBtn;
    private /* synthetic */ GuiOptionButton forceUnicodeFontBtn;
    
    private static void llllIIlIIIIIIll() {
        (lIlIllIllIlIll = new int[17])[0] = (0x3A ^ 0x5E);
        GuiLanguage.lIlIllIllIlIll[1] = "  ".length();
        GuiLanguage.lIlIllIllIlIll[2] = 143 + 130 - 191 + 73;
        GuiLanguage.lIlIllIllIlIll[3] = (0xB0 ^ 0x83 ^ (0xD2 ^ 0xC7));
        GuiLanguage.lIlIllIllIlIll[4] = (0xC1 ^ 0xC7);
        GuiLanguage.lIlIllIllIlIll[5] = 156 + 48 - 82 + 38;
        GuiLanguage.lIlIllIllIlIll[6] = ((0x41 ^ 0x5A) & ~(0x9E ^ 0x85));
        GuiLanguage.lIlIllIllIlIll[7] = (0x9E ^ 0x99);
        GuiLanguage.lIlIllIllIlIll[8] = ("  ".length() ^ (0x26 ^ 0x2C));
        GuiLanguage.lIlIllIllIlIll[9] = " ".length();
        GuiLanguage.lIlIllIllIlIll[10] = (0x6D ^ 0x7D);
        GuiLanguage.lIlIllIllIlIll[11] = (-1 & 0xFFFFFF);
        GuiLanguage.lIlIllIllIlIll[12] = "   ".length();
        GuiLanguage.lIlIllIllIlIll[13] = (2 + 118 - 0 + 76 ^ 65 + 89 + 16 + 22);
        GuiLanguage.lIlIllIllIlIll[14] = (0x84 ^ 0xAA ^ (0x6A ^ 0x7C));
        GuiLanguage.lIlIllIllIlIll[15] = (-(0xFFFF8D4D & 0x7FBF) & (0xFFFFCDDD & 0x80BFAE));
        GuiLanguage.lIlIllIllIlIll[16] = (0xBA ^ 0xAF ^ (0x7F ^ 0x6F));
    }
    
    private static String llllIIIlllllIIl(final String lllllllllllllIIIIllIlIIIIlllllIl, final String lllllllllllllIIIIllIlIIIIllllllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIIIlIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIIIIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIlIIIlIIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIlIIIlIIIIIIl.init(GuiLanguage.lIlIllIllIlIll[1], lllllllllllllIIIIllIlIIIlIIIIIlI);
            return new String(lllllllllllllIIIIllIlIIIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIIIlIIIIIII) {
            lllllllllllllIIIIllIlIIIlIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIlIIIIIlIl(final int lllllllllllllIIIIllIlIIIIlIlllll, final int lllllllllllllIIIIllIlIIIIlIllllI) {
        return lllllllllllllIIIIllIlIIIIlIlllll < lllllllllllllIIIIllIlIIIIlIllllI;
    }
    
    private static String llllIIIllllIlll(String lllllllllllllIIIIllIlIIIIllIlIlI, final String lllllllllllllIIIIllIlIIIIllIlllI) {
        lllllllllllllIIIIllIlIIIIllIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIllIlIIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIlIIIIllIllIl = new StringBuilder();
        final char[] lllllllllllllIIIIllIlIIIIllIllII = lllllllllllllIIIIllIlIIIIllIlllI.toCharArray();
        int lllllllllllllIIIIllIlIIIIllIlIll = GuiLanguage.lIlIllIllIlIll[6];
        final short lllllllllllllIIIIllIlIIIIllIIlIl = (Object)lllllllllllllIIIIllIlIIIIllIlIlI.toCharArray();
        final Exception lllllllllllllIIIIllIlIIIIllIIlII = (Exception)lllllllllllllIIIIllIlIIIIllIIlIl.length;
        Exception lllllllllllllIIIIllIlIIIIllIIIll = (Exception)GuiLanguage.lIlIllIllIlIll[6];
        while (llllIIlIIIIIlIl((int)lllllllllllllIIIIllIlIIIIllIIIll, (int)lllllllllllllIIIIllIlIIIIllIIlII)) {
            final char lllllllllllllIIIIllIlIIIIlllIIII = lllllllllllllIIIIllIlIIIIllIIlIl[lllllllllllllIIIIllIlIIIIllIIIll];
            lllllllllllllIIIIllIlIIIIllIllIl.append((char)(lllllllllllllIIIIllIlIIIIlllIIII ^ lllllllllllllIIIIllIlIIIIllIllII[lllllllllllllIIIIllIlIIIIllIlIll % lllllllllllllIIIIllIlIIIIllIllII.length]));
            "".length();
            ++lllllllllllllIIIIllIlIIIIllIlIll;
            ++lllllllllllllIIIIllIlIIIIllIIIll;
            "".length();
            if ((0x46 ^ 0x42) != (0x93 ^ 0x97)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIlIIIIllIllIl);
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.list.handleMouseInput();
    }
    
    private static void llllIIIllllllIl() {
        (lIlIllIllIIIIl = new String[GuiLanguage.lIlIllIllIlIll[16]])[GuiLanguage.lIlIllIllIlIll[6]] = llllIIIllllIlll("NTwqZAA9JyY=", "RICJd");
        GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[9]] = llllIIIlllllIII("2MlO0mMAFM14fFbJtKrjVL04GxZc9trY", "lltdc");
        GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[1]] = llllIIIlllllIIl("98jyN5EsTQc=", "Lzqxf");
        GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[12]] = llllIIIllllIlll("PD4aHyw9PUAaIj0pGxckNhkPBC06IAk=", "SNnvC");
        GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[13]] = llllIIIlllllIII("SmHqX9ZB1F8=", "NANXc");
    }
    
    private static boolean llllIIlIIIIIlII(final int lllllllllllllIIIIllIlIIIIlIlllII) {
        return lllllllllllllIIIIllIlIIIIlIlllII != 0;
    }
    
    @Override
    public void initGui() {
        final java.util.List<GuiButton> buttonList = this.buttonList;
        final GuiOptionButton forceUnicodeFontBtn = new GuiOptionButton(GuiLanguage.lIlIllIllIlIll[0], this.width / GuiLanguage.lIlIllIllIlIll[1] - GuiLanguage.lIlIllIllIlIll[2], this.height - GuiLanguage.lIlIllIllIlIll[3], GameSettings.Options.FORCE_UNICODE_FONT, this.game_settings_3.getKeyBinding(GameSettings.Options.FORCE_UNICODE_FONT));
        this.forceUnicodeFontBtn = forceUnicodeFontBtn;
        buttonList.add(forceUnicodeFontBtn);
        "".length();
        final java.util.List<GuiButton> buttonList2 = this.buttonList;
        final GuiOptionButton confirmSettingsBtn = new GuiOptionButton(GuiLanguage.lIlIllIllIlIll[4], this.width / GuiLanguage.lIlIllIllIlIll[1] - GuiLanguage.lIlIllIllIlIll[2] + GuiLanguage.lIlIllIllIlIll[5], this.height - GuiLanguage.lIlIllIllIlIll[3], I18n.format(GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[6]], new Object[GuiLanguage.lIlIllIllIlIll[6]]));
        this.confirmSettingsBtn = confirmSettingsBtn;
        buttonList2.add(confirmSettingsBtn);
        "".length();
        this.list = new List(this.mc);
        this.list.registerScrollButtons(GuiLanguage.lIlIllIllIlIll[7], GuiLanguage.lIlIllIllIlIll[8]);
    }
    
    public GuiLanguage(final GuiScreen lllllllllllllIIIIllIlIIIllIIIIll, final GameSettings lllllllllllllIIIIllIlIIIlIlllllI, final LanguageManager lllllllllllllIIIIllIlIIIlIllllIl) {
        this.parentScreen = lllllllllllllIIIIllIlIIIllIIIIll;
        this.game_settings_3 = lllllllllllllIIIIllIlIIIlIlllllI;
        this.languageManager = lllllllllllllIIIIllIlIIIlIllllIl;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIIIllIlIIIlIlIIIlI, final int lllllllllllllIIIIllIlIIIlIIlllIl, final float lllllllllllllIIIIllIlIIIlIIlllII) {
        this.list.drawScreen(lllllllllllllIIIIllIlIIIlIlIIIlI, lllllllllllllIIIIllIlIIIlIIlllIl, lllllllllllllIIIIllIlIIIlIIlllII);
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[9]], new Object[GuiLanguage.lIlIllIllIlIll[6]]), this.width / GuiLanguage.lIlIllIllIlIll[1], GuiLanguage.lIlIllIllIlIll[10], GuiLanguage.lIlIllIllIlIll[11]);
        this.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[1]]).append(I18n.format(GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[12]], new Object[GuiLanguage.lIlIllIllIlIll[6]])).append(GuiLanguage.lIlIllIllIIIIl[GuiLanguage.lIlIllIllIlIll[13]])), this.width / GuiLanguage.lIlIllIllIlIll[1], this.height - GuiLanguage.lIlIllIllIlIll[14], GuiLanguage.lIlIllIllIlIll[15]);
        super.drawScreen(lllllllllllllIIIIllIlIIIlIlIIIlI, lllllllllllllIIIIllIlIIIlIIlllIl, lllllllllllllIIIIllIlIIIlIIlllII);
    }
    
    private static String llllIIIlllllIII(final String lllllllllllllIIIIllIlIIIlIIIllII, final String lllllllllllllIIIIllIlIIIlIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIIIlIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIIIlIIIlIll.getBytes(StandardCharsets.UTF_8)), GuiLanguage.lIlIllIllIlIll[8]), "DES");
            final Cipher lllllllllllllIIIIllIlIIIlIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIlIIIlIIIlllI.init(GuiLanguage.lIlIllIllIlIll[1], lllllllllllllIIIIllIlIIIlIIIllll);
            return new String(lllllllllllllIIIIllIlIIIlIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIIIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIIIlIIIllIl) {
            lllllllllllllIIIIllIlIIIlIIIllIl.printStackTrace();
            return null;
        }
    }
    
    static {
        llllIIlIIIIIIll();
        llllIIIllllllIl();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIIIllIlIIIlIllIIII) throws IOException {
        if (llllIIlIIIIIlII(lllllllllllllIIIIllIlIIIlIllIIII.enabled ? 1 : 0)) {
            switch (lllllllllllllIIIIllIlIIIlIllIIII.id) {
                case 5: {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 6: {
                    this.mc.displayGuiScreen(this.parentScreen);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                    break;
                }
                case 100: {
                    if (!llllIIlIIIIIlII((lllllllllllllIIIIllIlIIIlIllIIII instanceof GuiOptionButton) ? 1 : 0)) {
                        break;
                    }
                    this.game_settings_3.setOptionValue(((GuiOptionButton)lllllllllllllIIIIllIlIIIlIllIIII).returnEnumOptions(), GuiLanguage.lIlIllIllIlIll[9]);
                    lllllllllllllIIIIllIlIIIlIllIIII.displayString = this.game_settings_3.getKeyBinding(GameSettings.Options.FORCE_UNICODE_FONT);
                    final ScaledResolution lllllllllllllIIIIllIlIIIlIlIllll = new ScaledResolution(this.mc);
                    final int lllllllllllllIIIIllIlIIIlIlIlllI = lllllllllllllIIIIllIlIIIlIlIllll.getScaledWidth();
                    final int lllllllllllllIIIIllIlIIIlIlIllIl = lllllllllllllIIIIllIlIIIlIlIllll.getScaledHeight();
                    this.setWorldAndResolution(this.mc, lllllllllllllIIIIllIlIIIlIlIlllI, lllllllllllllIIIIllIlIIIlIlIllIl);
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                    break;
                }
                default: {
                    this.list.actionPerformed(lllllllllllllIIIIllIlIIIlIllIIII);
                    break;
                }
            }
        }
    }
    
    class List extends GuiSlot
    {
        private static final /* synthetic */ int[] lllIlIllIIIllI;
        private final /* synthetic */ Map<String, Language> languageMap;
        private final /* synthetic */ java.util.List<String> langCodeList;
        private static final /* synthetic */ String[] lllIlIllIIIlIl;
        
        private static boolean lIlIIIllIIllIIII(final int llllllllllllIlIllIlIlllIIIllIllI) {
            return llllllllllllIlIllIlIlllIIIllIllI == 0;
        }
        
        private static void lIlIIIllIIlIlllI() {
            (lllIlIllIIIlIl = new String[List.lllIlIllIIIllI[5]])[List.lllIlIllIIIllI[4]] = lIlIIIllIIlIllIl("QXb6IhI/Tu52m1Kgk0pIHA==", "DfQsv");
        }
        
        @Override
        protected boolean isSelected(final int llllllllllllIlIllIlIlllIIlIllIlI) {
            return this.langCodeList.get(llllllllllllIlIllIlIlllIIlIllIlI).equals(GuiLanguage.this.languageManager.getCurrentLanguage().getLanguageCode());
        }
        
        static {
            lIlIIIllIIlIllll();
            lIlIIIllIIlIlllI();
        }
        
        @Override
        protected void elementClicked(final int llllllllllllIlIllIlIlllIIlIlllll, final boolean llllllllllllIlIllIlIlllIIllIIlII, final int llllllllllllIlIllIlIlllIIllIIIll, final int llllllllllllIlIllIlIlllIIllIIIlI) {
            final Language llllllllllllIlIllIlIlllIIllIIIIl = this.languageMap.get(this.langCodeList.get(llllllllllllIlIllIlIlllIIlIlllll));
            GuiLanguage.this.languageManager.setCurrentLanguage(llllllllllllIlIllIlIlllIIllIIIIl);
            GuiLanguage.this.game_settings_3.language = llllllllllllIlIllIlIlllIIllIIIIl.getLanguageCode();
            this.mc.refreshResources();
            final FontRenderer fontRendererObj = GuiLanguage.this.fontRendererObj;
            int unicodeFlag;
            if (lIlIIIllIIllIIII(GuiLanguage.this.languageManager.isCurrentLocaleUnicode() ? 1 : 0) && lIlIIIllIIllIIII(GuiLanguage.this.game_settings_3.forceUnicodeFont ? 1 : 0)) {
                unicodeFlag = List.lllIlIllIIIllI[4];
                "".length();
                if (" ".length() <= ((0x4F ^ 0x77) & ~(0xAD ^ 0x95))) {
                    return;
                }
            }
            else {
                unicodeFlag = List.lllIlIllIIIllI[5];
            }
            fontRendererObj.setUnicodeFlag((boolean)(unicodeFlag != 0));
            GuiLanguage.this.fontRendererObj.setBidiFlag(GuiLanguage.this.languageManager.isCurrentLanguageBidirectional());
            GuiLanguage.this.confirmSettingsBtn.displayString = I18n.format(List.lllIlIllIIIlIl[List.lllIlIllIIIllI[4]], new Object[List.lllIlIllIIIllI[4]]);
            GuiLanguage.this.forceUnicodeFontBtn.displayString = GuiLanguage.this.game_settings_3.getKeyBinding(GameSettings.Options.FORCE_UNICODE_FONT);
            GuiLanguage.this.game_settings_3.saveOptions();
        }
        
        private static String lIlIIIllIIlIllIl(final String llllllllllllIlIllIlIlllIIIllllIl, final String llllllllllllIlIllIlIlllIIIlllIlI) {
            try {
                final SecretKeySpec llllllllllllIlIllIlIlllIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIlllIIIlllIlI.getBytes(StandardCharsets.UTF_8)), List.lllIlIllIIIllI[8]), "DES");
                final Cipher llllllllllllIlIllIlIlllIIIllllll = Cipher.getInstance("DES");
                llllllllllllIlIllIlIlllIIIllllll.init(List.lllIlIllIIIllI[6], llllllllllllIlIllIlIlllIIlIIIIII);
                return new String(llllllllllllIlIllIlIlllIIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIlllIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlIlllIIIlllllI) {
                llllllllllllIlIllIlIlllIIIlllllI.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected int getContentHeight() {
            return this.getSize() * List.lllIlIllIIIllI[3];
        }
        
        @Override
        protected void drawBackground() {
            GuiLanguage.this.drawDefaultBackground();
        }
        
        @Override
        protected int getSize() {
            return this.langCodeList.size();
        }
        
        @Override
        protected void drawSlot(final int llllllllllllIlIllIlIlllIIlIIIllI, final int llllllllllllIlIllIlIlllIIlIIllII, final int llllllllllllIlIllIlIlllIIlIIlIll, final int llllllllllllIlIllIlIlllIIlIIlIlI, final int llllllllllllIlIllIlIlllIIlIIlIIl, final int llllllllllllIlIllIlIlllIIlIIlIII) {
            GuiLanguage.this.fontRendererObj.setBidiFlag((boolean)(List.lllIlIllIIIllI[5] != 0));
            GuiLanguage.this.drawCenteredString(GuiLanguage.this.fontRendererObj, this.languageMap.get(this.langCodeList.get(llllllllllllIlIllIlIlllIIlIIIllI)).toString(), this.width / List.lllIlIllIIIllI[6], llllllllllllIlIllIlIlllIIlIIlIll + List.lllIlIllIIIllI[5], List.lllIlIllIIIllI[7]);
            GuiLanguage.this.fontRendererObj.setBidiFlag(GuiLanguage.this.languageManager.getCurrentLanguage().isBidirectional());
        }
        
        public List(final Minecraft llllllllllllIlIllIlIlllIIllIllll) {
            super(llllllllllllIlIllIlIlllIIllIllll, GuiLanguage.this.width, GuiLanguage.this.height, List.lllIlIllIIIllI[0], GuiLanguage.this.height - List.lllIlIllIIIllI[1] + List.lllIlIllIIIllI[2], List.lllIlIllIIIllI[3]);
            this.langCodeList = (java.util.List<String>)Lists.newArrayList();
            this.languageMap = (Map<String, Language>)Maps.newHashMap();
            final short llllllllllllIlIllIlIlllIIllIllIl = (short)GuiLanguage.this.languageManager.getLanguages().iterator();
            "".length();
            if (-"   ".length() >= 0) {
                throw null;
            }
            while (!lIlIIIllIIllIIII(((Iterator)llllllllllllIlIllIlIlllIIllIllIl).hasNext() ? 1 : 0)) {
                final Language llllllllllllIlIllIlIlllIIlllIIlI = ((Iterator<Language>)llllllllllllIlIllIlIlllIIllIllIl).next();
                this.languageMap.put(llllllllllllIlIllIlIlllIIlllIIlI.getLanguageCode(), llllllllllllIlIllIlIlllIIlllIIlI);
                "".length();
                this.langCodeList.add(llllllllllllIlIllIlIlllIIlllIIlI.getLanguageCode());
                "".length();
            }
        }
        
        private static void lIlIIIllIIlIllll() {
            (lllIlIllIIIllI = new int[9])[0] = (16 + 100 - 4 + 48 ^ 70 + 98 - 46 + 6);
            List.lllIlIllIIIllI[1] = (0xED ^ 0xAC);
            List.lllIlIllIIIllI[2] = (0x82 ^ 0x86);
            List.lllIlIllIIIllI[3] = (0x4D ^ 0x5F);
            List.lllIlIllIIIllI[4] = ((0xD2 ^ 0x94) & ~(0x55 ^ 0x13));
            List.lllIlIllIIIllI[5] = " ".length();
            List.lllIlIllIIIllI[6] = "  ".length();
            List.lllIlIllIIIllI[7] = (-1 & 0xFFFFFF);
            List.lllIlIllIIIllI[8] = (17 + 135 + 4 + 44 ^ 118 + 32 - 105 + 147);
        }
    }
}
