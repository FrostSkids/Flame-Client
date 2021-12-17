// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class WorldProviderSurface extends WorldProvider
{
    private static final /* synthetic */ int[] lIIllIIlIIlllI;
    private static final /* synthetic */ String[] lIIllIIlIIllIl;
    
    static {
        llIlIlllIIIlIIl();
        llIlIlllIIIIlll();
    }
    
    @Override
    public String getDimensionName() {
        return WorldProviderSurface.lIIllIIlIIllIl[WorldProviderSurface.lIIllIIlIIlllI[0]];
    }
    
    private static void llIlIlllIIIIlll() {
        (lIIllIIlIIllIl = new String[WorldProviderSurface.lIIllIIlIIlllI[2]])[WorldProviderSurface.lIIllIIlIIlllI[0]] = llIlIlllIIIIllI("1vyZX0+4Mvm0vy/0vyomjw==", "wFKtV");
        WorldProviderSurface.lIIllIIlIIllIl[WorldProviderSurface.lIIllIIlIIlllI[1]] = llIlIlllIIIIllI("a+SnUIdg96E=", "RpPiT");
    }
    
    private static void llIlIlllIIIlIIl() {
        (lIIllIIlIIlllI = new int[3])[0] = ((0x9E ^ 0xB0) & ~(0x17 ^ 0x39));
        WorldProviderSurface.lIIllIIlIIlllI[1] = " ".length();
        WorldProviderSurface.lIIllIIlIIlllI[2] = "  ".length();
    }
    
    private static String llIlIlllIIIIllI(final String lllllllllllllIIlIllIIIlIllIIIllI, final String lllllllllllllIIlIllIIIlIllIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIlIllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIlIllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIIIlIllIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIIIlIllIIlIlI.init(WorldProviderSurface.lIIllIIlIIlllI[2], lllllllllllllIIlIllIIIlIllIIlIll);
            return new String(lllllllllllllIIlIllIIIlIllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIlIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIlIllIIlIIl) {
            lllllllllllllIIlIllIIIlIllIIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getInternalNameSuffix() {
        return WorldProviderSurface.lIIllIIlIIllIl[WorldProviderSurface.lIIllIIlIIlllI[1]];
    }
}
