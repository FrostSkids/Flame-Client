// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class NeatTriangulator implements Triangulator
{
    private /* synthetic */ float[] pointsY;
    private /* synthetic */ int numTriangles;
    private /* synthetic */ Triangle[] triangles;
    private /* synthetic */ float[] pointsX;
    private /* synthetic */ int[] V;
    private /* synthetic */ int numPoints;
    private static final /* synthetic */ String[] lIlIIIIlIllIlI;
    private /* synthetic */ float offset;
    private /* synthetic */ Edge[] edges;
    private static final /* synthetic */ int[] lIlIIIIlIllIll;
    private /* synthetic */ int numEdges;
    
    private static int lllIIIIllIIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllIIIIllIIIIll(final int lllllllllllllIIlIIIIIllIlIllIIII) {
        return lllllllllllllIIlIIIIIllIlIllIIII >= 0;
    }
    
    private void addEdge(final int lllllllllllllIIlIIIIlIIIIllIIlIl, final int lllllllllllllIIlIIIIlIIIIllIIlII, final int lllllllllllllIIlIIIIlIIIIllIIIll) {
        int lllllllllllllIIlIIIIlIIIIllIIIlI = this.findEdge(lllllllllllllIIlIIIIlIIIIllIIlIl, lllllllllllllIIlIIIIlIIIIllIIlII);
        Edge lllllllllllllIIlIIIIlIIIIlIlllll;
        int lllllllllllllIIlIIIIlIIIIllIIIIl;
        if (lllIIIIllIIIIII(lllllllllllllIIlIIIIlIIIIllIIIlI)) {
            if (lllIIIIlIllllll(this.numEdges, this.edges.length)) {
                final Edge[] lllllllllllllIIlIIIIlIIIIllIllII = new Edge[this.edges.length * NeatTriangulator.lIlIIIIlIllIll[3]];
                System.arraycopy(this.edges, NeatTriangulator.lIlIIIIlIllIll[1], lllllllllllllIIlIIIIlIIIIllIllII, NeatTriangulator.lIlIIIIlIllIll[1], this.numEdges);
                this.edges = lllllllllllllIIlIIIIlIIIIllIllII;
            }
            final int lllllllllllllIIlIIIIlIIIIllIlIll = NeatTriangulator.lIlIIIIlIllIll[2];
            final int lllllllllllllIIlIIIIlIIIIllIlIlI = NeatTriangulator.lIlIIIIlIllIll[2];
            final int numEdges = this.numEdges;
            this.numEdges = numEdges + NeatTriangulator.lIlIIIIlIllIll[4];
            lllllllllllllIIlIIIIlIIIIllIIIlI = numEdges;
            final Edge[] edges = this.edges;
            final int n = lllllllllllllIIlIIIIlIIIIllIIIlI;
            final Edge edge = new Edge();
            edges[n] = edge;
            final Edge lllllllllllllIIlIIIIlIIIIllIlIIl = edge;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIIIlIIIIlIlllll = this.edges[lllllllllllllIIlIIIIlIIIIllIIIlI];
            lllllllllllllIIlIIIIlIIIIllIIIIl = lllllllllllllIIlIIIIlIIIIlIlllll.t0;
            final int lllllllllllllIIlIIIIlIIIIllIIIII = lllllllllllllIIlIIIIlIIIIlIlllll.t1;
        }
        int lllllllllllllIIlIIIIlIIIIllIIIII;
        int lllllllllllllIIlIIIIlIIIIlIllllI = 0;
        int lllllllllllllIIlIIIIlIIIIlIlllIl;
        if (lllIIIIlIlllllI(lllllllllllllIIlIIIIlIIIIllIIlIl, lllllllllllllIIlIIIIlIIIIllIIlII)) {
            final int lllllllllllllIIlIIIIlIIIIllIlIII = lllllllllllllIIlIIIIlIIIIllIIlIl;
            final int lllllllllllllIIlIIIIlIIIIllIIlll = lllllllllllllIIlIIIIlIIIIllIIlII;
            lllllllllllllIIlIIIIlIIIIllIIIIl = lllllllllllllIIlIIIIlIIIIllIIIll;
            "".length();
            if (" ".length() == ((89 + 223 - 266 + 179 ^ 74 + 81 - 10 + 41) & (155 + 21 - 9 + 72 ^ 39 + 177 - 89 + 53 ^ -" ".length()))) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIIIlIIIIlIllllI = lllllllllllllIIlIIIIlIIIIllIIlII;
            lllllllllllllIIlIIIIlIIIIlIlllIl = lllllllllllllIIlIIIIlIIIIllIIlIl;
            lllllllllllllIIlIIIIlIIIIllIIIII = lllllllllllllIIlIIIIlIIIIllIIIll;
        }
        lllllllllllllIIlIIIIlIIIIlIlllll.v0 = lllllllllllllIIlIIIIlIIIIlIllllI;
        lllllllllllllIIlIIIIlIIIIlIlllll.v1 = lllllllllllllIIlIIIIlIIIIlIlllIl;
        lllllllllllllIIlIIIIlIIIIlIlllll.t0 = lllllllllllllIIlIIIIlIIIIllIIIIl;
        lllllllllllllIIlIIIIlIIIIlIlllll.t1 = lllllllllllllIIlIIIIlIIIIllIIIII;
        lllllllllllllIIlIIIIlIIIIlIlllll.suspect = (NeatTriangulator.lIlIIIIlIllIll[4] != 0);
    }
    
    private static boolean lllIIIIllIIIllI(final int lllllllllllllIIlIIIIIllIlIlIlIlI) {
        return lllllllllllllIIlIIIIIllIlIlIlIlI > 0;
    }
    
    private void optimize() throws InternalException {
        Edge lllllllllllllIIlIIIIIlllIIlllllI;
        while (!lllIIIIllIIllll(lllllllllllllIIlIIIIIlllIIlllllI = this.chooseSuspect())) {
            final int lllllllllllllIIlIIIIIlllIIllllIl = lllllllllllllIIlIIIIIlllIIlllllI.v0;
            final int lllllllllllllIIlIIIIIlllIIllllII = lllllllllllllIIlIIIIIlllIIlllllI.v1;
            final int lllllllllllllIIlIIIIIlllIIlllIll = lllllllllllllIIlIIIIIlllIIlllllI.t0;
            final int lllllllllllllIIlIIIIIlllIIlllIlI = lllllllllllllIIlIIIIIlllIIlllllI.t1;
            int lllllllllllllIIlIIIIIlllIIlllIIl = NeatTriangulator.lIlIIIIlIllIll[2];
            int lllllllllllllIIlIIIIIlllIIlllIII = NeatTriangulator.lIlIIIIlIllIll[2];
            int lllllllllllllIIlIIIIIlllIlIIIIIl = NeatTriangulator.lIlIIIIlIllIll[1];
            while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIlllIlIIIIIl, NeatTriangulator.lIlIIIIlIllIll[5])) {
                final int lllllllllllllIIlIIIIIlllIlIIIIlI = this.triangles[lllllllllllllIIlIIIIIlllIIlllIll].v[lllllllllllllIIlIIIIIlllIlIIIIIl];
                if (lllIIIIllIIlIIl(lllllllllllllIIlIIIIIlllIIllllIl, lllllllllllllIIlIIIIIlllIlIIIIlI)) {
                    if (lllIIIIlIllllll(lllllllllllllIIlIIIIIlllIIllllII, lllllllllllllIIlIIIIIlllIlIIIIlI)) {
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlIIIIIlllIIlllIII = lllllllllllllIIlIIIIIlllIlIIIIlI;
                        "".length();
                        if ("   ".length() < "   ".length()) {
                            return;
                        }
                        break;
                    }
                }
                ++lllllllllllllIIlIIIIIlllIlIIIIIl;
                "".length();
                if ((0x6A ^ 0x6E) <= " ".length()) {
                    return;
                }
            }
            int lllllllllllllIIlIIIIIlllIIllllll = NeatTriangulator.lIlIIIIlIllIll[1];
            while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIlllIIllllll, NeatTriangulator.lIlIIIIlIllIll[5])) {
                final int lllllllllllllIIlIIIIIlllIlIIIIII = this.triangles[lllllllllllllIIlIIIIIlllIIlllIlI].v[lllllllllllllIIlIIIIIlllIIllllll];
                if (lllIIIIllIIlIIl(lllllllllllllIIlIIIIIlllIIllllIl, lllllllllllllIIlIIIIIlllIlIIIIII)) {
                    if (lllIIIIlIllllll(lllllllllllllIIlIIIIIlllIIllllII, lllllllllllllIIlIIIIIlllIlIIIIII)) {
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlIIIIIlllIIlllIIl = lllllllllllllIIlIIIIIlllIlIIIIII;
                        "".length();
                        if (" ".length() > " ".length()) {
                            return;
                        }
                        break;
                    }
                }
                ++lllllllllllllIIlIIIIIlllIIllllll;
                "".length();
                if (null != null) {
                    return;
                }
            }
            if (!lllIIIIllIIlIIl(NeatTriangulator.lIlIIIIlIllIll[2], lllllllllllllIIlIIIIIlllIIlllIIl) || lllIIIIlIllllll(NeatTriangulator.lIlIIIIlIllIll[2], lllllllllllllIIlIIIIIlllIIlllIII)) {
                throw new InternalException(NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[5]]);
            }
            final float lllllllllllllIIlIIIIIlllIIllIlll = this.pointsX[lllllllllllllIIlIIIIIlllIIllllIl];
            final float lllllllllllllIIlIIIIIlllIIllIllI = this.pointsY[lllllllllllllIIlIIIIIlllIIllllIl];
            final float lllllllllllllIIlIIIIIlllIIllIlIl = this.pointsX[lllllllllllllIIlIIIIIlllIIlllIIl];
            final float lllllllllllllIIlIIIIIlllIIllIlII = this.pointsY[lllllllllllllIIlIIIIIlllIIlllIIl];
            final float lllllllllllllIIlIIIIIlllIIllIIll = this.pointsX[lllllllllllllIIlIIIIIlllIIllllII];
            final float lllllllllllllIIlIIIIIlllIIllIIlI = this.pointsY[lllllllllllllIIlIIIIIlllIIllllII];
            final float lllllllllllllIIlIIIIIlllIIllIIIl = this.pointsX[lllllllllllllIIlIIIIIlllIIlllIII];
            final float lllllllllllllIIlIIIIIlllIIllIIII = this.pointsY[lllllllllllllIIlIIIIIlllIIlllIII];
            float lllllllllllllIIlIIIIIlllIIlIllll = rho(lllllllllllllIIlIIIIIlllIIllIlll, lllllllllllllIIlIIIIIlllIIllIllI, lllllllllllllIIlIIIIIlllIIllIlIl, lllllllllllllIIlIIIIIlllIIllIlII, lllllllllllllIIlIIIIIlllIIllIIll, lllllllllllllIIlIIIIIlllIIllIIlI);
            final float lllllllllllllIIlIIIIIlllIIlIlllI = rho(lllllllllllllIIlIIIIIlllIIllIlll, lllllllllllllIIlIIIIIlllIIllIllI, lllllllllllllIIlIIIIIlllIIllIIll, lllllllllllllIIlIIIIIlllIIllIIlI, lllllllllllllIIlIIIIIlllIIllIIIl, lllllllllllllIIlIIIIIlllIIllIIII);
            float lllllllllllllIIlIIIIIlllIIlIllIl = rho(lllllllllllllIIlIIIIIlllIIllIlIl, lllllllllllllIIlIIIIIlllIIllIlII, lllllllllllllIIlIIIIIlllIIllIIll, lllllllllllllIIlIIIIIlllIIllIIlI, lllllllllllllIIlIIIIIlllIIllIIIl, lllllllllllllIIlIIIIIlllIIllIIII);
            final float lllllllllllllIIlIIIIIlllIIlIllII = rho(lllllllllllllIIlIIIIIlllIIllIlIl, lllllllllllllIIlIIIIIlllIIllIlII, lllllllllllllIIlIIIIIlllIIllIIIl, lllllllllllllIIlIIIIIlllIIllIIII, lllllllllllllIIlIIIIIlllIIllIlll, lllllllllllllIIlIIIIIlllIIllIllI);
            if (!lllIIIIllIlIIII(lllIIIIllIIllIl(0.0f, lllllllllllllIIlIIIIIlllIIlIllll)) || lllIIIIllIIIllI(lllIIIIllIIllIl(0.0f, lllllllllllllIIlIIIIIlllIIlIlllI))) {
                throw new InternalException(NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[6]]);
            }
            if (lllIIIIllIlIIII(lllIIIIllIIlllI(0.0f, lllllllllllllIIlIIIIIlllIIlIllIl)) && lllIIIIllIlIIII(lllIIIIllIIlllI(0.0f, lllllllllllllIIlIIIIIlllIIlIllII))) {
                if (lllIIIIllIIIllI(lllIIIIllIIllIl(lllllllllllllIIlIIIIIlllIIlIllll, lllllllllllllIIlIIIIIlllIIlIlllI))) {
                    lllllllllllllIIlIIIIIlllIIlIllll = lllllllllllllIIlIIIIIlllIIlIlllI;
                }
                if (lllIIIIllIIIllI(lllIIIIllIIllIl(lllllllllllllIIlIIIIIlllIIlIllIl, lllllllllllllIIlIIIIIlllIIlIllII))) {
                    lllllllllllllIIlIIIIIlllIIlIllIl = lllllllllllllIIlIIIIIlllIIlIllII;
                }
                if (lllIIIIllIIIllI(lllIIIIllIIllIl(lllllllllllllIIlIIIIIlllIIlIllll, lllllllllllllIIlIIIIIlllIIlIllIl))) {
                    this.deleteEdge(lllllllllllllIIlIIIIIlllIIllllIl, lllllllllllllIIlIIIIIlllIIllllII);
                    this.triangles[lllllllllllllIIlIIIIIlllIIlllIll].v[NeatTriangulator.lIlIIIIlIllIll[1]] = lllllllllllllIIlIIIIIlllIIlllIIl;
                    this.triangles[lllllllllllllIIlIIIIIlllIIlllIll].v[NeatTriangulator.lIlIIIIlIllIll[4]] = lllllllllllllIIlIIIIIlllIIllllII;
                    this.triangles[lllllllllllllIIlIIIIIlllIIlllIll].v[NeatTriangulator.lIlIIIIlIllIll[3]] = lllllllllllllIIlIIIIIlllIIlllIII;
                    this.triangles[lllllllllllllIIlIIIIIlllIIlllIlI].v[NeatTriangulator.lIlIIIIlIllIll[1]] = lllllllllllllIIlIIIIIlllIIlllIIl;
                    this.triangles[lllllllllllllIIlIIIIIlllIIlllIlI].v[NeatTriangulator.lIlIIIIlIllIll[4]] = lllllllllllllIIlIIIIIlllIIlllIII;
                    this.triangles[lllllllllllllIIlIIIIIlllIIlllIlI].v[NeatTriangulator.lIlIIIIlIllIll[3]] = lllllllllllllIIlIIIIIlllIIllllIl;
                    this.addEdge(lllllllllllllIIlIIIIIlllIIlllIIl, lllllllllllllIIlIIIIIlllIIllllII, lllllllllllllIIlIIIIIlllIIlllIll);
                    this.addEdge(lllllllllllllIIlIIIIIlllIIllllII, lllllllllllllIIlIIIIIlllIIlllIII, lllllllllllllIIlIIIIIlllIIlllIll);
                    this.addEdge(lllllllllllllIIlIIIIIlllIIlllIII, lllllllllllllIIlIIIIIlllIIlllIIl, lllllllllllllIIlIIIIIlllIIlllIll);
                    this.addEdge(lllllllllllllIIlIIIIIlllIIlllIII, lllllllllllllIIlIIIIIlllIIllllIl, lllllllllllllIIlIIIIIlllIIlllIlI);
                    this.addEdge(lllllllllllllIIlIIIIIlllIIllllIl, lllllllllllllIIlIIIIIlllIIlllIIl, lllllllllllllIIlIIIIIlllIIlllIlI);
                    this.addEdge(lllllllllllllIIlIIIIIlllIIlllIIl, lllllllllllllIIlIIIIIlllIIlllIII, lllllllllllllIIlIIIIIlllIIlllIlI);
                    this.markSuspect(lllllllllllllIIlIIIIIlllIIlllIIl, lllllllllllllIIlIIIIIlllIIlllIII, (boolean)(NeatTriangulator.lIlIIIIlIllIll[1] != 0));
                }
            }
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        "".length();
        if ((0xBE ^ 0xBA) != (0x38 ^ 0x3C)) {
            return;
        }
    }
    
    private static boolean lllIIIIllIIllll(final Object lllllllllllllIIlIIIIIllIlIllIllI) {
        return lllllllllllllIIlIIIIIllIlIllIllI == null;
    }
    
    private static boolean lllIIIIllIIIIII(final int lllllllllllllIIlIIIIIllIlIlIlllI) {
        return lllllllllllllIIlIIIIIllIlIlIlllI < 0;
    }
    
    static {
        lllIIIIlIllllIl();
        lllIIIIlIllllII();
    }
    
    private static String lllIIIIlIlllIlI(String lllllllllllllIIlIIIIIllIlllIIIIl, final String lllllllllllllIIlIIIIIllIlllIIlIl) {
        lllllllllllllIIlIIIIIllIlllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIIllIlllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIIllIlllIIlII = new StringBuilder();
        final char[] lllllllllllllIIlIIIIIllIlllIIIll = lllllllllllllIIlIIIIIllIlllIIlIl.toCharArray();
        int lllllllllllllIIlIIIIIllIlllIIIlI = NeatTriangulator.lIlIIIIlIllIll[1];
        final char lllllllllllllIIlIIIIIllIllIlllII = (Object)lllllllllllllIIlIIIIIllIlllIIIIl.toCharArray();
        final double lllllllllllllIIlIIIIIllIllIllIll = lllllllllllllIIlIIIIIllIllIlllII.length;
        String lllllllllllllIIlIIIIIllIllIllIlI = (String)NeatTriangulator.lIlIIIIlIllIll[1];
        while (lllIIIIlIlllllI((int)lllllllllllllIIlIIIIIllIllIllIlI, (int)lllllllllllllIIlIIIIIllIllIllIll)) {
            final char lllllllllllllIIlIIIIIllIlllIIlll = lllllllllllllIIlIIIIIllIllIlllII[lllllllllllllIIlIIIIIllIllIllIlI];
            lllllllllllllIIlIIIIIllIlllIIlII.append((char)(lllllllllllllIIlIIIIIllIlllIIlll ^ lllllllllllllIIlIIIIIllIlllIIIll[lllllllllllllIIlIIIIIllIlllIIIlI % lllllllllllllIIlIIIIIllIlllIIIll.length]));
            "".length();
            ++lllllllllllllIIlIIIIIllIlllIIIlI;
            ++lllllllllllllIIlIIIIIllIllIllIlI;
            "".length();
            if ("   ".length() == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIIllIlllIIlII);
    }
    
    private static boolean lllIIIIllIIlIll(final int lllllllllllllIIlIIIIIllIllIIIlIl, final int lllllllllllllIIlIIIIIllIllIIIlII) {
        return lllllllllllllIIlIIIIIllIllIIIlIl >= lllllllllllllIIlIIIIIllIllIIIlII;
    }
    
    private static boolean lllIIIIlIllllll(final int lllllllllllllIIlIIIIIllIllIIlIIl, final int lllllllllllllIIlIIIIIllIllIIlIII) {
        return lllllllllllllIIlIIIIIllIllIIlIIl == lllllllllllllIIlIIIIIllIllIIlIII;
    }
    
    private static int lllIIIIllIIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllIIIIllIIlIIl(final int lllllllllllllIIlIIIIIllIlIlIIlll, final int lllllllllllllIIlIIIIIllIlIlIIllI) {
        return lllllllllllllIIlIIIIIllIlIlIIlll != lllllllllllllIIlIIIIIllIlIlIIllI;
    }
    
    private static int lllIIIIllIlIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void deleteEdge(final int lllllllllllllIIlIIIIlIIIIlIIlIIl, final int lllllllllllllIIlIIIIlIIIIlIIllII) throws InternalException {
        final int lllllllllllllIIlIIIIlIIIIlIIlIll;
        if (lllIIIIllIIIIIl(NeatTriangulator.lIlIIIIlIllIll[1], lllllllllllllIIlIIIIlIIIIlIIlIll = this.findEdge(lllllllllllllIIlIIIIlIIIIlIIlIIl, lllllllllllllIIlIIIIlIIIIlIIllII))) {
            throw new InternalException(NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[1]]);
        }
        final Edge[] edges = this.edges;
        final int n = lllllllllllllIIlIIIIlIIIIlIIlIll;
        final Edge[] edges2 = this.edges;
        final int numEdges = this.numEdges - NeatTriangulator.lIlIIIIlIllIll[4];
        this.numEdges = numEdges;
        edges[n] = edges2[numEdges];
    }
    
    private static boolean insideTriangle(final float lllllllllllllIIlIIIIIlllllIIIlll, final float lllllllllllllIIlIIIIIlllllIIIllI, final float lllllllllllllIIlIIIIIlllllIIIlIl, final float lllllllllllllIIlIIIIIlllllIIIlII, final float lllllllllllllIIlIIIIIlllllIllIlI, final float lllllllllllllIIlIIIIIlllllIllIIl, final float lllllllllllllIIlIIIIIlllllIIIIIl, final float lllllllllllllIIlIIIIIlllllIIIIII) {
        final float lllllllllllllIIlIIIIIlllllIlIllI = lllllllllllllIIlIIIIIlllllIllIlI - lllllllllllllIIlIIIIIlllllIIIlIl;
        final float lllllllllllllIIlIIIIIlllllIlIlIl = lllllllllllllIIlIIIIIlllllIllIIl - lllllllllllllIIlIIIIIlllllIIIlII;
        final float lllllllllllllIIlIIIIIlllllIlIlII = lllllllllllllIIlIIIIIlllllIIIlll - lllllllllllllIIlIIIIIlllllIllIlI;
        final float lllllllllllllIIlIIIIIlllllIlIIll = lllllllllllllIIlIIIIIlllllIIIllI - lllllllllllllIIlIIIIIlllllIllIIl;
        final float lllllllllllllIIlIIIIIlllllIlIIlI = lllllllllllllIIlIIIIIlllllIIIlIl - lllllllllllllIIlIIIIIlllllIIIlll;
        final float lllllllllllllIIlIIIIIlllllIlIIIl = lllllllllllllIIlIIIIIlllllIIIlII - lllllllllllllIIlIIIIIlllllIIIllI;
        final float lllllllllllllIIlIIIIIlllllIlIIII = lllllllllllllIIlIIIIIlllllIIIIIl - lllllllllllllIIlIIIIIlllllIIIlll;
        final float lllllllllllllIIlIIIIIlllllIIllll = lllllllllllllIIlIIIIIlllllIIIIII - lllllllllllllIIlIIIIIlllllIIIllI;
        final float lllllllllllllIIlIIIIIlllllIIlllI = lllllllllllllIIlIIIIIlllllIIIIIl - lllllllllllllIIlIIIIIlllllIIIlIl;
        final float lllllllllllllIIlIIIIIlllllIIllIl = lllllllllllllIIlIIIIIlllllIIIIII - lllllllllllllIIlIIIIIlllllIIIlII;
        final float lllllllllllllIIlIIIIIlllllIIllII = lllllllllllllIIlIIIIIlllllIIIIIl - lllllllllllllIIlIIIIIlllllIllIlI;
        final float lllllllllllllIIlIIIIIlllllIIlIll = lllllllllllllIIlIIIIIlllllIIIIII - lllllllllllllIIlIIIIIlllllIllIIl;
        final float lllllllllllllIIlIIIIIlllllIIlIlI = lllllllllllllIIlIIIIIlllllIlIllI * lllllllllllllIIlIIIIIlllllIIllIl - lllllllllllllIIlIIIIIlllllIlIlIl * lllllllllllllIIlIIIIIlllllIIlllI;
        final float lllllllllllllIIlIIIIIlllllIIlIIl = lllllllllllllIIlIIIIIlllllIlIIlI * lllllllllllllIIlIIIIIlllllIIllll - lllllllllllllIIlIIIIIlllllIlIIIl * lllllllllllllIIlIIIIIlllllIlIIII;
        final float lllllllllllllIIlIIIIIlllllIIlIII = lllllllllllllIIlIIIIIlllllIlIlII * lllllllllllllIIlIIIIIlllllIIlIll - lllllllllllllIIlIIIIIlllllIlIIll * lllllllllllllIIlIIIIIlllllIIllII;
        int n;
        if (lllIIIIllIIIIll(lllIIIIllIIIlll(lllllllllllllIIlIIIIIlllllIIlIlI, 0.0)) && lllIIIIllIIIIll(lllIIIIllIIIlll(lllllllllllllIIlIIIIIlllllIIlIII, 0.0)) && lllIIIIllIIIIll(lllIIIIllIIIlll(lllllllllllllIIlIIIIIlllllIIlIIl, 0.0))) {
            n = NeatTriangulator.lIlIIIIlIllIll[4];
            "".length();
            if (((0xE4 ^ 0x8B ^ (0xB6 ^ 0x8E)) & (0x6 ^ 0x2B ^ (0x73 ^ 0x9) ^ -" ".length())) > 0) {
                return ((0xBD ^ 0xB2 ^ (0xEC ^ 0xAB)) & (0x32 ^ 0x1B ^ (0x37 ^ 0x56) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = NeatTriangulator.lIlIIIIlIllIll[1];
        }
        return n != 0;
    }
    
    public boolean triangulate() {
        try {
            this.basicTriangulation();
            return NeatTriangulator.lIlIIIIlIllIll[4] != 0;
        }
        catch (InternalException lllllllllllllIIlIIIIIlllIIIlIlII) {
            this.numEdges = NeatTriangulator.lIlIIIIlIllIll[1];
            return NeatTriangulator.lIlIIIIlIllIll[1] != 0;
        }
    }
    
    public NeatTriangulator() {
        this.offset = 1.0E-6f;
        this.pointsX = new float[NeatTriangulator.lIlIIIIlIllIll[0]];
        this.pointsY = new float[NeatTriangulator.lIlIIIIlIllIll[0]];
        this.numPoints = NeatTriangulator.lIlIIIIlIllIll[1];
        this.edges = new Edge[NeatTriangulator.lIlIIIIlIllIll[0]];
        this.numEdges = NeatTriangulator.lIlIIIIlIllIll[1];
        this.triangles = new Triangle[NeatTriangulator.lIlIIIIlIllIll[0]];
        this.numTriangles = NeatTriangulator.lIlIIIIlIllIll[1];
    }
    
    public void startHole() {
    }
    
    private static int lllIIIIllIIlllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public float[] getTrianglePoint(final int lllllllllllllIIlIIIIIllIlllllIlI, final int lllllllllllllIIlIIIIIllIllllIlII) {
        final float lllllllllllllIIlIIIIIllIlllllIII = this.pointsX[this.triangles[lllllllllllllIIlIIIIIllIlllllIlI].v[lllllllllllllIIlIIIIIllIllllIlII]];
        final float lllllllllllllIIlIIIIIllIllllIlll = this.pointsY[this.triangles[lllllllllllllIIlIIIIIllIlllllIlI].v[lllllllllllllIIlIIIIIllIllllIlII]];
        final float[] array = new float[NeatTriangulator.lIlIIIIlIllIll[3]];
        array[NeatTriangulator.lIlIIIIlIllIll[1]] = lllllllllllllIIlIIIIIllIlllllIII;
        array[NeatTriangulator.lIlIIIIlIllIll[4]] = lllllllllllllIIlIIIIIllIllllIlll;
        return array;
    }
    
    public int getTriangleCount() {
        return this.numTriangles;
    }
    
    public void addPolyPoint(final float lllllllllllllIIlIIIIIlllIIIIIllI, float lllllllllllllIIlIIIIIlllIIIIIlIl) {
        int lllllllllllllIIlIIIIIlllIIIIllII = NeatTriangulator.lIlIIIIlIllIll[1];
        while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIlllIIIIllII, this.numPoints)) {
            if (lllIIIIllIlIIlI(lllIIIIllIlIIIl(this.pointsX[lllllllllllllIIlIIIIIlllIIIIllII], lllllllllllllIIlIIIIIlllIIIIIllI)) && lllIIIIllIlIIlI(lllIIIIllIlIIIl(this.pointsY[lllllllllllllIIlIIIIIlllIIIIllII], lllllllllllllIIlIIIIIlllIIIIIlIl))) {
                lllllllllllllIIlIIIIIlllIIIIIlIl += this.offset;
                this.offset += 1.0E-6f;
            }
            ++lllllllllllllIIlIIIIIlllIIIIllII;
            "".length();
            if (-(0x26 ^ 0x23) >= 0) {
                return;
            }
        }
        if (lllIIIIlIllllll(this.numPoints, this.pointsX.length)) {
            float[] lllllllllllllIIlIIIIIlllIIIIlIll = new float[this.numPoints * NeatTriangulator.lIlIIIIlIllIll[3]];
            System.arraycopy(this.pointsX, NeatTriangulator.lIlIIIIlIllIll[1], lllllllllllllIIlIIIIIlllIIIIlIll, NeatTriangulator.lIlIIIIlIllIll[1], this.numPoints);
            this.pointsX = lllllllllllllIIlIIIIIlllIIIIlIll;
            lllllllllllllIIlIIIIIlllIIIIlIll = new float[this.numPoints * NeatTriangulator.lIlIIIIlIllIll[3]];
            System.arraycopy(this.pointsY, NeatTriangulator.lIlIIIIlIllIll[1], lllllllllllllIIlIIIIIlllIIIIlIll, NeatTriangulator.lIlIIIIlIllIll[1], this.numPoints);
            this.pointsY = lllllllllllllIIlIIIIIlllIIIIlIll;
        }
        this.pointsX[this.numPoints] = lllllllllllllIIlIIIIIlllIIIIIllI;
        this.pointsY[this.numPoints] = lllllllllllllIIlIIIIIlllIIIIIlIl;
        this.numPoints += NeatTriangulator.lIlIIIIlIllIll[4];
    }
    
    private static boolean lllIIIIllIIIIIl(final int lllllllllllllIIlIIIIIllIlIlllIIl, final int lllllllllllllIIlIIIIIllIlIlllIII) {
        return lllllllllllllIIlIIIIIllIlIlllIIl > lllllllllllllIIlIIIIIllIlIlllIII;
    }
    
    private static int lllIIIIllIIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lllIIIIlIllllII() {
        (lIlIIIIlIllIlI = new String[NeatTriangulator.lIlIIIIlIllIll[7]])[NeatTriangulator.lIlIIIIlIllIll[1]] = lllIIIIlIlllIlI("OyAEMDkKIFAhO1owFTkxDjFQIDoROh8iOloxFDIx", "zTpUT");
        NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[4]] = lllIIIIlIlllIll("WQK1J1VAGqQBRsHllsfIirM2f1YOiSJWmvraB0vwVic=", "VlGpS");
        NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[3]] = lllIIIIlIlllIll("VXgYlZFX8Y1+uJjblvDCBA==", "RQYMW");
        NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[5]] = lllIIIIlIlllIlI("EgY8byxRATsmPFEWJyk8", "qgRHX");
        NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[6]] = lllIIIIlIlllIll("3f0f5xr5fz55rg0azDzrg+5Sd2l611q4l9SNimjblmY=", "ZwMlZ");
    }
    
    private static String lllIIIIlIlllIll(final String lllllllllllllIIlIIIIIllIllIIllll, final String lllllllllllllIIlIIIIIllIllIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIllIllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIllIllIlIIII.getBytes(StandardCharsets.UTF_8)), NeatTriangulator.lIlIIIIlIllIll[8]), "DES");
            final Cipher lllllllllllllIIlIIIIIllIllIlIIll = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIIllIllIlIIll.init(NeatTriangulator.lIlIIIIlIllIll[3], lllllllllllllIIlIIIIIllIllIlIlII);
            return new String(lllllllllllllIIlIIIIIllIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIllIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIllIllIlIIlI) {
            lllllllllllllIIlIIIIIllIllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIIllIlIIlI(final int lllllllllllllIIlIIIIIllIlIllIIlI) {
        return lllllllllllllIIlIIIIIllIlIllIIlI == 0;
    }
    
    private static boolean lllIIIIlIlllllI(final int lllllllllllllIIlIIIIIllIllIIIIIl, final int lllllllllllllIIlIIIIIllIllIIIIII) {
        return lllllllllllllIIlIIIIIllIllIIIIIl < lllllllllllllIIlIIIIIllIllIIIIII;
    }
    
    private Edge chooseSuspect() {
        int lllllllllllllIIlIIIIlIIIIIllIIll = NeatTriangulator.lIlIIIIlIllIll[1];
        while (lllIIIIlIlllllI(lllllllllllllIIlIIIIlIIIIIllIIll, this.numEdges)) {
            final Edge lllllllllllllIIlIIIIlIIIIIllIlII = this.edges[lllllllllllllIIlIIIIlIIIIIllIIll];
            if (lllIIIIllIIIIlI(lllllllllllllIIlIIIIlIIIIIllIlII.suspect ? 1 : 0)) {
                lllllllllllllIIlIIIIlIIIIIllIlII.suspect = (NeatTriangulator.lIlIIIIlIllIll[1] != 0);
                if (lllIIIIllIIIIll(lllllllllllllIIlIIIIlIIIIIllIlII.t0) && lllIIIIllIIIIll(lllllllllllllIIlIIIIlIIIIIllIlII.t1)) {
                    return lllllllllllllIIlIIIIlIIIIIllIlII;
                }
            }
            ++lllllllllllllIIlIIIIlIIIIIllIIll;
            "".length();
            if (((0x88 ^ 0xC6) & ~(0x54 ^ 0x1A)) != ((0x7F ^ 0x26) & ~(0x1A ^ 0x43))) {
                return null;
            }
        }
        return null;
    }
    
    private static int lllIIIIllIIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void clear() {
        this.numPoints = NeatTriangulator.lIlIIIIlIllIll[1];
        this.numEdges = NeatTriangulator.lIlIIIIlIllIll[1];
        this.numTriangles = NeatTriangulator.lIlIIIIlIllIll[1];
    }
    
    private static boolean lllIIIIllIIllII(final int lllllllllllllIIlIIIIIllIlIllllIl, final int lllllllllllllIIlIIIIIllIlIllllII) {
        return lllllllllllllIIlIIIIIllIlIllllIl <= lllllllllllllIIlIIIIIllIlIllllII;
    }
    
    public void basicTriangulation() throws InternalException {
        int lllllllllllllIIlIIIIIlllIllIIlII = this.numPoints;
        if (lllIIIIlIlllllI(lllllllllllllIIlIIIIIlllIllIIlII, NeatTriangulator.lIlIIIIlIllIll[5])) {
            return;
        }
        this.numEdges = NeatTriangulator.lIlIIIIlIllIll[1];
        this.numTriangles = NeatTriangulator.lIlIIIIlIllIll[1];
        this.V = new int[lllllllllllllIIlIIIIIlllIllIIlII];
        if (lllIIIIllIIIIII(lllIIIIllIIlIlI(0.0, this.area()))) {
            int lllllllllllllIIlIIIIIlllIllIllll = NeatTriangulator.lIlIIIIlIllIll[1];
            while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIlllIllIllll, lllllllllllllIIlIIIIIlllIllIIlII)) {
                this.V[lllllllllllllIIlIIIIIlllIllIllll] = lllllllllllllIIlIIIIIlllIllIllll;
                ++lllllllllllllIIlIIIIIlllIllIllll;
                "".length();
                if (((0xC7 ^ 0x9A) & ~(0x42 ^ 0x1F)) != 0x0) {
                    return;
                }
            }
            "".length();
            if (((0x52 ^ 0x30 ^ (0x5E ^ 0x3A)) & (0x2E ^ 0x42 ^ (0xAA ^ 0xC0) ^ -" ".length())) >= " ".length()) {
                return;
            }
        }
        else {
            int lllllllllllllIIlIIIIIlllIllIlllI = NeatTriangulator.lIlIIIIlIllIll[1];
            while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIlllIllIlllI, lllllllllllllIIlIIIIIlllIllIIlII)) {
                this.V[lllllllllllllIIlIIIIIlllIllIlllI] = this.numPoints - NeatTriangulator.lIlIIIIlIllIll[4] - lllllllllllllIIlIIIIIlllIllIlllI;
                ++lllllllllllllIIlIIIIIlllIllIlllI;
                "".length();
                if (((0x5C ^ 0x14) & ~(0xC6 ^ 0x8E)) != ((0xB ^ 0x4E) & ~(0xDB ^ 0x9E))) {
                    return;
                }
            }
        }
        int lllllllllllllIIlIIIIIlllIllIIIll = NeatTriangulator.lIlIIIIlIllIll[3] * lllllllllllllIIlIIIIIlllIllIIlII;
        int lllllllllllllIIlIIIIIlllIllIIIlI = lllllllllllllIIlIIIIIlllIllIIlII - NeatTriangulator.lIlIIIIlIllIll[4];
        while (lllIIIIllIIIIIl(lllllllllllllIIlIIIIIlllIllIIlII, NeatTriangulator.lIlIIIIlIllIll[3])) {
            if (lllIIIIllIIlIll(NeatTriangulator.lIlIIIIlIllIll[1], lllllllllllllIIlIIIIIlllIllIIIll--)) {
                throw new InternalException(NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[3]]);
            }
            int lllllllllllllIIlIIIIIlllIllIIlll = lllllllllllllIIlIIIIIlllIllIIIlI;
            if (lllIIIIllIIllII(lllllllllllllIIlIIIIIlllIllIIlII, lllllllllllllIIlIIIIIlllIllIIlll)) {
                lllllllllllllIIlIIIIIlllIllIIlll = NeatTriangulator.lIlIIIIlIllIll[1];
            }
            lllllllllllllIIlIIIIIlllIllIIIlI = lllllllllllllIIlIIIIIlllIllIIlll + NeatTriangulator.lIlIIIIlIllIll[4];
            if (lllIIIIllIIllII(lllllllllllllIIlIIIIIlllIllIIlII, lllllllllllllIIlIIIIIlllIllIIIlI)) {
                lllllllllllllIIlIIIIIlllIllIIIlI = NeatTriangulator.lIlIIIIlIllIll[1];
            }
            int lllllllllllllIIlIIIIIlllIllIIllI = lllllllllllllIIlIIIIIlllIllIIIlI + NeatTriangulator.lIlIIIIlIllIll[4];
            if (lllIIIIllIIllII(lllllllllllllIIlIIIIIlllIllIIlII, lllllllllllllIIlIIIIIlllIllIIllI)) {
                lllllllllllllIIlIIIIIlllIllIIllI = NeatTriangulator.lIlIIIIlIllIll[1];
            }
            if (lllIIIIllIIIIlI(this.snip(lllllllllllllIIlIIIIIlllIllIIlll, lllllllllllllIIlIIIIIlllIllIIIlI, lllllllllllllIIlIIIIIlllIllIIllI, lllllllllllllIIlIIIIIlllIllIIlII) ? 1 : 0)) {
                final int lllllllllllllIIlIIIIIlllIllIlIll = this.V[lllllllllllllIIlIIIIIlllIllIIlll];
                final int lllllllllllllIIlIIIIIlllIllIlIlI = this.V[lllllllllllllIIlIIIIIlllIllIIIlI];
                final int lllllllllllllIIlIIIIIlllIllIlIIl = this.V[lllllllllllllIIlIIIIIlllIllIIllI];
                if (lllIIIIlIllllll(this.numTriangles, this.triangles.length)) {
                    final Triangle[] lllllllllllllIIlIIIIIlllIllIllIl = new Triangle[this.triangles.length * NeatTriangulator.lIlIIIIlIllIll[3]];
                    System.arraycopy(this.triangles, NeatTriangulator.lIlIIIIlIllIll[1], lllllllllllllIIlIIIIIlllIllIllIl, NeatTriangulator.lIlIIIIlIllIll[1], this.numTriangles);
                    this.triangles = lllllllllllllIIlIIIIIlllIllIllIl;
                }
                this.triangles[this.numTriangles] = new Triangle(lllllllllllllIIlIIIIIlllIllIlIll, lllllllllllllIIlIIIIIlllIllIlIlI, lllllllllllllIIlIIIIIlllIllIlIIl);
                this.addEdge(lllllllllllllIIlIIIIIlllIllIlIll, lllllllllllllIIlIIIIIlllIllIlIlI, this.numTriangles);
                this.addEdge(lllllllllllllIIlIIIIIlllIllIlIlI, lllllllllllllIIlIIIIIlllIllIlIIl, this.numTriangles);
                this.addEdge(lllllllllllllIIlIIIIIlllIllIlIIl, lllllllllllllIIlIIIIIlllIllIlIll, this.numTriangles);
                this.numTriangles += NeatTriangulator.lIlIIIIlIllIll[4];
                int lllllllllllllIIlIIIIIlllIllIlIII = lllllllllllllIIlIIIIIlllIllIIIlI;
                int lllllllllllllIIlIIIIIlllIllIllII = lllllllllllllIIlIIIIIlllIllIIIlI + NeatTriangulator.lIlIIIIlIllIll[4];
                while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIlllIllIllII, lllllllllllllIIlIIIIIlllIllIIlII)) {
                    this.V[lllllllllllllIIlIIIIIlllIllIlIII] = this.V[lllllllllllllIIlIIIIIlllIllIllII];
                    ++lllllllllllllIIlIIIIIlllIllIlIII;
                    ++lllllllllllllIIlIIIIIlllIllIllII;
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                --lllllllllllllIIlIIIIIlllIllIIlII;
                lllllllllllllIIlIIIIIlllIllIIIll = NeatTriangulator.lIlIIIIlIllIll[3] * lllllllllllllIIlIIIIIlllIllIIlII;
            }
            "".length();
            if ("   ".length() < " ".length()) {
                return;
            }
        }
        this.V = null;
    }
    
    private static int lllIIIIllIIIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllIIIIllIIIIlI(final int lllllllllllllIIlIIIIIllIlIllIlII) {
        return lllllllllllllIIlIIIIIllIlIllIlII != 0;
    }
    
    private int findEdge(final int lllllllllllllIIlIIIIlIIIIllllIll, final int lllllllllllllIIlIIIIlIIIIlllllll) {
        int lllllllllllllIIlIIIIlIIIIllllllI;
        int lllllllllllllIIlIIIIlIIIIlllllIl;
        if (lllIIIIlIlllllI(lllllllllllllIIlIIIIlIIIIllllIll, lllllllllllllIIlIIIIlIIIIlllllll)) {
            final int lllllllllllllIIlIIIIlIIIlIIIIlII = lllllllllllllIIlIIIIlIIIIllllIll;
            final int lllllllllllllIIlIIIIlIIIlIIIIIll = lllllllllllllIIlIIIIlIIIIlllllll;
            "".length();
            if (null != null) {
                return (51 + 174 - 62 + 53 ^ 1 + 87 + 54 + 43) & (7 + 107 - 46 + 178 ^ 98 + 76 - 157 + 134 ^ -" ".length());
            }
        }
        else {
            lllllllllllllIIlIIIIlIIIIllllllI = lllllllllllllIIlIIIIlIIIIlllllll;
            lllllllllllllIIlIIIIlIIIIlllllIl = lllllllllllllIIlIIIIlIIIIllllIll;
        }
        int lllllllllllllIIlIIIIlIIIlIIIIIlI = NeatTriangulator.lIlIIIIlIllIll[1];
        while (lllIIIIlIlllllI(lllllllllllllIIlIIIIlIIIlIIIIIlI, this.numEdges)) {
            if (lllIIIIlIllllll(this.edges[lllllllllllllIIlIIIIlIIIlIIIIIlI].v0, lllllllllllllIIlIIIIlIIIIllllllI) && lllIIIIlIllllll(this.edges[lllllllllllllIIlIIIIlIIIlIIIIIlI].v1, lllllllllllllIIlIIIIlIIIIlllllIl)) {
                return lllllllllllllIIlIIIIlIIIlIIIIIlI;
            }
            ++lllllllllllllIIlIIIIlIIIlIIIIIlI;
            "".length();
            if (" ".length() < ((0x1 ^ 0x48) & ~(0x66 ^ 0x2F))) {
                return (0x75 ^ 0x54) & ~(0x3B ^ 0x1A);
            }
        }
        return NeatTriangulator.lIlIIIIlIllIll[2];
    }
    
    private static int lllIIIIllIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    void markSuspect(final int lllllllllllllIIlIIIIlIIIIIlllIll, final int lllllllllllllIIlIIIIlIIIIIlllIlI, final boolean lllllllllllllIIlIIIIlIIIIIlllIIl) throws InternalException {
        final int lllllllllllllIIlIIIIlIIIIIllllIl;
        if (lllIIIIllIIIIIl(NeatTriangulator.lIlIIIIlIllIll[1], lllllllllllllIIlIIIIlIIIIIllllIl = this.findEdge(lllllllllllllIIlIIIIlIIIIIlllIll, lllllllllllllIIlIIIIlIIIIIlllIlI))) {
            throw new InternalException(NeatTriangulator.lIlIIIIlIllIlI[NeatTriangulator.lIlIIIIlIllIll[4]]);
        }
        this.edges[lllllllllllllIIlIIIIlIIIIIllllIl].suspect = lllllllllllllIIlIIIIlIIIIIlllIIl;
    }
    
    private float area() {
        float lllllllllllllIIlIIIIIllllIIIIIII = 0.0f;
        int lllllllllllllIIlIIIIIlllIlllllll = this.numPoints - NeatTriangulator.lIlIIIIlIllIll[4];
        int lllllllllllllIIlIIIIIllllIIIIIlI = NeatTriangulator.lIlIIIIlIllIll[1];
        while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIllllIIIIIlI, this.numPoints)) {
            lllllllllllllIIlIIIIIllllIIIIIII += this.pointsX[lllllllllllllIIlIIIIIlllIlllllll] * this.pointsY[lllllllllllllIIlIIIIIllllIIIIIlI] - this.pointsY[lllllllllllllIIlIIIIIlllIlllllll] * this.pointsX[lllllllllllllIIlIIIIIllllIIIIIlI];
            lllllllllllllIIlIIIIIlllIlllllll = lllllllllllllIIlIIIIIllllIIIIIlI++;
            "".length();
            if (((0x7D ^ 0x3A) & ~(0x6C ^ 0x2B)) != 0x0) {
                return 0.0f;
            }
        }
        return lllllllllllllIIlIIIIIllllIIIIIII * 0.5f;
    }
    
    private boolean snip(final int lllllllllllllIIlIIIIIllllIIlIIll, final int lllllllllllllIIlIIIIIllllIIlIIlI, final int lllllllllllllIIlIIIIIllllIIlIIIl, final int lllllllllllllIIlIIIIIllllIIllIll) {
        final float lllllllllllllIIlIIIIIllllIIllIlI = this.pointsX[this.V[lllllllllllllIIlIIIIIllllIIlIIll]];
        final float lllllllllllllIIlIIIIIllllIIllIIl = this.pointsY[this.V[lllllllllllllIIlIIIIIllllIIlIIll]];
        final float lllllllllllllIIlIIIIIllllIIllIII = this.pointsX[this.V[lllllllllllllIIlIIIIIllllIIlIIlI]];
        final float lllllllllllllIIlIIIIIllllIIlIlll = this.pointsY[this.V[lllllllllllllIIlIIIIIllllIIlIIlI]];
        final float lllllllllllllIIlIIIIIllllIIlIllI = this.pointsX[this.V[lllllllllllllIIlIIIIIllllIIlIIIl]];
        final float lllllllllllllIIlIIIIIllllIIlIlIl = this.pointsY[this.V[lllllllllllllIIlIIIIIllllIIlIIIl]];
        if (lllIIIIllIIIllI(lllIIIIllIIlIII(1.0E-6f, (lllllllllllllIIlIIIIIllllIIllIII - lllllllllllllIIlIIIIIllllIIllIlI) * (lllllllllllllIIlIIIIIllllIIlIlIl - lllllllllllllIIlIIIIIllllIIllIIl) - (lllllllllllllIIlIIIIIllllIIlIlll - lllllllllllllIIlIIIIIllllIIllIIl) * (lllllllllllllIIlIIIIIllllIIlIllI - lllllllllllllIIlIIIIIllllIIllIlI)))) {
            return NeatTriangulator.lIlIIIIlIllIll[1] != 0;
        }
        int lllllllllllllIIlIIIIIllllIlIIIII = NeatTriangulator.lIlIIIIlIllIll[1];
        while (lllIIIIlIlllllI(lllllllllllllIIlIIIIIllllIlIIIII, lllllllllllllIIlIIIIIllllIIllIll)) {
            if (lllIIIIllIIlIIl(lllllllllllllIIlIIIIIllllIlIIIII, lllllllllllllIIlIIIIIllllIIlIIll) && lllIIIIllIIlIIl(lllllllllllllIIlIIIIIllllIlIIIII, lllllllllllllIIlIIIIIllllIIlIIlI) && lllIIIIllIIlIIl(lllllllllllllIIlIIIIIllllIlIIIII, lllllllllllllIIlIIIIIllllIIlIIIl)) {
                final float lllllllllllllIIlIIIIIllllIlIIIlI = this.pointsX[this.V[lllllllllllllIIlIIIIIllllIlIIIII]];
                final float lllllllllllllIIlIIIIIllllIlIIIIl = this.pointsY[this.V[lllllllllllllIIlIIIIIllllIlIIIII]];
                if (lllIIIIllIIIIlI(insideTriangle(lllllllllllllIIlIIIIIllllIIllIlI, lllllllllllllIIlIIIIIllllIIllIIl, lllllllllllllIIlIIIIIllllIIllIII, lllllllllllllIIlIIIIIllllIIlIlll, lllllllllllllIIlIIIIIllllIIlIllI, lllllllllllllIIlIIIIIllllIIlIlIl, lllllllllllllIIlIIIIIllllIlIIIlI, lllllllllllllIIlIIIIIllllIlIIIIl) ? 1 : 0)) {
                    return NeatTriangulator.lIlIIIIlIllIll[1] != 0;
                }
            }
            ++lllllllllllllIIlIIIIIllllIlIIIII;
            "".length();
            if (-"   ".length() > 0) {
                return ((0x1C ^ 0x72 ^ (0xCE ^ 0x90)) & (0x37 ^ 0x19 ^ (0xA9 ^ 0xB7) ^ -" ".length())) != 0x0;
            }
        }
        return NeatTriangulator.lIlIIIIlIllIll[4] != 0;
    }
    
    private static boolean lllIIIIllIlIIII(final int lllllllllllllIIlIIIIIllIlIlIllII) {
        return lllllllllllllIIlIIIIIllIlIlIllII <= 0;
    }
    
    private static void lllIIIIlIllllIl() {
        (lIlIIIIlIllIll = new int[9])[0] = (129 + 120 - 234 + 183 ^ 101 + 18 - 59 + 102);
        NeatTriangulator.lIlIIIIlIllIll[1] = ((0x76 ^ 0x5F ^ (0x66 ^ 0x46)) & (0x1B ^ 0x7F ^ (0x34 ^ 0x59) ^ -" ".length()));
        NeatTriangulator.lIlIIIIlIllIll[2] = -" ".length();
        NeatTriangulator.lIlIIIIlIllIll[3] = "  ".length();
        NeatTriangulator.lIlIIIIlIllIll[4] = " ".length();
        NeatTriangulator.lIlIIIIlIllIll[5] = "   ".length();
        NeatTriangulator.lIlIIIIlIllIll[6] = (0x10 ^ 0x14);
        NeatTriangulator.lIlIIIIlIllIll[7] = (0x22 ^ 0x67 ^ (0x4A ^ 0xA));
        NeatTriangulator.lIlIIIIlIllIll[8] = (0xBE ^ 0xB6);
    }
    
    private static float rho(final float lllllllllllllIIlIIIIlIIIIIIIlIII, final float lllllllllllllIIlIIIIlIIIIIIlIIlI, final float lllllllllllllIIlIIIIlIIIIIIIIllI, final float lllllllllllllIIlIIIIlIIIIIIlIIII, final float lllllllllllllIIlIIIIlIIIIIIIllll, final float lllllllllllllIIlIIIIlIIIIIIIIIll) {
        final float lllllllllllllIIlIIIIlIIIIIIIllIl = lllllllllllllIIlIIIIlIIIIIIIllll - lllllllllllllIIlIIIIlIIIIIIIIllI;
        final float lllllllllllllIIlIIIIlIIIIIIIllII = lllllllllllllIIlIIIIlIIIIIIIIIll - lllllllllllllIIlIIIIlIIIIIIlIIII;
        final float lllllllllllllIIlIIIIlIIIIIIIlIll = lllllllllllllIIlIIIIlIIIIIIIlIII - lllllllllllllIIlIIIIlIIIIIIIllll;
        final float lllllllllllllIIlIIIIlIIIIIIIlIlI = lllllllllllllIIlIIIIlIIIIIIlIIlI - lllllllllllllIIlIIIIlIIIIIIIIIll;
        float lllllllllllllIIlIIIIlIIIIIIIlIIl = lllllllllllllIIlIIIIlIIIIIIIllIl * lllllllllllllIIlIIIIlIIIIIIIlIlI - lllllllllllllIIlIIIIlIIIIIIIllII * lllllllllllllIIlIIIIlIIIIIIIlIll;
        if (lllIIIIllIIIllI(lllIIIIllIIIlII(lllllllllllllIIlIIIIlIIIIIIIlIIl, 0.0f))) {
            if (lllIIIIllIIIIII(lllIIIIllIIIlIl(lllllllllllllIIlIIIIlIIIIIIIlIIl, 1.0E-6f))) {
                lllllllllllllIIlIIIIlIIIIIIIlIIl = 1.0E-6f;
            }
            final float lllllllllllllIIlIIIIlIIIIIIllIll = lllllllllllllIIlIIIIlIIIIIIIllIl * lllllllllllllIIlIIIIlIIIIIIIllIl;
            final float lllllllllllllIIlIIIIlIIIIIIllIlI = lllllllllllllIIlIIIIlIIIIIIIllII * lllllllllllllIIlIIIIlIIIIIIIllII;
            final float lllllllllllllIIlIIIIlIIIIIIllIIl = lllllllllllllIIlIIIIlIIIIIIIlIll * lllllllllllllIIlIIIIlIIIIIIIlIll;
            final float lllllllllllllIIlIIIIlIIIIIIllIII = lllllllllllllIIlIIIIlIIIIIIIlIlI * lllllllllllllIIlIIIIlIIIIIIIlIlI;
            final float lllllllllllllIIlIIIIlIIIIIIlIlll = lllllllllllllIIlIIIIlIIIIIIIIllI - lllllllllllllIIlIIIIlIIIIIIIlIII;
            final float lllllllllllllIIlIIIIlIIIIIIlIllI = lllllllllllllIIlIIIIlIIIIIIlIIII - lllllllllllllIIlIIIIlIIIIIIlIIlI;
            final float lllllllllllllIIlIIIIlIIIIIIlIlIl = lllllllllllllIIlIIIIlIIIIIIlIlll * lllllllllllllIIlIIIIlIIIIIIlIlll;
            final float lllllllllllllIIlIIIIlIIIIIIlIlII = lllllllllllllIIlIIIIlIIIIIIlIllI * lllllllllllllIIlIIIIlIIIIIIlIllI;
            return (lllllllllllllIIlIIIIlIIIIIIllIll + lllllllllllllIIlIIIIlIIIIIIllIlI) * (lllllllllllllIIlIIIIlIIIIIIllIIl + lllllllllllllIIlIIIIlIIIIIIllIII) * (lllllllllllllIIlIIIIlIIIIIIlIlIl + lllllllllllllIIlIIIIlIIIIIIlIlII) / (lllllllllllllIIlIIIIlIIIIIIIlIIl * lllllllllllllIIlIIIIlIIIIIIIlIIl);
        }
        return -1.0f;
    }
    
    class Edge
    {
        /* synthetic */ int t1;
        /* synthetic */ boolean suspect;
        /* synthetic */ int v0;
        /* synthetic */ int v1;
        /* synthetic */ int t0;
        private static final /* synthetic */ int[] lIlIIlIlllllll;
        
        private static void lllIIlllIIlllII() {
            (lIlIIlIlllllll = new int[1])[0] = -" ".length();
        }
        
        static {
            lllIIlllIIlllII();
        }
        
        Edge() {
            this.v0 = Edge.lIlIIlIlllllll[0];
            this.v1 = Edge.lIlIIlIlllllll[0];
            this.t0 = Edge.lIlIIlIlllllll[0];
            this.t1 = Edge.lIlIIlIlllllll[0];
        }
    }
    
    class InternalException extends Exception
    {
        public InternalException(final String lllllllllllllIlIlIllIlIIlllIllII) {
            super(lllllllllllllIlIlIllIlIIlllIllII);
        }
    }
    
    class Triangle
    {
        /* synthetic */ int[] v;
        private static final /* synthetic */ int[] lllIlllllIIIlI;
        
        private static void lIlIIllIIIlIIIIl() {
            (lllIlllllIIIlI = new int[4])[0] = "   ".length();
            Triangle.lllIlllllIIIlI[1] = ((0x57 ^ 0x72 ^ (0xF3 ^ 0x8B)) & (0xB7 ^ 0x9A ^ (0x28 ^ 0x58) ^ -" ".length()));
            Triangle.lllIlllllIIIlI[2] = " ".length();
            Triangle.lllIlllllIIIlI[3] = "  ".length();
        }
        
        static {
            lIlIIllIIIlIIIIl();
        }
        
        Triangle(final int llllllllllllIlIlIlllllIllIllIIIl, final int llllllllllllIlIlIlllllIllIllIIII, final int llllllllllllIlIlIlllllIllIlIllll) {
            this.v = new int[Triangle.lllIlllllIIIlI[0]];
            this.v[Triangle.lllIlllllIIIlI[1]] = llllllllllllIlIlIlllllIllIllIIIl;
            this.v[Triangle.lllIlllllIIIlI[2]] = llllllllllllIlIlIlllllIllIllIIII;
            this.v[Triangle.lllIlllllIIIlI[3]] = llllllllllllIlIlIlllllIllIlIllll;
        }
    }
}
