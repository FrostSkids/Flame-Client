// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityRabbit;

public class RenderRabbit extends RenderLiving<EntityRabbit>
{
    private static final /* synthetic */ ResourceLocation CAERBANNOG;
    private static final /* synthetic */ ResourceLocation WHITE;
    private static final /* synthetic */ ResourceLocation TOAST;
    private static final /* synthetic */ ResourceLocation SALT;
    private static final /* synthetic */ int[] llIlllllIlllIl;
    private static final /* synthetic */ ResourceLocation GOLD;
    private static final /* synthetic */ ResourceLocation WHITE_SPLOTCHED;
    private static final /* synthetic */ ResourceLocation BLACK;
    private static final /* synthetic */ ResourceLocation BROWN;
    private static final /* synthetic */ String[] llIlllllIllIIl;
    
    static {
        lIIllIllIlIllIII();
        lIIllIllIlIIllII();
        BROWN = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[0]]);
        WHITE = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[1]]);
        BLACK = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[2]]);
        GOLD = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[3]]);
        SALT = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[4]]);
        WHITE_SPLOTCHED = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[5]]);
        TOAST = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[6]]);
        CAERBANNOG = new ResourceLocation(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[7]]);
    }
    
    private static boolean lIIllIllIlIllIlI(final int llllllllllllIllIIIlIllIllIllllII) {
        return llllllllllllIllIIIlIllIllIllllII != 0;
    }
    
    private static String lIIllIllIlIIlIlI(final String llllllllllllIllIIIlIllIlllIIIlll, final String llllllllllllIllIIIlIllIlllIIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIllIlllIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIllIlllIIlIII.getBytes(StandardCharsets.UTF_8)), RenderRabbit.llIlllllIlllIl[8]), "DES");
            final Cipher llllllllllllIllIIIlIllIlllIIlIll = Cipher.getInstance("DES");
            llllllllllllIllIIIlIllIlllIIlIll.init(RenderRabbit.llIlllllIlllIl[2], llllllllllllIllIIIlIllIlllIIllII);
            return new String(llllllllllllIllIIIlIllIlllIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIllIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIllIlllIIlIlI) {
            llllllllllllIllIIIlIllIlllIIlIlI.printStackTrace();
            return null;
        }
    }
    
    public RenderRabbit(final RenderManager llllllllllllIllIIIlIlllIIIIIIlll, final ModelBase llllllllllllIllIIIlIlllIIIIIIIlI, final float llllllllllllIllIIIlIlllIIIIIIlIl) {
        super(llllllllllllIllIIIlIlllIIIIIIlll, llllllllllllIllIIIlIlllIIIIIIIlI, llllllllllllIllIIIlIlllIIIIIIlIl);
    }
    
    private static boolean lIIllIllIlIllIIl(final Object llllllllllllIllIIIlIllIllIlllllI) {
        return llllllllllllIllIIIlIllIllIlllllI != null;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityRabbit llllllllllllIllIIIlIllIllllllIll) {
        final String llllllllllllIllIIIlIllIlllllllII = EnumChatFormatting.getTextWithoutFormattingCodes(llllllllllllIllIIIlIllIllllllIll.getName());
        if (lIIllIllIlIllIIl(llllllllllllIllIIIlIllIlllllllII) && lIIllIllIlIllIlI(llllllllllllIllIIIlIllIlllllllII.equals(RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[8]]) ? 1 : 0)) {
            return RenderRabbit.TOAST;
        }
        switch (llllllllllllIllIIIlIllIllllllIll.getRabbitType()) {
            default: {
                return RenderRabbit.BROWN;
            }
            case 1: {
                return RenderRabbit.WHITE;
            }
            case 2: {
                return RenderRabbit.BLACK;
            }
            case 3: {
                return RenderRabbit.WHITE_SPLOTCHED;
            }
            case 4: {
                return RenderRabbit.GOLD;
            }
            case 5: {
                return RenderRabbit.SALT;
            }
            case 99: {
                return RenderRabbit.CAERBANNOG;
            }
        }
    }
    
    private static boolean lIIllIllIlIllIll(final int llllllllllllIllIIIlIllIlllIIIIIl, final int llllllllllllIllIIIlIllIlllIIIIII) {
        return llllllllllllIllIIIlIllIlllIIIIIl < llllllllllllIllIIIlIllIlllIIIIII;
    }
    
    private static void lIIllIllIlIllIII() {
        (llIlllllIlllIl = new int[10])[0] = ((0x5A ^ 0x6F ^ (0x77 ^ 0x72)) & (0x68 ^ 0xC ^ (0xFD ^ 0xA9) ^ -" ".length()));
        RenderRabbit.llIlllllIlllIl[1] = " ".length();
        RenderRabbit.llIlllllIlllIl[2] = "  ".length();
        RenderRabbit.llIlllllIlllIl[3] = "   ".length();
        RenderRabbit.llIlllllIlllIl[4] = (159 + 175 - 306 + 157 ^ 149 + 1 - 110 + 149);
        RenderRabbit.llIlllllIlllIl[5] = (0x12 ^ 0x17);
        RenderRabbit.llIlllllIlllIl[6] = (0xBA ^ 0xBC);
        RenderRabbit.llIlllllIlllIl[7] = (0xA ^ 0xD);
        RenderRabbit.llIlllllIlllIl[8] = (0x50 ^ 0x58);
        RenderRabbit.llIlllllIlllIl[9] = (0x49 ^ 0x40);
    }
    
    private static String lIIllIllIlIIlIll(final String llllllllllllIllIIIlIllIllllIlllI, final String llllllllllllIllIIIlIllIllllIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIllIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIllIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIllIlllllIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIllIlllllIIII.init(RenderRabbit.llIlllllIlllIl[2], llllllllllllIllIIIlIllIlllllIIIl);
            return new String(llllllllllllIllIIIlIllIlllllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIllIllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIllIllllIllll) {
            llllllllllllIllIIIlIllIllllIllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIllIlIIlIIl(String llllllllllllIllIIIlIllIlllIllIIl, final String llllllllllllIllIIIlIllIlllIllIII) {
        llllllllllllIllIIIlIllIlllIllIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIlIllIlllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIllIlllIlllII = new StringBuilder();
        final char[] llllllllllllIllIIIlIllIlllIllIll = llllllllllllIllIIIlIllIlllIllIII.toCharArray();
        int llllllllllllIllIIIlIllIlllIllIlI = RenderRabbit.llIlllllIlllIl[0];
        final short llllllllllllIllIIIlIllIlllIlIlII = (Object)llllllllllllIllIIIlIllIlllIllIIl.toCharArray();
        final int llllllllllllIllIIIlIllIlllIlIIll = llllllllllllIllIIIlIllIlllIlIlII.length;
        long llllllllllllIllIIIlIllIlllIlIIlI = RenderRabbit.llIlllllIlllIl[0];
        while (lIIllIllIlIllIll((int)llllllllllllIllIIIlIllIlllIlIIlI, llllllllllllIllIIIlIllIlllIlIIll)) {
            final char llllllllllllIllIIIlIllIlllIlllll = llllllllllllIllIIIlIllIlllIlIlII[llllllllllllIllIIIlIllIlllIlIIlI];
            llllllllllllIllIIIlIllIlllIlllII.append((char)(llllllllllllIllIIIlIllIlllIlllll ^ llllllllllllIllIIIlIllIlllIllIll[llllllllllllIllIIIlIllIlllIllIlI % llllllllllllIllIIIlIllIlllIllIll.length]));
            "".length();
            ++llllllllllllIllIIIlIllIlllIllIlI;
            ++llllllllllllIllIIIlIllIlllIlIIlI;
            "".length();
            if (((0x5E ^ 0x5A) & ~(0x91 ^ 0x95)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIllIlllIlllII);
    }
    
    private static void lIIllIllIlIIllII() {
        (llIlllllIllIIl = new String[RenderRabbit.llIlllllIlllIl[9]])[RenderRabbit.llIlllllIlllIl[0]] = lIIllIllIlIIlIIl("AxM+BBYFEzVfBhkCLwQaWAQnEgEeAmkSERgBKF4TGRE=", "wvFpc");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[1]] = lIIllIllIlIIlIlI("xSuMmJIoAWQpQbTUE8ZKJurnjKjNNBu8XJvW1rXH0hdNrVOUIwiOGA==", "QPtHr");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[2]] = lIIllIllIlIIlIlI("8psaK+i50SKX0gfnB4ZGBESuniIts9eHyB+zkZ7/ZCVeo1dUV/DYcw==", "jmTvt");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[3]] = lIIllIllIlIIlIIl("IzIQPhQlMhtlBDkjAT4YeCUJKAM+I0ctDjszRjoPMA==", "WWhJa");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[4]] = lIIllIllIlIIlIIl("BQIXFy0DAhxMPR8TBhchXhUOAToYE0AQOR0TQRM2Fg==", "qgocX");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[5]] = lIIllIllIlIIlIlI("abrVLvpSf455UoPsOP+TZumI5mARUp/Me4TOpgUhDEg477ShoeCm8JEb5IuAaQ1+", "JYeRn");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[6]] = lIIllIllIlIIlIll("+3rjpBhllGGHWRc7iLKBTuSH+jCF6cBPQwNhyxG9AEEomzySTMjicQ==", "zyWsZ");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[7]] = lIIllIllIlIIlIlI("0dFRlj1+dXLzfGtQiHpsHK+gUO5asRkNJ47LNcidCzCEOyolgGCMFw==", "dkynh");
        RenderRabbit.llIlllllIllIIl[RenderRabbit.llIlllllIlllIl[8]] = lIIllIllIlIIlIlI("7pSfIes1qJQ=", "cBkHm");
    }
}
