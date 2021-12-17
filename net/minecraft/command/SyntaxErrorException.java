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

public class SyntaxErrorException extends CommandException
{
    private static final /* synthetic */ String[] lIlIllIIlIlIll;
    private static final /* synthetic */ int[] lIlIllIIlIllII;
    
    public SyntaxErrorException() {
        this(SyntaxErrorException.lIlIllIIlIlIll[SyntaxErrorException.lIlIllIIlIllII[0]], new Object[SyntaxErrorException.lIlIllIIlIllII[0]]);
    }
    
    static {
        llllIIIIlllllll();
        llllIIIIllllllI();
    }
    
    private static void llllIIIIllllllI() {
        (lIlIllIIlIlIll = new String[SyntaxErrorException.lIlIllIIlIllII[1]])[SyntaxErrorException.lIlIllIIlIllII[0]] = llllIIIIlllllIl("KQuiLlYkPKyfG0uO0JCD8GX004+btauv", "nqvPh");
    }
    
    private static void llllIIIIlllllll() {
        (lIlIllIIlIllII = new int[3])[0] = ((0x7 ^ 0x13 ^ (0x7C ^ 0x29)) & (74 + 135 - 108 + 152 ^ 76 + 35 + 20 + 57 ^ -" ".length()));
        SyntaxErrorException.lIlIllIIlIllII[1] = " ".length();
        SyntaxErrorException.lIlIllIIlIllII[2] = "  ".length();
    }
    
    public SyntaxErrorException(final String lllllllllllllIIIIlllIIIIIlIlIIII, final Object... lllllllllllllIIIIlllIIIIIlIIllII) {
        super(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
    }
    
    private static String llllIIIIlllllIl(final String lllllllllllllIIIIlllIIIIIlIIIIlI, final String lllllllllllllIIIIlllIIIIIlIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIIIIIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlllIIIIIlIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlllIIIIIlIIIllI.init(SyntaxErrorException.lIlIllIIlIllII[2], lllllllllllllIIIIlllIIIIIlIIIlll);
            return new String(lllllllllllllIIIIlllIIIIIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIIIIIlIIIlIl) {
            lllllllllllllIIIIlllIIIIIlIIIlIl.printStackTrace();
            return null;
        }
    }
}
