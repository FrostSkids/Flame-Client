// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.particles;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.xml.transform.Transformer;
import javax.xml.transform.Result;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import java.io.Writer;
import javax.xml.transform.stream.StreamResult;
import java.io.OutputStreamWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import org.newdawn.slick.util.Log;
import org.w3c.dom.Node;
import org.newdawn.slick.geom.Vector2f;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import java.io.OutputStream;
import java.io.FileOutputStream;
import org.newdawn.slick.util.ResourceLoader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import org.newdawn.slick.Color;
import java.io.InputStream;

public class ParticleIO
{
    private static final /* synthetic */ int[] lllIIIlIlIlIII;
    private static final /* synthetic */ String[] lllIIIlIIllIll;
    
    public static ParticleSystem loadConfiguredSystem(final InputStream llllllllllllIllIIIIIlIIlIIIllIlI, final Color llllllllllllIllIIIIIlIIlIIIllIIl) throws IOException {
        return loadConfiguredSystem(llllllllllllIllIIIIIlIIlIIIllIlI, null, null, llllllllllllIllIIIIIlIIlIIIllIIl);
    }
    
    public static ConfigurableEmitter loadEmitter(final File llllllllllllIllIIIIIlIIIlIlIIIlI, final ConfigurableEmitterFactory llllllllllllIllIIIIIlIIIlIlIIIIl) throws IOException {
        return loadEmitter(new FileInputStream(llllllllllllIllIIIIIlIIIlIlIIIlI), llllllllllllIllIIIIIlIIIlIlIIIIl);
    }
    
    public static ParticleSystem loadConfiguredSystem(final String llllllllllllIllIIIIIlIIlIIIIllll, final ConfigurableEmitterFactory llllllllllllIllIIIIIlIIlIIIlIIII) throws IOException {
        return loadConfiguredSystem(ResourceLoader.getResourceAsStream(llllllllllllIllIIIIIlIIlIIIIllll), llllllllllllIllIIIIIlIIlIIIlIIII, null, null);
    }
    
    private static boolean lIIlllIlIllIllll(final Object llllllllllllIllIIIIIIllllIIllIII) {
        return llllllllllllIllIIIIIIllllIIllIII == null;
    }
    
    public static ConfigurableEmitter loadEmitter(final InputStream llllllllllllIllIIIIIlIIIlIlIlIll) throws IOException {
        return loadEmitter(llllllllllllIllIIIIIlIIIlIlIlIll, null);
    }
    
    private static boolean lIIlllIlIlllIlIl(final Object llllllllllllIllIIIIIIllllIIllIlI) {
        return llllllllllllIllIIIIIIllllIIllIlI != null;
    }
    
    private static boolean lIIlllIlIlllIIII(final int llllllllllllIllIIIIIIllllIIlIlII) {
        return llllllllllllIllIIIIIIllllIIlIlII == 0;
    }
    
    public static void saveConfiguredSystem(final File llllllllllllIllIIIIIlIIIllIlIllI, final ParticleSystem llllllllllllIllIIIIIlIIIllIlIlIl) throws IOException {
        saveConfiguredSystem(new FileOutputStream(llllllllllllIllIIIIIlIIIllIlIllI), llllllllllllIllIIIIIlIIIllIlIlIl);
    }
    
    private static Element createValueElement(final Document llllllllllllIllIIIIIlIIIIIIIlIlI, final String llllllllllllIllIIIIIlIIIIIIIlIIl, final ConfigurableEmitter.Value llllllllllllIllIIIIIlIIIIIIIllII) {
        final Element llllllllllllIllIIIIIlIIIIIIIlIll = llllllllllllIllIIIIIlIIIIIIIlIlI.createElement(llllllllllllIllIIIIIlIIIIIIIlIIl);
        if (lIIlllIlIlllIIIl((llllllllllllIllIIIIIlIIIIIIIllII instanceof ConfigurableEmitter.SimpleValue) ? 1 : 0)) {
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[118]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[119]]);
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[120]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[121]]).append(llllllllllllIllIIIIIlIIIIIIIllII.getValue(0.0f))));
            "".length();
            if ((0x3A ^ 0x3E) < ((0x72 ^ 0x60) & ~(0x88 ^ 0x9A))) {
                return null;
            }
        }
        else if (lIIlllIlIlllIIIl((llllllllllllIllIIIIIlIIIIIIIllII instanceof ConfigurableEmitter.RandomValue) ? 1 : 0)) {
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[122]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[123]]);
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[124]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[125]]).append(((ConfigurableEmitter.RandomValue)llllllllllllIllIIIIIlIIIIIIIllII).getValue())));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIlllIlIlllIIIl((llllllllllllIllIIIIIlIIIIIIIllII instanceof ConfigurableEmitter.LinearInterpolator) ? 1 : 0)) {
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[126]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[127]]);
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[128]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[129]]).append(((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIlIIIIIIIllII).getMin())));
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[130]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[131]]).append(((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIlIIIIIIIllII).getMax())));
            llllllllllllIllIIIIIlIIIIIIIlIll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[132]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[133]]).append(((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIlIIIIIIIllII).isActive())));
            final ArrayList llllllllllllIllIIIIIlIIIIIIIllll = ((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIlIIIIIIIllII).getCurve();
            int llllllllllllIllIIIIIlIIIIIIlIIII = ParticleIO.lllIIIlIlIlIII[0];
            while (lIIlllIlIlllIIlI(llllllllllllIllIIIIIlIIIIIIlIIII, llllllllllllIllIIIIIlIIIIIIIllll.size())) {
                final Vector2f llllllllllllIllIIIIIlIIIIIIlIIlI = llllllllllllIllIIIIIlIIIIIIIllll.get(llllllllllllIllIIIIIlIIIIIIlIIII);
                final Element llllllllllllIllIIIIIlIIIIIIlIIIl = llllllllllllIllIIIIIlIIIIIIIlIlI.createElement(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[134]]);
                llllllllllllIllIIIIIlIIIIIIlIIIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[135]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[136]]).append(llllllllllllIllIIIIIlIIIIIIlIIlI.x)));
                llllllllllllIllIIIIIlIIIIIIlIIIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[137]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[138]]).append(llllllllllllIllIIIIIlIIIIIIlIIlI.y)));
                llllllllllllIllIIIIIlIIIIIIIlIll.appendChild(llllllllllllIllIIIIIlIIIIIIlIIIl);
                "".length();
                ++llllllllllllIllIIIIIlIIIIIIlIIII;
                "".length();
                if ("  ".length() < -" ".length()) {
                    return null;
                }
            }
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            Log.warn(String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[139]]).append(llllllllllllIllIIIIIlIIIIIIIllII.getClass())));
        }
        return llllllllllllIllIIIIIlIIIIIIIlIll;
    }
    
    public static ParticleSystem loadConfiguredSystem(final InputStream llllllllllllIllIIIIIlIIlIIIIIlIl, final ConfigurableEmitterFactory llllllllllllIllIIIIIlIIlIIIIIIlI) throws IOException {
        return loadConfiguredSystem(llllllllllllIllIIIIIlIIlIIIIIlIl, llllllllllllIllIIIIIlIIlIIIIIIlI, null, null);
    }
    
    private static void elementToEmitter(final Element llllllllllllIllIIIIIlIIIIlIIlIll, final ConfigurableEmitter llllllllllllIllIIIIIlIIIIlIlIIIl) {
        llllllllllllIllIIIIIlIIIIlIlIIIl.name = llllllllllllIllIIIIIlIIIIlIIlIll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[29]]);
        llllllllllllIllIIIIIlIIIIlIlIIIl.setImageName(llllllllllllIllIIIIIlIIIIlIIlIll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[30]]));
        final String llllllllllllIllIIIIIlIIIIlIlIIII = llllllllllllIllIIIIIlIIIIlIIlIll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[31]]);
        llllllllllllIllIIIIIlIIIIlIlIIIl.usePoints = ParticleIO.lllIIIlIlIlIII[1];
        if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIlIIIIlIlIIII.equals(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[32]]) ? 1 : 0)) {
            llllllllllllIllIIIIIlIIIIlIlIIIl.usePoints = ParticleIO.lllIIIlIlIlIII[4];
        }
        if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIlIIIIlIlIIII.equals(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[33]]) ? 1 : 0)) {
            llllllllllllIllIIIIIlIIIIlIlIIIl.usePoints = ParticleIO.lllIIIlIlIlIII[2];
        }
        final String llllllllllllIllIIIIIlIIIIlIIllll = llllllllllllIllIIIIIlIIIIlIIlIll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[34]]);
        if (lIIlllIlIlllIlIl(llllllllllllIllIIIIIlIIIIlIIllll)) {
            llllllllllllIllIIIIIlIIIIlIlIIIl.useOriented = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[35]].equals(llllllllllllIllIIIIIlIIIIlIIllll);
        }
        final String llllllllllllIllIIIIIlIIIIlIIlllI = llllllllllllIllIIIIIlIIIIlIIlIll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[36]]);
        if (lIIlllIlIlllIlIl(llllllllllllIllIIIIIlIIIIlIIlllI)) {
            llllllllllllIllIIIIIlIIIIlIlIIIl.useAdditive = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[37]].equals(llllllllllllIllIIIIIlIIIIlIIlllI);
        }
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[38]]), llllllllllllIllIIIIIlIIIIlIlIIIl.spawnInterval);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[39]]), llllllllllllIllIIIIIlIIIIlIlIIIl.spawnCount);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[40]]), llllllllllllIllIIIIIlIIIIlIlIIIl.initialLife);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[41]]), llllllllllllIllIIIIIlIIIIlIlIIIl.initialSize);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[42]]), llllllllllllIllIIIIIlIIIIlIlIIIl.xOffset);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[43]]), llllllllllllIllIIIIIlIIIIlIlIIIl.yOffset);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[44]]), llllllllllllIllIIIIIlIIIIlIlIIIl.initialDistance);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[45]]), llllllllllllIllIIIIIlIIIIlIlIIIl.speed);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[46]]), llllllllllllIllIIIIIlIIIIlIlIIIl.length);
        parseRangeElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[47]]), llllllllllllIllIIIIIlIIIIlIlIIIl.emitCount);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[48]]), llllllllllllIllIIIIIlIIIIlIlIIIl.spread);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[49]]), llllllllllllIllIIIIIlIIIIlIlIIIl.angularOffset);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[50]]), llllllllllllIllIIIIIlIIIIlIlIIIl.growthFactor);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[51]]), llllllllllllIllIIIIIlIIIIlIlIIIl.gravityFactor);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[52]]), llllllllllllIllIIIIIlIIIIlIlIIIl.windFactor);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[53]]), llllllllllllIllIIIIIlIIIIlIlIIIl.startAlpha);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[54]]), llllllllllllIllIIIIIlIIIIlIlIIIl.endAlpha);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[55]]), llllllllllllIllIIIIIlIIIIlIlIIIl.alpha);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[56]]), llllllllllllIllIIIIIlIIIIlIlIIIl.size);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[57]]), llllllllllllIllIIIIIlIIIIlIlIIIl.velocity);
        parseValueElement(getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[58]]), llllllllllllIllIIIIIlIIIIlIlIIIl.scaleY);
        final Element llllllllllllIllIIIIIlIIIIlIIllIl = getFirstNamedElement(llllllllllllIllIIIIIlIIIIlIIlIll, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[59]]);
        final NodeList llllllllllllIllIIIIIlIIIIlIIllII = llllllllllllIllIIIIIlIIIIlIIllIl.getElementsByTagName(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[60]]);
        llllllllllllIllIIIIIlIIIIlIlIIIl.colors.clear();
        int llllllllllllIllIIIIIlIIIIlIlIIll = ParticleIO.lllIIIlIlIlIII[0];
        while (lIIlllIlIlllIIlI(llllllllllllIllIIIIIlIIIIlIlIIll, llllllllllllIllIIIIIlIIIIlIIllII.getLength())) {
            final Element llllllllllllIllIIIIIlIIIIlIllIII = (Element)llllllllllllIllIIIIIlIIIIlIIllII.item(llllllllllllIllIIIIIlIIIIlIlIIll);
            final float llllllllllllIllIIIIIlIIIIlIlIlll = Float.parseFloat(llllllllllllIllIIIIIlIIIIlIllIII.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[61]]));
            final float llllllllllllIllIIIIIlIIIIlIlIllI = Float.parseFloat(llllllllllllIllIIIIIlIIIIlIllIII.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[62]]));
            final float llllllllllllIllIIIIIlIIIIlIlIlIl = Float.parseFloat(llllllllllllIllIIIIIlIIIIlIllIII.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[63]]));
            final float llllllllllllIllIIIIIlIIIIlIlIlII = Float.parseFloat(llllllllllllIllIIIIIlIIIIlIllIII.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[64]]));
            llllllllllllIllIIIIIlIIIIlIlIIIl.addColorPoint(llllllllllllIllIIIIIlIIIIlIlIlll, new Color(llllllllllllIllIIIIIlIIIIlIlIllI, llllllllllllIllIIIIIlIIIIlIlIlIl, llllllllllllIllIIIIIlIIIIlIlIlII, 1.0f));
            ++llllllllllllIllIIIIIlIIIIlIlIIll;
            "".length();
            if (null != null) {
                return;
            }
        }
        llllllllllllIllIIIIIlIIIIlIlIIIl.replay();
    }
    
    private static boolean lIIlllIlIlllIIll(final int llllllllllllIllIIIIIIllllIlIIIIl, final int llllllllllllIllIIIIIIllllIlIIIII) {
        return llllllllllllIllIIIIIIllllIlIIIIl == llllllllllllIllIIIIIIllllIlIIIII;
    }
    
    public static void saveEmitter(final OutputStream llllllllllllIllIIIIIlIIIIllllIII, final ConfigurableEmitter llllllllllllIllIIIIIlIIIIlllIlIl) throws IOException {
        try {
            final DocumentBuilder llllllllllllIllIIIIIlIIIIlllllll = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            final Document llllllllllllIllIIIIIlIIIIllllllI = llllllllllllIllIIIIIlIIIIlllllll.newDocument();
            llllllllllllIllIIIIIlIIIIllllllI.appendChild(emitterToElement(llllllllllllIllIIIIIlIIIIllllllI, llllllllllllIllIIIIIlIIIIlllIlIl));
            "".length();
            final Result llllllllllllIllIIIIIlIIIIlllllIl = new StreamResult(new OutputStreamWriter(llllllllllllIllIIIIIlIIIIllllIII, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[25]]));
            final DOMSource llllllllllllIllIIIIIlIIIIlllllII = new DOMSource(llllllllllllIllIIIIIlIIIIllllllI);
            final TransformerFactory llllllllllllIllIIIIIlIIIIllllIll = TransformerFactory.newInstance();
            final Transformer llllllllllllIllIIIIIlIIIIllllIlI = llllllllllllIllIIIIIlIIIIllllIll.newTransformer();
            llllllllllllIllIIIIIlIIIIllllIlI.setOutputProperty(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[26]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[27]]);
            llllllllllllIllIIIIIlIIIIllllIlI.transform(llllllllllllIllIIIIIlIIIIlllllII, llllllllllllIllIIIIIlIIIIlllllIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception llllllllllllIllIIIIIlIIIIllllIIl) {
            Log.error(llllllllllllIllIIIIIlIIIIllllIIl);
            throw new IOException(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[28]]);
        }
    }
    
    private static boolean lIIlllIlIlllIIIl(final int llllllllllllIllIIIIIIllllIIlIllI) {
        return llllllllllllIllIIIIIIllllIIlIllI != 0;
    }
    
    public static ParticleSystem loadConfiguredSystem(final File llllllllllllIllIIIIIlIIlIIIllllI) throws IOException {
        return loadConfiguredSystem(new FileInputStream(llllllllllllIllIIIIIlIIlIIIllllI), null, null, null);
    }
    
    private static Element createRangeElement(final Document llllllllllllIllIIIIIlIIIIIIllllI, final String llllllllllllIllIIIIIlIIIIIlIIIIl, final ConfigurableEmitter.Range llllllllllllIllIIIIIlIIIIIIlllII) {
        final Element llllllllllllIllIIIIIlIIIIIIlllll = llllllllllllIllIIIIIlIIIIIIllllI.createElement(llllllllllllIllIIIIIlIIIIIlIIIIl);
        llllllllllllIllIIIIIlIIIIIIlllll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[112]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[113]]).append(llllllllllllIllIIIIIlIIIIIIlllII.getMin())));
        llllllllllllIllIIIIIlIIIIIIlllll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[114]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[115]]).append(llllllllllllIllIIIIIlIIIIIIlllII.getMax())));
        llllllllllllIllIIIIIlIIIIIIlllll.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[116]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[117]]).append(llllllllllllIllIIIIIlIIIIIIlllII.isEnabled())));
        return llllllllllllIllIIIIIlIIIIIIlllll;
    }
    
    public static ParticleSystem loadConfiguredSystem(final InputStream llllllllllllIllIIIIIlIIlIIIlIlII) throws IOException {
        return loadConfiguredSystem(llllllllllllIllIIIIIlIIlIIIlIlII, null, null, null);
    }
    
    private static boolean lIIlllIlIlllIIlI(final int llllllllllllIllIIIIIIllllIIlllIl, final int llllllllllllIllIIIIIIllllIIlllII) {
        return llllllllllllIllIIIIIIllllIIlllIl < llllllllllllIllIIIIIIllllIIlllII;
    }
    
    public static void saveEmitter(final File llllllllllllIllIIIIIlIIIlIIIlIIl, final ConfigurableEmitter llllllllllllIllIIIIIlIIIlIIIlIlI) throws IOException {
        saveEmitter(new FileOutputStream(llllllllllllIllIIIIIlIIIlIIIlIIl), llllllllllllIllIIIIIlIIIlIIIlIlI);
    }
    
    public static void saveConfiguredSystem(final OutputStream llllllllllllIllIIIIIlIIIlIlllllI, final ParticleSystem llllllllllllIllIIIIIlIIIlIlllIll) throws IOException {
        try {
            final DocumentBuilder llllllllllllIllIIIIIlIIIllIIIllI = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            final Document llllllllllllIllIIIIIlIIIllIIIlIl = llllllllllllIllIIIIIlIIIllIIIllI.newDocument();
            final Element element;
            final Element llllllllllllIllIIIIIlIIIllIIIlII = element = llllllllllllIllIIIIIlIIIllIIIlIl.createElement(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[11]]);
            final String s = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[12]];
            final StringBuilder append = new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[13]]);
            int b;
            if (lIIlllIlIlllIIll(llllllllllllIllIIIIIlIIIlIlllIll.getBlendingMode(), ParticleIO.lllIIIlIlIlIII[1])) {
                b = ParticleIO.lllIIIlIlIlIII[1];
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
            }
            else {
                b = ParticleIO.lllIIIlIlIlIII[0];
            }
            element.setAttribute(s, String.valueOf(append.append((boolean)(b != 0))));
            llllllllllllIllIIIIIlIIIllIIIlII.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[14]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[15]]).append(llllllllllllIllIIIIIlIIIlIlllIll.usePoints())));
            llllllllllllIllIIIIIlIIIllIIIlIl.appendChild(llllllllllllIllIIIIIlIIIllIIIlII);
            "".length();
            int llllllllllllIllIIIIIlIIIllIIIlll = ParticleIO.lllIIIlIlIlIII[0];
            while (lIIlllIlIlllIIlI(llllllllllllIllIIIIIlIIIllIIIlll, llllllllllllIllIIIIIlIIIlIlllIll.getEmitterCount())) {
                final ParticleEmitter llllllllllllIllIIIIIlIIIllIIlIII = llllllllllllIllIIIIIlIIIlIlllIll.getEmitter(llllllllllllIllIIIIIlIIIllIIIlll);
                if (!lIIlllIlIlllIIIl((llllllllllllIllIIIIIlIIIllIIlIII instanceof ConfigurableEmitter) ? 1 : 0)) {
                    throw new RuntimeException(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[16]]);
                }
                final Element llllllllllllIllIIIIIlIIIllIIlIIl = emitterToElement(llllllllllllIllIIIIIlIIIllIIIlIl, (ConfigurableEmitter)llllllllllllIllIIIIIlIIIllIIlIII);
                llllllllllllIllIIIIIlIIIllIIIlII.appendChild(llllllllllllIllIIIIIlIIIllIIlIIl);
                "".length();
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                ++llllllllllllIllIIIIIlIIIllIIIlll;
                "".length();
                if (-(0x80 ^ 0x85) >= 0) {
                    return;
                }
            }
            final Result llllllllllllIllIIIIIlIIIllIIIIll = new StreamResult(new OutputStreamWriter(llllllllllllIllIIIIIlIIIlIlllllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[17]]));
            final DOMSource llllllllllllIllIIIIIlIIIllIIIIlI = new DOMSource(llllllllllllIllIIIIIlIIIllIIIlIl);
            final TransformerFactory llllllllllllIllIIIIIlIIIllIIIIIl = TransformerFactory.newInstance();
            final Transformer llllllllllllIllIIIIIlIIIllIIIIII = llllllllllllIllIIIIIlIIIllIIIIIl.newTransformer();
            llllllllllllIllIIIIIlIIIllIIIIII.setOutputProperty(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[18]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[19]]);
            llllllllllllIllIIIIIlIIIllIIIIII.transform(llllllllllllIllIIIIIlIIIllIIIIlI, llllllllllllIllIIIIIlIIIllIIIIll);
            "".length();
            if (((0x22 ^ 0xA) & ~(0xEC ^ 0xC4)) < 0) {
                return;
            }
        }
        catch (Exception llllllllllllIllIIIIIlIIIlIllllll) {
            Log.error(llllllllllllIllIIIIIlIIIlIllllll);
            throw new IOException(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[20]]);
        }
    }
    
    private static void parseValueElement(final Element llllllllllllIllIIIIIIllllllIIllI, final ConfigurableEmitter.Value llllllllllllIllIIIIIIllllllIIlIl) {
        if (lIIlllIlIllIllll(llllllllllllIllIIIIIIllllllIIllI)) {
            return;
        }
        final String llllllllllllIllIIIIIIllllllIIlII = llllllllllllIllIIIIIIllllllIIllI.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[144]]);
        final String llllllllllllIllIIIIIIllllllIIIll = llllllllllllIllIIIIIIllllllIIllI.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[145]]);
        if (!lIIlllIlIlllIlIl(llllllllllllIllIIIIIIllllllIIlII) || lIIlllIlIlllIIII(llllllllllllIllIIIIIIllllllIIlII.length())) {
            if (lIIlllIlIlllIIIl((llllllllllllIllIIIIIIllllllIIlIl instanceof ConfigurableEmitter.SimpleValue) ? 1 : 0)) {
                ((ConfigurableEmitter.SimpleValue)llllllllllllIllIIIIIIllllllIIlIl).setValue(Float.parseFloat(llllllllllllIllIIIIIIllllllIIIll));
                "".length();
                if ((66 + 46 - 27 + 65 ^ 73 + 42 - 53 + 84) <= -" ".length()) {
                    return;
                }
            }
            else if (lIIlllIlIlllIIIl((llllllllllllIllIIIIIIllllllIIlIl instanceof ConfigurableEmitter.RandomValue) ? 1 : 0)) {
                ((ConfigurableEmitter.RandomValue)llllllllllllIllIIIIIIllllllIIlIl).setValue(Float.parseFloat(llllllllllllIllIIIIIIllllllIIIll));
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                Log.warn(String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[146]]).append(llllllllllllIllIIIIIIllllllIIllI)));
                "".length();
                if ("   ".length() < ((0x1C ^ 0x70 ^ (0x75 ^ 0x27)) & (13 + 102 - 47 + 66 ^ 88 + 137 - 221 + 180 ^ -" ".length()))) {
                    return;
                }
            }
        }
        else if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIIllllllIIlII.equals(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[147]]) ? 1 : 0)) {
            ((ConfigurableEmitter.SimpleValue)llllllllllllIllIIIIIIllllllIIlIl).setValue(Float.parseFloat(llllllllllllIllIIIIIIllllllIIIll));
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIIllllllIIlII.equals(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[148]]) ? 1 : 0)) {
            ((ConfigurableEmitter.RandomValue)llllllllllllIllIIIIIIllllllIIlIl).setValue(Float.parseFloat(llllllllllllIllIIIIIIllllllIIIll));
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIIllllllIIlII.equals(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[149]]) ? 1 : 0)) {
            final String llllllllllllIllIIIIIIllllllIlIll = llllllllllllIllIIIIIIllllllIIllI.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[150]]);
            final String llllllllllllIllIIIIIIllllllIlIlI = llllllllllllIllIIIIIIllllllIIllI.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[151]]);
            final String llllllllllllIllIIIIIIllllllIlIIl = llllllllllllIllIIIIIIllllllIIllI.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[152]]);
            final NodeList llllllllllllIllIIIIIIllllllIlIII = llllllllllllIllIIIIIIllllllIIllI.getElementsByTagName(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[153]]);
            final ArrayList llllllllllllIllIIIIIIllllllIIlll = new ArrayList();
            int llllllllllllIllIIIIIIllllllIllII = ParticleIO.lllIIIlIlIlIII[0];
            while (lIIlllIlIlllIIlI(llllllllllllIllIIIIIIllllllIllII, llllllllllllIllIIIIIIllllllIlIII.getLength())) {
                final Element llllllllllllIllIIIIIIllllllIllll = (Element)llllllllllllIllIIIIIIllllllIlIII.item(llllllllllllIllIIIIIIllllllIllII);
                final float llllllllllllIllIIIIIIllllllIlllI = Float.parseFloat(llllllllllllIllIIIIIIllllllIllll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[154]]));
                final float llllllllllllIllIIIIIIllllllIllIl = Float.parseFloat(llllllllllllIllIIIIIIllllllIllll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[155]]));
                llllllllllllIllIIIIIIllllllIIlll.add(new Vector2f(llllllllllllIllIIIIIIllllllIlllI, llllllllllllIllIIIIIIllllllIllIl));
                "".length();
                ++llllllllllllIllIIIIIIllllllIllII;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            ((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIIllllllIIlIl).setCurve(llllllllllllIllIIIIIIllllllIIlll);
            ((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIIllllllIIlIl).setMin(Integer.parseInt(llllllllllllIllIIIIIIllllllIlIll));
            ((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIIllllllIIlIl).setMax(Integer.parseInt(llllllllllllIllIIIIIIllllllIlIlI));
            ((ConfigurableEmitter.LinearInterpolator)llllllllllllIllIIIIIIllllllIIlIl).setActive(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[156]].equals(llllllllllllIllIIIIIIllllllIlIIl));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            Log.warn(String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[157]]).append(llllllllllllIllIIIIIIllllllIIlII)));
        }
    }
    
    public static ParticleSystem loadConfiguredSystem(final String llllllllllllIllIIIIIlIIlIIlIIIII) throws IOException {
        return loadConfiguredSystem(ResourceLoader.getResourceAsStream(llllllllllllIllIIIIIlIIlIIlIIIII), null, null, null);
    }
    
    private static String lIIlllIlIlIIIllI(String llllllllllllIllIIIIIIllllIlllIIl, final String llllllllllllIllIIIIIIllllIlllIII) {
        llllllllllllIllIIIIIIllllIlllIIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIIIllllIlllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIIllllIllllII = new StringBuilder();
        final char[] llllllllllllIllIIIIIIllllIlllIll = llllllllllllIllIIIIIIllllIlllIII.toCharArray();
        int llllllllllllIllIIIIIIllllIlllIlI = ParticleIO.lllIIIlIlIlIII[0];
        final boolean llllllllllllIllIIIIIIllllIllIlII = (Object)((String)llllllllllllIllIIIIIIllllIlllIIl).toCharArray();
        final short llllllllllllIllIIIIIIllllIllIIll = (short)llllllllllllIllIIIIIIllllIllIlII.length;
        long llllllllllllIllIIIIIIllllIllIIlI = ParticleIO.lllIIIlIlIlIII[0];
        while (lIIlllIlIlllIIlI((int)llllllllllllIllIIIIIIllllIllIIlI, llllllllllllIllIIIIIIllllIllIIll)) {
            final char llllllllllllIllIIIIIIllllIllllll = llllllllllllIllIIIIIIllllIllIlII[llllllllllllIllIIIIIIllllIllIIlI];
            llllllllllllIllIIIIIIllllIllllII.append((char)(llllllllllllIllIIIIIIllllIllllll ^ llllllllllllIllIIIIIIllllIlllIll[llllllllllllIllIIIIIIllllIlllIlI % llllllllllllIllIIIIIIllllIlllIll.length]));
            "".length();
            ++llllllllllllIllIIIIIIllllIlllIlI;
            ++llllllllllllIllIIIIIIllllIllIIlI;
            "".length();
            if ((0x12 ^ 0x48 ^ (0xE5 ^ 0xBA)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIIllllIllllII);
    }
    
    private static Element emitterToElement(final Document llllllllllllIllIIIIIlIIIIIlIlllI, final ConfigurableEmitter llllllllllllIllIIIIIlIIIIIlIllIl) {
        final Element llllllllllllIllIIIIIlIIIIIllIIIl = llllllllllllIllIIIIIlIIIIIlIlllI.createElement(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[65]]);
        llllllllllllIllIIIIIlIIIIIllIIIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[66]], llllllllllllIllIIIIIlIIIIIlIllIl.name);
        final Element element = llllllllllllIllIIIIIlIIIIIllIIIl;
        final String s = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[67]];
        String imageName;
        if (lIIlllIlIllIllll(llllllllllllIllIIIIIlIIIIIlIllIl.imageName)) {
            imageName = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[68]];
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else {
            imageName = llllllllllllIllIIIIIlIIIIIlIllIl.imageName;
        }
        element.setAttribute(s, imageName);
        final Element element2 = llllllllllllIllIIIIIlIIIIIllIIIl;
        final String s2 = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[69]];
        String s3;
        if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIlIIIIIlIllIl.useOriented ? 1 : 0)) {
            s3 = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[70]];
            "".length();
            if (((0x21 ^ 0x40) & ~(0xE9 ^ 0x88)) < 0) {
                return null;
            }
        }
        else {
            s3 = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[71]];
        }
        element2.setAttribute(s2, s3);
        final Element element3 = llllllllllllIllIIIIIlIIIIIllIIIl;
        final String s4 = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[72]];
        String s5;
        if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIlIIIIIlIllIl.useAdditive ? 1 : 0)) {
            s5 = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[73]];
            "".length();
            if (((0xFD ^ 0x8B ^ (0x44 ^ 0xD)) & (0xE3 ^ 0xBD ^ (0x6F ^ 0xE) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            s5 = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[74]];
        }
        element3.setAttribute(s4, s5);
        if (lIIlllIlIlllIIll(llllllllllllIllIIIIIlIIIIIlIllIl.usePoints, ParticleIO.lllIIIlIlIlIII[1])) {
            llllllllllllIllIIIIIlIIIIIllIIIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[75]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[76]]);
        }
        if (lIIlllIlIlllIIll(llllllllllllIllIIIIIlIIIIIlIllIl.usePoints, ParticleIO.lllIIIlIlIlIII[2])) {
            llllllllllllIllIIIIIlIIIIIllIIIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[77]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[78]]);
        }
        if (lIIlllIlIlllIIll(llllllllllllIllIIIIIlIIIIIlIllIl.usePoints, ParticleIO.lllIIIlIlIlIII[4])) {
            llllllllllllIllIIIIIlIIIIIllIIIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[79]], ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[80]]);
        }
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[81]], llllllllllllIllIIIIIlIIIIIlIllIl.spawnInterval));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[82]], llllllllllllIllIIIIIlIIIIIlIllIl.spawnCount));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[83]], llllllllllllIllIIIIIlIIIIIlIllIl.initialLife));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[84]], llllllllllllIllIIIIIlIIIIIlIllIl.initialSize));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[85]], llllllllllllIllIIIIIlIIIIIlIllIl.xOffset));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[86]], llllllllllllIllIIIIIlIIIIIlIllIl.yOffset));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[87]], llllllllllllIllIIIIIlIIIIIlIllIl.initialDistance));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[88]], llllllllllllIllIIIIIlIIIIIlIllIl.speed));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[89]], llllllllllllIllIIIIIlIIIIIlIllIl.length));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createRangeElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[90]], llllllllllllIllIIIIIlIIIIIlIllIl.emitCount));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[91]], llllllllllllIllIIIIIlIIIIIlIllIl.spread));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[92]], llllllllllllIllIIIIIlIIIIIlIllIl.angularOffset));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[93]], llllllllllllIllIIIIIlIIIIIlIllIl.growthFactor));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[94]], llllllllllllIllIIIIIlIIIIIlIllIl.gravityFactor));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[95]], llllllllllllIllIIIIIlIIIIIlIllIl.windFactor));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[96]], llllllllllllIllIIIIIlIIIIIlIllIl.startAlpha));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[97]], llllllllllllIllIIIIIlIIIIIlIllIl.endAlpha));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[98]], llllllllllllIllIIIIIlIIIIIlIllIl.alpha));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[99]], llllllllllllIllIIIIIlIIIIIlIllIl.size));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[100]], llllllllllllIllIIIIIlIIIIIlIllIl.velocity));
        "".length();
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(createValueElement(llllllllllllIllIIIIIlIIIIIlIlllI, ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[101]], llllllllllllIllIIIIIlIIIIIlIllIl.scaleY));
        "".length();
        final Element llllllllllllIllIIIIIlIIIIIllIIII = llllllllllllIllIIIIIlIIIIIlIlllI.createElement(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[102]]);
        final ArrayList llllllllllllIllIIIIIlIIIIIlIllll = llllllllllllIllIIIIIlIIIIIlIllIl.colors;
        int llllllllllllIllIIIIIlIIIIIllIlII = ParticleIO.lllIIIlIlIlIII[0];
        while (lIIlllIlIlllIIlI(llllllllllllIllIIIIIlIIIIIllIlII, llllllllllllIllIIIIIlIIIIIlIllll.size())) {
            final ConfigurableEmitter.ColorRecord llllllllllllIllIIIIIlIIIIIllIllI = llllllllllllIllIIIIIlIIIIIlIllll.get(llllllllllllIllIIIIIlIIIIIllIlII);
            final Element llllllllllllIllIIIIIlIIIIIllIlIl = llllllllllllIllIIIIIlIIIIIlIlllI.createElement(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[103]]);
            llllllllllllIllIIIIIlIIIIIllIlIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[104]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[105]]).append(llllllllllllIllIIIIIlIIIIIllIllI.pos)));
            llllllllllllIllIIIIIlIIIIIllIlIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[106]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[107]]).append(llllllllllllIllIIIIIlIIIIIllIllI.col.r)));
            llllllllllllIllIIIIIlIIIIIllIlIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[108]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[109]]).append(llllllllllllIllIIIIIlIIIIIllIllI.col.g)));
            llllllllllllIllIIIIIlIIIIIllIlIl.setAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[110]], String.valueOf(new StringBuilder().append(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[111]]).append(llllllllllllIllIIIIIlIIIIIllIllI.col.b)));
            llllllllllllIllIIIIIlIIIIIllIIII.appendChild(llllllllllllIllIIIIIlIIIIIllIlIl);
            "".length();
            ++llllllllllllIllIIIIIlIIIIIllIlII;
            "".length();
            if (((0xDC ^ 0x81) & ~(0xE9 ^ 0xB4)) >= " ".length()) {
                return null;
            }
        }
        llllllllllllIllIIIIIlIIIIIllIIIl.appendChild(llllllllllllIllIIIIIlIIIIIllIIII);
        "".length();
        return llllllllllllIllIIIIIlIIIIIllIIIl;
    }
    
    private static String lIIlllIlIlIIIIll(final String llllllllllllIllIIIIIIlllllIIllII, final String llllllllllllIllIIIIIIlllllIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIlllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlllllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIlllllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIlllllIlIIII.init(ParticleIO.lllIIIlIlIlIII[2], llllllllllllIllIIIIIIlllllIlIIIl);
            return new String(llllllllllllIllIIIIIIlllllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIlllllIIllll) {
            llllllllllllIllIIIIIIlllllIIllll.printStackTrace();
            return null;
        }
    }
    
    private static void parseRangeElement(final Element llllllllllllIllIIIIIlIIIIIIIIIII, final ConfigurableEmitter.Range llllllllllllIllIIIIIIlllllllllIl) {
        if (lIIlllIlIllIllll(llllllllllllIllIIIIIlIIIIIIIIIII)) {
            return;
        }
        llllllllllllIllIIIIIIlllllllllIl.setMin(Float.parseFloat(llllllllllllIllIIIIIlIIIIIIIIIII.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[140]])));
        llllllllllllIllIIIIIIlllllllllIl.setMax(Float.parseFloat(llllllllllllIllIIIIIlIIIIIIIIIII.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[141]])));
        llllllllllllIllIIIIIIlllllllllIl.setEnabled(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[142]].equals(llllllllllllIllIIIIIlIIIIIIIIIII.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[143]])));
    }
    
    private static void lIIlllIlIllIlIlI() {
        (lllIIIlIIllIll = new String[ParticleIO.lllIIIlIlIlIII[158]])[ParticleIO.lllIIIlIlIlIII[0]] = lIIlllIlIlIIIIll("ow5F0KxeqjU=", "RdjqN");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[1]] = lIIlllIlIlIIIlIl("9JDjB8G6ciTnWo6R14u2Cp+OBFVob52PNBkpv71chxg=", "YJYuI");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[2]] = lIIlllIlIlIIIIll("NhxNmZMuSukJ1SY6q9RZN91NWSnGCGvbWZZHkSVjCX0b32zG9WDx9Q==", "FygFv");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[4]] = lIIlllIlIlIIIlIl("B/aldgGfGms=", "jzgYz");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[5]] = lIIlllIlIlIIIllI("FB0eBAUcDx8=", "uyzmq");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[6]] = lIIlllIlIlIIIIll("JtKujoJTDyM=", "yXgku");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[7]] = lIIlllIlIlIIIllI("Fxs8BDUU", "gtUjA");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[8]] = lIIlllIlIlIIIlIl("XeMZANlULx0=", "LcFfX");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[9]] = lIIlllIlIlIIIlIl("P7mpJt4/d8M=", "fExNN");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[10]] = lIIlllIlIlIIIIll("Y62O2mVNGWa/XINOyTsCkF249SrGkVmJ93f5PhAOWlJEJj7ndchwPw==", "CAxbl");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[11]] = lIIlllIlIlIIIIll("uw878yE2ScA=", "ELVfE");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[12]] = lIIlllIlIlIIIIll("4z+DHlu1gW7SYR8h1PCQfQ==", "aJBAB");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[13]] = lIIlllIlIlIIIllI("", "nZyqf");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[14]] = lIIlllIlIlIIIIll("0uubQSZGBDM=", "yaxCD");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[15]] = lIIlllIlIlIIIllI("", "oxwzg");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[16]] = lIIlllIlIlIIIIll("9dsD/Yi06nyGQH0RcDdoewICH8GyEl/4ksciL7BsMwB7/r3BT7Ii5joPH7lf0MFlKe1VYZwdcWw=", "WoEKT");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[17]] = lIIlllIlIlIIIIll("IMTSaaNXD1o=", "ahCaT");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[18]] = lIIlllIlIlIIIIll("7T84X+/T9aA=", "GvPPc");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[19]] = lIIlllIlIlIIIllI("HjYJ", "gSzrK");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[20]] = lIIlllIlIlIIIlIl("TWiR05yFCmslc0ThtWzyMed3Le70FTz9wXvdM1Qo3/pF2ZIWXr2n5Jacp7FLEb7U", "qyOEq");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[21]] = lIIlllIlIlIIIIll("cVFlnGYvg24=", "hNiKg");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[22]] = lIIlllIlIlIIIIll("RxF8nbE0jas7Zj7MT9aGpBbW9ouSePV3Bcn2NDSGwzY=", "oJspv");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[23]] = lIIlllIlIlIIIIll("6nP9IGf3rs0=", "OxHNa");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[24]] = lIIlllIlIlIIIlIl("sLXH2s4L1kWRMzOt7hR8zwXHxsKo1JrV", "gQAxY");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[25]] = lIIlllIlIlIIIlIl("lkhQznLStHo=", "IlOKy");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[26]] = lIIlllIlIlIIIIll("A+cr2Xy2H0g=", "BmKin");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[27]] = lIIlllIlIlIIIIll("MXMKiVKBZk4=", "CsRvw");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[28]] = lIIlllIlIlIIIlIl("Lnr9OMuPnwvbZcyzYXedfe0Wc1VcWqn5", "tUpDL");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[29]] = lIIlllIlIlIIIllI("Pzg9Mg==", "QYPWz");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[30]] = lIIlllIlIlIIIIll("/fLcnkp6LURGMJnB4Mo0/A==", "eXXMo");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[31]] = lIIlllIlIlIIIllI("FhA5EAEWIS4EAQ==", "duWtd");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[32]] = lIIlllIlIlIIIlIl("E/Q+hXvdZkA=", "XzACC");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[33]] = lIIlllIlIlIIIIll("Kh60HHfoB3Y=", "arPno");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[34]] = lIIlllIlIlIIIlIl("IweneeH6r7gdx5R4mkklyw==", "kPvuy");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[35]] = lIIlllIlIlIIIllI("PisTKg==", "JYfOq");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[36]] = lIIlllIlIlIIIlIl("MtyoFz0lkTtnQcmOr32uEQ==", "HpoFt");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[37]] = lIIlllIlIlIIIllI("OSQdLg==", "MVhKw");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[38]] = lIIlllIlIlIIIlIl("zdtq1tFprSTqeJAbxs+fhw==", "DOAsM");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[39]] = lIIlllIlIlIIIIll("bsO06AHpzJB/7ZXWVKGY/Q==", "tMvOi");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[40]] = lIIlllIlIlIIIIll("CGA9W7BpzVML0MKCfYVA4Q==", "nUuQj");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[41]] = lIIlllIlIlIIIllI("IxssJAorGRY5GS8=", "JuEPc");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[42]] = lIIlllIlIlIIIlIl("eMJwINrhppU=", "pixDS");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[43]] = lIIlllIlIlIIIlIl("p1LaFkZDLTk=", "cbCgt");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[44]] = lIIlllIlIlIIIIll("ZHgD1GQ0wGtOjqvqX4LdfA==", "FrovE");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[45]] = lIIlllIlIlIIIlIl("FS4SBbG61P8=", "iNSRf");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[46]] = lIIlllIlIlIIIllI("FS4pBgIR", "yKGav");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[47]] = lIIlllIlIlIIIllI("ExwZIwoZBB4j", "vqpWI");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[48]] = lIIlllIlIlIIIlIl("KGj6XRkRxn0=", "ZxxtC");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[49]] = lIIlllIlIlIIIIll("SMo3UlXJ2Fw7sW2sJQU+0Q==", "ygCUp");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[50]] = lIIlllIlIlIIIllI("JhYIPQYpIgYpBi4W", "AdgJr");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[51]] = lIIlllIlIlIIIIll("3gzbwAS6KNm/HKLQnjoRxw==", "IZqAJ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[52]] = lIIlllIlIlIIIlIl("0ZmPwkYJucRFUIWyLagRJA==", "bjQKu");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[53]] = lIIlllIlIlIIIIll("GZ9MAy+W/b9dbsMUGn7dGQ==", "CHxHG");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[54]] = lIIlllIlIlIIIlIl("5Qzp97xCFTzfZLsV3SnyDg==", "NtpsE");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[55]] = lIIlllIlIlIIIlIl("Gp18Caw4xAk=", "AOcel");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[56]] = lIIlllIlIlIIIlIl("Y9qPcHCr/gg=", "ZvBGs");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[57]] = lIIlllIlIlIIIIll("skiQTc+Er7Y256yfv3/zfA==", "OrjmO");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[58]] = lIIlllIlIlIIIIll("Q1pdL8rLAK8=", "Osaao");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[59]] = lIIlllIlIlIIIllI("EiYtHSE=", "qIArS");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[60]] = lIIlllIlIlIIIIll("IzoySkSGjEc=", "qQwnU");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[61]] = lIIlllIlIlIIIllI("FQEPJSIO", "zgiVG");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[62]] = lIIlllIlIlIIIlIl("HMwrCHpQ0OI=", "ezxys");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[63]] = lIIlllIlIlIIIlIl("kc4MdvWvt9I=", "ubGYw");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[64]] = lIIlllIlIlIIIllI("MA==", "RcgOy");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[65]] = lIIlllIlIlIIIllI("FCYnExIUOQ==", "qKNgf");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[66]] = lIIlllIlIlIIIllI("Ly0dLg==", "ALpKO");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[67]] = lIIlllIlIlIIIlIl("VYJzV/6pSprnjorCShDOwA==", "lvIoT");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[68]] = lIIlllIlIlIIIlIl("Udmqy2dAus0=", "Bhnfq");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[69]] = lIIlllIlIlIIIllI("AiU0IyQeMz8YMxM=", "wVQlV");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[70]] = lIIlllIlIlIIIIll("pJ38CAsdd6I=", "OeeBU");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[71]] = lIIlllIlIlIIIlIl("TVOMIc4SyTw=", "pcGbC");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[72]] = lIIlllIlIlIIIllI("JBguEw01Aj87HzQ=", "QkKRi");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[73]] = lIIlllIlIlIIIlIl("1jIFMAxlfO0=", "biIDu");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[74]] = lIIlllIlIlIIIlIl("0HQb1P1G6K8=", "woKlf");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[75]] = lIIlllIlIlIIIIll("nQ2ixKAHjWMBQZW4lCHneg==", "rhwYj");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[76]] = lIIlllIlIlIIIIll("doaJheAotsQ=", "lVijj");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[77]] = lIIlllIlIlIIIllI("ICIZKgwgEw4+DA==", "RGwNi");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[78]] = lIIlllIlIlIIIllI("JCwHPywn", "TCnQX");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[79]] = lIIlllIlIlIIIllI("JDUlLz0kBDI7PQ==", "VPKKX");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[80]] = lIIlllIlIlIIIllI("GTQ7MCE=", "hAZTR");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[81]] = lIIlllIlIlIIIlIl("ML4w3N/5OWE8zYUfePHxDw==", "wcJDC");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[82]] = lIIlllIlIlIIIIll("BkWGBXe2SnowHFWGbbg7uQ==", "hJDMv");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[83]] = lIIlllIlIlIIIlIl("9G6TSZgrGlybbZlUipSJiw==", "GCLiM");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[84]] = lIIlllIlIlIIIlIl("M/eF6CChBosrOWUSQyvebA==", "qAxtz");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[85]] = lIIlllIlIlIIIlIl("rU+Od5qod8w=", "QgCIb");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[86]] = lIIlllIlIlIIIllI("LiYAABYyHQ==", "Wiffe");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[87]] = lIIlllIlIlIIIllI("LygvABsnKgIdATInKBcX", "FFFtr");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[88]] = lIIlllIlIlIIIlIl("/oewM48R5i0=", "WkuXp");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[89]] = lIIlllIlIlIIIllI("CyY9CxoP", "gCSln");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[90]] = lIIlllIlIlIIIllI("PwUiMxs1HSUz", "ZhKGX");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[91]] = lIIlllIlIlIIIlIl("IkxwugSQAuE=", "kXngZ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[92]] = lIIlllIlIlIIIIll("1vB8dwhZk6CVGCSe4hCcaw==", "OaNBb");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[93]] = lIIlllIlIlIIIllI("ChgGGg0FLAgODQIY", "mjimy");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[94]] = lIIlllIlIlIIIlIl("YkKmYe4yY0fiw6a7O/v7tQ==", "jfPJJ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[95]] = lIIlllIlIlIIIlIl("O4wZ19CW5dRFBjt7Qt1MZg==", "YMrPR");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[96]] = lIIlllIlIlIIIllI("MD8qHxUCJzsFAA==", "CKKma");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[97]] = lIIlllIlIlIIIllI("DBw3IzoZGjI=", "irSbV");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[98]] = lIIlllIlIlIIIIll("ySP9uiyLI38=", "nagLd");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[99]] = lIIlllIlIlIIIllI("Gy0wHQ==", "hDJxd");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[100]] = lIIlllIlIlIIIllI("HyMFKysAMhA=", "iFiDH");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[101]] = lIIlllIlIlIIIIll("gF231OhLfgE=", "eSVaG");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[102]] = lIIlllIlIlIIIIll("YUFYcJvYN38=", "efvPx");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[103]] = lIIlllIlIlIIIlIl("AWv7D5CdlbQ=", "lZGSC");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[104]] = lIIlllIlIlIIIIll("hqrvBWKoqI4=", "LnlEv");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[105]] = lIIlllIlIlIIIllI("", "JUJZR");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[106]] = lIIlllIlIlIIIIll("qks3awfrw2g=", "XbWXu");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[107]] = lIIlllIlIlIIIlIl("Vr4Cj/hlmzo=", "pgNPm");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[108]] = lIIlllIlIlIIIlIl("YOae2aYFDBI=", "nhSyu");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[109]] = lIIlllIlIlIIIlIl("ymncdHV5Zi0=", "WbHMP");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[110]] = lIIlllIlIlIIIllI("EA==", "rGjgT");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[111]] = lIIlllIlIlIIIIll("sQea1cAvKn4=", "oTiHp");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[112]] = lIIlllIlIlIIIIll("LY7rsIk8sbM=", "LdVos");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[113]] = lIIlllIlIlIIIllI("", "smwoC");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[114]] = lIIlllIlIlIIIIll("9p39x0AD9uk=", "Cmqwt");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[115]] = lIIlllIlIlIIIlIl("Rdo2a/EegSA=", "LlAiv");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[116]] = lIIlllIlIlIIIIll("Oqr69Qlri5g=", "fhfab");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[117]] = lIIlllIlIlIIIIll("nssDoYHgu48=", "ZEuzE");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[118]] = lIIlllIlIlIIIIll("6tuKvcmxiEk=", "RRTOL");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[119]] = lIIlllIlIlIIIlIl("ur0IO28HNaI=", "LoMjZ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[120]] = lIIlllIlIlIIIlIl("DZbAECf5DgA=", "tsOmw");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[121]] = lIIlllIlIlIIIIll("C7FUp1se3/s=", "Xlvmw");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[122]] = lIIlllIlIlIIIllI("NRMAKA==", "AjpMD");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[123]] = lIIlllIlIlIIIllI("GQMePR8G", "kbpYp");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[124]] = lIIlllIlIlIIIllI("JjsLAQo=", "PZgto");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[125]] = lIIlllIlIlIIIlIl("vqp/nrCvTCw=", "DyZiD");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[126]] = lIIlllIlIlIIIllI("Ji4AAw==", "RWpfP");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[127]] = lIIlllIlIlIIIlIl("8liWhIQYCZ0=", "OsiTJ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[128]] = lIIlllIlIlIIIlIl("DppfDuqlIk4=", "bLNnq");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[129]] = lIIlllIlIlIIIlIl("0OcpfgHWIGo=", "IVFjg");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[130]] = lIIlllIlIlIIIlIl("I/m5vq0UcF8=", "MiAHK");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[131]] = lIIlllIlIlIIIIll("ClHAOzXPEhY=", "NdINZ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[132]] = lIIlllIlIlIIIIll("hsDzLXBUlOM=", "vyRTZ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[133]] = lIIlllIlIlIIIlIl("vhbKv79sep8=", "BkRNG");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[134]] = lIIlllIlIlIIIIll("M+wTrqKY6AQ=", "Tjvhu");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[135]] = lIIlllIlIlIIIIll("q50BkJtuue4=", "HkacW");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[136]] = lIIlllIlIlIIIlIl("HnEaqwYHXK0=", "YFtKI");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[137]] = lIIlllIlIlIIIllI("Cg==", "siVGI");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[138]] = lIIlllIlIlIIIIll("XX9HN8P6xVo=", "lEQDZ");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[139]] = lIIlllIlIlIIIllI("GgEzJicBTy4oPBoKeD0pHwp4IDcBACosNFVP", "ooXIP");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[140]] = lIIlllIlIlIIIIll("euopHwldNaI=", "BWjVl");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[141]] = lIIlllIlIlIIIIll("WCXOdnECyrI=", "lMFGi");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[142]] = lIIlllIlIlIIIlIl("2DbchFC4Lv8=", "QIcmH");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[143]] = lIIlllIlIlIIIlIl("zT2OSL8X69Y=", "akRTR");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[144]] = lIIlllIlIlIIIIll("2vLeSLTDpLc=", "bHdWT");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[145]] = lIIlllIlIlIIIllI("GDkJGyY=", "nXenC");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[146]] = lIIlllIlIlIIIllI("PRoNMDwoBRFyIigJBjs+KkgHPjUgDQwmfG0bCTsgPQEMNWpt", "MhbRP");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[147]] = lIIlllIlIlIIIllI("BSYXODoT", "vOzHV");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[148]] = lIIlllIlIlIIIllI("PjEZAhwh", "LPwfs");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[149]] = lIIlllIlIlIIIlIl("Yib53iN+8cw=", "DesBf");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[150]] = lIIlllIlIlIIIllI("IT4P", "LWaxP");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[151]] = lIIlllIlIlIIIlIl("+6vauvOZRF4=", "xoKku");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[152]] = lIIlllIlIlIIIllI("FTE9KzsR", "tRIBM");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[153]] = lIIlllIlIlIIIIll("xHPVuDY8gGA=", "XjYzH");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[154]] = lIIlllIlIlIIIlIl("ymHJMAhkfrs=", "aPxIi");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[155]] = lIIlllIlIlIIIllI("Kg==", "SsWLO");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[156]] = lIIlllIlIlIIIllI("Ahc/Ag==", "veJgy");
        ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[157]] = lIIlllIlIlIIIllI("Ez87NwYIcSQhAQNxND0FAzIkPRVccQ==", "fQPXq");
    }
    
    public static ConfigurableEmitter loadEmitter(final String llllllllllllIllIIIIIlIIIlIllIIIl) throws IOException {
        return loadEmitter(ResourceLoader.getResourceAsStream(llllllllllllIllIIIIIlIIIlIllIIIl), null);
    }
    
    public static ParticleSystem loadConfiguredSystem(final File llllllllllllIllIIIIIlIIlIIIIlIIl, final ConfigurableEmitterFactory llllllllllllIllIIIIIlIIlIIIIlIII) throws IOException {
        return loadConfiguredSystem(new FileInputStream(llllllllllllIllIIIIIlIIlIIIIlIIl), llllllllllllIllIIIIIlIIlIIIIlIII, null, null);
    }
    
    public static ConfigurableEmitter loadEmitter(final File llllllllllllIllIIIIIlIIIlIlIllll) throws IOException {
        return loadEmitter(new FileInputStream(llllllllllllIllIIIIIlIIIlIlIllll), null);
    }
    
    private static Element getFirstNamedElement(final Element llllllllllllIllIIIIIlIIIIllIlIll, final String llllllllllllIllIIIIIlIIIIllIIlll) {
        final NodeList llllllllllllIllIIIIIlIIIIllIlIIl = llllllllllllIllIIIIIlIIIIllIlIll.getElementsByTagName(llllllllllllIllIIIIIlIIIIllIIlll);
        if (lIIlllIlIlllIIII(llllllllllllIllIIIIIlIIIIllIlIIl.getLength())) {
            return null;
        }
        return (Element)llllllllllllIllIIIIIlIIIIllIlIIl.item(ParticleIO.lllIIIlIlIlIII[0]);
    }
    
    private static String lIIlllIlIlIIIlIl(final String llllllllllllIllIIIIIIllllIlIlIIl, final String llllllllllllIllIIIIIIllllIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIllllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIllllIlIIllI.getBytes(StandardCharsets.UTF_8)), ParticleIO.lllIIIlIlIlIII[9]), "DES");
            final Cipher llllllllllllIllIIIIIIllllIlIlIll = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIllllIlIlIll.init(ParticleIO.lllIIIlIlIlIII[2], llllllllllllIllIIIIIIllllIlIllII);
            return new String(llllllllllllIllIIIIIIllllIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIllllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIllllIlIlIlI) {
            llllllllllllIllIIIIIIllllIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIlIllIlllI() {
        (lllIIIlIlIlIII = new int[159])[0] = ((0x18 ^ 0x21) & ~(0x3E ^ 0x7));
        ParticleIO.lllIIIlIlIlIII[1] = " ".length();
        ParticleIO.lllIIIlIlIlIII[2] = "  ".length();
        ParticleIO.lllIIIlIlIlIII[3] = (0xFFFFB7D1 & 0x4FFE);
        ParticleIO.lllIIIlIlIlIII[4] = "   ".length();
        ParticleIO.lllIIIlIlIlIII[5] = (40 + 29 - 64 + 136 ^ 23 + 51 + 47 + 16);
        ParticleIO.lllIIIlIlIlIII[6] = (0xBB ^ 0xBE);
        ParticleIO.lllIIIlIlIlIII[7] = (0x5D ^ 0x5B);
        ParticleIO.lllIIIlIlIlIII[8] = (101 + 107 - 70 + 46 ^ 179 + 22 - 106 + 96);
        ParticleIO.lllIIIlIlIlIII[9] = (0xEC ^ 0x9E ^ (0x3F ^ 0x45));
        ParticleIO.lllIIIlIlIlIII[10] = (0xB3 ^ 0xBA);
        ParticleIO.lllIIIlIlIlIII[11] = (0x42 ^ 0x34 ^ (0x44 ^ 0x38));
        ParticleIO.lllIIIlIlIlIII[12] = (0x8C ^ 0x87);
        ParticleIO.lllIIIlIlIlIII[13] = (0x74 ^ 0x78);
        ParticleIO.lllIIIlIlIlIII[14] = (104 + 99 - 91 + 44 ^ 140 + 99 - 236 + 142);
        ParticleIO.lllIIIlIlIlIII[15] = (0x11 ^ 0x5F ^ (0xDC ^ 0x9C));
        ParticleIO.lllIIIlIlIlIII[16] = (0xF8 ^ 0x96 ^ (0xDA ^ 0xBB));
        ParticleIO.lllIIIlIlIlIII[17] = (0xD0 ^ 0x82 ^ (0x13 ^ 0x51));
        ParticleIO.lllIIIlIlIlIII[18] = (0x5E ^ 0x55 ^ (0x20 ^ 0x3A));
        ParticleIO.lllIIIlIlIlIII[19] = (128 + 0 - 7 + 25 ^ 86 + 121 - 92 + 13);
        ParticleIO.lllIIIlIlIlIII[20] = (0x43 ^ 0x50);
        ParticleIO.lllIIIlIlIlIII[21] = (0x65 ^ 0x71);
        ParticleIO.lllIIIlIlIlIII[22] = (0x0 ^ 0x15);
        ParticleIO.lllIIIlIlIlIII[23] = (0x45 ^ 0x53);
        ParticleIO.lllIIIlIlIlIII[24] = (132 + 160 - 234 + 117 ^ 4 + 161 - 87 + 106);
        ParticleIO.lllIIIlIlIlIII[25] = (0x83 ^ 0x9B);
        ParticleIO.lllIIIlIlIlIII[26] = (0x95 ^ 0x8C);
        ParticleIO.lllIIIlIlIlIII[27] = (0x52 ^ 0x78 ^ (0x8C ^ 0xBC));
        ParticleIO.lllIIIlIlIlIII[28] = (0x79 ^ 0x63 ^ " ".length());
        ParticleIO.lllIIIlIlIlIII[29] = (90 + 120 - 159 + 103 ^ 132 + 14 - 28 + 16);
        ParticleIO.lllIIIlIlIlIII[30] = (0x4F ^ 0x52);
        ParticleIO.lllIIIlIlIlIII[31] = (0x36 ^ 0x3A ^ (0x4F ^ 0x5D));
        ParticleIO.lllIIIlIlIlIII[32] = (14 + 144 - 2 + 8 ^ 117 + 40 - 18 + 48);
        ParticleIO.lllIIIlIlIlIII[33] = (0xDC ^ 0x9F ^ (0xD1 ^ 0xB2));
        ParticleIO.lllIIIlIlIlIII[34] = (59 + 26 - 19 + 88 ^ 107 + 24 - 46 + 102);
        ParticleIO.lllIIIlIlIlIII[35] = (0x4D ^ 0x6F);
        ParticleIO.lllIIIlIlIlIII[36] = (0x47 ^ 0x64);
        ParticleIO.lllIIIlIlIlIII[37] = (131 + 154 - 184 + 59 ^ 73 + 57 - 82 + 84);
        ParticleIO.lllIIIlIlIlIII[38] = (0x57 ^ 0x72);
        ParticleIO.lllIIIlIlIlIII[39] = (0x33 ^ 0x15);
        ParticleIO.lllIIIlIlIlIII[40] = (8 + 54 + 25 + 43 ^ 157 + 160 - 195 + 43);
        ParticleIO.lllIIIlIlIlIII[41] = (0x8 ^ 0x60 ^ (0xE3 ^ 0xA3));
        ParticleIO.lllIIIlIlIlIII[42] = (0x51 ^ 0x78);
        ParticleIO.lllIIIlIlIlIII[43] = (0x58 ^ 0x72);
        ParticleIO.lllIIIlIlIlIII[44] = (0x75 ^ 0x1F ^ (0x32 ^ 0x73));
        ParticleIO.lllIIIlIlIlIII[45] = (0x5 ^ 0x29);
        ParticleIO.lllIIIlIlIlIII[46] = (0x2C ^ 0x76 ^ (0x12 ^ 0x65));
        ParticleIO.lllIIIlIlIlIII[47] = (11 + 47 - 23 + 95 ^ 115 + 96 - 113 + 74);
        ParticleIO.lllIIIlIlIlIII[48] = (111 + 133 - 118 + 41 ^ 91 + 25 - 8 + 28);
        ParticleIO.lllIIIlIlIlIII[49] = (0x84 ^ 0xB4);
        ParticleIO.lllIIIlIlIlIII[50] = (169 + 109 - 166 + 61 ^ 86 + 79 - 14 + 5);
        ParticleIO.lllIIIlIlIlIII[51] = (0xF5 ^ 0xC7);
        ParticleIO.lllIIIlIlIlIII[52] = (98 + 127 - 82 + 9 ^ 147 + 54 - 65 + 35);
        ParticleIO.lllIIIlIlIlIII[53] = (0x86 ^ 0xB2);
        ParticleIO.lllIIIlIlIlIII[54] = (0x64 ^ 0x51);
        ParticleIO.lllIIIlIlIlIII[55] = (0x64 ^ 0x52);
        ParticleIO.lllIIIlIlIlIII[56] = (212 + 59 - 147 + 122 ^ 177 + 126 - 265 + 155);
        ParticleIO.lllIIIlIlIlIII[57] = (0x6C ^ 0x54);
        ParticleIO.lllIIIlIlIlIII[58] = (0x29 ^ 0x10);
        ParticleIO.lllIIIlIlIlIII[59] = (0x5A ^ 0x60);
        ParticleIO.lllIIIlIlIlIII[60] = (0x96 ^ 0xA2 ^ (0xE ^ 0x1));
        ParticleIO.lllIIIlIlIlIII[61] = (0x45 ^ 0x12 ^ (0x56 ^ 0x3D));
        ParticleIO.lllIIIlIlIlIII[62] = (0x1 ^ 0x3C);
        ParticleIO.lllIIIlIlIlIII[63] = (0xDC ^ 0x97 ^ (0xCB ^ 0xBE));
        ParticleIO.lllIIIlIlIlIII[64] = (0x9B ^ 0xBE ^ (0x27 ^ 0x3D));
        ParticleIO.lllIIIlIlIlIII[65] = (18 + 110 + 64 + 27 ^ 58 + 35 - 52 + 114);
        ParticleIO.lllIIIlIlIlIII[66] = (99 + 80 - 27 + 82 ^ 106 + 30 + 25 + 10);
        ParticleIO.lllIIIlIlIlIII[67] = (68 + 210 - 173 + 128 ^ 7 + 62 + 92 + 10);
        ParticleIO.lllIIIlIlIlIII[68] = (33 + 45 - 62 + 177 ^ 21 + 50 - 62 + 121);
        ParticleIO.lllIIIlIlIlIII[69] = (0xDC ^ 0x97 ^ (0x2A ^ 0x25));
        ParticleIO.lllIIIlIlIlIII[70] = (58 + 116 - 136 + 161 ^ 106 + 74 - 96 + 46);
        ParticleIO.lllIIIlIlIlIII[71] = (0x81 ^ 0xC7);
        ParticleIO.lllIIIlIlIlIII[72] = (62 + 94 - 56 + 27 ^ (0x9E ^ 0xA6));
        ParticleIO.lllIIIlIlIlIII[73] = (0x28 ^ 0x60);
        ParticleIO.lllIIIlIlIlIII[74] = (0xA8 ^ 0xBC ^ (0xC9 ^ 0x94));
        ParticleIO.lllIIIlIlIlIII[75] = (0xC9 ^ 0x83);
        ParticleIO.lllIIIlIlIlIII[76] = (7 + 49 + 75 + 66 ^ 100 + 33 - 111 + 120);
        ParticleIO.lllIIIlIlIlIII[77] = (0x51 ^ 0x77 ^ (0x42 ^ 0x28));
        ParticleIO.lllIIIlIlIlIII[78] = (0x2D ^ 0x60);
        ParticleIO.lllIIIlIlIlIII[79] = (0xE ^ 0x7F ^ (0x6F ^ 0x50));
        ParticleIO.lllIIIlIlIlIII[80] = (0xD7 ^ 0x98 ^ ((0x12 ^ 0x18) & ~(0x23 ^ 0x29)));
        ParticleIO.lllIIIlIlIlIII[81] = (0x8 ^ 0x4D ^ (0xD3 ^ 0xC6));
        ParticleIO.lllIIIlIlIlIII[82] = (4 + 21 + 131 + 82 ^ 141 + 38 - 135 + 147);
        ParticleIO.lllIIIlIlIlIII[83] = (0x4A ^ 0x47 ^ (0xFA ^ 0xA5));
        ParticleIO.lllIIIlIlIlIII[84] = (0x75 ^ 0x26);
        ParticleIO.lllIIIlIlIlIII[85] = (62 + 30 - 82 + 203 ^ 105 + 54 - 43 + 13);
        ParticleIO.lllIIIlIlIlIII[86] = (0x3C ^ 0x16 ^ 115 + 33 - 26 + 5);
        ParticleIO.lllIIIlIlIlIII[87] = (0xF6 ^ 0xA0);
        ParticleIO.lllIIIlIlIlIII[88] = (0x57 ^ 0x0);
        ParticleIO.lllIIIlIlIlIII[89] = (0x28 ^ 0x70);
        ParticleIO.lllIIIlIlIlIII[90] = (0xCD ^ 0x94);
        ParticleIO.lllIIIlIlIlIII[91] = (87 + 77 - 147 + 183 ^ 89 + 5 - 86 + 138);
        ParticleIO.lllIIIlIlIlIII[92] = (0xFB ^ 0xC0 ^ (0xE4 ^ 0x84));
        ParticleIO.lllIIIlIlIlIII[93] = (0x27 ^ 0x7B);
        ParticleIO.lllIIIlIlIlIII[94] = (71 + 4 + 86 + 71 ^ 154 + 146 - 173 + 54);
        ParticleIO.lllIIIlIlIlIII[95] = (0x4B ^ 0x72 ^ (0x24 ^ 0x43));
        ParticleIO.lllIIIlIlIlIII[96] = (0xD6 ^ 0xB4 ^ (0x67 ^ 0x5A));
        ParticleIO.lllIIIlIlIlIII[97] = (83 + 16 + 4 + 92 ^ 140 + 15 - 83 + 91);
        ParticleIO.lllIIIlIlIlIII[98] = (0x55 ^ 0x34);
        ParticleIO.lllIIIlIlIlIII[99] = (31 + 104 + 13 + 107 ^ 156 + 30 - 34 + 5);
        ParticleIO.lllIIIlIlIlIII[100] = (19 + 45 - 31 + 165 ^ 138 + 54 - 158 + 131);
        ParticleIO.lllIIIlIlIlIII[101] = (153 + 157 - 298 + 219 ^ 69 + 129 - 83 + 16);
        ParticleIO.lllIIIlIlIlIII[102] = (0xA ^ 0x6F);
        ParticleIO.lllIIIlIlIlIII[103] = (0xF7 ^ 0x91);
        ParticleIO.lllIIIlIlIlIII[104] = (53 + 50 - 77 + 134 ^ 87 + 183 - 217 + 146);
        ParticleIO.lllIIIlIlIlIII[105] = (0xD4 ^ 0xBC);
        ParticleIO.lllIIIlIlIlIII[106] = (0xC7 ^ 0xAE);
        ParticleIO.lllIIIlIlIlIII[107] = (3 + 137 + 43 + 14 ^ 123 + 45 - 12 + 19);
        ParticleIO.lllIIIlIlIlIII[108] = (0x7E ^ 0x15);
        ParticleIO.lllIIIlIlIlIII[109] = (0x28 ^ 0x69 ^ (0x29 ^ 0x4));
        ParticleIO.lllIIIlIlIlIII[110] = (0x31 ^ 0x5C);
        ParticleIO.lllIIIlIlIlIII[111] = (0x6C ^ 0x2);
        ParticleIO.lllIIIlIlIlIII[112] = (0x29 ^ 0x33 ^ (0xD3 ^ 0xA6));
        ParticleIO.lllIIIlIlIlIII[113] = (0x62 ^ 0x12);
        ParticleIO.lllIIIlIlIlIII[114] = (0x0 ^ 0x71);
        ParticleIO.lllIIIlIlIlIII[115] = (0xA7 ^ 0xC7 ^ (0x95 ^ 0x87));
        ParticleIO.lllIIIlIlIlIII[116] = (0xA5 ^ 0xB7 ^ (0xC4 ^ 0xA5));
        ParticleIO.lllIIIlIlIlIII[117] = (0x2B ^ 0x14 ^ (0x37 ^ 0x7C));
        ParticleIO.lllIIIlIlIlIII[118] = (0x7A ^ 0x55 ^ (0x9 ^ 0x53));
        ParticleIO.lllIIIlIlIlIII[119] = (0x76 ^ 0x0);
        ParticleIO.lllIIIlIlIlIII[120] = (0x17 ^ 0x5B ^ (0xAD ^ 0x96));
        ParticleIO.lllIIIlIlIlIII[121] = (0x73 ^ 0xB);
        ParticleIO.lllIIIlIlIlIII[122] = (189 + 85 - 161 + 106 ^ 91 + 27 - 93 + 137);
        ParticleIO.lllIIIlIlIlIII[123] = (0x74 ^ 0x41 ^ (0x54 ^ 0x1B));
        ParticleIO.lllIIIlIlIlIII[124] = (0x78 ^ 0x3);
        ParticleIO.lllIIIlIlIlIII[125] = (0x6D ^ 0x3 ^ (0x89 ^ 0x9B));
        ParticleIO.lllIIIlIlIlIII[126] = (0x56 ^ 0x2B);
        ParticleIO.lllIIIlIlIlIII[127] = (0x78 ^ 0xE ^ (0x62 ^ 0x6A));
        ParticleIO.lllIIIlIlIlIII[128] = 24 + 92 - 94 + 105;
        ParticleIO.lllIIIlIlIlIII[129] = 83 + 3 - 37 + 79;
        ParticleIO.lllIIIlIlIlIII[130] = 3 + 6 + 85 + 35;
        ParticleIO.lllIIIlIlIlIII[131] = 127 + 128 - 160 + 35;
        ParticleIO.lllIIIlIlIlIII[132] = (0xA0 ^ 0xB5) + (0xC2 ^ 0xA7) - (0xCD ^ 0x9A) + (0xEC ^ 0x8C);
        ParticleIO.lllIIIlIlIlIII[133] = 21 + 85 - 84 + 110;
        ParticleIO.lllIIIlIlIlIII[134] = 77 + 84 - 84 + 56;
        ParticleIO.lllIIIlIlIlIII[135] = (0x3F ^ 0x67) + (0xE3 ^ 0xC0) - (0x2A ^ 0x2D) + (0x72 ^ 0x60);
        ParticleIO.lllIIIlIlIlIII[136] = 10 + 83 + 39 + 3;
        ParticleIO.lllIIIlIlIlIII[137] = (0x3A ^ 0x26) + (0x8B ^ 0x96) - -(0x68 ^ 0x76) + (0x9 ^ 0x38);
        ParticleIO.lllIIIlIlIlIII[138] = (0x20 ^ 0x4A) + (0x96 ^ 0xAB) - (0x15 ^ 0x5A) + (0x9B ^ 0xAA);
        ParticleIO.lllIIIlIlIlIII[139] = (0x7C ^ 0x2) + (0x1A ^ 0x69) - (131 + 97 - 62 + 7) + (0x36 ^ 0x70);
        ParticleIO.lllIIIlIlIlIII[140] = 0 + 22 + 9 + 108;
        ParticleIO.lllIIIlIlIlIII[141] = 12 + 89 + 20 + 13 + (0x51 ^ 0x79) - (41 + 76 - 38 + 58) + (0x6E ^ 0x9);
        ParticleIO.lllIIIlIlIlIII[142] = 78 + 139 - 172 + 96;
        ParticleIO.lllIIIlIlIlIII[143] = (0x7 ^ 0x2A) + (0x9 ^ 0x4F) - (0xC3 ^ 0xC7) + (0x7A ^ 0x65);
        ParticleIO.lllIIIlIlIlIII[144] = (0xD7 ^ 0xB1) + (0x1E ^ 0x55) - (149 + 28 - 130 + 109) + (0xD4 ^ 0xAE);
        ParticleIO.lllIIIlIlIlIII[145] = 143 + 61 - 195 + 135;
        ParticleIO.lllIIIlIlIlIII[146] = (0x16 ^ 0x45) + (0x12 ^ 0x2D) - (0x6D ^ 0x5D) + (0x25 ^ 0xA);
        ParticleIO.lllIIIlIlIlIII[147] = 1 + 37 - 2 + 110;
        ParticleIO.lllIIIlIlIlIII[148] = "   ".length() + (0x3B ^ 0x65) - -(0x1 ^ 0x4) + (0x4 ^ 0x29);
        ParticleIO.lllIIIlIlIlIII[149] = ((0x12 ^ 0x4A) & ~(0x9B ^ 0xC3)) + (0xE3 ^ 0xA8) - -(0x10 ^ 0x58) + " ".length();
        ParticleIO.lllIIIlIlIlIII[150] = 117 + 81 - 88 + 39;
        ParticleIO.lllIIIlIlIlIII[151] = 147 + 96 - 121 + 28;
        ParticleIO.lllIIIlIlIlIII[152] = (0x45 ^ 0x2A) + (0x42 ^ 0x5C) - (71 + 109 - 74 + 24) + (55 + 110 - 72 + 47);
        ParticleIO.lllIIIlIlIlIII[153] = (0xBE ^ 0xB3) + (0xA6 ^ 0x85) - -(0x6D ^ 0x22) + (0x13 ^ 0xA);
        ParticleIO.lllIIIlIlIlIII[154] = 43 + 75 + 32 + 3;
        ParticleIO.lllIIIlIlIlIII[155] = 140 + 74 - 125 + 65;
        ParticleIO.lllIIIlIlIlIII[156] = (0xDD ^ 0xA1) + (0x1E ^ 0x6B) - (210 + 186 - 242 + 80) + (103 + 55 - 97 + 87);
        ParticleIO.lllIIIlIlIlIII[157] = 108 + 132 - 89 + 5;
        ParticleIO.lllIIIlIlIlIII[158] = 40 + 74 - 70 + 113;
    }
    
    public static ConfigurableEmitter loadEmitter(final InputStream llllllllllllIllIIIIIlIIIlIIlIlII, ConfigurableEmitterFactory llllllllllllIllIIIIIlIIIlIIlIIIl) throws IOException {
        if (lIIlllIlIllIllll(llllllllllllIllIIIIIlIIIlIIlIIIl)) {
            llllllllllllIllIIIIIlIIIlIIlIIIl = new ConfigurableEmitterFactory() {
                public ConfigurableEmitter createEmitter(final String llllllllllllIllllIlIIIIIIlIIIIlI) {
                    return new ConfigurableEmitter(llllllllllllIllllIlIIIIIIlIIIIlI);
                }
            };
        }
        try {
            final DocumentBuilder llllllllllllIllIIIIIlIIIlIIllIIl = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            final Document llllllllllllIllIIIIIlIIIlIIllIII = llllllllllllIllIIIIIlIIIlIIllIIl.parse(llllllllllllIllIIIIIlIIIlIIlIlII);
            if (lIIlllIlIlllIIII(llllllllllllIllIIIIIlIIIlIIllIII.getDocumentElement().getNodeName().equals(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[21]]) ? 1 : 0)) {
                throw new IOException(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[22]]);
            }
            final ConfigurableEmitter llllllllllllIllIIIIIlIIIlIIlIlll = ((ConfigurableEmitterFactory)llllllllllllIllIIIIIlIIIlIIlIIIl).createEmitter(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[23]]);
            elementToEmitter(llllllllllllIllIIIIIlIIIlIIllIII.getDocumentElement(), llllllllllllIllIIIIIlIIIlIIlIlll);
            return llllllllllllIllIIIIIlIIIlIIlIlll;
        }
        catch (IOException llllllllllllIllIIIIIlIIIlIIlIllI) {
            Log.error(llllllllllllIllIIIIIlIIIlIIlIllI);
            throw llllllllllllIllIIIIIlIIIlIIlIllI;
        }
        catch (Exception llllllllllllIllIIIIIlIIIlIIlIlIl) {
            Log.error(llllllllllllIllIIIIIlIIIlIIlIlIl);
            throw new IOException(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[24]]);
        }
    }
    
    public static ConfigurableEmitter loadEmitter(final String llllllllllllIllIIIIIlIIIlIlIIllI, final ConfigurableEmitterFactory llllllllllllIllIIIIIlIIIlIlIIlIl) throws IOException {
        return loadEmitter(ResourceLoader.getResourceAsStream(llllllllllllIllIIIIIlIIIlIlIIllI), llllllllllllIllIIIIIlIIIlIlIIlIl);
    }
    
    public static ParticleSystem loadConfiguredSystem(final String llllllllllllIllIIIIIlIIlIIlIIllI, final Color llllllllllllIllIIIIIlIIlIIlIIlIl) throws IOException {
        return loadConfiguredSystem(ResourceLoader.getResourceAsStream(llllllllllllIllIIIIIlIIlIIlIIllI), null, null, llllllllllllIllIIIIIlIIlIIlIIlIl);
    }
    
    static {
        lIIlllIlIllIlllI();
        lIIlllIlIllIlIlI();
    }
    
    public static ParticleSystem loadConfiguredSystem(final InputStream llllllllllllIllIIIIIlIIIlllIlIIl, ConfigurableEmitterFactory llllllllllllIllIIIIIlIIIlllIIlII, ParticleSystem llllllllllllIllIIIIIlIIIlllIIIll, final Color llllllllllllIllIIIIIlIIIlllIIllI) throws IOException {
        if (lIIlllIlIllIllll(llllllllllllIllIIIIIlIIIlllIIlII)) {
            llllllllllllIllIIIIIlIIIlllIIlII = new ConfigurableEmitterFactory() {
                public ConfigurableEmitter createEmitter(final String llllllllllllIllIllIIIIIIIlIIlllI) {
                    return new ConfigurableEmitter(llllllllllllIllIllIIIIIIIlIIlllI);
                }
            };
        }
        try {
            final DocumentBuilder llllllllllllIllIIIIIlIIIllllIIIl = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            final Document llllllllllllIllIIIIIlIIIllllIIII = llllllllllllIllIIIIIlIIIllllIIIl.parse(llllllllllllIllIIIIIlIIIlllIlIIl);
            final Element llllllllllllIllIIIIIlIIIlllIllll = llllllllllllIllIIIIIlIIIllllIIII.getDocumentElement();
            if (lIIlllIlIlllIIII(llllllllllllIllIIIIIlIIIlllIllll.getNodeName().equals(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[0]]) ? 1 : 0)) {
                throw new IOException(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[1]]);
            }
            if (lIIlllIlIllIllll(llllllllllllIllIIIIIlIIIlllIIIll)) {
                llllllllllllIllIIIIIlIIIlllIIIll = new ParticleSystem(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[2]], ParticleIO.lllIIIlIlIlIII[3], llllllllllllIllIIIIIlIIIlllIIllI);
            }
            final boolean llllllllllllIllIIIIIlIIIlllIlllI = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[4]].equals(llllllllllllIllIIIIIlIIIlllIllll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[5]]));
            if (lIIlllIlIlllIIIl(llllllllllllIllIIIIIlIIIlllIlllI ? 1 : 0)) {
                ((ParticleSystem)llllllllllllIllIIIIIlIIIlllIIIll).setBlendingMode(ParticleIO.lllIIIlIlIlIII[1]);
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            else {
                ((ParticleSystem)llllllllllllIllIIIIIlIIIlllIIIll).setBlendingMode(ParticleIO.lllIIIlIlIlIII[2]);
            }
            final boolean llllllllllllIllIIIIIlIIIlllIllIl = ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[6]].equals(llllllllllllIllIIIIIlIIIlllIllll.getAttribute(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[7]]));
            ((ParticleSystem)llllllllllllIllIIIIIlIIIlllIIIll).setUsePoints(llllllllllllIllIIIIIlIIIlllIllIl);
            final NodeList llllllllllllIllIIIIIlIIIlllIllII = llllllllllllIllIIIIIlIIIlllIllll.getElementsByTagName(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[8]]);
            int llllllllllllIllIIIIIlIIIllllIIlI = ParticleIO.lllIIIlIlIlIII[0];
            while (lIIlllIlIlllIIlI(llllllllllllIllIIIIIlIIIllllIIlI, llllllllllllIllIIIIIlIIIlllIllII.getLength())) {
                final Element llllllllllllIllIIIIIlIIIllllIlII = (Element)llllllllllllIllIIIIIlIIIlllIllII.item(llllllllllllIllIIIIIlIIIllllIIlI);
                final ConfigurableEmitter llllllllllllIllIIIIIlIIIllllIIll = llllllllllllIllIIIIIlIIIlllIIlII.createEmitter(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[9]]);
                elementToEmitter(llllllllllllIllIIIIIlIIIllllIlII, llllllllllllIllIIIIIlIIIllllIIll);
                ((ParticleSystem)llllllllllllIllIIIIIlIIIlllIIIll).addEmitter(llllllllllllIllIIIIIlIIIllllIIll);
                ++llllllllllllIllIIIIIlIIIllllIIlI;
                "".length();
                if (" ".length() <= ((0x2D ^ 0x28) & ~(0xB1 ^ 0xB4))) {
                    return null;
                }
            }
            ((ParticleSystem)llllllllllllIllIIIIIlIIIlllIIIll).setRemoveCompletedEmitters((boolean)(ParticleIO.lllIIIlIlIlIII[0] != 0));
            return (ParticleSystem)llllllllllllIllIIIIIlIIIlllIIIll;
        }
        catch (IOException llllllllllllIllIIIIIlIIIlllIlIll) {
            Log.error(llllllllllllIllIIIIIlIIIlllIlIll);
            throw llllllllllllIllIIIIIlIIIlllIlIll;
        }
        catch (Exception llllllllllllIllIIIIIlIIIlllIlIlI) {
            Log.error(llllllllllllIllIIIIIlIIIlllIlIlI);
            throw new IOException(ParticleIO.lllIIIlIIllIll[ParticleIO.lllIIIlIlIlIII[10]]);
        }
    }
}
