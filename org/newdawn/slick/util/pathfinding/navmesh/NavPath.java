// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.navmesh;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

public class NavPath
{
    private /* synthetic */ ArrayList links;
    private static final /* synthetic */ String[] lllIlIIlIIIlII;
    private static final /* synthetic */ int[] lllIlIIlIIIlIl;
    
    public float getX(final int llllllllllllIlIlllIIIIIlIIllIlII) {
        return this.links.get(llllllllllllIlIlllIIIIIlIIllIlII).getX();
    }
    
    public int length() {
        return this.links.size();
    }
    
    public NavPath() {
        this.links = new ArrayList();
    }
    
    private static boolean lIlIIIlIIIIIIlIl(final int llllllllllllIlIlllIIIIIIlllllIll, final int llllllllllllIlIlllIIIIIIlllllIlI) {
        return llllllllllllIlIlllIIIIIIlllllIll < llllllllllllIlIlllIIIIIIlllllIlI;
    }
    
    public void push(final Link llllllllllllIlIlllIIIIIlIIllllll) {
        this.links.add(llllllllllllIlIlllIIIIIlIIllllll);
        "".length();
    }
    
    public void remove(final int llllllllllllIlIlllIIIIIlIIlIIlIl) {
        this.links.remove(llllllllllllIlIlllIIIIIlIIlIIlIl);
        "".length();
    }
    
    private static void lIlIIIlIIIIIIlII() {
        (lllIlIIlIIIlIl = new int[4])[0] = ((0x8F ^ 0xC5) & ~(0x16 ^ 0x5C));
        NavPath.lllIlIIlIIIlIl[1] = " ".length();
        NavPath.lllIlIIlIIIlIl[2] = "  ".length();
        NavPath.lllIlIIlIIIlIl[3] = (0xC ^ 0x7D ^ (0xFC ^ 0x85));
    }
    
    private static String lIlIIIlIIIIIIIlI(final String llllllllllllIlIlllIIIIIlIIIllIll, final String llllllllllllIlIlllIIIIIlIIIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIIIIlIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIIIIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), NavPath.lllIlIIlIIIlIl[3]), "DES");
            final Cipher llllllllllllIlIlllIIIIIlIIIlllIl = Cipher.getInstance("DES");
            llllllllllllIlIlllIIIIIlIIIlllIl.init(NavPath.lllIlIIlIIIlIl[2], llllllllllllIlIlllIIIIIlIIIllllI);
            return new String(llllllllllllIlIlllIIIIIlIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIIIIlIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIIIIlIIIlllII) {
            llllllllllllIlIlllIIIIIlIIIlllII.printStackTrace();
            return null;
        }
    }
    
    public float getY(final int llllllllllllIlIlllIIIIIlIIlIllII) {
        return this.links.get(llllllllllllIlIlllIIIIIlIIlIllII).getY();
    }
    
    static {
        lIlIIIlIIIIIIlII();
        lIlIIIlIIIIIIIll();
    }
    
    private static void lIlIIIlIIIIIIIll() {
        (lllIlIIlIIIlII = new String[NavPath.lllIlIIlIIIlIl[2]])[NavPath.lllIlIIlIIIlIl[0]] = lIlIIIlIIIIIIIIl("CR0KORhyIQ4jFyYlVg==", "RMkMp");
        NavPath.lllIlIIlIIIlII[NavPath.lllIlIIlIIIlIl[1]] = lIlIIIlIIIIIIIlI("EwSjr3pdfzQ=", "CbKCn");
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(NavPath.lllIlIIlIIIlII[NavPath.lllIlIIlIIIlIl[0]]).append(this.length()).append(NavPath.lllIlIIlIIIlII[NavPath.lllIlIIlIIIlIl[1]]));
    }
    
    private static String lIlIIIlIIIIIIIIl(String llllllllllllIlIlllIIIIIlIIIIIllI, final String llllllllllllIlIlllIIIIIlIIIIIlIl) {
        llllllllllllIlIlllIIIIIlIIIIIllI = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIIIIIlIIIIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIIIIlIIIIlIIl = new StringBuilder();
        final char[] llllllllllllIlIlllIIIIIlIIIIlIII = llllllllllllIlIlllIIIIIlIIIIIlIl.toCharArray();
        int llllllllllllIlIlllIIIIIlIIIIIlll = NavPath.lllIlIIlIIIlIl[0];
        final int llllllllllllIlIlllIIIIIlIIIIIIIl = (Object)((String)llllllllllllIlIlllIIIIIlIIIIIllI).toCharArray();
        final String llllllllllllIlIlllIIIIIlIIIIIIII = (String)llllllllllllIlIlllIIIIIlIIIIIIIl.length;
        double llllllllllllIlIlllIIIIIIllllllll = NavPath.lllIlIIlIIIlIl[0];
        while (lIlIIIlIIIIIIlIl((int)llllllllllllIlIlllIIIIIIllllllll, (int)llllllllllllIlIlllIIIIIlIIIIIIII)) {
            final char llllllllllllIlIlllIIIIIlIIIIllII = llllllllllllIlIlllIIIIIlIIIIIIIl[llllllllllllIlIlllIIIIIIllllllll];
            llllllllllllIlIlllIIIIIlIIIIlIIl.append((char)(llllllllllllIlIlllIIIIIlIIIIllII ^ llllllllllllIlIlllIIIIIlIIIIlIII[llllllllllllIlIlllIIIIIlIIIIIlll % llllllllllllIlIlllIIIIIlIIIIlIII.length]));
            "".length();
            ++llllllllllllIlIlllIIIIIlIIIIIlll;
            ++llllllllllllIlIlllIIIIIIllllllll;
            "".length();
            if (-(0x28 ^ 0x2D) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIIIIlIIIIlIIl);
    }
}
