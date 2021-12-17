// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.spectator.categories;

import com.google.common.base.Objects;
import net.minecraft.client.gui.spectator.SpectatorMenu;
import net.minecraft.client.gui.spectator.ISpectatorMenuView;
import net.minecraft.client.gui.spectator.ISpectatorMenuObject;
import java.util.List;

public class SpectatorDetails
{
    private final /* synthetic */ List<ISpectatorMenuObject> field_178682_b;
    private final /* synthetic */ int field_178683_c;
    private final /* synthetic */ ISpectatorMenuView field_178684_a;
    
    public int func_178681_b() {
        return this.field_178683_c;
    }
    
    private static boolean lIlIlllllIIIIIl(final int lllllllllllllIlIlIlIllllIllIlIII) {
        return lllllllllllllIlIlIlIllllIllIlIII >= 0;
    }
    
    public SpectatorDetails(final ISpectatorMenuView lllllllllllllIlIlIlIllllIlllllIl, final List<ISpectatorMenuObject> lllllllllllllIlIlIlIllllIllllIII, final int lllllllllllllIlIlIlIllllIllllIll) {
        this.field_178684_a = lllllllllllllIlIlIlIllllIlllllIl;
        this.field_178682_b = lllllllllllllIlIlIlIllllIllllIII;
        this.field_178683_c = lllllllllllllIlIlIlIllllIllllIll;
    }
    
    public ISpectatorMenuObject func_178680_a(final int lllllllllllllIlIlIlIllllIlllIIll) {
        ISpectatorMenuObject field_178657_a;
        if (lIlIlllllIIIIIl(lllllllllllllIlIlIlIllllIlllIIll) && lIlIlllllIIIIlI(lllllllllllllIlIlIlIllllIlllIIll, this.field_178682_b.size())) {
            field_178657_a = (ISpectatorMenuObject)Objects.firstNonNull((Object)this.field_178682_b.get(lllllllllllllIlIlIlIllllIlllIIll), (Object)SpectatorMenu.field_178657_a);
            "".length();
            if (((0x49 ^ 0x18) & ~(0xC8 ^ 0x99)) != ((0xA ^ 0x22) & ~(0x1E ^ 0x36))) {
                return null;
            }
        }
        else {
            field_178657_a = SpectatorMenu.field_178657_a;
        }
        return field_178657_a;
    }
    
    private static boolean lIlIlllllIIIIlI(final int lllllllllllllIlIlIlIllllIllIlIll, final int lllllllllllllIlIlIlIllllIllIlIlI) {
        return lllllllllllllIlIlIlIllllIllIlIll < lllllllllllllIlIlIlIllllIllIlIlI;
    }
}
