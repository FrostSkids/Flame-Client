// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.gson.JsonObject;
import java.util.Date;

public class IPBanEntry extends BanEntry<String>
{
    private static final /* synthetic */ String[] lIlIIlIllIIlll;
    private static final /* synthetic */ int[] lIlIIlIllIlIIl;
    
    public IPBanEntry(final String lllllllllllllIIIllIllIIIIIlllIll, final Date lllllllllllllIIIllIllIIIIIlllIlI, final String lllllllllllllIIIllIllIIIIIllllll, final Date lllllllllllllIIIllIllIIIIIlllIII, final String lllllllllllllIIIllIllIIIIIllllIl) {
        super(lllllllllllllIIIllIllIIIIIlllIll, lllllllllllllIIIllIllIIIIIlllIlI, lllllllllllllIIIllIllIIIIIllllll, lllllllllllllIIIllIllIIIIIlllIII, lllllllllllllIIIllIllIIIIIllllIl);
    }
    
    static {
        lllIIllIlIlIlII();
        lllIIllIlIIlIII();
    }
    
    private static boolean lllIIllIlIlIllI(final Object lllllllllllllIIIllIlIlllllllllIl) {
        return lllllllllllllIIIllIlIlllllllllIl != null;
    }
    
    public IPBanEntry(final String lllllllllllllIIIllIllIIIIlIIlIll) {
        this(lllllllllllllIIIllIllIIIIlIIlIll, null, null, null, null);
    }
    
    private static String getIPFromJson(final JsonObject lllllllllllllIIIllIllIIIIIlIllll) {
        String asString;
        if (lllIIllIlIlIlIl(lllllllllllllIIIllIllIIIIIlIllll.has(IPBanEntry.lIlIIlIllIIlll[IPBanEntry.lIlIIlIllIlIIl[0]]) ? 1 : 0)) {
            asString = lllllllllllllIIIllIllIIIIIlIllll.get(IPBanEntry.lIlIIlIllIIlll[IPBanEntry.lIlIIlIllIlIIl[1]]).getAsString();
            "".length();
            if ((0x4 ^ 0x0) != (0xBC ^ 0xB8)) {
                return null;
            }
        }
        else {
            asString = null;
        }
        return asString;
    }
    
    private static void lllIIllIlIIlIII() {
        (lIlIIlIllIIlll = new String[IPBanEntry.lIlIIlIllIlIIl[3]])[IPBanEntry.lIlIIlIllIlIIl[0]] = lllIIllIlIIIlIl("GR0=", "pmRHd");
        IPBanEntry.lIlIIlIllIIlll[IPBanEntry.lIlIIlIllIlIIl[1]] = lllIIllIlIIIlIl("HD0=", "uMknV");
        IPBanEntry.lIlIIlIllIIlll[IPBanEntry.lIlIIlIllIlIIl[2]] = lllIIllIlIIIlll("HKOdhoKyvk4=", "IoLys");
    }
    
    private static void lllIIllIlIlIlII() {
        (lIlIIlIllIlIIl = new int[4])[0] = ((73 + 206 - 143 + 104 ^ 112 + 86 - 29 + 2) & (97 + 213 - 169 + 101 ^ 74 + 35 + 35 + 25 ^ -" ".length()));
        IPBanEntry.lIlIIlIllIlIIl[1] = " ".length();
        IPBanEntry.lIlIIlIllIlIIl[2] = "  ".length();
        IPBanEntry.lIlIIlIllIlIIl[3] = "   ".length();
    }
    
    @Override
    protected void onSerialization(final JsonObject lllllllllllllIIIllIllIIIIIlIlIII) {
        if (lllIIllIlIlIllI(((UserListEntry<Object>)this).getValue())) {
            lllllllllllllIIIllIllIIIIIlIlIII.addProperty(IPBanEntry.lIlIIlIllIIlll[IPBanEntry.lIlIIlIllIlIIl[2]], (String)this.getValue());
            super.onSerialization(lllllllllllllIIIllIllIIIIIlIlIII);
        }
    }
    
    private static boolean lllIIllIlIlIlll(final int lllllllllllllIIIllIllIIIIIIIIIII, final int lllllllllllllIIIllIlIlllllllllll) {
        return lllllllllllllIIIllIllIIIIIIIIIII < lllllllllllllIIIllIlIlllllllllll;
    }
    
    private static String lllIIllIlIIIlIl(String lllllllllllllIIIllIllIIIIIIllIII, final String lllllllllllllIIIllIllIIIIIIlllII) {
        lllllllllllllIIIllIllIIIIIIllIII = new String(Base64.getDecoder().decode(lllllllllllllIIIllIllIIIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIllIIIIIIllIll = new StringBuilder();
        final char[] lllllllllllllIIIllIllIIIIIIllIlI = lllllllllllllIIIllIllIIIIIIlllII.toCharArray();
        int lllllllllllllIIIllIllIIIIIIllIIl = IPBanEntry.lIlIIlIllIlIIl[0];
        final String lllllllllllllIIIllIllIIIIIIlIIll = (Object)lllllllllllllIIIllIllIIIIIIllIII.toCharArray();
        final Exception lllllllllllllIIIllIllIIIIIIlIIlI = (Exception)lllllllllllllIIIllIllIIIIIIlIIll.length;
        Exception lllllllllllllIIIllIllIIIIIIlIIIl = (Exception)IPBanEntry.lIlIIlIllIlIIl[0];
        while (lllIIllIlIlIlll((int)lllllllllllllIIIllIllIIIIIIlIIIl, (int)lllllllllllllIIIllIllIIIIIIlIIlI)) {
            final char lllllllllllllIIIllIllIIIIIIllllI = lllllllllllllIIIllIllIIIIIIlIIll[lllllllllllllIIIllIllIIIIIIlIIIl];
            lllllllllllllIIIllIllIIIIIIllIll.append((char)(lllllllllllllIIIllIllIIIIIIllllI ^ lllllllllllllIIIllIllIIIIIIllIlI[lllllllllllllIIIllIllIIIIIIllIIl % lllllllllllllIIIllIllIIIIIIllIlI.length]));
            "".length();
            ++lllllllllllllIIIllIllIIIIIIllIIl;
            ++lllllllllllllIIIllIllIIIIIIlIIIl;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIllIIIIIIllIll);
    }
    
    private static String lllIIllIlIIIlll(final String lllllllllllllIIIllIllIIIIIIIlIII, final String lllllllllllllIIIllIllIIIIIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIIIIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIllIIIIIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIllIIIIIIIlIlI.init(IPBanEntry.lIlIIlIllIlIIl[2], lllllllllllllIIIllIllIIIIIIIlIll);
            return new String(lllllllllllllIIIllIllIIIIIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIIIIIIIlIIl) {
            lllllllllllllIIIllIllIIIIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    public IPBanEntry(final JsonObject lllllllllllllIIIllIllIIIIIllIIIl) {
        super(getIPFromJson(lllllllllllllIIIllIllIIIIIllIIIl), lllllllllllllIIIllIllIIIIIllIIIl);
    }
    
    private static boolean lllIIllIlIlIlIl(final int lllllllllllllIIIllIlIllllllllIll) {
        return lllllllllllllIIIllIlIllllllllIll != 0;
    }
}
