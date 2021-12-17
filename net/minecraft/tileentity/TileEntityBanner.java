// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import java.util.Arrays;
import net.minecraft.nbt.NBTBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.EnumDyeColor;
import java.util.List;
import net.minecraft.nbt.NBTTagList;

public class TileEntityBanner extends TileEntity
{
    private static final /* synthetic */ int[] llIIIlllIllllI;
    private /* synthetic */ NBTTagList patterns;
    private /* synthetic */ List<EnumBannerPattern> patternList;
    private /* synthetic */ int baseColor;
    private /* synthetic */ String patternResourceLocation;
    private /* synthetic */ List<EnumDyeColor> colorList;
    private static final /* synthetic */ String[] llIIIlllIIlllI;
    private /* synthetic */ boolean field_175119_g;
    
    private static boolean lIIIlIllIIIlIIIl(final int llllllllllllIlllIIlllllIllIIlllI, final int llllllllllllIlllIIlllllIllIIllIl) {
        return llllllllllllIlllIIlllllIllIIlllI < llllllllllllIlllIIlllllIllIIllIl;
    }
    
    private static boolean lIIIlIllIIIIllll(final int llllllllllllIlllIIlllllIllIlIIlI, final int llllllllllllIlllIIlllllIllIlIIIl) {
        return llllllllllllIlllIIlllllIllIlIIlI >= llllllllllllIlllIIlllllIllIlIIIl;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIlllIIllllllIlIIllll) {
        super.writeToNBT(llllllllllllIlllIIllllllIlIIllll);
        func_181020_a(llllllllllllIlllIIllllllIlIIllll, this.baseColor, this.patterns);
    }
    
    public void setItemValues(final ItemStack llllllllllllIlllIIllllllIlIllIIl) {
        this.patterns = null;
        if (lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIlIllIIl.hasTagCompound() ? 1 : 0) && lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIlIllIIl.getTagCompound().hasKey(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[0]], TileEntityBanner.llIIIlllIllllI[1]) ? 1 : 0)) {
            final NBTTagCompound llllllllllllIlllIIllllllIlIllIII = llllllllllllIlllIIllllllIlIllIIl.getTagCompound().getCompoundTag(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[2]]);
            if (lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIlIllIII.hasKey(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[3]]) ? 1 : 0)) {
                this.patterns = (NBTTagList)llllllllllllIlllIIllllllIlIllIII.getTagList(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[4]], TileEntityBanner.llIIIlllIllllI[1]).copy();
            }
            if (lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIlIllIII.hasKey(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[5]], TileEntityBanner.llIIIlllIllllI[6]) ? 1 : 0)) {
                this.baseColor = llllllllllllIlllIIllllllIlIllIII.getInteger(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[7]]);
                "".length();
                if (-" ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                this.baseColor = (llllllllllllIlllIIllllllIlIllIIl.getMetadata() & TileEntityBanner.llIIIlllIllllI[8]);
                "".length();
                if (((0xDD ^ 0x98) & ~(0x1C ^ 0x59)) != 0x0) {
                    return;
                }
            }
        }
        else {
            this.baseColor = (llllllllllllIlllIIllllllIlIllIIl.getMetadata() & TileEntityBanner.llIIIlllIllllI[8]);
        }
        this.patternList = null;
        this.colorList = null;
        this.patternResourceLocation = TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[9]];
        this.field_175119_g = (TileEntityBanner.llIIIlllIllllI[2] != 0);
    }
    
    private static boolean lIIIlIllIIIIlIll(final Object llllllllllllIlllIIlllllIllIIlIll) {
        return llllllllllllIlllIIlllllIllIIlIll != null;
    }
    
    private static boolean lIIIlIllIIIlIIII(final int llllllllllllIlllIIlllllIllIIIIll) {
        return llllllllllllIlllIIlllllIllIIIIll > 0;
    }
    
    private void initializeBannerData() {
        if (!lIIIlIllIIIIlIll(this.patternList) || !lIIIlIllIIIIlIll(this.colorList) || lIIIlIllIIIIllIl(this.patternResourceLocation)) {
            if (lIIIlIllIIIIlllI(this.field_175119_g ? 1 : 0)) {
                this.patternResourceLocation = TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[18]];
                "".length();
                if (-" ".length() == (0x87 ^ 0x83)) {
                    return;
                }
            }
            else {
                this.patternList = (List<EnumBannerPattern>)Lists.newArrayList();
                this.colorList = (List<EnumDyeColor>)Lists.newArrayList();
                this.patternList.add(EnumBannerPattern.BASE);
                "".length();
                this.colorList.add(EnumDyeColor.byDyeDamage(this.baseColor));
                "".length();
                this.patternResourceLocation = String.valueOf(new StringBuilder(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[19]]).append(this.baseColor));
                if (lIIIlIllIIIIlIll(this.patterns)) {
                    int llllllllllllIlllIIllllllIIIllIII = TileEntityBanner.llIIIlllIllllI[0];
                    "".length();
                    if ("  ".length() == (0x6 ^ 0x61 ^ (0xDC ^ 0xBF))) {
                        return;
                    }
                    while (!lIIIlIllIIIIllll(llllllllllllIlllIIllllllIIIllIII, this.patterns.tagCount())) {
                        final NBTTagCompound llllllllllllIlllIIllllllIIIlIlll = this.patterns.getCompoundTagAt(llllllllllllIlllIIllllllIIIllIII);
                        final EnumBannerPattern llllllllllllIlllIIllllllIIIlIllI = EnumBannerPattern.getPatternByID(llllllllllllIlllIIllllllIIIlIlll.getString(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[20]]));
                        if (lIIIlIllIIIIlIll(llllllllllllIlllIIllllllIIIlIllI)) {
                            this.patternList.add(llllllllllllIlllIIllllllIIIlIllI);
                            "".length();
                            final int llllllllllllIlllIIllllllIIIlIlIl = llllllllllllIlllIIllllllIIIlIlll.getInteger(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[21]]);
                            this.colorList.add(EnumDyeColor.byDyeDamage(llllllllllllIlllIIllllllIIIlIlIl));
                            "".length();
                            this.patternResourceLocation = String.valueOf(new StringBuilder(String.valueOf(this.patternResourceLocation)).append(llllllllllllIlllIIllllllIIIlIllI.getPatternID()).append(llllllllllllIlllIIllllllIIIlIlIl));
                        }
                        ++llllllllllllIlllIIllllllIIIllIII;
                    }
                }
            }
        }
    }
    
    private static boolean lIIIlIllIIIIllIl(final Object llllllllllllIlllIIlllllIllIIlIIl) {
        return llllllllllllIlllIIlllllIllIIlIIl == null;
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final NBTTagCompound llllllllllllIlllIIllllllIIllllII = new NBTTagCompound();
        this.writeToNBT(llllllllllllIlllIIllllllIIllllII);
        return new S35PacketUpdateTileEntity(this.pos, TileEntityBanner.llIIIlllIllllI[9], llllllllllllIlllIIllllllIIllllII);
    }
    
    public NBTTagList func_181021_d() {
        return this.patterns;
    }
    
    public static int getPatterns(final ItemStack llllllllllllIlllIIllllllIIlIllII) {
        final NBTTagCompound llllllllllllIlllIIllllllIIlIllIl = llllllllllllIlllIIllllllIIlIllII.getSubCompound(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[16]], (boolean)(TileEntityBanner.llIIIlllIllllI[0] != 0));
        int tagCount;
        if (lIIIlIllIIIIlIll(llllllllllllIlllIIllllllIIlIllIl) && lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIIlIllIl.hasKey(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[8]]) ? 1 : 0)) {
            tagCount = llllllllllllIlllIIllllllIIlIllIl.getTagList(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[17]], TileEntityBanner.llIIIlllIllllI[1]).tagCount();
            "".length();
            if (" ".length() != " ".length()) {
                return (0xC1 ^ 0x98 ^ "  ".length()) & (0xD1 ^ 0xB9 ^ (0xF ^ 0x3C) ^ -" ".length());
            }
        }
        else {
            tagCount = TileEntityBanner.llIIIlllIllllI[0];
        }
        return tagCount;
    }
    
    private static boolean lIIIlIllIIIIlIII(final int llllllllllllIlllIIlllllIllIIIlll) {
        return llllllllllllIlllIIlllllIllIIIlll != 0;
    }
    
    private static String lIIIlIlIllIllIll(final String llllllllllllIlllIIlllllIllllIIlI, final String llllllllllllIlllIIlllllIlllIllll) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllllIllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllllIlllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlllllIllllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlllllIllllIlII.init(TileEntityBanner.llIIIlllIllllI[3], llllllllllllIlllIIlllllIllllIlIl);
            return new String(llllllllllllIlllIIlllllIllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllllIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllllIllllIIll) {
            llllllllllllIlllIIlllllIllllIIll.printStackTrace();
            return null;
        }
    }
    
    public static void func_181020_a(final NBTTagCompound llllllllllllIlllIIllllllIlIIlIII, final int llllllllllllIlllIIllllllIlIIIlll, final NBTTagList llllllllllllIlllIIllllllIlIIlIIl) {
        llllllllllllIlllIIllllllIlIIlIII.setInteger(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[10]], llllllllllllIlllIIllllllIlIIIlll);
        if (lIIIlIllIIIIlIll(llllllllllllIlllIIllllllIlIIlIIl)) {
            llllllllllllIlllIIllllllIlIIlIII.setTag(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[11]], llllllllllllIlllIIllllllIlIIlIIl);
        }
    }
    
    private static boolean lIIIlIllIIIIlllI(final int llllllllllllIlllIIlllllIllIIIlIl) {
        return llllllllllllIlllIIlllllIllIIIlIl == 0;
    }
    
    public List<EnumBannerPattern> getPatternList() {
        this.initializeBannerData();
        return this.patternList;
    }
    
    public static void removeBannerData(final ItemStack llllllllllllIlllIIllllllIIIIllII) {
        final NBTTagCompound llllllllllllIlllIIllllllIIIIlIll = llllllllllllIlllIIllllllIIIIllII.getSubCompound(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[22]], (boolean)(TileEntityBanner.llIIIlllIllllI[0] != 0));
        if (lIIIlIllIIIIlIll(llllllllllllIlllIIllllllIIIIlIll) && lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIIIIlIll.hasKey(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[23]], TileEntityBanner.llIIIlllIllllI[12]) ? 1 : 0)) {
            final NBTTagList llllllllllllIlllIIllllllIIIIlIlI = llllllllllllIlllIIllllllIIIIlIll.getTagList(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[24]], TileEntityBanner.llIIIlllIllllI[1]);
            if (lIIIlIllIIIlIIII(llllllllllllIlllIIllllllIIIIlIlI.tagCount())) {
                llllllllllllIlllIIllllllIIIIlIlI.removeTag(llllllllllllIlllIIllllllIIIIlIlI.tagCount() - TileEntityBanner.llIIIlllIllllI[2]);
                "".length();
                if (lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIIIIlIlI.hasNoTags() ? 1 : 0)) {
                    llllllllllllIlllIIllllllIIIIllII.getTagCompound().removeTag(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[25]]);
                    if (lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIIIIllII.getTagCompound().hasNoTags() ? 1 : 0)) {
                        llllllllllllIlllIIllllllIIIIllII.setTagCompound(null);
                    }
                }
            }
        }
    }
    
    private static String lIIIlIlIllIllIlI(final String llllllllllllIlllIIlllllIllllllll, final String llllllllllllIlllIIlllllIllllllII) {
        try {
            final SecretKeySpec llllllllllllIlllIIllllllIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllllIllllllII.getBytes(StandardCharsets.UTF_8)), TileEntityBanner.llIIIlllIllllI[11]), "DES");
            final Cipher llllllllllllIlllIIllllllIIIIIIIl = Cipher.getInstance("DES");
            llllllllllllIlllIIllllllIIIIIIIl.init(TileEntityBanner.llIIIlllIllllI[3], llllllllllllIlllIIllllllIIIIIIlI);
            return new String(llllllllllllIlllIIllllllIIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllllllIIIIIIII) {
            llllllllllllIlllIIllllllIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIllIIIIIlll() {
        (llIIIlllIllllI = new int[27])[0] = ((0xB6 ^ 0x96) & ~(0xBE ^ 0x9E));
        TileEntityBanner.llIIIlllIllllI[1] = (0x97 ^ 0xB0 ^ (0x55 ^ 0x78));
        TileEntityBanner.llIIIlllIllllI[2] = " ".length();
        TileEntityBanner.llIIIlllIllllI[3] = "  ".length();
        TileEntityBanner.llIIIlllIllllI[4] = "   ".length();
        TileEntityBanner.llIIIlllIllllI[5] = (0x9F ^ 0x9B);
        TileEntityBanner.llIIIlllIllllI[6] = (0x36 ^ 0x6C ^ (0x52 ^ 0x6B));
        TileEntityBanner.llIIIlllIllllI[7] = (51 + 22 - 63 + 128 ^ 130 + 74 - 154 + 93);
        TileEntityBanner.llIIIlllIllllI[8] = (0x7 ^ 0x8);
        TileEntityBanner.llIIIlllIllllI[9] = (0x9C ^ 0xAD ^ (0x1C ^ 0x2B));
        TileEntityBanner.llIIIlllIllllI[10] = (0x39 ^ 0x3E);
        TileEntityBanner.llIIIlllIllllI[11] = (0x81 ^ 0xC0 ^ (0xE6 ^ 0xAF));
        TileEntityBanner.llIIIlllIllllI[12] = (0xC4 ^ 0x97 ^ (0x28 ^ 0x72));
        TileEntityBanner.llIIIlllIllllI[13] = (0x4 ^ 0x5A ^ (0x5E ^ 0xB));
        TileEntityBanner.llIIIlllIllllI[14] = (0xAF ^ 0xA3);
        TileEntityBanner.llIIIlllIllllI[15] = (0x6 ^ 0x1C ^ (0x92 ^ 0x85));
        TileEntityBanner.llIIIlllIllllI[16] = (0x82 ^ 0x8C);
        TileEntityBanner.llIIIlllIllllI[17] = (0x80 ^ 0x90);
        TileEntityBanner.llIIIlllIllllI[18] = (0x39 ^ 0x6E ^ (0x20 ^ 0x66));
        TileEntityBanner.llIIIlllIllllI[19] = (0x1F ^ 0xD);
        TileEntityBanner.llIIIlllIllllI[20] = (56 + 156 - 197 + 155 ^ 122 + 130 - 81 + 14);
        TileEntityBanner.llIIIlllIllllI[21] = (0x1 ^ 0x15);
        TileEntityBanner.llIIIlllIllllI[22] = (0xBA ^ 0xAF);
        TileEntityBanner.llIIIlllIllllI[23] = (0x40 ^ 0x56);
        TileEntityBanner.llIIIlllIllllI[24] = (14 + 170 - 13 + 19 ^ 151 + 91 - 95 + 22);
        TileEntityBanner.llIIIlllIllllI[25] = (11 + 28 - 2 + 112 ^ 36 + 83 - 29 + 51);
        TileEntityBanner.llIIIlllIllllI[26] = (0x95 ^ 0x8C);
    }
    
    public int getBaseColor() {
        return this.baseColor;
    }
    
    public List<EnumDyeColor> getColorList() {
        this.initializeBannerData();
        return this.colorList;
    }
    
    public String func_175116_e() {
        this.initializeBannerData();
        return this.patternResourceLocation;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIlllIIllllllIlIIIIlI) {
        super.readFromNBT(llllllllllllIlllIIllllllIlIIIIlI);
        this.baseColor = llllllllllllIlllIIllllllIlIIIIlI.getInteger(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[12]]);
        this.patterns = llllllllllllIlllIIllllllIlIIIIlI.getTagList(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[1]], TileEntityBanner.llIIIlllIllllI[1]);
        this.patternList = null;
        this.colorList = null;
        this.patternResourceLocation = null;
        this.field_175119_g = (TileEntityBanner.llIIIlllIllllI[2] != 0);
    }
    
    static {
        lIIIlIllIIIIIlll();
        lIIIlIlIllIllllI();
    }
    
    private static void lIIIlIlIllIllllI() {
        (llIIIlllIIlllI = new String[TileEntityBanner.llIIIlllIllllI[26]])[TileEntityBanner.llIIIlllIllllI[0]] = lIIIlIlIllIllIlI("lyC5rW2umNPw4Q/PS+SOCQ==", "nNlGW");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[2]] = lIIIlIlIllIllIll("4OtePl5IujtrnbMHOXzO3A==", "fEUbt");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[3]] = lIIIlIlIllIlllII("HCsVFQg+JBI=", "LJaam");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[4]] = lIIIlIlIllIllIll("Ouakd1enBi4VWTlX5jmAkw==", "LSZAR");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[5]] = lIIIlIlIllIllIll("6Cn1oqurapM=", "VDmUl");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[7]] = lIIIlIlIllIlllII("DAYjHA==", "NgPyy");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[9]] = lIIIlIlIllIllIll("FMyvNwCWGgE=", "zsnHF");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[10]] = lIIIlIlIllIllIll("dtjLaj42dpc=", "IjsuK");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[11]] = lIIIlIlIllIllIlI("UXCh6gvq7de9O7EKFheB7Q==", "TPMbx");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[12]] = lIIIlIlIllIllIlI("ZQWIosavF2s=", "FxdYh");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[1]] = lIIIlIlIllIllIll("uHJqfOUFYSnpVxCZ1PhM+Q==", "rVAQR");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[13]] = lIIIlIlIllIllIlI("bbp4zTHF89LFZ4W5OE/bGw==", "NyKxW");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[14]] = lIIIlIlIllIllIll("RvEIzDOIk84=", "nxzJX");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[15]] = lIIIlIlIllIllIlI("H1mUL+/ov7M=", "vloLy");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[16]] = lIIIlIlIllIllIlI("yMxKTyX56SJZ2FGILttnIg==", "vMeJY");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[8]] = lIIIlIlIllIllIll("gEB5x8e9mlge4gEyb9xq9g==", "lPnrX");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[17]] = lIIIlIlIllIllIlI("c9I6Of4prYW7rvoh0T19cQ==", "RvzuN");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[18]] = lIIIlIlIllIllIlI("8Qyy8cLPvXA=", "LYduq");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[19]] = lIIIlIlIllIlllII("EQ==", "srJkE");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[20]] = lIIIlIlIllIllIlI("2sw8autVXbE=", "XCwyU");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[21]] = lIIIlIlIllIllIll("hCscqGIgn9s=", "avpav");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[22]] = lIIIlIlIllIllIlI("m7njglnhB6rBiZg5pITfog==", "ZRayZ");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[23]] = lIIIlIlIllIlllII("HDEtNio+Pio=", "LPYBO");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[24]] = lIIIlIlIllIllIll("QMwnPxbjjcMpkGwkRah+MA==", "iXurs");
        TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[25]] = lIIIlIlIllIllIlI("ZjKcMnxecleX3ROQwSWfHg==", "xqvrz");
    }
    
    private static String lIIIlIlIllIlllII(String llllllllllllIlllIIlllllIllIlllIl, final String llllllllllllIlllIIlllllIllIlllII) {
        llllllllllllIlllIIlllllIllIlllIl = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIlllllIllIlllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlllllIlllIIIII = new StringBuilder();
        final char[] llllllllllllIlllIIlllllIllIlllll = llllllllllllIlllIIlllllIllIlllII.toCharArray();
        int llllllllllllIlllIIlllllIllIllllI = TileEntityBanner.llIIIlllIllllI[0];
        final short llllllllllllIlllIIlllllIllIllIII = (Object)((String)llllllllllllIlllIIlllllIllIlllIl).toCharArray();
        final int llllllllllllIlllIIlllllIllIlIlll = llllllllllllIlllIIlllllIllIllIII.length;
        long llllllllllllIlllIIlllllIllIlIllI = TileEntityBanner.llIIIlllIllllI[0];
        while (lIIIlIllIIIlIIIl((int)llllllllllllIlllIIlllllIllIlIllI, llllllllllllIlllIIlllllIllIlIlll)) {
            final char llllllllllllIlllIIlllllIlllIIIll = llllllllllllIlllIIlllllIllIllIII[llllllllllllIlllIIlllllIllIlIllI];
            llllllllllllIlllIIlllllIlllIIIII.append((char)(llllllllllllIlllIIlllllIlllIIIll ^ llllllllllllIlllIIlllllIllIlllll[llllllllllllIlllIIlllllIllIllllI % llllllllllllIlllIIlllllIllIlllll.length]));
            "".length();
            ++llllllllllllIlllIIlllllIllIllllI;
            ++llllllllllllIlllIIlllllIllIlIllI;
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlllllIlllIIIII);
    }
    
    public static int getBaseColor(final ItemStack llllllllllllIlllIIllllllIIllIlII) {
        final NBTTagCompound llllllllllllIlllIIllllllIIllIIll = llllllllllllIlllIIllllllIIllIlII.getSubCompound(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[13]], (boolean)(TileEntityBanner.llIIIlllIllllI[0] != 0));
        int n;
        if (lIIIlIllIIIIlIll(llllllllllllIlllIIllllllIIllIIll) && lIIIlIllIIIIlIII(llllllllllllIlllIIllllllIIllIIll.hasKey(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[14]]) ? 1 : 0)) {
            n = llllllllllllIlllIIllllllIIllIIll.getInteger(TileEntityBanner.llIIIlllIIlllI[TileEntityBanner.llIIIlllIllllI[15]]);
            "".length();
            if ("  ".length() <= -" ".length()) {
                return (0x1D ^ 0x72 ^ (0xE0 ^ 0xA5)) & (0xF3 ^ 0xC6 ^ (0x73 ^ 0x6C) ^ -" ".length());
            }
        }
        else {
            n = llllllllllllIlllIIllllllIIllIlII.getMetadata();
        }
        return n;
    }
    
    public enum EnumBannerPattern
    {
        STRIPE_DOWNRIGHT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[63]], EnumBannerPattern.llIIlllIIlllII[11], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[64]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[65]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[66]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[67]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[68]]), 
        TRIANGLE_TOP(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[99]], EnumBannerPattern.llIIlllIIlllII[17], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[100]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[101]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[102]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[103]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[104]]), 
        GRADIENT_UP(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[195]], EnumBannerPattern.llIIlllIIlllII[34], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[196]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[197]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[198]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[199]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[200]]), 
        TRIANGLE_BOTTOM(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[93]], EnumBannerPattern.llIIlllIIlllII[16], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[94]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[95]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[96]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[97]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[98]]);
        
        private /* synthetic */ String patternName;
        
        RHOMBUS_MIDDLE(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[147]], EnumBannerPattern.llIIlllIIlllII[25], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[148]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[149]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[150]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[151]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[152]]), 
        STRIPE_DOWNLEFT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[69]], EnumBannerPattern.llIIlllIIlllII[12], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[70]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[71]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[72]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[73]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[74]]), 
        DIAGONAL_LEFT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[117]], EnumBannerPattern.llIIlllIIlllII[20], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[118]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[119]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[120]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[121]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[122]]), 
        STRAIGHT_CROSS(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[87]], EnumBannerPattern.llIIlllIIlllII[15], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[88]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[89]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[90]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[91]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[92]]), 
        STRIPE_RIGHT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[45]], EnumBannerPattern.llIIlllIIlllII[8], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[46]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[47]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[48]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[49]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[50]]), 
        DIAGONAL_RIGHT_MIRROR(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[135]], EnumBannerPattern.llIIlllIIlllII[23], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[136]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[137]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[138]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[139]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[140]]), 
        SKULL(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[204]], EnumBannerPattern.llIIlllIIlllII[36], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[205]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[206]], new ItemStack(Items.skull, EnumBannerPattern.llIIlllIIlllII[1], EnumBannerPattern.llIIlllIIlllII[1])), 
        STRIPE_LEFT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[39]], EnumBannerPattern.llIIlllIIlllII[7], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[40]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[41]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[42]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[43]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[44]]), 
        TRIANGLES_TOP(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[111]], EnumBannerPattern.llIIlllIIlllII[19], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[112]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[113]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[114]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[115]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[116]]), 
        HALF_HORIZONTAL(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[159]], EnumBannerPattern.llIIlllIIlllII[27], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[160]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[161]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[162]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[163]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[164]]), 
        DIAGONAL_RIGHT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[123]], EnumBannerPattern.llIIlllIIlllII[21], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[124]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[125]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[126]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[127]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[128]]), 
        STRIPE_SMALL(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[75]], EnumBannerPattern.llIIlllIIlllII[13], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[76]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[77]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[78]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[79]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[80]]), 
        HALF_VERTICAL_MIRROR(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[165]], EnumBannerPattern.llIIlllIIlllII[28], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[166]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[167]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[168]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[169]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[170]]), 
        STRIPE_CENTER(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[51]], EnumBannerPattern.llIIlllIIlllII[9], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[52]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[53]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[54]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[55]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[56]]), 
        HALF_VERTICAL(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[153]], EnumBannerPattern.llIIlllIIlllII[26], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[154]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[155]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[156]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[157]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[158]]), 
        BORDER(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[177]], EnumBannerPattern.llIIlllIIlllII[30], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[178]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[179]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[180]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[181]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[182]]), 
        CIRCLE_MIDDLE(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[141]], EnumBannerPattern.llIIlllIIlllII[24], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[142]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[143]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[144]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[145]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[146]]), 
        GRADIENT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[189]], EnumBannerPattern.llIIlllIIlllII[33], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[190]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[191]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[192]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[193]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[194]]), 
        CURLY_BORDER(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[183]], EnumBannerPattern.llIIlllIIlllII[31], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[184]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[185]], new ItemStack(Blocks.vine)), 
        SQUARE_TOP_RIGHT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[21]], EnumBannerPattern.llIIlllIIlllII[4], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[22]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[23]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[24]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[25]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[26]]), 
        BRICKS(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[201]], EnumBannerPattern.llIIlllIIlllII[35], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[202]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[203]], new ItemStack(Blocks.brick_block)), 
        HALF_HORIZONTAL_MIRROR(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[171]], EnumBannerPattern.llIIlllIIlllII[29], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[172]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[173]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[174]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[175]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[176]]);
        
        private /* synthetic */ String[] craftingLayers;
        
        SQUARE_TOP_LEFT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[15]], EnumBannerPattern.llIIlllIIlllII[3], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[16]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[17]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[18]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[19]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[20]]), 
        STRIPE_BOTTOM(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[27]], EnumBannerPattern.llIIlllIIlllII[5], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[28]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[29]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[30]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[31]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[32]]), 
        TRIANGLES_BOTTOM(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[105]], EnumBannerPattern.llIIlllIIlllII[18], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[106]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[107]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[108]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[109]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[110]]), 
        STRIPE_TOP(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[33]], EnumBannerPattern.llIIlllIIlllII[6], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[34]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[35]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[36]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[37]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[38]]);
        
        private /* synthetic */ String patternID;
        
        BASE(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[0]], EnumBannerPattern.llIIlllIIlllII[0], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[1]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[2]]), 
        DIAGONAL_LEFT_MIRROR(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[129]], EnumBannerPattern.llIIlllIIlllII[22], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[130]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[131]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[132]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[133]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[134]]);
        
        private static final /* synthetic */ int[] llIIlllIIlllII;
        
        SQUARE_BOTTOM_LEFT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[3]], EnumBannerPattern.llIIlllIIlllII[1], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[4]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[5]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[6]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[7]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[8]]), 
        CROSS(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[81]], EnumBannerPattern.llIIlllIIlllII[14], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[82]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[83]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[84]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[85]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[86]]), 
        MOJANG(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[210]], EnumBannerPattern.llIIlllIIlllII[38], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[211]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[212]], new ItemStack(Items.golden_apple, EnumBannerPattern.llIIlllIIlllII[1], EnumBannerPattern.llIIlllIIlllII[1])), 
        CREEPER(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[186]], EnumBannerPattern.llIIlllIIlllII[32], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[187]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[188]], new ItemStack(Items.skull, EnumBannerPattern.llIIlllIIlllII[1], EnumBannerPattern.llIIlllIIlllII[4])), 
        STRIPE_MIDDLE(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[57]], EnumBannerPattern.llIIlllIIlllII[10], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[58]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[59]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[60]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[61]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[62]]);
        
        private /* synthetic */ ItemStack patternCraftingStack;
        
        SQUARE_BOTTOM_RIGHT(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[9]], EnumBannerPattern.llIIlllIIlllII[2], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[10]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[11]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[12]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[13]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[14]]);
        
        private static final /* synthetic */ String[] llIIlIIIlllIIl;
        
        FLOWER(EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[207]], EnumBannerPattern.llIIlllIIlllII[37], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[208]], EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[209]], new ItemStack(Blocks.red_flower, EnumBannerPattern.llIIlllIIlllII[1], BlockFlower.EnumFlowerType.OXEYE_DAISY.getMeta()));
        
        private EnumBannerPattern(final String llllllllllllIllIlllllIIIIIlIlIIl, final int llllllllllllIllIlllllIIIIIlIlIII, final String llllllllllllIllIlllllIIIIIlIIlll, final String llllllllllllIllIlllllIIIIIlIlllI, final String llllllllllllIllIlllllIIIIIlIllIl, final String llllllllllllIllIlllllIIIIIlIllII, final String llllllllllllIllIlllllIIIIIlIIIll) {
            this(llllllllllllIllIlllllIIIIIlIlIIl, llllllllllllIllIlllllIIIIIlIlIII, llllllllllllIllIlllllIIIIIlIIlll, llllllllllllIllIlllllIIIIIlIlllI);
            this.craftingLayers[EnumBannerPattern.llIIlllIIlllII[0]] = llllllllllllIllIlllllIIIIIlIllIl;
            this.craftingLayers[EnumBannerPattern.llIIlllIIlllII[1]] = llllllllllllIllIlllllIIIIIlIllII;
            this.craftingLayers[EnumBannerPattern.llIIlllIIlllII[2]] = llllllllllllIllIlllllIIIIIlIIIll;
        }
        
        private static boolean lIIIlllllIIIIlIl(final Object llllllllllllIllIllllIlllllIIIIIl) {
            return llllllllllllIllIllllIlllllIIIIIl != null;
        }
        
        private static void lIIIlllllIIIIIll() {
            (llIIlllIIlllII = new int[214])[0] = ((0x34 ^ 0x74) & ~(0x2F ^ 0x6F));
            EnumBannerPattern.llIIlllIIlllII[1] = " ".length();
            EnumBannerPattern.llIIlllIIlllII[2] = "  ".length();
            EnumBannerPattern.llIIlllIIlllII[3] = "   ".length();
            EnumBannerPattern.llIIlllIIlllII[4] = (0x43 ^ 0x51 ^ (0xD2 ^ 0xC4));
            EnumBannerPattern.llIIlllIIlllII[5] = (0x4E ^ 0x37 ^ (0x67 ^ 0x1B));
            EnumBannerPattern.llIIlllIIlllII[6] = (186 + 48 - 48 + 1 ^ 21 + 50 - 61 + 179);
            EnumBannerPattern.llIIlllIIlllII[7] = (0x11 ^ 0x3 ^ (0xAC ^ 0xB9));
            EnumBannerPattern.llIIlllIIlllII[8] = (104 + 122 - 116 + 43 ^ 64 + 34 - 27 + 74);
            EnumBannerPattern.llIIlllIIlllII[9] = (0x1 ^ 0x8);
            EnumBannerPattern.llIIlllIIlllII[10] = (0x2C ^ 0x26);
            EnumBannerPattern.llIIlllIIlllII[11] = (0x0 ^ 0xB);
            EnumBannerPattern.llIIlllIIlllII[12] = (103 + 107 - 192 + 160 ^ 31 + 8 - 11 + 162);
            EnumBannerPattern.llIIlllIIlllII[13] = (142 + 162 - 199 + 95 ^ 27 + 48 + 93 + 29);
            EnumBannerPattern.llIIlllIIlllII[14] = (0x7 ^ 0x9);
            EnumBannerPattern.llIIlllIIlllII[15] = (0x8 ^ 0x7);
            EnumBannerPattern.llIIlllIIlllII[16] = (135 + 34 - 156 + 171 ^ 19 + 23 + 126 + 0);
            EnumBannerPattern.llIIlllIIlllII[17] = (0xD2 ^ 0xA2 ^ (0x16 ^ 0x77));
            EnumBannerPattern.llIIlllIIlllII[18] = (0x13 ^ 0x1);
            EnumBannerPattern.llIIlllIIlllII[19] = (0x91 ^ 0xA7 ^ (0xB9 ^ 0x9C));
            EnumBannerPattern.llIIlllIIlllII[20] = (0x4B ^ 0x5F);
            EnumBannerPattern.llIIlllIIlllII[21] = (39 + 150 - 136 + 119 ^ 57 + 18 + 79 + 31);
            EnumBannerPattern.llIIlllIIlllII[22] = (0x5A ^ 0x4C);
            EnumBannerPattern.llIIlllIIlllII[23] = (0x1A ^ 0xD);
            EnumBannerPattern.llIIlllIIlllII[24] = (0xF8 ^ 0x81 ^ (0x12 ^ 0x73));
            EnumBannerPattern.llIIlllIIlllII[25] = (49 + 41 - 10 + 76 ^ 116 + 44 - 125 + 98);
            EnumBannerPattern.llIIlllIIlllII[26] = (0x63 ^ 0x79);
            EnumBannerPattern.llIIlllIIlllII[27] = (0x21 ^ 0x3A);
            EnumBannerPattern.llIIlllIIlllII[28] = (23 + 115 - 52 + 105 ^ 121 + 93 - 160 + 109);
            EnumBannerPattern.llIIlllIIlllII[29] = (0x53 ^ 0xE ^ (0x4F ^ 0xF));
            EnumBannerPattern.llIIlllIIlllII[30] = (0x11 ^ 0xF);
            EnumBannerPattern.llIIlllIIlllII[31] = (0x60 ^ 0x68 ^ (0x2C ^ 0x3B));
            EnumBannerPattern.llIIlllIIlllII[32] = (0x48 ^ 0x7 ^ (0x3B ^ 0x54));
            EnumBannerPattern.llIIlllIIlllII[33] = (0x74 ^ 0x46 ^ (0x9E ^ 0x8D));
            EnumBannerPattern.llIIlllIIlllII[34] = (0x9C ^ 0xBE);
            EnumBannerPattern.llIIlllIIlllII[35] = (0 + 125 + 9 + 17 ^ 95 + 14 - 107 + 178);
            EnumBannerPattern.llIIlllIIlllII[36] = (0x60 ^ 0x44);
            EnumBannerPattern.llIIlllIIlllII[37] = (0x22 ^ 0x5C ^ (0x77 ^ 0x2C));
            EnumBannerPattern.llIIlllIIlllII[38] = (0x5B ^ 0x7D);
            EnumBannerPattern.llIIlllIIlllII[39] = (0x39 ^ 0x1E);
            EnumBannerPattern.llIIlllIIlllII[40] = (178 + 50 - 199 + 156 ^ 12 + 123 + 4 + 6);
            EnumBannerPattern.llIIlllIIlllII[41] = (0x3F ^ 0x16);
            EnumBannerPattern.llIIlllIIlllII[42] = (0xA0 ^ 0x9F ^ (0x1D ^ 0x8));
            EnumBannerPattern.llIIlllIIlllII[43] = (126 + 6 - 68 + 63 ^ (0x56 ^ 0x2));
            EnumBannerPattern.llIIlllIIlllII[44] = (0x97 ^ 0xBB);
            EnumBannerPattern.llIIlllIIlllII[45] = (0x12 ^ 0x5C ^ (0x7 ^ 0x64));
            EnumBannerPattern.llIIlllIIlllII[46] = (0x78 ^ 0x56);
            EnumBannerPattern.llIIlllIIlllII[47] = (0x41 ^ 0x67 ^ (0x65 ^ 0x6C));
            EnumBannerPattern.llIIlllIIlllII[48] = (0x57 ^ 0x67);
            EnumBannerPattern.llIIlllIIlllII[49] = (0xAE ^ 0x9F);
            EnumBannerPattern.llIIlllIIlllII[50] = (0xD2 ^ 0xC4 ^ (0x54 ^ 0x70));
            EnumBannerPattern.llIIlllIIlllII[51] = (0x63 ^ 0x2A ^ (0xEF ^ 0x95));
            EnumBannerPattern.llIIlllIIlllII[52] = (0x81 ^ 0x87 ^ (0x37 ^ 0x5));
            EnumBannerPattern.llIIlllIIlllII[53] = (0x7E ^ 0x75 ^ (0x34 ^ 0xA));
            EnumBannerPattern.llIIlllIIlllII[54] = (0x9E ^ 0xA8);
            EnumBannerPattern.llIIlllIIlllII[55] = (0x8D ^ 0xBA);
            EnumBannerPattern.llIIlllIIlllII[56] = (84 + 1 + 55 + 4 ^ 126 + 122 - 118 + 38);
            EnumBannerPattern.llIIlllIIlllII[57] = (0x65 ^ 0x5C);
            EnumBannerPattern.llIIlllIIlllII[58] = (0xB2 ^ 0x88);
            EnumBannerPattern.llIIlllIIlllII[59] = (0x94 ^ 0xAF);
            EnumBannerPattern.llIIlllIIlllII[60] = (88 + 23 - 11 + 69 ^ 55 + 13 + 1 + 80);
            EnumBannerPattern.llIIlllIIlllII[61] = (((0x1B ^ 0x4B) & ~(0x42 ^ 0x12)) ^ (0x34 ^ 0x9));
            EnumBannerPattern.llIIlllIIlllII[62] = (0x33 ^ 0xD);
            EnumBannerPattern.llIIlllIIlllII[63] = (0x9C ^ 0xA3);
            EnumBannerPattern.llIIlllIIlllII[64] = (133 + 168 - 260 + 186 ^ 40 + 5 - 23 + 141);
            EnumBannerPattern.llIIlllIIlllII[65] = (0x77 ^ 0x36);
            EnumBannerPattern.llIIlllIIlllII[66] = (0x29 ^ 0x6B);
            EnumBannerPattern.llIIlllIIlllII[67] = (0x27 ^ 0x64);
            EnumBannerPattern.llIIlllIIlllII[68] = (0x3B ^ 0x7F);
            EnumBannerPattern.llIIlllIIlllII[69] = (0x83 ^ 0xB2 ^ (0xF6 ^ 0x82));
            EnumBannerPattern.llIIlllIIlllII[70] = (6 + 10 + 17 + 97 ^ 70 + 90 + 19 + 17);
            EnumBannerPattern.llIIlllIIlllII[71] = (0x81 ^ 0xC6);
            EnumBannerPattern.llIIlllIIlllII[72] = (90 + 22 + 78 + 12 ^ 26 + 85 - 49 + 68);
            EnumBannerPattern.llIIlllIIlllII[73] = (57 + 143 - 98 + 150 ^ 39 + 131 - 161 + 172);
            EnumBannerPattern.llIIlllIIlllII[74] = (0xE0 ^ 0xAA);
            EnumBannerPattern.llIIlllIIlllII[75] = (0x0 ^ 0x4B);
            EnumBannerPattern.llIIlllIIlllII[76] = (0x8B ^ 0xC7);
            EnumBannerPattern.llIIlllIIlllII[77] = (0x75 ^ 0x24 ^ (0x0 ^ 0x1C));
            EnumBannerPattern.llIIlllIIlllII[78] = (0x86 ^ 0x9B ^ (0xEA ^ 0xB9));
            EnumBannerPattern.llIIlllIIlllII[79] = (0x6E ^ 0x21);
            EnumBannerPattern.llIIlllIIlllII[80] = (0xC ^ 0x5C);
            EnumBannerPattern.llIIlllIIlllII[81] = (0x9D ^ 0x91 ^ (0xCD ^ 0x90));
            EnumBannerPattern.llIIlllIIlllII[82] = (0x55 ^ 0x6A ^ (0x2F ^ 0x42));
            EnumBannerPattern.llIIlllIIlllII[83] = (0x1E ^ 0x4D);
            EnumBannerPattern.llIIlllIIlllII[84] = (0x54 ^ 0x0);
            EnumBannerPattern.llIIlllIIlllII[85] = (0x90 ^ 0xC5);
            EnumBannerPattern.llIIlllIIlllII[86] = (0x2F ^ 0x79);
            EnumBannerPattern.llIIlllIIlllII[87] = (0x90 ^ 0xBD ^ (0xD9 ^ 0xA3));
            EnumBannerPattern.llIIlllIIlllII[88] = (0xFB ^ 0xA3);
            EnumBannerPattern.llIIlllIIlllII[89] = (0x64 ^ 0x3D);
            EnumBannerPattern.llIIlllIIlllII[90] = (0xFB ^ 0xA7 ^ (0xB7 ^ 0xB1));
            EnumBannerPattern.llIIlllIIlllII[91] = (0x4C ^ 0x17);
            EnumBannerPattern.llIIlllIIlllII[92] = (0x9 ^ 0x55);
            EnumBannerPattern.llIIlllIIlllII[93] = (" ".length() ^ (0x43 ^ 0x1F));
            EnumBannerPattern.llIIlllIIlllII[94] = (0xED ^ 0xB3);
            EnumBannerPattern.llIIlllIIlllII[95] = (0x5D ^ 0x2);
            EnumBannerPattern.llIIlllIIlllII[96] = (0x2C ^ 0x4C);
            EnumBannerPattern.llIIlllIIlllII[97] = (0x16 ^ 0x77);
            EnumBannerPattern.llIIlllIIlllII[98] = (0x80 ^ 0x99 ^ (0x6D ^ 0x16));
            EnumBannerPattern.llIIlllIIlllII[99] = (0xF7 ^ 0x94);
            EnumBannerPattern.llIIlllIIlllII[100] = (0x1A ^ 0x7E);
            EnumBannerPattern.llIIlllIIlllII[101] = (0x8A ^ 0x86 ^ (0xAC ^ 0xC5));
            EnumBannerPattern.llIIlllIIlllII[102] = (0x4B ^ 0x2D);
            EnumBannerPattern.llIIlllIIlllII[103] = (0x14 ^ 0x73);
            EnumBannerPattern.llIIlllIIlllII[104] = (0x4 ^ 0x6C);
            EnumBannerPattern.llIIlllIIlllII[105] = (0x78 ^ 0x9 ^ (0xBF ^ 0xA7));
            EnumBannerPattern.llIIlllIIlllII[106] = (0x17 ^ 0x7D);
            EnumBannerPattern.llIIlllIIlllII[107] = (112 + 168 - 59 + 11 ^ 95 + 114 - 201 + 123);
            EnumBannerPattern.llIIlllIIlllII[108] = (0x34 ^ 0x58);
            EnumBannerPattern.llIIlllIIlllII[109] = (0x49 ^ 0x2D ^ (0x8C ^ 0x85));
            EnumBannerPattern.llIIlllIIlllII[110] = (0xFD ^ 0x93);
            EnumBannerPattern.llIIlllIIlllII[111] = (0x5A ^ 0x35);
            EnumBannerPattern.llIIlllIIlllII[112] = (0x61 ^ 0x32 ^ (0x1A ^ 0x39));
            EnumBannerPattern.llIIlllIIlllII[113] = (0xE3 ^ 0x92);
            EnumBannerPattern.llIIlllIIlllII[114] = (0x13 ^ 0x61 ^ ((0xA7 ^ 0x93) & ~(0x17 ^ 0x23)));
            EnumBannerPattern.llIIlllIIlllII[115] = (11 + 45 - 54 + 217 ^ 142 + 47 - 129 + 108);
            EnumBannerPattern.llIIlllIIlllII[116] = (0x5C ^ 0x8 ^ (0x23 ^ 0x3));
            EnumBannerPattern.llIIlllIIlllII[117] = (0xCA ^ 0xBF);
            EnumBannerPattern.llIIlllIIlllII[118] = (0xCE ^ 0xC6 ^ (0x30 ^ 0x4E));
            EnumBannerPattern.llIIlllIIlllII[119] = (0 + 130 - 119 + 212 ^ 94 + 50 - 50 + 74);
            EnumBannerPattern.llIIlllIIlllII[120] = (0xCD ^ 0xB5);
            EnumBannerPattern.llIIlllIIlllII[121] = (0x55 ^ 0x2C);
            EnumBannerPattern.llIIlllIIlllII[122] = (0xDB ^ 0xA1);
            EnumBannerPattern.llIIlllIIlllII[123] = (0x7 ^ 0x7C);
            EnumBannerPattern.llIIlllIIlllII[124] = (0x2F ^ 0x53);
            EnumBannerPattern.llIIlllIIlllII[125] = (0xD ^ 0x6A ^ (0x28 ^ 0x32));
            EnumBannerPattern.llIIlllIIlllII[126] = (210 + 1 - 60 + 64 ^ 59 + 108 - 34 + 36);
            EnumBannerPattern.llIIlllIIlllII[127] = 16 + 12 + 59 + 40;
            EnumBannerPattern.llIIlllIIlllII[128] = 38 + 73 - 24 + 41;
            EnumBannerPattern.llIIlllIIlllII[129] = 19 + 122 - 61 + 49;
            EnumBannerPattern.llIIlllIIlllII[130] = (0x5F ^ 0xF) + (0x52 ^ 0x65) - (0x8E ^ 0xA0) + (0x83 ^ 0xAA);
            EnumBannerPattern.llIIlllIIlllII[131] = 94 + 86 - 89 + 40;
            EnumBannerPattern.llIIlllIIlllII[132] = 47 + 51 - 22 + 56;
            EnumBannerPattern.llIIlllIIlllII[133] = (0xB4 ^ 0x91) + (0x59 ^ 0x11) - -"   ".length() + (0x9A ^ 0x8F);
            EnumBannerPattern.llIIlllIIlllII[134] = (0x32 ^ 0x78) + (0x14 ^ 0x9) - ((0x38 ^ 0x14) & ~(0x46 ^ 0x6A)) + (0xB2 ^ 0xAD);
            EnumBannerPattern.llIIlllIIlllII[135] = 120 + 105 - 136 + 46;
            EnumBannerPattern.llIIlllIIlllII[136] = (0xDB ^ 0xA2) + (0x9A ^ 0x89) - (0xBD ^ 0xC6) + (0xF0 ^ 0x87);
            EnumBannerPattern.llIIlllIIlllII[137] = (0xEC ^ 0x85) + (0x7C ^ 0x34) - (64 + 80 - 32 + 46) + (0xFD ^ 0x8B);
            EnumBannerPattern.llIIlllIIlllII[138] = (0x36 ^ 0x6E) + (0x68 ^ 0x7B) - (0xE1 ^ 0xBF) + (0x3C ^ 0x41);
            EnumBannerPattern.llIIlllIIlllII[139] = 51 + 34 - 4 + 46 + (0x16 ^ 0x7B) - (49 + 22 + 30 + 72) + (0xD7 ^ 0x9B);
            EnumBannerPattern.llIIlllIIlllII[140] = (0x41 ^ 0x29) + (0x5B ^ 0x51) - (0x4C ^ 0x54) + (0xA6 ^ 0x94);
            EnumBannerPattern.llIIlllIIlllII[141] = (0x5A ^ 0x7D) + (0xD8 ^ 0xBF) - (0x89 ^ 0x87) + (0xB0 ^ 0xBD);
            EnumBannerPattern.llIIlllIIlllII[142] = (0x78 ^ 0x43) + (0xE ^ 0x0) - -(0xE2 ^ 0xC0) + (0x16 ^ 0x35);
            EnumBannerPattern.llIIlllIIlllII[143] = 25 + 115 - 35 + 38;
            EnumBannerPattern.llIIlllIIlllII[144] = (0x46 ^ 0x5C) + (0x93 ^ 0xB4) - (0xB8 ^ 0x96) + (0xFE ^ 0x83);
            EnumBannerPattern.llIIlllIIlllII[145] = (0x1E ^ 0x6F) + (0x3D ^ 0xE) - (12 + 132 - 75 + 80) + (104 + 73 - 94 + 47);
            EnumBannerPattern.llIIlllIIlllII[146] = (0x8E ^ 0x99) + ((0x20 ^ 0x69) & ~(0xC2 ^ 0x8B)) - -(0x24 ^ 0x33) + (0x6C ^ 0x8);
            EnumBannerPattern.llIIlllIIlllII[147] = (0x14 ^ 0x61) + (0x44 ^ 0x4B) - (0x6A ^ 0x5B) + (0xD9 ^ 0x99);
            EnumBannerPattern.llIIlllIIlllII[148] = 68 + 47 + 24 + 7 + (0x25 ^ 0x2A) - (33 + 67 - 66 + 96) + (0xF5 ^ 0x80);
            EnumBannerPattern.llIIlllIIlllII[149] = (0xC2 ^ 0xA2) + (0xE9 ^ 0xC2) - (0xD1 ^ 0x88) + (0x28 ^ 0x4B);
            EnumBannerPattern.llIIlllIIlllII[150] = 16 + 82 - 44 + 96;
            EnumBannerPattern.llIIlllIIlllII[151] = (0x7E ^ 0x69) + (9 + 40 + 72 + 25) - (133 + 29 - 1 + 4) + (40 + 32 - 65 + 140);
            EnumBannerPattern.llIIlllIIlllII[152] = (0x86 ^ 0xB8) + (0xF ^ 0x5) - (0x1A ^ 0x5D) + (101 + 117 - 150 + 83);
            EnumBannerPattern.llIIlllIIlllII[153] = 96 + 29 + 8 + 20;
            EnumBannerPattern.llIIlllIIlllII[154] = 41 + 91 - 14 + 36;
            EnumBannerPattern.llIIlllIIlllII[155] = (0xD8 ^ 0xAA) + (0xE7 ^ 0x9A) - (121 + 179 - 114 + 37) + (38 + 2 - 16 + 115);
            EnumBannerPattern.llIIlllIIlllII[156] = 61 + 128 - 125 + 92;
            EnumBannerPattern.llIIlllIIlllII[157] = 63 + 59 - 19 + 54;
            EnumBannerPattern.llIIlllIIlllII[158] = 57 + 5 - 23 + 119;
            EnumBannerPattern.llIIlllIIlllII[159] = 116 + 79 - 83 + 47;
            EnumBannerPattern.llIIlllIIlllII[160] = 101 + 113 - 204 + 150;
            EnumBannerPattern.llIIlllIIlllII[161] = (0x25 ^ 0x50) + (39 + 30 + 35 + 38) - (81 + 79 + 62 + 29) + (143 + 42 - 120 + 88);
            EnumBannerPattern.llIIlllIIlllII[162] = 90 + 50 - 62 + 84;
            EnumBannerPattern.llIIlllIIlllII[163] = 60 + 44 - 51 + 110;
            EnumBannerPattern.llIIlllIIlllII[164] = (0xE1 ^ 0xB4) + (128 + 67 - 42 + 6) - (35 + 31 + 38 + 23) + (0x96 ^ 0xB9);
            EnumBannerPattern.llIIlllIIlllII[165] = 154 + 30 - 163 + 144;
            EnumBannerPattern.llIIlllIIlllII[166] = 128 + 5 - 92 + 125;
            EnumBannerPattern.llIIlllIIlllII[167] = (0xD ^ 0x14) + (0x56 ^ 0x1) - (0x94 ^ 0xAB) + (0x7 ^ 0x71);
            EnumBannerPattern.llIIlllIIlllII[168] = 19 + 16 + 34 + 99;
            EnumBannerPattern.llIIlllIIlllII[169] = 92 + 129 - 180 + 128;
            EnumBannerPattern.llIIlllIIlllII[170] = 84 + 64 - 116 + 138;
            EnumBannerPattern.llIIlllIIlllII[171] = (0x5 ^ 0x6B) + (0x1A ^ 0x57) - (0xC2 ^ 0x8C) + (0x65 ^ 0x5B);
            EnumBannerPattern.llIIlllIIlllII[172] = 126 + 8 - 75 + 113;
            EnumBannerPattern.llIIlllIIlllII[173] = 102 + 62 - 136 + 145;
            EnumBannerPattern.llIIlllIIlllII[174] = 152 + 146 - 280 + 156;
            EnumBannerPattern.llIIlllIIlllII[175] = 95 + 166 - 232 + 146;
            EnumBannerPattern.llIIlllIIlllII[176] = (0x2D ^ 0x37) + (38 + 121 - 15 + 6) - (0xB1 ^ 0xA1) + (0x35 ^ 0x25);
            EnumBannerPattern.llIIlllIIlllII[177] = (0x50 ^ 0x4A) + (127 + 150 - 211 + 92) - (0xC ^ 0x0) + (0x14 ^ 0x11);
            EnumBannerPattern.llIIlllIIlllII[178] = 84 + 174 - 112 + 32;
            EnumBannerPattern.llIIlllIIlllII[179] = 63 + 19 + 11 + 86;
            EnumBannerPattern.llIIlllIIlllII[180] = 51 + 117 - 107 + 91 + (0xD7 ^ 0xB6) - (0x40 ^ 0x39) + (0x7D ^ 0x49);
            EnumBannerPattern.llIIlllIIlllII[181] = 117 + 127 - 229 + 166;
            EnumBannerPattern.llIIlllIIlllII[182] = (0x77 ^ 0x15) + (1 + 121 - 21 + 32) - (0xE4 ^ 0x86) + (0xA6 ^ 0x97);
            EnumBannerPattern.llIIlllIIlllII[183] = 137 + 55 - 132 + 123;
            EnumBannerPattern.llIIlllIIlllII[184] = (0x57 ^ 0x62) + (0xBE ^ 0x82) - (0xF9 ^ 0xA4) + (51 + 94 - 63 + 82);
            EnumBannerPattern.llIIlllIIlllII[185] = 134 + 0 - 117 + 122 + (0x5A ^ 0x1E) - (20 + 63 - 0 + 80) + (135 + 10 - 82 + 78);
            EnumBannerPattern.llIIlllIIlllII[186] = 159 + 8 - 48 + 67;
            EnumBannerPattern.llIIlllIIlllII[187] = 119 + 129 - 129 + 68;
            EnumBannerPattern.llIIlllIIlllII[188] = (0x2A ^ 0x11) + (0xCE ^ 0x8C) - -(0x16 ^ 0xF) + (0x2D ^ 0xB);
            EnumBannerPattern.llIIlllIIlllII[189] = 135 + 36 - 11 + 29;
            EnumBannerPattern.llIIlllIIlllII[190] = 159 + 107 - 82 + 6;
            EnumBannerPattern.llIIlllIIlllII[191] = (0x6D ^ 0x2B) + (0x66 ^ 0x11) - (0x1D ^ 0x6C) + (0x72 ^ 0x1);
            EnumBannerPattern.llIIlllIIlllII[192] = 113 + 176 - 266 + 169;
            EnumBannerPattern.llIIlllIIlllII[193] = " ".length() + (0x42 ^ 0x5A) - -(89 + 61 - 32 + 19) + (0x4A ^ 0x55);
            EnumBannerPattern.llIIlllIIlllII[194] = 187 + 85 - 160 + 82;
            EnumBannerPattern.llIIlllIIlllII[195] = 116 + 154 - 261 + 186;
            EnumBannerPattern.llIIlllIIlllII[196] = 129 + 34 - 39 + 72;
            EnumBannerPattern.llIIlllIIlllII[197] = 153 + 71 - 87 + 31 + (0xE7 ^ 0x95) - (84 + 50 - 38 + 47) + (0x2C ^ 0x16);
            EnumBannerPattern.llIIlllIIlllII[198] = 39 + 24 + 12 + 78 + (0x3 ^ 0x49) - (0x35 ^ 0x49) + (0xC1 ^ 0x9E);
            EnumBannerPattern.llIIlllIIlllII[199] = 19 + 142 - 141 + 179;
            EnumBannerPattern.llIIlllIIlllII[200] = 184 + 7 - 157 + 166;
            EnumBannerPattern.llIIlllIIlllII[201] = 113 + 82 - 127 + 73 + (107 + 41 - 132 + 114) - (128 + 107 - 190 + 85) + (0xB2 ^ 0x8E);
            EnumBannerPattern.llIIlllIIlllII[202] = 77 + 156 - 219 + 188;
            EnumBannerPattern.llIIlllIIlllII[203] = 30 + 43 - 17 + 117 + (29 + 49 + 79 + 20) - (115 + 11 - 66 + 171) + (0x3F ^ 0x6B);
            EnumBannerPattern.llIIlllIIlllII[204] = (0xB7 ^ 0x94) + (43 + 91 + 12 + 21) - (0x70 ^ 0x2F) + (0x30 ^ 0x51);
            EnumBannerPattern.llIIlllIIlllII[205] = (0x59 ^ 0x6E) + (126 + 19 - 60 + 105) - (0x41 ^ 0x14) + (0x32 ^ 0x1F);
            EnumBannerPattern.llIIlllIIlllII[206] = 68 + 25 + 94 + 19;
            EnumBannerPattern.llIIlllIIlllII[207] = (0x1C ^ 0x59) + (113 + 132 - 71 + 3) - (0xDA ^ 0x84) + (0x12 ^ 0x25);
            EnumBannerPattern.llIIlllIIlllII[208] = 97 + 120 - 72 + 42 + (0x1 ^ 0x9) - -(0x1F ^ 0x17) + (0x8C ^ 0x89);
            EnumBannerPattern.llIIlllIIlllII[209] = (0x4B ^ 0x55) + (0x21 ^ 0x24) - -(0x82 ^ 0xBB) + (0x4E ^ 0x3B);
            EnumBannerPattern.llIIlllIIlllII[210] = 78 + 55 - 59 + 88 + (0xEB ^ 0xA7) - (18 + 89 - 65 + 124) + (66 + 21 - 45 + 96);
            EnumBannerPattern.llIIlllIIlllII[211] = 192 + 182 - 215 + 52;
            EnumBannerPattern.llIIlllIIlllII[212] = 32 + 169 - 132 + 143;
            EnumBannerPattern.llIIlllIIlllII[213] = 81 + 19 - 85 + 134 + ((0x8C ^ 0x90) & ~(0x71 ^ 0x6D)) - (0x95 ^ 0xAC) + (0x29 ^ 0x50);
        }
        
        public String getPatternID() {
            return this.patternID;
        }
        
        private static String lIIIllIIIIIlIllI(final String llllllllllllIllIllllIlllllIlIIII, final String llllllllllllIllIllllIlllllIIllIl) {
            try {
                final SecretKeySpec llllllllllllIllIllllIlllllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIlllllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllllIlllllIlIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllIllllIlllllIlIIlI.init(EnumBannerPattern.llIIlllIIlllII[2], llllllllllllIllIllllIlllllIlIIll);
                return new String(llllllllllllIllIllllIlllllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIlllllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllllIlllllIlIIIl) {
                llllllllllllIllIllllIlllllIlIIIl.printStackTrace();
                return null;
            }
        }
        
        public static EnumBannerPattern getPatternByID(final String llllllllllllIllIlllllIIIIIIIlIll) {
            final short llllllllllllIllIlllllIIIIIIIIlIl;
            final int llllllllllllIllIlllllIIIIIIIIllI = ((EnumBannerPattern[])(Object)(llllllllllllIllIlllllIIIIIIIIlIl = (short)(Object)values())).length;
            float llllllllllllIllIlllllIIIIIIIIlll = EnumBannerPattern.llIIlllIIlllII[0];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
            while (!lIIIlllllIIIIlll((int)llllllllllllIllIlllllIIIIIIIIlll, llllllllllllIllIlllllIIIIIIIIllI)) {
                final EnumBannerPattern llllllllllllIllIlllllIIIIIIIlIlI = llllllllllllIllIlllllIIIIIIIIlIl[llllllllllllIllIlllllIIIIIIIIlll];
                if (lIIIlllllIIIIllI(llllllllllllIllIlllllIIIIIIIlIlI.patternID.equals(llllllllllllIllIlllllIIIIIIIlIll) ? 1 : 0)) {
                    return llllllllllllIllIlllllIIIIIIIlIlI;
                }
                ++llllllllllllIllIlllllIIIIIIIIlll;
            }
            return null;
        }
        
        private static void lIIIlllllIIIIIII() {
            (llIIlIIIlllIIl = new String[EnumBannerPattern.llIIlllIIlllII[213]])[EnumBannerPattern.llIIlllIIlllII[0]] = lIIIllIIIIIlIlIl("e4mNl/H/2Vw=", "lKESu");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[1]] = lIIIllIIIIIlIllI("7WVPLuX6vW0=", "sAmND");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[2]] = lIIIllIIIIIlIllI("VXAubZCjOds=", "cPulF");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[3]] = lIIIllIIIIIlIlIl("r1kCEcYtA+hdcv6xaeImFuJIOM/annDg", "LiFdK");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[4]] = lIIIllIIIIIlIlIl("mA81CDkawG2HXpoSzho2coQ0ADXzB6aN", "DHiTr");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[5]] = lIIIllIIIIIlIllI("F9GpHA6Nt0E=", "cZqQq");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[6]] = lIIIllIIIIIllIlI("RUhk", "ehDtK");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[7]] = lIIIllIIIIIllIlI("WFNP", "xsoaw");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[8]] = lIIIllIIIIIlIllI("M1d3kdyhy4o=", "hfMSu");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[9]] = lIIIllIIIIIlIllI("qNWOeH7SPLJSbdGWyC1tBvhvVIBF6KZX", "cDTEh");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[10]] = lIIIllIIIIIllIlI("Az0MOCcVExs2IQQjFAYnGSsRLQ==", "pLyYU");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[11]] = lIIIllIIIIIllIlI("BBY=", "fdyBI");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[12]] = lIIIllIIIIIllIlI("bExM", "LllhA");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[13]] = lIIIllIIIIIlIlIl("46jMQyqhLMU=", "jvMBU");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[14]] = lIIIllIIIIIlIllI("TiffTO/0hvk=", "HPrEB");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[15]] = lIIIllIIIIIlIlIl("SMLcd5ppfFfAE1DrxH0EOQ==", "dNmiY");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[16]] = lIIIllIIIIIllIlI("HDwCCjcKEgMENTAhEg0x", "oMwkE");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[17]] = lIIIllIIIIIlIllI("ej5H17Tfn54=", "xBirk");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[18]] = lIIIllIIIIIlIlIl("gwNh5GjE6DQ=", "CbRHF");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[19]] = lIIIllIIIIIlIlIl("G4vBZZHR2uQ=", "kpxQs");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[20]] = lIIIllIIIIIlIlIl("EWg/PlF22Xw=", "thnNx");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[21]] = lIIIllIIIIIlIlIl("tr4Uzm9K51HVNEjUsEbLdgOgghxB3cEf", "DyNiG");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[22]] = lIIIllIIIIIllIlI("FSsHCBMDBQYGETkoGw4JEg==", "fZria");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[23]] = lIIIllIIIIIllIlI("Ijo=", "VHryR");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[24]] = lIIIllIIIIIlIllI("M4yBFyvHgdk=", "VBgDY");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[25]] = lIIIllIIIIIlIllI("fndpkedLSyE=", "NUafk");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[26]] = lIIIllIIIIIlIlIl("ZsJVovoVUHE=", "BGGDK");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[27]] = lIIIllIIIIIlIlIl("PVJY/ZhfPMhbNVyM0JCAkQ==", "hjLXK");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[28]] = lIIIllIIIIIllIlI("ERswMwUHMCA1ARYALw==", "boBZu");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[29]] = lIIIllIIIIIlIlIl("KxTf/Tql9aM=", "umEGM");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[30]] = lIIIllIIIIIllIlI("cnZL", "RVkhJ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[31]] = lIIIllIIIIIlIllI("fF2bL0nTWuc=", "AxYLT");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[32]] = lIIIllIIIIIlIllI("F5wdkbP/3WI=", "TDBdJ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[33]] = lIIIllIIIIIlIllI("fhquMVFlqg198AbhAL7aeA==", "syJtN");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[34]] = lIIIllIIIIIlIllI("MdQLVrnhOpIhTgPJ2HN7qA==", "QSVDd");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[35]] = lIIIllIIIIIllIlI("BDU=", "pFSrt");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[36]] = lIIIllIIIIIllIlI("Untw", "qXSSZ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[37]] = lIIIllIIIIIllIlI("Y2Jh", "CBALO");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[38]] = lIIIllIIIIIlIlIl("1dpmTapUmbc=", "cXSYQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[39]] = lIIIllIIIIIlIllI("HdBr7rpOY0VK5NK5q5k27Q==", "RCZyI");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[40]] = lIIIllIIIIIllIlI("IDYqCxU2HTQHAyc=", "SBXbe");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[41]] = lIIIllIIIIIlIllI("BRASLOFvQlU=", "JBRMo");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[42]] = lIIIllIIIIIllIlI("Vlhw", "uxPad");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[43]] = lIIIllIIIIIlIllI("u0t7twKjS9s=", "EHtPc");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[44]] = lIIIllIIIIIlIlIl("iisjLg3G+CU=", "EGUtP");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[45]] = lIIIllIIIIIllIlI("Jw0/PzsxBj8/LDwN", "tYmvk");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[46]] = lIIIllIIIIIllIlI("IQYXGAg3LRcYHzoG", "Rreqx");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[47]] = lIIIllIIIIIlIlIl("Uhk6j6uuElQ=", "fPTed");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[48]] = lIIIllIIIIIllIlI("aU9k", "IoGkE");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[49]] = lIIIllIIIIIllIlI("bFlA", "LycaV");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[50]] = lIIIllIIIIIlIlIl("dmJBXLyN7uw=", "Pvqsv");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[51]] = lIIIllIIIIIlIlIl("U/z1n8OcB5Ev15nIBrhl/w==", "hmOec");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[52]] = lIIIllIIIIIlIlIl("K1sr1E7043RFEYR88XNCtg==", "ivVNV");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[53]] = lIIIllIIIIIlIllI("mQ/OR6zwwTM=", "NtAfO");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[54]] = lIIIllIIIIIllIlI("RGxC", "dObsU");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[55]] = lIIIllIIIIIlIlIl("qyKstTP4iyI=", "KCdSF");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[56]] = lIIIllIIIIIlIllI("6cWgoGrRTLo=", "nMCHS");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[57]] = lIIIllIIIIIlIllI("GynE3WF1OSe5JkHQG6Jyng==", "IeIMI");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[58]] = lIIIllIIIIIllIlI("BywdETIRBwIRJhA0Cg==", "tXoxB");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[59]] = lIIIllIIIIIllIlI("PgA=", "SsdQb");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[60]] = lIIIllIIIIIllIlI("ZWph", "EJAcY");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[61]] = lIIIllIIIIIlIllI("zock+4aQdyo=", "aoztw");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[62]] = lIIIllIIIIIlIllI("srPQ/qInlto=", "jENPs");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[63]] = lIIIllIIIIIlIlIl("uazyjgU2vgdU/iPO7kBdT3DZLFjNonCG", "bEPTh");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[64]] = lIIIllIIIIIllIlI("BD8TJiYSFAUgIRk5CCg+Aw==", "wKaOV");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[65]] = lIIIllIIIIIlIlIl("DJjf8NOqMVc=", "EySzc");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[66]] = lIIIllIIIIIllIlI("aXRF", "JTeFm");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[67]] = lIIIllIIIIIlIllI("syctaHieolc=", "TEbYB");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[68]] = lIIIllIIIIIlIllI("eK1Q43Y4JLs=", "YkdHc");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[69]] = lIIIllIIIIIlIllI("aCfobdna0hNZpY6JSMxdqQ==", "zgdSn");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[70]] = lIIIllIIIIIllIlI("JzIdIDIxGQsmNToqCi82", "TFoIB");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[71]] = lIIIllIIIIIlIlIl("CYhnOnDqCRw=", "VHKNM");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[72]] = lIIIllIIIIIlIllI("IHXLkqcTefo=", "EHRng");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[73]] = lIIIllIIIIIlIlIl("33UMl4iEp2w=", "VcYZf");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[74]] = lIIIllIIIIIlIlIl("Zp+tfr45Peg=", "MzDtN");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[75]] = lIIIllIIIIIlIllI("3KXxU8JUKcLOrOajEWCivg==", "oKimS");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[76]] = lIIIllIIIIIllIlI("IwECIiMPHxc8JiAJEA==", "PlcNO");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[77]] = lIIIllIIIIIlIllI("VN9QuZGNm34=", "YtByT");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[78]] = lIIIllIIIIIllIlI("a1dx", "HwRao");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[79]] = lIIIllIIIIIlIllI("cLeXDzD0vVM=", "CymiR");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[80]] = lIIIllIIIIIlIlIl("nHmI/djw+qM=", "JFTXO");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[81]] = lIIIllIIIIIlIlIl("OMIwWDK8x3g=", "eDIHn");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[82]] = lIIIllIIIIIlIlIl("98d+eZL/FB0=", "xZUbB");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[83]] = lIIIllIIIIIlIlIl("hcZlEkREG90=", "PlcIO");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[84]] = lIIIllIIIIIlIllI("C/zCVSjZOoM=", "zNzNz");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[85]] = lIIIllIIIIIlIlIl("jegkRWJdZ5c=", "eWboN");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[86]] = lIIIllIIIIIllIlI("TVRA", "ntcVv");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[87]] = lIIIllIIIIIlIllI("r4GFfKd5XidgVWOa0ilWEA==", "KnCko");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[88]] = lIIIllIIIIIlIllI("D5glFHkT24+Cfa8xmiPPog==", "ELvgQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[89]] = lIIIllIIIIIllIlI("KjA=", "YSeNI");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[90]] = lIIIllIIIIIllIlI("Y2ZT", "CEsUL");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[91]] = lIIIllIIIIIlIllI("ySqnGGFHmNE=", "VnLXi");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[92]] = lIIIllIIIIIlIllI("jW0YYuEZ5sk=", "DRBUR");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[93]] = lIIIllIIIIIlIlIl("D4YGO5QBMxOM1y0P3CIr7Q==", "zEJgA");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[94]] = lIIIllIIIIIllIlI("Ph4eBCEtABI6LSUYAwoi", "JlweO");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[95]] = lIIIllIIIIIllIlI("JB0=", "FiVLW");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[96]] = lIIIllIIIIIlIllI("dQy6J4+jTTo=", "pZrsP");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[97]] = lIIIllIIIIIllIlI("QmJ0", "bATIF");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[98]] = lIIIllIIIIIllIlI("QGFH", "cAdTG");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[99]] = lIIIllIIIIIllIlI("LCorFwI/NCcJGDco", "xxbVL");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[100]] = lIIIllIIIIIlIllI("WIilEfz2VY5JwhORYVeYOw==", "raoBL");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[101]] = lIIIllIIIIIllIlI("BzM=", "sGeSh");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[102]] = lIIIllIIIIIlIlIl("0hOcYcVg5OU=", "RbFmu");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[103]] = lIIIllIIIIIllIlI("RWVP", "eFonb");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[104]] = lIIIllIIIIIlIlIl("rrBJFB1NW7k=", "PhJdT");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[105]] = lIIIllIIIIIlIllI("MQMtLJeCPfTn2LlN0s5K2HOwA6JxrJcG", "ztOLG");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[106]] = lIIIllIIIIIlIlIl("n3dCGB4MFK2lcGXtnooRFz4aNI/HQmrP", "vhfSG");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[107]] = lIIIllIIIIIllIlI("Lz4x", "MJBiW");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[108]] = lIIIllIIIIIllIlI("bE1R", "Lmqum");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[109]] = lIIIllIIIIIllIlI("cWZp", "RFJcb");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[110]] = lIIIllIIIIIlIllI("yFOdJYDxSuM=", "wpHiI");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[111]] = lIIIllIIIIIllIlI("FSglCC8GNikaPhU1PA==", "AzlIa");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[112]] = lIIIllIIIIIllIlI("OxA8JCcoDjA2FjsNJQ==", "ObUEI");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[113]] = lIIIllIIIIIlIllI("77Dv4vQu+Iw=", "syqDF");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[114]] = lIIIllIIIIIlIlIl("iUNwVsH5xUI=", "CJWSJ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[115]] = lIIIllIIIIIlIlIl("YUwE6FyPBsU=", "zDfyG");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[116]] = lIIIllIIIIIlIllI("qbsrV4P4O8Q=", "FwyrQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[117]] = lIIIllIIIIIllIlI("JQ4YCgQvBhUSByQBDQ==", "aGYMK");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[118]] = lIIIllIIIIIlIlIl("aDTX31J2dAMDdh0tU/SUwQ==", "TclRe");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[119]] = lIIIllIIIIIlIllI("sdaWJBYupwc=", "iXzmK");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[120]] = lIIIllIIIIIlIlIl("XnZ+2ss9MB8=", "EGDjb");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[121]] = lIIIllIIIIIlIlIl("i+RA9Q2SYa0=", "bdARH");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[122]] = lIIIllIIIIIlIllI("WHVxV38HeW8=", "KKeHF");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[123]] = lIIIllIIIIIlIlIl("hKNOHfH5XUJJsLJQwNEGkQ==", "CrOQR");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[124]] = lIIIllIIIIIlIlIl("0bQ+TA2IuJGUSKFweOTJyfy5PFs6zRrJ", "SslLn");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[125]] = lIIIllIIIIIlIllI("ZxysifQhOPo=", "RxSbQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[126]] = lIIIllIIIIIlIlIl("LC7V5qbE8Fs=", "KgGmz");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[127]] = lIIIllIIIIIlIlIl("CO6lZ2ioLUM=", "wLXSg");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[128]] = lIIIllIIIIIlIlIl("fR+7kXbxTpA=", "bydPj");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[129]] = lIIIllIIIIIlIlIl("rpX0087aGoBf7jXJpSTWzXM1Rb8m+ZQy", "ieZsu");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[130]] = lIIIllIIIIIlIllI("4uKKNhBdZUpv4qgJXsvkjoGQOw0F9RX8", "SbAfq");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[131]] = lIIIllIIIIIlIlIl("56pYNBHIjds=", "VUZmw");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[132]] = lIIIllIIIIIllIlI("Q012", "cmVCQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[133]] = lIIIllIIIIIllIlI("WWJh", "zBAlR");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[134]] = lIIIllIIIIIlIlIl("xM5Xz+lCSZk=", "bnPcM");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[135]] = lIIIllIIIIIlIllI("yQZ5BtaXH8Wc3sToViO/raTqBlkb3WQk", "TWBZF");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[136]] = lIIIllIIIIIllIlI("EjsvMBkYMyIIBB81JiM=", "vRNWv");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[137]] = lIIIllIIIIIllIlI("MDce", "BBzoq");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[138]] = lIIIllIIIIIlIllI("r2S7JmZgxu8=", "vMLmY");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[139]] = lIIIllIIIIIllIlI("emph", "ZJBdP");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[140]] = lIIIllIIIIIllIlI("RExQ", "dlpuY");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[141]] = lIIIllIIIIIllIlI("NwoCJy0xHB0tJTAPFQ==", "tCPda");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[142]] = lIIIllIIIIIlIlIl("9k2FP+ielR0=", "pWEAX");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[143]] = lIIIllIIIIIlIllI("bcplTrFo7cc=", "aCcCQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[144]] = lIIIllIIIIIlIllI("/jZlDcFErBc=", "qcaeU");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[145]] = lIIIllIIIIIlIllI("8gWYdvBYDCQ=", "aWsjG");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[146]] = lIIIllIIIIIlIllI("0cIEmY/uG0w=", "nWUMr");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[147]] = lIIIllIIIIIlIlIl("81usAvzQC52bY+vwOTGbLw==", "RZFuQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[148]] = lIIIllIIIIIllIlI("Kwo/JRgsEQ==", "YbPHz");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[149]] = lIIIllIIIIIlIlIl("UfQGryBFGYE=", "javOE");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[150]] = lIIIllIIIIIlIlIl("axZnULiO1i0=", "fhQCK");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[151]] = lIIIllIIIIIlIlIl("W61TT7AT/6o=", "WFQAM");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[152]] = lIIIllIIIIIllIlI("ZVR0", "EwTnN");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[153]] = lIIIllIIIIIlIlIl("AOVx2YJ7Bwla6hruttUXvQ==", "Jvfkj");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[154]] = lIIIllIIIIIllIlI("BQkrHD4bDTUOCA4JKw==", "mhGza");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[155]] = lIIIllIIIIIllIlI("Dik=", "xAGBx");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[156]] = lIIIllIIIIIllIlI("UllR", "qzqFg");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[157]] = lIIIllIIIIIlIlIl("YGGZw9LWE1w=", "pzkcP");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[158]] = lIIIllIIIIIlIlIl("cyG7VptpSKc=", "SEVNm");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[159]] = lIIIllIIIIIllIlI("GAcdDg4YCQMBCx8IBQkd", "PFQHQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[160]] = lIIIllIIIIIlIllI("aSKrhpaR70eqCOm82mOkNg==", "zRVVT");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[161]] = lIIIllIIIIIllIlI("BSQ=", "mLPzE");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[162]] = lIIIllIIIIIlIlIl("a1usRkhIDQE=", "QYmfj");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[163]] = lIIIllIIIIIllIlI("ZGtX", "GHtls");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[164]] = lIIIllIIIIIlIlIl("jNcVTiLDuDM=", "JkMiS");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[165]] = lIIIllIIIIIllIlI("AyQPCi8dIBEYOQgkDxM9AjcRAyI=", "KeCLp");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[166]] = lIIIllIIIIIlIllI("kzVUs2OPybENhrzJ9oWE88dhmEMyk1QC", "rBntw");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[167]] = lIIIllIIIIIllIlI("Dx88", "ywNuR");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[168]] = lIIIllIIIIIlIlIl("qXEW/iQlb5I=", "nzDFD");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[169]] = lIIIllIIIIIlIllI("5A5j59anZ1o=", "vUEeO");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[170]] = lIIIllIIIIIlIllI("pbBQpW1qkX4=", "YGjSd");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[171]] = lIIIllIIIIIllIlI("HxklADgfFzsPPRgWPQcrCBUgFDUYCg==", "WXiFg");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[172]] = lIIIllIIIIIllIlI("BhElDxIGHzsANwEePQghMRImHTkBHQ==", "npIiM");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[173]] = lIIIllIIIIIlIllI("9l85MI07cvk=", "jlKsj");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[174]] = lIIIllIIIIIlIlIl("MHcSJH/wa5U=", "voixW");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[175]] = lIIIllIIIIIlIllI("600GGyVjVsE=", "GkbXs");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[176]] = lIIIllIIIIIlIllI("52OlBrxCnxA=", "fwhyG");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[177]] = lIIIllIIIIIlIlIl("Of0BfplfTI0=", "NORwc");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[178]] = lIIIllIIIIIllIlI("IQohPDIx", "CeSXW");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[179]] = lIIIllIIIIIlIlIl("tAZnKjAr7o0=", "GiVaf");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[180]] = lIIIllIIIIIlIllI("kRr2qYAlyKw=", "IkVYq");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[181]] = lIIIllIIIIIlIlIl("9oYSwRf8NIk=", "Pqwpc");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[182]] = lIIIllIIIIIllIlI("T2FR", "lBruu");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[183]] = lIIIllIIIIIlIllI("PclGMOI7BcrPy3zk7IkcyQ==", "lrVCi");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[184]] = lIIIllIIIIIllIlI("FxMGFQ8rBBsLEhEU", "tftyv");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[185]] = lIIIllIIIIIlIlIl("wscTk/7aTyA=", "ftetN");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[186]] = lIIIllIIIIIlIlIl("pRYYpls/NZw=", "VUHMV");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[187]] = lIIIllIIIIIlIllI("ylRta7u6vpk=", "sIEWX");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[188]] = lIIIllIIIIIlIllI("4CpdcHHW9+E=", "zNxwq");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[189]] = lIIIllIIIIIlIllI("gMtki6XhjvRHYKDAyWWXCA==", "yRNdm");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[190]] = lIIIllIIIIIllIlI("Hh8APRgcAxU=", "ymaYq");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[191]] = lIIIllIIIIIllIlI("CxgU", "ljuAN");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[192]] = lIIIllIIIIIlIllI("TXor33czXbg=", "VckQR");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[193]] = lIIIllIIIIIlIllI("GZu41mjQje8=", "gqhRu");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[194]] = lIIIllIIIIIllIlI("UEx3", "poWyI");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[195]] = lIIIllIIIIIlIlIl("yW3HonN5TRSuNdyX5wwX4A==", "xPmRP");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[196]] = lIIIllIIIIIllIlI("IRoiNi0jBjcNMTY=", "FhCRD");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[197]] = lIIIllIIIIIllIlI("HTEk", "zCQFW");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[198]] = lIIIllIIIIIlIllI("qnfiC+nrzPE=", "YseuC");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[199]] = lIIIllIIIIIlIllI("wCTGkT5AkAc=", "tzrpe");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[200]] = lIIIllIIIIIllIlI("Z3hp", "DXJxg");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[201]] = lIIIllIIIIIlIlIl("qtp9sjGwVkI=", "vJTES");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[202]] = lIIIllIIIIIlIllI("a5OH/ooWtOc=", "OTGFe");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[203]] = lIIIllIIIIIllIlI("KRAb", "KbrHB");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[204]] = lIIIllIIIIIlIllI("sIgFuQOaBqk=", "SZsyM");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[205]] = lIIIllIIIIIlIllI("UKFlJMOzHxM=", "HoKgp");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[206]] = lIIIllIIIIIllIlI("Ei4x", "aEDAm");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[207]] = lIIIllIIIIIllIlI("Hx0ZEB0L", "YQVGX");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[208]] = lIIIllIIIIIlIlIl("/rl0HMT1vH4=", "MIxCQ");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[209]] = lIIIllIIIIIlIlIl("882SsdlMSf8=", "HVGkS");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[210]] = lIIIllIIIIIlIllI("+lBNB9s4/bw=", "jNxfB");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[211]] = lIIIllIIIIIlIlIl("/EtkEyCSrf8=", "MKSsv");
            EnumBannerPattern.llIIlIIIlllIIl[EnumBannerPattern.llIIlllIIlllII[212]] = lIIIllIIIIIllIlI("ATcz", "lXYzV");
        }
        
        public String[] getCraftingLayers() {
            return this.craftingLayers;
        }
        
        private EnumBannerPattern(final String llllllllllllIllIlllllIIIIIllllIl, final int llllllllllllIllIlllllIIIIIllllII, final String llllllllllllIllIlllllIIIIIlllIll, final String llllllllllllIllIlllllIIIIlIIIIII, final ItemStack llllllllllllIllIlllllIIIIIlllIIl) {
            this(llllllllllllIllIlllllIIIIIllllIl, llllllllllllIllIlllllIIIIIllllII, llllllllllllIllIlllllIIIIIlllIll, llllllllllllIllIlllllIIIIlIIIIII);
            this.patternCraftingStack = llllllllllllIllIlllllIIIIIlllIIl;
        }
        
        private static String lIIIllIIIIIllIlI(String llllllllllllIllIllllIllllllIIIII, final String llllllllllllIllIllllIlllllIlllll) {
            llllllllllllIllIllllIllllllIIIII = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllllIllllllIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllllIllllllIIIll = new StringBuilder();
            final char[] llllllllllllIllIllllIllllllIIIlI = llllllllllllIllIllllIlllllIlllll.toCharArray();
            int llllllllllllIllIllllIllllllIIIIl = EnumBannerPattern.llIIlllIIlllII[0];
            final short llllllllllllIllIllllIlllllIllIll = (Object)((String)llllllllllllIllIllllIllllllIIIII).toCharArray();
            final long llllllllllllIllIllllIlllllIllIlI = llllllllllllIllIllllIlllllIllIll.length;
            Exception llllllllllllIllIllllIlllllIllIIl = (Exception)EnumBannerPattern.llIIlllIIlllII[0];
            while (lIIIlllllIIIlIIl((int)llllllllllllIllIllllIlllllIllIIl, (int)llllllllllllIllIllllIlllllIllIlI)) {
                final char llllllllllllIllIllllIllllllIIllI = llllllllllllIllIllllIlllllIllIll[llllllllllllIllIllllIlllllIllIIl];
                llllllllllllIllIllllIllllllIIIll.append((char)(llllllllllllIllIllllIllllllIIllI ^ llllllllllllIllIllllIllllllIIIlI[llllllllllllIllIllllIllllllIIIIl % llllllllllllIllIllllIllllllIIIlI.length]));
                "".length();
                ++llllllllllllIllIllllIllllllIIIIl;
                ++llllllllllllIllIllllIlllllIllIIl;
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllllIllllllIIIll);
        }
        
        public boolean hasValidCrafting() {
            if (lIIIlllllIIIIlII(this.patternCraftingStack) && lIIIlllllIIIIlII(this.craftingLayers[EnumBannerPattern.llIIlllIIlllII[0]])) {
                return EnumBannerPattern.llIIlllIIlllII[0] != 0;
            }
            return EnumBannerPattern.llIIlllIIlllII[1] != 0;
        }
        
        private static String lIIIllIIIIIlIlIl(final String llllllllllllIllIllllIlllllllIIll, final String llllllllllllIllIllllIlllllllIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIllllIllllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIlllllllIIlI.getBytes(StandardCharsets.UTF_8)), EnumBannerPattern.llIIlllIIlllII[8]), "DES");
                final Cipher llllllllllllIllIllllIlllllllIlll = Cipher.getInstance("DES");
                llllllllllllIllIllllIlllllllIlll.init(EnumBannerPattern.llIIlllIIlllII[2], llllllllllllIllIllllIllllllllIII);
                return new String(llllllllllllIllIllllIlllllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIlllllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllllIlllllllIllI) {
                llllllllllllIllIllllIlllllllIllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIlllllIIIIlll(final int llllllllllllIllIllllIlllllIIlIII, final int llllllllllllIllIllllIlllllIIIlll) {
            return llllllllllllIllIllllIlllllIIlIII >= llllllllllllIllIllllIlllllIIIlll;
        }
        
        public ItemStack getCraftingStack() {
            return this.patternCraftingStack;
        }
        
        private static boolean lIIIlllllIIIlIIl(final int llllllllllllIllIllllIlllllIIIlII, final int llllllllllllIllIllllIlllllIIIIll) {
            return llllllllllllIllIllllIlllllIIIlII < llllllllllllIllIllllIlllllIIIIll;
        }
        
        public boolean hasCraftingStack() {
            if (lIIIlllllIIIIlIl(this.patternCraftingStack)) {
                return EnumBannerPattern.llIIlllIIlllII[1] != 0;
            }
            return EnumBannerPattern.llIIlllIIlllII[0] != 0;
        }
        
        public String getPatternName() {
            return this.patternName;
        }
        
        private static boolean lIIIlllllIIIIllI(final int llllllllllllIllIllllIllllIllllIl) {
            return llllllllllllIllIllllIllllIllllIl != 0;
        }
        
        private static boolean lIIIlllllIIIIlII(final Object llllllllllllIllIllllIllllIllllll) {
            return llllllllllllIllIllllIllllIllllll == null;
        }
        
        private EnumBannerPattern(final String llllllllllllIllIlllllIIIIlIIllII, final int llllllllllllIllIlllllIIIIlIIlIll, final String llllllllllllIllIlllllIIIIlIIllll, final String llllllllllllIllIlllllIIIIlIIlIIl) {
            this.craftingLayers = new String[EnumBannerPattern.llIIlllIIlllII[3]];
            this.patternName = llllllllllllIllIlllllIIIIlIIllll;
            this.patternID = llllllllllllIllIlllllIIIIlIIlIIl;
        }
        
        static {
            lIIIlllllIIIIIll();
            lIIIlllllIIIIIII();
            final EnumBannerPattern[] enum$VALUES = new EnumBannerPattern[EnumBannerPattern.llIIlllIIlllII[39]];
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[0]] = EnumBannerPattern.BASE;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[1]] = EnumBannerPattern.SQUARE_BOTTOM_LEFT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[2]] = EnumBannerPattern.SQUARE_BOTTOM_RIGHT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[3]] = EnumBannerPattern.SQUARE_TOP_LEFT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[4]] = EnumBannerPattern.SQUARE_TOP_RIGHT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[5]] = EnumBannerPattern.STRIPE_BOTTOM;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[6]] = EnumBannerPattern.STRIPE_TOP;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[7]] = EnumBannerPattern.STRIPE_LEFT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[8]] = EnumBannerPattern.STRIPE_RIGHT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[9]] = EnumBannerPattern.STRIPE_CENTER;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[10]] = EnumBannerPattern.STRIPE_MIDDLE;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[11]] = EnumBannerPattern.STRIPE_DOWNRIGHT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[12]] = EnumBannerPattern.STRIPE_DOWNLEFT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[13]] = EnumBannerPattern.STRIPE_SMALL;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[14]] = EnumBannerPattern.CROSS;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[15]] = EnumBannerPattern.STRAIGHT_CROSS;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[16]] = EnumBannerPattern.TRIANGLE_BOTTOM;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[17]] = EnumBannerPattern.TRIANGLE_TOP;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[18]] = EnumBannerPattern.TRIANGLES_BOTTOM;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[19]] = EnumBannerPattern.TRIANGLES_TOP;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[20]] = EnumBannerPattern.DIAGONAL_LEFT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[21]] = EnumBannerPattern.DIAGONAL_RIGHT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[22]] = EnumBannerPattern.DIAGONAL_LEFT_MIRROR;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[23]] = EnumBannerPattern.DIAGONAL_RIGHT_MIRROR;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[24]] = EnumBannerPattern.CIRCLE_MIDDLE;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[25]] = EnumBannerPattern.RHOMBUS_MIDDLE;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[26]] = EnumBannerPattern.HALF_VERTICAL;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[27]] = EnumBannerPattern.HALF_HORIZONTAL;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[28]] = EnumBannerPattern.HALF_VERTICAL_MIRROR;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[29]] = EnumBannerPattern.HALF_HORIZONTAL_MIRROR;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[30]] = EnumBannerPattern.BORDER;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[31]] = EnumBannerPattern.CURLY_BORDER;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[32]] = EnumBannerPattern.CREEPER;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[33]] = EnumBannerPattern.GRADIENT;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[34]] = EnumBannerPattern.GRADIENT_UP;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[35]] = EnumBannerPattern.BRICKS;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[36]] = EnumBannerPattern.SKULL;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[37]] = EnumBannerPattern.FLOWER;
            enum$VALUES[EnumBannerPattern.llIIlllIIlllII[38]] = EnumBannerPattern.MOJANG;
            ENUM$VALUES = enum$VALUES;
        }
    }
}
