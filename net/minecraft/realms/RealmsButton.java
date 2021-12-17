// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.gui.GuiButtonRealmsProxy;
import net.minecraft.util.ResourceLocation;

public class RealmsButton
{
    private static final /* synthetic */ int[] llIlIllIIIlIll;
    private /* synthetic */ GuiButtonRealmsProxy proxy;
    private static final /* synthetic */ String[] llIlIllIIIlIlI;
    
    private static void lIIlIlIlIIIIIIlI() {
        (llIlIllIIIlIll = new int[2])[0] = ((127 + 4 - 111 + 123 ^ 1 + 88 + 76 + 7) & (0x10 ^ 0x6 ^ (0xAD ^ 0x98) ^ -" ".length()));
        RealmsButton.llIlIllIIIlIll[1] = " ".length();
    }
    
    public int getHeight() {
        return this.proxy.func_175232_g();
    }
    
    public RealmsButton(final int llllllllllllIllIlIIlllIIlIIIIIIl, final int llllllllllllIllIlIIlllIIIllllIll, final int llllllllllllIllIlIIlllIIIllllIlI, final String llllllllllllIllIlIIlllIIIllllIIl) {
        this.proxy = new GuiButtonRealmsProxy(this, llllllllllllIllIlIIlllIIlIIIIIIl, llllllllllllIllIlIIlllIIIllllIll, llllllllllllIllIlIIlllIIIllllIlI, llllllllllllIllIlIIlllIIIllllIIl);
    }
    
    public void clicked(final int llllllllllllIllIlIIlllIIIIlllIll, final int llllllllllllIllIlIIlllIIIIlllIlI) {
    }
    
    private static String lIIlIlIlIIIIIIII(String llllllllllllIllIlIIlllIIIIIIlIIl, final String llllllllllllIllIlIIlllIIIIIIlIII) {
        llllllllllllIllIlIIlllIIIIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlllIIIIIIllII = new StringBuilder();
        final char[] llllllllllllIllIlIIlllIIIIIIlIll = llllllllllllIllIlIIlllIIIIIIlIII.toCharArray();
        int llllllllllllIllIlIIlllIIIIIIlIlI = RealmsButton.llIlIllIIIlIll[0];
        final char llllllllllllIllIlIIlllIIIIIIIlII = (Object)llllllllllllIllIlIIlllIIIIIIlIIl.toCharArray();
        final boolean llllllllllllIllIlIIlllIIIIIIIIll = llllllllllllIllIlIIlllIIIIIIIlII.length != 0;
        short llllllllllllIllIlIIlllIIIIIIIIlI = (short)RealmsButton.llIlIllIIIlIll[0];
        while (lIIlIlIlIIIIIIll(llllllllllllIllIlIIlllIIIIIIIIlI, llllllllllllIllIlIIlllIIIIIIIIll ? 1 : 0)) {
            final char llllllllllllIllIlIIlllIIIIIIllll = llllllllllllIllIlIIlllIIIIIIIlII[llllllllllllIllIlIIlllIIIIIIIIlI];
            llllllllllllIllIlIIlllIIIIIIllII.append((char)(llllllllllllIllIlIIlllIIIIIIllll ^ llllllllllllIllIlIIlllIIIIIIlIll[llllllllllllIllIlIIlllIIIIIIlIlI % llllllllllllIllIlIIlllIIIIIIlIll.length]));
            "".length();
            ++llllllllllllIllIlIIlllIIIIIIlIlI;
            ++llllllllllllIllIlIIlllIIIIIIIIlI;
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlllIIIIIIllII);
    }
    
    public void renderBg(final int llllllllllllIllIlIIlllIIIIlIIIII, final int llllllllllllIllIlIIlllIIIIIlllll) {
    }
    
    public int getWidth() {
        return this.proxy.getButtonWidth();
    }
    
    private static boolean lIIlIlIlIIIIIIll(final int llllllllllllIllIlIIllIlllllllllI, final int llllllllllllIllIlIIllIllllllllIl) {
        return llllllllllllIllIlIIllIlllllllllI < llllllllllllIllIlIIllIllllllllIl;
    }
    
    public GuiButton getProxy() {
        return this.proxy;
    }
    
    public int y() {
        return this.proxy.getPositionY();
    }
    
    public int getYImage(final boolean llllllllllllIllIlIIlllIIIIIllIll) {
        return this.proxy.func_154312_c(llllllllllllIllIlIIlllIIIIIllIll);
    }
    
    public boolean active() {
        return this.proxy.getEnabled();
    }
    
    private static void lIIlIlIlIIIIIIIl() {
        (llIlIllIIIlIlI = new String[RealmsButton.llIlIllIIIlIll[1]])[RealmsButton.llIlIllIIIlIll[0]] = lIIlIlIlIIIIIIII("FgoMJS8QCgd+PRcGWyYzBggRJSlMHxo2", "botQZ");
    }
    
    public void released(final int llllllllllllIllIlIIlllIIIIlllIII, final int llllllllllllIllIlIIlllIIIIllIlll) {
    }
    
    public RealmsButton(final int llllllllllllIllIlIIlllIIIlllIIII, final int llllllllllllIllIlIIlllIIIllIllll, final int llllllllllllIllIlIIlllIIIllIlllI, final int llllllllllllIllIlIIlllIIIllIllIl, final int llllllllllllIllIlIIlllIIIllIllII, final String llllllllllllIllIlIIlllIIIllIIlII) {
        this.proxy = new GuiButtonRealmsProxy(this, llllllllllllIllIlIIlllIIIlllIIII, llllllllllllIllIlIIlllIIIllIllll, llllllllllllIllIlIIlllIIIllIlllI, llllllllllllIllIlIIlllIIIllIIlII, llllllllllllIllIlIIlllIIIllIllIl, llllllllllllIllIlIIlllIIIllIllII);
    }
    
    public void blit(final int llllllllllllIllIlIIlllIIIIlIIlll, final int llllllllllllIllIlIIlllIIIIlIIllI, final int llllllllllllIllIlIIlllIIIIlIIlIl, final int llllllllllllIllIlIIlllIIIIlIIlII, final int llllllllllllIllIlIIlllIIIIlIlIlI, final int llllllllllllIllIlIIlllIIIIlIIIlI) {
        this.proxy.drawTexturedModalRect(llllllllllllIllIlIIlllIIIIlIIlll, llllllllllllIllIlIIlllIIIIlIIllI, llllllllllllIllIlIIlllIIIIlIIlIl, llllllllllllIllIlIIlllIIIIlIIlII, llllllllllllIllIlIIlllIIIIlIlIlI, llllllllllllIllIlIIlllIIIIlIIIlI);
    }
    
    public void active(final boolean llllllllllllIllIlIIlllIIIlIlIlll) {
        this.proxy.setEnabled(llllllllllllIllIlIIlllIIIlIlIlll);
    }
    
    static {
        lIIlIlIlIIIIIIlI();
        lIIlIlIlIIIIIIIl();
        WIDGETS_LOCATION = new ResourceLocation(RealmsButton.llIlIllIIIlIlI[RealmsButton.llIlIllIIIlIll[0]]);
    }
    
    public void render(final int llllllllllllIllIlIIlllIIIlIIIIIl, final int llllllllllllIllIlIIlllIIIlIIIIII) {
        this.proxy.drawButton(Minecraft.getMinecraft(), llllllllllllIllIlIIlllIIIlIIIIIl, llllllllllllIllIlIIlllIIIlIIIIII);
    }
    
    public int id() {
        return this.proxy.getId();
    }
    
    public void msg(final String llllllllllllIllIlIIlllIIIlIlIIIl) {
        this.proxy.setText(llllllllllllIllIlIIlllIIIlIlIIIl);
    }
}
