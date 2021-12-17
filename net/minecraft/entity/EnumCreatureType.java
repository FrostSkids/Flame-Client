// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.monster.IMob;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.IAnimals;

public enum EnumCreatureType
{
    private final /* synthetic */ boolean isPeacefulCreature;
    
    AMBIENT((Class<? extends IAnimals>)EntityAmbientCreature.class, EnumCreatureType.lIllIIIlIlllIl[5], Material.air, (boolean)(EnumCreatureType.lIllIIIlIlllIl[2] != 0), (boolean)(EnumCreatureType.lIllIIIlIlllIl[0] != 0));
    
    private final /* synthetic */ boolean isAnimal;
    private static final /* synthetic */ String[] lIllIIIlIlllII;
    private static final /* synthetic */ int[] lIllIIIlIlllIl;
    
    MONSTER((Class<? extends IAnimals>)IMob.class, EnumCreatureType.lIllIIIlIlllIl[1], Material.air, (boolean)(EnumCreatureType.lIllIIIlIlllIl[0] != 0), (boolean)(EnumCreatureType.lIllIIIlIlllIl[0] != 0));
    
    private final /* synthetic */ int maxNumberOfCreature;
    
    WATER_CREATURE((Class<? extends IAnimals>)EntityWaterMob.class, EnumCreatureType.lIllIIIlIlllIl[7], Material.water, (boolean)(EnumCreatureType.lIllIIIlIlllIl[2] != 0), (boolean)(EnumCreatureType.lIllIIIlIlllIl[0] != 0)), 
    CREATURE((Class<? extends IAnimals>)EntityAnimal.class, EnumCreatureType.lIllIIIlIlllIl[3], Material.air, (boolean)(EnumCreatureType.lIllIIIlIlllIl[2] != 0), (boolean)(EnumCreatureType.lIllIIIlIlllIl[2] != 0));
    
    private final /* synthetic */ Class<? extends IAnimals> creatureClass;
    private final /* synthetic */ Material creatureMaterial;
    
    static {
        lllllIIIIlIIIll();
        lllllIIIIlIIIlI();
        final EnumCreatureType[] enum$VALUES = new EnumCreatureType[EnumCreatureType.lIllIIIlIlllIl[8]];
        enum$VALUES[EnumCreatureType.lIllIIIlIlllIl[0]] = EnumCreatureType.MONSTER;
        enum$VALUES[EnumCreatureType.lIllIIIlIlllIl[2]] = EnumCreatureType.CREATURE;
        enum$VALUES[EnumCreatureType.lIllIIIlIlllIl[4]] = EnumCreatureType.AMBIENT;
        enum$VALUES[EnumCreatureType.lIllIIIlIlllIl[6]] = EnumCreatureType.WATER_CREATURE;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static String lllllIIIIlIIIII(final String lllllllllllllIIIIIllIIIIIllllIII, final String lllllllllllllIIIIIllIIIIIlllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIIIIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIIIIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIIIIIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIIIIIllllIlI.init(EnumCreatureType.lIllIIIlIlllIl[4], lllllllllllllIIIIIllIIIIIllllIll);
            return new String(lllllllllllllIIIIIllIIIIIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIIIIllllIIl) {
            lllllllllllllIIIIIllIIIIIllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lllllIIIIlIIIIl(String lllllllllllllIIIIIllIIIIlIIIlIII, final String lllllllllllllIIIIIllIIIIlIIIIlll) {
        lllllllllllllIIIIIllIIIIlIIIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIIIIlIIIlIll = new StringBuilder();
        final char[] lllllllllllllIIIIIllIIIIlIIIlIlI = lllllllllllllIIIIIllIIIIlIIIIlll.toCharArray();
        int lllllllllllllIIIIIllIIIIlIIIlIIl = EnumCreatureType.lIllIIIlIlllIl[0];
        final Exception lllllllllllllIIIIIllIIIIlIIIIIll = (Object)lllllllllllllIIIIIllIIIIlIIIlIII.toCharArray();
        final byte lllllllllllllIIIIIllIIIIlIIIIIlI = (byte)lllllllllllllIIIIIllIIIIlIIIIIll.length;
        float lllllllllllllIIIIIllIIIIlIIIIIIl = EnumCreatureType.lIllIIIlIlllIl[0];
        while (lllllIIIIlIIlII((int)lllllllllllllIIIIIllIIIIlIIIIIIl, lllllllllllllIIIIIllIIIIlIIIIIlI)) {
            final char lllllllllllllIIIIIllIIIIlIIIlllI = lllllllllllllIIIIIllIIIIlIIIIIll[lllllllllllllIIIIIllIIIIlIIIIIIl];
            lllllllllllllIIIIIllIIIIlIIIlIll.append((char)(lllllllllllllIIIIIllIIIIlIIIlllI ^ lllllllllllllIIIIIllIIIIlIIIlIlI[lllllllllllllIIIIIllIIIIlIIIlIIl % lllllllllllllIIIIIllIIIIlIIIlIlI.length]));
            "".length();
            ++lllllllllllllIIIIIllIIIIlIIIlIIl;
            ++lllllllllllllIIIIIllIIIIlIIIIIIl;
            "".length();
            if (-(7 + 102 - 22 + 44 ^ 54 + 134 - 182 + 129) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIIIIlIIIlIll);
    }
    
    private static void lllllIIIIlIIIll() {
        (lIllIIIlIlllIl = new int[10])[0] = ((0x5B ^ 0xB ^ (0x84 ^ 0x99)) & (0x2B ^ 0x3B ^ (0x20 ^ 0x7D) ^ -" ".length()));
        EnumCreatureType.lIllIIIlIlllIl[1] = (0x1A ^ 0x6 ^ (0xF6 ^ 0xAC));
        EnumCreatureType.lIllIIIlIlllIl[2] = " ".length();
        EnumCreatureType.lIllIIIlIlllIl[3] = (0x1B ^ 0x50 ^ (0x5C ^ 0x1D));
        EnumCreatureType.lIllIIIlIlllIl[4] = "  ".length();
        EnumCreatureType.lIllIIIlIlllIl[5] = (0x98 ^ 0x97);
        EnumCreatureType.lIllIIIlIlllIl[6] = "   ".length();
        EnumCreatureType.lIllIIIlIlllIl[7] = (0x1B ^ 0x4D ^ (0xF9 ^ 0xAA));
        EnumCreatureType.lIllIIIlIlllIl[8] = (0x5A ^ 0x5E);
        EnumCreatureType.lIllIIIlIlllIl[9] = (0x22 ^ 0x3F ^ (0x38 ^ 0x2D));
    }
    
    public int getMaxNumberOfCreature() {
        return this.maxNumberOfCreature;
    }
    
    private static boolean lllllIIIIlIIlII(final int lllllllllllllIIIIIllIIIIIllIIIll, final int lllllllllllllIIIIIllIIIIIllIIIlI) {
        return lllllllllllllIIIIIllIIIIIllIIIll < lllllllllllllIIIIIllIIIIIllIIIlI;
    }
    
    public boolean getPeacefulCreature() {
        return this.isPeacefulCreature;
    }
    
    public boolean getAnimal() {
        return this.isAnimal;
    }
    
    private static String lllllIIIIIlllll(final String lllllllllllllIIIIIllIIIIIllIlIll, final String lllllllllllllIIIIIllIIIIIllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIIIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), EnumCreatureType.lIllIIIlIlllIl[9]), "DES");
            final Cipher lllllllllllllIIIIIllIIIIIllIllIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIllIIIIIllIllIl.init(EnumCreatureType.lIllIIIlIlllIl[4], lllllllllllllIIIIIllIIIIIllIlllI);
            return new String(lllllllllllllIIIIIllIIIIIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIIIIllIllII) {
            lllllllllllllIIIIIllIIIIIllIllII.printStackTrace();
            return null;
        }
    }
    
    private static void lllllIIIIlIIIlI() {
        (lIllIIIlIlllII = new String[EnumCreatureType.lIllIIIlIlllIl[8]])[EnumCreatureType.lIllIIIlIlllIl[0]] = lllllIIIIIlllll("9U4+/gn2ElE=", "zCgPs");
        EnumCreatureType.lIllIIIlIlllII[EnumCreatureType.lIllIIIlIlllIl[2]] = lllllIIIIlIIIII("koR7jmQ38A+MAufj/xvEUA==", "FjvqE");
        EnumCreatureType.lIllIIIlIlllII[EnumCreatureType.lIllIIIlIlllIl[4]] = lllllIIIIlIIIIl("IyIrHDEsOw==", "boiUt");
        EnumCreatureType.lIllIIIlIlllII[EnumCreatureType.lIllIIIlIlllIl[6]] = lllllIIIIIlllll("Gd4eoUxMaIVj5kUAc2AQjA==", "XFDLF");
    }
    
    public Class<? extends IAnimals> getCreatureClass() {
        return this.creatureClass;
    }
    
    private EnumCreatureType(final Class<? extends IAnimals> lllllllllllllIIIIIllIIIIlIlllIII, final int lllllllllllllIIIIIllIIIIlIllIlll, final Material lllllllllllllIIIIIllIIIIlIlIlllI, final boolean lllllllllllllIIIIIllIIIIlIllIlIl, final boolean lllllllllllllIIIIIllIIIIlIlIllII) {
        this.creatureClass = lllllllllllllIIIIIllIIIIlIlllIII;
        this.maxNumberOfCreature = lllllllllllllIIIIIllIIIIlIllIlll;
        this.creatureMaterial = lllllllllllllIIIIIllIIIIlIlIlllI;
        this.isPeacefulCreature = lllllllllllllIIIIIllIIIIlIllIlIl;
        this.isAnimal = lllllllllllllIIIIIllIIIIlIlIllII;
    }
}
