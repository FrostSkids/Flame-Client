// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.loading;

import java.io.IOException;

public interface DeferredResource
{
    String getDescription();
    
    void load() throws IOException;
}
