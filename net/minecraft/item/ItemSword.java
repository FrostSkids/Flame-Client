// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ItemSword extends Item
{
    private final /* synthetic */ ToolMaterial material;
    private static final /* synthetic */ String[] llIIIllllIIlIl;
    private static final /* synthetic */ int[] llIIIllllIIlll;
    private /* synthetic */ float attackDamage;
    
    @Override
    public boolean getIsRepairable(final ItemStack llllllllllllIlllIIlllllIIIlIIlIl, final ItemStack llllllllllllIlllIIlllllIIIlIIlll) {
        int isRepairable;
        if (lIIIlIllIIlIIIIl(this.material.getRepairItem(), llllllllllllIlllIIlllllIIIlIIlll.getItem())) {
            isRepairable = ItemSword.llIIIllllIIlll[0];
            "".length();
            if (((170 + 208 - 308 + 163 ^ 162 + 62 - 203 + 176) & ("   ".length() ^ (0x85 ^ 0xAA) ^ -" ".length())) >= "   ".length()) {
                return ((0xBF ^ 0xC6 ^ (0x2A ^ 0x32)) & (0x2E ^ 0x53 ^ (0x7E ^ 0x62) ^ -" ".length())) != 0x0;
            }
        }
        else {
            isRepairable = (super.getIsRepairable(llllllllllllIlllIIlllllIIIlIIlIl, llllllllllllIlllIIlllllIIIlIIlll) ? 1 : 0);
        }
        return isRepairable != 0;
    }
    
    private static String lIIIlIllIIIllIlI(final String llllllllllllIlllIIlllllIIIIlIllI, final String llllllllllllIlllIIlllllIIIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllllIIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllllIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), ItemSword.llIIIllllIIlll[4]), "DES");
            final Cipher llllllllllllIlllIIlllllIIIIllIII = Cipher.getInstance("DES");
            llllllllllllIlllIIlllllIIIIllIII.init(ItemSword.llIIIllllIIlll[1], llllllllllllIlllIIlllllIIIIllIIl);
            return new String(llllllllllllIlllIIlllllIIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllllIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllllIIIIlIlll) {
            llllllllllllIlllIIlllllIIIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIllIIlIIIIl(final Object llllllllllllIlllIIlllllIIIIIlIlI, final Object llllllllllllIlllIIlllllIIIIIlIIl) {
        return llllllllllllIlllIIlllllIIIIIlIlI == llllllllllllIlllIIlllllIIIIIlIIl;
    }
    
    private static void lIIIlIllIIlIIIII() {
        (llIIIllllIIlll = new int[5])[0] = " ".length();
        ItemSword.llIIIllllIIlll[1] = "  ".length();
        ItemSword.llIIIllllIIlll[2] = (-(0xFFFFEC25 & 0x33FF) & (0xFFFFBD7D & 0x17BE6));
        ItemSword.llIIIllllIIlll[3] = ((0x7C ^ 0xB ^ (0x4D ^ 0x5A)) & (0x4D ^ 0x6B ^ (0x13 ^ 0x55) ^ -" ".length()));
        ItemSword.llIIIllllIIlll[4] = (0x1B ^ 0x1F ^ (0x82 ^ 0x8E));
    }
    
    @Override
    public float getStrVsBlock(final ItemStack llllllllllllIlllIIlllllIIllIIIlI, final Block llllllllllllIlllIIlllllIIllIIIIl) {
        if (lIIIlIllIIlIIIIl(llllllllllllIlllIIlllllIIllIIIIl, Blocks.web)) {
            return 15.0f;
        }
        final Material llllllllllllIlllIIlllllIIllIIIII = llllllllllllIlllIIlllllIIllIIIIl.getMaterial();
        float n;
        if (lIIIlIllIIlIIIlI(llllllllllllIlllIIlllllIIllIIIII, Material.plants) && lIIIlIllIIlIIIlI(llllllllllllIlllIIlllllIIllIIIII, Material.vine) && lIIIlIllIIlIIIlI(llllllllllllIlllIIlllllIIllIIIII, Material.coral) && lIIIlIllIIlIIIlI(llllllllllllIlllIIlllllIIllIIIII, Material.leaves) && lIIIlIllIIlIIIlI(llllllllllllIlllIIlllllIIllIIIII, Material.gourd)) {
            n = 1.0f;
            "".length();
            if ("  ".length() < 0) {
                return 0.0f;
            }
        }
        else {
            n = 1.5f;
        }
        return n;
    }
    
    static {
        lIIIlIllIIlIIIII();
        lIIIlIllIIIllIll();
    }
    
    @Override
    public boolean canHarvestBlock(final Block llllllllllllIlllIIlllllIIIllIIll) {
        if (lIIIlIllIIlIIIIl(llllllllllllIlllIIlllllIIIllIIll, Blocks.web)) {
            return ItemSword.llIIIllllIIlll[0] != 0;
        }
        return ItemSword.llIIIllllIIlll[3] != 0;
    }
    
    @Override
    public int getMaxItemUseDuration(final ItemStack llllllllllllIlllIIlllllIIlIIIIIl) {
        return ItemSword.llIIIllllIIlll[2];
    }
    
    @Override
    public int getItemEnchantability() {
        return this.material.getEnchantability();
    }
    
    public String getToolMaterialName() {
        return this.material.toString();
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIlllIIlllllIIIlllIII, final World llllllllllllIlllIIlllllIIIlllIll, final EntityPlayer llllllllllllIlllIIlllllIIIllIlll) {
        llllllllllllIlllIIlllllIIIllIlll.setItemInUse(llllllllllllIlllIIlllllIIIlllIII, this.getMaxItemUseDuration(llllllllllllIlllIIlllllIIIlllIII));
        return llllllllllllIlllIIlllllIIIlllIII;
    }
    
    public ItemSword(final ToolMaterial llllllllllllIlllIIlllllIIllIlIIl) {
        this.material = llllllllllllIlllIIlllllIIllIlIIl;
        this.maxStackSize = ItemSword.llIIIllllIIlll[0];
        this.setMaxDamage(llllllllllllIlllIIlllllIIllIlIIl.getMaxUses());
        "".length();
        this.setCreativeTab(CreativeTabs.tabCombat);
        "".length();
        this.attackDamage = 4.0f + llllllllllllIlllIIlllllIIllIlIIl.getDamageVsEntity();
    }
    
    @Override
    public boolean onBlockDestroyed(final ItemStack llllllllllllIlllIIlllllIIlIIllll, final World llllllllllllIlllIIlllllIIlIIlIIl, final Block llllllllllllIlllIIlllllIIlIIlIII, final BlockPos llllllllllllIlllIIlllllIIlIIIlll, final EntityLivingBase llllllllllllIlllIIlllllIIlIIlIll) {
        if (lIIIlIllIIlIIlII(lIIIlIllIIlIIIll(llllllllllllIlllIIlllllIIlIIlIII.getBlockHardness(llllllllllllIlllIIlllllIIlIIlIIl, llllllllllllIlllIIlllllIIlIIIlll), 0.0))) {
            llllllllllllIlllIIlllllIIlIIllll.damageItem(ItemSword.llIIIllllIIlll[1], llllllllllllIlllIIlllllIIlIIlIll);
        }
        return ItemSword.llIIIllllIIlll[0] != 0;
    }
    
    private static int lIIIlIllIIlIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIlIllIIlIIIlI(final Object llllllllllllIlllIIlllllIIIIIlllI, final Object llllllllllllIlllIIlllllIIIIIllIl) {
        return llllllllllllIlllIIlllllIIIIIlllI != llllllllllllIlllIIlllllIIIIIllIl;
    }
    
    @Override
    public boolean hitEntity(final ItemStack llllllllllllIlllIIlllllIIlIlIlll, final EntityLivingBase llllllllllllIlllIIlllllIIlIllIIl, final EntityLivingBase llllllllllllIlllIIlllllIIlIlIllI) {
        llllllllllllIlllIIlllllIIlIlIlll.damageItem(ItemSword.llIIIllllIIlll[0], llllllllllllIlllIIlllllIIlIlIllI);
        return ItemSword.llIIIllllIIlll[0] != 0;
    }
    
    @Override
    public EnumAction getItemUseAction(final ItemStack llllllllllllIlllIIlllllIIlIIIIll) {
        return EnumAction.BLOCK;
    }
    
    @Override
    public boolean isFull3D() {
        return ItemSword.llIIIllllIIlll[0] != 0;
    }
    
    private static boolean lIIIlIllIIlIIlII(final int llllllllllllIlllIIlllllIIIIIIlll) {
        return llllllllllllIlllIIlllllIIIIIIlll != 0;
    }
    
    public float getDamageVsEntity() {
        return this.material.getDamageVsEntity();
    }
    
    private static void lIIIlIllIIIllIll() {
        (llIIIllllIIlIl = new String[ItemSword.llIIIllllIIlll[0]])[ItemSword.llIIIllllIIlll[3]] = lIIIlIllIIIllIlI("sSUffzv7eTSMKSW6hFjoNA==", "AQPYh");
    }
    
    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers() {
        final Multimap<String, AttributeModifier> llllllllllllIlllIIlllllIIIlIIIII = super.getItemAttributeModifiers();
        llllllllllllIlllIIlllllIIIlIIIII.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)new AttributeModifier(ItemSword.itemModifierUUID, ItemSword.llIIIllllIIlIl[ItemSword.llIIIllllIIlll[3]], this.attackDamage, ItemSword.llIIIllllIIlll[3]));
        "".length();
        return llllllllllllIlllIIlllllIIIlIIIII;
    }
}
