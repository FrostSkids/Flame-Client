// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tiled;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import java.io.InputStream;
import org.newdawn.slick.Image;
import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.Log;
import javax.xml.parsers.DocumentBuilderFactory;
import org.newdawn.slick.util.ResourceLoader;
import org.w3c.dom.Element;
import java.util.Properties;
import org.newdawn.slick.SpriteSheet;
import java.util.HashMap;

public class TileSet
{
    public /* synthetic */ int tilesDown;
    public /* synthetic */ int tilesAcross;
    protected /* synthetic */ int tileSpacing;
    public /* synthetic */ int firstGID;
    protected /* synthetic */ int tileMargin;
    private final /* synthetic */ TiledMap map;
    public /* synthetic */ int tileHeight;
    public /* synthetic */ int lastGID;
    private static final /* synthetic */ int[] lIIIlIllIlIIll;
    private /* synthetic */ HashMap props;
    public /* synthetic */ int tileWidth;
    public /* synthetic */ SpriteSheet tiles;
    private static final /* synthetic */ String[] lIIIlIllIlIIIl;
    public /* synthetic */ String name;
    
    private static boolean llIIIIIlllIlIlI(final int lllllllllllllIlIIIIlIlIllIllIllI) {
        return lllllllllllllIlIIIIlIlIllIllIllI <= 0;
    }
    
    private static boolean llIIIIIlllIllII(final int lllllllllllllIlIIIIlIlIllIllllll, final int lllllllllllllIlIIIIlIlIllIlllllI) {
        return lllllllllllllIlIIIIlIlIllIllllll <= lllllllllllllIlIIIIlIlIllIlllllI;
    }
    
    private static boolean llIIIIIlllIlIII(final int lllllllllllllIlIIIIlIlIllIllIlII) {
        return lllllllllllllIlIIIIlIlIllIllIlII > 0;
    }
    
    static {
        llIIIIIlllIIlII();
        llIIIIIlllIIIIl();
    }
    
    private static boolean llIIIIIlllIIllI(final int lllllllllllllIlIIIIlIlIllIlllIII) {
        return lllllllllllllIlIIIIlIlIllIlllIII == 0;
    }
    
    public void setLimit(final int lllllllllllllIlIIIIlIllIIIIIIIlI) {
        this.lastGID = lllllllllllllIlIIIIlIllIIIIIIIlI;
    }
    
    public Properties getProperties(final int lllllllllllllIlIIIIlIllIIIIlIlII) {
        return this.props.get(new Integer(lllllllllllllIlIIIIlIllIIIIlIlII));
    }
    
    public TileSet(final TiledMap lllllllllllllIlIIIIlIllIIlIIIIll, Element lllllllllllllIlIIIIlIllIIlIIIIlI, final boolean lllllllllllllIlIIIIlIllIIlIIIIIl) throws SlickException {
        this.lastGID = TileSet.lIIIlIllIlIIll[0];
        this.props = new HashMap();
        this.tileSpacing = TileSet.lIIIlIllIlIIll[1];
        this.tileMargin = TileSet.lIIIlIllIlIIll[1];
        this.map = lllllllllllllIlIIIIlIllIIlIIIIll;
        this.name = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[1]]);
        this.firstGID = Integer.parseInt(((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[2]]));
        final String lllllllllllllIlIIIIlIllIIlIIllll = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[3]]);
        if (llIIIIIlllIIlIl(lllllllllllllIlIIIIlIllIIlIIllll) && llIIIIIlllIIllI(lllllllllllllIlIIIIlIllIIlIIllll.equals(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[4]]) ? 1 : 0)) {
            try {
                final InputStream lllllllllllllIlIIIIlIllIIllIIlII = ResourceLoader.getResourceAsStream(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIIlIllIIlIIIIll.getTilesLocation()).append(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[5]]).append(lllllllllllllIlIIIIlIllIIlIIllll)));
                final DocumentBuilder lllllllllllllIlIIIIlIllIIllIIIll = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                final Document lllllllllllllIlIIIIlIllIIllIIIlI = lllllllllllllIlIIIIlIllIIllIIIll.parse(lllllllllllllIlIIIIlIllIIllIIlII);
                final Element lllllllllllllIlIIIIlIllIIllIIIIl = (Element)(lllllllllllllIlIIIIlIllIIlIIIIlI = lllllllllllllIlIIIIlIllIIllIIIlI.getDocumentElement());
                "".length();
                if (((0x7E ^ 0x4D) & ~(0xF3 ^ 0xC0) & ~((0x1D ^ 0x49) & ~(0x4F ^ 0x1B))) == "   ".length()) {
                    throw null;
                }
            }
            catch (Exception lllllllllllllIlIIIIlIllIIllIIIII) {
                Log.error(lllllllllllllIlIIIIlIllIIllIIIII);
                throw new SlickException(String.valueOf(new StringBuilder().append(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[6]]).append(this.map.tilesLocation).append(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[7]]).append(lllllllllllllIlIIIIlIllIIlIIllll)));
            }
        }
        final String lllllllllllllIlIIIIlIllIIlIIlllI = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[8]]);
        final String lllllllllllllIlIIIIlIllIIlIIllIl = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[9]]);
        if (!llIIIIIlllIIlll(lllllllllllllIlIIIIlIllIIlIIlllI.length()) || llIIIIIlllIIllI(lllllllllllllIlIIIIlIllIIlIIllIl.length())) {
            throw new SlickException(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[10]]);
        }
        this.tileWidth = Integer.parseInt(lllllllllllllIlIIIIlIllIIlIIlllI);
        this.tileHeight = Integer.parseInt(lllllllllllllIlIIIIlIllIIlIIllIl);
        final String lllllllllllllIlIIIIlIllIIlIIllII = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[11]]);
        if (llIIIIIlllIIlIl(lllllllllllllIlIIIIlIllIIlIIllII) && llIIIIIlllIIllI(lllllllllllllIlIIIIlIllIIlIIllII.equals(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[12]]) ? 1 : 0)) {
            this.tileSpacing = Integer.parseInt(lllllllllllllIlIIIIlIllIIlIIllII);
        }
        final String lllllllllllllIlIIIIlIllIIlIIlIll = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[13]]);
        if (llIIIIIlllIIlIl(lllllllllllllIlIIIIlIllIIlIIlIll) && llIIIIIlllIIllI(lllllllllllllIlIIIIlIllIIlIIlIll.equals(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[14]]) ? 1 : 0)) {
            this.tileMargin = Integer.parseInt(lllllllllllllIlIIIIlIllIIlIIlIll);
        }
        final NodeList lllllllllllllIlIIIIlIllIIlIIlIlI = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getElementsByTagName(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[15]]);
        final Element lllllllllllllIlIIIIlIllIIlIIlIIl = (Element)lllllllllllllIlIIIIlIllIIlIIlIlI.item(TileSet.lIIIlIllIlIIll[1]);
        final String lllllllllllllIlIIIIlIllIIlIIlIII = lllllllllllllIlIIIIlIllIIlIIlIIl.getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[16]]);
        Color lllllllllllllIlIIIIlIllIIlIIIlll = null;
        final String lllllllllllllIlIIIIlIllIIlIIIllI = lllllllllllllIlIIIIlIllIIlIIlIIl.getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[17]]);
        if (llIIIIIlllIIlIl(lllllllllllllIlIIIIlIllIIlIIIllI) && llIIIIIlllIlIII(lllllllllllllIlIIIIlIllIIlIIIllI.length())) {
            final int lllllllllllllIlIIIIlIllIIlIlllll = Integer.parseInt(lllllllllllllIlIIIIlIllIIlIIIllI, TileSet.lIIIlIllIlIIll[17]);
            lllllllllllllIlIIIIlIllIIlIIIlll = new Color(lllllllllllllIlIIIIlIllIIlIlllll);
        }
        if (llIIIIIlllIIlll(lllllllllllllIlIIIIlIllIIlIIIIIl ? 1 : 0)) {
            final Image lllllllllllllIlIIIIlIllIIlIllllI = new Image(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIIlIllIIlIIIIll.getTilesLocation()).append(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[18]]).append(lllllllllllllIlIIIIlIllIIlIIlIII)), (boolean)(TileSet.lIIIlIllIlIIll[1] != 0), TileSet.lIIIlIllIlIIll[3], lllllllllllllIlIIIIlIllIIlIIIlll);
            this.setTileSetImage(lllllllllllllIlIIIIlIllIIlIllllI);
        }
        final NodeList lllllllllllllIlIIIIlIllIIlIIIlIl = ((Element)lllllllllllllIlIIIIlIllIIlIIIIlI).getElementsByTagName(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[19]]);
        int lllllllllllllIlIIIIlIllIIlIlIlII = TileSet.lIIIlIllIlIIll[1];
        while (llIIIIIlllIlIIl(lllllllllllllIlIIIIlIllIIlIlIlII, lllllllllllllIlIIIIlIllIIlIIIlIl.getLength())) {
            final Element lllllllllllllIlIIIIlIllIIlIllIIl = (Element)lllllllllllllIlIIIIlIllIIlIIIlIl.item(lllllllllllllIlIIIIlIllIIlIlIlII);
            int lllllllllllllIlIIIIlIllIIlIllIII = Integer.parseInt(lllllllllllllIlIIIIlIllIIlIllIIl.getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[20]]));
            lllllllllllllIlIIIIlIllIIlIllIII += this.firstGID;
            final Properties lllllllllllllIlIIIIlIllIIlIlIlll = new Properties();
            final Element lllllllllllllIlIIIIlIllIIlIlIllI = (Element)lllllllllllllIlIIIIlIllIIlIllIIl.getElementsByTagName(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[21]]).item(TileSet.lIIIlIllIlIIll[1]);
            final NodeList lllllllllllllIlIIIIlIllIIlIlIlIl = lllllllllllllIlIIIIlIllIIlIlIllI.getElementsByTagName(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[22]]);
            int lllllllllllllIlIIIIlIllIIlIllIlI = TileSet.lIIIlIllIlIIll[1];
            while (llIIIIIlllIlIIl(lllllllllllllIlIIIIlIllIIlIllIlI, lllllllllllllIlIIIIlIllIIlIlIlIl.getLength())) {
                final Element lllllllllllllIlIIIIlIllIIlIlllIl = (Element)lllllllllllllIlIIIIlIllIIlIlIlIl.item(lllllllllllllIlIIIIlIllIIlIllIlI);
                final String lllllllllllllIlIIIIlIllIIlIlllII = lllllllllllllIlIIIIlIllIIlIlllIl.getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[23]]);
                final String lllllllllllllIlIIIIlIllIIlIllIll = lllllllllllllIlIIIIlIllIIlIlllIl.getAttribute(TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[24]]);
                lllllllllllllIlIIIIlIllIIlIlIlll.setProperty(lllllllllllllIlIIIIlIllIIlIlllII, lllllllllllllIlIIIIlIllIIlIllIll);
                "".length();
                ++lllllllllllllIlIIIIlIllIIlIllIlI;
                "".length();
                if (" ".length() == (0x83 ^ 0x96 ^ (0x6D ^ 0x7C))) {
                    throw null;
                }
            }
            this.props.put(new Integer(lllllllllllllIlIIIIlIllIIlIllIII), lllllllllllllIlIIIIlIllIIlIlIlll);
            "".length();
            ++lllllllllllllIlIIIIlIllIIlIlIlII;
            "".length();
            if (-(0x49 ^ 0x4D) >= 0) {
                throw null;
            }
        }
    }
    
    public boolean contains(final int lllllllllllllIlIIIIlIlIllllllllI) {
        int n;
        if (llIIIIIlllIlIll(lllllllllllllIlIIIIlIlIllllllllI, this.firstGID) && llIIIIIlllIllII(lllllllllllllIlIIIIlIlIllllllllI, this.lastGID)) {
            n = TileSet.lIIIlIllIlIIll[2];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x6A ^ 0x5A ^ (0xD8 ^ 0xA4)) & (242 + 207 - 340 + 141 ^ 181 + 31 - 111 + 81 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = TileSet.lIIIlIllIlIIll[1];
        }
        return n != 0;
    }
    
    public int getTileMargin() {
        return this.tileMargin;
    }
    
    private static String llIIIIIllIlllIl(final String lllllllllllllIlIIIIlIlIlllllIlII, final String lllllllllllllIlIIIIlIlIlllllIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIlIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIlIlIlllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIlIlIlllllIllI.init(TileSet.lIIIlIllIlIIll[3], lllllllllllllIlIIIIlIlIlllllIlll);
            return new String(lllllllllllllIlIIIIlIlIlllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIlIlllllIlIl) {
            lllllllllllllIlIIIIlIlIlllllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIIIlllIlIll(final int lllllllllllllIlIIIIlIlIlllIIIlll, final int lllllllllllllIlIIIIlIlIlllIIIllI) {
        return lllllllllllllIlIIIIlIlIlllIIIlll >= lllllllllllllIlIIIIlIlIlllIIIllI;
    }
    
    private static boolean llIIIIIlllIlIIl(final int lllllllllllllIlIIIIlIlIlllIIIIll, final int lllllllllllllIlIIIIlIlIlllIIIIlI) {
        return lllllllllllllIlIIIIlIlIlllIIIIll < lllllllllllllIlIIIIlIlIlllIIIIlI;
    }
    
    public int getTileY(final int lllllllllllllIlIIIIlIllIIIIIlIII) {
        return lllllllllllllIlIIIIlIllIIIIIlIII / this.tilesAcross;
    }
    
    public int getTileSpacing() {
        return this.tileSpacing;
    }
    
    private static void llIIIIIlllIIlII() {
        (lIIIlIllIlIIll = new int[26])[0] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        TileSet.lIIIlIllIlIIll[1] = ((0x7B ^ 0x2B) & ~(0xDC ^ 0x8C));
        TileSet.lIIIlIllIlIIll[2] = " ".length();
        TileSet.lIIIlIllIlIIll[3] = "  ".length();
        TileSet.lIIIlIllIlIIll[4] = "   ".length();
        TileSet.lIIIlIllIlIIll[5] = (0x46 ^ 0x42);
        TileSet.lIIIlIllIlIIll[6] = (0x94 ^ 0x91);
        TileSet.lIIIlIllIlIIll[7] = (0x94 ^ 0x8E ^ (0xA ^ 0x16));
        TileSet.lIIIlIllIlIIll[8] = (0x55 ^ 0x52);
        TileSet.lIIIlIllIlIIll[9] = (0x6A ^ 0x64 ^ (0xD ^ 0xB));
        TileSet.lIIIlIllIlIIll[10] = (0x43 ^ 0x4A);
        TileSet.lIIIlIllIlIIll[11] = (0xBB ^ 0xB1);
        TileSet.lIIIlIllIlIIll[12] = (0x49 ^ 0x62 ^ (0x1 ^ 0x21));
        TileSet.lIIIlIllIlIIll[13] = (0x54 ^ 0x58);
        TileSet.lIIIlIllIlIIll[14] = (0xAA ^ 0xA3 ^ (0x86 ^ 0x82));
        TileSet.lIIIlIllIlIIll[15] = (0x95 ^ 0x9B);
        TileSet.lIIIlIllIlIIll[16] = (0x71 ^ 0xD ^ (0x24 ^ 0x57));
        TileSet.lIIIlIllIlIIll[17] = (0xBF ^ 0xAF);
        TileSet.lIIIlIllIlIIll[18] = (0xAA ^ 0xC5 ^ (0xE ^ 0x70));
        TileSet.lIIIlIllIlIIll[19] = (0xCD ^ 0xBD ^ (0xE ^ 0x6C));
        TileSet.lIIIlIllIlIIll[20] = (0xA8 ^ 0xC0 ^ (0x6F ^ 0x14));
        TileSet.lIIIlIllIlIIll[21] = (0x66 ^ 0x5F ^ (0x24 ^ 0x9));
        TileSet.lIIIlIllIlIIll[22] = (79 + 175 - 76 + 31 ^ 155 + 96 - 243 + 188);
        TileSet.lIIIlIllIlIIll[23] = (88 + 114 - 116 + 77 ^ 169 + 104 - 181 + 89);
        TileSet.lIIIlIllIlIIll[24] = (0x5C ^ 0x4B);
        TileSet.lIIIlIllIlIIll[25] = (0xE8 ^ 0xAA ^ (0xC3 ^ 0x99));
    }
    
    private static boolean llIIIIIlllIIlll(final int lllllllllllllIlIIIIlIlIllIlllIlI) {
        return lllllllllllllIlIIIIlIlIllIlllIlI != 0;
    }
    
    public int getTileX(final int lllllllllllllIlIIIIlIllIIIIlIIII) {
        return lllllllllllllIlIIIIlIllIIIIlIIII % this.tilesAcross;
    }
    
    public void setTileSetImage(final Image lllllllllllllIlIIIIlIllIIIIllIlI) {
        this.tiles = new SpriteSheet(lllllllllllllIlIIIIlIllIIIIllIlI, this.tileWidth, this.tileHeight, this.tileSpacing, this.tileMargin);
        this.tilesAcross = this.tiles.getHorizontalCount();
        this.tilesDown = this.tiles.getVerticalCount();
        if (llIIIIIlllIlIlI(this.tilesAcross)) {
            this.tilesAcross = TileSet.lIIIlIllIlIIll[2];
        }
        if (llIIIIIlllIlIlI(this.tilesDown)) {
            this.tilesDown = TileSet.lIIIlIllIlIIll[2];
        }
        this.lastGID = this.tilesAcross * this.tilesDown + this.firstGID - TileSet.lIIIlIllIlIIll[2];
    }
    
    private static boolean llIIIIIlllIIlIl(final Object lllllllllllllIlIIIIlIlIllIllllII) {
        return lllllllllllllIlIIIIlIlIllIllllII != null;
    }
    
    private static String llIIIIIllIllllI(final String lllllllllllllIlIIIIlIlIllllIIlll, final String lllllllllllllIlIIIIlIlIllllIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIlIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlIllllIIllI.getBytes(StandardCharsets.UTF_8)), TileSet.lIIIlIllIlIIll[9]), "DES");
            final Cipher lllllllllllllIlIIIIlIlIllllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIlIlIllllIlIIl.init(TileSet.lIIIlIllIlIIll[3], lllllllllllllIlIIIIlIlIllllIlIlI);
            return new String(lllllllllllllIlIIIIlIlIllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIlIllllIlIII) {
            lllllllllllllIlIIIIlIlIllllIlIII.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIIllIlllll(String lllllllllllllIlIIIIlIlIlllIlIIlI, final String lllllllllllllIlIIIIlIlIlllIlIIIl) {
        lllllllllllllIlIIIIlIlIlllIlIIlI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIlIlIlllIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIlIlIlllIlIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIlIlIlllIlIlII = lllllllllllllIlIIIIlIlIlllIlIIIl.toCharArray();
        int lllllllllllllIlIIIIlIlIlllIlIIll = TileSet.lIIIlIllIlIIll[1];
        final boolean lllllllllllllIlIIIIlIlIlllIIllIl = (Object)((String)lllllllllllllIlIIIIlIlIlllIlIIlI).toCharArray();
        final String lllllllllllllIlIIIIlIlIlllIIllII = (String)lllllllllllllIlIIIIlIlIlllIIllIl.length;
        Exception lllllllllllllIlIIIIlIlIlllIIlIll = (Exception)TileSet.lIIIlIllIlIIll[1];
        while (llIIIIIlllIlIIl((int)lllllllllllllIlIIIIlIlIlllIIlIll, (int)lllllllllllllIlIIIIlIlIlllIIllII)) {
            final char lllllllllllllIlIIIIlIlIlllIllIII = lllllllllllllIlIIIIlIlIlllIIllIl[lllllllllllllIlIIIIlIlIlllIIlIll];
            lllllllllllllIlIIIIlIlIlllIlIlIl.append((char)(lllllllllllllIlIIIIlIlIlllIllIII ^ lllllllllllllIlIIIIlIlIlllIlIlII[lllllllllllllIlIIIIlIlIlllIlIIll % lllllllllllllIlIIIIlIlIlllIlIlII.length]));
            "".length();
            ++lllllllllllllIlIIIIlIlIlllIlIIll;
            ++lllllllllllllIlIIIIlIlIlllIIlIll;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIlIlIlllIlIlIl);
    }
    
    private static void llIIIIIlllIIIIl() {
        (lIIIlIllIlIIIl = new String[TileSet.lIIIlIllIlIIll[25]])[TileSet.lIIIlIllIlIIll[1]] = llIIIIIllIlllIl("0gmXXSLsGYI=", "byHLn");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[2]] = llIIIIIllIlllIl("btY2ewwu6Xpk+GDmmy2gwg==", "VmEsH");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[3]] = llIIIIIllIllllI("Zx4PZJnNzjw=", "HzNhi");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[4]] = llIIIIIllIlllIl("neh511LyI6U=", "ZRBqP");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[5]] = llIIIIIllIllllI("WZP/5dh40ic=", "ZHYIl");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[6]] = llIIIIIllIlllIl("XaTYVh5nEVu1BFdGBi1+nfuriHd+zskVfQVIuDVwaeIp+kx6xBMz/qwjTbz0skST", "qBJhE");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[7]] = llIIIIIllIlllIl("+22kgvYQAjg=", "HXMNo");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[8]] = llIIIIIllIllllI("nzW+fmNCl7RwX/hLcd9YYw==", "tCBgF");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[9]] = llIIIIIllIlllll("MT4IBA8gPgMJEw==", "EWdag");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[10]] = llIIIIIllIlllIl("/HULVV7Wu8sTOzZ+3MV5Z9FcAW3Kva6G6+hamGi+mmyT+beMmtWYBZ5cKHdQfwJq0sxjMXApAYtcS8p3QVrGO74Joj46ioNAL3OMev75lwrHvk3nIobZQKVMXNZg6+ZSPzuV2G7rbmjWOtLeua/TbKcX2C1t8s1ATebk4nem/YY=", "jxaBY");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[11]] = llIIIIIllIlllIl("dBaP7G7OZoM=", "NAzNE");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[12]] = llIIIIIllIllllI("qkAZU2s8TP8=", "vHHCe");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[13]] = llIIIIIllIllllI("G8ZRFIUe5Zc=", "LyPJR");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[14]] = llIIIIIllIlllll("", "bHpyI");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[15]] = llIIIIIllIllllI("YzUuB94+Gow=", "hgNCJ");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[16]] = llIIIIIllIllllI("rwMCk8YRqqo=", "TZkPg");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[17]] = llIIIIIllIlllIl("d63wRZCA9Ew=", "LpQTk");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[18]] = llIIIIIllIlllIl("ZjVREpNVpBE=", "DMwfK");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[19]] = llIIIIIllIlllIl("/aD4j2vbOVE=", "Warln");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[20]] = llIIIIIllIlllIl("SBB9iUc8SZk=", "iIXYU");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[21]] = llIIIIIllIlllIl("1ni9rjBk2R9m6B/BSpo72w==", "tenjX");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[22]] = llIIIIIllIlllIl("rKfk7Y0cuwBPYtbXtF1IKw==", "KdoNz");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[23]] = llIIIIIllIlllll("LzkkIg==", "AXIGg");
        TileSet.lIIIlIllIlIIIl[TileSet.lIIIlIllIlIIll[24]] = llIIIIIllIllllI("jWsDsQEnK/A=", "udGAd");
    }
    
    public int getTileWidth() {
        return this.tileWidth;
    }
    
    public int getTileHeight() {
        return this.tileHeight;
    }
}
