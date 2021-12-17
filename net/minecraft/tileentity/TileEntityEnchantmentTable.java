// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import java.util.Arrays;
import net.minecraft.inventory.ContainerEnchantment;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Random;
import net.minecraft.world.IInteractionObject;
import net.minecraft.util.ITickable;

public class TileEntityEnchantmentTable extends TileEntity implements ITickable, IInteractionObject
{
    public /* synthetic */ float bookRotationPrev;
    private /* synthetic */ String customName;
    public /* synthetic */ int tickCount;
    private static final /* synthetic */ String[] lIIIIllIlIlIll;
    public /* synthetic */ float bookSpread;
    public /* synthetic */ float pageFlipPrev;
    public /* synthetic */ float field_145929_l;
    public /* synthetic */ float pageFlip;
    public /* synthetic */ float bookSpreadPrev;
    public /* synthetic */ float field_145932_k;
    public /* synthetic */ float bookRotation;
    public /* synthetic */ float field_145924_q;
    private static /* synthetic */ Random rand;
    private static final /* synthetic */ int[] lIIIIllIlIllIl;
    
    private static boolean lIlllIlllllIIlI(final int lllllllllllllIlIIlIIlIIlIIlllIll) {
        return lllllllllllllIlIIlIIlIIlIIlllIll > 0;
    }
    
    private static boolean lIlllIlllllIIII(final int lllllllllllllIlIIlIIlIIlIlIIIIIl) {
        return lllllllllllllIlIIlIIlIIlIlIIIIIl == 0;
    }
    
    private static boolean lIlllIllllIlllI(final Object lllllllllllllIlIIlIIlIIlIlIIIlIl) {
        return lllllllllllllIlIIlIIlIIlIlIIIlIl != null;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIlIIlIIlIIllIIlIIlI) {
        super.writeToNBT(lllllllllllllIlIIlIIlIIllIIlIIlI);
        if (lIlllIllllIlIll(this.hasCustomName() ? 1 : 0)) {
            lllllllllllllIlIIlIIlIIllIIlIIlI.setString(TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[0]], this.customName);
        }
    }
    
    static {
        lIlllIllllIlIlI();
        lIlllIllllIlIIl();
        TileEntityEnchantmentTable.rand = new Random();
    }
    
    private static String lIlllIllllIIIll(final String lllllllllllllIlIIlIIlIIlIlIlIlll, final String lllllllllllllIlIIlIIlIIlIlIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlIIlIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIlIIlIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIlIIlIlIllIll.init(TileEntityEnchantmentTable.lIIIIllIlIllIl[3], lllllllllllllIlIIlIIlIIlIlIlllII);
            return new String(lllllllllllllIlIIlIIlIIlIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlIIlIlIllIlI) {
            lllllllllllllIlIIlIIlIIlIlIllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIlIIlIIlIIllIIIllII) {
        super.readFromNBT(lllllllllllllIlIIlIIlIIllIIIllII);
        if (lIlllIllllIlIll(lllllllllllllIlIIlIIlIIllIIIllII.hasKey(TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[1]], TileEntityEnchantmentTable.lIIIIllIlIllIl[2]) ? 1 : 0)) {
            this.customName = lllllllllllllIlIIlIIlIIllIIIllII.getString(TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[3]]);
        }
    }
    
    private static void lIlllIllllIlIIl() {
        (lIIIIllIlIlIll = new String[TileEntityEnchantmentTable.lIIIIllIlIllIl[7]])[TileEntityEnchantmentTable.lIIIIllIlIllIl[0]] = lIlllIllllIIIll("0JFS+niqjSDpBEF1J6NmtQ==", "qVMBf");
        TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[1]] = lIlllIllllIIlII("mMrfD7tnRfaLP4+M8mdQZw==", "JvElZ");
        TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[3]] = lIlllIllllIIIll("NNTYaEX9OdE0ka7AJmFZwA==", "Imkwl");
        TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[6]] = lIlllIllllIIlII("FUTEMZb6yBxoNKyW8ivdZ4oxrMqLqj3D", "eWrnD");
        TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[5]] = lIlllIllllIIlII("9chEO22uGWZ/QIwPf2MCM/MOwoaiYbnHURTcwp/zPf0=", "qKLaj");
    }
    
    @Override
    public void update() {
        this.bookSpreadPrev = this.bookSpread;
        this.bookRotationPrev = this.bookRotation;
        final EntityPlayer lllllllllllllIlIIlIIlIIllIIIIlII = this.worldObj.getClosestPlayer(this.pos.getX() + 0.5f, this.pos.getY() + 0.5f, this.pos.getZ() + 0.5f, 3.0);
        if (lIlllIllllIlllI(lllllllllllllIlIIlIIlIIllIIIIlII)) {
            final double lllllllllllllIlIIlIIlIIllIIIIIll = lllllllllllllIlIIlIIlIIllIIIIlII.posX - (this.pos.getX() + 0.5f);
            final double lllllllllllllIlIIlIIlIIllIIIIIlI = lllllllllllllIlIIlIIlIIllIIIIlII.posZ - (this.pos.getZ() + 0.5f);
            this.field_145924_q = (float)MathHelper.func_181159_b(lllllllllllllIlIIlIIlIIllIIIIIlI, lllllllllllllIlIIlIIlIIllIIIIIll);
            this.bookSpread += 0.1f;
            if (!lIlllIllllIllll(lIlllIllllIllII(this.bookSpread, 0.5f)) || lIlllIlllllIIII(TileEntityEnchantmentTable.rand.nextInt(TileEntityEnchantmentTable.lIIIIllIlIllIl[4]))) {
                final float lllllllllllllIlIIlIIlIIllIIIIIIl = this.field_145932_k;
                do {
                    this.field_145932_k += TileEntityEnchantmentTable.rand.nextInt(TileEntityEnchantmentTable.lIIIIllIlIllIl[5]) - TileEntityEnchantmentTable.rand.nextInt(TileEntityEnchantmentTable.lIIIIllIlIllIl[5]);
                } while (!lIlllIllllIlIll(lIlllIllllIllIl(lllllllllllllIlIIlIIlIIllIIIIIIl, this.field_145932_k)));
                "".length();
                if (((0xBD ^ 0xA7) & ~(0x8A ^ 0x90)) != 0x0) {
                    return;
                }
            }
        }
        else {
            this.field_145924_q += 0.02f;
            this.bookSpread -= 0.1f;
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        while (!lIlllIlllllIIIl(lIlllIllllIllIl(this.bookRotation, 3.1415927f))) {
            this.bookRotation -= 6.2831855f;
        }
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlllIllllIllll(lIlllIllllIllII(this.bookRotation, -3.1415927f))) {
            this.bookRotation += 6.2831855f;
        }
        "".length();
        if ("   ".length() < " ".length()) {
            return;
        }
        while (!lIlllIlllllIIIl(lIlllIllllIllIl(this.field_145924_q, 3.1415927f))) {
            this.field_145924_q -= 6.2831855f;
        }
        "".length();
        if ((0x8F ^ 0x8B) < 0) {
            return;
        }
        while (!lIlllIllllIllll(lIlllIllllIllII(this.field_145924_q, -3.1415927f))) {
            this.field_145924_q += 6.2831855f;
        }
        float lllllllllllllIlIIlIIlIIllIIIIIII = this.field_145924_q - this.bookRotation;
        "".length();
        if ((0x55 ^ 0x51) <= " ".length()) {
            return;
        }
        while (!lIlllIlllllIIIl(lIlllIllllIllIl(lllllllllllllIlIIlIIlIIllIIIIIII, 3.1415927f))) {
            lllllllllllllIlIIlIIlIIllIIIIIII -= 6.2831855f;
        }
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlllIllllIllll(lIlllIllllIllII(lllllllllllllIlIIlIIlIIllIIIIIII, -3.1415927f))) {
            lllllllllllllIlIIlIIlIIllIIIIIII += 6.2831855f;
        }
        this.bookRotation += lllllllllllllIlIIlIIlIIllIIIIIII * 0.4f;
        this.bookSpread = MathHelper.clamp_float(this.bookSpread, 0.0f, 1.0f);
        this.tickCount += TileEntityEnchantmentTable.lIIIIllIlIllIl[1];
        this.pageFlipPrev = this.pageFlip;
        float lllllllllllllIlIIlIIlIIlIlllllll = (this.field_145932_k - this.pageFlip) * 0.4f;
        final float lllllllllllllIlIIlIIlIIlIllllllI = 0.2f;
        lllllllllllllIlIIlIIlIIlIlllllll = MathHelper.clamp_float(lllllllllllllIlIIlIIlIIlIlllllll, -lllllllllllllIlIIlIIlIIlIllllllI, lllllllllllllIlIIlIIlIIlIllllllI);
        this.field_145929_l += (lllllllllllllIlIIlIIlIIlIlllllll - this.field_145929_l) * 0.9f;
        this.pageFlip += this.field_145929_l;
    }
    
    public void setCustomName(final String lllllllllllllIlIIlIIlIIlIllIlllI) {
        this.customName = lllllllllllllIlIIlIIlIIlIllIlllI;
    }
    
    @Override
    public String getName() {
        String customName;
        if (lIlllIllllIlIll(this.hasCustomName() ? 1 : 0)) {
            customName = this.customName;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            customName = TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[6]];
        }
        return customName;
    }
    
    @Override
    public boolean hasCustomName() {
        if (lIlllIllllIlllI(this.customName) && lIlllIlllllIIlI(this.customName.length())) {
            return TileEntityEnchantmentTable.lIIIIllIlIllIl[1] != 0;
        }
        return TileEntityEnchantmentTable.lIIIIllIlIllIl[0] != 0;
    }
    
    @Override
    public Container createContainer(final InventoryPlayer lllllllllllllIlIIlIIlIIlIllIIlIl, final EntityPlayer lllllllllllllIlIIlIIlIIlIllIIlII) {
        return new ContainerEnchantment(lllllllllllllIlIIlIIlIIlIllIIlIl, this.worldObj, this.pos);
    }
    
    private static String lIlllIllllIIlII(final String lllllllllllllIlIIlIIlIIlIlIIllII, final String lllllllllllllIlIIlIIlIIlIlIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlIIlIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), TileEntityEnchantmentTable.lIIIIllIlIllIl[2]), "DES");
            final Cipher lllllllllllllIlIIlIIlIIlIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIlIIlIlIIlllI.init(TileEntityEnchantmentTable.lIIIIllIlIllIl[3], lllllllllllllIlIIlIIlIIlIlIIllll);
            return new String(lllllllllllllIlIIlIIlIIlIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIIlIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlIIlIlIIllIl) {
            lllllllllllllIlIIlIIlIIlIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIllllIlIll(final int lllllllllllllIlIIlIIlIIlIlIIIIll) {
        return lllllllllllllIlIIlIIlIIlIlIIIIll != 0;
    }
    
    private static boolean lIlllIlllllIIIl(final int lllllllllllllIlIIlIIlIIlIIllllIl) {
        return lllllllllllllIlIIlIIlIIlIIllllIl < 0;
    }
    
    private static void lIlllIllllIlIlI() {
        (lIIIIllIlIllIl = new int[8])[0] = ((0x23 ^ 0x70) & ~(0xCD ^ 0x9E));
        TileEntityEnchantmentTable.lIIIIllIlIllIl[1] = " ".length();
        TileEntityEnchantmentTable.lIIIIllIlIllIl[2] = (0x4C ^ 0x44);
        TileEntityEnchantmentTable.lIIIIllIlIllIl[3] = "  ".length();
        TileEntityEnchantmentTable.lIIIIllIlIllIl[4] = (0x11 ^ 0x39);
        TileEntityEnchantmentTable.lIIIIllIlIllIl[5] = (0xC1 ^ 0xC5);
        TileEntityEnchantmentTable.lIIIIllIlIllIl[6] = "   ".length();
        TileEntityEnchantmentTable.lIIIIllIlIllIl[7] = (0x7 ^ 0x2);
    }
    
    private static int lIlllIllllIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIlllIllllIllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (lIlllIllllIlIll(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if ((0x5B ^ 0x5F) == ((0xFB ^ 0x9A) & ~(0xA7 ^ 0xC6))) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[TileEntityEnchantmentTable.lIIIIllIlIllIl[0]]);
        }
        return chatComponentStyle;
    }
    
    @Override
    public String getGuiID() {
        return TileEntityEnchantmentTable.lIIIIllIlIlIll[TileEntityEnchantmentTable.lIIIIllIlIllIl[5]];
    }
    
    private static boolean lIlllIllllIllll(final int lllllllllllllIlIIlIIlIIlIIllllll) {
        return lllllllllllllIlIIlIIlIIlIIllllll >= 0;
    }
}
