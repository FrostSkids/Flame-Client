// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state.pattern;

import java.util.Iterator;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.lang.reflect.Array;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.base.Joiner;
import net.minecraft.block.state.BlockWorldState;
import com.google.common.base.Predicate;
import java.util.Map;
import java.util.List;

public class FactoryBlockPattern
{
    private final /* synthetic */ List<String[]> depth;
    private final /* synthetic */ Map<Character, Predicate<BlockWorldState>> symbolMap;
    private static final /* synthetic */ String[] lIlIlIllIlIIIl;
    private static final /* synthetic */ int[] lIlIlIllIlIlII;
    private static final /* synthetic */ Joiner COMMA_JOIN;
    private /* synthetic */ int aisleHeight;
    private /* synthetic */ int rowWidth;
    
    public FactoryBlockPattern aisle(final String... lllllllllllllIIIIllllllIIIllIIll) {
        if (!lllIllllIlIlIll(ArrayUtils.isEmpty((Object[])lllllllllllllIIIIllllllIIIllIIll) ? 1 : 0) || !lllIllllIlIlIll(StringUtils.isEmpty((CharSequence)lllllllllllllIIIIllllllIIIllIIll[FactoryBlockPattern.lIlIlIllIlIlII[0]]) ? 1 : 0)) {
            throw new IllegalArgumentException(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[8]]);
        }
        if (lllIllllIlIllII(this.depth.isEmpty() ? 1 : 0)) {
            this.aisleHeight = lllllllllllllIIIIllllllIIIllIIll.length;
            this.rowWidth = lllllllllllllIIIIllllllIIIllIIll[FactoryBlockPattern.lIlIlIllIlIlII[0]].length();
        }
        if (lllIllllIlIllIl(lllllllllllllIIIIllllllIIIllIIll.length, this.aisleHeight)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[2]]).append(this.aisleHeight).append(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[3]]).append(lllllllllllllIIIIllllllIIIllIIll.length).append(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[4]])));
        }
        final String lllllllllllllIIIIllllllIIIlIllll = (Object)lllllllllllllIIIIllllllIIIllIIll;
        final float lllllllllllllIIIIllllllIIIllIIII = lllllllllllllIIIIllllllIIIllIIll.length;
        char lllllllllllllIIIIllllllIIIllIIIl = (char)FactoryBlockPattern.lIlIlIllIlIlII[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllIllllIlIlllI(lllllllllllllIIIIllllllIIIllIIIl, (int)lllllllllllllIIIIllllllIIIllIIII)) {
            final String lllllllllllllIIIIllllllIIIllIllI = lllllllllllllIIIIllllllIIIlIllll[lllllllllllllIIIIllllllIIIllIIIl];
            if (lllIllllIlIllIl(lllllllllllllIIIIllllllIIIllIllI.length(), this.rowWidth)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[5]]).append(this.rowWidth).append(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[6]]).append(lllllllllllllIIIIllllllIIIllIllI.length()).append(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[7]])));
            }
            final boolean lllllllllllllIIIIllllllIIIlIlIll;
            final long lllllllllllllIIIIllllllIIIlIllII = ((char[])(Object)(lllllllllllllIIIIllllllIIIlIlIll = (boolean)(Object)lllllllllllllIIIIllllllIIIllIllI.toCharArray())).length;
            boolean lllllllllllllIIIIllllllIIIlIllIl = FactoryBlockPattern.lIlIlIllIlIlII[0] != 0;
            "".length();
            if (-" ".length() > ((0xFD ^ 0xC5 ^ (0x3C ^ 0x54)) & (0x25 ^ 0x3E ^ (0x71 ^ 0x3A) ^ -" ".length()) & (((0xC2 ^ 0x91 ^ (0x10 ^ 0x54)) & (0x8B ^ 0xB2 ^ (0x4C ^ 0x62) ^ -" ".length())) ^ -" ".length()))) {
                return null;
            }
            while (!lllIllllIlIlllI(lllllllllllllIIIIllllllIIIlIllIl ? 1 : 0, (int)lllllllllllllIIIIllllllIIIlIllII)) {
                final char lllllllllllllIIIIllllllIIIllIlIl = lllllllllllllIIIIllllllIIIlIlIll[lllllllllllllIIIIllllllIIIlIllIl];
                if (lllIllllIlIlIll(this.symbolMap.containsKey(lllllllllllllIIIIllllllIIIllIlIl) ? 1 : 0)) {
                    this.symbolMap.put(lllllllllllllIIIIllllllIIIllIlIl, null);
                    "".length();
                }
                ++lllllllllllllIIIIllllllIIIlIllIl;
            }
            ++lllllllllllllIIIIllllllIIIllIIIl;
        }
        this.depth.add(lllllllllllllIIIIllllllIIIllIIll);
        "".length();
        return this;
    }
    
    public FactoryBlockPattern where(final char lllllllllllllIIIIllllllIIIlIIllI, final Predicate<BlockWorldState> lllllllllllllIIIIllllllIIIlIIlIl) {
        this.symbolMap.put(lllllllllllllIIIIllllllIIIlIIllI, lllllllllllllIIIIllllllIIIlIIlIl);
        "".length();
        return this;
    }
    
    static {
        lllIllllIlIlIlI();
        lllIllllIlIIIlI();
        COMMA_JOIN = Joiner.on(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[0]]);
    }
    
    private static boolean lllIllllIlIlllI(final int lllllllllllllIIIIlllllIlllIlIIII, final int lllllllllllllIIIIlllllIlllIIllll) {
        return lllllllllllllIIIIlllllIlllIlIIII >= lllllllllllllIIIIlllllIlllIIllll;
    }
    
    private static void lllIllllIlIIIlI() {
        (lIlIlIllIlIIIl = new String[FactoryBlockPattern.lIlIlIllIlIlII[11]])[FactoryBlockPattern.lIlIlIllIlIlII[0]] = lllIllllIIlllIl("FIf08X47JDA=", "DDXpw");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[2]] = lllIllllIIllllI("IzQYDTsSKQxIOQ8/BA14ESUcAHgOKQEPMBJsBw54", "fLhhX");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[3]] = lllIllllIIlllll("ZcrRFa8IhzjQqbd+xOKA2WF9nLfIQrS8C8NsyvSlxEQ6Dnvvx8P/QA==", "AaSeP");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[4]] = lllIllllIIllllI("XA==", "uhXiC");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[5]] = lllIllllIIllllI("HhgSTio8G0YcJCcERgclcAMOC2s3HhALJXAWDx0nNVcHHC5wAw4LazMYFBwuMwNGGSI0Aw5OYzUPFgsoJBICTg==", "PwfnK");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[6]] = lllIllllIIllllI("b20pNSItKW81OSZtODMjK20=", "CMOZW");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[7]] = lllIllllIIlllIl("ajf5NTr1WkY=", "eyJDx");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[8]] = lllIllllIIlllIl("ed+/QUhp3jT78CV1XKXklCBFOAmWwgrs", "jBWpo");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[9]] = lllIllllIIllllI("BjcuAgA1JD8DGnYjJBRJNS0qFAg1MS4UQSVsaw==", "VEKfi");
        FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[10]] = lllIllllIIllllI("QgwVPEEPBBQqCAwK", "bmgYa");
    }
    
    private Predicate<BlockWorldState>[][][] makePredicateArray() {
        this.checkMissingPredicates();
        final Class<Predicate> componentType = Predicate.class;
        final int[] dimensions = new int[FactoryBlockPattern.lIlIlIllIlIlII[4]];
        dimensions[FactoryBlockPattern.lIlIlIllIlIlII[0]] = this.depth.size();
        dimensions[FactoryBlockPattern.lIlIlIllIlIlII[2]] = this.aisleHeight;
        dimensions[FactoryBlockPattern.lIlIlIllIlIlII[3]] = this.rowWidth;
        final Predicate[][][] lllllllllllllIIIIllllllIIIIllIII = (Predicate[][][])Array.newInstance(componentType, dimensions);
        int lllllllllllllIIIIllllllIIIIlIlll = FactoryBlockPattern.lIlIlIllIlIlII[0];
        "".length();
        if ("  ".length() > (0x2E ^ 0x15 ^ (0x0 ^ 0x3F))) {
            return null;
        }
        while (!lllIllllIlIlllI(lllllllllllllIIIIllllllIIIIlIlll, this.depth.size())) {
            int lllllllllllllIIIIllllllIIIIlIllI = FactoryBlockPattern.lIlIlIllIlIlII[0];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lllIllllIlIlllI(lllllllllllllIIIIllllllIIIIlIllI, this.aisleHeight)) {
                int lllllllllllllIIIIllllllIIIIlIlIl = FactoryBlockPattern.lIlIlIllIlIlII[0];
                "".length();
                if ((50 + 133 - 16 + 11 ^ 26 + 32 - 14 + 139) == 0x0) {
                    return null;
                }
                while (!lllIllllIlIlllI(lllllllllllllIIIIllllllIIIIlIlIl, this.rowWidth)) {
                    lllllllllllllIIIIllllllIIIIllIII[lllllllllllllIIIIllllllIIIIlIlll][lllllllllllllIIIIllllllIIIIlIllI][lllllllllllllIIIIllllllIIIIlIlIl] = this.symbolMap.get(this.depth.get(lllllllllllllIIIIllllllIIIIlIlll)[lllllllllllllIIIIllllllIIIIlIllI].charAt(lllllllllllllIIIIllllllIIIIlIlIl));
                    ++lllllllllllllIIIIllllllIIIIlIlIl;
                }
                ++lllllllllllllIIIIllllllIIIIlIllI;
            }
            ++lllllllllllllIIIIllllllIIIIlIlll;
        }
        return (Predicate<BlockWorldState>[][][])lllllllllllllIIIIllllllIIIIllIII;
    }
    
    private static String lllIllllIIlllIl(final String lllllllllllllIIIIlllllIlllllIIII, final String lllllllllllllIIIIlllllIllllIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllllIlllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllllIllllIllIl.getBytes(StandardCharsets.UTF_8)), FactoryBlockPattern.lIlIlIllIlIlII[9]), "DES");
            final Cipher lllllllllllllIIIIlllllIlllllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIlllllIlllllIIlI.init(FactoryBlockPattern.lIlIlIllIlIlII[3], lllllllllllllIIIIlllllIlllllIIll);
            return new String(lllllllllllllIIIIlllllIlllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllllIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllllIlllllIIIl) {
            lllllllllllllIIIIlllllIlllllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIllllIlIlIll(final int lllllllllllllIIIIlllllIlllIIIlIl) {
        return lllllllllllllIIIIlllllIlllIIIlIl == 0;
    }
    
    public static FactoryBlockPattern start() {
        return new FactoryBlockPattern();
    }
    
    private void checkMissingPredicates() {
        final List<Character> lllllllllllllIIIIllllllIIIIIlIlI = (List<Character>)Lists.newArrayList();
        final char lllllllllllllIIIIllllllIIIIIIlIl = (char)this.symbolMap.entrySet().iterator();
        "".length();
        if ("  ".length() > "  ".length()) {
            return;
        }
        while (!lllIllllIlIlIll(((Iterator)lllllllllllllIIIIllllllIIIIIIlIl).hasNext() ? 1 : 0)) {
            final Map.Entry<Character, Predicate<BlockWorldState>> lllllllllllllIIIIllllllIIIIIlIIl = ((Iterator<Map.Entry<Character, Predicate<BlockWorldState>>>)lllllllllllllIIIIllllllIIIIIIlIl).next();
            if (lllIllllIlIllll(lllllllllllllIIIIllllllIIIIIlIIl.getValue())) {
                lllllllllllllIIIIllllllIIIIIlIlI.add(lllllllllllllIIIIllllllIIIIIlIIl.getKey());
                "".length();
            }
        }
        if (lllIllllIlIlIll(lllllllllllllIIIIllllllIIIIIlIlI.isEmpty() ? 1 : 0)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[9]]).append(FactoryBlockPattern.COMMA_JOIN.join((Iterable)lllllllllllllIIIIllllllIIIIIlIlI)).append(FactoryBlockPattern.lIlIlIllIlIIIl[FactoryBlockPattern.lIlIlIllIlIlII[10]])));
        }
    }
    
    private static boolean lllIllllIlIllII(final int lllllllllllllIIIIlllllIlllIIIlll) {
        return lllllllllllllIIIIlllllIlllIIIlll != 0;
    }
    
    private static void lllIllllIlIlIlI() {
        (lIlIlIllIlIlII = new int[12])[0] = ((0x91 ^ 0x85) & ~(0x8F ^ 0x9B));
        FactoryBlockPattern.lIlIlIllIlIlII[1] = (0xC ^ 0x2C);
        FactoryBlockPattern.lIlIlIllIlIlII[2] = " ".length();
        FactoryBlockPattern.lIlIlIllIlIlII[3] = "  ".length();
        FactoryBlockPattern.lIlIlIllIlIlII[4] = "   ".length();
        FactoryBlockPattern.lIlIlIllIlIlII[5] = (122 + 166 - 134 + 21 ^ 143 + 88 - 142 + 82);
        FactoryBlockPattern.lIlIlIllIlIlII[6] = (0x82 ^ 0x87);
        FactoryBlockPattern.lIlIlIllIlIlII[7] = (0x4E ^ 0x2B ^ (0x31 ^ 0x52));
        FactoryBlockPattern.lIlIlIllIlIlII[8] = (0x6B ^ 0x6C);
        FactoryBlockPattern.lIlIlIllIlIlII[9] = (3 + 108 + 28 + 39 ^ 39 + 37 - 20 + 130);
        FactoryBlockPattern.lIlIlIllIlIlII[10] = (0x5F ^ 0x56);
        FactoryBlockPattern.lIlIlIllIlIlII[11] = ("   ".length() ^ (0x54 ^ 0x5D));
    }
    
    private FactoryBlockPattern() {
        this.depth = (List<String[]>)Lists.newArrayList();
        this.symbolMap = (Map<Character, Predicate<BlockWorldState>>)Maps.newHashMap();
        this.symbolMap.put((char)FactoryBlockPattern.lIlIlIllIlIlII[1], (Predicate<BlockWorldState>)Predicates.alwaysTrue());
        "".length();
    }
    
    private static String lllIllllIIlllll(final String lllllllllllllIIIIlllllIllllllIll, final String lllllllllllllIIIIlllllIlllllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllllIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllllIlllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlllllIlllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlllllIlllllllll.init(FactoryBlockPattern.lIlIlIllIlIlII[3], lllllllllllllIIIIllllllIIIIIIIII);
            return new String(lllllllllllllIIIIlllllIlllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllllIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllllIllllllllI) {
            lllllllllllllIIIIlllllIllllllllI.printStackTrace();
            return null;
        }
    }
    
    private static String lllIllllIIllllI(String lllllllllllllIIIIlllllIlllIllIll, final String lllllllllllllIIIIlllllIlllIllIlI) {
        lllllllllllllIIIIlllllIlllIllIll = new String(Base64.getDecoder().decode(lllllllllllllIIIIlllllIlllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllllIlllIllllI = new StringBuilder();
        final char[] lllllllllllllIIIIlllllIlllIlllIl = lllllllllllllIIIIlllllIlllIllIlI.toCharArray();
        int lllllllllllllIIIIlllllIlllIlllII = FactoryBlockPattern.lIlIlIllIlIlII[0];
        final long lllllllllllllIIIIlllllIlllIlIllI = (Object)lllllllllllllIIIIlllllIlllIllIll.toCharArray();
        final short lllllllllllllIIIIlllllIlllIlIlIl = (short)lllllllllllllIIIIlllllIlllIlIllI.length;
        Exception lllllllllllllIIIIlllllIlllIlIlII = (Exception)FactoryBlockPattern.lIlIlIllIlIlII[0];
        while (lllIllllIllIIII((int)lllllllllllllIIIIlllllIlllIlIlII, lllllllllllllIIIIlllllIlllIlIlIl)) {
            final char lllllllllllllIIIIlllllIllllIIIIl = lllllllllllllIIIIlllllIlllIlIllI[lllllllllllllIIIIlllllIlllIlIlII];
            lllllllllllllIIIIlllllIlllIllllI.append((char)(lllllllllllllIIIIlllllIllllIIIIl ^ lllllllllllllIIIIlllllIlllIlllIl[lllllllllllllIIIIlllllIlllIlllII % lllllllllllllIIIIlllllIlllIlllIl.length]));
            "".length();
            ++lllllllllllllIIIIlllllIlllIlllII;
            ++lllllllllllllIIIIlllllIlllIlIlII;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllllIlllIllllI);
    }
    
    private static boolean lllIllllIlIllIl(final int lllllllllllllIIIIlllllIlllIIIIlI, final int lllllllllllllIIIIlllllIlllIIIIIl) {
        return lllllllllllllIIIIlllllIlllIIIIlI != lllllllllllllIIIIlllllIlllIIIIIl;
    }
    
    private static boolean lllIllllIllIIII(final int lllllllllllllIIIIlllllIlllIIllII, final int lllllllllllllIIIIlllllIlllIIlIll) {
        return lllllllllllllIIIIlllllIlllIIllII < lllllllllllllIIIIlllllIlllIIlIll;
    }
    
    public BlockPattern build() {
        return new BlockPattern(this.makePredicateArray());
    }
    
    private static boolean lllIllllIlIllll(final Object lllllllllllllIIIIlllllIlllIIlIIl) {
        return lllllllllllllIIIIlllllIlllIIlIIl == null;
    }
}
