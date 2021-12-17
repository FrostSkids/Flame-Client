// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.village;

import net.minecraft.nbt.NBTBase;
import java.util.Arrays;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;

public class MerchantRecipe
{
    private static final /* synthetic */ int[] lllIIIlllIlllI;
    private /* synthetic */ ItemStack itemToSell;
    private /* synthetic */ boolean rewardsExp;
    private /* synthetic */ int maxTradeUses;
    private static final /* synthetic */ String[] lllIIIlllIIIll;
    private /* synthetic */ ItemStack secondItemToBuy;
    private /* synthetic */ int toolUses;
    private /* synthetic */ ItemStack itemToBuy;
    
    public void readFromTags(final NBTTagCompound llllllllllllIlIllllllIlIIIlllIIl) {
        final NBTTagCompound llllllllllllIlIllllllIlIIIllllII = llllllllllllIlIllllllIlIIIlllIIl.getCompoundTag(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[0]]);
        this.itemToBuy = ItemStack.loadItemStackFromNBT(llllllllllllIlIllllllIlIIIllllII);
        final NBTTagCompound llllllllllllIlIllllllIlIIIlllIll = llllllllllllIlIllllllIlIIIlllIIl.getCompoundTag(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[2]]);
        this.itemToSell = ItemStack.loadItemStackFromNBT(llllllllllllIlIllllllIlIIIlllIll);
        if (lIIllllIIlIlIlll(llllllllllllIlIllllllIlIIIlllIIl.hasKey(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[3]], MerchantRecipe.lllIIIlllIlllI[4]) ? 1 : 0)) {
            this.secondItemToBuy = ItemStack.loadItemStackFromNBT(llllllllllllIlIllllllIlIIIlllIIl.getCompoundTag(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[5]]));
        }
        if (lIIllllIIlIlIlll(llllllllllllIlIllllllIlIIIlllIIl.hasKey(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[6]], MerchantRecipe.lllIIIlllIlllI[7]) ? 1 : 0)) {
            this.toolUses = llllllllllllIlIllllllIlIIIlllIIl.getInteger(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[8]]);
        }
        if (lIIllllIIlIlIlll(llllllllllllIlIllllllIlIIIlllIIl.hasKey(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[9]], MerchantRecipe.lllIIIlllIlllI[7]) ? 1 : 0)) {
            this.maxTradeUses = llllllllllllIlIllllllIlIIIlllIIl.getInteger(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[1]]);
            "".length();
            if (((179 + 65 - 133 + 69 ^ 21 + 12 + 13 + 141) & (56 + 59 - 48 + 109 ^ 28 + 187 - 187 + 163 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.maxTradeUses = MerchantRecipe.lllIIIlllIlllI[1];
        }
        if (lIIllllIIlIlIlll(llllllllllllIlIllllllIlIIIlllIIl.hasKey(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[10]], MerchantRecipe.lllIIIlllIlllI[2]) ? 1 : 0)) {
            this.rewardsExp = llllllllllllIlIllllllIlIIIlllIIl.getBoolean(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[11]]);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            this.rewardsExp = (MerchantRecipe.lllIIIlllIlllI[2] != 0);
        }
    }
    
    private static String lIIllllIIIlllllI(final String llllllllllllIlIllllllIlIIIlIlIIl, final String llllllllllllIlIllllllIlIIIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIlIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIlIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllllIlIIIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllllIlIIIlIlIll.init(MerchantRecipe.lllIIIlllIlllI[3], llllllllllllIlIllllllIlIIIlIllII);
            return new String(llllllllllllIlIllllllIlIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIlIIIlIlIlI) {
            llllllllllllIlIllllllIlIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllIIlIIIIII(String llllllllllllIlIllllllIlIIIIIIlll, final String llllllllllllIlIllllllIlIIIIIIllI) {
        llllllllllllIlIllllllIlIIIIIIlll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllllIlIIIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllllIlIIIIIlIlI = new StringBuilder();
        final char[] llllllllllllIlIllllllIlIIIIIlIIl = llllllllllllIlIllllllIlIIIIIIllI.toCharArray();
        int llllllllllllIlIllllllIlIIIIIlIII = MerchantRecipe.lllIIIlllIlllI[0];
        final short llllllllllllIlIllllllIlIIIIIIIlI = (Object)((String)llllllllllllIlIllllllIlIIIIIIlll).toCharArray();
        final double llllllllllllIlIllllllIlIIIIIIIIl = llllllllllllIlIllllllIlIIIIIIIlI.length;
        short llllllllllllIlIllllllIlIIIIIIIII = (short)MerchantRecipe.lllIIIlllIlllI[0];
        while (lIIllllIIlIllIII(llllllllllllIlIllllllIlIIIIIIIII, (int)llllllllllllIlIllllllIlIIIIIIIIl)) {
            final char llllllllllllIlIllllllIlIIIIIllIl = llllllllllllIlIllllllIlIIIIIIIlI[llllllllllllIlIllllllIlIIIIIIIII];
            llllllllllllIlIllllllIlIIIIIlIlI.append((char)(llllllllllllIlIllllllIlIIIIIllIl ^ llllllllllllIlIllllllIlIIIIIlIIl[llllllllllllIlIllllllIlIIIIIlIII % llllllllllllIlIllllllIlIIIIIlIIl.length]));
            "".length();
            ++llllllllllllIlIllllllIlIIIIIlIII;
            ++llllllllllllIlIllllllIlIIIIIIIII;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllllIlIIIIIlIlI);
    }
    
    public MerchantRecipe(final ItemStack llllllllllllIlIllllllIlIIllIlIll, final Item llllllllllllIlIllllllIlIIllIIlll) {
        this(llllllllllllIlIllllllIlIIllIlIll, new ItemStack(llllllllllllIlIllllllIlIIllIIlll));
    }
    
    public ItemStack getItemToBuy() {
        return this.itemToBuy;
    }
    
    public MerchantRecipe(final ItemStack llllllllllllIlIllllllIlIIlllllIl, final ItemStack llllllllllllIlIllllllIlIlIIIIIlI, final ItemStack llllllllllllIlIllllllIlIlIIIIIIl, final int llllllllllllIlIllllllIlIlIIIIIII, final int llllllllllllIlIllllllIlIIlllllll) {
        this.itemToBuy = llllllllllllIlIllllllIlIIlllllIl;
        this.secondItemToBuy = llllllllllllIlIllllllIlIlIIIIIlI;
        this.itemToSell = llllllllllllIlIllllllIlIlIIIIIIl;
        this.toolUses = llllllllllllIlIllllllIlIlIIIIIII;
        this.maxTradeUses = llllllllllllIlIllllllIlIIlllllll;
        this.rewardsExp = (MerchantRecipe.lllIIIlllIlllI[2] != 0);
    }
    
    public MerchantRecipe(final ItemStack llllllllllllIlIllllllIlIIlllIlII, final ItemStack llllllllllllIlIllllllIlIIlllIIll) {
        this(llllllllllllIlIllllllIlIIlllIlII, null, llllllllllllIlIllllllIlIIlllIIll);
    }
    
    private static void lIIllllIIlIlIlII() {
        (lllIIIlllIlllI = new int[18])[0] = ((223 + 186 - 266 + 93 ^ 16 + 168 - 175 + 160) & (196 + 197 - 312 + 171 ^ 145 + 17 - 83 + 106 ^ -" ".length()));
        MerchantRecipe.lllIIIlllIlllI[1] = (0xFD ^ 0xC0 ^ (0x94 ^ 0xAE));
        MerchantRecipe.lllIIIlllIlllI[2] = " ".length();
        MerchantRecipe.lllIIIlllIlllI[3] = "  ".length();
        MerchantRecipe.lllIIIlllIlllI[4] = (0xC ^ 0x6B ^ (0xFE ^ 0x93));
        MerchantRecipe.lllIIIlllIlllI[5] = "   ".length();
        MerchantRecipe.lllIIIlllIlllI[6] = (78 + 109 - 150 + 106 ^ 40 + 79 - 87 + 107);
        MerchantRecipe.lllIIIlllIlllI[7] = (0x45 ^ 0x26);
        MerchantRecipe.lllIIIlllIlllI[8] = (0x4E ^ 0xA ^ (0xC8 ^ 0x89));
        MerchantRecipe.lllIIIlllIlllI[9] = (0x7B ^ 0x7D);
        MerchantRecipe.lllIIIlllIlllI[10] = (70 + 29 + 23 + 17 ^ 52 + 91 - 81 + 69);
        MerchantRecipe.lllIIIlllIlllI[11] = (0x98 ^ 0x91);
        MerchantRecipe.lllIIIlllIlllI[12] = (0x7B ^ 0x70);
        MerchantRecipe.lllIIIlllIlllI[13] = (59 + 155 - 60 + 24 ^ 136 + 118 - 183 + 119);
        MerchantRecipe.lllIIIlllIlllI[14] = (63 + 129 - 181 + 163 ^ 95 + 76 - 37 + 29);
        MerchantRecipe.lllIIIlllIlllI[15] = (0x95 ^ 0x9B);
        MerchantRecipe.lllIIIlllIlllI[16] = (0x38 ^ 0x16 ^ (0x14 ^ 0x35));
        MerchantRecipe.lllIIIlllIlllI[17] = (0x64 ^ 0x74);
    }
    
    public MerchantRecipe(final NBTTagCompound llllllllllllIlIllllllIlIlIIllIIl) {
        this.readFromTags(llllllllllllIlIllllllIlIlIIllIIl);
    }
    
    public boolean isRecipeDisabled() {
        if (lIIllllIIlIlIllI(this.toolUses, this.maxTradeUses)) {
            return MerchantRecipe.lllIIIlllIlllI[2] != 0;
        }
        return MerchantRecipe.lllIIIlllIlllI[0] != 0;
    }
    
    private static String lIIllllIIIlllIlI(final String llllllllllllIlIllllllIlIIIIllIlI, final String llllllllllllIlIllllllIlIIIIllIll) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIlIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIlIIIIllIll.getBytes(StandardCharsets.UTF_8)), MerchantRecipe.lllIIIlllIlllI[10]), "DES");
            final Cipher llllllllllllIlIllllllIlIIIIllllI = Cipher.getInstance("DES");
            llllllllllllIlIllllllIlIIIIllllI.init(MerchantRecipe.lllIIIlllIlllI[3], llllllllllllIlIllllllIlIIIIlllll);
            return new String(llllllllllllIlIllllllIlIIIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIlIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIlIIIIlllIl) {
            llllllllllllIlIllllllIlIIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    public ItemStack getItemToSell() {
        return this.itemToSell;
    }
    
    public void incrementToolUses() {
        this.toolUses += MerchantRecipe.lllIIIlllIlllI[2];
    }
    
    static {
        lIIllllIIlIlIlII();
        lIIllllIIlIIllll();
    }
    
    public boolean hasSecondItemToBuy() {
        if (lIIllllIIlIlIlIl(this.secondItemToBuy)) {
            return MerchantRecipe.lllIIIlllIlllI[2] != 0;
        }
        return MerchantRecipe.lllIIIlllIlllI[0] != 0;
    }
    
    private static boolean lIIllllIIlIlIllI(final int llllllllllllIlIllllllIIlllllllII, final int llllllllllllIlIllllllIIllllllIll) {
        return llllllllllllIlIllllllIIlllllllII >= llllllllllllIlIllllllIIllllllIll;
    }
    
    private static boolean lIIllllIIlIllIII(final int llllllllllllIlIllllllIIllllllIII, final int llllllllllllIlIllllllIIlllllIlll) {
        return llllllllllllIlIllllllIIllllllIII < llllllllllllIlIllllllIIlllllIlll;
    }
    
    public MerchantRecipe(final ItemStack llllllllllllIlIllllllIlIlIIlIIIl, final ItemStack llllllllllllIlIllllllIlIlIIlIIII, final ItemStack llllllllllllIlIllllllIlIlIIIllll) {
        this(llllllllllllIlIllllllIlIlIIlIIIl, llllllllllllIlIllllllIlIlIIlIIII, llllllllllllIlIllllllIlIlIIIllll, MerchantRecipe.lllIIIlllIlllI[0], MerchantRecipe.lllIIIlllIlllI[1]);
    }
    
    public int getToolUses() {
        return this.toolUses;
    }
    
    private static void lIIllllIIlIIllll() {
        (lllIIIlllIIIll = new String[MerchantRecipe.lllIIIlllIlllI[17]])[MerchantRecipe.lllIIIlllIlllI[0]] = lIIllllIIIlllIlI("JKjGnxa0Tkw=", "TFeBx");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[2]] = lIIllllIIIlllIlI("dpzFOHoLikY=", "IGyOo");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[3]] = lIIllllIIIlllIlI("n72ziYDoKwE=", "QAZHb");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[5]] = lIIllllIIIlllIlI("RS3O4qyE44Y=", "VGrHO");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[6]] = lIIllllIIIlllIlI("Hf+BmVpG02g=", "UpEfP");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[8]] = lIIllllIIIlllIlI("w1tQxOuIQyo=", "tKOZL");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[9]] = lIIllllIIIlllllI("EqnuXT8mD7w=", "qMpnc");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[1]] = lIIllllIIlIIIIII("JDMeOT0sIQ==", "IRflN");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[10]] = lIIllllIIIlllIlI("bVAPN4HhqxBOaGFSeLoa9Q==", "jpBnn");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[11]] = lIIllllIIIlllIlI("YBf4RmYKvyKlt0QBcmxNKg==", "CtPdd");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[4]] = lIIllllIIlIIIIII("Mww4", "QyAgA");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[12]] = lIIllllIIIlllllI("VdPAHsUZGrE=", "KuMsT");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[13]] = lIIllllIIIlllllI("NmNniw6CEnw=", "DBvXF");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[14]] = lIIllllIIIlllllI("dAXzTqMOJTM=", "AyACE");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[15]] = lIIllllIIIlllllI("B7EWgyRJoLQ=", "aiEoW");
        MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[16]] = lIIllllIIlIIIIII("Iy8bDDk1DxQd", "QJlmK");
    }
    
    private static boolean lIIllllIIlIlIlll(final int llllllllllllIlIllllllIIlllllIIll) {
        return llllllllllllIlIllllllIIlllllIIll != 0;
    }
    
    public int getMaxTradeUses() {
        return this.maxTradeUses;
    }
    
    public NBTTagCompound writeToTags() {
        final NBTTagCompound llllllllllllIlIllllllIlIIIllIIll = new NBTTagCompound();
        llllllllllllIlIllllllIlIIIllIIll.setTag(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[4]], this.itemToBuy.writeToNBT(new NBTTagCompound()));
        llllllllllllIlIllllllIlIIIllIIll.setTag(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[12]], this.itemToSell.writeToNBT(new NBTTagCompound()));
        if (lIIllllIIlIlIlIl(this.secondItemToBuy)) {
            llllllllllllIlIllllllIlIIIllIIll.setTag(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[13]], this.secondItemToBuy.writeToNBT(new NBTTagCompound()));
        }
        llllllllllllIlIllllllIlIIIllIIll.setInteger(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[14]], this.toolUses);
        llllllllllllIlIllllllIlIIIllIIll.setInteger(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[15]], this.maxTradeUses);
        llllllllllllIlIllllllIlIIIllIIll.setBoolean(MerchantRecipe.lllIIIlllIIIll[MerchantRecipe.lllIIIlllIlllI[16]], this.rewardsExp);
        return llllllllllllIlIllllllIlIIIllIIll;
    }
    
    public void compensateToolUses() {
        this.toolUses = this.maxTradeUses;
    }
    
    public boolean getRewardsExp() {
        return this.rewardsExp;
    }
    
    public void increaseMaxTradeUses(final int llllllllllllIlIllllllIlIIlIIllII) {
        this.maxTradeUses += llllllllllllIlIllllllIlIIlIIllII;
    }
    
    public ItemStack getSecondItemToBuy() {
        return this.secondItemToBuy;
    }
    
    private static boolean lIIllllIIlIlIlIl(final Object llllllllllllIlIllllllIIlllllIlIl) {
        return llllllllllllIlIllllllIIlllllIlIl != null;
    }
}
