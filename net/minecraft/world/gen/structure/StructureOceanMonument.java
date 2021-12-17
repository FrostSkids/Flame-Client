// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import com.google.common.collect.Sets;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.Set;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityGuardian;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import java.util.Map;
import java.util.Random;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;

public class StructureOceanMonument extends MapGenStructure
{
    private /* synthetic */ int field_175801_g;
    private static final /* synthetic */ String[] lIllIlIlIlllll;
    private static final /* synthetic */ List<BiomeGenBase.SpawnListEntry> field_175803_h;
    private static final /* synthetic */ int[] lIllIlIllIIIII;
    private /* synthetic */ int field_175800_f;
    public static final /* synthetic */ List<BiomeGenBase> field_175802_d;
    
    private static boolean llllllIlllIIlII(final int llllllllllllIlllllllllIIllllIlII, final int llllllllllllIlllllllllIIllllIIll) {
        return llllllllllllIlllllllllIIllllIlII == llllllllllllIlllllllllIIllllIIll;
    }
    
    private static boolean llllllIlllIIllI(final int llllllllllllIlllllllllIIllllIIII, final int llllllllllllIlllllllllIIlllIllll) {
        return llllllllllllIlllllllllIIllllIIII < llllllllllllIlllllllllIIlllIllll;
    }
    
    public List<BiomeGenBase.SpawnListEntry> func_175799_b() {
        return StructureOceanMonument.field_175803_h;
    }
    
    private static String llllllIllIlllII(String llllllllllllIlllllllllIlIIIIllII, final String llllllllllllIlllllllllIlIIIIlIll) {
        llllllllllllIlllllllllIlIIIIllII = new String(Base64.getDecoder().decode(llllllllllllIlllllllllIlIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllllIlIIIIllll = new StringBuilder();
        final char[] llllllllllllIlllllllllIlIIIIlllI = llllllllllllIlllllllllIlIIIIlIll.toCharArray();
        int llllllllllllIlllllllllIlIIIIllIl = StructureOceanMonument.lIllIlIllIIIII[1];
        final byte llllllllllllIlllllllllIlIIIIIlll = (Object)llllllllllllIlllllllllIlIIIIllII.toCharArray();
        final String llllllllllllIlllllllllIlIIIIIllI = (String)llllllllllllIlllllllllIlIIIIIlll.length;
        long llllllllllllIlllllllllIlIIIIIlIl = StructureOceanMonument.lIllIlIllIIIII[1];
        while (llllllIlllIIllI((int)llllllllllllIlllllllllIlIIIIIlIl, (int)llllllllllllIlllllllllIlIIIIIllI)) {
            final char llllllllllllIlllllllllIlIIIlIIlI = llllllllllllIlllllllllIlIIIIIlll[llllllllllllIlllllllllIlIIIIIlIl];
            llllllllllllIlllllllllIlIIIIllll.append((char)(llllllllllllIlllllllllIlIIIlIIlI ^ llllllllllllIlllllllllIlIIIIlllI[llllllllllllIlllllllllIlIIIIllIl % llllllllllllIlllllllllIlIIIIlllI.length]));
            "".length();
            ++llllllllllllIlllllllllIlIIIIllIl;
            ++llllllllllllIlllllllllIlIIIIIlIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllllIlIIIIllll);
    }
    
    private static boolean llllllIlllIIIll(final int llllllllllllIlllllllllIIlllIIlIl) {
        return llllllllllllIlllllllllIIlllIIlIl < 0;
    }
    
    @Override
    protected StructureStart getStructureStart(final int llllllllllllIlllllllllIlIIIllllI, final int llllllllllllIlllllllllIlIIIlllIl) {
        return new StartMonument(this.worldObj, this.rand, llllllllllllIlllllllllIlIIIllllI, llllllllllllIlllllllllIlIIIlllIl);
    }
    
    @Override
    public String getStructureName() {
        return StructureOceanMonument.lIllIlIlIlllll[StructureOceanMonument.lIllIlIllIIIII[3]];
    }
    
    public StructureOceanMonument() {
        this.field_175800_f = StructureOceanMonument.lIllIlIllIIIII[6];
        this.field_175801_g = StructureOceanMonument.lIllIlIllIIIII[0];
    }
    
    private static boolean llllllIlllIIlIl(final Object llllllllllllIlllllllllIIlllIllII, final Object llllllllllllIlllllllllIIlllIlIll) {
        return llllllllllllIlllllllllIIlllIllII != llllllllllllIlllllllllIIlllIlIll;
    }
    
    @Override
    protected boolean canSpawnStructureAtCoords(int llllllllllllIlllllllllIlIIlIllIl, int llllllllllllIlllllllllIlIIllIlIl) {
        final int llllllllllllIlllllllllIlIIllIlII = llllllllllllIlllllllllIlIIlIllIl;
        final int llllllllllllIlllllllllIlIIllIIll = llllllllllllIlllllllllIlIIllIlIl;
        if (llllllIlllIIIll(llllllllllllIlllllllllIlIIlIllIl)) {
            llllllllllllIlllllllllIlIIlIllIl -= this.field_175800_f - StructureOceanMonument.lIllIlIllIIIII[2];
        }
        if (llllllIlllIIIll(llllllllllllIlllllllllIlIIllIlIl)) {
            llllllllllllIlllllllllIlIIllIlIl -= this.field_175800_f - StructureOceanMonument.lIllIlIllIIIII[2];
        }
        int llllllllllllIlllllllllIlIIllIIlI = llllllllllllIlllllllllIlIIlIllIl / this.field_175800_f;
        int llllllllllllIlllllllllIlIIllIIIl = llllllllllllIlllllllllIlIIllIlIl / this.field_175800_f;
        final Random llllllllllllIlllllllllIlIIllIIII = this.worldObj.setRandomSeed(llllllllllllIlllllllllIlIIllIIlI, llllllllllllIlllllllllIlIIllIIIl, StructureOceanMonument.lIllIlIllIIIII[7]);
        llllllllllllIlllllllllIlIIllIIlI *= this.field_175800_f;
        llllllllllllIlllllllllIlIIllIIIl *= this.field_175800_f;
        llllllllllllIlllllllllIlIIllIIlI += (llllllllllllIlllllllllIlIIllIIII.nextInt(this.field_175800_f - this.field_175801_g) + llllllllllllIlllllllllIlIIllIIII.nextInt(this.field_175800_f - this.field_175801_g)) / StructureOceanMonument.lIllIlIllIIIII[3];
        llllllllllllIlllllllllIlIIllIIIl += (llllllllllllIlllllllllIlIIllIIII.nextInt(this.field_175800_f - this.field_175801_g) + llllllllllllIlllllllllIlIIllIIII.nextInt(this.field_175800_f - this.field_175801_g)) / StructureOceanMonument.lIllIlIllIIIII[3];
        if (llllllIlllIIlII(llllllllllllIlllllllllIlIIllIlII, llllllllllllIlllllllllIlIIllIIlI) && llllllIlllIIlII(llllllllllllIlllllllllIlIIllIIll, llllllllllllIlllllllllIlIIllIIIl)) {
            if (llllllIlllIIlIl(this.worldObj.getWorldChunkManager().getBiomeGenerator(new BlockPos(llllllllllllIlllllllllIlIIllIlII * StructureOceanMonument.lIllIlIllIIIII[8] + StructureOceanMonument.lIllIlIllIIIII[9], StructureOceanMonument.lIllIlIllIIIII[10], llllllllllllIlllllllllIlIIllIIll * StructureOceanMonument.lIllIlIllIIIII[8] + StructureOceanMonument.lIllIlIllIIIII[9]), null), BiomeGenBase.deepOcean)) {
                return StructureOceanMonument.lIllIlIllIIIII[1] != 0;
            }
            final boolean llllllllllllIlllllllllIlIIlIllll = this.worldObj.getWorldChunkManager().areBiomesViable(llllllllllllIlllllllllIlIIllIlII * StructureOceanMonument.lIllIlIllIIIII[8] + StructureOceanMonument.lIllIlIllIIIII[9], llllllllllllIlllllllllIlIIllIIll * StructureOceanMonument.lIllIlIllIIIII[8] + StructureOceanMonument.lIllIlIllIIIII[9], StructureOceanMonument.lIllIlIllIIIII[11], StructureOceanMonument.field_175802_d);
            if (llllllIlllIIIIl(llllllllllllIlllllllllIlIIlIllll ? 1 : 0)) {
                return StructureOceanMonument.lIllIlIllIIIII[2] != 0;
            }
        }
        return StructureOceanMonument.lIllIlIllIIIII[1] != 0;
    }
    
    public StructureOceanMonument(final Map<String, String> llllllllllllIlllllllllIlIlIIIlll) {
        this();
        final char llllllllllllIlllllllllIlIlIIIIlI = (char)llllllllllllIlllllllllIlIlIIIlll.entrySet().iterator();
        "".length();
        if ("  ".length() <= -" ".length()) {
            throw null;
        }
        while (!llllllIlllIIIlI(((Iterator)llllllllllllIlllllllllIlIlIIIIlI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIlllllllllIlIlIIIllI = ((Iterator<Map.Entry<String, String>>)llllllllllllIlllllllllIlIlIIIIlI).next();
            if (llllllIlllIIIIl(llllllllllllIlllllllllIlIlIIIllI.getKey().equals(StructureOceanMonument.lIllIlIlIlllll[StructureOceanMonument.lIllIlIllIIIII[1]]) ? 1 : 0)) {
                this.field_175800_f = MathHelper.parseIntWithDefaultAndMax(llllllllllllIlllllllllIlIlIIIllI.getValue(), this.field_175800_f, StructureOceanMonument.lIllIlIllIIIII[2]);
                "".length();
                if (-"   ".length() > 0) {
                    throw null;
                }
                continue;
            }
            else {
                if (!llllllIlllIIIIl(llllllllllllIlllllllllIlIlIIIllI.getKey().equals(StructureOceanMonument.lIllIlIlIlllll[StructureOceanMonument.lIllIlIllIIIII[2]]) ? 1 : 0)) {
                    continue;
                }
                this.field_175801_g = MathHelper.parseIntWithDefaultAndMax(llllllllllllIlllllllllIlIlIIIllI.getValue(), this.field_175801_g, StructureOceanMonument.lIllIlIllIIIII[2]);
            }
        }
    }
    
    private static boolean llllllIlllIIIIl(final int llllllllllllIlllllllllIIlllIlIIl) {
        return llllllllllllIlllllllllIIlllIlIIl != 0;
    }
    
    private static String llllllIllIlllIl(final String llllllllllllIlllllllllIIlllllIlI, final String llllllllllllIlllllllllIIlllllIll) {
        try {
            final SecretKeySpec llllllllllllIlllllllllIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllllIIlllllllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllllIIlllllllI.init(StructureOceanMonument.lIllIlIllIIIII[3], llllllllllllIlllllllllIIllllllll);
            return new String(llllllllllllIlllllllllIIlllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllIIllllllIl) {
            llllllllllllIlllllllllIIllllllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllllIlllIIIlI(final int llllllllllllIlllllllllIIlllIIlll) {
        return llllllllllllIlllllllllIIlllIIlll == 0;
    }
    
    private static void llllllIllIllllI() {
        (lIllIlIlIlllll = new String[StructureOceanMonument.lIllIlIllIIIII[4]])[StructureOceanMonument.lIllIlIllIIIII[1]] = llllllIllIlllII("JDssLgg5LA==", "WKMMa");
        StructureOceanMonument.lIllIlIlIlllll[StructureOceanMonument.lIllIlIllIIIII[2]] = llllllIllIlllIl("NMudvz287k8CFVXyJceESg==", "knYIP");
        StructureOceanMonument.lIllIlIlIlllll[StructureOceanMonument.lIllIlIllIIIII[3]] = llllllIllIlllIl("CrqG+/OnlzWroF51/ls4SA==", "ssNzi");
    }
    
    static {
        llllllIlllIIIII();
        llllllIllIllllI();
        final BiomeGenBase[] a = new BiomeGenBase[StructureOceanMonument.lIllIlIllIIIII[0]];
        a[StructureOceanMonument.lIllIlIllIIIII[1]] = BiomeGenBase.ocean;
        a[StructureOceanMonument.lIllIlIllIIIII[2]] = BiomeGenBase.deepOcean;
        a[StructureOceanMonument.lIllIlIllIIIII[3]] = BiomeGenBase.river;
        a[StructureOceanMonument.lIllIlIllIIIII[4]] = BiomeGenBase.frozenOcean;
        a[StructureOceanMonument.lIllIlIllIIIII[5]] = BiomeGenBase.frozenRiver;
        field_175802_d = Arrays.asList(a);
        (field_175803_h = Lists.newArrayList()).add(new BiomeGenBase.SpawnListEntry(EntityGuardian.class, StructureOceanMonument.lIllIlIllIIIII[2], StructureOceanMonument.lIllIlIllIIIII[3], StructureOceanMonument.lIllIlIllIIIII[5]));
        "".length();
    }
    
    private static void llllllIlllIIIII() {
        (lIllIlIllIIIII = new int[12])[0] = (0x5D ^ 0x3 ^ (0xD2 ^ 0x89));
        StructureOceanMonument.lIllIlIllIIIII[1] = ((26 + 40 - 36 + 153 ^ 41 + 3 + 82 + 12) & (0xAF ^ 0x92 ^ ((0x69 ^ 0x7F) & ~(0x13 ^ 0x5)) ^ -" ".length()));
        StructureOceanMonument.lIllIlIllIIIII[2] = " ".length();
        StructureOceanMonument.lIllIlIllIIIII[3] = "  ".length();
        StructureOceanMonument.lIllIlIllIIIII[4] = "   ".length();
        StructureOceanMonument.lIllIlIllIIIII[5] = (173 + 60 - 113 + 71 ^ 79 + 37 + 40 + 31);
        StructureOceanMonument.lIllIlIllIIIII[6] = (0x46 ^ 0x66);
        StructureOceanMonument.lIllIlIllIIIII[7] = (-(0x36 ^ 0x3B) & (0xFFFFFFFD & 0x9E7F7F));
        StructureOceanMonument.lIllIlIllIIIII[8] = (0x65 ^ 0x75);
        StructureOceanMonument.lIllIlIllIIIII[9] = (0x2C ^ 0x24);
        StructureOceanMonument.lIllIlIllIIIII[10] = (0x6E ^ 0x2E);
        StructureOceanMonument.lIllIlIllIIIII[11] = (" ".length() ^ (0x46 ^ 0x5A));
    }
    
    public static class StartMonument extends StructureStart
    {
        private /* synthetic */ boolean field_175790_d;
        private /* synthetic */ Set<ChunkCoordIntPair> field_175791_c;
        private static final /* synthetic */ int[] lllIllIIlIIIll;
        private static final /* synthetic */ String[] lllIllIIlIIIlI;
        
        private static boolean lIlIIlIIIlIlllIl(final int llllllllllllIlIllIIllIIllIIllIll, final int llllllllllllIlIllIIllIIllIIllIlI) {
            return llllllllllllIlIllIIllIIllIIllIll < llllllllllllIlIllIIllIIllIIllIlI;
        }
        
        private static boolean lIlIIlIIIlIllIll(final int llllllllllllIlIllIIllIIllIIllIII) {
            return llllllllllllIlIllIIllIIllIIllIII != 0;
        }
        
        @Override
        public boolean func_175788_a(final ChunkCoordIntPair llllllllllllIlIllIIllIIlllllllII) {
            int func_175788_a;
            if (lIlIIlIIIlIllIll(this.field_175791_c.contains(llllllllllllIlIllIIllIIlllllllII) ? 1 : 0)) {
                func_175788_a = StartMonument.lllIllIIlIIIll[4];
                "".length();
                if ("   ".length() <= " ".length()) {
                    return ((0x7F ^ 0x55) & ~(0x42 ^ 0x68)) != 0x0;
                }
            }
            else {
                func_175788_a = (super.func_175788_a(llllllllllllIlIllIIllIIlllllllII) ? 1 : 0);
            }
            return func_175788_a != 0;
        }
        
        private static boolean lIlIIlIIIlIlllII(final int llllllllllllIlIllIIllIIllIIlllll, final int llllllllllllIlIllIIllIIllIIllllI) {
            return llllllllllllIlIllIIllIIllIIlllll >= llllllllllllIlIllIIllIIllIIllllI;
        }
        
        @Override
        public void readFromNBT(final NBTTagCompound llllllllllllIlIllIIllIIlllIlllII) {
            super.readFromNBT(llllllllllllIlIllIIllIIlllIlllII);
            if (lIlIIlIIIlIllIll(llllllllllllIlIllIIllIIlllIlllII.hasKey(StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[6]], StartMonument.lllIllIIlIIIll[7]) ? 1 : 0)) {
                final NBTTagList llllllllllllIlIllIIllIIlllIllIll = llllllllllllIlIllIIllIIlllIlllII.getTagList(StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[8]], StartMonument.lllIllIIlIIIll[9]);
                int llllllllllllIlIllIIllIIlllIllIlI = StartMonument.lllIllIIlIIIll[4];
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                while (!lIlIIlIIIlIlllII(llllllllllllIlIllIIllIIlllIllIlI, llllllllllllIlIllIIllIIlllIllIll.tagCount())) {
                    final NBTTagCompound llllllllllllIlIllIIllIIlllIllIIl = llllllllllllIlIllIIllIIlllIllIll.getCompoundTagAt(llllllllllllIlIllIIllIIlllIllIlI);
                    this.field_175791_c.add(new ChunkCoordIntPair(llllllllllllIlIllIIllIIlllIllIIl.getInteger(StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[10]]), llllllllllllIlIllIIllIIlllIllIIl.getInteger(StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[11]])));
                    "".length();
                    ++llllllllllllIlIllIIllIIlllIllIlI;
                }
            }
        }
        
        private static String lIlIIlIIIlIlIlIl(final String llllllllllllIlIllIIllIIllIlIIlll, final String llllllllllllIlIllIIllIIllIlIIlII) {
            try {
                final SecretKeySpec llllllllllllIlIllIIllIIllIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIIllIlIIlII.getBytes(StandardCharsets.UTF_8)), StartMonument.lllIllIIlIIIll[1]), "DES");
                final Cipher llllllllllllIlIllIIllIIllIlIlIIl = Cipher.getInstance("DES");
                llllllllllllIlIllIIllIIllIlIlIIl.init(StartMonument.lllIllIIlIIIll[5], llllllllllllIlIllIIllIIllIlIlIlI);
                return new String(llllllllllllIlIllIIllIIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIIllIIllIlIlIII) {
                llllllllllllIlIllIIllIIllIlIlIII.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIIlIIIlIllIIl() {
            (lllIllIIlIIIll = new int[13])[0] = (0x4D ^ 0x25 ^ (0xC2 ^ 0xBA));
            StartMonument.lllIllIIlIIIll[1] = (0x5B ^ 0x46 ^ (0x87 ^ 0x92));
            StartMonument.lllIllIIlIIIll[2] = (0xFA ^ 0x96 ^ (0x6F ^ 0x1E));
            StartMonument.lllIllIIlIIIll[3] = " ".length();
            StartMonument.lllIllIIlIIIll[4] = ((0x24 ^ 0xF ^ ((0xAB ^ 0x83) & ~(0x30 ^ 0x18))) & (0xA6 ^ 0xA3 ^ (0x97 ^ 0xB9) ^ -" ".length()));
            StartMonument.lllIllIIlIIIll[5] = "  ".length();
            StartMonument.lllIllIIlIIIll[6] = "   ".length();
            StartMonument.lllIllIIlIIIll[7] = (0x73 ^ 0x7A);
            StartMonument.lllIllIIlIIIll[8] = (0x58 ^ 0x5C);
            StartMonument.lllIllIIlIIIll[9] = (0xDB ^ 0x84 ^ (0xD6 ^ 0x83));
            StartMonument.lllIllIIlIIIll[10] = (0xB ^ 0xE);
            StartMonument.lllIllIIlIIIll[11] = (0x68 ^ 0x14 ^ (0xBF ^ 0xC5));
            StartMonument.lllIllIIlIIIll[12] = (0x58 ^ 0x2D ^ (0x4D ^ 0x3F));
        }
        
        @Override
        public void writeToNBT(final NBTTagCompound llllllllllllIlIllIIllIIllllIIlll) {
            super.writeToNBT(llllllllllllIlIllIIllIIllllIIlll);
            final NBTTagList llllllllllllIlIllIIllIIllllIlIll = new NBTTagList();
            final int llllllllllllIlIllIIllIIllllIIlII = (int)this.field_175791_c.iterator();
            "".length();
            if (" ".length() == 0) {
                return;
            }
            while (!lIlIIlIIIlIllIlI(((Iterator)llllllllllllIlIllIIllIIllllIIlII).hasNext() ? 1 : 0)) {
                final ChunkCoordIntPair llllllllllllIlIllIIllIIllllIlIlI = ((Iterator<ChunkCoordIntPair>)llllllllllllIlIllIIllIIllllIIlII).next();
                final NBTTagCompound llllllllllllIlIllIIllIIllllIlIIl = new NBTTagCompound();
                llllllllllllIlIllIIllIIllllIlIIl.setInteger(StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[4]], llllllllllllIlIllIIllIIllllIlIlI.chunkXPos);
                llllllllllllIlIllIIllIIllllIlIIl.setInteger(StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[3]], llllllllllllIlIllIIllIIllllIlIlI.chunkZPos);
                llllllllllllIlIllIIllIIllllIlIll.appendTag(llllllllllllIlIllIIllIIllllIlIIl);
            }
            llllllllllllIlIllIIllIIllllIIlll.setTag(StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[5]], llllllllllllIlIllIIllIIllllIlIll);
        }
        
        private static void lIlIIlIIIlIllIII() {
            (lllIllIIlIIIlI = new String[StartMonument.lllIllIIlIIIll[12]])[StartMonument.lllIllIIlIIIll[4]] = lIlIIlIIIlIlIlIl("8xAyVzXs2I4=", "lpvQu");
            StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[3]] = lIlIIlIIIlIlIllI("LM+rQmK4Ynw=", "DRLYs");
            StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[5]] = lIlIIlIIIlIlIlll("KCcdERcLJhcW", "xUrrr");
            StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[6]] = lIlIIlIIIlIlIlIl("Uh3m4u31PFkZO7oHf8FUmg==", "KlQhu");
            StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[8]] = lIlIIlIIIlIlIlIl("exI2vRYSpind5JqZb8aKgg==", "HnWwg");
            StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[10]] = lIlIIlIIIlIlIlll("Kg==", "rhAYh");
            StartMonument.lllIllIIlIIIlI[StartMonument.lllIllIIlIIIll[11]] = lIlIIlIIIlIlIlll("EA==", "Jjnej");
        }
        
        @Override
        public void func_175787_b(final ChunkCoordIntPair llllllllllllIlIllIIllIIlllllIllI) {
            super.func_175787_b(llllllllllllIlIllIIllIIlllllIllI);
            this.field_175791_c.add(llllllllllllIlIllIIllIIlllllIllI);
            "".length();
        }
        
        public StartMonument() {
            this.field_175791_c = (Set<ChunkCoordIntPair>)Sets.newHashSet();
        }
        
        public StartMonument(final World llllllllllllIlIllIIllIlIIIllIIll, final Random llllllllllllIlIllIIllIlIIIllIlll, final int llllllllllllIlIllIIllIlIIIllIIIl, final int llllllllllllIlIllIIllIlIIIllIlIl) {
            super(llllllllllllIlIllIIllIlIIIllIIIl, llllllllllllIlIllIIllIlIIIllIlIl);
            this.field_175791_c = (Set<ChunkCoordIntPair>)Sets.newHashSet();
            this.func_175789_b(llllllllllllIlIllIIllIlIIIllIIll, llllllllllllIlIllIIllIlIIIllIlll, llllllllllllIlIllIIllIlIIIllIIIl, llllllllllllIlIllIIllIlIIIllIlIl);
        }
        
        static {
            lIlIIlIIIlIllIIl();
            lIlIIlIIIlIllIII();
        }
        
        @Override
        public void generateStructure(final World llllllllllllIlIllIIllIlIIIIIIIlI, final Random llllllllllllIlIllIIllIlIIIIIIlIl, final StructureBoundingBox llllllllllllIlIllIIllIlIIIIIIlII) {
            if (lIlIIlIIIlIllIlI(this.field_175790_d ? 1 : 0)) {
                this.components.clear();
                this.func_175789_b(llllllllllllIlIllIIllIlIIIIIIIlI, llllllllllllIlIllIIllIlIIIIIIlIl, this.getChunkPosX(), this.getChunkPosZ());
            }
            super.generateStructure(llllllllllllIlIllIIllIlIIIIIIIlI, llllllllllllIlIllIIllIlIIIIIIlIl, llllllllllllIlIllIIllIlIIIIIIlII);
        }
        
        private static String lIlIIlIIIlIlIllI(final String llllllllllllIlIllIIllIIlllIIlIlI, final String llllllllllllIlIllIIllIIlllIIlIIl) {
            try {
                final SecretKeySpec llllllllllllIlIllIIllIIlllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllIIllIIlllIIlllI = Cipher.getInstance("Blowfish");
                llllllllllllIlIllIIllIIlllIIlllI.init(StartMonument.lllIllIIlIIIll[5], llllllllllllIlIllIIllIIlllIIllll);
                return new String(llllllllllllIlIllIIllIIlllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIIllIIlllIIllIl) {
                llllllllllllIlIllIIllIIlllIIllIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIIlIIIlIllIlI(final int llllllllllllIlIllIIllIIllIIlIllI) {
            return llllllllllllIlIllIIllIIllIIlIllI == 0;
        }
        
        private void func_175789_b(final World llllllllllllIlIllIIllIlIIIIlIllI, final Random llllllllllllIlIllIIllIlIIIlIIIIl, final int llllllllllllIlIllIIllIlIIIIlIlII, final int llllllllllllIlIllIIllIlIIIIlllll) {
            llllllllllllIlIllIIllIlIIIlIIIIl.setSeed(llllllllllllIlIllIIllIlIIIIlIllI.getSeed());
            final long llllllllllllIlIllIIllIlIIIIllllI = llllllllllllIlIllIIllIlIIIlIIIIl.nextLong();
            final long llllllllllllIlIllIIllIlIIIIlllIl = llllllllllllIlIllIIllIlIIIlIIIIl.nextLong();
            final long llllllllllllIlIllIIllIlIIIIlllII = llllllllllllIlIllIIllIlIIIIlIlII * llllllllllllIlIllIIllIlIIIIllllI;
            final long llllllllllllIlIllIIllIlIIIIllIll = llllllllllllIlIllIIllIlIIIIlllll * llllllllllllIlIllIIllIlIIIIlllIl;
            llllllllllllIlIllIIllIlIIIlIIIIl.setSeed(llllllllllllIlIllIIllIlIIIIlllII ^ llllllllllllIlIllIIllIlIIIIllIll ^ llllllllllllIlIllIIllIlIIIIlIllI.getSeed());
            final int llllllllllllIlIllIIllIlIIIIllIlI = llllllllllllIlIllIIllIlIIIIlIlII * StartMonument.lllIllIIlIIIll[0] + StartMonument.lllIllIIlIIIll[1] - StartMonument.lllIllIIlIIIll[2];
            final int llllllllllllIlIllIIllIlIIIIllIIl = llllllllllllIlIllIIllIlIIIIlllll * StartMonument.lllIllIIlIIIll[0] + StartMonument.lllIllIIlIIIll[1] - StartMonument.lllIllIIlIIIll[2];
            final EnumFacing llllllllllllIlIllIIllIlIIIIllIII = EnumFacing.Plane.HORIZONTAL.random(llllllllllllIlIllIIllIlIIIlIIIIl);
            this.components.add(new StructureOceanMonumentPieces.MonumentBuilding(llllllllllllIlIllIIllIlIIIlIIIIl, llllllllllllIlIllIIllIlIIIIllIlI, llllllllllllIlIllIIllIlIIIIllIIl, llllllllllllIlIllIIllIlIIIIllIII));
            "".length();
            this.updateBoundingBox();
            this.field_175790_d = (StartMonument.lllIllIIlIIIll[3] != 0);
        }
        
        private static String lIlIIlIIIlIlIlll(String llllllllllllIlIllIIllIIllIllIlll, final String llllllllllllIlIllIIllIIllIllIllI) {
            llllllllllllIlIllIIllIIllIllIlll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIllIIllIllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllIIllIIllIlllIlI = new StringBuilder();
            final char[] llllllllllllIlIllIIllIIllIlllIIl = llllllllllllIlIllIIllIIllIllIllI.toCharArray();
            int llllllllllllIlIllIIllIIllIlllIII = StartMonument.lllIllIIlIIIll[4];
            final Exception llllllllllllIlIllIIllIIllIllIIlI = (Object)((String)llllllllllllIlIllIIllIIllIllIlll).toCharArray();
            final String llllllllllllIlIllIIllIIllIllIIIl = (String)llllllllllllIlIllIIllIIllIllIIlI.length;
            byte llllllllllllIlIllIIllIIllIllIIII = (byte)StartMonument.lllIllIIlIIIll[4];
            while (lIlIIlIIIlIlllIl(llllllllllllIlIllIIllIIllIllIIII, (int)llllllllllllIlIllIIllIIllIllIIIl)) {
                final char llllllllllllIlIllIIllIIllIllllIl = llllllllllllIlIllIIllIIllIllIIlI[llllllllllllIlIllIIllIIllIllIIII];
                llllllllllllIlIllIIllIIllIlllIlI.append((char)(llllllllllllIlIllIIllIIllIllllIl ^ llllllllllllIlIllIIllIIllIlllIIl[llllllllllllIlIllIIllIIllIlllIII % llllllllllllIlIllIIllIIllIlllIIl.length]));
                "".length();
                ++llllllllllllIlIllIIllIIllIlllIII;
                ++llllllllllllIlIllIIllIIllIllIIII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllIIllIIllIlllIlI);
        }
    }
}
