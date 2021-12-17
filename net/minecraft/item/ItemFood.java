// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.entity.Entity;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemFood extends Item
{
    private static final /* synthetic */ int[] llIllIlllIIlII;
    public final /* synthetic */ int itemUseDuration;
    private final /* synthetic */ boolean isWolfsFavoriteMeat;
    private /* synthetic */ boolean alwaysEdible;
    private /* synthetic */ int potionAmplifier;
    private /* synthetic */ int potionId;
    private /* synthetic */ int potionDuration;
    private static final /* synthetic */ String[] llIllIlIIIIIll;
    private /* synthetic */ float potionEffectProbability;
    private final /* synthetic */ float saturationModifier;
    private final /* synthetic */ int healAmount;
    
    protected void onFoodEaten(final ItemStack llllllllllllIllIIllIIIlIIlIllIIl, final World llllllllllllIllIIllIIIlIIlIlIlIl, final EntityPlayer llllllllllllIllIIllIIIlIIlIlIlII) {
        if (lIIllIIIIllIIlll(llllllllllllIllIIllIIIlIIlIlIlIl.isRemote ? 1 : 0) && lIIllIIIIllIlIII(this.potionId) && lIIllIIIIllIlIIl(lIIllIIIIllIIllI(llllllllllllIllIIllIIIlIIlIlIlIl.rand.nextFloat(), this.potionEffectProbability))) {
            llllllllllllIllIIllIIIlIIlIlIlII.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * ItemFood.llIllIlllIIlII[3], this.potionAmplifier));
        }
    }
    
    public float getSaturationModifier(final ItemStack llllllllllllIllIIllIIIlIIIllllll) {
        return this.saturationModifier;
    }
    
    private static boolean lIIllIIIIllIlIlI(final int llllllllllllIllIIllIIIlIIIIllIlI) {
        return llllllllllllIllIIllIIIlIIIIllIlI != 0;
    }
    
    private static boolean lIIllIIIIllIIlll(final int llllllllllllIllIIllIIIlIIIIllIII) {
        return llllllllllllIllIIllIIIlIIIIllIII == 0;
    }
    
    public ItemFood(final int llllllllllllIllIIllIIIlIIllIlIll, final boolean llllllllllllIllIIllIIIlIIllIllIl) {
        this(llllllllllllIllIIllIIIlIIllIlIll, 0.6f, llllllllllllIllIIllIIIlIIllIllIl);
    }
    
    @Override
    public ItemStack onItemUseFinish(final ItemStack llllllllllllIllIIllIIIlIIllIIlII, final World llllllllllllIllIIllIIIlIIllIIIll, final EntityPlayer llllllllllllIllIIllIIIlIIllIIIlI) {
        llllllllllllIllIIllIIIlIIllIIlII.stackSize -= ItemFood.llIllIlllIIlII[1];
        llllllllllllIllIIllIIIlIIllIIIlI.getFoodStats().addStats(this, llllllllllllIllIIllIIIlIIllIIlII);
        llllllllllllIllIIllIIIlIIllIIIll.playSoundAtEntity(llllllllllllIllIIllIIIlIIllIIIlI, ItemFood.llIllIlIIIIIll[ItemFood.llIllIlllIIlII[2]], 0.5f, llllllllllllIllIIllIIIlIIllIIIll.rand.nextFloat() * 0.1f + 0.9f);
        this.onFoodEaten(llllllllllllIllIIllIIIlIIllIIlII, llllllllllllIllIIllIIIlIIllIIIll, llllllllllllIllIIllIIIlIIllIIIlI);
        llllllllllllIllIIllIIIlIIllIIIlI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return llllllllllllIllIIllIIIlIIllIIlII;
    }
    
    private static int lIIllIIIIllIIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIllIIIIllIlIIl(final int llllllllllllIllIIllIIIlIIIIlIllI) {
        return llllllllllllIllIIllIIIlIIIIlIllI < 0;
    }
    
    public ItemFood(final int llllllllllllIllIIllIIIlIIllllIIl, final float llllllllllllIllIIllIIIlIIllllIII, final boolean llllllllllllIllIIllIIIlIIlllIIll) {
        this.itemUseDuration = ItemFood.llIllIlllIIlII[0];
        this.healAmount = llllllllllllIllIIllIIIlIIllllIIl;
        this.isWolfsFavoriteMeat = llllllllllllIllIIllIIIlIIlllIIll;
        this.saturationModifier = llllllllllllIllIIllIIIlIIllllIII;
        this.setCreativeTab(CreativeTabs.tabFood);
        "".length();
    }
    
    @Override
    public int getMaxItemUseDuration(final ItemStack llllllllllllIllIIllIIIlIIlIlIIlI) {
        return ItemFood.llIllIlllIIlII[0];
    }
    
    public boolean isWolfsFavoriteMeat() {
        return this.isWolfsFavoriteMeat;
    }
    
    private static void lIIllIIIIllIIlIl() {
        (llIllIlllIIlII = new int[6])[0] = (0xB1 ^ 0x91);
        ItemFood.llIllIlllIIlII[1] = " ".length();
        ItemFood.llIllIlllIIlII[2] = ((0xE7 ^ 0xA5) & ~(0xD7 ^ 0x95));
        ItemFood.llIllIlllIIlII[3] = (0x45 ^ 0x13 ^ (0xE5 ^ 0xA7));
        ItemFood.llIllIlllIIlII[4] = (0x25 ^ 0x57 ^ (0x66 ^ 0x1C));
        ItemFood.llIllIlllIIlII[5] = "  ".length();
    }
    
    @Override
    public EnumAction getItemUseAction(final ItemStack llllllllllllIllIIllIIIlIIlIlIIII) {
        return EnumAction.EAT;
    }
    
    static {
        lIIllIIIIllIIlIl();
        lIIlIlllIllllllI();
    }
    
    public int getHealAmount(final ItemStack llllllllllllIllIIllIIIlIIlIIIIll) {
        return this.healAmount;
    }
    
    private static void lIIlIlllIllllllI() {
        (llIllIlIIIIIll = new String[ItemFood.llIllIlllIIlII[1]])[ItemFood.llIllIlllIIlII[2]] = lIIlIlllIlllllIl("tB/SsMTZYgn1Nd99kIjRKA==", "FIXRP");
    }
    
    public ItemFood setPotionEffect(final int llllllllllllIllIIllIIIlIIIllIlII, final int llllllllllllIllIIllIIIlIIIllIIll, final int llllllllllllIllIIllIIIlIIIllIIlI, final float llllllllllllIllIIllIIIlIIIlIllII) {
        this.potionId = llllllllllllIllIIllIIIlIIIllIlII;
        this.potionDuration = llllllllllllIllIIllIIIlIIIllIIll;
        this.potionAmplifier = llllllllllllIllIIllIIIlIIIllIIlI;
        this.potionEffectProbability = llllllllllllIllIIllIIIlIIIlIllII;
        return this;
    }
    
    public ItemFood setAlwaysEdible() {
        this.alwaysEdible = (ItemFood.llIllIlllIIlII[1] != 0);
        return this;
    }
    
    private static boolean lIIllIIIIllIlIII(final int llllllllllllIllIIllIIIlIIIIlIlII) {
        return llllllllllllIllIIllIIIlIIIIlIlII > 0;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIllIIllIIIlIIlIIlIll, final World llllllllllllIllIIllIIIlIIlIIlIlI, final EntityPlayer llllllllllllIllIIllIIIlIIlIIIllI) {
        if (lIIllIIIIllIlIlI(llllllllllllIllIIllIIIlIIlIIIllI.canEat(this.alwaysEdible) ? 1 : 0)) {
            llllllllllllIllIIllIIIlIIlIIIllI.setItemInUse(llllllllllllIllIIllIIIlIIlIIlIll, this.getMaxItemUseDuration(llllllllllllIllIIllIIIlIIlIIlIll));
        }
        return llllllllllllIllIIllIIIlIIlIIlIll;
    }
    
    private static String lIIlIlllIlllllIl(final String llllllllllllIllIIllIIIlIIIlIIIIl, final String llllllllllllIllIIllIIIlIIIIllllI) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIIlIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), ItemFood.llIllIlllIIlII[4]), "DES");
            final Cipher llllllllllllIllIIllIIIlIIIlIIIll = Cipher.getInstance("DES");
            llllllllllllIllIIllIIIlIIIlIIIll.init(ItemFood.llIllIlllIIlII[5], llllllllllllIllIIllIIIlIIIlIIlII);
            return new String(llllllllllllIllIIllIIIlIIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIIlIIIlIIIlI) {
            llllllllllllIllIIllIIIlIIIlIIIlI.printStackTrace();
            return null;
        }
    }
}
