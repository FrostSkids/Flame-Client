// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.imageout;

import java.io.IOException;
import org.newdawn.slick.Color;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import org.newdawn.slick.Image;

public class TGAWriter implements ImageWriter
{
    private static final /* synthetic */ int[] llIlIIIllIIIll;
    
    private static boolean lIIlIIlIIIIIlllI(final int llllllllllllIllIllIIllIIlllIIllI) {
        return llllllllllllIllIllIIllIIlllIIllI <= 0;
    }
    
    static {
        lIIlIIlIIIIIllII();
    }
    
    private static boolean lIIlIIlIIIIIllIl(final int llllllllllllIllIllIIllIIlllIlIII) {
        return llllllllllllIllIllIIllIIlllIlIII != 0;
    }
    
    private static short flipEndian(final short llllllllllllIllIllIIllIlIIIIlIII) {
        final int llllllllllllIllIllIIllIlIIIIIlll = llllllllllllIllIllIIllIlIIIIlIII & TGAWriter.llIlIIIllIIIll[0];
        return (short)(llllllllllllIllIllIIllIlIIIIIlll << TGAWriter.llIlIIIllIIIll[1] | (llllllllllllIllIllIIllIlIIIIIlll & TGAWriter.llIlIIIllIIIll[2]) >>> TGAWriter.llIlIIIllIIIll[1]);
    }
    
    private static void lIIlIIlIIIIIllII() {
        (llIlIIIllIIIll = new int[8])[0] = (-" ".length() & (-1 & 0xFFFF));
        TGAWriter.llIlIIIllIIIll[1] = (0x7D ^ 0x75);
        TGAWriter.llIlIIIllIIIll[2] = (-(182 + 116 - 293 + 212) & (0xFFFFFFFB & 0xFFDC));
        TGAWriter.llIlIIIllIIIll[3] = ((0xFC ^ 0xA6) & ~(0x68 ^ 0x32));
        TGAWriter.llIlIIIllIIIll[4] = "  ".length();
        TGAWriter.llIlIIIllIIIll[5] = (0xE3 ^ 0xAF ^ (0x6B ^ 0x7));
        TGAWriter.llIlIIIllIIIll[6] = " ".length();
        TGAWriter.llIlIIIllIIIll[7] = (0xA5 ^ 0xC7 ^ (0xF2 ^ 0x88));
    }
    
    private static boolean lIIlIIlIIIIIllll(final int llllllllllllIllIllIIllIIlllIlIll, final int llllllllllllIllIllIIllIIlllIlIlI) {
        return llllllllllllIllIllIIllIIlllIlIll < llllllllllllIllIllIIllIIlllIlIlI;
    }
    
    public void saveImage(final Image llllllllllllIllIllIIllIIlllllIIl, final String llllllllllllIllIllIIllIIlllllIII, final OutputStream llllllllllllIllIllIIllIIllllIIll, final boolean llllllllllllIllIllIIllIIllllIllI) throws IOException {
        final DataOutputStream llllllllllllIllIllIIllIIllllIlIl = new DataOutputStream(new BufferedOutputStream(llllllllllllIllIllIIllIIllllIIll));
        llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[3]);
        llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[3]);
        llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[4]);
        llllllllllllIllIllIIllIIllllIlIl.writeShort(flipEndian((short)TGAWriter.llIlIIIllIIIll[3]));
        llllllllllllIllIllIIllIIllllIlIl.writeShort(flipEndian((short)TGAWriter.llIlIIIllIIIll[3]));
        llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[3]);
        llllllllllllIllIllIIllIIllllIlIl.writeShort(flipEndian((short)TGAWriter.llIlIIIllIIIll[3]));
        llllllllllllIllIllIIllIIllllIlIl.writeShort(flipEndian((short)TGAWriter.llIlIIIllIIIll[3]));
        llllllllllllIllIllIIllIIllllIlIl.writeShort(flipEndian((short)llllllllllllIllIllIIllIIlllllIIl.getWidth()));
        llllllllllllIllIllIIllIIllllIlIl.writeShort(flipEndian((short)llllllllllllIllIllIIllIIlllllIIl.getHeight()));
        if (lIIlIIlIIIIIllIl(llllllllllllIllIllIIllIIllllIllI ? 1 : 0)) {
            llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[5]);
            llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[6]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[7]);
            llllllllllllIllIllIIllIIllllIlIl.writeByte(TGAWriter.llIlIIIllIIIll[3]);
        }
        int llllllllllllIllIllIIllIIlllllIll = llllllllllllIllIllIIllIIlllllIIl.getHeight() - TGAWriter.llIlIIIllIIIll[6];
        while (lIIlIIlIIIIIlllI(llllllllllllIllIllIIllIIlllllIll)) {
            int llllllllllllIllIllIIllIIllllllII = TGAWriter.llIlIIIllIIIll[3];
            while (lIIlIIlIIIIIllll(llllllllllllIllIllIIllIIllllllII, llllllllllllIllIllIIllIIlllllIIl.getWidth())) {
                final Color llllllllllllIllIllIIllIIllllllIl = llllllllllllIllIllIIllIIlllllIIl.getColor(llllllllllllIllIllIIllIIllllllII, llllllllllllIllIllIIllIIlllllIll);
                llllllllllllIllIllIIllIIllllIlIl.writeByte((byte)(llllllllllllIllIllIIllIIllllllIl.b * 255.0f));
                llllllllllllIllIllIIllIIllllIlIl.writeByte((byte)(llllllllllllIllIllIIllIIllllllIl.g * 255.0f));
                llllllllllllIllIllIIllIIllllIlIl.writeByte((byte)(llllllllllllIllIllIIllIIllllllIl.r * 255.0f));
                if (lIIlIIlIIIIIllIl(llllllllllllIllIllIIllIIllllIllI ? 1 : 0)) {
                    llllllllllllIllIllIIllIIllllIlIl.writeByte((byte)(llllllllllllIllIllIIllIIllllllIl.a * 255.0f));
                }
                ++llllllllllllIllIllIIllIIllllllII;
                "".length();
                if ((0x9E ^ 0x9A) < ((0x21 ^ 0x30) & ~(0xD7 ^ 0xC6))) {
                    return;
                }
            }
            --llllllllllllIllIllIIllIIlllllIll;
            "".length();
            if (((0x96 ^ 0x8A ^ (0xB6 ^ 0xA6)) & (132 + 105 - 126 + 41 ^ 45 + 113 - 12 + 2 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        llllllllllllIllIllIIllIIllllIlIl.close();
    }
}
