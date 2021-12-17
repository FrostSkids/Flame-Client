// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CommandNotFoundException extends CommandException
{
    private static final /* synthetic */ int[] lllIllIlIlllII;
    private static final /* synthetic */ String[] lllIllIlIllIll;
    
    private static void lIlIIlIIllllIlll() {
        (lllIllIlIllIll = new String[CommandNotFoundException.lllIllIlIlllII[1]])[CommandNotFoundException.lllIllIlIlllII[0]] = lIlIIlIIllllIllI("NCgMIQk5IxJiDzIpBD4BNGkPIxwRKBQiDA==", "WGaLh");
    }
    
    static {
        lIlIIlIIlllllIII();
        lIlIIlIIllllIlll();
    }
    
    private static boolean lIlIIlIIlllllIIl(final int llllllllllllIlIllIIIlllllIllIIlI, final int llllllllllllIlIllIIIlllllIllIIIl) {
        return llllllllllllIlIllIIIlllllIllIIlI < llllllllllllIlIllIIIlllllIllIIIl;
    }
    
    private static void lIlIIlIIlllllIII() {
        (lllIllIlIlllII = new int[2])[0] = ((0xD ^ 0x2B) & ~(0x82 ^ 0xA4));
        CommandNotFoundException.lllIllIlIlllII[1] = " ".length();
    }
    
    public CommandNotFoundException() {
        this(CommandNotFoundException.lllIllIlIllIll[CommandNotFoundException.lllIllIlIlllII[0]], new Object[CommandNotFoundException.lllIllIlIlllII[0]]);
    }
    
    private static String lIlIIlIIllllIllI(String llllllllllllIlIllIIIlllllIllllIl, final String llllllllllllIlIllIIIlllllIllllII) {
        llllllllllllIlIllIIIlllllIllllIl = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIlllllIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIllllllIIIIII = new StringBuilder();
        final char[] llllllllllllIlIllIIIlllllIllllll = llllllllllllIlIllIIIlllllIllllII.toCharArray();
        int llllllllllllIlIllIIIlllllIlllllI = CommandNotFoundException.lllIllIlIlllII[0];
        final byte llllllllllllIlIllIIIlllllIlllIII = (Object)llllllllllllIlIllIIIlllllIllllIl.toCharArray();
        final long llllllllllllIlIllIIIlllllIllIlll = llllllllllllIlIllIIIlllllIlllIII.length;
        long llllllllllllIlIllIIIlllllIllIllI = CommandNotFoundException.lllIllIlIlllII[0];
        while (lIlIIlIIlllllIIl((int)llllllllllllIlIllIIIlllllIllIllI, (int)llllllllllllIlIllIIIlllllIllIlll)) {
            final char llllllllllllIlIllIIIllllllIIIIll = llllllllllllIlIllIIIlllllIlllIII[llllllllllllIlIllIIIlllllIllIllI];
            llllllllllllIlIllIIIllllllIIIIII.append((char)(llllllllllllIlIllIIIllllllIIIIll ^ llllllllllllIlIllIIIlllllIllllll[llllllllllllIlIllIIIlllllIlllllI % llllllllllllIlIllIIIlllllIllllll.length]));
            "".length();
            ++llllllllllllIlIllIIIlllllIlllllI;
            ++llllllllllllIlIllIIIlllllIllIllI;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIllllllIIIIII);
    }
    
    public CommandNotFoundException(final String llllllllllllIlIllIIIllllllIlIIIl, final Object... llllllllllllIlIllIIIllllllIIllIl) {
        super(llllllllllllIlIllIIIllllllIlIIIl, llllllllllllIlIllIIIllllllIIllIl);
    }
}
