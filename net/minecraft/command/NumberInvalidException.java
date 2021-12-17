// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class NumberInvalidException extends CommandException
{
    private static final /* synthetic */ String[] lIlIIIIllllIll;
    private static final /* synthetic */ int[] lIlIIIIlllllII;
    
    public NumberInvalidException() {
        this(NumberInvalidException.lIlIIIIllllIll[NumberInvalidException.lIlIIIIlllllII[0]], new Object[NumberInvalidException.lIlIIIIlllllII[0]]);
    }
    
    private static void lllIIIlIIIlllIl() {
        (lIlIIIIlllllII = new int[3])[0] = ((0x8C ^ 0x94 ^ (0x98 ^ 0xA2)) & (0x7C ^ 0x47 ^ (0xB5 ^ 0xAC) ^ -" ".length()));
        NumberInvalidException.lIlIIIIlllllII[1] = " ".length();
        NumberInvalidException.lIlIIIIlllllII[2] = "  ".length();
    }
    
    private static String lllIIIlIIIllIlI(final String lllllllllllllIIlIIIIIIIlIIlIlllI, final String lllllllllllllIIlIIIIIIIlIIlIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIIIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIIlIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIIIIlIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIIIIlIIllIIlI.init(NumberInvalidException.lIlIIIIlllllII[2], lllllllllllllIIlIIIIIIIlIIllIIll);
            return new String(lllllllllllllIIlIIIIIIIlIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIIIlIIllIIIl) {
            lllllllllllllIIlIIIIIIIlIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIIIlIIIlllIl();
        lllIIIlIIIllIll();
    }
    
    private static void lllIIIlIIIllIll() {
        (lIlIIIIllllIll = new String[NumberInvalidException.lIlIIIIlllllII[1]])[NumberInvalidException.lIlIIIIlllllII[0]] = lllIIIlIIIllIlI("Pb2+OS0gGYwoIqFvtSwSaM6U0mLxpdgfu8urseD3CyQ=", "plYpP");
    }
    
    public NumberInvalidException(final String lllllllllllllIIlIIIIIIIlIIlllIIl, final Object... lllllllllllllIIlIIIIIIIlIIlllIll) {
        super(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
    }
}
