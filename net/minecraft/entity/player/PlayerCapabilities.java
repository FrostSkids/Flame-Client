// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.player;

import java.util.Arrays;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class PlayerCapabilities
{
    public /* synthetic */ boolean isCreativeMode;
    public /* synthetic */ boolean disableDamage;
    private static final /* synthetic */ int[] llIIIllIIIIlll;
    private /* synthetic */ float walkSpeed;
    private static final /* synthetic */ String[] llIIIlIIllIlII;
    public /* synthetic */ boolean isFlying;
    public /* synthetic */ boolean allowEdit;
    private /* synthetic */ float flySpeed;
    public /* synthetic */ boolean allowFlying;
    
    public void setFlySpeed(final float llllllllllllIlllIlIlIIIlIlIIlIlI) {
        this.flySpeed = llllllllllllIlllIlIlIIIlIlIIlIlI;
    }
    
    private static boolean lIIIlIlIIIIIIIll(final int llllllllllllIlllIlIlIIIIllllllIl, final int llllllllllllIlllIlIlIIIIllllllII) {
        return llllllllllllIlllIlIlIIIIllllllIl < llllllllllllIlllIlIlIIIIllllllII;
    }
    
    private static String lIIIlIIlIIIlIlll(final String llllllllllllIlllIlIlIIIlIIllIlIl, final String llllllllllllIlllIlIlIIIlIIllIllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIIlIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIIlIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIIIlIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIIIlIIlllIIl.init(PlayerCapabilities.llIIIllIIIIlll[2], llllllllllllIlllIlIlIIIlIIlllIlI);
            return new String(llllllllllllIlllIlIlIIIlIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIIlIIlllIII) {
            llllllllllllIlllIlIlIIIlIIlllIII.printStackTrace();
            return null;
        }
    }
    
    public float getFlySpeed() {
        return this.flySpeed;
    }
    
    public PlayerCapabilities() {
        this.allowEdit = (PlayerCapabilities.llIIIllIIIIlll[0] != 0);
        this.flySpeed = 0.05f;
        this.walkSpeed = 0.1f;
    }
    
    public void setPlayerWalkSpeed(final float llllllllllllIlllIlIlIIIlIIllllll) {
        this.walkSpeed = llllllllllllIlllIlIlIIIlIIllllll;
    }
    
    private static boolean lIIIlIlIIIIIIIII(final int llllllllllllIlllIlIlIIIIlllllIlI) {
        return llllllllllllIlllIlIlIIIIlllllIlI != 0;
    }
    
    public void readCapabilitiesFromNBT(final NBTTagCompound llllllllllllIlllIlIlIIIlIlIlIlIl) {
        if (lIIIlIlIIIIIIIII(llllllllllllIlllIlIlIIIlIlIlIlIl.hasKey(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[8]], PlayerCapabilities.llIIIllIIIIlll[9]) ? 1 : 0)) {
            final NBTTagCompound llllllllllllIlllIlIlIIIlIlIlIlII = llllllllllllIlllIlIlIIIlIlIlIlIl.getCompoundTag(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[10]]);
            this.disableDamage = llllllllllllIlllIlIlIIIlIlIlIlII.getBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[9]]);
            this.isFlying = llllllllllllIlllIlIlIIIlIlIlIlII.getBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[11]]);
            this.allowFlying = llllllllllllIlllIlIlIIIlIlIlIlII.getBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[12]]);
            this.isCreativeMode = llllllllllllIlllIlIlIIIlIlIlIlII.getBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[13]]);
            if (lIIIlIlIIIIIIIII(llllllllllllIlllIlIlIIIlIlIlIlII.hasKey(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[14]], PlayerCapabilities.llIIIllIIIIlll[15]) ? 1 : 0)) {
                this.flySpeed = llllllllllllIlllIlIlIIIlIlIlIlII.getFloat(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[16]]);
                this.walkSpeed = llllllllllllIlllIlIlIIIlIlIlIlII.getFloat(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[17]]);
            }
            if (lIIIlIlIIIIIIIII(llllllllllllIlllIlIlIIIlIlIlIlII.hasKey(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[18]], PlayerCapabilities.llIIIllIIIIlll[0]) ? 1 : 0)) {
                this.allowEdit = llllllllllllIlllIlIlIIIlIlIlIlII.getBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[19]]);
            }
        }
    }
    
    public void writeCapabilitiesToNBT(final NBTTagCompound llllllllllllIlllIlIlIIIlIlIllIll) {
        final NBTTagCompound llllllllllllIlllIlIlIIIlIlIlllIl = new NBTTagCompound();
        llllllllllllIlllIlIlIIIlIlIlllIl.setBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[1]], this.disableDamage);
        llllllllllllIlllIlIlIIIlIlIlllIl.setBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[0]], this.isFlying);
        llllllllllllIlllIlIlIIIlIlIlllIl.setBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[2]], this.allowFlying);
        llllllllllllIlllIlIlIIIlIlIlllIl.setBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[3]], this.isCreativeMode);
        llllllllllllIlllIlIlIIIlIlIlllIl.setBoolean(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[4]], this.allowEdit);
        llllllllllllIlllIlIlIIIlIlIlllIl.setFloat(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[5]], this.flySpeed);
        llllllllllllIlllIlIlIIIlIlIlllIl.setFloat(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[6]], this.walkSpeed);
        llllllllllllIlllIlIlIIIlIlIllIll.setTag(PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[7]], llllllllllllIlllIlIlIIIlIlIlllIl);
    }
    
    static {
        lIIIlIIlllllllIl();
        lIIIlIIlIIIllIll();
    }
    
    private static void lIIIlIIlllllllIl() {
        (llIIIllIIIIlll = new int[21])[0] = " ".length();
        PlayerCapabilities.llIIIllIIIIlll[1] = ((0x85 ^ 0xB1) & ~(0xF7 ^ 0xC3));
        PlayerCapabilities.llIIIllIIIIlll[2] = "  ".length();
        PlayerCapabilities.llIIIllIIIIlll[3] = "   ".length();
        PlayerCapabilities.llIIIllIIIIlll[4] = (0x5B ^ 0x5F);
        PlayerCapabilities.llIIIllIIIIlll[5] = (0x3A ^ 0x3F);
        PlayerCapabilities.llIIIllIIIIlll[6] = (0x73 ^ 0x14 ^ (0xF1 ^ 0x90));
        PlayerCapabilities.llIIIllIIIIlll[7] = (0x24 ^ 0x23);
        PlayerCapabilities.llIIIllIIIIlll[8] = (0xB4 ^ 0xBC);
        PlayerCapabilities.llIIIllIIIIlll[9] = (0xBD ^ 0xB7);
        PlayerCapabilities.llIIIllIIIIlll[10] = (0x8 ^ 0x36 ^ (0x3C ^ 0xB));
        PlayerCapabilities.llIIIllIIIIlll[11] = (0x8C ^ 0x87);
        PlayerCapabilities.llIIIllIIIIlll[12] = (0x7B ^ 0x77);
        PlayerCapabilities.llIIIllIIIIlll[13] = (51 + 47 + 30 + 46 ^ 68 + 115 - 155 + 135);
        PlayerCapabilities.llIIIllIIIIlll[14] = (140 + 37 - 113 + 80 ^ 76 + 106 - 24 + 0);
        PlayerCapabilities.llIIIllIIIIlll[15] = (0x56 ^ 0x35);
        PlayerCapabilities.llIIIllIIIIlll[16] = (0x74 ^ 0x7B);
        PlayerCapabilities.llIIIllIIIIlll[17] = (0xA1 ^ 0xB1);
        PlayerCapabilities.llIIIllIIIIlll[18] = (0xB5 ^ 0xA4);
        PlayerCapabilities.llIIIllIIIIlll[19] = (0xCD ^ 0xB4 ^ (0x43 ^ 0x28));
        PlayerCapabilities.llIIIllIIIIlll[20] = (0x5B ^ 0x54 ^ (0x73 ^ 0x6F));
    }
    
    private static String lIIIlIIlIIIllIIl(String llllllllllllIlllIlIlIIIlIIlIIIIl, final String llllllllllllIlllIlIlIIIlIIlIIlIl) {
        llllllllllllIlllIlIlIIIlIIlIIIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIlIIIlIIlIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlIIIlIIlIIlII = new StringBuilder();
        final char[] llllllllllllIlllIlIlIIIlIIlIIIll = llllllllllllIlllIlIlIIIlIIlIIlIl.toCharArray();
        int llllllllllllIlllIlIlIIIlIIlIIIlI = PlayerCapabilities.llIIIllIIIIlll[1];
        final double llllllllllllIlllIlIlIIIlIIIllIIl = (Object)((String)llllllllllllIlllIlIlIIIlIIlIIIIl).toCharArray();
        final byte llllllllllllIlllIlIlIIIlIIIlIlll = (byte)llllllllllllIlllIlIlIIIlIIIllIIl.length;
        boolean llllllllllllIlllIlIlIIIlIIIlIlIl = PlayerCapabilities.llIIIllIIIIlll[1] != 0;
        while (lIIIlIlIIIIIIIll(llllllllllllIlllIlIlIIIlIIIlIlIl ? 1 : 0, llllllllllllIlllIlIlIIIlIIIlIlll)) {
            final char llllllllllllIlllIlIlIIIlIIlIlIII = llllllllllllIlllIlIlIIIlIIIllIIl[llllllllllllIlllIlIlIIIlIIIlIlIl];
            llllllllllllIlllIlIlIIIlIIlIIlII.append((char)(llllllllllllIlllIlIlIIIlIIlIlIII ^ llllllllllllIlllIlIlIIIlIIlIIIll[llllllllllllIlllIlIlIIIlIIlIIIlI % llllllllllllIlllIlIlIIIlIIlIIIll.length]));
            "".length();
            ++llllllllllllIlllIlIlIIIlIIlIIIlI;
            ++llllllllllllIlllIlIlIIIlIIIlIlIl;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlIIIlIIlIIlII);
    }
    
    private static String lIIIlIIlIIIllIII(final String llllllllllllIlllIlIlIIIlIIIIIIll, final String llllllllllllIlllIlIlIIIlIIIIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIIlIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), PlayerCapabilities.llIIIllIIIIlll[8]), "DES");
            final Cipher llllllllllllIlllIlIlIIIlIIIIlIII = Cipher.getInstance("DES");
            llllllllllllIlllIlIlIIIlIIIIlIII.init(PlayerCapabilities.llIIIllIIIIlll[2], llllllllllllIlllIlIlIIIlIIIIlIlI);
            return new String(llllllllllllIlllIlIlIIIlIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIIlIIIIIllI) {
            llllllllllllIlllIlIlIIIlIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    public float getWalkSpeed() {
        return this.walkSpeed;
    }
    
    private static void lIIIlIIlIIIllIll() {
        (llIIIlIIllIlII = new String[PlayerCapabilities.llIIIllIIIIlll[20]])[PlayerCapabilities.llIIIllIIIIlll[1]] = lIIIlIIlIIIlIlll("V7cppPnRd9ZOtAYQyfMK+w==", "IMHiT");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[0]] = lIIIlIIlIIIllIII("xAXJSXH/Z6I=", "HQQgf");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[2]] = lIIIlIIlIIIlIlll("sHgwyB+Vh88=", "pFXOv");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[3]] = lIIIlIIlIIIlIlll("1cadCt0EP//dC3iehSoiUg==", "HMPox");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[4]] = lIIIlIIlIIIllIII("MQOFPSYwsWzKxE6I6AxjAw==", "QEWuk");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[5]] = lIIIlIIlIIIllIIl("KAsvGBcrAjI=", "NgVKg");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[6]] = lIIIlIIlIIIlIlll("rNqgr4sK6tKY2k6hX9HRJg==", "idTZe");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[7]] = lIIIlIIlIIIllIIl("NgwLKh8jBwc1", "WnbFv");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[8]] = lIIIlIIlIIIllIIl("Ay0NBDAWJgEb", "bOdhY");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[10]] = lIIIlIIlIIIlIlll("b3myDb3WIcBxX8TnJsKe6w==", "Kqttx");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[9]] = lIIIlIIlIIIllIIl("HjkYPD8ZMhwoMRsy", "wWnIS");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[11]] = lIIIlIIlIIIllIII("R8Bj4iduSXI=", "kTCZF");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[12]] = lIIIlIIlIIIlIlll("GaE6pcp2LdM=", "ijsts");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[13]] = lIIIlIIlIIIlIlll("jlHrPH5k012YNsq3fy4ezw==", "VEpmh");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[14]] = lIIIlIIlIIIllIIl("Eg8NJCERBhA=", "tctwQ");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[16]] = lIIIlIIlIIIllIIl("IggSKzQhAQ8=", "DdkxD");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[17]] = lIIIlIIlIIIllIIl("Jg8hJDghCygr", "QnMOk");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[18]] = lIIIlIIlIIIllIIl("CgcAEjYOCh0=", "gfyPC");
        PlayerCapabilities.llIIIlIIllIlII[PlayerCapabilities.llIIIllIIIIlll[19]] = lIIIlIIlIIIllIIl("FyoSECATJw8=", "zKkRU");
    }
}
