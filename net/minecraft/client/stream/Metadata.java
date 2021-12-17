// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import java.util.Arrays;
import com.google.common.collect.Maps;
import com.google.common.base.Objects;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import com.google.gson.Gson;

public class Metadata
{
    private /* synthetic */ String description;
    private static final /* synthetic */ Gson field_152811_a;
    private static final /* synthetic */ int[] lllIIIlllIIIlI;
    private static final /* synthetic */ String[] lllIIIllIIlIIl;
    private final /* synthetic */ String name;
    private /* synthetic */ Map<String, String> payload;
    
    public String func_152810_c() {
        return this.name;
    }
    
    public Metadata(final String llllllllllllIlIlllllllIIIllllIll, final String llllllllllllIlIlllllllIIIllllIlI) {
        this.name = llllllllllllIlIlllllllIIIllllIll;
        this.description = llllllllllllIlIlllllllIIIllllIlI;
    }
    
    static {
        lIIllllIIIllIIll();
        lIIlllIllllIIlll();
        field_152811_a = new Gson();
    }
    
    public String func_152809_a() {
        String s;
        if (lIIllllIIIllIlII(this.description)) {
            s = this.name;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            s = this.description;
        }
        return s;
    }
    
    private static boolean lIIllllIIIllIlII(final Object llllllllllllIlIlllllllIIIIIllIll) {
        return llllllllllllIlIlllllllIIIIIllIll == null;
    }
    
    private static boolean lIIllllIIIllIllI(final Object llllllllllllIlIlllllllIIIIIlllIl) {
        return llllllllllllIlIlllllllIIIIIlllIl != null;
    }
    
    private static void lIIlllIllllIIlll() {
        (lllIIIllIIlIIl = new String[Metadata.lllIIIlllIIIlI[10]])[Metadata.lllIIIlllIIIlI[1]] = lIIlllIllllIIlII("JDEtIAAIIDhhFAgtNS4FDXQwMkQPITUtSEk3OC8KBiB5IAANdDQuFgx0LS5EACB4", "iTYAd");
        Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[2]] = lIIlllIllllIIlIl("InZ4R9BiUaKOBnc6qDyHdDXFfRXRGqDQhouXVM937fagya+Jrn2usw==", "HWWtN");
        Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[4]] = lIIlllIllllIIlIl("qHGKr0wo1DOOXMdr4ZxfPlfDaxnhnxe67zAKVb3fA2r6FZIccs0DJg==", "PVqsf");
        Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[5]] = lIIlllIllllIIlII("Iww5LQEPHSxsFQ8QISMECkk7LQkbDG0vBAAHIjhFDAxtIhACBWw=", "niMLe");
        Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[6]] = lIIlllIllllIIlIl("Xry2cJkwKdqvmOnpebws0XPFCzzgn4+bRa3NfI7jt5UdgHnyfvFTog==", "FrRvj");
        Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[7]] = lIIlllIllllIIllI("xrQAS5IMEBk=", "nfmmC");
        Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[8]] = lIIlllIllllIIlIl("U7f7k+yDABPoxCjQ2hXCHw==", "iiCxX");
        Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[9]] = lIIlllIllllIIllI("KIwtcWpoisM=", "LcVpa");
    }
    
    private static void lIIllllIIIllIIll() {
        (lllIIIlllIIIlI = new int[11])[0] = (0xA4 ^ 0xC0 ^ (0xF1 ^ 0xA7));
        Metadata.lllIIIlllIIIlI[1] = ((0xB7 ^ 0xBC) & ~(0xBA ^ 0xB1));
        Metadata.lllIIIlllIIIlI[2] = " ".length();
        Metadata.lllIIIlllIIIlI[3] = (0xC9 ^ 0xAE) + (0xC7 ^ 0xAB) - (0x67 ^ 0x7D) + (0xF8 ^ 0xBE);
        Metadata.lllIIIlllIIIlI[4] = "  ".length();
        Metadata.lllIIIlllIIIlI[5] = "   ".length();
        Metadata.lllIIIlllIIIlI[6] = (0x45 ^ 0x41);
        Metadata.lllIIIlllIIIlI[7] = (0xBB ^ 0xBE);
        Metadata.lllIIIlllIIIlI[8] = (0x3 ^ 0x5);
        Metadata.lllIIIlllIIIlI[9] = (0x6C ^ 0x6B);
        Metadata.lllIIIlllIIIlI[10] = (0x80 ^ 0x88);
    }
    
    private static String lIIlllIllllIIllI(final String llllllllllllIlIlllllllIIIIlIllII, final String llllllllllllIlIlllllllIIIIlIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllllllIIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllllIIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllllIIIIlIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllllIIIIlIlllI.init(Metadata.lllIIIlllIIIlI[4], llllllllllllIlIlllllllIIIIlIllll);
            return new String(llllllllllllIlIlllllllIIIIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllllIIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllllIIIIlIllIl) {
            llllllllllllIlIlllllllIIIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    public void func_152807_a(final String llllllllllllIlIlllllllIIIlllIIII) {
        this.description = llllllllllllIlIlllllllIIIlllIIII;
    }
    
    private static boolean lIIllllIIIllIlll(final int llllllllllllIlIlllllllIIIIIllIIl) {
        return llllllllllllIlIlllllllIIIIIllIIl == 0;
    }
    
    private static boolean lIIllllIIIlllIII(final int llllllllllllIlIlllllllIIIIlIIlII, final int llllllllllllIlIlllllllIIIIlIIIll) {
        return llllllllllllIlIlllllllIIIIlIIlII < llllllllllllIlIlllllllIIIIlIIIll;
    }
    
    private static String lIIlllIllllIIlII(String llllllllllllIlIlllllllIIIlIIlIIl, final String llllllllllllIlIlllllllIIIlIIllIl) {
        llllllllllllIlIlllllllIIIlIIlIIl = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllllIIIlIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllllIIIlIIllII = new StringBuilder();
        final char[] llllllllllllIlIlllllllIIIlIIlIll = llllllllllllIlIlllllllIIIlIIllIl.toCharArray();
        int llllllllllllIlIlllllllIIIlIIlIlI = Metadata.lllIIIlllIIIlI[1];
        final short llllllllllllIlIlllllllIIIlIIIlII = (Object)((String)llllllllllllIlIlllllllIIIlIIlIIl).toCharArray();
        final byte llllllllllllIlIlllllllIIIlIIIIll = (byte)llllllllllllIlIlllllllIIIlIIIlII.length;
        char llllllllllllIlIlllllllIIIlIIIIlI = (char)Metadata.lllIIIlllIIIlI[1];
        while (lIIllllIIIlllIII(llllllllllllIlIlllllllIIIlIIIIlI, llllllllllllIlIlllllllIIIlIIIIll)) {
            final char llllllllllllIlIlllllllIIIlIIllll = llllllllllllIlIlllllllIIIlIIIlII[llllllllllllIlIlllllllIIIlIIIIlI];
            llllllllllllIlIlllllllIIIlIIllII.append((char)(llllllllllllIlIlllllllIIIlIIllll ^ llllllllllllIlIlllllllIIIlIIlIll[llllllllllllIlIlllllllIIIlIIlIlI % llllllllllllIlIlllllllIIIlIIlIll.length]));
            "".length();
            ++llllllllllllIlIlllllllIIIlIIlIlI;
            ++llllllllllllIlIlllllllIIIlIIIIlI;
            "".length();
            if (((0x64 ^ 0x3E ^ (0x48 ^ 0xD)) & (205 + 168 - 261 + 108 ^ 113 + 6 - 85 + 161 ^ -" ".length())) > (0x8E ^ 0xB5 ^ (0x1D ^ 0x22))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllllIIIlIIllII);
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[7]], (Object)this.name).add(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[8]], (Object)this.description).add(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[9]], (Object)this.func_152806_b()).toString();
    }
    
    public String func_152806_b() {
        String json;
        if (lIIllllIIIllIllI(this.payload) && lIIllllIIIllIlll(this.payload.isEmpty() ? 1 : 0)) {
            json = Metadata.field_152811_a.toJson((Object)this.payload);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            json = null;
        }
        return json;
    }
    
    public void func_152808_a(final String llllllllllllIlIlllllllIIIllIIllI, final String llllllllllllIlIlllllllIIIllIIlIl) {
        if (lIIllllIIIllIlII(this.payload)) {
            this.payload = (Map<String, String>)Maps.newHashMap();
        }
        if (lIIllllIIIllIlIl(this.payload.size(), Metadata.lllIIIlllIIIlI[0])) {
            throw new IllegalArgumentException(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[1]]);
        }
        if (lIIllllIIIllIlII(llllllllllllIlIlllllllIIIllIIllI)) {
            throw new IllegalArgumentException(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[2]]);
        }
        if (lIIllllIIIllIlIl(llllllllllllIlIlllllllIIIllIIllI.length(), Metadata.lllIIIlllIIIlI[3])) {
            throw new IllegalArgumentException(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[4]]);
        }
        if (lIIllllIIIllIlII(llllllllllllIlIlllllllIIIllIIlIl)) {
            throw new IllegalArgumentException(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[5]]);
        }
        if (lIIllllIIIllIlIl(llllllllllllIlIlllllllIIIllIIlIl.length(), Metadata.lllIIIlllIIIlI[3])) {
            throw new IllegalArgumentException(Metadata.lllIIIllIIlIIl[Metadata.lllIIIlllIIIlI[6]]);
        }
        this.payload.put(llllllllllllIlIlllllllIIIllIIllI, llllllllllllIlIlllllllIIIllIIlIl);
        "".length();
    }
    
    public Metadata(final String llllllllllllIlIlllllllIIIlllIlII) {
        this(llllllllllllIlIlllllllIIIlllIlII, null);
    }
    
    private static boolean lIIllllIIIllIlIl(final int llllllllllllIlIlllllllIIIIlIIIII, final int llllllllllllIlIlllllllIIIIIlllll) {
        return llllllllllllIlIlllllllIIIIlIIIII > llllllllllllIlIlllllllIIIIIlllll;
    }
    
    private static String lIIlllIllllIIlIl(final String llllllllllllIlIlllllllIIIIlllIIl, final String llllllllllllIlIlllllllIIIIlllIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllllIIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllllIIIIlllIII.getBytes(StandardCharsets.UTF_8)), Metadata.lllIIIlllIIIlI[10]), "DES");
            final Cipher llllllllllllIlIlllllllIIIIlllIll = Cipher.getInstance("DES");
            llllllllllllIlIlllllllIIIIlllIll.init(Metadata.lllIIIlllIIIlI[4], llllllllllllIlIlllllllIIIIllllII);
            return new String(llllllllllllIlIlllllllIIIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllllIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllllIIIIlllIlI) {
            llllllllllllIlIlllllllIIIIlllIlI.printStackTrace();
            return null;
        }
    }
}
