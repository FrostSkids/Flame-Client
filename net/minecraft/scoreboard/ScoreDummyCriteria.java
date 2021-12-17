// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import net.minecraft.entity.player.EntityPlayer;
import java.util.List;

public class ScoreDummyCriteria implements IScoreObjectiveCriteria
{
    private static final /* synthetic */ int[] lIlllIlIlIlIIl;
    private final /* synthetic */ String dummyName;
    
    @Override
    public EnumRenderType getRenderType() {
        return EnumRenderType.INTEGER;
    }
    
    @Override
    public int func_96635_a(final List<EntityPlayer> llllllllllllIlllllIIIIIIlIllIlll) {
        return ScoreDummyCriteria.lIlllIlIlIlIIl[0];
    }
    
    static {
        lIIIIIlIllIIlIII();
    }
    
    @Override
    public String getName() {
        return this.dummyName;
    }
    
    public ScoreDummyCriteria(final String llllllllllllIlllllIIIIIIlIllllII) {
        this.dummyName = llllllllllllIlllllIIIIIIlIllllII;
        IScoreObjectiveCriteria.INSTANCES.put(llllllllllllIlllllIIIIIIlIllllII, this);
        "".length();
    }
    
    private static void lIIIIIlIllIIlIII() {
        (lIlllIlIlIlIIl = new int[1])[0] = ((0x6 ^ 0x5F) & ~(0x9F ^ 0xC6));
    }
    
    @Override
    public boolean isReadOnly() {
        return ScoreDummyCriteria.lIlllIlIlIlIIl[0] != 0;
    }
}
