// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.Entity;
import java.util.Iterator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import com.google.common.collect.Multimap;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.potion.Potion;
import net.minecraft.util.StatCollector;
import com.google.common.collect.HashMultimap;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionEffect;
import java.util.List;
import java.util.Map;

public class ItemPotion extends Item
{
    private /* synthetic */ Map<Integer, List<PotionEffect>> effectCache;
    private static final /* synthetic */ Map<List<PotionEffect>, Integer> SUB_ITEMS_CACHE;
    private static final /* synthetic */ String[] lllIllIIIlllII;
    private static final /* synthetic */ int[] lllIllIIIlllIl;
    
    private static void lIlIIlIIIlIIIIII() {
        (lllIllIIIlllIl = new int[26])[0] = " ".length();
        ItemPotion.lllIllIIIlllIl[1] = ("  ".length() & ("  ".length() ^ -" ".length()));
        ItemPotion.lllIllIIIlllIl[2] = (0x19 ^ 0x10);
        ItemPotion.lllIllIIIlllIl[3] = (150 + 148 - 158 + 39 ^ 158 + 157 - 226 + 96);
        ItemPotion.lllIllIIIlllIl[4] = (0x72 ^ 0x5C ^ (0xD ^ 0x3));
        ItemPotion.lllIllIIIlllIl[5] = "  ".length();
        ItemPotion.lllIllIIIlllIl[6] = (0xFFFFE0C2 & 0x5F3D);
        ItemPotion.lllIllIIIlllIl[7] = (-1 & 0xFFFFFF);
        ItemPotion.lllIllIIIlllIl[8] = "   ".length();
        ItemPotion.lllIllIIIlllIl[9] = (0x4D ^ 0x49);
        ItemPotion.lllIllIIIlllIl[10] = (0xC2 ^ 0xC7);
        ItemPotion.lllIllIIIlllIl[11] = (0x99 ^ 0x9F);
        ItemPotion.lllIllIIIlllIl[12] = (((0x5D ^ 0x41) & ~(0x97 ^ 0x8B)) ^ (0x1E ^ 0x19));
        ItemPotion.lllIllIIIlllIl[13] = (0x71 ^ 0x79);
        ItemPotion.lllIllIIIlllIl[14] = (0x76 ^ 0x2E ^ (0xC ^ 0x40));
        ItemPotion.lllIllIIIlllIl[15] = (0xD1 ^ 0x9B ^ (0x24 ^ 0x65));
        ItemPotion.lllIllIIIlllIl[16] = (0x15 ^ 0x19);
        ItemPotion.lllIllIIIlllIl[17] = (0 + 19 + 108 + 56 ^ 49 + 185 - 120 + 72);
        ItemPotion.lllIllIIIlllIl[18] = (0xA6 ^ 0xA8);
        ItemPotion.lllIllIIIlllIl[19] = (0x7 ^ 0x9 ^ " ".length());
        ItemPotion.lllIllIIIlllIl[20] = (0x8E ^ 0x9E);
        ItemPotion.lllIllIIIlllIl[21] = (0x45 ^ 0x54);
        ItemPotion.lllIllIIIlllIl[22] = (0xA7 ^ 0xB5);
        ItemPotion.lllIllIIIlllIl[23] = (0x39 ^ 0x2A);
        ItemPotion.lllIllIIIlllIl[24] = (0xFFFFB939 & 0x66C6);
        ItemPotion.lllIllIIIlllIl[25] = (0x1C ^ 0x6E ^ (0x17 ^ 0x25));
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack llllllllllllIlIllIIllIllIlllllII, final int llllllllllllIlIllIIllIllIllllIll) {
        int colorFromDamage;
        if (lIlIIlIIIlIIIlll(llllllllllllIlIllIIllIllIllllIll)) {
            colorFromDamage = ItemPotion.lllIllIIIlllIl[7];
            "".length();
            if (null != null) {
                return (71 + 40 + 29 + 18 ^ 137 + 137 - 182 + 85) & (115 + 37 - 80 + 72 ^ 27 + 172 - 20 + 12 ^ -" ".length());
            }
        }
        else {
            colorFromDamage = this.getColorFromDamage(llllllllllllIlIllIIllIllIlllllII.getMetadata());
        }
        return colorFromDamage;
    }
    
    private static void lIlIIlIIIIllllll() {
        (lllIllIIIlllII = new String[ItemPotion.lllIllIIIlllIl[14]])[ItemPotion.lllIllIIIlllIl[1]] = lIlIIlIIIIllllII("Ih0FBgkMOBkGDw4GMxQABAsCAQ==", "ahvrf");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[0]] = lIlIIlIIIIllllII("JB4wBisKOywGLQgFBhQiAgg3AQ==", "gkCrD");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[5]] = lIlIIlIIIIllllII("HisWLR4BZBomBg==", "lJxIq");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[8]] = lIlIIlIIIIllllII("LjgrHV4iIT4ECRcjOhkfKWIgER0i", "GLNpp");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[9]] = lIlIIlIIIIllllII("", "UbwNG");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[10]] = lIlIIlIIIIllllIl("7UkxxnoDrckeffJWJCM+VsCA/z4eD0BX", "MHiZY");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[11]] = lIlIIlIIIIllllIl("9hAF1vgHu8I=", "rsePu");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[12]] = lIlIIlIIIIllllIl("zKOBi05MGo255KIo5D5eSg==", "jRicX");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[13]] = lIlIIlIIIIlllllI("R1Q5oWiQKsY=", "xhhIJ");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[2]] = lIlIIlIIIIllllIl("OpZlw8bl6M8=", "iSDwZ");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[3]] = lIlIIlIIIIllllII("NDc/HgYqdjsYHSE2KA5H", "DXKwi");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[15]] = lIlIIlIIIIllllIl("gcAgk7okm10=", "XruBt");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[16]] = lIlIIlIIIIllllIl("bSwB3t5+bm8=", "abSxq");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[17]] = lIlIIlIIIIllllII("IwQhOwg9RTA/FycS", "SkURg");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[18]] = lIlIIlIIIIlllllI("xo9/uUqUTsg=", "CYgdA");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[19]] = lIlIIlIIIIlllllI("EcPPp0c7wFTiggqrJPwlf9Gg2M54DBi8FCG0Q10l0Cc=", "cbluN");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[20]] = lIlIIlIIIIllllIl("rAVfwEFVuAkJAXvi8eludSVdFeP4krgrEyOt7qn5Dt0=", "whBFc");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[21]] = lIlIIlIIIIllllII("MTYWKgIyNxY9RT4jDz1F", "PBbXk");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[22]] = lIlIIlIIIIllllIl("rfpp3csYggwkbgKRfH1opi+YzjuDa/MrXsL8XdGyjj8=", "hAbiz");
        ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[23]] = lIlIIlIIIIlllllI("EES6UuYko2aYk/q6Bm3uQA==", "BzXXn");
    }
    
    public List<PotionEffect> getEffects(final int llllllllllllIlIllIIllIlllIllIIII) {
        List<PotionEffect> llllllllllllIlIllIIllIlllIllIIlI = this.effectCache.get(llllllllllllIlIllIIllIlllIllIIII);
        if (lIlIIlIIIlIIIlII(llllllllllllIlIllIIllIlllIllIIlI)) {
            llllllllllllIlIllIIllIlllIllIIlI = PotionHelper.getPotionEffects(llllllllllllIlIllIIllIlllIllIIII, (boolean)(ItemPotion.lllIllIIIlllIl[1] != 0));
            this.effectCache.put(llllllllllllIlIllIIllIlllIllIIII, llllllllllllIlIllIIllIlllIllIIlI);
            "".length();
        }
        return llllllllllllIlIllIIllIlllIllIIlI;
    }
    
    private static String lIlIIlIIIIllllII(String llllllllllllIlIllIIllIlIllllIlIl, final String llllllllllllIlIllIIllIlIllllIlII) {
        llllllllllllIlIllIIllIlIllllIlIl = new String(Base64.getDecoder().decode(llllllllllllIlIllIIllIlIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIllIlIlllllIII = new StringBuilder();
        final char[] llllllllllllIlIllIIllIlIllllIlll = llllllllllllIlIllIIllIlIllllIlII.toCharArray();
        int llllllllllllIlIllIIllIlIllllIllI = ItemPotion.lllIllIIIlllIl[1];
        final int llllllllllllIlIllIIllIlIllllIIII = (Object)llllllllllllIlIllIIllIlIllllIlIl.toCharArray();
        final char llllllllllllIlIllIIllIlIlllIllll = (char)llllllllllllIlIllIIllIlIllllIIII.length;
        float llllllllllllIlIllIIllIlIlllIlllI = ItemPotion.lllIllIIIlllIl[1];
        while (lIlIIlIIIlIIlllI((int)llllllllllllIlIllIIllIlIlllIlllI, llllllllllllIlIllIIllIlIlllIllll)) {
            final char llllllllllllIlIllIIllIlIlllllIll = llllllllllllIlIllIIllIlIllllIIII[llllllllllllIlIllIIllIlIlllIlllI];
            llllllllllllIlIllIIllIlIlllllIII.append((char)(llllllllllllIlIllIIllIlIlllllIll ^ llllllllllllIlIllIIllIlIllllIlll[llllllllllllIlIllIIllIlIllllIllI % llllllllllllIlIllIIllIlIllllIlll.length]));
            "".length();
            ++llllllllllllIlIllIIllIlIllllIllI;
            ++llllllllllllIlIllIIllIlIlllIlllI;
            "".length();
            if ((0x75 ^ 0x3E ^ (0xD ^ 0x42)) == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIllIlIlllllIII);
    }
    
    private static boolean lIlIIlIIIlIIIlIl(final int llllllllllllIlIllIIllIlIlIlllIll) {
        return llllllllllllIlIllIIllIlIlIlllIll == 0;
    }
    
    private static boolean lIlIIlIIIlIIIlII(final Object llllllllllllIlIllIIllIlIlIllllll) {
        return llllllllllllIlIllIIllIlIlIllllll == null;
    }
    
    private static boolean lIlIIlIIIlIIIlll(final int llllllllllllIlIllIIllIlIlIllIlIl) {
        return llllllllllllIlIllIIllIlIlIllIlIl > 0;
    }
    
    private static boolean lIlIIlIIIlIIIIll(final int llllllllllllIlIllIIllIlIllIIllII, final int llllllllllllIlIllIIllIlIllIIlIll) {
        return llllllllllllIlIllIIllIlIllIIllII >= llllllllllllIlIllIIllIlIllIIlIll;
    }
    
    public static boolean isSplash(final int llllllllllllIlIllIIllIlllIIIlIIl) {
        if (lIlIIlIIIlIIIIIl(llllllllllllIlIllIIllIlllIIIlIIl & ItemPotion.lllIllIIIlllIl[6])) {
            return ItemPotion.lllIllIIIlllIl[0] != 0;
        }
        return ItemPotion.lllIllIIIlllIl[1] != 0;
    }
    
    @Override
    public void addInformation(final ItemStack llllllllllllIlIllIIllIllIlIIlllI, final EntityPlayer llllllllllllIlIllIIllIllIlIIllIl, final List<String> llllllllllllIlIllIIllIllIIlllIlI, final boolean llllllllllllIlIllIIllIllIlIIlIll) {
        if (lIlIIlIIIlIIIIIl(llllllllllllIlIllIIllIllIlIIlllI.getMetadata())) {
            final List<PotionEffect> llllllllllllIlIllIIllIllIlIIlIlI = Items.potionitem.getEffects(llllllllllllIlIllIIllIllIlIIlllI);
            final Multimap<String, AttributeModifier> llllllllllllIlIllIIllIllIlIIlIIl = (Multimap<String, AttributeModifier>)HashMultimap.create();
            if (lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIllIlIIlIlI) && lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIlIIlIlI.isEmpty() ? 1 : 0)) {
                final double llllllllllllIlIllIIllIllIIllIllI = (double)llllllllllllIlIllIIllIllIlIIlIlI.iterator();
                "".length();
                if (((0xE6 ^ 0xB8) & ~(0x5D ^ 0x3)) != 0x0) {
                    return;
                }
                while (!lIlIIlIIIlIIIlIl(((Iterator)llllllllllllIlIllIIllIllIIllIllI).hasNext() ? 1 : 0)) {
                    final PotionEffect llllllllllllIlIllIIllIllIlIIlIII = ((Iterator<PotionEffect>)llllllllllllIlIllIIllIllIIllIllI).next();
                    String llllllllllllIlIllIIllIllIlIIIlll = StatCollector.translateToLocal(llllllllllllIlIllIIllIllIlIIlIII.getEffectName()).trim();
                    final Potion llllllllllllIlIllIIllIllIlIIIllI = Potion.potionTypes[llllllllllllIlIllIIllIllIlIIlIII.getPotionID()];
                    final Map<IAttribute, AttributeModifier> llllllllllllIlIllIIllIllIlIIIlIl = llllllllllllIlIllIIllIllIlIIIllI.getAttributeModifierMap();
                    if (lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIllIlIIIlIl) && lIlIIlIIIlIIIlll(llllllllllllIlIllIIllIllIlIIIlIl.size())) {
                        final int llllllllllllIlIllIIllIllIIllIIIl = (int)llllllllllllIlIllIIllIllIlIIIlIl.entrySet().iterator();
                        "".length();
                        if (" ".length() > "  ".length()) {
                            return;
                        }
                        while (!lIlIIlIIIlIIIlIl(((Iterator)llllllllllllIlIllIIllIllIIllIIIl).hasNext() ? 1 : 0)) {
                            final Map.Entry<IAttribute, AttributeModifier> llllllllllllIlIllIIllIllIlIIIlII = ((Iterator<Map.Entry<IAttribute, AttributeModifier>>)llllllllllllIlIllIIllIllIIllIIIl).next();
                            final AttributeModifier llllllllllllIlIllIIllIllIlIIIIll = llllllllllllIlIllIIllIllIlIIIlII.getValue();
                            final AttributeModifier llllllllllllIlIllIIllIllIlIIIIlI = new AttributeModifier(llllllllllllIlIllIIllIllIlIIIIll.getName(), llllllllllllIlIllIIllIllIlIIIllI.getAttributeModifierAmount(llllllllllllIlIllIIllIllIlIIlIII.getAmplifier(), llllllllllllIlIllIIllIllIlIIIIll), llllllllllllIlIllIIllIllIlIIIIll.getOperation());
                            llllllllllllIlIllIIllIllIlIIlIIl.put((Object)llllllllllllIlIllIIllIllIlIIIlII.getKey().getAttributeUnlocalizedName(), (Object)llllllllllllIlIllIIllIllIlIIIIlI);
                            "".length();
                        }
                    }
                    if (lIlIIlIIIlIIIlll(llllllllllllIlIllIIllIllIlIIlIII.getAmplifier())) {
                        llllllllllllIlIllIIllIllIlIIIlll = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIllIllIlIIIlll)).append(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[2]]).append(StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[3]]).append(llllllllllllIlIllIIllIllIlIIlIII.getAmplifier()))).trim()));
                    }
                    if (lIlIIlIIIlIIlIlI(llllllllllllIlIllIIllIllIlIIlIII.getDuration(), ItemPotion.lllIllIIIlllIl[14])) {
                        llllllllllllIlIllIIllIllIlIIIlll = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIllIllIlIIIlll)).append(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[15]]).append(Potion.getDurationString(llllllllllllIlIllIIllIllIlIIlIII)).append(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[16]]));
                    }
                    if (lIlIIlIIIlIIIIIl(llllllllllllIlIllIIllIllIlIIIllI.isBadEffect() ? 1 : 0)) {
                        llllllllllllIlIllIIllIllIIlllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(llllllllllllIlIllIIllIllIlIIIlll)));
                        "".length();
                        "".length();
                        if (((0x9 ^ 0x79 ^ (0x5B ^ 0x69)) & (0x4 ^ 0x52 ^ (0x15 ^ 0x1) ^ -" ".length())) >= " ".length()) {
                            return;
                        }
                        continue;
                    }
                    else {
                        llllllllllllIlIllIIllIllIIlllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(llllllllllllIlIllIIllIllIlIIIlll)));
                        "".length();
                    }
                }
                "".length();
                if (((0x4F ^ 0x19) & ~(0x4E ^ 0x18)) > 0) {
                    return;
                }
            }
            else {
                final String llllllllllllIlIllIIllIllIlIIIIIl = StatCollector.translateToLocal(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[17]]).trim();
                llllllllllllIlIllIIllIllIIlllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(llllllllllllIlIllIIllIllIlIIIIIl)));
                "".length();
            }
            if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIlIIlIIl.isEmpty() ? 1 : 0)) {
                llllllllllllIlIllIIllIllIIlllIlI.add(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[18]]);
                "".length();
                llllllllllllIlIllIIllIllIIlllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_PURPLE).append(StatCollector.translateToLocal(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[19]]))));
                "".length();
                final double llllllllllllIlIllIIllIllIIllIllI = (double)llllllllllllIlIllIIllIllIlIIlIIl.entries().iterator();
                "".length();
                if (((0x3B ^ 0x33 ^ (0xEA ^ 0xA6)) & (98 + 132 - 73 + 58 ^ 110 + 69 - 90 + 58 ^ -" ".length())) <= -" ".length()) {
                    return;
                }
                while (!lIlIIlIIIlIIIlIl(((Iterator)llllllllllllIlIllIIllIllIIllIllI).hasNext() ? 1 : 0)) {
                    final Map.Entry<String, AttributeModifier> llllllllllllIlIllIIllIllIlIIIIII = ((Iterator<Map.Entry<String, AttributeModifier>>)llllllllllllIlIllIIllIllIIllIllI).next();
                    final AttributeModifier llllllllllllIlIllIIllIllIIllllll = llllllllllllIlIllIIllIllIlIIIIII.getValue();
                    final double llllllllllllIlIllIIllIllIIlllllI = llllllllllllIlIllIIllIllIIllllll.getAmount();
                    double llllllllllllIlIllIIllIllIIllllII;
                    if (lIlIIlIIIlIIlIll(llllllllllllIlIllIIllIllIIllllll.getOperation(), ItemPotion.lllIllIIIlllIl[0]) && lIlIIlIIIlIIlIll(llllllllllllIlIllIIllIllIIllllll.getOperation(), ItemPotion.lllIllIIIlllIl[5])) {
                        final double llllllllllllIlIllIIllIllIIllllIl = llllllllllllIlIllIIllIllIIllllll.getAmount();
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIlIllIIllIllIIllllII = llllllllllllIlIllIIllIllIIllllll.getAmount() * 100.0;
                    }
                    if (lIlIIlIIIlIIIlll(lIlIIlIIIlIIlIII(llllllllllllIlIllIIllIllIIlllllI, 0.0))) {
                        final StringBuilder append = new StringBuilder().append(EnumChatFormatting.BLUE);
                        final String value = String.valueOf(new StringBuilder(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[20]]).append(llllllllllllIlIllIIllIllIIllllll.getOperation()));
                        final Object[] lllllllllllllIIIllIlllIIlIlIlllI = new Object[ItemPotion.lllIllIIIlllIl[5]];
                        lllllllllllllIIIllIlllIIlIlIlllI[ItemPotion.lllIllIIIlllIl[1]] = ItemStack.DECIMALFORMAT.format(llllllllllllIlIllIIllIllIIllllII);
                        lllllllllllllIIIllIlllIIlIlIlllI[ItemPotion.lllIllIIIlllIl[0]] = StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[21]]).append(llllllllllllIlIllIIllIllIlIIIIII.getKey())));
                        llllllllllllIlIllIIllIllIIlllIlI.add(String.valueOf(append.append(StatCollector.translateToLocalFormatted(value, lllllllllllllIIIllIlllIIlIlIlllI))));
                        "".length();
                        "".length();
                        if ("  ".length() == (0x12 ^ 0x16)) {
                            return;
                        }
                        continue;
                    }
                    else {
                        if (!lIlIIlIIIlIIllII(lIlIIlIIIlIIlIIl(llllllllllllIlIllIIllIllIIlllllI, 0.0))) {
                            continue;
                        }
                        llllllllllllIlIllIIllIllIIllllII *= -1.0;
                        final StringBuilder append2 = new StringBuilder().append(EnumChatFormatting.RED);
                        final String value2 = String.valueOf(new StringBuilder(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[22]]).append(llllllllllllIlIllIIllIllIIllllll.getOperation()));
                        final Object[] lllllllllllllIIIllIlllIIlIlIlllI2 = new Object[ItemPotion.lllIllIIIlllIl[5]];
                        lllllllllllllIIIllIlllIIlIlIlllI2[ItemPotion.lllIllIIIlllIl[1]] = ItemStack.DECIMALFORMAT.format(llllllllllllIlIllIIllIllIIllllII);
                        lllllllllllllIIIllIlllIIlIlIlllI2[ItemPotion.lllIllIIIlllIl[0]] = StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[23]]).append(llllllllllllIlIllIIllIllIlIIIIII.getKey())));
                        llllllllllllIlIllIIllIllIIlllIlI.add(String.valueOf(append2.append(StatCollector.translateToLocalFormatted(value2, lllllllllllllIIIllIlllIIlIlIlllI2))));
                        "".length();
                    }
                }
            }
        }
    }
    
    private static String lIlIIlIIIIllllIl(final String llllllllllllIlIllIIllIlIlllIIIll, final String llllllllllllIlIllIIllIlIlllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllIlIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), ItemPotion.lllIllIIIlllIl[13]), "DES");
            final Cipher llllllllllllIlIllIIllIlIlllIIlll = Cipher.getInstance("DES");
            llllllllllllIlIllIIllIlIlllIIlll.init(ItemPotion.lllIllIIIlllIl[5], llllllllllllIlIllIIllIlIlllIlIII);
            return new String(llllllllllllIlIllIIllIlIlllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIlIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllIlIlllIIllI) {
            llllllllllllIlIllIIllIlIlllIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIIIlIIIIIl(final int llllllllllllIlIllIIllIlIlIllllIl) {
        return llllllllllllIlIllIIllIlIlIllllIl != 0;
    }
    
    private static boolean lIlIIlIIIlIIlllI(final int llllllllllllIlIllIIllIlIllIIlIII, final int llllllllllllIlIllIIllIlIllIIIlll) {
        return llllllllllllIlIllIIllIlIllIIlIII < llllllllllllIlIllIIllIlIllIIIlll;
    }
    
    private static String lIlIIlIIIIlllllI(final String llllllllllllIlIllIIllIlIllIllIII, final String llllllllllllIlIllIIllIlIllIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllIlIllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIlIllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIllIlIllIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIllIlIllIllIlI.init(ItemPotion.lllIllIIIlllIl[5], llllllllllllIlIllIIllIlIllIllIll);
            return new String(llllllllllllIlIllIIllIlIllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIlIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllIlIllIllIIl) {
            llllllllllllIlIllIIllIlIllIllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getItemStackDisplayName(final ItemStack llllllllllllIlIllIIllIllIllIIIII) {
        if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIllIIIII.getMetadata())) {
            return StatCollector.translateToLocal(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[8]]).trim();
        }
        String llllllllllllIlIllIIllIllIllIIlIl = ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[9]];
        if (lIlIIlIIIlIIIIIl(isSplash(llllllllllllIlIllIIllIllIllIIIII.getMetadata()) ? 1 : 0)) {
            llllllllllllIlIllIIllIllIllIIlIl = String.valueOf(new StringBuilder(String.valueOf(StatCollector.translateToLocal(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[10]]).trim())).append(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[11]]));
        }
        final List<PotionEffect> llllllllllllIlIllIIllIllIllIIlII = Items.potionitem.getEffects(llllllllllllIlIllIIllIllIllIIIII);
        if (lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIllIllIIlII) && lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIllIIlII.isEmpty() ? 1 : 0)) {
            String llllllllllllIlIllIIllIllIllIIIll = llllllllllllIlIllIIllIllIllIIlII.get(ItemPotion.lllIllIIIlllIl[1]).getEffectName();
            llllllllllllIlIllIIllIllIllIIIll = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIllIllIllIIIll)).append(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[12]]));
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIllIllIllIIlIl)).append(StatCollector.translateToLocal(llllllllllllIlIllIIllIllIllIIIll).trim()));
        }
        final String llllllllllllIlIllIIllIllIllIIIlI = PotionHelper.getPotionPrefix(llllllllllllIlIllIIllIllIllIIIII.getMetadata());
        return String.valueOf(new StringBuilder(String.valueOf(StatCollector.translateToLocal(llllllllllllIlIllIIllIllIllIIIlI).trim())).append(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[13]]).append(super.getItemStackDisplayName(llllllllllllIlIllIIllIllIllIIIII)));
    }
    
    private static boolean lIlIIlIIIlIIIllI(final int llllllllllllIlIllIIllIlIlIllIlll) {
        return llllllllllllIlIllIIllIlIlIllIlll <= 0;
    }
    
    private static boolean lIlIIlIIIlIIllIl(final int llllllllllllIlIllIIllIlIllIlIIII, final int llllllllllllIlIllIIllIlIllIIllll) {
        return llllllllllllIlIllIIllIlIllIlIIII == llllllllllllIlIllIIllIlIllIIllll;
    }
    
    public int getColorFromDamage(final int llllllllllllIlIllIIllIlllIIIIlIl) {
        return PotionHelper.getLiquidColor(llllllllllllIlIllIIllIlllIIIIlIl, (boolean)(ItemPotion.lllIllIIIlllIl[1] != 0));
    }
    
    static {
        lIlIIlIIIlIIIIII();
        lIlIIlIIIIllllll();
        SUB_ITEMS_CACHE = Maps.newLinkedHashMap();
    }
    
    public List<PotionEffect> getEffects(final ItemStack llllllllllllIlIllIIllIllllIIIlIl) {
        if (!lIlIIlIIIlIIIIIl(llllllllllllIlIllIIllIllllIIIlIl.hasTagCompound() ? 1 : 0) || !lIlIIlIIIlIIIIIl(llllllllllllIlIllIIllIllllIIIlIl.getTagCompound().hasKey(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[1]], ItemPotion.lllIllIIIlllIl[2]) ? 1 : 0)) {
            List<PotionEffect> llllllllllllIlIllIIllIlllIllllll = this.effectCache.get(llllllllllllIlIllIIllIllllIIIlIl.getMetadata());
            if (lIlIIlIIIlIIIlII(llllllllllllIlIllIIllIlllIllllll)) {
                llllllllllllIlIllIIllIlllIllllll = PotionHelper.getPotionEffects(llllllllllllIlIllIIllIllllIIIlIl.getMetadata(), (boolean)(ItemPotion.lllIllIIIlllIl[1] != 0));
                this.effectCache.put(llllllllllllIlIllIIllIllllIIIlIl.getMetadata(), llllllllllllIlIllIIllIlllIllllll);
                "".length();
            }
            return llllllllllllIlIllIIllIlllIllllll;
        }
        final List<PotionEffect> llllllllllllIlIllIIllIllllIIIlII = (List<PotionEffect>)Lists.newArrayList();
        final NBTTagList llllllllllllIlIllIIllIllllIIIIll = llllllllllllIlIllIIllIllllIIIlIl.getTagCompound().getTagList(ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[0]], ItemPotion.lllIllIIIlllIl[3]);
        int llllllllllllIlIllIIllIllllIIIIlI = ItemPotion.lllIllIIIlllIl[1];
        "".length();
        if ((0xB6 ^ 0x8C ^ (0x65 ^ 0x5A)) <= 0) {
            return null;
        }
        while (!lIlIIlIIIlIIIIll(llllllllllllIlIllIIllIllllIIIIlI, llllllllllllIlIllIIllIllllIIIIll.tagCount())) {
            final NBTTagCompound llllllllllllIlIllIIllIllllIIIIIl = llllllllllllIlIllIIllIllllIIIIll.getCompoundTagAt(llllllllllllIlIllIIllIllllIIIIlI);
            final PotionEffect llllllllllllIlIllIIllIllllIIIIII = PotionEffect.readCustomPotionEffectFromNBT(llllllllllllIlIllIIllIllllIIIIIl);
            if (lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIllllIIIIII)) {
                llllllllllllIlIllIIllIllllIIIlII.add(llllllllllllIlIllIIllIllllIIIIII);
                "".length();
            }
            ++llllllllllllIlIllIIllIllllIIIIlI;
        }
        return llllllllllllIlIllIIllIllllIIIlII;
    }
    
    @Override
    public ItemStack onItemUseFinish(final ItemStack llllllllllllIlIllIIllIlllIlIIllI, final World llllllllllllIlIllIIllIlllIlIIlIl, final EntityPlayer llllllllllllIlIllIIllIlllIIllllI) {
        if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIlllIIllllI.capabilities.isCreativeMode ? 1 : 0)) {
            llllllllllllIlIllIIllIlllIlIIllI.stackSize -= ItemPotion.lllIllIIIlllIl[0];
        }
        if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIlllIlIIlIl.isRemote ? 1 : 0)) {
            final List<PotionEffect> llllllllllllIlIllIIllIlllIlIIIll = this.getEffects(llllllllllllIlIllIIllIlllIlIIllI);
            if (lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIlllIlIIIll)) {
                final int llllllllllllIlIllIIllIlllIIllIll = (int)llllllllllllIlIllIIllIlllIlIIIll.iterator();
                "".length();
                if (" ".length() > (0x1D ^ 0x19)) {
                    return null;
                }
                while (!lIlIIlIIIlIIIlIl(((Iterator)llllllllllllIlIllIIllIlllIIllIll).hasNext() ? 1 : 0)) {
                    final PotionEffect llllllllllllIlIllIIllIlllIlIIIlI = ((Iterator<PotionEffect>)llllllllllllIlIllIIllIlllIIllIll).next();
                    llllllllllllIlIllIIllIlllIIllllI.addPotionEffect(new PotionEffect(llllllllllllIlIllIIllIlllIlIIIlI));
                }
            }
        }
        llllllllllllIlIllIIllIlllIIllllI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIlllIIllllI.capabilities.isCreativeMode ? 1 : 0)) {
            if (lIlIIlIIIlIIIllI(llllllllllllIlIllIIllIlllIlIIllI.stackSize)) {
                return new ItemStack(Items.glass_bottle);
            }
            llllllllllllIlIllIIllIlllIIllllI.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
            "".length();
        }
        return llllllllllllIlIllIIllIlllIlIIllI;
    }
    
    private static boolean lIlIIlIIIlIIllII(final int llllllllllllIlIllIIllIlIlIlllIIl) {
        return llllllllllllIlIllIIllIlIlIlllIIl < 0;
    }
    
    @Override
    public EnumAction getItemUseAction(final ItemStack llllllllllllIlIllIIllIlllIIlIlll) {
        return EnumAction.DRINK;
    }
    
    public boolean isEffectInstant(final int llllllllllllIlIllIIllIllIlllIlII) {
        final List<PotionEffect> llllllllllllIlIllIIllIllIlllIIll = this.getEffects(llllllllllllIlIllIIllIllIlllIlII);
        if (!lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIllIlllIIll) || !lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIlllIIll.isEmpty() ? 1 : 0)) {
            return ItemPotion.lllIllIIIlllIl[1] != 0;
        }
        final String llllllllllllIlIllIIllIllIllIllIl = (String)llllllllllllIlIllIIllIllIlllIIll.iterator();
        "".length();
        if ((156 + 168 - 270 + 124 ^ 58 + 26 + 31 + 68) <= 0) {
            return ((0xCD ^ 0x9A ^ (0xB5 ^ 0xC3)) & (0x4E ^ 0x3C ^ (0x24 ^ 0x77) ^ -" ".length())) != 0x0;
        }
        while (!lIlIIlIIIlIIIlIl(((Iterator)llllllllllllIlIllIIllIllIllIllIl).hasNext() ? 1 : 0)) {
            final PotionEffect llllllllllllIlIllIIllIllIlllIIlI = ((Iterator<PotionEffect>)llllllllllllIlIllIIllIllIllIllIl).next();
            if (lIlIIlIIIlIIIIIl(Potion.potionTypes[llllllllllllIlIllIIllIllIlllIIlI.getPotionID()].isInstant() ? 1 : 0)) {
                return ItemPotion.lllIllIIIlllIl[0] != 0;
            }
        }
        return ItemPotion.lllIllIIIlllIl[1] != 0;
    }
    
    public ItemPotion() {
        this.effectCache = (Map<Integer, List<PotionEffect>>)Maps.newHashMap();
        this.setMaxStackSize(ItemPotion.lllIllIIIlllIl[0]);
        "".length();
        this.setHasSubtypes((boolean)(ItemPotion.lllIllIIIlllIl[0] != 0));
        "".length();
        this.setMaxDamage(ItemPotion.lllIllIIIlllIl[1]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabBrewing);
        "".length();
    }
    
    @Override
    public int getMaxItemUseDuration(final ItemStack llllllllllllIlIllIIllIlllIIllIIl) {
        return ItemPotion.lllIllIIIlllIl[4];
    }
    
    @Override
    public void getSubItems(final Item llllllllllllIlIllIIllIllIIIllIlI, final CreativeTabs llllllllllllIlIllIIllIllIIIIllII, final List<ItemStack> llllllllllllIlIllIIllIllIIIllIII) {
        super.getSubItems(llllllllllllIlIllIIllIllIIIllIlI, llllllllllllIlIllIIllIllIIIIllII, llllllllllllIlIllIIllIllIIIllIII);
        if (lIlIIlIIIlIIIIIl(ItemPotion.SUB_ITEMS_CACHE.isEmpty() ? 1 : 0)) {
            int llllllllllllIlIllIIllIllIIIlIlll = ItemPotion.lllIllIIIlllIl[1];
            "".length();
            if (" ".length() > (77 + 54 + 28 + 23 ^ 5 + 63 + 79 + 31)) {
                return;
            }
            while (!lIlIIlIIIlIIlIlI(llllllllllllIlIllIIllIllIIIlIlll, ItemPotion.lllIllIIIlllIl[19])) {
                int llllllllllllIlIllIIllIllIIIlIllI = ItemPotion.lllIllIIIlllIl[1];
                "".length();
                if ("   ".length() >= (0xB6 ^ 0xB2)) {
                    return;
                }
                while (!lIlIIlIIIlIIlIlI(llllllllllllIlIllIIllIllIIIlIllI, ItemPotion.lllIllIIIlllIl[0])) {
                    int llllllllllllIlIllIIllIllIIIlIlII;
                    if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIIIlIllI)) {
                        final int llllllllllllIlIllIIllIllIIIlIlIl = llllllllllllIlIllIIllIllIIIlIlll | ItemPotion.lllIllIIIlllIl[24];
                        "".length();
                        if (((0x43 ^ 0xF ^ (0x7C ^ 0x1E)) & (0x26 ^ 0x18 ^ (0x3F ^ 0x2F) ^ -" ".length())) == "   ".length()) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIlIllIIllIllIIIlIlII = (llllllllllllIlIllIIllIllIIIlIlll | ItemPotion.lllIllIIIlllIl[6]);
                    }
                    int llllllllllllIlIllIIllIllIIIlIIll = ItemPotion.lllIllIIIlllIl[1];
                    "".length();
                    if (-(0x61 ^ 0x65) > 0) {
                        return;
                    }
                    while (!lIlIIlIIIlIIlIlI(llllllllllllIlIllIIllIllIIIlIIll, ItemPotion.lllIllIIIlllIl[5])) {
                        int llllllllllllIlIllIIllIllIIIlIIlI = llllllllllllIlIllIIllIllIIIlIlII;
                        if (lIlIIlIIIlIIIIIl(llllllllllllIlIllIIllIllIIIlIIll)) {
                            if (lIlIIlIIIlIIllIl(llllllllllllIlIllIIllIllIIIlIIll, ItemPotion.lllIllIIIlllIl[0])) {
                                llllllllllllIlIllIIllIllIIIlIIlI = (llllllllllllIlIllIIllIllIIIlIlII | ItemPotion.lllIllIIIlllIl[4]);
                                "".length();
                                if ((0x59 ^ 0x5C) <= 0) {
                                    return;
                                }
                            }
                            else if (lIlIIlIIIlIIllIl(llllllllllllIlIllIIllIllIIIlIIll, ItemPotion.lllIllIIIlllIl[5])) {
                                llllllllllllIlIllIIllIllIIIlIIlI = (llllllllllllIlIllIIllIllIIIlIlII | ItemPotion.lllIllIIIlllIl[25]);
                            }
                        }
                        final List<PotionEffect> llllllllllllIlIllIIllIllIIIlIIIl = PotionHelper.getPotionEffects(llllllllllllIlIllIIllIllIIIlIIlI, (boolean)(ItemPotion.lllIllIIIlllIl[1] != 0));
                        if (lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIllIIIlIIIl) && lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIIIlIIIl.isEmpty() ? 1 : 0)) {
                            ItemPotion.SUB_ITEMS_CACHE.put(llllllllllllIlIllIIllIllIIIlIIIl, llllllllllllIlIllIIllIllIIIlIIlI);
                            "".length();
                        }
                        ++llllllllllllIlIllIIllIllIIIlIIll;
                    }
                    ++llllllllllllIlIllIIllIllIIIlIllI;
                }
                ++llllllllllllIlIllIIllIllIIIlIlll;
            }
        }
        final Iterator llllllllllllIlIllIIllIllIIIlIIII = ItemPotion.SUB_ITEMS_CACHE.values().iterator();
        "".length();
        if ((0x5A ^ 0x5F) == 0x0) {
            return;
        }
        while (!lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIIIlIIII.hasNext() ? 1 : 0)) {
            final int llllllllllllIlIllIIllIllIIIIllll = llllllllllllIlIllIIllIllIIIlIIII.next();
            llllllllllllIlIllIIllIllIIIllIII.add(new ItemStack(llllllllllllIlIllIIllIllIIIllIlI, ItemPotion.lllIllIIIlllIl[0], llllllllllllIlIllIIllIllIIIIllll));
            "".length();
        }
    }
    
    private static boolean lIlIIlIIIlIIIIlI(final Object llllllllllllIlIllIIllIlIllIIIIIl) {
        return llllllllllllIlIllIIllIlIllIIIIIl != null;
    }
    
    @Override
    public boolean hasEffect(final ItemStack llllllllllllIlIllIIllIllIIlIIlll) {
        final List<PotionEffect> llllllllllllIlIllIIllIllIIlIlIIl = this.getEffects(llllllllllllIlIllIIllIllIIlIIlll);
        if (lIlIIlIIIlIIIIlI(llllllllllllIlIllIIllIllIIlIlIIl) && lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIllIIlIlIIl.isEmpty() ? 1 : 0)) {
            return ItemPotion.lllIllIIIlllIl[0] != 0;
        }
        return ItemPotion.lllIllIIIlllIl[1] != 0;
    }
    
    private static boolean lIlIIlIIIlIIlIll(final int llllllllllllIlIllIIllIlIlIllIIlI, final int llllllllllllIlIllIIllIlIlIllIIIl) {
        return llllllllllllIlIllIIllIlIlIllIIlI != llllllllllllIlIllIIllIlIlIllIIIl;
    }
    
    private static boolean lIlIIlIIIlIIlIlI(final int llllllllllllIlIllIIllIlIllIIIlII, final int llllllllllllIlIllIIllIlIllIIIIll) {
        return llllllllllllIlIllIIllIlIllIIIlII > llllllllllllIlIllIIllIlIllIIIIll;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIlIllIIllIlllIIlIIIl, final World llllllllllllIlIllIIllIlllIIIllII, final EntityPlayer llllllllllllIlIllIIllIlllIIIlIll) {
        if (lIlIIlIIIlIIIIIl(isSplash(llllllllllllIlIllIIllIlllIIlIIIl.getMetadata()) ? 1 : 0)) {
            if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIlllIIIlIll.capabilities.isCreativeMode ? 1 : 0)) {
                llllllllllllIlIllIIllIlllIIlIIIl.stackSize -= ItemPotion.lllIllIIIlllIl[0];
            }
            llllllllllllIlIllIIllIlllIIIllII.playSoundAtEntity(llllllllllllIlIllIIllIlllIIIlIll, ItemPotion.lllIllIIIlllII[ItemPotion.lllIllIIIlllIl[5]], 0.5f, 0.4f / (ItemPotion.itemRand.nextFloat() * 0.4f + 0.8f));
            if (lIlIIlIIIlIIIlIl(llllllllllllIlIllIIllIlllIIIllII.isRemote ? 1 : 0)) {
                llllllllllllIlIllIIllIlllIIIllII.spawnEntityInWorld(new EntityPotion(llllllllllllIlIllIIllIlllIIIllII, llllllllllllIlIllIIllIlllIIIlIll, llllllllllllIlIllIIllIlllIIlIIIl));
                "".length();
            }
            llllllllllllIlIllIIllIlllIIIlIll.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
            return llllllllllllIlIllIIllIlllIIlIIIl;
        }
        llllllllllllIlIllIIllIlllIIIlIll.setItemInUse(llllllllllllIlIllIIllIlllIIlIIIl, this.getMaxItemUseDuration(llllllllllllIlIllIIllIlllIIlIIIl));
        return llllllllllllIlIllIIllIlllIIlIIIl;
    }
    
    private static int lIlIIlIIIlIIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIlIIlIIIlIIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
}
