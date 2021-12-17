// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.util.MathHelper;
import java.util.Map;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class MapGenMineshaft extends MapGenStructure
{
    private static final /* synthetic */ int[] lIIIlIIllIIllI;
    private /* synthetic */ double field_82673_e;
    private static final /* synthetic */ String[] lIIIlIIIIlIlll;
    
    private static void lIllllllIllIIll() {
        (lIIIlIIllIIllI = new int[5])[0] = ((0xF7 ^ 0xB7) & ~(0x5F ^ 0x1F));
        MapGenMineshaft.lIIIlIIllIIllI[1] = " ".length();
        MapGenMineshaft.lIIIlIIllIIllI[2] = (0xE ^ 0x5E);
        MapGenMineshaft.lIIIlIIllIIllI[3] = "  ".length();
        MapGenMineshaft.lIIIlIIllIIllI[4] = (0x57 ^ 0x6B ^ (0x26 ^ 0x12));
    }
    
    private static String lIlllllIIIlIllI(final String lllllllllllllIlIIIlIlIIllIlIIlll, final String lllllllllllllIlIIIlIlIIllIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlIIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlIIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIlIIllIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIlIIllIlIlIIl.init(MapGenMineshaft.lIIIlIIllIIllI[3], lllllllllllllIlIIIlIlIIllIlIlIlI);
            return new String(lllllllllllllIlIIIlIlIIllIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlIIllIlIlIII) {
            lllllllllllllIlIIIlIlIIllIlIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected StructureStart getStructureStart(final int lllllllllllllIlIIIlIlIIllIllllIl, final int lllllllllllllIlIIIlIlIIllIllllll) {
        return new StructureMineshaftStart(this.worldObj, this.rand, lllllllllllllIlIIIlIlIIllIllllIl, lllllllllllllIlIIIlIlIIllIllllll);
    }
    
    private static String lIlllllIIIlIlIl(final String lllllllllllllIlIIIlIlIIllIllIlII, final String lllllllllllllIlIIIlIlIIllIllIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlIIllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlIIllIllIIll.getBytes(StandardCharsets.UTF_8)), MapGenMineshaft.lIIIlIIllIIllI[4]), "DES");
            final Cipher lllllllllllllIlIIIlIlIIllIllIllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIlIIllIllIllI.init(MapGenMineshaft.lIIIlIIllIIllI[3], lllllllllllllIlIIIlIlIIllIllIlll);
            return new String(lllllllllllllIlIIIlIlIIllIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlIIllIllIlIl) {
            lllllllllllllIlIIIlIlIIllIllIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getStructureName() {
        return MapGenMineshaft.lIIIlIIIIlIlll[MapGenMineshaft.lIIIlIIllIIllI[0]];
    }
    
    static {
        lIllllllIllIIll();
        lIlllllIIIlllII();
    }
    
    private static boolean lIllllllIllIlIl(final int lllllllllllllIlIIIlIlIIllIIllIlI) {
        return lllllllllllllIlIIIlIlIIllIIllIlI == 0;
    }
    
    private static int lIllllllIllIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public MapGenMineshaft(final Map<String, String> lllllllllllllIlIIIlIlIIlllIlIIll) {
        this.field_82673_e = 0.004;
        final byte lllllllllllllIlIIIlIlIIlllIIlllI = (byte)lllllllllllllIlIIIlIlIIlllIlIIll.entrySet().iterator();
        "".length();
        if ("   ".length() <= 0) {
            throw null;
        }
        while (!lIllllllIllIlIl(((Iterator)lllllllllllllIlIIIlIlIIlllIIlllI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> lllllllllllllIlIIIlIlIIlllIlIIlI = ((Iterator<Map.Entry<String, String>>)lllllllllllllIlIIIlIlIIlllIIlllI).next();
            if (lIllllllIllIlII(lllllllllllllIlIIIlIlIIlllIlIIlI.getKey().equals(MapGenMineshaft.lIIIlIIIIlIlll[MapGenMineshaft.lIIIlIIllIIllI[1]]) ? 1 : 0)) {
                this.field_82673_e = MathHelper.parseDoubleWithDefault(lllllllllllllIlIIIlIlIIlllIlIIlI.getValue(), this.field_82673_e);
            }
        }
    }
    
    @Override
    protected boolean canSpawnStructureAtCoords(final int lllllllllllllIlIIIlIlIIlllIIlIIl, final int lllllllllllllIlIIIlIlIIlllIIlIII) {
        if (lIllllllIllIlll(lIllllllIllIllI(this.rand.nextDouble(), this.field_82673_e)) && lIllllllIlllIII(this.rand.nextInt(MapGenMineshaft.lIIIlIIllIIllI[2]), Math.max(Math.abs(lllllllllllllIlIIIlIlIIlllIIlIIl), Math.abs(lllllllllllllIlIIIlIlIIlllIIlIII)))) {
            return MapGenMineshaft.lIIIlIIllIIllI[1] != 0;
        }
        return MapGenMineshaft.lIIIlIIllIIllI[0] != 0;
    }
    
    private static void lIlllllIIIlllII() {
        (lIIIlIIIIlIlll = new String[MapGenMineshaft.lIIIlIIllIIllI[3]])[MapGenMineshaft.lIIIlIIllIIllI[0]] = lIlllllIIIlIlIl("IPT2SztPVLZDD5vD0XHccA==", "ltKkq");
        MapGenMineshaft.lIIIlIIIIlIlll[MapGenMineshaft.lIIIlIIllIIllI[1]] = lIlllllIIIlIllI("yf6w5QSThbY=", "gaUVu");
    }
    
    private static boolean lIllllllIllIlII(final int lllllllllllllIlIIIlIlIIllIIlllII) {
        return lllllllllllllIlIIIlIlIIllIIlllII != 0;
    }
    
    private static boolean lIllllllIllIlll(final int lllllllllllllIlIIIlIlIIllIIllIII) {
        return lllllllllllllIlIIIlIlIIllIIllIII < 0;
    }
    
    public MapGenMineshaft() {
        this.field_82673_e = 0.004;
    }
    
    private static boolean lIllllllIlllIII(final int lllllllllllllIlIIIlIlIIllIIlllll, final int lllllllllllllIlIIIlIlIIllIIllllI) {
        return lllllllllllllIlIIIlIlIIllIIlllll < lllllllllllllIlIIIlIlIIllIIllllI;
    }
}
