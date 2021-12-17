// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import java.net.IDN;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

public class ServerAddress
{
    private final /* synthetic */ String ipAddress;
    private static final /* synthetic */ String[] lIIlIllIlIIllI;
    private final /* synthetic */ int serverPort;
    private static final /* synthetic */ int[] lIIlIllIlIIlll;
    
    private static void llIlIIlIlIIlllI() {
        (lIIlIllIlIIlll = new int[18])[0] = ((185 + 169 - 351 + 207 ^ 66 + 57 - 37 + 47) & (0x21 ^ 0x18 ^ (0x3D ^ 0x53) ^ -" ".length()));
        ServerAddress.lIIlIllIlIIlll[1] = " ".length();
        ServerAddress.lIIlIllIlIIlll[2] = "  ".length();
        ServerAddress.lIIlIllIlIIlll[3] = "   ".length();
        ServerAddress.lIIlIllIlIIlll[4] = (-(0xFFFFFE63 & 0x15BF) & (-1 & 0x77FF));
        ServerAddress.lIIlIllIlIIlll[5] = (0xC6 ^ 0xC2);
        ServerAddress.lIIlIllIlIIlll[6] = (0xAC ^ 0x9F ^ (0x2B ^ 0x1D));
        ServerAddress.lIIlIllIlIIlll[7] = (0x79 ^ 0x7F);
        ServerAddress.lIIlIllIlIIlll[8] = (0xD8 ^ 0x8C ^ (0xD4 ^ 0x87));
        ServerAddress.lIIlIllIlIIlll[9] = (0x16 ^ 0x1E);
        ServerAddress.lIIlIllIlIIlll[10] = (0x81 ^ 0xBC ^ (0x24 ^ 0x10));
        ServerAddress.lIIlIllIlIIlll[11] = (154 + 134 - 166 + 39 ^ 110 + 168 - 163 + 56);
        ServerAddress.lIIlIllIlIIlll[12] = (0x76 ^ 0x2 ^ 107 + 94 - 104 + 30);
        ServerAddress.lIIlIllIlIIlll[13] = (0x97 ^ 0xA2 ^ (0x98 ^ 0xA1));
        ServerAddress.lIIlIllIlIIlll[14] = (156 + 88 - 94 + 10 ^ 7 + 137 - 24 + 53);
        ServerAddress.lIIlIllIlIIlll[15] = (0x2C ^ 0x22);
        ServerAddress.lIIlIllIlIIlll[16] = (" ".length() ^ (0x6A ^ 0x64));
        ServerAddress.lIIlIllIlIIlll[17] = (0x9D ^ 0x8D);
    }
    
    private static boolean llIlIIlIlIlIIII(final int lllllllllllllIIllIIlIIIIIIIIlIlI) {
        return lllllllllllllIIllIIlIIIIIIIIlIlI != 0;
    }
    
    private static String[] getServerAddress(final String lllllllllllllIIllIIlIIIIIllIIIIl) {
        try {
            final String lllllllllllllIIllIIlIIIIIllIIIII = ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[5]];
            Class.forName(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[6]]);
            "".length();
            final Hashtable lllllllllllllIIllIIlIIIIIlIlllll = new Hashtable();
            lllllllllllllIIllIIlIIIIIlIlllll.put(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[7]], ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[8]]);
            "".length();
            lllllllllllllIIllIIlIIIIIlIlllll.put(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[9]], ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[10]]);
            "".length();
            lllllllllllllIIllIIlIIIIIlIlllll.put(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[11]], ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[12]]);
            "".length();
            final InitialDirContext initialDirContext;
            final DirContext lllllllllllllIIllIIlIIIIIlIllllI = initialDirContext = new InitialDirContext(lllllllllllllIIllIIlIIIIIlIlllll);
            final String value = String.valueOf(new StringBuilder(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[13]]).append(lllllllllllllIIllIIlIIIIIllIIIIl));
            final String[] array = new String[ServerAddress.lIIlIllIlIIlll[1]];
            array[ServerAddress.lIIlIllIlIIlll[0]] = ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[14]];
            final Attributes lllllllllllllIIllIIlIIIIIlIlllIl = initialDirContext.getAttributes(value, array);
            final String[] lllllllllllllIIllIIlIIIIIlIlllII = lllllllllllllIIllIIlIIIIIlIlllIl.get(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[15]]).get().toString().split(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[16]], ServerAddress.lIIlIllIlIIlll[5]);
            final String[] array2 = new String[ServerAddress.lIIlIllIlIIlll[2]];
            array2[ServerAddress.lIIlIllIlIIlll[0]] = lllllllllllllIIllIIlIIIIIlIlllII[ServerAddress.lIIlIllIlIIlll[3]];
            array2[ServerAddress.lIIlIllIlIIlll[1]] = lllllllllllllIIllIIlIIIIIlIlllII[ServerAddress.lIIlIllIlIIlll[2]];
            return array2;
        }
        catch (Throwable lllllllllllllIIllIIlIIIIIlIllIll) {
            final String[] array3 = new String[ServerAddress.lIIlIllIlIIlll[2]];
            array3[ServerAddress.lIIlIllIlIIlll[0]] = lllllllllllllIIllIIlIIIIIllIIIIl;
            array3[ServerAddress.lIIlIllIlIIlll[1]] = Integer.toString(ServerAddress.lIIlIllIlIIlll[4]);
            return array3;
        }
    }
    
    private static String llIlIIlIlIIlIlI(final String lllllllllllllIIllIIlIIIIIIIlllll, final String lllllllllllllIIllIIlIIIIIIIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIIIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), ServerAddress.lIIlIllIlIIlll[9]), "DES");
            final Cipher lllllllllllllIIllIIlIIIIIIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIIIIIIlIIIIl.init(ServerAddress.lIIlIllIlIIlll[2], lllllllllllllIIllIIlIIIIIIlIIIlI);
            return new String(lllllllllllllIIllIIlIIIIIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIIIIIlIIIII) {
            lllllllllllllIIllIIlIIIIIIlIIIII.printStackTrace();
            return null;
        }
    }
    
    static {
        llIlIIlIlIIlllI();
        llIlIIlIlIIllIl();
    }
    
    private static String llIlIIlIlIIllII(final String lllllllllllllIIllIIlIIIIIIlIllII, final String lllllllllllllIIllIIlIIIIIIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIIIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIIIIIIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIIIIIIlIlllI.init(ServerAddress.lIIlIllIlIIlll[2], lllllllllllllIIllIIlIIIIIIlIllll);
            return new String(lllllllllllllIIllIIlIIIIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIIIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIIIIIlIllIl) {
            lllllllllllllIIllIIlIIIIIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIlIlIlIIIl(final int lllllllllllllIIllIIlIIIIIIIIlIII) {
        return lllllllllllllIIllIIlIIIIIIIIlIII > 0;
    }
    
    private static void llIlIIlIlIIllIl() {
        (lIIlIllIlIIllI = new String[ServerAddress.lIIlIllIlIIlll[17]])[ServerAddress.lIIlIllIlIIlll[0]] = llIlIIlIlIIlIlI("90g/enxeu4I=", "HEbKW");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[1]] = llIlIIlIlIIlIll("Kw==", "piYqH");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[2]] = llIlIIlIlIIlIll("CQ==", "TImaK");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[3]] = llIlIIlIlIIlIlI("iJXXvH7X6qA=", "aEvfj");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[5]] = llIlIIlIlIIlIlI("iFGmYzenSiPoh83+v55r7RLmzvKaBlu6+EpKRKIEozYSaYVg56FqUg==", "eXBIj");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[6]] = llIlIIlIlIIlIlI("QjeLqayK/nsy4KAgB2eKEy+kz8u3P31iMSHxmBNU6tI7K9iztBfg9w==", "YDHaN");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[7]] = llIlIIlIlIIllII("DJ8Znr7SqJ0P3G9XWABSW2zXj7FCw04DFk+KSiB6xiE=", "sJQxE");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[8]] = llIlIIlIlIIlIll("FywPSwoBLUwPFxAqTAEXB20mCwo3LAwRHAw3JAQaACwQHA==", "tCbey");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[9]] = llIlIIlIlIIlIll("GiwbAHkeLAAIORdjHRM4BiQJBCVeOB8N", "pMmaW");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[10]] = llIlIIlIlIIlIll("KAQaTA==", "LjivQ");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[11]] = llIlIIlIlIIlIlI("skJahbRAZyRlubVMB0/rW72/e2bxsTODsUZeiaxYT0cS5PbDO+YqsQ==", "XvFzf");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[12]] = llIlIIlIlIIlIll("fQ==", "LPAws");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[13]] = llIlIIlIlIIllII("cQgf7hRxTRCGam2e35ylGjXqtuplk/XI", "YAGXb");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[14]] = llIlIIlIlIIlIll("CSEc", "ZsJyY");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[15]] = llIlIIlIlIIlIlI("OSX5ZK+Qq5I=", "nrlpu");
        ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[16]] = llIlIIlIlIIllII("CWVZTzH9JDY=", "IDaoG");
    }
    
    public static ServerAddress func_78860_a(final String lllllllllllllIIllIIlIIIIIllIllII) {
        if (llIlIIlIlIIllll(lllllllllllllIIllIIlIIIIIllIllII)) {
            return null;
        }
        String[] lllllllllllllIIllIIlIIIIIlllIIll = lllllllllllllIIllIIlIIIIIllIllII.split(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[0]]);
        if (llIlIIlIlIlIIII(lllllllllllllIIllIIlIIIIIllIllII.startsWith(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[1]]) ? 1 : 0)) {
            final int lllllllllllllIIllIIlIIIIIlllIIlI = lllllllllllllIIllIIlIIIIIllIllII.indexOf(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[2]]);
            if (llIlIIlIlIlIIIl(lllllllllllllIIllIIlIIIIIlllIIlI)) {
                final String lllllllllllllIIllIIlIIIIIlllIIIl = lllllllllllllIIllIIlIIIIIllIllII.substring(ServerAddress.lIIlIllIlIIlll[1], lllllllllllllIIllIIlIIIIIlllIIlI);
                String lllllllllllllIIllIIlIIIIIlllIIII = lllllllllllllIIllIIlIIIIIllIllII.substring(lllllllllllllIIllIIlIIIIIlllIIlI + ServerAddress.lIIlIllIlIIlll[1]).trim();
                if (llIlIIlIlIlIIII(lllllllllllllIIllIIlIIIIIlllIIII.startsWith(ServerAddress.lIIlIllIlIIllI[ServerAddress.lIIlIllIlIIlll[3]]) ? 1 : 0) && llIlIIlIlIlIIIl(lllllllllllllIIllIIlIIIIIlllIIII.length())) {
                    lllllllllllllIIllIIlIIIIIlllIIII = lllllllllllllIIllIIlIIIIIlllIIII.substring(ServerAddress.lIIlIllIlIIlll[1]);
                    final String[] array = new String[ServerAddress.lIIlIllIlIIlll[2]];
                    array[ServerAddress.lIIlIllIlIIlll[0]] = lllllllllllllIIllIIlIIIIIlllIIIl;
                    array[ServerAddress.lIIlIllIlIIlll[1]] = lllllllllllllIIllIIlIIIIIlllIIII;
                    lllllllllllllIIllIIlIIIIIlllIIll = array;
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return null;
                    }
                }
                else {
                    final String[] array2 = new String[ServerAddress.lIIlIllIlIIlll[1]];
                    array2[ServerAddress.lIIlIllIlIIlll[0]] = lllllllllllllIIllIIlIIIIIlllIIIl;
                    lllllllllllllIIllIIlIIIIIlllIIll = array2;
                }
            }
        }
        if (llIlIIlIlIlIIlI(lllllllllllllIIllIIlIIIIIlllIIll.length, ServerAddress.lIIlIllIlIIlll[2])) {
            final String[] array3 = new String[ServerAddress.lIIlIllIlIIlll[1]];
            array3[ServerAddress.lIIlIllIlIIlll[0]] = lllllllllllllIIllIIlIIIIIllIllII;
            lllllllllllllIIllIIlIIIIIlllIIll = array3;
        }
        String lllllllllllllIIllIIlIIIIIllIllll = lllllllllllllIIllIIlIIIIIlllIIll[ServerAddress.lIIlIllIlIIlll[0]];
        int intWithDefault;
        if (llIlIIlIlIlIIlI(lllllllllllllIIllIIlIIIIIlllIIll.length, ServerAddress.lIIlIllIlIIlll[1])) {
            intWithDefault = parseIntWithDefault(lllllllllllllIIllIIlIIIIIlllIIll[ServerAddress.lIIlIllIlIIlll[1]], ServerAddress.lIIlIllIlIIlll[4]);
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else {
            intWithDefault = ServerAddress.lIIlIllIlIIlll[4];
        }
        int lllllllllllllIIllIIlIIIIIllIlllI = intWithDefault;
        if (llIlIIlIlIlIIll(lllllllllllllIIllIIlIIIIIllIlllI, ServerAddress.lIIlIllIlIIlll[4])) {
            final String[] lllllllllllllIIllIIlIIIIIllIllIl = getServerAddress(lllllllllllllIIllIIlIIIIIllIllll);
            lllllllllllllIIllIIlIIIIIllIllll = lllllllllllllIIllIIlIIIIIllIllIl[ServerAddress.lIIlIllIlIIlll[0]];
            lllllllllllllIIllIIlIIIIIllIlllI = parseIntWithDefault(lllllllllllllIIllIIlIIIIIllIllIl[ServerAddress.lIIlIllIlIIlll[1]], ServerAddress.lIIlIllIlIIlll[4]);
        }
        return new ServerAddress(lllllllllllllIIllIIlIIIIIllIllll, lllllllllllllIIllIIlIIIIIllIlllI);
    }
    
    private static String llIlIIlIlIIlIll(String lllllllllllllIIllIIlIIIIIIllllII, final String lllllllllllllIIllIIlIIIIIlIIIIII) {
        lllllllllllllIIllIIlIIIIIIllllII = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlIIIIIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIIIIIIllllll = new StringBuilder();
        final char[] lllllllllllllIIllIIlIIIIIIlllllI = lllllllllllllIIllIIlIIIIIlIIIIII.toCharArray();
        int lllllllllllllIIllIIlIIIIIIllllIl = ServerAddress.lIIlIllIlIIlll[0];
        final short lllllllllllllIIllIIlIIIIIIllIlll = (Object)lllllllllllllIIllIIlIIIIIIllllII.toCharArray();
        final long lllllllllllllIIllIIlIIIIIIllIllI = lllllllllllllIIllIIlIIIIIIllIlll.length;
        short lllllllllllllIIllIIlIIIIIIllIlIl = (short)ServerAddress.lIIlIllIlIIlll[0];
        while (llIlIIlIlIlIlII(lllllllllllllIIllIIlIIIIIIllIlIl, (int)lllllllllllllIIllIIlIIIIIIllIllI)) {
            final char lllllllllllllIIllIIlIIIIIlIIIIlI = lllllllllllllIIllIIlIIIIIIllIlll[lllllllllllllIIllIIlIIIIIIllIlIl];
            lllllllllllllIIllIIlIIIIIIllllll.append((char)(lllllllllllllIIllIIlIIIIIlIIIIlI ^ lllllllllllllIIllIIlIIIIIIlllllI[lllllllllllllIIllIIlIIIIIIllllIl % lllllllllllllIIllIIlIIIIIIlllllI.length]));
            "".length();
            ++lllllllllllllIIllIIlIIIIIIllllIl;
            ++lllllllllllllIIllIIlIIIIIIllIlIl;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIIIIIIllllll);
    }
    
    public String getIP() {
        return IDN.toASCII(this.ipAddress);
    }
    
    private static boolean llIlIIlIlIlIIlI(final int lllllllllllllIIllIIlIIIIIIIIllll, final int lllllllllllllIIllIIlIIIIIIIIlllI) {
        return lllllllllllllIIllIIlIIIIIIIIllll > lllllllllllllIIllIIlIIIIIIIIlllI;
    }
    
    private static boolean llIlIIlIlIlIIll(final int lllllllllllllIIllIIlIIIIIIIlIlll, final int lllllllllllllIIllIIlIIIIIIIlIllI) {
        return lllllllllllllIIllIIlIIIIIIIlIlll == lllllllllllllIIllIIlIIIIIIIlIllI;
    }
    
    private static boolean llIlIIlIlIIllll(final Object lllllllllllllIIllIIlIIIIIIIIllII) {
        return lllllllllllllIIllIIlIIIIIIIIllII == null;
    }
    
    private ServerAddress(final String lllllllllllllIIllIIlIIIIlIIIIIIl, final int lllllllllllllIIllIIlIIIIlIIIIIll) {
        this.ipAddress = lllllllllllllIIllIIlIIIIlIIIIIIl;
        this.serverPort = lllllllllllllIIllIIlIIIIlIIIIIll;
    }
    
    private static boolean llIlIIlIlIlIlII(final int lllllllllllllIIllIIlIIIIIIIlIIll, final int lllllllllllllIIllIIlIIIIIIIlIIlI) {
        return lllllllllllllIIllIIlIIIIIIIlIIll < lllllllllllllIIllIIlIIIIIIIlIIlI;
    }
    
    private static int parseIntWithDefault(final String lllllllllllllIIllIIlIIIIIlIIlllI, final int lllllllllllllIIllIIlIIIIIlIIllIl) {
        try {
            return Integer.parseInt(lllllllllllllIIllIIlIIIIIlIIlllI.trim());
        }
        catch (Exception lllllllllllllIIllIIlIIIIIlIIllll) {
            return lllllllllllllIIllIIlIIIIIlIIllIl;
        }
    }
    
    public int getPort() {
        return this.serverPort;
    }
}
