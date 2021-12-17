// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import com.google.gson.JsonObject;
import java.util.Date;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.mojang.authlib.GameProfile;

public class UserListBansEntry extends BanEntry<GameProfile>
{
    private static final /* synthetic */ String[] llIIIIllIlIIII;
    private static final /* synthetic */ int[] llIIIlIIlIlIlI;
    
    private static boolean lIIIlIIlIIIIIllI(final Object llllllllllllIlllIllIIIIIIIIllIIl) {
        return llllllllllllIlllIllIIIIIIIIllIIl != null;
    }
    
    private static String lIIIlIIIIIllIlII(final String llllllllllllIlllIllIIIIIIIlIllIl, final String llllllllllllIlllIllIIIIIIIlIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIIIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIIIIIIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIIIIIIlIllll.init(UserListBansEntry.llIIIlIIlIlIlI[2], llllllllllllIlllIllIIIIIIIllIIII);
            return new String(llllllllllllIlllIllIIIIIIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIIIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIIIIIlIlllI) {
            llllllllllllIlllIllIIIIIIIlIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIlIIIIlIII(final int llllllllllllIlllIllIIIIIIIIlIlIl) {
        return llllllllllllIlllIllIIIIIIIIlIlIl != 0;
    }
    
    private static void lIIIlIIlIIIIIlIl() {
        (llIIIlIIlIlIlI = new int[9])[0] = ((0xC2 ^ 0x92) & ~(0x46 ^ 0x16));
        UserListBansEntry.llIIIlIIlIlIlI[1] = " ".length();
        UserListBansEntry.llIIIlIIlIlIlI[2] = "  ".length();
        UserListBansEntry.llIIIlIIlIlIlI[3] = "   ".length();
        UserListBansEntry.llIIIlIIlIlIlI[4] = (0xA5 ^ 0xA1);
        UserListBansEntry.llIIIlIIlIlIlI[5] = (181 + 66 - 113 + 49 ^ 115 + 162 - 101 + 2);
        UserListBansEntry.llIIIlIIlIlIlI[6] = (0x5A ^ 0x5C);
        UserListBansEntry.llIIIlIIlIlIlI[7] = (0x3F ^ 0x38);
        UserListBansEntry.llIIIlIIlIlIlI[8] = (0xA0 ^ 0xA8);
    }
    
    private static void lIIIlIIIIIlllIII() {
        (llIIIIllIlIIII = new String[UserListBansEntry.llIIIlIIlIlIlI[7]])[UserListBansEntry.llIIIlIIlIlIlI[0]] = lIIIlIIIIIllIIll("GGxXH8rNJ/E=", "UmpNM");
        UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[1]] = lIIIlIIIIIllIIll("excHzZDhCEo=", "RIwee");
        UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[2]] = lIIIlIIIIIllIIll("GBgoE18nYKo=", "dVsoA");
        UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[3]] = lIIIlIIIIIllIlII("h6OHI6J0gPA=", "bsgcF");
        UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[4]] = lIIIlIIIIIllIIll("dJNZp/X0HnU=", "jGSDX");
        UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[5]] = lIIIlIIIIIllIlII("J3rcr5XG758=", "ROFJG");
        UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[6]] = lIIIlIIIIIllIIll("KMRpXw2ZEV0=", "cTmtV");
    }
    
    private static String lIIIlIIIIIllIIll(final String llllllllllllIlllIllIIIIIIIlIIIII, final String llllllllllllIlllIllIIIIIIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIIIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), UserListBansEntry.llIIIlIIlIlIlI[8]), "DES");
            final Cipher llllllllllllIlllIllIIIIIIIlIIIlI = Cipher.getInstance("DES");
            llllllllllllIlllIllIIIIIIIlIIIlI.init(UserListBansEntry.llIIIlIIlIlIlI[2], llllllllllllIlllIllIIIIIIIlIIIll);
            return new String(llllllllllllIlllIllIIIIIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIIIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIIIIIlIIIIl) {
            llllllllllllIlllIllIIIIIIIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    public UserListBansEntry(final GameProfile llllllllllllIlllIllIIIIIIlIlIIIl, final Date llllllllllllIlllIllIIIIIIlIlIllI, final String llllllllllllIlllIllIIIIIIlIlIlIl, final Date llllllllllllIlllIllIIIIIIlIIllll, final String llllllllllllIlllIllIIIIIIlIlIIll) {
        super(llllllllllllIlllIllIIIIIIlIlIIIl, llllllllllllIlllIllIIIIIIlIIllll, llllllllllllIlllIllIIIIIIlIlIlIl, llllllllllllIlllIllIIIIIIlIIllll, llllllllllllIlllIllIIIIIIlIlIIll);
    }
    
    private static GameProfile func_152648_b(final JsonObject llllllllllllIlllIllIIIIIIIllllIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIIllIlIIII:[Ljava/lang/String;
        //     4: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIlIIlIlIlI:[I
        //     7: iconst_3       
        //     8: iaload         
        //     9: aaload         
        //    10: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    13: invokestatic    net/minecraft/server/management/UserListBansEntry.lIIIlIIlIIIIlIII:(I)Z
        //    16: ifeq            101
        //    19: aload_0         /* llllllllllllIlllIllIIIIIIIlllIII */
        //    20: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIIllIlIIII:[Ljava/lang/String;
        //    23: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIlIIlIlIlI:[I
        //    26: iconst_4       
        //    27: iaload         
        //    28: aaload         
        //    29: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    32: invokestatic    net/minecraft/server/management/UserListBansEntry.lIIIlIIlIIIIlIII:(I)Z
        //    35: ifeq            101
        //    38: aload_0         /* llllllllllllIlllIllIIIIIIIlllIII */
        //    39: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIIllIlIIII:[Ljava/lang/String;
        //    42: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIlIIlIlIlI:[I
        //    45: iconst_5       
        //    46: iaload         
        //    47: aaload         
        //    48: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    51: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //    54: astore_1        /* llllllllllllIlllIllIIIIIIIllllII */
        //    55: aload_1         /* llllllllllllIlllIllIIIIIIIllllII */
        //    56: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //    59: astore_2        /* llllllllllllIlllIllIIIIIIIlllIll */
        //    60: ldc             ""
        //    62: invokevirtual   java/lang/String.length:()I
        //    65: pop            
        //    66: aconst_null    
        //    67: ifnull          75
        //    70: aconst_null    
        //    71: areturn        
        //    72: astore_3        /* llllllllllllIlllIllIIIIIIIllIlIl */
        //    73: aconst_null    
        //    74: areturn        
        //    75: new             Lcom/mojang/authlib/GameProfile;
        //    78: dup            
        //    79: aload_2         /* llllllllllllIlllIllIIIIIIIlllIlI */
        //    80: aload_0         /* llllllllllllIlllIllIIIIIIIlllIII */
        //    81: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIIllIlIIII:[Ljava/lang/String;
        //    84: getstatic       net/minecraft/server/management/UserListBansEntry.llIIIlIIlIlIlI:[I
        //    87: bipush          6
        //    89: iaload         
        //    90: aaload         
        //    91: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    94: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //    97: invokespecial   com/mojang/authlib/GameProfile.<init>:(Ljava/util/UUID;Ljava/lang/String;)V
        //   100: areturn        
        //   101: aconst_null    
        //   102: areturn        
        //    StackMapTable: 00 03 FF 00 48 00 02 07 00 BF 07 00 23 00 01 07 00 BD FC 00 02 07 00 D1 F9 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  55     60     72     75     Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        lIIIlIIlIIIIIlIl();
        lIIIlIIIIIlllIII();
    }
    
    @Override
    protected void onSerialization(final JsonObject llllllllllllIlllIllIIIIIIlIIIlII) {
        if (lIIIlIIlIIIIIllI(((UserListEntry<Object>)this).getValue())) {
            final String s = UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[0]];
            String string;
            if (lIIIlIIlIIIIIlll(this.getValue().getId())) {
                string = UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[1]];
                "".length();
                if (" ".length() == ((0xAF ^ 0x84) & ~(0x99 ^ 0xB2))) {
                    return;
                }
            }
            else {
                string = this.getValue().getId().toString();
            }
            llllllllllllIlllIllIIIIIIlIIIlII.addProperty(s, string);
            llllllllllllIlllIllIIIIIIlIIIlII.addProperty(UserListBansEntry.llIIIIllIlIIII[UserListBansEntry.llIIIlIIlIlIlI[2]], this.getValue().getName());
            super.onSerialization(llllllllllllIlllIllIIIIIIlIIIlII);
        }
    }
    
    public UserListBansEntry(final JsonObject llllllllllllIlllIllIIIIIIlIIlIII) {
        super(func_152648_b(llllllllllllIlllIllIIIIIIlIIlIII), llllllllllllIlllIllIIIIIIlIIlIII);
    }
    
    public UserListBansEntry(final GameProfile llllllllllllIlllIllIIIIIIlIllllI) {
        this(llllllllllllIlllIllIIIIIIlIllllI, null, null, null, null);
    }
    
    private static boolean lIIIlIIlIIIIIlll(final Object llllllllllllIlllIllIIIIIIIIlIlll) {
        return llllllllllllIlllIllIIIIIIIIlIlll == null;
    }
}
