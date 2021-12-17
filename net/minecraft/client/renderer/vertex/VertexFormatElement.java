// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.vertex;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VertexFormatElement
{
    private /* synthetic */ int elementCount;
    private /* synthetic */ int index;
    private final /* synthetic */ EnumType type;
    private final /* synthetic */ EnumUsage usage;
    private static final /* synthetic */ String[] llIlIlIIIIllIl;
    private static final /* synthetic */ int[] llIlIlIIIIlllI;
    private static final /* synthetic */ Logger LOGGER;
    
    private final boolean func_177372_a(final int llllllllllllIllIlIllIIIIlllIIIll, final EnumUsage llllllllllllIllIlIllIIIIlllIIIII) {
        if (lIIlIIlllIIlIIll(llllllllllllIllIlIllIIIIlllIIIll) && lIIlIIlllIIlIlII(llllllllllllIllIlIllIIIIlllIIIII, EnumUsage.UV)) {
            return VertexFormatElement.llIlIlIIIIlllI[0] != 0;
        }
        return VertexFormatElement.llIlIlIIIIlllI[1] != 0;
    }
    
    public final EnumType getType() {
        return this.type;
    }
    
    private static boolean lIIlIIlllIIlIlll(final int llllllllllllIllIlIllIIIIlIIIIIlI, final int llllllllllllIllIlIllIIIIlIIIIIIl) {
        return llllllllllllIllIlIllIIIIlIIIIIlI != llllllllllllIllIlIllIIIIlIIIIIIl;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(String.valueOf(this.elementCount)).append(VertexFormatElement.llIlIlIIIIllIl[VertexFormatElement.llIlIlIIIIlllI[1]]).append(this.usage.getDisplayName()).append(VertexFormatElement.llIlIlIIIIllIl[VertexFormatElement.llIlIlIIIIlllI[2]]).append(this.type.getDisplayName()));
    }
    
    public final boolean isPositionElement() {
        if (lIIlIIlllIIlIlIl(this.usage, EnumUsage.POSITION)) {
            return VertexFormatElement.llIlIlIIIIlllI[1] != 0;
        }
        return VertexFormatElement.llIlIlIIIIlllI[0] != 0;
    }
    
    public final int getSize() {
        return this.type.getSize() * this.elementCount;
    }
    
    private static boolean lIIlIIlllIIlIlIl(final Object llllllllllllIllIlIllIIIIlIIIllII, final Object llllllllllllIllIlIllIIIIlIIIlIll) {
        return llllllllllllIllIlIllIIIIlIIIllII == llllllllllllIllIlIllIIIIlIIIlIll;
    }
    
    private static boolean lIIlIIlllIIlIllI(final Object llllllllllllIllIlIllIIIIlIIIlIIl) {
        return llllllllllllIllIlIllIIIIlIIIlIIl != null;
    }
    
    private static boolean lIIlIIlllIIlIIlI(final int llllllllllllIllIlIllIIIIlIIIIlIl) {
        return llllllllllllIllIlIllIIIIlIIIIlIl == 0;
    }
    
    static {
        lIIlIIlllIIlIIIl();
        lIIlIIlllIIlIIII();
        LOGGER = LogManager.getLogger();
    }
    
    private static boolean lIIlIIlllIIllIII(final int llllllllllllIllIlIllIIIIlIIlIlII, final int llllllllllllIllIlIllIIIIlIIlIIll) {
        return llllllllllllIllIlIllIIIIlIIlIlII < llllllllllllIllIlIllIIIIlIIlIIll;
    }
    
    private static String lIIlIIlllIIIllll(String llllllllllllIllIlIllIIIIlIIlllll, final String llllllllllllIllIlIllIIIIlIlIIIll) {
        llllllllllllIllIlIllIIIIlIIlllll = new String(Base64.getDecoder().decode(llllllllllllIllIlIllIIIIlIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIllIIIIlIlIIIlI = new StringBuilder();
        final char[] llllllllllllIllIlIllIIIIlIlIIIIl = llllllllllllIllIlIllIIIIlIlIIIll.toCharArray();
        int llllllllllllIllIlIllIIIIlIlIIIII = VertexFormatElement.llIlIlIIIIlllI[0];
        final char llllllllllllIllIlIllIIIIlIIllIlI = (Object)llllllllllllIllIlIllIIIIlIIlllll.toCharArray();
        final String llllllllllllIllIlIllIIIIlIIllIIl = (String)llllllllllllIllIlIllIIIIlIIllIlI.length;
        boolean llllllllllllIllIlIllIIIIlIIllIII = VertexFormatElement.llIlIlIIIIlllI[0] != 0;
        while (lIIlIIlllIIllIII(llllllllllllIllIlIllIIIIlIIllIII ? 1 : 0, (int)llllllllllllIllIlIllIIIIlIIllIIl)) {
            final char llllllllllllIllIlIllIIIIlIlIIlIl = llllllllllllIllIlIllIIIIlIIllIlI[llllllllllllIllIlIllIIIIlIIllIII];
            llllllllllllIllIlIllIIIIlIlIIIlI.append((char)(llllllllllllIllIlIllIIIIlIlIIlIl ^ llllllllllllIllIlIllIIIIlIlIIIIl[llllllllllllIllIlIllIIIIlIlIIIII % llllllllllllIllIlIllIIIIlIlIIIIl.length]));
            "".length();
            ++llllllllllllIllIlIllIIIIlIlIIIII;
            ++llllllllllllIllIlIllIIIIlIIllIII;
            "".length();
            if ((0xB ^ 0x7C ^ (0x28 ^ 0x5B)) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIllIIIIlIlIIIlI);
    }
    
    public final int getIndex() {
        return this.index;
    }
    
    private static void lIIlIIlllIIlIIIl() {
        (llIlIlIIIIlllI = new int[5])[0] = ((0x6 ^ 0x21) & ~(0x80 ^ 0xA7));
        VertexFormatElement.llIlIlIIIIlllI[1] = " ".length();
        VertexFormatElement.llIlIlIIIIlllI[2] = "  ".length();
        VertexFormatElement.llIlIlIIIIlllI[3] = (0x4B ^ 0x54);
        VertexFormatElement.llIlIlIIIIlllI[4] = "   ".length();
    }
    
    private static void lIIlIIlllIIlIIII() {
        (llIlIlIIIIllIl = new String[VertexFormatElement.llIlIlIIIIlllI[4]])[VertexFormatElement.llIlIlIIIIlllI[0]] = lIIlIIlllIIIlllI("WBRmsPRaEOneML2HrfrAPOW9xTF5bXOPysCIriUz0TUDn9JPZ91yF/9yKb6TtE8fLhS95yYFayy4sfky+ey+T5pUZ9nr1W1g42kzsN1qAY25oGQB7/QJkobCpN4JKAbF", "mhwTp");
        VertexFormatElement.llIlIlIIIIllIl[VertexFormatElement.llIlIlIIIIlllI[1]] = lIIlIIlllIIIllll("Xg==", "rEHxa");
        VertexFormatElement.llIlIlIIIIllIl[VertexFormatElement.llIlIlIIIIlllI[2]] = lIIlIIlllIIIlllI("WV3iPrgFldA=", "RcqAI");
    }
    
    private static String lIIlIIlllIIIlllI(final String llllllllllllIllIlIllIIIIlIllIIlI, final String llllllllllllIllIlIllIIIIlIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIllIIIIlIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIllIIIIlIllIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIllIIIIlIllIllI.init(VertexFormatElement.llIlIlIIIIlllI[2], llllllllllllIllIlIllIIIIlIllIlll);
            return new String(llllllllllllIllIlIllIIIIlIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIIIIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllIIIIlIllIlIl) {
            llllllllllllIllIlIllIIIIlIllIlIl.printStackTrace();
            return null;
        }
    }
    
    public final EnumUsage getUsage() {
        return this.usage;
    }
    
    public VertexFormatElement(final int llllllllllllIllIlIllIIIIlllIllll, final EnumType llllllllllllIllIlIllIIIIlllIlIIl, final EnumUsage llllllllllllIllIlIllIIIIlllIlIII, final int llllllllllllIllIlIllIIIIlllIllII) {
        if (lIIlIIlllIIlIIlI(this.func_177372_a(llllllllllllIllIlIllIIIIlllIllll, llllllllllllIllIlIllIIIIlllIlIII) ? 1 : 0)) {
            VertexFormatElement.LOGGER.warn(VertexFormatElement.llIlIlIIIIllIl[VertexFormatElement.llIlIlIIIIlllI[0]]);
            this.usage = EnumUsage.UV;
            "".length();
            if ("   ".length() <= 0) {
                throw null;
            }
        }
        else {
            this.usage = llllllllllllIllIlIllIIIIlllIlIII;
        }
        this.type = llllllllllllIllIlIllIIIIlllIlIIl;
        this.index = llllllllllllIllIlIllIIIIlllIllll;
        this.elementCount = llllllllllllIllIlIllIIIIlllIllII;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIlIllIIIIllIIIllI) {
        if (lIIlIIlllIIlIlIl(this, llllllllllllIllIlIllIIIIllIIIllI)) {
            return VertexFormatElement.llIlIlIIIIlllI[1] != 0;
        }
        if (lIIlIIlllIIlIllI(llllllllllllIllIlIllIIIIllIIIllI) && lIIlIIlllIIlIlIl(this.getClass(), llllllllllllIllIlIllIIIIllIIIllI.getClass())) {
            final VertexFormatElement llllllllllllIllIlIllIIIIllIIIlIl = (VertexFormatElement)llllllllllllIllIlIllIIIIllIIIllI;
            int n;
            if (lIIlIIlllIIlIlll(this.elementCount, llllllllllllIllIlIllIIIIllIIIlIl.elementCount)) {
                n = VertexFormatElement.llIlIlIIIIlllI[0];
                "".length();
                if ("  ".length() < 0) {
                    return ((0x77 ^ 0x2F) & ~(0x2F ^ 0x77)) != 0x0;
                }
            }
            else if (lIIlIIlllIIlIlll(this.index, llllllllllllIllIlIllIIIIllIIIlIl.index)) {
                n = VertexFormatElement.llIlIlIIIIlllI[0];
                "".length();
                if (" ".length() <= 0) {
                    return ((196 + 146 - 112 + 21 ^ 54 + 60 - 24 + 95) & (222 + 45 - 242 + 215 ^ 66 + 98 - 83 + 97 ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIlIIlllIIlIlII(this.type, llllllllllllIllIlIllIIIIllIIIlIl.type)) {
                n = VertexFormatElement.llIlIlIIIIlllI[0];
                "".length();
                if (((0xA ^ 0x19) & ~(0x54 ^ 0x47)) != 0x0) {
                    return ((0x5F ^ 0x6D) & ~(0xBE ^ 0x8C)) != 0x0;
                }
            }
            else if (lIIlIIlllIIlIlIl(this.usage, llllllllllllIllIlIllIIIIllIIIlIl.usage)) {
                n = VertexFormatElement.llIlIlIIIIlllI[1];
                "".length();
                if (((83 + 101 - 58 + 7 ^ 81 + 35 - 91 + 123) & (157 + 6 + 20 + 4 ^ 137 + 23 - 30 + 40 ^ -" ".length())) != 0x0) {
                    return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = VertexFormatElement.llIlIlIIIIlllI[0];
            }
            return n != 0;
        }
        return VertexFormatElement.llIlIlIIIIlllI[0] != 0;
    }
    
    private static boolean lIIlIIlllIIlIIll(final int llllllllllllIllIlIllIIIIlIIIIlll) {
        return llllllllllllIllIlIllIIIIlIIIIlll != 0;
    }
    
    @Override
    public int hashCode() {
        int llllllllllllIllIlIllIIIIlIlllllI = this.type.hashCode();
        llllllllllllIllIlIllIIIIlIlllllI = VertexFormatElement.llIlIlIIIIlllI[3] * llllllllllllIllIlIllIIIIlIlllllI + this.usage.hashCode();
        llllllllllllIllIlIllIIIIlIlllllI = VertexFormatElement.llIlIlIIIIlllI[3] * llllllllllllIllIlIllIIIIlIlllllI + this.index;
        llllllllllllIllIlIllIIIIlIlllllI = VertexFormatElement.llIlIlIIIIlllI[3] * llllllllllllIllIlIllIIIIlIlllllI + this.elementCount;
        return llllllllllllIllIlIllIIIIlIlllllI;
    }
    
    public final int getElementCount() {
        return this.elementCount;
    }
    
    private static boolean lIIlIIlllIIlIlII(final Object llllllllllllIllIlIllIIIIlIIlIIII, final Object llllllllllllIllIlIllIIIIlIIIllll) {
        return llllllllllllIllIlIllIIIIlIIlIIII != llllllllllllIllIlIllIIIIlIIIllll;
    }
    
    public enum EnumType
    {
        SHORT(EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[12]], EnumType.lIIllIlIlIlllI[1], EnumType.lIIllIlIlIlllI[4], EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[13]], EnumType.lIIllIlIlIlllI[14]), 
        UINT(EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[15]], EnumType.lIIllIlIlIlllI[7], EnumType.lIIllIlIlIlllI[1], EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[16]], EnumType.lIIllIlIlIlllI[17]);
        
        private final /* synthetic */ String displayName;
        
        BYTE(EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[1]], EnumType.lIIllIlIlIlllI[4], EnumType.lIIllIlIlIlllI[2], EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[7]], EnumType.lIIllIlIlIlllI[8]), 
        FLOAT(EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[0]], EnumType.lIIllIlIlIlllI[0], EnumType.lIIllIlIlIlllI[1], EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[2]], EnumType.lIIllIlIlIlllI[3]), 
        INT(EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[18]], EnumType.lIIllIlIlIlllI[9], EnumType.lIIllIlIlIlllI[1], EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[19]], EnumType.lIIllIlIlIlllI[20]);
        
        private final /* synthetic */ int glConstant;
        private final /* synthetic */ int size;
        
        UBYTE(EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[4]], EnumType.lIIllIlIlIlllI[2], EnumType.lIIllIlIlIlllI[2], EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[5]], EnumType.lIIllIlIlIlllI[6]), 
        USHORT(EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[9]], EnumType.lIIllIlIlIlllI[5], EnumType.lIIllIlIlIlllI[4], EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[10]], EnumType.lIIllIlIlIlllI[11]);
        
        private static final /* synthetic */ int[] lIIllIlIlIlllI;
        private static final /* synthetic */ String[] lIIllIlIlIlIll;
        
        private EnumType(final String lllllllllllllIIlIlIlIlIIIIllIlIl, final int lllllllllllllIIlIlIlIlIIIIllIlII, final int lllllllllllllIIlIlIlIlIIIIllIIll, final String lllllllllllllIIlIlIlIlIIIIlllIII, final int lllllllllllllIIlIlIlIlIIIIllIIIl) {
            this.size = lllllllllllllIIlIlIlIlIIIIllIIll;
            this.displayName = lllllllllllllIIlIlIlIlIIIIlllIII;
            this.glConstant = lllllllllllllIIlIlIlIlIIIIllIIIl;
        }
        
        private static String llIllIIIlllllll(final String lllllllllllllIIlIlIlIlIIIIIllIII, final String lllllllllllllIIlIlIlIlIIIIIlIlll) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlIlIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIlIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIlIlIIIIIllIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIlIlIIIIIllIlI.init(EnumType.lIIllIlIlIlllI[4], lllllllllllllIIlIlIlIlIIIIIllIll);
                return new String(lllllllllllllIIlIlIlIlIIIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIlIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlIlIIIIIllIIl) {
                lllllllllllllIIlIlIlIlIIIIIllIIl.printStackTrace();
                return null;
            }
        }
        
        public int getSize() {
            return this.size;
        }
        
        static {
            llIllIIlIIIlIII();
            llIllIIlIIIIlII();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lIIllIlIlIlllI[10]];
            enum$VALUES[EnumType.lIIllIlIlIlllI[0]] = EnumType.FLOAT;
            enum$VALUES[EnumType.lIIllIlIlIlllI[2]] = EnumType.UBYTE;
            enum$VALUES[EnumType.lIIllIlIlIlllI[4]] = EnumType.BYTE;
            enum$VALUES[EnumType.lIIllIlIlIlllI[5]] = EnumType.USHORT;
            enum$VALUES[EnumType.lIIllIlIlIlllI[1]] = EnumType.SHORT;
            enum$VALUES[EnumType.lIIllIlIlIlllI[7]] = EnumType.UINT;
            enum$VALUES[EnumType.lIIllIlIlIlllI[9]] = EnumType.INT;
            ENUM$VALUES = enum$VALUES;
        }
        
        public String getDisplayName() {
            return this.displayName;
        }
        
        public int getGlConstant() {
            return this.glConstant;
        }
        
        private static String llIllIIlIIIIIII(String lllllllllllllIIlIlIlIIllllllIllI, final String lllllllllllllIIlIlIlIIlllllllIlI) {
            lllllllllllllIIlIlIlIIllllllIllI = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIllllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIlIIlllllllIIl = new StringBuilder();
            final char[] lllllllllllllIIlIlIlIIlllllllIII = lllllllllllllIIlIlIlIIlllllllIlI.toCharArray();
            int lllllllllllllIIlIlIlIIllllllIlll = EnumType.lIIllIlIlIlllI[0];
            final String lllllllllllllIIlIlIlIIllllllIIIl = (Object)lllllllllllllIIlIlIlIIllllllIllI.toCharArray();
            final boolean lllllllllllllIIlIlIlIIllllllIIII = lllllllllllllIIlIlIlIIllllllIIIl.length != 0;
            char lllllllllllllIIlIlIlIIlllllIllll = (char)EnumType.lIIllIlIlIlllI[0];
            while (llIllIIlIIIlIIl(lllllllllllllIIlIlIlIIlllllIllll, lllllllllllllIIlIlIlIIllllllIIII ? 1 : 0)) {
                final char lllllllllllllIIlIlIlIIllllllllII = lllllllllllllIIlIlIlIIllllllIIIl[lllllllllllllIIlIlIlIIlllllIllll];
                lllllllllllllIIlIlIlIIlllllllIIl.append((char)(lllllllllllllIIlIlIlIIllllllllII ^ lllllllllllllIIlIlIlIIlllllllIII[lllllllllllllIIlIlIlIIllllllIlll % lllllllllllllIIlIlIlIIlllllllIII.length]));
                "".length();
                ++lllllllllllllIIlIlIlIIllllllIlll;
                ++lllllllllllllIIlIlIlIIlllllIllll;
                "".length();
                if ((0xBE ^ 0xBA) < " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIlIIlllllllIIl);
        }
        
        private static boolean llIllIIlIIIlIIl(final int lllllllllllllIIlIlIlIIlllllIlIll, final int lllllllllllllIIlIlIlIIlllllIlIlI) {
            return lllllllllllllIIlIlIlIIlllllIlIll < lllllllllllllIIlIlIlIIlllllIlIlI;
        }
        
        private static void llIllIIlIIIlIII() {
            (lIIllIlIlIlllI = new int[22])[0] = ((16 + 138 - 130 + 217 ^ 122 + 143 - 245 + 179) & (0x3F ^ 0x71 ^ (0x39 ^ 0x41) ^ -" ".length()));
            EnumType.lIIllIlIlIlllI[1] = (171 + 5 - 59 + 58 ^ 125 + 101 - 151 + 96);
            EnumType.lIIllIlIlIlllI[2] = " ".length();
            EnumType.lIIllIlIlIlllI[3] = (0xFFFFD46E & 0x3F97);
            EnumType.lIIllIlIlIlllI[4] = "  ".length();
            EnumType.lIIllIlIlIlllI[5] = "   ".length();
            EnumType.lIIllIlIlIlllI[6] = (0xFFFFFD35 & 0x16CB);
            EnumType.lIIllIlIlIlllI[7] = (0xA0 ^ 0x9E ^ (0x2F ^ 0x14));
            EnumType.lIIllIlIlIlllI[8] = (-(0xFFFFFDB5 & 0x427F) & (0xFFFFDCF7 & 0x773C));
            EnumType.lIIllIlIlIlllI[9] = (106 + 40 - 34 + 23 ^ 59 + 63 - 79 + 86);
            EnumType.lIIllIlIlIlllI[10] = (0x91 ^ 0x96);
            EnumType.lIIllIlIlIlllI[11] = (-(0xFFFFFE5D & 0x2BFB) & (0xFFFFBF5F & 0x7EFB));
            EnumType.lIIllIlIlIlllI[12] = (0x2F ^ 0x27);
            EnumType.lIIllIlIlIlllI[13] = (0x52 ^ 0x61 ^ (0x6E ^ 0x54));
            EnumType.lIIllIlIlIlllI[14] = (-(0xFFFFE25F & 0x3FB9) & (0xFFFFFF3B & 0x36DE));
            EnumType.lIIllIlIlIlllI[15] = (0x1D ^ 0x17);
            EnumType.lIIllIlIlIlllI[16] = (0xC ^ 0x6E ^ (0x54 ^ 0x3D));
            EnumType.lIIllIlIlIlllI[17] = (-(0xFFFFBBF7 & 0x4FE9) & (0xFFFFFFF7 & 0x1FED));
            EnumType.lIIllIlIlIlllI[18] = (0x34 ^ 0x38);
            EnumType.lIIllIlIlIlllI[19] = (107 + 71 - 62 + 53 ^ 35 + 81 - 3 + 51);
            EnumType.lIIllIlIlIlllI[20] = (-(0xFFFFF2F7 & 0x2FFA) & (0xFFFFFFFD & 0x36F7));
            EnumType.lIIllIlIlIlllI[21] = (0xE8 ^ 0x89 ^ (0x5C ^ 0x33));
        }
        
        private static String llIllIIIllllllI(final String lllllllllllllIIlIlIlIlIIIIIIlIll, final String lllllllllllllIIlIlIlIlIIIIIIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlIlIIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIlIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), EnumType.lIIllIlIlIlllI[12]), "DES");
                final Cipher lllllllllllllIIlIlIlIlIIIIIIllIl = Cipher.getInstance("DES");
                lllllllllllllIIlIlIlIlIIIIIIllIl.init(EnumType.lIIllIlIlIlllI[4], lllllllllllllIIlIlIlIlIIIIIIlllI);
                return new String(lllllllllllllIIlIlIlIlIIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIlIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlIlIIIIIIllII) {
                lllllllllllllIIlIlIlIlIIIIIIllII.printStackTrace();
                return null;
            }
        }
        
        private static void llIllIIlIIIIlII() {
            (lIIllIlIlIlIll = new String[EnumType.lIIllIlIlIlllI[21]])[EnumType.lIIllIlIlIlllI[0]] = llIllIIIllllllI("8hGjkMMlP3I=", "cuTeQ");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[2]] = llIllIIIlllllll("fnknHlUe7ig=", "SYMDw");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[4]] = llIllIIlIIIIIII("DzENJgw=", "ZsTrI");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[5]] = llIllIIIllllllI("KJipM/4JIgDm6aG6s5SQNQ==", "yrXox");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[1]] = llIllIIIlllllll("QYgfCV6+A+s=", "krqJO");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[7]] = llIllIIIllllllI("btYjjNsDeLw=", "qayff");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[9]] = llIllIIIlllllll("FJpUvF/BU5I=", "ejzsP");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[10]] = llIllIIlIIIIIII("DAkfLy03AghmGTEIHjI=", "YglFJ");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[12]] = llIllIIIlllllll("HLxlPF51Bn4=", "oDqhB");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[13]] = llIllIIIllllllI("/BOW/fvA97A=", "vDDRp");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[15]] = llIllIIlIIIIIII("Ny0qMQ==", "bddeN");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[16]] = llIllIIIllllllI("8bdNAzWeOYCfddR9pQbezA==", "ZUydN");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[18]] = llIllIIIllllllI("sNrmRX6o89U=", "sHWLJ");
            EnumType.lIIllIlIlIlIll[EnumType.lIIllIlIlIlllI[19]] = llIllIIlIIIIIII("Owws", "rbXZl");
        }
    }
    
    public enum EnumUsage
    {
        private final /* synthetic */ String displayName;
        private static final /* synthetic */ int[] lllIIIIIllIIlI;
        
        PADDING(EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[12]], EnumUsage.lllIIIIIllIIlI[6], EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[13]]), 
        POSITION(EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[0]], EnumUsage.lllIIIIIllIIlI[0], EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[1]]), 
        COLOR(EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[4]], EnumUsage.lllIIIIIllIIlI[2], EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[5]]), 
        NORMAL(EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[2]], EnumUsage.lllIIIIIllIIlI[1], EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[3]]), 
        MATRIX(EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[8]], EnumUsage.lllIIIIIllIIlI[4], EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[9]]), 
        UV(EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[6]], EnumUsage.lllIIIIIllIIlI[3], EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[7]]), 
        BLEND_WEIGHT(EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[10]], EnumUsage.lllIIIIIllIIlI[5], EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[11]]);
        
        private static final /* synthetic */ String[] lllIIIIIllIIIl;
        
        public String getDisplayName() {
            return this.displayName;
        }
        
        private static String lIIlllIIIIllIIII(final String llllllllllllIllIIIIlllIlIlllIllI, final String llllllllllllIllIIIIlllIlIlllIlll) {
            try {
                final SecretKeySpec llllllllllllIllIIIIlllIlIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlllIlIlllIlll.getBytes(StandardCharsets.UTF_8)), EnumUsage.lllIIIIIllIIlI[8]), "DES");
                final Cipher llllllllllllIllIIIIlllIlIllllIlI = Cipher.getInstance("DES");
                llllllllllllIllIIIIlllIlIllllIlI.init(EnumUsage.lllIIIIIllIIlI[2], llllllllllllIllIIIIlllIlIllllIll);
                return new String(llllllllllllIllIIIIlllIlIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlllIlIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIlllIlIllllIIl) {
                llllllllllllIllIIIIlllIlIllllIIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlllIIIIllIIIl(final String llllllllllllIllIIIIlllIlIllIlIIl, final String llllllllllllIllIIIIlllIlIllIlIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIIIlllIlIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlllIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIlllIlIllIllIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIlllIlIllIllIl.init(EnumUsage.lllIIIIIllIIlI[2], llllllllllllIllIIIIlllIlIllIlllI);
                return new String(llllllllllllIllIIIIlllIlIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlllIlIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIlllIlIllIllII) {
                llllllllllllIllIIIIlllIlIllIllII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlllIIIIllIlIl(final int llllllllllllIllIIIIlllIlIlIIlIll, final int llllllllllllIllIIIIlllIlIlIIlIlI) {
            return llllllllllllIllIIIIlllIlIlIIlIll < llllllllllllIllIIIIlllIlIlIIlIlI;
        }
        
        private static void lIIlllIIIIllIlII() {
            (lllIIIIIllIIlI = new int[15])[0] = ((44 + 27 - 3 + 113 ^ 7 + 10 + 38 + 124) & (86 + 88 - 126 + 96 ^ 129 + 133 - 215 + 103 ^ -" ".length()));
            EnumUsage.lllIIIIIllIIlI[1] = " ".length();
            EnumUsage.lllIIIIIllIIlI[2] = "  ".length();
            EnumUsage.lllIIIIIllIIlI[3] = "   ".length();
            EnumUsage.lllIIIIIllIIlI[4] = (0x1C ^ 0x18);
            EnumUsage.lllIIIIIllIIlI[5] = (0xBE ^ 0xBB);
            EnumUsage.lllIIIIIllIIlI[6] = (0x4F ^ 0x49);
            EnumUsage.lllIIIIIllIIlI[7] = (0x11 ^ 0x16);
            EnumUsage.lllIIIIIllIIlI[8] = (77 + 133 - 200 + 134 ^ 49 + 58 + 29 + 16);
            EnumUsage.lllIIIIIllIIlI[9] = (95 + 96 - 146 + 115 ^ 112 + 42 - 135 + 150);
            EnumUsage.lllIIIIIllIIlI[10] = (0x3E ^ 0x2F ^ (0xA6 ^ 0xBD));
            EnumUsage.lllIIIIIllIIlI[11] = (0xA9 ^ 0xA2);
            EnumUsage.lllIIIIIllIIlI[12] = (0x8A ^ 0x86);
            EnumUsage.lllIIIIIllIIlI[13] = (0x34 ^ 0x39);
            EnumUsage.lllIIIIIllIIlI[14] = (0xB6 ^ 0xB8);
        }
        
        private EnumUsage(final String llllllllllllIllIIIIlllIllIIIllIl, final int llllllllllllIllIIIIlllIllIIIllII, final String llllllllllllIllIIIIlllIllIIIllll) {
            this.displayName = llllllllllllIllIIIIlllIllIIIllll;
        }
        
        private static void lIIlllIIIIllIIll() {
            (lllIIIIIllIIIl = new String[EnumUsage.lllIIIIIllIIlI[14]])[EnumUsage.lllIIIIIllIIlI[0]] = lIIlllIIIIllIIII("RBHFijMxDlSSE9UsYukZBQ==", "dSaco");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[1]] = lIIlllIIIIllIIIl("3bi5nfWh69wKrycISR44tA==", "czuru");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[2]] = lIIlllIIIIllIIIl("aAonEn66R2I=", "OMHHM");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[3]] = lIIlllIIIIllIIII("Z6BTEaRgw30=", "GxBYi");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[4]] = lIIlllIIIIllIIIl("H472CS3WeEw=", "ipbQQ");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[5]] = lIIlllIIIIllIIlI("NDUGOy8acDcgJg0i", "bPtOJ");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[6]] = lIIlllIIIIllIIIl("2rABG041C/o=", "WxVey");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[7]] = lIIlllIIIIllIIIl("e4GbRLT8Lmg=", "XdEAW");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[8]] = lIIlllIIIIllIIII("pu2t1xEZ6Ak=", "UXWlW");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[9]] = lIIlllIIIIllIIII("fumnlDDINkWzD3Aefou7LQ==", "qhZps");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[10]] = lIIlllIIIIllIIlI("BD4rPTMZJSs6MA4m", "Frnsw");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[11]] = lIIlllIIIIllIIlI("FBUcKjJ2LhwtMT4N", "VyyDV");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[12]] = lIIlllIIIIllIIIl("lY6IjzuLHfM=", "IDhtp");
            EnumUsage.lllIIIIIllIIIl[EnumUsage.lllIIIIIllIIlI[13]] = lIIlllIIIIllIIIl("9rjHUVU9qxA=", "xdvDL");
        }
        
        private static String lIIlllIIIIllIIlI(String llllllllllllIllIIIIlllIlIlIlIllI, final String llllllllllllIllIIIIlllIlIlIlIlIl) {
            llllllllllllIllIIIIlllIlIlIlIllI = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIlllIlIlIlIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIIlllIlIlIllIIl = new StringBuilder();
            final char[] llllllllllllIllIIIIlllIlIlIllIII = llllllllllllIllIIIIlllIlIlIlIlIl.toCharArray();
            int llllllllllllIllIIIIlllIlIlIlIlll = EnumUsage.lllIIIIIllIIlI[0];
            final boolean llllllllllllIllIIIIlllIlIlIlIIIl = (Object)((String)llllllllllllIllIIIIlllIlIlIlIllI).toCharArray();
            final boolean llllllllllllIllIIIIlllIlIlIlIIII = llllllllllllIllIIIIlllIlIlIlIIIl.length != 0;
            String llllllllllllIllIIIIlllIlIlIIllll = (String)EnumUsage.lllIIIIIllIIlI[0];
            while (lIIlllIIIIllIlIl((int)llllllllllllIllIIIIlllIlIlIIllll, llllllllllllIllIIIIlllIlIlIlIIII ? 1 : 0)) {
                final char llllllllllllIllIIIIlllIlIlIlllII = llllllllllllIllIIIIlllIlIlIlIIIl[llllllllllllIllIIIIlllIlIlIIllll];
                llllllllllllIllIIIIlllIlIlIllIIl.append((char)(llllllllllllIllIIIIlllIlIlIlllII ^ llllllllllllIllIIIIlllIlIlIllIII[llllllllllllIllIIIIlllIlIlIlIlll % llllllllllllIllIIIIlllIlIlIllIII.length]));
                "".length();
                ++llllllllllllIllIIIIlllIlIlIlIlll;
                ++llllllllllllIllIIIIlllIlIlIIllll;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIIlllIlIlIllIIl);
        }
        
        static {
            lIIlllIIIIllIlII();
            lIIlllIIIIllIIll();
            final EnumUsage[] enum$VALUES = new EnumUsage[EnumUsage.lllIIIIIllIIlI[7]];
            enum$VALUES[EnumUsage.lllIIIIIllIIlI[0]] = EnumUsage.POSITION;
            enum$VALUES[EnumUsage.lllIIIIIllIIlI[1]] = EnumUsage.NORMAL;
            enum$VALUES[EnumUsage.lllIIIIIllIIlI[2]] = EnumUsage.COLOR;
            enum$VALUES[EnumUsage.lllIIIIIllIIlI[3]] = EnumUsage.UV;
            enum$VALUES[EnumUsage.lllIIIIIllIIlI[4]] = EnumUsage.MATRIX;
            enum$VALUES[EnumUsage.lllIIIIIllIIlI[5]] = EnumUsage.BLEND_WEIGHT;
            enum$VALUES[EnumUsage.lllIIIIIllIIlI[6]] = EnumUsage.PADDING;
            ENUM$VALUES = enum$VALUES;
        }
    }
}
