// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatUserInfo;

public interface IStream
{
    void updateStreamVolume();
    
    boolean isPaused();
    
    boolean func_152936_l();
    
    void stopBroadcasting();
    
    ChatUserInfo func_152926_a(final String p0);
    
    boolean isBroadcasting();
    
    boolean func_152929_G();
    
    void unpause();
    
    IngestServerTester func_152932_y();
    
    void pause();
    
    boolean func_152908_z();
    
    void requestCommercial();
    
    void func_152917_b(final String p0);
    
    boolean func_152913_F();
    
    boolean isReadyToBroadcast();
    
    ErrorCode func_152912_E();
    
    void muteMicrophone(final boolean p0);
    
    String func_152921_C();
    
    void shutdownStream();
    
    int func_152920_A();
    
    void func_152935_j();
    
    boolean func_152927_B();
    
    boolean func_152928_D();
    
    void func_152930_t();
    
    void func_176026_a(final Metadata p0, final long p1, final long p2);
    
    void func_152922_k();
    
    IngestServer[] func_152925_v();
    
    AuthFailureReason func_152918_H();
    
    void func_152909_x();
    
    void func_152911_a(final Metadata p0, final long p1);
    
    public enum AuthFailureReason
    {
        ERROR(AuthFailureReason.lIIlllIlllIIII[AuthFailureReason.lIIlllIlllIIIl[0]], AuthFailureReason.lIIlllIlllIIIl[0]);
        
        private static final /* synthetic */ String[] lIIlllIlllIIII;
        
        INVALID_TOKEN(AuthFailureReason.lIIlllIlllIIII[AuthFailureReason.lIIlllIlllIIIl[1]], AuthFailureReason.lIIlllIlllIIIl[1]);
        
        private static final /* synthetic */ int[] lIIlllIlllIIIl;
        
        private AuthFailureReason(final String lllllllllllllIIlIIllIllllIlIlIlI, final int lllllllllllllIIlIIllIllllIlIlIIl) {
        }
        
        private static String llIlllIIIIllIll(final String lllllllllllllIIlIIllIlllIlllllll, final String lllllllllllllIIlIIllIllllIIIIIII) {
            try {
                final SecretKeySpec lllllllllllllIIlIIllIllllIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIllllIIIIIII.getBytes(StandardCharsets.UTF_8)), AuthFailureReason.lIIlllIlllIIIl[3]), "DES");
                final Cipher lllllllllllllIIlIIllIllllIIIIIll = Cipher.getInstance("DES");
                lllllllllllllIIlIIllIllllIIIIIll.init(AuthFailureReason.lIIlllIlllIIIl[2], lllllllllllllIIlIIllIllllIIIIlII);
                return new String(lllllllllllllIIlIIllIllllIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIllIllllIIIIIlI) {
                lllllllllllllIIlIIllIllllIIIIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void llIlllIIIIllllI() {
            (lIIlllIlllIIIl = new int[4])[0] = ((161 + 142 - 266 + 215 ^ 55 + 91 - 59 + 78) & (0xF9 ^ 0xA5 ^ (0x24 ^ 0x21) ^ -" ".length()));
            AuthFailureReason.lIIlllIlllIIIl[1] = " ".length();
            AuthFailureReason.lIIlllIlllIIIl[2] = "  ".length();
            AuthFailureReason.lIIlllIlllIIIl[3] = (0x7F ^ 0x77);
        }
        
        private static void llIlllIIIIlllIl() {
            (lIIlllIlllIIII = new String[AuthFailureReason.lIIlllIlllIIIl[2]])[AuthFailureReason.lIIlllIlllIIIl[0]] = llIlllIIIIllIll("QT4X0Qx3r04=", "cFgMx");
            AuthFailureReason.lIIlllIlllIIII[AuthFailureReason.lIIlllIlllIIIl[1]] = llIlllIIIIlllII("MR89CTkxFTQcOjMUJQ==", "xQkHu");
        }
        
        private static String llIlllIIIIlllII(String lllllllllllllIIlIIllIllllIIlIIIl, final String lllllllllllllIIlIIllIllllIIlIlIl) {
            lllllllllllllIIlIIllIllllIIlIIIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIllIllllIIlIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIllIllllIIlIlII = new StringBuilder();
            final char[] lllllllllllllIIlIIllIllllIIlIIll = lllllllllllllIIlIIllIllllIIlIlIl.toCharArray();
            int lllllllllllllIIlIIllIllllIIlIIlI = AuthFailureReason.lIIlllIlllIIIl[0];
            final char lllllllllllllIIlIIllIllllIIIllII = (Object)((String)lllllllllllllIIlIIllIllllIIlIIIl).toCharArray();
            final String lllllllllllllIIlIIllIllllIIIlIll = (String)lllllllllllllIIlIIllIllllIIIllII.length;
            byte lllllllllllllIIlIIllIllllIIIlIlI = (byte)AuthFailureReason.lIIlllIlllIIIl[0];
            while (llIlllIIIIlllll(lllllllllllllIIlIIllIllllIIIlIlI, (int)lllllllllllllIIlIIllIllllIIIlIll)) {
                final char lllllllllllllIIlIIllIllllIIlIlll = lllllllllllllIIlIIllIllllIIIllII[lllllllllllllIIlIIllIllllIIIlIlI];
                lllllllllllllIIlIIllIllllIIlIlII.append((char)(lllllllllllllIIlIIllIllllIIlIlll ^ lllllllllllllIIlIIllIllllIIlIIll[lllllllllllllIIlIIllIllllIIlIIlI % lllllllllllllIIlIIllIllllIIlIIll.length]));
                "".length();
                ++lllllllllllllIIlIIllIllllIIlIIlI;
                ++lllllllllllllIIlIIllIllllIIIlIlI;
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIllIllllIIlIlII);
        }
        
        static {
            llIlllIIIIllllI();
            llIlllIIIIlllIl();
            final AuthFailureReason[] enum$VALUES = new AuthFailureReason[AuthFailureReason.lIIlllIlllIIIl[2]];
            enum$VALUES[AuthFailureReason.lIIlllIlllIIIl[0]] = AuthFailureReason.ERROR;
            enum$VALUES[AuthFailureReason.lIIlllIlllIIIl[1]] = AuthFailureReason.INVALID_TOKEN;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean llIlllIIIIlllll(final int lllllllllllllIIlIIllIlllIllllIIl, final int lllllllllllllIIlIIllIlllIllllIII) {
            return lllllllllllllIIlIIllIlllIllllIIl < lllllllllllllIIlIIllIlllIllllIII;
        }
    }
}
