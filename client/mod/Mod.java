// 
// Decompiled by Procyon v0.5.36
// 

package client.mod;

import client.event.EventManager;
import client.ClientName;
import net.minecraft.client.Minecraft;

public class Mod
{
    private static final /* synthetic */ int[] llIIIIIIlllIIl;
    public /* synthetic */ boolean enabled;
    public /* synthetic */ String description;
    public /* synthetic */ Category category;
    public /* synthetic */ String name;
    public /* synthetic */ Minecraft mc;
    
    public String getName() {
        return this.name;
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    static {
        lIIIIlllIIIIllll();
    }
    
    public void toggle() {
        int enabled;
        if (lIIIIlllIIIlIIII(this.enabled ? 1 : 0)) {
            enabled = Mod.llIIIIIIlllIIl[1];
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            enabled = Mod.llIIIIIIlllIIl[0];
        }
        this.setEnabled((boolean)(enabled != 0));
    }
    
    public void onEnable() {
        final EventManager eventManager = ClientName.INSTANCE.eventManager;
        "".length();
        EventManager.register(this);
    }
    
    public void setEnabled(final boolean llllllllllllIlllIllllIllIllllIII) {
        this.enabled = llllllllllllIlllIllllIllIllllIII;
        if (lIIIIlllIIIlIIII(llllllllllllIlllIllllIllIllllIII ? 1 : 0)) {
            this.onEnable();
            "".length();
            if ((0x52 ^ 0x7F ^ (0x10 ^ 0x38)) == 0x0) {
                return;
            }
        }
        else {
            this.onDisable();
        }
    }
    
    public void onDisable() {
        final EventManager eventManager = ClientName.INSTANCE.eventManager;
        "".length();
        EventManager.unregister(this);
    }
    
    private static void lIIIIlllIIIIllll() {
        (llIIIIIIlllIIl = new int[2])[0] = " ".length();
        Mod.llIIIIIIlllIIl[1] = ((0xC ^ 0x49 ^ (0x41 ^ 0x11)) & (73 + 146 - 66 + 26 ^ 17 + 21 + 10 + 118 ^ -" ".length()));
    }
    
    public Mod(final String llllllllllllIlllIllllIlllIIlIIII, final String llllllllllllIlllIllllIlllIIlIlIl, final Category llllllllllllIlllIllllIlllIIIllII) {
        this.mc = Minecraft.getMinecraft();
        this.name = llllllllllllIlllIllllIlllIIlIIII;
        this.description = llllllllllllIlllIllllIlllIIlIlIl;
        this.category = llllllllllllIlllIllllIlllIIIllII;
        this.enabled = (Mod.llIIIIIIlllIIl[0] != 0);
    }
    
    private static boolean lIIIIlllIIIlIIII(final int llllllllllllIlllIllllIllIlIllIII) {
        return llllllllllllIlllIllllIllIlIllIII != 0;
    }
    
    public Category getCategory() {
        return this.category;
    }
}
