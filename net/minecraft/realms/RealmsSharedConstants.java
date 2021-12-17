// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ChatAllowedCharacters;

public class RealmsSharedConstants
{
    public static /* synthetic */ char[] ILLEGAL_FILE_CHARACTERS;
    public static /* synthetic */ int NETWORK_PROTOCOL_VERSION;
    private static final /* synthetic */ int[] llIlIllllIlIlI;
    public static /* synthetic */ int TICKS_PER_SECOND;
    private static final /* synthetic */ String[] llIlIllllIlIII;
    public static /* synthetic */ String VERSION_STRING;
    
    static {
        lIIlIllIIIIIIIll();
        lIIlIlIllllllllI();
        RealmsSharedConstants.NETWORK_PROTOCOL_VERSION = RealmsSharedConstants.llIlIllllIlIlI[0];
        RealmsSharedConstants.TICKS_PER_SECOND = RealmsSharedConstants.llIlIllllIlIlI[1];
        RealmsSharedConstants.VERSION_STRING = RealmsSharedConstants.llIlIllllIlIII[RealmsSharedConstants.llIlIllllIlIlI[2]];
        RealmsSharedConstants.ILLEGAL_FILE_CHARACTERS = ChatAllowedCharacters.allowedCharactersArray;
    }
    
    private static void lIIlIlIllllllllI() {
        (llIlIllllIlIII = new String[RealmsSharedConstants.llIlIllllIlIlI[3]])[RealmsSharedConstants.llIlIllllIlIlI[2]] = lIIlIlIlllllllIl("5sDb3cOFiHc=", "joDxR");
    }
    
    private static void lIIlIllIIIIIIIll() {
        (llIlIllllIlIlI = new int[6])[0] = (18 + 115 - 101 + 141 ^ 48 + 128 - 103 + 57);
        RealmsSharedConstants.llIlIllllIlIlI[1] = (40 + 93 - 129 + 143 ^ 85 + 36 - 78 + 92);
        RealmsSharedConstants.llIlIllllIlIlI[2] = ((0x91 ^ 0xAF) & ~(0x8E ^ 0xB0));
        RealmsSharedConstants.llIlIllllIlIlI[3] = " ".length();
        RealmsSharedConstants.llIlIllllIlIlI[4] = (0x15 ^ 0x66 ^ (0x13 ^ 0x68));
        RealmsSharedConstants.llIlIllllIlIlI[5] = "  ".length();
    }
    
    private static String lIIlIlIlllllllIl(final String llllllllllllIllIlIIIlIllllIlIIIl, final String llllllllllllIllIlIIIlIllllIIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIlIllllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIlIllllIIlllI.getBytes(StandardCharsets.UTF_8)), RealmsSharedConstants.llIlIllllIlIlI[4]), "DES");
            final Cipher llllllllllllIllIlIIIlIllllIllIII = Cipher.getInstance("DES");
            llllllllllllIllIlIIIlIllllIllIII.init(RealmsSharedConstants.llIlIllllIlIlI[5], llllllllllllIllIlIIIlIllllIllIlI);
            return new String(llllllllllllIllIlIIIlIllllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIlIllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIlIllllIlIlll) {
            llllllllllllIllIlIIIlIllllIlIlll.printStackTrace();
            return null;
        }
    }
}
