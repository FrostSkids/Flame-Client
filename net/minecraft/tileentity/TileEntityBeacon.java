// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.Items;
import com.google.common.collect.Lists;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.inventory.ContainerBeacon;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.potion.Potion;
import net.minecraft.util.ITickable;
import net.minecraft.inventory.IInventory;

public class TileEntityBeacon extends TileEntityLockable implements IInventory, ITickable
{
    private static final /* synthetic */ String[] llllIIIIIIIlI;
    private static final /* synthetic */ int[] llllIIIIIIlIl;
    private /* synthetic */ int primaryEffect;
    private final /* synthetic */ List<BeamSegment> beamSegments;
    private /* synthetic */ long beamRenderCounter;
    private /* synthetic */ float field_146014_j;
    private /* synthetic */ ItemStack payment;
    private /* synthetic */ int levels;
    private /* synthetic */ boolean isComplete;
    private /* synthetic */ String customName;
    private /* synthetic */ int secondaryEffect;
    
    @Override
    public String getGuiID() {
        return TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[12]];
    }
    
    private static int lIlIIllIlIIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIIlllllIlIII(final int lllllllllllllIlIlllIlllllIIlIlll, final int lllllllllllllIlIlllIlllllIIlIllI) {
        return lllllllllllllIlIlllIlllllIIlIlll > lllllllllllllIlIlllIlllllIIlIllI;
    }
    
    public void setName(final String lllllllllllllIlIllllIIIIIIIlIIlI) {
        this.customName = lllllllllllllIlIllllIIIIIIIlIIlI;
    }
    
    private static boolean lIlIIlllllIIlll(final int lllllllllllllIlIlllIlllllIIIIIIl) {
        return lllllllllllllIlIlllIlllllIIIIIIl < 0;
    }
    
    private static String lIlIIllIIllllII(String lllllllllllllIlIlllIlllllIllIIlI, final String lllllllllllllIlIlllIlllllIllIllI) {
        lllllllllllllIlIlllIlllllIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIlllllIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIlllllIllIlIl = new StringBuilder();
        final char[] lllllllllllllIlIlllIlllllIllIlII = lllllllllllllIlIlllIlllllIllIllI.toCharArray();
        int lllllllllllllIlIlllIlllllIllIIll = TileEntityBeacon.llllIIIIIIlIl[1];
        final short lllllllllllllIlIlllIlllllIlIllIl = (Object)lllllllllllllIlIlllIlllllIllIIlI.toCharArray();
        final short lllllllllllllIlIlllIlllllIlIllII = (short)lllllllllllllIlIlllIlllllIlIllIl.length;
        double lllllllllllllIlIlllIlllllIlIlIll = TileEntityBeacon.llllIIIIIIlIl[1];
        while (lIlIIlllllIlIlI((int)lllllllllllllIlIlllIlllllIlIlIll, lllllllllllllIlIlllIlllllIlIllII)) {
            final char lllllllllllllIlIlllIlllllIlllIII = lllllllllllllIlIlllIlllllIlIllIl[lllllllllllllIlIlllIlllllIlIlIll];
            lllllllllllllIlIlllIlllllIllIlIl.append((char)(lllllllllllllIlIlllIlllllIlllIII ^ lllllllllllllIlIlllIlllllIllIlII[lllllllllllllIlIlllIlllllIllIIll % lllllllllllllIlIlllIlllllIllIlII.length]));
            "".length();
            ++lllllllllllllIlIlllIlllllIllIIll;
            ++lllllllllllllIlIlllIlllllIlIlIll;
            "".length();
            if ((0x95 ^ 0x91) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIlllllIllIlIl);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIlIllllIIIIIlIIlIIl) {
        super.readFromNBT(lllllllllllllIlIllllIIIIIlIIlIIl);
        this.primaryEffect = this.func_183001_h(lllllllllllllIlIllllIIIIIlIIlIIl.getInteger(TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[1]]));
        this.secondaryEffect = this.func_183001_h(lllllllllllllIlIllllIIIIIlIIlIIl.getInteger(TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[3]]));
        this.levels = lllllllllllllIlIllllIIIIIlIIlIIl.getInteger(TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[2]]);
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int lllllllllllllIlIllllIIIIIIlIIllI) {
        if (lIlIIllIlIlIIII(lllllllllllllIlIllllIIIIIIlIIllI) && lIlIIlllllIlllI(this.payment)) {
            final ItemStack lllllllllllllIlIllllIIIIIIlIlIII = this.payment;
            this.payment = null;
            return lllllllllllllIlIllllIIIIIIlIlIII;
        }
        return null;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIlIllllIIIIIlIIIIll) {
        super.writeToNBT(lllllllllllllIlIllllIIIIIlIIIIll);
        lllllllllllllIlIllllIIIIIlIIIIll.setInteger(TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[4]], this.primaryEffect);
        lllllllllllllIlIllllIIIIIlIIIIll.setInteger(TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[0]], this.secondaryEffect);
        lllllllllllllIlIllllIIIIIlIIIIll.setInteger(TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[10]], this.levels);
    }
    
    private static int lIlIIlllllIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void updateSegmentColors() {
        final int lllllllllllllIlIllllIIIIlIIIIIll = this.levels;
        final int lllllllllllllIlIllllIIIIlIIIIIlI = this.pos.getX();
        final int lllllllllllllIlIllllIIIIlIIIIIIl = this.pos.getY();
        final int lllllllllllllIlIllllIIIIlIIIIIII = this.pos.getZ();
        this.levels = TileEntityBeacon.llllIIIIIIlIl[1];
        this.beamSegments.clear();
        this.isComplete = (TileEntityBeacon.llllIIIIIIlIl[3] != 0);
        BeamSegment lllllllllllllIlIllllIIIIIlllllll = new BeamSegment(EntitySheep.func_175513_a(EnumDyeColor.WHITE));
        this.beamSegments.add(lllllllllllllIlIllllIIIIIlllllll);
        "".length();
        boolean lllllllllllllIlIllllIIIIIllllllI = TileEntityBeacon.llllIIIIIIlIl[3] != 0;
        final BlockPos.MutableBlockPos lllllllllllllIlIllllIIIIIlllllIl = new BlockPos.MutableBlockPos();
        int lllllllllllllIlIllllIIIIIlllllII = lllllllllllllIlIllllIIIIlIIIIIIl + TileEntityBeacon.llllIIIIIIlIl[3];
        "".length();
        if (((0x49 ^ 0x8 ^ (0x26 ^ 0x7F)) & (0x2A ^ 0x79 ^ (0xFC ^ 0xB7) ^ -" ".length())) != ((0x56 ^ 0x7E ^ (0xCC ^ 0xC1)) & (125 + 149 - 195 + 79 ^ 100 + 144 - 142 + 85 ^ -" ".length()))) {
            return;
        }
        while (!lIlIIllIlIlIIll(lllllllllllllIlIllllIIIIIlllllII, TileEntityBeacon.llllIIIIIIlIl[9])) {
            final IBlockState lllllllllllllIlIllllIIIIIllllIll = this.worldObj.getBlockState(lllllllllllllIlIllllIIIIIlllllIl.func_181079_c(lllllllllllllIlIllllIIIIlIIIIIlI, lllllllllllllIlIllllIIIIIlllllII, lllllllllllllIlIllllIIIIlIIIIIII));
            Label_0603: {
                float[] lllllllllllllIlIllllIIIIIllllIIl = null;
                if (lIlIIlllllIIlIl(lllllllllllllIlIllllIIIIIllllIll.getBlock(), Blocks.stained_glass)) {
                    final float[] lllllllllllllIlIllllIIIIIllllIlI = EntitySheep.func_175513_a(lllllllllllllIlIllllIIIIIllllIll.getValue(BlockStainedGlass.COLOR));
                    "".length();
                    if (((0x19 ^ 0x2F) & ~(0x52 ^ 0x64)) != ((0x90 ^ 0x8D) & ~(0x70 ^ 0x6D))) {
                        return;
                    }
                }
                else if (lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIllllIll.getBlock(), Blocks.stained_glass_pane)) {
                    if (lIlIIllIlIlIIll(lllllllllllllIlIllllIIIIIllllIll.getBlock().getLightOpacity(), TileEntityBeacon.llllIIIIIIlIl[8]) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIllllIll.getBlock(), Blocks.bedrock)) {
                        this.isComplete = (TileEntityBeacon.llllIIIIIIlIl[1] != 0);
                        this.beamSegments.clear();
                        "".length();
                        if (" ".length() == "  ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        lllllllllllllIlIllllIIIIIlllllll.incrementHeight();
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                        break Label_0603;
                    }
                }
                else {
                    lllllllllllllIlIllllIIIIIllllIIl = EntitySheep.func_175513_a(lllllllllllllIlIllllIIIIIllllIll.getValue(BlockStainedGlassPane.COLOR));
                }
                if (lIlIIllIlIlIIII(lllllllllllllIlIllllIIIIIllllllI ? 1 : 0)) {
                    final float[] array = new float[TileEntityBeacon.llllIIIIIIlIl[4]];
                    array[TileEntityBeacon.llllIIIIIIlIl[1]] = (lllllllllllllIlIllllIIIIIlllllll.getColors()[TileEntityBeacon.llllIIIIIIlIl[1]] + lllllllllllllIlIllllIIIIIllllIIl[TileEntityBeacon.llllIIIIIIlIl[1]]) / 2.0f;
                    array[TileEntityBeacon.llllIIIIIIlIl[3]] = (lllllllllllllIlIllllIIIIIlllllll.getColors()[TileEntityBeacon.llllIIIIIIlIl[3]] + lllllllllllllIlIllllIIIIIllllIIl[TileEntityBeacon.llllIIIIIIlIl[3]]) / 2.0f;
                    array[TileEntityBeacon.llllIIIIIIlIl[2]] = (lllllllllllllIlIllllIIIIIlllllll.getColors()[TileEntityBeacon.llllIIIIIIlIl[2]] + lllllllllllllIlIllllIIIIIllllIIl[TileEntityBeacon.llllIIIIIIlIl[2]]) / 2.0f;
                    lllllllllllllIlIllllIIIIIllllIIl = array;
                }
                if (lIlIIllIlIlIIIl(Arrays.equals(lllllllllllllIlIllllIIIIIllllIIl, lllllllllllllIlIllllIIIIIlllllll.getColors()) ? 1 : 0)) {
                    lllllllllllllIlIllllIIIIIlllllll.incrementHeight();
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIllllIIIIIlllllll = new BeamSegment(lllllllllllllIlIllllIIIIIllllIIl);
                    this.beamSegments.add(lllllllllllllIlIllllIIIIIlllllll);
                    "".length();
                }
                lllllllllllllIlIllllIIIIIllllllI = (TileEntityBeacon.llllIIIIIIlIl[1] != 0);
            }
            ++lllllllllllllIlIllllIIIIIlllllII;
        }
        if (lIlIIllIlIlIIIl(this.isComplete ? 1 : 0)) {
            int lllllllllllllIlIllllIIIIIllllIII = TileEntityBeacon.llllIIIIIIlIl[3];
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
            while (!lIlIIlllllIlIII(lllllllllllllIlIllllIIIIIllllIII, TileEntityBeacon.llllIIIIIIlIl[0])) {
                final int lllllllllllllIlIllllIIIIIlllIlll = lllllllllllllIlIllllIIIIlIIIIIIl - lllllllllllllIlIllllIIIIIllllIII;
                if (lIlIIlllllIIlll(lllllllllllllIlIllllIIIIIlllIlll)) {
                    "".length();
                    if (((0xB8 ^ 0x89) & ~(0x7 ^ 0x36)) != 0x0) {
                        return;
                    }
                    break;
                }
                else {
                    boolean lllllllllllllIlIllllIIIIIlllIllI = TileEntityBeacon.llllIIIIIIlIl[3] != 0;
                    int lllllllllllllIlIllllIIIIIlllIlIl = lllllllllllllIlIllllIIIIlIIIIIlI - lllllllllllllIlIllllIIIIIllllIII;
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                    while (lIlIIlllllIlIIl(lllllllllllllIlIllllIIIIIlllIlIl, lllllllllllllIlIllllIIIIlIIIIIlI + lllllllllllllIlIllllIIIIIllllIII) && !lIlIIllIlIlIIII(lllllllllllllIlIllllIIIIIlllIllI ? 1 : 0)) {
                        int lllllllllllllIlIllllIIIIIlllIlII = lllllllllllllIlIllllIIIIlIIIIIII - lllllllllllllIlIllllIIIIIllllIII;
                        "".length();
                        if (null != null) {
                            return;
                        }
                        while (!lIlIIlllllIlIII(lllllllllllllIlIllllIIIIIlllIlII, lllllllllllllIlIllllIIIIlIIIIIII + lllllllllllllIlIllllIIIIIllllIII)) {
                            final Block lllllllllllllIlIllllIIIIIlllIIll = this.worldObj.getBlockState(new BlockPos(lllllllllllllIlIllllIIIIIlllIlIl, lllllllllllllIlIllllIIIIIlllIlll, lllllllllllllIlIllllIIIIIlllIlII)).getBlock();
                            if (lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlllIIll, Blocks.emerald_block) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlllIIll, Blocks.gold_block) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlllIIll, Blocks.diamond_block) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlllIIll, Blocks.iron_block)) {
                                lllllllllllllIlIllllIIIIIlllIllI = (TileEntityBeacon.llllIIIIIIlIl[1] != 0);
                                "".length();
                                if (((47 + 48 + 37 + 2 ^ 45 + 154 - 196 + 168) & (0xD1 ^ 0x80 ^ (0x1E ^ 0x62) ^ -" ".length())) > 0) {
                                    return;
                                }
                                break;
                            }
                            else {
                                ++lllllllllllllIlIllllIIIIIlllIlII;
                            }
                        }
                        ++lllllllllllllIlIllllIIIIIlllIlIl;
                    }
                    if (lIlIIllIlIlIIII(lllllllllllllIlIllllIIIIIlllIllI ? 1 : 0)) {
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.levels = lllllllllllllIlIllllIIIIIllllIII++;
                    }
                }
            }
            if (lIlIIllIlIlIIII(this.levels)) {
                this.isComplete = (TileEntityBeacon.llllIIIIIIlIl[1] != 0);
            }
        }
        if (lIlIIllIlIlIIII(this.worldObj.isRemote ? 1 : 0) && lIlIIllIlIlIlII(this.levels, TileEntityBeacon.llllIIIIIIlIl[0]) && lIlIIlllllIlIlI(lllllllllllllIlIllllIIIIlIIIIIll, this.levels)) {
            final Iterator<EntityPlayer> iterator = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityPlayer>)EntityPlayer.class, new AxisAlignedBB(lllllllllllllIlIllllIIIIlIIIIIlI, lllllllllllllIlIllllIIIIlIIIIIIl, lllllllllllllIlIllllIIIIlIIIIIII, lllllllllllllIlIllllIIIIlIIIIIlI, lllllllllllllIlIllllIIIIlIIIIIIl - TileEntityBeacon.llllIIIIIIlIl[0], lllllllllllllIlIllllIIIIlIIIIIII).expand(10.0, 5.0, 10.0)).iterator();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
            while (!lIlIIllIlIlIIII(iterator.hasNext() ? 1 : 0)) {
                final EntityPlayer lllllllllllllIlIllllIIIIIlllIIlI = iterator.next();
                lllllllllllllIlIllllIIIIIlllIIlI.triggerAchievement(AchievementList.fullBeacon);
            }
        }
    }
    
    @Override
    public ItemStack getStackInSlot(final int lllllllllllllIlIllllIIIIIIllllII) {
        ItemStack payment;
        if (lIlIIllIlIlIIII(lllllllllllllIlIllllIIIIIIllllII)) {
            payment = this.payment;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            payment = null;
        }
        return payment;
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIlIllllIIIIIIIIIlll) {
    }
    
    private int func_183001_h(final int lllllllllllllIlIllllIIIIIlIlIIII) {
        if (lIlIIlllllIllIl(lllllllllllllIlIllllIIIIIlIlIIII) && lIlIIlllllIlIlI(lllllllllllllIlIllllIIIIIlIlIIII, Potion.potionTypes.length) && lIlIIlllllIlllI(Potion.potionTypes[lllllllllllllIlIllllIIIIIlIlIIII])) {
            final Potion lllllllllllllIlIllllIIIIIlIIllll = Potion.potionTypes[lllllllllllllIlIllllIIIIIlIlIIII];
            int n;
            if (lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlIIllll, Potion.moveSpeed) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlIIllll, Potion.digSpeed) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlIIllll, Potion.resistance) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlIIllll, Potion.jump) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlIIllll, Potion.damageBoost) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIlIIllll, Potion.regeneration)) {
                n = TileEntityBeacon.llllIIIIIIlIl[1];
                "".length();
                if (" ".length() != " ".length()) {
                    return (0xCB ^ 0x9E) & ~(0x60 ^ 0x35) & ~((0xD3 ^ 0x89) & ~(0x1E ^ 0x44));
                }
            }
            else {
                n = lllllllllllllIlIllllIIIIIlIlIIII;
            }
            return n;
        }
        return TileEntityBeacon.llllIIIIIIlIl[1];
    }
    
    static {
        lIlIIllIlIIlllI();
        lIlIIllIlIIIIlI();
        final Potion[][] effectsList2 = new Potion[TileEntityBeacon.llllIIIIIIlIl[0]][];
        final int n = TileEntityBeacon.llllIIIIIIlIl[1];
        final Potion[] array = new Potion[TileEntityBeacon.llllIIIIIIlIl[2]];
        array[TileEntityBeacon.llllIIIIIIlIl[1]] = Potion.moveSpeed;
        array[TileEntityBeacon.llllIIIIIIlIl[3]] = Potion.digSpeed;
        effectsList2[n] = array;
        final int n2 = TileEntityBeacon.llllIIIIIIlIl[3];
        final Potion[] array2 = new Potion[TileEntityBeacon.llllIIIIIIlIl[2]];
        array2[TileEntityBeacon.llllIIIIIIlIl[1]] = Potion.resistance;
        array2[TileEntityBeacon.llllIIIIIIlIl[3]] = Potion.jump;
        effectsList2[n2] = array2;
        final int n3 = TileEntityBeacon.llllIIIIIIlIl[2];
        final Potion[] array3 = new Potion[TileEntityBeacon.llllIIIIIIlIl[3]];
        array3[TileEntityBeacon.llllIIIIIIlIl[1]] = Potion.damageBoost;
        effectsList2[n3] = array3;
        final int n4 = TileEntityBeacon.llllIIIIIIlIl[4];
        final Potion[] array4 = new Potion[TileEntityBeacon.llllIIIIIIlIl[3]];
        array4[TileEntityBeacon.llllIIIIIIlIl[1]] = Potion.regeneration;
        effectsList2[n4] = array4;
        effectsList = effectsList2;
    }
    
    @Override
    public double getMaxRenderDistanceSquared() {
        return 65536.0;
    }
    
    private static boolean lIlIIlllllIIlIl(final Object lllllllllllllIlIlllIlllllIIIllll, final Object lllllllllllllIlIlllIlllllIIIlllI) {
        return lllllllllllllIlIlllIlllllIIIllll == lllllllllllllIlIlllIlllllIIIlllI;
    }
    
    private static boolean lIlIIllllllIIII(final int lllllllllllllIlIlllIllllIlllllII) {
        return lllllllllllllIlIlllIllllIlllllII <= 0;
    }
    
    private static void lIlIIllIlIIIIlI() {
        (llllIIIIIIIlI = new String[TileEntityBeacon.llllIIIIIIlIl[13]])[TileEntityBeacon.llllIIIIIIlIl[1]] = lIlIIllIIllllII("NgYABCoUDQ==", "ftiiK");
        TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[3]] = lIlIIllIIllllIl("wIiAi9dGhTOuxWyUncxLZg==", "BFpAF");
        TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[2]] = lIlIIllIIllllII("CAAHJAU3", "DeqAi");
        TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[4]] = lIlIIllIIllllII("BwQ4GCslDw==", "WvQuJ");
        TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[0]] = lIlIIllIIllllIl("ho9qeTn70xABWot6um3c+Q==", "vxEtU");
        TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[10]] = lIlIIllIlIIIIIl("XhXK571DXbg=", "CDGhz");
        TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[11]] = lIlIIllIIllllIl("3HWuf5+JT/jA1tcFbndU1ZN4pEQD5TG/", "QWAEx");
        TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[12]] = lIlIIllIlIIIIIl("xtST1FLl/55c9D8cRcrjkSBZVOO2qzCD", "mVvyy");
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final NBTTagCompound lllllllllllllIlIllllIIIIIlIlIlll = new NBTTagCompound();
        this.writeToNBT(lllllllllllllIlIllllIIIIIlIlIlll);
        return new S35PacketUpdateTileEntity(this.pos, TileEntityBeacon.llllIIIIIIlIl[4], lllllllllllllIlIllllIIIIIlIlIlll);
    }
    
    @Override
    public Container createContainer(final InventoryPlayer lllllllllllllIlIlllIlllllllllIII, final EntityPlayer lllllllllllllIlIlllIlllllllllIlI) {
        return new ContainerBeacon(lllllllllllllIlIlllIlllllllllIII, this);
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIlIllllIIIIIIllIlII, final int lllllllllllllIlIllllIIIIIIllIIll) {
        if (!lIlIIllIlIlIIII(lllllllllllllIlIllllIIIIIIllIlII) || !lIlIIlllllIlllI(this.payment)) {
            return null;
        }
        if (lIlIIllIlIlIIll(lllllllllllllIlIllllIIIIIIllIIll, this.payment.stackSize)) {
            final ItemStack lllllllllllllIlIllllIIIIIIllIIlI = this.payment;
            this.payment = null;
            return lllllllllllllIlIllllIIIIIIllIIlI;
        }
        final ItemStack payment = this.payment;
        payment.stackSize -= lllllllllllllIlIllllIIIIIIllIIll;
        return new ItemStack(this.payment.getItem(), lllllllllllllIlIllllIIIIIIllIIll, this.payment.getMetadata());
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIlIllllIIIIIIIIlIIl) {
        int n;
        if (lIlIIlllllIIllI(this.worldObj.getTileEntity(this.pos), this)) {
            n = TileEntityBeacon.llllIIIIIIlIl[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x4 ^ 0x28) & ~(0xEA ^ 0xC6)) != 0x0;
            }
        }
        else if (lIlIIllllllIIII(lIlIIlllllIllll(lllllllllllllIlIllllIIIIIIIIlIIl.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = TileEntityBeacon.llllIIIIIIlIl[3];
            "".length();
            if ((0x95 ^ 0xB8 ^ (0x92 ^ 0xBB)) != (0x40 ^ 0x24 ^ (0x59 ^ 0x39))) {
                return ((160 + 235 - 194 + 42 ^ 68 + 123 - 123 + 107) & (0x19 ^ 0x78 ^ (0x76 ^ 0x4B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = TileEntityBeacon.llllIIIIIIlIl[1];
        }
        return n != 0;
    }
    
    @Override
    public int getSizeInventory() {
        return TileEntityBeacon.llllIIIIIIlIl[3];
    }
    
    @Override
    public void setInventorySlotContents(final int lllllllllllllIlIllllIIIIIIlIIIII, final ItemStack lllllllllllllIlIllllIIIIIIIlllll) {
        if (lIlIIllIlIlIIII(lllllllllllllIlIllllIIIIIIlIIIII)) {
            this.payment = lllllllllllllIlIllllIIIIIIIlllll;
        }
    }
    
    private static String lIlIIllIIllllIl(final String lllllllllllllIlIlllIllllllIIIlll, final String lllllllllllllIlIlllIllllllIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIllllllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIllllllIIIlII.getBytes(StandardCharsets.UTF_8)), TileEntityBeacon.llllIIIIIIlIl[13]), "DES");
            final Cipher lllllllllllllIlIlllIllllllIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlllIllllllIIlIIl.init(TileEntityBeacon.llllIIIIIIlIl[2], lllllllllllllIlIlllIllllllIIlIlI);
            return new String(lllllllllllllIlIlllIllllllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIllllllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIllllllIIlIII) {
            lllllllllllllIlIlllIllllllIIlIII.printStackTrace();
            return null;
        }
    }
    
    public TileEntityBeacon() {
        this.beamSegments = (List<BeamSegment>)Lists.newArrayList();
        this.levels = TileEntityBeacon.llllIIIIIIlIl[5];
    }
    
    private static boolean lIlIIllIlIlIIIl(final int lllllllllllllIlIlllIlllllIIIlIIl) {
        return lllllllllllllIlIlllIlllllIIIlIIl != 0;
    }
    
    private static int lIlIIlllllIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIlIllllIIIIIIIIIlIl) {
    }
    
    @Override
    public int getInventoryStackLimit() {
        return TileEntityBeacon.llllIIIIIIlIl[3];
    }
    
    @Override
    public void update() {
        if (lIlIIllIlIlIIII(lIlIIllIlIIllll(this.worldObj.getTotalWorldTime() % 80L, 0L))) {
            this.updateBeacon();
        }
    }
    
    @Override
    public boolean hasCustomName() {
        if (lIlIIlllllIlllI(this.customName) && lIlIIllIlIlIIlI(this.customName.length())) {
            return TileEntityBeacon.llllIIIIIIlIl[3] != 0;
        }
        return TileEntityBeacon.llllIIIIIIlIl[1] != 0;
    }
    
    public void updateBeacon() {
        this.updateSegmentColors();
        this.addEffectsToPlayers();
    }
    
    private static String lIlIIllIlIIIIIl(final String lllllllllllllIlIlllIllllllIlIlII, final String lllllllllllllIlIlllIllllllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIllllllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIllllllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIllllllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIllllllIlIllI.init(TileEntityBeacon.llllIIIIIIlIl[2], lllllllllllllIlIlllIllllllIlIlll);
            return new String(lllllllllllllIlIlllIllllllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIllllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIllllllIlIlIl) {
            lllllllllllllIlIlllIllllllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void clear() {
        this.payment = null;
    }
    
    private static void lIlIIllIlIIlllI() {
        (llllIIIIIIlIl = new int[14])[0] = (0xF5 ^ 0xC2 ^ (0xD ^ 0x3E));
        TileEntityBeacon.llllIIIIIIlIl[1] = ((0x7F ^ 0x38) & ~(0x56 ^ 0x11));
        TileEntityBeacon.llllIIIIIIlIl[2] = "  ".length();
        TileEntityBeacon.llllIIIIIIlIl[3] = " ".length();
        TileEntityBeacon.llllIIIIIIlIl[4] = "   ".length();
        TileEntityBeacon.llllIIIIIIlIl[5] = -" ".length();
        TileEntityBeacon.llllIIIIIIlIl[6] = (0xA0 ^ 0xAA);
        TileEntityBeacon.llllIIIIIIlIl[7] = (0x62 ^ 0x7B) + (0x8B ^ 0x81) - -(5 + 33 + 7 + 95) + (0xA ^ 0xF);
        TileEntityBeacon.llllIIIIIIlIl[8] = (0x8F ^ 0x80);
        TileEntityBeacon.llllIIIIIIlIl[9] = (-(0xFFFF9F2F & 0x78FA) & (0xFFFF996D & 0x7FBB));
        TileEntityBeacon.llllIIIIIIlIl[10] = (0xC0 ^ 0xC5);
        TileEntityBeacon.llllIIIIIIlIl[11] = (0x8 ^ 0x2D ^ (0x4C ^ 0x6F));
        TileEntityBeacon.llllIIIIIIlIl[12] = (0x13 ^ 0x14);
        TileEntityBeacon.llllIIIIIIlIl[13] = (0x3D ^ 0x7F ^ (0xDD ^ 0x97));
    }
    
    private static int lIlIIlllllIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlIIlllllIIlII(final int lllllllllllllIlIlllIllllIlllIIlI, final int lllllllllllllIlIlllIllllIlllIIII) {
        return lllllllllllllIlIlllIllllIlllIIlI != lllllllllllllIlIlllIllllIlllIIII;
    }
    
    @Override
    public String getName() {
        String customName;
        if (lIlIIllIlIlIIIl(this.hasCustomName() ? 1 : 0)) {
            customName = this.customName;
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else {
            customName = TileEntityBeacon.llllIIIIIIIlI[TileEntityBeacon.llllIIIIIIlIl[11]];
        }
        return customName;
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIlIllllIIIIIIIIIIlI, final ItemStack lllllllllllllIlIllllIIIIIIIIIIII) {
        if (lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIIIIIIII.getItem(), Items.emerald) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIIIIIIII.getItem(), Items.diamond) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIIIIIIII.getItem(), Items.gold_ingot) && lIlIIlllllIIllI(lllllllllllllIlIllllIIIIIIIIIIII.getItem(), Items.iron_ingot)) {
            return TileEntityBeacon.llllIIIIIIlIl[1] != 0;
        }
        return TileEntityBeacon.llllIIIIIIlIl[3] != 0;
    }
    
    private static boolean lIlIIlllllIlIlI(final int lllllllllllllIlIlllIlllllIIlllll, final int lllllllllllllIlIlllIlllllIIllllI) {
        return lllllllllllllIlIlllIlllllIIlllll < lllllllllllllIlIlllIlllllIIllllI;
    }
    
    private static boolean lIlIIlllllIIllI(final Object lllllllllllllIlIlllIlllllIIlIIll, final Object lllllllllllllIlIlllIlllllIIlIIlI) {
        return lllllllllllllIlIlllIlllllIIlIIll != lllllllllllllIlIlllIlllllIIlIIlI;
    }
    
    private void addEffectsToPlayers() {
        if (lIlIIllIlIlIIIl(this.isComplete ? 1 : 0) && lIlIIllIlIlIIlI(this.levels) && lIlIIllIlIlIIII(this.worldObj.isRemote ? 1 : 0) && lIlIIllIlIlIIlI(this.primaryEffect)) {
            final double lllllllllllllIlIllllIIIIlIlIIlIl = this.levels * TileEntityBeacon.llllIIIIIIlIl[6] + TileEntityBeacon.llllIIIIIIlIl[6];
            int lllllllllllllIlIllllIIIIlIlIIlII = TileEntityBeacon.llllIIIIIIlIl[1];
            if (lIlIIllIlIlIIll(this.levels, TileEntityBeacon.llllIIIIIIlIl[0]) && lIlIIllIlIlIlII(this.primaryEffect, this.secondaryEffect)) {
                lllllllllllllIlIllllIIIIlIlIIlII = TileEntityBeacon.llllIIIIIIlIl[3];
            }
            final int lllllllllllllIlIllllIIIIlIlIIIll = this.pos.getX();
            final int lllllllllllllIlIllllIIIIlIlIIIlI = this.pos.getY();
            final int lllllllllllllIlIllllIIIIlIlIIIIl = this.pos.getZ();
            final AxisAlignedBB lllllllllllllIlIllllIIIIlIlIIIII = new AxisAlignedBB(lllllllllllllIlIllllIIIIlIlIIIll, lllllllllllllIlIllllIIIIlIlIIIlI, lllllllllllllIlIllllIIIIlIlIIIIl, lllllllllllllIlIllllIIIIlIlIIIll + TileEntityBeacon.llllIIIIIIlIl[3], lllllllllllllIlIllllIIIIlIlIIIlI + TileEntityBeacon.llllIIIIIIlIl[3], lllllllllllllIlIllllIIIIlIlIIIIl + TileEntityBeacon.llllIIIIIIlIl[3]).expand(lllllllllllllIlIllllIIIIlIlIIlIl, lllllllllllllIlIllllIIIIlIlIIlIl, lllllllllllllIlIllllIIIIlIlIIlIl).addCoord(0.0, this.worldObj.getHeight(), 0.0);
            final List<EntityPlayer> lllllllllllllIlIllllIIIIlIIlllll = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityPlayer>)EntityPlayer.class, lllllllllllllIlIllllIIIIlIlIIIII);
            char lllllllllllllIlIllllIIIIlIIlIIll = (char)lllllllllllllIlIllllIIIIlIIlllll.iterator();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lIlIIllIlIlIIII(((Iterator)lllllllllllllIlIllllIIIIlIIlIIll).hasNext() ? 1 : 0)) {
                final EntityPlayer lllllllllllllIlIllllIIIIlIIllllI = ((Iterator<EntityPlayer>)lllllllllllllIlIllllIIIIlIIlIIll).next();
                lllllllllllllIlIllllIIIIlIIllllI.addPotionEffect(new PotionEffect(this.primaryEffect, TileEntityBeacon.llllIIIIIIlIl[7], lllllllllllllIlIllllIIIIlIlIIlII, (boolean)(TileEntityBeacon.llllIIIIIIlIl[3] != 0), (boolean)(TileEntityBeacon.llllIIIIIIlIl[3] != 0)));
            }
            if (lIlIIllIlIlIIll(this.levels, TileEntityBeacon.llllIIIIIIlIl[0]) && lIlIIlllllIIlII(this.primaryEffect, this.secondaryEffect) && lIlIIllIlIlIIlI(this.secondaryEffect)) {
                lllllllllllllIlIllllIIIIlIIlIIll = (char)lllllllllllllIlIllllIIIIlIIlllll.iterator();
                "".length();
                if ((18 + 50 + 34 + 50 ^ 69 + 6 - 56 + 137) <= "  ".length()) {
                    return;
                }
                while (!lIlIIllIlIlIIII(((Iterator)lllllllllllllIlIllllIIIIlIIlIIll).hasNext() ? 1 : 0)) {
                    final EntityPlayer lllllllllllllIlIllllIIIIlIIlllIl = ((Iterator<EntityPlayer>)lllllllllllllIlIllllIIIIlIIlIIll).next();
                    lllllllllllllIlIllllIIIIlIIlllIl.addPotionEffect(new PotionEffect(this.secondaryEffect, TileEntityBeacon.llllIIIIIIlIl[7], TileEntityBeacon.llllIIIIIIlIl[1], (boolean)(TileEntityBeacon.llllIIIIIIlIl[3] != 0), (boolean)(TileEntityBeacon.llllIIIIIIlIl[3] != 0)));
                }
            }
        }
    }
    
    private static boolean lIlIIllIlIlIIII(final int lllllllllllllIlIlllIlllllIIIIllI) {
        return lllllllllllllIlIlllIlllllIIIIllI == 0;
    }
    
    private static boolean lIlIIlllllIlIIl(final int lllllllllllllIlIlllIlllllIIllIll, final int lllllllllllllIlIlllIlllllIIllIlI) {
        return lllllllllllllIlIlllIlllllIIllIll <= lllllllllllllIlIlllIlllllIIllIlI;
    }
    
    @Override
    public void setField(final int lllllllllllllIlIlllIlllllllIllIl, final int lllllllllllllIlIlllIlllllllIllII) {
        switch (lllllllllllllIlIlllIlllllllIllIl) {
            case 0: {
                this.levels = lllllllllllllIlIlllIlllllllIllII;
                "".length();
                if ((142 + 91 - 148 + 80 ^ 95 + 40 - 95 + 121) == ((180 + 115 - 236 + 170 ^ 153 + 99 - 176 + 89) & (0x38 ^ 0x69 ^ (0x90 ^ 0x81) ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 1: {
                this.primaryEffect = this.func_183001_h(lllllllllllllIlIlllIlllllllIllII);
                "".length();
                if (((0x67 ^ 0x7) & ~(0xEA ^ 0x8A)) != 0x0) {
                    return;
                }
                break;
            }
            case 2: {
                this.secondaryEffect = this.func_183001_h(lllllllllllllIlIlllIlllllllIllII);
                break;
            }
        }
    }
    
    private static boolean lIlIIllIlIlIIlI(final int lllllllllllllIlIlllIllllIllllIII) {
        return lllllllllllllIlIlllIllllIllllIII > 0;
    }
    
    private static boolean lIlIIllIlIlIIll(final int lllllllllllllIlIlllIlllllIlIIIll, final int lllllllllllllIlIlllIlllllIlIIIlI) {
        return lllllllllllllIlIlllIlllllIlIIIll >= lllllllllllllIlIlllIlllllIlIIIlI;
    }
    
    private static boolean lIlIIllIlIlIlII(final int lllllllllllllIlIlllIlllllIlIIlll, final int lllllllllllllIlIlllIlllllIlIIllI) {
        return lllllllllllllIlIlllIlllllIlIIlll == lllllllllllllIlIlllIlllllIlIIllI;
    }
    
    private static boolean lIlIIlllllIllIl(final int lllllllllllllIlIlllIlllllIIIIIll) {
        return lllllllllllllIlIlllIlllllIIIIIll >= 0;
    }
    
    @Override
    public int getFieldCount() {
        return TileEntityBeacon.llllIIIIIIlIl[4];
    }
    
    public float shouldBeamRender() {
        if (lIlIIllIlIlIIII(this.isComplete ? 1 : 0)) {
            return 0.0f;
        }
        final int lllllllllllllIlIllllIIIIIlIlllIl = (int)(this.worldObj.getTotalWorldTime() - this.beamRenderCounter);
        this.beamRenderCounter = this.worldObj.getTotalWorldTime();
        if (lIlIIlllllIlIII(lllllllllllllIlIllllIIIIIlIlllIl, TileEntityBeacon.llllIIIIIIlIl[3])) {
            this.field_146014_j -= lllllllllllllIlIllllIIIIIlIlllIl / 40.0f;
            if (lIlIIlllllIIlll(lIlIIlllllIlIll(this.field_146014_j, 0.0f))) {
                this.field_146014_j = 0.0f;
            }
        }
        this.field_146014_j += 0.025f;
        if (lIlIIllIlIlIIlI(lIlIIlllllIllII(this.field_146014_j, 1.0f))) {
            this.field_146014_j = 1.0f;
        }
        return this.field_146014_j;
    }
    
    @Override
    public int getField(final int lllllllllllllIlIlllIllllllllIIlI) {
        switch (lllllllllllllIlIlllIllllllllIIlI) {
            case 0: {
                return this.levels;
            }
            case 1: {
                return this.primaryEffect;
            }
            case 2: {
                return this.secondaryEffect;
            }
            default: {
                return TileEntityBeacon.llllIIIIIIlIl[1];
            }
        }
    }
    
    private static boolean lIlIIlllllIlllI(final Object lllllllllllllIlIlllIlllllIIIllII) {
        return lllllllllllllIlIlllIlllllIIIllII != null;
    }
    
    public List<BeamSegment> getBeamSegments() {
        return this.beamSegments;
    }
    
    @Override
    public boolean receiveClientEvent(final int lllllllllllllIlIlllIlllllllIIIII, final int lllllllllllllIlIlllIllllllIlllII) {
        if (lIlIIllIlIlIlII(lllllllllllllIlIlllIlllllllIIIII, TileEntityBeacon.llllIIIIIIlIl[3])) {
            this.updateBeacon();
            return TileEntityBeacon.llllIIIIIIlIl[3] != 0;
        }
        return super.receiveClientEvent(lllllllllllllIlIlllIlllllllIIIII, lllllllllllllIlIlllIllllllIlllII);
    }
    
    public static class BeamSegment
    {
        private /* synthetic */ int height;
        private static final /* synthetic */ int[] lllIlllIllIIlI;
        private final /* synthetic */ float[] colors;
        
        private static void lIlIIlIlllIIIllI() {
            (lllIlllIllIIlI = new int[1])[0] = " ".length();
        }
        
        public BeamSegment(final float[] llllllllllllIlIllIIIIIllIlIlIlll) {
            this.colors = llllllllllllIlIllIIIIIllIlIlIlll;
            this.height = BeamSegment.lllIlllIllIIlI[0];
        }
        
        protected void incrementHeight() {
            this.height += BeamSegment.lllIlllIllIIlI[0];
        }
        
        public float[] getColors() {
            return this.colors;
        }
        
        static {
            lIlIIlIlllIIIllI();
        }
        
        public int getHeight() {
            return this.height;
        }
    }
}
