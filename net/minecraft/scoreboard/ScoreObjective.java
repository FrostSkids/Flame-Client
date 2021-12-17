// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

public class ScoreObjective
{
    private final /* synthetic */ Scoreboard theScoreboard;
    private /* synthetic */ IScoreObjectiveCriteria.EnumRenderType renderType;
    private final /* synthetic */ IScoreObjectiveCriteria objectiveCriteria;
    private final /* synthetic */ String name;
    private /* synthetic */ String displayName;
    
    public void setRenderType(final IScoreObjectiveCriteria.EnumRenderType llllllllllllIllIlIIllIIlllIIIIIl) {
        this.renderType = llllllllllllIllIlIIllIIlllIIIIIl;
        this.theScoreboard.func_96532_b(this);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    public Scoreboard getScoreboard() {
        return this.theScoreboard;
    }
    
    public void setDisplayName(final String llllllllllllIllIlIIllIIlllIIlIII) {
        this.displayName = llllllllllllIllIlIIllIIlllIIlIII;
        this.theScoreboard.func_96532_b(this);
    }
    
    public ScoreObjective(final Scoreboard llllllllllllIllIlIIllIIllllIIIII, final String llllllllllllIllIlIIllIIlllIllIll, final IScoreObjectiveCriteria llllllllllllIllIlIIllIIlllIllIlI) {
        this.theScoreboard = llllllllllllIllIlIIllIIllllIIIII;
        this.name = llllllllllllIllIlIIllIIlllIllIll;
        this.objectiveCriteria = llllllllllllIllIlIIllIIlllIllIlI;
        this.displayName = llllllllllllIllIlIIllIIlllIllIll;
        this.renderType = llllllllllllIllIlIIllIIlllIllIlI.getRenderType();
    }
    
    public IScoreObjectiveCriteria.EnumRenderType getRenderType() {
        return this.renderType;
    }
    
    public IScoreObjectiveCriteria getCriteria() {
        return this.objectiveCriteria;
    }
}
