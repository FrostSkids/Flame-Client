// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.util.ResourceLoader;
import java.io.IOException;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.pathfinding.navmesh.Link;
import org.newdawn.slick.util.pathfinding.navmesh.Space;
import org.newdawn.slick.util.pathfinding.TileBasedMap;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.util.Arrays;
import org.newdawn.slick.Game;
import org.newdawn.slick.util.Bootstrap;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.util.pathfinding.Mover;
import org.newdawn.slick.util.pathfinding.navmesh.NavMesh;
import org.newdawn.slick.util.pathfinding.navmesh.NavMeshBuilder;
import org.newdawn.slick.util.pathfinding.navmesh.NavPath;
import org.newdawn.slick.util.pathfinding.PathFindingContext;
import org.newdawn.slick.BasicGame;

public class NavMeshTest extends BasicGame implements PathFindingContext
{
    private /* synthetic */ boolean showLinks;
    private /* synthetic */ float sx;
    private /* synthetic */ float ex;
    private /* synthetic */ float sy;
    private /* synthetic */ DataMap dataMap;
    private /* synthetic */ NavPath path;
    private static final /* synthetic */ int[] lllIllIIllIIII;
    private /* synthetic */ NavMeshBuilder builder;
    private static final /* synthetic */ String[] lllIllIIlIllll;
    private /* synthetic */ float ey;
    private /* synthetic */ boolean showSpaces;
    private /* synthetic */ NavMesh navMesh;
    
    public Mover getMover() {
        return null;
    }
    
    private static void lIlIIlIIlIIIlIlI() {
        (lllIllIIlIllll = new String[NavMeshTest.lllIllIIllIIII[7]])[NavMeshTest.lllIllIIllIIII[0]] = lIlIIlIIlIIIIlll("mVp+lM+2/cqnGznAmmwulQ==", "hRIDx");
        NavMeshTest.lllIllIIlIllll[NavMeshTest.lllIllIIllIIII[1]] = lIlIIlIIlIIIIlll("f71iszZpihh955kl0ydQDZjmZE/GdElz", "XtlhO");
        NavMeshTest.lllIllIIlIllll[NavMeshTest.lllIllIIllIIII[2]] = lIlIIlIIlIIIlIII("ggv2Ao/OvosMmwokRR2RNMlgmMSs7C4F", "jMYnC");
        NavMeshTest.lllIllIIlIllll[NavMeshTest.lllIllIIllIIII[3]] = lIlIIlIIlIIIlIIl("BzYQPR06P0YjECgnAyNCaQ==", "IWfPx");
    }
    
    private static String lIlIIlIIlIIIIlll(final String llllllllllllIlIllIIlIlllIIIlllIl, final String llllllllllllIlIllIIlIlllIIIlllII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIlllIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIlllIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIlllIIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIlllIIIlllll.init(NavMeshTest.lllIllIIllIIII[2], llllllllllllIlIllIIlIlllIIlIIIII);
            return new String(llllllllllllIlIllIIlIlllIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIlllIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIlllIIIllllI) {
            llllllllllllIlIllIIlIlllIIIllllI.printStackTrace();
            return null;
        }
    }
    
    public int getSearchDistance() {
        return NavMeshTest.lllIllIIllIIII[0];
    }
    
    private static boolean lIlIIlIIlIIIllII(final int llllllllllllIlIllIIlIlllIIIIIIll) {
        return llllllllllllIlIllIIlIlllIIIIIIll != 0;
    }
    
    private static boolean lIlIIlIIlIIIlllI(final int llllllllllllIlIllIIlIlllIIIIlIII, final int llllllllllllIlIllIIlIlllIIIIIlll) {
        return llllllllllllIlIllIIlIlllIIIIlIII < llllllllllllIlIllIIlIlllIIIIIlll;
    }
    
    @Override
    public void mousePressed(final int llllllllllllIlIllIIlIlllIlIIIIlI, final int llllllllllllIlIllIIlIlllIlIIIlll, final int llllllllllllIlIllIIlIlllIlIIIllI) {
        final float llllllllllllIlIllIIlIlllIlIIIlIl = (llllllllllllIlIllIIlIlllIlIIIlll - NavMeshTest.lllIllIIllIIII[4]) / 10.0f;
        final float llllllllllllIlIllIIlIlllIlIIIlII = (llllllllllllIlIllIIlIlllIlIIIllI - NavMeshTest.lllIllIIllIIII[4]) / 10.0f;
        if (lIlIIlIIlIIIllIl(llllllllllllIlIllIIlIlllIlIIIIlI)) {
            this.sx = llllllllllllIlIllIIlIlllIlIIIlIl;
            this.sy = llllllllllllIlIllIIlIlllIlIIIlII;
            "".length();
            if (((0x17 ^ 0x56) & ~(0x2 ^ 0x43)) >= "   ".length()) {
                return;
            }
        }
        else {
            this.ex = llllllllllllIlIllIIlIlllIlIIIlIl;
            this.ey = llllllllllllIlIllIIlIlllIlIIIlII;
        }
        this.path = this.navMesh.findPath(this.sx, this.sy, this.ex, this.ey, (boolean)(NavMeshTest.lllIllIIllIIII[1] != 0));
    }
    
    private static boolean lIlIIlIIlIIIllll(final Object llllllllllllIlIllIIlIlllIIIIIlIl) {
        return llllllllllllIlIllIIlIlllIIIIIlIl != null;
    }
    
    public int getSourceX() {
        return NavMeshTest.lllIllIIllIIII[0];
    }
    
    public int getSourceY() {
        return NavMeshTest.lllIllIIllIIII[0];
    }
    
    public static void main(final String[] llllllllllllIlIllIIlIlllIIllllIl) {
        Bootstrap.runAsApplication(new NavMeshTest(), NavMeshTest.lllIllIIllIIII[6], NavMeshTest.lllIllIIllIIII[6], (boolean)(NavMeshTest.lllIllIIllIIII[0] != 0));
    }
    
    public NavMeshTest() {
        super(NavMeshTest.lllIllIIlIllll[NavMeshTest.lllIllIIllIIII[0]]);
        this.showSpaces = (NavMeshTest.lllIllIIllIIII[1] != 0);
        this.showLinks = (NavMeshTest.lllIllIIllIIII[1] != 0);
    }
    
    private static String lIlIIlIIlIIIlIIl(String llllllllllllIlIllIIlIlllIIlIllIl, final String llllllllllllIlIllIIlIlllIIlIllII) {
        llllllllllllIlIllIIlIlllIIlIllIl = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlIlllIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIlllIIllIIII = new StringBuilder();
        final char[] llllllllllllIlIllIIlIlllIIlIllll = llllllllllllIlIllIIlIlllIIlIllII.toCharArray();
        int llllllllllllIlIllIIlIlllIIlIlllI = NavMeshTest.lllIllIIllIIII[0];
        final float llllllllllllIlIllIIlIlllIIlIlIII = (Object)llllllllllllIlIllIIlIlllIIlIllIl.toCharArray();
        final float llllllllllllIlIllIIlIlllIIlIIlll = llllllllllllIlIllIIlIlllIIlIlIII.length;
        long llllllllllllIlIllIIlIlllIIlIIllI = NavMeshTest.lllIllIIllIIII[0];
        while (lIlIIlIIlIIIlllI((int)llllllllllllIlIllIIlIlllIIlIIllI, (int)llllllllllllIlIllIIlIlllIIlIIlll)) {
            final char llllllllllllIlIllIIlIlllIIllIIll = llllllllllllIlIllIIlIlllIIlIlIII[llllllllllllIlIllIIlIlllIIlIIllI];
            llllllllllllIlIllIIlIlllIIllIIII.append((char)(llllllllllllIlIllIIlIlllIIllIIll ^ llllllllllllIlIllIIlIlllIIlIllll[llllllllllllIlIllIIlIlllIIlIlllI % llllllllllllIlIllIIlIlllIIlIllll.length]));
            "".length();
            ++llllllllllllIlIllIIlIlllIIlIlllI;
            ++llllllllllllIlIllIIlIlllIIlIIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIlllIIllIIII);
    }
    
    private static void lIlIIlIIlIIIlIll() {
        (lllIllIIllIIII = new int[9])[0] = ((0x66 ^ 0x34) & ~(0xD2 ^ 0x80));
        NavMeshTest.lllIllIIllIIII[1] = " ".length();
        NavMeshTest.lllIllIIllIIII[2] = "  ".length();
        NavMeshTest.lllIllIIllIIII[3] = "   ".length();
        NavMeshTest.lllIllIIllIIII[4] = (52 + 95 - 70 + 165 ^ 68 + 170 - 196 + 150);
        NavMeshTest.lllIllIIllIIII[5] = (13 + 0 + 103 + 58 ^ 147 + 57 - 111 + 71);
        NavMeshTest.lllIllIIllIIII[6] = (-(0xFFFFF7C2 & 0x7D3F) & (0xFFFFF7FB & 0x7F5D));
        NavMeshTest.lllIllIIllIIII[7] = (95 + 95 - 115 + 100 ^ 155 + 30 - 165 + 151);
        NavMeshTest.lllIllIIllIIII[8] = (0x45 ^ 0x4D);
    }
    
    private static boolean lIlIIlIIlIIIllIl(final int llllllllllllIlIllIIlIlllIIIIIIIl) {
        return llllllllllllIlIllIIlIlllIIIIIIIl == 0;
    }
    
    private static String lIlIIlIIlIIIlIII(final String llllllllllllIlIllIIlIlllIIIIlllI, final String llllllllllllIlIllIIlIlllIIIIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIlllIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIlllIIIIllIl.getBytes(StandardCharsets.UTF_8)), NavMeshTest.lllIllIIllIIII[8]), "DES");
            final Cipher llllllllllllIlIllIIlIlllIIIlIIlI = Cipher.getInstance("DES");
            llllllllllllIlIllIIlIlllIIIlIIlI.init(NavMeshTest.lllIllIIllIIII[2], llllllllllllIlIllIIlIlllIIIlIIll);
            return new String(llllllllllllIlIllIIlIlllIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIlllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIlllIIIlIIIl) {
            llllllllllllIlIllIIlIlllIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIlIIlIIIlIll();
        lIlIIlIIlIIIlIlI();
    }
    
    public void render(final GameContainer llllllllllllIlIllIIlIlllIlIlllII, final Graphics llllllllllllIlIllIIlIlllIlIllIll) throws SlickException {
        llllllllllllIlIllIIlIlllIlIllIll.translate(50.0f, 50.0f);
        int llllllllllllIlIllIIlIlllIllIIlII = NavMeshTest.lllIllIIllIIII[0];
        while (lIlIIlIIlIIIlllI(llllllllllllIlIllIIlIlllIllIIlII, NavMeshTest.lllIllIIllIIII[4])) {
            int llllllllllllIlIllIIlIlllIllIIlIl = NavMeshTest.lllIllIIllIIII[0];
            while (lIlIIlIIlIIIlllI(llllllllllllIlIllIIlIlllIllIIlIl, NavMeshTest.lllIllIIllIIII[4])) {
                if (lIlIIlIIlIIIllII(this.dataMap.blocked(this, llllllllllllIlIllIIlIlllIllIIlII, llllllllllllIlIllIIlIlllIllIIlIl) ? 1 : 0)) {
                    llllllllllllIlIllIIlIlllIlIllIll.setColor(Color.gray);
                    llllllllllllIlIllIIlIlllIlIllIll.fillRect((float)(llllllllllllIlIllIIlIlllIllIIlII * NavMeshTest.lllIllIIllIIII[5] + NavMeshTest.lllIllIIllIIII[1]), (float)(llllllllllllIlIllIIlIlllIllIIlIl * NavMeshTest.lllIllIIllIIII[5] + NavMeshTest.lllIllIIllIIII[1]), 8.0f, 8.0f);
                }
                ++llllllllllllIlIllIIlIlllIllIIlIl;
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            ++llllllllllllIlIllIIlIlllIllIIlII;
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        if (lIlIIlIIlIIIllII(this.showSpaces ? 1 : 0)) {
            int llllllllllllIlIllIIlIlllIlIlllll = NavMeshTest.lllIllIIllIIII[0];
            while (lIlIIlIIlIIIlllI(llllllllllllIlIllIIlIlllIlIlllll, this.navMesh.getSpaceCount())) {
                final Space llllllllllllIlIllIIlIlllIllIIIII = this.navMesh.getSpace(llllllllllllIlIllIIlIlllIlIlllll);
                if (lIlIIlIIlIIIllII(this.builder.clear(this.dataMap, llllllllllllIlIllIIlIlllIllIIIII) ? 1 : 0)) {
                    llllllllllllIlIllIIlIlllIlIllIll.setColor(new Color(1.0f, 1.0f, 0.0f, 0.5f));
                    llllllllllllIlIllIIlIlllIlIllIll.fillRect(llllllllllllIlIllIIlIlllIllIIIII.getX() * 10.0f, llllllllllllIlIllIIlIlllIllIIIII.getY() * 10.0f, llllllllllllIlIllIIlIlllIllIIIII.getWidth() * 10.0f, llllllllllllIlIllIIlIlllIllIIIII.getHeight() * 10.0f);
                }
                llllllllllllIlIllIIlIlllIlIllIll.setColor(Color.yellow);
                llllllllllllIlIllIIlIlllIlIllIll.drawRect(llllllllllllIlIllIIlIlllIllIIIII.getX() * 10.0f, llllllllllllIlIllIIlIlllIllIIIII.getY() * 10.0f, llllllllllllIlIllIIlIlllIllIIIII.getWidth() * 10.0f, llllllllllllIlIllIIlIlllIllIIIII.getHeight() * 10.0f);
                if (lIlIIlIIlIIIllII(this.showLinks ? 1 : 0)) {
                    final int llllllllllllIlIllIIlIlllIllIIIIl = llllllllllllIlIllIIlIlllIllIIIII.getLinkCount();
                    int llllllllllllIlIllIIlIlllIllIIIlI = NavMeshTest.lllIllIIllIIII[0];
                    while (lIlIIlIIlIIIlllI(llllllllllllIlIllIIlIlllIllIIIlI, llllllllllllIlIllIIlIlllIllIIIIl)) {
                        final Link llllllllllllIlIllIIlIlllIllIIIll = llllllllllllIlIllIIlIlllIllIIIII.getLink(llllllllllllIlIllIIlIlllIllIIIlI);
                        llllllllllllIlIllIIlIlllIlIllIll.setColor(Color.red);
                        llllllllllllIlIllIIlIlllIlIllIll.fillRect(llllllllllllIlIllIIlIlllIllIIIll.getX() * 10.0f - 2.0f, llllllllllllIlIllIIlIlllIllIIIll.getY() * 10.0f - 2.0f, 5.0f, 5.0f);
                        ++llllllllllllIlIllIIlIlllIllIIIlI;
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                    }
                }
                ++llllllllllllIlIllIIlIlllIlIlllll;
                "".length();
                if (((0x4E ^ 0x1F) & ~(0x15 ^ 0x44)) >= " ".length()) {
                    return;
                }
            }
        }
        if (lIlIIlIIlIIIllll(this.path)) {
            llllllllllllIlIllIIlIlllIlIllIll.setColor(Color.white);
            int llllllllllllIlIllIIlIlllIlIllllI = NavMeshTest.lllIllIIllIIII[0];
            while (lIlIIlIIlIIIlllI(llllllllllllIlIllIIlIlllIlIllllI, this.path.length() - NavMeshTest.lllIllIIllIIII[1])) {
                llllllllllllIlIllIIlIlllIlIllIll.drawLine(this.path.getX(llllllllllllIlIllIIlIlllIlIllllI) * 10.0f, this.path.getY(llllllllllllIlIllIIlIlllIlIllllI) * 10.0f, this.path.getX(llllllllllllIlIllIIlIlllIlIllllI + NavMeshTest.lllIllIIllIIII[1]) * 10.0f, this.path.getY(llllllllllllIlIllIIlIlllIlIllllI + NavMeshTest.lllIllIIllIIII[1]) * 10.0f);
                ++llllllllllllIlIllIIlIlllIlIllllI;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIllIIlIlllIlllIlIl) throws SlickException {
        llllllllllllIlIllIIlIlllIlllIlIl.setShowFPS((boolean)(NavMeshTest.lllIllIIllIIII[0] != 0));
        try {
            this.dataMap = new DataMap(NavMeshTest.lllIllIIlIllll[NavMeshTest.lllIllIIllIIII[1]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (IOException llllllllllllIlIllIIlIlllIllllIIl) {
            throw new SlickException(NavMeshTest.lllIllIIlIllll[NavMeshTest.lllIllIIllIIII[2]], llllllllllllIlIllIIlIlllIllllIIl);
        }
        this.builder = new NavMeshBuilder();
        this.navMesh = this.builder.build(this.dataMap);
        System.out.println(String.valueOf(new StringBuilder().append(NavMeshTest.lllIllIIlIllll[NavMeshTest.lllIllIIllIIII[3]]).append(this.navMesh.getSpaceCount())));
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIllIIlIlllIlllIIII, final int llllllllllllIlIllIIlIlllIllIllll) throws SlickException {
        if (lIlIIlIIlIIIllII(llllllllllllIlIllIIlIlllIlllIIII.getInput().isKeyPressed(NavMeshTest.lllIllIIllIIII[2]) ? 1 : 0)) {
            int showLinks;
            if (lIlIIlIIlIIIllIl(this.showLinks ? 1 : 0)) {
                showLinks = NavMeshTest.lllIllIIllIIII[1];
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                showLinks = NavMeshTest.lllIllIIllIIII[0];
            }
            this.showLinks = (showLinks != 0);
        }
        if (lIlIIlIIlIIIllII(llllllllllllIlIllIIlIlllIlllIIII.getInput().isKeyPressed(NavMeshTest.lllIllIIllIIII[3]) ? 1 : 0)) {
            int showSpaces;
            if (lIlIIlIIlIIIllIl(this.showSpaces ? 1 : 0)) {
                showSpaces = NavMeshTest.lllIllIIllIIII[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                showSpaces = NavMeshTest.lllIllIIllIIII[0];
            }
            this.showSpaces = (showSpaces != 0);
        }
    }
    
    private class DataMap implements TileBasedMap
    {
        private /* synthetic */ byte[] map;
        private static final /* synthetic */ int[] lllIlllIlllllI;
        
        public boolean blocked(final PathFindingContext llllllllllllIlIllIIIIIIllIIllllI, final int llllllllllllIlIllIIIIIIllIIllIlI, final int llllllllllllIlIllIIIIIIllIIlllII) {
            if (!lIlIIlIlllIlllll(llllllllllllIlIllIIIIIIllIIllIlI) || !lIlIIlIlllIlllll(llllllllllllIlIllIIIIIIllIIlllII) || !lIlIIlIllllIIIII(llllllllllllIlIllIIIIIIllIIllIlI, DataMap.lllIlllIlllllI[1]) || lIlIIlIllllIIIIl(llllllllllllIlIllIIIIIIllIIlllII, DataMap.lllIlllIlllllI[1])) {
                return DataMap.lllIlllIlllllI[2] != 0;
            }
            int n;
            if (lIlIIlIllllIIIlI(this.map[llllllllllllIlIllIIIIIIllIIllIlI + llllllllllllIlIllIIIIIIllIIlllII * DataMap.lllIlllIlllllI[1]])) {
                n = DataMap.lllIlllIlllllI[3];
                "".length();
                if (((0x9F ^ 0xA4 ^ (0x4B ^ 0x64)) & (0x64 ^ 0x4E ^ (0x7D ^ 0x43) ^ -" ".length())) >= " ".length()) {
                    return ((2 + 155 - 99 + 111 ^ 69 + 100 - 107 + 91) & (0x49 ^ 0x23 ^ (0x1F ^ 0x45) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = DataMap.lllIlllIlllllI[2];
            }
            return n != 0;
        }
        
        private static boolean lIlIIlIllllIIIIl(final int llllllllllllIlIllIIIIIIllIIIllIl, final int llllllllllllIlIllIIIIIIllIIIllII) {
            return llllllllllllIlIllIIIIIIllIIIllIl >= llllllllllllIlIllIIIIIIllIIIllII;
        }
        
        public int getHeightInTiles() {
            return DataMap.lllIlllIlllllI[1];
        }
        
        private static void lIlIIlIlllIllllI() {
            (lllIlllIlllllI = new int[4])[0] = (0xFFFFB9D5 & 0x4FEE);
            DataMap.lllIlllIlllllI[1] = (0x98 ^ 0xAA);
            DataMap.lllIlllIlllllI[2] = ((0xB8 ^ 0xB2) & ~(0x41 ^ 0x4B));
            DataMap.lllIlllIlllllI[3] = " ".length();
        }
        
        private static boolean lIlIIlIlllIlllll(final int llllllllllllIlIllIIIIIIllIIIIlII) {
            return llllllllllllIlIllIIIIIIllIIIIlII >= 0;
        }
        
        public int getWidthInTiles() {
            return DataMap.lllIlllIlllllI[1];
        }
        
        private static boolean lIlIIlIllllIIIlI(final int llllllllllllIlIllIIIIIIllIIIIllI) {
            return llllllllllllIlIllIIIIIIllIIIIllI != 0;
        }
        
        static {
            lIlIIlIlllIllllI();
        }
        
        public void pathFinderVisited(final int llllllllllllIlIllIIIIIIllIIlIIIl, final int llllllllllllIlIllIIIIIIllIIlIIII) {
        }
        
        public DataMap(final String llllllllllllIlIllIIIIIIllIlIIIll) throws IOException {
            this.map = new byte[DataMap.lllIlllIlllllI[0]];
            ResourceLoader.getResourceAsStream(llllllllllllIlIllIIIIIIllIlIIIll).read(this.map);
            "".length();
        }
        
        public float getCost(final PathFindingContext llllllllllllIlIllIIIIIIllIIlIlll, final int llllllllllllIlIllIIIIIIllIIlIllI, final int llllllllllllIlIllIIIIIIllIIlIlIl) {
            return 1.0f;
        }
        
        private static boolean lIlIIlIllllIIIII(final int llllllllllllIlIllIIIIIIllIIIlIIl, final int llllllllllllIlIllIIIIIIllIIIlIII) {
            return llllllllllllIlIllIIIIIIllIIIlIIl < llllllllllllIlIllIIIIIIllIIIlIII;
        }
    }
}
