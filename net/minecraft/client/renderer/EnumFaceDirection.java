// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.util.EnumFacing;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum EnumFaceDirection
{
    private static final /* synthetic */ int[] lllIlIIIlIIIIl;
    
    WEST(llllllllllllIlIlllIIlIlllIIlIIIl5, llllllllllllIlIlllIIlIlllIIIllll5, llllllllllllIlIlllIIlIlllIIIllIl5);
    
    private final /* synthetic */ VertexInformation[] vertexInfos;
    
    NORTH(llllllllllllIlIlllIIlIlllIIlIIIl3, llllllllllllIlIlllIIlIlllIIIllll3, llllllllllllIlIlllIIlIlllIIIllIl3), 
    DOWN(llllllllllllIlIlllIIlIlllIIlIIIl, llllllllllllIlIlllIIlIlllIIIllll, llllllllllllIlIlllIIlIlllIIIllIl), 
    EAST(llllllllllllIlIlllIIlIlllIIlIIIl6, llllllllllllIlIlllIIlIlllIIIllll6, llllllllllllIlIlllIIlIlllIIIllIl6);
    
    private static final /* synthetic */ EnumFaceDirection[] facings;
    
    SOUTH(llllllllllllIlIlllIIlIlllIIlIIIl4, llllllllllllIlIlllIIlIlllIIIllll4, llllllllllllIlIlllIIlIlllIIIllIl4);
    
    private static final /* synthetic */ String[] lllIlIIIIlllII;
    
    UP(llllllllllllIlIlllIIlIlllIIlIIIl2, llllllllllllIlIlllIIlIlllIIIllll2, llllllllllllIlIlllIIlIlllIIIllIl2);
    
    static {
        lIlIIIIllIIlllII();
        lIlIIIIllIIIllll();
        final String llllllllllllIlIlllIIlIlllIIlIIIl = EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[0]];
        final int llllllllllllIlIlllIIlIlllIIIllll = EnumFaceDirection.lllIlIIIlIIIIl[0];
        final VertexInformation[] llllllllllllIlIlllIIlIlllIIIllIl = new VertexInformation[EnumFaceDirection.lllIlIIIlIIIIl[1]];
        llllllllllllIlIlllIIlIlllIIIllIl[EnumFaceDirection.lllIlIIIlIIIIl[0]] = new VertexInformation(Constants.WEST_INDEX, Constants.DOWN_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl[EnumFaceDirection.lllIlIIIlIIIIl[2]] = new VertexInformation(Constants.WEST_INDEX, Constants.DOWN_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl[EnumFaceDirection.lllIlIIIlIIIIl[3]] = new VertexInformation(Constants.EAST_INDEX, Constants.DOWN_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl[EnumFaceDirection.lllIlIIIlIIIIl[4]] = new VertexInformation(Constants.EAST_INDEX, Constants.DOWN_INDEX, Constants.SOUTH_INDEX, null);
        final String llllllllllllIlIlllIIlIlllIIlIIIl2 = EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[2]];
        final int llllllllllllIlIlllIIlIlllIIIllll2 = EnumFaceDirection.lllIlIIIlIIIIl[2];
        final VertexInformation[] llllllllllllIlIlllIIlIlllIIIllIl2 = new VertexInformation[EnumFaceDirection.lllIlIIIlIIIIl[1]];
        llllllllllllIlIlllIIlIlllIIIllIl2[EnumFaceDirection.lllIlIIIlIIIIl[0]] = new VertexInformation(Constants.WEST_INDEX, Constants.UP_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl2[EnumFaceDirection.lllIlIIIlIIIIl[2]] = new VertexInformation(Constants.WEST_INDEX, Constants.UP_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl2[EnumFaceDirection.lllIlIIIlIIIIl[3]] = new VertexInformation(Constants.EAST_INDEX, Constants.UP_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl2[EnumFaceDirection.lllIlIIIlIIIIl[4]] = new VertexInformation(Constants.EAST_INDEX, Constants.UP_INDEX, Constants.NORTH_INDEX, null);
        final String llllllllllllIlIlllIIlIlllIIlIIIl3 = EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[3]];
        final int llllllllllllIlIlllIIlIlllIIIllll3 = EnumFaceDirection.lllIlIIIlIIIIl[3];
        final VertexInformation[] llllllllllllIlIlllIIlIlllIIIllIl3 = new VertexInformation[EnumFaceDirection.lllIlIIIlIIIIl[1]];
        llllllllllllIlIlllIIlIlllIIIllIl3[EnumFaceDirection.lllIlIIIlIIIIl[0]] = new VertexInformation(Constants.EAST_INDEX, Constants.UP_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl3[EnumFaceDirection.lllIlIIIlIIIIl[2]] = new VertexInformation(Constants.EAST_INDEX, Constants.DOWN_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl3[EnumFaceDirection.lllIlIIIlIIIIl[3]] = new VertexInformation(Constants.WEST_INDEX, Constants.DOWN_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl3[EnumFaceDirection.lllIlIIIlIIIIl[4]] = new VertexInformation(Constants.WEST_INDEX, Constants.UP_INDEX, Constants.NORTH_INDEX, null);
        final String llllllllllllIlIlllIIlIlllIIlIIIl4 = EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[4]];
        final int llllllllllllIlIlllIIlIlllIIIllll4 = EnumFaceDirection.lllIlIIIlIIIIl[4];
        final VertexInformation[] llllllllllllIlIlllIIlIlllIIIllIl4 = new VertexInformation[EnumFaceDirection.lllIlIIIlIIIIl[1]];
        llllllllllllIlIlllIIlIlllIIIllIl4[EnumFaceDirection.lllIlIIIlIIIIl[0]] = new VertexInformation(Constants.WEST_INDEX, Constants.UP_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl4[EnumFaceDirection.lllIlIIIlIIIIl[2]] = new VertexInformation(Constants.WEST_INDEX, Constants.DOWN_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl4[EnumFaceDirection.lllIlIIIlIIIIl[3]] = new VertexInformation(Constants.EAST_INDEX, Constants.DOWN_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl4[EnumFaceDirection.lllIlIIIlIIIIl[4]] = new VertexInformation(Constants.EAST_INDEX, Constants.UP_INDEX, Constants.SOUTH_INDEX, null);
        final String llllllllllllIlIlllIIlIlllIIlIIIl5 = EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[1]];
        final int llllllllllllIlIlllIIlIlllIIIllll5 = EnumFaceDirection.lllIlIIIlIIIIl[1];
        final VertexInformation[] llllllllllllIlIlllIIlIlllIIIllIl5 = new VertexInformation[EnumFaceDirection.lllIlIIIlIIIIl[1]];
        llllllllllllIlIlllIIlIlllIIIllIl5[EnumFaceDirection.lllIlIIIlIIIIl[0]] = new VertexInformation(Constants.WEST_INDEX, Constants.UP_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl5[EnumFaceDirection.lllIlIIIlIIIIl[2]] = new VertexInformation(Constants.WEST_INDEX, Constants.DOWN_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl5[EnumFaceDirection.lllIlIIIlIIIIl[3]] = new VertexInformation(Constants.WEST_INDEX, Constants.DOWN_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl5[EnumFaceDirection.lllIlIIIlIIIIl[4]] = new VertexInformation(Constants.WEST_INDEX, Constants.UP_INDEX, Constants.SOUTH_INDEX, null);
        final String llllllllllllIlIlllIIlIlllIIlIIIl6 = EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[5]];
        final int llllllllllllIlIlllIIlIlllIIIllll6 = EnumFaceDirection.lllIlIIIlIIIIl[5];
        final VertexInformation[] llllllllllllIlIlllIIlIlllIIIllIl6 = new VertexInformation[EnumFaceDirection.lllIlIIIlIIIIl[1]];
        llllllllllllIlIlllIIlIlllIIIllIl6[EnumFaceDirection.lllIlIIIlIIIIl[0]] = new VertexInformation(Constants.EAST_INDEX, Constants.UP_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl6[EnumFaceDirection.lllIlIIIlIIIIl[2]] = new VertexInformation(Constants.EAST_INDEX, Constants.DOWN_INDEX, Constants.SOUTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl6[EnumFaceDirection.lllIlIIIlIIIIl[3]] = new VertexInformation(Constants.EAST_INDEX, Constants.DOWN_INDEX, Constants.NORTH_INDEX, null);
        llllllllllllIlIlllIIlIlllIIIllIl6[EnumFaceDirection.lllIlIIIlIIIIl[4]] = new VertexInformation(Constants.EAST_INDEX, Constants.UP_INDEX, Constants.NORTH_INDEX, null);
        final EnumFaceDirection[] enum$VALUES = new EnumFaceDirection[EnumFaceDirection.lllIlIIIlIIIIl[6]];
        enum$VALUES[EnumFaceDirection.lllIlIIIlIIIIl[0]] = EnumFaceDirection.DOWN;
        enum$VALUES[EnumFaceDirection.lllIlIIIlIIIIl[2]] = EnumFaceDirection.UP;
        enum$VALUES[EnumFaceDirection.lllIlIIIlIIIIl[3]] = EnumFaceDirection.NORTH;
        enum$VALUES[EnumFaceDirection.lllIlIIIlIIIIl[4]] = EnumFaceDirection.SOUTH;
        enum$VALUES[EnumFaceDirection.lllIlIIIlIIIIl[1]] = EnumFaceDirection.WEST;
        enum$VALUES[EnumFaceDirection.lllIlIIIlIIIIl[5]] = EnumFaceDirection.EAST;
        ENUM$VALUES = enum$VALUES;
        (facings = new EnumFaceDirection[EnumFaceDirection.lllIlIIIlIIIIl[6]])[Constants.DOWN_INDEX] = EnumFaceDirection.DOWN;
        EnumFaceDirection.facings[Constants.UP_INDEX] = EnumFaceDirection.UP;
        EnumFaceDirection.facings[Constants.NORTH_INDEX] = EnumFaceDirection.NORTH;
        EnumFaceDirection.facings[Constants.SOUTH_INDEX] = EnumFaceDirection.SOUTH;
        EnumFaceDirection.facings[Constants.WEST_INDEX] = EnumFaceDirection.WEST;
        EnumFaceDirection.facings[Constants.EAST_INDEX] = EnumFaceDirection.EAST;
    }
    
    private static String lIlIIIIllIIIlIlI(String llllllllllllIlIlllIIlIllIllIllll, final String llllllllllllIlIlllIIlIllIllIlllI) {
        llllllllllllIlIlllIIlIllIllIllll = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIlIllIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIlIllIlllIIlI = new StringBuilder();
        final char[] llllllllllllIlIlllIIlIllIlllIIIl = llllllllllllIlIlllIIlIllIllIlllI.toCharArray();
        int llllllllllllIlIlllIIlIllIlllIIII = EnumFaceDirection.lllIlIIIlIIIIl[0];
        final boolean llllllllllllIlIlllIIlIllIllIlIlI = (Object)llllllllllllIlIlllIIlIllIllIllll.toCharArray();
        final double llllllllllllIlIlllIIlIllIllIlIIl = llllllllllllIlIlllIIlIllIllIlIlI.length;
        double llllllllllllIlIlllIIlIllIllIlIII = EnumFaceDirection.lllIlIIIlIIIIl[0];
        while (lIlIIIIllIIlllIl((int)llllllllllllIlIlllIIlIllIllIlIII, (int)llllllllllllIlIlllIIlIllIllIlIIl)) {
            final char llllllllllllIlIlllIIlIllIlllIlIl = llllllllllllIlIlllIIlIllIllIlIlI[llllllllllllIlIlllIIlIllIllIlIII];
            llllllllllllIlIlllIIlIllIlllIIlI.append((char)(llllllllllllIlIlllIIlIllIlllIlIl ^ llllllllllllIlIlllIIlIllIlllIIIl[llllllllllllIlIlllIIlIllIlllIIII % llllllllllllIlIlllIIlIllIlllIIIl.length]));
            "".length();
            ++llllllllllllIlIlllIIlIllIlllIIII;
            ++llllllllllllIlIlllIIlIllIllIlIII;
            "".length();
            if ((68 + 83 - 133 + 153 ^ 19 + 44 + 77 + 35) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIlIllIlllIIlI);
    }
    
    private static boolean lIlIIIIllIIlllIl(final int llllllllllllIlIlllIIlIllIlIlIlll, final int llllllllllllIlIlllIIlIllIlIlIllI) {
        return llllllllllllIlIlllIIlIllIlIlIlll < llllllllllllIlIlllIIlIllIlIlIllI;
    }
    
    private EnumFaceDirection(final String llllllllllllIlIlllIIlIlllIIlIIIl, final int llllllllllllIlIlllIIlIlllIIIllll, final VertexInformation[] llllllllllllIlIlllIIlIlllIIIllIl) {
        this.vertexInfos = llllllllllllIlIlllIIlIlllIIIllIl;
    }
    
    private static String lIlIIIIllIIIlIIl(final String llllllllllllIlIlllIIlIllIlIlllll, final String llllllllllllIlIlllIIlIllIlIlllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIlIllIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlIllIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIlIllIllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIlIllIllIIIIl.init(EnumFaceDirection.lllIlIIIlIIIIl[3], llllllllllllIlIlllIIlIllIllIIIlI);
            return new String(llllllllllllIlIlllIIlIllIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlIllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIlIllIllIIIII) {
            llllllllllllIlIlllIIlIllIllIIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIIllIIIllll() {
        (lllIlIIIIlllII = new String[EnumFaceDirection.lllIlIIIlIIIIl[6]])[EnumFaceDirection.lllIlIIIlIIIIl[0]] = lIlIIIIllIIIlIIl("wS/huPUcJSU=", "ekgVq");
        EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[2]] = lIlIIIIllIIIlIlI("MD0=", "emzvW");
        EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[3]] = lIlIIIIllIIIlIIl("NmP5ZtJ5Nsw=", "cDNbl");
        EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[4]] = lIlIIIIllIIIlIlI("MS45FQk=", "balAA");
        EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[1]] = lIlIIIIllIIIlIIl("4/k1yJac8Qg=", "dvTzA");
        EnumFaceDirection.lllIlIIIIlllII[EnumFaceDirection.lllIlIIIlIIIIl[5]] = lIlIIIIllIIIlIIl("otFRCkmGlN8=", "vHlXh");
    }
    
    private static void lIlIIIIllIIlllII() {
        (lllIlIIIlIIIIl = new int[7])[0] = ((0x87 ^ 0xC7) & ~(0x60 ^ 0x20));
        EnumFaceDirection.lllIlIIIlIIIIl[1] = (0x8C ^ 0x88);
        EnumFaceDirection.lllIlIIIlIIIIl[2] = " ".length();
        EnumFaceDirection.lllIlIIIlIIIIl[3] = "  ".length();
        EnumFaceDirection.lllIlIIIlIIIIl[4] = "   ".length();
        EnumFaceDirection.lllIlIIIlIIIIl[5] = (0xD ^ 0x5 ^ (0x57 ^ 0x5A));
        EnumFaceDirection.lllIlIIIlIIIIl[6] = (65 + 8 + 72 + 4 ^ 73 + 5 - 57 + 126);
    }
    
    public VertexInformation func_179025_a(final int llllllllllllIlIlllIIlIlllIIIlIIl) {
        return this.vertexInfos[llllllllllllIlIlllIIlIlllIIIlIIl];
    }
    
    public static EnumFaceDirection getFacing(final EnumFacing llllllllllllIlIlllIIlIlllIlIIIll) {
        return EnumFaceDirection.facings[llllllllllllIlIlllIIlIlllIlIIIll.getIndex()];
    }
    
    public static final class Constants
    {
        public static final /* synthetic */ int NORTH_INDEX;
        public static final /* synthetic */ int DOWN_INDEX;
        public static final /* synthetic */ int EAST_INDEX;
        public static final /* synthetic */ int UP_INDEX;
        public static final /* synthetic */ int SOUTH_INDEX;
        public static final /* synthetic */ int WEST_INDEX;
        
        static {
            SOUTH_INDEX = EnumFacing.SOUTH.getIndex();
            UP_INDEX = EnumFacing.UP.getIndex();
            EAST_INDEX = EnumFacing.EAST.getIndex();
            NORTH_INDEX = EnumFacing.NORTH.getIndex();
            DOWN_INDEX = EnumFacing.DOWN.getIndex();
            WEST_INDEX = EnumFacing.WEST.getIndex();
        }
    }
    
    public static class VertexInformation
    {
        public final /* synthetic */ int field_179184_a;
        public final /* synthetic */ int field_179183_c;
        public final /* synthetic */ int field_179182_b;
        
        private VertexInformation(final int lllllllllllllIIIIIIlIIlIIllIlIII, final int lllllllllllllIIIIIIlIIlIIllIlIll, final int lllllllllllllIIIIIIlIIlIIllIlIlI) {
            this.field_179184_a = lllllllllllllIIIIIIlIIlIIllIlIII;
            this.field_179182_b = lllllllllllllIIIIIIlIIlIIllIlIll;
            this.field_179183_c = lllllllllllllIIIIIIlIIlIIllIlIlI;
        }
    }
}
