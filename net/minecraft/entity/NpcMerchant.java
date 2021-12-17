// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.inventory.InventoryMerchant;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.player.EntityPlayer;

public class NpcMerchant implements IMerchant
{
    private static final /* synthetic */ int[] lIllIllIIlIllI;
    private /* synthetic */ EntityPlayer customer;
    private /* synthetic */ IChatComponent field_175548_d;
    private /* synthetic */ InventoryMerchant theMerchantInventory;
    private /* synthetic */ MerchantRecipeList recipeList;
    private static final /* synthetic */ String[] lIllIllIIlIlIl;
    
    private static String lllllllIllllIIl(final String llllllllllllIlllllllIIlIlIIllIIl, final String llllllllllllIlllllllIIlIlIIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlllllllIIlIlIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIlIlIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllIIlIlIIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllIIlIlIIlllIl.init(NpcMerchant.lIllIllIIlIllI[2], llllllllllllIlllllllIIlIlIIllllI);
            return new String(llllllllllllIlllllllIIlIlIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIlIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIIlIlIIlllII) {
            llllllllllllIlllllllIIlIlIIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void useRecipe(final MerchantRecipe llllllllllllIlllllllIIlIlIlIlIIl) {
        llllllllllllIlllllllIIlIlIlIlIIl.incrementToolUses();
    }
    
    @Override
    public void setCustomer(final EntityPlayer llllllllllllIlllllllIIlIlIllIllI) {
    }
    
    private static void lllllllIllllIll() {
        (lIllIllIIlIllI = new int[3])[0] = ((0x7B ^ 0x61 ^ (0x45 ^ 0x4D)) & (0xCB ^ 0x83 ^ (0x7F ^ 0x25) ^ -" ".length()));
        NpcMerchant.lIllIllIIlIllI[1] = " ".length();
        NpcMerchant.lIllIllIIlIllI[2] = "  ".length();
    }
    
    private static boolean lllllllIlllllII(final Object llllllllllllIlllllllIIlIlIIlIlII) {
        return llllllllllllIlllllllIIlIlIIlIlII != null;
    }
    
    static {
        lllllllIllllIll();
        lllllllIllllIlI();
    }
    
    public NpcMerchant(final EntityPlayer llllllllllllIlllllllIIlIlIllllll, final IChatComponent llllllllllllIlllllllIIlIlIlllllI) {
        this.customer = llllllllllllIlllllllIIlIlIllllll;
        this.field_175548_d = llllllllllllIlllllllIIlIlIlllllI;
        this.theMerchantInventory = new InventoryMerchant(llllllllllllIlllllllIIlIlIllllll, this);
    }
    
    @Override
    public void verifySellingItem(final ItemStack llllllllllllIlllllllIIlIlIlIIllI) {
    }
    
    @Override
    public void setRecipes(final MerchantRecipeList llllllllllllIlllllllIIlIlIlIlllI) {
        this.recipeList = llllllllllllIlllllllIIlIlIlIlllI;
    }
    
    @Override
    public MerchantRecipeList getRecipes(final EntityPlayer llllllllllllIlllllllIIlIlIllIIll) {
        return this.recipeList;
    }
    
    @Override
    public IChatComponent getDisplayName() {
        IChatComponent field_175548_d;
        if (lllllllIlllllII(this.field_175548_d)) {
            field_175548_d = this.field_175548_d;
            "".length();
            if (((0x48 ^ 0x40 ^ (0x87 ^ 0xB3)) & (0xD3 ^ 0xB4 ^ (0x2 ^ 0x59) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            field_175548_d = new ChatComponentTranslation(NpcMerchant.lIllIllIIlIlIl[NpcMerchant.lIllIllIIlIllI[0]], new Object[NpcMerchant.lIllIllIIlIllI[0]]);
        }
        return field_175548_d;
    }
    
    @Override
    public EntityPlayer getCustomer() {
        return this.customer;
    }
    
    private static void lllllllIllllIlI() {
        (lIllIllIIlIlIl = new String[NpcMerchant.lIllIllIIlIllI[1]])[NpcMerchant.lIllIllIIlIllI[0]] = lllllllIllllIIl("O+KTHDx4zZMhmkEBfdYYAkj9GO5cDuTN", "fwOqp");
    }
}
