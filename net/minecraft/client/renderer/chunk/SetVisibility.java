// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Set;
import net.minecraft.util.EnumFacing;
import java.util.BitSet;

public class SetVisibility
{
    private final /* synthetic */ BitSet bitSet;
    private static final /* synthetic */ String[] lIlllIllIIlIll;
    private static final /* synthetic */ int[] lIlllIllIIllII;
    private static final /* synthetic */ int COUNT_FACES;
    
    public boolean isVisible(final EnumFacing llllllllllllIllllIlllIIllIllllll, final EnumFacing llllllllllllIllllIlllIIlllIIIIIl) {
        return this.bitSet.get(llllllllllllIllllIlllIIllIllllll.ordinal() + llllllllllllIllllIlllIIlllIIIIIl.ordinal() * SetVisibility.COUNT_FACES);
    }
    
    private static boolean lIIIIIllIIllIllI(final int llllllllllllIllllIlllIIllIIlIIlI, final int llllllllllllIllllIlllIIllIIlIIIl) {
        return llllllllllllIllllIlllIIllIIlIIlI >= llllllllllllIllllIlllIIllIIlIIIl;
    }
    
    private static void lIIIIIllIIllIIlI() {
        (lIlllIllIIlIll = new String[SetVisibility.lIlllIllIIllII[0]])[SetVisibility.lIlllIllIIllII[1]] = lIIIIIllIIllIIIl("CPwCBGmXmXM=", "aIlkY");
    }
    
    private static boolean lIIIIIllIIlllIIl(final int llllllllllllIllllIlllIIllIIIlIll) {
        return llllllllllllIllllIlllIIllIIIlIll != 0;
    }
    
    private static boolean lIIIIIllIIllIlII(final int llllllllllllIllllIlllIIllIIIlIIl) {
        return llllllllllllIllllIlllIIllIIIlIIl == 0;
    }
    
    public SetVisibility() {
        this.bitSet = new BitSet(SetVisibility.COUNT_FACES * SetVisibility.COUNT_FACES);
    }
    
    public void setManyVisible(final Set<EnumFacing> llllllllllllIllllIlllIIllllIlIIl) {
        final String llllllllllllIllllIlllIIlllIlllIl = (String)llllllllllllIllllIlllIIllllIlIIl.iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIIIIIllIIllIlII(((Iterator)llllllllllllIllllIlllIIlllIlllIl).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllllIlllIIllllIIlll = ((Iterator<EnumFacing>)llllllllllllIllllIlllIIlllIlllIl).next();
            final char llllllllllllIllllIlllIIlllIllIll = (char)llllllllllllIllllIlllIIllllIlIIl.iterator();
            "".length();
            if (((0x32 ^ 0x7D) & ~(0x2E ^ 0x61)) != 0x0) {
                return;
            }
            while (!lIIIIIllIIllIlII(((Iterator)llllllllllllIllllIlllIIlllIllIll).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIllllIlllIIllllIIlIl = ((Iterator<EnumFacing>)llllllllllllIllllIlllIIlllIllIll).next();
                this.setVisible(llllllllllllIllllIlllIIllllIIlll, llllllllllllIllllIlllIIllllIIlIl, (boolean)(SetVisibility.lIlllIllIIllII[0] != 0));
            }
        }
    }
    
    private static void lIIIIIllIIllIIll() {
        (lIlllIllIIllII = new int[8])[0] = " ".length();
        SetVisibility.lIlllIllIIllII[1] = ((0x4B ^ 0x42) & ~(0x14 ^ 0x1D));
        SetVisibility.lIlllIllIIllII[2] = (50 + 31 + 52 + 97 ^ 74 + 157 - 189 + 156);
        SetVisibility.lIlllIllIIllII[3] = (0x10 ^ 0x37 ^ (0xAD ^ 0x80));
        SetVisibility.lIlllIllIIllII[4] = (0xA6 ^ 0x80 ^ 76 + 0 + 38 + 13);
        SetVisibility.lIlllIllIIllII[5] = (0x60 ^ 0x7E ^ (0x47 ^ 0x37));
        SetVisibility.lIlllIllIIllII[6] = (0xC ^ 0x3C ^ (0x67 ^ 0x5F));
        SetVisibility.lIlllIllIIllII[7] = "  ".length();
    }
    
    private static String lIIIIIllIIllIIIl(final String llllllllllllIllllIlllIIllIIllIII, final String llllllllllllIllllIlllIIllIIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIIllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIIllIIllIIl.getBytes(StandardCharsets.UTF_8)), SetVisibility.lIlllIllIIllII[6]), "DES");
            final Cipher llllllllllllIllllIlllIIllIIlllII = Cipher.getInstance("DES");
            llllllllllllIllllIlllIIllIIlllII.init(SetVisibility.lIlllIllIIllII[7], llllllllllllIllllIlllIIllIIlllIl);
            return new String(llllllllllllIllllIlllIIllIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIIllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIIllIIllIll) {
            llllllllllllIllllIlllIIllIIllIll.printStackTrace();
            return null;
        }
    }
    
    public void setAllVisible(final boolean llllllllllllIllllIlllIIlllIIIlll) {
        this.bitSet.set(SetVisibility.lIlllIllIIllII[1], this.bitSet.size(), llllllllllllIllllIlllIIlllIIIlll);
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIllllIlllIIllIllIIIl = new StringBuilder();
        llllllllllllIllllIlllIIllIllIIIl.append((char)SetVisibility.lIlllIllIIllII[2]);
        "".length();
        String llllllllllllIllllIlllIIllIlIIlll;
        long llllllllllllIllllIlllIIllIlIlIII = ((EnumFacing[])(Object)(llllllllllllIllllIlllIIllIlIIlll = (String)(Object)EnumFacing.values())).length;
        long llllllllllllIllllIlllIIllIlIlIIl = SetVisibility.lIlllIllIIllII[1];
        "".length();
        if (-(0x2E ^ 0x2A) >= 0) {
            return null;
        }
        while (!lIIIIIllIIllIllI((int)llllllllllllIllllIlllIIllIlIlIIl, (int)llllllllllllIllllIlllIIllIlIlIII)) {
            final EnumFacing llllllllllllIllllIlllIIllIllIIII = llllllllllllIllllIlllIIllIlIIlll[llllllllllllIllllIlllIIllIlIlIIl];
            llllllllllllIllllIlllIIllIllIIIl.append((char)SetVisibility.lIlllIllIIllII[2]).append(llllllllllllIllllIlllIIllIllIIII.toString().toUpperCase().charAt(SetVisibility.lIlllIllIIllII[1]));
            "".length();
            ++llllllllllllIllllIlllIIllIlIlIIl;
        }
        llllllllllllIllllIlllIIllIllIIIl.append((char)SetVisibility.lIlllIllIIllII[3]);
        "".length();
        llllllllllllIllllIlllIIllIlIlIII = ((EnumFacing[])(Object)(llllllllllllIllllIlllIIllIlIIlll = (String)(Object)EnumFacing.values())).length;
        llllllllllllIllllIlllIIllIlIlIIl = SetVisibility.lIlllIllIIllII[1];
        "".length();
        if ("   ".length() == (0xF ^ 0xB)) {
            return null;
        }
        while (!lIIIIIllIIllIllI((int)llllllllllllIllllIlllIIllIlIlIIl, (int)llllllllllllIllllIlllIIllIlIlIII)) {
            final EnumFacing llllllllllllIllllIlllIIllIlIllll = llllllllllllIllllIlllIIllIlIIlll[llllllllllllIllllIlllIIllIlIlIIl];
            llllllllllllIllllIlllIIllIllIIIl.append(llllllllllllIllllIlllIIllIlIllll.toString().toUpperCase().charAt(SetVisibility.lIlllIllIIllII[1]));
            "".length();
            final float llllllllllllIllllIlllIIllIlIIIll;
            final float llllllllllllIllllIlllIIllIlIIlII = ((EnumFacing[])(Object)(llllllllllllIllllIlllIIllIlIIIll = (float)(Object)EnumFacing.values())).length;
            long llllllllllllIllllIlllIIllIlIIlIl = SetVisibility.lIlllIllIIllII[1];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIIIIIllIIllIllI((int)llllllllllllIllllIlllIIllIlIIlIl, (int)llllllllllllIllllIlllIIllIlIIlII)) {
                final EnumFacing llllllllllllIllllIlllIIllIlIlllI = llllllllllllIllllIlllIIllIlIIIll[llllllllllllIllllIlllIIllIlIIlIl];
                if (lIIIIIllIIlllIII(llllllllllllIllllIlllIIllIlIllll, llllllllllllIllllIlllIIllIlIlllI)) {
                    llllllllllllIllllIlllIIllIllIIIl.append(SetVisibility.lIlllIllIIlIll[SetVisibility.lIlllIllIIllII[1]]);
                    "".length();
                    "".length();
                    if (-" ".length() == ((185 + 150 - 247 + 118 ^ 8 + 173 - 167 + 184) & (0x71 ^ 0x1F ^ (0xF0 ^ 0x96) ^ -" ".length()))) {
                        return null;
                    }
                }
                else {
                    final boolean llllllllllllIllllIlllIIllIlIllIl = this.isVisible(llllllllllllIllllIlllIIllIlIllll, llllllllllllIllllIlllIIllIlIlllI);
                    final StringBuilder append = llllllllllllIllllIlllIIllIllIIIl.append((char)SetVisibility.lIlllIllIIllII[2]);
                    int c;
                    if (lIIIIIllIIlllIIl(llllllllllllIllllIlllIIllIlIllIl ? 1 : 0)) {
                        c = SetVisibility.lIlllIllIIllII[4];
                        "".length();
                        if ((0xE5 ^ 0x88 ^ (0xDE ^ 0xB7)) > (70 + 103 - 55 + 34 ^ 33 + 32 - 4 + 95)) {
                            return null;
                        }
                    }
                    else {
                        c = SetVisibility.lIlllIllIIllII[5];
                    }
                    append.append((char)c);
                    "".length();
                }
                ++llllllllllllIllllIlllIIllIlIIlIl;
            }
            llllllllllllIllllIlllIIllIllIIIl.append((char)SetVisibility.lIlllIllIIllII[3]);
            "".length();
            ++llllllllllllIllllIlllIIllIlIlIIl;
        }
        return String.valueOf(llllllllllllIllllIlllIIllIllIIIl);
    }
    
    private static boolean lIIIIIllIIlllIII(final Object llllllllllllIllllIlllIIllIIIlllI, final Object llllllllllllIllllIlllIIllIIIllIl) {
        return llllllllllllIllllIlllIIllIIIlllI == llllllllllllIllllIlllIIllIIIllIl;
    }
    
    static {
        lIIIIIllIIllIIll();
        lIIIIIllIIllIIlI();
        COUNT_FACES = EnumFacing.values().length;
    }
    
    public void setVisible(final EnumFacing llllllllllllIllllIlllIIlllIlIIll, final EnumFacing llllllllllllIllllIlllIIlllIIlllI, final boolean llllllllllllIllllIlllIIlllIIllIl) {
        this.bitSet.set(llllllllllllIllllIlllIIlllIlIIll.ordinal() + llllllllllllIllllIlllIIlllIIlllI.ordinal() * SetVisibility.COUNT_FACES, llllllllllllIllllIlllIIlllIIllIl);
        this.bitSet.set(llllllllllllIllllIlllIIlllIIlllI.ordinal() + llllllllllllIllllIlllIIlllIlIIll.ordinal() * SetVisibility.COUNT_FACES, llllllllllllIllllIlllIIlllIIllIl);
    }
}
