// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class PlayerNotFoundException extends CommandException
{
    private static final /* synthetic */ int[] lIIIIIlIlllIIl;
    private static final /* synthetic */ String[] lIIIIIlIlllIII;
    
    private static void lIllIllIlIIIlll() {
        (lIIIIIlIlllIII = new String[PlayerNotFoundException.lIIIIIlIlllIIl[1]])[PlayerNotFoundException.lIIIIIlIlllIIl[0]] = lIllIllIlIIIllI("DRwECCkAFxpLLwsdDBchDV0ZCSkXFhtLJgEHLwo9ABc=", "nsieH");
    }
    
    private static String lIllIllIlIIIllI(String lllllllllllllIlIIlllIIlIlIlIlIll, final String lllllllllllllIlIIlllIIlIlIlIlIlI) {
        lllllllllllllIlIIlllIIlIlIlIlIll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlllIIlIlIlIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllIIlIlIlIlllI = new StringBuilder();
        final char[] lllllllllllllIlIIlllIIlIlIlIllIl = lllllllllllllIlIIlllIIlIlIlIlIlI.toCharArray();
        int lllllllllllllIlIIlllIIlIlIlIllII = PlayerNotFoundException.lIIIIIlIlllIIl[0];
        final Exception lllllllllllllIlIIlllIIlIlIlIIllI = (Object)((String)lllllllllllllIlIIlllIIlIlIlIlIll).toCharArray();
        final boolean lllllllllllllIlIIlllIIlIlIlIIlIl = lllllllllllllIlIIlllIIlIlIlIIllI.length != 0;
        double lllllllllllllIlIIlllIIlIlIlIIlII = PlayerNotFoundException.lIIIIIlIlllIIl[0];
        while (lIllIllIlIIlIIl((int)lllllllllllllIlIIlllIIlIlIlIIlII, lllllllllllllIlIIlllIIlIlIlIIlIl ? 1 : 0)) {
            final char lllllllllllllIlIIlllIIlIlIllIIIl = lllllllllllllIlIIlllIIlIlIlIIllI[lllllllllllllIlIIlllIIlIlIlIIlII];
            lllllllllllllIlIIlllIIlIlIlIlllI.append((char)(lllllllllllllIlIIlllIIlIlIllIIIl ^ lllllllllllllIlIIlllIIlIlIlIllIl[lllllllllllllIlIIlllIIlIlIlIllII % lllllllllllllIlIIlllIIlIlIlIllIl.length]));
            "".length();
            ++lllllllllllllIlIIlllIIlIlIlIllII;
            ++lllllllllllllIlIIlllIIlIlIlIIlII;
            "".length();
            if ((137 + 138 - 238 + 121 ^ 54 + 37 - 46 + 110) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllIIlIlIlIlllI);
    }
    
    private static boolean lIllIllIlIIlIIl(final int lllllllllllllIlIIlllIIlIlIlIIIII, final int lllllllllllllIlIIlllIIlIlIIlllll) {
        return lllllllllllllIlIIlllIIlIlIlIIIII < lllllllllllllIlIIlllIIlIlIIlllll;
    }
    
    private static void lIllIllIlIIlIII() {
        (lIIIIIlIlllIIl = new int[2])[0] = ((180 + 122 - 290 + 182 ^ 131 + 74 - 148 + 85) & (153 + 108 - 188 + 165 ^ 57 + 106 - 157 + 156 ^ -" ".length()));
        PlayerNotFoundException.lIIIIIlIlllIIl[1] = " ".length();
    }
    
    static {
        lIllIllIlIIlIII();
        lIllIllIlIIIlll();
    }
    
    public PlayerNotFoundException(final String lllllllllllllIlIIlllIIlIlIllllll, final Object... lllllllllllllIlIIlllIIlIlIlllIll) {
        super(lllllllllllllIlIIlllIIlIlIllllll, lllllllllllllIlIIlllIIlIlIlllIll);
    }
    
    public PlayerNotFoundException() {
        this(PlayerNotFoundException.lIIIIIlIlllIII[PlayerNotFoundException.lIIIIIlIlllIIl[0]], new Object[PlayerNotFoundException.lIIIIIlIlllIIl[0]]);
    }
}
