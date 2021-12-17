// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.muffin;

import java.io.IOException;
import java.util.HashMap;

public interface Muffin
{
    HashMap loadFile(final String p0) throws IOException;
    
    void saveFile(final HashMap p0, final String p1) throws IOException;
}
