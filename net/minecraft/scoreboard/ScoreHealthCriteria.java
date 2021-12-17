// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import java.util.Iterator;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;

public class ScoreHealthCriteria extends ScoreDummyCriteria
{
    private static final /* synthetic */ int[] lIIlIIIlllIlIl;
    
    private static void llIIlIlllIIlllI() {
        (lIIlIIIlllIlIl = new int[1])[0] = " ".length();
    }
    
    public ScoreHealthCriteria(final String lllllllllllllIIlllIIIllllIIIIlll) {
        super(lllllllllllllIIlllIIIllllIIIIlll);
    }
    
    static {
        llIIlIlllIIlllI();
    }
    
    @Override
    public boolean isReadOnly() {
        return ScoreHealthCriteria.lIIlIIIlllIlIl[0] != 0;
    }
    
    private static boolean llIIlIlllIIllll(final int lllllllllllllIIlllIIIlllIlllIlIl) {
        return lllllllllllllIIlllIIIlllIlllIlIl == 0;
    }
    
    @Override
    public int func_96635_a(final List<EntityPlayer> lllllllllllllIIlllIIIlllIlllllII) {
        float lllllllllllllIIlllIIIlllIllllllI = 0.0f;
        final float lllllllllllllIIlllIIIlllIllllIIl = (float)lllllllllllllIIlllIIIlllIlllllII.iterator();
        "".length();
        if ("  ".length() > "   ".length()) {
            return (0x8D ^ 0xB3) & ~(0x4D ^ 0x73);
        }
        while (!llIIlIlllIIllll(((Iterator)lllllllllllllIIlllIIIlllIllllIIl).hasNext() ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIlllIIIlllIlllllIl = ((Iterator<EntityPlayer>)lllllllllllllIIlllIIIlllIllllIIl).next();
            lllllllllllllIIlllIIIlllIllllllI += lllllllllllllIIlllIIIlllIlllllIl.getHealth() + lllllllllllllIIlllIIIlllIlllllIl.getAbsorptionAmount();
        }
        if (llIIlIlllIlIIII(lllllllllllllIIlllIIIlllIlllllII.size())) {
            lllllllllllllIIlllIIIlllIllllllI /= lllllllllllllIIlllIIIlllIlllllII.size();
        }
        return MathHelper.ceiling_float_int(lllllllllllllIIlllIIIlllIllllllI);
    }
    
    private static boolean llIIlIlllIlIIII(final int lllllllllllllIIlllIIIlllIlllIIll) {
        return lllllllllllllIIlllIIIlllIlllIIll > 0;
    }
    
    @Override
    public IScoreObjectiveCriteria.EnumRenderType getRenderType() {
        return IScoreObjectiveCriteria.EnumRenderType.HEARTS;
    }
}
