// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod;

import java.util.Iterator;
import client.hud.mod.impl.TargetHUD;
import client.hud.mod.impl.ToggleSprintDisplay;
import client.hud.mod.impl.PingHud;
import java.util.ArrayList;
import client.hud.mod.impl.XYZ;
import client.hud.mod.impl.ArmorStatus;
import client.hud.mod.impl.Direction;
import client.hud.mod.impl.Perspective;
import client.hud.mod.impl.ModFOV;
import client.hud.mod.impl.ClockMod;
import client.hud.mod.impl.ModPotionStatus;
import client.hud.mod.impl.ToggleSprint;
import client.hud.mod.impl.FPSMod;
import client.hud.mod.impl.Biome;
import client.hud.mod.impl.CPS;
import client.hud.mod.impl.Keystrokes;

public class HudManager
{
    public /* synthetic */ Keystrokes keystrokes;
    public /* synthetic */ CPS cps;
    public /* synthetic */ Biome biome;
    public /* synthetic */ FPSMod fps;
    public /* synthetic */ ToggleSprint togglesprint;
    public /* synthetic */ ModPotionStatus ps;
    public /* synthetic */ ClockMod clockmod;
    public /* synthetic */ ModFOV fov;
    public static /* synthetic */ Perspective perspective;
    public /* synthetic */ Direction direction;
    public /* synthetic */ ArmorStatus armorstatus;
    public /* synthetic */ XYZ xyz;
    public /* synthetic */ ArrayList<HudMod> hudMods;
    public /* synthetic */ PingHud ping;
    public /* synthetic */ ToggleSprintDisplay togglesprintdisplay;
    public /* synthetic */ TargetHUD target;
    
    public HudManager() {
        this.hudMods = new ArrayList<HudMod>();
        final ArrayList<HudMod> hudMods = this.hudMods;
        final CPS cps = new CPS();
        this.cps = cps;
        hudMods.add(cps);
        "".length();
        final ArrayList<HudMod> hudMods2 = this.hudMods;
        final ArmorStatus armorStatus = new ArmorStatus();
        this.armorstatus = armorStatus;
        hudMods2.add(armorStatus);
        "".length();
        final ArrayList<HudMod> hudMods3 = this.hudMods;
        final FPSMod fpsMod = new FPSMod();
        this.fps = fpsMod;
        hudMods3.add(fpsMod);
        "".length();
        final ArrayList<HudMod> hudMods4 = this.hudMods;
        final Keystrokes keystrokes = new Keystrokes();
        this.keystrokes = keystrokes;
        hudMods4.add(keystrokes);
        "".length();
        final ArrayList<HudMod> hudMods5 = this.hudMods;
        final PingHud pingHud = new PingHud();
        this.ping = pingHud;
        hudMods5.add(pingHud);
        "".length();
        final ArrayList<HudMod> hudMods6 = this.hudMods;
        final TargetHUD targetHUD = new TargetHUD();
        this.target = targetHUD;
        hudMods6.add(targetHUD);
        "".length();
        final ArrayList<HudMod> hudMods7 = this.hudMods;
        final XYZ xyz = new XYZ();
        this.xyz = xyz;
        hudMods7.add(xyz);
        "".length();
        final ArrayList<HudMod> hudMods8 = this.hudMods;
        final ToggleSprint toggleSprint = new ToggleSprint();
        this.togglesprint = toggleSprint;
        hudMods8.add(toggleSprint);
        "".length();
        this.hudMods.add(HudManager.perspective = new Perspective());
        "".length();
        final ArrayList<HudMod> hudMods9 = this.hudMods;
        final ToggleSprintDisplay toggleSprintDisplay = new ToggleSprintDisplay();
        this.togglesprintdisplay = toggleSprintDisplay;
        hudMods9.add(toggleSprintDisplay);
        "".length();
        final ArrayList<HudMod> hudMods10 = this.hudMods;
        final ClockMod clockMod = new ClockMod();
        this.clockmod = clockMod;
        hudMods10.add(clockMod);
        "".length();
        final ArrayList<HudMod> hudMods11 = this.hudMods;
        final Biome biome = new Biome();
        this.biome = biome;
        hudMods11.add(biome);
        "".length();
        final ArrayList<HudMod> hudMods12 = this.hudMods;
        final ModPotionStatus modPotionStatus = new ModPotionStatus();
        this.ps = modPotionStatus;
        hudMods12.add(modPotionStatus);
        "".length();
        final ArrayList<HudMod> hudMods13 = this.hudMods;
        final Direction direction = new Direction();
        this.direction = direction;
        hudMods13.add(direction);
        "".length();
        final ArrayList<HudMod> hudMods14 = this.hudMods;
        final ModFOV modFOV = new ModFOV();
        this.fov = modFOV;
        hudMods14.add(modFOV);
        "".length();
    }
    
    public void renderMods() {
        final double llllllllllllIllllllIIIIIIIlIlIIl = (double)this.hudMods.iterator();
        "".length();
        if ((0xAD ^ 0xA9) != (0xA0 ^ 0xA4)) {
            return;
        }
        while (!lIIIIIIIllIIlIlI(((Iterator)llllllllllllIllllllIIIIIIIlIlIIl).hasNext() ? 1 : 0)) {
            final HudMod llllllllllllIllllllIIIIIIIlIllII = ((Iterator<HudMod>)llllllllllllIllllllIIIIIIIlIlIIl).next();
            if (lIIIIIIIllIIlIIl(llllllllllllIllllllIIIIIIIlIllII.isEnabled() ? 1 : 0)) {
                llllllllllllIllllllIIIIIIIlIllII.draw();
            }
        }
    }
    
    public static Perspective getModPerspective() {
        return HudManager.perspective;
    }
    
    private static boolean lIIIIIIIllIIlIIl(final int llllllllllllIllllllIIIIIIIlIIlll) {
        return llllllllllllIllllllIIIIIIIlIIlll != 0;
    }
    
    private static boolean lIIIIIIIllIIlIlI(final int llllllllllllIllllllIIIIIIIlIIlIl) {
        return llllllllllllIllllllIIIIIIIlIIlIl == 0;
    }
}
