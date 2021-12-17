// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font;

import org.newdawn.slick.util.ResourceLoader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Iterator;
import org.newdawn.slick.font.effects.ConfigurableEffect;
import org.newdawn.slick.SlickException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class HieroSettings
{
    private /* synthetic */ int paddingLeft;
    private /* synthetic */ boolean bold;
    private /* synthetic */ int fontSize;
    private final /* synthetic */ List effects;
    private /* synthetic */ boolean italic;
    private /* synthetic */ int paddingAdvanceY;
    private /* synthetic */ int glyphPageHeight;
    private /* synthetic */ int glyphPageWidth;
    private /* synthetic */ int paddingAdvanceX;
    private /* synthetic */ int paddingTop;
    private /* synthetic */ int paddingBottom;
    private static final /* synthetic */ String[] llIlIllIIlIlll;
    private /* synthetic */ int paddingRight;
    private static final /* synthetic */ int[] llIlIllIIlllll;
    
    public int getGlyphPageHeight() {
        return this.glyphPageHeight;
    }
    
    private static String lIIlIlIlIIlIlIIl(String llllllllllllIllIlIIllIIIlIIIIlII, final String llllllllllllIllIlIIllIIIlIIIIIll) {
        llllllllllllIllIlIIllIIIlIIIIlII = new String(Base64.getDecoder().decode(llllllllllllIllIlIIllIIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIllIIIlIIIIIlI = new StringBuilder();
        final char[] llllllllllllIllIlIIllIIIlIIIIIIl = llllllllllllIllIlIIllIIIlIIIIIll.toCharArray();
        int llllllllllllIllIlIIllIIIlIIIIIII = HieroSettings.llIlIllIIlllll[1];
        final char llllllllllllIllIlIIllIIIIllllIlI = (Object)llllllllllllIllIlIIllIIIlIIIIlII.toCharArray();
        final float llllllllllllIllIlIIllIIIIllllIIl = llllllllllllIllIlIIllIIIIllllIlI.length;
        float llllllllllllIllIlIIllIIIIllllIII = HieroSettings.llIlIllIIlllll[1];
        while (lIIlIlIlIIlllIIl((int)llllllllllllIllIlIIllIIIIllllIII, (int)llllllllllllIllIlIIllIIIIllllIIl)) {
            final char llllllllllllIllIlIIllIIIlIIIIlIl = llllllllllllIllIlIIllIIIIllllIlI[llllllllllllIllIlIIllIIIIllllIII];
            llllllllllllIllIlIIllIIIlIIIIIlI.append((char)(llllllllllllIllIlIIllIIIlIIIIlIl ^ llllllllllllIllIlIIllIIIlIIIIIIl[llllllllllllIllIlIIllIIIlIIIIIII % llllllllllllIllIlIIllIIIlIIIIIIl.length]));
            "".length();
            ++llllllllllllIllIlIIllIIIlIIIIIII;
            ++llllllllllllIllIlIIllIIIIllllIII;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIllIIIlIIIIIlI);
    }
    
    public int getFontSize() {
        return this.fontSize;
    }
    
    private static boolean lIIlIlIlIIllIlll(final int llllllllllllIllIlIIllIIIIlIlIIll) {
        return llllllllllllIllIlIIllIIIIlIlIIll == 0;
    }
    
    private static void lIIlIlIlIIlIllll() {
        (llIlIllIIlIlll = new String[HieroSettings.llIlIllIIlllll[31]])[HieroSettings.llIlIllIIlllll[1]] = lIIlIlIlIIlIIlIl("yvoqlrcg09g=", "MdFCI");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[4]] = lIIlIlIlIIlIIlIl("V6Z5w2jLIZI7egsd3Xrhvw==", "fKhak");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[3]] = lIIlIlIlIIlIlIIl("MjwEHmM2PAYO", "TSjjM");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[5]] = lIIlIlIlIIlIlIlI("Gl9zYHwZIOnllqoNpR0O0Q==", "KriLk");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[6]] = lIIlIlIlIIlIlIIl("Mg0uXRMtHA==", "BlJsg");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[7]] = lIIlIlIlIIlIlIIl("MTUBdCUoMw0u", "ATeZW");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[8]] = lIIlIlIlIIlIIlIl("IHFU/wRr6rjHf6OQG5ASHQ==", "VEyKU");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[9]] = lIIlIlIlIIlIlIlI("5Dor4N5+2IL52K9bZOYnwQ==", "iAGHM");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[10]] = lIIlIlIlIIlIlIlI("NrFl5uplyL2E+TK/vDJtIA==", "QkFhS");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[11]] = lIIlIlIlIIlIlIIl("GRMTZgINBBYmAAxcDg==", "irwHc");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[12]] = lIIlIlIlIIlIlIlI("l9kcxP+ruBfPEQJiZhYqvKDhnd5fV02G", "AxvWG");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[13]] = lIIlIlIlIIlIlIlI("llAfj+O5EjkdACToJSky6MwHiqOGuz61", "xuVoc");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[0]] = lIIlIlIlIIlIlIlI("80SiTY2wpADvBz0kuaFUFw==", "vyKEV");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[14]] = lIIlIlIlIIlIlIIl("Mh8ANzoCURU6dgQDBDQiAlEEMzACEhV1PwkCFTQ4BBRbdQ==", "gqaUV");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[15]] = lIIlIlIlIIlIlIIl("ISs+EjUwYw==", "DMXwV");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[16]] = lIIlIlIlIIlIlIlI("qpmNh7XC5bQpbK+7n/Ir+0595r8YNo/qEQ6f0PB28o8=", "iCOrR");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[17]] = lIIlIlIlIIlIIlIl("HeD5XGsSDVJG4reM7eSYYQ==", "fsBWC");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[18]] = lIIlIlIlIIlIlIlI("mMq8vtxJ0XLeYJ+b8+lBFg==", "JiDVl");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[19]] = lIIlIlIlIIlIIlIl("K+uB8nZ2Qyf0s8zFSNsi0Q==", "Ldjpj");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[20]] = lIIlIlIlIIlIIlIl("9no/ZfVadILOFFRK9B/kGw==", "KxCeZ");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[21]] = lIIlIlIlIIlIlIlI("nvX1Sd80nM7WpUMyeyIcFg==", "LSltN");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[22]] = lIIlIlIlIIlIlIIl("ERcGVwMOAhYWDFw=", "avbya");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[23]] = lIIlIlIlIIlIlIlI("MyEia0nfKlcKf/yUhc1w/w==", "WkrRW");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[24]] = lIIlIlIlIIlIlIIl("NCcMTAIgMAkMACFoEF8=", "DFhbc");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[25]] = lIIlIlIlIIlIlIlI("NNwX6/zwCPJOpiQ+efHzVQ==", "pcKiF");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[26]] = lIIlIlIlIIlIIlIl("ccLwd8GTPeYO7lEQnE9la6dqdtJNgPMp", "XBDzo");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[27]] = lIIlIlIlIIlIIlIl("v9Gx/YQq/vmRnE8OFLReOSuUPLgTa/tn", "ECFlh");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[28]] = lIIlIlIlIIlIIlIl("lqBZ7dOm5XQQo5G4xtwgnQ==", "CYEBK");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[29]] = lIIlIlIlIIlIlIIl("EB4wIwgBVg==", "uxVFk");
        HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[30]] = lIIlIlIlIIlIIlIl("dzHhLa+vNKE=", "NzkyF");
    }
    
    public int getPaddingLeft() {
        return this.paddingLeft;
    }
    
    public void setPaddingAdvanceY(final int llllllllllllIllIlIIllIIIllIlIllI) {
        this.paddingAdvanceY = llllllllllllIllIlIIllIIIllIlIllI;
    }
    
    public void setPaddingRight(final int llllllllllllIllIlIIllIIIlllIlIII) {
        this.paddingRight = llllllllllllIllIlIIllIIIlllIlIII;
    }
    
    public void setPaddingBottom(final int llllllllllllIllIlIIllIIIllllIIIl) {
        this.paddingBottom = llllllllllllIllIlIIllIIIllllIIIl;
    }
    
    public int getPaddingAdvanceY() {
        return this.paddingAdvanceY;
    }
    
    public boolean isItalic() {
        return this.italic;
    }
    
    public void setPaddingTop(final int llllllllllllIllIlIIllIIlIIIIIIIl) {
        this.paddingTop = llllllllllllIllIlIIllIIlIIIIIIIl;
    }
    
    public HieroSettings(final InputStream llllllllllllIllIlIIllIIlIIIlIIll) throws SlickException {
        this.fontSize = HieroSettings.llIlIllIIlllll[0];
        this.bold = (HieroSettings.llIlIllIIlllll[1] != 0);
        this.italic = (HieroSettings.llIlIllIIlllll[1] != 0);
        this.glyphPageWidth = HieroSettings.llIlIllIIlllll[2];
        this.glyphPageHeight = HieroSettings.llIlIllIIlllll[2];
        this.effects = new ArrayList();
        try {
            final BufferedReader llllllllllllIllIlIIllIIlIIIllIII = new BufferedReader(new InputStreamReader(llllllllllllIllIlIIllIIlIIIlIIll));
            while (true) {
                String llllllllllllIllIlIIllIIlIIIlllII = llllllllllllIllIlIIllIIlIIIllIII.readLine();
                if (lIIlIlIlIIllIllI(llllllllllllIllIlIIllIIlIIIlllII)) {
                    "".length();
                    if (((0x56 ^ 0x67) & ~(0x76 ^ 0x47)) != 0x0) {
                        throw null;
                    }
                    llllllllllllIllIlIIllIIlIIIllIII.close();
                    "".length();
                    if (" ".length() < -" ".length()) {
                        throw null;
                    }
                    break;
                }
                else {
                    llllllllllllIllIlIIllIIlIIIlllII = llllllllllllIllIlIIllIIlIIIlllII.trim();
                    if (lIIlIlIlIIllIlll(llllllllllllIllIlIIllIIlIIIlllII.length())) {
                        "".length();
                        if (-"   ".length() >= 0) {
                            throw null;
                        }
                        continue;
                    }
                    else {
                        final String[] llllllllllllIllIlIIllIIlIIIllIll = llllllllllllIllIlIIllIIlIIIlllII.split(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[1]], HieroSettings.llIlIllIIlllll[3]);
                        String llllllllllllIllIlIIllIIlIIIllIlI = llllllllllllIllIlIIllIIlIIIllIll[HieroSettings.llIlIllIIlllll[1]].trim();
                        final String llllllllllllIllIlIIllIIlIIIllIIl = llllllllllllIllIlIIllIIlIIIllIll[HieroSettings.llIlIllIIlllll[4]];
                        Label_1107: {
                            if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[4]]) ? 1 : 0)) {
                                this.fontSize = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if (-" ".length() >= 0) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[3]]) ? 1 : 0)) {
                                this.bold = Boolean.valueOf(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ((0x5E ^ 0x0 ^ (0x64 ^ 0x3E)) == 0x0) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[5]]) ? 1 : 0)) {
                                this.italic = Boolean.valueOf(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ("   ".length() < "   ".length()) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[6]]) ? 1 : 0)) {
                                this.paddingTop = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ((0xA0 ^ 0xBE ^ (0x8D ^ 0x96)) <= 0) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[7]]) ? 1 : 0)) {
                                this.paddingRight = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ((0x6 ^ 0x50 ^ (0x78 ^ 0x2B)) == 0x0) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[8]]) ? 1 : 0)) {
                                this.paddingBottom = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if (" ".length() <= 0) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[9]]) ? 1 : 0)) {
                                this.paddingLeft = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[10]]) ? 1 : 0)) {
                                this.paddingAdvanceX = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ("  ".length() != "  ".length()) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[11]]) ? 1 : 0)) {
                                this.paddingAdvanceY = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if (((0xDD ^ 0x8A) & ~(0x16 ^ 0x41)) >= (0x3F ^ 0x3B)) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[12]]) ? 1 : 0)) {
                                this.glyphPageWidth = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ((79 + 137 - 89 + 13 ^ 74 + 80 - 60 + 43) <= 0) {
                                    throw null;
                                }
                            }
                            else if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[13]]) ? 1 : 0)) {
                                this.glyphPageHeight = Integer.parseInt(llllllllllllIllIlIIllIIlIIIllIIl);
                                "".length();
                                if ("  ".length() >= (113 + 87 - 132 + 60 ^ 17 + 53 + 14 + 48)) {
                                    throw null;
                                }
                            }
                            else {
                                if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.equals(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[0]]) ? 1 : 0)) {
                                    try {
                                        this.effects.add(Class.forName(llllllllllllIllIlIIllIIlIIIllIIl).newInstance());
                                        "".length();
                                        "".length();
                                        if (" ".length() < 0) {
                                            throw null;
                                        }
                                        break Label_1107;
                                    }
                                    catch (Exception llllllllllllIllIlIIllIIlIIlIIIIl) {
                                        throw new SlickException(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[14]]).append(llllllllllllIllIlIIllIIlIIIllIIl)), llllllllllllIllIlIIllIIlIIlIIIIl);
                                    }
                                }
                                if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIllIlI.startsWith(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[15]]) ? 1 : 0)) {
                                    llllllllllllIllIlIIllIIlIIIllIlI = llllllllllllIllIlIIllIIlIIIllIlI.substring(HieroSettings.llIlIllIIlllll[9]);
                                    final ConfigurableEffect llllllllllllIllIlIIllIIlIIIllllI = this.effects.get(this.effects.size() - HieroSettings.llIlIllIIlllll[4]);
                                    final List llllllllllllIllIlIIllIIlIIIlllIl = llllllllllllIllIlIIllIIlIIIllllI.getValues();
                                    final Iterator llllllllllllIllIlIIllIIlIIIlllll = llllllllllllIllIlIIllIIlIIIlllIl.iterator();
                                    while (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIIlllll.hasNext() ? 1 : 0)) {
                                        final ConfigurableEffect.Value llllllllllllIllIlIIllIIlIIlIIIII = llllllllllllIllIlIIllIIlIIIlllll.next();
                                        if (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIlIIlIIIII.getName().equals(llllllllllllIllIlIIllIIlIIIllIlI) ? 1 : 0)) {
                                            llllllllllllIllIlIIllIIlIIlIIIII.setString(llllllllllllIllIlIIllIIlIIIllIIl);
                                            "".length();
                                            if ((0xE9 ^ 0x87 ^ (0x5B ^ 0x31)) != (81 + 31 - 24 + 77 ^ 36 + 160 - 153 + 118)) {
                                                throw null;
                                            }
                                            break;
                                        }
                                        else {
                                            "".length();
                                            if (-"   ".length() > 0) {
                                                throw null;
                                            }
                                            continue;
                                        }
                                    }
                                    llllllllllllIllIlIIllIIlIIIllllI.setValues(llllllllllllIllIlIIllIIlIIIlllIl);
                                }
                            }
                        }
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            throw null;
                        }
                        continue;
                    }
                }
            }
        }
        catch (Exception llllllllllllIllIlIIllIIlIIIlIlll) {
            throw new SlickException(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[16]], llllllllllllIllIlIIllIIlIIIlIlll);
        }
    }
    
    public void setPaddingAdvanceX(final int llllllllllllIllIlIIllIIIllIlllll) {
        this.paddingAdvanceX = llllllllllllIllIlIIllIIIllIlllll;
    }
    
    private static String lIIlIlIlIIlIIlIl(final String llllllllllllIllIlIIllIIIIllIllll, final String llllllllllllIllIlIIllIIIIllIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIllIIIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIIIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIllIIIIlllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIllIIIIlllIIIl.init(HieroSettings.llIlIllIIlllll[3], llllllllllllIllIlIIllIIIIlllIIlI);
            return new String(llllllllllllIllIlIIllIIIIlllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIIIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIllIIIIlllIIII) {
            llllllllllllIllIlIIllIIIIlllIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlIlIIlIlIlI(final String llllllllllllIllIlIIllIIIIllIIIII, final String llllllllllllIllIlIIllIIIIllIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIllIIIIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), HieroSettings.llIlIllIIlllll[10]), "DES");
            final Cipher llllllllllllIllIlIIllIIIIllIIlII = Cipher.getInstance("DES");
            llllllllllllIllIlIIllIIIIllIIlII.init(HieroSettings.llIlIllIIlllll[3], llllllllllllIllIlIIllIIIIllIIlIl);
            return new String(llllllllllllIllIlIIllIIIIllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIllIIIIllIIIll) {
            llllllllllllIllIlIIllIIIIllIIIll.printStackTrace();
            return null;
        }
    }
    
    public void setBold(final boolean llllllllllllIllIlIIllIIIlIllIIlI) {
        this.bold = llllllllllllIllIlIIllIIIlIllIIlI;
    }
    
    public void setGlyphPageWidth(final int llllllllllllIllIlIIllIIIllIIlIll) {
        this.glyphPageWidth = llllllllllllIllIlIIllIIIllIIlIll;
    }
    
    public void setItalic(final boolean llllllllllllIllIlIIllIIIlIlIlIIl) {
        this.italic = llllllllllllIllIlIIllIIIlIlIlIIl;
    }
    
    private static boolean lIIlIlIlIIlllIII(final int llllllllllllIllIlIIllIIIIlIlIlIl) {
        return llllllllllllIllIlIIllIIIIlIlIlIl != 0;
    }
    
    static {
        lIIlIlIlIIllIlIl();
        lIIlIlIlIIlIllll();
    }
    
    public List getEffects() {
        return this.effects;
    }
    
    public int getPaddingAdvanceX() {
        return this.paddingAdvanceX;
    }
    
    private static boolean lIIlIlIlIIllIllI(final Object llllllllllllIllIlIIllIIIIlIlIlll) {
        return llllllllllllIllIlIIllIIIIlIlIlll == null;
    }
    
    public boolean isBold() {
        return this.bold;
    }
    
    public void setPaddingLeft(final int llllllllllllIllIlIIllIIIlllllIlI) {
        this.paddingLeft = llllllllllllIllIlIIllIIIlllllIlI;
    }
    
    public int getPaddingTop() {
        return this.paddingTop;
    }
    
    private static boolean lIIlIlIlIIlllIIl(final int llllllllllllIllIlIIllIIIIlIllIlI, final int llllllllllllIllIlIIllIIIIlIllIIl) {
        return llllllllllllIllIlIIllIIIIlIllIlI < llllllllllllIllIlIIllIIIIlIllIIl;
    }
    
    public void setFontSize(final int llllllllllllIllIlIIllIIIlIlllIll) {
        this.fontSize = llllllllllllIllIlIIllIIIlIlllIll;
    }
    
    public int getPaddingRight() {
        return this.paddingRight;
    }
    
    public int getGlyphPageWidth() {
        return this.glyphPageWidth;
    }
    
    public void save(final File llllllllllllIllIlIIllIIIlIIlIlll) throws IOException {
        final PrintStream llllllllllllIllIlIIllIIIlIIlIllI = new PrintStream(new FileOutputStream(llllllllllllIllIlIIllIIIlIIlIlll));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[17]]).append(this.fontSize)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[18]]).append(this.bold)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[19]]).append(this.italic)));
        llllllllllllIllIlIIllIIIlIIlIllI.println();
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[20]]).append(this.paddingTop)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[21]]).append(this.paddingRight)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[22]]).append(this.paddingBottom)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[23]]).append(this.paddingLeft)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[24]]).append(this.paddingAdvanceX)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[25]]).append(this.paddingAdvanceY)));
        llllllllllllIllIlIIllIIIlIIlIllI.println();
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[26]]).append(this.glyphPageWidth)));
        llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[27]]).append(this.glyphPageHeight)));
        llllllllllllIllIlIIllIIIlIIlIllI.println();
        final Iterator llllllllllllIllIlIIllIIIlIIllIIl = this.effects.iterator();
        while (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIIlIIllIIl.hasNext() ? 1 : 0)) {
            final ConfigurableEffect llllllllllllIllIlIIllIIIlIIllIlI = llllllllllllIllIlIIllIIIlIIllIIl.next();
            llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[28]]).append(llllllllllllIllIlIIllIIIlIIllIlI.getClass().getName())));
            final Iterator llllllllllllIllIlIIllIIIlIIllIll = llllllllllllIllIlIIllIIIlIIllIlI.getValues().iterator();
            while (lIIlIlIlIIlllIII(llllllllllllIllIlIIllIIIlIIllIll.hasNext() ? 1 : 0)) {
                final ConfigurableEffect.Value llllllllllllIllIlIIllIIIlIIlllII = llllllllllllIllIlIIllIIIlIIllIll.next();
                llllllllllllIllIlIIllIIIlIIlIllI.println(String.valueOf(new StringBuilder().append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[29]]).append(llllllllllllIllIlIIllIIIlIIlllII.getName()).append(HieroSettings.llIlIllIIlIlll[HieroSettings.llIlIllIIlllll[30]]).append(llllllllllllIllIlIIllIIIlIIlllII.getString())));
                "".length();
                if (null != null) {
                    return;
                }
            }
            llllllllllllIllIlIIllIIIlIIlIllI.println();
            "".length();
            if (null != null) {
                return;
            }
        }
        llllllllllllIllIlIIllIIIlIIlIllI.close();
    }
    
    public HieroSettings(final String llllllllllllIllIlIIllIIlIIlIllll) throws SlickException {
        this(ResourceLoader.getResourceAsStream(llllllllllllIllIlIIllIIlIIlIllll));
    }
    
    public HieroSettings() {
        this.fontSize = HieroSettings.llIlIllIIlllll[0];
        this.bold = (HieroSettings.llIlIllIIlllll[1] != 0);
        this.italic = (HieroSettings.llIlIllIIlllll[1] != 0);
        this.glyphPageWidth = HieroSettings.llIlIllIIlllll[2];
        this.glyphPageHeight = HieroSettings.llIlIllIIlllll[2];
        this.effects = new ArrayList();
    }
    
    public int getPaddingBottom() {
        return this.paddingBottom;
    }
    
    public void setGlyphPageHeight(final int llllllllllllIllIlIIllIIIllIIIIlI) {
        this.glyphPageHeight = llllllllllllIllIlIIllIIIllIIIIlI;
    }
    
    private static void lIIlIlIlIIllIlIl() {
        (llIlIllIIlllll = new int[32])[0] = (0x3F ^ 0x51 ^ (0x29 ^ 0x4B));
        HieroSettings.llIlIllIIlllll[1] = ((130 + 89 - 143 + 79 ^ 70 + 138 - 59 + 32) & (0x20 ^ 0x2D ^ (0x20 ^ 0x3) ^ -" ".length()));
        HieroSettings.llIlIllIIlllll[2] = (-(0xFFFFBDDF & 0x6FBF) & (0xFFFFEF9F & 0x3FFE));
        HieroSettings.llIlIllIIlllll[3] = "  ".length();
        HieroSettings.llIlIllIIlllll[4] = " ".length();
        HieroSettings.llIlIllIIlllll[5] = "   ".length();
        HieroSettings.llIlIllIIlllll[6] = (0x42 ^ 0x46);
        HieroSettings.llIlIllIIlllll[7] = (0x25 ^ 0x59 ^ (0x1B ^ 0x62));
        HieroSettings.llIlIllIIlllll[8] = (0x2E ^ 0x28);
        HieroSettings.llIlIllIIlllll[9] = (109 + 87 - 113 + 58 ^ 29 + 116 - 39 + 32);
        HieroSettings.llIlIllIIlllll[10] = (0x84 ^ 0x8C);
        HieroSettings.llIlIllIIlllll[11] = (0xE ^ 0x7);
        HieroSettings.llIlIllIIlllll[12] = (62 + 82 - 78 + 105 ^ 53 + 71 - 45 + 82);
        HieroSettings.llIlIllIIlllll[13] = (0xBC ^ 0x86 ^ (0x71 ^ 0x40));
        HieroSettings.llIlIllIIlllll[14] = (0x4F ^ 0x42);
        HieroSettings.llIlIllIIlllll[15] = (0x5A ^ 0x54);
        HieroSettings.llIlIllIIlllll[16] = (0x35 ^ 0x3A);
        HieroSettings.llIlIllIIlllll[17] = (0xE0 ^ 0xB0 ^ (0xF4 ^ 0xB4));
        HieroSettings.llIlIllIIlllll[18] = (0x6E ^ 0x7F);
        HieroSettings.llIlIllIIlllll[19] = (152 + 37 - 139 + 113 ^ 108 + 139 - 190 + 120);
        HieroSettings.llIlIllIIlllll[20] = (3 + 45 + 70 + 10 ^ 66 + 123 - 157 + 115);
        HieroSettings.llIlIllIIlllll[21] = (0x75 ^ 0x40 ^ (0x41 ^ 0x60));
        HieroSettings.llIlIllIIlllll[22] = (0xD ^ 0x5A ^ (0xC4 ^ 0x86));
        HieroSettings.llIlIllIIlllll[23] = (0x80 ^ 0x96);
        HieroSettings.llIlIllIIlllll[24] = (0x27 ^ 0x23 ^ (0x49 ^ 0x5A));
        HieroSettings.llIlIllIIlllll[25] = (89 + 44 - 93 + 123 ^ 13 + 157 - 74 + 91);
        HieroSettings.llIlIllIIlllll[26] = (113 + 111 - 189 + 186 ^ 40 + 158 - 2 + 0);
        HieroSettings.llIlIllIIlllll[27] = (0xC5 ^ 0x8D ^ (0x2D ^ 0x7F));
        HieroSettings.llIlIllIIlllll[28] = (0xB8 ^ 0xA6 ^ (0xD ^ 0x8));
        HieroSettings.llIlIllIIlllll[29] = (0x76 ^ 0x6A);
        HieroSettings.llIlIllIIlllll[30] = (0x6F ^ 0x72);
        HieroSettings.llIlIllIIlllll[31] = (0x7B ^ 0x65);
    }
}
