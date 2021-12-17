// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import java.util.Iterator;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.BlockFalling;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.block.material.Material;
import java.util.List;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockAnvil;
import net.minecraft.util.DamageSource;
import com.google.common.collect.Lists;
import net.minecraft.util.MathHelper;
import net.minecraft.nbt.NBTBase;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;

public class EntityFallingBlock extends Entity
{
    private static final /* synthetic */ String[] lIIlIIlIllIIIl;
    public /* synthetic */ NBTTagCompound tileEntityData;
    private static final /* synthetic */ int[] lIIlIIlIllllII;
    public /* synthetic */ boolean shouldDropItem;
    private /* synthetic */ boolean hurtEntities;
    public /* synthetic */ int fallTime;
    private /* synthetic */ int fallHurtMax;
    private /* synthetic */ float fallHurtAmount;
    private /* synthetic */ boolean canSetAsBlock;
    private /* synthetic */ IBlockState fallTile;
    
    public World getWorldObj() {
        return this.worldObj;
    }
    
    private static boolean llIIllIllIIlllI(final int lllllllllllllIIllIllIllIlIIIIIlI, final int lllllllllllllIIllIllIllIlIIIIIIl) {
        return lllllllllllllIIllIllIllIlIIIIIlI > lllllllllllllIIllIllIllIlIIIIIIl;
    }
    
    @Override
    protected void entityInit() {
    }
    
    public EntityFallingBlock(final World lllllllllllllIIllIllIlllIllIllll) {
        super(lllllllllllllIIllIllIlllIllIllll);
        this.shouldDropItem = (EntityFallingBlock.lIIlIIlIllllII[0] != 0);
        this.fallHurtMax = EntityFallingBlock.lIIlIIlIllllII[1];
        this.fallHurtAmount = 2.0f;
    }
    
    @Override
    public boolean canBeCollidedWith() {
        int n;
        if (llIIllIllIIlIII(this.isDead ? 1 : 0)) {
            n = EntityFallingBlock.lIIlIIlIllllII[2];
            "".length();
            if (-"  ".length() > 0) {
                return ((0x46 ^ 0x4) & ~(0x7A ^ 0x38)) != 0x0;
            }
        }
        else {
            n = EntityFallingBlock.lIIlIIlIllllII[0];
        }
        return n != 0;
    }
    
    private static boolean llIIllIllIlIlII(final Object lllllllllllllIIllIllIllIIlllIlIl) {
        return lllllllllllllIIllIllIllIIlllIlIl == null;
    }
    
    private static boolean llIIllIllIlIIII(final int lllllllllllllIIllIllIllIlIIIIllI, final int lllllllllllllIIllIllIllIlIIIIlIl) {
        return lllllllllllllIIllIllIllIlIIIIllI <= lllllllllllllIIllIllIllIlIIIIlIl;
    }
    
    private static String llIIllIlIlIIIIl(final String lllllllllllllIIllIllIllIlIlllIIl, final String lllllllllllllIIllIllIllIlIlllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllIllIllIlIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIllIlIlllIlI.getBytes(StandardCharsets.UTF_8)), EntityFallingBlock.lIIlIIlIllllII[12]), "DES");
            final Cipher lllllllllllllIIllIllIllIlIllllIl = Cipher.getInstance("DES");
            lllllllllllllIIllIllIllIlIllllIl.init(EntityFallingBlock.lIIlIIlIllllII[4], lllllllllllllIIllIllIllIlIlllllI);
            return new String(lllllllllllllIIllIllIllIlIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIllIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIllIlIllllII) {
            lllllllllllllIIllIllIllIlIllllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIllIllIIllll(final int lllllllllllllIIllIllIllIlIIIlllI, final int lllllllllllllIIllIllIllIlIIIllIl) {
        return lllllllllllllIIllIllIllIlIIIlllI >= lllllllllllllIIllIllIllIlIIIllIl;
    }
    
    public IBlockState getBlock() {
        return this.fallTile;
    }
    
    private static boolean llIIllIllIIlIII(final int lllllllllllllIIllIllIllIIlllIIll) {
        return lllllllllllllIIllIllIllIIlllIIll != 0;
    }
    
    @Override
    public boolean canRenderOnFire() {
        return EntityFallingBlock.lIIlIIlIllllII[2] != 0;
    }
    
    private static boolean llIIllIllIIlIlI(final Object lllllllllllllIIllIllIllIIllllIlI, final Object lllllllllllllIIllIllIllIIllllIIl) {
        return lllllllllllllIIllIllIllIIllllIlI == lllllllllllllIIllIllIllIIllllIIl;
    }
    
    private static void llIIllIlIlllllI() {
        (lIIlIIlIllIIIl = new String[EntityFallingBlock.lIIlIIlIllllII[37]])[EntityFallingBlock.lIIlIIlIllllII[2]] = llIIllIlIlIIIIl("h3aBskOeTFM=", "HWIRF");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[0]] = llIIllIlIlIIIlI("jouC5QHG5ws=", "wOzAa");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[4]] = llIIllIlIlIIIIl("qyYPtYVmlcg=", "BzkPb");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[3]] = llIIllIlIlIIIlI("MF60lRC8nfpbDlyxy/+LgA==", "chbOA");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[8]] = llIIllIlIlIIIlI("UJ7+LzPxmk31NbebJXz/Cg==", "jQuZW");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[9]] = llIIllIlIlIIIlI("A+bAuWbELLo=", "wOBaW");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[10]] = llIIllIlIlIIIlI("IMPvDylOpZY=", "mngbL");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[11]] = llIIllIlIlIIIIl("guAnfbtWTiw=", "TFAdc");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[12]] = llIIllIlIlIIIlI("abunn4tIfiI=", "NeZsE");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[13]] = llIIllIlIlIIIlI("SlNd/HF2G8nU9405gqUPMQ==", "Niota");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[14]] = llIIllIlIlIIIIl("Hp4+C8rOMzEMqsz2G731xA==", "SXQsH");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[15]] = llIIllIlIlIIIIl("6xVd45PcMLFfdiaNRSR95g==", "KytlS");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[16]] = llIIllIlIlIIIIl("ASZ+qy+EI7aNEmFY016PDA==", "QTMxt");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[17]] = llIIllIlIlllIlI("DhAVIAQ0DRAxOB4YDSQ=", "ZyyEA");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[18]] = llIIllIlIlllIlI("Dg0BDQ==", "Jlulb");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[20]] = llIIllIlIlIIIlI("4axlCuFVBOE=", "QppYq");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[21]] = llIIllIlIlIIIIl("V6dT3eYar+c=", "bQdhH");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[22]] = llIIllIlIlllIlI("GjA+JysK", "NYRBb");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[24]] = llIIllIlIlIIIlI("jbV1H19s1Jw=", "vXBKa");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[25]] = llIIllIlIlIIIIl("FJjiv9T0eI4=", "XktJc");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[26]] = llIIllIlIlllIlI("ES8LNQ==", "EFfPL");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[27]] = llIIllIlIlIIIlI("Ms0DNoX1btkGlkkvIFKrOQ==", "OmcfR");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[28]] = llIIllIlIlIIIIl("O04c4HhmG5EiV9giWVsccg==", "ndemb");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[29]] = llIIllIlIlIIIlI("a/bSZ9l/59NhrBvwB92S0Q==", "kTgXe");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[30]] = llIIllIlIlIIIlI("hz3bIZRNkFlDqeEO2UZPlg==", "hULVl");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[31]] = llIIllIlIlllIlI("CjMeJAI6JBw=", "NAqTK");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[32]] = llIIllIlIlllIlI("NR82MgYFCDQ=", "qmYBO");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[33]] = llIIllIlIlIIIIl("JwbzfeAzMer9qSHAHBogvw==", "UTlav");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[34]] = llIIllIlIlIIIlI("hVQXzaiPx7gfJp6tn1s+Bg==", "ZmMoi");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[35]] = llIIllIlIlIIIlI("YEjgk0cpTQqWd546ttETX5HcP9QnzDi2", "IPipl");
        EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[36]] = llIIllIlIlIIIlI("cZdKP/vwyplDaeJo/hVRmcIjXhJOG055", "dWeta");
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound lllllllllllllIIllIllIllIlllIllll) {
        Block block;
        if (llIIllIllIIllIl(this.fallTile)) {
            block = this.fallTile.getBlock();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            block = Blocks.air;
        }
        final Block lllllllllllllIIllIllIllIlllIllIl = block;
        final ResourceLocation lllllllllllllIIllIllIllIlllIlIll = Block.blockRegistry.getNameForObject(lllllllllllllIIllIllIllIlllIllIl);
        final String lllllllllllllIIIIIlIIIlIIIIIIllI = EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[9]];
        String string;
        if (llIIllIllIlIlII(lllllllllllllIIllIllIllIlllIlIll)) {
            string = EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[10]];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            string = lllllllllllllIIllIllIllIlllIlIll.toString();
        }
        lllllllllllllIIllIllIllIlllIllll.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
        lllllllllllllIIllIllIllIlllIllll.setByte(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[11]], (byte)lllllllllllllIIllIllIllIlllIllIl.getMetaFromState(this.fallTile));
        lllllllllllllIIllIllIllIlllIllll.setByte(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[12]], (byte)this.fallTime);
        lllllllllllllIIllIllIllIlllIllll.setBoolean(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[13]], this.shouldDropItem);
        lllllllllllllIIllIllIllIlllIllll.setBoolean(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[14]], this.hurtEntities);
        lllllllllllllIIllIllIllIlllIllll.setFloat(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[15]], this.fallHurtAmount);
        lllllllllllllIIllIllIllIlllIllll.setInteger(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[16]], this.fallHurtMax);
        if (llIIllIllIIllIl(this.tileEntityData)) {
            lllllllllllllIIllIllIllIlllIllll.setTag(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[17]], this.tileEntityData);
        }
    }
    
    private static boolean llIIllIllIlIIll(final int lllllllllllllIIllIllIllIIllIllll) {
        return lllllllllllllIIllIllIllIIllIllll < 0;
    }
    
    @Override
    public void fall(final float lllllllllllllIIllIllIlllIIIIlIII, final float lllllllllllllIIllIllIlllIIIllIlI) {
        final Block lllllllllllllIIllIllIlllIIIllIIl = this.fallTile.getBlock();
        if (llIIllIllIIlIII(this.hurtEntities ? 1 : 0)) {
            final int lllllllllllllIIllIllIlllIIIlIlll = MathHelper.ceiling_float_int(lllllllllllllIIllIllIlllIIIIlIII - 1.0f);
            if (llIIllIllIlIIlI(lllllllllllllIIllIllIlllIIIlIlll)) {
                final List<Entity> lllllllllllllIIllIllIlllIIIlIlIl = (List<Entity>)Lists.newArrayList((Iterable)this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox()));
                int n;
                if (llIIllIllIIlIlI(lllllllllllllIIllIllIlllIIIllIIl, Blocks.anvil)) {
                    n = EntityFallingBlock.lIIlIIlIllllII[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n = EntityFallingBlock.lIIlIIlIllllII[2];
                }
                final boolean lllllllllllllIIllIllIlllIIIlIIlI = n != 0;
                DamageSource damageSource;
                if (llIIllIllIIlIII(lllllllllllllIIllIllIlllIIIlIIlI ? 1 : 0)) {
                    damageSource = DamageSource.anvil;
                    "".length();
                    if ((0x79 ^ 0x3C ^ (0x3 ^ 0x43)) == 0x0) {
                        return;
                    }
                }
                else {
                    damageSource = DamageSource.fallingBlock;
                }
                final DamageSource lllllllllllllIIllIllIlllIIIlIIII = damageSource;
                final byte lllllllllllllIIllIllIlllIIIIIIIl = (byte)lllllllllllllIIllIllIlllIIIlIlIl.iterator();
                "".length();
                if (-(0xD ^ 0x51 ^ (0xCC ^ 0x95)) >= 0) {
                    return;
                }
                while (!llIIllIllIIlIll(((Iterator)lllllllllllllIIllIllIlllIIIIIIIl).hasNext() ? 1 : 0)) {
                    final Entity lllllllllllllIIllIllIlllIIIIlllI = ((Iterator<Entity>)lllllllllllllIIllIllIlllIIIIIIIl).next();
                    lllllllllllllIIllIllIlllIIIIlllI.attackEntityFrom(lllllllllllllIIllIllIlllIIIlIIII, (float)Math.min(MathHelper.floor_float(lllllllllllllIIllIllIlllIIIlIlll * this.fallHurtAmount), this.fallHurtMax));
                    "".length();
                }
                if (llIIllIllIIlIII(lllllllllllllIIllIllIlllIIIlIIlI ? 1 : 0) && llIIllIllIlIIll(llIIllIllIlIIIl(this.rand.nextFloat(), 0.05000000074505806 + lllllllllllllIIllIllIlllIIIlIlll * 0.05))) {
                    int lllllllllllllIIllIllIlllIIIIllII = this.fallTile.getValue((IProperty<Integer>)BlockAnvil.DAMAGE);
                    if (llIIllIllIIlllI(++lllllllllllllIIllIllIlllIIIIllII, EntityFallingBlock.lIIlIIlIllllII[4])) {
                        this.canSetAsBlock = (EntityFallingBlock.lIIlIIlIllllII[0] != 0);
                        "".length();
                        if ("   ".length() == "  ".length()) {
                            return;
                        }
                    }
                    else {
                        this.fallTile = this.fallTile.withProperty((IProperty<Comparable>)BlockAnvil.DAMAGE, lllllllllllllIIllIllIlllIIIIllII);
                    }
                }
            }
        }
    }
    
    @Override
    public void onUpdate() {
        final Block lllllllllllllIIllIllIlllIlIIlIII = this.fallTile.getBlock();
        if (llIIllIllIIlIlI(lllllllllllllIIllIllIlllIlIIlIII.getMaterial(), Material.air)) {
            this.setDead();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            final int fallTime = this.fallTime;
            this.fallTime = fallTime + EntityFallingBlock.lIIlIIlIllllII[0];
            if (llIIllIllIIlIll(fallTime)) {
                final BlockPos lllllllllllllIIllIllIlllIlIIIllI = new BlockPos(this);
                if (llIIllIllIIlIlI(this.worldObj.getBlockState(lllllllllllllIIllIllIlllIlIIIllI).getBlock(), lllllllllllllIIllIllIlllIlIIlIII)) {
                    this.worldObj.setBlockToAir(lllllllllllllIIllIllIlllIlIIIllI);
                    "".length();
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return;
                    }
                }
                else if (llIIllIllIIlIll(this.worldObj.isRemote ? 1 : 0)) {
                    this.setDead();
                    return;
                }
            }
            this.motionY -= 0.03999999910593033;
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.9800000190734863;
            this.motionY *= 0.9800000190734863;
            this.motionZ *= 0.9800000190734863;
            if (llIIllIllIIlIll(this.worldObj.isRemote ? 1 : 0)) {
                final BlockPos lllllllllllllIIllIllIlllIlIIIlII = new BlockPos(this);
                if (llIIllIllIIlIII(this.onGround ? 1 : 0)) {
                    this.motionX *= 0.699999988079071;
                    this.motionZ *= 0.699999988079071;
                    this.motionY *= -0.5;
                    if (llIIllIllIIllII(this.worldObj.getBlockState(lllllllllllllIIllIllIlllIlIIIlII).getBlock(), Blocks.piston_extension)) {
                        this.setDead();
                        if (llIIllIllIIlIll(this.canSetAsBlock ? 1 : 0)) {
                            if (llIIllIllIIlIII(this.worldObj.canBlockBePlaced(lllllllllllllIIllIllIlllIlIIlIII, lllllllllllllIIllIllIlllIlIIIlII, (boolean)(EntityFallingBlock.lIIlIIlIllllII[0] != 0), EnumFacing.UP, null, null) ? 1 : 0) && llIIllIllIIlIll(BlockFalling.canFallInto(this.worldObj, lllllllllllllIIllIllIlllIlIIIlII.down()) ? 1 : 0) && llIIllIllIIlIII(this.worldObj.setBlockState(lllllllllllllIIllIllIlllIlIIIlII, this.fallTile, EntityFallingBlock.lIIlIIlIllllII[3]) ? 1 : 0)) {
                                if (llIIllIllIIlIII((lllllllllllllIIllIllIlllIlIIlIII instanceof BlockFalling) ? 1 : 0)) {
                                    ((BlockFalling)lllllllllllllIIllIllIlllIlIIlIII).onEndFalling(this.worldObj, lllllllllllllIIllIllIlllIlIIIlII);
                                }
                                if (llIIllIllIIllIl(this.tileEntityData) && llIIllIllIIlIII((lllllllllllllIIllIllIlllIlIIlIII instanceof ITileEntityProvider) ? 1 : 0)) {
                                    final TileEntity lllllllllllllIIllIllIlllIlIIIIlI = this.worldObj.getTileEntity(lllllllllllllIIllIllIlllIlIIIlII);
                                    if (llIIllIllIIllIl(lllllllllllllIIllIllIlllIlIIIIlI)) {
                                        final NBTTagCompound lllllllllllllIIllIllIlllIIllllll = new NBTTagCompound();
                                        lllllllllllllIIllIllIlllIlIIIIlI.writeToNBT(lllllllllllllIIllIllIlllIIllllll);
                                        final long lllllllllllllIIllIllIlllIIlIlllI = (long)this.tileEntityData.getKeySet().iterator();
                                        "".length();
                                        if (-"   ".length() > 0) {
                                            return;
                                        }
                                        while (!llIIllIllIIlIll(((Iterator)lllllllllllllIIllIllIlllIIlIlllI).hasNext() ? 1 : 0)) {
                                            final String lllllllllllllIIllIllIlllIIllllIl = ((Iterator<String>)lllllllllllllIIllIllIlllIIlIlllI).next();
                                            final NBTBase lllllllllllllIIllIllIlllIIlllIll = this.tileEntityData.getTag(lllllllllllllIIllIllIlllIIllllIl);
                                            if (llIIllIllIIlIll(lllllllllllllIIllIllIlllIIllllIl.equals(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[2]]) ? 1 : 0) && llIIllIllIIlIll(lllllllllllllIIllIllIlllIIllllIl.equals(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[0]]) ? 1 : 0) && llIIllIllIIlIll(lllllllllllllIIllIllIlllIIllllIl.equals(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[4]]) ? 1 : 0)) {
                                                lllllllllllllIIllIllIlllIIllllll.setTag(lllllllllllllIIllIllIlllIIllllIl, lllllllllllllIIllIllIlllIIlllIll.copy());
                                            }
                                        }
                                        lllllllllllllIIllIllIlllIlIIIIlI.readFromNBT(lllllllllllllIIllIllIlllIIllllll);
                                        lllllllllllllIIllIllIlllIlIIIIlI.markDirty();
                                        "".length();
                                        if ("  ".length() == 0) {
                                            return;
                                        }
                                    }
                                }
                            }
                            else if (llIIllIllIIlIII(this.shouldDropItem ? 1 : 0) && llIIllIllIIlIII(this.worldObj.getGameRules().getBoolean(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[3]]) ? 1 : 0)) {
                                this.entityDropItem(new ItemStack(lllllllllllllIIllIllIlllIlIIlIII, EntityFallingBlock.lIIlIIlIllllII[0], lllllllllllllIIllIllIlllIlIIlIII.damageDropped(this.fallTile)), 0.0f);
                                "".length();
                                "".length();
                                if ("  ".length() == 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
                else if ((llIIllIllIIlllI(this.fallTime, EntityFallingBlock.lIIlIIlIllllII[5]) && llIIllIllIIlIll(this.worldObj.isRemote ? 1 : 0) && (!llIIllIllIIllll(lllllllllllllIIllIllIlllIlIIIlII.getY(), EntityFallingBlock.lIIlIIlIllllII[0]) || !llIIllIllIlIIII(lllllllllllllIIllIllIlllIlIIIlII.getY(), EntityFallingBlock.lIIlIIlIllllII[6]))) || llIIllIllIIlllI(this.fallTime, EntityFallingBlock.lIIlIIlIllllII[7])) {
                    if (llIIllIllIIlIII(this.shouldDropItem ? 1 : 0) && llIIllIllIIlIII(this.worldObj.getGameRules().getBoolean(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[8]]) ? 1 : 0)) {
                        this.entityDropItem(new ItemStack(lllllllllllllIIllIllIlllIlIIlIII, EntityFallingBlock.lIIlIIlIllllII[0], lllllllllllllIIllIllIlllIlIIlIII.damageDropped(this.fallTile)), 0.0f);
                        "".length();
                    }
                    this.setDead();
                }
            }
        }
    }
    
    static {
        llIIllIllIIIlll();
        llIIllIlIlllllI();
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityFallingBlock.lIIlIIlIllllII[2] != 0;
    }
    
    private static boolean llIIllIllIIllII(final Object lllllllllllllIIllIllIllIIllllllI, final Object lllllllllllllIIllIllIllIIlllllIl) {
        return lllllllllllllIIllIllIllIIllllllI != lllllllllllllIIllIllIllIIlllllIl;
    }
    
    @Override
    public void addEntityCrashInfo(final CrashReportCategory lllllllllllllIIllIllIllIllIIlIlI) {
        super.addEntityCrashInfo(lllllllllllllIIllIllIllIllIIlIlI);
        if (llIIllIllIIllIl(this.fallTile)) {
            final Block lllllllllllllIIllIllIllIllIIlIIl = this.fallTile.getBlock();
            lllllllllllllIIllIllIllIllIIlIlI.addCrashSection(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[35]], Block.getIdFromBlock(lllllllllllllIIllIllIllIllIIlIIl));
            lllllllllllllIIllIllIllIllIIlIlI.addCrashSection(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[36]], lllllllllllllIIllIllIllIllIIlIIl.getMetaFromState(this.fallTile));
        }
    }
    
    private static boolean llIIllIllIlIlIl(final int lllllllllllllIIllIllIllIlIIIlIlI, final int lllllllllllllIIllIllIllIlIIIlIIl) {
        return lllllllllllllIIllIllIllIlIIIlIlI < lllllllllllllIIllIllIllIlIIIlIIl;
    }
    
    private static boolean llIIllIllIlIIlI(final int lllllllllllllIIllIllIllIIllIllIl) {
        return lllllllllllllIIllIllIllIIllIllIl > 0;
    }
    
    private static String llIIllIlIlIIIlI(final String lllllllllllllIIllIllIllIlIIlIllI, final String lllllllllllllIIllIllIllIlIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIllIllIlIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIllIllIlIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIllIllIlIIllIII.init(EntityFallingBlock.lIIlIIlIllllII[4], lllllllllllllIIllIllIllIlIIllIIl);
            return new String(lllllllllllllIIllIllIllIlIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIllIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIllIlIIlIlll) {
            lllllllllllllIIllIllIllIlIIlIlll.printStackTrace();
            return null;
        }
    }
    
    public EntityFallingBlock(final World lllllllllllllIIllIllIlllIllIIIIl, final double lllllllllllllIIllIllIlllIllIIIII, final double lllllllllllllIIllIllIlllIllIIlIl, final double lllllllllllllIIllIllIlllIlIllllI, final IBlockState lllllllllllllIIllIllIlllIllIIIll) {
        super(lllllllllllllIIllIllIlllIllIIIIl);
        this.shouldDropItem = (EntityFallingBlock.lIIlIIlIllllII[0] != 0);
        this.fallHurtMax = EntityFallingBlock.lIIlIIlIllllII[1];
        this.fallHurtAmount = 2.0f;
        this.fallTile = lllllllllllllIIllIllIlllIllIIIll;
        this.preventEntitySpawning = (EntityFallingBlock.lIIlIIlIllllII[0] != 0);
        this.setSize(0.98f, 0.98f);
        this.setPosition(lllllllllllllIIllIllIlllIllIIIII, lllllllllllllIIllIllIlllIllIIlIl, lllllllllllllIIllIllIlllIlIllllI);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = lllllllllllllIIllIllIlllIllIIIII;
        this.prevPosY = lllllllllllllIIllIllIlllIllIIlIl;
        this.prevPosZ = lllllllllllllIIllIllIlllIlIllllI;
    }
    
    private static boolean llIIllIllIIlIll(final int lllllllllllllIIllIllIllIIlllIIIl) {
        return lllllllllllllIIllIllIllIIlllIIIl == 0;
    }
    
    public void setHurtEntities(final boolean lllllllllllllIIllIllIllIllIlIIII) {
        this.hurtEntities = lllllllllllllIIllIllIllIllIlIIII;
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound lllllllllllllIIllIllIllIllIlllll) {
        final int lllllllllllllIIllIllIllIllIllllI = lllllllllllllIIllIllIllIllIlllll.getByte(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[18]]) & EntityFallingBlock.lIIlIIlIllllII[19];
        if (llIIllIllIIlIII(lllllllllllllIIllIllIllIllIlllll.hasKey(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[20]], EntityFallingBlock.lIIlIIlIllllII[12]) ? 1 : 0)) {
            this.fallTile = Block.getBlockFromName(lllllllllllllIIllIllIllIllIlllll.getString(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[21]])).getStateFromMeta(lllllllllllllIIllIllIllIllIllllI);
            "".length();
            if (((59 + 158 - 123 + 80 ^ 93 + 135 - 66 + 0) & (0xF ^ 0x34 ^ (0x35 ^ 0x2) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llIIllIllIIlIII(lllllllllllllIIllIllIllIllIlllll.hasKey(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[22]], EntityFallingBlock.lIIlIIlIllllII[23]) ? 1 : 0)) {
            this.fallTile = Block.getBlockById(lllllllllllllIIllIllIllIllIlllll.getInteger(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[24]])).getStateFromMeta(lllllllllllllIIllIllIllIllIllllI);
            "".length();
            if ("  ".length() <= ((0x1 ^ 0x4E ^ (0x59 ^ 0x2)) & (104 + 140 - 128 + 29 ^ 50 + 106 - 30 + 7 ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.fallTile = Block.getBlockById(lllllllllllllIIllIllIllIllIlllll.getByte(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[25]]) & EntityFallingBlock.lIIlIIlIllllII[19]).getStateFromMeta(lllllllllllllIIllIllIllIllIllllI);
        }
        this.fallTime = (lllllllllllllIIllIllIllIllIlllll.getByte(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[26]]) & EntityFallingBlock.lIIlIIlIllllII[19]);
        final Block lllllllllllllIIllIllIllIllIlllIl = this.fallTile.getBlock();
        if (llIIllIllIIlIII(lllllllllllllIIllIllIllIllIlllll.hasKey(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[27]], EntityFallingBlock.lIIlIIlIllllII[23]) ? 1 : 0)) {
            this.hurtEntities = lllllllllllllIIllIllIllIllIlllll.getBoolean(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[28]]);
            this.fallHurtAmount = lllllllllllllIIllIllIllIllIlllll.getFloat(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[29]]);
            this.fallHurtMax = lllllllllllllIIllIllIllIllIlllll.getInteger(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[30]]);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else if (llIIllIllIIlIlI(lllllllllllllIIllIllIllIllIlllIl, Blocks.anvil)) {
            this.hurtEntities = (EntityFallingBlock.lIIlIIlIllllII[0] != 0);
        }
        if (llIIllIllIIlIII(lllllllllllllIIllIllIllIllIlllll.hasKey(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[31]], EntityFallingBlock.lIIlIIlIllllII[23]) ? 1 : 0)) {
            this.shouldDropItem = lllllllllllllIIllIllIllIllIlllll.getBoolean(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[32]]);
        }
        if (llIIllIllIIlIII(lllllllllllllIIllIllIllIllIlllll.hasKey(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[33]], EntityFallingBlock.lIIlIIlIllllII[14]) ? 1 : 0)) {
            this.tileEntityData = lllllllllllllIIllIllIllIllIlllll.getCompoundTag(EntityFallingBlock.lIIlIIlIllIIIl[EntityFallingBlock.lIIlIIlIllllII[34]]);
        }
        if (!llIIllIllIIllIl(lllllllllllllIIllIllIllIllIlllIl) || llIIllIllIIlIlI(lllllllllllllIIllIllIllIllIlllIl.getMaterial(), Material.air)) {
            this.fallTile = Blocks.sand.getDefaultState();
        }
    }
    
    private static boolean llIIllIllIIllIl(final Object lllllllllllllIIllIllIllIIlllIlll) {
        return lllllllllllllIIllIllIllIIlllIlll != null;
    }
    
    private static int llIIllIllIlIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void llIIllIllIIIlll() {
        (lIIlIIlIllllII = new int[38])[0] = " ".length();
        EntityFallingBlock.lIIlIIlIllllII[1] = (0x46 ^ 0x6E);
        EntityFallingBlock.lIIlIIlIllllII[2] = ((0x69 ^ 0x53) & ~(0xB1 ^ 0x8B));
        EntityFallingBlock.lIIlIIlIllllII[3] = "   ".length();
        EntityFallingBlock.lIIlIIlIllllII[4] = "  ".length();
        EntityFallingBlock.lIIlIIlIllllII[5] = (0x28 ^ 0x3D ^ (0xC ^ 0x7D));
        EntityFallingBlock.lIIlIIlIllllII[6] = (0xFFFFDD0C & 0x23F3);
        EntityFallingBlock.lIIlIIlIllllII[7] = (-(0xFFFFBEF7 & 0x7DAB) & (0xFFFFBFFF & 0x7EFA));
        EntityFallingBlock.lIIlIIlIllllII[8] = (0x16 ^ 0x12);
        EntityFallingBlock.lIIlIIlIllllII[9] = (65 + 24 - 2 + 72 ^ 33 + 66 + 3 + 52);
        EntityFallingBlock.lIIlIIlIllllII[10] = (0x64 ^ 0x62);
        EntityFallingBlock.lIIlIIlIllllII[11] = (0x0 ^ 0x7);
        EntityFallingBlock.lIIlIIlIllllII[12] = (0x23 ^ 0x4F ^ (0xFE ^ 0x9A));
        EntityFallingBlock.lIIlIIlIllllII[13] = (0x7C ^ 0x75);
        EntityFallingBlock.lIIlIIlIllllII[14] = (0xD0 ^ 0xA3 ^ (0x67 ^ 0x1E));
        EntityFallingBlock.lIIlIIlIllllII[15] = (162 + 178 - 315 + 181 ^ 15 + 106 - 104 + 180);
        EntityFallingBlock.lIIlIIlIllllII[16] = (0x8B ^ 0x87);
        EntityFallingBlock.lIIlIIlIllllII[17] = (0x69 ^ 0x64);
        EntityFallingBlock.lIIlIIlIllllII[18] = (0x2B ^ 0x3C ^ (0xD8 ^ 0xC1));
        EntityFallingBlock.lIIlIIlIllllII[19] = 237 + 153 - 136 + 1;
        EntityFallingBlock.lIIlIIlIllllII[20] = (0x51 ^ 0x39 ^ (0x3F ^ 0x58));
        EntityFallingBlock.lIIlIIlIllllII[21] = (0x4E ^ 0x5E);
        EntityFallingBlock.lIIlIIlIllllII[22] = (19 + 142 - 27 + 42 ^ 57 + 6 - 41 + 139);
        EntityFallingBlock.lIIlIIlIllllII[23] = (0x7A ^ 0x1C ^ (0x5E ^ 0x5B));
        EntityFallingBlock.lIIlIIlIllllII[24] = (0x22 ^ 0x30);
        EntityFallingBlock.lIIlIIlIllllII[25] = (0x57 ^ 0xE ^ (0xFE ^ 0xB4));
        EntityFallingBlock.lIIlIIlIllllII[26] = (0x41 ^ 0x55);
        EntityFallingBlock.lIIlIIlIllllII[27] = (0x56 ^ 0x43);
        EntityFallingBlock.lIIlIIlIllllII[28] = (0x17 ^ 0x1);
        EntityFallingBlock.lIIlIIlIllllII[29] = (87 + 86 - 138 + 109 ^ 84 + 8 - 75 + 118);
        EntityFallingBlock.lIIlIIlIllllII[30] = (0x7C ^ 0x64);
        EntityFallingBlock.lIIlIIlIllllII[31] = (0xBA ^ 0xA3);
        EntityFallingBlock.lIIlIIlIllllII[32] = (0x74 ^ 0x44 ^ (0xEC ^ 0xC6));
        EntityFallingBlock.lIIlIIlIllllII[33] = (0xD0 ^ 0xB8 ^ (0xF4 ^ 0x87));
        EntityFallingBlock.lIIlIIlIllllII[34] = (15 + 118 - 3 + 55 ^ 29 + 164 - 121 + 93);
        EntityFallingBlock.lIIlIIlIllllII[35] = (0x77 ^ 0x6A);
        EntityFallingBlock.lIIlIIlIllllII[36] = (0x7A ^ 0x64);
        EntityFallingBlock.lIIlIIlIllllII[37] = (0x53 ^ 0x6 ^ (0xDB ^ 0x91));
    }
    
    private static String llIIllIlIlllIlI(String lllllllllllllIIllIllIllIlIlIIllI, final String lllllllllllllIIllIllIllIlIlIlIlI) {
        lllllllllllllIIllIllIllIlIlIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIllIllIllIlIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIllIllIlIlIlIIl = new StringBuilder();
        final char[] lllllllllllllIIllIllIllIlIlIlIII = lllllllllllllIIllIllIllIlIlIlIlI.toCharArray();
        int lllllllllllllIIllIllIllIlIlIIlll = EntityFallingBlock.lIIlIIlIllllII[2];
        final char lllllllllllllIIllIllIllIlIlIIIIl = (Object)lllllllllllllIIllIllIllIlIlIIllI.toCharArray();
        final char lllllllllllllIIllIllIllIlIlIIIII = (char)lllllllllllllIIllIllIllIlIlIIIIl.length;
        int lllllllllllllIIllIllIllIlIIlllll = EntityFallingBlock.lIIlIIlIllllII[2];
        while (llIIllIllIlIlIl(lllllllllllllIIllIllIllIlIIlllll, lllllllllllllIIllIllIllIlIlIIIII)) {
            final char lllllllllllllIIllIllIllIlIlIllII = lllllllllllllIIllIllIllIlIlIIIIl[lllllllllllllIIllIllIllIlIIlllll];
            lllllllllllllIIllIllIllIlIlIlIIl.append((char)(lllllllllllllIIllIllIllIlIlIllII ^ lllllllllllllIIllIllIllIlIlIlIII[lllllllllllllIIllIllIllIlIlIIlll % lllllllllllllIIllIllIllIlIlIlIII.length]));
            "".length();
            ++lllllllllllllIIllIllIllIlIlIIlll;
            ++lllllllllllllIIllIllIllIlIIlllll;
            "".length();
            if (" ".length() == (0xD3 ^ 0x96 ^ (0xFC ^ 0xBD))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIllIllIlIlIlIIl);
    }
}
