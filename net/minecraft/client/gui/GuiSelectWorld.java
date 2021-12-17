// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.util.EnumChatFormatting;
import java.util.Date;
import net.minecraft.client.Minecraft;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.ISaveHandler;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.world.WorldSettings;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import net.minecraft.client.resources.I18n;
import java.text.SimpleDateFormat;
import net.minecraft.client.AnvilConverterException;
import net.minecraft.world.storage.ISaveFormat;
import java.util.Collections;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.text.DateFormat;
import net.minecraft.world.storage.SaveFormatComparator;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class GuiSelectWorld extends GuiScreen implements GuiYesNoCallback
{
    private /* synthetic */ String field_146636_v;
    private /* synthetic */ boolean field_146634_i;
    private /* synthetic */ String[] field_146635_w;
    private /* synthetic */ int field_146640_r;
    private /* synthetic */ GuiButton recreateButton;
    protected /* synthetic */ String field_146628_f;
    private /* synthetic */ GuiButton selectButton;
    private static final /* synthetic */ int[] lIllIIIIIIlIlI;
    private /* synthetic */ GuiButton deleteButton;
    private /* synthetic */ List field_146638_t;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] lIllIIIIIIlIIl;
    private /* synthetic */ java.util.List<SaveFormatComparator> field_146639_s;
    private final /* synthetic */ DateFormat field_146633_h;
    private /* synthetic */ boolean field_146643_x;
    private /* synthetic */ GuiButton renameButton;
    private /* synthetic */ String field_146637_u;
    protected /* synthetic */ GuiScreen parentScreen;
    
    private static String llllIlIllllIIlI(String lllllllllllllIIIIlIIlIIIIlIlIlIl, final String lllllllllllllIIIIlIIlIIIIlIllIIl) {
        lllllllllllllIIIIlIIlIIIIlIlIlIl = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIlIIIIlIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlIIIIlIllIII = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlIIIIlIlIlll = lllllllllllllIIIIlIIlIIIIlIllIIl.toCharArray();
        int lllllllllllllIIIIlIIlIIIIlIlIllI = GuiSelectWorld.lIllIIIIIIlIlI[0];
        final char lllllllllllllIIIIlIIlIIIIlIlIIII = (Object)((String)lllllllllllllIIIIlIIlIIIIlIlIlIl).toCharArray();
        final int lllllllllllllIIIIlIIlIIIIlIIllll = lllllllllllllIIIIlIIlIIIIlIlIIII.length;
        byte lllllllllllllIIIIlIIlIIIIlIIlllI = (byte)GuiSelectWorld.lIllIIIIIIlIlI[0];
        while (llllIlIllllllII(lllllllllllllIIIIlIIlIIIIlIIlllI, lllllllllllllIIIIlIIlIIIIlIIllll)) {
            final char lllllllllllllIIIIlIIlIIIIlIllIll = lllllllllllllIIIIlIIlIIIIlIlIIII[lllllllllllllIIIIlIIlIIIIlIIlllI];
            lllllllllllllIIIIlIIlIIIIlIllIII.append((char)(lllllllllllllIIIIlIIlIIIIlIllIll ^ lllllllllllllIIIIlIIlIIIIlIlIlll[lllllllllllllIIIIlIIlIIIIlIlIllI % lllllllllllllIIIIlIIlIIIIlIlIlll.length]));
            "".length();
            ++lllllllllllllIIIIlIIlIIIIlIlIllI;
            ++lllllllllllllIIIIlIIlIIIIlIIlllI;
            "".length();
            if ((0xC1 ^ 0xC5) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlIIIIlIllIII);
    }
    
    private void func_146627_h() throws AnvilConverterException {
        final ISaveFormat lllllllllllllIIIIlIIlIIIlllIIIIl = this.mc.getSaveLoader();
        this.field_146639_s = lllllllllllllIIIIlIIlIIIlllIIIIl.getSaveList();
        Collections.sort(this.field_146639_s);
        this.field_146640_r = GuiSelectWorld.lIllIIIIIIlIlI[10];
    }
    
    public GuiSelectWorld(final GuiScreen lllllllllllllIIIIlIIlIIIlllIlllI) {
        this.field_146633_h = new SimpleDateFormat();
        this.field_146628_f = GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[0]];
        this.field_146635_w = new String[GuiSelectWorld.lIllIIIIIIlIlI[1]];
        this.parentScreen = lllllllllllllIIIIlIIlIIIlllIlllI;
    }
    
    private static boolean llllIlIlllllIlI(final int lllllllllllllIIIIlIIlIIIIIlIIIll) {
        return lllllllllllllIIIIlIIlIIIIIlIIIll == 0;
    }
    
    private static void llllIlIllllIlIl() {
        (lIllIIIIIIlIIl = new String[GuiSelectWorld.lIllIIIIIIlIlI[36]])[GuiSelectWorld.lIllIIIIIIlIlI[0]] = llllIlIllllIIlI("FCoKHAYzbxEWFysr", "GOfye");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[2]] = llllIlIllllIIlI("HDA0KzAbAjc8Pwt7LCcnAzA=", "oUXNS");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[3]] = llllIlIllllIIll("RSuYf+O9aAwDTGxEJevawDProySyFS39e0jvt0gmRHY=", "NTdmC");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[4]] = llllIlIllllIIlI("IA81ECUQQSAdaRkONRZpAg4mHi0G", "uaTrI");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[1]] = llllIlIllllIIll("tCui7hk4kAOTfNjM+rPKLMbIwtGfN/XC", "YZzRI");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[5]] = llllIlIllllIIll("lO86rwEU1xPRtevzRz6Nacdo1jawOjT6", "hklVo");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[6]] = llllIlIllllIlII("h+UtwaBMcD6KM8qeWcDTXGtQu5rgLXwL", "hNiCR");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[7]] = llllIlIllllIlII("Gx6hk1i9gg+oCAOxdFgC4yfB0fIHonpC", "BTKyV");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[8]] = llllIlIllllIIll("BSUFpgSyPlvPNjprfi4iXB+2QFCBsqcr", "Jyjrn");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[9]] = llllIlIllllIlII("l+TEieMsTfxtT21nqmgkSaKBew4kmIRn", "weOTY");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[11]] = llllIlIllllIlII("O3lxL9hL1ElN47cCWG1oq6PiePw3D8cK", "PlapF");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[12]] = llllIlIllllIlII("vmkqryP8MX8=", "gEDmM");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[17]] = llllIlIllllIlII("3nLkxgc1L5xqwaYqG0UFcLzo28giJ+mY", "wMADw");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[18]] = llllIlIllllIIlI("Cj0dLxMNDx44HB12EjgVGCwU", "yXqJp");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[21]] = llllIlIllllIIll("asqLqsnBZDMBWzE0O+Xy2nGDd3TtxCm5", "qDWSh");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[23]] = llllIlIllllIlII("lXj8Q0K25+vu/yN/rYt1NIiKE0L1lWyI", "yrTAY");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[24]] = llllIlIllllIIlI("NQoKBhsyOAkRFCJBFAYbNAoHFx0=", "Fofcx");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[26]] = llllIlIllllIlII("h4xUGosgRYZ3kwIlAjH2UQ==", "PsNqo");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[27]] = llllIlIllllIIll("0PkQ5Axxzcs=", "bibEn");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[28]] = llllIlIllllIlII("3pPks6lCavI=", "UHiUX");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[16]] = llllIlIllllIIlI("KAQ0JTwFTDVpNAQKJWk0Dh0kJXgHAjI9", "kkAIX");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[30]] = llllIlIllllIIll("8Ly/WsvlaCyOnvnLk4fzncb20792INxC36gbEcPc6Rs=", "goDmA");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[31]] = llllIlIllllIIll("smvZNQjkD+0=", "iuwqi");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[32]] = llllIlIllllIIll("vrT3xrfIEho=", "vjgiE");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[33]] = llllIlIllllIlII("nsy3n8TkCmclqXdN97IQ0YYqUDr7muzvsl01gLx25aw=", "fMRFb");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[34]] = llllIlIllllIlII("E8E1IdBnffooeETmbJQnr+wc5xdZDhP/l3sScKaivq0=", "PMcMK");
        GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[35]] = llllIlIllllIIlI("AB8+WTYGBDQSOQ==", "gjWwU");
    }
    
    public static GuiYesNo func_152129_a(final GuiYesNoCallback lllllllllllllIIIIlIIlIIIlIIIIlII, final String lllllllllllllIIIIlIIlIIIlIIIIIll, final int lllllllllllllIIIIlIIlIIIlIIIlIlI) {
        final String lllllllllllllIIIIlIIlIIIlIIIlIIl = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[30]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        final String lllllllllllllIIIIlIIlIIIlIIIlIII = String.valueOf(new StringBuilder(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[31]]).append(lllllllllllllIIIIlIIlIIIlIIIIIll).append(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[32]]).append(I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[33]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]])));
        final String lllllllllllllIIIIlIIlIIIlIIIIlll = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[34]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        final String lllllllllllllIIIIlIIlIIIlIIIIllI = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[35]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        final GuiYesNo lllllllllllllIIIIlIIlIIIlIIIIlIl = new GuiYesNo(lllllllllllllIIIIlIIlIIIlIIIIlII, lllllllllllllIIIIlIIlIIIlIIIlIIl, lllllllllllllIIIIlIIlIIIlIIIlIII, lllllllllllllIIIIlIIlIIIlIIIIlll, lllllllllllllIIIIlIIlIIIlIIIIllI, lllllllllllllIIIIlIIlIIIlIIIlIlI);
        return lllllllllllllIIIIlIIlIIIlIIIIlIl;
    }
    
    public void func_146618_g() {
        final java.util.List<GuiButton> buttonList = this.buttonList;
        final GuiButton selectButton = new GuiButton(GuiSelectWorld.lIllIIIIIIlIlI[2], this.width / GuiSelectWorld.lIllIIIIIIlIlI[3] - GuiSelectWorld.lIllIIIIIIlIlI[13], this.height - GuiSelectWorld.lIllIIIIIIlIlI[14], GuiSelectWorld.lIllIIIIIIlIlI[15], GuiSelectWorld.lIllIIIIIIlIlI[16], I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[17]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]));
        this.selectButton = selectButton;
        buttonList.add(selectButton);
        "".length();
        this.buttonList.add(new GuiButton(GuiSelectWorld.lIllIIIIIIlIlI[4], this.width / GuiSelectWorld.lIllIIIIIIlIlI[3] + GuiSelectWorld.lIllIIIIIIlIlI[1], this.height - GuiSelectWorld.lIllIIIIIIlIlI[14], GuiSelectWorld.lIllIIIIIIlIlI[15], GuiSelectWorld.lIllIIIIIIlIlI[16], I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[18]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]])));
        "".length();
        final java.util.List<GuiButton> buttonList2 = this.buttonList;
        final GuiButton renameButton = new GuiButton(GuiSelectWorld.lIllIIIIIIlIlI[6], this.width / GuiSelectWorld.lIllIIIIIIlIlI[3] - GuiSelectWorld.lIllIIIIIIlIlI[13], this.height - GuiSelectWorld.lIllIIIIIIlIlI[19], GuiSelectWorld.lIllIIIIIIlIlI[20], GuiSelectWorld.lIllIIIIIIlIlI[16], I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[21]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]));
        this.renameButton = renameButton;
        buttonList2.add(renameButton);
        "".length();
        final java.util.List<GuiButton> buttonList3 = this.buttonList;
        final GuiButton deleteButton = new GuiButton(GuiSelectWorld.lIllIIIIIIlIlI[3], this.width / GuiSelectWorld.lIllIIIIIIlIlI[3] - GuiSelectWorld.lIllIIIIIIlIlI[22], this.height - GuiSelectWorld.lIllIIIIIIlIlI[19], GuiSelectWorld.lIllIIIIIIlIlI[20], GuiSelectWorld.lIllIIIIIIlIlI[16], I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[23]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]));
        this.deleteButton = deleteButton;
        buttonList3.add(deleteButton);
        "".length();
        final java.util.List<GuiButton> buttonList4 = this.buttonList;
        final GuiButton recreateButton = new GuiButton(GuiSelectWorld.lIllIIIIIIlIlI[7], this.width / GuiSelectWorld.lIllIIIIIIlIlI[3] + GuiSelectWorld.lIllIIIIIIlIlI[1], this.height - GuiSelectWorld.lIllIIIIIIlIlI[19], GuiSelectWorld.lIllIIIIIIlIlI[20], GuiSelectWorld.lIllIIIIIIlIlI[16], I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[24]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]));
        this.recreateButton = recreateButton;
        buttonList4.add(recreateButton);
        "".length();
        this.buttonList.add(new GuiButton(GuiSelectWorld.lIllIIIIIIlIlI[0], this.width / GuiSelectWorld.lIllIIIIIIlIlI[3] + GuiSelectWorld.lIllIIIIIIlIlI[25], this.height - GuiSelectWorld.lIllIIIIIIlIlI[19], GuiSelectWorld.lIllIIIIIIlIlI[20], GuiSelectWorld.lIllIIIIIIlIlI[16], I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[26]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]])));
        "".length();
        this.selectButton.enabled = (GuiSelectWorld.lIllIIIIIIlIlI[0] != 0);
        this.deleteButton.enabled = (GuiSelectWorld.lIllIIIIIIlIlI[0] != 0);
        this.renameButton.enabled = (GuiSelectWorld.lIllIIIIIIlIlI[0] != 0);
        this.recreateButton.enabled = (GuiSelectWorld.lIllIIIIIIlIlI[0] != 0);
    }
    
    protected String func_146614_d(final int lllllllllllllIIIIlIIlIIIllIlIIIl) {
        String lllllllllllllIIIIlIIlIIIllIlIIll = this.field_146639_s.get(lllllllllllllIIIIlIIlIIIllIlIIIl).getDisplayName();
        if (llllIlIllllIlll(StringUtils.isEmpty((CharSequence)lllllllllllllIIIIlIIlIIIllIlIIll) ? 1 : 0)) {
            lllllllllllllIIIIlIIlIIIllIlIIll = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[11]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]))).append(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[12]]).append(lllllllllllllIIIIlIIlIIIllIlIIIl + GuiSelectWorld.lIllIIIIIIlIlI[2]));
        }
        return lllllllllllllIIIIlIIlIIIllIlIIll;
    }
    
    private static boolean llllIlIllllllII(final int lllllllllllllIIIIlIIlIIIIIlIllII, final int lllllllllllllIIIIlIIlIIIIIlIlIll) {
        return lllllllllllllIIIIlIIlIIIIIlIllII < lllllllllllllIIIIlIIlIIIIIlIlIll;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.field_146638_t.handleMouseInput();
    }
    
    private static void llllIlIllllIllI() {
        (lIllIIIIIIlIlI = new int[37])[0] = ((0x35 ^ 0x7A) & ~(0xFB ^ 0xB4));
        GuiSelectWorld.lIllIIIIIIlIlI[1] = (0xAE ^ 0xAA);
        GuiSelectWorld.lIllIIIIIIlIlI[2] = " ".length();
        GuiSelectWorld.lIllIIIIIIlIlI[3] = "  ".length();
        GuiSelectWorld.lIllIIIIIIlIlI[4] = "   ".length();
        GuiSelectWorld.lIllIIIIIIlIlI[5] = (157 + 126 - 281 + 184 ^ 75 + 81 + 7 + 28);
        GuiSelectWorld.lIllIIIIIIlIlI[6] = (114 + 21 - 117 + 115 ^ 89 + 110 - 103 + 35);
        GuiSelectWorld.lIllIIIIIIlIlI[7] = (0xC5 ^ 0xC2);
        GuiSelectWorld.lIllIIIIIIlIlI[8] = (0x43 ^ 0x4B);
        GuiSelectWorld.lIllIIIIIIlIlI[9] = (128 + 136 - 173 + 73 ^ 58 + 125 - 99 + 89);
        GuiSelectWorld.lIllIIIIIIlIlI[10] = -" ".length();
        GuiSelectWorld.lIllIIIIIIlIlI[11] = (0xC ^ 0x6);
        GuiSelectWorld.lIllIIIIIIlIlI[12] = (0x35 ^ 0x4C ^ (0xE6 ^ 0x94));
        GuiSelectWorld.lIllIIIIIIlIlI[13] = 82 + 89 - 40 + 23;
        GuiSelectWorld.lIllIIIIIIlIlI[14] = (0x12 ^ 0x2B ^ (0x4A ^ 0x47));
        GuiSelectWorld.lIllIIIIIIlIlI[15] = (0xDD ^ 0xA5) + (0x22 ^ 0x77) - (12 + 88 + 26 + 53) + (0x4E ^ 0x32);
        GuiSelectWorld.lIllIIIIIIlIlI[16] = (0xD7 ^ 0xC3);
        GuiSelectWorld.lIllIIIIIIlIlI[17] = (0x8F ^ 0x83);
        GuiSelectWorld.lIllIIIIIIlIlI[18] = (45 + 105 - 107 + 86 ^ 85 + 0 - 17 + 72);
        GuiSelectWorld.lIllIIIIIIlIlI[19] = (0x57 ^ 0x4B);
        GuiSelectWorld.lIllIIIIIIlIlI[20] = (0x46 ^ 0x17 ^ (0xD8 ^ 0xC1));
        GuiSelectWorld.lIllIIIIIIlIlI[21] = (0x32 ^ 0x26 ^ (0x61 ^ 0x7B));
        GuiSelectWorld.lIllIIIIIIlIlI[22] = (0xF4 ^ 0xB8);
        GuiSelectWorld.lIllIIIIIIlIlI[23] = (0xCF ^ 0xC0);
        GuiSelectWorld.lIllIIIIIIlIlI[24] = (0x8D ^ 0x9D);
        GuiSelectWorld.lIllIIIIIIlIlI[25] = (0x1D ^ 0x4F);
        GuiSelectWorld.lIllIIIIIIlIlI[26] = (0xBC ^ 0xAD);
        GuiSelectWorld.lIllIIIIIIlIlI[27] = (59 + 121 - 66 + 57 ^ 96 + 172 - 99 + 16);
        GuiSelectWorld.lIllIIIIIIlIlI[28] = (0x2F ^ 0x3 ^ (0x10 ^ 0x2F));
        GuiSelectWorld.lIllIIIIIIlIlI[29] = (-1 & 0xFFFFFF);
        GuiSelectWorld.lIllIIIIIIlIlI[30] = (61 + 88 - 137 + 163 ^ 74 + 173 - 79 + 18);
        GuiSelectWorld.lIllIIIIIIlIlI[31] = (0x3C ^ 0x2C ^ (0x54 ^ 0x52));
        GuiSelectWorld.lIllIIIIIIlIlI[32] = (20 + 40 - 35 + 104 ^ 111 + 35 - 0 + 4);
        GuiSelectWorld.lIllIIIIIIlIlI[33] = (0x11 ^ 0x9);
        GuiSelectWorld.lIllIIIIIIlIlI[34] = (0x3F ^ 0x26);
        GuiSelectWorld.lIllIIIIIIlIlI[35] = (0xDE ^ 0xC4);
        GuiSelectWorld.lIllIIIIIIlIlI[36] = (161 + 88 - 169 + 82 ^ 164 + 2 - 161 + 180);
    }
    
    public void func_146615_e(final int lllllllllllllIIIIlIIlIIIlIllIIlI) {
        this.mc.displayGuiScreen(null);
        if (llllIlIlllllIlI(this.field_146634_i ? 1 : 0)) {
            this.field_146634_i = (GuiSelectWorld.lIllIIIIIIlIlI[2] != 0);
            String lllllllllllllIIIIlIIlIIIlIllIlIl = this.func_146621_a(lllllllllllllIIIIlIIlIIIlIllIIlI);
            if (llllIlIlllllIll(lllllllllllllIIIIlIIlIIIlIllIlIl)) {
                lllllllllllllIIIIlIIlIIIlIllIlIl = String.valueOf(new StringBuilder(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[27]]).append(lllllllllllllIIIIlIIlIIIlIllIIlI));
            }
            String lllllllllllllIIIIlIIlIIIlIllIlII = this.func_146614_d(lllllllllllllIIIIlIIlIIIlIllIIlI);
            if (llllIlIlllllIll(lllllllllllllIIIIlIIlIIIlIllIlII)) {
                lllllllllllllIIIIlIIlIIIlIllIlII = String.valueOf(new StringBuilder(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[28]]).append(lllllllllllllIIIIlIIlIIIlIllIIlI));
            }
            if (llllIlIllllIlll(this.mc.getSaveLoader().canLoadWorld(lllllllllllllIIIIlIIlIIIlIllIlIl) ? 1 : 0)) {
                this.mc.launchIntegratedServer(lllllllllllllIIIIlIIlIIIlIllIlIl, lllllllllllllIIIIlIIlIIIlIllIlII, null);
            }
        }
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIIIlIIlIIIlIIlIlll, final int lllllllllllllIIIIlIIlIIIlIIllIlI, final float lllllllllllllIIIIlIIlIIIlIIllIIl) {
        this.field_146638_t.drawScreen(lllllllllllllIIIIlIIlIIIlIIlIlll, lllllllllllllIIIIlIIlIIIlIIllIlI, lllllllllllllIIIIlIIlIIIlIIllIIl);
        this.drawCenteredString(this.fontRendererObj, this.field_146628_f, this.width / GuiSelectWorld.lIllIIIIIIlIlI[3], GuiSelectWorld.lIllIIIIIIlIlI[16], GuiSelectWorld.lIllIIIIIIlIlI[29]);
        super.drawScreen(lllllllllllllIIIIlIIlIIIlIIlIlll, lllllllllllllIIIIlIIlIIIlIIllIlI, lllllllllllllIIIIlIIlIIIlIIllIIl);
    }
    
    static /* synthetic */ void access$1(final GuiSelectWorld lllllllllllllIIIIlIIlIIIIllllIII, final int lllllllllllllIIIIlIIlIIIIlllIlll) {
        lllllllllllllIIIIlIIlIIIIllllIII.field_146640_r = lllllllllllllIIIIlIIlIIIIlllIlll;
    }
    
    protected String func_146621_a(final int lllllllllllllIIIIlIIlIIIllIllIll) {
        return this.field_146639_s.get(lllllllllllllIIIIlIIlIIIllIllIll).getFileName();
    }
    
    private static boolean llllIlIlllllIll(final Object lllllllllllllIIIIlIIlIIIIIlIIlll) {
        return lllllllllllllIIIIlIIlIIIIIlIIlll == null;
    }
    
    @Override
    public void confirmClicked(final boolean lllllllllllllIIIIlIIlIIIlIlIIlII, final int lllllllllllllIIIIlIIlIIIlIlIlIII) {
        if (llllIlIllllIlll(this.field_146643_x ? 1 : 0)) {
            this.field_146643_x = (GuiSelectWorld.lIllIIIIIIlIlI[0] != 0);
            if (llllIlIllllIlll(lllllllllllllIIIIlIIlIIIlIlIIlII ? 1 : 0)) {
                final ISaveFormat lllllllllllllIIIIlIIlIIIlIlIIlll = this.mc.getSaveLoader();
                lllllllllllllIIIIlIIlIIIlIlIIlll.flushCache();
                lllllllllllllIIIIlIIlIIIlIlIIlll.deleteWorldDirectory(this.func_146621_a(lllllllllllllIIIIlIIlIIIlIlIlIII));
                "".length();
                try {
                    this.func_146627_h();
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                catch (AnvilConverterException lllllllllllllIIIIlIIlIIIlIlIIllI) {
                    GuiSelectWorld.logger.error(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[16]], (Throwable)lllllllllllllIIIIlIIlIIIlIlIIllI);
                }
            }
            this.mc.displayGuiScreen(this);
        }
    }
    
    private static String llllIlIllllIIll(final String lllllllllllllIIIIlIIlIIIIIllIllI, final String lllllllllllllIIIIlIIlIIIIIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIIIIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIIIIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIlIIIIIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIlIIIIIlllIlI.init(GuiSelectWorld.lIllIIIIIIlIlI[3], lllllllllllllIIIIlIIlIIIIIlllIll);
            return new String(lllllllllllllIIIIlIIlIIIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIIIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIIIIIlllIIl) {
            lllllllllllllIIIIlIIlIIIIIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIlllllIIl(final Object lllllllllllllIIIIlIIlIIIIIlIlIIl) {
        return lllllllllllllIIIIlIIlIIIIIlIlIIl != null;
    }
    
    @Override
    public void initGui() {
        this.field_146628_f = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[2]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        try {
            this.func_146627_h();
            "".length();
            if (((0x60 ^ 0x71) & ~(0x2F ^ 0x3E)) <= -" ".length()) {
                return;
            }
        }
        catch (AnvilConverterException lllllllllllllIIIIlIIlIIIlllIlIlI) {
            GuiSelectWorld.logger.error(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[3]], (Throwable)lllllllllllllIIIIlIIlIIIlllIlIlI);
            this.mc.displayGuiScreen(new GuiErrorScreen(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[4]], lllllllllllllIIIIlIIlIIIlllIlIlI.getMessage()));
            return;
        }
        this.field_146637_u = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[1]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        this.field_146636_v = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[5]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        this.field_146635_w[WorldSettings.GameType.SURVIVAL.getID()] = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[6]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        this.field_146635_w[WorldSettings.GameType.CREATIVE.getID()] = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[7]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        this.field_146635_w[WorldSettings.GameType.ADVENTURE.getID()] = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[8]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        this.field_146635_w[WorldSettings.GameType.SPECTATOR.getID()] = I18n.format(GuiSelectWorld.lIllIIIIIIlIIl[GuiSelectWorld.lIllIIIIIIlIlI[9]], new Object[GuiSelectWorld.lIllIIIIIIlIlI[0]]);
        this.field_146638_t = new List(this.mc);
        this.field_146638_t.registerScrollButtons(GuiSelectWorld.lIllIIIIIIlIlI[1], GuiSelectWorld.lIllIIIIIIlIlI[5]);
        this.func_146618_g();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIIIlIIlIIIlIllllll) throws IOException {
        if (llllIlIllllIlll(lllllllllllllIIIIlIIlIIIlIllllll.enabled ? 1 : 0)) {
            if (llllIlIlllllIII(lllllllllllllIIIIlIIlIIIlIllllll.id, GuiSelectWorld.lIllIIIIIIlIlI[3])) {
                final String lllllllllllllIIIIlIIlIIIllIIIlIl = this.func_146614_d(this.field_146640_r);
                if (llllIlIlllllIIl(lllllllllllllIIIIlIIlIIIllIIIlIl)) {
                    this.field_146643_x = (GuiSelectWorld.lIllIIIIIIlIlI[2] != 0);
                    final GuiYesNo lllllllllllllIIIIlIIlIIIllIIIlII = func_152129_a(this, lllllllllllllIIIIlIIlIIIllIIIlIl, this.field_146640_r);
                    this.mc.displayGuiScreen(lllllllllllllIIIIlIIlIIIllIIIlII);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
            }
            else if (llllIlIlllllIII(lllllllllllllIIIIlIIlIIIlIllllll.id, GuiSelectWorld.lIllIIIIIIlIlI[2])) {
                this.func_146615_e(this.field_146640_r);
                "".length();
                if (-" ".length() > "  ".length()) {
                    return;
                }
            }
            else if (llllIlIlllllIII(lllllllllllllIIIIlIIlIIIlIllllll.id, GuiSelectWorld.lIllIIIIIIlIlI[4])) {
                this.mc.displayGuiScreen(new GuiCreateWorld(this));
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llllIlIlllllIII(lllllllllllllIIIIlIIlIIIlIllllll.id, GuiSelectWorld.lIllIIIIIIlIlI[6])) {
                this.mc.displayGuiScreen(new GuiRenameWorld(this, this.func_146621_a(this.field_146640_r)));
                "".length();
                if ((0x46 ^ 0x6 ^ (0x65 ^ 0x21)) < " ".length()) {
                    return;
                }
            }
            else if (llllIlIlllllIlI(lllllllllllllIIIIlIIlIIIlIllllll.id)) {
                this.mc.displayGuiScreen(this.parentScreen);
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else if (llllIlIlllllIII(lllllllllllllIIIIlIIlIIIlIllllll.id, GuiSelectWorld.lIllIIIIIIlIlI[7])) {
                final GuiCreateWorld lllllllllllllIIIIlIIlIIIllIIIIll = new GuiCreateWorld(this);
                final ISaveHandler lllllllllllllIIIIlIIlIIIllIIIIlI = this.mc.getSaveLoader().getSaveLoader(this.func_146621_a(this.field_146640_r), (boolean)(GuiSelectWorld.lIllIIIIIIlIlI[0] != 0));
                final WorldInfo lllllllllllllIIIIlIIlIIIllIIIIIl = lllllllllllllIIIIlIIlIIIllIIIIlI.loadWorldInfo();
                lllllllllllllIIIIlIIlIIIllIIIIlI.flush();
                lllllllllllllIIIIlIIlIIIllIIIIll.func_146318_a(lllllllllllllIIIIlIIlIIIllIIIIIl);
                this.mc.displayGuiScreen(lllllllllllllIIIIlIIlIIIllIIIIll);
                "".length();
                if ((0x3D ^ 0x4A ^ (0xB5 ^ 0xC7)) == 0x0) {
                    return;
                }
            }
            else {
                this.field_146638_t.actionPerformed(lllllllllllllIIIIlIIlIIIlIllllll);
            }
        }
    }
    
    static {
        llllIlIllllIllI();
        llllIlIllllIlIl();
        logger = LogManager.getLogger();
    }
    
    private static String llllIlIllllIlII(final String lllllllllllllIIIIlIIlIIIIlIIIIll, final String lllllllllllllIIIIlIIlIIIIlIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIIIIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), GuiSelectWorld.lIllIIIIIIlIlI[8]), "DES");
            final Cipher lllllllllllllIIIIlIIlIIIIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIlIIIIlIIIlll.init(GuiSelectWorld.lIllIIIIIIlIlI[3], lllllllllllllIIIIlIIlIIIIlIIlIII);
            return new String(lllllllllllllIIIIlIIlIIIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIIIIlIIIllI) {
            lllllllllllllIIIIlIIlIIIIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIlllllIII(final int lllllllllllllIIIIlIIlIIIIIllIIII, final int lllllllllllllIIIIlIIlIIIIIlIllll) {
        return lllllllllllllIIIIlIIlIIIIIllIIII == lllllllllllllIIIIlIIlIIIIIlIllll;
    }
    
    private static boolean llllIlIllllIlll(final int lllllllllllllIIIIlIIlIIIIIlIIlIl) {
        return lllllllllllllIIIIlIIlIIIIIlIIlIl != 0;
    }
    
    class List extends GuiSlot
    {
        private static final /* synthetic */ String[] llIlllIlIIlIIl;
        private static final /* synthetic */ int[] llIlllIlIIlIll;
        
        private static boolean lIIllIIllIlIllIl(final int llllllllllllIllIIlIIlIlIIIlIIlII, final int llllllllllllIllIIlIIlIlIIIlIIIll) {
            return llllllllllllIllIIlIIlIlIIIlIIlII < llllllllllllIllIIlIIlIlIIIlIIIll;
        }
        
        private static boolean lIIllIIllIlIlllI(final int llllllllllllIllIIlIIlIlIIIlIIIIl) {
            return llllllllllllIllIIlIIlIlIIIlIIIIl != 0;
        }
        
        @Override
        protected void drawBackground() {
            GuiSelectWorld.this.drawDefaultBackground();
        }
        
        @Override
        protected boolean isSelected(final int llllllllllllIllIIlIIlIlIIlllIIIl) {
            if (lIIllIIllIlIllll(llllllllllllIllIIlIIlIlIIlllIIIl, GuiSelectWorld.this.field_146640_r)) {
                return List.llIlllIlIIlIll[3] != 0;
            }
            return List.llIlllIlIIlIll[4] != 0;
        }
        
        private static boolean lIIllIIllIlIllII(final int llllllllllllIllIIlIIlIlIIIIlllll) {
            return llllllllllllIllIIlIIlIlIIIIlllll >= 0;
        }
        
        private static void lIIllIIllIlIlIlI() {
            (llIlllIlIIlIIl = new String[List.llIlllIlIIlIll[15]])[List.llIlllIlIIlIll[4]] = lIIllIIllIlIIlIl("DKVkCEYEpBs=", "nPkCs");
            List.llIlllIlIIlIIl[List.llIlllIlIIlIll[3]] = lIIllIIllIlIlIIl("YXA=", "AXLjN");
            List.llIlllIlIIlIIl[List.llIlllIlIIlIll[5]] = lIIllIIllIlIlIIl("Qw==", "jPeyy");
            List.llIlllIlIIlIIl[List.llIlllIlIIlIll[6]] = lIIllIIllIlIIlIl("5PTgwJ5I+Fs=", "AiSec");
            List.llIlllIlIIlIIl[List.llIlllIlIIlIll[7]] = lIIllIIllIlIlIIl("dw==", "WgVXc");
            List.llIlllIlIIlIIl[List.llIlllIlIIlIll[8]] = lIIllIIllIlIlIIl("EhsrHCUaHiNXABQIIhoHBx8=", "uzFyh");
            List.llIlllIlIIlIIl[List.llIlllIlIIlIll[9]] = lIIllIIllIlIIlIl("2Jnm9hJOhfk=", "cXAXj");
            List.llIlllIlIIlIIl[List.llIlllIlIIlIll[10]] = lIIllIIllIlIIlIl("Q9P3Fq1gJ2Fq6QE8nO8yr8ab4QuNHYFm", "AOAyk");
        }
        
        @Override
        protected int getContentHeight() {
            return GuiSelectWorld.this.field_146639_s.size() * List.llIlllIlIIlIll[2];
        }
        
        public List(final Minecraft llllllllllllIllIIlIIlIlIlIIIlIII) {
            super(llllllllllllIllIIlIIlIlIlIIIlIII, GuiSelectWorld.this.width, GuiSelectWorld.this.height, List.llIlllIlIIlIll[0], GuiSelectWorld.this.height - List.llIlllIlIIlIll[1], List.llIlllIlIIlIll[2]);
        }
        
        @Override
        protected void drawSlot(final int llllllllllllIllIIlIIlIlIIlIlIllI, final int llllllllllllIllIIlIIlIlIIllIIIII, final int llllllllllllIllIIlIIlIlIIlIlllll, final int llllllllllllIllIIlIIlIlIIlIllllI, final int llllllllllllIllIIlIIlIlIIlIlllIl, final int llllllllllllIllIIlIIlIlIIlIlllII) {
            final SaveFormatComparator llllllllllllIllIIlIIlIlIIlIllIll = GuiSelectWorld.this.field_146639_s.get(llllllllllllIllIIlIIlIlIIlIlIllI);
            String llllllllllllIllIIlIIlIlIIlIllIlI = llllllllllllIllIIlIIlIlIIlIllIll.getDisplayName();
            if (lIIllIIllIlIlllI(StringUtils.isEmpty((CharSequence)llllllllllllIllIIlIIlIlIIlIllIlI) ? 1 : 0)) {
                llllllllllllIllIIlIIlIlIIlIllIlI = String.valueOf(new StringBuilder(String.valueOf(GuiSelectWorld.this.field_146637_u)).append(List.llIlllIlIIlIIl[List.llIlllIlIIlIll[4]]).append(llllllllllllIllIIlIIlIlIIlIlIllI + List.llIlllIlIIlIll[3]));
            }
            String llllllllllllIllIIlIIlIlIIlIllIIl = llllllllllllIllIIlIIlIlIIlIllIll.getFileName();
            llllllllllllIllIIlIIlIlIIlIllIIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIlIIlIlIIlIllIIl)).append(List.llIlllIlIIlIIl[List.llIlllIlIIlIll[3]]).append(GuiSelectWorld.this.field_146633_h.format(new Date(llllllllllllIllIIlIIlIlIIlIllIll.getLastTimePlayed()))));
            llllllllllllIllIIlIIlIlIIlIllIIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIlIIlIlIIlIllIIl)).append(List.llIlllIlIIlIIl[List.llIlllIlIIlIll[5]]));
            String llllllllllllIllIIlIIlIlIIlIllIII = List.llIlllIlIIlIIl[List.llIlllIlIIlIll[6]];
            if (lIIllIIllIlIlllI(llllllllllllIllIIlIIlIlIIlIllIll.requiresConversion() ? 1 : 0)) {
                llllllllllllIllIIlIIlIlIIlIllIII = String.valueOf(new StringBuilder(String.valueOf(GuiSelectWorld.this.field_146636_v)).append(List.llIlllIlIIlIIl[List.llIlllIlIIlIll[7]]).append(llllllllllllIllIIlIIlIlIIlIllIII));
                "".length();
                if ("   ".length() == ((0xE5 ^ 0xBC) & ~(0xE0 ^ 0xB9))) {
                    return;
                }
            }
            else {
                llllllllllllIllIIlIIlIlIIlIllIII = GuiSelectWorld.this.field_146635_w[llllllllllllIllIIlIIlIlIIlIllIll.getEnumGameType().getID()];
                if (lIIllIIllIlIlllI(llllllllllllIllIIlIIlIlIIlIllIll.isHardcoreModeEnabled() ? 1 : 0)) {
                    llllllllllllIllIIlIIlIlIIlIllIII = String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_RED).append(I18n.format(List.llIlllIlIIlIIl[List.llIlllIlIIlIll[8]], new Object[List.llIlllIlIIlIll[4]])).append(EnumChatFormatting.RESET));
                }
                if (lIIllIIllIlIlllI(llllllllllllIllIIlIIlIlIIlIllIll.getCheatsEnabled() ? 1 : 0)) {
                    llllllllllllIllIIlIIlIlIIlIllIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIlIIlIlIIlIllIII)).append(List.llIlllIlIIlIIl[List.llIlllIlIIlIll[9]]).append(I18n.format(List.llIlllIlIIlIIl[List.llIlllIlIIlIll[10]], new Object[List.llIlllIlIIlIll[4]])));
                }
            }
            GuiSelectWorld.this.drawString(GuiSelectWorld.this.fontRendererObj, llllllllllllIllIIlIIlIlIIlIllIlI, llllllllllllIllIIlIIlIlIIllIIIII + List.llIlllIlIIlIll[5], llllllllllllIllIIlIIlIlIIlIlllll + List.llIlllIlIIlIll[3], List.llIlllIlIIlIll[11]);
            GuiSelectWorld.this.drawString(GuiSelectWorld.this.fontRendererObj, llllllllllllIllIIlIIlIlIIlIllIIl, llllllllllllIllIIlIIlIlIIllIIIII + List.llIlllIlIIlIll[5], llllllllllllIllIIlIIlIlIIlIlllll + List.llIlllIlIIlIll[12], List.llIlllIlIIlIll[13]);
            GuiSelectWorld.this.drawString(GuiSelectWorld.this.fontRendererObj, llllllllllllIllIIlIIlIlIIlIllIII, llllllllllllIllIIlIIlIlIIllIIIII + List.llIlllIlIIlIll[5], llllllllllllIllIIlIIlIlIIlIlllll + List.llIlllIlIIlIll[12] + List.llIlllIlIIlIll[14], List.llIlllIlIIlIll[13]);
        }
        
        private static String lIIllIIllIlIIlIl(final String llllllllllllIllIIlIIlIlIIlIIlIII, final String llllllllllllIllIIlIIlIlIIlIIIlIl) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIlIlIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), List.llIlllIlIIlIll[15]), "DES");
                final Cipher llllllllllllIllIIlIIlIlIIlIIlIlI = Cipher.getInstance("DES");
                llllllllllllIllIIlIIlIlIIlIIlIlI.init(List.llIlllIlIIlIll[5], llllllllllllIllIIlIIlIlIIlIIlIll);
                return new String(llllllllllllIllIIlIIlIlIIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIlIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIlIlIIlIIlIIl) {
                llllllllllllIllIIlIIlIlIIlIIlIIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIIllIIllIlIlIIl(String llllllllllllIllIIlIIlIlIIIllIIll, final String llllllllllllIllIIlIIlIlIIIllIlll) {
            llllllllllllIllIIlIIlIlIIIllIIll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIlIlIIIllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlIIlIlIIIllIllI = new StringBuilder();
            final char[] llllllllllllIllIIlIIlIlIIIllIlIl = llllllllllllIllIIlIIlIlIIIllIlll.toCharArray();
            int llllllllllllIllIIlIIlIlIIIllIlII = List.llIlllIlIIlIll[4];
            final float llllllllllllIllIIlIIlIlIIIlIlllI = (Object)((String)llllllllllllIllIIlIIlIlIIIllIIll).toCharArray();
            final double llllllllllllIllIIlIIlIlIIIlIllIl = llllllllllllIllIIlIIlIlIIIlIlllI.length;
            boolean llllllllllllIllIIlIIlIlIIIlIllII = List.llIlllIlIIlIll[4] != 0;
            while (lIIllIIllIlIllIl(llllllllllllIllIIlIIlIlIIIlIllII ? 1 : 0, (int)llllllllllllIllIIlIIlIlIIIlIllIl)) {
                final char llllllllllllIllIIlIIlIlIIIlllIIl = llllllllllllIllIIlIIlIlIIIlIlllI[llllllllllllIllIIlIIlIlIIIlIllII];
                llllllllllllIllIIlIIlIlIIIllIllI.append((char)(llllllllllllIllIIlIIlIlIIIlllIIl ^ llllllllllllIllIIlIIlIlIIIllIlIl[llllllllllllIllIIlIIlIlIIIllIlII % llllllllllllIllIIlIIlIlIIIllIlIl.length]));
                "".length();
                ++llllllllllllIllIIlIIlIlIIIllIlII;
                ++llllllllllllIllIIlIIlIlIIIlIllII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlIIlIlIIIllIllI);
        }
        
        static {
            lIIllIIllIlIlIll();
            lIIllIIllIlIlIlI();
        }
        
        private static boolean lIIllIIllIlIllll(final int llllllllllllIllIIlIIlIlIIIlIlIII, final int llllllllllllIllIIlIIlIlIIIlIIlll) {
            return llllllllllllIllIIlIIlIlIIIlIlIII == llllllllllllIllIIlIIlIlIIIlIIlll;
        }
        
        @Override
        protected int getSize() {
            return GuiSelectWorld.this.field_146639_s.size();
        }
        
        @Override
        protected void elementClicked(final int llllllllllllIllIIlIIlIlIIlllllll, final boolean llllllllllllIllIIlIIlIlIIllllIII, final int llllllllllllIllIIlIIlIlIIlllllIl, final int llllllllllllIllIIlIIlIlIIlllllII) {
            GuiSelectWorld.access$1(GuiSelectWorld.this, llllllllllllIllIIlIIlIlIIlllllll);
            int n;
            if (lIIllIIllIlIllII(GuiSelectWorld.this.field_146640_r) && lIIllIIllIlIllIl(GuiSelectWorld.this.field_146640_r, this.getSize())) {
                n = List.llIlllIlIIlIll[3];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n = List.llIlllIlIIlIll[4];
            }
            final boolean llllllllllllIllIIlIIlIlIIllllIll = n != 0;
            GuiSelectWorld.this.selectButton.enabled = llllllllllllIllIIlIIlIlIIllllIll;
            GuiSelectWorld.this.deleteButton.enabled = llllllllllllIllIIlIIlIlIIllllIll;
            GuiSelectWorld.this.renameButton.enabled = llllllllllllIllIIlIIlIlIIllllIll;
            GuiSelectWorld.this.recreateButton.enabled = llllllllllllIllIIlIIlIlIIllllIll;
            if (lIIllIIllIlIlllI(llllllllllllIllIIlIIlIlIIllllIII ? 1 : 0) && lIIllIIllIlIlllI(llllllllllllIllIIlIIlIlIIllllIll ? 1 : 0)) {
                GuiSelectWorld.this.func_146615_e(llllllllllllIllIIlIIlIlIIlllllll);
            }
        }
        
        private static void lIIllIIllIlIlIll() {
            (llIlllIlIIlIll = new int[16])[0] = (0x33 ^ 0x13);
            List.llIlllIlIIlIll[1] = (0xFF ^ 0xBF);
            List.llIlllIlIIlIll[2] = (119 + 30 - 96 + 77 ^ 160 + 130 - 124 + 0);
            List.llIlllIlIIlIll[3] = " ".length();
            List.llIlllIlIIlIll[4] = ((0xF1 ^ 0xA9) & ~(0x66 ^ 0x3E));
            List.llIlllIlIIlIll[5] = "  ".length();
            List.llIlllIlIIlIll[6] = "   ".length();
            List.llIlllIlIIlIll[7] = (91 + 35 - 88 + 89 ^ (0x28 ^ 0x53));
            List.llIlllIlIIlIll[8] = (0xAC ^ 0xA9);
            List.llIlllIlIIlIll[9] = (0x47 ^ 0x41);
            List.llIlllIlIIlIll[10] = (0x29 ^ 0x2E);
            List.llIlllIlIIlIll[11] = (-1 & 0xFFFFFF);
            List.llIlllIlIIlIll[12] = (0x63 ^ 0x6F);
            List.llIlllIlIIlIll[13] = (0xFFFFBE99 & 0x80C1E6);
            List.llIlllIlIIlIll[14] = (0x56 ^ 0x1C ^ (0xC0 ^ 0x80));
            List.llIlllIlIIlIll[15] = (0xAD ^ 0xA5);
        }
    }
}
