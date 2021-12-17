// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.io.File;

public class FileSystemLocation implements ResourceLocation
{
    private /* synthetic */ File root;
    
    public FileSystemLocation(final File lllllllllllllIIlllIIlIlIIIlIIIII) {
        this.root = lllllllllllllIIlllIIlIlIIIlIIIII;
    }
    
    public URL getResource(final String lllllllllllllIIlllIIlIlIIIIlIlIl) {
        try {
            File lllllllllllllIIlllIIlIlIIIIllIlI = new File(this.root, lllllllllllllIIlllIIlIlIIIIlIlIl);
            if (llIIlIllIIlllIl(lllllllllllllIIlllIIlIlIIIIllIlI.exists() ? 1 : 0)) {
                lllllllllllllIIlllIIlIlIIIIllIlI = new File(lllllllllllllIIlllIIlIlIIIIlIlIl);
            }
            if (llIIlIllIIlllIl(lllllllllllllIIlllIIlIlIIIIllIlI.exists() ? 1 : 0)) {
                return null;
            }
            return lllllllllllllIIlllIIlIlIIIIllIlI.toURI().toURL();
        }
        catch (IOException lllllllllllllIIlllIIlIlIIIIllIIl) {
            return null;
        }
    }
    
    public InputStream getResourceAsStream(final String lllllllllllllIIlllIIlIlIIIIIlIll) {
        try {
            File lllllllllllllIIlllIIlIlIIIIlIIII = new File(this.root, lllllllllllllIIlllIIlIlIIIIIlIll);
            if (llIIlIllIIlllIl(lllllllllllllIIlllIIlIlIIIIlIIII.exists() ? 1 : 0)) {
                lllllllllllllIIlllIIlIlIIIIlIIII = new File(lllllllllllllIIlllIIlIlIIIIIlIll);
            }
            return new FileInputStream(lllllllllllllIIlllIIlIlIIIIlIIII);
        }
        catch (IOException lllllllllllllIIlllIIlIlIIIIIllll) {
            return null;
        }
    }
    
    private static boolean llIIlIllIIlllIl(final int lllllllllllllIIlllIIlIlIIIIIlIII) {
        return lllllllllllllIIlllIIlIlIIIIIlIII == 0;
    }
}
