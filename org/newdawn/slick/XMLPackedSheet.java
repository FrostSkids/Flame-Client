// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Element;
import org.newdawn.slick.util.ResourceLoader;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;

public class XMLPackedSheet
{
    private /* synthetic */ HashMap sprites;
    private static final /* synthetic */ String[] llIlIIlIIIIlII;
    private /* synthetic */ Image image;
    private static final /* synthetic */ int[] llIlIIlIIIlIll;
    
    static {
        lIIlIIlIIlIlIIIl();
        lIIlIIlIIlIIlIll();
    }
    
    private static String lIIlIIlIIlIIlIII(final String llllllllllllIllIllIIIlllIllllIlI, final String llllllllllllIllIllIIIlllIllllIll) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlllIllllIll.getBytes(StandardCharsets.UTF_8)), XMLPackedSheet.llIlIIlIIIlIll[8]), "DES");
            final Cipher llllllllllllIllIllIIIlllIllllllI = Cipher.getInstance("DES");
            llllllllllllIllIllIIIlllIllllllI.init(XMLPackedSheet.llIlIIlIIIlIll[1], llllllllllllIllIllIIIlllIlllllll);
            return new String(llllllllllllIllIllIIIlllIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlllIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlllIlllllIl) {
            llllllllllllIllIllIIIlllIlllllIl.printStackTrace();
            return null;
        }
    }
    
    public Image getSprite(final String llllllllllllIllIllIIIllllIlIlIll) {
        return this.sprites.get(llllllllllllIllIllIIIllllIlIlIll);
    }
    
    private static String lIIlIIlIIlIIlIIl(String llllllllllllIllIllIIIllllIIllIIl, final String llllllllllllIllIllIIIllllIIlllIl) {
        llllllllllllIllIllIIIllllIIllIIl = new String(Base64.getDecoder().decode(llllllllllllIllIllIIIllllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIIllllIIlllII = new StringBuilder();
        final char[] llllllllllllIllIllIIIllllIIllIll = llllllllllllIllIllIIIllllIIlllIl.toCharArray();
        int llllllllllllIllIllIIIllllIIllIlI = XMLPackedSheet.llIlIIlIIIlIll[0];
        final float llllllllllllIllIllIIIllllIIlIlII = (Object)llllllllllllIllIllIIIllllIIllIIl.toCharArray();
        final int llllllllllllIllIllIIIllllIIlIIll = llllllllllllIllIllIIIllllIIlIlII.length;
        long llllllllllllIllIllIIIllllIIlIIlI = XMLPackedSheet.llIlIIlIIIlIll[0];
        while (lIIlIIlIIlIlIIlI((int)llllllllllllIllIllIIIllllIIlIIlI, llllllllllllIllIllIIIllllIIlIIll)) {
            final char llllllllllllIllIllIIIllllIIlllll = llllllllllllIllIllIIIllllIIlIlII[llllllllllllIllIllIIIllllIIlIIlI];
            llllllllllllIllIllIIIllllIIlllII.append((char)(llllllllllllIllIllIIIllllIIlllll ^ llllllllllllIllIllIIIllllIIllIll[llllllllllllIllIllIIIllllIIllIlI % llllllllllllIllIllIIIllllIIllIll.length]));
            "".length();
            ++llllllllllllIllIllIIIllllIIllIlI;
            ++llllllllllllIllIllIIIllllIIlIIlI;
            "".length();
            if ((0x41 ^ 0x45) == ((0x24 ^ 0x78) & ~(0x2A ^ 0x76))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIIllllIIlllII);
    }
    
    private static boolean lIIlIIlIIlIlIIlI(final int llllllllllllIllIllIIIlllIlllIlII, final int llllllllllllIllIllIIIlllIlllIIll) {
        return llllllllllllIllIllIIIlllIlllIlII < llllllllllllIllIllIIIlllIlllIIll;
    }
    
    private static String lIIlIIlIIlIIlIlI(final String llllllllllllIllIllIIIllllIIIIlll, final String llllllllllllIllIllIIIllllIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIllllIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIllllIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIIllllIIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIIllllIIIlIll.init(XMLPackedSheet.llIlIIlIIIlIll[1], llllllllllllIllIllIIIllllIIIllII);
            return new String(llllllllllllIllIllIIIllllIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIllllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIllllIIIlIlI) {
            llllllllllllIllIllIIIllllIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    public XMLPackedSheet(final String llllllllllllIllIllIIIllllIllllIl, final String llllllllllllIllIllIIIllllIllllII) throws SlickException {
        this.sprites = new HashMap();
        this.image = new Image(llllllllllllIllIllIIIllllIllllIl, (boolean)(XMLPackedSheet.llIlIIlIIIlIll[0] != 0), XMLPackedSheet.llIlIIlIIIlIll[1]);
        try {
            final DocumentBuilder llllllllllllIllIllIIIlllllIIIIlI = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            final Document llllllllllllIllIllIIIlllllIIIIIl = llllllllllllIllIllIIIlllllIIIIlI.parse(ResourceLoader.getResourceAsStream(llllllllllllIllIllIIIllllIllllII));
            final NodeList llllllllllllIllIllIIIlllllIIIIII = llllllllllllIllIllIIIlllllIIIIIl.getElementsByTagName(XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[0]]);
            int llllllllllllIllIllIIIlllllIIIIll = XMLPackedSheet.llIlIIlIIIlIll[0];
            while (lIIlIIlIIlIlIIlI(llllllllllllIllIllIIIlllllIIIIll, llllllllllllIllIllIIIlllllIIIIII.getLength())) {
                final Element llllllllllllIllIllIIIlllllIIlIIl = (Element)llllllllllllIllIllIIIlllllIIIIII.item(llllllllllllIllIllIIIlllllIIIIll);
                final String llllllllllllIllIllIIIlllllIIlIII = llllllllllllIllIllIIIlllllIIlIIl.getAttribute(XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[2]]);
                final int llllllllllllIllIllIIIlllllIIIlll = Integer.parseInt(llllllllllllIllIllIIIlllllIIlIIl.getAttribute(XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[1]]));
                final int llllllllllllIllIllIIIlllllIIIllI = Integer.parseInt(llllllllllllIllIllIIIlllllIIlIIl.getAttribute(XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[3]]));
                final int llllllllllllIllIllIIIlllllIIIlIl = Integer.parseInt(llllllllllllIllIllIIIlllllIIlIIl.getAttribute(XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[4]]));
                final int llllllllllllIllIllIIIlllllIIIlII = Integer.parseInt(llllllllllllIllIllIIIlllllIIlIIl.getAttribute(XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[5]]));
                this.sprites.put(llllllllllllIllIllIIIlllllIIlIII, this.image.getSubImage(llllllllllllIllIllIIIlllllIIIlll, llllllllllllIllIllIIIlllllIIIllI, llllllllllllIllIllIIIlllllIIIlIl, llllllllllllIllIllIIIlllllIIIlII));
                "".length();
                ++llllllllllllIllIllIIIlllllIIIIll;
                "".length();
                if ("   ".length() > (44 + 33 + 51 + 8 ^ 34 + 115 - 62 + 53)) {
                    throw null;
                }
            }
            "".length();
            if (((0xFE ^ 0x96 ^ (0x6A ^ 0x5B)) & (0x5 ^ 0x18 ^ (0xD4 ^ 0x90) ^ -" ".length())) != 0x0) {
                throw null;
            }
        }
        catch (Exception llllllllllllIllIllIIIllllIllllll) {
            throw new SlickException(XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[6]], llllllllllllIllIllIIIllllIllllll);
        }
    }
    
    private static void lIIlIIlIIlIIlIll() {
        (llIlIIlIIIIlII = new String[XMLPackedSheet.llIlIIlIIIlIll[7]])[XMLPackedSheet.llIlIIlIIIlIll[0]] = lIIlIIlIIlIIlIII("WmieqsuJpr0=", "qgYvZ");
        XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[2]] = lIIlIIlIIlIIlIIl("NBIuKQ==", "ZsCLT");
        XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[1]] = lIIlIIlIIlIIlIIl("Dw==", "wVMDs");
        XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[3]] = lIIlIIlIIlIIlIlI("nIzTbkkLVAw=", "vHPaP");
        XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[4]] = lIIlIIlIIlIIlIlI("nqZP+vXRFmI=", "LcgSN");
        XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[5]] = lIIlIIlIIlIIlIII("MfacGSaNZGQ=", "YatZf");
        XMLPackedSheet.llIlIIlIIIIlII[XMLPackedSheet.llIlIIlIIIlIll[6]] = lIIlIIlIIlIIlIII("1MSyng/D+MIZQ11WXb1j81+/vcQm6ODori/kOzaA//JJD/Tj0l8mXw==", "pFwId");
    }
    
    private static void lIIlIIlIIlIlIIIl() {
        (llIlIIlIIIlIll = new int[9])[0] = ((0xBE ^ 0xBB) & ~(0xAC ^ 0xA9));
        XMLPackedSheet.llIlIIlIIIlIll[1] = "  ".length();
        XMLPackedSheet.llIlIIlIIIlIll[2] = " ".length();
        XMLPackedSheet.llIlIIlIIIlIll[3] = "   ".length();
        XMLPackedSheet.llIlIIlIIIlIll[4] = (0x61 ^ 0x65);
        XMLPackedSheet.llIlIIlIIIlIll[5] = (0xC ^ 0x7B ^ (0x45 ^ 0x37));
        XMLPackedSheet.llIlIIlIIIlIll[6] = (0x7F ^ 0x78 ^ " ".length());
        XMLPackedSheet.llIlIIlIIIlIll[7] = (0x63 ^ 0x64);
        XMLPackedSheet.llIlIIlIIIlIll[8] = (0x43 ^ 0x59 ^ (0x4 ^ 0x16));
    }
}
