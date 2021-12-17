// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.Item;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.util.IJsonSerializable;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.item.ItemStack;

public class Achievement extends StatBase
{
    private /* synthetic */ boolean isSpecial;
    public final /* synthetic */ int displayRow;
    private /* synthetic */ IStatStringFormat statStringFormatter;
    public final /* synthetic */ int displayColumn;
    public final /* synthetic */ ItemStack theItemStack;
    private static final /* synthetic */ int[] lIlllIlllIIIIl;
    private static final /* synthetic */ String[] lIlllIlIlllIIl;
    public final /* synthetic */ Achievement parentAchievement;
    private final /* synthetic */ String achievementDescription;
    
    public Achievement(final String llllllllllllIllllIllIllllIIIlIlI, final String llllllllllllIllllIllIllllIIlIIII, final int llllllllllllIllllIllIllllIIIlIII, final int llllllllllllIllllIllIllllIIIIlll, final ItemStack llllllllllllIllllIllIllllIIIllIl, final Achievement llllllllllllIllllIllIllllIIIIlIl) {
        super(llllllllllllIllllIllIllllIIIlIlI, new ChatComponentTranslation(String.valueOf(new StringBuilder(Achievement.lIlllIlIlllIIl[Achievement.lIlllIlllIIIIl[0]]).append(llllllllllllIllllIllIllllIIlIIII)), new Object[Achievement.lIlllIlllIIIIl[0]]));
        this.theItemStack = llllllllllllIllllIllIllllIIIllIl;
        this.achievementDescription = String.valueOf(new StringBuilder(Achievement.lIlllIlIlllIIl[Achievement.lIlllIlllIIIIl[1]]).append(llllllllllllIllllIllIllllIIlIIII).append(Achievement.lIlllIlIlllIIl[Achievement.lIlllIlllIIIIl[2]]));
        this.displayColumn = llllllllllllIllllIllIllllIIIlIII;
        this.displayRow = llllllllllllIllllIllIllllIIIIlll;
        if (lIIIIIllIllIIlII(llllllllllllIllllIllIllllIIIlIII, AchievementList.minDisplayColumn)) {
            AchievementList.minDisplayColumn = llllllllllllIllllIllIllllIIIlIII;
        }
        if (lIIIIIllIllIIlII(llllllllllllIllllIllIllllIIIIlll, AchievementList.minDisplayRow)) {
            AchievementList.minDisplayRow = llllllllllllIllllIllIllllIIIIlll;
        }
        if (lIIIIIllIllIIlIl(llllllllllllIllllIllIllllIIIlIII, AchievementList.maxDisplayColumn)) {
            AchievementList.maxDisplayColumn = llllllllllllIllllIllIllllIIIlIII;
        }
        if (lIIIIIllIllIIlIl(llllllllllllIllllIllIllllIIIIlll, AchievementList.maxDisplayRow)) {
            AchievementList.maxDisplayRow = llllllllllllIllllIllIllllIIIIlll;
        }
        this.parentAchievement = llllllllllllIllllIllIllllIIIIlIl;
    }
    
    public Achievement setStatStringFormatter(final IStatStringFormat llllllllllllIllllIllIlllIllIIIlI) {
        this.statStringFormatter = llllllllllllIllllIllIlllIllIIIlI;
        return this;
    }
    
    private static boolean lIIIIIllIllIIlIl(final int llllllllllllIllllIllIlllIIIIIlII, final int llllllllllllIllllIllIlllIIIIIIll) {
        return llllllllllllIllllIllIlllIIIIIlII > llllllllllllIllllIllIlllIIIIIIll;
    }
    
    @Override
    public Achievement func_150953_b(final Class<? extends IJsonSerializable> llllllllllllIllllIllIlllIllIlllI) {
        return (Achievement)super.func_150953_b(llllllllllllIllllIllIlllIllIlllI);
    }
    
    @Override
    public Achievement registerStat() {
        super.registerStat();
        "".length();
        AchievementList.achievementList.add(this);
        "".length();
        return this;
    }
    
    public String getDescription() {
        String s;
        if (lIIIIIllIllIIlll(this.statStringFormatter)) {
            s = this.statStringFormatter.formatString(StatCollector.translateToLocal(this.achievementDescription));
            "".length();
            if ((0xA ^ 0xE) != (0x29 ^ 0x2D)) {
                return null;
            }
        }
        else {
            s = StatCollector.translateToLocal(this.achievementDescription);
        }
        return s;
    }
    
    private static boolean lIIIIIllIllIIlll(final Object llllllllllllIllllIllIlllIIIIIIIl) {
        return llllllllllllIllllIllIlllIIIIIIIl != null;
    }
    
    private static boolean lIIIIIllIllIIllI(final int llllllllllllIllllIllIllIllllllll) {
        return llllllllllllIllllIllIllIllllllll != 0;
    }
    
    @Override
    public IChatComponent getStatName() {
        final IChatComponent llllllllllllIllllIllIlllIlllIlll = super.getStatName();
        final ChatStyle chatStyle = llllllllllllIllllIllIlllIlllIlll.getChatStyle();
        EnumChatFormatting color;
        if (lIIIIIllIllIIllI(this.getSpecial() ? 1 : 0)) {
            color = EnumChatFormatting.DARK_PURPLE;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            color = EnumChatFormatting.GREEN;
        }
        chatStyle.setColor(color);
        "".length();
        return llllllllllllIllllIllIlllIlllIlll;
    }
    
    @Override
    public Achievement initIndependentStat() {
        this.isIndependent = (Achievement.lIlllIlllIIIIl[1] != 0);
        return this;
    }
    
    @Override
    public boolean isAchievement() {
        return Achievement.lIlllIlllIIIIl[1] != 0;
    }
    
    private static boolean lIIIIIllIllIIlII(final int llllllllllllIllllIllIlllIIIIlIII, final int llllllllllllIllllIllIlllIIIIIlll) {
        return llllllllllllIllllIllIlllIIIIlIII < llllllllllllIllllIllIlllIIIIIlll;
    }
    
    private static void lIIIIIlIllllIIlI() {
        (lIlllIlIlllIIl = new String[Achievement.lIlllIlllIIIIl[3]])[Achievement.lIlllIlllIIIIl[0]] = lIIIIIlIllllIIII("YnOV2rRsOFCROZHS0WWcUQ==", "tCNaV");
        Achievement.lIlllIlIlllIIl[Achievement.lIlllIlllIIIIl[1]] = lIIIIIlIllllIIII("W+JB14lPGrcg6fzN9L5GiQ==", "ZTezo");
        Achievement.lIlllIlIlllIIl[Achievement.lIlllIlllIIIIl[2]] = lIIIIIlIllllIIIl("fxUgPDc=", "QqEOT");
    }
    
    public boolean getSpecial() {
        return this.isSpecial;
    }
    
    static {
        lIIIIIllIllIIIll();
        lIIIIIlIllllIIlI();
    }
    
    public Achievement(final String llllllllllllIllllIllIllllIllIlII, final String llllllllllllIllllIllIllllIlllIlI, final int llllllllllllIllllIllIllllIllIIlI, final int llllllllllllIllllIllIllllIllIIIl, final Item llllllllllllIllllIllIllllIllIlll, final Achievement llllllllllllIllllIllIllllIlIllll) {
        this(llllllllllllIllllIllIllllIllIlII, llllllllllllIllllIllIllllIlllIlI, llllllllllllIllllIllIllllIllIIlI, llllllllllllIllllIllIllllIllIIIl, new ItemStack(llllllllllllIllllIllIllllIllIlll), llllllllllllIllllIllIllllIlIllll);
    }
    
    private static String lIIIIIlIllllIIIl(String llllllllllllIllllIllIlllIIlIlllI, final String llllllllllllIllllIllIlllIIlIllII) {
        llllllllllllIllllIllIlllIIlIlllI = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIllIlllIIlIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllIlllIIllIIll = new StringBuilder();
        final char[] llllllllllllIllllIllIlllIIllIIIl = llllllllllllIllllIllIlllIIlIllII.toCharArray();
        int llllllllllllIllllIllIlllIIllIIII = Achievement.lIlllIlllIIIIl[0];
        final Exception llllllllllllIllllIllIlllIIlIIllI = (Object)((String)llllllllllllIllllIllIlllIIlIlllI).toCharArray();
        final double llllllllllllIllllIllIlllIIlIIlII = llllllllllllIllllIllIlllIIlIIllI.length;
        byte llllllllllllIllllIllIlllIIlIIIlI = (byte)Achievement.lIlllIlllIIIIl[0];
        while (lIIIIIllIllIIlII(llllllllllllIllllIllIlllIIlIIIlI, (int)llllllllllllIllllIllIlllIIlIIlII)) {
            final char llllllllllllIllllIllIlllIIllIllI = llllllllllllIllllIllIlllIIlIIllI[llllllllllllIllllIllIlllIIlIIIlI];
            llllllllllllIllllIllIlllIIllIIll.append((char)(llllllllllllIllllIllIlllIIllIllI ^ llllllllllllIllllIllIlllIIllIIIl[llllllllllllIllllIllIlllIIllIIII % llllllllllllIllllIllIlllIIllIIIl.length]));
            "".length();
            ++llllllllllllIllllIllIlllIIllIIII;
            ++llllllllllllIllllIllIlllIIlIIIlI;
            "".length();
            if (-" ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllIlllIIllIIll);
    }
    
    public Achievement setSpecial() {
        this.isSpecial = (Achievement.lIlllIlllIIIIl[1] != 0);
        return this;
    }
    
    public Achievement(final String llllllllllllIllllIllIllllIlIIllI, final String llllllllllllIllllIllIllllIIllllI, final int llllllllllllIllllIllIllllIIlllIl, final int llllllllllllIllllIllIllllIlIIIll, final Block llllllllllllIllllIllIllllIlIIIlI, final Achievement llllllllllllIllllIllIllllIlIIIIl) {
        this(llllllllllllIllllIllIllllIlIIllI, llllllllllllIllllIllIllllIIllllI, llllllllllllIllllIllIllllIIlllIl, llllllllllllIllllIllIllllIlIIIll, new ItemStack(llllllllllllIllllIllIllllIlIIIlI), llllllllllllIllllIllIllllIlIIIIl);
    }
    
    private static String lIIIIIlIllllIIII(final String llllllllllllIllllIllIlllIIIIlllI, final String llllllllllllIllllIllIlllIIIIllll) {
        try {
            final SecretKeySpec llllllllllllIllllIllIlllIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIlllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIlllIIIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIlllIIIlIIlI.init(Achievement.lIlllIlllIIIIl[2], llllllllllllIllllIllIlllIIIlIIll);
            return new String(llllllllllllIllllIllIlllIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIlllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIlllIIIlIIIl) {
            llllllllllllIllllIllIlllIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIllIllIIIll() {
        (lIlllIlllIIIIl = new int[4])[0] = ((0xA8 ^ 0xB0 ^ (0xF4 ^ 0xC4)) & (0xC0 ^ 0x9F ^ (0x78 ^ 0xF) ^ -" ".length()));
        Achievement.lIlllIlllIIIIl[1] = " ".length();
        Achievement.lIlllIlllIIIIl[2] = "  ".length();
        Achievement.lIlllIlllIIIIl[3] = "   ".length();
    }
}
