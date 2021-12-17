// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import java.util.Set;

public class ItemTool extends Item
{
    private static final /* synthetic */ int[] llIIlIIlIIIlIl;
    private /* synthetic */ float damageVsEntity;
    protected /* synthetic */ float efficiencyOnProperMaterial;
    private /* synthetic */ Set<Block> effectiveBlocks;
    protected /* synthetic */ ToolMaterial toolMaterial;
    private static final /* synthetic */ String[] llIIlIIlIIIlII;
    
    private static boolean lIIIllIIIIlllIIl(final int llllllllllllIlllIIlIllIIIlIIIIlI, final int llllllllllllIlllIIlIllIIIlIIIIIl) {
        return llllllllllllIlllIIlIllIIIlIIIIlI < llllllllllllIlllIIlIllIIIlIIIIIl;
    }
    
    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers() {
        final Multimap<String, AttributeModifier> llllllllllllIlllIIlIllIIIlIlllll = super.getItemAttributeModifiers();
        llllllllllllIlllIIlIllIIIlIlllll.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)new AttributeModifier(ItemTool.itemModifierUUID, ItemTool.llIIlIIlIIIlII[ItemTool.llIIlIIlIIIlIl[2]], this.damageVsEntity, ItemTool.llIIlIIlIIIlIl[2]));
        "".length();
        return llllllllllllIlllIIlIllIIIlIlllll;
    }
    
    private static void lIIIllIIIIllIlIl() {
        (llIIlIIlIIIlIl = new int[3])[0] = " ".length();
        ItemTool.llIIlIIlIIIlIl[1] = "  ".length();
        ItemTool.llIIlIIlIIIlIl[2] = ((0x81 ^ 0xAF ^ (0x1B ^ 0xB)) & (113 + 102 - 133 + 68 ^ 129 + 157 - 140 + 22 ^ -" ".length()));
    }
    
    @Override
    public int getItemEnchantability() {
        return this.toolMaterial.getEnchantability();
    }
    
    private static boolean lIIIllIIIIlllIII(final Object llllllllllllIlllIIlIllIIIIlllllI, final Object llllllllllllIlllIIlIllIIIIllllIl) {
        return llllllllllllIlllIIlIllIIIIlllllI == llllllllllllIlllIIlIllIIIIllllIl;
    }
    
    @Override
    public float getStrVsBlock(final ItemStack llllllllllllIlllIIlIllIIlIIlIIIl, final Block llllllllllllIlllIIlIllIIlIIlIIII) {
        float efficiencyOnProperMaterial;
        if (lIIIllIIIIllIllI(this.effectiveBlocks.contains(llllllllllllIlllIIlIllIIlIIlIIII) ? 1 : 0)) {
            efficiencyOnProperMaterial = this.efficiencyOnProperMaterial;
            "".length();
            if ("  ".length() < ((0x45 ^ 0x67) & ~(0x37 ^ 0x15))) {
                return 0.0f;
            }
        }
        else {
            efficiencyOnProperMaterial = 1.0f;
        }
        return efficiencyOnProperMaterial;
    }
    
    public String getToolMaterialName() {
        return this.toolMaterial.toString();
    }
    
    private static int lIIIllIIIIllIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected ItemTool(final float llllllllllllIlllIIlIllIIlIIlIlll, final ToolMaterial llllllllllllIlllIIlIllIIlIIlIllI, final Set<Block> llllllllllllIlllIIlIllIIlIIlIlIl) {
        this.efficiencyOnProperMaterial = 4.0f;
        this.toolMaterial = llllllllllllIlllIIlIllIIlIIlIllI;
        this.effectiveBlocks = llllllllllllIlllIIlIllIIlIIlIlIl;
        this.maxStackSize = ItemTool.llIIlIIlIIIlIl[0];
        this.setMaxDamage(llllllllllllIlllIIlIllIIlIIlIllI.getMaxUses());
        "".length();
        this.efficiencyOnProperMaterial = llllllllllllIlllIIlIllIIlIIlIllI.getEfficiencyOnProperMaterial();
        this.damageVsEntity = llllllllllllIlllIIlIllIIlIIlIlll + llllllllllllIlllIIlIllIIlIIlIllI.getDamageVsEntity();
        this.setCreativeTab(CreativeTabs.tabTools);
        "".length();
    }
    
    @Override
    public boolean isFull3D() {
        return ItemTool.llIIlIIlIIIlIl[0] != 0;
    }
    
    public ToolMaterial getToolMaterial() {
        return this.toolMaterial;
    }
    
    static {
        lIIIllIIIIllIlIl();
        lIIIllIIIIllIlII();
    }
    
    private static boolean lIIIllIIIIllIllI(final int llllllllllllIlllIIlIllIIIIlllIll) {
        return llllllllllllIlllIIlIllIIIIlllIll != 0;
    }
    
    private static String lIIIllIIIIllIIll(String llllllllllllIlllIIlIllIIIlIIllIl, final String llllllllllllIlllIIlIllIIIlIIllII) {
        llllllllllllIlllIIlIllIIIlIIllIl = new String(Base64.getDecoder().decode(llllllllllllIlllIIlIllIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlIllIIIlIlIIII = new StringBuilder();
        final char[] llllllllllllIlllIIlIllIIIlIIllll = llllllllllllIlllIIlIllIIIlIIllII.toCharArray();
        int llllllllllllIlllIIlIllIIIlIIlllI = ItemTool.llIIlIIlIIIlIl[2];
        final byte llllllllllllIlllIIlIllIIIlIIlIII = (Object)llllllllllllIlllIIlIllIIIlIIllIl.toCharArray();
        final byte llllllllllllIlllIIlIllIIIlIIIlll = (byte)llllllllllllIlllIIlIllIIIlIIlIII.length;
        String llllllllllllIlllIIlIllIIIlIIIllI = (String)ItemTool.llIIlIIlIIIlIl[2];
        while (lIIIllIIIIlllIIl((int)llllllllllllIlllIIlIllIIIlIIIllI, llllllllllllIlllIIlIllIIIlIIIlll)) {
            final char llllllllllllIlllIIlIllIIIlIlIIll = llllllllllllIlllIIlIllIIIlIIlIII[llllllllllllIlllIIlIllIIIlIIIllI];
            llllllllllllIlllIIlIllIIIlIlIIII.append((char)(llllllllllllIlllIIlIllIIIlIlIIll ^ llllllllllllIlllIIlIllIIIlIIllll[llllllllllllIlllIIlIllIIIlIIlllI % llllllllllllIlllIIlIllIIIlIIllll.length]));
            "".length();
            ++llllllllllllIlllIIlIllIIIlIIlllI;
            ++llllllllllllIlllIIlIllIIIlIIIllI;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlIllIIIlIlIIII);
    }
    
    @Override
    public boolean getIsRepairable(final ItemStack llllllllllllIlllIIlIllIIIllIIlII, final ItemStack llllllllllllIlllIIlIllIIIllIIllI) {
        int isRepairable;
        if (lIIIllIIIIlllIII(this.toolMaterial.getRepairItem(), llllllllllllIlllIIlIllIIIllIIllI.getItem())) {
            isRepairable = ItemTool.llIIlIIlIIIlIl[0];
            "".length();
            if (-" ".length() >= (0x5A ^ 0x5E)) {
                return ((0x2 ^ 0x9) & ~(0xAC ^ 0xA7)) != 0x0;
            }
        }
        else {
            isRepairable = (super.getIsRepairable(llllllllllllIlllIIlIllIIIllIIlII, llllllllllllIlllIIlIllIIIllIIllI) ? 1 : 0);
        }
        return isRepairable != 0;
    }
    
    private static void lIIIllIIIIllIlII() {
        (llIIlIIlIIIlII = new String[ItemTool.llIIlIIlIIIlIl[0]])[ItemTool.llIIlIIlIIIlIl[2]] = lIIIllIIIIllIIll("EiM1AGwrIz4FKi8pKA==", "FLZlL");
    }
    
    @Override
    public boolean hitEntity(final ItemStack llllllllllllIlllIIlIllIIlIIIlIlI, final EntityLivingBase llllllllllllIlllIIlIllIIlIIIlIIl, final EntityLivingBase llllllllllllIlllIIlIllIIlIIIIllI) {
        llllllllllllIlllIIlIllIIlIIIlIlI.damageItem(ItemTool.llIIlIIlIIIlIl[1], llllllllllllIlllIIlIllIIlIIIIllI);
        return ItemTool.llIIlIIlIIIlIl[0] != 0;
    }
    
    @Override
    public boolean onBlockDestroyed(final ItemStack llllllllllllIlllIIlIllIIIllllIlI, final World llllllllllllIlllIIlIllIIIllllllI, final Block llllllllllllIlllIIlIllIIIlllllIl, final BlockPos llllllllllllIlllIIlIllIIIlllIlll, final EntityLivingBase llllllllllllIlllIIlIllIIIllllIll) {
        if (lIIIllIIIIllIllI(lIIIllIIIIllIlll(llllllllllllIlllIIlIllIIIlllllIl.getBlockHardness(llllllllllllIlllIIlIllIIIllllllI, llllllllllllIlllIIlIllIIIlllIlll), 0.0))) {
            llllllllllllIlllIIlIllIIIllllIlI.damageItem(ItemTool.llIIlIIlIIIlIl[0], llllllllllllIlllIIlIllIIIllllIll);
        }
        return ItemTool.llIIlIIlIIIlIl[0] != 0;
    }
}
