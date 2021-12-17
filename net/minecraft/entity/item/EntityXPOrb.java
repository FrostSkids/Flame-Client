// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Arrays;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

public class EntityXPOrb extends Entity
{
    public /* synthetic */ int xpColor;
    public /* synthetic */ int xpOrbAge;
    private /* synthetic */ int xpOrbHealth;
    private static final /* synthetic */ int[] lIIllIIIlIIlIl;
    public /* synthetic */ int delayBeforeCanPickup;
    private /* synthetic */ EntityPlayer closestPlayer;
    private /* synthetic */ int xpValue;
    private /* synthetic */ int xpTargetColor;
    private static final /* synthetic */ String[] lIIllIIIIllllI;
    
    public static int getXPSplit(final int lllllllllllllIIlIllIlIIIlIIIIlll) {
        int n;
        if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[14])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[14];
            "".length();
            if (("   ".length() & ~"   ".length()) >= "  ".length()) {
                return (0x53 ^ 0xC) & ~(0xCF ^ 0x90);
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[16])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[16];
            "".length();
            if (null != null) {
                return (0x6E ^ 0x0 ^ (0x73 ^ 0x19)) & (133 + 93 - 175 + 129 ^ 86 + 128 - 50 + 12 ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[18])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[18];
            "".length();
            if (-"   ".length() > 0) {
                return (0x74 ^ 0x6A ^ (0x3 ^ 0x11)) & (100 + 133 - 141 + 49 ^ 108 + 111 - 163 + 73 ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[20])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[20];
            "".length();
            if ((0xA8 ^ 0xAC) != (0x40 ^ 0x44)) {
                return (0x2C ^ 0x12) & ~(0x32 ^ 0xC);
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[21])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[21];
            "".length();
            if ((96 + 79 - 82 + 40 ^ 86 + 54 - 70 + 58) == 0x0) {
                return (0xC2 ^ 0xB3 ^ (0xE9 ^ 0xC4)) & (0xC0 ^ 0x82 ^ (0x44 ^ 0x5A) ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[22])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[22];
            "".length();
            if ((0x5 ^ 0x1) <= 0) {
                return (0x3C ^ 0x69) & ~(0x3D ^ 0x68);
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[23])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[23];
            "".length();
            if ("   ".length() < 0) {
                return (49 + 181 - 167 + 154 ^ 10 + 51 + 16 + 57) & (234 + 177 - 206 + 34 ^ 134 + 163 - 215 + 94 ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[24])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[24];
            "".length();
            if ((7 + 35 - 24 + 138 ^ 5 + 147 - 95 + 95) <= "  ".length()) {
                return (37 + 154 - 120 + 85 ^ 105 + 167 - 203 + 107) & (0x5C ^ 0x77 ^ (0x86 ^ 0x81) ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[13])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[13];
            "".length();
            if ((11 + 83 - 52 + 142 ^ 124 + 15 + 33 + 16) <= ((36 + 71 - 74 + 124 ^ 128 + 16 - 46 + 75) & (40 + 37 - 64 + 151 ^ 21 + 31 + 57 + 39 ^ -" ".length()))) {
                return (0x12 ^ 0x7F ^ (0x25 ^ 0x45)) & (0x8D ^ 0x9D ^ (0xAD ^ 0xB0) ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(lllllllllllllIIlIllIlIIIlIIIIlll, EntityXPOrb.lIIllIIIlIIlIl[10])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[10];
            "".length();
            if ("  ".length() == 0) {
                return (0x74 ^ 0x7A) & ~(0xA1 ^ 0xAF);
            }
        }
        else {
            n = EntityXPOrb.lIIllIIIlIIlIl[5];
        }
        return n;
    }
    
    private static boolean llIlIllIIlIlIIl(final int lllllllllllllIIlIllIlIIIIIlllIll) {
        return lllllllllllllIIlIllIlIIIIIlllIll <= 0;
    }
    
    private static void llIlIllIIIIIIlI() {
        (lIIllIIIIllllI = new String[EntityXPOrb.lIIllIIIlIIlIl[19]])[EntityXPOrb.lIIllIIIlIIlIl[1]] = llIlIlIllllllll("NSc8MwYqaDQ+Ez0=", "GFRWi");
        EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[5]] = llIlIllIIIIIIII("ftHULV9POOw=", "gRnMT");
        EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[9]] = llIlIllIIIIIIIl("QFogWpoYDXU=", "AlYkX");
        EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[10]] = llIlIllIIIIIIIl("LiDpt7rfzKE=", "tXRmt");
        EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[11]] = llIlIllIIIIIIII("4IYO9cmmTLk=", "PFyJq");
        EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[0]] = llIlIllIIIIIIIl("W7JO6UctugU=", "uoFut");
        EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[12]] = llIlIlIllllllll("GwgBHR8=", "Mimhz");
        EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[13]] = llIlIllIIIIIIIl("WHYNB6D6nuR7kFmmHa4uYg==", "eEPZM");
    }
    
    @Override
    public boolean canAttackWithItem() {
        return EntityXPOrb.lIIllIIIlIIlIl[1] != 0;
    }
    
    private static boolean llIlIllIIlIlIII(final int lllllllllllllIIlIllIlIIIIlIlIIII, final int lllllllllllllIIlIllIlIIIIlIIllll) {
        return lllllllllllllIIlIllIlIIIIlIlIIII >= lllllllllllllIIlIllIlIIIIlIIllll;
    }
    
    private static void llIlIllIIlIIIII() {
        (lIIllIIIlIIlIl = new int[25])[0] = (0x68 ^ 0x7D ^ (0x81 ^ 0x91));
        EntityXPOrb.lIIllIIIlIIlIl[1] = ((0x9 ^ 0x22 ^ (0x34 ^ 0x49)) & (0x39 ^ 0x37 ^ (0x4C ^ 0x14) ^ -" ".length()));
        EntityXPOrb.lIIllIIIlIIlIl[2] = 131 + 161 - 124 + 87;
        EntityXPOrb.lIIllIIIlIIlIl[3] = (0x73 ^ 0x63);
        EntityXPOrb.lIIllIIIlIIlIl[4] = 191 + 46 - 159 + 114 + (93 + 48 - 121 + 166) - (0xFFFFA17F & 0x5FEF) + (101 + 116 - 0 + 12);
        EntityXPOrb.lIIllIIIlIIlIl[5] = " ".length();
        EntityXPOrb.lIIllIIIlIIlIl[6] = (0xB3 ^ 0xA7);
        EntityXPOrb.lIIllIIIlIIlIl[7] = (0xC1 ^ 0xA5);
        EntityXPOrb.lIIllIIIlIIlIl[8] = (-(35 + 68 - 96 + 128) & (0xFFFF97FF & 0x7FF6));
        EntityXPOrb.lIIllIIIlIIlIl[9] = "  ".length();
        EntityXPOrb.lIIllIIIlIIlIl[10] = "   ".length();
        EntityXPOrb.lIIllIIIlIIlIl[11] = (0x10 ^ 0x14);
        EntityXPOrb.lIIllIIIlIIlIl[12] = (0x1D ^ 0x1B);
        EntityXPOrb.lIIllIIIlIIlIl[13] = (23 + 27 + 88 + 16 ^ 89 + 80 - 135 + 123);
        EntityXPOrb.lIIllIIIlIIlIl[14] = (0xFFFFEFBD & 0x19EF);
        EntityXPOrb.lIIllIIIlIIlIl[15] = (0x44 ^ 0x4E);
        EntityXPOrb.lIIllIIIlIIlIl[16] = (0xFFFFEDF7 & 0x16DD);
        EntityXPOrb.lIIllIIIlIIlIl[17] = (90 + 32 - 70 + 90 ^ 34 + 134 - 43 + 10);
        EntityXPOrb.lIIllIIIlIIlIl[18] = (0xFFFFFFFB & 0x26D);
        EntityXPOrb.lIIllIIIlIIlIl[19] = (0x14 ^ 0x1C);
        EntityXPOrb.lIIllIIIlIIlIl[20] = (-(0xFFFFFC4B & 0x4BFD) & (0xFFFFEFFF & 0x597B));
        EntityXPOrb.lIIllIIIlIIlIl[21] = (0x46 ^ 0x29) + (0x6C ^ 0x59) - (0xAB ^ 0x84) + (0xB ^ 0x2B);
        EntityXPOrb.lIIllIIIlIIlIl[22] = (25 + 8 + 51 + 43 ^ (0x11 ^ 0x27));
        EntityXPOrb.lIIllIIIlIIlIl[23] = (0x50 ^ 0x75);
        EntityXPOrb.lIIllIIIlIIlIl[24] = (0xB7 ^ 0x94 ^ (0x75 ^ 0x47));
    }
    
    public int getTextureByXP() {
        int n;
        if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[14])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[15];
            "".length();
            if ("   ".length() == "  ".length()) {
                return (0xB9 ^ 0x90 ^ (0x55 ^ 0x61)) & (0xB3 ^ 0x8D ^ (0xE0 ^ 0xC3) ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[16])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[17];
            "".length();
            if ((0x2B ^ 0x2F) < 0) {
                return (0x1E ^ 0xA) & ~(0x8B ^ 0x9F);
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[18])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[19];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return (0x8F ^ 0x83 ^ (0x5C ^ 0x6C)) & (0x1C ^ 0x78 ^ (0x68 ^ 0x30) ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[20])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[13];
            "".length();
            if (((0x1A ^ 0x2B ^ (0x3A ^ 0x68)) & (205 + 5 + 19 + 23 ^ 0 + 39 + 74 + 46 ^ -" ".length())) >= (0xA3 ^ 0xBC ^ (0xDF ^ 0xC4))) {
                return (0x6C ^ 0x63 ^ (0x50 ^ 0x4F)) & (0xF7 ^ 0xAD ^ (0x65 ^ 0x2F) ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[21])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[12];
            "".length();
            if (-(0x6 ^ 0x3) >= 0) {
                return (0x62 ^ 0x57) & ~(0x51 ^ 0x64);
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[22])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[0];
            "".length();
            if (" ".length() <= -" ".length()) {
                return (0x60 ^ 0x45 ^ (0x5F ^ 0x35)) & (0x82 ^ 0xA7 ^ (0x2D ^ 0x47) ^ -" ".length());
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[23])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[11];
            "".length();
            if (null != null) {
                return (0xD ^ 0x6F) & ~(0x39 ^ 0x5B);
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[24])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[10];
            "".length();
            if ((0x29 ^ 0x2C) == 0x0) {
                return (0x88 ^ 0x80) & ~(0x50 ^ 0x58);
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[13])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[9];
            "".length();
            if (" ".length() <= 0) {
                return (0x3D ^ 0x68) & ~(0xFC ^ 0xA9);
            }
        }
        else if (llIlIllIIlIlIII(this.xpValue, EntityXPOrb.lIIllIIIlIIlIl[10])) {
            n = EntityXPOrb.lIIllIIIlIIlIl[5];
            "".length();
            if (-" ".length() >= 0) {
                return (165 + 76 - 203 + 133 ^ 48 + 83 - 13 + 39) & (0x20 ^ 0x1C ^ (0x18 ^ 0x12) ^ -" ".length());
            }
        }
        else {
            n = EntityXPOrb.lIIllIIIlIIlIl[1];
        }
        return n;
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIIlIllIlIIIllIIllIl) {
        float lllllllllllllIIlIllIlIIIllIlIIlI = 0.5f;
        lllllllllllllIIlIllIlIIIllIlIIlI = MathHelper.clamp_float(lllllllllllllIIlIllIlIIIllIlIIlI, 0.0f, 1.0f);
        final int lllllllllllllIIlIllIlIIIllIlIIIl = super.getBrightnessForRender(lllllllllllllIIlIllIlIIIllIIllIl);
        int lllllllllllllIIlIllIlIIIllIlIIII = lllllllllllllIIlIllIlIIIllIlIIIl & EntityXPOrb.lIIllIIIlIIlIl[2];
        final int lllllllllllllIIlIllIlIIIllIIllll = lllllllllllllIIlIllIlIIIllIlIIIl >> EntityXPOrb.lIIllIIIlIIlIl[3] & EntityXPOrb.lIIllIIIlIIlIl[2];
        lllllllllllllIIlIllIlIIIllIlIIII += (int)(lllllllllllllIIlIllIlIIIllIlIIlI * 15.0f * 16.0f);
        if (llIlIllIIlIIIIl(lllllllllllllIIlIllIlIIIllIlIIII, EntityXPOrb.lIIllIIIlIIlIl[4])) {
            lllllllllllllIIlIllIlIIIllIlIIII = EntityXPOrb.lIIllIIIlIIlIl[4];
        }
        return lllllllllllllIIlIllIlIIIllIlIIII | lllllllllllllIIlIllIlIIIllIIllll << EntityXPOrb.lIIllIIIlIIlIl[3];
    }
    
    private static String llIlIllIIIIIIIl(final String lllllllllllllIIlIllIlIIIIlIlIllI, final String lllllllllllllIIlIllIlIIIIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIlIIIIlIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIlIIIIlIllIlI.init(EntityXPOrb.lIIllIIIlIIlIl[9], lllllllllllllIIlIllIlIIIIlIllIll);
            return new String(lllllllllllllIIlIllIlIIIIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIIIIlIllIIl) {
            lllllllllllllIIlIllIlIIIIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlIllIlIIIlIIllIll) {
        lllllllllllllIIlIllIlIIIlIIllIll.setShort(EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[5]], (byte)this.xpOrbHealth);
        lllllllllllllIIlIllIlIIIlIIllIll.setShort(EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[9]], (short)this.xpOrbAge);
        lllllllllllllIIlIllIlIIIlIIllIll.setShort(EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[10]], (short)this.xpValue);
    }
    
    private static boolean llIlIllIIlIIIIl(final int lllllllllllllIIlIllIlIIIIlIIlIII, final int lllllllllllllIIlIllIlIIIIlIIIlll) {
        return lllllllllllllIIlIllIlIIIIlIIlIII > lllllllllllllIIlIllIlIIIIlIIIlll;
    }
    
    private static int llIlIllIIlIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public EntityXPOrb(final World lllllllllllllIIlIllIlIIIllIlllII) {
        super(lllllllllllllIIlIllIlIIIllIlllII);
        this.xpOrbHealth = EntityXPOrb.lIIllIIIlIIlIl[0];
        this.setSize(0.25f, 0.25f);
    }
    
    private static boolean llIlIllIIlIIlll(final int lllllllllllllIIlIllIlIIIIIllllll) {
        return lllllllllllllIIlIllIlIIIIIllllll != 0;
    }
    
    private static boolean llIlIllIIlIIIll(final int lllllllllllllIIlIllIlIIIIIlllIIl) {
        return lllllllllllllIIlIllIlIIIIIlllIIl > 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIlIllIlIIIlIlIIIlI, final float lllllllllllllIIlIllIlIIIlIlIIlII) {
        if (llIlIllIIlIIlll(this.isEntityInvulnerable(lllllllllllllIIlIllIlIIIlIlIIIlI) ? 1 : 0)) {
            return EntityXPOrb.lIIllIIIlIIlIl[1] != 0;
        }
        this.setBeenAttacked();
        this.xpOrbHealth -= (int)lllllllllllllIIlIllIlIIIlIlIIlII;
        if (llIlIllIIlIlIIl(this.xpOrbHealth)) {
            this.setDead();
        }
        return EntityXPOrb.lIIllIIIlIIlIl[1] != 0;
    }
    
    public int getXpValue() {
        return this.xpValue;
    }
    
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlIllIlIIIlIIlIlll) {
        this.xpOrbHealth = (lllllllllllllIIlIllIlIIIlIIlIlll.getShort(EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[11]]) & EntityXPOrb.lIIllIIIlIIlIl[2]);
        this.xpOrbAge = lllllllllllllIIlIllIlIIIlIIlIlll.getShort(EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[0]]);
        this.xpValue = lllllllllllllIIlIllIlIIIlIIlIlll.getShort(EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[12]]);
    }
    
    public EntityXPOrb(final World lllllllllllllIIlIllIlIIIlllIllIl, final double lllllllllllllIIlIllIlIIIlllIIllI, final double lllllllllllllIIlIllIlIIIlllIIlIl, final double lllllllllllllIIlIllIlIIIlllIIlII, final int lllllllllllllIIlIllIlIIIlllIIIll) {
        super(lllllllllllllIIlIllIlIIIlllIllIl);
        this.xpOrbHealth = EntityXPOrb.lIIllIIIlIIlIl[0];
        this.setSize(0.5f, 0.5f);
        this.setPosition(lllllllllllllIIlIllIlIIIlllIIllI, lllllllllllllIIlIllIlIIIlllIIlIl, lllllllllllllIIlIllIlIIIlllIIlII);
        this.rotationYaw = (float)(Math.random() * 360.0);
        this.motionX = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612) * 2.0f;
        this.motionY = (float)(Math.random() * 0.2) * 2.0f;
        this.motionZ = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612) * 2.0f;
        this.xpValue = lllllllllllllIIlIllIlIIIlllIIIll;
    }
    
    static {
        llIlIllIIlIIIII();
        llIlIllIIIIIIlI();
    }
    
    private static String llIlIlIllllllll(String lllllllllllllIIlIllIlIIIIllIlIII, final String lllllllllllllIIlIllIlIIIIllIIlll) {
        lllllllllllllIIlIllIlIIIIllIlIII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIllIlIIIIllIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIlIIIIllIlIll = new StringBuilder();
        final char[] lllllllllllllIIlIllIlIIIIllIlIlI = lllllllllllllIIlIllIlIIIIllIIlll.toCharArray();
        int lllllllllllllIIlIllIlIIIIllIlIIl = EntityXPOrb.lIIllIIIlIIlIl[1];
        final String lllllllllllllIIlIllIlIIIIllIIIll = (Object)((String)lllllllllllllIIlIllIlIIIIllIlIII).toCharArray();
        final long lllllllllllllIIlIllIlIIIIllIIIlI = lllllllllllllIIlIllIlIIIIllIIIll.length;
        char lllllllllllllIIlIllIlIIIIllIIIIl = (char)EntityXPOrb.lIIllIIIlIIlIl[1];
        while (llIlIllIIlIIlIl(lllllllllllllIIlIllIlIIIIllIIIIl, (int)lllllllllllllIIlIllIlIIIIllIIIlI)) {
            final char lllllllllllllIIlIllIlIIIIllIlllI = lllllllllllllIIlIllIlIIIIllIIIll[lllllllllllllIIlIllIlIIIIllIIIIl];
            lllllllllllllIIlIllIlIIIIllIlIll.append((char)(lllllllllllllIIlIllIlIIIIllIlllI ^ lllllllllllllIIlIllIlIIIIllIlIlI[lllllllllllllIIlIllIlIIIIllIlIIl % lllllllllllllIIlIllIlIIIIllIlIlI.length]));
            "".length();
            ++lllllllllllllIIlIllIlIIIIllIlIIl;
            ++lllllllllllllIIlIllIlIIIIllIIIIl;
            "".length();
            if ((0x35 ^ 0x0 ^ (0x8E ^ 0xBF)) < ((0x14 ^ 0x6A ^ (0x6C ^ 0x18)) & (0x64 ^ 0x3E ^ (0x57 ^ 0x7) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIlIIIIllIlIll);
    }
    
    private static String llIlIllIIIIIIII(final String lllllllllllllIIlIllIlIIIIlllllIl, final String lllllllllllllIIlIllIlIIIIlllllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIIIlIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIIIlllllII.getBytes(StandardCharsets.UTF_8)), EntityXPOrb.lIIllIIIlIIlIl[19]), "DES");
            final Cipher lllllllllllllIIlIllIlIIIIlllllll = Cipher.getInstance("DES");
            lllllllllllllIIlIllIlIIIIlllllll.init(EntityXPOrb.lIIllIIIlIIlIl[9], lllllllllllllIIlIllIlIIIlIIIIIII);
            return new String(lllllllllllllIIlIllIlIIIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIIIIllllllI) {
            lllllllllllllIIlIllIlIIIIllllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllIIlIIllI(final Object lllllllllllllIIlIllIlIIIIlIIIIIl) {
        return lllllllllllllIIlIllIlIIIIlIIIIIl != null;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (llIlIllIIlIIIll(this.delayBeforeCanPickup)) {
            this.delayBeforeCanPickup -= EntityXPOrb.lIIllIIIlIIlIl[5];
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= 0.029999999329447746;
        if (llIlIllIIlIIlII(this.worldObj.getBlockState(new BlockPos(this)).getBlock().getMaterial(), Material.lava)) {
            this.motionY = 0.20000000298023224;
            this.motionX = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f;
            this.motionZ = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f;
            this.playSound(EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[1]], 0.4f, 2.0f + this.rand.nextFloat() * 0.4f);
        }
        this.pushOutOfBlocks(this.posX, (this.getEntityBoundingBox().minY + this.getEntityBoundingBox().maxY) / 2.0, this.posZ);
        "".length();
        final double lllllllllllllIIlIllIlIIIllIIIIII = 8.0;
        if (llIlIllIIlIIlIl(this.xpTargetColor, this.xpColor - EntityXPOrb.lIIllIIIlIIlIl[6] + this.getEntityId() % EntityXPOrb.lIIllIIIlIIlIl[7])) {
            if (!llIlIllIIlIIllI(this.closestPlayer) || llIlIllIIlIIIll(llIlIllIIlIIIlI(this.closestPlayer.getDistanceSqToEntity(this), lllllllllllllIIlIllIlIIIllIIIIII * lllllllllllllIIlIllIlIIIllIIIIII))) {
                this.closestPlayer = this.worldObj.getClosestPlayerToEntity(this, lllllllllllllIIlIllIlIIIllIIIIII);
            }
            this.xpTargetColor = this.xpColor;
        }
        if (llIlIllIIlIIllI(this.closestPlayer) && llIlIllIIlIIlll(this.closestPlayer.isSpectator() ? 1 : 0)) {
            this.closestPlayer = null;
        }
        if (llIlIllIIlIIllI(this.closestPlayer)) {
            final double lllllllllllllIIlIllIlIIIlIllllll = (this.closestPlayer.posX - this.posX) / lllllllllllllIIlIllIlIIIllIIIIII;
            final double lllllllllllllIIlIllIlIIIlIlllllI = (this.closestPlayer.posY + this.closestPlayer.getEyeHeight() - this.posY) / lllllllllllllIIlIllIlIIIllIIIIII;
            final double lllllllllllllIIlIllIlIIIlIllllIl = (this.closestPlayer.posZ - this.posZ) / lllllllllllllIIlIllIlIIIllIIIIII;
            final double lllllllllllllIIlIllIlIIIlIllllII = Math.sqrt(lllllllllllllIIlIllIlIIIlIllllll * lllllllllllllIIlIllIlIIIlIllllll + lllllllllllllIIlIllIlIIIlIlllllI * lllllllllllllIIlIllIlIIIlIlllllI + lllllllllllllIIlIllIlIIIlIllllIl * lllllllllllllIIlIllIlIIIlIllllIl);
            double lllllllllllllIIlIllIlIIIlIlllIll = 1.0 - lllllllllllllIIlIllIlIIIlIllllII;
            if (llIlIllIIlIIIll(llIlIllIIlIIIlI(lllllllllllllIIlIllIlIIIlIlllIll, 0.0))) {
                lllllllllllllIIlIllIlIIIlIlllIll *= lllllllllllllIIlIllIlIIIlIlllIll;
                this.motionX += lllllllllllllIIlIllIlIIIlIllllll / lllllllllllllIIlIllIlIIIlIllllII * lllllllllllllIIlIllIlIIIlIlllIll * 0.1;
                this.motionY += lllllllllllllIIlIllIlIIIlIlllllI / lllllllllllllIIlIllIlIIIlIllllII * lllllllllllllIIlIllIlIIIlIlllIll * 0.1;
                this.motionZ += lllllllllllllIIlIllIlIIIlIllllIl / lllllllllllllIIlIllIlIIIlIllllII * lllllllllllllIIlIllIlIIIlIlllIll * 0.1;
            }
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        float lllllllllllllIIlIllIlIIIlIlllIlI = 0.98f;
        if (llIlIllIIlIIlll(this.onGround ? 1 : 0)) {
            lllllllllllllIIlIllIlIIIlIlllIlI = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.getEntityBoundingBox().minY) - EntityXPOrb.lIIllIIIlIIlIl[5], MathHelper.floor_double(this.posZ))).getBlock().slipperiness * 0.98f;
        }
        this.motionX *= lllllllllllllIIlIllIlIIIlIlllIlI;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= lllllllllllllIIlIllIlIIIlIlllIlI;
        if (llIlIllIIlIIlll(this.onGround ? 1 : 0)) {
            this.motionY *= -0.8999999761581421;
        }
        this.xpColor += EntityXPOrb.lIIllIIIlIIlIl[5];
        this.xpOrbAge += EntityXPOrb.lIIllIIIlIIlIl[5];
        if (llIlIllIIlIlIII(this.xpOrbAge, EntityXPOrb.lIIllIIIlIIlIl[8])) {
            this.setDead();
        }
    }
    
    private static boolean llIlIllIIlIIlIl(final int lllllllllllllIIlIllIlIIIIlIIllII, final int lllllllllllllIIlIllIlIIIIlIIlIll) {
        return lllllllllllllIIlIllIlIIIIlIIllII < lllllllllllllIIlIllIlIIIIlIIlIll;
    }
    
    @Override
    protected void dealFireDamage(final int lllllllllllllIIlIllIlIIIlIlIllII) {
        this.attackEntityFrom(DamageSource.inFire, (float)lllllllllllllIIlIllIlIIIlIlIllII);
        "".length();
    }
    
    private static boolean llIlIllIIlIlIlI(final int lllllllllllllIIlIllIlIIIIIllllIl) {
        return lllllllllllllIIlIllIlIIIIIllllIl == 0;
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityXPOrb.lIIllIIIlIIlIl[1] != 0;
    }
    
    private static boolean llIlIllIIlIIlII(final Object lllllllllllllIIlIllIlIIIIlIIIlII, final Object lllllllllllllIIlIllIlIIIIlIIIIll) {
        return lllllllllllllIIlIllIlIIIIlIIIlII == lllllllllllllIIlIllIlIIIIlIIIIll;
    }
    
    @Override
    public boolean handleWaterMovement() {
        return this.worldObj.handleMaterialAcceleration(this.getEntityBoundingBox(), Material.water, this);
    }
    
    @Override
    public void onCollideWithPlayer(final EntityPlayer lllllllllllllIIlIllIlIIIlIIlIIIl) {
        if (llIlIllIIlIlIlI(this.worldObj.isRemote ? 1 : 0) && llIlIllIIlIlIlI(this.delayBeforeCanPickup) && llIlIllIIlIlIlI(lllllllllllllIIlIllIlIIIlIIlIIIl.xpCooldown)) {
            lllllllllllllIIlIllIlIIIlIIlIIIl.xpCooldown = EntityXPOrb.lIIllIIIlIIlIl[9];
            this.worldObj.playSoundAtEntity(lllllllllllllIIlIllIlIIIlIIlIIIl, EntityXPOrb.lIIllIIIIllllI[EntityXPOrb.lIIllIIIlIIlIl[13]], 0.1f, 0.5f * ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7f + 1.8f));
            lllllllllllllIIlIllIlIIIlIIlIIIl.onItemPickup(this, EntityXPOrb.lIIllIIIlIIlIl[5]);
            lllllllllllllIIlIllIlIIIlIIlIIIl.addExperience(this.xpValue);
            this.setDead();
        }
    }
    
    @Override
    protected void entityInit() {
    }
}
