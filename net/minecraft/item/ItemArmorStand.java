// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.Rotations;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;

public class ItemArmorStand extends Item
{
    private static final /* synthetic */ int[] llIlIIIIlIIIlI;
    private static final /* synthetic */ String[] llIlIIIIlIIIII;
    
    private static boolean lIIlIIIlIlIIIlll(final int llllllllllllIllIllIllIIIlIlIIIll) {
        return llllllllllllIllIllIllIIIlIlIIIll == 0;
    }
    
    private static void lIIlIIIlIlIIIlII() {
        (llIlIIIIlIIIlI = new int[5])[0] = ((0x4F ^ 0x4A ^ (0xBA ^ 0x8D)) & (0x2A ^ 0x49 ^ (0x30 ^ 0x61) ^ -" ".length()));
        ItemArmorStand.llIlIIIIlIIIlI[1] = " ".length();
        ItemArmorStand.llIlIIIIlIIIlI[2] = (0xC8 ^ 0xC2);
        ItemArmorStand.llIlIIIIlIIIlI[3] = "  ".length();
        ItemArmorStand.llIlIIIIlIIIlI[4] = (35 + 158 - 105 + 72 ^ 28 + 49 - 20 + 111);
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIllIllIllIIIllIlllIl, final EntityPlayer llllllllllllIllIllIllIIIllllIIIl, final World llllllllllllIllIllIllIIIllIllIll, final BlockPos llllllllllllIllIllIllIIIlllIllll, final EnumFacing llllllllllllIllIllIllIIIllIllIIl, final float llllllllllllIllIllIllIIIlllIllIl, final float llllllllllllIllIllIllIIIlllIllII, final float llllllllllllIllIllIllIIIlllIlIll) {
        if (lIIlIIIlIlIIIlIl(llllllllllllIllIllIllIIIllIllIIl, EnumFacing.DOWN)) {
            return ItemArmorStand.llIlIIIIlIIIlI[0] != 0;
        }
        final boolean llllllllllllIllIllIllIIIlllIlIlI = llllllllllllIllIllIllIIIllIllIll.getBlockState(llllllllllllIllIllIllIIIlllIllll).getBlock().isReplaceable(llllllllllllIllIllIllIIIllIllIll, llllllllllllIllIllIllIIIlllIllll);
        BlockPos offset;
        if (lIIlIIIlIlIIIllI(llllllllllllIllIllIllIIIlllIlIlI ? 1 : 0)) {
            offset = llllllllllllIllIllIllIIIlllIllll;
            "".length();
            if ((" ".length() & ~" ".length()) >= (0x96 ^ 0x92)) {
                return ((0xF5 ^ 0xBB) & ~(0xC0 ^ 0x8E)) != 0x0;
            }
        }
        else {
            offset = llllllllllllIllIllIllIIIlllIllll.offset(llllllllllllIllIllIllIIIllIllIIl);
        }
        final BlockPos llllllllllllIllIllIllIIIlllIlIIl = offset;
        if (lIIlIIIlIlIIIlll(llllllllllllIllIllIllIIIllllIIIl.canPlayerEdit(llllllllllllIllIllIllIIIlllIlIIl, llllllllllllIllIllIllIIIllIllIIl, llllllllllllIllIllIllIIIllIlllIl) ? 1 : 0)) {
            return ItemArmorStand.llIlIIIIlIIIlI[0] != 0;
        }
        final BlockPos llllllllllllIllIllIllIIIlllIlIII = llllllllllllIllIllIllIIIlllIlIIl.up();
        int n;
        if (lIIlIIIlIlIIIlll(llllllllllllIllIllIllIIIllIllIll.isAirBlock(llllllllllllIllIllIllIIIlllIlIIl) ? 1 : 0) && lIIlIIIlIlIIIlll(llllllllllllIllIllIllIIIllIllIll.getBlockState(llllllllllllIllIllIllIIIlllIlIIl).getBlock().isReplaceable(llllllllllllIllIllIllIIIllIllIll, llllllllllllIllIllIllIIIlllIlIIl) ? 1 : 0)) {
            n = ItemArmorStand.llIlIIIIlIIIlI[1];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return ((0x80 ^ 0xB5) & ~(0x0 ^ 0x35)) != 0x0;
            }
        }
        else {
            n = ItemArmorStand.llIlIIIIlIIIlI[0];
        }
        final int n2;
        boolean llllllllllllIllIllIllIIIlllIIlll = (n2 = n) != 0;
        int n3;
        if (lIIlIIIlIlIIIlll(llllllllllllIllIllIllIIIllIllIll.isAirBlock(llllllllllllIllIllIllIIIlllIlIII) ? 1 : 0) && lIIlIIIlIlIIIlll(llllllllllllIllIllIllIIIllIllIll.getBlockState(llllllllllllIllIllIllIIIlllIlIII).getBlock().isReplaceable(llllllllllllIllIllIllIIIllIllIll, llllllllllllIllIllIllIIIlllIlIII) ? 1 : 0)) {
            n3 = ItemArmorStand.llIlIIIIlIIIlI[1];
            "".length();
            if (" ".length() != " ".length()) {
                return ((0xC6 ^ 0xBA ^ (0x4D ^ 0x16)) & (0x7E ^ 0x48 ^ (0x81 ^ 0x90) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = ItemArmorStand.llIlIIIIlIIIlI[0];
        }
        llllllllllllIllIllIllIIIlllIIlll = ((n2 | n3) != 0x0);
        if (lIIlIIIlIlIIIllI(llllllllllllIllIllIllIIIlllIIlll ? 1 : 0)) {
            return ItemArmorStand.llIlIIIIlIIIlI[0] != 0;
        }
        final double llllllllllllIllIllIllIIIlllIIllI = llllllllllllIllIllIllIIIlllIlIIl.getX();
        final double llllllllllllIllIllIllIIIlllIIlIl = llllllllllllIllIllIllIIIlllIlIIl.getY();
        final double llllllllllllIllIllIllIIIlllIIlII = llllllllllllIllIllIllIIIlllIlIIl.getZ();
        final List<Entity> llllllllllllIllIllIllIIIlllIIIll = llllllllllllIllIllIllIIIllIllIll.getEntitiesWithinAABBExcludingEntity(null, AxisAlignedBB.fromBounds(llllllllllllIllIllIllIIIlllIIllI, llllllllllllIllIllIllIIIlllIIlIl, llllllllllllIllIllIllIIIlllIIlII, llllllllllllIllIllIllIIIlllIIllI + 1.0, llllllllllllIllIllIllIIIlllIIlIl + 2.0, llllllllllllIllIllIllIIIlllIIlII + 1.0));
        if (lIIlIIIlIlIIlIII(llllllllllllIllIllIllIIIlllIIIll.size())) {
            return ItemArmorStand.llIlIIIIlIIIlI[0] != 0;
        }
        if (lIIlIIIlIlIIIlll(llllllllllllIllIllIllIIIllIllIll.isRemote ? 1 : 0)) {
            llllllllllllIllIllIllIIIllIllIll.setBlockToAir(llllllllllllIllIllIllIIIlllIlIIl);
            "".length();
            llllllllllllIllIllIllIIIllIllIll.setBlockToAir(llllllllllllIllIllIllIIIlllIlIII);
            "".length();
            final EntityArmorStand llllllllllllIllIllIllIIIlllIIIlI = new EntityArmorStand(llllllllllllIllIllIllIIIllIllIll, llllllllllllIllIllIllIIIlllIIllI + 0.5, llllllllllllIllIllIllIIIlllIIlIl, llllllllllllIllIllIllIIIlllIIlII + 0.5);
            final float llllllllllllIllIllIllIIIlllIIIIl = MathHelper.floor_float((MathHelper.wrapAngleTo180_float(llllllllllllIllIllIllIIIllllIIIl.rotationYaw - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            llllllllllllIllIllIllIIIlllIIIlI.setLocationAndAngles(llllllllllllIllIllIllIIIlllIIllI + 0.5, llllllllllllIllIllIllIIIlllIIlIl, llllllllllllIllIllIllIIIlllIIlII + 0.5, llllllllllllIllIllIllIIIlllIIIIl, 0.0f);
            this.applyRandomRotations(llllllllllllIllIllIllIIIlllIIIlI, llllllllllllIllIllIllIIIllIllIll.rand);
            final NBTTagCompound llllllllllllIllIllIllIIIlllIIIII = llllllllllllIllIllIllIIIllIlllIl.getTagCompound();
            if (lIIlIIIlIlIIlIIl(llllllllllllIllIllIllIIIlllIIIII) && lIIlIIIlIlIIIllI(llllllllllllIllIllIllIIIlllIIIII.hasKey(ItemArmorStand.llIlIIIIlIIIII[ItemArmorStand.llIlIIIIlIIIlI[0]], ItemArmorStand.llIlIIIIlIIIlI[2]) ? 1 : 0)) {
                final NBTTagCompound llllllllllllIllIllIllIIIllIlllll = new NBTTagCompound();
                llllllllllllIllIllIllIIIlllIIIlI.writeToNBTOptional(llllllllllllIllIllIllIIIllIlllll);
                "".length();
                llllllllllllIllIllIllIIIllIlllll.merge(llllllllllllIllIllIllIIIlllIIIII.getCompoundTag(ItemArmorStand.llIlIIIIlIIIII[ItemArmorStand.llIlIIIIlIIIlI[1]]));
                llllllllllllIllIllIllIIIlllIIIlI.readFromNBT(llllllllllllIllIllIllIIIllIlllll);
            }
            llllllllllllIllIllIllIIIllIllIll.spawnEntityInWorld(llllllllllllIllIllIllIIIlllIIIlI);
            "".length();
        }
        llllllllllllIllIllIllIIIllIlllIl.stackSize -= ItemArmorStand.llIlIIIIlIIIlI[1];
        return ItemArmorStand.llIlIIIIlIIIlI[1] != 0;
    }
    
    private static boolean lIIlIIIlIlIIIlIl(final Object llllllllllllIllIllIllIIIlIlIlIlI, final Object llllllllllllIllIllIllIIIlIlIlIIl) {
        return llllllllllllIllIllIllIIIlIlIlIlI == llllllllllllIllIllIllIIIlIlIlIIl;
    }
    
    public ItemArmorStand() {
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static void lIIlIIIlIlIIIIII() {
        (llIlIIIIlIIIII = new String[ItemArmorStand.llIlIIIIlIIIlI[3]])[ItemArmorStand.llIlIIIIlIIIlI[0]] = lIIlIIIlIIllllll("QpdvyIpc7f8ZfiNp74jFDQ==", "XIbYm");
        ItemArmorStand.llIlIIIIlIIIII[ItemArmorStand.llIlIIIIlIIIlI[1]] = lIIlIIIlIIllllll("clpVtFX5tr1dRhCqpW4UKw==", "mzngB");
    }
    
    private static boolean lIIlIIIlIlIIIllI(final int llllllllllllIllIllIllIIIlIlIIlIl) {
        return llllllllllllIllIllIllIIIlIlIIlIl != 0;
    }
    
    private static boolean lIIlIIIlIlIIlIII(final int llllllllllllIllIllIllIIIlIlIIIIl) {
        return llllllllllllIllIllIllIIIlIlIIIIl > 0;
    }
    
    private static String lIIlIIIlIIllllll(final String llllllllllllIllIllIllIIIlIllIIII, final String llllllllllllIllIllIllIIIlIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIllIIIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllIIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), ItemArmorStand.llIlIIIIlIIIlI[4]), "DES");
            final Cipher llllllllllllIllIllIllIIIlIllIlII = Cipher.getInstance("DES");
            llllllllllllIllIllIllIIIlIllIlII.init(ItemArmorStand.llIlIIIIlIIIlI[3], llllllllllllIllIllIllIIIlIllIlIl);
            return new String(llllllllllllIllIllIllIIIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllIIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllIIIlIllIIll) {
            llllllllllllIllIllIllIIIlIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIlIlIIlIIl(final Object llllllllllllIllIllIllIIIlIlIIlll) {
        return llllllllllllIllIllIllIIIlIlIIlll != null;
    }
    
    private void applyRandomRotations(final EntityArmorStand llllllllllllIllIllIllIIIlIllllll, final Random llllllllllllIllIllIllIIIlIlllllI) {
        Rotations llllllllllllIllIllIllIIIllIIIIll = llllllllllllIllIllIllIIIlIllllll.getHeadRotation();
        float llllllllllllIllIllIllIIIllIIIIlI = llllllllllllIllIllIllIIIlIlllllI.nextFloat() * 5.0f;
        final float llllllllllllIllIllIllIIIllIIIIIl = llllllllllllIllIllIllIIIlIlllllI.nextFloat() * 20.0f - 10.0f;
        Rotations llllllllllllIllIllIllIIIllIIIIII = new Rotations(llllllllllllIllIllIllIIIllIIIIll.getX() + llllllllllllIllIllIllIIIllIIIIlI, llllllllllllIllIllIllIIIllIIIIll.getY() + llllllllllllIllIllIllIIIllIIIIIl, llllllllllllIllIllIllIIIllIIIIll.getZ());
        llllllllllllIllIllIllIIIlIllllll.setHeadRotation(llllllllllllIllIllIllIIIllIIIIII);
        llllllllllllIllIllIllIIIllIIIIll = llllllllllllIllIllIllIIIlIllllll.getBodyRotation();
        llllllllllllIllIllIllIIIllIIIIlI = llllllllllllIllIllIllIIIlIlllllI.nextFloat() * 10.0f - 5.0f;
        llllllllllllIllIllIllIIIllIIIIII = new Rotations(llllllllllllIllIllIllIIIllIIIIll.getX(), llllllllllllIllIllIllIIIllIIIIll.getY() + llllllllllllIllIllIllIIIllIIIIlI, llllllllllllIllIllIllIIIllIIIIll.getZ());
        llllllllllllIllIllIllIIIlIllllll.setBodyRotation(llllllllllllIllIllIllIIIllIIIIII);
    }
    
    static {
        lIIlIIIlIlIIIlII();
        lIIlIIIlIlIIIIII();
    }
}
