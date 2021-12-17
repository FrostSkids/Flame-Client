// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod;

import java.awt.Color;
import client.event.EventManager;
import client.ClientName;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.Minecraft;
import client.hud.DraggableComponent;

public class HudMod
{
    public /* synthetic */ boolean enabled;
    public /* synthetic */ int x;
    public /* synthetic */ String name;
    public /* synthetic */ DraggableComponent drag;
    public /* synthetic */ Minecraft mc;
    private static final /* synthetic */ int[] lllIIIIIIlIlII;
    public /* synthetic */ FontRenderer fr;
    public /* synthetic */ int y;
    
    public int getHeight() {
        return HudMod.lllIIIIIIlIlII[2];
    }
    
    public void toggle() {
        int enabled;
        if (lIIllIllllllIIIl(this.enabled ? 1 : 0)) {
            enabled = HudMod.lllIIIIIIlIlII[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            enabled = HudMod.lllIIIIIIlIlII[0];
        }
        this.setEnabled((boolean)(enabled != 0));
    }
    
    static {
        lIIllIllllllIIII();
    }
    
    private static boolean lIIllIllllllIIIl(final int llllllllllllIllIIIlIIIlIIIIIIIll) {
        return llllllllllllIllIIIlIIIlIIIIIIIll != 0;
    }
    
    public void draw() {
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public void onEnable() {
        final EventManager eventManager = ClientName.INSTANCE.eventManager;
        "".length();
        EventManager.register(this);
    }
    
    public void onDisable() {
        final EventManager eventManager = ClientName.INSTANCE.eventManager;
        "".length();
        EventManager.unregister(this);
    }
    
    public void setEnabled(final boolean llllllllllllIllIIIlIIIlIIIIIlIlI) {
        this.enabled = llllllllllllIllIIIlIIIlIIIIIlIlI;
        if (lIIllIllllllIIIl(llllllllllllIllIIIlIIIlIIIIIlIlI ? 1 : 0)) {
            this.onEnable();
            "".length();
            if (((0x77 ^ 0x15) & ~(0xC7 ^ 0xA5)) <= -" ".length()) {
                return;
            }
        }
        else {
            this.onDisable();
        }
    }
    
    private static void lIIllIllllllIIII() {
        (lllIIIIIIlIlII = new int[3])[0] = " ".length();
        HudMod.lllIIIIIIlIlII[1] = ((5 + 168 - 92 + 116 ^ 69 + 105 - 118 + 72) & (0x90 ^ 0xB1 ^ (0xEC ^ 0x88) ^ -" ".length()));
        HudMod.lllIIIIIIlIlII[2] = (0xBC ^ 0x8E);
    }
    
    public int getWidth() {
        return HudMod.lllIIIIIIlIlII[2];
    }
    
    public int getY() {
        return this.drag.getyPosition();
    }
    
    public int getX() {
        return this.drag.getxPosition();
    }
    
    public HudMod(final String llllllllllllIllIIIlIIIlIIIlIllll, final int llllllllllllIllIIIlIIIlIIIlIlIlI, final int llllllllllllIllIIIlIIIlIIIlIlIIl) {
        this.mc = Minecraft.getMinecraft();
        this.fr = this.mc.fontRendererObj;
        this.enabled = (HudMod.lllIIIIIIlIlII[0] != 0);
        this.name = llllllllllllIllIIIlIIIlIIIlIllll;
        this.x = llllllllllllIllIIIlIIIlIIIlIlIlI;
        this.y = llllllllllllIllIIIlIIIlIIIlIlIIl;
        this.enabled = (HudMod.lllIIIIIIlIlII[0] != 0);
        this.drag = new DraggableComponent(this.x, this.y, this.getWidth(), this.getHeight(), new Color(HudMod.lllIIIIIIlIlII[1], HudMod.lllIIIIIIlIlII[1], HudMod.lllIIIIIIlIlII[1], HudMod.lllIIIIIIlIlII[1]).getRGB());
    }
    
    public void renderDummy(final int llllllllllllIllIIIlIIIlIIIlIIIIl, final int llllllllllllIllIIIlIIIlIIIlIIIII) {
        this.drag.draw(llllllllllllIllIIIlIIIlIIIlIIIIl, llllllllllllIllIIIlIIIlIIIlIIIII);
    }
}
