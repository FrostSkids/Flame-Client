// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.newdawn.slick.util.Log;
import javax.jnlp.ServiceManager;
import org.newdawn.slick.muffin.FileMuffin;
import org.newdawn.slick.muffin.WebstartMuffin;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import org.newdawn.slick.muffin.Muffin;
import java.util.HashMap;

public class SavedState
{
    private static final /* synthetic */ String[] lllIIlIIIIIllI;
    private /* synthetic */ String fileName;
    private /* synthetic */ HashMap stringData;
    private static final /* synthetic */ int[] lllIIlIIIIIlll;
    private /* synthetic */ Muffin muffin;
    private /* synthetic */ HashMap numericData;
    
    public void save() throws IOException {
        this.muffin.saveFile(this.numericData, String.valueOf(new StringBuilder().append(this.fileName).append(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[1]])));
        this.muffin.saveFile(this.stringData, String.valueOf(new StringBuilder().append(this.fileName).append(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[2]])));
    }
    
    private static void lIIllllIlIIlllll() {
        (lllIIlIIIIIllI = new String[SavedState.lllIIlIIIIIlll[9]])[SavedState.lllIIlIIIIIlll[0]] = lIIllllIlIIlllII("AlbBsxqgCkJwTBgS5uvV95mzbOo/SCX7Uu9t97vP1ZU=", "bhzeq");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[1]] = lIIllllIlIIlllII("jLXERUqQKXk=", "rjxEs");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[2]] = lIIllllIlIIlllIl("QuoRjYHpuGU=", "rRWCP");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[3]] = lIIllllIlIIlllII("Qs7B7iZBDqc=", "IUAfz");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[4]] = lIIllllIlIIllllI("HjkVED4vDQ==", "AjabW");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[5]] = lIIllllIlIIlllII("zp7nxlgm0RU1s04zHg8u7cEFQ2gAo8XV2Bsi5XXiUd0=", "DDVTQ");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[6]] = lIIllllIlIIllllI("HC4eBCxYJQYJJFgfDRcnHzwcADoVKjsAJgAmCwA=", "vOheT");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[7]] = lIIllllIlIIlllII("GV+cBJotSV6jTTOxiuPQ0Y9XOXfBZ+uOpy2MstwVohI=", "sBCZv");
        SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[8]] = lIIllllIlIIlllIl("+HLTG+xKWyPe/wlgqlWZJccAmnHMBgsV", "clxoE");
    }
    
    private static String lIIllllIlIIlllIl(final String llllllllllllIlIlllllIllIIllIllll, final String llllllllllllIlIlllllIllIIllIllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIllIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIllIIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIllIIlllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIllIIlllIIIl.init(SavedState.lllIIlIIIIIlll[2], llllllllllllIlIlllllIllIIlllIIlI);
            return new String(llllllllllllIlIlllllIllIIlllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIllIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIllIIlllIIII) {
            llllllllllllIlIlllllIllIIlllIIII.printStackTrace();
            return null;
        }
    }
    
    public void clear() {
        this.numericData.clear();
        this.stringData.clear();
    }
    
    private static String lIIllllIlIIlllII(final String llllllllllllIlIlllllIllIIllllIlI, final String llllllllllllIlIlllllIllIIllllIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIllIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIllIIllllIll.getBytes(StandardCharsets.UTF_8)), SavedState.lllIIlIIIIIlll[8]), "DES");
            final Cipher llllllllllllIlIlllllIllIIllllllI = Cipher.getInstance("DES");
            llllllllllllIlIlllllIllIIllllllI.init(SavedState.lllIIlIIIIIlll[2], llllllllllllIlIlllllIllIIlllllll);
            return new String(llllllllllllIlIlllllIllIIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIllIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIllIIlllllIl) {
            llllllllllllIlIlllllIllIIlllllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllIlIIllllI(String llllllllllllIlIlllllIllIlIIIllII, final String llllllllllllIlIlllllIllIlIIlIIII) {
        llllllllllllIlIlllllIllIlIIIllII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllIllIlIIIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIllIlIIIllll = new StringBuilder();
        final char[] llllllllllllIlIlllllIllIlIIIlllI = llllllllllllIlIlllllIllIlIIlIIII.toCharArray();
        int llllllllllllIlIlllllIllIlIIIllIl = SavedState.lllIIlIIIIIlll[0];
        final long llllllllllllIlIlllllIllIlIIIIlll = (Object)((String)llllllllllllIlIlllllIllIlIIIllII).toCharArray();
        final String llllllllllllIlIlllllIllIlIIIIllI = (String)llllllllllllIlIlllllIllIlIIIIlll.length;
        Exception llllllllllllIlIlllllIllIlIIIIlIl = (Exception)SavedState.lllIIlIIIIIlll[0];
        while (lIIllllIlIlIIIll((int)llllllllllllIlIlllllIllIlIIIIlIl, (int)llllllllllllIlIlllllIllIlIIIIllI)) {
            final char llllllllllllIlIlllllIllIlIIlIIlI = llllllllllllIlIlllllIllIlIIIIlll[llllllllllllIlIlllllIllIlIIIIlIl];
            llllllllllllIlIlllllIllIlIIIllll.append((char)(llllllllllllIlIlllllIllIlIIlIIlI ^ llllllllllllIlIlllllIllIlIIIlllI[llllllllllllIlIlllllIllIlIIIllIl % llllllllllllIlIlllllIllIlIIIlllI.length]));
            "".length();
            ++llllllllllllIlIlllllIllIlIIIllIl;
            ++llllllllllllIlIlllllIllIlIIIIlIl;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIllIlIIIllll);
    }
    
    public void load() throws IOException {
        this.numericData = this.muffin.loadFile(String.valueOf(new StringBuilder().append(this.fileName).append(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[3]])));
        this.stringData = this.muffin.loadFile(String.valueOf(new StringBuilder().append(this.fileName).append(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[4]])));
    }
    
    private static boolean lIIllllIlIlIIIIl(final int llllllllllllIlIlllllIllIIllIIIlI) {
        return llllllllllllIlIlllllIllIIllIIIlI != 0;
    }
    
    private static boolean lIIllllIlIlIIIll(final int llllllllllllIlIlllllIllIIllIIlll, final int llllllllllllIlIlllllIllIIllIIllI) {
        return llllllllllllIlIlllllIllIIllIIlll < llllllllllllIlIlllllIllIIllIIllI;
    }
    
    public SavedState(final String llllllllllllIlIlllllIllIlllIIIlI) throws SlickException {
        this.numericData = new HashMap();
        this.stringData = new HashMap();
        this.fileName = llllllllllllIlIlllllIllIlllIIIlI;
        if (lIIllllIlIlIIIIl(this.isWebstartAvailable() ? 1 : 0)) {
            this.muffin = new WebstartMuffin();
            "".length();
            if ((0x1D ^ 0x19) < 0) {
                throw null;
            }
        }
        else {
            this.muffin = new FileMuffin();
        }
        try {
            this.load();
            "".length();
            if (-(0x9D ^ 0x98) >= 0) {
                throw null;
            }
        }
        catch (IOException llllllllllllIlIlllllIllIlllIIlII) {
            throw new SlickException(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[0]], llllllllllllIlIlllllIllIlllIIlII);
        }
    }
    
    public double getNumber(final String llllllllllllIlIlllllIllIllIllIIl) {
        return this.getNumber(llllllllllllIlIlllllIllIllIllIIl, 0.0);
    }
    
    public String getString(final String llllllllllllIlIlllllIllIllIIIIII) {
        return this.getString(llllllllllllIlIlllllIllIllIIIIII, null);
    }
    
    public double getNumber(final String llllllllllllIlIlllllIllIllIlIIll, final double llllllllllllIlIlllllIllIllIIlllI) {
        final Double llllllllllllIlIlllllIllIllIlIIIl = this.numericData.get(llllllllllllIlIlllllIllIllIlIIll);
        if (lIIllllIlIlIIIlI(llllllllllllIlIlllllIllIllIlIIIl)) {
            return llllllllllllIlIlllllIllIllIIlllI;
        }
        return llllllllllllIlIlllllIllIllIlIIIl;
    }
    
    static {
        lIIllllIlIlIIIII();
        lIIllllIlIIlllll();
    }
    
    private static void lIIllllIlIlIIIII() {
        (lllIIlIIIIIlll = new int[10])[0] = ((0xDF ^ 0xBB ^ (0xAB ^ 0x99)) & (0xA ^ 0x47 ^ (0xA2 ^ 0xB9) ^ -" ".length()));
        SavedState.lllIIlIIIIIlll[1] = " ".length();
        SavedState.lllIIlIIIIIlll[2] = "  ".length();
        SavedState.lllIIlIIIIIlll[3] = "   ".length();
        SavedState.lllIIlIIIIIlll[4] = (94 + 3 - 93 + 135 ^ 32 + 34 + 72 + 5);
        SavedState.lllIIlIIIIIlll[5] = (0x1E ^ 0x3A ^ (0x2A ^ 0xB));
        SavedState.lllIIlIIIIIlll[6] = (0x5E ^ 0x25 ^ (0xF7 ^ 0x8A));
        SavedState.lllIIlIIIIIlll[7] = (0x52 ^ 0x55);
        SavedState.lllIIlIIIIIlll[8] = (0x37 ^ 0x3F);
        SavedState.lllIIlIIIIIlll[9] = (0x28 ^ 0x21);
    }
    
    public void setString(final String llllllllllllIlIlllllIllIlIlIlIlI, final String llllllllllllIlIlllllIllIlIlIllII) {
        this.stringData.put(llllllllllllIlIlllllIllIlIlIlIlI, llllllllllllIlIlllllIllIlIlIllII);
        "".length();
    }
    
    public void setNumber(final String llllllllllllIlIlllllIllIllIIlIII, final double llllllllllllIlIlllllIllIllIIIlII) {
        this.numericData.put(llllllllllllIlIlllllIllIllIIlIII, new Double(llllllllllllIlIlllllIllIllIIIlII));
        "".length();
    }
    
    public String getString(final String llllllllllllIlIlllllIllIlIllIlII, final String llllllllllllIlIlllllIllIlIllIIll) {
        final String llllllllllllIlIlllllIllIlIllIllI = this.stringData.get(llllllllllllIlIlllllIllIlIllIlII);
        if (lIIllllIlIlIIIlI(llllllllllllIlIlllllIllIlIllIllI)) {
            return llllllllllllIlIlllllIllIlIllIIll;
        }
        return llllllllllllIlIlllllIllIlIllIllI;
    }
    
    private static boolean lIIllllIlIlIIIlI(final Object llllllllllllIlIlllllIllIIllIIlII) {
        return llllllllllllIlIlllllIllIIllIIlII == null;
    }
    
    private boolean isWebstartAvailable() {
        try {
            Class.forName(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[5]]);
            "".length();
            ServiceManager.lookup(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[6]]);
            "".length();
            Log.info(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[7]]);
            "".length();
            if ((0x2F ^ 0x2B) <= -" ".length()) {
                return ((0xF5 ^ 0xC2) & ~(0x51 ^ 0x66)) != 0x0;
            }
        }
        catch (Exception llllllllllllIlIlllllIllIlIIllllI) {
            Log.info(SavedState.lllIIlIIIIIllI[SavedState.lllIIlIIIIIlll[8]]);
            return SavedState.lllIIlIIIIIlll[0] != 0;
        }
        return SavedState.lllIIlIIIIIlll[1] != 0;
    }
}
