// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.io.IOException;

interface AudioInputStream
{
    int getChannels();
    
    void close() throws IOException;
    
    int read() throws IOException;
    
    int read(final byte[] p0, final int p1, final int p2) throws IOException;
    
    int read(final byte[] p0) throws IOException;
    
    int getRate();
    
    boolean atEnd();
}
