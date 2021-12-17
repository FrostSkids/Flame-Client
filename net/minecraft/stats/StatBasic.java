// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import net.minecraft.util.IChatComponent;

public class StatBasic extends StatBase
{
    public StatBasic(final String llllllllllllIlllIlIllllllIIllIII, final IChatComponent llllllllllllIlllIlIllllllIIlIIll, final IStatType llllllllllllIlllIlIllllllIIlIIlI) {
        super(llllllllllllIlllIlIllllllIIllIII, llllllllllllIlllIlIllllllIIlIIll, llllllllllllIlllIlIllllllIIlIIlI);
    }
    
    @Override
    public StatBase registerStat() {
        super.registerStat();
        "".length();
        StatList.generalStats.add(this);
        "".length();
        return this;
    }
    
    public StatBasic(final String llllllllllllIlllIlIllllllIIIlIII, final IChatComponent llllllllllllIlllIlIllllllIIIllII) {
        super(llllllllllllIlllIlIllllllIIIlIII, llllllllllllIlllIlIllllllIIIllII);
    }
}
