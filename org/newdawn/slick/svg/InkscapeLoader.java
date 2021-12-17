// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.newdawn.slick.svg.inkscape.UseProcessor;
import org.newdawn.slick.svg.inkscape.DefsProcessor;
import org.newdawn.slick.svg.inkscape.GroupProcessor;
import org.newdawn.slick.svg.inkscape.LineProcessor;
import org.newdawn.slick.svg.inkscape.PathProcessor;
import org.newdawn.slick.svg.inkscape.PolygonProcessor;
import org.newdawn.slick.svg.inkscape.EllipseProcessor;
import org.newdawn.slick.svg.inkscape.RectProcessor;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import org.xml.sax.InputSource;
import org.xml.sax.EntityResolver;
import javax.xml.parsers.DocumentBuilderFactory;
import org.newdawn.slick.geom.Transform;
import org.w3c.dom.Element;
import org.newdawn.slick.util.ResourceLoader;
import org.newdawn.slick.svg.inkscape.ElementProcessor;
import org.newdawn.slick.SlickException;
import java.io.InputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

public class InkscapeLoader implements Loader
{
    private static final /* synthetic */ int[] lIIIllIIlIIIIl;
    private /* synthetic */ Diagram diagram;
    private static final /* synthetic */ String[] lIIIllIIlIIIII;
    private static /* synthetic */ ArrayList processors;
    public static /* synthetic */ int RADIAL_TRIANGULATION_LEVEL;
    
    private static boolean llIIIIllIlIIIII(final int lllllllllllllIlIIIIIlIllIIlIIlII) {
        return lllllllllllllIlIIIIIlIllIIlIIlII != 0;
    }
    
    private static String llIIIIllIIlllII(final String lllllllllllllIlIIIIIlIllIlIIIlll, final String lllllllllllllIlIIIIIlIllIlIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIllIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIlIllIlIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIlIllIlIIlIIl.init(InkscapeLoader.lIIIllIIlIIIIl[2], lllllllllllllIlIIIIIlIllIlIIlIlI);
            return new String(lllllllllllllIlIIIIIlIllIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIllIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIllIlIIlIII) {
            lllllllllllllIlIIIIIlIllIlIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIIllIlIIIlI(final int lllllllllllllIlIIIIIlIllIIlIIlll, final int lllllllllllllIlIIIIIlIllIIlIIllI) {
        return lllllllllllllIlIIIIIlIllIIlIIlll < lllllllllllllIlIIIIIlIllIIlIIllI;
    }
    
    public static Diagram load(final InputStream lllllllllllllIlIIIIIlIlllIIllIIl, final boolean lllllllllllllIlIIIIIlIlllIIllIlI) throws SlickException {
        return new InkscapeLoader().loadDiagram(lllllllllllllIlIIIIIlIlllIIllIIl, lllllllllllllIlIIIIIlIlllIIllIlI);
    }
    
    public static void addElementProcessor(final ElementProcessor lllllllllllllIlIIIIIlIlllIlIlIII) {
        InkscapeLoader.processors.add(lllllllllllllIlIIIIIlIlllIlIlIII);
        "".length();
    }
    
    private InkscapeLoader() {
    }
    
    public static Diagram load(final String lllllllllllllIlIIIIIlIlllIIllllI) throws SlickException {
        return load(ResourceLoader.getResourceAsStream(lllllllllllllIlIIIIIlIlllIIllllI), (boolean)(InkscapeLoader.lIIIllIIlIIIIl[0] != 0));
    }
    
    public static Diagram load(final String lllllllllllllIlIIIIIlIlllIlIIIlI, final boolean lllllllllllllIlIIIIIlIlllIlIIIll) throws SlickException {
        return load(ResourceLoader.getResourceAsStream(lllllllllllllIlIIIIIlIlllIlIIIlI), lllllllllllllIlIIIIIlIlllIlIIIll);
    }
    
    private static String llIIIIllIIlllIl(String lllllllllllllIlIIIIIlIllIIllIIlI, final String lllllllllllllIlIIIIIlIllIIllIIIl) {
        lllllllllllllIlIIIIIlIllIIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIllIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlIllIIllIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlIllIIllIlII = lllllllllllllIlIIIIIlIllIIllIIIl.toCharArray();
        int lllllllllllllIlIIIIIlIllIIllIIll = InkscapeLoader.lIIIllIIlIIIIl[0];
        final String lllllllllllllIlIIIIIlIllIIlIllIl = (Object)lllllllllllllIlIIIIIlIllIIllIIlI.toCharArray();
        final long lllllllllllllIlIIIIIlIllIIlIllII = lllllllllllllIlIIIIIlIllIIlIllIl.length;
        char lllllllllllllIlIIIIIlIllIIlIlIll = (char)InkscapeLoader.lIIIllIIlIIIIl[0];
        while (llIIIIllIlIIIlI(lllllllllllllIlIIIIIlIllIIlIlIll, (int)lllllllllllllIlIIIIIlIllIIlIllII)) {
            final char lllllllllllllIlIIIIIlIllIIlllIII = lllllllllllllIlIIIIIlIllIIlIllIl[lllllllllllllIlIIIIIlIllIIlIlIll];
            lllllllllllllIlIIIIIlIllIIllIlIl.append((char)(lllllllllllllIlIIIIIlIllIIlllIII ^ lllllllllllllIlIIIIIlIllIIllIlII[lllllllllllllIlIIIIIlIllIIllIIll % lllllllllllllIlIIIIIlIllIIllIlII.length]));
            "".length();
            ++lllllllllllllIlIIIIIlIllIIllIIll;
            ++lllllllllllllIlIIIIIlIllIIlIlIll;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlIllIIllIlIl);
    }
    
    private Diagram loadDiagram(final InputStream lllllllllllllIlIIIIIlIlllIIIllll) throws SlickException {
        return this.loadDiagram(lllllllllllllIlIIIIIlIlllIIIllll, (boolean)(InkscapeLoader.lIIIllIIlIIIIl[0] != 0));
    }
    
    private static void llIIIIllIIllllI() {
        (lIIIllIIlIIIII = new String[InkscapeLoader.lIIIllIIlIIIIl[3]])[InkscapeLoader.lIIIllIIlIIIIl[0]] = llIIIIllIIlllII("+EeDxnPb9F0=", "NsCmd");
        InkscapeLoader.lIIIllIIlIIIII[InkscapeLoader.lIIIllIIlIIIIl[1]] = llIIIIllIIlllIl("GQY/IzEF", "qcVDY");
        InkscapeLoader.lIIIllIIlIIIII[InkscapeLoader.lIIIllIIlIIIIl[2]] = llIIIIllIIlllII("FPRQUeNgl45OeMBLseKp8Q7ObXk60nTtC/Ay7xMH5wfgtDCdO1KtWw==", "lmkmF");
    }
    
    private void loadElement(final Element lllllllllllllIlIIIIIlIllIlIlIlIl, final Transform lllllllllllllIlIIIIIlIllIlIlIlII) throws ParsingException {
        int lllllllllllllIlIIIIIlIllIlIlIlll = InkscapeLoader.lIIIllIIlIIIIl[0];
        while (llIIIIllIlIIIlI(lllllllllllllIlIIIIIlIllIlIlIlll, InkscapeLoader.processors.size())) {
            final ElementProcessor lllllllllllllIlIIIIIlIllIlIllIII = InkscapeLoader.processors.get(lllllllllllllIlIIIIIlIllIlIlIlll);
            if (llIIIIllIlIIIII(lllllllllllllIlIIIIIlIllIlIllIII.handles(lllllllllllllIlIIIIIlIllIlIlIlIl) ? 1 : 0)) {
                lllllllllllllIlIIIIIlIllIlIllIII.process(this, lllllllllllllIlIIIIIlIllIlIlIlIl, this.diagram, lllllllllllllIlIIIIIlIllIlIlIlII);
            }
            ++lllllllllllllIlIIIIIlIllIlIlIlll;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private Diagram loadDiagram(final InputStream lllllllllllllIlIIIIIlIllIllllIIl, final boolean lllllllllllllIlIIIIIlIllIllllIII) throws SlickException {
        try {
            final DocumentBuilderFactory lllllllllllllIlIIIIIlIlllIIIIIll = DocumentBuilderFactory.newInstance();
            lllllllllllllIlIIIIIlIlllIIIIIll.setValidating((boolean)(InkscapeLoader.lIIIllIIlIIIIl[0] != 0));
            lllllllllllllIlIIIIIlIlllIIIIIll.setNamespaceAware((boolean)(InkscapeLoader.lIIIllIIlIIIIl[1] != 0));
            final DocumentBuilder lllllllllllllIlIIIIIlIlllIIIIIlI = lllllllllllllIlIIIIIlIlllIIIIIll.newDocumentBuilder();
            lllllllllllllIlIIIIIlIlllIIIIIlI.setEntityResolver(new EntityResolver() {
                private static final /* synthetic */ int[] lllIllIlllIlIl;
                
                public InputSource resolveEntity(final String llllllllllllIlIllIIIllIIlIIIIlll, final String llllllllllllIlIllIIIllIIlIIIIlIl) throws IOException, SAXException {
                    return new InputSource(new ByteArrayInputStream(new byte[InkscapeLoader$1.lllIllIlllIlIl[0]]));
                }
                
                private static void lIlIIlIlIlIIIIll() {
                    (lllIllIlllIlIl = new int[1])[0] = ((0x47 ^ 0xB) & ~(0x79 ^ 0x35));
                }
                
                static {
                    lIlIIlIlIlIIIIll();
                }
            });
            final Document lllllllllllllIlIIIIIlIlllIIIIIIl = lllllllllllllIlIIIIIlIlllIIIIIlI.parse(lllllllllllllIlIIIIIlIllIllllIIl);
            final Element lllllllllllllIlIIIIIlIlllIIIIIII = lllllllllllllIlIIIIIlIlllIIIIIIl.getDocumentElement();
            String lllllllllllllIlIIIIIlIllIlllllll = lllllllllllllIlIIIIIlIlllIIIIIII.getAttribute(InkscapeLoader.lIIIllIIlIIIII[InkscapeLoader.lIIIllIIlIIIIl[0]]);
            while (llIIIIllIlIIIII(Character.isLetter(lllllllllllllIlIIIIIlIllIlllllll.charAt(lllllllllllllIlIIIIIlIllIlllllll.length() - InkscapeLoader.lIIIllIIlIIIIl[1])) ? 1 : 0)) {
                lllllllllllllIlIIIIIlIllIlllllll = lllllllllllllIlIIIIIlIllIlllllll.substring(InkscapeLoader.lIIIllIIlIIIIl[0], lllllllllllllIlIIIIIlIllIlllllll.length() - InkscapeLoader.lIIIllIIlIIIIl[1]);
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            String lllllllllllllIlIIIIIlIllIllllllI = lllllllllllllIlIIIIIlIlllIIIIIII.getAttribute(InkscapeLoader.lIIIllIIlIIIII[InkscapeLoader.lIIIllIIlIIIIl[1]]);
            while (llIIIIllIlIIIII(Character.isLetter(lllllllllllllIlIIIIIlIllIllllllI.charAt(lllllllllllllIlIIIIIlIllIllllllI.length() - InkscapeLoader.lIIIllIIlIIIIl[1])) ? 1 : 0)) {
                lllllllllllllIlIIIIIlIllIllllllI = lllllllllllllIlIIIIIlIllIllllllI.substring(InkscapeLoader.lIIIllIIlIIIIl[0], lllllllllllllIlIIIIIlIllIllllllI.length() - InkscapeLoader.lIIIllIIlIIIIl[1]);
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            final float lllllllllllllIlIIIIIlIllIlllllIl = Float.parseFloat(lllllllllllllIlIIIIIlIllIlllllll);
            float lllllllllllllIlIIIIIlIllIlllllII = Float.parseFloat(lllllllllllllIlIIIIIlIllIllllllI);
            this.diagram = new Diagram(lllllllllllllIlIIIIIlIllIlllllIl, lllllllllllllIlIIIIIlIllIlllllII);
            if (llIIIIllIlIIIIl(lllllllllllllIlIIIIIlIllIllllIII ? 1 : 0)) {
                lllllllllllllIlIIIIIlIllIlllllII = 0.0f;
            }
            this.loadChildren(lllllllllllllIlIIIIIlIlllIIIIIII, Transform.createTranslateTransform(0.0f, -lllllllllllllIlIIIIIlIllIlllllII));
            return this.diagram;
        }
        catch (Exception lllllllllllllIlIIIIIlIllIllllIll) {
            throw new SlickException(InkscapeLoader.lIIIllIIlIIIII[InkscapeLoader.lIIIllIIlIIIIl[2]], lllllllllllllIlIIIIIlIllIllllIll);
        }
    }
    
    public void loadChildren(final Element lllllllllllllIlIIIIIlIllIllIIlIl, final Transform lllllllllllllIlIIIIIlIllIllIIIII) throws ParsingException {
        final NodeList lllllllllllllIlIIIIIlIllIllIIIll = lllllllllllllIlIIIIIlIllIllIIlIl.getChildNodes();
        int lllllllllllllIlIIIIIlIllIllIIlll = InkscapeLoader.lIIIllIIlIIIIl[0];
        while (llIIIIllIlIIIlI(lllllllllllllIlIIIIIlIllIllIIlll, lllllllllllllIlIIIIIlIllIllIIIll.getLength())) {
            if (llIIIIllIlIIIII((lllllllllllllIlIIIIIlIllIllIIIll.item(lllllllllllllIlIIIIIlIllIllIIlll) instanceof Element) ? 1 : 0)) {
                this.loadElement((Element)lllllllllllllIlIIIIIlIllIllIIIll.item(lllllllllllllIlIIIIIlIllIllIIlll), lllllllllllllIlIIIIIlIllIllIIIII);
            }
            ++lllllllllllllIlIIIIIlIllIllIIlll;
            "".length();
            if ("   ".length() <= ((0x6 ^ 0x2C) & ~(0x63 ^ 0x49))) {
                return;
            }
        }
    }
    
    static {
        llIIIIllIIlllll();
        llIIIIllIIllllI();
        InkscapeLoader.RADIAL_TRIANGULATION_LEVEL = InkscapeLoader.lIIIllIIlIIIIl[1];
        InkscapeLoader.processors = new ArrayList();
        addElementProcessor(new RectProcessor());
        addElementProcessor(new EllipseProcessor());
        addElementProcessor(new PolygonProcessor());
        addElementProcessor(new PathProcessor());
        addElementProcessor(new LineProcessor());
        addElementProcessor(new GroupProcessor());
        addElementProcessor(new DefsProcessor());
        addElementProcessor(new UseProcessor());
    }
    
    private static boolean llIIIIllIlIIIIl(final int lllllllllllllIlIIIIIlIllIIlIIIlI) {
        return lllllllllllllIlIIIIIlIllIIlIIIlI == 0;
    }
    
    private static void llIIIIllIIlllll() {
        (lIIIllIIlIIIIl = new int[4])[0] = ((0x61 ^ 0x40) & ~(0xE3 ^ 0xC2));
        InkscapeLoader.lIIIllIIlIIIIl[1] = " ".length();
        InkscapeLoader.lIIIllIIlIIIIl[2] = "  ".length();
        InkscapeLoader.lIIIllIIlIIIIl[3] = "   ".length();
    }
}
