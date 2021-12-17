// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Arrays;
import com.google.common.collect.Maps;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;
import com.mojang.util.UUIDTypeAdapter;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Session
{
    private final /* synthetic */ String token;
    private static final /* synthetic */ String[] lIIIIIIllIIllI;
    private final /* synthetic */ Type sessionType;
    private final /* synthetic */ String playerID;
    private final /* synthetic */ String username;
    private static final /* synthetic */ int[] lIIIIIIllIlIlI;
    
    public String getToken() {
        return this.token;
    }
    
    public Type getSessionType() {
        return this.sessionType;
    }
    
    public String getSessionID() {
        return String.valueOf(new StringBuilder(Session.lIIIIIIllIIllI[Session.lIIIIIIllIlIlI[0]]).append(this.token).append(Session.lIIIIIIllIIllI[Session.lIIIIIIllIlIlI[1]]).append(this.playerID));
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPlayerID() {
        return this.playerID;
    }
    
    private static void lIllIlIIlIlllll() {
        (lIIIIIIllIlIlI = new int[3])[0] = ((0x8 ^ 0x33 ^ (0x13 ^ 0x23)) & (0x35 ^ 0x5D ^ (0xFF ^ 0x9C) ^ -" ".length()));
        Session.lIIIIIIllIlIlI[1] = " ".length();
        Session.lIIIIIIllIlIlI[2] = "  ".length();
    }
    
    public Session(final String lllllllllllllIlIlIIIIIlIIIlIIIll, final String lllllllllllllIlIlIIIIIlIIIIllIlI, final String lllllllllllllIlIlIIIIIlIIIIlllll, final String lllllllllllllIlIlIIIIIlIIIIllllI) {
        this.username = lllllllllllllIlIlIIIIIlIIIlIIIll;
        this.playerID = lllllllllllllIlIlIIIIIlIIIIllIlI;
        this.token = lllllllllllllIlIlIIIIIlIIIIlllll;
        this.sessionType = Type.setSessionType(lllllllllllllIlIlIIIIIlIIIIllllI);
    }
    
    static {
        lIllIlIIlIlllll();
        lIllIlIIlIllIll();
    }
    
    private static boolean lIllIlIIllIIIII(final int lllllllllllllIlIlIIIIIIlllIIIlll, final int lllllllllllllIlIlIIIIIIlllIIIllI) {
        return lllllllllllllIlIlIIIIIIlllIIIlll < lllllllllllllIlIlIIIIIIlllIIIllI;
    }
    
    private static String lIllIlIIlIllIlI(String lllllllllllllIlIlIIIIIIlllIlIIlI, final String lllllllllllllIlIlIIIIIIlllIlIIIl) {
        lllllllllllllIlIlIIIIIIlllIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIIIlllIlIlIl = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIIIlllIlIlII = lllllllllllllIlIlIIIIIIlllIlIIIl.toCharArray();
        int lllllllllllllIlIlIIIIIIlllIlIIll = Session.lIIIIIIllIlIlI[0];
        final boolean lllllllllllllIlIlIIIIIIlllIIllIl = (Object)lllllllllllllIlIlIIIIIIlllIlIIlI.toCharArray();
        final Exception lllllllllllllIlIlIIIIIIlllIIllII = (Exception)lllllllllllllIlIlIIIIIIlllIIllIl.length;
        int lllllllllllllIlIlIIIIIIlllIIlIll = Session.lIIIIIIllIlIlI[0];
        while (lIllIlIIllIIIII(lllllllllllllIlIlIIIIIIlllIIlIll, (int)lllllllllllllIlIlIIIIIIlllIIllII)) {
            final char lllllllllllllIlIlIIIIIIlllIllIlI = lllllllllllllIlIlIIIIIIlllIIllIl[lllllllllllllIlIlIIIIIIlllIIlIll];
            lllllllllllllIlIlIIIIIIlllIlIlIl.append((char)(lllllllllllllIlIlIIIIIIlllIllIlI ^ lllllllllllllIlIlIIIIIIlllIlIlII[lllllllllllllIlIlIIIIIIlllIlIIll % lllllllllllllIlIlIIIIIIlllIlIlII.length]));
            "".length();
            ++lllllllllllllIlIlIIIIIIlllIlIIll;
            ++lllllllllllllIlIlIIIIIIlllIIlIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIIIlllIlIlIl);
    }
    
    public GameProfile getProfile() {
        try {
            final UUID lllllllllllllIlIlIIIIIIlllllIllI = UUIDTypeAdapter.fromString(this.getPlayerID());
            return new GameProfile(lllllllllllllIlIlIIIIIIlllllIllI, this.getUsername());
        }
        catch (IllegalArgumentException lllllllllllllIlIlIIIIIIlllllIlIl) {
            return new GameProfile((UUID)null, this.getUsername());
        }
    }
    
    private static void lIllIlIIlIllIll() {
        (lIIIIIIllIIllI = new String[Session.lIIIIIIllIlIlI[2]])[Session.lIIIIIIllIlIlI[0]] = lIllIlIIlIllIlI("HCMpAjxS", "hLBgR");
        Session.lIIIIIIllIIllI[Session.lIIIIIIllIlIlI[1]] = lIllIlIIlIllIlI("Xw==", "etrtK");
    }
    
    public enum Type
    {
        private static final /* synthetic */ String[] llIllllIlIlIlI;
        
        LEGACY(Type.llIllllIlIlIlI[Type.llIllllIlllIII[0]], Type.llIllllIlllIII[0], Type.llIllllIlIlIlI[Type.llIllllIlllIII[1]]);
        
        private static final /* synthetic */ Map<String, Type> SESSION_TYPES;
        private final /* synthetic */ String sessionType;
        
        MOJANG(Type.llIllllIlIlIlI[Type.llIllllIlllIII[2]], Type.llIllllIlllIII[1], Type.llIllllIlIlIlI[Type.llIllllIlllIII[3]]);
        
        private static final /* synthetic */ int[] llIllllIlllIII;
        
        private Type(final String llllllllllllIllIIIllIlIIlIlIIIII, final int llllllllllllIllIIIllIlIIlIIlllll, final String llllllllllllIllIIIllIlIIlIlIIIlI) {
            this.sessionType = llllllllllllIllIIIllIlIIlIlIIIlI;
        }
        
        private static String lIIllIlIlIllIllI(final String llllllllllllIllIIIllIlIIIlllllII, final String llllllllllllIllIIIllIlIIIlllllIl) {
            try {
                final SecretKeySpec llllllllllllIllIIIllIlIIlIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIlIIIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIllIlIIlIIIIIII = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIllIlIIlIIIIIII.init(Type.llIllllIlllIII[2], llllllllllllIllIIIllIlIIlIIIIIIl);
                return new String(llllllllllllIllIIIllIlIIlIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIlIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIllIlIIIlllllll) {
                llllllllllllIllIIIllIlIIIlllllll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIllIlIllIlIlII(final int llllllllllllIllIIIllIlIIIlllIllI, final int llllllllllllIllIIIllIlIIIlllIlIl) {
            return llllllllllllIllIIIllIlIIIlllIllI >= llllllllllllIllIIIllIlIIIlllIlIl;
        }
        
        private static void lIIllIlIlIlllIlI() {
            (llIllllIlIlIlI = new String[Type.llIllllIlllIII[4]])[Type.llIllllIlllIII[0]] = lIIllIlIlIllIllI("cAXgU2/KnNc=", "QjgYA");
            Type.llIllllIlIlIlI[Type.llIllllIlllIII[1]] = lIIllIlIlIllIllI("QT2LtnQjGxg=", "etKeP");
            Type.llIllllIlIlIlI[Type.llIllllIlllIII[2]] = lIIllIlIlIllIllI("5/Y80A3l3TA=", "qauqs");
            Type.llIllllIlIlIlI[Type.llIllllIlllIII[3]] = lIIllIlIlIlllIIl("C3QLH0ejqKw=", "PJvDD");
        }
        
        private static void lIIllIlIllIlIIll() {
            (llIllllIlllIII = new int[6])[0] = ((0x30 ^ 0x13) & ~(0x45 ^ 0x66));
            Type.llIllllIlllIII[1] = " ".length();
            Type.llIllllIlllIII[2] = "  ".length();
            Type.llIllllIlllIII[3] = "   ".length();
            Type.llIllllIlllIII[4] = (0x11 ^ 0x65 ^ (0xE4 ^ 0x94));
            Type.llIllllIlllIII[5] = (0x6F ^ 0x67);
        }
        
        public static Type setSessionType(final String llllllllllllIllIIIllIlIIlIIllIll) {
            return Type.SESSION_TYPES.get(llllllllllllIllIIIllIlIIlIIllIll.toLowerCase());
        }
        
        static {
            lIIllIlIllIlIIll();
            lIIllIlIlIlllIlI();
            final Type[] enum$VALUES = new Type[Type.llIllllIlllIII[2]];
            enum$VALUES[Type.llIllllIlllIII[0]] = Type.LEGACY;
            enum$VALUES[Type.llIllllIlllIII[1]] = Type.MOJANG;
            ENUM$VALUES = enum$VALUES;
            SESSION_TYPES = Maps.newHashMap();
            final String llllllllllllIllIIIllIlIIlIlIlIII;
            final boolean llllllllllllIllIIIllIlIIlIlIlIIl = ((Type[])(Object)(llllllllllllIllIIIllIlIIlIlIlIII = (String)(Object)values())).length != 0;
            byte llllllllllllIllIIIllIlIIlIlIlIlI = (byte)Type.llIllllIlllIII[0];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
            while (!lIIllIlIllIlIlII(llllllllllllIllIIIllIlIIlIlIlIlI, llllllllllllIllIIIllIlIIlIlIlIIl ? 1 : 0)) {
                final Type llllllllllllIllIIIllIlIIlIlIllII = llllllllllllIllIIIllIlIIlIlIlIII[llllllllllllIllIIIllIlIIlIlIlIlI];
                Type.SESSION_TYPES.put(llllllllllllIllIIIllIlIIlIlIllII.sessionType, llllllllllllIllIIIllIlIIlIlIllII);
                "".length();
                ++llllllllllllIllIIIllIlIIlIlIlIlI;
            }
        }
        
        private static String lIIllIlIlIlllIIl(final String llllllllllllIllIIIllIlIIlIIIlIll, final String llllllllllllIllIIIllIlIIlIIIlIII) {
            try {
                final SecretKeySpec llllllllllllIllIIIllIlIIlIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIlIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), Type.llIllllIlllIII[5]), "DES");
                final Cipher llllllllllllIllIIIllIlIIlIIIllIl = Cipher.getInstance("DES");
                llllllllllllIllIIIllIlIIlIIIllIl.init(Type.llIllllIlllIII[2], llllllllllllIllIIIllIlIIlIIIlllI);
                return new String(llllllllllllIllIIIllIlIIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIlIIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIllIlIIlIIIllII) {
                llllllllllllIllIIIllIlIIlIIIllII.printStackTrace();
                return null;
            }
        }
    }
}
