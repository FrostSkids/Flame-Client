// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.navmesh;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.ArrayList;

public class Space
{
    private /* synthetic */ float x;
    private /* synthetic */ ArrayList linksList;
    private /* synthetic */ float height;
    private /* synthetic */ float width;
    private static final /* synthetic */ int[] lIllIllllllIll;
    private static final /* synthetic */ String[] lIllIllllllIIl;
    private /* synthetic */ float cost;
    private /* synthetic */ float y;
    private /* synthetic */ HashMap links;
    
    private static boolean lIIIIIIIlIllIIll(final int llllllllllllIllllllIIIIIllIlllll) {
        return llllllllllllIllllllIIIIIllIlllll <= 0;
    }
    
    public void link(final Space llllllllllllIllllllIIIIlIlllIlII) {
        if (!lIIIIIIIlIlIllIl(this.inTolerance(this.x, llllllllllllIllllllIIIIlIlllIlII.x + llllllllllllIllllllIIIIlIlllIlII.width) ? 1 : 0) || lIIIIIIIlIlIlllI(this.inTolerance(this.x + this.width, llllllllllllIllllllIIIIlIlllIlII.x) ? 1 : 0)) {
            float llllllllllllIllllllIIIIlIlllllll = this.x;
            if (lIIIIIIIlIlIllIl(lIIIIIIIlIlIllII(this.x + this.width, llllllllllllIllllllIIIIlIlllIlII.x))) {
                llllllllllllIllllllIIIIlIlllllll = this.x + this.width;
            }
            final float llllllllllllIllllllIIIIlIllllllI = Math.max(this.y, llllllllllllIllllllIIIIlIlllIlII.y);
            final float llllllllllllIllllllIIIIlIlllllIl = Math.min(this.y + this.height, llllllllllllIllllllIIIIlIlllIlII.y + llllllllllllIllllllIIIIlIlllIlII.height);
            final float llllllllllllIllllllIIIIlIlllllII = llllllllllllIllllllIIIIlIllllllI + (llllllllllllIllllllIIIIlIlllllIl - llllllllllllIllllllIIIIlIllllllI) / 2.0f;
            final Link llllllllllllIllllllIIIIlIllllIll = new Link(llllllllllllIllllllIIIIlIlllllll, llllllllllllIllllllIIIIlIlllllII, llllllllllllIllllllIIIIlIlllIlII);
            this.links.put(llllllllllllIllllllIIIIlIlllIlII, llllllllllllIllllllIIIIlIllllIll);
            "".length();
            this.linksList.add(llllllllllllIllllllIIIIlIllllIll);
            "".length();
        }
        if (!lIIIIIIIlIlIllIl(this.inTolerance(this.y, llllllllllllIllllllIIIIlIlllIlII.y + llllllllllllIllllllIIIIlIlllIlII.height) ? 1 : 0) || lIIIIIIIlIlIlllI(this.inTolerance(this.y + this.height, llllllllllllIllllllIIIIlIlllIlII.y) ? 1 : 0)) {
            float llllllllllllIllllllIIIIlIllllIlI = this.y;
            if (lIIIIIIIlIlIllIl(lIIIIIIIlIlIllII(this.y + this.height, llllllllllllIllllllIIIIlIlllIlII.y))) {
                llllllllllllIllllllIIIIlIllllIlI = this.y + this.height;
            }
            final float llllllllllllIllllllIIIIlIllllIIl = Math.max(this.x, llllllllllllIllllllIIIIlIlllIlII.x);
            final float llllllllllllIllllllIIIIlIllllIII = Math.min(this.x + this.width, llllllllllllIllllllIIIIlIlllIlII.x + llllllllllllIllllllIIIIlIlllIlII.width);
            final float llllllllllllIllllllIIIIlIlllIlll = llllllllllllIllllllIIIIlIllllIIl + (llllllllllllIllllllIIIIlIllllIII - llllllllllllIllllllIIIIlIllllIIl) / 2.0f;
            final Link llllllllllllIllllllIIIIlIlllIllI = new Link(llllllllllllIllllllIIIIlIlllIlll, llllllllllllIllllllIIIIlIllllIlI, llllllllllllIllllllIIIIlIlllIlII);
            this.links.put(llllllllllllIllllllIIIIlIlllIlII, llllllllllllIllllllIIIIlIlllIllI);
            "".length();
            this.linksList.add(llllllllllllIllllllIIIIlIlllIllI);
            "".length();
        }
    }
    
    public float getHeight() {
        return this.height;
    }
    
    public void fill(final Space llllllllllllIllllllIIIIlIIlIIlll, final float llllllllllllIllllllIIIIlIIlIIIIl, final float llllllllllllIllllllIIIIlIIlIIlIl, final float llllllllllllIllllllIIIIlIIIlllll) {
        if (lIIIIIIIlIllIIlI(lIIIIIIIlIlllIIl(llllllllllllIllllllIIIIlIIIlllll, this.cost))) {
            return;
        }
        this.cost = llllllllllllIllllllIIIIlIIIlllll;
        if (lIIIIIIIlIlllIlI(llllllllllllIllllllIIIIlIIlIIlll, this)) {
            return;
        }
        int llllllllllllIllllllIIIIlIIlIlIIl = Space.lIllIllllllIll[1];
        while (lIIIIIIIlIlllIll(llllllllllllIllllllIIIIlIIlIlIIl, this.getLinkCount())) {
            final Link llllllllllllIllllllIIIIlIIlIllII = this.getLink(llllllllllllIllllllIIIIlIIlIlIIl);
            final float llllllllllllIllllllIIIIlIIlIlIll = llllllllllllIllllllIIIIlIIlIllII.distance2(llllllllllllIllllllIIIIlIIlIIIIl, llllllllllllIllllllIIIIlIIlIIlIl);
            final float llllllllllllIllllllIIIIlIIlIlIlI = llllllllllllIllllllIIIIlIIIlllll + llllllllllllIllllllIIIIlIIlIlIll;
            llllllllllllIllllllIIIIlIIlIllII.getTarget().fill(llllllllllllIllllllIIIIlIIlIIlll, llllllllllllIllllllIIIIlIIlIllII.getX(), llllllllllllIllllllIIIIlIIlIllII.getY(), llllllllllllIllllllIIIIlIIlIlIlI);
            ++llllllllllllIllllllIIIIlIIlIlIIl;
            "".length();
            if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                return;
            }
        }
    }
    
    public float getCost() {
        return this.cost;
    }
    
    private static int lIIIIIIIlIllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIIIIIIlIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void clearCost() {
        this.cost = Float.MAX_VALUE;
    }
    
    public int getLinkCount() {
        return this.linksList.size();
    }
    
    public boolean pickLowestCost(final Space llllllllllllIllllllIIIIlIIIIlIll, final NavPath llllllllllllIllllllIIIIlIIIIlIlI) {
        if (lIIIIIIIlIlllIlI(llllllllllllIllllllIIIIlIIIIlIll, this)) {
            return Space.lIllIllllllIll[0] != 0;
        }
        if (lIIIIIIIlIlIllIl(this.links.size())) {
            return Space.lIllIllllllIll[1] != 0;
        }
        Link llllllllllllIllllllIIIIlIIIIlIIl = null;
        int llllllllllllIllllllIIIIlIIIIllIl = Space.lIllIllllllIll[1];
        while (lIIIIIIIlIlllIll(llllllllllllIllllllIIIIlIIIIllIl, this.getLinkCount())) {
            final Link llllllllllllIllllllIIIIlIIIIlllI = this.getLink(llllllllllllIllllllIIIIlIIIIllIl);
            if (!lIIIIIIIlIllllIl(llllllllllllIllllllIIIIlIIIIlIIl) || lIIIIIIIlIlllIII(lIIIIIIIlIllllII(llllllllllllIllllllIIIIlIIIIlllI.getTarget().getCost(), llllllllllllIllllllIIIIlIIIIlIIl.getTarget().getCost()))) {
                llllllllllllIllllllIIIIlIIIIlIIl = llllllllllllIllllllIIIIlIIIIlllI;
            }
            ++llllllllllllIllllllIIIIlIIIIllIl;
            "".length();
            if (((0x74 ^ 0x65) & ~(0xE ^ 0x1F)) < 0) {
                return ((0x59 ^ 0x43) & ~(0x46 ^ 0x5C)) != 0x0;
            }
        }
        llllllllllllIllllllIIIIlIIIIlIlI.push(llllllllllllIllllllIIIIlIIIIlIIl);
        return llllllllllllIllllllIIIIlIIIIlIIl.getTarget().pickLowestCost(llllllllllllIllllllIIIIlIIIIlIll, llllllllllllIllllllIIIIlIIIIlIlI);
    }
    
    private static int lIIIIIIIlIllIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIIIIIIlIlIllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIIIIIIlIllllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIIIIIlIlllIll(final int llllllllllllIllllllIIIIIllllIIII, final int llllllllllllIllllllIIIIIlllIllll) {
        return llllllllllllIllllllIIIIIllllIIII < llllllllllllIllllllIIIIIlllIllll;
    }
    
    public boolean contains(final float llllllllllllIllllllIIIIlIIllIlll, final float llllllllllllIllllllIIIIlIIllIllI) {
        int n;
        if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIllI(llllllllllllIllllllIIIIlIIllIlll, this.x)) && lIIIIIIIlIlllIII(lIIIIIIIlIllIlll(llllllllllllIllllllIIIIlIIllIlll, this.x + this.width)) && lIIIIIIIlIllIIlI(lIIIIIIIlIllIllI(llllllllllllIllllllIIIIlIIllIllI, this.y)) && lIIIIIIIlIlllIII(lIIIIIIIlIllIlll(llllllllllllIllllllIIIIlIIllIllI, this.y + this.height))) {
            n = Space.lIllIllllllIll[0];
            "".length();
            if (" ".length() < ((0xA4 ^ 0x82) & ~(0x93 ^ 0xB5))) {
                return ((0x58 ^ 0x1E) & ~(0xE3 ^ 0xA5)) != 0x0;
            }
        }
        else {
            n = Space.lIllIllllllIll[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIIIIIlIlllIII(final int llllllllllllIllllllIIIIIlllIIIIl) {
        return llllllllllllIllllllIIIIIlllIIIIl < 0;
    }
    
    private static boolean lIIIIIIIlIlllIlI(final Object llllllllllllIllllllIIIIIlllIllII, final Object llllllllllllIllllllIIIIIlllIlIll) {
        return llllllllllllIllllllIIIIIlllIllII == llllllllllllIllllllIIIIIlllIlIll;
    }
    
    private static int lIIIIIIIlIllIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIIIIIIIlIlIlIlI() {
        (lIllIllllllIIl = new String[Space.lIllIllllllIll[5]])[Space.lIllIllllllIll[1]] = lIIIIIIIlIlIIlIl("UA5tKlhd/Q4=", "RzWvI");
        Space.lIllIllllllIIl[Space.lIllIllllllIll[0]] = lIIIIIIIlIlIIlIl("opu4LCWRPzE=", "HZgIy");
        Space.lIllIllllllIIl[Space.lIllIllllllIll[2]] = lIIIIIIIlIlIIlIl("DdMo38CcmOg=", "DsLyY");
        Space.lIllIllllllIIl[Space.lIllIllllllIll[3]] = lIIIIIIIlIlIIlIl("Gq7G3q44HN8=", "vNgti");
        Space.lIllIllllllIIl[Space.lIllIllllllIll[4]] = lIIIIIIIlIlIIlIl("AfefBMq1xqc=", "ROdzN");
    }
    
    private boolean inTolerance(final float llllllllllllIllllllIIIIlIllIIlll, final float llllllllllllIllllllIIIIlIllIlIII) {
        int n;
        if (lIIIIIIIlIlIllIl(lIIIIIIIlIlIllll(llllllllllllIllllllIIIIlIllIIlll, llllllllllllIllllllIIIIlIllIlIII))) {
            n = Space.lIllIllllllIll[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0x67 ^ 0x38 ^ (0x1C ^ 0x20)) & (69 + 197 - 231 + 187 ^ 159 + 53 - 66 + 43 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Space.lIllIllllllIll[1];
        }
        return n != 0;
    }
    
    public Space(final float llllllllllllIllllllIIIIllIIllIll, final float llllllllllllIllllllIIIIllIIlIlIl, final float llllllllllllIllllllIIIIllIIllIIl, final float llllllllllllIllllllIIIIllIIllIII) {
        this.links = new HashMap();
        this.linksList = new ArrayList();
        this.x = llllllllllllIllllllIIIIllIIllIll;
        this.y = llllllllllllIllllllIIIIllIIlIlIl;
        this.width = llllllllllllIllllllIIIIllIIllIIl;
        this.height = llllllllllllIllllllIIIIllIIllIII;
    }
    
    public float getWidth() {
        return this.width;
    }
    
    private static boolean lIIIIIIIlIllIIlI(final int llllllllllllIllllllIIIIIlllIIIll) {
        return llllllllllllIllllllIIIIIlllIIIll >= 0;
    }
    
    private static String lIIIIIIIlIlIIlIl(final String llllllllllllIllllllIIIIIllllIllI, final String llllllllllllIllllllIIIIIllllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIIIlllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIIIllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIIIIlllllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIIIIlllllIlI.init(Space.lIllIllllllIll[2], llllllllllllIllllllIIIIIlllllIll);
            return new String(llllllllllllIllllllIIIIIlllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIIIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIIIlllllIIl) {
            llllllllllllIllllllIIIIIlllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIIIlIlIlIll() {
        (lIllIllllllIll = new int[6])[0] = " ".length();
        Space.lIllIllllllIll[1] = ((0xD6 ^ 0x89) & ~(0x17 ^ 0x48));
        Space.lIllIllllllIll[2] = "  ".length();
        Space.lIllIllllllIll[3] = "   ".length();
        Space.lIllIllllllIll[4] = (0x40 ^ 0x44);
        Space.lIllIllllllIll[5] = (0x5E ^ 0x1B ^ (0x76 ^ 0x36));
    }
    
    private static int lIIIIIIIlIllIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(Space.lIllIllllllIIl[Space.lIllIllllllIll[1]]).append(this.x).append(Space.lIllIllllllIIl[Space.lIllIllllllIll[0]]).append(this.y).append(Space.lIllIllllllIIl[Space.lIllIllllllIll[2]]).append(this.width).append(Space.lIllIllllllIIl[Space.lIllIllllllIll[3]]).append(this.height).append(Space.lIllIllllllIIl[Space.lIllIllllllIll[4]]));
    }
    
    public boolean hasJoinedEdge(final Space llllllllllllIllllllIIIIlIllIIIII) {
        if (!lIIIIIIIlIlIllIl(this.inTolerance(this.x, llllllllllllIllllllIIIIlIllIIIII.x + llllllllllllIllllllIIIIlIllIIIII.width) ? 1 : 0) || lIIIIIIIlIlIlllI(this.inTolerance(this.x + this.width, llllllllllllIllllllIIIIlIllIIIII.x) ? 1 : 0)) {
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(this.y, llllllllllllIllllllIIIIlIllIIIII.y)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(this.y, llllllllllllIllllllIIIIlIllIIIII.y + llllllllllllIllllllIIIIlIllIIIII.height))) {
                return Space.lIllIllllllIll[0] != 0;
            }
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(this.y + this.height, llllllllllllIllllllIIIIlIllIIIII.y)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(this.y + this.height, llllllllllllIllllllIIIIlIllIIIII.y + llllllllllllIllllllIIIIlIllIIIII.height))) {
                return Space.lIllIllllllIll[0] != 0;
            }
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(llllllllllllIllllllIIIIlIllIIIII.y, this.y)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(llllllllllllIllllllIIIIlIllIIIII.y, this.y + this.height))) {
                return Space.lIllIllllllIll[0] != 0;
            }
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(llllllllllllIllllllIIIIlIllIIIII.y + llllllllllllIllllllIIIIlIllIIIII.height, this.y)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(llllllllllllIllllllIIIIlIllIIIII.y + llllllllllllIllllllIIIIlIllIIIII.height, this.y + this.height))) {
                return Space.lIllIllllllIll[0] != 0;
            }
        }
        if (!lIIIIIIIlIlIllIl(this.inTolerance(this.y, llllllllllllIllllllIIIIlIllIIIII.y + llllllllllllIllllllIIIIlIllIIIII.height) ? 1 : 0) || lIIIIIIIlIlIlllI(this.inTolerance(this.y + this.height, llllllllllllIllllllIIIIlIllIIIII.y) ? 1 : 0)) {
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(this.x, llllllllllllIllllllIIIIlIllIIIII.x)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(this.x, llllllllllllIllllllIIIIlIllIIIII.x + llllllllllllIllllllIIIIlIllIIIII.width))) {
                return Space.lIllIllllllIll[0] != 0;
            }
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(this.x + this.width, llllllllllllIllllllIIIIlIllIIIII.x)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(this.x + this.width, llllllllllllIllllllIIIIlIllIIIII.x + llllllllllllIllllllIIIIlIllIIIII.width))) {
                return Space.lIllIllllllIll[0] != 0;
            }
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(llllllllllllIllllllIIIIlIllIIIII.x, this.x)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(llllllllllllIllllllIIIIlIllIIIII.x, this.x + this.width))) {
                return Space.lIllIllllllIll[0] != 0;
            }
            if (lIIIIIIIlIllIIlI(lIIIIIIIlIllIIII(llllllllllllIllllllIIIIlIllIIIII.x + llllllllllllIllllllIIIIlIllIIIII.width, this.x)) && lIIIIIIIlIllIIll(lIIIIIIIlIllIIIl(llllllllllllIllllllIIIIlIllIIIII.x + llllllllllllIllllllIIIIlIllIIIII.width, this.x + this.width))) {
                return Space.lIllIllllllIll[0] != 0;
            }
        }
        return Space.lIllIllllllIll[1] != 0;
    }
    
    static {
        lIIIIIIIlIlIlIll();
        lIIIIIIIlIlIlIlI();
    }
    
    private static int lIIIIIIIlIlIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIIIIIlIlIllIl(final int llllllllllllIllllllIIIIIlllIIlIl) {
        return llllllllllllIllllllIIIIIlllIIlIl == 0;
    }
    
    private static boolean lIIIIIIIlIllllIl(final Object llllllllllllIllllllIIIIIlllIlIIl) {
        return llllllllllllIllllllIIIIIlllIlIIl != null;
    }
    
    private static int lIIIIIIIlIllIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public float getX() {
        return this.x;
    }
    
    private static boolean lIIIIIIIlIlIlllI(final int llllllllllllIllllllIIIIIlllIIlll) {
        return llllllllllllIllllllIIIIIlllIIlll != 0;
    }
    
    public Link getLink(final int llllllllllllIllllllIIIIlIIllllll) {
        return this.linksList.get(llllllllllllIllllllIIIIlIIllllll);
    }
    
    public float getY() {
        return this.y;
    }
    
    private static int lIIIIIIIlIllIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean canMerge(final Space llllllllllllIllllllIIIIlIlIIlIII) {
        if (lIIIIIIIlIlIllIl(this.hasJoinedEdge(llllllllllllIllllllIIIIlIlIIlIII) ? 1 : 0)) {
            return Space.lIllIllllllIll[1] != 0;
        }
        if (lIIIIIIIlIlIllIl(lIIIIIIIlIllIlIl(this.x, llllllllllllIllllllIIIIlIlIIlIII.x)) && lIIIIIIIlIlIllIl(lIIIIIIIlIllIlIl(this.width, llllllllllllIllllllIIIIlIlIIlIII.width))) {
            return Space.lIllIllllllIll[0] != 0;
        }
        if (lIIIIIIIlIlIllIl(lIIIIIIIlIllIlIl(this.y, llllllllllllIllllllIIIIlIlIIlIII.y)) && lIIIIIIIlIlIllIl(lIIIIIIIlIllIlIl(this.height, llllllllllllIllllllIIIIlIlIIlIII.height))) {
            return Space.lIllIllllllIll[0] != 0;
        }
        return Space.lIllIllllllIll[1] != 0;
    }
    
    public Space merge(final Space llllllllllllIllllllIIIIlIlIlIIlI) {
        final float llllllllllllIllllllIIIIlIlIlIlll = Math.min(this.x, llllllllllllIllllllIIIIlIlIlIIlI.x);
        final float llllllllllllIllllllIIIIlIlIlIllI = Math.min(this.y, llllllllllllIllllllIIIIlIlIlIIlI.y);
        float llllllllllllIllllllIIIIlIlIlIlIl = this.width + llllllllllllIllllllIIIIlIlIlIIlI.width;
        float llllllllllllIllllllIIIIlIlIlIlII = this.height + llllllllllllIllllllIIIIlIlIlIIlI.height;
        if (lIIIIIIIlIlIllIl(lIIIIIIIlIllIlII(this.x, llllllllllllIllllllIIIIlIlIlIIlI.x))) {
            llllllllllllIllllllIIIIlIlIlIlIl = this.width;
            "".length();
            if ("  ".length() < ((0xBA ^ 0xAB) & ~(0x6B ^ 0x7A))) {
                return null;
            }
        }
        else {
            llllllllllllIllllllIIIIlIlIlIlII = this.height;
        }
        return new Space(llllllllllllIllllllIIIIlIlIlIlll, llllllllllllIllllllIIIIlIlIlIllI, llllllllllllIllllllIIIIlIlIlIlIl, llllllllllllIllllllIIIIlIlIlIlII);
    }
}
