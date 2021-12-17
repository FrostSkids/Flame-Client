// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;

public class EntityMinecartChest extends EntityMinecartContainer
{
    private static final /* synthetic */ String[] lIlIIIllIIIlIl;
    private static final /* synthetic */ int[] lIlIIIllIIIllI;
    
    @Override
    public EnumMinecartType getMinecartType() {
        return EnumMinecartType.CHEST;
    }
    
    private static boolean lllIIIllIllllll(final int lllllllllllllIIIllllIIllIIllllII, final int lllllllllllllIIIllllIIllIIlllIll) {
        return lllllllllllllIIIllllIIllIIllllII < lllllllllllllIIIllllIIllIIlllIll;
    }
    
    @Override
    public void killMinecart(final DamageSource lllllllllllllIIIllllIIllIlllIIlI) {
        super.killMinecart(lllllllllllllIIIllllIIllIlllIIlI);
        if (lllIIIllIlllllI(this.worldObj.getGameRules().getBoolean(EntityMinecartChest.lIlIIIllIIIlIl[EntityMinecartChest.lIlIIIllIIIllI[0]]) ? 1 : 0)) {
            this.dropItemWithOffset(Item.getItemFromBlock(Blocks.chest), EntityMinecartChest.lIlIIIllIIIllI[1], 0.0f);
            "".length();
        }
    }
    
    static {
        lllIIIllIllllIl();
        lllIIIllIllllII();
    }
    
    @Override
    public IBlockState getDefaultDisplayTile() {
        return Blocks.chest.getDefaultState().withProperty((IProperty<Comparable>)BlockChest.FACING, EnumFacing.NORTH);
    }
    
    private static boolean lllIIIllIlllllI(final int lllllllllllllIIIllllIIllIIlllIIl) {
        return lllllllllllllIIIllllIIllIIlllIIl != 0;
    }
    
    public EntityMinecartChest(final World lllllllllllllIIIllllIIllIllllIll, final double lllllllllllllIIIllllIIllIlllllll, final double lllllllllllllIIIllllIIllIllllIIl, final double lllllllllllllIIIllllIIllIlllllIl) {
        super(lllllllllllllIIIllllIIllIllllIll, lllllllllllllIIIllllIIllIlllllll, lllllllllllllIIIllllIIllIllllIIl, lllllllllllllIIIllllIIllIlllllIl);
    }
    
    private static void lllIIIllIllllIl() {
        (lIlIIIllIIIllI = new int[5])[0] = ((0xD9 ^ 0x89) & ~(0x5E ^ 0xE));
        EntityMinecartChest.lIlIIIllIIIllI[1] = " ".length();
        EntityMinecartChest.lIlIIIllIIIllI[2] = (0x0 ^ 0x1B);
        EntityMinecartChest.lIlIIIllIIIllI[3] = (0xBB ^ 0x9A ^ (0x7F ^ 0x56));
        EntityMinecartChest.lIlIIIllIIIllI[4] = "  ".length();
    }
    
    private static void lllIIIllIllllII() {
        (lIlIIIllIIIlIl = new String[EntityMinecartChest.lIlIIIllIIIllI[4]])[EntityMinecartChest.lIlIIIllIIIllI[0]] = lllIIIllIlllIlI("ISYsCAUsPRAiAyo5Gg==", "EIifq");
        EntityMinecartChest.lIlIIIllIIIlIl[EntityMinecartChest.lIlIIIllIIIllI[1]] = lllIIIllIlllIll("VRv7eAnP9zxOS+secYSOlg==", "xAAla");
    }
    
    private static String lllIIIllIlllIll(final String lllllllllllllIIIllllIIllIlIIIIlI, final String lllllllllllllIIIllllIIllIlIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), EntityMinecartChest.lIlIIIllIIIllI[3]), "DES");
            final Cipher lllllllllllllIIIllllIIllIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIllllIIllIlIIIllI.init(EntityMinecartChest.lIlIIIllIIIllI[4], lllllllllllllIIIllllIIllIlIIIlll);
            return new String(lllllllllllllIIIllllIIllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIllIlIIIlIl) {
            lllllllllllllIIIllllIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getGuiID() {
        return EntityMinecartChest.lIlIIIllIIIlIl[EntityMinecartChest.lIlIIIllIIIllI[1]];
    }
    
    @Override
    public Container createContainer(final InventoryPlayer lllllllllllllIIIllllIIllIllIlIII, final EntityPlayer lllllllllllllIIIllllIIllIllIIlII) {
        return new ContainerChest(lllllllllllllIIIllllIIllIllIlIII, this, lllllllllllllIIIllllIIllIllIIlII);
    }
    
    @Override
    public int getSizeInventory() {
        return EntityMinecartChest.lIlIIIllIIIllI[2];
    }
    
    private static String lllIIIllIlllIlI(String lllllllllllllIIIllllIIllIlIlIlII, final String lllllllllllllIIIllllIIllIlIlIIll) {
        lllllllllllllIIIllllIIllIlIlIlII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllllIIllIlIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllllIIllIlIlIlll = new StringBuilder();
        final char[] lllllllllllllIIIllllIIllIlIlIllI = lllllllllllllIIIllllIIllIlIlIIll.toCharArray();
        int lllllllllllllIIIllllIIllIlIlIlIl = EntityMinecartChest.lIlIIIllIIIllI[0];
        final short lllllllllllllIIIllllIIllIlIIllll = (Object)((String)lllllllllllllIIIllllIIllIlIlIlII).toCharArray();
        final short lllllllllllllIIIllllIIllIlIIlllI = (short)lllllllllllllIIIllllIIllIlIIllll.length;
        int lllllllllllllIIIllllIIllIlIIllIl = EntityMinecartChest.lIlIIIllIIIllI[0];
        while (lllIIIllIllllll(lllllllllllllIIIllllIIllIlIIllIl, lllllllllllllIIIllllIIllIlIIlllI)) {
            final char lllllllllllllIIIllllIIllIlIllIlI = lllllllllllllIIIllllIIllIlIIllll[lllllllllllllIIIllllIIllIlIIllIl];
            lllllllllllllIIIllllIIllIlIlIlll.append((char)(lllllllllllllIIIllllIIllIlIllIlI ^ lllllllllllllIIIllllIIllIlIlIllI[lllllllllllllIIIllllIIllIlIlIlIl % lllllllllllllIIIllllIIllIlIlIllI.length]));
            "".length();
            ++lllllllllllllIIIllllIIllIlIlIlIl;
            ++lllllllllllllIIIllllIIllIlIIllIl;
            "".length();
            if (((12 + 166 - 95 + 89 ^ 147 + 9 - 121 + 115) & (0xB6 ^ 0xA5 ^ (0xBD ^ 0x94) ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllllIIllIlIlIlll);
    }
    
    public EntityMinecartChest(final World lllllllllllllIIIllllIIlllIIIIlll) {
        super(lllllllllllllIIIllllIIlllIIIIlll);
    }
    
    @Override
    public int getDefaultDisplayTileOffset() {
        return EntityMinecartChest.lIlIIIllIIIllI[3];
    }
}
