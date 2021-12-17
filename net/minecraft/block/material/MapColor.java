// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.material;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class MapColor
{
    private static final /* synthetic */ int[] llIIIIllIIlIlI;
    public static final /* synthetic */ MapColor[] mapColorArray;
    public final /* synthetic */ int colorIndex;
    public final /* synthetic */ int colorValue;
    private static final /* synthetic */ String[] llIIIIlIIlIIlI;
    
    private static void lIIIlIIIIIlIIlll() {
        (llIIIIllIIlIlI = new int[78])[0] = (0xF1 ^ 0xC6 ^ (0xB6 ^ 0xC1));
        MapColor.llIIIIllIIlIlI[1] = ((0xB6 ^ 0x82 ^ (0x2D ^ 0x5F)) & (0x74 ^ 0xA ^ (0x4B ^ 0x73) ^ -" ".length()) & (((0x76 ^ 0x40 ^ (0xB ^ 0x4)) & (48 + 186 - 184 + 138 ^ 100 + 19 - 6 + 20 ^ -" ".length())) ^ -" ".length()));
        MapColor.llIIIIllIIlIlI[2] = " ".length();
        MapColor.llIIIIllIIlIlI[3] = (0xFFFFF2FA & 0x7FBF3D);
        MapColor.llIIIIllIIlIlI[4] = "  ".length();
        MapColor.llIIIIllIIlIlI[5] = (0xFFFFF9B7 & 0xF7EFEB);
        MapColor.llIIIIllIIlIlI[6] = "   ".length();
        MapColor.llIIIIllIIlIlI[7] = (-(0xFFFFBDEF & 0x5211) & (0xFFFFFFE7 & 0xC7D7DF));
        MapColor.llIIIIllIIlIlI[8] = (0x5F ^ 0x5B);
        MapColor.llIIIIllIIlIlI[9] = (-(0xFFFFDBB7 & 0x66DF) & (0xFFFFC3FE & 0xFF7E97));
        MapColor.llIIIIllIIlIlI[10] = (0x6C ^ 0x69);
        MapColor.llIIIIllIIlIlI[11] = (0xFFFFB1FF & 0xA0EEFF);
        MapColor.llIIIIllIIlIlI[12] = (0xC2 ^ 0xC4);
        MapColor.llIIIIllIIlIlI[13] = (0xFFFFE7A7 & 0xA7BFFF);
        MapColor.llIIIIllIIlIlI[14] = (0x41 ^ 0x46);
        MapColor.llIIIIllIIlIlI[15] = (-(158 + 202 - 325 + 214) & (0xFFFFFFFD & 0x7CFA));
        MapColor.llIIIIllIIlIlI[16] = (0x74 ^ 0x1A ^ (0x3 ^ 0x65));
        MapColor.llIIIIllIIlIlI[17] = (-" ".length() & (-1 & 0xFFFFFF));
        MapColor.llIIIIllIIlIlI[18] = (0xCC ^ 0xC5);
        MapColor.llIIIIllIIlIlI[19] = (0xFFFFABFD & 0xA4FCBA);
        MapColor.llIIIIllIIlIlI[20] = (0x9A ^ 0x90);
        MapColor.llIIIIllIIlIlI[21] = (-(0xFFFFCE3B & 0x33E7) & (0xFFFFFF7F & 0x976FEF));
        MapColor.llIIIIllIIlIlI[22] = (56 + 19 - 70 + 138 ^ 60 + 47 - 54 + 79);
        MapColor.llIIIIllIIlIlI[23] = (0xFFFFF07E & 0x707FF1);
        MapColor.llIIIIllIIlIlI[24] = (163 + 125 - 243 + 141 ^ 75 + 157 - 147 + 97);
        MapColor.llIIIIllIIlIlI[25] = (0xFFFFD2FF & 0x406DFF);
        MapColor.llIIIIllIIlIlI[26] = (0xD ^ 0x44 ^ (0x65 ^ 0x21));
        MapColor.llIIIIllIIlIlI[27] = (0xFFFFFFCA & 0x8F777D);
        MapColor.llIIIIllIIlIlI[28] = (0x68 ^ 0x66);
        MapColor.llIIIIllIIlIlI[29] = (0xFFFFFDFD & 0xFFFEF7);
        MapColor.llIIIIllIIlIlI[30] = (0x68 ^ 0x67);
        MapColor.llIIIIllIIlIlI[31] = (0xFFFFFF7F & 0xD87FB3);
        MapColor.llIIIIllIIlIlI[32] = (0x42 ^ 0x5F ^ (0x70 ^ 0x7D));
        MapColor.llIIIIllIIlIlI[33] = (-(0xFFFFD706 & 0x39FF) & (-1 & 0xB25DDD));
        MapColor.llIIIIllIIlIlI[34] = (0x72 ^ 0x26 ^ (0xED ^ 0xA8));
        MapColor.llIIIIllIIlIlI[35] = (0xFFFFF9FF & 0x669FD8);
        MapColor.llIIIIllIIlIlI[36] = (0x51 ^ 0x43);
        MapColor.llIIIIllIIlIlI[37] = (0xFFFFEDBF & 0xE5F773);
        MapColor.llIIIIllIIlIlI[38] = (0xEC ^ 0xA2 ^ (0x12 ^ 0x4F));
        MapColor.llIIIIllIIlIlI[39] = (0xFFFFDC7B & 0x7FEF9D);
        MapColor.llIIIIllIIlIlI[40] = (0x1A ^ 0xE);
        MapColor.llIIIIllIIlIlI[41] = (-(0xF9 ^ 0xB0) & (-1 & 0xF27FED));
        MapColor.llIIIIllIIlIlI[42] = (1 + 114 - 31 + 64 ^ 95 + 88 - 103 + 49);
        MapColor.llIIIIllIIlIlI[43] = (-(0xFFFFE635 & 0x3BFE) & (0xFFFFEEFF & 0x4C7F7F));
        MapColor.llIIIIllIIlIlI[44] = (0x40 ^ 0x50 ^ (0x65 ^ 0x63));
        MapColor.llIIIIllIIlIlI[45] = (-(0xFFFFF94D & 0x26F7) & (0xFFFFF9FD & 0x99BFDF));
        MapColor.llIIIIllIIlIlI[46] = (3 + 37 - 33 + 133 ^ 31 + 73 - 31 + 82);
        MapColor.llIIIIllIIlIlI[47] = (0xFFFFFFDF & 0x4C7FB9);
        MapColor.llIIIIllIIlIlI[48] = (0x73 ^ 0x6B);
        MapColor.llIIIIllIIlIlI[49] = (-(0xFFFFFF5F & 0x40AD) & (-1 & 0x7F7FBE));
        MapColor.llIIIIllIIlIlI[50] = (0x6 ^ 0x26 ^ (0x23 ^ 0x1A));
        MapColor.llIIIIllIIlIlI[51] = (0xFFFFDFFF & 0x336CB2);
        MapColor.llIIIIllIIlIlI[52] = (0x7 ^ 0x4D ^ (0xC3 ^ 0x93));
        MapColor.llIIIIllIIlIlI[53] = (-(0xFFFFB7C7 & 0x4B7D) & (0xFFFFDF77 & 0x666FFF));
        MapColor.llIIIIllIIlIlI[54] = (0x3F ^ 0x24);
        MapColor.llIIIIllIIlIlI[55] = (0xFFFFFFB3 & 0x667F7F);
        MapColor.llIIIIllIIlIlI[56] = (0xD9 ^ 0xC5);
        MapColor.llIIIIllIIlIlI[57] = (0xFFFFF7FF & 0x993B33);
        MapColor.llIIIIllIIlIlI[58] = (0xDF ^ 0xC2);
        MapColor.llIIIIllIIlIlI[59] = (0xFFFFD9D9 & 0x193F3F);
        MapColor.llIIIIllIIlIlI[60] = (0xB9 ^ 0xA7);
        MapColor.llIIIIllIIlIlI[61] = (0xFFFFFE7F & 0xFAEFCD);
        MapColor.llIIIIllIIlIlI[62] = (0x0 ^ 0x56 ^ (0xC1 ^ 0x88));
        MapColor.llIIIIllIIlIlI[63] = (-(0xFFFFA407 & 0x7BFB) & (0xFFFFFFD7 & 0x5CFBFF));
        MapColor.llIIIIllIIlIlI[64] = (0xBD ^ 0x9D);
        MapColor.llIIIIllIIlIlI[65] = (-(0xFFFFFEAD & 0x5F53) & (-1 & 0x4ADEFF));
        MapColor.llIIIIllIIlIlI[66] = (66 + 116 - 119 + 78 ^ 121 + 3 - 78 + 126);
        MapColor.llIIIIllIIlIlI[67] = (-(0xFFFFD3F9 & 0x2E47) & (0xFFFFDF7E & 0xFBFB));
        MapColor.llIIIIllIIlIlI[68] = (0x59 ^ 0x7B);
        MapColor.llIIIIllIIlIlI[69] = (-(0xFFFFEFFB & 0x31CD) & (0xFFFFF7FB & 0x817FFD));
        MapColor.llIIIIllIIlIlI[70] = (0x4A ^ 0x6B ^ "  ".length());
        MapColor.llIIIIllIIlIlI[71] = (-(0xFFFFBF95 & 0x7D7F) & (0xFFFFBFBE & 0x707F55));
        MapColor.llIIIIllIIlIlI[72] = (159 + 38 - 68 + 52 ^ 100 + 112 - 138 + 64);
        MapColor.llIIIIllIIlIlI[73] = (0x63 ^ 0x9) + (0xFD ^ 0xC1) - (0x4D ^ 0x3F) + (152 + 13 - 97 + 100);
        MapColor.llIIIIllIIlIlI[74] = 46 + 45 - 30 + 74;
        MapColor.llIIIIllIIlIlI[75] = 3 + 32 + 107 + 113;
        MapColor.llIIIIllIIlIlI[76] = 136 + 170 - 147 + 21;
        MapColor.llIIIIllIIlIlI[77] = -(-(0xFFFFFC7E & 0x7FDB) & (0xFFFFFCD9 & 0x1007F7F));
    }
    
    private MapColor(final int llllllllllllIlllIllIlIlllIIlIIII, final int llllllllllllIlllIllIlIlllIIIllII) {
        if (!lIIIlIIIIIlIlIII(llllllllllllIlllIllIlIlllIIlIIII) || !lIIIlIIIIIlIlIIl(llllllllllllIlllIllIlIlllIIlIIII, MapColor.llIIIIllIIlIlI[72])) {
            throw new IndexOutOfBoundsException(MapColor.llIIIIlIIlIIlI[MapColor.llIIIIllIIlIlI[1]]);
        }
        this.colorIndex = llllllllllllIlllIllIlIlllIIlIIII;
        this.colorValue = llllllllllllIlllIllIlIlllIIIllII;
        MapColor.mapColorArray[llllllllllllIlllIllIlIlllIIlIIII] = this;
        "".length();
        if (-(0x3 ^ 0x6E ^ (0xD3 ^ 0xBA)) > 0) {
            throw null;
        }
    }
    
    private static boolean lIIIlIIIIIlIlIll(final int llllllllllllIlllIllIlIllIlIlIlII) {
        return llllllllllllIlllIllIlIllIlIlIlII == 0;
    }
    
    private static boolean lIIIlIIIIIlIllII(final int llllllllllllIlllIllIlIllIlIllIll, final int llllllllllllIlllIllIlIllIlIllIlI) {
        return llllllllllllIlllIllIlIllIlIllIll < llllllllllllIlllIllIlIllIlIllIlI;
    }
    
    static {
        lIIIlIIIIIlIIlll();
        lIIIIllllIllIllI();
        mapColorArray = new MapColor[MapColor.llIIIIllIIlIlI[0]];
        airColor = new MapColor(MapColor.llIIIIllIIlIlI[1], MapColor.llIIIIllIIlIlI[1]);
        grassColor = new MapColor(MapColor.llIIIIllIIlIlI[2], MapColor.llIIIIllIIlIlI[3]);
        sandColor = new MapColor(MapColor.llIIIIllIIlIlI[4], MapColor.llIIIIllIIlIlI[5]);
        clothColor = new MapColor(MapColor.llIIIIllIIlIlI[6], MapColor.llIIIIllIIlIlI[7]);
        tntColor = new MapColor(MapColor.llIIIIllIIlIlI[8], MapColor.llIIIIllIIlIlI[9]);
        iceColor = new MapColor(MapColor.llIIIIllIIlIlI[10], MapColor.llIIIIllIIlIlI[11]);
        ironColor = new MapColor(MapColor.llIIIIllIIlIlI[12], MapColor.llIIIIllIIlIlI[13]);
        foliageColor = new MapColor(MapColor.llIIIIllIIlIlI[14], MapColor.llIIIIllIIlIlI[15]);
        snowColor = new MapColor(MapColor.llIIIIllIIlIlI[16], MapColor.llIIIIllIIlIlI[17]);
        clayColor = new MapColor(MapColor.llIIIIllIIlIlI[18], MapColor.llIIIIllIIlIlI[19]);
        dirtColor = new MapColor(MapColor.llIIIIllIIlIlI[20], MapColor.llIIIIllIIlIlI[21]);
        stoneColor = new MapColor(MapColor.llIIIIllIIlIlI[22], MapColor.llIIIIllIIlIlI[23]);
        waterColor = new MapColor(MapColor.llIIIIllIIlIlI[24], MapColor.llIIIIllIIlIlI[25]);
        woodColor = new MapColor(MapColor.llIIIIllIIlIlI[26], MapColor.llIIIIllIIlIlI[27]);
        quartzColor = new MapColor(MapColor.llIIIIllIIlIlI[28], MapColor.llIIIIllIIlIlI[29]);
        adobeColor = new MapColor(MapColor.llIIIIllIIlIlI[30], MapColor.llIIIIllIIlIlI[31]);
        magentaColor = new MapColor(MapColor.llIIIIllIIlIlI[32], MapColor.llIIIIllIIlIlI[33]);
        lightBlueColor = new MapColor(MapColor.llIIIIllIIlIlI[34], MapColor.llIIIIllIIlIlI[35]);
        yellowColor = new MapColor(MapColor.llIIIIllIIlIlI[36], MapColor.llIIIIllIIlIlI[37]);
        limeColor = new MapColor(MapColor.llIIIIllIIlIlI[38], MapColor.llIIIIllIIlIlI[39]);
        pinkColor = new MapColor(MapColor.llIIIIllIIlIlI[40], MapColor.llIIIIllIIlIlI[41]);
        grayColor = new MapColor(MapColor.llIIIIllIIlIlI[42], MapColor.llIIIIllIIlIlI[43]);
        silverColor = new MapColor(MapColor.llIIIIllIIlIlI[44], MapColor.llIIIIllIIlIlI[45]);
        cyanColor = new MapColor(MapColor.llIIIIllIIlIlI[46], MapColor.llIIIIllIIlIlI[47]);
        purpleColor = new MapColor(MapColor.llIIIIllIIlIlI[48], MapColor.llIIIIllIIlIlI[49]);
        blueColor = new MapColor(MapColor.llIIIIllIIlIlI[50], MapColor.llIIIIllIIlIlI[51]);
        brownColor = new MapColor(MapColor.llIIIIllIIlIlI[52], MapColor.llIIIIllIIlIlI[53]);
        greenColor = new MapColor(MapColor.llIIIIllIIlIlI[54], MapColor.llIIIIllIIlIlI[55]);
        redColor = new MapColor(MapColor.llIIIIllIIlIlI[56], MapColor.llIIIIllIIlIlI[57]);
        blackColor = new MapColor(MapColor.llIIIIllIIlIlI[58], MapColor.llIIIIllIIlIlI[59]);
        goldColor = new MapColor(MapColor.llIIIIllIIlIlI[60], MapColor.llIIIIllIIlIlI[61]);
        diamondColor = new MapColor(MapColor.llIIIIllIIlIlI[62], MapColor.llIIIIllIIlIlI[63]);
        lapisColor = new MapColor(MapColor.llIIIIllIIlIlI[64], MapColor.llIIIIllIIlIlI[65]);
        emeraldColor = new MapColor(MapColor.llIIIIllIIlIlI[66], MapColor.llIIIIllIIlIlI[67]);
        obsidianColor = new MapColor(MapColor.llIIIIllIIlIlI[68], MapColor.llIIIIllIIlIlI[69]);
        netherrackColor = new MapColor(MapColor.llIIIIllIIlIlI[70], MapColor.llIIIIllIIlIlI[71]);
    }
    
    private static boolean lIIIlIIIIIlIlIIl(final int llllllllllllIlllIllIlIllIlIlIlll, final int llllllllllllIlllIllIlIllIlIlIllI) {
        return llllllllllllIlllIllIlIllIlIlIlll <= llllllllllllIlllIllIlIllIlIlIllI;
    }
    
    private static boolean lIIIlIIIIIlIlIII(final int llllllllllllIlllIllIlIllIlIlIIlI) {
        return llllllllllllIlllIllIlIllIlIlIIlI >= 0;
    }
    
    private static boolean lIIIlIIIIIlIlIlI(final int llllllllllllIlllIllIlIllIlIlllll, final int llllllllllllIlllIllIlIllIlIllllI) {
        return llllllllllllIlllIllIlIllIlIlllll == llllllllllllIlllIllIlIllIlIllllI;
    }
    
    public int func_151643_b(final int llllllllllllIlllIllIlIlllIIIIlII) {
        int llllllllllllIlllIllIlIlllIIIIIll = MapColor.llIIIIllIIlIlI[73];
        if (lIIIlIIIIIlIlIlI(llllllllllllIlllIllIlIlllIIIIlII, MapColor.llIIIIllIIlIlI[6])) {
            llllllllllllIlllIllIlIlllIIIIIll = MapColor.llIIIIllIIlIlI[74];
        }
        if (lIIIlIIIIIlIlIlI(llllllllllllIlllIllIlIlllIIIIlII, MapColor.llIIIIllIIlIlI[4])) {
            llllllllllllIlllIllIlIlllIIIIIll = MapColor.llIIIIllIIlIlI[75];
        }
        if (lIIIlIIIIIlIlIlI(llllllllllllIlllIllIlIlllIIIIlII, MapColor.llIIIIllIIlIlI[2])) {
            llllllllllllIlllIllIlIlllIIIIIll = MapColor.llIIIIllIIlIlI[73];
        }
        if (lIIIlIIIIIlIlIll(llllllllllllIlllIllIlIlllIIIIlII)) {
            llllllllllllIlllIllIlIlllIIIIIll = MapColor.llIIIIllIIlIlI[76];
        }
        final int llllllllllllIlllIllIlIlllIIIIIlI = (this.colorValue >> MapColor.llIIIIllIIlIlI[32] & MapColor.llIIIIllIIlIlI[75]) * llllllllllllIlllIllIlIlllIIIIIll / MapColor.llIIIIllIIlIlI[75];
        final int llllllllllllIlllIllIlIlllIIIIIIl = (this.colorValue >> MapColor.llIIIIllIIlIlI[16] & MapColor.llIIIIllIIlIlI[75]) * llllllllllllIlllIllIlIlllIIIIIll / MapColor.llIIIIllIIlIlI[75];
        final int llllllllllllIlllIllIlIlllIIIIIII = (this.colorValue & MapColor.llIIIIllIIlIlI[75]) * llllllllllllIlllIllIlIlllIIIIIll / MapColor.llIIIIllIIlIlI[75];
        return MapColor.llIIIIllIIlIlI[77] | llllllllllllIlllIllIlIlllIIIIIlI << MapColor.llIIIIllIIlIlI[32] | llllllllllllIlllIllIlIlllIIIIIIl << MapColor.llIIIIllIIlIlI[16] | llllllllllllIlllIllIlIlllIIIIIII;
    }
    
    private static String lIIIIllllIllIlIl(String llllllllllllIlllIllIlIllIllIlIlI, final String llllllllllllIlllIllIlIllIllIlIIl) {
        llllllllllllIlllIllIlIllIllIlIlI = new String(Base64.getDecoder().decode(llllllllllllIlllIllIlIllIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIlIllIllIllIl = new StringBuilder();
        final char[] llllllllllllIlllIllIlIllIllIllII = llllllllllllIlllIllIlIllIllIlIIl.toCharArray();
        int llllllllllllIlllIllIlIllIllIlIll = MapColor.llIIIIllIIlIlI[1];
        final float llllllllllllIlllIllIlIllIllIIlIl = (Object)llllllllllllIlllIllIlIllIllIlIlI.toCharArray();
        final int llllllllllllIlllIllIlIllIllIIlII = llllllllllllIlllIllIlIllIllIIlIl.length;
        String llllllllllllIlllIllIlIllIllIIIll = (String)MapColor.llIIIIllIIlIlI[1];
        while (lIIIlIIIIIlIllII((int)llllllllllllIlllIllIlIllIllIIIll, llllllllllllIlllIllIlIllIllIIlII)) {
            final char llllllllllllIlllIllIlIllIlllIIII = llllllllllllIlllIllIlIllIllIIlIl[llllllllllllIlllIllIlIllIllIIIll];
            llllllllllllIlllIllIlIllIllIllIl.append((char)(llllllllllllIlllIllIlIllIlllIIII ^ llllllllllllIlllIllIlIllIllIllII[llllllllllllIlllIllIlIllIllIlIll % llllllllllllIlllIllIlIllIllIllII.length]));
            "".length();
            ++llllllllllllIlllIllIlIllIllIlIll;
            ++llllllllllllIlllIllIlIllIllIIIll;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIlIllIllIllIl);
    }
    
    private static void lIIIIllllIllIllI() {
        (llIIIIlIIlIIlI = new String[MapColor.llIIIIllIIlIlI[2]])[MapColor.llIIIIllIIlIlI[1]] = lIIIIllllIllIlIl("JgAZVA0EDQYBHEsoLVQDHhIdVAwOQQsRGhwEDBpOW0EIGgpLV1pURgIPChgbGAgfEUc=", "kaitn");
    }
}
