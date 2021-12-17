// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.command;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class BasicCommand implements Command
{
    private static final /* synthetic */ int[] lIIIlIIIIIlIII;
    private static final /* synthetic */ String[] lIIIlIIIIIIlll;
    private /* synthetic */ String name;
    
    private static String lIllllIllIIlllI(final String lllllllllllllIlIIIllIllIIllIIlII, final String lllllllllllllIlIIIllIllIIllIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIllIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIllIllIIllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIllIllIIllIlIII.init(BasicCommand.lIIIlIIIIIlIII[2], lllllllllllllIlIIIllIllIIllIlIIl);
            return new String(lllllllllllllIlIIIllIllIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIllIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIllIIllIIlll) {
            lllllllllllllIlIIIllIllIIllIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(BasicCommand.lIIIlIIIIIIlll[BasicCommand.lIIIlIIIIIlIII[0]]).append(this.name).append(BasicCommand.lIIIlIIIIIIlll[BasicCommand.lIIIlIIIIIlIII[1]]));
    }
    
    private static boolean lIllllIllIlIIIl(final int lllllllllllllIlIIIllIllIIlIlllll) {
        return lllllllllllllIlIIIllIllIIlIlllll != 0;
    }
    
    private static void lIllllIllIlIIII() {
        (lIIIlIIIIIlIII = new int[4])[0] = ((0xAF ^ 0x96) & ~(0xD ^ 0x34));
        BasicCommand.lIIIlIIIIIlIII[1] = " ".length();
        BasicCommand.lIIIlIIIIIlIII[2] = "  ".length();
        BasicCommand.lIIIlIIIIIlIII[3] = (0x3 ^ 0xB);
    }
    
    private static void lIllllIllIIllll() {
        (lIIIlIIIIIIlll = new String[BasicCommand.lIIIlIIIIIlIII[2]])[BasicCommand.lIIIlIIIIIlIII[0]] = lIllllIllIIllIl("QcDOYtbZFqhoJcoqz4rqCA==", "kfKmY");
        BasicCommand.lIIIlIIIIIIlll[BasicCommand.lIIIlIIIIIlIII[1]] = lIllllIllIIlllI("EwFM06yKt3o=", "GioGd");
    }
    
    public String getName() {
        return this.name;
    }
    
    public BasicCommand(final String lllllllllllllIlIIIllIllIlIIIlIlI) {
        this.name = lllllllllllllIlIIIllIllIlIIIlIlI;
    }
    
    private static String lIllllIllIIllIl(final String lllllllllllllIlIIIllIllIIlllIIIl, final String lllllllllllllIlIIIllIllIIlllIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIllIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIllIIlllIIII.getBytes(StandardCharsets.UTF_8)), BasicCommand.lIIIlIIIIIlIII[3]), "DES");
            final Cipher lllllllllllllIlIIIllIllIIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIllIllIIlllIlIl.init(BasicCommand.lIIIlIIIIIlIII[2], lllllllllllllIlIIIllIllIIlllIllI);
            return new String(lllllllllllllIlIIIllIllIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIllIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIllIIlllIlII) {
            lllllllllllllIlIIIllIllIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIIIllIllIlIIIIIII) {
        if (lIllllIllIlIIIl((lllllllllllllIlIIIllIllIlIIIIIII instanceof BasicCommand) ? 1 : 0)) {
            return ((BasicCommand)lllllllllllllIlIIIllIllIlIIIIIII).name.equals(this.name);
        }
        return BasicCommand.lIIIlIIIIIlIII[0] != 0;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    
    static {
        lIllllIllIlIIII();
        lIllllIllIIllll();
    }
}
