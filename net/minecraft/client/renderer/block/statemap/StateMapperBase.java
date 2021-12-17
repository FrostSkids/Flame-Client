// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.statemap;

import java.util.Iterator;
import net.minecraft.block.Block;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Maps;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import java.util.Map;

public abstract class StateMapperBase implements IStateMapper
{
    protected /* synthetic */ Map<IBlockState, ModelResourceLocation> mapStateModelLocations;
    private static final /* synthetic */ String[] lIlllllIlIlIlI;
    private static final /* synthetic */ int[] lIlllllIlIllII;
    
    private static boolean lIIIIlIlIlllIlll(final int llllllllllllIllllIIllIIlIlIIlIIl) {
        return llllllllllllIllllIIllIIlIlIIlIIl != 0;
    }
    
    public String getPropertyString(final Map<IProperty, Comparable> llllllllllllIllllIIllIIllIIlIIIl) {
        final StringBuilder llllllllllllIllllIIllIIllIIlIlIl = new StringBuilder();
        final int llllllllllllIllllIIllIIllIIIlllI = (int)llllllllllllIllllIIllIIllIIlIIIl.entrySet().iterator();
        "".length();
        if (((0x6B ^ 0x11 ^ (0x8E ^ 0xBC)) & (72 + 201 - 220 + 166 ^ 86 + 14 - 66 + 113 ^ -" ".length())) != ((0xF2 ^ 0x8B ^ (0xA ^ 0x3B)) & (15 + 72 + 101 + 15 ^ 57 + 106 - 68 + 36 ^ -" ".length()))) {
            return null;
        }
        while (!lIIIIlIlIllllIII(((Iterator)llllllllllllIllllIIllIIllIIIlllI).hasNext() ? 1 : 0)) {
            final Map.Entry<IProperty, Comparable> llllllllllllIllllIIllIIllIIlIlII = ((Iterator<Map.Entry<IProperty, Comparable>>)llllllllllllIllllIIllIIllIIIlllI).next();
            if (lIIIIlIlIlllIlll(llllllllllllIllllIIllIIllIIlIlIl.length())) {
                llllllllllllIllllIIllIIllIIlIlIl.append(StateMapperBase.lIlllllIlIlIlI[StateMapperBase.lIlllllIlIllII[0]]);
                "".length();
            }
            final IProperty llllllllllllIllllIIllIIllIIlIIll = llllllllllllIllllIIllIIllIIlIlII.getKey();
            final Comparable llllllllllllIllllIIllIIllIIlIIlI = llllllllllllIllllIIllIIllIIlIlII.getValue();
            llllllllllllIllllIIllIIllIIlIlIl.append(llllllllllllIllllIIllIIllIIlIIll.getName());
            "".length();
            llllllllllllIllllIIllIIllIIlIlIl.append(StateMapperBase.lIlllllIlIlIlI[StateMapperBase.lIlllllIlIllII[1]]);
            "".length();
            llllllllllllIllllIIllIIllIIlIlIl.append(llllllllllllIllllIIllIIllIIlIIll.getName(llllllllllllIllllIIllIIllIIlIIlI));
            "".length();
        }
        if (lIIIIlIlIllllIII(llllllllllllIllllIIllIIllIIlIlIl.length())) {
            llllllllllllIllllIIllIIllIIlIlIl.append(StateMapperBase.lIlllllIlIlIlI[StateMapperBase.lIlllllIlIllII[2]]);
            "".length();
        }
        return String.valueOf(llllllllllllIllllIIllIIllIIlIlIl);
    }
    
    static {
        lIIIIlIlIlllIlIl();
        lIIIIlIlIlllIIll();
    }
    
    public StateMapperBase() {
        this.mapStateModelLocations = (Map<IBlockState, ModelResourceLocation>)Maps.newLinkedHashMap();
    }
    
    private static String lIIIIlIlIlllIIIl(final String llllllllllllIllllIIllIIlIlllIlll, final String llllllllllllIllllIIllIIlIllllIII) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIIlIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIIlIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIllIIlIllllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIllIIlIllllIll.init(StateMapperBase.lIlllllIlIllII[2], llllllllllllIllllIIllIIlIlllllII);
            return new String(llllllllllllIllllIIllIIlIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIIlIllllIlI) {
            llllllllllllIllllIIllIIlIllllIlI.printStackTrace();
            return null;
        }
    }
    
    protected abstract ModelResourceLocation getModelResourceLocation(final IBlockState p0);
    
    private static String lIIIIlIlIlllIIlI(final String llllllllllllIllllIIllIIlIlIlIlII, final String llllllllllllIllllIIllIIlIlIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIIlIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StateMapperBase.lIlllllIlIllII[4]), "DES");
            final Cipher llllllllllllIllllIIllIIlIlIlIllI = Cipher.getInstance("DES");
            llllllllllllIllllIIllIIlIlIlIllI.init(StateMapperBase.lIlllllIlIllII[2], llllllllllllIllllIIllIIlIlIlIlll);
            return new String(llllllllllllIllllIIllIIlIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIIlIlIlIlIl) {
            llllllllllllIllllIIllIIlIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlIlIlllIIll() {
        (lIlllllIlIlIlI = new String[StateMapperBase.lIlllllIlIllII[3]])[StateMapperBase.lIlllllIlIllII[0]] = lIIIIlIlIlllIIII("Wg==", "vKjxH");
        StateMapperBase.lIlllllIlIlIlI[StateMapperBase.lIlllllIlIllII[1]] = lIIIIlIlIlllIIIl("FFxhjVMGxwI=", "oHaEV");
        StateMapperBase.lIlllllIlIlIlI[StateMapperBase.lIlllllIlIllII[2]] = lIIIIlIlIlllIIlI("D+SDqQzPEd8=", "rUbBR");
    }
    
    private static void lIIIIlIlIlllIlIl() {
        (lIlllllIlIllII = new int[5])[0] = ((0x7B ^ 0x59) & ~(0x63 ^ 0x41));
        StateMapperBase.lIlllllIlIllII[1] = " ".length();
        StateMapperBase.lIlllllIlIllII[2] = "  ".length();
        StateMapperBase.lIlllllIlIllII[3] = "   ".length();
        StateMapperBase.lIlllllIlIllII[4] = (0x44 ^ 0x4C);
    }
    
    @Override
    public Map<IBlockState, ModelResourceLocation> putStateModelLocations(final Block llllllllllllIllllIIllIIllIIIIllI) {
        final int llllllllllllIllllIIllIIllIIIIIIl = (int)llllllllllllIllllIIllIIllIIIIllI.getBlockState().getValidStates().iterator();
        "".length();
        if ("  ".length() < 0) {
            return null;
        }
        while (!lIIIIlIlIllllIII(((Iterator)llllllllllllIllllIIllIIllIIIIIIl).hasNext() ? 1 : 0)) {
            final IBlockState llllllllllllIllllIIllIIllIIIIlIl = ((Iterator<IBlockState>)llllllllllllIllllIIllIIllIIIIIIl).next();
            this.mapStateModelLocations.put(llllllllllllIllllIIllIIllIIIIlIl, this.getModelResourceLocation(llllllllllllIllllIIllIIllIIIIlIl));
            "".length();
        }
        return this.mapStateModelLocations;
    }
    
    private static boolean lIIIIlIlIllllIII(final int llllllllllllIllllIIllIIlIlIIIlll) {
        return llllllllllllIllllIIllIIlIlIIIlll == 0;
    }
    
    private static String lIIIIlIlIlllIIII(String llllllllllllIllllIIllIIlIllIIlII, final String llllllllllllIllllIIllIIlIllIIIll) {
        llllllllllllIllllIIllIIlIllIIlII = new String(Base64.getDecoder().decode(llllllllllllIllllIIllIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIllIIlIllIIlll = new StringBuilder();
        final char[] llllllllllllIllllIIllIIlIllIIllI = llllllllllllIllllIIllIIlIllIIIll.toCharArray();
        int llllllllllllIllllIIllIIlIllIIlIl = StateMapperBase.lIlllllIlIllII[0];
        final int llllllllllllIllllIIllIIlIlIlllll = (Object)llllllllllllIllllIIllIIlIllIIlII.toCharArray();
        final long llllllllllllIllllIIllIIlIlIllllI = llllllllllllIllllIIllIIlIlIlllll.length;
        short llllllllllllIllllIIllIIlIlIlllIl = (short)StateMapperBase.lIlllllIlIllII[0];
        while (lIIIIlIlIllllIIl(llllllllllllIllllIIllIIlIlIlllIl, (int)llllllllllllIllllIIllIIlIlIllllI)) {
            final char llllllllllllIllllIIllIIlIllIlIlI = llllllllllllIllllIIllIIlIlIlllll[llllllllllllIllllIIllIIlIlIlllIl];
            llllllllllllIllllIIllIIlIllIIlll.append((char)(llllllllllllIllllIIllIIlIllIlIlI ^ llllllllllllIllllIIllIIlIllIIllI[llllllllllllIllllIIllIIlIllIIlIl % llllllllllllIllllIIllIIlIllIIllI.length]));
            "".length();
            ++llllllllllllIllllIIllIIlIllIIlIl;
            ++llllllllllllIllllIIllIIlIlIlllIl;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIllIIlIllIIlll);
    }
    
    private static boolean lIIIIlIlIllllIIl(final int llllllllllllIllllIIllIIlIlIIllII, final int llllllllllllIllllIIllIIlIlIIlIll) {
        return llllllllllllIllllIIllIIlIlIIllII < llllllllllllIllllIIllIIlIlIIlIll;
    }
}
