// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.block.BlockJukebox;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import net.minecraft.block.state.IBlockState;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Map;

public abstract class TileEntity
{
    private static final /* synthetic */ int[] lIllIlllIIllll;
    private static /* synthetic */ Map<String, Class<? extends TileEntity>> nameToClassMap;
    private /* synthetic */ int blockMetadata;
    private static final /* synthetic */ String[] lIllIlllIIlIII;
    protected /* synthetic */ Block blockType;
    protected /* synthetic */ boolean tileEntityInvalid;
    protected /* synthetic */ World worldObj;
    private static /* synthetic */ Map<Class<? extends TileEntity>, String> classToNameMap;
    private static final /* synthetic */ Logger logger;
    protected /* synthetic */ BlockPos pos;
    
    public Block getBlockType() {
        if (lIIIIIIIIIlIIllI(this.blockType)) {
            this.blockType = this.worldObj.getBlockState(this.pos).getBlock();
        }
        return this.blockType;
    }
    
    public World getWorld() {
        return this.worldObj;
    }
    
    public boolean func_183000_F() {
        return TileEntity.lIllIlllIIllll[0] != 0;
    }
    
    public static TileEntity createAndLoadEntity(final NBTTagCompound llllllllllllIllllllIlIIIIlllIlII) {
        TileEntity llllllllllllIllllllIlIIIIllllIII = null;
        try {
            final Class<? extends TileEntity> llllllllllllIllllllIlIIIIlllIlll = TileEntity.nameToClassMap.get(llllllllllllIllllllIlIIIIlllIlII.getString(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[31]]));
            if (lIIIIIIIIIlIIlIl(llllllllllllIllllllIlIIIIlllIlll)) {
                llllllllllllIllllllIlIIIIllllIII = (TileEntity)llllllllllllIllllllIlIIIIlllIlll.newInstance();
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        catch (Exception llllllllllllIllllllIlIIIIlllIlIl) {
            llllllllllllIllllllIlIIIIlllIlIl.printStackTrace();
        }
        if (lIIIIIIIIIlIIlIl(llllllllllllIllllllIlIIIIllllIII)) {
            llllllllllllIllllllIlIIIIllllIII.readFromNBT(llllllllllllIllllllIlIIIIlllIlII);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            TileEntity.logger.warn(String.valueOf(new StringBuilder(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[32]]).append(llllllllllllIllllllIlIIIIlllIlII.getString(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[33]]))));
        }
        return llllllllllllIllllllIlIIIIllllIII;
    }
    
    public void addInfoToCrashReport(final CrashReportCategory llllllllllllIllllllIIllllllllIII) {
        llllllllllllIllllllIIllllllllIII.addCrashSectionCallable(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[34]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIlIIIllIllll;
            private static final /* synthetic */ int[] lIIlIIIlllIIII;
            
            static {
                llIIlIlllIIIlll();
                llIIlIlllIIIlIl();
            }
            
            private static void llIIlIlllIIIlIl() {
                (lIIlIIIllIllll = new String[TileEntity$1.lIIlIIIlllIIII[1]])[TileEntity$1.lIIlIIIlllIIII[0]] = llIIlIlllIIIlII("fVa0peQp0vI=", "dssnO");
            }
            
            private static void llIIlIlllIIIlll() {
                (lIIlIIIlllIIII = new int[4])[0] = ((0x7E ^ 0x5C) & ~(0xB ^ 0x29));
                TileEntity$1.lIIlIIIlllIIII[1] = " ".length();
                TileEntity$1.lIIlIIIlllIIII[2] = (3 + 75 + 40 + 85 ^ 22 + 51 - 59 + 181);
                TileEntity$1.lIIlIIIlllIIII[3] = "  ".length();
            }
            
            @Override
            public String call() throws Exception {
                return String.valueOf(new StringBuilder(String.valueOf(TileEntity.classToNameMap.get(TileEntity.this.getClass()))).append(TileEntity$1.lIIlIIIllIllll[TileEntity$1.lIIlIIIlllIIII[0]]).append(TileEntity.this.getClass().getCanonicalName()));
            }
            
            private static String llIIlIlllIIIlII(final String lllllllllllllIIlllIIlIIIIIlllIlI, final String lllllllllllllIIlllIIlIIIIIllIlll) {
                try {
                    final SecretKeySpec lllllllllllllIIlllIIlIIIIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIIIIIllIlll.getBytes(StandardCharsets.UTF_8)), TileEntity$1.lIIlIIIlllIIII[2]), "DES");
                    final Cipher lllllllllllllIIlllIIlIIIIIllllII = Cipher.getInstance("DES");
                    lllllllllllllIIlllIIlIIIIIllllII.init(TileEntity$1.lIIlIIIlllIIII[3], lllllllllllllIIlllIIlIIIIIllllIl);
                    return new String(lllllllllllllIIlllIIlIIIIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlllIIlIIIIIlllIll) {
                    lllllllllllllIIlllIIlIIIIIlllIll.printStackTrace();
                    return null;
                }
            }
        });
        if (lIIIIIIIIIlIIlIl(this.worldObj)) {
            CrashReportCategory.addBlockInfo(llllllllllllIllllllIIllllllllIII, this.pos, this.getBlockType(), this.getBlockMetadata());
            llllllllllllIllllllIIllllllllIII.addCrashSectionCallable(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[35]], new Callable<String>() {
                private static final /* synthetic */ String[] lIIIlIlIlIIlIl;
                private static final /* synthetic */ int[] lIIIlIlIlIIlll;
                
                private static boolean llIIIIIlIIIIllI(final int lllllllllllllIlIIIIllIllllllllIl, final int lllllllllllllIlIIIIllIllllllllII) {
                    return lllllllllllllIlIIIIllIllllllllIl < lllllllllllllIlIIIIllIllllllllII;
                }
                
                @Override
                public String call() throws Exception {
                    final int lllllllllllllIlIIIIlllIIIlIIlIll = Block.getIdFromBlock(TileEntity.this.worldObj.getBlockState(TileEntity.this.pos).getBlock());
                    try {
                        final String format = TileEntity$2.lIIIlIlIlIIlIl[TileEntity$2.lIIIlIlIlIIlll[0]];
                        final Object[] args = new Object[TileEntity$2.lIIIlIlIlIIlll[1]];
                        args[TileEntity$2.lIIIlIlIlIIlll[0]] = lllllllllllllIlIIIIlllIIIlIIlIll;
                        args[TileEntity$2.lIIIlIlIlIIlll[2]] = Block.getBlockById(lllllllllllllIlIIIIlllIIIlIIlIll).getUnlocalizedName();
                        args[TileEntity$2.lIIIlIlIlIIlll[3]] = Block.getBlockById(lllllllllllllIlIIIIlllIIIlIIlIll).getClass().getCanonicalName();
                        return String.format(format, args);
                    }
                    catch (Throwable lllllllllllllIlIIIIlllIIIlIIlIlI) {
                        return String.valueOf(new StringBuilder(TileEntity$2.lIIIlIlIlIIlIl[TileEntity$2.lIIIlIlIlIIlll[2]]).append(lllllllllllllIlIIIIlllIIIlIIlIll));
                    }
                }
                
                private static String llIIIIIIlllIlII(final String lllllllllllllIlIIIIlllIIIIlIllII, final String lllllllllllllIlIIIIlllIIIIlIlIlI) {
                    try {
                        final SecretKeySpec lllllllllllllIlIIIIlllIIIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIlIIIIlllIIIIllIIIl = Cipher.getInstance("Blowfish");
                        lllllllllllllIlIIIIlllIIIIllIIIl.init(TileEntity$2.lIIIlIlIlIIlll[3], lllllllllllllIlIIIIlllIIIIllIlII);
                        return new String(lllllllllllllIlIIIIlllIIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlllIIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIlIIIIlllIIIIlIllll) {
                        lllllllllllllIlIIIIlllIIIIlIllll.printStackTrace();
                        return null;
                    }
                }
                
                private static String llIIIIIIlllIlIl(String lllllllllllllIlIIIIlllIIIIIIlIIl, final String lllllllllllllIlIIIIlllIIIIIIllll) {
                    lllllllllllllIlIIIIlllIIIIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIlllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder lllllllllllllIlIIIIlllIIIIIIlllI = new StringBuilder();
                    final char[] lllllllllllllIlIIIIlllIIIIIIllIl = lllllllllllllIlIIIIlllIIIIIIllll.toCharArray();
                    int lllllllllllllIlIIIIlllIIIIIIlIll = TileEntity$2.lIIIlIlIlIIlll[0];
                    final short lllllllllllllIlIIIIlllIIIIIIIIll = (Object)lllllllllllllIlIIIIlllIIIIIIlIIl.toCharArray();
                    final byte lllllllllllllIlIIIIlllIIIIIIIIlI = (byte)lllllllllllllIlIIIIlllIIIIIIIIll.length;
                    int lllllllllllllIlIIIIlllIIIIIIIIIl = TileEntity$2.lIIIlIlIlIIlll[0];
                    while (llIIIIIlIIIIllI(lllllllllllllIlIIIIlllIIIIIIIIIl, lllllllllllllIlIIIIlllIIIIIIIIlI)) {
                        final char lllllllllllllIlIIIIlllIIIIIlIIlI = lllllllllllllIlIIIIlllIIIIIIIIll[lllllllllllllIlIIIIlllIIIIIIIIIl];
                        lllllllllllllIlIIIIlllIIIIIIlllI.append((char)(lllllllllllllIlIIIIlllIIIIIlIIlI ^ lllllllllllllIlIIIIlllIIIIIIllIl[lllllllllllllIlIIIIlllIIIIIIlIll % lllllllllllllIlIIIIlllIIIIIIllIl.length]));
                        "".length();
                        ++lllllllllllllIlIIIIlllIIIIIIlIll;
                        ++lllllllllllllIlIIIIlllIIIIIIIIIl;
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return null;
                        }
                    }
                    return String.valueOf(lllllllllllllIlIIIIlllIIIIIIlllI);
                }
                
                static {
                    llIIIIIlIIIIlIl();
                    llIIIIIIlllIllI();
                }
                
                private static void llIIIIIlIIIIlIl() {
                    (lIIIlIlIlIIlll = new int[4])[0] = ((0x8D ^ 0xB2) & ~(0x50 ^ 0x6F));
                    TileEntity$2.lIIIlIlIlIIlll[1] = "   ".length();
                    TileEntity$2.lIIIlIlIlIIlll[2] = " ".length();
                    TileEntity$2.lIIIlIlIlIIlll[3] = "  ".length();
                }
                
                private static void llIIIIIIlllIllI() {
                    (lIIIlIlIlIIlIl = new String[TileEntity$2.lIIIlIlIlIIlll[3]])[TileEntity$2.lIIIlIlIlIIlll[0]] = llIIIIIIlllIlII("ZqT97+J7HJFyy4HEh2bBGKICIYvVJAVl", "jaVbW");
                    TileEntity$2.lIIIlIlIlIIlIl[TileEntity$2.lIIIlIlIlIIlll[2]] = llIIIIIIlllIlIl("AgxzSA==", "KHSkP");
                }
            });
            llllllllllllIllllllIIllllllllIII.addCrashSectionCallable(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[36]], new Callable<String>() {
                private static final /* synthetic */ int[] llIIIlllIlIIII;
                private static final /* synthetic */ String[] llIIIlllIIlIIl;
                
                @Override
                public String call() throws Exception {
                    final IBlockState llllllllllllIlllIlIIIIlIIIllIIll = TileEntity.this.worldObj.getBlockState(TileEntity.this.pos);
                    final int llllllllllllIlllIlIIIIlIIIllIIIl = llllllllllllIlllIlIIIIlIIIllIIll.getBlock().getMetaFromState(llllllllllllIlllIlIIIIlIIIllIIll);
                    if (lIIIlIlIlllIIlll(llllllllllllIlllIlIIIIlIIIllIIIl)) {
                        return String.valueOf(new StringBuilder(TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[0]]).append(llllllllllllIlllIlIIIIlIIIllIIIl).append(TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[1]]));
                    }
                    final String format = TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[2]];
                    final Object[] args = new Object[TileEntity$3.llIIIlllIlIIII[1]];
                    args[TileEntity$3.llIIIlllIlIIII[0]] = Integer.toBinaryString(llllllllllllIlllIlIIIIlIIIllIIIl);
                    final String llllllllllllIlllIlIIIIlIIIlIllll = String.format(format, args).replace(TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[3]], TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[4]]);
                    final String format2 = TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[5]];
                    final Object[] args2 = new Object[TileEntity$3.llIIIlllIlIIII[2]];
                    args2[TileEntity$3.llIIIlllIlIIII[0]] = llllllllllllIlllIlIIIIlIIIllIIIl;
                    args2[TileEntity$3.llIIIlllIlIIII[1]] = llllllllllllIlllIlIIIIlIIIlIllll;
                    return String.format(format2, args2);
                }
                
                private static boolean lIIIlIlIlllIIlll(final int llllllllllllIlllIlIIIIIlllIIIlIl) {
                    return llllllllllllIlllIlIIIIIlllIIIlIl < 0;
                }
                
                private static void lIIIlIlIlllIIllI() {
                    (llIIIlllIlIIII = new int[8])[0] = ((0x4C ^ 0x14 ^ (0x15 ^ 0x72)) & (0xA9 ^ 0x97 ^ " ".length() ^ -" ".length()));
                    TileEntity$3.llIIIlllIlIIII[1] = " ".length();
                    TileEntity$3.llIIIlllIlIIII[2] = "  ".length();
                    TileEntity$3.llIIIlllIlIIII[3] = "   ".length();
                    TileEntity$3.llIIIlllIlIIII[4] = (0x66 ^ 0x62);
                    TileEntity$3.llIIIlllIlIIII[5] = (0xAA ^ 0xAF);
                    TileEntity$3.llIIIlllIlIIII[6] = (0x5 ^ 0x3);
                    TileEntity$3.llIIIlllIlIIII[7] = (0x9 ^ 0x7A ^ (0x13 ^ 0x68));
                }
                
                private static String lIIIlIlIllIIlIII(final String llllllllllllIlllIlIIIIIlllIlIIII, final String llllllllllllIlllIlIIIIIlllIIllll) {
                    try {
                        final SecretKeySpec llllllllllllIlllIlIIIIIlllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIIIlllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIlllIlIIIIIlllIlIIlI = Cipher.getInstance("Blowfish");
                        llllllllllllIlllIlIIIIIlllIlIIlI.init(TileEntity$3.llIIIlllIlIIII[2], llllllllllllIlllIlIIIIIlllIlIIll);
                        return new String(llllllllllllIlllIlIIIIIlllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIIIlllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlllIlIIIIIlllIlIIIl) {
                        llllllllllllIlllIlIIIIIlllIlIIIl.printStackTrace();
                        return null;
                    }
                }
                
                private static void lIIIlIlIllIIlIlI() {
                    (llIIIlllIIlIIl = new String[TileEntity$3.llIIIlllIlIIII[6]])[TileEntity$3.llIIIlllIlIIII[0]] = lIIIlIlIllIIIllI("OwwKDTYZDF5DcSkNFUM=", "nbacY");
                    TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[1]] = lIIIlIlIllIIIllI("cA==", "YnQeU");
                    TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[2]] = lIIIlIlIllIIlIII("skRILP83kxs=", "EYVbz");
                    TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[3]] = lIIIlIlIllIIlIIl("6UCLMlIu1TM=", "faqdp");
                    TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[4]] = lIIIlIlIllIIIllI("QA==", "pMdGU");
                    TileEntity$3.llIIIlllIIlIIl[TileEntity$3.llIIIlllIlIIII[5]] = lIIIlIlIllIIlIII("99Ka08udvkbvobBpmfrmwI6Iscw4l1WM", "LrQZO");
                }
                
                private static boolean lIIIlIlIlllIlIII(final int llllllllllllIlllIlIIIIIlllIIlIII, final int llllllllllllIlllIlIIIIIlllIIIlll) {
                    return llllllllllllIlllIlIIIIIlllIIlIII < llllllllllllIlllIlIIIIIlllIIIlll;
                }
                
                private static String lIIIlIlIllIIlIIl(final String llllllllllllIlllIlIIIIlIIIIIllII, final String llllllllllllIlllIlIIIIlIIIIIlIII) {
                    try {
                        final SecretKeySpec llllllllllllIlllIlIIIIlIIIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), TileEntity$3.llIIIlllIlIIII[7]), "DES");
                        final Cipher llllllllllllIlllIlIIIIlIIIIlIIII = Cipher.getInstance("DES");
                        llllllllllllIlllIlIIIIlIIIIlIIII.init(TileEntity$3.llIIIlllIlIIII[2], llllllllllllIlllIlIIIIlIIIIlIIlI);
                        return new String(llllllllllllIlllIlIIIIlIIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIIlIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlllIlIIIIlIIIIIlllI) {
                        llllllllllllIlllIlIIIIlIIIIIlllI.printStackTrace();
                        return null;
                    }
                }
                
                private static String lIIIlIlIllIIIllI(String llllllllllllIlllIlIIIIIllllIIIII, final String llllllllllllIlllIlIIIIIllllIIlIl) {
                    llllllllllllIlllIlIIIIIllllIIIII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIIIIIllllIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIlllIlIIIIIllllIIIll = new StringBuilder();
                    final char[] llllllllllllIlllIlIIIIIllllIIIlI = llllllllllllIlllIlIIIIIllllIIlIl.toCharArray();
                    int llllllllllllIlllIlIIIIIllllIIIIl = TileEntity$3.llIIIlllIlIIII[0];
                    final char llllllllllllIlllIlIIIIIlllIllIll = (Object)((String)llllllllllllIlllIlIIIIIllllIIIII).toCharArray();
                    final char llllllllllllIlllIlIIIIIlllIllIlI = (char)llllllllllllIlllIlIIIIIlllIllIll.length;
                    byte llllllllllllIlllIlIIIIIlllIllIIl = (byte)TileEntity$3.llIIIlllIlIIII[0];
                    while (lIIIlIlIlllIlIII(llllllllllllIlllIlIIIIIlllIllIIl, llllllllllllIlllIlIIIIIlllIllIlI)) {
                        final char llllllllllllIlllIlIIIIIllllIlIIl = llllllllllllIlllIlIIIIIlllIllIll[llllllllllllIlllIlIIIIIlllIllIIl];
                        llllllllllllIlllIlIIIIIllllIIIll.append((char)(llllllllllllIlllIlIIIIIllllIlIIl ^ llllllllllllIlllIlIIIIIllllIIIlI[llllllllllllIlllIlIIIIIllllIIIIl % llllllllllllIlllIlIIIIIllllIIIlI.length]));
                        "".length();
                        ++llllllllllllIlllIlIIIIIllllIIIIl;
                        ++llllllllllllIlllIlIIIIIlllIllIIl;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIlllIlIIIIIllllIIIll);
                }
                
                static {
                    lIIIlIlIlllIIllI();
                    lIIIlIlIllIIlIlI();
                }
            });
        }
    }
    
    public int getBlockMetadata() {
        if (lIIIIIIIIIlIIlll(this.blockMetadata, TileEntity.lIllIlllIIllll[21])) {
            final IBlockState llllllllllllIllllllIlIIIIllIlIll = this.worldObj.getBlockState(this.pos);
            this.blockMetadata = llllllllllllIllllllIlIIIIllIlIll.getBlock().getMetaFromState(llllllllllllIllllllIlIIIIllIlIll);
        }
        return this.blockMetadata;
    }
    
    public boolean receiveClientEvent(final int llllllllllllIllllllIlIIIIIIIllII, final int llllllllllllIllllllIlIIIIIIIlIll) {
        return TileEntity.lIllIlllIIllll[0] != 0;
    }
    
    public void writeToNBT(final NBTTagCompound llllllllllllIllllllIlIIIlIIIlIll) {
        final String llllllllllllIllllllIlIIIlIIIlIIl = TileEntity.classToNameMap.get(this.getClass());
        if (lIIIIIIIIIlIIllI(llllllllllllIllllllIlIIIlIIIlIIl)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(this.getClass()).append(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[26]])));
        }
        llllllllllllIllllllIlIIIlIIIlIll.setString(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[27]], llllllllllllIllllllIlIIIlIIIlIIl);
        llllllllllllIllllllIlIIIlIIIlIll.setInteger(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[28]], this.pos.getX());
        llllllllllllIllllllIlIIIlIIIlIll.setInteger(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[29]], this.pos.getY());
        llllllllllllIllllllIlIIIlIIIlIll.setInteger(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[30]], this.pos.getZ());
    }
    
    public void updateContainingBlockInfo() {
        this.blockType = null;
        this.blockMetadata = TileEntity.lIllIlllIIllll[21];
    }
    
    private static boolean lIIIIIIIIIlIlIII(final Object llllllllllllIllllllIIllllIllIlII, final Object llllllllllllIllllllIIllllIllIIll) {
        return llllllllllllIllllllIIllllIllIlII != llllllllllllIllllllIIllllIllIIll;
    }
    
    public TileEntity() {
        this.pos = BlockPos.ORIGIN;
        this.blockMetadata = TileEntity.lIllIlllIIllll[21];
    }
    
    public double getMaxRenderDistanceSquared() {
        return 4096.0;
    }
    
    private static void lIIIIIIIIIlIIIll() {
        (lIllIlllIIllll = new int[38])[0] = ((0x5 ^ 0x39 ^ (0x48 ^ 0x65)) & (0xDB ^ 0x81 ^ (0x38 ^ 0x73) ^ -" ".length()));
        TileEntity.lIllIlllIIllll[1] = " ".length();
        TileEntity.lIllIlllIIllll[2] = "  ".length();
        TileEntity.lIllIlllIIllll[3] = "   ".length();
        TileEntity.lIllIlllIIllll[4] = (0x80 ^ 0x98 ^ (0x53 ^ 0x4F));
        TileEntity.lIllIlllIIllll[5] = (0x8F ^ 0x97 ^ (0xAA ^ 0xB7));
        TileEntity.lIllIlllIIllll[6] = (0xC1 ^ 0xC7);
        TileEntity.lIllIlllIIllll[7] = (66 + 21 + 92 + 11 ^ 111 + 62 - 65 + 77);
        TileEntity.lIllIlllIIllll[8] = (0xB9 ^ 0xB1);
        TileEntity.lIllIlllIIllll[9] = (129 + 105 - 153 + 97 ^ 107 + 19 - 95 + 156);
        TileEntity.lIllIlllIIllll[10] = (0x9D ^ 0x97);
        TileEntity.lIllIlllIIllll[11] = (0x6B ^ 0x60);
        TileEntity.lIllIlllIIllll[12] = (0x3A ^ 0x36);
        TileEntity.lIllIlllIIllll[13] = (0xAC ^ 0xA1);
        TileEntity.lIllIlllIIllll[14] = (0xF1 ^ 0x95 ^ (0x1B ^ 0x71));
        TileEntity.lIllIlllIIllll[15] = (0xB7 ^ 0xB8);
        TileEntity.lIllIlllIIllll[16] = (0x5C ^ 0x4C);
        TileEntity.lIllIlllIIllll[17] = (0xB7 ^ 0xA6);
        TileEntity.lIllIlllIIllll[18] = (0xD3 ^ 0xC1);
        TileEntity.lIllIlllIIllll[19] = (113 + 168 - 255 + 162 ^ 42 + 173 - 195 + 155);
        TileEntity.lIllIlllIIllll[20] = (0xB2 ^ 0xB9 ^ (0xAB ^ 0xB4));
        TileEntity.lIllIlllIIllll[21] = -" ".length();
        TileEntity.lIllIlllIIllll[22] = (0xD ^ 0x52 ^ (0x61 ^ 0x2B));
        TileEntity.lIllIlllIIllll[23] = (112 + 39 - 118 + 114 ^ 125 + 18 - 25 + 15);
        TileEntity.lIllIlllIIllll[24] = (0xBB ^ 0xAC);
        TileEntity.lIllIlllIIllll[25] = (0xC8 ^ 0x9F ^ (0x3D ^ 0x72));
        TileEntity.lIllIlllIIllll[26] = (0x46 ^ 0x52 ^ (0x15 ^ 0x18));
        TileEntity.lIllIlllIIllll[27] = ("   ".length() ^ (0x3F ^ 0x26));
        TileEntity.lIllIlllIIllll[28] = (0x2E ^ 0x35);
        TileEntity.lIllIlllIIllll[29] = (0xDB ^ 0xAF ^ (0x32 ^ 0x5A));
        TileEntity.lIllIlllIIllll[30] = (0xB8 ^ 0xC0 ^ (0xEF ^ 0x8A));
        TileEntity.lIllIlllIIllll[31] = (0x39 ^ 0x27);
        TileEntity.lIllIlllIIllll[32] = (39 + 49 + 40 + 44 ^ 24 + 32 + 76 + 47);
        TileEntity.lIllIlllIIllll[33] = (0x3B ^ 0x3D ^ (0x9C ^ 0xBA));
        TileEntity.lIllIlllIIllll[34] = (0x5E ^ 0x7F);
        TileEntity.lIllIlllIIllll[35] = (0x3F ^ 0x1D);
        TileEntity.lIllIlllIIllll[36] = (82 + 19 - 94 + 224 ^ 49 + 60 - 11 + 98);
        TileEntity.lIllIlllIIllll[37] = (0x4 ^ 0x39 ^ (0x90 ^ 0x89));
    }
    
    private static boolean lIIIIIIIIIlIlIIl(final int llllllllllllIllllllIIllllIlllIII, final int llllllllllllIllllllIIllllIllIlll) {
        return llllllllllllIllllllIIllllIlllIII < llllllllllllIllllllIIllllIllIlll;
    }
    
    public void validate() {
        this.tileEntityInvalid = (TileEntity.lIllIlllIIllll[0] != 0);
    }
    
    private static String lIIIIIIIIIIlIlII(String llllllllllllIllllllIIlllllIIIlll, final String llllllllllllIllllllIIlllllIIlIll) {
        llllllllllllIllllllIIlllllIIIlll = new String(Base64.getDecoder().decode(llllllllllllIllllllIIlllllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIIlllllIIlIlI = new StringBuilder();
        final char[] llllllllllllIllllllIIlllllIIlIIl = llllllllllllIllllllIIlllllIIlIll.toCharArray();
        int llllllllllllIllllllIIlllllIIlIII = TileEntity.lIllIlllIIllll[0];
        final double llllllllllllIllllllIIlllllIIIIlI = (Object)llllllllllllIllllllIIlllllIIIlll.toCharArray();
        final short llllllllllllIllllllIIlllllIIIIIl = (short)llllllllllllIllllllIIlllllIIIIlI.length;
        short llllllllllllIllllllIIlllllIIIIII = (short)TileEntity.lIllIlllIIllll[0];
        while (lIIIIIIIIIlIlIIl(llllllllllllIllllllIIlllllIIIIII, llllllllllllIllllllIIlllllIIIIIl)) {
            final char llllllllllllIllllllIIlllllIIllIl = llllllllllllIllllllIIlllllIIIIlI[llllllllllllIllllllIIlllllIIIIII];
            llllllllllllIllllllIIlllllIIlIlI.append((char)(llllllllllllIllllllIIlllllIIllIl ^ llllllllllllIllllllIIlllllIIlIIl[llllllllllllIllllllIIlllllIIlIII % llllllllllllIllllllIIlllllIIlIIl.length]));
            "".length();
            ++llllllllllllIllllllIIlllllIIlIII;
            ++llllllllllllIllllllIIlllllIIIIII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIIlllllIIlIlI);
    }
    
    private static boolean lIIIIIIIIIlIIllI(final Object llllllllllllIllllllIIllllIlIllll) {
        return llllllllllllIllllllIIllllIlIllll == null;
    }
    
    private static void lIIIIIIIIIlIIIII() {
        (lIllIlllIIlIII = new String[TileEntity.lIllIlllIIllll[37]])[TileEntity.lIllIlllIIllll[0]] = lIIIIIIIIIIlIlII("Ay8jAg4mPw==", "EZQlo");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[1]] = lIIIIIIIIIIlIlIl("UbEpH2poPKk=", "SYTxi");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[2]] = lIIIIIIIIIIlIllI("Bps17BUODK2scNchbEUQTQ==", "nJSPS");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[3]] = lIIIIIIIIIIlIlII("FyEHAxQhFAgNHyA2", "EDdlf");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[4]] = lIIIIIIIIIIlIlII("EAsKGw==", "Dykkj");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[5]] = lIIIIIIIIIIlIllI("L8stUnFjthE=", "Rpumm");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[6]] = lIIIIIIIIIIlIllI("ycFJw75Qx1Y=", "JQBfb");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[7]] = lIIIIIIIIIIlIlII("OiYKJjMWPgYQMQ==", "wIhuC");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[8]] = lIIIIIIIIIIlIlII("FDY6AiI=", "YCIkA");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[9]] = lIIIIIIIIIIlIlII("JiQqBg4Y", "vMYra");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[10]] = lIIIIIIIIIIlIlIl("DafPRMW+d2rBwS6sjYjKpg==", "xkAin");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[11]] = lIIIIIIIIIIlIllI("CDSdF8ltnxYGJpxY+abLXA==", "dcbby");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[12]] = lIIIIIIIIIIlIllI("ZcguDRw+/N55vUiD6VIrmA==", "WqdAg");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[13]] = lIIIIIIIIIIlIllI("HrrhYmpFYHs=", "xqQTf");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[14]] = lIIIIIIIIIIlIlII("JBE5OwMI", "ftXXl");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[15]] = lIIIIIIIIIIlIlII("NBs9Ggc=", "gpHvk");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[16]] = lIIIIIIIIIIlIllI("9C8WmVZ64Mi5nhiCHbCgMQ==", "FCbYt");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[17]] = lIIIIIIIIIIlIllI("FUgWDEkgoJs=", "goToe");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[18]] = lIIIIIIIIIIlIlIl("dvBLi2N9/wpZLNO8KiE56g==", "qCcoY");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[19]] = lIIIIIIIIIIlIllI("sHb+0uWYl7a6aJdxucnvyg==", "DQDcS");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[20]] = lIIIIIIIIIIlIlII("Ggc4LAAq", "XfVBe");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[22]] = lIIIIIIIIIIlIllI("vue6IeDz7VHC4K5XKLPOQQ==", "nGvlW");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[23]] = lIIIIIIIIIIlIlIl("L37pMSipXcQ=", "TShmf");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[24]] = lIIIIIIIIIIlIlIl("Hl9mVMkY8vI=", "hbYxV");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[25]] = lIIIIIIIIIIlIlII("OA==", "BiDUe");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[26]] = lIIIIIIIIIIlIlIl("X/RcJ9vd6K84GSqj7WKH+n5hr2cKpkKocF+xrRKEV2SI/nvjk8rfjA==", "BkgYQ");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[27]] = lIIIIIIIIIIlIlII("Pys=", "VOIOF");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[28]] = lIIIIIIIIIIlIllI("KWq+MjhyFiM=", "vbcHx");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[29]] = lIIIIIIIIIIlIlII("HQ==", "dbJvQ");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[30]] = lIIIIIIIIIIlIlIl("7vM9Be4hZj0=", "YKexL");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[31]] = lIIIIIIIIIIlIlIl("HjnhrBiXHvw=", "koWCt");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[32]] = lIIIIIIIIIIlIllI("S0s+/+upD9OVG9IKg/rXu+Vs+80DVsWmaAILkW6Cnmo=", "GwqFj");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[33]] = lIIIIIIIIIIlIlIl("BC/utbklVsM=", "ehFtp");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[34]] = lIIIIIIIIIIlIlII("GQgfNw==", "WirRD");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[35]] = lIIIIIIIIIIlIllI("7wjY4AoSuTUIjQRhhSawtWeCVrVKVW5K", "XxUJR");
        TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[36]] = lIIIIIIIIIIlIllI("W6E1oeU1OFLJfm1RHVx1WY25YvlQJhu6", "XkZXf");
    }
    
    public double getDistanceSq(final double llllllllllllIllllllIlIIIIlIIllIl, final double llllllllllllIllllllIlIIIIIllllIl, final double llllllllllllIllllllIlIIIIIlllIll) {
        final double llllllllllllIllllllIlIIIIlIIIlll = this.pos.getX() + 0.5 - llllllllllllIllllllIlIIIIlIIllIl;
        final double llllllllllllIllllllIlIIIIlIIIlIl = this.pos.getY() + 0.5 - llllllllllllIllllllIlIIIIIllllIl;
        final double llllllllllllIllllllIlIIIIlIIIIll = this.pos.getZ() + 0.5 - llllllllllllIllllllIlIIIIIlllIll;
        return llllllllllllIllllllIlIIIIlIIIlll * llllllllllllIllllllIlIIIIlIIIlll + llllllllllllIllllllIlIIIIlIIIlIl * llllllllllllIllllllIlIIIIlIIIlIl + llllllllllllIllllllIlIIIIlIIIIll * llllllllllllIllllllIlIIIIlIIIIll;
    }
    
    private static String lIIIIIIIIIIlIllI(final String llllllllllllIllllllIIlllllIllIlI, final String llllllllllllIllllllIIlllllIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllllllIIlllllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIlllllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIlllllIllllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIlllllIllllI.init(TileEntity.lIllIlllIIllll[2], llllllllllllIllllllIIlllllIlllll);
            return new String(llllllllllllIllllllIIlllllIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIlllllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIlllllIlllIl) {
            llllllllllllIllllllIIlllllIlllIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIIIIIIIlIIIll();
        lIIIIIIIIIlIIIII();
        logger = LogManager.getLogger();
        TileEntity.nameToClassMap = (Map<String, Class<? extends TileEntity>>)Maps.newHashMap();
        TileEntity.classToNameMap = (Map<Class<? extends TileEntity>, String>)Maps.newHashMap();
        addMapping(TileEntityFurnace.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[0]]);
        addMapping(TileEntityChest.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[1]]);
        addMapping(TileEntityEnderChest.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[2]]);
        addMapping(BlockJukebox.TileEntityJukebox.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[3]]);
        addMapping(TileEntityDispenser.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[4]]);
        addMapping(TileEntityDropper.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[5]]);
        addMapping(TileEntitySign.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[6]]);
        addMapping(TileEntityMobSpawner.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[7]]);
        addMapping(TileEntityNote.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[8]]);
        addMapping(TileEntityPiston.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[9]]);
        addMapping(TileEntityBrewingStand.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[10]]);
        addMapping(TileEntityEnchantmentTable.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[11]]);
        addMapping(TileEntityEndPortal.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[12]]);
        addMapping(TileEntityCommandBlock.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[13]]);
        addMapping(TileEntityBeacon.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[14]]);
        addMapping(TileEntitySkull.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[15]]);
        addMapping(TileEntityDaylightDetector.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[16]]);
        addMapping(TileEntityHopper.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[17]]);
        addMapping(TileEntityComparator.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[18]]);
        addMapping(TileEntityFlowerPot.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[19]]);
        addMapping(TileEntityBanner.class, TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[20]]);
    }
    
    public void setWorldObj(final World llllllllllllIllllllIlIIIlIlIIIIl) {
        this.worldObj = llllllllllllIllllllIlIIIlIlIIIIl;
    }
    
    private static boolean lIIIIIIIIIlIIlII(final int llllllllllllIllllllIIllllIlIllIl) {
        return llllllllllllIllllllIIllllIlIllIl != 0;
    }
    
    public Packet getDescriptionPacket() {
        return null;
    }
    
    public BlockPos getPos() {
        return this.pos;
    }
    
    private static String lIIIIIIIIIIlIlIl(final String llllllllllllIllllllIIllllllIlIIl, final String llllllllllllIllllllIIllllllIIllI) {
        try {
            final SecretKeySpec llllllllllllIllllllIIllllllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIllllllIIllI.getBytes(StandardCharsets.UTF_8)), TileEntity.lIllIlllIIllll[8]), "DES");
            final Cipher llllllllllllIllllllIIllllllIlIll = Cipher.getInstance("DES");
            llllllllllllIllllllIIllllllIlIll.init(TileEntity.lIllIlllIIllll[2], llllllllllllIllllllIIllllllIllII);
            return new String(llllllllllllIllllllIIllllllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIllllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIllllllIlIlI) {
            llllllllllllIllllllIIllllllIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIIIIlIIlIl(final Object llllllllllllIllllllIIllllIllIIIl) {
        return llllllllllllIllllllIIllllIllIIIl != null;
    }
    
    public void readFromNBT(final NBTTagCompound llllllllllllIllllllIlIIIlIIlIlIl) {
        this.pos = new BlockPos(llllllllllllIllllllIlIIIlIIlIlIl.getInteger(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[23]]), llllllllllllIllllllIlIIIlIIlIlIl.getInteger(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[24]]), llllllllllllIllllllIlIIIlIIlIlIl.getInteger(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[25]]));
    }
    
    private static boolean lIIIIIIIIIlIIlll(final int llllllllllllIllllllIIllllIllllII, final int llllllllllllIllllllIIllllIlllIll) {
        return llllllllllllIllllllIIllllIllllII == llllllllllllIllllllIIllllIlllIll;
    }
    
    public void setPos(final BlockPos llllllllllllIllllllIIlllllllIIlI) {
        this.pos = llllllllllllIllllllIIlllllllIIlI;
    }
    
    public boolean isInvalid() {
        return this.tileEntityInvalid;
    }
    
    public boolean hasWorldObj() {
        if (lIIIIIIIIIlIIlIl(this.worldObj)) {
            return TileEntity.lIllIlllIIllll[1] != 0;
        }
        return TileEntity.lIllIlllIIllll[0] != 0;
    }
    
    private static void addMapping(final Class<? extends TileEntity> llllllllllllIllllllIlIIIlIlIlIIl, final String llllllllllllIllllllIlIIIlIlIlIII) {
        if (lIIIIIIIIIlIIlII(TileEntity.nameToClassMap.containsKey(llllllllllllIllllllIlIIIlIlIlIII) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(TileEntity.lIllIlllIIlIII[TileEntity.lIllIlllIIllll[22]]).append(llllllllllllIllllllIlIIIlIlIlIII)));
        }
        TileEntity.nameToClassMap.put(llllllllllllIllllllIlIIIlIlIlIII, llllllllllllIllllllIlIIIlIlIlIIl);
        "".length();
        TileEntity.classToNameMap.put(llllllllllllIllllllIlIIIlIlIlIIl, llllllllllllIllllllIlIIIlIlIlIII);
        "".length();
    }
    
    public void markDirty() {
        if (lIIIIIIIIIlIIlIl(this.worldObj)) {
            final IBlockState llllllllllllIllllllIlIIIIllIIIII = this.worldObj.getBlockState(this.pos);
            this.blockMetadata = llllllllllllIllllllIlIIIIllIIIII.getBlock().getMetaFromState(llllllllllllIllllllIlIIIIllIIIII);
            this.worldObj.markChunkDirty(this.pos, this);
            if (lIIIIIIIIIlIlIII(this.getBlockType(), Blocks.air)) {
                this.worldObj.updateComparatorOutputLevel(this.pos, this.getBlockType());
            }
        }
    }
    
    public void invalidate() {
        this.tileEntityInvalid = (TileEntity.lIllIlllIIllll[1] != 0);
    }
}
