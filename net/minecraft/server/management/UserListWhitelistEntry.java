// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class UserListWhitelistEntry extends UserListEntry<GameProfile>
{
    private static final /* synthetic */ String[] lIIIIlllllIlIl;
    private static final /* synthetic */ int[] lIIIIlllllIllI;
    
    public UserListWhitelistEntry(final GameProfile lllllllllllllIlIIIlllIIllIlIIlII) {
        super(lllllllllllllIlIIIlllIIllIlIIlII);
    }
    
    private static void lIllllIlIlIlIII() {
        (lIIIIlllllIlIl = new String[UserListWhitelistEntry.lIIIIlllllIllI[7]])[UserListWhitelistEntry.lIIIIlllllIllI[0]] = lIllllIlIlIIlIl("HyUcIg==", "jPuFz");
        UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[1]] = lIllllIlIlIIllI("OnO5kFmWMZ0=", "uxPgl");
        UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[2]] = lIllllIlIlIIlIl("NAMMCQ==", "Zbalu");
        UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[3]] = lIllllIlIlIIllI("OwXtV6yVM3M=", "tbXot");
        UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[4]] = lIllllIlIlIIllI("7INXzfwhO0w=", "iFvbG");
        UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[5]] = lIllllIlIlIIlll("U8Jon20lWEI=", "waXWr");
        UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[6]] = lIllllIlIlIIllI("t1f8DD45Ja0=", "fmKvB");
    }
    
    private static GameProfile gameProfileFromJsonObject(final JsonObject lllllllllllllIlIIIlllIIllIIIlllI) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIlIl:[Ljava/lang/String;
        //     4: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIllI:[I
        //     7: iconst_3       
        //     8: iaload         
        //     9: aaload         
        //    10: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    13: invokestatic    net/minecraft/server/management/UserListWhitelistEntry.lIllllIlIlIllII:(I)Z
        //    16: ifeq            101
        //    19: aload_0         /* lllllllllllllIlIIIlllIIllIIlIIll */
        //    20: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIlIl:[Ljava/lang/String;
        //    23: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIllI:[I
        //    26: iconst_4       
        //    27: iaload         
        //    28: aaload         
        //    29: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    32: invokestatic    net/minecraft/server/management/UserListWhitelistEntry.lIllllIlIlIllII:(I)Z
        //    35: ifeq            101
        //    38: aload_0         /* lllllllllllllIlIIIlllIIllIIlIIll */
        //    39: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIlIl:[Ljava/lang/String;
        //    42: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIllI:[I
        //    45: iconst_5       
        //    46: iaload         
        //    47: aaload         
        //    48: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    51: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //    54: astore_1        /* lllllllllllllIlIIIlllIIllIIlIIlI */
        //    55: aload_1         /* lllllllllllllIlIIIlllIIllIIlIIlI */
        //    56: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //    59: astore_2        /* lllllllllllllIlIIIlllIIllIIlIIIl */
        //    60: ldc             ""
        //    62: invokevirtual   java/lang/String.length:()I
        //    65: pop            
        //    66: aconst_null    
        //    67: ifnull          75
        //    70: aconst_null    
        //    71: areturn        
        //    72: astore_3        /* lllllllllllllIlIIIlllIIllIIIlIll */
        //    73: aconst_null    
        //    74: areturn        
        //    75: new             Lcom/mojang/authlib/GameProfile;
        //    78: dup            
        //    79: aload_2         /* lllllllllllllIlIIIlllIIllIIlIIII */
        //    80: aload_0         /* lllllllllllllIlIIIlllIIllIIlIIll */
        //    81: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIlIl:[Ljava/lang/String;
        //    84: getstatic       net/minecraft/server/management/UserListWhitelistEntry.lIIIIlllllIllI:[I
        //    87: bipush          6
        //    89: iaload         
        //    90: aaload         
        //    91: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    94: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //    97: invokespecial   com/mojang/authlib/GameProfile.<init>:(Ljava/util/UUID;Ljava/lang/String;)V
        //   100: areturn        
        //   101: aconst_null    
        //   102: areturn        
        //    StackMapTable: 00 03 FF 00 48 00 02 07 00 4A 07 00 1C 00 01 07 00 48 FC 00 02 07 00 5E F9 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  55     60     72     75     Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        lIllllIlIlIlIIl();
        lIllllIlIlIlIII();
    }
    
    private static String lIllllIlIlIIlIl(String lllllllllllllIlIIIlllIIllIIIIIII, final String lllllllllllllIlIIIlllIIlIlllllll) {
        lllllllllllllIlIIIlllIIllIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlllIIllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlllIIlIllllllI = new StringBuilder();
        final char[] lllllllllllllIlIIIlllIIlIlllllIl = lllllllllllllIlIIIlllIIlIlllllll.toCharArray();
        int lllllllllllllIlIIIlllIIlIlllllII = UserListWhitelistEntry.lIIIIlllllIllI[0];
        final char lllllllllllllIlIIIlllIIlIlllIllI = (Object)lllllllllllllIlIIIlllIIllIIIIIII.toCharArray();
        final short lllllllllllllIlIIIlllIIlIlllIlIl = (short)lllllllllllllIlIIIlllIIlIlllIllI.length;
        byte lllllllllllllIlIIIlllIIlIlllIlII = (byte)UserListWhitelistEntry.lIIIIlllllIllI[0];
        while (lIllllIlIlIllIl(lllllllllllllIlIIIlllIIlIlllIlII, lllllllllllllIlIIIlllIIlIlllIlIl)) {
            final char lllllllllllllIlIIIlllIIllIIIIIIl = lllllllllllllIlIIIlllIIlIlllIllI[lllllllllllllIlIIIlllIIlIlllIlII];
            lllllllllllllIlIIIlllIIlIllllllI.append((char)(lllllllllllllIlIIIlllIIllIIIIIIl ^ lllllllllllllIlIIIlllIIlIlllllIl[lllllllllllllIlIIIlllIIlIlllllII % lllllllllllllIlIIIlllIIlIlllllIl.length]));
            "".length();
            ++lllllllllllllIlIIIlllIIlIlllllII;
            ++lllllllllllllIlIIIlllIIlIlllIlII;
            "".length();
            if ((128 + 8 + 13 + 4 ^ 97 + 89 - 49 + 20) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlllIIlIllllllI);
    }
    
    private static boolean lIllllIlIlIlIll(final Object lllllllllllllIlIIIlllIIlIlIlIIIl) {
        return lllllllllllllIlIIIlllIIlIlIlIIIl == null;
    }
    
    private static String lIllllIlIlIIllI(final String lllllllllllllIlIIIlllIIlIllIlIll, final String lllllllllllllIlIIIlllIIlIllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllIIlIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), UserListWhitelistEntry.lIIIIlllllIllI[8]), "DES");
            final Cipher lllllllllllllIlIIIlllIIlIllIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIlllIIlIllIllIl.init(UserListWhitelistEntry.lIIIIlllllIllI[2], lllllllllllllIlIIIlllIIlIllIlllI);
            return new String(lllllllllllllIlIIIlllIIlIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllIIlIllIllII) {
            lllllllllllllIlIIIlllIIlIllIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void onSerialization(final JsonObject lllllllllllllIlIIIlllIIllIIllIII) {
        if (lIllllIlIlIlIlI(((UserListEntry<Object>)this).getValue())) {
            final String s = UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[0]];
            String string;
            if (lIllllIlIlIlIll(this.getValue().getId())) {
                string = UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[1]];
                "".length();
                if (((0x9 ^ 0x2D ^ (0x5 ^ 0x6B)) & (0x59 ^ 0x12 ^ " ".length() ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                string = this.getValue().getId().toString();
            }
            lllllllllllllIlIIIlllIIllIIllIII.addProperty(s, string);
            lllllllllllllIlIIIlllIIllIIllIII.addProperty(UserListWhitelistEntry.lIIIIlllllIlIl[UserListWhitelistEntry.lIIIIlllllIllI[2]], this.getValue().getName());
            super.onSerialization(lllllllllllllIlIIIlllIIllIIllIII);
        }
    }
    
    private static void lIllllIlIlIlIIl() {
        (lIIIIlllllIllI = new int[9])[0] = ((98 + 37 + 29 + 17 ^ 120 + 54 - 44 + 56) & (13 + 16 + 109 + 6 ^ 83 + 102 - 67 + 41 ^ -" ".length()));
        UserListWhitelistEntry.lIIIIlllllIllI[1] = " ".length();
        UserListWhitelistEntry.lIIIIlllllIllI[2] = "  ".length();
        UserListWhitelistEntry.lIIIIlllllIllI[3] = "   ".length();
        UserListWhitelistEntry.lIIIIlllllIllI[4] = (0x7B ^ 0x7F);
        UserListWhitelistEntry.lIIIIlllllIllI[5] = (0x3B ^ 0x1E ^ (0x15 ^ 0x35));
        UserListWhitelistEntry.lIIIIlllllIllI[6] = (0xC6 ^ 0x92 ^ (0xC4 ^ 0x96));
        UserListWhitelistEntry.lIIIIlllllIllI[7] = (0xC7 ^ 0xB7 ^ (0x2A ^ 0x5D));
        UserListWhitelistEntry.lIIIIlllllIllI[8] = (0x45 ^ 0x4D);
    }
    
    private static String lIllllIlIlIIlll(final String lllllllllllllIlIIIlllIIlIlIllllI, final String lllllllllllllIlIIIlllIIlIlIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllIIlIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllIIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlllIIlIllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlllIIlIllIIIII.init(UserListWhitelistEntry.lIIIIlllllIllI[2], lllllllllllllIlIIIlllIIlIllIIIIl);
            return new String(lllllllllllllIlIIIlllIIlIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllIIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllIIlIlIlllll) {
            lllllllllllllIlIIIlllIIlIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllIlIlIllII(final int lllllllllllllIlIIIlllIIlIlIIllll) {
        return lllllllllllllIlIIIlllIIlIlIIllll != 0;
    }
    
    public UserListWhitelistEntry(final JsonObject lllllllllllllIlIIIlllIIllIIllllI) {
        super(gameProfileFromJsonObject(lllllllllllllIlIIIlllIIllIIllllI), lllllllllllllIlIIIlllIIllIIllllI);
    }
    
    private static boolean lIllllIlIlIllIl(final int lllllllllllllIlIIIlllIIlIlIlIllI, final int lllllllllllllIlIIIlllIIlIlIlIlIl) {
        return lllllllllllllIlIIIlllIIlIlIlIllI < lllllllllllllIlIIIlllIIlIlIlIlIl;
    }
    
    private static boolean lIllllIlIlIlIlI(final Object lllllllllllllIlIIIlllIIlIlIlIIll) {
        return lllllllllllllIlIIIlllIIlIlIlIIll != null;
    }
}
