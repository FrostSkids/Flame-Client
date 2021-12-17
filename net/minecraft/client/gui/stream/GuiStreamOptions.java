// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiOptionSlider;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.gui.GuiScreen;

public class GuiStreamOptions extends GuiScreen
{
    private static final /* synthetic */ GameSettings.Options[] field_152312_a;
    private /* synthetic */ int field_152314_s;
    private static final /* synthetic */ String[] llIIIllllIIllI;
    private final /* synthetic */ GameSettings field_152318_h;
    private static final /* synthetic */ GameSettings.Options[] field_152316_f;
    private /* synthetic */ String field_152313_r;
    private final /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ int[] llIIIllllIlIlI;
    private /* synthetic */ boolean field_152315_t;
    private /* synthetic */ String field_152319_i;
    
    private static boolean lIIIlIllIIlIllll(final int llllllllllllIlllIIllllIlIllIIIII, final int llllllllllllIlllIIllllIlIlIlllll) {
        return llllllllllllIlllIIllllIlIllIIIII >= llllllllllllIlllIIllllIlIlIlllll;
    }
    
    private static void lIIIlIllIIlIllIl() {
        (llIIIllllIlIlI = new int[19])[0] = (22 + 33 + 110 + 8 ^ 33 + 58 - 33 + 107);
        GuiStreamOptions.llIIIllllIlIlI[1] = ((0xF1 ^ 0x94 ^ (0xC5 ^ 0x89)) & (0x6B ^ 0xE ^ (0x35 ^ 0x79) ^ -" ".length()));
        GuiStreamOptions.llIIIllllIlIlI[2] = " ".length();
        GuiStreamOptions.llIIIllllIlIlI[3] = "  ".length();
        GuiStreamOptions.llIIIllllIlIlI[4] = "   ".length();
        GuiStreamOptions.llIIIllllIlIlI[5] = (0xA3 ^ 0xA7);
        GuiStreamOptions.llIIIllllIlIlI[6] = (0x4A ^ 0x61 ^ (0x54 ^ 0x7A));
        GuiStreamOptions.llIIIllllIlIlI[7] = (0x3C ^ 0x59 ^ (0x3F ^ 0x5C));
        GuiStreamOptions.llIIIllllIlIlI[8] = (0x2 ^ 0x5);
        GuiStreamOptions.llIIIllllIlIlI[9] = (0x9E ^ 0x83) + (0xF ^ 0x26) - (0xDD ^ 0x9E) + (88 + 143 - 183 + 104);
        GuiStreamOptions.llIIIllllIlIlI[10] = 78 + 37 - 89 + 134;
        GuiStreamOptions.llIIIllllIlIlI[11] = (0xA6 ^ 0xBE);
        GuiStreamOptions.llIIIllllIlIlI[12] = 3 + 122 - 62 + 89 + (126 + 70 - 149 + 93) - (206 + 24 - 86 + 93) + (50 + 27 + 13 + 55);
        GuiStreamOptions.llIIIllllIlIlI[13] = (0x5E ^ 0x41) + (0xB5 ^ 0xC1) - (0x4F ^ 0x7C) + (0xF6 ^ 0xBE);
        GuiStreamOptions.llIIIllllIlIlI[14] = 71 + 59 - 49 + 69;
        GuiStreamOptions.llIIIllllIlIlI[15] = (0x8C ^ 0x98);
        GuiStreamOptions.llIIIllllIlIlI[16] = 155 + 151 - 174 + 69;
        GuiStreamOptions.llIIIllllIlIlI[17] = (0x24 ^ 0x40);
        GuiStreamOptions.llIIIllllIlIlI[18] = (-" ".length() & (-1 & 0xFFFFFF));
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllIIllllIllIlIlIII, final int llllllllllllIlllIIllllIllIlIIlll, final float llllllllllllIlllIIllllIllIlIlIlI) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.field_152319_i, this.width / GuiStreamOptions.llIIIllllIlIlI[3], GuiStreamOptions.llIIIllllIlIlI[15], GuiStreamOptions.llIIIllllIlIlI[18]);
        this.drawCenteredString(this.fontRendererObj, this.field_152313_r, this.width / GuiStreamOptions.llIIIllllIlIlI[3], this.field_152314_s, GuiStreamOptions.llIIIllllIlIlI[18]);
        if (lIIIlIllIIlIlllI(this.field_152315_t ? 1 : 0)) {
            this.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(I18n.format(GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[5]], new Object[GuiStreamOptions.llIIIllllIlIlI[1]]))), this.width / GuiStreamOptions.llIIIllllIlIlI[3], GuiStreamOptions.llIIIllllIlIlI[15] + this.fontRendererObj.FONT_HEIGHT, GuiStreamOptions.llIIIllllIlIlI[18]);
        }
        super.drawScreen(llllllllllllIlllIIllllIllIlIlIII, llllllllllllIlllIIllllIllIlIIlll, llllllllllllIlllIIllllIllIlIlIlI);
    }
    
    @Override
    public void initGui() {
        int llllllllllllIlllIIllllIlllIIIlII = GuiStreamOptions.llIIIllllIlIlI[1];
        this.field_152319_i = I18n.format(GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[1]], new Object[GuiStreamOptions.llIIIllllIlIlI[1]]);
        this.field_152313_r = I18n.format(GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[2]], new Object[GuiStreamOptions.llIIIllllIlIlI[1]]);
        byte llllllllllllIlllIIllllIllIlllIll;
        Exception llllllllllllIlllIIllllIllIllllII = (Exception)((GameSettings.Options[])(Object)(llllllllllllIlllIIllllIllIlllIll = (byte)(Object)GuiStreamOptions.field_152312_a)).length;
        boolean llllllllllllIlllIIllllIllIllllIl = GuiStreamOptions.llIIIllllIlIlI[1] != 0;
        "".length();
        if (-(55 + 87 - 3 + 8 ^ 32 + 77 - 17 + 59) > 0) {
            return;
        }
        while (!lIIIlIllIIlIllll(llllllllllllIlllIIllllIllIllllIl ? 1 : 0, (int)llllllllllllIlllIIllllIllIllllII)) {
            final GameSettings.Options llllllllllllIlllIIllllIlllIIIIll = llllllllllllIlllIIllllIllIlllIll[llllllllllllIlllIIllllIllIllllIl];
            if (lIIIlIllIIlIlllI(llllllllllllIlllIIllllIlllIIIIll.getEnumFloat() ? 1 : 0)) {
                this.buttonList.add(new GuiOptionSlider(llllllllllllIlllIIllllIlllIIIIll.returnEnumOrdinal(), this.width / GuiStreamOptions.llIIIllllIlIlI[3] - GuiStreamOptions.llIIIllllIlIlI[9] + llllllllllllIlllIIllllIlllIIIlII % GuiStreamOptions.llIIIllllIlIlI[3] * GuiStreamOptions.llIIIllllIlIlI[10], this.height / GuiStreamOptions.llIIIllllIlIlI[7] + GuiStreamOptions.llIIIllllIlIlI[11] * (llllllllllllIlllIIllllIlllIIIlII >> GuiStreamOptions.llIIIllllIlIlI[2]), llllllllllllIlllIIllllIlllIIIIll));
                "".length();
                "".length();
                if (((106 + 31 - 121 + 153 ^ 4 + 132 + 11 + 41) & (126 + 92 - 206 + 165 ^ 94 + 50 - 37 + 57 ^ -" ".length())) < -" ".length()) {
                    return;
                }
            }
            else {
                this.buttonList.add(new GuiOptionButton(llllllllllllIlllIIllllIlllIIIIll.returnEnumOrdinal(), this.width / GuiStreamOptions.llIIIllllIlIlI[3] - GuiStreamOptions.llIIIllllIlIlI[9] + llllllllllllIlllIIllllIlllIIIlII % GuiStreamOptions.llIIIllllIlIlI[3] * GuiStreamOptions.llIIIllllIlIlI[10], this.height / GuiStreamOptions.llIIIllllIlIlI[7] + GuiStreamOptions.llIIIllllIlIlI[11] * (llllllllllllIlllIIllllIlllIIIlII >> GuiStreamOptions.llIIIllllIlIlI[2]), llllllllllllIlllIIllllIlllIIIIll, this.field_152318_h.getKeyBinding(llllllllllllIlllIIllllIlllIIIIll)));
                "".length();
            }
            ++llllllllllllIlllIIllllIlllIIIlII;
            ++llllllllllllIlllIIllllIllIllllIl;
        }
        if (lIIIlIllIIllIIII(llllllllllllIlllIIllllIlllIIIlII % GuiStreamOptions.llIIIllllIlIlI[3], GuiStreamOptions.llIIIllllIlIlI[2])) {
            ++llllllllllllIlllIIllllIlllIIIlII;
        }
        this.field_152314_s = this.height / GuiStreamOptions.llIIIllllIlIlI[7] + GuiStreamOptions.llIIIllllIlIlI[11] * (llllllllllllIlllIIllllIlllIIIlII >> GuiStreamOptions.llIIIllllIlIlI[2]) + GuiStreamOptions.llIIIllllIlIlI[7];
        llllllllllllIlllIIllllIlllIIIlII += 2;
        llllllllllllIlllIIllllIllIllllII = (Exception)((GameSettings.Options[])(Object)(llllllllllllIlllIIllllIllIlllIll = (byte)(Object)GuiStreamOptions.field_152316_f)).length;
        llllllllllllIlllIIllllIllIllllIl = (GuiStreamOptions.llIIIllllIlIlI[1] != 0);
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lIIIlIllIIlIllll(llllllllllllIlllIIllllIllIllllIl ? 1 : 0, (int)llllllllllllIlllIIllllIllIllllII)) {
            final GameSettings.Options llllllllllllIlllIIllllIlllIIIIlI = llllllllllllIlllIIllllIllIlllIll[llllllllllllIlllIIllllIllIllllIl];
            if (lIIIlIllIIlIlllI(llllllllllllIlllIIllllIlllIIIIlI.getEnumFloat() ? 1 : 0)) {
                this.buttonList.add(new GuiOptionSlider(llllllllllllIlllIIllllIlllIIIIlI.returnEnumOrdinal(), this.width / GuiStreamOptions.llIIIllllIlIlI[3] - GuiStreamOptions.llIIIllllIlIlI[9] + llllllllllllIlllIIllllIlllIIIlII % GuiStreamOptions.llIIIllllIlIlI[3] * GuiStreamOptions.llIIIllllIlIlI[10], this.height / GuiStreamOptions.llIIIllllIlIlI[7] + GuiStreamOptions.llIIIllllIlIlI[11] * (llllllllllllIlllIIllllIlllIIIlII >> GuiStreamOptions.llIIIllllIlIlI[2]), llllllllllllIlllIIllllIlllIIIIlI));
                "".length();
                "".length();
                if ("   ".length() <= " ".length()) {
                    return;
                }
            }
            else {
                this.buttonList.add(new GuiOptionButton(llllllllllllIlllIIllllIlllIIIIlI.returnEnumOrdinal(), this.width / GuiStreamOptions.llIIIllllIlIlI[3] - GuiStreamOptions.llIIIllllIlIlI[9] + llllllllllllIlllIIllllIlllIIIlII % GuiStreamOptions.llIIIllllIlIlI[3] * GuiStreamOptions.llIIIllllIlIlI[10], this.height / GuiStreamOptions.llIIIllllIlIlI[7] + GuiStreamOptions.llIIIllllIlIlI[11] * (llllllllllllIlllIIllllIlllIIIlII >> GuiStreamOptions.llIIIllllIlIlI[2]), llllllllllllIlllIIllllIlllIIIIlI, this.field_152318_h.getKeyBinding(llllllllllllIlllIIllllIlllIIIIlI)));
                "".length();
            }
            ++llllllllllllIlllIIllllIlllIIIlII;
            ++llllllllllllIlllIIllllIllIllllIl;
        }
        this.buttonList.add(new GuiButton(GuiStreamOptions.llIIIllllIlIlI[12], this.width / GuiStreamOptions.llIIIllllIlIlI[3] - GuiStreamOptions.llIIIllllIlIlI[9], this.height / GuiStreamOptions.llIIIllllIlIlI[7] + GuiStreamOptions.llIIIllllIlIlI[13], GuiStreamOptions.llIIIllllIlIlI[14], GuiStreamOptions.llIIIllllIlIlI[15], I18n.format(GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[3]], new Object[GuiStreamOptions.llIIIllllIlIlI[1]])));
        "".length();
        final GuiButton guiButton;
        final GuiButton llllllllllllIlllIIllllIlllIIIIIl = guiButton = new GuiButton(GuiStreamOptions.llIIIllllIlIlI[16], this.width / GuiStreamOptions.llIIIllllIlIlI[3] + GuiStreamOptions.llIIIllllIlIlI[6], this.height / GuiStreamOptions.llIIIllllIlIlI[7] + GuiStreamOptions.llIIIllllIlIlI[13], GuiStreamOptions.llIIIllllIlIlI[14], GuiStreamOptions.llIIIllllIlIlI[15], I18n.format(GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[4]], new Object[GuiStreamOptions.llIIIllllIlIlI[1]]));
        int enabled;
        if ((!lIIIlIllIIlIlllI(this.mc.getTwitchStream().isReadyToBroadcast() ? 1 : 0) || lIIIlIllIIllIIIl(this.mc.getTwitchStream().func_152925_v().length)) && lIIIlIllIIllIIlI(this.mc.getTwitchStream().func_152908_z() ? 1 : 0)) {
            enabled = GuiStreamOptions.llIIIllllIlIlI[1];
            "".length();
            if ("   ".length() < ((24 + 186 + 3 + 8 ^ 19 + 6 + 35 + 69) & (0x6D ^ 0x5B ^ (0x9 ^ 0x63) ^ -" ".length()))) {
                return;
            }
        }
        else {
            enabled = GuiStreamOptions.llIIIllllIlIlI[2];
        }
        guiButton.enabled = (enabled != 0);
        this.buttonList.add(llllllllllllIlllIIllllIlllIIIIIl);
        "".length();
    }
    
    private static boolean lIIIlIllIIllIIlI(final int llllllllllllIlllIIllllIlIlIlIIll) {
        return llllllllllllIlllIIllllIlIlIlIIll == 0;
    }
    
    private static String lIIIlIllIIIllllI(final String llllllllllllIlllIIllllIlIllIllII, final String llllllllllllIlllIIllllIlIllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIllllIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllllIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIllllIlIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIllllIlIllIlllI.init(GuiStreamOptions.llIIIllllIlIlI[3], llllllllllllIlllIIllllIlIllIllll);
            return new String(llllllllllllIlllIIllllIlIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllllIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllllIlIllIllIl) {
            llllllllllllIlllIIllllIlIllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIllIIllIIII(final int llllllllllllIlllIIllllIlIllIIlII, final int llllllllllllIlllIIllllIlIllIIIll) {
        return llllllllllllIlllIIllllIlIllIIlII == llllllllllllIlllIIllllIlIllIIIll;
    }
    
    private static boolean lIIIlIllIIlIlllI(final int llllllllllllIlllIIllllIlIlIlIlIl) {
        return llllllllllllIlllIIllllIlIlIlIlIl != 0;
    }
    
    private static void lIIIlIllIIIlllll() {
        (llIIIllllIIllI = new String[GuiStreamOptions.llIIIllllIlIlI[6]])[GuiStreamOptions.llIIIllllIlIlI[1]] = lIIIlIllIIIlllII("6j3tUXCEX3yCHegQy1ryzOwN3jf9pmbQ", "CXnbR");
        GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[2]] = lIIIlIllIIIlllII("0JsY5+ZIewnsZ6Bo9rcMQftZxqS6QKffWqXv6zTNgjk=", "KVjxR");
        GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[3]] = lIIIlIllIIIlllIl("DhkOfBcGAgI=", "ilgRs");
        GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[4]] = lIIIlIllIIIlllIl("BDQaHSkFN0AHMhkhDxloAioJETUfFwsYIwgwBxso", "kDntF");
        GuiStreamOptions.llIIIllllIIllI[GuiStreamOptions.llIIIllllIlIlI[5]] = lIIIlIllIIIllllI("iSu9GuxCya7arw4VdA3ahRiuM61Ng/23", "PqqaR");
    }
    
    static {
        lIIIlIllIIlIllIl();
        lIIIlIllIIIlllll();
        final GameSettings.Options[] field_152312_a2 = new GameSettings.Options[GuiStreamOptions.llIIIllllIlIlI[0]];
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[1]] = GameSettings.Options.STREAM_BYTES_PER_PIXEL;
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[2]] = GameSettings.Options.STREAM_FPS;
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[3]] = GameSettings.Options.STREAM_KBPS;
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[4]] = GameSettings.Options.STREAM_SEND_METADATA;
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[5]] = GameSettings.Options.STREAM_VOLUME_MIC;
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[6]] = GameSettings.Options.STREAM_VOLUME_SYSTEM;
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[7]] = GameSettings.Options.STREAM_MIC_TOGGLE_BEHAVIOR;
        field_152312_a2[GuiStreamOptions.llIIIllllIlIlI[8]] = GameSettings.Options.STREAM_COMPRESSION;
        field_152312_a = field_152312_a2;
        final GameSettings.Options[] field_152316_f2 = new GameSettings.Options[GuiStreamOptions.llIIIllllIlIlI[3]];
        field_152316_f2[GuiStreamOptions.llIIIllllIlIlI[1]] = GameSettings.Options.STREAM_CHAT_ENABLED;
        field_152316_f2[GuiStreamOptions.llIIIllllIlIlI[2]] = GameSettings.Options.STREAM_CHAT_USER_FILTER;
        field_152316_f = field_152316_f2;
    }
    
    private static boolean lIIIlIllIIllIlII(final Object llllllllllllIlllIIllllIlIlIllIII, final Object llllllllllllIlllIIllllIlIlIlIlll) {
        return llllllllllllIlllIIllllIlIlIllIII != llllllllllllIlllIIllllIlIlIlIlll;
    }
    
    private static String lIIIlIllIIIlllII(final String llllllllllllIlllIIllllIlIlllIlll, final String llllllllllllIlllIIllllIlIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllllIlIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllllIlIlllIllI.getBytes(StandardCharsets.UTF_8)), GuiStreamOptions.llIIIllllIlIlI[0]), "DES");
            final Cipher llllllllllllIlllIIllllIlIllllIll = Cipher.getInstance("DES");
            llllllllllllIlllIIllllIlIllllIll.init(GuiStreamOptions.llIIIllllIlIlI[3], llllllllllllIlllIIllllIlIlllllIl);
            return new String(llllllllllllIlllIIllllIlIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllllIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllllIlIllllIlI) {
            llllllllllllIlllIIllllIlIllllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllIIllllIllIllIIll) throws IOException {
        if (lIIIlIllIIlIlllI(llllllllllllIlllIIllllIllIllIIll.enabled ? 1 : 0)) {
            if (lIIIlIllIIllIIll(llllllllllllIlllIIllllIllIllIIll.id, GuiStreamOptions.llIIIllllIlIlI[17]) && lIIIlIllIIlIlllI((llllllllllllIlllIIllllIllIllIIll instanceof GuiOptionButton) ? 1 : 0)) {
                final GameSettings.Options llllllllllllIlllIIllllIllIllIlIl = ((GuiOptionButton)llllllllllllIlllIIllllIllIllIIll).returnEnumOptions();
                this.field_152318_h.setOptionValue(llllllllllllIlllIIllllIllIllIlIl, GuiStreamOptions.llIIIllllIlIlI[2]);
                llllllllllllIlllIIllllIllIllIIll.displayString = this.field_152318_h.getKeyBinding(GameSettings.Options.getEnumOptions(llllllllllllIlllIIllllIllIllIIll.id));
                if (lIIIlIllIIlIlllI(this.mc.getTwitchStream().isBroadcasting() ? 1 : 0) && lIIIlIllIIllIlII(llllllllllllIlllIIllllIllIllIlIl, GameSettings.Options.STREAM_CHAT_ENABLED) && lIIIlIllIIllIlII(llllllllllllIlllIIllllIllIllIlIl, GameSettings.Options.STREAM_CHAT_USER_FILTER)) {
                    this.field_152315_t = (GuiStreamOptions.llIIIllllIlIlI[2] != 0);
                    "".length();
                    if (((144 + 178 - 166 + 69 ^ 80 + 180 - 236 + 171) & (103 + 23 - 59 + 98 ^ 23 + 34 + 25 + 53 ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
            }
            else if (lIIIlIllIIlIlllI((llllllllllllIlllIIllllIllIllIIll instanceof GuiOptionSlider) ? 1 : 0)) {
                if (lIIIlIllIIllIIII(llllllllllllIlllIIllllIllIllIIll.id, GameSettings.Options.STREAM_VOLUME_MIC.returnEnumOrdinal())) {
                    this.mc.getTwitchStream().updateStreamVolume();
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
                else if (lIIIlIllIIllIIII(llllllllllllIlllIIllllIllIllIIll.id, GameSettings.Options.STREAM_VOLUME_SYSTEM.returnEnumOrdinal())) {
                    this.mc.getTwitchStream().updateStreamVolume();
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return;
                    }
                }
                else if (lIIIlIllIIlIlllI(this.mc.getTwitchStream().isBroadcasting() ? 1 : 0)) {
                    this.field_152315_t = (GuiStreamOptions.llIIIllllIlIlI[2] != 0);
                }
            }
            if (lIIIlIllIIllIIII(llllllllllllIlllIIllllIllIllIIll.id, GuiStreamOptions.llIIIllllIlIlI[12])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(this.parentScreen);
                "".length();
                if ((0x22 ^ 0x4C ^ (0xCE ^ 0xA4)) <= -" ".length()) {
                    return;
                }
            }
            else if (lIIIlIllIIllIIII(llllllllllllIlllIIllllIllIllIIll.id, GuiStreamOptions.llIIIllllIlIlI[16])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiIngestServers(this));
            }
        }
    }
    
    public GuiStreamOptions(final GuiScreen llllllllllllIlllIIllllIlllIlIIII, final GameSettings llllllllllllIlllIIllllIlllIIllll) {
        this.field_152315_t = (GuiStreamOptions.llIIIllllIlIlI[1] != 0);
        this.parentScreen = llllllllllllIlllIIllllIlllIlIIII;
        this.field_152318_h = llllllllllllIlllIIllllIlllIIllll;
    }
    
    private static boolean lIIIlIllIIllIIIl(final int llllllllllllIlllIIllllIlIlIlIIIl) {
        return llllllllllllIlllIIllllIlIlIlIIIl <= 0;
    }
    
    private static boolean lIIIlIllIIllIIll(final int llllllllllllIlllIIllllIlIlIlllII, final int llllllllllllIlllIIllllIlIlIllIll) {
        return llllllllllllIlllIIllllIlIlIlllII < llllllllllllIlllIIllllIlIlIllIll;
    }
    
    private static String lIIIlIllIIIlllIl(String llllllllllllIlllIIllllIllIIlIIII, final String llllllllllllIlllIIllllIllIIlIlIl) {
        llllllllllllIlllIIllllIllIIlIIII = new String(Base64.getDecoder().decode(llllllllllllIlllIIllllIllIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIllllIllIIlIIll = new StringBuilder();
        final char[] llllllllllllIlllIIllllIllIIlIIlI = llllllllllllIlllIIllllIllIIlIlIl.toCharArray();
        int llllllllllllIlllIIllllIllIIlIIIl = GuiStreamOptions.llIIIllllIlIlI[1];
        final int llllllllllllIlllIIllllIllIIIlIll = (Object)llllllllllllIlllIIllllIllIIlIIII.toCharArray();
        final short llllllllllllIlllIIllllIllIIIlIlI = (short)llllllllllllIlllIIllllIllIIIlIll.length;
        float llllllllllllIlllIIllllIllIIIlIIl = GuiStreamOptions.llIIIllllIlIlI[1];
        while (lIIIlIllIIllIIll((int)llllllllllllIlllIIllllIllIIIlIIl, llllllllllllIlllIIllllIllIIIlIlI)) {
            final char llllllllllllIlllIIllllIllIIllIII = llllllllllllIlllIIllllIllIIIlIll[llllllllllllIlllIIllllIllIIIlIIl];
            llllllllllllIlllIIllllIllIIlIIll.append((char)(llllllllllllIlllIIllllIllIIllIII ^ llllllllllllIlllIIllllIllIIlIIlI[llllllllllllIlllIIllllIllIIlIIIl % llllllllllllIlllIIllllIllIIlIIlI.length]));
            "".length();
            ++llllllllllllIlllIIllllIllIIlIIIl;
            ++llllllllllllIlllIIllllIllIIIlIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIllllIllIIlIIll);
    }
}
