// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.init;

import net.minecraft.stats.StatList;
import net.minecraft.block.BlockFire;
import java.io.OutputStream;
import net.minecraft.util.LoggingPrintStream;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.StringUtils;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.block.BlockSkull;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.item.ItemDye;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.BlockTNT;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLiquid;
import net.minecraft.item.ItemBucket;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.IProjectile;
import net.minecraft.dispenser.IPosition;
import net.minecraft.world.World;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.block.BlockDispenser;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.LogManager;
import java.io.PrintStream;
import org.apache.logging.log4j.Logger;

public class Bootstrap
{
    private static final /* synthetic */ Logger LOGGER;
    private static final /* synthetic */ int[] lIIIllIIlIllIl;
    private static /* synthetic */ boolean alreadyRegistered;
    private static final /* synthetic */ PrintStream SYSOUT;
    private static final /* synthetic */ String[] lIIIllIIlIlIll;
    
    static {
        llIIIIllIllllIl();
        llIIIIllIlllIlI();
        SYSOUT = System.out;
        Bootstrap.alreadyRegistered = (Bootstrap.lIIIllIIlIllIl[0] != 0);
        LOGGER = LogManager.getLogger();
    }
    
    private static String llIIIIllIlllIIl(final String lllllllllllllIlIIIIIlIIllIlllllI, final String lllllllllllllIlIIIIIlIIllIllllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIIlllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIIllIllllll.getBytes(StandardCharsets.UTF_8)), Bootstrap.lIIIllIIlIllIl[3]), "DES");
            final Cipher lllllllllllllIlIIIIIlIIlllIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlIIlllIIIIlI.init(Bootstrap.lIIIllIIlIllIl[2], lllllllllllllIlIIIIIlIIlllIIIIll);
            return new String(lllllllllllllIlIIIIIlIIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIIlllIIIIIl) {
            lllllllllllllIlIIIIIlIIlllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIIllIllllll(final int lllllllllllllIlIIIIIlIIllIllIlIl) {
        return lllllllllllllIlIIIIIlIIllIllIlIl != 0;
    }
    
    private static void llIIIIllIlllIlI() {
        (lIIIllIIlIlIll = new String[Bootstrap.lIIIllIIlIllIl[2]])[Bootstrap.lIIIllIIlIllIl[0]] = llIIIIllIlllIII("JgIjBz0n", "uVgBo");
        Bootstrap.lIIIllIIlIlIll[Bootstrap.lIIIllIIlIllIl[1]] = llIIIIllIlllIIl("dgw8Of21LKU=", "RQrJF");
    }
    
    public static boolean isRegistered() {
        return Bootstrap.alreadyRegistered;
    }
    
    static void registerDispenserBehaviors() {
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.arrow, new BehaviorProjectileDispense() {
            private static final /* synthetic */ int[] lllIlllIlIlllI;
            
            @Override
            protected IProjectile getProjectileEntity(final World llllllllllllIlIllIIIIIllllIIllll, final IPosition llllllllllllIlIllIIIIIllllIIlIIl) {
                final EntityArrow llllllllllllIlIllIIIIIllllIIllII = new EntityArrow(llllllllllllIlIllIIIIIllllIIllll, llllllllllllIlIllIIIIIllllIIlIIl.getX(), llllllllllllIlIllIIIIIllllIIlIIl.getY(), llllllllllllIlIllIIIIIllllIIlIIl.getZ());
                llllllllllllIlIllIIIIIllllIIllII.canBePickedUp = Bootstrap$1.lllIlllIlIlllI[0];
                return llllllllllllIlIllIIIIIllllIIllII;
            }
            
            static {
                lIlIIlIllIlllllI();
            }
            
            private static void lIlIIlIllIlllllI() {
                (lllIlllIlIlllI = new int[1])[0] = " ".length();
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.egg, new BehaviorProjectileDispense() {
            @Override
            protected IProjectile getProjectileEntity(final World lllllllllllllIIIIIIlIIlllIIIIlII, final IPosition lllllllllllllIIIIIIlIIlllIIIIIll) {
                return new EntityEgg(lllllllllllllIIIIIIlIIlllIIIIlII, lllllllllllllIIIIIIlIIlllIIIIIll.getX(), lllllllllllllIIIIIIlIIlllIIIIIll.getY(), lllllllllllllIIIIIIlIIlllIIIIIll.getZ());
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.snowball, new BehaviorProjectileDispense() {
            @Override
            protected IProjectile getProjectileEntity(final World llllllllllllIlIllIlllIlIlIIIIIlI, final IPosition llllllllllllIlIllIlllIlIlIIIIIIl) {
                return new EntitySnowball(llllllllllllIlIllIlllIlIlIIIIIlI, llllllllllllIlIllIlllIlIlIIIIIIl.getX(), llllllllllllIlIllIlllIlIlIIIIIIl.getY(), llllllllllllIlIllIlllIlIlIIIIIIl.getZ());
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.experience_bottle, new BehaviorProjectileDispense() {
            @Override
            protected float func_82498_a() {
                return super.func_82498_a() * 0.5f;
            }
            
            @Override
            protected IProjectile getProjectileEntity(final World lllllllllllllIIIIIlIIIllllIIlIll, final IPosition lllllllllllllIIIIIlIIIllllIIIllI) {
                return new EntityExpBottle(lllllllllllllIIIIIlIIIllllIIlIll, lllllllllllllIIIIIlIIIllllIIIllI.getX(), lllllllllllllIIIIIlIIIllllIIIllI.getY(), lllllllllllllIIIIIlIIIllllIIIllI.getZ());
            }
            
            @Override
            protected float func_82500_b() {
                return super.func_82500_b() * 1.25f;
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.potionitem, new IBehaviorDispenseItem() {
            private final /* synthetic */ BehaviorDefaultDispenseItem field_150843_b = new BehaviorDefaultDispenseItem();
            
            private static boolean lIlIIlIllIIIllll(final int llllllllllllIlIllIIIIllIIIlIIIll) {
                return llllllllllllIlIllIIIIllIIIlIIIll != 0;
            }
            
            @Override
            public ItemStack dispense(final IBlockSource llllllllllllIlIllIIIIllIIIlIIllI, final ItemStack llllllllllllIlIllIIIIllIIIlIIlIl) {
                ItemStack itemStack;
                if (lIlIIlIllIIIllll(ItemPotion.isSplash(llllllllllllIlIllIIIIllIIIlIIlIl.getMetadata()) ? 1 : 0)) {
                    itemStack = new BehaviorProjectileDispense() {
                        @Override
                        protected float func_82498_a() {
                            return super.func_82498_a() * 0.5f;
                        }
                        
                        @Override
                        protected float func_82500_b() {
                            return super.func_82500_b() * 1.25f;
                        }
                        
                        @Override
                        protected IProjectile getProjectileEntity(final World lllllllllllllIlIlllIIlIlllIIIIIl, final IPosition lllllllllllllIlIlllIIlIlllIIIIII) {
                            return new EntityPotion(lllllllllllllIlIlllIIlIlllIIIIIl, lllllllllllllIlIlllIIlIlllIIIIII.getX(), lllllllllllllIlIlllIIlIlllIIIIII.getY(), lllllllllllllIlIlllIIlIlllIIIIII.getZ(), llllllllllllIlIllIIIIllIIIlIIlIl.copy());
                        }
                    }.dispense(llllllllllllIlIllIIIIllIIIlIIllI, llllllllllllIlIllIIIIllIIIlIIlIl);
                    "".length();
                    if (-" ".length() >= 0) {
                        return null;
                    }
                }
                else {
                    itemStack = this.field_150843_b.dispense(llllllllllllIlIllIIIIllIIIlIIllI, llllllllllllIlIllIIIIllIIIlIIlIl);
                }
                return itemStack;
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.spawn_egg, new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] lIllIIIlIlllll;
            
            public ItemStack dispenseStack(final IBlockSource lllllllllllllIIIIIllIIIIIlIIllll, final ItemStack lllllllllllllIIIIIllIIIIIlIIlllI) {
                final EnumFacing lllllllllllllIIIIIllIIIIIlIlIlII = BlockDispenser.getFacing(lllllllllllllIIIIIllIIIIIlIIllll.getBlockMetadata());
                final double lllllllllllllIIIIIllIIIIIlIlIIll = lllllllllllllIIIIIllIIIIIlIIllll.getX() + lllllllllllllIIIIIllIIIIIlIlIlII.getFrontOffsetX();
                final double lllllllllllllIIIIIllIIIIIlIlIIlI = lllllllllllllIIIIIllIIIIIlIIllll.getBlockPos().getY() + 0.2f;
                final double lllllllllllllIIIIIllIIIIIlIlIIIl = lllllllllllllIIIIIllIIIIIlIIllll.getZ() + lllllllllllllIIIIIllIIIIIlIlIlII.getFrontOffsetZ();
                final Entity lllllllllllllIIIIIllIIIIIlIlIIII = ItemMonsterPlacer.spawnCreature(lllllllllllllIIIIIllIIIIIlIIllll.getWorld(), lllllllllllllIIIIIllIIIIIlIIlllI.getMetadata(), lllllllllllllIIIIIllIIIIIlIlIIll, lllllllllllllIIIIIllIIIIIlIlIIlI, lllllllllllllIIIIIllIIIIIlIlIIIl);
                if (lllllIIIIlIIllI((lllllllllllllIIIIIllIIIIIlIlIIII instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIlIIllI(lllllllllllllIIIIIllIIIIIlIIlllI.hasDisplayName() ? 1 : 0)) {
                    ((EntityLiving)lllllllllllllIIIIIllIIIIIlIlIIII).setCustomNameTag(lllllllllllllIIIIIllIIIIIlIIlllI.getDisplayName());
                }
                lllllllllllllIIIIIllIIIIIlIIlllI.splitStack(Bootstrap$6.lIllIIIlIlllll[0]);
                "".length();
                return lllllllllllllIIIIIllIIIIIlIIlllI;
            }
            
            private static boolean lllllIIIIlIIllI(final int lllllllllllllIIIIIllIIIIIlIIIlll) {
                return lllllllllllllIIIIIllIIIIIlIIIlll != 0;
            }
            
            static {
                lllllIIIIlIIlIl();
            }
            
            private static void lllllIIIIlIIlIl() {
                (lIllIIIlIlllll = new int[1])[0] = " ".length();
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.fireworks, new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] lllIIlIlIIlIll;
            
            @Override
            protected void playDispenseSound(final IBlockSource llllllllllllIlIllllIlIIIlIIlIIIl) {
                llllllllllllIlIllllIlIIIlIIlIIIl.getWorld().playAuxSFX(Bootstrap$7.lllIIlIlIIlIll[1], llllllllllllIlIllllIlIIIlIIlIIIl.getBlockPos(), Bootstrap$7.lllIIlIlIIlIll[2]);
            }
            
            public ItemStack dispenseStack(final IBlockSource llllllllllllIlIllllIlIIIlIIllIll, final ItemStack llllllllllllIlIllllIlIIIlIlIIIIl) {
                final EnumFacing llllllllllllIlIllllIlIIIlIlIIIII = BlockDispenser.getFacing(llllllllllllIlIllllIlIIIlIIllIll.getBlockMetadata());
                final double llllllllllllIlIllllIlIIIlIIlllll = llllllllllllIlIllllIlIIIlIIllIll.getX() + llllllllllllIlIllllIlIIIlIlIIIII.getFrontOffsetX();
                final double llllllllllllIlIllllIlIIIlIIllllI = llllllllllllIlIllllIlIIIlIIllIll.getBlockPos().getY() + 0.2f;
                final double llllllllllllIlIllllIlIIIlIIlllIl = llllllllllllIlIllllIlIIIlIIllIll.getZ() + llllllllllllIlIllllIlIIIlIlIIIII.getFrontOffsetZ();
                final EntityFireworkRocket llllllllllllIlIllllIlIIIlIIlllII = new EntityFireworkRocket(llllllllllllIlIllllIlIIIlIIllIll.getWorld(), llllllllllllIlIllllIlIIIlIIlllll, llllllllllllIlIllllIlIIIlIIllllI, llllllllllllIlIllllIlIIIlIIlllIl, llllllllllllIlIllllIlIIIlIlIIIIl);
                llllllllllllIlIllllIlIIIlIIllIll.getWorld().spawnEntityInWorld(llllllllllllIlIllllIlIIIlIIlllII);
                "".length();
                llllllllllllIlIllllIlIIIlIlIIIIl.splitStack(Bootstrap$7.lllIIlIlIIlIll[0]);
                "".length();
                return llllllllllllIlIllllIlIIIlIlIIIIl;
            }
            
            static {
                lIIllllllIIllllI();
            }
            
            private static void lIIllllllIIllllI() {
                (lllIIlIlIIlIll = new int[3])[0] = " ".length();
                Bootstrap$7.lllIIlIlIIlIll[1] = (0xFFFFE7EB & 0x1BFE);
                Bootstrap$7.lllIIlIlIIlIll[2] = ((0x43 ^ 0x63) & ~(0xB0 ^ 0x90));
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.fire_charge, new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] lIlIllIIllIlII;
            
            @Override
            protected void playDispenseSound(final IBlockSource lllllllllllllIIIIllIllllIIIlIlIl) {
                lllllllllllllIIIIllIllllIIIlIlIl.getWorld().playAuxSFX(Bootstrap$8.lIlIllIIllIlII[1], lllllllllllllIIIIllIllllIIIlIlIl.getBlockPos(), Bootstrap$8.lIlIllIIllIlII[2]);
            }
            
            static {
                llllIIIlIIlIlll();
            }
            
            public ItemStack dispenseStack(final IBlockSource lllllllllllllIIIIllIllllIIlIllll, final ItemStack lllllllllllllIIIIllIllllIIlIlllI) {
                final EnumFacing lllllllllllllIIIIllIllllIIlIllIl = BlockDispenser.getFacing(lllllllllllllIIIIllIllllIIlIllll.getBlockMetadata());
                final IPosition lllllllllllllIIIIllIllllIIlIllII = BlockDispenser.getDispensePosition(lllllllllllllIIIIllIllllIIlIllll);
                final double lllllllllllllIIIIllIllllIIlIlIll = lllllllllllllIIIIllIllllIIlIllII.getX() + lllllllllllllIIIIllIllllIIlIllIl.getFrontOffsetX() * 0.3f;
                final double lllllllllllllIIIIllIllllIIlIlIlI = lllllllllllllIIIIllIllllIIlIllII.getY() + lllllllllllllIIIIllIllllIIlIllIl.getFrontOffsetY() * 0.3f;
                final double lllllllllllllIIIIllIllllIIlIlIIl = lllllllllllllIIIIllIllllIIlIllII.getZ() + lllllllllllllIIIIllIllllIIlIllIl.getFrontOffsetZ() * 0.3f;
                final World lllllllllllllIIIIllIllllIIlIlIII = lllllllllllllIIIIllIllllIIlIllll.getWorld();
                final Random lllllllllllllIIIIllIllllIIlIIlll = lllllllllllllIIIIllIllllIIlIlIII.rand;
                final double lllllllllllllIIIIllIllllIIlIIllI = lllllllllllllIIIIllIllllIIlIIlll.nextGaussian() * 0.05 + lllllllllllllIIIIllIllllIIlIllIl.getFrontOffsetX();
                final double lllllllllllllIIIIllIllllIIlIIlIl = lllllllllllllIIIIllIllllIIlIIlll.nextGaussian() * 0.05 + lllllllllllllIIIIllIllllIIlIllIl.getFrontOffsetY();
                final double lllllllllllllIIIIllIllllIIlIIlII = lllllllllllllIIIIllIllllIIlIIlll.nextGaussian() * 0.05 + lllllllllllllIIIIllIllllIIlIllIl.getFrontOffsetZ();
                lllllllllllllIIIIllIllllIIlIlIII.spawnEntityInWorld(new EntitySmallFireball(lllllllllllllIIIIllIllllIIlIlIII, lllllllllllllIIIIllIllllIIlIlIll, lllllllllllllIIIIllIllllIIlIlIlI, lllllllllllllIIIIllIllllIIlIlIIl, lllllllllllllIIIIllIllllIIlIIllI, lllllllllllllIIIIllIllllIIlIIlIl, lllllllllllllIIIIllIllllIIlIIlII));
                "".length();
                lllllllllllllIIIIllIllllIIlIlllI.splitStack(Bootstrap$8.lIlIllIIllIlII[0]);
                "".length();
                return lllllllllllllIIIIllIllllIIlIlllI;
            }
            
            private static void llllIIIlIIlIlll() {
                (lIlIllIIllIlII = new int[3])[0] = " ".length();
                Bootstrap$8.lIlIllIIllIlII[1] = (-(0xFFFFEF1F & 0x38E3) & (0xFFFFFFF7 & 0x2BFB));
                Bootstrap$8.lIlIllIIllIlII[2] = ((0x37 ^ 0x7D ^ (0x4B ^ 0xC)) & (0x73 ^ 0x46 ^ (0xBC ^ 0x84) ^ -" ".length()));
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.boat, new BehaviorDefaultDispenseItem() {
            private final /* synthetic */ BehaviorDefaultDispenseItem field_150842_b = new BehaviorDefaultDispenseItem();
            private static final /* synthetic */ int[] llIlIlIIlllIlI;
            
            private static void lIIlIlIIIIIllIIl() {
                (llIlIlIIlllIlI = new int[3])[0] = " ".length();
                Bootstrap$9.llIlIlIIlllIlI[1] = (0xFFFF83F9 & 0x7FEE);
                Bootstrap$9.llIlIlIIlllIlI[2] = ((0xD4 ^ 0xB7) & ~(0xA4 ^ 0xC7));
            }
            
            private static boolean lIIlIlIIIIIllIlI(final int llllllllllllIllIlIlIlIIlllIIlIIl) {
                return llllllllllllIllIlIlIlIIlllIIlIIl != 0;
            }
            
            public ItemStack dispenseStack(final IBlockSource llllllllllllIllIlIlIlIIlllIllIIl, final ItemStack llllllllllllIllIlIlIlIIllllIIlIl) {
                final EnumFacing llllllllllllIllIlIlIlIIllllIIlII = BlockDispenser.getFacing(llllllllllllIllIlIlIlIIlllIllIIl.getBlockMetadata());
                final World llllllllllllIllIlIlIlIIllllIIIll = llllllllllllIllIlIlIlIIlllIllIIl.getWorld();
                final double llllllllllllIllIlIlIlIIllllIIIlI = llllllllllllIllIlIlIlIIlllIllIIl.getX() + llllllllllllIllIlIlIlIIllllIIlII.getFrontOffsetX() * 1.125f;
                final double llllllllllllIllIlIlIlIIllllIIIIl = llllllllllllIllIlIlIlIIlllIllIIl.getY() + llllllllllllIllIlIlIlIIllllIIlII.getFrontOffsetY() * 1.125f;
                final double llllllllllllIllIlIlIlIIllllIIIII = llllllllllllIllIlIlIlIIlllIllIIl.getZ() + llllllllllllIllIlIlIlIIllllIIlII.getFrontOffsetZ() * 1.125f;
                final BlockPos llllllllllllIllIlIlIlIIlllIlllll = llllllllllllIllIlIlIlIIlllIllIIl.getBlockPos().offset(llllllllllllIllIlIlIlIIllllIIlII);
                final Material llllllllllllIllIlIlIlIIlllIllllI = llllllllllllIllIlIlIlIIllllIIIll.getBlockState(llllllllllllIllIlIlIlIIlllIlllll).getBlock().getMaterial();
                double llllllllllllIllIlIlIlIIlllIlllII = 0.0;
                if (lIIlIlIIIIIllIlI(Material.water.equals(llllllllllllIllIlIlIlIIlllIllllI) ? 1 : 0)) {
                    final double llllllllllllIllIlIlIlIIlllIlllIl = 1.0;
                    "".length();
                    if ("   ".length() < ((127 + 82 - 118 + 59 ^ 157 + 99 - 238 + 146) & (0x3F ^ 0x4 ^ (0x8C ^ 0x85) ^ -" ".length()))) {
                        return null;
                    }
                }
                else {
                    if (!lIIlIlIIIIIllIlI(Material.air.equals(llllllllllllIllIlIlIlIIlllIllllI) ? 1 : 0) || lIIlIlIIIIIllIll(Material.water.equals(llllllllllllIllIlIlIlIIllllIIIll.getBlockState(llllllllllllIllIlIlIlIIlllIlllll.down()).getBlock().getMaterial()) ? 1 : 0)) {
                        return this.field_150842_b.dispense(llllllllllllIllIlIlIlIIlllIllIIl, llllllllllllIllIlIlIlIIllllIIlIl);
                    }
                    llllllllllllIllIlIlIlIIlllIlllII = 0.0;
                }
                final EntityBoat llllllllllllIllIlIlIlIIlllIllIll = new EntityBoat(llllllllllllIllIlIlIlIIllllIIIll, llllllllllllIllIlIlIlIIllllIIIlI, llllllllllllIllIlIlIlIIllllIIIIl + llllllllllllIllIlIlIlIIlllIlllII, llllllllllllIllIlIlIlIIllllIIIII);
                llllllllllllIllIlIlIlIIllllIIIll.spawnEntityInWorld(llllllllllllIllIlIlIlIIlllIllIll);
                "".length();
                llllllllllllIllIlIlIlIIllllIIlIl.splitStack(Bootstrap$9.llIlIlIIlllIlI[0]);
                "".length();
                return llllllllllllIllIlIlIlIIllllIIlIl;
            }
            
            static {
                lIIlIlIIIIIllIIl();
            }
            
            private static boolean lIIlIlIIIIIllIll(final int llllllllllllIllIlIlIlIIlllIIIlll) {
                return llllllllllllIllIlIlIlIIlllIIIlll == 0;
            }
            
            @Override
            protected void playDispenseSound(final IBlockSource llllllllllllIllIlIlIlIIlllIIllII) {
                llllllllllllIllIlIlIlIIlllIIllII.getWorld().playAuxSFX(Bootstrap$9.llIlIlIIlllIlI[1], llllllllllllIllIlIlIlIIlllIIllII.getBlockPos(), Bootstrap$9.llIlIlIIlllIlI[2]);
            }
        });
        final IBehaviorDispenseItem lllllllllllllIlIIIIIlIIllllIIlII = new BehaviorDefaultDispenseItem() {
            private final /* synthetic */ BehaviorDefaultDispenseItem field_150841_b = new BehaviorDefaultDispenseItem();
            private static final /* synthetic */ int[] llIIIIlIlIlllI;
            
            static {
                lIIIIllllllIIlIl();
            }
            
            private static void lIIIIllllllIIlIl() {
                (llIIIIlIlIlllI = new int[1])[0] = " ".length();
            }
            
            private static boolean lIIIIllllllIIlll(final int llllllllllllIlllIllIllllIIlIIllI) {
                return llllllllllllIlllIllIllllIIlIIllI != 0;
            }
            
            public ItemStack dispenseStack(final IBlockSource llllllllllllIlllIllIllllIIllIIII, final ItemStack llllllllllllIlllIllIllllIIlIlIlI) {
                final ItemBucket llllllllllllIlllIllIllllIIlIlllI = (ItemBucket)llllllllllllIlllIllIllllIIlIlIlI.getItem();
                final BlockPos llllllllllllIlllIllIllllIIlIllIl = llllllllllllIlllIllIllllIIllIIII.getBlockPos().offset(BlockDispenser.getFacing(llllllllllllIlllIllIllllIIllIIII.getBlockMetadata()));
                if (lIIIIllllllIIlll(llllllllllllIlllIllIllllIIlIlllI.tryPlaceContainedLiquid(llllllllllllIlllIllIllllIIllIIII.getWorld(), llllllllllllIlllIllIllllIIlIllIl) ? 1 : 0)) {
                    llllllllllllIlllIllIllllIIlIlIlI.setItem(Items.bucket);
                    llllllllllllIlllIllIllllIIlIlIlI.stackSize = Bootstrap$10.llIIIIlIlIlllI[0];
                    return llllllllllllIlllIllIllllIIlIlIlI;
                }
                return this.field_150841_b.dispense(llllllllllllIlllIllIllllIIllIIII, llllllllllllIlllIllIllllIIlIlIlI);
            }
        };
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.lava_bucket, lllllllllllllIlIIIIIlIIllllIIlII);
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.water_bucket, lllllllllllllIlIIIIIlIIllllIIlII);
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.bucket, new BehaviorDefaultDispenseItem() {
            private final /* synthetic */ BehaviorDefaultDispenseItem field_150840_b = new BehaviorDefaultDispenseItem();
            private static final /* synthetic */ int[] lllIIIIIIIlIll;
            
            public ItemStack dispenseStack(final IBlockSource llllllllllllIllIIIlIIIlIIlIllllI, final ItemStack llllllllllllIllIIIlIIIlIIllIIlll) {
                final World llllllllllllIllIIIlIIIlIIllIIllI = llllllllllllIllIIIlIIIlIIlIllllI.getWorld();
                final BlockPos llllllllllllIllIIIlIIIlIIllIIlIl = llllllllllllIllIIIlIIIlIIlIllllI.getBlockPos().offset(BlockDispenser.getFacing(llllllllllllIllIIIlIIIlIIlIllllI.getBlockMetadata()));
                final IBlockState llllllllllllIllIIIlIIIlIIllIIlII = llllllllllllIllIIIlIIIlIIllIIllI.getBlockState(llllllllllllIllIIIlIIIlIIllIIlIl);
                final Block llllllllllllIllIIIlIIIlIIllIIIll = llllllllllllIllIIIlIIIlIIllIIlII.getBlock();
                final Material llllllllllllIllIIIlIIIlIIllIIIlI = llllllllllllIllIIIlIIIlIIllIIIll.getMaterial();
                Item llllllllllllIllIIIlIIIlIIllIIIII = null;
                if (lIIllIlllllIllII(Material.water.equals(llllllllllllIllIIIlIIIlIIllIIIlI) ? 1 : 0) && lIIllIlllllIllII((llllllllllllIllIIIlIIIlIIllIIIll instanceof BlockLiquid) ? 1 : 0) && lIIllIlllllIllIl(llllllllllllIllIIIlIIIlIIllIIlII.getValue((IProperty<Integer>)BlockLiquid.LEVEL))) {
                    final Item llllllllllllIllIIIlIIIlIIllIIIIl = Items.water_bucket;
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                }
                else {
                    if (!lIIllIlllllIllII(Material.lava.equals(llllllllllllIllIIIlIIIlIIllIIIlI) ? 1 : 0) || !lIIllIlllllIllII((llllllllllllIllIIIlIIIlIIllIIIll instanceof BlockLiquid) ? 1 : 0) || lIIllIlllllIllII(llllllllllllIllIIIlIIIlIIllIIlII.getValue((IProperty<Integer>)BlockLiquid.LEVEL))) {
                        return super.dispenseStack(llllllllllllIllIIIlIIIlIIlIllllI, llllllllllllIllIIIlIIIlIIllIIlll);
                    }
                    llllllllllllIllIIIlIIIlIIllIIIII = Items.lava_bucket;
                }
                llllllllllllIllIIIlIIIlIIllIIllI.setBlockToAir(llllllllllllIllIIIlIIIlIIllIIlIl);
                "".length();
                final int n = llllllllllllIllIIIlIIIlIIllIIlll.stackSize - Bootstrap$11.lllIIIIIIIlIll[0];
                llllllllllllIllIIIlIIIlIIllIIlll.stackSize = n;
                if (lIIllIlllllIllIl(n)) {
                    llllllllllllIllIIIlIIIlIIllIIlll.setItem(llllllllllllIllIIIlIIIlIIllIIIII);
                    llllllllllllIllIIIlIIIlIIllIIlll.stackSize = Bootstrap$11.lllIIIIIIIlIll[0];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else if (lIIllIlllllIlllI(llllllllllllIllIIIlIIIlIIlIllllI.getBlockTileEntity().addItemStack(new ItemStack(llllllllllllIllIIIlIIIlIIllIIIII)))) {
                    this.field_150840_b.dispense(llllllllllllIllIIIlIIIlIIlIllllI, new ItemStack(llllllllllllIllIIIlIIIlIIllIIIII));
                    "".length();
                }
                return llllllllllllIllIIIlIIIlIIllIIlll;
            }
            
            private static void lIIllIlllllIlIll() {
                (lllIIIIIIIlIll = new int[1])[0] = " ".length();
            }
            
            private static boolean lIIllIlllllIllIl(final int llllllllllllIllIIIlIIIlIIlIlIIll) {
                return llllllllllllIllIIIlIIIlIIlIlIIll == 0;
            }
            
            private static boolean lIIllIlllllIllII(final int llllllllllllIllIIIlIIIlIIlIlIlIl) {
                return llllllllllllIllIIIlIIIlIIlIlIlIl != 0;
            }
            
            static {
                lIIllIlllllIlIll();
            }
            
            private static boolean lIIllIlllllIlllI(final int llllllllllllIllIIIlIIIlIIlIlIIIl) {
                return llllllllllllIllIIIlIIIlIIlIlIIIl < 0;
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.flint_and_steel, new BehaviorDefaultDispenseItem() {
            private /* synthetic */ boolean field_150839_b = Bootstrap$12.llllIIIlIIIII[0];
            private static final /* synthetic */ int[] llllIIIlIIIII;
            
            @Override
            protected void playDispenseSound(final IBlockSource lllllllllllllIlIllllIIllIIIIIlll) {
                if (lIlIIlllIlIllII(this.field_150839_b ? 1 : 0)) {
                    lllllllllllllIlIllllIIllIIIIIlll.getWorld().playAuxSFX(Bootstrap$12.llllIIIlIIIII[2], lllllllllllllIlIllllIIllIIIIIlll.getBlockPos(), Bootstrap$12.llllIIIlIIIII[1]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIllllIIllIIIIIlll.getWorld().playAuxSFX(Bootstrap$12.llllIIIlIIIII[3], lllllllllllllIlIllllIIllIIIIIlll.getBlockPos(), Bootstrap$12.llllIIIlIIIII[1]);
                }
            }
            
            private static void lIlIIlllIlIlIll() {
                (llllIIIlIIIII = new int[4])[0] = " ".length();
                Bootstrap$12.llllIIIlIIIII[1] = (" ".length() & (" ".length() ^ -" ".length()));
                Bootstrap$12.llllIIIlIIIII[2] = (-(0xFFFFE6E6 & 0x591F) & (0xFFFFEBFD & 0x57EF));
                Bootstrap$12.llllIIIlIIIII[3] = (-(0xFFFFFC13 & 0x7FFF) & (-1 & 0x7FFB));
            }
            
            private static boolean lIlIIlllIlIllIl(final Object lllllllllllllIlIllllIIllIIIIIlII, final Object lllllllllllllIlIllllIIllIIIIIIll) {
                return lllllllllllllIlIllllIIllIIIIIlII == lllllllllllllIlIllllIIllIIIIIIll;
            }
            
            private static boolean lIlIIlllIlIllII(final int lllllllllllllIlIllllIIllIIIIIIIl) {
                return lllllllllllllIlIllllIIllIIIIIIIl != 0;
            }
            
            @Override
            protected ItemStack dispenseStack(final IBlockSource lllllllllllllIlIllllIIllIIIlIIII, final ItemStack lllllllllllllIlIllllIIllIIIIllll) {
                final World lllllllllllllIlIllllIIllIIIlIIll = lllllllllllllIlIllllIIllIIIlIIII.getWorld();
                final BlockPos lllllllllllllIlIllllIIllIIIlIIlI = lllllllllllllIlIllllIIllIIIlIIII.getBlockPos().offset(BlockDispenser.getFacing(lllllllllllllIlIllllIIllIIIlIIII.getBlockMetadata()));
                if (lIlIIlllIlIllII(lllllllllllllIlIllllIIllIIIlIIll.isAirBlock(lllllllllllllIlIllllIIllIIIlIIlI) ? 1 : 0)) {
                    lllllllllllllIlIllllIIllIIIlIIll.setBlockState(lllllllllllllIlIllllIIllIIIlIIlI, Blocks.fire.getDefaultState());
                    "".length();
                    if (lIlIIlllIlIllII(lllllllllllllIlIllllIIllIIIIllll.attemptDamageItem(Bootstrap$12.llllIIIlIIIII[0], lllllllllllllIlIllllIIllIIIlIIll.rand) ? 1 : 0)) {
                        lllllllllllllIlIllllIIllIIIIllll.stackSize = Bootstrap$12.llllIIIlIIIII[1];
                        "".length();
                        if (-(0x15 ^ 0x11) > 0) {
                            return null;
                        }
                    }
                }
                else if (lIlIIlllIlIllIl(lllllllllllllIlIllllIIllIIIlIIll.getBlockState(lllllllllllllIlIllllIIllIIIlIIlI).getBlock(), Blocks.tnt)) {
                    Blocks.tnt.onBlockDestroyedByPlayer(lllllllllllllIlIllllIIllIIIlIIll, lllllllllllllIlIllllIIllIIIlIIlI, Blocks.tnt.getDefaultState().withProperty((IProperty<Comparable>)BlockTNT.EXPLODE, (boolean)(Bootstrap$12.llllIIIlIIIII[0] != 0)));
                    lllllllllllllIlIllllIIllIIIlIIll.setBlockToAir(lllllllllllllIlIllllIIllIIIlIIlI);
                    "".length();
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                }
                else {
                    this.field_150839_b = (Bootstrap$12.llllIIIlIIIII[1] != 0);
                }
                return lllllllllllllIlIllllIIllIIIIllll;
            }
            
            static {
                lIlIIlllIlIlIll();
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.dye, new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] llIllIllIllIII;
            private /* synthetic */ boolean field_150838_b = Bootstrap$13.llIllIllIllIII[0];
            
            @Override
            protected void playDispenseSound(final IBlockSource llllllllllllIllIIllIIlIIllIllIIl) {
                if (lIIllIIIIlIIlIlI(this.field_150838_b ? 1 : 0)) {
                    llllllllllllIllIIllIIlIIllIllIIl.getWorld().playAuxSFX(Bootstrap$13.llIllIllIllIII[3], llllllllllllIllIIllIIlIIllIllIIl.getBlockPos(), Bootstrap$13.llIllIllIllIII[2]);
                    "".length();
                    if (((0x1A ^ 0x29) & ~(0x12 ^ 0x21)) > 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIIllIIlIIllIllIIl.getWorld().playAuxSFX(Bootstrap$13.llIllIllIllIII[4], llllllllllllIllIIllIIlIIllIllIIl.getBlockPos(), Bootstrap$13.llIllIllIllIII[2]);
                }
            }
            
            private static void lIIllIIIIlIIlIII() {
                (llIllIllIllIII = new int[5])[0] = " ".length();
                Bootstrap$13.llIllIllIllIII[1] = (-(0xFFFFFB29 & 0x5CDF) & (0xFFFFFFDF & 0x5FFD));
                Bootstrap$13.llIllIllIllIII[2] = ((0xCB ^ 0xB3 ^ (0xEC ^ 0x99)) & (0x49 ^ 0x7A ^ (0xBF ^ 0x81) ^ -" ".length()));
                Bootstrap$13.llIllIllIllIII[3] = (0xFFFF9FEA & 0x63FD);
                Bootstrap$13.llIllIllIllIII[4] = (-(0xFFFFFF13 & 0x54FF) & (0xFFFFF7FF & 0x5FFB));
            }
            
            static {
                lIIllIIIIlIIlIII();
            }
            
            private static boolean lIIllIIIIlIIlIIl(final Object llllllllllllIllIIllIIlIIllIlIllI, final Object llllllllllllIllIIllIIlIIllIlIlIl) {
                return llllllllllllIllIIllIIlIIllIlIllI == llllllllllllIllIIllIIlIIllIlIlIl;
            }
            
            @Override
            protected ItemStack dispenseStack(final IBlockSource llllllllllllIllIIllIIlIIlllIIIlI, final ItemStack llllllllllllIllIIllIIlIIlllIIllI) {
                if (lIIllIIIIlIIlIIl(EnumDyeColor.WHITE, EnumDyeColor.byDyeDamage(llllllllllllIllIIllIIlIIlllIIllI.getMetadata()))) {
                    final World llllllllllllIllIIllIIlIIlllIIlIl = llllllllllllIllIIllIIlIIlllIIIlI.getWorld();
                    final BlockPos llllllllllllIllIIllIIlIIlllIIlII = llllllllllllIllIIllIIlIIlllIIIlI.getBlockPos().offset(BlockDispenser.getFacing(llllllllllllIllIIllIIlIIlllIIIlI.getBlockMetadata()));
                    if (lIIllIIIIlIIlIlI(ItemDye.applyBonemeal(llllllllllllIllIIllIIlIIlllIIllI, llllllllllllIllIIllIIlIIlllIIlIl, llllllllllllIllIIllIIlIIlllIIlII) ? 1 : 0)) {
                        if (lIIllIIIIlIIlIll(llllllllllllIllIIllIIlIIlllIIlIl.isRemote ? 1 : 0)) {
                            llllllllllllIllIIllIIlIIlllIIlIl.playAuxSFX(Bootstrap$13.llIllIllIllIII[1], llllllllllllIllIIllIIlIIlllIIlII, Bootstrap$13.llIllIllIllIII[2]);
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                    }
                    else {
                        this.field_150838_b = (Bootstrap$13.llIllIllIllIII[2] != 0);
                    }
                    return llllllllllllIllIIllIIlIIlllIIllI;
                }
                return super.dispenseStack(llllllllllllIllIIllIIlIIlllIIIlI, llllllllllllIllIIllIIlIIlllIIllI);
            }
            
            private static boolean lIIllIIIIlIIlIll(final int llllllllllllIllIIllIIlIIllIlIIIl) {
                return llllllllllllIllIIllIIlIIllIlIIIl == 0;
            }
            
            private static boolean lIIllIIIIlIIlIlI(final int llllllllllllIllIIllIIlIIllIlIIll) {
                return llllllllllllIllIIllIIlIIllIlIIll != 0;
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Item.getItemFromBlock(Blocks.tnt), new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] llIIIIIllIllII;
            private static final /* synthetic */ String[] llIIIIIllIIlll;
            
            private static boolean lIIIIlllIlIllllI(final int llllllllllllIlllIlllIlllIIllIllI, final int llllllllllllIlllIlllIlllIIllIlII) {
                return llllllllllllIlllIlllIlllIIllIllI < llllllllllllIlllIlllIlllIIllIlII;
            }
            
            private static String lIIIIlllIlIlIllI(String llllllllllllIlllIlllIlllIlIIllII, final String llllllllllllIlllIlllIlllIlIIlIll) {
                llllllllllllIlllIlllIlllIlIIllII = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlllIlllIlIIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllIlllIlllIlIIllll = new StringBuilder();
                final char[] llllllllllllIlllIlllIlllIlIIlllI = llllllllllllIlllIlllIlllIlIIlIll.toCharArray();
                int llllllllllllIlllIlllIlllIlIIllIl = Bootstrap$14.llIIIIIllIllII[0];
                final short llllllllllllIlllIlllIlllIlIIIlIl = (Object)((String)llllllllllllIlllIlllIlllIlIIllII).toCharArray();
                final String llllllllllllIlllIlllIlllIlIIIIll = (String)llllllllllllIlllIlllIlllIlIIIlIl.length;
                String llllllllllllIlllIlllIlllIlIIIIIl = (String)Bootstrap$14.llIIIIIllIllII[0];
                while (lIIIIlllIlIllllI((int)llllllllllllIlllIlllIlllIlIIIIIl, (int)llllllllllllIlllIlllIlllIlIIIIll)) {
                    final char llllllllllllIlllIlllIlllIlIlIlIl = llllllllllllIlllIlllIlllIlIIIlIl[llllllllllllIlllIlllIlllIlIIIIIl];
                    llllllllllllIlllIlllIlllIlIIllll.append((char)(llllllllllllIlllIlllIlllIlIlIlIl ^ llllllllllllIlllIlllIlllIlIIlllI[llllllllllllIlllIlllIlllIlIIllIl % llllllllllllIlllIlllIlllIlIIlllI.length]));
                    "".length();
                    ++llllllllllllIlllIlllIlllIlIIllIl;
                    ++llllllllllllIlllIlllIlllIlIIIIIl;
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllIlllIlllIlIIllll);
            }
            
            private static void lIIIIlllIlIlllII() {
                (llIIIIIllIllII = new int[2])[0] = ((0x52 ^ 0x3) & ~(0x22 ^ 0x73));
                Bootstrap$14.llIIIIIllIllII[1] = " ".length();
            }
            
            private static void lIIIIlllIlIlIlll() {
                (llIIIIIllIIlll = new String[Bootstrap$14.llIIIIIllIllII[1]])[Bootstrap$14.llIIIIIllIllII[0]] = lIIIIlllIlIlIllI("PjQBPGstOxh3NSs8ATwh", "YUlYE");
            }
            
            static {
                lIIIIlllIlIlllII();
                lIIIIlllIlIlIlll();
            }
            
            @Override
            protected ItemStack dispenseStack(final IBlockSource llllllllllllIlllIlllIllllIIIIllI, final ItemStack llllllllllllIlllIlllIlllIllllIlI) {
                final World llllllllllllIlllIlllIllllIIIIIlI = llllllllllllIlllIlllIllllIIIIllI.getWorld();
                final BlockPos llllllllllllIlllIlllIllllIIIIIII = llllllllllllIlllIlllIllllIIIIllI.getBlockPos().offset(BlockDispenser.getFacing(llllllllllllIlllIlllIllllIIIIllI.getBlockMetadata()));
                final EntityTNTPrimed llllllllllllIlllIlllIlllIllllllI = new EntityTNTPrimed(llllllllllllIlllIlllIllllIIIIIlI, llllllllllllIlllIlllIllllIIIIIII.getX() + 0.5, llllllllllllIlllIlllIllllIIIIIII.getY(), llllllllllllIlllIlllIllllIIIIIII.getZ() + 0.5, null);
                llllllllllllIlllIlllIllllIIIIIlI.spawnEntityInWorld(llllllllllllIlllIlllIlllIllllllI);
                "".length();
                llllllllllllIlllIlllIllllIIIIIlI.playSoundAtEntity(llllllllllllIlllIlllIlllIllllllI, Bootstrap$14.llIIIIIllIIlll[Bootstrap$14.llIIIIIllIllII[0]], 1.0f, 1.0f);
                llllllllllllIlllIlllIlllIllllIlI.stackSize -= Bootstrap$14.llIIIIIllIllII[1];
                return llllllllllllIlllIlllIlllIllllIlI;
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.skull, new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ String[] lIlllllllllIIl;
            private /* synthetic */ boolean field_179240_b = Bootstrap$15.llIIIIIIIllIll[0];
            private static final /* synthetic */ int[] llIIIIIIIllIll;
            
            private static void lIIIIllIlIlIIlll() {
                (llIIIIIIIllIll = new int[9])[0] = " ".length();
                Bootstrap$15.llIIIIIIIllIll[1] = "   ".length();
                Bootstrap$15.llIIIIIIIllIll[2] = ((0xEA ^ 0xAE) & ~(0xC1 ^ 0x85));
                Bootstrap$15.llIIIIIIIllIll[3] = (0x77 ^ 0x7D);
                Bootstrap$15.llIIIIIIIllIll[4] = "  ".length();
                Bootstrap$15.llIIIIIIIllIll[5] = (0xB7 ^ 0xC1 ^ (0x9 ^ 0x77));
                Bootstrap$15.llIIIIIIIllIll[6] = (0x45 ^ 0x6B ^ (0x79 ^ 0x53));
                Bootstrap$15.llIIIIIIIllIll[7] = (0xFFFF83EB & 0x7FFC);
                Bootstrap$15.llIIIIIIIllIll[8] = (0xFFFFCBE9 & 0x37FF);
            }
            
            private static void lIIIIllIIlIllllI() {
                (lIlllllllllIIl = new String[Bootstrap$15.llIIIIIIIllIll[6]])[Bootstrap$15.llIIIIIIIllIll[2]] = lIIIIllIIlIllIll("Z71x+6z5DRosNNC4jjx7gg==", "Pirmu");
                Bootstrap$15.lIlllllllllIIl[Bootstrap$15.llIIIIIIIllIll[0]] = lIIIIllIIlIlllII("ek8EdbQX3VA1+TUJifTkHA==", "UxsXn");
                Bootstrap$15.lIlllllllllIIl[Bootstrap$15.llIIIIIIIllIll[4]] = lIIIIllIIlIlllIl("PwUZDyIjGQIGPA==", "lnlcN");
                Bootstrap$15.lIlllllllllIIl[Bootstrap$15.llIIIIIIIllIll[1]] = lIIIIllIIlIlllIl("BxokAg0bBj8LEw==", "TqQna");
            }
            
            private static String lIIIIllIIlIlllIl(String llllllllllllIllllIIIIlIIlIIlIIII, final String llllllllllllIllllIIIIlIIlIIlIlII) {
                llllllllllllIllllIIIIlIIlIIlIIII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIIlIIlIIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllllIIIIlIIlIIlIIll = new StringBuilder();
                final char[] llllllllllllIllllIIIIlIIlIIlIIlI = llllllllllllIllllIIIIlIIlIIlIlII.toCharArray();
                int llllllllllllIllllIIIIlIIlIIlIIIl = Bootstrap$15.llIIIIIIIllIll[2];
                final String llllllllllllIllllIIIIlIIlIIIlIll = (Object)((String)llllllllllllIllllIIIIlIIlIIlIIII).toCharArray();
                final char llllllllllllIllllIIIIlIIlIIIlIlI = (char)llllllllllllIllllIIIIlIIlIIIlIll.length;
                long llllllllllllIllllIIIIlIIlIIIlIIl = Bootstrap$15.llIIIIIIIllIll[2];
                while (lIIIIllIlIlIlIll((int)llllllllllllIllllIIIIlIIlIIIlIIl, llllllllllllIllllIIIIlIIlIIIlIlI)) {
                    final char llllllllllllIllllIIIIlIIlIIlIllI = llllllllllllIllllIIIIlIIlIIIlIll[llllllllllllIllllIIIIlIIlIIIlIIl];
                    llllllllllllIllllIIIIlIIlIIlIIll.append((char)(llllllllllllIllllIIIIlIIlIIlIllI ^ llllllllllllIllllIIIIlIIlIIlIIlI[llllllllllllIllllIIIIlIIlIIlIIIl % llllllllllllIllllIIIIlIIlIIlIIlI.length]));
                    "".length();
                    ++llllllllllllIllllIIIIlIIlIIlIIIl;
                    ++llllllllllllIllllIIIIlIIlIIIlIIl;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllllIIIIlIIlIIlIIll);
            }
            
            private static String lIIIIllIIlIlllII(final String llllllllllllIllllIIIIlIIlIlIIlIl, final String llllllllllllIllllIIIIlIIlIlIIIlI) {
                try {
                    final SecretKeySpec llllllllllllIllllIIIIlIIlIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllllIIIIlIIlIlIIlll = Cipher.getInstance("Blowfish");
                    llllllllllllIllllIIIIlIIlIlIIlll.init(Bootstrap$15.llIIIIIIIllIll[4], llllllllllllIllllIIIIlIIlIlIlIII);
                    return new String(llllllllllllIllllIIIIlIIlIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIIIIlIIlIlIIllI) {
                    llllllllllllIllllIIIIlIIlIlIIllI.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIIIllIlIlIlIIl(final int llllllllllllIllllIIIIlIIIllIllll) {
                return llllllllllllIllllIIIIlIIIllIllll == 0;
            }
            
            @Override
            protected void playDispenseSound(final IBlockSource llllllllllllIllllIIIIlIIlIlIllll) {
                if (lIIIIllIlIlIlIII(this.field_179240_b ? 1 : 0)) {
                    llllllllllllIllllIIIIlIIlIlIllll.getWorld().playAuxSFX(Bootstrap$15.llIIIIIIIllIll[7], llllllllllllIllllIIIIlIIlIlIllll.getBlockPos(), Bootstrap$15.llIIIIIIIllIll[2]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIllllIIIIlIIlIlIllll.getWorld().playAuxSFX(Bootstrap$15.llIIIIIIIllIll[8], llllllllllllIllllIIIIlIIlIlIllll.getBlockPos(), Bootstrap$15.llIIIIIIIllIll[2]);
                }
            }
            
            static {
                lIIIIllIlIlIIlll();
                lIIIIllIIlIllllI();
            }
            
            @Override
            protected ItemStack dispenseStack(final IBlockSource llllllllllllIllllIIIIlIIlIllllII, final ItemStack llllllllllllIllllIIIIlIIlIlllIll) {
                final World llllllllllllIllllIIIIlIIllIIIlIl = llllllllllllIllllIIIIlIIlIllllII.getWorld();
                final EnumFacing llllllllllllIllllIIIIlIIllIIIlII = BlockDispenser.getFacing(llllllllllllIllllIIIIlIIlIllllII.getBlockMetadata());
                final BlockPos llllllllllllIllllIIIIlIIllIIIIll = llllllllllllIllllIIIIlIIlIllllII.getBlockPos().offset(llllllllllllIllllIIIIlIIllIIIlII);
                final BlockSkull llllllllllllIllllIIIIlIIllIIIIlI = Blocks.skull;
                if (lIIIIllIlIlIlIII(llllllllllllIllllIIIIlIIllIIIlIl.isAirBlock(llllllllllllIllllIIIIlIIllIIIIll) ? 1 : 0) && lIIIIllIlIlIlIII(llllllllllllIllllIIIIlIIllIIIIlI.canDispenserPlace(llllllllllllIllllIIIIlIIllIIIlIl, llllllllllllIllllIIIIlIIllIIIIll, llllllllllllIllllIIIIlIIlIlllIll) ? 1 : 0)) {
                    if (lIIIIllIlIlIlIIl(llllllllllllIllllIIIIlIIllIIIlIl.isRemote ? 1 : 0)) {
                        llllllllllllIllllIIIIlIIllIIIlIl.setBlockState(llllllllllllIllllIIIIlIIllIIIIll, llllllllllllIllllIIIIlIIllIIIIlI.getDefaultState().withProperty((IProperty<Comparable>)BlockSkull.FACING, EnumFacing.UP), Bootstrap$15.llIIIIIIIllIll[1]);
                        "".length();
                        final TileEntity llllllllllllIllllIIIIlIIllIIIIIl = llllllllllllIllllIIIIlIIllIIIlIl.getTileEntity(llllllllllllIllllIIIIlIIllIIIIll);
                        if (lIIIIllIlIlIlIII((llllllllllllIllllIIIIlIIllIIIIIl instanceof TileEntitySkull) ? 1 : 0)) {
                            if (lIIIIllIlIlIlIlI(llllllllllllIllllIIIIlIIlIlllIll.getMetadata(), Bootstrap$15.llIIIIIIIllIll[1])) {
                                GameProfile llllllllllllIllllIIIIlIIllIIIIII = null;
                                if (lIIIIllIlIlIlIII(llllllllllllIllllIIIIlIIlIlllIll.hasTagCompound() ? 1 : 0)) {
                                    final NBTTagCompound llllllllllllIllllIIIIlIIlIllllll = llllllllllllIllllIIIIlIIlIlllIll.getTagCompound();
                                    if (lIIIIllIlIlIlIII(llllllllllllIllllIIIIlIIlIllllll.hasKey(Bootstrap$15.lIlllllllllIIl[Bootstrap$15.llIIIIIIIllIll[2]], Bootstrap$15.llIIIIIIIllIll[3]) ? 1 : 0)) {
                                        llllllllllllIllllIIIIlIIllIIIIII = NBTUtil.readGameProfileFromNBT(llllllllllllIllllIIIIlIIlIllllll.getCompoundTag(Bootstrap$15.lIlllllllllIIl[Bootstrap$15.llIIIIIIIllIll[0]]));
                                        "".length();
                                        if (null != null) {
                                            return null;
                                        }
                                    }
                                    else if (lIIIIllIlIlIlIII(llllllllllllIllllIIIIlIIlIllllll.hasKey(Bootstrap$15.lIlllllllllIIl[Bootstrap$15.llIIIIIIIllIll[4]], Bootstrap$15.llIIIIIIIllIll[5]) ? 1 : 0)) {
                                        final String llllllllllllIllllIIIIlIIlIlllllI = llllllllllllIllllIIIIlIIlIllllll.getString(Bootstrap$15.lIlllllllllIIl[Bootstrap$15.llIIIIIIIllIll[1]]);
                                        if (lIIIIllIlIlIlIIl(StringUtils.isNullOrEmpty(llllllllllllIllllIIIIlIIlIlllllI) ? 1 : 0)) {
                                            llllllllllllIllllIIIIlIIllIIIIII = new GameProfile((UUID)null, llllllllllllIllllIIIIlIIlIlllllI);
                                        }
                                    }
                                }
                                ((TileEntitySkull)llllllllllllIllllIIIIlIIllIIIIIl).setPlayerProfile(llllllllllllIllllIIIIlIIllIIIIII);
                                "".length();
                                if (-"   ".length() >= 0) {
                                    return null;
                                }
                            }
                            else {
                                ((TileEntitySkull)llllllllllllIllllIIIIlIIllIIIIIl).setType(llllllllllllIllllIIIIlIIlIlllIll.getMetadata());
                            }
                            ((TileEntitySkull)llllllllllllIllllIIIIlIIllIIIIIl).setSkullRotation(llllllllllllIllllIIIIlIIllIIIlII.getOpposite().getHorizontalIndex() * Bootstrap$15.llIIIIIIIllIll[6]);
                            Blocks.skull.checkWitherSpawn(llllllllllllIllllIIIIlIIllIIIlIl, llllllllllllIllllIIIIlIIllIIIIll, (TileEntitySkull)llllllllllllIllllIIIIlIIllIIIIIl);
                        }
                        llllllllllllIllllIIIIlIIlIlllIll.stackSize -= Bootstrap$15.llIIIIIIIllIll[0];
                        "".length();
                        if (-"  ".length() > 0) {
                            return null;
                        }
                    }
                }
                else {
                    this.field_179240_b = (Bootstrap$15.llIIIIIIIllIll[2] != 0);
                }
                return llllllllllllIllllIIIIlIIlIlllIll;
            }
            
            private static boolean lIIIIllIlIlIlIll(final int llllllllllllIllllIIIIlIIIlllIlII, final int llllllllllllIllllIIIIlIIIlllIIll) {
                return llllllllllllIllllIIIIlIIIlllIlII < llllllllllllIllllIIIIlIIIlllIIll;
            }
            
            private static boolean lIIIIllIlIlIlIlI(final int llllllllllllIllllIIIIlIIIllllIII, final int llllllllllllIllllIIIIlIIIlllIlll) {
                return llllllllllllIllllIIIIlIIIllllIII == llllllllllllIllllIIIIlIIIlllIlll;
            }
            
            private static String lIIIIllIIlIllIll(final String llllllllllllIllllIIIIlIIIllllllI, final String llllllllllllIllllIIIIlIIIlllllIl) {
                try {
                    final SecretKeySpec llllllllllllIllllIIIIlIIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIIIlllllIl.getBytes(StandardCharsets.UTF_8)), Bootstrap$15.llIIIIIIIllIll[5]), "DES");
                    final Cipher llllllllllllIllllIIIIlIIlIIIIIlI = Cipher.getInstance("DES");
                    llllllllllllIllllIIIIlIIlIIIIIlI.init(Bootstrap$15.llIIIIIIIllIll[4], llllllllllllIllllIIIIlIIlIIIIIll);
                    return new String(llllllllllllIllllIIIIlIIlIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIIIIlIIlIIIIIIl) {
                    llllllllllllIllllIIIIlIIlIIIIIIl.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIIIllIlIlIlIII(final int llllllllllllIllllIIIIlIIIlllIIIl) {
                return llllllllllllIllllIIIIlIIIlllIIIl != 0;
            }
        });
        BlockDispenser.dispenseBehaviorRegistry.putObject(Item.getItemFromBlock(Blocks.pumpkin), new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] lIlIIIIlIlllIl;
            private /* synthetic */ boolean field_179241_b = Bootstrap$16.lIlIIIIlIlllIl[0];
            
            @Override
            protected void playDispenseSound(final IBlockSource lllllllllllllIIlIIIIIllIlIIIlIll) {
                if (lllIIIIllIlIllI(this.field_179241_b ? 1 : 0)) {
                    lllllllllllllIIlIIIIIllIlIIIlIll.getWorld().playAuxSFX(Bootstrap$16.lIlIIIIlIlllIl[3], lllllllllllllIIlIIIIIllIlIIIlIll.getBlockPos(), Bootstrap$16.lIlIIIIlIlllIl[2]);
                    "".length();
                    if (((0x22 ^ 0x5) & ~(0x25 ^ 0x2)) < 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIIIIIllIlIIIlIll.getWorld().playAuxSFX(Bootstrap$16.lIlIIIIlIlllIl[4], lllllllllllllIIlIIIIIllIlIIIlIll.getBlockPos(), Bootstrap$16.lIlIIIIlIlllIl[2]);
                }
            }
            
            private static void lllIIIIllIlIlIl() {
                (lIlIIIIlIlllIl = new int[5])[0] = " ".length();
                Bootstrap$16.lIlIIIIlIlllIl[1] = "   ".length();
                Bootstrap$16.lIlIIIIlIlllIl[2] = ((0x1C ^ 0x23) & ~(0x7D ^ 0x42));
                Bootstrap$16.lIlIIIIlIlllIl[3] = (-(0xFFFFE573 & 0x7E8E) & (0xFFFFEFFF & 0x77E9));
                Bootstrap$16.lIlIIIIlIlllIl[4] = (-(0xFFFF9D77 & 0x7A9D) & (0xFFFFDFFD & 0x3BFF));
            }
            
            private static boolean lllIIIIllIlIlll(final int lllllllllllllIIlIIIIIllIlIIIIlll) {
                return lllllllllllllIIlIIIIIllIlIIIIlll == 0;
            }
            
            @Override
            protected ItemStack dispenseStack(final IBlockSource lllllllllllllIIlIIIIIllIlIIlIlIl, final ItemStack lllllllllllllIIlIIIIIllIlIIllIlI) {
                final World lllllllllllllIIlIIIIIllIlIIllIIl = lllllllllllllIIlIIIIIllIlIIlIlIl.getWorld();
                final BlockPos lllllllllllllIIlIIIIIllIlIIllIII = lllllllllllllIIlIIIIIllIlIIlIlIl.getBlockPos().offset(BlockDispenser.getFacing(lllllllllllllIIlIIIIIllIlIIlIlIl.getBlockMetadata()));
                final BlockPumpkin lllllllllllllIIlIIIIIllIlIIlIlll = (BlockPumpkin)Blocks.pumpkin;
                if (lllIIIIllIlIllI(lllllllllllllIIlIIIIIllIlIIllIIl.isAirBlock(lllllllllllllIIlIIIIIllIlIIllIII) ? 1 : 0) && lllIIIIllIlIllI(lllllllllllllIIlIIIIIllIlIIlIlll.canDispenserPlace(lllllllllllllIIlIIIIIllIlIIllIIl, lllllllllllllIIlIIIIIllIlIIllIII) ? 1 : 0)) {
                    if (lllIIIIllIlIlll(lllllllllllllIIlIIIIIllIlIIllIIl.isRemote ? 1 : 0)) {
                        lllllllllllllIIlIIIIIllIlIIllIIl.setBlockState(lllllllllllllIIlIIIIIllIlIIllIII, lllllllllllllIIlIIIIIllIlIIlIlll.getDefaultState(), Bootstrap$16.lIlIIIIlIlllIl[1]);
                        "".length();
                    }
                    lllllllllllllIIlIIIIIllIlIIllIlI.stackSize -= Bootstrap$16.lIlIIIIlIlllIl[0];
                    "".length();
                    if ("   ".length() >= (0xF ^ 0x1C ^ (0x19 ^ 0xE))) {
                        return null;
                    }
                }
                else {
                    this.field_179241_b = (Bootstrap$16.lIlIIIIlIlllIl[2] != 0);
                }
                return lllllllllllllIIlIIIIIllIlIIllIlI;
            }
            
            static {
                lllIIIIllIlIlIl();
            }
            
            private static boolean lllIIIIllIlIllI(final int lllllllllllllIIlIIIIIllIlIIIlIIl) {
                return lllllllllllllIIlIIIIIllIlIIIlIIl != 0;
            }
        });
    }
    
    private static void redirectOutputToLog() {
        System.setErr(new LoggingPrintStream(Bootstrap.lIIIllIIlIlIll[Bootstrap.lIIIllIIlIllIl[0]], System.err));
        System.setOut(new LoggingPrintStream(Bootstrap.lIIIllIIlIlIll[Bootstrap.lIIIllIIlIllIl[1]], Bootstrap.SYSOUT));
    }
    
    private static boolean llIIIIlllIIIIII(final int lllllllllllllIlIIIIIlIIllIlllIII, final int lllllllllllllIlIIIIIlIIllIllIlll) {
        return lllllllllllllIlIIIIIlIIllIlllIII < lllllllllllllIlIIIIIlIIllIllIlll;
    }
    
    public static void register() {
        if (llIIIIllIlllllI(Bootstrap.alreadyRegistered ? 1 : 0)) {
            Bootstrap.alreadyRegistered = (Bootstrap.lIIIllIIlIllIl[1] != 0);
            if (llIIIIllIllllll(Bootstrap.LOGGER.isDebugEnabled() ? 1 : 0)) {
                redirectOutputToLog();
            }
            Block.registerBlocks();
            BlockFire.init();
            Item.registerItems();
            StatList.init();
            registerDispenserBehaviors();
        }
    }
    
    private static void llIIIIllIllllIl() {
        (lIIIllIIlIllIl = new int[4])[0] = ((0x7F ^ 0x1D ^ (0x2F ^ 0x54)) & (0xDA ^ 0xA3 ^ (0x20 ^ 0x40) ^ -" ".length()));
        Bootstrap.lIIIllIIlIllIl[1] = " ".length();
        Bootstrap.lIIIllIIlIllIl[2] = "  ".length();
        Bootstrap.lIIIllIIlIllIl[3] = (0x89 ^ 0x81);
    }
    
    private static boolean llIIIIllIlllllI(final int lllllllllllllIlIIIIIlIIllIllIIll) {
        return lllllllllllllIlIIIIIlIIllIllIIll == 0;
    }
    
    public static void printToSYSOUT(final String lllllllllllllIlIIIIIlIIllllIIIIl) {
        Bootstrap.SYSOUT.println(lllllllllllllIlIIIIIlIIllllIIIIl);
    }
    
    private static String llIIIIllIlllIII(String lllllllllllllIlIIIIIlIIlllIlIIII, final String lllllllllllllIlIIIIIlIIlllIIllll) {
        lllllllllllllIlIIIIIlIIlllIlIIII = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIlIIlllIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlIIlllIlIIll = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlIIlllIlIIlI = lllllllllllllIlIIIIIlIIlllIIllll.toCharArray();
        int lllllllllllllIlIIIIIlIIlllIlIIIl = Bootstrap.lIIIllIIlIllIl[0];
        final int lllllllllllllIlIIIIIlIIlllIIlIll = (Object)((String)lllllllllllllIlIIIIIlIIlllIlIIII).toCharArray();
        final double lllllllllllllIlIIIIIlIIlllIIlIlI = lllllllllllllIlIIIIIlIIlllIIlIll.length;
        float lllllllllllllIlIIIIIlIIlllIIlIIl = Bootstrap.lIIIllIIlIllIl[0];
        while (llIIIIlllIIIIII((int)lllllllllllllIlIIIIIlIIlllIIlIIl, (int)lllllllllllllIlIIIIIlIIlllIIlIlI)) {
            final char lllllllllllllIlIIIIIlIIlllIlIllI = lllllllllllllIlIIIIIlIIlllIIlIll[lllllllllllllIlIIIIIlIIlllIIlIIl];
            lllllllllllllIlIIIIIlIIlllIlIIll.append((char)(lllllllllllllIlIIIIIlIIlllIlIllI ^ lllllllllllllIlIIIIIlIIlllIlIIlI[lllllllllllllIlIIIIIlIIlllIlIIIl % lllllllllllllIlIIIIIlIIlllIlIIlI.length]));
            "".length();
            ++lllllllllllllIlIIIIIlIIlllIlIIIl;
            ++lllllllllllllIlIIIIIlIIlllIIlIIl;
            "".length();
            if (" ".length() < ((0xC4 ^ 0x81 ^ (0x7B ^ 0x3A)) & (58 + 14 - 0 + 93 ^ 51 + 102 - 111 + 119 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlIIlllIlIIll);
    }
}
