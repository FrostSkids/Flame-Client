// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.util.Set;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.TreeMap;
import java.util.HashSet;
import java.net.URL;
import java.util.Properties;
import io.netty.util.internal.PlatformDependent;
import java.util.Arrays;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class Version
{
    private final /* synthetic */ String artifactId;
    private final /* synthetic */ long commitTimeMillis;
    private final /* synthetic */ String longCommitHash;
    private final /* synthetic */ long buildTimeMillis;
    private static final /* synthetic */ String[] llIIIlIIIllIII;
    private final /* synthetic */ String artifactVersion;
    private final /* synthetic */ String repositoryStatus;
    private final /* synthetic */ String shortCommitHash;
    private static final /* synthetic */ int[] llIIIlIIIllIll;
    
    private static String lIIIlIIIllIllIlI(final String llllllllllllIlllIllIIIIllIIlIlII, final String llllllllllllIlllIllIIIIllIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIIllIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIIllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIIIllIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIIIllIIlIllI.init(Version.llIIIlIIIllIll[3], llllllllllllIlllIllIIIIllIIlIlll);
            return new String(llllllllllllIlllIllIIIIllIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIIllIIlIlIl) {
            llllllllllllIlllIllIIIIllIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] llllllllllllIlllIllIIIIlllllIIll) {
        final Iterator llllllllllllIlllIllIIIIlllllIlII = identify().values().iterator();
        while (lIIIlIIIlllIIllI(llllllllllllIlllIllIIIIlllllIlII.hasNext() ? 1 : 0)) {
            final Version llllllllllllIlllIllIIIIlllllIlIl = llllllllllllIlllIllIIIIlllllIlII.next();
            System.err.println(llllllllllllIlllIllIIIIlllllIlIl);
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
    }
    
    public String repositoryStatus() {
        return this.repositoryStatus;
    }
    
    public String shortCommitHash() {
        return this.shortCommitHash;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(this.artifactId).append((char)Version.llIIIlIIIllIll[15]).append(this.artifactVersion).append((char)Version.llIIIlIIIllIll[1]).append(this.shortCommitHash);
        String value;
        if (lIIIlIIIlllIIllI(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[16]].equals(this.repositoryStatus) ? 1 : 0)) {
            value = Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[17]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            value = String.valueOf(new StringBuilder().append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[18]]).append(this.repositoryStatus).append((char)Version.llIIIlIIIllIll[19]));
        }
        return String.valueOf(append.append(value));
    }
    
    public String artifactVersion() {
        return this.artifactVersion;
    }
    
    private static boolean lIIIlIIIlllIIllI(final int llllllllllllIlllIllIIIIllIIIIlll) {
        return llllllllllllIlllIllIIIIllIIIIlll != 0;
    }
    
    public String artifactId() {
        return this.artifactId;
    }
    
    public static Map<String, Version> identify() {
        return identify(null);
    }
    
    public long buildTimeMillis() {
        return this.buildTimeMillis;
    }
    
    private static void lIIIlIIIlllIIIII() {
        (llIIIlIIIllIII = new String[Version.llIIIlIIIllIll[26]])[Version.llIIIlIIIllIll[0]] = lIIIlIIIllIllIII("NQMcI0QxCA5NABdoJgcdDD9mFAwKNSENBwtoOBAGCCM6FgAdNQ==", "xFHbi");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[2]] = lIIIlIIIllIllIII("eTs1CCM+Ij4=", "WMPzP");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[3]] = lIIIlIIIllIllIIl("6PQekL6bMSHVRjZD3KBOOw==", "model");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[4]] = lIIIlIIIllIllIIl("c5CkELaWyJMi1D1cNoepAw==", "gMiWx");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[5]] = lIIIlIIIllIllIlI("rDf60KAIQROilkKK0IQo2UCHjPqKamHd", "TIQBV");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[6]] = lIIIlIIIllIllIlI("txLqas22VymQXQNFwN1biw==", "hdSsT");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[7]] = lIIIlIIIllIllIlI("ofRLLjIJo/ysERZkNkQe9g==", "bmEZO");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[8]] = lIIIlIIIllIllIlI("KYmVZRuVdOQ/nBxXAeHq+w==", "JMWfJ");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[9]] = lIIIlIIIllIllIlI("M5qtGaXQkiipaJBsgLSdNg==", "qTckh");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[10]] = lIIIlIIIllIllIII("fhYHKw85ASwnFjU=", "PuhFb");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[11]] = lIIIlIIIllIllIII("TSY7IyoXFjwhNQohGy0rCw==", "cUSLX");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[12]] = lIIIlIIIllIllIII("XRQqJCQwFygnKgcwJDkr", "sxEJC");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[13]] = lIIIlIIIllIllIII("QBohKQQ9HCUtHh0=", "nhDYk");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[14]] = lIIIlIIIllIllIII("MwsJL0MHP10yCmo6OGwDJ0gDJU4Q", "JrpVn");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[16]] = lIIIlIIIllIllIIl("ouxT0pwxZYQ=", "btHsy");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[17]] = lIIIlIIIllIllIlI("DyMXyeBZ8Rs=", "uxfBV");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[18]] = lIIIlIIIllIllIlI("hFWMkTGCO4UmjmK8k4jlWg==", "IbWeO");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[20]] = lIIIlIIIllIllIIl("JlYgD7XneI+RtytmJjFW0Q==", "SxuwF");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[21]] = lIIIlIIIllIllIIl("aLkNMpvrkAet8Dfw2Za5Sg==", "GrNnv");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[22]] = lIIIlIIIllIllIlI("FaIKoXu3KDO9FNbUIdRGhw==", "jwdWL");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[23]] = lIIIlIIIllIllIlI("ijRPOO/U8fhs8uQ9zsU/91wDTunjhSGY", "JoVfd");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[24]] = lIIIlIIIllIllIIl("vA+X4TIRPVdvmKEdBHg20A==", "zAHJA");
        Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[25]] = lIIIlIIIllIllIII("ah0uMSoXGyo1MDc=", "DoKAE");
    }
    
    private Version(final String llllllllllllIlllIllIIIIllllIIlll, final String llllllllllllIlllIllIIIIllllIIllI, final long llllllllllllIlllIllIIIIlllIlllIl, final long llllllllllllIlllIllIIIIllllIIlII, final String llllllllllllIlllIllIIIIlllIllIll, final String llllllllllllIlllIllIIIIlllIllIlI, final String llllllllllllIlllIllIIIIlllIllIIl) {
        this.artifactId = llllllllllllIlllIllIIIIllllIIlll;
        this.artifactVersion = llllllllllllIlllIllIIIIllllIIllI;
        this.buildTimeMillis = llllllllllllIlllIllIIIIlllIlllIl;
        this.commitTimeMillis = llllllllllllIlllIllIIIIllllIIlII;
        this.shortCommitHash = llllllllllllIlllIllIIIIlllIllIll;
        this.longCommitHash = llllllllllllIlllIllIIIIlllIllIlI;
        this.repositoryStatus = llllllllllllIlllIllIIIIlllIllIIl;
    }
    
    private static boolean lIIIlIIIlllIIlll(final int llllllllllllIlllIllIIIIllIIIIIll) {
        return llllllllllllIlllIllIIIIllIIIIIll <= 0;
    }
    
    private static long parseIso8601(final String llllllllllllIlllIllIIIIllllllIlI) {
        try {
            return new SimpleDateFormat(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[14]]).parse(llllllllllllIlllIllIIIIllllllIlI).getTime();
        }
        catch (ParseException llllllllllllIlllIllIIIIllllllIll) {
            return 0L;
        }
    }
    
    private static boolean lIIIlIIIlllIlIIl(final int llllllllllllIlllIllIIIIllIIIllII, final int llllllllllllIlllIllIIIIllIIIlIll) {
        return llllllllllllIlllIllIIIIllIIIllII < llllllllllllIlllIllIIIIllIIIlIll;
    }
    
    private static String lIIIlIIIllIllIIl(final String llllllllllllIlllIllIIIIllIlIIIIl, final String llllllllllllIlllIllIIIIllIIllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIIllIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), Version.llIIIlIIIllIll[9]), "DES");
            final Cipher llllllllllllIlllIllIIIIllIlIIIll = Cipher.getInstance("DES");
            llllllllllllIlllIllIIIIllIlIIIll.init(Version.llIIIlIIIllIll[3], llllllllllllIlllIllIIIIllIlIIlII);
            return new String(llllllllllllIlllIllIIIIllIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIIllIlIIIlI) {
            llllllllllllIlllIllIIIIllIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlIIIlllIIlII();
        lIIIlIIIlllIIIII();
        PROP_VERSION = Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[20]];
        PROP_LONG_COMMIT_HASH = Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[21]];
        PROP_COMMIT_DATE = Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[22]];
        PROP_SHORT_COMMIT_HASH = Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[23]];
        PROP_BUILD_DATE = Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[24]];
        PROP_REPO_STATUS = Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[25]];
    }
    
    public String longCommitHash() {
        return this.longCommitHash;
    }
    
    public long commitTimeMillis() {
        return this.commitTimeMillis;
    }
    
    private static boolean lIIIlIIIlllIIlIl(final Object llllllllllllIlllIllIIIIllIIIlIIl) {
        return llllllllllllIlllIllIIIIllIIIlIIl == null;
    }
    
    public static Map<String, Version> identify(ClassLoader llllllllllllIlllIllIIIlIIIIIIlIl) {
        if (lIIIlIIIlllIIlIl(llllllllllllIlllIllIIIlIIIIIIlIl)) {
            llllllllllllIlllIllIIIlIIIIIIlIl = PlatformDependent.getContextClassLoader();
        }
        final Properties llllllllllllIlllIllIIIlIIIIIlIII = new Properties();
        try {
            final Enumeration<URL> llllllllllllIlllIllIIIlIIIIlIIlI = llllllllllllIlllIllIIIlIIIIIIlIl.getResources(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[0]]);
            while (lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIlIIlI.hasMoreElements() ? 1 : 0)) {
                final URL llllllllllllIlllIllIIIlIIIIlIlII = llllllllllllIlllIllIIIlIIIIlIIlI.nextElement();
                final InputStream llllllllllllIlllIllIIIlIIIIlIIll = llllllllllllIlllIllIIIlIIIIlIlII.openStream();
                try {
                    llllllllllllIlllIllIIIlIIIIIlIII.load(llllllllllllIlllIllIIIlIIIIlIIll);
                    try {
                        llllllllllllIlllIllIIIlIIIIlIIll.close();
                        "".length();
                        if (("   ".length() & ("   ".length() ^ -" ".length())) > " ".length()) {
                            return null;
                        }
                    }
                    catch (Exception llllllllllllIlllIllIIIlIIIIlIllI) {
                        "".length();
                        if ("  ".length() >= "   ".length()) {
                            return null;
                        }
                    }
                }
                finally {
                    try {
                        llllllllllllIlllIllIIIlIIIIlIIll.close();
                        "".length();
                        if ("   ".length() < 0) {
                            return null;
                        }
                    }
                    catch (Exception ex) {}
                }
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (Exception ex2) {}
        final Set<String> llllllllllllIlllIllIIIlIIIIIIlll = new HashSet<String>();
        final Iterator llllllllllllIlllIllIIIlIIIIIllII = llllllllllllIlllIllIIIlIIIIIlIII.keySet().iterator();
        while (lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIIllII.hasNext() ? 1 : 0)) {
            final Object llllllllllllIlllIllIIIlIIIIIllIl = llllllllllllIlllIllIIIlIIIIIllII.next();
            final String llllllllllllIlllIllIIIlIIIIlIIII = (String)llllllllllllIlllIllIIIlIIIIIllIl;
            final int llllllllllllIlllIllIIIlIIIIIllll = llllllllllllIlllIllIIIlIIIIlIIII.indexOf(Version.llIIIlIIIllIll[1]);
            if (lIIIlIIIlllIIlll(llllllllllllIlllIllIIIlIIIIIllll)) {
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
                continue;
            }
            else {
                final String llllllllllllIlllIllIIIlIIIIIlllI = llllllllllllIlllIllIIIlIIIIlIIII.substring(Version.llIIIlIIIllIll[0], llllllllllllIlllIllIIIlIIIIIllll);
                if (!lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIIlIII.containsKey(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlllI).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[2]]))) ? 1 : 0) || !lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIIlIII.containsKey(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlllI).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[3]]))) ? 1 : 0) || !lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIIlIII.containsKey(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlllI).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[4]]))) ? 1 : 0) || !lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIIlIII.containsKey(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlllI).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[5]]))) ? 1 : 0) || !lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIIlIII.containsKey(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlllI).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[6]]))) ? 1 : 0)) {
                    continue;
                }
                if (lIIIlIIIlllIlIII(llllllllllllIlllIllIIIlIIIIIlIII.containsKey(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlllI).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[7]]))) ? 1 : 0)) {
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                    continue;
                }
                else {
                    llllllllllllIlllIllIIIlIIIIIIlll.add(llllllllllllIlllIllIIIlIIIIIlllI);
                    "".length();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    continue;
                }
            }
        }
        final Map<String, Version> llllllllllllIlllIllIIIlIIIIIIllI = new TreeMap<String, Version>();
        final Iterator llllllllllllIlllIllIIIlIIIIIlIlI = llllllllllllIlllIllIIIlIIIIIIlll.iterator();
        while (lIIIlIIIlllIIllI(llllllllllllIlllIllIIIlIIIIIlIlI.hasNext() ? 1 : 0)) {
            final String llllllllllllIlllIllIIIlIIIIIlIll = llllllllllllIlllIllIIIlIIIIIlIlI.next();
            llllllllllllIlllIllIIIlIIIIIIllI.put(llllllllllllIlllIllIIIlIIIIIlIll, new Version(llllllllllllIlllIllIIIlIIIIIlIll, llllllllllllIlllIllIIIlIIIIIlIII.getProperty(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlIll).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[8]]))), parseIso8601(llllllllllllIlllIllIIIlIIIIIlIII.getProperty(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlIll).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[9]])))), parseIso8601(llllllllllllIlllIllIIIlIIIIIlIII.getProperty(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlIll).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[10]])))), llllllllllllIlllIllIIIlIIIIIlIII.getProperty(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlIll).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[11]]))), llllllllllllIlllIllIIIlIIIIIlIII.getProperty(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlIll).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[12]]))), llllllllllllIlllIllIIIlIIIIIlIII.getProperty(String.valueOf(new StringBuilder().append(llllllllllllIlllIllIIIlIIIIIlIll).append(Version.llIIIlIIIllIII[Version.llIIIlIIIllIll[13]])))));
            "".length();
            "".length();
            if (((0xE3 ^ 0x98 ^ (0x78 ^ 0x48)) & (162 + 91 - 252 + 217 ^ 126 + 84 - 173 + 108 ^ -" ".length())) < 0) {
                return null;
            }
        }
        return llllllllllllIlllIllIIIlIIIIIIllI;
    }
    
    private static String lIIIlIIIllIllIII(String llllllllllllIlllIllIIIIllIllIIIl, final String llllllllllllIlllIllIIIIllIllIIII) {
        llllllllllllIlllIllIIIIllIllIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllIIIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIIIllIllIlII = new StringBuilder();
        final char[] llllllllllllIlllIllIIIIllIllIIll = llllllllllllIlllIllIIIIllIllIIII.toCharArray();
        int llllllllllllIlllIllIIIIllIllIIlI = Version.llIIIlIIIllIll[0];
        final int llllllllllllIlllIllIIIIllIlIllII = (Object)llllllllllllIlllIllIIIIllIllIIIl.toCharArray();
        final float llllllllllllIlllIllIIIIllIlIlIll = llllllllllllIlllIllIIIIllIlIllII.length;
        short llllllllllllIlllIllIIIIllIlIlIlI = (short)Version.llIIIlIIIllIll[0];
        while (lIIIlIIIlllIlIIl(llllllllllllIlllIllIIIIllIlIlIlI, (int)llllllllllllIlllIllIIIIllIlIlIll)) {
            final char llllllllllllIlllIllIIIIllIllIlll = llllllllllllIlllIllIIIIllIlIllII[llllllllllllIlllIllIIIIllIlIlIlI];
            llllllllllllIlllIllIIIIllIllIlII.append((char)(llllllllllllIlllIllIIIIllIllIlll ^ llllllllllllIlllIllIIIIllIllIIll[llllllllllllIlllIllIIIIllIllIIlI % llllllllllllIlllIllIIIIllIllIIll.length]));
            "".length();
            ++llllllllllllIlllIllIIIIllIllIIlI;
            ++llllllllllllIlllIllIIIIllIlIlIlI;
            "".length();
            if (" ".length() >= (0x6 ^ 0x2)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIIIllIllIlII);
    }
    
    private static boolean lIIIlIIIlllIlIII(final int llllllllllllIlllIllIIIIllIIIIlIl) {
        return llllllllllllIlllIllIIIIllIIIIlIl == 0;
    }
    
    private static void lIIIlIIIlllIIlII() {
        (llIIIlIIIllIll = new int[27])[0] = ((0x14 ^ 0x69 ^ (0x68 ^ 0x21)) & (93 + 67 - 136 + 109 ^ 53 + 12 - 38 + 150 ^ -" ".length()));
        Version.llIIIlIIIllIll[1] = (0x13 ^ 0x3D);
        Version.llIIIlIIIllIll[2] = " ".length();
        Version.llIIIlIIIllIll[3] = "  ".length();
        Version.llIIIlIIIllIll[4] = "   ".length();
        Version.llIIIlIIIllIll[5] = (82 + 1 - 5 + 86 ^ 67 + 107 - 22 + 8);
        Version.llIIIlIIIllIll[6] = (0x2A ^ 0xF ^ (0x7B ^ 0x5B));
        Version.llIIIlIIIllIll[7] = (0xA2 ^ 0xA4);
        Version.llIIIlIIIllIll[8] = (0x46 ^ 0x1B ^ (0xE8 ^ 0xB2));
        Version.llIIIlIIIllIll[9] = (0x6B ^ 0x63);
        Version.llIIIlIIIllIll[10] = (0xA1 ^ 0xA8);
        Version.llIIIlIIIllIll[11] = (38 + 166 - 110 + 108 ^ 84 + 178 - 162 + 92);
        Version.llIIIlIIIllIll[12] = (44 + 127 - 19 + 25 ^ 19 + 175 - 96 + 88);
        Version.llIIIlIIIllIll[13] = (0x66 ^ 0x2A ^ (0xB ^ 0x4B));
        Version.llIIIlIIIllIll[14] = (0xA7 ^ 0xAA);
        Version.llIIIlIIIllIll[15] = (0x47 ^ 0x6 ^ (0xAA ^ 0xC6));
        Version.llIIIlIIIllIll[16] = (0x4A ^ 0x44);
        Version.llIIIlIIIllIll[17] = (((0x7B ^ 0x28) & ~(0x10 ^ 0x43)) ^ (0x85 ^ 0x8A));
        Version.llIIIlIIIllIll[18] = (0x91 ^ 0x81);
        Version.llIIIlIIIllIll[19] = (0x30 ^ 0x18 ^ " ".length());
        Version.llIIIlIIIllIll[20] = (0x4B ^ 0x5A);
        Version.llIIIlIIIllIll[21] = (0x6B ^ 0x79);
        Version.llIIIlIIIllIll[22] = (0x37 ^ 0x24);
        Version.llIIIlIIIllIll[23] = (0x2C ^ 0xF ^ (0xB7 ^ 0x80));
        Version.llIIIlIIIllIll[24] = (130 + 125 - 225 + 123 ^ 67 + 58 - 26 + 41);
        Version.llIIIlIIIllIll[25] = (0x24 ^ 0x32);
        Version.llIIIlIIIllIll[26] = (0x44 ^ 0x5F ^ (0x2E ^ 0x22));
    }
}
