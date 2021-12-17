// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.muffin;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.EOFException;
import java.io.DataInputStream;
import java.util.Iterator;
import java.util.Set;
import javax.jnlp.FileContents;
import java.io.DataOutputStream;
import java.io.IOException;
import org.newdawn.slick.util.Log;
import java.net.URL;
import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.PersistenceService;
import java.util.HashMap;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class WebstartMuffin implements Muffin
{
    private static final /* synthetic */ int[] lIlIIllIllIlII;
    private static final /* synthetic */ String[] lIlIIllIllIIll;
    
    private static void lllIlIIIIlIlIII() {
        (lIlIIllIllIIll = new String[WebstartMuffin.lIlIIllIllIlII[10]])[WebstartMuffin.lIlIIllIllIlII[0]] = lllIlIIIIlIIlIl("vjcL5NTN5abE69RxQghajlMD7vTInsO+yK/xYyqpPkg=", "ZVbrl");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[1]] = lllIlIIIIlIIlIl("UDyPyDTxLr/x2cPLjOZ5e/to1dJKqJ+J", "KUNeD");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[2]] = lllIlIIIIlIIlIl("5P5Kjz094wZko/a/izNzN6KdbNIJN6rQ", "goCHf");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[3]] = lllIlIIIIlIIllI("JDpQFiIDJhkHMwQyUD4vDDMZHXosOgUdPkp4UDUzGCYEUwkLIxU=", "jUpsZ");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[4]] = lllIlIIIIlIIllI("KycoNSQX", "eREWA");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[5]] = lllIlIIIIlIIlll("MwIpYpqMSaAeuws2UEsTcXmRFsgYQV3VX/cGyvUfb/Ss8SZLaiddCA==", "KxcnQ");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[6]] = lllIlIIIIlIIlll("pcxUpcV/3+7BiBZK7jy5OOR2+n51m+w7j26qxt0QWp4=", "VIRBZ");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[7]] = lllIlIIIIlIIlll("RL52QbelDqdmiy9tViS8joKoIaY/Fygp", "dwZmC");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[8]] = lllIlIIIIlIIlll("HfcFQODiQHs=", "aWDLx");
        WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[9]] = lllIlIIIIlIIllI("PCMwByMeYi0EZhYtOA9mCTY4HyNaJCsEK1o1PAk1DiMrH2YXNz8NLxQ=", "zBYkF");
    }
    
    private static boolean lllIlIIIIlIlIlI(final int lllllllllllllIIIllIIlIIlIlIIlIII) {
        return lllllllllllllIIIllIIlIIlIlIIlIII != 0;
    }
    
    private static boolean lllIlIIIIlIllII(final int lllllllllllllIIIllIIlIIlIlIIllIl, final int lllllllllllllIIIllIIlIIlIlIIllII) {
        return lllllllllllllIIIllIIlIIlIlIIllIl < lllllllllllllIIIllIIlIIlIlIIllII;
    }
    
    static {
        lllIlIIIIlIlIIl();
        lllIlIIIIlIlIII();
    }
    
    private static boolean lllIlIIIIlIlIll(final Object lllllllllllllIIIllIIlIIlIlIIlIlI) {
        return lllllllllllllIIIllIIlIIlIlIIlIlI != null;
    }
    
    private static String lllIlIIIIlIIllI(String lllllllllllllIIIllIIlIIlIlllIIlI, final String lllllllllllllIIIllIIlIIlIlllIllI) {
        lllllllllllllIIIllIIlIIlIlllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIlIIlIlllIlIl = new StringBuilder();
        final char[] lllllllllllllIIIllIIlIIlIlllIlII = lllllllllllllIIIllIIlIIlIlllIllI.toCharArray();
        int lllllllllllllIIIllIIlIIlIlllIIll = WebstartMuffin.lIlIIllIllIlII[0];
        final byte lllllllllllllIIIllIIlIIlIllIllIl = (Object)lllllllllllllIIIllIIlIIlIlllIIlI.toCharArray();
        final long lllllllllllllIIIllIIlIIlIllIllII = lllllllllllllIIIllIIlIIlIllIllIl.length;
        char lllllllllllllIIIllIIlIIlIllIlIll = (char)WebstartMuffin.lIlIIllIllIlII[0];
        while (lllIlIIIIlIllII(lllllllllllllIIIllIIlIIlIllIlIll, (int)lllllllllllllIIIllIIlIIlIllIllII)) {
            final char lllllllllllllIIIllIIlIIlIllllIII = lllllllllllllIIIllIIlIIlIllIllIl[lllllllllllllIIIllIIlIIlIllIlIll];
            lllllllllllllIIIllIIlIIlIlllIlIl.append((char)(lllllllllllllIIIllIIlIIlIllllIII ^ lllllllllllllIIIllIIlIIlIlllIlII[lllllllllllllIIIllIIlIIlIlllIIll % lllllllllllllIIIllIIlIIlIlllIlII.length]));
            "".length();
            ++lllllllllllllIIIllIIlIIlIlllIIll;
            ++lllllllllllllIIIllIIlIIlIllIlIll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIlIIlIlllIlIl);
    }
    
    public void saveFile(final HashMap lllllllllllllIIIllIIlIIllIllIlIl, final String lllllllllllllIIIllIIlIIllIlIllll) throws IOException {
        PersistenceService lllllllllllllIIIllIIlIIllIllIIll;
        URL lllllllllllllIIIllIIlIIllIllIIIl;
        try {
            lllllllllllllIIIllIIlIIllIllIIll = (PersistenceService)ServiceManager.lookup(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[0]]);
            final BasicService lllllllllllllIIIllIIlIIllIllIIlI = (BasicService)ServiceManager.lookup(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[1]]);
            final URL lllllllllllllIIIllIIlIIlllIIIIIl = lllllllllllllIIIllIIlIIllIllIIlI.getCodeBase();
            lllllllllllllIIIllIIlIIllIllIIIl = new URL(lllllllllllllIIIllIIlIIlllIIIIIl, lllllllllllllIIIllIIlIIllIlIllll);
            "".length();
            if (-" ".length() > -" ".length()) {
                return;
            }
        }
        catch (Exception lllllllllllllIIIllIIlIIlllIIIIII) {
            Log.error(lllllllllllllIIIllIIlIIlllIIIIII);
            throw new IOException(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[2]]);
        }
        try {
            lllllllllllllIIIllIIlIIllIllIIll.delete(lllllllllllllIIIllIIlIIllIllIIIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception lllllllllllllIIIllIIlIIllIllllll) {
            Log.info(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[3]]);
        }
        try {
            lllllllllllllIIIllIIlIIllIllIIll.create(lllllllllllllIIIllIIlIIllIllIIIl, 1024L);
            final FileContents lllllllllllllIIIllIIlIIllIlllIlI = lllllllllllllIIIllIIlIIllIllIIll.get(lllllllllllllIIIllIIlIIllIllIIIl);
            final DataOutputStream lllllllllllllIIIllIIlIIllIlllIIl = new DataOutputStream(lllllllllllllIIIllIIlIIllIlllIlI.getOutputStream((boolean)(WebstartMuffin.lIlIIllIllIlII[0] != 0)));
            final Set lllllllllllllIIIllIIlIIllIlllIII = lllllllllllllIIIllIIlIIllIllIlIl.keySet();
            final Iterator lllllllllllllIIIllIIlIIllIlllIll = lllllllllllllIIIllIIlIIllIlllIII.iterator();
            while (lllIlIIIIlIlIlI(lllllllllllllIIIllIIlIIllIlllIll.hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIllIIlIIllIllllII = lllllllllllllIIIllIIlIIllIlllIll.next();
                lllllllllllllIIIllIIlIIllIlllIIl.writeUTF(lllllllllllllIIIllIIlIIllIllllII);
                if (lllIlIIIIlIlIlI(lllllllllllllIIIllIIlIIllIlIllll.endsWith(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[4]]) ? 1 : 0)) {
                    final double lllllllllllllIIIllIIlIIllIlllllI = lllllllllllllIIIllIIlIIllIllIlIl.get(lllllllllllllIIIllIIlIIllIllllII);
                    lllllllllllllIIIllIIlIIllIlllIIl.writeDouble(lllllllllllllIIIllIIlIIllIlllllI);
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
                else {
                    final String lllllllllllllIIIllIIlIIllIllllIl = (String)lllllllllllllIIIllIIlIIllIllIlIl.get(lllllllllllllIIIllIIlIIllIllllII);
                    lllllllllllllIIIllIIlIIllIlllIIl.writeUTF(lllllllllllllIIIllIIlIIllIllllIl);
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
            lllllllllllllIIIllIIlIIllIlllIIl.flush();
            lllllllllllllIIIllIIlIIllIlllIIl.close();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception lllllllllllllIIIllIIlIIllIllIlll) {
            Log.error(lllllllllllllIIIllIIlIIllIllIlll);
            throw new IOException(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[5]]);
        }
    }
    
    public HashMap loadFile(final String lllllllllllllIIIllIIlIIllIIIlIll) throws IOException {
        final HashMap lllllllllllllIIIllIIlIIllIIIllII = new HashMap();
        try {
            final PersistenceService lllllllllllllIIIllIIlIIllIIllIII = (PersistenceService)ServiceManager.lookup(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[6]]);
            final BasicService lllllllllllllIIIllIIlIIllIIlIlll = (BasicService)ServiceManager.lookup(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[7]]);
            final URL lllllllllllllIIIllIIlIIllIIlIllI = lllllllllllllIIIllIIlIIllIIlIlll.getCodeBase();
            final URL lllllllllllllIIIllIIlIIllIIlIlIl = new URL(lllllllllllllIIIllIIlIIllIIlIllI, lllllllllllllIIIllIIlIIllIIIlIll);
            final FileContents lllllllllllllIIIllIIlIIllIIlIlII = lllllllllllllIIIllIIlIIllIIllIII.get(lllllllllllllIIIllIIlIIllIIlIlIl);
            final DataInputStream lllllllllllllIIIllIIlIIllIIlIIll = new DataInputStream(lllllllllllllIIIllIIlIIllIIlIlII.getInputStream());
            if (lllIlIIIIlIlIlI(lllllllllllllIIIllIIlIIllIIIlIll.endsWith(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[8]]) ? 1 : 0)) {
                String lllllllllllllIIIllIIlIIllIIllIlI;
                while (lllIlIIIIlIlIll(lllllllllllllIIIllIIlIIllIIllIlI = lllllllllllllIIIllIIlIIllIIlIIll.readUTF())) {
                    final double lllllllllllllIIIllIIlIIllIIllIll = lllllllllllllIIIllIIlIIllIIlIIll.readDouble();
                    lllllllllllllIIIllIIlIIllIIIllII.put(lllllllllllllIIIllIIlIIllIIllIlI, new Double(lllllllllllllIIIllIIlIIllIIllIll));
                    "".length();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                "".length();
                if ((0x20 ^ 0x24) == ((0x60 ^ 0x34) & ~(0x46 ^ 0x12))) {
                    return null;
                }
            }
            else {
                String lllllllllllllIIIllIIlIIllIIlIIlI;
                while (lllIlIIIIlIlIll(lllllllllllllIIIllIIlIIllIIlIIlI = lllllllllllllIIIllIIlIIllIIlIIll.readUTF())) {
                    final String lllllllllllllIIIllIIlIIllIIllIIl = lllllllllllllIIIllIIlIIllIIlIIll.readUTF();
                    lllllllllllllIIIllIIlIIllIIIllII.put(lllllllllllllIIIllIIlIIllIIlIIlI, lllllllllllllIIIllIIlIIllIIllIIl);
                    "".length();
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return null;
                    }
                }
            }
            lllllllllllllIIIllIIlIIllIIlIIll.close();
            "".length();
            if ("   ".length() == (0x19 ^ 0x1D)) {
                return null;
            }
        }
        catch (EOFException lllllllllllllIIIllIIlIIllIIlIIIl) {
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIIllIIlIIllIIlIIII) {
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        catch (Exception lllllllllllllIIIllIIlIIllIIIllll) {
            Log.error(lllllllllllllIIIllIIlIIllIIIllll);
            throw new IOException(WebstartMuffin.lIlIIllIllIIll[WebstartMuffin.lIlIIllIllIlII[9]]);
        }
        return lllllllllllllIIIllIIlIIllIIIllII;
    }
    
    private static String lllIlIIIIlIIlll(final String lllllllllllllIIIllIIlIIlIllIIIII, final String lllllllllllllIIIllIIlIIlIlIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIIlIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIlIIlIllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIlIIlIllIIlII.init(WebstartMuffin.lIlIIllIllIlII[2], lllllllllllllIIIllIIlIIlIllIIlIl);
            return new String(lllllllllllllIIIllIIlIIlIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIIlIllIIIll) {
            lllllllllllllIIIllIIlIIlIllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static String lllIlIIIIlIIlIl(final String lllllllllllllIIIllIIlIIlIlIlIIll, final String lllllllllllllIIIllIIlIIlIlIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIIlIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), WebstartMuffin.lIlIIllIllIlII[8]), "DES");
            final Cipher lllllllllllllIIIllIIlIIlIlIlIlll = Cipher.getInstance("DES");
            lllllllllllllIIIllIIlIIlIlIlIlll.init(WebstartMuffin.lIlIIllIllIlII[2], lllllllllllllIIIllIIlIIlIlIllIII);
            return new String(lllllllllllllIIIllIIlIIlIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIIlIlIlIllI) {
            lllllllllllllIIIllIIlIIlIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lllIlIIIIlIlIIl() {
        (lIlIIllIllIlII = new int[11])[0] = ((0x11 ^ 0xA) & ~(0xAF ^ 0xB4));
        WebstartMuffin.lIlIIllIllIlII[1] = " ".length();
        WebstartMuffin.lIlIIllIllIlII[2] = "  ".length();
        WebstartMuffin.lIlIIllIllIlII[3] = "   ".length();
        WebstartMuffin.lIlIIllIllIlII[4] = (0x43 ^ 0x47);
        WebstartMuffin.lIlIIllIllIlII[5] = (0xB0 ^ 0xBC ^ (0x8B ^ 0x82));
        WebstartMuffin.lIlIIllIllIlII[6] = (0x83 ^ 0xB0 ^ (0x68 ^ 0x5D));
        WebstartMuffin.lIlIIllIllIlII[7] = (0x7D ^ 0x5F ^ (0x77 ^ 0x52));
        WebstartMuffin.lIlIIllIllIlII[8] = (0xA1 ^ 0xB1 ^ (0x9E ^ 0x86));
        WebstartMuffin.lIlIIllIllIlII[9] = (46 + 136 - 153 + 134 ^ 36 + 147 - 17 + 4);
        WebstartMuffin.lIlIIllIllIlII[10] = (0x69 ^ 0x63);
    }
}
