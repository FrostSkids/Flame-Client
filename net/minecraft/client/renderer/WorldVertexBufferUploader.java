// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.List;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.vertex.VertexFormatElement;

public class WorldVertexBufferUploader
{
    private static final /* synthetic */ int[] llIIIIIlIlIlII;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
    
    private static boolean lIIIIlllIIllllIl(final int llllllllllllIlllIllllIIIlllIIlll) {
        return llllllllllllIlllIllllIIIlllIIlll > 0;
    }
    
    public void func_181679_a(final WorldRenderer llllllllllllIlllIllllIIlIIlIlIII) {
        if (lIIIIlllIIllllIl(llllllllllllIlllIllllIIlIIlIlIII.getVertexCount())) {
            final VertexFormat llllllllllllIlllIllllIIlIIlIIlll = llllllllllllIlllIllllIIlIIlIlIII.getVertexFormat();
            final int llllllllllllIlllIllllIIlIIlIIllI = llllllllllllIlllIllllIIlIIlIIlll.getNextOffset();
            final ByteBuffer llllllllllllIlllIllllIIlIIlIIlIl = llllllllllllIlllIllllIIlIIlIlIII.getByteBuffer();
            final List<VertexFormatElement> llllllllllllIlllIllllIIlIIlIIlII = llllllllllllIlllIllllIIlIIlIIlll.getElements();
            int llllllllllllIlllIllllIIlIIlIIIll = WorldVertexBufferUploader.llIIIIIlIlIlII[0];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
            while (!lIIIIlllIIlllllI(llllllllllllIlllIllllIIlIIlIIIll, llllllllllllIlllIllllIIlIIlIIlII.size())) {
                final VertexFormatElement llllllllllllIlllIllllIIlIIlIIIlI = llllllllllllIlllIllllIIlIIlIIlII.get(llllllllllllIlllIllllIIlIIlIIIll);
                final VertexFormatElement.EnumUsage llllllllllllIlllIllllIIlIIlIIIIl = llllllllllllIlllIllllIIlIIlIIIlI.getUsage();
                final int llllllllllllIlllIllllIIlIIIlllll = llllllllllllIlllIllllIIlIIlIIIlI.getType().getGlConstant();
                final int llllllllllllIlllIllllIIlIIIlllIl = llllllllllllIlllIllllIIlIIlIIIlI.getIndex();
                llllllllllllIlllIllllIIlIIlIIlIl.position(llllllllllllIlllIllllIIlIIlIIlll.func_181720_d(llllllllllllIlllIllllIIlIIlIIIll));
                "".length();
                switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage()[llllllllllllIlllIllllIIlIIlIIIIl.ordinal()]) {
                    case 1: {
                        GL11.glVertexPointer(llllllllllllIlllIllllIIlIIlIIIlI.getElementCount(), llllllllllllIlllIllllIIlIIIlllll, llllllllllllIlllIllllIIlIIlIIllI, llllllllllllIlllIllllIIlIIlIIlIl);
                        GL11.glEnableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[1]);
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit + llllllllllllIlllIllllIIlIIIlllIl);
                        GL11.glTexCoordPointer(llllllllllllIlllIllllIIlIIlIIIlI.getElementCount(), llllllllllllIlllIllllIIlIIIlllll, llllllllllllIlllIllllIIlIIlIIllI, llllllllllllIlllIllllIIlIIlIIlIl);
                        GL11.glEnableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[2]);
                        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
                        "".length();
                        if (((0x61 ^ 0x49) & ~(0x28 ^ 0x0)) > " ".length()) {
                            return;
                        }
                        break;
                    }
                    case 3: {
                        GL11.glColorPointer(llllllllllllIlllIllllIIlIIlIIIlI.getElementCount(), llllllllllllIlllIllllIIlIIIlllll, llllllllllllIlllIllllIIlIIlIIllI, llllllllllllIlllIllllIIlIIlIIlIl);
                        GL11.glEnableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[3]);
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        GL11.glNormalPointer(llllllllllllIlllIllllIIlIIIlllll, llllllllllllIlllIllllIIlIIlIIllI, llllllllllllIlllIllllIIlIIlIIlIl);
                        GL11.glEnableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[4]);
                        break;
                    }
                }
                ++llllllllllllIlllIllllIIlIIlIIIll;
            }
            GL11.glDrawArrays(llllllllllllIlllIllllIIlIIlIlIII.getDrawMode(), WorldVertexBufferUploader.llIIIIIlIlIlII[0], llllllllllllIlllIllllIIlIIlIlIII.getVertexCount());
            int llllllllllllIlllIllllIIlIIIlllII = WorldVertexBufferUploader.llIIIIIlIlIlII[0];
            final int llllllllllllIlllIllllIIlIIIllIll = llllllllllllIlllIllllIIlIIlIIlII.size();
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
            while (!lIIIIlllIIlllllI(llllllllllllIlllIllllIIlIIIlllII, llllllllllllIlllIllllIIlIIIllIll)) {
                final VertexFormatElement llllllllllllIlllIllllIIlIIIllIIl = llllllllllllIlllIllllIIlIIlIIlII.get(llllllllllllIlllIllllIIlIIIlllII);
                final VertexFormatElement.EnumUsage llllllllllllIlllIllllIIlIIIlIlll = llllllllllllIlllIllllIIlIIIllIIl.getUsage();
                final int llllllllllllIlllIllllIIlIIIlIllI = llllllllllllIlllIllllIIlIIIllIIl.getIndex();
                switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage()[llllllllllllIlllIllllIIlIIIlIlll.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[1]);
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit + llllllllllllIlllIllllIIlIIIlIllI);
                        GL11.glDisableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[2]);
                        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                        break;
                    }
                    case 3: {
                        GL11.glDisableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[3]);
                        GlStateManager.resetColor();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        GL11.glDisableClientState(WorldVertexBufferUploader.llIIIIIlIlIlII[4]);
                        break;
                    }
                }
                ++llllllllllllIlllIllllIIlIIIlllII;
            }
        }
        llllllllllllIlllIllllIIlIIlIlIII.reset();
    }
    
    private static boolean lIIIIlllIIlllllI(final int llllllllllllIlllIllllIIIllllIIll, final int llllllllllllIlllIllllIIIllllIIIl) {
        return llllllllllllIlllIllllIIIllllIIll >= llllllllllllIlllIllllIIIllllIIIl;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage() {
        final int[] $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage = WorldVertexBufferUploader.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
        if (lIIIIlllIlIIIIII($switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage)) {
            return $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
        }
        "".length();
        final String llllllllllllIlllIllllIIIllllllII = (Object)new int[VertexFormatElement.EnumUsage.values().length];
        try {
            llllllllllllIlllIllllIIIllllllII[VertexFormatElement.EnumUsage.BLEND_WEIGHT.ordinal()] = WorldVertexBufferUploader.llIIIIIlIlIlII[5];
            "".length();
            if (((0x58 ^ 0x1D) & ~(0x24 ^ 0x61)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIllllllII[VertexFormatElement.EnumUsage.COLOR.ordinal()] = WorldVertexBufferUploader.llIIIIIlIlIlII[6];
            "".length();
            if (-(0x93 ^ 0x97) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIllllllII[VertexFormatElement.EnumUsage.MATRIX.ordinal()] = WorldVertexBufferUploader.llIIIIIlIlIlII[7];
            "".length();
            if (((0x19 ^ 0x1F) & ~(0x88 ^ 0x8E) & ~((0x3F ^ 0x79) & ~(0x32 ^ 0x74))) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIllllllII[VertexFormatElement.EnumUsage.NORMAL.ordinal()] = WorldVertexBufferUploader.llIIIIIlIlIlII[8];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIllllllII[VertexFormatElement.EnumUsage.PADDING.ordinal()] = WorldVertexBufferUploader.llIIIIIlIlIlII[9];
            "".length();
            if (-(0x34 ^ 0x30) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIllllllII[VertexFormatElement.EnumUsage.POSITION.ordinal()] = WorldVertexBufferUploader.llIIIIIlIlIlII[10];
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            llllllllllllIlllIllllIIIllllllII[VertexFormatElement.EnumUsage.UV.ordinal()] = WorldVertexBufferUploader.llIIIIIlIlIlII[11];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return WorldVertexBufferUploader.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage = (int[])(Object)llllllllllllIlllIllllIIIllllllII;
    }
    
    private static void lIIIIlllIIllllII() {
        (llIIIIIlIlIlII = new int[12])[0] = ((0x7C ^ 0x65) & ~(0xDC ^ 0xC5));
        WorldVertexBufferUploader.llIIIIIlIlIlII[1] = (-(0xFFFFB9BE & 0x664D) & (0xFFFFB37F & 0xECFF));
        WorldVertexBufferUploader.llIIIIIlIlIlII[2] = (-(0xFFFFBF9F & 0x5D67) & (0xFFFF9DFE & 0xFF7F));
        WorldVertexBufferUploader.llIIIIIlIlIlII[3] = (0xFFFFB676 & 0xC9FF);
        WorldVertexBufferUploader.llIIIIIlIlIlII[4] = (-(0xFFFFF96D & 0x5F93) & (0xFFFFDB7D & 0xFDF7));
        WorldVertexBufferUploader.llIIIIIlIlIlII[5] = (0xF ^ 0x9);
        WorldVertexBufferUploader.llIIIIIlIlIlII[6] = "   ".length();
        WorldVertexBufferUploader.llIIIIIlIlIlII[7] = (0xA6 ^ 0xA3);
        WorldVertexBufferUploader.llIIIIIlIlIlII[8] = "  ".length();
        WorldVertexBufferUploader.llIIIIIlIlIlII[9] = (0xA2 ^ 0xA5);
        WorldVertexBufferUploader.llIIIIIlIlIlII[10] = " ".length();
        WorldVertexBufferUploader.llIIIIIlIlIlII[11] = (67 + 108 - 116 + 84 ^ 67 + 72 - 18 + 18);
    }
    
    static {
        lIIIIlllIIllllII();
    }
    
    private static boolean lIIIIlllIlIIIIII(final Object llllllllllllIlllIllllIIIlllIllII) {
        return llllllllllllIlllIllllIIIlllIllII != null;
    }
}
