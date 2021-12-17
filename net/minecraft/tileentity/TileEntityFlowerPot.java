// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.Item;

public class TileEntityFlowerPot extends TileEntity
{
    private /* synthetic */ int flowerPotData;
    private /* synthetic */ Item flowerPotItem;
    private static final /* synthetic */ String[] lIIIllIIIIIIIl;
    private static final /* synthetic */ int[] lIIIllIIIIIIll;
    
    static {
        llIIIIlIlIIIlIl();
        llIIIIlIlIIIIIl();
    }
    
    private static String llIIIIlIIllIlIl(final String lllllllllllllIlIIIIIlllllIlllIIl, final String lllllllllllllIlIIIIIlllllIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlllllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlllllIllIllI.getBytes(StandardCharsets.UTF_8)), TileEntityFlowerPot.lIIIllIIIIIIll[4]), "DES");
            final Cipher lllllllllllllIlIIIIIlllllIlllIll = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlllllIlllIll.init(TileEntityFlowerPot.lIIIllIIIIIIll[2], lllllllllllllIlIIIIIlllllIllllII);
            return new String(lllllllllllllIlIIIIIlllllIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlllllIlllIlI) {
            lllllllllllllIlIIIIIlllllIlllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIIlIlIIIlll(final int lllllllllllllIlIIIIIlllllIIIIlll) {
        return lllllllllllllIlIIIIIlllllIIIIlll != 0;
    }
    
    private static String llIIIIlIIllIllI(String lllllllllllllIlIIIIIlllllIlIIlII, final String lllllllllllllIlIIIIIlllllIlIIIll) {
        lllllllllllllIlIIIIIlllllIlIIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllllIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlllllIlIIlll = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlllllIlIIllI = lllllllllllllIlIIIIIlllllIlIIIll.toCharArray();
        int lllllllllllllIlIIIIIlllllIlIIlIl = TileEntityFlowerPot.lIIIllIIIIIIll[0];
        final byte lllllllllllllIlIIIIIlllllIIlllll = (Object)lllllllllllllIlIIIIIlllllIlIIlII.toCharArray();
        final long lllllllllllllIlIIIIIlllllIIllllI = lllllllllllllIlIIIIIlllllIIlllll.length;
        char lllllllllllllIlIIIIIlllllIIlllIl = (char)TileEntityFlowerPot.lIIIllIIIIIIll[0];
        while (llIIIIlIlIIlIII(lllllllllllllIlIIIIIlllllIIlllIl, (int)lllllllllllllIlIIIIIlllllIIllllI)) {
            final char lllllllllllllIlIIIIIlllllIlIlIlI = lllllllllllllIlIIIIIlllllIIlllll[lllllllllllllIlIIIIIlllllIIlllIl];
            lllllllllllllIlIIIIIlllllIlIIlll.append((char)(lllllllllllllIlIIIIIlllllIlIlIlI ^ lllllllllllllIlIIIIIlllllIlIIllI[lllllllllllllIlIIIIIlllllIlIIlIl % lllllllllllllIlIIIIIlllllIlIIllI.length]));
            "".length();
            ++lllllllllllllIlIIIIIlllllIlIIlIl;
            ++lllllllllllllIlIIIIIlllllIIlllIl;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlllllIlIIlll);
    }
    
    public TileEntityFlowerPot() {
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIlIIIIIllllllIllIII) {
        super.readFromNBT(lllllllllllllIlIIIIIllllllIllIII);
        if (llIIIIlIlIIIlll(lllllllllllllIlIIIIIllllllIllIII.hasKey(TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[3]], TileEntityFlowerPot.lIIIllIIIIIIll[4]) ? 1 : 0)) {
            this.flowerPotItem = Item.getByNameOrId(lllllllllllllIlIIIIIllllllIllIII.getString(TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[5]]));
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            this.flowerPotItem = Item.getItemById(lllllllllllllIlIIIIIllllllIllIII.getInteger(TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[6]]));
        }
        this.flowerPotData = lllllllllllllIlIIIIIllllllIllIII.getInteger(TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[7]]);
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIlIIIIIllllllIlllIl) {
        super.writeToNBT(lllllllllllllIlIIIIIllllllIlllIl);
        final ResourceLocation lllllllllllllIlIIIIIllllllIlllll = Item.itemRegistry.getNameForObject(this.flowerPotItem);
        final String lllllllllllllIIIIIlIIIlIIIIIIllI = TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[0]];
        String string;
        if (llIIIIlIlIIIllI(lllllllllllllIlIIIIIllllllIlllll)) {
            string = TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[1]];
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            string = lllllllllllllIlIIIIIllllllIlllll.toString();
        }
        lllllllllllllIlIIIIIllllllIlllIl.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
        lllllllllllllIlIIIIIllllllIlllIl.setInteger(TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[2]], this.flowerPotData);
    }
    
    public Item getFlowerPotItem() {
        return this.flowerPotItem;
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final NBTTagCompound lllllllllllllIlIIIIIllllllIlIIlI = new NBTTagCompound();
        this.writeToNBT(lllllllllllllIlIIIIIllllllIlIIlI);
        lllllllllllllIlIIIIIllllllIlIIlI.removeTag(TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[8]]);
        lllllllllllllIlIIIIIllllllIlIIlI.setInteger(TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[4]], Item.getIdFromItem(this.flowerPotItem));
        return new S35PacketUpdateTileEntity(this.pos, TileEntityFlowerPot.lIIIllIIIIIIll[6], lllllllllllllIlIIIIIllllllIlIIlI);
    }
    
    public TileEntityFlowerPot(final Item lllllllllllllIlIIIIIlllllllIIllI, final int lllllllllllllIlIIIIIlllllllIlIII) {
        this.flowerPotItem = lllllllllllllIlIIIIIlllllllIIllI;
        this.flowerPotData = lllllllllllllIlIIIIIlllllllIlIII;
    }
    
    private static boolean llIIIIlIlIIlIII(final int lllllllllllllIlIIIIIlllllIIIllII, final int lllllllllllllIlIIIIIlllllIIIlIll) {
        return lllllllllllllIlIIIIIlllllIIIllII < lllllllllllllIlIIIIIlllllIIIlIll;
    }
    
    private static void llIIIIlIlIIIIIl() {
        (lIIIllIIIIIIIl = new String[TileEntityFlowerPot.lIIIllIIIIIIll[9]])[TileEntityFlowerPot.lIIIllIIIIIIll[0]] = llIIIIlIIllIlIl("fzc7WrAy7C4=", "qkOqp");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[1]] = llIIIIlIIllIlIl("m+uvdLWYQyE=", "yyDjw");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[2]] = llIIIIlIIllIlIl("Dlbj/ANSuZM=", "JeOZA");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[3]] = llIIIIlIIllIllI("DD8tAA==", "EKHmy");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[5]] = llIIIIlIIllIlll("+xAaLjrXSpM=", "qmMck");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[6]] = llIIIIlIIllIllI("HAMSBw==", "UwwjA");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[7]] = llIIIIlIIllIlIl("tQEQqrrjlhc=", "uQmNX");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[8]] = llIIIIlIIllIlIl("x/mHuYaIb4s=", "WdtWu");
        TileEntityFlowerPot.lIIIllIIIIIIIl[TileEntityFlowerPot.lIIIllIIIIIIll[4]] = llIIIIlIIllIlIl("gmFpDAzyqSI=", "cWmxY");
    }
    
    private static boolean llIIIIlIlIIIllI(final Object lllllllllllllIlIIIIIlllllIIIlIIl) {
        return lllllllllllllIlIIIIIlllllIIIlIIl == null;
    }
    
    private static void llIIIIlIlIIIlIl() {
        (lIIIllIIIIIIll = new int[10])[0] = ((61 + 107 - 63 + 45 ^ 160 + 61 - 159 + 135) & (151 + 133 - 147 + 92 ^ 169 + 68 - 203 + 148 ^ -" ".length()));
        TileEntityFlowerPot.lIIIllIIIIIIll[1] = " ".length();
        TileEntityFlowerPot.lIIIllIIIIIIll[2] = "  ".length();
        TileEntityFlowerPot.lIIIllIIIIIIll[3] = "   ".length();
        TileEntityFlowerPot.lIIIllIIIIIIll[4] = (0xB2 ^ 0xBA);
        TileEntityFlowerPot.lIIIllIIIIIIll[5] = (0x1C ^ 0x3E ^ (0x41 ^ 0x67));
        TileEntityFlowerPot.lIIIllIIIIIIll[6] = (0x22 ^ 0x2F ^ (0x4B ^ 0x43));
        TileEntityFlowerPot.lIIIllIIIIIIll[7] = (0x69 ^ 0x56 ^ (0x55 ^ 0x6C));
        TileEntityFlowerPot.lIIIllIIIIIIll[8] = (0x67 ^ 0x60);
        TileEntityFlowerPot.lIIIllIIIIIIll[9] = (0x38 ^ 0x31);
    }
    
    public int getFlowerPotData() {
        return this.flowerPotData;
    }
    
    private static String llIIIIlIIllIlll(final String lllllllllllllIlIIIIIlllllIIlIlII, final String lllllllllllllIlIIIIIlllllIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlllllIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlllllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIlllllIIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIlllllIIlIllI.init(TileEntityFlowerPot.lIIIllIIIIIIll[2], lllllllllllllIlIIIIIlllllIIlIlll);
            return new String(lllllllllllllIlIIIIIlllllIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlllllIIlIlIl) {
            lllllllllllllIlIIIIIlllllIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public void setFlowerPotData(final Item lllllllllllllIlIIIIIllllllIIlIII, final int lllllllllllllIlIIIIIllllllIIIlll) {
        this.flowerPotItem = lllllllllllllIlIIIIIllllllIIlIII;
        this.flowerPotData = lllllllllllllIlIIIIIllllllIIIlll;
    }
}
