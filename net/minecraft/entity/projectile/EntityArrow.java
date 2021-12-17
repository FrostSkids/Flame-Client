// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.NBTTagCompound;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.Entity;

public class EntityArrow extends Entity implements IProjectile
{
    private /* synthetic */ int yTile;
    private /* synthetic */ int inData;
    private /* synthetic */ boolean inGround;
    public /* synthetic */ int canBePickedUp;
    private /* synthetic */ int knockbackStrength;
    private static final /* synthetic */ int[] lIllllllIllIIl;
    private /* synthetic */ Block inTile;
    private static final /* synthetic */ String[] lIllllllIllIII;
    private /* synthetic */ int xTile;
    public /* synthetic */ Entity shootingEntity;
    private /* synthetic */ int ticksInGround;
    private /* synthetic */ int zTile;
    private /* synthetic */ double damage;
    public /* synthetic */ int arrowShake;
    private /* synthetic */ int ticksInAir;
    
    public void setDamage(final double llllllllllllIllllIIlIIIlIIllIIlI) {
        this.damage = llllllllllllIllllIIlIIIlIIllIIlI;
    }
    
    public EntityArrow(final World llllllllllllIllllIIlIIlIIIIllIlI) {
        super(llllllllllllIllllIIlIIlIIIIllIlI);
        this.xTile = EntityArrow.lIllllllIllIIl[0];
        this.yTile = EntityArrow.lIllllllIllIIl[0];
        this.zTile = EntityArrow.lIllllllIllIIl[0];
        this.damage = 2.0;
        this.renderDistanceWeight = 10.0;
        this.setSize(0.5f, 0.5f);
    }
    
    public boolean getIsCritical() {
        final byte llllllllllllIllllIIlIIIlIIIllIlI = this.dataWatcher.getWatchableObjectByte(EntityArrow.lIllllllIllIIl[2]);
        if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIIIllIlI & EntityArrow.lIllllllIllIIl[1])) {
            return EntityArrow.lIllllllIllIIl[1] != 0;
        }
        return EntityArrow.lIllllllIllIIl[3] != 0;
    }
    
    private static int lIIIIlIllllIIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public EntityArrow(final World llllllllllllIllllIIlIIIlllIllIII, final EntityLivingBase llllllllllllIllllIIlIIIlllIlIIll, final float llllllllllllIllllIIlIIIlllIlIIlI) {
        super(llllllllllllIllllIIlIIIlllIllIII);
        this.xTile = EntityArrow.lIllllllIllIIl[0];
        this.yTile = EntityArrow.lIllllllIllIIl[0];
        this.zTile = EntityArrow.lIllllllIllIIl[0];
        this.damage = 2.0;
        this.renderDistanceWeight = 10.0;
        this.shootingEntity = llllllllllllIllllIIlIIIlllIlIIll;
        if (lIIIIlIllllIIlll((llllllllllllIllllIIlIIIlllIlIIll instanceof EntityPlayer) ? 1 : 0)) {
            this.canBePickedUp = EntityArrow.lIllllllIllIIl[1];
        }
        this.setSize(0.5f, 0.5f);
        this.setLocationAndAngles(llllllllllllIllllIIlIIIlllIlIIll.posX, llllllllllllIllllIIlIIIlllIlIIll.posY + llllllllllllIllllIIlIIIlllIlIIll.getEyeHeight(), llllllllllllIllllIIlIIIlllIlIIll.posZ, llllllllllllIllllIIlIIIlllIlIIll.rotationYaw, llllllllllllIllllIIlIIIlllIlIIll.rotationPitch);
        this.posX -= MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * 0.16f;
        this.posY -= 0.10000000149011612;
        this.posZ -= MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * 0.16f;
        this.setPosition(this.posX, this.posY, this.posZ);
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
        this.motionY = -MathHelper.sin(this.rotationPitch / 180.0f * 3.1415927f);
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, llllllllllllIllllIIlIIIlllIlIIlI * 1.5f, 1.0f);
    }
    
    private static int lIIIIlIllllIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIIlIlllllIIll(final int llllllllllllIllllIIlIIIIlllIIIll, final int llllllllllllIllllIIlIIIIlllIIIlI) {
        return llllllllllllIllllIIlIIIIlllIIIll == llllllllllllIllllIIlIIIIlllIIIlI;
    }
    
    private static boolean lIIIIlIlllllIIII(final Object llllllllllllIllllIIlIIIIllIlIlII) {
        return llllllllllllIllllIIlIIIIllIlIlII != null;
    }
    
    private static void lIIIIlIllllIIlIl() {
        (lIllllllIllIIl = new int[36])[0] = -" ".length();
        EntityArrow.lIllllllIllIIl[1] = " ".length();
        EntityArrow.lIllllllIllIIl[2] = (0x9F ^ 0x8F);
        EntityArrow.lIllllllIllIIl[3] = ((0xD9 ^ 0xBC ^ (0x6E ^ 0x1E)) & (95 + 144 - 102 + 41 ^ 103 + 151 - 129 + 42 ^ -" ".length()));
        EntityArrow.lIllllllIllIIl[4] = (-(0xFFFFCC72 & 0x7BDD) & (0xFFFFFEFF & 0x4DFF));
        EntityArrow.lIllllllIllIIl[5] = (64 + 44 - 48 + 124 ^ 121 + 8 + 22 + 38);
        EntityArrow.lIllllllIllIIl[6] = "  ".length();
        EntityArrow.lIllllllIllIIl[7] = (0xB4 ^ 0xB2);
        EntityArrow.lIllllllIllIIl[8] = (0x47 ^ 0x40);
        EntityArrow.lIllllllIllIIl[9] = (0x28 ^ 0x2C);
        EntityArrow.lIllllllIllIIl[10] = "   ".length();
        EntityArrow.lIllllllIllIIl[11] = (0x15 ^ 0x1D);
        EntityArrow.lIllllllIllIIl[12] = (11 + 157 - 12 + 32 ^ 103 + 123 - 194 + 149);
        EntityArrow.lIllllllIllIIl[13] = (0x52 ^ 0x58);
        EntityArrow.lIllllllIllIIl[14] = (181 + 63 - 92 + 51 ^ 19 + 13 + 40 + 120);
        EntityArrow.lIllllllIllIIl[15] = (0x9D ^ 0x91);
        EntityArrow.lIllllllIllIIl[16] = (0x5F ^ 0x51 ^ "   ".length());
        EntityArrow.lIllllllIllIIl[17] = (0x51 ^ 0x5F);
        EntityArrow.lIllllllIllIIl[18] = (0x29 ^ 0xE ^ (0x2F ^ 0x7));
        EntityArrow.lIllllllIllIIl[19] = (0x24 ^ 0x0 ^ (0x7E ^ 0x4B));
        EntityArrow.lIllllllIllIIl[20] = (0xBD ^ 0xAF);
        EntityArrow.lIllllllIllIIl[21] = (0x23 ^ 0x30);
        EntityArrow.lIllllllIllIIl[22] = 131 + 195 - 150 + 79;
        EntityArrow.lIllllllIllIIl[23] = (0xA8 ^ 0xBC);
        EntityArrow.lIllllllIllIIl[24] = (29 + 35 - 1 + 151 ^ 170 + 78 - 76 + 23);
        EntityArrow.lIllllllIllIIl[25] = (0xAF ^ 0xB9);
        EntityArrow.lIllllllIllIIl[26] = (0xDF ^ 0xBF ^ (0x51 ^ 0x26));
        EntityArrow.lIllllllIllIIl[27] = (0x25 ^ 0x1 ^ (0x36 ^ 0x71));
        EntityArrow.lIllllllIllIIl[28] = (0x44 ^ 0x5C);
        EntityArrow.lIllllllIllIIl[29] = (0xB1 ^ 0xA8);
        EntityArrow.lIllllllIllIIl[30] = (0x36 ^ 0x2C);
        EntityArrow.lIllllllIllIIl[31] = (0x6B ^ 0x70);
        EntityArrow.lIllllllIllIIl[32] = (137 + 107 - 198 + 94 ^ 68 + 10 - 15 + 81);
        EntityArrow.lIllllllIllIIl[33] = (0xE ^ 0x13);
        EntityArrow.lIllllllIllIIl[34] = -"  ".length();
        EntityArrow.lIllllllIllIIl[35] = (0x28 ^ 0x36);
    }
    
    private static void lIIIIlIllllIIlII() {
        (lIllllllIllIII = new String[EntityArrow.lIllllllIllIIl[35]])[EntityArrow.lIllllllIllIIl[3]] = lIIIIlIllllIIIIl("kEWhO0B++Xh0Y5K6iDMO6Q==", "AVcWT");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[1]] = lIIIIlIllllIIIlI("7hStlwcRFdjyZg1qO4sFrQ==", "DFFfj");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[6]] = lIIIIlIllllIIIll("LQYnOT0=", "URNUX");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[10]] = lIIIIlIllllIIIlI("KWziUhIhRyw=", "aAeSG");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[9]] = lIIIIlIllllIIIll("Ey4gHT8=", "izIqZ");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[5]] = lIIIIlIllllIIIIl("K86QO/09j0Y=", "tJPiK");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[7]] = lIIIIlIllllIIIlI("SB7Qpb2rm3I=", "iZihE");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[8]] = lIIIIlIllllIIIlI("G17T1rPDEKU=", "AankU");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[11]] = lIIIIlIllllIIIll("GS0iAx8R", "pCfbk");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[12]] = lIIIIlIllllIIIlI("xg2n6jpzuFE=", "vWvtO");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[13]] = lIIIIlIllllIIIll("LxsrECQzGwg=", "FulbK");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[14]] = lIIIIlIllllIIIlI("KQFXih4tf9A=", "IFQBD");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[15]] = lIIIIlIllllIIIll("JQkcFCYk", "AhquA");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[16]] = lIIIIlIllllIIIll("AToADQ8=", "yniaj");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[17]] = lIIIIlIllllIIIll("KyILHTY=", "RvbqS");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[18]] = lIIIIlIllllIIIll("AxMTBAo=", "yGzho");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[2]] = lIIIIlIllllIIIIl("BqwFpLA3rUU=", "AUpqz");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[19]] = lIIIIlIllllIIIIl("zdZt6D0p6yw=", "xPNPO");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[20]] = lIIIIlIllllIIIll("Ag8mAg8O", "karkc");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[21]] = lIIIIlIllllIIIIl("OcJxejZispo=", "ytaer");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[23]] = lIIIIlIllllIIIlI("gfb1zehR7ks=", "IcAOi");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[24]] = lIIIIlIllllIIIIl("ERjn4KomPig=", "XxlSJ");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[25]] = lIIIIlIllllIIIll("BAAgOz8YAAM=", "mngIP");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[26]] = lIIIIlIllllIIIIl("rKCzqCV4it0=", "oOiJb");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[28]] = lIIIIlIllllIIIlI("6YthR+WUk8I=", "fHtqe");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[29]] = lIIIIlIllllIIIlI("Ufx0vFPR6Gs=", "OOYFD");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[30]] = lIIIIlIllllIIIll("MS0ZID8x", "ADzKJ");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[31]] = lIIIIlIllllIIIlI("wbgwsYODK6I=", "tFaNl");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[32]] = lIIIIlIllllIIIIl("tkhF7pXhwWg=", "hEzKV");
        EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[33]] = lIIIIlIllllIIIlI("K4p37tFp9GeAoNvwiZGKPQ==", "zazzx");
    }
    
    private static boolean lIIIIlIllllllIII(final int llllllllllllIllllIIlIIIIlIllllll, final int llllllllllllIllllIIlIIIIlIlllllI) {
        return llllllllllllIllllIIlIIIIlIllllll != llllllllllllIllllIIlIIIIlIlllllI;
    }
    
    @Override
    public void setVelocity(final double llllllllllllIllllIIlIIIllIIlIlll, final double llllllllllllIllllIIlIIIllIIlIllI, final double llllllllllllIllllIIlIIIllIIllIlI) {
        this.motionX = llllllllllllIllllIIlIIIllIIlIlll;
        this.motionY = llllllllllllIllllIIlIIIllIIlIllI;
        this.motionZ = llllllllllllIllllIIlIIIllIIllIlI;
        if (lIIIIlIllllIlIlI(lIIIIlIllllIlIIl(this.prevRotationPitch, 0.0f)) && lIIIIlIllllIlIlI(lIIIIlIllllIlIIl(this.prevRotationYaw, 0.0f))) {
            final float llllllllllllIllllIIlIIIllIIllIIl = MathHelper.sqrt_double(llllllllllllIllllIIlIIIllIIlIlll * llllllllllllIllllIIlIIIllIIlIlll + llllllllllllIllllIIlIIIllIIllIlI * llllllllllllIllllIIlIIIllIIllIlI);
            final float n = (float)(MathHelper.func_181159_b(llllllllllllIllllIIlIIIllIIlIlll, llllllllllllIllllIIlIIIllIIllIlI) * 180.0 / 3.141592653589793);
            this.rotationYaw = n;
            this.prevRotationYaw = n;
            final float n2 = (float)(MathHelper.func_181159_b(llllllllllllIllllIIlIIIllIIlIllI, llllllllllllIllllIIlIIIllIIllIIl) * 180.0 / 3.141592653589793);
            this.rotationPitch = n2;
            this.prevRotationPitch = n2;
            this.prevRotationPitch = this.rotationPitch;
            this.prevRotationYaw = this.rotationYaw;
            this.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.ticksInGround = EntityArrow.lIllllllIllIIl[3];
        }
    }
    
    private static String lIIIIlIllllIIIll(String llllllllllllIllllIIlIIIIlllIlllI, final String llllllllllllIllllIIlIIIIllllIIlI) {
        llllllllllllIllllIIlIIIIlllIlllI = new String(Base64.getDecoder().decode(llllllllllllIllllIIlIIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlIIIIllllIIIl = new StringBuilder();
        final char[] llllllllllllIllllIIlIIIIllllIIII = llllllllllllIllllIIlIIIIllllIIlI.toCharArray();
        int llllllllllllIllllIIlIIIIlllIllll = EntityArrow.lIllllllIllIIl[3];
        final int llllllllllllIllllIIlIIIIlllIlIIl = (Object)llllllllllllIllllIIlIIIIlllIlllI.toCharArray();
        final byte llllllllllllIllllIIlIIIIlllIlIII = (byte)llllllllllllIllllIIlIIIIlllIlIIl.length;
        long llllllllllllIllllIIlIIIIlllIIlll = EntityArrow.lIllllllIllIIl[3];
        while (lIIIIlIllllllIIl((int)llllllllllllIllllIIlIIIIlllIIlll, llllllllllllIllllIIlIIIIlllIlIII)) {
            final char llllllllllllIllllIIlIIIIllllIlII = llllllllllllIllllIIlIIIIlllIlIIl[llllllllllllIllllIIlIIIIlllIIlll];
            llllllllllllIllllIIlIIIIllllIIIl.append((char)(llllllllllllIllllIIlIIIIllllIlII ^ llllllllllllIllllIIlIIIIllllIIII[llllllllllllIllllIIlIIIIlllIllll % llllllllllllIllllIIlIIIIllllIIII.length]));
            "".length();
            ++llllllllllllIllllIIlIIIIlllIllll;
            ++llllllllllllIllllIIlIIIIlllIIlll;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlIIIIllllIIIl);
    }
    
    private static boolean lIIIIlIllllIIlll(final int llllllllllllIllllIIlIIIIllIIllII) {
        return llllllllllllIllllIIlIIIIllIIllII != 0;
    }
    
    @Override
    public float getEyeHeight() {
        return 0.0f;
    }
    
    private static boolean lIIIIlIlllllIlII(final int llllllllllllIllllIIlIIIIllIlllll, final int llllllllllllIllllIIlIIIIllIllllI) {
        return llllllllllllIllllIIlIIIIllIlllll >= llllllllllllIllllIIlIIIIllIllllI;
    }
    
    private static boolean lIIIIlIlllllIIlI(final Object llllllllllllIllllIIlIIIIllIlIIIl, final Object llllllllllllIllllIIlIIIIllIlIIII) {
        return llllllllllllIllllIIlIIIIllIlIIIl == llllllllllllIllllIIlIIIIllIlIIII;
    }
    
    public EntityArrow(final World llllllllllllIllllIIlIIIllllllIlI, final EntityLivingBase llllllllllllIllllIIlIIIllllllIIl, final EntityLivingBase llllllllllllIllllIIlIIIllllIlIIl, final float llllllllllllIllllIIlIIIllllIlIII, final float llllllllllllIllllIIlIIIllllIIlll) {
        super(llllllllllllIllllIIlIIIllllllIlI);
        this.xTile = EntityArrow.lIllllllIllIIl[0];
        this.yTile = EntityArrow.lIllllllIllIIl[0];
        this.zTile = EntityArrow.lIllllllIllIIl[0];
        this.damage = 2.0;
        this.renderDistanceWeight = 10.0;
        this.shootingEntity = llllllllllllIllllIIlIIIllllllIIl;
        if (lIIIIlIllllIIlll((llllllllllllIllllIIlIIIllllllIIl instanceof EntityPlayer) ? 1 : 0)) {
            this.canBePickedUp = EntityArrow.lIllllllIllIIl[1];
        }
        this.posY = llllllllllllIllllIIlIIIllllllIIl.posY + llllllllllllIllllIIlIIIllllllIIl.getEyeHeight() - 0.10000000149011612;
        final double llllllllllllIllllIIlIIIlllllIlIl = llllllllllllIllllIIlIIIllllIlIIl.posX - llllllllllllIllllIIlIIIllllllIIl.posX;
        final double llllllllllllIllllIIlIIIlllllIlII = llllllllllllIllllIIlIIIllllIlIIl.getEntityBoundingBox().minY + llllllllllllIllllIIlIIIllllIlIIl.height / 3.0f - this.posY;
        final double llllllllllllIllllIIlIIIlllllIIll = llllllllllllIllllIIlIIIllllIlIIl.posZ - llllllllllllIllllIIlIIIllllllIIl.posZ;
        final double llllllllllllIllllIIlIIIlllllIIlI = MathHelper.sqrt_double(llllllllllllIllllIIlIIIlllllIlIl * llllllllllllIllllIIlIIIlllllIlIl + llllllllllllIllllIIlIIIlllllIIll * llllllllllllIllllIIlIIIlllllIIll);
        if (lIIIIlIllllIlIII(lIIIIlIllllIIllI(llllllllllllIllllIIlIIIlllllIIlI, 1.0E-7))) {
            final float llllllllllllIllllIIlIIIlllllIIIl = (float)(MathHelper.func_181159_b(llllllllllllIllllIIlIIIlllllIIll, llllllllllllIllllIIlIIIlllllIlIl) * 180.0 / 3.141592653589793) - 90.0f;
            final float llllllllllllIllllIIlIIIlllllIIII = (float)(-(MathHelper.func_181159_b(llllllllllllIllllIIlIIIlllllIlII, llllllllllllIllllIIlIIIlllllIIlI) * 180.0 / 3.141592653589793));
            final double llllllllllllIllllIIlIIIllllIllll = llllllllllllIllllIIlIIIlllllIlIl / llllllllllllIllllIIlIIIlllllIIlI;
            final double llllllllllllIllllIIlIIIllllIlllI = llllllllllllIllllIIlIIIlllllIIll / llllllllllllIllllIIlIIIlllllIIlI;
            this.setLocationAndAngles(llllllllllllIllllIIlIIIllllllIIl.posX + llllllllllllIllllIIlIIIllllIllll, this.posY, llllllllllllIllllIIlIIIllllllIIl.posZ + llllllllllllIllllIIlIIIllllIlllI, llllllllllllIllllIIlIIIlllllIIIl, llllllllllllIllllIIlIIIlllllIIII);
            final float llllllllllllIllllIIlIIIllllIllIl = (float)(llllllllllllIllllIIlIIIlllllIIlI * 0.20000000298023224);
            this.setThrowableHeading(llllllllllllIllllIIlIIIlllllIlIl, llllllllllllIllllIIlIIIlllllIlII + llllllllllllIllllIIlIIIllllIllIl, llllllllllllIllllIIlIIIlllllIIll, llllllllllllIllllIIlIIIllllIlIII, llllllllllllIllllIIlIIIllllIIlll);
        }
    }
    
    public double getDamage() {
        return this.damage;
    }
    
    private static String lIIIIlIllllIIIlI(final String llllllllllllIllllIIlIIIlIIIIIIll, final String llllllllllllIllllIIlIIIlIIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIIIlIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), EntityArrow.lIllllllIllIIl[11]), "DES");
            final Cipher llllllllllllIllllIIlIIIlIIIIIlIl = Cipher.getInstance("DES");
            llllllllllllIllllIIlIIIlIIIIIlIl.init(EntityArrow.lIllllllIllIIl[6], llllllllllllIllllIIlIIIlIIIIIllI);
            return new String(llllllllllllIllllIIlIIIlIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIIIlIIIIIlII) {
            llllllllllllIllllIIlIIIlIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIlllllIllI(final int llllllllllllIllllIIlIIIIllIIIllI) {
        return llllllllllllIllllIIlIIIIllIIIllI < 0;
    }
    
    public EntityArrow(final World llllllllllllIllllIIlIIlIIIIIlllI, final double llllllllllllIllllIIlIIlIIIIIllIl, final double llllllllllllIllllIIlIIlIIIIlIIIl, final double llllllllllllIllllIIlIIlIIIIlIIII) {
        super(llllllllllllIllllIIlIIlIIIIIlllI);
        this.xTile = EntityArrow.lIllllllIllIIl[0];
        this.yTile = EntityArrow.lIllllllIllIIl[0];
        this.zTile = EntityArrow.lIllllllIllIIl[0];
        this.damage = 2.0;
        this.renderDistanceWeight = 10.0;
        this.setSize(0.5f, 0.5f);
        this.setPosition(llllllllllllIllllIIlIIlIIIIIllIl, llllllllllllIllllIIlIIlIIIIlIIIl, llllllllllllIllllIIlIIlIIIIlIIII);
    }
    
    public void setKnockbackStrength(final int llllllllllllIllllIIlIIIlIIlIlIll) {
        this.knockbackStrength = llllllllllllIllllIIlIIIlIIlIlIll;
    }
    
    static {
        lIIIIlIllllIIlIl();
        lIIIIlIllllIIlII();
    }
    
    private static int lIIIIlIllllIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIIlIllllIlIII(final int llllllllllllIllllIIlIIIIllIIlIII) {
        return llllllllllllIllllIIlIIIIllIIlIII >= 0;
    }
    
    @Override
    public void setPositionAndRotation2(final double llllllllllllIllllIIlIIIllIlIIlll, final double llllllllllllIllllIIlIIIllIlIlllI, final double llllllllllllIllllIIlIIIllIlIllIl, final float llllllllllllIllllIIlIIIllIlIllII, final float llllllllllllIllllIIlIIIllIlIlIll, final int llllllllllllIllllIIlIIIllIlIlIlI, final boolean llllllllllllIllllIIlIIIllIlIlIIl) {
        this.setPosition(llllllllllllIllllIIlIIIllIlIIlll, llllllllllllIllllIIlIIIllIlIlllI, llllllllllllIllllIIlIIIllIlIllIl);
        this.setRotation(llllllllllllIllllIIlIIIllIlIllII, llllllllllllIllllIIlIIIllIlIlIll);
    }
    
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllllIIlIIIlIlIIllII) {
        llllllllllllIllllIIlIIIlIlIIllII.setShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[6]], (short)this.xTile);
        llllllllllllIllllIIlIIIlIlIIllII.setShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[10]], (short)this.yTile);
        llllllllllllIllllIIlIIIlIlIIllII.setShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[9]], (short)this.zTile);
        llllllllllllIllllIIlIIIlIlIIllII.setShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[5]], (short)this.ticksInGround);
        final ResourceLocation llllllllllllIllllIIlIIIlIlIIlIll = Block.blockRegistry.getNameForObject(this.inTile);
        final String lllllllllllllIIIIIlIIIlIIIIIIllI = EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[7]];
        String string;
        if (lIIIIlIlllllIlIl(llllllllllllIllllIIlIIIlIlIIlIll)) {
            string = EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[8]];
            "".length();
            if ((0x88 ^ 0x91 ^ (0xC ^ 0x11)) < -" ".length()) {
                return;
            }
        }
        else {
            string = llllllllllllIllllIIlIIIlIlIIlIll.toString();
        }
        llllllllllllIllllIIlIIIlIlIIllII.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
        llllllllllllIllllIIlIIIlIlIIllII.setByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[11]], (byte)this.inData);
        llllllllllllIllllIIlIIIlIlIIllII.setByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[12]], (byte)this.arrowShake);
        final String lllllllllllllIIIIIlIIIlIIllIIlll = EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[13]];
        int n;
        if (lIIIIlIllllIIlll(this.inGround ? 1 : 0)) {
            n = EntityArrow.lIllllllIllIIl[1];
            "".length();
            if ((0x8F ^ 0x8A) <= 0) {
                return;
            }
        }
        else {
            n = EntityArrow.lIllllllIllIIl[3];
        }
        llllllllllllIllllIIlIIIlIlIIllII.setByte(lllllllllllllIIIIIlIIIlIIllIIlll, (byte)n);
        llllllllllllIllllIIlIIIlIlIIllII.setByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[14]], (byte)this.canBePickedUp);
        llllllllllllIllllIIlIIIlIlIIllII.setDouble(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[15]], this.damage);
    }
    
    @Override
    public boolean canAttackWithItem() {
        return EntityArrow.lIllllllIllIIl[3] != 0;
    }
    
    @Override
    public void onCollideWithPlayer(final EntityPlayer llllllllllllIllllIIlIIIlIIllllIl) {
        if (lIIIIlIllllIlIlI(this.worldObj.isRemote ? 1 : 0) && lIIIIlIllllIIlll(this.inGround ? 1 : 0) && lIIIIlIlllllIlll(this.arrowShake)) {
            int n;
            if (lIIIIlIllllllIII(this.canBePickedUp, EntityArrow.lIllllllIllIIl[1]) && (!lIIIIlIlllllIIll(this.canBePickedUp, EntityArrow.lIllllllIllIIl[6]) || lIIIIlIllllIlIlI(llllllllllllIllllIIlIIIlIIllllIl.capabilities.isCreativeMode ? 1 : 0))) {
                n = EntityArrow.lIllllllIllIIl[3];
                "".length();
                if ("  ".length() <= ((38 + 42 + 20 + 148 ^ 77 + 78 - 83 + 114) & (0x12 ^ 0x1 ^ (0xDD ^ 0x8C) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                n = EntityArrow.lIllllllIllIIl[1];
            }
            boolean llllllllllllIllllIIlIIIlIIllllII = n != 0;
            if (lIIIIlIlllllIIll(this.canBePickedUp, EntityArrow.lIllllllIllIIl[1]) && lIIIIlIllllIlIlI(llllllllllllIllllIIlIIIlIIllllIl.inventory.addItemStackToInventory(new ItemStack(Items.arrow, EntityArrow.lIllllllIllIIl[1])) ? 1 : 0)) {
                llllllllllllIllllIIlIIIlIIllllII = (EntityArrow.lIllllllIllIIl[3] != 0);
            }
            if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIIllllII ? 1 : 0)) {
                this.playSound(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[33]], 0.2f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                llllllllllllIllllIIlIIIlIIllllIl.onItemPickup(this, EntityArrow.lIllllllIllIIl[1]);
                this.setDead();
            }
        }
    }
    
    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(EntityArrow.lIllllllIllIIl[2], (byte)EntityArrow.lIllllllIllIIl[3]);
    }
    
    private static int lIIIIlIllllIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIIlIllllIlIlI(final int llllllllllllIllllIIlIIIIllIIlIlI) {
        return llllllllllllIllllIIlIIIIllIIlIlI == 0;
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityArrow.lIllllllIllIIl[3] != 0;
    }
    
    private static boolean lIIIIlIllllllIIl(final int llllllllllllIllllIIlIIIIllIllIll, final int llllllllllllIllllIIlIIIIllIllIlI) {
        return llllllllllllIllllIIlIIIIllIllIll < llllllllllllIllllIIlIIIIllIllIlI;
    }
    
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllllIIlIIIlIlIIIlII) {
        this.xTile = llllllllllllIllllIIlIIIlIlIIIlII.getShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[16]]);
        this.yTile = llllllllllllIllllIIlIIIlIlIIIlII.getShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[17]]);
        this.zTile = llllllllllllIllllIIlIIIlIlIIIlII.getShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[18]]);
        this.ticksInGround = llllllllllllIllllIIlIIIlIlIIIlII.getShort(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[2]]);
        if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIlIIIlII.hasKey(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[19]], EntityArrow.lIllllllIllIIl[11]) ? 1 : 0)) {
            this.inTile = Block.getBlockFromName(llllllllllllIllllIIlIIIlIlIIIlII.getString(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[20]]));
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.inTile = Block.getBlockById(llllllllllllIllllIIlIIIlIlIIIlII.getByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[21]]) & EntityArrow.lIllllllIllIIl[22]);
        }
        this.inData = (llllllllllllIllllIIlIIIlIlIIIlII.getByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[23]]) & EntityArrow.lIllllllIllIIl[22]);
        this.arrowShake = (llllllllllllIllllIIlIIIlIlIIIlII.getByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[24]]) & EntityArrow.lIllllllIllIIl[22]);
        int inGround;
        if (lIIIIlIlllllIIll(llllllllllllIllllIIlIIIlIlIIIlII.getByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[25]]), EntityArrow.lIllllllIllIIl[1])) {
            inGround = EntityArrow.lIllllllIllIIl[1];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        else {
            inGround = EntityArrow.lIllllllIllIIl[3];
        }
        this.inGround = (inGround != 0);
        if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIlIIIlII.hasKey(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[26]], EntityArrow.lIllllllIllIIl[27]) ? 1 : 0)) {
            this.damage = llllllllllllIllllIIlIIIlIlIIIlII.getDouble(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[28]]);
        }
        if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIlIIIlII.hasKey(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[29]], EntityArrow.lIllllllIllIIl[27]) ? 1 : 0)) {
            this.canBePickedUp = llllllllllllIllllIIlIIIlIlIIIlII.getByte(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[30]]);
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        else if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIlIIIlII.hasKey(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[31]], EntityArrow.lIllllllIllIIl[27]) ? 1 : 0)) {
            int canBePickedUp;
            if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIlIIIlII.getBoolean(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[32]]) ? 1 : 0)) {
                canBePickedUp = EntityArrow.lIllllllIllIIl[1];
                "".length();
                if (((0x15 ^ 0x19) & ~(0x7D ^ 0x71)) != 0x0) {
                    return;
                }
            }
            else {
                canBePickedUp = EntityArrow.lIllllllIllIIl[3];
            }
            this.canBePickedUp = canBePickedUp;
        }
    }
    
    private static boolean lIIIIlIlllllIlll(final int llllllllllllIllllIIlIIIIllIIIlII) {
        return llllllllllllIllllIIlIIIIllIIIlII <= 0;
    }
    
    private static int lIIIIlIllllIlllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void setThrowableHeading(double llllllllllllIllllIIlIIIllIllllIl, double llllllllllllIllllIIlIIIllIllllII, double llllllllllllIllllIIlIIIllIlllIll, final float llllllllllllIllllIIlIIIlllIIIIlI, final float llllllllllllIllllIIlIIIlllIIIIIl) {
        final float llllllllllllIllllIIlIIIlllIIIIII = MathHelper.sqrt_double(llllllllllllIllllIIlIIIllIllllIl * llllllllllllIllllIIlIIIllIllllIl + llllllllllllIllllIIlIIIllIllllII * llllllllllllIllllIIlIIIllIllllII + llllllllllllIllllIIlIIIllIlllIll * llllllllllllIllllIIlIIIllIlllIll);
        llllllllllllIllllIIlIIIllIllllIl /= llllllllllllIllllIIlIIIlllIIIIII;
        llllllllllllIllllIIlIIIllIllllII /= llllllllllllIllllIIlIIIlllIIIIII;
        llllllllllllIllllIIlIIIllIlllIll /= llllllllllllIllllIIlIIIlllIIIIII;
        final double n = llllllllllllIllllIIlIIIllIllllIl;
        final double nextGaussian = this.rand.nextGaussian();
        int n2;
        if (lIIIIlIllllIIlll(this.rand.nextBoolean() ? 1 : 0)) {
            n2 = EntityArrow.lIllllllIllIIl[0];
            "".length();
            if (" ".length() == (0x2C ^ 0x28)) {
                return;
            }
        }
        else {
            n2 = EntityArrow.lIllllllIllIIl[1];
        }
        llllllllllllIllllIIlIIIllIllllIl = n + nextGaussian * n2 * 0.007499999832361937 * llllllllllllIllllIIlIIIlllIIIIIl;
        final double n3 = llllllllllllIllllIIlIIIllIllllII;
        final double nextGaussian2 = this.rand.nextGaussian();
        int n4;
        if (lIIIIlIllllIIlll(this.rand.nextBoolean() ? 1 : 0)) {
            n4 = EntityArrow.lIllllllIllIIl[0];
            "".length();
            if ((0xB6 ^ 0xB3) == 0x0) {
                return;
            }
        }
        else {
            n4 = EntityArrow.lIllllllIllIIl[1];
        }
        llllllllllllIllllIIlIIIllIllllII = n3 + nextGaussian2 * n4 * 0.007499999832361937 * llllllllllllIllllIIlIIIlllIIIIIl;
        final double n5 = llllllllllllIllllIIlIIIllIlllIll;
        final double nextGaussian3 = this.rand.nextGaussian();
        int n6;
        if (lIIIIlIllllIIlll(this.rand.nextBoolean() ? 1 : 0)) {
            n6 = EntityArrow.lIllllllIllIIl[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            n6 = EntityArrow.lIllllllIllIIl[1];
        }
        llllllllllllIllllIIlIIIllIlllIll = n5 + nextGaussian3 * n6 * 0.007499999832361937 * llllllllllllIllllIIlIIIlllIIIIIl;
        llllllllllllIllllIIlIIIllIllllIl *= llllllllllllIllllIIlIIIlllIIIIlI;
        llllllllllllIllllIIlIIIllIllllII *= llllllllllllIllllIIlIIIlllIIIIlI;
        llllllllllllIllllIIlIIIllIlllIll *= llllllllllllIllllIIlIIIlllIIIIlI;
        this.motionX = llllllllllllIllllIIlIIIllIllllIl;
        this.motionY = llllllllllllIllllIIlIIIllIllllII;
        this.motionZ = llllllllllllIllllIIlIIIllIlllIll;
        final float llllllllllllIllllIIlIIIllIllllll = MathHelper.sqrt_double(llllllllllllIllllIIlIIIllIllllIl * llllllllllllIllllIIlIIIllIllllIl + llllllllllllIllllIIlIIIllIlllIll * llllllllllllIllllIIlIIIllIlllIll);
        final float n7 = (float)(MathHelper.func_181159_b(llllllllllllIllllIIlIIIllIllllIl, llllllllllllIllllIIlIIIllIlllIll) * 180.0 / 3.141592653589793);
        this.rotationYaw = n7;
        this.prevRotationYaw = n7;
        final float n8 = (float)(MathHelper.func_181159_b(llllllllllllIllllIIlIIIllIllllII, llllllllllllIllllIIlIIIllIllllll) * 180.0 / 3.141592653589793);
        this.rotationPitch = n8;
        this.prevRotationPitch = n8;
        this.ticksInGround = EntityArrow.lIllllllIllIIl[3];
    }
    
    private static String lIIIIlIllllIIIIl(final String llllllllllllIllllIIlIIIlIIIIlllI, final String llllllllllllIllllIIlIIIlIIIIllll) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIIIlIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIIlIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlIIIlIIIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlIIIlIIIlIIlI.init(EntityArrow.lIllllllIllIIl[6], llllllllllllIllllIIlIIIlIIIlIIll);
            return new String(llllllllllllIllllIIlIIIlIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIIIlIIIlIIIl) {
            llllllllllllIllllIIlIIIlIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIlllllIlIl(final Object llllllllllllIllllIIlIIIIllIIlllI) {
        return llllllllllllIllllIIlIIIIllIIlllI == null;
    }
    
    public void setIsCritical(final boolean llllllllllllIllllIIlIIIlIIlIIIlI) {
        final byte llllllllllllIllllIIlIIIlIIlIIIIl = this.dataWatcher.getWatchableObjectByte(EntityArrow.lIllllllIllIIl[2]);
        if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIIlIIIlI ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityArrow.lIllllllIllIIl[2], (byte)(llllllllllllIllllIIlIIIlIIlIIIIl | EntityArrow.lIllllllIllIIl[1]));
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityArrow.lIllllllIllIIl[2], (byte)(llllllllllllIllllIIlIIIlIIlIIIIl & EntityArrow.lIllllllIllIIl[34]));
        }
    }
    
    private static boolean lIIIIlIlllllIIIl(final int llllllllllllIllllIIlIIIIllIIIIlI) {
        return llllllllllllIllllIIlIIIIllIIIIlI > 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIIIIlIllllIlIlI(lIIIIlIllllIlIll(this.prevRotationPitch, 0.0f)) && lIIIIlIllllIlIlI(lIIIIlIllllIlIll(this.prevRotationYaw, 0.0f))) {
            final float llllllllllllIllllIIlIIIllIIIIIlI = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            final float n = (float)(MathHelper.func_181159_b(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
            this.rotationYaw = n;
            this.prevRotationYaw = n;
            final float n2 = (float)(MathHelper.func_181159_b(this.motionY, llllllllllllIllllIIlIIIllIIIIIlI) * 180.0 / 3.141592653589793);
            this.rotationPitch = n2;
            this.prevRotationPitch = n2;
        }
        final BlockPos llllllllllllIllllIIlIIIllIIIIIIl = new BlockPos(this.xTile, this.yTile, this.zTile);
        final IBlockState llllllllllllIllllIIlIIIllIIIIIII = this.worldObj.getBlockState(llllllllllllIllllIIlIIIllIIIIIIl);
        final Block llllllllllllIllllIIlIIIlIlllllll = llllllllllllIllllIIlIIIllIIIIIII.getBlock();
        if (lIIIIlIllllIllll(llllllllllllIllllIIlIIIlIlllllll.getMaterial(), Material.air)) {
            llllllllllllIllllIIlIIIlIlllllll.setBlockBoundsBasedOnState(this.worldObj, llllllllllllIllllIIlIIIllIIIIIIl);
            final AxisAlignedBB llllllllllllIllllIIlIIIlIllllllI = llllllllllllIllllIIlIIIlIlllllll.getCollisionBoundingBox(this.worldObj, llllllllllllIllllIIlIIIllIIIIIIl, llllllllllllIllllIIlIIIllIIIIIII);
            if (lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIllllllI) && lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIllllllI.isVecInside(new Vec3(this.posX, this.posY, this.posZ)) ? 1 : 0)) {
                this.inGround = (EntityArrow.lIllllllIllIIl[1] != 0);
            }
        }
        if (lIIIIlIlllllIIIl(this.arrowShake)) {
            this.arrowShake -= EntityArrow.lIllllllIllIIl[1];
        }
        if (lIIIIlIllllIIlll(this.inGround ? 1 : 0)) {
            final int llllllllllllIllllIIlIIIlIlllllIl = llllllllllllIllllIIlIIIlIlllllll.getMetaFromState(llllllllllllIllllIIlIIIllIIIIIII);
            if (lIIIIlIlllllIIlI(llllllllllllIllllIIlIIIlIlllllll, this.inTile) && lIIIIlIlllllIIll(llllllllllllIllllIIlIIIlIlllllIl, this.inData)) {
                this.ticksInGround += EntityArrow.lIllllllIllIIl[1];
                if (lIIIIlIlllllIlII(this.ticksInGround, EntityArrow.lIllllllIllIIl[4])) {
                    this.setDead();
                    "".length();
                    if (("   ".length() & ~"   ".length()) != 0x0) {
                        return;
                    }
                }
            }
            else {
                this.inGround = (EntityArrow.lIllllllIllIIl[3] != 0);
                this.motionX *= this.rand.nextFloat() * 0.2f;
                this.motionY *= this.rand.nextFloat() * 0.2f;
                this.motionZ *= this.rand.nextFloat() * 0.2f;
                this.ticksInGround = EntityArrow.lIllllllIllIIl[3];
                this.ticksInAir = EntityArrow.lIllllllIllIIl[3];
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        }
        else {
            this.ticksInAir += EntityArrow.lIllllllIllIIl[1];
            Vec3 llllllllllllIllllIIlIIIlIlllllII = new Vec3(this.posX, this.posY, this.posZ);
            Vec3 llllllllllllIllllIIlIIIlIllllIll = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition llllllllllllIllllIIlIIIlIllllIlI = this.worldObj.rayTraceBlocks(llllllllllllIllllIIlIIIlIlllllII, llllllllllllIllllIIlIIIlIllllIll, (boolean)(EntityArrow.lIllllllIllIIl[3] != 0), (boolean)(EntityArrow.lIllllllIllIIl[1] != 0), (boolean)(EntityArrow.lIllllllIllIIl[3] != 0));
            llllllllllllIllllIIlIIIlIlllllII = new Vec3(this.posX, this.posY, this.posZ);
            llllllllllllIllllIIlIIIlIllllIll = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            if (lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIllllIlI)) {
                llllllllllllIllllIIlIIIlIllllIll = new Vec3(llllllllllllIllllIIlIIIlIllllIlI.hitVec.xCoord, llllllllllllIllllIIlIIIlIllllIlI.hitVec.yCoord, llllllllllllIllllIIlIIIlIllllIlI.hitVec.zCoord);
            }
            Entity llllllllllllIllllIIlIIIlIllllIIl = null;
            final List<Entity> llllllllllllIllllIIlIIIlIllllIII = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
            double llllllllllllIllllIIlIIIlIlllIlll = 0.0;
            int llllllllllllIllllIIlIIIlIlllIllI = EntityArrow.lIllllllIllIIl[3];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIIlIlllllIlII(llllllllllllIllllIIlIIIlIlllIllI, llllllllllllIllllIIlIIIlIllllIII.size())) {
                final Entity llllllllllllIllllIIlIIIlIlllIlIl = llllllllllllIllllIIlIIIlIllllIII.get(llllllllllllIllllIIlIIIlIlllIllI);
                if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIlllIlIl.canBeCollidedWith() ? 1 : 0) && (!lIIIIlIlllllIIlI(llllllllllllIllllIIlIIIlIlllIlIl, this.shootingEntity) || lIIIIlIlllllIlII(this.ticksInAir, EntityArrow.lIllllllIllIIl[5]))) {
                    final float llllllllllllIllllIIlIIIlIlllIlII = 0.3f;
                    final AxisAlignedBB llllllllllllIllllIIlIIIlIlllIIll = llllllllllllIllllIIlIIIlIlllIlIl.getEntityBoundingBox().expand(llllllllllllIllllIIlIIIlIlllIlII, llllllllllllIllllIIlIIIlIlllIlII, llllllllllllIllllIIlIIIlIlllIlII);
                    final MovingObjectPosition llllllllllllIllllIIlIIIlIlllIIlI = llllllllllllIllllIIlIIIlIlllIIll.calculateIntercept(llllllllllllIllllIIlIIIlIlllllII, llllllllllllIllllIIlIIIlIllllIll);
                    if (lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIlllIIlI)) {
                        final double llllllllllllIllllIIlIIIlIlllIIIl = llllllllllllIllllIIlIIIlIlllllII.squareDistanceTo(llllllllllllIllllIIlIIIlIlllIIlI.hitVec);
                        if (!lIIIIlIllllIlIII(lIIIIlIllllIllII(llllllllllllIllllIIlIIIlIlllIIIl, llllllllllllIllllIIlIIIlIlllIlll)) || lIIIIlIllllIlIlI(lIIIIlIllllIllIl(llllllllllllIllllIIlIIIlIlllIlll, 0.0))) {
                            llllllllllllIllllIIlIIIlIllllIIl = llllllllllllIllllIIlIIIlIlllIlIl;
                            llllllllllllIllllIIlIIIlIlllIlll = llllllllllllIllllIIlIIIlIlllIIIl;
                        }
                    }
                }
                ++llllllllllllIllllIIlIIIlIlllIllI;
            }
            if (lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIllllIIl)) {
                llllllllllllIllllIIlIIIlIllllIlI = new MovingObjectPosition(llllllllllllIllllIIlIIIlIllllIIl);
            }
            if (lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIllllIlI) && lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIllllIlI.entityHit) && lIIIIlIllllIIlll((llllllllllllIllllIIlIIIlIllllIlI.entityHit instanceof EntityPlayer) ? 1 : 0)) {
                final EntityPlayer llllllllllllIllllIIlIIIlIlllIIII = (EntityPlayer)llllllllllllIllllIIlIIIlIllllIlI.entityHit;
                if (!lIIIIlIllllIlIlI(llllllllllllIllllIIlIIIlIlllIIII.capabilities.disableDamage ? 1 : 0) || (lIIIIlIllllIIlll((this.shootingEntity instanceof EntityPlayer) ? 1 : 0) && lIIIIlIllllIlIlI(((EntityPlayer)this.shootingEntity).canAttackPlayer(llllllllllllIllllIIlIIIlIlllIIII) ? 1 : 0))) {
                    llllllllllllIllllIIlIIIlIllllIlI = null;
                }
            }
            if (lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIllllIlI)) {
                if (lIIIIlIlllllIIII(llllllllllllIllllIIlIIIlIllllIlI.entityHit)) {
                    final float llllllllllllIllllIIlIIIlIllIllll = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                    int llllllllllllIllllIIlIIIlIllIlllI = MathHelper.ceiling_double_int(llllllllllllIllllIIlIIIlIllIllll * this.damage);
                    if (lIIIIlIllllIIlll(this.getIsCritical() ? 1 : 0)) {
                        llllllllllllIllllIIlIIIlIllIlllI += this.rand.nextInt(llllllllllllIllllIIlIIIlIllIlllI / EntityArrow.lIllllllIllIIl[6] + EntityArrow.lIllllllIllIIl[6]);
                    }
                    DamageSource llllllllllllIllllIIlIIIlIllIllII;
                    if (lIIIIlIlllllIlIl(this.shootingEntity)) {
                        final DamageSource llllllllllllIllllIIlIIIlIllIllIl = DamageSource.causeArrowDamage(this, this);
                        "".length();
                        if (" ".length() > (125 + 145 - 230 + 126 ^ 81 + 45 - 78 + 114)) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllllIIlIIIlIllIllII = DamageSource.causeArrowDamage(this, this.shootingEntity);
                    }
                    if (lIIIIlIllllIIlll(this.isBurning() ? 1 : 0) && lIIIIlIllllIlIlI((llllllllllllIllllIIlIIIlIllllIlI.entityHit instanceof EntityEnderman) ? 1 : 0)) {
                        llllllllllllIllllIIlIIIlIllllIlI.entityHit.setFire(EntityArrow.lIllllllIllIIl[5]);
                    }
                    if (lIIIIlIllllIIlll(llllllllllllIllllIIlIIIlIllllIlI.entityHit.attackEntityFrom(llllllllllllIllllIIlIIIlIllIllII, (float)llllllllllllIllllIIlIIIlIllIlllI) ? 1 : 0)) {
                        if (lIIIIlIllllIIlll((llllllllllllIllllIIlIIIlIllllIlI.entityHit instanceof EntityLivingBase) ? 1 : 0)) {
                            final EntityLivingBase llllllllllllIllllIIlIIIlIllIlIll = (EntityLivingBase)llllllllllllIllllIIlIIIlIllllIlI.entityHit;
                            if (lIIIIlIllllIlIlI(this.worldObj.isRemote ? 1 : 0)) {
                                llllllllllllIllllIIlIIIlIllIlIll.setArrowCountInEntity(llllllllllllIllllIIlIIIlIllIlIll.getArrowCountInEntity() + EntityArrow.lIllllllIllIIl[1]);
                            }
                            if (lIIIIlIlllllIIIl(this.knockbackStrength)) {
                                final float llllllllllllIllllIIlIIIlIllIlIlI = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
                                if (lIIIIlIlllllIIIl(lIIIIlIllllIlIll(llllllllllllIllllIIlIIIlIllIlIlI, 0.0f))) {
                                    llllllllllllIllllIIlIIIlIllllIlI.entityHit.addVelocity(this.motionX * this.knockbackStrength * 0.6000000238418579 / llllllllllllIllllIIlIIIlIllIlIlI, 0.1, this.motionZ * this.knockbackStrength * 0.6000000238418579 / llllllllllllIllllIIlIIIlIllIlIlI);
                                }
                            }
                            if (lIIIIlIllllIIlll((this.shootingEntity instanceof EntityLivingBase) ? 1 : 0)) {
                                EnchantmentHelper.applyThornEnchantments(llllllllllllIllllIIlIIIlIllIlIll, this.shootingEntity);
                                EnchantmentHelper.applyArthropodEnchantments((EntityLivingBase)this.shootingEntity, llllllllllllIllllIIlIIIlIllIlIll);
                            }
                            if (lIIIIlIlllllIIII(this.shootingEntity) && lIIIIlIllllIllll(llllllllllllIllllIIlIIIlIllllIlI.entityHit, this.shootingEntity) && lIIIIlIllllIIlll((llllllllllllIllllIIlIIIlIllllIlI.entityHit instanceof EntityPlayer) ? 1 : 0) && lIIIIlIllllIIlll((this.shootingEntity instanceof EntityPlayerMP) ? 1 : 0)) {
                                ((EntityPlayerMP)this.shootingEntity).playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(EntityArrow.lIllllllIllIIl[7], 0.0f));
                            }
                        }
                        this.playSound(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[3]], 1.0f, 1.2f / (this.rand.nextFloat() * 0.2f + 0.9f));
                        if (lIIIIlIllllIlIlI((llllllllllllIllllIIlIIIlIllllIlI.entityHit instanceof EntityEnderman) ? 1 : 0)) {
                            this.setDead();
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return;
                            }
                        }
                    }
                    else {
                        this.motionX *= -0.10000000149011612;
                        this.motionY *= -0.10000000149011612;
                        this.motionZ *= -0.10000000149011612;
                        this.rotationYaw += 180.0f;
                        this.prevRotationYaw += 180.0f;
                        this.ticksInAir = EntityArrow.lIllllllIllIIl[3];
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                    }
                }
                else {
                    final BlockPos llllllllllllIllllIIlIIIlIllIlIIl = llllllllllllIllllIIlIIIlIllllIlI.getBlockPos();
                    this.xTile = llllllllllllIllllIIlIIIlIllIlIIl.getX();
                    this.yTile = llllllllllllIllllIIlIIIlIllIlIIl.getY();
                    this.zTile = llllllllllllIllllIIlIIIlIllIlIIl.getZ();
                    final IBlockState llllllllllllIllllIIlIIIlIllIlIII = this.worldObj.getBlockState(llllllllllllIllllIIlIIIlIllIlIIl);
                    this.inTile = llllllllllllIllllIIlIIIlIllIlIII.getBlock();
                    this.inData = this.inTile.getMetaFromState(llllllllllllIllllIIlIIIlIllIlIII);
                    this.motionX = (float)(llllllllllllIllllIIlIIIlIllllIlI.hitVec.xCoord - this.posX);
                    this.motionY = (float)(llllllllllllIllllIIlIIIlIllllIlI.hitVec.yCoord - this.posY);
                    this.motionZ = (float)(llllllllllllIllllIIlIIIlIllllIlI.hitVec.zCoord - this.posZ);
                    final float llllllllllllIllllIIlIIIlIllIIlll = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                    this.posX -= this.motionX / llllllllllllIllllIIlIIIlIllIIlll * 0.05000000074505806;
                    this.posY -= this.motionY / llllllllllllIllllIIlIIIlIllIIlll * 0.05000000074505806;
                    this.posZ -= this.motionZ / llllllllllllIllllIIlIIIlIllIIlll * 0.05000000074505806;
                    this.playSound(EntityArrow.lIllllllIllIII[EntityArrow.lIllllllIllIIl[1]], 1.0f, 1.2f / (this.rand.nextFloat() * 0.2f + 0.9f));
                    this.inGround = (EntityArrow.lIllllllIllIIl[1] != 0);
                    this.arrowShake = EntityArrow.lIllllllIllIIl[8];
                    this.setIsCritical((boolean)(EntityArrow.lIllllllIllIIl[3] != 0));
                    if (lIIIIlIllllIllll(this.inTile.getMaterial(), Material.air)) {
                        this.inTile.onEntityCollidedWithBlock(this.worldObj, llllllllllllIllllIIlIIIlIllIlIIl, llllllllllllIllllIIlIIIlIllIlIII, this);
                    }
                }
            }
            if (lIIIIlIllllIIlll(this.getIsCritical() ? 1 : 0)) {
                int llllllllllllIllllIIlIIIlIllIIllI = EntityArrow.lIllllllIllIIl[3];
                "".length();
                if ((0x8 ^ 0xD) <= 0) {
                    return;
                }
                while (!lIIIIlIlllllIlII(llllllllllllIllllIIlIIIlIllIIllI, EntityArrow.lIllllllIllIIl[9])) {
                    this.worldObj.spawnParticle(EnumParticleTypes.CRIT, this.posX + this.motionX * llllllllllllIllllIIlIIIlIllIIllI / 4.0, this.posY + this.motionY * llllllllllllIllllIIlIIIlIllIIllI / 4.0, this.posZ + this.motionZ * llllllllllllIllllIIlIIIlIllIIllI / 4.0, -this.motionX, -this.motionY + 0.2, -this.motionZ, new int[EntityArrow.lIllllllIllIIl[3]]);
                    ++llllllllllllIllllIIlIIIlIllIIllI;
                }
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            final float llllllllllllIllllIIlIIIlIllIIlIl = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(MathHelper.func_181159_b(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
            this.rotationPitch = (float)(MathHelper.func_181159_b(this.motionY, llllllllllllIllllIIlIIIlIllIIlIl) * 180.0 / 3.141592653589793);
            "".length();
            if ("   ".length() >= (0x4E ^ 0x4A)) {
                return;
            }
            while (!lIIIIlIllllIlIII(lIIIIlIllllIlllI(this.rotationPitch - this.prevRotationPitch, -180.0f))) {
                this.prevRotationPitch -= 360.0f;
            }
            "".length();
            if ("   ".length() >= (117 + 130 - 112 + 51 ^ 189 + 3 - 57 + 55)) {
                return;
            }
            while (!lIIIIlIlllllIllI(lIIIIlIllllIlIll(this.rotationPitch - this.prevRotationPitch, 180.0f))) {
                this.prevRotationPitch += 360.0f;
            }
            "".length();
            if (((0x6 ^ 0x46 ^ (0xD8 ^ 0xC7)) & (0x61 ^ 0x2 ^ (0x65 ^ 0x59) ^ -" ".length())) > "  ".length()) {
                return;
            }
            while (!lIIIIlIllllIlIII(lIIIIlIllllIlllI(this.rotationYaw - this.prevRotationYaw, -180.0f))) {
                this.prevRotationYaw -= 360.0f;
            }
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
            while (!lIIIIlIlllllIllI(lIIIIlIllllIlIll(this.rotationYaw - this.prevRotationYaw, 180.0f))) {
                this.prevRotationYaw += 360.0f;
            }
            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
            float llllllllllllIllllIIlIIIlIllIIlII = 0.99f;
            final float llllllllllllIllllIIlIIIlIllIIIll = 0.05f;
            if (lIIIIlIllllIIlll(this.isInWater() ? 1 : 0)) {
                int llllllllllllIllllIIlIIIlIllIIIlI = EntityArrow.lIllllllIllIIl[3];
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                while (!lIIIIlIlllllIlII(llllllllllllIllllIIlIIIlIllIIIlI, EntityArrow.lIllllllIllIIl[9])) {
                    final float llllllllllllIllllIIlIIIlIllIIIIl = 0.25f;
                    this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * llllllllllllIllllIIlIIIlIllIIIIl, this.posY - this.motionY * llllllllllllIllllIIlIIIlIllIIIIl, this.posZ - this.motionZ * llllllllllllIllllIIlIIIlIllIIIIl, this.motionX, this.motionY, this.motionZ, new int[EntityArrow.lIllllllIllIIl[3]]);
                    ++llllllllllllIllllIIlIIIlIllIIIlI;
                }
                llllllllllllIllllIIlIIIlIllIIlII = 0.6f;
            }
            if (lIIIIlIllllIIlll(this.isWet() ? 1 : 0)) {
                this.extinguish();
            }
            this.motionX *= llllllllllllIllllIIlIIIlIllIIlII;
            this.motionY *= llllllllllllIllllIIlIIIlIllIIlII;
            this.motionZ *= llllllllllllIllllIIlIIIlIllIIlII;
            this.motionY -= llllllllllllIllllIIlIIIlIllIIIll;
            this.setPosition(this.posX, this.posY, this.posZ);
            this.doBlockCollisions();
        }
    }
    
    private static boolean lIIIIlIllllIllll(final Object llllllllllllIllllIIlIIIIllIlIlll, final Object llllllllllllIllllIIlIIIIllIlIllI) {
        return llllllllllllIllllIIlIIIIllIlIlll != llllllllllllIllllIIlIIIIllIlIllI;
    }
    
    private static int lIIIIlIllllIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
}
