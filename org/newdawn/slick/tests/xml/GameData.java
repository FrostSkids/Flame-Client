// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.xml;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.ArrayList;

public class GameData
{
    private /* synthetic */ ArrayList entities;
    private static final /* synthetic */ String[] llIIIIIlllIIlI;
    private static final /* synthetic */ int[] llIIIIIlllIlII;
    
    private static String lIIIIlllIlllIIII(String llllllllllllIlllIlllIlIllIIIIIIl, final String llllllllllllIlllIlllIlIllIIIIIII) {
        llllllllllllIlllIlllIlIllIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlllIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllIlIllIIIIlII = new StringBuilder();
        final char[] llllllllllllIlllIlllIlIllIIIIIll = llllllllllllIlllIlllIlIllIIIIIII.toCharArray();
        int llllllllllllIlllIlllIlIllIIIIIlI = GameData.llIIIIIlllIlII[0];
        final boolean llllllllllllIlllIlllIlIlIlllllII = (Object)llllllllllllIlllIlllIlIllIIIIIIl.toCharArray();
        final String llllllllllllIlllIlllIlIlIllllIll = (String)llllllllllllIlllIlllIlIlIlllllII.length;
        short llllllllllllIlllIlllIlIlIllllIlI = (short)GameData.llIIIIIlllIlII[0];
        while (lIIIIlllIlllllII(llllllllllllIlllIlllIlIlIllllIlI, (int)llllllllllllIlllIlllIlIlIllllIll)) {
            final char llllllllllllIlllIlllIlIllIIIIlll = llllllllllllIlllIlllIlIlIlllllII[llllllllllllIlllIlllIlIlIllllIlI];
            llllllllllllIlllIlllIlIllIIIIlII.append((char)(llllllllllllIlllIlllIlIllIIIIlll ^ llllllllllllIlllIlllIlIllIIIIIll[llllllllllllIlllIlllIlIllIIIIIlI % llllllllllllIlllIlllIlIllIIIIIll.length]));
            "".length();
            ++llllllllllllIlllIlllIlIllIIIIIlI;
            ++llllllllllllIlllIlllIlIlIllllIlI;
            "".length();
            if (-(143 + 47 - 12 + 16 ^ 177 + 101 - 189 + 109) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllIlIllIIIIlII);
    }
    
    private static void lIIIIlllIllllIll() {
        (llIIIIIlllIlII = new int[3])[0] = ((0x7E ^ 0x49 ^ (0xE9 ^ 0xBF)) & (36 + 231 - 61 + 30 ^ 66 + 36 + 14 + 25 ^ -" ".length()));
        GameData.llIIIIIlllIlII[1] = " ".length();
        GameData.llIIIIIlllIlII[2] = "  ".length();
    }
    
    private static String lIIIIlllIllIllll(final String llllllllllllIlllIlllIlIllIIlIlII, final String llllllllllllIlllIlllIlIllIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIlllIlIllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIlIllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlllIlIllIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlllIlIllIIllIII.init(GameData.llIIIIIlllIlII[2], llllllllllllIlllIlllIlIllIIllIIl);
            return new String(llllllllllllIlllIlllIlIllIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIlIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllIlIllIIlIlll) {
            llllllllllllIlllIlllIlIllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private void add(final Entity llllllllllllIlllIlllIlIllIlIIlll) {
        this.entities.add(llllllllllllIlllIlllIlIllIlIIlll);
        "".length();
    }
    
    private static void lIIIIlllIlllIIIl() {
        (llIIIIIlllIIlI = new String[GameData.llIIIIIlllIlII[2]])[GameData.llIIIIIlllIlII[0]] = lIIIIlllIllIllll("FMgQmQL4dp0R61bKhBZh7A==", "Ubgpc");
        GameData.llIIIIIlllIIlI[GameData.llIIIIIlllIlII[1]] = lIIIIlllIlllIIII("Uw==", "ZzySN");
    }
    
    static {
        lIIIIlllIllllIll();
        lIIIIlllIlllIIIl();
    }
    
    public GameData() {
        this.entities = new ArrayList();
    }
    
    private static boolean lIIIIlllIlllllII(final int llllllllllllIlllIlllIlIlIlllIllI, final int llllllllllllIlllIlllIlIlIlllIlIl) {
        return llllllllllllIlllIlllIlIlIlllIllI < llllllllllllIlllIlllIlIlIlllIlIl;
    }
    
    public void dump(final String llllllllllllIlllIlllIlIllIlIIIIl) {
        System.out.println(String.valueOf(new StringBuilder().append(llllllllllllIlllIlllIlIllIlIIIIl).append(GameData.llIIIIIlllIIlI[GameData.llIIIIIlllIlII[0]])));
        int llllllllllllIlllIlllIlIllIlIIIll = GameData.llIIIIIlllIlII[0];
        while (lIIIIlllIlllllII(llllllllllllIlllIlllIlIllIlIIIll, this.entities.size())) {
            this.entities.get(llllllllllllIlllIlllIlIllIlIIIll).dump(String.valueOf(new StringBuilder().append(llllllllllllIlllIlllIlIllIlIIIIl).append(GameData.llIIIIIlllIIlI[GameData.llIIIIIlllIlII[1]])));
            ++llllllllllllIlllIlllIlIllIlIIIll;
            "".length();
            if ((0x6C ^ 0x68) <= 0) {
                return;
            }
        }
    }
}
