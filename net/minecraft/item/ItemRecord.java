// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.state.IBlockState;
import net.minecraft.stats.StatList;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockJukebox;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import com.google.common.collect.Maps;
import net.minecraft.util.StatCollector;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;

public class ItemRecord extends Item
{
    private static final /* synthetic */ Map<String, ItemRecord> RECORDS;
    private static final /* synthetic */ String[] llIlIIllIIIlll;
    public final /* synthetic */ String recordName;
    private static final /* synthetic */ int[] llIlIIllIIlIII;
    
    private static String lIIlIIlIllIlIllI(final String llllllllllllIllIlIllllllllIllIIl, final String llllllllllllIllIlIllllllllIllIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIllllllllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllllllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIllllllllIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIllllllllIlllIl.init(ItemRecord.llIlIIllIIlIII[3], llllllllllllIllIlIllllllllIllllI);
            return new String(llllllllllllIllIlIllllllllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllllllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllllllllIlllII) {
            llllllllllllIllIlIllllllllIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void addInformation(final ItemStack llllllllllllIllIlIllllllllllIIII, final EntityPlayer llllllllllllIllIlIlllllllllIllll, final List<String> llllllllllllIllIlIlllllllllIlIll, final boolean llllllllllllIllIlIlllllllllIllIl) {
        llllllllllllIllIlIlllllllllIlIll.add(this.getRecordNameLocal());
        "".length();
    }
    
    public static ItemRecord getRecord(final String llllllllllllIllIlIlllllllllIIIll) {
        return ItemRecord.RECORDS.get(llllllllllllIllIlIlllllllllIIIll);
    }
    
    public String getRecordNameLocal() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemRecord.llIlIIllIIIlll[ItemRecord.llIlIIllIIlIII[0]]).append(this.recordName).append(ItemRecord.llIlIIllIIIlll[ItemRecord.llIlIIllIIlIII[3]])));
    }
    
    private static void lIIlIIlIllIllIIl() {
        (llIlIIllIIlIII = new int[5])[0] = " ".length();
        ItemRecord.llIlIIllIIlIII[1] = ((0x24 ^ 0x65) & ~(0x24 ^ 0x65));
        ItemRecord.llIlIIllIIlIII[2] = (-(0xFFFFC533 & 0x7EDD) & (0xFFFFFFFD & 0x47FF));
        ItemRecord.llIlIIllIIlIII[3] = "  ".length();
        ItemRecord.llIlIIllIIlIII[4] = "   ".length();
    }
    
    private static String lIIlIIlIllIlIlIl(String llllllllllllIllIlIllllllllIIIllI, final String llllllllllllIllIlIllllllllIIIlIl) {
        llllllllllllIllIlIllllllllIIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIlIllllllllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIllllllllIIlIIl = new StringBuilder();
        final char[] llllllllllllIllIlIllllllllIIlIII = llllllllllllIllIlIllllllllIIIlIl.toCharArray();
        int llllllllllllIllIlIllllllllIIIlll = ItemRecord.llIlIIllIIlIII[1];
        final int llllllllllllIllIlIllllllllIIIIIl = (Object)llllllllllllIllIlIllllllllIIIllI.toCharArray();
        final short llllllllllllIllIlIllllllllIIIIII = (short)llllllllllllIllIlIllllllllIIIIIl.length;
        int llllllllllllIllIlIlllllllIllllll = ItemRecord.llIlIIllIIlIII[1];
        while (lIIlIIlIllIlllIl(llllllllllllIllIlIlllllllIllllll, llllllllllllIllIlIllllllllIIIIII)) {
            final char llllllllllllIllIlIllllllllIIllII = llllllllllllIllIlIllllllllIIIIIl[llllllllllllIllIlIlllllllIllllll];
            llllllllllllIllIlIllllllllIIlIIl.append((char)(llllllllllllIllIlIllllllllIIllII ^ llllllllllllIllIlIllllllllIIlIII[llllllllllllIllIlIllllllllIIIlll % llllllllllllIllIlIllllllllIIlIII.length]));
            "".length();
            ++llllllllllllIllIlIllllllllIIIlll;
            ++llllllllllllIllIlIlllllllIllllll;
            "".length();
            if (((0x44 ^ 0x72) & ~(0xB2 ^ 0x84)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIllllllllIIlIIl);
    }
    
    @Override
    public EnumRarity getRarity(final ItemStack llllllllllllIllIlIlllllllllIIllI) {
        return EnumRarity.RARE;
    }
    
    private static boolean lIIlIIlIllIlllII(final int llllllllllllIllIlIlllllllIllIlII) {
        return llllllllllllIllIlIlllllllIllIlII != 0;
    }
    
    private static boolean lIIlIIlIllIllIlI(final Object llllllllllllIllIlIlllllllIllIlll, final Object llllllllllllIllIlIlllllllIllIllI) {
        return llllllllllllIllIlIlllllllIllIlll == llllllllllllIllIlIlllllllIllIllI;
    }
    
    static {
        lIIlIIlIllIllIIl();
        lIIlIIlIllIlIlll();
        RECORDS = Maps.newHashMap();
    }
    
    protected ItemRecord(final String llllllllllllIllIllIIIIIIIIIIllII) {
        this.recordName = llllllllllllIllIllIIIIIIIIIIllII;
        this.maxStackSize = ItemRecord.llIlIIllIIlIII[0];
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
        ItemRecord.RECORDS.put(String.valueOf(new StringBuilder(ItemRecord.llIlIIllIIIlll[ItemRecord.llIlIIllIIlIII[1]]).append(llllllllllllIllIllIIIIIIIIIIllII)), this);
        "".length();
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIllIlIlllllllllllIII, final EntityPlayer llllllllllllIllIlIllllllllllIlll, final World llllllllllllIllIlIllllllllllIllI, final BlockPos llllllllllllIllIlIllllllllllIlIl, final EnumFacing llllllllllllIllIlIlllllllllllllI, final float llllllllllllIllIlIllllllllllllIl, final float llllllllllllIllIlIllllllllllllII, final float llllllllllllIllIlIlllllllllllIll) {
        final IBlockState llllllllllllIllIlIlllllllllllIlI = llllllllllllIllIlIllllllllllIllI.getBlockState(llllllllllllIllIlIllllllllllIlIl);
        if (!lIIlIIlIllIllIlI(llllllllllllIllIlIlllllllllllIlI.getBlock(), Blocks.jukebox) || !lIIlIIlIllIllIll(((boolean)llllllllllllIllIlIlllllllllllIlI.getValue((IProperty<Boolean>)BlockJukebox.HAS_RECORD)) ? 1 : 0)) {
            return ItemRecord.llIlIIllIIlIII[1] != 0;
        }
        if (lIIlIIlIllIlllII(llllllllllllIllIlIllllllllllIllI.isRemote ? 1 : 0)) {
            return ItemRecord.llIlIIllIIlIII[0] != 0;
        }
        ((BlockJukebox)Blocks.jukebox).insertRecord(llllllllllllIllIlIllllllllllIllI, llllllllllllIllIlIllllllllllIlIl, llllllllllllIllIlIlllllllllllIlI, llllllllllllIllIlIlllllllllllIII);
        llllllllllllIllIlIllllllllllIllI.playAuxSFXAtEntity(null, ItemRecord.llIlIIllIIlIII[2], llllllllllllIllIlIllllllllllIlIl, Item.getIdFromItem(this));
        llllllllllllIllIlIlllllllllllIII.stackSize -= ItemRecord.llIlIIllIIlIII[0];
        llllllllllllIllIlIllllllllllIlll.triggerAchievement(StatList.field_181740_X);
        return ItemRecord.llIlIIllIIlIII[0] != 0;
    }
    
    private static boolean lIIlIIlIllIllIll(final int llllllllllllIllIlIlllllllIllIIlI) {
        return llllllllllllIllIlIlllllllIllIIlI == 0;
    }
    
    private static boolean lIIlIIlIllIlllIl(final int llllllllllllIllIlIlllllllIlllIll, final int llllllllllllIllIlIlllllllIlllIlI) {
        return llllllllllllIllIlIlllllllIlllIll < llllllllllllIllIlIlllllllIlllIlI;
    }
    
    private static void lIIlIIlIllIlIlll() {
        (llIlIIllIIIlll = new String[ItemRecord.llIlIIllIIlIII[4]])[ItemRecord.llIlIIllIIlIII[1]] = lIIlIIlIllIlIlIl("KAgUKyE+Hlk=", "ZmwDS");
        ItemRecord.llIlIIllIIIlll[ItemRecord.llIlIIllIIlIII[0]] = lIIlIIlIllIlIlIl("PywcOVskPRo7BzJ2", "VXyTu");
        ItemRecord.llIlIIllIIIlll[ItemRecord.llIlIIllIIlIII[3]] = lIIlIIlIllIlIllI("fwap2Gt4BrA=", "WKsYM");
    }
}
