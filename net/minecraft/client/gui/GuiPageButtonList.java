// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import com.google.common.base.Objects;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.minecraft.util.IntHashMap;

public class GuiPageButtonList extends GuiListExtended
{
    private final /* synthetic */ IntHashMap<Gui> field_178073_v;
    private final /* synthetic */ List<GuiTextField> field_178072_w;
    private static final /* synthetic */ int[] lIlIIllIllllII;
    private final /* synthetic */ GuiListEntry[][] field_178078_x;
    private final /* synthetic */ List<GuiEntry> field_178074_u;
    private /* synthetic */ Gui field_178075_A;
    private /* synthetic */ GuiResponder field_178076_z;
    private static final /* synthetic */ String[] lIlIIllIlllIll;
    private /* synthetic */ int field_178077_y;
    
    private static boolean lllIlIIIlIIllIl(final Object lllllllllllllIIIllIIIlllIIIIlllI, final Object lllllllllllllIIIllIIIlllIIIIllIl) {
        return lllllllllllllIIIllIIIlllIIIIlllI != lllllllllllllIIIllIIIlllIIIIllIl;
    }
    
    private static boolean lllIlIIIlIIlIll(final int lllllllllllllIIIllIIIlllIIIIIlIl) {
        return lllllllllllllIIIllIIIlllIIIIIlIl == 0;
    }
    
    private static boolean lllIlIIIlIIlIlI(final int lllllllllllllIIIllIIIlllIIIIIIIl) {
        return lllllllllllllIIIllIIIlllIIIIIIIl > 0;
    }
    
    public void func_181155_a(final boolean lllllllllllllIIIllIIIlllllIIlIII) {
        final byte lllllllllllllIIIllIIIlllllIIIIll = (byte)this.field_178074_u.iterator();
        "".length();
        if (((105 + 17 + 2 + 24 ^ 122 + 4 - 37 + 71) & (0x50 ^ 0x74 ^ (0x75 ^ 0x65) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lllIlIIIlIIlIll(((Iterator)lllllllllllllIIIllIIIlllllIIIIll).hasNext() ? 1 : 0)) {
            final GuiEntry lllllllllllllIIIllIIIlllllIIIlll = ((Iterator<GuiEntry>)lllllllllllllIIIllIIIlllllIIIIll).next();
            if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIIIlll.field_178029_b instanceof GuiButton) ? 1 : 0)) {
                ((GuiButton)lllllllllllllIIIllIIIlllllIIIlll.field_178029_b).enabled = lllllllllllllIIIllIIIlllllIIlIII;
            }
            if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIIIlll.field_178030_c instanceof GuiButton) ? 1 : 0)) {
                ((GuiButton)lllllllllllllIIIllIIIlllllIIIlll.field_178030_c).enabled = lllllllllllllIIIllIIIlllllIIlIII;
            }
        }
    }
    
    private static String lllIlIIIlIIIIIl(String lllllllllllllIIIllIIIlllIIlIlIIl, final String lllllllllllllIIIllIIIlllIIlIllIl) {
        lllllllllllllIIIllIIIlllIIlIlIIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIIIlllIIlIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIIlllIIlIllII = new StringBuilder();
        final char[] lllllllllllllIIIllIIIlllIIlIlIll = lllllllllllllIIIllIIIlllIIlIllIl.toCharArray();
        int lllllllllllllIIIllIIIlllIIlIlIlI = GuiPageButtonList.lIlIIllIllllII[0];
        final float lllllllllllllIIIllIIIlllIIlIIlII = (Object)((String)lllllllllllllIIIllIIIlllIIlIlIIl).toCharArray();
        final String lllllllllllllIIIllIIIlllIIlIIIll = (String)lllllllllllllIIIllIIIlllIIlIIlII.length;
        byte lllllllllllllIIIllIIIlllIIlIIIlI = (byte)GuiPageButtonList.lIlIIllIllllII[0];
        while (lllIlIIIlIIIlII(lllllllllllllIIIllIIIlllIIlIIIlI, (int)lllllllllllllIIIllIIIlllIIlIIIll)) {
            final char lllllllllllllIIIllIIIlllIIlIllll = lllllllllllllIIIllIIIlllIIlIIlII[lllllllllllllIIIllIIIlllIIlIIIlI];
            lllllllllllllIIIllIIIlllIIlIllII.append((char)(lllllllllllllIIIllIIIlllIIlIllll ^ lllllllllllllIIIllIIIlllIIlIlIll[lllllllllllllIIIllIIIlllIIlIlIlI % lllllllllllllIIIllIIIlllIIlIlIll.length]));
            "".length();
            ++lllllllllllllIIIllIIIlllIIlIlIlI;
            ++lllllllllllllIIIllIIIlllIIlIIIlI;
            "".length();
            if ("   ".length() < ((0x5D ^ 0x16) & ~(0x54 ^ 0x1F))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIIlllIIlIllII);
    }
    
    private static boolean lllIlIIIlIIlIIl(final int lllllllllllllIIIllIIIllIlllllllI, final int lllllllllllllIIIllIIIllIllllllIl) {
        return lllllllllllllIIIllIIIllIlllllllI != lllllllllllllIIIllIIIllIllllllIl;
    }
    
    private static boolean lllIlIIIlIIIlll(final int lllllllllllllIIIllIIIlllIIIIIlll) {
        return lllllllllllllIIIllIIIlllIIIIIlll != 0;
    }
    
    private Gui func_178058_a(final GuiListEntry lllllllllllllIIIllIIIlllllIlIlII, final int lllllllllllllIIIllIIIlllllIIllll, final boolean lllllllllllllIIIllIIIlllllIlIIlI) {
        Gui gui;
        if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIlIlII instanceof GuiSlideEntry) ? 1 : 0)) {
            gui = this.func_178067_a(this.width / GuiPageButtonList.lIlIIllIllllII[3] - GuiPageButtonList.lIlIIllIllllII[4] + lllllllllllllIIIllIIIlllllIIllll, GuiPageButtonList.lIlIIllIllllII[0], (GuiSlideEntry)lllllllllllllIIIllIIIlllllIlIlII);
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        else if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIlIlII instanceof GuiButtonEntry) ? 1 : 0)) {
            gui = this.func_178065_a(this.width / GuiPageButtonList.lIlIIllIllllII[3] - GuiPageButtonList.lIlIIllIllllII[4] + lllllllllllllIIIllIIIlllllIIllll, GuiPageButtonList.lIlIIllIllllII[0], (GuiButtonEntry)lllllllllllllIIIllIIIlllllIlIlII);
            "".length();
            if (((0xEF ^ 0x93 ^ (0xC7 ^ 0x8E)) & (0x15 ^ 0x6F ^ (0x32 ^ 0x7D) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIlIlII instanceof EditBoxEntry) ? 1 : 0)) {
            gui = this.func_178068_a(this.width / GuiPageButtonList.lIlIIllIllllII[3] - GuiPageButtonList.lIlIIllIllllII[4] + lllllllllllllIIIllIIIlllllIIllll, GuiPageButtonList.lIlIIllIllllII[0], (EditBoxEntry)lllllllllllllIIIllIIIlllllIlIlII);
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIlIlII instanceof GuiLabelEntry) ? 1 : 0)) {
            gui = this.func_178063_a(this.width / GuiPageButtonList.lIlIIllIllllII[3] - GuiPageButtonList.lIlIIllIllllII[4] + lllllllllllllIIIllIIIlllllIIllll, GuiPageButtonList.lIlIIllIllllII[0], (GuiLabelEntry)lllllllllllllIIIllIIIlllllIlIlII, lllllllllllllIIIllIIIlllllIlIIlI);
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        else {
            gui = null;
        }
        return gui;
    }
    
    public void func_181156_c(final int lllllllllllllIIIllIIlIIIIIIIlIlI) {
        if (lllIlIIIlIIlIIl(lllllllllllllIIIllIIlIIIIIIIlIlI, this.field_178077_y)) {
            final int lllllllllllllIIIllIIlIIIIIIIllII = this.field_178077_y;
            this.field_178077_y = lllllllllllllIIIllIIlIIIIIIIlIlI;
            this.func_178055_t();
            this.func_178060_e(lllllllllllllIIIllIIlIIIIIIIllII, lllllllllllllIIIllIIlIIIIIIIlIlI);
            this.amountScrolled = 0.0f;
        }
    }
    
    public int getSize() {
        return this.field_178074_u.size();
    }
    
    public void func_178071_h() {
        if (lllIlIIIlIIlIlI(this.field_178077_y)) {
            this.func_181156_c(this.field_178077_y - GuiPageButtonList.lIlIIllIllllII[1]);
        }
    }
    
    @Override
    public GuiEntry getListEntry(final int lllllllllllllIIIllIIIlllIlIIIlII) {
        return this.field_178074_u.get(lllllllllllllIIIllIIIlllIlIIIlII);
    }
    
    private static boolean lllIlIIIlIIllII(final int lllllllllllllIIIllIIIlllIIIIIIll) {
        return lllllllllllllIIIllIIIlllIIIIIIll >= 0;
    }
    
    private static boolean lllIlIIIlIIIllI(final Object lllllllllllllIIIllIIIlllIIIIlIll) {
        return lllllllllllllIIIllIIIlllIIIIlIll != null;
    }
    
    private GuiTextField func_178068_a(final int lllllllllllllIIIllIIIllllIIIIlII, final int lllllllllllllIIIllIIIllllIIIlIII, final EditBoxEntry lllllllllllllIIIllIIIllllIIIIlll) {
        final GuiTextField lllllllllllllIIIllIIIllllIIIIllI = new GuiTextField(lllllllllllllIIIllIIIllllIIIIlll.func_178935_b(), this.mc.fontRendererObj, lllllllllllllIIIllIIIllllIIIIlII, lllllllllllllIIIllIIIllllIIIlIII, GuiPageButtonList.lIlIIllIllllII[5], GuiPageButtonList.lIlIIllIllllII[6]);
        lllllllllllllIIIllIIIllllIIIIllI.setText(lllllllllllllIIIllIIIllllIIIIlll.func_178936_c());
        lllllllllllllIIIllIIIllllIIIIllI.func_175207_a(this.field_178076_z);
        lllllllllllllIIIllIIIllllIIIIllI.setVisible(lllllllllllllIIIllIIIllllIIIIlll.func_178934_d());
        lllllllllllllIIIllIIIllllIIIIllI.func_175205_a(lllllllllllllIIIllIIIllllIIIIlll.func_178950_a());
        return lllllllllllllIIIllIIIllllIIIIllI;
    }
    
    public void func_178062_a(final char lllllllllllllIIIllIIIlllIlIlIlII, final int lllllllllllllIIIllIIIlllIlIlllll) {
        if (lllIlIIIlIIIlll((this.field_178075_A instanceof GuiTextField) ? 1 : 0)) {
            GuiTextField lllllllllllllIIIllIIIlllIlIllllI = (GuiTextField)this.field_178075_A;
            if (lllIlIIIlIIlIll(GuiScreen.isKeyComboCtrlV(lllllllllllllIIIllIIIlllIlIlllll) ? 1 : 0)) {
                if (lllIlIIIlIIlllI(lllllllllllllIIIllIIIlllIlIlllll, GuiPageButtonList.lIlIIllIllllII[8])) {
                    lllllllllllllIIIllIIIlllIlIllllI.setFocused((boolean)(GuiPageButtonList.lIlIIllIllllII[0] != 0));
                    int lllllllllllllIIIllIIIlllIlIlllIl = this.field_178072_w.indexOf(this.field_178075_A);
                    if (lllIlIIIlIIIlll(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                        if (lllIlIIIlIIlIll(lllllllllllllIIIllIIIlllIlIlllIl)) {
                            lllllllllllllIIIllIIIlllIlIlllIl = this.field_178072_w.size() - GuiPageButtonList.lIlIIllIllllII[1];
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            --lllllllllllllIIIllIIIlllIlIlllIl;
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                    }
                    else if (lllIlIIIlIIlllI(lllllllllllllIIIllIIIlllIlIlllIl, this.field_178072_w.size() - GuiPageButtonList.lIlIIllIllllII[1])) {
                        lllllllllllllIIIllIIIlllIlIlllIl = GuiPageButtonList.lIlIIllIllllII[0];
                        "".length();
                        if (-(0x5 ^ 0x5D ^ (0x75 ^ 0x29)) >= 0) {
                            return;
                        }
                    }
                    else {
                        ++lllllllllllllIIIllIIIlllIlIlllIl;
                    }
                    this.field_178075_A = this.field_178072_w.get(lllllllllllllIIIllIIIlllIlIlllIl);
                    lllllllllllllIIIllIIIlllIlIllllI = (GuiTextField)this.field_178075_A;
                    lllllllllllllIIIllIIIlllIlIllllI.setFocused((boolean)(GuiPageButtonList.lIlIIllIllllII[1] != 0));
                    final int lllllllllllllIIIllIIIlllIlIlllII = lllllllllllllIIIllIIIlllIlIllllI.yPosition + this.slotHeight;
                    final int lllllllllllllIIIllIIIlllIlIllIll = lllllllllllllIIIllIIIlllIlIllllI.yPosition;
                    if (lllIlIIIlIIllll(lllllllllllllIIIllIIIlllIlIlllII, this.bottom)) {
                        this.amountScrolled += lllllllllllllIIIllIIIlllIlIlllII - this.bottom;
                        "".length();
                        if (-" ".length() >= "   ".length()) {
                            return;
                        }
                    }
                    else if (lllIlIIIlIIIlII(lllllllllllllIIIllIIIlllIlIllIll, this.top)) {
                        this.amountScrolled = (float)lllllllllllllIIIllIIIlllIlIllIll;
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return;
                        }
                    }
                }
                else {
                    lllllllllllllIIIllIIIlllIlIllllI.textboxKeyTyped(lllllllllllllIIIllIIIlllIlIlIlII, lllllllllllllIIIllIIIlllIlIlllll);
                    "".length();
                    "".length();
                    if ((0x36 ^ 0x19 ^ (0xAB ^ 0x80)) < 0) {
                        return;
                    }
                }
            }
            else {
                final String lllllllllllllIIIllIIIlllIlIllIlI = GuiScreen.getClipboardString();
                final String[] lllllllllllllIIIllIIIlllIlIllIIl = lllllllllllllIIIllIIIlllIlIllIlI.split(GuiPageButtonList.lIlIIllIlllIll[GuiPageButtonList.lIlIIllIllllII[0]]);
                int lllllllllllllIIIllIIIlllIlIlIlll;
                final int lllllllllllllIIIllIIIlllIlIllIII = lllllllllllllIIIllIIIlllIlIlIlll = this.field_178072_w.indexOf(this.field_178075_A);
                final float lllllllllllllIIIllIIIlllIlIIlIlI;
                final char lllllllllllllIIIllIIIlllIlIIlIll = (char)((String[])(Object)(lllllllllllllIIIllIIIlllIlIIlIlI = (float)(Object)lllllllllllllIIIllIIIlllIlIllIIl)).length;
                byte lllllllllllllIIIllIIIlllIlIIllII = (byte)GuiPageButtonList.lIlIIllIllllII[0];
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                while (!lllIlIIIlIIlIII(lllllllllllllIIIllIIIlllIlIIllII, lllllllllllllIIIllIIIlllIlIIlIll)) {
                    final String lllllllllllllIIIllIIIlllIlIlIllI = lllllllllllllIIIllIIIlllIlIIlIlI[lllllllllllllIIIllIIIlllIlIIllII];
                    this.field_178072_w.get(lllllllllllllIIIllIIIlllIlIlIlll).setText(lllllllllllllIIIllIIIlllIlIlIllI);
                    if (lllIlIIIlIIlllI(lllllllllllllIIIllIIIlllIlIlIlll, this.field_178072_w.size() - GuiPageButtonList.lIlIIllIllllII[1])) {
                        lllllllllllllIIIllIIIlllIlIlIlll = GuiPageButtonList.lIlIIllIllllII[0];
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                    }
                    else {
                        ++lllllllllllllIIIllIIIlllIlIlIlll;
                    }
                    if (lllIlIIIlIIlllI(lllllllllllllIIIllIIIlllIlIlIlll, lllllllllllllIIIllIIIlllIlIllIII)) {
                        "".length();
                        if (-" ".length() >= "  ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        ++lllllllllllllIIIllIIIlllIlIIllII;
                    }
                }
            }
        }
    }
    
    public GuiPageButtonList(final Minecraft lllllllllllllIIIllIIlIIIIlIIllII, final int lllllllllllllIIIllIIlIIIIlIIlIll, final int lllllllllllllIIIllIIlIIIIlIlIIll, final int lllllllllllllIIIllIIlIIIIlIlIIlI, final int lllllllllllllIIIllIIlIIIIlIIlIII, final int lllllllllllllIIIllIIlIIIIlIlIIII, final GuiResponder lllllllllllllIIIllIIlIIIIlIIllll, final GuiListEntry[]... lllllllllllllIIIllIIlIIIIlIIIlIl) {
        super(lllllllllllllIIIllIIlIIIIlIIllII, lllllllllllllIIIllIIlIIIIlIIlIll, lllllllllllllIIIllIIlIIIIlIlIIll, lllllllllllllIIIllIIlIIIIlIlIIlI, lllllllllllllIIIllIIlIIIIlIIlIII, lllllllllllllIIIllIIlIIIIlIlIIII);
        this.field_178074_u = (List<GuiEntry>)Lists.newArrayList();
        this.field_178073_v = new IntHashMap<Gui>();
        this.field_178072_w = (List<GuiTextField>)Lists.newArrayList();
        this.field_178076_z = lllllllllllllIIIllIIlIIIIlIIllll;
        this.field_178078_x = lllllllllllllIIIllIIlIIIIlIIIlIl;
        this.field_148163_i = (GuiPageButtonList.lIlIIllIllllII[0] != 0);
        this.func_178069_s();
        this.func_178055_t();
    }
    
    private GuiLabel func_178063_a(final int lllllllllllllIIIllIIIlllIlllIIlI, final int lllllllllllllIIIllIIIlllIllllIII, final GuiLabelEntry lllllllllllllIIIllIIIlllIlllIIII, final boolean lllllllllllllIIIllIIIlllIlllIllI) {
        GuiLabel lllllllllllllIIIllIIIlllIlllIlII = null;
        if (lllIlIIIlIIIlll(lllllllllllllIIIllIIIlllIlllIllI ? 1 : 0)) {
            final GuiLabel lllllllllllllIIIllIIIlllIlllIlIl = new GuiLabel(this.mc.fontRendererObj, lllllllllllllIIIllIIIlllIlllIIII.func_178935_b(), lllllllllllllIIIllIIIlllIlllIIlI, lllllllllllllIIIllIIIlllIllllIII, this.width - lllllllllllllIIIllIIIlllIlllIIlI * GuiPageButtonList.lIlIIllIllllII[3], GuiPageButtonList.lIlIIllIllllII[6], GuiPageButtonList.lIlIIllIllllII[7]);
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIIIllIIIlllIlllIlII = new GuiLabel(this.mc.fontRendererObj, lllllllllllllIIIllIIIlllIlllIIII.func_178935_b(), lllllllllllllIIIllIIIlllIlllIIlI, lllllllllllllIIIllIIIlllIllllIII, GuiPageButtonList.lIlIIllIllllII[5], GuiPageButtonList.lIlIIllIllllII[6], GuiPageButtonList.lIlIIllIllllII[7]);
        }
        lllllllllllllIIIllIIIlllIlllIlII.visible = lllllllllllllIIIllIIIlllIlllIIII.func_178934_d();
        lllllllllllllIIIllIIIlllIlllIlII.func_175202_a(lllllllllllllIIIllIIIlllIlllIIII.func_178936_c());
        lllllllllllllIIIllIIIlllIlllIlII.setCentered();
        "".length();
        return lllllllllllllIIIllIIIlllIlllIlII;
    }
    
    public Gui func_178061_c(final int lllllllllllllIIIllIIIlllllllIllI) {
        return this.field_178073_v.lookup(lllllllllllllIIIllIIIlllllllIllI);
    }
    
    public int func_178057_f() {
        return this.field_178078_x.length;
    }
    
    private GuiListButton func_178065_a(final int lllllllllllllIIIllIIIllllIIllIII, final int lllllllllllllIIIllIIIllllIIlIIlI, final GuiButtonEntry lllllllllllllIIIllIIIllllIIlIllI) {
        final GuiListButton lllllllllllllIIIllIIIllllIIlIlIl = new GuiListButton(this.field_178076_z, lllllllllllllIIIllIIIllllIIlIllI.func_178935_b(), lllllllllllllIIIllIIIllllIIllIII, lllllllllllllIIIllIIIllllIIlIIlI, lllllllllllllIIIllIIIllllIIlIllI.func_178936_c(), lllllllllllllIIIllIIIllllIIlIllI.func_178940_a());
        lllllllllllllIIIllIIIllllIIlIlIl.visible = lllllllllllllIIIllIIIllllIIlIllI.func_178934_d();
        return lllllllllllllIIIllIIIllllIIlIlIl;
    }
    
    private GuiSlider func_178067_a(final int lllllllllllllIIIllIIIllllIlIIIlI, final int lllllllllllllIIIllIIIllllIlIIIIl, final GuiSlideEntry lllllllllllllIIIllIIIllllIlIIIII) {
        final GuiSlider lllllllllllllIIIllIIIllllIlIIlII = new GuiSlider(this.field_178076_z, lllllllllllllIIIllIIIllllIlIIIII.func_178935_b(), lllllllllllllIIIllIIIllllIlIIIlI, lllllllllllllIIIllIIIllllIlIIIIl, lllllllllllllIIIllIIIllllIlIIIII.func_178936_c(), lllllllllllllIIIllIIIllllIlIIIII.func_178943_e(), lllllllllllllIIIllIIIllllIlIIIII.func_178944_f(), lllllllllllllIIIllIIIllllIlIIIII.func_178942_g(), lllllllllllllIIIllIIIllllIlIIIII.func_178945_a());
        lllllllllllllIIIllIIIllllIlIIlII.visible = lllllllllllllIIIllIIIllllIlIIIII.func_178934_d();
        return lllllllllllllIIIllIIIllllIlIIlII;
    }
    
    public Gui func_178056_g() {
        return this.field_178075_A;
    }
    
    private void func_178055_t() {
        this.field_178074_u.clear();
        int lllllllllllllIIIllIIlIIIIIIllllI = GuiPageButtonList.lIlIIllIllllII[0];
        "".length();
        if ("  ".length() >= (0x49 ^ 0x69 ^ (0x32 ^ 0x16))) {
            return;
        }
        while (!lllIlIIIlIIlIII(lllllllllllllIIIllIIlIIIIIIllllI, this.field_178078_x[this.field_178077_y].length)) {
            final GuiListEntry lllllllllllllIIIllIIlIIIIIIlllIl = this.field_178078_x[this.field_178077_y][lllllllllllllIIIllIIlIIIIIIllllI];
            GuiListEntry guiListEntry;
            if (lllIlIIIlIIIlII(lllllllllllllIIIllIIlIIIIIIllllI, this.field_178078_x[this.field_178077_y].length - GuiPageButtonList.lIlIIllIllllII[1])) {
                guiListEntry = this.field_178078_x[this.field_178077_y][lllllllllllllIIIllIIlIIIIIIllllI + GuiPageButtonList.lIlIIllIllllII[1]];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                guiListEntry = null;
            }
            final GuiListEntry lllllllllllllIIIllIIlIIIIIIlllII = guiListEntry;
            final Gui lllllllllllllIIIllIIlIIIIIIllIll = this.field_178073_v.lookup(lllllllllllllIIIllIIlIIIIIIlllIl.func_178935_b());
            Gui gui;
            if (lllIlIIIlIIIllI(lllllllllllllIIIllIIlIIIIIIlllII)) {
                gui = this.field_178073_v.lookup(lllllllllllllIIIllIIlIIIIIIlllII.func_178935_b());
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
            else {
                gui = null;
            }
            final Gui lllllllllllllIIIllIIlIIIIIIllIlI = gui;
            final GuiEntry lllllllllllllIIIllIIlIIIIIIllIIl = new GuiEntry(lllllllllllllIIIllIIlIIIIIIllIll, lllllllllllllIIIllIIlIIIIIIllIlI);
            this.field_178074_u.add(lllllllllllllIIIllIIlIIIIIIllIIl);
            "".length();
            lllllllllllllIIIllIIlIIIIIIllllI += 2;
        }
    }
    
    private void func_178060_e(final int lllllllllllllIIIllIIIllllllIIllI, final int lllllllllllllIIIllIIIllllllIlIlI) {
        int lllllllllllllIIIllIIIllllllIIIIl;
        double lllllllllllllIIIllIIIllllllIIIlI = ((GuiListEntry[])(Object)(lllllllllllllIIIllIIIllllllIIIIl = (int)(Object)this.field_178078_x[lllllllllllllIIIllIIIllllllIIllI])).length;
        String lllllllllllllIIIllIIIllllllIIIll = (String)GuiPageButtonList.lIlIIllIllllII[0];
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!lllIlIIIlIIlIII((int)lllllllllllllIIIllIIIllllllIIIll, (int)lllllllllllllIIIllIIIllllllIIIlI)) {
            final GuiListEntry lllllllllllllIIIllIIIllllllIlIIl = lllllllllllllIIIllIIIllllllIIIIl[lllllllllllllIIIllIIIllllllIIIll];
            if (lllIlIIIlIIIllI(lllllllllllllIIIllIIIllllllIlIIl)) {
                this.func_178066_a(this.field_178073_v.lookup(lllllllllllllIIIllIIIllllllIlIIl.func_178935_b()), (boolean)(GuiPageButtonList.lIlIIllIllllII[0] != 0));
            }
            ++lllllllllllllIIIllIIIllllllIIIll;
        }
        lllllllllllllIIIllIIIllllllIIIlI = ((GuiListEntry[])(Object)(lllllllllllllIIIllIIIllllllIIIIl = (int)(Object)this.field_178078_x[lllllllllllllIIIllIIIllllllIlIlI])).length;
        lllllllllllllIIIllIIIllllllIIIll = (String)GuiPageButtonList.lIlIIllIllllII[0];
        "".length();
        if ("   ".length() > (0x64 ^ 0x2E ^ (0xC1 ^ 0x8F))) {
            return;
        }
        while (!lllIlIIIlIIlIII((int)lllllllllllllIIIllIIIllllllIIIll, (int)lllllllllllllIIIllIIIllllllIIIlI)) {
            final GuiListEntry lllllllllllllIIIllIIIllllllIlIII = lllllllllllllIIIllIIIllllllIIIIl[lllllllllllllIIIllIIIllllllIIIll];
            if (lllIlIIIlIIIllI(lllllllllllllIIIllIIIllllllIlIII)) {
                this.func_178066_a(this.field_178073_v.lookup(lllllllllllllIIIllIIIllllllIlIII.func_178935_b()), (boolean)(GuiPageButtonList.lIlIIllIllllII[1] != 0));
            }
            ++lllllllllllllIIIllIIIllllllIIIll;
        }
    }
    
    private static void lllIlIIIlIIIIlI() {
        (lIlIIllIlllIll = new String[GuiPageButtonList.lIlIIllIllllII[1]])[GuiPageButtonList.lIlIIllIllllII[0]] = lllIlIIIlIIIIIl("Vg==", "mdhyC");
    }
    
    public void func_178064_i() {
        if (lllIlIIIlIIIlII(this.field_178077_y, this.field_178078_x.length - GuiPageButtonList.lIlIIllIllllII[1])) {
            this.func_181156_c(this.field_178077_y + GuiPageButtonList.lIlIIllIllllII[1]);
        }
    }
    
    @Override
    public boolean mouseClicked(final int lllllllllllllIIIllIIIllllIlllIlI, final int lllllllllllllIIIllIIIllllIlllIIl, final int lllllllllllllIIIllIIIllllIlllIII) {
        final boolean lllllllllllllIIIllIIIllllIllIlll = super.mouseClicked(lllllllllllllIIIllIIIllllIlllIlI, lllllllllllllIIIllIIIllllIlllIIl, lllllllllllllIIIllIIIllllIlllIII);
        final int lllllllllllllIIIllIIIllllIllIllI = this.getSlotIndexFromScreenCoords(lllllllllllllIIIllIIIllllIlllIlI, lllllllllllllIIIllIIIllllIlllIIl);
        if (lllIlIIIlIIllII(lllllllllllllIIIllIIIllllIllIllI)) {
            final GuiEntry lllllllllllllIIIllIIIllllIllIlIl = this.getListEntry(lllllllllllllIIIllIIIllllIllIllI);
            if (lllIlIIIlIIllIl(this.field_178075_A, lllllllllllllIIIllIIIllllIllIlIl.field_178028_d) && lllIlIIIlIIIllI(this.field_178075_A) && lllIlIIIlIIIlll((this.field_178075_A instanceof GuiTextField) ? 1 : 0)) {
                ((GuiTextField)this.field_178075_A).setFocused((boolean)(GuiPageButtonList.lIlIIllIllllII[0] != 0));
            }
            this.field_178075_A = lllllllllllllIIIllIIIllllIllIlIl.field_178028_d;
        }
        return lllllllllllllIIIllIIIllllIllIlll;
    }
    
    public int func_178059_e() {
        return this.field_178077_y;
    }
    
    private void func_178069_s() {
        final float lllllllllllllIIIllIIlIIIIIlIllIl;
        final short lllllllllllllIIIllIIlIIIIIlIlllI = (short)((GuiListEntry[][])(Object)(lllllllllllllIIIllIIlIIIIIlIllIl = (float)(Object)this.field_178078_x)).length;
        String lllllllllllllIIIllIIlIIIIIlIllll = (String)GuiPageButtonList.lIlIIllIllllII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIlIIIlIIlIII((int)lllllllllllllIIIllIIlIIIIIlIllll, lllllllllllllIIIllIIlIIIIIlIlllI)) {
            final GuiListEntry[] lllllllllllllIIIllIIlIIIIIlllIII = lllllllllllllIIIllIIlIIIIIlIllIl[lllllllllllllIIIllIIlIIIIIlIllll];
            int lllllllllllllIIIllIIlIIIIIllIlll = GuiPageButtonList.lIlIIllIllllII[0];
            "".length();
            if (((0x6E ^ 0x31) & ~(0x71 ^ 0x2E)) != 0x0) {
                return;
            }
            while (!lllIlIIIlIIlIII(lllllllllllllIIIllIIlIIIIIllIlll, lllllllllllllIIIllIIlIIIIIlllIII.length)) {
                final GuiListEntry lllllllllllllIIIllIIlIIIIIllIllI = lllllllllllllIIIllIIlIIIIIlllIII[lllllllllllllIIIllIIlIIIIIllIlll];
                GuiListEntry guiListEntry;
                if (lllIlIIIlIIIlII(lllllllllllllIIIllIIlIIIIIllIlll, lllllllllllllIIIllIIlIIIIIlllIII.length - GuiPageButtonList.lIlIIllIllllII[1])) {
                    guiListEntry = lllllllllllllIIIllIIlIIIIIlllIII[lllllllllllllIIIllIIlIIIIIllIlll + GuiPageButtonList.lIlIIllIllllII[1]];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else {
                    guiListEntry = null;
                }
                final GuiListEntry lllllllllllllIIIllIIlIIIIIllIlIl = guiListEntry;
                final GuiListEntry lllllllllllllIIIllIIIlllllIlIlII = lllllllllllllIIIllIIlIIIIIllIllI;
                final int lllllllllllllIIIllIIIlllllIIllll = GuiPageButtonList.lIlIIllIllllII[0];
                int lllllllllllllIIIllIIIlllllIlIIlI;
                if (lllIlIIIlIIIlIl(lllllllllllllIIIllIIlIIIIIllIlIl)) {
                    lllllllllllllIIIllIIIlllllIlIIlI = GuiPageButtonList.lIlIIllIllllII[1];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIllIIIlllllIlIIlI = GuiPageButtonList.lIlIIllIllllII[0];
                }
                final Gui lllllllllllllIIIllIIlIIIIIllIlII = this.func_178058_a(lllllllllllllIIIllIIIlllllIlIlII, lllllllllllllIIIllIIIlllllIIllll, (boolean)(lllllllllllllIIIllIIIlllllIlIIlI != 0));
                final GuiListEntry lllllllllllllIIIllIIIlllllIlIlII2 = lllllllllllllIIIllIIlIIIIIllIlIl;
                final int lllllllllllllIIIllIIIlllllIIllll2 = GuiPageButtonList.lIlIIllIllllII[2];
                int lllllllllllllIIIllIIIlllllIlIIlI2;
                if (lllIlIIIlIIIlIl(lllllllllllllIIIllIIlIIIIIllIllI)) {
                    lllllllllllllIIIllIIIlllllIlIIlI2 = GuiPageButtonList.lIlIIllIllllII[1];
                    "".length();
                    if (((0x16 ^ 0x41) & ~(0x34 ^ 0x63)) == "   ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIllIIIlllllIlIIlI2 = GuiPageButtonList.lIlIIllIllllII[0];
                }
                final Gui lllllllllllllIIIllIIlIIIIIllIIll = this.func_178058_a(lllllllllllllIIIllIIIlllllIlIlII2, lllllllllllllIIIllIIIlllllIIllll2, (boolean)(lllllllllllllIIIllIIIlllllIlIIlI2 != 0));
                final GuiEntry lllllllllllllIIIllIIlIIIIIllIIlI = new GuiEntry(lllllllllllllIIIllIIlIIIIIllIlII, lllllllllllllIIIllIIlIIIIIllIIll);
                this.field_178074_u.add(lllllllllllllIIIllIIlIIIIIllIIlI);
                "".length();
                if (lllIlIIIlIIIllI(lllllllllllllIIIllIIlIIIIIllIllI) && lllIlIIIlIIIllI(lllllllllllllIIIllIIlIIIIIllIlII)) {
                    this.field_178073_v.addKey(lllllllllllllIIIllIIlIIIIIllIllI.func_178935_b(), lllllllllllllIIIllIIlIIIIIllIlII);
                    if (lllIlIIIlIIIlll((lllllllllllllIIIllIIlIIIIIllIlII instanceof GuiTextField) ? 1 : 0)) {
                        this.field_178072_w.add((GuiTextField)lllllllllllllIIIllIIlIIIIIllIlII);
                        "".length();
                    }
                }
                if (lllIlIIIlIIIllI(lllllllllllllIIIllIIlIIIIIllIlIl) && lllIlIIIlIIIllI(lllllllllllllIIIllIIlIIIIIllIIll)) {
                    this.field_178073_v.addKey(lllllllllllllIIIllIIlIIIIIllIlIl.func_178935_b(), lllllllllllllIIIllIIlIIIIIllIIll);
                    if (lllIlIIIlIIIlll((lllllllllllllIIIllIIlIIIIIllIIll instanceof GuiTextField) ? 1 : 0)) {
                        this.field_178072_w.add((GuiTextField)lllllllllllllIIIllIIlIIIIIllIIll);
                        "".length();
                    }
                }
                lllllllllllllIIIllIIlIIIIIllIlll += 2;
            }
            ++lllllllllllllIIIllIIlIIIIIlIllll;
        }
    }
    
    private void func_178066_a(final Gui lllllllllllllIIIllIIIlllllIlllIl, final boolean lllllllllllllIIIllIIIlllllIlllII) {
        if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIlllIl instanceof GuiButton) ? 1 : 0)) {
            ((GuiButton)lllllllllllllIIIllIIIlllllIlllIl).visible = lllllllllllllIIIllIIIlllllIlllII;
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIlllIl instanceof GuiTextField) ? 1 : 0)) {
            ((GuiTextField)lllllllllllllIIIllIIIlllllIlllIl).setVisible(lllllllllllllIIIllIIIlllllIlllII);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else if (lllIlIIIlIIIlll((lllllllllllllIIIllIIIlllllIlllIl instanceof GuiLabel) ? 1 : 0)) {
            ((GuiLabel)lllllllllllllIIIllIIIlllllIlllIl).visible = lllllllllllllIIIllIIIlllllIlllII;
        }
    }
    
    private static boolean lllIlIIIlIIlIII(final int lllllllllllllIIIllIIIlllIIIllIlI, final int lllllllllllllIIIllIIIlllIIIllIIl) {
        return lllllllllllllIIIllIIIlllIIIllIlI >= lllllllllllllIIIllIIIlllIIIllIIl;
    }
    
    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + GuiPageButtonList.lIlIIllIllllII[10];
    }
    
    @Override
    public int getListWidth() {
        return GuiPageButtonList.lIlIIllIllllII[9];
    }
    
    private static boolean lllIlIIIlIIIlII(final int lllllllllllllIIIllIIIlllIIIlIllI, final int lllllllllllllIIIllIIIlllIIIlIlIl) {
        return lllllllllllllIIIllIIIlllIIIlIllI < lllllllllllllIIIllIIIlllIIIlIlIl;
    }
    
    private static void lllIlIIIlIIIIll() {
        (lIlIIllIllllII = new int[11])[0] = ((0x1E ^ 0x55 ^ (0x31 ^ 0x41)) & (0x15 ^ 0x24 ^ (0x77 ^ 0x7D) ^ -" ".length()));
        GuiPageButtonList.lIlIIllIllllII[1] = " ".length();
        GuiPageButtonList.lIlIIllIllllII[2] = 44 + 109 - 69 + 76;
        GuiPageButtonList.lIlIIllIllllII[3] = "  ".length();
        GuiPageButtonList.lIlIIllIllllII[4] = 42 + 19 - 33 + 127;
        GuiPageButtonList.lIlIIllIllllII[5] = (0x93 ^ 0x98) + (0x40 ^ 0x21) - -(0x99 ^ 0xB8) + (0x4B ^ 0x42);
        GuiPageButtonList.lIlIIllIllllII[6] = (65 + 104 - 28 + 5 ^ 9 + 51 + 53 + 21);
        GuiPageButtonList.lIlIIllIllllII[7] = -" ".length();
        GuiPageButtonList.lIlIIllIllllII[8] = (0x6C ^ 0x47 ^ (0x1C ^ 0x38));
        GuiPageButtonList.lIlIIllIllllII[9] = (0xFFFFB9BE & 0x47D1);
        GuiPageButtonList.lIlIIllIllllII[10] = (0x66 ^ 0x25 ^ (0x45 ^ 0x26));
    }
    
    private static boolean lllIlIIIlIIIlIl(final Object lllllllllllllIIIllIIIlllIIIIlIIl) {
        return lllllllllllllIIIllIIIlllIIIIlIIl == null;
    }
    
    private static boolean lllIlIIIlIIlllI(final int lllllllllllllIIIllIIIlllIIIllllI, final int lllllllllllllIIIllIIIlllIIIlllIl) {
        return lllllllllllllIIIllIIIlllIIIllllI == lllllllllllllIIIllIIIlllIIIlllIl;
    }
    
    private static boolean lllIlIIIlIIllll(final int lllllllllllllIIIllIIIlllIIIlIIlI, final int lllllllllllllIIIllIIIlllIIIlIIIl) {
        return lllllllllllllIIIllIIIlllIIIlIIlI > lllllllllllllIIIllIIIlllIIIlIIIl;
    }
    
    static {
        lllIlIIIlIIIIll();
        lllIlIIIlIIIIlI();
    }
    
    public static class EditBoxEntry extends GuiListEntry
    {
        private final /* synthetic */ Predicate<String> field_178951_a;
        
        public Predicate<String> func_178950_a() {
            return this.field_178951_a;
        }
        
        public EditBoxEntry(final int llllllllllllIlIllIlIIIIIlllIIlII, final String llllllllllllIlIllIlIIIIIlllIlIII, final boolean llllllllllllIlIllIlIIIIIlllIIIlI, final Predicate<String> llllllllllllIlIllIlIIIIIlllIIIIl) {
            super(llllllllllllIlIllIlIIIIIlllIIlII, llllllllllllIlIllIlIIIIIlllIlIII, llllllllllllIlIllIlIIIIIlllIIIlI);
            this.field_178951_a = (Predicate<String>)Objects.firstNonNull((Object)llllllllllllIlIllIlIIIIIlllIIIIl, (Object)Predicates.alwaysTrue());
        }
    }
    
    public static class GuiListEntry
    {
        private final /* synthetic */ boolean field_178938_c;
        private final /* synthetic */ String field_178937_b;
        private final /* synthetic */ int field_178939_a;
        
        public String func_178936_c() {
            return this.field_178937_b;
        }
        
        public int func_178935_b() {
            return this.field_178939_a;
        }
        
        public boolean func_178934_d() {
            return this.field_178938_c;
        }
        
        public GuiListEntry(final int llllllllllllIlIllllIIlllIIIIllll, final String llllllllllllIlIllllIIlllIIIlIIlI, final boolean llllllllllllIlIllllIIlllIIIIllIl) {
            this.field_178939_a = llllllllllllIlIllllIIlllIIIIllll;
            this.field_178937_b = llllllllllllIlIllllIIlllIIIlIIlI;
            this.field_178938_c = llllllllllllIlIllllIIlllIIIIllIl;
        }
    }
    
    public static class GuiEntry implements IGuiListEntry
    {
        private /* synthetic */ Gui field_178028_d;
        private static final /* synthetic */ int[] llIIIlllIIIlII;
        private final /* synthetic */ Gui field_178029_b;
        private final /* synthetic */ Minecraft field_178031_a;
        private final /* synthetic */ Gui field_178030_c;
        
        private void func_178019_b(final GuiButton llllllllllllIlllIlIIIlIIllllIllI, final int llllllllllllIlllIlIIIlIIllllIlIl, final int llllllllllllIlllIlIIIlIIllllIlII, final int llllllllllllIlllIlIIIlIIllllIIll) {
            llllllllllllIlllIlIIIlIIllllIllI.mouseReleased(llllllllllllIlllIlIIIlIIllllIlIl, llllllllllllIlllIlIIIlIIllllIlII);
        }
        
        private void func_178018_a(final GuiTextField llllllllllllIlllIlIIIlIlIIlIIIIl, final int llllllllllllIlllIlIIIlIlIIIllIll, final int llllllllllllIlllIlIIIlIlIIIllIlI, final int llllllllllllIlllIlIIIlIlIIIllllI) {
            llllllllllllIlllIlIIIlIlIIlIIIIl.mouseClicked(llllllllllllIlllIlIIIlIlIIIllIll, llllllllllllIlllIlIIIlIlIIIllIlI, llllllllllllIlllIlIIIlIlIIIllllI);
            if (lIIIlIlIlIllIlIl(llllllllllllIlllIlIIIlIlIIlIIIIl.isFocused() ? 1 : 0)) {
                this.field_178028_d = llllllllllllIlllIlIIIlIlIIlIIIIl;
            }
        }
        
        public Gui func_178022_a() {
            return this.field_178029_b;
        }
        
        static {
            lIIIlIlIlIllIIll();
        }
        
        private void func_178017_a(final Gui llllllllllllIlllIlIIIlIllIIlllII, final int llllllllllllIlllIlIIIlIllIIllIll, final int llllllllllllIlllIlIIIlIllIIllIlI, final int llllllllllllIlllIlIIIlIllIIlIIll, final boolean llllllllllllIlllIlIIIlIllIIllIII) {
            if (lIIIlIlIlIllIlII(llllllllllllIlllIlIIIlIllIIlllII)) {
                if (lIIIlIlIlIllIlIl((llllllllllllIlllIlIIIlIllIIlllII instanceof GuiButton) ? 1 : 0)) {
                    this.func_178024_a((GuiButton)llllllllllllIlllIlIIIlIllIIlllII, llllllllllllIlllIlIIIlIllIIllIll, llllllllllllIlllIlIIIlIllIIllIlI, llllllllllllIlllIlIIIlIllIIlIIll, llllllllllllIlllIlIIIlIllIIllIII);
                    "".length();
                    if ("  ".length() == (137 + 131 - 208 + 84 ^ 48 + 76 - 53 + 77)) {
                        return;
                    }
                }
                else if (lIIIlIlIlIllIlIl((llllllllllllIlllIlIIIlIllIIlllII instanceof GuiTextField) ? 1 : 0)) {
                    this.func_178027_a((GuiTextField)llllllllllllIlllIlIIIlIllIIlllII, llllllllllllIlllIlIIIlIllIIllIll, llllllllllllIlllIlIIIlIllIIllIII);
                    "".length();
                    if (((0x34 ^ 0x3A) & ~(0x15 ^ 0x1B)) != 0x0) {
                        return;
                    }
                }
                else if (lIIIlIlIlIllIlIl((llllllllllllIlllIlIIIlIllIIlllII instanceof GuiLabel) ? 1 : 0)) {
                    this.func_178025_a((GuiLabel)llllllllllllIlllIlIIIlIllIIlllII, llllllllllllIlllIlIIIlIllIIllIll, llllllllllllIlllIlIIIlIllIIllIlI, llllllllllllIlllIlIIIlIllIIlIIll, llllllllllllIlllIlIIIlIllIIllIII);
                }
            }
        }
        
        @Override
        public boolean mousePressed(final int llllllllllllIlllIlIIIlIlIlIlIlII, final int llllllllllllIlllIlIIIlIlIlIlIIll, final int llllllllllllIlllIlIIIlIlIlIlIIlI, final int llllllllllllIlllIlIIIlIlIlIlIIIl, final int llllllllllllIlllIlIIIlIlIlIlIIII, final int llllllllllllIlllIlIIIlIlIlIIllll) {
            final boolean llllllllllllIlllIlIIIlIlIlIIlllI = this.func_178026_a(this.field_178029_b, llllllllllllIlllIlIIIlIlIlIlIIll, llllllllllllIlllIlIIIlIlIlIlIIlI, llllllllllllIlllIlIIIlIlIlIlIIIl);
            final boolean llllllllllllIlllIlIIIlIlIlIIllIl = this.func_178026_a(this.field_178030_c, llllllllllllIlllIlIIIlIlIlIlIIll, llllllllllllIlllIlIIIlIlIlIlIIlI, llllllllllllIlllIlIIIlIlIlIlIIIl);
            if (lIIIlIlIlIllIllI(llllllllllllIlllIlIIIlIlIlIIlllI ? 1 : 0) && lIIIlIlIlIllIllI(llllllllllllIlllIlIIIlIlIlIIllIl ? 1 : 0)) {
                return GuiEntry.llIIIlllIIIlII[0] != 0;
            }
            return GuiEntry.llIIIlllIIIlII[1] != 0;
        }
        
        private static boolean lIIIlIlIlIllIllI(final int llllllllllllIlllIlIIIlIIlllIIIlI) {
            return llllllllllllIlllIlIIIlIIlllIIIlI == 0;
        }
        
        @Override
        public void mouseReleased(final int llllllllllllIlllIlIIIlIlIIIlIIll, final int llllllllllllIlllIlIIIlIlIIIIllII, final int llllllllllllIlllIlIIIlIlIIIlIIIl, final int llllllllllllIlllIlIIIlIlIIIlIIII, final int llllllllllllIlllIlIIIlIlIIIIllll, final int llllllllllllIlllIlIIIlIlIIIIlllI) {
            this.func_178016_b(this.field_178029_b, llllllllllllIlllIlIIIlIlIIIIllII, llllllllllllIlllIlIIIlIlIIIlIIIl, llllllllllllIlllIlIIIlIlIIIlIIII);
            this.func_178016_b(this.field_178030_c, llllllllllllIlllIlIIIlIlIIIIllII, llllllllllllIlllIlIIIlIlIIIlIIIl, llllllllllllIlllIlIIIlIlIIIlIIII);
        }
        
        private void func_178016_b(final Gui llllllllllllIlllIlIIIlIlIIIIIIll, final int llllllllllllIlllIlIIIlIlIIIIIIlI, final int llllllllllllIlllIlIIIlIIllllllII, final int llllllllllllIlllIlIIIlIIlllllIll) {
            if (lIIIlIlIlIllIlII(llllllllllllIlllIlIIIlIlIIIIIIll) && lIIIlIlIlIllIlIl((llllllllllllIlllIlIIIlIlIIIIIIll instanceof GuiButton) ? 1 : 0)) {
                this.func_178019_b((GuiButton)llllllllllllIlllIlIIIlIlIIIIIIll, llllllllllllIlllIlIIIlIlIIIIIIlI, llllllllllllIlllIlIIIlIIllllllII, llllllllllllIlllIlIIIlIIlllllIll);
            }
        }
        
        public Gui func_178021_b() {
            return this.field_178030_c;
        }
        
        private void func_178025_a(final GuiLabel llllllllllllIlllIlIIIlIlIllIlIII, final int llllllllllllIlllIlIIIlIlIllIllIl, final int llllllllllllIlllIlIIIlIlIllIIllI, final int llllllllllllIlllIlIIIlIlIllIIlIl, final boolean llllllllllllIlllIlIIIlIlIllIlIlI) {
            llllllllllllIlllIlIIIlIlIllIlIII.field_146174_h = llllllllllllIlllIlIIIlIlIllIllIl;
            if (lIIIlIlIlIllIllI(llllllllllllIlllIlIIIlIlIllIlIlI ? 1 : 0)) {
                llllllllllllIlllIlIIIlIlIllIlIII.drawLabel(this.field_178031_a, llllllllllllIlllIlIIIlIlIllIIllI, llllllllllllIlllIlIIIlIlIllIIlIl);
            }
        }
        
        private void func_178027_a(final GuiTextField llllllllllllIlllIlIIIlIlIllllIll, final int llllllllllllIlllIlIIIlIlIllllIlI, final boolean llllllllllllIlllIlIIIlIlIlllIllI) {
            llllllllllllIlllIlIIIlIlIllllIll.yPosition = llllllllllllIlllIlIIIlIlIllllIlI;
            if (lIIIlIlIlIllIllI(llllllllllllIlllIlIIIlIlIlllIllI ? 1 : 0)) {
                llllllllllllIlllIlIIIlIlIllllIll.drawTextBox();
            }
        }
        
        public GuiEntry(final Gui llllllllllllIlllIlIIIlIllIllllll, final Gui llllllllllllIlllIlIIIlIllIlllIll) {
            this.field_178031_a = Minecraft.getMinecraft();
            this.field_178029_b = llllllllllllIlllIlIIIlIllIllllll;
            this.field_178030_c = llllllllllllIlllIlIIIlIllIlllIll;
        }
        
        private static void lIIIlIlIlIllIIll() {
            (llIIIlllIIIlII = new int[2])[0] = ((133 + 83 - 186 + 111 ^ 141 + 86 - 189 + 140) & (76 + 132 - 28 + 0 ^ 134 + 32 - 88 + 61 ^ -" ".length()));
            GuiEntry.llIIIlllIIIlII[1] = " ".length();
        }
        
        @Override
        public void setSelected(final int llllllllllllIlllIlIIIlIlIllIIIII, final int llllllllllllIlllIlIIIlIlIlIlllll, final int llllllllllllIlllIlIIIlIlIlIllllI) {
            this.func_178017_a(this.field_178029_b, llllllllllllIlllIlIIIlIlIlIllllI, GuiEntry.llIIIlllIIIlII[0], GuiEntry.llIIIlllIIIlII[0], (boolean)(GuiEntry.llIIIlllIIIlII[1] != 0));
            this.func_178017_a(this.field_178030_c, llllllllllllIlllIlIIIlIlIlIllllI, GuiEntry.llIIIlllIIIlII[0], GuiEntry.llIIIlllIIIlII[0], (boolean)(GuiEntry.llIIIlllIIIlII[1] != 0));
        }
        
        private static boolean lIIIlIlIlIllIlll(final Object llllllllllllIlllIlIIIlIIlllIIllI) {
            return llllllllllllIlllIlIIIlIIlllIIllI == null;
        }
        
        private static boolean lIIIlIlIlIllIlIl(final int llllllllllllIlllIlIIIlIIlllIIlII) {
            return llllllllllllIlllIlIIIlIIlllIIlII != 0;
        }
        
        private boolean func_178023_a(final GuiButton llllllllllllIlllIlIIIlIlIIllIIIl, final int llllllllllllIlllIlIIIlIlIIlIlIlI, final int llllllllllllIlllIlIIIlIlIIlIlIIl, final int llllllllllllIlllIlIIIlIlIIlIlllI) {
            final boolean llllllllllllIlllIlIIIlIlIIlIllIl = llllllllllllIlllIlIIIlIlIIllIIIl.mousePressed(this.field_178031_a, llllllllllllIlllIlIIIlIlIIlIlIlI, llllllllllllIlllIlIIIlIlIIlIlIIl);
            if (lIIIlIlIlIllIlIl(llllllllllllIlllIlIIIlIlIIlIllIl ? 1 : 0)) {
                this.field_178028_d = llllllllllllIlllIlIIIlIlIIllIIIl;
            }
            return llllllllllllIlllIlIIIlIlIIlIllIl;
        }
        
        private static boolean lIIIlIlIlIllIlII(final Object llllllllllllIlllIlIIIlIIlllIlIII) {
            return llllllllllllIlllIlIIIlIIlllIlIII != null;
        }
        
        @Override
        public void drawEntry(final int llllllllllllIlllIlIIIlIllIlIllll, final int llllllllllllIlllIlIIIlIllIlIlllI, final int llllllllllllIlllIlIIIlIllIlIllIl, final int llllllllllllIlllIlIIIlIllIlIllII, final int llllllllllllIlllIlIIIlIllIlIlIll, final int llllllllllllIlllIlIIIlIllIlIlIlI, final int llllllllllllIlllIlIIIlIllIlIIlII, final boolean llllllllllllIlllIlIIIlIllIlIlIII) {
            this.func_178017_a(this.field_178029_b, llllllllllllIlllIlIIIlIllIlIllIl, llllllllllllIlllIlIIIlIllIlIlIlI, llllllllllllIlllIlIIIlIllIlIIlII, (boolean)(GuiEntry.llIIIlllIIIlII[0] != 0));
            this.func_178017_a(this.field_178030_c, llllllllllllIlllIlIIIlIllIlIllIl, llllllllllllIlllIlIIIlIllIlIlIlI, llllllllllllIlllIlIIIlIllIlIIlII, (boolean)(GuiEntry.llIIIlllIIIlII[0] != 0));
        }
        
        private boolean func_178026_a(final Gui llllllllllllIlllIlIIIlIlIIlllIll, final int llllllllllllIlllIlIIIlIlIIllllll, final int llllllllllllIlllIlIIIlIlIIlllIIl, final int llllllllllllIlllIlIIIlIlIIllllIl) {
            if (lIIIlIlIlIllIlll(llllllllllllIlllIlIIIlIlIIlllIll)) {
                return GuiEntry.llIIIlllIIIlII[0] != 0;
            }
            if (lIIIlIlIlIllIlIl((llllllllllllIlllIlIIIlIlIIlllIll instanceof GuiButton) ? 1 : 0)) {
                return this.func_178023_a((GuiButton)llllllllllllIlllIlIIIlIlIIlllIll, llllllllllllIlllIlIIIlIlIIllllll, llllllllllllIlllIlIIIlIlIIlllIIl, llllllllllllIlllIlIIIlIlIIllllIl);
            }
            if (lIIIlIlIlIllIlIl((llllllllllllIlllIlIIIlIlIIlllIll instanceof GuiTextField) ? 1 : 0)) {
                this.func_178018_a((GuiTextField)llllllllllllIlllIlIIIlIlIIlllIll, llllllllllllIlllIlIIIlIlIIllllll, llllllllllllIlllIlIIIlIlIIlllIIl, llllllllllllIlllIlIIIlIlIIllllIl);
            }
            return GuiEntry.llIIIlllIIIlII[0] != 0;
        }
        
        private void func_178024_a(final GuiButton llllllllllllIlllIlIIIlIllIIIIlII, final int llllllllllllIlllIlIIIlIllIIIIIll, final int llllllllllllIlllIlIIIlIllIIIlIII, final int llllllllllllIlllIlIIIlIllIIIIlll, final boolean llllllllllllIlllIlIIIlIllIIIIllI) {
            llllllllllllIlllIlIIIlIllIIIIlII.yPosition = llllllllllllIlllIlIIIlIllIIIIIll;
            if (lIIIlIlIlIllIllI(llllllllllllIlllIlIIIlIllIIIIllI ? 1 : 0)) {
                llllllllllllIlllIlIIIlIllIIIIlII.drawButton(this.field_178031_a, llllllllllllIlllIlIIIlIllIIIlIII, llllllllllllIlllIlIIIlIllIIIIlll);
            }
        }
    }
    
    public static class GuiButtonEntry extends GuiListEntry
    {
        private final /* synthetic */ boolean field_178941_a;
        
        public boolean func_178940_a() {
            return this.field_178941_a;
        }
        
        public GuiButtonEntry(final int llllllllllllIllIlllIIIlIlIIlIIll, final String llllllllllllIllIlllIIIlIlIIlIIlI, final boolean llllllllllllIllIlllIIIlIlIIlIIIl, final boolean llllllllllllIllIlllIIIlIlIIIlIll) {
            super(llllllllllllIllIlllIIIlIlIIlIIll, llllllllllllIllIlllIIIlIlIIlIIlI, llllllllllllIllIlllIIIlIlIIlIIIl);
            this.field_178941_a = llllllllllllIllIlllIIIlIlIIIlIll;
        }
    }
    
    public interface GuiResponder
    {
        void onTick(final int p0, final float p1);
        
        void func_175319_a(final int p0, final String p1);
        
        void func_175321_a(final int p0, final boolean p1);
    }
    
    public static class GuiLabelEntry extends GuiListEntry
    {
        public GuiLabelEntry(final int lllllllllllllIIllIllIIIllIllIIIl, final String lllllllllllllIIllIllIIIllIllIlII, final boolean lllllllllllllIIllIllIIIllIllIIll) {
            super(lllllllllllllIIllIllIIIllIllIIIl, lllllllllllllIIllIllIIIllIllIlII, lllllllllllllIIllIllIIIllIllIIll);
        }
    }
    
    public static class GuiSlideEntry extends GuiListEntry
    {
        private final /* synthetic */ float field_178946_d;
        private final /* synthetic */ GuiSlider.FormatHelper field_178949_a;
        private final /* synthetic */ float field_178947_b;
        private final /* synthetic */ float field_178948_c;
        
        public GuiSlideEntry(final int lllllllllllllIIIIllIlIllIllIlIIl, final String lllllllllllllIIIIllIlIllIllIlIII, final boolean lllllllllllllIIIIllIlIllIllIllll, final GuiSlider.FormatHelper lllllllllllllIIIIllIlIllIllIlllI, final float lllllllllllllIIIIllIlIllIllIllIl, final float lllllllllllllIIIIllIlIllIllIIlII, final float lllllllllllllIIIIllIlIllIllIlIll) {
            super(lllllllllllllIIIIllIlIllIllIlIIl, lllllllllllllIIIIllIlIllIllIlIII, lllllllllllllIIIIllIlIllIllIllll);
            this.field_178949_a = lllllllllllllIIIIllIlIllIllIlllI;
            this.field_178947_b = lllllllllllllIIIIllIlIllIllIllIl;
            this.field_178948_c = lllllllllllllIIIIllIlIllIllIIlII;
            this.field_178946_d = lllllllllllllIIIIllIlIllIllIlIll;
        }
        
        public float func_178942_g() {
            return this.field_178946_d;
        }
        
        public float func_178944_f() {
            return this.field_178948_c;
        }
        
        public float func_178943_e() {
            return this.field_178947_b;
        }
        
        public GuiSlider.FormatHelper func_178945_a() {
            return this.field_178949_a;
        }
    }
}
