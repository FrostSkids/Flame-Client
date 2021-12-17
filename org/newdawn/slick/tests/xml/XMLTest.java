// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.xml;

import java.util.Arrays;
import org.newdawn.slick.util.xml.XMLElement;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.xml.XMLParser;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class XMLTest
{
    private static final /* synthetic */ int[] lIIlIlIlIIllII;
    private static final /* synthetic */ String[] lIIlIlIlIIIlll;
    
    private static boolean llIlIIIIlIIIIlI(final int lllllllllllllIIllIIlllllllIlllll) {
        return lllllllllllllIIllIIlllllllIlllll != 0;
    }
    
    private static void llIlIIIIIllllIl() {
        (lIIlIlIlIIIlll = new String[XMLTest.lIIlIlIlIIllII[29]])[XMLTest.lIIlIlIlIIllII[0]] = llIlIIIIIlIllII("e1l6ZGm+4er1yLkSFlo5Lw==", "GsbLA");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[1]] = llIlIIIIIlIlllI("L1to+A9//OIe9Q2uXQJ2T0HR1X6fZWwq", "AYocP");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[2]] = llIlIIIIIllIIII("NgsFPnQkDx8mB1hu", "bNVjT");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[3]] = llIlIIIIIlIlllI("oWrixQYpMxplQ8oWRxl97A==", "htDrs");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[4]] = llIlIIIIIlIllII("N4VUwbVxmhSD8qMPsrG3Xw==", "hKqjz");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[5]] = llIlIIIIIlIlllI("7Dukn1Mp9P4oboUCCaWwHw==", "RTbyo");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[6]] = llIlIIIIIllIIII("FSkeLXUHLQQ1BntM", "AlMyU");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[7]] = llIlIIIIIlIlllI("k1TBv2UrJ8jtCjABBBhuKw==", "GMWFN");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[8]] = llIlIIIIIllIIII("GAI1GDMNEydDIwkUMkIvAQs=", "lgFlW");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[9]] = llIlIIIIIlIlllI("grKwC2IUJBs+FiMEBjCjAQ==", "mLQxD");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[10]] = llIlIIIIIllIIII("Mic1EQEk", "ANXam");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[11]] = llIlIIIIIlIllII("YO/JYVoiMYc=", "KxIlR");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[12]] = llIlIIIIIlIlllI("1g9iz1Fkc4k=", "zSqPF");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[13]] = llIlIIIIIllIIII("FxYwCTITDDgLMg==", "pdQgV");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[14]] = llIlIIIIIlIlllI("mGHaxnGdsMk=", "jyKFq");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[15]] = llIlIIIIIlIllII("kFcBiBZI2TU=", "HCFZK");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[16]] = llIlIIIIIlIlllI("tjNHO9/p8Yk=", "HaveV");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[17]] = llIlIIIIIlIllII("NqeAJWmGur8=", "jTAXJ");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[18]] = llIlIIIIIlIllII("tEJSr5qiVhY=", "qgHce");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[19]] = llIlIIIIIllIIII("HTUwDwAVJAAPGQw1", "yPVnu");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[20]] = llIlIIIIIllIIII("MBAs", "QwIsy");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[21]] = llIlIIIIIlIlllI("gNk4/G2PylI=", "DkogG");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[22]] = llIlIIIIIllIIII("BiEtCz8OMB0LJhch", "bDKjJ");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[23]] = llIlIIIIIlIllII("MjX5E9f0JNY=", "LNuJM");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[24]] = llIlIIIIIllIIII("CQ==", "qdurz");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[25]] = llIlIIIIIlIllII("5R6Zu9k+Dbk=", "ZHRbQ");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[26]] = llIlIIIIIlIllII("bVA4u68KF+E=", "pdNoQ");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[27]] = llIlIIIIIlIllII("etiu3hds1e8=", "MZCze");
        XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[28]] = llIlIIIIIlIlllI("uDN63FRChHnLATEc3P4oSNr+0PuATdWeKTJGc4AvIa4C5Nq7c7o+CA==", "zIQSN");
    }
    
    static {
        llIlIIIIIllllll();
        llIlIIIIIllllIl();
    }
    
    private static String llIlIIIIIlIllII(final String lllllllllllllIIllIlIIIIIIIIIllll, final String lllllllllllllIIllIlIIIIIIIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIIIIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIIIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIIIIIIIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIIIIIIIIlIIll.init(XMLTest.lIIlIlIlIIllII[2], lllllllllllllIIllIlIIIIIIIIlIlII);
            return new String(lllllllllllllIIllIlIIIIIIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIIIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIIIIIIIlIIlI) {
            lllllllllllllIIllIlIIIIIIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void assertEquals(final float lllllllllllllIIllIlIIIIIIlIIlIll, final float lllllllllllllIIllIlIIIIIIlIIlIlI) {
        if (llIlIIIIlIIIIlI(llIlIIIIlIIIIIl(lllllllllllllIIllIlIIIIIIlIIlIll, lllllllllllllIIllIlIIIIIIlIIlIlI))) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[2]]).append(lllllllllllllIIllIlIIIIIIlIIlIll).append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[3]]).append(lllllllllllllIIllIlIIIIIIlIIlIlI)));
        }
    }
    
    private static void assertNotNull(final Object lllllllllllllIIllIlIIIIIIlIlIIIl) {
        if (llIlIIIIlIIIIII(lllllllllllllIIllIlIIIIIIlIlIIIl)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[0]]).append(lllllllllllllIIllIlIIIIIIlIlIIIl).append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[1]])));
        }
    }
    
    private static int llIlIIIIlIIIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIlIIIIlIIIlII(final int lllllllllllllIIllIIlllllllIlllIl) {
        return lllllllllllllIIllIIlllllllIlllIl == 0;
    }
    
    private static boolean llIlIIIIlIIIIll(final int lllllllllllllIIllIIlllllllIllIlI, final int lllllllllllllIIllIIlllllllIllIIl) {
        return lllllllllllllIIllIIlllllllIllIlI != lllllllllllllIIllIIlllllllIllIIl;
    }
    
    private static void assertEquals(final int lllllllllllllIIllIlIIIIIIlIIIlIl, final int lllllllllllllIIllIlIIIIIIlIIIllI) {
        if (llIlIIIIlIIIIll(lllllllllllllIIllIlIIIIIIlIIIlIl, lllllllllllllIIllIlIIIIIIlIIIllI)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[4]]).append(lllllllllllllIIllIlIIIIIIlIIIlIl).append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[5]]).append(lllllllllllllIIllIlIIIIIIlIIIllI)));
        }
    }
    
    private static boolean llIlIIIIlIIIIII(final Object lllllllllllllIIllIIllllllllIIIIl) {
        return lllllllllllllIIllIIllllllllIIIIl == null;
    }
    
    private static boolean llIlIIIIlIIIlIl(final int lllllllllllllIIllIIllllllllIIlII, final int lllllllllllllIIllIIllllllllIIIll) {
        return lllllllllllllIIllIIllllllllIIlII < lllllllllllllIIllIIllllllllIIIll;
    }
    
    private static void assertEquals(final Object lllllllllllllIIllIlIIIIIIIllllll, final Object lllllllllllllIIllIlIIIIIIlIIIIII) {
        if (llIlIIIIlIIIlII(lllllllllllllIIllIlIIIIIIIllllll.equals(lllllllllllllIIllIlIIIIIIlIIIIII) ? 1 : 0)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[6]]).append(lllllllllllllIIllIlIIIIIIIllllll).append(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[7]]).append(lllllllllllllIIllIlIIIIIIlIIIIII)));
        }
    }
    
    public static void main(final String[] lllllllllllllIIllIlIIIIIIIllIIII) throws SlickException {
        final XMLParser lllllllllllllIIllIlIIIIIIIlIllll = new XMLParser();
        final XMLElement lllllllllllllIIllIlIIIIIIIlIlllI = lllllllllllllIIllIlIIIIIIIlIllll.parse(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[8]]);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIlllI.getName(), XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[9]]);
        System.out.println(lllllllllllllIIllIlIIIIIIIlIlllI);
        assertNotNull(lllllllllllllIIllIlIIIIIIIlIlllI.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[10]]).get(XMLTest.lIIlIlIlIIllII[0]).getContent());
        System.out.println(lllllllllllllIIllIlIIIIIIIlIlllI.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[11]]).get(XMLTest.lIIlIlIlIIllII[0]).getContent());
        final XMLElement lllllllllllllIIllIlIIIIIIIlIllIl = lllllllllllllIIllIlIIIIIIIlIlllI.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[12]]).get(XMLTest.lIIlIlIlIIllII[0]);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIllIl.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[13]]).size(), XMLTest.lIIlIlIlIIllII[0]);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIllIl.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[14]]).size(), XMLTest.lIIlIlIlIIllII[2]);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIllIl.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[15]]).get(XMLTest.lIIlIlIlIIllII[0]).getChildren().size(), XMLTest.lIIlIlIlIIllII[2]);
        final XMLElement lllllllllllllIIllIlIIIIIIIlIllII = lllllllllllllIIllIlIIIIIIIlIllIl.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[16]]).get(XMLTest.lIIlIlIlIIllII[0]).getChildren().get(XMLTest.lIIlIlIlIIllII[0]);
        final String lllllllllllllIIllIlIIIIIIIlIlIll = lllllllllllllIIllIlIIIIIIIlIllII.getAttribute(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[17]]);
        final String lllllllllllllIIllIlIIIIIIIlIlIlI = lllllllllllllIIllIlIIIIIIIlIllII.getAttribute(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[18]], XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[19]]);
        final int lllllllllllllIIllIlIIIIIIIlIlIIl = lllllllllllllIIllIlIIIIIIIlIllII.getIntAttribute(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[20]]);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIlIll, XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[21]]);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIlIlI, XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[22]]);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIlIIl, XMLTest.lIIlIlIlIIllII[1]);
        final XMLElement lllllllllllllIIllIlIIIIIIIlIlIII = lllllllllllllIIllIlIIIIIIIlIlllI.getChildrenByName(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[23]]).get(XMLTest.lIIlIlIlIIllII[0]);
        final float lllllllllllllIIllIlIIIIIIIlIIlll = (float)lllllllllllllIIllIlIIIIIIIlIlIII.getDoubleAttribute(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[24]]);
        final float lllllllllllllIIllIlIIIIIIIlIIllI = (float)lllllllllllllIIllIlIIIIIIIlIlIII.getDoubleAttribute(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[25]], 1.0);
        float lllllllllllllIIllIlIIIIIIIlIIlIl = (float)lllllllllllllIIllIlIIIIIIIlIlIII.getDoubleAttribute(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[26]], 83.0);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIIlll, 5.3f);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIIllI, 5.4f);
        assertEquals(lllllllllllllIIllIlIIIIIIIlIIlIl, 83.0f);
        try {
            lllllllllllllIIllIlIIIIIIIlIIlIl = (float)lllllllllllllIIllIlIIIIIIIlIlIII.getDoubleAttribute(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[27]]);
            fail(XMLTest.lIIlIlIlIIIlll[XMLTest.lIIlIlIlIIllII[28]]);
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        catch (SlickException ex) {}
    }
    
    private static void llIlIIIIIllllll() {
        (lIIlIlIlIIllII = new int[30])[0] = ((37 + 7 + 46 + 48 ^ 93 + 147 - 122 + 51) & (62 + 92 - 40 + 28 ^ 3 + 31 + 33 + 106 ^ -" ".length()));
        XMLTest.lIIlIlIlIIllII[1] = " ".length();
        XMLTest.lIIlIlIlIIllII[2] = "  ".length();
        XMLTest.lIIlIlIlIIllII[3] = "   ".length();
        XMLTest.lIIlIlIlIIllII[4] = (0x2A ^ 0x2E);
        XMLTest.lIIlIlIlIIllII[5] = (0x4 ^ 0x1);
        XMLTest.lIIlIlIlIIllII[6] = (93 + 91 - 72 + 37 ^ 112 + 93 - 80 + 22);
        XMLTest.lIIlIlIlIIllII[7] = (0x97 ^ 0x90);
        XMLTest.lIIlIlIlIIllII[8] = (0x69 ^ 0x61);
        XMLTest.lIIlIlIlIIllII[9] = (0x84 ^ 0x8D);
        XMLTest.lIIlIlIlIIllII[10] = (0x20 ^ 0x2A);
        XMLTest.lIIlIlIlIIllII[11] = (0x5 ^ 0x7C ^ (0x6E ^ 0x1C));
        XMLTest.lIIlIlIlIIllII[12] = (82 + 154 - 72 + 1 ^ 63 + 94 - 104 + 116);
        XMLTest.lIIlIlIlIIllII[13] = (0x8 ^ 0x4A ^ (0xC0 ^ 0x8F));
        XMLTest.lIIlIlIlIIllII[14] = (0x8F ^ 0x81);
        XMLTest.lIIlIlIlIIllII[15] = (0x47 ^ 0x4 ^ (0x18 ^ 0x54));
        XMLTest.lIIlIlIlIIllII[16] = (0x63 ^ 0x30 ^ (0x79 ^ 0x3A));
        XMLTest.lIIlIlIlIIllII[17] = (0xD3 ^ 0xC2);
        XMLTest.lIIlIlIlIIllII[18] = (0x95 ^ 0x87);
        XMLTest.lIIlIlIlIIllII[19] = (0xB3 ^ 0xA0);
        XMLTest.lIIlIlIlIIllII[20] = (0x22 ^ 0x36);
        XMLTest.lIIlIlIlIIllII[21] = (0x1 ^ 0x14);
        XMLTest.lIIlIlIlIIllII[22] = (187 + 177 - 225 + 50 ^ 43 + 55 - 82 + 155);
        XMLTest.lIIlIlIlIIllII[23] = (0x54 ^ 0x43);
        XMLTest.lIIlIlIlIIllII[24] = (0x15 ^ 0xD);
        XMLTest.lIIlIlIlIIllII[25] = (0xB2 ^ 0x9F ^ (0xB6 ^ 0x82));
        XMLTest.lIIlIlIlIIllII[26] = (0x9F ^ 0x85);
        XMLTest.lIIlIlIlIIllII[27] = (0x47 ^ 0x5C);
        XMLTest.lIIlIlIlIIllII[28] = (0xDE ^ 0xC2);
        XMLTest.lIIlIlIlIIllII[29] = (0xBD ^ 0xAF ^ (0x58 ^ 0x57));
    }
    
    private static void fail(final String lllllllllllllIIllIlIIIIIIlIlIlII) {
        throw new RuntimeException(lllllllllllllIIllIlIIIIIIlIlIlII);
    }
    
    private static String llIlIIIIIlIlllI(final String lllllllllllllIIllIIllllllllIlIlI, final String lllllllllllllIIllIIllllllllIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllllllllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllllllllIlIll.getBytes(StandardCharsets.UTF_8)), XMLTest.lIIlIlIlIIllII[8]), "DES");
            final Cipher lllllllllllllIIllIIllllllllIlllI = Cipher.getInstance("DES");
            lllllllllllllIIllIIllllllllIlllI.init(XMLTest.lIIlIlIlIIllII[2], lllllllllllllIIllIIllllllllIllll);
            return new String(lllllllllllllIIllIIllllllllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllllllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllllllllIllIl) {
            lllllllllllllIIllIIllllllllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String llIlIIIIIllIIII(String lllllllllllllIIllIIlllllllllllII, final String lllllllllllllIIllIlIIIIIIIIIIIII) {
        lllllllllllllIIllIIlllllllllllII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIlllllllllllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlllllllllllll = new StringBuilder();
        final char[] lllllllllllllIIllIIllllllllllllI = lllllllllllllIIllIlIIIIIIIIIIIII.toCharArray();
        int lllllllllllllIIllIIlllllllllllIl = XMLTest.lIIlIlIlIIllII[0];
        final double lllllllllllllIIllIIlllllllllIlll = (Object)((String)lllllllllllllIIllIIlllllllllllII).toCharArray();
        final float lllllllllllllIIllIIlllllllllIllI = lllllllllllllIIllIIlllllllllIlll.length;
        int lllllllllllllIIllIIlllllllllIlIl = XMLTest.lIIlIlIlIIllII[0];
        while (llIlIIIIlIIIlIl(lllllllllllllIIllIIlllllllllIlIl, (int)lllllllllllllIIllIIlllllllllIllI)) {
            final char lllllllllllllIIllIlIIIIIIIIIIIlI = lllllllllllllIIllIIlllllllllIlll[lllllllllllllIIllIIlllllllllIlIl];
            lllllllllllllIIllIIlllllllllllll.append((char)(lllllllllllllIIllIlIIIIIIIIIIIlI ^ lllllllllllllIIllIIllllllllllllI[lllllllllllllIIllIIlllllllllllIl % lllllllllllllIIllIIllllllllllllI.length]));
            "".length();
            ++lllllllllllllIIllIIlllllllllllIl;
            ++lllllllllllllIIllIIlllllllllIlIl;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlllllllllllll);
    }
}
