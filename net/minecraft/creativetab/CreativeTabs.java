// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.creativetab;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Items;
import net.minecraft.enchantment.Enchantment;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.EnumEnchantmentType;

public abstract class CreativeTabs
{
    private /* synthetic */ EnumEnchantmentType[] enchantmentTypes;
    private /* synthetic */ String theTexture;
    private /* synthetic */ boolean drawTitle;
    private static final /* synthetic */ String[] lIlllllIIIlIll;
    private /* synthetic */ ItemStack iconItemStack;
    private final /* synthetic */ String tabLabel;
    private /* synthetic */ boolean hasScrollbar;
    public static final /* synthetic */ CreativeTabs[] creativeTabArray;
    private static final /* synthetic */ int[] lIlllllIIlIlll;
    private final /* synthetic */ int tabIndex;
    
    public void addEnchantmentBooksToList(final List<ItemStack> llllllllllllIllllIIlllIIllIIIIlI, final EnumEnchantmentType... llllllllllllIllllIIlllIIllIIIllI) {
        final String llllllllllllIllllIIlllIIlIllllIl;
        final short llllllllllllIllllIIlllIIlIlllllI = (short)((Enchantment[])(Object)(llllllllllllIllllIIlllIIlIllllIl = (String)(Object)Enchantment.enchantmentsBookList)).length;
        Exception llllllllllllIllllIIlllIIlIllllll = (Exception)CreativeTabs.lIlllllIIlIlll[1];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lIIIIlIlIIlllIII((int)llllllllllllIllllIIlllIIlIllllll, llllllllllllIllllIIlllIIlIlllllI)) {
            final Enchantment llllllllllllIllllIIlllIIllIIIlIl = llllllllllllIllllIIlllIIlIllllIl[llllllllllllIllllIIlllIIlIllllll];
            if (lIIIIlIlIIlllIIl(llllllllllllIllllIIlllIIllIIIlIl) && lIIIIlIlIIlllIIl(llllllllllllIllllIIlllIIllIIIlIl.type)) {
                boolean llllllllllllIllllIIlllIIllIIIlII = CreativeTabs.lIlllllIIlIlll[1] != 0;
                int llllllllllllIllllIIlllIIllIIIIll = CreativeTabs.lIlllllIIlIlll[1];
                "".length();
                if (null != null) {
                    return;
                }
                while (lIIIIlIlIIllIllI(llllllllllllIllllIIlllIIllIIIIll, llllllllllllIllllIIlllIIllIIIllI.length) && !lIIIIlIlIIlllIll(llllllllllllIllllIIlllIIllIIIlII ? 1 : 0)) {
                    if (lIIIIlIlIIllIlll(llllllllllllIllllIIlllIIllIIIlIl.type, llllllllllllIllllIIlllIIllIIIllI[llllllllllllIllllIIlllIIllIIIIll])) {
                        llllllllllllIllllIIlllIIllIIIlII = (CreativeTabs.lIlllllIIlIlll[2] != 0);
                    }
                    ++llllllllllllIllllIIlllIIllIIIIll;
                }
                if (lIIIIlIlIIlllIll(llllllllllllIllllIIlllIIllIIIlII ? 1 : 0)) {
                    llllllllllllIllllIIlllIIllIIIIlI.add(Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(llllllllllllIllllIIlllIIllIIIlIl, llllllllllllIllllIIlllIIllIIIlIl.getMaxLevel())));
                    "".length();
                }
            }
            ++llllllllllllIllllIIlllIIlIllllll;
        }
    }
    
    public String getBackgroundImageName() {
        return this.theTexture;
    }
    
    public CreativeTabs(final int llllllllllllIllllIIlllIlIIlIIIII, final String llllllllllllIllllIIlllIlIIIlllll) {
        this.theTexture = CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[14]];
        this.hasScrollbar = (CreativeTabs.lIlllllIIlIlll[2] != 0);
        this.drawTitle = (CreativeTabs.lIlllllIIlIlll[2] != 0);
        this.tabIndex = llllllllllllIllllIIlllIlIIlIIIII;
        this.tabLabel = llllllllllllIllllIIlllIlIIIlllll;
        CreativeTabs.creativeTabArray[llllllllllllIllllIIlllIlIIlIIIII] = this;
    }
    
    private static boolean lIIIIlIlIIllIlll(final Object llllllllllllIllllIIlllIIIllllllI, final Object llllllllllllIllllIIlllIIIlllllIl) {
        return llllllllllllIllllIIlllIIIllllllI == llllllllllllIllllIIlllIIIlllllIl;
    }
    
    static {
        lIIIIlIlIIllIlII();
        lIIIIlIlIIlIlIIl();
        creativeTabArray = new CreativeTabs[CreativeTabs.lIlllllIIlIlll[0]];
        tabBlock = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[1]]) {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.brick_block);
            }
        };
        tabDecorations = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[2]]) {
            @Override
            public int getIconItemDamage() {
                return BlockDoublePlant.EnumPlantType.PAEONIA.getMeta();
            }
            
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.double_plant);
            }
        };
        tabRedstone = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[3]]) {
            @Override
            public Item getTabIconItem() {
                return Items.redstone;
            }
        };
        tabTransport = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[4]]) {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.golden_rail);
            }
        };
        final CreativeTabs creativeTabs = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[5]]) {
            @Override
            public Item getTabIconItem() {
                return Items.lava_bucket;
            }
        };
        final EnumEnchantmentType[] relevantEnchantmentTypes = new EnumEnchantmentType[CreativeTabs.lIlllllIIlIlll[2]];
        relevantEnchantmentTypes[CreativeTabs.lIlllllIIlIlll[1]] = EnumEnchantmentType.ALL;
        tabMisc = creativeTabs.setRelevantEnchantmentTypes(relevantEnchantmentTypes);
        tabAllSearch = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[6]]) {
            @Override
            public Item getTabIconItem() {
                return Items.compass;
            }
        }.setBackgroundImageName(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[7]]);
        tabFood = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[8]]) {
            @Override
            public Item getTabIconItem() {
                return Items.apple;
            }
        };
        final CreativeTabs creativeTabs2 = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[9]]) {
            @Override
            public Item getTabIconItem() {
                return Items.iron_axe;
            }
        };
        final EnumEnchantmentType[] relevantEnchantmentTypes2 = new EnumEnchantmentType[CreativeTabs.lIlllllIIlIlll[4]];
        relevantEnchantmentTypes2[CreativeTabs.lIlllllIIlIlll[1]] = EnumEnchantmentType.DIGGER;
        relevantEnchantmentTypes2[CreativeTabs.lIlllllIIlIlll[2]] = EnumEnchantmentType.FISHING_ROD;
        relevantEnchantmentTypes2[CreativeTabs.lIlllllIIlIlll[3]] = EnumEnchantmentType.BREAKABLE;
        tabTools = creativeTabs2.setRelevantEnchantmentTypes(relevantEnchantmentTypes2);
        final CreativeTabs creativeTabs3 = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[10]]) {
            @Override
            public Item getTabIconItem() {
                return Items.golden_sword;
            }
        };
        final EnumEnchantmentType[] relevantEnchantmentTypes3 = new EnumEnchantmentType[CreativeTabs.lIlllllIIlIlll[8]];
        relevantEnchantmentTypes3[CreativeTabs.lIlllllIIlIlll[1]] = EnumEnchantmentType.ARMOR;
        relevantEnchantmentTypes3[CreativeTabs.lIlllllIIlIlll[2]] = EnumEnchantmentType.ARMOR_FEET;
        relevantEnchantmentTypes3[CreativeTabs.lIlllllIIlIlll[3]] = EnumEnchantmentType.ARMOR_HEAD;
        relevantEnchantmentTypes3[CreativeTabs.lIlllllIIlIlll[4]] = EnumEnchantmentType.ARMOR_LEGS;
        relevantEnchantmentTypes3[CreativeTabs.lIlllllIIlIlll[5]] = EnumEnchantmentType.ARMOR_TORSO;
        relevantEnchantmentTypes3[CreativeTabs.lIlllllIIlIlll[6]] = EnumEnchantmentType.BOW;
        relevantEnchantmentTypes3[CreativeTabs.lIlllllIIlIlll[7]] = EnumEnchantmentType.WEAPON;
        tabCombat = creativeTabs3.setRelevantEnchantmentTypes(relevantEnchantmentTypes3);
        tabBrewing = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[11]]) {
            @Override
            public Item getTabIconItem() {
                return Items.potionitem;
            }
        };
        tabMaterials = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[12]]) {
            @Override
            public Item getTabIconItem() {
                return Items.stick;
            }
        };
        tabInventory = new CreativeTabs(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[0]]) {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.chest);
            }
        }.setBackgroundImageName(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[13]]).setNoScrollbar().setNoTitle();
    }
    
    public CreativeTabs setRelevantEnchantmentTypes(final EnumEnchantmentType... llllllllllllIllllIIlllIIlllIlIll) {
        this.enchantmentTypes = llllllllllllIllllIIlllIIlllIlIll;
        return this;
    }
    
    public String getTabLabel() {
        return this.tabLabel;
    }
    
    private static boolean lIIIIlIlIIlllIlI(final int llllllllllllIllllIIlllIIIlllIlIl) {
        return llllllllllllIllllIIlllIIIlllIlIl == 0;
    }
    
    private static boolean lIIIIlIlIIllIlIl(final Object llllllllllllIllllIIlllIIIllllIIl) {
        return llllllllllllIllllIIlllIIIllllIIl == null;
    }
    
    private static boolean lIIIIlIlIIlllIIl(final Object llllllllllllIllllIIlllIIIllllIll) {
        return llllllllllllIllllIIlllIIIllllIll != null;
    }
    
    private static boolean lIIIIlIlIIllIllI(final int llllllllllllIllllIIlllIIlIIIIIlI, final int llllllllllllIllllIIlllIIlIIIIIIl) {
        return llllllllllllIllllIIlllIIlIIIIIlI < llllllllllllIllllIIlllIIlIIIIIIl;
    }
    
    public boolean isTabInFirstRow() {
        if (lIIIIlIlIIllIllI(this.tabIndex, CreativeTabs.lIlllllIIlIlll[7])) {
            return CreativeTabs.lIlllllIIlIlll[2] != 0;
        }
        return CreativeTabs.lIlllllIIlIlll[1] != 0;
    }
    
    private static boolean lIIIIlIlIIlllIII(final int llllllllllllIllllIIlllIIlIIIIllI, final int llllllllllllIllllIIlllIIlIIIIlIl) {
        return llllllllllllIllllIIlllIIlIIIIllI >= llllllllllllIllllIIlllIIlIIIIlIl;
    }
    
    public ItemStack getIconItemStack() {
        if (lIIIIlIlIIllIlIl(this.iconItemStack)) {
            this.iconItemStack = new ItemStack(this.getTabIconItem(), CreativeTabs.lIlllllIIlIlll[2], this.getIconItemDamage());
        }
        return this.iconItemStack;
    }
    
    public String getTranslatedTabLabel() {
        return String.valueOf(new StringBuilder(CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[15]]).append(this.getTabLabel()));
    }
    
    private static void lIIIIlIlIIlIlIIl() {
        (lIlllllIIIlIll = new String[CreativeTabs.lIlllllIIlIlll[16]])[CreativeTabs.lIlllllIIlIlll[1]] = lIIIIlIlIIlIIIIl("FTMgLiEeKC4AKRglIjE=", "wFIBE");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[2]] = lIIIIlIlIIlIIIlI("phODARhC+w2FIR97k1FgYw==", "rWdCO");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[3]] = lIIIIlIlIIlIIIlI("qMTVU6md3jQJpyu0BeMAzw==", "dlPjC");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[4]] = lIIIIlIlIIlIIIlI("oSjv5DjJpjzlxoe217wIkA==", "Lhmgq");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[5]] = lIIIIlIlIIlIIIlI("pjDtT0nkfbs=", "MoQQk");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[6]] = lIIIIlIlIIlIIIIl("Ng4IBQ4t", "Ekiwm");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[7]] = lIIIIlIlIIlIIIlI("q4hnVem1awnyqIK36atOuQ==", "HvzhM");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[8]] = lIIIIlIlIIlIIllI("+X71Q0m6da8=", "wPdsI");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[9]] = lIIIIlIlIIlIIIIl("DD8CJBA=", "xPmHc");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[10]] = lIIIIlIlIIlIIllI("lbvcKB3HvvA=", "WXNdX");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[11]] = lIIIIlIlIIlIIIlI("emFmQQKjUn8=", "AYRxA");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[12]] = lIIIIlIlIIlIIIIl("PQs7EDg5CyMG", "PjOuJ");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[0]] = lIIIIlIlIIlIIllI("jTA88PLkzyI/T4aNLej4Eg==", "lWLKW");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[13]] = lIIIIlIlIIlIIIlI("Lenr1/F0PhufLfgo+V0EQQ==", "AkvBg");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[14]] = lIIIIlIlIIlIIIIl("HRAnBR5aFCwP", "tdBhm");
        CreativeTabs.lIlllllIIIlIll[CreativeTabs.lIlllllIIlIlll[15]] = lIIIIlIlIIlIIIIl("DhkCCwUVAhIWbA==", "gmgfB");
    }
    
    public CreativeTabs setNoScrollbar() {
        this.hasScrollbar = (CreativeTabs.lIlllllIIlIlll[1] != 0);
        return this;
    }
    
    public int getTabColumn() {
        return this.tabIndex % CreativeTabs.lIlllllIIlIlll[7];
    }
    
    public boolean drawInForegroundOfTab() {
        return this.drawTitle;
    }
    
    public boolean shouldHidePlayerInventory() {
        return this.hasScrollbar;
    }
    
    public CreativeTabs setBackgroundImageName(final String llllllllllllIllllIIlllIlIIIIlIII) {
        this.theTexture = llllllllllllIllllIIlllIlIIIIlIII;
        return this;
    }
    
    private static String lIIIIlIlIIlIIIlI(final String llllllllllllIllllIIlllIIlIllIIll, final String llllllllllllIllllIIlllIIlIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIlllIIlIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlllIIlIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlllIIlIllIlIl.init(CreativeTabs.lIlllllIIlIlll[3], llllllllllllIllllIIlllIIlIllIllI);
            return new String(llllllllllllIllllIIlllIIlIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlllIIlIllIlII) {
            llllllllllllIllllIIlllIIlIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIlIlIIlIIIIl(String llllllllllllIllllIIlllIIlIIlIIIl, final String llllllllllllIllllIIlllIIlIIlIIII) {
        llllllllllllIllllIIlllIIlIIlIIIl = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlllIIlIIlIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlllIIlIIlIlII = new StringBuilder();
        final char[] llllllllllllIllllIIlllIIlIIlIIll = llllllllllllIllllIIlllIIlIIlIIII.toCharArray();
        int llllllllllllIllllIIlllIIlIIlIIlI = CreativeTabs.lIlllllIIlIlll[1];
        final byte llllllllllllIllllIIlllIIlIIIllII = (Object)((String)llllllllllllIllllIIlllIIlIIlIIIl).toCharArray();
        final long llllllllllllIllllIIlllIIlIIIlIll = llllllllllllIllllIIlllIIlIIIllII.length;
        float llllllllllllIllllIIlllIIlIIIlIlI = CreativeTabs.lIlllllIIlIlll[1];
        while (lIIIIlIlIIllIllI((int)llllllllllllIllllIIlllIIlIIIlIlI, (int)llllllllllllIllllIIlllIIlIIIlIll)) {
            final char llllllllllllIllllIIlllIIlIIlIlll = llllllllllllIllllIIlllIIlIIIllII[llllllllllllIllllIIlllIIlIIIlIlI];
            llllllllllllIllllIIlllIIlIIlIlII.append((char)(llllllllllllIllllIIlllIIlIIlIlll ^ llllllllllllIllllIIlllIIlIIlIIll[llllllllllllIllllIIlllIIlIIlIIlI % llllllllllllIllllIIlllIIlIIlIIll.length]));
            "".length();
            ++llllllllllllIllllIIlllIIlIIlIIlI;
            ++llllllllllllIllllIIlllIIlIIIlIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlllIIlIIlIlII);
    }
    
    public boolean hasRelevantEnchantmentType(final EnumEnchantmentType llllllllllllIllllIIlllIIlllIIIll) {
        if (lIIIIlIlIIllIlIl(this.enchantmentTypes)) {
            return CreativeTabs.lIlllllIIlIlll[1] != 0;
        }
        final String llllllllllllIllllIIlllIIllIlllII;
        final long llllllllllllIllllIIlllIIllIlllIl = ((EnumEnchantmentType[])(Object)(llllllllllllIllllIIlllIIllIlllII = (String)(Object)this.enchantmentTypes)).length;
        Exception llllllllllllIllllIIlllIIllIllllI = (Exception)CreativeTabs.lIlllllIIlIlll[1];
        "".length();
        if (((0x48 ^ 0x1B) & ~(0x6D ^ 0x3E)) != 0x0) {
            return ((0x2C ^ 0x9) & ~(0x3B ^ 0x1E)) != 0x0;
        }
        while (!lIIIIlIlIIlllIII((int)llllllllllllIllllIIlllIIllIllllI, (int)llllllllllllIllllIIlllIIllIlllIl)) {
            final EnumEnchantmentType llllllllllllIllllIIlllIIlllIIIlI = llllllllllllIllllIIlllIIllIlllII[llllllllllllIllllIIlllIIllIllllI];
            if (lIIIIlIlIIllIlll(llllllllllllIllllIIlllIIlllIIIlI, llllllllllllIllllIIlllIIlllIIIll)) {
                return CreativeTabs.lIlllllIIlIlll[2] != 0;
            }
            ++llllllllllllIllllIIlllIIllIllllI;
        }
        return CreativeTabs.lIlllllIIlIlll[1] != 0;
    }
    
    private static String lIIIIlIlIIlIIllI(final String llllllllllllIllllIIlllIIlIlIIllI, final String llllllllllllIllllIIlllIIlIlIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIlllIIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), CreativeTabs.lIlllllIIlIlll[9]), "DES");
            final Cipher llllllllllllIllllIIlllIIlIlIlIII = Cipher.getInstance("DES");
            llllllllllllIllllIIlllIIlIlIlIII.init(CreativeTabs.lIlllllIIlIlll[3], llllllllllllIllllIIlllIIlIlIlIIl);
            return new String(llllllllllllIllllIIlllIIlIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllIIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlllIIlIlIIlll) {
            llllllllllllIllllIIlllIIlIlIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlIlIIllIlII() {
        (lIlllllIIlIlll = new int[17])[0] = (0x41 ^ 0x5E ^ (0x39 ^ 0x2A));
        CreativeTabs.lIlllllIIlIlll[1] = ((0xC ^ 0x8) & ~(0x4B ^ 0x4F));
        CreativeTabs.lIlllllIIlIlll[2] = " ".length();
        CreativeTabs.lIlllllIIlIlll[3] = "  ".length();
        CreativeTabs.lIlllllIIlIlll[4] = "   ".length();
        CreativeTabs.lIlllllIIlIlll[5] = (0x64 ^ 0x60);
        CreativeTabs.lIlllllIIlIlll[6] = (0xB6 ^ 0xB3);
        CreativeTabs.lIlllllIIlIlll[7] = (45 + 36 + 9 + 41 ^ 2 + 7 + 25 + 99);
        CreativeTabs.lIlllllIIlIlll[8] = (0x82 ^ 0x85);
        CreativeTabs.lIlllllIIlIlll[9] = (62 + 54 + 48 + 7 ^ 125 + 39 - 34 + 33);
        CreativeTabs.lIlllllIIlIlll[10] = (0x7 ^ 0x38 ^ (0xC ^ 0x3A));
        CreativeTabs.lIlllllIIlIlll[11] = (0xA6 ^ 0xAC);
        CreativeTabs.lIlllllIIlIlll[12] = (0xA7 ^ 0xBA ^ (0x2F ^ 0x39));
        CreativeTabs.lIlllllIIlIlll[13] = (0x25 ^ 0x28);
        CreativeTabs.lIlllllIIlIlll[14] = (12 + 94 - 58 + 85 ^ 49 + 58 - 13 + 45);
        CreativeTabs.lIlllllIIlIlll[15] = (0xB1 ^ 0xBE);
        CreativeTabs.lIlllllIIlIlll[16] = (87 + 30 - 81 + 91 ^ (0x10 ^ 0x7F));
    }
    
    public void displayAllReleventItems(final List<ItemStack> llllllllllllIllllIIlllIIllIlIllI) {
        final char llllllllllllIllllIIlllIIllIlIIIl = (char)Item.itemRegistry.iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIIIIlIlIIlllIlI(((Iterator)llllllllllllIllllIIlllIIllIlIIIl).hasNext() ? 1 : 0)) {
            final Item llllllllllllIllllIIlllIIllIlIlIl = ((Iterator<Item>)llllllllllllIllllIIlllIIllIlIIIl).next();
            if (lIIIIlIlIIlllIIl(llllllllllllIllllIIlllIIllIlIlIl) && lIIIIlIlIIllIlll(llllllllllllIllllIIlllIIllIlIlIl.getCreativeTab(), this)) {
                llllllllllllIllllIIlllIIllIlIlIl.getSubItems(llllllllllllIllllIIlllIIllIlIlIl, this, llllllllllllIllllIIlllIIllIlIllI);
            }
        }
        if (lIIIIlIlIIlllIIl(this.getRelevantEnchantmentTypes())) {
            this.addEnchantmentBooksToList(llllllllllllIllllIIlllIIllIlIllI, this.getRelevantEnchantmentTypes());
        }
    }
    
    public int getTabIndex() {
        return this.tabIndex;
    }
    
    public abstract Item getTabIconItem();
    
    public CreativeTabs setNoTitle() {
        this.drawTitle = (CreativeTabs.lIlllllIIlIlll[1] != 0);
        return this;
    }
    
    private static boolean lIIIIlIlIIlllIll(final int llllllllllllIllllIIlllIIIlllIlll) {
        return llllllllllllIllllIIlllIIIlllIlll != 0;
    }
    
    public int getIconItemDamage() {
        return CreativeTabs.lIlllllIIlIlll[1];
    }
    
    public EnumEnchantmentType[] getRelevantEnchantmentTypes() {
        return this.enchantmentTypes;
    }
}
