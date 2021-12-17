// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.muffin;

import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import org.newdawn.slick.util.Log;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.HashMap;

public class FileMuffin implements Muffin
{
    private static final /* synthetic */ int[] llIIIlIllIlIll;
    private static final /* synthetic */ String[] llIIIlIllIIlll;
    
    private static boolean lIIIlIIllIlIllIl(final int llllllllllllIlllIlIlIlIlIIIIIlIl) {
        return llllllllllllIlllIlIlIlIlIIIIIlIl != 0;
    }
    
    static {
        lIIIlIIllIlIlIll();
        lIIIlIIllIlIIlIl();
    }
    
    public HashMap loadFile(final String llllllllllllIlllIlIlIlIlIIllIlIl) throws IOException {
        HashMap llllllllllllIlllIlIlIlIlIIlllIII = new HashMap();
        final String llllllllllllIlllIlIlIlIlIIllIlll = System.getProperty(FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[2]]);
        File llllllllllllIlllIlIlIlIlIIllIllI = new File(llllllllllllIlllIlIlIlIlIIllIlll);
        llllllllllllIlllIlIlIlIlIIllIllI = new File(llllllllllllIlllIlIlIlIlIIllIllI, FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[3]]);
        llllllllllllIlllIlIlIlIlIIllIllI = new File(llllllllllllIlllIlIlIlIlIIllIllI, llllllllllllIlllIlIlIlIlIIllIlIl);
        if (lIIIlIIllIlIllIl(llllllllllllIlllIlIlIlIlIIllIllI.exists() ? 1 : 0)) {
            try {
                final FileInputStream llllllllllllIlllIlIlIlIlIIlllllI = new FileInputStream(llllllllllllIlllIlIlIlIlIIllIllI);
                final ObjectInputStream llllllllllllIlllIlIlIlIlIIllllIl = new ObjectInputStream(llllllllllllIlllIlIlIlIlIIlllllI);
                llllllllllllIlllIlIlIlIlIIlllIII = (HashMap)llllllllllllIlllIlIlIlIlIIllllIl.readObject();
                llllllllllllIlllIlIlIlIlIIllllIl.close();
                "".length();
                if ("   ".length() < "  ".length()) {
                    return null;
                }
            }
            catch (EOFException llllllllllllIlllIlIlIlIlIIllllII) {
                "".length();
                if (-" ".length() > ((0x40 ^ 0x2 ^ (0x72 ^ 0xE)) & (39 + 138 - 59 + 64 ^ 60 + 114 - 140 + 102 ^ -" ".length()))) {
                    return null;
                }
            }
            catch (ClassNotFoundException llllllllllllIlllIlIlIlIlIIlllIll) {
                Log.error(llllllllllllIlllIlIlIlIlIIlllIll);
                throw new IOException(FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[4]]);
            }
        }
        return llllllllllllIlllIlIlIlIlIIlllIII;
    }
    
    private static boolean lIIIlIIllIlIlllI(final int llllllllllllIlllIlIlIlIlIIIIlIII, final int llllllllllllIlllIlIlIlIlIIIIIlll) {
        return llllllllllllIlllIlIlIlIlIIIIlIII < llllllllllllIlllIlIlIlIlIIIIIlll;
    }
    
    private static String lIIIlIIllIIllllI(String llllllllllllIlllIlIlIlIlIIIlIIll, final String llllllllllllIlllIlIlIlIlIIIlIIlI) {
        llllllllllllIlllIlIlIlIlIIIlIIll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIlIlIlIIIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlIlIlIIIlIllI = new StringBuilder();
        final char[] llllllllllllIlllIlIlIlIlIIIlIlIl = llllllllllllIlllIlIlIlIlIIIlIIlI.toCharArray();
        int llllllllllllIlllIlIlIlIlIIIlIlII = FileMuffin.llIIIlIllIlIll[0];
        final short llllllllllllIlllIlIlIlIlIIIIlllI = (Object)((String)llllllllllllIlllIlIlIlIlIIIlIIll).toCharArray();
        final float llllllllllllIlllIlIlIlIlIIIIllIl = llllllllllllIlllIlIlIlIlIIIIlllI.length;
        boolean llllllllllllIlllIlIlIlIlIIIIllII = FileMuffin.llIIIlIllIlIll[0] != 0;
        while (lIIIlIIllIlIlllI(llllllllllllIlllIlIlIlIlIIIIllII ? 1 : 0, (int)llllllllllllIlllIlIlIlIlIIIIllIl)) {
            final char llllllllllllIlllIlIlIlIlIIIllIIl = llllllllllllIlllIlIlIlIlIIIIlllI[llllllllllllIlllIlIlIlIlIIIIllII];
            llllllllllllIlllIlIlIlIlIIIlIllI.append((char)(llllllllllllIlllIlIlIlIlIIIllIIl ^ llllllllllllIlllIlIlIlIlIIIlIlIl[llllllllllllIlllIlIlIlIlIIIlIlII % llllllllllllIlllIlIlIlIlIIIlIlIl.length]));
            "".length();
            ++llllllllllllIlllIlIlIlIlIIIlIlII;
            ++llllllllllllIlllIlIlIlIlIIIIllII;
            "".length();
            if (((0x97 ^ 0xA1 ^ (0x5F ^ 0x77)) & (110 + 101 - 177 + 111 ^ 86 + 97 - 105 + 65 ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlIlIlIIIlIllI);
    }
    
    private static String lIIIlIIllIIlllll(final String llllllllllllIlllIlIlIlIlIIlIlIII, final String llllllllllllIlllIlIlIlIlIIlIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIlIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIlIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIlIlIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIlIlIIlIlIlI.init(FileMuffin.llIIIlIllIlIll[2], llllllllllllIlllIlIlIlIlIIlIlIll);
            return new String(llllllllllllIlllIlIlIlIlIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIlIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIlIlIIlIlIIl) {
            llllllllllllIlllIlIlIlIlIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    public void saveFile(final HashMap llllllllllllIlllIlIlIlIlIlIIlIlI, final String llllllllllllIlllIlIlIlIlIlIIlIIl) throws IOException {
        final String llllllllllllIlllIlIlIlIlIlIIlllI = System.getProperty(FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[0]]);
        File llllllllllllIlllIlIlIlIlIlIIllIl = new File(llllllllllllIlllIlIlIlIlIlIIlllI);
        llllllllllllIlllIlIlIlIlIlIIllIl = new File(llllllllllllIlllIlIlIlIlIlIIllIl, FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[1]]);
        if (lIIIlIIllIlIllII(llllllllllllIlllIlIlIlIlIlIIllIl.exists() ? 1 : 0)) {
            llllllllllllIlllIlIlIlIlIlIIllIl.mkdir();
            "".length();
        }
        llllllllllllIlllIlIlIlIlIlIIllIl = new File(llllllllllllIlllIlIlIlIlIlIIllIl, llllllllllllIlllIlIlIlIlIlIIlIIl);
        final FileOutputStream llllllllllllIlllIlIlIlIlIlIIllII = new FileOutputStream(llllllllllllIlllIlIlIlIlIlIIllIl);
        final ObjectOutputStream llllllllllllIlllIlIlIlIlIlIIlIll = new ObjectOutputStream(llllllllllllIlllIlIlIlIlIlIIllII);
        llllllllllllIlllIlIlIlIlIlIIlIll.writeObject(llllllllllllIlllIlIlIlIlIlIIlIlI);
        llllllllllllIlllIlIlIlIlIlIIlIll.close();
    }
    
    private static void lIIIlIIllIlIIlIl() {
        (llIIIlIllIIlll = new String[FileMuffin.llIIIlIllIlIll[5]])[FileMuffin.llIIIlIllIlIll[0]] = lIIIlIIllIIllllI("GxcsHHsGCyQL", "ndInU");
        FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[1]] = lIIIlIIllIIllllI("VDsRIQA=", "zQpWa");
        FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[2]] = lIIIlIIllIIlllll("Kyq2lcJPCF13E2AvtqXVPg==", "YWORW");
        FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[3]] = lIIIlIIllIIlllll("5BxKkf0CrXg=", "hlUTH");
        FileMuffin.llIIIlIllIIlll[FileMuffin.llIIIlIllIlIll[4]] = lIIIlIIllIIlllll("ZZbW5sF+EjtN52j+gnP83CXBmDkmy7cRJPDZ+juvoI4IrG9KeETya5mus9ekufiuutuxs5opKQQ=", "biJJZ");
    }
    
    private static void lIIIlIIllIlIlIll() {
        (llIIIlIllIlIll = new int[6])[0] = ((0xFD ^ 0xB3 ^ (0x8A ^ 0xC3)) & (112 + 167 - 115 + 26 ^ 154 + 14 - 79 + 96 ^ -" ".length()));
        FileMuffin.llIIIlIllIlIll[1] = " ".length();
        FileMuffin.llIIIlIllIlIll[2] = "  ".length();
        FileMuffin.llIIIlIllIlIll[3] = "   ".length();
        FileMuffin.llIIIlIllIlIll[4] = (69 + 191 - 159 + 94 ^ 196 + 94 - 101 + 10);
        FileMuffin.llIIIlIllIlIll[5] = (0xC1 ^ 0xC4);
    }
    
    private static boolean lIIIlIIllIlIllII(final int llllllllllllIlllIlIlIlIlIIIIIIll) {
        return llllllllllllIlllIlIlIlIlIIIIIIll == 0;
    }
}
