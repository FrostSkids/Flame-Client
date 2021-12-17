// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import net.minecraft.client.resources.I18n;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.client.settings.GameSettings;

public class GuiSnooper extends GuiScreen
{
    private final /* synthetic */ GameSettings game_settings_2;
    private /* synthetic */ GuiButton field_146605_t;
    private final /* synthetic */ java.util.List<String> field_146604_g;
    private /* synthetic */ String[] field_146607_r;
    private static final /* synthetic */ String[] lIllllIllllIlI;
    private /* synthetic */ String field_146610_i;
    private static final /* synthetic */ int[] lIllllIlllllIl;
    private /* synthetic */ List field_146606_s;
    private final /* synthetic */ GuiScreen field_146608_a;
    private final /* synthetic */ java.util.List<String> field_146609_h;
    
    private static String lIIIIlIIllllIlII(final String llllllllllllIllllIIlllllllIIIIlI, final String llllllllllllIllllIIlllllllIIIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIlllllllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllllllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlllllllIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlllllllIIIllI.init(GuiSnooper.lIllllIlllllIl[3], llllllllllllIllllIIlllllllIIIlll);
            return new String(llllllllllllIllllIIlllllllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlllllllIIIlIl) {
            llllllllllllIllllIIlllllllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIIllllllII(final int llllllllllllIllllIIllllllIllIIII) {
        return llllllllllllIllllIIllllllIllIIII != 0;
    }
    
    private static void lIIIIlIIlllllIIl() {
        (lIllllIlllllIl = new int[16])[0] = ((((0x56 ^ 0x10) & ~(0xF8 ^ 0xBE)) ^ (0x7A ^ 0x58)) & (0xAC ^ 0xBD ^ (0xD ^ 0x3E) ^ -" ".length()));
        GuiSnooper.lIllllIlllllIl[1] = " ".length();
        GuiSnooper.lIllllIlllllIl[2] = (0x78 ^ 0x66);
        GuiSnooper.lIllllIlllllIl[3] = "  ".length();
        GuiSnooper.lIllllIlllllIl[4] = 67 + 15 - 48 + 118;
        GuiSnooper.lIllllIlllllIl[5] = 110 + 95 - 118 + 50 + (0x23 ^ 0x2F) - (67 + 40 - 31 + 61) + (44 + 119 - 67 + 42);
        GuiSnooper.lIllllIlllllIl[6] = (0x89 ^ 0x9D);
        GuiSnooper.lIllllIlllllIl[7] = "   ".length();
        GuiSnooper.lIllllIlllllIl[8] = (0x35 ^ 0x31);
        GuiSnooper.lIllllIlllllIl[9] = 96 + 56 - 138 + 118 + (128 + 149 - 274 + 196) - (90 + 134 - 197 + 108) + (0x22 ^ 0x3A);
        GuiSnooper.lIllllIlllllIl[10] = (44 + 11 + 18 + 90 ^ 150 + 6 - 23 + 33);
        GuiSnooper.lIllllIlllllIl[11] = (0x30 ^ 0x7A ^ (0x30 ^ 0x72));
        GuiSnooper.lIllllIlllllIl[12] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiSnooper.lIllllIlllllIl[13] = (0xBF ^ 0xA9);
        GuiSnooper.lIllllIlllllIl[14] = (-(0xFFFFDF7D & 0x7CF7) & (0xFFFFDFF5 & 0x80FCFE));
        GuiSnooper.lIllllIlllllIl[15] = (26 + 123 - 128 + 107 ^ 97 + 122 - 177 + 92);
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllllIIllllllllIIlII, final int llllllllllllIllllIIllllllllIlIIl, final float llllllllllllIllllIIllllllllIlIII) {
        this.drawDefaultBackground();
        this.field_146606_s.drawScreen(llllllllllllIllllIIllllllllIIlII, llllllllllllIllllIIllllllllIlIIl, llllllllllllIllllIIllllllllIlIII);
        this.drawCenteredString(this.fontRendererObj, this.field_146610_i, this.width / GuiSnooper.lIllllIlllllIl[3], GuiSnooper.lIllllIlllllIl[11], GuiSnooper.lIllllIlllllIl[12]);
        int llllllllllllIllllIIllllllllIIlll = GuiSnooper.lIllllIlllllIl[13];
        final boolean llllllllllllIllllIIlllllllIlllIl;
        final short llllllllllllIllllIIlllllllIllllI = (short)((String[])(Object)(llllllllllllIllllIIlllllllIlllIl = (boolean)(Object)this.field_146607_r)).length;
        int llllllllllllIllllIIlllllllIlllll = GuiSnooper.lIllllIlllllIl[0];
        "".length();
        if (((0xCD ^ 0xC5) & ~(0x16 ^ 0x1E)) != 0x0) {
            return;
        }
        while (!lIIIIlIIlllllllI(llllllllllllIllllIIlllllllIlllll, llllllllllllIllllIIlllllllIllllI)) {
            final String llllllllllllIllllIIllllllllIIllI = llllllllllllIllllIIlllllllIlllIl[llllllllllllIllllIIlllllllIlllll];
            this.drawCenteredString(this.fontRendererObj, llllllllllllIllllIIllllllllIIllI, this.width / GuiSnooper.lIllllIlllllIl[3], llllllllllllIllllIIllllllllIIlll, GuiSnooper.lIllllIlllllIl[14]);
            llllllllllllIllllIIllllllllIIlll += this.fontRendererObj.FONT_HEIGHT;
            ++llllllllllllIllllIIlllllllIlllll;
        }
        super.drawScreen(llllllllllllIllllIIllllllllIIlII, llllllllllllIllllIIllllllllIlIIl, llllllllllllIllllIIllllllllIlIII);
    }
    
    public GuiSnooper(final GuiScreen llllllllllllIllllIlIIIIIIIIlIlIl, final GameSettings llllllllllllIllllIlIIIIIIIIlIlII) {
        this.field_146604_g = (java.util.List<String>)Lists.newArrayList();
        this.field_146609_h = (java.util.List<String>)Lists.newArrayList();
        this.field_146608_a = llllllllllllIllllIlIIIIIIIIlIlIl;
        this.game_settings_2 = llllllllllllIllllIlIIIIIIIIlIlII;
    }
    
    private static boolean lIIIIlIIllllllIl(final int llllllllllllIllllIIllllllIllllII, final int llllllllllllIllllIIllllllIlllIll) {
        return llllllllllllIllllIIllllllIllllII == llllllllllllIllllIIllllllIlllIll;
    }
    
    @Override
    public void initGui() {
        this.field_146610_i = I18n.format(GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[0]], new Object[GuiSnooper.lIllllIlllllIl[0]]);
        final String llllllllllllIllllIlIIIIIIIIIlIIl = I18n.format(GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[1]], new Object[GuiSnooper.lIllllIlllllIl[0]]);
        final java.util.List<String> llllllllllllIllllIlIIIIIIIIIlIII = (java.util.List<String>)Lists.newArrayList();
        final char llllllllllllIllllIIlllllllllllll = (char)this.fontRendererObj.listFormattedStringToWidth(llllllllllllIllllIlIIIIIIIIIlIIl, this.width - GuiSnooper.lIllllIlllllIl[2]).iterator();
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lIIIIlIIlllllIlI(((Iterator)llllllllllllIllllIIlllllllllllll).hasNext() ? 1 : 0)) {
            final String llllllllllllIllllIlIIIIIIIIIIlll = ((Iterator<String>)llllllllllllIllllIIlllllllllllll).next();
            llllllllllllIllllIlIIIIIIIIIlIII.add(llllllllllllIllllIlIIIIIIIIIIlll);
            "".length();
        }
        this.field_146607_r = llllllllllllIllllIlIIIIIIIIIlIII.toArray(new String[llllllllllllIllllIlIIIIIIIIIlIII.size()]);
        this.field_146604_g.clear();
        this.field_146609_h.clear();
        final java.util.List<GuiButton> buttonList = this.buttonList;
        final GuiButton field_146605_t = new GuiButton(GuiSnooper.lIllllIlllllIl[1], this.width / GuiSnooper.lIllllIlllllIl[3] - GuiSnooper.lIllllIlllllIl[4], this.height - GuiSnooper.lIllllIlllllIl[2], GuiSnooper.lIllllIlllllIl[5], GuiSnooper.lIllllIlllllIl[6], this.game_settings_2.getKeyBinding(GameSettings.Options.SNOOPER_ENABLED));
        this.field_146605_t = field_146605_t;
        buttonList.add(field_146605_t);
        "".length();
        this.buttonList.add(new GuiButton(GuiSnooper.lIllllIlllllIl[3], this.width / GuiSnooper.lIllllIlllllIl[3] + GuiSnooper.lIllllIlllllIl[3], this.height - GuiSnooper.lIllllIlllllIl[2], GuiSnooper.lIllllIlllllIl[5], GuiSnooper.lIllllIlllllIl[6], I18n.format(GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[3]], new Object[GuiSnooper.lIllllIlllllIl[0]])));
        "".length();
        int n;
        if (lIIIIlIIlllllIll(this.mc.getIntegratedServer()) && lIIIIlIIlllllIll(this.mc.getIntegratedServer().getPlayerUsageSnooper())) {
            n = GuiSnooper.lIllllIlllllIl[1];
            "".length();
            if (((5 + 74 - 25 + 94 ^ 16 + 70 + 21 + 78) & (0xBE ^ 0x80 ^ (0xAC ^ 0xBF) ^ -" ".length())) < 0) {
                return;
            }
        }
        else {
            n = GuiSnooper.lIllllIlllllIl[0];
        }
        final boolean llllllllllllIllllIlIIIIIIIIIIllI = n != 0;
        short llllllllllllIllllIIllllllllllllI = (short)new TreeMap(this.mc.getPlayerUsageSnooper().getCurrentStats()).entrySet().iterator();
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!lIIIIlIIlllllIlI(((Iterator)llllllllllllIllllIIllllllllllllI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIllllIlIIIIIIIIIIlIl = ((Iterator<Map.Entry<String, String>>)llllllllllllIllllIIllllllllllllI).next();
            final java.util.List<String> field_146604_g = this.field_146604_g;
            String obj;
            if (lIIIIlIIllllllII(llllllllllllIllllIlIIIIIIIIIIllI ? 1 : 0)) {
                obj = GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[7]];
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                obj = GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[8]];
            }
            field_146604_g.add(String.valueOf(new StringBuilder(String.valueOf(obj)).append(llllllllllllIllllIlIIIIIIIIIIlIl.getKey())));
            "".length();
            this.field_146609_h.add(this.fontRendererObj.trimStringToWidth(llllllllllllIllllIlIIIIIIIIIIlIl.getValue(), this.width - GuiSnooper.lIllllIlllllIl[9]));
            "".length();
        }
        if (lIIIIlIIllllllII(llllllllllllIllllIlIIIIIIIIIIllI ? 1 : 0)) {
            llllllllllllIllllIIllllllllllllI = (short)new TreeMap(this.mc.getIntegratedServer().getPlayerUsageSnooper().getCurrentStats()).entrySet().iterator();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!lIIIIlIIlllllIlI(((Iterator)llllllllllllIllllIIllllllllllllI).hasNext() ? 1 : 0)) {
                final Map.Entry<String, String> llllllllllllIllllIlIIIIIIIIIIlII = ((Iterator<Map.Entry<String, String>>)llllllllllllIllllIIllllllllllllI).next();
                this.field_146604_g.add(String.valueOf(new StringBuilder(GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[10]]).append(llllllllllllIllllIlIIIIIIIIIIlII.getKey())));
                "".length();
                this.field_146609_h.add(this.fontRendererObj.trimStringToWidth(llllllllllllIllllIlIIIIIIIIIIlII.getValue(), this.width - GuiSnooper.lIllllIlllllIl[9]));
                "".length();
            }
        }
        this.field_146606_s = new List();
    }
    
    private static String lIIIIlIIllllIIIl(final String llllllllllllIllllIIlllllllIIllll, final String llllllllllllIllllIIlllllllIIlllI) {
        try {
            final SecretKeySpec llllllllllllIllllIIlllllllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllllllIIlllI.getBytes(StandardCharsets.UTF_8)), GuiSnooper.lIllllIlllllIl[11]), "DES");
            final Cipher llllllllllllIllllIIlllllllIlIIll = Cipher.getInstance("DES");
            llllllllllllIllllIIlllllllIlIIll.init(GuiSnooper.lIllllIlllllIl[3], llllllllllllIllllIIlllllllIlIlII);
            return new String(llllllllllllIllllIIlllllllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllllllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlllllllIlIIlI) {
            llllllllllllIllllIIlllllllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIIlllllllI(final int llllllllllllIllllIIllllllIlllIII, final int llllllllllllIllllIIllllllIllIlll) {
        return llllllllllllIllllIIllllllIlllIII >= llllllllllllIllllIIllllllIllIlll;
    }
    
    static {
        lIIIIlIIlllllIIl();
        lIIIIlIIllllIlll();
    }
    
    private static boolean lIIIIlIIlllllIlI(final int llllllllllllIllllIIllllllIlIllIl) {
        return llllllllllllIllllIIllllllIlIllIl == 0;
    }
    
    private static void lIIIIlIIllllIlll() {
        (lIllllIllllIlI = new String[GuiSnooper.lIllllIlllllIl[15]])[GuiSnooper.lIllllIlllllIl[0]] = lIIIIlIIllllIIIl("1PK94qfmIellT5+bPGlAcmLVGLIoXLen", "gywxS");
        GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[1]] = lIIIIlIIllllIlII("r7+SWEeXm9D15hYjjqAoRXDg+nM34LdH", "buUpS");
        GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[3]] = lIIIIlIIllllIIIl("qesw24W6bvvgBvHJTTsHXA==", "hUziA");
        GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[7]] = lIIIIlIIllllIIIl("KIMSscfahmw=", "RBDPP");
        GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[8]] = lIIIIlIIllllIlII("2Bul+DmWiEw=", "eayid");
        GuiSnooper.lIllllIllllIlI[GuiSnooper.lIllllIlllllIl[10]] = lIIIIlIIllllIIIl("5ofsyiJn6vY=", "gUKRf");
    }
    
    private static boolean lIIIIlIIlllllIll(final Object llllllllllllIllllIIllllllIllIlII) {
        return llllllllllllIllllIIllllllIllIlII != null;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.field_146606_s.handleMouseInput();
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllllIIlllllllllIlll) throws IOException {
        if (lIIIIlIIllllllII(llllllllllllIllllIIlllllllllIlll.enabled ? 1 : 0)) {
            if (lIIIIlIIllllllIl(llllllllllllIllllIIlllllllllIlll.id, GuiSnooper.lIllllIlllllIl[3])) {
                this.game_settings_2.saveOptions();
                this.game_settings_2.saveOptions();
                this.mc.displayGuiScreen(this.field_146608_a);
            }
            if (lIIIIlIIllllllIl(llllllllllllIllllIIlllllllllIlll.id, GuiSnooper.lIllllIlllllIl[1])) {
                this.game_settings_2.setOptionValue(GameSettings.Options.SNOOPER_ENABLED, GuiSnooper.lIllllIlllllIl[1]);
                this.field_146605_t.displayString = this.game_settings_2.getKeyBinding(GameSettings.Options.SNOOPER_ENABLED);
            }
        }
    }
    
    class List extends GuiSlot
    {
        private static final /* synthetic */ int[] lIIlIllIIIllIl;
        
        @Override
        protected void drawSlot(final int lllllllllllllIIllIIlIlIllIIlIIlI, final int lllllllllllllIIllIIlIlIllIIllIII, final int lllllllllllllIIllIIlIlIllIIlIIIl, final int lllllllllllllIIllIIlIlIllIIlIllI, final int lllllllllllllIIllIIlIlIllIIlIlIl, final int lllllllllllllIIllIIlIlIllIIlIlII) {
            GuiSnooper.this.fontRendererObj.drawString(GuiSnooper.this.field_146604_g.get(lllllllllllllIIllIIlIlIllIIlIIlI), List.lIIlIllIIIllIl[4], lllllllllllllIIllIIlIlIllIIlIIIl, List.lIIlIllIIIllIl[5]);
            "".length();
            GuiSnooper.this.fontRendererObj.drawString(GuiSnooper.this.field_146609_h.get(lllllllllllllIIllIIlIlIllIIlIIlI), List.lIIlIllIIIllIl[6], lllllllllllllIIllIIlIlIllIIlIIIl, List.lIIlIllIIIllIl[5]);
            "".length();
        }
        
        @Override
        protected void elementClicked(final int lllllllllllllIIllIIlIlIllIlIIlII, final boolean lllllllllllllIIllIIlIlIllIlIIIll, final int lllllllllllllIIllIIlIlIllIlIIIlI, final int lllllllllllllIIllIIlIlIllIlIIIIl) {
        }
        
        static {
            llIlIIIlllIllll();
        }
        
        @Override
        protected void drawBackground() {
        }
        
        @Override
        protected boolean isSelected(final int lllllllllllllIIllIIlIlIllIIlllll) {
            return List.lIIlIllIIIllIl[3] != 0;
        }
        
        @Override
        protected int getSize() {
            return GuiSnooper.this.field_146604_g.size();
        }
        
        public List() {
            super(GuiSnooper.this.mc, GuiSnooper.this.width, GuiSnooper.this.height, List.lIIlIllIIIllIl[0], GuiSnooper.this.height - List.lIIlIllIIIllIl[1], GuiSnooper.this.fontRendererObj.FONT_HEIGHT + List.lIIlIllIIIllIl[2]);
        }
        
        @Override
        protected int getScrollBarX() {
            return this.width - List.lIIlIllIIIllIl[4];
        }
        
        private static void llIlIIIlllIllll() {
            (lIIlIllIIIllIl = new int[7])[0] = (168 + 200 - 174 + 23 ^ 102 + 93 - 79 + 21);
            List.lIIlIllIIIllIl[1] = (0x90 ^ 0xB8);
            List.lIIlIllIIIllIl[2] = " ".length();
            List.lIIlIllIIIllIl[3] = ((53 + 97 + 2 + 68 ^ 114 + 82 - 130 + 69) & (0x9C ^ 0xA0 ^ (0x23 ^ 0x44) ^ -" ".length()));
            List.lIIlIllIIIllIl[4] = (109 + 158 - 220 + 124 ^ 147 + 136 - 238 + 116);
            List.lIIlIllIIIllIl[5] = (-1 & 0xFFFFFF);
            List.lIIlIllIIIllIl[6] = (0x11 ^ 0x2A) + (58 + 90 - 19 + 33) - (105 + 17 + 11 + 16) + (43 + 136 - 68 + 47);
        }
    }
}
