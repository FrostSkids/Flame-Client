// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.resources.DefaultPlayerSkin;
import com.mojang.util.UUIDTypeAdapter;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.Gui;
import java.util.List;
import net.minecraft.client.gui.GuiScreenRealmsProxy;
import net.minecraft.client.Minecraft;

public class RealmsScreen
{
    private /* synthetic */ GuiScreenRealmsProxy proxy;
    private static final /* synthetic */ int[] llIIlIIlIlllll;
    
    public void init() {
    }
    
    public void buttonsRemove(final RealmsButton llllllllllllIlllIIlIIllIIIIlllII) {
        this.proxy.func_154328_b(llllllllllllIlllIIlIIllIIIIlllII);
    }
    
    public void renderBackground() {
        this.proxy.drawDefaultBackground();
    }
    
    public void mouseEvent() {
    }
    
    public void renderTooltip(final List<String> llllllllllllIlllIIlIIllIlIIIlIIl, final int llllllllllllIlllIIlIIllIlIIIlIII, final int llllllllllllIlllIIlIIllIlIIIIlll) {
        this.proxy.drawHoveringText(llllllllllllIlllIIlIIllIlIIIlIIl, llllllllllllIlllIIlIIllIlIIIlIII, llllllllllllIlllIIlIIllIlIIIIlll);
    }
    
    public void fontDrawShadow(final String llllllllllllIlllIIlIIllIIlIlllIl, final int llllllllllllIlllIIlIIllIIlIlllII, final int llllllllllllIlllIIlIIllIIlIlIllI, final int llllllllllllIlllIIlIIllIIlIllIlI) {
        this.proxy.func_154319_c(llllllllllllIlllIIlIIllIIlIlllIl, llllllllllllIlllIIlIIllIIlIlllII, llllllllllllIlllIIlIIllIIlIlIllI, llllllllllllIlllIIlIIllIIlIllIlI);
    }
    
    private static boolean lIIIllIIlIIIlllI(final int llllllllllllIlllIIlIIlIllllIIlll, final int llllllllllllIlllIIlIIlIllllIIllI) {
        return llllllllllllIlllIIlIIlIllllIIlll >= llllllllllllIlllIIlIIlIllllIIllI;
    }
    
    public static void blit(final int llllllllllllIlllIIlIIllIllIlllII, final int llllllllllllIlllIIlIIllIlllIIIll, final float llllllllllllIlllIIlIIllIllIllIlI, final float llllllllllllIlllIIlIIllIlllIIIIl, final int llllllllllllIlllIIlIIllIllIllIII, final int llllllllllllIlllIIlIIllIllIlIlll, final float llllllllllllIlllIIlIIllIllIlIllI, final float llllllllllllIlllIIlIIllIllIlIlIl) {
        Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIlIIllIllIlllII, llllllllllllIlllIIlIIllIlllIIIll, llllllllllllIlllIIlIIllIllIllIlI, llllllllllllIlllIIlIIllIlllIIIIl, llllllllllllIlllIIlIIllIllIllIII, llllllllllllIlllIIlIIllIllIlIlll, llllllllllllIlllIIlIIllIllIlIllI, llllllllllllIlllIIlIIllIllIlIlIl);
    }
    
    public void keyPressed(final char llllllllllllIlllIIlIIlIllllllIIl, final int llllllllllllIlllIIlIIlIllllllIII) {
    }
    
    public void renderTooltip(final ItemStack llllllllllllIlllIIlIIllIlIlIIIIl, final int llllllllllllIlllIIlIIllIlIIlllII, final int llllllllllllIlllIIlIIllIlIIlllll) {
        this.proxy.renderToolTip(llllllllllllIlllIIlIIllIlIlIIIIl, llllllllllllIlllIIlIIllIlIIlllII, llllllllllllIlllIIlIIllIlIIlllll);
    }
    
    public void mouseReleased(final int llllllllllllIlllIIlIIllIIIIIIIlI, final int llllllllllllIlllIIlIIllIIIIIIIIl, final int llllllllllllIlllIIlIIllIIIIIIIII) {
    }
    
    public RealmsAnvilLevelStorageSource getLevelStorageSource() {
        return new RealmsAnvilLevelStorageSource(Minecraft.getMinecraft().getSaveLoader());
    }
    
    public static RealmsButton newButton(final int llllllllllllIlllIIlIIllIIIllIlll, final int llllllllllllIlllIIlIIllIIIllIIII, final int llllllllllllIlllIIlIIllIIIlIllll, final int llllllllllllIlllIIlIIllIIIlIlllI, final int llllllllllllIlllIIlIIllIIIlIllIl, final String llllllllllllIlllIIlIIllIIIllIIlI) {
        return new RealmsButton(llllllllllllIlllIIlIIllIIIllIlll, llllllllllllIlllIIlIIllIIIllIIII, llllllllllllIlllIIlIIllIIIlIllll, llllllllllllIlllIIlIIllIIIlIlllI, llllllllllllIlllIIlIIllIIIlIllIl, llllllllllllIlllIIlIIllIIIllIIlI);
    }
    
    public void buttonsClear() {
        this.proxy.func_154324_i();
    }
    
    public void removed() {
    }
    
    public static String getLocalizedString(final String llllllllllllIlllIIlIIlIllllIllIl, final Object... llllllllllllIlllIIlIIlIllllIlllI) {
        return I18n.format(llllllllllllIlllIIlIIlIllllIllIl, llllllllllllIlllIIlIIlIllllIlllI);
    }
    
    public static void bind(final String llllllllllllIlllIIlIIllIIlllIlIl) {
        final ResourceLocation llllllllllllIlllIIlIIllIIlllIllI = new ResourceLocation(llllllllllllIlllIIlIIllIIlllIlIl);
        Minecraft.getMinecraft().getTextureManager().bindTexture(llllllllllllIlllIIlIIllIIlllIllI);
    }
    
    public static void blit(final int llllllllllllIlllIIlIIllIllllIllI, final int llllllllllllIlllIIlIIllIllllllll, final float llllllllllllIlllIIlIIllIllllIlII, final float llllllllllllIlllIIlIIllIllllllIl, final int llllllllllllIlllIIlIIllIllllIIlI, final int llllllllllllIlllIIlIIllIlllllIll, final int llllllllllllIlllIIlIIllIllllIIII, final int llllllllllllIlllIIlIIllIlllllIIl, final float llllllllllllIlllIIlIIllIlllIlllI, final float llllllllllllIlllIIlIIllIlllIllIl) {
        Gui.drawScaledCustomSizeModalRect(llllllllllllIlllIIlIIllIllllIllI, llllllllllllIlllIIlIIllIllllllll, llllllllllllIlllIIlIIllIllllIlII, llllllllllllIlllIIlIIllIllllllIl, llllllllllllIlllIIlIIllIllllIIlI, llllllllllllIlllIIlIIllIlllllIll, llllllllllllIlllIIlIIllIllllIIII, llllllllllllIlllIIlIIllIlllllIIl, llllllllllllIlllIIlIIllIlllIlllI, llllllllllllIlllIIlIIllIlllIllIl);
    }
    
    public void fillGradient(final int llllllllllllIlllIIlIIllIllIIIlIl, final int llllllllllllIlllIIlIIllIllIIlIll, final int llllllllllllIlllIIlIIllIllIIlIlI, final int llllllllllllIlllIIlIIllIllIIlIIl, final int llllllllllllIlllIIlIIllIllIIIIIl, final int llllllllllllIlllIIlIIllIllIIIlll) {
        this.proxy.drawGradientRect(llllllllllllIlllIIlIIllIllIIIlIl, llllllllllllIlllIIlIIllIllIIlIll, llllllllllllIlllIIlIIllIllIIlIlI, llllllllllllIlllIIlIIllIllIIlIIl, llllllllllllIlllIIlIIllIllIIIIIl, llllllllllllIlllIIlIIllIllIIIlll);
    }
    
    public void drawCenteredString(final String llllllllllllIlllIIlIIlllIIllIIlI, final int llllllllllllIlllIIlIIlllIIllIllI, final int llllllllllllIlllIIlIIlllIIllIIII, final int llllllllllllIlllIIlIIlllIIllIlII) {
        this.proxy.func_154325_a(llllllllllllIlllIIlIIlllIIllIIlI, llllllllllllIlllIIlIIlllIIllIllI, llllllllllllIlllIIlIIlllIIllIIII, llllllllllllIlllIIlIIlllIIllIlII);
    }
    
    public void tick() {
    }
    
    public List<String> fontSplit(final String llllllllllllIlllIIlIIllIIlIlIIII, final int llllllllllllIlllIIlIIllIIlIIllll) {
        return this.proxy.func_154323_a(llllllllllllIlllIIlIIllIIlIlIIII, llllllllllllIlllIIlIIllIIlIIllll);
    }
    
    public void renderBackground(final int llllllllllllIlllIIlIIllIlIllIlII) {
        this.proxy.drawWorldBackground(llllllllllllIlllIIlIIllIlIllIlII);
    }
    
    public int fontLineHeight() {
        return this.proxy.func_154329_h();
    }
    
    public int width() {
        return this.proxy.width;
    }
    
    public RealmsScreen() {
        this.proxy = new GuiScreenRealmsProxy(this);
    }
    
    public void keyboardEvent() {
    }
    
    public boolean isPauseScreen() {
        return this.proxy.doesGuiPauseGame();
    }
    
    public static String getLocalizedString(final String llllllllllllIlllIIlIIlIlllllIIll) {
        return I18n.format(llllllllllllIlllIIlIIlIlllllIIll, new Object[RealmsScreen.llIIlIIlIlllll[0]]);
    }
    
    public int fontWidth(final String llllllllllllIlllIIlIIllIIllIIllI) {
        return this.proxy.func_154326_c(llllllllllllIlllIIlIIllIIllIIllI);
    }
    
    public void mouseClicked(final int llllllllllllIlllIIlIIllIIIIIlIII, final int llllllllllllIlllIIlIIllIIIIIIlll, final int llllllllllllIlllIIlIIllIIIIIIllI) {
    }
    
    public GuiScreenRealmsProxy getProxy() {
        return this.proxy;
    }
    
    public void init(final Minecraft llllllllllllIlllIIlIIlllIlIIIIII, final int llllllllllllIlllIIlIIlllIIllllll, final int llllllllllllIlllIIlIIlllIIlllllI) {
    }
    
    public List<RealmsButton> buttons() {
        return this.proxy.func_154320_j();
    }
    
    public void drawString(final String llllllllllllIlllIIlIIlllIIlIlIII, final int llllllllllllIlllIIlIIlllIIlIIIlI, final int llllllllllllIlllIIlIIlllIIlIIIIl, final int llllllllllllIlllIIlIIlllIIlIIIII) {
        this.proxy.func_154322_b(llllllllllllIlllIIlIIlllIIlIlIII, llllllllllllIlllIIlIIlllIIlIIIlI, llllllllllllIlllIIlIIlllIIlIIIIl, llllllllllllIlllIIlIIlllIIlIIIII);
    }
    
    private static boolean lIIIllIIlIIIllll(final Object llllllllllllIlllIIlIIlIllllIIlII) {
        return llllllllllllIlllIIlIIlIllllIIlII == null;
    }
    
    private static void lIIIllIIlIIIllIl() {
        (llIIlIIlIlllll = new int[4])[0] = ((0xD6 ^ 0xC6) & ~(0xD2 ^ 0xC2));
        RealmsScreen.llIIlIIlIlllll[1] = (0x90 ^ 0xB8);
        RealmsScreen.llIIlIIlIlllll[2] = (0x79 ^ 0x39);
        RealmsScreen.llIIlIIlIlllll[3] = (0x7A ^ 0x72);
    }
    
    public static void bindFace(final String llllllllllllIlllIIlIIllIIlllllll, final String llllllllllllIlllIIlIIllIIllllIll) {
        ResourceLocation llllllllllllIlllIIlIIllIIlllllIl = AbstractClientPlayer.getLocationSkin(llllllllllllIlllIIlIIllIIllllIll);
        if (lIIIllIIlIIIllll(llllllllllllIlllIIlIIllIIlllllIl)) {
            llllllllllllIlllIIlIIllIIlllllIl = DefaultPlayerSkin.getDefaultSkin(UUIDTypeAdapter.fromString(llllllllllllIlllIIlIIllIIlllllll));
        }
        AbstractClientPlayer.getDownloadImageSkin(llllllllllllIlllIIlIIllIIlllllIl, llllllllllllIlllIIlIIllIIllllIll);
        "".length();
        Minecraft.getMinecraft().getTextureManager().bindTexture(llllllllllllIlllIIlIIllIIlllllIl);
    }
    
    static {
        lIIIllIIlIIIllIl();
        SKIN_HAT_U = RealmsScreen.llIIlIIlIlllll[1];
        SKIN_TEX_HEIGHT = RealmsScreen.llIIlIIlIlllll[2];
        SKIN_HEAD_HEIGHT = RealmsScreen.llIIlIIlIlllll[3];
        SKIN_HEAD_U = RealmsScreen.llIIlIIlIlllll[3];
        SKIN_HEAD_WIDTH = RealmsScreen.llIIlIIlIlllll[3];
        SKIN_HAT_V = RealmsScreen.llIIlIIlIlllll[3];
        SKIN_HAT_HEIGHT = RealmsScreen.llIIlIIlIlllll[3];
        SKIN_HEAD_V = RealmsScreen.llIIlIIlIlllll[3];
        SKIN_HAT_WIDTH = RealmsScreen.llIIlIIlIlllll[3];
        SKIN_TEX_WIDTH = RealmsScreen.llIIlIIlIlllll[2];
    }
    
    public void buttonClicked(final RealmsButton llllllllllllIlllIIlIIllIIlIIlIlI) {
    }
    
    public void confirmResult(final boolean llllllllllllIlllIIlIIlIlllllIllI, final int llllllllllllIlllIIlIIlIlllllIlIl) {
    }
    
    public void render(final int llllllllllllIlllIIlIIllIlIlIlllI, final int llllllllllllIlllIIlIIllIlIlIlIII, final float llllllllllllIlllIIlIIllIlIlIllII) {
        int llllllllllllIlllIIlIIllIlIlIlIll = RealmsScreen.llIIlIIlIlllll[0];
        "".length();
        if ("   ".length() < "   ".length()) {
            return;
        }
        while (!lIIIllIIlIIIlllI(llllllllllllIlllIIlIIllIlIlIlIll, this.proxy.func_154320_j().size())) {
            this.proxy.func_154320_j().get(llllllllllllIlllIIlIIllIlIlIlIll).render(llllllllllllIlllIIlIIllIlIlIlllI, llllllllllllIlllIIlIIllIlIlIlIII);
            ++llllllllllllIlllIIlIIllIlIlIlIll;
        }
    }
    
    public static RealmsButton newButton(final int llllllllllllIlllIIlIIllIIlIIIlIl, final int llllllllllllIlllIIlIIllIIlIIIlII, final int llllllllllllIlllIIlIIllIIIllllll, final String llllllllllllIlllIIlIIllIIIlllllI) {
        return new RealmsButton(llllllllllllIlllIIlIIllIIlIIIlIl, llllllllllllIlllIIlIIllIIlIIIlII, llllllllllllIlllIIlIIllIIIllllll, llllllllllllIlllIIlIIllIIIlllllI);
    }
    
    public int height() {
        return this.proxy.height;
    }
    
    public void mouseDragged(final int llllllllllllIlllIIlIIlIllllllllI, final int llllllllllllIlllIIlIIlIlllllllIl, final int llllllllllllIlllIIlIIlIlllllllII, final long llllllllllllIlllIIlIIlIllllllIll) {
    }
    
    public void blit(final int llllllllllllIlllIIlIIlllIIIlIlll, final int llllllllllllIlllIIlIIlllIIIlIllI, final int llllllllllllIlllIIlIIlllIIIlIlIl, final int llllllllllllIlllIIlIIlllIIIIllIl, final int llllllllllllIlllIIlIIlllIIIIllII, final int llllllllllllIlllIIlIIlllIIIlIIlI) {
        this.proxy.drawTexturedModalRect(llllllllllllIlllIIlIIlllIIIlIlll, llllllllllllIlllIIlIIlllIIIlIllI, llllllllllllIlllIIlIIlllIIIlIlIl, llllllllllllIlllIIlIIlllIIIIllIl, llllllllllllIlllIIlIIlllIIIIllII, llllllllllllIlllIIlIIlllIIIlIIlI);
    }
    
    public RealmsEditBox newEditBox(final int llllllllllllIlllIIlIIllIIIIIlllI, final int llllllllllllIlllIIlIIllIIIIIllIl, final int llllllllllllIlllIIlIIllIIIIIllII, final int llllllllllllIlllIIlIIllIIIIIlIll, final int llllllllllllIlllIIlIIllIIIIIllll) {
        return new RealmsEditBox(llllllllllllIlllIIlIIllIIIIIlllI, llllllllllllIlllIIlIIllIIIIIllIl, llllllllllllIlllIIlIIllIIIIIllII, llllllllllllIlllIIlIIllIIIIIlIll, llllllllllllIlllIIlIIllIIIIIllll);
    }
    
    public void renderTooltip(final String llllllllllllIlllIIlIIllIlIIlIIIl, final int llllllllllllIlllIIlIIllIlIIlIIII, final int llllllllllllIlllIIlIIllIlIIIllll) {
        this.proxy.drawCreativeTabHoveringText(llllllllllllIlllIIlIIllIlIIlIIIl, llllllllllllIlllIIlIIllIlIIlIIII, llllllllllllIlllIIlIIllIlIIIllll);
    }
    
    public void buttonsAdd(final RealmsButton llllllllllllIlllIIlIIllIIIlIIIll) {
        this.proxy.func_154327_a(llllllllllllIlllIIlIIllIIIlIIIll);
    }
}
