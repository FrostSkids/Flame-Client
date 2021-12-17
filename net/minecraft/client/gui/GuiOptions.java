// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.client.stream.IStream;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.stream.GuiStreamUnavailable;
import net.minecraft.client.gui.stream.GuiStreamOptions;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;

public class GuiOptions extends GuiScreen implements GuiYesNoCallback
{
    private /* synthetic */ GuiLockIconButton field_175356_r;
    private static final /* synthetic */ String[] lIlllIIlIIIllI;
    private static final /* synthetic */ int[] lIlllIlIlllIll;
    private /* synthetic */ GuiButton field_175357_i;
    private final /* synthetic */ GameSettings game_settings_1;
    private final /* synthetic */ GuiScreen field_146441_g;
    private static final /* synthetic */ GameSettings.Options[] field_146440_f;
    protected /* synthetic */ String field_146442_a;
    
    @Override
    public void initGui() {
        int llllllllllllIllllIllllIlIlIlllIl = GuiOptions.lIlllIlIlllIll[1];
        this.field_146442_a = I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[0]], new Object[GuiOptions.lIlllIlIlllIll[1]]);
        final long llllllllllllIllllIllllIlIlIIlIll;
        final boolean llllllllllllIllllIllllIlIlIIllIl = ((GameSettings.Options[])(Object)(llllllllllllIllllIllllIlIlIIlIll = (long)(Object)GuiOptions.field_146440_f)).length != 0;
        Exception llllllllllllIllllIllllIlIlIIllll = (Exception)GuiOptions.lIlllIlIlllIll[1];
        "".length();
        if ("  ".length() <= -" ".length()) {
            return;
        }
        while (!lIIIIIllIIIIIlII((int)llllllllllllIllllIllllIlIlIIllll, llllllllllllIllllIllllIlIlIIllIl ? 1 : 0)) {
            final GameSettings.Options llllllllllllIllllIllllIlIlIllIll = llllllllllllIllllIllllIlIlIIlIll[llllllllllllIllllIllllIlIlIIllll];
            if (lIIIIIllIIIIIIll(llllllllllllIllllIllllIlIlIllIll.getEnumFloat() ? 1 : 0)) {
                this.buttonList.add(new GuiOptionSlider(llllllllllllIllllIllllIlIlIllIll.returnEnumOrdinal(), this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3] + llllllllllllIllllIllllIlIlIlllIl % GuiOptions.lIlllIlIlllIll[2] * GuiOptions.lIlllIlIlllIll[4], this.height / GuiOptions.lIlllIlIlllIll[5] - GuiOptions.lIlllIlIlllIll[6] + GuiOptions.lIlllIlIlllIll[7] * (llllllllllllIllllIllllIlIlIlllIl >> GuiOptions.lIlllIlIlllIll[0]), llllllllllllIllllIllllIlIlIllIll));
                "".length();
                "".length();
                if (-" ".length() == "   ".length()) {
                    return;
                }
            }
            else {
                final GuiOptionButton llllllllllllIllllIllllIlIlIllIIl = new GuiOptionButton(llllllllllllIllllIllllIlIlIllIll.returnEnumOrdinal(), this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3] + llllllllllllIllllIllllIlIlIlllIl % GuiOptions.lIlllIlIlllIll[2] * GuiOptions.lIlllIlIlllIll[4], this.height / GuiOptions.lIlllIlIlllIll[5] - GuiOptions.lIlllIlIlllIll[6] + GuiOptions.lIlllIlIlllIll[7] * (llllllllllllIllllIllllIlIlIlllIl >> GuiOptions.lIlllIlIlllIll[0]), llllllllllllIllllIllllIlIlIllIll, this.game_settings_1.getKeyBinding(llllllllllllIllllIllllIlIlIllIll));
                this.buttonList.add(llllllllllllIllllIllllIlIlIllIIl);
                "".length();
            }
            ++llllllllllllIllllIllllIlIlIlllIl;
            ++llllllllllllIllllIllllIlIlIIllll;
        }
        if (lIIIIIllIIIIIlIl(this.mc.theWorld)) {
            final EnumDifficulty llllllllllllIllllIllllIlIlIlIlll = this.mc.theWorld.getDifficulty();
            this.field_175357_i = new GuiButton(GuiOptions.lIlllIlIlllIll[8], this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3] + llllllllllllIllllIllllIlIlIlllIl % GuiOptions.lIlllIlIlllIll[2] * GuiOptions.lIlllIlIlllIll[4], this.height / GuiOptions.lIlllIlIlllIll[5] - GuiOptions.lIlllIlIlllIll[6] + GuiOptions.lIlllIlIlllIll[7] * (llllllllllllIllllIllllIlIlIlllIl >> GuiOptions.lIlllIlIlllIll[0]), GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], this.func_175355_a(llllllllllllIllllIllllIlIlIlIlll));
            this.buttonList.add(this.field_175357_i);
            "".length();
            if (lIIIIIllIIIIIIll(this.mc.isSingleplayer() ? 1 : 0) && lIIIIIllIIIIIllI(this.mc.theWorld.getWorldInfo().isHardcoreModeEnabled() ? 1 : 0)) {
                this.field_175357_i.setWidth(this.field_175357_i.getButtonWidth() - GuiOptions.lIlllIlIlllIll[10]);
                this.field_175356_r = new GuiLockIconButton(GuiOptions.lIlllIlIlllIll[11], this.field_175357_i.xPosition + this.field_175357_i.getButtonWidth(), this.field_175357_i.yPosition);
                this.buttonList.add(this.field_175356_r);
                "".length();
                this.field_175356_r.func_175229_b(this.mc.theWorld.getWorldInfo().isDifficultyLocked());
                final GuiLockIconButton field_175356_r = this.field_175356_r;
                int enabled;
                if (lIIIIIllIIIIIIll(this.field_175356_r.func_175230_c() ? 1 : 0)) {
                    enabled = GuiOptions.lIlllIlIlllIll[1];
                    "".length();
                    if (-" ".length() >= (0x98 ^ 0x9C)) {
                        return;
                    }
                }
                else {
                    enabled = GuiOptions.lIlllIlIlllIll[0];
                }
                field_175356_r.enabled = (enabled != 0);
                final GuiButton field_175357_i = this.field_175357_i;
                int enabled2;
                if (lIIIIIllIIIIIIll(this.field_175356_r.func_175230_c() ? 1 : 0)) {
                    enabled2 = GuiOptions.lIlllIlIlllIll[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    enabled2 = GuiOptions.lIlllIlIlllIll[0];
                }
                field_175357_i.enabled = (enabled2 != 0);
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return;
                }
            }
            else {
                this.field_175357_i.enabled = (GuiOptions.lIlllIlIlllIll[1] != 0);
            }
        }
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[12], this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[13] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[2]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[14], this.width / GuiOptions.lIlllIlIlllIll[2] + GuiOptions.lIlllIlIlllIll[15], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[13] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[16]]) {
            private static final /* synthetic */ int[] llIIIIIIlllllI;
            
            @Override
            public void playPressSound(final SoundHandler llllllllllllIlllIllllIllIIIllIII) {
                final SoundCategory[] lllllllllllllIIllllIlIIlIlIlllII = new SoundCategory[GuiOptions$1.llIIIIIIlllllI[0]];
                lllllllllllllIIllllIlIIlIlIlllII[GuiOptions$1.llIIIIIIlllllI[1]] = SoundCategory.ANIMALS;
                lllllllllllllIIllllIlIIlIlIlllII[GuiOptions$1.llIIIIIIlllllI[2]] = SoundCategory.BLOCKS;
                lllllllllllllIIllllIlIIlIlIlllII[GuiOptions$1.llIIIIIIlllllI[3]] = SoundCategory.MOBS;
                lllllllllllllIIllllIlIIlIlIlllII[GuiOptions$1.llIIIIIIlllllI[4]] = SoundCategory.PLAYERS;
                lllllllllllllIIllllIlIIlIlIlllII[GuiOptions$1.llIIIIIIlllllI[5]] = SoundCategory.WEATHER;
                final SoundEventAccessorComposite llllllllllllIlllIllllIllIIIllIIl = llllllllllllIlllIllllIllIIIllIII.getRandomSoundFromCategories(lllllllllllllIIllllIlIIlIlIlllII);
                if (lIIIIlllIIIlIlll(llllllllllllIlllIllllIllIIIllIIl)) {
                    llllllllllllIlllIllllIllIIIllIII.playSound(PositionedSoundRecord.create(llllllllllllIlllIllllIllIIIllIIl.getSoundEventLocation(), 0.5f));
                }
            }
            
            private static boolean lIIIIlllIIIlIlll(final Object llllllllllllIlllIllllIllIIIlIlIl) {
                return llllllllllllIlllIllllIllIIIlIlIl != null;
            }
            
            private static void lIIIIlllIIIlIlIl() {
                (llIIIIIIlllllI = new int[6])[0] = (88 + 80 - 16 + 19 ^ 92 + 172 - 102 + 12);
                GuiOptions$1.llIIIIIIlllllI[1] = ((0x47 ^ 0x9) & ~(0x8C ^ 0xC2));
                GuiOptions$1.llIIIIIIlllllI[2] = " ".length();
                GuiOptions$1.llIIIIIIlllllI[3] = "  ".length();
                GuiOptions$1.llIIIIIIlllllI[4] = "   ".length();
                GuiOptions$1.llIIIIIIlllllI[5] = (0x13 ^ 0x9 ^ (0xB1 ^ 0xAF));
            }
            
            static {
                lIIIIlllIIIlIlIl();
            }
        });
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[17], this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[18] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[19]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[20], this.width / GuiOptions.lIlllIlIlllIll[2] + GuiOptions.lIlllIlIlllIll[15], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[18] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[15]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[21], this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[22] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[5]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[23], this.width / GuiOptions.lIlllIlIlllIll[2] + GuiOptions.lIlllIlIlllIll[15], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[22] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[24]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[25], this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[26] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[27]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[28], this.width / GuiOptions.lIlllIlIlllIll[2] + GuiOptions.lIlllIlIlllIll[15], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[26] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[29]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[30], this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[3], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[31] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[32]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[33], this.width / GuiOptions.lIlllIlIlllIll[2] + GuiOptions.lIlllIlIlllIll[15], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[31] - GuiOptions.lIlllIlIlllIll[5], GuiOptions.lIlllIlIlllIll[9], GuiOptions.lIlllIlIlllIll[10], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[34]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiOptions.lIlllIlIlllIll[35], this.width / GuiOptions.lIlllIlIlllIll[2] - GuiOptions.lIlllIlIlllIll[23], this.height / GuiOptions.lIlllIlIlllIll[5] + GuiOptions.lIlllIlIlllIll[36], I18n.format(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[6]], new Object[GuiOptions.lIlllIlIlllIll[1]])));
        "".length();
    }
    
    public String func_175355_a(final EnumDifficulty llllllllllllIllllIllllIlIIlllIII) {
        final IChatComponent llllllllllllIllllIllllIlIIlllIlI = new ChatComponentText(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[37]]);
        llllllllllllIllllIllllIlIIlllIlI.appendSibling(new ChatComponentTranslation(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[38]], new Object[GuiOptions.lIlllIlIlllIll[1]]));
        "".length();
        llllllllllllIllllIllllIlIIlllIlI.appendText(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[39]]);
        "".length();
        llllllllllllIllllIllllIlIIlllIlI.appendSibling(new ChatComponentTranslation(llllllllllllIllllIllllIlIIlllIII.getDifficultyResourceKey(), new Object[GuiOptions.lIlllIlIlllIll[1]]));
        "".length();
        return llllllllllllIllllIllllIlIIlllIlI.getFormattedText();
    }
    
    static {
        lIIIIIllIIIIIIlI();
        lIIIIIIllIllIlIl();
        final GameSettings.Options[] field_146440_f2 = new GameSettings.Options[GuiOptions.lIlllIlIlllIll[0]];
        field_146440_f2[GuiOptions.lIlllIlIlllIll[1]] = GameSettings.Options.FOV;
        field_146440_f = field_146440_f2;
    }
    
    private static boolean lIIIIIllIIIIIllI(final int llllllllllllIllllIllllIIIllIlIIl) {
        return llllllllllllIllllIllllIIIllIlIIl == 0;
    }
    
    private static boolean lIIIIIllIIIIIlII(final int llllllllllllIllllIllllIIIlllIlII, final int llllllllllllIllllIllllIIIlllIIll) {
        return llllllllllllIllllIllllIIIlllIlII >= llllllllllllIllllIllllIIIlllIIll;
    }
    
    private static boolean lIIIIIllIIIIIlIl(final Object llllllllllllIllllIllllIIIllIllIl) {
        return llllllllllllIllllIllllIIIllIllIl != null;
    }
    
    private static boolean lIIIIIllIIIIlIII(final int llllllllllllIllllIllllIIIlllIIII, final int llllllllllllIllllIllllIIIllIllll) {
        return llllllllllllIllllIllllIIIlllIIII < llllllllllllIllllIllllIIIllIllll;
    }
    
    private static void lIIIIIllIIIIIIlI() {
        (lIlllIlIlllIll = new int[44])[0] = " ".length();
        GuiOptions.lIlllIlIlllIll[1] = ((0x57 ^ 0x48) & ~(0xE ^ 0x11));
        GuiOptions.lIlllIlIlllIll[2] = "  ".length();
        GuiOptions.lIlllIlIlllIll[3] = 148 + 100 - 116 + 23;
        GuiOptions.lIlllIlIlllIll[4] = 118 + 137 - 181 + 86;
        GuiOptions.lIlllIlIlllIll[5] = (" ".length() ^ (0x6B ^ 0x6C));
        GuiOptions.lIlllIlIlllIll[6] = (0xC9 ^ 0xC5);
        GuiOptions.lIlllIlIlllIll[7] = (0x6C ^ 0x74);
        GuiOptions.lIlllIlIlllIll[8] = (0x55 ^ 0x39);
        GuiOptions.lIlllIlIlllIll[9] = 75 + 129 - 198 + 125 + (0x1E ^ 0x77) - (31 + 146 - 96 + 101) + (0xFC ^ 0x9C);
        GuiOptions.lIlllIlIlllIll[10] = (0xA1 ^ 0xB5);
        GuiOptions.lIlllIlIlllIll[11] = (0x6C ^ 0x1);
        GuiOptions.lIlllIlIlllIll[12] = (0x6E ^ 0x0);
        GuiOptions.lIlllIlIlllIll[13] = (92 + 46 + 24 + 20 ^ 64 + 66 - 121 + 125);
        GuiOptions.lIlllIlIlllIll[14] = (-(0xFFFFF053 & 0x2FBF) & (-1 & 0x847FFF));
        GuiOptions.lIlllIlIlllIll[15] = (0xF3 ^ 0x81 ^ (0x67 ^ 0x10));
        GuiOptions.lIlllIlIlllIll[16] = "   ".length();
        GuiOptions.lIlllIlIlllIll[17] = (0x5D ^ 0x1B ^ (0xB8 ^ 0x94));
        GuiOptions.lIlllIlIlllIll[18] = (0xED ^ 0xA5);
        GuiOptions.lIlllIlIlllIll[19] = (0x21 ^ 0x60 ^ (0xF6 ^ 0xB3));
        GuiOptions.lIlllIlIlllIll[20] = (0x85 ^ 0x91 ^ 42 + 32 - 4 + 57);
        GuiOptions.lIlllIlIlllIll[21] = (0xDF ^ 0xBA);
        GuiOptions.lIlllIlIlllIll[22] = (0x93 ^ 0x85 ^ (0x10 ^ 0x66));
        GuiOptions.lIlllIlIlllIll[23] = (0x74 ^ 0x10);
        GuiOptions.lIlllIlIlllIll[24] = (0x54 ^ 0x68 ^ (0x38 ^ 0x3));
        GuiOptions.lIlllIlIlllIll[25] = (0xFF ^ 0x99);
        GuiOptions.lIlllIlIlllIll[26] = (0x3B ^ 0x43);
        GuiOptions.lIlllIlIlllIll[27] = (0xAD ^ 0xA5);
        GuiOptions.lIlllIlIlllIll[28] = (0xFF ^ 0xC2 ^ (0x1E ^ 0x44));
        GuiOptions.lIlllIlIlllIll[29] = (0x3C ^ 0x35);
        GuiOptions.lIlllIlIlllIll[30] = (0xD5 ^ 0xBC);
        GuiOptions.lIlllIlIlllIll[31] = 81 + 42 - 29 + 50;
        GuiOptions.lIlllIlIlllIll[32] = (0x3E ^ 0x34);
        GuiOptions.lIlllIlIlllIll[33] = (0xCE ^ 0xA6);
        GuiOptions.lIlllIlIlllIll[34] = (0x11 ^ 0x5B ^ (0x2D ^ 0x6C));
        GuiOptions.lIlllIlIlllIll[35] = 187 + 184 - 198 + 27;
        GuiOptions.lIlllIlIlllIll[36] = (0x4 ^ 0x3E) + (0xA2 ^ 0xA4) - (0x3 ^ 0x2B) + (29 + 92 - 75 + 98);
        GuiOptions.lIlllIlIlllIll[37] = (17 + 118 - 37 + 29 ^ (0xEF ^ 0x9D));
        GuiOptions.lIlllIlIlllIll[38] = (0xB9 ^ 0xB7);
        GuiOptions.lIlllIlIlllIll[39] = (0xCB ^ 0xC2 ^ (0x2F ^ 0x29));
        GuiOptions.lIlllIlIlllIll[40] = (43 + 81 - 73 + 104 ^ 122 + 122 - 165 + 60);
        GuiOptions.lIlllIlIlllIll[41] = (0x95 ^ 0xBA ^ (0x21 ^ 0x1F));
        GuiOptions.lIlllIlIlllIll[42] = (-1 & 0xFFFFFF);
        GuiOptions.lIlllIlIlllIll[43] = (6 + 172 - 32 + 34 ^ 43 + 37 - 67 + 153);
    }
    
    private static String lIIIIIIllIllIIll(String llllllllllllIllllIllllIIlIlIlIII, final String llllllllllllIllllIllllIIlIlIIlll) {
        llllllllllllIllllIllllIIlIlIlIII = new String(Base64.getDecoder().decode(llllllllllllIllllIllllIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllllIIlIlIllII = new StringBuilder();
        final char[] llllllllllllIllllIllllIIlIlIlIlI = llllllllllllIllllIllllIIlIlIIlll.toCharArray();
        int llllllllllllIllllIllllIIlIlIlIIl = GuiOptions.lIlllIlIlllIll[1];
        final long llllllllllllIllllIllllIIlIlIIIII = (Object)llllllllllllIllllIllllIIlIlIlIII.toCharArray();
        final boolean llllllllllllIllllIllllIIlIIlllll = llllllllllllIllllIllllIIlIlIIIII.length != 0;
        float llllllllllllIllllIllllIIlIIlllIl = GuiOptions.lIlllIlIlllIll[1];
        while (lIIIIIllIIIIlIII((int)llllllllllllIllllIllllIIlIIlllIl, llllllllllllIllllIllllIIlIIlllll ? 1 : 0)) {
            final char llllllllllllIllllIllllIIlIllIIlI = llllllllllllIllllIllllIIlIlIIIII[llllllllllllIllllIllllIIlIIlllIl];
            llllllllllllIllllIllllIIlIlIllII.append((char)(llllllllllllIllllIllllIIlIllIIlI ^ llllllllllllIllllIllllIIlIlIlIlI[llllllllllllIllllIllllIIlIlIlIIl % llllllllllllIllllIllllIIlIlIlIlI.length]));
            "".length();
            ++llllllllllllIllllIllllIIlIlIlIIl;
            ++llllllllllllIllllIllllIIlIIlllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllllIIlIlIllII);
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllllIllllIIlllIllll, final int llllllllllllIllllIllllIIlllIllIl, final float llllllllllllIllllIllllIIlllIlIll) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.field_146442_a, this.width / GuiOptions.lIlllIlIlllIll[2], GuiOptions.lIlllIlIlllIll[39], GuiOptions.lIlllIlIlllIll[42]);
        super.drawScreen(llllllllllllIllllIllllIIlllIllll, llllllllllllIllllIllllIIlllIllIl, llllllllllllIllllIllllIIlllIlIll);
    }
    
    @Override
    public void confirmClicked(final boolean llllllllllllIllllIllllIlIIlIIlIl, final int llllllllllllIllllIllllIlIIIllllI) {
        this.mc.displayGuiScreen(this);
        if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIllllI, GuiOptions.lIlllIlIlllIll[11]) && lIIIIIllIIIIIIll(llllllllllllIllllIllllIlIIlIIlIl ? 1 : 0) && lIIIIIllIIIIIlIl(this.mc.theWorld)) {
            this.mc.theWorld.getWorldInfo().setDifficultyLocked((boolean)(GuiOptions.lIlllIlIlllIll[0] != 0));
            this.field_175356_r.func_175229_b((boolean)(GuiOptions.lIlllIlIlllIll[0] != 0));
            this.field_175356_r.enabled = (GuiOptions.lIlllIlIlllIll[1] != 0);
            this.field_175357_i.enabled = (GuiOptions.lIlllIlIlllIll[1] != 0);
        }
    }
    
    private static void lIIIIIIllIllIlIl() {
        (lIlllIIlIIIllI = new String[GuiOptions.lIlllIlIlllIll[43]])[GuiOptions.lIlllIlIlllIll[1]] = lIIIIIIllIllIIlI("xTecZlFL7Wk=", "MxoNk");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[0]] = lIIIIIIllIllIIll("DBgAGDwNG1oFOhcEEQ==", "chtqS");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[2]] = lIIIIIIllIllIIlI("qAKKmru+K0PGh0fawcxU1Lk11Nk2sojuKkT3oXXEX7o=", "wmPNl");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[16]] = lIIIIIIllIllIIll("GiAiPT9pBjc7PywhcgsoPSE7Nio6e3x2", "IURXM");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[19]] = lIIIIIIllIllIlII("WqYeiOWWBTqC9MBm5hBdgw==", "SVigb");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[15]] = lIIIIIIllIllIIll("JhE9GwsnEmcBEDsEKB8=", "IaIrd");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[5]] = lIIIIIIllIllIlII("ELuJNJQXAsTXF8gSxGk46A==", "plmjy");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[24]] = lIIIIIIllIllIIll("Ih0EPyIjHl41IiMZAjkhPg==", "MmpVM");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[27]] = lIIIIIIllIllIIlI("KLRLh8gqMjbZESnNovRGY3P644eeOjmL", "xvrFW");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[29]] = lIIIIIIllIllIIlI("XtEfYBOByQZ+yebEP4V9HWz4uZke4CVB", "RepBh");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[32]] = lIIIIIIllIllIIll("PRgzHh48G2kFFCEHMgUSNxgmFBo=", "RhGwq");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[34]] = lIIIIIIllIllIIlI("p+7PoSgR3USsus+vP2he7QVj5i4jJo6g", "raOKQ");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[6]] = lIIIIIIllIllIIlI("MQi86cxnOQTrBNXgK2ImJQ==", "ljXZX");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[37]] = lIIIIIIllIllIIlI("yRP3RwZP05o=", "RRUmN");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[38]] = lIIIIIIllIllIIlI("53us4n38iGjJ9f1sNkfhEDGlLwxd0u4j", "yxxmA");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[39]] = lIIIIIIllIllIlII("UjZRmhfxLJk=", "ibpVx");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[40]] = lIIIIIIllIllIIlI("76g4l7ne4I3UQK2hAzg5nfKMTm4HZI5h", "wOHQN");
        GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[41]] = lIIIIIIllIllIlII("PRQVY/OpQE0kItTkE4yo7VTwpm7GsCi8JiAg3MFuHrc=", "wqnkW");
    }
    
    public GuiOptions(final GuiScreen llllllllllllIllllIllllIllIIIlIIl, final GameSettings llllllllllllIllllIllllIllIIIllIl) {
        this.field_146442_a = GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[1]];
        this.field_146441_g = llllllllllllIllllIllllIllIIIlIIl;
        this.game_settings_1 = llllllllllllIllllIllllIllIIIllIl;
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllllIllllIlIIIIIIIl) throws IOException {
        if (lIIIIIllIIIIIIll(llllllllllllIllllIllllIlIIIIIIIl.enabled ? 1 : 0)) {
            if (lIIIIIllIIIIlIII(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[23]) && lIIIIIllIIIIIIll((llllllllllllIllllIllllIlIIIIIIIl instanceof GuiOptionButton) ? 1 : 0)) {
                final GameSettings.Options llllllllllllIllllIllllIlIIIIIlll = ((GuiOptionButton)llllllllllllIllllIllllIlIIIIIIIl).returnEnumOptions();
                this.game_settings_1.setOptionValue(llllllllllllIllllIllllIlIIIIIlll, GuiOptions.lIlllIlIlllIll[0]);
                llllllllllllIllllIllllIlIIIIIIIl.displayString = this.game_settings_1.getKeyBinding(GameSettings.Options.getEnumOptions(llllllllllllIllllIllllIlIIIIIIIl.id));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[8])) {
                this.mc.theWorld.getWorldInfo().setDifficulty(EnumDifficulty.getDifficultyEnum(this.mc.theWorld.getDifficulty().getDifficultyId() + GuiOptions.lIlllIlIlllIll[0]));
                this.field_175357_i.displayString = this.func_175355_a(this.mc.theWorld.getDifficulty());
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[11])) {
                final Minecraft mc = this.mc;
                final String formattedText = new ChatComponentTranslation(GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[40]], new Object[GuiOptions.lIlllIlIlllIll[1]]).getFormattedText();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = GuiOptions.lIlllIIlIIIllI[GuiOptions.lIlllIlIlllIll[41]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[GuiOptions.lIlllIlIlllIll[0]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[GuiOptions.lIlllIlIlllIll[1]] = new ChatComponentTranslation(this.mc.theWorld.getWorldInfo().getDifficulty().getDifficultyResourceKey(), new Object[GuiOptions.lIlllIlIlllIll[1]]);
                mc.displayGuiScreen(new GuiYesNo(this, formattedText, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl).getFormattedText(), GuiOptions.lIlllIlIlllIll[11]));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[12])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiCustomizeSkin(this));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[14])) {
                this.mc.entityRenderer.activateNextShader();
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[21])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiVideoSettings(this, this.game_settings_1));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[23])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiControls(this, this.game_settings_1));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[25])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiLanguage(this, this.game_settings_1, this.mc.getLanguageManager()));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[28])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new ScreenChatOptions(this, this.game_settings_1));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[33])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiSnooper(this, this.game_settings_1));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[35])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(this.field_146441_g);
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[30])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiScreenResourcePacks(this));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[17])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(new GuiScreenOptionsSounds(this, this.game_settings_1));
            }
            if (lIIIIIllIIIIIlll(llllllllllllIllllIllllIlIIIIIIIl.id, GuiOptions.lIlllIlIlllIll[20])) {
                this.mc.gameSettings.saveOptions();
                final IStream llllllllllllIllllIllllIlIIIIIlIl = this.mc.getTwitchStream();
                if (lIIIIIllIIIIIIll(llllllllllllIllllIllllIlIIIIIlIl.func_152936_l() ? 1 : 0) && lIIIIIllIIIIIIll(llllllllllllIllllIllllIlIIIIIlIl.func_152928_D() ? 1 : 0)) {
                    this.mc.displayGuiScreen(new GuiStreamOptions(this, this.game_settings_1));
                    "".length();
                    if ((0x59 ^ 0x5D) != (0x92 ^ 0x96)) {
                        return;
                    }
                }
                else {
                    GuiStreamUnavailable.func_152321_a(this);
                }
            }
        }
    }
    
    private static String lIIIIIIllIllIlII(final String llllllllllllIllllIllllIIlIIIllIl, final String llllllllllllIllllIllllIIlIIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllllIllllIIlIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllllIIlIIIlIll.getBytes(StandardCharsets.UTF_8)), GuiOptions.lIlllIlIlllIll[27]), "DES");
            final Cipher llllllllllllIllllIllllIIlIIIllll = Cipher.getInstance("DES");
            llllllllllllIllllIllllIIlIIIllll.init(GuiOptions.lIlllIlIlllIll[2], llllllllllllIllllIllllIIlIIlIIII);
            return new String(llllllllllllIllllIllllIIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllllIIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllllIIlIIIlllI) {
            llllllllllllIllllIllllIIlIIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIIllIllIIlI(final String llllllllllllIllllIllllIIllIIllII, final String llllllllllllIllllIllllIIllIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIllllIIllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllllIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllllIIllIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllllIIllIlIIIl.init(GuiOptions.lIlllIlIlllIll[2], llllllllllllIllllIllllIIllIlIIlI);
            return new String(llllllllllllIllllIllllIIllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllllIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllllIIllIlIIII) {
            llllllllllllIllllIllllIIllIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIllIIIIIIll(final int llllllllllllIllllIllllIIIllIlIll) {
        return llllllllllllIllllIllllIIIllIlIll != 0;
    }
    
    private static boolean lIIIIIllIIIIIlll(final int llllllllllllIllllIllllIIIllllIII, final int llllllllllllIllllIllllIIIlllIlll) {
        return llllllllllllIllllIllllIIIllllIII == llllllllllllIllllIllllIIIlllIlll;
    }
}
