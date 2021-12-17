// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.crash;

import java.util.Iterator;
import net.minecraft.block.state.IBlockState;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.collect.Lists;
import java.util.List;

public class CrashReportCategory
{
    private final /* synthetic */ String name;
    private static final /* synthetic */ int[] llllIllIlIlll;
    private final /* synthetic */ CrashReport crashReport;
    private final /* synthetic */ List<Entry> children;
    private /* synthetic */ StackTraceElement[] stackTrace;
    private static final /* synthetic */ String[] llllIllIlIlIl;
    
    public CrashReportCategory(final CrashReport lllllllllllllIlIllIlIIIIlIIIIIIl, final String lllllllllllllIlIllIlIIIIlIIIIIII) {
        this.children = (List<Entry>)Lists.newArrayList();
        this.stackTrace = new StackTraceElement[CrashReportCategory.llllIllIlIlll[0]];
        this.crashReport = lllllllllllllIlIllIlIIIIlIIIIIIl;
        this.name = lllllllllllllIlIllIlIIIIlIIIIIII;
    }
    
    private static void lIlIlIllIllIlIl() {
        (llllIllIlIlll = new int[22])[0] = ((0x6A ^ 0x20) & ~(0xE9 ^ 0xA3));
        CrashReportCategory.llllIllIlIlll[1] = (0x61 ^ 0x65);
        CrashReportCategory.llllIllIlIlll[2] = " ".length();
        CrashReportCategory.llllIllIlIlll[3] = "  ".length();
        CrashReportCategory.llllIllIlIlll[4] = "   ".length();
        CrashReportCategory.llllIllIlIlll[5] = (0x57 ^ 0x3A ^ (0x13 ^ 0x71));
        CrashReportCategory.llllIllIlIlll[6] = (0x1E ^ 0x17);
        CrashReportCategory.llllIllIlIlll[7] = (0x11 ^ 0x3B ^ (0x31 ^ 0x1E));
        CrashReportCategory.llllIllIlIlll[8] = (116 + 59 - 152 + 116 ^ 62 + 127 - 107 + 59);
        CrashReportCategory.llllIllIlIlll[9] = (0x67 ^ 0x7 ^ (0xD1 ^ 0xB6));
        CrashReportCategory.llllIllIlIlll[10] = (0xA0 ^ 0xB8 ^ (0x44 ^ 0x54));
        CrashReportCategory.llllIllIlIlll[11] = (57 + 110 - 87 + 74 ^ 2 + 7 + 100 + 35);
        CrashReportCategory.llllIllIlIlll[12] = (0xC2 ^ 0xC4 ^ (0x86 ^ 0x8B));
        CrashReportCategory.llllIllIlIlll[13] = (0x24 ^ 0x6D ^ (0xC0 ^ 0x85));
        CrashReportCategory.llllIllIlIlll[14] = (0x8A ^ 0xBB ^ (0x9B ^ 0xA7));
        CrashReportCategory.llllIllIlIlll[15] = (119 + 170 - 140 + 37 ^ 24 + 14 + 64 + 78);
        CrashReportCategory.llllIllIlIlll[16] = (79 + 70 - 147 + 130 ^ 10 + 21 + 73 + 44);
        CrashReportCategory.llllIllIlIlll[17] = (0x2 ^ 0x13);
        CrashReportCategory.llllIllIlIlll[18] = (0x69 ^ 0x7B);
        CrashReportCategory.llllIllIlIlll[19] = (0x1C ^ 0xF);
        CrashReportCategory.llllIllIlIlll[20] = (0x6F ^ 0x16 ^ (0xC6 ^ 0xAB));
        CrashReportCategory.llllIllIlIlll[21] = (54 + 197 - 77 + 39 ^ 119 + 155 - 168 + 86);
    }
    
    private static boolean lIlIlIllIllIlll(final int lllllllllllllIlIllIIlllllIIIlllI) {
        return lllllllllllllIlIllIIlllllIIIlllI != 0;
    }
    
    private static String lIlIlIllIlIllIl(String lllllllllllllIlIllIIlllllIllIlll, final String lllllllllllllIlIllIIlllllIlllIll) {
        lllllllllllllIlIllIIlllllIllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIlllllIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIlllllIlllIlI = new StringBuilder();
        final char[] lllllllllllllIlIllIIlllllIlllIIl = lllllllllllllIlIllIIlllllIlllIll.toCharArray();
        int lllllllllllllIlIllIIlllllIlllIII = CrashReportCategory.llllIllIlIlll[0];
        final float lllllllllllllIlIllIIlllllIllIIlI = (Object)lllllllllllllIlIllIIlllllIllIlll.toCharArray();
        final char lllllllllllllIlIllIIlllllIllIIIl = (char)lllllllllllllIlIllIIlllllIllIIlI.length;
        boolean lllllllllllllIlIllIIlllllIllIIII = CrashReportCategory.llllIllIlIlll[0] != 0;
        while (lIlIlIllIllllll(lllllllllllllIlIllIIlllllIllIIII ? 1 : 0, lllllllllllllIlIllIIlllllIllIIIl)) {
            final char lllllllllllllIlIllIIlllllIllllIl = lllllllllllllIlIllIIlllllIllIIlI[lllllllllllllIlIllIIlllllIllIIII];
            lllllllllllllIlIllIIlllllIlllIlI.append((char)(lllllllllllllIlIllIIlllllIllllIl ^ lllllllllllllIlIllIIlllllIlllIIl[lllllllllllllIlIllIIlllllIlllIII % lllllllllllllIlIllIIlllllIlllIIl.length]));
            "".length();
            ++lllllllllllllIlIllIIlllllIlllIII;
            ++lllllllllllllIlIllIIlllllIllIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIlllllIlllIlI);
    }
    
    public boolean firstTwoElementsOfStackTraceMatch(final StackTraceElement lllllllllllllIlIllIlIIIIIIIIlIlI, final StackTraceElement lllllllllllllIlIllIlIIIIIIIIllIl) {
        if (!lIlIlIllIllIlll(this.stackTrace.length) || !lIlIlIllIlllIII(lllllllllllllIlIllIlIIIIIIIIlIlI)) {
            return CrashReportCategory.llllIllIlIlll[0] != 0;
        }
        final StackTraceElement lllllllllllllIlIllIlIIIIIIIIllII = this.stackTrace[CrashReportCategory.llllIllIlIlll[0]];
        if (!lIlIlIllIlllIIl(lllllllllllllIlIllIlIIIIIIIIllII.isNativeMethod() ? 1 : 0, lllllllllllllIlIllIlIIIIIIIIlIlI.isNativeMethod() ? 1 : 0) || !lIlIlIllIllIlll(lllllllllllllIlIllIlIIIIIIIIllII.getClassName().equals(lllllllllllllIlIllIlIIIIIIIIlIlI.getClassName()) ? 1 : 0) || !lIlIlIllIllIlll(lllllllllllllIlIllIlIIIIIIIIllII.getFileName().equals(lllllllllllllIlIllIlIIIIIIIIlIlI.getFileName()) ? 1 : 0) || !lIlIlIllIllIlll(lllllllllllllIlIllIlIIIIIIIIllII.getMethodName().equals(lllllllllllllIlIllIlIIIIIIIIlIlI.getMethodName()) ? 1 : 0)) {
            return CrashReportCategory.llllIllIlIlll[0] != 0;
        }
        int lllllllllllllIlIllIIlllllIIIIlIl;
        if (lIlIlIllIlllIII(lllllllllllllIlIllIlIIIIIIIIllIl)) {
            lllllllllllllIlIllIIlllllIIIIlIl = CrashReportCategory.llllIllIlIlll[2];
            "".length();
            if (((0x19 ^ 0x11) & ~(0x9E ^ 0x96) & ~((0x1A ^ 0x51) & ~(0x51 ^ 0x1A)) & ~((0xEA ^ 0xAD) & ~(0xD7 ^ 0x90)) & ~((0x79 ^ 0x69) & ~(0x6F ^ 0x7F))) != 0x0) {
                return ((0x9 ^ 0x3A) & ~(0x66 ^ 0x55)) != 0x0;
            }
        }
        else {
            lllllllllllllIlIllIIlllllIIIIlIl = CrashReportCategory.llllIllIlIlll[0];
        }
        int lllllllllllllIlIllIIlllllIIIIlII;
        if (lIlIlIllIlllIlI(this.stackTrace.length, CrashReportCategory.llllIllIlIlll[2])) {
            lllllllllllllIlIllIIlllllIIIIlII = CrashReportCategory.llllIllIlIlll[2];
            "".length();
            if (" ".length() < ((0x7E ^ 0x45 ^ (0x81 ^ 0xA2)) & (0xC2 ^ 0x90 ^ (0x6F ^ 0x25) ^ -" ".length()))) {
                return ((0x86 ^ 0xBB ^ (0x8C ^ 0xB5)) & (0x64 ^ 0x24 ^ (0xFC ^ 0xB8) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIlIllIIlllllIIIIlII = CrashReportCategory.llllIllIlIlll[0];
        }
        if (lIlIlIllIlllIll(lllllllllllllIlIllIIlllllIIIIlIl, lllllllllllllIlIllIIlllllIIIIlII)) {
            return CrashReportCategory.llllIllIlIlll[0] != 0;
        }
        if (lIlIlIllIlllIII(lllllllllllllIlIllIlIIIIIIIIllIl) && lIlIlIllIllllII(this.stackTrace[CrashReportCategory.llllIllIlIlll[2]].equals(lllllllllllllIlIllIlIIIIIIIIllIl) ? 1 : 0)) {
            return CrashReportCategory.llllIllIlIlll[0] != 0;
        }
        this.stackTrace[CrashReportCategory.llllIllIlIlll[0]] = lllllllllllllIlIllIlIIIIIIIIlIlI;
        return CrashReportCategory.llllIllIlIlll[2] != 0;
    }
    
    public static void addBlockInfo(final CrashReportCategory lllllllllllllIlIllIIlllllllIIIIl, final BlockPos lllllllllllllIlIllIIlllllllIIlIl, final Block lllllllllllllIlIllIIllllllIlllll, final int lllllllllllllIlIllIIllllllIllllI) {
        final int lllllllllllllIlIllIIlllllllIIIlI = Block.getIdFromBlock(lllllllllllllIlIllIIllllllIlllll);
        lllllllllllllIlIllIIlllllllIIIIl.addCrashSectionCallable(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[16]], new Callable<String>() {
            private static final /* synthetic */ int[] lIllIIllIIlIlI;
            private static final /* synthetic */ String[] lIllIIllIIlIIl;
            
            static {
                lllllIlIlIIllII();
                lllllIlIlIIlIll();
            }
            
            private static void lllllIlIlIIllII() {
                (lIllIIllIIlIlI = new int[5])[0] = ((34 + 21 - 24 + 109 ^ 142 + 26 - 51 + 42) & (69 + 153 - 198 + 189 ^ 77 + 191 - 258 + 188 ^ -" ".length()));
                CrashReportCategory$1.lIllIIllIIlIlI[1] = "   ".length();
                CrashReportCategory$1.lIllIIllIIlIlI[2] = " ".length();
                CrashReportCategory$1.lIllIIllIIlIlI[3] = "  ".length();
                CrashReportCategory$1.lIllIIllIIlIlI[4] = (0x4B ^ 0x43);
            }
            
            private static String lllllIlIlIIlIlI(final String lllllllllllllIIIIIIllIlIIIIIlIIl, final String lllllllllllllIIIIIIllIlIIIIIlIII) {
                try {
                    final SecretKeySpec lllllllllllllIIIIIIllIlIIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), CrashReportCategory$1.lIllIIllIIlIlI[4]), "DES");
                    final Cipher lllllllllllllIIIIIIllIlIIIIIlIll = Cipher.getInstance("DES");
                    lllllllllllllIIIIIIllIlIIIIIlIll.init(CrashReportCategory$1.lIllIIllIIlIlI[3], lllllllllllllIIIIIIllIlIIIIIllII);
                    return new String(lllllllllllllIIIIIIllIlIIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIIIllIlIIIIIlIlI) {
                    lllllllllllllIIIIIIllIlIIIIIlIlI.printStackTrace();
                    return null;
                }
            }
            
            private static void lllllIlIlIIlIll() {
                (lIllIIllIIlIIl = new String[CrashReportCategory$1.lIllIIllIIlIlI[3]])[CrashReportCategory$1.lIllIIllIIlIlI[0]] = lllllIlIlIIlIII("HfWJw4nnH6TnHRVMaHvX7ModC17rs4/D", "RQvxL");
                CrashReportCategory$1.lIllIIllIIlIIl[CrashReportCategory$1.lIllIIllIIlIlI[2]] = lllllIlIlIIlIlI("oed5uT/aay4=", "gviDw");
            }
            
            private static String lllllIlIlIIlIII(final String lllllllllllllIIIIIIllIIlllllllII, final String lllllllllllllIIIIIIllIIllllllIIl) {
                try {
                    final SecretKeySpec lllllllllllllIIIIIIllIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIIllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIIIIIllIIllllllllI = Cipher.getInstance("Blowfish");
                    lllllllllllllIIIIIIllIIllllllllI.init(CrashReportCategory$1.lIllIIllIIlIlI[3], lllllllllllllIIIIIIllIIlllllllll);
                    return new String(lllllllllllllIIIIIIllIIllllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIIlllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIIIllIIlllllllIl) {
                    lllllllllllllIIIIIIllIIlllllllIl.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String call() throws Exception {
                try {
                    final String format = CrashReportCategory$1.lIllIIllIIlIIl[CrashReportCategory$1.lIllIIllIIlIlI[0]];
                    final Object[] args = new Object[CrashReportCategory$1.lIllIIllIIlIlI[1]];
                    args[CrashReportCategory$1.lIllIIllIIlIlI[0]] = lllllllllllllIlIllIIlllllllIIIlI;
                    args[CrashReportCategory$1.lIllIIllIIlIlI[2]] = lllllllllllllIlIllIIllllllIlllll.getUnlocalizedName();
                    args[CrashReportCategory$1.lIllIIllIIlIlI[3]] = lllllllllllllIlIllIIllllllIlllll.getClass().getCanonicalName();
                    return String.format(format, args);
                }
                catch (Throwable lllllllllllllIIIIIIllIlIIIIlIlIl) {
                    return String.valueOf(new StringBuilder(CrashReportCategory$1.lIllIIllIIlIIl[CrashReportCategory$1.lIllIIllIIlIlI[2]]).append(lllllllllllllIlIllIIlllllllIIIlI));
                }
            }
        });
        lllllllllllllIlIllIIlllllllIIIIl.addCrashSectionCallable(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[17]], new Callable<String>() {
            private static final /* synthetic */ int[] lllIlIIllllIll;
            private static final /* synthetic */ String[] lllIlIIllllIIl;
            
            private static void lIlIIIlIlIIlIIll() {
                (lllIlIIllllIll = new int[8])[0] = ((((0x29 ^ 0x30) & ~(0xB ^ 0x12)) ^ (0x12 ^ 0x3F)) & (75 + 78 - 31 + 28 ^ 9 + 113 + 7 + 58 ^ -" ".length()));
                CrashReportCategory$2.lllIlIIllllIll[1] = " ".length();
                CrashReportCategory$2.lllIlIIllllIll[2] = "  ".length();
                CrashReportCategory$2.lllIlIIllllIll[3] = "   ".length();
                CrashReportCategory$2.lllIlIIllllIll[4] = (0x70 ^ 0x1E ^ (0x4 ^ 0x6E));
                CrashReportCategory$2.lllIlIIllllIll[5] = (0xAA ^ 0xAF);
                CrashReportCategory$2.lllIlIIllllIll[6] = (0xEC ^ 0xB6 ^ (0x69 ^ 0x35));
                CrashReportCategory$2.lllIlIIllllIll[7] = (62 + 116 - 119 + 96 ^ 93 + 106 - 119 + 67);
            }
            
            @Override
            public String call() throws Exception {
                if (lIlIIIlIlIIlIlII(lllllllllllllIlIllIIllllllIllllI)) {
                    return String.valueOf(new StringBuilder(CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[0]]).append(lllllllllllllIlIllIIllllllIllllI).append(CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[1]]));
                }
                final String format = CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[2]];
                final Object[] args = new Object[CrashReportCategory$2.lllIlIIllllIll[1]];
                args[CrashReportCategory$2.lllIlIIllllIll[0]] = Integer.toBinaryString(lllllllllllllIlIllIIllllllIllllI);
                final String llllllllllllIlIllIlllIIIllllllII = String.format(format, args).replace(CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[3]], CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[4]]);
                final String format2 = CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[5]];
                final Object[] args2 = new Object[CrashReportCategory$2.lllIlIIllllIll[2]];
                args2[CrashReportCategory$2.lllIlIIllllIll[0]] = lllllllllllllIlIllIIllllllIllllI;
                args2[CrashReportCategory$2.lllIlIIllllIll[1]] = llllllllllllIlIllIlllIIIllllllII;
                return String.format(format2, args2);
            }
            
            private static boolean lIlIIIlIlIIlIlII(final int llllllllllllIlIllIlllIIIllIIIIII) {
                return llllllllllllIlIllIlllIIIllIIIIII < 0;
            }
            
            private static String lIlIIIlIlIIIlIll(final String llllllllllllIlIllIlllIIIlllIIIIl, final String llllllllllllIlIllIlllIIIlllIIIII) {
                try {
                    final SecretKeySpec llllllllllllIlIllIlllIIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlIllIlllIIIlllIIlIl = Cipher.getInstance("Blowfish");
                    llllllllllllIlIllIlllIIIlllIIlIl.init(CrashReportCategory$2.lllIlIIllllIll[2], llllllllllllIlIllIlllIIIlllIIllI);
                    return new String(llllllllllllIlIllIlllIIIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIlllIIIlllIIlII) {
                    llllllllllllIlIllIlllIIIlllIIlII.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIlIIIlIlIIlIIll();
                lIlIIIlIlIIlIIlI();
            }
            
            private static String lIlIIIlIlIIlIIII(final String llllllllllllIlIllIlllIIIlllIlllI, final String llllllllllllIlIllIlllIIIlllIllIl) {
                try {
                    final SecretKeySpec llllllllllllIlIllIlllIIIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIIIlllIllIl.getBytes(StandardCharsets.UTF_8)), CrashReportCategory$2.lllIlIIllllIll[7]), "DES");
                    final Cipher llllllllllllIlIllIlllIIIllllIIlI = Cipher.getInstance("DES");
                    llllllllllllIlIllIlllIIIllllIIlI.init(CrashReportCategory$2.lllIlIIllllIll[2], llllllllllllIlIllIlllIIIllllIIll);
                    return new String(llllllllllllIlIllIlllIIIllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIlllIIIllllIIIl) {
                    llllllllllllIlIllIlllIIIllllIIIl.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIIlIlIIlIIlI() {
                (lllIlIIllllIIl = new String[CrashReportCategory$2.lllIlIIllllIll[6]])[CrashReportCategory$2.lllIlIIllllIll[0]] = lIlIIIlIlIIIlIll("sILGEIoeCpS6TH89l1VbHw==", "ZUZbp");
                CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[1]] = lIlIIIlIlIIIlIll("hSKO4cWqqJE=", "VNUJa");
                CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[2]] = lIlIIIlIlIIlIIII("JKnrntfzX6A=", "KqlIl");
                CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[3]] = lIlIIIlIlIIlIIII("96XuLxSaMes=", "VGJyF");
                CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[4]] = lIlIIIlIlIIlIIII("JJ2fz99gSmM=", "QPmNA");
                CrashReportCategory$2.lllIlIIllllIIl[CrashReportCategory$2.lllIlIIllllIll[5]] = lIlIIIlIlIIlIIIl("V0d3PEldVmMgTENSC3hGUkYxfVtWBQ==", "rvSXi");
            }
            
            private static boolean lIlIIIlIlIIlIlIl(final int llllllllllllIlIllIlllIIIllIIIIll, final int llllllllllllIlIllIlllIIIllIIIIlI) {
                return llllllllllllIlIllIlllIIIllIIIIll < llllllllllllIlIllIlllIIIllIIIIlI;
            }
            
            private static String lIlIIIlIlIIlIIIl(String llllllllllllIlIllIlllIIIllIIlllI, final String llllllllllllIlIllIlllIIIllIIllIl) {
                llllllllllllIlIllIlllIIIllIIlllI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIlllIIIllIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIllIlllIIIllIlIIIl = new StringBuilder();
                final char[] llllllllllllIlIllIlllIIIllIlIIII = llllllllllllIlIllIlllIIIllIIllIl.toCharArray();
                int llllllllllllIlIllIlllIIIllIIllll = CrashReportCategory$2.lllIlIIllllIll[0];
                final long llllllllllllIlIllIlllIIIllIIlIIl = (Object)((String)llllllllllllIlIllIlllIIIllIIlllI).toCharArray();
                final char llllllllllllIlIllIlllIIIllIIlIII = (char)llllllllllllIlIllIlllIIIllIIlIIl.length;
                double llllllllllllIlIllIlllIIIllIIIlll = CrashReportCategory$2.lllIlIIllllIll[0];
                while (lIlIIIlIlIIlIlIl((int)llllllllllllIlIllIlllIIIllIIIlll, llllllllllllIlIllIlllIIIllIIlIII)) {
                    final char llllllllllllIlIllIlllIIIllIlIlII = llllllllllllIlIllIlllIIIllIIlIIl[llllllllllllIlIllIlllIIIllIIIlll];
                    llllllllllllIlIllIlllIIIllIlIIIl.append((char)(llllllllllllIlIllIlllIIIllIlIlII ^ llllllllllllIlIllIlllIIIllIlIIII[llllllllllllIlIllIlllIIIllIIllll % llllllllllllIlIllIlllIIIllIlIIII.length]));
                    "".length();
                    ++llllllllllllIlIllIlllIIIllIIllll;
                    ++llllllllllllIlIllIlllIIIllIIIlll;
                    "".length();
                    if (-(0x5D ^ 0x59) > 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIllIlllIIIllIlIIIl);
            }
        });
        lllllllllllllIlIllIIlllllllIIIIl.addCrashSectionCallable(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[18]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return CrashReportCategory.getCoordinateInfo(lllllllllllllIlIllIIlllllllIIlIl);
            }
        });
    }
    
    private static boolean lIlIlIllIlllIIl(final int lllllllllllllIlIllIIlllllIIlllll, final int lllllllllllllIlIllIIlllllIIllllI) {
        return lllllllllllllIlIllIIlllllIIlllll == lllllllllllllIlIllIIlllllIIllllI;
    }
    
    private static boolean lIlIlIllIlllIlI(final int lllllllllllllIlIllIIlllllIIlIIll, final int lllllllllllllIlIllIIlllllIIlIIlI) {
        return lllllllllllllIlIllIIlllllIIlIIll > lllllllllllllIlIllIIlllllIIlIIlI;
    }
    
    public int getPrunedStackTrace(final int lllllllllllllIlIllIlIIIIIIIllIII) {
        final StackTraceElement[] lllllllllllllIlIllIlIIIIIIIlIlll = Thread.currentThread().getStackTrace();
        if (lIlIlIllIllIllI(lllllllllllllIlIllIlIIIIIIIlIlll.length)) {
            return CrashReportCategory.llllIllIlIlll[0];
        }
        this.stackTrace = new StackTraceElement[lllllllllllllIlIllIlIIIIIIIlIlll.length - CrashReportCategory.llllIllIlIlll[4] - lllllllllllllIlIllIlIIIIIIIllIII];
        System.arraycopy(lllllllllllllIlIllIlIIIIIIIlIlll, CrashReportCategory.llllIllIlIlll[4] + lllllllllllllIlIllIlIIIIIIIllIII, this.stackTrace, CrashReportCategory.llllIllIlIlll[0], this.stackTrace.length);
        return this.stackTrace.length;
    }
    
    public void appendToStringBuilder(final StringBuilder lllllllllllllIlIllIIllllllllIlll) {
        lllllllllllllIlIllIIllllllllIlll.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[6]]).append(this.name).append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[11]]);
        "".length();
        lllllllllllllIlIllIIllllllllIlll.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[12]]);
        "".length();
        short lllllllllllllIlIllIIllllllllIIIl = (short)this.children.iterator();
        "".length();
        if (((131 + 4 - 128 + 149 ^ 63 + 32 - 13 + 66) & (0x3A ^ 0x6D ^ (0x47 ^ 0x18) ^ -" ".length())) < 0) {
            return;
        }
        while (!lIlIlIllIllllII(((Iterator)lllllllllllllIlIllIIllllllllIIIl).hasNext() ? 1 : 0)) {
            final Entry lllllllllllllIlIllIIllllllllIllI = ((Iterator<Entry>)lllllllllllllIlIllIIllllllllIIIl).next();
            lllllllllllllIlIllIIllllllllIlll.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[13]]);
            "".length();
            lllllllllllllIlIllIIllllllllIlll.append(lllllllllllllIlIllIIllllllllIllI.getKey());
            "".length();
            lllllllllllllIlIllIIllllllllIlll.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[14]]);
            "".length();
            lllllllllllllIlIllIIllllllllIlll.append(lllllllllllllIlIllIIllllllllIllI.getValue());
            "".length();
        }
        if (lIlIlIllIlllIII(this.stackTrace) && lIlIlIllIllllIl(this.stackTrace.length)) {
            lllllllllllllIlIllIIllllllllIlll.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[15]]);
            "".length();
            final byte lllllllllllllIlIllIIlllllllIllll;
            final double lllllllllllllIlIllIIllllllllIIII = ((StackTraceElement[])(Object)(lllllllllllllIlIllIIlllllllIllll = (byte)(Object)this.stackTrace)).length;
            lllllllllllllIlIllIIllllllllIIIl = (short)CrashReportCategory.llllIllIlIlll[0];
            "".length();
            if (((0x5B ^ 0x69) & ~(0xAC ^ 0x9E)) != 0x0) {
                return;
            }
            while (!lIlIlIllIlllllI(lllllllllllllIlIllIIllllllllIIIl, (int)lllllllllllllIlIllIIllllllllIIII)) {
                final StackTraceElement lllllllllllllIlIllIIllllllllIlIl = lllllllllllllIlIllIIlllllllIllll[lllllllllllllIlIllIIllllllllIIIl];
                lllllllllllllIlIllIIllllllllIlll.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[5]]);
                "".length();
                lllllllllllllIlIllIIllllllllIlll.append(lllllllllllllIlIllIIllllllllIlIl.toString());
                "".length();
                ++lllllllllllllIlIllIIllllllllIIIl;
            }
        }
    }
    
    public void addCrashSectionCallable(final String lllllllllllllIlIllIlIIIIIIllIIIl, final Callable<String> lllllllllllllIlIllIlIIIIIIllIIII) {
        try {
            this.addCrashSection(lllllllllllllIlIllIlIIIIIIllIIIl, lllllllllllllIlIllIlIIIIIIllIIII.call());
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIIIIIIllIIll) {
            this.addCrashSectionThrowable(lllllllllllllIlIllIlIIIIIIllIIIl, lllllllllllllIlIllIlIIIIIIllIIll);
        }
    }
    
    private static String lIlIlIllIlIlIlI(final String lllllllllllllIlIllIIlllllIlIIlIl, final String lllllllllllllIlIllIIlllllIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIlllllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIlllllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIlllllIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIlllllIlIlIIl.init(CrashReportCategory.llllIllIlIlll[3], lllllllllllllIlIllIIlllllIlIlIlI);
            return new String(lllllllllllllIlIllIIlllllIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIlllllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIlllllIlIlIII) {
            lllllllllllllIlIllIIlllllIlIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIllIllIllI(final int lllllllllllllIlIllIIlllllIIIlIlI) {
        return lllllllllllllIlIllIIlllllIIIlIlI <= 0;
    }
    
    private static boolean lIlIlIllIlllIll(final int lllllllllllllIlIllIIlllllIIIIlIl, final int lllllllllllllIlIllIIlllllIIIIlII) {
        return lllllllllllllIlIllIIlllllIIIIlIl != lllllllllllllIlIllIIlllllIIIIlII;
    }
    
    public void addCrashSection(final String lllllllllllllIlIllIlIIIIIIlIIlll, final Object lllllllllllllIlIllIlIIIIIIlIlIIl) {
        this.children.add(new Entry(lllllllllllllIlIllIlIIIIIIlIIlll, lllllllllllllIlIllIlIIIIIIlIlIIl));
        "".length();
    }
    
    private static void lIlIlIllIllIIII() {
        (llllIllIlIlIl = new String[CrashReportCategory.llllIllIlIlll[21]])[CrashReportCategory.llllIllIlIlll[0]] = lIlIlIllIlIlIlI("Oygr6MMVUxLJmcgQ0Y+QivDVLhFUeHKc", "xoMmi");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[2]] = lIlIlIllIlIlIlI("hcmcGgdzMr47kZaWd6pYpPseOasjN7Th", "OrMRC");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[3]] = lIlIlIllIlIlIlI("xHVDkzGp7BZ1ewnNgRCrcbY2UeCAq4FblLJDbOtg+XE=", "PaFdM");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[4]] = lIlIlIllIlIlIlI("pDgh5Icpv/I=", "WvELS");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[1]] = lIlIlIllIlIllIl("KiAROi9TaEw1MEltAHhhDWRBMGQAJkRxIEVtAG9kCicKICUAJhd0JgUnBz83SW0AeHRFbQB0MAZoQTBoW31ReGENYQ==", "iHdTD");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[7]] = lIlIlIllIlIllIl("RCorBC0eTz8fLAgGNxFiDwcsGClMAzYVaw==", "loYvB");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[8]] = lIlIlIllIlIllIl("b1Y=", "CvJsL");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[9]] = lIlIlIllIlIllIl("OBANAD0ET0pBdw5ZTw1pShYFByYLHAQacgkdHwc5GVVPDX5PEUodPUpQDkV3DllKCz4FFgEack8RRll+TxFKHT1KUA5FYF9ARkw2Qw==", "jujiR");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[10]] = lIlIlIllIlIllIl("YTwrNw07WT8sDC0QNyJCPhYrKQZpFTYmSw==", "IyYEb");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[6]] = lIlIlIllIlIlllI("PJPLkpM5az4=", "wuyoX");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[11]] = lIlIlIllIlIllIl("VkduWQ==", "vjCSs");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[12]] = lIlIlIllIlIllIl("IxU5Gx8LA3c=", "gpMzv");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[13]] = lIlIlIllIlIlllI("asVj0mkn9rA=", "JsAnd");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[14]] = lIlIlIllIlIllIl("TVg=", "wxYxB");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[15]] = lIlIlIllIlIlllI("aBhe868zwHY5brQZWZNC5A==", "IgXsJ");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[5]] = lIlIlIllIlIlIlI("+gVp6sEkxNg=", "pvInp");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[16]] = lIlIlIllIlIlllI("4KboPEVbtQOt3+ciQj363Q==", "BUrut");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[17]] = lIlIlIllIlIllIl("LTgrJANPMCUzCU8iJSsdCg==", "oTDGh");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[18]] = lIlIlIllIlIlIlI("SE8PxKUR0yqYDfv3itsJGw==", "uQdnA");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[19]] = lIlIlIllIlIllIl("DCssICY=", "NGCCM");
        CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[20]] = lIlIlIllIlIlllI("C6C8GjMXLkCBgpxeqlP5hQ==", "KvkMY");
    }
    
    private static boolean lIlIlIllIlllIII(final Object lllllllllllllIlIllIIlllllIIlIIII) {
        return lllllllllllllIlIllIIlllllIIlIIII != null;
    }
    
    private static boolean lIlIlIllIllllll(final int lllllllllllllIlIllIIlllllIIlIlll, final int lllllllllllllIlIllIIlllllIIlIllI) {
        return lllllllllllllIlIllIIlllllIIlIlll < lllllllllllllIlIllIIlllllIIlIllI;
    }
    
    public void trimStackTraceEntriesFromBottom(final int lllllllllllllIlIllIlIIIIIIIIIIll) {
        final StackTraceElement[] lllllllllllllIlIllIlIIIIIIIIIIlI = new StackTraceElement[this.stackTrace.length - lllllllllllllIlIllIlIIIIIIIIIIll];
        System.arraycopy(this.stackTrace, CrashReportCategory.llllIllIlIlll[0], lllllllllllllIlIllIlIIIIIIIIIIlI, CrashReportCategory.llllIllIlIlll[0], lllllllllllllIlIllIlIIIIIIIIIIlI.length);
        this.stackTrace = lllllllllllllIlIllIlIIIIIIIIIIlI;
    }
    
    public static String getCoordinateInfo(final BlockPos lllllllllllllIlIllIlIIIIIllIIlII) {
        final int lllllllllllllIlIllIlIIIIIllIIIll = lllllllllllllIlIllIlIIIIIllIIlII.getX();
        final int lllllllllllllIlIllIlIIIIIllIIIlI = lllllllllllllIlIllIlIIIIIllIIlII.getY();
        final int lllllllllllllIlIllIlIIIIIllIIIIl = lllllllllllllIlIllIlIIIIIllIIlII.getZ();
        final StringBuilder lllllllllllllIlIllIlIIIIIllIIIII = new StringBuilder();
        try {
            final StringBuilder sb = lllllllllllllIlIllIlIIIIIllIIIII;
            final String format = CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[2]];
            final Object[] args = new Object[CrashReportCategory.llllIllIlIlll[4]];
            args[CrashReportCategory.llllIllIlIlll[0]] = lllllllllllllIlIllIlIIIIIllIIIll;
            args[CrashReportCategory.llllIllIlIlll[2]] = lllllllllllllIlIllIlIIIIIllIIIlI;
            args[CrashReportCategory.llllIllIlIlll[3]] = lllllllllllllIlIllIlIIIIIllIIIIl;
            sb.append(String.format(format, args));
            "".length();
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIIIIIlIlllll) {
            lllllllllllllIlIllIlIIIIIllIIIII.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[3]]);
            "".length();
        }
        lllllllllllllIlIllIlIIIIIllIIIII.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[4]]);
        "".length();
        try {
            final int lllllllllllllIlIllIlIIIIIlIllllI = lllllllllllllIlIllIlIIIIIllIIIll >> CrashReportCategory.llllIllIlIlll[1];
            final int lllllllllllllIlIllIlIIIIIlIlllIl = lllllllllllllIlIllIlIIIIIllIIIIl >> CrashReportCategory.llllIllIlIlll[1];
            final int lllllllllllllIlIllIlIIIIIlIlllII = lllllllllllllIlIllIlIIIIIllIIIll & CrashReportCategory.llllIllIlIlll[5];
            final int lllllllllllllIlIllIlIIIIIlIllIll = lllllllllllllIlIllIlIIIIIllIIIlI >> CrashReportCategory.llllIllIlIlll[1];
            final int lllllllllllllIlIllIlIIIIIlIllIlI = lllllllllllllIlIllIlIIIIIllIIIIl & CrashReportCategory.llllIllIlIlll[5];
            final int lllllllllllllIlIllIlIIIIIlIllIIl = lllllllllllllIlIllIlIIIIIlIllllI << CrashReportCategory.llllIllIlIlll[1];
            final int lllllllllllllIlIllIlIIIIIlIllIII = lllllllllllllIlIllIlIIIIIlIlllIl << CrashReportCategory.llllIllIlIlll[1];
            final int lllllllllllllIlIllIlIIIIIlIlIlll = (lllllllllllllIlIllIlIIIIIlIllllI + CrashReportCategory.llllIllIlIlll[2] << CrashReportCategory.llllIllIlIlll[1]) - CrashReportCategory.llllIllIlIlll[2];
            final int lllllllllllllIlIllIlIIIIIlIlIllI = (lllllllllllllIlIllIlIIIIIlIlllIl + CrashReportCategory.llllIllIlIlll[2] << CrashReportCategory.llllIllIlIlll[1]) - CrashReportCategory.llllIllIlIlll[2];
            final StringBuilder sb2 = lllllllllllllIlIllIlIIIIIllIIIII;
            final String format2 = CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[1]];
            final Object[] args2 = new Object[CrashReportCategory.llllIllIlIlll[6]];
            args2[CrashReportCategory.llllIllIlIlll[0]] = lllllllllllllIlIllIlIIIIIlIlllII;
            args2[CrashReportCategory.llllIllIlIlll[2]] = lllllllllllllIlIllIlIIIIIlIllIll;
            args2[CrashReportCategory.llllIllIlIlll[3]] = lllllllllllllIlIllIlIIIIIlIllIlI;
            args2[CrashReportCategory.llllIllIlIlll[4]] = lllllllllllllIlIllIlIIIIIlIllllI;
            args2[CrashReportCategory.llllIllIlIlll[1]] = lllllllllllllIlIllIlIIIIIlIlllIl;
            args2[CrashReportCategory.llllIllIlIlll[7]] = lllllllllllllIlIllIlIIIIIlIllIIl;
            args2[CrashReportCategory.llllIllIlIlll[8]] = lllllllllllllIlIllIlIIIIIlIllIII;
            args2[CrashReportCategory.llllIllIlIlll[9]] = lllllllllllllIlIllIlIIIIIlIlIlll;
            args2[CrashReportCategory.llllIllIlIlll[10]] = lllllllllllllIlIllIlIIIIIlIlIllI;
            sb2.append(String.format(format2, args2));
            "".length();
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIIIIIlIlIlIl) {
            lllllllllllllIlIllIlIIIIIllIIIII.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[7]]);
            "".length();
        }
        lllllllllllllIlIllIlIIIIIllIIIII.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[8]]);
        "".length();
        try {
            final int lllllllllllllIlIllIlIIIIIlIlIlII = lllllllllllllIlIllIlIIIIIllIIIll >> CrashReportCategory.llllIllIlIlll[6];
            final int lllllllllllllIlIllIlIIIIIlIlIIll = lllllllllllllIlIllIlIIIIIllIIIIl >> CrashReportCategory.llllIllIlIlll[6];
            final int lllllllllllllIlIllIlIIIIIlIlIIlI = lllllllllllllIlIllIlIIIIIlIlIlII << CrashReportCategory.llllIllIlIlll[7];
            final int lllllllllllllIlIllIlIIIIIlIlIIIl = lllllllllllllIlIllIlIIIIIlIlIIll << CrashReportCategory.llllIllIlIlll[7];
            final int lllllllllllllIlIllIlIIIIIlIlIIII = (lllllllllllllIlIllIlIIIIIlIlIlII + CrashReportCategory.llllIllIlIlll[2] << CrashReportCategory.llllIllIlIlll[7]) - CrashReportCategory.llllIllIlIlll[2];
            final int lllllllllllllIlIllIlIIIIIlIIllll = (lllllllllllllIlIllIlIIIIIlIlIIll + CrashReportCategory.llllIllIlIlll[2] << CrashReportCategory.llllIllIlIlll[7]) - CrashReportCategory.llllIllIlIlll[2];
            final int lllllllllllllIlIllIlIIIIIlIIlllI = lllllllllllllIlIllIlIIIIIlIlIlII << CrashReportCategory.llllIllIlIlll[6];
            final int lllllllllllllIlIllIlIIIIIlIIllIl = lllllllllllllIlIllIlIIIIIlIlIIll << CrashReportCategory.llllIllIlIlll[6];
            final int lllllllllllllIlIllIlIIIIIlIIllII = (lllllllllllllIlIllIlIIIIIlIlIlII + CrashReportCategory.llllIllIlIlll[2] << CrashReportCategory.llllIllIlIlll[6]) - CrashReportCategory.llllIllIlIlll[2];
            final int lllllllllllllIlIllIlIIIIIlIIlIll = (lllllllllllllIlIllIlIIIIIlIlIIll + CrashReportCategory.llllIllIlIlll[2] << CrashReportCategory.llllIllIlIlll[6]) - CrashReportCategory.llllIllIlIlll[2];
            final StringBuilder sb3 = lllllllllllllIlIllIlIIIIIllIIIII;
            final String format3 = CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[9]];
            final Object[] args3 = new Object[CrashReportCategory.llllIllIlIlll[11]];
            args3[CrashReportCategory.llllIllIlIlll[0]] = lllllllllllllIlIllIlIIIIIlIlIlII;
            args3[CrashReportCategory.llllIllIlIlll[2]] = lllllllllllllIlIllIlIIIIIlIlIIll;
            args3[CrashReportCategory.llllIllIlIlll[3]] = lllllllllllllIlIllIlIIIIIlIlIIlI;
            args3[CrashReportCategory.llllIllIlIlll[4]] = lllllllllllllIlIllIlIIIIIlIlIIIl;
            args3[CrashReportCategory.llllIllIlIlll[1]] = lllllllllllllIlIllIlIIIIIlIlIIII;
            args3[CrashReportCategory.llllIllIlIlll[7]] = lllllllllllllIlIllIlIIIIIlIIllll;
            args3[CrashReportCategory.llllIllIlIlll[8]] = lllllllllllllIlIllIlIIIIIlIIlllI;
            args3[CrashReportCategory.llllIllIlIlll[9]] = lllllllllllllIlIllIlIIIIIlIIllIl;
            args3[CrashReportCategory.llllIllIlIlll[10]] = lllllllllllllIlIllIlIIIIIlIIllII;
            args3[CrashReportCategory.llllIllIlIlll[6]] = lllllllllllllIlIllIlIIIIIlIIlIll;
            sb3.append(String.format(format3, args3));
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIIIIIlIIlIlI) {
            lllllllllllllIlIllIlIIIIIllIIIII.append(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[10]]);
            "".length();
        }
        return String.valueOf(lllllllllllllIlIllIlIIIIIllIIIII);
    }
    
    private static boolean lIlIlIllIllllIl(final int lllllllllllllIlIllIIlllllIIIlIII) {
        return lllllllllllllIlIllIIlllllIIIlIII > 0;
    }
    
    private static boolean lIlIlIllIllllII(final int lllllllllllllIlIllIIlllllIIIllII) {
        return lllllllllllllIlIllIIlllllIIIllII == 0;
    }
    
    public void addCrashSectionThrowable(final String lllllllllllllIlIllIlIIIIIIIllllI, final Throwable lllllllllllllIlIllIlIIIIIIIlllIl) {
        this.addCrashSection(lllllllllllllIlIllIlIIIIIIIllllI, lllllllllllllIlIllIlIIIIIIIlllIl);
    }
    
    public static String getCoordinateInfo(final double lllllllllllllIlIllIlIIIIIllllIIl, final double lllllllllllllIlIllIlIIIIIllllIII, final double lllllllllllllIlIllIlIIIIIlllIlll) {
        final String format = CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[0]];
        final Object[] args = new Object[CrashReportCategory.llllIllIlIlll[1]];
        args[CrashReportCategory.llllIllIlIlll[0]] = lllllllllllllIlIllIlIIIIIllllIIl;
        args[CrashReportCategory.llllIllIlIlll[2]] = lllllllllllllIlIllIlIIIIIllllIII;
        args[CrashReportCategory.llllIllIlIlll[3]] = lllllllllllllIlIllIlIIIIIlllIlll;
        args[CrashReportCategory.llllIllIlIlll[4]] = getCoordinateInfo(new BlockPos(lllllllllllllIlIllIlIIIIIllllIIl, lllllllllllllIlIllIlIIIIIllllIII, lllllllllllllIlIllIlIIIIIlllIlll));
        return String.format(format, args);
    }
    
    static {
        lIlIlIllIllIlIl();
        lIlIlIllIllIIII();
    }
    
    private static String lIlIlIllIlIlllI(final String lllllllllllllIlIllIIllllllIIllII, final String lllllllllllllIlIllIIllllllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIllllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIllllllIIlIll.getBytes(StandardCharsets.UTF_8)), CrashReportCategory.llllIllIlIlll[10]), "DES");
            final Cipher lllllllllllllIlIllIIllllllIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIllIIllllllIIlllI.init(CrashReportCategory.llllIllIlIlll[3], lllllllllllllIlIllIIllllllIIllll);
            return new String(lllllllllllllIlIllIIllllllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIllllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIllllllIIllIl) {
            lllllllllllllIlIllIIllllllIIllIl.printStackTrace();
            return null;
        }
    }
    
    public static void addBlockInfo(final CrashReportCategory lllllllllllllIlIllIIllllllIllIIl, final BlockPos lllllllllllllIlIllIIllllllIllIII, final IBlockState lllllllllllllIlIllIIllllllIlIlll) {
        lllllllllllllIlIllIIllllllIllIIl.addCrashSectionCallable(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[19]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return lllllllllllllIlIllIIllllllIlIlll.toString();
            }
        });
        lllllllllllllIlIllIIllllllIllIIl.addCrashSectionCallable(CrashReportCategory.llllIllIlIlIl[CrashReportCategory.llllIllIlIlll[20]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return CrashReportCategory.getCoordinateInfo(lllllllllllllIlIllIIllllllIllIII);
            }
        });
    }
    
    private static boolean lIlIlIllIlllllI(final int lllllllllllllIlIllIIlllllIIllIll, final int lllllllllllllIlIllIIlllllIIllIlI) {
        return lllllllllllllIlIllIIlllllIIllIll >= lllllllllllllIlIllIIlllllIIllIlI;
    }
    
    public StackTraceElement[] getStackTrace() {
        return this.stackTrace;
    }
    
    static class Entry
    {
        private static final /* synthetic */ int[] lIllllIlIllIll;
        private final /* synthetic */ String key;
        private final /* synthetic */ String value;
        private static final /* synthetic */ String[] lIllllIlIllIIl;
        
        public String getKey() {
            return this.key;
        }
        
        private static void lIIIIlIIlIlIIlll() {
            (lIllllIlIllIll = new int[4])[0] = ((0xD7 ^ 0x8A) & ~(0xC2 ^ 0x9F));
            Entry.lIllllIlIllIll[1] = " ".length();
            Entry.lIllllIlIllIll[2] = "  ".length();
            Entry.lIllllIlIllIll[3] = "   ".length();
        }
        
        private static String lIIIIlIIlIIllllI(final String llllllllllllIllllIlIIlIIIIIlIllI, final String llllllllllllIllllIlIIlIIIIIlIlIl) {
            try {
                final SecretKeySpec llllllllllllIllllIlIIlIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIlIIlIIIIIllIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllllIlIIlIIIIIllIlI.init(Entry.lIllllIlIllIll[2], llllllllllllIllllIlIIlIIIIIllIll);
                return new String(llllllllllllIllllIlIIlIIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIIlIIIIIllIIl) {
                llllllllllllIllllIlIIlIIIIIllIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIIlIIlIlIlIIl(final int llllllllllllIllllIlIIlIIIIIIlIll) {
            return llllllllllllIllllIlIIlIIIIIIlIll != 0;
        }
        
        private static void lIIIIlIIlIlIIlIl() {
            (lIllllIlIllIIl = new String[Entry.lIllllIlIllIll[3]])[Entry.lIllllIlIllIll[0]] = lIIIIlIIlIIlllIl("Ki0NIwYYLT0=", "TSCvJ");
            Entry.lIllllIlIllIIl[Entry.lIllllIlIllIll[1]] = lIIIIlIIlIIllllI("QFl9IbPVsKTRKxJTlIXeVw==", "XrHCC");
            Entry.lIllllIlIllIIl[Entry.lIllllIlIllIll[2]] = lIIIIlIIlIIlllIl("TGc=", "vGffX");
        }
        
        private static String lIIIIlIIlIIlllIl(String llllllllllllIllllIlIIlIIIIlIlIII, final String llllllllllllIllllIlIIlIIIIlIIlll) {
            llllllllllllIllllIlIIlIIIIlIlIII = new String(Base64.getDecoder().decode(llllllllllllIllllIlIIlIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIlIIlIIIIlIlIll = new StringBuilder();
            final char[] llllllllllllIllllIlIIlIIIIlIlIlI = llllllllllllIllllIlIIlIIIIlIIlll.toCharArray();
            int llllllllllllIllllIlIIlIIIIlIlIIl = Entry.lIllllIlIllIll[0];
            final long llllllllllllIllllIlIIlIIIIlIIIll = (Object)llllllllllllIllllIlIIlIIIIlIlIII.toCharArray();
            final short llllllllllllIllllIlIIlIIIIlIIIlI = (short)llllllllllllIllllIlIIlIIIIlIIIll.length;
            short llllllllllllIllllIlIIlIIIIlIIIIl = (short)Entry.lIllllIlIllIll[0];
            while (lIIIIlIIlIlIlIlI(llllllllllllIllllIlIIlIIIIlIIIIl, llllllllllllIllllIlIIlIIIIlIIIlI)) {
                final char llllllllllllIllllIlIIlIIIIlIlllI = llllllllllllIllllIlIIlIIIIlIIIll[llllllllllllIllllIlIIlIIIIlIIIIl];
                llllllllllllIllllIlIIlIIIIlIlIll.append((char)(llllllllllllIllllIlIIlIIIIlIlllI ^ llllllllllllIllllIlIIlIIIIlIlIlI[llllllllllllIllllIlIIlIIIIlIlIIl % llllllllllllIllllIlIIlIIIIlIlIlI.length]));
                "".length();
                ++llllllllllllIllllIlIIlIIIIlIlIIl;
                ++llllllllllllIllllIlIIlIIIIlIIIIl;
                "".length();
                if ("   ".length() < " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIlIIlIIIIlIlIll);
        }
        
        private static boolean lIIIIlIIlIlIlIII(final Object llllllllllllIllllIlIIlIIIIIIllIl) {
            return llllllllllllIllllIlIIlIIIIIIllIl == null;
        }
        
        public String getValue() {
            return this.value;
        }
        
        static {
            lIIIIlIIlIlIIlll();
            lIIIIlIIlIlIIlIl();
        }
        
        private static boolean lIIIIlIIlIlIlIlI(final int llllllllllllIllllIlIIlIIIIIlIIII, final int llllllllllllIllllIlIIlIIIIIIllll) {
            return llllllllllllIllllIlIIlIIIIIlIIII < llllllllllllIllllIlIIlIIIIIIllll;
        }
        
        public Entry(final String llllllllllllIllllIlIIlIIIlIIIIII, final Object llllllllllllIllllIlIIlIIIlIIIIll) {
            this.key = llllllllllllIllllIlIIlIIIlIIIIII;
            if (lIIIIlIIlIlIlIII(llllllllllllIllllIlIIlIIIlIIIIll)) {
                this.value = Entry.lIllllIlIllIIl[Entry.lIllllIlIllIll[0]];
                "".length();
                if ("   ".length() < 0) {
                    throw null;
                }
            }
            else if (lIIIIlIIlIlIlIIl((llllllllllllIllllIlIIlIIIlIIIIll instanceof Throwable) ? 1 : 0)) {
                final Throwable llllllllllllIllllIlIIlIIIlIIIIlI = (Throwable)llllllllllllIllllIlIIlIIIlIIIIll;
                this.value = String.valueOf(new StringBuilder(Entry.lIllllIlIllIIl[Entry.lIllllIlIllIll[1]]).append(llllllllllllIllllIlIIlIIIlIIIIlI.getClass().getSimpleName()).append(Entry.lIllllIlIllIIl[Entry.lIllllIlIllIll[2]]).append(llllllllllllIllllIlIIlIIIlIIIIlI.getMessage()));
                "".length();
                if ("   ".length() <= -" ".length()) {
                    throw null;
                }
            }
            else {
                this.value = llllllllllllIllllIlIIlIIIlIIIIll.toString();
            }
        }
    }
}
