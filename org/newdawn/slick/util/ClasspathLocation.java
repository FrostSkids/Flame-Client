// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import java.net.URL;
import java.io.InputStream;

public class ClasspathLocation implements ResourceLocation
{
    private static final /* synthetic */ int[] llIIlllIIIllII;
    
    static {
        lIIIllllIllIIlII();
    }
    
    public InputStream getResourceAsStream(final String llllllllllllIllIlllllIlIIIIlIllI) {
        final String llllllllllllIllIlllllIlIIIIlIlll = llllllllllllIllIlllllIlIIIIlIllI.replace((char)ClasspathLocation.llIIlllIIIllII[0], (char)ClasspathLocation.llIIlllIIIllII[1]);
        return ResourceLoader.class.getClassLoader().getResourceAsStream(llllllllllllIllIlllllIlIIIIlIlll);
    }
    
    public URL getResource(final String llllllllllllIllIlllllIlIIIIlllll) {
        final String llllllllllllIllIlllllIlIIIIllllI = llllllllllllIllIlllllIlIIIIlllll.replace((char)ClasspathLocation.llIIlllIIIllII[0], (char)ClasspathLocation.llIIlllIIIllII[1]);
        return ResourceLoader.class.getClassLoader().getResource(llllllllllllIllIlllllIlIIIIllllI);
    }
    
    private static void lIIIllllIllIIlII() {
        (llIIlllIIIllII = new int[2])[0] = (0xC1 ^ 0x8F ^ (0x37 ^ 0x25));
        ClasspathLocation.llIIlllIIIllII[1] = (0x4F ^ 0x60);
    }
}
