// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.settings.GameSettings;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.I18n;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;

public class GuiKeyBindingList extends GuiListExtended
{
    private static final /* synthetic */ int[] llIIllIlllIIll;
    private /* synthetic */ int maxListLabelWidth;
    private final /* synthetic */ IGuiListEntry[] listEntries;
    private final /* synthetic */ GuiControls field_148191_k;
    private final /* synthetic */ Minecraft mc;
    
    private static boolean lIIIllllIIlIIlII(final int llllllllllllIllIllllllIllIIIlIII) {
        return llllllllllllIllIllllllIllIIIlIII == 0;
    }
    
    private static boolean lIIIllllIIlIIlIl(final int llllllllllllIllIllllllIllIIIlIll, final int llllllllllllIllIllllllIllIIIlIlI) {
        return llllllllllllIllIllllllIllIIIlIll > llllllllllllIllIllllllIllIIIlIlI;
    }
    
    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + GuiKeyBindingList.llIIllIlllIIll[4];
    }
    
    @Override
    public IGuiListEntry getListEntry(final int llllllllllllIllIllllllIllIIllllI) {
        return this.listEntries[llllllllllllIllIllllllIllIIllllI];
    }
    
    @Override
    public int getListWidth() {
        return super.getListWidth() + GuiKeyBindingList.llIIllIlllIIll[1];
    }
    
    private static void lIIIllllIIlIIIll() {
        (llIIllIlllIIll = new int[5])[0] = (0xB2 ^ 0x8D);
        GuiKeyBindingList.llIIllIlllIIll[1] = (0xA4 ^ 0x84);
        GuiKeyBindingList.llIIllIlllIIll[2] = (0x43 ^ 0x57);
        GuiKeyBindingList.llIIllIlllIIll[3] = ((125 + 43 - 22 + 37 ^ 166 + 51 - 181 + 153) & (47 + 113 - 85 + 55 ^ 91 + 7 - 46 + 84 ^ -" ".length()));
        GuiKeyBindingList.llIIllIlllIIll[4] = (0x93 ^ 0x94 ^ (0x3B ^ 0x33));
    }
    
    private static boolean lIIIllllIIlIIllI(final int llllllllllllIllIllllllIllIIIllll, final int llllllllllllIllIllllllIllIIIlllI) {
        return llllllllllllIllIllllllIllIIIllll >= llllllllllllIllIllllllIllIIIlllI;
    }
    
    public GuiKeyBindingList(final GuiControls llllllllllllIllIllllllIllIlllIlI, final Minecraft llllllllllllIllIllllllIllIllIIII) {
        super(llllllllllllIllIllllllIllIllIIII, llllllllllllIllIllllllIllIlllIlI.width, llllllllllllIllIllllllIllIlllIlI.height, GuiKeyBindingList.llIIllIlllIIll[0], llllllllllllIllIllllllIllIlllIlI.height - GuiKeyBindingList.llIIllIlllIIll[1], GuiKeyBindingList.llIIllIlllIIll[2]);
        this.maxListLabelWidth = GuiKeyBindingList.llIIllIlllIIll[3];
        this.field_148191_k = llllllllllllIllIllllllIllIlllIlI;
        this.mc = llllllllllllIllIllllllIllIllIIII;
        final KeyBinding[] llllllllllllIllIllllllIllIlllIII = (KeyBinding[])ArrayUtils.clone((Object[])llllllllllllIllIllllllIllIllIIII.gameSettings.keyBindings);
        this.listEntries = new IGuiListEntry[llllllllllllIllIllllllIllIlllIII.length + KeyBinding.getKeybinds().size()];
        Arrays.sort(llllllllllllIllIllllllIllIlllIII);
        int llllllllllllIllIllllllIllIllIlll = GuiKeyBindingList.llIIllIlllIIll[3];
        String llllllllllllIllIllllllIllIllIllI = null;
        final Exception llllllllllllIllIllllllIllIlIlIIl;
        final boolean llllllllllllIllIllllllIllIlIlIlI = ((KeyBinding[])(Object)(llllllllllllIllIllllllIllIlIlIIl = (Exception)(Object)llllllllllllIllIllllllIllIlllIII)).length != 0;
        float llllllllllllIllIllllllIllIlIlIll = GuiKeyBindingList.llIIllIlllIIll[3];
        "".length();
        if (((212 + 92 - 179 + 110 ^ 63 + 49 - 85 + 140) & (139 + 154 - 168 + 68 ^ 77 + 86 - 159 + 137 ^ -" ".length())) >= " ".length()) {
            throw null;
        }
        while (!lIIIllllIIlIIllI((int)llllllllllllIllIllllllIllIlIlIll, llllllllllllIllIllllllIllIlIlIlI ? 1 : 0)) {
            final KeyBinding llllllllllllIllIllllllIllIllIlIl = llllllllllllIllIllllllIllIlIlIIl[llllllllllllIllIllllllIllIlIlIll];
            final String llllllllllllIllIllllllIllIllIlII = llllllllllllIllIllllllIllIllIlIl.getKeyCategory();
            if (lIIIllllIIlIIlII(llllllllllllIllIllllllIllIllIlII.equals(llllllllllllIllIllllllIllIllIllI) ? 1 : 0)) {
                llllllllllllIllIllllllIllIllIllI = llllllllllllIllIllllllIllIllIlII;
                this.listEntries[llllllllllllIllIllllllIllIllIlll++] = new CategoryEntry(llllllllllllIllIllllllIllIllIlII);
            }
            final int llllllllllllIllIllllllIllIllIIll = llllllllllllIllIllllllIllIllIIII.fontRendererObj.getStringWidth(I18n.format(llllllllllllIllIllllllIllIllIlIl.getKeyDescription(), new Object[GuiKeyBindingList.llIIllIlllIIll[3]]));
            if (lIIIllllIIlIIlIl(llllllllllllIllIllllllIllIllIIll, this.maxListLabelWidth)) {
                this.maxListLabelWidth = llllllllllllIllIllllllIllIllIIll;
            }
            this.listEntries[llllllllllllIllIllllllIllIllIlll++] = new KeyEntry(llllllllllllIllIllllllIllIllIlIl, (KeyEntry)null);
            ++llllllllllllIllIllllllIllIlIlIll;
        }
    }
    
    @Override
    protected int getSize() {
        return this.listEntries.length;
    }
    
    static {
        lIIIllllIIlIIIll();
    }
    
    public class KeyEntry implements IGuiListEntry
    {
        private final /* synthetic */ GuiButton btnChangeKeyBinding;
        private static final /* synthetic */ String[] llIlIlIlIlllII;
        private final /* synthetic */ GuiButton btnReset;
        private final /* synthetic */ KeyBinding keybinding;
        private static final /* synthetic */ int[] llIlIlIlIlllIl;
        private final /* synthetic */ String keyDesc;
        
        @Override
        public void mouseReleased(final int llllllllllllIllIlIlIIlIIlIIIIlll, final int llllllllllllIllIlIlIIlIIlIIIIIII, final int llllllllllllIllIlIlIIlIIIlllllll, final int llllllllllllIllIlIlIIlIIlIIIIlII, final int llllllllllllIllIlIlIIlIIlIIIIIll, final int llllllllllllIllIlIlIIlIIlIIIIIlI) {
            this.btnChangeKeyBinding.mouseReleased(llllllllllllIllIlIlIIlIIlIIIIIII, llllllllllllIllIlIlIIlIIIlllllll);
            this.btnReset.mouseReleased(llllllllllllIllIlIlIIlIIlIIIIIII, llllllllllllIllIlIlIIlIIIlllllll);
        }
        
        private static boolean lIIlIlIIIlllIlIl(final Object llllllllllllIllIlIlIIlIIIlIIIIIl, final Object llllllllllllIllIlIlIIlIIIlIIIIII) {
            return llllllllllllIllIlIlIIlIIIlIIIIIl != llllllllllllIllIlIlIIlIIIlIIIIII;
        }
        
        private static void lIIlIlIIIllIllll() {
            (llIlIlIlIlllII = new String[KeyEntry.llIlIlIlIlllIl[10]])[KeyEntry.llIlIlIlIlllIl[0]] = lIIlIlIIIllIlIll("MfOlVfcBdvbviau1HJCs1Q==", "PDFUK");
            KeyEntry.llIlIlIlIlllII[KeyEntry.llIlIlIlIlllIl[4]] = lIIlIlIIIllIlIll("QlbDxC6SjmI=", "ntZuy");
            KeyEntry.llIlIlIlIlllII[KeyEntry.llIlIlIlIlllIl[6]] = lIIlIlIIIllIlllI("a0s=", "Kweyx");
        }
        
        private static boolean lIIlIlIIIlllIIlI(final int llllllllllllIllIlIlIIlIIIIllIlll, final int llllllllllllIllIlIlIIlIIIIllIllI) {
            return llllllllllllIllIlIlIIlIIIIllIlll != llllllllllllIllIlIlIIlIIIIllIllI;
        }
        
        private static boolean lIIlIlIIIlllIllI(final int llllllllllllIllIlIlIIlIIIlIIllIl, final int llllllllllllIllIlIlIIlIIIlIIllII) {
            return llllllllllllIllIlIlIIlIIIlIIllIl == llllllllllllIllIlIlIIlIIIlIIllII;
        }
        
        private KeyEntry(final KeyBinding llllllllllllIllIlIlIIlIIllIIIIII) {
            this.keybinding = llllllllllllIllIlIlIIlIIllIIIIII;
            this.keyDesc = I18n.format(llllllllllllIllIlIlIIlIIllIIIIII.getKeyDescription(), new Object[KeyEntry.llIlIlIlIlllIl[0]]);
            this.btnChangeKeyBinding = new GuiButton(KeyEntry.llIlIlIlIlllIl[0], KeyEntry.llIlIlIlIlllIl[0], KeyEntry.llIlIlIlIlllIl[0], KeyEntry.llIlIlIlIlllIl[1], KeyEntry.llIlIlIlIlllIl[2], I18n.format(llllllllllllIllIlIlIIlIIllIIIIII.getKeyDescription(), new Object[KeyEntry.llIlIlIlIlllIl[0]]));
            this.btnReset = new GuiButton(KeyEntry.llIlIlIlIlllIl[0], KeyEntry.llIlIlIlIlllIl[0], KeyEntry.llIlIlIlIlllIl[0], KeyEntry.llIlIlIlIlllIl[3], KeyEntry.llIlIlIlIlllIl[2], I18n.format(KeyEntry.llIlIlIlIlllII[KeyEntry.llIlIlIlIlllIl[0]], new Object[KeyEntry.llIlIlIlIlllIl[0]]));
        }
        
        @Override
        public void setSelected(final int llllllllllllIllIlIlIIlIIIlllllIl, final int llllllllllllIllIlIlIIlIIIlllllII, final int llllllllllllIllIlIlIIlIIIllllIll) {
        }
        
        @Override
        public boolean mousePressed(final int llllllllllllIllIlIlIIlIIlIIlIlII, final int llllllllllllIllIlIlIIlIIlIIIllIl, final int llllllllllllIllIlIlIIlIIlIIIllII, final int llllllllllllIllIlIlIIlIIlIIlIIIl, final int llllllllllllIllIlIlIIlIIlIIlIIII, final int llllllllllllIllIlIlIIlIIlIIIllll) {
            if (lIIlIlIIIlllIIll(this.btnChangeKeyBinding.mousePressed(GuiKeyBindingList.this.mc, llllllllllllIllIlIlIIlIIlIIIllIl, llllllllllllIllIlIlIIlIIlIIIllII) ? 1 : 0)) {
                GuiKeyBindingList.this.field_148191_k.buttonId = this.keybinding;
                return KeyEntry.llIlIlIlIlllIl[4] != 0;
            }
            if (lIIlIlIIIlllIIll(this.btnReset.mousePressed(GuiKeyBindingList.this.mc, llllllllllllIllIlIlIIlIIlIIIllIl, llllllllllllIllIlIlIIlIIlIIIllII) ? 1 : 0)) {
                GuiKeyBindingList.this.mc.gameSettings.setOptionKeyBinding(this.keybinding, this.keybinding.getKeyCodeDefault());
                KeyBinding.resetKeyBindingArrayAndHash();
                return KeyEntry.llIlIlIlIlllIl[4] != 0;
            }
            return KeyEntry.llIlIlIlIlllIl[0] != 0;
        }
        
        private static boolean lIIlIlIIIlllIIll(final int llllllllllllIllIlIlIIlIIIIlllIlI) {
            return llllllllllllIllIlIlIIlIIIIlllIlI != 0;
        }
        
        private static boolean lIIlIlIIIlllIIIl(final Object llllllllllllIllIlIlIIlIIIIllllIl, final Object llllllllllllIllIlIlIIlIIIIllllII) {
            return llllllllllllIllIlIlIIlIIIIllllIl == llllllllllllIllIlIlIIlIIIIllllII;
        }
        
        static {
            lIIlIlIIIlllIIII();
            lIIlIlIIIllIllll();
        }
        
        private static boolean lIIlIlIIIllllIII(final int llllllllllllIllIlIlIIlIIIlIIIlIl, final int llllllllllllIllIlIlIIlIIIlIIIlII) {
            return llllllllllllIllIlIlIIlIIIlIIIlIl < llllllllllllIllIlIlIIlIIIlIIIlII;
        }
        
        private static void lIIlIlIIIlllIIII() {
            (llIlIlIlIlllIl = new int[12])[0] = ((0xBB ^ 0xBF ^ (0x59 ^ 0x1B)) & (0x40 ^ 0x0 ^ (0x5D ^ 0x5B) ^ -" ".length()));
            KeyEntry.llIlIlIlIlllIl[1] = (0xD2 ^ 0x99);
            KeyEntry.llIlIlIlIlllIl[2] = (0x40 ^ 0x21 ^ (0x7C ^ 0x9));
            KeyEntry.llIlIlIlIlllIl[3] = (159 + 78 - 93 + 45 ^ 117 + 92 - 89 + 23);
            KeyEntry.llIlIlIlIlllIl[4] = " ".length();
            KeyEntry.llIlIlIlIlllIl[5] = (0x8D ^ 0xAC ^ (0x71 ^ 0xA));
            KeyEntry.llIlIlIlIlllIl[6] = "  ".length();
            KeyEntry.llIlIlIlIlllIl[7] = (-" ".length() & (-1 & 0xFFFFFF));
            KeyEntry.llIlIlIlIlllIl[8] = (0x5 ^ 0x78) + (114 + 53 - 31 + 45) - (117 + 44 - 38 + 47) + (0x3C ^ 0xA);
            KeyEntry.llIlIlIlIlllIl[9] = (0xCF ^ 0x95 ^ (0x3C ^ 0xF));
            KeyEntry.llIlIlIlIlllIl[10] = "   ".length();
            KeyEntry.llIlIlIlIlllIl[11] = (0x75 ^ 0x2E ^ (0xE6 ^ 0xB5));
        }
        
        private static boolean lIIlIlIIIlllIlll(final int llllllllllllIllIlIlIIlIIIlIIlIIl, final int llllllllllllIllIlIlIIlIIIlIIlIII) {
            return llllllllllllIllIlIlIIlIIIlIIlIIl >= llllllllllllIllIlIlIIlIIIlIIlIII;
        }
        
        private static String lIIlIlIIIllIlIll(final String llllllllllllIllIlIlIIlIIIllIlIll, final String llllllllllllIllIlIlIIlIIIllIlIlI) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIIlIIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIlIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), KeyEntry.llIlIlIlIlllIl[11]), "DES");
                final Cipher llllllllllllIllIlIlIIlIIIllIllll = Cipher.getInstance("DES");
                llllllllllllIllIlIlIIlIIIllIllll.init(KeyEntry.llIlIlIlIlllIl[6], llllllllllllIllIlIlIIlIIIlllIIII);
                return new String(llllllllllllIllIlIlIIlIIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIlIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIIlIIIllIlllI) {
                llllllllllllIllIlIlIIlIIIllIlllI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void drawEntry(final int llllllllllllIllIlIlIIlIIlIlIllll, final int llllllllllllIllIlIlIIlIIlIlIlllI, final int llllllllllllIllIlIlIIlIIlIlIllIl, final int llllllllllllIllIlIlIIlIIlIlIllII, final int llllllllllllIllIlIlIIlIIlIlIlIll, final int llllllllllllIllIlIlIIlIIlIlIIIII, final int llllllllllllIllIlIlIIlIIlIIlllll, final boolean llllllllllllIllIlIlIIlIIlIlIlIII) {
            int n;
            if (lIIlIlIIIlllIIIl(GuiKeyBindingList.this.field_148191_k.buttonId, this.keybinding)) {
                n = KeyEntry.llIlIlIlIlllIl[4];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            else {
                n = KeyEntry.llIlIlIlIlllIl[0];
            }
            final boolean llllllllllllIllIlIlIIlIIlIlIIlll = n != 0;
            GuiKeyBindingList.this.mc.fontRendererObj.drawString(this.keyDesc, llllllllllllIllIlIlIIlIIlIlIlllI + KeyEntry.llIlIlIlIlllIl[5] - GuiKeyBindingList.this.maxListLabelWidth, llllllllllllIllIlIlIIlIIlIlIllIl + llllllllllllIllIlIlIIlIIlIlIlIll / KeyEntry.llIlIlIlIlllIl[6] - GuiKeyBindingList.this.mc.fontRendererObj.FONT_HEIGHT / KeyEntry.llIlIlIlIlllIl[6], KeyEntry.llIlIlIlIlllIl[7]);
            "".length();
            this.btnReset.xPosition = llllllllllllIllIlIlIIlIIlIlIlllI + KeyEntry.llIlIlIlIlllIl[8];
            this.btnReset.yPosition = llllllllllllIllIlIlIIlIIlIlIllIl;
            final GuiButton btnReset = this.btnReset;
            int enabled;
            if (lIIlIlIIIlllIIlI(this.keybinding.getKeyCode(), this.keybinding.getKeyCodeDefault())) {
                enabled = KeyEntry.llIlIlIlIlllIl[4];
                "".length();
                if (((135 + 0 - 93 + 120 ^ 121 + 99 - 202 + 129) & (53 + 4 - 14 + 99 ^ 84 + 80 - 98 + 125 ^ -" ".length())) > 0) {
                    return;
                }
            }
            else {
                enabled = KeyEntry.llIlIlIlIlllIl[0];
            }
            btnReset.enabled = (enabled != 0);
            this.btnReset.drawButton(GuiKeyBindingList.this.mc, llllllllllllIllIlIlIIlIIlIlIIIII, llllllllllllIllIlIlIIlIIlIIlllll);
            this.btnChangeKeyBinding.xPosition = llllllllllllIllIlIlIIlIIlIlIlllI + KeyEntry.llIlIlIlIlllIl[9];
            this.btnChangeKeyBinding.yPosition = llllllllllllIllIlIlIIlIIlIlIllIl;
            this.btnChangeKeyBinding.displayString = GameSettings.getKeyDisplayString(this.keybinding.getKeyCode());
            boolean llllllllllllIllIlIlIIlIIlIlIIllI = KeyEntry.llIlIlIlIlllIl[0] != 0;
            if (lIIlIlIIIlllIIll(this.keybinding.getKeyCode())) {
                final short llllllllllllIllIlIlIIlIIlIIllIIl;
                final byte llllllllllllIllIlIlIIlIIlIIllIlI = (byte)((KeyBinding[])(Object)(llllllllllllIllIlIlIIlIIlIIllIIl = (short)(Object)GuiKeyBindingList.this.mc.gameSettings.keyBindings)).length;
                short llllllllllllIllIlIlIIlIIlIIllIll = (short)KeyEntry.llIlIlIlIlllIl[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIlIlIIIlllIlll(llllllllllllIllIlIlIIlIIlIIllIll, llllllllllllIllIlIlIIlIIlIIllIlI)) {
                    final KeyBinding llllllllllllIllIlIlIIlIIlIlIIlIl = llllllllllllIllIlIlIIlIIlIIllIIl[llllllllllllIllIlIlIIlIIlIIllIll];
                    if (lIIlIlIIIlllIlIl(llllllllllllIllIlIlIIlIIlIlIIlIl, this.keybinding) && lIIlIlIIIlllIllI(llllllllllllIllIlIlIIlIIlIlIIlIl.getKeyCode(), this.keybinding.getKeyCode())) {
                        llllllllllllIllIlIlIIlIIlIlIIllI = (KeyEntry.llIlIlIlIlllIl[4] != 0);
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIllIlIlIIlIIlIIllIll;
                    }
                }
            }
            if (lIIlIlIIIlllIIll(llllllllllllIllIlIlIIlIIlIlIIlll ? 1 : 0)) {
                this.btnChangeKeyBinding.displayString = String.valueOf(new StringBuilder().append(EnumChatFormatting.WHITE).append(KeyEntry.llIlIlIlIlllII[KeyEntry.llIlIlIlIlllIl[4]]).append(EnumChatFormatting.YELLOW).append(this.btnChangeKeyBinding.displayString).append(EnumChatFormatting.WHITE).append(KeyEntry.llIlIlIlIlllII[KeyEntry.llIlIlIlIlllIl[6]]));
                "".length();
                if (-" ".length() > "   ".length()) {
                    return;
                }
            }
            else if (lIIlIlIIIlllIIll(llllllllllllIllIlIlIIlIIlIlIIllI ? 1 : 0)) {
                this.btnChangeKeyBinding.displayString = String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(this.btnChangeKeyBinding.displayString));
            }
            this.btnChangeKeyBinding.drawButton(GuiKeyBindingList.this.mc, llllllllllllIllIlIlIIlIIlIlIIIII, llllllllllllIllIlIlIIlIIlIIlllll);
        }
        
        private static String lIIlIlIIIllIlllI(String llllllllllllIllIlIlIIlIIIlIlllIl, final String llllllllllllIllIlIlIIlIIIlIlllII) {
            llllllllllllIllIlIlIIlIIIlIlllIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIIlIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlIIlIIIlIllIll = new StringBuilder();
            final char[] llllllllllllIllIlIlIIlIIIlIllIlI = llllllllllllIllIlIlIIlIIIlIlllII.toCharArray();
            int llllllllllllIllIlIlIIlIIIlIllIIl = KeyEntry.llIlIlIlIlllIl[0];
            final String llllllllllllIllIlIlIIlIIIlIlIIll = (Object)llllllllllllIllIlIlIIlIIIlIlllIl.toCharArray();
            final int llllllllllllIllIlIlIIlIIIlIlIIlI = llllllllllllIllIlIlIIlIIIlIlIIll.length;
            float llllllllllllIllIlIlIIlIIIlIlIIIl = KeyEntry.llIlIlIlIlllIl[0];
            while (lIIlIlIIIllllIII((int)llllllllllllIllIlIlIIlIIIlIlIIIl, llllllllllllIllIlIlIIlIIIlIlIIlI)) {
                final char llllllllllllIllIlIlIIlIIIlIllllI = llllllllllllIllIlIlIIlIIIlIlIIll[llllllllllllIllIlIlIIlIIIlIlIIIl];
                llllllllllllIllIlIlIIlIIIlIllIll.append((char)(llllllllllllIllIlIlIIlIIIlIllllI ^ llllllllllllIllIlIlIIlIIIlIllIlI[llllllllllllIllIlIlIIlIIIlIllIIl % llllllllllllIllIlIlIIlIIIlIllIlI.length]));
                "".length();
                ++llllllllllllIllIlIlIIlIIIlIllIIl;
                ++llllllllllllIllIlIlIIlIIIlIlIIIl;
                "".length();
                if (((0xF3 ^ 0x80 ^ (0x77 ^ 0x11)) & (0x69 ^ 0x3B ^ (0xE8 ^ 0xAF) ^ -" ".length())) == -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlIIlIIIlIllIll);
        }
    }
    
    public class CategoryEntry implements IGuiListEntry
    {
        private static final /* synthetic */ int[] llIIlIIlllIIll;
        private final /* synthetic */ int labelWidth;
        private final /* synthetic */ String labelText;
        
        private static void lIIIllIIlIlIIIlI() {
            (llIIlIIlllIIll = new int[4])[0] = ((93 + 33 - 93 + 135 ^ 36 + 103 - 12 + 24) & (73 + 101 - 134 + 212 ^ 3 + 21 + 65 + 106 ^ -" ".length()));
            CategoryEntry.llIIlIIlllIIll[1] = "  ".length();
            CategoryEntry.llIIlIIlllIIll[2] = " ".length();
            CategoryEntry.llIIlIIlllIIll[3] = (-1 & 0xFFFFFF);
        }
        
        @Override
        public void drawEntry(final int llllllllllllIlllIIlIIlIIllllIlII, final int llllllllllllIlllIIlIIlIIllllIIll, final int llllllllllllIlllIIlIIlIIllllIIlI, final int llllllllllllIlllIIlIIlIIllllIIIl, final int llllllllllllIlllIIlIIlIIlllIlIlI, final int llllllllllllIlllIIlIIlIIlllIllll, final int llllllllllllIlllIIlIIlIIlllIlllI, final boolean llllllllllllIlllIIlIIlIIlllIllIl) {
            GuiKeyBindingList.this.mc.fontRendererObj.drawString(this.labelText, GuiKeyBindingList.this.mc.currentScreen.width / CategoryEntry.llIIlIIlllIIll[1] - this.labelWidth / CategoryEntry.llIIlIIlllIIll[1], llllllllllllIlllIIlIIlIIllllIIlI + llllllllllllIlllIIlIIlIIlllIlIlI - GuiKeyBindingList.this.mc.fontRendererObj.FONT_HEIGHT - CategoryEntry.llIIlIIlllIIll[2], CategoryEntry.llIIlIIlllIIll[3]);
            "".length();
        }
        
        static {
            lIIIllIIlIlIIIlI();
        }
        
        @Override
        public boolean mousePressed(final int llllllllllllIlllIIlIIlIIlllIlIII, final int llllllllllllIlllIIlIIlIIlllIIlll, final int llllllllllllIlllIIlIIlIIlllIIllI, final int llllllllllllIlllIIlIIlIIlllIIlIl, final int llllllllllllIlllIIlIIlIIlllIIlII, final int llllllllllllIlllIIlIIlIIlllIIIll) {
            return CategoryEntry.llIIlIIlllIIll[0] != 0;
        }
        
        @Override
        public void setSelected(final int llllllllllllIlllIIlIIlIIllIllIlI, final int llllllllllllIlllIIlIIlIIllIllIIl, final int llllllllllllIlllIIlIIlIIllIllIII) {
        }
        
        @Override
        public void mouseReleased(final int llllllllllllIlllIIlIIlIIlllIIIIl, final int llllllllllllIlllIIlIIlIIlllIIIII, final int llllllllllllIlllIIlIIlIIllIlllll, final int llllllllllllIlllIIlIIlIIllIllllI, final int llllllllllllIlllIIlIIlIIllIlllIl, final int llllllllllllIlllIIlIIlIIllIlllII) {
        }
        
        public CategoryEntry(final String llllllllllllIlllIIlIIlIIlllllIIl) {
            this.labelText = I18n.format(llllllllllllIlllIIlIIlIIlllllIIl, new Object[CategoryEntry.llIIlIIlllIIll[0]]);
            this.labelWidth = GuiKeyBindingList.this.mc.fontRendererObj.getStringWidth(this.labelText);
        }
    }
}
