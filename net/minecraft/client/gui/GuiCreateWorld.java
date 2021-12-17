// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.util.ChatAllowedCharacters;
import java.util.List;
import org.lwjgl.input.Keyboard;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.ISaveFormat;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.resources.I18n;
import java.io.IOException;
import net.minecraft.world.WorldType;
import net.minecraft.world.WorldSettings;
import org.apache.commons.lang3.StringUtils;
import java.util.Random;

public class GuiCreateWorld extends GuiScreen
{
    private /* synthetic */ boolean field_146345_x;
    private /* synthetic */ GuiTextField field_146335_h;
    private static final /* synthetic */ String[] llIIlIIIIllllI;
    private /* synthetic */ GuiButton btnMapFeatures;
    private /* synthetic */ GuiScreen parentScreen;
    private /* synthetic */ String gameMode;
    private /* synthetic */ GuiButton btnCustomizeType;
    private /* synthetic */ String field_146330_J;
    private /* synthetic */ GuiButton btnAllowCommands;
    private /* synthetic */ boolean field_146339_u;
    private /* synthetic */ int selectedIndex;
    public /* synthetic */ String chunkProviderSettingsJson;
    private /* synthetic */ GuiButton btnMapType;
    private /* synthetic */ boolean field_146338_v;
    private /* synthetic */ GuiButton btnBonusItems;
    private /* synthetic */ boolean allowCheats;
    private /* synthetic */ GuiTextField field_146333_g;
    private /* synthetic */ String field_146323_G;
    private /* synthetic */ String field_146329_I;
    private /* synthetic */ GuiButton btnGameMode;
    private static final /* synthetic */ int[] llIIlIllIIIIIl;
    private /* synthetic */ boolean field_146337_w;
    private /* synthetic */ boolean field_146341_s;
    private /* synthetic */ boolean field_146344_y;
    private static final /* synthetic */ String[] disallowedFilenames;
    private /* synthetic */ GuiButton btnMoreOptions;
    private /* synthetic */ String field_146336_i;
    private /* synthetic */ String field_146328_H;
    private /* synthetic */ String field_175300_s;
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllIIIlIllIllllIIII) throws IOException {
        if (lIIIllIllIIIIIlI(llllllllllllIlllIIIlIllIllllIIII.enabled ? 1 : 0)) {
            if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[2])) {
                this.mc.displayGuiScreen(this.parentScreen);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIIIllIllIIIIIll(llllllllllllIlllIIIlIllIllllIIII.id)) {
                this.mc.displayGuiScreen(null);
                if (lIIIllIllIIIIIlI(this.field_146345_x ? 1 : 0)) {
                    return;
                }
                this.field_146345_x = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                long llllllllllllIlllIIIlIllIllllIlll = new Random().nextLong();
                final String llllllllllllIlllIIIlIllIllllIllI = this.field_146335_h.getText();
                if (lIIIllIllIIIIIll(StringUtils.isEmpty((CharSequence)llllllllllllIlllIIIlIllIllllIllI) ? 1 : 0)) {
                    try {
                        final long llllllllllllIlllIIIlIllIllllIlIl = Long.parseLong(llllllllllllIlllIIIlIllIllllIllI);
                        if (lIIIllIllIIIIIlI(lIIIllIllIIIIlIl(llllllllllllIlllIIIlIllIllllIlIl, 0L))) {
                            llllllllllllIlllIIIlIllIllllIlll = llllllllllllIlllIIIlIllIllllIlIl;
                            "".length();
                            if ("   ".length() < "   ".length()) {
                                return;
                            }
                        }
                    }
                    catch (NumberFormatException llllllllllllIlllIIIlIllIllllIlII) {
                        llllllllllllIlllIIIlIllIllllIlll = llllllllllllIlllIIIlIllIllllIllI.hashCode();
                    }
                }
                final WorldSettings.GameType llllllllllllIlllIIIlIllIllllIIll = WorldSettings.GameType.getByName(this.gameMode);
                final WorldSettings llllllllllllIlllIIIlIllIllllIIlI = new WorldSettings(llllllllllllIlllIIIlIllIllllIlll, llllllllllllIlllIIIlIllIllllIIll, this.field_146341_s, this.field_146337_w, WorldType.worldTypes[this.selectedIndex]);
                llllllllllllIlllIIIlIllIllllIIlI.setWorldName(this.chunkProviderSettingsJson);
                "".length();
                if (lIIIllIllIIIIIlI(this.field_146338_v ? 1 : 0) && lIIIllIllIIIIIll(this.field_146337_w ? 1 : 0)) {
                    llllllllllllIlllIIIlIllIllllIIlI.enableBonusChest();
                    "".length();
                }
                if (lIIIllIllIIIIIlI(this.allowCheats ? 1 : 0) && lIIIllIllIIIIIll(this.field_146337_w ? 1 : 0)) {
                    llllllllllllIlllIIIlIllIllllIIlI.enableCommands();
                    "".length();
                }
                this.mc.launchIntegratedServer(this.field_146336_i, this.field_146333_g.getText().trim(), llllllllllllIlllIIIlIllIllllIIlI);
                "".length();
                if (((65 + 79 - 20 + 15 ^ 17 + 80 - 8 + 60) & (0x76 ^ 0x7 ^ (0xDB ^ 0xB4) ^ -" ".length())) != ((11 + 167 - 149 + 197 ^ 39 + 183 - 175 + 142) & (0xCA ^ 0xA0 ^ (0x89 ^ 0xBC) ^ -" ".length()))) {
                    return;
                }
            }
            else if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[4])) {
                this.func_146315_i();
                "".length();
                if ((0x2A ^ 0x2E) == "   ".length()) {
                    return;
                }
            }
            else if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[3])) {
                if (lIIIllIllIIIIIlI(this.gameMode.equals(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[74]]) ? 1 : 0)) {
                    if (lIIIllIllIIIIIll(this.field_146339_u ? 1 : 0)) {
                        this.allowCheats = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                    }
                    this.field_146337_w = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                    this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[75]];
                    this.field_146337_w = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                    this.btnAllowCommands.enabled = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                    this.btnBonusItems.enabled = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                    this.func_146319_h();
                    "".length();
                    if (((0x33 ^ 0x2B ^ (0xDB ^ 0x85)) & (147 + 103 - 100 + 83 ^ 47 + 128 - 117 + 117 ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else if (lIIIllIllIIIIIlI(this.gameMode.equals(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[76]]) ? 1 : 0)) {
                    if (lIIIllIllIIIIIll(this.field_146339_u ? 1 : 0)) {
                        this.allowCheats = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                    }
                    this.field_146337_w = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                    this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[77]];
                    this.func_146319_h();
                    this.field_146337_w = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                    this.btnAllowCommands.enabled = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                    this.btnBonusItems.enabled = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                }
                else {
                    if (lIIIllIllIIIIIll(this.field_146339_u ? 1 : 0)) {
                        this.allowCheats = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                    }
                    this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[78]];
                    this.func_146319_h();
                    this.btnAllowCommands.enabled = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                    this.btnBonusItems.enabled = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                    this.field_146337_w = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
                }
                this.func_146319_h();
                "".length();
                if (" ".length() > (177 + 154 - 256 + 108 ^ 152 + 142 - 243 + 128)) {
                    return;
                }
            }
            else if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[5])) {
                int field_146341_s;
                if (lIIIllIllIIIIIlI(this.field_146341_s ? 1 : 0)) {
                    field_146341_s = GuiCreateWorld.llIIlIllIIIIIl[1];
                    "".length();
                    if ("  ".length() == -" ".length()) {
                        return;
                    }
                }
                else {
                    field_146341_s = GuiCreateWorld.llIIlIllIIIIIl[2];
                }
                this.field_146341_s = (field_146341_s != 0);
                this.func_146319_h();
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[8])) {
                int field_146338_v;
                if (lIIIllIllIIIIIlI(this.field_146338_v ? 1 : 0)) {
                    field_146338_v = GuiCreateWorld.llIIlIllIIIIIl[1];
                    "".length();
                    if ("   ".length() < -" ".length()) {
                        return;
                    }
                }
                else {
                    field_146338_v = GuiCreateWorld.llIIlIllIIIIIl[2];
                }
                this.field_146338_v = (field_146338_v != 0);
                this.func_146319_h();
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            else if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[6])) {
                this.selectedIndex += GuiCreateWorld.llIIlIllIIIIIl[2];
                if (lIIIllIllIIIIIIl(this.selectedIndex, WorldType.worldTypes.length)) {
                    this.selectedIndex = GuiCreateWorld.llIIlIllIIIIIl[1];
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                }
                while (!lIIIllIllIIIIIlI(this.func_175299_g() ? 1 : 0)) {
                    this.selectedIndex += GuiCreateWorld.llIIlIllIIIIIl[2];
                    if (lIIIllIllIIIIIIl(this.selectedIndex, WorldType.worldTypes.length)) {
                        this.selectedIndex = GuiCreateWorld.llIIlIllIIIIIl[1];
                    }
                }
                this.chunkProviderSettingsJson = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[79]];
                this.func_146319_h();
                this.func_146316_a(this.field_146344_y);
                "".length();
                if (-(0x3A ^ 0x43 ^ (0x70 ^ 0xC)) >= 0) {
                    return;
                }
            }
            else if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[7])) {
                this.field_146339_u = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
                int allowCheats;
                if (lIIIllIllIIIIIlI(this.allowCheats ? 1 : 0)) {
                    allowCheats = GuiCreateWorld.llIIlIllIIIIIl[1];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                }
                else {
                    allowCheats = GuiCreateWorld.llIIlIllIIIIIl[2];
                }
                this.allowCheats = (allowCheats != 0);
                this.func_146319_h();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else if (lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllllIIII.id, GuiCreateWorld.llIIlIllIIIIIl[9])) {
                if (lIIIllIllIIIIlll(WorldType.worldTypes[this.selectedIndex], WorldType.FLAT)) {
                    this.mc.displayGuiScreen(new GuiCreateFlatWorld(this, this.chunkProviderSettingsJson));
                    "".length();
                    if ((0xBC ^ 0xB8) == -" ".length()) {
                        return;
                    }
                }
                else {
                    this.mc.displayGuiScreen(new GuiCustomizeWorldScreen(this, this.chunkProviderSettingsJson));
                }
            }
        }
    }
    
    static {
        lIIIllIllIIIIIII();
        lIIIllIlIlllllll();
        final String[] disallowedFilenames2 = new String[GuiCreateWorld.llIIlIllIIIIIl[0]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[1]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[1]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[2]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[2]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[3]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[3]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[4]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[4]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[5]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[5]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[6]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[6]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[7]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[7]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[8]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[8]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[9]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[9]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[10]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[10]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[11]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[11]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[12]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[12]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[13]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[13]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[14]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[14]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[15]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[15]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[16]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[16]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[17]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[17]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[18]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[18]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[19]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[19]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[20]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[20]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[21]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[21]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[22]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[22]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[23]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[23]];
        disallowedFilenames2[GuiCreateWorld.llIIlIllIIIIIl[24]] = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[24]];
        disallowedFilenames = disallowedFilenames2;
    }
    
    public GuiCreateWorld(final GuiScreen llllllllllllIlllIIIlIlllIIlIIlll) {
        this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[0]];
        this.field_146341_s = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
        this.chunkProviderSettingsJson = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[25]];
        this.parentScreen = llllllllllllIlllIIIlIlllIIlIIlll;
        this.field_146329_I = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[26]];
        this.field_146330_J = I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[27]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]);
    }
    
    private static String lIIIlIlllIllIlll(String llllllllllllIlllIIIlIllIlIIIllII, final String llllllllllllIlllIIIlIllIlIIIlIll) {
        llllllllllllIlllIIIlIllIlIIIllII = new String(Base64.getDecoder().decode(llllllllllllIlllIIIlIllIlIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIlIllIlIIIllll = new StringBuilder();
        final char[] llllllllllllIlllIIIlIllIlIIIlllI = llllllllllllIlllIIIlIllIlIIIlIll.toCharArray();
        int llllllllllllIlllIIIlIllIlIIIllIl = GuiCreateWorld.llIIlIllIIIIIl[1];
        final long llllllllllllIlllIIIlIllIlIIIIlll = (Object)llllllllllllIlllIIIlIllIlIIIllII.toCharArray();
        final long llllllllllllIlllIIIlIllIlIIIIllI = llllllllllllIlllIIIlIllIlIIIIlll.length;
        byte llllllllllllIlllIIIlIllIlIIIIlIl = (byte)GuiCreateWorld.llIIlIllIIIIIl[1];
        while (lIIIllIllIIIllII(llllllllllllIlllIIIlIllIlIIIIlIl, (int)llllllllllllIlllIIIlIllIlIIIIllI)) {
            final char llllllllllllIlllIIIlIllIlIIlIIlI = llllllllllllIlllIIIlIllIlIIIIlll[llllllllllllIlllIIIlIllIlIIIIlIl];
            llllllllllllIlllIIIlIllIlIIIllll.append((char)(llllllllllllIlllIIIlIllIlIIlIIlI ^ llllllllllllIlllIIIlIllIlIIIlllI[llllllllllllIlllIIIlIllIlIIIllIl % llllllllllllIlllIIIlIllIlIIIlllI.length]));
            "".length();
            ++llllllllllllIlllIIIlIllIlIIIllIl;
            ++llllllllllllIlllIIIlIllIlIIIIlIl;
            "".length();
            if (((0x6B ^ 0x70) & ~(0x59 ^ 0x42)) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIlIllIlIIIllll);
    }
    
    private void func_146316_a(final boolean llllllllllllIlllIIIlIllIllIlllll) {
        this.field_146344_y = llllllllllllIlllIIIlIllIllIlllll;
        if (lIIIllIllIIIIlll(WorldType.worldTypes[this.selectedIndex], WorldType.DEBUG_WORLD)) {
            final GuiButton btnGameMode = this.btnGameMode;
            int visible;
            if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0)) {
                visible = GuiCreateWorld.llIIlIllIIIIIl[1];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                visible = GuiCreateWorld.llIIlIllIIIIIl[2];
            }
            btnGameMode.visible = (visible != 0);
            this.btnGameMode.enabled = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
            if (lIIIllIllIIIIlII(this.field_175300_s)) {
                this.field_175300_s = this.gameMode;
            }
            this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[80]];
            this.btnMapFeatures.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
            this.btnBonusItems.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
            this.btnMapType.visible = this.field_146344_y;
            this.btnAllowCommands.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
            this.btnCustomizeType.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            final GuiButton btnGameMode2 = this.btnGameMode;
            int visible2;
            if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0)) {
                visible2 = GuiCreateWorld.llIIlIllIIIIIl[1];
                "".length();
                if (((0x40 ^ 0x3C ^ (0xC3 ^ 0xB9)) & (0xEA ^ 0xC7 ^ (0x33 ^ 0x18) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                visible2 = GuiCreateWorld.llIIlIllIIIIIl[2];
            }
            btnGameMode2.visible = (visible2 != 0);
            this.btnGameMode.enabled = (GuiCreateWorld.llIIlIllIIIIIl[2] != 0);
            if (lIIIllIllIIIlIII(this.field_175300_s)) {
                this.gameMode = this.field_175300_s;
                this.field_175300_s = null;
            }
            final GuiButton btnMapFeatures = this.btnMapFeatures;
            int visible3;
            if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0) && lIIIllIllIIIlIIl(WorldType.worldTypes[this.selectedIndex], WorldType.CUSTOMIZED)) {
                visible3 = GuiCreateWorld.llIIlIllIIIIIl[2];
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
            else {
                visible3 = GuiCreateWorld.llIIlIllIIIIIl[1];
            }
            btnMapFeatures.visible = (visible3 != 0);
            this.btnBonusItems.visible = this.field_146344_y;
            this.btnMapType.visible = this.field_146344_y;
            this.btnAllowCommands.visible = this.field_146344_y;
            final GuiButton btnCustomizeType = this.btnCustomizeType;
            int visible4;
            if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0) && (!lIIIllIllIIIlIIl(WorldType.worldTypes[this.selectedIndex], WorldType.FLAT) || lIIIllIllIIIIlll(WorldType.worldTypes[this.selectedIndex], WorldType.CUSTOMIZED))) {
                visible4 = GuiCreateWorld.llIIlIllIIIIIl[2];
                "".length();
                if (-(0x75 ^ 0x70) >= 0) {
                    return;
                }
            }
            else {
                visible4 = GuiCreateWorld.llIIlIllIIIIIl[1];
            }
            btnCustomizeType.visible = (visible4 != 0);
        }
        this.func_146319_h();
        if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0)) {
            this.btnMoreOptions.displayString = I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[81]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]);
            "".length();
            if ((0x4C ^ 0x48) == "   ".length()) {
                return;
            }
        }
        else {
            this.btnMoreOptions.displayString = I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[82]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]);
        }
    }
    
    public static String func_146317_a(final ISaveFormat llllllllllllIlllIIIlIlllIIIIIllI, String llllllllllllIlllIIIlIlllIIIIIlIl) {
        llllllllllllIlllIIIlIlllIIIIIlIl = llllllllllllIlllIIIlIlllIIIIIlIl.replaceAll(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[70]], GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[45]]);
        final float llllllllllllIlllIIIlIlllIIIIIIIl;
        final long llllllllllllIlllIIIlIlllIIIIIIlI = ((String[])(Object)(llllllllllllIlllIIIlIlllIIIIIIIl = (float)(Object)GuiCreateWorld.disallowedFilenames)).length;
        long llllllllllllIlllIIIlIlllIIIIIIll = GuiCreateWorld.llIIlIllIIIIIl[1];
        "".length();
        if ("  ".length() == 0) {
            return null;
        }
        while (!lIIIllIllIIIIIIl((int)llllllllllllIlllIIIlIlllIIIIIIll, (int)llllllllllllIlllIIIlIlllIIIIIIlI)) {
            final String llllllllllllIlllIIIlIlllIIIIIlll = llllllllllllIlllIIIlIlllIIIIIIIl[llllllllllllIlllIIIlIlllIIIIIIll];
            if (lIIIllIllIIIIIlI(llllllllllllIlllIIIlIlllIIIIIlIl.equalsIgnoreCase(llllllllllllIlllIIIlIlllIIIIIlll) ? 1 : 0)) {
                llllllllllllIlllIIIlIlllIIIIIlIl = String.valueOf(new StringBuilder(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[71]]).append(llllllllllllIlllIIIlIlllIIIIIlIl).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[72]]));
            }
            ++llllllllllllIlllIIIlIlllIIIIIIll;
        }
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!lIIIllIllIIIIlII(llllllllllllIlllIIIlIlllIIIIIllI.getWorldInfo(llllllllllllIlllIIIlIlllIIIIIlIl))) {
            llllllllllllIlllIIIlIlllIIIIIlIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllIIIlIlllIIIIIlIl)).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[73]]));
        }
        return llllllllllllIlllIIIlIlllIIIIIlIl;
    }
    
    private static int lIIIllIllIIIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void func_146318_a(final WorldInfo llllllllllllIlllIIIlIllIlIllIllI) {
        final String llllllllllllIlIllIlIIIIIllllIIll = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[99]];
        final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiCreateWorld.llIIlIllIIIIIl[2]];
        llllllllllllIlIllIlIIIIIllllIIII[GuiCreateWorld.llIIlIllIIIIIl[1]] = llllllllllllIlllIIIlIllIlIllIllI.getWorldName();
        this.field_146330_J = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
        this.field_146329_I = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllIIIlIllIlIllIllI.getSeed())));
        this.selectedIndex = llllllllllllIlllIIIlIllIlIllIllI.getTerrainType().getWorldTypeID();
        this.chunkProviderSettingsJson = llllllllllllIlllIIIlIllIlIllIllI.getGeneratorOptions();
        this.field_146341_s = llllllllllllIlllIIIlIllIlIllIllI.isMapFeaturesEnabled();
        this.allowCheats = llllllllllllIlllIIIlIllIlIllIllI.areCommandsAllowed();
        if (lIIIllIllIIIIIlI(llllllllllllIlllIIIlIllIlIllIllI.isHardcoreModeEnabled() ? 1 : 0)) {
            this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[100]];
            "".length();
            if (((0x9E ^ 0xA8) & ~(0x35 ^ 0x3)) > 0) {
                return;
            }
        }
        else if (lIIIllIllIIIIIlI(llllllllllllIlllIIIlIllIlIllIllI.getGameType().isSurvivalOrAdventure() ? 1 : 0)) {
            this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[101]];
            "".length();
            if (-" ".length() > -" ".length()) {
                return;
            }
        }
        else if (lIIIllIllIIIIIlI(llllllllllllIlllIIIlIllIlIllIllI.getGameType().isCreative() ? 1 : 0)) {
            this.gameMode = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[102]];
        }
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlllIIIlIllIllIlIlIl, final int llllllllllllIlllIIIlIllIllIlIlll) throws IOException {
        if (lIIIllIllIIIIIlI(this.field_146333_g.isFocused() ? 1 : 0) && lIIIllIllIIIIIll(this.field_146344_y ? 1 : 0)) {
            this.field_146333_g.textboxKeyTyped(llllllllllllIlllIIIlIllIllIlIlIl, llllllllllllIlllIIIlIllIllIlIlll);
            "".length();
            this.field_146330_J = this.field_146333_g.getText();
            "".length();
            if ((157 + 36 - 97 + 62 ^ 78 + 132 - 86 + 30) == 0x0) {
                return;
            }
        }
        else if (lIIIllIllIIIIIlI(this.field_146335_h.isFocused() ? 1 : 0) && lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0)) {
            this.field_146335_h.textboxKeyTyped(llllllllllllIlllIIIlIllIllIlIlIl, llllllllllllIlllIIIlIllIllIlIlll);
            "".length();
            this.field_146329_I = this.field_146335_h.getText();
        }
        if (!lIIIllIllIIIlIlI(llllllllllllIlllIIIlIllIllIlIlll, GuiCreateWorld.llIIlIllIIIIIl[29]) || lIIIllIllIIIIllI(llllllllllllIlllIIIlIllIllIlIlll, GuiCreateWorld.llIIlIllIIIIIl[83])) {
            this.actionPerformed(this.buttonList.get(GuiCreateWorld.llIIlIllIIIIIl[1]));
        }
        final GuiButton guiButton = this.buttonList.get(GuiCreateWorld.llIIlIllIIIIIl[1]);
        int enabled;
        if (lIIIllIllIIIlIll(this.field_146333_g.getText().length())) {
            enabled = GuiCreateWorld.llIIlIllIIIIIl[2];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            enabled = GuiCreateWorld.llIIlIllIIIIIl[1];
        }
        guiButton.enabled = (enabled != 0);
        this.func_146314_g();
    }
    
    private static boolean lIIIllIllIIIIIIl(final int llllllllllllIlllIIIlIllIIlllllIl, final int llllllllllllIlllIIIlIllIIlllllII) {
        return llllllllllllIlllIIIlIllIIlllllIl >= llllllllllllIlllIIIlIllIIlllllII;
    }
    
    private static String lIIIlIlllIllIllI(final String llllllllllllIlllIIIlIllIlIlIllII, final String llllllllllllIlllIIIlIllIlIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIllIlIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIllIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlIllIlIllIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlIllIlIllIIII.init(GuiCreateWorld.llIIlIllIIIIIl[3], llllllllllllIlllIIIlIllIlIllIIIl);
            return new String(llllllllllllIlllIIIlIllIlIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIllIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIllIlIlIllll) {
            llllllllllllIlllIIIlIllIlIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllIllIIIlIlI(final int llllllllllllIlllIIIlIllIIllIIIll, final int llllllllllllIlllIIIlIllIIllIIIlI) {
        return llllllllllllIlllIIIlIllIIllIIIll != llllllllllllIlllIIIlIllIIllIIIlI;
    }
    
    private static boolean lIIIllIllIIIlIIl(final Object llllllllllllIlllIIIlIllIIlllIlIl, final Object llllllllllllIlllIIIlIllIIlllIlII) {
        return llllllllllllIlllIIIlIllIIlllIlIl != llllllllllllIlllIIIlIllIIlllIlII;
    }
    
    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)(GuiCreateWorld.llIIlIllIIIIIl[2] != 0));
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[1], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[28], this.height - GuiCreateWorld.llIIlIllIIIIIl[29], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[29]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[2], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] + GuiCreateWorld.llIIlIllIIIIIl[6], this.height - GuiCreateWorld.llIIlIllIIIIIl[29], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[31]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
        "".length();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton btnGameMode = new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[3], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[32], GuiCreateWorld.llIIlIllIIIIIl[33], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[34]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]));
        this.btnGameMode = btnGameMode;
        buttonList.add(btnGameMode);
        "".length();
        final List<GuiButton> buttonList2 = this.buttonList;
        final GuiButton btnMoreOptions = new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[4], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[32], GuiCreateWorld.llIIlIllIIIIIl[35], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[36]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]));
        this.btnMoreOptions = btnMoreOptions;
        buttonList2.add(btnMoreOptions);
        "".length();
        final List<GuiButton> buttonList3 = this.buttonList;
        final GuiButton btnMapFeatures = new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[5], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[28], GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[38]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]));
        this.btnMapFeatures = btnMapFeatures;
        buttonList3.add(btnMapFeatures);
        "".length();
        this.btnMapFeatures.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
        final List<GuiButton> buttonList4 = this.buttonList;
        final GuiButton btnBonusItems = new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[8], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] + GuiCreateWorld.llIIlIllIIIIIl[6], GuiCreateWorld.llIIlIllIIIIIl[39], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[40]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]));
        this.btnBonusItems = btnBonusItems;
        buttonList4.add(btnBonusItems);
        "".length();
        this.btnBonusItems.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
        final List<GuiButton> buttonList5 = this.buttonList;
        final GuiButton btnMapType = new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[6], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] + GuiCreateWorld.llIIlIllIIIIIl[6], GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[41]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]));
        this.btnMapType = btnMapType;
        buttonList5.add(btnMapType);
        "".length();
        this.btnMapType.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
        final List<GuiButton> buttonList6 = this.buttonList;
        final GuiButton btnAllowCommands = new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[7], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[28], GuiCreateWorld.llIIlIllIIIIIl[39], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[42]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]));
        this.btnAllowCommands = btnAllowCommands;
        buttonList6.add(btnAllowCommands);
        "".length();
        this.btnAllowCommands.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
        final List<GuiButton> buttonList7 = this.buttonList;
        final GuiButton btnCustomizeType = new GuiButton(GuiCreateWorld.llIIlIllIIIIIl[9], this.width / GuiCreateWorld.llIIlIllIIIIIl[3] + GuiCreateWorld.llIIlIllIIIIIl[6], GuiCreateWorld.llIIlIllIIIIIl[43], GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[21], I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[44]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]));
        this.btnCustomizeType = btnCustomizeType;
        buttonList7.add(btnCustomizeType);
        "".length();
        this.btnCustomizeType.visible = (GuiCreateWorld.llIIlIllIIIIIl[1] != 0);
        this.field_146333_g = new GuiTextField(GuiCreateWorld.llIIlIllIIIIIl[10], this.fontRendererObj, this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[45], GuiCreateWorld.llIIlIllIIIIIl[46], GuiCreateWorld.llIIlIllIIIIIl[21]);
        this.field_146333_g.setFocused((boolean)(GuiCreateWorld.llIIlIllIIIIIl[2] != 0));
        this.field_146333_g.setText(this.field_146330_J);
        this.field_146335_h = new GuiTextField(GuiCreateWorld.llIIlIllIIIIIl[11], this.fontRendererObj, this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[45], GuiCreateWorld.llIIlIllIIIIIl[46], GuiCreateWorld.llIIlIllIIIIIl[21]);
        this.field_146335_h.setText(this.field_146329_I);
        this.func_146316_a(this.field_146344_y);
        this.func_146314_g();
        this.func_146319_h();
    }
    
    private static boolean lIIIllIllIIIlIll(final int llllllllllllIlllIIIlIllIIllIIllI) {
        return llllllllllllIlllIIIlIllIIllIIllI > 0;
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiCreateWorld.llIIlIllIIIIIl[1] != 0));
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllIIIlIllIllIIIIlI, final int llllllllllllIlllIIIlIllIllIIIIIl, final float llllllllllllIlllIIIlIllIllIIIIII) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[84]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]), this.width / GuiCreateWorld.llIIlIllIIIIIl[3], GuiCreateWorld.llIIlIllIIIIIl[21], GuiCreateWorld.llIIlIllIIIIIl[85]);
        if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0)) {
            this.drawString(this.fontRendererObj, I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[86]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]), this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[58], GuiCreateWorld.llIIlIllIIIIIl[87]);
            this.drawString(this.fontRendererObj, I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[32]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]), this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[88], GuiCreateWorld.llIIlIllIIIIIl[87]);
            if (lIIIllIllIIIIIlI(this.btnMapFeatures.visible ? 1 : 0)) {
                this.drawString(this.fontRendererObj, I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[89]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]), this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[90], GuiCreateWorld.llIIlIllIIIIIl[87]);
            }
            if (lIIIllIllIIIIIlI(this.btnAllowCommands.visible ? 1 : 0)) {
                this.drawString(this.fontRendererObj, I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[91]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]), this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[30], GuiCreateWorld.llIIlIllIIIIIl[92], GuiCreateWorld.llIIlIllIIIIIl[87]);
            }
            this.field_146335_h.drawTextBox();
            if (lIIIllIllIIIIIlI(WorldType.worldTypes[this.selectedIndex].showWorldInfoNotice() ? 1 : 0)) {
                this.fontRendererObj.drawSplitString(I18n.format(WorldType.worldTypes[this.selectedIndex].func_151359_c(), new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]), this.btnMapType.xPosition + GuiCreateWorld.llIIlIllIIIIIl[3], this.btnMapType.yPosition + GuiCreateWorld.llIIlIllIIIIIl[23], this.btnMapType.getButtonWidth(), GuiCreateWorld.llIIlIllIIIIIl[93]);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
        }
        else {
            this.drawString(this.fontRendererObj, I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[94]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]), this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[58], GuiCreateWorld.llIIlIllIIIIIl[87]);
            this.drawString(this.fontRendererObj, String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[95]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]))).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[96]]).append(this.field_146336_i)), this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[88], GuiCreateWorld.llIIlIllIIIIIl[87]);
            this.field_146333_g.drawTextBox();
            this.drawString(this.fontRendererObj, this.field_146323_G, this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[97], GuiCreateWorld.llIIlIllIIIIIl[87]);
            this.drawString(this.fontRendererObj, this.field_146328_H, this.width / GuiCreateWorld.llIIlIllIIIIIl[3] - GuiCreateWorld.llIIlIllIIIIIl[37], GuiCreateWorld.llIIlIllIIIIIl[98], GuiCreateWorld.llIIlIllIIIIIl[87]);
        }
        super.drawScreen(llllllllllllIlllIIIlIllIllIIIIlI, llllllllllllIlllIIIlIllIllIIIIIl, llllllllllllIlllIIIlIllIllIIIIII);
    }
    
    private static boolean lIIIllIllIIIIllI(final int llllllllllllIlllIIIlIllIlIIIIIIl, final int llllllllllllIlllIIIlIllIlIIIIIII) {
        return llllllllllllIlllIIIlIllIlIIIIIIl == llllllllllllIlllIIIlIllIlIIIIIII;
    }
    
    private static boolean lIIIllIllIIIIlll(final Object llllllllllllIlllIIIlIllIIlllIIIl, final Object llllllllllllIlllIIIlIllIIlllIIII) {
        return llllllllllllIlllIIIlIllIIlllIIIl == llllllllllllIlllIIIlIllIIlllIIII;
    }
    
    private static boolean lIIIllIllIIIIIlI(final int llllllllllllIlllIIIlIllIIllIlIlI) {
        return llllllllllllIlllIIIlIllIIllIlIlI != 0;
    }
    
    private void func_146315_i() {
        int llllllllllllIlllIIIlIllIllIlllll;
        if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0)) {
            llllllllllllIlllIIIlIllIllIlllll = GuiCreateWorld.llIIlIllIIIIIl[1];
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlllIIIlIllIllIlllll = GuiCreateWorld.llIIlIllIIIIIl[2];
        }
        this.func_146316_a((boolean)(llllllllllllIlllIIIlIllIllIlllll != 0));
    }
    
    private static boolean lIIIllIllIIIIIll(final int llllllllllllIlllIIIlIllIIllIlIII) {
        return llllllllllllIlllIIIlIllIIllIlIII == 0;
    }
    
    private void func_146314_g() {
        this.field_146336_i = this.field_146333_g.getText().trim();
        final String llllllllllllIlllIIIlIlllIIIlIIll;
        final byte llllllllllllIlllIIIlIlllIIIlIlII = (byte)((char[])(Object)(llllllllllllIlllIIIlIlllIIIlIIll = (String)(Object)ChatAllowedCharacters.allowedCharactersArray)).length;
        byte llllllllllllIlllIIIlIlllIIIlIlIl = (byte)GuiCreateWorld.llIIlIllIIIIIl[1];
        "".length();
        if (-" ".length() > (0xAA ^ 0xAE)) {
            return;
        }
        while (!lIIIllIllIIIIIIl(llllllllllllIlllIIIlIlllIIIlIlIl, llllllllllllIlllIIIlIlllIIIlIlII)) {
            final char llllllllllllIlllIIIlIlllIIIllIII = llllllllllllIlllIIIlIlllIIIlIIll[llllllllllllIlllIIIlIlllIIIlIlIl];
            this.field_146336_i = this.field_146336_i.replace(llllllllllllIlllIIIlIlllIIIllIII, (char)GuiCreateWorld.llIIlIllIIIIIl[47]);
            ++llllllllllllIlllIIIlIlllIIIlIlIl;
        }
        if (lIIIllIllIIIIIlI(StringUtils.isEmpty((CharSequence)this.field_146336_i) ? 1 : 0)) {
            this.field_146336_i = GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[48]];
        }
        this.field_146336_i = func_146317_a(this.mc.getSaveLoader(), this.field_146336_i);
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlllIIIlIllIllIIlllI, final int llllllllllllIlllIIIlIllIllIIlIIl, final int llllllllllllIlllIIIlIllIllIIllII) throws IOException {
        super.mouseClicked(llllllllllllIlllIIIlIllIllIIlllI, llllllllllllIlllIIIlIllIllIIlIIl, llllllllllllIlllIIIlIllIllIIllII);
        if (lIIIllIllIIIIIlI(this.field_146344_y ? 1 : 0)) {
            this.field_146335_h.mouseClicked(llllllllllllIlllIIIlIllIllIIlllI, llllllllllllIlllIIIlIllIllIIlIIl, llllllllllllIlllIIIlIllIllIIllII);
            "".length();
            if ((0x81 ^ 0x85) <= -" ".length()) {
                return;
            }
        }
        else {
            this.field_146333_g.mouseClicked(llllllllllllIlllIIIlIllIllIIlllI, llllllllllllIlllIIIlIllIllIIlIIl, llllllllllllIlllIIIlIllIllIIllII);
        }
    }
    
    private static void lIIIllIlIlllllll() {
        (llIIlIIIIllllI = new String[GuiCreateWorld.llIIlIllIIIIIl[88]])[GuiCreateWorld.llIIlIllIIIIIl[1]] = lIIIlIlllIllIllI("uigXRh9lQ5o=", "ippiF");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[2]] = lIIIlIlllIllIlll("EB4m", "SQkhf");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[3]] = lIIIlIlllIllIlll("ETAJ", "AbGYs");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[4]] = lIIIlIlllIlllIII("fMIYIdIHbqI=", "NycJj");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[5]] = lIIIlIlllIllIllI("cX/bd9B+Y0I=", "HUYSw");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[6]] = lIIIlIlllIllIllI("+5rlPwTuMxw=", "ZwfwD");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[7]] = lIIIlIlllIllIlll("NCM+QQ==", "wlspB");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[8]] = lIIIlIlllIlllIII("TDSclgCfNEs=", "gSZlF");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[9]] = lIIIlIlllIlllIII("9omoWLMrR80=", "Jhiip");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[10]] = lIIIlIlllIllIllI("TSUO9S3XNII=", "VgkIi");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[11]] = lIIIlIlllIlllIII("ke6CCYRlyAI=", "jJDPM");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[12]] = lIIIlIlllIllIlll("Nj8BTA==", "upLzr");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[13]] = lIIIlIlllIllIllI("YnDVtnWSSv8=", "behlm");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[14]] = lIIIlIlllIlllIII("HS44kjn1/YQ=", "vptpc");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[15]] = lIIIlIlllIllIlll("Ohg5aw==", "yWtRp");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[16]] = lIIIlIlllIllIllI("zvIucQPvYtU=", "jsFPa");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[17]] = lIIIlIlllIllIllI("3m73Slllffo=", "taQDb");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[18]] = lIIIlIlllIllIllI("pGw+pvyk0HI=", "dOESy");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[19]] = lIIIlIlllIllIlll("OgYydQ==", "vVfAX");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[20]] = lIIIlIlllIlllIII("gndvRFpRwds=", "ducTA");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[21]] = lIIIlIlllIllIllI("KIygFRFbsz8=", "Nihca");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[22]] = lIIIlIlllIllIlll("Lxk8Tg==", "cIhyU");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[23]] = lIIIlIlllIllIlll("JigAcg==", "jxTJB");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[24]] = lIIIlIlllIllIlll("KikafQ==", "fyNDd");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[0]] = lIIIlIlllIllIlll("JxQYMRwiAAY=", "TajGu");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[25]] = lIIIlIlllIllIlll("", "KWqum");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[26]] = lIIIlIlllIllIllI("Cj8DFDGdnk0=", "lZtej");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[27]] = lIIIlIlllIlllIII("GJ3X3Jybwg+avbEu7WUqgxzb5LWyndNo", "QvSsB");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[29]] = lIIIlIlllIllIllI("njPZ7ZqpZ26dHlS9JeBgWh9nO4JoYpTW", "YlPmD");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[31]] = lIIIlIlllIlllIII("9kshQBCY9NoSy8TyKD2DWA==", "RrqXk");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[34]] = lIIIlIlllIllIllI("W600cWz0PU5Elh57lKzarnxuo5mOvEiD", "wCHIh");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[36]] = lIIIlIlllIlllIII("C2yVjKwJJc/o72hTB49kCY45FI0Tg1Og1P80F4Cl/Oc=", "DMIBd");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[38]] = lIIIlIlllIlllIII("XKmt7EJT2L+3YhPmzeDC79RDXblgk3eB", "MYOtf");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[40]] = lIIIlIlllIllIlll("ABwiPRIHLiEqHRdXLDcfBgoHLBQeCg==", "syNXq");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[41]] = lIIIlIlllIllIllI("Db0GDKmENmSag2E6UI5S5Wme9xqbEMnh", "vgclg");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[42]] = lIIIlIlllIlllIII("7uk5HmuNI8jKLTryf6v51qpssemvCWLXFZbuGlUbQ1Q=", "oQwQv");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[44]] = lIIIlIlllIlllIII("5EgGZSkbHf81ufV71K/txYAm3kaYk0mjZvlcM5AdamQ=", "yqpaQ");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[48]] = lIIIlIlllIlllIII("Lor3OsEdqts=", "TOApL");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[49]] = lIIIlIlllIllIlll("OT8vIjk+DSw1Ni50JCY3LxcsIz8=", "JZCGZ");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[50]] = lIIIlIlllIlllIII("euBLxqhR9JQ=", "kEMji");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[51]] = lIIIlIlllIllIllI("6OqNAkRjfGtNLLouELSoA29665szwf5F", "xOjoN");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[52]] = lIIIlIlllIlllIII("ihF5wCjBzya3ZGDf6WEkQ6+VHeSXy4nw", "xdDtN");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[53]] = lIIIlIlllIlllIII("DMF5V6Dr7y0=", "JcPdL");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[54]] = lIIIlIlllIlllIII("NX2r2jNQTVNhMAwn/G/ES0pxLT8FrDaE", "PkOvn");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[55]] = lIIIlIlllIllIllI("QfNvhvMCo+o=", "jnlWt");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[56]] = lIIIlIlllIlllIII("aJeKgZJO2ETO6n4fBNtORiMTB0kwQ3oz", "rXmZA");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[57]] = lIIIlIlllIlllIII("cjcJnfCIYT8=", "ZfkvN");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[58]] = lIIIlIlllIlllIII("6qYVYM6N2diu46723oG7lQ==", "ebARs");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[59]] = lIIIlIlllIllIlll("CCkiGB0JKngeFAE=", "gYVqr");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[60]] = lIIIlIlllIllIlll("BwwcEysAPh8EJBBHEhkmARo5Ai0ZGg==", "tipvH");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[61]] = lIIIlIlllIllIllI("K7ti8RDgUKI=", "jTFKP");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[62]] = lIIIlIlllIllIlll("PAQEAjw9B14EPQ==", "StpkS");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[63]] = lIIIlIlllIllIllI("42wtlHyKxrD+oE6ZUZm84w==", "juVuz");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[64]] = lIIIlIlllIllIllI("7OAqxvcdbl7T0vn1GFJJB0rmaT7HYJal", "kqzwK");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[65]] = lIIIlIlllIlllIII("r5/hXhOjU4s=", "VmeIS");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[66]] = lIIIlIlllIllIlll("CyQ2IDAMFjU3PxxvOyk/FzYZKj4VIDQhIA==", "xAZES");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[67]] = lIIIlIlllIllIlll("VA==", "tUgcc");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[68]] = lIIIlIlllIllIllI("G3kBbVSo1czGgAgUwNye3w==", "WmkEO");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[69]] = lIIIlIlllIllIllI("DtcUG7Ezlsjr7aICxPJU9g==", "ivmwb");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[70]] = lIIIlIlllIlllIII("Tk8KdJ8Sy2g=", "jiZzL");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[45]] = lIIIlIlllIllIllI("HNOMM/it7N0=", "hMVtp");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[71]] = lIIIlIlllIllIlll("Jg==", "ydBpI");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[72]] = lIIIlIlllIllIlll("Bw==", "Xqbmh");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[73]] = lIIIlIlllIlllIII("9k81spAIjHw=", "tzvRD");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[74]] = lIIIlIlllIlllIII("VOLzk3cv4OjDLAR/ju0nzg==", "DBEfE");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[75]] = lIIIlIlllIllIlll("OS8VLBs+PAI=", "QNgHx");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[76]] = lIIIlIlllIllIlll("CSgTEhsOOwQ=", "aIavx");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[77]] = lIIIlIlllIlllIII("wY7TxMA6pPcG4rGK8dzc1w==", "Jyaib");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[78]] = lIIIlIlllIlllIII("PZQXd15/VfEf/RzJlrmzxA==", "gURBj");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[79]] = lIIIlIlllIllIlll("", "BsdQU");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[80]] = lIIIlIlllIllIllI("agg4qoqXbsLnqFi5X9HSQw==", "cZtJp");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[81]] = lIIIlIlllIllIlll("FSQxSCYdPz0=", "rQXfB");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[82]] = lIIIlIlllIllIllI("HKadsEd/5AtK6QLdZK1COUcRUC6qptL3xBeXr/rX9Ck=", "RdPQH");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[84]] = lIIIlIlllIllIllI("l6E+ySRoZkp9mPDmdMMhhdv5L2CsmQ0f", "IbUTP");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[86]] = lIIIlIlllIlllIII("blXCZeyjREIIyuTzLfw1xAJ6++ussNWQ", "nTKvZ");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[32]] = lIIIlIlllIlllIII("4hMlof8Y0MyUk3npd0j+X5obq4INDVqt", "iTTYk");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[89]] = lIIIlIlllIlllIII("FeZUelbPXtZPR60sQ5hkTPBoytg8vmfkpnhODFbxMxg=", "idNkP");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[91]] = lIIIlIlllIlllIII("HTlLHxgvsVJvqaig15m4p9LBEVyk8OH2xgBeRZ8zKEQ=", "QHsGV");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[94]] = lIIIlIlllIlllIII("/fwAjWfMe4zzDQCVS8GdPJywo9ckslVl", "lAvdO");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[95]] = lIIIlIlllIllIllI("x45br7yjGqZ0DAWwVOK+6vnV+jdZpcp/QGcBL6rivoQ=", "gyhdE");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[96]] = lIIIlIlllIllIllI("HpB4lN4NGVI=", "ntXyZ");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[99]] = lIIIlIlllIlllIII("x+6Z0nJyRhp9CJ4oStLUNfJnrTTYLEoM+YnVdpetJhw=", "PbzIj");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[100]] = lIIIlIlllIlllIII("d/FRiYjW1Fc34dOxgk/O1g==", "grwMi");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[101]] = lIIIlIlllIllIllI("DtBEjZJgo+I0Dvq/JoJxSA==", "jpuKd");
        GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[102]] = lIIIlIlllIllIlll("ExAgFz4ZFCA=", "pbEvJ");
    }
    
    private static boolean lIIIllIllIIIllII(final int llllllllllllIlllIIIlIllIIllllIIl, final int llllllllllllIlllIIIlIllIIllllIII) {
        return llllllllllllIlllIIIlIllIIllllIIl < llllllllllllIlllIIIlIllIIllllIII;
    }
    
    private static String lIIIlIlllIlllIII(final String llllllllllllIlllIIIlIllIlIIlllll, final String llllllllllllIlllIIIlIllIlIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIllIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIllIlIlIIIII.getBytes(StandardCharsets.UTF_8)), GuiCreateWorld.llIIlIllIIIIIl[9]), "DES");
            final Cipher llllllllllllIlllIIIlIllIlIlIIIll = Cipher.getInstance("DES");
            llllllllllllIlllIIIlIllIlIlIIIll.init(GuiCreateWorld.llIIlIllIIIIIl[3], llllllllllllIlllIIIlIllIlIlIIlII);
            return new String(llllllllllllIlllIIIlIllIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIllIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIllIlIlIIIlI) {
            llllllllllllIlllIIIlIllIlIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private boolean func_175299_g() {
        final WorldType llllllllllllIlllIIIlIllIlllIlIII = WorldType.worldTypes[this.selectedIndex];
        int shiftKeyDown;
        if (lIIIllIllIIIlIII(llllllllllllIlllIIIlIllIlllIlIII) && lIIIllIllIIIIIlI(llllllllllllIlllIIIlIllIlllIlIII.getCanBeCreated() ? 1 : 0)) {
            if (lIIIllIllIIIIlll(llllllllllllIlllIIIlIllIlllIlIII, WorldType.DEBUG_WORLD)) {
                shiftKeyDown = (GuiScreen.isShiftKeyDown() ? 1 : 0);
                "".length();
                if ((0x21 ^ 0x3C ^ (0x97 ^ 0x8E)) == -" ".length()) {
                    return ((0x0 ^ 0x23 ^ (0xD2 ^ 0x93)) & (0x9 ^ 0x17 ^ (0x3 ^ 0x7F) ^ -" ".length())) != 0x0;
                }
            }
            else {
                shiftKeyDown = GuiCreateWorld.llIIlIllIIIIIl[2];
                "".length();
                if (null != null) {
                    return ((9 + 133 - 53 + 92 ^ 103 + 19 - 32 + 74) & (159 + 128 - 264 + 140 ^ 149 + 145 - 269 + 153 ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            shiftKeyDown = GuiCreateWorld.llIIlIllIIIIIl[1];
        }
        return shiftKeyDown != 0;
    }
    
    private static void lIIIllIllIIIIIII() {
        (llIIlIllIIIIIl = new int[103])[0] = (0xA5 ^ 0xBD);
        GuiCreateWorld.llIIlIllIIIIIl[1] = ((((0x3A ^ 0x1C) & ~(0x50 ^ 0x76)) ^ (0x80 ^ 0x86)) & (34 + 69 - 25 + 89 ^ 88 + 83 - 131 + 121 ^ -" ".length()));
        GuiCreateWorld.llIIlIllIIIIIl[2] = " ".length();
        GuiCreateWorld.llIIlIllIIIIIl[3] = "  ".length();
        GuiCreateWorld.llIIlIllIIIIIl[4] = "   ".length();
        GuiCreateWorld.llIIlIllIIIIIl[5] = (0x6E ^ 0x6A);
        GuiCreateWorld.llIIlIllIIIIIl[6] = (0xEB ^ 0x9E ^ (0x6C ^ 0x1C));
        GuiCreateWorld.llIIlIllIIIIIl[7] = (0x13 ^ 0x15);
        GuiCreateWorld.llIIlIllIIIIIl[8] = (0x45 ^ 0x42);
        GuiCreateWorld.llIIlIllIIIIIl[9] = (0x53 ^ 0x34 ^ (0xF0 ^ 0x9F));
        GuiCreateWorld.llIIlIllIIIIIl[10] = (142 + 19 - 41 + 54 ^ 42 + 83 + 16 + 26);
        GuiCreateWorld.llIIlIllIIIIIl[11] = (0x78 ^ 0x2D ^ (0xF2 ^ 0xAD));
        GuiCreateWorld.llIIlIllIIIIIl[12] = (0x14 ^ 0x74 ^ (0x21 ^ 0x4A));
        GuiCreateWorld.llIIlIllIIIIIl[13] = (0x11 ^ 0x1D);
        GuiCreateWorld.llIIlIllIIIIIl[14] = (103 + 8 + 54 + 5 ^ 165 + 107 - 198 + 93);
        GuiCreateWorld.llIIlIllIIIIIl[15] = (0x2F ^ 0x21);
        GuiCreateWorld.llIIlIllIIIIIl[16] = (0x75 ^ 0x1E ^ (0x3E ^ 0x5A));
        GuiCreateWorld.llIIlIllIIIIIl[17] = (" ".length() ^ (0x2A ^ 0x3B));
        GuiCreateWorld.llIIlIllIIIIIl[18] = (0x41 ^ 0x50);
        GuiCreateWorld.llIIlIllIIIIIl[19] = (0xB8 ^ 0xAA);
        GuiCreateWorld.llIIlIllIIIIIl[20] = (0x6A ^ 0x24 ^ (0xD2 ^ 0x8F));
        GuiCreateWorld.llIIlIllIIIIIl[21] = (0x5E ^ 0x4A);
        GuiCreateWorld.llIIlIllIIIIIl[22] = (0x18 ^ 0x15 ^ (0x9F ^ 0x87));
        GuiCreateWorld.llIIlIllIIIIIl[23] = (0x94 ^ 0x82);
        GuiCreateWorld.llIIlIllIIIIIl[24] = (0x57 ^ 0xD ^ (0x53 ^ 0x1E));
        GuiCreateWorld.llIIlIllIIIIIl[25] = (0xB2 ^ 0xAB);
        GuiCreateWorld.llIIlIllIIIIIl[26] = (0xBA ^ 0x87 ^ (0x6 ^ 0x21));
        GuiCreateWorld.llIIlIllIIIIIl[27] = (0x41 ^ 0x5A);
        GuiCreateWorld.llIIlIllIIIIIl[28] = (0x86 ^ 0xC7) + (67 + 108 - 65 + 19) - (0x1A ^ 0x49) + (0x77 ^ 0x5B);
        GuiCreateWorld.llIIlIllIIIIIl[29] = (42 + 131 - 169 + 132 ^ 98 + 102 - 146 + 94);
        GuiCreateWorld.llIIlIllIIIIIl[30] = (0xC ^ 0x21) + (0x6A ^ 0x27) - (0x91 ^ 0xB2) + (0x1E ^ 0x21);
        GuiCreateWorld.llIIlIllIIIIIl[31] = (0x29 ^ 0x60 ^ (0x96 ^ 0xC2));
        GuiCreateWorld.llIIlIllIIIIIl[32] = (0xB8 ^ 0x95 ^ (0x50 ^ 0x36));
        GuiCreateWorld.llIIlIllIIIIIl[33] = (0x70 ^ 0x3);
        GuiCreateWorld.llIIlIllIIIIIl[34] = (0x83 ^ 0x9D);
        GuiCreateWorld.llIIlIllIIIIIl[35] = 179 + 62 - 143 + 89;
        GuiCreateWorld.llIIlIllIIIIIl[36] = (101 + 2 - 80 + 105 ^ 85 + 78 - 28 + 24);
        GuiCreateWorld.llIIlIllIIIIIl[37] = (0x47 ^ 0x5A ^ (0xCF ^ 0xB6));
        GuiCreateWorld.llIIlIllIIIIIl[38] = (0x4 ^ 0x5A ^ (0x73 ^ 0xD));
        GuiCreateWorld.llIIlIllIIIIIl[39] = (0x63 ^ 0x64) + (0x18 ^ 0x45) - (0x1E ^ 0x7D) + (89 + 74 - 83 + 70);
        GuiCreateWorld.llIIlIllIIIIIl[40] = (0x59 ^ 0x5D ^ (0x8E ^ 0xAB));
        GuiCreateWorld.llIIlIllIIIIIl[41] = (0x2B ^ 0x9);
        GuiCreateWorld.llIIlIllIIIIIl[42] = (0x36 ^ 0x15);
        GuiCreateWorld.llIIlIllIIIIIl[43] = (0xDB ^ 0xA3);
        GuiCreateWorld.llIIlIllIIIIIl[44] = (0xB ^ 0x12 ^ (0x28 ^ 0x15));
        GuiCreateWorld.llIIlIllIIIIIl[45] = (0x19 ^ 0x25);
        GuiCreateWorld.llIIlIllIIIIIl[46] = 174 + 21 - 35 + 40;
        GuiCreateWorld.llIIlIllIIIIIl[47] = (156 + 162 - 185 + 118 ^ 158 + 92 - 145 + 59);
        GuiCreateWorld.llIIlIllIIIIIl[48] = (0xEB ^ 0x8E ^ (0xE2 ^ 0xA2));
        GuiCreateWorld.llIIlIllIIIIIl[49] = (0x25 ^ 0x3);
        GuiCreateWorld.llIIlIllIIIIIl[50] = (52 + 76 + 4 + 2 ^ 142 + 156 - 230 + 93);
        GuiCreateWorld.llIIlIllIIIIIl[51] = (0xAE ^ 0x86);
        GuiCreateWorld.llIIlIllIIIIIl[52] = (0x7D ^ 0x9 ^ (0x23 ^ 0x7E));
        GuiCreateWorld.llIIlIllIIIIIl[53] = (0x94 ^ 0xBE);
        GuiCreateWorld.llIIlIllIIIIIl[54] = (0x93 ^ 0xC7 ^ 122 + 88 - 127 + 44);
        GuiCreateWorld.llIIlIllIIIIIl[55] = (0x25 ^ 0x9);
        GuiCreateWorld.llIIlIllIIIIIl[56] = (123 + 94 - 142 + 62 ^ 40 + 143 - 25 + 6);
        GuiCreateWorld.llIIlIllIIIIIl[57] = (0x99 ^ 0xB7 ^ ((0x2D ^ 0x31) & ~(0x7D ^ 0x61)));
        GuiCreateWorld.llIIlIllIIIIIl[58] = (0x37 ^ 0x1E ^ (0x6A ^ 0x6C));
        GuiCreateWorld.llIIlIllIIIIIl[59] = (34 + 150 - 43 + 21 ^ 2 + 69 - 2 + 77);
        GuiCreateWorld.llIIlIllIIIIIl[60] = (68 + 39 - 23 + 45 ^ 125 + 77 - 79 + 53);
        GuiCreateWorld.llIIlIllIIIIIl[61] = (0x2D ^ 0x1F);
        GuiCreateWorld.llIIlIllIIIIIl[62] = (0x75 ^ 0x39 ^ 125 + 4 - 91 + 89);
        GuiCreateWorld.llIIlIllIIIIIl[63] = (0x98 ^ 0xAC);
        GuiCreateWorld.llIIlIllIIIIIl[64] = (91 + 31 - 105 + 113 ^ 93 + 56 - 136 + 170);
        GuiCreateWorld.llIIlIllIIIIIl[65] = (0xF ^ 0x3 ^ (0xC ^ 0x36));
        GuiCreateWorld.llIIlIllIIIIIl[66] = (0x8F ^ 0xA9 ^ (0x37 ^ 0x26));
        GuiCreateWorld.llIIlIllIIIIIl[67] = (135 + 8 - 108 + 103 ^ 144 + 81 - 206 + 159);
        GuiCreateWorld.llIIlIllIIIIIl[68] = (141 + 40 - 59 + 27 ^ 76 + 129 - 129 + 96);
        GuiCreateWorld.llIIlIllIIIIIl[69] = (0x32 ^ 0x8);
        GuiCreateWorld.llIIlIllIIIIIl[70] = (0x75 ^ 0x4E);
        GuiCreateWorld.llIIlIllIIIIIl[71] = (0x2C ^ 0x11);
        GuiCreateWorld.llIIlIllIIIIIl[72] = (0x5A ^ 0x64);
        GuiCreateWorld.llIIlIllIIIIIl[73] = (0x32 ^ 0xD);
        GuiCreateWorld.llIIlIllIIIIIl[74] = (2 + 95 + 89 + 20 ^ 24 + 98 - 25 + 45);
        GuiCreateWorld.llIIlIllIIIIIl[75] = (0xB0 ^ 0x81 ^ (0x63 ^ 0x13));
        GuiCreateWorld.llIIlIllIIIIIl[76] = (0x9 ^ 0x4B);
        GuiCreateWorld.llIIlIllIIIIIl[77] = (111 + 86 - 100 + 31 ^ 80 + 68 - 67 + 114);
        GuiCreateWorld.llIIlIllIIIIIl[78] = (0x4B ^ 0x40 ^ (0x7F ^ 0x30));
        GuiCreateWorld.llIIlIllIIIIIl[79] = (0x73 ^ 0x36);
        GuiCreateWorld.llIIlIllIIIIIl[80] = (125 + 85 - 34 + 39 ^ 74 + 27 + 13 + 31);
        GuiCreateWorld.llIIlIllIIIIIl[81] = (118 + 2 - 80 + 178 ^ 38 + 98 - 4 + 25);
        GuiCreateWorld.llIIlIllIIIIIl[82] = (55 + 168 - 86 + 87 ^ 116 + 35 - 97 + 114);
        GuiCreateWorld.llIIlIllIIIIIl[83] = (0xB8 ^ 0xA3) + (0x30 ^ 0x38) - -(0xB6 ^ 0xBE) + (0x30 ^ 0x41);
        GuiCreateWorld.llIIlIllIIIIIl[84] = (0x7 ^ 0x6A ^ (0x6F ^ 0x4B));
        GuiCreateWorld.llIIlIllIIIIIl[85] = -" ".length();
        GuiCreateWorld.llIIlIllIIIIIl[86] = (182 + 96 - 128 + 94 ^ 20 + 100 - 26 + 96);
        GuiCreateWorld.llIIlIllIIIIIl[87] = -(0xFFFFFF63 & 0x5F5FFC);
        GuiCreateWorld.llIIlIllIIIIIl[88] = (0x5F ^ 0xA);
        GuiCreateWorld.llIIlIllIIIIIl[89] = (167 + 120 - 134 + 64 ^ 139 + 92 - 100 + 18);
        GuiCreateWorld.llIIlIllIIIIIl[90] = (0xD6 ^ 0xAC);
        GuiCreateWorld.llIIlIllIIIIIl[91] = (0xC9 ^ 0x84);
        GuiCreateWorld.llIIlIllIIIIIl[92] = 138 + 42 - 18 + 10;
        GuiCreateWorld.llIIlIllIIIIIl[93] = (0xFFFFE9BC & 0xA0B6E3);
        GuiCreateWorld.llIIlIllIIIIIl[94] = (0x2 ^ 0x4C);
        GuiCreateWorld.llIIlIllIIIIIl[95] = (0x32 ^ 0x7D);
        GuiCreateWorld.llIIlIllIIIIIl[96] = (0xE0 ^ 0xB0);
        GuiCreateWorld.llIIlIllIIIIIl[97] = (0x16 ^ 0x23) + (0x1C ^ 0x2B) - (0x26 ^ 0x4E) + (26 + 1 + 103 + 3);
        GuiCreateWorld.llIIlIllIIIIIl[98] = (0xD ^ 0x68) + (0x9C ^ 0x98) - -(0x28 ^ 0xF) + (0x68 ^ 0x6D);
        GuiCreateWorld.llIIlIllIIIIIl[99] = (0xDE ^ 0x8F);
        GuiCreateWorld.llIIlIllIIIIIl[100] = (243 + 171 - 323 + 153 ^ 81 + 76 - 156 + 165);
        GuiCreateWorld.llIIlIllIIIIIl[101] = (0xCC ^ 0x9F);
        GuiCreateWorld.llIIlIllIIIIIl[102] = (23 + 204 - 111 + 100 ^ 126 + 5 - 45 + 54);
    }
    
    private void func_146319_h() {
        this.btnGameMode.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[49]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]))).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[50]]).append(I18n.format(String.valueOf(new StringBuilder(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[51]]).append(this.gameMode)), new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
        this.field_146323_G = I18n.format(String.valueOf(new StringBuilder(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[52]]).append(this.gameMode).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[53]])), new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]);
        this.field_146328_H = I18n.format(String.valueOf(new StringBuilder(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[54]]).append(this.gameMode).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[55]])), new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]);
        this.btnMapFeatures.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[56]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]))).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[57]]));
        if (lIIIllIllIIIIIlI(this.field_146341_s ? 1 : 0)) {
            this.btnMapFeatures.displayString = String.valueOf(new StringBuilder(String.valueOf(this.btnMapFeatures.displayString)).append(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[58]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this.btnMapFeatures.displayString = String.valueOf(new StringBuilder(String.valueOf(this.btnMapFeatures.displayString)).append(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[59]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
        }
        this.btnBonusItems.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[60]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]))).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[61]]));
        if (lIIIllIllIIIIIlI(this.field_146338_v ? 1 : 0) && lIIIllIllIIIIIll(this.field_146337_w ? 1 : 0)) {
            this.btnBonusItems.displayString = String.valueOf(new StringBuilder(String.valueOf(this.btnBonusItems.displayString)).append(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[62]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            this.btnBonusItems.displayString = String.valueOf(new StringBuilder(String.valueOf(this.btnBonusItems.displayString)).append(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[63]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
        }
        this.btnMapType.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[64]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]))).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[65]]).append(I18n.format(WorldType.worldTypes[this.selectedIndex].getTranslateName(), new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
        this.btnAllowCommands.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[66]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]]))).append(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[67]]));
        if (lIIIllIllIIIIIlI(this.allowCheats ? 1 : 0) && lIIIllIllIIIIIll(this.field_146337_w ? 1 : 0)) {
            this.btnAllowCommands.displayString = String.valueOf(new StringBuilder(String.valueOf(this.btnAllowCommands.displayString)).append(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[68]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            this.btnAllowCommands.displayString = String.valueOf(new StringBuilder(String.valueOf(this.btnAllowCommands.displayString)).append(I18n.format(GuiCreateWorld.llIIlIIIIllllI[GuiCreateWorld.llIIlIllIIIIIl[69]], new Object[GuiCreateWorld.llIIlIllIIIIIl[1]])));
        }
    }
    
    private static boolean lIIIllIllIIIlIII(final Object llllllllllllIlllIIIlIllIIllIlllI) {
        return llllllllllllIlllIIIlIllIIllIlllI != null;
    }
    
    @Override
    public void updateScreen() {
        this.field_146333_g.updateCursorCounter();
        this.field_146335_h.updateCursorCounter();
    }
    
    private static boolean lIIIllIllIIIIlII(final Object llllllllllllIlllIIIlIllIIllIllII) {
        return llllllllllllIlllIIIlIllIIllIllII == null;
    }
}
