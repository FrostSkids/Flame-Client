// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.profiler;

import java.util.Iterator;
import java.util.Collections;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Profiler
{
    public /* synthetic */ boolean profilingEnabled;
    private static final /* synthetic */ String[] lIIIllIlIllIIl;
    private static final /* synthetic */ int[] lIIIllIlIllIll;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ Map<String, Long> profilingMap;
    private /* synthetic */ String profilingSection;
    private final /* synthetic */ List<String> sectionList;
    private final /* synthetic */ List<Long> timestampList;
    
    private static void llIIIlIIllIIIIl() {
        (lIIIllIlIllIIl = new String[Profiler.lIIIllIlIllIll[14]])[Profiler.lIIIllIlIllIll[0]] = llIIIlIIlIlIllI("4zOpPGre0pc=", "lscXI");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[1]] = llIIIlIIlIlIlll("9DB/BCRCC+g=", "KnJKe");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[2]] = llIIIlIIlIlIlll("aDVFYOkeTuI=", "dAZgV");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[3]] = llIIIlIIlIllIII("HSoJPBImLAo+QT1lEDgNJysDeRIhKkQ1CSAiRXlB", "NEdYf");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[4]] = llIIIlIIlIlIlll("IeMWsqfJ0FLp/9SeNt4Ehw==", "gSkPO");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[5]] = llIIIlIIlIllIII("UgIl", "roVQS");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[6]] = llIIIlIIlIlIllI("BcnH3eFYfOk=", "JCeag");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[7]] = llIIIlIIlIllIII("HiEGBw==", "lNisQ");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[8]] = llIIIlIIlIlIllI("+YH+vb+jTkc=", "aELHe");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[9]] = llIIIlIIlIllIII("Tw==", "aZFKY");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[10]] = llIIIlIIlIlIllI("FAtpscNc1Iw=", "fzLaX");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[11]] = llIIIlIIlIlIllI("exsDd7loWAE=", "zYpRB");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[12]] = llIIIlIIlIlIllI("o7GxHSomWRVk4UY6wkQK1g==", "vLbIf");
        Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[13]] = llIIIlIIlIlIllI("ceZhB6Vb9dblZCokCnyeAw==", "ATwSh");
    }
    
    private static void llIIIlIIllIIlII() {
        (lIIIllIlIllIll = new int[15])[0] = ((3 + 31 + 17 + 174 ^ 161 + 16 - 84 + 72) & (0x43 ^ 0xA ^ (0xBC ^ 0xB1) ^ -" ".length()));
        Profiler.lIIIllIlIllIll[1] = " ".length();
        Profiler.lIIIllIlIllIll[2] = "  ".length();
        Profiler.lIIIllIlIllIll[3] = "   ".length();
        Profiler.lIIIllIlIllIll[4] = (0xA1 ^ 0xA5);
        Profiler.lIIIllIlIllIll[5] = (0xA8 ^ 0xC0 ^ (0x3F ^ 0x52));
        Profiler.lIIIllIlIllIll[6] = (0xBC ^ 0x88 ^ (0xA3 ^ 0x91));
        Profiler.lIIIllIlIllIll[7] = (0x12 ^ 0x15);
        Profiler.lIIIllIlIllIll[8] = (0xF ^ 0x5C ^ (0x14 ^ 0x4F));
        Profiler.lIIIllIlIllIll[9] = (90 + 49 - 103 + 118 ^ 98 + 139 - 207 + 117);
        Profiler.lIIIllIlIllIll[10] = (0x8F ^ 0x85);
        Profiler.lIIIllIlIllIll[11] = (0x72 ^ 0x79);
        Profiler.lIIIllIlIllIll[12] = (0x43 ^ 0x2B ^ (0x4F ^ 0x2B));
        Profiler.lIIIllIlIllIll[13] = (53 + 42 - 55 + 98 ^ 0 + 44 + 46 + 45);
        Profiler.lIIIllIlIllIll[14] = (23 + 7 + 82 + 32 ^ 8 + 34 + 107 + 9);
    }
    
    public void endStartSection(final String lllllllllllllIIllllllllIlIIlIIIl) {
        this.endSection();
        this.startSection(lllllllllllllIIllllllllIlIIlIIIl);
    }
    
    public String getNameOfLastSection() {
        String s;
        if (llIIIlIIllIlIII(this.sectionList.size())) {
            s = Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[13]];
            "".length();
            if (-(151 + 109 - 79 + 8 ^ 129 + 164 - 253 + 144) >= 0) {
                return null;
            }
        }
        else {
            s = this.sectionList.get(this.sectionList.size() - Profiler.lIIIllIlIllIll[1]);
        }
        return s;
    }
    
    private static int llIIIlIIllIIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIIIlIIllIIlIl(final int lllllllllllllIIllllllllIIlIlIIII) {
        return lllllllllllllIIllllllllIIlIlIIII != 0;
    }
    
    private static int llIIIlIIllIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String llIIIlIIlIlIlll(final String lllllllllllllIIllllllllIlIIIIIlI, final String lllllllllllllIIllllllllIlIIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllllllllIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllllllIlIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllllllIlIIIIllI.init(Profiler.lIIIllIlIllIll[2], lllllllllllllIIllllllllIlIIIIlll);
            return new String(lllllllllllllIIllllllllIlIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllllIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllllIlIIIIlIl) {
            lllllllllllllIIllllllllIlIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIIllIlIll(final int lllllllllllllIIllllllllIIlIlIIll, final int lllllllllllllIIllllllllIIlIlIIlI) {
        return lllllllllllllIIllllllllIIlIlIIll > lllllllllllllIIllllllllIIlIlIIlI;
    }
    
    private static boolean llIIIlIIllIIllI(final int lllllllllllllIIllllllllIIlIIlIlI) {
        return lllllllllllllIIllllllllIIlIIlIlI > 0;
    }
    
    public void clearProfiling() {
        this.profilingMap.clear();
        this.profilingSection = Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[1]];
        this.sectionList.clear();
    }
    
    private static String llIIIlIIlIlIllI(final String lllllllllllllIIllllllllIIlIlllIl, final String lllllllllllllIIllllllllIIlIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllllllIIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllllIIlIllllI.getBytes(StandardCharsets.UTF_8)), Profiler.lIIIllIlIllIll[8]), "DES");
            final Cipher lllllllllllllIIllllllllIIllIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIllllllllIIllIIIIl.init(Profiler.lIIIllIlIllIll[2], lllllllllllllIIllllllllIIllIIIlI);
            return new String(lllllllllllllIIllllllllIIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllllIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllllIIllIIIII) {
            lllllllllllllIIllllllllIIllIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIIllIllII(final int lllllllllllllIIllllllllIIlIIllII) {
        return lllllllllllllIIllllllllIIlIIllII < 0;
    }
    
    static {
        llIIIlIIllIIlII();
        llIIIlIIllIIIIl();
        logger = LogManager.getLogger();
    }
    
    public void startSection(final String lllllllllllllIIllllllllIllIIlIIl) {
        if (llIIIlIIllIIlIl(this.profilingEnabled ? 1 : 0)) {
            if (llIIIlIIllIIllI(this.profilingSection.length())) {
                this.profilingSection = String.valueOf(new StringBuilder(String.valueOf(this.profilingSection)).append(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[2]]));
            }
            this.profilingSection = String.valueOf(new StringBuilder(String.valueOf(this.profilingSection)).append(lllllllllllllIIllllllllIllIIlIIl));
            this.sectionList.add(this.profilingSection);
            "".length();
            this.timestampList.add(System.nanoTime());
            "".length();
        }
    }
    
    public void endSection() {
        if (llIIIlIIllIIlIl(this.profilingEnabled ? 1 : 0)) {
            final long lllllllllllllIIllllllllIllIIIIll = System.nanoTime();
            final long lllllllllllllIIllllllllIllIIIIlI = this.timestampList.remove(this.timestampList.size() - Profiler.lIIIllIlIllIll[1]);
            this.sectionList.remove(this.sectionList.size() - Profiler.lIIIllIlIllIll[1]);
            "".length();
            final long lllllllllllllIIllllllllIllIIIIIl = lllllllllllllIIllllllllIllIIIIll - lllllllllllllIIllllllllIllIIIIlI;
            if (llIIIlIIllIIlIl(this.profilingMap.containsKey(this.profilingSection) ? 1 : 0)) {
                this.profilingMap.put(this.profilingSection, this.profilingMap.get(this.profilingSection) + lllllllllllllIIllllllllIllIIIIIl);
                "".length();
                "".length();
                if (-(40 + 95 - 72 + 64 ^ (0xFA ^ 0x81)) >= 0) {
                    return;
                }
            }
            else {
                this.profilingMap.put(this.profilingSection, lllllllllllllIIllllllllIllIIIIIl);
                "".length();
            }
            if (llIIIlIIllIIllI(llIIIlIIllIIlll(lllllllllllllIIllllllllIllIIIIIl, 100000000L))) {
                Profiler.logger.warn(String.valueOf(new StringBuilder(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[3]]).append(this.profilingSection).append(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[4]]).append(lllllllllllllIIllllllllIllIIIIIl / 1000000.0).append(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[5]])));
            }
            String profilingSection;
            if (llIIIlIIllIlIII(this.sectionList.isEmpty() ? 1 : 0)) {
                profilingSection = this.sectionList.get(this.sectionList.size() - Profiler.lIIIllIlIllIll[1]);
                "".length();
                if (((0xFE ^ 0xB2 ^ (0xB8 ^ 0xA6)) & (0x0 ^ 0x2A ^ (0x56 ^ 0x2E) ^ -" ".length())) >= (0x62 ^ 0x29 ^ (0x6 ^ 0x49))) {
                    return;
                }
            }
            else {
                profilingSection = Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[6]];
            }
            this.profilingSection = profilingSection;
        }
    }
    
    private static int llIIIlIIllIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIIIlIIllIllIl(final int lllllllllllllIIllllllllIIlIlIlll, final int lllllllllllllIIllllllllIIlIlIllI) {
        return lllllllllllllIIllllllllIIlIlIlll < lllllllllllllIIllllllllIIlIlIllI;
    }
    
    private static String llIIIlIIlIllIII(String lllllllllllllIIllllllllIIllIllll, final String lllllllllllllIIllllllllIIllIlllI) {
        lllllllllllllIIllllllllIIllIllll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllllllIIllIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllllllIIlllIIlI = new StringBuilder();
        final char[] lllllllllllllIIllllllllIIlllIIIl = lllllllllllllIIllllllllIIllIlllI.toCharArray();
        int lllllllllllllIIllllllllIIlllIIII = Profiler.lIIIllIlIllIll[0];
        final String lllllllllllllIIllllllllIIllIlIlI = (Object)((String)lllllllllllllIIllllllllIIllIllll).toCharArray();
        final int lllllllllllllIIllllllllIIllIlIIl = lllllllllllllIIllllllllIIllIlIlI.length;
        short lllllllllllllIIllllllllIIllIlIII = (short)Profiler.lIIIllIlIllIll[0];
        while (llIIIlIIllIllIl(lllllllllllllIIllllllllIIllIlIII, lllllllllllllIIllllllllIIllIlIIl)) {
            final char lllllllllllllIIllllllllIIlllIlIl = lllllllllllllIIllllllllIIllIlIlI[lllllllllllllIIllllllllIIllIlIII];
            lllllllllllllIIllllllllIIlllIIlI.append((char)(lllllllllllllIIllllllllIIlllIlIl ^ lllllllllllllIIllllllllIIlllIIIl[lllllllllllllIIllllllllIIlllIIII % lllllllllllllIIllllllllIIlllIIIl.length]));
            "".length();
            ++lllllllllllllIIllllllllIIlllIIII;
            ++lllllllllllllIIllllllllIIllIlIII;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllllllIIlllIIlI);
    }
    
    public Profiler() {
        this.sectionList = (List<String>)Lists.newArrayList();
        this.timestampList = (List<Long>)Lists.newArrayList();
        this.profilingSection = Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[0]];
        this.profilingMap = (Map<String, Long>)Maps.newHashMap();
    }
    
    private static boolean llIIIlIIllIlIII(final int lllllllllllllIIllllllllIIlIIlllI) {
        return lllllllllllllIIllllllllIIlIIlllI == 0;
    }
    
    public List<Result> getProfilingData(String lllllllllllllIIllllllllIlIlIlllI) {
        if (llIIIlIIllIlIII(this.profilingEnabled ? 1 : 0)) {
            return null;
        }
        long longValue;
        if (llIIIlIIllIIlIl(this.profilingMap.containsKey(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[7]]) ? 1 : 0)) {
            longValue = this.profilingMap.get(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[8]]);
            "".length();
            if ("  ".length() == ((0x2A ^ 0x2) & ~(0x89 ^ 0xA1))) {
                return null;
            }
        }
        else {
            longValue = 0L;
        }
        long lllllllllllllIIllllllllIlIlIllIl = longValue;
        long longValue2;
        if (llIIIlIIllIIlIl(this.profilingMap.containsKey(lllllllllllllIIllllllllIlIlIlllI) ? 1 : 0)) {
            longValue2 = this.profilingMap.get(lllllllllllllIIllllllllIlIlIlllI);
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            longValue2 = -1L;
        }
        final long lllllllllllllIIllllllllIlIlIllII = longValue2;
        final List<Result> lllllllllllllIIllllllllIlIlIlIll = (List<Result>)Lists.newArrayList();
        if (llIIIlIIllIIllI(lllllllllllllIIllllllllIlIlIlllI.length())) {
            lllllllllllllIIllllllllIlIlIlllI = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIllllllllIlIlIlllI)).append(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[9]]));
        }
        long lllllllllllllIIllllllllIlIlIlIlI = 0L;
        final Iterator<String> iterator = this.profilingMap.keySet().iterator();
        "".length();
        if (-"   ".length() > 0) {
            return null;
        }
        while (!llIIIlIIllIlIII(iterator.hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllllllllIlIlIlIIl = iterator.next();
            if (llIIIlIIllIlIll(lllllllllllllIIllllllllIlIlIlIIl.length(), lllllllllllllIIllllllllIlIlIlllI.length()) && llIIIlIIllIIlIl(lllllllllllllIIllllllllIlIlIlIIl.startsWith(lllllllllllllIIllllllllIlIlIlllI) ? 1 : 0) && llIIIlIIllIllII(lllllllllllllIIllllllllIlIlIlIIl.indexOf(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[10]], lllllllllllllIIllllllllIlIlIlllI.length() + Profiler.lIIIllIlIllIll[1]))) {
                lllllllllllllIIllllllllIlIlIlIlI += this.profilingMap.get(lllllllllllllIIllllllllIlIlIlIIl);
            }
        }
        final float lllllllllllllIIllllllllIlIlIlIII = (float)lllllllllllllIIllllllllIlIlIlIlI;
        if (llIIIlIIllIllII(llIIIlIIllIlIIl(lllllllllllllIIllllllllIlIlIlIlI, lllllllllllllIIllllllllIlIlIllII))) {
            lllllllllllllIIllllllllIlIlIlIlI = lllllllllllllIIllllllllIlIlIllII;
        }
        if (llIIIlIIllIllII(llIIIlIIllIlIIl(lllllllllllllIIllllllllIlIlIllIl, lllllllllllllIIllllllllIlIlIlIlI))) {
            lllllllllllllIIllllllllIlIlIllIl = lllllllllllllIIllllllllIlIlIlIlI;
        }
        String lllllllllllllIIllllllllIlIIllIIl = (String)this.profilingMap.keySet().iterator();
        "".length();
        if (" ".length() == "   ".length()) {
            return null;
        }
        while (!llIIIlIIllIlIII(((Iterator)lllllllllllllIIllllllllIlIIllIIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllllllllIlIlIIlll = ((Iterator<String>)lllllllllllllIIllllllllIlIIllIIl).next();
            if (llIIIlIIllIlIll(lllllllllllllIIllllllllIlIlIIlll.length(), lllllllllllllIIllllllllIlIlIlllI.length()) && llIIIlIIllIIlIl(lllllllllllllIIllllllllIlIlIIlll.startsWith(lllllllllllllIIllllllllIlIlIlllI) ? 1 : 0) && llIIIlIIllIllII(lllllllllllllIIllllllllIlIlIIlll.indexOf(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[11]], lllllllllllllIIllllllllIlIlIlllI.length() + Profiler.lIIIllIlIllIll[1]))) {
                final long lllllllllllllIIllllllllIlIlIIllI = this.profilingMap.get(lllllllllllllIIllllllllIlIlIIlll);
                final double lllllllllllllIIllllllllIlIlIIlIl = lllllllllllllIIllllllllIlIlIIllI * 100.0 / lllllllllllllIIllllllllIlIlIlIlI;
                final double lllllllllllllIIllllllllIlIlIIlII = lllllllllllllIIllllllllIlIlIIllI * 100.0 / lllllllllllllIIllllllllIlIlIllIl;
                final String lllllllllllllIIllllllllIlIlIIIll = lllllllllllllIIllllllllIlIlIIlll.substring(lllllllllllllIIllllllllIlIlIlllI.length());
                lllllllllllllIIllllllllIlIlIlIll.add(new Result(lllllllllllllIIllllllllIlIlIIIll, lllllllllllllIIllllllllIlIlIIlIl, lllllllllllllIIllllllllIlIlIIlII));
                "".length();
            }
        }
        lllllllllllllIIllllllllIlIIllIIl = (String)this.profilingMap.keySet().iterator();
        "".length();
        if ((0x62 ^ 0x67) == 0x0) {
            return null;
        }
        while (!llIIIlIIllIlIII(((Iterator)lllllllllllllIIllllllllIlIIllIIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllllllllIlIlIIIlI = ((Iterator<String>)lllllllllllllIIllllllllIlIIllIIl).next();
            this.profilingMap.put(lllllllllllllIIllllllllIlIlIIIlI, this.profilingMap.get(lllllllllllllIIllllllllIlIlIIIlI) * 999L / 1000L);
            "".length();
        }
        if (llIIIlIIllIIllI(llIIIlIIllIlIlI((float)lllllllllllllIIllllllllIlIlIlIlI, lllllllllllllIIllllllllIlIlIlIII))) {
            lllllllllllllIIllllllllIlIlIlIll.add(new Result(Profiler.lIIIllIlIllIIl[Profiler.lIIIllIlIllIll[12]], (lllllllllllllIIllllllllIlIlIlIlI - lllllllllllllIIllllllllIlIlIlIII) * 100.0 / lllllllllllllIIllllllllIlIlIlIlI, (lllllllllllllIIllllllllIlIlIlIlI - lllllllllllllIIllllllllIlIlIlIII) * 100.0 / lllllllllllllIIllllllllIlIlIllIl));
            "".length();
        }
        Collections.sort(lllllllllllllIIllllllllIlIlIlIll);
        lllllllllllllIIllllllllIlIlIlIll.add(Profiler.lIIIllIlIllIll[0], new Result(lllllllllllllIIllllllllIlIlIlllI, 100.0, lllllllllllllIIllllllllIlIlIlIlI * 100.0 / lllllllllllllIIllllllllIlIlIllIl));
        return lllllllllllllIIllllllllIlIlIlIll;
    }
    
    public static final class Result implements Comparable<Result>
    {
        private static final /* synthetic */ int[] lllIIIIlllIlll;
        public /* synthetic */ double field_76332_a;
        public /* synthetic */ String field_76331_c;
        public /* synthetic */ double field_76330_b;
        
        public Result(final String llllllllllllIllIIIIIlllllIllIlll, final double llllllllllllIllIIIIIlllllIllIIlI, final double llllllllllllIllIIIIIlllllIllIlIl) {
            this.field_76331_c = llllllllllllIllIIIIIlllllIllIlll;
            this.field_76332_a = llllllllllllIllIIIIIlllllIllIIlI;
            this.field_76330_b = llllllllllllIllIIIIIlllllIllIlIl;
        }
        
        private static int lIIlllIlIIIIIIIl(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        private static boolean lIIlllIlIIIIIIlI(final int llllllllllllIllIIIIIlllllIlIIIlI) {
            return llllllllllllIllIIIIIlllllIlIIIlI < 0;
        }
        
        @Override
        public int compareTo(final Result llllllllllllIllIIIIIlllllIlIlIll) {
            int compareTo;
            if (lIIlllIlIIIIIIlI(lIIlllIlIIIIIIII(llllllllllllIllIIIIIlllllIlIlIll.field_76332_a, this.field_76332_a))) {
                compareTo = Result.lllIIIIlllIlll[0];
                "".length();
                if ("  ".length() <= 0) {
                    return (0xE9 ^ 0xB1) & ~(0x2A ^ 0x72);
                }
            }
            else if (lIIlllIlIIIIIIll(lIIlllIlIIIIIIIl(llllllllllllIllIIIIIlllllIlIlIll.field_76332_a, this.field_76332_a))) {
                compareTo = Result.lllIIIIlllIlll[1];
                "".length();
                if (null != null) {
                    return (0x5E ^ 0x45) & ~(0x6C ^ 0x77);
                }
            }
            else {
                compareTo = llllllllllllIllIIIIIlllllIlIlIll.field_76331_c.compareTo(this.field_76331_c);
            }
            return compareTo;
        }
        
        private static int lIIlllIlIIIIIIII(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        private static boolean lIIlllIlIIIIIIll(final int llllllllllllIllIIIIIlllllIlIIIII) {
            return llllllllllllIllIIIIIlllllIlIIIII > 0;
        }
        
        public int func_76329_a() {
            return (this.field_76331_c.hashCode() & Result.lllIIIIlllIlll[2]) + Result.lllIIIIlllIlll[3];
        }
        
        static {
            lIIlllIIllllllll();
        }
        
        private static void lIIlllIIllllllll() {
            (lllIIIIlllIlll = new int[4])[0] = -" ".length();
            Result.lllIIIIlllIlll[1] = " ".length();
            Result.lllIIIIlllIlll[2] = (0xFFFFABEF & 0xAAFEBA);
            Result.lllIIIIlllIlll[3] = (-(0xFFFF979F & 0x7B7B) & (0xFFFFD75E & 0x447FFF));
        }
    }
}
