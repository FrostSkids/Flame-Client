// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.potion;

import org.apache.logging.log4j.LogManager;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import org.apache.logging.log4j.Logger;

public class PotionEffect
{
    private /* synthetic */ int potionID;
    private static final /* synthetic */ String[] lIIllllllllIll;
    private /* synthetic */ boolean isSplashPotion;
    private /* synthetic */ int duration;
    private /* synthetic */ boolean showParticles;
    private /* synthetic */ boolean isPotionDurationMax;
    private static final /* synthetic */ int[] lIIlllllllllII;
    private /* synthetic */ boolean isAmbient;
    private /* synthetic */ int amplifier;
    private static final /* synthetic */ Logger LOGGER;
    
    public void setSplashPotion(final boolean lllllllllllllIIlIIIlIllIIlllllll) {
        this.isSplashPotion = lllllllllllllIIlIIIlIllIIlllllll;
    }
    
    public void performEffect(final EntityLivingBase lllllllllllllIIlIIIlIllIIllIlIlI) {
        if (llIllllllllIIII(this.duration)) {
            Potion.potionTypes[this.potionID].performEffect(lllllllllllllIIlIIIlIllIIllIlIlI, this.amplifier);
        }
    }
    
    public void combine(final PotionEffect lllllllllllllIIlIIIlIllIlIIlIIII) {
        if (llIlllllllIlIlI(this.potionID, lllllllllllllIIlIIIlIllIlIIlIIII.potionID)) {
            PotionEffect.LOGGER.warn(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[0]]);
        }
        if (llIlllllllIlIll(lllllllllllllIIlIIIlIllIlIIlIIII.amplifier, this.amplifier)) {
            this.amplifier = lllllllllllllIIlIIIlIllIlIIlIIII.amplifier;
            this.duration = lllllllllllllIIlIIIlIllIlIIlIIII.duration;
            "".length();
            if (" ".length() == "   ".length()) {
                return;
            }
        }
        else if (llIlllllllIllII(lllllllllllllIIlIIIlIllIlIIlIIII.amplifier, this.amplifier) && llIlllllllIllIl(this.duration, lllllllllllllIIlIIIlIllIlIIlIIII.duration)) {
            this.duration = lllllllllllllIIlIIIlIllIlIIlIIII.duration;
            "".length();
            if (-(67 + 101 - 151 + 133 ^ 5 + 114 - 105 + 132) > 0) {
                return;
            }
        }
        else if (llIlllllllIlllI(lllllllllllllIIlIIIlIllIlIIlIIII.isAmbient ? 1 : 0) && llIlllllllIllll(this.isAmbient ? 1 : 0)) {
            this.isAmbient = lllllllllllllIIlIIIlIllIlIIlIIII.isAmbient;
        }
        this.showParticles = lllllllllllllIIlIIIlIllIlIIlIIII.showParticles;
    }
    
    private static boolean llIlllllllIllII(final int lllllllllllllIIlIIIlIlIlllllllll, final int lllllllllllllIIlIIIlIlIllllllllI) {
        return lllllllllllllIIlIIIlIlIlllllllll == lllllllllllllIIlIIIlIlIllllllllI;
    }
    
    private static String llIlllllllIIlll(final String lllllllllllllIIlIIIlIllIIIIIIlIl, final String lllllllllllllIIlIIIlIllIIIIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIllIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIllIIIIIIllI.getBytes(StandardCharsets.UTF_8)), PotionEffect.lIIlllllllllII[8]), "DES");
            final Cipher lllllllllllllIIlIIIlIllIIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIlIllIIIIIlIIl.init(PotionEffect.lIIlllllllllII[2], lllllllllllllIIlIIIlIllIIIIIlIlI);
            return new String(lllllllllllllIIlIIIlIllIIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIllIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIllIIIIIlIII) {
            lllllllllllllIIlIIIlIllIIIIIlIII.printStackTrace();
            return null;
        }
    }
    
    public boolean getIsShowParticles() {
        return this.showParticles;
    }
    
    private static boolean llIlllllllIlIlI(final int lllllllllllllIIlIIIlIlIllllIlIIl, final int lllllllllllllIIlIIIlIlIllllIlIII) {
        return lllllllllllllIIlIIIlIlIllllIlIIl != lllllllllllllIIlIIIlIlIllllIlIII;
    }
    
    private static boolean llIllllllllIIII(final int lllllllllllllIIlIIIlIlIllllIllII) {
        return lllllllllllllIIlIIIlIlIllllIllII > 0;
    }
    
    private static boolean llIlllllllIllIl(final int lllllllllllllIIlIIIlIlIllllllIll, final int lllllllllllllIIlIIIlIlIllllllIlI) {
        return lllllllllllllIIlIIIlIlIllllllIll < lllllllllllllIIlIIIlIlIllllllIlI;
    }
    
    public PotionEffect(final PotionEffect lllllllllllllIIlIIIlIllIlIIlIllI) {
        this.potionID = lllllllllllllIIlIIIlIllIlIIlIllI.potionID;
        this.duration = lllllllllllllIIlIIIlIllIlIIlIllI.duration;
        this.amplifier = lllllllllllllIIlIIIlIllIlIIlIllI.amplifier;
        this.isAmbient = lllllllllllllIIlIIIlIllIlIIlIllI.isAmbient;
        this.showParticles = lllllllllllllIIlIIIlIllIlIIlIllI.showParticles;
    }
    
    public int getAmplifier() {
        return this.amplifier;
    }
    
    public PotionEffect(final int lllllllllllllIIlIIIlIllIlIlIIlII, final int lllllllllllllIIlIIIlIllIlIIlllIl, final int lllllllllllllIIlIIIlIllIlIIlllII, final boolean lllllllllllllIIlIIIlIllIlIlIIIIl, final boolean lllllllllllllIIlIIIlIllIlIIllIlI) {
        this.potionID = lllllllllllllIIlIIIlIllIlIlIIlII;
        this.duration = lllllllllllllIIlIIIlIllIlIIlllIl;
        this.amplifier = lllllllllllllIIlIIIlIllIlIIlllII;
        this.isAmbient = lllllllllllllIIlIIIlIllIlIlIIIIl;
        this.showParticles = lllllllllllllIIlIIIlIllIlIIllIlI;
    }
    
    public boolean getIsAmbient() {
        return this.isAmbient;
    }
    
    private static boolean llIlllllllIlllI(final int lllllllllllllIIlIIIlIlIlllllIIII) {
        return lllllllllllllIIlIIIlIlIlllllIIII == 0;
    }
    
    private static void llIlllllllIlIIl() {
        (lIIlllllllllII = new int[21])[0] = ((0x8C ^ 0x8A) & ~(0x9E ^ 0x98));
        PotionEffect.lIIlllllllllII[1] = " ".length();
        PotionEffect.lIIlllllllllII[2] = "  ".length();
        PotionEffect.lIIlllllllllII[3] = "   ".length();
        PotionEffect.lIIlllllllllII[4] = (0x5D ^ 0x59);
        PotionEffect.lIIlllllllllII[5] = (0x1A ^ 0x76 ^ (0x65 ^ 0xC));
        PotionEffect.lIIlllllllllII[6] = (" ".length() ^ (0xBE ^ 0xB9));
        PotionEffect.lIIlllllllllII[7] = (0x1E ^ 0x19);
        PotionEffect.lIIlllllllllII[8] = (0xA4 ^ 0xAE ^ "  ".length());
        PotionEffect.lIIlllllllllII[9] = (0xAB ^ 0xAF ^ (0x31 ^ 0x3C));
        PotionEffect.lIIlllllllllII[10] = (0x99 ^ 0x93);
        PotionEffect.lIIlllllllllII[11] = (0xCF ^ 0x89 ^ (0x7D ^ 0x30));
        PotionEffect.lIIlllllllllII[12] = (0x7F ^ 0x73);
        PotionEffect.lIIlllllllllII[13] = (0x3 ^ 0xE);
        PotionEffect.lIIlllllllllII[14] = (0xA1 ^ 0xAF);
        PotionEffect.lIIlllllllllII[15] = (0x4 ^ 0xB);
        PotionEffect.lIIlllllllllII[16] = (0x66 ^ 0x76 ^ ((0x6F ^ 0x62) & ~(0x4A ^ 0x47)));
        PotionEffect.lIIlllllllllII[17] = (0xC7 ^ 0xBC ^ (0xD9 ^ 0xB3));
        PotionEffect.lIIlllllllllII[18] = (0x9A ^ 0x88);
        PotionEffect.lIIlllllllllII[19] = (0xAB ^ 0xB8);
        PotionEffect.lIIlllllllllII[20] = (0x6E ^ 0x7A);
    }
    
    private static boolean llIlllllllIlIll(final int lllllllllllllIIlIIIlIlIlllllIlll, final int lllllllllllllIIlIIIlIlIlllllIllI) {
        return lllllllllllllIIlIIIlIlIlllllIlll > lllllllllllllIIlIIIlIlIlllllIllI;
    }
    
    private static void llIlllllllIlIII() {
        (lIIllllllllIll = new String[PotionEffect.lIIlllllllllII[20]])[PotionEffect.lIIlllllllllII[0]] = llIlllllllIIlIl("zsx5UDrPU32GqDYnpsKtDSsuhIKiWZTCLj5DmNlOH5YlvGsapXUOILgmi1klZEOrswYb0GL4wUE=", "YpePI");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[1]] = llIlllllllIIllI("", "upKkO");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[2]] = llIlllllllIIlIl("PiMpc6/ia9I=", "WktmH");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[3]] = llIlllllllIIlll("DB9j3iQrwPEP8hfE12HSgg==", "YiHMR");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[4]] = llIlllllllIIlIl("VsFCuGR/KK1pYdxcbPSaTg==", "oPbmF");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[5]] = llIlllllllIIlIl("Ko42Mko0SIUpA12SqtxZCQ==", "hbgUd");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[6]] = llIlllllllIIlIl("Ff7U04ssJMyLvgD4meZyOcu7xTDAHhrm", "OgwLv");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[7]] = llIlllllllIIllI("ZA==", "LKiCk");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[8]] = llIlllllllIIlll("QT/xZjmC+AA=", "mhLah");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[9]] = llIlllllllIIlll("vFGhtESZkKA=", "mRUxj");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[10]] = llIlllllllIIllI("ESsRATM2LwQf", "PFamZ");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[11]] = llIlllllllIIllI("KxwBNhgGBh0=", "oisWl");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[12]] = llIlllllllIIlll("FAD6Fo9YPm8=", "Cvven");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[13]] = llIlllllllIIlIl("ds4noUGt4/GvbSb9yzH6ew==", "WgKzi");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[14]] = llIlllllllIIlll("e9zO9717t2g=", "vTDyJ");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[15]] = llIlllllllIIllI("EQwoPgU2CD0g", "PaXRl");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[16]] = llIlllllllIIlll("GtD/4mZF5rJCKPB8nUCnGQ==", "JWgeX");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[17]] = llIlllllllIIlll("BMQ6dqDZ3yU=", "sDENt");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[18]] = llIlllllllIIlIl("QqgzsJwNg/J6uBT5cdh5JA==", "MzHkg");
        PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[19]] = llIlllllllIIllI("FxA3DiElCiwQEigdKw==", "DxXyq");
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIIIlIllIIlIllIIl) {
        if (llIlllllllIlllI((lllllllllllllIIlIIIlIllIIlIllIIl instanceof PotionEffect) ? 1 : 0)) {
            return PotionEffect.lIIlllllllllII[0] != 0;
        }
        final PotionEffect lllllllllllllIIlIIIlIllIIlIllIII = (PotionEffect)lllllllllllllIIlIIIlIllIIlIllIIl;
        if (llIlllllllIllII(this.potionID, lllllllllllllIIlIIIlIllIIlIllIII.potionID) && llIlllllllIllII(this.amplifier, lllllllllllllIIlIIIlIllIIlIllIII.amplifier) && llIlllllllIllII(this.duration, lllllllllllllIIlIIIlIllIIlIllIII.duration) && llIlllllllIllII(this.isSplashPotion ? 1 : 0, lllllllllllllIIlIIIlIllIIlIllIII.isSplashPotion ? 1 : 0) && llIlllllllIllII(this.isAmbient ? 1 : 0, lllllllllllllIIlIIIlIllIIlIllIII.isAmbient ? 1 : 0)) {
            return PotionEffect.lIIlllllllllII[1] != 0;
        }
        return PotionEffect.lIIlllllllllII[0] != 0;
    }
    
    public static PotionEffect readCustomPotionEffectFromNBT(final NBTTagCompound lllllllllllllIIlIIIlIllIIlIIlIII) {
        final int lllllllllllllIIlIIIlIllIIlIIIlll = lllllllllllllIIlIIIlIllIIlIIlIII.getByte(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[14]]);
        if (llIllllllllIIIl(lllllllllllllIIlIIIlIllIIlIIIlll) && llIlllllllIllIl(lllllllllllllIIlIIIlIllIIlIIIlll, Potion.potionTypes.length) && llIllllllllIIlI(Potion.potionTypes[lllllllllllllIIlIIIlIllIIlIIIlll])) {
            final int lllllllllllllIIlIIIlIllIIlIIIllI = lllllllllllllIIlIIIlIllIIlIIlIII.getByte(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[15]]);
            final int lllllllllllllIIlIIIlIllIIlIIIlIl = lllllllllllllIIlIIIlIllIIlIIlIII.getInteger(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[16]]);
            final boolean lllllllllllllIIlIIIlIllIIlIIIlII = lllllllllllllIIlIIIlIllIIlIIlIII.getBoolean(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[17]]);
            boolean lllllllllllllIIlIIIlIllIIlIIIIll = PotionEffect.lIIlllllllllII[1] != 0;
            if (llIlllllllIllll(lllllllllllllIIlIIIlIllIIlIIlIII.hasKey(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[18]], PotionEffect.lIIlllllllllII[1]) ? 1 : 0)) {
                lllllllllllllIIlIIIlIllIIlIIIIll = lllllllllllllIIlIIIlIllIIlIIlIII.getBoolean(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[19]]);
            }
            return new PotionEffect(lllllllllllllIIlIIIlIllIIlIIIlll, lllllllllllllIIlIIIlIllIIlIIIlIl, lllllllllllllIIlIIIlIllIIlIIIllI, lllllllllllllIIlIIIlIllIIlIIIlII, lllllllllllllIIlIIIlIllIIlIIIIll);
        }
        return null;
    }
    
    @Override
    public int hashCode() {
        return this.potionID;
    }
    
    static {
        llIlllllllIlIIl();
        llIlllllllIlIII();
        LOGGER = LogManager.getLogger();
    }
    
    public boolean getIsPotionDurationMax() {
        return this.isPotionDurationMax;
    }
    
    public void setPotionDurationMax(final boolean lllllllllllllIIlIIIlIllIIIlllIIl) {
        this.isPotionDurationMax = lllllllllllllIIlIIIlIllIIIlllIIl;
    }
    
    private static String llIlllllllIIlIl(final String lllllllllllllIIlIIIlIllIIIlIllII, final String lllllllllllllIIlIIIlIllIIIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIllIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIllIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIlIllIIIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIlIllIIIlIlllI.init(PotionEffect.lIIlllllllllII[2], lllllllllllllIIlIIIlIllIIIlIllll);
            return new String(lllllllllllllIIlIIIlIllIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIllIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIllIIIlIllIl) {
            lllllllllllllIIlIIIlIllIIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    public String getEffectName() {
        return Potion.potionTypes[this.potionID].getName();
    }
    
    private static boolean llIllllllllIIIl(final int lllllllllllllIIlIIIlIlIllllIlllI) {
        return lllllllllllllIIlIIIlIlIllllIlllI >= 0;
    }
    
    private static boolean llIllllllllIIlI(final Object lllllllllllllIIlIIIlIlIlllllIlII) {
        return lllllllllllllIIlIIIlIlIlllllIlII != null;
    }
    
    public PotionEffect(final int lllllllllllllIIlIIIlIllIlIlIlllI, final int lllllllllllllIIlIIIlIllIlIlIllIl, final int lllllllllllllIIlIIIlIllIlIllIIII) {
        this(lllllllllllllIIlIIIlIllIlIlIlllI, lllllllllllllIIlIIIlIllIlIlIllIl, lllllllllllllIIlIIIlIllIlIllIIII, (boolean)(PotionEffect.lIIlllllllllII[0] != 0), (boolean)(PotionEffect.lIIlllllllllII[1] != 0));
    }
    
    private int deincrementDuration() {
        final int duration = this.duration - PotionEffect.lIIlllllllllII[1];
        this.duration = duration;
        return duration;
    }
    
    private static String llIlllllllIIllI(String lllllllllllllIIlIIIlIllIIIIlllII, final String lllllllllllllIIlIIIlIllIIIIllIll) {
        lllllllllllllIIlIIIlIllIIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIlIllIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIlIllIIIIllIlI = new StringBuilder();
        final char[] lllllllllllllIIlIIIlIllIIIIllIIl = lllllllllllllIIlIIIlIllIIIIllIll.toCharArray();
        int lllllllllllllIIlIIIlIllIIIIllIII = PotionEffect.lIIlllllllllII[0];
        final int lllllllllllllIIlIIIlIllIIIIlIIlI = (Object)lllllllllllllIIlIIIlIllIIIIlllII.toCharArray();
        final String lllllllllllllIIlIIIlIllIIIIlIIIl = (String)lllllllllllllIIlIIIlIllIIIIlIIlI.length;
        double lllllllllllllIIlIIIlIllIIIIlIIII = PotionEffect.lIIlllllllllII[0];
        while (llIlllllllIllIl((int)lllllllllllllIIlIIIlIllIIIIlIIII, (int)lllllllllllllIIlIIIlIllIIIIlIIIl)) {
            final char lllllllllllllIIlIIIlIllIIIIlllIl = lllllllllllllIIlIIIlIllIIIIlIIlI[lllllllllllllIIlIIIlIllIIIIlIIII];
            lllllllllllllIIlIIIlIllIIIIllIlI.append((char)(lllllllllllllIIlIIIlIllIIIIlllIl ^ lllllllllllllIIlIIIlIllIIIIllIIl[lllllllllllllIIlIIIlIllIIIIllIII % lllllllllllllIIlIIIlIllIIIIllIIl.length]));
            "".length();
            ++lllllllllllllIIlIIIlIllIIIIllIII;
            ++lllllllllllllIIlIIIlIllIIIIlIIII;
            "".length();
            if (((0xA2 ^ 0xA9 ^ (0x8A ^ 0x8E)) & (143 + 72 - 160 + 112 ^ 143 + 34 - 52 + 43 ^ -" ".length())) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIlIllIIIIllIlI);
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public NBTTagCompound writeCustomPotionEffectToNBT(final NBTTagCompound lllllllllllllIIlIIIlIllIIlIIllll) {
        lllllllllllllIIlIIIlIllIIlIIllll.setByte(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[9]], (byte)this.getPotionID());
        lllllllllllllIIlIIIlIllIIlIIllll.setByte(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[10]], (byte)this.getAmplifier());
        lllllllllllllIIlIIIlIllIIlIIllll.setInteger(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[11]], this.getDuration());
        lllllllllllllIIlIIIlIllIIlIIllll.setBoolean(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[12]], this.getIsAmbient());
        lllllllllllllIIlIIIlIllIIlIIllll.setBoolean(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[13]], this.getIsShowParticles());
        return lllllllllllllIIlIIIlIllIIlIIllll;
    }
    
    public boolean onUpdate(final EntityLivingBase lllllllllllllIIlIIIlIllIIlllIlIl) {
        if (llIllllllllIIII(this.duration)) {
            if (llIlllllllIllll(Potion.potionTypes[this.potionID].isReady(this.duration, this.amplifier) ? 1 : 0)) {
                this.performEffect(lllllllllllllIIlIIIlIllIIlllIlIl);
            }
            this.deincrementDuration();
            "".length();
        }
        if (llIllllllllIIII(this.duration)) {
            return PotionEffect.lIIlllllllllII[1] != 0;
        }
        return PotionEffect.lIIlllllllllII[0] != 0;
    }
    
    public PotionEffect(final int lllllllllllllIIlIIIlIllIlIllllII, final int lllllllllllllIIlIIIlIllIlIlllIII) {
        this(lllllllllllllIIlIIIlIllIlIllllII, lllllllllllllIIlIIIlIllIlIlllIII, PotionEffect.lIIlllllllllII[0]);
    }
    
    public int getPotionID() {
        return this.potionID;
    }
    
    private static boolean llIlllllllIllll(final int lllllllllllllIIlIIIlIlIlllllIIlI) {
        return lllllllllllllIIlIIIlIlIlllllIIlI != 0;
    }
    
    @Override
    public String toString() {
        String lllllllllllllIIlIIIlIllIIllIIIII = PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[1]];
        if (llIllllllllIIII(this.getAmplifier())) {
            lllllllllllllIIlIIIlIllIIllIIIII = String.valueOf(new StringBuilder(String.valueOf(this.getEffectName())).append(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[2]]).append(this.getAmplifier() + PotionEffect.lIIlllllllllII[1]).append(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[3]]).append(this.getDuration()));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            lllllllllllllIIlIIIlIllIIllIIIII = String.valueOf(new StringBuilder(String.valueOf(this.getEffectName())).append(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[4]]).append(this.getDuration()));
        }
        if (llIlllllllIllll(this.isSplashPotion ? 1 : 0)) {
            lllllllllllllIIlIIIlIllIIllIIIII = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlIIIlIllIIllIIIII)).append(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[5]]));
        }
        if (llIlllllllIlllI(this.showParticles ? 1 : 0)) {
            lllllllllllllIIlIIIlIllIIllIIIII = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlIIIlIllIIllIIIII)).append(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[6]]));
        }
        String value;
        if (llIlllllllIllll(Potion.potionTypes[this.potionID].isUsable() ? 1 : 0)) {
            value = String.valueOf(new StringBuilder(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[7]]).append(lllllllllllllIIlIIIlIllIIllIIIII).append(PotionEffect.lIIllllllllIll[PotionEffect.lIIlllllllllII[8]]));
            "".length();
            if (-(121 + 100 - 220 + 151 ^ 85 + 127 - 60 + 5) >= 0) {
                return null;
            }
        }
        else {
            value = lllllllllllllIIlIIIlIllIIllIIIII;
        }
        return value;
    }
}
