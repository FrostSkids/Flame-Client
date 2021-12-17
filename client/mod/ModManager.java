// 
// Decompiled by Procyon v0.5.36
// 

package client.mod;

import client.mod.impl.ToggleSprint;
import java.util.ArrayList;

public class ModManager
{
    public /* synthetic */ ArrayList<Mod> mods;
    public /* synthetic */ ToggleSprint toggleSprint;
    
    public ModManager() {
        this.mods = new ArrayList<Mod>();
        final ArrayList<Mod> mods = this.mods;
        final ToggleSprint toggleSprint = new ToggleSprint();
        this.toggleSprint = toggleSprint;
        mods.add(toggleSprint);
        "".length();
    }
}
