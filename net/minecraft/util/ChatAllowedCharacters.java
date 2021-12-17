// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class ChatAllowedCharacters
{
    private static final /* synthetic */ int[] llIIlIlllIlllI;
    
    public static boolean isAllowedCharacter(final char llllllllllllIlllIIIlIIIIIIllllll) {
        if (lIIIllIllllllllI(llllllllllllIlllIIIlIIIIIIllllll, ChatAllowedCharacters.llIIlIlllIlllI[25]) && lIIIllIlllllllll(llllllllllllIlllIIIlIIIIIIllllll, ChatAllowedCharacters.llIIlIlllIlllI[26]) && lIIIllIllllllllI(llllllllllllIlllIIIlIIIIIIllllll, ChatAllowedCharacters.llIIlIlllIlllI[27])) {
            return ChatAllowedCharacters.llIIlIlllIlllI[3] != 0;
        }
        return ChatAllowedCharacters.llIIlIlllIlllI[1] != 0;
    }
    
    private static boolean lIIIllIlllllllll(final int llllllllllllIlllIIIlIIIIIIlIllIl, final int llllllllllllIlllIIIlIIIIIIlIllII) {
        return llllllllllllIlllIIIlIIIIIIlIllIl >= llllllllllllIlllIIIlIIIIIIlIllII;
    }
    
    private static void lIIIllIlllllllIl() {
        (llIIlIlllIlllI = new int[28])[0] = (158 + 107 - 85 + 7 ^ 48 + 160 - 179 + 151);
        ChatAllowedCharacters.llIIlIlllIlllI[1] = ((0x40 ^ 0x5A) & ~(0x57 ^ 0x4D));
        ChatAllowedCharacters.llIIlIlllIlllI[2] = (0x51 ^ 0x7E);
        ChatAllowedCharacters.llIIlIlllIlllI[3] = " ".length();
        ChatAllowedCharacters.llIIlIlllIlllI[4] = (0xBE ^ 0xB4);
        ChatAllowedCharacters.llIIlIlllIlllI[5] = "  ".length();
        ChatAllowedCharacters.llIIlIlllIlllI[6] = (2 + 56 + 59 + 31 ^ 28 + 32 - 41 + 134);
        ChatAllowedCharacters.llIIlIlllIlllI[7] = "   ".length();
        ChatAllowedCharacters.llIIlIlllIlllI[8] = (59 + 101 - 49 + 43 ^ 110 + 40 - 142 + 139);
        ChatAllowedCharacters.llIIlIlllIlllI[9] = (80 + 80 - 125 + 139 ^ 10 + 130 - 57 + 88);
        ChatAllowedCharacters.llIIlIlllIlllI[10] = (0xCD ^ 0xC1);
        ChatAllowedCharacters.llIIlIlllIlllI[11] = (125 + 108 - 198 + 139 ^ 44 + 99 - 28 + 53);
        ChatAllowedCharacters.llIIlIlllIlllI[12] = (0xC ^ 0x64 ^ (0x95 ^ 0x9D));
        ChatAllowedCharacters.llIIlIlllIlllI[13] = (0x19 ^ 0x1E);
        ChatAllowedCharacters.llIIlIlllIlllI[14] = (0x81 ^ 0xBE);
        ChatAllowedCharacters.llIIlIlllIlllI[15] = (26 + 124 - 132 + 157 ^ 119 + 28 - 4 + 24);
        ChatAllowedCharacters.llIIlIlllIlllI[16] = (0x83 ^ 0x8F ^ (0x5C ^ 0x7A));
        ChatAllowedCharacters.llIIlIlllIlllI[17] = (0x1A ^ 0x5C ^ (0x70 ^ 0x6A));
        ChatAllowedCharacters.llIIlIlllIlllI[18] = (0x45 ^ 0x31 ^ (0x78 ^ 0x30));
        ChatAllowedCharacters.llIIlIlllIlllI[19] = (0xD3 ^ 0x91 ^ (0x5E ^ 0x17));
        ChatAllowedCharacters.llIIlIlllIlllI[20] = (0x37 ^ 0x9);
        ChatAllowedCharacters.llIIlIlllIlllI[21] = (0x2F ^ 0x4A ^ (0x32 ^ 0x2B));
        ChatAllowedCharacters.llIIlIlllIlllI[22] = (0x6C ^ 0x7B ^ (0xA ^ 0x3F));
        ChatAllowedCharacters.llIIlIlllIlllI[23] = (0x10 ^ 0x1E);
        ChatAllowedCharacters.llIIlIlllIlllI[24] = (0x24 ^ 0x1E);
        ChatAllowedCharacters.llIIlIlllIlllI[25] = (0x36 ^ 0x1F) + (0x21 ^ 0x73) - (0xC ^ 0x5D) + (0x78 ^ 0x5);
        ChatAllowedCharacters.llIIlIlllIlllI[26] = (0xCA ^ 0xB3 ^ (0x9A ^ 0xC3));
        ChatAllowedCharacters.llIIlIlllIlllI[27] = (0x69 ^ 0x1E) + (0x29 ^ 0x50) - (122 + 104 - 205 + 189) + (0x1 ^ 0x60);
    }
    
    public static String filterAllowedCharacters(final String llllllllllllIlllIIIlIIIIIIlllIII) {
        final StringBuilder llllllllllllIlllIIIlIIIIIIllIlll = new StringBuilder();
        final boolean llllllllllllIlllIIIlIIIIIIllIIII;
        final Exception llllllllllllIlllIIIlIIIIIIllIIIl = (Exception)((char[])(Object)(llllllllllllIlllIIIlIIIIIIllIIII = (boolean)(Object)llllllllllllIlllIIIlIIIIIIlllIII.toCharArray())).length;
        double llllllllllllIlllIIIlIIIIIIllIIlI = ChatAllowedCharacters.llIIlIlllIlllI[1];
        "".length();
        if (-(0x54 ^ 0x44 ^ (0xA0 ^ 0xB4)) > 0) {
            return null;
        }
        while (!lIIIllIlllllllll((int)llllllllllllIlllIIIlIIIIIIllIIlI, (int)llllllllllllIlllIIIlIIIIIIllIIIl)) {
            final char llllllllllllIlllIIIlIIIIIIllIllI = llllllllllllIlllIIIlIIIIIIllIIII[llllllllllllIlllIIIlIIIIIIllIIlI];
            if (lIIIlllIIIIIIIII(isAllowedCharacter(llllllllllllIlllIIIlIIIIIIllIllI) ? 1 : 0)) {
                llllllllllllIlllIIIlIIIIIIllIlll.append(llllllllllllIlllIIIlIIIIIIllIllI);
                "".length();
            }
            ++llllllllllllIlllIIIlIIIIIIllIIlI;
        }
        return String.valueOf(llllllllllllIlllIIIlIIIIIIllIlll);
    }
    
    private static boolean lIIIlllIIIIIIIII(final int llllllllllllIlllIIIlIIIIIIlIlIlI) {
        return llllllllllllIlllIIIlIIIIIIlIlIlI != 0;
    }
    
    private static boolean lIIIllIllllllllI(final int llllllllllllIlllIIIlIIIIIIlIIlll, final int llllllllllllIlllIIIlIIIIIIlIIllI) {
        return llllllllllllIlllIIIlIIIIIIlIIlll != llllllllllllIlllIIIlIIIIIIlIIllI;
    }
    
    static {
        lIIIllIlllllllIl();
        final char[] allowedCharactersArray2 = new char[ChatAllowedCharacters.llIIlIlllIlllI[0]];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[1]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[2];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[3]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[4];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[5]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[6];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[7]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[8];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[9]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[10];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[11]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[12];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[13]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[14];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[15]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[16];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[8]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[17];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[4]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[18];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[19]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[20];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[10]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[21];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[6]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[22];
        allowedCharactersArray2[ChatAllowedCharacters.llIIlIlllIlllI[23]] = (char)ChatAllowedCharacters.llIIlIlllIlllI[24];
        allowedCharactersArray = allowedCharactersArray2;
    }
}
