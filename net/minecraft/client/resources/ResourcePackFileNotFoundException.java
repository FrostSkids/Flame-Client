// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.File;
import java.io.FileNotFoundException;

public class ResourcePackFileNotFoundException extends FileNotFoundException
{
    private static final /* synthetic */ int[] llIIlIIllIllII;
    private static final /* synthetic */ String[] llIIlIIllIlIll;
    
    private static void lIIIllIIlIIlllII() {
        (llIIlIIllIlIll = new String[ResourcePackFileNotFoundException.llIIlIIllIllII[2]])[ResourcePackFileNotFoundException.llIIlIIllIllII[0]] = lIIIllIIlIIllIll("680jHPEgqlSB1ffX2VxY8zx/46dKr2KPTqSzxaQdP4o=", "PlApD");
    }
    
    public ResourcePackFileNotFoundException(final File llllllllllllIlllIIlIIlIlIlIIllIl, final String llllllllllllIlllIIlIIlIlIlIIllll) {
        final String format = ResourcePackFileNotFoundException.llIIlIIllIlIll[ResourcePackFileNotFoundException.llIIlIIllIllII[0]];
        final Object[] args = new Object[ResourcePackFileNotFoundException.llIIlIIllIllII[1]];
        args[ResourcePackFileNotFoundException.llIIlIIllIllII[0]] = llllllllllllIlllIIlIIlIlIlIIllll;
        args[ResourcePackFileNotFoundException.llIIlIIllIllII[2]] = llllllllllllIlllIIlIIlIlIlIIllIl;
        super(String.format(format, args));
    }
    
    private static void lIIIllIIlIIlllIl() {
        (llIIlIIllIllII = new int[3])[0] = ((0x66 ^ 0x1D ^ (0x17 ^ 0x2F)) & (0x22 ^ 0x19 ^ (0xBD ^ 0xC5) ^ -" ".length()));
        ResourcePackFileNotFoundException.llIIlIIllIllII[1] = "  ".length();
        ResourcePackFileNotFoundException.llIIlIIllIllII[2] = " ".length();
    }
    
    private static String lIIIllIIlIIllIll(final String llllllllllllIlllIIlIIlIlIlIIIlII, final String llllllllllllIlllIIlIIlIlIlIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIIlIlIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIlIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIIlIlIlIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIIlIlIlIIIllI.init(ResourcePackFileNotFoundException.llIIlIIllIllII[1], llllllllllllIlllIIlIIlIlIlIIIlll);
            return new String(llllllllllllIlllIIlIIlIlIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIlIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIIlIlIlIIIlIl) {
            llllllllllllIlllIIlIIlIlIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIllIIlIIlllIl();
        lIIIllIIlIIlllII();
    }
}
