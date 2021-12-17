// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tiled;

import org.newdawn.slick.Image;
import java.util.Arrays;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import org.newdawn.slick.util.Log;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import org.xml.sax.InputSource;
import org.xml.sax.EntityResolver;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.util.ResourceLoader;
import org.newdawn.slick.SlickException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ArrayList;

public class TiledMap
{
    protected /* synthetic */ ArrayList objectGroups;
    protected /* synthetic */ int tileHeight;
    protected /* synthetic */ int orientation;
    protected /* synthetic */ int width;
    private /* synthetic */ boolean loadTileSets;
    protected /* synthetic */ Properties props;
    private static final /* synthetic */ int[] llIIlllIlIlllI;
    private static final /* synthetic */ String[] llIIlllIlIIlll;
    private static /* synthetic */ boolean headless;
    protected /* synthetic */ ArrayList tileSets;
    protected /* synthetic */ ArrayList layers;
    protected /* synthetic */ int height;
    protected /* synthetic */ String tilesLocation;
    protected /* synthetic */ int tileWidth;
    
    private static boolean lIIIlllllIllIIIl(final Object llllllllllllIllIllllIIllIlllIIlI) {
        return llllllllllllIllIllllIIllIlllIIlI == null;
    }
    
    public String getObjectImage(final int llllllllllllIllIllllIIllllIlIIII, final int llllllllllllIllIllllIIllllIlIIlI) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIIllllIlIIII) && lIIIlllllIlIlllI(llllllllllllIllIllllIIllllIlIIII, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIIllllIlIlIl = this.objectGroups.get(llllllllllllIllIllllIIllllIlIIII);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIIllllIlIIlI) && lIIIlllllIlIlllI(llllllllllllIllIllllIIllllIlIIlI, llllllllllllIllIllllIIllllIlIlIl.objects.size())) {
                final GroupObject llllllllllllIllIllllIIllllIlIllI = llllllllllllIllIllllIIllllIlIlIl.objects.get(llllllllllllIllIllllIIllllIlIIlI);
                if (lIIIlllllIllIIIl(llllllllllllIllIllllIIllllIlIllI)) {
                    return null;
                }
                return llllllllllllIllIllllIIllllIlIllI.image;
            }
        }
        return null;
    }
    
    public TiledMap(final InputStream llllllllllllIllIllllIlIlllIllllI, final String llllllllllllIllIllllIlIlllIlllIl) throws SlickException {
        this.tileSets = new ArrayList();
        this.layers = new ArrayList();
        this.objectGroups = new ArrayList();
        this.loadTileSets = (TiledMap.llIIlllIlIlllI[0] != 0);
        this.load(llllllllllllIllIllllIlIlllIllllI, llllllllllllIllIllllIlIlllIlllIl);
    }
    
    public TiledMap(final String llllllllllllIllIllllIlIllllIllIl, final String llllllllllllIllIllllIlIllllIlIIl) throws SlickException {
        this.tileSets = new ArrayList();
        this.layers = new ArrayList();
        this.objectGroups = new ArrayList();
        this.loadTileSets = (TiledMap.llIIlllIlIlllI[0] != 0);
        this.load(ResourceLoader.getResourceAsStream(llllllllllllIllIllllIlIllllIllIl), llllllllllllIllIllllIlIllllIlIIl);
    }
    
    public TiledMap(String llllllllllllIllIllllIlIlllllIIll, final boolean llllllllllllIllIllllIlIlllllIlIl) throws SlickException {
        this.tileSets = new ArrayList();
        this.layers = new ArrayList();
        this.objectGroups = new ArrayList();
        this.loadTileSets = (TiledMap.llIIlllIlIlllI[0] != 0);
        this.loadTileSets = llllllllllllIllIllllIlIlllllIlIl;
        llllllllllllIllIllllIlIlllllIIll = (Exception)((String)llllllllllllIllIllllIlIlllllIIll).replace((char)TiledMap.llIIlllIlIlllI[1], (char)TiledMap.llIIlllIlIlllI[2]);
        this.load(ResourceLoader.getResourceAsStream((String)llllllllllllIllIllllIlIlllllIIll), ((String)llllllllllllIllIllllIlIlllllIIll).substring(TiledMap.llIIlllIlIlllI[3], ((String)llllllllllllIllIllllIlIlllllIIll).lastIndexOf(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[3]])));
    }
    
    private static boolean lIIIlllllIlIlllI(final int llllllllllllIllIllllIIllIlllllll, final int llllllllllllIllIllllIIllIllllllI) {
        return llllllllllllIllIllllIIllIlllllll < llllllllllllIllIllllIIllIllllllI;
    }
    
    private static boolean lIIIlllllIllIIlI(final Object llllllllllllIllIllllIIllIlllIlII) {
        return llllllllllllIllIllllIIllIlllIlII != null;
    }
    
    public int getObjectGroupCount() {
        return this.objectGroups.size();
    }
    
    public void render(final int llllllllllllIllIllllIlIIllllIIll, final int llllllllllllIllIllllIlIIllllIIlI, final int llllllllllllIllIllllIlIIlllllIIl, final int llllllllllllIllIllllIlIIllllIIII, final int llllllllllllIllIllllIlIIlllIllll, final int llllllllllllIllIllllIlIIlllIlllI, final boolean llllllllllllIllIllllIlIIlllIllIl) {
        switch (this.orientation) {
            case 1: {
                int llllllllllllIllIllllIlIIllllllIl = TiledMap.llIIlllIlIlllI[3];
                while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIllllllIl, llllllllllllIllIllllIlIIlllIlllI)) {
                    int llllllllllllIllIllllIlIIlllllllI = TiledMap.llIIlllIlIlllI[3];
                    while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlllllllI, this.layers.size())) {
                        final Layer llllllllllllIllIllllIlIIllllllll = this.layers.get(llllllllllllIllIllllIlIIlllllllI);
                        llllllllllllIllIllllIlIIllllllll.render(llllllllllllIllIllllIlIIllllIIll, llllllllllllIllIllllIlIIllllIIlI, llllllllllllIllIllllIlIIlllllIIl, llllllllllllIllIllllIlIIllllIIII, llllllllllllIllIllllIlIIlllIllll, llllllllllllIllIllllIlIIllllllIl, llllllllllllIllIllllIlIIlllIllIl, this.tileWidth, this.tileHeight);
                        ++llllllllllllIllIllllIlIIlllllllI;
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                    }
                    ++llllllllllllIllIllllIlIIllllllIl;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                "".length();
                if (((227 + 56 - 228 + 190 ^ 49 + 17 + 39 + 71) & (0x1F ^ 0x18 ^ (0xEC ^ 0xAE) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 2: {
                this.renderIsometricMap(llllllllllllIllIllllIlIIllllIIll, llllllllllllIllIllllIlIIllllIIlI, llllllllllllIllIllllIlIIlllllIIl, llllllllllllIllIllllIlIIllllIIII, llllllllllllIllIllllIlIIlllIllll, llllllllllllIllIllllIlIIlllIlllI, null, llllllllllllIllIllllIlIIlllIllIl);
                "".length();
                if (-(0x25 ^ 0x21) >= 0) {
                    return;
                }
                break;
            }
        }
    }
    
    public String getTilesLocation() {
        return this.tilesLocation;
    }
    
    public TileSet getTileSet(final int llllllllllllIllIllllIlIIIlIllllI) {
        return this.tileSets.get(llllllllllllIllIllllIlIIIlIllllI);
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public String getObjectProperty(final int llllllllllllIllIllllIIllllIIIIlI, final int llllllllllllIllIllllIIllllIIIIIl, final String llllllllllllIllIllllIIllllIIIIII, final String llllllllllllIllIllllIIlllIlllIlI) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIIllllIIIIlI) && lIIIlllllIlIlllI(llllllllllllIllIllllIIllllIIIIlI, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIIllllIIIlII = this.objectGroups.get(llllllllllllIllIllllIIllllIIIIlI);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIIllllIIIIIl) && lIIIlllllIlIlllI(llllllllllllIllIllllIIllllIIIIIl, llllllllllllIllIllllIIllllIIIlII.objects.size())) {
                final GroupObject llllllllllllIllIllllIIllllIIIlIl = llllllllllllIllIllllIIllllIIIlII.objects.get(llllllllllllIllIllllIIllllIIIIIl);
                if (lIIIlllllIllIIIl(llllllllllllIllIllllIIllllIIIlIl)) {
                    return llllllllllllIllIllllIIlllIlllIlI;
                }
                if (lIIIlllllIllIIIl(llllllllllllIllIllllIIllllIIIlIl.props)) {
                    return llllllllllllIllIllllIIlllIlllIlI;
                }
                return llllllllllllIllIllllIIllllIIIlIl.props.getProperty(llllllllllllIllIllllIIllllIIIIII, llllllllllllIllIllllIIlllIlllIlI);
            }
        }
        return llllllllllllIllIllllIIlllIlllIlI;
    }
    
    public void render(final int llllllllllllIllIllllIlIlIIlllIII, final int llllllllllllIllIllllIlIlIIllIIII, final int llllllllllllIllIllllIlIlIIllIllI, final int llllllllllllIllIllllIlIlIIlIlllI, final int llllllllllllIllIllllIlIlIIlIllIl, final int llllllllllllIllIllllIlIlIIllIIll) {
        this.render(llllllllllllIllIllllIlIlIIlllIII, llllllllllllIllIllllIlIlIIllIIII, llllllllllllIllIllllIlIlIIllIllI, llllllllllllIllIllllIlIlIIlIlllI, llllllllllllIllIllllIlIlIIlIllIl, llllllllllllIllIllllIlIlIIllIIll, (boolean)(TiledMap.llIIlllIlIlllI[3] != 0));
    }
    
    public int getObjectWidth(final int llllllllllllIllIllllIIllllllIIIl, final int llllllllllllIllIllllIIllllllIIII) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIIllllllIIIl) && lIIIlllllIlIlllI(llllllllllllIllIllllIIllllllIIIl, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIIllllllIIll = this.objectGroups.get(llllllllllllIllIllllIIllllllIIIl);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIIllllllIIII) && lIIIlllllIlIlllI(llllllllllllIllIllllIIllllllIIII, llllllllllllIllIllllIIllllllIIll.objects.size())) {
                final GroupObject llllllllllllIllIllllIIllllllIlII = llllllllllllIllIllllIIllllllIIll.objects.get(llllllllllllIllIllllIIllllllIIII);
                return llllllllllllIllIllllIIllllllIlII.width;
            }
        }
        return TiledMap.llIIlllIlIlllI[4];
    }
    
    private static void lIIIlllllIlIIlll() {
        (llIIlllIlIIlll = new String[TiledMap.llIIlllIlIlllI[19]])[TiledMap.llIIlllIlIlllI[3]] = lIIIlllllIlIIIIl("3XuS0eHy03g=", "VzLtp");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[0]] = lIIIlllllIlIIIlI("", "uKIgo");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[5]] = lIIIlllllIlIIIIl("5eW7qDZA/iRGtgNHHwGAhg==", "fKIHS");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[6]] = lIIIlllllIlIIIIl("ANx9d6++BN79eIHy2XGYDA==", "pvkZq");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[7]] = lIIIlllllIlIIIlI("BzsAEj8=", "pRdfW");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[8]] = lIIIlllllIlIIIlI("JSECCSs5", "MDknC");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[9]] = lIIIlllllIlIIIll("NVMZS+R4uBOvMKVDiu7AZg==", "YJyBO");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[10]] = lIIIlllllIlIIIll("9xO0+8CN0Qm5GnbseiW/MQ==", "vZYGE");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[11]] = lIIIlllllIlIIIIl("8bpIo3ExuZm7wFo/IuyrsQ==", "ZzlEt");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[12]] = lIIIlllllIlIIIll("VKveSEaslDlCCMrYRSVL4w==", "ZDOBw");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[13]] = lIIIlllllIlIIIIl("jCHXVck9/tg=", "eVfsd");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[14]] = lIIIlllllIlIIIIl("RUStsmHPYak=", "yJRhb");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[15]] = lIIIlllllIlIIIlI("PAoiHDctFw==", "HcNyD");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[16]] = lIIIlllllIlIIIlI("KgA8ISA=", "FaEDR");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[17]] = lIIIlllllIlIIIIl("FAVUvplVaX0hp/8dMpEiqA==", "vQLeH");
        TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[18]] = lIIIlllllIlIIIll("BzmvwJZXYFlr63AUYhD/lfAk4949xT26", "ekGkk");
    }
    
    public String getObjectName(final int llllllllllllIllIllllIlIIIIlIllIl, final int llllllllllllIllIllllIlIIIIlIllII) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIlIllIl) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIlIllIl, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIlIIIIlIllll = this.objectGroups.get(llllllllllllIllIllllIlIIIIlIllIl);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIlIllII) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIlIllII, llllllllllllIllIllllIlIIIIlIllll.objects.size())) {
                final GroupObject llllllllllllIllIllllIlIIIIllIIII = llllllllllllIllIllllIlIIIIlIllll.objects.get(llllllllllllIllIllllIlIIIIlIllII);
                return llllllllllllIllIllllIlIIIIllIIII.name;
            }
        }
        return null;
    }
    
    private static String lIIIlllllIlIIIll(final String llllllllllllIllIllllIIlllIlIlllI, final String llllllllllllIllIllllIIlllIlIllll) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIlllIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIlllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllIIlllIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllIIlllIllIIlI.init(TiledMap.llIIlllIlIlllI[5], llllllllllllIllIllllIIlllIllIIll);
            return new String(llllllllllllIllIllllIIlllIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIlllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIlllIllIIIl) {
            llllllllllllIllIllllIIlllIllIIIl.printStackTrace();
            return null;
        }
    }
    
    public int getObjectCount(final int llllllllllllIllIllllIlIIIIllIlll) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIllIlll) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIllIlll, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIlIIIIlllIll = this.objectGroups.get(llllllllllllIllIllllIlIIIIllIlll);
            return llllllllllllIllIllllIlIIIIlllIll.objects.size();
        }
        return TiledMap.llIIlllIlIlllI[4];
    }
    
    public String getLayerProperty(final int llllllllllllIllIllllIlIlIlllIIII, final String llllllllllllIllIllllIlIlIllIllll, final String llllllllllllIllIllllIlIlIllIlIIl) {
        final Layer llllllllllllIllIllllIlIlIllIllIl = this.layers.get(llllllllllllIllIllllIlIlIlllIIII);
        if (!lIIIlllllIllIIlI(llllllllllllIllIllllIlIlIllIllIl) || lIIIlllllIllIIIl(llllllllllllIllIllllIlIlIllIllIl.props)) {
            return llllllllllllIllIllllIlIlIllIlIIl;
        }
        return llllllllllllIllIllllIlIlIllIllIl.props.getProperty(llllllllllllIllIllllIlIlIllIllll, llllllllllllIllIllllIlIlIllIlIIl);
    }
    
    public void render(final int llllllllllllIllIllllIlIlIlIlIIIl, final int llllllllllllIllIllllIlIlIlIIllIl) {
        this.render(llllllllllllIllIllllIlIlIlIlIIIl, llllllllllllIllIllllIlIlIlIIllIl, TiledMap.llIIlllIlIlllI[3], TiledMap.llIIlllIlIlllI[3], this.width, this.height, (boolean)(TiledMap.llIIlllIlIlllI[3] != 0));
    }
    
    private static boolean lIIIlllllIllIIll(final int llllllllllllIllIllllIIllIllIlllI) {
        return llllllllllllIllIllllIIllIllIlllI == 0;
    }
    
    public TileSet getTileSetByGID(final int llllllllllllIllIllllIlIIIlIlIlII) {
        int llllllllllllIllIllllIlIIIlIllIII = TiledMap.llIIlllIlIlllI[3];
        while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIlIllIII, this.tileSets.size())) {
            final TileSet llllllllllllIllIllllIlIIIlIllIIl = this.tileSets.get(llllllllllllIllIllllIlIIIlIllIII);
            if (lIIIlllllIlIllll(llllllllllllIllIllllIlIIIlIllIIl.contains(llllllllllllIllIllllIlIIIlIlIlII) ? 1 : 0)) {
                return llllllllllllIllIllllIlIIIlIllIIl;
            }
            ++llllllllllllIllIllllIlIIIlIllIII;
            "".length();
            if (((145 + 155 - 208 + 79 ^ 75 + 110 - 152 + 143) & (0xE4 ^ 0xC3 ^ (0x60 ^ 0x5C) ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        return null;
    }
    
    public String getObjectType(final int llllllllllllIllIllllIlIIIIIllllI, final int llllllllllllIllIllllIlIIIIIlllIl) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIIllllI) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIIllllI, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIlIIIIlIIIII = this.objectGroups.get(llllllllllllIllIllllIlIIIIIllllI);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIIlllIl) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIIlllIl, llllllllllllIllIllllIlIIIIlIIIII.objects.size())) {
                final GroupObject llllllllllllIllIllllIlIIIIlIIIIl = llllllllllllIllIllllIlIIIIlIIIII.objects.get(llllllllllllIllIllllIlIIIIIlllIl);
                return llllllllllllIllIllllIlIIIIlIIIIl.type;
            }
        }
        return null;
    }
    
    private void load(final InputStream llllllllllllIllIllllIlIIIlllIlIl, final String llllllllllllIllIllllIlIIIlllIlII) throws SlickException {
        this.tilesLocation = llllllllllllIllIllllIlIIIlllIlII;
        try {
            final DocumentBuilderFactory llllllllllllIllIllllIlIIIllllllI = DocumentBuilderFactory.newInstance();
            llllllllllllIllIllllIlIIIllllllI.setValidating((boolean)(TiledMap.llIIlllIlIlllI[3] != 0));
            final DocumentBuilder llllllllllllIllIllllIlIIIlllllIl = llllllllllllIllIllllIlIIIllllllI.newDocumentBuilder();
            llllllllllllIllIllllIlIIIlllllIl.setEntityResolver(new EntityResolver() {
                private static final /* synthetic */ int[] lIlllIlIIlIlll;
                
                static {
                    lIIIIIlIlIIlllll();
                }
                
                private static void lIIIIIlIlIIlllll() {
                    (lIlllIlIIlIlll = new int[1])[0] = ((0x7A ^ 0x19) & ~(0xDB ^ 0xB8));
                }
                
                public InputSource resolveEntity(final String llllllllllllIlllllIIIIlIllIIllll, final String llllllllllllIlllllIIIIlIllIIlllI) throws IOException, SAXException {
                    return new InputSource(new ByteArrayInputStream(new byte[TiledMap$1.lIlllIlIIlIlll[0]]));
                }
            });
            final Document llllllllllllIllIllllIlIIIlllllII = llllllllllllIllIllllIlIIIlllllIl.parse(llllllllllllIllIllllIlIIIlllIlIl);
            final Element llllllllllllIllIllllIlIIIllllIll = llllllllllllIllIllllIlIIIlllllII.getDocumentElement();
            if (lIIIlllllIlIllll(llllllllllllIllIllllIlIIIllllIll.getAttribute(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[5]]).equals(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[6]]) ? 1 : 0)) {
                this.orientation = TiledMap.llIIlllIlIlllI[0];
                "".length();
                if (((0x35 ^ 0x30) & ~(0x54 ^ 0x51)) > 0) {
                    return;
                }
            }
            else {
                this.orientation = TiledMap.llIIlllIlIlllI[5];
            }
            this.width = this.parseInt(llllllllllllIllIllllIlIIIllllIll.getAttribute(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[7]]));
            this.height = this.parseInt(llllllllllllIllIllllIlIIIllllIll.getAttribute(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[8]]));
            this.tileWidth = this.parseInt(llllllllllllIllIllllIlIIIllllIll.getAttribute(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[9]]));
            this.tileHeight = this.parseInt(llllllllllllIllIllllIlIIIllllIll.getAttribute(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[10]]));
            final Element llllllllllllIllIllllIlIIIllllIlI = (Element)llllllllllllIllIllllIlIIIllllIll.getElementsByTagName(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[11]]).item(TiledMap.llIIlllIlIlllI[3]);
            if (lIIIlllllIllIIlI(llllllllllllIllIllllIlIIIllllIlI)) {
                final NodeList llllllllllllIllIllllIlIIlIIIlIlI = llllllllllllIllIllllIlIIIllllIlI.getElementsByTagName(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[12]]);
                if (lIIIlllllIllIIlI(llllllllllllIllIllllIlIIlIIIlIlI)) {
                    this.props = new Properties();
                    int llllllllllllIllIllllIlIIlIIIlIll = TiledMap.llIIlllIlIlllI[3];
                    while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIIIlIll, llllllllllllIllIllllIlIIlIIIlIlI.getLength())) {
                        final Element llllllllllllIllIllllIlIIlIIIlllI = (Element)llllllllllllIllIllllIlIIlIIIlIlI.item(llllllllllllIllIllllIlIIlIIIlIll);
                        final String llllllllllllIllIllllIlIIlIIIllIl = llllllllllllIllIllllIlIIlIIIlllI.getAttribute(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[13]]);
                        final String llllllllllllIllIllllIlIIlIIIllII = llllllllllllIllIllllIlIIlIIIlllI.getAttribute(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[14]]);
                        this.props.setProperty(llllllllllllIllIllllIlIIlIIIllIl, llllllllllllIllIllllIlIIlIIIllII);
                        "".length();
                        ++llllllllllllIllIllllIlIIlIIIlIll;
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                }
            }
            if (lIIIlllllIlIllll(this.loadTileSets ? 1 : 0)) {
                TileSet llllllllllllIllIllllIlIIlIIIIlll = null;
                TileSet llllllllllllIllIllllIlIIlIIIIllI = null;
                final NodeList llllllllllllIllIllllIlIIlIIIIlIl = llllllllllllIllIllllIlIIIllllIll.getElementsByTagName(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[15]]);
                int llllllllllllIllIllllIlIIlIIIlIII = TiledMap.llIIlllIlIlllI[3];
                while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIIIlIII, llllllllllllIllIllllIlIIlIIIIlIl.getLength())) {
                    final Element lllllllllllllIlIIIIlIllIIlIlIIIl;
                    final Element llllllllllllIllIllllIlIIlIIIlIIl = lllllllllllllIlIIIIlIllIIlIlIIIl = (Element)llllllllllllIllIllllIlIIlIIIIlIl.item(llllllllllllIllIllllIlIIlIIIlIII);
                    int lllllllllllllIlIIIIlIllIIlIIIIIl;
                    if (lIIIlllllIllIIll(TiledMap.headless ? 1 : 0)) {
                        lllllllllllllIlIIIIlIllIIlIIIIIl = TiledMap.llIIlllIlIlllI[0];
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIlIIIIlIllIIlIIIIIl = TiledMap.llIIlllIlIlllI[3];
                    }
                    llllllllllllIllIllllIlIIlIIIIlll = new TileSet(this, lllllllllllllIlIIIIlIllIIlIlIIIl, (boolean)(lllllllllllllIlIIIIlIllIIlIIIIIl != 0));
                    llllllllllllIllIllllIlIIlIIIIlll.index = llllllllllllIllIllllIlIIlIIIlIII;
                    if (lIIIlllllIllIIlI(llllllllllllIllIllllIlIIlIIIIllI)) {
                        llllllllllllIllIllllIlIIlIIIIllI.setLimit(llllllllllllIllIllllIlIIlIIIIlll.firstGID - TiledMap.llIIlllIlIlllI[0]);
                    }
                    llllllllllllIllIllllIlIIlIIIIllI = llllllllllllIllIllllIlIIlIIIIlll;
                    this.tileSets.add(llllllllllllIllIllllIlIIlIIIIlll);
                    "".length();
                    ++llllllllllllIllIllllIlIIlIIIlIII;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            final NodeList llllllllllllIllIllllIlIIIllllIIl = llllllllllllIllIllllIlIIIllllIll.getElementsByTagName(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[16]]);
            int llllllllllllIllIllllIlIIlIIIIIlI = TiledMap.llIIlllIlIlllI[3];
            while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIIIIIlI, llllllllllllIllIllllIlIIIllllIIl.getLength())) {
                final Element llllllllllllIllIllllIlIIlIIIIlII = (Element)llllllllllllIllIllllIlIIIllllIIl.item(llllllllllllIllIllllIlIIlIIIIIlI);
                final Layer llllllllllllIllIllllIlIIlIIIIIll = new Layer(this, llllllllllllIllIllllIlIIlIIIIlII);
                llllllllllllIllIllllIlIIlIIIIIll.index = llllllllllllIllIllllIlIIlIIIIIlI;
                this.layers.add(llllllllllllIllIllllIlIIlIIIIIll);
                "".length();
                ++llllllllllllIllIllllIlIIlIIIIIlI;
                "".length();
                if ("   ".length() >= (0x2C ^ 0x28)) {
                    return;
                }
            }
            final NodeList llllllllllllIllIllllIlIIIllllIII = llllllllllllIllIllllIlIIIllllIll.getElementsByTagName(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[17]]);
            int llllllllllllIllIllllIlIIIlllllll = TiledMap.llIIlllIlIlllI[3];
            while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIlllllll, llllllllllllIllIllllIlIIIllllIII.getLength())) {
                final Element llllllllllllIllIllllIlIIlIIIIIIl = (Element)llllllllllllIllIllllIlIIIllllIII.item(llllllllllllIllIllllIlIIIlllllll);
                final ObjectGroup llllllllllllIllIllllIlIIlIIIIIII = new ObjectGroup(llllllllllllIllIllllIlIIlIIIIIIl);
                llllllllllllIllIllllIlIIlIIIIIII.index = llllllllllllIllIllllIlIIIlllllll;
                this.objectGroups.add(llllllllllllIllIllllIlIIlIIIIIII);
                "".length();
                ++llllllllllllIllIllllIlIIIlllllll;
                "".length();
                if ((137 + 31 - 57 + 32 ^ 12 + 61 + 17 + 49) < (5 + 76 - 11 + 75 ^ 129 + 73 - 96 + 43)) {
                    return;
                }
            }
            "".length();
            if (((0xF0 ^ 0xB4 ^ (0x53 ^ 0x2)) & (85 + 149 - 125 + 49 ^ 37 + 23 + 59 + 20 ^ -" ".length())) < 0) {
                return;
            }
        }
        catch (Exception llllllllllllIllIllllIlIIIlllIlll) {
            Log.error(llllllllllllIllIllllIlIIIlllIlll);
            throw new SlickException(TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[18]], llllllllllllIllIllllIlIIIlllIlll);
        }
    }
    
    public TileSet findTileSet(final int llllllllllllIllIllllIlIIIlIIlIII) {
        int llllllllllllIllIllllIlIIIlIIllII = TiledMap.llIIlllIlIlllI[3];
        while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIlIIllII, this.tileSets.size())) {
            final TileSet llllllllllllIllIllllIlIIIlIIllIl = this.tileSets.get(llllllllllllIllIllllIlIIIlIIllII);
            if (lIIIlllllIlIllll(llllllllllllIllIllllIlIIIlIIllIl.contains(llllllllllllIllIllllIlIIIlIIlIII) ? 1 : 0)) {
                return llllllllllllIllIllllIlIIIlIIllIl;
            }
            ++llllllllllllIllIllllIlIIIlIIllII;
            "".length();
            if ((0xAE ^ 0xAA) == " ".length()) {
                return null;
            }
        }
        return null;
    }
    
    private static boolean lIIIlllllIllIlII(final int llllllllllllIllIllllIIllIlllIlll, final int llllllllllllIllIllllIIllIlllIllI) {
        return llllllllllllIllIllllIIllIlllIlll > llllllllllllIllIllllIIllIlllIllI;
    }
    
    public int getLayerCount() {
        return this.layers.size();
    }
    
    public int getTileSetCount() {
        return this.tileSets.size();
    }
    
    public int getTileId(final int llllllllllllIllIllllIlIllIIlIlIl, final int llllllllllllIllIllllIlIllIIllIIl, final int llllllllllllIllIllllIlIllIIlIIll) {
        final Layer llllllllllllIllIllllIlIllIIlIlll = this.layers.get(llllllllllllIllIllllIlIllIIlIIll);
        return llllllllllllIllIllllIlIllIIlIlll.getTileID(llllllllllllIllIllllIlIllIIlIlIl, llllllllllllIllIllllIlIllIIllIIl);
    }
    
    public int getTileHeight() {
        return this.tileHeight;
    }
    
    private static void setHeadless(final boolean llllllllllllIllIllllIllIIIIIIIlI) {
        TiledMap.headless = llllllllllllIllIllllIllIIIIIIIlI;
    }
    
    public void setTileId(final int llllllllllllIllIllllIlIllIIIIlII, final int llllllllllllIllIllllIlIllIIIlIIl, final int llllllllllllIllIllllIlIllIIIlIII, final int llllllllllllIllIllllIlIllIIIIIIl) {
        final Layer llllllllllllIllIllllIlIllIIIIllI = this.layers.get(llllllllllllIllIllllIlIllIIIlIII);
        llllllllllllIllIllllIlIllIIIIllI.setTileID(llllllllllllIllIllllIlIllIIIIlII, llllllllllllIllIllllIlIllIIIlIIl, llllllllllllIllIllllIlIllIIIIIIl);
    }
    
    public void render(final int llllllllllllIllIllllIlIlIIIllllI, final int llllllllllllIllIllllIlIlIIIlIIll, final int llllllllllllIllIllllIlIlIIIlllII, final int llllllllllllIllIllllIlIlIIIllIll, final int llllllllllllIllIllllIlIlIIIllIlI, final int llllllllllllIllIllllIlIlIIIllIIl, final int llllllllllllIllIllllIlIlIIIllIII, final boolean llllllllllllIllIllllIlIlIIIlIlll) {
        final Layer llllllllllllIllIllllIlIlIIIlIllI = this.layers.get(llllllllllllIllIllllIlIlIIIllIII);
        switch (this.orientation) {
            case 1: {
                int llllllllllllIllIllllIlIlIIlIIIII = TiledMap.llIIlllIlIlllI[3];
                while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIlIIlIIIII, llllllllllllIllIllllIlIlIIIllIIl)) {
                    llllllllllllIllIllllIlIlIIIlIllI.render(llllllllllllIllIllllIlIlIIIllllI, llllllllllllIllIllllIlIlIIIlIIll, llllllllllllIllIllllIlIlIIIlllII, llllllllllllIllIllllIlIlIIIllIll, llllllllllllIllIllllIlIlIIIllIlI, llllllllllllIllIllllIlIlIIlIIIII, llllllllllllIllIllllIlIlIIIlIlll, this.tileWidth, this.tileHeight);
                    ++llllllllllllIllIllllIlIlIIlIIIII;
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                }
                "".length();
                if (-(0x35 ^ 0x30) >= 0) {
                    return;
                }
                break;
            }
            case 2: {
                this.renderIsometricMap(llllllllllllIllIllllIlIlIIIllllI, llllllllllllIllIllllIlIlIIIlIIll, llllllllllllIllIllllIlIlIIIlllII, llllllllllllIllIllllIlIlIIIllIll, llllllllllllIllIllllIlIlIIIllIlI, llllllllllllIllIllllIlIlIIIllIIl, llllllllllllIllIllllIlIlIIIlIllI, llllllllllllIllIllllIlIlIIIlIlll);
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                break;
            }
        }
    }
    
    private int parseInt(final String llllllllllllIllIllllIlIIlIIlllIl) {
        try {
            return Integer.parseInt(llllllllllllIllIllllIlIIlIIlllIl);
        }
        catch (NumberFormatException llllllllllllIllIllllIlIIlIlIIIII) {
            return TiledMap.llIIlllIlIlllI[3];
        }
    }
    
    public int getLayerIndex(final String llllllllllllIllIllllIlIlllIIlIll) {
        final int llllllllllllIllIllllIlIlllIIllIl = TiledMap.llIIlllIlIlllI[3];
        int llllllllllllIllIllllIlIlllIlIIII = TiledMap.llIIlllIlIlllI[3];
        while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIlllIlIIII, this.layers.size())) {
            final Layer llllllllllllIllIllllIlIlllIlIIIl = this.layers.get(llllllllllllIllIllllIlIlllIlIIII);
            if (lIIIlllllIlIllll(llllllllllllIllIllllIlIlllIlIIIl.name.equals(llllllllllllIllIllllIlIlllIIlIll) ? 1 : 0)) {
                return llllllllllllIllIllllIlIlllIlIIII;
            }
            ++llllllllllllIllIllllIlIlllIlIIII;
            "".length();
            if (((0x4E ^ 0x63) & ~(0x5D ^ 0x70)) > "  ".length()) {
                return (0x62 ^ 0x48) & ~(0x30 ^ 0x1A);
            }
        }
        return TiledMap.llIIlllIlIlllI[4];
    }
    
    public int getTileWidth() {
        return this.tileWidth;
    }
    
    public void render(final int llllllllllllIllIllllIlIlIlIIIlll, final int llllllllllllIllIllllIlIlIlIIIIlI, final int llllllllllllIllIllllIlIlIlIIIIIl) {
        this.render(llllllllllllIllIllllIlIlIlIIIlll, llllllllllllIllIllllIlIlIlIIIIlI, TiledMap.llIIlllIlIlllI[3], TiledMap.llIIlllIlIlllI[3], this.getWidth(), this.getHeight(), llllllllllllIllIllllIlIlIlIIIIIl, (boolean)(TiledMap.llIIlllIlIlllI[3] != 0));
    }
    
    public int getObjectX(final int llllllllllllIllIllllIlIIIIIIllII, final int llllllllllllIllIllllIlIIIIIIlIll) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIIIllII) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIIIllII, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIlIIIIIlIIIl = this.objectGroups.get(llllllllllllIllIllllIlIIIIIIllII);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIIIlIll) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIIIlIll, llllllllllllIllIllllIlIIIIIlIIIl.objects.size())) {
                final GroupObject llllllllllllIllIllllIlIIIIIlIIlI = llllllllllllIllIllllIlIIIIIlIIIl.objects.get(llllllllllllIllIllllIlIIIIIIlIll);
                return llllllllllllIllIllllIlIIIIIlIIlI.x;
            }
        }
        return TiledMap.llIIlllIlIlllI[4];
    }
    
    private static String lIIIlllllIlIIIIl(final String llllllllllllIllIllllIIlllIlIIIIl, final String llllllllllllIllIllllIIlllIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIlllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), TiledMap.llIIlllIlIlllI[11]), "DES");
            final Cipher llllllllllllIllIllllIIlllIlIIlIl = Cipher.getInstance("DES");
            llllllllllllIllIllllIIlllIlIIlIl.init(TiledMap.llIIlllIlIlllI[5], llllllllllllIllIllllIIlllIlIIllI);
            return new String(llllllllllllIllIllllIIlllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIlllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIlllIlIIlII) {
            llllllllllllIllIllllIIlllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlllllIlIIIlI(String llllllllllllIllIllllIIlllIIIlllI, final String llllllllllllIllIllllIIlllIIlIIlI) {
        llllllllllllIllIllllIIlllIIIlllI = new String(Base64.getDecoder().decode(llllllllllllIllIllllIIlllIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllllIIlllIIlIIIl = new StringBuilder();
        final char[] llllllllllllIllIllllIIlllIIlIIII = llllllllllllIllIllllIIlllIIlIIlI.toCharArray();
        int llllllllllllIllIllllIIlllIIIllll = TiledMap.llIIlllIlIlllI[3];
        final long llllllllllllIllIllllIIlllIIIlIIl = (Object)llllllllllllIllIllllIIlllIIIlllI.toCharArray();
        final long llllllllllllIllIllllIIlllIIIlIII = llllllllllllIllIllllIIlllIIIlIIl.length;
        float llllllllllllIllIllllIIlllIIIIlll = TiledMap.llIIlllIlIlllI[3];
        while (lIIIlllllIlIlllI((int)llllllllllllIllIllllIIlllIIIIlll, (int)llllllllllllIllIllllIIlllIIIlIII)) {
            final char llllllllllllIllIllllIIlllIIlIlII = llllllllllllIllIllllIIlllIIIlIIl[llllllllllllIllIllllIIlllIIIIlll];
            llllllllllllIllIllllIIlllIIlIIIl.append((char)(llllllllllllIllIllllIIlllIIlIlII ^ llllllllllllIllIllllIIlllIIlIIII[llllllllllllIllIllllIIlllIIIllll % llllllllllllIllIllllIIlllIIlIIII.length]));
            "".length();
            ++llllllllllllIllIllllIIlllIIIllll;
            ++llllllllllllIllIllllIIlllIIIIlll;
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllllIIlllIIlIIIl);
    }
    
    private static boolean lIIIlllllIllIllI(final int llllllllllllIllIllllIIlllIIIIIll, final int llllllllllllIllIllllIIlllIIIIIlI) {
        return llllllllllllIllIllllIIlllIIIIIll >= llllllllllllIllIllllIIlllIIIIIlI;
    }
    
    protected void renderIsometricMap(final int llllllllllllIllIllllIlIIlIlllIlI, final int llllllllllllIllIllllIlIIllIIlIlI, final int llllllllllllIllIllllIlIIllIIlIIl, final int llllllllllllIllIllllIlIIllIIlIII, final int llllllllllllIllIllllIlIIlIlllIII, final int llllllllllllIllIllllIlIIllIIIllI, final Layer llllllllllllIllIllllIlIIlIllIllI, final boolean llllllllllllIllIllllIlIIlIllIlIl) {
        ArrayList llllllllllllIllIllllIlIIllIIIIll = this.layers;
        if (lIIIlllllIllIIlI(llllllllllllIllIllllIlIIlIllIllI)) {
            llllllllllllIllIllllIlIIllIIIIll = new ArrayList();
            llllllllllllIllIllllIlIIllIIIIll.add(llllllllllllIllIllllIlIIlIllIllI);
            "".length();
        }
        final int llllllllllllIllIllllIlIIllIIIIlI = llllllllllllIllIllllIlIIlIlllIII * llllllllllllIllIllllIlIIllIIIllI;
        int llllllllllllIllIllllIlIIllIIIIIl = TiledMap.llIIlllIlIlllI[3];
        boolean llllllllllllIllIllllIlIIllIIIIII = TiledMap.llIIlllIlIlllI[3] != 0;
        int llllllllllllIllIllllIlIIlIllllll = llllllllllllIllIllllIlIIlIlllIlI;
        int llllllllllllIllIllllIlIIlIlllllI = llllllllllllIllIllllIlIIllIIlIlI;
        int llllllllllllIllIllllIlIIlIllllIl = TiledMap.llIIlllIlIlllI[3];
        int llllllllllllIllIllllIlIIlIllllII = TiledMap.llIIlllIlIlllI[3];
        while (lIIIlllllIllIIll(llllllllllllIllIllllIlIIllIIIIII ? 1 : 0)) {
            int llllllllllllIllIllllIlIIllIlIIII = llllllllllllIllIllllIlIIlIllllIl;
            int llllllllllllIllIllllIlIIllIIllll = llllllllllllIllIllllIlIIlIllllII;
            int llllllllllllIllIllllIlIIllIIlllI = llllllllllllIllIllllIlIIlIllllll;
            int llllllllllllIllIllllIlIIllIIllIl = TiledMap.llIIlllIlIlllI[3];
            if (lIIIlllllIllIlII(llllllllllllIllIllllIlIIllIIIllI, llllllllllllIllIllllIlIIlIlllIII)) {
                int n;
                if (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIllllII, llllllllllllIllIllllIlIIlIlllIII - TiledMap.llIIlllIlIlllI[0])) {
                    n = llllllllllllIllIllllIlIIlIllllII;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIlllIII - llllllllllllIllIllllIlIIllIlIIII, llllllllllllIllIllllIlIIllIIIllI)) {
                    n = llllllllllllIllIllllIlIIlIlllIII - llllllllllllIllIllllIlIIllIlIIII - TiledMap.llIIlllIlIlllI[0];
                    "".length();
                    if ((0x5A ^ 0x5E) < 0) {
                        return;
                    }
                }
                else {
                    n = llllllllllllIllIllllIlIIlIlllIII - TiledMap.llIIlllIlIlllI[0];
                }
                llllllllllllIllIllllIlIIllIIllIl = n;
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                int n2;
                if (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIllllII, llllllllllllIllIllllIlIIllIIIllI - TiledMap.llIIlllIlIlllI[0])) {
                    n2 = llllllllllllIllIllllIlIIlIllllII;
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return;
                    }
                }
                else if (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIlllIII - llllllllllllIllIllllIlIIllIlIIII, llllllllllllIllIllllIlIIllIIIllI)) {
                    n2 = llllllllllllIllIllllIlIIlIlllIII - llllllllllllIllIllllIlIIllIlIIII - TiledMap.llIIlllIlIlllI[0];
                    "".length();
                    if (((137 + 206 - 139 + 5 ^ 10 + 71 + 42 + 28) & (0x77 ^ 0x70 ^ (0x2 ^ 0x43) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    n2 = llllllllllllIllIllllIlIIllIIIllI - TiledMap.llIIlllIlIlllI[0];
                }
                llllllllllllIllIllllIlIIllIIllIl = n2;
            }
            int llllllllllllIllIllllIlIIllIlIIIl = TiledMap.llIIlllIlIlllI[3];
            while (lIIIlllllIllIlIl(llllllllllllIllIllllIlIIllIlIIIl, llllllllllllIllIllllIlIIllIIllIl)) {
                int llllllllllllIllIllllIlIIllIlIIlI = TiledMap.llIIlllIlIlllI[3];
                while (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIllIlIIlI, llllllllllllIllIllllIlIIllIIIIll.size())) {
                    final Layer llllllllllllIllIllllIlIIllIlIIll = llllllllllllIllIllllIlIIllIIIIll.get(llllllllllllIllIllllIlIIllIlIIlI);
                    llllllllllllIllIllllIlIIllIlIIll.render(llllllllllllIllIllllIlIIllIIlllI, llllllllllllIllIllllIlIIlIlllllI, llllllllllllIllIllllIlIIllIlIIII, llllllllllllIllIllllIlIIllIIllll, TiledMap.llIIlllIlIlllI[0], TiledMap.llIIlllIlIlllI[3], llllllllllllIllIllllIlIIlIllIlIl, this.tileWidth, this.tileHeight);
                    ++llllllllllllIllIllllIlIIllIlIIlI;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                llllllllllllIllIllllIlIIllIIlllI += this.tileWidth;
                ++llllllllllllIllIllllIlIIllIIIIIl;
                ++llllllllllllIllIllllIlIIllIlIIII;
                --llllllllllllIllIllllIlIIllIIllll;
                ++llllllllllllIllIllllIlIIllIlIIIl;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            if (lIIIlllllIlIlllI(llllllllllllIllIllllIlIIlIllllII, llllllllllllIllIllllIlIIllIIIllI - TiledMap.llIIlllIlIlllI[0])) {
                ++llllllllllllIllIllllIlIIlIllllII;
                llllllllllllIllIllllIlIIlIllllll -= this.tileWidth / TiledMap.llIIlllIlIlllI[5];
                llllllllllllIllIllllIlIIlIlllllI += this.tileHeight / TiledMap.llIIlllIlIlllI[5];
                "".length();
                if (((0xA8 ^ 0x8F) & ~(0x35 ^ 0x12)) < 0) {
                    return;
                }
            }
            else {
                ++llllllllllllIllIllllIlIIlIllllIl;
                llllllllllllIllIllllIlIIlIllllll += this.tileWidth / TiledMap.llIIlllIlIlllI[5];
                llllllllllllIllIllllIlIIlIlllllI += this.tileHeight / TiledMap.llIIlllIlIlllI[5];
            }
            if (lIIIlllllIllIllI(llllllllllllIllIllllIlIIllIIIIIl, llllllllllllIllIllllIlIIllIIIIlI)) {
                llllllllllllIllIllllIlIIllIIIIII = (TiledMap.llIIlllIlIlllI[0] != 0);
            }
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
    }
    
    private static boolean lIIIlllllIllIIII(final int llllllllllllIllIllllIIllIllIllII) {
        return llllllllllllIllIllllIIllIllIllII >= 0;
    }
    
    public String getTileProperty(final int llllllllllllIllIllllIlIlIllIIIII, final String llllllllllllIllIllllIlIlIlIlllll, final String llllllllllllIllIllllIlIlIlIllIII) {
        if (lIIIlllllIllIIll(llllllllllllIllIllllIlIlIllIIIII)) {
            return llllllllllllIllIllllIlIlIlIllIII;
        }
        final TileSet llllllllllllIllIllllIlIlIlIlllIl = this.findTileSet(llllllllllllIllIllllIlIlIllIIIII);
        final Properties llllllllllllIllIllllIlIlIlIlllII = llllllllllllIllIllllIlIlIlIlllIl.getProperties(llllllllllllIllIllllIlIlIllIIIII);
        if (lIIIlllllIllIIIl(llllllllllllIllIllllIlIlIlIlllII)) {
            return llllllllllllIllIllllIlIlIlIllIII;
        }
        return llllllllllllIllIllllIlIlIlIlllII.getProperty(llllllllllllIllIllllIlIlIlIlllll, llllllllllllIllIllllIlIlIlIllIII);
    }
    
    public TiledMap(final String llllllllllllIllIllllIlIllllllIll) throws SlickException {
        this(llllllllllllIllIllllIlIllllllIll, (boolean)(TiledMap.llIIlllIlIlllI[0] != 0));
    }
    
    static {
        lIIIlllllIlIllIl();
        lIIIlllllIlIIlll();
        ORTHOGONAL = TiledMap.llIIlllIlIlllI[0];
        ISOMETRIC = TiledMap.llIIlllIlIlllI[5];
    }
    
    public Image getTileImage(final int llllllllllllIllIllllIlIllIlllIlI, final int llllllllllllIllIllllIlIllIllIIll, final int llllllllllllIllIllllIlIllIllIIlI) {
        final Layer llllllllllllIllIllllIlIllIllIlll = this.layers.get(llllllllllllIllIllllIlIllIllIIlI);
        final int llllllllllllIllIllllIlIllIllIllI = llllllllllllIllIllllIlIllIllIlll.data[llllllllllllIllIllllIlIllIlllIlI][llllllllllllIllIllllIlIllIllIIll][TiledMap.llIIlllIlIlllI[3]];
        if (lIIIlllllIllIIII(llllllllllllIllIllllIlIllIllIllI) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIllIllIllI, this.tileSets.size())) {
            final TileSet llllllllllllIllIllllIlIllIlllllI = this.tileSets.get(llllllllllllIllIllllIlIllIllIllI);
            final int llllllllllllIllIllllIlIllIllllIl = llllllllllllIllIllllIlIllIlllllI.getTileX(llllllllllllIllIllllIlIllIllIlll.data[llllllllllllIllIllllIlIllIlllIlI][llllllllllllIllIllllIlIllIllIIll][TiledMap.llIIlllIlIlllI[0]]);
            final int llllllllllllIllIllllIlIllIllllII = llllllllllllIllIllllIlIllIlllllI.getTileY(llllllllllllIllIllllIlIllIllIlll.data[llllllllllllIllIllllIlIllIlllIlI][llllllllllllIllIllllIlIllIllIIll][TiledMap.llIIlllIlIlllI[0]]);
            return llllllllllllIllIllllIlIllIlllllI.tiles.getSprite(llllllllllllIllIllllIlIllIllllIl, llllllllllllIllIllllIlIllIllllII);
        }
        return null;
    }
    
    public int getObjectY(final int llllllllllllIllIllllIlIIIIIIIIII, final int llllllllllllIllIllllIIllllllllll) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIlIIIIIIIIII) && lIIIlllllIlIlllI(llllllllllllIllIllllIlIIIIIIIIII, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIlIIIIIIIIlI = this.objectGroups.get(llllllllllllIllIllllIlIIIIIIIIII);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIIllllllllll) && lIIIlllllIlIlllI(llllllllllllIllIllllIIllllllllll, llllllllllllIllIllllIlIIIIIIIIlI.objects.size())) {
                final GroupObject llllllllllllIllIllllIlIIIIIIIIll = llllllllllllIllIllllIlIIIIIIIIlI.objects.get(llllllllllllIllIllllIIllllllllll);
                return llllllllllllIllIllllIlIIIIIIIIll.y;
            }
        }
        return TiledMap.llIIlllIlIlllI[4];
    }
    
    public int getObjectHeight(final int llllllllllllIllIllllIIlllllIIIlI, final int llllllllllllIllIllllIIlllllIIIIl) {
        if (lIIIlllllIllIIII(llllllllllllIllIllllIIlllllIIIlI) && lIIIlllllIlIlllI(llllllllllllIllIllllIIlllllIIIlI, this.objectGroups.size())) {
            final ObjectGroup llllllllllllIllIllllIIlllllIIlII = this.objectGroups.get(llllllllllllIllIllllIIlllllIIIlI);
            if (lIIIlllllIllIIII(llllllllllllIllIllllIIlllllIIIIl) && lIIIlllllIlIlllI(llllllllllllIllIllllIIlllllIIIIl, llllllllllllIllIllllIIlllllIIlII.objects.size())) {
                final GroupObject llllllllllllIllIllllIIlllllIIlIl = llllllllllllIllIllllIIlllllIIlII.objects.get(llllllllllllIllIllllIIlllllIIIIl);
                return llllllllllllIllIllllIIlllllIIlIl.height;
            }
        }
        return TiledMap.llIIlllIlIlllI[4];
    }
    
    public int getWidth() {
        return this.width;
    }
    
    private static boolean lIIIlllllIlIllll(final int llllllllllllIllIllllIIllIlllIIII) {
        return llllllllllllIllIllllIIllIlllIIII != 0;
    }
    
    public TiledMap(final InputStream llllllllllllIllIllllIlIllllIIlIl) throws SlickException {
        this.tileSets = new ArrayList();
        this.layers = new ArrayList();
        this.objectGroups = new ArrayList();
        this.loadTileSets = (TiledMap.llIIlllIlIlllI[0] != 0);
        this.load(llllllllllllIllIllllIlIllllIIlIl, TiledMap.llIIlllIlIIlll[TiledMap.llIIlllIlIlllI[0]]);
    }
    
    private static void lIIIlllllIlIllIl() {
        (llIIlllIlIlllI = new int[20])[0] = " ".length();
        TiledMap.llIIlllIlIlllI[1] = (0x49 ^ 0x15);
        TiledMap.llIIlllIlIlllI[2] = (159 + 84 - 99 + 91 ^ 46 + 96 - 77 + 131);
        TiledMap.llIIlllIlIlllI[3] = ((0x66 ^ 0x6C ^ (0x33 ^ 0x79)) & (0x89 ^ 0xB1 ^ (0x4 ^ 0x7C) ^ -" ".length()));
        TiledMap.llIIlllIlIlllI[4] = -" ".length();
        TiledMap.llIIlllIlIlllI[5] = "  ".length();
        TiledMap.llIIlllIlIlllI[6] = "   ".length();
        TiledMap.llIIlllIlIlllI[7] = (0x57 ^ 0x34 ^ (0x58 ^ 0x3F));
        TiledMap.llIIlllIlIlllI[8] = (0xE ^ 0xB);
        TiledMap.llIIlllIlIlllI[9] = (0x65 ^ 0x63);
        TiledMap.llIIlllIlIlllI[10] = (0x53 ^ 0x54);
        TiledMap.llIIlllIlIlllI[11] = (0x25 ^ 0x2D);
        TiledMap.llIIlllIlIlllI[12] = (0xCA ^ 0xC3);
        TiledMap.llIIlllIlIlllI[13] = (0x4 ^ 0x43 ^ (0x3C ^ 0x71));
        TiledMap.llIIlllIlIlllI[14] = (0x18 ^ 0x13);
        TiledMap.llIIlllIlIlllI[15] = (0xB4 ^ 0xB8);
        TiledMap.llIIlllIlIlllI[16] = (0xAC ^ 0xA1);
        TiledMap.llIIlllIlIlllI[17] = (0x50 ^ 0x5E);
        TiledMap.llIIlllIlIlllI[18] = (0x42 ^ 0x6D ^ (0x67 ^ 0x47));
        TiledMap.llIIlllIlIlllI[19] = (107 + 4 + 40 + 31 ^ 73 + 147 - 103 + 49);
    }
    
    public String getMapProperty(final String llllllllllllIllIllllIlIlIllllIll, final String llllllllllllIllIllllIlIlIlllIlll) {
        if (lIIIlllllIllIIIl(this.props)) {
            return llllllllllllIllIllllIlIlIlllIlll;
        }
        return this.props.getProperty(llllllllllllIllIllllIlIlIllllIll, llllllllllllIllIllllIlIlIlllIlll);
    }
    
    private static boolean lIIIlllllIllIlIl(final int llllllllllllIllIllllIIllIllllIll, final int llllllllllllIllIllllIIllIllllIlI) {
        return llllllllllllIllIllllIIllIllllIll <= llllllllllllIllIllllIIllIllllIlI;
    }
    
    protected void renderedLine(final int llllllllllllIllIllllIlIIIlIIIlII, final int llllllllllllIllIllllIlIIIlIIIIll, final int llllllllllllIllIllllIlIIIlIIIIlI) {
    }
    
    protected class GroupObject
    {
        public /* synthetic */ int width;
        public /* synthetic */ String name;
        public /* synthetic */ String type;
        public /* synthetic */ int index;
        public /* synthetic */ int y;
        private static final /* synthetic */ int[] lIlIllIIlIlllI;
        public /* synthetic */ int height;
        public /* synthetic */ Properties props;
        private /* synthetic */ String image;
        public /* synthetic */ int x;
        private static final /* synthetic */ String[] lIlIllIIlIllIl;
        
        private static boolean llllIIIlIIIIllI(final int lllllllllllllIIIIllIlllllllIlIlI, final int lllllllllllllIIIIllIlllllllIlIIl) {
            return lllllllllllllIIIIllIlllllllIlIlI < lllllllllllllIIIIllIlllllllIlIIl;
        }
        
        private static boolean llllIIIlIIIIlIl(final Object lllllllllllllIIIIllIlllllllIIlll) {
            return lllllllllllllIIIIllIlllllllIIlll != null;
        }
        
        private static void llllIIIlIIIIIll() {
            (lIlIllIIlIllIl = new String[GroupObject.lIlIllIIlIlllI[12]])[GroupObject.lIlIllIIlIlllI[0]] = llllIIIlIIIIIII("Z+twTeyzfFo=", "GlqXL");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[1]] = llllIIIlIIIIIIl("I6CZ4bkDWIE=", "JWnrK");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[2]] = llllIIIlIIIIIlI("DQ==", "uTKoO");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[3]] = llllIIIlIIIIIII("temEsaI6l18=", "ePChD");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[4]] = llllIIIlIIIIIlI("MzMRISo=", "DZuUB");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[5]] = llllIIIlIIIIIlI("PyYmAAIj", "WCOgj");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[6]] = llllIIIlIIIIIIl("7SZZpc/aiPU=", "cUzSv");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[7]] = llllIIIlIIIIIIl("gWr3e5pvB9o=", "yGLdN");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[8]] = llllIIIlIIIIIlI("OAcLAyg6AQ0WPg==", "HudsM");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[9]] = llllIIIlIIIIIIl("5nqbNp6OIruRkwdd3VOHfQ==", "qzVlA");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[10]] = llllIIIlIIIIIlI("PAsMAw==", "RjafS");
            GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[11]] = llllIIIlIIIIIIl("N8+clcjlZoo=", "YeAvQ");
        }
        
        private static String llllIIIlIIIIIlI(String lllllllllllllIIIIllIllllllllIlIl, final String lllllllllllllIIIIllIlllllllllIIl) {
            lllllllllllllIIIIllIllllllllIlIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIllllllllIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIllIlllllllllIII = new StringBuilder();
            final char[] lllllllllllllIIIIllIllllllllIlll = lllllllllllllIIIIllIlllllllllIIl.toCharArray();
            int lllllllllllllIIIIllIllllllllIllI = GroupObject.lIlIllIIlIlllI[0];
            final byte lllllllllllllIIIIllIllllllllIIII = (Object)((String)lllllllllllllIIIIllIllllllllIlIl).toCharArray();
            final int lllllllllllllIIIIllIlllllllIllll = lllllllllllllIIIIllIllllllllIIII.length;
            String lllllllllllllIIIIllIlllllllIlllI = (String)GroupObject.lIlIllIIlIlllI[0];
            while (llllIIIlIIIIllI((int)lllllllllllllIIIIllIlllllllIlllI, lllllllllllllIIIIllIlllllllIllll)) {
                final char lllllllllllllIIIIllIlllllllllIll = lllllllllllllIIIIllIllllllllIIII[lllllllllllllIIIIllIlllllllIlllI];
                lllllllllllllIIIIllIlllllllllIII.append((char)(lllllllllllllIIIIllIlllllllllIll ^ lllllllllllllIIIIllIllllllllIlll[lllllllllllllIIIIllIllllllllIllI % lllllllllllllIIIIllIllllllllIlll.length]));
                "".length();
                ++lllllllllllllIIIIllIllllllllIllI;
                ++lllllllllllllIIIIllIlllllllIlllI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIllIlllllllllIII);
        }
        
        static {
            llllIIIlIIIIlII();
            llllIIIlIIIIIll();
        }
        
        private static void llllIIIlIIIIlII() {
            (lIlIllIIlIlllI = new int[13])[0] = ((0x1 ^ 0x22) & ~(0x32 ^ 0x11));
            GroupObject.lIlIllIIlIlllI[1] = " ".length();
            GroupObject.lIlIllIIlIlllI[2] = "  ".length();
            GroupObject.lIlIllIIlIlllI[3] = "   ".length();
            GroupObject.lIlIllIIlIlllI[4] = (0x52 ^ 0x56);
            GroupObject.lIlIllIIlIlllI[5] = (0xCA ^ 0xA8 ^ (0xC9 ^ 0xAE));
            GroupObject.lIlIllIIlIlllI[6] = (58 + 106 - 103 + 71 ^ 73 + 123 - 130 + 64);
            GroupObject.lIlIllIIlIlllI[7] = (0x98 ^ 0x9F);
            GroupObject.lIlIllIIlIlllI[8] = (0x22 ^ 0x3F ^ (0x86 ^ 0x93));
            GroupObject.lIlIllIIlIlllI[9] = (0x88 ^ 0x81);
            GroupObject.lIlIllIIlIlllI[10] = (0x2E ^ 0x24);
            GroupObject.lIlIllIIlIlllI[11] = (0x58 ^ 0x53);
            GroupObject.lIlIllIIlIlllI[12] = (0x4F ^ 0x43);
        }
        
        private static String llllIIIlIIIIIIl(final String lllllllllllllIIIIlllIIIIIIIIlIII, final String lllllllllllllIIIIlllIIIIIIIIIlll) {
            try {
                final SecretKeySpec lllllllllllllIIIIlllIIIIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), GroupObject.lIlIllIIlIlllI[8]), "DES");
                final Cipher lllllllllllllIIIIlllIIIIIIIIllII = Cipher.getInstance("DES");
                lllllllllllllIIIIlllIIIIIIIIllII.init(GroupObject.lIlIllIIlIlllI[2], lllllllllllllIIIIlllIIIIIIIIllIl);
                return new String(lllllllllllllIIIIlllIIIIIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlllIIIIIIIIlIll) {
                lllllllllllllIIIIlllIIIIIIIIlIll.printStackTrace();
                return null;
            }
        }
        
        public GroupObject(final Element lllllllllllllIIIIlllIIIIIIlIlllI) throws SlickException {
            this.name = lllllllllllllIIIIlllIIIIIIlIlllI.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[0]]);
            this.type = lllllllllllllIIIIlllIIIIIIlIlllI.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[1]]);
            this.x = Integer.parseInt(lllllllllllllIIIIlllIIIIIIlIlllI.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[2]]));
            this.y = Integer.parseInt(lllllllllllllIIIIlllIIIIIIlIlllI.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[3]]));
            this.width = Integer.parseInt(lllllllllllllIIIIlllIIIIIIlIlllI.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[4]]));
            this.height = Integer.parseInt(lllllllllllllIIIIlllIIIIIIlIlllI.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[5]]));
            final Element lllllllllllllIIIIlllIIIIIIlIllIl = (Element)lllllllllllllIIIIlllIIIIIIlIlllI.getElementsByTagName(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[6]]).item(GroupObject.lIlIllIIlIlllI[0]);
            if (llllIIIlIIIIlIl(lllllllllllllIIIIlllIIIIIIlIllIl)) {
                this.image = lllllllllllllIIIIlllIIIIIIlIllIl.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[7]]);
            }
            final Element lllllllllllllIIIIlllIIIIIIlIllII = (Element)lllllllllllllIIIIlllIIIIIIlIlllI.getElementsByTagName(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[8]]).item(GroupObject.lIlIllIIlIlllI[0]);
            if (llllIIIlIIIIlIl(lllllllllllllIIIIlllIIIIIIlIllII)) {
                final NodeList lllllllllllllIIIIlllIIIIIIllIIII = lllllllllllllIIIIlllIIIIIIlIllII.getElementsByTagName(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[9]]);
                if (llllIIIlIIIIlIl(lllllllllllllIIIIlllIIIIIIllIIII)) {
                    this.props = new Properties();
                    int lllllllllllllIIIIlllIIIIIIllIIIl = GroupObject.lIlIllIIlIlllI[0];
                    while (llllIIIlIIIIllI(lllllllllllllIIIIlllIIIIIIllIIIl, lllllllllllllIIIIlllIIIIIIllIIII.getLength())) {
                        final Element lllllllllllllIIIIlllIIIIIIllIlII = (Element)lllllllllllllIIIIlllIIIIIIllIIII.item(lllllllllllllIIIIlllIIIIIIllIIIl);
                        final String lllllllllllllIIIIlllIIIIIIllIIll = lllllllllllllIIIIlllIIIIIIllIlII.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[10]]);
                        final String lllllllllllllIIIIlllIIIIIIllIIlI = lllllllllllllIIIIlllIIIIIIllIlII.getAttribute(GroupObject.lIlIllIIlIllIl[GroupObject.lIlIllIIlIlllI[11]]);
                        this.props.setProperty(lllllllllllllIIIIlllIIIIIIllIIll, lllllllllllllIIIIlllIIIIIIllIIlI);
                        "".length();
                        ++lllllllllllllIIIIlllIIIIIIllIIIl;
                        "".length();
                        if (" ".length() >= "  ".length()) {
                            throw null;
                        }
                    }
                }
            }
        }
        
        private static String llllIIIlIIIIIII(final String lllllllllllllIIIIlllIIIIIIIlIlll, final String lllllllllllllIIIIlllIIIIIIIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIIlllIIIIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIlllIIIIIIIllIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIlllIIIIIIIllIIl.init(GroupObject.lIlIllIIlIlllI[2], lllllllllllllIIIIlllIIIIIIIllIlI);
                return new String(lllllllllllllIIIIlllIIIIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlllIIIIIIIllIII) {
                lllllllllllllIIIIlllIIIIIIIllIII.printStackTrace();
                return null;
            }
        }
    }
    
    protected class ObjectGroup
    {
        public /* synthetic */ int height;
        public /* synthetic */ int width;
        public /* synthetic */ ArrayList objects;
        public /* synthetic */ String name;
        public /* synthetic */ int index;
        private static final /* synthetic */ String[] llllIIllllIlI;
        public /* synthetic */ Properties props;
        private static final /* synthetic */ int[] llllIIlllllll;
        
        public ObjectGroup(final Element lllllllllllllIlIlllIIIIlIllllIll) throws SlickException {
            this.name = lllllllllllllIlIlllIIIIlIllllIll.getAttribute(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[0]]);
            this.width = Integer.parseInt(lllllllllllllIlIlllIIIIlIllllIll.getAttribute(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[1]]));
            this.height = Integer.parseInt(lllllllllllllIlIlllIIIIlIllllIll.getAttribute(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[2]]));
            this.objects = new ArrayList();
            final Element lllllllllllllIlIlllIIIIlIllllIlI = (Element)lllllllllllllIlIlllIIIIlIllllIll.getElementsByTagName(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[3]]).item(ObjectGroup.llllIIlllllll[0]);
            if (lIlIlIIlIllIlll(lllllllllllllIlIlllIIIIlIllllIlI)) {
                final NodeList lllllllllllllIlIlllIIIIllIIIIIII = lllllllllllllIlIlllIIIIlIllllIlI.getElementsByTagName(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[4]]);
                if (lIlIlIIlIllIlll(lllllllllllllIlIlllIIIIllIIIIIII)) {
                    this.props = new Properties();
                    int lllllllllllllIlIlllIIIIllIIIIIIl = ObjectGroup.llllIIlllllll[0];
                    while (lIlIlIIlIlllIII(lllllllllllllIlIlllIIIIllIIIIIIl, lllllllllllllIlIlllIIIIllIIIIIII.getLength())) {
                        final Element lllllllllllllIlIlllIIIIllIIIIlII = (Element)lllllllllllllIlIlllIIIIllIIIIIII.item(lllllllllllllIlIlllIIIIllIIIIIIl);
                        final String lllllllllllllIlIlllIIIIllIIIIIll = lllllllllllllIlIlllIIIIllIIIIlII.getAttribute(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[5]]);
                        final String lllllllllllllIlIlllIIIIllIIIIIlI = lllllllllllllIlIlllIIIIllIIIIlII.getAttribute(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[6]]);
                        this.props.setProperty(lllllllllllllIlIlllIIIIllIIIIIll, lllllllllllllIlIlllIIIIllIIIIIlI);
                        "".length();
                        ++lllllllllllllIlIlllIIIIllIIIIIIl;
                        "".length();
                        if (((0xC ^ 0x72 ^ (0x2E ^ 0x5E)) & (132 + 3 - 39 + 65 ^ 3 + 79 + 39 + 54 ^ -" ".length())) <= -" ".length()) {
                            throw null;
                        }
                    }
                }
            }
            final NodeList lllllllllllllIlIlllIIIIlIllllIIl = lllllllllllllIlIlllIIIIlIllllIll.getElementsByTagName(ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[7]]);
            int lllllllllllllIlIlllIIIIlIlllllIl = ObjectGroup.llllIIlllllll[0];
            while (lIlIlIIlIlllIII(lllllllllllllIlIlllIIIIlIlllllIl, lllllllllllllIlIlllIIIIlIllllIIl.getLength())) {
                final Element lllllllllllllIlIlllIIIIlIlllllll = (Element)lllllllllllllIlIlllIIIIlIllllIIl.item(lllllllllllllIlIlllIIIIlIlllllIl);
                final GroupObject lllllllllllllIlIlllIIIIlIllllllI = new GroupObject(lllllllllllllIlIlllIIIIlIlllllll);
                lllllllllllllIlIlllIIIIlIllllllI.index = lllllllllllllIlIlllIIIIlIlllllIl;
                this.objects.add(lllllllllllllIlIlllIIIIlIllllllI);
                "".length();
                ++lllllllllllllIlIlllIIIIlIlllllIl;
                "".length();
                if (" ".length() >= (0x7A ^ 0x7E)) {
                    throw null;
                }
            }
        }
        
        static {
            lIlIlIIlIllIllI();
            lIlIlIIlIllIIIl();
        }
        
        private static boolean lIlIlIIlIllIlll(final Object lllllllllllllIlIlllIIIIlIIlllIII) {
            return lllllllllllllIlIlllIIIIlIIlllIII != null;
        }
        
        private static void lIlIlIIlIllIllI() {
            (llllIIlllllll = new int[9])[0] = ((0x85 ^ 0xA8) & ~(0xAF ^ 0x82));
            ObjectGroup.llllIIlllllll[1] = " ".length();
            ObjectGroup.llllIIlllllll[2] = "  ".length();
            ObjectGroup.llllIIlllllll[3] = "   ".length();
            ObjectGroup.llllIIlllllll[4] = (0x35 ^ 0x31);
            ObjectGroup.llllIIlllllll[5] = (0x22 ^ 0x27);
            ObjectGroup.llllIIlllllll[6] = (0xBC ^ 0xBA);
            ObjectGroup.llllIIlllllll[7] = (81 + 83 - 37 + 16 ^ 55 + 52 - 97 + 126);
            ObjectGroup.llllIIlllllll[8] = (0x1B ^ 0x13);
        }
        
        private static void lIlIlIIlIllIIIl() {
            (llllIIllllIlI = new String[ObjectGroup.llllIIlllllll[8]])[ObjectGroup.llllIIlllllll[0]] = lIlIlIIlIlIlllI("z3SL8oMA824=", "yGqCo");
            ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[1]] = lIlIlIIlIlIlllI("rNXvKvNsxHo=", "FKcry");
            ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[2]] = lIlIlIIlIlIllll("1GBFim5b+TM=", "XGjOR");
            ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[3]] = lIlIlIIlIllIIII("GhE3CSgYFzEcPg==", "jcXyM");
            ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[4]] = lIlIlIIlIlIlllI("L5EuyxMhu0y64J3Bx2pOjQ==", "NwIuH");
            ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[5]] = lIlIlIIlIlIllll("osyAlbM1cjU=", "dtAMS");
            ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[6]] = lIlIlIIlIlIllll("cL0io4yeBk0=", "Mcpou");
            ObjectGroup.llllIIllllIlI[ObjectGroup.llllIIlllllll[7]] = lIlIlIIlIlIllll("ZcTsW0mavhA=", "QnrMn");
        }
        
        private static String lIlIlIIlIlIlllI(final String lllllllllllllIlIlllIIIIlIlIllIll, final String lllllllllllllIlIlllIIIIlIlIllIII) {
            try {
                final SecretKeySpec lllllllllllllIlIlllIIIIlIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIIlIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlllIIIIlIlIlllIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlllIIIIlIlIlllIl.init(ObjectGroup.llllIIlllllll[2], lllllllllllllIlIlllIIIIlIlIllllI);
                return new String(lllllllllllllIlIlllIIIIlIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllIIIIlIlIlllII) {
                lllllllllllllIlIlllIIIIlIlIlllII.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIlIIlIllIIII(String lllllllllllllIlIlllIIIIlIlIIIllI, final String lllllllllllllIlIlllIIIIlIlIIlIlI) {
            lllllllllllllIlIlllIIIIlIlIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlllIIIIlIlIIlIIl = new StringBuilder();
            final char[] lllllllllllllIlIlllIIIIlIlIIlIII = lllllllllllllIlIlllIIIIlIlIIlIlI.toCharArray();
            int lllllllllllllIlIlllIIIIlIlIIIlll = ObjectGroup.llllIIlllllll[0];
            final String lllllllllllllIlIlllIIIIlIlIIIIIl = (Object)lllllllllllllIlIlllIIIIlIlIIIllI.toCharArray();
            final double lllllllllllllIlIlllIIIIlIlIIIIII = lllllllllllllIlIlllIIIIlIlIIIIIl.length;
            int lllllllllllllIlIlllIIIIlIIllllll = ObjectGroup.llllIIlllllll[0];
            while (lIlIlIIlIlllIII(lllllllllllllIlIlllIIIIlIIllllll, (int)lllllllllllllIlIlllIIIIlIlIIIIII)) {
                final char lllllllllllllIlIlllIIIIlIlIIllII = lllllllllllllIlIlllIIIIlIlIIIIIl[lllllllllllllIlIlllIIIIlIIllllll];
                lllllllllllllIlIlllIIIIlIlIIlIIl.append((char)(lllllllllllllIlIlllIIIIlIlIIllII ^ lllllllllllllIlIlllIIIIlIlIIlIII[lllllllllllllIlIlllIIIIlIlIIIlll % lllllllllllllIlIlllIIIIlIlIIlIII.length]));
                "".length();
                ++lllllllllllllIlIlllIIIIlIlIIIlll;
                ++lllllllllllllIlIlllIIIIlIIllllll;
                "".length();
                if ((113 + 70 - 93 + 50 ^ 1 + 80 - 32 + 87) <= "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlllIIIIlIlIIlIIl);
        }
        
        private static boolean lIlIlIIlIlllIII(final int lllllllllllllIlIlllIIIIlIIlllIll, final int lllllllllllllIlIlllIIIIlIIlllIlI) {
            return lllllllllllllIlIlllIIIIlIIlllIll < lllllllllllllIlIlllIIIIlIIlllIlI;
        }
        
        private static String lIlIlIIlIlIllll(final String lllllllllllllIlIlllIIIIlIllIlIII, final String lllllllllllllIlIlllIIIIlIllIIlll) {
            try {
                final SecretKeySpec lllllllllllllIlIlllIIIIlIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), ObjectGroup.llllIIlllllll[8]), "DES");
                final Cipher lllllllllllllIlIlllIIIIlIllIlIlI = Cipher.getInstance("DES");
                lllllllllllllIlIlllIIIIlIllIlIlI.init(ObjectGroup.llllIIlllllll[2], lllllllllllllIlIlllIIIIlIllIlIll);
                return new String(lllllllllllllIlIlllIIIIlIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllIIIIlIllIlIIl) {
                lllllllllllllIlIlllIIIIlIllIlIIl.printStackTrace();
                return null;
            }
        }
    }
}
