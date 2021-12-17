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

public class EntityNotFoundException extends CommandException
{
    private static final /* synthetic */ String[] llIllllllIllIl;
    private static final /* synthetic */ int[] llIllllllIlllI;
    
    static {
        lIIllIlllIIIlIlI();
        lIIllIlllIIIlIII();
    }
    
    private static void lIIllIlllIIIlIII() {
        (llIllllllIllIl = new String[EntityNotFoundException.llIllllllIlllI[1]])[EntityNotFoundException.llIllllllIlllI[0]] = lIIllIlllIIIIlll("SAv2adDBsw2E3Wjeo8cO1sNXxrtoWRcOWLw4CLUnJtQu0LHcOut5OQ==", "Vsymu");
    }
    
    private static String lIIllIlllIIIIlll(final String llllllllllllIllIIIlIlIlIIIlllIIl, final String llllllllllllIllIIIlIlIlIIIlllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlIlIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIlIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIlIlIIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIlIlIIIlllIll.init(EntityNotFoundException.llIllllllIlllI[2], llllllllllllIllIIIlIlIlIIIllllII);
            return new String(llllllllllllIllIIIlIlIlIIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIlIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlIlIIIlllIlI) {
            llllllllllllIllIIIlIlIlIIIlllIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIlllIIIlIlI() {
        (llIllllllIlllI = new int[3])[0] = ((0xD6 ^ 0xB5) & ~(0x56 ^ 0x35));
        EntityNotFoundException.llIllllllIlllI[1] = " ".length();
        EntityNotFoundException.llIllllllIlllI[2] = "  ".length();
    }
    
    public EntityNotFoundException(final String llllllllllllIllIIIlIlIlIIlIIIIlI, final Object... llllllllllllIllIIIlIlIlIIlIIIlII) {
        super(llllllllllllIllIIIlIlIlIIlIIIIlI, llllllllllllIllIIIlIlIlIIlIIIlII);
    }
    
    public EntityNotFoundException() {
        this(EntityNotFoundException.llIllllllIllIl[EntityNotFoundException.llIllllllIlllI[0]], new Object[EntityNotFoundException.llIllllllIlllI[0]]);
    }
}
