// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChatComponentTranslationFormatException extends IllegalArgumentException
{
    private static final /* synthetic */ String[] lIIIlIIIlIIIII;
    private static final /* synthetic */ int[] lIIIlIlIlIIIIl;
    
    private static void lIlllllIIlIlIIl() {
        (lIIIlIIIlIIIII = new String[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[3]])[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[0]] = lIlllllIIlIIlll("9Or1Eu3S1JqMKBKhvofb+o8NRT5X+xus", "aDILG");
        ChatComponentTranslationFormatException.lIIIlIIIlIIIII[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[2]] = lIlllllIIlIlIII("2YDeBWbSGXgjGaZhHSQy4GvC/D21OxN9SR7SfaUt5WUuivrw23HPwA==", "raNzh");
        ChatComponentTranslationFormatException.lIIIlIIIlIIIII[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[1]] = lIlllllIIlIlIII("x9ETcIlxF7niWiFtWsxlAiuJKxw5HRn8", "yuWXo");
    }
    
    private static String lIlllllIIlIlIII(final String lllllllllllllIlIIIIlllIlIlIlllIl, final String lllllllllllllIlIIIIlllIlIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlllIlIllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlllIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIlllIlIlIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIlllIlIlIlllll.init(ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[1], lllllllllllllIlIIIIlllIlIllIIIII);
            return new String(lllllllllllllIlIIIIlllIlIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlllIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlllIlIlIllllI) {
            lllllllllllllIlIIIIlllIlIlIllllI.printStackTrace();
            return null;
        }
    }
    
    public ChatComponentTranslationFormatException(final ChatComponentTranslation lllllllllllllIlIIIIlllIlIlllIIll, final Throwable lllllllllllllIlIIIIlllIlIlllIIlI) {
        final String format = ChatComponentTranslationFormatException.lIIIlIIIlIIIII[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[1]];
        final Object[] args = new Object[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[2]];
        args[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[0]] = lllllllllllllIlIIIIlllIlIlllIIll;
        super(String.format(format, args), lllllllllllllIlIIIIlllIlIlllIIlI);
    }
    
    static {
        llIIIIIIllIlllI();
        lIlllllIIlIlIIl();
    }
    
    public ChatComponentTranslationFormatException(final ChatComponentTranslation lllllllllllllIlIIIIlllIllIIIIlIl, final String lllllllllllllIlIIIIlllIllIIIIlII) {
        final String format = ChatComponentTranslationFormatException.lIIIlIIIlIIIII[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[0]];
        final Object[] args = new Object[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[1]];
        args[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[0]] = lllllllllllllIlIIIIlllIllIIIIlIl;
        args[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[2]] = lllllllllllllIlIIIIlllIllIIIIlII;
        super(String.format(format, args));
    }
    
    private static void llIIIIIIllIlllI() {
        (lIIIlIlIlIIIIl = new int[5])[0] = ((108 + 4 - 101 + 146 ^ 146 + 153 - 217 + 97) & (0x1D ^ 0x52 ^ (0x71 ^ 0x10) ^ -" ".length()));
        ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[1] = "  ".length();
        ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[2] = " ".length();
        ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[3] = "   ".length();
        ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[4] = (0x29 ^ 0x21);
    }
    
    private static String lIlllllIIlIIlll(final String lllllllllllllIlIIIIlllIlIllIlIlI, final String lllllllllllllIlIIIIlllIlIllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlllIlIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlllIlIllIIlll.getBytes(StandardCharsets.UTF_8)), ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[4]), "DES");
            final Cipher lllllllllllllIlIIIIlllIlIllIllII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIlllIlIllIllII.init(ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[1], lllllllllllllIlIIIIlllIlIllIllIl);
            return new String(lllllllllllllIlIIIIlllIlIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlllIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlllIlIllIlIll) {
            lllllllllllllIlIIIIlllIlIllIlIll.printStackTrace();
            return null;
        }
    }
    
    public ChatComponentTranslationFormatException(final ChatComponentTranslation lllllllllllllIlIIIIlllIlIlllllll, final int lllllllllllllIlIIIIlllIlIllllllI) {
        final String format = ChatComponentTranslationFormatException.lIIIlIIIlIIIII[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[2]];
        final Object[] args = new Object[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[1]];
        args[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[0]] = lllllllllllllIlIIIIlllIlIllllllI;
        args[ChatComponentTranslationFormatException.lIIIlIlIlIIIIl[2]] = lllllllllllllIlIIIIlllIlIlllllll;
        super(String.format(format, args));
    }
}
