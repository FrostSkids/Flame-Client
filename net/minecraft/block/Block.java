// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.util.MovingObjectPosition;
import java.util.List;
import net.minecraft.world.Explosion;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.Vec3;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.properties.IProperty;
import net.minecraft.entity.EntityLivingBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.item.Item;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityXPOrb;
import java.util.Random;
import net.minecraft.util.StatCollector;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.ObjectIntIdentityMap;
import net.minecraft.util.RegistryNamespacedDefaultedByKey;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;

public class Block
{
    protected /* synthetic */ double maxX;
    private /* synthetic */ CreativeTabs displayOnCreativeTab;
    public static final /* synthetic */ SoundType soundTypeLadder;
    protected final /* synthetic */ MapColor field_181083_K;
    public static final /* synthetic */ SoundType soundTypeGlass;
    public static final /* synthetic */ SoundType soundTypeSand;
    public static final /* synthetic */ SoundType soundTypeSnow;
    public static final /* synthetic */ SoundType SLIME_SOUND;
    protected /* synthetic */ int lightOpacity;
    protected /* synthetic */ double minY;
    protected final /* synthetic */ Material blockMaterial;
    protected /* synthetic */ boolean needsRandomTick;
    public static final /* synthetic */ SoundType soundTypePiston;
    private static final /* synthetic */ int[] lIIIIIIIllllll;
    private static final /* synthetic */ ResourceLocation AIR_ID;
    public static final /* synthetic */ SoundType soundTypeAnvil;
    protected /* synthetic */ double maxZ;
    public static final /* synthetic */ SoundType soundTypeGravel;
    public /* synthetic */ float slipperiness;
    protected /* synthetic */ boolean translucent;
    public static final /* synthetic */ SoundType soundTypeWood;
    public /* synthetic */ float blockParticleGravity;
    protected /* synthetic */ double minX;
    protected /* synthetic */ int lightValue;
    protected final /* synthetic */ BlockState blockState;
    public /* synthetic */ SoundType stepSound;
    protected /* synthetic */ boolean enableStats;
    protected /* synthetic */ double minZ;
    private /* synthetic */ IBlockState defaultBlockState;
    protected /* synthetic */ boolean useNeighborBrightness;
    protected /* synthetic */ boolean isBlockContainer;
    private static final /* synthetic */ String[] lIIIIIIIlllIII;
    public static final /* synthetic */ RegistryNamespacedDefaultedByKey<ResourceLocation, Block> blockRegistry;
    public static final /* synthetic */ SoundType soundTypeMetal;
    protected /* synthetic */ float blockResistance;
    protected /* synthetic */ boolean fullBlock;
    public static final /* synthetic */ ObjectIntIdentityMap<IBlockState> BLOCK_STATE_IDS;
    public static final /* synthetic */ SoundType soundTypeCloth;
    protected /* synthetic */ double maxY;
    private /* synthetic */ String unlocalizedName;
    public static final /* synthetic */ SoundType soundTypeStone;
    public static final /* synthetic */ SoundType soundTypeGrass;
    protected /* synthetic */ float blockHardness;
    
    private static boolean lIllIIlllIllIll(final Object lllllllllllllIlIlIIIIllllllIllIl, final Object lllllllllllllIlIlIIIIllllllIllII) {
        return lllllllllllllIlIlIIIIllllllIllIl == lllllllllllllIlIlIIIIllllllIllII;
    }
    
    public final double getBlockBoundsMinX() {
        return this.minX;
    }
    
    private static boolean lIllIIllllIIIII(final int lllllllllllllIlIlIIIIlllllllIlll, final int lllllllllllllIlIlIIIIlllllllIllI) {
        return lllllllllllllIlIlIIIIlllllllIlll >= lllllllllllllIlIlIIIIlllllllIllI;
    }
    
    public boolean onBlockActivated(final World lllllllllllllIlIlIIIlIIllIIlIlIl, final BlockPos lllllllllllllIlIlIIIlIIllIIlIlII, final IBlockState lllllllllllllIlIlIIIlIIllIIlIIll, final EntityPlayer lllllllllllllIlIlIIIlIIllIIlIIlI, final EnumFacing lllllllllllllIlIlIIIlIIllIIlIIIl, final float lllllllllllllIlIlIIIlIIllIIlIIII, final float lllllllllllllIlIlIIIlIIllIIIllll, final float lllllllllllllIlIlIIIlIIllIIIlllI) {
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    public void setBlockBoundsForItemRender() {
    }
    
    protected Block setStepSound(final SoundType lllllllllllllIlIlIIIlIllIIlIlllI) {
        this.stepSound = lllllllllllllIlIlIIIlIllIIlIlllI;
        return this;
    }
    
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[20]])));
    }
    
    public void randomDisplayTick(final World lllllllllllllIlIlIIIlIlIIlllIlIl, final BlockPos lllllllllllllIlIlIIIlIlIIlllIlII, final IBlockState lllllllllllllIlIlIIIlIlIIlllIIll, final Random lllllllllllllIlIlIIIlIlIIlllIIlI) {
    }
    
    public CreativeTabs getCreativeTabToDisplayOn() {
        return this.displayOnCreativeTab;
    }
    
    private static boolean lIllIIllllIIlIl(final int lllllllllllllIlIlIIIIllllllIIlII) {
        return lllllllllllllIlIlIIIIllllllIIlII >= 0;
    }
    
    public boolean canPlaceBlockAt(final World lllllllllllllIlIlIIIlIIllIIllIII, final BlockPos lllllllllllllIlIlIIIlIIllIIlIlll) {
        return lllllllllllllIlIlIIIlIIllIIllIII.getBlockState(lllllllllllllIlIlIIIlIIllIIlIlll).getBlock().blockMaterial.isReplaceable();
    }
    
    private static int lIllIIlllIlIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected void dropXpOnBlockBreak(final World lllllllllllllIlIlIIIlIIlllllllII, final BlockPos lllllllllllllIlIlIIIlIIlllllllll, int lllllllllllllIlIlIIIlIIllllllIlI) {
        if (lIllIIlllIlIllI(lllllllllllllIlIlIIIlIIlllllllII.isRemote ? 1 : 0)) {
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
            while (!lIllIIlllIlllll(lllllllllllllIlIlIIIlIIllllllIlI)) {
                final int lllllllllllllIlIlIIIlIIlllllllIl = EntityXPOrb.getXPSplit(lllllllllllllIlIlIIIlIIllllllIlI);
                lllllllllllllIlIlIIIlIIllllllIlI -= lllllllllllllIlIlIIIlIIlllllllIl;
                lllllllllllllIlIlIIIlIIlllllllII.spawnEntityInWorld(new EntityXPOrb(lllllllllllllIlIlIIIlIIlllllllII, lllllllllllllIlIlIIIlIIlllllllll.getX() + 0.5, lllllllllllllIlIlIIIlIIlllllllll.getY() + 0.5, lllllllllllllIlIlIIIlIIlllllllll.getZ() + 0.5, lllllllllllllIlIlIIIlIIlllllllIl));
                "".length();
            }
        }
    }
    
    public boolean onBlockEventReceived(final World lllllllllllllIlIlIIIlIIIlllllIll, final BlockPos lllllllllllllIlIlIIIlIIIlllllIlI, final IBlockState lllllllllllllIlIlIIIlIIIlllllIIl, final int lllllllllllllIlIlIIIlIIIlllllIII, final int lllllllllllllIlIlIIIlIIIllllIlll) {
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    protected Block disableStats() {
        this.enableStats = (Block.lIIIIIIIllllll[0] != 0);
        return this;
    }
    
    private static void lIllIIlllIIlIIl() {
        (lIIIIIIIlllIII = new String[Block.lIIIIIIIllllll[413]])[Block.lIIIIIIIllllll[0]] = lIllIIllIlIlIll("FgQV", "wmgfe");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[1]] = lIllIIllIlIllII("ofeeNkDjvCc=", "VjGBj");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[2]] = lIllIIllIlIlIll("AgQnMA==", "ukHTh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[3]] = lIllIIllIlIllII("lT635C/LTPY=", "AgUlx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[4]] = lIllIIllIlIlIll("EAoSMiE=", "wxsAR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[5]] = lIllIIllIlIlIll("Kzs2KTM=", "XOYGV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[6]] = lIllIIllIlIllIl("9X0YfUp9FCU=", "VBWUj");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[7]] = lIllIIllIlIllII("JHWcS6ApVfQ=", "QgNOD");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[8]] = lIllIIllIlIlIll("AigMLCQ=", "aDcXL");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[9]] = lIllIIllIlIlIll("EjUEJQ==", "aTjAI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[10]] = lIllIIllIlIllIl("4k0+UeGzyBU=", "WhqDf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[11]] = lIllIIllIlIlIll("DzEhJwgR", "cPECm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[12]] = lIllIIllIlIlIll("LBQ7HAk=", "MzMue");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[13]] = lIllIIllIlIllII("gbrWG9Z3td8=", "gPoli");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[16]] = lIllIIllIlIllII("qXjKf2wOiT4aTpe5QsjKhwkVAk3d3++FhE2DYI9wjLg=", "YGvJo");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[15]] = lIllIIllIlIllII("THFrR+kp0+7eLc5QtFZShXYHLEiQNkma", "yUqbI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[18]] = lIllIIllIlIlIll("MgY6ECUzLRwWOSU=", "VinyI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[20]] = lIllIIllIlIllII("U+rkWHJJQV0=", "MsrsP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[21]] = lIllIIllIlIlIll("MRsFC0s=", "Erine");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[22]] = lIllIIllIlIlIll("ExYhJgYq", "QzNEm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[23]] = lIllIIllIlIllII("t20beGdK5vI=", "SDxls");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[24]] = lIllIIllIlIlIll("KSY/", "HOMDm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[25]] = lIllIIllIlIllII("azhJRi0aX4c=", "RdiKs");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[26]] = lIllIIllIlIllIl("kUFiubb5me8=", "ekLSl");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[27]] = lIllIIllIlIllIl("5eFeSkd38n8=", "maBzu");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[28]] = lIllIIllIlIlIll("LgAkBgU=", "IrEuv");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[29]] = lIllIIllIlIllIl("n5NwFTtZmWY=", "NRBxx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[30]] = lIllIIllIlIlIll("Dh0fHQ==", "jtmiZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[31]] = lIllIIllIlIllII("mYx9LSyrEpIYHHKiiMVbDA==", "iKbZa");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[32]] = lIllIIllIlIlIll("NCI2BCEyPiAJIzI=", "WMTfM");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[33]] = lIllIIllIlIlIll("LToGAA==", "ZUidn");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[34]] = lIllIIllIlIllII("7JNtsSHGJ+s=", "ZaJDx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[35]] = lIllIIllIlIlIll("PC4cBQQhKA==", "OOlim");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[36]] = lIllIIllIlIlIll("KRYqJxg0EA==", "ZwZKq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[37]] = lIllIIllIlIllIl("GmNXoR066lU=", "xqwyL");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[38]] = lIllIIllIlIlIll("AAMoBQQBDQ==", "bfLwk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[39]] = lIllIIllIlIllII("yYQeB9yUC0kyb5eD0j0W1A==", "PmxOd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[40]] = lIllIIllIlIllII("LfDVNvbC32Q=", "QkdBw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[41]] = lIllIIllIlIllIl("1tTu7N5BvSk=", "lFxIQ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[42]] = lIllIIllIlIllII("Uo9ZGGZTQTY=", "LGJjZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[43]] = lIllIIllIlIllIl("fDUD8slU7+jnzPyPy8wdOw==", "hXZzN");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[44]] = lIllIIllIlIllIl("s6/1YOGvj+Q=", "HGaLA");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[45]] = lIllIIllIlIlIll("DzIaDw==", "cSlni");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[46]] = lIllIIllIlIllII("lcZ1Mm6+1k4=", "SfGaG");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[47]] = lIllIIllIlIllII("QD2L/tIPw0A=", "aMZpx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[48]] = lIllIIllIlIlIll("KQskIQ==", "ZjJEb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[49]] = lIllIIllIlIllIl("vQhD8dPIias=", "URuFZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[50]] = lIllIIllIlIlIll("LzEXJREk", "HCvSt");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[51]] = lIllIIllIlIllII("bA94xTir7YCHcCn53B/wlA==", "QiURb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[52]] = lIllIIllIlIllII("idGRZyNvRuQ=", "xkmLi");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[53]] = lIllIIllIlIllII("JMmKFf13MjVT/J0L94T9ww==", "OleGp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[54]] = lIllIIllIlIllIl("EyNxzLeWr64=", "FaSjw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[55]] = lIllIIllIlIllII("3/mkSZDPar6TY0elaeW9pQ==", "Qxpqn");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[56]] = lIllIIllIlIllII("Dk/wzo0BprA=", "HuPRO");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[57]] = lIllIIllIlIlIll("AQss", "mdKlQ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[58]] = lIllIIllIlIllII("z5MHaVFwPr0=", "MlyYP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[59]] = lIllIIllIlIlIll("IR8ZICY+", "MzxVC");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[60]] = lIllIIllIlIlIll("Bw0oBQcY", "khIsb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[61]] = lIllIIllIlIlIll("CRgALwYf", "zhoAa");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[62]] = lIllIIllIlIllIl("7ev9MoWtOoE=", "BicoI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[63]] = lIllIIllIlIlIll("FgUMFDs=", "qimgH");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[64]] = lIllIIllIlIlIll("PQoRNBI=", "ZfpGa");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[65]] = lIllIIllIlIlIll("FA4ROwknABM3", "xoaRz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[66]] = lIllIIllIlIllII("4IgdFP0NejGlpDE980Phaw==", "yAehg");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[67]] = lIllIIllIlIllIl("F9DRWOQr0Reni5Pgz00hFQ==", "NXCav");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[68]] = lIllIIllIlIllII("z+dkVmX+Pl1/Ip1i1FjG7Q==", "lERVN");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[69]] = lIllIIllIlIlIll("FSQrAx8fPj0B", "qMXsz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[70]] = lIllIIllIlIlIll("ATM4KS4LKS4r", "eZKYK");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[71]] = lIllIIllIlIllIl("rRXSSdCulaScIICDQfXM1A==", "YscBX");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[72]] = lIllIIllIlIlIll("HigqACkZJioB", "mIDdZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[73]] = lIllIIllIlIlIll("HSU1BBIfJSIK", "sJAap");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[74]] = lIllIIllIlIllIl("ej+etsTD6Y9+0Qx6VpYtDA==", "JWDWv");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[75]] = lIllIIllIlIllII("qvGW6nF3zhU=", "QCXVY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[76]] = lIllIIllIlIlIll("KDYe", "JSzXB");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[77]] = lIllIIllIlIlIll("HTkDMDcUCR01OxY=", "zVoTR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[78]] = lIllIIllIlIllII("M+6y+S+YdAiBNG+T/WxIwA==", "itIUp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[79]] = lIllIIllIlIlIll("DwEWLRkfCxAXCAoNDg==", "kdbHz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[80]] = lIllIIllIlIllII("yeXWP45b1GbGdJEFTsOEQQ==", "IBNQf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[81]] = lIllIIllIlIllIl("GlGcnXIzU88Wm0On+ZEpQA==", "gvTXU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[82]] = lIllIIllIlIllII("fyWFZqjovwfriu8YQ7PDSWrI/wOg/bQD", "nwcal");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[83]] = lIllIIllIlIlIll("DTIS", "zWpNq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[84]] = lIllIIllIlIllII("oEpLdCZOxuQ=", "NQuMr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[85]] = lIllIIllIlIllIl("dzeHa8tkm7zbBUMDQ2PjVA==", "giADS");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[86]] = lIllIIllIlIllII("HpCjaPgct7hc5xUcu0++0Q==", "jUdyY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[87]] = lIllIIllIlIllIl("7UZRva8Qo2IIkEZn4yI1Nw==", "UWmom");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[88]] = lIllIIllIlIllIl("Smp1lZp2pAwHU/PqHm5rjA==", "pjnPf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[89]] = lIllIIllIlIllIl("6h8OJMVTMT0=", "aPmla");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[90]] = lIllIIllIlIlIll("NwwnPDkpJzU7Mw==", "GeTHV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[91]] = lIllIIllIlIllII("P4R2qJeqdrtvRgcPSBX/XA==", "ZvLJg");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[92]] = lIllIIllIlIlIll("Fj8xAjYIFCMFPA==", "fVBvY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[93]] = lIllIIllIlIlIll("Pho5Bw==", "IuVkY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[94]] = lIllIIllIlIllIl("X0VSXAWr3LY=", "QGYNm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[95]] = lIllIIllIlIlIll("BSU2Oh0bEyA2BhAiNicdGw==", "uLENr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[96]] = lIllIIllIlIllII("0c3GbEMqZr2QHCY0L0jzNQ==", "oQHfv");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[97]] = lIllIIllIlIllIl("8gnCbBtU4pM=", "ESiLc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[98]] = lIllIIllIlIlIll("GBw9LQwGFi4XGA==", "jyYrj");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[99]] = lIllIIllIlIllIl("KCTKEj4h9O8=", "AhAwc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[100]] = lIllIIllIlIlIll("CzwfCSAJJgE=", "fIlaR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[101]] = lIllIIllIlIlIll("BxM7NDk6DCEwPxcOOy4=", "eaTCW");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[102]] = lIllIIllIlIllII("jSo5zXcP+lw/nCvAjb76EA==", "LlowJ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[103]] = lIllIIllIlIllIl("cEXi+afUTNRVNwMIaVsTUg==", "YtmcO");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[104]] = lIllIIllIlIllIl("rUG2eY4N3SuPCBqh8G4iGg==", "SzbHw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[105]] = lIllIIllIlIllII("nS+6nix3rbbKSNQeEfmPkg==", "DuCtM");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[106]] = lIllIIllIlIlIll("JTYLFAsuKAsZPw==", "LDdzT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[107]] = lIllIIllIlIllIl("YJwmHNKzQ61407SeOCaabQ==", "gzRUh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[108]] = lIllIIllIlIllII("EBtzZaVROFyXqtsFysN2tTYMwX725uFm", "dXtxU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[109]] = lIllIIllIlIllIl("kROvYfWxH7vVQgO52o3d9g==", "Dieqb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[110]] = lIllIIllIlIlIll("EBofAjE8HRwNNg==", "cnplT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[111]] = lIllIIllIlIllII("Mqdwv+TulTDaPhjPNF0+kg==", "KsXzR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[112]] = lIllIIllIlIllIl("HO6nwqjhGJk=", "kDmwJ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[113]] = lIllIIllIlIllII("DWTuhsh/O+Vu9RIWiq3Hxw==", "loIzN");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[114]] = lIllIIllIlIlIll("JQID", "Qlwea");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[115]] = lIllIIllIlIllIl("PFsQB16eL/w=", "ctHYm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[116]] = lIllIIllIlIllIl("onxODhs4O8rVIX7WGk/Y5w==", "GhHan");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[117]] = lIllIIllIlIllIl("iWEgG7SVC2qgxWm3J0pwyA==", "fiFWl");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[118]] = lIllIIllIlIllII("6ySYINUxWrw60mXquNbvqDVQ4z0GpSCP", "IxpDg");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[119]] = lIllIIllIlIlIll("Ag01BRc8FikY", "qyZkr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[120]] = lIllIIllIlIlIll("Gg8cKA8cDAE=", "umoAk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[121]] = lIllIIllIlIllII("w3FwIWS5lrsDmEZJ4E7HfA==", "NGhte");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[122]] = lIllIIllIlIlIll("MTURLgA=", "EZcMh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[123]] = lIllIIllIlIllIl("euhM/NkwFqE=", "evKwe");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[124]] = lIllIIllIlIlIll("LS0fMQ==", "KDmTR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[125]] = lIllIIllIlIllIl("aa7m2Pe5Pc0=", "LnvfR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[126]] = lIllIIllIlIllIl("gsapCRCsj01l2VXcRQ9Yyg==", "dSzvP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[127]] = lIllIIllIlIlIll("OQouMQY1EiIHBA==", "TeLbv");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[128]] = lIllIIllIlIllIl("Tj34mP7dkn3w2zCxbshTnw==", "gavHD");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[129]] = lIllIIllIlIllIl("mEkJ9rLxrI/b1r3XV0hfIA==", "qxSRN");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[130]] = lIllIIllIlIlIll("BQcwJAU=", "foUWq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[131]] = lIllIIllIlIlIll("FS4INAA=", "vFmGt");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[132]] = lIllIIllIlIllIl("DZcgyZPk5Kf8tZaPJQcn6g==", "SSEzw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[133]] = lIllIIllIlIllIl("Yfzvo8fcRkfUqUM3tqhPBg==", "KrzbZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[134]] = lIllIIllIlIllIl("ZMPETUOBGnJIMl+1dTlIvw==", "EUvdy");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[135]] = lIllIIllIlIllII("1jkHSdn20JwGqykzjeRqdg==", "onWhx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[136]] = lIllIIllIlIlIll("Aw02FzwJAAgYPwgHPA==", "gdWzS");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[137]] = lIllIIllIlIlIll("BBUABwMiEA4JBwgd", "fyodh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[138]] = lIllIIllIlIlIll("EgoTFTMYFhUsMxAaHhY=", "qxrsG");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[139]] = lIllIIllIlIlIll("OSYAOhorJxE5", "NIrQx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[140]] = lIllIIllIlIllII("BnYR8CUI+f0=", "amrrD");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[141]] = lIllIIllIlIllII("FXtBAa296ko=", "ibWNU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[142]] = lIllIIllIlIllII("pK01y8aFK3kcVWx/dmbnLQ==", "BxcvY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[143]] = lIllIIllIlIllIl("jClcwP4df2ad2H4c9S1pVw==", "xGLdz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[144]] = lIllIIllIlIlIll("BScDPDgANw==", "cRqRY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[145]] = lIllIIllIlIlIll("DjoRJwcLKg==", "hOcIf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[146]] = lIllIIllIlIllIl("M1+Y6ZaHL8/o8Ikj2V/g7A==", "GZmBb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[147]] = lIllIIllIlIllIl("zKpviXXiRC8=", "DrUKz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[148]] = lIllIIllIlIllII("c9G0ii8qlnGthbw/d2FV1Q==", "rRYfU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[149]] = lIllIIllIlIlIll("FQQKIg==", "fmmLi");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[150]] = lIllIIllIlIllIl("mD/dYbQRsV8VcQhr+X7bsw==", "vvKYW");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[151]] = lIllIIllIlIlIll("LB0CBR8pGQ==", "HrmwP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[152]] = lIllIIllIlIllIl("SP/KR0Ap9MQ=", "jNXUI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[153]] = lIllIIllIlIllII("oodEtVgisKc=", "AqKtC");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[154]] = lIllIIllIlIllIl("I05BgvHMvcw=", "mVLsX");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[155]] = lIllIIllIlIlIll("KjQTOA==", "XUzTU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[156]] = lIllIIllIlIlIll("OwMJLxUXBBIgGToE", "HwfAp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[157]] = lIllIIllIlIllIl("1y0gCygADlj/13AH0KSoqQ==", "SJejB");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[158]] = lIllIIllIlIllII("GbbElEYueAJvdbz2nxvQcw==", "PbZmT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[159]] = lIllIIllIlIllIl("1X6SBpZoMnI=", "pLAlE");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[160]] = lIllIIllIlIlIll("Pi0OLxY=", "RHxJd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[161]] = lIllIIllIlIlIll("OjQPEhk=", "VQywk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[162]] = lIllIIllIlIlIll("FxwNCCo7GBADPBcdEAMQFAQDEio=", "dhbfO");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[163]] = lIllIIllIlIllII("Tl1ysShAlaGx5GFMjEAo7qpKpLwNyaSl", "mlrMt");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[164]] = lIllIIllIlIllII("hxzr38fH8uAdk3JBqc1IJQ==", "hwvnF");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[165]] = lIllIIllIlIllIl("D0JigzM2D0IE17iZvEZHpA==", "WUGVi");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[166]] = lIllIIllIlIllIl("QJXOHhvKAP0JQGl3crlJjJo93F6hsC2i", "IiVhD");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[167]] = lIllIIllIlIllIl("sP9lngFep3SJ+c5+hIxQcJV/qQbD1MPs", "LAwht");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[168]] = lIllIIllIlIllIl("OlhsAo4vC62zNrqNLbcWpw==", "tIhWm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[169]] = lIllIIllIlIllII("lD98zzNCQXsI1YPaff+6pg==", "LBsZm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[170]] = lIllIIllIlIlIll("CC4hKQEBIyYCHAoiChkBAQ==", "dGUvs");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[171]] = lIllIIllIlIlIll("JBcrBRMvFjo4GC4=", "KeNWv");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[172]] = lIllIIllIlIllIl("ZcKjE2pri3uZduFE0uJ6WpsdDFmKvs3N", "EECbe");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[173]] = lIllIIllIlIlIll("PgIcDSskCA==", "PmhJJ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[174]] = lIllIIllIlIllII("zeJ/H6o6CqOBaHjFWTE5uA==", "HYnLu");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[175]] = lIllIIllIlIllIl("rduWTOkN/Bk=", "TzBpR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[176]] = lIllIIllIlIllII("7H9M0JAAs0SC5gzDnxqb+g==", "sWJsn");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[177]] = lIllIIllIlIllII("wgx+AiPFvcA=", "WBPfS");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[178]] = lIllIIllIlIllIl("/y9PdGbpnVbKx1BEZLbZow==", "KTCVI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[179]] = lIllIIllIlIllII("hUVWztbmVLQ=", "WSeYB");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[180]] = lIllIIllIlIlIll("MBU1", "YvPqP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[181]] = lIllIIllIlIllIl("Xf11Zedv6lc=", "vSQXZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[182]] = lIllIIllIlIlIll("KgAtEw==", "YnBdO");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[183]] = lIllIIllIlIlIll("EAEOLw==", "coaXt");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[184]] = lIllIIllIlIllIl("wOrjE6eMwDY=", "vrSmh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[185]] = lIllIIllIlIllII("9F0AkVtY6oY=", "odlCg");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[186]] = lIllIIllIlIllII("eR5Tep1q0FQ=", "ddzVh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[187]] = lIllIIllIlIllIl("bHQ1Eg6hHhs=", "CCqWV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[188]] = lIllIIllIlIllII("jKmfOVvhu1s=", "qqkzu");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[189]] = lIllIIllIlIlIll("PTcQMQE=", "ORuUr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[190]] = lIllIIllIlIllII("F5N4L0SiN00=", "pEEcN");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[191]] = lIllIIllIlIllIl("VqSpq5uy44s=", "czkyS");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[192]] = lIllIIllIlIllII("vwD/L2Xr9Y8=", "TVfeP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[193]] = lIllIIllIlIllIl("Jh0h/MLZkTg=", "QVpzk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[194]] = lIllIIllIlIllIl("F9KOkEjPOkY=", "MSDcT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[195]] = lIllIIllIlIllIl("lNjnMAQmVbw=", "JkxPr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[196]] = lIllIIllIlIlIll("DxwkOSYTCzEyKA==", "ayPQC");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[197]] = lIllIIllIlIllIl("aXSuTz4O1LusjPRURa7YHA==", "mKWqr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[198]] = lIllIIllIlIllII("6WUOADS9RC0jKT3jTtZTfQ==", "loVJd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[199]] = lIllIIllIlIllIl("WulvvLIl2gFQK9imvpYmrQ==", "ZhwZf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[200]] = lIllIIllIlIllIl("CtDoYX+ApAYoTmkb5GSSSw==", "ncnVs");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[201]] = lIllIIllIlIlIll("Nj8uAiE9MyQ=", "ZVIjU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[202]] = lIllIIllIlIllIl("1LSyiSJ3LR4=", "dyVeY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[203]] = lIllIIllIlIllII("FeXMwRYp8Kc=", "oLTqT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[204]] = lIllIIllIlIllIl("VNSx0TAwUt1zSw89nizBrw==", "sOJrT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[205]] = lIllIIllIlIllIl("WHAwv0ULL0haFwS9CEdjDg==", "pHBAX");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[206]] = lIllIIllIlIllIl("defI6t78Lkg=", "pUQwk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[207]] = lIllIIllIlIllII("eUbvG4J3YzU=", "EcYQf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[208]] = lIllIIllIlIllIl("JhvxqqyZW4V4J0kEBVbiRKJhEIiima/8", "XVQKU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[209]] = lIllIIllIlIllIl("Wcbu0D+iSIg=", "wUXVL");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[210]] = lIllIIllIlIllII("Tviff7Uayf3eDNPj7yUgsevjqBW1sGwu", "zobum");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[211]] = lIllIIllIlIlIll("CyYELi4=", "oOkJK");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[212]] = lIllIIllIlIllII("kcz6PLQmGVzvEHVQ92kutQ==", "ECZyh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[213]] = lIllIIllIlIlIll("GiUoLhcMNQ4rGBoi", "iQIGy");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[214]] = lIllIIllIlIllII("WFDAfNdr3vWWyI5QfPKggw==", "aopXc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[215]] = lIllIIllIlIlIll("HzgrAgwEJTg=", "kJJrh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[216]] = lIllIIllIlIlIll("GxsUABATBiUWAxE=", "vtzsd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[217]] = lIllIIllIlIlIll("FCQLNA4cOTYzFRcuICAd", "yKeGz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[218]] = lIllIIllIlIlIll("KhsZBwI7HR8KDCoCGQYTMQ==", "Yovig");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[219]] = lIllIIllIlIlIll("ORADAhwoFgUPEg==", "Jdlly");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[220]] = lIllIIllIlIllIl("X8DksJm6+1gTjNv7039Mi2knJx35in6x", "Bpozi");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[221]] = lIllIIllIlIllII("1p48qNC83DSTbo9QIhE4EA==", "IvYdc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[222]] = lIllIIllIlIlIll("JikgGzohPyw2ODshGyY7Oy8v", "TLDDW");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[223]] = lIllIIllIlIlIll("Lz4GBhUtJBg=", "BKung");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[224]] = lIllIIllIlIlIll("BTEFFAYOIhgJ", "lCjzY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[225]] = lIllIIllIlIllII("nGpTD+nm5VfibolY/VV1mQ==", "ZySpS");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[226]] = lIllIIllIlIlIll("Mzs2JRILJzY4BA==", "TWWVa");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[227]] = lIllIIllIlIllII("goRxNnWf2vthZtYNM7PN9A==", "NbeLT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[228]] = lIllIIllIlIllIl("rVPDwhZce8U=", "PCYMj");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[229]] = lIllIIllIlIlIll("FzQBGS8lMwEZIhE=", "zQmvA");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[230]] = lIllIIllIlIllII("kN4NVgjFbcb/PLcoolenYw==", "SLygy");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[231]] = lIllIIllIlIllIl("bl/RDgbbl9ku1z5KBin8aw==", "vpxDs");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[232]] = lIllIIllIlIllII("12Cc/7YPYD2SzG0n1RKlZA==", "rKeAM");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[233]] = lIllIIllIlIllII("ErmMP7kSOzTRDJ/Kb8Hx9g==", "PHhIx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[234]] = lIllIIllIlIlIll("Gw02Jw==", "mdXBx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[235]] = lIllIIllIlIlIll("NzAkNw==", "AYJRK");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[236]] = lIllIIllIlIlIll("PgwLChIHDgQdEg==", "Xieiw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[237]] = lIllIIllIlIllIl("FG9p9d93SqFLhoV7Rhzghw==", "ySJWC");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[238]] = lIllIIllIlIllIl("MtaEORPtpF2bizohxzzsew==", "KggQf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[239]] = lIllIIllIlIlIll("FB4ALTcUKBMtJgw=", "gjaDE");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[240]] = lIllIIllIlIlIll("PQ4ZIRwRGAQmGiUlBTsYJwgF", "NzvOy");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[241]] = lIllIIllIlIlIll("JzgZIgQnHwwkGDEOCiIVPx8VJBkgJA==", "TLxKv");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[242]] = lIllIIllIlIllII("yH/47NLUYHJC8/D5W5aw3Q==", "uTvfk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[243]] = lIllIIllIlIlIll("BC8UJwo=", "iVwBf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[244]] = lIllIIllIlIllIl("Fr85haA5A3EAPnRlcQknWA==", "HKHmM");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[245]] = lIllIIllIlIllII("gsDuuyyyxXjf+HhK8kygvg==", "mJuoy");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[246]] = lIllIIllIlIllII("AWHYrAmtJKLkBrJOL1uMNw==", "YCOau");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[247]] = lIllIIllIlIllII("D7i5x6FIMRKU73yeWCwQ1g==", "HDQdY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[248]] = lIllIIllIlIllII("ZJLGwCUfDBoQ/UaPz7jIpLnAQzZDJU+P", "Fjmgq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[249]] = lIllIIllIlIllIl("ocnv/BC7aJv29gxnG0bwCg==", "AcCrl");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[250]] = lIllIIllIlIlIll("FiYYAiAKHA4YLBsoMxkxGSoeGQ==", "xCljE");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[251]] = lIllIIllIlIllIl("8CMVFkI89CSMcFfaf96KQVyHZLZaedGq", "JruXn");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[252]] = lIllIIllIlIlIll("FygDGQMLEgAQFA0=", "yMwqf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[253]] = lIllIIllIlIllIl("HsrxKsWGoXFAUU71MQqbhA==", "PrefS");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[254]] = lIllIIllIlIllIl("LIO82rQJblm9uF0X3cAijzNTsmF6HI4B", "QAtGN");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[255]] = lIllIIllIlIllII("0FNXUtNy0TtUJkoMB3vmMKRlNf0AHkTz", "sIsWD");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[256]] = lIllIIllIlIllIl("GcMhycfzeevY70H0JLDvWA==", "zvRrI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[257]] = lIllIIllIlIllIl("2eSHfg2nENSCj5ps631ipQ==", "EvZBm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[17]] = lIllIIllIlIllII("fO+06JjyeAWUO2ijbjJs2g==", "fhevo");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[258]] = lIllIIllIlIllIl("HGbtHqGM+huGD9aMzjfWXQ==", "MvKLA");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[259]] = lIllIIllIlIllIl("fm5++iI0yWg4GIRkGzHEDA==", "lrEyK");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[260]] = lIllIIllIlIlIll("FhwAGBIcABAmDiwUFiYPFg==", "srdGb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[261]] = lIllIIllIlIllIl("3rk+N/LzcgH6t9hsbQ60Jw==", "dAFYd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[262]] = lIllIIllIlIllII("iLIU6nGx0oiiNf7e1aIpDA==", "AiGcH");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[263]] = lIllIIllIlIllIl("q7GiwbRq8tufvLfujb39bQ==", "OyVJD");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[264]] = lIllIIllIlIlIll("MCIFAAY6DwEADg==", "TPdgi");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[265]] = lIllIIllIlIllII("clUgKfQqGpCx2b5Jwzn/UQ==", "cOCGB");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[266]] = lIllIIllIlIlIll("KC0uJgU1Ji8KHTslOg==", "ZHJUq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[267]] = lIllIIllIlIllIl("3UcsHrsM1uOe1r1lzse31w==", "TliGp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[268]] = lIllIIllIlIllII("takOqSdjgBM7N1SKLMP9OnfPO3uon109", "NVySw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[269]] = lIllIIllIlIllIl("wrM2OoMUlItBvc6KB0wQGA==", "hjxsj");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[270]] = lIllIIllIlIlIll("DgMnJQQPMyUoBw4JPBgbBg0w", "jlRGh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[271]] = lIllIIllIlIlIll("FDkYMzQPNxU=", "cVwWg");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[272]] = lIllIIllIlIllII("/VRtvgnb5TTcLNQsdFu87Q==", "LmiGQ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[273]] = lIllIIllIlIllIl("HPlY1PGr22iwVNlHVBzFAg==", "MzcuY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[274]] = lIllIIllIlIllIl("nbUWtbFJij0=", "YLOZO");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[275]] = lIllIIllIlIllII("0dYmKURunNQ=", "langY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[276]] = lIllIIllIlIlIll("EgwnACMVAicBDxIZKA0iEg==", "amIdP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[277]] = lIllIIllIlIllIl("ztBF7T8LMqoYvZBHwRDtdA==", "FvhVG");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[278]] = lIllIIllIlIlIll("LgwpJwonBRM6GS4=", "KaLUk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[279]] = lIllIIllIlIllIl("QzzJb5IznCKCwMz/0p5tvw==", "xDUbs");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[280]] = lIllIIllIlIllIl("9FTz7piZxdoYxDgOwisHAw==", "vgXbm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[281]] = lIllIIllIlIllII("wDUKJYU9VDukVA32K//qwg==", "tWxEt");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[282]] = lIllIIllIlIllIl("TRRLNBbdncNB4P7dNxdKGA==", "XlBvi");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[283]] = lIllIIllIlIllIl("/71Z6g7Yx9UGa1q7wo0zBQ==", "GHfAx");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[284]] = lIllIIllIlIllIl("Y3ClDJCnnQtLpPLk1sX9cA==", "Puglp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[285]] = lIllIIllIlIlIll("HTAEIRQAMAg=", "iBmQC");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[286]] = lIllIIllIlIllII("snDJM5AdA4ZPp2fkwpn6gQ==", "oLrSG");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[287]] = lIllIIllIlIllII("SauiXyntTEnova6uxJwpiA==", "FfqoZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[288]] = lIllIIllIlIllIl("MPHTeA4zNgepflaCZFePvw==", "jFPNF");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[289]] = lIllIIllIlIllII("8hx9sMKk5UVRkDqPsyCpFwNB3w0tdeYX", "ZrpZe");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[290]] = lIllIIllIlIllIl("ZGKsARV7hQfsT8JEy1mxRw==", "vlPQq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[291]] = lIllIIllIlIllII("2lDuzazG8ejzTv/hhpsrXg==", "wpFFb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[292]] = lIllIIllIlIllII("GcQFMysCSdmGAQ8OqtZaqw==", "vQtKf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[293]] = lIllIIllIlIllII("rcfgBbcdJR4ei6efxjIyY7V7xbyfoLv6", "pekHr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[294]] = lIllIIllIlIllII("r4ynL5JpdA7ScERjAueGqg==", "mmhwl");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[295]] = lIllIIllIlIllIl("hubkSINj3CHC+sDJ8hExXg==", "tuoFB");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[296]] = lIllIIllIlIlIll("AAcrEyYM", "bbJpI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[297]] = lIllIIllIlIllII("UzjRaSB6gXI=", "wSIoR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[298]] = lIllIIllIlIllIl("ifg2AFMYowwbqlWlTKoGk5KoBMFQLtVg", "dRyZK");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[299]] = lIllIIllIlIllIl("l/VIJ6oBviYzt5n2ujsOfw==", "wqCPC");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[300]] = lIllIIllIlIllII("qI3RV7HnaFFrxSiUAyajkg==", "PsmnV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[301]] = lIllIIllIlIllIl("MF6o5JvGuyg5vfEm45MHMA==", "SUPYU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[302]] = lIllIIllIlIllIl("BTsz91QDuWQ=", "FOHVR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[303]] = lIllIIllIlIllIl("FEE3S4X4rIw=", "JffCz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[304]] = lIllIIllIlIllIl("QCJhq9UbVDvcT6J6ebpBAQ==", "ZdpAH");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[305]] = lIllIIllIlIllIl("J7YAQY19ERhyZtao6nwaZA==", "tTGAJ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[306]] = lIllIIllIlIlIll("NgcaAAcvNxcRFjUHGw==", "Ahudb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[307]] = lIllIIllIlIllIl("a20rBMCzzGo=", "hAmtw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[308]] = lIllIIllIlIlIll("Hi0aJjU=", "mFoJY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[309]] = lIllIIllIlIllIl("uGbF/l74bJw=", "WQlgk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[310]] = lIllIIllIlIlIll("ETcdEAM=", "pYkyo");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[311]] = lIllIIllIlIllII("05MhuLX2Eww=", "cXtAz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[312]] = lIllIIllIlIllII("HRoGjUYM7SppAmIcV+bgWQ==", "BptXS");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[313]] = lIllIIllIlIllII("k5/+0cL4qyAxk5QhOu39lA==", "GsXkZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[314]] = lIllIIllIlIllII("fPRKyfulmM8lRGDis4HEsbzKjKVNNBE1bw4j7zI0/7U=", "HIFfI");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[315]] = lIllIIllIlIllII("7qhXieKhkjsgp5Go9tJBStdz8qcR52Et", "BqqhZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[316]] = lIllIIllIlIlIll("Gi4yBREtPDYaDxo/Nhc3Ajk2ABsHOTYsGB4qJxY=", "rKSsh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[317]] = lIllIIllIlIlIll("Ni4RDiQ1Lhw5ICA/HTYkJCoOEA==", "AKxiL");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[318]] = lIllIIllIlIllIl("9PSpARZf3/HEEO0fFxFRWiEnVwm3uPS1", "NPxLX");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[319]] = lIllIIllIlIllIl("AiNgLtiPjWcoWM4fOgBorQ==", "qdrPW");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[320]] = lIllIIllIlIllII("Rl7TEJ0mJRg98bGd8mZKRH9YWBvuUrlZ", "oXHPV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[321]] = lIllIIllIlIlIll("Ow05JzEqAyA4Ig==", "XbTWP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[322]] = lIllIIllIlIlIll("EC8SDgcTJh89ChE6DgEaGzw=", "tNkbn");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[323]] = lIllIIllIlIllII("JSVXniyBdu4Eo+VN/I751w==", "ipTAT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[324]] = lIllIIllIlIllII("xc7KRWiiOqTS0tzipXWvsQ==", "EFeLV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[325]] = lIllIIllIlIllII("86Bh55wKbFgwbqe/OxjYtw==", "XSzsd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[326]] = lIllIIllIlIlIll("FDwXMAYIKBY5EQ4j", "zYcXc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[327]] = lIllIIllIlIllII("VuOTofaTiwY=", "phUke");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[328]] = lIllIIllIlIllII("R1a7CdS2S0Y=", "PDHoq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[329]] = lIllIIllIlIlIll("OhMtKjMxJCA3JCA=", "KfLXG");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[330]] = lIllIIllIlIllIl("87xQwX8mrigNVXosGOf+Qg==", "WKdOL");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[331]] = lIllIIllIlIlIll("CB4GJBUDNBQiABAZFA==", "ykgVa");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[332]] = lIllIIllIlIlIll("KzAPLBYrFRskFiw+", "XDnEd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[333]] = lIllIIllIlIlIll("BBUmITwEAj06FRcXOyQ=", "evRHJ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[334]] = lIllIIllIlIllIl("+OHGE5emIZa/W/bikRjYEw==", "yXdyw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[335]] = lIllIIllIlIllIl("s41FTNmEH38=", "Yfwti");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[336]] = lIllIIllIlIlIll("LDwnPjEtPA==", "HNHNA");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[337]] = lIllIIllIlIllII("6F3O4WubovF4G+dnWT0hOflngj18vMpf", "hxBjT");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[338]] = lIllIIllIlIlIll("OTwIMAI7Ig0sJD80Oj0rMz4MLQ==", "ZPiIJ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[339]] = lIllIIllIlIllIl("O9PKZ4ZojgGU6zOaD2L+sYn4+QdcaYlm", "jdvvV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[340]] = lIllIIllIlIllIl("byAnCo1MhNOA/h440dtg5fwm5lndKjnH", "pgrgZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[341]] = lIllIIllIlIllII("futk2J+cn7A=", "WAHIr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[342]] = lIllIIllIlIllIl("QmQqbWsa6d4=", "XbhGY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[343]] = lIllIIllIlIllIl("4d2byEvGrmw=", "mWRab");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[344]] = lIllIIllIlIllIl("7t1XyCBNEJs=", "EcNew");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[345]] = lIllIIllIlIlIll("GBQHLwsYKBU4AxAFFQ==", "ywfLb");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[346]] = lIllIIllIlIllII("okwiw4+KVJRTCKLtzvrRBjkPvLOtNW7r", "pnwNu");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[347]] = lIllIIllIlIllIl("3GQyrIhIzltCkJHyuPWyyw==", "AqFBr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[348]] = lIllIIllIlIlIll("IjI4ISUiETYnMxUnKyMYMC0=", "QFYHW");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[349]] = lIllIIllIlIlIll("FQcoBx8=", "fkAjz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[350]] = lIllIIllIlIllIl("Mh1haaSTrIQ=", "rJlyi");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[351]] = lIllIIllIlIlIll("Li4oNyQpPQ==", "LOZEM");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[352]] = lIllIIllIlIllIl("BYoL1610e7Q=", "AGZZf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[353]] = lIllIIllIlIllIl("XJzHhBRdVsuBNl3yvGBRgw==", "OOoEL");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[354]] = lIllIIllIlIlIll("HBMCLyMHAB0lGBoT", "uamAw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[355]] = lIllIIllIlIllII("4UKWNRr04WU/Zq2VyLIVfg==", "lNkYG");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[356]] = lIllIIllIlIlIll("PzMOCxwuMw4WFA==", "OAgxq");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[357]] = lIllIIllIlIlIll("JCkUMCA2IgEKPjk=", "WLuoL");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[358]] = lIllIIllIlIlIll("BwkYIwQaGBwdCw==", "tlyoe");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[359]] = lIllIIllIlIllIl("xw5mg/e3JNpAgY59COPHNg==", "VkEdK");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[360]] = lIllIIllIlIllII("2dLVz6j9vr8i5WddJ1eZrw==", "XeRxZ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[361]] = lIllIIllIlIllIl("M9BylSWLcDE=", "KDRKj");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[362]] = lIllIIllIlIllIl("NWlRAxBLjvjOHZv/+CTGfQ==", "PdpRp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[363]] = lIllIIllIlIllII("5/4HjSIiTtPieNv5EZbvCg==", "KtMJm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[364]] = lIllIIllIlIlIll("GggpECsYFiwMDRwA", "ydHic");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[365]] = lIllIIllIlIllIl("TTF1+faCxU2wq39JEph6oA==", "UkgFc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[366]] = lIllIIllIlIllIl("SLXeQP6qILqKkUzaufiXHg==", "OyojX");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[367]] = lIllIIllIlIllII("zXCcvfkVPTcqw3+o9tBnHw==", "smGpE");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[368]] = lIllIIllIlIllIl("z0b5+kzWQZU33H5/tF4hOg==", "WCSpm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[369]] = lIllIIllIlIllII("j5k6RvtKUbGemV4s6t5IXw==", "QLdoH");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[370]] = lIllIIllIlIlIll("ETIPNzYLKAkGMAMoADwg", "bFnYR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[371]] = lIllIIllIlIlIll("MyYiJyoj", "QGLIO");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[372]] = lIllIIllIlIlIll("EREcHhwEER4cJhQ=", "fpprC");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[373]] = lIllIIllIlIllIl("Yp9PnkCmyrE=", "BfPNp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[374]] = lIllIIllIlIllIl("zpsg3zT5mHgZaAMcm2bHhYVUKrU7oBB4OaIa7a5fyWY=", "CaUxE");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[375]] = lIllIIllIlIllII("jKTE1YRTP6GwxfXyhXq9AQ==", "iWjwh");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[376]] = lIllIIllIlIlIll("IQInNyoyCScbLTwJJg==", "SgChY");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[377]] = lIllIIllIlIllII("3u22tOPO/upVokqCdGpLEs7HD41n43Ba", "fVqkU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[378]] = lIllIIllIlIlIll("MBMILSQwNQwgBSIJDRciLAkM", "CgiDV");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[379]] = lIllIIllIlIllIl("yWjGIZmxfoSZUP7Ft7YGrNLLcO2wCek6", "txmJe");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[380]] = lIllIIllIlIllII("eR7PO+jcAyH2NtVgPZDwGg==", "adOyc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[381]] = lIllIIllIlIllIl("gsmVjbqmAE5GMg2Z81Rapg==", "hyoVp");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[382]] = lIllIIllIlIlIll("ORorCCMZAiUEdA==", "JnDfF");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[383]] = lIllIIllIlIllIl("qy8Sep3tVI6GOI4Y0AZMW4UkASuxI+2N", "ANuqc");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[384]] = lIllIIllIlIllII("HmGbRddoGVkiS3XI8ClYNw==", "jENHm");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[385]] = lIllIIllIlIllIl("5a6fwwPi6s2fyqUn2TyQhm0wePt4rfrB", "GgNBv");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[386]] = lIllIIllIlIlIll("JQ0BBToBAR0FNwAFBwM=", "GdsfR");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[387]] = lIllIIllIlIllII("LVsQxkk2HHth9tB7al3eHtkmghre3pzs", "wWmYX");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[388]] = lIllIIllIlIllIl("8mxowEoBaCI5i5uUf6UzYQ==", "WvzZM");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[389]] = lIllIIllIlIllII("JbgXHcwyiCVxjvpGDsApyXgo968o/KM2", "nxwOJ");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[390]] = lIllIIllIlIllII("NREOKx7vxxoIfUoe5zPYXYHZJ4C44PAW", "UHOji");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[391]] = lIllIIllIlIllII("9lqdlo2pWdbgjFxPVZU5qRHcWwR06u/j", "EbcvU");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[392]] = lIllIIllIlIllIl("45wUxVt2z5tz5a6Yz0H6ug==", "Evmbo");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[393]] = lIllIIllIlIlIll("JDUKJgYyGh42CzQg", "WExSe");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[394]] = lIllIIllIlIllII("QxSHJeG7/5ou3VzC2CEppg==", "bIHiO");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[395]] = lIllIIllIlIlIll("AR4BMzg8ERY+MwY=", "cwsPP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[396]] = lIllIIllIlIllIl("Rxr6QDC6Z9z4mWdgOClsUA==", "IJikA");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[397]] = lIllIIllIlIlIll("JQQ6Mh4qLjIwHCwU", "OqTUr");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[398]] = lIllIIllIlIlIll("HxAKKggQIwEjBxA=", "uedMd");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[399]] = lIllIIllIlIllII("U7al2HPAuiM3gCRhVrfsCg==", "CejrE");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[400]] = lIllIIllIlIllII("psPaprDMsmacA79imjilCQ==", "DyrLk");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[401]] = lIllIIllIlIllIl("83y94OabEJKSou29U4lyVQ==", "GdMMl");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[402]] = lIllIIllIlIlIll("DRIJEDkNNw0dMwk=", "lqhsP");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[403]] = lIllIIllIlIllIl("DGEIq5n9gRBbiPzThgV8vg==", "MBlGE");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[404]] = lIllIIllIlIlIll("FwcVHhEDGg8PJw==", "shzlB");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[405]] = lIllIIllIlIllII("LfQ15gypR73N7u/+t3KTaQ==", "BTZnz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[406]] = lIllIIllIlIllII("n5GBFxRrtafyzDbwrmo6BA==", "KVwcf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[407]] = lIllIIllIlIllIl("jXnONYHlEve+WVWje0SO1g==", "vZWtz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[408]] = lIllIIllIlIllIl("QBvJOG7Flx/V5/VWKZXhhQ==", "Ngwiw");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[409]] = lIllIIllIlIlIll("NggxDB82NDQAGSU=", "WkPov");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[410]] = lIllIIllIlIllIl("+qEiQ9LtvM1NZTtW6ftIsQ==", "MXzdz");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[411]] = lIllIIllIlIllII("Ayk274/W8/6mUSRDQeJjoA==", "Fpwsf");
        Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[412]] = lIllIIllIlIllII("SYQWpNuGpBQvVJmPugXrlw==", "hzDYG");
    }
    
    public static void spawnAsEntity(final World lllllllllllllIlIlIIIlIlIIIIIllIl, final BlockPos lllllllllllllIlIlIIIlIlIIIIIllII, final ItemStack lllllllllllllIlIlIIIlIlIIIIIlIll) {
        if (lIllIIlllIlIllI(lllllllllllllIlIlIIIlIlIIIIIllIl.isRemote ? 1 : 0) && lIllIIlllIlIlII(lllllllllllllIlIlIIIlIlIIIIIllIl.getGameRules().getBoolean(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[18]]) ? 1 : 0)) {
            final float lllllllllllllIlIlIIIlIlIIIIlIIlI = 0.5f;
            final double lllllllllllllIlIlIIIlIlIIIIlIIIl = lllllllllllllIlIlIIIlIlIIIIIllIl.rand.nextFloat() * lllllllllllllIlIlIIIlIlIIIIlIIlI + (1.0f - lllllllllllllIlIlIIIlIlIIIIlIIlI) * 0.5;
            final double lllllllllllllIlIlIIIlIlIIIIlIIII = lllllllllllllIlIlIIIlIlIIIIIllIl.rand.nextFloat() * lllllllllllllIlIlIIIlIlIIIIlIIlI + (1.0f - lllllllllllllIlIlIIIlIlIIIIlIIlI) * 0.5;
            final double lllllllllllllIlIlIIIlIlIIIIIllll = lllllllllllllIlIlIIIlIlIIIIIllIl.rand.nextFloat() * lllllllllllllIlIlIIIlIlIIIIlIIlI + (1.0f - lllllllllllllIlIlIIIlIlIIIIlIIlI) * 0.5;
            final EntityItem lllllllllllllIlIlIIIlIlIIIIIlllI = new EntityItem(lllllllllllllIlIlIIIlIlIIIIIllIl, lllllllllllllIlIlIIIlIlIIIIIllII.getX() + lllllllllllllIlIlIIIlIlIIIIlIIIl, lllllllllllllIlIlIIIlIlIIIIIllII.getY() + lllllllllllllIlIlIIIlIlIIIIlIIII, lllllllllllllIlIlIIIlIlIIIIIllII.getZ() + lllllllllllllIlIlIIIlIlIIIIIllll, lllllllllllllIlIlIIIlIlIIIIIlIll);
            lllllllllllllIlIlIIIlIlIIIIIlllI.setDefaultPickupDelay();
            lllllllllllllIlIlIIIlIlIIIIIllIl.spawnEntityInWorld(lllllllllllllIlIlIIIlIlIIIIIlllI);
            "".length();
        }
    }
    
    public Item getItemDropped(final IBlockState lllllllllllllIlIlIIIlIlIIlIllIlI, final Random lllllllllllllIlIlIIIlIlIIlIllIIl, final int lllllllllllllIlIlIIIlIlIIlIllIII) {
        return Item.getItemFromBlock(this);
    }
    
    public void onBlockDestroyedByPlayer(final World lllllllllllllIlIlIIIlIlIIlllIIII, final BlockPos lllllllllllllIlIlIIIlIlIIllIllll, final IBlockState lllllllllllllIlIlIIIlIlIIllIlllI) {
    }
    
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIlIIIlIlIlIIlIllI, final BlockPos lllllllllllllIlIlIIIlIlIlIIlIlIl, final IBlockState lllllllllllllIlIlIIIlIlIlIIlIlII) {
        return new AxisAlignedBB(lllllllllllllIlIlIIIlIlIlIIlIlIl.getX() + this.minX, lllllllllllllIlIlIIIlIlIlIIlIlIl.getY() + this.minY, lllllllllllllIlIlIIIlIlIlIIlIlIl.getZ() + this.minZ, lllllllllllllIlIlIIIlIlIlIIlIlIl.getX() + this.maxX, lllllllllllllIlIlIIIlIlIlIIlIlIl.getY() + this.maxY, lllllllllllllIlIlIIIlIlIlIIlIlIl.getZ() + this.maxZ);
    }
    
    public boolean isFullBlock() {
        return this.fullBlock;
    }
    
    private static int lIllIIllllIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void registerBlock(final int lllllllllllllIlIlIIIlIIIIIllllIl, final String lllllllllllllIlIlIIIlIIIIIllllII, final Block lllllllllllllIlIlIIIlIIIIIlllIII) {
        registerBlock(lllllllllllllIlIlIIIlIIIIIllllIl, new ResourceLocation(lllllllllllllIlIlIIIlIIIIIllllII), lllllllllllllIlIlIIIlIIIIIlllIII);
    }
    
    public int getComparatorInputOverride(final World lllllllllllllIlIlIIIlIIIlIlIIIll, final BlockPos lllllllllllllIlIlIIIlIIIlIlIIIlI) {
        return Block.lIIIIIIIllllll[0];
    }
    
    public void onNeighborBlockChange(final World lllllllllllllIlIlIIIlIlIIllIllII, final BlockPos lllllllllllllIlIlIIIlIlIIllIlIll, final IBlockState lllllllllllllIlIlIIIlIlIIllIlIlI, final Block lllllllllllllIlIlIIIlIlIIllIlIIl) {
    }
    
    public String getUnlocalizedName() {
        return String.valueOf(new StringBuilder(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[21]]).append(this.unlocalizedName));
    }
    
    public boolean requiresUpdates() {
        return Block.lIIIIIIIllllll[1] != 0;
    }
    
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIlIIIlIIlIlllIIII, final BlockPos lllllllllllllIlIlIIIlIIlIllIllll) {
    }
    
    public float getBlockHardness(final World lllllllllllllIlIlIIIlIlIlllllIll, final BlockPos lllllllllllllIlIlIIIlIlIlllllIlI) {
        return this.blockHardness;
    }
    
    public final double getBlockBoundsMaxX() {
        return this.maxX;
    }
    
    public void onLanded(final World lllllllllllllIlIlIIIlIIIllIlllll, final Entity lllllllllllllIlIlIIIlIIIllIllllI) {
        lllllllllllllIlIlIIIlIIIllIllllI.motionY = 0.0;
    }
    
    public static Block getBlockFromName(final String lllllllllllllIlIlIIIlIllIllIIlll) {
        final ResourceLocation lllllllllllllIlIlIIIlIllIllIlIIl = new ResourceLocation(lllllllllllllIlIlIIIlIllIllIIlll);
        if (lIllIIlllIlIlII(Block.blockRegistry.containsKey(lllllllllllllIlIlIIIlIllIllIlIIl) ? 1 : 0)) {
            return Block.blockRegistry.getObject(lllllllllllllIlIlIIIlIllIllIlIIl);
        }
        try {
            return Block.blockRegistry.getObjectById(Integer.parseInt(lllllllllllllIlIlIIIlIllIllIIlll));
        }
        catch (NumberFormatException lllllllllllllIlIlIIIlIllIllIlIII) {
            return null;
        }
    }
    
    public final int colorMultiplier(final IBlockAccess lllllllllllllIlIlIIIlIIlIlIIlllI, final BlockPos lllllllllllllIlIlIIIlIIlIlIlIIII) {
        return this.colorMultiplier(lllllllllllllIlIlIIIlIIlIlIIlllI, lllllllllllllIlIlIIIlIIlIlIlIIII, Block.lIIIIIIIllllll[0]);
    }
    
    public int getLightValue() {
        return this.lightValue;
    }
    
    private static int lIllIIllllIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean isReplaceable(final World lllllllllllllIlIlIIIlIllIIIIlIII, final BlockPos lllllllllllllIlIlIIIlIllIIIIIlll) {
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    private static boolean lIllIIlllIlIlII(final int lllllllllllllIlIlIIIIllllllIlIII) {
        return lllllllllllllIlIlIIIIllllllIlIII != 0;
    }
    
    private static void lIllIIlllIlIIll() {
        (lIIIIIIIllllll = new int[414])[0] = ((0x23 ^ 0x11) & ~(0x38 ^ 0xA));
        Block.lIIIIIIIllllll[1] = " ".length();
        Block.lIIIIIIIllllll[2] = "  ".length();
        Block.lIIIIIIIllllll[3] = "   ".length();
        Block.lIIIIIIIllllll[4] = (0x2 ^ 0x7A ^ (0x3 ^ 0x7F));
        Block.lIIIIIIIllllll[5] = (0x9F ^ 0x9A);
        Block.lIIIIIIIllllll[6] = (0x3D ^ 0x3B);
        Block.lIIIIIIIllllll[7] = (0xA6 ^ 0xA1);
        Block.lIIIIIIIllllll[8] = (0x4C ^ 0x44);
        Block.lIIIIIIIllllll[9] = (31 + 52 + 5 + 55 ^ 103 + 88 - 64 + 7);
        Block.lIIIIIIIllllll[10] = (0xB6 ^ 0xBC);
        Block.lIIIIIIIllllll[11] = (0xBD ^ 0xA9 ^ (0x9B ^ 0x84));
        Block.lIIIIIIIllllll[12] = (0xF ^ 0x18 ^ (0x5A ^ 0x41));
        Block.lIIIIIIIllllll[13] = (0x40 ^ 0x4D);
        Block.lIIIIIIIllllll[14] = (-(0xFFFFEF67 & 0x5099) & (0xFFFFCFFF & 0x7FFF));
        Block.lIIIIIIIllllll[15] = (0x38 ^ 0x37);
        Block.lIIIIIIIllllll[16] = (0x54 ^ 0x5A);
        Block.lIIIIIIIllllll[17] = 139 + 119 - 125 + 122;
        Block.lIIIIIIIllllll[18] = (21 + 151 - 96 + 99 ^ 136 + 104 - 87 + 38);
        Block.lIIIIIIIllllll[19] = (-1 & 0xFFFFFF);
        Block.lIIIIIIIllllll[20] = (0xA7 ^ 0x92 ^ (0x5 ^ 0x21));
        Block.lIIIIIIIllllll[21] = (0x1D ^ 0x3B ^ (0x40 ^ 0x74));
        Block.lIIIIIIIllllll[22] = (0x48 ^ 0x6A ^ (0x66 ^ 0x57));
        Block.lIIIIIIIllllll[23] = (137 + 31 - 131 + 172 ^ 178 + 21 - 141 + 139);
        Block.lIIIIIIIllllll[24] = (0x93 ^ 0x86);
        Block.lIIIIIIIllllll[25] = (0x89 ^ 0x82 ^ (0x25 ^ 0x38));
        Block.lIIIIIIIllllll[26] = (0xF ^ 0x18);
        Block.lIIIIIIIllllll[27] = (0x86 ^ 0xA5 ^ (0xB2 ^ 0x89));
        Block.lIIIIIIIllllll[28] = (99 + 1 + 59 + 16 ^ 152 + 31 - 40 + 39);
        Block.lIIIIIIIllllll[29] = (0xFC ^ 0xA5 ^ (0x25 ^ 0x66));
        Block.lIIIIIIIllllll[30] = (0x35 ^ 0x61 ^ (0x2B ^ 0x64));
        Block.lIIIIIIIllllll[31] = (0x93 ^ 0x8F);
        Block.lIIIIIIIllllll[32] = (0x27 ^ 0x23 ^ (0x3D ^ 0x24));
        Block.lIIIIIIIllllll[33] = (0x20 ^ 0x3E);
        Block.lIIIIIIIllllll[34] = (0x64 ^ 0x7B);
        Block.lIIIIIIIllllll[35] = (0x6D ^ 0x4D);
        Block.lIIIIIIIllllll[36] = (0x61 ^ 0x40);
        Block.lIIIIIIIllllll[37] = (0x77 ^ 0x55);
        Block.lIIIIIIIllllll[38] = (0x60 ^ 0x19 ^ (0x66 ^ 0x3C));
        Block.lIIIIIIIllllll[39] = (130 + 111 - 128 + 74 ^ 43 + 134 - 140 + 122);
        Block.lIIIIIIIllllll[40] = (0x7D ^ 0x58);
        Block.lIIIIIIIllllll[41] = (0xD ^ 0x2B);
        Block.lIIIIIIIllllll[42] = (0x10 ^ 0x31 ^ (0x95 ^ 0x93));
        Block.lIIIIIIIllllll[43] = (0x65 ^ 0x54 ^ (0xB2 ^ 0xAB));
        Block.lIIIIIIIllllll[44] = (0x6A ^ 0x43);
        Block.lIIIIIIIllllll[45] = (0x22 ^ 0x8);
        Block.lIIIIIIIllllll[46] = (0x78 ^ 0x3D ^ (0x56 ^ 0x38));
        Block.lIIIIIIIllllll[47] = (0x88 ^ 0xA4);
        Block.lIIIIIIIllllll[48] = (0x27 ^ 0xA);
        Block.lIIIIIIIllllll[49] = (0x3D ^ 0x78 ^ (0xD0 ^ 0xBB));
        Block.lIIIIIIIllllll[50] = (0x43 ^ 0x6C);
        Block.lIIIIIIIllllll[51] = (0x86 ^ 0x8B ^ (0x1 ^ 0x3C));
        Block.lIIIIIIIllllll[52] = (0x77 ^ 0xC ^ (0x4E ^ 0x4));
        Block.lIIIIIIIllllll[53] = (0xBC ^ 0x8E);
        Block.lIIIIIIIllllll[54] = (0x28 ^ 0x1B);
        Block.lIIIIIIIllllll[55] = (0x87 ^ 0xB3);
        Block.lIIIIIIIllllll[56] = (0x91 ^ 0xA4);
        Block.lIIIIIIIllllll[57] = (0xFB ^ 0x98 ^ (0xEF ^ 0xBA));
        Block.lIIIIIIIllllll[58] = (0x6A ^ 0x5D);
        Block.lIIIIIIIllllll[59] = (0x7 ^ 0x3F);
        Block.lIIIIIIIllllll[60] = (0x4D ^ 0x74);
        Block.lIIIIIIIllllll[61] = (0x10 ^ 0x66 ^ (0x79 ^ 0x35));
        Block.lIIIIIIIllllll[62] = (0x18 ^ 0x23);
        Block.lIIIIIIIllllll[63] = (0xAD ^ 0x84 ^ (0x9D ^ 0x88));
        Block.lIIIIIIIllllll[64] = (0x1B ^ 0x26);
        Block.lIIIIIIIllllll[65] = (48 + 6 + 16 + 74 ^ 88 + 28 - 109 + 167);
        Block.lIIIIIIIllllll[66] = (115 + 54 - 160 + 165 ^ 6 + 42 + 76 + 21);
        Block.lIIIIIIIllllll[67] = (0xC0 ^ 0x80);
        Block.lIIIIIIIllllll[68] = (55 + 152 - 145 + 167 ^ 90 + 10 + 56 + 8);
        Block.lIIIIIIIllllll[69] = (0x66 ^ 0x24);
        Block.lIIIIIIIllllll[70] = (173 + 67 - 46 + 10 ^ 101 + 30 - 115 + 127);
        Block.lIIIIIIIllllll[71] = (147 + 150 - 287 + 190 ^ 72 + 109 - 110 + 69);
        Block.lIIIIIIIllllll[72] = (65 + 95 - 79 + 51 ^ 81 + 187 - 99 + 24);
        Block.lIIIIIIIllllll[73] = (0x34 ^ 0x72);
        Block.lIIIIIIIllllll[74] = (0x1C ^ 0x5B);
        Block.lIIIIIIIllllll[75] = (172 + 112 - 82 + 14 ^ 45 + 73 + 22 + 4);
        Block.lIIIIIIIllllll[76] = (0x14 ^ 0x20 ^ (0x2B ^ 0x56));
        Block.lIIIIIIIllllll[77] = (0x7E ^ 0x3F ^ (0x99 ^ 0x92));
        Block.lIIIIIIIllllll[78] = (0xF0 ^ 0xBB);
        Block.lIIIIIIIllllll[79] = (0xE4 ^ 0xA8);
        Block.lIIIIIIIllllll[80] = (208 + 146 - 167 + 54 ^ 177 + 2 - 40 + 49);
        Block.lIIIIIIIllllll[81] = (0x69 ^ 0x27);
        Block.lIIIIIIIllllll[82] = (0x88 ^ 0xC0 ^ (0x28 ^ 0x2F));
        Block.lIIIIIIIllllll[83] = (0x5B ^ 0xB);
        Block.lIIIIIIIllllll[84] = (0x69 ^ 0x7F ^ (0xD2 ^ 0x95));
        Block.lIIIIIIIllllll[85] = (0x68 ^ 0x3A);
        Block.lIIIIIIIllllll[86] = (14 + 218 - 37 + 35 ^ 109 + 14 + 9 + 49);
        Block.lIIIIIIIllllll[87] = (0xF2 ^ 0xA6);
        Block.lIIIIIIIllllll[88] = (0x68 ^ 0x3D);
        Block.lIIIIIIIllllll[89] = (0xE9 ^ 0x93 ^ (0x83 ^ 0xAF));
        Block.lIIIIIIIllllll[90] = (0xB1 ^ 0x90 ^ (0x4F ^ 0x39));
        Block.lIIIIIIIllllll[91] = (60 + 215 - 120 + 75 ^ 169 + 44 - 193 + 170);
        Block.lIIIIIIIllllll[92] = (0x75 ^ 0x2C);
        Block.lIIIIIIIllllll[93] = (0x61 ^ 0x68 ^ (0x32 ^ 0x61));
        Block.lIIIIIIIllllll[94] = (0x6A ^ 0x31);
        Block.lIIIIIIIllllll[95] = (0xB4 ^ 0x92 ^ (0x6D ^ 0x17));
        Block.lIIIIIIIllllll[96] = (0x44 ^ 0x19);
        Block.lIIIIIIIllllll[97] = (92 + 3 + 31 + 91 ^ 106 + 0 - 24 + 53);
        Block.lIIIIIIIllllll[98] = (0x9A ^ 0xB3 ^ (0x50 ^ 0x26));
        Block.lIIIIIIIllllll[99] = (171 + 143 - 167 + 103 ^ 40 + 104 - 92 + 102);
        Block.lIIIIIIIllllll[100] = (0xAE ^ 0xC3 ^ (0x4B ^ 0x47));
        Block.lIIIIIIIllllll[101] = (0xDE ^ 0x95 ^ (0x6F ^ 0x46));
        Block.lIIIIIIIllllll[102] = (97 + 120 - 39 + 24 ^ 20 + 42 + 10 + 97);
        Block.lIIIIIIIllllll[103] = (0x1E ^ 0x7A);
        Block.lIIIIIIIllllll[104] = (0xF7 ^ 0x92);
        Block.lIIIIIIIllllll[105] = (0xDF ^ 0xB9);
        Block.lIIIIIIIllllll[106] = (0x70 ^ 0x2F ^ (0xAD ^ 0x95));
        Block.lIIIIIIIllllll[107] = (0x3F ^ 0x59 ^ (0x69 ^ 0x67));
        Block.lIIIIIIIllllll[108] = (0x5D ^ 0x1A ^ (0xEF ^ 0xC1));
        Block.lIIIIIIIllllll[109] = (0x73 ^ 0x19);
        Block.lIIIIIIIllllll[110] = (0x47 ^ 0x7D ^ (0xF9 ^ 0xA8));
        Block.lIIIIIIIllllll[111] = (0x6B ^ 0x7);
        Block.lIIIIIIIllllll[112] = (0x4 ^ 0x69);
        Block.lIIIIIIIllllll[113] = (0x71 ^ 0x1F);
        Block.lIIIIIIIllllll[114] = (165 + 118 - 153 + 100 ^ 132 + 27 - 59 + 37);
        Block.lIIIIIIIllllll[115] = (0xC3 ^ 0xB3);
        Block.lIIIIIIIllllll[116] = (41 + 12 + 91 + 62 ^ 64 + 165 - 186 + 148);
        Block.lIIIIIIIllllll[117] = (0x4F ^ 0x3D);
        Block.lIIIIIIIllllll[118] = (248 + 7 - 22 + 22 ^ 76 + 47 - 45 + 62);
        Block.lIIIIIIIllllll[119] = (0x24 ^ 0x36 ^ (0xA3 ^ 0xC5));
        Block.lIIIIIIIllllll[120] = (0xE ^ 0x7B);
        Block.lIIIIIIIllllll[121] = (0xBA ^ 0x80 ^ (0x66 ^ 0x2A));
        Block.lIIIIIIIllllll[122] = (14 + 28 + 56 + 82 ^ 108 + 82 - 108 + 113);
        Block.lIIIIIIIllllll[123] = (189 + 202 - 253 + 114 ^ 38 + 15 + 26 + 53);
        Block.lIIIIIIIllllll[124] = (0xF0 ^ 0x89);
        Block.lIIIIIIIllllll[125] = (0xFF ^ 0x85);
        Block.lIIIIIIIllllll[126] = (0x19 ^ 0x62);
        Block.lIIIIIIIllllll[127] = (0x64 ^ 0x3A ^ (0x76 ^ 0x54));
        Block.lIIIIIIIllllll[128] = (0xD6 ^ 0xAB);
        Block.lIIIIIIIllllll[129] = (0x74 ^ 0x19 ^ (0x91 ^ 0x82));
        Block.lIIIIIIIllllll[130] = 42 + 62 - 50 + 73;
        Block.lIIIIIIIllllll[131] = 52 + 72 - 60 + 64;
        Block.lIIIIIIIllllll[132] = (0x9 ^ 0x5) + (0x2B ^ 0x4E) - (0x15 ^ 0x4E) + (0x65 ^ 0xE);
        Block.lIIIIIIIllllll[133] = 78 + 119 - 160 + 93;
        Block.lIIIIIIIllllll[134] = (0x1F ^ 0x53) + (0xE ^ 0x49) - (0x55 ^ 0x1B) + (0x9B ^ 0xA5);
        Block.lIIIIIIIllllll[135] = (0xE2 ^ 0xA7) + (0x12 ^ 0x25) - (0xCC ^ 0x9D) + (0x5E ^ 0x7);
        Block.lIIIIIIIllllll[136] = (0x39 ^ 0x1B) + (0xA7 ^ 0xBE) - -(0x98 ^ 0xAE) + (0x64 ^ 0x70);
        Block.lIIIIIIIllllll[137] = 79 + 70 - 62 + 47;
        Block.lIIIIIIIllllll[138] = 54 + 116 - 78 + 43;
        Block.lIIIIIIIllllll[139] = 104 + 118 - 176 + 90;
        Block.lIIIIIIIllllll[140] = (0x4 ^ 0xD) + (0x6C ^ 0x74) - (0x98 ^ 0x9C) + (0x4 ^ 0x68);
        Block.lIIIIIIIllllll[141] = 75 + 1 + 7 + 45 + (0xD9 ^ 0x99) - (0xE5 ^ 0xB6) + (0x4F ^ 0x52);
        Block.lIIIIIIIllllll[142] = 122 + 123 - 184 + 78;
        Block.lIIIIIIIllllll[143] = (0x55 ^ 0x31) + (0x41 ^ 0x29) - (0x40 ^ 0x4) + (0x76 ^ 0x72);
        Block.lIIIIIIIllllll[144] = (0x16 ^ 0x66) + (0x24 ^ 0x2A) - (0x6F ^ 0x40) + (0x33 ^ 0xD);
        Block.lIIIIIIIllllll[145] = 105 + 118 - 178 + 97;
        Block.lIIIIIIIllllll[146] = 75 + 70 - 108 + 106;
        Block.lIIIIIIIllllll[147] = (0x7F ^ 0x4E) + (0xB8 ^ 0x88) - -(0xBF ^ 0xAD) + (0xA1 ^ 0xBC);
        Block.lIIIIIIIllllll[148] = (0x46 ^ 0x54) + (0xC4 ^ 0x80) - (0x33 ^ 0x63) + (63 + 77 - 138 + 137);
        Block.lIIIIIIIllllll[149] = (0x5 ^ 0xB) + (8 + 104 - 98 + 121) - (0x74 ^ 0x43) + (0x54 ^ 0x60);
        Block.lIIIIIIIllllll[150] = 47 + 32 - 75 + 143;
        Block.lIIIIIIIllllll[151] = (0x69 ^ 0x78) + (123 + 100 - 202 + 121) - (0x33 ^ 0x7C) + (0x2 ^ 0x46);
        Block.lIIIIIIIllllll[152] = 105 + 20 - 56 + 80;
        Block.lIIIIIIIllllll[153] = (0x6B ^ 0x7F) + (0x1D ^ 0x67) - (0x90 ^ 0xA8) + (0x29 ^ 0x69);
        Block.lIIIIIIIllllll[154] = (0xB4 ^ 0x97) + (0xF ^ 0x6) - -(0x7B ^ 0x3D) + (0xA0 ^ 0x85);
        Block.lIIIIIIIllllll[155] = 76 + 59 - 116 + 133;
        Block.lIIIIIIIllllll[156] = 129 + 54 - 151 + 114 + (0xA7 ^ 0x81) - (0xCE ^ 0xBC) + (0x51 ^ 0x2);
        Block.lIIIIIIIllllll[157] = (0x1A ^ 0x73) + (0xDE ^ 0x8C) - (131 + 148 - 209 + 92) + (56 + 5 + 65 + 3);
        Block.lIIIIIIIllllll[158] = (0x56 ^ 0x58) + (84 + 107 - 91 + 47) - (0x2F ^ 0x12) + (0x8E ^ 0xB9);
        Block.lIIIIIIIllllll[159] = (0xE9 ^ 0x9F) + (0xEB ^ 0xA1) - (0xBF ^ 0x94) + (0x73 ^ 0x74);
        Block.lIIIIIIIllllll[160] = (0x11 ^ 0x32) + (0x4A ^ 0x2A) - (0xBF ^ 0x9F) + (0x53 ^ 0x69);
        Block.lIIIIIIIllllll[161] = (0x6C ^ 0xC) + (150 + 105 - 141 + 42) - (53 + 27 - 16 + 128) + (0x4C ^ 0x2E);
        Block.lIIIIIIIllllll[162] = 103 + 144 - 153 + 65;
        Block.lIIIIIIIllllll[163] = 2 + 34 + 69 + 55;
        Block.lIIIIIIIllllll[164] = 105 + 31 + 4 + 12 + (0xF8 ^ 0xA4) - (138 + 113 - 104 + 10) + (0xDF ^ 0x95);
        Block.lIIIIIIIllllll[165] = 28 + 100 - 42 + 76;
        Block.lIIIIIIIllllll[166] = (0xDC ^ 0x80) + (0x31 ^ 0x74) - (0x1B ^ 0x61) + (0x2B ^ 0x57);
        Block.lIIIIIIIllllll[167] = 73 + 106 - 28 + 13;
        Block.lIIIIIIIllllll[168] = 155 + 102 - 130 + 38;
        Block.lIIIIIIIllllll[169] = (0x45 ^ 0x3B) + (66 + 83 - 28 + 26) - (123 + 167 - 165 + 129) + (137 + 119 - 231 + 122);
        Block.lIIIIIIIllllll[170] = (0xB3 ^ 0xB6) + (0x2B ^ 0x26) - -(0x7 ^ 0x6D) + (0x21 ^ 0xA);
        Block.lIIIIIIIllllll[171] = (0xEF ^ 0x93) + (0x40 ^ 0x35) - (0x45 ^ 0x12) + (0x47 ^ 0x49);
        Block.lIIIIIIIllllll[172] = (0x46 ^ 0x3E) + (0x9B ^ 0x9D) - (0x11 ^ 0x8) + (0xD9 ^ 0x9D);
        Block.lIIIIIIIllllll[173] = 142 + 20 - 104 + 112;
        Block.lIIIIIIIllllll[174] = (0x19 ^ 0x42) + (144 + 79 - 216 + 155) - (203 + 20 - 125 + 149) + (114 + 4 - 110 + 157);
        Block.lIIIIIIIllllll[175] = (0x54 ^ 0x11) + (0xB9 ^ 0xB7) - -(0x96 ^ 0xC6) + (0x39 ^ 0x30);
        Block.lIIIIIIIllllll[176] = (0x81 ^ 0x8F) + "   ".length() - -(0x3B ^ 0x45) + (0x88 ^ 0x96);
        Block.lIIIIIIIllllll[177] = 82 + 29 - 103 + 166;
        Block.lIIIIIIIllllll[178] = (0x51 ^ 0x12) + (147 + 165 - 311 + 169) - (0x4E ^ 0x17) + (0x45 ^ 0x5E);
        Block.lIIIIIIIllllll[179] = 143 + 121 - 201 + 113;
        Block.lIIIIIIIllllll[180] = (0x79 ^ 0x4C) + (0xCD ^ 0x98) - (0x37 ^ 0x77) + (0xE7 ^ 0x80);
        Block.lIIIIIIIllllll[181] = 155 + 160 - 206 + 69;
        Block.lIIIIIIIllllll[182] = 16 + 54 + 5 + 63 + (101 + 54 - 42 + 21) - (0x42 ^ 0x31) + (0xBC ^ 0xAA);
        Block.lIIIIIIIllllll[183] = 119 + 11 + 3 + 47;
        Block.lIIIIIIIllllll[184] = (0x31 ^ 0x1D) + (88 + 45 - 12 + 6) - (0xBA ^ 0xB5) + (0x46 ^ 0x5F);
        Block.lIIIIIIIllllll[185] = 52 + 84 - 115 + 125 + (120 + 107 - 216 + 117) - (106 + 61 - 164 + 157) + (0xF6 ^ 0xB2);
        Block.lIIIIIIIllllll[186] = (0x56 ^ 0x48) + (0x81 ^ 0x8C) - -(0x7A ^ 0x53) + (0xA2 ^ 0xC1);
        Block.lIIIIIIIllllll[187] = 66 + 60 + 49 + 9;
        Block.lIIIIIIIllllll[188] = (0xFF ^ 0x85) + (0xA ^ 0x28) - (0x4B ^ 0x79) + (0xDD ^ 0x92);
        Block.lIIIIIIIllllll[189] = (0x64 ^ 0x55) + (61 + 76 + 27 + 6) - (0x4A ^ 0x2D) + (0x2B ^ 0x6D);
        Block.lIIIIIIIllllll[190] = (0x1 ^ 0x29) + (0xE ^ 0x6) - -(0x5F ^ 0x3D) + (0xEE ^ 0xC7);
        Block.lIIIIIIIllllll[191] = 146 + 134 - 103 + 11;
        Block.lIIIIIIIllllll[192] = (0x2C ^ 0x32) + (0xC9 ^ 0xA4) - (0xE7 ^ 0xC0) + (0x26 ^ 0x7F);
        Block.lIIIIIIIllllll[193] = 148 + 162 - 233 + 113;
        Block.lIIIIIIIllllll[194] = 69 + 120 - 20 + 22;
        Block.lIIIIIIIllllll[195] = (0xE2 ^ 0xB6) + (70 + 25 - 27 + 116) - (239 + 79 - 304 + 233) + (45 + 165 - 84 + 45);
        Block.lIIIIIIIllllll[196] = (0x18 ^ 0x3C) + (0xD ^ 0x7D) - (0x65 ^ 0x3A) + (35 + 111 - 78 + 72);
        Block.lIIIIIIIllllll[197] = " ".length() + (0x82 ^ 0xAF) - -(0x4E ^ 0x18) + (0x69 ^ 0x57);
        Block.lIIIIIIIllllll[198] = 183 + 35 - 52 + 29;
        Block.lIIIIIIIllllll[199] = (0x5B ^ 0x39) + (0xD1 ^ 0xB4) - (130 + 103 - 184 + 103) + (80 + 48 - 61 + 82);
        Block.lIIIIIIIllllll[200] = (0x18 ^ 0x27) + (0x4B ^ 0x13) - (0xA8 ^ 0x96) + (0xC5 ^ 0xA9);
        Block.lIIIIIIIllllll[201] = 108 + 13 - 63 + 140;
        Block.lIIIIIIIllllll[202] = 163 + 1 - 105 + 140;
        Block.lIIIIIIIllllll[203] = 185 + 87 - 169 + 97;
        Block.lIIIIIIIllllll[204] = 2 + 99 - 99 + 136 + (1 + 116 - 48 + 70) - (0x66 ^ 0x1C) + (0x84 ^ 0xAA);
        Block.lIIIIIIIllllll[205] = (0x8F ^ 0xB1) + (159 + 20 - 161 + 142) - (0xE6 ^ 0x86) + (0x42 ^ 0xE);
        Block.lIIIIIIIllllll[206] = (0xA2 ^ 0x8E) + (0x50 ^ 0x12) - (0x76 ^ 0x55) + (58 + 59 - 60 + 71);
        Block.lIIIIIIIllllll[207] = 188 + 50 - 166 + 132;
        Block.lIIIIIIIllllll[208] = 27 + 28 + 46 + 39 + (43 + 6 - 0 + 117) - (96 + 53 - 24 + 104) + (127 + 125 - 223 + 99);
        Block.lIIIIIIIllllll[209] = 142 + 135 - 221 + 150;
        Block.lIIIIIIIllllll[210] = (0x18 ^ 0x5C) + (0xD2 ^ 0xB4) - (14 + 9 + 39 + 89) + (66 + 109 - 167 + 180);
        Block.lIIIIIIIllllll[211] = 173 + 88 - 99 + 46;
        Block.lIIIIIIIllllll[212] = (0xDF ^ 0x9C) + (0 + 159 - 17 + 40) - (102 + 52 - 56 + 90) + (130 + 71 - 104 + 51);
        Block.lIIIIIIIllllll[213] = (0xF ^ 0x5D) + (0x47 ^ 0x16) - (0x64 ^ 0x2A) + (0xD6 ^ 0xAB);
        Block.lIIIIIIIllllll[214] = (0xB2 ^ 0xA1) + (48 + 30 + 69 + 59) - (62 + 3 - 3 + 100) + (131 + 132 - 189 + 74);
        Block.lIIIIIIIllllll[215] = 32 + 50 + 11 + 65 + (109 + 38 - 45 + 40) - (0xC3 ^ 0x9A) + " ".length();
        Block.lIIIIIIIllllll[216] = 34 + 55 + 113 + 11;
        Block.lIIIIIIIllllll[217] = 2 + 173 + 4 + 35;
        Block.lIIIIIIIllllll[218] = 149 + 68 - 12 + 10;
        Block.lIIIIIIIllllll[219] = 173 + 133 - 297 + 207;
        Block.lIIIIIIIllllll[220] = 201 + 166 - 286 + 136;
        Block.lIIIIIIIllllll[221] = 180 + 171 - 213 + 80;
        Block.lIIIIIIIllllll[222] = 26 + 70 + 3 + 120;
        Block.lIIIIIIIllllll[223] = 106 + 74 - 17 + 57;
        Block.lIIIIIIIllllll[224] = 11 + 1 + 105 + 43 + (70 + 54 - 31 + 97) - (0xFFFF8B7F & 0x75D6) + (167 + 171 - 227 + 102);
        Block.lIIIIIIIllllll[225] = 101 + 145 - 57 + 22 + (0x7D ^ 0x70) - (0x4 ^ 0x14) + (0x7C ^ 0x72);
        Block.lIIIIIIIllllll[226] = 5 + 210 - 55 + 63;
        Block.lIIIIIIIllllll[227] = (0xC5 ^ 0x9E) + (0x68 ^ 0x33) - (0x8A ^ 0xB2) + (0xDB ^ 0xB9);
        Block.lIIIIIIIllllll[228] = 122 + 142 - 232 + 193;
        Block.lIIIIIIIllllll[229] = 204 + 93 - 101 + 30;
        Block.lIIIIIIIllllll[230] = 184 + 111 - 288 + 220;
        Block.lIIIIIIIllllll[231] = 220 + 224 - 293 + 77;
        Block.lIIIIIIIllllll[232] = (0xBD ^ 0x9C) + (0x9 ^ 0x43) - -(0x9 ^ 0x3D) + (0xDA ^ 0x9C);
        Block.lIIIIIIIllllll[233] = 161 + 123 - 174 + 91 + (153 + 69 - 80 + 24) - (217 + 204 - 344 + 175) + (0x2B ^ 0x58);
        Block.lIIIIIIIllllll[234] = (0xD7 ^ 0xC3) + (0xD2 ^ 0x80) - -(0x0 ^ 0x60) + (0x3C ^ 0x1D);
        Block.lIIIIIIIllllll[235] = 58 + 152 - 120 + 142;
        Block.lIIIIIIIllllll[236] = (0x1F ^ 0x76) + (0xE4 ^ 0xB6) - -(0x89 ^ 0x95) + (0x1E ^ 0xC);
        Block.lIIIIIIIllllll[237] = 78 + 108 - 122 + 170;
        Block.lIIIIIIIllllll[238] = (0x4B ^ 0x41) + (0xC3 ^ 0x89) - -(0xC6 ^ 0x86) + (0x22 ^ 0x75);
        Block.lIIIIIIIllllll[239] = (0xD4 ^ 0x8B) + (113 + 104 - 72 + 59) - (0xFFFFC7AB & 0x3955) + (38 + 51 + 102 + 3);
        Block.lIIIIIIIllllll[240] = (0xE4 ^ 0xA3) + (178 + 103 - 96 + 0) - (0x66 ^ 0x28) + (0x4F ^ 0x74);
        Block.lIIIIIIIllllll[241] = 53 + 32 - 80 + 138 + (39 + 83 - 57 + 90) - (27 + 93 - 70 + 131) + (0xF5 ^ 0x8C);
        Block.lIIIIIIIllllll[242] = 83 + 69 + 80 + 7;
        Block.lIIIIIIIllllll[243] = 192 + 0 - 110 + 158;
        Block.lIIIIIIIllllll[244] = (0x4C ^ 0x3F) + (0x69 ^ 0x1C) - (0xD7 ^ 0x87) + (0x5D ^ 0x4);
        Block.lIIIIIIIllllll[245] = 29 + 167 - 190 + 236;
        Block.lIIIIIIIllllll[246] = (0x78 ^ 0x7C) + " ".length() - -(0x60 ^ 0x56) + (159 + 159 - 184 + 50);
        Block.lIIIIIIIllllll[247] = 218 + 1 - 64 + 89;
        Block.lIIIIIIIllllll[248] = 186 + 190 - 298 + 167;
        Block.lIIIIIIIllllll[249] = (0xDF ^ 0xA7) + (16 + 172 - 71 + 96) - (0x29 ^ 0x50) + (0x8B ^ 0xA9);
        Block.lIIIIIIIllllll[250] = (0x52 ^ 0x7E) + (0x6 ^ 0x1A) - -(0x72 ^ 0x43) + (0xEE ^ 0x90);
        Block.lIIIIIIIllllll[251] = (0x73 ^ 0x6B) + (0xD ^ 0x26) - -(4 + 85 - 59 + 126) + (0x41 ^ 0x58);
        Block.lIIIIIIIllllll[252] = 166 + 151 - 247 + 103 + (0xAA ^ 0x84) - -(0x4C ^ 0x55) + (0xB5 ^ 0xB0);
        Block.lIIIIIIIllllll[253] = 138 + 206 - 236 + 142;
        Block.lIIIIIIIllllll[254] = 87 + 110 + 17 + 37;
        Block.lIIIIIIIllllll[255] = 169 + 128 - 70 + 25;
        Block.lIIIIIIIllllll[256] = 17 + 60 + 110 + 25 + (129 + 34 - 103 + 75) - (95 + 84 - 50 + 54) + (0x1D ^ 0x44);
        Block.lIIIIIIIllllll[257] = 160 + 211 - 279 + 162;
        Block.lIIIIIIIllllll[258] = (-(0xFFFFF6B4 & 0x6DCB) & (0xFFFFE77F & 0x7DFF));
        Block.lIIIIIIIllllll[259] = (-(0xFFFFF6FD & 0x4F73) & (0xFFFFC77D & 0x7FF3));
        Block.lIIIIIIIllllll[260] = (0xFFFF8D9B & 0x7366);
        Block.lIIIIIIIllllll[261] = (-(0xFFFFFE95 & 0x7FFB) & (0xFFFFFF9B & 0x7FF7));
        Block.lIIIIIIIllllll[262] = (-(0xFFFFDAF7 & 0x3FFC) & (0xFFFFBFFF & 0x5BF7));
        Block.lIIIIIIIllllll[263] = (0xFFFF99F5 & 0x670F);
        Block.lIIIIIIIllllll[264] = (-(0xFFFF9EF1 & 0x7D1F) & (0xFFFFFF7F & 0x1D96));
        Block.lIIIIIIIllllll[265] = (-(0xFFFFDFFD & 0x729B) & (0xFFFFF3DF & 0x5FBF));
        Block.lIIIIIIIllllll[266] = (0xFFFFF14D & 0xFBA);
        Block.lIIIIIIIllllll[267] = (0xFFFFDB8D & 0x257B);
        Block.lIIIIIIIllllll[268] = (0xFFFFAF3B & 0x51CE);
        Block.lIIIIIIIllllll[269] = (-(0xFFFFA8FF & 0x7F55) & (0xFFFFFD5F & 0x2BFF));
        Block.lIIIIIIIllllll[270] = (0xFFFF8B9F & 0x756C);
        Block.lIIIIIIIllllll[271] = (-(0xFFFFD7A3 & 0x6CFD) & (0xFFFFF7AD & 0x4DFF));
        Block.lIIIIIIIllllll[272] = (0xFFFF9D2F & 0x63DE);
        Block.lIIIIIIIllllll[273] = (-(0xFFFFFED1 & 0x6BFF) & (0xFFFFEBFF & 0x7FDF));
        Block.lIIIIIIIllllll[274] = (-(0xFFFFFFF9 & 0xAEF) & (0xFFFF9BFC & 0x6FFB));
        Block.lIIIIIIIllllll[275] = (0xFFFFD1B1 & 0x2F5F);
        Block.lIIIIIIIllllll[276] = (-(0xFFFFBFFA & 0x7EEF) & (0xFFFFBFFF & 0x7FFB));
        Block.lIIIIIIIllllll[277] = (0xFFFFB9DB & 0x4737);
        Block.lIIIIIIIllllll[278] = (0xFFFFF97F & 0x794);
        Block.lIIIIIIIllllll[279] = (-(0xFFFFEEE9 & 0x37D7) & (0xFFFFAFFF & 0x77D5));
        Block.lIIIIIIIllllll[280] = (0xFFFFF997 & 0x77E);
        Block.lIIIIIIIllllll[281] = (-(0xFFFFFFF9 & 0x6AAF) & (0xFFFFEBFF & 0x7FBF));
        Block.lIIIIIIIllllll[282] = (0xFFFF8B7C & 0x759B);
        Block.lIIIIIIIllllll[283] = (0xFFFFCDDB & 0x333D);
        Block.lIIIIIIIllllll[284] = (-(0xFFFFD263 & 0x2FBE) & (0xFFFFDFBF & 0x237B));
        Block.lIIIIIIIllllll[285] = (-(0xFFFFA657 & 0x7DED) & (0xFFFFA7DF & 0x7D7F));
        Block.lIIIIIIIllllll[286] = (-(0xFFFFBEEF & 0x4FF2) & (0xFFFFFFFD & 0xFFF));
        Block.lIIIIIIIllllll[287] = (-(0xFFFFFAF7 & 0x4F6B) & (0xFFFFEFFF & 0x5B7F));
        Block.lIIIIIIIllllll[288] = (0xFFFF9DFE & 0x631F);
        Block.lIIIIIIIllllll[289] = (-(0xFFFFD741 & 0x7EBF) & (0xFFFFFFBF & 0x575F));
        Block.lIIIIIIIllllll[290] = (-(0xFFFF94E7 & 0x7FDF) & (0xFFFFF7EE & 0x1DF7));
        Block.lIIIIIIIllllll[291] = (-(0xFFFFAEDD & 0x77EF) & (0xFFFFA7FF & 0x7FED));
        Block.lIIIIIIIllllll[292] = (0xFFFF877B & 0x79A6);
        Block.lIIIIIIIllllll[293] = (0xFFFFA37F & 0x5DA3);
        Block.lIIIIIIIllllll[294] = (0xFFFFBBA5 & 0x457E);
        Block.lIIIIIIIllllll[295] = (0xFFFFE175 & 0x1FAF);
        Block.lIIIIIIIllllll[296] = (0xFFFFC7B6 & 0x396F);
        Block.lIIIIIIIllllll[297] = (0xFFFFF32F & 0xDF7);
        Block.lIIIIIIIllllll[298] = (-(0xFFFFCDDF & 0x72F8) & (0xFFFFF9FF & 0x47FF));
        Block.lIIIIIIIllllll[299] = (-(0xFFFFFEC7 & 0x29FF) & (0xFFFFB9FF & 0x6FEF));
        Block.lIIIIIIIllllll[300] = (0xFFFFB37E & 0x4DAB);
        Block.lIIIIIIIllllll[301] = (-(0xFFFFEECB & 0x3935) & (0xFFFFEBEF & 0x3D3B));
        Block.lIIIIIIIllllll[302] = (0xFFFF81FE & 0x7F2D);
        Block.lIIIIIIIllllll[303] = (-(0xFFFF9F73 & 0x729D) & (0xFFFFF37D & 0x1FBF));
        Block.lIIIIIIIllllll[304] = (0xFFFFED2F & 0x13FE);
        Block.lIIIIIIIllllll[305] = (-(0xFFFFFEF5 & 0x57CB) & (0xFFFFDFFF & 0x77EF));
        Block.lIIIIIIIllllll[306] = (-(0xFFFFFE9B & 0x7BE5) & (0xFFFFFBB3 & 0x7FFC));
        Block.lIIIIIIIllllll[307] = (-(0xFFFFFE4F & 0x7DB7) & (0xFFFFFDB7 & 0x7F7F));
        Block.lIIIIIIIllllll[308] = (-(0xFFFFF60E & 0x2BF7) & (0xFFFFBF37 & 0x63FF));
        Block.lIIIIIIIllllll[309] = (0xFFFFE3F3 & 0x1D3F);
        Block.lIIIIIIIllllll[310] = (0xFFFFEF3C & 0x11F7);
        Block.lIIIIIIIllllll[311] = (0xFFFFF13F & 0xFF5);
        Block.lIIIIIIIllllll[312] = (-(0xFFFFE7EF & 0x3CDA) & (0xFFFFB7FF & 0x6DFF));
        Block.lIIIIIIIllllll[313] = (-(0xFFFFBDD1 & 0x7E6F) & (0xFFFFBD77 & 0x7FFF));
        Block.lIIIIIIIllllll[314] = (0xFFFF937F & 0x6DB8);
        Block.lIIIIIIIllllll[315] = (0xFFFFC7FF & 0x3939);
        Block.lIIIIIIIllllll[316] = (-(0xFFFFBFE5 & 0x4CDF) & (0xFFFFDDFE & 0x2FFF));
        Block.lIIIIIIIllllll[317] = (0xFFFFD13F & 0x2FFB);
        Block.lIIIIIIIllllll[318] = (0xFFFFFB7F & 0x5BC);
        Block.lIIIIIIIllllll[319] = (-(0xFFFFF6FB & 0x3DC7) & (0xFFFFB7FF & 0x7DFF));
        Block.lIIIIIIIllllll[320] = (-(0xFFFF943F & 0x6FC1) & (0xFFFFCF3E & 0x35FF));
        Block.lIIIIIIIllllll[321] = (-(0xFFFFDE0F & 0x7DF1) & (0xFFFFDF3F & 0x7DFF));
        Block.lIIIIIIIllllll[322] = (-(0xFFFFF09F & 0x6FF5) & (0xFFFFE5FF & 0x7BD4));
        Block.lIIIIIIIllllll[323] = (-(0xFFFFFC2F & 0x77D5) & (0xFFFFF5D5 & 0x7F6F));
        Block.lIIIIIIIllllll[324] = (-(0xFFFFD9C5 & 0x3EBF) & (0xFFFFFDDE & 0x1BE7));
        Block.lIIIIIIIllllll[325] = (0xFFFF9FF7 & 0x614B);
        Block.lIIIIIIIllllll[326] = (-(0xFFFFDEBB & 0x7947) & (0xFFFFDD4F & 0x7BF6));
        Block.lIIIIIIIllllll[327] = (-(0xFFFFEFAB & 0x7CF5) & (0xFFFFFFED & 0x6DF7));
        Block.lIIIIIIIllllll[328] = (0xFFFFAFF7 & 0x514E);
        Block.lIIIIIIIllllll[329] = (0xFFFFE7F7 & 0x194F);
        Block.lIIIIIIIllllll[330] = (-(0xFFFFD6BF & 0x2DE6) & (0xFFFFDFEF & 0x25FD));
        Block.lIIIIIIIllllll[331] = (-(0xFFFFFBA7 & 0x5EFF) & (0xFFFFFBFF & 0x5FEF));
        Block.lIIIIIIIllllll[332] = (-(0xFFFFEF67 & 0x369D) & (0xFFFFA7EF & 0x7F5E));
        Block.lIIIIIIIllllll[333] = (-(0xFFFFFBE5 & 0x3E3B) & (0xFFFFFBEB & 0x3F7F));
        Block.lIIIIIIIllllll[334] = (0xFFFF8BCD & 0x757E);
        Block.lIIIIIIIllllll[335] = (-(0xFFFFC437 & 0x7FFB) & (0xFFFFCFFF & 0x757F));
        Block.lIIIIIIIllllll[336] = (-(0xFFFFEFFF & 0x3A92) & (0xFFFFBFFF & 0x6BDF));
        Block.lIIIIIIIllllll[337] = (0xFFFFAFDF & 0x516F);
        Block.lIIIIIIIllllll[338] = (-(0xFFFFCFB8 & 0x7E4F) & (0xFFFFCFD7 & 0x7F7F));
        Block.lIIIIIIIllllll[339] = (-(0xFFFFBEA5 & 0x6BFB) & (0xFFFFEFF7 & 0x3BF9));
        Block.lIIIIIIIllllll[340] = (-(0xFFFF997F & 0x76A2) & (0xFFFFBD77 & 0x53FB));
        Block.lIIIIIIIllllll[341] = (-(0x78 ^ 0x59) & (0xFFFF9573 & 0x6BFF));
        Block.lIIIIIIIllllll[342] = (0xFFFFE1FE & 0x1F55);
        Block.lIIIIIIIllllll[343] = (-(0xFFFFFA33 & 0x77CF) & (0xFFFFF757 & 0x7BFF));
        Block.lIIIIIIIllllll[344] = (-(0xFFFFBF3F & 0x5AE9) & (0xFFFFBB7E & 0x5FFF));
        Block.lIIIIIIIllllll[345] = (0xFFFF8D57 & 0x73FF);
        Block.lIIIIIIIllllll[346] = (-(0xFFFFF0EF & 0x3F37) & (0xFFFFB9FF & 0x777E));
        Block.lIIIIIIIllllll[347] = (0xFFFF875F & 0x79F9);
        Block.lIIIIIIIllllll[348] = (0xFFFFD17E & 0x2FDB);
        Block.lIIIIIIIllllll[349] = (0xFFFF93FF & 0x6D5B);
        Block.lIIIIIIIllllll[350] = (-(0xFFFFBEDF & 0x6DA3) & (0xFFFFADFE & 0x7FDF));
        Block.lIIIIIIIllllll[351] = (-(0xFFFFEEF5 & 0x55AB) & (0xFFFFCFFD & 0x75FF));
        Block.lIIIIIIIllllll[352] = (0xFFFF975F & 0x69FE);
        Block.lIIIIIIIllllll[353] = (0xFFFFF95F & 0x7FF);
        Block.lIIIIIIIllllll[354] = (0xFFFF9779 & 0x69E6);
        Block.lIIIIIIIllllll[355] = (0xFFFFADF7 & 0x5369);
        Block.lIIIIIIIllllll[356] = (0xFFFFCFF6 & 0x316B);
        Block.lIIIIIIIllllll[357] = (-(0xFFFF9C5D & 0x7FB7) & (0xFFFF9D77 & 0x7FFF));
        Block.lIIIIIIIllllll[358] = (-(0xFFFFDAFF & 0x7589) & (0xFFFFFFFC & 0x51EF));
        Block.lIIIIIIIllllll[359] = (0xFFFFF96F & 0x7F5);
        Block.lIIIIIIIllllll[360] = (-(0xFFFFBA96 & 0x7D6B) & (0xFFFFBDEF & 0x7B77));
        Block.lIIIIIIIllllll[361] = (0xFFFFDF7F & 0x21E7);
        Block.lIIIIIIIllllll[362] = (-(0xFFFF9F37 & 0x6EDF) & (0xFFFF8F7F & 0x7FFE));
        Block.lIIIIIIIllllll[363] = (-(0xFFFFECF1 & 0x779F) & (0xFFFFEDFB & 0x77FD));
        Block.lIIIIIIIllllll[364] = (0xFFFF89EE & 0x777B);
        Block.lIIIIIIIllllll[365] = (0xFFFFFD7F & 0x3EB);
        Block.lIIIIIIIllllll[366] = (0xFFFF83FE & 0x7D6D);
        Block.lIIIIIIIllllll[367] = (0xFFFFE57D & 0x1BEF);
        Block.lIIIIIIIllllll[368] = (-(0xFFFFEED7 & 0x7DBA) & (-1 & 0x6DFF));
        Block.lIIIIIIIllllll[369] = (-(0xFFFFFEDD & 0x7DB3) & (0xFFFFFDFF & 0x7FFF));
        Block.lIIIIIIIllllll[370] = (-(0xFFFFB9B9 & 0x7E56) & (0xFFFFFF7F & 0x39FF));
        Block.lIIIIIIIllllll[371] = (0xFFFFFF77 & 0x1F9);
        Block.lIIIIIIIllllll[372] = (-(0xFFFFD4CB & 0x7B3E) & (0xFFFFD17B & 0x7FFF));
        Block.lIIIIIIIllllll[373] = (0xFFFF8773 & 0x79FF);
        Block.lIIIIIIIllllll[374] = (0xFFFF9D75 & 0x63FE);
        Block.lIIIIIIIllllll[375] = (-(0xFFFFFEEF & 0x6F9B) & (0xFFFFEFFF & 0x7FFF));
        Block.lIIIIIIIllllll[376] = (-(0xFFFFE587 & 0x5EF9) & (0xFFFFDDFF & 0x67F6));
        Block.lIIIIIIIllllll[377] = (-(0xFFFFFF73 & 0x5C8D) & (0xFFFFFDFF & 0x5F77));
        Block.lIIIIIIIllllll[378] = (-(0xFFFF97EE & 0x7C93) & (0xFFFFD7FD & 0x3DFB));
        Block.lIIIIIIIllllll[379] = (0xFFFFD57D & 0x2BFB);
        Block.lIIIIIIIllllll[380] = (0xFFFFB3FE & 0x4D7B);
        Block.lIIIIIIIllllll[381] = (0xFFFFE5FF & 0x1B7B);
        Block.lIIIIIIIllllll[382] = (-(0xFFFFE859 & 0x5FA7) & (0xFFFFCDFD & 0x7B7E));
        Block.lIIIIIIIllllll[383] = (0xFFFFF77D & 0x9FF);
        Block.lIIIIIIIllllll[384] = (-(0xFFFFFAE2 & 0x279F) & (0xFFFFEFFF & 0x33FF));
        Block.lIIIIIIIllllll[385] = (0xFFFFF7FF & 0x97F);
        Block.lIIIIIIIllllll[386] = (-(0xFFFF9B1D & 0x6CF6) & (0xFFFFDBBB & 0x2DD7));
        Block.lIIIIIIIllllll[387] = (0xFFFFC7A1 & 0x39DF);
        Block.lIIIIIIIllllll[388] = (-(0xFFFFFED5 & 0x3B7F) & (0xFFFFBBDF & 0x7FF6));
        Block.lIIIIIIIllllll[389] = (0xFFFFDBD7 & 0x25AB);
        Block.lIIIIIIIllllll[390] = (0xFFFF99B6 & 0x67CD);
        Block.lIIIIIIIllllll[391] = (-(0xFFFFFBF7 & 0x3E6B) & (-1 & 0x3BE7));
        Block.lIIIIIIIllllll[392] = (-(0xFFFFFEB9 & 0x6F77) & (0xFFFFFFBE & 0x6FF7));
        Block.lIIIIIIIllllll[393] = (-(0xFFFFBF75 & 0x7CBB) & (0xFFFFFFB7 & 0x3DFF));
        Block.lIIIIIIIllllll[394] = (0xFFFFFDAE & 0x3D9);
        Block.lIIIIIIIllllll[395] = (-(0xFFFFCE6F & 0x33F1) & (0xFFFFDFEB & 0x23FD));
        Block.lIIIIIIIllllll[396] = (-(0xFFFFF757 & 0x58E9) & (0xFFFFFBEF & 0x55DA));
        Block.lIIIIIIIllllll[397] = (-(0xFFFFE4F3 & 0x7F4D) & (0xFFFFF5FB & 0x6FCF));
        Block.lIIIIIIIllllll[398] = (0xFFFFD5FF & 0x2B8C);
        Block.lIIIIIIIllllll[399] = (-(0xFFFFDAE9 & 0x6F37) & (0xFFFFEBEF & 0x5FBD));
        Block.lIIIIIIIllllll[400] = (-(0xFFFFDD3B & 0x3EE6) & (0xFFFFFDEF & 0x1FBF));
        Block.lIIIIIIIllllll[401] = (-(0xFFFFCFF5 & 0x767B) & (0xFFFFDFFF & 0x67FF));
        Block.lIIIIIIIllllll[402] = (0xFFFFC7DA & 0x39B5);
        Block.lIIIIIIIllllll[403] = (-(0xFFFFF76B & 0x6CF7) & (0xFFFFFFFB & 0x65F7));
        Block.lIIIIIIIllllll[404] = (0xFFFFCBFB & 0x3596);
        Block.lIIIIIIIllllll[405] = (0xFFFFD19F & 0x2FF3);
        Block.lIIIIIIIllllll[406] = (0xFFFFF5FC & 0xB97);
        Block.lIIIIIIIllllll[407] = (-(0xFFFFD791 & 0x6A6F) & (0xFFFFF7DF & 0x4BB5));
        Block.lIIIIIIIllllll[408] = (0xFFFFBDB7 & 0x43DE);
        Block.lIIIIIIIllllll[409] = (0xFFFFABB7 & 0x55DF);
        Block.lIIIIIIIllllll[410] = (0xFFFFEFFB & 0x119C);
        Block.lIIIIIIIllllll[411] = (0xFFFFF59B & 0xBFD);
        Block.lIIIIIIIllllll[412] = (-(0xFFFFBDBE & 0x7E67) & (0xFFFFFFBF & 0x3DFF));
        Block.lIIIIIIIllllll[413] = (-(0xFFFFF9C5 & 0xE3F) & (0xFFFFBDBF & 0x4BDF));
    }
    
    public boolean isBlockNormalCube() {
        if (lIllIIlllIlIlII(this.blockMaterial.blocksMovement() ? 1 : 0) && lIllIIlllIlIlII(this.isFullCube() ? 1 : 0)) {
            return Block.lIIIIIIIllllll[1] != 0;
        }
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[22]]).append(Block.blockRegistry.getNameForObject(this)).append(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[23]]));
    }
    
    protected boolean canSilkHarvest() {
        if (lIllIIlllIlIlII(this.isFullCube() ? 1 : 0) && lIllIIlllIlIllI(this.isBlockContainer ? 1 : 0)) {
            return Block.lIIIIIIIllllll[1] != 0;
        }
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    public int getMixedBrightnessForBlock(final IBlockAccess lllllllllllllIlIlIIIlIlIllIIlllI, BlockPos lllllllllllllIlIlIIIlIlIllIIllIl) {
        Block lllllllllllllIlIlIIIlIlIllIlIIII = lllllllllllllIlIlIIIlIlIllIIlllI.getBlockState(lllllllllllllIlIlIIIlIlIllIIllIl).getBlock();
        final int lllllllllllllIlIlIIIlIlIllIIllll = lllllllllllllIlIlIIIlIlIllIIlllI.getCombinedLight(lllllllllllllIlIlIIIlIlIllIIllIl, lllllllllllllIlIlIIIlIlIllIlIIII.getLightValue());
        if (lIllIIlllIlIllI(lllllllllllllIlIlIIIlIlIllIIllll) && lIllIIlllIlIlII((lllllllllllllIlIlIIIlIlIllIlIIII instanceof BlockSlab) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIlIllIIllIl = lllllllllllllIlIlIIIlIlIllIIllIl.down();
            lllllllllllllIlIlIIIlIlIllIlIIII = lllllllllllllIlIlIIIlIlIllIIlllI.getBlockState(lllllllllllllIlIlIIIlIlIllIIllIl).getBlock();
            return lllllllllllllIlIlIIIlIlIllIIlllI.getCombinedLight(lllllllllllllIlIlIIIlIlIllIIllIl, lllllllllllllIlIlIIIlIlIllIlIIII.getLightValue());
        }
        return lllllllllllllIlIlIIIlIlIllIIllll;
    }
    
    public Block(final Material lllllllllllllIlIlIIIlIllIIlllIIl, final MapColor lllllllllllllIlIlIIIlIllIIlllIII) {
        this.enableStats = (Block.lIIIIIIIllllll[1] != 0);
        this.stepSound = Block.soundTypeStone;
        this.blockParticleGravity = 1.0f;
        this.slipperiness = 0.6f;
        this.blockMaterial = lllllllllllllIlIlIIIlIllIIlllIIl;
        this.field_181083_K = lllllllllllllIlIlIIIlIllIIlllIII;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.fullBlock = this.isOpaqueCube();
        int lightOpacity;
        if (lIllIIlllIlIlII(this.isOpaqueCube() ? 1 : 0)) {
            lightOpacity = Block.lIIIIIIIllllll[17];
            "".length();
            if ((0x3E ^ 0x3A) <= 0) {
                throw null;
            }
        }
        else {
            lightOpacity = Block.lIIIIIIIllllll[0];
        }
        this.lightOpacity = lightOpacity;
        int translucent;
        if (lIllIIlllIlIlII(lllllllllllllIlIlIIIlIllIIlllIIl.blocksLight() ? 1 : 0)) {
            translucent = Block.lIIIIIIIllllll[0];
            "".length();
            if (((0xCA ^ 0x87) & ~(0xF5 ^ 0xB8)) == "  ".length()) {
                throw null;
            }
        }
        else {
            translucent = Block.lIIIIIIIllllll[1];
        }
        this.translucent = (translucent != 0);
        this.blockState = this.createBlockState();
        this.setDefaultState(this.blockState.getBaseState());
    }
    
    public void randomTick(final World lllllllllllllIlIlIIIlIlIlIIIIlII, final BlockPos lllllllllllllIlIlIIIlIlIIllllllI, final IBlockState lllllllllllllIlIlIIIlIlIIlllllIl, final Random lllllllllllllIlIlIIIlIlIIlllllII) {
        this.updateTick(lllllllllllllIlIlIIIlIlIlIIIIlII, lllllllllllllIlIlIIIlIlIIllllllI, lllllllllllllIlIlIIIlIlIIlllllIl, lllllllllllllIlIlIIIlIlIIlllllII);
    }
    
    private static int lIllIIlllIllIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean isFlowerPot() {
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    public Block setCreativeTab(final CreativeTabs lllllllllllllIlIlIIIlIIIllIIIIII) {
        this.displayOnCreativeTab = lllllllllllllIlIlIIIlIIIllIIIIII;
        return this;
    }
    
    public boolean func_181623_g() {
        if (lIllIIlllIlIllI(this.blockMaterial.isSolid() ? 1 : 0) && lIllIIlllIlIllI(this.blockMaterial.isLiquid() ? 1 : 0)) {
            return Block.lIIIIIIIllllll[1] != 0;
        }
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    private static String lIllIIllIlIllIl(final String lllllllllllllIlIlIIIlIIIIIIlIlIl, final String lllllllllllllIlIlIIIlIIIIIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIlIIIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIlIIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), Block.lIIIIIIIllllll[8]), "DES");
            final Cipher lllllllllllllIlIlIIIlIIIIIIllIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIlIIIIIIllIIl.init(Block.lIIIIIIIllllll[2], lllllllllllllIlIlIIIlIIIIIIllIlI);
            return new String(lllllllllllllIlIlIIIlIIIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIlIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIlIIIIIIllIII) {
            lllllllllllllIlIlIIIlIIIIIIllIII.printStackTrace();
            return null;
        }
    }
    
    public void dropBlockAsItemWithChance(final World lllllllllllllIlIlIIIlIlIIIlIIlIl, final BlockPos lllllllllllllIlIlIIIlIlIIIlIllIl, final IBlockState lllllllllllllIlIlIIIlIlIIIlIllII, final float lllllllllllllIlIlIIIlIlIIIlIlIll, final int lllllllllllllIlIlIIIlIlIIIlIlIlI) {
        if (lIllIIlllIlIllI(lllllllllllllIlIlIIIlIlIIIlIIlIl.isRemote ? 1 : 0)) {
            final int lllllllllllllIlIlIIIlIlIIIlIlIIl = this.quantityDroppedWithBonus(lllllllllllllIlIlIIIlIlIIIlIlIlI, lllllllllllllIlIlIIIlIlIIIlIIlIl.rand);
            int lllllllllllllIlIlIIIlIlIIIlIlIII = Block.lIIIIIIIllllll[0];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!lIllIIllllIIIII(lllllllllllllIlIlIIIlIlIIIlIlIII, lllllllllllllIlIlIIIlIlIIIlIlIIl)) {
                if (lIllIIlllIlllll(lIllIIlllIllllI(lllllllllllllIlIlIIIlIlIIIlIIlIl.rand.nextFloat(), lllllllllllllIlIlIIIlIlIIIlIlIll))) {
                    final Item lllllllllllllIlIlIIIlIlIIIlIIlll = this.getItemDropped(lllllllllllllIlIlIIIlIlIIIlIllII, lllllllllllllIlIlIIIlIlIIIlIIlIl.rand, lllllllllllllIlIlIIIlIlIIIlIlIlI);
                    if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIlIIIlIIlll)) {
                        spawnAsEntity(lllllllllllllIlIlIIIlIlIIIlIIlIl, lllllllllllllIlIlIIIlIlIIIlIllIl, new ItemStack(lllllllllllllIlIlIIIlIlIIIlIIlll, Block.lIIIIIIIllllll[1], this.damageDropped(lllllllllllllIlIlIIIlIlIIIlIllII)));
                    }
                }
                ++lllllllllllllIlIlIIIlIlIIIlIlIII;
            }
        }
    }
    
    public IBlockState onBlockPlaced(final World lllllllllllllIlIlIIIlIIllIIIIllI, final BlockPos lllllllllllllIlIlIIIlIIllIIIIlIl, final EnumFacing lllllllllllllIlIlIIIlIIllIIIIlII, final float lllllllllllllIlIlIIIlIIllIIIIIll, final float lllllllllllllIlIlIIIlIIllIIIIIlI, final float lllllllllllllIlIlIIIlIIllIIIIIIl, final int lllllllllllllIlIlIIIlIIlIlllllIl, final EntityLivingBase lllllllllllllIlIlIIIlIIlIlllllll) {
        return this.getStateFromMeta(lllllllllllllIlIlIIIlIIlIlllllIl);
    }
    
    public IBlockState getActualState(final IBlockState lllllllllllllIlIlIIIlIllIlIIIIIl, final IBlockAccess lllllllllllllIlIlIIIlIllIlIIIIll, final BlockPos lllllllllllllIlIlIIIlIllIlIIIIlI) {
        return lllllllllllllIlIlIIIlIllIlIIIIIl;
    }
    
    public boolean isFullCube() {
        return Block.lIIIIIIIllllll[1] != 0;
    }
    
    public int getRenderColor(final IBlockState lllllllllllllIlIlIIIlIIlIlIllIlI) {
        return Block.lIIIIIIIllllll[19];
    }
    
    public final double getBlockBoundsMinZ() {
        return this.minZ;
    }
    
    public boolean isAssociatedBlock(final Block lllllllllllllIlIlIIIlIIIlIlIlllI) {
        if (lIllIIlllIllIll(this, lllllllllllllIlIlIIIlIIIlIlIlllI)) {
            return Block.lIIIIIIIllllll[1] != 0;
        }
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    public static int getStateId(final IBlockState lllllllllllllIlIlIIIlIllIllllllI) {
        final Block lllllllllllllIlIlIIIlIllIlllllll = lllllllllllllIlIlIIIlIllIllllllI.getBlock();
        return getIdFromBlock(lllllllllllllIlIlIIIlIllIlllllll) + (lllllllllllllIlIlIIIlIllIlllllll.getMetaFromState(lllllllllllllIlIlIIIlIllIllllllI) << Block.lIIIIIIIllllll[12]);
    }
    
    private static boolean lIllIIlllIllIII(final int lllllllllllllIlIlIIIIllllllIIIlI) {
        return lllllllllllllIlIlIIIIllllllIIIlI < 0;
    }
    
    protected Block setLightLevel(final float lllllllllllllIlIlIIIlIllIIlIIIlI) {
        this.lightValue = (int)(15.0f * lllllllllllllIlIlIIIlIllIIlIIIlI);
        return this;
    }
    
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[Block.lIIIIIIIllllll[0]]);
    }
    
    public static Block getBlockFromItem(final Item lllllllllllllIlIlIIIlIllIllIlllI) {
        Block block;
        if (lIllIIlllIlIlII((lllllllllllllIlIlIIIlIllIllIlllI instanceof ItemBlock) ? 1 : 0)) {
            block = ((ItemBlock)lllllllllllllIlIlIIIlIllIllIlllI).getBlock();
            "".length();
            if (" ".length() >= (0x85 ^ 0x81)) {
                return null;
            }
        }
        else {
            block = null;
        }
        return block;
    }
    
    public MapColor getMapColor(final IBlockState lllllllllllllIlIlIIIlIllIlIlIIII) {
        return this.field_181083_K;
    }
    
    public AxisAlignedBB getSelectedBoundingBox(final World lllllllllllllIlIlIIIlIlIlIllIIll, final BlockPos lllllllllllllIlIlIIIlIlIlIllIIII) {
        return new AxisAlignedBB(lllllllllllllIlIlIIIlIlIlIllIIII.getX() + this.minX, lllllllllllllIlIlIIIlIlIlIllIIII.getY() + this.minY, lllllllllllllIlIlIIIlIlIlIllIIII.getZ() + this.minZ, lllllllllllllIlIlIIIlIlIlIllIIII.getX() + this.maxX, lllllllllllllIlIlIIIlIlIlIllIIII.getY() + this.maxY, lllllllllllllIlIlIIIlIlIlIllIIII.getZ() + this.maxZ);
    }
    
    public int damageDropped(final IBlockState lllllllllllllIlIlIIIlIIlllllIlll) {
        return Block.lIIIIIIIllllll[0];
    }
    
    public static IBlockState getStateById(final int lllllllllllllIlIlIIIlIllIlllIIll) {
        final int lllllllllllllIlIlIIIlIllIlllIlIl = lllllllllllllIlIlIIIlIllIlllIIll & Block.lIIIIIIIllllll[14];
        final int lllllllllllllIlIlIIIlIllIlllIlII = lllllllllllllIlIlIIIlIllIlllIIll >> Block.lIIIIIIIllllll[12] & Block.lIIIIIIIllllll[15];
        return getBlockById(lllllllllllllIlIlIIIlIllIlllIlIl).getStateFromMeta(lllllllllllllIlIlIIIlIllIlllIlII);
    }
    
    public static int getIdFromBlock(final Block lllllllllllllIlIlIIIlIlllIIIIIll) {
        return Block.blockRegistry.getIDForObject(lllllllllllllIlIlIIIlIlllIIIIIll);
    }
    
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIlIIIlIIllIIIllII, final BlockPos lllllllllllllIlIlIIIlIIllIIIlIll, final Entity lllllllllllllIlIlIIIlIIllIIIlIlI) {
    }
    
    public EnumOffsetType getOffsetType() {
        return EnumOffsetType.NONE;
    }
    
    public int getDamageValue(final World lllllllllllllIlIlIIIlIIIllIlIIll, final BlockPos lllllllllllllIlIlIIIlIIIllIIllll) {
        return this.damageDropped(lllllllllllllIlIlIIIlIIIllIlIIll.getBlockState(lllllllllllllIlIlIIIlIIIllIIllll));
    }
    
    public int getMobilityFlag() {
        return this.blockMaterial.getMaterialMobility();
    }
    
    public boolean getTickRandomly() {
        return this.needsRandomTick;
    }
    
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlIIIlIllIlIIllII) {
        return this.getDefaultState();
    }
    
    private boolean isVecInsideXZBounds(final Vec3 lllllllllllllIlIlIIIlIIlllIIIIII) {
        int n;
        if (lIllIIllllIIIlI(lllllllllllllIlIlIIIlIIlllIIIIII)) {
            n = Block.lIIIIIIIllllll[0];
            "".length();
            if (-" ".length() > 0) {
                return ((0x55 ^ 0x66) & ~(0x43 ^ 0x70) & ~((0x7C ^ 0x47) & ~(0x15 ^ 0x2E))) != 0x0;
            }
        }
        else if (lIllIIllllIIlIl(lIllIIllllIIllI(lllllllllllllIlIlIIIlIIlllIIIIII.xCoord, this.minX)) && lIllIIlllIlllll(lIllIIllllIIlll(lllllllllllllIlIlIIIlIIlllIIIIII.xCoord, this.maxX)) && lIllIIllllIIlIl(lIllIIllllIIllI(lllllllllllllIlIlIIIlIIlllIIIIII.zCoord, this.minZ)) && lIllIIlllIlllll(lIllIIllllIIlll(lllllllllllllIlIlIIIlIIlllIIIIII.zCoord, this.maxZ))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x54 ^ 0x46) & ~(0x89 ^ 0x9B)) != 0x0;
            }
        }
        else {
            n = Block.lIIIIIIIllllll[0];
        }
        return n != 0;
    }
    
    public float getExplosionResistance(final Entity lllllllllllllIlIlIIIlIIlllllIlII) {
        return this.blockResistance / 5.0f;
    }
    
    protected final void setDefaultState(final IBlockState lllllllllllllIlIlIIIlIIIlIIlIIlI) {
        this.defaultBlockState = lllllllllllllIlIlIIIlIIIlIIlIIlI;
    }
    
    protected Block(final Material lllllllllllllIlIlIIIlIllIIllIlII) {
        this(lllllllllllllIlIlIIIlIllIIllIlII, lllllllllllllIlIlIIIlIllIIllIlII.getMaterialMapColor());
    }
    
    public boolean hasTileEntity() {
        return this.isBlockContainer;
    }
    
    public void breakBlock(final World lllllllllllllIlIlIIIlIlIIllIIIIl, final BlockPos lllllllllllllIlIlIIIlIlIIllIIIII, final IBlockState lllllllllllllIlIlIIIlIlIIlIlllll) {
    }
    
    public int getMetaFromState(final IBlockState lllllllllllllIlIlIIIlIllIlIIlIII) {
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIllIlIIlIII) && lIllIIlllIlIllI(lllllllllllllIlIlIIIlIllIlIIlIII.getPropertyNames().isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[16]]).append(lllllllllllllIlIlIIIlIllIlIIlIII).append(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[15]])));
        }
        return Block.lIIIIIIIllllll[0];
    }
    
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.SOLID;
    }
    
    public int quantityDropped(final Random lllllllllllllIlIlIIIlIlIIlIlllIl) {
        return Block.lIIIIIIIllllll[1];
    }
    
    private static int lIllIIllllIIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void onFallenUpon(final World lllllllllllllIlIlIIIlIIIlllIIlll, final BlockPos lllllllllllllIlIlIIIlIIIlllIIllI, final Entity lllllllllllllIlIlIIIlIIIlllIIIll, final float lllllllllllllIlIlIIIlIIIlllIIIlI) {
        lllllllllllllIlIlIIIlIIIlllIIIll.fall(lllllllllllllIlIlIIIlIIIlllIIIlI, 1.0f);
    }
    
    public void fillWithRain(final World lllllllllllllIlIlIIIlIIIlIllIlll, final BlockPos lllllllllllllIlIlIIIlIIIlIllIllI) {
    }
    
    public boolean isBlockSolid(final IBlockAccess lllllllllllllIlIlIIIlIlIlIlllIll, final BlockPos lllllllllllllIlIlIIIlIlIlIlllIlI, final EnumFacing lllllllllllllIlIlIIIlIlIlIlllIIl) {
        return lllllllllllllIlIlIIIlIlIlIlllIll.getBlockState(lllllllllllllIlIlIIIlIlIlIlllIlI).getBlock().getMaterial().isSolid();
    }
    
    public boolean isVisuallyOpaque() {
        if (lIllIIlllIlIlII(this.blockMaterial.blocksMovement() ? 1 : 0) && lIllIIlllIlIlII(this.isFullCube() ? 1 : 0)) {
            return Block.lIIIIIIIllllll[1] != 0;
        }
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    private boolean isVecInsideYZBounds(final Vec3 lllllllllllllIlIlIIIlIIlllIIIllI) {
        int n;
        if (lIllIIllllIIIlI(lllllllllllllIlIlIIIlIIlllIIIllI)) {
            n = Block.lIIIIIIIllllll[0];
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0xE6 ^ 0x80 ^ (0xE5 ^ 0x8E)) & ("  ".length() ^ (0x37 ^ 0x38) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIIllllIIlIl(lIllIIllllIIIll(lllllllllllllIlIlIIIlIIlllIIIllI.yCoord, this.minY)) && lIllIIlllIlllll(lIllIIllllIIlII(lllllllllllllIlIlIIIlIIlllIIIllI.yCoord, this.maxY)) && lIllIIllllIIlIl(lIllIIllllIIIll(lllllllllllllIlIlIIIlIIlllIIIllI.zCoord, this.minZ)) && lIllIIlllIlllll(lIllIIllllIIlII(lllllllllllllIlIlIIIlIIlllIIIllI.zCoord, this.maxZ))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if ("  ".length() < "  ".length()) {
                return ((0x0 ^ 0x3C ^ (0x19 ^ 0x47)) & (0x69 ^ 0x1A ^ (0xBB ^ 0xAA) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Block.lIIIIIIIllllll[0];
        }
        return n != 0;
    }
    
    public int colorMultiplier(final IBlockAccess lllllllllllllIlIlIIIlIIlIlIllIII, final BlockPos lllllllllllllIlIlIIIlIIlIlIlIlll, final int lllllllllllllIlIlIIIlIIlIlIlIllI) {
        return Block.lIIIIIIIllllll[19];
    }
    
    private boolean isVecInsideXYBounds(final Vec3 lllllllllllllIlIlIIIlIIllIllllII) {
        int n;
        if (lIllIIllllIIIlI(lllllllllllllIlIlIIIlIIllIllllII)) {
            n = Block.lIIIIIIIllllll[0];
            "".length();
            if ((0xF2 ^ 0xA9 ^ (0x47 ^ 0x18)) < 0) {
                return ((0x8F ^ 0xA6 ^ (0xE ^ 0x14)) & (0x6F ^ 0x46 ^ (0x73 ^ 0x69) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIIllllIIlIl(lIllIIllllIlIII(lllllllllllllIlIlIIIlIIllIllllII.xCoord, this.minX)) && lIllIIlllIlllll(lIllIIllllIlIIl(lllllllllllllIlIlIIIlIIllIllllII.xCoord, this.maxX)) && lIllIIllllIIlIl(lIllIIllllIlIII(lllllllllllllIlIlIIIlIIllIllllII.yCoord, this.minY)) && lIllIIlllIlllll(lIllIIllllIlIIl(lllllllllllllIlIlIIIlIIllIllllII.yCoord, this.maxY))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if (null != null) {
                return ((0x2B ^ 0x1B) & ~(0x1F ^ 0x2F)) != 0x0;
            }
        }
        else {
            n = Block.lIIIIIIIllllll[0];
        }
        return n != 0;
    }
    
    public float getAmbientOcclusionLightValue() {
        float n;
        if (lIllIIlllIlIlII(this.isBlockNormalCube() ? 1 : 0)) {
            n = 0.2f;
            "".length();
            if (" ".length() > " ".length()) {
                return 0.0f;
            }
        }
        else {
            n = 1.0f;
        }
        return n;
    }
    
    protected Block setHardness(final float lllllllllllllIlIlIIIlIllIIIIIIIl) {
        this.blockHardness = lllllllllllllIlIlIIIlIllIIIIIIIl;
        if (lIllIIlllIllIII(lIllIIlllIlIlll(this.blockResistance, lllllllllllllIlIlIIIlIllIIIIIIIl * 5.0f))) {
            this.blockResistance = lllllllllllllIlIlIIIlIllIIIIIIIl * 5.0f;
        }
        return this;
    }
    
    public boolean canCollideCheck(final IBlockState lllllllllllllIlIlIIIlIlIlIIIlllI, final boolean lllllllllllllIlIlIIIlIlIlIIIllIl) {
        return this.isCollidable();
    }
    
    public int tickRate(final World lllllllllllllIlIlIIIlIlIIllIIlll) {
        return Block.lIIIIIIIllllll[10];
    }
    
    public Block setUnlocalizedName(final String lllllllllllllIlIlIIIlIIlIIIIIlIl) {
        this.unlocalizedName = lllllllllllllIlIlIIIlIIlIIIIIlIl;
        return this;
    }
    
    public Vec3 modifyAcceleration(final World lllllllllllllIlIlIIIlIIlIlllIllI, final BlockPos lllllllllllllIlIlIIIlIIlIlllIlIl, final Entity lllllllllllllIlIlIIIlIIlIlllIlII, final Vec3 lllllllllllllIlIlIIIlIIlIlllIIll) {
        return lllllllllllllIlIlIIIlIIlIlllIIll;
    }
    
    private static int lIllIIllllIIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public IBlockState getStateForEntityRender(final IBlockState lllllllllllllIlIlIIIlIIIlIIllllI) {
        return lllllllllllllIlIlIIIlIIIlIIllllI;
    }
    
    public void harvestBlock(final World lllllllllllllIlIlIIIlIIlIIllIlII, final EntityPlayer lllllllllllllIlIlIIIlIIlIIllIIll, final BlockPos lllllllllllllIlIlIIIlIIlIIllIIlI, final IBlockState lllllllllllllIlIlIIIlIIlIIlIlIIl, final TileEntity lllllllllllllIlIlIIIlIIlIIllIIII) {
        lllllllllllllIlIlIIIlIIlIIllIIll.triggerAchievement(StatList.mineBlockStatArray[getIdFromBlock(this)]);
        lllllllllllllIlIlIIIlIIlIIllIIll.addExhaustion(0.025f);
        if (lIllIIlllIlIlII(this.canSilkHarvest() ? 1 : 0) && lIllIIlllIlIlII(EnchantmentHelper.getSilkTouchModifier(lllllllllllllIlIlIIIlIIlIIllIIll) ? 1 : 0)) {
            final ItemStack lllllllllllllIlIlIIIlIIlIIlIllll = this.createStackedBlock(lllllllllllllIlIlIIIlIIlIIlIlIIl);
            if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlIIlIllll)) {
                spawnAsEntity(lllllllllllllIlIlIIIlIIlIIllIlII, lllllllllllllIlIlIIIlIIlIIllIIlI, lllllllllllllIlIlIIIlIIlIIlIllll);
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
        }
        else {
            final int lllllllllllllIlIlIIIlIIlIIlIlllI = EnchantmentHelper.getFortuneModifier(lllllllllllllIlIlIIIlIIlIIllIIll);
            this.dropBlockAsItem(lllllllllllllIlIlIIIlIIlIIllIlII, lllllllllllllIlIlIIIlIIlIIllIIlI, lllllllllllllIlIlIIIlIIlIIlIlIIl, lllllllllllllIlIlIIIlIIlIIlIlllI);
        }
    }
    
    public int quantityDroppedWithBonus(final int lllllllllllllIlIlIIIlIIlIIIlIlIl, final Random lllllllllllllIlIlIIIlIIlIIIlIIlI) {
        return this.quantityDropped(lllllllllllllIlIlIIIlIIlIIIlIIlI);
    }
    
    private static int lIllIIlllIllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIllIIlllIllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean isOpaqueCube() {
        return Block.lIIIIIIIllllll[1] != 0;
    }
    
    public boolean canDropFromExplosion(final Explosion lllllllllllllIlIlIIIlIIIlIllIIlI) {
        return Block.lIIIIIIIllllll[1] != 0;
    }
    
    public void addCollisionBoxesToList(final World lllllllllllllIlIlIIIlIlIlIIlllll, final BlockPos lllllllllllllIlIlIIIlIlIlIIllllI, final IBlockState lllllllllllllIlIlIIIlIlIlIlIIlIl, final AxisAlignedBB lllllllllllllIlIlIIIlIlIlIIlllII, final List<AxisAlignedBB> lllllllllllllIlIlIIIlIlIlIlIIIll, final Entity lllllllllllllIlIlIIIlIlIlIlIIIlI) {
        final AxisAlignedBB lllllllllllllIlIlIIIlIlIlIlIIIIl = this.getCollisionBoundingBox(lllllllllllllIlIlIIIlIlIlIIlllll, lllllllllllllIlIlIIIlIlIlIIllllI, lllllllllllllIlIlIIIlIlIlIlIIlIl);
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIlIlIlIIIIl) && lIllIIlllIlIlII(lllllllllllllIlIlIIIlIlIlIIlllII.intersectsWith(lllllllllllllIlIlIIIlIlIlIlIIIIl) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIlIlIlIIIll.add(lllllllllllllIlIlIIIlIlIlIlIIIIl);
            "".length();
        }
    }
    
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIlIIIlIIlIlIIIlIl, final BlockPos lllllllllllllIlIlIIIlIIlIlIIIlII, final IBlockState lllllllllllllIlIlIIIlIIlIlIIIIll, final Entity lllllllllllllIlIlIIIlIIlIlIIIIlI) {
    }
    
    public MovingObjectPosition collisionRayTrace(final World lllllllllllllIlIlIIIlIIlllIlIlll, final BlockPos lllllllllllllIlIlIIIlIIllllIIIll, Vec3 lllllllllllllIlIlIIIlIIlllIlIlIl, Vec3 lllllllllllllIlIlIIIlIIlllIlIlII) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIlIIIlIIlllIlIlll, lllllllllllllIlIlIIIlIIllllIIIll);
        lllllllllllllIlIlIIIlIIlllIlIlIl = lllllllllllllIlIlIIIlIIlllIlIlIl.addVector(-lllllllllllllIlIlIIIlIIllllIIIll.getX(), -lllllllllllllIlIlIIIlIIllllIIIll.getY(), -lllllllllllllIlIlIIIlIIllllIIIll.getZ());
        lllllllllllllIlIlIIIlIIlllIlIlII = lllllllllllllIlIlIIIlIIlllIlIlII.addVector(-lllllllllllllIlIlIIIlIIllllIIIll.getX(), -lllllllllllllIlIlIIIlIIllllIIIll.getY(), -lllllllllllllIlIlIIIlIIllllIIIll.getZ());
        Vec3 lllllllllllllIlIlIIIlIIllllIIIII = lllllllllllllIlIlIIIlIIlllIlIlIl.getIntermediateWithXValue(lllllllllllllIlIlIIIlIIlllIlIlII, this.minX);
        Vec3 lllllllllllllIlIlIIIlIIlllIlllll = lllllllllllllIlIlIIIlIIlllIlIlIl.getIntermediateWithXValue(lllllllllllllIlIlIIIlIIlllIlIlII, this.maxX);
        Vec3 lllllllllllllIlIlIIIlIIlllIllllI = lllllllllllllIlIlIIIlIIlllIlIlIl.getIntermediateWithYValue(lllllllllllllIlIlIIIlIIlllIlIlII, this.minY);
        Vec3 lllllllllllllIlIlIIIlIIlllIlllIl = lllllllllllllIlIlIIIlIIlllIlIlIl.getIntermediateWithYValue(lllllllllllllIlIlIIIlIIlllIlIlII, this.maxY);
        Vec3 lllllllllllllIlIlIIIlIIlllIlllII = lllllllllllllIlIlIIIlIIlllIlIlIl.getIntermediateWithZValue(lllllllllllllIlIlIIIlIIlllIlIlII, this.minZ);
        Vec3 lllllllllllllIlIlIIIlIIlllIllIll = lllllllllllllIlIlIIIlIIlllIlIlIl.getIntermediateWithZValue(lllllllllllllIlIlIIIlIIlllIlIlII, this.maxZ);
        if (lIllIIlllIlIllI(this.isVecInsideYZBounds(lllllllllllllIlIlIIIlIIllllIIIII) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIIllllIIIII = null;
        }
        if (lIllIIlllIlIllI(this.isVecInsideYZBounds(lllllllllllllIlIlIIIlIIlllIlllll) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIIlllIlllll = null;
        }
        if (lIllIIlllIlIllI(this.isVecInsideXZBounds(lllllllllllllIlIlIIIlIIlllIllllI) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIIlllIllllI = null;
        }
        if (lIllIIlllIlIllI(this.isVecInsideXZBounds(lllllllllllllIlIlIIIlIIlllIlllIl) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIIlllIlllIl = null;
        }
        if (lIllIIlllIlIllI(this.isVecInsideXYBounds(lllllllllllllIlIlIIIlIIlllIlllII) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIIlllIlllII = null;
        }
        if (lIllIIlllIlIllI(this.isVecInsideXYBounds(lllllllllllllIlIlIIIlIIlllIllIll) ? 1 : 0)) {
            lllllllllllllIlIlIIIlIIlllIllIll = null;
        }
        Vec3 lllllllllllllIlIlIIIlIIlllIllIlI = null;
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIllllIIIII) && (!lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllIlI) || lIllIIlllIllIII(lIllIIllllIIIIl(lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIllllIIIII), lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllIlI))))) {
            lllllllllllllIlIlIIIlIIlllIllIlI = lllllllllllllIlIlIIIlIIllllIIIII;
        }
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIlllll) && (!lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllIlI) || lIllIIlllIllIII(lIllIIllllIIIIl(lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIlllll), lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllIlI))))) {
            lllllllllllllIlIlIIIlIIlllIllIlI = lllllllllllllIlIlIIIlIIlllIlllll;
        }
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllllI) && (!lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllIlI) || lIllIIlllIllIII(lIllIIllllIIIIl(lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllllI), lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllIlI))))) {
            lllllllllllllIlIlIIIlIIlllIllIlI = lllllllllllllIlIlIIIlIIlllIllllI;
        }
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIlllIl) && (!lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllIlI) || lIllIIlllIllIII(lIllIIllllIIIIl(lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIlllIl), lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllIlI))))) {
            lllllllllllllIlIlIIIlIIlllIllIlI = lllllllllllllIlIlIIIlIIlllIlllIl;
        }
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIlllII) && (!lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllIlI) || lIllIIlllIllIII(lIllIIllllIIIIl(lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIlllII), lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllIlI))))) {
            lllllllllllllIlIlIIIlIIlllIllIlI = lllllllllllllIlIlIIIlIIlllIlllII;
        }
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllIll) && (!lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlllIllIlI) || lIllIIlllIllIII(lIllIIllllIIIIl(lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllIll), lllllllllllllIlIlIIIlIIlllIlIlIl.squareDistanceTo(lllllllllllllIlIlIIIlIIlllIllIlI))))) {
            lllllllllllllIlIlIIIlIIlllIllIlI = lllllllllllllIlIlIIIlIIlllIllIll;
        }
        if (lIllIIllllIIIlI(lllllllllllllIlIlIIIlIIlllIllIlI)) {
            return null;
        }
        EnumFacing lllllllllllllIlIlIIIlIIlllIllIIl = null;
        if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIlllIllIlI, lllllllllllllIlIlIIIlIIllllIIIII)) {
            lllllllllllllIlIlIIIlIIlllIllIIl = EnumFacing.WEST;
        }
        if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIlllIllIlI, lllllllllllllIlIlIIIlIIlllIlllll)) {
            lllllllllllllIlIlIIIlIIlllIllIIl = EnumFacing.EAST;
        }
        if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIlllIllIlI, lllllllllllllIlIlIIIlIIlllIllllI)) {
            lllllllllllllIlIlIIIlIIlllIllIIl = EnumFacing.DOWN;
        }
        if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIlllIllIlI, lllllllllllllIlIlIIIlIIlllIlllIl)) {
            lllllllllllllIlIlIIIlIIlllIllIIl = EnumFacing.UP;
        }
        if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIlllIllIlI, lllllllllllllIlIlIIIlIIlllIlllII)) {
            lllllllllllllIlIlIIIlIIlllIllIIl = EnumFacing.NORTH;
        }
        if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIlllIllIlI, lllllllllllllIlIlIIIlIIlllIllIll)) {
            lllllllllllllIlIlIIIlIIlllIllIIl = EnumFacing.SOUTH;
        }
        return new MovingObjectPosition(lllllllllllllIlIlIIIlIIlllIllIlI.addVector(lllllllllllllIlIlIIIlIIllllIIIll.getX(), lllllllllllllIlIlIIIlIIllllIIIll.getY(), lllllllllllllIlIlIIIlIIllllIIIll.getZ()), lllllllllllllIlIlIIIlIIlllIllIIl, lllllllllllllIlIlIIIlIIllllIIIll);
    }
    
    public final double getBlockBoundsMaxZ() {
        return this.maxZ;
    }
    
    public void onBlockClicked(final World lllllllllllllIlIlIIIlIIlIllllIll, final BlockPos lllllllllllllIlIlIIIlIIlIllllIlI, final EntityPlayer lllllllllllllIlIlIIIlIIlIllllIIl) {
    }
    
    private static boolean lIllIIllllIlllI(final int lllllllllllllIlIlIIIIlllllllIIll, final int lllllllllllllIlIlIIIIlllllllIIlI) {
        return lllllllllllllIlIlIIIIlllllllIIll < lllllllllllllIlIlIIIIlllllllIIlI;
    }
    
    private static boolean lIllIIlllIlIllI(final int lllllllllllllIlIlIIIIllllllIIllI) {
        return lllllllllllllIlIlIIIIllllllIIllI == 0;
    }
    
    private static boolean lIllIIllllIIIlI(final Object lllllllllllllIlIlIIIIllllllIlIlI) {
        return lllllllllllllIlIlIIIIllllllIlIlI == null;
    }
    
    public Item getItem(final World lllllllllllllIlIlIIIlIIIllIllIlI, final BlockPos lllllllllllllIlIlIIIlIIIllIllIIl) {
        return Item.getItemFromBlock(this);
    }
    
    private static void registerBlock(final int lllllllllllllIlIlIIIlIIIIlIIIllI, final ResourceLocation lllllllllllllIlIlIIIlIIIIlIIIIlI, final Block lllllllllllllIlIlIIIlIIIIlIIIIIl) {
        Block.blockRegistry.register(lllllllllllllIlIlIIIlIIIIlIIIllI, lllllllllllllIlIlIIIlIIIIlIIIIlI, lllllllllllllIlIlIIIlIIIIlIIIIIl);
    }
    
    private static boolean lIllIIlllIlllll(final int lllllllllllllIlIlIIIIllllllIIIII) {
        return lllllllllllllIlIlIIIIllllllIIIII <= 0;
    }
    
    public float getPlayerRelativeBlockHardness(final EntityPlayer lllllllllllllIlIlIIIlIlIIlIlIIII, final World lllllllllllllIlIlIIIlIlIIlIIllll, final BlockPos lllllllllllllIlIlIIIlIlIIlIIlIIl) {
        final float lllllllllllllIlIlIIIlIlIIlIIllIl = this.getBlockHardness(lllllllllllllIlIlIIIlIlIIlIIllll, lllllllllllllIlIlIIIlIlIIlIIlIIl);
        float n;
        if (lIllIIlllIllIII(lIllIIlllIlllIl(lllllllllllllIlIlIIIlIlIIlIIllIl, 0.0f))) {
            n = 0.0f;
            "".length();
            if (-" ".length() >= ((0xC3 ^ 0x92 ^ (0x4C ^ 0x38)) & (74 + 38 - 1 + 80 ^ 113 + 40 - 100 + 101 ^ -" ".length()))) {
                return 0.0f;
            }
        }
        else if (lIllIIlllIlIllI(lllllllllllllIlIlIIIlIlIIlIlIIII.canHarvestBlock(this) ? 1 : 0)) {
            n = lllllllllllllIlIlIIIlIlIIlIlIIII.getToolDigEfficiency(this) / lllllllllllllIlIlIIIlIlIIlIIllIl / 100.0f;
            "".length();
            if ("   ".length() <= 0) {
                return 0.0f;
            }
        }
        else {
            n = lllllllllllllIlIlIIIlIlIIlIlIIII.getToolDigEfficiency(this) / lllllllllllllIlIlIIIlIlIIlIIllIl / 30.0f;
        }
        return n;
    }
    
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIlIlIIIlIlIllIIIlIl, final BlockPos lllllllllllllIlIlIIIlIlIllIIIIII, final EnumFacing lllllllllllllIlIlIIIlIlIlIllllll) {
        int n;
        if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIlIlIllllll, EnumFacing.DOWN) && lIllIIlllIlllII(lIllIIlllIllIIl(this.minY, 0.0))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if (((0x34 ^ 0x5D ^ (0xFA ^ 0x83)) & (0x60 ^ 0x19 ^ (0xA9 ^ 0xC0) ^ -" ".length())) != 0x0) {
                return ((0xD9 ^ 0x8B ^ (0x42 ^ 0x21)) & (0x6F ^ 0xA ^ (0x1 ^ 0x55) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIlIlIllllll, EnumFacing.UP) && lIllIIlllIllIII(lIllIIlllIllIlI(this.maxY, 1.0))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if ("  ".length() <= ((0x28 ^ 0x6F ^ (0x85 ^ 0xA3)) & (0xA6 ^ 0xB7 ^ (0x65 ^ 0x15) ^ -" ".length()))) {
                return ((142 + 136 - 242 + 108 ^ 23 + 35 + 48 + 83) & (84 + 113 - 68 + 8 ^ 35 + 112 - 127 + 144 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIlIlIllllll, EnumFacing.NORTH) && lIllIIlllIlllII(lIllIIlllIllIIl(this.minZ, 0.0))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if (null != null) {
                return ((0x34 ^ 0x18) & ~(0x86 ^ 0xAA)) != 0x0;
            }
        }
        else if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIlIlIllllll, EnumFacing.SOUTH) && lIllIIlllIllIII(lIllIIlllIllIlI(this.maxZ, 1.0))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if (((0x90 ^ 0x81 ^ (0x24 ^ 0x7D)) & (172 + 158 - 280 + 180 ^ 41 + 23 + 105 + 5 ^ -" ".length())) >= (0xB1 ^ 0x94 ^ (0xB ^ 0x2A))) {
                return ((0x28 ^ 0x3F ^ (0xE1 ^ 0x94)) & (0x80 ^ 0x98 ^ (0x65 ^ 0x1F) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIlIlIllllll, EnumFacing.WEST) && lIllIIlllIlllII(lIllIIlllIllIIl(this.minX, 0.0))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if ((0x51 ^ 0x55) == 0x0) {
                return ((0xCE ^ 0xAF) & ~(0xFB ^ 0x9A)) != 0x0;
            }
        }
        else if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIlIlIllllll, EnumFacing.EAST) && lIllIIlllIllIII(lIllIIlllIllIlI(this.maxX, 1.0))) {
            n = Block.lIIIIIIIllllll[1];
            "".length();
            if ("  ".length() == (0x52 ^ 0x56)) {
                return ((0xAE ^ 0xB2) & ~(0x31 ^ 0x2D)) != 0x0;
            }
        }
        else if (lIllIIlllIlIlII(lllllllllllllIlIlIIIlIlIllIIIlIl.getBlockState(lllllllllllllIlIlIIIlIlIllIIIIII).getBlock().isOpaqueCube() ? 1 : 0)) {
            n = Block.lIIIIIIIllllll[0];
            "".length();
            if (" ".length() == 0) {
                return ((0x66 ^ 0x4F ^ (0xDD ^ 0xA0)) & (0x12 ^ 0x22 ^ (0xA4 ^ 0xC0) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Block.lIIIIIIIllllll[1];
        }
        return n != 0;
    }
    
    private static int lIllIIllllIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lIllIIllllIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean isTranslucent() {
        return this.translucent;
    }
    
    static {
        lIllIIlllIlIIll();
        lIllIIlllIIlIIl();
        AIR_ID = new ResourceLocation(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[0]]);
        blockRegistry = new RegistryNamespacedDefaultedByKey<ResourceLocation, Block>(Block.AIR_ID);
        BLOCK_STATE_IDS = new ObjectIntIdentityMap<IBlockState>();
        soundTypeStone = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[1]], 1.0f, 1.0f);
        soundTypeWood = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[2]], 1.0f, 1.0f);
        soundTypeGravel = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[3]], 1.0f, 1.0f);
        soundTypeGrass = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[4]], 1.0f, 1.0f);
        soundTypePiston = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[5]], 1.0f, 1.0f);
        soundTypeMetal = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[6]], 1.0f, 1.5f);
        soundTypeGlass = new SoundType(1.0f, 1.0f) {
            private static final /* synthetic */ int[] llllIIlIlIIII;
            private static final /* synthetic */ String[] llllIIlIIllII;
            
            private static boolean lIlIlIIIIllllIl(final int lllllllllllllIlIlllIIlllIIIIlIII, final int lllllllllllllIlIlllIIlllIIIIIlll) {
                return lllllllllllllIlIlllIIlllIIIIlIII < lllllllllllllIlIlllIIlllIIIIIlll;
            }
            
            private static String lIlIlIIIIlIlIlI(final String lllllllllllllIlIlllIIlllIIIIlllI, final String lllllllllllllIlIlllIIlllIIIIllIl) {
                try {
                    final SecretKeySpec lllllllllllllIlIlllIIlllIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlllIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIlIlllIIlllIIIlIIlI = Cipher.getInstance("Blowfish");
                    lllllllllllllIlIlllIIlllIIIlIIlI.init(Block$1.llllIIlIlIIII[2], lllllllllllllIlIlllIIlllIIIlIIll);
                    return new String(lllllllllllllIlIlllIIlllIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlllIIlllIIIlIIIl) {
                    lllllllllllllIlIlllIIlllIIIlIIIl.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String getBreakSound() {
                return Block$1.llllIIlIIllII[Block$1.llllIIlIlIIII[0]];
            }
            
            private static void lIlIlIIIIllllII() {
                (llllIIlIlIIII = new int[3])[0] = ((0x20 ^ 0x36) & ~(0x57 ^ 0x41));
                Block$1.llllIIlIlIIII[1] = " ".length();
                Block$1.llllIIlIlIIII[2] = "  ".length();
            }
            
            private static void lIlIlIIIIlIllII() {
                (llllIIlIIllII = new String[Block$1.llllIIlIlIIII[2]])[Block$1.llllIIlIlIIII[0]] = lIlIlIIIIlIlIlI("aDCtsXe0tb3BRNrAGVlWmg==", "cucAz");
                Block$1.llllIIlIIllII[Block$1.llllIIlIlIIII[1]] = lIlIlIIIIlIlIll("PyEIA34/IQIdNQ==", "LUmsP");
            }
            
            private static String lIlIlIIIIlIlIll(String lllllllllllllIlIlllIIlllIIlIIlII, final String lllllllllllllIlIlllIIlllIIlIIIll) {
                lllllllllllllIlIlllIIlllIIlIIlII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlllIIlllIIlIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIlIlllIIlllIIlIlIIl = new StringBuilder();
                final char[] lllllllllllllIlIlllIIlllIIlIIlll = lllllllllllllIlIlllIIlllIIlIIIll.toCharArray();
                int lllllllllllllIlIlllIIlllIIlIIlIl = Block$1.llllIIlIlIIII[0];
                final byte lllllllllllllIlIlllIIlllIIIlllII = (Object)((String)lllllllllllllIlIlllIIlllIIlIIlII).toCharArray();
                final int lllllllllllllIlIlllIIlllIIIllIlI = lllllllllllllIlIlllIIlllIIIlllII.length;
                int lllllllllllllIlIlllIIlllIIIllIIl = Block$1.llllIIlIlIIII[0];
                while (lIlIlIIIIllllIl(lllllllllllllIlIlllIIlllIIIllIIl, lllllllllllllIlIlllIIlllIIIllIlI)) {
                    final char lllllllllllllIlIlllIIlllIIlIlllI = lllllllllllllIlIlllIIlllIIIlllII[lllllllllllllIlIlllIIlllIIIllIIl];
                    lllllllllllllIlIlllIIlllIIlIlIIl.append((char)(lllllllllllllIlIlllIIlllIIlIlllI ^ lllllllllllllIlIlllIIlllIIlIIlll[lllllllllllllIlIlllIIlllIIlIIlIl % lllllllllllllIlIlllIIlllIIlIIlll.length]));
                    "".length();
                    ++lllllllllllllIlIlllIIlllIIlIIlIl;
                    ++lllllllllllllIlIlllIIlllIIIllIIl;
                    "".length();
                    if (-" ".length() >= "   ".length()) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIlIlllIIlllIIlIlIIl);
            }
            
            @Override
            public String getPlaceSound() {
                return Block$1.llllIIlIIllII[Block$1.llllIIlIlIIII[1]];
            }
            
            static {
                lIlIlIIIIllllII();
                lIlIlIIIIlIllII();
            }
        };
        soundTypeCloth = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[8]], 1.0f, 1.0f);
        soundTypeSand = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[9]], 1.0f, 1.0f);
        soundTypeSnow = new SoundType(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[10]], 1.0f, 1.0f);
        soundTypeLadder = new SoundType(1.0f, 1.0f) {
            private static final /* synthetic */ String[] lllIIIIIIIIlIl;
            private static final /* synthetic */ int[] lllIIIIIlllIIl;
            
            @Override
            public String getBreakSound() {
                return Block$2.lllIIIIIIIIlIl[Block$2.lllIIIIIlllIIl[0]];
            }
            
            private static void lIIllIllllIlllIl() {
                (lllIIIIIIIIlIl = new String[Block$2.lllIIIIIlllIIl[1]])[Block$2.lllIIIIIlllIIl[0]] = lIIllIllllIlllII("Jj0LVC0tOwg=", "BTlzZ");
            }
            
            private static boolean lIIlllIIIlIlIIIl(final int llllllllllllIllIIIIllIIlllllIlll, final int llllllllllllIllIIIIllIIlllllIllI) {
                return llllllllllllIllIIIIllIIlllllIlll < llllllllllllIllIIIIllIIlllllIllI;
            }
            
            private static String lIIllIllllIlllII(String llllllllllllIllIIIIllIlIIIIIIIlI, final String llllllllllllIllIIIIllIlIIIIIIIIl) {
                llllllllllllIllIIIIllIlIIIIIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIIIIllIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllIIIIllIlIIIIIIlIl = new StringBuilder();
                final char[] llllllllllllIllIIIIllIlIIIIIIlII = llllllllllllIllIIIIllIlIIIIIIIIl.toCharArray();
                int llllllllllllIllIIIIllIlIIIIIIIll = Block$2.lllIIIIIlllIIl[0];
                final boolean llllllllllllIllIIIIllIIlllllllIl = (Object)llllllllllllIllIIIIllIlIIIIIIIlI.toCharArray();
                final float llllllllllllIllIIIIllIIlllllllII = llllllllllllIllIIIIllIIlllllllIl.length;
                short llllllllllllIllIIIIllIIllllllIll = (short)Block$2.lllIIIIIlllIIl[0];
                while (lIIlllIIIlIlIIIl(llllllllllllIllIIIIllIIllllllIll, (int)llllllllllllIllIIIIllIIlllllllII)) {
                    final char llllllllllllIllIIIIllIlIIIIIlIII = llllllllllllIllIIIIllIIlllllllIl[llllllllllllIllIIIIllIIllllllIll];
                    llllllllllllIllIIIIllIlIIIIIIlIl.append((char)(llllllllllllIllIIIIllIlIIIIIlIII ^ llllllllllllIllIIIIllIlIIIIIIlII[llllllllllllIllIIIIllIlIIIIIIIll % llllllllllllIllIIIIllIlIIIIIIlII.length]));
                    "".length();
                    ++llllllllllllIllIIIIllIlIIIIIIIll;
                    ++llllllllllllIllIIIIllIIllllllIll;
                    "".length();
                    if ((31 + 157 - 27 + 7 ^ 112 + 124 - 185 + 121) <= " ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllIIIIllIlIIIIIIlIl);
            }
            
            private static void lIIlllIIIlIlIIII() {
                (lllIIIIIlllIIl = new int[2])[0] = ((0xA3 ^ 0x83) & ~(0x99 ^ 0xB9));
                Block$2.lllIIIIIlllIIl[1] = " ".length();
            }
            
            static {
                lIIlllIIIlIlIIII();
                lIIllIllllIlllIl();
            }
        };
        soundTypeAnvil = new SoundType(0.3f, 1.0f) {
            private static final /* synthetic */ String[] llIIIIlllIlIII;
            private static final /* synthetic */ int[] llIIIIlllIlIlI;
            
            private static String lIIIlIIIIlIllIlI(final String llllllllllllIlllIllIIlllllIlIlII, final String llllllllllllIlllIllIIlllllIlIIIl) {
                try {
                    final SecretKeySpec llllllllllllIlllIllIIlllllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlllllIlIIIl.getBytes(StandardCharsets.UTF_8)), Block$3.llIIIIlllIlIlI[3]), "DES");
                    final Cipher llllllllllllIlllIllIIlllllIlIllI = Cipher.getInstance("DES");
                    llllllllllllIlllIllIIlllllIlIllI.init(Block$3.llIIIIlllIlIlI[2], llllllllllllIlllIllIIlllllIlIlll);
                    return new String(llllllllllllIlllIllIIlllllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIllIIlllllIlIlIl) {
                    llllllllllllIlllIllIIlllllIlIlIl.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIIlIIIIlIlllIl() {
                (llIIIIlllIlIlI = new int[4])[0] = ((0x29 ^ 0x53 ^ (0x33 ^ 0x6D)) & (0x73 ^ 0x6C ^ (0x59 ^ 0x62) ^ -" ".length()));
                Block$3.llIIIIlllIlIlI[1] = " ".length();
                Block$3.llIIIIlllIlIlI[2] = "  ".length();
                Block$3.llIIIIlllIlIlI[3] = (29 + 61 + 3 + 69 ^ 40 + 43 + 56 + 31);
            }
            
            @Override
            public String getBreakSound() {
                return Block$3.llIIIIlllIlIII[Block$3.llIIIIlllIlIlI[0]];
            }
            
            static {
                lIIIlIIIIlIlllIl();
                lIIIlIIIIlIllIll();
            }
            
            @Override
            public String getPlaceSound() {
                return Block$3.llIIIIlllIlIII[Block$3.llIIIIlllIlIlI[1]];
            }
            
            private static void lIIIlIIIIlIllIll() {
                (llIIIIlllIlIII = new String[Block$3.llIIIIlllIlIlI[2]])[Block$3.llIIIIlllIlIlI[0]] = lIIIlIIIIlIllIlI("E/zlyD/eL/WMdvmHwJnD1A==", "VZcrJ");
                Block$3.llIIIIlllIlIII[Block$3.llIIIIlllIlIlI[1]] = lIIIlIIIIlIllIlI("gV4yXuQ9/ggs4jbL4fCGCEvU91gRmu1/", "mozKd");
            }
        };
        SLIME_SOUND = new SoundType(1.0f, 1.0f) {
            private static final /* synthetic */ int[] llIIIIllIIIlIl;
            private static final /* synthetic */ String[] llIIIIllIIIIll;
            
            @Override
            public String getStepSound() {
                return Block$4.llIIIIllIIIIll[Block$4.llIIIIllIIIlIl[2]];
            }
            
            private static String lIIIlIIIIIIlIIIl(final String llllllllllllIlllIllIlIllllIIlIII, final String llllllllllllIlllIllIlIllllIIIlll) {
                try {
                    final SecretKeySpec llllllllllllIlllIllIlIllllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlIllllIIIlll.getBytes(StandardCharsets.UTF_8)), Block$4.llIIIIllIIIlIl[4]), "DES");
                    final Cipher llllllllllllIlllIllIlIllllIIlIlI = Cipher.getInstance("DES");
                    llllllllllllIlllIllIlIllllIIlIlI.init(Block$4.llIIIIllIIIlIl[2], llllllllllllIlllIllIlIllllIIlIll);
                    return new String(llllllllllllIlllIllIlIllllIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIllIlIllllIIlIIl) {
                    llllllllllllIlllIllIlIllllIIlIIl.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIIIlIIIIIlIIIII();
                lIIIlIIIIIIlllll();
            }
            
            private static String lIIIlIIIIIIlIIlI(final String llllllllllllIlllIllIlIllllIlIIll, final String llllllllllllIlllIllIlIllllIlIlII) {
                try {
                    final SecretKeySpec llllllllllllIlllIllIlIllllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlIllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllIllIlIllllIlIlll = Cipher.getInstance("Blowfish");
                    llllllllllllIlllIllIlIllllIlIlll.init(Block$4.llIIIIllIIIlIl[2], llllllllllllIlllIllIlIllllIllIII);
                    return new String(llllllllllllIlllIllIlIllllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlIllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIllIlIllllIlIllI) {
                    llllllllllllIlllIllIlIllllIlIllI.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String getPlaceSound() {
                return Block$4.llIIIIllIIIIll[Block$4.llIIIIllIIIlIl[1]];
            }
            
            @Override
            public String getBreakSound() {
                return Block$4.llIIIIllIIIIll[Block$4.llIIIIllIIIlIl[0]];
            }
            
            private static void lIIIlIIIIIIlllll() {
                (llIIIIllIIIIll = new String[Block$4.llIIIIllIIIlIl[3]])[Block$4.llIIIIllIIIlIl[0]] = lIIIlIIIIIIlIIIl("o+9Lg3M2REMJU+pOP0WryA==", "rycib");
                Block$4.llIIIIllIIIIll[Block$4.llIIIIllIIIlIl[1]] = lIIIlIIIIIIlIIlI("/6N8k51yatmTrEefRdCt0A==", "lJKae");
                Block$4.llIIIIllIIIIll[Block$4.llIIIIllIIIlIl[2]] = lIIIlIIIIIIlIIIl("2FNoqP2JkRCTvCM7FHrTzw==", "nBRWJ");
            }
            
            private static void lIIIlIIIIIlIIIII() {
                (llIIIIllIIIlIl = new int[5])[0] = ((0xD1 ^ 0xB8 ^ (0xE5 ^ 0xB1)) & (0x33 ^ 0x3C ^ (0xBB ^ 0x89) ^ -" ".length()));
                Block$4.llIIIIllIIIlIl[1] = " ".length();
                Block$4.llIIIIllIIIlIl[2] = "  ".length();
                Block$4.llIIIIllIIIlIl[3] = "   ".length();
                Block$4.llIIIIllIIIlIl[4] = (0xF8 ^ 0xBE ^ (0xD0 ^ 0x9E));
            }
        };
    }
    
    protected Block setTickRandomly(final boolean lllllllllllllIlIlIIIlIlIllllIlIl) {
        this.needsRandomTick = lllllllllllllIlIlIIIlIlIllllIlIl;
        return this;
    }
    
    private static boolean lIllIIlllIlllII(final int lllllllllllllIlIlIIIIlllllIllllI) {
        return lllllllllllllIlIlIIIIlllllIllllI > 0;
    }
    
    public final double getBlockBoundsMinY() {
        return this.minY;
    }
    
    private static String lIllIIllIlIllII(final String lllllllllllllIlIlIIIlIIIIIlIIlII, final String lllllllllllllIlIlIIIlIIIIIlIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIlIIIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIlIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIlIIIIIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIlIIIIIlIIllI.init(Block.lIIIIIIIllllll[2], lllllllllllllIlIlIIIlIIIIIlIIlll);
            return new String(lllllllllllllIlIlIIIlIIIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIlIIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIlIIIIIlIIlIl) {
            lllllllllllllIlIlIIIlIIIIIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    public boolean canProvidePower() {
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    protected Block setBlockUnbreakable() {
        this.setHardness(-1.0f);
        "".length();
        return this;
    }
    
    public void onBlockDestroyedByExplosion(final World lllllllllllllIlIlIIIlIIllIlllIII, final BlockPos lllllllllllllIlIlIIIlIIllIllIlll, final Explosion lllllllllllllIlIlIIIlIIllIllIllI) {
    }
    
    public boolean getEnableStats() {
        return this.enableStats;
    }
    
    protected final void setBlockBounds(final float lllllllllllllIlIlIIIlIlIlllIIlII, final float lllllllllllllIlIlIIIlIlIlllIIIll, final float lllllllllllllIlIlIIIlIlIllIllIll, final float lllllllllllllIlIlIIIlIlIlllIIIIl, final float lllllllllllllIlIlIIIlIlIllIllIIl, final float lllllllllllllIlIlIIIlIlIllIlllll) {
        this.minX = lllllllllllllIlIlIIIlIlIlllIIlII;
        this.minY = lllllllllllllIlIlIIIlIlIlllIIIll;
        this.minZ = lllllllllllllIlIlIIIlIlIllIllIll;
        this.maxX = lllllllllllllIlIlIIIlIlIlllIIIIl;
        this.maxY = lllllllllllllIlIlIIIlIlIllIllIIl;
        this.maxZ = lllllllllllllIlIlIIIlIlIllIlllll;
    }
    
    public boolean hasComparatorInputOverride() {
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    public void onBlockAdded(final World lllllllllllllIlIlIIIlIlIIllIIlIl, final BlockPos lllllllllllllIlIlIIIlIlIIllIIlII, final IBlockState lllllllllllllIlIlIIIlIlIIllIIIll) {
    }
    
    public boolean getUseNeighborBrightness() {
        return this.useNeighborBrightness;
    }
    
    public Material getMaterial() {
        return this.blockMaterial;
    }
    
    protected Block setLightOpacity(final int lllllllllllllIlIlIIIlIllIIlIIllI) {
        this.lightOpacity = lllllllllllllIlIlIIIlIllIIlIIllI;
        return this;
    }
    
    public static Block getBlockById(final int lllllllllllllIlIlIIIlIllIllllIll) {
        return Block.blockRegistry.getObjectById(lllllllllllllIlIlIIIlIllIllllIll);
    }
    
    private static int lIllIIllllIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean canReplace(final World lllllllllllllIlIlIIIlIIllIlIllll, final BlockPos lllllllllllllIlIlIIIlIIllIlIlllI, final EnumFacing lllllllllllllIlIlIIIlIIllIlIlIII, final ItemStack lllllllllllllIlIlIIIlIIllIlIllII) {
        return this.canPlaceBlockOnSide(lllllllllllllIlIlIIIlIIllIlIllll, lllllllllllllIlIlIIIlIIllIlIlllI, lllllllllllllIlIlIIIlIIllIlIlIII);
    }
    
    private static boolean lIllIIlllIlIlIl(final Object lllllllllllllIlIlIIIIlllllllIIII) {
        return lllllllllllllIlIlIIIIlllllllIIII != null;
    }
    
    protected ItemStack createStackedBlock(final IBlockState lllllllllllllIlIlIIIlIIlIIIlllll) {
        int lllllllllllllIlIlIIIlIIlIIIllllI = Block.lIIIIIIIllllll[0];
        final Item lllllllllllllIlIlIIIlIIlIIIlllIl = Item.getItemFromBlock(this);
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIlIIIlllIl) && lIllIIlllIlIlII(lllllllllllllIlIlIIIlIIlIIIlllIl.getHasSubtypes() ? 1 : 0)) {
            lllllllllllllIlIlIIIlIIlIIIllllI = this.getMetaFromState(lllllllllllllIlIlIIIlIIlIIIlllll);
        }
        return new ItemStack(lllllllllllllIlIlIIIlIIlIIIlllIl, Block.lIIIIIIIllllll[1], lllllllllllllIlIlIIIlIIlIIIllllI);
    }
    
    public void updateTick(final World lllllllllllllIlIlIIIlIlIIllllIlI, final BlockPos lllllllllllllIlIlIIIlIlIIllllIIl, final IBlockState lllllllllllllIlIlIIIlIlIIllllIII, final Random lllllllllllllIlIlIIIlIlIIlllIlll) {
    }
    
    public boolean isPassable(final IBlockAccess lllllllllllllIlIlIIIlIllIIIIllIl, final BlockPos lllllllllllllIlIlIIIlIllIIIIllII) {
        int n;
        if (lIllIIlllIlIlII(this.blockMaterial.blocksMovement() ? 1 : 0)) {
            n = Block.lIIIIIIIllllll[0];
            "".length();
            if (null != null) {
                return ((0x18 ^ 0x41 ^ (0xA3 ^ 0xAD)) & (0x41 ^ 0x3 ^ (0xA7 ^ 0xB2) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Block.lIIIIIIIllllll[1];
        }
        return n != 0;
    }
    
    public int getStrongPower(final IBlockAccess lllllllllllllIlIlIIIlIIlIlIIIIII, final BlockPos lllllllllllllIlIlIIIlIIlIIllllll, final IBlockState lllllllllllllIlIlIIIlIIlIIlllllI, final EnumFacing lllllllllllllIlIlIIIlIIlIIllllIl) {
        return Block.lIIIIIIIllllll[0];
    }
    
    public int getLightOpacity() {
        return this.lightOpacity;
    }
    
    public int getRenderType() {
        return Block.lIIIIIIIllllll[3];
    }
    
    public boolean isCollidable() {
        return Block.lIIIIIIIllllll[1] != 0;
    }
    
    protected Block setResistance(final float lllllllllllllIlIlIIIlIllIIIlllII) {
        this.blockResistance = lllllllllllllIlIlIIIlIllIIIlllII * 3.0f;
        return this;
    }
    
    public void onBlockPlacedBy(final World lllllllllllllIlIlIIIlIIlIIIlIIII, final BlockPos lllllllllllllIlIlIIIlIIlIIIIllll, final IBlockState lllllllllllllIlIlIIIlIIlIIIIlllI, final EntityLivingBase lllllllllllllIlIlIIIlIIlIIIIllIl, final ItemStack lllllllllllllIlIlIIIlIIlIIIIllII) {
    }
    
    public int getBlockColor() {
        return Block.lIIIIIIIllllll[19];
    }
    
    public boolean canPlaceBlockOnSide(final World lllllllllllllIlIlIIIlIIllIIlllll, final BlockPos lllllllllllllIlIlIIIlIIllIIllllI, final EnumFacing lllllllllllllIlIlIIIlIIllIlIIIIl) {
        return this.canPlaceBlockAt(lllllllllllllIlIlIIIlIIllIIlllll, lllllllllllllIlIlIIIlIIllIIllllI);
    }
    
    public void getSubBlocks(final Item lllllllllllllIlIlIIIlIIIllIIlIII, final CreativeTabs lllllllllllllIlIlIIIlIIIllIIlIlI, final List<ItemStack> lllllllllllllIlIlIIIlIIIllIIIlll) {
        lllllllllllllIlIlIIIlIIIllIIIlll.add(new ItemStack(lllllllllllllIlIlIIIlIIIllIIlIII, Block.lIIIIIIIllllll[1], Block.lIIIIIIIllllll[0]));
        "".length();
    }
    
    public void onBlockHarvested(final World lllllllllllllIlIlIIIlIIIlIllllII, final BlockPos lllllllllllllIlIlIIIlIIIlIlllIll, final IBlockState lllllllllllllIlIlIIIlIIIlIlllIlI, final EntityPlayer lllllllllllllIlIlIIIlIIIlIlllIIl) {
    }
    
    private static int lIllIIlllIlllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public final double getBlockBoundsMaxY() {
        return this.maxY;
    }
    
    public static void registerBlocks() {
        registerBlock(Block.lIIIIIIIllllll[0], Block.AIR_ID, new BlockAir().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[24]]));
        registerBlock(Block.lIIIIIIIllllll[1], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[25]], new BlockStone().setHardness(1.5f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[26]]));
        registerBlock(Block.lIIIIIIIllllll[2], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[27]], new BlockGrass().setHardness(0.6f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[28]]));
        registerBlock(Block.lIIIIIIIllllll[3], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[29]], new BlockDirt().setHardness(0.5f).setStepSound(Block.soundTypeGravel).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[30]]));
        final Block lllllllllllllIlIlIIIlIIIIlllIlIl = new Block(Material.rock).setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[31]]).setCreativeTab(CreativeTabs.tabBlock);
        registerBlock(Block.lIIIIIIIllllll[4], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[32]], lllllllllllllIlIlIIIlIIIIlllIlIl);
        final Block lllllllllllllIlIlIIIlIIIIlllIlII = new BlockPlanks().setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[33]]);
        registerBlock(Block.lIIIIIIIllllll[5], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[34]], lllllllllllllIlIlIIIlIIIIlllIlII);
        registerBlock(Block.lIIIIIIIllllll[6], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[35]], new BlockSapling().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[36]]));
        registerBlock(Block.lIIIIIIIllllll[7], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[37]], new Block(Material.rock).setBlockUnbreakable().setResistance(6000000.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[38]]).disableStats().setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[8], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[39]], new BlockDynamicLiquid(Material.water).setHardness(100.0f).setLightOpacity(Block.lIIIIIIIllllll[3]).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[40]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[9], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[41]], new BlockStaticLiquid(Material.water).setHardness(100.0f).setLightOpacity(Block.lIIIIIIIllllll[3]).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[42]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[10], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[43]], new BlockDynamicLiquid(Material.lava).setHardness(100.0f).setLightLevel(1.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[44]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[11], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[45]], new BlockStaticLiquid(Material.lava).setHardness(100.0f).setLightLevel(1.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[46]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[12], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[47]], new BlockSand().setHardness(0.5f).setStepSound(Block.soundTypeSand).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[48]]));
        registerBlock(Block.lIIIIIIIllllll[13], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[49]], new BlockGravel().setHardness(0.6f).setStepSound(Block.soundTypeGravel).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[50]]));
        registerBlock(Block.lIIIIIIIllllll[16], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[51]], new BlockOre().setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[52]]));
        registerBlock(Block.lIIIIIIIllllll[15], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[53]], new BlockOre().setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[54]]));
        registerBlock(Block.lIIIIIIIllllll[18], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[55]], new BlockOre().setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[56]]));
        registerBlock(Block.lIIIIIIIllllll[20], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[57]], new BlockOldLog().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[58]]));
        registerBlock(Block.lIIIIIIIllllll[21], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[59]], new BlockOldLeaf().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[60]]));
        registerBlock(Block.lIIIIIIIllllll[22], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[61]], new BlockSponge().setHardness(0.6f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[62]]));
        registerBlock(Block.lIIIIIIIllllll[23], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[63]], new BlockGlass(Material.glass, (boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(0.3f).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[64]]));
        registerBlock(Block.lIIIIIIIllllll[24], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[65]], new BlockOre().setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[66]]));
        registerBlock(Block.lIIIIIIIllllll[25], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[67]], new Block(Material.iron, MapColor.lapisColor).setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[68]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[26], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[69]], new BlockDispenser().setHardness(3.5f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[70]]));
        final Block lllllllllllllIlIlIIIlIIIIlllIIll = new BlockSandStone().setStepSound(Block.soundTypePiston).setHardness(0.8f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[71]]);
        registerBlock(Block.lIIIIIIIllllll[27], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[72]], lllllllllllllIlIlIIIlIIIIlllIIll);
        registerBlock(Block.lIIIIIIIllllll[28], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[73]], new BlockNote().setHardness(0.8f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[74]]));
        registerBlock(Block.lIIIIIIIllllll[29], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[75]], new BlockBed().setStepSound(Block.soundTypeWood).setHardness(0.2f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[76]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[30], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[77]], new BlockRailPowered().setHardness(0.7f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[78]]));
        registerBlock(Block.lIIIIIIIllllll[31], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[79]], new BlockRailDetector().setHardness(0.7f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[80]]));
        registerBlock(Block.lIIIIIIIllllll[32], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[81]], new BlockPistonBase((boolean)(Block.lIIIIIIIllllll[1] != 0)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[82]]));
        registerBlock(Block.lIIIIIIIllllll[33], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[83]], new BlockWeb().setLightOpacity(Block.lIIIIIIIllllll[1]).setHardness(4.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[84]]));
        registerBlock(Block.lIIIIIIIllllll[34], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[85]], new BlockTallGrass().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[86]]));
        registerBlock(Block.lIIIIIIIllllll[35], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[87]], new BlockDeadBush().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[88]]));
        registerBlock(Block.lIIIIIIIllllll[36], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[89]], new BlockPistonBase((boolean)(Block.lIIIIIIIllllll[0] != 0)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[90]]));
        registerBlock(Block.lIIIIIIIllllll[37], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[91]], new BlockPistonExtension().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[92]]));
        registerBlock(Block.lIIIIIIIllllll[38], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[93]], new BlockColored(Material.cloth).setHardness(0.8f).setStepSound(Block.soundTypeCloth).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[94]]));
        registerBlock(Block.lIIIIIIIllllll[39], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[95]], new BlockPistonMoving());
        registerBlock(Block.lIIIIIIIllllll[40], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[96]], new BlockYellowFlower().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[97]]));
        registerBlock(Block.lIIIIIIIllllll[41], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[98]], new BlockRedFlower().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[99]]));
        final Block lllllllllllllIlIlIIIlIIIIlllIIlI = new BlockMushroom().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setLightLevel(0.125f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[100]]);
        registerBlock(Block.lIIIIIIIllllll[42], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[101]], lllllllllllllIlIlIIIlIIIIlllIIlI);
        final Block lllllllllllllIlIlIIIlIIIIlllIIIl = new BlockMushroom().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[102]]);
        registerBlock(Block.lIIIIIIIllllll[43], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[103]], lllllllllllllIlIlIIIlIIIIlllIIIl);
        registerBlock(Block.lIIIIIIIllllll[44], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[104]], new Block(Material.iron, MapColor.goldColor).setHardness(3.0f).setResistance(10.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[105]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[45], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[106]], new Block(Material.iron, MapColor.ironColor).setHardness(5.0f).setResistance(10.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[107]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[46], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[108]], new BlockDoubleStoneSlab().setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[109]]));
        registerBlock(Block.lIIIIIIIllllll[47], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[110]], new BlockHalfStoneSlab().setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[111]]));
        final Block lllllllllllllIlIlIIIlIIIIlllIIII = new Block(Material.rock, MapColor.redColor).setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[112]]).setCreativeTab(CreativeTabs.tabBlock);
        registerBlock(Block.lIIIIIIIllllll[48], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[113]], lllllllllllllIlIlIIIlIIIIlllIIII);
        registerBlock(Block.lIIIIIIIllllll[49], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[114]], new BlockTNT().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[115]]));
        registerBlock(Block.lIIIIIIIllllll[50], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[116]], new BlockBookshelf().setHardness(1.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[117]]));
        registerBlock(Block.lIIIIIIIllllll[51], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[118]], new Block(Material.rock).setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[119]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[52], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[120]], new BlockObsidian().setHardness(50.0f).setResistance(2000.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[121]]));
        registerBlock(Block.lIIIIIIIllllll[53], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[122]], new BlockTorch().setHardness(0.0f).setLightLevel(0.9375f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[123]]));
        registerBlock(Block.lIIIIIIIllllll[54], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[124]], new BlockFire().setHardness(0.0f).setLightLevel(1.0f).setStepSound(Block.soundTypeCloth).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[125]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[55], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[126]], new BlockMobSpawner().setHardness(5.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[127]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[56], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[128]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIlII.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.OAK)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[129]]));
        registerBlock(Block.lIIIIIIIllllll[57], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[130]], new BlockChest(Block.lIIIIIIIllllll[0]).setHardness(2.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[131]]));
        registerBlock(Block.lIIIIIIIllllll[58], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[132]], new BlockRedstoneWire().setHardness(0.0f).setStepSound(Block.soundTypeStone).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[133]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[59], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[134]], new BlockOre().setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[135]]));
        registerBlock(Block.lIIIIIIIllllll[60], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[136]], new Block(Material.iron, MapColor.diamondColor).setHardness(5.0f).setResistance(10.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[137]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[61], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[138]], new BlockWorkbench().setHardness(2.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[139]]));
        registerBlock(Block.lIIIIIIIllllll[62], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[140]], new BlockCrops().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[141]]));
        final Block lllllllllllllIlIlIIIlIIIIllIllll = new BlockFarmland().setHardness(0.6f).setStepSound(Block.soundTypeGravel).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[142]]);
        registerBlock(Block.lIIIIIIIllllll[63], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[143]], lllllllllllllIlIlIIIlIIIIllIllll);
        registerBlock(Block.lIIIIIIIllllll[64], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[144]], new BlockFurnace((boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(3.5f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[145]]).setCreativeTab(CreativeTabs.tabDecorations));
        registerBlock(Block.lIIIIIIIllllll[65], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[146]], new BlockFurnace((boolean)(Block.lIIIIIIIllllll[1] != 0)).setHardness(3.5f).setStepSound(Block.soundTypePiston).setLightLevel(0.875f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[147]]));
        registerBlock(Block.lIIIIIIIllllll[66], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[148]], new BlockStandingSign().setHardness(1.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[149]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[67], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[150]], new BlockDoor(Material.wood).setHardness(3.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[151]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[68], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[152]], new BlockLadder().setHardness(0.4f).setStepSound(Block.soundTypeLadder).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[153]]));
        registerBlock(Block.lIIIIIIIllllll[69], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[154]], new BlockRail().setHardness(0.7f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[155]]));
        registerBlock(Block.lIIIIIIIllllll[70], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[156]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIlIl.getDefaultState()).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[157]]));
        registerBlock(Block.lIIIIIIIllllll[71], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[158]], new BlockWallSign().setHardness(1.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[159]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[72], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[160]], new BlockLever().setHardness(0.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[161]]));
        registerBlock(Block.lIIIIIIIllllll[73], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[162]], new BlockPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.MOBS).setHardness(0.5f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[163]]));
        registerBlock(Block.lIIIIIIIllllll[74], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[164]], new BlockDoor(Material.iron).setHardness(5.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[165]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[75], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[166]], new BlockPressurePlate(Material.wood, BlockPressurePlate.Sensitivity.EVERYTHING).setHardness(0.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[167]]));
        registerBlock(Block.lIIIIIIIllllll[76], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[168]], new BlockRedstoneOre((boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[169]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[77], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[170]], new BlockRedstoneOre((boolean)(Block.lIIIIIIIllllll[1] != 0)).setLightLevel(0.625f).setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[171]]));
        registerBlock(Block.lIIIIIIIllllll[78], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[172]], new BlockRedstoneTorch((boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(0.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[173]]));
        registerBlock(Block.lIIIIIIIllllll[79], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[174]], new BlockRedstoneTorch((boolean)(Block.lIIIIIIIllllll[1] != 0)).setHardness(0.0f).setLightLevel(0.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[175]]).setCreativeTab(CreativeTabs.tabRedstone));
        registerBlock(Block.lIIIIIIIllllll[80], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[176]], new BlockButtonStone().setHardness(0.5f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[177]]));
        registerBlock(Block.lIIIIIIIllllll[81], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[178]], new BlockSnow().setHardness(0.1f).setStepSound(Block.soundTypeSnow).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[179]]).setLightOpacity(Block.lIIIIIIIllllll[0]));
        registerBlock(Block.lIIIIIIIllllll[82], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[180]], new BlockIce().setHardness(0.5f).setLightOpacity(Block.lIIIIIIIllllll[3]).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[181]]));
        registerBlock(Block.lIIIIIIIllllll[83], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[182]], new BlockSnowBlock().setHardness(0.2f).setStepSound(Block.soundTypeSnow).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[183]]));
        registerBlock(Block.lIIIIIIIllllll[84], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[184]], new BlockCactus().setHardness(0.4f).setStepSound(Block.soundTypeCloth).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[185]]));
        registerBlock(Block.lIIIIIIIllllll[85], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[186]], new BlockClay().setHardness(0.6f).setStepSound(Block.soundTypeGravel).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[187]]));
        registerBlock(Block.lIIIIIIIllllll[86], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[188]], new BlockReed().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[189]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[87], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[190]], new BlockJukebox().setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[191]]));
        registerBlock(Block.lIIIIIIIllllll[88], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[192]], new BlockFence(Material.wood, BlockPlanks.EnumType.OAK.func_181070_c()).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[193]]));
        final Block lllllllllllllIlIlIIIlIIIIllIlllI = new BlockPumpkin().setHardness(1.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[194]]);
        registerBlock(Block.lIIIIIIIllllll[89], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[195]], lllllllllllllIlIlIIIlIIIIllIlllI);
        registerBlock(Block.lIIIIIIIllllll[90], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[196]], new BlockNetherrack().setHardness(0.4f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[197]]));
        registerBlock(Block.lIIIIIIIllllll[91], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[198]], new BlockSoulSand().setHardness(0.5f).setStepSound(Block.soundTypeSand).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[199]]));
        registerBlock(Block.lIIIIIIIllllll[92], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[200]], new BlockGlowstone(Material.glass).setHardness(0.3f).setStepSound(Block.soundTypeGlass).setLightLevel(1.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[201]]));
        registerBlock(Block.lIIIIIIIllllll[93], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[202]], new BlockPortal().setHardness(-1.0f).setStepSound(Block.soundTypeGlass).setLightLevel(0.75f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[203]]));
        registerBlock(Block.lIIIIIIIllllll[94], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[204]], new BlockPumpkin().setHardness(1.0f).setStepSound(Block.soundTypeWood).setLightLevel(1.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[205]]));
        registerBlock(Block.lIIIIIIIllllll[95], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[206]], new BlockCake().setHardness(0.5f).setStepSound(Block.soundTypeCloth).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[207]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[96], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[208]], new BlockRedstoneRepeater((boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(0.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[209]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[97], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[210]], new BlockRedstoneRepeater((boolean)(Block.lIIIIIIIllllll[1] != 0)).setHardness(0.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[211]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[98], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[212]], new BlockStainedGlass(Material.glass).setHardness(0.3f).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[213]]));
        registerBlock(Block.lIIIIIIIllllll[99], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[214]], new BlockTrapDoor(Material.wood).setHardness(3.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[215]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[100], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[216]], new BlockSilverfish().setHardness(0.75f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[217]]));
        final Block lllllllllllllIlIlIIIlIIIIllIllIl = new BlockStoneBrick().setHardness(1.5f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[218]]);
        registerBlock(Block.lIIIIIIIllllll[101], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[219]], lllllllllllllIlIlIIIlIIIIllIllIl);
        registerBlock(Block.lIIIIIIIllllll[102], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[220]], new BlockHugeMushroom(Material.wood, MapColor.dirtColor, lllllllllllllIlIlIIIlIIIIlllIIlI).setHardness(0.2f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[221]]));
        registerBlock(Block.lIIIIIIIllllll[103], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[222]], new BlockHugeMushroom(Material.wood, MapColor.redColor, lllllllllllllIlIlIIIlIIIIlllIIIl).setHardness(0.2f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[223]]));
        registerBlock(Block.lIIIIIIIllllll[104], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[224]], new BlockPane(Material.iron, (boolean)(Block.lIIIIIIIllllll[1] != 0)).setHardness(5.0f).setResistance(10.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[225]]));
        registerBlock(Block.lIIIIIIIllllll[105], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[226]], new BlockPane(Material.glass, (boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(0.3f).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[227]]));
        final Block lllllllllllllIlIlIIIlIIIIllIllII = new BlockMelon().setHardness(1.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[228]]);
        registerBlock(Block.lIIIIIIIllllll[106], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[229]], lllllllllllllIlIlIIIlIIIIllIllII);
        registerBlock(Block.lIIIIIIIllllll[107], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[230]], new BlockStem(lllllllllllllIlIlIIIlIIIIllIlllI).setHardness(0.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[231]]));
        registerBlock(Block.lIIIIIIIllllll[108], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[232]], new BlockStem(lllllllllllllIlIlIIIlIIIIllIllII).setHardness(0.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[233]]));
        registerBlock(Block.lIIIIIIIllllll[109], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[234]], new BlockVine().setHardness(0.2f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[235]]));
        registerBlock(Block.lIIIIIIIllllll[110], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[236]], new BlockFenceGate(BlockPlanks.EnumType.OAK).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[237]]));
        registerBlock(Block.lIIIIIIIllllll[111], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[238]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIIII.getDefaultState()).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[239]]));
        registerBlock(Block.lIIIIIIIllllll[112], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[240]], new BlockStairs(lllllllllllllIlIlIIIlIIIIllIllIl.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.DEFAULT)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[241]]));
        registerBlock(Block.lIIIIIIIllllll[113], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[242]], new BlockMycelium().setHardness(0.6f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[243]]));
        registerBlock(Block.lIIIIIIIllllll[114], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[244]], new BlockLilyPad().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[245]]));
        final Block lllllllllllllIlIlIIIlIIIIllIlIll = new BlockNetherBrick().setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[246]]).setCreativeTab(CreativeTabs.tabBlock);
        registerBlock(Block.lIIIIIIIllllll[115], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[247]], lllllllllllllIlIlIIIlIIIIllIlIll);
        registerBlock(Block.lIIIIIIIllllll[116], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[248]], new BlockFence(Material.rock, MapColor.netherrackColor).setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[249]]));
        registerBlock(Block.lIIIIIIIllllll[117], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[250]], new BlockStairs(lllllllllllllIlIlIIIlIIIIllIlIll.getDefaultState()).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[251]]));
        registerBlock(Block.lIIIIIIIllllll[118], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[252]], new BlockNetherWart().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[253]]));
        registerBlock(Block.lIIIIIIIllllll[119], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[254]], new BlockEnchantmentTable().setHardness(5.0f).setResistance(2000.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[255]]));
        registerBlock(Block.lIIIIIIIllllll[120], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[256]], new BlockBrewingStand().setHardness(0.5f).setLightLevel(0.125f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[257]]));
        registerBlock(Block.lIIIIIIIllllll[121], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[17]], new BlockCauldron().setHardness(2.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[258]]));
        registerBlock(Block.lIIIIIIIllllll[122], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[259]], new BlockEndPortal(Material.portal).setHardness(-1.0f).setResistance(6000000.0f));
        registerBlock(Block.lIIIIIIIllllll[123], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[260]], new BlockEndPortalFrame().setStepSound(Block.soundTypeGlass).setLightLevel(0.125f).setHardness(-1.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[261]]).setResistance(6000000.0f).setCreativeTab(CreativeTabs.tabDecorations));
        registerBlock(Block.lIIIIIIIllllll[124], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[262]], new Block(Material.rock, MapColor.sandColor).setHardness(3.0f).setResistance(15.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[263]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[125], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[264]], new BlockDragonEgg().setHardness(3.0f).setResistance(15.0f).setStepSound(Block.soundTypePiston).setLightLevel(0.125f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[265]]));
        registerBlock(Block.lIIIIIIIllllll[126], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[266]], new BlockRedstoneLight((boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(0.3f).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[267]]).setCreativeTab(CreativeTabs.tabRedstone));
        registerBlock(Block.lIIIIIIIllllll[127], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[268]], new BlockRedstoneLight((boolean)(Block.lIIIIIIIllllll[1] != 0)).setHardness(0.3f).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[269]]));
        registerBlock(Block.lIIIIIIIllllll[128], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[270]], new BlockDoubleWoodSlab().setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[271]]));
        registerBlock(Block.lIIIIIIIllllll[129], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[272]], new BlockHalfWoodSlab().setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[273]]));
        registerBlock(Block.lIIIIIIIllllll[130], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[274]], new BlockCocoa().setHardness(0.2f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[275]]));
        registerBlock(Block.lIIIIIIIllllll[131], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[276]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIIll.getDefaultState().withProperty(BlockSandStone.TYPE, BlockSandStone.EnumType.SMOOTH)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[277]]));
        registerBlock(Block.lIIIIIIIllllll[132], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[278]], new BlockOre().setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[279]]));
        registerBlock(Block.lIIIIIIIllllll[133], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[280]], new BlockEnderChest().setHardness(22.5f).setResistance(1000.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[281]]).setLightLevel(0.5f));
        registerBlock(Block.lIIIIIIIllllll[134], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[282]], new BlockTripWireHook().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[283]]));
        registerBlock(Block.lIIIIIIIllllll[135], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[284]], new BlockTripWire().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[285]]));
        registerBlock(Block.lIIIIIIIllllll[136], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[286]], new Block(Material.iron, MapColor.emeraldColor).setHardness(5.0f).setResistance(10.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[287]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[137], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[288]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIlII.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.SPRUCE)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[289]]));
        registerBlock(Block.lIIIIIIIllllll[138], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[290]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIlII.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.BIRCH)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[291]]));
        registerBlock(Block.lIIIIIIIllllll[139], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[292]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIlII.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.JUNGLE)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[293]]));
        registerBlock(Block.lIIIIIIIllllll[140], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[294]], new BlockCommandBlock().setBlockUnbreakable().setResistance(6000000.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[295]]));
        registerBlock(Block.lIIIIIIIllllll[141], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[296]], new BlockBeacon().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[297]]).setLightLevel(1.0f));
        registerBlock(Block.lIIIIIIIllllll[142], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[298]], new BlockWall(lllllllllllllIlIlIIIlIIIIlllIlIl).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[299]]));
        registerBlock(Block.lIIIIIIIllllll[143], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[300]], new BlockFlowerPot().setHardness(0.0f).setStepSound(Block.soundTypeStone).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[301]]));
        registerBlock(Block.lIIIIIIIllllll[144], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[302]], new BlockCarrot().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[303]]));
        registerBlock(Block.lIIIIIIIllllll[145], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[304]], new BlockPotato().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[305]]));
        registerBlock(Block.lIIIIIIIllllll[146], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[306]], new BlockButtonWood().setHardness(0.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[307]]));
        registerBlock(Block.lIIIIIIIllllll[147], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[308]], new BlockSkull().setHardness(1.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[309]]));
        registerBlock(Block.lIIIIIIIllllll[148], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[310]], new BlockAnvil().setHardness(5.0f).setStepSound(Block.soundTypeAnvil).setResistance(2000.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[311]]));
        registerBlock(Block.lIIIIIIIllllll[149], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[312]], new BlockChest(Block.lIIIIIIIllllll[1]).setHardness(2.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[313]]));
        registerBlock(Block.lIIIIIIIllllll[150], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[314]], new BlockPressurePlateWeighted(Material.iron, Block.lIIIIIIIllllll[15], MapColor.goldColor).setHardness(0.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[315]]));
        registerBlock(Block.lIIIIIIIllllll[151], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[316]], new BlockPressurePlateWeighted(Material.iron, Block.lIIIIIIIllllll[153]).setHardness(0.5f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[317]]));
        registerBlock(Block.lIIIIIIIllllll[152], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[318]], new BlockRedstoneComparator((boolean)(Block.lIIIIIIIllllll[0] != 0)).setHardness(0.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[319]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[153], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[320]], new BlockRedstoneComparator((boolean)(Block.lIIIIIIIllllll[1] != 0)).setHardness(0.0f).setLightLevel(0.625f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[321]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[154], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[322]], new BlockDaylightDetector((boolean)(Block.lIIIIIIIllllll[0] != 0)));
        registerBlock(Block.lIIIIIIIllllll[155], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[323]], new BlockCompressedPowered(Material.iron, MapColor.tntColor).setHardness(5.0f).setResistance(10.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[324]]).setCreativeTab(CreativeTabs.tabRedstone));
        registerBlock(Block.lIIIIIIIllllll[156], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[325]], new BlockOre(MapColor.netherrackColor).setHardness(3.0f).setResistance(5.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[326]]));
        registerBlock(Block.lIIIIIIIllllll[157], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[327]], new BlockHopper().setHardness(3.0f).setResistance(8.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[328]]));
        final Block lllllllllllllIlIlIIIlIIIIllIlIlI = new BlockQuartz().setStepSound(Block.soundTypePiston).setHardness(0.8f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[329]]);
        registerBlock(Block.lIIIIIIIllllll[158], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[330]], lllllllllllllIlIlIIIlIIIIllIlIlI);
        registerBlock(Block.lIIIIIIIllllll[159], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[331]], new BlockStairs(lllllllllllllIlIlIIIlIIIIllIlIlI.getDefaultState().withProperty(BlockQuartz.VARIANT, BlockQuartz.EnumType.DEFAULT)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[332]]));
        registerBlock(Block.lIIIIIIIllllll[160], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[333]], new BlockRailPowered().setHardness(0.7f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[334]]));
        registerBlock(Block.lIIIIIIIllllll[161], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[335]], new BlockDropper().setHardness(3.5f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[336]]));
        registerBlock(Block.lIIIIIIIllllll[162], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[337]], new BlockColored(Material.rock).setHardness(1.25f).setResistance(7.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[338]]));
        registerBlock(Block.lIIIIIIIllllll[163], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[339]], new BlockStainedGlassPane().setHardness(0.3f).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[340]]));
        registerBlock(Block.lIIIIIIIllllll[164], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[341]], new BlockNewLeaf().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[342]]));
        registerBlock(Block.lIIIIIIIllllll[165], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[343]], new BlockNewLog().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[344]]));
        registerBlock(Block.lIIIIIIIllllll[166], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[345]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIlII.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.ACACIA)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[346]]));
        registerBlock(Block.lIIIIIIIllllll[167], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[347]], new BlockStairs(lllllllllllllIlIlIIIlIIIIlllIlII.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.DARK_OAK)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[348]]));
        registerBlock(Block.lIIIIIIIllllll[168], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[349]], new BlockSlime().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[350]]).setStepSound(Block.SLIME_SOUND));
        registerBlock(Block.lIIIIIIIllllll[169], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[351]], new BlockBarrier().setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[352]]));
        registerBlock(Block.lIIIIIIIllllll[170], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[353]], new BlockTrapDoor(Material.iron).setHardness(5.0f).setStepSound(Block.soundTypeMetal).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[354]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[171], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[355]], new BlockPrismarine().setHardness(1.5f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[356]]));
        registerBlock(Block.lIIIIIIIllllll[172], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[357]], new BlockSeaLantern(Material.glass).setHardness(0.3f).setStepSound(Block.soundTypeGlass).setLightLevel(1.0f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[358]]));
        registerBlock(Block.lIIIIIIIllllll[173], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[359]], new BlockHay().setHardness(0.5f).setStepSound(Block.soundTypeGrass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[360]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[174], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[361]], new BlockCarpet().setHardness(0.1f).setStepSound(Block.soundTypeCloth).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[362]]).setLightOpacity(Block.lIIIIIIIllllll[0]));
        registerBlock(Block.lIIIIIIIllllll[175], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[363]], new BlockHardenedClay().setHardness(1.25f).setResistance(7.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[364]]));
        registerBlock(Block.lIIIIIIIllllll[176], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[365]], new Block(Material.rock, MapColor.blackColor).setHardness(5.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[366]]).setCreativeTab(CreativeTabs.tabBlock));
        registerBlock(Block.lIIIIIIIllllll[177], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[367]], new BlockPackedIce().setHardness(0.5f).setStepSound(Block.soundTypeGlass).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[368]]));
        registerBlock(Block.lIIIIIIIllllll[178], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[369]], new BlockDoublePlant());
        registerBlock(Block.lIIIIIIIllllll[179], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[370]], new BlockBanner.BlockBannerStanding().setHardness(1.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[371]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[180], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[372]], new BlockBanner.BlockBannerHanging().setHardness(1.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[373]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[181], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[374]], new BlockDaylightDetector((boolean)(Block.lIIIIIIIllllll[1] != 0)));
        final Block lllllllllllllIlIlIIIlIIIIllIlIIl = new BlockRedSandstone().setStepSound(Block.soundTypePiston).setHardness(0.8f).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[375]]);
        registerBlock(Block.lIIIIIIIllllll[182], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[376]], lllllllllllllIlIlIIIlIIIIllIlIIl);
        registerBlock(Block.lIIIIIIIllllll[183], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[377]], new BlockStairs(lllllllllllllIlIlIIIlIIIIllIlIIl.getDefaultState().withProperty(BlockRedSandstone.TYPE, BlockRedSandstone.EnumType.SMOOTH)).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[378]]));
        registerBlock(Block.lIIIIIIIllllll[184], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[379]], new BlockDoubleStoneSlabNew().setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[380]]));
        registerBlock(Block.lIIIIIIIllllll[185], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[381]], new BlockHalfStoneSlabNew().setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypePiston).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[382]]));
        registerBlock(Block.lIIIIIIIllllll[186], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[383]], new BlockFenceGate(BlockPlanks.EnumType.SPRUCE).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[384]]));
        registerBlock(Block.lIIIIIIIllllll[187], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[385]], new BlockFenceGate(BlockPlanks.EnumType.BIRCH).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[386]]));
        registerBlock(Block.lIIIIIIIllllll[188], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[387]], new BlockFenceGate(BlockPlanks.EnumType.JUNGLE).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[388]]));
        registerBlock(Block.lIIIIIIIllllll[189], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[389]], new BlockFenceGate(BlockPlanks.EnumType.DARK_OAK).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[390]]));
        registerBlock(Block.lIIIIIIIllllll[190], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[391]], new BlockFenceGate(BlockPlanks.EnumType.ACACIA).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[392]]));
        registerBlock(Block.lIIIIIIIllllll[191], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[393]], new BlockFence(Material.wood, BlockPlanks.EnumType.SPRUCE.func_181070_c()).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[394]]));
        registerBlock(Block.lIIIIIIIllllll[192], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[395]], new BlockFence(Material.wood, BlockPlanks.EnumType.BIRCH.func_181070_c()).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[396]]));
        registerBlock(Block.lIIIIIIIllllll[193], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[397]], new BlockFence(Material.wood, BlockPlanks.EnumType.JUNGLE.func_181070_c()).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[398]]));
        registerBlock(Block.lIIIIIIIllllll[194], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[399]], new BlockFence(Material.wood, BlockPlanks.EnumType.DARK_OAK.func_181070_c()).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[400]]));
        registerBlock(Block.lIIIIIIIllllll[195], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[401]], new BlockFence(Material.wood, BlockPlanks.EnumType.ACACIA.func_181070_c()).setHardness(2.0f).setResistance(5.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[402]]));
        registerBlock(Block.lIIIIIIIllllll[196], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[403]], new BlockDoor(Material.wood).setHardness(3.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[404]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[197], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[405]], new BlockDoor(Material.wood).setHardness(3.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[406]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[198], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[407]], new BlockDoor(Material.wood).setHardness(3.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[408]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[199], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[409]], new BlockDoor(Material.wood).setHardness(3.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[410]]).disableStats());
        registerBlock(Block.lIIIIIIIllllll[200], Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[411]], new BlockDoor(Material.wood).setHardness(3.0f).setStepSound(Block.soundTypeWood).setUnlocalizedName(Block.lIIIIIIIlllIII[Block.lIIIIIIIllllll[412]]).disableStats());
        Block.blockRegistry.validateKey();
        String lllllllllllllIlIlIIIlIIIIlIlIIII = (String)Block.blockRegistry.iterator();
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lIllIIlllIlIllI(((Iterator)lllllllllllllIlIlIIIlIIIIlIlIIII).hasNext() ? 1 : 0)) {
            final Block lllllllllllllIlIlIIIlIIIIllIlIII = ((Iterator<Block>)lllllllllllllIlIlIIIlIIIIlIlIIII).next();
            if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIIIllIlIII.blockMaterial, Material.air)) {
                lllllllllllllIlIlIIIlIIIIllIlIII.useNeighborBrightness = (Block.lIIIIIIIllllll[0] != 0);
                "".length();
                if ((0x0 ^ 0x4) <= 0) {
                    return;
                }
                continue;
            }
            else {
                boolean lllllllllllllIlIlIIIlIIIIllIIlll = Block.lIIIIIIIllllll[0] != 0;
                final boolean lllllllllllllIlIlIIIlIIIIllIIllI = lllllllllllllIlIlIIIlIIIIllIlIII instanceof BlockStairs;
                final boolean lllllllllllllIlIlIIIlIIIIllIIlIl = lllllllllllllIlIlIIIlIIIIllIlIII instanceof BlockSlab;
                int n;
                if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIIIllIlIII, lllllllllllllIlIlIIIlIIIIllIllll)) {
                    n = Block.lIIIIIIIllllll[1];
                    "".length();
                    if ((143 + 158 - 283 + 146 ^ 102 + 85 - 154 + 127) == -" ".length()) {
                        return;
                    }
                }
                else {
                    n = Block.lIIIIIIIllllll[0];
                }
                final boolean lllllllllllllIlIlIIIlIIIIllIIlII = n != 0;
                final boolean lllllllllllllIlIlIIIlIIIIllIIIll = lllllllllllllIlIlIIIlIIIIllIlIII.translucent;
                int n2;
                if (lIllIIlllIlIllI(lllllllllllllIlIlIIIlIIIIllIlIII.lightOpacity)) {
                    n2 = Block.lIIIIIIIllllll[1];
                    "".length();
                    if (-" ".length() >= ("   ".length() & ("   ".length() ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    n2 = Block.lIIIIIIIllllll[0];
                }
                final boolean lllllllllllllIlIlIIIlIIIIllIIIlI = n2 != 0;
                if (!lIllIIlllIlIllI(lllllllllllllIlIlIIIlIIIIllIIllI ? 1 : 0) || !lIllIIlllIlIllI(lllllllllllllIlIlIIIlIIIIllIIlIl ? 1 : 0) || !lIllIIlllIlIllI(lllllllllllllIlIlIIIlIIIIllIIlII ? 1 : 0) || !lIllIIlllIlIllI(lllllllllllllIlIlIIIlIIIIllIIIll ? 1 : 0) || lIllIIlllIlIlII(lllllllllllllIlIlIIIlIIIIllIIIlI ? 1 : 0)) {
                    lllllllllllllIlIlIIIlIIIIllIIlll = (Block.lIIIIIIIllllll[1] != 0);
                }
                lllllllllllllIlIlIIIlIIIIllIlIII.useNeighborBrightness = lllllllllllllIlIlIIIlIIIIllIIlll;
            }
        }
        lllllllllllllIlIlIIIlIIIIlIlIIII = (String)Block.blockRegistry.iterator();
        "".length();
        if (((0x91 ^ 0x97) & ~(0xA6 ^ 0xA0)) > (0x22 ^ 0x26)) {
            return;
        }
        while (!lIllIIlllIlIllI(((Iterator)lllllllllllllIlIlIIIlIIIIlIlIIII).hasNext() ? 1 : 0)) {
            final Block lllllllllllllIlIlIIIlIIIIllIIIIl = ((Iterator<Block>)lllllllllllllIlIlIIIlIIIIlIlIIII).next();
            final char lllllllllllllIlIlIIIlIIIIlIIlllI = (char)lllllllllllllIlIlIIIlIIIIllIIIIl.getBlockState().getValidStates().iterator();
            "".length();
            if ("  ".length() < 0) {
                return;
            }
            while (!lIllIIlllIlIllI(((Iterator)lllllllllllllIlIlIIIlIIIIlIIlllI).hasNext() ? 1 : 0)) {
                final IBlockState lllllllllllllIlIlIIIlIIIIllIIIII = ((Iterator<IBlockState>)lllllllllllllIlIlIIIlIIIIlIIlllI).next();
                final int lllllllllllllIlIlIIIlIIIIlIlllll = Block.blockRegistry.getIDForObject(lllllllllllllIlIlIIIlIIIIllIIIIl) << Block.lIIIIIIIllllll[4] | lllllllllllllIlIlIIIlIIIIllIIIIl.getMetaFromState(lllllllllllllIlIlIIIlIIIIllIIIII);
                Block.BLOCK_STATE_IDS.put(lllllllllllllIlIlIIIlIIIIllIIIII, lllllllllllllIlIlIIIlIIIIlIlllll);
            }
        }
    }
    
    public final IBlockState getDefaultState() {
        return this.defaultBlockState;
    }
    
    private static String lIllIIllIlIlIll(String lllllllllllllIlIlIIIlIIIIIIIIIlI, final String lllllllllllllIlIlIIIlIIIIIIIIIIl) {
        lllllllllllllIlIlIIIlIIIIIIIIIlI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIlIIIIIIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIlIIIIIIIIlIl = new StringBuilder();
        final char[] lllllllllllllIlIlIIIlIIIIIIIIlII = lllllllllllllIlIlIIIlIIIIIIIIIIl.toCharArray();
        int lllllllllllllIlIlIIIlIIIIIIIIIll = Block.lIIIIIIIllllll[0];
        final float lllllllllllllIlIlIIIIlllllllllIl = (Object)((String)lllllllllllllIlIlIIIlIIIIIIIIIlI).toCharArray();
        final double lllllllllllllIlIlIIIIlllllllllII = lllllllllllllIlIlIIIIlllllllllIl.length;
        Exception lllllllllllllIlIlIIIIllllllllIll = (Exception)Block.lIIIIIIIllllll[0];
        while (lIllIIllllIlllI((int)lllllllllllllIlIlIIIIllllllllIll, (int)lllllllllllllIlIlIIIIlllllllllII)) {
            final char lllllllllllllIlIlIIIlIIIIIIIlIII = lllllllllllllIlIlIIIIlllllllllIl[lllllllllllllIlIlIIIIllllllllIll];
            lllllllllllllIlIlIIIlIIIIIIIIlIl.append((char)(lllllllllllllIlIlIIIlIIIIIIIlIII ^ lllllllllllllIlIlIIIlIIIIIIIIlII[lllllllllllllIlIlIIIlIIIIIIIIIll % lllllllllllllIlIlIIIlIIIIIIIIlII.length]));
            "".length();
            ++lllllllllllllIlIlIIIlIIIIIIIIIll;
            ++lllllllllllllIlIlIIIIllllllllIll;
            "".length();
            if (" ".length() <= ((0x67 ^ 0x1B ^ (0xDC ^ 0xB3)) & (60 + 139 - 9 + 19 ^ 62 + 156 - 217 + 193 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIlIIIIIIIIlIl);
    }
    
    public static boolean isEqualTo(final Block lllllllllllllIlIlIIIlIIIlIlIIlll, final Block lllllllllllllIlIlIIIlIIIlIlIlIII) {
        int associatedBlock;
        if (lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIIlIlIIlll) && lIllIIlllIlIlIl(lllllllllllllIlIlIIIlIIIlIlIlIII)) {
            if (lIllIIlllIllIll(lllllllllllllIlIlIIIlIIIlIlIIlll, lllllllllllllIlIlIIIlIIIlIlIlIII)) {
                associatedBlock = Block.lIIIIIIIllllll[1];
                "".length();
                if ("   ".length() <= " ".length()) {
                    return ((0xA6 ^ 0xA3) & ~(0x5D ^ 0x58)) != 0x0;
                }
            }
            else {
                associatedBlock = (lllllllllllllIlIlIIIlIIIlIlIIlll.isAssociatedBlock(lllllllllllllIlIlIIIlIIIlIlIlIII) ? 1 : 0);
                "".length();
                if (-"  ".length() > 0) {
                    return ((61 + 108 - 86 + 73 ^ 96 + 142 - 178 + 104) & (0x1E ^ 0x19 ^ (0x55 ^ 0x6A) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            associatedBlock = Block.lIIIIIIIllllll[0];
        }
        return associatedBlock != 0;
    }
    
    public final void dropBlockAsItem(final World lllllllllllllIlIlIIIlIlIIlIIIIIl, final BlockPos lllllllllllllIlIlIIIlIlIIlIIIIII, final IBlockState lllllllllllllIlIlIIIlIlIIIllllll, final int lllllllllllllIlIlIIIlIlIIIlllIIl) {
        this.dropBlockAsItemWithChance(lllllllllllllIlIlIIIlIlIIlIIIIIl, lllllllllllllIlIlIIIlIlIIlIIIIII, lllllllllllllIlIlIIIlIlIIIllllll, 1.0f, lllllllllllllIlIlIIIlIlIIIlllIIl);
    }
    
    public int getWeakPower(final IBlockAccess lllllllllllllIlIlIIIlIIlIlIIlIll, final BlockPos lllllllllllllIlIlIIIlIIlIlIIlIlI, final IBlockState lllllllllllllIlIlIIIlIIlIlIIlIIl, final EnumFacing lllllllllllllIlIlIIIlIIlIlIIlIII) {
        return Block.lIIIIIIIllllll[0];
    }
    
    public boolean isNormalCube() {
        if (lIllIIlllIlIlII(this.blockMaterial.isOpaque() ? 1 : 0) && lIllIIlllIlIlII(this.isFullCube() ? 1 : 0) && lIllIIlllIlIllI(this.canProvidePower() ? 1 : 0)) {
            return Block.lIIIIIIIllllll[1] != 0;
        }
        return Block.lIIIIIIIllllll[0] != 0;
    }
    
    public BlockState getBlockState() {
        return this.blockState;
    }
    
    public static class SoundType
    {
        private static final /* synthetic */ int[] lIllIlIIlIIlIl;
        public final /* synthetic */ String soundName;
        public final /* synthetic */ float volume;
        public final /* synthetic */ float frequency;
        private static final /* synthetic */ String[] lIllIlIIlIIlII;
        
        private static boolean llllllIIIllllII(final int lllllllllllllIIIIIIIIllIIIlIllII, final int lllllllllllllIIIIIIIIllIIIlIlIll) {
            return lllllllllllllIIIIIIIIllIIIlIllII < lllllllllllllIIIIIIIIllIIIlIlIll;
        }
        
        public SoundType(final String lllllllllllllIIIIIIIIllIIllIIlIl, final float lllllllllllllIIIIIIIIllIIllIlIII, final float lllllllllllllIIIIIIIIllIIllIIlll) {
            this.soundName = lllllllllllllIIIIIIIIllIIllIIlIl;
            this.volume = lllllllllllllIIIIIIIIllIIllIlIII;
            this.frequency = lllllllllllllIIIIIIIIllIIllIIlll;
        }
        
        public float getVolume() {
            return this.volume;
        }
        
        private static void llllllIIIlllIlI() {
            (lIllIlIIlIIlII = new String[SoundType.lIllIlIIlIIlIl[2]])[SoundType.lIllIlIIlIIlIl[0]] = llllllIIIlllIII("IgoGeQ==", "FcaWh");
            SoundType.lIllIlIIlIIlII[SoundType.lIllIlIIlIIlIl[1]] = llllllIIIlllIIl("mw6hsdVYJeU=", "HjqtM");
        }
        
        public String getPlaceSound() {
            return this.getBreakSound();
        }
        
        private static void llllllIIIlllIll() {
            (lIllIlIIlIIlIl = new int[3])[0] = ((0x11 ^ 0x5A) & ~(0x52 ^ 0x19));
            SoundType.lIllIlIIlIIlIl[1] = " ".length();
            SoundType.lIllIlIIlIIlIl[2] = "  ".length();
        }
        
        private static String llllllIIIlllIII(String lllllllllllllIIIIIIIIllIIlIIIlII, final String lllllllllllllIIIIIIIIllIIlIIIIll) {
            lllllllllllllIIIIIIIIllIIlIIIlII = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIIllIIlIIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIIIIIllIIlIIIlll = new StringBuilder();
            final char[] lllllllllllllIIIIIIIIllIIlIIIllI = lllllllllllllIIIIIIIIllIIlIIIIll.toCharArray();
            int lllllllllllllIIIIIIIIllIIlIIIlIl = SoundType.lIllIlIIlIIlIl[0];
            final double lllllllllllllIIIIIIIIllIIIllllll = (Object)((String)lllllllllllllIIIIIIIIllIIlIIIlII).toCharArray();
            final float lllllllllllllIIIIIIIIllIIIlllllI = lllllllllllllIIIIIIIIllIIIllllll.length;
            char lllllllllllllIIIIIIIIllIIIllllIl = (char)SoundType.lIllIlIIlIIlIl[0];
            while (llllllIIIllllII(lllllllllllllIIIIIIIIllIIIllllIl, (int)lllllllllllllIIIIIIIIllIIIlllllI)) {
                final char lllllllllllllIIIIIIIIllIIlIIlIlI = lllllllllllllIIIIIIIIllIIIllllll[lllllllllllllIIIIIIIIllIIIllllIl];
                lllllllllllllIIIIIIIIllIIlIIIlll.append((char)(lllllllllllllIIIIIIIIllIIlIIlIlI ^ lllllllllllllIIIIIIIIllIIlIIIllI[lllllllllllllIIIIIIIIllIIlIIIlIl % lllllllllllllIIIIIIIIllIIlIIIllI.length]));
                "".length();
                ++lllllllllllllIIIIIIIIllIIlIIIlIl;
                ++lllllllllllllIIIIIIIIllIIIllllIl;
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIIIIIllIIlIIIlll);
        }
        
        public float getFrequency() {
            return this.frequency;
        }
        
        public String getBreakSound() {
            return String.valueOf(new StringBuilder(SoundType.lIllIlIIlIIlII[SoundType.lIllIlIIlIIlIl[0]]).append(this.soundName));
        }
        
        static {
            llllllIIIlllIll();
            llllllIIIlllIlI();
        }
        
        public String getStepSound() {
            return String.valueOf(new StringBuilder(SoundType.lIllIlIIlIIlII[SoundType.lIllIlIIlIIlIl[1]]).append(this.soundName));
        }
        
        private static String llllllIIIlllIIl(final String lllllllllllllIIIIIIIIllIIIllIlII, final String lllllllllllllIIIIIIIIllIIIllIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIIIIIllIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIIIIIllIIIllIllI = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIIIIIllIIIllIllI.init(SoundType.lIllIlIIlIIlIl[2], lllllllllllllIIIIIIIIllIIIllIlll);
                return new String(lllllllllllllIIIIIIIIllIIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIllIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIIIIllIIIllIlIl) {
                lllllllllllllIIIIIIIIllIIIllIlIl.printStackTrace();
                return null;
            }
        }
    }
    
    public enum EnumOffsetType
    {
        XYZ(EnumOffsetType.lIIIIIIIlIIIIl[EnumOffsetType.lIIIIIIIlIIIlI[2]], EnumOffsetType.lIIIIIIIlIIIlI[2]), 
        NONE(EnumOffsetType.lIIIIIIIlIIIIl[EnumOffsetType.lIIIIIIIlIIIlI[0]], EnumOffsetType.lIIIIIIIlIIIlI[0]);
        
        private static final /* synthetic */ String[] lIIIIIIIlIIIIl;
        private static final /* synthetic */ int[] lIIIIIIIlIIIlI;
        
        XZ(EnumOffsetType.lIIIIIIIlIIIIl[EnumOffsetType.lIIIIIIIlIIIlI[1]], EnumOffsetType.lIIIIIIIlIIIlI[1]);
        
        private static void lIllIIlIllllllI() {
            (lIIIIIIIlIIIIl = new String[EnumOffsetType.lIIIIIIIlIIIlI[3]])[EnumOffsetType.lIIIIIIIlIIIlI[0]] = lIllIIlIlllllIl("oxTJSmtNaFs=", "pUlxT");
            EnumOffsetType.lIIIIIIIlIIIIl[EnumOffsetType.lIIIIIIIlIIIlI[1]] = lIllIIlIlllllIl("WNbtVR1fM0E=", "QwRJG");
            EnumOffsetType.lIIIIIIIlIIIIl[EnumOffsetType.lIIIIIIIlIIIlI[2]] = lIllIIlIlllllIl("cxJ6ucmyoTw=", "RsfNz");
        }
        
        private static String lIllIIlIlllllIl(final String lllllllllllllIlIlIIlIIIllIIlIllI, final String lllllllllllllIlIlIIlIIIllIIlIlll) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIlIIIllIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIIllIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIIlIIIllIIllIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIIlIIIllIIllIlI.init(EnumOffsetType.lIIIIIIIlIIIlI[2], lllllllllllllIlIlIIlIIIllIIllIll);
                return new String(lllllllllllllIlIlIIlIIIllIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIlIIIllIIllIIl) {
                lllllllllllllIlIlIIlIIIllIIllIIl.printStackTrace();
                return null;
            }
        }
        
        private EnumOffsetType(final String lllllllllllllIlIlIIlIIIllIlIlIIl, final int lllllllllllllIlIlIIlIIIllIlIlIII) {
        }
        
        static {
            lIllIIlIlllllll();
            lIllIIlIllllllI();
            final EnumOffsetType[] enum$VALUES = new EnumOffsetType[EnumOffsetType.lIIIIIIIlIIIlI[3]];
            enum$VALUES[EnumOffsetType.lIIIIIIIlIIIlI[0]] = EnumOffsetType.NONE;
            enum$VALUES[EnumOffsetType.lIIIIIIIlIIIlI[1]] = EnumOffsetType.XZ;
            enum$VALUES[EnumOffsetType.lIIIIIIIlIIIlI[2]] = EnumOffsetType.XYZ;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIllIIlIlllllll() {
            (lIIIIIIIlIIIlI = new int[4])[0] = ((129 + 191 - 294 + 205 ^ 30 + 151 - 116 + 97) & (0x15 ^ 0x51 ^ " ".length() ^ -" ".length()));
            EnumOffsetType.lIIIIIIIlIIIlI[1] = " ".length();
            EnumOffsetType.lIIIIIIIlIIIlI[2] = "  ".length();
            EnumOffsetType.lIIIIIIIlIIIlI[3] = "   ".length();
        }
    }
}
