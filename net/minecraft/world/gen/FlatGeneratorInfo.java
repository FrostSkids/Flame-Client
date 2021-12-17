// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Maps;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.Collection;
import net.minecraft.util.MathHelper;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import java.util.Map;
import java.util.List;

public class FlatGeneratorInfo
{
    private /* synthetic */ int biomeToUse;
    private static final /* synthetic */ int[] llIIIlIIlIlIll;
    private static final /* synthetic */ String[] llIIIlIIlIIIll;
    private final /* synthetic */ List<FlatLayerInfo> flatLayers;
    private final /* synthetic */ Map<String, Map<String, String>> worldFeatures;
    
    private static void lIIIlIIlIIIIIIll() {
        (llIIIlIIlIIIll = new String[FlatGeneratorInfo.llIIIlIIlIlIll[26]])[FlatGeneratorInfo.llIIIlIIlIlIll[0]] = lIIIlIIIllllllIl("ag==", "Qcifn");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[2]] = lIIIlIIIlllllllI("yR3zwfjKS5k=", "HUTot");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[3]] = lIIIlIIIlllllllI("FdC1SFbjJ/E=", "pAsYQ");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[1]] = lIIIlIIIllllllll("+3jODnkwy6Q=", "GTzgv");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[4]] = lIIIlIIIlllllllI("V9FM6cNpl+M=", "lNlVB");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[5]] = lIIIlIIIlllllllI("cP4p8OuaZ9A=", "lLHaQ");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[6]] = lIIIlIIIllllllll("yaEukD7EYow=", "wcHNp");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[7]] = lIIIlIIIlllllllI("0OBfTZd3td0=", "MniQt");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[8]] = lIIIlIIIlllllllI("AxXwH/0GPQw=", "kmdzG");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[9]] = lIIIlIIIllllllll("v7eKqW006wQ=", "GCtRM");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[10]] = lIIIlIIIllllllIl("OFg=", "drGGK");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[11]] = lIIIlIIIllllllIl("HA==", "dLMIH");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[13]] = lIIIlIIIllllllIl("aQ==", "SerId");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[14]] = lIIIlIIIllllllIl("Sw==", "qcbjs");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[15]] = lIIIlIIIllllllll("V0mCSmxn6GU=", "IbDSO");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[16]] = lIIIlIIIllllllll("mkkeH/udiUY=", "nOnzn");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[17]] = lIIIlIIIllllllll("RIYw7Xh6TwI=", "AuVNC");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[19]] = lIIIlIIIlllllllI("YduH4GU0rQk=", "oIMwG");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[20]] = lIIIlIIIlllllllI("Y2568nLM9Js=", "WIdpq");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[21]] = lIIIlIIIllllllll("mE5rkl7Up0Q=", "VbYtk");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[22]] = lIIIlIIIlllllllI("wwG0gSVoMrY=", "LiLvv");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[23]] = lIIIlIIIllllllll("emefep7z6mU=", "qATLV");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[24]] = lIIIlIIIllllllIl("IAE9KgwxDQ==", "VhQFm");
        FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[25]] = lIIIlIIIllllllIl("HTwtPiwMMA==", "kUARM");
    }
    
    private static FlatLayerInfo func_180715_a(final int llllllllllllIlllIlIlllllllIIlIll, final String llllllllllllIlllIlIllllllIllllll, final int llllllllllllIlllIlIlllllllIIlIIl) {
        String[] array;
        if (lIIIlIIlIIIIllII(llllllllllllIlllIlIlllllllIIlIll, FlatGeneratorInfo.llIIIlIIlIlIll[1])) {
            array = llllllllllllIlllIlIllllllIllllll.split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[10]], FlatGeneratorInfo.llIIIlIIlIlIll[3]);
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            array = llllllllllllIlllIlIllllllIllllll.split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[11]], FlatGeneratorInfo.llIIIlIIlIlIll[3]);
        }
        String[] llllllllllllIlllIlIlllllllIIlIII = array;
        int llllllllllllIlllIlIlllllllIIIlll = FlatGeneratorInfo.llIIIlIIlIlIll[2];
        int llllllllllllIlllIlIlllllllIIIllI = FlatGeneratorInfo.llIIIlIIlIlIll[0];
        if (lIIIlIIlIIIIllIl(llllllllllllIlllIlIlllllllIIlIII.length, FlatGeneratorInfo.llIIIlIIlIlIll[3])) {
            try {
                llllllllllllIlllIlIlllllllIIIlll = Integer.parseInt(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[0]]);
                if (lIIIlIIlIIIIllII(llllllllllllIlllIlIlllllllIIlIIl + llllllllllllIlllIlIlllllllIIIlll, FlatGeneratorInfo.llIIIlIIlIlIll[12])) {
                    llllllllllllIlllIlIlllllllIIIlll = FlatGeneratorInfo.llIIIlIIlIlIll[12] - llllllllllllIlllIlIlllllllIIlIIl;
                }
                if (lIIIlIIlIIIIlllI(llllllllllllIlllIlIlllllllIIIlll)) {
                    llllllllllllIlllIlIlllllllIIIlll = FlatGeneratorInfo.llIIIlIIlIlIll[0];
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return null;
                    }
                }
            }
            catch (Throwable llllllllllllIlllIlIlllllllIIIlIl) {
                return null;
            }
        }
        Block llllllllllllIlllIlIlllllllIIIlII = null;
        try {
            final String llllllllllllIlllIlIlllllllIIIIll = llllllllllllIlllIlIlllllllIIlIII[llllllllllllIlllIlIlllllllIIlIII.length - FlatGeneratorInfo.llIIIlIIlIlIll[2]];
            if (lIIIlIIlIIIIllll(llllllllllllIlllIlIlllllllIIlIll, FlatGeneratorInfo.llIIIlIIlIlIll[1])) {
                llllllllllllIlllIlIlllllllIIlIII = llllllllllllIlllIlIlllllllIIIIll.split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[13]], FlatGeneratorInfo.llIIIlIIlIlIll[3]);
                if (lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllllIIlIII.length, FlatGeneratorInfo.llIIIlIIlIlIll[2])) {
                    llllllllllllIlllIlIlllllllIIIllI = Integer.parseInt(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[2]]);
                }
                llllllllllllIlllIlIlllllllIIIlII = Block.getBlockById(Integer.parseInt(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[0]]));
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            else {
                llllllllllllIlllIlIlllllllIIlIII = llllllllllllIlllIlIlllllllIIIIll.split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[14]], FlatGeneratorInfo.llIIIlIIlIlIll[1]);
                Block blockFromName;
                if (lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllllIIlIII.length, FlatGeneratorInfo.llIIIlIIlIlIll[2])) {
                    blockFromName = Block.getBlockFromName(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[0]])).append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[15]]).append(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[2]])));
                    "".length();
                    if ("  ".length() <= 0) {
                        return null;
                    }
                }
                else {
                    blockFromName = null;
                }
                llllllllllllIlllIlIlllllllIIIlII = blockFromName;
                if (lIIIlIIlIIIlIIIl(llllllllllllIlllIlIlllllllIIIlII)) {
                    int int1;
                    if (lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllllIIlIII.length, FlatGeneratorInfo.llIIIlIIlIlIll[3])) {
                        int1 = Integer.parseInt(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[3]]);
                        "".length();
                        if ((0x5C ^ 0x58) <= 0) {
                            return null;
                        }
                    }
                    else {
                        int1 = FlatGeneratorInfo.llIIIlIIlIlIll[0];
                    }
                    llllllllllllIlllIlIlllllllIIIllI = int1;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlllIlIlllllllIIIlII = Block.getBlockFromName(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[0]]);
                    if (lIIIlIIlIIIlIIIl(llllllllllllIlllIlIlllllllIIIlII)) {
                        int int2;
                        if (lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllllIIlIII.length, FlatGeneratorInfo.llIIIlIIlIlIll[2])) {
                            int2 = Integer.parseInt(llllllllllllIlllIlIlllllllIIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[2]]);
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else {
                            int2 = FlatGeneratorInfo.llIIIlIIlIlIll[0];
                        }
                        llllllllllllIlllIlIlllllllIIIllI = int2;
                    }
                }
                if (lIIIlIIlIIIlIIlI(llllllllllllIlllIlIlllllllIIIlII)) {
                    return null;
                }
            }
            if (lIIIlIIlIIIlIIll(llllllllllllIlllIlIlllllllIIIlII, Blocks.air)) {
                llllllllllllIlllIlIlllllllIIIllI = FlatGeneratorInfo.llIIIlIIlIlIll[0];
            }
            if (!lIIIlIIlIIIlIlII(llllllllllllIlllIlIlllllllIIIllI) || lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllllIIIllI, FlatGeneratorInfo.llIIIlIIlIlIll[16])) {
                llllllllllllIlllIlIlllllllIIIllI = FlatGeneratorInfo.llIIIlIIlIlIll[0];
                "".length();
                if ((0x6D ^ 0x69) <= 0) {
                    return null;
                }
            }
        }
        catch (Throwable llllllllllllIlllIlIlllllllIIIIlI) {
            return null;
        }
        final FlatLayerInfo llllllllllllIlllIlIlllllllIIIIIl = new FlatLayerInfo(llllllllllllIlllIlIlllllllIIlIll, llllllllllllIlllIlIlllllllIIIlll, llllllllllllIlllIlIlllllllIIIlII, llllllllllllIlllIlIlllllllIIIllI);
        llllllllllllIlllIlIlllllllIIIIIl.setMinY(llllllllllllIlllIlIlllllllIIlIIl);
        return llllllllllllIlllIlIlllllllIIIIIl;
    }
    
    private static boolean lIIIlIIlIIIIlIlI(final int llllllllllllIlllIlIlllllIIIIIIlI) {
        return llllllllllllIlllIlIlllllIIIIIIlI == 0;
    }
    
    public void func_82645_d() {
        int llllllllllllIlllIlIlllllllllIIll = FlatGeneratorInfo.llIIIlIIlIlIll[0];
        final double llllllllllllIlllIlIllllllllIlllI = (double)this.flatLayers.iterator();
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!lIIIlIIlIIIIlIlI(((Iterator)llllllllllllIlllIlIllllllllIlllI).hasNext() ? 1 : 0)) {
            final FlatLayerInfo llllllllllllIlllIlIlllllllllIIlI = ((Iterator<FlatLayerInfo>)llllllllllllIlllIlIllllllllIlllI).next();
            llllllllllllIlllIlIlllllllllIIlI.setMinY(llllllllllllIlllIlIlllllllllIIll);
            llllllllllllIlllIlIlllllllllIIll += llllllllllllIlllIlIlllllllllIIlI.getLayerCount();
        }
    }
    
    public static FlatGeneratorInfo createFlatGeneratorFromString(final String llllllllllllIlllIlIlllllIlllIlIl) {
        if (lIIIlIIlIIIlIIlI(llllllllllllIlllIlIlllllIlllIlIl)) {
            return getDefaultFlatGenerator();
        }
        final String[] llllllllllllIlllIlIlllllIlllIlII = llllllllllllIlllIlIlllllIlllIlIl.split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[17]], FlatGeneratorInfo.llIIIlIIlIlIll[18]);
        int intWithDefault;
        if (lIIIlIIlIIIIllIl(llllllllllllIlllIlIlllllIlllIlII.length, FlatGeneratorInfo.llIIIlIIlIlIll[2])) {
            intWithDefault = FlatGeneratorInfo.llIIIlIIlIlIll[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            intWithDefault = MathHelper.parseIntWithDefault(llllllllllllIlllIlIlllllIlllIlII[FlatGeneratorInfo.llIIIlIIlIlIll[0]], FlatGeneratorInfo.llIIIlIIlIlIll[0]);
        }
        final int llllllllllllIlllIlIlllllIlllIIll = intWithDefault;
        if (!lIIIlIIlIIIlIlII(llllllllllllIlllIlIlllllIlllIIll) || !lIIIlIIlIIIlIlIl(llllllllllllIlllIlIlllllIlllIIll, FlatGeneratorInfo.llIIIlIIlIlIll[1])) {
            return getDefaultFlatGenerator();
        }
        final FlatGeneratorInfo llllllllllllIlllIlIlllllIlllIIlI = new FlatGeneratorInfo();
        int n;
        if (lIIIlIIlIIIIllIl(llllllllllllIlllIlIlllllIlllIlII.length, FlatGeneratorInfo.llIIIlIIlIlIll[2])) {
            n = FlatGeneratorInfo.llIIIlIIlIlIll[0];
            "".length();
            if (-(0x2B ^ 0x2F) > 0) {
                return null;
            }
        }
        else {
            n = FlatGeneratorInfo.llIIIlIIlIlIll[2];
        }
        int llllllllllllIlllIlIlllllIlllIIIl = n;
        final List<FlatLayerInfo> llllllllllllIlllIlIlllllIlllIIII = func_180716_a(llllllllllllIlllIlIlllllIlllIIll, llllllllllllIlllIlIlllllIlllIlII[llllllllllllIlllIlIlllllIlllIIIl++]);
        if (lIIIlIIlIIIlIIIl(llllllllllllIlllIlIlllllIlllIIII) && lIIIlIIlIIIIlIlI(llllllllllllIlllIlIlllllIlllIIII.isEmpty() ? 1 : 0)) {
            llllllllllllIlllIlIlllllIlllIIlI.getFlatLayers().addAll(llllllllllllIlllIlIlllllIlllIIII);
            "".length();
            llllllllllllIlllIlIlllllIlllIIlI.func_82645_d();
            int llllllllllllIlllIlIlllllIllIllll = BiomeGenBase.plains.biomeID;
            if (lIIIlIIlIIIIlIll(llllllllllllIlllIlIlllllIlllIIll) && lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllIlllIlII.length, llllllllllllIlllIlIlllllIlllIIIl)) {
                llllllllllllIlllIlIlllllIllIllll = MathHelper.parseIntWithDefault(llllllllllllIlllIlIlllllIlllIlII[llllllllllllIlllIlIlllllIlllIIIl++], llllllllllllIlllIlIlllllIllIllll);
            }
            llllllllllllIlllIlIlllllIlllIIlI.setBiome(llllllllllllIlllIlIlllllIllIllll);
            if (lIIIlIIlIIIIlIll(llllllllllllIlllIlIlllllIlllIIll) && lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllIlllIlII.length, llllllllllllIlllIlIlllllIlllIIIl)) {
                final String[] llllllllllllIlllIlIlllllIllIlllI = llllllllllllIlllIlIlllllIlllIlII[llllllllllllIlllIlIlllllIlllIIIl++].toLowerCase().split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[19]]);
                final float llllllllllllIlllIlIlllllIlIlllII;
                final String llllllllllllIlllIlIlllllIlIlllIl = (String)((String[])(Object)(llllllllllllIlllIlIlllllIlIlllII = (float)(Object)llllllllllllIlllIlIlllllIllIlllI)).length;
                boolean llllllllllllIlllIlIlllllIlIllllI = FlatGeneratorInfo.llIIIlIIlIlIll[0] != 0;
                "".length();
                if ((0xC4 ^ 0xC0) == 0x0) {
                    return null;
                }
                while (!lIIIlIIlIIIIllII(llllllllllllIlllIlIlllllIlIllllI ? 1 : 0, (int)llllllllllllIlllIlIlllllIlIlllIl)) {
                    final String llllllllllllIlllIlIlllllIllIllIl = llllllllllllIlllIlIlllllIlIlllII[llllllllllllIlllIlIlllllIlIllllI];
                    final String[] llllllllllllIlllIlIlllllIllIllII = llllllllllllIlllIlIlllllIllIllIl.split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[20]], FlatGeneratorInfo.llIIIlIIlIlIll[3]);
                    final Map<String, String> llllllllllllIlllIlIlllllIllIlIll = (Map<String, String>)Maps.newHashMap();
                    if (lIIIlIIlIIIIlIll(llllllllllllIlllIlIlllllIllIllII[FlatGeneratorInfo.llIIIlIIlIlIll[0]].length())) {
                        llllllllllllIlllIlIlllllIlllIIlI.getWorldFeatures().put(llllllllllllIlllIlIlllllIllIllII[FlatGeneratorInfo.llIIIlIIlIlIll[0]], llllllllllllIlllIlIlllllIllIlIll);
                        "".length();
                        if (lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllIllIllII.length, FlatGeneratorInfo.llIIIlIIlIlIll[2]) && lIIIlIIlIIIlIllI(llllllllllllIlllIlIlllllIllIllII[FlatGeneratorInfo.llIIIlIIlIlIll[2]].endsWith(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[21]]) ? 1 : 0) && lIIIlIIlIIIlIIII(llllllllllllIlllIlIlllllIllIllII[FlatGeneratorInfo.llIIIlIIlIlIll[2]].length(), FlatGeneratorInfo.llIIIlIIlIlIll[2])) {
                            final String[] llllllllllllIlllIlIlllllIllIlIlI = llllllllllllIlllIlIlllllIllIllII[FlatGeneratorInfo.llIIIlIIlIlIll[2]].substring(FlatGeneratorInfo.llIIIlIIlIlIll[0], llllllllllllIlllIlIlllllIllIllII[FlatGeneratorInfo.llIIIlIIlIlIll[2]].length() - FlatGeneratorInfo.llIIIlIIlIlIll[2]).split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[22]]);
                            int llllllllllllIlllIlIlllllIllIlIIl = FlatGeneratorInfo.llIIIlIIlIlIll[0];
                            "".length();
                            if (((0x7E ^ 0x24) & ~(0xC2 ^ 0x98)) >= "  ".length()) {
                                return null;
                            }
                            while (!lIIIlIIlIIIIllII(llllllllllllIlllIlIlllllIllIlIIl, llllllllllllIlllIlIlllllIllIlIlI.length)) {
                                final String[] llllllllllllIlllIlIlllllIllIlIII = llllllllllllIlllIlIlllllIllIlIlI[llllllllllllIlllIlIlllllIllIlIIl].split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[23]], FlatGeneratorInfo.llIIIlIIlIlIll[3]);
                                if (lIIIlIIlIIIIllIl(llllllllllllIlllIlIlllllIllIlIII.length, FlatGeneratorInfo.llIIIlIIlIlIll[3])) {
                                    llllllllllllIlllIlIlllllIllIlIll.put(llllllllllllIlllIlIlllllIllIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[0]], llllllllllllIlllIlIlllllIllIlIII[FlatGeneratorInfo.llIIIlIIlIlIll[2]]);
                                    "".length();
                                }
                                ++llllllllllllIlllIlIlllllIllIlIIl;
                            }
                        }
                    }
                    ++llllllllllllIlllIlIlllllIlIllllI;
                }
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIlllIlIlllllIlllIIlI.getWorldFeatures().put(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[24]], Maps.newHashMap());
                "".length();
            }
            return llllllllllllIlllIlIlllllIlllIIlI;
        }
        return getDefaultFlatGenerator();
    }
    
    private static boolean lIIIlIIlIIIlIlIl(final int llllllllllllIlllIlIlllllIIIlIIll, final int llllllllllllIlllIlIlllllIIIlIIlI) {
        return llllllllllllIlllIlIlllllIIIlIIll <= llllllllllllIlllIlIlllllIIIlIIlI;
    }
    
    private static boolean lIIIlIIlIIIlIIlI(final Object llllllllllllIlllIlIlllllIIIIIllI) {
        return llllllllllllIlllIlIlllllIIIIIllI == null;
    }
    
    private static boolean lIIIlIIlIIIlIIII(final int llllllllllllIlllIlIlllllIIIIllll, final int llllllllllllIlllIlIlllllIIIIlllI) {
        return llllllllllllIlllIlIlllllIIIIllll > llllllllllllIlllIlIlllllIIIIlllI;
    }
    
    private static boolean lIIIlIIlIIIlIIll(final Object llllllllllllIlllIlIlllllIIIIlIIl, final Object llllllllllllIlllIlIlllllIIIIlIII) {
        return llllllllllllIlllIlIlllllIIIIlIIl == llllllllllllIlllIlIlllllIIIIlIII;
    }
    
    private static boolean lIIIlIIlIIIIllIl(final int llllllllllllIlllIlIlllllIIIlllll, final int llllllllllllIlllIlIlllllIIIllllI) {
        return llllllllllllIlllIlIlllllIIIlllll == llllllllllllIlllIlIlllllIIIllllI;
    }
    
    private static boolean lIIIlIIlIIIlIIIl(final Object llllllllllllIlllIlIlllllIIIIllII) {
        return llllllllllllIlllIlIlllllIIIIllII != null;
    }
    
    private static boolean lIIIlIIlIIIIllII(final int llllllllllllIlllIlIlllllIIIllIll, final int llllllllllllIlllIlIlllllIIIllIlI) {
        return llllllllllllIlllIlIlllllIIIllIll >= llllllllllllIlllIlIlllllIIIllIlI;
    }
    
    private static String lIIIlIIIllllllll(final String llllllllllllIlllIlIlllllIIllllIl, final String llllllllllllIlllIlIlllllIIlllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlllllIlIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlllllIIlllllI.getBytes(StandardCharsets.UTF_8)), FlatGeneratorInfo.llIIIlIIlIlIll[8]), "DES");
            final Cipher llllllllllllIlllIlIlllllIlIIIIIl = Cipher.getInstance("DES");
            llllllllllllIlllIlIlllllIlIIIIIl.init(FlatGeneratorInfo.llIIIlIIlIlIll[3], llllllllllllIlllIlIlllllIlIIIIlI);
            return new String(llllllllllllIlllIlIlllllIlIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlllllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlllllIlIIIIII) {
            llllllllllllIlllIlIlllllIlIIIIII.printStackTrace();
            return null;
        }
    }
    
    public List<FlatLayerInfo> getFlatLayers() {
        return this.flatLayers;
    }
    
    private static boolean lIIIlIIlIIIlIllI(final int llllllllllllIlllIlIlllllIIIIIlII) {
        return llllllllllllIlllIlIlllllIIIIIlII != 0;
    }
    
    public FlatGeneratorInfo() {
        this.flatLayers = (List<FlatLayerInfo>)Lists.newArrayList();
        this.worldFeatures = (Map<String, Map<String, String>>)Maps.newHashMap();
    }
    
    public Map<String, Map<String, String>> getWorldFeatures() {
        return this.worldFeatures;
    }
    
    private static boolean lIIIlIIlIIIIlllI(final int llllllllllllIlllIlIllllIlllllllI) {
        return llllllllllllIlllIlIllllIlllllllI < 0;
    }
    
    static {
        lIIIlIIlIIIIlIIl();
        lIIIlIIlIIIIIIll();
    }
    
    private static boolean lIIIlIIlIIIlIlII(final int llllllllllllIlllIlIlllllIIIIIIII) {
        return llllllllllllIlllIlIlllllIIIIIIII >= 0;
    }
    
    private static void lIIIlIIlIIIIlIIl() {
        (llIIIlIIlIlIll = new int[27])[0] = ((0xDF ^ 0xAD ^ (0x35 ^ 0x74)) & (48 + 30 - 41 + 105 ^ 53 + 48 - 45 + 133 ^ -" ".length()));
        FlatGeneratorInfo.llIIIlIIlIlIll[1] = "   ".length();
        FlatGeneratorInfo.llIIIlIIlIlIll[2] = " ".length();
        FlatGeneratorInfo.llIIIlIIlIlIll[3] = "  ".length();
        FlatGeneratorInfo.llIIIlIIlIlIll[4] = (59 + 114 - 63 + 83 ^ 170 + 92 - 200 + 135);
        FlatGeneratorInfo.llIIIlIIlIlIll[5] = (0x34 ^ 0x31);
        FlatGeneratorInfo.llIIIlIIlIlIll[6] = (35 + 37 - 64 + 140 ^ 3 + 14 + 115 + 14);
        FlatGeneratorInfo.llIIIlIIlIlIll[7] = (0x1A ^ 0x5D ^ (0x32 ^ 0x72));
        FlatGeneratorInfo.llIIIlIIlIlIll[8] = (0x0 ^ 0x8);
        FlatGeneratorInfo.llIIIlIIlIlIll[9] = (0x55 ^ 0x5C);
        FlatGeneratorInfo.llIIIlIIlIlIll[10] = (0x54 ^ 0x5E);
        FlatGeneratorInfo.llIIIlIIlIlIll[11] = (96 + 141 - 129 + 52 ^ 64 + 87 - 88 + 108);
        FlatGeneratorInfo.llIIIlIIlIlIll[12] = (0xFFFFB557 & 0x4BA8);
        FlatGeneratorInfo.llIIIlIIlIlIll[13] = (0xAC ^ 0xA0);
        FlatGeneratorInfo.llIIIlIIlIlIll[14] = (0x1 ^ 0xC);
        FlatGeneratorInfo.llIIIlIIlIlIll[15] = (0x72 ^ 0x7C);
        FlatGeneratorInfo.llIIIlIIlIlIll[16] = (0x8F ^ 0x80);
        FlatGeneratorInfo.llIIIlIIlIlIll[17] = (0x54 ^ 0x50 ^ (0xB6 ^ 0xA2));
        FlatGeneratorInfo.llIIIlIIlIlIll[18] = -" ".length();
        FlatGeneratorInfo.llIIIlIIlIlIll[19] = (0x47 ^ 0x56);
        FlatGeneratorInfo.llIIIlIIlIlIll[20] = (125 + 34 - 147 + 122 ^ 113 + 127 - 197 + 105);
        FlatGeneratorInfo.llIIIlIIlIlIll[21] = (0xBA ^ 0x88 ^ (0x24 ^ 0x5));
        FlatGeneratorInfo.llIIIlIIlIlIll[22] = (16 + 126 - 60 + 46 ^ 104 + 68 - 163 + 139);
        FlatGeneratorInfo.llIIIlIIlIlIll[23] = (0x50 ^ 0x44 ^ " ".length());
        FlatGeneratorInfo.llIIIlIIlIlIll[24] = (0x3E ^ 0x42 ^ (0x43 ^ 0x29));
        FlatGeneratorInfo.llIIIlIIlIlIll[25] = (0x6A ^ 0x7D);
        FlatGeneratorInfo.llIIIlIIlIlIll[26] = (0x4E ^ 0x6C ^ (0x2 ^ 0x38));
    }
    
    public int getBiome() {
        return this.biomeToUse;
    }
    
    private static String lIIIlIIIllllllIl(String llllllllllllIlllIlIlllllIIlIlIlI, final String llllllllllllIlllIlIlllllIIlIlIIl) {
        llllllllllllIlllIlIlllllIIlIlIlI = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIlllllIIlIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlllllIIlIllIl = new StringBuilder();
        final char[] llllllllllllIlllIlIlllllIIlIllII = llllllllllllIlllIlIlllllIIlIlIIl.toCharArray();
        int llllllllllllIlllIlIlllllIIlIlIll = FlatGeneratorInfo.llIIIlIIlIlIll[0];
        final float llllllllllllIlllIlIlllllIIlIIlIl = (Object)((String)llllllllllllIlllIlIlllllIIlIlIlI).toCharArray();
        final Exception llllllllllllIlllIlIlllllIIlIIlII = (Exception)llllllllllllIlllIlIlllllIIlIIlIl.length;
        String llllllllllllIlllIlIlllllIIlIIIll = (String)FlatGeneratorInfo.llIIIlIIlIlIll[0];
        while (lIIIlIIlIIIIllll((int)llllllllllllIlllIlIlllllIIlIIIll, (int)llllllllllllIlllIlIlllllIIlIIlII)) {
            final char llllllllllllIlllIlIlllllIIllIIII = llllllllllllIlllIlIlllllIIlIIlIl[llllllllllllIlllIlIlllllIIlIIIll];
            llllllllllllIlllIlIlllllIIlIllIl.append((char)(llllllllllllIlllIlIlllllIIllIIII ^ llllllllllllIlllIlIlllllIIlIllII[llllllllllllIlllIlIlllllIIlIlIll % llllllllllllIlllIlIlllllIIlIllII.length]));
            "".length();
            ++llllllllllllIlllIlIlllllIIlIlIll;
            ++llllllllllllIlllIlIlllllIIlIIIll;
            "".length();
            if ((0x91 ^ 0x95) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlllllIIlIllIl);
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlllIlIllllllllIIIll = new StringBuilder();
        llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIlIll[1]);
        "".length();
        llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[0]]);
        "".length();
        int llllllllllllIlllIlIllllllllIIIlI = FlatGeneratorInfo.llIIIlIIlIlIll[0];
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!lIIIlIIlIIIIllII(llllllllllllIlllIlIllllllllIIIlI, this.flatLayers.size())) {
            if (lIIIlIIlIIIIlIll(llllllllllllIlllIlIllllllllIIIlI)) {
                llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[2]]);
                "".length();
            }
            llllllllllllIlllIlIllllllllIIIll.append(this.flatLayers.get(llllllllllllIlllIlIllllllllIIIlI).toString());
            "".length();
            ++llllllllllllIlllIlIllllllllIIIlI;
        }
        llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[3]]);
        "".length();
        llllllllllllIlllIlIllllllllIIIll.append(this.biomeToUse);
        "".length();
        if (lIIIlIIlIIIIlIlI(this.worldFeatures.isEmpty() ? 1 : 0)) {
            llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[1]]);
            "".length();
            int llllllllllllIlllIlIllllllllIIIIl = FlatGeneratorInfo.llIIIlIIlIlIll[0];
            final float llllllllllllIlllIlIlllllllIllIII = (float)this.worldFeatures.entrySet().iterator();
            "".length();
            if (((0xD6 ^ 0x99) & ~(0x2E ^ 0x61)) != 0x0) {
                return null;
            }
            while (!lIIIlIIlIIIIlIlI(((Iterator)llllllllllllIlllIlIlllllllIllIII).hasNext() ? 1 : 0)) {
                final Map.Entry<String, Map<String, String>> llllllllllllIlllIlIllllllllIIIII = ((Iterator<Map.Entry<String, Map<String, String>>>)llllllllllllIlllIlIlllllllIllIII).next();
                if (lIIIlIIlIIIIlIll(llllllllllllIlllIlIllllllllIIIIl++)) {
                    llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[4]]);
                    "".length();
                }
                llllllllllllIlllIlIllllllllIIIll.append(llllllllllllIlllIlIllllllllIIIII.getKey().toLowerCase());
                "".length();
                final Map<String, String> llllllllllllIlllIlIlllllllIlllll = llllllllllllIlllIlIllllllllIIIII.getValue();
                if (lIIIlIIlIIIIlIlI(llllllllllllIlllIlIlllllllIlllll.isEmpty() ? 1 : 0)) {
                    llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[5]]);
                    "".length();
                    int llllllllllllIlllIlIlllllllIllllI = FlatGeneratorInfo.llIIIlIIlIlIll[0];
                    final long llllllllllllIlllIlIlllllllIlIlII = (long)llllllllllllIlllIlIlllllllIlllll.entrySet().iterator();
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                    while (!lIIIlIIlIIIIlIlI(((Iterator)llllllllllllIlllIlIlllllllIlIlII).hasNext() ? 1 : 0)) {
                        final Map.Entry<String, String> llllllllllllIlllIlIlllllllIlllIl = ((Iterator<Map.Entry<String, String>>)llllllllllllIlllIlIlllllllIlIlII).next();
                        if (lIIIlIIlIIIIlIll(llllllllllllIlllIlIlllllllIllllI++)) {
                            llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[6]]);
                            "".length();
                        }
                        llllllllllllIlllIlIllllllllIIIll.append(llllllllllllIlllIlIlllllllIlllIl.getKey());
                        "".length();
                        llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[7]]);
                        "".length();
                        llllllllllllIlllIlIllllllllIIIll.append(llllllllllllIlllIlIlllllllIlllIl.getValue());
                        "".length();
                    }
                    llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[8]]);
                    "".length();
                }
            }
            "".length();
            if (((0xFD ^ 0xAE) & ~(0x3C ^ 0x6F)) != 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIlllIlIllllllllIIIll.append(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[9]]);
            "".length();
        }
        return String.valueOf(llllllllllllIlllIlIllllllllIIIll);
    }
    
    private static String lIIIlIIIlllllllI(final String llllllllllllIlllIlIlllllIlIIlIlI, final String llllllllllllIlllIlIlllllIlIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlllllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlllllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlllllIlIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlllllIlIIlllI.init(FlatGeneratorInfo.llIIIlIIlIlIll[3], llllllllllllIlllIlIlllllIlIIllll);
            return new String(llllllllllllIlllIlIlllllIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlllllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlllllIlIIllIl) {
            llllllllllllIlllIlIlllllIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIlIIIIlIll(final int llllllllllllIlllIlIllllIllllllII) {
        return llllllllllllIlllIlIllllIllllllII > 0;
    }
    
    private static boolean lIIIlIIlIIIIllll(final int llllllllllllIlllIlIlllllIIIlIlll, final int llllllllllllIlllIlIlllllIIIlIllI) {
        return llllllllllllIlllIlIlllllIIIlIlll < llllllllllllIlllIlIlllllIIIlIllI;
    }
    
    public static FlatGeneratorInfo getDefaultFlatGenerator() {
        final FlatGeneratorInfo llllllllllllIlllIlIlllllIlIlIlIl = new FlatGeneratorInfo();
        llllllllllllIlllIlIlllllIlIlIlIl.setBiome(BiomeGenBase.plains.biomeID);
        llllllllllllIlllIlIlllllIlIlIlIl.getFlatLayers().add(new FlatLayerInfo(FlatGeneratorInfo.llIIIlIIlIlIll[2], Blocks.bedrock));
        "".length();
        llllllllllllIlllIlIlllllIlIlIlIl.getFlatLayers().add(new FlatLayerInfo(FlatGeneratorInfo.llIIIlIIlIlIll[3], Blocks.dirt));
        "".length();
        llllllllllllIlllIlIlllllIlIlIlIl.getFlatLayers().add(new FlatLayerInfo(FlatGeneratorInfo.llIIIlIIlIlIll[2], Blocks.grass));
        "".length();
        llllllllllllIlllIlIlllllIlIlIlIl.func_82645_d();
        llllllllllllIlllIlIlllllIlIlIlIl.getWorldFeatures().put(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[25]], Maps.newHashMap());
        "".length();
        return llllllllllllIlllIlIlllllIlIlIlIl;
    }
    
    public void setBiome(final int llllllllllllIlllIlIlllllllllllll) {
        this.biomeToUse = llllllllllllIlllIlIlllllllllllll;
    }
    
    private static List<FlatLayerInfo> func_180716_a(final int llllllllllllIlllIlIllllllIlIlllI, final String llllllllllllIlllIlIllllllIlIllIl) {
        if (!lIIIlIIlIIIlIIIl(llllllllllllIlllIlIllllllIlIllIl) || !lIIIlIIlIIIIllII(llllllllllllIlllIlIllllllIlIllIl.length(), FlatGeneratorInfo.llIIIlIIlIlIll[2])) {
            return null;
        }
        final List<FlatLayerInfo> llllllllllllIlllIlIllllllIlIllII = (List<FlatLayerInfo>)Lists.newArrayList();
        final String[] llllllllllllIlllIlIllllllIlIlIll = llllllllllllIlllIlIllllllIlIllIl.split(FlatGeneratorInfo.llIIIlIIlIIIll[FlatGeneratorInfo.llIIIlIIlIlIll[16]]);
        int llllllllllllIlllIlIllllllIlIlIlI = FlatGeneratorInfo.llIIIlIIlIlIll[0];
        final int llllllllllllIlllIlIllllllIIlllll;
        final byte llllllllllllIlllIlIllllllIlIIIII = (byte)((String[])(Object)(llllllllllllIlllIlIllllllIIlllll = (int)(Object)llllllllllllIlllIlIllllllIlIlIll)).length;
        double llllllllllllIlllIlIllllllIlIIIIl = FlatGeneratorInfo.llIIIlIIlIlIll[0];
        "".length();
        if (-"  ".length() > 0) {
            return null;
        }
        while (!lIIIlIIlIIIIllII((int)llllllllllllIlllIlIllllllIlIIIIl, llllllllllllIlllIlIllllllIlIIIII)) {
            final String llllllllllllIlllIlIllllllIlIlIIl = llllllllllllIlllIlIllllllIIlllll[llllllllllllIlllIlIllllllIlIIIIl];
            final FlatLayerInfo llllllllllllIlllIlIllllllIlIlIII = func_180715_a(llllllllllllIlllIlIllllllIlIlllI, llllllllllllIlllIlIllllllIlIlIIl, llllllllllllIlllIlIllllllIlIlIlI);
            if (lIIIlIIlIIIlIIlI(llllllllllllIlllIlIllllllIlIlIII)) {
                return null;
            }
            llllllllllllIlllIlIllllllIlIllII.add(llllllllllllIlllIlIllllllIlIlIII);
            "".length();
            llllllllllllIlllIlIllllllIlIlIlI += llllllllllllIlllIlIllllllIlIlIII.getLayerCount();
            ++llllllllllllIlllIlIllllllIlIIIIl;
        }
        return llllllllllllIlllIlIllllllIlIllII;
    }
}
