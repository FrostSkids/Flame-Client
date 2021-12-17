// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.util.MathHelper;
import com.google.common.collect.Lists;
import net.minecraft.util.EnumFacing;
import java.util.Random;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class StructureVillagePieces
{
    private static final /* synthetic */ int[] llIlllllIlIlII;
    private static final /* synthetic */ String[] llIlllllIIIlll;
    
    private static boolean lIIllIllIIlllIII(final int llllllllllllIllIIIlIlllIllIIIIll) {
        return llllllllllllIllIIIlIlllIllIIIIll <= 0;
    }
    
    private static String lIIllIllIIIIllll(final String llllllllllllIllIIIlIllllIIIIlIIl, final String llllllllllllIllIIIlIllllIIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIllllIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIllllIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIllllIIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIllllIIIIllIl.init(StructureVillagePieces.llIlllllIlIlII[2], llllllllllllIllIIIlIllllIIIIlllI);
            return new String(llllllllllllIllIIIlIllllIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIllllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIllllIIIIllII) {
            llllllllllllIllIIIlIllllIIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIllIIllIllI(final int llllllllllllIllIIIlIlllIllIIlIIl) {
        return llllllllllllIllIIIlIlllIllIIlIIl != 0;
    }
    
    private static String lIIllIllIIIlIIII(String llllllllllllIllIIIlIlllIllllIllI, final String llllllllllllIllIIIlIlllIlllllIlI) {
        llllllllllllIllIIIlIlllIllllIllI = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlIlllIllllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIlllIlllllIIl = new StringBuilder();
        final char[] llllllllllllIllIIIlIlllIlllllIII = llllllllllllIllIIIlIlllIlllllIlI.toCharArray();
        int llllllllllllIllIIIlIlllIllllIlll = StructureVillagePieces.llIlllllIlIlII[0];
        final byte llllllllllllIllIIIlIlllIllllIIIl = (Object)((String)llllllllllllIllIIIlIlllIllllIllI).toCharArray();
        final String llllllllllllIllIIIlIlllIllllIIII = (String)llllllllllllIllIIIlIlllIllllIIIl.length;
        int llllllllllllIllIIIlIlllIlllIllll = StructureVillagePieces.llIlllllIlIlII[0];
        while (lIIllIllIIllIlIl(llllllllllllIllIIIlIlllIlllIllll, (int)llllllllllllIllIIIlIlllIllllIIII)) {
            final char llllllllllllIllIIIlIlllIllllllII = llllllllllllIllIIIlIlllIllllIIIl[llllllllllllIllIIIlIlllIlllIllll];
            llllllllllllIllIIIlIlllIlllllIIl.append((char)(llllllllllllIllIIIlIlllIllllllII ^ llllllllllllIllIIIlIlllIlllllIII[llllllllllllIllIIIlIlllIllllIlll % llllllllllllIllIIIlIlllIlllllIII.length]));
            "".length();
            ++llllllllllllIllIIIlIlllIllllIlll;
            ++llllllllllllIllIIIlIlllIlllIllll;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIlllIlllllIIl);
    }
    
    private static Village func_176065_a(final Start llllllllllllIllIIIlIllllllIIlIIl, final PieceWeight llllllllllllIllIIIlIlllllIllllIl, final List<StructureComponent> llllllllllllIllIIIlIllllllIIIlll, final Random llllllllllllIllIIIlIllllllIIIllI, final int llllllllllllIllIIIlIlllllIlllIlI, final int llllllllllllIllIIIlIlllllIlllIIl, final int llllllllllllIllIIIlIllllllIIIIll, final EnumFacing llllllllllllIllIIIlIllllllIIIIlI, final int llllllllllllIllIIIlIllllllIIIIIl) {
        final Class<? extends Village> llllllllllllIllIIIlIllllllIIIIII = llllllllllllIllIIIlIlllllIllllIl.villagePieceClass;
        Village llllllllllllIllIIIlIlllllIllllll = null;
        if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, House4Garden.class)) {
            llllllllllllIllIIIlIlllllIllllll = House4Garden.func_175858_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if ((0x36 ^ 0x33) <= 0) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, Church.class)) {
            llllllllllllIllIIIlIlllllIllllll = Church.func_175854_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, House1.class)) {
            llllllllllllIllIIIlIlllllIllllll = House1.func_175850_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if ((0x23 ^ 0x46 ^ (0x33 ^ 0x52)) == 0x0) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, WoodHut.class)) {
            llllllllllllIllIIIlIlllllIllllll = WoodHut.func_175853_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, Hall.class)) {
            llllllllllllIllIIIlIlllllIllllll = Hall.func_175857_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if ((0x7D ^ 0x79) < (0x6A ^ 0x6E)) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, Field1.class)) {
            llllllllllllIllIIIlIlllllIllllll = Field1.func_175851_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if ("   ".length() >= (0xE2 ^ 0xA7 ^ (0x39 ^ 0x78))) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, Field2.class)) {
            llllllllllllIllIIIlIlllllIllllll = Field2.func_175852_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if ((0x51 ^ 0x55) <= "  ".length()) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, House2.class)) {
            llllllllllllIllIIIlIlllllIllllll = House2.func_175855_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        else if (lIIllIllIIllIlll(llllllllllllIllIIIlIllllllIIIIII, House3.class)) {
            llllllllllllIllIIIlIlllllIllllll = House3.func_175849_a(llllllllllllIllIIIlIllllllIIlIIl, llllllllllllIllIIIlIllllllIIIlll, llllllllllllIllIIIlIllllllIIIllI, llllllllllllIllIIIlIlllllIlllIlI, llllllllllllIllIIIlIlllllIlllIIl, llllllllllllIllIIIlIllllllIIIIll, llllllllllllIllIIIlIllllllIIIIlI, llllllllllllIllIIIlIllllllIIIIIl);
        }
        return llllllllllllIllIIIlIlllllIllllll;
    }
    
    private static boolean lIIllIllIIllIIll(final int llllllllllllIllIIIlIlllIllIIIlll) {
        return llllllllllllIllIIIlIlllIllIIIlll == 0;
    }
    
    private static boolean lIIllIllIIlllIIl(final int llllllllllllIllIIIlIlllIllIIIlIl) {
        return llllllllllllIllIIIlIlllIllIIIlIl < 0;
    }
    
    private static boolean lIIllIllIIllllII(final int llllllllllllIllIIIlIlllIllIllllI, final int llllllllllllIllIIIlIlllIllIlllIl) {
        return llllllllllllIllIIIlIlllIllIllllI >= llllllllllllIllIIIlIlllIllIlllIl;
    }
    
    private static boolean lIIllIllIIllllIl(final int llllllllllllIllIIIlIlllIllIlIllI, final int llllllllllllIllIIIlIlllIllIlIlIl) {
        return llllllllllllIllIIIlIlllIllIlIllI <= llllllllllllIllIIIlIlllIllIlIlIl;
    }
    
    public static List<PieceWeight> getStructureVillageWeightedPieceList(final Random llllllllllllIllIIIlIlllllllIIllI, final int llllllllllllIllIIIlIlllllllIlIIl) {
        final List<PieceWeight> llllllllllllIllIIIlIlllllllIlIII = (List<PieceWeight>)Lists.newArrayList();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(House4Garden.class, StructureVillagePieces.llIlllllIlIlII[4], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[2] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[4] + llllllllllllIllIIIlIlllllllIlIIl * StructureVillagePieces.llIlllllIlIlII[2])));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(Church.class, StructureVillagePieces.llIlllllIlIlII[13], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[0] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[1] + llllllllllllIllIIIlIlllllllIlIIl)));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(House1.class, StructureVillagePieces.llIlllllIlIlII[13], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[0] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[2] + llllllllllllIllIIIlIlllllllIlIIl)));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(WoodHut.class, StructureVillagePieces.llIlllllIlIlII[3], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[2] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[5] + llllllllllllIllIIIlIlllllllIlIIl * StructureVillagePieces.llIlllllIlIlII[3])));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(Hall.class, StructureVillagePieces.llIlllllIlIlII[14], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[0] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[2] + llllllllllllIllIIIlIlllllllIlIIl)));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(Field1.class, StructureVillagePieces.llIlllllIlIlII[3], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[1] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[4] + llllllllllllIllIIIlIlllllllIlIIl)));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(Field2.class, StructureVillagePieces.llIlllllIlIlII[3], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[2] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[4] + llllllllllllIllIIIlIlllllllIlIIl * StructureVillagePieces.llIlllllIlIlII[2])));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(House2.class, StructureVillagePieces.llIlllllIlIlII[14], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[0], StructureVillagePieces.llIlllllIlIlII[1] + llllllllllllIllIIIlIlllllllIlIIl)));
        "".length();
        llllllllllllIllIIIlIlllllllIlIII.add(new PieceWeight(House3.class, StructureVillagePieces.llIlllllIlIlII[8], MathHelper.getRandomIntegerInRange(llllllllllllIllIIIlIlllllllIIllI, StructureVillagePieces.llIlllllIlIlII[0] + llllllllllllIllIIIlIlllllllIlIIl, StructureVillagePieces.llIlllllIlIlII[3] + llllllllllllIllIIIlIlllllllIlIIl * StructureVillagePieces.llIlllllIlIlII[2])));
        "".length();
        final Iterator<PieceWeight> llllllllllllIllIIIlIlllllllIIlll = llllllllllllIllIIIlIlllllllIlIII.iterator();
        "".length();
        if ((0xC2 ^ 0x9B ^ (0x60 ^ 0x3D)) <= ((87 + 183 - 254 + 189 ^ 25 + 29 + 49 + 34) & (0x8 ^ 0x0 ^ (0x43 ^ 0xF) ^ -" ".length()))) {
            return null;
        }
        while (!lIIllIllIIllIIll(llllllllllllIllIIIlIlllllllIIlll.hasNext() ? 1 : 0)) {
            if (lIIllIllIIllIIll(llllllllllllIllIIIlIlllllllIIlll.next().villagePiecesLimit)) {
                llllllllllllIllIIIlIlllllllIIlll.remove();
            }
        }
        return llllllllllllIllIIIlIlllllllIlIII;
    }
    
    private static boolean lIIllIllIIllIlll(final Object llllllllllllIllIIIlIlllIllIIlllI, final Object llllllllllllIllIIIlIlllIllIIllIl) {
        return llllllllllllIllIIIlIlllIllIIlllI == llllllllllllIllIIIlIlllIllIIllIl;
    }
    
    private static void lIIllIllIIllIIlI() {
        (llIlllllIlIlII = new int[19])[0] = ((0xEB ^ 0x8D ^ (0xE7 ^ 0xA3)) & (0xA3 ^ 0xA6 ^ (0x45 ^ 0x62) ^ -" ".length()));
        StructureVillagePieces.llIlllllIlIlII[1] = " ".length();
        StructureVillagePieces.llIlllllIlIlII[2] = "  ".length();
        StructureVillagePieces.llIlllllIlIlII[3] = "   ".length();
        StructureVillagePieces.llIlllllIlIlII[4] = (0x3A ^ 0x48 ^ (0x24 ^ 0x52));
        StructureVillagePieces.llIlllllIlIlII[5] = (0xD7 ^ 0x9E ^ (0x55 ^ 0x19));
        StructureVillagePieces.llIlllllIlIlII[6] = (0x71 ^ 0x4D ^ (0x42 ^ 0x78));
        StructureVillagePieces.llIlllllIlIlII[7] = (0x87 ^ 0x80);
        StructureVillagePieces.llIlllllIlIlII[8] = (0x3C ^ 0x18 ^ (0x27 ^ 0xB));
        StructureVillagePieces.llIlllllIlIlII[9] = (0x2 ^ 0xB);
        StructureVillagePieces.llIlllllIlIlII[10] = (0x91 ^ 0x9B);
        StructureVillagePieces.llIlllllIlIlII[11] = (0x31 ^ 0x6A ^ (0x45 ^ 0x15));
        StructureVillagePieces.llIlllllIlIlII[12] = (0xB1 ^ 0x80 ^ (0x80 ^ 0xBD));
        StructureVillagePieces.llIlllllIlIlII[13] = (0x9F ^ 0x8E ^ (0x39 ^ 0x3C));
        StructureVillagePieces.llIlllllIlIlII[14] = (0x64 ^ 0x7F ^ (0x1E ^ 0xA));
        StructureVillagePieces.llIlllllIlIlII[15] = -" ".length();
        StructureVillagePieces.llIlllllIlIlII[16] = (0x7 ^ 0x35);
        StructureVillagePieces.llIlllllIlIlII[17] = (0x53 ^ 0x23);
        StructureVillagePieces.llIlllllIlIlII[18] = (0x8A ^ 0x87);
    }
    
    private static int func_75079_a(final List<PieceWeight> llllllllllllIllIIIlIllllllIlllIl) {
        boolean llllllllllllIllIIIlIllllllIlllII = StructureVillagePieces.llIlllllIlIlII[0] != 0;
        int llllllllllllIllIIIlIllllllIllIll = StructureVillagePieces.llIlllllIlIlII[0];
        final String llllllllllllIllIIIlIllllllIlIlIl = (String)llllllllllllIllIIIlIllllllIlllIl.iterator();
        "".length();
        if ((0xB2 ^ 0xAB ^ (0xB8 ^ 0xA5)) < ((0xEE ^ 0x9D ^ (0x4D ^ 0x67)) & (0x77 ^ 0x3D ^ (0x57 ^ 0x44) ^ -" ".length()))) {
            return (0x29 ^ 0x7A ^ (0xC ^ 0x15)) & (0x6 ^ 0x57 ^ (0x15 ^ 0xE) ^ -" ".length());
        }
        while (!lIIllIllIIllIIll(((Iterator)llllllllllllIllIIIlIllllllIlIlIl).hasNext() ? 1 : 0)) {
            final PieceWeight llllllllllllIllIIIlIllllllIllIlI = ((Iterator<PieceWeight>)llllllllllllIllIIIlIllllllIlIlIl).next();
            if (lIIllIllIIllIlII(llllllllllllIllIIIlIllllllIllIlI.villagePiecesLimit) && lIIllIllIIllIlIl(llllllllllllIllIIIlIllllllIllIlI.villagePiecesSpawned, llllllllllllIllIIIlIllllllIllIlI.villagePiecesLimit)) {
                llllllllllllIllIIIlIllllllIlllII = (StructureVillagePieces.llIlllllIlIlII[1] != 0);
            }
            llllllllllllIllIIIlIllllllIllIll += llllllllllllIllIIIlIllllllIllIlI.villagePieceWeight;
        }
        int n;
        if (lIIllIllIIllIllI(llllllllllllIllIIIlIllllllIlllII ? 1 : 0)) {
            n = llllllllllllIllIIIlIllllllIllIll;
            "".length();
            if (-"  ".length() > 0) {
                return (0x43 ^ 0xF) & ~(0x8 ^ 0x44);
            }
        }
        else {
            n = StructureVillagePieces.llIlllllIlIlII[15];
        }
        return n;
    }
    
    private static Village func_176067_c(final Start llllllllllllIllIIIlIlllllIlIIlIl, final List<StructureComponent> llllllllllllIllIIIlIlllllIIlIllI, final Random llllllllllllIllIIIlIlllllIlIIIll, final int llllllllllllIllIIIlIlllllIIlIlII, final int llllllllllllIllIIIlIlllllIlIIIIl, final int llllllllllllIllIIIlIlllllIIlIIlI, final EnumFacing llllllllllllIllIIIlIlllllIIlIIIl, final int llllllllllllIllIIIlIlllllIIlIIII) {
        final int llllllllllllIllIIIlIlllllIIlllIl = func_75079_a(llllllllllllIllIIIlIlllllIlIIlIl.structureVillageWeightedPieceList);
        if (lIIllIllIIlllIII(llllllllllllIllIIIlIlllllIIlllIl)) {
            return null;
        }
        int llllllllllllIllIIIlIlllllIIlllII = StructureVillagePieces.llIlllllIlIlII[0];
        "".length();
        if ("   ".length() == (0xE ^ 0xA)) {
            return null;
        }
        while (!lIIllIllIIllllII(llllllllllllIllIIIlIlllllIIlllII, StructureVillagePieces.llIlllllIlIlII[5])) {
            ++llllllllllllIllIIIlIlllllIIlllII;
            int llllllllllllIllIIIlIlllllIIllIll = llllllllllllIllIIIlIlllllIlIIIll.nextInt(llllllllllllIllIIIlIlllllIIlllIl);
            final long llllllllllllIllIIIlIlllllIIIlIll = (long)llllllllllllIllIIIlIlllllIlIIlIl.structureVillageWeightedPieceList.iterator();
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
            while (!lIIllIllIIllIIll(((Iterator)llllllllllllIllIIIlIlllllIIIlIll).hasNext() ? 1 : 0)) {
                final PieceWeight llllllllllllIllIIIlIlllllIIllIlI = ((Iterator<PieceWeight>)llllllllllllIllIIIlIlllllIIIlIll).next();
                llllllllllllIllIIIlIlllllIIllIll -= llllllllllllIllIIIlIlllllIIllIlI.villagePieceWeight;
                if (lIIllIllIIlllIIl(llllllllllllIllIIIlIlllllIIllIll)) {
                    if (!lIIllIllIIllIllI(llllllllllllIllIIIlIlllllIIllIlI.canSpawnMoreVillagePiecesOfType(llllllllllllIllIIIlIlllllIIlIIII) ? 1 : 0)) {
                        break;
                    }
                    if (lIIllIllIIllIlll(llllllllllllIllIIIlIlllllIIllIlI, llllllllllllIllIIIlIlllllIlIIlIl.structVillagePieceWeight) && lIIllIllIIlllIlI(llllllllllllIllIIIlIlllllIlIIlIl.structureVillageWeightedPieceList.size(), StructureVillagePieces.llIlllllIlIlII[1])) {
                        "".length();
                        if (null != null) {
                            return null;
                        }
                        break;
                    }
                    else {
                        final Village llllllllllllIllIIIlIlllllIIllIIl = func_176065_a(llllllllllllIllIIIlIlllllIlIIlIl, llllllllllllIllIIIlIlllllIIllIlI, llllllllllllIllIIIlIlllllIIlIllI, llllllllllllIllIIIlIlllllIlIIIll, llllllllllllIllIIIlIlllllIIlIlII, llllllllllllIllIIIlIlllllIlIIIIl, llllllllllllIllIIIlIlllllIIlIIlI, llllllllllllIllIIIlIlllllIIlIIIl, llllllllllllIllIIIlIlllllIIlIIII);
                        if (lIIllIllIIlllIll(llllllllllllIllIIIlIlllllIIllIIl)) {
                            final PieceWeight pieceWeight = llllllllllllIllIIIlIlllllIIllIlI;
                            pieceWeight.villagePiecesSpawned += StructureVillagePieces.llIlllllIlIlII[1];
                            llllllllllllIllIIIlIlllllIlIIlIl.structVillagePieceWeight = llllllllllllIllIIIlIlllllIIllIlI;
                            if (lIIllIllIIllIIll(llllllllllllIllIIIlIlllllIIllIlI.canSpawnMoreVillagePieces() ? 1 : 0)) {
                                llllllllllllIllIIIlIlllllIlIIlIl.structureVillageWeightedPieceList.remove(llllllllllllIllIIIlIlllllIIllIlI);
                                "".length();
                            }
                            return llllllllllllIllIIIlIlllllIIllIIl;
                        }
                        continue;
                    }
                }
            }
        }
        final StructureBoundingBox llllllllllllIllIIIlIlllllIIllIII = Torch.func_175856_a(llllllllllllIllIIIlIlllllIlIIlIl, llllllllllllIllIIIlIlllllIIlIllI, llllllllllllIllIIIlIlllllIlIIIll, llllllllllllIllIIIlIlllllIIlIlII, llllllllllllIllIIIlIlllllIlIIIIl, llllllllllllIllIIIlIlllllIIlIIlI, llllllllllllIllIIIlIlllllIIlIIIl);
        if (lIIllIllIIlllIll(llllllllllllIllIIIlIlllllIIllIII)) {
            return new Torch(llllllllllllIllIIIlIlllllIlIIlIl, llllllllllllIllIIIlIlllllIIlIIII, llllllllllllIllIIIlIlllllIlIIIll, llllllllllllIllIIIlIlllllIIllIII, llllllllllllIllIIIlIlllllIIlIIIl);
        }
        return null;
    }
    
    private static boolean lIIllIllIIlllIll(final Object llllllllllllIllIIIlIlllIllIIlIll) {
        return llllllllllllIllIIIlIlllIllIIlIll != null;
    }
    
    private static StructureComponent func_176069_e(final Start llllllllllllIllIIIlIllllIlIlIIII, final List<StructureComponent> llllllllllllIllIIIlIllllIlIIllll, final Random llllllllllllIllIIIlIllllIlIIlllI, final int llllllllllllIllIIIlIllllIlIIllIl, final int llllllllllllIllIIIlIllllIIllllIl, final int llllllllllllIllIIIlIllllIIllllII, final EnumFacing llllllllllllIllIIIlIllllIIlllIll, final int llllllllllllIllIIIlIllllIlIIlIIl) {
        if (lIIllIllIIlllIlI(llllllllllllIllIIIlIllllIlIIlIIl, StructureVillagePieces.llIlllllIlIlII[3] + llllllllllllIllIIIlIllllIlIlIIII.terrainType)) {
            return null;
        }
        if (lIIllIllIIllllIl(Math.abs(llllllllllllIllIIIlIllllIlIIllIl - llllllllllllIllIIIlIllllIlIlIIII.getBoundingBox().minX), StructureVillagePieces.llIlllllIlIlII[17]) && lIIllIllIIllllIl(Math.abs(llllllllllllIllIIIlIllllIIllllII - llllllllllllIllIIIlIllllIlIlIIII.getBoundingBox().minZ), StructureVillagePieces.llIlllllIlIlII[17])) {
            final StructureBoundingBox llllllllllllIllIIIlIllllIlIIlIII = Path.func_175848_a(llllllllllllIllIIIlIllllIlIlIIII, llllllllllllIllIIIlIllllIlIIllll, llllllllllllIllIIIlIllllIlIIlllI, llllllllllllIllIIIlIllllIlIIllIl, llllllllllllIllIIIlIllllIIllllIl, llllllllllllIllIIIlIllllIIllllII, llllllllllllIllIIIlIllllIIlllIll);
            if (lIIllIllIIlllIll(llllllllllllIllIIIlIllllIlIIlIII) && lIIllIllIIlllIlI(llllllllllllIllIIIlIllllIlIIlIII.minY, StructureVillagePieces.llIlllllIlIlII[10])) {
                final StructureComponent llllllllllllIllIIIlIllllIlIIIlll = new Path(llllllllllllIllIIIlIllllIlIlIIII, llllllllllllIllIIIlIllllIlIIlIIl, llllllllllllIllIIIlIllllIlIIlllI, llllllllllllIllIIIlIllllIlIIlIII, llllllllllllIllIIIlIllllIIlllIll);
                final int llllllllllllIllIIIlIllllIlIIIllI = (llllllllllllIllIIIlIllllIlIIIlll.boundingBox.minX + llllllllllllIllIIIlIllllIlIIIlll.boundingBox.maxX) / StructureVillagePieces.llIlllllIlIlII[2];
                final int llllllllllllIllIIIlIllllIlIIIlIl = (llllllllllllIllIIIlIllllIlIIIlll.boundingBox.minZ + llllllllllllIllIIIlIllllIlIIIlll.boundingBox.maxZ) / StructureVillagePieces.llIlllllIlIlII[2];
                final int llllllllllllIllIIIlIllllIlIIIlII = llllllllllllIllIIIlIllllIlIIIlll.boundingBox.maxX - llllllllllllIllIIIlIllllIlIIIlll.boundingBox.minX;
                final int llllllllllllIllIIIlIllllIlIIIIll = llllllllllllIllIIIlIllllIlIIIlll.boundingBox.maxZ - llllllllllllIllIIIlIllllIlIIIlll.boundingBox.minZ;
                int n;
                if (lIIllIllIIlllIlI(llllllllllllIllIIIlIllllIlIIIlII, llllllllllllIllIIIlIllllIlIIIIll)) {
                    n = llllllllllllIllIIIlIllllIlIIIlII;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    n = llllllllllllIllIIIlIllllIlIIIIll;
                }
                final int llllllllllllIllIIIlIllllIlIIIIlI = n;
                if (lIIllIllIIllIllI(llllllllllllIllIIIlIllllIlIlIIII.getWorldChunkManager().areBiomesViable(llllllllllllIllIIIlIllllIlIIIllI, llllllllllllIllIIIlIllllIlIIIlIl, llllllllllllIllIIIlIllllIlIIIIlI / StructureVillagePieces.llIlllllIlIlII[2] + StructureVillagePieces.llIlllllIlIlII[4], MapGenVillage.villageSpawnBiomes) ? 1 : 0)) {
                    llllllllllllIllIIIlIllllIlIIllll.add(llllllllllllIllIIIlIllllIlIIIlll);
                    "".length();
                    llllllllllllIllIIIlIllllIlIlIIII.field_74930_j.add(llllllllllllIllIIIlIllllIlIIIlll);
                    "".length();
                    return llllllllllllIllIIIlIllllIlIIIlll;
                }
            }
            return null;
        }
        return null;
    }
    
    private static boolean lIIllIllIIllIlIl(final int llllllllllllIllIIIlIlllIllIllIlI, final int llllllllllllIllIIIlIlllIllIllIIl) {
        return llllllllllllIllIIIlIlllIllIllIlI < llllllllllllIllIIIlIlllIllIllIIl;
    }
    
    static {
        lIIllIllIIllIIlI();
        lIIllIllIIIlIlII();
    }
    
    private static StructureComponent func_176066_d(final Start llllllllllllIllIIIlIllllIllllIll, final List<StructureComponent> llllllllllllIllIIIlIllllIllllIlI, final Random llllllllllllIllIIIlIllllIllIlIll, final int llllllllllllIllIIIlIllllIllllIII, final int llllllllllllIllIIIlIllllIlllIlll, final int llllllllllllIllIIIlIllllIlllIllI, final EnumFacing llllllllllllIllIIIlIllllIlllIlIl, final int llllllllllllIllIIIlIllllIllIIllI) {
        if (lIIllIllIIlllIlI(llllllllllllIllIIIlIllllIllIIllI, StructureVillagePieces.llIlllllIlIlII[16])) {
            return null;
        }
        if (lIIllIllIIllllIl(Math.abs(llllllllllllIllIIIlIllllIllllIII - llllllllllllIllIIIlIllllIllllIll.getBoundingBox().minX), StructureVillagePieces.llIlllllIlIlII[17]) && lIIllIllIIllllIl(Math.abs(llllllllllllIllIIIlIllllIlllIllI - llllllllllllIllIIIlIllllIllllIll.getBoundingBox().minZ), StructureVillagePieces.llIlllllIlIlII[17])) {
            final StructureComponent llllllllllllIllIIIlIllllIlllIIll = func_176067_c(llllllllllllIllIIIlIllllIllllIll, llllllllllllIllIIIlIllllIllllIlI, llllllllllllIllIIIlIllllIllIlIll, llllllllllllIllIIIlIllllIllllIII, llllllllllllIllIIIlIllllIlllIlll, llllllllllllIllIIIlIllllIlllIllI, llllllllllllIllIIIlIllllIlllIlIl, llllllllllllIllIIIlIllllIllIIllI + StructureVillagePieces.llIlllllIlIlII[1]);
            if (lIIllIllIIlllIll(llllllllllllIllIIIlIllllIlllIIll)) {
                final int llllllllllllIllIIIlIllllIlllIIlI = (llllllllllllIllIIIlIllllIlllIIll.boundingBox.minX + llllllllllllIllIIIlIllllIlllIIll.boundingBox.maxX) / StructureVillagePieces.llIlllllIlIlII[2];
                final int llllllllllllIllIIIlIllllIlllIIIl = (llllllllllllIllIIIlIllllIlllIIll.boundingBox.minZ + llllllllllllIllIIIlIllllIlllIIll.boundingBox.maxZ) / StructureVillagePieces.llIlllllIlIlII[2];
                final int llllllllllllIllIIIlIllllIlllIIII = llllllllllllIllIIIlIllllIlllIIll.boundingBox.maxX - llllllllllllIllIIIlIllllIlllIIll.boundingBox.minX;
                final int llllllllllllIllIIIlIllllIllIllll = llllllllllllIllIIIlIllllIlllIIll.boundingBox.maxZ - llllllllllllIllIIIlIllllIlllIIll.boundingBox.minZ;
                int n;
                if (lIIllIllIIlllIlI(llllllllllllIllIIIlIllllIlllIIII, llllllllllllIllIIIlIllllIllIllll)) {
                    n = llllllllllllIllIIIlIllllIlllIIII;
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return null;
                    }
                }
                else {
                    n = llllllllllllIllIIIlIllllIllIllll;
                }
                final int llllllllllllIllIIIlIllllIllIlllI = n;
                if (lIIllIllIIllIllI(llllllllllllIllIIIlIllllIllllIll.getWorldChunkManager().areBiomesViable(llllllllllllIllIIIlIllllIlllIIlI, llllllllllllIllIIIlIllllIlllIIIl, llllllllllllIllIIIlIllllIllIlllI / StructureVillagePieces.llIlllllIlIlII[2] + StructureVillagePieces.llIlllllIlIlII[4], MapGenVillage.villageSpawnBiomes) ? 1 : 0)) {
                    llllllllllllIllIIIlIllllIllllIlI.add(llllllllllllIllIIIlIllllIlllIIll);
                    "".length();
                    llllllllllllIllIIIlIllllIllllIll.field_74932_i.add(llllllllllllIllIIIlIllllIlllIIll);
                    "".length();
                    return llllllllllllIllIIIlIllllIlllIIll;
                }
            }
            return null;
        }
        return null;
    }
    
    private static boolean lIIllIllIIllIlII(final int llllllllllllIllIIIlIlllIllIIIIIl) {
        return llllllllllllIllIIIlIlllIllIIIIIl > 0;
    }
    
    private static String lIIllIllIIIlIIIl(final String llllllllllllIllIIIlIlllIlllIIlII, final String llllllllllllIllIIIlIlllIlllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlllIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StructureVillagePieces.llIlllllIlIlII[8]), "DES");
            final Cipher llllllllllllIllIIIlIlllIlllIlIII = Cipher.getInstance("DES");
            llllllllllllIllIIIlIlllIlllIlIII.init(StructureVillagePieces.llIlllllIlIlII[2], llllllllllllIllIIIlIlllIlllIlIIl);
            return new String(llllllllllllIllIIIlIlllIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlllIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlllIlllIIlll) {
            llllllllllllIllIIIlIlllIlllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIllIIlllIlI(final int llllllllllllIllIIIlIlllIllIlIIlI, final int llllllllllllIllIIIlIlllIllIlIIIl) {
        return llllllllllllIllIIIlIlllIllIlIIlI > llllllllllllIllIIIlIlllIllIlIIIl;
    }
    
    private static void lIIllIllIIIlIlII() {
        (llIlllllIIIlll = new String[StructureVillagePieces.llIlllllIlIlII[18]])[StructureVillagePieces.llIlllllIlIlII[0]] = lIIllIllIIIIllll("7VL1ZF/M9Gk=", "SPRjY");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[1]] = lIIllIllIIIlIIII("HTsiPA==", "KRfzq");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[2]] = lIIllIllIIIlIIIl("zV3jQpkI0r8=", "txTtc");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[3]] = lIIllIllIIIlIIIl("giTdjFWXrWM=", "eDJFm");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[4]] = lIIllIllIIIIllll("WPNL+/AuGGo=", "ixCuY");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[5]] = lIIllIllIIIIllll("pGUKYSfi39Q=", "XzRIK");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[6]] = lIIllIllIIIlIIII("GhgnDBg=", "LqtaP");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[7]] = lIIllIllIIIIllll("DQBy2GyFMCs=", "TmKTT");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[8]] = lIIllIllIIIlIIII("BQYh", "SorEY");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[9]] = lIIllIllIIIlIIII("IjgaPBIGJQ==", "tQIHs");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[10]] = lIIllIllIIIlIIIl("N3ogiXMl0ts=", "miMtT");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[11]] = lIIllIllIIIlIIII("MwwECwk=", "eePYA");
        StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[12]] = lIIllIllIIIlIIII("PiAN", "hIZyZ");
    }
    
    public static void registerVillagePieces() {
        MapGenStructureIO.registerStructureComponent(House1.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[0]]);
        MapGenStructureIO.registerStructureComponent(Field1.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[1]]);
        MapGenStructureIO.registerStructureComponent(Field2.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[2]]);
        MapGenStructureIO.registerStructureComponent(Torch.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[3]]);
        MapGenStructureIO.registerStructureComponent(Hall.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[4]]);
        MapGenStructureIO.registerStructureComponent(House4Garden.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[5]]);
        MapGenStructureIO.registerStructureComponent(WoodHut.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[6]]);
        MapGenStructureIO.registerStructureComponent(Church.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[7]]);
        MapGenStructureIO.registerStructureComponent(House2.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[8]]);
        MapGenStructureIO.registerStructureComponent(Start.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[9]]);
        MapGenStructureIO.registerStructureComponent(Path.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[10]]);
        MapGenStructureIO.registerStructureComponent(House3.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[11]]);
        MapGenStructureIO.registerStructureComponent(Well.class, StructureVillagePieces.llIlllllIIIlll[StructureVillagePieces.llIlllllIlIlII[12]]);
    }
    
    public static class Well extends Village
    {
        private static final /* synthetic */ int[] lIllIIlIlIIlIl;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIIIIllllllIlIIIlI, final Random lllllllllllllIIIIIIllllllIlIIIIl, final StructureBoundingBox lllllllllllllIIIIIIllllllIlIIIII) {
            if (lllllIIlllIIllI(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(lllllllllllllIIIIIIllllllIlIIIlI, lllllllllllllIIIIIIllllllIlIIIII);
                if (lllllIIlllIIllI(this.field_143015_k)) {
                    return Well.lIllIIlIlIIlIl[2] != 0;
                }
                this.boundingBox.offset(Well.lIllIIlIlIIlIl[5], this.field_143015_k - this.boundingBox.maxY + Well.lIllIIlIlIIlIl[6], Well.lIllIIlIlIIlIl[5]);
            }
            this.fillWithBlocks(lllllllllllllIIIIIIllllllIlIIIlI, lllllllllllllIIIIIIllllllIlIIIII, Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[5], Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[4], Well.lIllIIlIlIIlIl[7], Well.lIllIIlIlIIlIl[4], Blocks.cobblestone.getDefaultState(), Blocks.flowing_water.getDefaultState(), (boolean)(Well.lIllIIlIlIIlIl[5] != 0));
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.air.getDefaultState(), Well.lIllIIlIlIIlIl[8], Well.lIllIIlIlIIlIl[7], Well.lIllIIlIlIIlIl[8], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.air.getDefaultState(), Well.lIllIIlIlIIlIl[6], Well.lIllIIlIlIIlIl[7], Well.lIllIIlIlIIlIl[8], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.air.getDefaultState(), Well.lIllIIlIlIIlIl[8], Well.lIllIIlIlIIlIl[7], Well.lIllIIlIlIIlIl[6], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.air.getDefaultState(), Well.lIllIIlIlIIlIl[6], Well.lIllIIlIlIIlIl[7], Well.lIllIIlIlIIlIl[6], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[9], Well.lIllIIlIlIIlIl[2], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[10], Well.lIllIIlIlIIlIl[2], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[4], Well.lIllIIlIlIIlIl[9], Well.lIllIIlIlIIlIl[2], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[4], Well.lIllIIlIlIIlIl[10], Well.lIllIIlIlIIlIl[2], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[9], Well.lIllIIlIlIIlIl[4], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[10], Well.lIllIIlIlIIlIl[4], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[4], Well.lIllIIlIlIIlIl[9], Well.lIllIIlIlIIlIl[4], lllllllllllllIIIIIIllllllIlIIIII);
            this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.oak_fence.getDefaultState(), Well.lIllIIlIlIIlIl[4], Well.lIllIIlIlIIlIl[10], Well.lIllIIlIlIIlIl[4], lllllllllllllIIIIIIllllllIlIIIII);
            this.fillWithBlocks(lllllllllllllIIIIIIllllllIlIIIlI, lllllllllllllIIIIIIllllllIlIIIII, Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[11], Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[4], Well.lIllIIlIlIIlIl[11], Well.lIllIIlIlIIlIl[4], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Well.lIllIIlIlIIlIl[5] != 0));
            int lllllllllllllIIIIIIllllllIIlllll = Well.lIllIIlIlIIlIl[5];
            "".length();
            if (((0xA0 ^ 0x8F) & ~(0x30 ^ 0x1F)) != 0x0) {
                return ((0x58 ^ 0x9) & ~(0xEE ^ 0xBF)) != 0x0;
            }
            while (!lllllIIlllIlIlI(lllllllllllllIIIIIIllllllIIlllll, Well.lIllIIlIlIIlIl[12])) {
                int lllllllllllllIIIIIIllllllIIllllI = Well.lIllIIlIlIIlIl[5];
                "".length();
                if (null != null) {
                    return ((0x6 ^ 0x32) & ~(0x86 ^ 0xB2)) != 0x0;
                }
                while (!lllllIIlllIlIlI(lllllllllllllIIIIIIllllllIIllllI, Well.lIllIIlIlIIlIl[12])) {
                    if (!lllllIIlllIIlll(lllllllllllllIIIIIIllllllIIllllI) || !lllllIIlllIlIII(lllllllllllllIIIIIIllllllIIllllI, Well.lIllIIlIlIIlIl[12]) || !lllllIIlllIIlll(lllllllllllllIIIIIIllllllIIlllll) || lllllIIlllIlIIl(lllllllllllllIIIIIIllllllIIlllll, Well.lIllIIlIlIIlIl[12])) {
                        this.setBlockState(lllllllllllllIIIIIIllllllIlIIIlI, Blocks.gravel.getDefaultState(), lllllllllllllIIIIIIllllllIIllllI, Well.lIllIIlIlIIlIl[13], lllllllllllllIIIIIIllllllIIlllll, lllllllllllllIIIIIIllllllIlIIIII);
                        this.clearCurrentPositionBlocksUpwards(lllllllllllllIIIIIIllllllIlIIIlI, lllllllllllllIIIIIIllllllIIllllI, Well.lIllIIlIlIIlIl[7], lllllllllllllIIIIIIllllllIIlllll, lllllllllllllIIIIIIllllllIlIIIII);
                    }
                    ++lllllllllllllIIIIIIllllllIIllllI;
                }
                ++lllllllllllllIIIIIIllllllIIlllll;
            }
            return Well.lIllIIlIlIIlIl[2] != 0;
        }
        
        private static boolean lllllIIlllIlIII(final int lllllllllllllIIIIIIllllllIIIIllI, final int lllllllllllllIIIIIIllllllIIIIlIl) {
            return lllllllllllllIIIIIIllllllIIIIllI != lllllllllllllIIIIIIllllllIIIIlIl;
        }
        
        public Well(final Start lllllllllllllIIIIIIllllllIlllIIl, final int lllllllllllllIIIIIIllllllIlllIII, final Random lllllllllllllIIIIIIllllllIllllIl, final int lllllllllllllIIIIIIllllllIllllII, final int lllllllllllllIIIIIIllllllIllIlIl) {
            super(lllllllllllllIIIIIIllllllIlllIIl, lllllllllllllIIIIIIllllllIlllIII);
            this.coordBaseMode = EnumFacing.Plane.HORIZONTAL.random(lllllllllllllIIIIIIllllllIllllIl);
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                case 3:
                case 4: {
                    this.boundingBox = new StructureBoundingBox(lllllllllllllIIIIIIllllllIllllII, Well.lIllIIlIlIIlIl[0], lllllllllllllIIIIIIllllllIllIlIl, lllllllllllllIIIIIIllllllIllllII + Well.lIllIIlIlIIlIl[1] - Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[3], lllllllllllllIIIIIIllllllIllIlIl + Well.lIllIIlIlIIlIl[1] - Well.lIllIIlIlIIlIl[2]);
                    "".length();
                    if ("   ".length() == "  ".length()) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.boundingBox = new StructureBoundingBox(lllllllllllllIIIIIIllllllIllllII, Well.lIllIIlIlIIlIl[0], lllllllllllllIIIIIIllllllIllIlIl, lllllllllllllIIIIIIllllllIllllII + Well.lIllIIlIlIIlIl[1] - Well.lIllIIlIlIIlIl[2], Well.lIllIIlIlIIlIl[3], lllllllllllllIIIIIIllllllIllIlIl + Well.lIllIIlIlIIlIl[1] - Well.lIllIIlIlIIlIl[2]);
                    break;
                }
            }
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIIIIIIllllllIlIlIll, final List<StructureComponent> lllllllllllllIIIIIIllllllIlIlllI, final Random lllllllllllllIIIIIIllllllIlIllIl) {
            func_176069_e((Start)lllllllllllllIIIIIIllllllIlIlIll, lllllllllllllIIIIIIllllllIlIlllI, lllllllllllllIIIIIIllllllIlIllIl, this.boundingBox.minX - Well.lIllIIlIlIIlIl[2], this.boundingBox.maxY - Well.lIllIIlIlIIlIl[4], this.boundingBox.minZ + Well.lIllIIlIlIIlIl[2], EnumFacing.WEST, this.getComponentType());
            "".length();
            func_176069_e((Start)lllllllllllllIIIIIIllllllIlIlIll, lllllllllllllIIIIIIllllllIlIlllI, lllllllllllllIIIIIIllllllIlIllIl, this.boundingBox.maxX + Well.lIllIIlIlIIlIl[2], this.boundingBox.maxY - Well.lIllIIlIlIIlIl[4], this.boundingBox.minZ + Well.lIllIIlIlIIlIl[2], EnumFacing.EAST, this.getComponentType());
            "".length();
            func_176069_e((Start)lllllllllllllIIIIIIllllllIlIlIll, lllllllllllllIIIIIIllllllIlIlllI, lllllllllllllIIIIIIllllllIlIllIl, this.boundingBox.minX + Well.lIllIIlIlIIlIl[2], this.boundingBox.maxY - Well.lIllIIlIlIIlIl[4], this.boundingBox.minZ - Well.lIllIIlIlIIlIl[2], EnumFacing.NORTH, this.getComponentType());
            "".length();
            func_176069_e((Start)lllllllllllllIIIIIIllllllIlIlIll, lllllllllllllIIIIIIllllllIlIlllI, lllllllllllllIIIIIIllllllIlIllIl, this.boundingBox.minX + Well.lIllIIlIlIIlIl[2], this.boundingBox.maxY - Well.lIllIIlIlIIlIl[4], this.boundingBox.maxZ + Well.lIllIIlIlIIlIl[2], EnumFacing.SOUTH, this.getComponentType());
            "".length();
        }
        
        private static boolean lllllIIlllIIlll(final int lllllllllllllIIIIIIllllllIIIlIll) {
            return lllllllllllllIIIIIIllllllIIIlIll != 0;
        }
        
        private static boolean lllllIIlllIlIIl(final int lllllllllllllIIIIIIllllllIIlIlII, final int lllllllllllllIIIIIIllllllIIlIIll) {
            return lllllllllllllIIIIIIllllllIIlIlII == lllllllllllllIIIIIIllllllIIlIIll;
        }
        
        private static boolean lllllIIlllIlIlI(final int lllllllllllllIIIIIIllllllIIlIIII, final int lllllllllllllIIIIIIllllllIIIllll) {
            return lllllllllllllIIIIIIllllllIIlIIII > lllllllllllllIIIIIIllllllIIIllll;
        }
        
        public Well() {
        }
        
        private static boolean lllllIIlllIlIll(final Object lllllllllllllIIIIIIllllllIIIllIl) {
            return lllllllllllllIIIIIIllllllIIIllIl != null;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Well.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lllllIIlllIlIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final short lllllllllllllIIIIIIllllllIIlIlll = (Object)new int[EnumFacing.values().length];
            try {
                lllllllllllllIIIIIIllllllIIlIlll[EnumFacing.DOWN.ordinal()] = Well.lIllIIlIlIIlIl[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIIIIIIllllllIIlIlll[EnumFacing.EAST.ordinal()] = Well.lIllIIlIlIIlIl[1];
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIIIIIIllllllIIlIlll[EnumFacing.NORTH.ordinal()] = Well.lIllIIlIlIIlIl[6];
                "".length();
                if ((0x1B ^ 0x3 ^ (0xBC ^ 0xA0)) != (0x4B ^ 0x5C ^ (0x62 ^ 0x71))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIIIIIIllllllIIlIlll[EnumFacing.SOUTH.ordinal()] = Well.lIllIIlIlIIlIl[4];
                "".length();
                if (((0xF2 ^ 0x8F ^ (0x51 ^ 0x20)) & (0x3A ^ 0x57 ^ (0x7F ^ 0x1E) ^ -" ".length())) < -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                lllllllllllllIIIIIIllllllIIlIlll[EnumFacing.UP.ordinal()] = Well.lIllIIlIlIIlIl[8];
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                lllllllllllllIIIIIIllllllIIlIlll[EnumFacing.WEST.ordinal()] = Well.lIllIIlIlIIlIl[12];
                "".length();
                if ((0xD3 ^ 0xBD ^ (0x52 ^ 0x38)) < " ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Well.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIIIIIllllllIIlIlll;
        }
        
        private static void lllllIIlllIIlIl() {
            (lIllIIlIlIIlIl = new int[14])[0] = (0x2D ^ 0x6D);
            Well.lIllIIlIlIIlIl[1] = (0x11 ^ 0x17);
            Well.lIllIIlIlIIlIl[2] = " ".length();
            Well.lIllIIlIlIIlIl[3] = (108 + 8 - 86 + 111 ^ 126 + 154 - 269 + 184);
            Well.lIllIIlIlIIlIl[4] = (98 + 111 - 149 + 75 ^ 62 + 119 - 127 + 77);
            Well.lIllIIlIlIIlIl[5] = ((0xE5 ^ 0xC0 ^ (0xBD ^ 0xB3)) & (0x40 ^ 0x46 ^ (0x5C ^ 0x71) ^ -" ".length()));
            Well.lIllIIlIlIIlIl[6] = "   ".length();
            Well.lIllIIlIlIIlIl[7] = (1 + 168 - 95 + 96 ^ 141 + 143 - 243 + 125);
            Well.lIllIIlIlIIlIl[8] = "  ".length();
            Well.lIllIIlIlIIlIl[9] = (0xAF ^ 0xA2);
            Well.lIllIIlIlIIlIl[10] = (0x4E ^ 0x40);
            Well.lIllIIlIlIIlIl[11] = (0x5 ^ 0xA);
            Well.lIllIIlIlIIlIl[12] = (0x10 ^ 0x9 ^ (0x64 ^ 0x78));
            Well.lIllIIlIlIIlIl[13] = (0xF ^ 0x4);
        }
        
        static {
            lllllIIlllIIlIl();
        }
        
        private static boolean lllllIIlllIIllI(final int lllllllllllllIIIIIIllllllIIIlIIl) {
            return lllllllllllllIIIIIIllllllIIIlIIl < 0;
        }
    }
    
    abstract static class Village extends StructureComponent
    {
        private /* synthetic */ int villagersSpawned;
        private static final /* synthetic */ String[] lIllIlllIlIIIl;
        protected /* synthetic */ int field_143015_k;
        private static final /* synthetic */ int[] lIllIlllIlIlIl;
        private /* synthetic */ boolean isDesertVillage;
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Village.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIIIIIIIIlllIIl($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final float llllllllllllIllllllIIllIIIllllll = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIllllllIIllIIIllllll[EnumFacing.DOWN.ordinal()] = Village.lIllIlllIlIlIl[2];
                "".length();
                if (((0xA2 ^ 0x8C) & ~(0x8B ^ 0xA5)) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIllllllIIllIIIllllll[EnumFacing.EAST.ordinal()] = Village.lIllIlllIlIlIl[9];
                "".length();
                if ("  ".length() <= ((175 + 121 - 205 + 90 ^ 113 + 76 - 94 + 36) & (0xB0 ^ 0x94 ^ (0x23 ^ 0x31) ^ -" ".length()))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIllllllIIllIIIllllll[EnumFacing.NORTH.ordinal()] = Village.lIllIlllIlIlIl[4];
                "".length();
                if (" ".length() < ((0x8B ^ 0x94) & ~(0x83 ^ 0x9C))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIllllllIIllIIIllllll[EnumFacing.SOUTH.ordinal()] = Village.lIllIlllIlIlIl[5];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIllllllIIllIIIllllll[EnumFacing.UP.ordinal()] = Village.lIllIlllIlIlIl[3];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIllllllIIllIIIllllll[EnumFacing.WEST.ordinal()] = Village.lIllIlllIlIlIl[6];
                "".length();
                if (-" ".length() == " ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Village.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIllllllIIllIIIllllll;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllllllIIlllIllIIIII) {
            this.field_143015_k = llllllllllllIllllllIIlllIllIIIII.getInteger(Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[4]]);
            this.villagersSpawned = llllllllllllIllllllIIlllIllIIIII.getInteger(Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[5]]);
            this.isDesertVillage = llllllllllllIllllllIIlllIllIIIII.getBoolean(Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[6]]);
        }
        
        static {
            lIIIIIIIIIlllIII();
            lIIIIIIIIIllIIll();
        }
        
        private static String lIIIIIIIIIlIllll(String llllllllllllIllllllIIllIIIIlIlIl, final String llllllllllllIllllllIIllIIIIlIlII) {
            llllllllllllIllllllIIllIIIIlIlIl = new String(Base64.getDecoder().decode(llllllllllllIllllllIIllIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllllIIllIIIIllIII = new StringBuilder();
            final char[] llllllllllllIllllllIIllIIIIlIlll = llllllllllllIllllllIIllIIIIlIlII.toCharArray();
            int llllllllllllIllllllIIllIIIIlIllI = Village.lIllIlllIlIlIl[1];
            final boolean llllllllllllIllllllIIllIIIIlIIII = (Object)llllllllllllIllllllIIllIIIIlIlIl.toCharArray();
            final boolean llllllllllllIllllllIIllIIIIIllll = llllllllllllIllllllIIllIIIIlIIII.length != 0;
            char llllllllllllIllllllIIllIIIIIlllI = (char)Village.lIllIlllIlIlIl[1];
            while (lIIIIIIIIIllllIl(llllllllllllIllllllIIllIIIIIlllI, llllllllllllIllllllIIllIIIIIllll ? 1 : 0)) {
                final char llllllllllllIllllllIIllIIIIllIll = llllllllllllIllllllIIllIIIIlIIII[llllllllllllIllllllIIllIIIIIlllI];
                llllllllllllIllllllIIllIIIIllIII.append((char)(llllllllllllIllllllIIllIIIIllIll ^ llllllllllllIllllllIIllIIIIlIlll[llllllllllllIllllllIIllIIIIlIllI % llllllllllllIllllllIIllIIIIlIlll.length]));
                "".length();
                ++llllllllllllIllllllIIllIIIIlIllI;
                ++llllllllllllIllllllIIllIIIIIlllI;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllllIIllIIIIllIII);
        }
        
        private static boolean lIIIIIIIIlIIIIII(final Object llllllllllllIllllllIIlIllllllIII, final Object llllllllllllIllllllIIlIlllllIlll) {
            return llllllllllllIllllllIIlIllllllIII == llllllllllllIllllllIIlIlllllIlll;
        }
        
        protected static boolean canVillageGoDeeper(final StructureBoundingBox llllllllllllIllllllIIlllIIIIIlII) {
            if (lIIIIIIIIIlllIIl(llllllllllllIllllllIIlllIIIIIlII) && lIIIIIIIIIlllIll(llllllllllllIllllllIIlllIIIIIlII.minY, Village.lIllIlllIlIlIl[8])) {
                return Village.lIllIlllIlIlIl[2] != 0;
            }
            return Village.lIllIlllIlIlIl[1] != 0;
        }
        
        private static String lIIIIIIIIIlIlllI(final String llllllllllllIllllllIIllIIIlIlIlI, final String llllllllllllIllllllIIllIIIlIlIIl) {
            try {
                final SecretKeySpec llllllllllllIllllllIIllIIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllllIIllIIIlIllII = Cipher.getInstance("Blowfish");
                llllllllllllIllllllIIllIIIlIllII.init(Village.lIllIlllIlIlIl[3], llllllllllllIllllllIIllIIIlIllIl);
                return new String(llllllllllllIllllllIIllIIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIllIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIIllIIIlIlIll) {
                llllllllllllIllllllIIllIIIlIlIll.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllllllIIlllIllIIlII) {
            llllllllllllIllllllIIlllIllIIlII.setInteger(Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[1]], this.field_143015_k);
            llllllllllllIllllllIIlllIllIIlII.setInteger(Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[2]], this.villagersSpawned);
            llllllllllllIllllllIIlllIllIIlII.setBoolean(Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[3]], this.isDesertVillage);
        }
        
        private static boolean lIIIIIIIIIlllIIl(final Object llllllllllllIllllllIIlIllllllIll) {
            return llllllllllllIllllllIIlIllllllIll != null;
        }
        
        protected int func_180779_c(final int llllllllllllIllllllIIllIlIllllII, final int llllllllllllIllllllIIllIlIlllIIl) {
            return llllllllllllIllllllIIllIlIlllIIl;
        }
        
        private static boolean lIIIIIIIIIlllIlI(final int llllllllllllIllllllIIlIlllllIlIl) {
            return llllllllllllIllllllIIlIlllllIlIl != 0;
        }
        
        protected Village(final Start llllllllllllIllllllIIlllIllIlllI, final int llllllllllllIllllllIIlllIllIlIlI) {
            super(llllllllllllIllllllIIlllIllIlIlI);
            this.field_143015_k = Village.lIllIlllIlIlIl[0];
            if (lIIIIIIIIIlllIIl(llllllllllllIllllllIIlllIllIlllI)) {
                this.isDesertVillage = llllllllllllIllllllIIlllIllIlllI.inDesert;
            }
        }
        
        protected StructureComponent getNextComponentNN(final Start llllllllllllIllllllIIlllIlIlIIII, final List<StructureComponent> llllllllllllIllllllIIlllIlIlIlIl, final Random llllllllllllIllllllIIlllIlIlIlII, final int llllllllllllIllllllIIlllIlIIllIl, final int llllllllllllIllllllIIlllIlIIllII) {
            if (lIIIIIIIIIlllIIl(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIlIIII, llllllllllllIllllllIIlllIlIlIlIl, llllllllllllIllllllIIlllIlIlIlII, this.boundingBox.minX - Village.lIllIlllIlIlIl[2], this.boundingBox.minY + llllllllllllIllllllIIlllIlIIllIl, this.boundingBox.minZ + llllllllllllIllllllIIlllIlIIllII, EnumFacing.WEST, this.getComponentType());
                    }
                    case 4: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIlIIII, llllllllllllIllllllIIlllIlIlIlIl, llllllllllllIllllllIIlllIlIlIlII, this.boundingBox.minX - Village.lIllIlllIlIlIl[2], this.boundingBox.minY + llllllllllllIllllllIIlllIlIIllIl, this.boundingBox.minZ + llllllllllllIllllllIIlllIlIIllII, EnumFacing.WEST, this.getComponentType());
                    }
                    case 5: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIlIIII, llllllllllllIllllllIIlllIlIlIlIl, llllllllllllIllllllIIlllIlIlIlII, this.boundingBox.minX + llllllllllllIllllllIIlllIlIIllII, this.boundingBox.minY + llllllllllllIllllllIIlllIlIIllIl, this.boundingBox.minZ - Village.lIllIlllIlIlIl[2], EnumFacing.NORTH, this.getComponentType());
                    }
                    case 6: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIlIIII, llllllllllllIllllllIIlllIlIlIlIl, llllllllllllIllllllIIlllIlIlIlII, this.boundingBox.minX + llllllllllllIllllllIIlllIlIIllII, this.boundingBox.minY + llllllllllllIllllllIIlllIlIIllIl, this.boundingBox.minZ - Village.lIllIlllIlIlIl[2], EnumFacing.NORTH, this.getComponentType());
                    }
                }
            }
            return null;
        }
        
        private static boolean lIIIIIIIIIlllIll(final int llllllllllllIllllllIIllIIIIIIIlI, final int llllllllllllIllllllIIllIIIIIIIIl) {
            return llllllllllllIllllllIIllIIIIIIIlI > llllllllllllIllllllIIllIIIIIIIIl;
        }
        
        protected void func_175846_a(final boolean llllllllllllIllllllIIllIIlIIIIIl) {
            this.isDesertVillage = llllllllllllIllllllIIllIIlIIIIIl;
        }
        
        protected StructureComponent getNextComponentPP(final Start llllllllllllIllllllIIlllIlIIIlII, final List<StructureComponent> llllllllllllIllllllIIlllIlIIIIll, final Random llllllllllllIllllllIIlllIIlllIlI, final int llllllllllllIllllllIIlllIlIIIIII, final int llllllllllllIllllllIIlllIIllllll) {
            if (lIIIIIIIIIlllIIl(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIIIlII, llllllllllllIllllllIIlllIlIIIIll, llllllllllllIllllllIIlllIIlllIlI, this.boundingBox.maxX + Village.lIllIlllIlIlIl[2], this.boundingBox.minY + llllllllllllIllllllIIlllIlIIIIII, this.boundingBox.minZ + llllllllllllIllllllIIlllIIllllll, EnumFacing.EAST, this.getComponentType());
                    }
                    case 4: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIIIlII, llllllllllllIllllllIIlllIlIIIIll, llllllllllllIllllllIIlllIIlllIlI, this.boundingBox.maxX + Village.lIllIlllIlIlIl[2], this.boundingBox.minY + llllllllllllIllllllIIlllIlIIIIII, this.boundingBox.minZ + llllllllllllIllllllIIlllIIllllll, EnumFacing.EAST, this.getComponentType());
                    }
                    case 5: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIIIlII, llllllllllllIllllllIIlllIlIIIIll, llllllllllllIllllllIIlllIIlllIlI, this.boundingBox.minX + llllllllllllIllllllIIlllIIllllll, this.boundingBox.minY + llllllllllllIllllllIIlllIlIIIIII, this.boundingBox.maxZ + Village.lIllIlllIlIlIl[2], EnumFacing.SOUTH, this.getComponentType());
                    }
                    case 6: {
                        return func_176066_d(llllllllllllIllllllIIlllIlIIIlII, llllllllllllIllllllIIlllIlIIIIll, llllllllllllIllllllIIlllIIlllIlI, this.boundingBox.minX + llllllllllllIllllllIIlllIIllllll, this.boundingBox.minY + llllllllllllIllllllIIlllIlIIIIII, this.boundingBox.maxZ + Village.lIllIlllIlIlIl[2], EnumFacing.SOUTH, this.getComponentType());
                    }
                }
            }
            return null;
        }
        
        private static boolean lIIIIIIIIIlllllI(final int llllllllllllIllllllIIllIIIIIlIlI, final int llllllllllllIllllllIIllIIIIIlIIl) {
            return llllllllllllIllllllIIllIIIIIlIlI >= llllllllllllIllllllIIllIIIIIlIIl;
        }
        
        private static String lIIIIIIIIIllIIII(final String llllllllllllIllllllIIllIIIllIlIl, final String llllllllllllIllllllIIllIIIllIllI) {
            try {
                final SecretKeySpec llllllllllllIllllllIIllIIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIllIIIllIllI.getBytes(StandardCharsets.UTF_8)), Village.lIllIlllIlIlIl[10]), "DES");
                final Cipher llllllllllllIllllllIIllIIIlllIIl = Cipher.getInstance("DES");
                llllllllllllIllllllIIllIIIlllIIl.init(Village.lIllIlllIlIlIl[3], llllllllllllIllllllIIllIIIlllIlI);
                return new String(llllllllllllIllllllIIllIIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIIllIIIlllIII) {
                llllllllllllIllllllIIllIIIlllIII.printStackTrace();
                return null;
            }
        }
        
        public Village() {
            this.field_143015_k = Village.lIllIlllIlIlIl[0];
        }
        
        private static boolean lIIIIIIIIIllllIl(final int llllllllllllIllllllIIllIIIIIIllI, final int llllllllllllIllllllIIllIIIIIIlIl) {
            return llllllllllllIllllllIIllIIIIIIllI < llllllllllllIllllllIIllIIIIIIlIl;
        }
        
        private static void lIIIIIIIIIllIIll() {
            (lIllIlllIlIIIl = new String[Village.lIllIlllIlIlIl[9]])[Village.lIllIlllIlIlIl[1]] = lIIIIIIIIIlIlllI("kXgcAFT+bzc=", "YCXKc");
            Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[2]] = lIIIIIIIIIlIllll("MhkDIwQQ", "dZlVj");
            Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[3]] = lIIIIIIIIIllIIII("YRENvEsHQao=", "rHJkN");
            Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[4]] = lIIIIIIIIIlIlllI("vlpdrTDgPVE=", "YmrPZ");
            Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[5]] = lIIIIIIIIIlIlllI("6Y9c26+Aw4Q=", "bbtqM");
            Village.lIllIlllIlIIIl[Village.lIllIlllIlIlIl[6]] = lIIIIIIIIIlIllll("KjIXPB4a", "nWdYl");
        }
        
        protected int getAverageGroundLevel(final World llllllllllllIllllllIIlllIIlIIIII, final StructureBoundingBox llllllllllllIllllllIIlllIIIlIIlI) {
            int llllllllllllIllllllIIlllIIIllllI = Village.lIllIlllIlIlIl[1];
            int llllllllllllIllllllIIlllIIIlllII = Village.lIllIlllIlIlIl[1];
            final BlockPos.MutableBlockPos llllllllllllIllllllIIlllIIIllIlI = new BlockPos.MutableBlockPos();
            int llllllllllllIllllllIIlllIIIllIII = this.boundingBox.minZ;
            "".length();
            if ("   ".length() == ((0x37 ^ 0x74) & ~(0x85 ^ 0xC6))) {
                return (0x54 ^ 0x41) & ~(0x97 ^ 0x82);
            }
            while (!lIIIIIIIIIlllIll(llllllllllllIllllllIIlllIIIllIII, this.boundingBox.maxZ)) {
                int llllllllllllIllllllIIlllIIIlIllI = this.boundingBox.minX;
                "".length();
                if (" ".length() == -" ".length()) {
                    return (0xF6 ^ 0xC2) & ~(0x57 ^ 0x63);
                }
                while (!lIIIIIIIIIlllIll(llllllllllllIllllllIIlllIIIlIllI, this.boundingBox.maxX)) {
                    llllllllllllIllllllIIlllIIIllIlI.func_181079_c(llllllllllllIllllllIIlllIIIlIllI, Village.lIllIlllIlIlIl[7], llllllllllllIllllllIIlllIIIllIII);
                    "".length();
                    if (lIIIIIIIIIlllIlI(llllllllllllIllllllIIlllIIIlIIlI.isVecInside(llllllllllllIllllllIIlllIIIllIlI) ? 1 : 0)) {
                        llllllllllllIllllllIIlllIIIllllI += Math.max(llllllllllllIllllllIIlllIIlIIIII.getTopSolidOrLiquidBlock(llllllllllllIllllllIIlllIIIllIlI).getY(), llllllllllllIllllllIIlllIIlIIIII.provider.getAverageGroundLevel());
                        ++llllllllllllIllllllIIlllIIIlllII;
                    }
                    ++llllllllllllIllllllIIlllIIIlIllI;
                }
                ++llllllllllllIllllllIIlllIIIllIII;
            }
            if (lIIIIIIIIIllllII(llllllllllllIllllllIIlllIIIlllII)) {
                return Village.lIllIlllIlIlIl[0];
            }
            return llllllllllllIllllllIIlllIIIllllI / llllllllllllIllllllIIlllIIIlllII;
        }
        
        private static boolean lIIIIIIIIIllllll(final Object llllllllllllIllllllIIlIllllllllI, final Object llllllllllllIllllllIIlIlllllllIl) {
            return llllllllllllIllllllIIlIllllllllI != llllllllllllIllllllIIlIlllllllIl;
        }
        
        private static void lIIIIIIIIIlllIII() {
            (lIllIlllIlIlIl = new int[11])[0] = -" ".length();
            Village.lIllIlllIlIlIl[1] = ((0xA5 ^ 0xAB) & ~(0x8F ^ 0x81));
            Village.lIllIlllIlIlIl[2] = " ".length();
            Village.lIllIlllIlIlIl[3] = "  ".length();
            Village.lIllIlllIlIlIl[4] = "   ".length();
            Village.lIllIlllIlIlIl[5] = (0xC ^ 0x8);
            Village.lIllIlllIlIlIl[6] = (0x7A ^ 0x28 ^ (0x1F ^ 0x48));
            Village.lIllIlllIlIlIl[7] = (0x69 ^ 0x29);
            Village.lIllIlllIlIlIl[8] = (108 + 126 - 138 + 44 ^ 124 + 11 - 31 + 30);
            Village.lIllIlllIlIlIl[9] = (0xBB ^ 0xBD);
            Village.lIllIlllIlIlIl[10] = (0x18 ^ 0x15 ^ (0x2D ^ 0x28));
        }
        
        @Override
        protected void replaceAirAndLiquidDownwards(final World llllllllllllIllllllIIllIIlIIllIl, final IBlockState llllllllllllIllllllIIllIIlIIllII, final int llllllllllllIllllllIIllIIlIlIIll, final int llllllllllllIllllllIIllIIlIIlIlI, final int llllllllllllIllllllIIllIIlIlIIIl, final StructureBoundingBox llllllllllllIllllllIIllIIlIlIIII) {
            final IBlockState llllllllllllIllllllIIllIIlIIllll = this.func_175847_a(llllllllllllIllllllIIllIIlIIllII);
            super.replaceAirAndLiquidDownwards(llllllllllllIllllllIIllIIlIIllIl, llllllllllllIllllllIIllIIlIIllll, llllllllllllIllllllIIllIIlIlIIll, llllllllllllIllllllIIllIIlIIlIlI, llllllllllllIllllllIIllIIlIlIIIl, llllllllllllIllllllIIllIIlIlIIII);
        }
        
        @Override
        protected void fillWithBlocks(final World llllllllllllIllllllIIllIIllllIIl, final StructureBoundingBox llllllllllllIllllllIIllIIllIlIlI, final int llllllllllllIllllllIIllIIlllIlll, final int llllllllllllIllllllIIllIIlllIllI, final int llllllllllllIllllllIIllIIllIIlll, final int llllllllllllIllllllIIllIIlllIlII, final int llllllllllllIllllllIIllIIllIIlIl, final int llllllllllllIllllllIIllIIlllIIlI, final IBlockState llllllllllllIllllllIIllIIllIIIll, final IBlockState llllllllllllIllllllIIllIIlllIIII, final boolean llllllllllllIllllllIIllIIllIIIIl) {
            final IBlockState llllllllllllIllllllIIllIIllIlllI = this.func_175847_a(llllllllllllIllllllIIllIIllIIIll);
            final IBlockState llllllllllllIllllllIIllIIllIllIl = this.func_175847_a(llllllllllllIllllllIIllIIlllIIII);
            super.fillWithBlocks(llllllllllllIllllllIIllIIllllIIl, llllllllllllIllllllIIllIIllIlIlI, llllllllllllIllllllIIllIIlllIlll, llllllllllllIllllllIIllIIlllIllI, llllllllllllIllllllIIllIIllIIlll, llllllllllllIllllllIIllIIlllIlII, llllllllllllIllllllIIllIIllIIlIl, llllllllllllIllllllIIllIIlllIIlI, llllllllllllIllllllIIllIIllIlllI, llllllllllllIllllllIIllIIllIllIl, llllllllllllIllllllIIllIIllIIIIl);
        }
        
        protected IBlockState func_175847_a(final IBlockState llllllllllllIllllllIIllIlIlIlIlI) {
            if (lIIIIIIIIIlllIlI(this.isDesertVillage ? 1 : 0)) {
                if (!lIIIIIIIIIllllll(llllllllllllIllllllIIllIlIlIlIlI.getBlock(), Blocks.log) || lIIIIIIIIlIIIIII(llllllllllllIllllllIIllIlIlIlIlI.getBlock(), Blocks.log2)) {
                    return Blocks.sandstone.getDefaultState();
                }
                if (lIIIIIIIIlIIIIII(llllllllllllIllllllIIllIlIlIlIlI.getBlock(), Blocks.cobblestone)) {
                    return Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.DEFAULT.getMetadata());
                }
                if (lIIIIIIIIlIIIIII(llllllllllllIllllllIIllIlIlIlIlI.getBlock(), Blocks.planks)) {
                    return Blocks.sandstone.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata());
                }
                if (lIIIIIIIIlIIIIII(llllllllllllIllllllIIllIlIlIlIlI.getBlock(), Blocks.oak_stairs)) {
                    return Blocks.sandstone_stairs.getDefaultState().withProperty((IProperty<Comparable>)BlockStairs.FACING, (EnumFacing)llllllllllllIllllllIIllIlIlIlIlI.getValue((IProperty<V>)BlockStairs.FACING));
                }
                if (lIIIIIIIIlIIIIII(llllllllllllIllllllIIllIlIlIlIlI.getBlock(), Blocks.stone_stairs)) {
                    return Blocks.sandstone_stairs.getDefaultState().withProperty((IProperty<Comparable>)BlockStairs.FACING, (EnumFacing)llllllllllllIllllllIIllIlIlIlIlI.getValue((IProperty<V>)BlockStairs.FACING));
                }
                if (lIIIIIIIIlIIIIII(llllllllllllIllllllIIllIlIlIlIlI.getBlock(), Blocks.gravel)) {
                    return Blocks.sandstone.getDefaultState();
                }
            }
            return llllllllllllIllllllIIllIlIlIlIlI;
        }
        
        private static boolean lIIIIIIIIIllllII(final int llllllllllllIllllllIIlIlllllIIll) {
            return llllllllllllIllllllIIlIlllllIIll == 0;
        }
        
        protected void spawnVillagers(final World llllllllllllIllllllIIllIllIlIIll, final StructureBoundingBox llllllllllllIllllllIIllIllIlIIIl, final int llllllllllllIllllllIIllIllIIllll, final int llllllllllllIllllllIIllIllIlllll, final int llllllllllllIllllllIIllIllIIlIll, final int llllllllllllIllllllIIllIllIIlIIl) {
            if (lIIIIIIIIIllllIl(this.villagersSpawned, llllllllllllIllllllIIllIllIIlIIl)) {
                int llllllllllllIllllllIIllIllIlllII = this.villagersSpawned;
                "".length();
                if ((0x31 ^ 0x6F ^ (0xE9 ^ 0xB3)) == 0x0) {
                    return;
                }
                while (!lIIIIIIIIIlllllI(llllllllllllIllllllIIllIllIlllII, llllllllllllIllllllIIllIllIIlIIl)) {
                    final int llllllllllllIllllllIIllIllIllIll = this.getXWithOffset(llllllllllllIllllllIIllIllIIllll + llllllllllllIllllllIIllIllIlllII, llllllllllllIllllllIIllIllIIlIll);
                    final int llllllllllllIllllllIIllIllIllIIl = this.getYWithOffset(llllllllllllIllllllIIllIllIlllll);
                    final int llllllllllllIllllllIIllIllIlIlll = this.getZWithOffset(llllllllllllIllllllIIllIllIIllll + llllllllllllIllllllIIllIllIlllII, llllllllllllIllllllIIllIllIIlIll);
                    if (lIIIIIIIIIllllII(llllllllllllIllllllIIllIllIlIIIl.isVecInside(new BlockPos(llllllllllllIllllllIIllIllIllIll, llllllllllllIllllllIIllIllIllIIl, llllllllllllIllllllIIllIllIlIlll)) ? 1 : 0)) {
                        "".length();
                        if ("  ".length() > "   ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.villagersSpawned += Village.lIllIlllIlIlIl[2];
                        final EntityVillager llllllllllllIllllllIIllIllIlIlIl = new EntityVillager(llllllllllllIllllllIIllIllIlIIll);
                        llllllllllllIllllllIIllIllIlIlIl.setLocationAndAngles(llllllllllllIllllllIIllIllIllIll + 0.5, llllllllllllIllllllIIllIllIllIIl, llllllllllllIllllllIIllIllIlIlll + 0.5, 0.0f, 0.0f);
                        llllllllllllIllllllIIllIllIlIlIl.onInitialSpawn(llllllllllllIllllllIIllIllIlIIll.getDifficultyForLocation(new BlockPos(llllllllllllIllllllIIllIllIlIlIl)), null);
                        "".length();
                        llllllllllllIllllllIIllIllIlIlIl.setProfession(this.func_180779_c(llllllllllllIllllllIIllIllIlllII, llllllllllllIllllllIIllIllIlIlIl.getProfession()));
                        llllllllllllIllllllIIllIllIlIIll.spawnEntityInWorld(llllllllllllIllllllIIllIllIlIlIl);
                        "".length();
                        ++llllllllllllIllllllIIllIllIlllII;
                    }
                }
            }
        }
        
        @Override
        protected void setBlockState(final World llllllllllllIllllllIIllIlIIIllll, final IBlockState llllllllllllIllllllIIllIlIIlIllI, final int llllllllllllIllllllIIllIlIIlIlIl, final int llllllllllllIllllllIIllIlIIIllII, final int llllllllllllIllllllIIllIlIIlIIll, final StructureBoundingBox llllllllllllIllllllIIllIlIIlIIlI) {
            final IBlockState llllllllllllIllllllIIllIlIIlIIIl = this.func_175847_a(llllllllllllIllllllIIllIlIIlIllI);
            super.setBlockState(llllllllllllIllllllIIllIlIIIllll, llllllllllllIllllllIIllIlIIlIIIl, llllllllllllIllllllIIllIlIIlIlIl, llllllllllllIllllllIIllIlIIIllII, llllllllllllIllllllIIllIlIIlIIll, llllllllllllIllllllIIllIlIIlIIlI);
        }
    }
    
    public static class Start extends Well
    {
        public /* synthetic */ List<StructureComponent> field_74932_i;
        public /* synthetic */ int terrainType;
        public /* synthetic */ List<PieceWeight> structureVillageWeightedPieceList;
        private static final /* synthetic */ int[] lIlIIIlIIllIlI;
        public /* synthetic */ List<StructureComponent> field_74930_j;
        public /* synthetic */ boolean inDesert;
        public /* synthetic */ WorldChunkManager worldChunkMngr;
        public /* synthetic */ PieceWeight structVillagePieceWeight;
        
        public Start() {
            this.field_74932_i = (List<StructureComponent>)Lists.newArrayList();
            this.field_74930_j = (List<StructureComponent>)Lists.newArrayList();
        }
        
        public WorldChunkManager getWorldChunkManager() {
            return this.worldChunkMngr;
        }
        
        static {
            lllIIIlIlIlIIll();
        }
        
        private static boolean lllIIIlIlIlIlII(final Object lllllllllllllIIIlllllIlIlllIlllI, final Object lllllllllllllIIIlllllIlIlllIllIl) {
            return lllllllllllllIIIlllllIlIlllIlllI != lllllllllllllIIIlllllIlIlllIllIl;
        }
        
        private static void lllIIIlIlIlIIll() {
            (lIlIIIlIIllIlI = new int[2])[0] = ((0x6 ^ 0x2B ^ (0x91 ^ 0x82)) & (0x3 ^ 0x48 ^ (0x73 ^ 0x6) ^ -" ".length()));
            Start.lIlIIIlIIllIlI[1] = " ".length();
        }
        
        public Start(final WorldChunkManager lllllllllllllIIIlllllIlIllllllII, final int lllllllllllllIIIlllllIllIIIIIlII, final Random lllllllllllllIIIlllllIlIlllllIll, final int lllllllllllllIIIlllllIlIlllllIlI, final int lllllllllllllIIIlllllIllIIIIIIIl, final List<PieceWeight> lllllllllllllIIIlllllIlIlllllIII, final int lllllllllllllIIIlllllIlIllllllll) {
            super(null, Start.lIlIIIlIIllIlI[0], lllllllllllllIIIlllllIlIlllllIll, lllllllllllllIIIlllllIlIlllllIlI, lllllllllllllIIIlllllIllIIIIIIIl);
            this.field_74932_i = (List<StructureComponent>)Lists.newArrayList();
            this.field_74930_j = (List<StructureComponent>)Lists.newArrayList();
            this.worldChunkMngr = lllllllllllllIIIlllllIlIllllllII;
            this.structureVillageWeightedPieceList = lllllllllllllIIIlllllIlIlllllIII;
            this.terrainType = lllllllllllllIIIlllllIlIllllllll;
            final BiomeGenBase lllllllllllllIIIlllllIlIlllllllI = lllllllllllllIIIlllllIlIllllllII.getBiomeGenerator(new BlockPos(lllllllllllllIIIlllllIlIlllllIlI, Start.lIlIIIlIIllIlI[0], lllllllllllllIIIlllllIllIIIIIIIl), BiomeGenBase.field_180279_ad);
            int inDesert;
            if (lllIIIlIlIlIlII(lllllllllllllIIIlllllIlIlllllllI, BiomeGenBase.desert) && lllIIIlIlIlIlII(lllllllllllllIIIlllllIlIlllllllI, BiomeGenBase.desertHills)) {
                inDesert = Start.lIlIIIlIIllIlI[0];
                "".length();
                if ("   ".length() <= 0) {
                    throw null;
                }
            }
            else {
                inDesert = Start.lIlIIIlIIllIlI[1];
            }
            this.inDesert = (inDesert != 0);
            this.func_175846_a(this.inDesert);
        }
    }
    
    public static class PieceWeight
    {
        public /* synthetic */ int villagePiecesLimit;
        private static final /* synthetic */ int[] lIlIIIIIlIIllI;
        public /* synthetic */ int villagePiecesSpawned;
        public final /* synthetic */ int villagePieceWeight;
        public /* synthetic */ Class<? extends Village> villagePieceClass;
        
        static {
            lllIIIIIlIIIIII();
        }
        
        private static boolean lllIIIIIlIIIIlI(final int lllllllllllllIIlIIIlIIIIIllIIIIl, final int lllllllllllllIIlIIIlIIIIIllIIIII) {
            return lllllllllllllIIlIIIlIIIIIllIIIIl >= lllllllllllllIIlIIIlIIIIIllIIIII;
        }
        
        public boolean canSpawnMoreVillagePieces() {
            if (lllIIIIIlIIIIIl(this.villagePiecesLimit) && lllIIIIIlIIIIlI(this.villagePiecesSpawned, this.villagePiecesLimit)) {
                return PieceWeight.lIlIIIIIlIIllI[0] != 0;
            }
            return PieceWeight.lIlIIIIIlIIllI[1] != 0;
        }
        
        private static boolean lllIIIIIlIIIIIl(final int lllllllllllllIIlIIIlIIIIIlIllllI) {
            return lllllllllllllIIlIIIlIIIIIlIllllI != 0;
        }
        
        private static void lllIIIIIlIIIIII() {
            (lIlIIIIIlIIllI = new int[2])[0] = ((0x9B ^ 0x85 ^ (0xBB ^ 0xAF)) & (3 + 0 + 187 + 10 ^ 160 + 142 - 210 + 102 ^ -" ".length()));
            PieceWeight.lIlIIIIIlIIllI[1] = " ".length();
        }
        
        public PieceWeight(final Class<? extends Village> lllllllllllllIIlIIIlIIIIIllIllIl, final int lllllllllllllIIlIIIlIIIIIllIllII, final int lllllllllllllIIlIIIlIIIIIllIlIll) {
            this.villagePieceClass = lllllllllllllIIlIIIlIIIIIllIllIl;
            this.villagePieceWeight = lllllllllllllIIlIIIlIIIIIllIllII;
            this.villagePiecesLimit = lllllllllllllIIlIIIlIIIIIllIlIll;
        }
        
        public boolean canSpawnMoreVillagePiecesOfType(final int lllllllllllllIIlIIIlIIIIIllIlIII) {
            if (lllIIIIIlIIIIIl(this.villagePiecesLimit) && lllIIIIIlIIIIlI(this.villagePiecesSpawned, this.villagePiecesLimit)) {
                return PieceWeight.lIlIIIIIlIIllI[0] != 0;
            }
            return PieceWeight.lIlIIIIIlIIllI[1] != 0;
        }
    }
    
    public static class Field2 extends Village
    {
        private /* synthetic */ Block cropTypeA;
        private /* synthetic */ Block cropTypeB;
        private static final /* synthetic */ String[] lIIllIlIlllllI;
        private static final /* synthetic */ int[] lIIllIlIllllll;
        
        public Field2(final Start lllllllllllllIIlIlIlIIIIIlllIIII, final int lllllllllllllIIlIlIlIIIIIllIllll, final Random lllllllllllllIIlIlIlIIIIIllIlllI, final StructureBoundingBox lllllllllllllIIlIlIlIIIIIllIllIl, final EnumFacing lllllllllllllIIlIlIlIIIIIllIIllI) {
            super(lllllllllllllIIlIlIlIIIIIlllIIII, lllllllllllllIIlIlIlIIIIIllIllll);
            this.coordBaseMode = lllllllllllllIIlIlIlIIIIIllIIllI;
            this.boundingBox = lllllllllllllIIlIlIlIIIIIllIllIl;
            this.cropTypeA = this.func_151560_a(lllllllllllllIIlIlIlIIIIIllIlllI);
            this.cropTypeB = this.func_151560_a(lllllllllllllIIlIlIlIIIIIllIlllI);
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIlIlIlIIIIIlIllIlI) {
            super.readStructureFromNBT(lllllllllllllIIlIlIlIIIIIlIllIlI);
            this.cropTypeA = Block.getBlockById(lllllllllllllIIlIlIlIIIIIlIllIlI.getInteger(Field2.lIIllIlIlllllI[Field2.lIIllIlIllllll[2]]));
            this.cropTypeB = Block.getBlockById(lllllllllllllIIlIlIlIIIIIlIllIlI.getInteger(Field2.lIIllIlIlllllI[Field2.lIIllIlIllllll[3]]));
        }
        
        private static boolean llIllIIlIllllIl(final int lllllllllllllIIlIlIIlllllllIlIll, final int lllllllllllllIIlIlIIlllllllIlIlI) {
            return lllllllllllllIIlIlIIlllllllIlIll > lllllllllllllIIlIlIIlllllllIlIlI;
        }
        
        private static boolean llIllIIlIllllll(final int lllllllllllllIIlIlIIlllllllIllll, final int lllllllllllllIIlIlIIlllllllIlllI) {
            return lllllllllllllIIlIlIIlllllllIllll < lllllllllllllIIlIlIIlllllllIlllI;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlIlIlIIIIIIllIIll, final Random lllllllllllllIIlIlIlIIIIIIlIlIll, final StructureBoundingBox lllllllllllllIIlIlIlIIIIIIlIlIlI) {
            if (llIllIIlIllllII(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI);
                if (llIllIIlIllllII(this.field_143015_k)) {
                    return Field2.lIIllIlIllllll[1] != 0;
                }
                this.boundingBox.offset(Field2.lIIllIlIllllll[0], this.field_143015_k - this.boundingBox.maxY + Field2.lIIllIlIllllll[6] - Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[0]);
            }
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[8], Field2.lIIllIlIllllll[6], Field2.lIIllIlIllllll[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[2], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[5], Blocks.farmland.getDefaultState(), Blocks.farmland.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[6], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[4], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[5], Blocks.farmland.getDefaultState(), Blocks.farmland.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[9], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[8], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[8], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[9], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[4], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[9], Field2.lIIllIlIllllll[4], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[9], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlIlI, Field2.lIIllIlIllllll[3], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[3], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[5], Blocks.water.getDefaultState(), Blocks.water.getDefaultState(), (boolean)(Field2.lIIllIlIllllll[0] != 0));
            int lllllllllllllIIlIlIlIIIIIIllIIII = Field2.lIIllIlIllllll[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xB3 ^ 0x8D ^ (0x6C ^ 0x63)) & (0x6D ^ 0x7F ^ (0xA9 ^ 0x8A) ^ -" ".length())) != 0x0;
            }
            while (!llIllIIlIllllIl(lllllllllllllIIlIlIlIIIIIIllIIII, Field2.lIIllIlIllllll[5])) {
                this.setBlockState(lllllllllllllIIlIlIlIIIIIIllIIll, this.cropTypeA.getStateFromMeta(MathHelper.getRandomIntegerInRange(lllllllllllllIIlIlIlIIIIIIlIlIll, Field2.lIIllIlIllllll[2], Field2.lIIllIlIllllll[5])), Field2.lIIllIlIllllll[1], Field2.lIIllIlIllllll[1], lllllllllllllIIlIlIlIIIIIIllIIII, lllllllllllllIIlIlIlIIIIIIlIlIlI);
                this.setBlockState(lllllllllllllIIlIlIlIIIIIIllIIll, this.cropTypeA.getStateFromMeta(MathHelper.getRandomIntegerInRange(lllllllllllllIIlIlIlIIIIIIlIlIll, Field2.lIIllIlIllllll[2], Field2.lIIllIlIllllll[5])), Field2.lIIllIlIllllll[2], Field2.lIIllIlIllllll[1], lllllllllllllIIlIlIlIIIIIIllIIII, lllllllllllllIIlIlIlIIIIIIlIlIlI);
                this.setBlockState(lllllllllllllIIlIlIlIIIIIIllIIll, this.cropTypeB.getStateFromMeta(MathHelper.getRandomIntegerInRange(lllllllllllllIIlIlIlIIIIIIlIlIll, Field2.lIIllIlIllllll[2], Field2.lIIllIlIllllll[5])), Field2.lIIllIlIllllll[6], Field2.lIIllIlIllllll[1], lllllllllllllIIlIlIlIIIIIIllIIII, lllllllllllllIIlIlIlIIIIIIlIlIlI);
                this.setBlockState(lllllllllllllIIlIlIlIIIIIIllIIll, this.cropTypeB.getStateFromMeta(MathHelper.getRandomIntegerInRange(lllllllllllllIIlIlIlIIIIIIlIlIll, Field2.lIIllIlIllllll[2], Field2.lIIllIlIllllll[5])), Field2.lIIllIlIllllll[4], Field2.lIIllIlIllllll[1], lllllllllllllIIlIlIlIIIIIIllIIII, lllllllllllllIIlIlIlIIIIIIlIlIlI);
                ++lllllllllllllIIlIlIlIIIIIIllIIII;
            }
            int lllllllllllllIIlIlIlIIIIIIlIllll = Field2.lIIllIlIllllll[0];
            "".length();
            if ((0xAC ^ 0xB1 ^ (0x64 ^ 0x7D)) <= -" ".length()) {
                return ((0xA4 ^ 0x8C ^ (0x58 ^ 0x60)) & (0xDA ^ 0x9B ^ (0xD8 ^ 0x89) ^ -" ".length())) != 0x0;
            }
            while (!llIllIIlIlllllI(lllllllllllllIIlIlIlIIIIIIlIllll, Field2.lIIllIlIllllll[7])) {
                int lllllllllllllIIlIlIlIIIIIIlIlllI = Field2.lIIllIlIllllll[0];
                "".length();
                if (-" ".length() > ((0xB2 ^ 0x96 ^ (0x26 ^ 0x18)) & (0x2C ^ 0x20 ^ (0x28 ^ 0x3E) ^ -" ".length()))) {
                    return ((57 + 131 + 46 + 5 ^ 81 + 26 - 27 + 80) & (0x8 ^ 0x12 ^ (0xEB ^ 0xBE) ^ -" ".length())) != 0x0;
                }
                while (!llIllIIlIlllllI(lllllllllllllIIlIlIlIIIIIIlIlllI, Field2.lIIllIlIllllll[5])) {
                    this.clearCurrentPositionBlocksUpwards(lllllllllllllIIlIlIlIIIIIIllIIll, lllllllllllllIIlIlIlIIIIIIlIlllI, Field2.lIIllIlIllllll[6], lllllllllllllIIlIlIlIIIIIIlIllll, lllllllllllllIIlIlIlIIIIIIlIlIlI);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIIlIlIlIIIIIIllIIll, Blocks.dirt.getDefaultState(), lllllllllllllIIlIlIlIIIIIIlIlllI, Field2.lIIllIlIllllll[10], lllllllllllllIIlIlIlIIIIIIlIllll, lllllllllllllIIlIlIlIIIIIIlIlIlI);
                    ++lllllllllllllIIlIlIlIIIIIIlIlllI;
                }
                ++lllllllllllllIIlIlIlIIIIIIlIllll;
            }
            return Field2.lIIllIlIllllll[1] != 0;
        }
        
        private static void llIllIIlIllIlll() {
            (lIIllIlIlllllI = new String[Field2.lIIllIlIllllll[6]])[Field2.lIIllIlIllllll[0]] = llIllIIlIllIIll("nDWYy7yCAXg=", "gHvCE");
            Field2.lIIllIlIlllllI[Field2.lIIllIlIllllll[1]] = llIllIIlIllIIll("SiozRKMDhVg=", "boayD");
            Field2.lIIllIlIlllllI[Field2.lIIllIlIllllll[2]] = llIllIIlIllIlIl("Iig=", "aiLSb");
            Field2.lIIllIlIlllllI[Field2.lIIllIlIllllll[3]] = llIllIIlIllIllI("qCLfSpv6mHk=", "mwlNR");
        }
        
        private static String llIllIIlIllIllI(final String lllllllllllllIIlIlIIlllllllllIll, final String lllllllllllllIIlIlIIlllllllllIII) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIIlllllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlllllllllIII.getBytes(StandardCharsets.UTF_8)), Field2.lIIllIlIllllll[9]), "DES");
                final Cipher lllllllllllllIIlIlIIllllllllllIl = Cipher.getInstance("DES");
                lllllllllllllIIlIlIIllllllllllIl.init(Field2.lIIllIlIllllll[2], lllllllllllllIIlIlIIlllllllllllI);
                return new String(lllllllllllllIIlIlIIllllllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlllllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIIllllllllllII) {
                lllllllllllllIIlIlIIllllllllllII.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIlIlIlIIIIIllIIIlI) {
            super.writeStructureToNBT(lllllllllllllIIlIlIlIIIIIllIIIlI);
            lllllllllllllIIlIlIlIIIIIllIIIlI.setInteger(Field2.lIIllIlIlllllI[Field2.lIIllIlIllllll[0]], Block.blockRegistry.getIDForObject(this.cropTypeA));
            lllllllllllllIIlIlIlIIIIIllIIIlI.setInteger(Field2.lIIllIlIlllllI[Field2.lIIllIlIllllll[1]], Block.blockRegistry.getIDForObject(this.cropTypeB));
        }
        
        static {
            llIllIIlIlllIIl();
            llIllIIlIllIlll();
        }
        
        private static String llIllIIlIllIlIl(String lllllllllllllIIlIlIlIIIIIIIIlIll, final String lllllllllllllIIlIlIlIIIIIIIIlIlI) {
            lllllllllllllIIlIlIlIIIIIIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIlIIIIIIIIlllI = new StringBuilder();
            final char[] lllllllllllllIIlIlIlIIIIIIIIllIl = lllllllllllllIIlIlIlIIIIIIIIlIlI.toCharArray();
            int lllllllllllllIIlIlIlIIIIIIIIllII = Field2.lIIllIlIllllll[0];
            final char lllllllllllllIIlIlIlIIIIIIIIIllI = (Object)lllllllllllllIIlIlIlIIIIIIIIlIll.toCharArray();
            final Exception lllllllllllllIIlIlIlIIIIIIIIIlIl = (Exception)lllllllllllllIIlIlIlIIIIIIIIIllI.length;
            int lllllllllllllIIlIlIlIIIIIIIIIlII = Field2.lIIllIlIllllll[0];
            while (llIllIIlIllllll(lllllllllllllIIlIlIlIIIIIIIIIlII, (int)lllllllllllllIIlIlIlIIIIIIIIIlIl)) {
                final char lllllllllllllIIlIlIlIIIIIIIlIIIl = lllllllllllllIIlIlIlIIIIIIIIIllI[lllllllllllllIIlIlIlIIIIIIIIIlII];
                lllllllllllllIIlIlIlIIIIIIIIlllI.append((char)(lllllllllllllIIlIlIlIIIIIIIlIIIl ^ lllllllllllllIIlIlIlIIIIIIIIllIl[lllllllllllllIIlIlIlIIIIIIIIllII % lllllllllllllIIlIlIlIIIIIIIIllIl.length]));
                "".length();
                ++lllllllllllllIIlIlIlIIIIIIIIllII;
                ++lllllllllllllIIlIlIlIIIIIIIIIlII;
                "".length();
                if ("  ".length() == (0x0 ^ 0x4)) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIlIIIIIIIIlllI);
        }
        
        private Block func_151560_a(final Random lllllllllllllIIlIlIlIIIIIlIlIlll) {
            switch (lllllllllllllIIlIlIlIIIIIlIlIlll.nextInt(Field2.lIIllIlIllllll[4])) {
                case 0: {
                    return Blocks.carrots;
                }
                case 1: {
                    return Blocks.potatoes;
                }
                default: {
                    return Blocks.wheat;
                }
            }
        }
        
        private static boolean llIllIIlIlllIll(final Object lllllllllllllIIlIlIIlllllllIlIII) {
            return lllllllllllllIIlIlIIlllllllIlIII == null;
        }
        
        private static boolean llIllIIlIlllIlI(final int lllllllllllllIIlIlIIlllllllIIllI) {
            return lllllllllllllIIlIlIIlllllllIIllI != 0;
        }
        
        private static boolean llIllIIlIlllllI(final int lllllllllllllIIlIlIIllllllllIIll, final int lllllllllllllIIlIlIIllllllllIIlI) {
            return lllllllllllllIIlIlIIllllllllIIll >= lllllllllllllIIlIlIIllllllllIIlI;
        }
        
        public Field2() {
        }
        
        public static Field2 func_175852_a(final Start lllllllllllllIIlIlIlIIIIIlIIIIll, final List<StructureComponent> lllllllllllllIIlIlIlIIIIIlIIIIlI, final Random lllllllllllllIIlIlIlIIIIIlIIlIlI, final int lllllllllllllIIlIlIlIIIIIlIIlIIl, final int lllllllllllllIIlIlIlIIIIIIllllll, final int lllllllllllllIIlIlIlIIIIIIlllllI, final EnumFacing lllllllllllllIIlIlIlIIIIIIllllIl, final int lllllllllllllIIlIlIlIIIIIlIIIlIl) {
            final StructureBoundingBox lllllllllllllIIlIlIlIIIIIlIIIlII = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIlIlIlIIIIIlIIlIIl, lllllllllllllIIlIlIlIIIIIIllllll, lllllllllllllIIlIlIlIIIIIIlllllI, Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[0], Field2.lIIllIlIllllll[5], Field2.lIIllIlIllllll[6], Field2.lIIllIlIllllll[7], lllllllllllllIIlIlIlIIIIIIllllIl);
            Field2 field2;
            if (llIllIIlIlllIlI(Village.canVillageGoDeeper(lllllllllllllIIlIlIlIIIIIlIIIlII) ? 1 : 0) && llIllIIlIlllIll(StructureComponent.findIntersecting(lllllllllllllIIlIlIlIIIIIlIIIIlI, lllllllllllllIIlIlIlIIIIIlIIIlII))) {
                field2 = new Field2(lllllllllllllIIlIlIlIIIIIlIIIIll, lllllllllllllIIlIlIlIIIIIlIIIlIl, lllllllllllllIIlIlIlIIIIIlIIlIlI, lllllllllllllIIlIlIlIIIIIlIIIlII, lllllllllllllIIlIlIlIIIIIIllllIl);
                "".length();
                if (-" ".length() == "  ".length()) {
                    return null;
                }
            }
            else {
                field2 = null;
            }
            return field2;
        }
        
        private static boolean llIllIIlIllllII(final int lllllllllllllIIlIlIIlllllllIIlII) {
            return lllllllllllllIIlIlIIlllllllIIlII < 0;
        }
        
        private static void llIllIIlIlllIIl() {
            (lIIllIlIllllll = new int[11])[0] = ((0x1D ^ 0x29) & ~(0x9F ^ 0xAB));
            Field2.lIIllIlIllllll[1] = " ".length();
            Field2.lIIllIlIllllll[2] = "  ".length();
            Field2.lIIllIlIllllll[3] = "   ".length();
            Field2.lIIllIlIllllll[4] = (39 + 113 - 11 + 44 ^ 23 + 152 - 132 + 145);
            Field2.lIIllIlIllllll[5] = (53 + 33 + 16 + 29 ^ 9 + 23 + 48 + 52);
            Field2.lIIllIlIllllll[6] = (0x60 ^ 0x64);
            Field2.lIIllIlIllllll[7] = (0x13 ^ 0x1A);
            Field2.lIIllIlIllllll[8] = (0xAF ^ 0xA9);
            Field2.lIIllIlIllllll[9] = (0x64 ^ 0x2F ^ (0x26 ^ 0x65));
            Field2.lIIllIlIllllll[10] = -" ".length();
        }
        
        private static String llIllIIlIllIIll(final String lllllllllllllIIlIlIlIIIIIIIllllI, final String lllllllllllllIIlIlIlIIIIIIIlllll) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlIIIIIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIlIIIIIIlIIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIlIIIIIIlIIIlI.init(Field2.lIIllIlIllllll[2], lllllllllllllIIlIlIlIIIIIIlIIIll);
                return new String(lllllllllllllIIlIlIlIIIIIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIIIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlIIIIIIlIIIIl) {
                lllllllllllllIIlIlIlIIIIIIlIIIIl.printStackTrace();
                return null;
            }
        }
    }
    
    public static class Church extends Village
    {
        private static final /* synthetic */ int[] lIIIIllllIllII;
        
        public static Church func_175854_a(final Start lllllllllllllIlIIIlllIlIlIlIIIlI, final List<StructureComponent> lllllllllllllIlIIIlllIlIlIlIIIIl, final Random lllllllllllllIlIIIlllIlIlIIlIlll, final int lllllllllllllIlIIIlllIlIlIIlIllI, final int lllllllllllllIlIIIlllIlIlIIllllI, final int lllllllllllllIlIIIlllIlIlIIlllIl, final EnumFacing lllllllllllllIlIIIlllIlIlIIlIIll, final int lllllllllllllIlIIIlllIlIlIIllIll) {
            final StructureBoundingBox lllllllllllllIlIIIlllIlIlIIllIlI = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIlIIIlllIlIlIIlIllI, lllllllllllllIlIIIlllIlIlIIllllI, lllllllllllllIlIIIlllIlIlIIlllIl, Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[1], Church.lIIIIllllIllII[2], Church.lIIIIllllIllII[3], lllllllllllllIlIIIlllIlIlIIlIIll);
            Church church;
            if (lIllllIlIIlIlIl(Village.canVillageGoDeeper(lllllllllllllIlIIIlllIlIlIIllIlI) ? 1 : 0) && lIllllIlIIlIllI(StructureComponent.findIntersecting(lllllllllllllIlIIIlllIlIlIlIIIIl, lllllllllllllIlIIIlllIlIlIIllIlI))) {
                church = new Church(lllllllllllllIlIIIlllIlIlIlIIIlI, lllllllllllllIlIIIlllIlIlIIllIll, lllllllllllllIlIIIlllIlIlIIlIlll, lllllllllllllIlIIIlllIlIlIIllIlI, lllllllllllllIlIIIlllIlIlIIlIIll);
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return null;
                }
            }
            else {
                church = null;
            }
            return church;
        }
        
        @Override
        protected int func_180779_c(final int lllllllllllllIlIIIlllIlIIllllIIl, final int lllllllllllllIlIIIlllIlIIllllIII) {
            return Church.lIIIIllllIllII[11];
        }
        
        private static boolean lIllllIlIIllIII(final int lllllllllllllIlIIIlllIlIIlllIIIl, final int lllllllllllllIlIIIlllIlIIlllIIII) {
            return lllllllllllllIlIIIlllIlIIlllIIIl > lllllllllllllIlIIIlllIlIIlllIIII;
        }
        
        public Church(final Start lllllllllllllIlIIIlllIlIlIllIlIl, final int lllllllllllllIlIIIlllIlIlIlIlllI, final Random lllllllllllllIlIIIlllIlIlIllIIll, final StructureBoundingBox lllllllllllllIlIIIlllIlIlIlIllIl, final EnumFacing lllllllllllllIlIIIlllIlIlIllIIIl) {
            super(lllllllllllllIlIIIlllIlIlIllIlIl, lllllllllllllIlIIIlllIlIlIlIlllI);
            this.coordBaseMode = lllllllllllllIlIIIlllIlIlIllIIIl;
            this.boundingBox = lllllllllllllIlIIIlllIlIlIlIllIl;
        }
        
        private static void lIllllIlIIlIlII() {
            (lIIIIllllIllII = new int[14])[0] = ((0x57 ^ 0x6A) & ~(0x82 ^ 0xBF));
            Church.lIIIIllllIllII[1] = (0xB1 ^ 0xAA ^ (0x3B ^ 0x25));
            Church.lIIIIllllIllII[2] = (0x33 ^ 0x7C ^ (0x77 ^ 0x34));
            Church.lIIIIllllIllII[3] = (0x5C ^ 0x55);
            Church.lIIIIllllIllII[4] = " ".length();
            Church.lIIIIllllIllII[5] = "   ".length();
            Church.lIIIIllllIllII[6] = (0x50 ^ 0x38 ^ (0x66 ^ 0x9));
            Church.lIIIIllllIllII[7] = (0xA7 ^ 0x88 ^ (0x4E ^ 0x69));
            Church.lIIIIllllIllII[8] = (0xCC ^ 0xC6);
            Church.lIIIIllllIllII[9] = (0xC ^ 0x8);
            Church.lIIIIllllIllII[10] = (0xC8 ^ 0xC3);
            Church.lIIIIllllIllII[11] = "  ".length();
            Church.lIIIIllllIllII[12] = (54 + 149 - 93 + 40 ^ 141 + 104 - 197 + 96);
            Church.lIIIIllllIllII[13] = -" ".length();
        }
        
        public Church() {
        }
        
        static {
            lIllllIlIIlIlII();
        }
        
        private static boolean lIllllIlIIlIllI(final Object lllllllllllllIlIIIlllIlIIllIIllI) {
            return lllllllllllllIlIIIlllIlIIllIIllI == null;
        }
        
        private static boolean lIllllIlIIlIlIl(final int lllllllllllllIlIIIlllIlIIllIIlII) {
            return lllllllllllllIlIIIlllIlIIllIIlII != 0;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIIIlllIlIlIIIIIII, final Random lllllllllllllIlIIIlllIlIlIIIIlll, final StructureBoundingBox lllllllllllllIlIIIlllIlIIllllllI) {
            if (lIllllIlIIlIlll(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI);
                if (lIllllIlIIlIlll(this.field_143015_k)) {
                    return Church.lIIIIllllIllII[4] != 0;
                }
                this.boundingBox.offset(Church.lIIIIllllIllII[0], this.field_143015_k - this.boundingBox.maxY + Church.lIIIIllllIllII[2] - Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[0]);
            }
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[6], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[1], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[3], Church.lIIIIllllIllII[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[7], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[8], Church.lIIIIllllIllII[0], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[8], Church.lIIIIllllIllII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[8], Church.lIIIIllllIllII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[6], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[6], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[7], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[7], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[1], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[8], Church.lIIIIllllIllII[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[1], Church.lIIIIllllIllII[1], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[1], Church.lIIIIllllIllII[6], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[3], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[3], Church.lIIIIllllIllII[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Church.lIIIIllllIllII[0] != 0));
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[10], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[10], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[10], Church.lIIIIllllIllII[0], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[10], Church.lIIIIllllIllII[9], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[12], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[6], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[6], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[12], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[6], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, Church.lIIIIllllIllII[5])), Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[1], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, Church.lIIIIllllIllII[5])), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[12], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, Church.lIIIIllllIllII[5])), Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[1], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, Church.lIIIIllllIllII[4])), Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[6], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, Church.lIIIIllllIllII[0])), Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[6], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[12], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[6], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[12], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[6], Church.lIIIIllllIllII[11], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[12], Church.lIIIIllllIllII[0], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[6], Church.lIIIIllllIllII[0], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[12], Church.lIIIIllllIllII[9], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[6], Church.lIIIIllllIllII[9], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[12], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[12], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.glass_pane.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[7], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode.getOpposite()), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[6], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode.rotateY()), Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[12], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode.rotateYCCW()), Church.lIIIIllllIllII[5], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[12], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[9], Church.lIIIIllllIllII[1], lllllllllllllIlIIIlllIlIIllllllI);
            final int lllllllllllllIlIIIlllIlIlIIIIlIl = this.getMetadataWithOffset(Blocks.ladder, Church.lIIIIllllIllII[9]);
            int lllllllllllllIlIIIlllIlIlIIIIlII = Church.lIIIIllllIllII[4];
            "".length();
            if ("  ".length() == 0) {
                return ((0x4E ^ 0xC ^ (0x5B ^ 0x28)) & (34 + 50 - 38 + 91 ^ 124 + 74 - 51 + 37 ^ -" ".length())) != 0x0;
            }
            while (!lIllllIlIIllIII(lllllllllllllIlIIIlllIlIlIIIIlII, Church.lIIIIllllIllII[3])) {
                this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.ladder.getStateFromMeta(lllllllllllllIlIIIlllIlIlIIIIlIl), Church.lIIIIllllIllII[5], lllllllllllllIlIIIlllIlIlIIIIlII, Church.lIIIIllllIllII[5], lllllllllllllIlIIIlllIlIIllllllI);
                ++lllllllllllllIlIIIlllIlIlIIIIlII;
            }
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.air.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[0], lllllllllllllIlIIIlllIlIIllllllI);
            this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.air.getDefaultState(), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[0], lllllllllllllIlIIIlllIlIIllllllI);
            this.placeDoorCurrentPosition(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, lllllllllllllIlIIIlllIlIlIIIIlll, Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[0], EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, Church.lIIIIllllIllII[4])));
            if (lIllllIlIIllIIl(this.getBlockStateFromPos(lllllllllllllIlIIIlllIlIlIIIIIII, Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[13], lllllllllllllIlIIIlllIlIIllllllI).getBlock().getMaterial(), Material.air) && lIllllIlIIllIlI(this.getBlockStateFromPos(lllllllllllllIlIIIlllIlIlIIIIIII, Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[13], Church.lIIIIllllIllII[13], lllllllllllllIlIIIlllIlIIllllllI).getBlock().getMaterial(), Material.air)) {
                this.setBlockState(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, Church.lIIIIllllIllII[5])), Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[0], Church.lIIIIllllIllII[13], lllllllllllllIlIIIlllIlIIllllllI);
            }
            int lllllllllllllIlIIIlllIlIlIIIIIll = Church.lIIIIllllIllII[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((173 + 99 - 213 + 183 ^ 158 + 170 - 248 + 100) & (0x76 ^ 0x79 ^ (0xC6 ^ 0x8F) ^ -" ".length())) != 0x0;
            }
            while (!lIllllIlIIllIll(lllllllllllllIlIIIlllIlIlIIIIIll, Church.lIIIIllllIllII[3])) {
                int lllllllllllllIlIIIlllIlIlIIIIIlI = Church.lIIIIllllIllII[0];
                "".length();
                if ("   ".length() == " ".length()) {
                    return ((0xDE ^ 0xC6) & ~(0x34 ^ 0x2C)) != 0x0;
                }
                while (!lIllllIlIIllIll(lllllllllllllIlIIIlllIlIlIIIIIlI, Church.lIIIIllllIllII[1])) {
                    this.clearCurrentPositionBlocksUpwards(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIlIIIIIlI, Church.lIIIIllllIllII[2], lllllllllllllIlIIIlllIlIlIIIIIll, lllllllllllllIlIIIlllIlIIllllllI);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIlIIIlllIlIlIIIIIII, Blocks.cobblestone.getDefaultState(), lllllllllllllIlIIIlllIlIlIIIIIlI, Church.lIIIIllllIllII[13], lllllllllllllIlIIIlllIlIlIIIIIll, lllllllllllllIlIIIlllIlIIllllllI);
                    ++lllllllllllllIlIIIlllIlIlIIIIIlI;
                }
                ++lllllllllllllIlIIIlllIlIlIIIIIll;
            }
            this.spawnVillagers(lllllllllllllIlIIIlllIlIlIIIIIII, lllllllllllllIlIIIlllIlIIllllllI, Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[4], Church.lIIIIllllIllII[11], Church.lIIIIllllIllII[4]);
            return Church.lIIIIllllIllII[4] != 0;
        }
        
        private static boolean lIllllIlIIlIlll(final int lllllllllllllIlIIIlllIlIIllIIIlI) {
            return lllllllllllllIlIIIlllIlIIllIIIlI < 0;
        }
        
        private static boolean lIllllIlIIllIll(final int lllllllllllllIlIIIlllIlIIlllIlIl, final int lllllllllllllIlIIIlllIlIIlllIlII) {
            return lllllllllllllIlIIIlllIlIIlllIlIl >= lllllllllllllIlIIIlllIlIIlllIlII;
        }
        
        private static boolean lIllllIlIIllIIl(final Object lllllllllllllIlIIIlllIlIIllIlIIl, final Object lllllllllllllIlIIIlllIlIIllIlIII) {
            return lllllllllllllIlIIIlllIlIIllIlIIl == lllllllllllllIlIIIlllIlIIllIlIII;
        }
        
        private static boolean lIllllIlIIllIlI(final Object lllllllllllllIlIIIlllIlIIllIllIl, final Object lllllllllllllIlIIIlllIlIIllIllII) {
            return lllllllllllllIlIIIlllIlIIllIllIl != lllllllllllllIlIIIlllIlIIllIllII;
        }
    }
    
    public static class House1 extends Village
    {
        private static final /* synthetic */ int[] llIIlllIIlIIII;
        
        private static boolean lIIIllllIllIIlll(final Object llllllllllllIllIlllllIIllIlIIIll) {
            return llllllllllllIllIlllllIIllIlIIIll == null;
        }
        
        private static void lIIIllllIllIIlIl() {
            (llIIlllIIlIIII = new int[11])[0] = ((0x3A ^ 0x6D ^ (0x54 ^ 0x2F)) & (0x5D ^ 0x1D ^ (0xCB ^ 0xA7) ^ -" ".length()));
            House1.llIIlllIIlIIII[1] = (0x70 ^ 0x4C ^ (0x6C ^ 0x59));
            House1.llIIlllIIlIIII[2] = (0x34 ^ 0x58 ^ (0xC9 ^ 0xA3));
            House1.llIIlllIIlIIII[3] = " ".length();
            House1.llIIlllIIlIIII[4] = (0x98 ^ 0x88 ^ (0x8B ^ 0x9C));
            House1.llIIlllIIlIIII[5] = (0x46 ^ 0x43);
            House1.llIIlllIIlIIII[6] = (58 + 59 + 39 + 4 ^ 127 + 57 - 20 + 0);
            House1.llIIlllIIlIIII[7] = (112 + 59 + 11 + 21 ^ 77 + 158 - 89 + 49);
            House1.llIIlllIIlIIII[8] = "  ".length();
            House1.llIIlllIIlIIII[9] = "   ".length();
            House1.llIIlllIIlIIII[10] = -" ".length();
        }
        
        public House1(final Start llllllllllllIllIlllllIIlllllIIll, final int llllllllllllIllIlllllIIlllllIIlI, final Random llllllllllllIllIlllllIIlllllIlll, final StructureBoundingBox llllllllllllIllIlllllIIlllllIIIl, final EnumFacing llllllllllllIllIlllllIIlllllIlIl) {
            super(llllllllllllIllIlllllIIlllllIIll, llllllllllllIllIlllllIIlllllIIlI);
            this.coordBaseMode = llllllllllllIllIlllllIIlllllIlIl;
            this.boundingBox = llllllllllllIllIlllllIIlllllIIIl;
        }
        
        private static boolean lIIIllllIllIIllI(final int llllllllllllIllIlllllIIllIlIIIIl) {
            return llllllllllllIllIlllllIIllIlIIIIl != 0;
        }
        
        private static boolean lIIIllllIllIlIll(final Object llllllllllllIllIlllllIIllIlIlIlI, final Object llllllllllllIllIlllllIIllIlIlIIl) {
            return llllllllllllIllIlllllIIllIlIlIlI != llllllllllllIllIlllllIIllIlIlIIl;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIlllllIIlllIIlIlI, final Random llllllllllllIllIlllllIIlllIIlIIl, final StructureBoundingBox llllllllllllIllIlllllIIllIllllIl) {
            if (lIIIllllIllIlIII(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl);
                if (lIIIllllIllIlIII(this.field_143015_k)) {
                    return House1.llIIlllIIlIIII[3] != 0;
                }
                this.boundingBox.offset(House1.llIIlllIIlIIII[0], this.field_143015_k - this.boundingBox.maxY + House1.llIIlllIIlIIII[1] - House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0]);
            }
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[6], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[6], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            final int llllllllllllIllIlllllIIlllIIIlll = this.getMetadataWithOffset(Blocks.oak_stairs, House1.llIIlllIIlIIII[9]);
            final int llllllllllllIllIlllllIIlllIIIllI = this.getMetadataWithOffset(Blocks.oak_stairs, House1.llIIlllIIlIIII[8]);
            int llllllllllllIllIlllllIIlllIIIlIl = House1.llIIlllIIlIIII[10];
            "".length();
            if ("   ".length() < 0) {
                return ((0x11 ^ 0xF) & ~(0xDB ^ 0xC5)) != 0x0;
            }
            while (!lIIIllllIllIlIIl(llllllllllllIllIlllllIIlllIIIlIl, House1.llIIlllIIlIIII[8])) {
                int llllllllllllIllIlllllIIlllIIIlII = House1.llIIlllIIlIIII[0];
                "".length();
                if (" ".length() == "  ".length()) {
                    return ((0x8 ^ 0x51 ^ (0x84 ^ 0x9F)) & (0x8C ^ 0x9A ^ (0xDA ^ 0x8E) ^ -" ".length())) != 0x0;
                }
                while (!lIIIllllIllIlIIl(llllllllllllIllIlllllIIlllIIIlII, House1.llIIlllIIlIIII[7])) {
                    this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_stairs.getStateFromMeta(llllllllllllIllIlllllIIlllIIIlll), llllllllllllIllIlllllIIlllIIIlII, House1.llIIlllIIlIIII[2] + llllllllllllIllIlllllIIlllIIIlIl, llllllllllllIllIlllllIIlllIIIlIl, llllllllllllIllIlllllIIllIllllIl);
                    this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_stairs.getStateFromMeta(llllllllllllIllIlllllIIlllIIIllI), llllllllllllIllIlllllIIlllIIIlII, House1.llIIlllIIlIIII[2] + llllllllllllIllIlllllIIlllIIIlIl, House1.llIIlllIIlIIII[5] - llllllllllllIllIlllllIIlllIIIlIl, llllllllllllIllIlllllIIllIllllIl);
                    ++llllllllllllIllIlllllIIlllIIIlII;
                }
                ++llllllllllllIllIlllllIIlllIIIlIl;
            }
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[0], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[5], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[0], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[6], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[6], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[0], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[8], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[8], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[8], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[8], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[7], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[5], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[5], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[5], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.glass_pane.getDefaultState(), House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[5], llllllllllllIllIlllllIIllIllllIl);
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[3], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[6], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.fillWithBlocks(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[6], Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(House1.llIIlllIIlIIII[0] != 0));
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.planks.getDefaultState(), House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.oak_stairs, House1.llIIlllIIlIIII[0])), House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            final int llllllllllllIllIlllllIIlllIIIIll = this.getMetadataWithOffset(Blocks.oak_stairs, House1.llIIlllIIlIIII[9]);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_stairs.getStateFromMeta(llllllllllllIllIlllllIIlllIIIIll), House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_stairs.getStateFromMeta(llllllllllllIllIlllllIIlllIIIIll), House1.llIIlllIIlIIII[5], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_stairs.getStateFromMeta(llllllllllllIllIlllllIIlllIIIIll), House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_stairs.getStateFromMeta(llllllllllllIllIlllllIIlllIIIIll), House1.llIIlllIIlIIII[9], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[6], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_fence.getDefaultState(), House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.wooden_pressure_plate.getDefaultState(), House1.llIIlllIIlIIII[2], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.oak_fence.getDefaultState(), House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.wooden_pressure_plate.getDefaultState(), House1.llIIlllIIlIIII[6], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[9], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.crafting_table.getDefaultState(), House1.llIIlllIIlIIII[4], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[3], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.air.getDefaultState(), House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.air.getDefaultState(), House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[0], llllllllllllIllIlllllIIllIllllIl);
            this.placeDoorCurrentPosition(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, llllllllllllIllIlllllIIlllIIlIIl, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, House1.llIIlllIIlIIII[3])));
            if (lIIIllllIllIlIlI(this.getBlockStateFromPos(llllllllllllIllIlllllIIlllIIlIlI, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[10], llllllllllllIllIlllllIIllIllllIl).getBlock().getMaterial(), Material.air) && lIIIllllIllIlIll(this.getBlockStateFromPos(llllllllllllIllIlllllIIlllIIlIlI, House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[10], House1.llIIlllIIlIIII[10], llllllllllllIllIlllllIIllIllllIl).getBlock().getMaterial(), Material.air)) {
                this.setBlockState(llllllllllllIllIlllllIIlllIIlIlI, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, House1.llIIlllIIlIIII[9])), House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[10], llllllllllllIllIlllllIIllIllllIl);
            }
            int llllllllllllIllIlllllIIlllIIIIlI = House1.llIIlllIIlIIII[0];
            "".length();
            if (" ".length() > "   ".length()) {
                return ((160 + 143 - 87 + 3 ^ 100 + 10 - 55 + 130) & (0x4B ^ 0x65 ^ (0xD7 ^ 0x9B) ^ -" ".length())) != 0x0;
            }
            while (!lIIIllllIllIllII(llllllllllllIllIlllllIIlllIIIIlI, House1.llIIlllIIlIIII[2])) {
                int llllllllllllIllIlllllIIlllIIIIIl = House1.llIIlllIIlIIII[0];
                "".length();
                if ((0x72 ^ 0x76) == "   ".length()) {
                    return ((0x9C ^ 0x8F) & ~(0x30 ^ 0x23)) != 0x0;
                }
                while (!lIIIllllIllIllII(llllllllllllIllIlllllIIlllIIIIIl, House1.llIIlllIIlIIII[1])) {
                    this.clearCurrentPositionBlocksUpwards(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIlllIIIIIl, House1.llIIlllIIlIIII[1], llllllllllllIllIlllllIIlllIIIIlI, llllllllllllIllIlllllIIllIllllIl);
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIlllllIIlllIIlIlI, Blocks.cobblestone.getDefaultState(), llllllllllllIllIlllllIIlllIIIIIl, House1.llIIlllIIlIIII[10], llllllllllllIllIlllllIIlllIIIIlI, llllllllllllIllIlllllIIllIllllIl);
                    ++llllllllllllIllIlllllIIlllIIIIIl;
                }
                ++llllllllllllIllIlllllIIlllIIIIlI;
            }
            this.spawnVillagers(llllllllllllIllIlllllIIlllIIlIlI, llllllllllllIllIlllllIIllIllllIl, House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[3], House1.llIIlllIIlIIII[8], House1.llIIlllIIlIIII[3]);
            return House1.llIIlllIIlIIII[3] != 0;
        }
        
        private static boolean lIIIllllIllIlIIl(final int llllllllllllIllIlllllIIllIlIlllI, final int llllllllllllIllIlllllIIllIlIllIl) {
            return llllllllllllIllIlllllIIllIlIlllI > llllllllllllIllIlllllIIllIlIllIl;
        }
        
        public static House1 func_175850_a(final Start llllllllllllIllIlllllIIlllIlllIl, final List<StructureComponent> llllllllllllIllIlllllIIllllIIlIl, final Random llllllllllllIllIlllllIIllllIIlII, final int llllllllllllIllIlllllIIllllIIIll, final int llllllllllllIllIlllllIIlllIllIIl, final int llllllllllllIllIlllllIIlllIllIII, final EnumFacing llllllllllllIllIlllllIIlllIlIlll, final int llllllllllllIllIlllllIIlllIlllll) {
            final StructureBoundingBox llllllllllllIllIlllllIIlllIllllI = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIlllllIIllllIIIll, llllllllllllIllIlllllIIlllIllIIl, llllllllllllIllIlllllIIlllIllIII, House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[0], House1.llIIlllIIlIIII[1], House1.llIIlllIIlIIII[1], House1.llIIlllIIlIIII[2], llllllllllllIllIlllllIIlllIlIlll);
            House1 house1;
            if (lIIIllllIllIIllI(Village.canVillageGoDeeper(llllllllllllIllIlllllIIlllIllllI) ? 1 : 0) && lIIIllllIllIIlll(StructureComponent.findIntersecting(llllllllllllIllIlllllIIllllIIlIl, llllllllllllIllIlllllIIlllIllllI))) {
                house1 = new House1(llllllllllllIllIlllllIIlllIlllIl, llllllllllllIllIlllllIIlllIlllll, llllllllllllIllIlllllIIllllIIlII, llllllllllllIllIlllllIIlllIllllI, llllllllllllIllIlllllIIlllIlIlll);
                "".length();
                if ((0xE ^ 0x60 ^ (0x60 ^ 0xA)) != (0xE9 ^ 0xBF ^ (0x5 ^ 0x57))) {
                    return null;
                }
            }
            else {
                house1 = null;
            }
            return house1;
        }
        
        private static boolean lIIIllllIllIllII(final int llllllllllllIllIlllllIIllIllIIlI, final int llllllllllllIllIlllllIIllIllIIIl) {
            return llllllllllllIllIlllllIIllIllIIlI >= llllllllllllIllIlllllIIllIllIIIl;
        }
        
        static {
            lIIIllllIllIIlIl();
        }
        
        private static boolean lIIIllllIllIlIlI(final Object llllllllllllIllIlllllIIllIlIIllI, final Object llllllllllllIllIlllllIIllIlIIlIl) {
            return llllllllllllIllIlllllIIllIlIIllI == llllllllllllIllIlllllIIllIlIIlIl;
        }
        
        @Override
        protected int func_180779_c(final int llllllllllllIllIlllllIIllIllIllI, final int llllllllllllIllIlllllIIllIllIlIl) {
            return House1.llIIlllIIlIIII[3];
        }
        
        private static boolean lIIIllllIllIlIII(final int llllllllllllIllIlllllIIllIIlllll) {
            return llllllllllllIllIlllllIIllIIlllll < 0;
        }
        
        public House1() {
        }
    }
    
    public abstract static class Road extends Village
    {
        public Road() {
        }
        
        protected Road(final Start lllllllllllllIIIIIIIlllIlIIlIIIl, final int lllllllllllllIIIIIIIlllIlIIlIIII) {
            super(lllllllllllllIIIIIIIlllIlIIlIIIl, lllllllllllllIIIIIIIlllIlIIlIIII);
        }
    }
    
    public static class House3 extends Village
    {
        private static final /* synthetic */ int[] lIIIlllllIIlIl;
        
        public static House3 func_175849_a(final Start lllllllllllllIIllllIIlIIIIIIIlll, final List<StructureComponent> lllllllllllllIIllllIIlIIIIIIIllI, final Random lllllllllllllIIllllIIlIIIIIIlllI, final int lllllllllllllIIllllIIlIIIIIIllIl, final int lllllllllllllIIllllIIlIIIIIIIIll, final int lllllllllllllIIllllIIlIIIIIIIIlI, final EnumFacing lllllllllllllIIllllIIlIIIIIIlIlI, final int lllllllllllllIIllllIIlIIIIIIlIIl) {
            final StructureBoundingBox lllllllllllllIIllllIIlIIIIIIlIII = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIllllIIlIIIIIIllIl, lllllllllllllIIllllIIlIIIIIIIIll, lllllllllllllIIllllIIlIIIIIIIIlI, House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[1], House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[3], lllllllllllllIIllllIIlIIIIIIlIlI);
            House3 house3;
            if (llIIlIIIIlIIllI(Village.canVillageGoDeeper(lllllllllllllIIllllIIlIIIIIIlIII) ? 1 : 0) && llIIlIIIIlIIlll(StructureComponent.findIntersecting(lllllllllllllIIllllIIlIIIIIIIllI, lllllllllllllIIllllIIlIIIIIIlIII))) {
                house3 = new House3(lllllllllllllIIllllIIlIIIIIIIlll, lllllllllllllIIllllIIlIIIIIIlIIl, lllllllllllllIIllllIIlIIIIIIlllI, lllllllllllllIIllllIIlIIIIIIlIII, lllllllllllllIIllllIIlIIIIIIlIlI);
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return null;
                }
            }
            else {
                house3 = null;
            }
            return house3;
        }
        
        private static boolean llIIlIIIIlIlIIl(final int lllllllllllllIIllllIIIllllIIlllI, final int lllllllllllllIIllllIIIllllIIllIl) {
            return lllllllllllllIIllllIIIllllIIlllI <= lllllllllllllIIllllIIIllllIIllIl;
        }
        
        private static void llIIlIIIIlIIlII() {
            (lIIIlllllIIlIl = new int[14])[0] = ((24 + 128 - 16 + 50 ^ 11 + 76 - 32 + 98) & (0x90 ^ 0xBA ^ (0x55 ^ 0x5C) ^ -" ".length()));
            House3.lIIIlllllIIlIl[1] = (0xA5 ^ 0xAC);
            House3.lIIIlllllIIlIl[2] = (0xA4 ^ 0x97 ^ (0x64 ^ 0x50));
            House3.lIIIlllllIIlIl[3] = (0xA7 ^ 0xAB);
            House3.lIIIlllllIIlIl[4] = " ".length();
            House3.lIIIlllllIIlIl[5] = (0x5D ^ 0x45 ^ (0x7A ^ 0x66));
            House3.lIIIlllllIIlIl[6] = "  ".length();
            House3.lIIIlllllIIlIl[7] = (0x24 ^ 0x22);
            House3.lIIIlllllIIlIl[8] = (0x2A ^ 0xF ^ (0x9E ^ 0xB3));
            House3.lIIIlllllIIlIl[9] = (0x6D ^ 0x1C ^ (0x59 ^ 0x22));
            House3.lIIIlllllIIlIl[10] = (25 + 142 - 61 + 65 ^ 131 + 68 - 144 + 119);
            House3.lIIIlllllIIlIl[11] = "   ".length();
            House3.lIIIlllllIIlIl[12] = -" ".length();
            House3.lIIIlllllIIlIl[13] = (0x71 ^ 0x5A ^ (0x46 ^ 0x66));
        }
        
        private static boolean llIIlIIIIlIllll(final Object lllllllllllllIIllllIIIllllIIIllI, final Object lllllllllllllIIllllIIIllllIIIlIl) {
            return lllllllllllllIIllllIIIllllIIIllI != lllllllllllllIIllllIIIllllIIIlIl;
        }
        
        private static boolean llIIlIIIIlIllII(final int lllllllllllllIIllllIIIllllIlIllI, final int lllllllllllllIIllllIIIllllIlIlIl) {
            return lllllllllllllIIllllIIIllllIlIllI >= lllllllllllllIIllllIIIllllIlIlIl;
        }
        
        public House3() {
        }
        
        private static boolean llIIlIIIIlIlIll(final int lllllllllllllIIllllIIIllllIIlIlI, final int lllllllllllllIIllllIIIllllIIlIIl) {
            return lllllllllllllIIllllIIIllllIIlIlI > lllllllllllllIIllllIIIllllIIlIIl;
        }
        
        private static boolean llIIlIIIIlIlllI(final Object lllllllllllllIIllllIIIllllIIIIlI, final Object lllllllllllllIIllllIIIllllIIIIIl) {
            return lllllllllllllIIllllIIIllllIIIIlI == lllllllllllllIIllllIIIllllIIIIIl;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIllllIIIlllllIIIIl, final Random lllllllllllllIIllllIIIlllllIIIII, final StructureBoundingBox lllllllllllllIIllllIIIllllllIIIl) {
            if (llIIlIIIIlIlIII(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl);
                if (llIIlIIIIlIlIII(this.field_143015_k)) {
                    return House3.lIIIlllllIIlIl[4] != 0;
                }
                this.boundingBox.offset(House3.lIIIlllllIIlIl[0], this.field_143015_k - this.boundingBox.maxY + House3.lIIIlllllIIlIl[2] - House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[0]);
            }
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[9], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[10], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[10], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[9], House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[0], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[10], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[4], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[11], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[6], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[11], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[6], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[11], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[5], lllllllllllllIIllllIIIllllllIIIl);
            final int lllllllllllllIIllllIIIllllllIIII = this.getMetadataWithOffset(Blocks.oak_stairs, House3.lIIIlllllIIlIl[11]);
            final int lllllllllllllIIllllIIIlllllIllll = this.getMetadataWithOffset(Blocks.oak_stairs, House3.lIIIlllllIIlIl[6]);
            int lllllllllllllIIllllIIIlllllIlllI = House3.lIIIlllllIIlIl[12];
            "".length();
            if ("   ".length() == ((0xA2 ^ 0x8A) & ~(0x76 ^ 0x5E))) {
                return ((0xD8 ^ 0x8B) & ~(0x95 ^ 0xC6)) != 0x0;
            }
            while (!llIIlIIIIlIlIll(lllllllllllllIIllllIIIlllllIlllI, House3.lIIIlllllIIlIl[6])) {
                int lllllllllllllIIllllIIIlllllIllIl = House3.lIIIlllllIIlIl[0];
                "".length();
                if ((0x2A ^ 0x26 ^ (0x8A ^ 0x82)) != (0xF2 ^ 0x8F ^ (0xBC ^ 0xC5))) {
                    return ((0xE5 ^ 0xAC ^ (0x5C ^ 0x58)) & (0x4D ^ 0x9 ^ (0x96 ^ 0x9F) ^ -" ".length())) != 0x0;
                }
                while (!llIIlIIIIlIlIll(lllllllllllllIIllllIIIlllllIllIl, House3.lIIIlllllIIlIl[8])) {
                    this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.oak_stairs.getStateFromMeta(lllllllllllllIIllllIIIllllllIIII), lllllllllllllIIllllIIIlllllIllIl, House3.lIIIlllllIIlIl[5] + lllllllllllllIIllllIIIlllllIlllI, lllllllllllllIIllllIIIlllllIlllI, lllllllllllllIIllllIIIllllllIIIl);
                    if ((!llIIlIIIIlIlIIl(lllllllllllllIIllllIIIlllllIlllI, House3.lIIIlllllIIlIl[12]) || llIIlIIIIlIlIIl(lllllllllllllIIllllIIIlllllIllIl, House3.lIIIlllllIIlIl[4])) && (!llIIlIIIIlIlIlI(lllllllllllllIIllllIIIlllllIlllI) || llIIlIIIIlIlIIl(lllllllllllllIIllllIIIlllllIllIl, House3.lIIIlllllIIlIl[11])) && (!llIIlIIIIlIlIIl(lllllllllllllIIllllIIIlllllIlllI, House3.lIIIlllllIIlIl[4]) || !llIIlIIIIlIlIll(lllllllllllllIIllllIIIlllllIllIl, House3.lIIIlllllIIlIl[5]) || llIIlIIIIlIllII(lllllllllllllIIllllIIIlllllIllIl, House3.lIIIlllllIIlIl[7]))) {
                        this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.oak_stairs.getStateFromMeta(lllllllllllllIIllllIIIlllllIllll), lllllllllllllIIllllIIIlllllIllIl, House3.lIIIlllllIIlIl[5] + lllllllllllllIIllllIIIlllllIlllI, House3.lIIIlllllIIlIl[10] - lllllllllllllIIllllIIIlllllIlllI, lllllllllllllIIllllIIIllllllIIIl);
                    }
                    ++lllllllllllllIIllllIIIlllllIllIl;
                }
                ++lllllllllllllIIllllIIIlllllIlllI;
            }
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[9], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[9], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[9], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[9], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[9], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            final int lllllllllllllIIllllIIIlllllIllII = this.getMetadataWithOffset(Blocks.oak_stairs, House3.lIIIlllllIIlIl[0]);
            int lllllllllllllIIllllIIIlllllIlIll = House3.lIIIlllllIIlIl[5];
            "".length();
            if ((0x57 ^ 0x53) > (0x7F ^ 0x7B)) {
                return ((0x31 ^ 0x6) & ~(0x9F ^ 0xA8)) != 0x0;
            }
            while (!llIIlIIIIlIllIl(lllllllllllllIIllllIIIlllllIlIll, House3.lIIIlllllIIlIl[4])) {
                this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), lllllllllllllIIllllIIIlllllIlIll, House3.lIIIlllllIIlIl[6] + lllllllllllllIIllllIIIlllllIlIll, House3.lIIIlllllIIlIl[2] - lllllllllllllIIllllIIIlllllIlIll, lllllllllllllIIllllIIIllllllIIIl);
                int lllllllllllllIIllllIIIlllllIlIlI = House3.lIIIlllllIIlIl[8] - lllllllllllllIIllllIIIlllllIlIll;
                "".length();
                if (-" ".length() >= ((54 + 27 - 25 + 124 ^ 90 + 89 - 65 + 47) & (0x47 ^ 0x10 ^ (0xE2 ^ 0xA0) ^ -" ".length()))) {
                    return ((0xF2 ^ 0xBC ^ (0xC ^ 0x4)) & (0xC8 ^ 0xAA ^ (0xB ^ 0x2F) ^ -" ".length())) != 0x0;
                }
                while (!llIIlIIIIlIlIll(lllllllllllllIIllllIIIlllllIlIlI, House3.lIIIlllllIIlIl[9])) {
                    this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.oak_stairs.getStateFromMeta(lllllllllllllIIllllIIIlllllIllII), lllllllllllllIIllllIIIlllllIlIll, House3.lIIIlllllIIlIl[6] + lllllllllllllIIllllIIIlllllIlIll, lllllllllllllIIllllIIIlllllIlIlI, lllllllllllllIIllllIIIllllllIIIl);
                    ++lllllllllllllIIllllIIIlllllIlIlI;
                }
                --lllllllllllllIIllllIIIlllllIlIll;
            }
            final int lllllllllllllIIllllIIIlllllIlIIl = this.getMetadataWithOffset(Blocks.oak_stairs, House3.lIIIlllllIIlIl[4]);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[11], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[2], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[5], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.oak_stairs.getStateFromMeta(lllllllllllllIIllllIIIlllllIlIIl), House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[5], lllllllllllllIIllllIIIllllllIIIl);
            int lllllllllllllIIllllIIIlllllIlIII = House3.lIIIlllllIIlIl[7];
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0x44 ^ 0x52) & ~(0x6E ^ 0x78)) != 0x0;
            }
            while (!llIIlIIIIlIlIll(lllllllllllllIIllllIIIlllllIlIII, House3.lIIIlllllIIlIl[8])) {
                int lllllllllllllIIllllIIIlllllIIlll = House3.lIIIlllllIIlIl[10];
                "".length();
                if ("  ".length() < 0) {
                    return ((0x62 ^ 0x51 ^ (0xBE ^ 0x91)) & (0x5C ^ 0x4D ^ (0x18 ^ 0x15) ^ -" ".length())) != 0x0;
                }
                while (!llIIlIIIIlIlIll(lllllllllllllIIllllIIIlllllIIlll, House3.lIIIlllllIIlIl[9])) {
                    this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.oak_stairs.getStateFromMeta(lllllllllllllIIllllIIIlllllIlIIl), lllllllllllllIIllllIIIlllllIlIII, House3.lIIIlllllIIlIl[3] - lllllllllllllIIllllIIIlllllIlIII, lllllllllllllIIllllIIIlllllIIlll, lllllllllllllIIllllIIIllllllIIIl);
                    ++lllllllllllllIIllllIIIlllllIIlll;
                }
                ++lllllllllllllIIllllIIIlllllIlIII;
            }
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[4], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[5], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[11], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[4], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[11], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[5], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[10], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[7], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[2], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[8], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[8], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[1], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[7], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[2], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[8], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[1], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[9], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.glass_pane.getDefaultState(), House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[9], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.log.getDefaultState(), House3.lIIIlllllIIlIl[7], House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[9], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.planks.getDefaultState(), House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[10], House3.lIIIlllllIIlIl[9], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.air.getDefaultState(), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[0], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.air.getDefaultState(), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], lllllllllllllIIllllIIIllllllIIIl);
            this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[4], lllllllllllllIIllllIIIllllllIIIl);
            this.placeDoorCurrentPosition(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, lllllllllllllIIllllIIIlllllIIIII, House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[0], EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, House3.lIIIlllllIIlIl[4])));
            this.fillWithBlocks(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[12], House3.lIIIlllllIIlIl[11], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[12], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House3.lIIIlllllIIlIl[0] != 0));
            if (llIIlIIIIlIlllI(this.getBlockStateFromPos(lllllllllllllIIllllIIIlllllIIIIl, House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[12], lllllllllllllIIllllIIIllllllIIIl).getBlock().getMaterial(), Material.air) && llIIlIIIIlIllll(this.getBlockStateFromPos(lllllllllllllIIllllIIIlllllIIIIl, House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[12], House3.lIIIlllllIIlIl[12], lllllllllllllIIllllIIIllllllIIIl).getBlock().getMaterial(), Material.air)) {
                this.setBlockState(lllllllllllllIIllllIIIlllllIIIIl, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, House3.lIIIlllllIIlIl[11])), House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[0], House3.lIIIlllllIIlIl[12], lllllllllllllIIllllIIIllllllIIIl);
            }
            int lllllllllllllIIllllIIIlllllIIllI = House3.lIIIlllllIIlIl[0];
            "".length();
            if (" ".length() <= -" ".length()) {
                return ((0xA8 ^ 0x9A) & ~(0x5C ^ 0x6E)) != 0x0;
            }
            while (!llIIlIIIIlIllII(lllllllllllllIIllllIIIlllllIIllI, House3.lIIIlllllIIlIl[10])) {
                int lllllllllllllIIllllIIIlllllIIlIl = House3.lIIIlllllIIlIl[0];
                "".length();
                if ((0xC4 ^ 0xC0) < "   ".length()) {
                    return ((0x87 ^ 0x9A) & ~(0x6 ^ 0x1B)) != 0x0;
                }
                while (!llIIlIIIIlIllII(lllllllllllllIIllllIIIlllllIIlIl, House3.lIIIlllllIIlIl[1])) {
                    this.clearCurrentPositionBlocksUpwards(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIlllllIIlIl, House3.lIIIlllllIIlIl[2], lllllllllllllIIllllIIIlllllIIllI, lllllllllllllIIllllIIIllllllIIIl);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIIllllIIIlllllIIIIl, Blocks.cobblestone.getDefaultState(), lllllllllllllIIllllIIIlllllIIlIl, House3.lIIIlllllIIlIl[12], lllllllllllllIIllllIIIlllllIIllI, lllllllllllllIIllllIIIllllllIIIl);
                    ++lllllllllllllIIllllIIIlllllIIlIl;
                }
                ++lllllllllllllIIllllIIIlllllIIllI;
            }
            int lllllllllllllIIllllIIIlllllIIlII = House3.lIIIlllllIIlIl[10];
            "".length();
            if ("   ".length() < 0) {
                return ((27 + 99 - 117 + 151 ^ 44 + 135 - 157 + 169) & (0xEA ^ 0xC6 ^ (0xD ^ 0x3E) ^ -" ".length())) != 0x0;
            }
            while (!llIIlIIIIlIllII(lllllllllllllIIllllIIIlllllIIlII, House3.lIIIlllllIIlIl[13])) {
                int lllllllllllllIIllllIIIlllllIIIll = House3.lIIIlllllIIlIl[6];
                "".length();
                if (-"   ".length() > 0) {
                    return ((0x88 ^ 0x9B) & ~(0x4 ^ 0x17)) != 0x0;
                }
                while (!llIIlIIIIlIllII(lllllllllllllIIllllIIIlllllIIIll, House3.lIIIlllllIIlIl[1])) {
                    this.clearCurrentPositionBlocksUpwards(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIlllllIIIll, House3.lIIIlllllIIlIl[2], lllllllllllllIIllllIIIlllllIIlII, lllllllllllllIIllllIIIllllllIIIl);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIIllllIIIlllllIIIIl, Blocks.cobblestone.getDefaultState(), lllllllllllllIIllllIIIlllllIIIll, House3.lIIIlllllIIlIl[12], lllllllllllllIIllllIIIlllllIIlII, lllllllllllllIIllllIIIllllllIIIl);
                    ++lllllllllllllIIllllIIIlllllIIIll;
                }
                ++lllllllllllllIIllllIIIlllllIIlII;
            }
            this.spawnVillagers(lllllllllllllIIllllIIIlllllIIIIl, lllllllllllllIIllllIIIllllllIIIl, House3.lIIIlllllIIlIl[5], House3.lIIIlllllIIlIl[4], House3.lIIIlllllIIlIl[6], House3.lIIIlllllIIlIl[6]);
            return House3.lIIIlllllIIlIl[4] != 0;
        }
        
        static {
            llIIlIIIIlIIlII();
        }
        
        private static boolean llIIlIIIIlIIlll(final Object lllllllllllllIIllllIIIlllIllllll) {
            return lllllllllllllIIllllIIIlllIllllll == null;
        }
        
        private static boolean llIIlIIIIlIllIl(final int lllllllllllllIIllllIIIllllIlIIlI, final int lllllllllllllIIllllIIIllllIlIIIl) {
            return lllllllllllllIIllllIIIllllIlIIlI < lllllllllllllIIllllIIIllllIlIIIl;
        }
        
        private static boolean llIIlIIIIlIlIII(final int lllllllllllllIIllllIIIlllIlllIll) {
            return lllllllllllllIIllllIIIlllIlllIll < 0;
        }
        
        private static boolean llIIlIIIIlIlIlI(final int lllllllllllllIIllllIIIlllIlllIIl) {
            return lllllllllllllIIllllIIIlllIlllIIl <= 0;
        }
        
        private static boolean llIIlIIIIlIIllI(final int lllllllllllllIIllllIIIlllIllllIl) {
            return lllllllllllllIIllllIIIlllIllllIl != 0;
        }
        
        public House3(final Start lllllllllllllIIllllIIlIIIIIlllIl, final int lllllllllllllIIllllIIlIIIIIlllII, final Random lllllllllllllIIllllIIlIIIIlIIIIl, final StructureBoundingBox lllllllllllllIIllllIIlIIIIlIIIII, final EnumFacing lllllllllllllIIllllIIlIIIIIllIlI) {
            super(lllllllllllllIIllllIIlIIIIIlllIl, lllllllllllllIIllllIIlIIIIIlllII);
            this.coordBaseMode = lllllllllllllIIllllIIlIIIIIllIlI;
            this.boundingBox = lllllllllllllIIllllIIlIIIIlIIIII;
        }
    }
    
    public static class Path extends Road
    {
        private static final /* synthetic */ String[] lllllllIllIIl;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        private /* synthetic */ int length;
        private static final /* synthetic */ int[] lllllllIlllII;
        
        private static boolean lIllIIIlIllllII(final int lllllllllllllIlIlIIllIllIlIllllI, final int lllllllllllllIlIlIIllIllIlIlllIl) {
            return lllllllllllllIlIlIIllIllIlIllllI > lllllllllllllIlIlIIllIllIlIlllIl;
        }
        
        private static void lIllIIIlIllIlIl() {
            (lllllllIlllII = new int[10])[0] = ((0x4A ^ 0x5B ^ (0xB1 ^ 0xBD)) & (0x76 ^ 0x13 ^ (0x19 ^ 0x61) ^ -" ".length()));
            Path.lllllllIlllII[1] = " ".length();
            Path.lllllllIlllII[2] = (0xB1 ^ 0xB4);
            Path.lllllllIlllII[3] = "  ".length();
            Path.lllllllIlllII[4] = (59 + 118 - 35 + 0 ^ 3 + 28 + 26 + 77);
            Path.lllllllIlllII[5] = "   ".length();
            Path.lllllllIlllII[6] = (0xAB ^ 0xC1 ^ (0x6 ^ 0x6B));
            Path.lllllllIlllII[7] = (0xCE ^ 0xC3 ^ (0xC7 ^ 0x8A));
            Path.lllllllIlllII[8] = (110 + 128 - 84 + 3 ^ 48 + 113 - 15 + 9);
            Path.lllllllIlllII[9] = (0x7B ^ 0x7F);
        }
        
        private static boolean lIllIIIlIlllIII(final int lllllllllllllIlIlIIllIllIlIlIlll) {
            return lllllllllllllIlIlIIllIllIlIlIlll != 0;
        }
        
        private static boolean lIllIIIlIlllIlI(final Object lllllllllllllIlIlIIllIllIlIllIIl) {
            return lllllllllllllIlIlIIllIllIlIllIIl == null;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIlIlIIlllIIIIIIllII, final List<StructureComponent> lllllllllllllIlIlIIlllIIIIIIlIll, final Random lllllllllllllIlIlIIlllIIIIIIlIlI) {
            boolean lllllllllllllIlIlIIlllIIIIIlIIlI = Path.lllllllIlllII[0] != 0;
            int lllllllllllllIlIlIIlllIIIIIlIIIl = lllllllllllllIlIlIIlllIIIIIIlIlI.nextInt(Path.lllllllIlllII[2]);
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
            while (!lIllIIIlIllIlll(lllllllllllllIlIlIIlllIIIIIlIIIl, this.length - Path.lllllllIlllII[4])) {
                final StructureComponent lllllllllllllIlIlIIlllIIIIIlIIII = this.getNextComponentNN((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, Path.lllllllIlllII[0], lllllllllllllIlIlIIlllIIIIIlIIIl);
                if (lIllIIIlIllIllI(lllllllllllllIlIlIIlllIIIIIlIIII)) {
                    lllllllllllllIlIlIIlllIIIIIlIIIl += Math.max(lllllllllllllIlIlIIlllIIIIIlIIII.boundingBox.getXSize(), lllllllllllllIlIlIIlllIIIIIlIIII.boundingBox.getZSize());
                    lllllllllllllIlIlIIlllIIIIIlIIlI = (Path.lllllllIlllII[1] != 0);
                }
                lllllllllllllIlIlIIlllIIIIIlIIIl += Path.lllllllIlllII[3] + lllllllllllllIlIlIIlllIIIIIIlIlI.nextInt(Path.lllllllIlllII[2]);
            }
            int lllllllllllllIlIlIIlllIIIIIIllll = lllllllllllllIlIlIIlllIIIIIIlIlI.nextInt(Path.lllllllIlllII[2]);
            "".length();
            if (((31 + 39 + 18 + 89 ^ 22 + 12 + 75 + 37) & (183 + 96 - 270 + 181 ^ 3 + 79 + 39 + 36 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIllIIIlIllIlll(lllllllllllllIlIlIIlllIIIIIIllll, this.length - Path.lllllllIlllII[4])) {
                final StructureComponent lllllllllllllIlIlIIlllIIIIIIlllI = this.getNextComponentPP((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, Path.lllllllIlllII[0], lllllllllllllIlIlIIlllIIIIIIllll);
                if (lIllIIIlIllIllI(lllllllllllllIlIlIIlllIIIIIIlllI)) {
                    lllllllllllllIlIlIIlllIIIIIIllll += Math.max(lllllllllllllIlIlIIlllIIIIIIlllI.boundingBox.getXSize(), lllllllllllllIlIlIIlllIIIIIIlllI.boundingBox.getZSize());
                    lllllllllllllIlIlIIlllIIIIIlIIlI = (Path.lllllllIlllII[1] != 0);
                }
                lllllllllllllIlIlIIlllIIIIIIllll += Path.lllllllIlllII[3] + lllllllllllllIlIlIIlllIIIIIIlIlI.nextInt(Path.lllllllIlllII[2]);
            }
            if (lIllIIIlIlllIII(lllllllllllllIlIlIIlllIIIIIlIIlI ? 1 : 0) && lIllIIIlIlllIIl(lllllllllllllIlIlIIlllIIIIIIlIlI.nextInt(Path.lllllllIlllII[5])) && lIllIIIlIllIllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.minX - Path.lllllllIlllII[1], this.boundingBox.minY, this.boundingBox.minZ, EnumFacing.WEST, this.getComponentType());
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.minX - Path.lllllllIlllII[1], this.boundingBox.minY, this.boundingBox.maxZ - Path.lllllllIlllII[3], EnumFacing.WEST, this.getComponentType());
                        "".length();
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    case 5: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.minZ - Path.lllllllIlllII[1], EnumFacing.NORTH, this.getComponentType());
                        "".length();
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                        break;
                    }
                    case 6: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.maxX - Path.lllllllIlllII[3], this.boundingBox.minY, this.boundingBox.minZ - Path.lllllllIlllII[1], EnumFacing.NORTH, this.getComponentType());
                        "".length();
                        break;
                    }
                }
            }
            if (lIllIIIlIlllIII(lllllllllllllIlIlIIlllIIIIIlIIlI ? 1 : 0) && lIllIIIlIlllIIl(lllllllllllllIlIlIIlllIIIIIIlIlI.nextInt(Path.lllllllIlllII[5])) && lIllIIIlIllIllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.maxX + Path.lllllllIlllII[1], this.boundingBox.minY, this.boundingBox.minZ, EnumFacing.EAST, this.getComponentType());
                        "".length();
                        "".length();
                        if ((0x51 ^ 0x54) <= 0) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.maxX + Path.lllllllIlllII[1], this.boundingBox.minY, this.boundingBox.maxZ - Path.lllllllIlllII[3], EnumFacing.EAST, this.getComponentType());
                        "".length();
                        "".length();
                        if ("  ".length() == " ".length()) {
                            return;
                        }
                        break;
                    }
                    case 5: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.maxZ + Path.lllllllIlllII[1], EnumFacing.SOUTH, this.getComponentType());
                        "".length();
                        "".length();
                        if (" ".length() <= 0) {
                            return;
                        }
                        break;
                    }
                    case 6: {
                        func_176069_e((Start)lllllllllllllIlIlIIlllIIIIIIllII, lllllllllllllIlIlIIlllIIIIIIlIll, lllllllllllllIlIlIIlllIIIIIIlIlI, this.boundingBox.maxX - Path.lllllllIlllII[3], this.boundingBox.minY, this.boundingBox.maxZ + Path.lllllllIlllII[1], EnumFacing.SOUTH, this.getComponentType());
                        "".length();
                        break;
                    }
                }
            }
        }
        
        private static boolean lIllIIIlIllIllI(final Object lllllllllllllIlIlIIllIllIlIllIll) {
            return lllllllllllllIlIlIIllIllIlIllIll != null;
        }
        
        private static void lIllIIIlIllIlII() {
            (lllllllIllIIl = new String[Path.lllllllIlllII[3]])[Path.lllllllIlllII[0]] = lIllIIIlIlIllII("+67VG7H/6r4=", "Bsbnt");
            Path.lllllllIllIIl[Path.lllllllIlllII[1]] = lIllIIIlIlIlllI("8Hgn5MFhoaM=", "hksfK");
        }
        
        public static StructureBoundingBox func_175848_a(final Start lllllllllllllIlIlIIllIlllllIllII, final List<StructureComponent> lllllllllllllIlIlIIllIlllllIlIlI, final Random lllllllllllllIlIlIIllIlllllIlIIl, final int lllllllllllllIlIlIIllIlllllIlIII, final int lllllllllllllIlIlIIllIlllllIIllI, final int lllllllllllllIlIlIIllIllllIlIlII, final EnumFacing lllllllllllllIlIlIIllIllllIlIIlI) {
            int lllllllllllllIlIlIIllIlllllIIIII = Path.lllllllIlllII[6] * MathHelper.getRandomIntegerInRange(lllllllllllllIlIlIIllIlllllIlIIl, Path.lllllllIlllII[5], Path.lllllllIlllII[2]);
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
            while (!lIllIIIlIlllIll(lllllllllllllIlIlIIllIlllllIIIII, Path.lllllllIlllII[6])) {
                final StructureBoundingBox lllllllllllllIlIlIIllIllllIllllI = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIlIlIIllIlllllIlIII, lllllllllllllIlIlIIllIlllllIIllI, lllllllllllllIlIlIIllIllllIlIlII, Path.lllllllIlllII[0], Path.lllllllIlllII[0], Path.lllllllIlllII[0], Path.lllllllIlllII[5], Path.lllllllIlllII[5], lllllllllllllIlIlIIllIlllllIIIII, lllllllllllllIlIlIIllIllllIlIIlI);
                if (lIllIIIlIlllIlI(StructureComponent.findIntersecting(lllllllllllllIlIlIIllIlllllIlIlI, lllllllllllllIlIlIIllIllllIllllI))) {
                    return lllllllllllllIlIlIIllIllllIllllI;
                }
                lllllllllllllIlIlIIllIlllllIIIII -= 7;
            }
            return null;
        }
        
        public Path() {
        }
        
        private static String lIllIIIlIlIllII(final String lllllllllllllIlIlIIllIllIllIllII, final String lllllllllllllIlIlIIllIllIllIlllI) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIllIllIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIllIllIlllI.getBytes(StandardCharsets.UTF_8)), Path.lllllllIlllII[4]), "DES");
                final Cipher lllllllllllllIlIlIIllIllIlllIlII = Cipher.getInstance("DES");
                lllllllllllllIlIlIIllIllIlllIlII.init(Path.lllllllIlllII[3], lllllllllllllIlIlIIllIllIlllIlll);
                return new String(lllllllllllllIlIlIIllIllIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIllIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIllIllIlllIIlI) {
                lllllllllllllIlIlIIllIllIlllIIlI.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIlIlIIlllIIIIlllIlI) {
            super.readStructureFromNBT(lllllllllllllIlIlIIlllIIIIlllIlI);
            this.length = lllllllllllllIlIlIIlllIIIIlllIlI.getInteger(Path.lllllllIllIIl[Path.lllllllIlllII[1]]);
        }
        
        static {
            lIllIIIlIllIlIl();
            lIllIIIlIllIlII();
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIlIIllIllllIIIIlI, final Random lllllllllllllIlIlIIllIllllIIIIIl, final StructureBoundingBox lllllllllllllIlIlIIllIlllIllIIll) {
            final IBlockState lllllllllllllIlIlIIllIlllIlllllI = this.func_175847_a(Blocks.gravel.getDefaultState());
            final IBlockState lllllllllllllIlIlIIllIlllIllllII = this.func_175847_a(Blocks.cobblestone.getDefaultState());
            int lllllllllllllIlIlIIllIlllIlllIlI = this.boundingBox.minX;
            "".length();
            if (null != null) {
                return ((0x12 ^ 0xB ^ (0x2 ^ 0x10)) & (38 + 102 + 8 + 8 ^ 17 + 23 + 59 + 52 ^ -" ".length())) != 0x0;
            }
            while (!lIllIIIlIllllII(lllllllllllllIlIlIIllIlllIlllIlI, this.boundingBox.maxX)) {
                int lllllllllllllIlIlIIllIlllIlllIII = this.boundingBox.minZ;
                "".length();
                if (((0x2F ^ 0x2 ^ (0x7D ^ 0x47)) & (0x3D ^ 0x4 ^ (0x29 ^ 0x7) ^ -" ".length())) != 0x0) {
                    return ((122 + 23 + 95 + 10 ^ 113 + 137 - 86 + 11) & (0x66 ^ 0x56 ^ (0xF9 ^ 0x9C) ^ -" ".length())) != 0x0;
                }
                while (!lIllIIIlIllllII(lllllllllllllIlIlIIllIlllIlllIII, this.boundingBox.maxZ)) {
                    BlockPos lllllllllllllIlIlIIllIlllIllIllI = new BlockPos(lllllllllllllIlIlIIllIlllIlllIlI, Path.lllllllIlllII[7], lllllllllllllIlIlIIllIlllIlllIII);
                    if (lIllIIIlIlllIII(lllllllllllllIlIlIIllIlllIllIIll.isVecInside(lllllllllllllIlIlIIllIlllIllIllI) ? 1 : 0)) {
                        lllllllllllllIlIlIIllIlllIllIllI = lllllllllllllIlIlIIllIllllIIIIlI.getTopSolidOrLiquidBlock(lllllllllllllIlIlIIllIlllIllIllI).down();
                        lllllllllllllIlIlIIllIllllIIIIlI.setBlockState(lllllllllllllIlIlIIllIlllIllIllI, lllllllllllllIlIlIIllIlllIlllllI, Path.lllllllIlllII[3]);
                        "".length();
                        lllllllllllllIlIlIIllIllllIIIIlI.setBlockState(lllllllllllllIlIlIIllIlllIllIllI.down(), lllllllllllllIlIlIIllIlllIllllII, Path.lllllllIlllII[3]);
                        "".length();
                    }
                    ++lllllllllllllIlIlIIllIlllIlllIII;
                }
                ++lllllllllllllIlIlIIllIlllIlllIlI;
            }
            return Path.lllllllIlllII[1] != 0;
        }
        
        private static boolean lIllIIIlIlllIIl(final int lllllllllllllIlIlIIllIllIlIlIlIl) {
            return lllllllllllllIlIlIIllIllIlIlIlIl > 0;
        }
        
        public Path(final Start lllllllllllllIlIlIIlllIIIlIIlIll, final int lllllllllllllIlIlIIlllIIIlIIlIlI, final Random lllllllllllllIlIlIIlllIIIlIlIIIl, final StructureBoundingBox lllllllllllllIlIlIIlllIIIlIIllll, final EnumFacing lllllllllllllIlIlIIlllIIIlIIllIl) {
            super(lllllllllllllIlIlIIlllIIIlIIlIll, lllllllllllllIlIlIIlllIIIlIIlIlI);
            this.coordBaseMode = lllllllllllllIlIlIIlllIIIlIIllIl;
            this.boundingBox = lllllllllllllIlIlIIlllIIIlIIllll;
            this.length = Math.max(lllllllllllllIlIlIIlllIIIlIIllll.getXSize(), lllllllllllllIlIlIIlllIIIlIIllll.getZSize());
        }
        
        private static boolean lIllIIIlIlllIll(final int lllllllllllllIlIlIIllIllIllIIIlI, final int lllllllllllllIlIlIIllIllIllIIIIl) {
            return lllllllllllllIlIlIIllIllIllIIIlI < lllllllllllllIlIlIIllIllIllIIIIl;
        }
        
        private static String lIllIIIlIlIlllI(final String lllllllllllllIlIlIIllIlllIIIlllI, final String lllllllllllllIlIlIIllIlllIIIllll) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIllIlllIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIlllIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIIllIlllIIlIIll = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIIllIlllIIlIIll.init(Path.lllllllIlllII[3], lllllllllllllIlIlIIllIlllIIlIlIl);
                return new String(lllllllllllllIlIlIIllIlllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIlllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIllIlllIIlIIIl) {
                lllllllllllllIlIlIIllIlllIIlIIIl.printStackTrace();
                return null;
            }
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Path.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIllIIIlIllIllI($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final String lllllllllllllIlIlIIllIlllIIllllI = (Object)new int[EnumFacing.values().length];
            try {
                lllllllllllllIlIlIIllIlllIIllllI[EnumFacing.DOWN.ordinal()] = Path.lllllllIlllII[1];
                "".length();
                if (((0x2D ^ 0x56 ^ (0x70 ^ 0x2)) & (125 + 49 - 108 + 89 ^ 43 + 136 - 84 + 51 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIlIlIIllIlllIIllllI[EnumFacing.EAST.ordinal()] = Path.lllllllIlllII[8];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIlIlIIllIlllIIllllI[EnumFacing.NORTH.ordinal()] = Path.lllllllIlllII[5];
                "".length();
                if (-" ".length() >= ((0xB ^ 0x2 ^ (0x83 ^ 0xA0)) & (130 + 122 - 169 + 66 ^ 16 + 63 - 8 + 120 ^ -" ".length()))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIlIlIIllIlllIIllllI[EnumFacing.SOUTH.ordinal()] = Path.lllllllIlllII[9];
                "".length();
                if (-" ".length() >= (0x64 ^ 0x60)) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                lllllllllllllIlIlIIllIlllIIllllI[EnumFacing.UP.ordinal()] = Path.lllllllIlllII[3];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                lllllllllllllIlIlIIllIlllIIllllI[EnumFacing.WEST.ordinal()] = Path.lllllllIlllII[2];
                "".length();
                if (((0x1C ^ 0x30) & ~(0xAD ^ 0x81)) == -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Path.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIlIlIIllIlllIIllllI;
        }
        
        private static boolean lIllIIIlIllIlll(final int lllllllllllllIlIlIIllIllIllIIllI, final int lllllllllllllIlIlIIllIllIllIIlIl) {
            return lllllllllllllIlIlIIllIllIllIIllI >= lllllllllllllIlIlIIllIllIllIIlIl;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIlIlIIlllIIIlIIIlII) {
            super.writeStructureToNBT(lllllllllllllIlIlIIlllIIIlIIIlII);
            lllllllllllllIlIlIIlllIIIlIIIlII.setInteger(Path.lllllllIllIIl[Path.lllllllIlllII[0]], this.length);
        }
    }
    
    public static class Hall extends Village
    {
        private static final /* synthetic */ int[] lIlIlllIIlIlII;
        
        static {
            llllIIllIlIllIl();
        }
        
        public Hall(final Start lllllllllllllIIIIlIllIlllIIllIlI, final int lllllllllllllIIIIlIllIlllIIlIIll, final Random lllllllllllllIIIIlIllIlllIIllIII, final StructureBoundingBox lllllllllllllIIIIlIllIlllIIlIIlI, final EnumFacing lllllllllllllIIIIlIllIlllIIlIIIl) {
            super(lllllllllllllIIIIlIllIlllIIllIlI, lllllllllllllIIIIlIllIlllIIlIIll);
            this.coordBaseMode = lllllllllllllIIIIlIllIlllIIlIIIl;
            this.boundingBox = lllllllllllllIIIIlIllIlllIIlIIlI;
        }
        
        private static boolean llllIIllIllIIII(final int lllllllllllllIIIIlIllIllIIlllIll) {
            return lllllllllllllIIIIlIllIllIIlllIll < 0;
        }
        
        private static boolean llllIIllIlIlllI(final int lllllllllllllIIIIlIllIllIIllllll) {
            return lllllllllllllIIIIlIllIllIIllllll != 0;
        }
        
        private static void llllIIllIlIllIl() {
            (lIlIlllIIlIlII = new int[13])[0] = ((0x80 ^ 0x8A) & ~(0xCE ^ 0xC4));
            Hall.lIlIlllIIlIlII[1] = (0xEC ^ 0x97 ^ (0xD6 ^ 0xA4));
            Hall.lIlIlllIIlIlII[2] = (0x7F ^ 0x78);
            Hall.lIlIlllIIlIlII[3] = (0xAD ^ 0xA6);
            Hall.lIlIlllIIlIlII[4] = " ".length();
            Hall.lIlIlllIIlIlII[5] = (0x1D ^ 0x19);
            Hall.lIlIlllIIlIlII[6] = "  ".length();
            Hall.lIlIlllIIlIlII[7] = (0x1F ^ 0x19);
            Hall.lIlIlllIIlIlII[8] = (0x3 ^ 0x2F ^ (0x39 ^ 0x1D));
            Hall.lIlIlllIIlIlII[9] = (0x15 ^ 0x1F);
            Hall.lIlIlllIIlIlII[10] = "   ".length();
            Hall.lIlIlllIIlIlII[11] = (0x58 ^ 0x3A ^ (0xE8 ^ 0x8F));
            Hall.lIlIlllIIlIlII[12] = -" ".length();
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIIlIllIllIllIIIlI, final Random lllllllllllllIIIIlIllIllIllIlIll, final StructureBoundingBox lllllllllllllIIIIlIllIllIllIIIII) {
            if (llllIIllIllIIII(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII);
                if (llllIIllIllIIII(this.field_143015_k)) {
                    return Hall.lIlIlllIIlIlII[4] != 0;
                }
                this.boundingBox.offset(Hall.lIlIlllIIlIlII[0], this.field_143015_k - this.boundingBox.maxY + Hall.lIlIlllIIlIlII[2] - Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[0]);
            }
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[9], Blocks.dirt.getDefaultState(), Blocks.dirt.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.cobblestone.getDefaultState(), Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[7], lllllllllllllIIIIlIllIllIllIIIII);
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[9], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[9], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[9], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[9], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[11], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[11], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[0], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[11], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[11], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[0], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[11], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[11], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[4], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[11], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[11], Hall.lIlIlllIIlIlII[10], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.planks.getDefaultState(), Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[6], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.planks.getDefaultState(), Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[10], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.planks.getDefaultState(), Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[6], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.planks.getDefaultState(), Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[10], lllllllllllllIIIIlIllIllIllIIIII);
            final int lllllllllllllIIIIlIllIllIllIlIIl = this.getMetadataWithOffset(Blocks.oak_stairs, Hall.lIlIlllIIlIlII[10]);
            final int lllllllllllllIIIIlIllIllIllIlIII = this.getMetadataWithOffset(Blocks.oak_stairs, Hall.lIlIlllIIlIlII[6]);
            int lllllllllllllIIIIlIllIllIllIIlll = Hall.lIlIlllIIlIlII[12];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return ((0x10 ^ 0x2D ^ (0x35 ^ 0x41)) & (0x33 ^ 0x12 ^ (0x45 ^ 0x2D) ^ -" ".length())) != 0x0;
            }
            while (!llllIIllIllIIIl(lllllllllllllIIIIlIllIllIllIIlll, Hall.lIlIlllIIlIlII[6])) {
                int lllllllllllllIIIIlIllIllIllIIllI = Hall.lIlIlllIIlIlII[0];
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return ((154 + 106 - 95 + 14 ^ 178 + 70 - 153 + 93) & (0x2D ^ 0x32 ^ (0xBB ^ 0xAB) ^ -" ".length())) != 0x0;
                }
                while (!llllIIllIllIIIl(lllllllllllllIIIIlIllIllIllIIllI, Hall.lIlIlllIIlIlII[8])) {
                    this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.oak_stairs.getStateFromMeta(lllllllllllllIIIIlIllIllIllIlIIl), lllllllllllllIIIIlIllIllIllIIllI, Hall.lIlIlllIIlIlII[5] + lllllllllllllIIIIlIllIllIllIIlll, lllllllllllllIIIIlIllIllIllIIlll, lllllllllllllIIIIlIllIllIllIIIII);
                    this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.oak_stairs.getStateFromMeta(lllllllllllllIIIIlIllIllIllIlIII), lllllllllllllIIIIlIllIllIllIIllI, Hall.lIlIlllIIlIlII[5] + lllllllllllllIIIIlIllIllIllIIlll, Hall.lIlIlllIIlIlII[11] - lllllllllllllIIIIlIllIllIllIIlll, lllllllllllllIIIIlIllIllIllIIIII);
                    ++lllllllllllllIIIIlIllIllIllIIllI;
                }
                ++lllllllllllllIIIIlIllIllIllIIlll;
            }
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.log.getDefaultState(), Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.log.getDefaultState(), Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[5], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.log.getDefaultState(), Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.log.getDefaultState(), Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[5], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[6], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[10], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[6], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[8], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[10], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[11], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[11], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[11], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[0], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.glass_pane.getDefaultState(), Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[11], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.oak_fence.getDefaultState(), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[10], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.wooden_pressure_plate.getDefaultState(), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[10], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.planks.getDefaultState(), Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[5], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.oak_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.oak_stairs, Hall.lIlIlllIIlIlII[10])), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[5], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.oak_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.oak_stairs, Hall.lIlIlllIIlIlII[4])), Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[10], lllllllllllllIIIIlIllIllIllIIIII);
            this.fillWithBlocks(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[11], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[10], Blocks.double_stone_slab.getDefaultState(), Blocks.double_stone_slab.getDefaultState(), (boolean)(Hall.lIlIlllIIlIlII[0] != 0));
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.double_stone_slab.getDefaultState(), Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[4], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.double_stone_slab.getDefaultState(), Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[6], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.air.getDefaultState(), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[0], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.air.getDefaultState(), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[0], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[4], lllllllllllllIIIIlIllIllIllIIIII);
            this.placeDoorCurrentPosition(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, lllllllllllllIIIIlIllIllIllIlIll, Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[0], EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, Hall.lIlIlllIIlIlII[4])));
            if (llllIIllIllIIlI(this.getBlockStateFromPos(lllllllllllllIIIIlIllIllIllIIIlI, Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[12], lllllllllllllIIIIlIllIllIllIIIII).getBlock().getMaterial(), Material.air) && llllIIllIllIIll(this.getBlockStateFromPos(lllllllllllllIIIIlIllIllIllIIIlI, Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[12], Hall.lIlIlllIIlIlII[12], lllllllllllllIIIIlIllIllIllIIIII).getBlock().getMaterial(), Material.air)) {
                this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, Hall.lIlIlllIIlIlII[10])), Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[12], lllllllllllllIIIIlIllIllIllIIIII);
            }
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.air.getDefaultState(), Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[11], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.air.getDefaultState(), Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[11], lllllllllllllIIIIlIllIllIllIIIII);
            this.setBlockState(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode.getOpposite()), Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[10], Hall.lIlIlllIIlIlII[5], lllllllllllllIIIIlIllIllIllIIIII);
            this.placeDoorCurrentPosition(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, lllllllllllllIIIIlIllIllIllIlIll, Hall.lIlIlllIIlIlII[7], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[11], EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, Hall.lIlIlllIIlIlII[4])));
            int lllllllllllllIIIIlIllIllIllIIlIl = Hall.lIlIlllIIlIlII[0];
            "".length();
            if (((20 + 107 - 58 + 152 ^ 80 + 100 - 39 + 6) & (0x69 ^ 0x3F ^ (0xA ^ 0x12) ^ -" ".length())) != ((0x36 ^ 0x14 ^ (0x19 ^ 0x62)) & (0x7F ^ 0x58 ^ (0x22 ^ 0x5C) ^ -" ".length()))) {
                return ((0xE ^ 0x1B ^ (0x71 ^ 0x6E)) & (0xE7 ^ 0xBA ^ (0x96 ^ 0xC1) ^ -" ".length())) != 0x0;
            }
            while (!llllIIllIllIlII(lllllllllllllIIIIlIllIllIllIIlIl, Hall.lIlIlllIIlIlII[11])) {
                int lllllllllllllIIIIlIllIllIllIIlII = Hall.lIlIlllIIlIlII[0];
                "".length();
                if (null != null) {
                    return ((0xB5 ^ 0xB2) & ~(0x94 ^ 0x93)) != 0x0;
                }
                while (!llllIIllIllIlII(lllllllllllllIIIIlIllIllIllIIlII, Hall.lIlIlllIIlIlII[1])) {
                    this.clearCurrentPositionBlocksUpwards(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIlII, Hall.lIlIlllIIlIlII[2], lllllllllllllIIIIlIllIllIllIIlIl, lllllllllllllIIIIlIllIllIllIIIII);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIIIIlIllIllIllIIIlI, Blocks.cobblestone.getDefaultState(), lllllllllllllIIIIlIllIllIllIIlII, Hall.lIlIlllIIlIlII[12], lllllllllllllIIIIlIllIllIllIIlIl, lllllllllllllIIIIlIllIllIllIIIII);
                    ++lllllllllllllIIIIlIllIllIllIIlII;
                }
                ++lllllllllllllIIIIlIllIllIllIIlIl;
            }
            this.spawnVillagers(lllllllllllllIIIIlIllIllIllIIIlI, lllllllllllllIIIIlIllIllIllIIIII, Hall.lIlIlllIIlIlII[5], Hall.lIlIlllIIlIlII[4], Hall.lIlIlllIIlIlII[6], Hall.lIlIlllIIlIlII[6]);
            return Hall.lIlIlllIIlIlII[4] != 0;
        }
        
        public Hall() {
        }
        
        private static boolean llllIIllIlIllll(final Object lllllllllllllIIIIlIllIllIlIIIIIl) {
            return lllllllllllllIIIIlIllIllIlIIIIIl == null;
        }
        
        @Override
        protected int func_180779_c(final int lllllllllllllIIIIlIllIllIlIlIlll, final int lllllllllllllIIIIlIllIllIlIlIIll) {
            int func_180779_c;
            if (llllIIllIllIlIl(lllllllllllllIIIIlIllIllIlIlIlll)) {
                func_180779_c = Hall.lIlIlllIIlIlII[5];
                "".length();
                if (((0x5D ^ 0x54) & ~(0x73 ^ 0x7A)) < ((0x76 ^ 0x38) & ~(0x54 ^ 0x1A))) {
                    return (0x5F ^ 0x79) & ~(0x41 ^ 0x67);
                }
            }
            else {
                func_180779_c = super.func_180779_c(lllllllllllllIIIIlIllIllIlIlIlll, lllllllllllllIIIIlIllIllIlIlIIll);
            }
            return func_180779_c;
        }
        
        private static boolean llllIIllIllIlIl(final int lllllllllllllIIIIlIllIllIIllllIl) {
            return lllllllllllllIIIIlIllIllIIllllIl == 0;
        }
        
        private static boolean llllIIllIllIIlI(final Object lllllllllllllIIIIlIllIllIlIIIlII, final Object lllllllllllllIIIIlIllIllIlIIIIll) {
            return lllllllllllllIIIIlIllIllIlIIIlII == lllllllllllllIIIIlIllIllIlIIIIll;
        }
        
        private static boolean llllIIllIllIIIl(final int lllllllllllllIIIIlIllIllIlIIllII, final int lllllllllllllIIIIlIllIllIlIIlIll) {
            return lllllllllllllIIIIlIllIllIlIIllII > lllllllllllllIIIIlIllIllIlIIlIll;
        }
        
        private static boolean llllIIllIllIlII(final int lllllllllllllIIIIlIllIllIlIlIIII, final int lllllllllllllIIIIlIllIllIlIIllll) {
            return lllllllllllllIIIIlIllIllIlIlIIII >= lllllllllllllIIIIlIllIllIlIIllll;
        }
        
        public static Hall func_175857_a(final Start lllllllllllllIIIIlIllIlllIIIIlll, final List<StructureComponent> lllllllllllllIIIIlIllIlllIIIIllI, final Random lllllllllllllIIIIlIllIlllIIIIlIl, final int lllllllllllllIIIIlIllIlllIIIIlII, final int lllllllllllllIIIIlIllIlllIIIIIll, final int lllllllllllllIIIIlIllIlllIIIIIlI, final EnumFacing lllllllllllllIIIIlIllIlllIIIIIIl, final int lllllllllllllIIIIlIllIllIlllIlll) {
            final StructureBoundingBox lllllllllllllIIIIlIllIllIlllllll = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIIIlIllIlllIIIIlII, lllllllllllllIIIIlIllIlllIIIIIll, lllllllllllllIIIIlIllIlllIIIIIlI, Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[0], Hall.lIlIlllIIlIlII[1], Hall.lIlIlllIIlIlII[2], Hall.lIlIlllIIlIlII[3], lllllllllllllIIIIlIllIlllIIIIIIl);
            Hall hall;
            if (llllIIllIlIlllI(Village.canVillageGoDeeper(lllllllllllllIIIIlIllIllIlllllll) ? 1 : 0) && llllIIllIlIllll(StructureComponent.findIntersecting(lllllllllllllIIIIlIllIlllIIIIllI, lllllllllllllIIIIlIllIllIlllllll))) {
                hall = new Hall(lllllllllllllIIIIlIllIlllIIIIlll, lllllllllllllIIIIlIllIllIlllIlll, lllllllllllllIIIIlIllIlllIIIIlIl, lllllllllllllIIIIlIllIllIlllllll, lllllllllllllIIIIlIllIlllIIIIIIl);
                "".length();
                if (((0x24 ^ 0x2F) & ~(0xF ^ 0x4)) > "   ".length()) {
                    return null;
                }
            }
            else {
                hall = null;
            }
            return hall;
        }
        
        private static boolean llllIIllIllIIll(final Object lllllllllllllIIIIlIllIllIlIIlIII, final Object lllllllllllllIIIIlIllIllIlIIIlll) {
            return lllllllllllllIIIIlIllIllIlIIlIII != lllllllllllllIIIIlIllIllIlIIIlll;
        }
    }
    
    public static class WoodHut extends Village
    {
        private static final /* synthetic */ String[] llIlllIllllIll;
        private static final /* synthetic */ int[] llIllllIIIIllI;
        private /* synthetic */ boolean isTallHouse;
        private /* synthetic */ int tablePosition;
        
        private static void lIIllIlIIIlllllI() {
            (llIlllIllllIll = new String[WoodHut.llIllllIIIIllI[4]])[WoodHut.llIllllIIIIllI[1]] = lIIllIlIIIlllIII("o80H18ZVPLg=", "fiMpc");
            WoodHut.llIlllIllllIll[WoodHut.llIllllIIIIllI[2]] = lIIllIlIIIlllIIl("zWaK+q49cPo=", "eEdbF");
            WoodHut.llIlllIllllIll[WoodHut.llIllllIIIIllI[3]] = lIIllIlIIIlllIIl("FHoRi7pajmI=", "qtePO");
            WoodHut.llIlllIllllIll[WoodHut.llIllllIIIIllI[0]] = lIIllIlIIIllllIl("AQ==", "BvvCn");
        }
        
        private static boolean lIIllIlIIlIIlIII(final Object llllllllllllIllIIlIIIIIIIIllllll, final Object llllllllllllIllIIlIIIIIIIIlllllI) {
            return llllllllllllIllIIlIIIIIIIIllllll != llllllllllllIllIIlIIIIIIIIlllllI;
        }
        
        private static boolean lIIllIlIIlIIIllI(final int llllllllllllIllIIlIIIIIIIIllIIlI) {
            return llllllllllllIllIIlIIIIIIIIllIIlI > 0;
        }
        
        private static boolean lIIllIlIIlIIIlII(final Object llllllllllllIllIIlIIIIIIIIlllIII) {
            return llllllllllllIllIIlIIIIIIIIlllIII == null;
        }
        
        private static boolean lIIllIlIIlIIIlll(final Object llllllllllllIllIIlIIIIIIIIlllIll, final Object llllllllllllIllIIlIIIIIIIIlllIlI) {
            return llllllllllllIllIIlIIIIIIIIlllIll == llllllllllllIllIIlIIIIIIIIlllIlI;
        }
        
        public WoodHut(final Start llllllllllllIllIIlIIIIIIllllIIll, final int llllllllllllIllIIlIIIIIIlllIllII, final Random llllllllllllIllIIlIIIIIIlllIlIll, final StructureBoundingBox llllllllllllIllIIlIIIIIIlllIlIlI, final EnumFacing llllllllllllIllIIlIIIIIIlllIlIIl) {
            super(llllllllllllIllIIlIIIIIIllllIIll, llllllllllllIllIIlIIIIIIlllIllII);
            this.coordBaseMode = llllllllllllIllIIlIIIIIIlllIlIIl;
            this.boundingBox = llllllllllllIllIIlIIIIIIlllIlIlI;
            this.isTallHouse = llllllllllllIllIIlIIIIIIlllIlIll.nextBoolean();
            this.tablePosition = llllllllllllIllIIlIIIIIIlllIlIll.nextInt(WoodHut.llIllllIIIIllI[0]);
        }
        
        private static String lIIllIlIIIllllIl(String llllllllllllIllIIlIIIIIIIllIIIIl, final String llllllllllllIllIIlIIIIIIIllIIIII) {
            llllllllllllIllIIlIIIIIIIllIIIIl = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIIIIIIllIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlIIIIIIIllIIlII = new StringBuilder();
            final char[] llllllllllllIllIIlIIIIIIIllIIIll = llllllllllllIllIIlIIIIIIIllIIIII.toCharArray();
            int llllllllllllIllIIlIIIIIIIllIIIlI = WoodHut.llIllllIIIIllI[1];
            final float llllllllllllIllIIlIIIIIIIlIllIll = (Object)((String)llllllllllllIllIIlIIIIIIIllIIIIl).toCharArray();
            final char llllllllllllIllIIlIIIIIIIlIllIlI = (char)llllllllllllIllIIlIIIIIIIlIllIll.length;
            boolean llllllllllllIllIIlIIIIIIIlIllIII = WoodHut.llIllllIIIIllI[1] != 0;
            while (lIIllIlIIlIIlIlI(llllllllllllIllIIlIIIIIIIlIllIII ? 1 : 0, llllllllllllIllIIlIIIIIIIlIllIlI)) {
                final char llllllllllllIllIIlIIIIIIIllIlIlI = llllllllllllIllIIlIIIIIIIlIllIll[llllllllllllIllIIlIIIIIIIlIllIII];
                llllllllllllIllIIlIIIIIIIllIIlII.append((char)(llllllllllllIllIIlIIIIIIIllIlIlI ^ llllllllllllIllIIlIIIIIIIllIIIll[llllllllllllIllIIlIIIIIIIllIIIlI % llllllllllllIllIIlIIIIIIIllIIIll.length]));
                "".length();
                ++llllllllllllIllIIlIIIIIIIllIIIlI;
                ++llllllllllllIllIIlIIIIIIIlIllIII;
                "".length();
                if ((0xA ^ 0x65 ^ (0xA8 ^ 0xC3)) <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlIIIIIIIllIIlII);
        }
        
        public static WoodHut func_175853_a(final Start llllllllllllIllIIlIIIIIIllIlIIll, final List<StructureComponent> llllllllllllIllIIlIIIIIIllIlIIlI, final Random llllllllllllIllIIlIIIIIIllIlIIIl, final int llllllllllllIllIIlIIIIIIllIlIIII, final int llllllllllllIllIIlIIIIIIllIIIllI, final int llllllllllllIllIIlIIIIIIllIIIlIl, final EnumFacing llllllllllllIllIIlIIIIIIllIIIlII, final int llllllllllllIllIIlIIIIIIllIIllII) {
            final StructureBoundingBox llllllllllllIllIIlIIIIIIllIIlIll = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIIlIIIIIIllIlIIII, llllllllllllIllIIlIIIIIIllIIIllI, llllllllllllIllIIlIIIIIIllIIIlIl, WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[5], WoodHut.llIllllIIIIllI[6], llllllllllllIllIIlIIIIIIllIIIlII);
            WoodHut woodHut;
            if (lIIllIlIIlIIIIll(Village.canVillageGoDeeper(llllllllllllIllIIlIIIIIIllIIlIll) ? 1 : 0) && lIIllIlIIlIIIlII(StructureComponent.findIntersecting(llllllllllllIllIIlIIIIIIllIlIIlI, llllllllllllIllIIlIIIIIIllIIlIll))) {
                woodHut = new WoodHut(llllllllllllIllIIlIIIIIIllIlIIll, llllllllllllIllIIlIIIIIIllIIllII, llllllllllllIllIIlIIIIIIllIlIIIl, llllllllllllIllIIlIIIIIIllIIlIll, llllllllllllIllIIlIIIIIIllIIIlII);
                "".length();
                if (" ".length() >= (0x9F ^ 0x9B)) {
                    return null;
                }
            }
            else {
                woodHut = null;
            }
            return woodHut;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIIlIIIIIIllIlllIl) {
            super.readStructureFromNBT(llllllllllllIllIIlIIIIIIllIlllIl);
            this.tablePosition = llllllllllllIllIIlIIIIIIllIlllIl.getInteger(WoodHut.llIlllIllllIll[WoodHut.llIllllIIIIllI[3]]);
            this.isTallHouse = llllllllllllIllIIlIIIIIIllIlllIl.getBoolean(WoodHut.llIlllIllllIll[WoodHut.llIllllIIIIllI[0]]);
        }
        
        private static String lIIllIlIIIlllIIl(final String llllllllllllIllIIlIIIIIIIlIIllll, final String llllllllllllIllIIlIIIIIIIlIIlllI) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIIIIIIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIlIIIIIIIlIlIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIIlIIIIIIIlIlIIIl.init(WoodHut.llIllllIIIIllI[3], llllllllllllIllIIlIIIIIIIlIlIIlI);
                return new String(llllllllllllIllIIlIIIIIIIlIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIIIIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIIIIIIlIlIIII) {
                llllllllllllIllIIlIIIIIIIlIlIIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIllIlIIlIIIIll(final int llllllllllllIllIIlIIIIIIIIllIllI) {
            return llllllllllllIllIIlIIIIIIIIllIllI != 0;
        }
        
        private static String lIIllIlIIIlllIII(final String llllllllllllIllIIlIIIIIIlIIIlIIl, final String llllllllllllIllIIlIIIIIIlIIIIlll) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIIIIIlIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIIIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), WoodHut.llIllllIIIIllI[8]), "DES");
                final Cipher llllllllllllIllIIlIIIIIIlIIIllIl = Cipher.getInstance("DES");
                llllllllllllIllIIlIIIIIIlIIIllIl.init(WoodHut.llIllllIIIIllI[3], llllllllllllIllIIlIIIIIIlIIIllll);
                return new String(llllllllllllIllIIlIIIIIIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIIIIIlIIIlIll) {
                llllllllllllIllIIlIIIIIIlIIIlIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIllIlIIlIIIlIl(final int llllllllllllIllIIlIIIIIIIIllIlII) {
            return llllllllllllIllIIlIIIIIIIIllIlII < 0;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIlIIIIIIlIlIIlll, final Random llllllllllllIllIIlIIIIIIlIlIIlIl, final StructureBoundingBox llllllllllllIllIIlIIIIIIlIlIlllI) {
            if (lIIllIlIIlIIIlIl(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI);
                if (lIIllIlIIlIIIlIl(this.field_143015_k)) {
                    return WoodHut.llIllllIIIIllI[2] != 0;
                }
                this.boundingBox.offset(WoodHut.llIllllIIIIllI[1], this.field_143015_k - this.boundingBox.maxY + WoodHut.llIllllIIIIllI[5] - WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1]);
            }
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[6], WoodHut.llIllllIIIIllI[4], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[4], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[0], Blocks.dirt.getDefaultState(), Blocks.dirt.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            if (lIIllIlIIlIIIIll(this.isTallHouse ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[0], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
                "".length();
                if ("  ".length() == 0) {
                    return ((0x53 ^ 0x19) & ~(0x34 ^ 0x7E)) != 0x0;
                }
            }
            else {
                this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[6], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[6], WoodHut.llIllllIIIIllI[0], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            }
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[1], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[1], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[4], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[4], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[2], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[3], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[0], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[2], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[3], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.log.getDefaultState(), WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[0], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[1], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[1], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[4], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[4], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[0], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[0], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[1], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.fillWithBlocks(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[4], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[4], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(WoodHut.llIllllIIIIllI[1] != 0));
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.glass_pane.getDefaultState(), WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[3], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.glass_pane.getDefaultState(), WoodHut.llIllllIIIIllI[0], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[3], llllllllllllIllIIlIIIIIIlIlIlllI);
            if (lIIllIlIIlIIIllI(this.tablePosition)) {
                this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.oak_fence.getDefaultState(), this.tablePosition, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[0], llllllllllllIllIIlIIIIIIlIlIlllI);
                this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.wooden_pressure_plate.getDefaultState(), this.tablePosition, WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[0], llllllllllllIllIIlIIIIIIlIlIlllI);
            }
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.air.getDefaultState(), WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.air.getDefaultState(), WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[1], llllllllllllIllIIlIIIIIIlIlIlllI);
            this.placeDoorCurrentPosition(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, llllllllllllIllIIlIIIIIIlIlIIlIl, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, WoodHut.llIllllIIIIllI[2])));
            if (lIIllIlIIlIIIlll(this.getBlockStateFromPos(llllllllllllIllIIlIIIIIIlIlIIlll, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[7], llllllllllllIllIIlIIIIIIlIlIlllI).getBlock().getMaterial(), Material.air) && lIIllIlIIlIIlIII(this.getBlockStateFromPos(llllllllllllIllIIlIIIIIIlIlIIlll, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[7], WoodHut.llIllllIIIIllI[7], llllllllllllIllIIlIIIIIIlIlIlllI).getBlock().getMaterial(), Material.air)) {
                this.setBlockState(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, WoodHut.llIllllIIIIllI[0])), WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[1], WoodHut.llIllllIIIIllI[7], llllllllllllIllIIlIIIIIIlIlIlllI);
            }
            int llllllllllllIllIIlIIIIIIlIlIllII = WoodHut.llIllllIIIIllI[1];
            "".length();
            if ((0x71 ^ 0x75) > (0x8F ^ 0x8B)) {
                return ((0x25 ^ 0x71) & ~(0x3E ^ 0x6A)) != 0x0;
            }
            while (!lIIllIlIIlIIlIIl(llllllllllllIllIIlIIIIIIlIlIllII, WoodHut.llIllllIIIIllI[6])) {
                int llllllllllllIllIIlIIIIIIlIlIlIlI = WoodHut.llIllllIIIIllI[1];
                "".length();
                if (-" ".length() > -" ".length()) {
                    return ((0x81 ^ 0xA4 ^ (0x7C ^ 0x4F)) & (0x3A ^ 0x4 ^ (0x72 ^ 0x5A) ^ -" ".length())) != 0x0;
                }
                while (!lIIllIlIIlIIlIIl(llllllllllllIllIIlIIIIIIlIlIlIlI, WoodHut.llIllllIIIIllI[4])) {
                    this.clearCurrentPositionBlocksUpwards(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlIlI, WoodHut.llIllllIIIIllI[5], llllllllllllIllIIlIIIIIIlIlIllII, llllllllllllIllIIlIIIIIIlIlIlllI);
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIIlIIIIIIlIlIIlll, Blocks.cobblestone.getDefaultState(), llllllllllllIllIIlIIIIIIlIlIlIlI, WoodHut.llIllllIIIIllI[7], llllllllllllIllIIlIIIIIIlIlIllII, llllllllllllIllIIlIIIIIIlIlIlllI);
                    ++llllllllllllIllIIlIIIIIIlIlIlIlI;
                }
                ++llllllllllllIllIIlIIIIIIlIlIllII;
            }
            this.spawnVillagers(llllllllllllIllIIlIIIIIIlIlIIlll, llllllllllllIllIIlIIIIIIlIlIlllI, WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[2], WoodHut.llIllllIIIIllI[3], WoodHut.llIllllIIIIllI[2]);
            return WoodHut.llIllllIIIIllI[2] != 0;
        }
        
        public WoodHut() {
        }
        
        private static boolean lIIllIlIIlIIlIIl(final int llllllllllllIllIIlIIIIIIIlIIIlll, final int llllllllllllIllIIlIIIIIIIlIIIllI) {
            return llllllllllllIllIIlIIIIIIIlIIIlll >= llllllllllllIllIIlIIIIIIIlIIIllI;
        }
        
        static {
            lIIllIlIIlIIIIlI();
            lIIllIlIIIlllllI();
        }
        
        private static void lIIllIlIIlIIIIlI() {
            (llIllllIIIIllI = new int[9])[0] = "   ".length();
            WoodHut.llIllllIIIIllI[1] = ((0xB4 ^ 0x9C) & ~(0x80 ^ 0xA8));
            WoodHut.llIllllIIIIllI[2] = " ".length();
            WoodHut.llIllllIIIIllI[3] = "  ".length();
            WoodHut.llIllllIIIIllI[4] = (0x1C ^ 0x18);
            WoodHut.llIllllIIIIllI[5] = (0x7C ^ 0x7A);
            WoodHut.llIllllIIIIllI[6] = (0x4C ^ 0x1D ^ (0xE0 ^ 0xB4));
            WoodHut.llIllllIIIIllI[7] = -" ".length();
            WoodHut.llIllllIIIIllI[8] = (0xA ^ 0x2);
        }
        
        private static boolean lIIllIlIIlIIlIlI(final int llllllllllllIllIIlIIIIIIIlIIIIll, final int llllllllllllIllIIlIIIIIIIlIIIIlI) {
            return llllllllllllIllIIlIIIIIIIlIIIIll < llllllllllllIllIIlIIIIIIIlIIIIlI;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIIlIIIIIIlllIIlIl) {
            super.writeStructureToNBT(llllllllllllIllIIlIIIIIIlllIIlIl);
            llllllllllllIllIIlIIIIIIlllIIlIl.setInteger(WoodHut.llIlllIllllIll[WoodHut.llIllllIIIIllI[1]], this.tablePosition);
            llllllllllllIllIIlIIIIIIlllIIlIl.setBoolean(WoodHut.llIlllIllllIll[WoodHut.llIllllIIIIllI[2]], this.isTallHouse);
        }
    }
    
    public static class Torch extends Village
    {
        private static final /* synthetic */ int[] lllIIIlIlIllIl;
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIIIIIllIlIIlIlll, final Random llllllllllllIllIIIIIIllIlIIlIllI, final StructureBoundingBox llllllllllllIllIIIIIIllIlIIlIIIl) {
            if (lIIlllIllIIIIIll(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(llllllllllllIllIIIIIIllIlIIlIlll, llllllllllllIllIIIIIIllIlIIlIIIl);
                if (lIIlllIllIIIIIll(this.field_143015_k)) {
                    return Torch.lllIIIlIlIllIl[4] != 0;
                }
                this.boundingBox.offset(Torch.lllIIIlIlIllIl[0], this.field_143015_k - this.boundingBox.maxY + Torch.lllIIIlIlIllIl[2] - Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[0]);
            }
            this.fillWithBlocks(llllllllllllIllIIIIIIllIlIIlIlll, llllllllllllIllIIIIIIllIlIIlIIIl, Torch.lllIIIlIlIllIl[0], Torch.lllIIIlIlIllIl[0], Torch.lllIIIlIlIllIl[0], Torch.lllIIIlIlIllIl[3], Torch.lllIIIlIlIllIl[1], Torch.lllIIIlIlIllIl[4], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Torch.lllIIIlIlIllIl[0] != 0));
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, Blocks.oak_fence.getDefaultState(), Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[0], Torch.lllIIIlIlIllIl[0], llllllllllllIllIIIIIIllIlIIlIIIl);
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, Blocks.oak_fence.getDefaultState(), Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[0], llllllllllllIllIIIIIIllIlIIlIIIl);
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, Blocks.oak_fence.getDefaultState(), Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[3], Torch.lllIIIlIlIllIl[0], llllllllllllIllIIIIIIllIlIIlIIIl);
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, Blocks.wool.getStateFromMeta(EnumDyeColor.WHITE.getDyeDamage()), Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[1], Torch.lllIIIlIlIllIl[0], llllllllllllIllIIIIIIllIlIIlIIIl);
            int n;
            if (lIIlllIllIIIIlII(this.coordBaseMode, EnumFacing.EAST) && lIIlllIllIIIIlII(this.coordBaseMode, EnumFacing.NORTH)) {
                n = Torch.lllIIIlIlIllIl[0];
                "".length();
                if (null != null) {
                    return ((0xE2 ^ 0x96 ^ (0x74 ^ 0x38)) & (8 + 82 + 6 + 34 ^ 88 + 77 - 94 + 115 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = Torch.lllIIIlIlIllIl[4];
            }
            final boolean llllllllllllIllIIIIIIllIlIIlIlII = n != 0;
            final IBlockState withProperty = Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode.rotateY());
            int llllllllllllIllllllIIllIlIIlIlIl;
            if (lIIlllIllIIIIlIl(llllllllllllIllIIIIIIllIlIIlIlII ? 1 : 0)) {
                llllllllllllIllllllIIllIlIIlIlIl = Torch.lllIIIlIlIllIl[3];
                "".length();
                if (" ".length() < " ".length()) {
                    return ((0x47 ^ 0x48 ^ (0x6B ^ 0x42)) & (3 + 3 + 147 + 30 ^ 59 + 102 - 85 + 69 ^ -" ".length())) != 0x0;
                }
            }
            else {
                llllllllllllIllllllIIllIlIIlIlIl = Torch.lllIIIlIlIllIl[0];
            }
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, withProperty, llllllllllllIllllllIIllIlIIlIlIl, Torch.lllIIIlIlIllIl[1], Torch.lllIIIlIlIllIl[0], llllllllllllIllIIIIIIllIlIIlIIIl);
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode), Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[1], Torch.lllIIIlIlIllIl[4], llllllllllllIllIIIIIIllIlIIlIIIl);
            final IBlockState withProperty2 = Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode.rotateYCCW());
            int llllllllllllIllllllIIllIlIIlIlIl2;
            if (lIIlllIllIIIIlIl(llllllllllllIllIIIIIIllIlIIlIlII ? 1 : 0)) {
                llllllllllllIllllllIIllIlIIlIlIl2 = Torch.lllIIIlIlIllIl[0];
                "".length();
                if (null != null) {
                    return ((0x65 ^ 0x2E) & ~(0x72 ^ 0x39)) != 0x0;
                }
            }
            else {
                llllllllllllIllllllIIllIlIIlIlIl2 = Torch.lllIIIlIlIllIl[3];
            }
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, withProperty2, llllllllllllIllllllIIllIlIIlIlIl2, Torch.lllIIIlIlIllIl[1], Torch.lllIIIlIlIllIl[0], llllllllllllIllIIIIIIllIlIIlIIIl);
            this.setBlockState(llllllllllllIllIIIIIIllIlIIlIlll, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode.getOpposite()), Torch.lllIIIlIlIllIl[4], Torch.lllIIIlIlIllIl[1], Torch.lllIIIlIlIllIl[5], llllllllllllIllIIIIIIllIlIIlIIIl);
            return Torch.lllIIIlIlIllIl[4] != 0;
        }
        
        public static StructureBoundingBox func_175856_a(final Start llllllllllllIllIIIIIIllIlIlIlIlI, final List<StructureComponent> llllllllllllIllIIIIIIllIlIlIlIIl, final Random llllllllllllIllIIIIIIllIlIlIlIII, final int llllllllllllIllIIIIIIllIlIlIIIIl, final int llllllllllllIllIIIIIIllIlIlIIIII, final int llllllllllllIllIIIIIIllIlIlIIlIl, final EnumFacing llllllllllllIllIIIIIIllIlIIllllI) {
            final StructureBoundingBox llllllllllllIllIIIIIIllIlIlIIIll = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIIIIIIllIlIlIIIIl, llllllllllllIllIIIIIIllIlIlIIIII, llllllllllllIllIIIIIIllIlIlIIlIl, Torch.lllIIIlIlIllIl[0], Torch.lllIIIlIlIllIl[0], Torch.lllIIIlIlIllIl[0], Torch.lllIIIlIlIllIl[1], Torch.lllIIIlIlIllIl[2], Torch.lllIIIlIlIllIl[3], llllllllllllIllIIIIIIllIlIIllllI);
            StructureBoundingBox structureBoundingBox;
            if (lIIlllIllIIIIIlI(StructureComponent.findIntersecting(llllllllllllIllIIIIIIllIlIlIlIIl, llllllllllllIllIIIIIIllIlIlIIIll))) {
                structureBoundingBox = null;
                "".length();
                if (-" ".length() >= " ".length()) {
                    return null;
                }
            }
            else {
                structureBoundingBox = llllllllllllIllIIIIIIllIlIlIIIll;
            }
            return structureBoundingBox;
        }
        
        static {
            lIIlllIllIIIIIIl();
        }
        
        private static boolean lIIlllIllIIIIlIl(final int llllllllllllIllIIIIIIllIlIIIlIII) {
            return llllllllllllIllIIIIIIllIlIIIlIII != 0;
        }
        
        private static boolean lIIlllIllIIIIIll(final int llllllllllllIllIIIIIIllIlIIIIllI) {
            return llllllllllllIllIIIIIIllIlIIIIllI < 0;
        }
        
        public Torch(final Start llllllllllllIllIIIIIIllIlIlllIlI, final int llllllllllllIllIIIIIIllIlIllIIll, final Random llllllllllllIllIIIIIIllIlIlllIII, final StructureBoundingBox llllllllllllIllIIIIIIllIlIllIlll, final EnumFacing llllllllllllIllIIIIIIllIlIllIllI) {
            super(llllllllllllIllIIIIIIllIlIlllIlI, llllllllllllIllIIIIIIllIlIllIIll);
            this.coordBaseMode = llllllllllllIllIIIIIIllIlIllIllI;
            this.boundingBox = llllllllllllIllIIIIIIllIlIllIlll;
        }
        
        public Torch() {
        }
        
        private static void lIIlllIllIIIIIIl() {
            (lllIIIlIlIllIl = new int[6])[0] = ((0x80 ^ 0x95) & ~(0x77 ^ 0x62));
            Torch.lllIIIlIlIllIl[1] = "   ".length();
            Torch.lllIIIlIlIllIl[2] = (36 + 2 + 32 + 62 ^ 8 + 47 + 25 + 48);
            Torch.lllIIIlIlIllIl[3] = "  ".length();
            Torch.lllIIIlIlIllIl[4] = " ".length();
            Torch.lllIIIlIlIllIl[5] = -" ".length();
        }
        
        private static boolean lIIlllIllIIIIIlI(final Object llllllllllllIllIIIIIIllIlIIIlIlI) {
            return llllllllllllIllIIIIIIllIlIIIlIlI != null;
        }
        
        private static boolean lIIlllIllIIIIlII(final Object llllllllllllIllIIIIIIllIlIIIllIl, final Object llllllllllllIllIIIIIIllIlIIIllII) {
            return llllllllllllIllIIIIIIllIlIIIllIl != llllllllllllIllIIIIIIllIlIIIllII;
        }
    }
    
    public static class House2 extends Village
    {
        private static final /* synthetic */ List<WeightedRandomChestContent> villageBlacksmithChestContents;
        private /* synthetic */ boolean hasMadeChest;
        private static final /* synthetic */ String[] llIIIllIIIlllI;
        private static final /* synthetic */ int[] llIIIllIIIllll;
        
        private static boolean lIIIlIlIIIlIlIII(final Object llllllllllllIlllIlIIllIlIIlllllI, final Object llllllllllllIlllIlIIllIlIIllllIl) {
            return llllllllllllIlllIlIIllIlIIlllllI == llllllllllllIlllIlIIllIlIIllllIl;
        }
        
        private static boolean lIIIlIlIIIlIlIlI(final int llllllllllllIlllIlIIllIlIlIIIllI, final int llllllllllllIlllIlIIllIlIlIIIlIl) {
            return llllllllllllIlllIlIIllIlIlIIIllI > llllllllllllIlllIlIIllIlIlIIIlIl;
        }
        
        public House2(final Start llllllllllllIlllIlIIllIllIlIIlll, final int llllllllllllIlllIlIIllIllIlIllII, final Random llllllllllllIlllIlIIllIllIlIlIll, final StructureBoundingBox llllllllllllIlllIlIIllIllIlIlIlI, final EnumFacing llllllllllllIlllIlIIllIllIlIlIIl) {
            super(llllllllllllIlllIlIIllIllIlIIlll, llllllllllllIlllIlIIllIllIlIllII);
            this.coordBaseMode = llllllllllllIlllIlIIllIllIlIlIIl;
            this.boundingBox = llllllllllllIlllIlIIllIllIlIlIlI;
        }
        
        private static boolean lIIIlIlIIIlIIlll(final int llllllllllllIlllIlIIllIlIIllIlll) {
            return llllllllllllIlllIlIIllIlIIllIlll == 0;
        }
        
        private static boolean lIIIlIlIIIlIIllI(final int llllllllllllIlllIlIIllIlIIllIlIl) {
            return llllllllllllIlllIlIIllIlIIllIlIl < 0;
        }
        
        private static boolean lIIIlIlIIIlIIlII(final int llllllllllllIlllIlIIllIlIIlllIIl) {
            return llllllllllllIlllIlIIllIlIIlllIIl != 0;
        }
        
        static {
            lIIIlIlIIIlIIIll();
            lIIIlIlIIIlIIIlI();
            final WeightedRandomChestContent[] array = new WeightedRandomChestContent[House2.llIIIllIIIllll[0]];
            array[House2.llIIIllIIIllll[1]] = new WeightedRandomChestContent(Items.diamond, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[3]);
            array[House2.llIIIllIIIllll[2]] = new WeightedRandomChestContent(Items.iron_ingot, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[5]);
            array[House2.llIIIllIIIllll[6]] = new WeightedRandomChestContent(Items.gold_ingot, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[3]] = new WeightedRandomChestContent(Items.bread, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[7]);
            array[House2.llIIIllIIIllll[8]] = new WeightedRandomChestContent(Items.apple, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[7]);
            array[House2.llIIIllIIIllll[4]] = new WeightedRandomChestContent(Items.iron_pickaxe, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[9]] = new WeightedRandomChestContent(Items.iron_sword, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[10]] = new WeightedRandomChestContent(Items.iron_chestplate, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[11]] = new WeightedRandomChestContent(Items.iron_helmet, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[12]] = new WeightedRandomChestContent(Items.iron_leggings, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[5]] = new WeightedRandomChestContent(Items.iron_boots, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[13]] = new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.obsidian), House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[10], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[14]] = new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.sapling), House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[10], House2.llIIIllIIIllll[4]);
            array[House2.llIIIllIIIllll[15]] = new WeightedRandomChestContent(Items.saddle, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[3]);
            array[House2.llIIIllIIIllll[16]] = new WeightedRandomChestContent(Items.iron_horse_armor, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2]);
            array[House2.llIIIllIIIllll[7]] = new WeightedRandomChestContent(Items.golden_horse_armor, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2]);
            array[House2.llIIIllIIIllll[17]] = new WeightedRandomChestContent(Items.diamond_horse_armor, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2]);
            villageBlacksmithChestContents = Lists.newArrayList((Object[])array);
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIlllIlIIllIlIlllllll) {
            super.readStructureFromNBT(llllllllllllIlllIlIIllIlIlllllll);
            this.hasMadeChest = llllllllllllIlllIlIIllIlIlllllll.getBoolean(House2.llIIIllIIIlllI[House2.llIIIllIIIllll[2]]);
        }
        
        private static void lIIIlIlIIIlIIIll() {
            (llIIIllIIIllll = new int[19])[0] = (0xD6 ^ 0xAE ^ (0xF5 ^ 0x9C));
            House2.llIIIllIIIllll[1] = ((0xE2 ^ 0xB9) & ~(0x2D ^ 0x76));
            House2.llIIIllIIIllll[2] = " ".length();
            House2.llIIIllIIIllll[3] = "   ".length();
            House2.llIIIllIIIllll[4] = (0x4B ^ 0x4E);
            House2.llIIIllIIIllll[5] = (0x7C ^ 0x76);
            House2.llIIIllIIIllll[6] = "  ".length();
            House2.llIIIllIIIllll[7] = (0x69 ^ 0x5B ^ (0x23 ^ 0x1E));
            House2.llIIIllIIIllll[8] = (0x10 ^ 0x66 ^ (0xFD ^ 0x8F));
            House2.llIIIllIIIllll[9] = (0x82 ^ 0x84);
            House2.llIIIllIIIllll[10] = (0x6F ^ 0x36 ^ (0x2C ^ 0x72));
            House2.llIIIllIIIllll[11] = (0xA8 ^ 0xA0);
            House2.llIIIllIIIllll[12] = (0x4A ^ 0x12 ^ (0x27 ^ 0x76));
            House2.llIIIllIIIllll[13] = (0x66 ^ 0x72 ^ (0x6D ^ 0x72));
            House2.llIIIllIIIllll[14] = (0x44 ^ 0x40 ^ (0x1B ^ 0x13));
            House2.llIIIllIIIllll[15] = (0x14 ^ 0x19);
            House2.llIIIllIIIllll[16] = (106 + 140 - 241 + 165 ^ 88 + 14 - 87 + 149);
            House2.llIIIllIIIllll[17] = (0xBE ^ 0xAE);
            House2.llIIIllIIIllll[18] = -" ".length();
        }
        
        public House2() {
        }
        
        private static String lIIIlIlIIIlIIIII(final String llllllllllllIlllIlIIllIlIlIlIIII, final String llllllllllllIlllIlIIllIlIlIIllll) {
            try {
                final SecretKeySpec llllllllllllIlllIlIIllIlIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIlIIllIlIlIlIlII = Cipher.getInstance("Blowfish");
                llllllllllllIlllIlIIllIlIlIlIlII.init(House2.llIIIllIIIllll[6], llllllllllllIlllIlIIllIlIlIlIlIl);
                return new String(llllllllllllIlllIlIIllIlIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIIllIlIlIlIIll) {
                llllllllllllIlllIlIIllIlIlIlIIll.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIlllIlIIllIllIIIIlIl) {
            super.writeStructureToNBT(llllllllllllIlllIlIIllIllIIIIlIl);
            llllllllllllIlllIlIIllIllIIIIlIl.setBoolean(House2.llIIIllIIIlllI[House2.llIIIllIIIllll[1]], this.hasMadeChest);
        }
        
        private static boolean lIIIlIlIIIlIlIIl(final Object llllllllllllIlllIlIIllIlIlIIIIlI, final Object llllllllllllIlllIlIIllIlIlIIIIIl) {
            return llllllllllllIlllIlIIllIlIlIIIIlI != llllllllllllIlllIlIIllIlIlIIIIIl;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIlIIllIlIlllIlIl, final Random llllllllllllIlllIlIIllIlIllIllIl, final StructureBoundingBox llllllllllllIlllIlIIllIlIllIllII) {
            if (lIIIlIlIIIlIIllI(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII);
                if (lIIIlIlIIIlIIllI(this.field_143015_k)) {
                    return House2.llIIIllIIIllll[2] != 0;
                }
                this.boundingBox.offset(House2.llIIIllIIIllll[1], this.field_143015_k - this.boundingBox.maxY + House2.llIIIllIIIllll[9] - House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1]);
            }
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[9], Blocks.stone_slab.getDefaultState(), Blocks.stone_slab.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[11], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[4], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[1], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[1], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[1], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[9], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[9], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.planks.getDefaultState(), House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[2], llllllllllllIlllIlIIllIlIllIllII);
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[6], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[3], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[4], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[9], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[9], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[1], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[1], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[9], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[9], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.flowing_lava.getDefaultState(), House2.llIIIllIIIllll[10], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.flowing_lava.getDefaultState(), House2.llIIIllIIIllll[11], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.iron_bars.getDefaultState(), House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[4], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.iron_bars.getDefaultState(), House2.llIIIllIIIllll[12], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[8], llllllllllllIlllIlIIllIlIllIllII);
            this.fillWithBlocks(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[10], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[11], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[4], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House2.llIIIllIIIllll[1] != 0));
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.cobblestone.getDefaultState(), House2.llIIIllIIIllll[9], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[3], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.furnace.getDefaultState(), House2.llIIIllIIIllll[9], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[3], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.furnace.getDefaultState(), House2.llIIIllIIIllll[9], House2.llIIIllIIIllll[3], House2.llIIIllIIIllll[3], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.double_stone_slab.getDefaultState(), House2.llIIIllIIIllll[11], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.glass_pane.getDefaultState(), House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[6], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.glass_pane.getDefaultState(), House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[8], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.glass_pane.getDefaultState(), House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[9], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.glass_pane.getDefaultState(), House2.llIIIllIIIllll[8], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[9], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.oak_fence.getDefaultState(), House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[8], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.wooden_pressure_plate.getDefaultState(), House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[8], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.planks.getDefaultState(), House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.oak_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.oak_stairs, House2.llIIIllIIIllll[3])), House2.llIIIllIIIllll[6], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4], llllllllllllIlllIlIIllIlIllIllII);
            this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.oak_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.oak_stairs, House2.llIIIllIIIllll[2])), House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[8], llllllllllllIlllIlIIllIlIllIllII);
            if (lIIIlIlIIIlIIlll(this.hasMadeChest ? 1 : 0) && lIIIlIlIIIlIIlII(llllllllllllIlllIlIIllIlIllIllII.isVecInside(new BlockPos(this.getXWithOffset(House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[4]), this.getYWithOffset(House2.llIIIllIIIllll[2]), this.getZWithOffset(House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[4]))) ? 1 : 0)) {
                this.hasMadeChest = (House2.llIIIllIIIllll[2] != 0);
                this.generateChestContents(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, llllllllllllIlllIlIIllIlIllIllIl, House2.llIIIllIIIllll[4], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[4], House2.villageBlacksmithChestContents, House2.llIIIllIIIllll[3] + llllllllllllIlllIlIIllIlIllIllIl.nextInt(House2.llIIIllIIIllll[9]));
                "".length();
            }
            int llllllllllllIlllIlIIllIlIlllIIlI = House2.llIIIllIIIllll[9];
            "".length();
            if (((0x8D ^ 0xAC) & ~(0x11 ^ 0x30)) >= (0x4E ^ 0x4A)) {
                return ((0x75 ^ 0x5F) & ~(0x32 ^ 0x18)) != 0x0;
            }
            while (!lIIIlIlIIIlIlIlI(llllllllllllIlllIlIIllIlIlllIIlI, House2.llIIIllIIIllll[11])) {
                if (lIIIlIlIIIlIlIII(this.getBlockStateFromPos(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIlllIIlI, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[18], llllllllllllIlllIlIIllIlIllIllII).getBlock().getMaterial(), Material.air) && lIIIlIlIIIlIlIIl(this.getBlockStateFromPos(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIlllIIlI, House2.llIIIllIIIllll[18], House2.llIIIllIIIllll[18], llllllllllllIlllIlIIllIlIllIllII).getBlock().getMaterial(), Material.air)) {
                    this.setBlockState(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, House2.llIIIllIIIllll[3])), llllllllllllIlllIlIIllIlIlllIIlI, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[18], llllllllllllIlllIlIIllIlIllIllII);
                }
                ++llllllllllllIlllIlIIllIlIlllIIlI;
            }
            int llllllllllllIlllIlIIllIlIlllIIIl = House2.llIIIllIIIllll[1];
            "".length();
            if (" ".length() == -" ".length()) {
                return ((0x42 ^ 0xF) & ~(0x7 ^ 0x4A) & ~((0x6A ^ 0x8) & ~(0xFF ^ 0x9D))) != 0x0;
            }
            while (!lIIIlIlIIIlIlIll(llllllllllllIlllIlIIllIlIlllIIIl, House2.llIIIllIIIllll[10])) {
                int llllllllllllIlllIlIIllIlIlllIIII = House2.llIIIllIIIllll[1];
                "".length();
                if ("  ".length() < "  ".length()) {
                    return ((0xFC ^ 0x96 ^ (0x99 ^ 0xC0)) & (136 + 137 - 267 + 172 ^ 61 + 26 - 37 + 79 ^ -" ".length())) != 0x0;
                }
                while (!lIIIlIlIIIlIlIll(llllllllllllIlllIlIIllIlIlllIIII, House2.llIIIllIIIllll[5])) {
                    this.clearCurrentPositionBlocksUpwards(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIlllIIII, House2.llIIIllIIIllll[9], llllllllllllIlllIlIIllIlIlllIIIl, llllllllllllIlllIlIIllIlIllIllII);
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIlIIllIlIlllIlIl, Blocks.cobblestone.getDefaultState(), llllllllllllIlllIlIIllIlIlllIIII, House2.llIIIllIIIllll[18], llllllllllllIlllIlIIllIlIlllIIIl, llllllllllllIlllIlIIllIlIllIllII);
                    ++llllllllllllIlllIlIIllIlIlllIIII;
                }
                ++llllllllllllIlllIlIIllIlIlllIIIl;
            }
            this.spawnVillagers(llllllllllllIlllIlIIllIlIlllIlIl, llllllllllllIlllIlIIllIlIllIllII, House2.llIIIllIIIllll[10], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2], House2.llIIIllIIIllll[2]);
            return House2.llIIIllIIIllll[2] != 0;
        }
        
        public static House2 func_175855_a(final Start llllllllllllIlllIlIIllIllIIllIlI, final List<StructureComponent> llllllllllllIlllIlIIllIllIIlIIII, final Random llllllllllllIlllIlIIllIllIIllIII, final int llllllllllllIlllIlIIllIllIIIlllI, final int llllllllllllIlllIlIIllIllIIlIllI, final int llllllllllllIlllIlIIllIllIIIllII, final EnumFacing llllllllllllIlllIlIIllIllIIlIlII, final int llllllllllllIlllIlIIllIllIIlIIll) {
            final StructureBoundingBox llllllllllllIlllIlIIllIllIIlIIlI = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIlIIllIllIIIlllI, llllllllllllIlllIlIIllIllIIlIllI, llllllllllllIlllIlIIllIllIIIllII, House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[1], House2.llIIIllIIIllll[5], House2.llIIIllIIIllll[9], House2.llIIIllIIIllll[10], llllllllllllIlllIlIIllIllIIlIlII);
            House2 house2;
            if (lIIIlIlIIIlIIlII(Village.canVillageGoDeeper(llllllllllllIlllIlIIllIllIIlIIlI) ? 1 : 0) && lIIIlIlIIIlIIlIl(StructureComponent.findIntersecting(llllllllllllIlllIlIIllIllIIlIIII, llllllllllllIlllIlIIllIllIIlIIlI))) {
                house2 = new House2(llllllllllllIlllIlIIllIllIIllIlI, llllllllllllIlllIlIIllIllIIlIIll, llllllllllllIlllIlIIllIllIIllIII, llllllllllllIlllIlIIllIllIIlIIlI, llllllllllllIlllIlIIllIllIIlIlII);
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
            }
            else {
                house2 = null;
            }
            return house2;
        }
        
        @Override
        protected int func_180779_c(final int llllllllllllIlllIlIIllIlIllIlIII, final int llllllllllllIlllIlIIllIlIllIIlll) {
            return House2.llIIIllIIIllll[3];
        }
        
        private static void lIIIlIlIIIlIIIlI() {
            (llIIIllIIIlllI = new String[House2.llIIIllIIIllll[6]])[House2.llIIIllIIIllll[1]] = lIIIlIlIIIlIIIII("Bon7Iwqb8TU=", "YHteY");
            House2.llIIIllIIIlllI[House2.llIIIllIIIllll[2]] = lIIIlIlIIIlIIIIl("UUoPBxTdWT0=", "tJtRZ");
        }
        
        private static boolean lIIIlIlIIIlIlIll(final int llllllllllllIlllIlIIllIlIlIIlIlI, final int llllllllllllIlllIlIIllIlIlIIlIIl) {
            return llllllllllllIlllIlIIllIlIlIIlIlI >= llllllllllllIlllIlIIllIlIlIIlIIl;
        }
        
        private static boolean lIIIlIlIIIlIIlIl(final Object llllllllllllIlllIlIIllIlIIlllIll) {
            return llllllllllllIlllIlIIllIlIIlllIll == null;
        }
        
        private static String lIIIlIlIIIlIIIIl(final String llllllllllllIlllIlIIllIlIlIlllIl, final String llllllllllllIlllIlIIllIlIlIlllII) {
            try {
                final SecretKeySpec llllllllllllIlllIlIIllIlIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIlIlIlllII.getBytes(StandardCharsets.UTF_8)), House2.llIIIllIIIllll[11]), "DES");
                final Cipher llllllllllllIlllIlIIllIlIllIIIIl = Cipher.getInstance("DES");
                llllllllllllIlllIlIIllIlIllIIIIl.init(House2.llIIIllIIIllll[6], llllllllllllIlllIlIIllIlIllIIIlI);
                return new String(llllllllllllIlllIlIIllIlIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIIllIlIllIIIII) {
                llllllllllllIlllIlIIllIlIllIIIII.printStackTrace();
                return null;
            }
        }
    }
    
    public static class Field1 extends Village
    {
        private /* synthetic */ Block cropTypeA;
        private /* synthetic */ Block cropTypeD;
        private /* synthetic */ Block cropTypeC;
        private static final /* synthetic */ int[] lIllllllIIIlIl;
        private /* synthetic */ Block cropTypeB;
        private static final /* synthetic */ String[] lIllllllIIIIII;
        
        private static boolean lIIIIlIllIllllll(final int llllllllllllIllllIIlIlIIIIlIIIII, final int llllllllllllIllllIIlIlIIIIIlllll) {
            return llllllllllllIllllIIlIlIIIIlIIIII > llllllllllllIllllIIlIlIIIIIlllll;
        }
        
        public Field1(final Start llllllllllllIllllIIlIlIIlIIlllll, final int llllllllllllIllllIIlIlIIlIlIIlII, final Random llllllllllllIllllIIlIlIIlIlIIIll, final StructureBoundingBox llllllllllllIllllIIlIlIIlIlIIIlI, final EnumFacing llllllllllllIllllIIlIlIIlIIllIll) {
            super(llllllllllllIllllIIlIlIIlIIlllll, llllllllllllIllllIIlIlIIlIlIIlII);
            this.coordBaseMode = llllllllllllIllllIIlIlIIlIIllIll;
            this.boundingBox = llllllllllllIllllIIlIlIIlIlIIIlI;
            this.cropTypeA = this.func_151559_a(llllllllllllIllllIIlIlIIlIlIIIll);
            this.cropTypeB = this.func_151559_a(llllllllllllIllllIIlIlIIlIlIIIll);
            this.cropTypeC = this.func_151559_a(llllllllllllIllllIIlIlIIlIlIIIll);
            this.cropTypeD = this.func_151559_a(llllllllllllIllllIIlIlIIlIlIIIll);
        }
        
        private static boolean lIIIIlIllIlllllI(final int llllllllllllIllllIIlIlIIIIIllIIl) {
            return llllllllllllIllllIIlIlIIIIIllIIl < 0;
        }
        
        private Block func_151559_a(final Random llllllllllllIllllIIlIlIIlIIIlIll) {
            switch (llllllllllllIllllIIlIlIIlIIIlIll.nextInt(Field1.lIllllllIIIlIl[5])) {
                case 0: {
                    return Blocks.carrots;
                }
                case 1: {
                    return Blocks.potatoes;
                }
                default: {
                    return Blocks.wheat;
                }
            }
        }
        
        private static String lIIIIlIllIllIlll(final String llllllllllllIllllIIlIlIIIlIIIllI, final String llllllllllllIllllIIlIlIIIlIIIlll) {
            try {
                final SecretKeySpec llllllllllllIllllIIlIlIIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), Field1.lIllllllIIIlIl[11]), "DES");
                final Cipher llllllllllllIllllIIlIlIIIlIIlIlI = Cipher.getInstance("DES");
                llllllllllllIllllIIlIlIIIlIIlIlI.init(Field1.lIllllllIIIlIl[2], llllllllllllIllllIIlIlIIIlIIlIll);
                return new String(llllllllllllIllllIIlIlIIIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIlIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIlIlIIIlIIlIIl) {
                llllllllllllIllllIIlIlIIIlIIlIIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllllIIlIlIIlIIlIIIl) {
            super.readStructureFromNBT(llllllllllllIllllIIlIlIIlIIlIIIl);
            this.cropTypeA = Block.getBlockById(llllllllllllIllllIIlIlIIlIIlIIIl.getInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[4]]));
            this.cropTypeB = Block.getBlockById(llllllllllllIllllIIlIlIIlIIlIIIl.getInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[5]]));
            this.cropTypeC = Block.getBlockById(llllllllllllIllllIIlIlIIlIIlIIIl.getInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[6]]));
            this.cropTypeD = Block.getBlockById(llllllllllllIllllIIlIlIIlIIlIIIl.getInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[7]]));
        }
        
        private static boolean lIIIIlIllIllllIl(final Object llllllllllllIllllIIlIlIIIIIlllIl) {
            return llllllllllllIllllIIlIlIIIIIlllIl == null;
        }
        
        private static void lIIIIlIllIlllIII() {
            (lIllllllIIIIII = new String[Field1.lIllllllIIIlIl[11]])[Field1.lIllllllIIIlIl[0]] = lIIIIlIllIllIIll("DTQ=", "NuAKz");
            Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[1]] = lIIIIlIllIllIlII("YygDEXP3IA0=", "YerqK");
            Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[2]] = lIIIIlIllIllIlII("7XpRKJNdlWA=", "jhEUe");
            Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[3]] = lIIIIlIllIllIlII("BLi2Hfg2NqM=", "KrtRc");
            Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[4]] = lIIIIlIllIllIIll("FCc=", "WfCQP");
            Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[5]] = lIIIIlIllIllIlII("nP69PzlXZG8=", "rrsCi");
            Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[6]] = lIIIIlIllIllIIll("DDQ=", "OwQnB");
            Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[7]] = lIIIIlIllIllIlll("qReBPloqt3Y=", "bUEnI");
        }
        
        private static void lIIIIlIllIlllIll() {
            (lIllllllIIIlIl = new int[15])[0] = ((0xFB ^ 0xB5) & ~(0x1B ^ 0x55));
            Field1.lIllllllIIIlIl[1] = " ".length();
            Field1.lIllllllIIIlIl[2] = "  ".length();
            Field1.lIllllllIIIlIl[3] = "   ".length();
            Field1.lIllllllIIIlIl[4] = (0x37 ^ 0x20 ^ (0x6A ^ 0x79));
            Field1.lIllllllIIIlIl[5] = (0xB2 ^ 0xB7);
            Field1.lIllllllIIIlIl[6] = (0xFE ^ 0x98 ^ (0x7F ^ 0x1F));
            Field1.lIllllllIIIlIl[7] = (0xA9 ^ 0xAE);
            Field1.lIllllllIIIlIl[8] = (151 + 106 - 153 + 69 ^ 159 + 129 - 140 + 12);
            Field1.lIllllllIIIlIl[9] = (0x21 ^ 0x28);
            Field1.lIllllllIIIlIl[10] = (0x87 ^ 0x8B);
            Field1.lIllllllIIIlIl[11] = (0xCD ^ 0xC5);
            Field1.lIllllllIIIlIl[12] = (0x66 ^ 0x6C);
            Field1.lIllllllIIIlIl[13] = (145 + 18 - 40 + 45 ^ 149 + 23 - 24 + 15);
            Field1.lIllllllIIIlIl[14] = -" ".length();
        }
        
        private static boolean lIIIIlIlllIIIIII(final int llllllllllllIllllIIlIlIIIIlIlIII, final int llllllllllllIllllIIlIlIIIIlIIlll) {
            return llllllllllllIllllIIlIlIIIIlIlIII >= llllllllllllIllllIIlIlIIIIlIIlll;
        }
        
        public static Field1 func_175851_a(final Start llllllllllllIllllIIlIlIIIllllIII, final List<StructureComponent> llllllllllllIllllIIlIlIIlIIIIIII, final Random llllllllllllIllllIIlIlIIIlllllll, final int llllllllllllIllllIIlIlIIIllllllI, final int llllllllllllIllllIIlIlIIIlllIlII, final int llllllllllllIllllIIlIlIIIlllllII, final EnumFacing llllllllllllIllllIIlIlIIIllllIll, final int llllllllllllIllllIIlIlIIIlllIIIl) {
            final StructureBoundingBox llllllllllllIllllIIlIlIIIllllIIl = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllllIIlIlIIIllllllI, llllllllllllIllllIIlIlIIIlllIlII, llllllllllllIllllIIlIlIIIlllllII, Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[8], Field1.lIllllllIIIlIl[4], Field1.lIllllllIIIlIl[9], llllllllllllIllllIIlIlIIIllllIll);
            Field1 field1;
            if (lIIIIlIllIllllII(Village.canVillageGoDeeper(llllllllllllIllllIIlIlIIIllllIIl) ? 1 : 0) && lIIIIlIllIllllIl(StructureComponent.findIntersecting(llllllllllllIllllIIlIlIIlIIIIIII, llllllllllllIllllIIlIlIIIllllIIl))) {
                field1 = new Field1(llllllllllllIllllIIlIlIIIllllIII, llllllllllllIllllIIlIlIIIlllIIIl, llllllllllllIllllIIlIlIIIlllllll, llllllllllllIllllIIlIlIIIllllIIl, llllllllllllIllllIIlIlIIIllllIll);
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            else {
                field1 = null;
            }
            return field1;
        }
        
        private static String lIIIIlIllIllIIll(String llllllllllllIllllIIlIlIIIIllIIll, final String llllllllllllIllllIIlIlIIIIllIlll) {
            llllllllllllIllllIIlIlIIIIllIIll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlIlIIIIllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIIlIlIIIIllIllI = new StringBuilder();
            final char[] llllllllllllIllllIIlIlIIIIllIlIl = llllllllllllIllllIIlIlIIIIllIlll.toCharArray();
            int llllllllllllIllllIIlIlIIIIllIlII = Field1.lIllllllIIIlIl[0];
            final char llllllllllllIllllIIlIlIIIIlIlllI = (Object)((String)llllllllllllIllllIIlIlIIIIllIIll).toCharArray();
            final long llllllllllllIllllIIlIlIIIIlIllIl = llllllllllllIllllIIlIlIIIIlIlllI.length;
            int llllllllllllIllllIIlIlIIIIlIllII = Field1.lIllllllIIIlIl[0];
            while (lIIIIlIlllIIIIlI(llllllllllllIllllIIlIlIIIIlIllII, (int)llllllllllllIllllIIlIlIIIIlIllIl)) {
                final char llllllllllllIllllIIlIlIIIIlllIIl = llllllllllllIllllIIlIlIIIIlIlllI[llllllllllllIllllIIlIlIIIIlIllII];
                llllllllllllIllllIIlIlIIIIllIllI.append((char)(llllllllllllIllllIIlIlIIIIlllIIl ^ llllllllllllIllllIIlIlIIIIllIlIl[llllllllllllIllllIIlIlIIIIllIlII % llllllllllllIllllIIlIlIIIIllIlIl.length]));
                "".length();
                ++llllllllllllIllllIIlIlIIIIllIlII;
                ++llllllllllllIllllIIlIlIIIIlIllII;
                "".length();
                if (((0xA0 ^ 0x95) & ~(0x28 ^ 0x1D)) == " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIIlIlIIIIllIllI);
        }
        
        static {
            lIIIIlIllIlllIll();
            lIIIIlIllIlllIII();
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllllIIlIlIIIllIlIII, final Random llllllllllllIllllIIlIlIIIllIIlll, final StructureBoundingBox llllllllllllIllllIIlIlIIIlIlllll) {
            if (lIIIIlIllIlllllI(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll);
                if (lIIIIlIllIlllllI(this.field_143015_k)) {
                    return Field1.lIllllllIIIlIl[1] != 0;
                }
                this.boundingBox.offset(Field1.lIllllllIIIlIl[0], this.field_143015_k - this.boundingBox.maxY + Field1.lIllllllIIIlIl[4] - Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[0]);
            }
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[10], Field1.lIllllllIIIlIl[4], Field1.lIllllllIIIlIl[11], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[7], Blocks.farmland.getDefaultState(), Blocks.farmland.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[4], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[5], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[7], Blocks.farmland.getDefaultState(), Blocks.farmland.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[7], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[11], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[7], Blocks.farmland.getDefaultState(), Blocks.farmland.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[12], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[13], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[7], Blocks.farmland.getDefaultState(), Blocks.farmland.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[11], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[6], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[6], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[11], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[10], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[10], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[11], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[13], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[0], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[11], Field1.lIllllllIIIlIl[13], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[11], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[3], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[3], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[7], Blocks.water.getDefaultState(), Blocks.water.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            this.fillWithBlocks(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIlIlllll, Field1.lIllllllIIIlIl[9], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[9], Field1.lIllllllIIIlIl[0], Field1.lIllllllIIIlIl[7], Blocks.water.getDefaultState(), Blocks.water.getDefaultState(), (boolean)(Field1.lIllllllIIIlIl[0] != 0));
            int llllllllllllIllllIIlIlIIIllIIlIl = Field1.lIllllllIIIlIl[1];
            "".length();
            if (null != null) {
                return ((0x31 ^ 0x23 ^ (0xF ^ 0x58)) & (0x75 ^ 0x42 ^ (0x79 ^ 0xB) ^ -" ".length())) != 0x0;
            }
            while (!lIIIIlIllIllllll(llllllllllllIllllIIlIlIIIllIIlIl, Field1.lIllllllIIIlIl[7])) {
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeA.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[1], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeA.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeB.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[4], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeB.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[5], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeC.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[7], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeC.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[11], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeD.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[12], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                this.setBlockState(llllllllllllIllllIIlIlIIIllIlIII, this.cropTypeD.getStateFromMeta(MathHelper.getRandomIntegerInRange(llllllllllllIllllIIlIlIIIllIIlll, Field1.lIllllllIIIlIl[2], Field1.lIllllllIIIlIl[7])), Field1.lIllllllIIIlIl[13], Field1.lIllllllIIIlIl[1], llllllllllllIllllIIlIlIIIllIIlIl, llllllllllllIllllIIlIlIIIlIlllll);
                ++llllllllllllIllllIIlIlIIIllIIlIl;
            }
            int llllllllllllIllllIIlIlIIIllIIlII = Field1.lIllllllIIIlIl[0];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0x54 ^ 0x6) & ~(0xD6 ^ 0x84)) != 0x0;
            }
            while (!lIIIIlIlllIIIIII(llllllllllllIllllIIlIlIIIllIIlII, Field1.lIllllllIIIlIl[9])) {
                int llllllllllllIllllIIlIlIIIllIIIll = Field1.lIllllllIIIlIl[0];
                "".length();
                if (((0xC5 ^ 0x8F) & ~(0x19 ^ 0x53)) != 0x0) {
                    return ((0x7F ^ 0x5E) & ~(0x83 ^ 0xA2)) != 0x0;
                }
                while (!lIIIIlIlllIIIIII(llllllllllllIllllIIlIlIIIllIIIll, Field1.lIllllllIIIlIl[8])) {
                    this.clearCurrentPositionBlocksUpwards(llllllllllllIllllIIlIlIIIllIlIII, llllllllllllIllllIIlIlIIIllIIIll, Field1.lIllllllIIIlIl[4], llllllllllllIllllIIlIlIIIllIIlII, llllllllllllIllllIIlIlIIIlIlllll);
                    this.replaceAirAndLiquidDownwards(llllllllllllIllllIIlIlIIIllIlIII, Blocks.dirt.getDefaultState(), llllllllllllIllllIIlIlIIIllIIIll, Field1.lIllllllIIIlIl[14], llllllllllllIllllIIlIlIIIllIIlII, llllllllllllIllllIIlIlIIIlIlllll);
                    ++llllllllllllIllllIIlIlIIIllIIIll;
                }
                ++llllllllllllIllllIIlIlIIIllIIlII;
            }
            return Field1.lIllllllIIIlIl[1] != 0;
        }
        
        public Field1() {
        }
        
        private static boolean lIIIIlIlllIIIIlI(final int llllllllllllIllllIIlIlIIIIlIIlII, final int llllllllllllIllllIIlIlIIIIlIIIll) {
            return llllllllllllIllllIIlIlIIIIlIIlII < llllllllllllIllllIIlIlIIIIlIIIll;
        }
        
        private static boolean lIIIIlIllIllllII(final int llllllllllllIllllIIlIlIIIIIllIll) {
            return llllllllllllIllllIIlIlIIIIIllIll != 0;
        }
        
        private static String lIIIIlIllIllIlII(final String llllllllllllIllllIIlIlIIIlIlIlIl, final String llllllllllllIllllIIlIlIIIlIlIlII) {
            try {
                final SecretKeySpec llllllllllllIllllIIlIlIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIIlIlIIIlIlIlll = Cipher.getInstance("Blowfish");
                llllllllllllIllllIIlIlIIIlIlIlll.init(Field1.lIllllllIIIlIl[2], llllllllllllIllllIIlIlIIIlIllIII);
                return new String(llllllllllllIllllIIlIlIIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIlIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIlIlIIIlIlIllI) {
                llllllllllllIllllIIlIlIIIlIlIllI.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllllIIlIlIIlIIlIlIl) {
            super.writeStructureToNBT(llllllllllllIllllIIlIlIIlIIlIlIl);
            llllllllllllIllllIIlIlIIlIIlIlIl.setInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[0]], Block.blockRegistry.getIDForObject(this.cropTypeA));
            llllllllllllIllllIIlIlIIlIIlIlIl.setInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[1]], Block.blockRegistry.getIDForObject(this.cropTypeB));
            llllllllllllIllllIIlIlIIlIIlIlIl.setInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[2]], Block.blockRegistry.getIDForObject(this.cropTypeC));
            llllllllllllIllllIIlIlIIlIIlIlIl.setInteger(Field1.lIllllllIIIIII[Field1.lIllllllIIIlIl[3]], Block.blockRegistry.getIDForObject(this.cropTypeD));
        }
    }
    
    public static class House4Garden extends Village
    {
        private /* synthetic */ boolean isRoofAccessible;
        private static final /* synthetic */ int[] lIlIlIIIIlIIll;
        private static final /* synthetic */ String[] lIlIlIIIIlIIIl;
        
        static {
            lllIlIlIllIIIlI();
            lllIlIlIllIIIII();
        }
        
        private static boolean lllIlIlIllIIllI(final Object lllllllllllllIIIlIllIIlIIIIIIIIl, final Object lllllllllllllIIIlIllIIlIIIIIIIII) {
            return lllllllllllllIIIlIllIIlIIIIIIIIl != lllllllllllllIIIlIllIIlIIIIIIIII;
        }
        
        private static String lllIlIlIlIllllI(final String lllllllllllllIIIlIllIIlIIIIIllll, final String lllllllllllllIIIlIllIIlIIIIIlllI) {
            try {
                final SecretKeySpec lllllllllllllIIIlIllIIlIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIIlIIIIIlllI.getBytes(StandardCharsets.UTF_8)), House4Garden.lIlIlIIIIlIIll[8]), "DES");
                final Cipher lllllllllllllIIIlIllIIlIIIIlIIll = Cipher.getInstance("DES");
                lllllllllllllIIIlIllIIlIIIIlIIll.init(House4Garden.lIlIlIIIIlIIll[6], lllllllllllllIIIlIllIIlIIIIlIlII);
                return new String(lllllllllllllIIIlIllIIlIIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIIlIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIllIIlIIIIlIIlI) {
                lllllllllllllIIIlIllIIlIIIIlIIlI.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIIlIllIIlIIlIlllll) {
            super.readStructureFromNBT(lllllllllllllIIIlIllIIlIIlIlllll);
            this.isRoofAccessible = lllllllllllllIIIlIllIIlIIlIlllll.getBoolean(House4Garden.lIlIlIIIIlIIIl[House4Garden.lIlIlIIIIlIIll[1]]);
        }
        
        private static boolean lllIlIlIllIIlll(final int lllllllllllllIIIlIllIIIllllllIII) {
            return lllllllllllllIIIlIllIIIllllllIII != 0;
        }
        
        private static void lllIlIlIllIIIlI() {
            (lIlIlIIIIlIIll = new int[9])[0] = ((0 + 28 + 150 + 1 ^ 90 + 64 - 95 + 91) & (96 + 120 - 86 + 31 ^ 86 + 45 - 127 + 128 ^ -" ".length()));
            House4Garden.lIlIlIIIIlIIll[1] = " ".length();
            House4Garden.lIlIlIIIIlIIll[2] = (0x28 ^ 0x2D);
            House4Garden.lIlIlIIIIlIIll[3] = (0x2 ^ 0x4);
            House4Garden.lIlIlIIIIlIIll[4] = (0xFF ^ 0x94 ^ (0x1F ^ 0x70));
            House4Garden.lIlIlIIIIlIIll[5] = "   ".length();
            House4Garden.lIlIlIIIIlIIll[6] = "  ".length();
            House4Garden.lIlIlIIIIlIIll[7] = -" ".length();
            House4Garden.lIlIlIIIIlIIll[8] = (0x2B ^ 0x23);
        }
        
        public static House4Garden func_175858_a(final Start lllllllllllllIIIlIllIIlIIlIlIIll, final List<StructureComponent> lllllllllllllIIIlIllIIlIIlIlIIlI, final Random lllllllllllllIIIlIllIIlIIlIlIIIl, final int lllllllllllllIIIlIllIIlIIlIlIIII, final int lllllllllllllIIIlIllIIlIIlIIIllI, final int lllllllllllllIIIlIllIIlIIlIIIlIl, final EnumFacing lllllllllllllIIIlIllIIlIIlIIIlII, final int lllllllllllllIIIlIllIIlIIlIIIIll) {
            final StructureBoundingBox lllllllllllllIIIlIllIIlIIlIIlIll = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIIlIllIIlIIlIlIIII, lllllllllllllIIIlIllIIlIIlIIIllI, lllllllllllllIIIlIllIIlIIlIIIlIl, House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[3], House4Garden.lIlIlIIIIlIIll[2], lllllllllllllIIIlIllIIlIIlIIIlII);
            House4Garden house4Garden;
            if (lllIlIlIllIIIll(StructureComponent.findIntersecting(lllllllllllllIIIlIllIIlIIlIlIIlI, lllllllllllllIIIlIllIIlIIlIIlIll))) {
                house4Garden = null;
                "".length();
                if ((0x7A ^ 0x7E) <= "   ".length()) {
                    return null;
                }
            }
            else {
                house4Garden = new House4Garden(lllllllllllllIIIlIllIIlIIlIlIIll, lllllllllllllIIIlIllIIlIIlIIIIll, lllllllllllllIIIlIllIIlIIlIlIIIl, lllllllllllllIIIlIllIIlIIlIIlIll, lllllllllllllIIIlIllIIlIIlIIIlII);
            }
            return house4Garden;
        }
        
        public House4Garden() {
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIIlIllIIlIIllIIIll) {
            super.writeStructureToNBT(lllllllllllllIIIlIllIIlIIllIIIll);
            lllllllllllllIIIlIllIIlIIllIIIll.setBoolean(House4Garden.lIlIlIIIIlIIIl[House4Garden.lIlIlIIIIlIIll[0]], this.isRoofAccessible);
        }
        
        public House4Garden(final Start lllllllllllllIIIlIllIIlIIllIllIl, final int lllllllllllllIIIlIllIIlIIllIllII, final Random lllllllllllllIIIlIllIIlIIlllIIIl, final StructureBoundingBox lllllllllllllIIIlIllIIlIIlllIIII, final EnumFacing lllllllllllllIIIlIllIIlIIllIllll) {
            super(lllllllllllllIIIlIllIIlIIllIllIl, lllllllllllllIIIlIllIIlIIllIllII);
            this.coordBaseMode = lllllllllllllIIIlIllIIlIIllIllll;
            this.boundingBox = lllllllllllllIIIlIllIIlIIlllIIII;
            this.isRoofAccessible = lllllllllllllIIIlIllIIlIIlllIIIl.nextBoolean();
        }
        
        private static boolean lllIlIlIllIIlIl(final Object lllllllllllllIIIlIllIIIllllllIll, final Object lllllllllllllIIIlIllIIIllllllIlI) {
            return lllllllllllllIIIlIllIIIllllllIll == lllllllllllllIIIlIllIIIllllllIlI;
        }
        
        private static boolean lllIlIlIllIlIIl(final int lllllllllllllIIIlIllIIlIIIIIIlIl, final int lllllllllllllIIIlIllIIlIIIIIIlII) {
            return lllllllllllllIIIlIllIIlIIIIIIlIl < lllllllllllllIIIlIllIIlIIIIIIlII;
        }
        
        private static String lllIlIlIlIlllll(String lllllllllllllIIIlIllIIlIIIlIIllI, final String lllllllllllllIIIlIllIIlIIIlIIIII) {
            lllllllllllllIIIlIllIIlIIIlIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIllIIlIIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIlIllIIlIIIlIIlII = new StringBuilder();
            final char[] lllllllllllllIIIlIllIIlIIIlIIIll = lllllllllllllIIIlIllIIlIIIlIIIII.toCharArray();
            int lllllllllllllIIIlIllIIlIIIlIIIlI = House4Garden.lIlIlIIIIlIIll[0];
            final String lllllllllllllIIIlIllIIlIIIIlllII = (Object)lllllllllllllIIIlIllIIlIIIlIIllI.toCharArray();
            final Exception lllllllllllllIIIlIllIIlIIIIllIll = (Exception)lllllllllllllIIIlIllIIlIIIIlllII.length;
            int lllllllllllllIIIlIllIIlIIIIllIlI = House4Garden.lIlIlIIIIlIIll[0];
            while (lllIlIlIllIlIIl(lllllllllllllIIIlIllIIlIIIIllIlI, (int)lllllllllllllIIIlIllIIlIIIIllIll)) {
                final char lllllllllllllIIIlIllIIlIIIlIIlll = lllllllllllllIIIlIllIIlIIIIlllII[lllllllllllllIIIlIllIIlIIIIllIlI];
                lllllllllllllIIIlIllIIlIIIlIIlII.append((char)(lllllllllllllIIIlIllIIlIIIlIIlll ^ lllllllllllllIIIlIllIIlIIIlIIIll[lllllllllllllIIIlIllIIlIIIlIIIlI % lllllllllllllIIIlIllIIlIIIlIIIll.length]));
                "".length();
                ++lllllllllllllIIIlIllIIlIIIlIIIlI;
                ++lllllllllllllIIIlIllIIlIIIIllIlI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIlIllIIlIIIlIIlII);
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIlIllIIlIIIlllIll, final Random lllllllllllllIIIlIllIIlIIIlllIlI, final StructureBoundingBox lllllllllllllIIIlIllIIlIIIlllIIl) {
            if (lllIlIlIllIIlII(this.field_143015_k)) {
                this.field_143015_k = this.getAverageGroundLevel(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl);
                if (lllIlIlIllIIlII(this.field_143015_k)) {
                    return House4Garden.lIlIlIIIIlIIll[1] != 0;
                }
                this.boundingBox.offset(House4Garden.lIlIlIIIIlIIll[0], this.field_143015_k - this.boundingBox.maxY + House4Garden.lIlIlIIIIlIIll[3] - House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[0]);
            }
            this.fillWithBlocks(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[4], Blocks.cobblestone.getDefaultState(), Blocks.cobblestone.getDefaultState(), (boolean)(House4Garden.lIlIlIIIIlIIll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[4], Blocks.log.getDefaultState(), Blocks.log.getDefaultState(), (boolean)(House4Garden.lIlIlIIIIlIIll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House4Garden.lIlIlIIIIlIIll[0] != 0));
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.fillWithBlocks(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House4Garden.lIlIlIIIIlIIll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House4Garden.lIlIlIIIIlIIll[0] != 0));
            this.fillWithBlocks(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[4], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(House4Garden.lIlIlIIIIlIIll[0] != 0));
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.glass_pane.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[6], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.glass_pane.getDefaultState(), House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.glass_pane.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[6], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.planks.getDefaultState(), House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.planks.getDefaultState(), House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.planks.getDefaultState(), House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.planks.getDefaultState(), House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.planks.getDefaultState(), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.planks.getDefaultState(), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.planks.getDefaultState(), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
            if (lllIlIlIllIIlIl(this.getBlockStateFromPos(lllllllllllllIIIlIllIIlIIIlllIll, House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[7], lllllllllllllIIIlIllIIlIIIlllIIl).getBlock().getMaterial(), Material.air) && lllIlIlIllIIllI(this.getBlockStateFromPos(lllllllllllllIIIlIllIIlIIIlllIll, House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[7], House4Garden.lIlIlIIIIlIIll[7], lllllllllllllIIIlIllIIlIIIlllIIl).getBlock().getMaterial(), Material.air)) {
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.stone_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_stairs, House4Garden.lIlIlIIIIlIIll[5])), House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[7], lllllllllllllIIIlIllIIlIIIlllIIl);
            }
            this.fillWithBlocks(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(House4Garden.lIlIlIIIIlIIll[0] != 0));
            if (lllIlIlIllIIlll(this.isRoofAccessible ? 1 : 0)) {
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[0], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[4], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[1], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[6], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[5], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[1], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[6], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.oak_fence.getDefaultState(), House4Garden.lIlIlIIIIlIIll[0], House4Garden.lIlIlIIIIlIIll[2], House4Garden.lIlIlIIIIlIIll[5], lllllllllllllIIIlIllIIlIIIlllIIl);
            }
            if (lllIlIlIllIIlll(this.isRoofAccessible ? 1 : 0)) {
                final int lllllllllllllIIIlIllIIlIIIlllIII = this.getMetadataWithOffset(Blocks.ladder, House4Garden.lIlIlIIIIlIIll[5]);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.ladder.getStateFromMeta(lllllllllllllIIIlIllIIlIIIlllIII), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[5], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.ladder.getStateFromMeta(lllllllllllllIIIlIllIIlIIIlllIII), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[5], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.ladder.getStateFromMeta(lllllllllllllIIIlIllIIlIIIlllIII), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[5], lllllllllllllIIIlIllIIlIIIlllIIl);
                this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.ladder.getStateFromMeta(lllllllllllllIIIlIllIIlIIIlllIII), House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[4], House4Garden.lIlIlIIIIlIIll[5], lllllllllllllIIIlIllIIlIIIlllIIl);
            }
            this.setBlockState(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, this.coordBaseMode), House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[5], House4Garden.lIlIlIIIIlIIll[1], lllllllllllllIIIlIllIIlIIIlllIIl);
            int lllllllllllllIIIlIllIIlIIIllIlll = House4Garden.lIlIlIIIIlIIll[0];
            "".length();
            if ("  ".length() == (0xB5 ^ 0xB1)) {
                return ((0xC5 ^ 0xA7) & ~(0xF0 ^ 0x92)) != 0x0;
            }
            while (!lllIlIlIllIlIII(lllllllllllllIIIlIllIIlIIIllIlll, House4Garden.lIlIlIIIIlIIll[2])) {
                int lllllllllllllIIIlIllIIlIIIllIllI = House4Garden.lIlIlIIIIlIIll[0];
                "".length();
                if ("  ".length() <= 0) {
                    return ((0x62 ^ 0x7F ^ (0xBC ^ 0x8A)) & (24 + 17 + 97 + 49 ^ 85 + 98 - 106 + 67 ^ -" ".length())) != 0x0;
                }
                while (!lllIlIlIllIlIII(lllllllllllllIIIlIllIIlIIIllIllI, House4Garden.lIlIlIIIIlIIll[2])) {
                    this.clearCurrentPositionBlocksUpwards(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIllIllI, House4Garden.lIlIlIIIIlIIll[3], lllllllllllllIIIlIllIIlIIIllIlll, lllllllllllllIIIlIllIIlIIIlllIIl);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIIIlIllIIlIIIlllIll, Blocks.cobblestone.getDefaultState(), lllllllllllllIIIlIllIIlIIIllIllI, House4Garden.lIlIlIIIIlIIll[7], lllllllllllllIIIlIllIIlIIIllIlll, lllllllllllllIIIlIllIIlIIIlllIIl);
                    ++lllllllllllllIIIlIllIIlIIIllIllI;
                }
                ++lllllllllllllIIIlIllIIlIIIllIlll;
            }
            this.spawnVillagers(lllllllllllllIIIlIllIIlIIIlllIll, lllllllllllllIIIlIllIIlIIIlllIIl, House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[1], House4Garden.lIlIlIIIIlIIll[6], House4Garden.lIlIlIIIIlIIll[1]);
            return House4Garden.lIlIlIIIIlIIll[1] != 0;
        }
        
        private static boolean lllIlIlIllIIlII(final int lllllllllllllIIIlIllIIIlllllIllI) {
            return lllllllllllllIIIlIllIIIlllllIllI < 0;
        }
        
        private static boolean lllIlIlIllIIIll(final Object lllllllllllllIIIlIllIIIllllllllI) {
            return lllllllllllllIIIlIllIIIllllllllI != null;
        }
        
        private static boolean lllIlIlIllIlIII(final int lllllllllllllIIIlIllIIlIIIIIlIIl, final int lllllllllllllIIIlIllIIlIIIIIlIII) {
            return lllllllllllllIIIlIllIIlIIIIIlIIl >= lllllllllllllIIIlIllIIlIIIIIlIII;
        }
        
        private static void lllIlIlIllIIIII() {
            (lIlIlIIIIlIIIl = new String[House4Garden.lIlIlIIIIlIIll[6]])[House4Garden.lIlIlIIIIlIIll[0]] = lllIlIlIlIllllI("49PAl6oesXw=", "BoiDS");
            House4Garden.lIlIlIIIIlIIIl[House4Garden.lIlIlIIIIlIIll[1]] = lllIlIlIlIlllll("AgwFPgY1DA==", "ViwLg");
        }
    }
}
