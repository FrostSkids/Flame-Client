// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import java.io.IOException;
import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.IChatComponent;
import java.util.List;

public class GuiDisconnected extends GuiScreen
{
    private /* synthetic */ List<String> multilineMessage;
    private /* synthetic */ String reason;
    private /* synthetic */ int field_175353_i;
    private /* synthetic */ IChatComponent message;
    private static final /* synthetic */ int[] lllIlIIlIlllII;
    private final /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ String[] lllIlIIlIllIlI;
    
    private static void lIlIIIlIIlIIIlII() {
        (lllIlIIlIlllII = new int[7])[0] = ((74 + 99 + 54 + 16 ^ 79 + 51 - 17 + 73) & (214 + 84 - 134 + 63 ^ 167 + 1 - 157 + 159 ^ -" ".length()));
        GuiDisconnected.lllIlIIlIlllII[1] = (0xA ^ 0x38);
        GuiDisconnected.lllIlIIlIlllII[2] = "  ".length();
        GuiDisconnected.lllIlIIlIlllII[3] = (0x19 ^ 0x70 ^ (0x6 ^ 0xB));
        GuiDisconnected.lllIlIIlIlllII[4] = (-(0xFFFFB99A & 0x5777) & (0xFFFFFBFF & 0xAABFBB));
        GuiDisconnected.lllIlIIlIlllII[5] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiDisconnected.lllIlIIlIlllII[6] = " ".length();
    }
    
    private static boolean lIlIIIlIIlIIIllI(final Object llllllllllllIlIllIllllIIlIllIIIl) {
        return llllllllllllIlIllIllllIIlIllIIIl != null;
    }
    
    private static boolean lIlIIIlIIlIIIlll(final int llllllllllllIlIllIllllIIlIllIlII, final int llllllllllllIlIllIllllIIlIllIIll) {
        return llllllllllllIlIllIllllIIlIllIlII < llllllllllllIlIllIllllIIlIllIIll;
    }
    
    private static boolean lIlIIIlIIlIIIlIl(final int llllllllllllIlIllIllllIIlIlIllll) {
        return llllllllllllIlIllIllllIIlIlIllll == 0;
    }
    
    private static String lIlIIIlIIlIIIIII(String llllllllllllIlIllIllllIIlIllllll, final String llllllllllllIlIllIllllIIllIIIIll) {
        llllllllllllIlIllIllllIIlIllllll = new String(Base64.getDecoder().decode(llllllllllllIlIllIllllIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIllllIIllIIIIlI = new StringBuilder();
        final char[] llllllllllllIlIllIllllIIllIIIIIl = llllllllllllIlIllIllllIIllIIIIll.toCharArray();
        int llllllllllllIlIllIllllIIllIIIIII = GuiDisconnected.lllIlIIlIlllII[0];
        final double llllllllllllIlIllIllllIIlIlllIlI = (Object)llllllllllllIlIllIllllIIlIllllll.toCharArray();
        final int llllllllllllIlIllIllllIIlIlllIIl = llllllllllllIlIllIllllIIlIlllIlI.length;
        char llllllllllllIlIllIllllIIlIlllIII = (char)GuiDisconnected.lllIlIIlIlllII[0];
        while (lIlIIIlIIlIIIlll(llllllllllllIlIllIllllIIlIlllIII, llllllllllllIlIllIllllIIlIlllIIl)) {
            final char llllllllllllIlIllIllllIIllIIIlIl = llllllllllllIlIllIllllIIlIlllIlI[llllllllllllIlIllIllllIIlIlllIII];
            llllllllllllIlIllIllllIIllIIIIlI.append((char)(llllllllllllIlIllIllllIIllIIIlIl ^ llllllllllllIlIllIllllIIllIIIIIl[llllllllllllIlIllIllllIIllIIIIII % llllllllllllIlIllIllllIIllIIIIIl.length]));
            "".length();
            ++llllllllllllIlIllIllllIIllIIIIII;
            ++llllllllllllIlIllIllllIIlIlllIII;
            "".length();
            if (-(0x9 ^ 0xC) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIllllIIllIIIIlI);
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        this.multilineMessage = this.fontRendererObj.listFormattedStringToWidth(this.message.getFormattedText(), this.width - GuiDisconnected.lllIlIIlIlllII[1]);
        this.field_175353_i = this.multilineMessage.size() * this.fontRendererObj.FONT_HEIGHT;
        this.buttonList.add(new GuiButton(GuiDisconnected.lllIlIIlIlllII[0], this.width / GuiDisconnected.lllIlIIlIlllII[2] - GuiDisconnected.lllIlIIlIlllII[3], this.height / GuiDisconnected.lllIlIIlIlllII[2] + this.field_175353_i / GuiDisconnected.lllIlIIlIlllII[2] + this.fontRendererObj.FONT_HEIGHT, I18n.format(GuiDisconnected.lllIlIIlIllIlI[GuiDisconnected.lllIlIIlIlllII[0]], new Object[GuiDisconnected.lllIlIIlIlllII[0]])));
        "".length();
    }
    
    static {
        lIlIIIlIIlIIIlII();
        lIlIIIlIIlIIIIIl();
    }
    
    public GuiDisconnected(final GuiScreen llllllllllllIlIllIllllIIllllIlIl, final String llllllllllllIlIllIllllIIllllIIII, final IChatComponent llllllllllllIlIllIllllIIlllIllll) {
        this.parentScreen = llllllllllllIlIllIllllIIllllIlIl;
        this.reason = I18n.format(llllllllllllIlIllIllllIIllllIIII, new Object[GuiDisconnected.lllIlIIlIlllII[0]]);
        this.message = llllllllllllIlIllIllllIIlllIllll;
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlIllIllllIIlllIllIl, final int llllllllllllIlIllIllllIIlllIllII) throws IOException {
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlIllIllllIIlllIIlIl) throws IOException {
        if (lIlIIIlIIlIIIlIl(llllllllllllIlIllIllllIIlllIIlIl.id)) {
            this.mc.displayGuiScreen(this.parentScreen);
        }
    }
    
    private static void lIlIIIlIIlIIIIIl() {
        (lllIlIIlIllIlI = new String[GuiDisconnected.lllIlIIlIlllII[6]])[GuiDisconnected.lllIlIIlIlllII[0]] = lIlIIIlIIlIIIIII("LzojSjcnAi8KNg==", "HOJdC");
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlIllIllllIIllIllIlI, final int llllllllllllIlIllIllllIIllIlIIll, final float llllllllllllIlIllIllllIIllIlIIlI) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.reason, this.width / GuiDisconnected.lllIlIIlIlllII[2], this.height / GuiDisconnected.lllIlIIlIlllII[2] - this.field_175353_i / GuiDisconnected.lllIlIIlIlllII[2] - this.fontRendererObj.FONT_HEIGHT * GuiDisconnected.lllIlIIlIlllII[2], GuiDisconnected.lllIlIIlIlllII[4]);
        int llllllllllllIlIllIllllIIllIlIlll = this.height / GuiDisconnected.lllIlIIlIlllII[2] - this.field_175353_i / GuiDisconnected.lllIlIIlIlllII[2];
        if (lIlIIIlIIlIIIllI(this.multilineMessage)) {
            final long llllllllllllIlIllIllllIIllIIllll = (long)this.multilineMessage.iterator();
            "".length();
            if (-(47 + 54 + 61 + 33 ^ 37 + 124 - 88 + 125) >= 0) {
                return;
            }
            while (!lIlIIIlIIlIIIlIl(((Iterator)llllllllllllIlIllIllllIIllIIllll).hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllIllllIIllIlIllI = ((Iterator<String>)llllllllllllIlIllIllllIIllIIllll).next();
                this.drawCenteredString(this.fontRendererObj, llllllllllllIlIllIllllIIllIlIllI, this.width / GuiDisconnected.lllIlIIlIlllII[2], llllllllllllIlIllIllllIIllIlIlll, GuiDisconnected.lllIlIIlIlllII[5]);
                llllllllllllIlIllIllllIIllIlIlll += this.fontRendererObj.FONT_HEIGHT;
            }
        }
        super.drawScreen(llllllllllllIlIllIllllIIllIllIlI, llllllllllllIlIllIllllIIllIlIIll, llllllllllllIlIllIllllIIllIlIIlI);
    }
}
