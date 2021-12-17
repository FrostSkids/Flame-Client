// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.particles;

import org.newdawn.slick.Image;

public interface ParticleEmitter
{
    void wrapUp();
    
    void updateParticle(final Particle p0, final int p1);
    
    Image getImage();
    
    boolean usePoints(final ParticleSystem p0);
    
    boolean completed();
    
    boolean isEnabled();
    
    void resetState();
    
    void update(final ParticleSystem p0, final int p1);
    
    void setEnabled(final boolean p0);
    
    boolean isOriented();
    
    boolean useAdditive();
}
