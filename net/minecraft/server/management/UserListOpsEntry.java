// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class UserListOpsEntry extends UserListEntry<GameProfile>
{
    private static final /* synthetic */ String[] lllIIIIIlIIIIl;
    private final /* synthetic */ boolean field_183025_b;
    private final /* synthetic */ int field_152645_a;
    private static final /* synthetic */ int[] lllIIIIIlIIIll;
    
    private static boolean lIIlllIIIIIllIIl(final Object llllllllllllIllIIIIlllllIIllIlII) {
        return llllllllllllIllIIIIlllllIIllIlII == null;
    }
    
    public UserListOpsEntry(final GameProfile llllllllllllIllIIIIllllllIIlIIll, final int llllllllllllIllIIIIllllllIIIlllI, final boolean llllllllllllIllIIIIllllllIIlIIIl) {
        super(llllllllllllIllIIIIllllllIIlIIll);
        this.field_152645_a = llllllllllllIllIIIIllllllIIIlllI;
        this.field_183025_b = llllllllllllIllIIIIllllllIIlIIIl;
    }
    
    private static boolean lIIlllIIIIIllIII(final Object llllllllllllIllIIIIlllllIIllIllI) {
        return llllllllllllIllIIIIlllllIIllIllI != null;
    }
    
    private static GameProfile func_152643_b(final JsonObject llllllllllllIllIIIIlllllIlllIIIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIIl:[Ljava/lang/String;
        //     4: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIll:[I
        //     7: bipush          9
        //     9: iaload         
        //    10: aaload         
        //    11: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    14: invokestatic    net/minecraft/server/management/UserListOpsEntry.lIIlllIIIIIlIlll:(I)Z
        //    17: ifeq            109
        //    20: aload_0         /* llllllllllllIllIIIIlllllIlllIllI */
        //    21: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIIl:[Ljava/lang/String;
        //    24: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIll:[I
        //    27: bipush          10
        //    29: iaload         
        //    30: aaload         
        //    31: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    34: invokestatic    net/minecraft/server/management/UserListOpsEntry.lIIlllIIIIIlIlll:(I)Z
        //    37: ifeq            109
        //    40: aload_0         /* llllllllllllIllIIIIlllllIlllIllI */
        //    41: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIIl:[Ljava/lang/String;
        //    44: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIll:[I
        //    47: bipush          11
        //    49: iaload         
        //    50: aaload         
        //    51: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    54: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //    57: astore_1        /* llllllllllllIllIIIIlllllIlllIlIl */
        //    58: aload_1         /* llllllllllllIllIIIIlllllIlllIlIl */
        //    59: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //    62: astore_2        /* llllllllllllIllIIIIlllllIlllIlII */
        //    63: ldc             ""
        //    65: invokevirtual   java/lang/String.length:()I
        //    68: pop            
        //    69: ldc             " "
        //    71: invokevirtual   java/lang/String.length:()I
        //    74: ineg           
        //    75: ifle            83
        //    78: aconst_null    
        //    79: areturn        
        //    80: astore_3        /* llllllllllllIllIIIIlllllIllIlllI */
        //    81: aconst_null    
        //    82: areturn        
        //    83: new             Lcom/mojang/authlib/GameProfile;
        //    86: dup            
        //    87: aload_2         /* llllllllllllIllIIIIlllllIlllIIll */
        //    88: aload_0         /* llllllllllllIllIIIIlllllIlllIllI */
        //    89: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIIl:[Ljava/lang/String;
        //    92: getstatic       net/minecraft/server/management/UserListOpsEntry.lllIIIIIlIIIll:[I
        //    95: bipush          12
        //    97: iaload         
        //    98: aaload         
        //    99: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   102: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   105: invokespecial   com/mojang/authlib/GameProfile.<init>:(Ljava/util/UUID;Ljava/lang/String;)V
        //   108: areturn        
        //   109: aconst_null    
        //   110: areturn        
        //    StackMapTable: 00 03 FF 00 50 00 02 07 00 32 07 00 4E 00 01 07 00 2C FC 00 02 07 00 46 F9 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  58     63     80     83     Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        lIIlllIIIIIlIllI();
        lIIlllIIIIIIllll();
    }
    
    public UserListOpsEntry(final JsonObject llllllllllllIllIIIIllllllIIIIlll) {
        super(func_152643_b(llllllllllllIllIIIIllllllIIIIlll), llllllllllllIllIIIIllllllIIIIlll);
        int asInt;
        if (lIIlllIIIIIlIlll(llllllllllllIllIIIIllllllIIIIlll.has(UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[0]]) ? 1 : 0)) {
            asInt = llllllllllllIllIIIIllllllIIIIlll.get(UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[1]]).getAsInt();
            "".length();
            if (-" ".length() > 0) {
                throw null;
            }
        }
        else {
            asInt = UserListOpsEntry.lllIIIIIlIIIll[0];
        }
        this.field_152645_a = asInt;
        int field_183025_b;
        if (lIIlllIIIIIlIlll(llllllllllllIllIIIIllllllIIIIlll.has(UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[2]]) ? 1 : 0) && lIIlllIIIIIlIlll(llllllllllllIllIIIIllllllIIIIlll.get(UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[3]]).getAsBoolean() ? 1 : 0)) {
            field_183025_b = UserListOpsEntry.lllIIIIIlIIIll[1];
            "".length();
            if (-" ".length() == "  ".length()) {
                throw null;
            }
        }
        else {
            field_183025_b = UserListOpsEntry.lllIIIIIlIIIll[0];
        }
        this.field_183025_b = (field_183025_b != 0);
    }
    
    private static String lIIlllIIIIIIlllI(final String llllllllllllIllIIIIlllllIllIIllI, final String llllllllllllIllIIIIlllllIllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlllllIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlllllIllIIlIl.getBytes(StandardCharsets.UTF_8)), UserListOpsEntry.lllIIIIIlIIIll[8]), "DES");
            final Cipher llllllllllllIllIIIIlllllIllIlIII = Cipher.getInstance("DES");
            llllllllllllIllIIIIlllllIllIlIII.init(UserListOpsEntry.lllIIIIIlIIIll[2], llllllllllllIllIIIIlllllIllIlIIl);
            return new String(llllllllllllIllIIIIlllllIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlllllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlllllIllIIlll) {
            llllllllllllIllIIIIlllllIllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllIIIIIIllII(String llllllllllllIllIIIIlllllIlIlIIIl, final String llllllllllllIllIIIIlllllIlIlIlIl) {
        llllllllllllIllIIIIlllllIlIlIIIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIlllllIlIlIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlllllIlIlIlII = new StringBuilder();
        final char[] llllllllllllIllIIIIlllllIlIlIIll = llllllllllllIllIIIIlllllIlIlIlIl.toCharArray();
        int llllllllllllIllIIIIlllllIlIlIIlI = UserListOpsEntry.lllIIIIIlIIIll[0];
        final double llllllllllllIllIIIIlllllIlIIllII = (Object)((String)llllllllllllIllIIIIlllllIlIlIIIl).toCharArray();
        final Exception llllllllllllIllIIIIlllllIlIIlIll = (Exception)llllllllllllIllIIIIlllllIlIIllII.length;
        boolean llllllllllllIllIIIIlllllIlIIlIlI = UserListOpsEntry.lllIIIIIlIIIll[0] != 0;
        while (lIIlllIIIIIllIlI(llllllllllllIllIIIIlllllIlIIlIlI ? 1 : 0, (int)llllllllllllIllIIIIlllllIlIIlIll)) {
            final char llllllllllllIllIIIIlllllIlIlIlll = llllllllllllIllIIIIlllllIlIIllII[llllllllllllIllIIIIlllllIlIIlIlI];
            llllllllllllIllIIIIlllllIlIlIlII.append((char)(llllllllllllIllIIIIlllllIlIlIlll ^ llllllllllllIllIIIIlllllIlIlIIll[llllllllllllIllIIIIlllllIlIlIIlI % llllllllllllIllIIIIlllllIlIlIIll.length]));
            "".length();
            ++llllllllllllIllIIIIlllllIlIlIIlI;
            ++llllllllllllIllIIIIlllllIlIIlIlI;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlllllIlIlIlII);
    }
    
    private static boolean lIIlllIIIIIllIlI(final int llllllllllllIllIIIIlllllIIlllIIl, final int llllllllllllIllIIIIlllllIIlllIII) {
        return llllllllllllIllIIIIlllllIIlllIIl < llllllllllllIllIIIIlllllIIlllIII;
    }
    
    public boolean func_183024_b() {
        return this.field_183025_b;
    }
    
    @Override
    protected void onSerialization(final JsonObject llllllllllllIllIIIIlllllIllllIll) {
        if (lIIlllIIIIIllIII(((UserListEntry<Object>)this).getValue())) {
            final String s = UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[4]];
            String string;
            if (lIIlllIIIIIllIIl(this.getValue().getId())) {
                string = UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[5]];
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                string = this.getValue().getId().toString();
            }
            llllllllllllIllIIIIlllllIllllIll.addProperty(s, string);
            llllllllllllIllIIIIlllllIllllIll.addProperty(UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[6]], this.getValue().getName());
            super.onSerialization(llllllllllllIllIIIIlllllIllllIll);
            llllllllllllIllIIIIlllllIllllIll.addProperty(UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[7]], (Number)this.field_152645_a);
            llllllllllllIllIIIIlllllIllllIll.addProperty(UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[8]], Boolean.valueOf(this.field_183025_b));
        }
    }
    
    public int getPermissionLevel() {
        return this.field_152645_a;
    }
    
    private static void lIIlllIIIIIlIllI() {
        (lllIIIIIlIIIll = new int[14])[0] = ((0x42 ^ 0x76) & ~(0x7D ^ 0x49));
        UserListOpsEntry.lllIIIIIlIIIll[1] = " ".length();
        UserListOpsEntry.lllIIIIIlIIIll[2] = "  ".length();
        UserListOpsEntry.lllIIIIIlIIIll[3] = "   ".length();
        UserListOpsEntry.lllIIIIIlIIIll[4] = (0x63 ^ 0x67);
        UserListOpsEntry.lllIIIIIlIIIll[5] = (0x1A ^ 0x1F);
        UserListOpsEntry.lllIIIIIlIIIll[6] = (0x9B ^ 0x9D);
        UserListOpsEntry.lllIIIIIlIIIll[7] = (0xF5 ^ 0xBB ^ (0x40 ^ 0x9));
        UserListOpsEntry.lllIIIIIlIIIll[8] = (0xD0 ^ 0x8A ^ (0x4E ^ 0x1C));
        UserListOpsEntry.lllIIIIIlIIIll[9] = (0x1A ^ 0x13);
        UserListOpsEntry.lllIIIIIlIIIll[10] = (0x1F ^ 0x15);
        UserListOpsEntry.lllIIIIIlIIIll[11] = (0x98 ^ 0x82 ^ (0x60 ^ 0x71));
        UserListOpsEntry.lllIIIIIlIIIll[12] = (0x70 ^ 0x7C);
        UserListOpsEntry.lllIIIIIlIIIll[13] = (15 + 90 - 47 + 103 ^ 152 + 152 - 234 + 102);
    }
    
    private static String lIIlllIIIIIIllIl(final String llllllllllllIllIIIIlllllIIllllll, final String llllllllllllIllIIIIlllllIIlllllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlllllIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlllllIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIlllllIlIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIlllllIlIIIIll.init(UserListOpsEntry.lllIIIIIlIIIll[2], llllllllllllIllIIIIlllllIlIIIlII);
            return new String(llllllllllllIllIIIIlllllIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlllllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlllllIlIIIIlI) {
            llllllllllllIllIIIIlllllIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIIIIIlIlll(final int llllllllllllIllIIIIlllllIIllIIlI) {
        return llllllllllllIllIIIIlllllIIllIIlI != 0;
    }
    
    private static void lIIlllIIIIIIllll() {
        (lllIIIIIlIIIIl = new String[UserListOpsEntry.lllIIIIIlIIIll[13]])[UserListOpsEntry.lllIIIIIlIIIll[0]] = lIIlllIIIIIIllII("CQ0/IS4=", "ehIDB");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[1]] = lIIlllIIIIIIllIl("6T1pMRvaxAA=", "hqmge");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[2]] = lIIlllIIIIIIllIl("KEuVg/9Y2E+1ywm9Xza/j2sJft7vcHoQ", "NRVaA");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[3]] = lIIlllIIIIIIllIl("mvVKvGpwTT5qVBnxqxwUHw6NE61w5r4t", "HKmap");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[4]] = lIIlllIIIIIIllII("ODs9Mw==", "MNTWk");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[5]] = lIIlllIIIIIIlllI("MROjEVCOX44=", "oltAm");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[6]] = lIIlllIIIIIIlllI("Hzm3MybEcSU=", "YHpNr");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[7]] = lIIlllIIIIIIllIl("WVECKjYv35k=", "ugkuz");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[8]] = lIIlllIIIIIIlllI("QL8ta4+7qVeEVlKyaTq8Sh8NFWHfDRQI", "cgdbZ");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[9]] = lIIlllIIIIIIlllI("ouIuWRKz2QQ=", "Kdjrf");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[10]] = lIIlllIIIIIIllII("LREJHw==", "CpdzV");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[11]] = lIIlllIIIIIIllIl("VE1zFRrjhfQ=", "EjPVJ");
        UserListOpsEntry.lllIIIIIlIIIIl[UserListOpsEntry.lllIIIIIlIIIll[12]] = lIIlllIIIIIIlllI("+ktcyCT9Bw0=", "vWCqJ");
    }
}
