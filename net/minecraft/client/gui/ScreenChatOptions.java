// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.io.IOException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.settings.GameSettings;

public class ScreenChatOptions extends GuiScreen
{
    private final /* synthetic */ GameSettings game_settings;
    private final /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ String[] lIllIlIIlIlIII;
    private static final /* synthetic */ int[] lIllIlIIlIlIIl;
    private /* synthetic */ String field_146401_i;
    private static final /* synthetic */ GameSettings.Options[] field_146399_a;
    
    static {
        llllllIIlIIIIII();
        llllllIIIllllll();
        final GameSettings.Options[] field_146399_a2 = new GameSettings.Options[ScreenChatOptions.lIllIlIIlIlIIl[0]];
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[1]] = GameSettings.Options.CHAT_VISIBILITY;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[2]] = GameSettings.Options.CHAT_COLOR;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[3]] = GameSettings.Options.CHAT_LINKS;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[4]] = GameSettings.Options.CHAT_OPACITY;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[5]] = GameSettings.Options.CHAT_LINKS_PROMPT;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[6]] = GameSettings.Options.CHAT_SCALE;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[7]] = GameSettings.Options.CHAT_HEIGHT_FOCUSED;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[8]] = GameSettings.Options.CHAT_HEIGHT_UNFOCUSED;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[9]] = GameSettings.Options.CHAT_WIDTH;
        field_146399_a2[ScreenChatOptions.lIllIlIIlIlIIl[10]] = GameSettings.Options.REDUCED_DEBUG_INFO;
        field_146399_a = field_146399_a2;
    }
    
    private static void llllllIIIllllll() {
        (lIllIlIIlIlIII = new String[ScreenChatOptions.lIllIlIIlIlIIl[3]])[ScreenChatOptions.lIllIlIIlIlIIl[1]] = llllllIIIllllIl("Ijk8AgojOmYIDSw9Zh8MOSUt", "MIHke");
        ScreenChatOptions.lIllIlIIlIlIII[ScreenChatOptions.lIllIlIIlIlIIl[2]] = llllllIIIlllllI("kJokCifqVOGjHFSUwZIgEQ==", "GTwQP");
    }
    
    private static String llllllIIIllllIl(String lllllllllllllIIIIIIIIlIlllIlllII, final String lllllllllllllIIIIIIIIlIlllIllIll) {
        lllllllllllllIIIIIIIIlIlllIlllII = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIIIlIlllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIIlIlllIlllll = new StringBuilder();
        final char[] lllllllllllllIIIIIIIIlIlllIllllI = lllllllllllllIIIIIIIIlIlllIllIll.toCharArray();
        int lllllllllllllIIIIIIIIlIlllIlllIl = ScreenChatOptions.lIllIlIIlIlIIl[1];
        final byte lllllllllllllIIIIIIIIlIlllIlIlll = (Object)lllllllllllllIIIIIIIIlIlllIlllII.toCharArray();
        final Exception lllllllllllllIIIIIIIIlIlllIlIllI = (Exception)lllllllllllllIIIIIIIIlIlllIlIlll.length;
        byte lllllllllllllIIIIIIIIlIlllIlIlIl = (byte)ScreenChatOptions.lIllIlIIlIlIIl[1];
        while (llllllIIlIIIIll(lllllllllllllIIIIIIIIlIlllIlIlIl, (int)lllllllllllllIIIIIIIIlIlllIlIllI)) {
            final char lllllllllllllIIIIIIIIlIllllIIIlI = lllllllllllllIIIIIIIIlIlllIlIlll[lllllllllllllIIIIIIIIlIlllIlIlIl];
            lllllllllllllIIIIIIIIlIlllIlllll.append((char)(lllllllllllllIIIIIIIIlIllllIIIlI ^ lllllllllllllIIIIIIIIlIlllIllllI[lllllllllllllIIIIIIIIlIlllIlllIl % lllllllllllllIIIIIIIIlIlllIllllI.length]));
            "".length();
            ++lllllllllllllIIIIIIIIlIlllIlllIl;
            ++lllllllllllllIIIIIIIIlIlllIlIlIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIIlIlllIlllll);
    }
    
    private static boolean llllllIIlIIIIll(final int lllllllllllllIIIIIIIIlIlllIIlIIl, final int lllllllllllllIIIIIIIIlIlllIIlIII) {
        return lllllllllllllIIIIIIIIlIlllIIlIIl < lllllllllllllIIIIIIIIlIlllIIlIII;
    }
    
    private static void llllllIIlIIIIII() {
        (lIllIlIIlIlIIl = new int[19])[0] = (0x90 ^ 0x9A);
        ScreenChatOptions.lIllIlIIlIlIIl[1] = ((0x75 ^ 0x8 ^ (0xFC ^ 0x9F)) & (0x18 ^ 0x61 ^ (0x5C ^ 0x3B) ^ -" ".length()));
        ScreenChatOptions.lIllIlIIlIlIIl[2] = " ".length();
        ScreenChatOptions.lIllIlIIlIlIIl[3] = "  ".length();
        ScreenChatOptions.lIllIlIIlIlIIl[4] = "   ".length();
        ScreenChatOptions.lIllIlIIlIlIIl[5] = (0x55 ^ 0x51);
        ScreenChatOptions.lIllIlIIlIlIIl[6] = (0x9E ^ 0x9B);
        ScreenChatOptions.lIllIlIIlIlIIl[7] = (0x72 ^ 0x74);
        ScreenChatOptions.lIllIlIIlIlIIl[8] = (125 + 125 - 158 + 80 ^ 133 + 11 - 51 + 78);
        ScreenChatOptions.lIllIlIIlIlIIl[9] = (0xB4 ^ 0xAD ^ (0xD0 ^ 0xC1));
        ScreenChatOptions.lIllIlIIlIlIIl[10] = (0x20 ^ 0x29);
        ScreenChatOptions.lIllIlIIlIlIIl[11] = 44 + 116 - 135 + 125 + (8 + 50 - 38 + 107) - (143 + 52 - 94 + 119) + (0x5A ^ 0x38);
        ScreenChatOptions.lIllIlIIlIlIIl[12] = (0xF2 ^ 0xC5) + (3 + 120 - 27 + 51) - (0x5 ^ 0x4A) + (0x39 ^ 0x1C);
        ScreenChatOptions.lIllIlIIlIlIIl[13] = (0xC1 ^ 0x8F ^ (0x4F ^ 0x19));
        ScreenChatOptions.lIllIlIIlIlIIl[14] = 80 + 77 - 114 + 157;
        ScreenChatOptions.lIllIlIIlIlIIl[15] = (0x58 ^ 0x3C);
        ScreenChatOptions.lIllIlIIlIlIIl[16] = (0xD9 ^ 0xA1);
        ScreenChatOptions.lIllIlIIlIlIIl[17] = (63 + 126 - 188 + 164 ^ 139 + 97 - 134 + 75);
        ScreenChatOptions.lIllIlIIlIlIIl[18] = (-1 & 0xFFFFFF);
    }
    
    private static boolean llllllIIlIIIIIl(final int lllllllllllllIIIIIIIIlIlllIIIllI) {
        return lllllllllllllIIIIIIIIlIlllIIIllI != 0;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIIIIIIIlIllllllIll, final int lllllllllllllIIIIIIIIlIllllllllI, final float lllllllllllllIIIIIIIIlIlllllllIl) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.field_146401_i, this.width / ScreenChatOptions.lIllIlIIlIlIIl[3], ScreenChatOptions.lIllIlIIlIlIIl[17], ScreenChatOptions.lIllIlIIlIlIIl[18]);
        super.drawScreen(lllllllllllllIIIIIIIIlIllllllIll, lllllllllllllIIIIIIIIlIllllllllI, lllllllllllllIIIIIIIIlIlllllllIl);
    }
    
    private static boolean llllllIIlIIIIlI(final int lllllllllllllIIIIIIIIlIlllIIllIl, final int lllllllllllllIIIIIIIIlIlllIIllII) {
        return lllllllllllllIIIIIIIIlIlllIIllIl >= lllllllllllllIIIIIIIIlIlllIIllII;
    }
    
    private static boolean llllllIIlIIIlII(final int lllllllllllllIIIIIIIIlIlllIlIIIl, final int lllllllllllllIIIIIIIIlIlllIlIIII) {
        return lllllllllllllIIIIIIIIlIlllIlIIIl == lllllllllllllIIIIIIIIlIlllIlIIII;
    }
    
    @Override
    public void initGui() {
        int lllllllllllllIIIIIIIIllIIIIlIIlI = ScreenChatOptions.lIllIlIIlIlIIl[1];
        this.field_146401_i = I18n.format(ScreenChatOptions.lIllIlIIlIlIII[ScreenChatOptions.lIllIlIIlIlIIl[1]], new Object[ScreenChatOptions.lIllIlIIlIlIIl[1]]);
        final double lllllllllllllIIIIIIIIllIIIIIlIll;
        final int lllllllllllllIIIIIIIIllIIIIIllII = ((GameSettings.Options[])(Object)(lllllllllllllIIIIIIIIllIIIIIlIll = (double)(Object)ScreenChatOptions.field_146399_a)).length;
        long lllllllllllllIIIIIIIIllIIIIIllIl = ScreenChatOptions.lIllIlIIlIlIIl[1];
        "".length();
        if (((0x82 ^ 0xB3 ^ (0xB8 ^ 0x98)) & (0xEB ^ 0x9B ^ (0x2C ^ 0x4D) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llllllIIlIIIIlI((int)lllllllllllllIIIIIIIIllIIIIIllIl, lllllllllllllIIIIIIIIllIIIIIllII)) {
            final GameSettings.Options lllllllllllllIIIIIIIIllIIIIlIIIl = lllllllllllllIIIIIIIIllIIIIIlIll[lllllllllllllIIIIIIIIllIIIIIllIl];
            if (llllllIIlIIIIIl(lllllllllllllIIIIIIIIllIIIIlIIIl.getEnumFloat() ? 1 : 0)) {
                this.buttonList.add(new GuiOptionSlider(lllllllllllllIIIIIIIIllIIIIlIIIl.returnEnumOrdinal(), this.width / ScreenChatOptions.lIllIlIIlIlIIl[3] - ScreenChatOptions.lIllIlIIlIlIIl[11] + lllllllllllllIIIIIIIIllIIIIlIIlI % ScreenChatOptions.lIllIlIIlIlIIl[3] * ScreenChatOptions.lIllIlIIlIlIIl[12], this.height / ScreenChatOptions.lIllIlIIlIlIIl[7] + ScreenChatOptions.lIllIlIIlIlIIl[13] * (lllllllllllllIIIIIIIIllIIIIlIIlI >> ScreenChatOptions.lIllIlIIlIlIIl[2]), lllllllllllllIIIIIIIIllIIIIlIIIl));
                "".length();
                "".length();
                if ("  ".length() <= ((48 + 10 + 43 + 113 ^ 74 + 108 - 154 + 118) & (0x78 ^ 0x3 ^ (0xA8 ^ 0x97) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                this.buttonList.add(new GuiOptionButton(lllllllllllllIIIIIIIIllIIIIlIIIl.returnEnumOrdinal(), this.width / ScreenChatOptions.lIllIlIIlIlIIl[3] - ScreenChatOptions.lIllIlIIlIlIIl[11] + lllllllllllllIIIIIIIIllIIIIlIIlI % ScreenChatOptions.lIllIlIIlIlIIl[3] * ScreenChatOptions.lIllIlIIlIlIIl[12], this.height / ScreenChatOptions.lIllIlIIlIlIIl[7] + ScreenChatOptions.lIllIlIIlIlIIl[13] * (lllllllllllllIIIIIIIIllIIIIlIIlI >> ScreenChatOptions.lIllIlIIlIlIIl[2]), lllllllllllllIIIIIIIIllIIIIlIIIl, this.game_settings.getKeyBinding(lllllllllllllIIIIIIIIllIIIIlIIIl)));
                "".length();
            }
            ++lllllllllllllIIIIIIIIllIIIIlIIlI;
            ++lllllllllllllIIIIIIIIllIIIIIllIl;
        }
        this.buttonList.add(new GuiButton(ScreenChatOptions.lIllIlIIlIlIIl[14], this.width / ScreenChatOptions.lIllIlIIlIlIIl[3] - ScreenChatOptions.lIllIlIIlIlIIl[15], this.height / ScreenChatOptions.lIllIlIIlIlIIl[7] + ScreenChatOptions.lIllIlIIlIlIIl[16], I18n.format(ScreenChatOptions.lIllIlIIlIlIII[ScreenChatOptions.lIllIlIIlIlIIl[2]], new Object[ScreenChatOptions.lIllIlIIlIlIIl[1]])));
        "".length();
    }
    
    private static String llllllIIIlllllI(final String lllllllllllllIIIIIIIIlIllllIllll, final String lllllllllllllIIIIIIIIlIlllllIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIlIlllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIlIlllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIlIlllllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIlIlllllIIll.init(ScreenChatOptions.lIllIlIIlIlIIl[3], lllllllllllllIIIIIIIIlIlllllIlII);
            return new String(lllllllllllllIIIIIIIIlIlllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIlIllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIlIlllllIIlI) {
            lllllllllllllIIIIIIIIlIlllllIIlI.printStackTrace();
            return null;
        }
    }
    
    public ScreenChatOptions(final GuiScreen lllllllllllllIIIIIIIIllIIIIllIll, final GameSettings lllllllllllllIIIIIIIIllIIIIlllIl) {
        this.parentScreen = lllllllllllllIIIIIIIIllIIIIllIll;
        this.game_settings = lllllllllllllIIIIIIIIllIIIIlllIl;
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIIIIIIIllIIIIIIlIl) throws IOException {
        if (llllllIIlIIIIIl(lllllllllllllIIIIIIIIllIIIIIIlIl.enabled ? 1 : 0)) {
            if (llllllIIlIIIIll(lllllllllllllIIIIIIIIllIIIIIIlIl.id, ScreenChatOptions.lIllIlIIlIlIIl[15]) && llllllIIlIIIIIl((lllllllllllllIIIIIIIIllIIIIIIlIl instanceof GuiOptionButton) ? 1 : 0)) {
                this.game_settings.setOptionValue(((GuiOptionButton)lllllllllllllIIIIIIIIllIIIIIIlIl).returnEnumOptions(), ScreenChatOptions.lIllIlIIlIlIIl[2]);
                lllllllllllllIIIIIIIIllIIIIIIlIl.displayString = this.game_settings.getKeyBinding(GameSettings.Options.getEnumOptions(lllllllllllllIIIIIIIIllIIIIIIlIl.id));
            }
            if (llllllIIlIIIlII(lllllllllllllIIIIIIIIllIIIIIIlIl.id, ScreenChatOptions.lIllIlIIlIlIIl[14])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(this.parentScreen);
            }
        }
    }
}
