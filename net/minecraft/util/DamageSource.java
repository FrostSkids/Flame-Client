// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.Explosion;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityFireball;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DamageSource
{
    private /* synthetic */ boolean difficultyScaled;
    public static /* synthetic */ DamageSource lightningBolt;
    public static /* synthetic */ DamageSource lava;
    private /* synthetic */ boolean explosion;
    public static /* synthetic */ DamageSource inFire;
    public static /* synthetic */ DamageSource wither;
    public static /* synthetic */ DamageSource generic;
    private /* synthetic */ boolean magicDamage;
    public static /* synthetic */ DamageSource outOfWorld;
    public static /* synthetic */ DamageSource fall;
    public static /* synthetic */ DamageSource onFire;
    public static /* synthetic */ DamageSource inWall;
    private /* synthetic */ boolean projectile;
    private static final /* synthetic */ int[] lIIlIllIllllll;
    public static /* synthetic */ DamageSource drown;
    public static /* synthetic */ DamageSource cactus;
    public static /* synthetic */ DamageSource starve;
    public /* synthetic */ String damageType;
    private /* synthetic */ boolean isUnblockable;
    private static final /* synthetic */ String[] lIIlIllIllIlIl;
    private /* synthetic */ boolean damageIsAbsolute;
    private /* synthetic */ boolean isDamageAllowedInCreativeMode;
    private /* synthetic */ float hungerDamage;
    public static /* synthetic */ DamageSource anvil;
    public static /* synthetic */ DamageSource fallingBlock;
    public static /* synthetic */ DamageSource magic;
    private /* synthetic */ boolean fireDamage;
    
    private static String llIlIIllIIlllll(String lllllllllllllIIllIIIIllllIIIIIIl, final String lllllllllllllIIllIIIIllllIIIIlIl) {
        lllllllllllllIIllIIIIllllIIIIIIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIIIllllIIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIIllllIIIIlII = new StringBuilder();
        final char[] lllllllllllllIIllIIIIllllIIIIIll = lllllllllllllIIllIIIIllllIIIIlIl.toCharArray();
        int lllllllllllllIIllIIIIllllIIIIIlI = DamageSource.lIIlIllIllllll[0];
        final int lllllllllllllIIllIIIIlllIlllllII = (Object)((String)lllllllllllllIIllIIIIllllIIIIIIl).toCharArray();
        final int lllllllllllllIIllIIIIlllIllllIll = lllllllllllllIIllIIIIlllIlllllII.length;
        short lllllllllllllIIllIIIIlllIllllIlI = (short)DamageSource.lIIlIllIllllll[0];
        while (llIlIIlllIIIlII(lllllllllllllIIllIIIIlllIllllIlI, lllllllllllllIIllIIIIlllIllllIll)) {
            final char lllllllllllllIIllIIIIllllIIIIlll = lllllllllllllIIllIIIIlllIlllllII[lllllllllllllIIllIIIIlllIllllIlI];
            lllllllllllllIIllIIIIllllIIIIlII.append((char)(lllllllllllllIIllIIIIllllIIIIlll ^ lllllllllllllIIllIIIIllllIIIIIll[lllllllllllllIIllIIIIllllIIIIIlI % lllllllllllllIIllIIIIllllIIIIIll.length]));
            "".length();
            ++lllllllllllllIIllIIIIllllIIIIIlI;
            ++lllllllllllllIIllIIIIlllIllllIlI;
            "".length();
            if (((0x23 ^ 0x6D ^ (0xEC ^ 0xA9)) & (0x39 ^ 0x1 ^ (0x57 ^ 0x64) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIIllllIIIIlII);
    }
    
    public static DamageSource causeFireballDamage(final EntityFireball lllllllllllllIIllIIIlIIIIIIlIlIl, final Entity lllllllllllllIIllIIIlIIIIIIlIlII) {
        DamageSource damageSource;
        if (llIlIIlllIIIIIl(lllllllllllllIIllIIIlIIIIIIlIlII)) {
            damageSource = new EntityDamageSourceIndirect(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[18]], lllllllllllllIIllIIIlIIIIIIlIlIl, lllllllllllllIIllIIIlIIIIIIlIlIl).setFireDamage().setProjectile();
            "".length();
            if (" ".length() == (0x24 ^ 0x20)) {
                return null;
            }
        }
        else {
            damageSource = new EntityDamageSourceIndirect(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[19]], lllllllllllllIIllIIIlIIIIIIlIlIl, lllllllllllllIIllIIIlIIIIIIlIlII).setFireDamage().setProjectile();
        }
        return damageSource;
    }
    
    public static DamageSource causePlayerDamage(final EntityPlayer lllllllllllllIIllIIIlIIIIIIlllll) {
        return new EntityDamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[16]], lllllllllllllIIllIIIlIIIIIIlllll);
    }
    
    private static boolean llIlIIlllIIIIlI(final Object lllllllllllllIIllIIIIlllIlllIIll) {
        return lllllllllllllIIllIIIIlllIlllIIll != null;
    }
    
    public static DamageSource causeArrowDamage(final EntityArrow lllllllllllllIIllIIIlIIIIIIllIll, final Entity lllllllllllllIIllIIIlIIIIIIllIlI) {
        return new EntityDamageSourceIndirect(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[17]], lllllllllllllIIllIIIlIIIIIIllIll, lllllllllllllIIllIIIlIIIIIIllIlI).setProjectile();
    }
    
    public static DamageSource causeThrownDamage(final Entity lllllllllllllIIllIIIlIIIIIIIllll, final Entity lllllllllllllIIllIIIlIIIIIIIlllI) {
        return new EntityDamageSourceIndirect(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[20]], lllllllllllllIIllIIIlIIIIIIIllll, lllllllllllllIIllIIIlIIIIIIIlllI).setProjectile();
    }
    
    public Entity getSourceOfDamage() {
        return this.getEntity();
    }
    
    private static String llIlIIllIlIIIII(final String lllllllllllllIIllIIIIllllIlIIIIl, final String lllllllllllllIIllIIIIllllIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIllllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIllllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIIIllllIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIIIllllIlIIlIl.init(DamageSource.lIIlIllIllllll[2], lllllllllllllIIllIIIIllllIlIIllI);
            return new String(lllllllllllllIIllIIIIllllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIllllIlIIlII) {
            lllllllllllllIIllIIIIllllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    public boolean canHarmInCreative() {
        return this.isDamageAllowedInCreativeMode;
    }
    
    private static String llIlIIllIlIIIll(final String lllllllllllllIIllIIIIllllIIlIllI, final String lllllllllllllIIllIIIIllllIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIllllIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8)), DamageSource.lIIlIllIllllll[8]), "DES");
            final Cipher lllllllllllllIIllIIIIllllIIllIII = Cipher.getInstance("DES");
            lllllllllllllIIllIIIIllllIIllIII.init(DamageSource.lIIlIllIllllll[2], lllllllllllllIIllIIIIllllIIllIIl);
            return new String(lllllllllllllIIllIIIIllllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIllllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIllllIIlIlll) {
            lllllllllllllIIllIIIIllllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIlIIlllIIIIII();
        llIlIIllIllllll();
        DamageSource.inFire = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[0]]).setFireDamage();
        DamageSource.lightningBolt = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[1]]);
        DamageSource.onFire = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[2]]).setDamageBypassesArmor().setFireDamage();
        DamageSource.lava = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[3]]).setFireDamage();
        DamageSource.inWall = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[4]]).setDamageBypassesArmor();
        DamageSource.drown = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[5]]).setDamageBypassesArmor();
        DamageSource.starve = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[6]]).setDamageBypassesArmor().setDamageIsAbsolute();
        DamageSource.cactus = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[7]]);
        DamageSource.fall = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[8]]).setDamageBypassesArmor();
        DamageSource.outOfWorld = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[9]]).setDamageBypassesArmor().setDamageAllowedInCreativeMode();
        DamageSource.generic = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[10]]).setDamageBypassesArmor();
        DamageSource.magic = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[11]]).setDamageBypassesArmor().setMagicDamage();
        DamageSource.wither = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[12]]).setDamageBypassesArmor();
        DamageSource.anvil = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[13]]);
        DamageSource.fallingBlock = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[14]]);
    }
    
    public boolean isFireDamage() {
        return this.fireDamage;
    }
    
    public static DamageSource causeThornsDamage(final Entity lllllllllllllIIllIIIlIIIIIIIIIll) {
        return new EntityDamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[22]], lllllllllllllIIllIIIlIIIIIIIIIll).setIsThornsDamage().setMagicDamage();
    }
    
    public boolean isCreativePlayer() {
        final Entity lllllllllllllIIllIIIIllllIlIllIl = this.getEntity();
        if (llIlIIlllIIIIll((lllllllllllllIIllIIIIllllIlIllIl instanceof EntityPlayer) ? 1 : 0) && llIlIIlllIIIIll(((EntityPlayer)lllllllllllllIIllIIIIllllIlIllIl).capabilities.isCreativeMode ? 1 : 0)) {
            return DamageSource.lIIlIllIllllll[1] != 0;
        }
        return DamageSource.lIIlIllIllllll[0] != 0;
    }
    
    public DamageSource setProjectile() {
        this.projectile = (DamageSource.lIIlIllIllllll[1] != 0);
        return this;
    }
    
    private static boolean llIlIIlllIIIIll(final int lllllllllllllIIllIIIIlllIllIllll) {
        return lllllllllllllIIllIIIIlllIllIllll != 0;
    }
    
    protected DamageSource(final String lllllllllllllIIllIIIIllllllIIlII) {
        this.hungerDamage = 0.3f;
        this.damageType = lllllllllllllIIllIIIIllllllIIlII;
    }
    
    public boolean isMagicDamage() {
        return this.magicDamage;
    }
    
    public static DamageSource setExplosionSource(final Explosion lllllllllllllIIllIIIlIIIIIIIIIII) {
        DamageSource damageSource;
        if (llIlIIlllIIIIlI(lllllllllllllIIllIIIlIIIIIIIIIII) && llIlIIlllIIIIlI(lllllllllllllIIllIIIlIIIIIIIIIII.getExplosivePlacedBy())) {
            damageSource = new EntityDamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[23]], lllllllllllllIIllIIIlIIIIIIIIIII.getExplosivePlacedBy()).setDifficultyScaled().setExplosion();
            "".length();
            if (((0x4D ^ 0x1B) & ~(0xF6 ^ 0xA0)) == "  ".length()) {
                return null;
            }
        }
        else {
            damageSource = new DamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[24]]).setDifficultyScaled().setExplosion();
        }
        return damageSource;
    }
    
    public DamageSource setDifficultyScaled() {
        this.difficultyScaled = (DamageSource.lIIlIllIllllll[1] != 0);
        return this;
    }
    
    public boolean isProjectile() {
        return this.projectile;
    }
    
    public IChatComponent getDeathMessage(final EntityLivingBase lllllllllllllIIllIIIIlllllIIlIll) {
        final EntityLivingBase lllllllllllllIIllIIIIlllllIIlIlI = lllllllllllllIIllIIIIlllllIIlIll.func_94060_bK();
        final String lllllllllllllIIllIIIIlllllIIlIIl = String.valueOf(new StringBuilder(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[25]]).append(this.damageType));
        final String lllllllllllllIIllIIIIlllllIIlIII = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIllIIIIlllllIIlIIl)).append(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[26]]));
        ChatComponentTranslation chatComponentTranslation;
        if (llIlIIlllIIIIlI(lllllllllllllIIllIIIIlllllIIlIlI) && llIlIIlllIIIIll(StatCollector.canTranslate(lllllllllllllIIllIIIIlllllIIlIII) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI;
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl;
            chatComponentTranslation = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIlIIlIlllIIlIIIIIlI = lllllllllllllIIllIIIIlllllIIlIII;
            lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[DamageSource.lIIlIllIllllll[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[DamageSource.lIIlIllIllllll[0]] = lllllllllllllIIllIIIIlllllIIlIll.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl[DamageSource.lIIlIllIllllll[1]] = lllllllllllllIIllIIIIlllllIIlIlI.getDisplayName();
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2;
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2;
            chatComponentTranslation = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
            lllllllllllllIlIIlIlllIIlIIIIIlI2 = lllllllllllllIIllIIIIlllllIIlIIl;
            lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[DamageSource.lIIlIllIllllll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[DamageSource.lIIlIllIllllll[0]] = lllllllllllllIIllIIIIlllllIIlIll.getDisplayName();
        }
        return chatComponentTranslation;
    }
    
    private static boolean llIlIIlllIIIlII(final int lllllllllllllIIllIIIIlllIlllIllI, final int lllllllllllllIIllIIIIlllIlllIlIl) {
        return lllllllllllllIIllIIIIlllIlllIllI < lllllllllllllIIllIIIIlllIlllIlIl;
    }
    
    public Entity getEntity() {
        return null;
    }
    
    public boolean isDifficultyScaled() {
        return this.difficultyScaled;
    }
    
    public static DamageSource causeMobDamage(final EntityLivingBase lllllllllllllIIllIIIlIIIIIlIIIlI) {
        return new EntityDamageSource(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[15]], lllllllllllllIIllIIIlIIIIIlIIIlI);
    }
    
    protected DamageSource setFireDamage() {
        this.fireDamage = (DamageSource.lIIlIllIllllll[1] != 0);
        return this;
    }
    
    public boolean isDamageAbsolute() {
        return this.damageIsAbsolute;
    }
    
    public float getHungerDamage() {
        return this.hungerDamage;
    }
    
    public static DamageSource causeIndirectMagicDamage(final Entity lllllllllllllIIllIIIlIIIIIIIlIIl, final Entity lllllllllllllIIllIIIlIIIIIIIIllI) {
        return new EntityDamageSourceIndirect(DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[21]], lllllllllllllIIllIIIlIIIIIIIlIIl, lllllllllllllIIllIIIlIIIIIIIIllI).setDamageBypassesArmor().setMagicDamage();
    }
    
    protected DamageSource setDamageBypassesArmor() {
        this.isUnblockable = (DamageSource.lIIlIllIllllll[1] != 0);
        this.hungerDamage = 0.0f;
        return this;
    }
    
    public boolean isExplosion() {
        return this.explosion;
    }
    
    protected DamageSource setDamageIsAbsolute() {
        this.damageIsAbsolute = (DamageSource.lIIlIllIllllll[1] != 0);
        this.hungerDamage = 0.0f;
        return this;
    }
    
    private static void llIlIIlllIIIIII() {
        (lIIlIllIllllll = new int[28])[0] = ((31 + 98 + 7 + 45 ^ 133 + 1 - 49 + 51) & (0x2B ^ 0x66 ^ (0xE6 ^ 0x96) ^ -" ".length()));
        DamageSource.lIIlIllIllllll[1] = " ".length();
        DamageSource.lIIlIllIllllll[2] = "  ".length();
        DamageSource.lIIlIllIllllll[3] = "   ".length();
        DamageSource.lIIlIllIllllll[4] = (0x18 ^ 0x9 ^ (0xAD ^ 0xB8));
        DamageSource.lIIlIllIllllll[5] = (0x81 ^ 0x84);
        DamageSource.lIIlIllIllllll[6] = (0x26 ^ 0x20);
        DamageSource.lIIlIllIllllll[7] = (0x4A ^ 0x4E ^ "   ".length());
        DamageSource.lIIlIllIllllll[8] = (38 + 68 - 39 + 80 ^ 151 + 148 - 174 + 30);
        DamageSource.lIIlIllIllllll[9] = (128 + 4 - 92 + 122 ^ 159 + 114 - 238 + 136);
        DamageSource.lIIlIllIllllll[10] = (0x70 ^ 0x7A);
        DamageSource.lIIlIllIllllll[11] = (0x46 ^ 0x4D);
        DamageSource.lIIlIllIllllll[12] = (0xF9 ^ 0x85 ^ (0x6 ^ 0x76));
        DamageSource.lIIlIllIllllll[13] = (0x69 ^ 0x64);
        DamageSource.lIIlIllIllllll[14] = (77 + 33 + 9 + 12 ^ 82 + 95 - 103 + 67);
        DamageSource.lIIlIllIllllll[15] = (0x2D ^ 0x6A ^ (0x78 ^ 0x30));
        DamageSource.lIIlIllIllllll[16] = (0x90 ^ 0xA7 ^ (0x3 ^ 0x24));
        DamageSource.lIIlIllIllllll[17] = (0xBB ^ 0xAA);
        DamageSource.lIIlIllIllllll[18] = (0xA9 ^ 0xBB);
        DamageSource.lIIlIllIllllll[19] = (0x78 ^ 0x0 ^ (0x11 ^ 0x7A));
        DamageSource.lIIlIllIllllll[20] = (20 + 16 + 5 + 96 ^ 62 + 44 + 3 + 48);
        DamageSource.lIIlIllIllllll[21] = (0xB4 ^ 0xA1);
        DamageSource.lIIlIllIllllll[22] = (0xB7 ^ 0xA1);
        DamageSource.lIIlIllIllllll[23] = (0xA1 ^ 0xC6 ^ (0xEF ^ 0x9F));
        DamageSource.lIIlIllIllllll[24] = (0x2C ^ 0x3A ^ (0x52 ^ 0x5C));
        DamageSource.lIIlIllIllllll[25] = (0x5B ^ 0x42);
        DamageSource.lIIlIllIllllll[26] = (0x1A ^ 0x70 ^ (0x46 ^ 0x36));
        DamageSource.lIIlIllIllllll[27] = (0xA8 ^ 0xB3);
    }
    
    public DamageSource setMagicDamage() {
        this.magicDamage = (DamageSource.lIIlIllIllllll[1] != 0);
        return this;
    }
    
    public DamageSource setExplosion() {
        this.explosion = (DamageSource.lIIlIllIllllll[1] != 0);
        return this;
    }
    
    public boolean isUnblockable() {
        return this.isUnblockable;
    }
    
    protected DamageSource setDamageAllowedInCreativeMode() {
        this.isDamageAllowedInCreativeMode = (DamageSource.lIIlIllIllllll[1] != 0);
        return this;
    }
    
    public String getDamageType() {
        return this.damageType;
    }
    
    private static void llIlIIllIllllll() {
        (lIIlIllIllIlIl = new String[DamageSource.lIIlIllIllllll[27]])[DamageSource.lIIlIllIllllll[0]] = llIlIIllIIlllll("ISIWAh8t", "HLPkm");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[1]] = llIlIIllIlIIIII("IvLFr4IBC5C2CF9etlGUjg==", "IbXPG");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[2]] = llIlIIllIIlllll("Px8JID01", "PqOIO");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[3]] = llIlIIllIlIIIII("HuciI4unGLk=", "XUBAN");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[4]] = llIlIIllIlIIIII("MIx9/hgXbFk=", "fRSAU");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[5]] = llIlIIllIIlllll("LDAKFDs=", "HBecU");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[6]] = llIlIIllIlIIIII("BrUCGxw12Oo=", "TEssj");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[7]] = llIlIIllIIlllll("OQcHOCAp", "ZfdLU");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[8]] = llIlIIllIIlllll("EzkmPw==", "uXJSp");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[9]] = llIlIIllIIlllll("IjgzASQaIjUiJg==", "MMGNB");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[10]] = llIlIIllIlIIIII("rbSw6X4B9rE=", "GNmyP");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[11]] = llIlIIllIIlllll("Fw4tHBY=", "zoJuu");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[12]] = llIlIIllIlIIIll("Zm5A5iUzEjQ=", "xIBFz");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[13]] = llIlIIllIIlllll("KAsdIjs=", "IekKW");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[14]] = llIlIIllIlIIIII("xdk1op/yDbl7zGdc2VTESA==", "PJxwj");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[15]] = llIlIIllIIlllll("IBcK", "MxhMP");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[16]] = llIlIIllIlIIIll("DCld4Bymq7k=", "XKvoN");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[17]] = llIlIIllIlIIIll("C9hGBbqW6Hc=", "DeBHN");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[18]] = llIlIIllIIlllll("JykuBCgt", "HGhmZ");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[19]] = llIlIIllIlIIIll("S17eRc5I7MAS+EDRKoLNxg==", "RuamG");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[20]] = llIlIIllIIlllll("OwI8OxIh", "OjNTe");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[21]] = llIlIIllIlIIIII("V5RvVoABhNlwXfiaZ3jy3g==", "ofdPm");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[22]] = llIlIIllIIlllll("PiIdFBc5", "JJrfy");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[23]] = llIlIIllIlIIIll("SwswhHNAgLp5aGVnsfQdonTm8k3oIkWd", "RVRKz");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[24]] = llIlIIllIlIIIII("7A+LtoYdf5GEWd2fQXPJuQ==", "pwJtn");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[25]] = llIlIIllIIlllll("CQgPJRhDDBolEQ4GQA==", "mmnQp");
        DamageSource.lIIlIllIllIlIl[DamageSource.lIIlIllIllllll[26]] = llIlIIllIIlllll("eDomLQ0zOA==", "VJJLt");
    }
    
    private static boolean llIlIIlllIIIIIl(final Object lllllllllllllIIllIIIIlllIlllIIIl) {
        return lllllllllllllIIllIIIIlllIlllIIIl == null;
    }
}
