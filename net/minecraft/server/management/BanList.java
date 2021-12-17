// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class BanList extends UserList<String, IPBanEntry>
{
    private static final /* synthetic */ String[] lllIIlllIIIIll;
    private static final /* synthetic */ int[] lllIIlllIIIlII;
    
    private static void lIlIIIIIlIlIIlII() {
        (lllIIlllIIIIll = new String[BanList.lllIIlllIIIlII[4]])[BanList.lllIIlllIIIlII[0]] = lIlIIIIIlIlIIIlI("7O90/Kmpvdk=", "pgUEx");
        BanList.lllIIlllIIIIll[BanList.lllIIlllIIIlII[2]] = lIlIIIIIlIlIIIlI("5hIGs/WGk4w=", "nsVTx");
    }
    
    public boolean isBanned(final SocketAddress llllllllllllIlIlllIlllIIIlIllllI) {
        final String llllllllllllIlIlllIlllIIIllIIIII = this.addressToString(llllllllllllIlIlllIlllIIIlIllllI);
        return ((UserList<String, V>)this).hasEntry(llllllllllllIlIlllIlllIIIllIIIII);
    }
    
    public BanList(final File llllllllllllIlIlllIlllIIIllIllII) {
        super(llllllllllllIlIlllIlllIIIllIllII);
    }
    
    private static boolean lIlIIIIIlIlIIllI(final int llllllllllllIlIlllIlllIIIIlllllI) {
        return llllllllllllIlIlllIlllIIIIlllllI != 0;
    }
    
    static {
        lIlIIIIIlIlIIlIl();
        lIlIIIIIlIlIIlII();
    }
    
    public IPBanEntry getBanEntry(final SocketAddress llllllllllllIlIlllIlllIIIlIlIlIl) {
        final String llllllllllllIlIlllIlllIIIlIlIlll = this.addressToString(llllllllllllIlIlllIlllIIIlIlIlIl);
        return this.getEntry(llllllllllllIlIlllIlllIIIlIlIlll);
    }
    
    @Override
    protected UserListEntry<String> createEntry(final JsonObject llllllllllllIlIlllIlllIIIllIIllI) {
        return new IPBanEntry(llllllllllllIlIlllIlllIIIllIIllI);
    }
    
    private static String lIlIIIIIlIlIIIlI(final String llllllllllllIlIlllIlllIIIlIIIIll, final String llllllllllllIlIlllIlllIIIlIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlllIIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlllIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIlllIIIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIlllIIIlIIIlll.init(BanList.lllIIlllIIIlII[4], llllllllllllIlIlllIlllIIIlIIlIII);
            return new String(llllllllllllIlIlllIlllIIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlllIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlllIIIlIIIllI) {
            llllllllllllIlIlllIlllIIIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIIIlIlIIlIl() {
        (lllIIlllIIIlII = new int[5])[0] = ((0xA4 ^ 0xBE) & ~(0x9C ^ 0x86));
        BanList.lllIIlllIIIlII[1] = (0xC8 ^ 0xC6 ^ (0xAD ^ 0x8C));
        BanList.lllIIlllIIIlII[2] = " ".length();
        BanList.lllIIlllIIIlII[3] = (0x19 ^ 0x73 ^ (0x14 ^ 0x44));
        BanList.lllIIlllIIIlII[4] = "  ".length();
    }
    
    private String addressToString(final SocketAddress llllllllllllIlIlllIlllIIIlIIlllI) {
        String llllllllllllIlIlllIlllIIIlIIllll = llllllllllllIlIlllIlllIIIlIIlllI.toString();
        if (lIlIIIIIlIlIIllI(llllllllllllIlIlllIlllIIIlIIllll.contains(BanList.lllIIlllIIIIll[BanList.lllIIlllIIIlII[0]]) ? 1 : 0)) {
            llllllllllllIlIlllIlllIIIlIIllll = llllllllllllIlIlllIlllIIIlIIllll.substring(llllllllllllIlIlllIlllIIIlIIllll.indexOf(BanList.lllIIlllIIIlII[1]) + BanList.lllIIlllIIIlII[2]);
        }
        if (lIlIIIIIlIlIIllI(llllllllllllIlIlllIlllIIIlIIllll.contains(BanList.lllIIlllIIIIll[BanList.lllIIlllIIIlII[2]]) ? 1 : 0)) {
            llllllllllllIlIlllIlllIIIlIIllll = llllllllllllIlIlllIlllIIIlIIllll.substring(BanList.lllIIlllIIIlII[0], llllllllllllIlIlllIlllIIIlIIllll.indexOf(BanList.lllIIlllIIIlII[3]));
        }
        return llllllllllllIlIlllIlllIIIlIIllll;
    }
}
