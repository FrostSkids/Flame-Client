// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class MapGenStructureIO
{
    private static final /* synthetic */ Logger logger;
    private static /* synthetic */ Map<Class<? extends StructureStart>, String> startClassToNameMap;
    private static /* synthetic */ Map<Class<? extends StructureComponent>, String> componentClassToNameMap;
    private static /* synthetic */ Map<String, Class<? extends StructureStart>> startNameToClassMap;
    private static /* synthetic */ Map<String, Class<? extends StructureComponent>> componentNameToClassMap;
    private static final /* synthetic */ int[] lllIIIllIllIIl;
    private static final /* synthetic */ String[] lllIIIllIlIlIl;
    
    private static String lIIllllIIIIlIllI(final String llllllllllllIlIlllllllIllIIIlIlI, final String llllllllllllIlIlllllllIllIIIlIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllllllIllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllllIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllllIllIIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllllIllIIIlllI.init(MapGenStructureIO.lllIIIllIllIIl[2], llllllllllllIlIlllllllIllIIIllll);
            return new String(llllllllllllIlIlllllllIllIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllllIllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllllIllIIIllIl) {
            llllllllllllIlIlllllllIllIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllIIIIlIlIl(String llllllllllllIlIlllllllIllIlIlIIl, final String llllllllllllIlIlllllllIllIlIllIl) {
        llllllllllllIlIlllllllIllIlIlIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllllllIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllllIllIlIllII = new StringBuilder();
        final char[] llllllllllllIlIlllllllIllIlIlIll = llllllllllllIlIlllllllIllIlIllIl.toCharArray();
        int llllllllllllIlIlllllllIllIlIlIlI = MapGenStructureIO.lllIIIllIllIIl[0];
        final char llllllllllllIlIlllllllIllIlIIlII = (Object)llllllllllllIlIlllllllIllIlIlIIl.toCharArray();
        final short llllllllllllIlIlllllllIllIlIIIll = (short)llllllllllllIlIlllllllIllIlIIlII.length;
        String llllllllllllIlIlllllllIllIlIIIlI = (String)MapGenStructureIO.lllIIIllIllIIl[0];
        while (lIIllllIIIlIIIII((int)llllllllllllIlIlllllllIllIlIIIlI, llllllllllllIlIlllllllIllIlIIIll)) {
            final char llllllllllllIlIlllllllIllIlIllll = llllllllllllIlIlllllllIllIlIIlII[llllllllllllIlIlllllllIllIlIIIlI];
            llllllllllllIlIlllllllIllIlIllII.append((char)(llllllllllllIlIlllllllIllIlIllll ^ llllllllllllIlIlllllllIllIlIlIll[llllllllllllIlIlllllllIllIlIlIlI % llllllllllllIlIlllllllIllIlIlIll.length]));
            "".length();
            ++llllllllllllIlIlllllllIllIlIlIlI;
            ++llllllllllllIlIlllllllIllIlIIIlI;
            "".length();
            if (((0xA0 ^ 0x9F) & ~(0xB0 ^ 0x8F)) <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllllIllIlIllII);
    }
    
    public static StructureComponent getStructureComponent(final NBTTagCompound llllllllllllIlIlllllllIllIllllII, final World llllllllllllIlIlllllllIllIlllIll) {
        StructureComponent llllllllllllIlIlllllllIllIllllll = null;
        try {
            final Class<? extends StructureComponent> llllllllllllIlIlllllllIllIlllllI = MapGenStructureIO.componentNameToClassMap.get(llllllllllllIlIlllllllIllIllllII.getString(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[11]]));
            if (lIIllllIIIIllllI(llllllllllllIlIlllllllIllIlllllI)) {
                llllllllllllIlIlllllllIllIllllll = (StructureComponent)llllllllllllIlIlllllllIllIlllllI.newInstance();
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
        }
        catch (Exception llllllllllllIlIlllllllIllIllllIl) {
            MapGenStructureIO.logger.warn(String.valueOf(new StringBuilder(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[12]]).append(llllllllllllIlIlllllllIllIllllII.getString(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[13]]))));
            llllllllllllIlIlllllllIllIllllIl.printStackTrace();
        }
        if (lIIllllIIIIllllI(llllllllllllIlIlllllllIllIllllll)) {
            llllllllllllIlIlllllllIllIllllll.readStructureBaseNBT(llllllllllllIlIlllllllIllIlllIll, llllllllllllIlIlllllllIllIllllII);
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else {
            MapGenStructureIO.logger.warn(String.valueOf(new StringBuilder(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[14]]).append(llllllllllllIlIlllllllIllIllllII.getString(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[15]]))));
        }
        return llllllllllllIlIlllllllIllIllllll;
    }
    
    private static void lIIllllIIIIllIIl() {
        (lllIIIllIlIlIl = new String[MapGenStructureIO.lllIIIllIllIIl[16]])[MapGenStructureIO.lllIIIllIllIIl[0]] = lIIllllIIIIlIlIl("KjMUJyIPOxw2", "gZzBQ");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[1]] = lIIllllIIIIlIllI("NQwDqzHzPh4=", "AGGPJ");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[2]] = lIIllllIIIIlIlIl("ECI8GRczPj0=", "VMNme");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[3]] = lIIllllIIIIlIllI("hR7RvNKLCZEYuiVBxiTwVA==", "bEdMh");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[4]] = lIIllllIIIIlIlIl("ARMgEQow", "UvMaf");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[5]] = lIIllllIIIIlIllI("5gGq+g6HowWfypdamloNlQ==", "mLOWr");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[6]] = lIIllllIIIIlIllI("TQiSaevYIUY=", "LCvyi");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[7]] = lIIllllIIIIlIlIl("LzsPGQ4NejUBChsuRgICHTJGHA9J", "iZfuk");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[8]] = lIIllllIIIIlIllI("edqe2xnMySk=", "eLHho");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[9]] = lIIllllIIIIlIllI("oYiPAH90iIvvYbn6P01NBydLfsI5RYuqwIsCuH4qoaU=", "EbRAq");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[10]] = lIIllllIIIIlIllI("2CGGDhD3EIg=", "PIdfg");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[11]] = lIIllllIIIIlIlIl("DAc=", "ecGtU");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[12]] = lIIllllIIIIlIllI("/eckflc6htSjLIw6DoIwIEQM2zDxz1Kd", "FZRNI");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[13]] = lIIllllIIIIllIII("qUwOIkmKuWk=", "glIPO");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[14]] = lIIllllIIIIllIII("QARpQNJkACd3pULy2r2LVWEm5MEoJt+k", "PbRbG");
        MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[15]] = lIIllllIIIIlIlIl("ARM=", "hwHCN");
    }
    
    private static String lIIllllIIIIllIII(final String llllllllllllIlIlllllllIllIIlIlll, final String llllllllllllIlIlllllllIllIIllIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllllIllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllllIllIIllIII.getBytes(StandardCharsets.UTF_8)), MapGenStructureIO.lllIIIllIllIIl[8]), "DES");
            final Cipher llllllllllllIlIlllllllIllIIllIll = Cipher.getInstance("DES");
            llllllllllllIlIlllllllIllIIllIll.init(MapGenStructureIO.lllIIIllIllIIl[2], llllllllllllIlIlllllllIllIIlllII);
            return new String(llllllllllllIlIlllllllIllIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllllIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllllIllIIllIlI) {
            llllllllllllIlIlllllllIllIIllIlI.printStackTrace();
            return null;
        }
    }
    
    public static String getStructureComponentName(final StructureComponent llllllllllllIlIlllllllIlllIlIIll) {
        return MapGenStructureIO.componentClassToNameMap.get(llllllllllllIlIlllllllIlllIlIIll.getClass());
    }
    
    private static boolean lIIllllIIIIllllI(final Object llllllllllllIlIlllllllIllIIIIIIl) {
        return llllllllllllIlIlllllllIllIIIIIIl != null;
    }
    
    private static void registerStructure(final Class<? extends StructureStart> llllllllllllIlIlllllllIllllIIIlI, final String llllllllllllIlIlllllllIlllIlllll) {
        MapGenStructureIO.startNameToClassMap.put(llllllllllllIlIlllllllIlllIlllll, llllllllllllIlIlllllllIllllIIIlI);
        "".length();
        MapGenStructureIO.startClassToNameMap.put(llllllllllllIlIlllllllIllllIIIlI, llllllllllllIlIlllllllIlllIlllll);
        "".length();
    }
    
    public static String getStructureStartName(final StructureStart llllllllllllIlIlllllllIlllIlIllI) {
        return MapGenStructureIO.startClassToNameMap.get(llllllllllllIlIlllllllIlllIlIllI.getClass());
    }
    
    static void registerStructureComponent(final Class<? extends StructureComponent> llllllllllllIlIlllllllIlllIlllII, final String llllllllllllIlIlllllllIlllIllIIl) {
        MapGenStructureIO.componentNameToClassMap.put(llllllllllllIlIlllllllIlllIllIIl, llllllllllllIlIlllllllIlllIlllII);
        "".length();
        MapGenStructureIO.componentClassToNameMap.put(llllllllllllIlIlllllllIlllIlllII, llllllllllllIlIlllllllIlllIllIIl);
        "".length();
    }
    
    static {
        lIIllllIIIIlllIl();
        lIIllllIIIIllIIl();
        logger = LogManager.getLogger();
        MapGenStructureIO.startNameToClassMap = (Map<String, Class<? extends StructureStart>>)Maps.newHashMap();
        MapGenStructureIO.startClassToNameMap = (Map<Class<? extends StructureStart>, String>)Maps.newHashMap();
        MapGenStructureIO.componentNameToClassMap = (Map<String, Class<? extends StructureComponent>>)Maps.newHashMap();
        MapGenStructureIO.componentClassToNameMap = (Map<Class<? extends StructureComponent>, String>)Maps.newHashMap();
        registerStructure(StructureMineshaftStart.class, MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[0]]);
        registerStructure(MapGenVillage.Start.class, MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[1]]);
        registerStructure(MapGenNetherBridge.Start.class, MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[2]]);
        registerStructure(MapGenStronghold.Start.class, MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[3]]);
        registerStructure(MapGenScatteredFeature.Start.class, MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[4]]);
        registerStructure(StructureOceanMonument.StartMonument.class, MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[5]]);
        StructureMineshaftPieces.registerStructurePieces();
        StructureVillagePieces.registerVillagePieces();
        StructureNetherBridgePieces.registerNetherFortressPieces();
        StructureStrongholdPieces.registerStrongholdPieces();
        ComponentScatteredFeaturePieces.registerScatteredFeaturePieces();
        StructureOceanMonumentPieces.registerOceanMonumentPieces();
    }
    
    private static void lIIllllIIIIlllIl() {
        (lllIIIllIllIIl = new int[17])[0] = ((0xC7 ^ 0xC0) & ~(0xB5 ^ 0xB2));
        MapGenStructureIO.lllIIIllIllIIl[1] = " ".length();
        MapGenStructureIO.lllIIIllIllIIl[2] = "  ".length();
        MapGenStructureIO.lllIIIllIllIIl[3] = "   ".length();
        MapGenStructureIO.lllIIIllIllIIl[4] = (0xDD ^ 0x9C ^ (0x5B ^ 0x1E));
        MapGenStructureIO.lllIIIllIllIIl[5] = (127 + 63 - 145 + 123 ^ 119 + 79 - 50 + 25);
        MapGenStructureIO.lllIIIllIllIIl[6] = (0xD8 ^ 0xA4 ^ (0x9 ^ 0x73));
        MapGenStructureIO.lllIIIllIllIIl[7] = (0x67 ^ 0x77 ^ (0x25 ^ 0x32));
        MapGenStructureIO.lllIIIllIllIIl[8] = (0x65 ^ 0x6D);
        MapGenStructureIO.lllIIIllIllIIl[9] = (0x56 ^ 0x3D ^ (0x19 ^ 0x7B));
        MapGenStructureIO.lllIIIllIllIIl[10] = (0x7B ^ 0x37 ^ (0x50 ^ 0x16));
        MapGenStructureIO.lllIIIllIllIIl[11] = (0x90 ^ 0x9B);
        MapGenStructureIO.lllIIIllIllIIl[12] = (0xA1 ^ 0xB1 ^ (0x2A ^ 0x36));
        MapGenStructureIO.lllIIIllIllIIl[13] = (0x3 ^ 0xE);
        MapGenStructureIO.lllIIIllIllIIl[14] = (0x1D ^ 0x61 ^ (0x6B ^ 0x19));
        MapGenStructureIO.lllIIIllIllIIl[15] = (1 + 119 - 105 + 146 ^ 17 + 8 + 92 + 57);
        MapGenStructureIO.lllIIIllIllIIl[16] = (0x5B ^ 0x4B);
    }
    
    public static StructureStart getStructureStart(final NBTTagCompound llllllllllllIlIlllllllIlllIIlllI, final World llllllllllllIlIlllllllIlllIIlIII) {
        StructureStart llllllllllllIlIlllllllIlllIIllII = null;
        try {
            final Class<? extends StructureStart> llllllllllllIlIlllllllIlllIIlIll = MapGenStructureIO.startNameToClassMap.get(llllllllllllIlIlllllllIlllIIlllI.getString(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[6]]));
            if (lIIllllIIIIllllI(llllllllllllIlIlllllllIlllIIlIll)) {
                llllllllllllIlIlllllllIlllIIllII = (StructureStart)llllllllllllIlIlllllllIlllIIlIll.newInstance();
                "".length();
                if (-" ".length() > " ".length()) {
                    return null;
                }
            }
        }
        catch (Exception llllllllllllIlIlllllllIlllIIlIlI) {
            MapGenStructureIO.logger.warn(String.valueOf(new StringBuilder(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[7]]).append(llllllllllllIlIlllllllIlllIIlllI.getString(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[8]]))));
            llllllllllllIlIlllllllIlllIIlIlI.printStackTrace();
        }
        if (lIIllllIIIIllllI(llllllllllllIlIlllllllIlllIIllII)) {
            llllllllllllIlIlllllllIlllIIllII.readStructureComponentsFromNBT(llllllllllllIlIlllllllIlllIIlIII, llllllllllllIlIlllllllIlllIIlllI);
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        else {
            MapGenStructureIO.logger.warn(String.valueOf(new StringBuilder(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[9]]).append(llllllllllllIlIlllllllIlllIIlllI.getString(MapGenStructureIO.lllIIIllIlIlIl[MapGenStructureIO.lllIIIllIllIIl[10]]))));
        }
        return llllllllllllIlIlllllllIlllIIllII;
    }
    
    private static boolean lIIllllIIIlIIIII(final int llllllllllllIlIlllllllIllIIIIlII, final int llllllllllllIlIlllllllIllIIIIIll) {
        return llllllllllllIlIlllllllIllIIIIlII < llllllllllllIlIlllllllIllIIIIIll;
    }
}
