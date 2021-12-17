// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.vertex;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class VertexFormat
{
    private final /* synthetic */ List<VertexFormatElement> elements;
    private static final /* synthetic */ Logger LOGGER;
    private final /* synthetic */ List<Integer> offsets;
    private /* synthetic */ int nextOffset;
    private static final /* synthetic */ String[] llIlIllIIllllI;
    private /* synthetic */ List<Integer> uvOffsetsById;
    private /* synthetic */ int colorElementOffset;
    private static final /* synthetic */ int[] llIlIllIlIIIII;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
    private /* synthetic */ int normalElementOffset;
    
    public VertexFormat() {
        this.elements = (List<VertexFormatElement>)Lists.newArrayList();
        this.offsets = (List<Integer>)Lists.newArrayList();
        this.nextOffset = VertexFormat.llIlIllIlIIIII[0];
        this.colorElementOffset = VertexFormat.llIlIllIlIIIII[1];
        this.uvOffsetsById = (List<Integer>)Lists.newArrayList();
        this.normalElementOffset = VertexFormat.llIlIllIlIIIII[1];
    }
    
    private static boolean lIIlIlIlIIlllIll(final int llllllllllllIllIlIIlIllllIllIIll, final int llllllllllllIllIlIIlIllllIllIIlI) {
        return llllllllllllIllIlIIlIllllIllIIll >= llllllllllllIllIlIIlIllllIllIIlI;
    }
    
    private static boolean lIIlIlIlIlIIIIIl(final int llllllllllllIllIlIIlIllllIlIIlII) {
        return llllllllllllIllIlIIlIllllIlIIlII == 0;
    }
    
    public boolean hasNormal() {
        if (lIIlIlIlIIllllIl(this.normalElementOffset)) {
            return VertexFormat.llIlIllIlIIIII[2] != 0;
        }
        return VertexFormat.llIlIllIlIIIII[0] != 0;
    }
    
    public boolean hasColor() {
        if (lIIlIlIlIIllllIl(this.colorElementOffset)) {
            return VertexFormat.llIlIllIlIIIII[2] != 0;
        }
        return VertexFormat.llIlIllIlIIIII[0] != 0;
    }
    
    private static boolean lIIlIlIlIIlllllI(final int llllllllllllIllIlIIlIllllIIlllll, final int llllllllllllIllIlIIlIllllIIllllI) {
        return llllllllllllIllIlIIlIllllIIlllll != llllllllllllIllIlIIlIllllIIllllI;
    }
    
    private boolean hasPosition() {
        int llllllllllllIllIlIIllIIIIIIlIlll = VertexFormat.llIlIllIlIIIII[0];
        final int llllllllllllIllIlIIllIIIIIIlIllI = this.elements.size();
        "".length();
        if ("  ".length() <= ((0x7B ^ 0x60 ^ (0xAD ^ 0x8B)) & (39 + 143 - 51 + 31 ^ 127 + 2 - 69 + 99 ^ -" ".length()))) {
            return ((200 + 134 - 209 + 78 ^ 183 + 149 - 281 + 141) & (0xBD ^ 0xB8 ^ (0x4B ^ 0x45) ^ -" ".length())) != 0x0;
        }
        while (!lIIlIlIlIIlllIll(llllllllllllIllIlIIllIIIIIIlIlll, llllllllllllIllIlIIllIIIIIIlIllI)) {
            final VertexFormatElement llllllllllllIllIlIIllIIIIIIlIlIl = this.elements.get(llllllllllllIllIlIIllIIIIIIlIlll);
            if (lIIlIlIlIIllllII(llllllllllllIllIlIIllIIIIIIlIlIl.isPositionElement() ? 1 : 0)) {
                return VertexFormat.llIlIllIlIIIII[2] != 0;
            }
            ++llllllllllllIllIlIIllIIIIIIlIlll;
        }
        return VertexFormat.llIlIllIlIIIII[0] != 0;
    }
    
    public VertexFormat func_181721_a(final VertexFormatElement llllllllllllIllIlIIllIIIIlIIIIII) {
        if (lIIlIlIlIIllllII(llllllllllllIllIlIIllIIIIlIIIIII.isPositionElement() ? 1 : 0) && lIIlIlIlIIllllII(this.hasPosition() ? 1 : 0)) {
            VertexFormat.LOGGER.warn(VertexFormat.llIlIllIIllllI[VertexFormat.llIlIllIlIIIII[0]]);
            return this;
        }
        this.elements.add(llllllllllllIllIlIIllIIIIlIIIIII);
        "".length();
        this.offsets.add(this.nextOffset);
        "".length();
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage()[llllllllllllIllIlIIllIIIIlIIIIII.getUsage().ordinal()]) {
            case 2: {
                this.normalElementOffset = this.nextOffset;
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return null;
                }
                break;
            }
            case 3: {
                this.colorElementOffset = this.nextOffset;
                "".length();
                if ((0x95 ^ 0x91) == 0x0) {
                    return null;
                }
                break;
            }
            case 4: {
                this.uvOffsetsById.add(llllllllllllIllIlIIllIIIIlIIIIII.getIndex(), this.nextOffset);
                break;
            }
        }
        this.nextOffset += llllllllllllIllIlIIllIIIIlIIIIII.getSize();
        return this;
    }
    
    private static String lIIlIlIlIIllIIlI(final String llllllllllllIllIlIIlIllllllIIIII, final String llllllllllllIllIlIIlIlllllIlllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIllllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIlllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlIllllllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlIllllllIIIlI.init(VertexFormat.llIlIllIlIIIII[3], llllllllllllIllIlIIlIllllllIIIll);
            return new String(llllllllllllIllIlIIlIllllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIllllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIllllllIIIIl) {
            llllllllllllIllIlIIlIllllllIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        String llllllllllllIllIlIIllIIIIIlIIIIl = String.valueOf(new StringBuilder(VertexFormat.llIlIllIIllllI[VertexFormat.llIlIllIlIIIII[2]]).append(this.elements.size()).append(VertexFormat.llIlIllIIllllI[VertexFormat.llIlIllIlIIIII[3]]));
        int llllllllllllIllIlIIllIIIIIlIIIII = VertexFormat.llIlIllIlIIIII[0];
        "".length();
        if ((141 + 117 - 116 + 27 ^ 118 + 40 - 45 + 59) == 0x0) {
            return null;
        }
        while (!lIIlIlIlIIlllIll(llllllllllllIllIlIIllIIIIIlIIIII, this.elements.size())) {
            llllllllllllIllIlIIllIIIIIlIIIIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIlIIllIIIIIlIIIIl)).append(this.elements.get(llllllllllllIllIlIIllIIIIIlIIIII).toString()));
            if (lIIlIlIlIIlllllI(llllllllllllIllIlIIllIIIIIlIIIII, this.elements.size() - VertexFormat.llIlIllIlIIIII[2])) {
                llllllllllllIllIlIIllIIIIIlIIIIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIlIIllIIIIIlIIIIl)).append(VertexFormat.llIlIllIIllllI[VertexFormat.llIlIllIlIIIII[4]]));
            }
            ++llllllllllllIllIlIIllIIIIIlIIIII;
        }
        return llllllllllllIllIlIIllIIIIIlIIIIl;
    }
    
    private static void lIIlIlIlIIlllIlI() {
        (llIlIllIlIIIII = new int[11])[0] = ((99 + 44 - 64 + 117 ^ 178 + 57 - 120 + 77) & (90 + 34 - 7 + 73 ^ 47 + 136 - 131 + 134 ^ -" ".length()));
        VertexFormat.llIlIllIlIIIII[1] = -" ".length();
        VertexFormat.llIlIllIlIIIII[2] = " ".length();
        VertexFormat.llIlIllIlIIIII[3] = "  ".length();
        VertexFormat.llIlIllIlIIIII[4] = "   ".length();
        VertexFormat.llIlIllIlIIIII[5] = (0x30 ^ 0x53 ^ (0xF2 ^ 0x95));
        VertexFormat.llIlIllIlIIIII[6] = (0x81 ^ 0x8D ^ (0xD0 ^ 0xC3));
        VertexFormat.llIlIllIlIIIII[7] = (0x38 ^ 0x6B ^ (0x37 ^ 0x62));
        VertexFormat.llIlIllIlIIIII[8] = (((0x5C ^ 0x7D) & ~(0x6B ^ 0x4A)) ^ (0x25 ^ 0x20));
        VertexFormat.llIlIllIlIIIII[9] = (0x42 ^ 0x3F ^ (0x2 ^ 0x78));
        VertexFormat.llIlIllIlIIIII[10] = (0x9C ^ 0xAD ^ (0x31 ^ 0x8));
    }
    
    private static boolean lIIlIlIlIIllllll(final Object llllllllllllIllIlIIlIllllIlIlIll, final Object llllllllllllIllIlIIlIllllIlIlIlI) {
        return llllllllllllIllIlIIlIllllIlIlIll == llllllllllllIllIlIIlIllllIlIlIlI;
    }
    
    public List<VertexFormatElement> getElements() {
        return this.elements;
    }
    
    public int func_181719_f() {
        return this.getNextOffset() / VertexFormat.llIlIllIlIIIII[5];
    }
    
    public int getColorOffset() {
        return this.colorElementOffset;
    }
    
    public int getElementCount() {
        return this.elements.size();
    }
    
    private static boolean lIIlIlIlIIllllII(final int llllllllllllIllIlIIlIllllIlIIllI) {
        return llllllllllllIllIlIIlIllllIlIIllI != 0;
    }
    
    public void clear() {
        this.elements.clear();
        this.offsets.clear();
        this.colorElementOffset = VertexFormat.llIlIllIlIIIII[1];
        this.uvOffsetsById.clear();
        this.normalElementOffset = VertexFormat.llIlIllIlIIIII[1];
        this.nextOffset = VertexFormat.llIlIllIlIIIII[0];
    }
    
    static {
        lIIlIlIlIIlllIlI();
        lIIlIlIlIIllIlII();
        LOGGER = LogManager.getLogger();
    }
    
    public VertexFormatElement getElement(final int llllllllllllIllIlIIllIIIIIIIIIIl) {
        return this.elements.get(llllllllllllIllIlIIllIIIIIIIIIIl);
    }
    
    private static boolean lIIlIlIlIlIIIIII(final Object llllllllllllIllIlIIlIllllIlIlIII) {
        return llllllllllllIllIlIIlIllllIlIlIII != null;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage() {
        final int[] $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage = VertexFormat.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
        if (lIIlIlIlIlIIIIII($switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage)) {
            return $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
        }
        "".length();
        final byte llllllllllllIllIlIIlIllllllIlIII = (Object)new int[VertexFormatElement.EnumUsage.values().length];
        try {
            llllllllllllIllIlIIlIllllllIlIII[VertexFormatElement.EnumUsage.BLEND_WEIGHT.ordinal()] = VertexFormat.llIlIllIlIIIII[7];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIlIIlIllllllIlIII[VertexFormatElement.EnumUsage.COLOR.ordinal()] = VertexFormat.llIlIllIlIIIII[4];
            "".length();
            if ("   ".length() >= (0x1F ^ 0x1B)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIlIIlIllllllIlIII[VertexFormatElement.EnumUsage.MATRIX.ordinal()] = VertexFormat.llIlIllIlIIIII[8];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIlIIlIllllllIlIII[VertexFormatElement.EnumUsage.NORMAL.ordinal()] = VertexFormat.llIlIllIlIIIII[3];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIlIIlIllllllIlIII[VertexFormatElement.EnumUsage.PADDING.ordinal()] = VertexFormat.llIlIllIlIIIII[9];
            "".length();
            if (((0x20 ^ 0x40) & ~(0xF ^ 0x6F)) > " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIlIIlIllllllIlIII[VertexFormatElement.EnumUsage.POSITION.ordinal()] = VertexFormat.llIlIllIlIIIII[2];
            "".length();
            if ((0x78 ^ 0x7C) != (0x55 ^ 0x51)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            llllllllllllIllIlIIlIllllllIlIII[VertexFormatElement.EnumUsage.UV.ordinal()] = VertexFormat.llIlIllIlIIIII[5];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return VertexFormat.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage = (int[])(Object)llllllllllllIllIlIIlIllllllIlIII;
    }
    
    public int func_181720_d(final int llllllllllllIllIlIIlIllllllllIll) {
        return this.offsets.get(llllllllllllIllIlIIlIllllllllIll);
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIlIIlIlllllllIlII) {
        if (lIIlIlIlIIllllll(this, llllllllllllIllIlIIlIlllllllIlII)) {
            return VertexFormat.llIlIllIlIIIII[2] != 0;
        }
        if (lIIlIlIlIlIIIIII(llllllllllllIllIlIIlIlllllllIlII) && lIIlIlIlIIllllll(this.getClass(), llllllllllllIllIlIIlIlllllllIlII.getClass())) {
            final VertexFormat llllllllllllIllIlIIlIlllllllIIll = (VertexFormat)llllllllllllIllIlIIlIlllllllIlII;
            int equals;
            if (lIIlIlIlIIlllllI(this.nextOffset, llllllllllllIllIlIIlIlllllllIIll.nextOffset)) {
                equals = VertexFormat.llIlIllIlIIIII[0];
                "".length();
                if (" ".length() <= 0) {
                    return ((39 + 107 - 14 + 2 ^ 67 + 182 - 201 + 140) & (0x60 ^ 0x70 ^ (0x3C ^ 0x16) ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIlIlIlIlIIIIIl(this.elements.equals(llllllllllllIllIlIIlIlllllllIIll.elements) ? 1 : 0)) {
                equals = VertexFormat.llIlIllIlIIIII[0];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0xBE ^ 0x94) & ~(0x5E ^ 0x74)) != 0x0;
                }
            }
            else {
                equals = (this.offsets.equals(llllllllllllIllIlIIlIlllllllIIll.offsets) ? 1 : 0);
            }
            return equals != 0;
        }
        return VertexFormat.llIlIllIlIIIII[0] != 0;
    }
    
    private static boolean lIIlIlIlIIllllIl(final int llllllllllllIllIlIIlIllllIlIIIlI) {
        return llllllllllllIllIlIIlIllllIlIIIlI >= 0;
    }
    
    private static String lIIlIlIlIIllIIIl(final String llllllllllllIllIlIIlIlllllIlIIIl, final String llllllllllllIllIlIIlIlllllIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIlllllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIlllllIlIIlI.getBytes(StandardCharsets.UTF_8)), VertexFormat.llIlIllIlIIIII[10]), "DES");
            final Cipher llllllllllllIllIlIIlIlllllIlIlIl = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIlllllIlIlIl.init(VertexFormat.llIlIllIlIIIII[3], llllllllllllIllIlIIlIlllllIlIllI);
            return new String(llllllllllllIllIlIIlIlllllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIlllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIlllllIlIlII) {
            llllllllllllIllIlIIlIlllllIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIlIlIIllIlII() {
        (llIlIllIIllllI = new String[VertexFormat.llIlIllIlIIIII[5]])[VertexFormat.llIlIllIlIIIII[0]] = lIIlIlIlIIllIIIl("wEr/yDNC2PBTgNFrbllM9tiieSSnrsMQA/IZvMzXFEUdDVanUTgIrlk5wJMZ51sQUUSMoMawJdWirFZ1IEXC7EW8rCglVwleXEj6ZkNGLp4OtTPRafSm3bMbSTtMxY7tLaPqZ9IOVlw=", "QHWzz");
        VertexFormat.llIlIllIIllllI[VertexFormat.llIlIllIlIIIII[2]] = lIIlIlIlIIllIIlI("0qUmuLxWGQdhSC7ExecAow==", "hsNRE");
        VertexFormat.llIlIllIIllllI[VertexFormat.llIlIllIlIIIII[3]] = lIIlIlIlIIllIIll("VhQEASYTHxwXcVY=", "vqhdK");
        VertexFormat.llIlIllIIllllI[VertexFormat.llIlIllIlIIIII[4]] = lIIlIlIlIIllIIlI("hE7hCvA2Sio=", "XoIyv");
    }
    
    public int getNormalOffset() {
        return this.normalElementOffset;
    }
    
    @Override
    public int hashCode() {
        int llllllllllllIllIlIIlIllllllIllII = this.elements.hashCode();
        llllllllllllIllIlIIlIllllllIllII = VertexFormat.llIlIllIlIIIII[6] * llllllllllllIllIlIIlIllllllIllII + this.offsets.hashCode();
        llllllllllllIllIlIIlIllllllIllII = VertexFormat.llIlIllIlIIIII[6] * llllllllllllIllIlIIlIllllllIllII + this.nextOffset;
        return llllllllllllIllIlIIlIllllllIllII;
    }
    
    public int getUvOffsetById(final int llllllllllllIllIlIIllIIIIIlIlIII) {
        return this.uvOffsetsById.get(llllllllllllIllIlIIllIIIIIlIlIII);
    }
    
    private static boolean lIIlIlIlIlIIIIlI(final int llllllllllllIllIlIIlIllllIlIllll, final int llllllllllllIllIlIIlIllllIlIlllI) {
        return llllllllllllIllIlIIlIllllIlIllll < llllllllllllIllIlIIlIllllIlIlllI;
    }
    
    public int getNextOffset() {
        return this.nextOffset;
    }
    
    private static String lIIlIlIlIIllIIll(String llllllllllllIllIlIIlIllllIlllllI, final String llllllllllllIllIlIIlIlllllIIIIlI) {
        llllllllllllIllIlIIlIllllIlllllI = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlIllllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIlllllIIIIIl = new StringBuilder();
        final char[] llllllllllllIllIlIIlIlllllIIIIII = llllllllllllIllIlIIlIlllllIIIIlI.toCharArray();
        int llllllllllllIllIlIIlIllllIllllll = VertexFormat.llIlIllIlIIIII[0];
        final String llllllllllllIllIlIIlIllllIlllIIl = (Object)llllllllllllIllIlIIlIllllIlllllI.toCharArray();
        final String llllllllllllIllIlIIlIllllIlllIII = (String)llllllllllllIllIlIIlIllllIlllIIl.length;
        boolean llllllllllllIllIlIIlIllllIllIlll = VertexFormat.llIlIllIlIIIII[0] != 0;
        while (lIIlIlIlIlIIIIlI(llllllllllllIllIlIIlIllllIllIlll ? 1 : 0, (int)llllllllllllIllIlIIlIllllIlllIII)) {
            final char llllllllllllIllIlIIlIlllllIIIlII = llllllllllllIllIlIIlIllllIlllIIl[llllllllllllIllIlIIlIllllIllIlll];
            llllllllllllIllIlIIlIlllllIIIIIl.append((char)(llllllllllllIllIlIIlIlllllIIIlII ^ llllllllllllIllIlIIlIlllllIIIIII[llllllllllllIllIlIIlIllllIllllll % llllllllllllIllIlIIlIlllllIIIIII.length]));
            "".length();
            ++llllllllllllIllIlIIlIllllIllllll;
            ++llllllllllllIllIlIIlIllllIllIlll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIlllllIIIIIl);
    }
    
    public boolean hasUvOffset(final int llllllllllllIllIlIIllIIIIIlIllII) {
        if (lIIlIlIlIIlllIll(this.uvOffsetsById.size() - VertexFormat.llIlIllIlIIIII[2], llllllllllllIllIlIIllIIIIIlIllII)) {
            return VertexFormat.llIlIllIlIIIII[2] != 0;
        }
        return VertexFormat.llIlIllIlIIIII[0] != 0;
    }
    
    public VertexFormat(final VertexFormat llllllllllllIllIlIIllIIIIlIIlllI) {
        this();
        int llllllllllllIllIlIIllIIIIlIIllIl = VertexFormat.llIlIllIlIIIII[0];
        "".length();
        if ("   ".length() <= ((0xA ^ 0x5E ^ (0xFF ^ 0xA6)) & (0x3F ^ 0x7C ^ (0xC1 ^ 0x8F) ^ -" ".length()))) {
            throw null;
        }
        while (!lIIlIlIlIIlllIll(llllllllllllIllIlIIllIIIIlIIllIl, llllllllllllIllIlIIllIIIIlIIlllI.getElementCount())) {
            this.func_181721_a(llllllllllllIllIlIIllIIIIlIIlllI.getElement(llllllllllllIllIlIIllIIIIlIIllIl));
            "".length();
            ++llllllllllllIllIlIIllIIIIlIIllIl;
        }
        this.nextOffset = llllllllllllIllIlIIllIIIIlIIlllI.getNextOffset();
    }
}
