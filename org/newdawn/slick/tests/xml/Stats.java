// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.xml;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Stats
{
    private /* synthetic */ int exp;
    private /* synthetic */ int mp;
    private /* synthetic */ int hp;
    private static final /* synthetic */ int[] lllIlIIIIIIlII;
    private /* synthetic */ float age;
    private static final /* synthetic */ String[] lllIlIIIIIIIll;
    
    public void dump(final String llllllllllllIlIlllIIlllllIlIlIIl) {
        System.out.println(String.valueOf(new StringBuilder().append(llllllllllllIlIlllIIlllllIlIlIIl).append(Stats.lllIlIIIIIIIll[Stats.lllIlIIIIIIlII[0]]).append(this.hp).append(Stats.lllIlIIIIIIIll[Stats.lllIlIIIIIIlII[1]]).append(this.mp).append(Stats.lllIlIIIIIIIll[Stats.lllIlIIIIIIlII[2]]).append(this.age).append(Stats.lllIlIIIIIIIll[Stats.lllIlIIIIIIlII[3]]).append(this.exp)));
    }
    
    private static void lIlIIIIlIlIIllII() {
        (lllIlIIIIIIlII = new int[5])[0] = ((0x39 ^ 0x16) & ~(0xEA ^ 0xC5));
        Stats.lllIlIIIIIIlII[1] = " ".length();
        Stats.lllIlIIIIIIlII[2] = "  ".length();
        Stats.lllIlIIIIIIlII[3] = "   ".length();
        Stats.lllIlIIIIIIlII[4] = (0x8 ^ 0xC);
    }
    
    private static void lIlIIIIlIlIIlIll() {
        (lllIlIIIIIIIll = new String[Stats.lllIlIIIIIIlII[4]])[Stats.lllIlIIIIIIlII[0]] = lIlIIIIlIlIIlIlI("CSMJIDt6", "ZWhTH");
        Stats.lllIlIIIIIIIll[Stats.lllIlIIIIIIlII[1]] = lIlIIIIlIlIIlIlI("eA==", "TnChM");
        Stats.lllIlIIIIIIIll[Stats.lllIlIIIIIIlII[2]] = lIlIIIIlIlIIlIlI("bw==", "CVoVZ");
        Stats.lllIlIIIIIIIll[Stats.lllIlIIIIIIlII[3]] = lIlIIIIlIlIIlIlI("Wg==", "vMgZm");
    }
    
    static {
        lIlIIIIlIlIIllII();
        lIlIIIIlIlIIlIll();
    }
    
    private static String lIlIIIIlIlIIlIlI(String llllllllllllIlIlllIIlllllIIlIlll, final String llllllllllllIlIlllIIlllllIIllIll) {
        llllllllllllIlIlllIIlllllIIlIlll = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIlllllIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIlllllIIllIlI = new StringBuilder();
        final char[] llllllllllllIlIlllIIlllllIIllIIl = llllllllllllIlIlllIIlllllIIllIll.toCharArray();
        int llllllllllllIlIlllIIlllllIIllIII = Stats.lllIlIIIIIIlII[0];
        final Exception llllllllllllIlIlllIIlllllIIlIIlI = (Object)llllllllllllIlIlllIIlllllIIlIlll.toCharArray();
        final double llllllllllllIlIlllIIlllllIIlIIIl = llllllllllllIlIlllIIlllllIIlIIlI.length;
        float llllllllllllIlIlllIIlllllIIlIIII = Stats.lllIlIIIIIIlII[0];
        while (lIlIIIIlIlIIllIl((int)llllllllllllIlIlllIIlllllIIlIIII, (int)llllllllllllIlIlllIIlllllIIlIIIl)) {
            final char llllllllllllIlIlllIIlllllIIlllIl = llllllllllllIlIlllIIlllllIIlIIlI[llllllllllllIlIlllIIlllllIIlIIII];
            llllllllllllIlIlllIIlllllIIllIlI.append((char)(llllllllllllIlIlllIIlllllIIlllIl ^ llllllllllllIlIlllIIlllllIIllIIl[llllllllllllIlIlllIIlllllIIllIII % llllllllllllIlIlllIIlllllIIllIIl.length]));
            "".length();
            ++llllllllllllIlIlllIIlllllIIllIII;
            ++llllllllllllIlIlllIIlllllIIlIIII;
            "".length();
            if ((0x50 ^ 0x54) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIlllllIIllIlI);
    }
    
    private static boolean lIlIIIIlIlIIllIl(final int llllllllllllIlIlllIIlllllIIIllII, final int llllllllllllIlIlllIIlllllIIIlIll) {
        return llllllllllllIlIlllIIlllllIIIllII < llllllllllllIlIlllIIlllllIIIlIll;
    }
}
