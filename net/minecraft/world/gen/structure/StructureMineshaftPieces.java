// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.init.Items;
import net.minecraft.util.EnumFacing;
import java.util.Random;
import net.minecraft.util.WeightedRandomChestContent;
import java.util.List;

public class StructureMineshaftPieces
{
    private static final /* synthetic */ int[] lIIIIIlllIIlll;
    private static final /* synthetic */ List<WeightedRandomChestContent> CHEST_CONTENT_WEIGHT_LIST;
    private static final /* synthetic */ String[] lIIIIIlllIIlII;
    
    private static StructureComponent func_175890_b(final StructureComponent lllllllllllllIlIIllIllIIIlIIIlll, final List<StructureComponent> lllllllllllllIlIIllIllIIIIllllIl, final Random lllllllllllllIlIIllIllIIIIllllII, final int lllllllllllllIlIIllIllIIIlIIIlII, final int lllllllllllllIlIIllIllIIIlIIIIll, final int lllllllllllllIlIIllIllIIIlIIIIlI, final EnumFacing lllllllllllllIlIIllIllIIIIlllIII, final int lllllllllllllIlIIllIllIIIIllIlll) {
        if (lIllIllllIIllIl(lllllllllllllIlIIllIllIIIIllIlll, StructureMineshaftPieces.lIIIIIlllIIlll[9])) {
            return null;
        }
        if (lIllIllllIIlllI(Math.abs(lllllllllllllIlIIllIllIIIlIIIlII - lllllllllllllIlIIllIllIIIlIIIlll.getBoundingBox().minX), StructureMineshaftPieces.lIIIIIlllIIlll[16]) && lIllIllllIIlllI(Math.abs(lllllllllllllIlIIllIllIIIlIIIIlI - lllllllllllllIlIIllIllIIIlIIIlll.getBoundingBox().minZ), StructureMineshaftPieces.lIIIIIlllIIlll[16])) {
            final StructureComponent lllllllllllllIlIIllIllIIIIllllll = func_175892_a(lllllllllllllIlIIllIllIIIIllllIl, lllllllllllllIlIIllIllIIIIllllII, lllllllllllllIlIIllIllIIIlIIIlII, lllllllllllllIlIIllIllIIIlIIIIll, lllllllllllllIlIIllIllIIIlIIIIlI, lllllllllllllIlIIllIllIIIIlllIII, lllllllllllllIlIIllIllIIIIllIlll + StructureMineshaftPieces.lIIIIIlllIIlll[2]);
            if (lIllIllllIIllII(lllllllllllllIlIIllIllIIIIllllll)) {
                lllllllllllllIlIIllIllIIIIllllIl.add(lllllllllllllIlIIllIllIIIIllllll);
                "".length();
                lllllllllllllIlIIllIllIIIIllllll.buildComponent(lllllllllllllIlIIllIllIIIlIIIlll, lllllllllllllIlIIllIllIIIIllllIl, lllllllllllllIlIIllIllIIIIllllII);
            }
            return lllllllllllllIlIIllIllIIIIllllll;
        }
        return null;
    }
    
    static {
        lIllIllllIIlIlI();
        lIllIllllIIIIll();
        final WeightedRandomChestContent[] array = new WeightedRandomChestContent[StructureMineshaftPieces.lIIIIIlllIIlll[0]];
        array[StructureMineshaftPieces.lIIIIIlllIIlll[1]] = new WeightedRandomChestContent(Items.iron_ingot, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[3], StructureMineshaftPieces.lIIIIIlllIIlll[4]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[2]] = new WeightedRandomChestContent(Items.gold_ingot, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[5], StructureMineshaftPieces.lIIIIIlllIIlll[3]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[6]] = new WeightedRandomChestContent(Items.redstone, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[7], StructureMineshaftPieces.lIIIIIlllIIlll[8], StructureMineshaftPieces.lIIIIIlllIIlll[3]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[5]] = new WeightedRandomChestContent(Items.dye, EnumDyeColor.BLUE.getDyeDamage(), StructureMineshaftPieces.lIIIIIlllIIlll[7], StructureMineshaftPieces.lIIIIIlllIIlll[8], StructureMineshaftPieces.lIIIIIlllIIlll[3]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[7]] = new WeightedRandomChestContent(Items.diamond, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[6], StructureMineshaftPieces.lIIIIIlllIIlll[5]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[3]] = new WeightedRandomChestContent(Items.coal, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[5], StructureMineshaftPieces.lIIIIIlllIIlll[9], StructureMineshaftPieces.lIIIIIlllIIlll[4]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[10]] = new WeightedRandomChestContent(Items.bread, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[5], StructureMineshaftPieces.lIIIIIlllIIlll[11]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[12]] = new WeightedRandomChestContent(Items.iron_pickaxe, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[2]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[9]] = new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.rail), StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[7], StructureMineshaftPieces.lIIIIIlllIIlll[9], StructureMineshaftPieces.lIIIIIlllIIlll[2]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[8]] = new WeightedRandomChestContent(Items.melon_seeds, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[6], StructureMineshaftPieces.lIIIIIlllIIlll[7], StructureMineshaftPieces.lIIIIIlllIIlll[4]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[4]] = new WeightedRandomChestContent(Items.pumpkin_seeds, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[6], StructureMineshaftPieces.lIIIIIlllIIlll[7], StructureMineshaftPieces.lIIIIIlllIIlll[4]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[13]] = new WeightedRandomChestContent(Items.saddle, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[5]);
        array[StructureMineshaftPieces.lIIIIIlllIIlll[14]] = new WeightedRandomChestContent(Items.iron_horse_armor, StructureMineshaftPieces.lIIIIIlllIIlll[1], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[2], StructureMineshaftPieces.lIIIIIlllIIlll[2]);
        CHEST_CONTENT_WEIGHT_LIST = Lists.newArrayList((Object[])array);
    }
    
    private static boolean lIllIllllIIlIll(final int lllllllllllllIlIIllIlIllllllIlII, final int lllllllllllllIlIIllIlIllllllIIll) {
        return lllllllllllllIlIIllIlIllllllIlII >= lllllllllllllIlIIllIlIllllllIIll;
    }
    
    private static boolean lIllIllllIIlllI(final int lllllllllllllIlIIllIlIlllllIllII, final int lllllllllllllIlIIllIlIlllllIlIll) {
        return lllllllllllllIlIIllIlIlllllIllII <= lllllllllllllIlIIllIlIlllllIlIll;
    }
    
    private static void lIllIllllIIlIlI() {
        (lIIIIIlllIIlll = new int[18])[0] = (0xA4 ^ 0xA9);
        StructureMineshaftPieces.lIIIIIlllIIlll[1] = ((71 + 69 - 14 + 58 ^ 133 + 131 - 182 + 92) & (40 + 155 - 45 + 40 ^ 95 + 30 - 124 + 167 ^ -" ".length()));
        StructureMineshaftPieces.lIIIIIlllIIlll[2] = " ".length();
        StructureMineshaftPieces.lIIIIIlllIIlll[3] = (0x1 ^ 0x4);
        StructureMineshaftPieces.lIIIIIlllIIlll[4] = (0x6A ^ 0x60);
        StructureMineshaftPieces.lIIIIIlllIIlll[5] = "   ".length();
        StructureMineshaftPieces.lIIIIIlllIIlll[6] = "  ".length();
        StructureMineshaftPieces.lIIIIIlllIIlll[7] = (43 + 7 + 87 + 41 ^ 125 + 30 - 49 + 76);
        StructureMineshaftPieces.lIIIIIlllIIlll[8] = (0xB8 ^ 0xB1);
        StructureMineshaftPieces.lIIIIIlllIIlll[9] = (0xC9 ^ 0x86 ^ (0x6A ^ 0x2D));
        StructureMineshaftPieces.lIIIIIlllIIlll[10] = (0x8C ^ 0xAD ^ (0x41 ^ 0x66));
        StructureMineshaftPieces.lIIIIIlllIIlll[11] = (178 + 175 - 262 + 90 ^ 44 + 179 - 207 + 170);
        StructureMineshaftPieces.lIIIIIlllIIlll[12] = (0x2A ^ 0x2D);
        StructureMineshaftPieces.lIIIIIlllIIlll[13] = (0x28 ^ 0x54 ^ (0xC0 ^ 0xB7));
        StructureMineshaftPieces.lIIIIIlllIIlll[14] = (106 + 23 - 61 + 119 ^ 40 + 69 - 59 + 133);
        StructureMineshaftPieces.lIIIIIlllIIlll[15] = (0x1E ^ 0x17 ^ (0xC4 ^ 0xA9));
        StructureMineshaftPieces.lIIIIIlllIIlll[16] = (0xF4 ^ 0xA4);
        StructureMineshaftPieces.lIIIIIlllIIlll[17] = (0x2 ^ 0x69 ^ (0x6C ^ 0x41));
    }
    
    private static String lIllIllllIIIIIl(final String lllllllllllllIlIIllIllIIIIIlIlII, final String lllllllllllllIlIIllIllIIIIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIllIIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIllIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StructureMineshaftPieces.lIIIIIlllIIlll[9]), "DES");
            final Cipher lllllllllllllIlIIllIllIIIIIllIII = Cipher.getInstance("DES");
            lllllllllllllIlIIllIllIIIIIllIII.init(StructureMineshaftPieces.lIIIIIlllIIlll[6], lllllllllllllIlIIllIllIIIIIllIlI);
            return new String(lllllllllllllIlIIllIllIIIIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIllIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIllIIIIIlIllI) {
            lllllllllllllIlIIllIllIIIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIllllIIIIlI(String lllllllllllllIlIIllIlIllllllllll, final String lllllllllllllIlIIllIllIIIIIIIIll) {
        lllllllllllllIlIIllIlIllllllllll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIllIlIllllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIllIIIIIIIIlI = new StringBuilder();
        final char[] lllllllllllllIlIIllIllIIIIIIIIIl = lllllllllllllIlIIllIllIIIIIIIIll.toCharArray();
        int lllllllllllllIlIIllIllIIIIIIIIII = StructureMineshaftPieces.lIIIIIlllIIlll[1];
        final char lllllllllllllIlIIllIlIlllllllIlI = (Object)((String)lllllllllllllIlIIllIlIllllllllll).toCharArray();
        final double lllllllllllllIlIIllIlIlllllllIIl = lllllllllllllIlIIllIlIlllllllIlI.length;
        char lllllllllllllIlIIllIlIlllllllIII = (char)StructureMineshaftPieces.lIIIIIlllIIlll[1];
        while (lIllIllllIIllll(lllllllllllllIlIIllIlIlllllllIII, (int)lllllllllllllIlIIllIlIlllllllIIl)) {
            final char lllllllllllllIlIIllIllIIIIIIIlIl = lllllllllllllIlIIllIlIlllllllIlI[lllllllllllllIlIIllIlIlllllllIII];
            lllllllllllllIlIIllIllIIIIIIIIlI.append((char)(lllllllllllllIlIIllIllIIIIIIIlIl ^ lllllllllllllIlIIllIllIIIIIIIIIl[lllllllllllllIlIIllIllIIIIIIIIII % lllllllllllllIlIIllIllIIIIIIIIIl.length]));
            "".length();
            ++lllllllllllllIlIIllIllIIIIIIIIII;
            ++lllllllllllllIlIIllIlIlllllllIII;
            "".length();
            if (((0x1E ^ 0x5) & ~(0x48 ^ 0x53)) >= (0xB4 ^ 0xB0)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIllIIIIIIIIlI);
    }
    
    private static boolean lIllIllllIIllII(final Object lllllllllllllIlIIllIlIlllllIIlIl) {
        return lllllllllllllIlIIllIlIlllllIIlIl != null;
    }
    
    private static boolean lIllIllllIIllIl(final int lllllllllllllIlIIllIlIlllllIlIII, final int lllllllllllllIlIIllIlIlllllIIlll) {
        return lllllllllllllIlIIllIlIlllllIlIII > lllllllllllllIlIIllIlIlllllIIlll;
    }
    
    private static StructureComponent func_175892_a(final List<StructureComponent> lllllllllllllIlIIllIllIIIllIIlII, final Random lllllllllllllIlIIllIllIIIllIIIll, final int lllllllllllllIlIIllIllIIIlIlIlll, final int lllllllllllllIlIIllIllIIIllIIIIl, final int lllllllllllllIlIIllIllIIIllIIIII, final EnumFacing lllllllllllllIlIIllIllIIIlIlllll, final int lllllllllllllIlIIllIllIIIlIlIIll) {
        final int lllllllllllllIlIIllIllIIIlIlllIl = lllllllllllllIlIIllIllIIIllIIIll.nextInt(StructureMineshaftPieces.lIIIIIlllIIlll[15]);
        if (lIllIllllIIlIll(lllllllllllllIlIIllIllIIIlIlllIl, StructureMineshaftPieces.lIIIIIlllIIlll[16])) {
            final StructureBoundingBox lllllllllllllIlIIllIllIIIlIlllII = Cross.func_175813_a(lllllllllllllIlIIllIllIIIllIIlII, lllllllllllllIlIIllIllIIIllIIIll, lllllllllllllIlIIllIllIIIlIlIlll, lllllllllllllIlIIllIllIIIllIIIIl, lllllllllllllIlIIllIllIIIllIIIII, lllllllllllllIlIIllIllIIIlIlllll);
            if (lIllIllllIIllII(lllllllllllllIlIIllIllIIIlIlllII)) {
                return new Cross(lllllllllllllIlIIllIllIIIlIlIIll, lllllllllllllIlIIllIllIIIllIIIll, lllllllllllllIlIIllIllIIIlIlllII, lllllllllllllIlIIllIllIIIlIlllll);
            }
        }
        else if (lIllIllllIIlIll(lllllllllllllIlIIllIllIIIlIlllIl, StructureMineshaftPieces.lIIIIIlllIIlll[17])) {
            final StructureBoundingBox lllllllllllllIlIIllIllIIIlIllIll = Stairs.func_175812_a(lllllllllllllIlIIllIllIIIllIIlII, lllllllllllllIlIIllIllIIIllIIIll, lllllllllllllIlIIllIllIIIlIlIlll, lllllllllllllIlIIllIllIIIllIIIIl, lllllllllllllIlIIllIllIIIllIIIII, lllllllllllllIlIIllIllIIIlIlllll);
            if (lIllIllllIIllII(lllllllllllllIlIIllIllIIIlIllIll)) {
                return new Stairs(lllllllllllllIlIIllIllIIIlIlIIll, lllllllllllllIlIIllIllIIIllIIIll, lllllllllllllIlIIllIllIIIlIllIll, lllllllllllllIlIIllIllIIIlIlllll);
            }
        }
        else {
            final StructureBoundingBox lllllllllllllIlIIllIllIIIlIllIlI = Corridor.func_175814_a(lllllllllllllIlIIllIllIIIllIIlII, lllllllllllllIlIIllIllIIIllIIIll, lllllllllllllIlIIllIllIIIlIlIlll, lllllllllllllIlIIllIllIIIllIIIIl, lllllllllllllIlIIllIllIIIllIIIII, lllllllllllllIlIIllIllIIIlIlllll);
            if (lIllIllllIIllII(lllllllllllllIlIIllIllIIIlIllIlI)) {
                return new Corridor(lllllllllllllIlIIllIllIIIlIlIIll, lllllllllllllIlIIllIllIIIllIIIll, lllllllllllllIlIIllIllIIIlIllIlI, lllllllllllllIlIIllIllIIIlIlllll);
            }
        }
        return null;
    }
    
    private static boolean lIllIllllIIllll(final int lllllllllllllIlIIllIlIllllllIIII, final int lllllllllllllIlIIllIlIlllllIllll) {
        return lllllllllllllIlIIllIlIllllllIIII < lllllllllllllIlIIllIlIlllllIllll;
    }
    
    public static void registerStructurePieces() {
        MapGenStructureIO.registerStructureComponent(Corridor.class, StructureMineshaftPieces.lIIIIIlllIIlII[StructureMineshaftPieces.lIIIIIlllIIlll[1]]);
        MapGenStructureIO.registerStructureComponent(Cross.class, StructureMineshaftPieces.lIIIIIlllIIlII[StructureMineshaftPieces.lIIIIIlllIIlll[2]]);
        MapGenStructureIO.registerStructureComponent(Room.class, StructureMineshaftPieces.lIIIIIlllIIlII[StructureMineshaftPieces.lIIIIIlllIIlll[6]]);
        MapGenStructureIO.registerStructureComponent(Stairs.class, StructureMineshaftPieces.lIIIIIlllIIlII[StructureMineshaftPieces.lIIIIIlllIIlll[5]]);
    }
    
    private static void lIllIllllIIIIll() {
        (lIIIIIlllIIlII = new String[StructureMineshaftPieces.lIIIIIlllIIlll[7]])[StructureMineshaftPieces.lIIIIIlllIIlll[1]] = lIllIllllIIIIIl("xiE0GcDuUyhPM+X11WNxkg==", "MfSAW");
        StructureMineshaftPieces.lIIIIIlllIIlII[StructureMineshaftPieces.lIIIIIlllIIlll[2]] = lIllIllllIIIIIl("oNBg3g4dmi10ah+8YnZoag==", "jOoLY");
        StructureMineshaftPieces.lIIIIIlllIIlII[StructureMineshaftPieces.lIIIIIlllIIlll[6]] = lIllIllllIIIIIl("J0fh7TvVlgA=", "uptwJ");
        StructureMineshaftPieces.lIIIIIlllIIlII[StructureMineshaftPieces.lIIIIIlllIIlll[5]] = lIllIllllIIIIlI("OwYkISQfJwQ=", "vUwUE");
    }
    
    public static class Cross extends StructureComponent
    {
        private static final /* synthetic */ String[] llIlIIllIIllII;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        private /* synthetic */ EnumFacing corridorDirection;
        private /* synthetic */ boolean isMultipleFloors;
        private static final /* synthetic */ int[] llIlIIllIlIIII;
        
        public Cross(final int llllllllllllIllIlIllllllIlIIIlII, final Random llllllllllllIllIlIllllllIlIIIIll, final StructureBoundingBox llllllllllllIllIlIllllllIIlllllI, final EnumFacing llllllllllllIllIlIllllllIIllllIl) {
            super(llllllllllllIllIlIllllllIlIIIlII);
            this.corridorDirection = llllllllllllIllIlIllllllIIllllIl;
            this.boundingBox = llllllllllllIllIlIllllllIIlllllI;
            int isMultipleFloors;
            if (lIIlIIlIlllIlIIl(llllllllllllIllIlIllllllIIlllllI.getYSize(), Cross.llIlIIllIlIIII[3])) {
                isMultipleFloors = Cross.llIlIIllIlIIII[1];
                "".length();
                if ("  ".length() < -" ".length()) {
                    throw null;
                }
            }
            else {
                isMultipleFloors = Cross.llIlIIllIlIIII[0];
            }
            this.isMultipleFloors = (isMultipleFloors != 0);
        }
        
        public static StructureBoundingBox func_175813_a(final List<StructureComponent> llllllllllllIllIlIllllllIIlIlllI, final Random llllllllllllIllIlIllllllIIlIllIl, final int llllllllllllIllIlIllllllIIllIIll, final int llllllllllllIllIlIllllllIIlIlIll, final int llllllllllllIllIlIllllllIIlIlIlI, final EnumFacing llllllllllllIllIlIllllllIIlIlIIl) {
            final StructureBoundingBox llllllllllllIllIlIllllllIIlIllll = new StructureBoundingBox(llllllllllllIllIlIllllllIIllIIll, llllllllllllIllIlIllllllIIlIlIll, llllllllllllIllIlIllllllIIlIlIlI, llllllllllllIllIlIllllllIIllIIll, llllllllllllIllIlIllllllIIlIlIll + Cross.llIlIIllIlIIII[2], llllllllllllIllIlIllllllIIlIlIlI);
            if (lIIlIIlIlllIlIlI(llllllllllllIllIlIllllllIIlIllIl.nextInt(Cross.llIlIIllIlIIII[4]))) {
                final StructureBoundingBox structureBoundingBox = llllllllllllIllIlIllllllIIlIllll;
                structureBoundingBox.maxY += Cross.llIlIIllIlIIII[4];
            }
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIllIlIllllllIIlIlIIl.ordinal()]) {
                case 3: {
                    llllllllllllIllIlIllllllIIlIllll.minX = llllllllllllIllIlIllllllIIllIIll - Cross.llIlIIllIlIIII[1];
                    llllllllllllIllIlIllllllIIlIllll.maxX = llllllllllllIllIlIllllllIIllIIll + Cross.llIlIIllIlIIII[3];
                    llllllllllllIllIlIllllllIIlIllll.minZ = llllllllllllIllIlIllllllIIlIlIlI - Cross.llIlIIllIlIIII[4];
                    "".length();
                    if (-" ".length() > ((0xEA ^ 0x85 ^ (0x85 ^ 0xBE)) & (0x4E ^ 0x67 ^ (0x1C ^ 0x61) ^ -" ".length()))) {
                        return null;
                    }
                    break;
                }
                case 4: {
                    llllllllllllIllIlIllllllIIlIllll.minX = llllllllllllIllIlIllllllIIllIIll - Cross.llIlIIllIlIIII[1];
                    llllllllllllIllIlIllllllIIlIllll.maxX = llllllllllllIllIlIllllllIIllIIll + Cross.llIlIIllIlIIII[3];
                    llllllllllllIllIlIllllllIIlIllll.maxZ = llllllllllllIllIlIllllllIIlIlIlI + Cross.llIlIIllIlIIII[4];
                    "".length();
                    if (((120 + 129 - 179 + 97 ^ 53 + 97 - 54 + 44) & (35 + 51 - 37 + 92 ^ 18 + 108 - 103 + 143 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    break;
                }
                case 5: {
                    llllllllllllIllIlIllllllIIlIllll.minX = llllllllllllIllIlIllllllIIllIIll - Cross.llIlIIllIlIIII[4];
                    llllllllllllIllIlIllllllIIlIllll.minZ = llllllllllllIllIlIllllllIIlIlIlI - Cross.llIlIIllIlIIII[1];
                    llllllllllllIllIlIllllllIIlIllll.maxZ = llllllllllllIllIlIllllllIIlIlIlI + Cross.llIlIIllIlIIII[3];
                    "".length();
                    if (((0x1A ^ 0x24 ^ (0xB8 ^ 0xBC)) & (0x42 ^ 0x4C ^ (0x59 ^ 0x6D) ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    break;
                }
                case 6: {
                    llllllllllllIllIlIllllllIIlIllll.maxX = llllllllllllIllIlIllllllIIllIIll + Cross.llIlIIllIlIIII[4];
                    llllllllllllIllIlIllllllIIlIllll.minZ = llllllllllllIllIlIllllllIIlIlIlI - Cross.llIlIIllIlIIII[1];
                    llllllllllllIllIlIllllllIIlIllll.maxZ = llllllllllllIllIlIllllllIIlIlIlI + Cross.llIlIIllIlIIII[3];
                    break;
                }
            }
            StructureBoundingBox structureBoundingBox2;
            if (lIIlIIlIlllIlIll(StructureComponent.findIntersecting(llllllllllllIllIlIllllllIIlIlllI, llllllllllllIllIlIllllllIIlIllll))) {
                structureBoundingBox2 = null;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                structureBoundingBox2 = llllllllllllIllIlIllllllIIlIllll;
            }
            return structureBoundingBox2;
        }
        
        public Cross() {
        }
        
        private static boolean lIIlIIlIlllIlIIl(final int llllllllllllIllIlIlllllIllIIlllI, final int llllllllllllIllIlIlllllIllIIllIl) {
            return llllllllllllIllIlIlllllIllIIlllI > llllllllllllIllIlIlllllIllIIllIl;
        }
        
        private static void lIIlIIlIlllIIIll() {
            (llIlIIllIIllII = new String[Cross.llIlIIllIlIIII[4]])[Cross.llIlIIllIlIIII[0]] = lIIlIIlIlllIIIII("ZMi6zvi9k6U=", "kSowM");
            Cross.llIlIIllIIllII[Cross.llIlIIllIlIIII[1]] = lIIlIIlIlllIIIIl("Lg==", "jeIce");
            Cross.llIlIIllIIllII[Cross.llIlIIllIlIIII[2]] = lIIlIIlIlllIIIIl("Fg0=", "bkbqs");
            Cross.llIlIIllIIllII[Cross.llIlIIllIlIIII[3]] = lIIlIIlIlllIIIlI("XSSEwZE7Chk=", "aZEyl");
        }
        
        private static boolean lIIlIIlIlllIlllI(final int llllllllllllIllIlIlllllIllIlIIlI, final int llllllllllllIllIlIlllllIllIlIIIl) {
            return llllllllllllIllIlIlllllIllIlIIlI < llllllllllllIllIlIlllllIllIlIIIl;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIlIllllllIlIlIIII) {
            llllllllllllIllIlIllllllIlIlIIII.setBoolean(Cross.llIlIIllIIllII[Cross.llIlIIllIlIIII[0]], this.isMultipleFloors);
            llllllllllllIllIlIllllllIlIlIIII.setInteger(Cross.llIlIIllIIllII[Cross.llIlIIllIlIIII[1]], this.corridorDirection.getHorizontalIndex());
        }
        
        private static boolean lIIlIIlIlllIlIll(final Object llllllllllllIllIlIlllllIllIIlIll) {
            return llllllllllllIllIlIlllllIllIIlIll != null;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Cross.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIlIIlIlllIlIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final String llllllllllllIllIlIllllllIIIIIlll = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIllIlIllllllIIIIIlll[EnumFacing.DOWN.ordinal()] = Cross.llIlIIllIlIIII[1];
                "".length();
                if (-(94 + 136 - 118 + 33 ^ 94 + 53 - 22 + 23) >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIllIlIllllllIIIIIlll[EnumFacing.EAST.ordinal()] = Cross.llIlIIllIlIIII[5];
                "".length();
                if ((0x46 ^ 0x42) <= "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIllIlIllllllIIIIIlll[EnumFacing.NORTH.ordinal()] = Cross.llIlIIllIlIIII[3];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIllIlIllllllIIIIIlll[EnumFacing.SOUTH.ordinal()] = Cross.llIlIIllIlIIII[4];
                "".length();
                if (-(0x7F ^ 0x7B) >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIllIlIllllllIIIIIlll[EnumFacing.UP.ordinal()] = Cross.llIlIIllIlIIII[2];
                "".length();
                if (-" ".length() == "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIllIlIllllllIIIIIlll[EnumFacing.WEST.ordinal()] = Cross.llIlIIllIlIIII[6];
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Cross.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIllIlIllllllIIIIIlll;
        }
        
        private static boolean lIIlIIlIlllIllIl(final Object llllllllllllIllIlIlllllIllIIlIII, final Object llllllllllllIllIlIlllllIllIIIlll) {
            return llllllllllllIllIlIlllllIllIIlIII == llllllllllllIllIlIlllllIllIIIlll;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIlIllllllIIIIllII, final Random llllllllllllIllIlIllllllIIIlIIIl, final StructureBoundingBox llllllllllllIllIlIllllllIIIIlIll) {
            if (lIIlIIlIlllIllII(this.isLiquidInStructureBoundingBox(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll) ? 1 : 0)) {
                return Cross.llIlIIllIlIIII[0] != 0;
            }
            if (lIIlIIlIlllIllII(this.isMultipleFloors ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ, this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY + Cross.llIlIIllIlIIII[3] - Cross.llIlIIllIlIIII[1], this.boundingBox.maxZ, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
                this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], this.boundingBox.maxX, this.boundingBox.minY + Cross.llIlIIllIlIIII[3] - Cross.llIlIIllIlIIII[1], this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
                this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.maxY - Cross.llIlIIllIlIIII[2], this.boundingBox.minZ, this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.maxY, this.boundingBox.maxZ, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
                this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX, this.boundingBox.maxY - Cross.llIlIIllIlIIII[2], this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], this.boundingBox.maxX, this.boundingBox.maxY, this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
                this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY + Cross.llIlIIllIlIIII[3], this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY + Cross.llIlIIllIlIIII[3], this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
                "".length();
                if (((155 + 137 - 117 + 45 ^ 158 + 97 - 225 + 158) & (0x2 ^ 0x1E ^ (0x5 ^ 0x79) ^ -" ".length())) < 0) {
                    return ((95 + 28 - 48 + 68 ^ 93 + 83 - 128 + 85) & (117 + 23 - 68 + 80 ^ 18 + 28 - 2 + 102 ^ -" ".length())) != 0x0;
                }
            }
            else {
                this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ, this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.maxY, this.boundingBox.maxZ, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
                this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], this.boundingBox.maxX, this.boundingBox.maxY, this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
            }
            this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.maxY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], Blocks.planks.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.maxY, this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], Blocks.planks.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.maxY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], Blocks.planks.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIlIll, this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], this.boundingBox.maxX - Cross.llIlIIllIlIIII[1], this.boundingBox.maxY, this.boundingBox.maxZ - Cross.llIlIIllIlIIII[1], Blocks.planks.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Cross.llIlIIllIlIIII[0] != 0));
            int llllllllllllIllIlIllllllIIIIllll = this.boundingBox.minX;
            "".length();
            if (((0x90 ^ 0xB6 ^ (0x58 ^ 0x67)) & (0x1B ^ 0xD ^ (0x4 ^ 0xB) ^ -" ".length())) != 0x0) {
                return ((28 + 211 - 185 + 181 ^ 111 + 29 + 15 + 9) & (0x1D ^ 0x30 ^ (0x70 ^ 0x12) ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIlIlllIlIIl(llllllllllllIllIlIllllllIIIIllll, this.boundingBox.maxX)) {
                int llllllllllllIllIlIllllllIIIIlllI = this.boundingBox.minZ;
                "".length();
                if (((0x16 ^ 0x1 ^ (0x6A ^ 0x3D)) & (0x2B ^ 0xD ^ (0x4B ^ 0x2D) ^ -" ".length())) != 0x0) {
                    return ((124 + 33 - 60 + 32 ^ 16 + 139 - 121 + 108) & (0xB1 ^ 0xAB ^ (0xD3 ^ 0xC6) ^ -" ".length())) != 0x0;
                }
                while (!lIIlIIlIlllIlIIl(llllllllllllIllIlIllllllIIIIlllI, this.boundingBox.maxZ)) {
                    if (lIIlIIlIlllIllIl(this.getBlockStateFromPos(llllllllllllIllIlIllllllIIIIllII, llllllllllllIllIlIllllllIIIIllll, this.boundingBox.minY - Cross.llIlIIllIlIIII[1], llllllllllllIllIlIllllllIIIIlllI, llllllllllllIllIlIllllllIIIIlIll).getBlock().getMaterial(), Material.air)) {
                        this.setBlockState(llllllllllllIllIlIllllllIIIIllII, Blocks.planks.getDefaultState(), llllllllllllIllIlIllllllIIIIllll, this.boundingBox.minY - Cross.llIlIIllIlIIII[1], llllllllllllIllIlIllllllIIIIlllI, llllllllllllIllIlIllllllIIIIlIll);
                    }
                    ++llllllllllllIllIlIllllllIIIIlllI;
                }
                ++llllllllllllIllIlIllllllIIIIllll;
            }
            return Cross.llIlIIllIlIIII[1] != 0;
        }
        
        private static String lIIlIIlIlllIIIlI(final String llllllllllllIllIlIlllllIllllIIlI, final String llllllllllllIllIlIlllllIlllIllll) {
            try {
                final SecretKeySpec llllllllllllIllIlIlllllIllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllllIlllIllll.getBytes(StandardCharsets.UTF_8)), Cross.llIlIIllIlIIII[7]), "DES");
                final Cipher llllllllllllIllIlIlllllIllllIlII = Cipher.getInstance("DES");
                llllllllllllIllIlIlllllIllllIlII.init(Cross.llIlIIllIlIIII[2], llllllllllllIllIlIlllllIllllIlIl);
                return new String(llllllllllllIllIlIlllllIllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllllIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlllllIllllIIll) {
                llllllllllllIllIlIlllllIllllIIll.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlIIlIlllIIIII(final String llllllllllllIllIlIlllllIllllllll, final String llllllllllllIllIlIlllllIlllllllI) {
            try {
                final SecretKeySpec llllllllllllIllIlIllllllIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllllIlllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIllllllIIIIIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIllllllIIIIIIIl.init(Cross.llIlIIllIlIIII[2], llllllllllllIllIlIllllllIIIIIIlI);
                return new String(llllllllllllIllIlIllllllIIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIllllllIIIIIIII) {
                llllllllllllIllIlIllllllIIIIIIII.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlIIlIlllIlIII() {
            (llIlIIllIlIIII = new int[8])[0] = ((0x30 ^ 0x16) & ~(0xA8 ^ 0x8E));
            Cross.llIlIIllIlIIII[1] = " ".length();
            Cross.llIlIIllIlIIII[2] = "  ".length();
            Cross.llIlIIllIlIIII[3] = "   ".length();
            Cross.llIlIIllIlIIII[4] = (0x6E ^ 0x6A);
            Cross.llIlIIllIlIIII[5] = (0xE5 ^ 0x8F ^ (0x4D ^ 0x21));
            Cross.llIlIIllIlIIII[6] = (0xA8 ^ 0xAD);
            Cross.llIlIIllIlIIII[7] = (104 + 96 - 148 + 88 ^ 83 + 125 - 204 + 128);
        }
        
        private static boolean lIIlIIlIlllIlIlI(final int llllllllllllIllIlIlllllIllIIIIll) {
            return llllllllllllIllIlIlllllIllIIIIll == 0;
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIllIlIllllllIIlIIIIl, final List<StructureComponent> llllllllllllIllIlIllllllIIIllIll, final Random llllllllllllIllIlIllllllIIIllIlI) {
            final int llllllllllllIllIlIllllllIIIllllI = this.getComponentType();
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.corridorDirection.ordinal()]) {
                case 3: {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ - Cross.llIlIIllIlIIII[1], EnumFacing.NORTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.WEST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.maxX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.EAST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.maxZ + Cross.llIlIIllIlIIII[1], EnumFacing.SOUTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.WEST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.maxX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.EAST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    "".length();
                    if (((26 + 68 + 12 + 37 ^ 47 + 82 - 116 + 177) & (40 + 56 - 16 + 80 ^ 28 + 135 - 53 + 35 ^ -" ".length())) == (0xC1 ^ 0x9C ^ (0xC9 ^ 0x90))) {
                        return;
                    }
                    break;
                }
                case 5: {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ - Cross.llIlIIllIlIIII[1], EnumFacing.NORTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.maxZ + Cross.llIlIIllIlIIII[1], EnumFacing.SOUTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.WEST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return;
                    }
                    break;
                }
                case 6: {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ - Cross.llIlIIllIlIIII[1], EnumFacing.NORTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.maxZ + Cross.llIlIIllIlIIII[1], EnumFacing.SOUTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.maxX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY, this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.EAST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                    break;
                }
            }
            if (lIIlIIlIlllIllII(this.isMultipleFloors ? 1 : 0)) {
                if (lIIlIIlIlllIllII(llllllllllllIllIlIllllllIIIllIlI.nextBoolean() ? 1 : 0)) {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY + Cross.llIlIIllIlIIII[3] + Cross.llIlIIllIlIIII[1], this.boundingBox.minZ - Cross.llIlIIllIlIIII[1], EnumFacing.NORTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                }
                if (lIIlIIlIlllIllII(llllllllllllIllIlIllllllIIIllIlI.nextBoolean() ? 1 : 0)) {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX - Cross.llIlIIllIlIIII[1], this.boundingBox.minY + Cross.llIlIIllIlIIII[3] + Cross.llIlIIllIlIIII[1], this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.WEST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                }
                if (lIIlIIlIlllIllII(llllllllllllIllIlIllllllIIIllIlI.nextBoolean() ? 1 : 0)) {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.maxX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY + Cross.llIlIIllIlIIII[3] + Cross.llIlIIllIlIIII[1], this.boundingBox.minZ + Cross.llIlIIllIlIIII[1], EnumFacing.EAST, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                }
                if (lIIlIIlIlllIllII(llllllllllllIllIlIllllllIIIllIlI.nextBoolean() ? 1 : 0)) {
                    func_175890_b(llllllllllllIllIlIllllllIIlIIIIl, llllllllllllIllIlIllllllIIIllIll, llllllllllllIllIlIllllllIIIllIlI, this.boundingBox.minX + Cross.llIlIIllIlIIII[1], this.boundingBox.minY + Cross.llIlIIllIlIIII[3] + Cross.llIlIIllIlIIII[1], this.boundingBox.maxZ + Cross.llIlIIllIlIIII[1], EnumFacing.SOUTH, llllllllllllIllIlIllllllIIIllllI);
                    "".length();
                }
            }
        }
        
        static {
            lIIlIIlIlllIlIII();
            lIIlIIlIlllIIIll();
        }
        
        private static String lIIlIIlIlllIIIIl(String llllllllllllIllIlIlllllIllIlllIl, final String llllllllllllIllIlIlllllIllIlllII) {
            llllllllllllIllIlIlllllIllIlllIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIlllllIllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlllllIlllIIIII = new StringBuilder();
            final char[] llllllllllllIllIlIlllllIllIlllll = llllllllllllIllIlIlllllIllIlllII.toCharArray();
            int llllllllllllIllIlIlllllIllIllllI = Cross.llIlIIllIlIIII[0];
            final char llllllllllllIllIlIlllllIllIllIII = (Object)llllllllllllIllIlIlllllIllIlllIl.toCharArray();
            final byte llllllllllllIllIlIlllllIllIlIlll = (byte)llllllllllllIllIlIlllllIllIllIII.length;
            float llllllllllllIllIlIlllllIllIlIllI = Cross.llIlIIllIlIIII[0];
            while (lIIlIIlIlllIlllI((int)llllllllllllIllIlIlllllIllIlIllI, llllllllllllIllIlIlllllIllIlIlll)) {
                final char llllllllllllIllIlIlllllIlllIIIll = llllllllllllIllIlIlllllIllIllIII[llllllllllllIllIlIlllllIllIlIllI];
                llllllllllllIllIlIlllllIlllIIIII.append((char)(llllllllllllIllIlIlllllIlllIIIll ^ llllllllllllIllIlIlllllIllIlllll[llllllllllllIllIlIlllllIllIllllI % llllllllllllIllIlIlllllIllIlllll.length]));
                "".length();
                ++llllllllllllIllIlIlllllIllIllllI;
                ++llllllllllllIllIlIlllllIllIlIllI;
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlllllIlllIIIII);
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIlIllllllIlIIllII) {
            this.isMultipleFloors = llllllllllllIllIlIllllllIlIIllII.getBoolean(Cross.llIlIIllIIllII[Cross.llIlIIllIlIIII[2]]);
            this.corridorDirection = EnumFacing.getHorizontal(llllllllllllIllIlIllllllIlIIllII.getInteger(Cross.llIlIIllIIllII[Cross.llIlIIllIlIIII[3]]));
        }
        
        private static boolean lIIlIIlIlllIllII(final int llllllllllllIllIlIlllllIllIIIlIl) {
            return llllllllllllIllIlIlllllIllIIIlIl != 0;
        }
    }
    
    public static class Room extends StructureComponent
    {
        private static final /* synthetic */ String[] lIIIIlIIIIIIIl;
        private /* synthetic */ List<StructureBoundingBox> roomsLinkedToTheRoom;
        private static final /* synthetic */ int[] lIIIIlIIIIIIlI;
        
        private static void lIllIlllllIlllI() {
            (lIIIIlIIIIIIlI = new int[11])[0] = (0x2E ^ 0x1C);
            Room.lIIIIlIIIIIIlI[1] = (0xA ^ 0x27 ^ (0xB5 ^ 0x9F));
            Room.lIIIIlIIIIIIlI[2] = (0xBF ^ 0xB9);
            Room.lIIIIlIIIIIIlI[3] = (0x5E ^ 0x76 ^ (0x71 ^ 0x6F));
            Room.lIIIIlIIIIIIlI[4] = "   ".length();
            Room.lIIIIlIIIIIIlI[5] = " ".length();
            Room.lIIIIlIIIIIIlI[6] = ((96 + 120 - 159 + 85 ^ 119 + 59 - 63 + 20) & (0x49 ^ 0x2F ^ (0xC8 ^ 0xA7) ^ -" ".length()));
            Room.lIIIIlIIIIIIlI[7] = "  ".length();
            Room.lIIIIlIIIIIIlI[8] = (0xBB ^ 0xBF);
            Room.lIIIIlIIIIIIlI[9] = (61 + 154 - 132 + 87 ^ 96 + 65 - 152 + 152);
            Room.lIIIIlIIIIIIlI[10] = (0x83 ^ 0x8B);
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIlIIllIlIlIIlIIlIIl, final List<StructureComponent> lllllllllllllIlIIllIlIlIIIllIllI, final Random lllllllllllllIlIIllIlIlIIlIIIlll) {
            final int lllllllllllllIlIIllIlIlIIlIIIllI = this.getComponentType();
            int lllllllllllllIlIIllIlIlIIlIIIlIl = this.boundingBox.getYSize() - Room.lIIIIlIIIIIIlI[4] - Room.lIIIIlIIIIIIlI[5];
            if (lIllIlllllIllll(lllllllllllllIlIIllIlIlIIlIIIlIl)) {
                lllllllllllllIlIIllIlIlIIlIIIlIl = Room.lIIIIlIIIIIIlI[5];
            }
            int lllllllllllllIlIIllIlIlIIlIIIlII = Room.lIIIIlIIIIIIlI[6];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
            while (!lIllIllllllIIlI(lllllllllllllIlIIllIlIlIIlIIIlII, this.boundingBox.getXSize())) {
                lllllllllllllIlIIllIlIlIIlIIIlII += lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(this.boundingBox.getXSize());
                if (lIllIllllllIIII(lllllllllllllIlIIllIlIlIIlIIIlII + Room.lIIIIlIIIIIIlI[4], this.boundingBox.getXSize())) {
                    "".length();
                    if (-" ".length() >= ((0xF ^ 0x56) & ~(0x66 ^ 0x3F))) {
                        return;
                    }
                    break;
                }
                else {
                    final StructureComponent lllllllllllllIlIIllIlIlIIlIIIIll = func_175890_b(lllllllllllllIlIIllIlIlIIlIIlIIl, lllllllllllllIlIIllIlIlIIIllIllI, lllllllllllllIlIIllIlIlIIlIIIlll, this.boundingBox.minX + lllllllllllllIlIIllIlIlIIlIIIlII, this.boundingBox.minY + lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(lllllllllllllIlIIllIlIlIIlIIIlIl) + Room.lIIIIlIIIIIIlI[5], this.boundingBox.minZ - Room.lIIIIlIIIIIIlI[5], EnumFacing.NORTH, lllllllllllllIlIIllIlIlIIlIIIllI);
                    if (lIllIllllllIIIl(lllllllllllllIlIIllIlIlIIlIIIIll)) {
                        final StructureBoundingBox lllllllllllllIlIIllIlIlIIlIIIIlI = lllllllllllllIlIIllIlIlIIlIIIIll.getBoundingBox();
                        this.roomsLinkedToTheRoom.add(new StructureBoundingBox(lllllllllllllIlIIllIlIlIIlIIIIlI.minX, lllllllllllllIlIIllIlIlIIlIIIIlI.minY, this.boundingBox.minZ, lllllllllllllIlIIllIlIlIIlIIIIlI.maxX, lllllllllllllIlIIllIlIlIIlIIIIlI.maxY, this.boundingBox.minZ + Room.lIIIIlIIIIIIlI[5]));
                        "".length();
                    }
                    lllllllllllllIlIIllIlIlIIlIIIlII += 4;
                }
            }
            int lllllllllllllIlIIllIlIlIIlIIIIIl = Room.lIIIIlIIIIIIlI[6];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lIllIllllllIIlI(lllllllllllllIlIIllIlIlIIlIIIIIl, this.boundingBox.getXSize())) {
                lllllllllllllIlIIllIlIlIIlIIIIIl += lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(this.boundingBox.getXSize());
                if (lIllIllllllIIII(lllllllllllllIlIIllIlIlIIlIIIIIl + Room.lIIIIlIIIIIIlI[4], this.boundingBox.getXSize())) {
                    "".length();
                    if ((0x70 ^ 0x7E ^ (0x66 ^ 0x6C)) <= 0) {
                        return;
                    }
                    break;
                }
                else {
                    final StructureComponent lllllllllllllIlIIllIlIlIIlIIIIII = func_175890_b(lllllllllllllIlIIllIlIlIIlIIlIIl, lllllllllllllIlIIllIlIlIIIllIllI, lllllllllllllIlIIllIlIlIIlIIIlll, this.boundingBox.minX + lllllllllllllIlIIllIlIlIIlIIIIIl, this.boundingBox.minY + lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(lllllllllllllIlIIllIlIlIIlIIIlIl) + Room.lIIIIlIIIIIIlI[5], this.boundingBox.maxZ + Room.lIIIIlIIIIIIlI[5], EnumFacing.SOUTH, lllllllllllllIlIIllIlIlIIlIIIllI);
                    if (lIllIllllllIIIl(lllllllllllllIlIIllIlIlIIlIIIIII)) {
                        final StructureBoundingBox lllllllllllllIlIIllIlIlIIIllllll = lllllllllllllIlIIllIlIlIIlIIIIII.getBoundingBox();
                        this.roomsLinkedToTheRoom.add(new StructureBoundingBox(lllllllllllllIlIIllIlIlIIIllllll.minX, lllllllllllllIlIIllIlIlIIIllllll.minY, this.boundingBox.maxZ - Room.lIIIIlIIIIIIlI[5], lllllllllllllIlIIllIlIlIIIllllll.maxX, lllllllllllllIlIIllIlIlIIIllllll.maxY, this.boundingBox.maxZ));
                        "".length();
                    }
                    lllllllllllllIlIIllIlIlIIlIIIIIl += 4;
                }
            }
            int lllllllllllllIlIIllIlIlIIIlllllI = Room.lIIIIlIIIIIIlI[6];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lIllIllllllIIlI(lllllllllllllIlIIllIlIlIIIlllllI, this.boundingBox.getZSize())) {
                lllllllllllllIlIIllIlIlIIIlllllI += lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(this.boundingBox.getZSize());
                if (lIllIllllllIIII(lllllllllllllIlIIllIlIlIIIlllllI + Room.lIIIIlIIIIIIlI[4], this.boundingBox.getZSize())) {
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                    break;
                }
                else {
                    final StructureComponent lllllllllllllIlIIllIlIlIIIllllIl = func_175890_b(lllllllllllllIlIIllIlIlIIlIIlIIl, lllllllllllllIlIIllIlIlIIIllIllI, lllllllllllllIlIIllIlIlIIlIIIlll, this.boundingBox.minX - Room.lIIIIlIIIIIIlI[5], this.boundingBox.minY + lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(lllllllllllllIlIIllIlIlIIlIIIlIl) + Room.lIIIIlIIIIIIlI[5], this.boundingBox.minZ + lllllllllllllIlIIllIlIlIIIlllllI, EnumFacing.WEST, lllllllllllllIlIIllIlIlIIlIIIllI);
                    if (lIllIllllllIIIl(lllllllllllllIlIIllIlIlIIIllllIl)) {
                        final StructureBoundingBox lllllllllllllIlIIllIlIlIIIllllII = lllllllllllllIlIIllIlIlIIIllllIl.getBoundingBox();
                        this.roomsLinkedToTheRoom.add(new StructureBoundingBox(this.boundingBox.minX, lllllllllllllIlIIllIlIlIIIllllII.minY, lllllllllllllIlIIllIlIlIIIllllII.minZ, this.boundingBox.minX + Room.lIIIIlIIIIIIlI[5], lllllllllllllIlIIllIlIlIIIllllII.maxY, lllllllllllllIlIIllIlIlIIIllllII.maxZ));
                        "".length();
                    }
                    lllllllllllllIlIIllIlIlIIIlllllI += 4;
                }
            }
            int lllllllllllllIlIIllIlIlIIIlllIll = Room.lIIIIlIIIIIIlI[6];
            "".length();
            if (-" ".length() >= " ".length()) {
                return;
            }
            while (!lIllIllllllIIlI(lllllllllllllIlIIllIlIlIIIlllIll, this.boundingBox.getZSize())) {
                lllllllllllllIlIIllIlIlIIIlllIll += lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(this.boundingBox.getZSize());
                if (lIllIllllllIIII(lllllllllllllIlIIllIlIlIIIlllIll + Room.lIIIIlIIIIIIlI[4], this.boundingBox.getZSize())) {
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
                else {
                    final StructureComponent lllllllllllllIlIIllIlIlIIIlllIlI = func_175890_b(lllllllllllllIlIIllIlIlIIlIIlIIl, lllllllllllllIlIIllIlIlIIIllIllI, lllllllllllllIlIIllIlIlIIlIIIlll, this.boundingBox.maxX + Room.lIIIIlIIIIIIlI[5], this.boundingBox.minY + lllllllllllllIlIIllIlIlIIlIIIlll.nextInt(lllllllllllllIlIIllIlIlIIlIIIlIl) + Room.lIIIIlIIIIIIlI[5], this.boundingBox.minZ + lllllllllllllIlIIllIlIlIIIlllIll, EnumFacing.EAST, lllllllllllllIlIIllIlIlIIlIIIllI);
                    if (lIllIllllllIIIl(lllllllllllllIlIIllIlIlIIIlllIlI)) {
                        final StructureBoundingBox lllllllllllllIlIIllIlIlIIIlllIIl = lllllllllllllIlIIllIlIlIIIlllIlI.getBoundingBox();
                        this.roomsLinkedToTheRoom.add(new StructureBoundingBox(this.boundingBox.maxX - Room.lIIIIlIIIIIIlI[5], lllllllllllllIlIIllIlIlIIIlllIIl.minY, lllllllllllllIlIIllIlIlIIIlllIIl.minZ, this.boundingBox.maxX, lllllllllllllIlIIllIlIlIIIlllIIl.maxY, lllllllllllllIlIIllIlIlIIIlllIIl.maxZ));
                        "".length();
                    }
                    lllllllllllllIlIIllIlIlIIIlllIll += 4;
                }
            }
        }
        
        private static boolean lIllIllllllIlII(final int lllllllllllllIlIIllIlIIlllIIlllI) {
            return lllllllllllllIlIIllIlIIlllIIlllI == 0;
        }
        
        private static boolean lIllIllllllIIIl(final Object lllllllllllllIlIIllIlIIlllIlIIlI) {
            return lllllllllllllIlIIllIlIIlllIlIIlI != null;
        }
        
        @Override
        public void func_181138_a(final int lllllllllllllIlIIllIlIlIIIIlIlII, final int lllllllllllllIlIIllIlIlIIIIlIIll, final int lllllllllllllIlIIllIlIlIIIIlIlll) {
            super.func_181138_a(lllllllllllllIlIIllIlIlIIIIlIlII, lllllllllllllIlIIllIlIlIIIIlIIll, lllllllllllllIlIIllIlIlIIIIlIlll);
            final boolean lllllllllllllIlIIllIlIlIIIIlIIII = (boolean)this.roomsLinkedToTheRoom.iterator();
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
            while (!lIllIllllllIlII(((Iterator)lllllllllllllIlIIllIlIlIIIIlIIII).hasNext() ? 1 : 0)) {
                final StructureBoundingBox lllllllllllllIlIIllIlIlIIIIlIllI = ((Iterator<StructureBoundingBox>)lllllllllllllIlIIllIlIlIIIIlIIII).next();
                lllllllllllllIlIIllIlIlIIIIlIllI.offset(lllllllllllllIlIIllIlIlIIIIlIlII, lllllllllllllIlIIllIlIlIIIIlIIll, lllllllllllllIlIIllIlIlIIIIlIlll);
            }
        }
        
        public Room(final int lllllllllllllIlIIllIlIlIIlIlllII, final Random lllllllllllllIlIIllIlIlIIlIllIll, final int lllllllllllllIlIIllIlIlIIlIlIlIl, final int lllllllllllllIlIIllIlIlIIlIlIlII) {
            super(lllllllllllllIlIIllIlIlIIlIlllII);
            this.roomsLinkedToTheRoom = (List<StructureBoundingBox>)Lists.newLinkedList();
            this.boundingBox = new StructureBoundingBox(lllllllllllllIlIIllIlIlIIlIlIlIl, Room.lIIIIlIIIIIIlI[0], lllllllllllllIlIIllIlIlIIlIlIlII, lllllllllllllIlIIllIlIlIIlIlIlIl + Room.lIIIIlIIIIIIlI[1] + lllllllllllllIlIIllIlIlIIlIllIll.nextInt(Room.lIIIIlIIIIIIlI[2]), Room.lIIIIlIIIIIIlI[3] + lllllllllllllIlIIllIlIlIIlIllIll.nextInt(Room.lIIIIlIIIIIIlI[2]), lllllllllllllIlIIllIlIlIIlIlIlII + Room.lIIIIlIIIIIIlI[1] + lllllllllllllIlIIllIlIlIIlIllIll.nextInt(Room.lIIIIlIIIIIIlI[2]));
        }
        
        static {
            lIllIlllllIlllI();
            lIllIlllllIlIll();
        }
        
        public Room() {
            this.roomsLinkedToTheRoom = (List<StructureBoundingBox>)Lists.newLinkedList();
        }
        
        private static void lIllIlllllIlIll() {
            (lIIIIlIIIIIIIl = new String[Room.lIIIIlIIIIIIlI[7]])[Room.lIIIIlIIIIIIlI[6]] = lIllIlllllIlIIl("n4AQnxESuwVZjbbsCdof6A==", "LbIZa");
            Room.lIIIIlIIIIIIIl[Room.lIIIIlIIIIIIlI[5]] = lIllIlllllIlIlI("Lf6o1plyW5rvOt7VKC/DfQ==", "ywLJk");
        }
        
        private static boolean lIllIllllllIIll(final int lllllllllllllIlIIllIlIIlllIlIIII) {
            return lllllllllllllIlIIllIlIIlllIlIIII != 0;
        }
        
        private static boolean lIllIlllllIllll(final int lllllllllllllIlIIllIlIIlllIIllII) {
            return lllllllllllllIlIIllIlIIlllIIllII <= 0;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIlIIllIlIIlllllllII) {
            final NBTTagList lllllllllllllIlIIllIlIIllllllIll = lllllllllllllIlIIllIlIIlllllllII.getTagList(Room.lIIIIlIIIIIIIl[Room.lIIIIlIIIIIIlI[5]], Room.lIIIIlIIIIIIlI[9]);
            int lllllllllllllIlIIllIlIIllllllIlI = Room.lIIIIlIIIIIIlI[6];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
            while (!lIllIllllllIIlI(lllllllllllllIlIIllIlIIllllllIlI, lllllllllllllIlIIllIlIIllllllIll.tagCount())) {
                this.roomsLinkedToTheRoom.add(new StructureBoundingBox(lllllllllllllIlIIllIlIIllllllIll.getIntArrayAt(lllllllllllllIlIIllIlIIllllllIlI)));
                "".length();
                ++lllllllllllllIlIIllIlIIllllllIlI;
            }
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIlIIllIlIlIIIIIIlIl) {
            final NBTTagList lllllllllllllIlIIllIlIlIIIIIlIII = new NBTTagList();
            final long lllllllllllllIlIIllIlIlIIIIIIIlI = (long)this.roomsLinkedToTheRoom.iterator();
            "".length();
            if ("  ".length() == (0x24 ^ 0x20)) {
                return;
            }
            while (!lIllIllllllIlII(((Iterator)lllllllllllllIlIIllIlIlIIIIIIIlI).hasNext() ? 1 : 0)) {
                final StructureBoundingBox lllllllllllllIlIIllIlIlIIIIIIlll = ((Iterator<StructureBoundingBox>)lllllllllllllIlIIllIlIlIIIIIIIlI).next();
                lllllllllllllIlIIllIlIlIIIIIlIII.appendTag(lllllllllllllIlIIllIlIlIIIIIIlll.toNBTTagIntArray());
            }
            lllllllllllllIlIIllIlIlIIIIIIlIl.setTag(Room.lIIIIlIIIIIIIl[Room.lIIIIlIIIIIIlI[6]], lllllllllllllIlIIllIlIlIIIIIlIII);
        }
        
        private static String lIllIlllllIlIlI(final String lllllllllllllIlIIllIlIIllllIIIIl, final String lllllllllllllIlIIllIlIIllllIIIII) {
            try {
                final SecretKeySpec lllllllllllllIlIIllIlIIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIllllIIIII.getBytes(StandardCharsets.UTF_8)), Room.lIIIIlIIIIIIlI[10]), "DES");
                final Cipher lllllllllllllIlIIllIlIIllllIIIll = Cipher.getInstance("DES");
                lllllllllllllIlIIllIlIIllllIIIll.init(Room.lIIIIlIIIIIIlI[7], lllllllllllllIlIIllIlIIllllIIlII);
                return new String(lllllllllllllIlIIllIlIIllllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIllIlIIllllIIIlI) {
                lllllllllllllIlIIllIlIIllllIIIlI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIIllIlIlIIIlIlIIl, final Random lllllllllllllIlIIllIlIlIIIlIlIII, final StructureBoundingBox lllllllllllllIlIIllIlIlIIIlIIlll) {
            if (lIllIllllllIIll(this.isLiquidInStructureBoundingBox(lllllllllllllIlIIllIlIlIIIlIlIIl, lllllllllllllIlIIllIlIlIIIlIIlll) ? 1 : 0)) {
                return Room.lIIIIlIIIIIIlI[6] != 0;
            }
            this.fillWithBlocks(lllllllllllllIlIIllIlIlIIIlIlIIl, lllllllllllllIlIIllIlIlIIIlIIlll, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.minZ, this.boundingBox.maxX, this.boundingBox.minY, this.boundingBox.maxZ, Blocks.dirt.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Room.lIIIIlIIIIIIlI[5] != 0));
            this.fillWithBlocks(lllllllllllllIlIIllIlIlIIIlIlIIl, lllllllllllllIlIIllIlIlIIIlIIlll, this.boundingBox.minX, this.boundingBox.minY + Room.lIIIIlIIIIIIlI[5], this.boundingBox.minZ, this.boundingBox.maxX, Math.min(this.boundingBox.minY + Room.lIIIIlIIIIIIlI[4], this.boundingBox.maxY), this.boundingBox.maxZ, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Room.lIIIIlIIIIIIlI[6] != 0));
            final boolean lllllllllllllIlIIllIlIlIIIlIIIIl = (boolean)this.roomsLinkedToTheRoom.iterator();
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((51 + 122 - 118 + 109 ^ 31 + 66 + 32 + 68) & (117 + 172 - 241 + 200 ^ 147 + 6 - 20 + 20 ^ -" ".length())) != 0x0;
            }
            while (!lIllIllllllIlII(((Iterator)lllllllllllllIlIIllIlIlIIIlIIIIl).hasNext() ? 1 : 0)) {
                final StructureBoundingBox lllllllllllllIlIIllIlIlIIIlIIllI = ((Iterator<StructureBoundingBox>)lllllllllllllIlIIllIlIlIIIlIIIIl).next();
                this.fillWithBlocks(lllllllllllllIlIIllIlIlIIIlIlIIl, lllllllllllllIlIIllIlIlIIIlIIlll, lllllllllllllIlIIllIlIlIIIlIIllI.minX, lllllllllllllIlIIllIlIlIIIlIIllI.maxY - Room.lIIIIlIIIIIIlI[7], lllllllllllllIlIIllIlIlIIIlIIllI.minZ, lllllllllllllIlIIllIlIlIIIlIIllI.maxX, lllllllllllllIlIIllIlIlIIIlIIllI.maxY, lllllllllllllIlIIllIlIlIIIlIIllI.maxZ, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Room.lIIIIlIIIIIIlI[6] != 0));
            }
            this.randomlyRareFillWithBlocks(lllllllllllllIlIIllIlIlIIIlIlIIl, lllllllllllllIlIIllIlIlIIIlIIlll, this.boundingBox.minX, this.boundingBox.minY + Room.lIIIIlIIIIIIlI[8], this.boundingBox.minZ, this.boundingBox.maxX, this.boundingBox.maxY, this.boundingBox.maxZ, Blocks.air.getDefaultState(), (boolean)(Room.lIIIIlIIIIIIlI[6] != 0));
            return Room.lIIIIlIIIIIIlI[5] != 0;
        }
        
        private static boolean lIllIllllllIIII(final int lllllllllllllIlIIllIlIIlllIlIlIl, final int lllllllllllllIlIIllIlIIlllIlIlII) {
            return lllllllllllllIlIIllIlIIlllIlIlIl > lllllllllllllIlIIllIlIIlllIlIlII;
        }
        
        private static String lIllIlllllIlIIl(final String lllllllllllllIlIIllIlIIllllIlllI, final String lllllllllllllIlIIllIlIIllllIlIll) {
            try {
                final SecretKeySpec lllllllllllllIlIIllIlIIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIllIlIIlllllIIII = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIllIlIIlllllIIII.init(Room.lIIIIlIIIIIIlI[7], lllllllllllllIlIIllIlIIlllllIIIl);
                return new String(lllllllllllllIlIIllIlIIlllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIllIlIIllllIllll) {
                lllllllllllllIlIIllIlIIllllIllll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIllIllllllIIlI(final int lllllllllllllIlIIllIlIIlllIllIIl, final int lllllllllllllIlIIllIlIIlllIllIII) {
            return lllllllllllllIlIIllIlIIlllIllIIl >= lllllllllllllIlIIllIlIIlllIllIII;
        }
    }
    
    public static class Corridor extends StructureComponent
    {
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        private /* synthetic */ boolean spawnerPlaced;
        private /* synthetic */ boolean hasSpiders;
        private /* synthetic */ boolean hasRails;
        private /* synthetic */ int sectionCount;
        private static final /* synthetic */ int[] lIIlIIIlIIIlll;
        private static final /* synthetic */ String[] lIIlIIIlIIIllI;
        
        @Override
        protected boolean generateChestContents(final World lllllllllllllIIlllIlIIIIIlllIIlI, final StructureBoundingBox lllllllllllllIIlllIlIIIIIlllIIIl, final Random lllllllllllllIIlllIlIIIIIllIIlII, final int lllllllllllllIIlllIlIIIIIllIllll, final int lllllllllllllIIlllIlIIIIIllIIIlI, final int lllllllllllllIIlllIlIIIIIllIllIl, final List<WeightedRandomChestContent> lllllllllllllIIlllIlIIIIIllIIIII, final int lllllllllllllIIlllIlIIIIIlIlllll) {
            final BlockPos lllllllllllllIIlllIlIIIIIllIlIlI = new BlockPos(this.getXWithOffset(lllllllllllllIIlllIlIIIIIllIllll, lllllllllllllIIlllIlIIIIIllIllIl), this.getYWithOffset(lllllllllllllIIlllIlIIIIIllIIIlI), this.getZWithOffset(lllllllllllllIIlllIlIIIIIllIllll, lllllllllllllIIlllIlIIIIIllIllIl));
            if (llIIlIlIlIlllll(lllllllllllllIIlllIlIIIIIlllIIIl.isVecInside(lllllllllllllIIlllIlIIIIIllIlIlI) ? 1 : 0) && llIIlIlIllIIIII(lllllllllllllIIlllIlIIIIIlllIIlI.getBlockState(lllllllllllllIIlllIlIIIIIllIlIlI).getBlock().getMaterial(), Material.air)) {
                int n;
                if (llIIlIlIlIlllll(lllllllllllllIIlllIlIIIIIllIIlII.nextBoolean() ? 1 : 0)) {
                    n = Corridor.lIIlIIIlIIIlll[1];
                    "".length();
                    if (null != null) {
                        return ((0x2A ^ 0x5) & ~(0xEB ^ 0xC4)) != 0x0;
                    }
                }
                else {
                    n = Corridor.lIIlIIIlIIIlll[0];
                }
                final int lllllllllllllIIlllIlIIIIIllIlIIl = n;
                lllllllllllllIIlllIlIIIIIlllIIlI.setBlockState(lllllllllllllIIlllIlIIIIIllIlIlI, Blocks.rail.getStateFromMeta(this.getMetadataWithOffset(Blocks.rail, lllllllllllllIIlllIlIIIIIllIlIIl)), Corridor.lIIlIIIlIIIlll[2]);
                "".length();
                final EntityMinecartChest lllllllllllllIIlllIlIIIIIllIlIII = new EntityMinecartChest(lllllllllllllIIlllIlIIIIIlllIIlI, lllllllllllllIIlllIlIIIIIllIlIlI.getX() + 0.5f, lllllllllllllIIlllIlIIIIIllIlIlI.getY() + 0.5f, lllllllllllllIIlllIlIIIIIllIlIlI.getZ() + 0.5f);
                WeightedRandomChestContent.generateChestContents(lllllllllllllIIlllIlIIIIIllIIlII, lllllllllllllIIlllIlIIIIIllIIIII, lllllllllllllIIlllIlIIIIIllIlIII, lllllllllllllIIlllIlIIIIIlIlllll);
                lllllllllllllIIlllIlIIIIIlllIIlI.spawnEntityInWorld(lllllllllllllIIlllIlIIIIIllIlIII);
                "".length();
                return Corridor.lIIlIIIlIIIlll[1] != 0;
            }
            return Corridor.lIIlIIIlIIIlll[0] != 0;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIlllIlIIIIllIIIlII) {
            this.hasRails = lllllllllllllIIlllIlIIIIllIIIlII.getBoolean(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[4]]);
            this.hasSpiders = lllllllllllllIIlllIlIIIIllIIIlII.getBoolean(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[5]]);
            this.spawnerPlaced = lllllllllllllIIlllIlIIIIllIIIlII.getBoolean(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[6]]);
            this.sectionCount = lllllllllllllIIlllIlIIIIllIIIlII.getInteger(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[7]]);
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlllIlIIIIIlIIlIlI, final Random lllllllllllllIIlllIlIIIIIlIIlIIl, final StructureBoundingBox lllllllllllllIIlllIlIIIIIIllIIIl) {
            if (llIIlIlIlIlllll(this.isLiquidInStructureBoundingBox(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl) ? 1 : 0)) {
                return Corridor.lIIlIIIlIIIlll[0] != 0;
            }
            final int lllllllllllllIIlllIlIIIIIlIIIlll = Corridor.lIIlIIIlIIIlll[0];
            final int lllllllllllllIIlllIlIIIIIlIIIllI = Corridor.lIIlIIIlIIIlll[2];
            final int lllllllllllllIIlllIlIIIIIlIIIlIl = Corridor.lIIlIIIlIIIlll[0];
            final int lllllllllllllIIlllIlIIIIIlIIIlII = Corridor.lIIlIIIlIIIlll[2];
            final int lllllllllllllIIlllIlIIIIIlIIIIll = this.sectionCount * Corridor.lIIlIIIlIIIlll[5] - Corridor.lIIlIIIlIIIlll[1];
            this.fillWithBlocks(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[1], lllllllllllllIIlllIlIIIIIlIIIIll, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
            this.func_175805_a(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.8f, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIll, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
            if (llIIlIlIlIlllll(this.hasSpiders ? 1 : 0)) {
                this.func_175805_a(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.6f, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[1], lllllllllllllIIlllIlIIIIIlIIIIll, Blocks.web.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
            }
            int lllllllllllllIIlllIlIIIIIlIIIIlI = Corridor.lIIlIIIlIIIlll[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x18 ^ 0x5D ^ (0x13 ^ 0x53)) & (0x2B ^ 0x76 ^ (0xA ^ 0x52) ^ -" ".length())) != 0x0;
            }
            while (!llIIlIlIllIIIIl(lllllllllllllIIlllIlIIIIIlIIIIlI, this.sectionCount)) {
                final int lllllllllllllIIlllIlIIIIIlIIIIIl = Corridor.lIIlIIIlIIIlll[2] + lllllllllllllIIlllIlIIIIIlIIIIlI * Corridor.lIIlIIIlIIIlll[5];
                this.fillWithBlocks(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[0], lllllllllllllIIlllIlIIIIIlIIIIIl, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[1], lllllllllllllIIlllIlIIIIIlIIIIIl, Blocks.oak_fence.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
                this.fillWithBlocks(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[0], lllllllllllllIIlllIlIIIIIlIIIIIl, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[1], lllllllllllllIIlllIlIIIIIlIIIIIl, Blocks.oak_fence.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
                if (llIIlIlIlIlIlIl(lllllllllllllIIlllIlIIIIIlIIlIIl.nextInt(Corridor.lIIlIIIlIIIlll[4]))) {
                    this.fillWithBlocks(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl, Blocks.planks.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
                    this.fillWithBlocks(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl, Blocks.planks.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0x4F ^ 0x19) & ~(0xFB ^ 0xAD)) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl, Blocks.planks.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lIIlIIIlIIIlll[0] != 0));
                }
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.1f, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl - Corridor.lIIlIIIlIIIlll[1], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.1f, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl - Corridor.lIIlIIIlIIIlll[1], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.1f, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl + Corridor.lIIlIIIlIIIlll[1], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.1f, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl + Corridor.lIIlIIIlIIIlll[1], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.05f, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl - Corridor.lIIlIIIlIIIlll[2], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.05f, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl - Corridor.lIIlIIIlIIIlll[2], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.05f, Corridor.lIIlIIIlIIIlll[0], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl + Corridor.lIIlIIIlIIIlll[2], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.05f, Corridor.lIIlIIIlIIIlll[2], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl + Corridor.lIIlIIIlIIIlll[2], Blocks.web.getDefaultState());
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.05f, Corridor.lIIlIIIlIIIlll[1], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl - Corridor.lIIlIIIlIIIlll[1], Blocks.torch.getStateFromMeta(EnumFacing.UP.getIndex()));
                this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.05f, Corridor.lIIlIIIlIIIlll[1], Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIlIIIIIl + Corridor.lIIlIIIlIIIlll[1], Blocks.torch.getStateFromMeta(EnumFacing.UP.getIndex()));
                if (llIIlIlIlIlIlIl(lllllllllllllIIlllIlIIIIIlIIlIIl.nextInt(Corridor.lIIlIIIlIIIlll[10]))) {
                    final int lllllllllllllIIlllIlIIIIIllIllll = Corridor.lIIlIIIlIIIlll[2];
                    final int lllllllllllllIIlllIlIIIIIllIIIlI = Corridor.lIIlIIIlIIIlll[0];
                    final int lllllllllllllIIlllIlIIIIIllIllIl = lllllllllllllIIlllIlIIIIIlIIIIIl - Corridor.lIIlIIIlIIIlll[1];
                    final List access$1 = StructureMineshaftPieces.CHEST_CONTENT_WEIGHT_LIST;
                    final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl = new WeightedRandomChestContent[Corridor.lIIlIIIlIIIlll[1]];
                    llllllllllllIlIlllIIlllIllIIIlIl[Corridor.lIIlIIIlIIIlll[0]] = Items.enchanted_book.getRandom(lllllllllllllIIlllIlIIIIIlIIlIIl);
                    this.generateChestContents(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, lllllllllllllIIlllIlIIIIIllIllll, lllllllllllllIIlllIlIIIIIllIIIlI, lllllllllllllIIlllIlIIIIIllIllIl, WeightedRandomChestContent.func_177629_a(access$1, llllllllllllIlIlllIIlllIllIIIlIl), Corridor.lIIlIIIlIIIlll[3] + lllllllllllllIIlllIlIIIIIlIIlIIl.nextInt(Corridor.lIIlIIIlIIIlll[4]));
                    "".length();
                }
                if (llIIlIlIlIlIlIl(lllllllllllllIIlllIlIIIIIlIIlIIl.nextInt(Corridor.lIIlIIIlIIIlll[10]))) {
                    final int lllllllllllllIIlllIlIIIIIllIllll2 = Corridor.lIIlIIIlIIIlll[0];
                    final int lllllllllllllIIlllIlIIIIIllIIIlI2 = Corridor.lIIlIIIlIIIlll[0];
                    final int lllllllllllllIIlllIlIIIIIllIllIl2 = lllllllllllllIIlllIlIIIIIlIIIIIl + Corridor.lIIlIIIlIIIlll[1];
                    final List access$2 = StructureMineshaftPieces.CHEST_CONTENT_WEIGHT_LIST;
                    final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl2 = new WeightedRandomChestContent[Corridor.lIIlIIIlIIIlll[1]];
                    llllllllllllIlIlllIIlllIllIIIlIl2[Corridor.lIIlIIIlIIIlll[0]] = Items.enchanted_book.getRandom(lllllllllllllIIlllIlIIIIIlIIlIIl);
                    this.generateChestContents(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, lllllllllllllIIlllIlIIIIIllIllll2, lllllllllllllIIlllIlIIIIIllIIIlI2, lllllllllllllIIlllIlIIIIIllIllIl2, WeightedRandomChestContent.func_177629_a(access$2, llllllllllllIlIlllIIlllIllIIIlIl2), Corridor.lIIlIIIlIIIlll[3] + lllllllllllllIIlllIlIIIIIlIIlIIl.nextInt(Corridor.lIIlIIIlIIIlll[4]));
                    "".length();
                }
                if (llIIlIlIlIlllll(this.hasSpiders ? 1 : 0) && llIIlIlIlIlIlIl(this.spawnerPlaced ? 1 : 0)) {
                    final int lllllllllllllIIlllIlIIIIIlIIIIII = this.getYWithOffset(Corridor.lIIlIIIlIIIlll[0]);
                    int lllllllllllllIIlllIlIIIIIIllllll = lllllllllllllIIlllIlIIIIIlIIIIIl - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIIlIIlIIl.nextInt(Corridor.lIIlIIIlIIIlll[3]);
                    final int lllllllllllllIIlllIlIIIIIIlllllI = this.getXWithOffset(Corridor.lIIlIIIlIIIlll[1], lllllllllllllIIlllIlIIIIIIllllll);
                    lllllllllllllIIlllIlIIIIIIllllll = this.getZWithOffset(Corridor.lIIlIIIlIIIlll[1], lllllllllllllIIlllIlIIIIIIllllll);
                    final BlockPos lllllllllllllIIlllIlIIIIIIllllIl = new BlockPos(lllllllllllllIIlllIlIIIIIIlllllI, lllllllllllllIIlllIlIIIIIlIIIIII, lllllllllllllIIlllIlIIIIIIllllll);
                    if (llIIlIlIlIlllll(lllllllllllllIIlllIlIIIIIIllIIIl.isVecInside(lllllllllllllIIlllIlIIIIIIllllIl) ? 1 : 0)) {
                        this.spawnerPlaced = (Corridor.lIIlIIIlIIIlll[1] != 0);
                        lllllllllllllIIlllIlIIIIIlIIlIlI.setBlockState(lllllllllllllIIlllIlIIIIIIllllIl, Blocks.mob_spawner.getDefaultState(), Corridor.lIIlIIIlIIIlll[2]);
                        "".length();
                        final TileEntity lllllllllllllIIlllIlIIIIIIllllII = lllllllllllllIIlllIlIIIIIlIIlIlI.getTileEntity(lllllllllllllIIlllIlIIIIIIllllIl);
                        if (llIIlIlIlIlllll((lllllllllllllIIlllIlIIIIIIllllII instanceof TileEntityMobSpawner) ? 1 : 0)) {
                            ((TileEntityMobSpawner)lllllllllllllIIlllIlIIIIIIllllII).getSpawnerBaseLogic().setEntityName(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[9]]);
                        }
                    }
                }
                ++lllllllllllllIIlllIlIIIIIlIIIIlI;
            }
            int lllllllllllllIIlllIlIIIIIIlllIll = Corridor.lIIlIIIlIIIlll[0];
            "".length();
            if (-"  ".length() > 0) {
                return ((0x5F ^ 0x7A) & ~(0x5 ^ 0x20)) != 0x0;
            }
            while (!llIIlIlIlIllllI(lllllllllllllIIlllIlIIIIIIlllIll, Corridor.lIIlIIIlIIIlll[2])) {
                int lllllllllllllIIlllIlIIIIIIlllIlI = Corridor.lIIlIIIlIIIlll[0];
                "".length();
                if (null != null) {
                    return ((57 + 134 - 62 + 27 ^ 37 + 153 - 86 + 83) & (0x3F ^ 0x8 ^ (0x9 ^ 0x19) ^ -" ".length())) != 0x0;
                }
                while (!llIIlIlIlIllllI(lllllllllllllIIlllIlIIIIIIlllIlI, lllllllllllllIIlllIlIIIIIlIIIIll)) {
                    final int lllllllllllllIIlllIlIIIIIIlllIIl = Corridor.lIIlIIIlIIIlll[11];
                    final IBlockState lllllllllllllIIlllIlIIIIIIlllIII = this.getBlockStateFromPos(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIlllIll, lllllllllllllIIlllIlIIIIIIlllIIl, lllllllllllllIIlllIlIIIIIIlllIlI, lllllllllllllIIlllIlIIIIIIllIIIl);
                    if (llIIlIlIllIIIII(lllllllllllllIIlllIlIIIIIIlllIII.getBlock().getMaterial(), Material.air)) {
                        final int lllllllllllllIIlllIlIIIIIIllIlll = Corridor.lIIlIIIlIIIlll[11];
                        this.setBlockState(lllllllllllllIIlllIlIIIIIlIIlIlI, Blocks.planks.getDefaultState(), lllllllllllllIIlllIlIIIIIIlllIll, lllllllllllllIIlllIlIIIIIIllIlll, lllllllllllllIIlllIlIIIIIIlllIlI, lllllllllllllIIlllIlIIIIIIllIIIl);
                    }
                    ++lllllllllllllIIlllIlIIIIIIlllIlI;
                }
                ++lllllllllllllIIlllIlIIIIIIlllIll;
            }
            if (llIIlIlIlIlllll(this.hasRails ? 1 : 0)) {
                int lllllllllllllIIlllIlIIIIIIllIllI = Corridor.lIIlIIIlIIIlll[0];
                "".length();
                if (" ".length() != " ".length()) {
                    return ((0x3F ^ 0x14) & ~(0x1D ^ 0x36)) != 0x0;
                }
                while (!llIIlIlIlIllllI(lllllllllllllIIlllIlIIIIIIllIllI, lllllllllllllIIlllIlIIIIIlIIIIll)) {
                    final IBlockState lllllllllllllIIlllIlIIIIIIllIlIl = this.getBlockStateFromPos(lllllllllllllIIlllIlIIIIIlIIlIlI, Corridor.lIIlIIIlIIIlll[1], Corridor.lIIlIIIlIIIlll[11], lllllllllllllIIlllIlIIIIIIllIllI, lllllllllllllIIlllIlIIIIIIllIIIl);
                    if (llIIlIlIlIlIllI(lllllllllllllIIlllIlIIIIIIllIlIl.getBlock().getMaterial(), Material.air) && llIIlIlIlIlllll(lllllllllllllIIlllIlIIIIIIllIlIl.getBlock().isFullBlock() ? 1 : 0)) {
                        this.randomlyPlaceBlock(lllllllllllllIIlllIlIIIIIlIIlIlI, lllllllllllllIIlllIlIIIIIIllIIIl, lllllllllllllIIlllIlIIIIIlIIlIIl, 0.7f, Corridor.lIIlIIIlIIIlll[1], Corridor.lIIlIIIlIIIlll[0], lllllllllllllIIlllIlIIIIIIllIllI, Blocks.rail.getStateFromMeta(this.getMetadataWithOffset(Blocks.rail, Corridor.lIIlIIIlIIIlll[0])));
                    }
                    ++lllllllllllllIIlllIlIIIIIIllIllI;
                }
            }
            return Corridor.lIIlIIIlIIIlll[1] != 0;
        }
        
        public static StructureBoundingBox func_175814_a(final List<StructureComponent> lllllllllllllIIlllIlIIIIlIlIlIll, final Random lllllllllllllIIlllIlIIIIlIlIIIIl, final int lllllllllllllIIlllIlIIIIlIlIIIII, final int lllllllllllllIIlllIlIIIIlIIlllll, final int lllllllllllllIIlllIlIIIIlIlIIlll, final EnumFacing lllllllllllllIIlllIlIIIIlIlIIllI) {
            final StructureBoundingBox lllllllllllllIIlllIlIIIIlIlIIlIl = new StructureBoundingBox(lllllllllllllIIlllIlIIIIlIlIIIII, lllllllllllllIIlllIlIIIIlIIlllll, lllllllllllllIIlllIlIIIIlIlIIlll, lllllllllllllIIlllIlIIIIlIlIIIII, lllllllllllllIIlllIlIIIIlIIlllll + Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIlIlIIlll);
            int lllllllllllllIIlllIlIIIIlIlIIlII = lllllllllllllIIlllIlIIIIlIlIIIIl.nextInt(Corridor.lIIlIIIlIIIlll[3]) + Corridor.lIIlIIIlIIIlll[2];
            "".length();
            if (null != null) {
                return null;
            }
            while (!llIIlIlIlIllIII(lllllllllllllIIlllIlIIIIlIlIIlII)) {
                final int lllllllllllllIIlllIlIIIIlIlIIIll = lllllllllllllIIlllIlIIIIlIlIIlII * Corridor.lIIlIIIlIIIlll[5];
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIlllIlIIIIlIlIIllI.ordinal()]) {
                    case 3: {
                        lllllllllllllIIlllIlIIIIlIlIIlIl.maxX = lllllllllllllIIlllIlIIIIlIlIIIII + Corridor.lIIlIIIlIIIlll[2];
                        lllllllllllllIIlllIlIIIIlIlIIlIl.minZ = lllllllllllllIIlllIlIIIIlIlIIlll - (lllllllllllllIIlllIlIIIIlIlIIIll - Corridor.lIIlIIIlIIIlll[1]);
                        "".length();
                        if (-"  ".length() >= 0) {
                            return null;
                        }
                        break;
                    }
                    case 4: {
                        lllllllllllllIIlllIlIIIIlIlIIlIl.maxX = lllllllllllllIIlllIlIIIIlIlIIIII + Corridor.lIIlIIIlIIIlll[2];
                        lllllllllllllIIlllIlIIIIlIlIIlIl.maxZ = lllllllllllllIIlllIlIIIIlIlIIlll + (lllllllllllllIIlllIlIIIIlIlIIIll - Corridor.lIIlIIIlIIIlll[1]);
                        "".length();
                        if (-" ".length() == " ".length()) {
                            return null;
                        }
                        break;
                    }
                    case 5: {
                        lllllllllllllIIlllIlIIIIlIlIIlIl.minX = lllllllllllllIIlllIlIIIIlIlIIIII - (lllllllllllllIIlllIlIIIIlIlIIIll - Corridor.lIIlIIIlIIIlll[1]);
                        lllllllllllllIIlllIlIIIIlIlIIlIl.maxZ = lllllllllllllIIlllIlIIIIlIlIIlll + Corridor.lIIlIIIlIIIlll[2];
                        "".length();
                        if (null != null) {
                            return null;
                        }
                        break;
                    }
                    case 6: {
                        lllllllllllllIIlllIlIIIIlIlIIlIl.maxX = lllllllllllllIIlllIlIIIIlIlIIIII + (lllllllllllllIIlllIlIIIIlIlIIIll - Corridor.lIIlIIIlIIIlll[1]);
                        lllllllllllllIIlllIlIIIIlIlIIlIl.maxZ = lllllllllllllIIlllIlIIIIlIlIIlll + Corridor.lIIlIIIlIIIlll[2];
                        break;
                    }
                }
                if (llIIlIlIlIlIlll(StructureComponent.findIntersecting(lllllllllllllIIlllIlIIIIlIlIlIll, lllllllllllllIIlllIlIIIIlIlIIlIl))) {
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                    break;
                }
                else {
                    --lllllllllllllIIlllIlIIIIlIlIIlII;
                }
            }
            StructureBoundingBox structureBoundingBox;
            if (llIIlIlIlIllIIl(lllllllllllllIIlllIlIIIIlIlIIlII)) {
                structureBoundingBox = lllllllllllllIIlllIlIIIIlIlIIlIl;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            else {
                structureBoundingBox = null;
            }
            return structureBoundingBox;
        }
        
        private static String llIIlIlIlIlIIlI(final String lllllllllllllIIlllIIllllllllIllI, final String lllllllllllllIIlllIIllllllllIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIlllIIlllllllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIllllllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlllIIlllllllllIII = Cipher.getInstance("Blowfish");
                lllllllllllllIIlllIIlllllllllIII.init(Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIIlllllllllIIl);
                return new String(lllllllllllllIIlllIIlllllllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIllllllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllIIllllllllIlll) {
                lllllllllllllIIlllIIllllllllIlll.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIIlIlIlIllIIl(final int lllllllllllllIIlllIIllllllIIlIIl) {
            return lllllllllllllIIlllIIllllllIIlIIl > 0;
        }
        
        private static boolean llIIlIlIlIllllI(final int lllllllllllllIIlllIIllllllIllllI, final int lllllllllllllIIlllIIllllllIlllIl) {
            return lllllllllllllIIlllIIllllllIllllI > lllllllllllllIIlllIIllllllIlllIl;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIIlllIlIIIIlIIlIIII, final List<StructureComponent> lllllllllllllIIlllIlIIIIlIIIllll, final Random lllllllllllllIIlllIlIIIIlIIIIlII) {
            final int lllllllllllllIIlllIlIIIIlIIIllIl = this.getComponentType();
            final int lllllllllllllIIlllIlIIIIlIIIllII = lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[4]);
            if (llIIlIlIlIllIlI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        if (llIIlIlIlIllIll(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[1])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX, this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.minZ - Corridor.lIIlIIIlIIIlll[1], this.coordBaseMode, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if (" ".length() == 0) {
                                return;
                            }
                            break;
                        }
                        else if (llIIlIlIlIlllII(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[2])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX - Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.minZ, EnumFacing.WEST, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if ("   ".length() < "   ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.maxX + Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.minZ, EnumFacing.EAST, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (llIIlIlIlIllIll(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[1])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX, this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.maxZ + Corridor.lIIlIIIlIIIlll[1], this.coordBaseMode, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if ((0xA0 ^ 0xA4) < "   ".length()) {
                                return;
                            }
                            break;
                        }
                        else if (llIIlIlIlIlllII(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[2])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX - Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.maxZ - Corridor.lIIlIIIlIIIlll[3], EnumFacing.WEST, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if (((0x49 ^ 0x4) & ~(0x73 ^ 0x3E)) == " ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.maxX + Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.maxZ - Corridor.lIIlIIIlIIIlll[3], EnumFacing.EAST, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if ((0x89 ^ 0x8D) < 0) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if (llIIlIlIlIllIll(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[1])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX - Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.minZ, this.coordBaseMode, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if ((0x83 ^ 0x87) < 0) {
                                return;
                            }
                            break;
                        }
                        else if (llIIlIlIlIlllII(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[2])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX, this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.minZ - Corridor.lIIlIIIlIIIlll[1], EnumFacing.NORTH, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX, this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.maxZ + Corridor.lIIlIIIlIIIlll[1], EnumFacing.SOUTH, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (llIIlIlIlIllIll(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[1])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.maxX + Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.minZ, this.coordBaseMode, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else {
                            if (!llIIlIlIlIlllII(lllllllllllllIIlllIlIIIIlIIIllII, Corridor.lIIlIIIlIIIlll[2])) {
                                func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.maxX - Corridor.lIIlIIIlIIIlll[3], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.maxZ + Corridor.lIIlIIIlIIIlll[1], EnumFacing.SOUTH, lllllllllllllIIlllIlIIIIlIIIllIl);
                                "".length();
                                break;
                            }
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.maxX - Corridor.lIIlIIIlIIIlll[3], this.boundingBox.minY - Corridor.lIIlIIIlIIIlll[1] + lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[3]), this.boundingBox.minZ - Corridor.lIIlIIIlIIIlll[1], EnumFacing.NORTH, lllllllllllllIIlllIlIIIIlIIIllIl);
                            "".length();
                            "".length();
                            if ((164 + 83 - 123 + 57 ^ 132 + 110 - 66 + 1) < (0x23 ^ 0x49 ^ (0x68 ^ 0x6))) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            if (llIIlIlIlIlllIl(lllllllllllllIIlllIlIIIIlIIIllIl, Corridor.lIIlIIIlIIIlll[9])) {
                if (llIIlIlIlIlIllI(this.coordBaseMode, EnumFacing.NORTH) && llIIlIlIlIlIllI(this.coordBaseMode, EnumFacing.SOUTH)) {
                    int lllllllllllllIIlllIlIIIIlIIIlIll = this.boundingBox.minX + Corridor.lIIlIIIlIIIlll[3];
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    while (!llIIlIlIlIllllI(lllllllllllllIIlllIlIIIIlIIIlIll + Corridor.lIIlIIIlIIIlll[3], this.boundingBox.maxX)) {
                        final int lllllllllllllIIlllIlIIIIlIIIlIlI = lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[5]);
                        if (llIIlIlIlIlIlIl(lllllllllllllIIlllIlIIIIlIIIlIlI)) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, lllllllllllllIIlllIlIIIIlIIIlIll, this.boundingBox.minY, this.boundingBox.minZ - Corridor.lIIlIIIlIIIlll[1], EnumFacing.NORTH, lllllllllllllIIlllIlIIIIlIIIllIl + Corridor.lIIlIIIlIIIlll[1]);
                            "".length();
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return;
                            }
                        }
                        else if (llIIlIlIlIlllII(lllllllllllllIIlllIlIIIIlIIIlIlI, Corridor.lIIlIIIlIIIlll[1])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, lllllllllllllIIlllIlIIIIlIIIlIll, this.boundingBox.minY, this.boundingBox.maxZ + Corridor.lIIlIIIlIIIlll[1], EnumFacing.SOUTH, lllllllllllllIIlllIlIIIIlIIIllIl + Corridor.lIIlIIIlIIIlll[1]);
                            "".length();
                        }
                        lllllllllllllIIlllIlIIIIlIIIlIll += 5;
                    }
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    int lllllllllllllIIlllIlIIIIlIIIlIIl = this.boundingBox.minZ + Corridor.lIIlIIIlIIIlll[3];
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return;
                    }
                    while (!llIIlIlIlIllllI(lllllllllllllIIlllIlIIIIlIIIlIIl + Corridor.lIIlIIIlIIIlll[3], this.boundingBox.maxZ)) {
                        final int lllllllllllllIIlllIlIIIIlIIIlIII = lllllllllllllIIlllIlIIIIlIIIIlII.nextInt(Corridor.lIIlIIIlIIIlll[5]);
                        if (llIIlIlIlIlIlIl(lllllllllllllIIlllIlIIIIlIIIlIII)) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.minX - Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY, lllllllllllllIIlllIlIIIIlIIIlIIl, EnumFacing.WEST, lllllllllllllIIlllIlIIIIlIIIllIl + Corridor.lIIlIIIlIIIlll[1]);
                            "".length();
                            "".length();
                            if (-"   ".length() >= 0) {
                                return;
                            }
                        }
                        else if (llIIlIlIlIlllII(lllllllllllllIIlllIlIIIIlIIIlIII, Corridor.lIIlIIIlIIIlll[1])) {
                            func_175890_b(lllllllllllllIIlllIlIIIIlIIlIIII, lllllllllllllIIlllIlIIIIlIIIllll, lllllllllllllIIlllIlIIIIlIIIIlII, this.boundingBox.maxX + Corridor.lIIlIIIlIIIlll[1], this.boundingBox.minY, lllllllllllllIIlllIlIIIIlIIIlIIl, EnumFacing.EAST, lllllllllllllIIlllIlIIIIlIIIllIl + Corridor.lIIlIIIlIIIlll[1]);
                            "".length();
                        }
                        lllllllllllllIIlllIlIIIIlIIIlIIl += 5;
                    }
                }
            }
        }
        
        private static boolean llIIlIlIlIllIII(final int lllllllllllllIIlllIIllllllIIlIll) {
            return lllllllllllllIIlllIIllllllIIlIll <= 0;
        }
        
        private static String llIIlIlIlIlIIIl(final String lllllllllllllIIlllIlIIIIIIIllIIl, final String lllllllllllllIIlllIlIIIIIIIllIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlllIlIIIIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), Corridor.lIIlIIIlIIIlll[9]), "DES");
                final Cipher lllllllllllllIIlllIlIIIIIIIlllIl = Cipher.getInstance("DES");
                lllllllllllllIIlllIlIIIIIIIlllIl.init(Corridor.lIIlIIIlIIIlll[2], lllllllllllllIIlllIlIIIIIIIllllI);
                return new String(lllllllllllllIIlllIlIIIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIIIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllIlIIIIIIIlllII) {
                lllllllllllllIIlllIlIIIIIIIlllII.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIIlIlIlIlIllI(final Object lllllllllllllIIlllIIllllllIllIlI, final Object lllllllllllllIIlllIIllllllIllIIl) {
            return lllllllllllllIIlllIIllllllIllIlI != lllllllllllllIIlllIIllllllIllIIl;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Corridor.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (llIIlIlIlIllIlI($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final long lllllllllllllIIlllIlIIIIIIlIIIll = (Object)new int[EnumFacing.values().length];
            try {
                lllllllllllllIIlllIlIIIIIIlIIIll[EnumFacing.DOWN.ordinal()] = Corridor.lIIlIIIlIIIlll[1];
                "".length();
                if (((0x49 ^ 0x64) & ~(0x7D ^ 0x50)) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIIlllIlIIIIIIlIIIll[EnumFacing.EAST.ordinal()] = Corridor.lIIlIIIlIIIlll[6];
                "".length();
                if ((0xC7 ^ 0xC2) <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIIlllIlIIIIIIlIIIll[EnumFacing.NORTH.ordinal()] = Corridor.lIIlIIIlIIIlll[3];
                "".length();
                if (((0x2D ^ 0x1) & ~(0x6F ^ 0x43)) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIIlllIlIIIIIIlIIIll[EnumFacing.SOUTH.ordinal()] = Corridor.lIIlIIIlIIIlll[4];
                "".length();
                if (((144 + 128 - 129 + 11 ^ 122 + 105 - 99 + 20) & (0xB9 ^ 0x87 ^ (0x26 ^ 0x16) ^ -" ".length())) > (0x4 ^ 0x6D ^ (0x0 ^ 0x6D))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                lllllllllllllIIlllIlIIIIIIlIIIll[EnumFacing.UP.ordinal()] = Corridor.lIIlIIIlIIIlll[2];
                "".length();
                if ("  ".length() <= ((0xF0 ^ 0xB4) & ~(0x15 ^ 0x51))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                lllllllllllllIIlllIlIIIIIIlIIIll[EnumFacing.WEST.ordinal()] = Corridor.lIIlIIIlIIIlll[5];
                "".length();
                if (((85 + 113 - 142 + 73 ^ 3 + 94 - 66 + 102) & (0x3E ^ 0x0 ^ (0xB1 ^ 0x8B) ^ -" ".length())) < -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Corridor.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIlllIlIIIIIIlIIIll;
        }
        
        private static boolean llIIlIlIlIlllll(final int lllllllllllllIIlllIIllllllIIllll) {
            return lllllllllllllIIlllIIllllllIIllll != 0;
        }
        
        private static boolean llIIlIlIllIIIII(final Object lllllllllllllIIlllIIllllllIlIlII, final Object lllllllllllllIIlllIIllllllIlIIll) {
            return lllllllllllllIIlllIIllllllIlIlII == lllllllllllllIIlllIIllllllIlIIll;
        }
        
        public Corridor() {
        }
        
        private static void llIIlIlIlIlIlII() {
            (lIIlIIIlIIIlll = new int[13])[0] = ((0x0 ^ 0x3F) & ~(0xB ^ 0x34));
            Corridor.lIIlIIIlIIIlll[1] = " ".length();
            Corridor.lIIlIIIlIIIlll[2] = "  ".length();
            Corridor.lIIlIIIlIIIlll[3] = "   ".length();
            Corridor.lIIlIIIlIIIlll[4] = (0x44 ^ 0x39 ^ (0xC6 ^ 0xBF));
            Corridor.lIIlIIIlIIIlll[5] = (0x23 ^ 0x26);
            Corridor.lIIlIIIlIIIlll[6] = (0x3 ^ 0x5);
            Corridor.lIIlIIIlIIIlll[7] = (0x65 ^ 0x62);
            Corridor.lIIlIIIlIIIlll[8] = (0x66 ^ 0x71);
            Corridor.lIIlIIIlIIIlll[9] = (0x95 ^ 0x9D);
            Corridor.lIIlIIIlIIIlll[10] = (0xA7 ^ 0xC3);
            Corridor.lIIlIIIlIIIlll[11] = -" ".length();
            Corridor.lIIlIIIlIIIlll[12] = (0x7D ^ 0x74);
        }
        
        static {
            llIIlIlIlIlIlII();
            llIIlIlIlIlIIll();
        }
        
        private static boolean llIIlIlIlIlllII(final int lllllllllllllIIlllIIlllllllIlllI, final int lllllllllllllIIlllIIlllllllIllIl) {
            return lllllllllllllIIlllIIlllllllIlllI == lllllllllllllIIlllIIlllllllIllIl;
        }
        
        private static boolean llIIlIlIlIllIll(final int lllllllllllllIIlllIIlllllllIIIlI, final int lllllllllllllIIlllIIlllllllIIIIl) {
            return lllllllllllllIIlllIIlllllllIIIlI <= lllllllllllllIIlllIIlllllllIIIIl;
        }
        
        private static String llIIlIlIlIlIIII(String lllllllllllllIIlllIlIIIIIIIIIllI, final String lllllllllllllIIlllIlIIIIIIIIlIlI) {
            lllllllllllllIIlllIlIIIIIIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlIIIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlllIlIIIIIIIIlIIl = new StringBuilder();
            final char[] lllllllllllllIIlllIlIIIIIIIIlIII = lllllllllllllIIlllIlIIIIIIIIlIlI.toCharArray();
            int lllllllllllllIIlllIlIIIIIIIIIlll = Corridor.lIIlIIIlIIIlll[0];
            final Exception lllllllllllllIIlllIlIIIIIIIIIIIl = (Object)lllllllllllllIIlllIlIIIIIIIIIllI.toCharArray();
            final String lllllllllllllIIlllIlIIIIIIIIIIII = (String)lllllllllllllIIlllIlIIIIIIIIIIIl.length;
            short lllllllllllllIIlllIIllllllllllll = (short)Corridor.lIIlIIIlIIIlll[0];
            while (llIIlIlIlIlllIl(lllllllllllllIIlllIIllllllllllll, (int)lllllllllllllIIlllIlIIIIIIIIIIII)) {
                final char lllllllllllllIIlllIlIIIIIIIIllII = lllllllllllllIIlllIlIIIIIIIIIIIl[lllllllllllllIIlllIIllllllllllll];
                lllllllllllllIIlllIlIIIIIIIIlIIl.append((char)(lllllllllllllIIlllIlIIIIIIIIllII ^ lllllllllllllIIlllIlIIIIIIIIlIII[lllllllllllllIIlllIlIIIIIIIIIlll % lllllllllllllIIlllIlIIIIIIIIlIII.length]));
                "".length();
                ++lllllllllllllIIlllIlIIIIIIIIIlll;
                ++lllllllllllllIIlllIIllllllllllll;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlllIlIIIIIIIIlIIl);
        }
        
        private static boolean llIIlIlIlIlllIl(final int lllllllllllllIIlllIIlllllllIIllI, final int lllllllllllllIIlllIIlllllllIIlIl) {
            return lllllllllllllIIlllIIlllllllIIllI < lllllllllllllIIlllIIlllllllIIlIl;
        }
        
        private static boolean llIIlIlIlIlIlIl(final int lllllllllllllIIlllIIllllllIIllIl) {
            return lllllllllllllIIlllIIllllllIIllIl == 0;
        }
        
        private static boolean llIIlIlIlIllIlI(final Object lllllllllllllIIlllIIllllllIlIlll) {
            return lllllllllllllIIlllIIllllllIlIlll != null;
        }
        
        private static boolean llIIlIlIllIIIIl(final int lllllllllllllIIlllIIlllllllIlIlI, final int lllllllllllllIIlllIIlllllllIlIIl) {
            return lllllllllllllIIlllIIlllllllIlIlI >= lllllllllllllIIlllIIlllllllIlIIl;
        }
        
        public Corridor(final int lllllllllllllIIlllIlIIIIlIllllIl, final Random lllllllllllllIIlllIlIIIIlIllIlll, final StructureBoundingBox lllllllllllllIIlllIlIIIIlIllIllI, final EnumFacing lllllllllllllIIlllIlIIIIlIllIlIl) {
            super(lllllllllllllIIlllIlIIIIlIllllIl);
            this.coordBaseMode = lllllllllllllIIlllIlIIIIlIllIlIl;
            this.boundingBox = lllllllllllllIIlllIlIIIIlIllIllI;
            int hasRails;
            if (llIIlIlIlIlIlIl(lllllllllllllIIlllIlIIIIlIllIlll.nextInt(Corridor.lIIlIIIlIIIlll[3]))) {
                hasRails = Corridor.lIIlIIIlIIIlll[1];
                "".length();
                if ("   ".length() == (55 + 107 - 58 + 72 ^ 23 + 119 - 32 + 70)) {
                    throw null;
                }
            }
            else {
                hasRails = Corridor.lIIlIIIlIIIlll[0];
            }
            this.hasRails = (hasRails != 0);
            int hasSpiders;
            if (llIIlIlIlIlIlIl(this.hasRails ? 1 : 0) && llIIlIlIlIlIlIl(lllllllllllllIIlllIlIIIIlIllIlll.nextInt(Corridor.lIIlIIIlIIIlll[8]))) {
                hasSpiders = Corridor.lIIlIIIlIIIlll[1];
                "".length();
                if (-"  ".length() >= 0) {
                    throw null;
                }
            }
            else {
                hasSpiders = Corridor.lIIlIIIlIIIlll[0];
            }
            this.hasSpiders = (hasSpiders != 0);
            if (llIIlIlIlIlIllI(this.coordBaseMode, EnumFacing.NORTH) && llIIlIlIlIlIllI(this.coordBaseMode, EnumFacing.SOUTH)) {
                this.sectionCount = lllllllllllllIIlllIlIIIIlIllIllI.getXSize() / Corridor.lIIlIIIlIIIlll[5];
                "".length();
                if (-" ".length() == " ".length()) {
                    throw null;
                }
            }
            else {
                this.sectionCount = lllllllllllllIIlllIlIIIIlIllIllI.getZSize() / Corridor.lIIlIIIlIIIlll[5];
            }
        }
        
        private static boolean llIIlIlIlIlIlll(final Object lllllllllllllIIlllIIllllllIlIIIl) {
            return lllllllllllllIIlllIIllllllIlIIIl == null;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIlllIlIIIIllIIllII) {
            lllllllllllllIIlllIlIIIIllIIllII.setBoolean(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[0]], this.hasRails);
            lllllllllllllIIlllIlIIIIllIIllII.setBoolean(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[1]], this.hasSpiders);
            lllllllllllllIIlllIlIIIIllIIllII.setBoolean(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[2]], this.spawnerPlaced);
            lllllllllllllIIlllIlIIIIllIIllII.setInteger(Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[3]], this.sectionCount);
        }
        
        private static void llIIlIlIlIlIIll() {
            (lIIlIIIlIIIllI = new String[Corridor.lIIlIIIlIIIlll[12]])[Corridor.lIIlIIIlIIIlll[0]] = llIIlIlIlIlIIII("PDw=", "TNALg");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[1]] = llIIlIlIlIlIIIl("rfF7Vvyvn9o=", "IxmuJ");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[2]] = llIIlIlIlIlIIII("Az0X", "kMduA");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[3]] = llIIlIlIlIlIIlI("X14wBCloRtE=", "KAfOR");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[4]] = llIIlIlIlIlIIII("PSs=", "UYuxX");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[5]] = llIIlIlIlIlIIlI("U9W4K7v8EM8=", "afeFk");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[6]] = llIIlIlIlIlIIII("MR0x", "YmBSX");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[7]] = llIIlIlIlIlIIlI("ryx0O39ncgc=", "mPZch");
            Corridor.lIIlIIIlIIIllI[Corridor.lIIlIIIlIIIlll[9]] = llIIlIlIlIlIIlI("m+6c1WeRwAl6S1j6FtJxJQ==", "HXxTB");
        }
    }
    
    public static class Stairs extends StructureComponent
    {
        private static final /* synthetic */ int[] llIlIlIIllIIIl;
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Stairs.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIlIIlllllllIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final String llllllllllllIllIlIlIlIllllIIIIlI = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIllIlIlIlIllllIIIIlI[EnumFacing.DOWN.ordinal()] = Stairs.llIlIlIIllIIIl[3];
                "".length();
                if (" ".length() <= ((0x47 ^ 0x1B ^ 72 + 72 - 123 + 106) & (11 + 117 - 93 + 99 ^ 150 + 83 - 97 + 29 ^ -" ".length()))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIllIlIlIlIllllIIIIlI[EnumFacing.EAST.ordinal()] = Stairs.llIlIlIIllIIIl[7];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIllIlIlIlIllllIIIIlI[EnumFacing.NORTH.ordinal()] = Stairs.llIlIlIIllIIIl[8];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIllIlIlIlIllllIIIIlI[EnumFacing.SOUTH.ordinal()] = Stairs.llIlIlIIllIIIl[6];
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIllIlIlIlIllllIIIIlI[EnumFacing.UP.ordinal()] = Stairs.llIlIlIIllIIIl[1];
                "".length();
                if (((0x31 ^ 0x1E ^ (0x69 ^ 0x50)) & (0x60 ^ 0x44 ^ (0x47 ^ 0x75) ^ -" ".length())) > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIllIlIlIlIllllIIIIlI[EnumFacing.WEST.ordinal()] = Stairs.llIlIlIIllIIIl[0];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Stairs.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIllIlIlIlIllllIIIIlI;
        }
        
        private static boolean lIIlIIlllllllIlI(final int llllllllllllIllIlIlIlIlllIlllIll, final int llllllllllllIllIlIlIlIlllIlllIlI) {
            return llllllllllllIllIlIlIlIlllIlllIll < llllllllllllIllIlIlIlIlllIlllIlI;
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIllIlIlIlIllllIllIIl, final List<StructureComponent> llllllllllllIllIlIlIlIllllIlIIll, final Random llllllllllllIllIlIlIlIllllIlIlll) {
            final int llllllllllllIllIlIlIlIllllIlIllI = this.getComponentType();
            if (lIIlIIlllllllIII(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        func_175890_b(llllllllllllIllIlIlIlIllllIllIIl, llllllllllllIllIlIlIlIllllIlIIll, llllllllllllIllIlIlIlIllllIlIlll, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.minZ - Stairs.llIlIlIIllIIIl[3], EnumFacing.NORTH, llllllllllllIllIlIlIlIllllIlIllI);
                        "".length();
                        "".length();
                        if (-" ".length() > "   ".length()) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        func_175890_b(llllllllllllIllIlIlIlIllllIllIIl, llllllllllllIllIlIlIlIllllIlIIll, llllllllllllIllIlIlIlIllllIlIlll, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.maxZ + Stairs.llIlIlIIllIIIl[3], EnumFacing.SOUTH, llllllllllllIllIlIlIlIllllIlIllI);
                        "".length();
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    case 5: {
                        func_175890_b(llllllllllllIllIlIlIlIllllIllIIl, llllllllllllIllIlIlIlIllllIlIIll, llllllllllllIllIlIlIlIllllIlIlll, this.boundingBox.minX - Stairs.llIlIlIIllIIIl[3], this.boundingBox.minY, this.boundingBox.minZ, EnumFacing.WEST, llllllllllllIllIlIlIlIllllIlIllI);
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    case 6: {
                        func_175890_b(llllllllllllIllIlIlIlIllllIllIIl, llllllllllllIllIlIlIlIllllIlIIll, llllllllllllIllIlIlIlIllllIlIlll, this.boundingBox.maxX + Stairs.llIlIlIIllIIIl[3], this.boundingBox.minY, this.boundingBox.minZ, EnumFacing.EAST, llllllllllllIllIlIlIlIllllIlIllI);
                        "".length();
                        break;
                    }
                }
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIlIlIlIllllllIIll) {
        }
        
        private static boolean lIIlIIlllllllIIl(final int llllllllllllIllIlIlIlIlllIllIllI) {
            return llllllllllllIllIlIlIlIlllIllIllI != 0;
        }
        
        public Stairs(final int llllllllllllIllIlIlIlIlllllllllI, final Random llllllllllllIllIlIlIlIllllllllIl, final StructureBoundingBox llllllllllllIllIlIlIlIlllllllIII, final EnumFacing llllllllllllIllIlIlIlIllllllIlll) {
            super(llllllllllllIllIlIlIlIlllllllllI);
            this.coordBaseMode = llllllllllllIllIlIlIlIllllllIlll;
            this.boundingBox = llllllllllllIllIlIlIlIlllllllIII;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIlIlIlIllllIIlIll, final Random llllllllllllIllIlIlIlIllllIIlIlI, final StructureBoundingBox llllllllllllIllIlIlIlIllllIIlIIl) {
            if (lIIlIIlllllllIIl(this.isLiquidInStructureBoundingBox(llllllllllllIllIlIlIlIllllIIlIll, llllllllllllIllIlIlIlIllllIIlIIl) ? 1 : 0)) {
                return Stairs.llIlIlIIllIIIl[4] != 0;
            }
            this.fillWithBlocks(llllllllllllIllIlIlIlIllllIIlIll, llllllllllllIllIlIlIlIllllIIlIIl, Stairs.llIlIlIIllIIIl[4], Stairs.llIlIlIIllIIIl[0], Stairs.llIlIlIIllIIIl[4], Stairs.llIlIlIIllIIIl[1], Stairs.llIlIlIIllIIIl[5], Stairs.llIlIlIIllIIIl[3], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Stairs.llIlIlIIllIIIl[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIlIllllIIlIll, llllllllllllIllIlIlIlIllllIIlIIl, Stairs.llIlIlIIllIIIl[4], Stairs.llIlIlIIllIIIl[4], Stairs.llIlIlIIllIIIl[5], Stairs.llIlIlIIllIIIl[1], Stairs.llIlIlIIllIIIl[1], Stairs.llIlIlIIllIIIl[2], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Stairs.llIlIlIIllIIIl[4] != 0));
            int llllllllllllIllIlIlIlIllllIIlIII = Stairs.llIlIlIIllIIIl[4];
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0x1D ^ 0x56) & ~(0x4C ^ 0x7)) != 0x0;
            }
            while (!lIIlIIlllllllIll(llllllllllllIllIlIlIlIllllIIlIII, Stairs.llIlIlIIllIIIl[0])) {
                final int llllllllllllIllIlIllllIIlIIlIIII = Stairs.llIlIlIIllIIIl[4];
                final int n = Stairs.llIlIlIIllIIIl[0] - llllllllllllIllIlIlIlIllllIIlIII;
                int n2;
                if (lIIlIIlllllllIlI(llllllllllllIllIlIlIlIllllIIlIII, Stairs.llIlIlIIllIIIl[6])) {
                    n2 = Stairs.llIlIlIIllIIIl[3];
                    "".length();
                    if ((0x2F ^ 0x2B) < 0) {
                        return ((0x4C ^ 0x7E) & ~(0x1C ^ 0x2E)) != 0x0;
                    }
                }
                else {
                    n2 = Stairs.llIlIlIIllIIIl[4];
                }
                this.fillWithBlocks(llllllllllllIllIlIlIlIllllIIlIll, llllllllllllIllIlIlIlIllllIIlIIl, llllllllllllIllIlIllllIIlIIlIIII, n - n2, Stairs.llIlIlIIllIIIl[1] + llllllllllllIllIlIlIlIllllIIlIII, Stairs.llIlIlIIllIIIl[1], Stairs.llIlIlIIllIIIl[5] - llllllllllllIllIlIlIlIllllIIlIII, Stairs.llIlIlIIllIIIl[1] + llllllllllllIllIlIlIlIllllIIlIII, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Stairs.llIlIlIIllIIIl[4] != 0));
                ++llllllllllllIllIlIlIlIllllIIlIII;
            }
            return Stairs.llIlIlIIllIIIl[3] != 0;
        }
        
        private static void lIIlIIllllllIlll() {
            (llIlIlIIllIIIl = new int[9])[0] = (0x21 ^ 0x2E ^ (0xCD ^ 0xC7));
            Stairs.llIlIlIIllIIIl[1] = "  ".length();
            Stairs.llIlIlIIllIIIl[2] = (0x2 ^ 0xA);
            Stairs.llIlIlIIllIIIl[3] = " ".length();
            Stairs.llIlIlIIllIIIl[4] = ((0xC9 ^ 0xBB ^ (0x1D ^ 0x37)) & (48 + 160 + 7 + 34 ^ 16 + 114 - 57 + 88 ^ -" ".length()));
            Stairs.llIlIlIIllIIIl[5] = (15 + 98 + 19 + 21 ^ 73 + 79 - 0 + 6);
            Stairs.llIlIlIIllIIIl[6] = (0x0 ^ 0x54 ^ (0x6F ^ 0x3F));
            Stairs.llIlIlIIllIIIl[7] = (0x23 ^ 0xB ^ (0x65 ^ 0x4B));
            Stairs.llIlIlIIllIIIl[8] = "   ".length();
        }
        
        static {
            lIIlIIllllllIlll();
        }
        
        private static boolean lIIlIIlllllllIll(final int llllllllllllIllIlIlIlIlllIllllll, final int llllllllllllIllIlIlIlIlllIlllllI) {
            return llllllllllllIllIlIlIlIlllIllllll >= llllllllllllIllIlIlIlIlllIlllllI;
        }
        
        public Stairs() {
        }
        
        private static boolean lIIlIIlllllllIII(final Object llllllllllllIllIlIlIlIlllIlllIII) {
            return llllllllllllIllIlIlIlIlllIlllIII != null;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIlIlIlIllllllIlIl) {
        }
        
        public static StructureBoundingBox func_175812_a(final List<StructureComponent> llllllllllllIllIlIlIlIlllllIIlIl, final Random llllllllllllIllIlIlIlIlllllIlIll, final int llllllllllllIllIlIlIlIlllllIlIlI, final int llllllllllllIllIlIlIlIlllllIlIIl, final int llllllllllllIllIlIlIlIlllllIlIII, final EnumFacing llllllllllllIllIlIlIlIlllllIIIIl) {
            final StructureBoundingBox llllllllllllIllIlIlIlIlllllIIllI = new StructureBoundingBox(llllllllllllIllIlIlIlIlllllIlIlI, llllllllllllIllIlIlIlIlllllIlIIl - Stairs.llIlIlIIllIIIl[0], llllllllllllIllIlIlIlIlllllIlIII, llllllllllllIllIlIlIlIlllllIlIlI, llllllllllllIllIlIlIlIlllllIlIIl + Stairs.llIlIlIIllIIIl[1], llllllllllllIllIlIlIlIlllllIlIII);
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIllIlIlIlIlllllIIIIl.ordinal()]) {
                case 3: {
                    llllllllllllIllIlIlIlIlllllIIllI.maxX = llllllllllllIllIlIlIlIlllllIlIlI + Stairs.llIlIlIIllIIIl[1];
                    llllllllllllIllIlIlIlIlllllIIllI.minZ = llllllllllllIllIlIlIlIlllllIlIII - Stairs.llIlIlIIllIIIl[2];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 4: {
                    llllllllllllIllIlIlIlIlllllIIllI.maxX = llllllllllllIllIlIlIlIlllllIlIlI + Stairs.llIlIlIIllIIIl[1];
                    llllllllllllIllIlIlIlIlllllIIllI.maxZ = llllllllllllIllIlIlIlIlllllIlIII + Stairs.llIlIlIIllIIIl[2];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 5: {
                    llllllllllllIllIlIlIlIlllllIIllI.minX = llllllllllllIllIlIlIlIlllllIlIlI - Stairs.llIlIlIIllIIIl[2];
                    llllllllllllIllIlIlIlIlllllIIllI.maxZ = llllllllllllIllIlIlIlIlllllIlIII + Stairs.llIlIlIIllIIIl[1];
                    "".length();
                    if (-(46 + 29 + 11 + 92 ^ 0 + 50 - 46 + 178) > 0) {
                        return null;
                    }
                    break;
                }
                case 6: {
                    llllllllllllIllIlIlIlIlllllIIllI.maxX = llllllllllllIllIlIlIlIlllllIlIlI + Stairs.llIlIlIIllIIIl[2];
                    llllllllllllIllIlIlIlIlllllIIllI.maxZ = llllllllllllIllIlIlIlIlllllIlIII + Stairs.llIlIlIIllIIIl[1];
                    break;
                }
            }
            StructureBoundingBox structureBoundingBox;
            if (lIIlIIlllllllIII(StructureComponent.findIntersecting(llllllllllllIllIlIlIlIlllllIIlIl, llllllllllllIllIlIlIlIlllllIIllI))) {
                structureBoundingBox = null;
                "".length();
                if (((0x20 ^ 0xE) & ~(0x3D ^ 0x13)) >= "   ".length()) {
                    return null;
                }
            }
            else {
                structureBoundingBox = llllllllllllIllIlIlIlIlllllIIllI;
            }
            return structureBoundingBox;
        }
    }
}
