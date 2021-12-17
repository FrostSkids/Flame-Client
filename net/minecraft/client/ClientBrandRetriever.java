// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ClientBrandRetriever
{
    private static final /* synthetic */ String[] llIIlllIlIIlII;
    private static final /* synthetic */ int[] llIIlllIlIIlIl;
    
    public static String getClientModName() {
        return ClientBrandRetriever.llIIlllIlIIlII[ClientBrandRetriever.llIIlllIlIIlIl[0]];
    }
    
    private static String lIIIlllllIIlllIl(final String llllllllllllIllIllllIllIIllIIlll, final String llllllllllllIllIllllIllIIllIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIllllIllIIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIllIIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllIllIIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllIllIIllIlIll.init(ClientBrandRetriever.llIIlllIlIIlIl[2], llllllllllllIllIllllIllIIllIllII);
            return new String(llllllllllllIllIllllIllIIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIllIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIllIIllIlIlI) {
            llllllllllllIllIllllIllIIllIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlllllIIlllll() {
        (llIIlllIlIIlIl = new int[3])[0] = ((0x8E ^ 0xA8) & ~(0x55 ^ 0x73));
        ClientBrandRetriever.llIIlllIlIIlIl[1] = " ".length();
        ClientBrandRetriever.llIIlllIlIIlIl[2] = "  ".length();
    }
    
    private static void lIIIlllllIIllllI() {
        (llIIlllIlIIlII = new String[ClientBrandRetriever.llIIlllIlIIlIl[1]])[ClientBrandRetriever.llIIlllIlIIlIl[0]] = lIIIlllllIIlllIl("VErf1fzP4A8=", "BfotI");
    }
    
    static {
        lIIIlllllIIlllll();
        lIIIlllllIIllllI();
    }
}
