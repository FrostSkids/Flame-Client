// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class FoodStats
{
    private /* synthetic */ int foodLevel;
    private /* synthetic */ float foodExhaustionLevel;
    private static final /* synthetic */ String[] lIllIlIIIlllll;
    private /* synthetic */ int prevFoodLevel;
    private static final /* synthetic */ int[] lIllIlIIlIIIIl;
    private /* synthetic */ float foodSaturationLevel;
    private /* synthetic */ int foodTimer;
    
    private static boolean llllllIIIllIlIl(final int lllllllllllllIIIIIIIIllIIlllIlII) {
        return lllllllllllllIIIIIIIIllIIlllIlII <= 0;
    }
    
    public void readNBT(final NBTTagCompound lllllllllllllIIIIIIIIllIllIllllI) {
        if (llllllIIIllIIll(lllllllllllllIIIIIIIIllIllIllllI.hasKey(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[1]], FoodStats.lIllIlIIlIIIIl[5]) ? 1 : 0)) {
            this.foodLevel = lllllllllllllIIIIIIIIllIllIllllI.getInteger(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[6]]);
            this.foodTimer = lllllllllllllIIIIIIIIllIllIllllI.getInteger(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[7]]);
            this.foodSaturationLevel = lllllllllllllIIIIIIIIllIllIllllI.getFloat(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[8]]);
            this.foodExhaustionLevel = lllllllllllllIIIIIIIIllIllIllllI.getFloat(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[9]]);
        }
    }
    
    public void addStats(final int lllllllllllllIIIIIIIIllIlllllIlI, final float lllllllllllllIIIIIIIIllIllllIllI) {
        this.foodLevel = Math.min(lllllllllllllIIIIIIIIllIlllllIlI + this.foodLevel, FoodStats.lIllIlIIlIIIIl[0]);
        this.foodSaturationLevel = Math.min(this.foodSaturationLevel + lllllllllllllIIIIIIIIllIlllllIlI * lllllllllllllIIIIIIIIllIllllIllI * 2.0f, (float)this.foodLevel);
    }
    
    public void writeNBT(final NBTTagCompound lllllllllllllIIIIIIIIllIllIllIlI) {
        lllllllllllllIIIIIIIIllIllIllIlI.setInteger(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[10]], this.foodLevel);
        lllllllllllllIIIIIIIIllIllIllIlI.setInteger(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[11]], this.foodTimer);
        lllllllllllllIIIIIIIIllIllIllIlI.setFloat(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[12]], this.foodSaturationLevel);
        lllllllllllllIIIIIIIIllIllIllIlI.setFloat(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[13]], this.foodExhaustionLevel);
    }
    
    public void onUpdate(final EntityPlayer lllllllllllllIIIIIIIIllIlllIlIII) {
        final EnumDifficulty lllllllllllllIIIIIIIIllIlllIIlll = lllllllllllllIIIIIIIIllIlllIlIII.worldObj.getDifficulty();
        this.prevFoodLevel = this.foodLevel;
        if (llllllIIIllIIIl(llllllIIIllIIII(this.foodExhaustionLevel, 4.0f))) {
            this.foodExhaustionLevel -= 4.0f;
            if (llllllIIIllIIIl(llllllIIIllIIII(this.foodSaturationLevel, 0.0f))) {
                this.foodSaturationLevel = Math.max(this.foodSaturationLevel - 1.0f, 0.0f);
                "".length();
                if (((0x8F ^ 0xB8 ^ (0x21 ^ 0x43)) & (0x91 ^ 0x8B ^ (0xC2 ^ 0x8D) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (llllllIIIllIIlI(lllllllllllllIIIIIIIIllIlllIIlll, EnumDifficulty.PEACEFUL)) {
                this.foodLevel = Math.max(this.foodLevel - FoodStats.lIllIlIIlIIIIl[1], FoodStats.lIllIlIIlIIIIl[2]);
            }
        }
        if (llllllIIIllIIll(lllllllllllllIIIIIIIIllIlllIlIII.worldObj.getGameRules().getBoolean(FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[2]]) ? 1 : 0) && llllllIIIllIlII(this.foodLevel, FoodStats.lIllIlIIlIIIIl[3]) && llllllIIIllIIll(lllllllllllllIIIIIIIIllIlllIlIII.shouldHeal() ? 1 : 0)) {
            this.foodTimer += FoodStats.lIllIlIIlIIIIl[1];
            if (llllllIIIllIlII(this.foodTimer, FoodStats.lIllIlIIlIIIIl[4])) {
                lllllllllllllIIIIIIIIllIlllIlIII.heal(1.0f);
                this.addExhaustion(3.0f);
                this.foodTimer = FoodStats.lIllIlIIlIIIIl[2];
                "".length();
                if (" ".length() == (((0x24 ^ 0x6) & ~(0x7E ^ 0x5C)) ^ (0x7B ^ 0x7F))) {
                    return;
                }
            }
        }
        else if (llllllIIIllIlIl(this.foodLevel)) {
            this.foodTimer += FoodStats.lIllIlIIlIIIIl[1];
            if (llllllIIIllIlII(this.foodTimer, FoodStats.lIllIlIIlIIIIl[4])) {
                if (!llllllIIIllIlIl(llllllIIIllIIII(lllllllllllllIIIIIIIIllIlllIlIII.getHealth(), 10.0f)) || !llllllIIIllIIlI(lllllllllllllIIIIIIIIllIlllIIlll, EnumDifficulty.HARD) || (llllllIIIllIIIl(llllllIIIllIIII(lllllllllllllIIIIIIIIllIlllIlIII.getHealth(), 1.0f)) && llllllIIIllIllI(lllllllllllllIIIIIIIIllIlllIIlll, EnumDifficulty.NORMAL))) {
                    lllllllllllllIIIIIIIIllIlllIlIII.attackEntityFrom(DamageSource.starve, 1.0f);
                    "".length();
                }
                this.foodTimer = FoodStats.lIllIlIIlIIIIl[2];
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
        }
        else {
            this.foodTimer = FoodStats.lIllIlIIlIIIIl[2];
        }
    }
    
    public void setFoodSaturationLevel(final float lllllllllllllIIIIIIIIllIlIllllII) {
        this.foodSaturationLevel = lllllllllllllIIIIIIIIllIlIllllII;
    }
    
    public void setFoodLevel(final int lllllllllllllIIIIIIIIllIllIIIIII) {
        this.foodLevel = lllllllllllllIIIIIIIIllIllIIIIII;
    }
    
    public float getSaturationLevel() {
        return this.foodSaturationLevel;
    }
    
    private static String llllllIIIlIlIlI(final String lllllllllllllIIIIIIIIllIlIlIIlIl, final String lllllllllllllIIIIIIIIllIlIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIllIlIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIllIlIlIIlII.getBytes(StandardCharsets.UTF_8)), FoodStats.lIllIlIIlIIIIl[12]), "DES");
            final Cipher lllllllllllllIIIIIIIIllIlIlIIlll = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIIllIlIlIIlll.init(FoodStats.lIllIlIIlIIIIl[6], lllllllllllllIIIIIIIIllIlIlIlIII);
            return new String(lllllllllllllIIIIIIIIllIlIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIllIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIllIlIlIIllI) {
            lllllllllllllIIIIIIIIllIlIlIIllI.printStackTrace();
            return null;
        }
    }
    
    public void addStats(final ItemFood lllllllllllllIIIIIIIIllIllllIIIl, final ItemStack lllllllllllllIIIIIIIIllIlllIllIl) {
        this.addStats(lllllllllllllIIIIIIIIllIllllIIIl.getHealAmount(lllllllllllllIIIIIIIIllIlllIllIl), lllllllllllllIIIIIIIIllIllllIIIl.getSaturationModifier(lllllllllllllIIIIIIIIllIlllIllIl));
    }
    
    private static void llllllIIIlIllll() {
        (lIllIlIIlIIIIl = new int[15])[0] = (0x54 ^ 0x63 ^ (0x70 ^ 0x53));
        FoodStats.lIllIlIIlIIIIl[1] = " ".length();
        FoodStats.lIllIlIIlIIIIl[2] = ((0xE4 ^ 0xAA) & ~(0x78 ^ 0x36));
        FoodStats.lIllIlIIlIIIIl[3] = (0x82 ^ 0x90);
        FoodStats.lIllIlIIlIIIIl[4] = (0xFD ^ 0xAD);
        FoodStats.lIllIlIIlIIIIl[5] = (0xA6 ^ 0xC5);
        FoodStats.lIllIlIIlIIIIl[6] = "  ".length();
        FoodStats.lIllIlIIlIIIIl[7] = "   ".length();
        FoodStats.lIllIlIIlIIIIl[8] = (47 + 46 + 23 + 32 ^ 111 + 86 - 136 + 83);
        FoodStats.lIllIlIIlIIIIl[9] = (0x86 ^ 0xAB ^ (0x18 ^ 0x30));
        FoodStats.lIllIlIIlIIIIl[10] = (0x8A ^ 0x8C);
        FoodStats.lIllIlIIlIIIIl[11] = (0x82 ^ 0x85);
        FoodStats.lIllIlIIlIIIIl[12] = (0x4C ^ 0x44);
        FoodStats.lIllIlIIlIIIIl[13] = (0x72 ^ 0x7B);
        FoodStats.lIllIlIIlIIIIl[14] = (0x1D ^ 0x7C ^ (0x5D ^ 0x36));
    }
    
    public int getFoodLevel() {
        return this.foodLevel;
    }
    
    private static String llllllIIIlIlIIl(final String lllllllllllllIIIIIIIIllIlIllIIII, final String lllllllllllllIIIIIIIIllIlIlIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIllIlIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIllIlIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIllIlIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIllIlIllIlII.init(FoodStats.lIllIlIIlIIIIl[6], lllllllllllllIIIIIIIIllIlIllIlIl);
            return new String(lllllllllllllIIIIIIIIllIlIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIllIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIllIlIllIIll) {
            lllllllllllllIIIIIIIIllIlIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static void llllllIIIlIlIll() {
        (lIllIlIIIlllll = new String[FoodStats.lIllIlIIlIIIIl[14]])[FoodStats.lIllIlIIlIIIIl[2]] = llllllIIIlIlIII("Pic2EBsxKhAADjUoJxcIJC8tCw==", "PFBei");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[1]] = llllllIIIlIlIII("DBY2JQsPDzwt", "jyYAG");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[6]] = llllllIIIlIlIIl("X4IIPrE3tVcA/1RNIOjyAw==", "fMMKO");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[7]] = llllllIIIlIlIlI("NXE2T7bqmnGHWX/ruAWRtA==", "VAznW");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[8]] = llllllIIIlIlIIl("aMKZ65ATtAO0l/Ax9mNz1IPVc9nddQxo", "BAqRc");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[9]] = llllllIIIlIlIII("LB4BKTQyGQ84Aj4YASM9LwcLIQ==", "JqnMq");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[10]] = llllllIIIlIlIIl("PR6uQbbUm4IGNyLfRFdUCQ==", "EgBJK");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[11]] = llllllIIIlIlIlI("diToK1yg++ebBxl8hTj7bw==", "EpCbU");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[12]] = llllllIIIlIlIIl("ZbeHXkwwjXCvqmtQrqZnU9zYz5TRK3Eq", "htNrd");
        FoodStats.lIllIlIIIlllll[FoodStats.lIllIlIIlIIIIl[13]] = llllllIIIlIlIIl("UaaXwb+111CaMqxjyUiAGrnXZ8Y2Yi6j", "BTRCF");
    }
    
    private static String llllllIIIlIlIII(String lllllllllllllIIIIIIIIllIlIIlIlIl, final String lllllllllllllIIIIIIIIllIlIIIllll) {
        lllllllllllllIIIIIIIIllIlIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIIIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIIllIlIIlIIll = new StringBuilder();
        final char[] lllllllllllllIIIIIIIIllIlIIlIIlI = lllllllllllllIIIIIIIIllIlIIIllll.toCharArray();
        int lllllllllllllIIIIIIIIllIlIIlIIIl = FoodStats.lIllIlIIlIIIIl[2];
        final boolean lllllllllllllIIIIIIIIllIlIIIlIll = (Object)lllllllllllllIIIIIIIIllIlIIlIlIl.toCharArray();
        final int lllllllllllllIIIIIIIIllIlIIIlIlI = lllllllllllllIIIIIIIIllIlIIIlIll.length;
        Exception lllllllllllllIIIIIIIIllIlIIIlIIl = (Exception)FoodStats.lIllIlIIlIIIIl[2];
        while (llllllIIIllIlll((int)lllllllllllllIIIIIIIIllIlIIIlIIl, lllllllllllllIIIIIIIIllIlIIIlIlI)) {
            final char lllllllllllllIIIIIIIIllIlIIlIllI = lllllllllllllIIIIIIIIllIlIIIlIll[lllllllllllllIIIIIIIIllIlIIIlIIl];
            lllllllllllllIIIIIIIIllIlIIlIIll.append((char)(lllllllllllllIIIIIIIIllIlIIlIllI ^ lllllllllllllIIIIIIIIllIlIIlIIlI[lllllllllllllIIIIIIIIllIlIIlIIIl % lllllllllllllIIIIIIIIllIlIIlIIlI.length]));
            "".length();
            ++lllllllllllllIIIIIIIIllIlIIlIIIl;
            ++lllllllllllllIIIIIIIIllIlIIIlIIl;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIIllIlIIlIIll);
    }
    
    private static boolean llllllIIIllIllI(final Object lllllllllllllIIIIIIIIllIIllllIIl, final Object lllllllllllllIIIIIIIIllIIllllIII) {
        return lllllllllllllIIIIIIIIllIIllllIIl == lllllllllllllIIIIIIIIllIIllllIII;
    }
    
    private static boolean llllllIIIllIIIl(final int lllllllllllllIIIIIIIIllIIlllIIlI) {
        return lllllllllllllIIIIIIIIllIIlllIIlI > 0;
    }
    
    public int getPrevFoodLevel() {
        return this.prevFoodLevel;
    }
    
    private static int llllllIIIllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llllllIIIllIIlI(final Object lllllllllllllIIIIIIIIllIIlllllIl, final Object lllllllllllllIIIIIIIIllIIlllllII) {
        return lllllllllllllIIIIIIIIllIIlllllIl != lllllllllllllIIIIIIIIllIIlllllII;
    }
    
    private static boolean llllllIIIllIlII(final int lllllllllllllIIIIIIIIllIlIIIIlIl, final int lllllllllllllIIIIIIIIllIlIIIIlII) {
        return lllllllllllllIIIIIIIIllIlIIIIlIl >= lllllllllllllIIIIIIIIllIlIIIIlII;
    }
    
    private static boolean llllllIIIllIlll(final int lllllllllllllIIIIIIIIllIlIIIIIIl, final int lllllllllllllIIIIIIIIllIlIIIIIII) {
        return lllllllllllllIIIIIIIIllIlIIIIIIl < lllllllllllllIIIIIIIIllIlIIIIIII;
    }
    
    public boolean needFood() {
        if (llllllIIIllIlll(this.foodLevel, FoodStats.lIllIlIIlIIIIl[0])) {
            return FoodStats.lIllIlIIlIIIIl[1] != 0;
        }
        return FoodStats.lIllIlIIlIIIIl[2] != 0;
    }
    
    public void addExhaustion(final float lllllllllllllIIIIIIIIllIllIIlIll) {
        this.foodExhaustionLevel = Math.min(this.foodExhaustionLevel + lllllllllllllIIIIIIIIllIllIIlIll, 40.0f);
    }
    
    static {
        llllllIIIlIllll();
        llllllIIIlIlIll();
    }
    
    private static boolean llllllIIIllIIll(final int lllllllllllllIIIIIIIIllIIlllIllI) {
        return lllllllllllllIIIIIIIIllIIlllIllI != 0;
    }
    
    public FoodStats() {
        this.foodLevel = FoodStats.lIllIlIIlIIIIl[0];
        this.foodSaturationLevel = 5.0f;
        this.prevFoodLevel = FoodStats.lIllIlIIlIIIIl[0];
    }
}
