// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class GuiButton extends Gui
{
    public /* synthetic */ int yPosition;
    private static final /* synthetic */ int[] llIIllIIllIIll;
    public /* synthetic */ String displayString;
    protected /* synthetic */ int width;
    private static final /* synthetic */ String[] llIIllIIllIIlI;
    protected /* synthetic */ boolean hovered;
    public /* synthetic */ int id;
    public /* synthetic */ boolean visible;
    public /* synthetic */ boolean enabled;
    public /* synthetic */ int xPosition;
    protected static final /* synthetic */ ResourceLocation buttonTextures;
    protected /* synthetic */ int height;
    
    private static boolean lIIIlllIlIllIIIl(final int llllllllllllIlllIIIIIlIIlIllIllI, final int llllllllllllIlllIIIIIlIIlIllIlIl) {
        return llllllllllllIlllIIIIIlIIlIllIllI >= llllllllllllIlllIIIIIlIIlIllIlIl;
    }
    
    private static void lIIIlllIlIlIllIl() {
        (llIIllIIllIIlI = new String[GuiButton.llIIllIIllIIll[4]])[GuiButton.llIIllIIllIIll[0]] = lIIIlllIlIlIllII("ATQeBhIHNBVdAAA4SQUOETYDBhRbIQgV", "uQfrg");
        GuiButton.llIIllIIllIIlI[GuiButton.llIIllIIllIIll[3]] = lIIIlllIlIlIllII("CjIFdgcYMxg3C0M3Hj0WHg==", "mGlXe");
    }
    
    public void setWidth(final int llllllllllllIlllIIIIIlIIllIlIIll) {
        this.width = llllllllllllIlllIIIIIlIIllIlIIll;
    }
    
    static {
        lIIIlllIlIlIlllI();
        lIIIlllIlIlIllIl();
        buttonTextures = new ResourceLocation(GuiButton.llIIllIIllIIlI[GuiButton.llIIllIIllIIll[0]]);
    }
    
    public boolean isMouseOver() {
        return this.hovered;
    }
    
    public boolean mousePressed(final Minecraft llllllllllllIlllIIIIIlIIlllIlIIl, final int llllllllllllIlllIIIIIlIIlllIlIII, final int llllllllllllIlllIIIIIlIIlllIIlII) {
        if (lIIIlllIlIllIIII(this.enabled ? 1 : 0) && lIIIlllIlIllIIII(this.visible ? 1 : 0) && lIIIlllIlIllIIIl(llllllllllllIlllIIIIIlIIlllIlIII, this.xPosition) && lIIIlllIlIllIIIl(llllllllllllIlllIIIIIlIIlllIIlII, this.yPosition) && lIIIlllIlIllIIlI(llllllllllllIlllIIIIIlIIlllIlIII, this.xPosition + this.width) && lIIIlllIlIllIIlI(llllllllllllIlllIIIIIlIIlllIIlII, this.yPosition + this.height)) {
            return GuiButton.llIIllIIllIIll[3] != 0;
        }
        return GuiButton.llIIllIIllIIll[0] != 0;
    }
    
    public void drawButton(final Minecraft llllllllllllIlllIIIIIlIlIIIIIIIl, final int llllllllllllIlllIIIIIlIlIIIIIIII, final int llllllllllllIlllIIIIIlIIlllllIII) {
        if (lIIIlllIlIllIIII(this.visible ? 1 : 0)) {
            final FontRenderer llllllllllllIlllIIIIIlIIlllllllI = llllllllllllIlllIIIIIlIlIIIIIIIl.fontRendererObj;
            llllllllllllIlllIIIIIlIlIIIIIIIl.getTextureManager().bindTexture(GuiButton.buttonTextures);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            int hovered;
            if (lIIIlllIlIllIIIl(llllllllllllIlllIIIIIlIlIIIIIIII, this.xPosition) && lIIIlllIlIllIIIl(llllllllllllIlllIIIIIlIIlllllIII, this.yPosition) && lIIIlllIlIllIIlI(llllllllllllIlllIIIIIlIlIIIIIIII, this.xPosition + this.width) && lIIIlllIlIllIIlI(llllllllllllIlllIIIIIlIIlllllIII, this.yPosition + this.height)) {
                hovered = GuiButton.llIIllIIllIIll[3];
                "".length();
                if (-" ".length() == (0xCD ^ 0x8A ^ (0x53 ^ 0x10))) {
                    return;
                }
            }
            else {
                hovered = GuiButton.llIIllIIllIIll[0];
            }
            this.hovered = (hovered != 0);
            final int llllllllllllIlllIIIIIlIIllllllIl = this.getHoverState(this.hovered);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GuiButton.llIIllIIllIIll[5], GuiButton.llIIllIIllIIll[6], GuiButton.llIIllIIllIIll[3], GuiButton.llIIllIIllIIll[0]);
            GlStateManager.blendFunc(GuiButton.llIIllIIllIIll[5], GuiButton.llIIllIIllIIll[6]);
            Gui.drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, new Color(GuiButton.llIIllIIllIIll[0], GuiButton.llIIllIIllIIll[0], GuiButton.llIIllIIllIIll[0], GuiButton.llIIllIIllIIll[7]).getRGB());
            this.mouseDragged(llllllllllllIlllIIIIIlIlIIIIIIIl, llllllllllllIlllIIIIIlIlIIIIIIII, llllllllllllIlllIIIIIlIIlllllIII);
            int llllllllllllIlllIIIIIlIIllllllII = GuiButton.llIIllIIllIIll[8];
            if (lIIIlllIlIlIllll(this.enabled ? 1 : 0)) {
                llllllllllllIlllIIIIIlIIllllllII = GuiButton.llIIllIIllIIll[9];
                "".length();
                if ((0xE7 ^ 0xA1 ^ (0xF ^ 0x4D)) == -" ".length()) {
                    return;
                }
            }
            else if (lIIIlllIlIllIIII(this.hovered ? 1 : 0)) {
                llllllllllllIlllIIIIIlIIllllllII = new Color(GuiButton.llIIllIIllIIll[7], GuiButton.llIIllIIllIIll[0], GuiButton.llIIllIIllIIll[0], GuiButton.llIIllIIllIIll[10]).getRGB();
            }
            this.drawCenteredString(llllllllllllIlllIIIIIlIIlllllllI, this.displayString, this.xPosition + this.width / GuiButton.llIIllIIllIIll[4], this.yPosition + (this.height - GuiButton.llIIllIIllIIll[11]) / GuiButton.llIIllIIllIIll[4], llllllllllllIlllIIIIIlIIllllllII);
        }
    }
    
    private static boolean lIIIlllIlIllIIlI(final int llllllllllllIlllIIIIIlIIlIllIIlI, final int llllllllllllIlllIIIIIlIIlIllIIIl) {
        return llllllllllllIlllIIIIIlIIlIllIIlI < llllllllllllIlllIIIIIlIIlIllIIIl;
    }
    
    private static boolean lIIIlllIlIlIllll(final int llllllllllllIlllIIIIIlIIlIlIllIl) {
        return llllllllllllIlllIIIIIlIIlIlIllIl == 0;
    }
    
    protected void mouseDragged(final Minecraft llllllllllllIlllIIIIIlIIllllIIll, final int llllllllllllIlllIIIIIlIIllllIIlI, final int llllllllllllIlllIIIIIlIIllllIIIl) {
    }
    
    public GuiButton(final int llllllllllllIlllIIIIIlIlIIIlllll, final int llllllllllllIlllIIIIIlIlIIIllllI, final int llllllllllllIlllIIIIIlIlIIIlllIl, final int llllllllllllIlllIIIIIlIlIIIlIlIl, final int llllllllllllIlllIIIIIlIlIIIlIlII, final String llllllllllllIlllIIIIIlIlIIIllIlI) {
        this.width = GuiButton.llIIllIIllIIll[1];
        this.height = GuiButton.llIIllIIllIIll[2];
        this.enabled = (GuiButton.llIIllIIllIIll[3] != 0);
        this.visible = (GuiButton.llIIllIIllIIll[3] != 0);
        this.id = llllllllllllIlllIIIIIlIlIIIlllll;
        this.xPosition = llllllllllllIlllIIIIIlIlIIIllllI;
        this.yPosition = llllllllllllIlllIIIIIlIlIIIlllIl;
        this.width = llllllllllllIlllIIIIIlIlIIIlIlIl;
        this.height = llllllllllllIlllIIIIIlIlIIIlIlII;
        this.displayString = llllllllllllIlllIIIIIlIlIIIllIlI;
    }
    
    public void mouseReleased(final int llllllllllllIlllIIIIIlIIlllIllll, final int llllllllllllIlllIIIIIlIIlllIlllI) {
    }
    
    private static void lIIIlllIlIlIlllI() {
        (llIIllIIllIIll = new int[12])[0] = ((0x38 ^ 0x33 ^ (0xA6 ^ 0xB0)) & (0x11 ^ 0x79 ^ (0x72 ^ 0x7) ^ -" ".length()));
        GuiButton.llIIllIIllIIll[1] = (0xC2 ^ 0xC4) + (158 + 131 - 262 + 152) - (0x3C ^ 0xA) + (0xDC ^ 0x99);
        GuiButton.llIIllIIllIIll[2] = (0x46 ^ 0x57 ^ (0xC3 ^ 0xC6));
        GuiButton.llIIllIIllIIll[3] = " ".length();
        GuiButton.llIIllIIllIIll[4] = "  ".length();
        GuiButton.llIIllIIllIIll[5] = (0xFFFFC343 & 0x3FBE);
        GuiButton.llIIllIIllIIll[6] = (-(0xFFFFE4EB & 0x7F9D) & (0xFFFFF7AF & 0x6FDB));
        GuiButton.llIIllIIllIIll[7] = 32 + 39 - 41 + 127 + (0x6F ^ 0x50) - (0x6F ^ 0x20) + (0xDE ^ 0xC3);
        GuiButton.llIIllIIllIIll[8] = (-(0xFFFFB757 & 0x5FBB) & (0xFFFFFFFE & 0xE0F7F3));
        GuiButton.llIIllIIllIIll[9] = (-(0xFFFFDFFF & 0x250D) & (0xFFFFE5AE & 0xA0BFFD));
        GuiButton.llIIllIIllIIll[10] = 163 + 67 - 18 + 43;
        GuiButton.llIIllIIllIIll[11] = (0xCE ^ 0x93 ^ (0x44 ^ 0x11));
    }
    
    public int getButtonWidth() {
        return this.width;
    }
    
    public void playPressSound(final SoundHandler llllllllllllIlllIIIIIlIIllIllIll) {
        llllllllllllIlllIIIIIlIIllIllIll.playSound(PositionedSoundRecord.create(new ResourceLocation(GuiButton.llIIllIIllIIlI[GuiButton.llIIllIIllIIll[3]]), 1.0f));
    }
    
    public void drawButtonForegroundLayer(final int llllllllllllIlllIIIIIlIIllIlllll, final int llllllllllllIlllIIIIIlIIllIllllI) {
    }
    
    public GuiButton(final int llllllllllllIlllIIIIIlIlIIlIlIll, final int llllllllllllIlllIIIIIlIlIIlIlIlI, final int llllllllllllIlllIIIIIlIlIIlIlllI, final String llllllllllllIlllIIIIIlIlIIlIllIl) {
        this(llllllllllllIlllIIIIIlIlIIlIlIll, llllllllllllIlllIIIIIlIlIIlIlIlI, llllllllllllIlllIIIIIlIlIIlIlllI, GuiButton.llIIllIIllIIll[1], GuiButton.llIIllIIllIIll[2], llllllllllllIlllIIIIIlIlIIlIllIl);
    }
    
    private static boolean lIIIlllIlIllIIII(final int llllllllllllIlllIIIIIlIIlIlIllll) {
        return llllllllllllIlllIIIIIlIIlIlIllll != 0;
    }
    
    private static String lIIIlllIlIlIllII(String llllllllllllIlllIIIIIlIIllIIIIIl, final String llllllllllllIlllIIIIIlIIllIIIlIl) {
        llllllllllllIlllIIIIIlIIllIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIIlIIllIIIlII = new StringBuilder();
        final char[] llllllllllllIlllIIIIIlIIllIIIIll = llllllllllllIlllIIIIIlIIllIIIlIl.toCharArray();
        int llllllllllllIlllIIIIIlIIllIIIIlI = GuiButton.llIIllIIllIIll[0];
        final double llllllllllllIlllIIIIIlIIlIllllII = (Object)llllllllllllIlllIIIIIlIIllIIIIIl.toCharArray();
        final float llllllllllllIlllIIIIIlIIlIlllIll = llllllllllllIlllIIIIIlIIlIllllII.length;
        short llllllllllllIlllIIIIIlIIlIlllIlI = (short)GuiButton.llIIllIIllIIll[0];
        while (lIIIlllIlIllIIlI(llllllllllllIlllIIIIIlIIlIlllIlI, (int)llllllllllllIlllIIIIIlIIlIlllIll)) {
            final char llllllllllllIlllIIIIIlIIllIIIlll = llllllllllllIlllIIIIIlIIlIllllII[llllllllllllIlllIIIIIlIIlIlllIlI];
            llllllllllllIlllIIIIIlIIllIIIlII.append((char)(llllllllllllIlllIIIIIlIIllIIIlll ^ llllllllllllIlllIIIIIlIIllIIIIll[llllllllllllIlllIIIIIlIIllIIIIlI % llllllllllllIlllIIIIIlIIllIIIIll.length]));
            "".length();
            ++llllllllllllIlllIIIIIlIIllIIIIlI;
            ++llllllllllllIlllIIIIIlIIlIlllIlI;
            "".length();
            if (((0x81 ^ 0xB5) & ~(0x99 ^ 0xAD)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIIlIIllIIIlII);
    }
    
    protected int getHoverState(final boolean llllllllllllIlllIIIIIlIlIIIIlllI) {
        int llllllllllllIlllIIIIIlIlIIIIllIl = GuiButton.llIIllIIllIIll[3];
        if (lIIIlllIlIlIllll(this.enabled ? 1 : 0)) {
            llllllllllllIlllIIIIIlIlIIIIllIl = GuiButton.llIIllIIllIIll[0];
            "".length();
            if (null != null) {
                return (0xD8 ^ 0xB9) & ~(0x13 ^ 0x72);
            }
        }
        else if (lIIIlllIlIllIIII(llllllllllllIlllIIIIIlIlIIIIlllI ? 1 : 0)) {
            llllllllllllIlllIIIIIlIlIIIIllIl = GuiButton.llIIllIIllIIll[4];
        }
        return llllllllllllIlllIIIIIlIlIIIIllIl;
    }
}
