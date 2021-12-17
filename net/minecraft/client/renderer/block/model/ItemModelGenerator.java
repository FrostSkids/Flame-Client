// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.texture.TextureMap;
import java.util.Collection;
import net.minecraft.util.EnumFacing;
import java.util.Map;
import java.util.HashMap;
import org.lwjgl.util.vector.Vector3f;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class ItemModelGenerator
{
    private static final /* synthetic */ int[] lIlIIIIIIlllII;
    private static final /* synthetic */ String[] lIIlllIlIIIIlI;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing;
    public static final /* synthetic */ List<String> LAYERS;
    
    private static String lllIIIIIIIlIlIl(String lllllllllllllIIlIIIlIIIllIIllllI, final String lllllllllllllIIlIIIlIIIllIlIIIlI) {
        lllllllllllllIIlIIIlIIIllIIllllI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIlIIIllIIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIlIIIllIlIIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIIIlIIIllIlIIIII = lllllllllllllIIlIIIlIIIllIlIIIlI.toCharArray();
        int lllllllllllllIIlIIIlIIIllIIlllll = ItemModelGenerator.lIlIIIIIIlllII[1];
        final String lllllllllllllIIlIIIlIIIllIIllIIl = (Object)((String)lllllllllllllIIlIIIlIIIllIIllllI).toCharArray();
        final int lllllllllllllIIlIIIlIIIllIIllIII = lllllllllllllIIlIIIlIIIllIIllIIl.length;
        Exception lllllllllllllIIlIIIlIIIllIIlIlll = (Exception)ItemModelGenerator.lIlIIIIIIlllII[1];
        while (lllIIIIIIlIlIIl((int)lllllllllllllIIlIIIlIIIllIIlIlll, lllllllllllllIIlIIIlIIIllIIllIII)) {
            final char lllllllllllllIIlIIIlIIIllIlIIlII = lllllllllllllIIlIIIlIIIllIIllIIl[lllllllllllllIIlIIIlIIIllIIlIlll];
            lllllllllllllIIlIIIlIIIllIlIIIIl.append((char)(lllllllllllllIIlIIIlIIIllIlIIlII ^ lllllllllllllIIlIIIlIIIllIlIIIII[lllllllllllllIIlIIIlIIIllIIlllll % lllllllllllllIIlIIIlIIIllIlIIIII.length]));
            "".length();
            ++lllllllllllllIIlIIIlIIIllIIlllll;
            ++lllllllllllllIIlIIIlIIIllIIlIlll;
            "".length();
            if ((0x18 ^ 0x3B ^ (0x9A ^ 0xBD)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIlIIIllIlIIIIl);
    }
    
    private static void lllIIIIIIIlIlll() {
        (lIIlllIlIIIIlI = new String[ItemModelGenerator.lIlIIIIIIlllII[11]])[ItemModelGenerator.lIlIIIIIIlllII[1]] = llIllIllIlIIlll("XyMozjzG9g0=", "koYbv");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[2]] = llIllIllIlIIlll("Uuc5IzuWO38=", "FTETG");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[3]] = lllIIIIIIIlIlII("0ypxeFVdstg=", "UTgNf");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[4]] = lllIIIIIIIlIlII("U0srQwECXh8=", "gBEWI");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[5]] = lllIIIIIIIlIlIl("IDsjEzZ4", "LZZvD");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[0]] = lllIIIIIIIlIlIl("OQwmLB4qATE=", "ImTXw");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[6]] = llIllIllIlIIlll("9X6uy/wWh2Ot2YTNjw8RxQ==", "ECFUg");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[7]] = lllIIIIIIIlIlII("7HfC6kuiF0uLjovWXEVQeg==", "GQFyK");
        ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[8]] = lllIIIIIIIlIlII("8/sLtMes7pM=", "FxAIY");
    }
    
    private static boolean lllIIIIIIlIIllI(final int lllllllllllllIIlIIIlIIIllIIlIIll, final int lllllllllllllIIlIIIlIIIllIIlIIlI) {
        return lllllllllllllIIlIIIlIIIllIIlIIll == lllllllllllllIIlIIIlIIIllIIlIIlI;
    }
    
    private static String lllIIIIIIIlIlII(final String lllllllllllllIIlIIIlIIIllIllIIIl, final String lllllllllllllIIlIIIlIIIllIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIIIllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), ItemModelGenerator.lIlIIIIIIlllII[8]), "DES");
            final Cipher lllllllllllllIIlIIIlIIIllIllIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIlIIIllIllIlIl.init(ItemModelGenerator.lIlIIIIIIlllII[3], lllllllllllllIIlIIIlIIIllIllIllI);
            return new String(lllllllllllllIIlIIIlIIIllIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIIIllIllIlII) {
            lllllllllllllIIlIIIlIIIllIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIIIIlIlIII(final int lllllllllllllIIlIIIlIIIlIlllllII) {
        return lllllllllllllIIlIIIlIIIlIlllllII >= 0;
    }
    
    private void func_178396_a(final SpanFacing lllllllllllllIIlIIIlIIIlllllllII, final List<Span> lllllllllllllIIlIIIlIIIllllllIll, final int[] lllllllllllllIIlIIIlIIlIIIIIIlII, final int lllllllllllllIIlIIIlIIlIIIIIIIll, final int lllllllllllllIIlIIIlIIIllllllIII, final int lllllllllllllIIlIIIlIIlIIIIIIIIl, final int lllllllllllllIIlIIIlIIIlllllIllI, final boolean lllllllllllllIIlIIIlIIIlllllIlIl) {
        int n;
        if (lllIIIIIIlIIlII(this.func_178391_a(lllllllllllllIIlIIIlIIlIIIIIIlII, lllllllllllllIIlIIIlIIlIIIIIIIll + lllllllllllllIIlIIIlIIIlllllllII.func_178372_b(), lllllllllllllIIlIIIlIIIllllllIII + lllllllllllllIIlIIIlIIIlllllllII.func_178371_c(), lllllllllllllIIlIIIlIIlIIIIIIIIl, lllllllllllllIIlIIIlIIIlllllIllI) ? 1 : 0) && lllIIIIIIlIIlII(lllllllllllllIIlIIIlIIIlllllIlIl ? 1 : 0)) {
            n = ItemModelGenerator.lIlIIIIIIlllII[2];
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        }
        else {
            n = ItemModelGenerator.lIlIIIIIIlllII[1];
        }
        final boolean lllllllllllllIIlIIIlIIIllllllllI = n != 0;
        if (lllIIIIIIlIIlII(lllllllllllllIIlIIIlIIIllllllllI ? 1 : 0)) {
            this.func_178395_a(lllllllllllllIIlIIIlIIIllllllIll, lllllllllllllIIlIIIlIIIlllllllII, lllllllllllllIIlIIIlIIlIIIIIIIll, lllllllllllllIIlIIIlIIIllllllIII);
        }
    }
    
    private static boolean lllIIIIIIlIIIll(final int lllllllllllllIIlIIIlIIIllIIIllll, final int lllllllllllllIIlIIIlIIIllIIIlllI) {
        return lllllllllllllIIlIIIlIIIllIIIllll >= lllllllllllllIIlIIIlIIIllIIIlllI;
    }
    
    private static boolean lllIIIIIIlIIlII(final int lllllllllllllIIlIIIlIIIllIIIIIII) {
        return lllllllllllllIIlIIIlIIIllIIIIIII != 0;
    }
    
    private void func_178395_a(final List<Span> lllllllllllllIIlIIIlIIIllllIlIlI, final SpanFacing lllllllllllllIIlIIIlIIIllllIIIII, final int lllllllllllllIIlIIIlIIIllllIlIII, final int lllllllllllllIIlIIIlIIIllllIIlll) {
        Span lllllllllllllIIlIIIlIIIllllIIllI = null;
        final Iterator<Span> iterator = lllllllllllllIIlIIIlIIIllllIlIlI.iterator();
        "".length();
        if ("   ".length() != "   ".length()) {
            return;
        }
        while (!lllIIIIIIlIIIlI(iterator.hasNext() ? 1 : 0)) {
            final Span lllllllllllllIIlIIIlIIIllllIIlIl = iterator.next();
            if (lllIIIIIIlIIlIl(lllllllllllllIIlIIIlIIIllllIIlIl.func_178383_a(), lllllllllllllIIlIIIlIIIllllIIIII)) {
                int n;
                if (lllIIIIIIlIIlII(lllllllllllllIIlIIIlIIIllllIIIII.func_178369_d() ? 1 : 0)) {
                    n = lllllllllllllIIlIIIlIIIllllIIlll;
                    "".length();
                    if (((0x27 ^ 0x46) & ~(0xED ^ 0x8C)) != 0x0) {
                        return;
                    }
                }
                else {
                    n = lllllllllllllIIlIIIlIIIllllIlIII;
                }
                final int lllllllllllllIIlIIIlIIIllllIIlII = n;
                if (!lllIIIIIIlIIllI(lllllllllllllIIlIIIlIIIllllIIlIl.func_178381_d(), lllllllllllllIIlIIIlIIIllllIIlII)) {
                    continue;
                }
                lllllllllllllIIlIIIlIIIllllIIllI = lllllllllllllIIlIIIlIIIllllIIlIl;
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                break;
            }
        }
        int n2;
        if (lllIIIIIIlIIlII(lllllllllllllIIlIIIlIIIllllIIIII.func_178369_d() ? 1 : 0)) {
            n2 = lllllllllllllIIlIIIlIIIllllIIlll;
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        }
        else {
            n2 = lllllllllllllIIlIIIlIIIllllIlIII;
        }
        final int lllllllllllllIIlIIIlIIIllllIIIll = n2;
        int n3;
        if (lllIIIIIIlIIlII(lllllllllllllIIlIIIlIIIllllIIIII.func_178369_d() ? 1 : 0)) {
            n3 = lllllllllllllIIlIIIlIIIllllIlIII;
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            n3 = lllllllllllllIIlIIIlIIIllllIIlll;
        }
        final int lllllllllllllIIlIIIlIIIllllIIIlI = n3;
        if (lllIIIIIIlIIlll(lllllllllllllIIlIIIlIIIllllIIllI)) {
            lllllllllllllIIlIIIlIIIllllIlIlI.add(new Span(lllllllllllllIIlIIIlIIIllllIIIII, lllllllllllllIIlIIIlIIIllllIIIlI, lllllllllllllIIlIIIlIIIllllIIIll));
            "".length();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIIlIIIllllIIllI.func_178382_a(lllllllllllllIIlIIIlIIIllllIIIlI);
        }
    }
    
    private static void lllIIIIIIlIIIIl() {
        (lIlIIIIIIlllII = new int[12])[0] = (115 + 140 - 244 + 151 ^ 113 + 164 - 174 + 64);
        ItemModelGenerator.lIlIIIIIIlllII[1] = ((0xA2 ^ 0x88) & ~(0xA7 ^ 0x8D));
        ItemModelGenerator.lIlIIIIIIlllII[2] = " ".length();
        ItemModelGenerator.lIlIIIIIIlllII[3] = "  ".length();
        ItemModelGenerator.lIlIIIIIIlllII[4] = "   ".length();
        ItemModelGenerator.lIlIIIIIIlllII[5] = (0x9 ^ 0xD);
        ItemModelGenerator.lIlIIIIIIlllII[6] = (22 + 140 - 107 + 114 ^ 68 + 94 - 90 + 103);
        ItemModelGenerator.lIlIIIIIIlllII[7] = (0xAE ^ 0xA9);
        ItemModelGenerator.lIlIIIIIIlllII[8] = (0xBD ^ 0xB5);
        ItemModelGenerator.lIlIIIIIIlllII[9] = (0xE5 ^ 0xA2 ^ (0x1 ^ 0x5E));
        ItemModelGenerator.lIlIIIIIIlllII[10] = 94 + 131 - 59 + 12 + (0xCC ^ 0x80) - (124 + 166 - 124 + 8) + (124 + 9 - 1 + 43);
        ItemModelGenerator.lIlIIIIIIlllII[11] = (0x5F ^ 0x15 ^ (0x4E ^ 0xD));
    }
    
    private List<BlockPart> func_178397_a(final TextureAtlasSprite lllllllllllllIIlIIIlIIlIIllIIIIl, final String lllllllllllllIIlIIIlIIlIIlIIIlll, final int lllllllllllllIIlIIIlIIlIIlIIIllI) {
        final float lllllllllllllIIlIIIlIIlIIlIllllI = (float)lllllllllllllIIlIIIlIIlIIllIIIIl.getIconWidth();
        final float lllllllllllllIIlIIIlIIlIIlIlllIl = (float)lllllllllllllIIlIIIlIIlIIllIIIIl.getIconHeight();
        final List<BlockPart> lllllllllllllIIlIIIlIIlIIlIlllII = (List<BlockPart>)Lists.newArrayList();
        final String lllllllllllllIIlIIIlIIlIIlIIIIIl = (String)this.func_178393_a(lllllllllllllIIlIIIlIIlIIllIIIIl).iterator();
        "".length();
        if (((0x7F ^ 0x35 ^ (0xB ^ 0x66)) & (0x18 ^ 0x35 ^ (0x38 ^ 0x32) ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!lllIIIIIIlIIIlI(((Iterator)lllllllllllllIIlIIIlIIlIIlIIIIIl).hasNext() ? 1 : 0)) {
            final Span lllllllllllllIIlIIIlIIlIIlIllIll = ((Iterator<Span>)lllllllllllllIIlIIIlIIlIIlIIIIIl).next();
            float lllllllllllllIIlIIIlIIlIIlIllIlI = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIllIIl = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIllIII = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIlIlll = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIlIllI = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIlIlIl = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIlIlII = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIlIIll = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIlIIlI = 0.0f;
            float lllllllllllllIIlIIIlIIlIIlIlIIIl = 0.0f;
            final float lllllllllllllIIlIIIlIIlIIlIlIIII = (float)lllllllllllllIIlIIIlIIlIIlIllIll.func_178385_b();
            final float lllllllllllllIIlIIIlIIlIIlIIllll = (float)lllllllllllllIIlIIIlIIlIIlIllIll.func_178384_c();
            final float lllllllllllllIIlIIIlIIlIIlIIlllI = (float)lllllllllllllIIlIIIlIIlIIlIllIll.func_178381_d();
            final SpanFacing lllllllllllllIIlIIIlIIlIIlIIllIl = lllllllllllllIIlIIIlIIlIIlIllIll.func_178383_a();
            switch ($SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing()[lllllllllllllIIlIIIlIIlIIlIIllIl.ordinal()]) {
                case 1: {
                    lllllllllllllIIlIIIlIIlIIlIlIllI = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIllIlI = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIlIlIl = (lllllllllllllIIlIIIlIIlIIlIllIII = lllllllllllllIIlIIIlIIlIIlIIllll + 1.0f);
                    lllllllllllllIIlIIIlIIlIIlIlIlII = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIllIIl = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIIll = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIlll = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIIlI = 16.0f / lllllllllllllIIlIIIlIIlIIlIllllI;
                    lllllllllllllIIlIIIlIIlIIlIlIIIl = 16.0f / (lllllllllllllIIlIIIlIIlIIlIlllIl - 1.0f);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 2: {
                    lllllllllllllIIlIIIlIIlIIlIlIIll = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIlII = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIllI = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIllIlI = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIlIlIl = (lllllllllllllIIlIIIlIIlIIlIllIII = lllllllllllllIIlIIIlIIlIIlIIllll + 1.0f);
                    lllllllllllllIIlIIIlIIlIIlIllIIl = lllllllllllllIIlIIIlIIlIIlIIlllI + 1.0f;
                    lllllllllllllIIlIIIlIIlIIlIlIlll = lllllllllllllIIlIIIlIIlIIlIIlllI + 1.0f;
                    lllllllllllllIIlIIIlIIlIIlIlIIlI = 16.0f / lllllllllllllIIlIIIlIIlIIlIllllI;
                    lllllllllllllIIlIIIlIIlIIlIlIIIl = 16.0f / (lllllllllllllIIlIIIlIIlIIlIlllIl - 1.0f);
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return null;
                    }
                    break;
                }
                case 3: {
                    lllllllllllllIIlIIIlIIlIIlIlIllI = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIllIlI = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIlIl = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIllIII = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIIll = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIllIIl = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIlIlII = (lllllllllllllIIlIIIlIIlIIlIlIlll = lllllllllllllIIlIIIlIIlIIlIIllll + 1.0f);
                    lllllllllllllIIlIIIlIIlIIlIlIIlI = 16.0f / (lllllllllllllIIlIIIlIIlIIlIllllI - 1.0f);
                    lllllllllllllIIlIIIlIIlIIlIlIIIl = 16.0f / lllllllllllllIIlIIIlIIlIIlIlllIl;
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return null;
                    }
                    break;
                }
                case 4: {
                    lllllllllllllIIlIIIlIIlIIlIlIlIl = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIlIllI = lllllllllllllIIlIIIlIIlIIlIIlllI;
                    lllllllllllllIIlIIIlIIlIIlIllIlI = lllllllllllllIIlIIIlIIlIIlIIlllI + 1.0f;
                    lllllllllllllIIlIIIlIIlIIlIllIII = lllllllllllllIIlIIIlIIlIIlIIlllI + 1.0f;
                    lllllllllllllIIlIIIlIIlIIlIlIIll = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIllIIl = lllllllllllllIIlIIIlIIlIIlIlIIII;
                    lllllllllllllIIlIIIlIIlIIlIlIlII = (lllllllllllllIIlIIIlIIlIIlIlIlll = lllllllllllllIIlIIIlIIlIIlIIllll + 1.0f);
                    lllllllllllllIIlIIIlIIlIIlIlIIlI = 16.0f / (lllllllllllllIIlIIIlIIlIIlIllllI - 1.0f);
                    lllllllllllllIIlIIIlIIlIIlIlIIIl = 16.0f / lllllllllllllIIlIIIlIIlIIlIlllIl;
                    break;
                }
            }
            final float lllllllllllllIIlIIIlIIlIIlIIllII = 16.0f / lllllllllllllIIlIIIlIIlIIlIllllI;
            final float lllllllllllllIIlIIIlIIlIIlIIlIll = 16.0f / lllllllllllllIIlIIIlIIlIIlIlllIl;
            lllllllllllllIIlIIIlIIlIIlIllIlI *= lllllllllllllIIlIIIlIIlIIlIIllII;
            lllllllllllllIIlIIIlIIlIIlIllIII *= lllllllllllllIIlIIIlIIlIIlIIllII;
            lllllllllllllIIlIIIlIIlIIlIllIIl *= lllllllllllllIIlIIIlIIlIIlIIlIll;
            lllllllllllllIIlIIIlIIlIIlIlIlll *= lllllllllllllIIlIIIlIIlIIlIIlIll;
            lllllllllllllIIlIIIlIIlIIlIllIIl = 16.0f - lllllllllllllIIlIIIlIIlIIlIllIIl;
            lllllllllllllIIlIIIlIIlIIlIlIlll = 16.0f - lllllllllllllIIlIIIlIIlIIlIlIlll;
            lllllllllllllIIlIIIlIIlIIlIlIllI *= lllllllllllllIIlIIIlIIlIIlIlIIlI;
            lllllllllllllIIlIIIlIIlIIlIlIlIl *= lllllllllllllIIlIIIlIIlIIlIlIIlI;
            lllllllllllllIIlIIIlIIlIIlIlIlII *= lllllllllllllIIlIIIlIIlIIlIlIIIl;
            lllllllllllllIIlIIIlIIlIIlIlIIll *= lllllllllllllIIlIIIlIIlIIlIlIIIl;
            final HashMap hashMap;
            final Map<EnumFacing, BlockPartFace> lllllllllllllIIlIIIlIIlIIlIIlIlI = (Map<EnumFacing, BlockPartFace>)(hashMap = Maps.newHashMap());
            final EnumFacing facing = lllllllllllllIIlIIIlIIlIIlIIllIl.getFacing();
            final EnumFacing lllllllllllllIIlllIllllllIllIIlI = null;
            final float[] lllllllllllllIIllIlIIlIllIIlllll = new float[ItemModelGenerator.lIlIIIIIIlllII[5]];
            lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[1]] = lllllllllllllIIlIIIlIIlIIlIlIllI;
            lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[2]] = lllllllllllllIIlIIIlIIlIIlIlIlII;
            lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[3]] = lllllllllllllIIlIIIlIIlIIlIlIlIl;
            lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[4]] = lllllllllllllIIlIIIlIIlIIlIlIIll;
            hashMap.put(facing, new BlockPartFace(lllllllllllllIIlllIllllllIllIIlI, lllllllllllllIIlIIIlIIlIIlIIIllI, lllllllllllllIIlIIIlIIlIIlIIIlll, new BlockFaceUV(lllllllllllllIIllIlIIlIllIIlllll, ItemModelGenerator.lIlIIIIIIlllII[1])));
            "".length();
            switch ($SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing()[lllllllllllllIIlIIIlIIlIIlIIllIl.ordinal()]) {
                case 1: {
                    lllllllllllllIIlIIIlIIlIIlIlllII.add(new BlockPart(new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIlI, lllllllllllllIIlIIIlIIlIIlIllIIl, 7.5f), new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIII, lllllllllllllIIlIIIlIIlIIlIllIIl, 8.5f), lllllllllllllIIlIIIlIIlIIlIIlIlI, null, (boolean)(ItemModelGenerator.lIlIIIIIIlllII[2] != 0)));
                    "".length();
                    "".length();
                    if (((0x2B ^ 0x7E ^ (0x6C ^ 0x65)) & (0x24 ^ 0x6A ^ (0x75 ^ 0x67) ^ -" ".length())) > "  ".length()) {
                        return null;
                    }
                    continue;
                }
                case 2: {
                    lllllllllllllIIlIIIlIIlIIlIlllII.add(new BlockPart(new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIlI, lllllllllllllIIlIIIlIIlIIlIlIlll, 7.5f), new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIII, lllllllllllllIIlIIIlIIlIIlIlIlll, 8.5f), lllllllllllllIIlIIIlIIlIIlIIlIlI, null, (boolean)(ItemModelGenerator.lIlIIIIIIlllII[2] != 0)));
                    "".length();
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                    continue;
                }
                case 3: {
                    lllllllllllllIIlIIIlIIlIIlIlllII.add(new BlockPart(new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIlI, lllllllllllllIIlIIIlIIlIIlIllIIl, 7.5f), new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIlI, lllllllllllllIIlIIIlIIlIIlIlIlll, 8.5f), lllllllllllllIIlIIIlIIlIIlIIlIlI, null, (boolean)(ItemModelGenerator.lIlIIIIIIlllII[2] != 0)));
                    "".length();
                    "".length();
                    if (" ".length() == -" ".length()) {
                        return null;
                    }
                    continue;
                }
                case 4: {
                    lllllllllllllIIlIIIlIIlIIlIlllII.add(new BlockPart(new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIII, lllllllllllllIIlIIIlIIlIIlIllIIl, 7.5f), new Vector3f(lllllllllllllIIlIIIlIIlIIlIllIII, lllllllllllllIIlIIIlIIlIIlIlIlll, 8.5f), lllllllllllllIIlIIIlIIlIIlIIlIlI, null, (boolean)(ItemModelGenerator.lIlIIIIIIlllII[2] != 0)));
                    "".length();
                }
                default: {
                    continue;
                }
            }
        }
        return lllllllllllllIIlIIIlIIlIIlIlllII;
    }
    
    private List<BlockPart> func_178394_a(final int lllllllllllllIIlIIIlIIlIlIIIIlll, final String lllllllllllllIIlIIIlIIlIlIIIIllI, final TextureAtlasSprite lllllllllllllIIlIIIlIIlIIlllllll) {
        final HashMap hashMap;
        final Map<EnumFacing, BlockPartFace> lllllllllllllIIlIIIlIIlIlIIIIlII = (Map<EnumFacing, BlockPartFace>)(hashMap = Maps.newHashMap());
        final EnumFacing south = EnumFacing.SOUTH;
        final EnumFacing lllllllllllllIIlllIllllllIllIIlI = null;
        final float[] lllllllllllllIIllIlIIlIllIIlllll = new float[ItemModelGenerator.lIlIIIIIIlllII[5]];
        lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[1]] = 0.0f;
        lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[2]] = 0.0f;
        lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[3]] = 16.0f;
        lllllllllllllIIllIlIIlIllIIlllll[ItemModelGenerator.lIlIIIIIIlllII[4]] = 16.0f;
        hashMap.put(south, new BlockPartFace(lllllllllllllIIlllIllllllIllIIlI, lllllllllllllIIlIIIlIIlIlIIIIlll, lllllllllllllIIlIIIlIIlIlIIIIllI, new BlockFaceUV(lllllllllllllIIllIlIIlIllIIlllll, ItemModelGenerator.lIlIIIIIIlllII[1])));
        "".length();
        final Map<EnumFacing, BlockPartFace> map = lllllllllllllIIlIIIlIIlIlIIIIlII;
        final EnumFacing north = EnumFacing.NORTH;
        final EnumFacing lllllllllllllIIlllIllllllIllIIlI2 = null;
        final float[] lllllllllllllIIllIlIIlIllIIlllll2 = new float[ItemModelGenerator.lIlIIIIIIlllII[5]];
        lllllllllllllIIllIlIIlIllIIlllll2[ItemModelGenerator.lIlIIIIIIlllII[1]] = 16.0f;
        lllllllllllllIIllIlIIlIllIIlllll2[ItemModelGenerator.lIlIIIIIIlllII[2]] = 0.0f;
        lllllllllllllIIllIlIIlIllIIlllll2[ItemModelGenerator.lIlIIIIIIlllII[3]] = 0.0f;
        lllllllllllllIIllIlIIlIllIIlllll2[ItemModelGenerator.lIlIIIIIIlllII[4]] = 16.0f;
        map.put(north, new BlockPartFace(lllllllllllllIIlllIllllllIllIIlI2, lllllllllllllIIlIIIlIIlIlIIIIlll, lllllllllllllIIlIIIlIIlIlIIIIllI, new BlockFaceUV(lllllllllllllIIllIlIIlIllIIlllll2, ItemModelGenerator.lIlIIIIIIlllII[1])));
        "".length();
        final List<BlockPart> lllllllllllllIIlIIIlIIlIlIIIIIll = (List<BlockPart>)Lists.newArrayList();
        lllllllllllllIIlIIIlIIlIlIIIIIll.add(new BlockPart(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), lllllllllllllIIlIIIlIIlIlIIIIlII, null, (boolean)(ItemModelGenerator.lIlIIIIIIlllII[2] != 0)));
        "".length();
        lllllllllllllIIlIIIlIIlIlIIIIIll.addAll(this.func_178397_a(lllllllllllllIIlIIIlIIlIIlllllll, lllllllllllllIIlIIIlIIlIlIIIIllI, lllllllllllllIIlIIIlIIlIlIIIIlll));
        "".length();
        return lllllllllllllIIlIIIlIIlIlIIIIIll;
    }
    
    private static boolean lllIIIIIIlIIlll(final Object lllllllllllllIIlIIIlIIIllIIIIIlI) {
        return lllllllllllllIIlIIIlIIIllIIIIIlI == null;
    }
    
    private static boolean lllIIIIIIlIIIlI(final int lllllllllllllIIlIIIlIIIlIllllllI) {
        return lllllllllllllIIlIIIlIIIlIllllllI == 0;
    }
    
    private static boolean lllIIIIIIlIlIIl(final int lllllllllllllIIlIIIlIIIllIIIlIll, final int lllllllllllllIIlIIIlIIIllIIIlIlI) {
        return lllllllllllllIIlIIIlIIIllIIIlIll < lllllllllllllIIlIIIlIIIllIIIlIlI;
    }
    
    public ModelBlock makeItemModel(final TextureMap lllllllllllllIIlIIIlIIlIlIIlIllI, final ModelBlock lllllllllllllIIlIIIlIIlIlIIllllI) {
        final Map<String, String> lllllllllllllIIlIIIlIIlIlIIlllIl = (Map<String, String>)Maps.newHashMap();
        final List<BlockPart> lllllllllllllIIlIIIlIIlIlIIlllII = (List<BlockPart>)Lists.newArrayList();
        int lllllllllllllIIlIIIlIIlIlIIllIll = ItemModelGenerator.lIlIIIIIIlllII[1];
        "".length();
        if ((16 + 41 + 73 + 23 ^ 37 + 111 - 49 + 58) <= ((168 + 28 - 67 + 70 ^ 99 + 137 - 112 + 30) & (0x1F ^ 0x7C ^ (0x88 ^ 0xB6) ^ -" ".length()))) {
            return null;
        }
        while (!lllIIIIIIlIIIll(lllllllllllllIIlIIIlIIlIlIIllIll, ItemModelGenerator.LAYERS.size())) {
            final String lllllllllllllIIlIIIlIIlIlIIllIlI = ItemModelGenerator.LAYERS.get(lllllllllllllIIlIIIlIIlIlIIllIll);
            if (lllIIIIIIlIIIlI(lllllllllllllIIlIIIlIIlIlIIllllI.isTexturePresent(lllllllllllllIIlIIIlIIlIlIIllIlI) ? 1 : 0)) {
                "".length();
                if (((0x59 ^ 0x6B) & ~(0x24 ^ 0x16)) > "   ".length()) {
                    return null;
                }
                break;
            }
            else {
                final String lllllllllllllIIlIIIlIIlIlIIllIIl = lllllllllllllIIlIIIlIIlIlIIllllI.resolveTextureName(lllllllllllllIIlIIIlIIlIlIIllIlI);
                lllllllllllllIIlIIIlIIlIlIIlllIl.put(lllllllllllllIIlIIIlIIlIlIIllIlI, lllllllllllllIIlIIIlIIlIlIIllIIl);
                "".length();
                final TextureAtlasSprite lllllllllllllIIlIIIlIIlIlIIllIII = lllllllllllllIIlIIIlIIlIlIIlIllI.getAtlasSprite(new ResourceLocation(lllllllllllllIIlIIIlIIlIlIIllIIl).toString());
                lllllllllllllIIlIIIlIIlIlIIlllII.addAll(this.func_178394_a(lllllllllllllIIlIIIlIIlIlIIllIll, lllllllllllllIIlIIIlIIlIlIIllIlI, lllllllllllllIIlIIIlIIlIlIIllIII));
                "".length();
                ++lllllllllllllIIlIIIlIIlIlIIllIll;
            }
        }
        if (lllIIIIIIlIIlII(lllllllllllllIIlIIIlIIlIlIIlllII.isEmpty() ? 1 : 0)) {
            return null;
        }
        final Map<String, String> map = lllllllllllllIIlIIIlIIlIlIIlllIl;
        final String s = ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[0]];
        String resolveTextureName;
        if (lllIIIIIIlIIlII(lllllllllllllIIlIIIlIIlIlIIllllI.isTexturePresent(ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[6]]) ? 1 : 0)) {
            resolveTextureName = lllllllllllllIIlIIIlIIlIlIIllllI.resolveTextureName(ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[7]]);
            "".length();
            if (-(0x15 ^ 0x10) >= 0) {
                return null;
            }
        }
        else {
            resolveTextureName = lllllllllllllIIlIIIlIIlIlIIlllIl.get(ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[8]]);
        }
        map.put(s, resolveTextureName);
        "".length();
        return new ModelBlock(lllllllllllllIIlIIIlIIlIlIIlllII, lllllllllllllIIlIIIlIIlIlIIlllIl, (boolean)(ItemModelGenerator.lIlIIIIIIlllII[1] != 0), (boolean)(ItemModelGenerator.lIlIIIIIIlllII[1] != 0), lllllllllllllIIlIIIlIIlIlIIllllI.func_181682_g());
    }
    
    private static boolean lllIIIIIIlIlIlI(final Object lllllllllllllIIlIIIlIIIllIIIIlII) {
        return lllllllllllllIIlIIIlIIIllIIIIlII != null;
    }
    
    private static String llIllIllIlIIlll(final String lllllllllllllIIlIIIlIIIllIlllllI, final String lllllllllllllIIlIIIlIIIllIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIIIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIIllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIlIIIlllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIlIIIlllIIIIlI.init(ItemModelGenerator.lIlIIIIIIlllII[3], lllllllllllllIIlIIIlIIIlllIIIIll);
            return new String(lllllllllllllIIlIIIlIIIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIIIlllIIIIIl) {
            lllllllllllllIIlIIIlIIIlllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing() {
        final int[] $switch_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing = ItemModelGenerator.$SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing;
        if (lllIIIIIIlIlIlI($switch_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing)) {
            return $switch_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing;
        }
        "".length();
        final double lllllllllllllIIlIIIlIIIlllIIlIII = (Object)new int[SpanFacing.values().length];
        try {
            lllllllllllllIIlIIIlIIIlllIIlIII[SpanFacing.DOWN.ordinal()] = ItemModelGenerator.lIlIIIIIIlllII[3];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIIIlllIIlIII[SpanFacing.LEFT.ordinal()] = ItemModelGenerator.lIlIIIIIIlllII[4];
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIIIlllIIlIII[SpanFacing.RIGHT.ordinal()] = ItemModelGenerator.lIlIIIIIIlllII[5];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIIIlllIIlIII[SpanFacing.UP.ordinal()] = ItemModelGenerator.lIlIIIIIIlllII[2];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        return ItemModelGenerator.$SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemModelGenerator$SpanFacing = (int[])(Object)lllllllllllllIIlIIIlIIIlllIIlIII;
    }
    
    private List<Span> func_178393_a(final TextureAtlasSprite lllllllllllllIIlIIIlIIlIIIIllIlI) {
        final int lllllllllllllIIlIIIlIIlIIIlIIIll = lllllllllllllIIlIIIlIIlIIIIllIlI.getIconWidth();
        final int lllllllllllllIIlIIIlIIlIIIlIIIlI = lllllllllllllIIlIIIlIIlIIIIllIlI.getIconHeight();
        final List<Span> lllllllllllllIIlIIIlIIlIIIlIIIIl = (List<Span>)Lists.newArrayList();
        int lllllllllllllIIlIIIlIIlIIIlIIIII = ItemModelGenerator.lIlIIIIIIlllII[1];
        "".length();
        if (((0x6 ^ 0x5C ^ (0xB6 ^ 0x8D)) & (15 + 214 - 142 + 134 ^ 186 + 13 - 71 + 60 ^ -" ".length())) <= -" ".length()) {
            return null;
        }
        while (!lllIIIIIIlIIIll(lllllllllllllIIlIIIlIIlIIIlIIIII, lllllllllllllIIlIIIlIIlIIIIllIlI.getFrameCount())) {
            final int[] lllllllllllllIIlIIIlIIlIIIIlllll = lllllllllllllIIlIIIlIIlIIIIllIlI.getFrameTextureData(lllllllllllllIIlIIIlIIlIIIlIIIII)[ItemModelGenerator.lIlIIIIIIlllII[1]];
            int lllllllllllllIIlIIIlIIlIIIIllllI = ItemModelGenerator.lIlIIIIIIlllII[1];
            "".length();
            if (((0xF3 ^ 0xC3) & ~(0x74 ^ 0x44)) < -" ".length()) {
                return null;
            }
            while (!lllIIIIIIlIIIll(lllllllllllllIIlIIIlIIlIIIIllllI, lllllllllllllIIlIIIlIIlIIIlIIIlI)) {
                int lllllllllllllIIlIIIlIIlIIIIlllIl = ItemModelGenerator.lIlIIIIIIlllII[1];
                "".length();
                if ((97 + 124 - 154 + 66 ^ 29 + 25 + 15 + 60) != (" ".length() ^ (0xB8 ^ 0xBD))) {
                    return null;
                }
                while (!lllIIIIIIlIIIll(lllllllllllllIIlIIIlIIlIIIIlllIl, lllllllllllllIIlIIIlIIlIIIlIIIll)) {
                    int n;
                    if (lllIIIIIIlIIlII(this.func_178391_a(lllllllllllllIIlIIIlIIlIIIIlllll, lllllllllllllIIlIIIlIIlIIIIlllIl, lllllllllllllIIlIIIlIIlIIIIllllI, lllllllllllllIIlIIIlIIlIIIlIIIll, lllllllllllllIIlIIIlIIlIIIlIIIlI) ? 1 : 0)) {
                        n = ItemModelGenerator.lIlIIIIIIlllII[1];
                        "".length();
                        if ("  ".length() <= 0) {
                            return null;
                        }
                    }
                    else {
                        n = ItemModelGenerator.lIlIIIIIIlllII[2];
                    }
                    final boolean lllllllllllllIIlIIIlIIlIIIIlllII = n != 0;
                    this.func_178396_a(SpanFacing.UP, lllllllllllllIIlIIIlIIlIIIlIIIIl, lllllllllllllIIlIIIlIIlIIIIlllll, lllllllllllllIIlIIIlIIlIIIIlllIl, lllllllllllllIIlIIIlIIlIIIIllllI, lllllllllllllIIlIIIlIIlIIIlIIIll, lllllllllllllIIlIIIlIIlIIIlIIIlI, lllllllllllllIIlIIIlIIlIIIIlllII);
                    this.func_178396_a(SpanFacing.DOWN, lllllllllllllIIlIIIlIIlIIIlIIIIl, lllllllllllllIIlIIIlIIlIIIIlllll, lllllllllllllIIlIIIlIIlIIIIlllIl, lllllllllllllIIlIIIlIIlIIIIllllI, lllllllllllllIIlIIIlIIlIIIlIIIll, lllllllllllllIIlIIIlIIlIIIlIIIlI, lllllllllllllIIlIIIlIIlIIIIlllII);
                    this.func_178396_a(SpanFacing.LEFT, lllllllllllllIIlIIIlIIlIIIlIIIIl, lllllllllllllIIlIIIlIIlIIIIlllll, lllllllllllllIIlIIIlIIlIIIIlllIl, lllllllllllllIIlIIIlIIlIIIIllllI, lllllllllllllIIlIIIlIIlIIIlIIIll, lllllllllllllIIlIIIlIIlIIIlIIIlI, lllllllllllllIIlIIIlIIlIIIIlllII);
                    this.func_178396_a(SpanFacing.RIGHT, lllllllllllllIIlIIIlIIlIIIlIIIIl, lllllllllllllIIlIIIlIIlIIIIlllll, lllllllllllllIIlIIIlIIlIIIIlllIl, lllllllllllllIIlIIIlIIlIIIIllllI, lllllllllllllIIlIIIlIIlIIIlIIIll, lllllllllllllIIlIIIlIIlIIIlIIIlI, lllllllllllllIIlIIIlIIlIIIIlllII);
                    ++lllllllllllllIIlIIIlIIlIIIIlllIl;
                }
                ++lllllllllllllIIlIIIlIIlIIIIllllI;
            }
            ++lllllllllllllIIlIIIlIIlIIIlIIIII;
        }
        return lllllllllllllIIlIIIlIIlIIIlIIIIl;
    }
    
    static {
        lllIIIIIIlIIIIl();
        lllIIIIIIIlIlll();
        final String[] array = new String[ItemModelGenerator.lIlIIIIIIlllII[0]];
        array[ItemModelGenerator.lIlIIIIIIlllII[1]] = ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[1]];
        array[ItemModelGenerator.lIlIIIIIIlllII[2]] = ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[2]];
        array[ItemModelGenerator.lIlIIIIIIlllII[3]] = ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[3]];
        array[ItemModelGenerator.lIlIIIIIIlllII[4]] = ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[4]];
        array[ItemModelGenerator.lIlIIIIIIlllII[5]] = ItemModelGenerator.lIIlllIlIIIIlI[ItemModelGenerator.lIlIIIIIIlllII[5]];
        LAYERS = Lists.newArrayList((Object[])array);
    }
    
    private boolean func_178391_a(final int[] lllllllllllllIIlIIIlIIIlllIlIIll, final int lllllllllllllIIlIIIlIIIlllIIllIl, final int lllllllllllllIIlIIIlIIIlllIIllII, final int lllllllllllllIIlIIIlIIIlllIIlIll, final int lllllllllllllIIlIIIlIIIlllIIllll) {
        int n;
        if (lllIIIIIIlIlIII(lllllllllllllIIlIIIlIIIlllIIllIl) && lllIIIIIIlIlIII(lllllllllllllIIlIIIlIIIlllIIllII) && lllIIIIIIlIlIIl(lllllllllllllIIlIIIlIIIlllIIllIl, lllllllllllllIIlIIIlIIIlllIIlIll) && lllIIIIIIlIlIIl(lllllllllllllIIlIIIlIIIlllIIllII, lllllllllllllIIlIIIlIIIlllIIllll)) {
            if (lllIIIIIIlIIIlI(lllllllllllllIIlIIIlIIIlllIlIIll[lllllllllllllIIlIIIlIIIlllIIllII * lllllllllllllIIlIIIlIIIlllIIlIll + lllllllllllllIIlIIIlIIIlllIIllIl] >> ItemModelGenerator.lIlIIIIIIlllII[9] & ItemModelGenerator.lIlIIIIIIlllII[10])) {
                n = ItemModelGenerator.lIlIIIIIIlllII[2];
                "".length();
                if (-(0x87 ^ 0x82) >= 0) {
                    return ((0xD ^ 0x3) & ~(0xBC ^ 0xB2)) != 0x0;
                }
            }
            else {
                n = ItemModelGenerator.lIlIIIIIIlllII[1];
                "".length();
                if ("  ".length() < 0) {
                    return ((0x51 ^ 0x40 ^ (0x70 ^ 0x49)) & (0x10 ^ 0x50 ^ (0x72 ^ 0x1A) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n = ItemModelGenerator.lIlIIIIIIlllII[2];
        }
        return n != 0;
    }
    
    private static boolean lllIIIIIIlIIlIl(final Object lllllllllllllIIlIIIlIIIllIIIIlll, final Object lllllllllllllIIlIIIlIIIllIIIIllI) {
        return lllllllllllllIIlIIIlIIIllIIIIlll == lllllllllllllIIlIIIlIIIllIIIIllI;
    }
    
    static class Span
    {
        private /* synthetic */ int field_178388_c;
        private final /* synthetic */ SpanFacing spanFacing;
        private final /* synthetic */ int field_178386_d;
        private /* synthetic */ int field_178387_b;
        
        public int func_178385_b() {
            return this.field_178387_b;
        }
        
        public int func_178384_c() {
            return this.field_178388_c;
        }
        
        public int func_178381_d() {
            return this.field_178386_d;
        }
        
        private static boolean lIllIlIllIlllIl(final int lllllllllllllIlIIllllIllIllIIlII, final int lllllllllllllIlIIllllIllIllIIIll) {
            return lllllllllllllIlIIllllIllIllIIlII < lllllllllllllIlIIllllIllIllIIIll;
        }
        
        private static boolean lIllIlIlllIIIIl(final int lllllllllllllIlIIllllIllIlIllllI, final int lllllllllllllIlIIllllIllIlIlllII) {
            return lllllllllllllIlIIllllIllIlIllllI > lllllllllllllIlIIllllIllIlIlllII;
        }
        
        public SpanFacing func_178383_a() {
            return this.spanFacing;
        }
        
        public void func_178382_a(final int lllllllllllllIlIIllllIlllIIIIIlI) {
            if (lIllIlIllIlllIl(lllllllllllllIlIIllllIlllIIIIIlI, this.field_178387_b)) {
                this.field_178387_b = lllllllllllllIlIIllllIlllIIIIIlI;
                "".length();
                if ((0xC6 ^ 0x99 ^ (0xD1 ^ 0x8A)) == ((59 + 120 - 176 + 134 ^ 117 + 30 - 61 + 66) & (0xE4 ^ 0xAE ^ (0xE ^ 0x55) ^ -" ".length()))) {
                    return;
                }
            }
            else if (lIllIlIlllIIIIl(lllllllllllllIlIIllllIlllIIIIIlI, this.field_178388_c)) {
                this.field_178388_c = lllllllllllllIlIIllllIlllIIIIIlI;
            }
        }
        
        public Span(final SpanFacing lllllllllllllIlIIllllIlllIIlIIIl, final int lllllllllllllIlIIllllIlllIIlIIII, final int lllllllllllllIlIIllllIlllIIIlllI) {
            this.spanFacing = lllllllllllllIlIIllllIlllIIlIIIl;
            this.field_178387_b = lllllllllllllIlIIllllIlllIIlIIII;
            this.field_178388_c = lllllllllllllIlIIllllIlllIIlIIII;
            this.field_178386_d = lllllllllllllIlIIllllIlllIIIlllI;
        }
    }
    
    enum SpanFacing
    {
        private final /* synthetic */ EnumFacing facing;
        private static final /* synthetic */ String[] lIIlIIIllllIlI;
        
        UP(SpanFacing.lIIlIIIllllIlI[SpanFacing.lIIlIIIllllllI[0]], SpanFacing.lIIlIIIllllllI[0], EnumFacing.UP, SpanFacing.lIIlIIIllllllI[0], SpanFacing.lIIlIIIllllllI[1]);
        
        private final /* synthetic */ int field_178374_g;
        
        DOWN(SpanFacing.lIIlIIIllllIlI[SpanFacing.lIIlIIIllllllI[2]], SpanFacing.lIIlIIIllllllI[2], EnumFacing.DOWN, SpanFacing.lIIlIIIllllllI[0], SpanFacing.lIIlIIIllllllI[2]);
        
        private final /* synthetic */ int field_178373_f;
        
        LEFT(SpanFacing.lIIlIIIllllIlI[SpanFacing.lIIlIIIllllllI[3]], SpanFacing.lIIlIIIllllllI[3], EnumFacing.EAST, SpanFacing.lIIlIIIllllllI[1], SpanFacing.lIIlIIIllllllI[0]), 
        RIGHT(SpanFacing.lIIlIIIllllIlI[SpanFacing.lIIlIIIllllllI[4]], SpanFacing.lIIlIIIllllllI[4], EnumFacing.WEST, SpanFacing.lIIlIIIllllllI[2], SpanFacing.lIIlIIIllllllI[0]);
        
        private static final /* synthetic */ int[] lIIlIIIllllllI;
        
        private static boolean llIIlIllllIllII(final Object lllllllllllllIIlllIIIlIlIIllIlII, final Object lllllllllllllIIlllIIIlIlIIllIIIl) {
            return lllllllllllllIIlllIIIlIlIIllIlII != lllllllllllllIIlllIIIlIlIIllIIIl;
        }
        
        private static boolean llIIlIllllIllIl(final int lllllllllllllIIlllIIIlIlIIllllIl, final int lllllllllllllIIlllIIIlIlIIlllIll) {
            return lllllllllllllIIlllIIIlIlIIllllIl < lllllllllllllIIlllIIIlIlIIlllIll;
        }
        
        private boolean func_178369_d() {
            if (llIIlIllllIllII(this, SpanFacing.DOWN) && llIIlIllllIllII(this, SpanFacing.UP)) {
                return SpanFacing.lIIlIIIllllllI[0] != 0;
            }
            return SpanFacing.lIIlIIIllllllI[2] != 0;
        }
        
        private SpanFacing(final String lllllllllllllIIlllIIIlIllIllllII, final int lllllllllllllIIlllIIIlIllIlllIlI, final EnumFacing lllllllllllllIIlllIIIlIllIlllIII, final int lllllllllllllIIlllIIIlIllIllIllI, final int lllllllllllllIIlllIIIlIlllIIIIII) {
            this.facing = lllllllllllllIIlllIIIlIllIlllIII;
            this.field_178373_f = lllllllllllllIIlllIIIlIllIllIllI;
            this.field_178374_g = lllllllllllllIIlllIIIlIlllIIIIII;
        }
        
        private static String llIIlIlllIllIII(String lllllllllllllIIlllIIIlIlIlIlIIII, final String lllllllllllllIIlllIIIlIlIlIIllll) {
            lllllllllllllIIlllIIIlIlIlIlIIII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIIIlIlIlIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlllIIIlIlIlIlIlII = new StringBuilder();
            final char[] lllllllllllllIIlllIIIlIlIlIlIIlI = lllllllllllllIIlllIIIlIlIlIIllll.toCharArray();
            int lllllllllllllIIlllIIIlIlIlIlIIIl = SpanFacing.lIIlIIIllllllI[0];
            final int lllllllllllllIIlllIIIlIlIlIIlIll = (Object)((String)lllllllllllllIIlllIIIlIlIlIlIIII).toCharArray();
            final byte lllllllllllllIIlllIIIlIlIlIIlIIl = (byte)lllllllllllllIIlllIIIlIlIlIIlIll.length;
            int lllllllllllllIIlllIIIlIlIlIIlIII = SpanFacing.lIIlIIIllllllI[0];
            while (llIIlIllllIllIl(lllllllllllllIIlllIIIlIlIlIIlIII, lllllllllllllIIlllIIIlIlIlIIlIIl)) {
                final char lllllllllllllIIlllIIIlIlIlIllIlI = lllllllllllllIIlllIIIlIlIlIIlIll[lllllllllllllIIlllIIIlIlIlIIlIII];
                lllllllllllllIIlllIIIlIlIlIlIlII.append((char)(lllllllllllllIIlllIIIlIlIlIllIlI ^ lllllllllllllIIlllIIIlIlIlIlIIlI[lllllllllllllIIlllIIIlIlIlIlIIIl % lllllllllllllIIlllIIIlIlIlIlIIlI.length]));
                "".length();
                ++lllllllllllllIIlllIIIlIlIlIlIIIl;
                ++lllllllllllllIIlllIIIlIlIlIIlIII;
                "".length();
                if (" ".length() > "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlllIIIlIlIlIlIlII);
        }
        
        private static String llIIlIlllIllIIl(final String lllllllllllllIIlllIIIlIlIllllIlI, final String lllllllllllllIIlllIIIlIlIllllIII) {
            try {
                final SecretKeySpec lllllllllllllIIlllIIIlIlIllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIlIlIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlllIIIlIlIlllllIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIlllIIIlIlIlllllIl.init(SpanFacing.lIIlIIIllllllI[3], lllllllllllllIIlllIIIlIlIllllllI);
                return new String(lllllllllllllIIlllIIIlIlIlllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllIIIlIlIlllllII) {
                lllllllllllllIIlllIIIlIlIlllllII.printStackTrace();
                return null;
            }
        }
        
        private static void llIIlIlllIllIlI() {
            (lIIlIIIllllIlI = new String[SpanFacing.lIIlIIIllllllI[5]])[SpanFacing.lIIlIIIllllllI[0]] = llIIlIlllIllIII("IAE=", "uQWVc");
            SpanFacing.lIIlIIIllllIlI[SpanFacing.lIIlIIIllllllI[2]] = llIIlIlllIllIIl("BCBmyUVi6J8=", "YChdt");
            SpanFacing.lIIlIIIllllIlI[SpanFacing.lIIlIIIllllllI[3]] = llIIlIlllIllIII("LxAfOQ==", "cUYmc");
            SpanFacing.lIIlIIIllllIlI[SpanFacing.lIIlIIIllllllI[4]] = llIIlIlllIllIII("AwEIKTI=", "QHOaf");
        }
        
        public int func_178372_b() {
            return this.field_178373_f;
        }
        
        private static void llIIlIllllIlIll() {
            (lIIlIIIllllllI = new int[6])[0] = ((0x3C ^ 0x34) & ~(0x96 ^ 0x9E));
            SpanFacing.lIIlIIIllllllI[1] = -" ".length();
            SpanFacing.lIIlIIIllllllI[2] = " ".length();
            SpanFacing.lIIlIIIllllllI[3] = "  ".length();
            SpanFacing.lIIlIIIllllllI[4] = "   ".length();
            SpanFacing.lIIlIIIllllllI[5] = (0x10 ^ 0x14);
        }
        
        public EnumFacing getFacing() {
            return this.facing;
        }
        
        public int func_178371_c() {
            return this.field_178374_g;
        }
        
        static {
            llIIlIllllIlIll();
            llIIlIlllIllIlI();
            final SpanFacing[] enum$VALUES = new SpanFacing[SpanFacing.lIIlIIIllllllI[5]];
            enum$VALUES[SpanFacing.lIIlIIIllllllI[0]] = SpanFacing.UP;
            enum$VALUES[SpanFacing.lIIlIIIllllllI[2]] = SpanFacing.DOWN;
            enum$VALUES[SpanFacing.lIIlIIIllllllI[3]] = SpanFacing.LEFT;
            enum$VALUES[SpanFacing.lIIlIIIllllllI[4]] = SpanFacing.RIGHT;
            ENUM$VALUES = enum$VALUES;
        }
    }
}
