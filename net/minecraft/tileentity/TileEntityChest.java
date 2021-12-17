// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.block.BlockChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ITickable;
import net.minecraft.inventory.IInventory;

public class TileEntityChest extends TileEntityLockable implements IInventory, ITickable
{
    public /* synthetic */ float prevLidAngle;
    public /* synthetic */ TileEntityChest adjacentChestXPos;
    public /* synthetic */ float lidAngle;
    private /* synthetic */ int cachedChestType;
    public /* synthetic */ boolean adjacentChestChecked;
    private /* synthetic */ int ticksSinceSync;
    public /* synthetic */ int numPlayersUsing;
    private static final /* synthetic */ String[] lllIllIIIlIllI;
    public /* synthetic */ TileEntityChest adjacentChestZNeg;
    private static final /* synthetic */ int[] lllIllIIIllIII;
    private /* synthetic */ String customName;
    public /* synthetic */ TileEntityChest adjacentChestZPos;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    private /* synthetic */ ItemStack[] chestContents;
    public /* synthetic */ TileEntityChest adjacentChestXNeg;
    
    @Override
    public int getFieldCount() {
        return TileEntityChest.lllIllIIIllIII[2];
    }
    
    public TileEntityChest() {
        this.chestContents = new ItemStack[TileEntityChest.lllIllIIIllIII[0]];
        this.cachedChestType = TileEntityChest.lllIllIIIllIII[1];
    }
    
    protected TileEntityChest getAdjacentChest(final EnumFacing llllllllllllIlIllIIlllIlIIIIIlll) {
        final BlockPos llllllllllllIlIllIIlllIlIIIIlIll = this.pos.offset(llllllllllllIlIllIIlllIlIIIIIlll);
        if (lIlIIlIIIIlIIIlI(this.isChestAt(llllllllllllIlIllIIlllIlIIIIlIll) ? 1 : 0)) {
            final TileEntity llllllllllllIlIllIIlllIlIIIIlIlI = this.worldObj.getTileEntity(llllllllllllIlIllIIlllIlIIIIlIll);
            if (lIlIIlIIIIlIIIlI((llllllllllllIlIllIIlllIlIIIIlIlI instanceof TileEntityChest) ? 1 : 0)) {
                final TileEntityChest llllllllllllIlIllIIlllIlIIIIlIIl = (TileEntityChest)llllllllllllIlIllIIlllIlIIIIlIlI;
                llllllllllllIlIllIIlllIlIIIIlIIl.func_174910_a(this, llllllllllllIlIllIIlllIlIIIIIlll.getOpposite());
                return llllllllllllIlIllIIlllIlIIIIlIIl;
            }
        }
        return null;
    }
    
    public void checkForAdjacentChests() {
        if (lIlIIlIIIIIlllll(this.adjacentChestChecked ? 1 : 0)) {
            this.adjacentChestChecked = (TileEntityChest.lllIllIIIllIII[3] != 0);
            this.adjacentChestXNeg = this.getAdjacentChest(EnumFacing.WEST);
            this.adjacentChestXPos = this.getAdjacentChest(EnumFacing.EAST);
            this.adjacentChestZNeg = this.getAdjacentChest(EnumFacing.NORTH);
            this.adjacentChestZPos = this.getAdjacentChest(EnumFacing.SOUTH);
        }
    }
    
    @Override
    public String getName() {
        String customName;
        if (lIlIIlIIIIlIIIlI(this.hasCustomName() ? 1 : 0)) {
            customName = this.customName;
            "".length();
            if (((0x98 ^ 0xBD ^ (0x3B ^ 0x8)) & (0xFA ^ 0x8A ^ (0x1 ^ 0x67) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            customName = TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[2]];
        }
        return customName;
    }
    
    @Override
    public String getGuiID() {
        return TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[4]];
    }
    
    @Override
    public void setInventorySlotContents(final int llllllllllllIlIllIIlllIllIlIlIIl, final ItemStack llllllllllllIlIllIIlllIllIlIIIlI) {
        this.chestContents[llllllllllllIlIllIIlllIllIlIlIIl] = llllllllllllIlIllIIlllIllIlIIIlI;
        if (lIlIIlIIIIIlllIl(llllllllllllIlIllIIlllIllIlIIIlI) && lIlIIlIIIIlIIIIl(llllllllllllIlIllIIlllIllIlIIIlI.stackSize, this.getInventoryStackLimit())) {
            llllllllllllIlIllIIlllIllIlIIIlI.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }
    
    @Override
    public void closeInventory(final EntityPlayer llllllllllllIlIllIIlllIIlIlIllll) {
        if (lIlIIlIIIIIlllll(llllllllllllIlIllIIlllIIlIlIllll.isSpectator() ? 1 : 0) && lIlIIlIIIIlIIIlI((this.getBlockType() instanceof BlockChest) ? 1 : 0)) {
            this.numPlayersUsing -= TileEntityChest.lllIllIIIllIII[3];
            this.worldObj.addBlockEvent(this.pos, this.getBlockType(), TileEntityChest.lllIllIIIllIII[3], this.numPlayersUsing);
            this.worldObj.notifyNeighborsOfStateChange(this.pos, this.getBlockType());
            this.worldObj.notifyNeighborsOfStateChange(this.pos.down(), this.getBlockType());
        }
    }
    
    @Override
    public void clear() {
        int llllllllllllIlIllIIlllIIlIIlIIlI = TileEntityChest.lllIllIIIllIII[2];
        "".length();
        if ((12 + 121 - 132 + 137 ^ 80 + 81 - 144 + 126) <= 0) {
            return;
        }
        while (!lIlIIlIIIIlIlIII(llllllllllllIlIllIIlllIIlIIlIIlI, this.chestContents.length)) {
            this.chestContents[llllllllllllIlIllIIlllIIlIIlIIlI] = null;
            ++llllllllllllIlIllIIlllIIlIIlIIlI;
        }
    }
    
    @Override
    public boolean receiveClientEvent(final int llllllllllllIlIllIIlllIIlIllllll, final int llllllllllllIlIllIIlllIIlIlllIll) {
        if (lIlIIlIIIIlIllll(llllllllllllIlIllIIlllIIlIllllll, TileEntityChest.lllIllIIIllIII[3])) {
            this.numPlayersUsing = llllllllllllIlIllIIlllIIlIlllIll;
            return TileEntityChest.lllIllIIIllIII[3] != 0;
        }
        return super.receiveClientEvent(llllllllllllIlIllIIlllIIlIllllll, llllllllllllIlIllIIlllIIlIlllIll);
    }
    
    private static boolean lIlIIlIIIIlIIlll(final int llllllllllllIlIllIIlllIIIlIlIIIl, final int llllllllllllIlIllIIlllIIIlIlIIII) {
        return llllllllllllIlIllIIlllIIIlIlIIIl < llllllllllllIlIllIIlllIIIlIlIIII;
    }
    
    private static int lIlIIlIIIIllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void invalidate() {
        super.invalidate();
        this.updateContainingBlockInfo();
        this.checkForAdjacentChests();
    }
    
    @Override
    public Container createContainer(final InventoryPlayer llllllllllllIlIllIIlllIIlIlIIIII, final EntityPlayer llllllllllllIlIllIIlllIIlIIlllll) {
        return new ContainerChest(llllllllllllIlIllIIlllIIlIlIIIII, this, llllllllllllIlIllIIlllIIlIIlllll);
    }
    
    @Override
    public void openInventory(final EntityPlayer llllllllllllIlIllIIlllIIlIllIlIl) {
        if (lIlIIlIIIIIlllll(llllllllllllIlIllIIlllIIlIllIlIl.isSpectator() ? 1 : 0)) {
            if (lIlIIlIIIIllIIlI(this.numPlayersUsing)) {
                this.numPlayersUsing = TileEntityChest.lllIllIIIllIII[2];
            }
            this.numPlayersUsing += TileEntityChest.lllIllIIIllIII[3];
            this.worldObj.addBlockEvent(this.pos, this.getBlockType(), TileEntityChest.lllIllIIIllIII[3], this.numPlayersUsing);
            this.worldObj.notifyNeighborsOfStateChange(this.pos, this.getBlockType());
            this.worldObj.notifyNeighborsOfStateChange(this.pos.down(), this.getBlockType());
        }
    }
    
    private static boolean lIlIIlIIIIlIlllI(final Object llllllllllllIlIllIIlllIIIlIIIIII) {
        return llllllllllllIlIllIIlllIIIlIIIIII == null;
    }
    
    private static String lIlIIlIIIIIlIlII(String llllllllllllIlIllIIlllIIIllIIlII, final String llllllllllllIlIllIIlllIIIllIIIll) {
        llllllllllllIlIllIIlllIIIllIIlII = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlllIIIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlllIIIllIIlll = new StringBuilder();
        final char[] llllllllllllIlIllIIlllIIIllIIllI = llllllllllllIlIllIIlllIIIllIIIll.toCharArray();
        int llllllllllllIlIllIIlllIIIllIIlIl = TileEntityChest.lllIllIIIllIII[2];
        final int llllllllllllIlIllIIlllIIIlIlllll = (Object)llllllllllllIlIllIIlllIIIllIIlII.toCharArray();
        final boolean llllllllllllIlIllIIlllIIIlIllllI = llllllllllllIlIllIIlllIIIlIlllll.length != 0;
        String llllllllllllIlIllIIlllIIIlIlllIl = (String)TileEntityChest.lllIllIIIllIII[2];
        while (lIlIIlIIIIlIIlll((int)llllllllllllIlIllIIlllIIIlIlllIl, llllllllllllIlIllIIlllIIIlIllllI ? 1 : 0)) {
            final char llllllllllllIlIllIIlllIIIllIlIlI = llllllllllllIlIllIIlllIIIlIlllll[llllllllllllIlIllIIlllIIIlIlllIl];
            llllllllllllIlIllIIlllIIIllIIlll.append((char)(llllllllllllIlIllIIlllIIIllIlIlI ^ llllllllllllIlIllIIlllIIIllIIllI[llllllllllllIlIllIIlllIIIllIIlIl % llllllllllllIlIllIIlllIIIllIIllI.length]));
            "".length();
            ++llllllllllllIlIllIIlllIIIllIIlIl;
            ++llllllllllllIlIllIIlllIIIlIlllIl;
            "".length();
            if ((0x83 ^ 0x87) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlllIIIllIIlll);
    }
    
    private static int lIlIIlIIIIlIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lIlIIlIIIIIlIIll(final String llllllllllllIlIllIIlllIIlIIIIllI, final String llllllllllllIlIllIIlllIIlIIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlllIIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlllIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlllIIlIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlllIIlIIIlIII.init(TileEntityChest.lllIllIIIllIII[5], llllllllllllIlIllIIlllIIlIIIlIIl);
            return new String(llllllllllllIlIllIIlllIIlIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlllIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlllIIlIIIIlll) {
            llllllllllllIlIllIIlllIIlIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIIIIlIlIll(final Object llllllllllllIlIllIIlllIIIlIIIlIl, final Object llllllllllllIlIllIIlllIIIlIIIlII) {
        return llllllllllllIlIllIIlllIIIlIIIlIl != llllllllllllIlIllIIlllIIIlIIIlII;
    }
    
    private static void lIlIIlIIIIIlIllI() {
        (lllIllIIIlIllI = new String[TileEntityChest.lllIllIIIllIII[16]])[TileEntityChest.lllIllIIIllIII[2]] = lIlIIlIIIIIlIIlI("ovSrRbsQndHN8B6/+153dA==", "tfBOR");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[3]] = lIlIIlIIIIIlIIll("JdyHWTGHpyE=", "hUoEU");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[5]] = lIlIIlIIIIIlIlII("NToEATobARYYMA==", "vOwuU");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[7]] = lIlIIlIIIIIlIlII("ExccNSo9LA4sIA==", "PboAE");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[8]] = lIlIIlIIIIIlIIll("/QsOHUqmhO0=", "GzEoW");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[10]] = lIlIIlIIIIIlIlII("EhQhGw==", "AxNoO");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[11]] = lIlIIlIIIIIlIlII("Bz00Nxg=", "NIQZk");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[12]] = lIlIIlIIIIIlIIll("YXVYaM4Cz4YzxCPmhKjOPA==", "cZzck");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[6]] = lIlIIlIIIIIlIIlI("Po6fjFB/zW7KFj+mD9okK9WyJplmExP+", "xBuyP");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[15]] = lIlIIlIIIIIlIIlI("yc9+2QAoLo7fptJOpuyXfVwdAB2ZCQRB", "NqcxB");
        TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[4]] = lIlIIlIIIIIlIIlI("Epo1PCBapDFObzHgwkmY3w==", "nfWaA");
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIlIllIIlllIlIlIlllIl) {
        super.writeToNBT(llllllllllllIlIllIIlllIlIlIlllIl);
        final NBTTagList llllllllllllIlIllIIlllIlIllIIIIl = new NBTTagList();
        int llllllllllllIlIllIIlllIlIllIIIII = TileEntityChest.lllIllIIIllIII[2];
        "".length();
        if ((0x2F ^ 0x2B) <= "   ".length()) {
            return;
        }
        while (!lIlIIlIIIIlIlIII(llllllllllllIlIllIIlllIlIllIIIII, this.chestContents.length)) {
            if (lIlIIlIIIIIlllIl(this.chestContents[llllllllllllIlIllIIlllIlIllIIIII])) {
                final NBTTagCompound llllllllllllIlIllIIlllIlIlIlllll = new NBTTagCompound();
                llllllllllllIlIllIIlllIlIlIlllll.setByte(TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[10]], (byte)llllllllllllIlIllIIlllIlIllIIIII);
                this.chestContents[llllllllllllIlIllIIlllIlIllIIIII].writeToNBT(llllllllllllIlIllIIlllIlIlIlllll);
                "".length();
                llllllllllllIlIllIIlllIlIllIIIIl.appendTag(llllllllllllIlIllIIlllIlIlIlllll);
            }
            ++llllllllllllIlIllIIlllIlIllIIIII;
        }
        llllllllllllIlIllIIlllIlIlIlllIl.setTag(TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[11]], llllllllllllIlIllIIlllIlIllIIIIl);
        if (lIlIIlIIIIlIIIlI(this.hasCustomName() ? 1 : 0)) {
            llllllllllllIlIllIIlllIlIlIlllIl.setString(TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[12]], this.customName);
        }
    }
    
    @Override
    public int getSizeInventory() {
        return TileEntityChest.lllIllIIIllIII[0];
    }
    
    private static boolean lIlIIlIIIIlIllII(final int llllllllllllIlIllIIlllIIIIllIllI) {
        return llllllllllllIlIllIIlllIIIIllIllI <= 0;
    }
    
    @Override
    public int getField(final int llllllllllllIlIllIIlllIIlIIllIlI) {
        return TileEntityChest.lllIllIIIllIII[2];
    }
    
    private static boolean lIlIIlIIIIIlllll(final int llllllllllllIlIllIIlllIIIIllllII) {
        return llllllllllllIlIllIIlllIIIIllllII == 0;
    }
    
    @Override
    public void update() {
        this.checkForAdjacentChests();
        final int llllllllllllIlIllIIlllIIllIllIIl = this.pos.getX();
        final int llllllllllllIlIllIIlllIIllIllIII = this.pos.getY();
        final int llllllllllllIlIllIIlllIIllIlIlll = this.pos.getZ();
        this.ticksSinceSync += TileEntityChest.lllIllIIIllIII[3];
        if (lIlIIlIIIIIlllll(this.worldObj.isRemote ? 1 : 0) && lIlIIlIIIIlIIIlI(this.numPlayersUsing) && lIlIIlIIIIIlllll((this.ticksSinceSync + llllllllllllIlIllIIlllIIllIllIIl + llllllllllllIlIllIIlllIIllIllIII + llllllllllllIlIllIIlllIIllIlIlll) % TileEntityChest.lllIllIIIllIII[14])) {
            this.numPlayersUsing = TileEntityChest.lllIllIIIllIII[2];
            final float llllllllllllIlIllIIlllIIllIlIllI = 5.0f;
            final Exception llllllllllllIlIllIIlllIIllIIIllI = (Exception)this.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)EntityPlayer.class, new AxisAlignedBB(llllllllllllIlIllIIlllIIllIllIIl - llllllllllllIlIllIIlllIIllIlIllI, llllllllllllIlIllIIlllIIllIllIII - llllllllllllIlIllIIlllIIllIlIllI, llllllllllllIlIllIIlllIIllIlIlll - llllllllllllIlIllIIlllIIllIlIllI, llllllllllllIlIllIIlllIIllIllIIl + TileEntityChest.lllIllIIIllIII[3] + llllllllllllIlIllIIlllIIllIlIllI, llllllllllllIlIllIIlllIIllIllIII + TileEntityChest.lllIllIIIllIII[3] + llllllllllllIlIllIIlllIIllIlIllI, llllllllllllIlIllIIlllIIllIlIlll + TileEntityChest.lllIllIIIllIII[3] + llllllllllllIlIllIIlllIIllIlIllI)).iterator();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!lIlIIlIIIIIlllll(((Iterator)llllllllllllIlIllIIlllIIllIIIllI).hasNext() ? 1 : 0)) {
                final EntityPlayer llllllllllllIlIllIIlllIIllIlIlIl = ((Iterator<EntityPlayer>)llllllllllllIlIllIIlllIIllIIIllI).next();
                if (lIlIIlIIIIlIIIlI((llllllllllllIlIllIIlllIIllIlIlIl.openContainer instanceof ContainerChest) ? 1 : 0)) {
                    final IInventory llllllllllllIlIllIIlllIIllIlIlII = ((ContainerChest)llllllllllllIlIllIIlllIIllIlIlIl.openContainer).getLowerChestInventory();
                    if (lIlIIlIIIIlIlIll(llllllllllllIlIllIIlllIIllIlIlII, this) && (!lIlIIlIIIIlIIIlI((llllllllllllIlIllIIlllIIllIlIlII instanceof InventoryLargeChest) ? 1 : 0) || !lIlIIlIIIIlIIIlI(((InventoryLargeChest)llllllllllllIlIllIIlllIIllIlIlII).isPartOfLargeChest(this) ? 1 : 0))) {
                        continue;
                    }
                    this.numPlayersUsing += TileEntityChest.lllIllIIIllIII[3];
                }
            }
        }
        this.prevLidAngle = this.lidAngle;
        final float llllllllllllIlIllIIlllIIllIlIIll = 0.1f;
        if (lIlIIlIIIIlIIlII(this.numPlayersUsing) && lIlIIlIIIIIlllll(lIlIIlIIIIllIIII(this.lidAngle, 0.0f)) && lIlIIlIIIIlIlllI(this.adjacentChestZNeg) && lIlIIlIIIIlIlllI(this.adjacentChestXNeg)) {
            double llllllllllllIlIllIIlllIIllIlIIlI = llllllllllllIlIllIIlllIIllIllIIl + 0.5;
            double llllllllllllIlIllIIlllIIllIlIIIl = llllllllllllIlIllIIlllIIllIlIlll + 0.5;
            if (lIlIIlIIIIIlllIl(this.adjacentChestZPos)) {
                llllllllllllIlIllIIlllIIllIlIIIl += 0.5;
            }
            if (lIlIIlIIIIIlllIl(this.adjacentChestXPos)) {
                llllllllllllIlIllIIlllIIllIlIIlI += 0.5;
            }
            this.worldObj.playSoundEffect(llllllllllllIlIllIIlllIIllIlIIlI, llllllllllllIlIllIIlllIIllIllIII + 0.5, llllllllllllIlIllIIlllIIllIlIIIl, TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[6]], 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
        }
        if ((lIlIIlIIIIIlllll(this.numPlayersUsing) && !lIlIIlIIIIlIllII(lIlIIlIIIIllIIII(this.lidAngle, 0.0f))) || (lIlIIlIIIIlIIlII(this.numPlayersUsing) && lIlIIlIIIIllIIlI(lIlIIlIIIIllIIIl(this.lidAngle, 1.0f)))) {
            final float llllllllllllIlIllIIlllIIllIlIIII = this.lidAngle;
            if (lIlIIlIIIIlIIlII(this.numPlayersUsing)) {
                this.lidAngle += llllllllllllIlIllIIlllIIllIlIIll;
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
            else {
                this.lidAngle -= llllllllllllIlIllIIlllIIllIlIIll;
            }
            if (lIlIIlIIIIlIIlII(lIlIIlIIIIllIIII(this.lidAngle, 1.0f))) {
                this.lidAngle = 1.0f;
            }
            final float llllllllllllIlIllIIlllIIllIIllll = 0.5f;
            if (lIlIIlIIIIllIIlI(lIlIIlIIIIllIIIl(this.lidAngle, llllllllllllIlIllIIlllIIllIIllll)) && lIlIIlIIIIlIIllI(lIlIIlIIIIllIIII(llllllllllllIlIllIIlllIIllIlIIII, llllllllllllIlIllIIlllIIllIIllll)) && lIlIIlIIIIlIlllI(this.adjacentChestZNeg) && lIlIIlIIIIlIlllI(this.adjacentChestXNeg)) {
                double llllllllllllIlIllIIlllIIllIIlllI = llllllllllllIlIllIIlllIIllIllIIl + 0.5;
                double llllllllllllIlIllIIlllIIllIIllIl = llllllllllllIlIllIIlllIIllIlIlll + 0.5;
                if (lIlIIlIIIIIlllIl(this.adjacentChestZPos)) {
                    llllllllllllIlIllIIlllIIllIIllIl += 0.5;
                }
                if (lIlIIlIIIIIlllIl(this.adjacentChestXPos)) {
                    llllllllllllIlIllIIlllIIllIIlllI += 0.5;
                }
                this.worldObj.playSoundEffect(llllllllllllIlIllIIlllIIllIIlllI, llllllllllllIlIllIIlllIIllIllIII + 0.5, llllllllllllIlIllIIlllIIllIIllIl, TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[15]], 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
            }
            if (lIlIIlIIIIllIIlI(lIlIIlIIIIllIIIl(this.lidAngle, 0.0f))) {
                this.lidAngle = 0.0f;
            }
        }
    }
    
    private boolean isChestAt(final BlockPos llllllllllllIlIllIIlllIIlllllIlI) {
        if (lIlIIlIIIIlIlllI(this.worldObj)) {
            return TileEntityChest.lllIllIIIllIII[2] != 0;
        }
        final Block llllllllllllIlIllIIlllIIlllllIII = this.worldObj.getBlockState(llllllllllllIlIllIIlllIIlllllIlI).getBlock();
        if (lIlIIlIIIIlIIIlI((llllllllllllIlIllIIlllIIlllllIII instanceof BlockChest) ? 1 : 0) && lIlIIlIIIIlIllll(((BlockChest)llllllllllllIlIllIIlllIIlllllIII).chestType, this.getChestType())) {
            return TileEntityChest.lllIllIIIllIII[3] != 0;
        }
        return TileEntityChest.lllIllIIIllIII[2] != 0;
    }
    
    private static boolean lIlIIlIIIIllIIlI(final int llllllllllllIlIllIIlllIIIIlllIII) {
        return llllllllllllIlIllIIlllIIIIlllIII < 0;
    }
    
    private static String lIlIIlIIIIIlIIlI(final String llllllllllllIlIllIIlllIIIllllIIl, final String llllllllllllIlIllIIlllIIIllllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlllIIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlllIIIllllIII.getBytes(StandardCharsets.UTF_8)), TileEntityChest.lllIllIIIllIII[6]), "DES");
            final Cipher llllllllllllIlIllIIlllIIIllllIll = Cipher.getInstance("DES");
            llllllllllllIlIllIIlllIIIllllIll.init(TileEntityChest.lllIllIIIllIII[5], llllllllllllIlIllIIlllIIIlllllII);
            return new String(llllllllllllIlIllIIlllIIIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlllIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlllIIIllllIlI) {
            llllllllllllIlIllIIlllIIIllllIlI.printStackTrace();
            return null;
        }
    }
    
    public void setCustomName(final String llllllllllllIlIllIIlllIllIIIlIll) {
        this.customName = llllllllllllIlIllIIlllIllIIIlIll;
    }
    
    public int getChestType() {
        if (lIlIIlIIIIlIllll(this.cachedChestType, TileEntityChest.lllIllIIIllIII[1])) {
            if (!lIlIIlIIIIIlllIl(this.worldObj) || lIlIIlIIIIIlllll((this.getBlockType() instanceof BlockChest) ? 1 : 0)) {
                return TileEntityChest.lllIllIIIllIII[2];
            }
            this.cachedChestType = ((BlockChest)this.getBlockType()).chestType;
        }
        return this.cachedChestType;
    }
    
    private static boolean lIlIIlIIIIlIIllI(final int llllllllllllIlIllIIlllIIIIlllIlI) {
        return llllllllllllIlIllIIlllIIIIlllIlI >= 0;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return TileEntityChest.lllIllIIIllIII[13];
    }
    
    private static boolean lIlIIlIIIIIllllI(final int llllllllllllIlIllIIlllIIIlIIllIl, final int llllllllllllIlIllIIlllIIIlIIllII) {
        return llllllllllllIlIllIIlllIIIlIIllIl <= llllllllllllIlIllIIlllIIIlIIllII;
    }
    
    private static boolean lIlIIlIIIIIlllIl(final Object llllllllllllIlIllIIlllIIIlIIIIlI) {
        return llllllllllllIlIllIIlllIIIlIIIIlI != null;
    }
    
    @Override
    public ItemStack decrStackSize(final int llllllllllllIlIllIIlllIlllIllIIl, final int llllllllllllIlIllIIlllIlllIlIlll) {
        if (!lIlIIlIIIIIlllIl(this.chestContents[llllllllllllIlIllIIlllIlllIllIIl])) {
            return null;
        }
        if (lIlIIlIIIIIllllI(this.chestContents[llllllllllllIlIllIIlllIlllIllIIl].stackSize, llllllllllllIlIllIIlllIlllIlIlll)) {
            final ItemStack llllllllllllIlIllIIlllIlllIlIlIl = this.chestContents[llllllllllllIlIllIIlllIlllIllIIl];
            this.chestContents[llllllllllllIlIllIIlllIlllIllIIl] = null;
            this.markDirty();
            return llllllllllllIlIllIIlllIlllIlIlIl;
        }
        final ItemStack llllllllllllIlIllIIlllIlllIlIIll = this.chestContents[llllllllllllIlIllIIlllIlllIllIIl].splitStack(llllllllllllIlIllIIlllIlllIlIlll);
        if (lIlIIlIIIIIlllll(this.chestContents[llllllllllllIlIllIIlllIlllIllIIl].stackSize)) {
            this.chestContents[llllllllllllIlIllIIlllIlllIllIIl] = null;
        }
        this.markDirty();
        return llllllllllllIlIllIIlllIlllIlIIll;
    }
    
    private static boolean lIlIIlIIIIlIIlII(final int llllllllllllIlIllIIlllIIIIllIlII) {
        return llllllllllllIlIllIIlllIIIIllIlII > 0;
    }
    
    private static int lIlIIlIIIIllIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public boolean isItemValidForSlot(final int llllllllllllIlIllIIlllIIlIlIllIl, final ItemStack llllllllllllIlIllIIlllIIlIlIllII) {
        return TileEntityChest.lllIllIIIllIII[3] != 0;
    }
    
    static {
        lIlIIlIIIIIllIll();
        lIlIIlIIIIIlIllI();
    }
    
    private static boolean lIlIIlIIIIlIIIlI(final int llllllllllllIlIllIIlllIIIIlllllI) {
        return llllllllllllIlIllIIlllIIIIlllllI != 0;
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int llllllllllllIlIllIIlllIllIllIlll) {
        if (lIlIIlIIIIIlllIl(this.chestContents[llllllllllllIlIllIIlllIllIllIlll])) {
            final ItemStack llllllllllllIlIllIIlllIllIlllIll = this.chestContents[llllllllllllIlIllIIlllIllIllIlll];
            this.chestContents[llllllllllllIlIllIIlllIllIllIlll] = null;
            return llllllllllllIlIllIIlllIllIlllIll;
        }
        return null;
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer llllllllllllIlIllIIlllIlIlIIlIIl) {
        int n;
        if (lIlIIlIIIIlIlIll(this.worldObj.getTileEntity(this.pos), this)) {
            n = TileEntityChest.lllIllIIIllIII[2];
            "".length();
            if ((0xAE ^ 0xAA) != (0xC3 ^ 0xC7)) {
                return ((0x98 ^ 0xAA) & ~(0x43 ^ 0x71)) != 0x0;
            }
        }
        else if (lIlIIlIIIIlIllII(lIlIIlIIIIlIlIlI(llllllllllllIlIllIIlllIlIlIIlIIl.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = TileEntityChest.lllIllIIIllIII[3];
            "".length();
            if ("   ".length() < 0) {
                return ((0x47 ^ 0x54) & ~(0x2B ^ 0x38)) != 0x0;
            }
        }
        else {
            n = TileEntityChest.lllIllIIIllIII[2];
        }
        return n != 0;
    }
    
    private static boolean lIlIIlIIIIlIlIII(final int llllllllllllIlIllIIlllIIIlIlIlIl, final int llllllllllllIlIllIIlllIIIlIlIlII) {
        return llllllllllllIlIllIIlllIIIlIlIlIl >= llllllllllllIlIllIIlllIIIlIlIlII;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIlIllIIlllIlIlllIIII) {
        super.readFromNBT(llllllllllllIlIllIIlllIlIlllIIII);
        final NBTTagList llllllllllllIlIllIIlllIlIlllIllI = llllllllllllIlIllIIlllIlIlllIIII.getTagList(TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[3]], TileEntityChest.lllIllIIIllIII[4]);
        this.chestContents = new ItemStack[this.getSizeInventory()];
        if (lIlIIlIIIIlIIIlI(llllllllllllIlIllIIlllIlIlllIIII.hasKey(TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[5]], TileEntityChest.lllIllIIIllIII[6]) ? 1 : 0)) {
            this.customName = llllllllllllIlIllIIlllIlIlllIIII.getString(TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[7]]);
        }
        int llllllllllllIlIllIIlllIlIlllIlIl = TileEntityChest.lllIllIIIllIII[2];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lIlIIlIIIIlIlIII(llllllllllllIlIllIIlllIlIlllIlIl, llllllllllllIlIllIIlllIlIlllIllI.tagCount())) {
            final NBTTagCompound llllllllllllIlIllIIlllIlIlllIlII = llllllllllllIlIllIIlllIlIlllIllI.getCompoundTagAt(llllllllllllIlIllIIlllIlIlllIlIl);
            final int llllllllllllIlIllIIlllIlIlllIIll = llllllllllllIlIllIIlllIlIlllIlII.getByte(TileEntityChest.lllIllIIIlIllI[TileEntityChest.lllIllIIIllIII[8]]) & TileEntityChest.lllIllIIIllIII[9];
            if (lIlIIlIIIIlIIllI(llllllllllllIlIllIIlllIlIlllIIll) && lIlIIlIIIIlIIlll(llllllllllllIlIllIIlllIlIlllIIll, this.chestContents.length)) {
                this.chestContents[llllllllllllIlIllIIlllIlIlllIIll] = ItemStack.loadItemStackFromNBT(llllllllllllIlIllIIlllIlIlllIlII);
            }
            ++llllllllllllIlIllIIlllIlIlllIlIl;
        }
    }
    
    private static boolean lIlIIlIIIIlIIIIl(final int llllllllllllIlIllIIlllIIIlIIlIIl, final int llllllllllllIlIllIIlllIIIlIIlIII) {
        return llllllllllllIlIllIIlllIIIlIIlIIl > llllllllllllIlIllIIlllIIIlIIlIII;
    }
    
    @Override
    public void setField(final int llllllllllllIlIllIIlllIIlIIllIII, final int llllllllllllIlIllIIlllIIlIIlIlll) {
    }
    
    @Override
    public ItemStack getStackInSlot(final int llllllllllllIlIllIIlllIllllIlIII) {
        return this.chestContents[llllllllllllIlIllIIlllIllllIlIII];
    }
    
    @Override
    public void updateContainingBlockInfo() {
        super.updateContainingBlockInfo();
        this.adjacentChestChecked = (TileEntityChest.lllIllIIIllIII[2] != 0);
    }
    
    public TileEntityChest(final int llllllllllllIlIllIIlllIlllllIIlI) {
        this.chestContents = new ItemStack[TileEntityChest.lllIllIIIllIII[0]];
        this.cachedChestType = llllllllllllIlIllIIlllIlllllIIlI;
    }
    
    private void func_174910_a(final TileEntityChest llllllllllllIlIllIIlllIlIIlIllll, final EnumFacing llllllllllllIlIllIIlllIlIIlIIlll) {
        if (lIlIIlIIIIlIIIlI(llllllllllllIlIllIIlllIlIIlIllll.isInvalid() ? 1 : 0)) {
            this.adjacentChestChecked = (TileEntityChest.lllIllIIIllIII[2] != 0);
            "".length();
            if ((0x36 ^ 0xE ^ (0xFC ^ 0xC0)) != (0xD9 ^ 0x9F ^ (0x4D ^ 0xF))) {
                return;
            }
        }
        else if (lIlIIlIIIIlIIIlI(this.adjacentChestChecked ? 1 : 0)) {
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIllIIlllIlIIlIIlll.ordinal()]) {
                case 3: {
                    if (!lIlIIlIIIIlIlIll(this.adjacentChestZNeg, llllllllllllIlIllIIlllIlIIlIllll)) {
                        break;
                    }
                    this.adjacentChestChecked = (TileEntityChest.lllIllIIIllIII[2] != 0);
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    if (!lIlIIlIIIIlIlIll(this.adjacentChestZPos, llllllllllllIlIllIIlllIlIIlIllll)) {
                        break;
                    }
                    this.adjacentChestChecked = (TileEntityChest.lllIllIIIllIII[2] != 0);
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    break;
                }
                case 6: {
                    if (!lIlIIlIIIIlIlIll(this.adjacentChestXPos, llllllllllllIlIllIIlllIlIIlIllll)) {
                        break;
                    }
                    this.adjacentChestChecked = (TileEntityChest.lllIllIIIllIII[2] != 0);
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                    break;
                }
                case 5: {
                    if (lIlIIlIIIIlIlIll(this.adjacentChestXNeg, llllllllllllIlIllIIlllIlIIlIllll)) {
                        this.adjacentChestChecked = (TileEntityChest.lllIllIIIllIII[2] != 0);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private static void lIlIIlIIIIIllIll() {
        (lllIllIIIllIII = new int[17])[0] = (0x77 ^ 0x6C);
        TileEntityChest.lllIllIIIllIII[1] = -" ".length();
        TileEntityChest.lllIllIIIllIII[2] = ((0x7B ^ 0x7F) & ~(0xB8 ^ 0xBC));
        TileEntityChest.lllIllIIIllIII[3] = " ".length();
        TileEntityChest.lllIllIIIllIII[4] = (0x36 ^ 0x0 ^ (0xBD ^ 0x81));
        TileEntityChest.lllIllIIIllIII[5] = "  ".length();
        TileEntityChest.lllIllIIIllIII[6] = (0xA8 ^ 0x96 ^ (0xAF ^ 0x99));
        TileEntityChest.lllIllIIIllIII[7] = "   ".length();
        TileEntityChest.lllIllIIIllIII[8] = (134 + 114 - 119 + 15 ^ 141 + 103 - 167 + 71);
        TileEntityChest.lllIllIIIllIII[9] = (0xDD ^ 0x9B) + (109 + 85 - 154 + 88) - (100 + 30 - 118 + 120) + (77 + 71 - 71 + 112);
        TileEntityChest.lllIllIIIllIII[10] = (0xA9 ^ 0xAC);
        TileEntityChest.lllIllIIIllIII[11] = (0x10 ^ 0x16);
        TileEntityChest.lllIllIIIllIII[12] = (0x98 ^ 0x9F);
        TileEntityChest.lllIllIIIllIII[13] = (0x47 ^ 0x7);
        TileEntityChest.lllIllIIIllIII[14] = 7 + 40 + 102 + 51;
        TileEntityChest.lllIllIIIllIII[15] = (0xA9 ^ 0xA0);
        TileEntityChest.lllIllIIIllIII[16] = (0xBA ^ 0xB1);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = TileEntityChest.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIlIIIIIlllIl($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final float llllllllllllIlIllIIlllIIlIIIlllI = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlIllIIlllIIlIIIlllI[EnumFacing.DOWN.ordinal()] = TileEntityChest.lllIllIIIllIII[3];
            "".length();
            if ((0x8C ^ 0x88) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIIlIIIlllI[EnumFacing.EAST.ordinal()] = TileEntityChest.lllIllIIIllIII[11];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIIlIIIlllI[EnumFacing.NORTH.ordinal()] = TileEntityChest.lllIllIIIllIII[7];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIIlIIIlllI[EnumFacing.SOUTH.ordinal()] = TileEntityChest.lllIllIIIllIII[8];
            "".length();
            if ((0x2C ^ 0x6F ^ (0x70 ^ 0x37)) < (0x6E ^ 0x28 ^ (0x7A ^ 0x38))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIIlIIIlllI[EnumFacing.UP.ordinal()] = TileEntityChest.lllIllIIIllIII[5];
            "".length();
            if (((0xA3 ^ 0x91 ^ (0x17 ^ 0x6D)) & (59 + 74 - 61 + 55 ^ (0xB ^ 0x3C) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIIlIIIlllI[EnumFacing.WEST.ordinal()] = TileEntityChest.lllIllIIIllIII[10];
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return TileEntityChest.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIllIIlllIIlIIIlllI;
    }
    
    @Override
    public boolean hasCustomName() {
        if (lIlIIlIIIIIlllIl(this.customName) && lIlIIlIIIIlIIlII(this.customName.length())) {
            return TileEntityChest.lllIllIIIllIII[3] != 0;
        }
        return TileEntityChest.lllIllIIIllIII[2] != 0;
    }
    
    private static boolean lIlIIlIIIIlIllll(final int llllllllllllIlIllIIlllIIIlIllIIl, final int llllllllllllIlIllIIlllIIIlIllIII) {
        return llllllllllllIlIllIIlllIIIlIllIIl == llllllllllllIlIllIIlllIIIlIllIII;
    }
}
