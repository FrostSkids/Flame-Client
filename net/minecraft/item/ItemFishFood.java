// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;

public class ItemFishFood extends ItemFood
{
    private final /* synthetic */ boolean cooked;
    private static final /* synthetic */ String[] llIlIIIIlIlIII;
    private static final /* synthetic */ int[] llIlIIIIllIIII;
    
    @Override
    public String getUnlocalizedName(final ItemStack llllllllllllIllIllIlIllIllIIIlll) {
        final FishType llllllllllllIllIllIlIllIllIIIllI = FishType.byItemStack(llllllllllllIllIllIlIllIllIIIlll);
        final StringBuilder append = new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[5]]).append(llllllllllllIllIllIlIllIllIIIllI.getUnlocalizedName()).append(ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[4]]);
        String str;
        if (lIIlIIIlIlllIIIl(this.cooked ? 1 : 0) && lIIlIIIlIlllIIIl(llllllllllllIllIllIlIllIllIIIllI.canCook() ? 1 : 0)) {
            str = ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[2]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            str = ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[6]];
        }
        return String.valueOf(append.append(str));
    }
    
    private static void lIIlIIIlIllIIlIl() {
        (llIlIIIIlIlIII = new String[ItemFishFood.llIlIIIIllIIII[7]])[ItemFishFood.llIlIIIIllIIII[0]] = lIIlIIIlIlIlIlll("Q0UuXp6jQZALBd5XJY6xKQ==", "UANLg");
        ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[5]] = lIIlIIIlIlIllIII("eg==", "TMTxF");
        ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[4]] = lIIlIIIlIlIlIlll("rFlImGdPCM0=", "qFoOn");
        ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[2]] = lIIlIIIlIlIllIlI("5aKdNtFQ3hg=", "hMwCd");
        ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[6]] = lIIlIIIlIlIlIlll("MP/vsY8873g=", "TphSy");
    }
    
    static {
        lIIlIIIlIlllIIII();
        lIIlIIIlIllIIlIl();
    }
    
    @Override
    public void getSubItems(final Item llllllllllllIllIllIlIllIllIlIlIl, final CreativeTabs llllllllllllIllIllIlIllIllIlIlII, final List<ItemStack> llllllllllllIllIllIlIllIllIlIIll) {
        final String llllllllllllIllIllIlIllIllIIllII;
        final short llllllllllllIllIllIlIllIllIIllIl = (short)((FishType[])(Object)(llllllllllllIllIllIlIllIllIIllII = (String)(Object)FishType.values())).length;
        String llllllllllllIllIllIlIllIllIIlllI = (String)ItemFishFood.llIlIIIIllIIII[0];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!lIIlIIIlIlllIIll((int)llllllllllllIllIllIlIllIllIIlllI, llllllllllllIllIllIlIllIllIIllIl)) {
            final FishType llllllllllllIllIllIlIllIllIlIIlI = llllllllllllIllIllIlIllIllIIllII[llllllllllllIllIllIlIllIllIIlllI];
            if (!lIIlIIIlIlllIIIl(this.cooked ? 1 : 0) || lIIlIIIlIlllIIIl(llllllllllllIllIllIlIllIllIlIIlI.canCook() ? 1 : 0)) {
                llllllllllllIllIllIlIllIllIlIIll.add(new ItemStack(this, ItemFishFood.llIlIIIIllIIII[5], llllllllllllIllIllIlIllIllIlIIlI.getMetadata()));
                "".length();
            }
            ++llllllllllllIllIllIlIllIllIIlllI;
        }
    }
    
    private static boolean lIIlIIIlIlllIlII(final int llllllllllllIllIllIlIllIlIIIlIlI, final int llllllllllllIllIllIlIllIlIIIlIIl) {
        return llllllllllllIllIllIlIllIlIIIlIlI < llllllllllllIllIllIlIllIlIIIlIIl;
    }
    
    private static String lIIlIIIlIlIllIII(String llllllllllllIllIllIlIllIlIIllIIl, final String llllllllllllIllIllIlIllIlIIllIII) {
        llllllllllllIllIllIlIllIlIIllIIl = new String(Base64.getDecoder().decode(llllllllllllIllIllIlIllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIlIllIlIIlllII = new StringBuilder();
        final char[] llllllllllllIllIllIlIllIlIIllIll = llllllllllllIllIllIlIllIlIIllIII.toCharArray();
        int llllllllllllIllIllIlIllIlIIllIlI = ItemFishFood.llIlIIIIllIIII[0];
        final byte llllllllllllIllIllIlIllIlIIlIlII = (Object)llllllllllllIllIllIlIllIlIIllIIl.toCharArray();
        final char llllllllllllIllIllIlIllIlIIlIIll = (char)llllllllllllIllIllIlIllIlIIlIlII.length;
        float llllllllllllIllIllIlIllIlIIlIIlI = ItemFishFood.llIlIIIIllIIII[0];
        while (lIIlIIIlIlllIlII((int)llllllllllllIllIllIlIllIlIIlIIlI, llllllllllllIllIllIlIllIlIIlIIll)) {
            final char llllllllllllIllIllIlIllIlIIlllll = llllllllllllIllIllIlIllIlIIlIlII[llllllllllllIllIllIlIllIlIIlIIlI];
            llllllllllllIllIllIlIllIlIIlllII.append((char)(llllllllllllIllIllIlIllIlIIlllll ^ llllllllllllIllIllIlIllIlIIllIll[llllllllllllIllIllIlIllIlIIllIlI % llllllllllllIllIllIlIllIlIIllIll.length]));
            "".length();
            ++llllllllllllIllIllIlIllIlIIllIlI;
            ++llllllllllllIllIllIlIllIlIIlIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIlIllIlIIlllII);
    }
    
    private static boolean lIIlIIIlIlllIIlI(final Object llllllllllllIllIllIlIllIlIIIIllI, final Object llllllllllllIllIllIlIllIlIIIIlIl) {
        return llllllllllllIllIllIlIllIlIIIIllI == llllllllllllIllIllIlIllIlIIIIlIl;
    }
    
    @Override
    public float getSaturationModifier(final ItemStack llllllllllllIllIllIlIllIllllIIIl) {
        final FishType llllllllllllIllIllIlIllIllllIIll = FishType.byItemStack(llllllllllllIllIllIlIllIllllIIIl);
        float n;
        if (lIIlIIIlIlllIIIl(this.cooked ? 1 : 0) && lIIlIIIlIlllIIIl(llllllllllllIllIllIlIllIllllIIll.canCook() ? 1 : 0)) {
            n = llllllllllllIllIllIlIllIllllIIll.getCookedSaturationModifier();
            "".length();
            if (" ".length() != " ".length()) {
                return 0.0f;
            }
        }
        else {
            n = llllllllllllIllIllIlIllIllllIIll.getUncookedSaturationModifier();
        }
        return n;
    }
    
    private static boolean lIIlIIIlIlllIIIl(final int llllllllllllIllIllIlIllIlIIIIIll) {
        return llllllllllllIllIllIlIllIlIIIIIll != 0;
    }
    
    private static String lIIlIIIlIlIllIlI(final String llllllllllllIllIllIlIllIlIlIlllI, final String llllllllllllIllIllIlIllIlIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIllIlIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIllIlIlIllIl.getBytes(StandardCharsets.UTF_8)), ItemFishFood.llIlIIIIllIIII[8]), "DES");
            final Cipher llllllllllllIllIllIlIllIlIllIIII = Cipher.getInstance("DES");
            llllllllllllIllIllIlIllIlIllIIII.init(ItemFishFood.llIlIIIIllIIII[4], llllllllllllIllIllIlIllIlIllIIIl);
            return new String(llllllllllllIllIllIlIllIlIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIllIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIllIlIlIllll) {
            llllllllllllIllIllIlIllIlIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIlIlllIIll(final int llllllllllllIllIllIlIllIlIIIlllI, final int llllllllllllIllIllIlIllIlIIIllIl) {
        return llllllllllllIllIllIlIllIlIIIlllI >= llllllllllllIllIllIlIllIlIIIllIl;
    }
    
    @Override
    public String getPotionEffect(final ItemStack llllllllllllIllIllIlIllIlllIllII) {
        String s;
        if (lIIlIIIlIlllIIlI(FishType.byItemStack(llllllllllllIllIllIlIllIlllIllII), FishType.PUFFERFISH)) {
            s = ItemFishFood.llIlIIIIlIlIII[ItemFishFood.llIlIIIIllIIII[0]];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        else {
            s = null;
        }
        return s;
    }
    
    @Override
    protected void onFoodEaten(final ItemStack llllllllllllIllIllIlIllIlllIIlIl, final World llllllllllllIllIllIlIllIllIlllll, final EntityPlayer llllllllllllIllIllIlIllIlllIIIll) {
        final FishType llllllllllllIllIllIlIllIlllIIIlI = FishType.byItemStack(llllllllllllIllIllIlIllIlllIIlIl);
        if (lIIlIIIlIlllIIlI(llllllllllllIllIllIlIllIlllIIIlI, FishType.PUFFERFISH)) {
            llllllllllllIllIllIlIllIlllIIIll.addPotionEffect(new PotionEffect(Potion.poison.id, ItemFishFood.llIlIIIIllIIII[1], ItemFishFood.llIlIIIIllIIII[2]));
            llllllllllllIllIllIlIllIlllIIIll.addPotionEffect(new PotionEffect(Potion.hunger.id, ItemFishFood.llIlIIIIllIIII[3], ItemFishFood.llIlIIIIllIIII[4]));
            llllllllllllIllIllIlIllIlllIIIll.addPotionEffect(new PotionEffect(Potion.confusion.id, ItemFishFood.llIlIIIIllIIII[3], ItemFishFood.llIlIIIIllIIII[5]));
        }
        super.onFoodEaten(llllllllllllIllIllIlIllIlllIIlIl, llllllllllllIllIllIlIllIllIlllll, llllllllllllIllIllIlIllIlllIIIll);
    }
    
    private static String lIIlIIIlIlIlIlll(final String llllllllllllIllIllIlIllIlIlllIll, final String llllllllllllIllIllIlIllIlIlllIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIllIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIllIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIlIllIlIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIlIllIlIllllIl.init(ItemFishFood.llIlIIIIllIIII[4], llllllllllllIllIllIlIllIlIlllllI);
            return new String(llllllllllllIllIllIlIllIlIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIllIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIllIlIllllII) {
            llllllllllllIllIllIlIllIlIllllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIlIlllIIII() {
        (llIlIIIIllIIII = new int[9])[0] = ((0x1 ^ 0x3E ^ (0x4 ^ 0x31)) & (0x38 ^ 0x78 ^ (0x5A ^ 0x10) ^ -" ".length()));
        ItemFishFood.llIlIIIIllIIII[1] = (0xFFFFBEB6 & 0x45F9);
        ItemFishFood.llIlIIIIllIIII[2] = "   ".length();
        ItemFishFood.llIlIIIIllIIII[3] = (-(0xFFFFFFFE & 0x7A93) & (0xFFFFFFBD & 0x7BFF));
        ItemFishFood.llIlIIIIllIIII[4] = "  ".length();
        ItemFishFood.llIlIIIIllIIII[5] = " ".length();
        ItemFishFood.llIlIIIIllIIII[6] = (0x5E ^ 0x5A);
        ItemFishFood.llIlIIIIllIIII[7] = (0xAD ^ 0x81 ^ (0x9B ^ 0xB2));
        ItemFishFood.llIlIIIIllIIII[8] = (0x22 ^ 0x2A);
    }
    
    public ItemFishFood(final boolean llllllllllllIllIllIlIlllIIIIIlII) {
        super(ItemFishFood.llIlIIIIllIIII[0], 0.0f, (boolean)(ItemFishFood.llIlIIIIllIIII[0] != 0));
        this.cooked = llllllllllllIllIllIlIlllIIIIIlII;
    }
    
    @Override
    public int getHealAmount(final ItemStack llllllllllllIllIllIlIllIlllllIlI) {
        final FishType llllllllllllIllIllIlIllIllllllII = FishType.byItemStack(llllllllllllIllIllIlIllIlllllIlI);
        int n;
        if (lIIlIIIlIlllIIIl(this.cooked ? 1 : 0) && lIIlIIIlIlllIIIl(llllllllllllIllIllIlIllIllllllII.canCook() ? 1 : 0)) {
            n = llllllllllllIllIllIlIllIllllllII.getCookedHealAmount();
            "".length();
            if ("   ".length() == ((0xF6 ^ 0xC5) & ~(0x0 ^ 0x33))) {
                return (0xC2 ^ 0x82) & ~(0x7E ^ 0x3E);
            }
        }
        else {
            n = llllllllllllIllIllIlIllIllllllII.getUncookedHealAmount();
        }
        return n;
    }
    
    public enum FishType
    {
        CLOWNFISH(FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[6]], FishType.lIlIlIlIllIIIl[2], FishType.lIlIlIlIllIIIl[2], FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[3]], FishType.lIlIlIlIllIIIl[1], 0.1f), 
        PUFFERFISH(FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[5]], FishType.lIlIlIlIllIIIl[4], FishType.lIlIlIlIllIIIl[4], FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[7]], FishType.lIlIlIlIllIIIl[1], 0.1f);
        
        private final /* synthetic */ float uncookedSaturationModifier;
        private final /* synthetic */ float cookedSaturationModifier;
        private final /* synthetic */ int meta;
        private final /* synthetic */ int uncookedHealAmount;
        
        SALMON(FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[2]], FishType.lIlIlIlIllIIIl[1], FishType.lIlIlIlIllIIIl[1], FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[4]], FishType.lIlIlIlIllIIIl[2], 0.1f, FishType.lIlIlIlIllIIIl[5], 0.8f);
        
        private static final /* synthetic */ int[] lIlIlIlIllIIIl;
        private static final /* synthetic */ Map<Integer, FishType> META_LOOKUP;
        private final /* synthetic */ String unlocalizedName;
        private final /* synthetic */ int cookedHealAmount;
        private /* synthetic */ boolean cookable;
        private static final /* synthetic */ String[] lIlIlIlIIlIlIl;
        
        COD(FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[0]], FishType.lIlIlIlIllIIIl[0], FishType.lIlIlIlIllIIIl[0], FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[1]], FishType.lIlIlIlIllIIIl[2], 0.1f, FishType.lIlIlIlIllIIIl[3], 0.6f);
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static String lllIllIllllIIll(final String lllllllllllllIIIlIIIIIlIllIIIlll, final String lllllllllllllIIIlIIIIIlIllIIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIIlIIIIIlIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIlIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlIIIIIlIllIIlIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlIIIIIlIllIIlIll.init(FishType.lIlIlIlIllIIIl[2], lllllllllllllIIIlIIIIIlIllIIllII);
                return new String(lllllllllllllIIIlIIIIIlIllIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIlIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIIIIIlIllIIlIlI) {
                lllllllllllllIIIlIIIIIlIllIIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIlllIlIlIlIl(final int lllllllllllllIIIlIIIIIlIllIIIIIl, final int lllllllllllllIIIlIIIIIlIllIIIIII) {
            return lllllllllllllIIIlIIIIIlIllIIIIIl >= lllllllllllllIIIlIIIIIlIllIIIIII;
        }
        
        public int getUncookedHealAmount() {
            return this.uncookedHealAmount;
        }
        
        private FishType(final String lllllllllllllIIIlIIIIIllIIlIIIIl, final int lllllllllllllIIIlIIIIIllIIlIIIII, final int lllllllllllllIIIlIIIIIllIIIlllll, final String lllllllllllllIIIlIIIIIllIIIllllI, final int lllllllllllllIIIlIIIIIllIIIlllIl, final float lllllllllllllIIIlIIIIIllIIlIIIll) {
            this.cookable = (FishType.lIlIlIlIllIIIl[0] != 0);
            this.meta = lllllllllllllIIIlIIIIIllIIIlllll;
            this.unlocalizedName = lllllllllllllIIIlIIIIIllIIIllllI;
            this.uncookedHealAmount = lllllllllllllIIIlIIIIIllIIIlllIl;
            this.uncookedSaturationModifier = lllllllllllllIIIlIIIIIllIIlIIIll;
            this.cookedHealAmount = FishType.lIlIlIlIllIIIl[0];
            this.cookedSaturationModifier = 0.0f;
            this.cookable = (FishType.lIlIlIlIllIIIl[0] != 0);
        }
        
        private static void lllIllIllllIllI() {
            (lIlIlIlIIlIlIl = new String[FishType.lIlIlIlIllIIIl[8]])[FishType.lIlIlIlIllIIIl[0]] = lllIllIllllIIll("7owtM6JRgBk=", "tZfhZ");
            FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[1]] = lllIllIllllIlII("LDwF", "OSaIa");
            FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[2]] = lllIllIllllIIll("L7SPEl4MI40=", "lmcBE");
            FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[4]] = lllIllIllllIlII("Fgw2IiQL", "emZOK");
            FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[6]] = lllIllIllllIIll("R7Qwf2RgLf1IBnHPdSD20g==", "XZnPS");
            FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[3]] = lllIllIllllIlIl("fV2MOE7nEPunryob46HXRA==", "Xpspu");
            FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[5]] = lllIllIllllIIll("+ZQ3Doy5EM1k9b5u5pCnnA==", "MSPqX");
            FishType.lIlIlIlIIlIlIl[FishType.lIlIlIlIllIIIl[7]] = lllIllIllllIlIl("dfOHlCcXzGIg8vaSKLxmPg==", "nJXYl");
        }
        
        private static boolean lllIlllIlIlIllI(final Object lllllllllllllIIIlIIIIIlIlIlllIlI) {
            return lllllllllllllIIIlIIIIIlIlIlllIlI == null;
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private static void lllIlllIlIlIlII() {
            (lIlIlIlIllIIIl = new int[9])[0] = ((0x52 ^ 0x54) & ~(0x2D ^ 0x2B));
            FishType.lIlIlIlIllIIIl[1] = " ".length();
            FishType.lIlIlIlIllIIIl[2] = "  ".length();
            FishType.lIlIlIlIllIIIl[3] = (0x72 ^ 0x2A ^ (0xE9 ^ 0xB4));
            FishType.lIlIlIlIllIIIl[4] = "   ".length();
            FishType.lIlIlIlIllIIIl[5] = (0xF4 ^ 0xC2 ^ (0x87 ^ 0xB7));
            FishType.lIlIlIlIllIIIl[6] = (0xC3 ^ 0xC7);
            FishType.lIlIlIlIllIIIl[7] = (0x62 ^ 0x65);
            FishType.lIlIlIlIllIIIl[8] = (0xB2 ^ 0xBA);
        }
        
        private static String lllIllIllllIlIl(final String lllllllllllllIIIlIIIIIlIlllIlllI, final String lllllllllllllIIIlIIIIIlIlllIlIll) {
            try {
                final SecretKeySpec lllllllllllllIIIlIIIIIlIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIlIlllIlIll.getBytes(StandardCharsets.UTF_8)), FishType.lIlIlIlIllIIIl[8]), "DES");
                final Cipher lllllllllllllIIIlIIIIIlIllllIIII = Cipher.getInstance("DES");
                lllllllllllllIIIlIIIIIlIllllIIII.init(FishType.lIlIlIlIllIIIl[2], lllllllllllllIIIlIIIIIlIllllIIIl);
                return new String(lllllllllllllIIIlIIIIIlIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIIIIIlIlllIllll) {
                lllllllllllllIIIlIIIIIlIlllIllll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIlllIlIlIlll(final int lllllllllllllIIIlIIIIIlIlIlllIII) {
            return lllllllllllllIIIlIIIIIlIlIlllIII != 0;
        }
        
        private FishType(final String lllllllllllllIIIlIIIIIllIIllIllI, final int lllllllllllllIIIlIIIIIllIIllIlIl, final int lllllllllllllIIIlIIIIIllIIllIlII, final String lllllllllllllIIIlIIIIIllIIllllII, final int lllllllllllllIIIlIIIIIllIIlllIll, final float lllllllllllllIIIlIIIIIllIIlllIlI, final int lllllllllllllIIIlIIIIIllIIllIIII, final float lllllllllllllIIIlIIIIIllIIlllIII) {
            this.cookable = (FishType.lIlIlIlIllIIIl[0] != 0);
            this.meta = lllllllllllllIIIlIIIIIllIIllIlII;
            this.unlocalizedName = lllllllllllllIIIlIIIIIllIIllllII;
            this.uncookedHealAmount = lllllllllllllIIIlIIIIIllIIlllIll;
            this.uncookedSaturationModifier = lllllllllllllIIIlIIIIIllIIlllIlI;
            this.cookedHealAmount = lllllllllllllIIIlIIIIIllIIllIIII;
            this.cookedSaturationModifier = lllllllllllllIIIlIIIIIllIIlllIII;
            this.cookable = (FishType.lIlIlIlIllIIIl[1] != 0);
        }
        
        public boolean canCook() {
            return this.cookable;
        }
        
        static {
            lllIlllIlIlIlII();
            lllIllIllllIllI();
            final FishType[] enum$VALUES = new FishType[FishType.lIlIlIlIllIIIl[6]];
            enum$VALUES[FishType.lIlIlIlIllIIIl[0]] = FishType.COD;
            enum$VALUES[FishType.lIlIlIlIllIIIl[1]] = FishType.SALMON;
            enum$VALUES[FishType.lIlIlIlIllIIIl[2]] = FishType.CLOWNFISH;
            enum$VALUES[FishType.lIlIlIlIllIIIl[4]] = FishType.PUFFERFISH;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = Maps.newHashMap();
            final char lllllllllllllIIIlIIIIIllIlIIlIII;
            final char lllllllllllllIIIlIIIIIllIlIIlIIl = (char)((FishType[])(Object)(lllllllllllllIIIlIIIIIllIlIIlIII = (char)(Object)values())).length;
            Exception lllllllllllllIIIlIIIIIllIlIIlIlI = (Exception)FishType.lIlIlIlIllIIIl[0];
            "".length();
            if (-(48 + 64 - 36 + 116 ^ 1 + 91 - 58 + 163) >= 0) {
                return;
            }
            while (!lllIlllIlIlIlIl((int)lllllllllllllIIIlIIIIIllIlIIlIlI, lllllllllllllIIIlIIIIIllIlIIlIIl)) {
                final FishType lllllllllllllIIIlIIIIIllIlIIllII = lllllllllllllIIIlIIIIIllIlIIlIII[lllllllllllllIIIlIIIIIllIlIIlIlI];
                FishType.META_LOOKUP.put(lllllllllllllIIIlIIIIIllIlIIllII.getMetadata(), lllllllllllllIIIlIIIIIllIlIIllII);
                "".length();
                ++lllllllllllllIIIlIIIIIllIlIIlIlI;
            }
        }
        
        public static FishType byMetadata(final int lllllllllllllIIIlIIIIIllIIIIIlII) {
            final FishType lllllllllllllIIIlIIIIIllIIIIIIll = FishType.META_LOOKUP.get(lllllllllllllIIIlIIIIIllIIIIIlII);
            FishType cod;
            if (lllIlllIlIlIllI(lllllllllllllIIIlIIIIIllIIIIIIll)) {
                cod = FishType.COD;
                "".length();
                if ((0x4B ^ 0x4F) == 0x0) {
                    return null;
                }
            }
            else {
                cod = lllllllllllllIIIlIIIIIllIIIIIIll;
            }
            return cod;
        }
        
        private static String lllIllIllllIlII(String lllllllllllllIIIlIIIIIlIllIllIIl, final String lllllllllllllIIIlIIIIIlIllIllIII) {
            lllllllllllllIIIlIIIIIlIllIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIlIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIlIIIIIlIllIlllII = new StringBuilder();
            final char[] lllllllllllllIIIlIIIIIlIllIllIll = lllllllllllllIIIlIIIIIlIllIllIII.toCharArray();
            int lllllllllllllIIIlIIIIIlIllIllIlI = FishType.lIlIlIlIllIIIl[0];
            final byte lllllllllllllIIIlIIIIIlIllIlIlII = (Object)lllllllllllllIIIlIIIIIlIllIllIIl.toCharArray();
            final double lllllllllllllIIIlIIIIIlIllIlIIll = lllllllllllllIIIlIIIIIlIllIlIlII.length;
            boolean lllllllllllllIIIlIIIIIlIllIlIIlI = FishType.lIlIlIlIllIIIl[0] != 0;
            while (lllIlllIlIllIII(lllllllllllllIIIlIIIIIlIllIlIIlI ? 1 : 0, (int)lllllllllllllIIIlIIIIIlIllIlIIll)) {
                final char lllllllllllllIIIlIIIIIlIllIlllll = lllllllllllllIIIlIIIIIlIllIlIlII[lllllllllllllIIIlIIIIIlIllIlIIlI];
                lllllllllllllIIIlIIIIIlIllIlllII.append((char)(lllllllllllllIIIlIIIIIlIllIlllll ^ lllllllllllllIIIlIIIIIlIllIllIll[lllllllllllllIIIlIIIIIlIllIllIlI % lllllllllllllIIIlIIIIIlIllIllIll.length]));
                "".length();
                ++lllllllllllllIIIlIIIIIlIllIllIlI;
                ++lllllllllllllIIIlIIIIIlIllIlIIlI;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIlIIIIIlIllIlllII);
        }
        
        private static boolean lllIlllIlIllIII(final int lllllllllllllIIIlIIIIIlIlIllllIl, final int lllllllllllllIIIlIIIIIlIlIllllII) {
            return lllllllllllllIIIlIIIIIlIlIllllIl < lllllllllllllIIIlIIIIIlIlIllllII;
        }
        
        public static FishType byItemStack(final ItemStack lllllllllllllIIIlIIIIIlIlllllllI) {
            FishType fishType;
            if (lllIlllIlIlIlll((lllllllllllllIIIlIIIIIlIlllllllI.getItem() instanceof ItemFishFood) ? 1 : 0)) {
                fishType = byMetadata(lllllllllllllIIIlIIIIIlIlllllllI.getMetadata());
                "".length();
                if (((0x20 ^ 0x35) & ~(0x4D ^ 0x58)) < 0) {
                    return null;
                }
            }
            else {
                fishType = FishType.COD;
            }
            return fishType;
        }
        
        public float getUncookedSaturationModifier() {
            return this.uncookedSaturationModifier;
        }
        
        public float getCookedSaturationModifier() {
            return this.cookedSaturationModifier;
        }
        
        public int getCookedHealAmount() {
            return this.cookedHealAmount;
        }
    }
}
