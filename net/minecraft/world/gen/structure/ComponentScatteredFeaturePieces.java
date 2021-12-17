// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockSandStone;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockPlanks;
import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.world.World;
import com.google.common.collect.Lists;
import net.minecraft.init.Items;
import net.minecraft.util.WeightedRandomChestContent;
import java.util.List;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ComponentScatteredFeaturePieces
{
    private static final /* synthetic */ String[] lIIlIIIllIIllI;
    private static final /* synthetic */ int[] lIIlIIIllIlIll;
    
    private static String llIIlIllIllIllI(String lllllllllllllIIlllIIlIIIlIIllIII, final String lllllllllllllIIlllIIlIIIlIlIIIII) {
        lllllllllllllIIlllIIlIIIlIIllIII = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIlIIIlIIllllI = new StringBuilder();
        final char[] lllllllllllllIIlllIIlIIIlIIlllII = lllllllllllllIIlllIIlIIIlIlIIIII.toCharArray();
        int lllllllllllllIIlllIIlIIIlIIllIlI = ComponentScatteredFeaturePieces.lIIlIIIllIlIll[0];
        final short lllllllllllllIIlllIIlIIIlIIIllll = (Object)lllllllllllllIIlllIIlIIIlIIllIII.toCharArray();
        final double lllllllllllllIIlllIIlIIIlIIIlllI = lllllllllllllIIlllIIlIIIlIIIllll.length;
        int lllllllllllllIIlllIIlIIIlIIIllIl = ComponentScatteredFeaturePieces.lIIlIIIllIlIll[0];
        while (llIIlIlllIIIIII(lllllllllllllIIlllIIlIIIlIIIllIl, (int)lllllllllllllIIlllIIlIIIlIIIlllI)) {
            final char lllllllllllllIIlllIIlIIIlIlIIIll = lllllllllllllIIlllIIlIIIlIIIllll[lllllllllllllIIlllIIlIIIlIIIllIl];
            lllllllllllllIIlllIIlIIIlIIllllI.append((char)(lllllllllllllIIlllIIlIIIlIlIIIll ^ lllllllllllllIIlllIIlIIIlIIlllII[lllllllllllllIIlllIIlIIIlIIllIlI % lllllllllllllIIlllIIlIIIlIIlllII.length]));
            "".length();
            ++lllllllllllllIIlllIIlIIIlIIllIlI;
            ++lllllllllllllIIlllIIlIIIlIIIllIl;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIlIIIlIIllllI);
    }
    
    private static void llIIlIllIlllllI() {
        (lIIlIIIllIlIll = new int[5])[0] = ((0x73 ^ 0x30) & ~(0xEE ^ 0xAD));
        ComponentScatteredFeaturePieces.lIIlIIIllIlIll[1] = " ".length();
        ComponentScatteredFeaturePieces.lIIlIIIllIlIll[2] = "  ".length();
        ComponentScatteredFeaturePieces.lIIlIIIllIlIll[3] = "   ".length();
        ComponentScatteredFeaturePieces.lIIlIIIllIlIll[4] = (83 + 152 - 215 + 150 ^ 152 + 22 - 62 + 50);
    }
    
    private static void llIIlIllIlllIlI() {
        (lIIlIIIllIIllI = new String[ComponentScatteredFeaturePieces.lIIlIIIllIlIll[3]])[ComponentScatteredFeaturePieces.lIIlIIIllIlIll[0]] = llIIlIllIllIIIl("IVPmRhJCrJ0=", "cMPdh");
        ComponentScatteredFeaturePieces.lIIlIIIllIIllI[ComponentScatteredFeaturePieces.lIIlIIIllIlIll[1]] = llIIlIllIllIllI("AgIkAA==", "VgnPT");
        ComponentScatteredFeaturePieces.lIIlIIIllIIllI[ComponentScatteredFeaturePieces.lIIlIIIllIlIll[2]] = llIIlIllIlllIII("qKPM0+vTr1o=", "ZXOeg");
    }
    
    public static void registerScatteredFeaturePieces() {
        MapGenStructureIO.registerStructureComponent(DesertPyramid.class, ComponentScatteredFeaturePieces.lIIlIIIllIIllI[ComponentScatteredFeaturePieces.lIIlIIIllIlIll[0]]);
        MapGenStructureIO.registerStructureComponent(JunglePyramid.class, ComponentScatteredFeaturePieces.lIIlIIIllIIllI[ComponentScatteredFeaturePieces.lIIlIIIllIlIll[1]]);
        MapGenStructureIO.registerStructureComponent(SwampHut.class, ComponentScatteredFeaturePieces.lIIlIIIllIIllI[ComponentScatteredFeaturePieces.lIIlIIIllIlIll[2]]);
    }
    
    private static boolean llIIlIlllIIIIII(final int lllllllllllllIIlllIIlIIIIlllIlIl, final int lllllllllllllIIlllIIlIIIIlllIlII) {
        return lllllllllllllIIlllIIlIIIIlllIlIl < lllllllllllllIIlllIIlIIIIlllIlII;
    }
    
    private static String llIIlIllIlllIII(final String lllllllllllllIIlllIIlIIIlIllllll, final String lllllllllllllIIlllIIlIIIlIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIIIllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIIIlIllllIl.getBytes(StandardCharsets.UTF_8)), ComponentScatteredFeaturePieces.lIIlIIIllIlIll[4]), "DES");
            final Cipher lllllllllllllIIlllIIlIIIllIIlIII = Cipher.getInstance("DES");
            lllllllllllllIIlllIIlIIIllIIlIII.init(ComponentScatteredFeaturePieces.lIIlIIIllIlIll[2], lllllllllllllIIlllIIlIIIllIIlIlI);
            return new String(lllllllllllllIIlllIIlIIIllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIIIllIIIllI) {
            lllllllllllllIIlllIIlIIIllIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIllIllIIIl(final String lllllllllllllIIlllIIlIIIIlllllIl, final String lllllllllllllIIlllIIlIIIIllllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIIIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIIIIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIlIIIIlllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIlIIIIlllllll.init(ComponentScatteredFeaturePieces.lIIlIIIllIlIll[2], lllllllllllllIIlllIIlIIIlIIIIIII);
            return new String(lllllllllllllIIlllIIlIIIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIIIIllllllI) {
            lllllllllllllIIlllIIlIIIIllllllI.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIlIllIlllllI();
        llIIlIllIlllIlI();
    }
    
    public static class JunglePyramid extends Feature
    {
        private /* synthetic */ boolean field_74946_k;
        private /* synthetic */ boolean field_74947_h;
        private /* synthetic */ boolean field_74945_j;
        private static final /* synthetic */ String[] llIIIlIIlllIII;
        private static /* synthetic */ Stones junglePyramidsRandomScatteredStones;
        private /* synthetic */ boolean field_74948_i;
        private static final /* synthetic */ List<WeightedRandomChestContent> field_175815_j;
        private static final /* synthetic */ int[] llIIIlIIllllII;
        private static final /* synthetic */ List<WeightedRandomChestContent> field_175816_i;
        
        private static boolean lIIIlIIlIIlIlllI(final int llllllllllllIlllIlIlllIllIIIlllI, final int llllllllllllIlllIlIlllIllIIIllIl) {
            return llllllllllllIlllIlIlllIllIIIlllI > llllllllllllIlllIlIlllIllIIIllIl;
        }
        
        public JunglePyramid() {
        }
        
        private static boolean lIIIlIIlIIlIllIl(final int llllllllllllIlllIlIlllIllIIIlIll) {
            return llllllllllllIlllIlIlllIllIIIlIll == 0;
        }
        
        static {
            lIIIlIIlIIlIlIll();
            lIIIlIIlIIIlllll();
            final WeightedRandomChestContent[] array = new WeightedRandomChestContent[JunglePyramid.llIIIlIIllllII[0]];
            array[JunglePyramid.llIIIlIIllllII[1]] = new WeightedRandomChestContent(Items.diamond, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[3]);
            array[JunglePyramid.llIIIlIIllllII[2]] = new WeightedRandomChestContent(Items.iron_ingot, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[0]);
            array[JunglePyramid.llIIIlIIllllII[5]] = new WeightedRandomChestContent(Items.gold_ingot, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[7]);
            array[JunglePyramid.llIIIlIIllllII[3]] = new WeightedRandomChestContent(Items.emerald, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[5]);
            array[JunglePyramid.llIIIlIIllllII[8]] = new WeightedRandomChestContent(Items.bone, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[10]);
            array[JunglePyramid.llIIIlIIllllII[4]] = new WeightedRandomChestContent(Items.rotten_flesh, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[11]);
            array[JunglePyramid.llIIIlIIllllII[9]] = new WeightedRandomChestContent(Items.saddle, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3]);
            array[JunglePyramid.llIIIlIIllllII[6]] = new WeightedRandomChestContent(Items.iron_horse_armor, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[2]);
            array[JunglePyramid.llIIIlIIllllII[12]] = new WeightedRandomChestContent(Items.golden_horse_armor, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[2]);
            array[JunglePyramid.llIIIlIIllllII[13]] = new WeightedRandomChestContent(Items.diamond_horse_armor, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[2]);
            field_175816_i = Lists.newArrayList((Object[])array);
            final WeightedRandomChestContent[] array2 = new WeightedRandomChestContent[JunglePyramid.llIIIlIIllllII[2]];
            array2[JunglePyramid.llIIIlIIllllII[1]] = new WeightedRandomChestContent(Items.arrow, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[14]);
            field_175815_j = Lists.newArrayList((Object[])array2);
            JunglePyramid.junglePyramidsRandomScatteredStones = new Stones(null);
        }
        
        private static String lIIIlIIlIIIllllI(String llllllllllllIlllIlIlllIllIlIlllI, final String llllllllllllIlllIlIlllIllIlIllIl) {
            llllllllllllIlllIlIlllIllIlIlllI = new String(Base64.getDecoder().decode(llllllllllllIlllIlIlllIllIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIlIlllIllIllIIIl = new StringBuilder();
            final char[] llllllllllllIlllIlIlllIllIllIIII = llllllllllllIlllIlIlllIllIlIllIl.toCharArray();
            int llllllllllllIlllIlIlllIllIlIllll = JunglePyramid.llIIIlIIllllII[1];
            final Exception llllllllllllIlllIlIlllIllIlIlIIl = (Object)llllllllllllIlllIlIlllIllIlIlllI.toCharArray();
            final byte llllllllllllIlllIlIlllIllIlIlIII = (byte)llllllllllllIlllIlIlllIllIlIlIIl.length;
            Exception llllllllllllIlllIlIlllIllIlIIlll = (Exception)JunglePyramid.llIIIlIIllllII[1];
            while (lIIIlIIlIIllIIII((int)llllllllllllIlllIlIlllIllIlIIlll, llllllllllllIlllIlIlllIllIlIlIII)) {
                final char llllllllllllIlllIlIlllIllIllIlII = llllllllllllIlllIlIlllIllIlIlIIl[llllllllllllIlllIlIlllIllIlIIlll];
                llllllllllllIlllIlIlllIllIllIIIl.append((char)(llllllllllllIlllIlIlllIllIllIlII ^ llllllllllllIlllIlIlllIllIllIIII[llllllllllllIlllIlIlllIllIlIllll % llllllllllllIlllIlIlllIllIllIIII.length]));
                "".length();
                ++llllllllllllIlllIlIlllIllIlIllll;
                ++llllllllllllIlllIlIlllIllIlIIlll;
                "".length();
                if (-" ".length() >= " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIlIlllIllIllIIIl);
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIlIlllIlllIlIIll, final Random llllllllllllIlllIlIlllIllllIIIII, final StructureBoundingBox llllllllllllIlllIlIlllIlllIlllll) {
            if (lIIIlIIlIIlIllIl(this.func_74935_a(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[1]) ? 1 : 0)) {
                return JunglePyramid.llIIIlIIllllII[1] != 0;
            }
            final int llllllllllllIlllIlIlllIlllIllllI = this.getMetadataWithOffset(Blocks.stone_stairs, JunglePyramid.llIIIlIIllllII[3]);
            final int llllllllllllIlllIlIlllIlllIlllIl = this.getMetadataWithOffset(Blocks.stone_stairs, JunglePyramid.llIIIlIIllllII[5]);
            final int llllllllllllIlllIlIlllIlllIlllII = this.getMetadataWithOffset(Blocks.stone_stairs, JunglePyramid.llIIIlIIllllII[1]);
            final int llllllllllllIlllIlIlllIlllIllIll = this.getMetadataWithOffset(Blocks.stone_stairs, JunglePyramid.llIIIlIIllllII[2]);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[17], JunglePyramid.llIIIlIIllllII[1], this.scatteredFeatureSizeX - JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[1], this.scatteredFeatureSizeZ - JunglePyramid.llIIIlIIllllII[2], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[5], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[16], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[16], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[18], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[18], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[2], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[19], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[19], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[16], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[16], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[16], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[16], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[18], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[0], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[18]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[13]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[16]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[13]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[12]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[5]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[16], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[16]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[2]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[19], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[19]);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.air.getDefaultState(), JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.air.getDefaultState(), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.air.getDefaultState(), JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.air.getDefaultState(), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIlllll);
            int llllllllllllIlllIlIlllIlllIllIlI = JunglePyramid.llIIIlIIllllII[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x8 ^ 0x5F) & ~(0x58 ^ 0xF)) != 0x0;
            }
            while (!lIIIlIIlIIlIlllI(llllllllllllIlllIlIlllIlllIllIlI, JunglePyramid.llIIIlIIllllII[20])) {
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIllIlI, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIllIlI, (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIllIlI, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIllIlI, (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIllIlI, JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIllIlI, (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIllIlI, JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIllIlI, (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                llllllllllllIlllIlIlllIlllIllIlI += 14;
            }
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[1], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            int llllllllllllIlllIlIlllIlllIllIIl = JunglePyramid.llIIIlIIllllII[1];
            "".length();
            if (null != null) {
                return ((0xBF ^ 0xB8) & ~(0x5E ^ 0x59)) != 0x0;
            }
            while (!lIIIlIIlIIlIlllI(llllllllllllIlllIlIlllIlllIllIIl, JunglePyramid.llIIIlIIllllII[18])) {
                int llllllllllllIlllIlIlllIlllIllIII = JunglePyramid.llIIIlIIllllII[5];
                "".length();
                if (((0xC ^ 0x50) & ~(0xF1 ^ 0xAD)) != 0x0) {
                    return ((0x45 ^ 0x65) & ~(0xE4 ^ 0xC4)) != 0x0;
                }
                while (!lIIIlIIlIIlIlllI(llllllllllllIlllIlIlllIlllIllIII, JunglePyramid.llIIIlIIllllII[16])) {
                    this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, llllllllllllIlllIlIlllIlllIllIIl, JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIllIII, llllllllllllIlllIlIlllIlllIllIIl, JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIllIII, (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                    llllllllllllIlllIlIlllIlllIllIII += 2;
                }
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, llllllllllllIlllIlIlllIlllIllIIl, JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIllIIl, JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[4], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, llllllllllllIlllIlIlllIlllIllIIl, JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIllIIl, JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[13], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                llllllllllllIlllIlIlllIlllIllIIl += 11;
            }
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[5], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[5], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[16], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[16], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[16], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[16], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[8], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[8], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[0], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[0], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[6], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[9], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[9], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIlllIl), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIlllIl), JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[1], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[1], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[1], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[1], JunglePyramid.llIIIlIIllllII[1], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[0], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllllI), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[0], llllllllllllIlllIlIlllIlllIlllll);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[13], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[13], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[0], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[4], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIlllII), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIllIll), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            int llllllllllllIlllIlIlllIlllIlIlll = JunglePyramid.llIIIlIIllllII[1];
            "".length();
            if (null != null) {
                return ((0xC9 ^ 0x99) & ~(0xC ^ 0x5C) & ~((0x8 ^ 0x6) & ~(0x10 ^ 0x1E))) != 0x0;
            }
            while (!lIIIlIIlIIlIllll(llllllllllllIlllIlIlllIlllIlIlll, JunglePyramid.llIIIlIIllllII[8])) {
                this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIlllIl), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[1] - llllllllllllIlllIlIlllIlllIlIlll, JunglePyramid.llIIIlIIllllII[9] + llllllllllllIlllIlIlllIlllIlIlll, llllllllllllIlllIlIlllIlllIlllll);
                this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stone_stairs.getStateFromMeta(llllllllllllIlllIlIlllIlllIlllIl), JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[1] - llllllllllllIlllIlIlllIlllIlIlll, JunglePyramid.llIIIlIIllllII[9] + llllllllllllIlllIlIlllIlllIlIlll, llllllllllllIlllIlIlllIlllIlllll);
                this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[1] - llllllllllllIlllIlIlllIlllIlIlll, JunglePyramid.llIIIlIIllllII[6] + llllllllllllIlllIlIlllIlllIlIlll, JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[1] - llllllllllllIlllIlIlllIlllIlIlll, JunglePyramid.llIIIlIIllllII[13] + llllllllllllIlllIlIlllIlllIlIlll);
                ++llllllllllllIlllIlIlllIlllIlIlll;
            }
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[16], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[19]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[19]);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[4]);
            int llllllllllllIlllIlIlllIlllIlIllI = JunglePyramid.llIIIlIIllllII[2];
            "".length();
            if ("   ".length() < 0) {
                return ((0x9F ^ 0xB2) & ~(0x93 ^ 0xBE)) != 0x0;
            }
            while (!lIIIlIIlIIlIlllI(llllllllllllIlllIlIlllIlllIlIllI, JunglePyramid.llIIIlIIllllII[19])) {
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[21], llllllllllllIlllIlIlllIlllIlIllI, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[23], llllllllllllIlllIlIlllIlllIlIllI, (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                llllllllllllIlllIlIlllIlllIlIllI += 2;
            }
            int llllllllllllIlllIlIlllIlllIlIlIl = JunglePyramid.llIIIlIIllllII[5];
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0x34 ^ 0x62 ^ (0x7F ^ 0x7B)) & (9 + 159 + 15 + 19 ^ 103 + 134 - 221 + 136 ^ -" ".length())) != 0x0;
            }
            while (!lIIIlIIlIIlIlllI(llllllllllllIlllIlIlllIlllIlIlIl, JunglePyramid.llIIIlIIllllII[16])) {
                this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[22], llllllllllllIlllIlIlllIlllIlIlIl, JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[22], llllllllllllIlllIlIlllIlllIlIlIl, (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
                llllllllllllIlllIlIlllIlllIlIlIl += 2;
            }
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[2], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[2], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[2], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire_hook.getStateFromMeta(this.getMetadataWithOffset(Blocks.tripwire_hook, EnumFacing.EAST.getHorizontalIndex())).withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire_hook.getStateFromMeta(this.getMetadataWithOffset(Blocks.tripwire_hook, EnumFacing.WEST.getHorizontalIndex())).withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWire.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[5], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWire.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[6], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[9], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[3], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[5], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], llllllllllllIlllIlIlllIlllIlllll);
            if (lIIIlIIlIIlIllIl(this.field_74945_j ? 1 : 0)) {
                this.field_74945_j = this.generateDispenserContents(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[2], EnumFacing.NORTH.getIndex(), JunglePyramid.field_175815_j, JunglePyramid.llIIIlIIllllII[5]);
            }
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.vine.getStateFromMeta(JunglePyramid.llIIIlIIllllII[7]), JunglePyramid.llIIIlIIllllII[3], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[5], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire_hook.getStateFromMeta(this.getMetadataWithOffset(Blocks.tripwire_hook, EnumFacing.NORTH.getHorizontalIndex())).withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire_hook.getStateFromMeta(this.getMetadataWithOffset(Blocks.tripwire_hook, EnumFacing.SOUTH.getHorizontalIndex())).withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWire.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[5], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWire.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[3], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.tripwire.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWire.ATTACHED, (boolean)(JunglePyramid.llIIIlIIllllII[2] != 0)), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[9], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[9], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[8], llllllllllllIlllIlIlllIlllIlllll);
            if (lIIIlIIlIIlIllIl(this.field_74946_k ? 1 : 0)) {
                this.field_74946_k = this.generateDispenserContents(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[3], EnumFacing.WEST.getIndex(), JunglePyramid.field_175815_j, JunglePyramid.llIIIlIIllllII[5]);
            }
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.vine.getStateFromMeta(JunglePyramid.llIIIlIIllllII[7]), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[3], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.vine.getStateFromMeta(JunglePyramid.llIIIlIIllllII[7]), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[3], llllllllllllIlllIlIlllIlllIlllll);
            if (lIIIlIIlIIlIllIl(this.field_74947_h ? 1 : 0)) {
                final int llllllllllllIllIlIlllIlllIIIIIIl = JunglePyramid.llIIIlIIllllII[12];
                final int llllllllllllIllIlIlllIllIlllIlII = JunglePyramid.llIIIlIIllllII[21];
                final int llllllllllllIllIlIlllIllIlllllll = JunglePyramid.llIIIlIIllllII[3];
                final List<WeightedRandomChestContent> field_175816_i = JunglePyramid.field_175816_i;
                final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl = new WeightedRandomChestContent[JunglePyramid.llIIIlIIllllII[2]];
                llllllllllllIlIlllIIlllIllIIIlIl[JunglePyramid.llIIIlIIllllII[1]] = Items.enchanted_book.getRandom(llllllllllllIlllIlIlllIllllIIIII);
                this.field_74947_h = this.generateChestContents(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, llllllllllllIlllIlIlllIllllIIIII, llllllllllllIllIlIlllIlllIIIIIIl, llllllllllllIllIlIlllIllIlllIlII, llllllllllllIllIlIlllIllIlllllll, WeightedRandomChestContent.func_177629_a(field_175816_i, llllllllllllIlIlllIIlllIllIIIlIl), JunglePyramid.llIIIlIIllllII[5] + llllllllllllIlllIlIlllIllllIIIII.nextInt(JunglePyramid.llIIIlIIllllII[4]));
            }
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[5], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[2], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[8], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[4], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[9], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[6], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[4], llllllllllllIlllIlIlllIlllIlllll);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[2], JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[4], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithAir(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[0]);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stonebrick.getStateFromMeta(BlockStoneBrick.CHISELED_META), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[18], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stonebrick.getStateFromMeta(BlockStoneBrick.CHISELED_META), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[18], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.stonebrick.getStateFromMeta(BlockStoneBrick.CHISELED_META), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[18], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.lever.getStateFromMeta(BlockLever.getMetadataForFacing(EnumFacing.getFront(this.getMetadataWithOffset(Blocks.lever, EnumFacing.NORTH.getIndex())))), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[16], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.lever.getStateFromMeta(BlockLever.getMetadataForFacing(EnumFacing.getFront(this.getMetadataWithOffset(Blocks.lever, EnumFacing.NORTH.getIndex())))), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[16], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.lever.getStateFromMeta(BlockLever.getMetadataForFacing(EnumFacing.getFront(this.getMetadataWithOffset(Blocks.lever, EnumFacing.NORTH.getIndex())))), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[16], llllllllllllIlllIlIlllIlllIlllll);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[0], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[21], JunglePyramid.llIIIlIIllllII[0], (boolean)(JunglePyramid.llIIIlIIllllII[1] != 0), llllllllllllIlllIlIlllIllllIIIII, JunglePyramid.junglePyramidsRandomScatteredStones);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.mossy_cobblestone.getDefaultState(), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[12], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[0], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.redstone_wire.getDefaultState(), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[13], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.sticky_piston.getStateFromMeta(EnumFacing.UP.getIndex()), JunglePyramid.llIIIlIIllllII[13], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.sticky_piston.getStateFromMeta(this.getMetadataWithOffset(Blocks.sticky_piston, EnumFacing.WEST.getIndex())), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.sticky_piston.getStateFromMeta(this.getMetadataWithOffset(Blocks.sticky_piston, EnumFacing.WEST.getIndex())), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[22], JunglePyramid.llIIIlIIllllII[12], llllllllllllIlllIlIlllIlllIlllll);
            this.setBlockState(llllllllllllIlllIlIlllIlllIlIIll, Blocks.unpowered_repeater.getStateFromMeta(this.getMetadataWithOffset(Blocks.unpowered_repeater, EnumFacing.NORTH.getHorizontalIndex())), JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[23], JunglePyramid.llIIIlIIllllII[0], llllllllllllIlllIlIlllIlllIlllll);
            if (lIIIlIIlIIlIllIl(this.field_74948_i ? 1 : 0)) {
                final int llllllllllllIllIlIlllIlllIIIIIIl2 = JunglePyramid.llIIIlIIllllII[13];
                final int llllllllllllIllIlIlllIllIlllIlII2 = JunglePyramid.llIIIlIIllllII[21];
                final int llllllllllllIllIlIlllIllIlllllll2 = JunglePyramid.llIIIlIIllllII[0];
                final List<WeightedRandomChestContent> field_175816_i2 = JunglePyramid.field_175816_i;
                final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl2 = new WeightedRandomChestContent[JunglePyramid.llIIIlIIllllII[2]];
                llllllllllllIlIlllIIlllIllIIIlIl2[JunglePyramid.llIIIlIIllllII[1]] = Items.enchanted_book.getRandom(llllllllllllIlllIlIlllIllllIIIII);
                this.field_74948_i = this.generateChestContents(llllllllllllIlllIlIlllIlllIlIIll, llllllllllllIlllIlIlllIlllIlllll, llllllllllllIlllIlIlllIllllIIIII, llllllllllllIllIlIlllIlllIIIIIIl2, llllllllllllIllIlIlllIllIlllIlII2, llllllllllllIllIlIlllIllIlllllll2, WeightedRandomChestContent.func_177629_a(field_175816_i2, llllllllllllIlIlllIIlllIllIIIlIl2), JunglePyramid.llIIIlIIllllII[5] + llllllllllllIlllIlIlllIllllIIIII.nextInt(JunglePyramid.llIIIlIIllllII[4]));
            }
            return JunglePyramid.llIIIlIIllllII[2] != 0;
        }
        
        private static String lIIIlIIlIIIlllII(final String llllllllllllIlllIlIlllIllIIllllI, final String llllllllllllIlllIlIlllIllIIllIll) {
            try {
                final SecretKeySpec llllllllllllIlllIlIlllIllIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlllIllIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIlIlllIllIlIIIII = Cipher.getInstance("Blowfish");
                llllllllllllIlllIlIlllIllIlIIIII.init(JunglePyramid.llIIIlIIllllII[5], llllllllllllIlllIlIlllIllIlIIIIl);
                return new String(llllllllllllIlllIlIlllIllIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlllIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIlllIllIIlllll) {
                llllllllllllIlllIlIlllIllIIlllll.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIlllIlIlllIllllIllIl) {
            super.readStructureFromNBT(llllllllllllIlllIlIlllIllllIllIl);
            this.field_74947_h = llllllllllllIlllIlIlllIllllIllIl.getBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[8]]);
            this.field_74948_i = llllllllllllIlllIlIlllIllllIllIl.getBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[4]]);
            this.field_74945_j = llllllllllllIlllIlIlllIllllIllIl.getBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[9]]);
            this.field_74946_k = llllllllllllIlllIlIlllIllllIllIl.getBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[6]]);
        }
        
        private static void lIIIlIIlIIIlllll() {
            (llIIIlIIlllIII = new String[JunglePyramid.llIIIlIIllllII[12]])[JunglePyramid.llIIIlIIllllII[1]] = lIIIlIIlIIIlllII("ANvoqH4v6VwPk88T/wTn0Q==", "jtiQy");
            JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[2]] = lIIIlIIlIIIlllII("POjF5xrwm51Yyu4mK/BtR0R/jifWnAJm", "xrwpM");
            JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[5]] = lIIIlIIlIIIlllII("0C3oPAs2eYa2oqgMRfMqyw==", "VCjCE");
            JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[3]] = lIIIlIIlIIIlllIl("RmOHMs5GF+0xwPeU2b75Kw==", "zunVM");
            JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[8]] = lIIIlIIlIIIlllIl("DB8QCGOMti5W7TDyY5f1qQ==", "QCGhW");
            JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[4]] = lIIIlIIlIIIlllIl("sL8dIhz+2bHTmMDYW7CD5JKxKRF4h+X8", "aOiSS");
            JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[9]] = lIIIlIIlIIIllllI("ChkPLgweIRwsGUs=", "zunMi");
            JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[6]] = lIIIlIIlIIIlllII("tsMKrL4MjFer0qW+2m0CpQ==", "yjrbe");
        }
        
        private static void lIIIlIIlIIlIlIll() {
            (llIIIlIIllllII = new int[24])[0] = (0x68 ^ 0x62);
            JunglePyramid.llIIIlIIllllII[1] = ((129 + 93 - 154 + 79 ^ 93 + 49 - 141 + 142) & (0x1C ^ 0x64 ^ (0xE8 ^ 0x8C) ^ -" ".length()));
            JunglePyramid.llIIIlIIllllII[2] = " ".length();
            JunglePyramid.llIIIlIIllllII[3] = "   ".length();
            JunglePyramid.llIIIlIIllllII[4] = (0x9B ^ 0x9E);
            JunglePyramid.llIIIlIIllllII[5] = "  ".length();
            JunglePyramid.llIIIlIIllllII[6] = (0x11 ^ 0x16);
            JunglePyramid.llIIIlIIllllII[7] = (0x4 ^ 0xB);
            JunglePyramid.llIIIlIIllllII[8] = (0x2B ^ 0x61 ^ (0x6E ^ 0x20));
            JunglePyramid.llIIIlIIllllII[9] = (0x40 ^ 0x46);
            JunglePyramid.llIIIlIIllllII[10] = (0x61 ^ 0x2C ^ (0x7B ^ 0x22));
            JunglePyramid.llIIIlIIllllII[11] = (21 + 174 - 169 + 152 ^ 143 + 62 - 106 + 63);
            JunglePyramid.llIIIlIIllllII[12] = (0x46 ^ 0x4E);
            JunglePyramid.llIIIlIIllllII[13] = (25 + 27 - 25 + 108 ^ 86 + 92 - 112 + 76);
            JunglePyramid.llIIIlIIllllII[14] = (0x4F ^ 0x27 ^ (0x35 ^ 0x43));
            JunglePyramid.llIIIlIIllllII[15] = (0xFE ^ 0xBE);
            JunglePyramid.llIIIlIIllllII[16] = (0xF1 ^ 0x94 ^ (0xD6 ^ 0xBF));
            JunglePyramid.llIIIlIIllllII[17] = -(0xC0 ^ 0xC4);
            JunglePyramid.llIIIlIIllllII[18] = (0x39 ^ 0x32);
            JunglePyramid.llIIIlIIllllII[19] = (0x33 ^ 0x3E);
            JunglePyramid.llIIIlIIllllII[20] = (0x5 ^ 0xB);
            JunglePyramid.llIIIlIIllllII[21] = -"   ".length();
            JunglePyramid.llIIIlIIllllII[22] = -" ".length();
            JunglePyramid.llIIIlIIllllII[23] = -"  ".length();
        }
        
        private static boolean lIIIlIIlIIlIllll(final int llllllllllllIlllIlIlllIllIIlIllI, final int llllllllllllIlllIlIlllIllIIlIlIl) {
            return llllllllllllIlllIlIlllIllIIlIllI >= llllllllllllIlllIlIlllIllIIlIlIl;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIlllIlIlllIlllllIIll) {
            super.writeStructureToNBT(llllllllllllIlllIlIlllIlllllIIll);
            llllllllllllIlllIlIlllIlllllIIll.setBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[1]], this.field_74947_h);
            llllllllllllIlllIlIlllIlllllIIll.setBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[2]], this.field_74948_i);
            llllllllllllIlllIlIlllIlllllIIll.setBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[5]], this.field_74945_j);
            llllllllllllIlllIlIlllIlllllIIll.setBoolean(JunglePyramid.llIIIlIIlllIII[JunglePyramid.llIIIlIIllllII[3]], this.field_74946_k);
        }
        
        private static String lIIIlIIlIIIlllIl(final String llllllllllllIlllIlIlllIlllIIIIIl, final String llllllllllllIlllIlIlllIlllIIIIlI) {
            try {
                final SecretKeySpec llllllllllllIlllIlIlllIlllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlllIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), JunglePyramid.llIIIlIIllllII[12]), "DES");
                final Cipher llllllllllllIlllIlIlllIlllIIIlIl = Cipher.getInstance("DES");
                llllllllllllIlllIlIlllIlllIIIlIl.init(JunglePyramid.llIIIlIIllllII[5], llllllllllllIlllIlIlllIlllIIIllI);
                return new String(llllllllllllIlllIlIlllIlllIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlllIlllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIlllIlllIIIlII) {
                llllllllllllIlllIlIlllIlllIIIlII.printStackTrace();
                return null;
            }
        }
        
        public JunglePyramid(final Random llllllllllllIlllIlIlllIllllllIll, final int llllllllllllIlllIlIlllIllllllIlI, final int llllllllllllIlllIlIlllIlllllllIl) {
            super(llllllllllllIlllIlIlllIllllllIll, llllllllllllIlllIlIlllIllllllIlI, JunglePyramid.llIIIlIIllllII[15], llllllllllllIlllIlIlllIlllllllIl, JunglePyramid.llIIIlIIllllII[16], JunglePyramid.llIIIlIIllllII[0], JunglePyramid.llIIIlIIllllII[7]);
        }
        
        private static boolean lIIIlIIlIIllIIII(final int llllllllllllIlllIlIlllIllIIlIIlI, final int llllllllllllIlllIlIlllIllIIlIIIl) {
            return llllllllllllIlllIlIlllIllIIlIIlI < llllllllllllIlllIlIlllIllIIlIIIl;
        }
        
        static class Stones extends BlockSelector
        {
            private static int llllllIIlllIIIl(final float n, final float n2) {
                return fcmpg(n, n2);
            }
            
            private static boolean llllllIIlllIIlI(final int lllllllllllllIIIIIIIIIlIllIIlIll) {
                return lllllllllllllIIIIIIIIIlIllIIlIll < 0;
            }
            
            private Stones() {
            }
            
            @Override
            public void selectBlocks(final Random lllllllllllllIIIIIIIIIlIllIIllll, final int lllllllllllllIIIIIIIIIlIllIlIlII, final int lllllllllllllIIIIIIIIIlIllIlIIll, final int lllllllllllllIIIIIIIIIlIllIlIIlI, final boolean lllllllllllllIIIIIIIIIlIllIlIIIl) {
                if (llllllIIlllIIlI(llllllIIlllIIIl(lllllllllllllIIIIIIIIIlIllIIllll.nextFloat(), 0.4f))) {
                    this.blockstate = Blocks.cobblestone.getDefaultState();
                    "".length();
                    if ((0xF ^ 0x2B ^ (0xA4 ^ 0x84)) == 0x0) {
                        return;
                    }
                }
                else {
                    this.blockstate = Blocks.mossy_cobblestone.getDefaultState();
                }
            }
        }
    }
    
    abstract static class Feature extends StructureComponent
    {
        protected /* synthetic */ int field_74936_d;
        protected /* synthetic */ int scatteredFeatureSizeY;
        protected /* synthetic */ int scatteredFeatureSizeZ;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        protected /* synthetic */ int scatteredFeatureSizeX;
        private static final /* synthetic */ String[] lIIlllIIIIIIlI;
        private static final /* synthetic */ int[] lIIlllIIIIlIlI;
        
        private static String llIllIlIlIIIIII(final String lllllllllllllIIlIlIIIllIllllIllI, final String lllllllllllllIIlIlIIIllIllllIlll) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIIIllIlllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIllIllllIlll.getBytes(StandardCharsets.UTF_8)), Feature.lIIlllIIIIlIlI[10]), "DES");
                final Cipher lllllllllllllIIlIlIIIllIlllllIlI = Cipher.getInstance("DES");
                lllllllllllllIIlIlIIIllIlllllIlI.init(Feature.lIIlllIIIIlIlI[3], lllllllllllllIIlIlIIIllIlllllIll);
                return new String(lllllllllllllIIlIlIIIllIlllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIllIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIIIllIlllllIIl) {
                lllllllllllllIIlIlIIIllIlllllIIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIlIlIIIlllIIIlllll) {
            this.scatteredFeatureSizeX = lllllllllllllIIlIlIIIlllIIIlllll.getInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[5]]);
            this.scatteredFeatureSizeY = lllllllllllllIIlIlIIIlllIIIlllll.getInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[6]]);
            this.scatteredFeatureSizeZ = lllllllllllllIIlIlIIIlllIIIlllll.getInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[7]]);
            this.field_74936_d = lllllllllllllIIlIlIIIlllIIIlllll.getInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[8]]);
        }
        
        private static void llIllIlIlIIIIll() {
            (lIIlllIIIIIIlI = new String[Feature.lIIlllIIIIlIlI[10]])[Feature.lIIlllIIIIlIlI[1]] = llIllIlIlIIIIII("qqt06qSRRCU=", "BkQtr");
            Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[2]] = llIllIlIlIIIIIl("LhMsIzwS", "fvEDT");
            Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[3]] = llIllIlIlIIIIII("rAETC9SXg34=", "RzIfL");
            Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[4]] = llIllIlIlIIIIII("Ie1gikD6t3s=", "Lxfat");
            Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[5]] = llIllIlIlIIIIlI("0TQlYFC+bl4=", "FLuhR");
            Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[6]] = llIllIlIlIIIIII("DYtLTLFvx7A=", "dwudy");
            Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[7]] = llIllIlIlIIIIlI("z0jpDMEmhuY=", "auMJa");
            Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[8]] = llIllIlIlIIIIII("muOEn6VqX4E=", "oCBss");
        }
        
        protected boolean func_74935_a(final World lllllllllllllIIlIlIIIlllIIIIlIIl, final StructureBoundingBox lllllllllllllIIlIlIIIlllIIIIlIII, final int lllllllllllllIIlIlIIIlllIIIlIIII) {
            if (llIllIlIlIIlIIl(this.field_74936_d)) {
                return Feature.lIIlllIIIIlIlI[2] != 0;
            }
            int lllllllllllllIIlIlIIIlllIIIIllll = Feature.lIIlllIIIIlIlI[1];
            int lllllllllllllIIlIlIIIlllIIIIlllI = Feature.lIIlllIIIIlIlI[1];
            final BlockPos.MutableBlockPos lllllllllllllIIlIlIIIlllIIIIllIl = new BlockPos.MutableBlockPos();
            int lllllllllllllIIlIlIIIlllIIIIllII = this.boundingBox.minZ;
            "".length();
            if (-" ".length() > 0) {
                return ((0x46 ^ 0xE) & ~(0x8C ^ 0xC4)) != 0x0;
            }
            while (!llIllIlIlIIlIll(lllllllllllllIIlIlIIIlllIIIIllII, this.boundingBox.maxZ)) {
                int lllllllllllllIIlIlIIIlllIIIIlIll = this.boundingBox.minX;
                "".length();
                if (("  ".length() ^ (0x97 ^ 0x90)) == 0x0) {
                    return ((0xA0 ^ 0xB0 ^ (0x2F ^ 0x26)) & (29 + 110 - 44 + 52 ^ 46 + 104 - 128 + 116 ^ -" ".length())) != 0x0;
                }
                while (!llIllIlIlIIlIll(lllllllllllllIIlIlIIIlllIIIIlIll, this.boundingBox.maxX)) {
                    lllllllllllllIIlIlIIIlllIIIIllIl.func_181079_c(lllllllllllllIIlIlIIIlllIIIIlIll, Feature.lIIlllIIIIlIlI[9], lllllllllllllIIlIlIIIlllIIIIllII);
                    "".length();
                    if (llIllIlIlIIlIlI(lllllllllllllIIlIlIIIlllIIIIlIII.isVecInside(lllllllllllllIIlIlIIIlllIIIIllIl) ? 1 : 0)) {
                        lllllllllllllIIlIlIIIlllIIIIllll += Math.max(lllllllllllllIIlIlIIIlllIIIIlIIl.getTopSolidOrLiquidBlock(lllllllllllllIIlIlIIIlllIIIIllIl).getY(), lllllllllllllIIlIlIIIlllIIIIlIIl.provider.getAverageGroundLevel());
                        ++lllllllllllllIIlIlIIIlllIIIIlllI;
                    }
                    ++lllllllllllllIIlIlIIIlllIIIIlIll;
                }
                ++lllllllllllllIIlIlIIIlllIIIIllII;
            }
            if (llIllIlIlIIllII(lllllllllllllIIlIlIIIlllIIIIlllI)) {
                return Feature.lIIlllIIIIlIlI[1] != 0;
            }
            this.field_74936_d = lllllllllllllIIlIlIIIlllIIIIllll / lllllllllllllIIlIlIIIlllIIIIlllI;
            this.boundingBox.offset(Feature.lIIlllIIIIlIlI[1], this.field_74936_d - this.boundingBox.minY + lllllllllllllIIlIlIIIlllIIIlIIII, Feature.lIIlllIIIIlIlI[1]);
            return Feature.lIIlllIIIIlIlI[2] != 0;
        }
        
        private static boolean llIllIlIlIIlIlI(final int lllllllllllllIIlIlIIIllIllIIIIlI) {
            return lllllllllllllIIlIlIIIllIllIIIIlI != 0;
        }
        
        static {
            llIllIlIlIIlIII();
            llIllIlIlIIIIll();
        }
        
        protected Feature(final Random lllllllllllllIIlIlIIIlllIIllIlll, final int lllllllllllllIIlIlIIIlllIIlIlllI, final int lllllllllllllIIlIlIIIlllIIlIllIl, final int lllllllllllllIIlIlIIIlllIIlIllII, final int lllllllllllllIIlIlIIIlllIIlIlIll, final int lllllllllllllIIlIlIIIlllIIlIlIlI, final int lllllllllllllIIlIlIIIlllIIllIIIl) {
            super(Feature.lIIlllIIIIlIlI[1]);
            this.field_74936_d = Feature.lIIlllIIIIlIlI[0];
            this.scatteredFeatureSizeX = lllllllllllllIIlIlIIIlllIIlIlIll;
            this.scatteredFeatureSizeY = lllllllllllllIIlIlIIIlllIIlIlIlI;
            this.scatteredFeatureSizeZ = lllllllllllllIIlIlIIIlllIIllIIIl;
            this.coordBaseMode = EnumFacing.Plane.HORIZONTAL.random(lllllllllllllIIlIlIIIlllIIllIlll);
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                case 3:
                case 4: {
                    this.boundingBox = new StructureBoundingBox(lllllllllllllIIlIlIIIlllIIlIlllI, lllllllllllllIIlIlIIIlllIIlIllIl, lllllllllllllIIlIlIIIlllIIlIllII, lllllllllllllIIlIlIIIlllIIlIlllI + lllllllllllllIIlIlIIIlllIIlIlIll - Feature.lIIlllIIIIlIlI[2], lllllllllllllIIlIlIIIlllIIlIllIl + lllllllllllllIIlIlIIIlllIIlIlIlI - Feature.lIIlllIIIIlIlI[2], lllllllllllllIIlIlIIIlllIIlIllII + lllllllllllllIIlIlIIIlllIIllIIIl - Feature.lIIlllIIIIlIlI[2]);
                    "".length();
                    if (-(0x18 ^ 0x1C) >= 0) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.boundingBox = new StructureBoundingBox(lllllllllllllIIlIlIIIlllIIlIlllI, lllllllllllllIIlIlIIIlllIIlIllIl, lllllllllllllIIlIlIIIlllIIlIllII, lllllllllllllIIlIlIIIlllIIlIlllI + lllllllllllllIIlIlIIIlllIIllIIIl - Feature.lIIlllIIIIlIlI[2], lllllllllllllIIlIlIIIlllIIlIllIl + lllllllllllllIIlIlIIIlllIIlIlIlI - Feature.lIIlllIIIIlIlI[2], lllllllllllllIIlIlIIIlllIIlIllII + lllllllllllllIIlIlIIIlllIIlIlIll - Feature.lIIlllIIIIlIlI[2]);
                    break;
                }
            }
        }
        
        private static String llIllIlIlIIIIIl(String lllllllllllllIIlIlIIIllIlllIIIll, final String lllllllllllllIIlIlIIIllIlllIIIlI) {
            lllllllllllllIIlIlIIIllIlllIIIll = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIIllIlllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIIIllIlllIIllI = new StringBuilder();
            final char[] lllllllllllllIIlIlIIIllIlllIIlIl = lllllllllllllIIlIlIIIllIlllIIIlI.toCharArray();
            int lllllllllllllIIlIlIIIllIlllIIlII = Feature.lIIlllIIIIlIlI[1];
            final byte lllllllllllllIIlIlIIIllIllIllllI = (Object)lllllllllllllIIlIlIIIllIlllIIIll.toCharArray();
            final int lllllllllllllIIlIlIIIllIllIlllIl = lllllllllllllIIlIlIIIllIllIllllI.length;
            byte lllllllllllllIIlIlIIIllIllIlllII = (byte)Feature.lIIlllIIIIlIlI[1];
            while (llIllIlIlIlllII(lllllllllllllIIlIlIIIllIllIlllII, lllllllllllllIIlIlIIIllIllIlllIl)) {
                final char lllllllllllllIIlIlIIIllIlllIlIIl = lllllllllllllIIlIlIIIllIllIllllI[lllllllllllllIIlIlIIIllIllIlllII];
                lllllllllllllIIlIlIIIllIlllIIllI.append((char)(lllllllllllllIIlIlIIIllIlllIlIIl ^ lllllllllllllIIlIlIIIllIlllIIlIl[lllllllllllllIIlIlIIIllIlllIIlII % lllllllllllllIIlIlIIIllIlllIIlIl.length]));
                "".length();
                ++lllllllllllllIIlIlIIIllIlllIIlII;
                ++lllllllllllllIIlIlIIIllIllIlllII;
                "".length();
                if (((0xA5 ^ 0x8F) & ~(0x60 ^ 0x4A)) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIIIllIlllIIllI);
        }
        
        private static boolean llIllIlIlIIllII(final int lllllllllllllIIlIlIIIllIllIIIIII) {
            return lllllllllllllIIlIlIIIllIllIIIIII == 0;
        }
        
        private static boolean llIllIlIlIlllII(final int lllllllllllllIIlIlIIIllIllIIlIll, final int lllllllllllllIIlIlIIIllIllIIlIlI) {
            return lllllllllllllIIlIlIIIllIllIIlIll < lllllllllllllIIlIlIIIllIllIIlIlI;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Feature.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (llIllIlIlIIlllI($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final char lllllllllllllIIlIlIIIlllIIIIIIII = (Object)new int[EnumFacing.values().length];
            try {
                lllllllllllllIIlIlIIIlllIIIIIIII[EnumFacing.DOWN.ordinal()] = Feature.lIIlllIIIIlIlI[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIIIlllIIIIIIII[EnumFacing.EAST.ordinal()] = Feature.lIIlllIIIIlIlI[7];
                "".length();
                if ((0x3D ^ 0x39) == "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIIIlllIIIIIIII[EnumFacing.NORTH.ordinal()] = Feature.lIIlllIIIIlIlI[4];
                "".length();
                if ((0xB8 ^ 0xAD ^ (0xC ^ 0x1D)) <= ((3 + 114 - 107 + 128 ^ 26 + 72 - 71 + 161) & (132 + 241 - 249 + 120 ^ 136 + 131 - 155 + 82 ^ -" ".length()))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIIIlllIIIIIIII[EnumFacing.SOUTH.ordinal()] = Feature.lIIlllIIIIlIlI[5];
                "".length();
                if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIIIlllIIIIIIII[EnumFacing.UP.ordinal()] = Feature.lIIlllIIIIlIlI[3];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIIIlllIIIIIIII[EnumFacing.WEST.ordinal()] = Feature.lIIlllIIIIlIlI[6];
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Feature.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIlIlIIIlllIIIIIIII;
        }
        
        private static void llIllIlIlIIlIII() {
            (lIIlllIIIIlIlI = new int[11])[0] = -" ".length();
            Feature.lIIlllIIIIlIlI[1] = ((0x24 ^ 0x2B ^ (0xBF ^ 0x83)) & (0x3F ^ 0x57 ^ (0x59 ^ 0x2) ^ -" ".length()));
            Feature.lIIlllIIIIlIlI[2] = " ".length();
            Feature.lIIlllIIIIlIlI[3] = "  ".length();
            Feature.lIIlllIIIIlIlI[4] = "   ".length();
            Feature.lIIlllIIIIlIlI[5] = (0x8C ^ 0x85 ^ (0xB9 ^ 0xB4));
            Feature.lIIlllIIIIlIlI[6] = (92 + 44 - 21 + 24 ^ 17 + 56 + 6 + 63);
            Feature.lIIlllIIIIlIlI[7] = (0xA3 ^ 0xA5);
            Feature.lIIlllIIIIlIlI[8] = (16 + 132 - 64 + 98 ^ 164 + 80 - 210 + 143);
            Feature.lIIlllIIIIlIlI[9] = (0x2A ^ 0x6A);
            Feature.lIIlllIIIIlIlI[10] = (51 + 10 - 42 + 111 ^ 81 + 52 - 9 + 14);
        }
        
        private static boolean llIllIlIlIIlIIl(final int lllllllllllllIIlIlIIIllIlIlllllI) {
            return lllllllllllllIIlIlIIIllIlIlllllI >= 0;
        }
        
        private static boolean llIllIlIlIIlIll(final int lllllllllllllIIlIlIIIllIllIIIlll, final int lllllllllllllIIlIlIIIllIllIIIllI) {
            return lllllllllllllIIlIlIIIllIllIIIlll > lllllllllllllIIlIlIIIllIllIIIllI;
        }
        
        private static boolean llIllIlIlIIlllI(final Object lllllllllllllIIlIlIIIllIllIIIlII) {
            return lllllllllllllIIlIlIIIllIllIIIlII != null;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIlIlIIIlllIIlIIIll) {
            lllllllllllllIIlIlIIIlllIIlIIIll.setInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[1]], this.scatteredFeatureSizeX);
            lllllllllllllIIlIlIIIlllIIlIIIll.setInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[2]], this.scatteredFeatureSizeY);
            lllllllllllllIIlIlIIIlllIIlIIIll.setInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[3]], this.scatteredFeatureSizeZ);
            lllllllllllllIIlIlIIIlllIIlIIIll.setInteger(Feature.lIIlllIIIIIIlI[Feature.lIIlllIIIIlIlI[4]], this.field_74936_d);
        }
        
        public Feature() {
            this.field_74936_d = Feature.lIIlllIIIIlIlI[0];
        }
        
        private static String llIllIlIlIIIIlI(final String lllllllllllllIIlIlIIIllIllIlIIll, final String lllllllllllllIIlIlIIIllIllIlIIII) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIIIllIllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIllIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIIIllIllIlIlIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIIIllIllIlIlIl.init(Feature.lIIlllIIIIlIlI[3], lllllllllllllIIlIlIIIllIllIlIllI);
                return new String(lllllllllllllIIlIlIIIllIllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIllIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIIIllIllIlIlII) {
                lllllllllllllIIlIlIIIllIllIlIlII.printStackTrace();
                return null;
            }
        }
    }
    
    public static class SwampHut extends Feature
    {
        private static final /* synthetic */ int[] lllIlIllIlIIII;
        private static final /* synthetic */ String[] lllIlIllIIlllI;
        private /* synthetic */ boolean hasWitch;
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIlIllIlIllIllIllllII) {
            super.readStructureFromNBT(llllllllllllIlIllIlIllIllIllllII);
            this.hasWitch = llllllllllllIlIllIlIllIllIllllII.getBoolean(SwampHut.lllIlIllIIlllI[SwampHut.lllIlIllIlIIII[4]]);
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIlIllIlIllIlllIIIIlI) {
            super.writeStructureToNBT(llllllllllllIlIllIlIllIlllIIIIlI);
            llllllllllllIlIllIlIllIlllIIIIlI.setBoolean(SwampHut.lllIlIllIIlllI[SwampHut.lllIlIllIlIIII[3]], this.hasWitch);
        }
        
        private static boolean lIlIIIllIIlllllI(final int llllllllllllIlIllIlIllIllIIIlIII, final int llllllllllllIlIllIlIllIllIIIIlll) {
            return llllllllllllIlIllIlIllIllIIIlIII > llllllllllllIlIllIlIllIllIIIIlll;
        }
        
        public SwampHut(final Random llllllllllllIlIllIlIllIlllIIlIlI, final int llllllllllllIlIllIlIllIlllIIlIIl, final int llllllllllllIlIllIlIllIlllIIllII) {
            super(llllllllllllIlIllIlIllIlllIIlIlI, llllllllllllIlIllIlIllIlllIIlIIl, SwampHut.lllIlIllIlIIII[0], llllllllllllIlIllIlIllIlllIIllII, SwampHut.lllIlIllIlIIII[1], SwampHut.lllIlIllIlIIII[1], SwampHut.lllIlIllIlIIII[2]);
        }
        
        private static void lIlIIIllIIlllIII() {
            (lllIlIllIIlllI = new String[SwampHut.lllIlIllIlIIII[7]])[SwampHut.lllIlIllIlIIII[3]] = lIlIIIllIIllIlll("RKtVxTSksPk=", "HSYrx");
            SwampHut.lllIlIllIIlllI[SwampHut.lllIlIllIlIIII[4]] = lIlIIIllIIllIlll("HAFICZQSAeI=", "dyuzl");
        }
        
        static {
            lIlIIIllIIllllII();
            lIlIIIllIIlllIII();
        }
        
        private static boolean lIlIIIllIIllllIl(final int llllllllllllIlIllIlIllIllIIIIIll) {
            return llllllllllllIlIllIlIllIllIIIIIll == 0;
        }
        
        public SwampHut() {
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlIllIlIllIllIlIllll, final Random llllllllllllIlIllIlIllIllIlIlllI, final StructureBoundingBox llllllllllllIlIllIlIllIllIlIllIl) {
            if (lIlIIIllIIllllIl(this.func_74935_a(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[3]) ? 1 : 0)) {
                return SwampHut.lllIlIllIlIIII[3] != 0;
            }
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[1], Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[1], Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[3], Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[7], Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[9], Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[9], Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[1], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[1], Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), Blocks.planks.getStateFromMeta(BlockPlanks.EnumType.SPRUCE.getMetadata()), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[7], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[7], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[1], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[1], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[1], SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[1], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.oak_fence.getDefaultState(), SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[7], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.oak_fence.getDefaultState(), SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[1], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.air.getDefaultState(), SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[6], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.air.getDefaultState(), SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[6], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.air.getDefaultState(), SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[5], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.flower_pot.getDefaultState().withProperty(BlockFlowerPot.CONTENTS, BlockFlowerPot.EnumFlowerType.MUSHROOM_RED), SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[5], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.crafting_table.getDefaultState(), SwampHut.lllIlIllIlIIII[8], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[9], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.cauldron.getDefaultState(), SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[9], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.oak_fence.getDefaultState(), SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[4], llllllllllllIlIllIlIllIllIlIllIl);
            this.setBlockState(llllllllllllIlIllIlIllIllIlIllll, Blocks.oak_fence.getDefaultState(), SwampHut.lllIlIllIlIIII[5], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[4], llllllllllllIlIllIlIllIllIlIllIl);
            final int llllllllllllIlIllIlIllIllIlIllII = this.getMetadataWithOffset(Blocks.oak_stairs, SwampHut.lllIlIllIlIIII[8]);
            final int llllllllllllIlIllIlIllIllIlIlIll = this.getMetadataWithOffset(Blocks.oak_stairs, SwampHut.lllIlIllIlIIII[4]);
            final int llllllllllllIlIllIlIllIllIlIlIlI = this.getMetadataWithOffset(Blocks.oak_stairs, SwampHut.lllIlIllIlIIII[3]);
            final int llllllllllllIlIllIlIllIllIlIlIIl = this.getMetadataWithOffset(Blocks.oak_stairs, SwampHut.lllIlIllIlIIII[7]);
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[4], SwampHut.lllIlIllIlIIII[9], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[4], Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIllII), Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIllII), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[1], Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIlIlI), Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIlIlI), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[9], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[9], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[1], Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIlIll), Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIlIll), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllIlIllIllIlIllll, llllllllllllIlIllIlIllIllIlIllIl, SwampHut.lllIlIllIlIIII[3], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[10], SwampHut.lllIlIllIlIIII[9], SwampHut.lllIlIllIlIIII[6], SwampHut.lllIlIllIlIIII[10], Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIlIIl), Blocks.spruce_stairs.getStateFromMeta(llllllllllllIlIllIlIllIllIlIlIIl), (boolean)(SwampHut.lllIlIllIlIIII[3] != 0));
            int llllllllllllIlIllIlIllIllIlIlIII = SwampHut.lllIlIllIlIIII[7];
            "".length();
            if (-" ".length() == "   ".length()) {
                return ((0x53 ^ 0x7B) & ~(0x75 ^ 0x5D)) != 0x0;
            }
            while (!lIlIIIllIIlllllI(llllllllllllIlIllIlIllIllIlIlIII, SwampHut.lllIlIllIlIIII[1])) {
                int llllllllllllIlIllIlIllIllIlIIlll = SwampHut.lllIlIllIlIIII[4];
                "".length();
                if ("  ".length() < -" ".length()) {
                    return ((0x68 ^ 0x44) & ~(0x69 ^ 0x45)) != 0x0;
                }
                while (!lIlIIIllIIlllllI(llllllllllllIlIllIlIllIllIlIIlll, SwampHut.lllIlIllIlIIII[5])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlIllIlIllIllIlIllll, Blocks.log.getDefaultState(), llllllllllllIlIllIlIllIllIlIIlll, SwampHut.lllIlIllIlIIII[11], llllllllllllIlIllIlIllIllIlIlIII, llllllllllllIlIllIlIllIllIlIllIl);
                    llllllllllllIlIllIlIllIllIlIIlll += 4;
                }
                llllllllllllIlIllIlIllIllIlIlIII += 5;
            }
            if (lIlIIIllIIllllIl(this.hasWitch ? 1 : 0)) {
                final int llllllllllllIlIllIlIllIllIlIIllI = this.getXWithOffset(SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[5]);
                final int llllllllllllIlIllIlIllIllIlIIlIl = this.getYWithOffset(SwampHut.lllIlIllIlIIII[7]);
                final int llllllllllllIlIllIlIllIllIlIIlII = this.getZWithOffset(SwampHut.lllIlIllIlIIII[7], SwampHut.lllIlIllIlIIII[5]);
                if (lIlIIIllIIllllll(llllllllllllIlIllIlIllIllIlIllIl.isVecInside(new BlockPos(llllllllllllIlIllIlIllIllIlIIllI, llllllllllllIlIllIlIllIllIlIIlIl, llllllllllllIlIllIlIllIllIlIIlII)) ? 1 : 0)) {
                    this.hasWitch = (SwampHut.lllIlIllIlIIII[4] != 0);
                    final EntityWitch llllllllllllIlIllIlIllIllIlIIIll = new EntityWitch(llllllllllllIlIllIlIllIllIlIllll);
                    llllllllllllIlIllIlIllIllIlIIIll.setLocationAndAngles(llllllllllllIlIllIlIllIllIlIIllI + 0.5, llllllllllllIlIllIlIllIllIlIIlIl, llllllllllllIlIllIlIllIllIlIIlII + 0.5, 0.0f, 0.0f);
                    llllllllllllIlIllIlIllIllIlIIIll.onInitialSpawn(llllllllllllIlIllIlIllIllIlIllll.getDifficultyForLocation(new BlockPos(llllllllllllIlIllIlIllIllIlIIllI, llllllllllllIlIllIlIllIllIlIIlIl, llllllllllllIlIllIlIllIllIlIIlII)), null);
                    "".length();
                    llllllllllllIlIllIlIllIllIlIllll.spawnEntityInWorld(llllllllllllIlIllIlIllIllIlIIIll);
                    "".length();
                }
            }
            return SwampHut.lllIlIllIlIIII[4] != 0;
        }
        
        private static boolean lIlIIIllIIllllll(final int llllllllllllIlIllIlIllIllIIIIlIl) {
            return llllllllllllIlIllIlIllIllIIIIlIl != 0;
        }
        
        private static void lIlIIIllIIllllII() {
            (lllIlIllIlIIII = new int[12])[0] = (95 + 148 - 237 + 227 ^ 23 + 48 + 8 + 90);
            SwampHut.lllIlIllIlIIII[1] = (0x85 ^ 0x82);
            SwampHut.lllIlIllIlIIII[2] = (0x2A ^ 0x7 ^ (0x96 ^ 0xB2));
            SwampHut.lllIlIllIlIIII[3] = ((96 + 186 - 192 + 160 ^ 115 + 4 + 17 + 47) & (0x88 ^ 0x80 ^ (0x27 ^ 0x62) ^ -" ".length()));
            SwampHut.lllIlIllIlIIII[4] = " ".length();
            SwampHut.lllIlIllIlIIII[5] = (0x68 ^ 0x6D);
            SwampHut.lllIlIllIlIIII[6] = (0x92 ^ 0x96);
            SwampHut.lllIlIllIlIIII[7] = "  ".length();
            SwampHut.lllIlIllIlIIII[8] = "   ".length();
            SwampHut.lllIlIllIlIIII[9] = (0x72 ^ 0x74);
            SwampHut.lllIlIllIlIIII[10] = (0x12 ^ 0x1A);
            SwampHut.lllIlIllIlIIII[11] = -" ".length();
        }
        
        private static String lIlIIIllIIllIlll(final String llllllllllllIlIllIlIllIllIIIlllI, final String llllllllllllIlIllIlIllIllIIIllll) {
            try {
                final SecretKeySpec llllllllllllIlIllIlIllIllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIllIllIIIllll.getBytes(StandardCharsets.UTF_8)), SwampHut.lllIlIllIlIIII[10]), "DES");
                final Cipher llllllllllllIlIllIlIllIllIIlIIlI = Cipher.getInstance("DES");
                llllllllllllIlIllIlIllIllIIlIIlI.init(SwampHut.lllIlIllIlIIII[7], llllllllllllIlIllIlIllIllIIlIIll);
                return new String(llllllllllllIlIllIlIllIllIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIllIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlIllIllIIlIIIl) {
                llllllllllllIlIllIlIllIllIIlIIIl.printStackTrace();
                return null;
            }
        }
    }
    
    public static class DesertPyramid extends Feature
    {
        private static final /* synthetic */ int[] lllIIIlIllIIlI;
        private static final /* synthetic */ String[] lllIIIlIllIIIl;
        private static final /* synthetic */ List<WeightedRandomChestContent> itemsToGenerateInTemple;
        private /* synthetic */ boolean[] field_74940_h;
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIIIIIIlIlllIllIIl) {
            super.readStructureFromNBT(llllllllllllIllIIIIIIlIlllIllIIl);
            this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[1]] = llllllllllllIllIIIIIIlIlllIllIIl.getBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[8]]);
            this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[2]] = llllllllllllIllIIIIIIlIlllIllIIl.getBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[4]]);
            this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[5]] = llllllllllllIllIIIIIIlIlllIllIIl.getBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[9]]);
            this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[3]] = llllllllllllIllIIIIIIlIlllIllIIl.getBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[6]]);
        }
        
        private static String lIIlllIllIIlIIlI(final String llllllllllllIllIIIIIIlIllIlIIIIl, final String llllllllllllIllIIIIIIlIllIlIIIII) {
            try {
                final SecretKeySpec llllllllllllIllIIIIIIlIllIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlIllIlIIIII.getBytes(StandardCharsets.UTF_8)), DesertPyramid.lllIIIlIllIIlI[12]), "DES");
                final Cipher llllllllllllIllIIIIIIlIllIlIIIll = Cipher.getInstance("DES");
                llllllllllllIllIIIIIIlIllIlIIIll.init(DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIllIlIIlII);
                return new String(llllllllllllIllIIIIIIlIllIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIIIlIllIlIIIlI) {
                llllllllllllIllIIIIIIlIllIlIIIlI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIIIIIlIllIllIlIl, final Random llllllllllllIllIIIIIIlIllIllIlII, final StructureBoundingBox llllllllllllIllIIIIIIlIlllIIIlll) {
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[16], DesertPyramid.lllIIIlIllIIlI[1], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[1], this.scatteredFeatureSizeZ - DesertPyramid.lllIIIlIllIIlI[2], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            int llllllllllllIllIIIIIIlIlllIIIllI = DesertPyramid.lllIIIlIllIIlI[2];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0xA8 ^ 0xBC) & ~(0x78 ^ 0x6C)) != 0x0;
            }
            while (!lIIlllIllIIlIlll(llllllllllllIllIIIIIIlIlllIIIllI, DesertPyramid.lllIIIlIllIIlI[13])) {
                this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, llllllllllllIllIIIIIIlIlllIIIllI, llllllllllllIllIIIIIIlIlllIIIllI, llllllllllllIllIIIIIIlIlllIIIllI, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[2] - llllllllllllIllIIIIIIlIlllIIIllI, llllllllllllIllIIIIIIlIlllIIIllI, this.scatteredFeatureSizeZ - DesertPyramid.lllIIIlIllIIlI[2] - llllllllllllIllIIIIIIlIlllIIIllI, Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, llllllllllllIllIIIIIIlIlllIIIllI + DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIllI, llllllllllllIllIIIIIIlIlllIIIllI + DesertPyramid.lllIIIlIllIIlI[2], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[5] - llllllllllllIllIIIIIIlIlllIIIllI, llllllllllllIllIIIIIIlIlllIIIllI, this.scatteredFeatureSizeZ - DesertPyramid.lllIIIlIllIIlI[5] - llllllllllllIllIIIIIIlIlllIIIllI, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
                ++llllllllllllIllIIIIIIlIlllIIIllI;
            }
            int llllllllllllIllIIIIIIlIlllIIIlIl = DesertPyramid.lllIIIlIllIIlI[1];
            "".length();
            if ("   ".length() < 0) {
                return ((0x46 ^ 0x51) & ~(0x36 ^ 0x21)) != 0x0;
            }
            while (!lIIlllIllIIllIII(llllllllllllIllIIIIIIlIlllIIIlIl, this.scatteredFeatureSizeX)) {
                int llllllllllllIllIIIIIIlIlllIIIlII = DesertPyramid.lllIIIlIllIIlI[1];
                "".length();
                if (null != null) {
                    return ((0x2A ^ 0x1 ^ (0xAA ^ 0xC3)) & (100 + 155 - 95 + 67 ^ 83 + 37 - 88 + 129 ^ -" ".length())) != 0x0;
                }
                while (!lIIlllIllIIllIII(llllllllllllIllIIIIIIlIlllIIIlII, this.scatteredFeatureSizeZ)) {
                    final int llllllllllllIllIIIIIIlIlllIIIIll = DesertPyramid.lllIIIlIllIIlI[17];
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getDefaultState(), llllllllllllIllIIIIIIlIlllIIIlIl, llllllllllllIllIIIIIIlIlllIIIIll, llllllllllllIllIIIIIIlIlllIIIlII, llllllllllllIllIIIIIIlIlllIIIlll);
                    ++llllllllllllIllIIIIIIlIlllIIIlII;
                }
                ++llllllllllllIllIIIIIIlIlllIIIlIl;
            }
            final int llllllllllllIllIIIIIIlIlllIIIIlI = this.getMetadataWithOffset(Blocks.sandstone_stairs, DesertPyramid.lllIIIlIllIIlI[3]);
            final int llllllllllllIllIIIIIIlIlllIIIIIl = this.getMetadataWithOffset(Blocks.sandstone_stairs, DesertPyramid.lllIIIlIllIIlI[5]);
            final int llllllllllllIllIIIIIIlIlllIIIIII = this.getMetadataWithOffset(Blocks.sandstone_stairs, DesertPyramid.lllIIIlIllIIlI[1]);
            final int llllllllllllIllIIIIIIlIllIllllll = this.getMetadataWithOffset(Blocks.sandstone_stairs, DesertPyramid.lllIIIlIllIIlI[2]);
            final int llllllllllllIllIIIIIIlIllIlllllI = (EnumDyeColor.ORANGE.getDyeDamage() ^ DesertPyramid.lllIIIlIllIIlI[18]) & DesertPyramid.lllIIIlIllIIlI[7];
            final int llllllllllllIllIIIIIIlIllIllllIl = (EnumDyeColor.BLUE.getDyeDamage() ^ DesertPyramid.lllIIIlIllIIlI[18]) & DesertPyramid.lllIIIlIllIIlI[7];
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[8], Blocks.sandstone.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[3], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIlI), DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIIl), DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[8], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIII), DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIllIllllll), DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[1], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[8], Blocks.sandstone.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[2], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[3], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIlI), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIIl), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[8], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIII), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIllIllllll), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[8], Blocks.sandstone.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[8], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[3], Blocks.sandstone.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[11], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[3], Blocks.sandstone.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[11], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[4], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[8], this.scatteredFeatureSizeZ - DesertPyramid.lllIIIlIllIIlI[9], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[20], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[12], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[12], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[19], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[19], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[20], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[4], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[20], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[20], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[13], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[20], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[20], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[13], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[20], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[8], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[8], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[8], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIlI), DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[4], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIlI), DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[8], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIlI), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[4], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIlI), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[8], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[3], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[3], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getDefaultState(), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.SAND.getMetadata()), DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.SAND.getMetadata()), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIllIllllll), DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone_stairs.getStateFromMeta(llllllllllllIllIIIIIIlIlllIIIIII), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[21], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[4], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[22], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[11], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[4], this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[11], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            int llllllllllllIllIIIIIIlIllIllllII = DesertPyramid.lllIIIlIllIIlI[4];
            "".length();
            if ("   ".length() < " ".length()) {
                return ((0x15 ^ 0x49) & ~(0xD ^ 0x51)) != 0x0;
            }
            while (!lIIlllIllIIlIlll(llllllllllllIllIIIIIIlIllIllllII, DesertPyramid.lllIIIlIllIIlI[22])) {
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIllIllllII, llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIllIllllII, llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIllIllllII, llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIllIllllII, llllllllllllIllIIIIIIlIlllIIIlll);
                llllllllllllIllIIIIIIlIllIllllII += 2;
            }
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[6], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[12], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[13], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[13], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[23], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[20], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[20], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[19], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[23], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIllllIl), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            int llllllllllllIllIIIIIIlIllIlllIll = DesertPyramid.lllIIIlIllIIlI[1];
            "".length();
            if ((0x6E ^ 0x39 ^ (0x5B ^ 0x8)) == 0x0) {
                return ((0xE7 ^ 0x9E ^ (0x2F ^ 0x1B)) & (0x38 ^ 0x67 ^ (0x24 ^ 0x36) ^ -" ".length())) != 0x0;
            }
            while (!lIIlllIllIIlIlll(llllllllllllIllIIIIIIlIllIlllIll, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[2])) {
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[3], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[3], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[3], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[3], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[3], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[3], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[2], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[3], llllllllllllIllIIIIIIlIlllIIIlll);
                llllllllllllIllIIIIIIlIllIlllIll += this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[2];
            }
            int llllllllllllIllIIIIIIlIllIlllIlI = DesertPyramid.lllIIIlIllIIlI[5];
            "".length();
            if (-" ".length() == " ".length()) {
                return ((76 + 141 - 158 + 117 ^ 83 + 118 - 82 + 12) & (0xBA ^ 0x98 ^ (0x42 ^ 0x53) ^ -" ".length())) != 0x0;
            }
            while (!lIIlllIllIIlIlll(llllllllllllIllIIIIIIlIllIlllIlI, this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3])) {
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI, DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI + DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI, DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI + DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI, DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI + DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI, DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI + DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI, DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI + DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI, DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), llllllllllllIllIIIIIIlIllIlllIlI + DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI - DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), llllllllllllIllIIIIIIlIllIlllIlI + DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
                llllllllllllIllIIIIIIlIllIlllIlI += this.scatteredFeatureSizeX - DesertPyramid.lllIIIlIllIIlI[3] - DesertPyramid.lllIIIlIllIIlI[5];
            }
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[1], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stained_hardened_clay.getStateFromMeta(llllllllllllIllIIIIIIlIllIlllllI), DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[1], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[24], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[19], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[19], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[27], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[27], DesertPyramid.lllIIIlIllIIlI[19], Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[28], DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[18], DesertPyramid.lllIIIlIllIIlI[19], Blocks.sandstone.getDefaultState(), Blocks.sandstone.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[18], DesertPyramid.lllIIIlIllIIlI[20], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.stone_pressure_plate.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.fillWithBlocks(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[29], DesertPyramid.lllIIIlIllIIlI[13], DesertPyramid.lllIIIlIllIIlI[20], DesertPyramid.lllIIIlIllIIlI[29], DesertPyramid.lllIIIlIllIIlI[20], Blocks.tnt.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(DesertPyramid.lllIIIlIllIIlI[1] != 0));
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[12], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[19], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), DesertPyramid.lllIIIlIllIIlI[23], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[23], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[0], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[12], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[12], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[6], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[6], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[19], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.air.getDefaultState(), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[19], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.CHISELED.getMetadata()), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[26], DesertPyramid.lllIIIlIllIIlI[23], llllllllllllIllIIIIIIlIlllIIIlll);
            this.setBlockState(llllllllllllIllIIIIIIlIllIllIlIl, Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata()), DesertPyramid.lllIIIlIllIIlI[0], DesertPyramid.lllIIIlIllIIlI[25], DesertPyramid.lllIIIlIllIIlI[23], llllllllllllIllIIIIIIlIlllIIIlll);
            final long llllllllllllIllIIIIIIlIllIlIlIll = (long)EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if (((0x25 ^ 0x34) & ~(0x31 ^ 0x20)) != 0x0) {
                return ((0x3A ^ 0x6B) & ~(0xFF ^ 0xAE)) != 0x0;
            }
            while (!lIIlllIllIIllIIl(((Iterator)llllllllllllIllIIIIIIlIllIlIlIll).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIllIIIIIIlIllIlllIIl = ((Iterator<EnumFacing>)llllllllllllIllIIIIIIlIllIlIlIll).next();
                if (lIIlllIllIIllIIl(this.field_74940_h[llllllllllllIllIIIIIIlIllIlllIIl.getHorizontalIndex()] ? 1 : 0)) {
                    final int llllllllllllIllIIIIIIlIllIlllIII = llllllllllllIllIIIIIIlIllIlllIIl.getFrontOffsetX() * DesertPyramid.lllIIIlIllIIlI[5];
                    final int llllllllllllIllIIIIIIlIllIllIlll = llllllllllllIllIIIIIIlIllIlllIIl.getFrontOffsetZ() * DesertPyramid.lllIIIlIllIIlI[5];
                    final boolean[] field_74940_h = this.field_74940_h;
                    final int horizontalIndex = llllllllllllIllIIIIIIlIllIlllIIl.getHorizontalIndex();
                    final int llllllllllllIllIlIlllIlllIIIIIIl = DesertPyramid.lllIIIlIllIIlI[0] + llllllllllllIllIIIIIIlIllIlllIII;
                    final int llllllllllllIllIlIlllIllIlllIlII = DesertPyramid.lllIIIlIllIIlI[25];
                    final int llllllllllllIllIlIlllIllIlllllll = DesertPyramid.lllIIIlIllIIlI[0] + llllllllllllIllIIIIIIlIllIllIlll;
                    final List<WeightedRandomChestContent> itemsToGenerateInTemple = DesertPyramid.itemsToGenerateInTemple;
                    final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl = new WeightedRandomChestContent[DesertPyramid.lllIIIlIllIIlI[2]];
                    llllllllllllIlIlllIIlllIllIIIlIl[DesertPyramid.lllIIIlIllIIlI[1]] = Items.enchanted_book.getRandom(llllllllllllIllIIIIIIlIllIllIlII);
                    field_74940_h[horizontalIndex] = this.generateChestContents(llllllllllllIllIIIIIIlIllIllIlIl, llllllllllllIllIIIIIIlIlllIIIlll, llllllllllllIllIIIIIIlIllIllIlII, llllllllllllIllIlIlllIlllIIIIIIl, llllllllllllIllIlIlllIllIlllIlII, llllllllllllIllIlIlllIllIlllllll, WeightedRandomChestContent.func_177629_a(itemsToGenerateInTemple, llllllllllllIlIlllIIlllIllIIIlIl), DesertPyramid.lllIIIlIllIIlI[5] + llllllllllllIllIIIIIIlIllIllIlII.nextInt(DesertPyramid.lllIIIlIllIIlI[4]));
                }
            }
            return DesertPyramid.lllIIIlIllIIlI[2] != 0;
        }
        
        public DesertPyramid(final Random llllllllllllIllIIIIIIlIllllIIlll, final int llllllllllllIllIIIIIIlIllllIlIlI, final int llllllllllllIllIIIIIIlIllllIlIIl) {
            super(llllllllllllIllIIIIIIlIllllIIlll, llllllllllllIllIIIIIIlIllllIlIlI, DesertPyramid.lllIIIlIllIIlI[14], llllllllllllIllIIIIIIlIllllIlIIl, DesertPyramid.lllIIIlIllIIlI[15], DesertPyramid.lllIIIlIllIIlI[7], DesertPyramid.lllIIIlIllIIlI[15]);
            this.field_74940_h = new boolean[DesertPyramid.lllIIIlIllIIlI[8]];
        }
        
        private static void lIIlllIllIIlIlIl() {
            (lllIIIlIllIIIl = new String[DesertPyramid.lllIIIlIllIIlI[12]])[DesertPyramid.lllIIIlIllIIlI[1]] = lIIlllIllIIlIIlI("eMT35cLnGGEoOvVKfSeatg==", "eiqsg");
            DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[2]] = lIIlllIllIIlIIll("JAA+Ei4tAigmASQEPjZz", "LaMBB");
            DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[5]] = lIIlllIllIIlIIlI("j2CmcMvuJyIH0kqh4a7Pbw==", "CkGqn");
            DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[3]] = lIIlllIllIIlIIll("ODUGMQgxNxAFJzgxBhVX", "PTuad");
            DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[8]] = lIIlllIllIIlIlII("JkmHxmivw6bldkA1HsgO2w==", "IYeJu");
            DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[4]] = lIIlllIllIIlIIlI("/IG+AoujU4g++Enrri6CHw==", "wzHYe");
            DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[9]] = lIIlllIllIIlIIll("LDgLGRklOh0tNiw8Cz1H", "DYxIu");
            DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[6]] = lIIlllIllIIlIlII("PrzkgAi9iKcYKXJlk3281w==", "fnezb");
        }
        
        private static String lIIlllIllIIlIlII(final String llllllllllllIllIIIIIIlIllIIlIlII, final String llllllllllllIllIIIIIIlIllIIlIIIl) {
            try {
                final SecretKeySpec llllllllllllIllIIIIIIlIllIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIIIlIllIIlIllI = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIIIlIllIIlIllI.init(DesertPyramid.lllIIIlIllIIlI[5], llllllllllllIllIIIIIIlIllIIlIlll);
                return new String(llllllllllllIllIIIIIIlIllIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIIIlIllIIlIlIl) {
                llllllllllllIllIIIIIIlIllIIlIlIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIIIIIIlIlllIlllll) {
            super.writeStructureToNBT(llllllllllllIllIIIIIIlIlllIlllll);
            llllllllllllIllIIIIIIlIlllIlllll.setBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[1]], this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[1]]);
            llllllllllllIllIIIIIIlIlllIlllll.setBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[2]], this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[2]]);
            llllllllllllIllIIIIIIlIlllIlllll.setBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[5]], this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[5]]);
            llllllllllllIllIIIIIIlIlllIlllll.setBoolean(DesertPyramid.lllIIIlIllIIIl[DesertPyramid.lllIIIlIllIIlI[3]], this.field_74940_h[DesertPyramid.lllIIIlIllIIlI[3]]);
        }
        
        static {
            lIIlllIllIIlIllI();
            lIIlllIllIIlIlIl();
            final WeightedRandomChestContent[] array = new WeightedRandomChestContent[DesertPyramid.lllIIIlIllIIlI[0]];
            array[DesertPyramid.lllIIIlIllIIlI[1]] = new WeightedRandomChestContent(Items.diamond, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[3]);
            array[DesertPyramid.lllIIIlIllIIlI[2]] = new WeightedRandomChestContent(Items.iron_ingot, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[4], DesertPyramid.lllIIIlIllIIlI[0]);
            array[DesertPyramid.lllIIIlIllIIlI[5]] = new WeightedRandomChestContent(Items.gold_ingot, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[5], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[7]);
            array[DesertPyramid.lllIIIlIllIIlI[3]] = new WeightedRandomChestContent(Items.emerald, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[5]);
            array[DesertPyramid.lllIIIlIllIIlI[8]] = new WeightedRandomChestContent(Items.bone, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[8], DesertPyramid.lllIIIlIllIIlI[9], DesertPyramid.lllIIIlIllIIlI[10]);
            array[DesertPyramid.lllIIIlIllIIlI[4]] = new WeightedRandomChestContent(Items.rotten_flesh, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[3], DesertPyramid.lllIIIlIllIIlI[6], DesertPyramid.lllIIIlIllIIlI[11]);
            array[DesertPyramid.lllIIIlIllIIlI[9]] = new WeightedRandomChestContent(Items.saddle, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[3]);
            array[DesertPyramid.lllIIIlIllIIlI[6]] = new WeightedRandomChestContent(Items.iron_horse_armor, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2]);
            array[DesertPyramid.lllIIIlIllIIlI[12]] = new WeightedRandomChestContent(Items.golden_horse_armor, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2]);
            array[DesertPyramid.lllIIIlIllIIlI[13]] = new WeightedRandomChestContent(Items.diamond_horse_armor, DesertPyramid.lllIIIlIllIIlI[1], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2], DesertPyramid.lllIIIlIllIIlI[2]);
            itemsToGenerateInTemple = Lists.newArrayList((Object[])array);
        }
        
        private static boolean lIIlllIllIIllIII(final int llllllllllllIllIIIIIIlIlIlllIlII, final int llllllllllllIllIIIIIIlIlIlllIIll) {
            return llllllllllllIllIIIIIIlIlIlllIlII >= llllllllllllIllIIIIIIlIlIlllIIll;
        }
        
        private static String lIIlllIllIIlIIll(String llllllllllllIllIIIIIIlIlIlllllll, final String llllllllllllIllIIIIIIlIlIllllllI) {
            llllllllllllIllIIIIIIlIlIlllllll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIIIlIlIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIIIIlIllIIIIIlI = new StringBuilder();
            final char[] llllllllllllIllIIIIIIlIllIIIIIIl = llllllllllllIllIIIIIIlIlIllllllI.toCharArray();
            int llllllllllllIllIIIIIIlIllIIIIIII = DesertPyramid.lllIIIlIllIIlI[1];
            final boolean llllllllllllIllIIIIIIlIlIllllIlI = (Object)((String)llllllllllllIllIIIIIIlIlIlllllll).toCharArray();
            final char llllllllllllIllIIIIIIlIlIllllIIl = (char)llllllllllllIllIIIIIIlIlIllllIlI.length;
            short llllllllllllIllIIIIIIlIlIllllIII = (short)DesertPyramid.lllIIIlIllIIlI[1];
            while (lIIlllIllIIllIlI(llllllllllllIllIIIIIIlIlIllllIII, llllllllllllIllIIIIIIlIlIllllIIl)) {
                final char llllllllllllIllIIIIIIlIllIIIIlIl = llllllllllllIllIIIIIIlIlIllllIlI[llllllllllllIllIIIIIIlIlIllllIII];
                llllllllllllIllIIIIIIlIllIIIIIlI.append((char)(llllllllllllIllIIIIIIlIllIIIIlIl ^ llllllllllllIllIIIIIIlIllIIIIIIl[llllllllllllIllIIIIIIlIllIIIIIII % llllllllllllIllIIIIIIlIllIIIIIIl.length]));
                "".length();
                ++llllllllllllIllIIIIIIlIllIIIIIII;
                ++llllllllllllIllIIIIIIlIlIllllIII;
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIIIIlIllIIIIIlI);
        }
        
        private static boolean lIIlllIllIIllIlI(final int llllllllllllIllIIIIIIlIlIlllIIII, final int llllllllllllIllIIIIIIlIlIllIllll) {
            return llllllllllllIllIIIIIIlIlIlllIIII < llllllllllllIllIIIIIIlIlIllIllll;
        }
        
        public DesertPyramid() {
            this.field_74940_h = new boolean[DesertPyramid.lllIIIlIllIIlI[8]];
        }
        
        private static boolean lIIlllIllIIllIIl(final int llllllllllllIllIIIIIIlIlIllIlIIl) {
            return llllllllllllIllIIIIIIlIlIllIlIIl == 0;
        }
        
        private static void lIIlllIllIIlIllI() {
            (lllIIIlIllIIlI = new int[30])[0] = (45 + 103 - 106 + 94 ^ 119 + 96 - 139 + 54);
            DesertPyramid.lllIIIlIllIIlI[1] = ((63 + 83 - 88 + 103 ^ 104 + 103 - 122 + 71) & (0x69 ^ 0x2 ^ (0xD1 ^ 0x87) ^ -" ".length()));
            DesertPyramid.lllIIIlIllIIlI[2] = " ".length();
            DesertPyramid.lllIIIlIllIIlI[3] = "   ".length();
            DesertPyramid.lllIIIlIllIIlI[4] = (0x1D ^ 0x18);
            DesertPyramid.lllIIIlIllIIlI[5] = "  ".length();
            DesertPyramid.lllIIIlIllIIlI[6] = (0x8C ^ 0x8B);
            DesertPyramid.lllIIIlIllIIlI[7] = (0xBA ^ 0xA3 ^ (0xD6 ^ 0xC0));
            DesertPyramid.lllIIIlIllIIlI[8] = (66 + 36 - 36 + 69 ^ 129 + 93 - 128 + 37);
            DesertPyramid.lllIIIlIllIIlI[9] = (0x6A ^ 0x6C);
            DesertPyramid.lllIIIlIllIIlI[10] = (0x7C ^ 0x68);
            DesertPyramid.lllIIIlIllIIlI[11] = (0x42 ^ 0x52);
            DesertPyramid.lllIIIlIllIIlI[12] = (0x76 ^ 0x7E);
            DesertPyramid.lllIIIlIllIIlI[13] = (54 + 22 - 1 + 67 ^ 21 + 52 + 33 + 29);
            DesertPyramid.lllIIIlIllIIlI[14] = (0xAC ^ 0xA5 ^ (0x2F ^ 0x66));
            DesertPyramid.lllIIIlIllIIlI[15] = (0x24 ^ 0x31);
            DesertPyramid.lllIIIlIllIIlI[16] = -(0x20 ^ 0x24);
            DesertPyramid.lllIIIlIllIIlI[17] = -(0x69 ^ 0x15 ^ (0x3B ^ 0x42));
            DesertPyramid.lllIIIlIllIIlI[18] = -" ".length();
            DesertPyramid.lllIIIlIllIIlI[19] = (0x15 ^ 0x19);
            DesertPyramid.lllIIIlIllIIlI[20] = (37 + 12 - 29 + 108 ^ 86 + 90 - 122 + 85);
            DesertPyramid.lllIIIlIllIIlI[21] = (0x86 ^ 0x94);
            DesertPyramid.lllIIIlIllIIlI[22] = (0x51 ^ 0x40);
            DesertPyramid.lllIIIlIllIIlI[23] = (0x77 ^ 0x7A);
            DesertPyramid.lllIIIlIllIIlI[24] = -(0xD3 ^ 0xAE ^ (0x22 ^ 0x51));
            DesertPyramid.lllIIIlIllIIlI[25] = -(0x6B ^ 0x30 ^ (0x21 ^ 0x71));
            DesertPyramid.lllIIIlIllIIlI[26] = -(38 + 204 - 161 + 126 ^ 70 + 91 + 15 + 21);
            DesertPyramid.lllIIIlIllIIlI[27] = -(0xDA ^ 0x94 ^ (0xF3 ^ 0xB4));
            DesertPyramid.lllIIIlIllIIlI[28] = -(0x24 ^ 0x55 ^ (0xF9 ^ 0x80));
            DesertPyramid.lllIIIlIllIIlI[29] = -(0x7 ^ 0xA);
        }
        
        private static boolean lIIlllIllIIlIlll(final int llllllllllllIllIIIIIIlIlIllIllII, final int llllllllllllIllIIIIIIlIlIllIlIll) {
            return llllllllllllIllIIIIIIlIlIllIllII > llllllllllllIllIIIIIIlIlIllIlIll;
        }
    }
}
