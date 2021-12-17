// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.xml;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.Element;

public class XMLElement
{
    private /* synthetic */ Element dom;
    private /* synthetic */ XMLElementList children;
    private /* synthetic */ String name;
    private static final /* synthetic */ int[] lIIllIllIIIIII;
    private static final /* synthetic */ String[] lIIllIlIllllIl;
    
    public boolean getBooleanAttribute(final String lllllllllllllIIlIlIIlllllIIIlIll) throws SlickXMLException {
        final String lllllllllllllIIlIlIIlllllIIIllIl = this.getAttribute(lllllllllllllIIlIlIIlllllIIIlIll);
        if (llIllIIllIIIlII(lllllllllllllIIlIlIIlllllIIIllIl.equalsIgnoreCase(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[12]]) ? 1 : 0)) {
            return XMLElement.lIIllIllIIIIII[1] != 0;
        }
        if (llIllIIllIIIlII(lllllllllllllIIlIlIIlllllIIIllIl.equalsIgnoreCase(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[13]]) ? 1 : 0)) {
            return XMLElement.lIIllIllIIIIII[0] != 0;
        }
        throw new SlickXMLException(String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[14]]).append(this.getAttribute(lllllllllllllIIlIlIIlllllIIIlIll)).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[15]])));
    }
    
    public XMLElementList getChildrenByName(final String lllllllllllllIIlIlIIllllIllIIIIl) {
        final XMLElementList lllllllllllllIIlIlIIllllIllIIIII = new XMLElementList();
        final XMLElementList lllllllllllllIIlIlIIllllIlIlllll = this.getChildren();
        int lllllllllllllIIlIlIIllllIllIIIll = XMLElement.lIIllIllIIIIII[0];
        while (llIllIIllIIIIIl(lllllllllllllIIlIlIIllllIllIIIll, lllllllllllllIIlIlIIllllIlIlllll.size())) {
            if (llIllIIllIIIlII(lllllllllllllIIlIlIIllllIlIlllll.get(lllllllllllllIIlIlIIllllIllIIIll).getName().equals(lllllllllllllIIlIlIIllllIllIIIIl) ? 1 : 0)) {
                lllllllllllllIIlIlIIllllIllIIIII.add(lllllllllllllIIlIlIIllllIlIlllll.get(lllllllllllllIIlIlIIllllIllIIIll));
            }
            ++lllllllllllllIIlIlIIllllIllIIIll;
            "".length();
            if ((0x7 ^ 0x3) < 0) {
                return null;
            }
        }
        return lllllllllllllIIlIlIIllllIllIIIII;
    }
    
    public String getContent() {
        String lllllllllllllIIlIlIIllllIlllIlll = XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[22]];
        final NodeList lllllllllllllIIlIlIIllllIlllIllI = this.dom.getChildNodes();
        int lllllllllllllIIlIlIIllllIllllIIl = XMLElement.lIIllIllIIIIII[0];
        while (llIllIIllIIIIIl(lllllllllllllIIlIlIIllllIllllIIl, lllllllllllllIIlIlIIllllIlllIllI.getLength())) {
            if (llIllIIllIIIlII((lllllllllllllIIlIlIIllllIlllIllI.item(lllllllllllllIIlIlIIllllIllllIIl) instanceof Text) ? 1 : 0)) {
                lllllllllllllIIlIlIIllllIlllIlll = String.valueOf(new StringBuilder().append(lllllllllllllIIlIlIIllllIlllIlll).append(lllllllllllllIIlIlIIllllIlllIllI.item(lllllllllllllIIlIlIIllllIllllIIl).getNodeValue()));
            }
            ++lllllllllllllIIlIlIIllllIllllIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return lllllllllllllIIlIlIIllllIlllIlll;
    }
    
    public int getIntAttribute(final String lllllllllllllIIlIlIIlllllIlIlIlI, final int lllllllllllllIIlIlIIlllllIlIllII) throws SlickXMLException {
        try {
            return Integer.parseInt(this.getAttribute(lllllllllllllIIlIlIIlllllIlIlIlI, String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[2]]).append(lllllllllllllIIlIlIIlllllIlIllII))));
        }
        catch (NumberFormatException lllllllllllllIIlIlIIlllllIlIllll) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[3]]).append(this.getAttribute(lllllllllllllIIlIlIIlllllIlIlIlI, String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[4]]).append(lllllllllllllIIlIlIIlllllIlIllII)))).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[5]])), lllllllllllllIIlIlIIlllllIlIllll);
        }
    }
    
    private static boolean llIllIIllIIIlII(final int lllllllllllllIIlIlIIllllIIIlIlII) {
        return lllllllllllllIIlIlIIllllIIIlIlII != 0;
    }
    
    public String[] getAttributeNames() {
        final NamedNodeMap lllllllllllllIIlIlIIllllllIlIlll = this.dom.getAttributes();
        final String[] lllllllllllllIIlIlIIllllllIlIllI = new String[lllllllllllllIIlIlIIllllllIlIlll.getLength()];
        int lllllllllllllIIlIlIIllllllIllIIl = XMLElement.lIIllIllIIIIII[0];
        while (llIllIIllIIIIIl(lllllllllllllIIlIlIIllllllIllIIl, lllllllllllllIIlIlIIllllllIlIllI.length)) {
            lllllllllllllIIlIlIIllllllIlIllI[lllllllllllllIIlIlIIllllllIllIIl] = lllllllllllllIIlIlIIllllllIlIlll.item(lllllllllllllIIlIlIIllllllIllIIl).getNodeName();
            ++lllllllllllllIIlIlIIllllllIllIIl;
            "".length();
            if (((0x90 ^ 0xB4) & ~(0x4A ^ 0x6E)) < 0) {
                return null;
            }
        }
        return lllllllllllllIIlIlIIllllllIlIllI;
    }
    
    private static String llIllIIlIllIIIl(String lllllllllllllIIlIlIIllllIIlIlIIl, final String lllllllllllllIIlIlIIllllIIlIIIll) {
        lllllllllllllIIlIlIIllllIIlIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIllllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIllllIIlIIlll = new StringBuilder();
        final char[] lllllllllllllIIlIlIIllllIIlIIllI = lllllllllllllIIlIlIIllllIIlIIIll.toCharArray();
        int lllllllllllllIIlIlIIllllIIlIIlIl = XMLElement.lIIllIllIIIIII[0];
        final byte lllllllllllllIIlIlIIllllIIIlllll = (Object)lllllllllllllIIlIlIIllllIIlIlIIl.toCharArray();
        final double lllllllllllllIIlIlIIllllIIIllllI = lllllllllllllIIlIlIIllllIIIlllll.length;
        Exception lllllllllllllIIlIlIIllllIIIlllIl = (Exception)XMLElement.lIIllIllIIIIII[0];
        while (llIllIIllIIIIIl((int)lllllllllllllIIlIlIIllllIIIlllIl, (int)lllllllllllllIIlIlIIllllIIIllllI)) {
            final char lllllllllllllIIlIlIIllllIIlIlIlI = lllllllllllllIIlIlIIllllIIIlllll[lllllllllllllIIlIlIIllllIIIlllIl];
            lllllllllllllIIlIlIIllllIIlIIlll.append((char)(lllllllllllllIIlIlIIllllIIlIlIlI ^ lllllllllllllIIlIlIIllllIIlIIllI[lllllllllllllIIlIlIIllllIIlIIlIl % lllllllllllllIIlIlIIllllIIlIIllI.length]));
            "".length();
            ++lllllllllllllIIlIlIIllllIIlIIlIl;
            ++lllllllllllllIIlIlIIllllIIIlllIl;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIllllIIlIIlll);
    }
    
    private static void llIllIIlIlllIII() {
        (lIIllIlIllllIl = new String[XMLElement.lIIllIllIIIIII[27]])[XMLElement.lIIllIllIIIIII[0]] = llIllIIlIllIIIl("MzUjMy1FJionLF90aA==", "eTOFH");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[1]] = llIllIIlIllIIIl("bXELI00kPhZwDCRxCz4ZLzYHIg==", "JQbPm");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[2]] = llIllIIlIllIIlI("SPHjhTVqwl8=", "EPEfI");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[3]] = llIllIIlIllIIlI("g5L2rPUmf+b6NkhIsvbFAQ==", "ruhuM");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[4]] = llIllIIlIllIlII("bi3NJeETn0s=", "FxxRl");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[5]] = llIllIIlIllIlII("6bRKZIYNnKPB4KK/OYT5ck39UR2SVi4N", "KsxMV");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[6]] = llIllIIlIllIIIl("OiMWEhFMMB8GEFZiXQ==", "lBzgt");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[7]] = llIllIIlIllIIIl("Yk8eIHorAANzO2ULGCY4KQo=", "EowSZ");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[8]] = llIllIIlIllIIIl("", "IIfZv");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[9]] = llIllIIlIllIlII("zeMW3a4XvWCvMUQk+9dmcQ==", "Lncba");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[10]] = llIllIIlIllIIIl("", "mVqJt");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[11]] = llIllIIlIllIIIl("RHQdF1ANOwBEEUMwGxESDzE=", "cTtdp");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[12]] = llIllIIlIllIIlI("sq6RAic9gTg=", "ctLni");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[13]] = llIllIIlIllIIlI("rINpvw8sUnw=", "AgsMR");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[14]] = llIllIIlIllIIlI("PWocwKhxufz+t3UQ2qaJQA==", "oXLxZ");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[15]] = llIllIIlIllIIIl("Um0uOGobIjNrK1UvKCQmECwp", "uMGKJ");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[16]] = llIllIIlIllIIIl("", "fyPYe");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[17]] = llIllIIlIllIlII("9o0wdUfH6uw=", "vBfYK");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[18]] = llIllIIlIllIlII("P5G20D/4Cig=", "SWptD");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[19]] = llIllIIlIllIIIl("MAYPHyhGFQYLKVxHRA==", "fgcjM");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[20]] = llIllIIlIllIlII("3/yEkGwXPoU=", "RBVrm");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[21]] = llIllIIlIllIIIl("UEoCGHAZBR9LMVcIBAQ8EgsF", "wjkkP");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[22]] = llIllIIlIllIIlI("CX422YMcgrU=", "dGjbh");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[23]] = llIllIIlIllIlII("shTT9i43CSo=", "WeLZt");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[24]] = llIllIIlIllIlII("d6iQBMuf1rY=", "qOQdr");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[25]] = llIllIIlIllIIlI("GbxcxlRSLoI=", "dCYEy");
        XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[26]] = llIllIIlIllIIIl("OA==", "eGnfS");
    }
    
    private static boolean llIllIIllIIIIIl(final int lllllllllllllIIlIlIIllllIIIllIIl, final int lllllllllllllIIlIlIIllllIIIllIII) {
        return lllllllllllllIIlIlIIllllIIIllIIl < lllllllllllllIIlIlIIllllIIIllIII;
    }
    
    private static boolean llIllIIllIIIIll(final int lllllllllllllIIlIlIIllllIIIlIIlI) {
        return lllllllllllllIIlIlIIllllIIIlIIlI == 0;
    }
    
    public boolean getBooleanAttribute(final String lllllllllllllIIlIlIIlllllIIIIIII, final boolean lllllllllllllIIlIlIIlllllIIIIIll) throws SlickXMLException {
        final String lllllllllllllIIlIlIIlllllIIIIIlI = this.getAttribute(lllllllllllllIIlIlIIlllllIIIIIII, String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[16]]).append(lllllllllllllIIlIlIIlllllIIIIIll)));
        if (llIllIIllIIIlII(lllllllllllllIIlIlIIlllllIIIIIlI.equalsIgnoreCase(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[17]]) ? 1 : 0)) {
            return XMLElement.lIIllIllIIIIII[1] != 0;
        }
        if (llIllIIllIIIlII(lllllllllllllIIlIlIIlllllIIIIIlI.equalsIgnoreCase(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[18]]) ? 1 : 0)) {
            return XMLElement.lIIllIllIIIIII[0] != 0;
        }
        throw new SlickXMLException(String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[19]]).append(this.getAttribute(lllllllllllllIIlIlIIlllllIIIIIII, String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[20]]).append(lllllllllllllIIlIlIIlllllIIIIIll)))).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[21]])));
    }
    
    private static void llIllIIllIIIIII() {
        (lIIllIllIIIIII = new int[28])[0] = ((0x2 ^ 0x2B ^ (0x68 ^ 0x9)) & (198 + 24 - 64 + 84 ^ 19 + 155 - 54 + 66 ^ -" ".length()));
        XMLElement.lIIllIllIIIIII[1] = " ".length();
        XMLElement.lIIllIllIIIIII[2] = "  ".length();
        XMLElement.lIIllIllIIIIII[3] = "   ".length();
        XMLElement.lIIllIllIIIIII[4] = (0x46 ^ 0x14 ^ (0x79 ^ 0x2F));
        XMLElement.lIIllIllIIIIII[5] = (0x54 ^ 0x5D ^ (0x4C ^ 0x40));
        XMLElement.lIIllIllIIIIII[6] = (0x6E ^ 0x66 ^ (0x9B ^ 0x95));
        XMLElement.lIIllIllIIIIII[7] = (0x55 ^ 0x76 ^ (0x9F ^ 0xBB));
        XMLElement.lIIllIllIIIIII[8] = (0x17 ^ 0x41 ^ (0x53 ^ 0xD));
        XMLElement.lIIllIllIIIIII[9] = (0x8A ^ 0xAC ^ (0x5D ^ 0x72));
        XMLElement.lIIllIllIIIIII[10] = (0xC9 ^ 0xC3);
        XMLElement.lIIllIllIIIIII[11] = (0x7 ^ 0xC);
        XMLElement.lIIllIllIIIIII[12] = (0xB9 ^ 0xB5);
        XMLElement.lIIllIllIIIIII[13] = (0x23 ^ 0x2E);
        XMLElement.lIIllIllIIIIII[14] = (0x54 ^ 0x5A);
        XMLElement.lIIllIllIIIIII[15] = (0x3F ^ 0x49 ^ (0x4D ^ 0x34));
        XMLElement.lIIllIllIIIIII[16] = (0x4B ^ 0x10 ^ (0x37 ^ 0x7C));
        XMLElement.lIIllIllIIIIII[17] = (2 + 35 + 60 + 36 ^ 22 + 49 + 38 + 39);
        XMLElement.lIIllIllIIIIII[18] = (0x5F ^ 0xC ^ (0x46 ^ 0x7));
        XMLElement.lIIllIllIIIIII[19] = (0x72 ^ 0x61);
        XMLElement.lIIllIllIIIIII[20] = (0x1 ^ 0x15);
        XMLElement.lIIllIllIIIIII[21] = (0x0 ^ 0x15);
        XMLElement.lIIllIllIIIIII[22] = (0x63 ^ 0x31 ^ (0xF0 ^ 0xB4));
        XMLElement.lIIllIllIIIIII[23] = (0xA9 ^ 0xBE);
        XMLElement.lIIllIllIIIIII[24] = (0x65 ^ 0x7D);
        XMLElement.lIIllIllIIIIII[25] = (0x21 ^ 0xA ^ (0x29 ^ 0x1B));
        XMLElement.lIIllIllIIIIII[26] = (0xE ^ 0x63 ^ (0x4 ^ 0x73));
        XMLElement.lIIllIllIIIIII[27] = (0xDC ^ 0xC7);
    }
    
    private static boolean llIllIIllIIIIlI(final Object lllllllllllllIIlIlIIllllIIIlIllI) {
        return lllllllllllllIIlIlIIllllIIIlIllI != null;
    }
    
    public double getDoubleAttribute(final String lllllllllllllIIlIlIIlllllIlIIIII) throws SlickXMLException {
        try {
            return Double.parseDouble(this.getAttribute(lllllllllllllIIlIlIIlllllIlIIIII));
        }
        catch (NumberFormatException lllllllllllllIIlIlIIlllllIlIIlII) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[6]]).append(this.getAttribute(lllllllllllllIIlIlIIlllllIlIIIII)).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[7]])), lllllllllllllIIlIlIIlllllIlIIlII);
        }
    }
    
    public String getAttribute(final String lllllllllllllIIlIlIIllllllIIlIIl) {
        return this.dom.getAttribute(lllllllllllllIIlIlIIllllllIIlIIl);
    }
    
    public String getAttribute(final String lllllllllllllIIlIlIIllllllIIIIll, final String lllllllllllllIIlIlIIlllllIlllllI) {
        final String lllllllllllllIIlIlIIllllllIIIIIl = this.dom.getAttribute(lllllllllllllIIlIlIIllllllIIIIll);
        if (!llIllIIllIIIIlI(lllllllllllllIIlIlIIllllllIIIIIl) || llIllIIllIIIIll(lllllllllllllIIlIlIIllllllIIIIIl.length())) {
            return lllllllllllllIIlIlIIlllllIlllllI;
        }
        return lllllllllllllIIlIlIIllllllIIIIIl;
    }
    
    public XMLElementList getChildren() {
        if (llIllIIllIIIIlI(this.children)) {
            return this.children;
        }
        final NodeList lllllllllllllIIlIlIIllllIllIllII = this.dom.getChildNodes();
        this.children = new XMLElementList();
        int lllllllllllllIIlIlIIllllIllIlllI = XMLElement.lIIllIllIIIIII[0];
        while (llIllIIllIIIIIl(lllllllllllllIIlIlIIllllIllIlllI, lllllllllllllIIlIlIIllllIllIllII.getLength())) {
            if (llIllIIllIIIlII((lllllllllllllIIlIlIIllllIllIllII.item(lllllllllllllIIlIlIIllllIllIlllI) instanceof Element) ? 1 : 0)) {
                this.children.add(new XMLElement((Element)lllllllllllllIIlIlIIllllIllIllII.item(lllllllllllllIIlIlIIllllIllIlllI)));
            }
            ++lllllllllllllIIlIlIIllllIllIlllI;
            "".length();
            if (((0xA3 ^ 0x84 ^ (0x25 ^ 0x41)) & (96 + 73 - 41 + 1 ^ 32 + 150 - 143 + 155 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return this.children;
    }
    
    private static String llIllIIlIllIlII(final String lllllllllllllIIlIlIIllllIlIIIllI, final String lllllllllllllIIlIlIIllllIlIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIllllIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIllllIlIIIIll.getBytes(StandardCharsets.UTF_8)), XMLElement.lIIllIllIIIIII[8]), "DES");
            final Cipher lllllllllllllIIlIlIIllllIlIIlIII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIllllIlIIlIII.init(XMLElement.lIIllIllIIIIII[2], lllllllllllllIIlIlIIllllIlIIlIIl);
            return new String(lllllllllllllIIlIlIIllllIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIllllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIllllIlIIIlll) {
            lllllllllllllIIlIlIIllllIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    private static String llIllIIlIllIIlI(final String lllllllllllllIIlIlIIllllIIllIlll, final String lllllllllllllIIlIlIIllllIIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIllllIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIllllIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIIllllIIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIIllllIIlllIll.init(XMLElement.lIIllIllIIIIII[2], lllllllllllllIIlIlIIllllIIllllII);
            return new String(lllllllllllllIIlIlIIllllIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIllllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIllllIIlllIlI) {
            lllllllllllllIIlIlIIllllIIlllIlI.printStackTrace();
            return null;
        }
    }
    
    public double getDoubleAttribute(final String lllllllllllllIIlIlIIlllllIIllIII, final double lllllllllllllIIlIlIIlllllIIlIlII) throws SlickXMLException {
        try {
            return Double.parseDouble(this.getAttribute(lllllllllllllIIlIlIIlllllIIllIII, String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[8]]).append(lllllllllllllIIlIlIIlllllIIlIlII))));
        }
        catch (NumberFormatException lllllllllllllIIlIlIIlllllIIllIlI) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[9]]).append(this.getAttribute(lllllllllllllIIlIlIIlllllIIllIII, String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[10]]).append(lllllllllllllIIlIlIIlllllIIlIlII)))).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[11]])), lllllllllllllIIlIlIIlllllIIllIlI);
        }
    }
    
    public int getIntAttribute(final String lllllllllllllIIlIlIIlllllIllIlIl) throws SlickXMLException {
        try {
            return Integer.parseInt(this.getAttribute(lllllllllllllIIlIlIIlllllIllIlIl));
        }
        catch (NumberFormatException lllllllllllllIIlIlIIlllllIlllIIl) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[0]]).append(this.getAttribute(lllllllllllllIIlIlIIlllllIllIlIl)).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[1]])), lllllllllllllIIlIlIIlllllIlllIIl);
        }
    }
    
    XMLElement(final Element lllllllllllllIIlIlIIlllllllIIIII) {
        this.dom = lllllllllllllIIlIlIIlllllllIIIII;
        this.name = this.dom.getTagName();
    }
    
    static {
        llIllIIllIIIIII();
        llIllIIlIlllIII();
    }
    
    @Override
    public String toString() {
        String lllllllllllllIIlIlIIllllIlIlIIll = String.valueOf(new StringBuilder().append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[23]]).append(this.getName()));
        final String[] lllllllllllllIIlIlIIllllIlIlIIlI = this.getAttributeNames();
        int lllllllllllllIIlIlIIllllIlIlIlIl = XMLElement.lIIllIllIIIIII[0];
        while (llIllIIllIIIIIl(lllllllllllllIIlIlIIllllIlIlIlIl, lllllllllllllIIlIlIIllllIlIlIIlI.length)) {
            lllllllllllllIIlIlIIllllIlIlIIll = String.valueOf(new StringBuilder().append(lllllllllllllIIlIlIIllllIlIlIIll).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[24]]).append(lllllllllllllIIlIlIIllllIlIlIIlI[lllllllllllllIIlIlIIllllIlIlIlIl]).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[25]]).append(this.getAttribute(lllllllllllllIIlIlIIllllIlIlIIlI[lllllllllllllIIlIlIIllllIlIlIlIl])));
            ++lllllllllllllIIlIlIIllllIlIlIlIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        lllllllllllllIIlIlIIllllIlIlIIll = String.valueOf(new StringBuilder().append(lllllllllllllIIlIlIIllllIlIlIIll).append(XMLElement.lIIllIlIllllIl[XMLElement.lIIllIllIIIIII[26]]));
        return lllllllllllllIIlIlIIllllIlIlIIll;
    }
}
