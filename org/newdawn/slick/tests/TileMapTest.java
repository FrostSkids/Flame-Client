// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.tiled.TiledMap;
import org.newdawn.slick.BasicGame;

public class TileMapTest extends BasicGame
{
    private /* synthetic */ TiledMap map;
    private /* synthetic */ int updateCounter;
    private /* synthetic */ String nonExistingMapProperty;
    private static /* synthetic */ int UPDATE_TIME;
    private static final /* synthetic */ String[] llIIllIIlIlllI;
    private /* synthetic */ String nonExistingLayerProperty;
    private /* synthetic */ String mapName;
    private /* synthetic */ String monsterDifficulty;
    private /* synthetic */ int originalTileID;
    private static final /* synthetic */ int[] llIIllIIlIllll;
    
    private static boolean lIIIlllIlIlIlIIl(final int llllllllllllIlllIIIIIlIlIlIIIlll, final int llllllllllllIlllIIIIIlIlIlIIIllI) {
        return llllllllllllIlllIIIIIlIlIlIIIlll != llllllllllllIlllIIIIIlIlIlIIIllI;
    }
    
    private static boolean lIIIlllIlIlIlIlI(final int llllllllllllIlllIIIIIlIlIlIlIIll, final int llllllllllllIlllIIIIIlIlIlIlIIlI) {
        return llllllllllllIlllIIIIIlIlIlIlIIll == llllllllllllIlllIIIIIlIlIlIlIIlI;
    }
    
    private static String lIIIlllIlIlIIlIl(final String llllllllllllIlllIIIIIlIlIlIllIll, final String llllllllllllIlllIIIIIlIlIlIllIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIlIlIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlIlIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIIlIlIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIIlIlIlIlllIl.init(TileMapTest.llIIllIIlIllll[2], llllllllllllIlllIIIIIlIlIlIllllI);
            return new String(llllllllllllIlllIIIIIlIlIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIlIlIlIlllII) {
            llllllllllllIlllIIIIIlIlIlIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlllIIIIIlIllIIIllIl, final char llllllllllllIlllIIIIIlIllIIIlllI) {
        if (lIIIlllIlIlIlIlI(llllllllllllIlllIIIIIlIllIIIllIl, TileMapTest.llIIllIIlIllll[1])) {
            System.exit(TileMapTest.llIIllIIlIllll[0]);
        }
    }
    
    private static void lIIIlllIlIlIIllI() {
        (llIIllIIlIlllI = new String[TileMapTest.llIIllIIlIllll[11]])[TileMapTest.llIIllIIlIllll[0]] = lIIIlllIlIlIIIll("p0qWn4Cc0mwGG3aJoY8w1A==", "yKlmq");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[1]] = lIIIlllIlIlIIlII("EjwxMCgHLSNrOAMqNiktFnc2KTQ=", "fYBDL");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[2]] = lIIIlllIlIlIIlIl("f98TTc0z2n/u7MetVnNeUw==", "kXZqJ");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[3]] = lIIIlllIlIlIIIll("6xTh20Spml0=", "WjWxM");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[4]] = lIIIlllIlIlIIlII("MwIOGgYRAkUZCBZMCxUEAw==", "fleti");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[5]] = lIIIlllIlIlIIIll("db4lSUEDktOn9QfN4fREpQ==", "LbJXU");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[6]] = lIIIlllIlIlIIIll("sP67Cg7yFRGjqe1nMSySJA==", "JfwoJ");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[7]] = lIIIlllIlIlIIlIl("pyAXnq8JRAg=", "CsHzh");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[8]] = lIIIlllIlIlIIlIl("0rjiv+IU67Lhm5/VsxUohgyJVtszOmXg", "OMJQL");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[9]] = lIIIlllIlIlIIlIl("GZrwFV0IsPMGXcFJDikX1A==", "xmFeO");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[10]] = lIIIlllIlIlIIlII("NCQLKBcIJAopUQ0rFigDQTodIgEEOBs0", "aJoMq");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[13]] = lIIIlllIlIlIIlIl("P35MsAjY2BenynoubUt7xA==", "quMCe");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[14]] = lIIIlllIlIlIIIll("jRFbdKrliA4Jrnhpbq0/SkLElBPfWe/v", "csHmG");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[15]] = lIIIlllIlIlIIlIl("ZmO7ohjqa9onUyB8B7bFDBDmy7icKM04sDbsEMpPPaI=", "iglht");
        TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[16]] = lIIIlllIlIlIIlIl("JgSMAXr3KC5/aY5Ven6DjXfz+Gwi2CAZWCQufOsDpYs=", "OPoJj");
    }
    
    private static String lIIIlllIlIlIIIll(final String llllllllllllIlllIIIIIlIlIllllllI, final String llllllllllllIlllIIIIIlIlIlllllll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIlIllIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlIlIlllllll.getBytes(StandardCharsets.UTF_8)), TileMapTest.llIIllIIlIllll[8]), "DES");
            final Cipher llllllllllllIlllIIIIIlIllIIIIIlI = Cipher.getInstance("DES");
            llllllllllllIlllIIIIIlIllIIIIIlI.init(TileMapTest.llIIllIIlIllll[2], llllllllllllIlllIIIIIlIllIIIIIll);
            return new String(llllllllllllIlllIIIIIlIllIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIlIllIIIIIIl) {
            llllllllllllIlllIIIIIlIllIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    public TileMapTest() {
        super(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[0]]);
        this.updateCounter = TileMapTest.llIIllIIlIllll[0];
        this.originalTileID = TileMapTest.llIIllIIlIllll[0];
    }
    
    private static boolean lIIIlllIlIlIlIll(final int llllllllllllIlllIIIIIlIlIlIIllll, final int llllllllllllIlllIIIIIlIlIlIIlllI) {
        return llllllllllllIlllIIIIIlIlIlIIllll < llllllllllllIlllIIIIIlIlIlIIlllI;
    }
    
    private static boolean lIIIlllIlIlIlIII(final int llllllllllllIlllIIIIIlIlIlIIlIll, final int llllllllllllIlllIIIIIlIlIlIIlIlI) {
        return llllllllllllIlllIIIIIlIlIlIIlIll > llllllllllllIlllIIIIIlIlIlIIlIlI;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllIIIIIlIllIIlIllI, final int llllllllllllIlllIIIIIlIllIIlIlIl) {
        this.updateCounter += llllllllllllIlllIIIIIlIllIIlIlIl;
        if (lIIIlllIlIlIlIII(this.updateCounter, TileMapTest.UPDATE_TIME)) {
            this.updateCounter -= TileMapTest.UPDATE_TIME;
            final int llllllllllllIlllIIIIIlIllIIllIII = this.map.getTileId(TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[0]);
            if (lIIIlllIlIlIlIIl(llllllllllllIlllIIIIIlIllIIllIII, this.originalTileID)) {
                this.map.setTileId(TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[0], this.originalTileID);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                this.map.setTileId(TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[0], TileMapTest.llIIllIIlIllll[1]);
            }
        }
    }
    
    public void render(final GameContainer llllllllllllIlllIIIIIlIllIIlllll, final Graphics llllllllllllIlllIIIIIlIllIIlllII) {
        this.map.render(TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[4], TileMapTest.llIIllIIlIllll[4], TileMapTest.llIIllIIlIllll[11], TileMapTest.llIIllIIlIllll[11]);
        llllllllllllIlllIIIIIlIllIIlllII.scale(0.35f, 0.35f);
        this.map.render(TileMapTest.llIIllIIlIllll[12], TileMapTest.llIIllIIlIllll[0]);
        llllllllllllIlllIIIIIlIllIIlllII.resetTransform();
        llllllllllllIlllIIIIIlIllIIlllII.drawString(String.valueOf(new StringBuilder().append(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[13]]).append(this.mapName)), 10.0f, 500.0f);
        llllllllllllIlllIIIIIlIllIIlllII.drawString(String.valueOf(new StringBuilder().append(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[14]]).append(this.monsterDifficulty)), 10.0f, 550.0f);
        llllllllllllIlllIIIIIlIllIIlllII.drawString(String.valueOf(new StringBuilder().append(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[15]]).append(this.nonExistingMapProperty)), 10.0f, 525.0f);
        llllllllllllIlllIIIIIlIllIIlllII.drawString(String.valueOf(new StringBuilder().append(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[16]]).append(this.nonExistingLayerProperty)), 10.0f, 575.0f);
    }
    
    public static void main(final String[] llllllllllllIlllIIIIIlIllIIIlIIl) {
        try {
            final AppGameContainer llllllllllllIlllIIIIIlIllIIIlIll = new AppGameContainer(new TileMapTest());
            llllllllllllIlllIIIIIlIllIIIlIll.setDisplayMode(TileMapTest.llIIllIIlIllll[17], TileMapTest.llIIllIIlIllll[18], (boolean)(TileMapTest.llIIllIIlIllll[0] != 0));
            llllllllllllIlllIIIIIlIllIIIlIll.start();
            "".length();
            if ((77 + 63 - 112 + 120 ^ 129 + 135 - 224 + 105) <= 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllIIIIIlIllIIIlIlI) {
            llllllllllllIlllIIIIIlIllIIIlIlI.printStackTrace();
        }
    }
    
    private static void lIIIlllIlIlIIlll() {
        (llIIllIIlIllll = new int[20])[0] = ((0x16 ^ 0x7 ^ (0x73 ^ 0x4A)) & (100 + 12 - 21 + 60 ^ 138 + 76 - 174 + 151 ^ -" ".length()));
        TileMapTest.llIIllIIlIllll[1] = " ".length();
        TileMapTest.llIIllIIlIllll[2] = "  ".length();
        TileMapTest.llIIllIIlIllll[3] = "   ".length();
        TileMapTest.llIIllIIlIllll[4] = (0xE6 ^ 0x88 ^ (0xCB ^ 0xA1));
        TileMapTest.llIIllIIlIllll[5] = (0xB6 ^ 0xB3);
        TileMapTest.llIIllIIlIllll[6] = (0x66 ^ 0x60);
        TileMapTest.llIIllIIlIllll[7] = (130 + 124 - 205 + 138 ^ 80 + 154 - 131 + 85);
        TileMapTest.llIIllIIlIllll[8] = (0x12 ^ 0x16 ^ (0x97 ^ 0x9B));
        TileMapTest.llIIllIIlIllll[9] = (0x26 ^ 0x2F);
        TileMapTest.llIIllIIlIllll[10] = (0x88 ^ 0xB4 ^ (0x11 ^ 0x27));
        TileMapTest.llIIllIIlIllll[11] = (0x15 ^ 0x7 ^ (0x1F ^ 0x2));
        TileMapTest.llIIllIIlIllll[12] = (0xFFFF95FE & 0x6F79);
        TileMapTest.llIIllIIlIllll[13] = (148 + 143 - 159 + 51 ^ 53 + 93 - 139 + 181);
        TileMapTest.llIIllIIlIllll[14] = (0xAF ^ 0xA3);
        TileMapTest.llIIllIIlIllll[15] = (0x7D ^ 0x70);
        TileMapTest.llIIllIIlIllll[16] = (0x14 ^ 0x1A);
        TileMapTest.llIIllIIlIllll[17] = (0xFFFF9FFD & 0x6322);
        TileMapTest.llIIllIIlIllll[18] = (0xFFFF8EDA & 0x737D);
        TileMapTest.llIIllIIlIllll[19] = (-(0xFFFFBF12 & 0x78EF) & (0xFFFFBBE9 & 0x7FFF));
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllIIIIIlIllIlIIlII) throws SlickException {
        this.map = new TiledMap(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[1]], TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[2]]);
        this.mapName = this.map.getMapProperty(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[3]], TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[4]]);
        this.monsterDifficulty = this.map.getLayerProperty(TileMapTest.llIIllIIlIllll[0], TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[5]], TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[6]]);
        this.nonExistingMapProperty = this.map.getMapProperty(TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[7]], TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[8]]);
        this.nonExistingLayerProperty = this.map.getLayerProperty(TileMapTest.llIIllIIlIllll[1], TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[9]], TileMapTest.llIIllIIlIlllI[TileMapTest.llIIllIIlIllll[10]]);
        this.originalTileID = this.map.getTileId(TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[10], TileMapTest.llIIllIIlIllll[0]);
    }
    
    private static String lIIIlllIlIlIIlII(String llllllllllllIlllIIIIIlIlIllIlIll, final String llllllllllllIlllIIIIIlIlIllIlIlI) {
        llllllllllllIlllIIIIIlIlIllIlIll = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIIIlIlIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIIlIlIllIlllI = new StringBuilder();
        final char[] llllllllllllIlllIIIIIlIlIllIllIl = llllllllllllIlllIIIIIlIlIllIlIlI.toCharArray();
        int llllllllllllIlllIIIIIlIlIllIllII = TileMapTest.llIIllIIlIllll[0];
        final String llllllllllllIlllIIIIIlIlIllIIllI = (Object)((String)llllllllllllIlllIIIIIlIlIllIlIll).toCharArray();
        final float llllllllllllIlllIIIIIlIlIllIIlIl = llllllllllllIlllIIIIIlIlIllIIllI.length;
        Exception llllllllllllIlllIIIIIlIlIllIIlII = (Exception)TileMapTest.llIIllIIlIllll[0];
        while (lIIIlllIlIlIlIll((int)llllllllllllIlllIIIIIlIlIllIIlII, (int)llllllllllllIlllIIIIIlIlIllIIlIl)) {
            final char llllllllllllIlllIIIIIlIlIlllIIIl = llllllllllllIlllIIIIIlIlIllIIllI[llllllllllllIlllIIIIIlIlIllIIlII];
            llllllllllllIlllIIIIIlIlIllIlllI.append((char)(llllllllllllIlllIIIIIlIlIlllIIIl ^ llllllllllllIlllIIIIIlIlIllIllIl[llllllllllllIlllIIIIIlIlIllIllII % llllllllllllIlllIIIIIlIlIllIllIl.length]));
            "".length();
            ++llllllllllllIlllIIIIIlIlIllIllII;
            ++llllllllllllIlllIIIIIlIlIllIIlII;
            "".length();
            if (-(0xE7 ^ 0xC7 ^ (0x0 ^ 0x25)) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIIlIlIllIlllI);
    }
    
    static {
        lIIIlllIlIlIIlll();
        lIIIlllIlIlIIllI();
        TileMapTest.UPDATE_TIME = TileMapTest.llIIllIIlIllll[19];
    }
}
