// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;

public enum EnumDyeColor implements IStringSerializable
{
    private static final /* synthetic */ String[] lIllllIIlIIlII;
    
    RED(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[42]], EnumDyeColor.lIllllIIlIllIl[5], EnumDyeColor.lIllllIIlIllIl[5], EnumDyeColor.lIllllIIlIllIl[2], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[43]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[44]], MapColor.redColor, EnumChatFormatting.DARK_RED);
    
    private final /* synthetic */ int meta;
    private static final /* synthetic */ EnumDyeColor[] META_LOOKUP;
    private final /* synthetic */ String name;
    
    GREEN(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[39]], EnumDyeColor.lIllllIIlIllIl[9], EnumDyeColor.lIllllIIlIllIl[9], EnumDyeColor.lIllllIIlIllIl[3], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[40]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[41]], MapColor.greenColor, EnumChatFormatting.DARK_GREEN), 
    SILVER(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[24]], EnumDyeColor.lIllllIIlIllIl[11], EnumDyeColor.lIllllIIlIllIl[11], EnumDyeColor.lIllllIIlIllIl[10], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[25]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[26]], MapColor.silverColor, EnumChatFormatting.GRAY), 
    ORANGE(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[4]], EnumDyeColor.lIllllIIlIllIl[2], EnumDyeColor.lIllllIIlIllIl[2], EnumDyeColor.lIllllIIlIllIl[5], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[6]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[7]], MapColor.adobeColor, EnumChatFormatting.GOLD);
    
    private static final /* synthetic */ EnumDyeColor[] DYE_DMG_LOOKUP;
    
    PURPLE(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[30]], EnumDyeColor.lIllllIIlIllIl[14], EnumDyeColor.lIllllIIlIllIl[14], EnumDyeColor.lIllllIIlIllIl[7], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[31]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[32]], MapColor.purpleColor, EnumChatFormatting.DARK_PURPLE), 
    GRAY(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[21]], EnumDyeColor.lIllllIIlIllIl[10], EnumDyeColor.lIllllIIlIllIl[10], EnumDyeColor.lIllllIIlIllIl[11], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[22]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[23]], MapColor.grayColor, EnumChatFormatting.DARK_GRAY), 
    PINK(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[18]], EnumDyeColor.lIllllIIlIllIl[8], EnumDyeColor.lIllllIIlIllIl[8], EnumDyeColor.lIllllIIlIllIl[12], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[19]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[20]], MapColor.pinkColor, EnumChatFormatting.LIGHT_PURPLE);
    
    private final /* synthetic */ MapColor mapColor;
    
    LIME(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[1]], EnumDyeColor.lIllllIIlIllIl[7], EnumDyeColor.lIllllIIlIllIl[7], EnumDyeColor.lIllllIIlIllIl[14], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[16]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[17]], MapColor.limeColor, EnumChatFormatting.GREEN), 
    BROWN(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[36]], EnumDyeColor.lIllllIIlIllIl[13], EnumDyeColor.lIllllIIlIllIl[13], EnumDyeColor.lIllllIIlIllIl[4], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[37]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[38]], MapColor.brownColor, EnumChatFormatting.GOLD);
    
    private final /* synthetic */ int dyeDamage;
    
    WHITE(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[0]], EnumDyeColor.lIllllIIlIllIl[0], EnumDyeColor.lIllllIIlIllIl[0], EnumDyeColor.lIllllIIlIllIl[1], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[2]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[3]], MapColor.snowColor, EnumChatFormatting.WHITE), 
    CYAN(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[27]], EnumDyeColor.lIllllIIlIllIl[12], EnumDyeColor.lIllllIIlIllIl[12], EnumDyeColor.lIllllIIlIllIl[8], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[28]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[29]], MapColor.cyanColor, EnumChatFormatting.DARK_AQUA), 
    MAGENTA(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[8]], EnumDyeColor.lIllllIIlIllIl[3], EnumDyeColor.lIllllIIlIllIl[3], EnumDyeColor.lIllllIIlIllIl[9], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[10]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[11]], MapColor.magentaColor, EnumChatFormatting.AQUA), 
    BLACK(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[45]], EnumDyeColor.lIllllIIlIllIl[1], EnumDyeColor.lIllllIIlIllIl[1], EnumDyeColor.lIllllIIlIllIl[0], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[46]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[47]], MapColor.blackColor, EnumChatFormatting.BLACK);
    
    private static final /* synthetic */ int[] lIllllIIlIllIl;
    private final /* synthetic */ String unlocalizedName;
    private final /* synthetic */ EnumChatFormatting chatColor;
    
    YELLOW(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[13]], EnumDyeColor.lIllllIIlIllIl[6], EnumDyeColor.lIllllIIlIllIl[6], EnumDyeColor.lIllllIIlIllIl[15], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[9]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[5]], MapColor.yellowColor, EnumChatFormatting.YELLOW), 
    LIGHT_BLUE(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[12]], EnumDyeColor.lIllllIIlIllIl[4], EnumDyeColor.lIllllIIlIllIl[4], EnumDyeColor.lIllllIIlIllIl[13], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[14]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[15]], MapColor.lightBlueColor, EnumChatFormatting.BLUE), 
    BLUE(EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[33]], EnumDyeColor.lIllllIIlIllIl[15], EnumDyeColor.lIllllIIlIllIl[15], EnumDyeColor.lIllllIIlIllIl[6], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[34]], EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[35]], MapColor.blueColor, EnumChatFormatting.DARK_BLUE);
    
    public int getDyeDamage() {
        return this.dyeDamage;
    }
    
    private static String lIIIIlIIIIIIllII(String llllllllllllIllllIlIlIllllIlllll, final String llllllllllllIllllIlIlIllllIllIIl) {
        llllllllllllIllllIlIlIllllIlllll = new String(Base64.getDecoder().decode(llllllllllllIllllIlIlIllllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIlIllllIlllIl = new StringBuilder();
        final char[] llllllllllllIllllIlIlIllllIlllII = llllllllllllIllllIlIlIllllIllIIl.toCharArray();
        int llllllllllllIllllIlIlIllllIllIll = EnumDyeColor.lIllllIIlIllIl[0];
        final char llllllllllllIllllIlIlIllllIlIlIl = (Object)llllllllllllIllllIlIlIllllIlllll.toCharArray();
        final String llllllllllllIllllIlIlIllllIlIlII = (String)llllllllllllIllllIlIlIllllIlIlIl.length;
        boolean llllllllllllIllllIlIlIllllIlIIll = EnumDyeColor.lIllllIIlIllIl[0] != 0;
        while (lIIIIlIIIIlIIIII(llllllllllllIllllIlIlIllllIlIIll ? 1 : 0, (int)llllllllllllIllllIlIlIllllIlIlII)) {
            final char llllllllllllIllllIlIlIlllllIIIII = llllllllllllIllllIlIlIllllIlIlIl[llllllllllllIllllIlIlIllllIlIIll];
            llllllllllllIllllIlIlIllllIlllIl.append((char)(llllllllllllIllllIlIlIlllllIIIII ^ llllllllllllIllllIlIlIllllIlllII[llllllllllllIllllIlIlIllllIllIll % llllllllllllIllllIlIlIllllIlllII.length]));
            "".length();
            ++llllllllllllIllllIlIlIllllIllIll;
            ++llllllllllllIllllIlIlIllllIlIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIlIllllIlllIl);
    }
    
    public static EnumDyeColor byDyeDamage(int llllllllllllIllllIlIlIlllllllIll) {
        if (!lIIIIlIIIIIlllll(llllllllllllIllllIlIlIlllllllIll) || lIIIIlIIIIIllllI(llllllllllllIllllIlIlIlllllllIll, EnumDyeColor.DYE_DMG_LOOKUP.length)) {
            llllllllllllIllllIlIlIlllllllIll = EnumDyeColor.lIllllIIlIllIl[0];
        }
        return EnumDyeColor.DYE_DMG_LOOKUP[llllllllllllIllllIlIlIlllllllIll];
    }
    
    private static String lIIIIlIIIIIIlIlI(final String llllllllllllIllllIlIlIlllIlllIll, final String llllllllllllIllllIlIlIlllIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIllllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIlIlllIllllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIlIlllIllllll.init(EnumDyeColor.lIllllIIlIllIl[3], llllllllllllIllllIlIlIllllIIIIII);
            return new String(llllllllllllIllllIlIlIlllIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIlllIlllllI) {
            llllllllllllIllllIlIlIlllIlllllI.printStackTrace();
            return null;
        }
    }
    
    public static EnumDyeColor byMetadata(int llllllllllllIllllIlIlIlllllllIII) {
        if (!lIIIIlIIIIIlllll(llllllllllllIllllIlIlIlllllllIII) || lIIIIlIIIIIllllI(llllllllllllIllllIlIlIlllllllIII, EnumDyeColor.META_LOOKUP.length)) {
            llllllllllllIllllIlIlIlllllllIII = EnumDyeColor.lIllllIIlIllIl[0];
        }
        return EnumDyeColor.META_LOOKUP[llllllllllllIllllIlIlIlllllllIII];
    }
    
    private static boolean lIIIIlIIIIIllllI(final int llllllllllllIllllIlIlIlllIllIlIl, final int llllllllllllIllllIlIlIlllIllIlII) {
        return llllllllllllIllllIlIlIlllIllIlIl >= llllllllllllIllllIlIlIlllIllIlII;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public int getMetadata() {
        return this.meta;
    }
    
    private static boolean lIIIIlIIIIlIIIII(final int llllllllllllIllllIlIlIlllIllIIIl, final int llllllllllllIllllIlIlIlllIllIIII) {
        return llllllllllllIllllIlIlIlllIllIIIl < llllllllllllIllllIlIlIlllIllIIII;
    }
    
    public String getUnlocalizedName() {
        return this.unlocalizedName;
    }
    
    @Override
    public String toString() {
        return this.unlocalizedName;
    }
    
    private static String lIIIIlIIIIIIllIl(final String llllllllllllIllllIlIlIllllIIlIII, final String llllllllllllIllllIlIlIllllIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIllllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), EnumDyeColor.lIllllIIlIllIl[11]), "DES");
            final Cipher llllllllllllIllllIlIlIllllIIllII = Cipher.getInstance("DES");
            llllllllllllIllllIlIlIllllIIllII.init(EnumDyeColor.lIllllIIlIllIl[3], llllllllllllIllllIlIlIllllIIllIl);
            return new String(llllllllllllIllllIlIlIllllIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIllllIIlIll) {
            llllllllllllIllllIlIlIllllIIlIll.printStackTrace();
            return null;
        }
    }
    
    private EnumDyeColor(final String llllllllllllIllllIlIllIIIIIlIIIl, final int llllllllllllIllllIlIllIIIIIlIIII, final int llllllllllllIllllIlIllIIIIIIllll, final int llllllllllllIllllIlIllIIIIIlIlll, final String llllllllllllIllllIlIllIIIIIlIllI, final String llllllllllllIllllIlIllIIIIIIllII, final MapColor llllllllllllIllllIlIllIIIIIlIlII, final EnumChatFormatting llllllllllllIllllIlIllIIIIIIlIlI) {
        this.meta = llllllllllllIllllIlIllIIIIIIllll;
        this.dyeDamage = llllllllllllIllllIlIllIIIIIlIlll;
        this.name = llllllllllllIllllIlIllIIIIIlIllI;
        this.unlocalizedName = llllllllllllIllllIlIllIIIIIIllII;
        this.mapColor = llllllllllllIllllIlIllIIIIIlIlII;
        this.chatColor = llllllllllllIllllIlIllIIIIIIlIlI;
    }
    
    private static boolean lIIIIlIIIIIlllll(final int llllllllllllIllllIlIlIlllIlIlllI) {
        return llllllllllllIllllIlIlIlllIlIlllI >= 0;
    }
    
    static {
        lIIIIlIIIIIlllIl();
        lIIIIlIIIIIllIIl();
        final EnumDyeColor[] enum$VALUES = new EnumDyeColor[EnumDyeColor.lIllllIIlIllIl[16]];
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[0]] = EnumDyeColor.WHITE;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[2]] = EnumDyeColor.ORANGE;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[3]] = EnumDyeColor.MAGENTA;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[4]] = EnumDyeColor.LIGHT_BLUE;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[6]] = EnumDyeColor.YELLOW;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[7]] = EnumDyeColor.LIME;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[8]] = EnumDyeColor.PINK;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[10]] = EnumDyeColor.GRAY;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[11]] = EnumDyeColor.SILVER;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[12]] = EnumDyeColor.CYAN;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[14]] = EnumDyeColor.PURPLE;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[15]] = EnumDyeColor.BLUE;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[13]] = EnumDyeColor.BROWN;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[9]] = EnumDyeColor.GREEN;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[5]] = EnumDyeColor.RED;
        enum$VALUES[EnumDyeColor.lIllllIIlIllIl[1]] = EnumDyeColor.BLACK;
        ENUM$VALUES = enum$VALUES;
        META_LOOKUP = new EnumDyeColor[values().length];
        DYE_DMG_LOOKUP = new EnumDyeColor[values().length];
        final double llllllllllllIllllIlIllIIIIlIIIll;
        final Exception llllllllllllIllllIlIllIIIIlIIlII = (Exception)((EnumDyeColor[])(Object)(llllllllllllIllllIlIllIIIIlIIIll = (double)(Object)values())).length;
        float llllllllllllIllllIlIllIIIIlIIlIl = EnumDyeColor.lIllllIIlIllIl[0];
        "".length();
        if (" ".length() > (0x51 ^ 0x37 ^ (0xA7 ^ 0xC5))) {
            return;
        }
        while (!lIIIIlIIIIIllllI((int)llllllllllllIllllIlIllIIIIlIIlIl, (int)llllllllllllIllllIlIllIIIIlIIlII)) {
            final EnumDyeColor llllllllllllIllllIlIllIIIIlIIlll = llllllllllllIllllIlIllIIIIlIIIll[llllllllllllIllllIlIllIIIIlIIlIl];
            EnumDyeColor.META_LOOKUP[llllllllllllIllllIlIllIIIIlIIlll.getMetadata()] = llllllllllllIllllIlIllIIIIlIIlll;
            EnumDyeColor.DYE_DMG_LOOKUP[llllllllllllIllllIlIllIIIIlIIlll.getDyeDamage()] = llllllllllllIllllIlIllIIIIlIIlll;
            ++llllllllllllIllllIlIllIIIIlIIlIl;
        }
    }
    
    private static void lIIIIlIIIIIllIIl() {
        (lIllllIIlIIlII = new String[EnumDyeColor.lIllllIIlIllIl[48]])[EnumDyeColor.lIllllIIlIllIl[0]] = lIIIIlIIIIIIlIlI("CxcrUBUot6o=", "BUYnP");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[2]] = lIIIIlIIIIIIllII("ECk6EgY=", "gASfc");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[3]] = lIIIIlIIIIIIlIlI("RucIj3c5Etc=", "fplGm");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[4]] = lIIIIlIIIIIIllII("IwAOJhYp", "lROhQ");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[6]] = lIIIIlIIIIIIlIlI("O+f25ifEl3c=", "sBRnb");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[7]] = lIIIIlIIIIIIllII("IQUmChYr", "NwGdq");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[8]] = lIIIIlIIIIIIllII("PSIhPRwkIg==", "pcfxR");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[10]] = lIIIIlIIIIIIllII("Ogc9DBojBw==", "WfZit");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[11]] = lIIIIlIIIIIIlIlI("0WDxZV+yq2o=", "KFsio");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[12]] = lIIIIlIIIIIIllII("GAALCxkLCwAWCA==", "TILCM");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[14]] = lIIIIlIIIIIIllIl("4mT1fmiFGZ+vnSUEvm7nuA==", "hQUMb");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[15]] = lIIIIlIIIIIIlIlI("qnqCkA5yhmAL6KNAk4CZZA==", "ZFBJq");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[13]] = lIIIIlIIIIIIllII("CCoFGz8G", "QoIWp");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[9]] = lIIIIlIIIIIIllII("MyQCKzw9", "JAnGS");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[5]] = lIIIIlIIIIIIlIlI("Urke9vI6hEk=", "EqeuI");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[1]] = lIIIIlIIIIIIlIlI("4v5w776uUio=", "kndfk");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[16]] = lIIIIlIIIIIIllII("HgMIDQ==", "rjehE");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[17]] = lIIIIlIIIIIIllII("LgoDKQ==", "BcnLH");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[18]] = lIIIIlIIIIIIllIl("gRBFxJOur/g=", "bhWWZ");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[19]] = lIIIIlIIIIIIllII("MzAYDw==", "CYvdq");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[20]] = lIIIIlIIIIIIllII("IwUXIQ==", "SlyJb");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[21]] = lIIIIlIIIIIIllIl("9abcKbwchJQ=", "FBWQT");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[22]] = lIIIIlIIIIIIllIl("plLtPt2pLsc=", "YKqmu");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[23]] = lIIIIlIIIIIIllII("FTwWNQ==", "rNwLk");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[24]] = lIIIIlIIIIIIllIl("HtzNWYk5sLM=", "nncnX");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[25]] = lIIIIlIIIIIIllIl("Br3FKrdD0dk=", "IiSob");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[26]] = lIIIIlIIIIIIlIlI("i07RIudEWyI=", "RpeVR");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[27]] = lIIIIlIIIIIIllIl("xO84Y7VFTRQ=", "MDOYl");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[28]] = lIIIIlIIIIIIlIlI("jym49FY+GN8=", "KXKVE");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[29]] = lIIIIlIIIIIIllIl("B6yHR6wSumM=", "PKDRG");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[30]] = lIIIIlIIIIIIllIl("kA3/uoF7d7E=", "qTcPO");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[31]] = lIIIIlIIIIIIllII("Ex89OwQG", "cjOKh");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[32]] = lIIIIlIIIIIIllIl("8NGfN30kJM8=", "mfurl");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[33]] = lIIIIlIIIIIIlIlI("xF3QKm9/Abk=", "CEIdl");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[34]] = lIIIIlIIIIIIlIlI("7GuIZeJm238=", "itAwF");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[35]] = lIIIIlIIIIIIllII("MAYiMg==", "RjWWd");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[36]] = lIIIIlIIIIIIlIlI("vvhE5t4OUVg=", "uvPwN");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[37]] = lIIIIlIIIIIIllIl("mOLJKVA5D7s=", "etsyR");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[38]] = lIIIIlIIIIIIlIlI("hHSb1nAVLZY=", "dopjm");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[39]] = lIIIIlIIIIIIllII("LxQmJi0=", "hFccc");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[40]] = lIIIIlIIIIIIllIl("AW0Y7ajMwIs=", "qVfll");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[41]] = lIIIIlIIIIIIllII("NiU2Lx4=", "QWSJp");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[42]] = lIIIIlIIIIIIlIlI("dATPqVGvxNo=", "hAqTi");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[43]] = lIIIIlIIIIIIllII("ECkP", "bLkVO");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[44]] = lIIIIlIIIIIIllIl("ULCQx5r8PRY=", "EjUNP");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[45]] = lIIIIlIIIIIIllII("NSYZNwc=", "wjXtL");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[46]] = lIIIIlIIIIIIllII("MyUAOwE=", "QIaXj");
        EnumDyeColor.lIllllIIlIIlII[EnumDyeColor.lIllllIIlIllIl[47]] = lIIIIlIIIIIIllIl("i7JXaldUNSw=", "bmegJ");
    }
    
    public MapColor getMapColor() {
        return this.mapColor;
    }
    
    private static void lIIIIlIIIIIlllIl() {
        (lIllllIIlIllIl = new int[49])[0] = ((0xEF ^ 0xA8) & ~(0x57 ^ 0x10));
        EnumDyeColor.lIllllIIlIllIl[1] = (0xCA ^ 0xB0 ^ (0x3A ^ 0x4F));
        EnumDyeColor.lIllllIIlIllIl[2] = " ".length();
        EnumDyeColor.lIllllIIlIllIl[3] = "  ".length();
        EnumDyeColor.lIllllIIlIllIl[4] = "   ".length();
        EnumDyeColor.lIllllIIlIllIl[5] = (0x71 ^ 0x7F);
        EnumDyeColor.lIllllIIlIllIl[6] = (0x38 ^ 0x21 ^ (0x3D ^ 0x20));
        EnumDyeColor.lIllllIIlIllIl[7] = (0x4D ^ 0x48);
        EnumDyeColor.lIllllIIlIllIl[8] = (0x67 ^ 0x61);
        EnumDyeColor.lIllllIIlIllIl[9] = (0xBE ^ 0xB3);
        EnumDyeColor.lIllllIIlIllIl[10] = (0xB2 ^ 0xB5);
        EnumDyeColor.lIllllIIlIllIl[11] = (0x2D ^ 0x25);
        EnumDyeColor.lIllllIIlIllIl[12] = (0xA9 ^ 0xA0);
        EnumDyeColor.lIllllIIlIllIl[13] = (92 + 118 - 78 + 9 ^ 45 + 4 - 2 + 82);
        EnumDyeColor.lIllllIIlIllIl[14] = (0xA6 ^ 0xAC);
        EnumDyeColor.lIllllIIlIllIl[15] = (0x4 ^ 0xF);
        EnumDyeColor.lIllllIIlIllIl[16] = (0x50 ^ 0x63 ^ (0x4D ^ 0x6E));
        EnumDyeColor.lIllllIIlIllIl[17] = (0x8 ^ 0x5F ^ (0x7B ^ 0x3D));
        EnumDyeColor.lIllllIIlIllIl[18] = (0x97 ^ 0x85);
        EnumDyeColor.lIllllIIlIllIl[19] = (0x3B ^ 0x28);
        EnumDyeColor.lIllllIIlIllIl[20] = (0x85 ^ 0x91);
        EnumDyeColor.lIllllIIlIllIl[21] = (0x1A ^ 0xF);
        EnumDyeColor.lIllllIIlIllIl[22] = (0xA8 ^ 0xBE);
        EnumDyeColor.lIllllIIlIllIl[23] = (0x2F ^ 0xC ^ (0x7F ^ 0x4B));
        EnumDyeColor.lIllllIIlIllIl[24] = (0x3F ^ 0x27);
        EnumDyeColor.lIllllIIlIllIl[25] = (85 + 109 - 187 + 122 ^ 138 + 117 - 207 + 104);
        EnumDyeColor.lIllllIIlIllIl[26] = (0x87 ^ 0x9D);
        EnumDyeColor.lIllllIIlIllIl[27] = (0x2F ^ 0x60 ^ (0xE3 ^ 0xB7));
        EnumDyeColor.lIllllIIlIllIl[28] = (0x6A ^ 0x76);
        EnumDyeColor.lIllllIIlIllIl[29] = (0x70 ^ 0x6D);
        EnumDyeColor.lIllllIIlIllIl[30] = (0x84 ^ 0x9A);
        EnumDyeColor.lIllllIIlIllIl[31] = (0x4B ^ 0x54);
        EnumDyeColor.lIllllIIlIllIl[32] = (0x48 ^ 0x7B ^ (0x55 ^ 0x46));
        EnumDyeColor.lIllllIIlIllIl[33] = (55 + 39 + 47 + 36 ^ 78 + 72 - 66 + 60);
        EnumDyeColor.lIllllIIlIllIl[34] = (0x53 ^ 0x6B ^ (0x5 ^ 0x1F));
        EnumDyeColor.lIllllIIlIllIl[35] = (0xB8 ^ 0x9B);
        EnumDyeColor.lIllllIIlIllIl[36] = (0x2C ^ 0x8);
        EnumDyeColor.lIllllIIlIllIl[37] = (0xBF ^ 0x9A);
        EnumDyeColor.lIllllIIlIllIl[38] = (0x5A ^ 0x7C);
        EnumDyeColor.lIllllIIlIllIl[39] = (47 + 111 - 28 + 21 ^ 42 + 11 + 107 + 16);
        EnumDyeColor.lIllllIIlIllIl[40] = (0x5B ^ 0x73);
        EnumDyeColor.lIllllIIlIllIl[41] = ("   ".length() ^ (0x2 ^ 0x28));
        EnumDyeColor.lIllllIIlIllIl[42] = (0x4F ^ 0x65);
        EnumDyeColor.lIllllIIlIllIl[43] = (137 + 90 - 145 + 68 ^ 81 + 117 - 94 + 85);
        EnumDyeColor.lIllllIIlIllIl[44] = (0xED ^ 0xC1);
        EnumDyeColor.lIllllIIlIllIl[45] = (0x50 ^ 0x7D);
        EnumDyeColor.lIllllIIlIllIl[46] = (0x71 ^ 0x5F);
        EnumDyeColor.lIllllIIlIllIl[47] = (0xB2 ^ 0x9D);
        EnumDyeColor.lIllllIIlIllIl[48] = (0xD3 ^ 0x9D ^ (0xC2 ^ 0xBC));
    }
}
