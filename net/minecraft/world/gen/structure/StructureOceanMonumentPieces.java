// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.block.BlockPrismarine;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import java.util.Random;
import net.minecraft.util.EnumFacing;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class StructureOceanMonumentPieces
{
    private static final /* synthetic */ int[] llIIllllIlIlll;
    private static final /* synthetic */ String[] llIIllllIlIlIl;
    
    public static void registerOceanMonumentPieces() {
        MapGenStructureIO.registerStructureComponent(MonumentBuilding.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[0]]);
        MapGenStructureIO.registerStructureComponent(MonumentCoreRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[1]]);
        MapGenStructureIO.registerStructureComponent(DoubleXRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[2]]);
        MapGenStructureIO.registerStructureComponent(DoubleXYRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[3]]);
        MapGenStructureIO.registerStructureComponent(DoubleYRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[4]]);
        MapGenStructureIO.registerStructureComponent(DoubleYZRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[5]]);
        MapGenStructureIO.registerStructureComponent(DoubleZRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[6]]);
        MapGenStructureIO.registerStructureComponent(EntryRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[7]]);
        MapGenStructureIO.registerStructureComponent(Penthouse.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[8]]);
        MapGenStructureIO.registerStructureComponent(SimpleRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[9]]);
        MapGenStructureIO.registerStructureComponent(SimpleTopRoom.class, StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[10]]);
    }
    
    private static String lIIlIIIIIlIIlIIl(String llllllllllllIllIlllIlIIllIIlIlIl, final String llllllllllllIllIlllIlIIllIIlIlII) {
        llllllllllllIllIlllIlIIllIIlIlIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIlIIllIIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIlIIllIIllIII = new StringBuilder();
        final char[] llllllllllllIllIlllIlIIllIIlIlll = llllllllllllIllIlllIlIIllIIlIlII.toCharArray();
        int llllllllllllIllIlllIlIIllIIlIllI = StructureOceanMonumentPieces.llIIllllIlIlll[0];
        final double llllllllllllIllIlllIlIIllIIlIIII = (Object)((String)llllllllllllIllIlllIlIIllIIlIlIl).toCharArray();
        final double llllllllllllIllIlllIlIIllIIIllll = llllllllllllIllIlllIlIIllIIlIIII.length;
        short llllllllllllIllIlllIlIIllIIIlllI = (short)StructureOceanMonumentPieces.llIIllllIlIlll[0];
        while (lIIlIIIIIlIlllII(llllllllllllIllIlllIlIIllIIIlllI, (int)llllllllllllIllIlllIlIIllIIIllll)) {
            final char llllllllllllIllIlllIlIIllIIllIll = llllllllllllIllIlllIlIIllIIlIIII[llllllllllllIllIlllIlIIllIIIlllI];
            llllllllllllIllIlllIlIIllIIllIII.append((char)(llllllllllllIllIlllIlIIllIIllIll ^ llllllllllllIllIlllIlIIllIIlIlll[llllllllllllIllIlllIlIIllIIlIllI % llllllllllllIllIlllIlIIllIIlIlll.length]));
            "".length();
            ++llllllllllllIllIlllIlIIllIIlIllI;
            ++llllllllllllIllIlllIlIIllIIIlllI;
            "".length();
            if (-(137 + 113 - 182 + 86 ^ 138 + 59 - 194 + 155) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIlIIllIIllIII);
    }
    
    private static void lIIlIIIIIlIIllIl() {
        (llIIllllIlIlIl = new String[StructureOceanMonumentPieces.llIIllllIlIlll[11]])[StructureOceanMonumentPieces.llIIllllIlIlll[0]] = lIIlIIIIIlIIlIIl("Iy8T", "lbQMY");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[1]] = lIIlIIIIIlIIlIlI("2mhEIyj70KY=", "GosUL");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[2]] = lIIlIIIIIlIIlIIl("NTwxKTU=", "zquqg");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[3]] = lIIlIIIIIlIIllII("RaaxLXQy9oE=", "hgkBC");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[4]] = lIIlIIIIIlIIllII("KwyNUDVJ+pE=", "efhXu");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[5]] = lIIlIIIIIlIIlIIl("AyopFCIe", "LgmMx");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[6]] = lIIlIIIIIlIIllII("NLBzIrgBDmA=", "jvzJh");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[7]] = lIIlIIIIIlIIllII("QPsVdHc3Dq0=", "OkPGH");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[8]] = lIIlIIIIIlIIllII("bxq2t3QZD3n8nMRDk1cN0w==", "gCNYx");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[9]] = lIIlIIIIIlIIlIlI("tbEQaTRn/BEwYG96RvcT+A==", "IpBSD");
        StructureOceanMonumentPieces.llIIllllIlIlIl[StructureOceanMonumentPieces.llIIllllIlIlll[10]] = lIIlIIIIIlIIlIlI("kHHSMSx0opDssbV5P+p00w==", "aXEqz");
    }
    
    private static String lIIlIIIIIlIIlIlI(final String llllllllllllIllIlllIlIIllIllIlIl, final String llllllllllllIllIlllIlIIllIllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlIIllIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIIllIllIllI.getBytes(StandardCharsets.UTF_8)), StructureOceanMonumentPieces.llIIllllIlIlll[8]), "DES");
            final Cipher llllllllllllIllIlllIlIIllIlllIIl = Cipher.getInstance("DES");
            llllllllllllIllIlllIlIIllIlllIIl.init(StructureOceanMonumentPieces.llIIllllIlIlll[2], llllllllllllIllIlllIlIIllIlllIlI);
            return new String(llllllllllllIllIlllIlIIllIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIIllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlIIllIlllIII) {
            llllllllllllIllIlllIlIIllIlllIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIIIIIlIllIll();
        lIIlIIIIIlIIllIl();
    }
    
    private static boolean lIIlIIIIIlIlllII(final int llllllllllllIllIlllIlIIllIIIlIlI, final int llllllllllllIllIlllIlIIllIIIlIIl) {
        return llllllllllllIllIlllIlIIllIIIlIlI < llllllllllllIllIlllIlIIllIIIlIIl;
    }
    
    private static String lIIlIIIIIlIIllII(final String llllllllllllIllIlllIlIIllIlIlIlI, final String llllllllllllIllIlllIlIIllIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlIIllIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIlIIllIlIllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIlIIllIlIllII.init(StructureOceanMonumentPieces.llIIllllIlIlll[2], llllllllllllIllIlllIlIIllIlIllIl);
            return new String(llllllllllllIllIlllIlIIllIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlIIllIlIlIll) {
            llllllllllllIllIlllIlIIllIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIIIlIllIll() {
        (llIIllllIlIlll = new int[12])[0] = ((0xDB ^ 0x93) & ~(0x59 ^ 0x11));
        StructureOceanMonumentPieces.llIIllllIlIlll[1] = " ".length();
        StructureOceanMonumentPieces.llIIllllIlIlll[2] = "  ".length();
        StructureOceanMonumentPieces.llIIllllIlIlll[3] = "   ".length();
        StructureOceanMonumentPieces.llIIllllIlIlll[4] = (0 + 113 - 88 + 167 ^ 98 + 180 - 248 + 166);
        StructureOceanMonumentPieces.llIIllllIlIlll[5] = (0xAC ^ 0xA9);
        StructureOceanMonumentPieces.llIIllllIlIlll[6] = (103 + 126 - 124 + 45 ^ 66 + 73 - 100 + 105);
        StructureOceanMonumentPieces.llIIllllIlIlll[7] = (0x1A ^ 0x42 ^ (0x66 ^ 0x39));
        StructureOceanMonumentPieces.llIIllllIlIlll[8] = (0xB7 ^ 0xBF);
        StructureOceanMonumentPieces.llIIllllIlIlll[9] = (110 + 64 - 159 + 191 ^ 111 + 12 + 46 + 30);
        StructureOceanMonumentPieces.llIIllllIlIlll[10] = (0xBA ^ 0xB0);
        StructureOceanMonumentPieces.llIIllllIlIlll[11] = (0x93 ^ 0x98);
    }
    
    static class YZDoubleRoomFitHelper implements MonumentRoomFitHelper
    {
        private static final /* synthetic */ int[] lIIIIIlIIIllll;
        
        private static boolean lIllIlIllIlIIll(final int lllllllllllllIlIIllllIlllIIllIll) {
            return lllllllllllllIlIIllllIlllIIllIll == 0;
        }
        
        static {
            lIllIlIllIlIIIl();
        }
        
        @Override
        public Piece func_175968_a(final EnumFacing lllllllllllllIlIIllllIlllIlIIIll, final RoomDefinition lllllllllllllIlIIllllIlllIlIIIlI, final Random lllllllllllllIlIIllllIlllIlIIlII) {
            lllllllllllllIlIIllllIlllIlIIIlI.field_175963_d = (YZDoubleRoomFitHelper.lIIIIIlIIIllll[0] != 0);
            lllllllllllllIlIIllllIlllIlIIIlI.field_175965_b[EnumFacing.NORTH.getIndex()].field_175963_d = (YZDoubleRoomFitHelper.lIIIIIlIIIllll[0] != 0);
            lllllllllllllIlIIllllIlllIlIIIlI.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (YZDoubleRoomFitHelper.lIIIIIlIIIllll[0] != 0);
            lllllllllllllIlIIllllIlllIlIIIlI.field_175965_b[EnumFacing.NORTH.getIndex()].field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (YZDoubleRoomFitHelper.lIIIIIlIIIllll[0] != 0);
            return new DoubleYZRoom(lllllllllllllIlIIllllIlllIlIIIll, lllllllllllllIlIIllllIlllIlIIIlI, lllllllllllllIlIIllllIlllIlIIlII);
        }
        
        private static boolean lIllIlIllIlIIlI(final int lllllllllllllIlIIllllIlllIIlllIl) {
            return lllllllllllllIlIIllllIlllIIlllIl != 0;
        }
        
        @Override
        public boolean func_175969_a(final RoomDefinition lllllllllllllIlIIllllIlllIlIllII) {
            if (!lIllIlIllIlIIlI(lllllllllllllIlIIllllIlllIlIllII.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0) || !lIllIlIllIlIIll(lllllllllllllIlIIllllIlllIlIllII.field_175965_b[EnumFacing.NORTH.getIndex()].field_175963_d ? 1 : 0) || !lIllIlIllIlIIlI(lllllllllllllIlIIllllIlllIlIllII.field_175966_c[EnumFacing.UP.getIndex()] ? 1 : 0) || !lIllIlIllIlIIll(lllllllllllllIlIIllllIlllIlIllII.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d ? 1 : 0)) {
                return YZDoubleRoomFitHelper.lIIIIIlIIIllll[1] != 0;
            }
            final RoomDefinition lllllllllllllIlIIllllIlllIlIllIl = lllllllllllllIlIIllllIlllIlIllII.field_175965_b[EnumFacing.NORTH.getIndex()];
            if (lIllIlIllIlIIlI(lllllllllllllIlIIllllIlllIlIllIl.field_175966_c[EnumFacing.UP.getIndex()] ? 1 : 0) && lIllIlIllIlIIll(lllllllllllllIlIIllllIlllIlIllIl.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d ? 1 : 0)) {
                return YZDoubleRoomFitHelper.lIIIIIlIIIllll[0] != 0;
            }
            return YZDoubleRoomFitHelper.lIIIIIlIIIllll[1] != 0;
        }
        
        private YZDoubleRoomFitHelper() {
        }
        
        private static void lIllIlIllIlIIIl() {
            (lIIIIIlIIIllll = new int[2])[0] = " ".length();
            YZDoubleRoomFitHelper.lIIIIIlIIIllll[1] = ((0x5A ^ 0x1) & ~(0xC9 ^ 0x92));
        }
    }
    
    public static class DoubleYZRoom extends Piece
    {
        private static final /* synthetic */ int[] lIlIIllIIlllIl;
        
        private static boolean lllIIlllllIlllI(final int lllllllllllllIIIllIIllIlIIlIIIIl) {
            return lllllllllllllIIIllIIllIlIIlIIIIl != 0;
        }
        
        private static boolean lllIIlllllIlIll(final int lllllllllllllIIIllIIllIlIIIlllII, final int lllllllllllllIIIllIIllIlIIIllIll) {
            return lllllllllllllIIIllIIllIlIIIlllII != lllllllllllllIIIllIIllIlIIIllIll;
        }
        
        private static boolean lllIIlllllIllIl(final int lllllllllllllIIIllIIllIlIIlIIllI, final int lllllllllllllIIIllIIllIlIIlIIlIl) {
            return lllllllllllllIIIllIIllIlIIlIIllI > lllllllllllllIIIllIIllIlIIlIIlIl;
        }
        
        private static boolean lllIIlllllIlIIl(final int lllllllllllllIIIllIIllIlIIIlllll) {
            return lllllllllllllIIIllIIllIlIIIlllll > 0;
        }
        
        public DoubleYZRoom(final EnumFacing lllllllllllllIIIllIIllIlIlIIllII, final RoomDefinition lllllllllllllIIIllIIllIlIlIIlIll, final Random lllllllllllllIIIllIIllIlIlIIlllI) {
            super(DoubleYZRoom.lIlIIllIIlllIl[0], lllllllllllllIIIllIIllIlIlIIllII, lllllllllllllIIIllIIllIlIlIIlIll, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[1]);
        }
        
        static {
            lllIIlllllIlIII();
        }
        
        private static boolean lllIIlllllIlIlI(final Object lllllllllllllIIIllIIllIlIIlIIIll) {
            return lllllllllllllIIIllIIllIlIIlIIIll == null;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIllIIllIlIIllIlII, final Random lllllllllllllIIIllIIllIlIIllllll, final StructureBoundingBox lllllllllllllIIIllIIllIlIIlllllI) {
            final RoomDefinition lllllllllllllIIIllIIllIlIIllllIl = this.field_175830_k.field_175965_b[EnumFacing.NORTH.getIndex()];
            final RoomDefinition lllllllllllllIIIllIIllIlIIllllII = this.field_175830_k;
            final RoomDefinition lllllllllllllIIIllIIllIlIIlllIll = lllllllllllllIIIllIIllIlIIllllIl.field_175965_b[EnumFacing.UP.getIndex()];
            final RoomDefinition lllllllllllllIIIllIIllIlIIlllIlI = lllllllllllllIIIllIIllIlIIllllII.field_175965_b[EnumFacing.UP.getIndex()];
            if (lllIIlllllIlIIl(this.field_175830_k.field_175967_a / DoubleYZRoom.lIlIIllIIlllIl[2])) {
                this.func_175821_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[4], lllllllllllllIIIllIIllIlIIllllIl.field_175966_c[EnumFacing.DOWN.getIndex()]);
                this.func_175821_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[3], lllllllllllllIIIllIIllIlIIllllII.field_175966_c[EnumFacing.DOWN.getIndex()]);
            }
            if (lllIIlllllIlIlI(lllllllllllllIIIllIIllIlIIlllIlI.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[4], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[4], DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.field_175828_a);
            }
            if (lllIIlllllIlIlI(lllllllllllllIIIllIIllIlIIlllIll.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[4], DoubleYZRoom.lIlIIllIIlllIl[4], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[4], DoubleYZRoom.lIlIIllIIlllIl[7], DoubleYZRoom.field_175828_a);
            }
            int lllllllllllllIIIllIIllIlIIlllIIl = DoubleYZRoom.lIlIIllIIlllIl[0];
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((0x7D ^ 0x2E) & ~(0x14 ^ 0x47)) != 0x0;
            }
            while (!lllIIlllllIllIl(lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[6])) {
                IBlockState lllllllllllllIIIllIIllIlIIlllIII = DoubleYZRoom.field_175826_b;
                if (!lllIIlllllIlIll(lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[1]) || lllIIlllllIllII(lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[5])) {
                    lllllllllllllIIIllIIllIlIIlllIII = DoubleYZRoom.field_175828_a;
                }
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[3], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[3], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[8], lllllllllllllIIIllIIllIlIIlllIII, lllllllllllllIIIllIIllIlIIlllIII, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[6], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[6], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[8], lllllllllllllIIIllIIllIlIIlllIII, lllllllllllllIIIllIIllIlIIlllIII, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[5], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[3], lllllllllllllIIIllIIllIlIIlllIII, lllllllllllllIIIllIIllIlIIlllIII, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[8], DoubleYZRoom.lIlIIllIIlllIl[5], lllllllllllllIIIllIIllIlIIlllIIl, DoubleYZRoom.lIlIIllIIlllIl[8], lllllllllllllIIIllIIllIlIIlllIII, lllllllllllllIIIllIIllIlIIlllIII, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                ++lllllllllllllIIIllIIllIlIIlllIIl;
            }
            int lllllllllllllIIIllIIllIlIIllIlll = DoubleYZRoom.lIlIIllIIlllIl[0];
            "".length();
            if (((106 + 107 - 161 + 81 ^ 137 + 149 - 135 + 40) & (0x43 ^ 0x46 ^ (0x38 ^ 0x7) ^ -" ".length())) != 0x0) {
                return ((0x21 ^ 0x52 ^ (0xE4 ^ 0x85)) & (0x31 ^ 0x49 ^ (0xF5 ^ 0x9F) ^ -" ".length())) != 0x0;
            }
            while (!lllIIlllllIllIl(lllllllllllllIIIllIIllIlIIllIlll, DoubleYZRoom.lIlIIllIIlllIl[6])) {
                IBlockState lllllllllllllIIIllIIllIlIIllIllI = DoubleYZRoom.field_175827_c;
                if (!lllIIlllllIlIll(lllllllllllllIIIllIIllIlIIllIlll, DoubleYZRoom.lIlIIllIIlllIl[1]) || lllIIlllllIllII(lllllllllllllIIIllIIllIlIIllIlll, DoubleYZRoom.lIlIIllIIlllIl[5])) {
                    lllllllllllllIIIllIIllIlIIllIllI = DoubleYZRoom.field_175825_e;
                }
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[9], lllllllllllllIIIllIIllIlIIllIlll, DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[10], lllllllllllllIIIllIIllIlIIllIlll, DoubleYZRoom.lIlIIllIIlllIl[4], lllllllllllllIIIllIIllIlIIllIllI, lllllllllllllIIIllIIllIlIIllIllI, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                ++lllllllllllllIIIllIIllIlIIllIlll;
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIllllII.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[3], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIllllII.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[10], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIllllII.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[10], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIllllIl.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[8], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[8], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIllllIl.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[11], DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[12], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIllllIl.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[11], DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[12], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIlllIlI.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[3], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIlllIlI.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[10], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIlllIlI.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[10], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIlllIll.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[8], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[8], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIlllIll.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[11], DoubleYZRoom.lIlIIllIIlllIl[3], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[12], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[14], DoubleYZRoom.lIlIIllIIlllIl[1], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[15], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[14], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[14], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[15], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[15], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            if (lllIIlllllIlllI(lllllllllllllIIIllIIllIlIIlllIll.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[11], DoubleYZRoom.lIlIIllIIlllIl[6], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[12], (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[13], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[14], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[10], DoubleYZRoom.lIlIIllIIlllIl[15], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[14], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[14], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
                this.fillWithBlocks(lllllllllllllIIIllIIllIlIIllIlII, lllllllllllllIIIllIIllIlIIlllllI, DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[0], DoubleYZRoom.lIlIIllIIlllIl[15], DoubleYZRoom.lIlIIllIIlllIl[5], DoubleYZRoom.lIlIIllIIlllIl[9], DoubleYZRoom.lIlIIllIIlllIl[15], DoubleYZRoom.field_175826_b, DoubleYZRoom.field_175826_b, (boolean)(DoubleYZRoom.lIlIIllIIlllIl[3] != 0));
            }
            return DoubleYZRoom.lIlIIllIIlllIl[0] != 0;
        }
        
        public DoubleYZRoom() {
        }
        
        private static boolean lllIIlllllIllII(final int lllllllllllllIIIllIIllIlIIlIlIlI, final int lllllllllllllIIIllIIllIlIIlIlIIl) {
            return lllllllllllllIIIllIIllIlIIlIlIlI == lllllllllllllIIIllIIllIlIIlIlIIl;
        }
        
        private static void lllIIlllllIlIII() {
            (lIlIIllIIlllIl = new int[16])[0] = " ".length();
            DoubleYZRoom.lIlIIllIIlllIl[1] = "  ".length();
            DoubleYZRoom.lIlIIllIIlllIl[2] = (157 + 44 - 93 + 79 ^ 15 + 128 - 74 + 93);
            DoubleYZRoom.lIlIIllIIlllIl[3] = ((0x61 ^ 0x36) & ~(0x48 ^ 0x1F));
            DoubleYZRoom.lIlIIllIIlllIl[4] = (0xB ^ 0x41 ^ (0xCF ^ 0x8D));
            DoubleYZRoom.lIlIIllIIlllIl[5] = (0xB2 ^ 0xB4);
            DoubleYZRoom.lIlIIllIIlllIl[6] = (0xA1 ^ 0xA6);
            DoubleYZRoom.lIlIIllIIlllIl[7] = (0x5A ^ 0x54);
            DoubleYZRoom.lIlIIllIIlllIl[8] = (42 + 69 - 14 + 104 ^ 173 + 7 - 162 + 180);
            DoubleYZRoom.lIlIIllIIlllIl[9] = "   ".length();
            DoubleYZRoom.lIlIIllIIlllIl[10] = (0x46 ^ 0x42);
            DoubleYZRoom.lIlIIllIIlllIl[11] = (0x34 ^ 0x3F);
            DoubleYZRoom.lIlIIllIIlllIl[12] = (63 + 41 - 60 + 92 ^ 79 + 58 - 106 + 101);
            DoubleYZRoom.lIlIIllIIlllIl[13] = (0x38 ^ 0x3D);
            DoubleYZRoom.lIlIIllIIlllIl[14] = (0x97 ^ 0x9D);
            DoubleYZRoom.lIlIIllIIlllIl[15] = (44 + 87 - 25 + 55 ^ 161 + 103 - 243 + 151);
        }
    }
    
    public abstract static class Piece extends StructureComponent
    {
        protected static final /* synthetic */ IBlockState field_175827_c;
        protected static final /* synthetic */ IBlockState field_175825_e;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        protected static final /* synthetic */ IBlockState field_175828_a;
        protected static final /* synthetic */ int field_175832_i;
        protected static final /* synthetic */ int field_175829_j;
        protected static final /* synthetic */ int field_175831_h;
        protected static final /* synthetic */ IBlockState field_175826_b;
        protected static final /* synthetic */ IBlockState field_175824_d;
        protected static final /* synthetic */ IBlockState field_175822_f;
        private static final /* synthetic */ int[] llIllIllIllIlI;
        protected static final /* synthetic */ int field_175823_g;
        protected /* synthetic */ RoomDefinition field_175830_k;
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIIllIIlIIlIIlIIIl) {
        }
        
        private static boolean lIIllIIIIlIlIIlI(final Object llllllllllllIllIIllIIIlllllIIIIl) {
            return llllllllllllIllIIllIIIlllllIIIIl != null;
        }
        
        private static boolean lIIllIIIIlIIllIl(final Object llllllllllllIllIIllIIIlllllIlIII, final Object llllllllllllIllIIllIIIlllllIIlll) {
            return llllllllllllIllIIllIIIlllllIlIII != llllllllllllIllIIllIIIlllllIIlll;
        }
        
        protected boolean func_175818_a(final StructureBoundingBox llllllllllllIllIIllIIlIIIIIllIll, final int llllllllllllIllIIllIIlIIIIlIIlII, final int llllllllllllIllIIllIIlIIIIIllIIl, final int llllllllllllIllIIllIIlIIIIIllIII, final int llllllllllllIllIIllIIlIIIIIlIlll) {
            final int llllllllllllIllIIllIIlIIIIlIIIII = this.getXWithOffset(llllllllllllIllIIllIIlIIIIlIIlII, llllllllllllIllIIllIIlIIIIIllIIl);
            final int llllllllllllIllIIllIIlIIIIIlllll = this.getZWithOffset(llllllllllllIllIIllIIlIIIIlIIlII, llllllllllllIllIIllIIlIIIIIllIIl);
            final int llllllllllllIllIIllIIlIIIIIllllI = this.getXWithOffset(llllllllllllIllIIllIIlIIIIIllIII, llllllllllllIllIIllIIlIIIIIlIlll);
            final int llllllllllllIllIIllIIlIIIIIlllIl = this.getZWithOffset(llllllllllllIllIIllIIlIIIIIllIII, llllllllllllIllIIllIIlIIIIIlIlll);
            return llllllllllllIllIIllIIlIIIIIllIll.intersectsWith(Math.min(llllllllllllIllIIllIIlIIIIlIIIII, llllllllllllIllIIllIIlIIIIIllllI), Math.min(llllllllllllIllIIllIIlIIIIIlllll, llllllllllllIllIIllIIlIIIIIlllIl), Math.max(llllllllllllIllIIllIIlIIIIlIIIII, llllllllllllIllIIllIIlIIIIIllllI), Math.max(llllllllllllIllIIllIIlIIIIIlllll, llllllllllllIllIIllIIlIIIIIlllIl));
        }
        
        private static void lIIllIIIIlIIllII() {
            (llIllIllIllIlI = new int[9])[0] = "  ".length();
            Piece.llIllIllIllIlI[1] = ((138 + 177 - 139 + 75 ^ 160 + 98 - 83 + 9) & (0x3C ^ 0x58 ^ (0x12 ^ 0x35) ^ -" ".length()));
            Piece.llIllIllIllIlI[2] = " ".length();
            Piece.llIllIllIllIlI[3] = (0xBB ^ 0xBF);
            Piece.llIllIllIllIlI[4] = (0xB9 ^ 0x84 ^ (0x54 ^ 0x70));
            Piece.llIllIllIllIlI[5] = (0xC6 ^ 0x80 ^ (0x20 ^ 0x63));
            Piece.llIllIllIllIlI[6] = (0x25 ^ 0x2D);
            Piece.llIllIllIllIlI[7] = "   ".length();
            Piece.llIllIllIllIlI[8] = (84 + 89 - 170 + 152 ^ 39 + 88 - 61 + 91);
        }
        
        protected void func_175821_a(final World llllllllllllIllIIllIIlIIIlIlllII, final StructureBoundingBox llllllllllllIllIIllIIlIIIllIIIIl, final int llllllllllllIllIIllIIlIIIllIIIII, final int llllllllllllIllIIllIIlIIIlIlllll, final boolean llllllllllllIllIIllIIlIIIlIllllI) {
            if (lIIllIIIIlIIlllI(llllllllllllIllIIllIIlIIIlIllllI ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[0], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], Piece.field_175828_a, Piece.field_175828_a, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[5], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], Piece.field_175828_a, Piece.field_175828_a, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[7], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[3], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[0], Piece.field_175828_a, Piece.field_175828_a, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[7], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[5], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[3], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], Piece.field_175828_a, Piece.field_175828_a, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[7], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[0], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[3], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[0], Piece.field_175826_b, Piece.field_175826_b, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[7], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[5], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[3], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[5], Piece.field_175826_b, Piece.field_175826_b, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[0], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[7], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[0], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[3], Piece.field_175826_b, Piece.field_175826_b, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[5], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[7], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[5], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[3], Piece.field_175826_b, Piece.field_175826_b, (boolean)(Piece.llIllIllIllIlI[1] != 0));
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                this.fillWithBlocks(llllllllllllIllIIllIIlIIIlIlllII, llllllllllllIllIIllIIlIIIllIIIIl, llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIllIIIII + Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIIlIlllll + Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], Piece.field_175828_a, Piece.field_175828_a, (boolean)(Piece.llIllIllIllIlI[1] != 0));
            }
        }
        
        protected Piece(final int llllllllllllIllIIllIIlIIlIIllllI, final EnumFacing llllllllllllIllIIllIIlIIlIlIlIII, final RoomDefinition llllllllllllIllIIllIIlIIlIlIIlll, final int llllllllllllIllIIllIIlIIlIIllIll, final int llllllllllllIllIIllIIlIIlIIllIlI, final int llllllllllllIllIIllIIlIIlIIllIIl) {
            super(llllllllllllIllIIllIIlIIlIIllllI);
            this.coordBaseMode = llllllllllllIllIIllIIlIIlIlIlIII;
            this.field_175830_k = llllllllllllIllIIllIIlIIlIlIIlll;
            final int llllllllllllIllIIllIIlIIlIlIIIll = llllllllllllIllIIllIIlIIlIlIIlll.field_175967_a;
            final int llllllllllllIllIIllIIlIIlIlIIIlI = llllllllllllIllIIllIIlIIlIlIIIll % Piece.llIllIllIllIlI[5];
            final int llllllllllllIllIIllIIlIIlIlIIIIl = llllllllllllIllIIllIIlIIlIlIIIll / Piece.llIllIllIllIlI[5] % Piece.llIllIllIllIlI[5];
            final int llllllllllllIllIIllIIlIIlIlIIIII = llllllllllllIllIIllIIlIIlIlIIIll / Piece.llIllIllIllIlI[4];
            if (lIIllIIIIlIIllIl(llllllllllllIllIIllIIlIIlIlIlIII, EnumFacing.NORTH) && lIIllIIIIlIIllIl(llllllllllllIllIIllIIlIIlIlIlIII, EnumFacing.SOUTH)) {
                this.boundingBox = new StructureBoundingBox(Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIlIIllIIl * Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], llllllllllllIllIIllIIlIIlIIllIlI * Piece.llIllIllIllIlI[3] - Piece.llIllIllIllIlI[2], llllllllllllIllIIllIIlIIlIIllIll * Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2]);
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            else {
                this.boundingBox = new StructureBoundingBox(Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[1], llllllllllllIllIIllIIlIIlIIllIll * Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2], llllllllllllIllIIllIIlIIlIIllIlI * Piece.llIllIllIllIlI[3] - Piece.llIllIllIllIlI[2], llllllllllllIllIIllIIlIIlIIllIIl * Piece.llIllIllIllIlI[6] - Piece.llIllIllIllIlI[2]);
            }
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIllIIllIIlIIlIlIlIII.ordinal()]) {
                case 3: {
                    this.boundingBox.offset(llllllllllllIllIIllIIlIIlIlIIIlI * Piece.llIllIllIllIlI[6], llllllllllllIllIIllIIlIIlIlIIIII * Piece.llIllIllIllIlI[3], -(llllllllllllIllIIllIIlIIlIlIIIIl + llllllllllllIllIIllIIlIIlIIllIIl) * Piece.llIllIllIllIlI[6] + Piece.llIllIllIllIlI[2]);
                    "".length();
                    if (((0x35 ^ 0x7F) & ~(0xFE ^ 0xB4)) != 0x0) {
                        throw null;
                    }
                    break;
                }
                case 4: {
                    this.boundingBox.offset(llllllllllllIllIIllIIlIIlIlIIIlI * Piece.llIllIllIllIlI[6], llllllllllllIllIIllIIlIIlIlIIIII * Piece.llIllIllIllIlI[3], llllllllllllIllIIllIIlIIlIlIIIIl * Piece.llIllIllIllIlI[6]);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        throw null;
                    }
                    break;
                }
                case 5: {
                    this.boundingBox.offset(-(llllllllllllIllIIllIIlIIlIlIIIIl + llllllllllllIllIIllIIlIIlIIllIIl) * Piece.llIllIllIllIlI[6] + Piece.llIllIllIllIlI[2], llllllllllllIllIIllIIlIIlIlIIIII * Piece.llIllIllIllIlI[3], llllllllllllIllIIllIIlIIlIlIIIlI * Piece.llIllIllIllIlI[6]);
                    "".length();
                    if (-"   ".length() >= 0) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.boundingBox.offset(llllllllllllIllIIllIIlIIlIlIIIIl * Piece.llIllIllIllIlI[6], llllllllllllIllIIllIIlIIlIlIIIII * Piece.llIllIllIllIlI[3], llllllllllllIllIIllIIlIIlIlIIIlI * Piece.llIllIllIllIlI[6]);
                    break;
                }
            }
        }
        
        protected boolean func_175817_a(final World llllllllllllIllIIllIIIllllllllIl, final StructureBoundingBox llllllllllllIllIIllIIIllllllllII, final int llllllllllllIllIIllIIIlllllllIll, final int llllllllllllIllIIllIIIlllllllIlI, final int llllllllllllIllIIllIIlIIIIIIIIll) {
            final int llllllllllllIllIIllIIlIIIIIIIIlI = this.getXWithOffset(llllllllllllIllIIllIIIlllllllIll, llllllllllllIllIIllIIlIIIIIIIIll);
            final int llllllllllllIllIIllIIlIIIIIIIIIl = this.getYWithOffset(llllllllllllIllIIllIIIlllllllIlI);
            final int llllllllllllIllIIllIIlIIIIIIIIII = this.getZWithOffset(llllllllllllIllIIllIIIlllllllIll, llllllllllllIllIIllIIlIIIIIIIIll);
            if (lIIllIIIIlIIlllI(llllllllllllIllIIllIIIllllllllII.isVecInside(new BlockPos(llllllllllllIllIIllIIlIIIIIIIIlI, llllllllllllIllIIllIIlIIIIIIIIIl, llllllllllllIllIIllIIlIIIIIIIIII)) ? 1 : 0)) {
                final EntityGuardian llllllllllllIllIIllIIIllllllllll = new EntityGuardian(llllllllllllIllIIllIIIllllllllIl);
                llllllllllllIllIIllIIIllllllllll.setElder((boolean)(Piece.llIllIllIllIlI[2] != 0));
                llllllllllllIllIIllIIIllllllllll.heal(llllllllllllIllIIllIIIllllllllll.getMaxHealth());
                llllllllllllIllIIllIIIllllllllll.setLocationAndAngles(llllllllllllIllIIllIIlIIIIIIIIlI + 0.5, llllllllllllIllIIllIIlIIIIIIIIIl, llllllllllllIllIIllIIlIIIIIIIIII + 0.5, 0.0f, 0.0f);
                llllllllllllIllIIllIIIllllllllll.onInitialSpawn(llllllllllllIllIIllIIIllllllllIl.getDifficultyForLocation(new BlockPos(llllllllllllIllIIllIIIllllllllll)), null);
                "".length();
                llllllllllllIllIIllIIIllllllllIl.spawnEntityInWorld(llllllllllllIllIIllIIIllllllllll);
                "".length();
                return Piece.llIllIllIllIlI[2] != 0;
            }
            return Piece.llIllIllIllIlI[1] != 0;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Piece.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIllIIIIlIlIIlI($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final Exception llllllllllllIllIIllIIIllllllIIll = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIllIIllIIIllllllIIll[EnumFacing.DOWN.ordinal()] = Piece.llIllIllIllIlI[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIllIIllIIIllllllIIll[EnumFacing.EAST.ordinal()] = Piece.llIllIllIllIlI[8];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIllIIllIIIllllllIIll[EnumFacing.NORTH.ordinal()] = Piece.llIllIllIllIlI[7];
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIllIIllIIIllllllIIll[EnumFacing.SOUTH.ordinal()] = Piece.llIllIllIllIlI[3];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIllIIllIIIllllllIIll[EnumFacing.UP.ordinal()] = Piece.llIllIllIllIlI[0];
                "".length();
                if ((0x29 ^ 0x2C) <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIllIIllIIIllllllIIll[EnumFacing.WEST.ordinal()] = Piece.llIllIllIllIlI[5];
                "".length();
                if ((162 + 51 - 145 + 119 ^ 130 + 118 - 179 + 122) < 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Piece.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIllIIllIIIllllllIIll;
        }
        
        private static boolean lIIllIIIIlIIlllI(final int llllllllllllIllIIllIIIllllIlllll) {
            return llllllllllllIllIIllIIIllllIlllll != 0;
        }
        
        private static boolean lIIllIIIIlIIllll(final int llllllllllllIllIIllIIIllllllIIII, final int llllllllllllIllIIllIIIlllllIllll) {
            return llllllllllllIllIIllIIIllllllIIII >= llllllllllllIllIIllIIIlllllIllll;
        }
        
        public Piece(final int llllllllllllIllIIllIIlIIllIIIIIl) {
            super(llllllllllllIllIIllIIlIIllIIIIIl);
        }
        
        protected static final int func_175820_a(final int llllllllllllIllIIllIIlIIllIIlIlI, final int llllllllllllIllIIllIIlIIllIIlIIl, final int llllllllllllIllIIllIIlIIllIIlIII) {
            return llllllllllllIllIIllIIlIIllIIlIIl * Piece.llIllIllIllIlI[4] + llllllllllllIllIIllIIlIIllIIlIII * Piece.llIllIllIllIlI[5] + llllllllllllIllIIllIIlIIllIIlIlI;
        }
        
        protected void func_181655_a(final World llllllllllllIllIIllIIlIIIlllIlIl, final StructureBoundingBox llllllllllllIllIIllIIlIIlIIIIIIl, final int llllllllllllIllIIllIIlIIlIIIIIII, final int llllllllllllIllIIllIIlIIIlllIIlI, final int llllllllllllIllIIllIIlIIIllllllI, final int llllllllllllIllIIllIIlIIIlllllIl, final int llllllllllllIllIIllIIlIIIllIllll, final int llllllllllllIllIIllIIlIIIllllIll, final boolean llllllllllllIllIIllIIlIIIllllIlI) {
            int llllllllllllIllIIllIIlIIIllllIIl = llllllllllllIllIIllIIlIIIlllIIlI;
            "".length();
            if (" ".length() == 0) {
                return;
            }
            while (!lIIllIIIIlIlIIII(llllllllllllIllIIllIIlIIIllllIIl, llllllllllllIllIIllIIlIIIllIllll)) {
                int llllllllllllIllIIllIIlIIIllllIII = llllllllllllIllIIllIIlIIlIIIIIII;
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIllIIIIlIlIIII(llllllllllllIllIIllIIlIIIllllIII, llllllllllllIllIIllIIlIIIlllllIl)) {
                    int llllllllllllIllIIllIIlIIIlllIlll = llllllllllllIllIIllIIlIIIllllllI;
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                    while (!lIIllIIIIlIlIIII(llllllllllllIllIIllIIlIIIlllIlll, llllllllllllIllIIllIIlIIIllllIll)) {
                        if (!lIIllIIIIlIIlllI(llllllllllllIllIIllIIlIIIllllIlI ? 1 : 0) || lIIllIIIIlIIllIl(this.getBlockStateFromPos(llllllllllllIllIIllIIlIIIlllIlIl, llllllllllllIllIIllIIlIIIllllIII, llllllllllllIllIIllIIlIIIllllIIl, llllllllllllIllIIllIIlIIIlllIlll, llllllllllllIllIIllIIlIIlIIIIIIl).getBlock().getMaterial(), Material.air)) {
                            if (lIIllIIIIlIIllll(this.getYWithOffset(llllllllllllIllIIllIIlIIIllllIIl), llllllllllllIllIIllIIlIIIlllIlIl.func_181545_F())) {
                                this.setBlockState(llllllllllllIllIIllIIlIIIlllIlIl, Blocks.air.getDefaultState(), llllllllllllIllIIllIIlIIIllllIII, llllllllllllIllIIllIIlIIIllllIIl, llllllllllllIllIIllIIlIIIlllIlll, llllllllllllIllIIllIIlIIlIIIIIIl);
                                "".length();
                                if (" ".length() < -" ".length()) {
                                    return;
                                }
                            }
                            else {
                                this.setBlockState(llllllllllllIllIIllIIlIIIlllIlIl, Piece.field_175822_f, llllllllllllIllIIllIIlIIIllllIII, llllllllllllIllIIllIIlIIIllllIIl, llllllllllllIllIIllIIlIIIlllIlll, llllllllllllIllIIllIIlIIlIIIIIIl);
                            }
                        }
                        ++llllllllllllIllIIllIIlIIIlllIlll;
                    }
                    ++llllllllllllIllIIllIIlIIIllllIII;
                }
                ++llllllllllllIllIIllIIlIIIllllIIl;
            }
        }
        
        private static boolean lIIllIIIIlIlIIIl(final Object llllllllllllIllIIllIIIlllllIIlII, final Object llllllllllllIllIIllIIIlllllIIIll) {
            return llllllllllllIllIIllIIIlllllIIlII == llllllllllllIllIIllIIIlllllIIIll;
        }
        
        protected void func_175819_a(final World llllllllllllIllIIllIIlIIIIllllII, final StructureBoundingBox llllllllllllIllIIllIIlIIIlIIlIII, final int llllllllllllIllIIllIIlIIIIlllIlI, final int llllllllllllIllIIllIIlIIIlIIIllI, final int llllllllllllIllIIllIIlIIIlIIIlIl, final int llllllllllllIllIIllIIlIIIlIIIlII, final int llllllllllllIllIIllIIlIIIlIIIIll, final int llllllllllllIllIIllIIlIIIlIIIIlI, final IBlockState llllllllllllIllIIllIIlIIIlIIIIIl) {
            int llllllllllllIllIIllIIlIIIlIIIIII = llllllllllllIllIIllIIlIIIlIIIllI;
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIllIIIIlIlIIII(llllllllllllIllIIllIIlIIIlIIIIII, llllllllllllIllIIllIIlIIIlIIIIll)) {
                int llllllllllllIllIIllIIlIIIIllllll = llllllllllllIllIIllIIlIIIIlllIlI;
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIllIIIIlIlIIII(llllllllllllIllIIllIIlIIIIllllll, llllllllllllIllIIllIIlIIIlIIIlII)) {
                    int llllllllllllIllIIllIIlIIIIlllllI = llllllllllllIllIIllIIlIIIlIIIlIl;
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                    while (!lIIllIIIIlIlIIII(llllllllllllIllIIllIIlIIIIlllllI, llllllllllllIllIIllIIlIIIlIIIIlI)) {
                        if (lIIllIIIIlIlIIIl(this.getBlockStateFromPos(llllllllllllIllIIllIIlIIIIllllII, llllllllllllIllIIllIIlIIIIllllll, llllllllllllIllIIllIIlIIIlIIIIII, llllllllllllIllIIllIIlIIIIlllllI, llllllllllllIllIIllIIlIIIlIIlIII), Piece.field_175822_f)) {
                            this.setBlockState(llllllllllllIllIIllIIlIIIIllllII, llllllllllllIllIIllIIlIIIlIIIIIl, llllllllllllIllIIllIIlIIIIllllll, llllllllllllIllIIllIIlIIIlIIIIII, llllllllllllIllIIllIIlIIIIlllllI, llllllllllllIllIIllIIlIIIlIIlIII);
                        }
                        ++llllllllllllIllIIllIIlIIIIlllllI;
                    }
                    ++llllllllllllIllIIllIIlIIIIllllll;
                }
                ++llllllllllllIllIIllIIlIIIlIIIIII;
            }
        }
        
        static {
            lIIllIIIIlIIllII();
            field_175828_a = Blocks.prismarine.getStateFromMeta(BlockPrismarine.ROUGH_META);
            field_175826_b = Blocks.prismarine.getStateFromMeta(BlockPrismarine.BRICKS_META);
            field_175827_c = Blocks.prismarine.getStateFromMeta(BlockPrismarine.DARK_META);
            field_175824_d = Piece.field_175826_b;
            field_175825_e = Blocks.sea_lantern.getDefaultState();
            field_175822_f = Blocks.water.getDefaultState();
            field_175823_g = func_175820_a(Piece.llIllIllIllIlI[0], Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[1]);
            field_175831_h = func_175820_a(Piece.llIllIllIllIlI[0], Piece.llIllIllIllIlI[0], Piece.llIllIllIllIlI[1]);
            field_175832_i = func_175820_a(Piece.llIllIllIllIlI[1], Piece.llIllIllIllIlI[2], Piece.llIllIllIllIlI[1]);
            field_175829_j = func_175820_a(Piece.llIllIllIllIlI[3], Piece.llIllIllIllIlI[2], Piece.llIllIllIllIlI[1]);
        }
        
        public Piece(final EnumFacing llllllllllllIllIIllIIlIIlIllIlll, final StructureBoundingBox llllllllllllIllIIllIIlIIlIlllIIl) {
            super(Piece.llIllIllIllIlI[2]);
            this.coordBaseMode = llllllllllllIllIIllIIlIIlIllIlll;
            this.boundingBox = llllllllllllIllIIllIIlIIlIlllIIl;
        }
        
        private static boolean lIIllIIIIlIlIIII(final int llllllllllllIllIIllIIIlllllIllII, final int llllllllllllIllIIllIIIlllllIlIll) {
            return llllllllllllIllIIllIIIlllllIllII > llllllllllllIllIIllIIIlllllIlIll;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIIllIIlIIlIIlIIll) {
        }
        
        public Piece() {
            super(Piece.llIllIllIllIlI[1]);
        }
    }
    
    static class RoomDefinition
    {
        /* synthetic */ boolean field_175963_d;
        /* synthetic */ boolean[] field_175966_c;
        /* synthetic */ int field_175967_a;
        /* synthetic */ boolean field_175964_e;
        /* synthetic */ int field_175962_f;
        private static final /* synthetic */ int[] lIlIIIlIIllllI;
        /* synthetic */ RoomDefinition[] field_175965_b;
        
        private static boolean lllIIIlIlIlIlll(final int lllllllllllllIIIlllllIlIlIllIllI, final int lllllllllllllIIIlllllIlIlIllIlIl) {
            return lllllllllllllIIIlllllIlIlIllIllI >= lllllllllllllIIIlllllIlIlIllIlIl;
        }
        
        private static boolean lllIIIlIlIllIII(final int lllllllllllllIIIlllllIlIlIllIIIl) {
            return lllllllllllllIIIlllllIlIlIllIIIl != 0;
        }
        
        public boolean func_175959_a(final int lllllllllllllIIIlllllIlIllIIIllI) {
            if (lllIIIlIlIllIII(this.field_175964_e ? 1 : 0)) {
                return RoomDefinition.lIlIIIlIIllllI[2] != 0;
            }
            this.field_175962_f = lllllllllllllIIIlllllIlIllIIIllI;
            int lllllllllllllIIIlllllIlIllIIlIII = RoomDefinition.lIlIIIlIIllllI[1];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x1B ^ 0x5) & ~(0xB2 ^ 0xAC)) != 0x0;
            }
            while (!lllIIIlIlIlIlll(lllllllllllllIIIlllllIlIllIIlIII, RoomDefinition.lIlIIIlIIllllI[0])) {
                if (lllIIIlIlIlIllI(this.field_175965_b[lllllllllllllIIIlllllIlIllIIlIII]) && lllIIIlIlIllIII(this.field_175966_c[lllllllllllllIIIlllllIlIllIIlIII] ? 1 : 0) && lllIIIlIlIllIIl(this.field_175965_b[lllllllllllllIIIlllllIlIllIIlIII].field_175962_f, lllllllllllllIIIlllllIlIllIIIllI) && lllIIIlIlIllIII(this.field_175965_b[lllllllllllllIIIlllllIlIllIIlIII].func_175959_a(lllllllllllllIIIlllllIlIllIIIllI) ? 1 : 0)) {
                    return RoomDefinition.lIlIIIlIIllllI[2] != 0;
                }
                ++lllllllllllllIIIlllllIlIllIIlIII;
            }
            return RoomDefinition.lIlIIIlIIllllI[1] != 0;
        }
        
        public boolean func_175961_b() {
            if (lllIIIlIlIlIlll(this.field_175967_a, RoomDefinition.lIlIIIlIIllllI[3])) {
                return RoomDefinition.lIlIIIlIIllllI[2] != 0;
            }
            return RoomDefinition.lIlIIIlIIllllI[1] != 0;
        }
        
        public RoomDefinition(final int lllllllllllllIIIlllllIlIllIlllll) {
            this.field_175965_b = new RoomDefinition[RoomDefinition.lIlIIIlIIllllI[0]];
            this.field_175966_c = new boolean[RoomDefinition.lIlIIIlIIllllI[0]];
            this.field_175967_a = lllllllllllllIIIlllllIlIllIlllll;
        }
        
        static {
            lllIIIlIlIlIlIl();
        }
        
        private static void lllIIIlIlIlIlIl() {
            (lIlIIIlIIllllI = new int[4])[0] = (48 + 99 - 16 + 3 ^ 42 + 13 + 54 + 19);
            RoomDefinition.lIlIIIlIIllllI[1] = ((0xC2 ^ 0x90) & ~(0x15 ^ 0x47));
            RoomDefinition.lIlIIIlIIllllI[2] = " ".length();
            RoomDefinition.lIlIIIlIIllllI[3] = (0x74 ^ 0x3F);
        }
        
        public void func_175957_a(final EnumFacing lllllllllllllIIIlllllIlIllIllIII, final RoomDefinition lllllllllllllIIIlllllIlIllIlIlll) {
            this.field_175965_b[lllllllllllllIIIlllllIlIllIllIII.getIndex()] = lllllllllllllIIIlllllIlIllIlIlll;
            lllllllllllllIIIlllllIlIllIlIlll.field_175965_b[lllllllllllllIIIlllllIlIllIllIII.getOpposite().getIndex()] = this;
        }
        
        private static boolean lllIIIlIlIlIllI(final Object lllllllllllllIIIlllllIlIlIllIIll) {
            return lllllllllllllIIIlllllIlIlIllIIll != null;
        }
        
        private static boolean lllIIIlIlIllIIl(final int lllllllllllllIIIlllllIlIlIlIlllI, final int lllllllllllllIIIlllllIlIlIlIllIl) {
            return lllllllllllllIIIlllllIlIlIlIlllI != lllllllllllllIIIlllllIlIlIlIllIl;
        }
        
        public int func_175960_c() {
            int lllllllllllllIIIlllllIlIlIllllIl = RoomDefinition.lIlIIIlIIllllI[1];
            int lllllllllllllIIIlllllIlIlIllllII = RoomDefinition.lIlIIIlIIllllI[1];
            "".length();
            if ("   ".length() < 0) {
                return (166 + 129 - 111 + 58 ^ 16 + 90 - 46 + 114) & (0x2A ^ 0x26 ^ (0xD1 ^ 0x81) ^ -" ".length());
            }
            while (!lllIIIlIlIlIlll(lllllllllllllIIIlllllIlIlIllllII, RoomDefinition.lIlIIIlIIllllI[0])) {
                if (lllIIIlIlIllIII(this.field_175966_c[lllllllllllllIIIlllllIlIlIllllII] ? 1 : 0)) {
                    ++lllllllllllllIIIlllllIlIlIllllIl;
                }
                ++lllllllllllllIIIlllllIlIlIllllII;
            }
            return lllllllllllllIIIlllllIlIlIllllIl;
        }
        
        public void func_175958_a() {
            int lllllllllllllIIIlllllIlIllIlIIII = RoomDefinition.lIlIIIlIIllllI[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lllIIIlIlIlIlll(lllllllllllllIIIlllllIlIllIlIIII, RoomDefinition.lIlIIIlIIllllI[0])) {
                final boolean[] field_175966_c = this.field_175966_c;
                final int n = lllllllllllllIIIlllllIlIllIlIIII;
                int n2;
                if (lllIIIlIlIlIllI(this.field_175965_b[lllllllllllllIIIlllllIlIllIlIIII])) {
                    n2 = RoomDefinition.lIlIIIlIIllllI[2];
                    "".length();
                    if ((133 + 5 - 92 + 133 ^ 52 + 132 - 55 + 54) == 0x0) {
                        return;
                    }
                }
                else {
                    n2 = RoomDefinition.lIlIIIlIIllllI[1];
                }
                field_175966_c[n] = (n2 != 0);
                ++lllllllllllllIIIlllllIlIllIlIIII;
            }
        }
    }
    
    interface MonumentRoomFitHelper
    {
        boolean func_175969_a(final RoomDefinition p0);
        
        Piece func_175968_a(final EnumFacing p0, final RoomDefinition p1, final Random p2);
    }
    
    static class XYDoubleRoomFitHelper implements MonumentRoomFitHelper
    {
        private static final /* synthetic */ int[] lIlIIIlllIIIII;
        
        private static boolean lllIIlIIIIIIIII(final int lllllllllllllIIIlllIllllllIlIIlI) {
            return lllllllllllllIIIlllIllllllIlIIlI == 0;
        }
        
        static {
            lllIIIllllllllI();
        }
        
        @Override
        public boolean func_175969_a(final RoomDefinition lllllllllllllIIIlllIlllllllIIIll) {
            if (!lllIIIlllllllll(lllllllllllllIIIlllIlllllllIIIll.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0) || !lllIIlIIIIIIIII(lllllllllllllIIIlllIlllllllIIIll.field_175965_b[EnumFacing.EAST.getIndex()].field_175963_d ? 1 : 0) || !lllIIIlllllllll(lllllllllllllIIIlllIlllllllIIIll.field_175966_c[EnumFacing.UP.getIndex()] ? 1 : 0) || !lllIIlIIIIIIIII(lllllllllllllIIIlllIlllllllIIIll.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d ? 1 : 0)) {
                return XYDoubleRoomFitHelper.lIlIIIlllIIIII[1] != 0;
            }
            final RoomDefinition lllllllllllllIIIlllIlllllllIIlII = lllllllllllllIIIlllIlllllllIIIll.field_175965_b[EnumFacing.EAST.getIndex()];
            if (lllIIIlllllllll(lllllllllllllIIIlllIlllllllIIlII.field_175966_c[EnumFacing.UP.getIndex()] ? 1 : 0) && lllIIlIIIIIIIII(lllllllllllllIIIlllIlllllllIIlII.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d ? 1 : 0)) {
                return XYDoubleRoomFitHelper.lIlIIIlllIIIII[0] != 0;
            }
            return XYDoubleRoomFitHelper.lIlIIIlllIIIII[1] != 0;
        }
        
        @Override
        public Piece func_175968_a(final EnumFacing lllllllllllllIIIlllIllllllIllIlI, final RoomDefinition lllllllllllllIIIlllIllllllIlllII, final Random lllllllllllllIIIlllIllllllIllIII) {
            lllllllllllllIIIlllIllllllIlllII.field_175963_d = (XYDoubleRoomFitHelper.lIlIIIlllIIIII[0] != 0);
            lllllllllllllIIIlllIllllllIlllII.field_175965_b[EnumFacing.EAST.getIndex()].field_175963_d = (XYDoubleRoomFitHelper.lIlIIIlllIIIII[0] != 0);
            lllllllllllllIIIlllIllllllIlllII.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (XYDoubleRoomFitHelper.lIlIIIlllIIIII[0] != 0);
            lllllllllllllIIIlllIllllllIlllII.field_175965_b[EnumFacing.EAST.getIndex()].field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (XYDoubleRoomFitHelper.lIlIIIlllIIIII[0] != 0);
            return new DoubleXYRoom(lllllllllllllIIIlllIllllllIllIlI, lllllllllllllIIIlllIllllllIlllII, lllllllllllllIIIlllIllllllIllIII);
        }
        
        private static void lllIIIllllllllI() {
            (lIlIIIlllIIIII = new int[2])[0] = " ".length();
            XYDoubleRoomFitHelper.lIlIIIlllIIIII[1] = ((49 + 50 + 27 + 59 ^ 90 + 50 - 88 + 77) & (0x44 ^ 0x3F ^ (0x77 ^ 0x34) ^ -" ".length()));
        }
        
        private XYDoubleRoomFitHelper() {
        }
        
        private static boolean lllIIIlllllllll(final int lllllllllllllIIIlllIllllllIlIlII) {
            return lllllllllllllIIIlllIllllllIlIlII != 0;
        }
    }
    
    public static class DoubleXYRoom extends Piece
    {
        private static final /* synthetic */ int[] llIlIlIIlIIlII;
        
        private static boolean lIIlIIllllIIlIlI(final int llllllllllllIllIlIlIllIllIllIllI, final int llllllllllllIllIlIlIllIllIllIlIl) {
            return llllllllllllIllIlIlIllIllIllIllI != llllllllllllIllIlIlIllIllIllIlIl;
        }
        
        private static boolean lIIlIIllllIIlIII(final int llllllllllllIllIlIlIllIllIlllIIl) {
            return llllllllllllIllIlIlIllIllIlllIIl > 0;
        }
        
        private static boolean lIIlIIllllIIllIl(final int llllllllllllIllIlIlIllIllIlllIll) {
            return llllllllllllIllIlIlIllIllIlllIll != 0;
        }
        
        static {
            lIIlIIllllIIIlll();
        }
        
        private static boolean lIIlIIllllIIlIll(final int llllllllllllIllIlIlIllIlllIIIlII, final int llllllllllllIllIlIlIllIlllIIIIll) {
            return llllllllllllIllIlIlIllIlllIIIlII == llllllllllllIllIlIlIllIlllIIIIll;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIlIlIllIlllIllIII, final Random llllllllllllIllIlIlIllIlllIlIlll, final StructureBoundingBox llllllllllllIllIlIlIllIlllIIllIl) {
            final RoomDefinition llllllllllllIllIlIlIllIlllIlIlIl = this.field_175830_k.field_175965_b[EnumFacing.EAST.getIndex()];
            final RoomDefinition llllllllllllIllIlIlIllIlllIlIlII = this.field_175830_k;
            final RoomDefinition llllllllllllIllIlIlIllIlllIlIIll = llllllllllllIllIlIlIllIlllIlIlII.field_175965_b[EnumFacing.UP.getIndex()];
            final RoomDefinition llllllllllllIllIlIlIllIlllIlIIlI = llllllllllllIllIlIlIllIlllIlIlIl.field_175965_b[EnumFacing.UP.getIndex()];
            if (lIIlIIllllIIlIII(this.field_175830_k.field_175967_a / DoubleXYRoom.llIlIlIIlIIlII[2])) {
                this.func_175821_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[3], DoubleXYRoom.llIlIlIIlIIlII[4], llllllllllllIllIlIlIllIlllIlIlIl.field_175966_c[EnumFacing.DOWN.getIndex()]);
                this.func_175821_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[4], llllllllllllIllIlIlIllIlllIlIlII.field_175966_c[EnumFacing.DOWN.getIndex()]);
            }
            if (lIIlIIllllIIlIIl(llllllllllllIllIlIlIllIlllIlIIll.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[3], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[3], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.field_175828_a);
            }
            if (lIIlIIllllIIlIIl(llllllllllllIllIlIlIllIlllIlIIlI.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[3], DoubleXYRoom.llIlIlIIlIIlII[3], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[7], DoubleXYRoom.llIlIlIIlIIlII[3], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.field_175828_a);
            }
            int llllllllllllIllIlIlIllIlllIlIIIl = DoubleXYRoom.llIlIlIIlIIlII[0];
            "".length();
            if ("  ".length() <= 0) {
                return ((0xDE ^ 0xB3 ^ (0x77 ^ 0x2D)) & (146 + 25 - 142 + 214 ^ 92 + 19 + 84 + 1 ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIllllIIllII(llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[5])) {
                IBlockState llllllllllllIllIlIlIllIlllIlIIII = DoubleXYRoom.field_175826_b;
                if (!lIIlIIllllIIlIlI(llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[1]) || lIIlIIllllIIlIll(llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[6])) {
                    llllllllllllIllIlIlIllIlllIlIIII = DoubleXYRoom.field_175828_a;
                }
                this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[4], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[4], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[5], llllllllllllIllIlIlIllIlllIlIIII, llllllllllllIllIlIlIllIlllIlIIII, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
                this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[8], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[8], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[5], llllllllllllIllIlIlIllIlllIlIIII, llllllllllllIllIlIlIllIlllIlIIII, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
                this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[0], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[8], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[4], llllllllllllIllIlIlIllIlllIlIIII, llllllllllllIllIlIlIllIlllIlIIII, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
                this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[0], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[7], llllllllllllIllIlIlIllIlllIlIIIl, DoubleXYRoom.llIlIlIIlIIlII[5], llllllllllllIllIlIlIllIlllIlIIII, llllllllllllIllIlIlIllIlllIlIIII, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
                ++llllllllllllIllIlIlIllIlllIlIIIl;
            }
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[12], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[12], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[13], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[14], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[13], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[14], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175826_b, DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[1], llllllllllllIllIlIlIllIlllIIllIl);
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175826_b, DoubleXYRoom.llIlIlIIlIIlII[16], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[1], llllllllllllIllIlIlIllIlllIIllIl);
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175826_b, DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[11], llllllllllllIllIlIlIllIlllIIllIl);
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175826_b, DoubleXYRoom.llIlIlIIlIIlII[16], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[11], llllllllllllIllIlIlIllIlllIIllIl);
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.fillWithBlocks(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[16], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.field_175826_b, DoubleXYRoom.field_175826_b, (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175825_e, DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[1], llllllllllllIllIlIlIllIlllIIllIl);
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175825_e, DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[11], llllllllllllIllIlIlIllIlllIIllIl);
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175825_e, DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[1], llllllllllllIllIlIlIllIlllIIllIl);
            this.setBlockState(llllllllllllIllIlIlIllIlllIllIII, DoubleXYRoom.field_175825_e, DoubleXYRoom.llIlIlIIlIIlII[15], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[11], llllllllllllIllIlIlIllIlllIIllIl);
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIlII.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[4], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIlII.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[5], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIlII.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[10], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIlIl.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[13], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[14], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[4], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIlIl.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[13], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[14], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[5], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIlIl.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[8], DoubleXYRoom.llIlIlIIlIIlII[0], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[8], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[10], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIIll.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[4], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIIll.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[10], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[5], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIIll.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[10], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIIlI.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[13], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[4], DoubleXYRoom.llIlIlIIlIIlII[14], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[4], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIIlI.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[13], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[5], DoubleXYRoom.llIlIlIIlIIlII[14], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[5], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            if (lIIlIIllllIIllIl(llllllllllllIllIlIlIllIlllIlIIlI.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIlIllIlllIllIII, llllllllllllIllIlIlIllIlllIIllIl, DoubleXYRoom.llIlIlIIlIIlII[8], DoubleXYRoom.llIlIlIIlIIlII[11], DoubleXYRoom.llIlIlIIlIIlII[9], DoubleXYRoom.llIlIlIIlIIlII[8], DoubleXYRoom.llIlIlIIlIIlII[6], DoubleXYRoom.llIlIlIIlIIlII[10], (boolean)(DoubleXYRoom.llIlIlIIlIIlII[4] != 0));
            }
            return DoubleXYRoom.llIlIlIIlIIlII[0] != 0;
        }
        
        private static boolean lIIlIIllllIIlIIl(final Object llllllllllllIllIlIlIllIllIllllIl) {
            return llllllllllllIllIlIlIllIllIllllIl == null;
        }
        
        private static void lIIlIIllllIIIlll() {
            (llIlIlIIlIIlII = new int[17])[0] = " ".length();
            DoubleXYRoom.llIlIlIIlIIlII[1] = "  ".length();
            DoubleXYRoom.llIlIlIIlIIlII[2] = (41 + 26 + 146 + 8 ^ 78 + 163 - 226 + 181);
            DoubleXYRoom.llIlIlIIlIIlII[3] = (0xDE ^ 0x85 ^ (0x44 ^ 0x17));
            DoubleXYRoom.llIlIlIIlIIlII[4] = ((0x84 ^ 0xB0) & ~(0x33 ^ 0x7));
            DoubleXYRoom.llIlIlIIlIIlII[5] = (0x83 ^ 0x84);
            DoubleXYRoom.llIlIlIIlIIlII[6] = (0x38 ^ 0x5C ^ (0xEC ^ 0x8E));
            DoubleXYRoom.llIlIlIIlIIlII[7] = (0x92 ^ 0xB8 ^ (0xD ^ 0x29));
            DoubleXYRoom.llIlIlIIlIIlII[8] = (0x2C ^ 0x23);
            DoubleXYRoom.llIlIlIIlIIlII[9] = "   ".length();
            DoubleXYRoom.llIlIlIIlIIlII[10] = (0x55 ^ 0x51);
            DoubleXYRoom.llIlIlIIlIIlII[11] = (162 + 118 - 164 + 48 ^ 83 + 30 - 21 + 69);
            DoubleXYRoom.llIlIlIIlIIlII[12] = (0x11 ^ 0x1C);
            DoubleXYRoom.llIlIlIIlIIlII[13] = (0x4B ^ 0x1E ^ (0xA ^ 0x54));
            DoubleXYRoom.llIlIlIIlIIlII[14] = (0x38 ^ 0x34);
            DoubleXYRoom.llIlIlIIlIIlII[15] = (0x27 ^ 0x2D);
            DoubleXYRoom.llIlIlIIlIIlII[16] = (0x14 ^ 0x40 ^ (0xD4 ^ 0x89));
        }
        
        public DoubleXYRoom(final EnumFacing llllllllllllIllIlIlIllIllllIIlII, final RoomDefinition llllllllllllIllIlIlIllIllllIIIll, final Random llllllllllllIllIlIlIllIllllIIllI) {
            super(DoubleXYRoom.llIlIlIIlIIlII[0], llllllllllllIllIlIlIllIllllIIlII, llllllllllllIllIlIlIllIllllIIIll, DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[1], DoubleXYRoom.llIlIlIIlIIlII[0]);
        }
        
        public DoubleXYRoom() {
        }
        
        private static boolean lIIlIIllllIIllII(final int llllllllllllIllIlIlIllIlllIIIIII, final int llllllllllllIllIlIlIllIllIllllll) {
            return llllllllllllIllIlIlIllIlllIIIIII > llllllllllllIllIlIlIllIllIllllll;
        }
    }
    
    static class FitSimpleRoomHelper implements MonumentRoomFitHelper
    {
        private static final /* synthetic */ int[] lllllIllIllII;
        
        @Override
        public Piece func_175968_a(final EnumFacing lllllllllllllIlIlIllIIlIllIIllII, final RoomDefinition lllllllllllllIlIlIllIIlIllIIlIll, final Random lllllllllllllIlIlIllIIlIllIIlIlI) {
            lllllllllllllIlIlIllIIlIllIIlIll.field_175963_d = (FitSimpleRoomHelper.lllllIllIllII[0] != 0);
            return new SimpleRoom(lllllllllllllIlIlIllIIlIllIIllII, lllllllllllllIlIlIllIIlIllIIlIll, lllllllllllllIlIlIllIIlIllIIlIlI);
        }
        
        static {
            lIlIllllIIIIllI();
        }
        
        @Override
        public boolean func_175969_a(final RoomDefinition lllllllllllllIlIlIllIIlIllIlIlII) {
            return FitSimpleRoomHelper.lllllIllIllII[0] != 0;
        }
        
        private static void lIlIllllIIIIllI() {
            (lllllIllIllII = new int[1])[0] = " ".length();
        }
        
        private FitSimpleRoomHelper() {
        }
    }
    
    public static class SimpleRoom extends Piece
    {
        private /* synthetic */ int field_175833_o;
        private static final /* synthetic */ int[] lIIlIlllllIlll;
        
        private static boolean llIlIlIIlIlIlII(final int lllllllllllllIIlIlllllIlllIIlllI) {
            return lllllllllllllIIlIlllllIlllIIlllI > 0;
        }
        
        private static boolean llIlIlIIlIlIlIl(final Object lllllllllllllIIlIlllllIlllIlIlII) {
            return lllllllllllllIIlIlllllIlllIlIlII == null;
        }
        
        private static boolean llIlIlIIlIllIIl(final int lllllllllllllIIlIlllllIlllIllIll, final int lllllllllllllIIlIlllllIlllIllIlI) {
            return lllllllllllllIIlIlllllIlllIllIll == lllllllllllllIIlIlllllIlllIllIlI;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlIlllllIllllIIIIl, final Random lllllllllllllIIlIlllllIllllIIIII, final StructureBoundingBox lllllllllllllIIlIlllllIllllIIlII) {
            if (llIlIlIIlIlIlII(this.field_175830_k.field_175967_a / SimpleRoom.lIIlIlllllIlll[2])) {
                this.func_175821_a(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[3], this.field_175830_k.field_175966_c[EnumFacing.DOWN.getIndex()]);
            }
            if (llIlIlIIlIlIlIl(this.field_175830_k.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175828_a);
            }
            int n;
            if (llIlIlIIlIlIllI(this.field_175833_o) && llIlIlIIlIlIllI(lllllllllllllIIlIlllllIllllIIIII.nextBoolean() ? 1 : 0) && llIlIlIIlIlIlll(this.field_175830_k.field_175966_c[EnumFacing.DOWN.getIndex()] ? 1 : 0) && llIlIlIIlIlIlll(this.field_175830_k.field_175966_c[EnumFacing.UP.getIndex()] ? 1 : 0) && llIlIlIIlIllIII(this.field_175830_k.func_175960_c(), SimpleRoom.lIIlIlllllIlll[0])) {
                n = SimpleRoom.lIIlIlllllIlll[0];
                "".length();
                if (("   ".length() ^ (0x93 ^ 0x94)) <= "  ".length()) {
                    return ((0x66 ^ 0x37 ^ (0x66 ^ 0x62)) & (0x6F ^ 0x59 ^ (0x4E ^ 0x2D) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = SimpleRoom.lIIlIlllllIlll[3];
            }
            final boolean lllllllllllllIIlIlllllIllllIIIll = n != 0;
            if (llIlIlIIlIlIlll(this.field_175833_o)) {
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], lllllllllllllIIlIlllllIllllIIlII);
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], lllllllllllllIIlIlllllIllllIIlII);
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[5], lllllllllllllIIlIlllllIllllIIlII);
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[5], lllllllllllllIIlIlllllIllllIIlII);
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    "".length();
                    if ((0x2E ^ 0x2A) == -" ".length()) {
                        return ((0x90 ^ 0x9D) & ~(0x36 ^ 0x3B)) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    "".length();
                    if (null != null) {
                        return ((0x70 ^ 0x20) & ~(0xFA ^ 0xAA)) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    "".length();
                    if (null != null) {
                        return ((0x46 ^ 0x43 ^ (0xE7 ^ 0xA4)) & (0x66 ^ 0x6C ^ (0xD3 ^ 0x9F) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    "".length();
                    if ((137 + 145 - 139 + 15 ^ 139 + 70 - 207 + 152) <= " ".length()) {
                        return ((0x5E ^ 0x65 ^ (0x52 ^ 0x6E)) & (0x54 ^ 0x24 ^ (0xD8 ^ 0xAF) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    "".length();
                    if ("  ".length() > (0xA0 ^ 0x92 ^ (0x52 ^ 0x64))) {
                        return ((0x16 ^ 0x52 ^ (0x41 ^ 0x9)) & (0x14 ^ 0x42 ^ (0x53 ^ 0x9) ^ -" ".length())) != 0x0;
                    }
                }
            }
            else if (llIlIlIIlIllIIl(this.field_175833_o, SimpleRoom.lIIlIlllllIlll[0])) {
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[7], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[7], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175825_e, SimpleRoom.lIIlIlllllIlll[7], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[6], lllllllllllllIIlIlllllIllllIIlII);
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[5], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[5], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], lllllllllllllIIlIlllllIllllIIlII);
                this.setBlockState(lllllllllllllIIlIlllllIllllIIIIl, SimpleRoom.field_175828_a, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], lllllllllllllIIlIlllllIllllIIlII);
                if (llIlIlIIlIlIlll(this.field_175830_k.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIlll(this.field_175830_k.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIlll(this.field_175830_k.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIlll(this.field_175830_k.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                    "".length();
                    if (" ".length() <= 0) {
                        return ((0x61 ^ 0x29) & ~(0x36 ^ 0x7E)) != 0x0;
                    }
                }
            }
            else if (llIlIlIIlIllIIl(this.field_175833_o, SimpleRoom.lIIlIlllllIlll[6])) {
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[5], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.field_175827_c, SimpleRoom.field_175827_c, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                    this.func_181655_a(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[3], (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                    this.func_181655_a(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[8], (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                    this.func_181655_a(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[3], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[4], (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
                if (llIlIlIIlIlIllI(this.field_175830_k.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                    this.func_181655_a(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[8], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[4], (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                }
            }
            if (llIlIlIIlIlIllI(lllllllllllllIIlIlllllIllllIIIll ? 1 : 0)) {
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[6], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175828_a, SimpleRoom.field_175828_a, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
                this.fillWithBlocks(lllllllllllllIIlIlllllIllllIIIIl, lllllllllllllIIlIlllllIllllIIlII, SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.lIIlIlllllIlll[1], SimpleRoom.lIIlIlllllIlll[4], SimpleRoom.field_175826_b, SimpleRoom.field_175826_b, (boolean)(SimpleRoom.lIIlIlllllIlll[3] != 0));
            }
            return SimpleRoom.lIIlIlllllIlll[0] != 0;
        }
        
        public SimpleRoom() {
        }
        
        private static boolean llIlIlIIlIllIII(final int lllllllllllllIIlIlllllIlllIlIlll, final int lllllllllllllIIlIlllllIlllIlIllI) {
            return lllllllllllllIIlIlllllIlllIlIlll > lllllllllllllIIlIlllllIlllIlIllI;
        }
        
        static {
            llIlIlIIlIlIIll();
        }
        
        private static boolean llIlIlIIlIlIllI(final int lllllllllllllIIlIlllllIlllIlIIlI) {
            return lllllllllllllIIlIlllllIlllIlIIlI != 0;
        }
        
        public SimpleRoom(final EnumFacing lllllllllllllIIlIlllllIlllllIIll, final RoomDefinition lllllllllllllIIlIlllllIlllllIIlI, final Random lllllllllllllIIlIlllllIlllllIIIl) {
            super(SimpleRoom.lIIlIlllllIlll[0], lllllllllllllIIlIlllllIlllllIIll, lllllllllllllIIlIlllllIlllllIIlI, SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0], SimpleRoom.lIIlIlllllIlll[0]);
            this.field_175833_o = lllllllllllllIIlIlllllIlllllIIIl.nextInt(SimpleRoom.lIIlIlllllIlll[1]);
        }
        
        private static void llIlIlIIlIlIIll() {
            (lIIlIlllllIlll = new int[9])[0] = " ".length();
            SimpleRoom.lIIlIlllllIlll[1] = "   ".length();
            SimpleRoom.lIIlIlllllIlll[2] = (0xBB ^ 0xA2);
            SimpleRoom.lIIlIlllllIlll[3] = ((0x26 ^ 0x5E ^ (0x5E ^ 0x6B)) & (180 + 122 - 295 + 186 ^ 86 + 87 - 79 + 46 ^ -" ".length()));
            SimpleRoom.lIIlIlllllIlll[4] = (77 + 79 - 96 + 96 ^ 35 + 18 - 5 + 104);
            SimpleRoom.lIIlIlllllIlll[5] = (112 + 50 - 142 + 116 ^ 108 + 51 - 28 + 11);
            SimpleRoom.lIIlIlllllIlll[6] = "  ".length();
            SimpleRoom.lIIlIlllllIlll[7] = (0x22 ^ 0x27);
            SimpleRoom.lIIlIlllllIlll[8] = (0xE ^ 0x9);
        }
        
        private static boolean llIlIlIIlIlIlll(final int lllllllllllllIIlIlllllIlllIlIIII) {
            return lllllllllllllIIlIlllllIlllIlIIII == 0;
        }
    }
    
    static class ZDoubleRoomFitHelper implements MonumentRoomFitHelper
    {
        private static final /* synthetic */ int[] lIlllIIIIIlllI;
        
        private ZDoubleRoomFitHelper() {
        }
        
        private static boolean lIIIIIIIllIllllI(final int llllllllllllIlllllIllllIlllllIIl) {
            return llllllllllllIlllllIllllIlllllIIl != 0;
        }
        
        static {
            lIIIIIIIllIlllIl();
        }
        
        private static boolean lIIIIIIIllIlllll(final int llllllllllllIlllllIllllIllllIlll) {
            return llllllllllllIlllllIllllIllllIlll == 0;
        }
        
        @Override
        public Piece func_175968_a(final EnumFacing llllllllllllIlllllIlllllIIIIIlII, final RoomDefinition llllllllllllIlllllIllllIllllllll, final Random llllllllllllIlllllIlllllIIIIIIlI) {
            RoomDefinition llllllllllllIlllllIlllllIIIIIIIl = llllllllllllIlllllIllllIllllllll;
            if (!lIIIIIIIllIllllI(llllllllllllIlllllIllllIllllllll.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0) || lIIIIIIIllIllllI(llllllllllllIlllllIllllIllllllll.field_175965_b[EnumFacing.NORTH.getIndex()].field_175963_d ? 1 : 0)) {
                llllllllllllIlllllIlllllIIIIIIIl = llllllllllllIlllllIllllIllllllll.field_175965_b[EnumFacing.SOUTH.getIndex()];
            }
            llllllllllllIlllllIlllllIIIIIIIl.field_175963_d = (ZDoubleRoomFitHelper.lIlllIIIIIlllI[0] != 0);
            llllllllllllIlllllIlllllIIIIIIIl.field_175965_b[EnumFacing.NORTH.getIndex()].field_175963_d = (ZDoubleRoomFitHelper.lIlllIIIIIlllI[0] != 0);
            return new DoubleZRoom(llllllllllllIlllllIlllllIIIIIlII, llllllllllllIlllllIlllllIIIIIIIl, llllllllllllIlllllIlllllIIIIIIlI);
        }
        
        @Override
        public boolean func_175969_a(final RoomDefinition llllllllllllIlllllIlllllIIIIlIll) {
            if (lIIIIIIIllIllllI(llllllllllllIlllllIlllllIIIIlIll.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0) && lIIIIIIIllIlllll(llllllllllllIlllllIlllllIIIIlIll.field_175965_b[EnumFacing.NORTH.getIndex()].field_175963_d ? 1 : 0)) {
                return ZDoubleRoomFitHelper.lIlllIIIIIlllI[0] != 0;
            }
            return ZDoubleRoomFitHelper.lIlllIIIIIlllI[1] != 0;
        }
        
        private static void lIIIIIIIllIlllIl() {
            (lIlllIIIIIlllI = new int[2])[0] = " ".length();
            ZDoubleRoomFitHelper.lIlllIIIIIlllI[1] = ("  ".length() & ~"  ".length());
        }
    }
    
    public static class DoubleZRoom extends Piece
    {
        private static final /* synthetic */ int[] lIIIllllIIIlIl;
        
        public DoubleZRoom(final EnumFacing lllllllllllllIIllllIlIlIIIIlIIlI, final RoomDefinition lllllllllllllIIllllIlIlIIIIlIIIl, final Random lllllllllllllIIllllIlIlIIIIlIlII) {
            super(DoubleZRoom.lIIIllllIIIlIl[0], lllllllllllllIIllllIlIlIIIIlIIlI, lllllllllllllIIllllIlIlIIIIlIIIl, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[1]);
        }
        
        private static boolean llIIIllllIIIlIl(final Object lllllllllllllIIllllIlIIlllllllll) {
            return lllllllllllllIIllllIlIIlllllllll == null;
        }
        
        private static boolean llIIIllllIIIlII(final int lllllllllllllIIllllIlIIllllllIll) {
            return lllllllllllllIIllllIlIIllllllIll > 0;
        }
        
        public DoubleZRoom() {
        }
        
        static {
            llIIIllllIIIIll();
        }
        
        private static boolean llIIIllllIIIllI(final int lllllllllllllIIllllIlIIlllllllIl) {
            return lllllllllllllIIllllIlIIlllllllIl != 0;
        }
        
        private static void llIIIllllIIIIll() {
            (lIIIllllIIIlIl = new int[17])[0] = " ".length();
            DoubleZRoom.lIIIllllIIIlIl[1] = "  ".length();
            DoubleZRoom.lIIIllllIIIlIl[2] = (0xA9 ^ 0x97 ^ (0x2C ^ 0xB));
            DoubleZRoom.lIIIllllIIIlIl[3] = ((0xAC ^ 0x9C) & ~(0x9 ^ 0x39));
            DoubleZRoom.lIIIllllIIIlIl[4] = (0x69 ^ 0x1A ^ (0x44 ^ 0x3F));
            DoubleZRoom.lIIIllllIIIlIl[5] = (43 + 24 + 75 + 50 ^ 80 + 185 - 258 + 189);
            DoubleZRoom.lIIIllllIIIlIl[6] = (0x1 ^ 0x7);
            DoubleZRoom.lIIIllllIIIlIl[7] = (0x1F ^ 0x4C ^ (0x5E ^ 0xA));
            DoubleZRoom.lIIIllllIIIlIl[8] = (0x52 ^ 0x5C);
            DoubleZRoom.lIIIllllIIIlIl[9] = "   ".length();
            DoubleZRoom.lIIIllllIIIlIl[10] = (0x46 ^ 0x49);
            DoubleZRoom.lIIIllllIIIlIl[11] = (0xCB ^ 0xC6);
            DoubleZRoom.lIIIllllIIIlIl[12] = (103 + 114 - 198 + 120 ^ 112 + 44 - 33 + 19);
            DoubleZRoom.lIIIllllIIIlIl[13] = (97 + 98 - 183 + 194 ^ 112 + 158 - 188 + 117);
            DoubleZRoom.lIIIllllIIIlIl[14] = (0x0 ^ 0xA);
            DoubleZRoom.lIIIllllIIIlIl[15] = (0x4A ^ 0x41);
            DoubleZRoom.lIIIllllIIIlIl[16] = (5 + 94 - 71 + 150 ^ 153 + 14 - 8 + 31);
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIllllIlIlIIIIIlIlI, final Random lllllllllllllIIllllIlIlIIIIIlIIl, final StructureBoundingBox lllllllllllllIIllllIlIlIIIIIIIll) {
            final RoomDefinition lllllllllllllIIllllIlIlIIIIIIlll = this.field_175830_k.field_175965_b[EnumFacing.NORTH.getIndex()];
            final RoomDefinition lllllllllllllIIllllIlIlIIIIIIllI = this.field_175830_k;
            if (llIIIllllIIIlII(this.field_175830_k.field_175967_a / DoubleZRoom.lIIIllllIIIlIl[2])) {
                this.func_175821_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[4], lllllllllllllIIllllIlIlIIIIIIlll.field_175966_c[EnumFacing.DOWN.getIndex()]);
                this.func_175821_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[3], lllllllllllllIIllllIlIlIIIIIIllI.field_175966_c[EnumFacing.DOWN.getIndex()]);
            }
            if (llIIIllllIIIlIl(lllllllllllllIIllllIlIlIIIIIIllI.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.field_175828_a);
            }
            if (llIIIllllIIIlIl(lllllllllllllIIllllIlIlIIIIIIlll.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[4], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[8], DoubleZRoom.field_175828_a);
            }
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175828_a, DoubleZRoom.field_175828_a, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175828_a, DoubleZRoom.field_175828_a, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.field_175828_a, DoubleZRoom.field_175828_a, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175828_a, DoubleZRoom.field_175828_a, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[11], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[8], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[11], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[8], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[11], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[8], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[11], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[8], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[13], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[13], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[13], DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[13], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[6], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[13], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[13], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[4], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.fillWithBlocks(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[4], DoubleZRoom.field_175826_b, DoubleZRoom.field_175826_b, (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175825_e, DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[12], lllllllllllllIIllllIlIlIIIIIIIll);
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175825_e, DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[12], lllllllllllllIIllllIlIlIIIIIIIll);
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175825_e, DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[14], lllllllllllllIIllllIlIlIIIIIIIll);
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175825_e, DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[14], lllllllllllllIIllllIlIlIIIIIIIll);
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175826_b, DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[12], lllllllllllllIIllllIlIlIIIIIIIll);
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175826_b, DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[12], lllllllllllllIIllllIlIlIIIIIIIll);
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175826_b, DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[14], lllllllllllllIIllllIlIlIIIIIIIll);
            this.setBlockState(lllllllllllllIIllllIlIlIIIIIlIlI, DoubleZRoom.field_175826_b, DoubleZRoom.lIIIllllIIIlIl[12], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[14], lllllllllllllIIllllIlIlIIIIIIIll);
            if (llIIIllllIIIllI(lllllllllllllIIllllIlIlIIIIIIllI.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[3], (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            }
            if (llIIIllllIIIllI(lllllllllllllIIllllIlIlIIIIIIllI.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[5], (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            }
            if (llIIIllllIIIllI(lllllllllllllIIllllIlIlIIIIIIllI.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[5], (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            }
            if (llIIIllllIIIllI(lllllllllllllIIllllIlIlIIIIIIlll.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[9], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[10], DoubleZRoom.lIIIllllIIIlIl[5], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[10], (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            }
            if (llIIIllllIIIllI(lllllllllllllIIllllIlIlIIIIIIlll.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[15], DoubleZRoom.lIIIllllIIIlIl[3], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[16], (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            }
            if (llIIIllllIIIllI(lllllllllllllIIllllIlIlIIIIIIlll.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIllllIlIlIIIIIlIlI, lllllllllllllIIllllIlIlIIIIIIIll, DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[0], DoubleZRoom.lIIIllllIIIlIl[15], DoubleZRoom.lIIIllllIIIlIl[7], DoubleZRoom.lIIIllllIIIlIl[1], DoubleZRoom.lIIIllllIIIlIl[16], (boolean)(DoubleZRoom.lIIIllllIIIlIl[3] != 0));
            }
            return DoubleZRoom.lIIIllllIIIlIl[0] != 0;
        }
    }
    
    public static class MonumentCoreRoom extends Piece
    {
        private static final /* synthetic */ int[] lllIIIlllIllIl;
        
        private static void lIIllllIIlIlIIII() {
            (lllIIIlllIllIl = new int[15])[0] = " ".length();
            MonumentCoreRoom.lllIIIlllIllIl[1] = "  ".length();
            MonumentCoreRoom.lllIIIlllIllIl[2] = (0x35 ^ 0x3D);
            MonumentCoreRoom.lllIIIlllIllIl[3] = ((0x24 ^ 0x2E ^ (0x4C ^ 0x49)) & (0xEB ^ 0xA6 ^ (0xC3 ^ 0x81) ^ -" ".length()));
            MonumentCoreRoom.lllIIIlllIllIl[4] = (0x12 ^ 0x1 ^ (0x98 ^ 0x85));
            MonumentCoreRoom.lllIIIlllIllIl[5] = (0x36 ^ 0x32 ^ "   ".length());
            MonumentCoreRoom.lllIIIlllIllIl[6] = (0x2F ^ 0x20);
            MonumentCoreRoom.lllIIIlllIllIl[7] = (0x89 ^ 0x8F);
            MonumentCoreRoom.lllIIIlllIllIl[8] = (180 + 38 - 191 + 163 ^ 67 + 53 - 52 + 115);
            MonumentCoreRoom.lllIIIlllIllIl[9] = "   ".length();
            MonumentCoreRoom.lllIIIlllIllIl[10] = (0x7C ^ 0x78);
            MonumentCoreRoom.lllIIIlllIllIl[11] = (138 + 39 - 130 + 100 ^ 80 + 13 - 38 + 95);
            MonumentCoreRoom.lllIIIlllIllIl[12] = (0x4A ^ 0x40);
            MonumentCoreRoom.lllIIIlllIllIl[13] = (166 + 189 - 248 + 97 ^ 37 + 33 + 13 + 110);
            MonumentCoreRoom.lllIIIlllIllIl[14] = (0x1 ^ 0xD);
        }
        
        private static boolean lIIllllIIlIlIIlI(final int llllllllllllIlIllllllIlIlIlIIllI, final int llllllllllllIlIllllllIlIlIlIIlIl) {
            return llllllllllllIlIllllllIlIlIlIIllI == llllllllllllIlIllllllIlIlIlIIlIl;
        }
        
        public MonumentCoreRoom() {
        }
        
        public MonumentCoreRoom(final EnumFacing llllllllllllIlIllllllIlIllIIIIlI, final RoomDefinition llllllllllllIlIllllllIlIlIllllIl, final Random llllllllllllIlIllllllIlIllIIIIII) {
            super(MonumentCoreRoom.lllIIIlllIllIl[0], llllllllllllIlIllllllIlIllIIIIlI, llllllllllllIlIllllllIlIlIllllIl, MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[1]);
        }
        
        private static boolean lIIllllIIlIlIIIl(final int llllllllllllIlIllllllIlIlIIllllI, final int llllllllllllIlIllllllIlIlIIlllIl) {
            return llllllllllllIlIllllllIlIlIIllllI != llllllllllllIlIllllllIlIlIIlllIl;
        }
        
        private static boolean lIIllllIIlIlIIll(final int llllllllllllIlIllllllIlIlIlIIIlI, final int llllllllllllIlIllllllIlIlIlIIIIl) {
            return llllllllllllIlIllllllIlIlIlIIIlI > llllllllllllIlIllllllIlIlIlIIIIl;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlIllllllIlIlIllIlIl, final Random llllllllllllIlIllllllIlIlIllIlII, final StructureBoundingBox llllllllllllIlIllllllIlIlIlIllII) {
            this.func_175819_a(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[2], MonumentCoreRoom.lllIIIlllIllIl[3], MonumentCoreRoom.lllIIIlllIllIl[4], MonumentCoreRoom.lllIIIlllIllIl[2], MonumentCoreRoom.lllIIIlllIllIl[4], MonumentCoreRoom.field_175828_a);
            int llllllllllllIlIllllllIlIlIllIIlI = MonumentCoreRoom.lllIIIlllIllIl[5];
            IBlockState llllllllllllIlIllllllIlIlIllIIIl = MonumentCoreRoom.field_175826_b;
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[3], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], MonumentCoreRoom.lllIIIlllIllIl[3], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[0], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[0], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[6], MonumentCoreRoom.lllIIIlllIllIl[4], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            llllllllllllIlIllllllIlIlIllIIlI = MonumentCoreRoom.lllIIIlllIllIl[0];
            "".length();
            if (null != null) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
            }
            while (!lIIllllIIlIlIIll(llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[7])) {
                llllllllllllIlIllllllIlIlIllIIIl = MonumentCoreRoom.field_175826_b;
                if (!lIIllllIIlIlIIIl(llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[1]) || lIIllllIIlIlIIlI(llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[7])) {
                    llllllllllllIlIllllllIlIlIllIIIl = MonumentCoreRoom.field_175828_a;
                }
                int llllllllllllIlIllllllIlIlIllIIII = MonumentCoreRoom.lllIIIlllIllIl[3];
                "".length();
                if (-" ".length() >= " ".length()) {
                    return ((23 + 118 - 60 + 103 ^ 40 + 154 - 86 + 52) & (86 + 49 - 85 + 105 ^ 74 + 86 - 116 + 87 ^ -" ".length())) != 0x0;
                }
                while (!lIIllllIIlIlIIll(llllllllllllIlIllllllIlIlIllIIII, MonumentCoreRoom.lllIIIlllIllIl[6])) {
                    this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, llllllllllllIlIllllllIlIlIllIIII, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], llllllllllllIlIllllllIlIlIllIIII, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[0], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
                    this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, llllllllllllIlIllllllIlIlIllIIII, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[7], llllllllllllIlIllllllIlIlIllIIII, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[8], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
                    this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, llllllllllllIlIllllllIlIlIllIIII, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[4], llllllllllllIlIllllllIlIlIllIIII, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
                    llllllllllllIlIllllllIlIlIllIIII += 15;
                }
                this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[0], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], MonumentCoreRoom.lllIIIlllIllIl[0], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
                this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[7], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], MonumentCoreRoom.lllIIIlllIllIl[8], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
                this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[4], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], MonumentCoreRoom.lllIIIlllIllIl[4], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[3], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
                this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[0], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[6], MonumentCoreRoom.lllIIIlllIllIl[4], llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[6], llllllllllllIlIllllllIlIlIllIIIl, llllllllllllIlIllllllIlIlIllIIIl, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
                ++llllllllllllIlIllllllIlIlIllIIlI;
            }
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[9], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.field_175827_c, MonumentCoreRoom.field_175827_c, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[10], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[2], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[2], Blocks.gold_block.getDefaultState(), Blocks.gold_block.getDefaultState(), (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            llllllllllllIlIllllllIlIlIllIIlI = MonumentCoreRoom.lllIIIlllIllIl[9];
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) > "   ".length()) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
            }
            while (!lIIllllIIlIlIIll(llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[7])) {
                int llllllllllllIlIllllllIlIlIlIllll = MonumentCoreRoom.lllIIIlllIllIl[7];
                "".length();
                if ((0x2E ^ 0x2A) == 0x0) {
                    return ((0xF2 ^ 0x91) & ~(0x4F ^ 0x2C)) != 0x0;
                }
                while (!lIIllllIIlIlIIll(llllllllllllIlIllllllIlIlIlIllll, MonumentCoreRoom.lllIIIlllIllIl[8])) {
                    this.setBlockState(llllllllllllIlIllllllIlIlIllIlIl, MonumentCoreRoom.field_175825_e, llllllllllllIlIllllllIlIlIlIllll, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[7], llllllllllllIlIllllllIlIlIlIllII);
                    this.setBlockState(llllllllllllIlIllllllIlIlIllIlIl, MonumentCoreRoom.field_175825_e, llllllllllllIlIllllllIlIlIlIllll, llllllllllllIlIllllllIlIlIllIIlI, MonumentCoreRoom.lllIIIlllIllIl[8], llllllllllllIlIllllllIlIlIlIllII);
                    llllllllllllIlIllllllIlIlIlIllll += 3;
                }
                llllllllllllIlIllllllIlIlIllIIlI += 3;
            }
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[4], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[4], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[7], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.lllIIIlllIllIl[4], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[11], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[8], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.lllIIIlllIllIl[4], MonumentCoreRoom.lllIIIlllIllIl[5], MonumentCoreRoom.lllIIIlllIllIl[12], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[9], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[9], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[9], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[9], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[14], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[14], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[14], MonumentCoreRoom.lllIIIlllIllIl[1], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[9], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.lllIIIlllIllIl[9], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[14], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            this.fillWithBlocks(llllllllllllIlIllllllIlIlIllIlIl, llllllllllllIlIllllllIlIlIlIllII, MonumentCoreRoom.lllIIIlllIllIl[14], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.lllIIIlllIllIl[14], MonumentCoreRoom.lllIIIlllIllIl[0], MonumentCoreRoom.lllIIIlllIllIl[13], MonumentCoreRoom.field_175826_b, MonumentCoreRoom.field_175826_b, (boolean)(MonumentCoreRoom.lllIIIlllIllIl[3] != 0));
            return MonumentCoreRoom.lllIIIlllIllIl[0] != 0;
        }
        
        static {
            lIIllllIIlIlIIII();
        }
    }
    
    public static class DoubleYRoom extends Piece
    {
        private static final /* synthetic */ int[] lIIlllIlIlllII;
        
        public DoubleYRoom(final EnumFacing lllllllllllllIIlIIlllIlIIIIlIIll, final RoomDefinition lllllllllllllIIlIIlllIlIIIIlIIlI, final Random lllllllllllllIIlIIlllIlIIIIlIIIl) {
            super(DoubleYRoom.lIIlllIlIlllII[0], lllllllllllllIIlIIlllIlIIIIlIIll, lllllllllllllIIlIIlllIlIIIIlIIlI, DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[0]);
        }
        
        private static boolean llIlllIIIIIIIlI(final int lllllllllllllIIlIIlllIIllllIlIll) {
            return lllllllllllllIIlIIlllIIllllIlIll > 0;
        }
        
        static {
            llIlllIIIIIIIIl();
        }
        
        private static void llIlllIIIIIIIIl() {
            (lIIlllIlIlllII = new int[10])[0] = " ".length();
            DoubleYRoom.lIIlllIlIlllII[1] = "  ".length();
            DoubleYRoom.lIIlllIlIlllII[2] = (0xB5 ^ 0xBC ^ (0x6E ^ 0x7E));
            DoubleYRoom.lIIlllIlIlllII[3] = ((51 + 115 - 45 + 59 ^ 125 + 98 - 100 + 13) & (0x58 ^ 0x2C ^ (0x3E ^ 0x76) ^ -" ".length()));
            DoubleYRoom.lIIlllIlIlllII[4] = (0xAF ^ 0xA7);
            DoubleYRoom.lIIlllIlIlllII[5] = (0x3C ^ 0x3A);
            DoubleYRoom.lIIlllIlIlllII[6] = (88 + 43 - 98 + 100 ^ 37 + 105 - 61 + 48);
            DoubleYRoom.lIIlllIlIlllII[7] = (0x18 ^ 0x1F);
            DoubleYRoom.lIIlllIlIlllII[8] = (0xB3 ^ 0xB6);
            DoubleYRoom.lIIlllIlIlllII[9] = "   ".length();
        }
        
        public DoubleYRoom() {
        }
        
        private static boolean llIlllIIIIIIIll(final Object lllllllllllllIIlIIlllIIllllIllll) {
            return lllllllllllllIIlIIlllIIllllIllll == null;
        }
        
        private static boolean llIlllIIIIIIlII(final int lllllllllllllIIlIIlllIIllllIllIl) {
            return lllllllllllllIIlIIlllIIllllIllIl != 0;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlIIlllIIllllllIll, final Random lllllllllllllIIlIIlllIlIIIIIIIll, final StructureBoundingBox lllllllllllllIIlIIlllIlIIIIIIIlI) {
            if (llIlllIIIIIIIlI(this.field_175830_k.field_175967_a / DoubleYRoom.lIIlllIlIlllII[2])) {
                this.func_175821_a(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[3], DoubleYRoom.lIIlllIlIlllII[3], this.field_175830_k.field_175966_c[EnumFacing.DOWN.getIndex()]);
            }
            final RoomDefinition lllllllllllllIIlIIlllIlIIIIIIIIl = this.field_175830_k.field_175965_b[EnumFacing.UP.getIndex()];
            if (llIlllIIIIIIIll(lllllllllllllIIlIIlllIlIIIIIIIIl.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[4], DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.lIIlllIlIlllII[4], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.field_175828_a);
            }
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[3], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[3], DoubleYRoom.lIIlllIlIlllII[3], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[3], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[3], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[3], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.lIIlllIlIlllII[5], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
            RoomDefinition lllllllllllllIIlIIlllIlIIIIIIIII = this.field_175830_k;
            int lllllllllllllIIlIIlllIIlllllllll = DoubleYRoom.lIIlllIlIlllII[0];
            "".length();
            if (-(0x8B ^ 0xBF ^ (0x5 ^ 0x35)) >= 0) {
                return ((0x95 ^ 0xB5 ^ 51 + 126 - 107 + 57) & (0x5A ^ 0x5F ^ (0x2E ^ 0x74) ^ -" ".length())) != 0x0;
            }
            while (!llIlllIIIIIIlIl(lllllllllllllIIlIIlllIIlllllllll, DoubleYRoom.lIIlllIlIlllII[8])) {
                int lllllllllllllIIlIIlllIIllllllllI = DoubleYRoom.lIIlllIlIlllII[3];
                if (llIlllIIIIIIlII(lllllllllllllIIlIIlllIlIIIIIIIII.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIlllllllll, lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[8], lllllllllllllIIlIIlllIIlllllllll, lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[8], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[9], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[6], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    "".length();
                    if (-(0x2 ^ 0x53 ^ (0xE2 ^ 0xB7)) > 0) {
                        return ((0x2E ^ 0x7A ^ (0x34 ^ 0x6D)) & (133 + 42 - 99 + 67 ^ 23 + 93 - 65 + 79 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllll, lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[7], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[7], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175828_a, DoubleYRoom.field_175828_a, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                }
                lllllllllllllIIlIIlllIIllllllllI = DoubleYRoom.lIIlllIlIlllII[7];
                if (llIlllIIIIIIlII(lllllllllllllIIlIIlllIlIIIIIIIII.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIlllllllll, lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[8], lllllllllllllIIlIIlllIIlllllllll, lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[8], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[9], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[6], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    "".length();
                    if (null != null) {
                        return ((0x43 ^ 0x7E) & ~(0x9F ^ 0xA2)) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllll, lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[7], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.lIIlllIlIlllII[7], lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], lllllllllllllIIlIIlllIIllllllllI, DoubleYRoom.field_175828_a, DoubleYRoom.field_175828_a, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                }
                int lllllllllllllIIlIIlllIIlllllllIl = DoubleYRoom.lIIlllIlIlllII[3];
                if (llIlllIIIIIIlII(lllllllllllllIIlIIlllIlIIIIIIIII.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll, DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll, DoubleYRoom.lIIlllIlIlllII[8], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[9], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x2 ^ 0x13) & ~(0x57 ^ 0x46)) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll, DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.field_175828_a, DoubleYRoom.field_175828_a, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                }
                lllllllllllllIIlIIlllIIlllllllIl = DoubleYRoom.lIIlllIlIlllII[7];
                if (llIlllIIIIIIlII(lllllllllllllIIlIIlllIlIIIIIIIII.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll, DoubleYRoom.lIIlllIlIlllII[1], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll, DoubleYRoom.lIIlllIlIlllII[8], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[8], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[9], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[6], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    "".length();
                    if (((0x6F ^ 0x2F) & ~(0x1E ^ 0x5E)) >= (0x6 ^ 0x2)) {
                        return ((0x4E ^ 0x2) & ~(0x4B ^ 0x7)) != 0x0;
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll, DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[1], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.field_175826_b, DoubleYRoom.field_175826_b, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                    this.fillWithBlocks(lllllllllllllIIlIIlllIIllllllIll, lllllllllllllIIlIIlllIlIIIIIIIlI, lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[3], lllllllllllllIIlIIlllIIlllllllIl, lllllllllllllIIlIIlllIIlllllllll + DoubleYRoom.lIIlllIlIlllII[0], DoubleYRoom.lIIlllIlIlllII[7], DoubleYRoom.field_175828_a, DoubleYRoom.field_175828_a, (boolean)(DoubleYRoom.lIIlllIlIlllII[3] != 0));
                }
                lllllllllllllIIlIIlllIlIIIIIIIII = lllllllllllllIIlIIlllIlIIIIIIIIl;
                lllllllllllllIIlIIlllIIlllllllll += 4;
            }
            return DoubleYRoom.lIIlllIlIlllII[0] != 0;
        }
        
        private static boolean llIlllIIIIIIlIl(final int lllllllllllllIIlIIlllIIlllllIIlI, final int lllllllllllllIIlIIlllIIlllllIIIl) {
            return lllllllllllllIIlIIlllIIlllllIIlI > lllllllllllllIIlIIlllIIlllllIIIl;
        }
    }
    
    static class FitSimpleRoomTopHelper implements MonumentRoomFitHelper
    {
        private static final /* synthetic */ int[] llIlIlIIIllIlI;
        
        @Override
        public boolean func_175969_a(final RoomDefinition llllllllllllIllIlIlIlllllIIlllIl) {
            if (lIIlIIlllIlIllII(llllllllllllIllIlIlIlllllIIlllIl.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0) && lIIlIIlllIlIllII(llllllllllllIllIlIlIlllllIIlllIl.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0) && lIIlIIlllIlIllII(llllllllllllIllIlIlIlllllIIlllIl.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0) && lIIlIIlllIlIllII(llllllllllllIllIlIlIlllllIIlllIl.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0) && lIIlIIlllIlIllII(llllllllllllIllIlIlIlllllIIlllIl.field_175966_c[EnumFacing.UP.getIndex()] ? 1 : 0)) {
                return FitSimpleRoomTopHelper.llIlIlIIIllIlI[0] != 0;
            }
            return FitSimpleRoomTopHelper.llIlIlIIIllIlI[1] != 0;
        }
        
        private static boolean lIIlIIlllIlIllII(final int llllllllllllIllIlIlIlllllIIIlllI) {
            return llllllllllllIllIlIlIlllllIIIlllI == 0;
        }
        
        private static void lIIlIIlllIlIlIll() {
            (llIlIlIIIllIlI = new int[2])[0] = " ".length();
            FitSimpleRoomTopHelper.llIlIlIIIllIlI[1] = ("   ".length() & ~"   ".length());
        }
        
        static {
            lIIlIIlllIlIlIll();
        }
        
        @Override
        public Piece func_175968_a(final EnumFacing llllllllllllIllIlIlIlllllIIlIlII, final RoomDefinition llllllllllllIllIlIlIlllllIIlIIll, final Random llllllllllllIllIlIlIlllllIIlIlIl) {
            llllllllllllIllIlIlIlllllIIlIIll.field_175963_d = (FitSimpleRoomTopHelper.llIlIlIIIllIlI[0] != 0);
            return new SimpleTopRoom(llllllllllllIllIlIlIlllllIIlIlII, llllllllllllIllIlIlIlllllIIlIIll, llllllllllllIllIlIlIlllllIIlIlIl);
        }
        
        private FitSimpleRoomTopHelper() {
        }
    }
    
    public static class SimpleTopRoom extends Piece
    {
        private static final /* synthetic */ int[] lIIlIIIIIIlIIl;
        
        private static boolean llIIlIIIlllllII(final int lllllllllllllIIlllIllllIllIIIIIl) {
            return lllllllllllllIIlllIllllIllIIIIIl != 0;
        }
        
        public SimpleTopRoom() {
        }
        
        static {
            llIIlIIIllllIIl();
        }
        
        private static boolean llIIlIIIllllllI(final int lllllllllllllIIlllIllllIllIIIllI, final int lllllllllllllIIlllIllllIllIIIlIl) {
            return lllllllllllllIIlllIllllIllIIIllI > lllllllllllllIIlllIllllIllIIIlIl;
        }
        
        private static boolean llIIlIIIllllIlI(final int lllllllllllllIIlllIllllIlIllllIl) {
            return lllllllllllllIIlllIllllIlIllllIl > 0;
        }
        
        private static boolean llIIlIIIlllllIl(final int lllllllllllllIIlllIllllIlIllllll) {
            return lllllllllllllIIlllIllllIlIllllll == 0;
        }
        
        public SimpleTopRoom(final EnumFacing lllllllllllllIIlllIllllIlllIIIll, final RoomDefinition lllllllllllllIIlllIllllIlllIIIlI, final Random lllllllllllllIIlllIllllIlllIIIIl) {
            super(SimpleTopRoom.lIIlIIIIIIlIIl[0], lllllllllllllIIlllIllllIlllIIIll, lllllllllllllIIlllIllllIlllIIIlI, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[0]);
        }
        
        private static boolean llIIlIIIllllIll(final Object lllllllllllllIIlllIllllIllIIIIll) {
            return lllllllllllllIIlllIllllIllIIIIll == null;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlllIllllIllIlIlIl, final Random lllllllllllllIIlllIllllIllIIllIl, final StructureBoundingBox lllllllllllllIIlllIllllIllIIllII) {
            if (llIIlIIIllllIlI(this.field_175830_k.field_175967_a / SimpleTopRoom.lIIlIIIIIIlIIl[1])) {
                this.func_175821_a(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[2], this.field_175830_k.field_175966_c[EnumFacing.DOWN.getIndex()]);
            }
            if (llIIlIIIllllIll(this.field_175830_k.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[3], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.lIIlIIIIIIlIIl[3], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.field_175828_a);
            }
            int lllllllllllllIIlllIllllIllIlIIlI = SimpleTopRoom.lIIlIIIIIIlIIl[0];
            "".length();
            if ("   ".length() < 0) {
                return ((0xE ^ 0x4E ^ (0x17 ^ 0x5)) & (0x80 ^ 0xA8 ^ (0xF5 ^ 0x8F) ^ -" ".length())) != 0x0;
            }
            while (!llIIlIIIllllllI(lllllllllllllIIlllIllllIllIlIIlI, SimpleTopRoom.lIIlIIIIIIlIIl[4])) {
                int lllllllllllllIIlllIllllIllIlIIIl = SimpleTopRoom.lIIlIIIIIIlIIl[0];
                "".length();
                if (((0xB6 ^ 0x99) & ~(0x9 ^ 0x26)) >= "   ".length()) {
                    return ((0xC ^ 0x2F) & ~(0x7A ^ 0x59)) != 0x0;
                }
                while (!llIIlIIIllllllI(lllllllllllllIIlllIllllIllIlIIIl, SimpleTopRoom.lIIlIIIIIIlIIl[4])) {
                    if (llIIlIIIlllllII(lllllllllllllIIlllIllllIllIIllIl.nextInt(SimpleTopRoom.lIIlIIIIIIlIIl[5]))) {
                        final int n = SimpleTopRoom.lIIlIIIIIIlIIl[6];
                        int n2;
                        if (llIIlIIIlllllIl(lllllllllllllIIlllIllllIllIIllIl.nextInt(SimpleTopRoom.lIIlIIIIIIlIIl[3]))) {
                            n2 = SimpleTopRoom.lIIlIIIIIIlIIl[2];
                            "".length();
                            if (-" ".length() > "   ".length()) {
                                return ((0x15 ^ 0x38 ^ (0x94 ^ 0x9C)) & (105 + 14 - 7 + 78 ^ 11 + 98 - 47 + 93 ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            n2 = SimpleTopRoom.lIIlIIIIIIlIIl[0];
                        }
                        final int lllllllllllllIIlllIllllIllIlIIII = n + n2;
                        this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, lllllllllllllIIlllIllllIllIlIIlI, lllllllllllllIIlllIllllIllIlIIII, lllllllllllllIIlllIllllIllIlIIIl, lllllllllllllIIlllIllllIllIlIIlI, SimpleTopRoom.lIIlIIIIIIlIIl[5], lllllllllllllIIlllIllllIllIlIIIl, Blocks.sponge.getStateFromMeta(SimpleTopRoom.lIIlIIIIIIlIIl[0]), Blocks.sponge.getStateFromMeta(SimpleTopRoom.lIIlIIIIIIlIIl[0]), (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
                    }
                    ++lllllllllllllIIlllIllllIllIlIIIl;
                }
                ++lllllllllllllIIlllIllllIllIlIIlI;
            }
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[4], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175826_b, SimpleTopRoom.field_175826_b, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[3], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[3], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[3], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.lIIlIIIIIIlIIl[3], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[7], SimpleTopRoom.field_175827_c, SimpleTopRoom.field_175827_c, (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            if (llIIlIIIlllllII(this.field_175830_k.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIlllIllllIllIlIlIl, lllllllllllllIIlllIllllIllIIllII, SimpleTopRoom.lIIlIIIIIIlIIl[5], SimpleTopRoom.lIIlIIIIIIlIIl[0], SimpleTopRoom.lIIlIIIIIIlIIl[2], SimpleTopRoom.lIIlIIIIIIlIIl[3], SimpleTopRoom.lIIlIIIIIIlIIl[6], SimpleTopRoom.lIIlIIIIIIlIIl[2], (boolean)(SimpleTopRoom.lIIlIIIIIIlIIl[2] != 0));
            }
            return SimpleTopRoom.lIIlIIIIIIlIIl[0] != 0;
        }
        
        private static void llIIlIIIllllIIl() {
            (lIIlIIIIIIlIIl = new int[8])[0] = " ".length();
            SimpleTopRoom.lIIlIIIIIIlIIl[1] = (0xA4 ^ 0xBD);
            SimpleTopRoom.lIIlIIIIIIlIIl[2] = ((0xE6 ^ 0xC7) & ~(0x14 ^ 0x35));
            SimpleTopRoom.lIIlIIIIIIlIIl[3] = (0x61 ^ 0x65);
            SimpleTopRoom.lIIlIIIIIIlIIl[4] = (0xEF ^ 0xBE ^ (0xCD ^ 0x9A));
            SimpleTopRoom.lIIlIIIIIIlIIl[5] = "   ".length();
            SimpleTopRoom.lIIlIIIIIIlIIl[6] = "  ".length();
            SimpleTopRoom.lIIlIIIIIIlIIl[7] = (0x14 ^ 0x13);
        }
    }
    
    public static class EntryRoom extends Piece
    {
        private static final /* synthetic */ int[] llIlIllIIIllIl;
        
        private static void lIIlIlIlIIIIIlII() {
            (llIlIllIIIllIl = new int[8])[0] = " ".length();
            EntryRoom.llIlIllIIIllIl[1] = ((173 + 23 - 94 + 91 ^ 96 + 107 - 99 + 47) & (0x19 ^ 0x59 ^ (0xAA ^ 0xBC) ^ -" ".length()));
            EntryRoom.llIlIllIIIllIl[2] = "   ".length();
            EntryRoom.llIlIllIIIllIl[3] = "  ".length();
            EntryRoom.llIlIllIIIllIl[4] = (0xB0 ^ 0xB7);
            EntryRoom.llIlIllIIIllIl[5] = (23 + 165 - 181 + 167 ^ 165 + 126 - 144 + 24);
            EntryRoom.llIlIllIIIllIl[6] = (0x37 ^ 0x31);
            EntryRoom.llIlIllIIIllIl[7] = ("   ".length() ^ (0x51 ^ 0x56));
        }
        
        public EntryRoom() {
        }
        
        private static boolean lIIlIlIlIIIIIlIl(final int llllllllllllIllIlIIllIlllllIIlIl) {
            return llllllllllllIllIlIIllIlllllIIlIl != 0;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIlIIllIlllllIlIII, final Random llllllllllllIllIlIIllIlllllIlIll, final StructureBoundingBox llllllllllllIllIlIIllIlllllIIlll) {
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[4], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[5], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[4], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[4], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[6], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[4], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[4], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[4], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[4], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[1], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[5], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[6], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[1], EntryRoom.field_175826_b, EntryRoom.field_175826_b, (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            if (lIIlIlIlIIIIIlIl(this.field_175830_k.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[7], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[4], (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            }
            if (lIIlIlIlIIIIIlIl(this.field_175830_k.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[1], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[7], (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            }
            if (lIIlIlIlIIIIIlIl(this.field_175830_k.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(llllllllllllIllIlIIllIlllllIlIII, llllllllllllIllIlIIllIlllllIIlll, EntryRoom.llIlIllIIIllIl[6], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[2], EntryRoom.llIlIllIIIllIl[4], EntryRoom.llIlIllIIIllIl[3], EntryRoom.llIlIllIIIllIl[7], (boolean)(EntryRoom.llIlIllIIIllIl[1] != 0));
            }
            return EntryRoom.llIlIllIIIllIl[0] != 0;
        }
        
        static {
            lIIlIlIlIIIIIlII();
        }
        
        public EntryRoom(final EnumFacing llllllllllllIllIlIIllIllllllIlIl, final RoomDefinition llllllllllllIllIlIIllIllllllIlII) {
            super(EntryRoom.llIlIllIIIllIl[0], llllllllllllIllIlIIllIllllllIlIl, llllllllllllIllIlIIllIllllllIlII, EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[0], EntryRoom.llIlIllIIIllIl[0]);
        }
    }
    
    public static class DoubleXRoom extends Piece
    {
        private static final /* synthetic */ int[] lIIllIIllllIIl;
        
        public DoubleXRoom(final EnumFacing lllllllllllllIIlIlIlllIIlIllllll, final RoomDefinition lllllllllllllIIlIlIlllIIlIlllllI, final Random lllllllllllllIIlIlIlllIIlIllllIl) {
            super(DoubleXRoom.lIIllIIllllIIl[0], lllllllllllllIIlIlIlllIIlIllllll, lllllllllllllIIlIlIlllIIlIlllllI, DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[0]);
        }
        
        private static boolean llIlIlllllllIll(final Object lllllllllllllIIlIlIlllIIlIlIlIII) {
            return lllllllllllllIIlIlIlllIIlIlIlIII == null;
        }
        
        private static boolean llIlIlllllllIlI(final int lllllllllllllIIlIlIlllIIlIlIIlII) {
            return lllllllllllllIIlIlIlllIIlIlIIlII > 0;
        }
        
        private static void llIlIlllllllIIl() {
            (lIIllIIllllIIl = new int[16])[0] = " ".length();
            DoubleXRoom.lIIllIIllllIIl[1] = "  ".length();
            DoubleXRoom.lIIllIIllllIIl[2] = (0x72 ^ 0x6B);
            DoubleXRoom.lIIllIIllllIIl[3] = (0x72 ^ 0x6C ^ (0xAD ^ 0xBB));
            DoubleXRoom.lIIllIIllllIIl[4] = ((0x1C ^ 0x2D) & ~(0x5D ^ 0x6C));
            DoubleXRoom.lIIllIIllllIIl[5] = (0x29 ^ 0x2D);
            DoubleXRoom.lIIllIIllllIIl[6] = (0xC2 ^ 0xB0 ^ (0x40 ^ 0x35));
            DoubleXRoom.lIIllIIllllIIl[7] = (0xB2 ^ 0xB4);
            DoubleXRoom.lIIllIIllllIIl[8] = (0x30 ^ 0x3E);
            DoubleXRoom.lIIllIIllllIIl[9] = "   ".length();
            DoubleXRoom.lIIllIIllllIIl[10] = (82 + 136 - 175 + 136 ^ 107 + 162 - 123 + 42);
            DoubleXRoom.lIIllIIllllIIl[11] = (0xB9 ^ 0xBC);
            DoubleXRoom.lIIllIIllllIIl[12] = (133 + 137 - 215 + 92 ^ 71 + 119 - 50 + 13);
            DoubleXRoom.lIIllIIllllIIl[13] = (0x5D ^ 0x54);
            DoubleXRoom.lIIllIIllllIIl[14] = (98 + 54 - 125 + 108 ^ 27 + 95 - 41 + 59);
            DoubleXRoom.lIIllIIllllIIl[15] = (0x55 ^ 0x59);
        }
        
        public DoubleXRoom() {
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlIlIlllIIlIllIIll, final Random lllllllllllllIIlIlIlllIIlIllIIlI, final StructureBoundingBox lllllllllllllIIlIlIlllIIlIlIllII) {
            final RoomDefinition lllllllllllllIIlIlIlllIIlIllIIII = this.field_175830_k.field_175965_b[EnumFacing.EAST.getIndex()];
            final RoomDefinition lllllllllllllIIlIlIlllIIlIlIllll = this.field_175830_k;
            if (llIlIlllllllIlI(this.field_175830_k.field_175967_a / DoubleXRoom.lIIllIIllllIIl[2])) {
                this.func_175821_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[3], DoubleXRoom.lIIllIIllllIIl[4], lllllllllllllIIlIlIlllIIlIllIIII.field_175966_c[EnumFacing.DOWN.getIndex()]);
                this.func_175821_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[4], lllllllllllllIIlIlIlllIIlIlIllll.field_175966_c[EnumFacing.DOWN.getIndex()]);
            }
            if (llIlIlllllllIll(lllllllllllllIIlIlIlllIIlIlIllll.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.lIIllIIllllIIl[7], DoubleXRoom.field_175828_a);
            }
            if (llIlIlllllllIll(lllllllllllllIIlIlIlllIIlIllIIII.field_175965_b[EnumFacing.UP.getIndex()])) {
                this.func_175819_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[3], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[8], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.lIIllIIllllIIl[7], DoubleXRoom.field_175828_a);
            }
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.lIIllIIllllIIl[8], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175828_a, DoubleXRoom.field_175828_a, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175828_a, DoubleXRoom.field_175828_a, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.field_175828_a, DoubleXRoom.field_175828_a, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.lIIllIIllllIIl[8], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175828_a, DoubleXRoom.field_175828_a, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.lIIllIIllllIIl[8], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[11], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[12], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[7], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[13], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.field_175828_a, DoubleXRoom.field_175828_a, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.fillWithBlocks(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[11], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[12], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.field_175826_b, DoubleXRoom.field_175826_b, (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            this.setBlockState(lllllllllllllIIlIlIlllIIlIllIIll, DoubleXRoom.field_175825_e, DoubleXRoom.lIIllIIllllIIl[7], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[9], lllllllllllllIIlIlIlllIIlIlIllII);
            this.setBlockState(lllllllllllllIIlIlIlllIIlIllIIll, DoubleXRoom.field_175825_e, DoubleXRoom.lIIllIIllllIIl[13], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[9], lllllllllllllIIlIlIlllIIlIlIllII);
            if (llIlIllllllllII(lllllllllllllIIlIlIlllIIlIlIllll.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[4], (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            }
            if (llIlIllllllllII(lllllllllllllIIlIlIlllIIlIlIllll.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.lIIllIIllllIIl[5], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[6], (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            }
            if (llIlIllllllllII(lllllllllllllIIlIlIlllIIlIlIllll.field_175966_c[EnumFacing.WEST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[5], (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            }
            if (llIlIllllllllII(lllllllllllllIIlIlIlllIIlIllIIII.field_175966_c[EnumFacing.SOUTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[14], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[4], DoubleXRoom.lIIllIIllllIIl[15], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[4], (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            }
            if (llIlIllllllllII(lllllllllllllIIlIlIlllIIlIllIIII.field_175966_c[EnumFacing.NORTH.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[14], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[6], DoubleXRoom.lIIllIIllllIIl[15], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[6], (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            }
            if (llIlIllllllllII(lllllllllllllIIlIlIlllIIlIllIIII.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0)) {
                this.func_181655_a(lllllllllllllIIlIlIlllIIlIllIIll, lllllllllllllIIlIlIlllIIlIlIllII, DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[0], DoubleXRoom.lIIllIIllllIIl[9], DoubleXRoom.lIIllIIllllIIl[10], DoubleXRoom.lIIllIIllllIIl[1], DoubleXRoom.lIIllIIllllIIl[5], (boolean)(DoubleXRoom.lIIllIIllllIIl[4] != 0));
            }
            return DoubleXRoom.lIIllIIllllIIl[0] != 0;
        }
        
        static {
            llIlIlllllllIIl();
        }
        
        private static boolean llIlIllllllllII(final int lllllllllllllIIlIlIlllIIlIlIIllI) {
            return lllllllllllllIIlIlIlllIIlIlIIllI != 0;
        }
    }
    
    public static class Penthouse extends Piece
    {
        private static final /* synthetic */ int[] lIIIlIlIlllIll;
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIIIIllIIlIIIIlIll, final Random lllllllllllllIlIIIIllIIlIIIIlIlI, final StructureBoundingBox lllllllllllllIlIIIIllIIlIIIIlIIl) {
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[0], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[0], Penthouse.lIIIlIlIlllIll[2], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[2], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[4], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[2], Penthouse.field_175828_a, Penthouse.field_175828_a, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[5], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[6], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[2], Penthouse.field_175828_a, Penthouse.field_175828_a, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[0], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[2], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[4], Penthouse.field_175828_a, Penthouse.field_175828_a, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[0], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[5], Penthouse.lIIIlIlIlllIll[2], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[6], Penthouse.field_175828_a, Penthouse.field_175828_a, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[6], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[6], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[6], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[6], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[4], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[5], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[4], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[6], Penthouse.lIIIlIlIlllIll[5], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[6], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            int lllllllllllllIlIIIIllIIlIIIIlIII = Penthouse.lIIIlIlIlllIll[0];
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0x72 ^ 0x23) & ~(0x47 ^ 0x16)) != 0x0;
            }
            while (!llIIIIIlIllIlll(lllllllllllllIlIIIIllIIlIIIIlIII, Penthouse.lIIIlIlIlllIll[2])) {
                this.setBlockState(lllllllllllllIlIIIIllIIlIIIIlIll, Penthouse.field_175825_e, Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], lllllllllllllIlIIIIllIIlIIIIlIII, lllllllllllllIlIIIIllIIlIIIIlIIl);
                this.setBlockState(lllllllllllllIlIIIIllIIlIIIIlIll, Penthouse.field_175825_e, Penthouse.lIIIlIlIlllIll[6], Penthouse.lIIIlIlIlllIll[3], lllllllllllllIlIIIIllIIlIIIIlIII, lllllllllllllIlIIIIllIIlIIIIlIIl);
                this.setBlockState(lllllllllllllIlIIIIllIIlIIIIlIll, Penthouse.field_175825_e, lllllllllllllIlIIIIllIIlIIIIlIII, Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[3], lllllllllllllIlIIIIllIIlIIIIlIIl);
                lllllllllllllIlIIIIllIIlIIIIlIII += 3;
            }
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[0], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[8], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[9], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[9], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[2], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[9], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[8], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[9], Penthouse.lIIIlIlIlllIll[9], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[2], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.setBlockState(lllllllllllllIlIIIIllIIlIIIIlIll, Penthouse.field_175826_b, Penthouse.lIIIlIlIlllIll[10], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[11], lllllllllllllIlIIIIllIIlIIIIlIIl);
            this.setBlockState(lllllllllllllIlIIIIllIIlIIIIlIll, Penthouse.field_175826_b, Penthouse.lIIIlIlIlllIll[11], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[11], lllllllllllllIlIIIIllIIlIIIIlIIl);
            this.setBlockState(lllllllllllllIlIIIIllIIlIIIIlIll, Penthouse.field_175826_b, Penthouse.lIIIlIlIlllIll[12], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[12], lllllllllllllIlIIIIllIIlIIIIlIIl);
            this.setBlockState(lllllllllllllIlIIIIllIIlIIIIlIll, Penthouse.field_175826_b, Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[12], lllllllllllllIlIIIIllIIlIIIIlIIl);
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[13], Penthouse.field_175827_c, Penthouse.field_175827_c, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[12], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[12], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[13], Penthouse.field_175827_c, Penthouse.field_175827_c, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[14], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[12], Penthouse.lIIIlIlIlllIll[13], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[12], Penthouse.field_175827_c, Penthouse.field_175827_c, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            int lllllllllllllIlIIIIllIIlIIIIIlll = Penthouse.lIIIlIlIlllIll[7];
            int lllllllllllllIlIIIIllIIlIIIIIllI = Penthouse.lIIIlIlIlllIll[3];
            "".length();
            if ("   ".length() < " ".length()) {
                return ((0x8A ^ 0x9B ^ (0x27 ^ 0x5)) & (0x1F ^ 0x9 ^ (0x91 ^ 0xB4) ^ -" ".length())) != 0x0;
            }
            while (!llIIIIIlIlllIII(lllllllllllllIlIIIIllIIlIIIIIllI, Penthouse.lIIIlIlIlllIll[0])) {
                int lllllllllllllIlIIIIllIIlIIIIIlIl = Penthouse.lIIIlIlIlllIll[0];
                "".length();
                if ((0x44 ^ 0x40) <= 0) {
                    return ((0xD5 ^ 0xC1) & ~(0x3C ^ 0x28)) != 0x0;
                }
                while (!llIIIIIlIllIlll(lllllllllllllIlIIIIllIIlIIIIIlIl, Penthouse.lIIIlIlIlllIll[11])) {
                    this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, lllllllllllllIlIIIIllIIlIIIIIlll, Penthouse.lIIIlIlIlllIll[3], lllllllllllllIlIIIIllIIlIIIIIlIl, lllllllllllllIlIIIIllIIlIIIIIlll, Penthouse.lIIIlIlIlllIll[0], lllllllllllllIlIIIIllIIlIIIIIlIl, Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
                    lllllllllllllIlIIIIllIIlIIIIIlIl += 3;
                }
                lllllllllllllIlIIIIllIIlIIIIIlll = Penthouse.lIIIlIlIlllIll[12];
                ++lllllllllllllIlIIIIllIIlIIIIIllI;
            }
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[10], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[12], Penthouse.lIIIlIlIlllIll[10], Penthouse.lIIIlIlIlllIll[0], Penthouse.lIIIlIlIlllIll[12], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[11], Penthouse.lIIIlIlIlllIll[3], Penthouse.lIIIlIlIlllIll[12], Penthouse.lIIIlIlIlllIll[11], Penthouse.lIIIlIlIlllIll[0], Penthouse.lIIIlIlIlllIll[12], Penthouse.field_175826_b, Penthouse.field_175826_b, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[14], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[13], Penthouse.lIIIlIlIlllIll[13], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[11], Penthouse.field_175827_c, Penthouse.field_175827_c, (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.func_181655_a(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[14], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[7], Penthouse.lIIIlIlIlllIll[13], Penthouse.lIIIlIlIlllIll[1], Penthouse.lIIIlIlIlllIll[8], (boolean)(Penthouse.lIIIlIlIlllIll[3] != 0));
            this.func_175817_a(lllllllllllllIlIIIIllIIlIIIIlIll, lllllllllllllIlIIIIllIIlIIIIlIIl, Penthouse.lIIIlIlIlllIll[14], Penthouse.lIIIlIlIlllIll[4], Penthouse.lIIIlIlIlllIll[14]);
            "".length();
            return Penthouse.lIIIlIlIlllIll[4] != 0;
        }
        
        public Penthouse(final EnumFacing lllllllllllllIlIIIIllIIlIIIlIlII, final StructureBoundingBox lllllllllllllIlIIIIllIIlIIIlIllI) {
            super(lllllllllllllIlIIIIllIIlIIIlIlII, lllllllllllllIlIIIIllIIlIIIlIllI);
        }
        
        private static boolean llIIIIIlIllIlll(final int lllllllllllllIlIIIIllIIIlllllIII, final int lllllllllllllIlIIIIllIIIllllIlll) {
            return lllllllllllllIlIIIIllIIIlllllIII > lllllllllllllIlIIIIllIIIllllIlll;
        }
        
        private static void llIIIIIlIllIllI() {
            (lIIIlIlIlllIll = new int[15])[0] = "  ".length();
            Penthouse.lIIIlIlIlllIll[1] = -" ".length();
            Penthouse.lIIIlIlIlllIll[2] = (13 + 152 - 122 + 163 ^ 173 + 38 - 182 + 168);
            Penthouse.lIIIlIlIlllIll[3] = ((0xDF ^ 0xBE ^ (0x60 ^ 0x19)) & (0xD0 ^ 0xC6 ^ (0x64 ^ 0x6A) ^ -" ".length()));
            Penthouse.lIIIlIlIlllIll[4] = " ".length();
            Penthouse.lIIIlIlIlllIll[5] = (104 + 163 - 260 + 193 ^ 7 + 168 - 45 + 66);
            Penthouse.lIIIlIlIlllIll[6] = (0xFB ^ 0x82 ^ (0x19 ^ 0x6D));
            Penthouse.lIIIlIlIlllIll[7] = "   ".length();
            Penthouse.lIIIlIlIlllIll[8] = (0x1E ^ 0x13 ^ (0x3F ^ 0x36));
            Penthouse.lIIIlIlIlllIll[9] = (33 + 57 - 77 + 158 ^ 9 + 39 + 88 + 26);
            Penthouse.lIIIlIlIlllIll[10] = (0xA3 ^ 0xA6);
            Penthouse.lIIIlIlIlllIll[11] = (0x88 ^ 0x80);
            Penthouse.lIIIlIlIlllIll[12] = (0x8A ^ 0xA0 ^ (0x66 ^ 0x46));
            Penthouse.lIIIlIlIlllIll[13] = (0x5C ^ 0x5B);
            Penthouse.lIIIlIlIlllIll[14] = (0x9B ^ 0x9D);
        }
        
        private static boolean llIIIIIlIlllIII(final int lllllllllllllIlIIIIllIIIllllllII, final int lllllllllllllIlIIIIllIIIlllllIll) {
            return lllllllllllllIlIIIIllIIIllllllII >= lllllllllllllIlIIIIllIIIlllllIll;
        }
        
        public Penthouse() {
        }
        
        static {
            llIIIIIlIllIllI();
        }
    }
    
    static class YDoubleRoomFitHelper implements MonumentRoomFitHelper
    {
        private static final /* synthetic */ int[] lIlIlllIIIllIl;
        
        private static boolean llllIIllIIIlIll(final int lllllllllllllIIIIlIllllIIIllIIII) {
            return lllllllllllllIIIIlIllllIIIllIIII != 0;
        }
        
        private static void llllIIllIIIlIlI() {
            (lIlIlllIIIllIl = new int[2])[0] = " ".length();
            YDoubleRoomFitHelper.lIlIlllIIIllIl[1] = ((182 + 109 - 67 + 7 ^ 38 + 71 + 55 + 26) & (0x50 ^ 0x4F ^ (0xCF ^ 0x89) ^ -" ".length()));
        }
        
        private static boolean llllIIllIIIllII(final int lllllllllllllIIIIlIllllIIIlIlllI) {
            return lllllllllllllIIIIlIllllIIIlIlllI == 0;
        }
        
        @Override
        public Piece func_175968_a(final EnumFacing lllllllllllllIIIIlIllllIIIllIllI, final RoomDefinition lllllllllllllIIIIlIllllIIIllIlIl, final Random lllllllllllllIIIIlIllllIIIllIlII) {
            lllllllllllllIIIIlIllllIIIllIlIl.field_175963_d = (YDoubleRoomFitHelper.lIlIlllIIIllIl[0] != 0);
            lllllllllllllIIIIlIllllIIIllIlIl.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (YDoubleRoomFitHelper.lIlIlllIIIllIl[0] != 0);
            return new DoubleYRoom(lllllllllllllIIIIlIllllIIIllIllI, lllllllllllllIIIIlIllllIIIllIlIl, lllllllllllllIIIIlIllllIIIllIlII);
        }
        
        static {
            llllIIllIIIlIlI();
        }
        
        private YDoubleRoomFitHelper() {
        }
        
        @Override
        public boolean func_175969_a(final RoomDefinition lllllllllllllIIIIlIllllIIIlllllI) {
            if (llllIIllIIIlIll(lllllllllllllIIIIlIllllIIIlllllI.field_175966_c[EnumFacing.UP.getIndex()] ? 1 : 0) && llllIIllIIIllII(lllllllllllllIIIIlIllllIIIlllllI.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d ? 1 : 0)) {
                return YDoubleRoomFitHelper.lIlIlllIIIllIl[0] != 0;
            }
            return YDoubleRoomFitHelper.lIlIlllIIIllIl[1] != 0;
        }
    }
    
    public static class WingRoom extends Piece
    {
        private static final /* synthetic */ int[] lIlIlllIlIIIlI;
        private /* synthetic */ int field_175834_o;
        
        private static boolean llllIIlllIllIII(final int lllllllllllllIIIIlIllIIlIIIlIIIl, final int lllllllllllllIIIIlIllIIlIIIlIIII) {
            return lllllllllllllIIIIlIllIIlIIIlIIIl < lllllllllllllIIIIlIllIIlIIIlIIII;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIIlIllIIlIIlIIIIl, final Random lllllllllllllIIIIlIllIIlIIlIllII, final StructureBoundingBox lllllllllllllIIIIlIllIIlIIlIlIll) {
            if (llllIIlllIlIllI(this.field_175834_o)) {
                int lllllllllllllIIIIlIllIIlIIlIlIlI = WingRoom.lIlIlllIlIIIlI[1];
                "".length();
                if ((91 + 81 - 156 + 139 ^ 151 + 7 - 135 + 136) == 0x0) {
                    return ((92 + 100 - 92 + 49 ^ 51 + 131 - 43 + 47) & (0x29 ^ 0x30 ^ (0x9B ^ 0xAD) ^ -" ".length())) != 0x0;
                }
                while (!llllIIlllIlIlll(lllllllllllllIIIIlIllIIlIIlIlIlI, WingRoom.lIlIlllIlIIIlI[6])) {
                    this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[2] - lllllllllllllIIIIlIllIIlIIlIlIlI, WingRoom.lIlIlllIlIIIlI[3] - lllllllllllllIIIIlIllIIlIIlIlIlI, WingRoom.lIlIlllIlIIIlI[4] - lllllllllllllIIIIlIllIIlIIlIlIlI, WingRoom.lIlIlllIlIIIlI[5] + lllllllllllllIIIIlIllIIlIIlIlIlI, WingRoom.lIlIlllIlIIIlI[3] - lllllllllllllIIIIlIllIIlIIlIlIlI, WingRoom.lIlIlllIlIIIlI[4], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                    ++lllllllllllllIIIIlIllIIlIIlIlIlI;
                }
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[9], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[10], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[4], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[10], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[10], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[4], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[4], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[9], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[9], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[4], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[11], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[8], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[12], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[9], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[8], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[11], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[7], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[12], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[14], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[7], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[11], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[15], WingRoom.lIlIlllIlIIIlI[12], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[15], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[2], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[5], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[7], WingRoom.field_175827_c, WingRoom.field_175827_c, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[2], WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[5], WingRoom.field_175827_c, WingRoom.field_175827_c, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[14], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[2], WingRoom.lIlIlllIlIIIlI[14], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[5], WingRoom.field_175827_c, WingRoom.field_175827_c, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                int lllllllllllllIIIIlIllIIlIIlIlIIl = WingRoom.lIlIlllIlIIIlI[16];
                "".length();
                if (((0x56 ^ 0x0) & ~(0x5E ^ 0x8) & ~((0x9D ^ 0x96) & ~(0xCC ^ 0xC7))) != 0x0) {
                    return ((0xD5 ^ 0x82) & ~(0x59 ^ 0xE)) != 0x0;
                }
                while (!llllIIlllIllIII(lllllllllllllIIIIlIllIIlIIlIlIIl, WingRoom.lIlIlllIlIIIlI[7])) {
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[3], lllllllllllllIIIIlIllIIlIIlIlIIl, lllllllllllllIIIIlIllIIlIIlIlIll);
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[10], WingRoom.lIlIlllIlIIIlI[3], lllllllllllllIIIIlIllIIlIIlIlIIl, lllllllllllllIIIIlIllIIlIIlIlIll);
                    lllllllllllllIIIIlIllIIlIIlIlIIl -= 3;
                }
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[2], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[2], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[5], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[2], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[2], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[5], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[5], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[5], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[8], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[14], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[8], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[6], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[6], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[6], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[6], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[6], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[6], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[16], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[16], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[16], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[16], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[0], WingRoom.lIlIlllIlIIIlI[16], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[16], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[11], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[4], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, WingRoom.lIlIlllIlIIIlI[12], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[4], lllllllllllllIIIIlIllIIlIIlIlIll);
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[18], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[18], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[9], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[18], WingRoom.lIlIlllIlIIIlI[10], WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[18], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.func_175817_a(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[19], WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[10]);
                "".length();
                "".length();
                if (-" ".length() > -" ".length()) {
                    return ((0x4 ^ 0x9) & ~(0x44 ^ 0x49)) != 0x0;
                }
            }
            else if (llllIIlllIllIIl(this.field_175834_o, WingRoom.lIlIlllIlIIIlI[0])) {
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[11], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[12], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[4], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[11], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[11], WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[16], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[12], WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[16], WingRoom.lIlIlllIlIIIlI[12], WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[16], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                int lllllllllllllIIIIlIllIIlIIlIlIII = WingRoom.lIlIlllIlIIIlI[11];
                final int lllllllllllllIIIIlIllIIlIIlIIlll = WingRoom.lIlIlllIlIIIlI[4];
                final int lllllllllllllIIIIlIllIIlIIlIIllI = WingRoom.lIlIlllIlIIIlI[15];
                int lllllllllllllIIIIlIllIIlIIlIIlIl = WingRoom.lIlIlllIlIIIlI[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0x29 ^ 0x36) & ~(0x72 ^ 0x6D)) != 0x0;
                }
                while (!llllIIlllIlIlll(lllllllllllllIIIIlIllIIlIIlIIlIl, WingRoom.lIlIlllIlIIIlI[17])) {
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, lllllllllllllIIIIlIllIIlIIlIlIII, lllllllllllllIIIIlIllIIlIIlIIllI + WingRoom.lIlIlllIlIIIlI[0], lllllllllllllIIIIlIllIIlIIlIIlll, lllllllllllllIIIIlIllIIlIIlIlIll);
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, lllllllllllllIIIIlIllIIlIIlIlIII, lllllllllllllIIIIlIllIIlIIlIIllI, lllllllllllllIIIIlIllIIlIIlIIlll, lllllllllllllIIIIlIllIIlIIlIlIll);
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175826_b, lllllllllllllIIIIlIllIIlIIlIlIII, lllllllllllllIIIIlIllIIlIIlIIllI - WingRoom.lIlIlllIlIIIlI[0], lllllllllllllIIIIlIllIIlIIlIIlll, lllllllllllllIIIIlIllIIlIIlIlIll);
                    lllllllllllllIIIIlIllIIlIIlIlIII = WingRoom.lIlIlllIlIIIlI[12];
                    ++lllllllllllllIIIIlIllIIlIIlIIlIl;
                }
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[7], WingRoom.lIlIlllIlIIIlI[9], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[14], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                lllllllllllllIIIIlIllIIlIIlIlIII = WingRoom.lIlIlllIlIIIlI[2];
                int lllllllllllllIIIIlIllIIlIIlIIlII = WingRoom.lIlIlllIlIIIlI[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                }
                while (!llllIIlllIlIlll(lllllllllllllIIIIlIllIIlIIlIIlII, WingRoom.lIlIlllIlIIIlI[17])) {
                    this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[2], lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[2], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                    this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[5], lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[8], WingRoom.lIlIlllIlIIIlI[5], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[2], lllllllllllllIIIIlIllIIlIIlIlIll);
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[5], lllllllllllllIIIIlIllIIlIIlIlIll);
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[2], lllllllllllllIIIIlIllIIlIIlIlIll);
                    this.setBlockState(lllllllllllllIIIIlIllIIlIIlIIIIl, WingRoom.field_175825_e, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[6], WingRoom.lIlIlllIlIIIlI[5], lllllllllllllIIIIlIllIIlIIlIlIll);
                    lllllllllllllIIIIlIllIIlIIlIlIII = WingRoom.lIlIlllIlIIIlI[5];
                    ++lllllllllllllIIIIlIllIIlIIlIIlII;
                }
                lllllllllllllIIIIlIllIIlIIlIlIII = WingRoom.lIlIlllIlIIIlI[13];
                int lllllllllllllIIIIlIllIIlIIlIIIll = WingRoom.lIlIlllIlIIIlI[1];
                "".length();
                if ((0x63 ^ 0x2D ^ (0x21 ^ 0x6B)) < 0) {
                    return ((0x60 ^ 0x75 ^ (0x9B ^ 0xA4)) & (0x91 ^ 0xC3 ^ (0xDB ^ 0xA3) ^ -" ".length())) != 0x0;
                }
                while (!llllIIlllIlIlll(lllllllllllllIIIIlIllIIlIIlIIIll, WingRoom.lIlIlllIlIIIlI[17])) {
                    this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[7], lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[7], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                    this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[1], WingRoom.lIlIlllIlIIIlI[14], lllllllllllllIIIIlIllIIlIIlIlIII, WingRoom.lIlIlllIlIIIlI[17], WingRoom.lIlIlllIlIIIlI[14], WingRoom.field_175826_b, WingRoom.field_175826_b, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                    lllllllllllllIIIIlIllIIlIIlIlIII = WingRoom.lIlIlllIlIIIlI[14];
                    ++lllllllllllllIIIIlIllIIlIIlIIIll;
                }
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[12], WingRoom.field_175827_c, WingRoom.field_175827_c, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[14], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[13], WingRoom.lIlIlllIlIIIlI[14], WingRoom.lIlIlllIlIIIlI[3], WingRoom.lIlIlllIlIIIlI[12], WingRoom.field_175827_c, WingRoom.field_175827_c, (boolean)(WingRoom.lIlIlllIlIIIlI[1] != 0));
                this.func_175817_a(lllllllllllllIIIIlIllIIlIIlIIIIl, lllllllllllllIIIIlIllIIlIIlIlIll, WingRoom.lIlIlllIlIIIlI[19], WingRoom.lIlIlllIlIIIlI[15], WingRoom.lIlIlllIlIIIlI[12]);
                "".length();
            }
            return WingRoom.lIlIlllIlIIIlI[0] != 0;
        }
        
        private static boolean llllIIlllIllIIl(final int lllllllllllllIIIIlIllIIlIIIllIIl, final int lllllllllllllIIIIlIllIIlIIIllIII) {
            return lllllllllllllIIIIlIllIIlIIIllIIl == lllllllllllllIIIIlIllIIlIIIllIII;
        }
        
        private static void llllIIlllIlIlIl() {
            (lIlIlllIlIIIlI = new int[20])[0] = " ".length();
            WingRoom.lIlIlllIlIIIlI[1] = ((0x1C ^ 0x45 ^ (0x27 ^ 0x4E)) & (102 + 47 - 65 + 96 ^ 65 + 3 + 61 + 3 ^ -" ".length()));
            WingRoom.lIlIlllIlIIIlI[2] = (0x9B ^ 0x91);
            WingRoom.lIlIlllIlIIIlI[3] = "   ".length();
            WingRoom.lIlIlllIlIIIlI[4] = (0x5F ^ 0x17 ^ (0x7 ^ 0x5B));
            WingRoom.lIlIlllIlIIIlI[5] = (0x33 ^ 0x3F);
            WingRoom.lIlIlllIlIIIlI[6] = (0x31 ^ 0x35);
            WingRoom.lIlIlllIlIIIlI[7] = (0x42 ^ 0x45);
            WingRoom.lIlIlllIlIIIlI[8] = (0x72 ^ 0x36 ^ (0x1 ^ 0x43));
            WingRoom.lIlIlllIlIIIlI[9] = (0x85 ^ 0xB7 ^ (0x23 ^ 0x1E));
            WingRoom.lIlIlllIlIIIlI[10] = (16 + 14 + 111 + 7 ^ 118 + 33 - 79 + 60);
            WingRoom.lIlIlllIlIIIlI[11] = (0xA9 ^ 0xA0);
            WingRoom.lIlIlllIlIIIlI[12] = (0x1E ^ 0x13);
            WingRoom.lIlIlllIlIIIlI[13] = (0x67 ^ 0x6F);
            WingRoom.lIlIlllIlIIIlI[14] = (0x88 ^ 0x86);
            WingRoom.lIlIlllIlIIIlI[15] = (50 + 110 - 96 + 81 ^ 112 + 0 - 10 + 46);
            WingRoom.lIlIlllIlIIIlI[16] = (106 + 7 - 88 + 128 ^ 105 + 82 - 88 + 40);
            WingRoom.lIlIlllIlIIIlI[17] = "  ".length();
            WingRoom.lIlIlllIlIIIlI[18] = (0xF ^ 0x1A);
            WingRoom.lIlIlllIlIIIlI[19] = (0x5F ^ 0x2D ^ (0xFD ^ 0x84));
        }
        
        private static boolean llllIIlllIlIlll(final int lllllllllllllIIIIlIllIIlIIIlIlIl, final int lllllllllllllIIIIlIllIIlIIIlIlII) {
            return lllllllllllllIIIIlIllIIlIIIlIlIl >= lllllllllllllIIIIlIllIIlIIIlIlII;
        }
        
        private static boolean llllIIlllIlIllI(final int lllllllllllllIIIIlIllIIlIIIIlllI) {
            return lllllllllllllIIIIlIllIIlIIIIlllI == 0;
        }
        
        public WingRoom() {
        }
        
        public WingRoom(final EnumFacing lllllllllllllIIIIlIllIIlIIlllIII, final StructureBoundingBox lllllllllllllIIIIlIllIIlIIllIlll, final int lllllllllllllIIIIlIllIIlIIllIllI) {
            super(lllllllllllllIIIIlIllIIlIIlllIII, lllllllllllllIIIIlIllIIlIIllIlll);
            this.field_175834_o = (lllllllllllllIIIIlIllIIlIIllIllI & WingRoom.lIlIlllIlIIIlI[0]);
        }
        
        static {
            llllIIlllIlIlIl();
        }
    }
    
    public static class MonumentBuilding extends Piece
    {
        private static final /* synthetic */ int[] llIIlIlIIIlIll;
        private /* synthetic */ RoomDefinition field_175845_o;
        private /* synthetic */ RoomDefinition field_175844_p;
        private /* synthetic */ List<Piece> field_175843_q;
        
        private List<RoomDefinition> func_175836_a(final Random llllllllllllIlllIIlIIIIIlIIIlIIl) {
            final RoomDefinition[] llllllllllllIlllIIlIIIIIlIlIlIll = new RoomDefinition[MonumentBuilding.llIIlIlIIIlIll[15]];
            int llllllllllllIlllIIlIIIIIlIlIlIlI = MonumentBuilding.llIIlIlIIIlIll[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
            while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIlIlIlI, MonumentBuilding.llIIlIlIIIlIll[17])) {
                int llllllllllllIlllIIlIIIIIlIlIlIIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (-(0xE8 ^ 0x93 ^ 63 + 109 - 128 + 83) > 0) {
                    return null;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIlIlIIl, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    final int llllllllllllIlllIIlIIIIIlIlIlIII = MonumentBuilding.llIIlIlIIIlIll[0];
                    final int llllllllllllIlllIIlIIIIIlIlIIlll = Piece.func_175820_a(llllllllllllIlllIIlIIIIIlIlIlIlI, llllllllllllIlllIIlIIIIIlIlIlIII, llllllllllllIlllIIlIIIIIlIlIlIIl);
                    llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIlIIlll] = new RoomDefinition(llllllllllllIlllIIlIIIIIlIlIIlll);
                    ++llllllllllllIlllIIlIIIIIlIlIlIIl;
                }
                ++llllllllllllIlllIIlIIIIIlIlIlIlI;
            }
            int llllllllllllIlllIIlIIIIIlIlIIllI = MonumentBuilding.llIIlIlIIIlIll[0];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
            while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIlIIllI, MonumentBuilding.llIIlIlIIIlIll[17])) {
                int llllllllllllIlllIIlIIIIIlIlIIlIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (-(41 + 139 - 165 + 141 ^ 71 + 80 - 47 + 49) >= 0) {
                    return null;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIlIIlIl, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    final int llllllllllllIlllIIlIIIIIlIlIIlII = MonumentBuilding.llIIlIlIIIlIll[3];
                    final int llllllllllllIlllIIlIIIIIlIlIIIll = Piece.func_175820_a(llllllllllllIlllIIlIIIIIlIlIIllI, llllllllllllIlllIIlIIIIIlIlIIlII, llllllllllllIlllIIlIIIIIlIlIIlIl);
                    llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIlIIIll] = new RoomDefinition(llllllllllllIlllIIlIIIIIlIlIIIll);
                    ++llllllllllllIlllIIlIIIIIlIlIIlIl;
                }
                ++llllllllllllIlllIIlIIIIIlIlIIllI;
            }
            int llllllllllllIlllIIlIIIIIlIlIIIlI = MonumentBuilding.llIIlIlIIIlIll[3];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
            while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[16])) {
                int llllllllllllIlllIIlIIIIIlIlIIIIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (" ".length() < " ".length()) {
                    return null;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIlIIIIl, MonumentBuilding.llIIlIlIIIlIll[18])) {
                    final int llllllllllllIlllIIlIIIIIlIlIIIII = MonumentBuilding.llIIlIlIIIlIll[18];
                    final int llllllllllllIlllIIlIIIIIlIIlllll = Piece.func_175820_a(llllllllllllIlllIIlIIIIIlIlIIIlI, llllllllllllIlllIIlIIIIIlIlIIIII, llllllllllllIlllIIlIIIIIlIlIIIIl);
                    llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIIlllll] = new RoomDefinition(llllllllllllIlllIIlIIIIIlIIlllll);
                    ++llllllllllllIlllIIlIIIIIlIlIIIIl;
                }
                ++llllllllllllIlllIIlIIIIIlIlIIIlI;
            }
            this.field_175845_o = llllllllllllIlllIIlIIIIIlIlIlIll[MonumentBuilding.field_175823_g];
            int llllllllllllIlllIIlIIIIIlIIllllI = MonumentBuilding.llIIlIlIIIlIll[0];
            "".length();
            if (((0x82 ^ 0xBD) & ~(0x91 ^ 0xAE)) >= " ".length()) {
                return null;
            }
            while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIIllllI, MonumentBuilding.llIIlIlIIIlIll[17])) {
                int llllllllllllIlllIIlIIIIIlIIlllIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIIlllIl, MonumentBuilding.llIIlIlIIIlIll[17])) {
                    int llllllllllllIlllIIlIIIIIlIIlllII = MonumentBuilding.llIIlIlIIIlIll[0];
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return null;
                    }
                    while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIIlllII, MonumentBuilding.llIIlIlIIIlIll[19])) {
                        final int llllllllllllIlllIIlIIIIIlIIllIll = Piece.func_175820_a(llllllllllllIlllIIlIIIIIlIIllllI, llllllllllllIlllIIlIIIIIlIIlllII, llllllllllllIlllIIlIIIIIlIIlllIl);
                        if (lIIIllIIllIlllll(llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIIllIll])) {
                            final Exception llllllllllllIlllIIlIIIIIlIIIIIII;
                            final char llllllllllllIlllIIlIIIIIlIIIIIIl = (char)((EnumFacing[])(Object)(llllllllllllIlllIIlIIIIIlIIIIIII = (Exception)(Object)EnumFacing.values())).length;
                            double llllllllllllIlllIIlIIIIIlIIIIIlI = MonumentBuilding.llIIlIlIIIlIll[0];
                            "".length();
                            if (((0x3F ^ 0x8) & ~(0x40 ^ 0x77)) == "   ".length()) {
                                return null;
                            }
                            while (!lIIIllIIllIllllI((int)llllllllllllIlllIIlIIIIIlIIIIIlI, llllllllllllIlllIIlIIIIIlIIIIIIl)) {
                                final EnumFacing llllllllllllIlllIIlIIIIIlIIllIlI = llllllllllllIlllIIlIIIIIlIIIIIII[llllllllllllIlllIIlIIIIIlIIIIIlI];
                                final int llllllllllllIlllIIlIIIIIlIIllIIl = llllllllllllIlllIIlIIIIIlIIllllI + llllllllllllIlllIIlIIIIIlIIllIlI.getFrontOffsetX();
                                final int llllllllllllIlllIIlIIIIIlIIllIII = llllllllllllIlllIIlIIIIIlIIlllII + llllllllllllIlllIIlIIIIIlIIllIlI.getFrontOffsetY();
                                final int llllllllllllIlllIIlIIIIIlIIlIlll = llllllllllllIlllIIlIIIIIlIIlllIl + llllllllllllIlllIIlIIIIIlIIllIlI.getFrontOffsetZ();
                                if (lIIIllIIlllIIIII(llllllllllllIlllIIlIIIIIlIIllIIl) && lIIIllIIlllIIIIl(llllllllllllIlllIIlIIIIIlIIllIIl, MonumentBuilding.llIIlIlIIIlIll[17]) && lIIIllIIlllIIIII(llllllllllllIlllIIlIIIIIlIIlIlll) && lIIIllIIlllIIIIl(llllllllllllIlllIIlIIIIIlIIlIlll, MonumentBuilding.llIIlIlIIIlIll[17]) && lIIIllIIlllIIIII(llllllllllllIlllIIlIIIIIlIIllIII) && lIIIllIIlllIIIIl(llllllllllllIlllIIlIIIIIlIIllIII, MonumentBuilding.llIIlIlIIIlIll[19])) {
                                    final int llllllllllllIlllIIlIIIIIlIIlIllI = Piece.func_175820_a(llllllllllllIlllIIlIIIIIlIIllIIl, llllllllllllIlllIIlIIIIIlIIllIII, llllllllllllIlllIIlIIIIIlIIlIlll);
                                    if (lIIIllIIllIlllll(llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIIlIllI])) {
                                        if (lIIIllIIlllIIIlI(llllllllllllIlllIIlIIIIIlIIlIlll, llllllllllllIlllIIlIIIIIlIIlllIl)) {
                                            llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIIllIll].func_175957_a(llllllllllllIlllIIlIIIIIlIIllIlI.getOpposite(), llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIIlIllI]);
                                            "".length();
                                            if (((0xB1 ^ 0x98 ^ (0x70 ^ 0x13)) & (0x23 ^ 0x42 ^ (0x98 ^ 0xB3) ^ -" ".length())) > 0) {
                                                return null;
                                            }
                                        }
                                        else {
                                            llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIIllIll].func_175957_a(llllllllllllIlllIIlIIIIIlIIllIlI, llllllllllllIlllIIlIIIIIlIlIlIll[llllllllllllIlllIIlIIIIIlIIlIllI]);
                                        }
                                    }
                                }
                                ++llllllllllllIlllIIlIIIIIlIIIIIlI;
                            }
                        }
                        ++llllllllllllIlllIIlIIIIIlIIlllII;
                    }
                    ++llllllllllllIlllIIlIIIIIlIIlllIl;
                }
                ++llllllllllllIlllIIlIIIIIlIIllllI;
            }
            final RoomDefinition llllllllllllIlllIIlIIIIIlIIlIlIl;
            llllllllllllIlllIIlIIIIIlIlIlIll[MonumentBuilding.field_175831_h].func_175957_a(EnumFacing.UP, llllllllllllIlllIIlIIIIIlIIlIlIl = new RoomDefinition(MonumentBuilding.llIIlIlIIIlIll[20]));
            final RoomDefinition llllllllllllIlllIIlIIIIIlIIlIlII;
            llllllllllllIlllIIlIIIIIlIlIlIll[MonumentBuilding.field_175832_i].func_175957_a(EnumFacing.SOUTH, llllllllllllIlllIIlIIIIIlIIlIlII = new RoomDefinition(MonumentBuilding.llIIlIlIIIlIll[21]));
            final RoomDefinition llllllllllllIlllIIlIIIIIlIIlIIll;
            llllllllllllIlllIIlIIIIIlIlIlIll[MonumentBuilding.field_175829_j].func_175957_a(EnumFacing.SOUTH, llllllllllllIlllIIlIIIIIlIIlIIll = new RoomDefinition(MonumentBuilding.llIIlIlIIIlIll[22]));
            llllllllllllIlllIIlIIIIIlIIlIlIl.field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            llllllllllllIlllIIlIIIIIlIIlIlII.field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            llllllllllllIlllIIlIIIIIlIIlIIll.field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175845_o.field_175964_e = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p = llllllllllllIlllIIlIIIIIlIlIlIll[Piece.func_175820_a(llllllllllllIlllIIlIIIIIlIIIlIIl.nextInt(MonumentBuilding.llIIlIlIIIlIll[16]), MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[18])];
            this.field_175844_p.field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p.field_175965_b[EnumFacing.EAST.getIndex()].field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p.field_175965_b[EnumFacing.NORTH.getIndex()].field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p.field_175965_b[EnumFacing.EAST.getIndex()].field_175965_b[EnumFacing.NORTH.getIndex()].field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p.field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p.field_175965_b[EnumFacing.EAST.getIndex()].field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p.field_175965_b[EnumFacing.NORTH.getIndex()].field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175844_p.field_175965_b[EnumFacing.EAST.getIndex()].field_175965_b[EnumFacing.NORTH.getIndex()].field_175965_b[EnumFacing.UP.getIndex()].field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            final List<RoomDefinition> llllllllllllIlllIIlIIIIIlIIlIIlI = (List<RoomDefinition>)Lists.newArrayList();
            Exception llllllllllllIlllIIlIIIIIlIIIIIII;
            char llllllllllllIlllIIlIIIIIlIIIIIIl = (char)((RoomDefinition[])(Object)(llllllllllllIlllIIlIIIIIlIIIIIII = (Exception)(Object)llllllllllllIlllIIlIIIIIlIlIlIll)).length;
            double llllllllllllIlllIIlIIIIIlIIIIIlI = MonumentBuilding.llIIlIlIIIlIll[0];
            "".length();
            if ((0x52 ^ 0x30 ^ (0xCA ^ 0xAC)) <= " ".length()) {
                return null;
            }
            while (!lIIIllIIllIllllI((int)llllllllllllIlllIIlIIIIIlIIIIIlI, llllllllllllIlllIIlIIIIIlIIIIIIl)) {
                final RoomDefinition llllllllllllIlllIIlIIIIIlIIlIIIl = llllllllllllIlllIIlIIIIIlIIIIIII[llllllllllllIlllIIlIIIIIlIIIIIlI];
                if (lIIIllIIllIlllll(llllllllllllIlllIIlIIIIIlIIlIIIl)) {
                    llllllllllllIlllIIlIIIIIlIIlIIIl.func_175958_a();
                    llllllllllllIlllIIlIIIIIlIIlIIlI.add(llllllllllllIlllIIlIIIIIlIIlIIIl);
                    "".length();
                }
                ++llllllllllllIlllIIlIIIIIlIIIIIlI;
            }
            llllllllllllIlllIIlIIIIIlIIlIlIl.func_175958_a();
            Collections.shuffle(llllllllllllIlllIIlIIIIIlIIlIIlI, llllllllllllIlllIIlIIIIIlIIIlIIl);
            int llllllllllllIlllIIlIIIIIlIIlIIII = MonumentBuilding.llIIlIlIIIlIll[3];
            llllllllllllIlllIIlIIIIIlIIIIIIl = (char)llllllllllllIlllIIlIIIIIlIIlIIlI.iterator();
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
            while (!lIIIllIIllIlllII(((Iterator)llllllllllllIlllIIlIIIIIlIIIIIIl).hasNext() ? 1 : 0)) {
                final RoomDefinition llllllllllllIlllIIlIIIIIlIIIllll = ((Iterator<RoomDefinition>)llllllllllllIlllIIlIIIIIlIIIIIIl).next();
                int llllllllllllIlllIIlIIIIIlIIIlllI = MonumentBuilding.llIIlIlIIIlIll[0];
                int llllllllllllIlllIIlIIIIIlIIIllIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ((0x31 ^ 0x35) == 0x0) {
                    return null;
                }
                while (lIIIllIIlllIIIIl(llllllllllllIlllIIlIIIIIlIIIlllI, MonumentBuilding.llIIlIlIIIlIll[18]) && !lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIlIIIllIl, MonumentBuilding.llIIlIlIIIlIll[17])) {
                    ++llllllllllllIlllIIlIIIIIlIIIllIl;
                    final int llllllllllllIlllIIlIIIIIlIIIllII = llllllllllllIlllIIlIIIIIlIIIlIIl.nextInt(MonumentBuilding.llIIlIlIIIlIll[23]);
                    if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIlIIIllll.field_175966_c[llllllllllllIlllIIlIIIIIlIIIllII] ? 1 : 0)) {
                        final int llllllllllllIlllIIlIIIIIlIIIlIll = EnumFacing.getFront(llllllllllllIlllIIlIIIIIlIIIllII).getOpposite().getIndex();
                        llllllllllllIlllIIlIIIIIlIIIllll.field_175966_c[llllllllllllIlllIIlIIIIIlIIIllII] = (MonumentBuilding.llIIlIlIIIlIll[0] != 0);
                        llllllllllllIlllIIlIIIIIlIIIllll.field_175965_b[llllllllllllIlllIIlIIIIIlIIIllII].field_175966_c[llllllllllllIlllIIlIIIIIlIIIlIll] = (MonumentBuilding.llIIlIlIIIlIll[0] != 0);
                        if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIlIIIllll.func_175959_a(llllllllllllIlllIIlIIIIIlIIlIIII++) ? 1 : 0) && lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIlIIIllll.field_175965_b[llllllllllllIlllIIlIIIIIlIIIllII].func_175959_a(llllllllllllIlllIIlIIIIIlIIlIIII++) ? 1 : 0)) {
                            ++llllllllllllIlllIIlIIIIIlIIIlllI;
                            "".length();
                            if ((78 + 131 - 198 + 147 ^ 154 + 117 - 182 + 66) == 0x0) {
                                return null;
                            }
                            continue;
                        }
                        else {
                            llllllllllllIlllIIlIIIIIlIIIllll.field_175966_c[llllllllllllIlllIIlIIIIIlIIIllII] = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
                            llllllllllllIlllIIlIIIIIlIIIllll.field_175965_b[llllllllllllIlllIIlIIIIIlIIIllII].field_175966_c[llllllllllllIlllIIlIIIIIlIIIlIll] = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
                        }
                    }
                }
            }
            llllllllllllIlllIIlIIIIIlIIlIIlI.add(llllllllllllIlllIIlIIIIIlIIlIlIl);
            "".length();
            llllllllllllIlllIIlIIIIIlIIlIIlI.add(llllllllllllIlllIIlIIIIIlIIlIlII);
            "".length();
            llllllllllllIlllIIlIIIIIlIIlIIlI.add(llllllllllllIlllIIlIIIIIlIIlIIll);
            "".length();
            return llllllllllllIlllIIlIIIIIlIIlIIlI;
        }
        
        private void func_175840_a(final boolean llllllllllllIlllIIlIIIIIIlIIllIl, final int llllllllllllIlllIIlIIIIIIIlllllI, final World llllllllllllIlllIIlIIIIIIlIIlIll, final Random llllllllllllIlllIIlIIIIIIlIIlIlI, final StructureBoundingBox llllllllllllIlllIIlIIIIIIlIIlIIl) {
            final int llllllllllllIlllIIlIIIIIIlIIlIII = MonumentBuilding.llIIlIlIIIlIll[29];
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI, MonumentBuilding.llIIlIlIIIlIll[0], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[30]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[0], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[29], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[0], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[29], MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[30], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIlIIIIIIlIIIlll = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (" ".length() >= (0x49 ^ 0x3B ^ (0xF7 ^ 0x81))) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIlIIIlll, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[3], llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIIlllllI + llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[27], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[27], llllllllllllIlllIIlIIIIIIIlllllI + llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[27], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[14] - llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[27], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[14] - llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[29] - llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[3], llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[29] - llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[3], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[3], llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[7] - llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[3], llllllllllllIlllIIlIIIIIIlIIIlll, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[9], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[27], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[32] - llllllllllllIlllIIlIIIIIIlIIIlll, llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIIlll + MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIlIIIIIIlIIIlll;
                }
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[33], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[34], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.setBlockState(llllllllllllIlllIIlIIIIIIlIIlIll, MonumentBuilding.field_175824_d, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[35], llllllllllllIlllIIlIIIIIIlIIlIIl);
                this.setBlockState(llllllllllllIlllIIlIIIIIIlIIlIll, MonumentBuilding.field_175824_d, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[36], llllllllllllIlllIIlIIIIIIlIIlIIl);
                this.setBlockState(llllllllllllIlllIIlIIIIIIlIIlIll, MonumentBuilding.field_175824_d, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[33], llllllllllllIlllIIlIIIIIIlIIlIIl);
                int n;
                if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIIlIIllIl ? 1 : 0)) {
                    n = llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[37];
                    "".length();
                    if ((0xC6 ^ 0xC2) < 0) {
                        return;
                    }
                }
                else {
                    n = llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[17];
                }
                final int llllllllllllIlllIIlIIIIIIlIIIllI = n;
                int n2;
                if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIIlIIllIl ? 1 : 0)) {
                    n2 = llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[17];
                    "".length();
                    if ((101 + 48 - 19 + 51 ^ 58 + 21 - 38 + 135) == 0x0) {
                        return;
                    }
                }
                else {
                    n2 = llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[37];
                }
                final int llllllllllllIlllIIlIIIIIIlIIIlIl = n2;
                int llllllllllllIlllIIlIIIIIIlIIIlII = MonumentBuilding.llIIlIlIIIlIll[30];
                "".length();
                if (((0xD ^ 0x6B ^ (0x7B ^ 0x2A)) & (0x64 ^ 0x4C ^ (0x74 ^ 0x6B) ^ -" ".length())) <= -" ".length()) {
                    return;
                }
                while (!lIIIllIIlllIIIIl(llllllllllllIlllIIlIIIIIIlIIIlII, MonumentBuilding.llIIlIlIIIlIll[17])) {
                    this.setBlockState(llllllllllllIlllIIlIIIIIIlIIlIll, MonumentBuilding.field_175824_d, llllllllllllIlllIIlIIIIIIlIIIllI, MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIIlII, llllllllllllIlllIIlIIIIIIlIIlIIl);
                    llllllllllllIlllIIlIIIIIIlIIIlII -= 3;
                }
                int llllllllllllIlllIIlIIIIIIlIIIIll = MonumentBuilding.llIIlIlIIIlIll[37];
                "".length();
                if (((0x49 ^ 0xD ^ (0xDC ^ 0xC6)) & (168 + 92 - 105 + 94 ^ 32 + 152 - 162 + 145 ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!lIIIllIIlllIIIIl(llllllllllllIlllIIlIIIIIIlIIIIll, MonumentBuilding.llIIlIlIIIlIll[27])) {
                    this.setBlockState(llllllllllllIlllIIlIIIIIIlIIlIll, MonumentBuilding.field_175824_d, llllllllllllIlllIIlIIIIIIlIIIlIl, MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIIIll, llllllllllllIlllIIlIIIIIIlIIlIIl);
                    llllllllllllIlllIIlIIIIIIlIIIIll -= 3;
                }
                int llllllllllllIlllIIlIIIIIIlIIIIlI = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIlIIIIlI, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    int n3;
                    if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIIlIIllIl ? 1 : 0)) {
                        n3 = llllllllllllIlllIIlIIIIIIIlllllI + (MonumentBuilding.llIIlIlIIIlIll[29] - (MonumentBuilding.llIIlIlIIIlIll[14] - llllllllllllIlllIIlIIIIIIlIIIIlI * MonumentBuilding.llIIlIlIIIlIll[19]));
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        n3 = llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[14] - llllllllllllIlllIIlIIIIIIlIIIIlI * MonumentBuilding.llIIlIlIIIlIll[19];
                    }
                    final int llllllllllllIlllIIlIIIIIIlIIIIIl = n3;
                    this.setBlockState(llllllllllllIlllIIlIIIIIIlIIlIll, MonumentBuilding.field_175824_d, llllllllllllIlllIIlIIIIIIlIIIIIl, MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIlIIl);
                    ++llllllllllllIlllIIlIIIIIIlIIIIlI;
                }
                this.setBlockState(llllllllllllIlllIIlIIIIIIlIIlIll, MonumentBuilding.field_175824_d, llllllllllllIlllIIlIIIIIIlIIIlIl, MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIlIIlIIl);
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[35], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIlIIlIll, llllllllllllIlllIIlIIIIIIlIIlIIl, llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[34], llllllllllllIlllIIlIIIIIIIlllllI + MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
            }
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = MonumentBuilding.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIIllIIllIlllll($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final double llllllllllllIlllIIIlllllllIlIllI = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIlllIIIlllllllIlIllI[EnumFacing.DOWN.ordinal()] = MonumentBuilding.llIIlIlIIIlIll[3];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlllllllIlIllI[EnumFacing.EAST.ordinal()] = MonumentBuilding.llIIlIlIIIlIll[23];
                "".length();
                if (" ".length() > "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlllllllIlIllI[EnumFacing.NORTH.ordinal()] = MonumentBuilding.llIIlIlIIIlIll[19];
                "".length();
                if ((0x2D ^ 0x29) < "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlllllllIlIllI[EnumFacing.SOUTH.ordinal()] = MonumentBuilding.llIIlIlIIIlIll[16];
                "".length();
                if ((53 + 116 - 20 + 23 ^ 54 + 97 - 81 + 98) < "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlllllllIlIllI[EnumFacing.UP.ordinal()] = MonumentBuilding.llIIlIlIIIlIll[18];
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlllllllIlIllI[EnumFacing.WEST.ordinal()] = MonumentBuilding.llIIlIlIIIlIll[17];
                "".length();
                if ((0xC4 ^ 0x9F ^ (0xC5 ^ 0x9A)) < " ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return MonumentBuilding.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlllIIIlllllllIlIllI;
        }
        
        private static boolean lIIIllIIllIlllll(final Object llllllllllllIlllIIIlllllllIIIlII) {
            return llllllllllllIlllIIIlllllllIIIlII != null;
        }
        
        private static boolean lIIIllIIllIlllII(final int llllllllllllIlllIIIlllllllIIIIII) {
            return llllllllllllIlllIIIlllllllIIIIII == 0;
        }
        
        private static boolean lIIIllIIlllIIIlI(final int llllllllllllIlllIIIllllllIlllIll, final int llllllllllllIlllIIIllllllIlllIlI) {
            return llllllllllllIlllIIIllllllIlllIll != llllllllllllIlllIIIllllllIlllIlI;
        }
        
        private void func_175839_b(final World llllllllllllIlllIIlIIIIIIIllIIIl, final Random llllllllllllIlllIIlIIIIIIIllIIII, final StructureBoundingBox llllllllllllIlllIIlIIIIIIIlIlIll) {
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIlIIIIIIIlIlIll, MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[13], MonumentBuilding.llIIlIlIIIlIll[14]) ? 1 : 0)) {
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIllIIIl, llllllllllllIlllIIlIIIIIIIlIlIll, MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[30], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIlIIIIIIIlIlllI = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIlIlllI, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIllIIIl, llllllllllllIlllIIlIIIIIIIlIlIll, MonumentBuilding.llIIlIlIIIlIll[29], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[29], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIllIIIl, llllllllllllIlllIIlIIIIIIIlIlIll, MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIllIIIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlIlIll);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIllIIIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[40], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlIlIll);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIllIIIl, MonumentBuilding.field_175825_e, MonumentBuilding.llIIlIlIIIlIll[40], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlIlIll);
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIllIIIl, llllllllllllIlllIIlIIIIIIIlIlIll, MonumentBuilding.llIIlIlIIIlIll[25], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[25], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIllIIIl, llllllllllllIlllIIlIIIIIIIlIlIll, MonumentBuilding.llIIlIlIIIlIll[10], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[13], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIllIIIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlIlIll);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIllIIIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[41], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlIlIll);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIllIIIl, MonumentBuilding.field_175825_e, MonumentBuilding.llIIlIlIIIlIll[41], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], llllllllllllIlllIIlIIIIIIIlIlIll);
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIllIIIl, llllllllllllIlllIIlIIIIIIIlIlIll, MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIlIIIIIIIlIlllI * MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIlIIIIIIIlIlllI;
                }
            }
        }
        
        public MonumentBuilding() {
            this.field_175843_q = (List<Piece>)Lists.newArrayList();
        }
        
        private static boolean lIIIllIIlllIIlII(final int llllllllllllIlllIIIlllllllIIIlll, final int llllllllllllIlllIIIlllllllIIIllI) {
            return llllllllllllIlllIIIlllllllIIIlll > llllllllllllIlllIIIlllllllIIIllI;
        }
        
        private static boolean lIIIllIIlllIIIll(final int llllllllllllIlllIIIlllllllIlIIll, final int llllllllllllIlllIIIlllllllIlIIlI) {
            return llllllllllllIlllIIIlllllllIlIIll == llllllllllllIlllIIIlllllllIlIIlI;
        }
        
        private void func_175841_d(final World llllllllllllIlllIIlIIIIIIIIlIlIl, final Random llllllllllllIlllIIlIIIIIIIIlIlII, final StructureBoundingBox llllllllllllIlllIIlIIIIIIIIlIIll) {
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[45]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[45], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIlIIIIIIIIlIIlI = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[8] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[8] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[45] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[8] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[8] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[45] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[45] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[45] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[8] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[6] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[8] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[13] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[45] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[6] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[45] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[12] + llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.llIIlIlIIIlIll[13] - llllllllllllIlllIIlIIIIIIIIlIIlI, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIlIIIIIIIIlIIlI;
                }
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[32], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[32], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[37], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[37], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[37], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[37], MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[40], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[40], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[42], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175825_e, MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[42], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[40], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[41], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[43], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175825_e, MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[43], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[41], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[41], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[43], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175825_e, MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[43], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[41], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[40], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[42], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlIlIl, MonumentBuilding.field_175825_e, MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[42], llllllllllllIlllIIlIIIIIIIIlIIll);
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[48], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[49], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[48], MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[49], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[48], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[49], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlIlIl, llllllllllllIlllIIlIIIIIIIIlIIll, MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[48], MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[49], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
            }
        }
        
        private static boolean lIIIllIIllIlllIl(final int llllllllllllIlllIIIlllllllIIIIlI) {
            return llllllllllllIlllIIIlllllllIIIIlI != 0;
        }
        
        private void func_175835_e(final World llllllllllllIlllIIIllllllllllllI, final Random llllllllllllIlllIIlIIIIIIIIIIlll, final StructureBoundingBox llllllllllllIlllIIIlllllllllllIl) {
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[2]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[28], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[28], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIlIIIIIIIIIIlIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIIIlIl, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, llllllllllllIlllIIlIIIIIIIIIIlIl, llllllllllllIlllIIlIIIIIIIIIIlIl + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIIIIlIl, llllllllllllIlllIIlIIIIIIIIIIlIl + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[28] - llllllllllllIlllIIlIIIIIIIIIIlIl, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIlIIIIIIIIIIlIl;
                }
                int llllllllllllIlllIIlIIIIIIIIIIlII = MonumentBuilding.llIIlIlIIIlIll[7];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIIIlII, MonumentBuilding.llIIlIlIIIlIll[51])) {
                    this.setBlockState(llllllllllllIlllIIIllllllllllllI, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIIIIIlII, llllllllllllIlllIIIlllllllllllIl);
                    llllllllllllIlllIIlIIIIIIIIIIlII += 3;
                }
                this.setBlockState(llllllllllllIlllIIIllllllllllllI, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[52], llllllllllllIlllIIIlllllllllllIl);
                int llllllllllllIlllIIlIIIIIIIIIIIll = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIIIIll, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, llllllllllllIlllIIlIIIIIIIIIIIll, llllllllllllIlllIIlIIIIIIIIIIIll + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIIIIIll, llllllllllllIlllIIlIIIIIIIIIIIll + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[28] - llllllllllllIlllIIlIIIIIIIIIIIll, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIlIIIIIIIIIIIll;
                }
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
            }
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[2], MonumentBuilding.llIIlIlIIIlIll[2]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[28], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[28], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[28], MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[28], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIlIIIIIIIIIIIlI = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIIIIlI, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[28] - llllllllllllIlllIIlIIIIIIIIIIIlI, llllllllllllIlllIIlIIIIIIIIIIIlI + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[28] - llllllllllllIlllIIlIIIIIIIIIIIlI, llllllllllllIlllIIlIIIIIIIIIIIlI + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[28] - llllllllllllIlllIIlIIIIIIIIIIIlI, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIlIIIIIIIIIIIlI;
                }
                int llllllllllllIlllIIlIIIIIIIIIIIIl = MonumentBuilding.llIIlIlIIIlIll[7];
                "".length();
                if (((0x28 ^ 0x3D ^ (0xDA ^ 0xC7)) & (0xA7 ^ 0xB7 ^ (0xB9 ^ 0xA1) ^ -" ".length())) >= "  ".length()) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIIIIIl, MonumentBuilding.llIIlIlIIIlIll[51])) {
                    this.setBlockState(llllllllllllIlllIIIllllllllllllI, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.llIIlIlIIIlIll[17], llllllllllllIlllIIlIIIIIIIIIIIIl, llllllllllllIlllIIIlllllllllllIl);
                    llllllllllllIlllIIlIIIIIIIIIIIIl += 3;
                }
                this.setBlockState(llllllllllllIlllIIIllllllllllllI, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[52], llllllllllllIlllIIIlllllllllllIl);
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[52], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
            }
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[28], MonumentBuilding.llIIlIlIIIlIll[28]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[28], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[53], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[28], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIlIIIIIIIIIIIII = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ((0xAC ^ 0xA8) == " ".length()) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIIIIII, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIllllllllllllI, llllllllllllIlllIIIlllllllllllIl, llllllllllllIlllIIlIIIIIIIIIIIII + MonumentBuilding.llIIlIlIIIlIll[3], llllllllllllIlllIIlIIIIIIIIIIIII + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[28] - llllllllllllIlllIIlIIIIIIIIIIIII, MonumentBuilding.llIIlIlIIIlIll[11] - llllllllllllIlllIIlIIIIIIIIIIIII, llllllllllllIlllIIlIIIIIIIIIIIII + MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[28] - llllllllllllIlllIIlIIIIIIIIIIIII, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIlIIIIIIIIIIIII;
                }
            }
        }
        
        private static boolean lIIIllIIllIllllI(final int llllllllllllIlllIIIlllllllIIllll, final int llllllllllllIlllIIIlllllllIIlllI) {
            return llllllllllllIlllIIIlllllllIIllll >= llllllllllllIlllIIIlllllllIIlllI;
        }
        
        private void func_175842_f(final World llllllllllllIlllIIIlllllllllIllI, final Random llllllllllllIlllIIIlllllllllIlIl, final StructureBoundingBox llllllllllllIlllIIIllllllllIlIll) {
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[54]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[54], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIIlllllllllIIll = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIIlllllllllIIll, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, llllllllllllIlllIIIlllllllllIIll + MonumentBuilding.llIIlIlIIIlIll[27], llllllllllllIlllIIIlllllllllIIll + MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIIlllllllllIIll + MonumentBuilding.llIIlIlIIIlIll[27], llllllllllllIlllIIIlllllllllIIll + MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[55], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIIlllllllllIIll;
                }
                int llllllllllllIlllIIIlllllllllIIlI = MonumentBuilding.llIIlIlIIIlIll[8];
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
                while (!lIIIllIIlllIIlII(llllllllllllIlllIIIlllllllllIIlI, MonumentBuilding.llIIlIlIIIlIll[56])) {
                    this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[5], llllllllllllIlllIIIlllllllllIIlI, llllllllllllIlllIIIllllllllIlIll);
                    llllllllllllIlllIIIlllllllllIIlI += 3;
                }
            }
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.llIIlIlIIIlIll[55]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[54], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[58], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIIlllllllllIIIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ((0x33 ^ 0x37) <= -" ".length()) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIIlllllllllIIIl, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[54] - llllllllllllIlllIIIlllllllllIIIl, llllllllllllIlllIIIlllllllllIIIl + MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[54] - llllllllllllIlllIIIlllllllllIIIl, llllllllllllIlllIIIlllllllllIIIl + MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[55], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIIlllllllllIIIl;
                }
                int llllllllllllIlllIIIlllllllllIIII = MonumentBuilding.llIIlIlIIIlIll[8];
                "".length();
                if ("   ".length() <= ((123 + 77 - 74 + 4 ^ 15 + 158 - 26 + 25) & (47 + 142 - 107 + 77 ^ 172 + 150 - 200 + 55 ^ -" ".length()))) {
                    return;
                }
                while (!lIIIllIIlllIIlII(llllllllllllIlllIIIlllllllllIIII, MonumentBuilding.llIIlIlIIIlIll[56])) {
                    this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[56], MonumentBuilding.llIIlIlIIIlIll[5], llllllllllllIlllIIIlllllllllIIII, llllllllllllIlllIIIllllllllIlIll);
                    llllllllllllIlllIIIlllllllllIIII += 3;
                }
            }
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[59], MonumentBuilding.llIIlIlIIIlIll[55]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[54], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[54], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIIllllllllIllll = MonumentBuilding.llIIlIlIIIlIll[35];
                "".length();
                if (((155 + 41 - 18 + 50 ^ 172 + 45 - 149 + 113) & (0x92 ^ 0xC1 ^ "  ".length() ^ -" ".length())) < 0) {
                    return;
                }
                while (!lIIIllIIlllIIlII(llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[56])) {
                    this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[56], llllllllllllIlllIIIllllllllIlIll);
                    this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[52], llllllllllllIlllIIIllllllllIlIll);
                    if (!lIIIllIIlllIIIlI(llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[35]) || !lIIIllIIlllIIIlI(llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[33]) || !lIIIllIIlllIIIlI(llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[29]) || !lIIIllIIlllIIIlI(llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[25]) || !lIIIllIIlllIIIlI(llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[1]) || lIIIllIIlllIIIll(llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[56])) {
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[62], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[54], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[56], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[58], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[53], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[52], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[62], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[54], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[63], llllllllllllIlllIIIllllllllIlIll);
                        this.setBlockState(llllllllllllIlllIIIlllllllllIllI, MonumentBuilding.field_175824_d, llllllllllllIlllIIIllllllllIllll, MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[59], llllllllllllIlllIIIllllllllIlIll);
                    }
                    llllllllllllIlllIIIllllllllIllll += 3;
                }
                int llllllllllllIlllIIIllllllllIlllI = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIIllllllllIlllI, MonumentBuilding.llIIlIlIIIlIll[19])) {
                    this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[9] + llllllllllllIlllIIIllllllllIlllI, MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIIllllllllIlllI, MonumentBuilding.llIIlIlIIIlIll[55], MonumentBuilding.llIIlIlIIIlIll[59] - llllllllllllIlllIIIllllllllIlllI, MonumentBuilding.llIIlIlIIIlIll[17] + llllllllllllIlllIIIllllllllIlllI, MonumentBuilding.llIIlIlIIIlIll[55], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIIllllllllIlllI;
                }
                this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[55], MonumentBuilding.llIIlIlIIIlIll[58], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[55], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIlllllllllIllI, llllllllllllIlllIIIllllllllIlIll, MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[57], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[51], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
            }
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIIlIIIIIIllIllll, final Random llllllllllllIlllIIlIIIIIIllIIIIl, final StructureBoundingBox llllllllllllIlllIIlIIIIIIllIllIl) {
            final int llllllllllllIlllIIlIIIIIIllIllII = Math.max(llllllllllllIlllIIlIIIIIIllIllll.func_181545_F(), MonumentBuilding.llIIlIlIIIlIll[24]) - this.boundingBox.minY;
            this.func_181655_a(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIllIl, MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[2], llllllllllllIlllIIlIIIIIIllIllII, MonumentBuilding.llIIlIlIIIlIll[2], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
            this.func_175840_a((boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0), MonumentBuilding.llIIlIlIIIlIll[0], llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            this.func_175840_a((boolean)(MonumentBuilding.llIIlIlIIIlIll[3] != 0), MonumentBuilding.llIIlIlIIIlIll[25], llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            this.func_175839_b(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            this.func_175837_c(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            this.func_175841_d(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            this.func_175835_e(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            this.func_175842_f(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            this.func_175838_g(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
            int llllllllllllIlllIIlIIIIIIllIlIll = MonumentBuilding.llIIlIlIIIlIll[0];
            "".length();
            if (((0x22 ^ 0x2F) & ~(0xA1 ^ 0xAC)) >= (0x73 ^ 0x77)) {
                return ((0xE1 ^ 0xB7) & ~(0x6E ^ 0x38)) != 0x0;
            }
            while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIllIlIll, MonumentBuilding.llIIlIlIIIlIll[27])) {
                int llllllllllllIlllIIlIIIIIIllIlIlI = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (-(0x5F ^ 0x5B) > 0) {
                    return ((0x34 ^ 0x22) & ~(0xB7 ^ 0xA1)) != 0x0;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIllIlIlI, MonumentBuilding.llIIlIlIIIlIll[27])) {
                    if (lIIIllIIllIlllII(llllllllllllIlllIIlIIIIIIllIlIlI) && lIIIllIIlllIIIll(llllllllllllIlllIIlIIIIIIllIlIll, MonumentBuilding.llIIlIlIIIlIll[19])) {
                        llllllllllllIlllIIlIIIIIIllIlIlI = MonumentBuilding.llIIlIlIIIlIll[23];
                    }
                    final int llllllllllllIlllIIlIIIIIIllIlIIl = llllllllllllIlllIIlIIIIIIllIlIll * MonumentBuilding.llIIlIlIIIlIll[5];
                    final int llllllllllllIlllIIlIIIIIIllIlIII = llllllllllllIlllIIlIIIIIIllIlIlI * MonumentBuilding.llIIlIlIIIlIll[5];
                    int llllllllllllIlllIIlIIIIIIllIIlll = MonumentBuilding.llIIlIlIIIlIll[0];
                    "".length();
                    if (null != null) {
                        return ((0x59 ^ 0x50 ^ (0xC ^ 0x3)) & (9 + 185 - 98 + 92 ^ 36 + 73 - 88 + 165 ^ -" ".length())) != 0x0;
                    }
                    while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIllIIlll, MonumentBuilding.llIIlIlIIIlIll[16])) {
                        int llllllllllllIlllIIlIIIIIIllIIllI = MonumentBuilding.llIIlIlIIIlIll[0];
                        "".length();
                        if (((0x17 ^ 0x40) & ~(0x2E ^ 0x79)) != 0x0) {
                            return ((0x9B ^ 0xB6) & ~(0xBD ^ 0x90)) != 0x0;
                        }
                        while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIllIIllI, MonumentBuilding.llIIlIlIIIlIll[16])) {
                            this.setBlockState(llllllllllllIlllIIlIIIIIIllIllll, MonumentBuilding.field_175826_b, llllllllllllIlllIIlIIIIIIllIlIIl + llllllllllllIlllIIlIIIIIIllIIlll, MonumentBuilding.llIIlIlIIIlIll[0], llllllllllllIlllIIlIIIIIIllIlIII + llllllllllllIlllIIlIIIIIIllIIllI, llllllllllllIlllIIlIIIIIIllIllIl);
                            this.replaceAirAndLiquidDownwards(llllllllllllIlllIIlIIIIIIllIllll, MonumentBuilding.field_175826_b, llllllllllllIlllIIlIIIIIIllIlIIl + llllllllllllIlllIIlIIIIIIllIIlll, MonumentBuilding.llIIlIlIIIlIll[26], llllllllllllIlllIIlIIIIIIllIlIII + llllllllllllIlllIIlIIIIIIllIIllI, llllllllllllIlllIIlIIIIIIllIllIl);
                            ++llllllllllllIlllIIlIIIIIIllIIllI;
                        }
                        ++llllllllllllIlllIIlIIIIIIllIIlll;
                    }
                    if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIIllIlIll) && lIIIllIIlllIIIlI(llllllllllllIlllIIlIIIIIIllIlIll, MonumentBuilding.llIIlIlIIIlIll[23])) {
                        llllllllllllIlllIIlIIIIIIllIlIlI += 6;
                        "".length();
                        if (-" ".length() >= 0) {
                            return ((0x73 ^ 0x38 ^ (0x53 ^ 0x55)) & (98 + 238 - 127 + 46 ^ 161 + 75 - 150 + 92 ^ -" ".length())) != 0x0;
                        }
                        continue;
                    }
                    else {
                        ++llllllllllllIlllIIlIIIIIIllIlIlI;
                    }
                }
                ++llllllllllllIlllIIlIIIIIIllIlIll;
            }
            int llllllllllllIlllIIlIIIIIIllIIlIl = MonumentBuilding.llIIlIlIIIlIll[0];
            "".length();
            if ("   ".length() < 0) {
                return ((0x52 ^ 0xC ^ (0x41 ^ 0x25)) & (0xF7 ^ 0xC2 ^ (0x44 ^ 0x4B) ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[17])) {
                this.func_181655_a(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIllIl, MonumentBuilding.llIIlIlIIIlIll[26] - llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[0] + llllllllllllIlllIIlIIIIIIllIIlIl * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[26] - llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[26] - llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[2] + llllllllllllIlllIIlIIIIIIllIIlIl, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIllIl, MonumentBuilding.llIIlIlIIIlIll[2] + llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[0] + llllllllllllIlllIIlIIIIIIllIIlIl * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[26] - llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[2] + llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[2] + llllllllllllIlllIIlIIIIIIllIIlIl, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIllIl, MonumentBuilding.llIIlIlIIIlIll[0] - llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[0] + llllllllllllIlllIIlIIIIIIllIIlIl * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[26] - llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[28] + llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[26] - llllllllllllIlllIIlIIIIIIllIIlIl, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIllIl, MonumentBuilding.llIIlIlIIIlIll[0] - llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[0] + llllllllllllIlllIIlIIIIIIllIIlIl * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[2] + llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[28] + llllllllllllIlllIIlIIIIIIllIIlIl, MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[2] + llllllllllllIlllIIlIIIIIIllIIlIl, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                ++llllllllllllIlllIIlIIIIIIllIIlIl;
            }
            final boolean llllllllllllIlllIIlIIIIIIlIlllIl = (boolean)this.field_175843_q.iterator();
            "".length();
            if (((0xD8 ^ 0xB8) & ~(0x54 ^ 0x34)) != ((0x4E ^ 0x45) & ~(0x43 ^ 0x48))) {
                return ((0x43 ^ 0x2) & ~(0x1D ^ 0x5C)) != 0x0;
            }
            while (!lIIIllIIllIlllII(((Iterator)llllllllllllIlllIIlIIIIIIlIlllIl).hasNext() ? 1 : 0)) {
                final Piece llllllllllllIlllIIlIIIIIIllIIlII = ((Iterator<Piece>)llllllllllllIlllIIlIIIIIIlIlllIl).next();
                if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIIllIIlII.getBoundingBox().intersectsWith(llllllllllllIlllIIlIIIIIIllIllIl) ? 1 : 0)) {
                    llllllllllllIlllIIlIIIIIIllIIlII.addComponentParts(llllllllllllIlllIIlIIIIIIllIllll, llllllllllllIlllIIlIIIIIIllIIIIl, llllllllllllIlllIIlIIIIIIllIllIl);
                    "".length();
                }
            }
            return MonumentBuilding.llIIlIlIIIlIll[3] != 0;
        }
        
        private void func_175838_g(final World llllllllllllIlllIIIllllllllIIlII, final Random llllllllllllIlllIIIllllllllIIIll, final StructureBoundingBox llllllllllllIlllIIIlllllllIllIIl) {
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[61]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[61], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[33], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[1], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[33], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIIllllllllIIIIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIIllllllllIIIIl, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, llllllllllllIlllIIIllllllllIIIIl + MonumentBuilding.llIIlIlIIIlIll[60], llllllllllllIlllIIIllllllllIIIIl + MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIIllllllllIIIIl + MonumentBuilding.llIIlIlIIIlIll[60], llllllllllllIlllIIIllllllllIIIIl + MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[61] - llllllllllllIlllIIIllllllllIIIIl, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIIllllllllIIIIl;
                }
                int llllllllllllIlllIIIllllllllIIIII = MonumentBuilding.llIIlIlIIIlIll[7];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
                while (!lIIIllIIlllIIlII(llllllllllllIlllIIIllllllllIIIII, MonumentBuilding.llIIlIlIIIlIll[1])) {
                    this.setBlockState(llllllllllllIlllIIIllllllllIIlII, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[37], MonumentBuilding.llIIlIlIIIlIll[12], llllllllllllIlllIIIllllllllIIIII, llllllllllllIlllIIIlllllllIllIIl);
                    llllllllllllIlllIIIllllllllIIIII += 3;
                }
            }
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.llIIlIlIIIlIll[61]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[61], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[1], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[1], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[1], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIIlllllllIlllll = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIIlllllllIlllll, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[61] - llllllllllllIlllIIIlllllllIlllll, llllllllllllIlllIIIlllllllIlllll + MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[61] - llllllllllllIlllIIIlllllllIlllll, llllllllllllIlllIIIlllllllIlllll + MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[61] - llllllllllllIlllIIIlllllllIlllll, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIIlllllllIlllll;
                }
                int llllllllllllIlllIIIlllllllIllllI = MonumentBuilding.llIIlIlIIIlIll[7];
                "".length();
                if ("   ".length() == "  ".length()) {
                    return;
                }
                while (!lIIIllIIlllIIlII(llllllllllllIlllIIIlllllllIllllI, MonumentBuilding.llIIlIlIIIlIll[1])) {
                    this.setBlockState(llllllllllllIlllIIIllllllllIIlII, MonumentBuilding.field_175824_d, MonumentBuilding.llIIlIlIIIlIll[64], MonumentBuilding.llIIlIlIIIlIll[12], llllllllllllIlllIIIlllllllIllllI, llllllllllllIlllIIIlllllllIllIIl);
                    llllllllllllIlllIIIlllllllIllllI += 3;
                }
            }
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[44], MonumentBuilding.llIIlIlIIIlIll[61]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[61], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[60], MonumentBuilding.llIIlIlIIIlIll[61], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[1], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                int llllllllllllIlllIIIlllllllIlllIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIIlllllllIlllIl, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.fillWithBlocks(llllllllllllIlllIIIllllllllIIlII, llllllllllllIlllIIIlllllllIllIIl, MonumentBuilding.llIIlIlIIIlIll[36] + llllllllllllIlllIIIlllllllIlllIl, llllllllllllIlllIIIlllllllIlllIl + MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[61] - llllllllllllIlllIIIlllllllIlllIl, MonumentBuilding.llIIlIlIIIlIll[44] - llllllllllllIlllIIIlllllllIlllIl, llllllllllllIlllIIIlllllllIlllIl + MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[61] - llllllllllllIlllIIIlllllllIlllIl, MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                    ++llllllllllllIlllIIIlllllllIlllIl;
                }
                int llllllllllllIlllIIIlllllllIlllII = MonumentBuilding.llIIlIlIIIlIll[8];
                "".length();
                if ((100 + 115 - 134 + 102 ^ 61 + 151 - 199 + 166) > (0xC2 ^ 0x9B ^ (0x42 ^ 0x1F))) {
                    return;
                }
                while (!lIIIllIIlllIIlII(llllllllllllIlllIIIlllllllIlllII, MonumentBuilding.llIIlIlIIIlIll[45])) {
                    this.setBlockState(llllllllllllIlllIIIllllllllIIlII, MonumentBuilding.field_175824_d, llllllllllllIlllIIIlllllllIlllII, MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[64], llllllllllllIlllIIIlllllllIllIIl);
                    llllllllllllIlllIIIlllllllIlllII += 3;
                }
            }
        }
        
        private static boolean lIIIllIIlllIIIII(final int llllllllllllIlllIIIllllllIlllllI) {
            return llllllllllllIlllIIIllllllIlllllI >= 0;
        }
        
        private static void lIIIllIIllIllIll() {
            (llIIlIlIIIlIll = new int[65])[0] = ((0x3C ^ 0x29) & ~(0x4F ^ 0x5A));
            MonumentBuilding.llIIlIlIIIlIll[1] = (0x58 ^ 0x23 ^ (0x45 ^ 0x19));
            MonumentBuilding.llIIlIlIIIlIll[2] = (0x87 ^ 0xBD);
            MonumentBuilding.llIIlIlIIIlIll[3] = " ".length();
            MonumentBuilding.llIIlIlIIIlIll[4] = (0xA1 ^ 0x9C);
            MonumentBuilding.llIIlIlIIIlIll[5] = (0x2B ^ 0x62 ^ (0x50 ^ 0x10));
            MonumentBuilding.llIIlIlIIIlIll[6] = (0x10 ^ 0x6);
            MonumentBuilding.llIIlIlIIIlIll[7] = (91 + 36 + 4 + 35 ^ 15 + 171 - 175 + 166);
            MonumentBuilding.llIIlIlIIIlIll[8] = (0xD1 ^ 0xC4);
            MonumentBuilding.llIIlIlIIIlIll[9] = (0xA2 ^ 0xAA);
            MonumentBuilding.llIIlIlIIIlIll[10] = (0xD ^ 0x2F);
            MonumentBuilding.llIIlIlIIIlIll[11] = (0x6B ^ 0x53);
            MonumentBuilding.llIIlIlIIIlIll[12] = (0x3C ^ 0x4A ^ (0xE4 ^ 0x9F));
            MonumentBuilding.llIIlIlIIIlIll[13] = (99 + 115 - 132 + 73 ^ 82 + 25 + 1 + 76);
            MonumentBuilding.llIIlIlIIIlIll[14] = (0x6F ^ 0x7E);
            MonumentBuilding.llIIlIlIIIlIll[15] = (38 + 63 + 36 + 58 ^ 104 + 88 - 67 + 11);
            MonumentBuilding.llIIlIlIIIlIll[16] = (148 + 134 - 180 + 50 ^ 27 + 19 + 67 + 43);
            MonumentBuilding.llIIlIlIIIlIll[17] = (154 + 122 - 151 + 34 ^ 30 + 42 - 37 + 119);
            MonumentBuilding.llIIlIlIIIlIll[18] = "  ".length();
            MonumentBuilding.llIIlIlIIIlIll[19] = "   ".length();
            MonumentBuilding.llIIlIlIIIlIll[20] = (-(0xFFFFFF35 & 0x38CB) & (0xFFFFBBFF & 0x7FEB));
            MonumentBuilding.llIIlIlIIIlIll[21] = (-(0xFFFFBEDD & 0x6D33) & (0xFFFFEFFF & 0x3FF9));
            MonumentBuilding.llIIlIlIIIlIll[22] = (-(0xFFFF9E51 & 0x71AF) & (0xFFFF9BEB & 0x77FE));
            MonumentBuilding.llIIlIlIIIlIll[23] = (0x81 ^ 0x87);
            MonumentBuilding.llIIlIlIIIlIll[24] = (0x3E ^ 0x7E);
            MonumentBuilding.llIIlIlIIIlIll[25] = (0x56 ^ 0x77);
            MonumentBuilding.llIIlIlIIIlIll[26] = -" ".length();
            MonumentBuilding.llIIlIlIIIlIll[27] = (0x4A ^ 0x4D);
            MonumentBuilding.llIIlIlIIIlIll[28] = (0x77 ^ 0x22 ^ (0x6B ^ 0x7));
            MonumentBuilding.llIIlIlIIIlIll[29] = (7 + 137 - 86 + 95 ^ 77 + 36 - 88 + 104);
            MonumentBuilding.llIIlIlIIIlIll[30] = (0xD5 ^ 0xC1);
            MonumentBuilding.llIIlIlIIIlIll[31] = (0xF ^ 0x5);
            MonumentBuilding.llIIlIlIIIlIll[32] = (45 + 16 + 16 + 74 ^ 58 + 4 - 24 + 97);
            MonumentBuilding.llIIlIlIIIlIll[33] = (0x2B ^ 0x69 ^ (0xCE ^ 0x9E));
            MonumentBuilding.llIIlIlIIIlIll[34] = (27 + 116 + 25 + 17 ^ 46 + 116 - 46 + 62);
            MonumentBuilding.llIIlIlIIIlIll[35] = (0x2E ^ 0x22);
            MonumentBuilding.llIIlIlIIIlIll[36] = (0x79 ^ 0x76);
            MonumentBuilding.llIIlIlIIIlIll[37] = (38 + 92 - 93 + 148 ^ 132 + 71 - 175 + 142);
            MonumentBuilding.llIIlIlIIIlIll[38] = (0x7B ^ 0x62);
            MonumentBuilding.llIIlIlIIIlIll[39] = (0x90 ^ 0xB0);
            MonumentBuilding.llIIlIlIIIlIll[40] = (0x39 ^ 0x23);
            MonumentBuilding.llIIlIlIIIlIll[41] = (0x2E ^ 0x62 ^ (0xDF ^ 0x8C));
            MonumentBuilding.llIIlIlIIIlIll[42] = (0x21 ^ 0x3A);
            MonumentBuilding.llIIlIlIIIlIll[43] = (0xF ^ 0x11);
            MonumentBuilding.llIIlIlIIIlIll[44] = (0xCE ^ 0xBC ^ (0xC2 ^ 0x9A));
            MonumentBuilding.llIIlIlIIIlIll[45] = (82 + 103 - 109 + 110 ^ 33 + 123 - 107 + 109);
            MonumentBuilding.llIIlIlIIIlIll[46] = (0xCB ^ 0x83 ^ (0x77 ^ 0x17));
            MonumentBuilding.llIIlIlIIIlIll[47] = (0x8C ^ 0xA5);
            MonumentBuilding.llIIlIlIIIlIll[48] = (0x52 ^ 0x42 ^ (0x3B ^ 0x37));
            MonumentBuilding.llIIlIlIIIlIll[49] = (0xE7 ^ 0xC2 ^ (0x2 ^ 0x3A));
            MonumentBuilding.llIIlIlIIIlIll[50] = (0x1F ^ 0x3A);
            MonumentBuilding.llIIlIlIIIlIll[51] = (0x6F ^ 0x5A);
            MonumentBuilding.llIIlIlIIIlIll[52] = (0x57 ^ 0x12 ^ (0xCC ^ 0xBD));
            MonumentBuilding.llIIlIlIIIlIll[53] = (0x95 ^ 0xA6);
            MonumentBuilding.llIIlIlIIIlIll[54] = (133 + 63 - 161 + 118 ^ 96 + 9 - 67 + 133);
            MonumentBuilding.llIIlIlIIIlIll[55] = (0x6E ^ 0x58);
            MonumentBuilding.llIIlIlIIIlIll[56] = (159 + 113 - 269 + 172 ^ 11 + 55 + 38 + 26);
            MonumentBuilding.llIIlIlIIIlIll[57] = (0x5 ^ 0x29);
            MonumentBuilding.llIIlIlIIIlIll[58] = (0x1D ^ 0x33);
            MonumentBuilding.llIIlIlIIIlIll[59] = (0x94 ^ 0xA5);
            MonumentBuilding.llIIlIlIIIlIll[60] = (0xF2 ^ 0x8E ^ (0x15 ^ 0x67));
            MonumentBuilding.llIIlIlIIIlIll[61] = (128 + 101 - 93 + 29 ^ 88 + 133 - 145 + 66);
            MonumentBuilding.llIIlIlIIIlIll[62] = (135 + 121 - 103 + 18 ^ 53 + 68 - 33 + 44);
            MonumentBuilding.llIIlIlIIIlIll[63] = (123 + 7 - 80 + 79 ^ 43 + 11 + 85 + 38);
            MonumentBuilding.llIIlIlIIIlIll[64] = (135 + 160 - 197 + 89 ^ 90 + 32 + 35 + 0);
        }
        
        private void func_175837_c(final World llllllllllllIlllIIlIIIIIIIIlllIl, final Random llllllllllllIlllIIlIIIIIIIlIIIll, final StructureBoundingBox llllllllllllIlllIIlIIIIIIIlIIIlI) {
            if (lIIIllIIllIlllIl(this.func_175818_a(llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[44], MonumentBuilding.llIIlIlIIIlIll[8]) ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[44], MonumentBuilding.llIIlIlIIIlIll[0], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[40], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[41], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[46], MonumentBuilding.llIIlIlIIIlIll[34], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[32], MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[47], MonumentBuilding.llIIlIlIIIlIll[31], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[27], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[44], MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[32], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[47], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[46], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[40], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[41], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[13], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[10], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175828_a, MonumentBuilding.field_175828_a, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[48], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[49], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.field_175826_b, MonumentBuilding.field_175826_b, (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[42], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[43], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[40], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[41], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[38], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175826_b, MonumentBuilding.llIIlIlIIIlIll[39], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                int llllllllllllIlllIIlIIIIIIIlIIIIl = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ("  ".length() > (0xBE ^ 0xBA)) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIlIIIIl, MonumentBuilding.llIIlIlIIIlIll[27])) {
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[48] - llllllllllllIlllIIlIIIIIIIlIIIIl, MonumentBuilding.llIIlIlIIIlIll[23] + llllllllllllIlllIIlIIIIIIIlIIIIl, MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[49] + llllllllllllIlllIIlIIIIIIIlIIIIl, MonumentBuilding.llIIlIlIIIlIll[23] + llllllllllllIlllIIlIIIIIIIlIIIIl, MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    ++llllllllllllIlllIIlIIIIIIIlIIIIl;
                }
                int llllllllllllIlllIIlIIIIIIIlIIIII = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if ((0xFD ^ 0xA1 ^ (0xF9 ^ 0xA1)) < 0) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIlIIIII, MonumentBuilding.llIIlIlIIIlIll[16])) {
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[48] - llllllllllllIlllIIlIIIIIIIlIIIII, MonumentBuilding.llIIlIlIIIlIll[5] + llllllllllllIlllIIlIIIIIIIlIIIII, MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[49] + llllllllllllIlllIIlIIIIIIIlIIIII, MonumentBuilding.llIIlIlIIIlIll[5] + llllllllllllIlllIIlIIIIIIIlIIIII, MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    ++llllllllllllIlllIIlIIIIIIIlIIIII;
                }
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[48], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[49], MonumentBuilding.llIIlIlIIIlIll[35], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                int llllllllllllIlllIIlIIIIIIIIlllll = MonumentBuilding.llIIlIlIIIlIll[0];
                "".length();
                if (((0x3D ^ 0x3A) & ~(0x6C ^ 0x6B)) == "   ".length()) {
                    return;
                }
                while (!lIIIllIIllIllllI(llllllllllllIlllIIlIIIIIIIIlllll, MonumentBuilding.llIIlIlIIIlIll[19])) {
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[6] - llllllllllllIlllIIlIIIIIIIIlllll * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[6] - llllllllllllIlllIIlIIIIIIIIlllll * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[13] + llllllllllllIlllIIlIIIIIIIIlllll * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[9], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    this.setBlockState(llllllllllllIlllIIlIIIIIIIIlllIl, MonumentBuilding.field_175827_c, MonumentBuilding.llIIlIlIIIlIll[13] + llllllllllllIlllIIlIIIIIIIIlllll * MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[8], llllllllllllIlllIIlIIIIIIIlIIIlI);
                    ++llllllllllllIlllIIlIIIIIIIIlllll;
                }
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[12], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[44], MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[36], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[32], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[32], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[14], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[30], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[29], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[44], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[44], MonumentBuilding.llIIlIlIIIlIll[23], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[47], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[47], MonumentBuilding.llIIlIlIIIlIll[17], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[50], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[46], MonumentBuilding.llIIlIlIIIlIll[16], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[45], MonumentBuilding.llIIlIlIIIlIll[19], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[25], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[10], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
                this.func_181655_a(llllllllllllIlllIIlIIIIIIIIlllIl, llllllllllllIlllIIlIIIIIIIlIIIlI, MonumentBuilding.llIIlIlIIIlIll[13], MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[8], MonumentBuilding.llIIlIlIIIlIll[13], MonumentBuilding.llIIlIlIIIlIll[18], MonumentBuilding.llIIlIlIIIlIll[8], (boolean)(MonumentBuilding.llIIlIlIIIlIll[0] != 0));
            }
        }
        
        static {
            lIIIllIIllIllIll();
        }
        
        private static boolean lIIIllIIlllIIIIl(final int llllllllllllIlllIIIlllllllIIlIll, final int llllllllllllIlllIIIlllllllIIlIlI) {
            return llllllllllllIlllIIIlllllllIIlIll < llllllllllllIlllIIIlllllllIIlIlI;
        }
        
        public MonumentBuilding(final Random llllllllllllIlllIIlIIIIIllIllIll, final int llllllllllllIlllIIlIIIIIllIllIlI, final int llllllllllllIlllIIlIIIIIllIllIIl, final EnumFacing llllllllllllIlllIIlIIIIIllIllIII) {
            super(MonumentBuilding.llIIlIlIIIlIll[0]);
            this.field_175843_q = (List<Piece>)Lists.newArrayList();
            this.coordBaseMode = llllllllllllIlllIIlIIIIIllIllIII;
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                case 3:
                case 4: {
                    this.boundingBox = new StructureBoundingBox(llllllllllllIlllIIlIIIIIllIllIlI, MonumentBuilding.llIIlIlIIIlIll[1], llllllllllllIlllIIlIIIIIllIllIIl, llllllllllllIlllIIlIIIIIllIllIlI + MonumentBuilding.llIIlIlIIIlIll[2] - MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[4], llllllllllllIlllIIlIIIIIllIllIIl + MonumentBuilding.llIIlIlIIIlIll[2] - MonumentBuilding.llIIlIlIIIlIll[3]);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.boundingBox = new StructureBoundingBox(llllllllllllIlllIIlIIIIIllIllIlI, MonumentBuilding.llIIlIlIIIlIll[1], llllllllllllIlllIIlIIIIIllIllIIl, llllllllllllIlllIIlIIIIIllIllIlI + MonumentBuilding.llIIlIlIIIlIll[2] - MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[4], llllllllllllIlllIIlIIIIIllIllIIl + MonumentBuilding.llIIlIlIIIlIll[2] - MonumentBuilding.llIIlIlIIIlIll[3]);
                    break;
                }
            }
            final List<RoomDefinition> llllllllllllIlllIIlIIIIIllIlIlll = this.func_175836_a(llllllllllllIlllIIlIIIIIllIllIll);
            this.field_175845_o.field_175963_d = (MonumentBuilding.llIIlIlIIIlIll[3] != 0);
            this.field_175843_q.add(new EntryRoom(this.coordBaseMode, this.field_175845_o));
            "".length();
            this.field_175843_q.add(new MonumentCoreRoom(this.coordBaseMode, this.field_175844_p, llllllllllllIlllIIlIIIIIllIllIll));
            "".length();
            final List<MonumentRoomFitHelper> llllllllllllIlllIIlIIIIIllIlIllI = (List<MonumentRoomFitHelper>)Lists.newArrayList();
            llllllllllllIlllIIlIIIIIllIlIllI.add(new XYDoubleRoomFitHelper(null));
            "".length();
            llllllllllllIlllIIlIIIIIllIlIllI.add(new YZDoubleRoomFitHelper(null));
            "".length();
            llllllllllllIlllIIlIIIIIllIlIllI.add(new ZDoubleRoomFitHelper(null));
            "".length();
            llllllllllllIlllIIlIIIIIllIlIllI.add(new XDoubleRoomFitHelper(null));
            "".length();
            llllllllllllIlllIIlIIIIIllIlIllI.add(new YDoubleRoomFitHelper(null));
            "".length();
            llllllllllllIlllIIlIIIIIllIlIllI.add(new FitSimpleRoomTopHelper(null));
            "".length();
            llllllllllllIlllIIlIIIIIllIlIllI.add(new FitSimpleRoomHelper(null));
            "".length();
            final Iterator<RoomDefinition> iterator = llllllllllllIlllIIlIIIIIllIlIlll.iterator();
            "".length();
            if ("   ".length() <= 0) {
                throw null;
            }
        Label_0579:
            while (!lIIIllIIllIlllII(iterator.hasNext() ? 1 : 0)) {
                final RoomDefinition llllllllllllIlllIIlIIIIIllIlIlIl = iterator.next();
                if (lIIIllIIllIlllII(llllllllllllIlllIIlIIIIIllIlIlIl.field_175963_d ? 1 : 0) && lIIIllIIllIlllII(llllllllllllIlllIIlIIIIIllIlIlIl.func_175961_b() ? 1 : 0)) {
                    final Iterator llllllllllllIlllIIlIIIIIllIlIlII = llllllllllllIlllIIlIIIIIllIlIllI.iterator();
                    while (!lIIIllIIllIlllII(llllllllllllIlllIIlIIIIIllIlIlII.hasNext() ? 1 : 0)) {
                        final MonumentRoomFitHelper llllllllllllIlllIIlIIIIIllIlIIll = llllllllllllIlllIIlIIIIIllIlIlII.next();
                        if (lIIIllIIllIlllIl(llllllllllllIlllIIlIIIIIllIlIIll.func_175969_a(llllllllllllIlllIIlIIIIIllIlIlIl) ? 1 : 0)) {
                            this.field_175843_q.add(llllllllllllIlllIIlIIIIIllIlIIll.func_175968_a(this.coordBaseMode, llllllllllllIlllIIlIIIIIllIlIlIl, llllllllllllIlllIIlIIIIIllIllIll));
                            "".length();
                            continue Label_0579;
                        }
                    }
                    "".length();
                    if (-(98 + 69 - 74 + 48 ^ 30 + 118 - 115 + 103) >= 0) {
                        throw null;
                    }
                    continue;
                }
            }
            final int llllllllllllIlllIIlIIIIIllIlIIlI = this.boundingBox.minY;
            final int llllllllllllIlllIIlIIIIIllIlIIIl = this.getXWithOffset(MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[6]);
            final int llllllllllllIlllIIlIIIIIllIlIIII = this.getZWithOffset(MonumentBuilding.llIIlIlIIIlIll[5], MonumentBuilding.llIIlIlIIIlIll[6]);
            final float llllllllllllIlllIIlIIIIIlIllllll = (float)this.field_175843_q.iterator();
            "".length();
            if (" ".length() == 0) {
                throw null;
            }
            while (!lIIIllIIllIlllII(((Iterator)llllllllllllIlllIIlIIIIIlIllllll).hasNext() ? 1 : 0)) {
                final Piece llllllllllllIlllIIlIIIIIllIIllll = ((Iterator<Piece>)llllllllllllIlllIIlIIIIIlIllllll).next();
                llllllllllllIlllIIlIIIIIllIIllll.getBoundingBox().offset(llllllllllllIlllIIlIIIIIllIlIIIl, llllllllllllIlllIIlIIIIIllIlIIlI, llllllllllllIlllIIlIIIIIllIlIIII);
            }
            final StructureBoundingBox llllllllllllIlllIIlIIIIIllIIlllI = StructureBoundingBox.func_175899_a(this.getXWithOffset(MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[3]), this.getYWithOffset(MonumentBuilding.llIIlIlIIIlIll[3]), this.getZWithOffset(MonumentBuilding.llIIlIlIIIlIll[3], MonumentBuilding.llIIlIlIIIlIll[3]), this.getXWithOffset(MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[8]), this.getYWithOffset(MonumentBuilding.llIIlIlIIIlIll[9]), this.getZWithOffset(MonumentBuilding.llIIlIlIIIlIll[7], MonumentBuilding.llIIlIlIIIlIll[8]));
            final StructureBoundingBox llllllllllllIlllIIlIIIIIllIIllIl = StructureBoundingBox.func_175899_a(this.getXWithOffset(MonumentBuilding.llIIlIlIIIlIll[10], MonumentBuilding.llIIlIlIIIlIll[3]), this.getYWithOffset(MonumentBuilding.llIIlIlIIIlIll[3]), this.getZWithOffset(MonumentBuilding.llIIlIlIIIlIll[10], MonumentBuilding.llIIlIlIIIlIll[3]), this.getXWithOffset(MonumentBuilding.llIIlIlIIIlIll[11], MonumentBuilding.llIIlIlIIIlIll[8]), this.getYWithOffset(MonumentBuilding.llIIlIlIIIlIll[9]), this.getZWithOffset(MonumentBuilding.llIIlIlIIIlIll[11], MonumentBuilding.llIIlIlIIIlIll[8]));
            final StructureBoundingBox llllllllllllIlllIIlIIIIIllIIllII = StructureBoundingBox.func_175899_a(this.getXWithOffset(MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[6]), this.getYWithOffset(MonumentBuilding.llIIlIlIIIlIll[12]), this.getZWithOffset(MonumentBuilding.llIIlIlIIIlIll[6], MonumentBuilding.llIIlIlIIIlIll[6]), this.getXWithOffset(MonumentBuilding.llIIlIlIIIlIll[13], MonumentBuilding.llIIlIlIIIlIll[13]), this.getYWithOffset(MonumentBuilding.llIIlIlIIIlIll[14]), this.getZWithOffset(MonumentBuilding.llIIlIlIIIlIll[13], MonumentBuilding.llIIlIlIIIlIll[13]));
            int llllllllllllIlllIIlIIIIIllIIlIll = llllllllllllIlllIIlIIIIIllIllIll.nextInt();
            this.field_175843_q.add(new WingRoom(this.coordBaseMode, llllllllllllIlllIIlIIIIIllIIlllI, llllllllllllIlllIIlIIIIIllIIlIll++));
            "".length();
            this.field_175843_q.add(new WingRoom(this.coordBaseMode, llllllllllllIlllIIlIIIIIllIIllIl, llllllllllllIlllIIlIIIIIllIIlIll++));
            "".length();
            this.field_175843_q.add(new Penthouse(this.coordBaseMode, llllllllllllIlllIIlIIIIIllIIllII));
            "".length();
        }
    }
    
    static class XDoubleRoomFitHelper implements MonumentRoomFitHelper
    {
        private static final /* synthetic */ int[] lllIIIllllIIII;
        
        @Override
        public Piece func_175968_a(final EnumFacing llllllllllllIlIllllllIIllllIIlll, final RoomDefinition llllllllllllIlIllllllIIllllIIIll, final Random llllllllllllIlIllllllIIllllIIlIl) {
            llllllllllllIlIllllllIIllllIIIll.field_175963_d = (XDoubleRoomFitHelper.lllIIIllllIIII[0] != 0);
            llllllllllllIlIllllllIIllllIIIll.field_175965_b[EnumFacing.EAST.getIndex()].field_175963_d = (XDoubleRoomFitHelper.lllIIIllllIIII[0] != 0);
            return new DoubleXRoom(llllllllllllIlIllllllIIllllIIlll, llllllllllllIlIllllllIIllllIIIll, llllllllllllIlIllllllIIllllIIlIl);
        }
        
        private static boolean lIIllllIIlIllIll(final int llllllllllllIlIllllllIIlllIlllII) {
            return llllllllllllIlIllllllIIlllIlllII == 0;
        }
        
        @Override
        public boolean func_175969_a(final RoomDefinition llllllllllllIlIllllllIIllllIllIl) {
            if (lIIllllIIlIllIlI(llllllllllllIlIllllllIIllllIllIl.field_175966_c[EnumFacing.EAST.getIndex()] ? 1 : 0) && lIIllllIIlIllIll(llllllllllllIlIllllllIIllllIllIl.field_175965_b[EnumFacing.EAST.getIndex()].field_175963_d ? 1 : 0)) {
                return XDoubleRoomFitHelper.lllIIIllllIIII[0] != 0;
            }
            return XDoubleRoomFitHelper.lllIIIllllIIII[1] != 0;
        }
        
        static {
            lIIllllIIlIllIIl();
        }
        
        private static boolean lIIllllIIlIllIlI(final int llllllllllllIlIllllllIIlllIllllI) {
            return llllllllllllIlIllllllIIlllIllllI != 0;
        }
        
        private static void lIIllllIIlIllIIl() {
            (lllIIIllllIIII = new int[2])[0] = " ".length();
            XDoubleRoomFitHelper.lllIIIllllIIII[1] = ((0x23 ^ 0xA) & ~(0x46 ^ 0x6F));
        }
        
        private XDoubleRoomFitHelper() {
        }
    }
}
