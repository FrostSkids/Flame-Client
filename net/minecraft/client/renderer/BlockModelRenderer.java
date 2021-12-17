// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.Minecraft;
import java.io.Serializable;
import java.util.Iterator;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.Vec3i;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.block.model.BakedQuad;
import java.util.List;
import java.util.BitSet;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.Block;

public class BlockModelRenderer
{
    private static final /* synthetic */ int[] lllIllIlIIIIlI;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    private static final /* synthetic */ String[] lllIllIlIIIIIl;
    
    private static boolean lIlIIlIIlIIlllll(final int llllllllllllIlIllIIlIlIIIlIlIIll, final int llllllllllllIlIllIIlIlIIIlIlIIlI) {
        return llllllllllllIlIllIIlIlIIIlIlIIll >= llllllllllllIlIllIIlIlIIIlIlIIlI;
    }
    
    private void fillQuadBounds(final Block llllllllllllIlIllIIlIlIlIIlIllll, final int[] llllllllllllIlIllIIlIlIlIIlIlllI, final EnumFacing llllllllllllIlIllIIlIlIlIIIlllII, final float[] llllllllllllIlIllIIlIlIlIIIllIll, final BitSet llllllllllllIlIllIIlIlIlIIlIlIll) {
        float llllllllllllIlIllIIlIlIlIIlIlIlI = 32.0f;
        float llllllllllllIlIllIIlIlIlIIlIlIIl = 32.0f;
        float llllllllllllIlIllIIlIlIlIIlIlIII = 32.0f;
        float llllllllllllIlIllIIlIlIlIIlIIlll = -32.0f;
        float llllllllllllIlIllIIlIlIlIIlIIllI = -32.0f;
        float llllllllllllIlIllIIlIlIlIIlIIlIl = -32.0f;
        int llllllllllllIlIllIIlIlIlIIlIIlII = BlockModelRenderer.lllIllIlIIIIlI[1];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lIlIIlIIlIIlllll(llllllllllllIlIllIIlIlIlIIlIIlII, BlockModelRenderer.lllIllIlIIIIlI[10])) {
            final float llllllllllllIlIllIIlIlIlIIlIIIll = Float.intBitsToFloat(llllllllllllIlIllIIlIlIlIIlIlllI[llllllllllllIlIllIIlIlIlIIlIIlII * BlockModelRenderer.lllIllIlIIIIlI[11]]);
            final float llllllllllllIlIllIIlIlIlIIlIIIlI = Float.intBitsToFloat(llllllllllllIlIllIIlIlIlIIlIlllI[llllllllllllIlIllIIlIlIlIIlIIlII * BlockModelRenderer.lllIllIlIIIIlI[11] + BlockModelRenderer.lllIllIlIIIIlI[0]]);
            final float llllllllllllIlIllIIlIlIlIIlIIIIl = Float.intBitsToFloat(llllllllllllIlIllIIlIlIlIIlIlllI[llllllllllllIlIllIIlIlIlIIlIIlII * BlockModelRenderer.lllIllIlIIIIlI[11] + BlockModelRenderer.lllIllIlIIIIlI[2]]);
            llllllllllllIlIllIIlIlIlIIlIlIlI = Math.min(llllllllllllIlIllIIlIlIlIIlIlIlI, llllllllllllIlIllIIlIlIlIIlIIIll);
            llllllllllllIlIllIIlIlIlIIlIlIIl = Math.min(llllllllllllIlIllIIlIlIlIIlIlIIl, llllllllllllIlIllIIlIlIlIIlIIIlI);
            llllllllllllIlIllIIlIlIlIIlIlIII = Math.min(llllllllllllIlIllIIlIlIlIIlIlIII, llllllllllllIlIllIIlIlIlIIlIIIIl);
            llllllllllllIlIllIIlIlIlIIlIIlll = Math.max(llllllllllllIlIllIIlIlIlIIlIIlll, llllllllllllIlIllIIlIlIlIIlIIIll);
            llllllllllllIlIllIIlIlIlIIlIIllI = Math.max(llllllllllllIlIllIIlIlIlIIlIIllI, llllllllllllIlIllIIlIlIlIIlIIIlI);
            llllllllllllIlIllIIlIlIlIIlIIlIl = Math.max(llllllllllllIlIllIIlIlIlIIlIIlIl, llllllllllllIlIllIIlIlIlIIlIIIIl);
            ++llllllllllllIlIllIIlIlIlIIlIIlII;
        }
        if (lIlIIlIIlIlIIlIl(llllllllllllIlIllIIlIlIlIIIllIll)) {
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.WEST.getIndex()] = llllllllllllIlIllIIlIlIlIIlIlIlI;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.EAST.getIndex()] = llllllllllllIlIllIIlIlIlIIlIIlll;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.DOWN.getIndex()] = llllllllllllIlIllIIlIlIlIIlIlIIl;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.UP.getIndex()] = llllllllllllIlIllIIlIlIlIIlIIllI;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.NORTH.getIndex()] = llllllllllllIlIllIIlIlIlIIlIlIII;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.SOUTH.getIndex()] = llllllllllllIlIllIIlIlIlIIlIIlIl;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.WEST.getIndex() + EnumFacing.values().length] = 1.0f - llllllllllllIlIllIIlIlIlIIlIlIlI;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.EAST.getIndex() + EnumFacing.values().length] = 1.0f - llllllllllllIlIllIIlIlIlIIlIIlll;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.DOWN.getIndex() + EnumFacing.values().length] = 1.0f - llllllllllllIlIllIIlIlIlIIlIlIIl;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.UP.getIndex() + EnumFacing.values().length] = 1.0f - llllllllllllIlIllIIlIlIlIIlIIllI;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.NORTH.getIndex() + EnumFacing.values().length] = 1.0f - llllllllllllIlIllIIlIlIlIIlIlIII;
            llllllllllllIlIllIIlIlIlIIIllIll[EnumFacing.SOUTH.getIndex() + EnumFacing.values().length] = 1.0f - llllllllllllIlIllIIlIlIlIIlIIlIl;
        }
        final float llllllllllllIlIllIIlIlIlIIlIIIII = 1.0E-4f;
        final float llllllllllllIlIllIIlIlIlIIIlllll = 0.9999f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIllIIlIlIlIIIlllII.ordinal()]) {
            case 1: {
                final int bitIndex = BlockModelRenderer.lllIllIlIIIIlI[0];
                int value;
                if (lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIlI, 1.0E-4f)) && lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIII, 1.0E-4f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlll, 0.9999f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlIl, 0.9999f))) {
                    value = BlockModelRenderer.lllIllIlIIIIlI[1];
                    "".length();
                    if ((0xB9 ^ 0xBD) < 0) {
                        return;
                    }
                }
                else {
                    value = BlockModelRenderer.lllIllIlIIIIlI[0];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex, (boolean)(value != 0));
                final int bitIndex2 = BlockModelRenderer.lllIllIlIIIIlI[1];
                int value2;
                if ((!lIlIIlIIlIlIIlll(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIlIIl, 1.0E-4f)) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlIIlIllll.isFullCube() ? 1 : 0)) && lIlIIlIIlIIllllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIIl, llllllllllllIlIllIIlIlIlIIlIIllI))) {
                    value2 = BlockModelRenderer.lllIllIlIIIIlI[0];
                    "".length();
                    if ("  ".length() == ((0xC6 ^ 0x91) & ~(0xD0 ^ 0x87))) {
                        return;
                    }
                }
                else {
                    value2 = BlockModelRenderer.lllIllIlIIIIlI[1];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex2, (boolean)(value2 != 0));
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                final int bitIndex3 = BlockModelRenderer.lllIllIlIIIIlI[0];
                int value3;
                if (lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIlI, 1.0E-4f)) && lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIII, 1.0E-4f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlll, 0.9999f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlIl, 0.9999f))) {
                    value3 = BlockModelRenderer.lllIllIlIIIIlI[1];
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    value3 = BlockModelRenderer.lllIllIlIIIIlI[0];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex3, (boolean)(value3 != 0));
                final int bitIndex4 = BlockModelRenderer.lllIllIlIIIIlI[1];
                int value4;
                if ((!lIlIIlIIlIlIlIII(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIIllI, 0.9999f)) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlIIlIllll.isFullCube() ? 1 : 0)) && lIlIIlIIlIIllllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIIl, llllllllllllIlIllIIlIlIlIIlIIllI))) {
                    value4 = BlockModelRenderer.lllIllIlIIIIlI[0];
                    "".length();
                    if (((0x78 ^ 0x14 ^ (0xF9 ^ 0x9E)) & (0x35 ^ 0x1F ^ (0x34 ^ 0x15) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    value4 = BlockModelRenderer.lllIllIlIIIIlI[1];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex4, (boolean)(value4 != 0));
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                final int bitIndex5 = BlockModelRenderer.lllIllIlIIIIlI[0];
                int value5;
                if (lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIlI, 1.0E-4f)) && lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIIl, 1.0E-4f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlll, 0.9999f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIllI, 0.9999f))) {
                    value5 = BlockModelRenderer.lllIllIlIIIIlI[1];
                    "".length();
                    if (((0x20 ^ 0x6C) & ~(0xD7 ^ 0x9B)) != 0x0) {
                        return;
                    }
                }
                else {
                    value5 = BlockModelRenderer.lllIllIlIIIIlI[0];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex5, (boolean)(value5 != 0));
                final int bitIndex6 = BlockModelRenderer.lllIllIlIIIIlI[1];
                int value6;
                if ((!lIlIIlIIlIlIIlll(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIlIII, 1.0E-4f)) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlIIlIllll.isFullCube() ? 1 : 0)) && lIlIIlIIlIIllllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIII, llllllllllllIlIllIIlIlIlIIlIIlIl))) {
                    value6 = BlockModelRenderer.lllIllIlIIIIlI[0];
                    "".length();
                    if ((0x9B ^ 0x9F) < "   ".length()) {
                        return;
                    }
                }
                else {
                    value6 = BlockModelRenderer.lllIllIlIIIIlI[1];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex6, (boolean)(value6 != 0));
                "".length();
                if ("  ".length() < " ".length()) {
                    return;
                }
                break;
            }
            case 4: {
                final int bitIndex7 = BlockModelRenderer.lllIllIlIIIIlI[0];
                int value7;
                if (lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIlI, 1.0E-4f)) && lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIIl, 1.0E-4f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlll, 0.9999f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIllI, 0.9999f))) {
                    value7 = BlockModelRenderer.lllIllIlIIIIlI[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    value7 = BlockModelRenderer.lllIllIlIIIIlI[0];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex7, (boolean)(value7 != 0));
                final int bitIndex8 = BlockModelRenderer.lllIllIlIIIIlI[1];
                int value8;
                if ((!lIlIIlIIlIlIlIII(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIIlIl, 0.9999f)) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlIIlIllll.isFullCube() ? 1 : 0)) && lIlIIlIIlIIllllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIII, llllllllllllIlIllIIlIlIlIIlIIlIl))) {
                    value8 = BlockModelRenderer.lllIllIlIIIIlI[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    value8 = BlockModelRenderer.lllIllIlIIIIlI[1];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex8, (boolean)(value8 != 0));
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 5: {
                final int bitIndex9 = BlockModelRenderer.lllIllIlIIIIlI[0];
                int value9;
                if (lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIIl, 1.0E-4f)) && lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIII, 1.0E-4f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIllI, 0.9999f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlIl, 0.9999f))) {
                    value9 = BlockModelRenderer.lllIllIlIIIIlI[1];
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
                else {
                    value9 = BlockModelRenderer.lllIllIlIIIIlI[0];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex9, (boolean)(value9 != 0));
                final int bitIndex10 = BlockModelRenderer.lllIllIlIIIIlI[1];
                int value10;
                if ((!lIlIIlIIlIlIIlll(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIlIlI, 1.0E-4f)) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlIIlIllll.isFullCube() ? 1 : 0)) && lIlIIlIIlIIllllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIlI, llllllllllllIlIllIIlIlIlIIlIIlll))) {
                    value10 = BlockModelRenderer.lllIllIlIIIIlI[0];
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                else {
                    value10 = BlockModelRenderer.lllIllIlIIIIlI[1];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex10, (boolean)(value10 != 0));
                "".length();
                if (-(0x5C ^ 0x59) >= 0) {
                    return;
                }
                break;
            }
            case 6: {
                final int bitIndex11 = BlockModelRenderer.lllIllIlIIIIlI[0];
                int value11;
                if (lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIIl, 1.0E-4f)) && lIlIIlIIlIlIIllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIII, 1.0E-4f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIllI, 0.9999f)) && lIlIIlIIlIlIIIII(lIlIIlIIlIlIIlII(llllllllllllIlIllIIlIlIlIIlIIlIl, 0.9999f))) {
                    value11 = BlockModelRenderer.lllIllIlIIIIlI[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    value11 = BlockModelRenderer.lllIllIlIIIIlI[0];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex11, (boolean)(value11 != 0));
                final int bitIndex12 = BlockModelRenderer.lllIllIlIIIIlI[1];
                int value12;
                if ((!lIlIIlIIlIlIlIII(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIIlll, 0.9999f)) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlIIlIllll.isFullCube() ? 1 : 0)) && lIlIIlIIlIIllllI(lIlIIlIIlIlIIIll(llllllllllllIlIllIIlIlIlIIlIlIlI, llllllllllllIlIllIIlIlIlIIlIIlll))) {
                    value12 = BlockModelRenderer.lllIllIlIIIIlI[0];
                    "".length();
                    if (((0x82 ^ 0xC2) & ~(0xFD ^ 0xBD)) < -" ".length()) {
                        return;
                    }
                }
                else {
                    value12 = BlockModelRenderer.lllIllIlIIIIlI[1];
                }
                llllllllllllIlIllIIlIlIlIIlIlIll.set(bitIndex12, (boolean)(value12 != 0));
                break;
            }
        }
    }
    
    private static int lIlIIlIIlIlIIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlIIlIIlIlIIIII(final int llllllllllllIlIllIIlIlIIIIlllIII) {
        return llllllllllllIlIllIIlIlIIIIlllIII > 0;
    }
    
    private static void lIlIIlIIlIIllIll() {
        (lllIllIlIIIIIl = new String[BlockModelRenderer.lllIllIlIIIIlI[3]])[BlockModelRenderer.lllIllIlIIIIlI[1]] = lIlIIlIIlIIllIIl("j3O4iwfENQVQKDuabmR5a4RtpQ5mAjWa", "IHpHV");
        BlockModelRenderer.lllIllIlIIIIIl[BlockModelRenderer.lllIllIlIIIIlI[0]] = lIlIIlIIlIIllIlI("LgIjCxFMAyMMHwBOLg0TAglsHB8fHSkEGxgLKA==", "lnLhz");
        BlockModelRenderer.lllIllIlIIIIIl[BlockModelRenderer.lllIllIlIIIIlI[2]] = lIlIIlIIlIIllIlI("AwQ+Lyx2Nhg=", "VwWAK");
    }
    
    private void renderModelBrightnessColorQuads(final float llllllllllllIlIllIIlIlIIlIIIIllI, final float llllllllllllIlIllIIlIlIIlIIIlllI, final float llllllllllllIlIllIIlIlIIlIIIllIl, final float llllllllllllIlIllIIlIlIIlIIIIIll, final List<BakedQuad> llllllllllllIlIllIIlIlIIlIIIIIlI) {
        final Tessellator llllllllllllIlIllIIlIlIIlIIIlIlI = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlIllIIlIlIIlIIIlIIl = llllllllllllIlIllIIlIlIIlIIIlIlI.getWorldRenderer();
        final double llllllllllllIlIllIIlIlIIIllllllI = (double)llllllllllllIlIllIIlIlIIlIIIIIlI.iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIlIIlIIlIIllllI(((Iterator)llllllllllllIlIllIIlIlIIIllllllI).hasNext() ? 1 : 0)) {
            final BakedQuad llllllllllllIlIllIIlIlIIlIIIlIII = ((Iterator<BakedQuad>)llllllllllllIlIllIIlIlIIIllllllI).next();
            llllllllllllIlIllIIlIlIIlIIIlIIl.begin(BlockModelRenderer.lllIllIlIIIIlI[11], DefaultVertexFormats.ITEM);
            llllllllllllIlIllIIlIlIIlIIIlIIl.addVertexData(llllllllllllIlIllIIlIlIIlIIIlIII.getVertexData());
            if (lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIIlIIIlIII.hasTintIndex() ? 1 : 0)) {
                llllllllllllIlIllIIlIlIIlIIIlIIl.putColorRGB_F4(llllllllllllIlIllIIlIlIIlIIIlllI * llllllllllllIlIllIIlIlIIlIIIIllI, llllllllllllIlIllIIlIlIIlIIIllIl * llllllllllllIlIllIIlIlIIlIIIIllI, llllllllllllIlIllIIlIlIIlIIIIIll * llllllllllllIlIllIIlIlIIlIIIIllI);
                "".length();
                if ((0x66 ^ 0x15 ^ (0x1E ^ 0x69)) <= "   ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlIllIIlIlIIlIIIlIIl.putColorRGB_F4(llllllllllllIlIllIIlIlIIlIIIIllI, llllllllllllIlIllIIlIlIIlIIIIllI, llllllllllllIlIllIIlIlIIlIIIIllI);
            }
            final Vec3i llllllllllllIlIllIIlIlIIlIIIIlll = llllllllllllIlIllIIlIlIIlIIIlIII.getFace().getDirectionVec();
            llllllllllllIlIllIIlIlIIlIIIlIIl.putNormal((float)llllllllllllIlIllIIlIlIIlIIIIlll.getX(), (float)llllllllllllIlIllIIlIlIIlIIIIlll.getY(), (float)llllllllllllIlIllIIlIlIIlIIIIlll.getZ());
            llllllllllllIlIllIIlIlIIlIIIlIlI.draw();
        }
    }
    
    public void renderModelBrightness(final IBakedModel llllllllllllIlIllIIlIlIIlIlIllIl, final IBlockState llllllllllllIlIllIIlIlIIlIlIllII, final float llllllllllllIlIllIIlIlIIlIlIIIIl, final boolean llllllllllllIlIllIIlIlIIlIlIlIlI) {
        final Block llllllllllllIlIllIIlIlIIlIlIlIIl = llllllllllllIlIllIIlIlIIlIlIllII.getBlock();
        llllllllllllIlIllIIlIlIIlIlIlIIl.setBlockBoundsForItemRender();
        GlStateManager.rotate(90.0f, 0.0f, 1.0f, 0.0f);
        int llllllllllllIlIllIIlIlIIlIlIlIII = llllllllllllIlIllIIlIlIIlIlIlIIl.getRenderColor(llllllllllllIlIllIIlIlIIlIlIlIIl.getStateForEntityRender(llllllllllllIlIllIIlIlIIlIlIllII));
        if (lIlIIlIIlIIlllIl(EntityRenderer.anaglyphEnable ? 1 : 0)) {
            llllllllllllIlIllIIlIlIIlIlIlIII = TextureUtil.anaglyphColor(llllllllllllIlIllIIlIlIIlIlIlIII);
        }
        final float llllllllllllIlIllIIlIlIIlIlIIlll = (llllllllllllIlIllIIlIlIIlIlIlIII >> BlockModelRenderer.lllIllIlIIIIlI[5] & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
        final float llllllllllllIlIllIIlIlIIlIlIIllI = (llllllllllllIlIllIIlIlIIlIlIlIII >> BlockModelRenderer.lllIllIlIIIIlI[9] & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
        final float llllllllllllIlIllIIlIlIIlIlIIlIl = (llllllllllllIlIllIIlIlIIlIlIlIII & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
        if (lIlIIlIIlIIllllI(llllllllllllIlIllIIlIlIIlIlIlIlI ? 1 : 0)) {
            GlStateManager.color(llllllllllllIlIllIIlIlIIlIlIIIIl, llllllllllllIlIllIIlIlIIlIlIIIIl, llllllllllllIlIllIIlIlIIlIlIIIIl, 1.0f);
        }
        this.renderModelBrightnessColor(llllllllllllIlIllIIlIlIIlIlIllIl, llllllllllllIlIllIIlIlIIlIlIIIIl, llllllllllllIlIllIIlIlIIlIlIIlll, llllllllllllIlIllIIlIlIIlIlIIllI, llllllllllllIlIllIIlIlIIlIlIIlIl);
    }
    
    private static boolean lIlIIlIIlIlIIlll(final int llllllllllllIlIllIIlIlIIIIlllllI) {
        return llllllllllllIlIllIIlIlIIIIlllllI >= 0;
    }
    
    private void renderModelStandardQuads(final IBlockAccess llllllllllllIlIllIIlIlIIlllllIll, final Block llllllllllllIlIllIIlIlIIlllIIlII, final BlockPos llllllllllllIlIllIIlIlIIlllllIIl, final EnumFacing llllllllllllIlIllIIlIlIIlllllIII, int llllllllllllIlIllIIlIlIIlllIIIlI, final boolean llllllllllllIlIllIIlIlIIlllIIIIl, final WorldRenderer llllllllllllIlIllIIlIlIIlllIIIII, final List<BakedQuad> llllllllllllIlIllIIlIlIIllllIlII, final BitSet llllllllllllIlIllIIlIlIIllllIIll) {
        double llllllllllllIlIllIIlIlIIllllIIlI = llllllllllllIlIllIIlIlIIlllllIIl.getX();
        double llllllllllllIlIllIIlIlIIllllIIIl = llllllllllllIlIllIIlIlIIlllllIIl.getY();
        double llllllllllllIlIllIIlIlIIllllIIII = llllllllllllIlIllIIlIlIIlllllIIl.getZ();
        final Block.EnumOffsetType llllllllllllIlIllIIlIlIIlllIllll = llllllllllllIlIllIIlIlIIlllIIlII.getOffsetType();
        if (lIlIIlIIlIlIIIIl(llllllllllllIlIllIIlIlIIlllIllll, Block.EnumOffsetType.NONE)) {
            final int llllllllllllIlIllIIlIlIIlllIlllI = llllllllllllIlIllIIlIlIIlllllIIl.getX();
            final int llllllllllllIlIllIIlIlIIlllIllIl = llllllllllllIlIllIIlIlIIlllllIIl.getZ();
            long llllllllllllIlIllIIlIlIIlllIllII = (long)(llllllllllllIlIllIIlIlIIlllIlllI * BlockModelRenderer.lllIllIlIIIIlI[12]) ^ llllllllllllIlIllIIlIlIIlllIllIl * 116129781L;
            llllllllllllIlIllIIlIlIIlllIllII = llllllllllllIlIllIIlIlIIlllIllII * llllllllllllIlIllIIlIlIIlllIllII * 42317861L + llllllllllllIlIllIIlIlIIlllIllII * 11L;
            llllllllllllIlIllIIlIlIIllllIIlI += ((llllllllllllIlIllIIlIlIIlllIllII >> BlockModelRenderer.lllIllIlIIIIlI[5] & 0xFL) / 15.0f - 0.5) * 0.5;
            llllllllllllIlIllIIlIlIIllllIIII += ((llllllllllllIlIllIIlIlIIlllIllII >> BlockModelRenderer.lllIllIlIIIIlI[6] & 0xFL) / 15.0f - 0.5) * 0.5;
            if (lIlIIlIIlIlIIIlI(llllllllllllIlIllIIlIlIIlllIllll, Block.EnumOffsetType.XYZ)) {
                llllllllllllIlIllIIlIlIIllllIIIl += ((llllllllllllIlIllIIlIlIIlllIllII >> BlockModelRenderer.lllIllIlIIIIlI[7] & 0xFL) / 15.0f - 1.0) * 0.2;
            }
        }
        final Iterator<BakedQuad> iterator = llllllllllllIlIllIIlIlIIllllIlII.iterator();
        "".length();
        if (-(30 + 58 - 11 + 74 ^ 102 + 146 - 171 + 70) >= 0) {
            return;
        }
        while (!lIlIIlIIlIIllllI(iterator.hasNext() ? 1 : 0)) {
            final BakedQuad llllllllllllIlIllIIlIlIIlllIlIll = iterator.next();
            if (lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIIlllIIIIl ? 1 : 0)) {
                this.fillQuadBounds(llllllllllllIlIllIIlIlIIlllIIlII, llllllllllllIlIllIIlIlIIlllIlIll.getVertexData(), llllllllllllIlIllIIlIlIIlllIlIll.getFace(), null, llllllllllllIlIllIIlIlIIllllIIll);
                Serializable s;
                if (lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIIllllIIll.get(BlockModelRenderer.lllIllIlIIIIlI[1]) ? 1 : 0)) {
                    s = llllllllllllIlIllIIlIlIIlllIIlII.getMixedBrightnessForBlock(llllllllllllIlIllIIlIlIIlllllIll, llllllllllllIlIllIIlIlIIlllllIIl.offset(llllllllllllIlIllIIlIlIIlllIlIll.getFace()));
                    "".length();
                    if (-" ".length() == (0x76 ^ 0x3E ^ (0x4 ^ 0x48))) {
                        return;
                    }
                }
                else {
                    s = llllllllllllIlIllIIlIlIIlllIIlII.getMixedBrightnessForBlock(llllllllllllIlIllIIlIlIIlllllIll, llllllllllllIlIllIIlIlIIlllllIIl);
                }
                llllllllllllIlIllIIlIlIIlllIIIlI = s;
            }
            llllllllllllIlIllIIlIlIIlllIIIII.addVertexData(llllllllllllIlIllIIlIlIIlllIlIll.getVertexData());
            llllllllllllIlIllIIlIlIIlllIIIII.putBrightness4((int)llllllllllllIlIllIIlIlIIlllIIIlI, (int)llllllllllllIlIllIIlIlIIlllIIIlI, (int)llllllllllllIlIllIIlIlIIlllIIIlI, (int)llllllllllllIlIllIIlIlIIlllIIIlI);
            if (lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIIlllIlIll.hasTintIndex() ? 1 : 0)) {
                int llllllllllllIlIllIIlIlIIlllIlIlI = llllllllllllIlIllIIlIlIIlllIIlII.colorMultiplier(llllllllllllIlIllIIlIlIIlllllIll, llllllllllllIlIllIIlIlIIlllllIIl, llllllllllllIlIllIIlIlIIlllIlIll.getTintIndex());
                if (lIlIIlIIlIIlllIl(EntityRenderer.anaglyphEnable ? 1 : 0)) {
                    llllllllllllIlIllIIlIlIIlllIlIlI = TextureUtil.anaglyphColor(llllllllllllIlIllIIlIlIIlllIlIlI);
                }
                final float llllllllllllIlIllIIlIlIIlllIlIIl = (llllllllllllIlIllIIlIlIIlllIlIlI >> BlockModelRenderer.lllIllIlIIIIlI[5] & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
                final float llllllllllllIlIllIIlIlIIlllIlIII = (llllllllllllIlIllIIlIlIIlllIlIlI >> BlockModelRenderer.lllIllIlIIIIlI[9] & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
                final float llllllllllllIlIllIIlIlIIlllIIlll = (llllllllllllIlIllIIlIlIIlllIlIlI & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
                llllllllllllIlIllIIlIlIIlllIIIII.putColorMultiplier(llllllllllllIlIllIIlIlIIlllIlIIl, llllllllllllIlIllIIlIlIIlllIlIII, llllllllllllIlIllIIlIlIIlllIIlll, BlockModelRenderer.lllIllIlIIIIlI[10]);
                llllllllllllIlIllIIlIlIIlllIIIII.putColorMultiplier(llllllllllllIlIllIIlIlIIlllIlIIl, llllllllllllIlIllIIlIlIIlllIlIII, llllllllllllIlIllIIlIlIIlllIIlll, BlockModelRenderer.lllIllIlIIIIlI[3]);
                llllllllllllIlIllIIlIlIIlllIIIII.putColorMultiplier(llllllllllllIlIllIIlIlIIlllIlIIl, llllllllllllIlIllIIlIlIIlllIlIII, llllllllllllIlIllIIlIlIIlllIIlll, BlockModelRenderer.lllIllIlIIIIlI[2]);
                llllllllllllIlIllIIlIlIIlllIIIII.putColorMultiplier(llllllllllllIlIllIIlIlIIlllIlIIl, llllllllllllIlIllIIlIlIIlllIlIII, llllllllllllIlIllIIlIlIIlllIIlll, BlockModelRenderer.lllIllIlIIIIlI[0]);
            }
            llllllllllllIlIllIIlIlIIlllIIIII.putPosition(llllllllllllIlIllIIlIlIIllllIIlI, llllllllllllIlIllIIlIlIIllllIIIl, llllllllllllIlIllIIlIlIIllllIIII);
        }
    }
    
    public boolean renderModel(final IBlockAccess llllllllllllIlIllIIlIlIllllIllIl, final IBakedModel llllllllllllIlIllIIlIlIllllIllII, final IBlockState llllllllllllIlIllIIlIlIlllIlllll, final BlockPos llllllllllllIlIllIIlIlIllllIlIlI, final WorldRenderer llllllllllllIlIllIIlIlIllllIlIIl, final boolean llllllllllllIlIllIIlIlIlllIlllII) {
        int n;
        if (lIlIIlIIlIIlllIl(Minecraft.isAmbientOcclusionEnabled() ? 1 : 0) && lIlIIlIIlIIllllI(llllllllllllIlIllIIlIlIlllIlllll.getBlock().getLightValue()) && lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIllllIllII.isAmbientOcclusion() ? 1 : 0)) {
            n = BlockModelRenderer.lllIllIlIIIIlI[0];
            "".length();
            if ((0x29 ^ 0x71 ^ (0x4F ^ 0x13)) != (0x7C ^ 0x5F ^ (0x91 ^ 0xB6))) {
                return ((175 + 152 - 239 + 105 ^ 159 + 173 - 293 + 160) & (" ".length() ^ (0x67 ^ 0x60) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockModelRenderer.lllIllIlIIIIlI[1];
        }
        final boolean llllllllllllIlIllIIlIlIllllIIlll = n != 0;
        try {
            final Block llllllllllllIlIllIIlIlIllllIIllI = llllllllllllIlIllIIlIlIlllIlllll.getBlock();
            boolean b;
            if (lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIllllIIlll ? 1 : 0)) {
                b = this.renderModelAmbientOcclusion(llllllllllllIlIllIIlIlIllllIllIl, llllllllllllIlIllIIlIlIllllIllII, llllllllllllIlIllIIlIlIllllIIllI, llllllllllllIlIllIIlIlIllllIlIlI, llllllllllllIlIllIIlIlIllllIlIIl, llllllllllllIlIllIIlIlIlllIlllII);
                "".length();
                if ("  ".length() == 0) {
                    return ((0xD9 ^ 0x93) & ~(0x6D ^ 0x27)) != 0x0;
                }
            }
            else {
                b = this.renderModelStandard(llllllllllllIlIllIIlIlIllllIllIl, llllllllllllIlIllIIlIlIllllIllII, llllllllllllIlIllIIlIlIllllIIllI, llllllllllllIlIllIIlIlIllllIlIlI, llllllllllllIlIllIIlIlIllllIlIIl, llllllllllllIlIllIIlIlIlllIlllII);
            }
            return b;
        }
        catch (Throwable llllllllllllIlIllIIlIlIllllIIlIl) {
            final CrashReport llllllllllllIlIllIIlIlIllllIIlII = CrashReport.makeCrashReport(llllllllllllIlIllIIlIlIllllIIlIl, BlockModelRenderer.lllIllIlIIIIIl[BlockModelRenderer.lllIllIlIIIIlI[1]]);
            final CrashReportCategory llllllllllllIlIllIIlIlIllllIIIll = llllllllllllIlIllIIlIlIllllIIlII.makeCategory(BlockModelRenderer.lllIllIlIIIIIl[BlockModelRenderer.lllIllIlIIIIlI[0]]);
            CrashReportCategory.addBlockInfo(llllllllllllIlIllIIlIlIllllIIIll, llllllllllllIlIllIIlIlIllllIlIlI, llllllllllllIlIllIIlIlIlllIlllll);
            llllllllllllIlIllIIlIlIllllIIIll.addCrashSection(BlockModelRenderer.lllIllIlIIIIIl[BlockModelRenderer.lllIllIlIIIIlI[2]], llllllllllllIlIllIIlIlIllllIIlll);
            throw new ReportedException(llllllllllllIlIllIIlIlIllllIIlII);
        }
    }
    
    private static boolean lIlIIlIIlIlIIIIl(final Object llllllllllllIlIllIIlIlIIIlIIlIll, final Object llllllllllllIlIllIIlIlIIIlIIlIlI) {
        return llllllllllllIlIllIIlIlIIIlIIlIll != llllllllllllIlIllIIlIlIIIlIIlIlI;
    }
    
    private static boolean lIlIIlIIlIlIIIlI(final Object llllllllllllIlIllIIlIlIIIlIIIlll, final Object llllllllllllIlIllIIlIlIIIlIIIllI) {
        return llllllllllllIlIllIIlIlIIIlIIIlll == llllllllllllIlIllIIlIlIIIlIIIllI;
    }
    
    private static boolean lIlIIlIIlIIlllIl(final int llllllllllllIlIllIIlIlIIIlIIIIlI) {
        return llllllllllllIlIllIIlIlIIIlIIIIlI != 0;
    }
    
    public void renderModelBrightnessColor(final IBakedModel llllllllllllIlIllIIlIlIIllIIlIII, final float llllllllllllIlIllIIlIlIIllIIIIII, final float llllllllllllIlIllIIlIlIIllIIIllI, final float llllllllllllIlIllIIlIlIIllIIIlIl, final float llllllllllllIlIllIIlIlIIlIllllIl) {
        final int llllllllllllIlIllIIlIlIIlIlllIIl;
        final float llllllllllllIlIllIIlIlIIlIlllIlI = ((EnumFacing[])(Object)(llllllllllllIlIllIIlIlIIlIlllIIl = (int)(Object)EnumFacing.values())).length;
        String llllllllllllIlIllIIlIlIIlIlllIll = (String)BlockModelRenderer.lllIllIlIIIIlI[1];
        "".length();
        if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIlIIlIIlIIlllll((int)llllllllllllIlIllIIlIlIIlIlllIll, (int)llllllllllllIlIllIIlIlIIlIlllIlI)) {
            final EnumFacing llllllllllllIlIllIIlIlIIllIIIIll = llllllllllllIlIllIIlIlIIlIlllIIl[llllllllllllIlIllIIlIlIIlIlllIll];
            this.renderModelBrightnessColorQuads(llllllllllllIlIllIIlIlIIllIIIIII, llllllllllllIlIllIIlIlIIllIIIllI, llllllllllllIlIllIIlIlIIllIIIlIl, llllllllllllIlIllIIlIlIIlIllllIl, llllllllllllIlIllIIlIlIIllIIlIII.getFaceQuads(llllllllllllIlIllIIlIlIIllIIIIll));
            ++llllllllllllIlIllIIlIlIIlIlllIll;
        }
        this.renderModelBrightnessColorQuads(llllllllllllIlIllIIlIlIIllIIIIII, llllllllllllIlIllIIlIlIIllIIIllI, llllllllllllIlIllIIlIlIIllIIIlIl, llllllllllllIlIllIIlIlIIlIllllIl, llllllllllllIlIllIIlIlIIllIIlIII.getGeneralQuads());
    }
    
    private void renderModelAmbientOcclusionQuads(final IBlockAccess llllllllllllIlIllIIlIlIlIllIIlII, final Block llllllllllllIlIllIIlIlIlIlIlIIII, final BlockPos llllllllllllIlIllIIlIlIlIllIIIlI, final WorldRenderer llllllllllllIlIllIIlIlIlIllIIIIl, final List<BakedQuad> llllllllllllIlIllIIlIlIlIllIIIII, final float[] llllllllllllIlIllIIlIlIlIlIIllII, final BitSet llllllllllllIlIllIIlIlIlIlIIlIll, final AmbientOcclusionFace llllllllllllIlIllIIlIlIlIlIlllIl) {
        double llllllllllllIlIllIIlIlIlIlIlllII = llllllllllllIlIllIIlIlIlIllIIIlI.getX();
        double llllllllllllIlIllIIlIlIlIlIllIll = llllllllllllIlIllIIlIlIlIllIIIlI.getY();
        double llllllllllllIlIllIIlIlIlIlIllIlI = llllllllllllIlIllIIlIlIlIllIIIlI.getZ();
        final Block.EnumOffsetType llllllllllllIlIllIIlIlIlIlIllIIl = llllllllllllIlIllIIlIlIlIlIlIIII.getOffsetType();
        if (lIlIIlIIlIlIIIIl(llllllllllllIlIllIIlIlIlIlIllIIl, Block.EnumOffsetType.NONE)) {
            final long llllllllllllIlIllIIlIlIlIlIllIII = MathHelper.getPositionRandom(llllllllllllIlIllIIlIlIlIllIIIlI);
            llllllllllllIlIllIIlIlIlIlIlllII += ((llllllllllllIlIllIIlIlIlIlIllIII >> BlockModelRenderer.lllIllIlIIIIlI[5] & 0xFL) / 15.0f - 0.5) * 0.5;
            llllllllllllIlIllIIlIlIlIlIllIlI += ((llllllllllllIlIllIIlIlIlIlIllIII >> BlockModelRenderer.lllIllIlIIIIlI[6] & 0xFL) / 15.0f - 0.5) * 0.5;
            if (lIlIIlIIlIlIIIlI(llllllllllllIlIllIIlIlIlIlIllIIl, Block.EnumOffsetType.XYZ)) {
                llllllllllllIlIllIIlIlIlIlIllIll += ((llllllllllllIlIllIIlIlIlIlIllIII >> BlockModelRenderer.lllIllIlIIIIlI[7] & 0xFL) / 15.0f - 1.0) * 0.2;
            }
        }
        final Exception llllllllllllIlIllIIlIlIlIlIIIlII = (Exception)llllllllllllIlIllIIlIlIlIllIIIII.iterator();
        "".length();
        if ((25 + 23 + 95 + 5 ^ 5 + 125 - 99 + 113) < 0) {
            return;
        }
        while (!lIlIIlIIlIIllllI(((Iterator)llllllllllllIlIllIIlIlIlIlIIIlII).hasNext() ? 1 : 0)) {
            final BakedQuad llllllllllllIlIllIIlIlIlIlIlIlll = ((Iterator<BakedQuad>)llllllllllllIlIllIIlIlIlIlIIIlII).next();
            this.fillQuadBounds(llllllllllllIlIllIIlIlIlIlIlIIII, llllllllllllIlIllIIlIlIlIlIlIlll.getVertexData(), llllllllllllIlIllIIlIlIlIlIlIlll.getFace(), llllllllllllIlIllIIlIlIlIlIIllII, llllllllllllIlIllIIlIlIlIlIIlIll);
            llllllllllllIlIllIIlIlIlIlIlllIl.updateVertexBrightness(llllllllllllIlIllIIlIlIlIllIIlII, llllllllllllIlIllIIlIlIlIlIlIIII, llllllllllllIlIllIIlIlIlIllIIIlI, llllllllllllIlIllIIlIlIlIlIlIlll.getFace(), llllllllllllIlIllIIlIlIlIlIIllII, llllllllllllIlIllIIlIlIlIlIIlIll);
            llllllllllllIlIllIIlIlIlIllIIIIl.addVertexData(llllllllllllIlIllIIlIlIlIlIlIlll.getVertexData());
            llllllllllllIlIllIIlIlIlIllIIIIl.putBrightness4(llllllllllllIlIllIIlIlIlIlIlllIl.vertexBrightness[BlockModelRenderer.lllIllIlIIIIlI[1]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexBrightness[BlockModelRenderer.lllIllIlIIIIlI[0]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexBrightness[BlockModelRenderer.lllIllIlIIIIlI[2]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexBrightness[BlockModelRenderer.lllIllIlIIIIlI[3]]);
            if (lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlIlIlIlll.hasTintIndex() ? 1 : 0)) {
                int llllllllllllIlIllIIlIlIlIlIlIllI = llllllllllllIlIllIIlIlIlIlIlIIII.colorMultiplier(llllllllllllIlIllIIlIlIlIllIIlII, llllllllllllIlIllIIlIlIlIllIIIlI, llllllllllllIlIllIIlIlIlIlIlIlll.getTintIndex());
                if (lIlIIlIIlIIlllIl(EntityRenderer.anaglyphEnable ? 1 : 0)) {
                    llllllllllllIlIllIIlIlIlIlIlIllI = TextureUtil.anaglyphColor(llllllllllllIlIllIIlIlIlIlIlIllI);
                }
                final float llllllllllllIlIllIIlIlIlIlIlIlIl = (llllllllllllIlIllIIlIlIlIlIlIllI >> BlockModelRenderer.lllIllIlIIIIlI[5] & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
                final float llllllllllllIlIllIIlIlIlIlIlIlII = (llllllllllllIlIllIIlIlIlIlIlIllI >> BlockModelRenderer.lllIllIlIIIIlI[9] & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
                final float llllllllllllIlIllIIlIlIlIlIlIIll = (llllllllllllIlIllIIlIlIlIlIlIllI & BlockModelRenderer.lllIllIlIIIIlI[8]) / 255.0f;
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[1]] * llllllllllllIlIllIIlIlIlIlIlIlIl, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[1]] * llllllllllllIlIllIIlIlIlIlIlIlII, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[1]] * llllllllllllIlIllIIlIlIlIlIlIIll, BlockModelRenderer.lllIllIlIIIIlI[10]);
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[0]] * llllllllllllIlIllIIlIlIlIlIlIlIl, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[0]] * llllllllllllIlIllIIlIlIlIlIlIlII, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[0]] * llllllllllllIlIllIIlIlIlIlIlIIll, BlockModelRenderer.lllIllIlIIIIlI[3]);
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[2]] * llllllllllllIlIllIIlIlIlIlIlIlIl, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[2]] * llllllllllllIlIllIIlIlIlIlIlIlII, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[2]] * llllllllllllIlIllIIlIlIlIlIlIIll, BlockModelRenderer.lllIllIlIIIIlI[2]);
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[3]] * llllllllllllIlIllIIlIlIlIlIlIlIl, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[3]] * llllllllllllIlIllIIlIlIlIlIlIlII, llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[3]] * llllllllllllIlIllIIlIlIlIlIlIIll, BlockModelRenderer.lllIllIlIIIIlI[0]);
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[1]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[1]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[1]], BlockModelRenderer.lllIllIlIIIIlI[10]);
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[0]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[0]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[0]], BlockModelRenderer.lllIllIlIIIIlI[3]);
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[2]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[2]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[2]], BlockModelRenderer.lllIllIlIIIIlI[2]);
                llllllllllllIlIllIIlIlIlIllIIIIl.putColorMultiplier(llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[3]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[3]], llllllllllllIlIllIIlIlIlIlIlllIl.vertexColorMultiplier[BlockModelRenderer.lllIllIlIIIIlI[3]], BlockModelRenderer.lllIllIlIIIIlI[0]);
            }
            llllllllllllIlIllIIlIlIlIllIIIIl.putPosition(llllllllllllIlIllIIlIlIlIlIlllII, llllllllllllIlIllIIlIlIlIlIllIll, llllllllllllIlIllIIlIlIlIlIllIlI);
        }
    }
    
    private static boolean lIlIIlIIlIIllllI(final int llllllllllllIlIllIIlIlIIIlIIIIII) {
        return llllllllllllIlIllIIlIlIIIlIIIIII == 0;
    }
    
    private static String lIlIIlIIlIIllIIl(final String llllllllllllIlIllIIlIlIIIlllIIIl, final String llllllllllllIlIllIIlIlIIIlllIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIlIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIlIIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIlIIIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIlIIIlllIlIl.init(BlockModelRenderer.lllIllIlIIIIlI[2], llllllllllllIlIllIIlIlIIIlllIllI);
            return new String(llllllllllllIlIllIIlIlIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIlIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIlIIIlllIlII) {
            llllllllllllIlIllIIlIlIIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    private static int lIlIIlIIlIlIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIIlIIlIlIlIII(final int llllllllllllIlIllIIlIlIIIIlllIlI) {
        return llllllllllllIlIllIIlIlIIIIlllIlI <= 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockModelRenderer.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIlIIlIlIIlIl($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final char llllllllllllIlIllIIlIlIIIllllIll = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlIllIIlIlIIIllllIll[EnumFacing.DOWN.ordinal()] = BlockModelRenderer.lllIllIlIIIIlI[0];
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIlIIIllllIll[EnumFacing.EAST.ordinal()] = BlockModelRenderer.lllIllIlIIIIlI[13];
            "".length();
            if ((75 + 71 + 7 + 5 ^ 138 + 128 - 222 + 110) > (90 + 88 - 59 + 40 ^ 98 + 110 - 63 + 10)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIlIIIllllIll[EnumFacing.NORTH.ordinal()] = BlockModelRenderer.lllIllIlIIIIlI[3];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIlIIIllllIll[EnumFacing.SOUTH.ordinal()] = BlockModelRenderer.lllIllIlIIIIlI[10];
            "".length();
            if (" ".length() >= (0xA ^ 0xE)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIlIIIllllIll[EnumFacing.UP.ordinal()] = BlockModelRenderer.lllIllIlIIIIlI[2];
            "".length();
            if (((24 + 10 + 117 + 8 ^ 24 + 49 - 72 + 178) & (16 + 126 - 26 + 38 ^ 147 + 4 - 69 + 100 ^ -" ".length())) >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIlIIIllllIll[EnumFacing.WEST.ordinal()] = BlockModelRenderer.lllIllIlIIIIlI[14];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockModelRenderer.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIllIIlIlIIIllllIll;
    }
    
    private static void lIlIIlIIlIIlllII() {
        (lllIllIlIIIIlI = new int[15])[0] = " ".length();
        BlockModelRenderer.lllIllIlIIIIlI[1] = ((74 + 37 - 96 + 182 ^ 178 + 22 - 73 + 67) & (62 + 132 - 93 + 41 ^ 127 + 58 - 57 + 9 ^ -" ".length()));
        BlockModelRenderer.lllIllIlIIIIlI[2] = "  ".length();
        BlockModelRenderer.lllIllIlIIIIlI[3] = "   ".length();
        BlockModelRenderer.lllIllIlIIIIlI[4] = -" ".length();
        BlockModelRenderer.lllIllIlIIIIlI[5] = (0xB6 ^ 0xA6);
        BlockModelRenderer.lllIllIlIIIIlI[6] = (97 + 59 - 104 + 107 ^ 115 + 90 - 123 + 53);
        BlockModelRenderer.lllIllIlIIIIlI[7] = (0xB6 ^ 0xB2 ^ (0xAF ^ 0xBF));
        BlockModelRenderer.lllIllIlIIIIlI[8] = (0x9C ^ 0xBC) + (84 + 118 - 180 + 171) - (0x9A ^ 0x8F) + (0x2C ^ 0x1F);
        BlockModelRenderer.lllIllIlIIIIlI[9] = (0x63 ^ 0x6B);
        BlockModelRenderer.lllIllIlIIIIlI[10] = (35 + 172 - 147 + 127 ^ 85 + 106 - 20 + 20);
        BlockModelRenderer.lllIllIlIIIIlI[11] = (0xA7 ^ 0xA0);
        BlockModelRenderer.lllIllIlIIIIlI[12] = (-(0xFFFFE7F7 & 0x3D69) & (0xFFFFF76F & 0x2FEFFF));
        BlockModelRenderer.lllIllIlIIIIlI[13] = (0xC1 ^ 0xC7);
        BlockModelRenderer.lllIllIlIIIIlI[14] = (0x77 ^ 0x38 ^ (0x1 ^ 0x4B));
    }
    
    private static String lIlIIlIIlIIllIlI(String llllllllllllIlIllIIlIlIIIlIllllI, final String llllllllllllIlIllIIlIlIIIllIIIlI) {
        llllllllllllIlIllIIlIlIIIlIllllI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIlIlIIIlIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIlIIIllIIIIl = new StringBuilder();
        final char[] llllllllllllIlIllIIlIlIIIllIIIII = llllllllllllIlIllIIlIlIIIllIIIlI.toCharArray();
        int llllllllllllIlIllIIlIlIIIlIlllll = BlockModelRenderer.lllIllIlIIIIlI[1];
        final long llllllllllllIlIllIIlIlIIIlIllIIl = (Object)((String)llllllllllllIlIllIIlIlIIIlIllllI).toCharArray();
        final long llllllllllllIlIllIIlIlIIIlIllIII = llllllllllllIlIllIIlIlIIIlIllIIl.length;
        int llllllllllllIlIllIIlIlIIIlIlIlll = BlockModelRenderer.lllIllIlIIIIlI[1];
        while (lIlIIlIIlIlIlIIl(llllllllllllIlIllIIlIlIIIlIlIlll, (int)llllllllllllIlIllIIlIlIIIlIllIII)) {
            final char llllllllllllIlIllIIlIlIIIllIIlII = llllllllllllIlIllIIlIlIIIlIllIIl[llllllllllllIlIllIIlIlIIIlIlIlll];
            llllllllllllIlIllIIlIlIIIllIIIIl.append((char)(llllllllllllIlIllIIlIlIIIllIIlII ^ llllllllllllIlIllIIlIlIIIllIIIII[llllllllllllIlIllIIlIlIIIlIlllll % llllllllllllIlIllIIlIlIIIllIIIII.length]));
            "".length();
            ++llllllllllllIlIllIIlIlIIIlIlllll;
            ++llllllllllllIlIllIIlIlIIIlIlIlll;
            "".length();
            if (-" ".length() == (0x8C ^ 0xBF ^ (0x75 ^ 0x42))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIlIIIllIIIIl);
    }
    
    private static boolean lIlIIlIIlIlIIlIl(final Object llllllllllllIlIllIIlIlIIIlIIIlII) {
        return llllllllllllIlIllIIlIlIIIlIIIlII != null;
    }
    
    static {
        lIlIIlIIlIIlllII();
        lIlIIlIIlIIllIll();
    }
    
    private static boolean lIlIIlIIlIlIIllI(final int llllllllllllIlIllIIlIlIIIIllllII) {
        return llllllllllllIlIllIIlIlIIIIllllII < 0;
    }
    
    public boolean renderModel(final IBlockAccess llllllllllllIlIllIIlIlIlllllllll, final IBakedModel llllllllllllIlIllIIlIlIllllllllI, final IBlockState llllllllllllIlIllIIlIllIIIIIIlII, final BlockPos llllllllllllIlIllIIlIllIIIIIIIll, final WorldRenderer llllllllllllIlIllIIlIlIllllllIll) {
        final Block llllllllllllIlIllIIlIllIIIIIIIIl = llllllllllllIlIllIIlIllIIIIIIlII.getBlock();
        llllllllllllIlIllIIlIllIIIIIIIIl.setBlockBoundsBasedOnState(llllllllllllIlIllIIlIlIlllllllll, llllllllllllIlIllIIlIllIIIIIIIll);
        return this.renderModel(llllllllllllIlIllIIlIlIlllllllll, llllllllllllIlIllIIlIlIllllllllI, llllllllllllIlIllIIlIllIIIIIIlII, llllllllllllIlIllIIlIllIIIIIIIll, llllllllllllIlIllIIlIlIllllllIll, (boolean)(BlockModelRenderer.lllIllIlIIIIlI[0] != 0));
    }
    
    public boolean renderModelStandard(final IBlockAccess llllllllllllIlIllIIlIlIllIIlIlIl, final IBakedModel llllllllllllIlIllIIlIlIllIIIIllI, final Block llllllllllllIlIllIIlIlIllIIlIIll, final BlockPos llllllllllllIlIllIIlIlIllIIlIIlI, final WorldRenderer llllllllllllIlIllIIlIlIllIIIIIll, final boolean llllllllllllIlIllIIlIlIllIIIIIlI) {
        boolean llllllllllllIlIllIIlIlIllIIIllll = BlockModelRenderer.lllIllIlIIIIlI[1] != 0;
        final BitSet llllllllllllIlIllIIlIlIllIIIlllI = new BitSet(BlockModelRenderer.lllIllIlIIIIlI[3]);
        final String llllllllllllIlIllIIlIlIlIlllllII;
        final String llllllllllllIlIllIIlIlIlIlllllIl = (String)((EnumFacing[])(Object)(llllllllllllIlIllIIlIlIlIlllllII = (String)(Object)EnumFacing.values())).length;
        long llllllllllllIlIllIIlIlIlIllllllI = BlockModelRenderer.lllIllIlIIIIlI[1];
        "".length();
        if ("   ".length() < "   ".length()) {
            return ((0x69 ^ 0x7B ^ (0xD2 ^ 0x86)) & (0x99 ^ 0x91 ^ (0x37 ^ 0x79) ^ -" ".length())) != 0x0;
        }
        while (!lIlIIlIIlIIlllll((int)llllllllllllIlIllIIlIlIlIllllllI, (int)llllllllllllIlIllIIlIlIlIlllllIl)) {
            final EnumFacing llllllllllllIlIllIIlIlIllIIIllIl = llllllllllllIlIllIIlIlIlIlllllII[llllllllllllIlIllIIlIlIlIllllllI];
            final List<BakedQuad> llllllllllllIlIllIIlIlIllIIIllII = llllllllllllIlIllIIlIlIllIIIIllI.getFaceQuads(llllllllllllIlIllIIlIlIllIIIllIl);
            if (lIlIIlIIlIIllllI(llllllllllllIlIllIIlIlIllIIIllII.isEmpty() ? 1 : 0)) {
                final BlockPos llllllllllllIlIllIIlIlIllIIIlIll = llllllllllllIlIllIIlIlIllIIlIIlI.offset(llllllllllllIlIllIIlIlIllIIIllIl);
                if (!lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIllIIIIIlI ? 1 : 0) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIllIIlIIll.shouldSideBeRendered(llllllllllllIlIllIIlIlIllIIlIlIl, llllllllllllIlIllIIlIlIllIIIlIll, llllllllllllIlIllIIlIlIllIIIllIl) ? 1 : 0)) {
                    final int llllllllllllIlIllIIlIlIllIIIlIlI = llllllllllllIlIllIIlIlIllIIlIIll.getMixedBrightnessForBlock(llllllllllllIlIllIIlIlIllIIlIlIl, llllllllllllIlIllIIlIlIllIIIlIll);
                    this.renderModelStandardQuads(llllllllllllIlIllIIlIlIllIIlIlIl, llllllllllllIlIllIIlIlIllIIlIIll, llllllllllllIlIllIIlIlIllIIlIIlI, llllllllllllIlIllIIlIlIllIIIllIl, llllllllllllIlIllIIlIlIllIIIlIlI, (boolean)(BlockModelRenderer.lllIllIlIIIIlI[1] != 0), llllllllllllIlIllIIlIlIllIIIIIll, llllllllllllIlIllIIlIlIllIIIllII, llllllllllllIlIllIIlIlIllIIIlllI);
                    llllllllllllIlIllIIlIlIllIIIllll = (BlockModelRenderer.lllIllIlIIIIlI[0] != 0);
                }
            }
            ++llllllllllllIlIllIIlIlIlIllllllI;
        }
        final List<BakedQuad> llllllllllllIlIllIIlIlIllIIIlIIl = llllllllllllIlIllIIlIlIllIIIIllI.getGeneralQuads();
        if (lIlIIlIIlIlIIIII(llllllllllllIlIllIIlIlIllIIIlIIl.size())) {
            this.renderModelStandardQuads(llllllllllllIlIllIIlIlIllIIlIlIl, llllllllllllIlIllIIlIlIllIIlIIll, llllllllllllIlIllIIlIlIllIIlIIlI, null, BlockModelRenderer.lllIllIlIIIIlI[4], (boolean)(BlockModelRenderer.lllIllIlIIIIlI[0] != 0), llllllllllllIlIllIIlIlIllIIIIIll, llllllllllllIlIllIIlIlIllIIIlIIl, llllllllllllIlIllIIlIlIllIIIlllI);
            llllllllllllIlIllIIlIlIllIIIllll = (BlockModelRenderer.lllIllIlIIIIlI[0] != 0);
        }
        return llllllllllllIlIllIIlIlIllIIIllll;
    }
    
    private static boolean lIlIIlIIlIlIlIIl(final int llllllllllllIlIllIIlIlIIIlIIllll, final int llllllllllllIlIllIIlIlIIIlIIlllI) {
        return llllllllllllIlIllIIlIlIIIlIIllll < llllllllllllIlIllIIlIlIIIlIIlllI;
    }
    
    public boolean renderModelAmbientOcclusion(final IBlockAccess llllllllllllIlIllIIlIlIlllIIIlIl, final IBakedModel llllllllllllIlIllIIlIlIllIllIlIl, final Block llllllllllllIlIllIIlIlIllIllIlII, final BlockPos llllllllllllIlIllIIlIlIllIllIIll, final WorldRenderer llllllllllllIlIllIIlIlIllIllIIlI, final boolean llllllllllllIlIllIIlIlIlllIIIIII) {
        boolean llllllllllllIlIllIIlIlIllIllllll = BlockModelRenderer.lllIllIlIIIIlI[1] != 0;
        final float[] llllllllllllIlIllIIlIlIllIlllllI = new float[EnumFacing.values().length * BlockModelRenderer.lllIllIlIIIIlI[2]];
        final BitSet llllllllllllIlIllIIlIlIllIllllIl = new BitSet(BlockModelRenderer.lllIllIlIIIIlI[3]);
        final AmbientOcclusionFace llllllllllllIlIllIIlIlIllIllllII = new AmbientOcclusionFace();
        final byte llllllllllllIlIllIIlIlIllIlIlIIl;
        final float llllllllllllIlIllIIlIlIllIlIlIlI = ((EnumFacing[])(Object)(llllllllllllIlIllIIlIlIllIlIlIIl = (byte)(Object)EnumFacing.values())).length;
        float llllllllllllIlIllIIlIlIllIlIlIll = BlockModelRenderer.lllIllIlIIIIlI[1];
        "".length();
        if (" ".length() < -" ".length()) {
            return ((0x96 ^ 0xB3) & ~(0x1D ^ 0x38)) != 0x0;
        }
        while (!lIlIIlIIlIIlllll((int)llllllllllllIlIllIIlIlIllIlIlIll, (int)llllllllllllIlIllIIlIlIllIlIlIlI)) {
            final EnumFacing llllllllllllIlIllIIlIlIllIlllIll = llllllllllllIlIllIIlIlIllIlIlIIl[llllllllllllIlIllIIlIlIllIlIlIll];
            final List<BakedQuad> llllllllllllIlIllIIlIlIllIlllIlI = llllllllllllIlIllIIlIlIllIllIlIl.getFaceQuads(llllllllllllIlIllIIlIlIllIlllIll);
            if (lIlIIlIIlIIllllI(llllllllllllIlIllIIlIlIllIlllIlI.isEmpty() ? 1 : 0)) {
                final BlockPos llllllllllllIlIllIIlIlIllIlllIIl = llllllllllllIlIllIIlIlIllIllIIll.offset(llllllllllllIlIllIIlIlIllIlllIll);
                if (!lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIlllIIIIII ? 1 : 0) || lIlIIlIIlIIlllIl(llllllllllllIlIllIIlIlIllIllIlII.shouldSideBeRendered(llllllllllllIlIllIIlIlIlllIIIlIl, llllllllllllIlIllIIlIlIllIlllIIl, llllllllllllIlIllIIlIlIllIlllIll) ? 1 : 0)) {
                    this.renderModelAmbientOcclusionQuads(llllllllllllIlIllIIlIlIlllIIIlIl, llllllllllllIlIllIIlIlIllIllIlII, llllllllllllIlIllIIlIlIllIllIIll, llllllllllllIlIllIIlIlIllIllIIlI, llllllllllllIlIllIIlIlIllIlllIlI, llllllllllllIlIllIIlIlIllIlllllI, llllllllllllIlIllIIlIlIllIllllIl, llllllllllllIlIllIIlIlIllIllllII);
                    llllllllllllIlIllIIlIlIllIllllll = (BlockModelRenderer.lllIllIlIIIIlI[0] != 0);
                }
            }
            ++llllllllllllIlIllIIlIlIllIlIlIll;
        }
        final List<BakedQuad> llllllllllllIlIllIIlIlIllIlllIII = llllllllllllIlIllIIlIlIllIllIlIl.getGeneralQuads();
        if (lIlIIlIIlIlIIIII(llllllllllllIlIllIIlIlIllIlllIII.size())) {
            this.renderModelAmbientOcclusionQuads(llllllllllllIlIllIIlIlIlllIIIlIl, llllllllllllIlIllIIlIlIllIllIlII, llllllllllllIlIllIIlIlIllIllIIll, llllllllllllIlIllIIlIlIllIllIIlI, llllllllllllIlIllIIlIlIllIlllIII, llllllllllllIlIllIIlIlIllIlllllI, llllllllllllIlIllIIlIlIllIllllIl, llllllllllllIlIllIIlIlIllIllllII);
            llllllllllllIlIllIIlIlIllIllllll = (BlockModelRenderer.lllIllIlIIIIlI[0] != 0);
        }
        return llllllllllllIlIllIIlIlIllIllllll;
    }
    
    enum VertexTranslations
    {
        NORTH(VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[2]], VertexTranslations.lllIlIIllIlIII[2], VertexTranslations.lllIlIIllIlIII[3], VertexTranslations.lllIlIIllIlIII[0], VertexTranslations.lllIlIIllIlIII[1], VertexTranslations.lllIlIIllIlIII[2]);
        
        private static final /* synthetic */ String[] lllIlIIllIIlll;
        private static final /* synthetic */ VertexTranslations[] field_178199_k;
        
        EAST(VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[5]], VertexTranslations.lllIlIIllIlIII[5], VertexTranslations.lllIlIIllIlIII[1], VertexTranslations.lllIlIIllIlIII[2], VertexTranslations.lllIlIIllIlIII[3], VertexTranslations.lllIlIIllIlIII[0]);
        
        private final /* synthetic */ int field_178198_j;
        private final /* synthetic */ int field_178191_g;
        
        WEST(VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[4]], VertexTranslations.lllIlIIllIlIII[4], VertexTranslations.lllIlIIllIlIII[3], VertexTranslations.lllIlIIllIlIII[0], VertexTranslations.lllIlIIllIlIII[1], VertexTranslations.lllIlIIllIlIII[2]);
        
        private final /* synthetic */ int field_178200_h;
        private static final /* synthetic */ int[] lllIlIIllIlIII;
        
        SOUTH(VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[3]], VertexTranslations.lllIlIIllIlIII[3], VertexTranslations.lllIlIIllIlIII[0], VertexTranslations.lllIlIIllIlIII[1], VertexTranslations.lllIlIIllIlIII[2], VertexTranslations.lllIlIIllIlIII[3]), 
        DOWN(VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[0]], VertexTranslations.lllIlIIllIlIII[0], VertexTranslations.lllIlIIllIlIII[0], VertexTranslations.lllIlIIllIlIII[1], VertexTranslations.lllIlIIllIlIII[2], VertexTranslations.lllIlIIllIlIII[3]);
        
        private final /* synthetic */ int field_178201_i;
        
        UP(VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[1]], VertexTranslations.lllIlIIllIlIII[1], VertexTranslations.lllIlIIllIlIII[2], VertexTranslations.lllIlIIllIlIII[3], VertexTranslations.lllIlIIllIlIII[0], VertexTranslations.lllIlIIllIlIII[1]);
        
        private static String lIlIIIlIIlIlllIl(final String llllllllllllIlIllIlllIlllIIllIlI, final String llllllllllllIlIllIlllIlllIIlIlll) {
            try {
                final SecretKeySpec llllllllllllIlIllIlllIlllIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIlllIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllIlllIlllIIlllII = Cipher.getInstance("Blowfish");
                llllllllllllIlIllIlllIlllIIlllII.init(VertexTranslations.lllIlIIllIlIII[2], llllllllllllIlIllIlllIlllIIlllIl);
                return new String(llllllllllllIlIllIlllIlllIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlllIlllIIllIll) {
                llllllllllllIlIllIlllIlllIIllIll.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIIIlIIlIlllII(String llllllllllllIlIllIlllIlllIIIIlIl, final String llllllllllllIlIllIlllIlllIIIlIIl) {
            llllllllllllIlIllIlllIlllIIIIlIl = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIlllIlllIIIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllIlllIlllIIIlIII = new StringBuilder();
            final char[] llllllllllllIlIllIlllIlllIIIIlll = llllllllllllIlIllIlllIlllIIIlIIl.toCharArray();
            int llllllllllllIlIllIlllIlllIIIIllI = VertexTranslations.lllIlIIllIlIII[0];
            final int llllllllllllIlIllIlllIlllIIIIIII = (Object)((String)llllllllllllIlIllIlllIlllIIIIlIl).toCharArray();
            final long llllllllllllIlIllIlllIllIlllllll = llllllllllllIlIllIlllIlllIIIIIII.length;
            short llllllllllllIlIllIlllIllIllllllI = (short)VertexTranslations.lllIlIIllIlIII[0];
            while (lIlIIIlIIllIIIIl(llllllllllllIlIllIlllIllIllllllI, (int)llllllllllllIlIllIlllIllIlllllll)) {
                final char llllllllllllIlIllIlllIlllIIIlIll = llllllllllllIlIllIlllIlllIIIIIII[llllllllllllIlIllIlllIllIllllllI];
                llllllllllllIlIllIlllIlllIIIlIII.append((char)(llllllllllllIlIllIlllIlllIIIlIll ^ llllllllllllIlIllIlllIlllIIIIlll[llllllllllllIlIllIlllIlllIIIIllI % llllllllllllIlIllIlllIlllIIIIlll.length]));
                "".length();
                ++llllllllllllIlIllIlllIlllIIIIllI;
                ++llllllllllllIlIllIlllIllIllllllI;
                "".length();
                if ((0x9A ^ 0x9E) < -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllIlllIlllIIIlIII);
        }
        
        private static String lIlIIIlIIlIllllI(final String llllllllllllIlIllIlllIllIlllIIll, final String llllllllllllIlIllIlllIllIlllIlII) {
            try {
                final SecretKeySpec llllllllllllIlIllIlllIllIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIllIlllIlII.getBytes(StandardCharsets.UTF_8)), VertexTranslations.lllIlIIllIlIII[7]), "DES");
                final Cipher llllllllllllIlIllIlllIllIlllIlll = Cipher.getInstance("DES");
                llllllllllllIlIllIlllIllIlllIlll.init(VertexTranslations.lllIlIIllIlIII[2], llllllllllllIlIllIlllIllIllllIII);
                return new String(llllllllllllIlIllIlllIllIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIllIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlllIllIlllIllI) {
                llllllllllllIlIllIlllIllIlllIllI.printStackTrace();
                return null;
            }
        }
        
        private VertexTranslations(final String llllllllllllIlIllIlllIlllIlllIlI, final int llllllllllllIlIllIlllIlllIlllIIl, final int llllllllllllIlIllIlllIlllIllllll, final int llllllllllllIlIllIlllIlllIllIlll, final int llllllllllllIlIllIlllIlllIllIllI, final int llllllllllllIlIllIlllIlllIllIlIl) {
            this.field_178191_g = llllllllllllIlIllIlllIlllIllllll;
            this.field_178200_h = llllllllllllIlIllIlllIlllIllIlll;
            this.field_178201_i = llllllllllllIlIllIlllIlllIllIllI;
            this.field_178198_j = llllllllllllIlIllIlllIlllIllIlIl;
        }
        
        public static VertexTranslations getVertexTranslations(final EnumFacing llllllllllllIlIllIlllIlllIllIIlI) {
            return VertexTranslations.field_178199_k[llllllllllllIlIllIlllIlllIllIIlI.getIndex()];
        }
        
        private static void lIlIIIlIIlIlllll() {
            (lllIlIIllIIlll = new String[VertexTranslations.lllIlIIllIlIII[6]])[VertexTranslations.lllIlIIllIlIII[0]] = lIlIIIlIIlIlllII("HBkVKA==", "XVBfE");
            VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[1]] = lIlIIIlIIlIlllIl("N/8cREyFxmE=", "bejUF");
            VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[2]] = lIlIIIlIIlIllllI("w905AlKizYI=", "vOnGQ");
            VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[3]] = lIlIIIlIIlIlllII("CyMBMQk=", "XlTeA");
            VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[4]] = lIlIIIlIIlIlllII("PAgFLg==", "kMVzy");
            VertexTranslations.lllIlIIllIIlll[VertexTranslations.lllIlIIllIlIII[5]] = lIlIIIlIIlIllllI("j0NT1OlYCLQ=", "LJZbD");
        }
        
        static {
            lIlIIIlIIllIIIII();
            lIlIIIlIIlIlllll();
            final VertexTranslations[] enum$VALUES = new VertexTranslations[VertexTranslations.lllIlIIllIlIII[6]];
            enum$VALUES[VertexTranslations.lllIlIIllIlIII[0]] = VertexTranslations.DOWN;
            enum$VALUES[VertexTranslations.lllIlIIllIlIII[1]] = VertexTranslations.UP;
            enum$VALUES[VertexTranslations.lllIlIIllIlIII[2]] = VertexTranslations.NORTH;
            enum$VALUES[VertexTranslations.lllIlIIllIlIII[3]] = VertexTranslations.SOUTH;
            enum$VALUES[VertexTranslations.lllIlIIllIlIII[4]] = VertexTranslations.WEST;
            enum$VALUES[VertexTranslations.lllIlIIllIlIII[5]] = VertexTranslations.EAST;
            ENUM$VALUES = enum$VALUES;
            (field_178199_k = new VertexTranslations[VertexTranslations.lllIlIIllIlIII[6]])[EnumFacing.DOWN.getIndex()] = VertexTranslations.DOWN;
            VertexTranslations.field_178199_k[EnumFacing.UP.getIndex()] = VertexTranslations.UP;
            VertexTranslations.field_178199_k[EnumFacing.NORTH.getIndex()] = VertexTranslations.NORTH;
            VertexTranslations.field_178199_k[EnumFacing.SOUTH.getIndex()] = VertexTranslations.SOUTH;
            VertexTranslations.field_178199_k[EnumFacing.WEST.getIndex()] = VertexTranslations.WEST;
            VertexTranslations.field_178199_k[EnumFacing.EAST.getIndex()] = VertexTranslations.EAST;
        }
        
        private static boolean lIlIIIlIIllIIIIl(final int llllllllllllIlIllIlllIllIllIllIl, final int llllllllllllIlIllIlllIllIllIllII) {
            return llllllllllllIlIllIlllIllIllIllIl < llllllllllllIlIllIlllIllIllIllII;
        }
        
        private static void lIlIIIlIIllIIIII() {
            (lllIlIIllIlIII = new int[8])[0] = ((0x10 ^ 0x27) & ~(0x68 ^ 0x5F));
            VertexTranslations.lllIlIIllIlIII[1] = " ".length();
            VertexTranslations.lllIlIIllIlIII[2] = "  ".length();
            VertexTranslations.lllIlIIllIlIII[3] = "   ".length();
            VertexTranslations.lllIlIIllIlIII[4] = (67 + 105 - 143 + 122 ^ 109 + 121 - 87 + 4);
            VertexTranslations.lllIlIIllIlIII[5] = (0x86 ^ 0x83);
            VertexTranslations.lllIlIIllIlIII[6] = (0x76 ^ 0x70);
            VertexTranslations.lllIlIIllIlIII[7] = (56 + 130 - 113 + 58 ^ 21 + 69 - 34 + 83);
        }
    }
    
    class AmbientOcclusionFace
    {
        private final /* synthetic */ int[] vertexBrightness;
        private final /* synthetic */ float[] vertexColorMultiplier;
        private static final /* synthetic */ int[] llIlIlllllIlIl;
        
        private static boolean lIIlIllIIIIIlllI(final int llllllllllllIllIlIIIlIIlllIlIIlI) {
            return llllllllllllIllIlIIIlIIlllIlIIlI != 0;
        }
        
        AmbientOcclusionFace() {
            this.vertexColorMultiplier = new float[AmbientOcclusionFace.llIlIlllllIlIl[0]];
            this.vertexBrightness = new int[AmbientOcclusionFace.llIlIlllllIlIl[0]];
        }
        
        static {
            lIIlIllIIIIIllIl();
        }
        
        private int getVertexBrightness(final int llllllllllllIllIlIIIlIIllllIIIIl, final int llllllllllllIllIlIIIlIIllllIIIII, final int llllllllllllIllIlIIIlIIllllIlIIl, final int llllllllllllIllIlIIIlIIlllIllllI, final float llllllllllllIllIlIIIlIIllllIIlll, final float llllllllllllIllIlIIIlIIlllIlllII, final float llllllllllllIllIlIIIlIIlllIllIll, final float llllllllllllIllIlIIIlIIllllIIlII) {
            final int llllllllllllIllIlIIIlIIllllIIIll = (int)((llllllllllllIllIlIIIlIIllllIIIIl >> AmbientOcclusionFace.llIlIlllllIlIl[9] & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIllllIIlll + (llllllllllllIllIlIIIlIIllllIIIII >> AmbientOcclusionFace.llIlIlllllIlIl[9] & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIlllIlllII + (llllllllllllIllIlIIIlIIllllIlIIl >> AmbientOcclusionFace.llIlIlllllIlIl[9] & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIlllIllIll + (llllllllllllIllIlIIIlIIlllIllllI >> AmbientOcclusionFace.llIlIlllllIlIl[9] & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIllllIIlII) & AmbientOcclusionFace.llIlIlllllIlIl[10];
            final int llllllllllllIllIlIIIlIIllllIIIlI = (int)((llllllllllllIllIlIIIlIIllllIIIIl & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIllllIIlll + (llllllllllllIllIlIIIlIIllllIIIII & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIlllIlllII + (llllllllllllIllIlIIIlIIllllIlIIl & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIlllIllIll + (llllllllllllIllIlIIIlIIlllIllllI & AmbientOcclusionFace.llIlIlllllIlIl[10]) * llllllllllllIllIlIIIlIIllllIIlII) & AmbientOcclusionFace.llIlIlllllIlIl[10];
            return llllllllllllIllIlIIIlIIllllIIIll << AmbientOcclusionFace.llIlIlllllIlIl[9] | llllllllllllIllIlIIIlIIllllIIIlI;
        }
        
        private static boolean lIIlIllIIIIIllll(final int llllllllllllIllIlIIIlIIlllIlIIII) {
            return llllllllllllIllIlIIIlIIlllIlIIII == 0;
        }
        
        public void updateVertexBrightness(final IBlockAccess llllllllllllIllIlIIIlIlIIIlllllI, final Block llllllllllllIllIlIIIlIlIIIllllIl, final BlockPos llllllllllllIllIlIIIlIlIIIllllII, final EnumFacing llllllllllllIllIlIIIlIlIIIlllIll, final float[] llllllllllllIllIlIIIlIlIIIlllIlI, final BitSet llllllllllllIllIlIIIlIlIIIlllIIl) {
            BlockPos offset;
            if (lIIlIllIIIIIlllI(llllllllllllIllIlIIIlIlIIIlllIIl.get(AmbientOcclusionFace.llIlIlllllIlIl[1]) ? 1 : 0)) {
                offset = llllllllllllIllIlIIIlIlIIIllllII.offset(llllllllllllIllIlIIIlIlIIIlllIll);
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                offset = llllllllllllIllIlIIIlIlIIIllllII;
            }
            final BlockPos llllllllllllIllIlIIIlIlIlIIIIlII = offset;
            final EnumNeighborInfo llllllllllllIllIlIIIlIlIlIIIIIll = EnumNeighborInfo.getNeighbourInfo(llllllllllllIllIlIIIlIlIIIlllIll);
            final BlockPos llllllllllllIllIlIIIlIlIlIIIIIlI = llllllllllllIllIlIIIlIlIlIIIIlII.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[1]]);
            final BlockPos llllllllllllIllIlIIIlIlIlIIIIIIl = llllllllllllIllIlIIIlIlIlIIIIlII.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[2]]);
            final BlockPos llllllllllllIllIlIIIlIlIlIIIIIII = llllllllllllIllIlIIIlIlIlIIIIlII.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[3]]);
            final BlockPos llllllllllllIllIlIIIlIlIIlllllll = llllllllllllIllIlIIIlIlIlIIIIlII.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[4]]);
            final int llllllllllllIllIlIIIlIlIIllllllI = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIlIIIIIlI);
            final int llllllllllllIllIlIIIlIlIIlllllIl = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIlIIIIIIl);
            final int llllllllllllIllIlIIIlIlIIlllllII = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIlIIIIIII);
            final int llllllllllllIllIlIIIlIlIIllllIll = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIIlllllll);
            final float llllllllllllIllIlIIIlIlIIllllIlI = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIlIIIIIlI).getBlock().getAmbientOcclusionLightValue();
            final float llllllllllllIllIlIIIlIlIIllllIIl = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIlIIIIIIl).getBlock().getAmbientOcclusionLightValue();
            final float llllllllllllIllIlIIIlIlIIllllIII = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIlIIIIIII).getBlock().getAmbientOcclusionLightValue();
            final float llllllllllllIllIlIIIlIlIIlllIlll = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIlllllll).getBlock().getAmbientOcclusionLightValue();
            final boolean llllllllllllIllIlIIIlIlIIlllIllI = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIlIIIIIlI.offset(llllllllllllIllIlIIIlIlIIIlllIll)).getBlock().isTranslucent();
            final boolean llllllllllllIllIlIIIlIlIIlllIlIl = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIlIIIIIIl.offset(llllllllllllIllIlIIIlIlIIIlllIll)).getBlock().isTranslucent();
            final boolean llllllllllllIllIlIIIlIlIIlllIlII = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIlIIIIIII.offset(llllllllllllIllIlIIIlIlIIIlllIll)).getBlock().isTranslucent();
            final boolean llllllllllllIllIlIIIlIlIIlllIIll = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIlllllll.offset(llllllllllllIllIlIIIlIlIIIlllIll)).getBlock().isTranslucent();
            float llllllllllllIllIlIIIlIlIIlllIIIl = 0.0f;
            int llllllllllllIllIlIIIlIlIIllIllll = 0;
            if (lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIlII ? 1 : 0) && lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIllI ? 1 : 0)) {
                final float llllllllllllIllIlIIIlIlIIlllIIlI = llllllllllllIllIlIIIlIlIIllllIlI;
                final int llllllllllllIllIlIIIlIlIIlllIIII = llllllllllllIllIlIIIlIlIIllllllI;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final BlockPos llllllllllllIllIlIIIlIlIIllIlllI = llllllllllllIllIlIIIlIlIlIIIIIlI.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[3]]);
                llllllllllllIllIlIIIlIlIIlllIIIl = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIllIlllI).getBlock().getAmbientOcclusionLightValue();
                llllllllllllIllIlIIIlIlIIllIllll = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIIllIlllI);
            }
            float llllllllllllIllIlIIIlIlIIllIllII = 0.0f;
            int llllllllllllIllIlIIIlIlIIllIlIlI = 0;
            if (lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIIll ? 1 : 0) && lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIllI ? 1 : 0)) {
                final float llllllllllllIllIlIIIlIlIIllIllIl = llllllllllllIllIlIIIlIlIIllllIlI;
                final int llllllllllllIllIlIIIlIlIIllIlIll = llllllllllllIllIlIIIlIlIIllllllI;
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                final BlockPos llllllllllllIllIlIIIlIlIIllIlIIl = llllllllllllIllIlIIIlIlIlIIIIIlI.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[4]]);
                llllllllllllIllIlIIIlIlIIllIllII = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIllIlIIl).getBlock().getAmbientOcclusionLightValue();
                llllllllllllIllIlIIIlIlIIllIlIlI = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIIllIlIIl);
            }
            float llllllllllllIllIlIIIlIlIIllIIlll = 0.0f;
            int llllllllllllIllIlIIIlIlIIllIIlIl = 0;
            if (lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIlII ? 1 : 0) && lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIlIl ? 1 : 0)) {
                final float llllllllllllIllIlIIIlIlIIllIlIII = llllllllllllIllIlIIIlIlIIllllIIl;
                final int llllllllllllIllIlIIIlIlIIllIIllI = llllllllllllIllIlIIIlIlIIlllllIl;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                final BlockPos llllllllllllIllIlIIIlIlIIllIIlII = llllllllllllIllIlIIIlIlIlIIIIIIl.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[3]]);
                llllllllllllIllIlIIIlIlIIllIIlll = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIllIIlII).getBlock().getAmbientOcclusionLightValue();
                llllllllllllIllIlIIIlIlIIllIIlIl = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIIllIIlII);
            }
            float llllllllllllIllIlIIIlIlIIllIIIlI = 0.0f;
            int llllllllllllIllIlIIIlIlIIllIIIII = 0;
            if (lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIIll ? 1 : 0) && lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIlllIlIl ? 1 : 0)) {
                final float llllllllllllIllIlIIIlIlIIllIIIll = llllllllllllIllIlIIIlIlIIllllIIl;
                final int llllllllllllIllIlIIIlIlIIllIIIIl = llllllllllllIllIlIIIlIlIIlllllIl;
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                final BlockPos llllllllllllIllIlIIIlIlIIlIlllll = llllllllllllIllIlIIIlIlIlIIIIIIl.offset(llllllllllllIllIlIIIlIlIlIIIIIll.field_178276_g[AmbientOcclusionFace.llIlIlllllIlIl[4]]);
                llllllllllllIllIlIIIlIlIIllIIIlI = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIlIlllll).getBlock().getAmbientOcclusionLightValue();
                llllllllllllIllIlIIIlIlIIllIIIII = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIIlIlllll);
            }
            int llllllllllllIllIlIIIlIlIIlIllllI = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIIIllllII);
            if (!lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIIlllIIl.get(AmbientOcclusionFace.llIlIlllllIlIl[1]) ? 1 : 0) || lIIlIllIIIIIllll(llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIIllllII.offset(llllllllllllIllIlIIIlIlIIIlllIll)).getBlock().isOpaqueCube() ? 1 : 0)) {
                llllllllllllIllIlIIIlIlIIlIllllI = llllllllllllIllIlIIIlIlIIIllllIl.getMixedBrightnessForBlock(llllllllllllIllIlIIIlIlIIIlllllI, llllllllllllIllIlIIIlIlIIIllllII.offset(llllllllllllIllIlIIIlIlIIIlllIll));
            }
            float n;
            if (lIIlIllIIIIIlllI(llllllllllllIllIlIIIlIlIIIlllIIl.get(AmbientOcclusionFace.llIlIlllllIlIl[1]) ? 1 : 0)) {
                n = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIlIIIIlII).getBlock().getAmbientOcclusionLightValue();
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                n = llllllllllllIllIlIIIlIlIIIlllllI.getBlockState(llllllllllllIllIlIIIlIlIIIllllII).getBlock().getAmbientOcclusionLightValue();
            }
            final float llllllllllllIllIlIIIlIlIIlIlllIl = n;
            final VertexTranslations llllllllllllIllIlIIIlIlIIlIlllII = VertexTranslations.getVertexTranslations(llllllllllllIllIlIIIlIlIIIlllIll);
            if (lIIlIllIIIIIlllI(llllllllllllIllIlIIIlIlIIIlllIIl.get(AmbientOcclusionFace.llIlIlllllIlIl[2]) ? 1 : 0) && lIIlIllIIIIIlllI(llllllllllllIllIlIIIlIlIlIIIIIll.field_178289_i ? 1 : 0)) {
                final float llllllllllllIllIlIIIlIlIIlIllIll = (llllllllllllIllIlIIIlIlIIlllIlll + llllllllllllIllIlIIIlIlIIllllIlI + llllllllllllIllIlIIIlIlIIllIllII + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                final float llllllllllllIllIlIIIlIlIIlIllIlI = (llllllllllllIllIlIIIlIlIIllllIII + llllllllllllIllIlIIIlIlIIllllIlI + llllllllllllIllIlIIIlIlIIlllIIIl + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                final float llllllllllllIllIlIIIlIlIIlIllIIl = (llllllllllllIllIlIIIlIlIIllllIII + llllllllllllIllIlIIIlIlIIllllIIl + llllllllllllIllIlIIIlIlIIllIIlll + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                final float llllllllllllIllIlIIIlIlIIlIllIII = (llllllllllllIllIlIIIlIlIIlllIlll + llllllllllllIllIlIIIlIlIIllllIIl + llllllllllllIllIlIIIlIlIIllIIIlI + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                final float llllllllllllIllIlIIIlIlIIlIlIlll = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[1]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[2]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIlIllI = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[3]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[4]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIlIlIl = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[0]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[5]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIlIlII = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[6]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178286_j[AmbientOcclusionFace.llIlIlllllIlIl[7]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIlIIll = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[1]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[2]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIlIIlI = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[3]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[4]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIlIIIl = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[0]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[5]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIlIIII = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[6]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178287_k[AmbientOcclusionFace.llIlIlllllIlIl[7]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIllll = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[1]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[2]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIlllI = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[3]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[4]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIllIl = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[0]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[5]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIllII = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[6]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178284_l[AmbientOcclusionFace.llIlIlllllIlIl[7]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIlIll = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[1]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[2]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIlIlI = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[3]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[4]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIlIIl = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[0]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[5]].field_178229_m];
                final float llllllllllllIllIlIIIlIlIIlIIlIII = llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[6]].field_178229_m] * llllllllllllIllIlIIIlIlIIIlllIlI[llllllllllllIllIlIIIlIlIlIIIIIll.field_178285_m[AmbientOcclusionFace.llIlIlllllIlIl[7]].field_178229_m];
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178191_g] = llllllllllllIllIlIIIlIlIIlIllIll * llllllllllllIllIlIIIlIlIIlIlIlll + llllllllllllIllIlIIIlIlIIlIllIlI * llllllllllllIllIlIIIlIlIIlIlIllI + llllllllllllIllIlIIIlIlIIlIllIIl * llllllllllllIllIlIIIlIlIIlIlIlIl + llllllllllllIllIlIIIlIlIIlIllIII * llllllllllllIllIlIIIlIlIIlIlIlII;
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178200_h] = llllllllllllIllIlIIIlIlIIlIllIll * llllllllllllIllIlIIIlIlIIlIlIIll + llllllllllllIllIlIIIlIlIIlIllIlI * llllllllllllIllIlIIIlIlIIlIlIIlI + llllllllllllIllIlIIIlIlIIlIllIIl * llllllllllllIllIlIIIlIlIIlIlIIIl + llllllllllllIllIlIIIlIlIIlIllIII * llllllllllllIllIlIIIlIlIIlIlIIII;
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178201_i] = llllllllllllIllIlIIIlIlIIlIllIll * llllllllllllIllIlIIIlIlIIlIIllll + llllllllllllIllIlIIIlIlIIlIllIlI * llllllllllllIllIlIIIlIlIIlIIlllI + llllllllllllIllIlIIIlIlIIlIllIIl * llllllllllllIllIlIIIlIlIIlIIllIl + llllllllllllIllIlIIIlIlIIlIllIII * llllllllllllIllIlIIIlIlIIlIIllII;
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178198_j] = llllllllllllIllIlIIIlIlIIlIllIll * llllllllllllIllIlIIIlIlIIlIIlIll + llllllllllllIllIlIIIlIlIIlIllIlI * llllllllllllIllIlIIIlIlIIlIIlIlI + llllllllllllIllIlIIIlIlIIlIllIIl * llllllllllllIllIlIIIlIlIIlIIlIIl + llllllllllllIllIlIIIlIlIIlIllIII * llllllllllllIllIlIIIlIlIIlIIlIII;
                final int llllllllllllIllIlIIIlIlIIlIIIlll = this.getAoBrightness(llllllllllllIllIlIIIlIlIIllllIll, llllllllllllIllIlIIIlIlIIllllllI, llllllllllllIllIlIIIlIlIIllIlIlI, llllllllllllIllIlIIIlIlIIlIllllI);
                final int llllllllllllIllIlIIIlIlIIlIIIllI = this.getAoBrightness(llllllllllllIllIlIIIlIlIIlllllII, llllllllllllIllIlIIIlIlIIllllllI, llllllllllllIllIlIIIlIlIIllIllll, llllllllllllIllIlIIIlIlIIlIllllI);
                final int llllllllllllIllIlIIIlIlIIlIIIlIl = this.getAoBrightness(llllllllllllIllIlIIIlIlIIlllllII, llllllllllllIllIlIIIlIlIIlllllIl, llllllllllllIllIlIIIlIlIIllIIlIl, llllllllllllIllIlIIIlIlIIlIllllI);
                final int llllllllllllIllIlIIIlIlIIlIIIlII = this.getAoBrightness(llllllllllllIllIlIIIlIlIIllllIll, llllllllllllIllIlIIIlIlIIlllllIl, llllllllllllIllIlIIIlIlIIllIIIII, llllllllllllIllIlIIIlIlIIlIllllI);
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178191_g] = this.getVertexBrightness(llllllllllllIllIlIIIlIlIIlIIIlll, llllllllllllIllIlIIIlIlIIlIIIllI, llllllllllllIllIlIIIlIlIIlIIIlIl, llllllllllllIllIlIIIlIlIIlIIIlII, llllllllllllIllIlIIIlIlIIlIlIlll, llllllllllllIllIlIIIlIlIIlIlIllI, llllllllllllIllIlIIIlIlIIlIlIlIl, llllllllllllIllIlIIIlIlIIlIlIlII);
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178200_h] = this.getVertexBrightness(llllllllllllIllIlIIIlIlIIlIIIlll, llllllllllllIllIlIIIlIlIIlIIIllI, llllllllllllIllIlIIIlIlIIlIIIlIl, llllllllllllIllIlIIIlIlIIlIIIlII, llllllllllllIllIlIIIlIlIIlIlIIll, llllllllllllIllIlIIIlIlIIlIlIIlI, llllllllllllIllIlIIIlIlIIlIlIIIl, llllllllllllIllIlIIIlIlIIlIlIIII);
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178201_i] = this.getVertexBrightness(llllllllllllIllIlIIIlIlIIlIIIlll, llllllllllllIllIlIIIlIlIIlIIIllI, llllllllllllIllIlIIIlIlIIlIIIlIl, llllllllllllIllIlIIIlIlIIlIIIlII, llllllllllllIllIlIIIlIlIIlIIllll, llllllllllllIllIlIIIlIlIIlIIlllI, llllllllllllIllIlIIIlIlIIlIIllIl, llllllllllllIllIlIIIlIlIIlIIllII);
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178198_j] = this.getVertexBrightness(llllllllllllIllIlIIIlIlIIlIIIlll, llllllllllllIllIlIIIlIlIIlIIIllI, llllllllllllIllIlIIIlIlIIlIIIlIl, llllllllllllIllIlIIIlIlIIlIIIlII, llllllllllllIllIlIIIlIlIIlIIlIll, llllllllllllIllIlIIIlIlIIlIIlIlI, llllllllllllIllIlIIIlIlIIlIIlIIl, llllllllllllIllIlIIIlIlIIlIIlIII);
                "".length();
                if ((0xB6 ^ 0xB3) == 0x0) {
                    return;
                }
            }
            else {
                final float llllllllllllIllIlIIIlIlIIlIIIIll = (llllllllllllIllIlIIIlIlIIlllIlll + llllllllllllIllIlIIIlIlIIllllIlI + llllllllllllIllIlIIIlIlIIllIllII + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                final float llllllllllllIllIlIIIlIlIIlIIIIlI = (llllllllllllIllIlIIIlIlIIllllIII + llllllllllllIllIlIIIlIlIIllllIlI + llllllllllllIllIlIIIlIlIIlllIIIl + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                final float llllllllllllIllIlIIIlIlIIlIIIIIl = (llllllllllllIllIlIIIlIlIIllllIII + llllllllllllIllIlIIIlIlIIllllIIl + llllllllllllIllIlIIIlIlIIllIIlll + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                final float llllllllllllIllIlIIIlIlIIlIIIIII = (llllllllllllIllIlIIIlIlIIlllIlll + llllllllllllIllIlIIIlIlIIllllIIl + llllllllllllIllIlIIIlIlIIllIIIlI + llllllllllllIllIlIIIlIlIIlIlllIl) * 0.25f;
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178191_g] = this.getAoBrightness(llllllllllllIllIlIIIlIlIIllllIll, llllllllllllIllIlIIIlIlIIllllllI, llllllllllllIllIlIIIlIlIIllIlIlI, llllllllllllIllIlIIIlIlIIlIllllI);
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178200_h] = this.getAoBrightness(llllllllllllIllIlIIIlIlIIlllllII, llllllllllllIllIlIIIlIlIIllllllI, llllllllllllIllIlIIIlIlIIllIllll, llllllllllllIllIlIIIlIlIIlIllllI);
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178201_i] = this.getAoBrightness(llllllllllllIllIlIIIlIlIIlllllII, llllllllllllIllIlIIIlIlIIlllllIl, llllllllllllIllIlIIIlIlIIllIIlIl, llllllllllllIllIlIIIlIlIIlIllllI);
                this.vertexBrightness[llllllllllllIllIlIIIlIlIIlIlllII.field_178198_j] = this.getAoBrightness(llllllllllllIllIlIIIlIlIIllllIll, llllllllllllIllIlIIIlIlIIlllllIl, llllllllllllIllIlIIIlIlIIllIIIII, llllllllllllIllIlIIIlIlIIlIllllI);
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178191_g] = llllllllllllIllIlIIIlIlIIlIIIIll;
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178200_h] = llllllllllllIllIlIIIlIlIIlIIIIlI;
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178201_i] = llllllllllllIllIlIIIlIlIIlIIIIIl;
                this.vertexColorMultiplier[llllllllllllIllIlIIIlIlIIlIlllII.field_178198_j] = llllllllllllIllIlIIIlIlIIlIIIIII;
            }
        }
        
        private int getAoBrightness(int llllllllllllIllIlIIIlIIllllllllI, int llllllllllllIllIlIIIlIIllllllIIl, int llllllllllllIllIlIIIlIIllllllIII, final int llllllllllllIllIlIIIlIIlllllIlll) {
            if (lIIlIllIIIIIllll(llllllllllllIllIlIIIlIIllllllllI)) {
                llllllllllllIllIlIIIlIIllllllllI = llllllllllllIllIlIIIlIIlllllIlll;
            }
            if (lIIlIllIIIIIllll(llllllllllllIllIlIIIlIIllllllIIl)) {
                llllllllllllIllIlIIIlIIllllllIIl = llllllllllllIllIlIIIlIIlllllIlll;
            }
            if (lIIlIllIIIIIllll(llllllllllllIllIlIIIlIIllllllIII)) {
                llllllllllllIllIlIIIlIIllllllIII = llllllllllllIllIlIIIlIIlllllIlll;
            }
            return llllllllllllIllIlIIIlIIllllllllI + llllllllllllIllIlIIIlIIllllllIIl + llllllllllllIllIlIIIlIIllllllIII + llllllllllllIllIlIIIlIIlllllIlll >> AmbientOcclusionFace.llIlIlllllIlIl[3] & AmbientOcclusionFace.llIlIlllllIlIl[8];
        }
        
        private static void lIIlIllIIIIIllIl() {
            (llIlIlllllIlIl = new int[11])[0] = (0xEB ^ 0x98 ^ (0xFA ^ 0x8D));
            AmbientOcclusionFace.llIlIlllllIlIl[1] = ((35 + 175 - 121 + 139 ^ 96 + 58 - 99 + 80) & (47 + 136 - 83 + 110 ^ 134 + 61 - 72 + 54 ^ -" ".length()));
            AmbientOcclusionFace.llIlIlllllIlIl[2] = " ".length();
            AmbientOcclusionFace.llIlIlllllIlIl[3] = "  ".length();
            AmbientOcclusionFace.llIlIlllllIlIl[4] = "   ".length();
            AmbientOcclusionFace.llIlIlllllIlIl[5] = (0x60 ^ 0x65);
            AmbientOcclusionFace.llIlIlllllIlIl[6] = (0x10 ^ 0x49 ^ (0x46 ^ 0x19));
            AmbientOcclusionFace.llIlIlllllIlIl[7] = (0x49 ^ 0x4E);
            AmbientOcclusionFace.llIlIlllllIlIl[8] = (0xFFFFE1FF & 0xFF1EFF);
            AmbientOcclusionFace.llIlIlllllIlIl[9] = (0x69 ^ 0x74 ^ (0x54 ^ 0x59));
            AmbientOcclusionFace.llIlIlllllIlIl[10] = (0x52 ^ 0x45) + " ".length() - -(88 + 159 - 156 + 75) + (0x42 ^ 0x3);
        }
    }
    
    public enum Orientation
    {
        FLIP_SOUTH(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[9]], Orientation.lllllIIIllIII[9], EnumFacing.SOUTH, (boolean)(Orientation.lllllIIIllIII[1] != 0)), 
        NORTH(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[2]], Orientation.lllllIIIllIII[2], EnumFacing.NORTH, (boolean)(Orientation.lllllIIIllIII[0] != 0)), 
        UP(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[1]], Orientation.lllllIIIllIII[1], EnumFacing.UP, (boolean)(Orientation.lllllIIIllIII[0] != 0));
        
        private static final /* synthetic */ int[] lllllIIIllIII;
        
        FLIP_WEST(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[10]], Orientation.lllllIIIllIII[10], EnumFacing.WEST, (boolean)(Orientation.lllllIIIllIII[1] != 0));
        
        private static final /* synthetic */ String[] lllllIIIIllll;
        protected final /* synthetic */ int field_178229_m;
        
        FLIP_DOWN(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[6]], Orientation.lllllIIIllIII[6], EnumFacing.DOWN, (boolean)(Orientation.lllllIIIllIII[1] != 0)), 
        FLIP_NORTH(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[8]], Orientation.lllllIIIllIII[8], EnumFacing.NORTH, (boolean)(Orientation.lllllIIIllIII[1] != 0)), 
        DOWN(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[0]], Orientation.lllllIIIllIII[0], EnumFacing.DOWN, (boolean)(Orientation.lllllIIIllIII[0] != 0)), 
        WEST(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[4]], Orientation.lllllIIIllIII[4], EnumFacing.WEST, (boolean)(Orientation.lllllIIIllIII[0] != 0)), 
        FLIP_EAST(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[11]], Orientation.lllllIIIllIII[11], EnumFacing.EAST, (boolean)(Orientation.lllllIIIllIII[1] != 0)), 
        SOUTH(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[3]], Orientation.lllllIIIllIII[3], EnumFacing.SOUTH, (boolean)(Orientation.lllllIIIllIII[0] != 0)), 
        FLIP_UP(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[7]], Orientation.lllllIIIllIII[7], EnumFacing.UP, (boolean)(Orientation.lllllIIIllIII[1] != 0)), 
        EAST(Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[5]], Orientation.lllllIIIllIII[5], EnumFacing.EAST, (boolean)(Orientation.lllllIIIllIII[0] != 0));
        
        static {
            lIlIllIlIIlIIIl();
            lIlIllIIllllIIl();
            final Orientation[] enum$VALUES = new Orientation[Orientation.lllllIIIllIII[12]];
            enum$VALUES[Orientation.lllllIIIllIII[0]] = Orientation.DOWN;
            enum$VALUES[Orientation.lllllIIIllIII[1]] = Orientation.UP;
            enum$VALUES[Orientation.lllllIIIllIII[2]] = Orientation.NORTH;
            enum$VALUES[Orientation.lllllIIIllIII[3]] = Orientation.SOUTH;
            enum$VALUES[Orientation.lllllIIIllIII[4]] = Orientation.WEST;
            enum$VALUES[Orientation.lllllIIIllIII[5]] = Orientation.EAST;
            enum$VALUES[Orientation.lllllIIIllIII[6]] = Orientation.FLIP_DOWN;
            enum$VALUES[Orientation.lllllIIIllIII[7]] = Orientation.FLIP_UP;
            enum$VALUES[Orientation.lllllIIIllIII[8]] = Orientation.FLIP_NORTH;
            enum$VALUES[Orientation.lllllIIIllIII[9]] = Orientation.FLIP_SOUTH;
            enum$VALUES[Orientation.lllllIIIllIII[10]] = Orientation.FLIP_WEST;
            enum$VALUES[Orientation.lllllIIIllIII[11]] = Orientation.FLIP_EAST;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIlIllIlIIlIIIl() {
            (lllllIIIllIII = new int[13])[0] = ((0x22 ^ 0x3) & ~(0x77 ^ 0x56));
            Orientation.lllllIIIllIII[1] = " ".length();
            Orientation.lllllIIIllIII[2] = "  ".length();
            Orientation.lllllIIIllIII[3] = "   ".length();
            Orientation.lllllIIIllIII[4] = (5 + 106 - 21 + 94 ^ 10 + 137 - 20 + 61);
            Orientation.lllllIIIllIII[5] = (52 + 145 - 93 + 88 ^ 151 + 53 - 79 + 72);
            Orientation.lllllIIIllIII[6] = (0x9C ^ 0x9A);
            Orientation.lllllIIIllIII[7] = (0xA7 ^ 0xA0);
            Orientation.lllllIIIllIII[8] = (0x5D ^ 0x21 ^ (0xDA ^ 0xAE));
            Orientation.lllllIIIllIII[9] = (0xAE ^ 0xAB ^ (0x69 ^ 0x65));
            Orientation.lllllIIIllIII[10] = (0x1E ^ 0x5F ^ (0xCD ^ 0x86));
            Orientation.lllllIIIllIII[11] = (135 + 110 - 87 + 1 ^ 112 + 32 - 106 + 110);
            Orientation.lllllIIIllIII[12] = (185 + 123 - 204 + 83 ^ 162 + 84 - 91 + 28);
        }
        
        private static String lIlIllIIlllIllI(String lllllllllllllIlIllIIIIlIIIlIllII, final String lllllllllllllIlIllIIIIlIIIlIlIll) {
            lllllllllllllIlIllIIIIlIIIlIllII = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIllIIIIlIIIlIlIlI = new StringBuilder();
            final char[] lllllllllllllIlIllIIIIlIIIlIlIIl = lllllllllllllIlIllIIIIlIIIlIlIll.toCharArray();
            int lllllllllllllIlIllIIIIlIIIlIlIII = Orientation.lllllIIIllIII[0];
            final Exception lllllllllllllIlIllIIIIlIIIlIIIlI = (Object)lllllllllllllIlIllIIIIlIIIlIllII.toCharArray();
            final float lllllllllllllIlIllIIIIlIIIlIIIIl = lllllllllllllIlIllIIIIlIIIlIIIlI.length;
            int lllllllllllllIlIllIIIIlIIIlIIIII = Orientation.lllllIIIllIII[0];
            while (lIlIllIlIIlIIll(lllllllllllllIlIllIIIIlIIIlIIIII, (int)lllllllllllllIlIllIIIIlIIIlIIIIl)) {
                final char lllllllllllllIlIllIIIIlIIIlIllIl = lllllllllllllIlIllIIIIlIIIlIIIlI[lllllllllllllIlIllIIIIlIIIlIIIII];
                lllllllllllllIlIllIIIIlIIIlIlIlI.append((char)(lllllllllllllIlIllIIIIlIIIlIllIl ^ lllllllllllllIlIllIIIIlIIIlIlIIl[lllllllllllllIlIllIIIIlIIIlIlIII % lllllllllllllIlIllIIIIlIIIlIlIIl.length]));
                "".length();
                ++lllllllllllllIlIllIIIIlIIIlIlIII;
                ++lllllllllllllIlIllIIIIlIIIlIIIII;
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIllIIIIlIIIlIlIlI);
        }
        
        private static String lIlIllIIllllIII(final String lllllllllllllIlIllIIIIlIIIIlIlll, final String lllllllllllllIlIllIIIIlIIIIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIIlIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIlIIIIlIlII.getBytes(StandardCharsets.UTF_8)), Orientation.lllllIIIllIII[8]), "DES");
                final Cipher lllllllllllllIlIllIIIIlIIIIllIIl = Cipher.getInstance("DES");
                lllllllllllllIlIllIIIIlIIIIllIIl.init(Orientation.lllllIIIllIII[2], lllllllllllllIlIllIIIIlIIIIllIlI);
                return new String(lllllllllllllIlIllIIIIlIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIIlIIIIllIII) {
                lllllllllllllIlIllIIIIlIIIIllIII.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIllIIlllIlll(final String lllllllllllllIlIllIIIIlIIIlllIlI, final String lllllllllllllIlIllIIIIlIIIlllIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIIlIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIllIIIIlIIIlllllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIllIIIIlIIIlllllI.init(Orientation.lllllIIIllIII[2], lllllllllllllIlIllIIIIlIIIllllll);
                return new String(lllllllllllllIlIllIIIIlIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIIlIIIllllIl) {
                lllllllllllllIlIllIIIIlIIIllllIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIllIIllllIIl() {
            (lllllIIIIllll = new String[Orientation.lllllIIIllIII[12]])[Orientation.lllllIIIllIII[0]] = lIlIllIIlllIllI("HQgiNA==", "YGuzj");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[1]] = lIlIllIIlllIllI("BRQ=", "PDcyJ");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[2]] = lIlIllIIlllIllI("Cj4oExk=", "DqzGQ");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[3]] = lIlIllIIlllIllI("EDwvPDk=", "Cszhq");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[4]] = lIlIllIIlllIllI("Gy4cPg==", "LkOjQ");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[5]] = lIlIllIIlllIlll("JrX3rWOZnKI=", "SSbXM");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[6]] = lIlIllIIlllIlll("3xFfdurej7xWowho/eZYbQ==", "kLeUw");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[7]] = lIlIllIIlllIlll("+pFzorKBpvI=", "gGmEP");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[8]] = lIlIllIIlllIlll("+9VXFAEWc3U2N01XXrrA0w==", "aPnrm");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[9]] = lIlIllIIlllIllI("NRwsNhsgHzAyDA==", "sPefD");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[10]] = lIlIllIIllllIII("tf0MfIV8UK9mgvw1z3tZOw==", "kHWjN");
            Orientation.lllllIIIIllll[Orientation.lllllIIIllIII[11]] = lIlIllIIlllIlll("s8KYUWIcfvcuQ0jdwa+hyw==", "DPwyR");
        }
        
        private static boolean lIlIllIlIIlIIlI(final int lllllllllllllIlIllIIIIlIIIIIllII) {
            return lllllllllllllIlIllIIIIlIIIIIllII != 0;
        }
        
        private Orientation(final String lllllllllllllIlIllIIIIlIIlIIllll, final int lllllllllllllIlIllIIIIlIIlIIlllI, final EnumFacing lllllllllllllIlIllIIIIlIIlIIllIl, final boolean lllllllllllllIlIllIIIIlIIlIIllII) {
            final int index = lllllllllllllIlIllIIIIlIIlIIllIl.getIndex();
            int length;
            if (lIlIllIlIIlIIlI(lllllllllllllIlIllIIIIlIIlIIllII ? 1 : 0)) {
                length = EnumFacing.values().length;
                "".length();
                if ("  ".length() < "  ".length()) {
                    throw null;
                }
            }
            else {
                length = Orientation.lllllIIIllIII[0];
            }
            this.field_178229_m = index + length;
        }
        
        private static boolean lIlIllIlIIlIIll(final int lllllllllllllIlIllIIIIlIIIIIllll, final int lllllllllllllIlIllIIIIlIIIIIlllI) {
            return lllllllllllllIlIllIIIIlIIIIIllll < lllllllllllllIlIllIIIIlIIIIIlllI;
        }
    }
    
    public enum EnumNeighborInfo
    {
        private static final /* synthetic */ EnumNeighborInfo[] field_178282_n;
        protected final /* synthetic */ EnumFacing[] field_178276_g;
        protected final /* synthetic */ Orientation[] field_178285_m;
        
        WEST(lllllllllllllIIIIllIlIllllIIIlII5, lllllllllllllIIIIllIlIllllIIIIll5, lllllllllllllIIIIllIlIllllIIIIlI5, lllllllllllllIIIIllIlIllllIIIIIl3, (boolean)(lllllllllllllIIIIllIlIllllIIlIlI3 != 0), lllllllllllllIIIIllIlIlllIllllll3, lllllllllllllIIIIllIlIllllIIlIII3, lllllllllllllIIIIllIlIlllIllllIl3, lllllllllllllIIIIllIlIlllIllllII3);
        
        private static final /* synthetic */ int[] lIlIllIlIIlIll;
        protected final /* synthetic */ float field_178288_h;
        
        SOUTH(lllllllllllllIIIIllIlIllllIIIlII4, lllllllllllllIIIIllIlIllllIIIIll4, lllllllllllllIIIIllIlIllllIIIIlI4, lllllllllllllIIIIllIlIllllIIIIIl2, (boolean)(lllllllllllllIIIIllIlIllllIIlIlI2 != 0), lllllllllllllIIIIllIlIlllIllllll2, lllllllllllllIIIIllIlIllllIIlIII2, lllllllllllllIIIIllIlIlllIllllIl2, lllllllllllllIIIIllIlIlllIllllII2), 
        DOWN(lllllllllllllIIIIllIlIllllIIIlII, lllllllllllllIIIIllIlIllllIIIIll, lllllllllllllIIIIllIlIllllIIIIlI, 0.5f, (boolean)(EnumNeighborInfo.lIlIllIlIIlIll[0] != 0), new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]], new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]], new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]], new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]]), 
        EAST(lllllllllllllIIIIllIlIllllIIIlII6, lllllllllllllIIIIllIlIllllIIIIll6, lllllllllllllIIIIllIlIllllIIIIlI6, lllllllllllllIIIIllIlIllllIIIIIl4, (boolean)(lllllllllllllIIIIllIlIllllIIlIlI4 != 0), lllllllllllllIIIIllIlIlllIllllll4, lllllllllllllIIIIllIlIllllIIlIII4, lllllllllllllIIIIllIlIlllIllllIl4, lllllllllllllIIIIllIlIlllIllllII4);
        
        protected final /* synthetic */ Orientation[] field_178287_k;
        protected final /* synthetic */ Orientation[] field_178284_l;
        
        UP(lllllllllllllIIIIllIlIllllIIIlII2, lllllllllllllIIIIllIlIllllIIIIll2, lllllllllllllIIIIllIlIllllIIIIlI2, 1.0f, (boolean)(EnumNeighborInfo.lIlIllIlIIlIll[0] != 0), new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]], new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]], new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]], new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[0]]);
        
        private static final /* synthetic */ String[] lIlIllIlIIlIII;
        protected final /* synthetic */ Orientation[] field_178286_j;
        protected final /* synthetic */ boolean field_178289_i;
        
        NORTH(lllllllllllllIIIIllIlIllllIIIlII3, lllllllllllllIIIIllIlIllllIIIIll3, lllllllllllllIIIIllIlIllllIIIIlI3, lllllllllllllIIIIllIlIllllIIIIIl, (boolean)(lllllllllllllIIIIllIlIllllIIlIlI != 0), lllllllllllllIIIIllIlIlllIllllll, lllllllllllllIIIIllIlIllllIIlIII, lllllllllllllIIIIllIlIlllIllllIl, lllllllllllllIIIIllIlIlllIllllII);
        
        static {
            llllIIIllIlIIll();
            llllIIIllIIlIlI();
            final String lllllllllllllIIIIllIlIllllIIIlII = EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[0]];
            final int lllllllllllllIIIIllIlIllllIIIIll = EnumNeighborInfo.lIlIllIlIIlIll[0];
            final EnumFacing[] lllllllllllllIIIIllIlIllllIIIIlI = new EnumFacing[EnumNeighborInfo.lIlIllIlIIlIll[1]];
            lllllllllllllIIIIllIlIllllIIIIlI[EnumNeighborInfo.lIlIllIlIIlIll[0]] = EnumFacing.WEST;
            lllllllllllllIIIIllIlIllllIIIIlI[EnumNeighborInfo.lIlIllIlIIlIll[2]] = EnumFacing.EAST;
            lllllllllllllIIIIllIlIllllIIIIlI[EnumNeighborInfo.lIlIllIlIIlIll[3]] = EnumFacing.NORTH;
            lllllllllllllIIIIllIlIllllIIIIlI[EnumNeighborInfo.lIlIllIlIIlIll[4]] = EnumFacing.SOUTH;
            final String lllllllllllllIIIIllIlIllllIIIlII2 = EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[2]];
            final int lllllllllllllIIIIllIlIllllIIIIll2 = EnumNeighborInfo.lIlIllIlIIlIll[2];
            final EnumFacing[] lllllllllllllIIIIllIlIllllIIIIlI2 = new EnumFacing[EnumNeighborInfo.lIlIllIlIIlIll[1]];
            lllllllllllllIIIIllIlIllllIIIIlI2[EnumNeighborInfo.lIlIllIlIIlIll[0]] = EnumFacing.EAST;
            lllllllllllllIIIIllIlIllllIIIIlI2[EnumNeighborInfo.lIlIllIlIIlIll[2]] = EnumFacing.WEST;
            lllllllllllllIIIIllIlIllllIIIIlI2[EnumNeighborInfo.lIlIllIlIIlIll[3]] = EnumFacing.NORTH;
            lllllllllllllIIIIllIlIllllIIIIlI2[EnumNeighborInfo.lIlIllIlIIlIll[4]] = EnumFacing.SOUTH;
            final String lllllllllllllIIIIllIlIllllIIIlII3 = EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[3]];
            final int lllllllllllllIIIIllIlIllllIIIIll3 = EnumNeighborInfo.lIlIllIlIIlIll[3];
            final EnumFacing[] lllllllllllllIIIIllIlIllllIIIIlI3 = new EnumFacing[EnumNeighborInfo.lIlIllIlIIlIll[1]];
            lllllllllllllIIIIllIlIllllIIIIlI3[EnumNeighborInfo.lIlIllIlIIlIll[0]] = EnumFacing.UP;
            lllllllllllllIIIIllIlIllllIIIIlI3[EnumNeighborInfo.lIlIllIlIIlIll[2]] = EnumFacing.DOWN;
            lllllllllllllIIIIllIlIllllIIIIlI3[EnumNeighborInfo.lIlIllIlIIlIll[3]] = EnumFacing.EAST;
            lllllllllllllIIIIllIlIllllIIIIlI3[EnumNeighborInfo.lIlIllIlIIlIll[4]] = EnumFacing.WEST;
            final float lllllllllllllIIIIllIlIllllIIIIIl = 0.8f;
            final int lllllllllllllIIIIllIlIllllIIlIlI = EnumNeighborInfo.lIlIllIlIIlIll[2];
            final Orientation[] lllllllllllllIIIIllIlIlllIllllll = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_WEST;
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.WEST;
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.WEST;
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllll[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.FLIP_WEST;
            final Orientation[] lllllllllllllIIIIllIlIllllIIlIII = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.UP;
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_EAST;
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.UP;
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.EAST;
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.EAST;
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIllllIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.FLIP_EAST;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllIl = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_EAST;
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.EAST;
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.EAST;
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllIl[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.FLIP_EAST;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllII = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_WEST;
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.WEST;
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.WEST;
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllII[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.FLIP_WEST;
            final String lllllllllllllIIIIllIlIllllIIIlII4 = EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[4]];
            final int lllllllllllllIIIIllIlIllllIIIIll4 = EnumNeighborInfo.lIlIllIlIIlIll[4];
            final EnumFacing[] lllllllllllllIIIIllIlIllllIIIIlI4 = new EnumFacing[EnumNeighborInfo.lIlIllIlIIlIll[1]];
            lllllllllllllIIIIllIlIllllIIIIlI4[EnumNeighborInfo.lIlIllIlIIlIll[0]] = EnumFacing.WEST;
            lllllllllllllIIIIllIlIllllIIIIlI4[EnumNeighborInfo.lIlIllIlIIlIll[2]] = EnumFacing.EAST;
            lllllllllllllIIIIllIlIllllIIIIlI4[EnumNeighborInfo.lIlIllIlIIlIll[3]] = EnumFacing.DOWN;
            lllllllllllllIIIIllIlIllllIIIIlI4[EnumNeighborInfo.lIlIllIlIIlIll[4]] = EnumFacing.UP;
            final float lllllllllllllIIIIllIlIllllIIIIIl2 = 0.8f;
            final int lllllllllllllIIIIllIlIllllIIlIlI2 = EnumNeighborInfo.lIlIllIlIIlIll[2];
            final Orientation[] lllllllllllllIIIIllIlIlllIllllll2 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_WEST;
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_WEST;
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.WEST;
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllll2[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.WEST;
            final Orientation[] lllllllllllllIIIIllIlIllllIIlIII2 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_WEST;
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_WEST;
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.WEST;
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIllllIIlIII2[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.WEST;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllIl2 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_EAST;
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_EAST;
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.EAST;
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllIl2[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.EAST;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllII2 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.FLIP_EAST;
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_EAST;
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.EAST;
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllII2[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.EAST;
            final String lllllllllllllIIIIllIlIllllIIIlII5 = EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[1]];
            final int lllllllllllllIIIIllIlIllllIIIIll5 = EnumNeighborInfo.lIlIllIlIIlIll[1];
            final EnumFacing[] lllllllllllllIIIIllIlIllllIIIIlI5 = new EnumFacing[EnumNeighborInfo.lIlIllIlIIlIll[1]];
            lllllllllllllIIIIllIlIllllIIIIlI5[EnumNeighborInfo.lIlIllIlIIlIll[0]] = EnumFacing.UP;
            lllllllllllllIIIIllIlIllllIIIIlI5[EnumNeighborInfo.lIlIllIlIIlIll[2]] = EnumFacing.DOWN;
            lllllllllllllIIIIllIlIllllIIIIlI5[EnumNeighborInfo.lIlIllIlIIlIll[3]] = EnumFacing.NORTH;
            lllllllllllllIIIIllIlIllllIIIIlI5[EnumNeighborInfo.lIlIllIlIIlIll[4]] = EnumFacing.SOUTH;
            final float lllllllllllllIIIIllIlIllllIIIIIl3 = 0.6f;
            final int lllllllllllllIIIIllIlIllllIIlIlI3 = EnumNeighborInfo.lIlIllIlIIlIll[2];
            final Orientation[] lllllllllllllIIIIllIlIlllIllllll3 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.SOUTH;
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllll3[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.SOUTH;
            final Orientation[] lllllllllllllIIIIllIlIllllIIlIII3 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.UP;
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.NORTH;
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.UP;
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIllllIIlIII3[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.NORTH;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllIl3 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.NORTH;
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllIl3[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.NORTH;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllII3 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.SOUTH;
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllII3[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.SOUTH;
            final String lllllllllllllIIIIllIlIllllIIIlII6 = EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[6]];
            final int lllllllllllllIIIIllIlIllllIIIIll6 = EnumNeighborInfo.lIlIllIlIIlIll[6];
            final EnumFacing[] lllllllllllllIIIIllIlIllllIIIIlI6 = new EnumFacing[EnumNeighborInfo.lIlIllIlIIlIll[1]];
            lllllllllllllIIIIllIlIllllIIIIlI6[EnumNeighborInfo.lIlIllIlIIlIll[0]] = EnumFacing.DOWN;
            lllllllllllllIIIIllIlIllllIIIIlI6[EnumNeighborInfo.lIlIllIlIIlIll[2]] = EnumFacing.UP;
            lllllllllllllIIIIllIlIllllIIIIlI6[EnumNeighborInfo.lIlIllIlIIlIll[3]] = EnumFacing.NORTH;
            lllllllllllllIIIIllIlIllllIIIIlI6[EnumNeighborInfo.lIlIllIlIIlIll[4]] = EnumFacing.SOUTH;
            final float lllllllllllllIIIIllIlIllllIIIIIl4 = 0.6f;
            final int lllllllllllllIIIIllIlIllllIIlIlI4 = EnumNeighborInfo.lIlIllIlIIlIll[2];
            final Orientation[] lllllllllllllIIIIllIlIlllIllllll4 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.SOUTH;
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIlllIllllll4[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.SOUTH;
            final Orientation[] lllllllllllllIIIIllIlIllllIIlIII4 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.NORTH;
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_DOWN;
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.DOWN;
            lllllllllllllIIIIllIlIllllIIlIII4[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.NORTH;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllIl4 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.NORTH;
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_NORTH;
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllIl4[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.NORTH;
            final Orientation[] lllllllllllllIIIIllIlIlllIllllII4 = new Orientation[EnumNeighborInfo.lIlIllIlIIlIll[5]];
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[0]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[2]] = Orientation.SOUTH;
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[3]] = Orientation.FLIP_UP;
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[4]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[1]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[6]] = Orientation.FLIP_SOUTH;
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[7]] = Orientation.UP;
            lllllllllllllIIIIllIlIlllIllllII4[EnumNeighborInfo.lIlIllIlIIlIll[8]] = Orientation.SOUTH;
            final EnumNeighborInfo[] enum$VALUES = new EnumNeighborInfo[EnumNeighborInfo.lIlIllIlIIlIll[7]];
            enum$VALUES[EnumNeighborInfo.lIlIllIlIIlIll[0]] = EnumNeighborInfo.DOWN;
            enum$VALUES[EnumNeighborInfo.lIlIllIlIIlIll[2]] = EnumNeighborInfo.UP;
            enum$VALUES[EnumNeighborInfo.lIlIllIlIIlIll[3]] = EnumNeighborInfo.NORTH;
            enum$VALUES[EnumNeighborInfo.lIlIllIlIIlIll[4]] = EnumNeighborInfo.SOUTH;
            enum$VALUES[EnumNeighborInfo.lIlIllIlIIlIll[1]] = EnumNeighborInfo.WEST;
            enum$VALUES[EnumNeighborInfo.lIlIllIlIIlIll[6]] = EnumNeighborInfo.EAST;
            ENUM$VALUES = enum$VALUES;
            (field_178282_n = new EnumNeighborInfo[EnumNeighborInfo.lIlIllIlIIlIll[7]])[EnumFacing.DOWN.getIndex()] = EnumNeighborInfo.DOWN;
            EnumNeighborInfo.field_178282_n[EnumFacing.UP.getIndex()] = EnumNeighborInfo.UP;
            EnumNeighborInfo.field_178282_n[EnumFacing.NORTH.getIndex()] = EnumNeighborInfo.NORTH;
            EnumNeighborInfo.field_178282_n[EnumFacing.SOUTH.getIndex()] = EnumNeighborInfo.SOUTH;
            EnumNeighborInfo.field_178282_n[EnumFacing.WEST.getIndex()] = EnumNeighborInfo.WEST;
            EnumNeighborInfo.field_178282_n[EnumFacing.EAST.getIndex()] = EnumNeighborInfo.EAST;
        }
        
        private static boolean llllIIIllIlIlII(final int lllllllllllllIIIIllIlIllIlllllII, final int lllllllllllllIIIIllIlIllIllllIll) {
            return lllllllllllllIIIIllIlIllIlllllII < lllllllllllllIIIIllIlIllIllllIll;
        }
        
        private static String llllIIIllIIIlll(String lllllllllllllIIIIllIlIlllIIIIlll, final String lllllllllllllIIIIllIlIlllIIIlIll) {
            lllllllllllllIIIIllIlIlllIIIIlll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIlIlllIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIllIlIlllIIIlIlI = new StringBuilder();
            final char[] lllllllllllllIIIIllIlIlllIIIlIIl = lllllllllllllIIIIllIlIlllIIIlIll.toCharArray();
            int lllllllllllllIIIIllIlIlllIIIlIII = EnumNeighborInfo.lIlIllIlIIlIll[0];
            final boolean lllllllllllllIIIIllIlIlllIIIIIlI = (Object)((String)lllllllllllllIIIIllIlIlllIIIIlll).toCharArray();
            final double lllllllllllllIIIIllIlIlllIIIIIIl = lllllllllllllIIIIllIlIlllIIIIIlI.length;
            float lllllllllllllIIIIllIlIlllIIIIIII = EnumNeighborInfo.lIlIllIlIIlIll[0];
            while (llllIIIllIlIlII((int)lllllllllllllIIIIllIlIlllIIIIIII, (int)lllllllllllllIIIIllIlIlllIIIIIIl)) {
                final char lllllllllllllIIIIllIlIlllIIIllIl = lllllllllllllIIIIllIlIlllIIIIIlI[lllllllllllllIIIIllIlIlllIIIIIII];
                lllllllllllllIIIIllIlIlllIIIlIlI.append((char)(lllllllllllllIIIIllIlIlllIIIllIl ^ lllllllllllllIIIIllIlIlllIIIlIIl[lllllllllllllIIIIllIlIlllIIIlIII % lllllllllllllIIIIllIlIlllIIIlIIl.length]));
                "".length();
                ++lllllllllllllIIIIllIlIlllIIIlIII;
                ++lllllllllllllIIIIllIlIlllIIIIIII;
                "".length();
                if (-(0xEB ^ 0x87 ^ (0xAE ^ 0xC7)) >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIllIlIlllIIIlIlI);
        }
        
        private static void llllIIIllIIlIlI() {
            (lIlIllIlIIlIII = new String[EnumNeighborInfo.lIlIllIlIIlIll[7]])[EnumNeighborInfo.lIlIllIlIIlIll[0]] = llllIIIllIIIlll("MAk5Nw==", "tFnyk");
            EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[2]] = llllIIIllIIIlll("MQM=", "dSBJA");
            EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[3]] = llllIIIllIIlIII("Wmsj2f3v+Pg=", "ELtPX");
            EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[4]] = llllIIIllIIIlll("BwM0Nzk=", "TLacq");
            EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[1]] = llllIIIllIIIlll("PTwDJw==", "jyPsY");
            EnumNeighborInfo.lIlIllIlIIlIII[EnumNeighborInfo.lIlIllIlIIlIll[6]] = llllIIIllIIlIIl("SokIYeokQtA=", "pnJBS");
        }
        
        private EnumNeighborInfo(final String lllllllllllllIIIIllIlIllllIIIlII, final int lllllllllllllIIIIllIlIllllIIIIll, final EnumFacing[] lllllllllllllIIIIllIlIllllIIIIlI, final float lllllllllllllIIIIllIlIllllIIIIIl, final boolean lllllllllllllIIIIllIlIllllIIlIlI, final Orientation[] lllllllllllllIIIIllIlIlllIllllll, final Orientation[] lllllllllllllIIIIllIlIllllIIlIII, final Orientation[] lllllllllllllIIIIllIlIlllIllllIl, final Orientation[] lllllllllllllIIIIllIlIlllIllllII) {
            this.field_178276_g = lllllllllllllIIIIllIlIllllIIIIlI;
            this.field_178288_h = lllllllllllllIIIIllIlIllllIIIIIl;
            this.field_178289_i = lllllllllllllIIIIllIlIllllIIlIlI;
            this.field_178286_j = lllllllllllllIIIIllIlIlllIllllll;
            this.field_178287_k = lllllllllllllIIIIllIlIllllIIlIII;
            this.field_178284_l = lllllllllllllIIIIllIlIlllIllllIl;
            this.field_178285_m = lllllllllllllIIIIllIlIlllIllllII;
        }
        
        private static void llllIIIllIlIIll() {
            (lIlIllIlIIlIll = new int[9])[0] = ((0xC6 ^ 0xC3) & ~(0x36 ^ 0x33));
            EnumNeighborInfo.lIlIllIlIIlIll[1] = (0xC7 ^ 0xC3);
            EnumNeighborInfo.lIlIllIlIIlIll[2] = " ".length();
            EnumNeighborInfo.lIlIllIlIIlIll[3] = "  ".length();
            EnumNeighborInfo.lIlIllIlIIlIll[4] = "   ".length();
            EnumNeighborInfo.lIlIllIlIIlIll[5] = (115 + 2 - 112 + 146 ^ 75 + 145 - 201 + 140);
            EnumNeighborInfo.lIlIllIlIIlIll[6] = (" ".length() ^ (0xC7 ^ 0xC3));
            EnumNeighborInfo.lIlIllIlIIlIll[7] = (0x9F ^ 0x99);
            EnumNeighborInfo.lIlIllIlIIlIll[8] = (0x65 ^ 0x62);
        }
        
        private static String llllIIIllIIlIIl(final String lllllllllllllIIIIllIlIlllIIlllII, final String lllllllllllllIIIIllIlIlllIIllIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIllIlIlllIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIlllIIllIIl.getBytes(StandardCharsets.UTF_8)), EnumNeighborInfo.lIlIllIlIIlIll[5]), "DES");
                final Cipher lllllllllllllIIIIllIlIlllIIllllI = Cipher.getInstance("DES");
                lllllllllllllIIIIllIlIlllIIllllI.init(EnumNeighborInfo.lIlIllIlIIlIll[3], lllllllllllllIIIIllIlIlllIIlllll);
                return new String(lllllllllllllIIIIllIlIlllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIlllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIllIlIlllIIlllIl) {
                lllllllllllllIIIIllIlIlllIIlllIl.printStackTrace();
                return null;
            }
        }
        
        private static String llllIIIllIIlIII(final String lllllllllllllIIIIllIlIlllIlIIlll, final String lllllllllllllIIIIllIlIlllIlIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIIIllIlIlllIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIlllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIllIlIlllIlIlIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIllIlIlllIlIlIll.init(EnumNeighborInfo.lIlIllIlIIlIll[3], lllllllllllllIIIIllIlIlllIlIllII);
                return new String(lllllllllllllIIIIllIlIlllIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIlllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIllIlIlllIlIlIlI) {
                lllllllllllllIIIIllIlIlllIlIlIlI.printStackTrace();
                return null;
            }
        }
        
        public static EnumNeighborInfo getNeighbourInfo(final EnumFacing lllllllllllllIIIIllIlIlllIlllIlI) {
            return EnumNeighborInfo.field_178282_n[lllllllllllllIIIIllIlIlllIlllIlI.getIndex()];
        }
    }
}
