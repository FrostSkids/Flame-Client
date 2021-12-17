// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.Minecraft;
import java.util.List;

public class GuiOptionsRowList extends GuiListExtended
{
    private final /* synthetic */ List<Row> field_148184_k;
    private static final /* synthetic */ int[] lllIIIllIlllII;
    
    private static boolean lIIllllIIIlIIlll(final int llllllllllllIlIlllllllIIlllIIIIl, final int llllllllllllIlIlllllllIIllIlllll) {
        return llllllllllllIlIlllllllIIlllIIIIl >= llllllllllllIlIlllllllIIllIlllll;
    }
    
    private static boolean lIIllllIIIlIlIIl(final int llllllllllllIlIlllllllIIllIlIIlI) {
        return llllllllllllIlIlllllllIIllIlIIlI != 0;
    }
    
    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + GuiOptionsRowList.lllIIIllIlllII[6];
    }
    
    private static boolean lIIllllIIIlIIllI(final int llllllllllllIlIlllllllIIllIllIIl, final int llllllllllllIlIlllllllIIllIllIII) {
        return llllllllllllIlIlllllllIIllIllIIl < llllllllllllIlIlllllllIIllIllIII;
    }
    
    private GuiButton func_148182_a(final Minecraft llllllllllllIlIlllllllIlIIIlIlll, final int llllllllllllIlIlllllllIlIIIIlllI, final int llllllllllllIlIlllllllIlIIIlIlII, final GameSettings.Options llllllllllllIlIlllllllIlIIIIlIlI) {
        if (lIIllllIIIlIlIII(llllllllllllIlIlllllllIlIIIIlIlI)) {
            return null;
        }
        final int llllllllllllIlIlllllllIlIIIlIIIl = llllllllllllIlIlllllllIlIIIIlIlI.returnEnumOrdinal();
        GuiButton guiButton;
        if (lIIllllIIIlIlIIl(llllllllllllIlIlllllllIlIIIIlIlI.getEnumFloat() ? 1 : 0)) {
            guiButton = new GuiOptionSlider(llllllllllllIlIlllllllIlIIIlIIIl, llllllllllllIlIlllllllIlIIIIlllI, llllllllllllIlIlllllllIlIIIlIlII, llllllllllllIlIlllllllIlIIIIlIlI);
            "".length();
            if (((8 + 123 - 128 + 133 ^ 138 + 138 - 136 + 28) & (0x4C ^ 0x57 ^ (0x64 ^ 0x5F) ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        else {
            guiButton = new GuiOptionButton(llllllllllllIlIlllllllIlIIIlIIIl, llllllllllllIlIlllllllIlIIIIlllI, llllllllllllIlIlllllllIlIIIlIlII, llllllllllllIlIlllllllIlIIIIlIlI, llllllllllllIlIlllllllIlIIIlIlll.gameSettings.getKeyBinding(llllllllllllIlIlllllllIlIIIIlIlI));
        }
        return guiButton;
    }
    
    private static void lIIllllIIIlIIlII() {
        (lllIIIllIlllII = new int[7])[0] = ((21 + 45 + 88 + 12 ^ 47 + 52 + 4 + 72) & (30 + 17 + 12 + 81 ^ 46 + 71 - 4 + 20 ^ -" ".length()));
        GuiOptionsRowList.lllIIIllIlllII[1] = " ".length();
        GuiOptionsRowList.lllIIIllIlllII[2] = "  ".length();
        GuiOptionsRowList.lllIIIllIlllII[3] = 27 + 148 - 61 + 37 + (0x5D ^ 0x4D) - (41 + 68 - 27 + 65) + (0 + 96 + 26 + 13);
        GuiOptionsRowList.lllIIIllIlllII[4] = 80 + 103 - 182 + 159;
        GuiOptionsRowList.lllIIIllIlllII[5] = (-(0xFFFFFFEF & 0x5C55) & (0xFFFFFDD4 & 0x5FFF));
        GuiOptionsRowList.lllIIIllIlllII[6] = (0x68 ^ 0x58 ^ (0xD6 ^ 0xC6));
    }
    
    static {
        lIIllllIIIlIIlII();
    }
    
    private static boolean lIIllllIIIlIlIII(final Object llllllllllllIlIlllllllIIllIlIlII) {
        return llllllllllllIlIlllllllIIllIlIlII == null;
    }
    
    public GuiOptionsRowList(final Minecraft llllllllllllIlIlllllllIlIlIIlIlI, final int llllllllllllIlIlllllllIlIlIIlIIl, final int llllllllllllIlIlllllllIlIIllIIll, final int llllllllllllIlIlllllllIlIIllIIlI, final int llllllllllllIlIlllllllIlIlIIIlIl, final int llllllllllllIlIlllllllIlIlIIIlII, final GameSettings.Options... llllllllllllIlIlllllllIlIIlIllll) {
        super(llllllllllllIlIlllllllIlIlIIlIlI, llllllllllllIlIlllllllIlIlIIlIIl, llllllllllllIlIlllllllIlIIllIIll, llllllllllllIlIlllllllIlIIllIIlI, llllllllllllIlIlllllllIlIlIIIlIl, llllllllllllIlIlllllllIlIlIIIlII);
        this.field_148184_k = (List<Row>)Lists.newArrayList();
        this.field_148163_i = (GuiOptionsRowList.lllIIIllIlllII[0] != 0);
        int llllllllllllIlIlllllllIlIlIIIIII = GuiOptionsRowList.lllIIIllIlllII[0];
        "".length();
        if ((0xC6 ^ 0xC2) < 0) {
            throw null;
        }
        while (!lIIllllIIIlIIlll(llllllllllllIlIlllllllIlIlIIIIII, llllllllllllIlIlllllllIlIIlIllll.length)) {
            final GameSettings.Options llllllllllllIlIlllllllIlIIlllllI = llllllllllllIlIlllllllIlIIlIllll[llllllllllllIlIlllllllIlIlIIIIII];
            GameSettings.Options options;
            if (lIIllllIIIlIIllI(llllllllllllIlIlllllllIlIlIIIIII, llllllllllllIlIlllllllIlIIlIllll.length - GuiOptionsRowList.lllIIIllIlllII[1])) {
                options = llllllllllllIlIlllllllIlIIlIllll[llllllllllllIlIlllllllIlIlIIIIII + GuiOptionsRowList.lllIIIllIlllII[1]];
                "".length();
                if ("   ".length() < " ".length()) {
                    throw null;
                }
            }
            else {
                options = null;
            }
            final GameSettings.Options llllllllllllIlIlllllllIlIIllllII = options;
            final GuiButton llllllllllllIlIlllllllIlIIlllIll = this.func_148182_a(llllllllllllIlIlllllllIlIlIIlIlI, llllllllllllIlIlllllllIlIlIIlIIl / GuiOptionsRowList.lllIIIllIlllII[2] - GuiOptionsRowList.lllIIIllIlllII[3], GuiOptionsRowList.lllIIIllIlllII[0], llllllllllllIlIlllllllIlIIlllllI);
            final GuiButton llllllllllllIlIlllllllIlIIlllIIl = this.func_148182_a(llllllllllllIlIlllllllIlIlIIlIlI, llllllllllllIlIlllllllIlIlIIlIIl / GuiOptionsRowList.lllIIIllIlllII[2] - GuiOptionsRowList.lllIIIllIlllII[3] + GuiOptionsRowList.lllIIIllIlllII[4], GuiOptionsRowList.lllIIIllIlllII[0], llllllllllllIlIlllllllIlIIllllII);
            this.field_148184_k.add(new Row(llllllllllllIlIlllllllIlIIlllIll, llllllllllllIlIlllllllIlIIlllIIl));
            "".length();
            llllllllllllIlIlllllllIlIlIIIIII += 2;
        }
    }
    
    @Override
    public Row getListEntry(final int llllllllllllIlIlllllllIIllllllII) {
        return this.field_148184_k.get(llllllllllllIlIlllllllIIllllllII);
    }
    
    @Override
    public int getListWidth() {
        return GuiOptionsRowList.lllIIIllIlllII[5];
    }
    
    @Override
    protected int getSize() {
        return this.field_148184_k.size();
    }
    
    public static class Row implements IGuiListEntry
    {
        private final /* synthetic */ GuiButton field_148323_b;
        private static final /* synthetic */ int[] lIIlIlIllIlllI;
        private final /* synthetic */ Minecraft field_148325_a;
        private final /* synthetic */ GuiButton field_148324_c;
        
        private static boolean llIlIIIlIlIIIII(final int lllllllllllllIIllIIllIlIIllIlIll) {
            return lllllllllllllIIllIIllIlIIllIlIll != 0;
        }
        
        static {
            llIlIIIlIIllllI();
        }
        
        @Override
        public void mouseReleased(final int lllllllllllllIIllIIllIlIIllllIll, final int lllllllllllllIIllIIllIlIIlllIlII, final int lllllllllllllIIllIIllIlIIllllIIl, final int lllllllllllllIIllIIllIlIIllllIII, final int lllllllllllllIIllIIllIlIIlllIlll, final int lllllllllllllIIllIIllIlIIlllIllI) {
            if (llIlIIIlIIlllll(this.field_148323_b)) {
                this.field_148323_b.mouseReleased(lllllllllllllIIllIIllIlIIlllIlII, lllllllllllllIIllIIllIlIIllllIIl);
            }
            if (llIlIIIlIIlllll(this.field_148324_c)) {
                this.field_148324_c.mouseReleased(lllllllllllllIIllIIllIlIIlllIlII, lllllllllllllIIllIIllIlIIllllIIl);
            }
        }
        
        private static boolean llIlIIIlIIlllll(final Object lllllllllllllIIllIIllIlIIllIllIl) {
            return lllllllllllllIIllIIllIlIIllIllIl != null;
        }
        
        @Override
        public void drawEntry(final int lllllllllllllIIllIIllIlIlIIllIII, final int lllllllllllllIIllIIllIlIlIIlIlll, final int lllllllllllllIIllIIllIlIlIIIllll, final int lllllllllllllIIllIIllIlIlIIlIlIl, final int lllllllllllllIIllIIllIlIlIIlIlII, final int lllllllllllllIIllIIllIlIlIIlIIll, final int lllllllllllllIIllIIllIlIlIIIllIl, final boolean lllllllllllllIIllIIllIlIlIIlIIIl) {
            if (llIlIIIlIIlllll(this.field_148323_b)) {
                this.field_148323_b.yPosition = lllllllllllllIIllIIllIlIlIIIllll;
                this.field_148323_b.drawButton(this.field_148325_a, lllllllllllllIIllIIllIlIlIIlIIll, lllllllllllllIIllIIllIlIlIIIllIl);
            }
            if (llIlIIIlIIlllll(this.field_148324_c)) {
                this.field_148324_c.yPosition = lllllllllllllIIllIIllIlIlIIIllll;
                this.field_148324_c.drawButton(this.field_148325_a, lllllllllllllIIllIIllIlIlIIlIIll, lllllllllllllIIllIIllIlIlIIIllIl);
            }
        }
        
        public Row(final GuiButton lllllllllllllIIllIIllIlIlIlIIIlI, final GuiButton lllllllllllllIIllIIllIlIlIIllllI) {
            this.field_148325_a = Minecraft.getMinecraft();
            this.field_148323_b = lllllllllllllIIllIIllIlIlIlIIIlI;
            this.field_148324_c = lllllllllllllIIllIIllIlIlIIllllI;
        }
        
        private static void llIlIIIlIIllllI() {
            (lIIlIlIllIlllI = new int[2])[0] = " ".length();
            Row.lIIlIlIllIlllI[1] = ((0xC3 ^ 0x84) & ~(0xC8 ^ 0x8F));
        }
        
        @Override
        public void setSelected(final int lllllllllllllIIllIIllIlIIlllIIIl, final int lllllllllllllIIllIIllIlIIlllIIII, final int lllllllllllllIIllIIllIlIIllIllll) {
        }
        
        @Override
        public boolean mousePressed(final int lllllllllllllIIllIIllIlIlIIIlIII, final int lllllllllllllIIllIIllIlIlIIIIlll, final int lllllllllllllIIllIIllIlIlIIIIllI, final int lllllllllllllIIllIIllIlIlIIIIlIl, final int lllllllllllllIIllIIllIlIlIIIIlII, final int lllllllllllllIIllIIllIlIlIIIIIll) {
            if (llIlIIIlIlIIIII(this.field_148323_b.mousePressed(this.field_148325_a, lllllllllllllIIllIIllIlIlIIIIlll, lllllllllllllIIllIIllIlIlIIIIllI) ? 1 : 0)) {
                if (llIlIIIlIlIIIII((this.field_148323_b instanceof GuiOptionButton) ? 1 : 0)) {
                    this.field_148325_a.gameSettings.setOptionValue(((GuiOptionButton)this.field_148323_b).returnEnumOptions(), Row.lIIlIlIllIlllI[0]);
                    this.field_148323_b.displayString = this.field_148325_a.gameSettings.getKeyBinding(GameSettings.Options.getEnumOptions(this.field_148323_b.id));
                }
                return Row.lIIlIlIllIlllI[0] != 0;
            }
            if (llIlIIIlIIlllll(this.field_148324_c) && llIlIIIlIlIIIII(this.field_148324_c.mousePressed(this.field_148325_a, lllllllllllllIIllIIllIlIlIIIIlll, lllllllllllllIIllIIllIlIlIIIIllI) ? 1 : 0)) {
                if (llIlIIIlIlIIIII((this.field_148324_c instanceof GuiOptionButton) ? 1 : 0)) {
                    this.field_148325_a.gameSettings.setOptionValue(((GuiOptionButton)this.field_148324_c).returnEnumOptions(), Row.lIIlIlIllIlllI[0]);
                    this.field_148324_c.displayString = this.field_148325_a.gameSettings.getKeyBinding(GameSettings.Options.getEnumOptions(this.field_148324_c.id));
                }
                return Row.lIIlIlIllIlllI[0] != 0;
            }
            return Row.lIIlIlIllIlllI[1] != 0;
        }
    }
}
