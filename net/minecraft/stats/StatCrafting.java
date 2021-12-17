// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.Item;

public class StatCrafting extends StatBase
{
    private final /* synthetic */ Item field_150960_a;
    
    private static boolean lllIlIlIIlIllIl(final int lllllllllllllIIIlIllIlIIlllIlIII) {
        return lllllllllllllIIIlIllIlIIlllIlIII != 0;
    }
    
    public Item func_150959_a() {
        return this.field_150960_a;
    }
    
    public StatCrafting(final String lllllllllllllIIIlIllIlIIllllIIIl, final String lllllllllllllIIIlIllIlIIllllIIII, final IChatComponent lllllllllllllIIIlIllIlIIlllIllll, final Item lllllllllllllIIIlIllIlIIlllIlllI) {
        super(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIlIllIlIIllllIIIl)).append(lllllllllllllIIIlIllIlIIllllIIII)), lllllllllllllIIIlIllIlIIlllIllll);
        this.field_150960_a = lllllllllllllIIIlIllIlIIlllIlllI;
        final int lllllllllllllIIIlIllIlIIllllIIll = Item.getIdFromItem(lllllllllllllIIIlIllIlIIlllIlllI);
        if (lllIlIlIIlIllIl(lllllllllllllIIIlIllIlIIllllIIll)) {
            IScoreObjectiveCriteria.INSTANCES.put(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIlIllIlIIllllIIIl)).append(lllllllllllllIIIlIllIlIIllllIIll)), this.func_150952_k());
            "".length();
        }
    }
}
