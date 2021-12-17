// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.renderer.Tessellator;

public class Tezzelator
{
    public static /* synthetic */ Tessellator t;
    
    static {
        Tezzelator.t = Tessellator.getInstance();
        instance = new Tezzelator();
    }
    
    public Tezzelator vertex(final double lllllllllllllIIIIIlIIIlllIlIlIIl, final double lllllllllllllIIIIIlIIIlllIlIlIII, final double lllllllllllllIIIIIlIIIlllIlIIlll) {
        Tezzelator.t.getWorldRenderer().pos(lllllllllllllIIIIIlIIIlllIlIlIIl, lllllllllllllIIIIIlIIIlllIlIlIII, lllllllllllllIIIIIlIIIlllIlIIlll);
        "".length();
        return this;
    }
    
    public void offset(final double lllllllllllllIIIIIlIIIllIlllIlIl, final double lllllllllllllIIIIIlIIIllIlllIlll, final double lllllllllllllIIIIIlIIIllIlllIIll) {
        Tezzelator.t.getWorldRenderer().setTranslation(lllllllllllllIIIIIlIIIllIlllIlIl, lllllllllllllIIIIIlIIIllIlllIlll, lllllllllllllIIIIIlIIIllIlllIIll);
    }
    
    public void begin(final int lllllllllllllIIIIIlIIIllIlllllll, final RealmsVertexFormat lllllllllllllIIIIIlIIIlllIIIIIII) {
        Tezzelator.t.getWorldRenderer().begin(lllllllllllllIIIIIlIIIllIlllllll, lllllllllllllIIIIIlIIIlllIIIIIII.getVertexFormat());
    }
    
    public Tezzelator tex(final double lllllllllllllIIIIIlIIIllIlIllllI, final double lllllllllllllIIIIIlIIIllIlIlllIl) {
        Tezzelator.t.getWorldRenderer().tex(lllllllllllllIIIIIlIIIllIlIllllI, lllllllllllllIIIIIlIIIllIlIlllIl);
        "".length();
        return this;
    }
    
    public void color(final float lllllllllllllIIIIIlIIIlllIIllIIl, final float lllllllllllllIIIIIlIIIlllIIlllII, final float lllllllllllllIIIIIlIIIlllIIlIlll, final float lllllllllllllIIIIIlIIIlllIIllIlI) {
        Tezzelator.t.getWorldRenderer().color(lllllllllllllIIIIIlIIIlllIIllIIl, lllllllllllllIIIIIlIIIlllIIlllII, lllllllllllllIIIIIlIIIlllIIlIlll, lllllllllllllIIIIIlIIIlllIIllIlI);
        "".length();
    }
    
    public void endVertex() {
        Tezzelator.t.getWorldRenderer().endVertex();
    }
    
    public void normal(final float lllllllllllllIIIIIlIIIlllIIIIlll, final float lllllllllllllIIIIIlIIIlllIIIlIIl, final float lllllllllllllIIIIIlIIIlllIIIIlIl) {
        Tezzelator.t.getWorldRenderer().normal(lllllllllllllIIIIIlIIIlllIIIIlll, lllllllllllllIIIIIlIIIlllIIIlIIl, lllllllllllllIIIIIlIIIlllIIIIlIl);
        "".length();
    }
    
    public void end() {
        Tezzelator.t.draw();
    }
    
    public RealmsBufferBuilder color(final int lllllllllllllIIIIIlIIIllIllIlIIl, final int lllllllllllllIIIIIlIIIllIllIlIII, final int lllllllllllllIIIIIlIIIllIllIIlll, final int lllllllllllllIIIIIlIIIllIllIIllI) {
        return new RealmsBufferBuilder(Tezzelator.t.getWorldRenderer().color(lllllllllllllIIIIIlIIIllIllIlIIl, lllllllllllllIIIIIlIIIllIllIlIII, lllllllllllllIIIIIlIIIllIllIIlll, lllllllllllllIIIIIlIIIllIllIIllI));
    }
    
    public void tex2(final short lllllllllllllIIIIIlIIIlllIIlIIlI, final short lllllllllllllIIIIIlIIIlllIIlIIIl) {
        Tezzelator.t.getWorldRenderer().lightmap(lllllllllllllIIIIIlIIIlllIIlIIlI, lllllllllllllIIIIIlIIIlllIIlIIIl);
        "".length();
    }
}
