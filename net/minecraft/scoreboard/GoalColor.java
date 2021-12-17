// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;

public class GoalColor implements IScoreObjectiveCriteria
{
    private final /* synthetic */ String goalName;
    private static final /* synthetic */ int[] lllIIIIIlIIlIl;
    
    private static void lIIlllIIIIIllIll() {
        (lllIIIIIlIIlIl = new int[1])[0] = ((0x72 ^ 0x7F ^ (0x13 ^ 0xC)) & (0x4A ^ 0x1B ^ (0x50 ^ 0x13) ^ -" ".length()));
    }
    
    @Override
    public int func_96635_a(final List<EntityPlayer> llllllllllllIllIIIIlllllIIlIIlII) {
        return GoalColor.lllIIIIIlIIlIl[0];
    }
    
    public GoalColor(final String llllllllllllIllIIIIlllllIIlIllIl, final EnumChatFormatting llllllllllllIllIIIIlllllIIlIllII) {
        this.goalName = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIIIlllllIIlIllIl)).append(llllllllllllIllIIIIlllllIIlIllII.getFriendlyName()));
        IScoreObjectiveCriteria.INSTANCES.put(this.goalName, this);
        "".length();
    }
    
    @Override
    public boolean isReadOnly() {
        return GoalColor.lllIIIIIlIIlIl[0] != 0;
    }
    
    static {
        lIIlllIIIIIllIll();
    }
    
    @Override
    public String getName() {
        return this.goalName;
    }
    
    @Override
    public EnumRenderType getRenderType() {
        return EnumRenderType.INTEGER;
    }
}
