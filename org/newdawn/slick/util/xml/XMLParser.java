// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.xml;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.ResourceLoader;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLParser
{
    private static final /* synthetic */ int[] llIlIlllIIlllI;
    private static /* synthetic */ DocumentBuilderFactory factory;
    private static final /* synthetic */ String[] llIlIlllIIllIl;
    
    public XMLElement parse(final String llllllllllllIllIlIIlIIIIllIIllIl, final InputStream llllllllllllIllIlIIlIIIIllIIllII) throws SlickXMLException {
        try {
            if (lIIlIlIllIlIlIlI(XMLParser.factory)) {
                XMLParser.factory = DocumentBuilderFactory.newInstance();
            }
            final DocumentBuilder llllllllllllIllIlIIlIIIIllIlIIIl = XMLParser.factory.newDocumentBuilder();
            final Document llllllllllllIllIlIIlIIIIllIlIIII = llllllllllllIllIlIIlIIIIllIlIIIl.parse(llllllllllllIllIlIIlIIIIllIIllII);
            return new XMLElement(llllllllllllIllIlIIlIIIIllIlIIII.getDocumentElement());
        }
        catch (Exception llllllllllllIllIlIIlIIIIllIIllll) {
            throw new SlickXMLException(String.valueOf(new StringBuilder().append(XMLParser.llIlIlllIIllIl[XMLParser.llIlIlllIIlllI[0]]).append(llllllllllllIllIlIIlIIIIllIIllIl)), llllllllllllIllIlIIlIIIIllIIllll);
        }
    }
    
    private static String lIIlIlIllIlIIlII(String llllllllllllIllIlIIlIIIIlIlllIII, final String llllllllllllIllIlIIlIIIIlIllIlll) {
        llllllllllllIllIlIIlIIIIlIlllIII = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlIIIIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIIIIlIlllIll = new StringBuilder();
        final char[] llllllllllllIllIlIIlIIIIlIlllIlI = llllllllllllIllIlIIlIIIIlIllIlll.toCharArray();
        int llllllllllllIllIlIIlIIIIlIlllIIl = XMLParser.llIlIlllIIlllI[0];
        final byte llllllllllllIllIlIIlIIIIlIllIIll = (Object)llllllllllllIllIlIIlIIIIlIlllIII.toCharArray();
        final String llllllllllllIllIlIIlIIIIlIllIIlI = (String)llllllllllllIllIlIIlIIIIlIllIIll.length;
        int llllllllllllIllIlIIlIIIIlIllIIIl = XMLParser.llIlIlllIIlllI[0];
        while (lIIlIlIllIlIlIll(llllllllllllIllIlIIlIIIIlIllIIIl, (int)llllllllllllIllIlIIlIIIIlIllIIlI)) {
            final char llllllllllllIllIlIIlIIIIlIlllllI = llllllllllllIllIlIIlIIIIlIllIIll[llllllllllllIllIlIIlIIIIlIllIIIl];
            llllllllllllIllIlIIlIIIIlIlllIll.append((char)(llllllllllllIllIlIIlIIIIlIlllllI ^ llllllllllllIllIlIIlIIIIlIlllIlI[llllllllllllIllIlIIlIIIIlIlllIIl % llllllllllllIllIlIIlIIIIlIlllIlI.length]));
            "".length();
            ++llllllllllllIllIlIIlIIIIlIlllIIl;
            ++llllllllllllIllIlIIlIIIIlIllIIIl;
            "".length();
            if ((0x86 ^ 0x82) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIIIIlIlllIll);
    }
    
    private static void lIIlIlIllIlIlIIl() {
        (llIlIlllIIlllI = new int[2])[0] = ((128 + 19 - 56 + 139 ^ 90 + 55 - 90 + 111) & (99 + 238 - 171 + 88 ^ 174 + 153 - 172 + 35 ^ -" ".length()));
        XMLParser.llIlIlllIIlllI[1] = " ".length();
    }
    
    private static boolean lIIlIlIllIlIlIlI(final Object llllllllllllIllIlIIlIIIIlIlIlIlI) {
        return llllllllllllIllIlIIlIIIIlIlIlIlI == null;
    }
    
    private static void lIIlIlIllIlIIllI() {
        (llIlIlllIIllIl = new String[XMLParser.llIlIlllIIlllI[1]])[XMLParser.llIlIlllIIlllI[0]] = lIIlIlIllIlIIlII("NyoGJx0VaxskWAEqHTgdUS8AKA0cLgE/QlE=", "qKoKx");
    }
    
    private static boolean lIIlIlIllIlIlIll(final int llllllllllllIllIlIIlIIIIlIlIllIl, final int llllllllllllIllIlIIlIIIIlIlIllII) {
        return llllllllllllIllIlIIlIIIIlIlIllIl < llllllllllllIllIlIIlIIIIlIlIllII;
    }
    
    public XMLElement parse(final String llllllllllllIllIlIIlIIIIllIlIllI) throws SlickException {
        return this.parse(llllllllllllIllIlIIlIIIIllIlIllI, ResourceLoader.getResourceAsStream(llllllllllllIllIlIIlIIIIllIlIllI));
    }
    
    static {
        lIIlIlIllIlIlIIl();
        lIIlIlIllIlIIllI();
    }
}
