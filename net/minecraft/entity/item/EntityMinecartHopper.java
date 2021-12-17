// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.ContainerHopper;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import java.util.List;
import net.minecraft.inventory.IInventory;
import com.google.common.base.Predicate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.tileentity.IHopper;

public class EntityMinecartHopper extends EntityMinecartContainer implements IHopper
{
    private /* synthetic */ BlockPos field_174900_c;
    private static final /* synthetic */ String[] lIlIlIIIlIllll;
    private /* synthetic */ boolean isBlocked;
    private /* synthetic */ int transferTicker;
    private static final /* synthetic */ int[] lIlIlIIlIIlIII;
    
    private static boolean lllIllIIIIlIlII(final int lllllllllllllIIIlIlIIIllllIllIll) {
        return lllllllllllllIIIlIlIIIllllIllIll != 0;
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound lllllllllllllIIIlIlIIlIIIIlIlllI) {
        super.writeEntityToNBT(lllllllllllllIIIlIlIIlIIIIlIlllI);
        lllllllllllllIIIlIlIIlIIIIlIlllI.setInteger(EntityMinecartHopper.lIlIlIIIlIllll[EntityMinecartHopper.lIlIlIIlIIlIII[0]], this.transferTicker);
    }
    
    @Override
    public String getGuiID() {
        return EntityMinecartHopper.lIlIlIIIlIllll[EntityMinecartHopper.lIlIlIIlIIlIII[6]];
    }
    
    static {
        lllIllIIIIlIIlI();
        lllIlIlllIlllIl();
    }
    
    @Override
    public int getDefaultDisplayTileOffset() {
        return EntityMinecartHopper.lIlIlIIlIIlIII[0];
    }
    
    public void setTransferTicker(final int lllllllllllllIIIlIlIIlIIIIlIIIlI) {
        this.transferTicker = lllllllllllllIIIlIlIIlIIIIlIIIlI;
    }
    
    public boolean func_96112_aD() {
        if (lllIllIIIIlIlII(TileEntityHopper.captureDroppedItems(this) ? 1 : 0)) {
            return EntityMinecartHopper.lIlIlIIlIIlIII[0] != 0;
        }
        final List<EntityItem> lllllllllllllIIIlIlIIlIIIIlllIlI = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityItem>)EntityItem.class, this.getEntityBoundingBox().expand(0.25, 0.0, 0.25), (com.google.common.base.Predicate<? super EntityItem>)EntitySelectors.selectAnything);
        if (lllIllIIIIlIllI(lllllllllllllIIIlIlIIlIIIIlllIlI.size())) {
            TileEntityHopper.putDropInInventoryAllSlots(this, lllllllllllllIIIlIlIIlIIIIlllIlI.get(EntityMinecartHopper.lIlIlIIlIIlIII[3]));
            "".length();
        }
        return EntityMinecartHopper.lIlIlIIlIIlIII[3] != 0;
    }
    
    private static boolean lllIllIIIIlIlIl(final int lllllllllllllIIIlIlIIIllllIlIlII, final int lllllllllllllIIIlIlIIIllllIlIIll) {
        return lllllllllllllIIIlIlIIIllllIlIlII != lllllllllllllIIIlIlIIIllllIlIIll;
    }
    
    private static boolean lllIllIIIIlIIll(final int lllllllllllllIIIlIlIIIllllIllIIl) {
        return lllllllllllllIIIlIlIIIllllIllIIl == 0;
    }
    
    public EntityMinecartHopper(final World lllllllllllllIIIlIlIIlIIlIIIIIII) {
        super(lllllllllllllIIIlIlIIlIIlIIIIIII);
        this.isBlocked = (EntityMinecartHopper.lIlIlIIlIIlIII[0] != 0);
        this.transferTicker = EntityMinecartHopper.lIlIlIIlIIlIII[1];
        this.field_174900_c = BlockPos.ORIGIN;
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer lllllllllllllIIIlIlIIlIIIllIIlll) {
        if (lllIllIIIIlIIll(this.worldObj.isRemote ? 1 : 0)) {
            lllllllllllllIIIlIlIIlIIIllIIlll.displayGUIChest(this);
        }
        return EntityMinecartHopper.lIlIlIIlIIlIII[0] != 0;
    }
    
    @Override
    public EnumMinecartType getMinecartType() {
        return EnumMinecartType.HOPPER;
    }
    
    private static boolean lllIllIIIIlIllI(final int lllllllllllllIIIlIlIIIllllIlIlll) {
        return lllllllllllllIIIlIlIIIllllIlIlll > 0;
    }
    
    private static boolean lllIllIIIIlIlll(final int lllllllllllllIIIlIlIIIllllIllllI, final int lllllllllllllIIIlIlIIIllllIlllIl) {
        return lllllllllllllIIIlIlIIIllllIllllI < lllllllllllllIIIlIlIIIllllIlllIl;
    }
    
    private static String lllIlIlllIllIll(String lllllllllllllIIIlIlIIlIIIIIIIIll, final String lllllllllllllIIIlIlIIlIIIIIIIIlI) {
        lllllllllllllIIIlIlIIlIIIIIIIIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIlIIlIIIIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIlIIIIIIIllI = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIlIIIIIIIlIl = lllllllllllllIIIlIlIIlIIIIIIIIlI.toCharArray();
        int lllllllllllllIIIlIlIIlIIIIIIIlII = EntityMinecartHopper.lIlIlIIlIIlIII[3];
        final int lllllllllllllIIIlIlIIIlllllllllI = (Object)((String)lllllllllllllIIIlIlIIlIIIIIIIIll).toCharArray();
        final int lllllllllllllIIIlIlIIIllllllllIl = lllllllllllllIIIlIlIIIlllllllllI.length;
        byte lllllllllllllIIIlIlIIIllllllllII = (byte)EntityMinecartHopper.lIlIlIIlIIlIII[3];
        while (lllIllIIIIlIlll(lllllllllllllIIIlIlIIIllllllllII, lllllllllllllIIIlIlIIIllllllllIl)) {
            final char lllllllllllllIIIlIlIIlIIIIIIlIIl = lllllllllllllIIIlIlIIIlllllllllI[lllllllllllllIIIlIlIIIllllllllII];
            lllllllllllllIIIlIlIIlIIIIIIIllI.append((char)(lllllllllllllIIIlIlIIlIIIIIIlIIl ^ lllllllllllllIIIlIlIIlIIIIIIIlIl[lllllllllllllIIIlIlIIlIIIIIIIlII % lllllllllllllIIIlIlIIlIIIIIIIlIl.length]));
            "".length();
            ++lllllllllllllIIIlIlIIlIIIIIIIlII;
            ++lllllllllllllIIIlIlIIIllllllllII;
            "".length();
            if ((0x5 ^ 0x1) != (0x80 ^ 0x84)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIlIIIIIIIllI);
    }
    
    @Override
    public IBlockState getDefaultDisplayTile() {
        return Blocks.hopper.getDefaultState();
    }
    
    @Override
    public void onActivatorRailPass(final int lllllllllllllIIIlIlIIlIIIllIIIII, final int lllllllllllllIIIlIlIIlIIIlIlllll, final int lllllllllllllIIIlIlIIlIIIlIllllI, final boolean lllllllllllllIIIlIlIIlIIIlIlllIl) {
        int n;
        if (lllIllIIIIlIlII(lllllllllllllIIIlIlIIlIIIlIlllIl ? 1 : 0)) {
            n = EntityMinecartHopper.lIlIlIIlIIlIII[3];
            "".length();
            if ("  ".length() <= ((0x76 ^ 0x16) & ~(0x37 ^ 0x57))) {
                return;
            }
        }
        else {
            n = EntityMinecartHopper.lIlIlIIlIIlIII[0];
        }
        final boolean lllllllllllllIIIlIlIIlIIIlIlllII = n != 0;
        if (lllIllIIIIlIlIl(lllllllllllllIIIlIlIIlIIIlIlllII ? 1 : 0, this.getBlocked() ? 1 : 0)) {
            this.setBlocked(lllllllllllllIIIlIlIIlIIIlIlllII);
        }
    }
    
    @Override
    public void killMinecart(final DamageSource lllllllllllllIIIlIlIIlIIIIllIIlI) {
        super.killMinecart(lllllllllllllIIIlIlIIlIIIIllIIlI);
        if (lllIllIIIIlIlII(this.worldObj.getGameRules().getBoolean(EntityMinecartHopper.lIlIlIIIlIllll[EntityMinecartHopper.lIlIlIIlIIlIII[3]]) ? 1 : 0)) {
            this.dropItemWithOffset(Item.getItemFromBlock(Blocks.hopper), EntityMinecartHopper.lIlIlIIlIIlIII[0], 0.0f);
            "".length();
        }
    }
    
    public boolean canTransfer() {
        if (lllIllIIIIlIllI(this.transferTicker)) {
            return EntityMinecartHopper.lIlIlIIlIIlIII[0] != 0;
        }
        return EntityMinecartHopper.lIlIlIIlIIlIII[3] != 0;
    }
    
    @Override
    public double getYPos() {
        return this.posY + 0.5;
    }
    
    private static String lllIlIlllIllIlI(final String lllllllllllllIIIlIlIIIlllllIIllI, final String lllllllllllllIIIlIlIIIlllllIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIIlllllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIIlllllIIIll.getBytes(StandardCharsets.UTF_8)), EntityMinecartHopper.lIlIlIIlIIlIII[7]), "DES");
            final Cipher lllllllllllllIIIlIlIIIlllllIlIII = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIIIlllllIlIII.init(EntityMinecartHopper.lIlIlIIlIIlIII[5], lllllllllllllIIIlIlIIIlllllIlIIl);
            return new String(lllllllllllllIIIlIlIIIlllllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIIlllllIIlll) {
            lllllllllllllIIIlIlIIIlllllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lllIlIlllIlllII(final String lllllllllllllIIIlIlIIIllllllIIll, final String lllllllllllllIIIlIlIIIllllllIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIIllllllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIIllllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIIIllllllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIIIllllllIlIl.init(EntityMinecartHopper.lIlIlIIlIIlIII[5], lllllllllllllIIIlIlIIIllllllIllI);
            return new String(lllllllllllllIIIlIlIIIllllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIllllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIIllllllIlII) {
            lllllllllllllIIIlIlIIIllllllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getSizeInventory() {
        return EntityMinecartHopper.lIlIlIIlIIlIII[2];
    }
    
    @Override
    public double getZPos() {
        return this.posZ;
    }
    
    @Override
    public Container createContainer(final InventoryPlayer lllllllllllllIIIlIlIIlIIIIIlIlll, final EntityPlayer lllllllllllllIIIlIlIIlIIIIIlIllI) {
        return new ContainerHopper(lllllllllllllIIIlIlIIlIIIIIlIlll, this, lllllllllllllIIIlIlIIlIIIIIlIllI);
    }
    
    public void setBlocked(final boolean lllllllllllllIIIlIlIIlIIIlIlIIII) {
        this.isBlocked = lllllllllllllIIIlIlIIlIIIlIlIIII;
    }
    
    @Override
    public double getXPos() {
        return this.posX;
    }
    
    private static void lllIlIlllIlllIl() {
        (lIlIlIIIlIllll = new String[EntityMinecartHopper.lIlIlIIlIIlIII[4]])[EntityMinecartHopper.lIlIlIIlIIlIII[3]] = lllIlIlllIllIlI("2NroGF7bsXDw2bIWAPUgJA==", "jbQqJ");
        EntityMinecartHopper.lIlIlIIIlIllll[EntityMinecartHopper.lIlIlIIlIIlIII[0]] = lllIlIlllIllIll("NR8TOCMHCAAVPw4BFjknDw==", "amrVP");
        EntityMinecartHopper.lIlIlIIIlIllll[EntityMinecartHopper.lIlIlIIlIIlIII[5]] = lllIlIlllIllIll("JTUxFgQXIiI7GB4rNBcAHw==", "qGPxw");
        EntityMinecartHopper.lIlIlIIIlIllll[EntityMinecartHopper.lIlIlIIlIIlIII[6]] = lllIlIlllIlllII("5jmbxQfh+CB5g33yomcHmeS3VA1ONrf0", "MiXPA");
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lllIllIIIIlIIll(this.worldObj.isRemote ? 1 : 0) && lllIllIIIIlIlII(this.isEntityAlive() ? 1 : 0) && lllIllIIIIlIlII(this.getBlocked() ? 1 : 0)) {
            final BlockPos lllllllllllllIIIlIlIIlIIIlIIIIII = new BlockPos(this);
            if (lllIllIIIIlIlII(lllllllllllllIIIlIlIIlIIIlIIIIII.equals(this.field_174900_c) ? 1 : 0)) {
                this.transferTicker -= EntityMinecartHopper.lIlIlIIlIIlIII[0];
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                this.setTransferTicker(EntityMinecartHopper.lIlIlIIlIIlIII[3]);
            }
            if (lllIllIIIIlIIll(this.canTransfer() ? 1 : 0)) {
                this.setTransferTicker(EntityMinecartHopper.lIlIlIIlIIlIII[3]);
                if (lllIllIIIIlIlII(this.func_96112_aD() ? 1 : 0)) {
                    this.setTransferTicker(EntityMinecartHopper.lIlIlIIlIIlIII[4]);
                    this.markDirty();
                }
            }
        }
    }
    
    @Override
    public World getWorld() {
        return this.worldObj;
    }
    
    public EntityMinecartHopper(final World lllllllllllllIIIlIlIIlIIIlllIlll, final double lllllllllllllIIIlIlIIlIIIlllIllI, final double lllllllllllllIIIlIlIIlIIIlllIlIl, final double lllllllllllllIIIlIlIIlIIIllIllll) {
        super(lllllllllllllIIIlIlIIlIIIlllIlll, lllllllllllllIIIlIlIIlIIIlllIllI, lllllllllllllIIIlIlIIlIIIlllIlIl, lllllllllllllIIIlIlIIlIIIllIllll);
        this.isBlocked = (EntityMinecartHopper.lIlIlIIlIIlIII[0] != 0);
        this.transferTicker = EntityMinecartHopper.lIlIlIIlIIlIII[1];
        this.field_174900_c = BlockPos.ORIGIN;
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound lllllllllllllIIIlIlIIlIIIIlIIllI) {
        super.readEntityFromNBT(lllllllllllllIIIlIlIIlIIIIlIIllI);
        this.transferTicker = lllllllllllllIIIlIlIIlIIIIlIIllI.getInteger(EntityMinecartHopper.lIlIlIIIlIllll[EntityMinecartHopper.lIlIlIIlIIlIII[5]]);
    }
    
    public boolean getBlocked() {
        return this.isBlocked;
    }
    
    private static void lllIllIIIIlIIlI() {
        (lIlIlIIlIIlIII = new int[8])[0] = " ".length();
        EntityMinecartHopper.lIlIlIIlIIlIII[1] = -" ".length();
        EntityMinecartHopper.lIlIlIIlIIlIII[2] = (0x20 ^ 0x54 ^ (0xCC ^ 0xBD));
        EntityMinecartHopper.lIlIlIIlIIlIII[3] = ((0x47 ^ 0x4A ^ (0xB2 ^ 0xAC)) & (0x9D ^ 0xA8 ^ (0xBF ^ 0x99) ^ -" ".length()));
        EntityMinecartHopper.lIlIlIIlIIlIII[4] = (0x68 ^ 0x6C);
        EntityMinecartHopper.lIlIlIIlIIlIII[5] = "  ".length();
        EntityMinecartHopper.lIlIlIIlIIlIII[6] = "   ".length();
        EntityMinecartHopper.lIlIlIIlIIlIII[7] = (0x44 ^ 0x4C);
    }
}
