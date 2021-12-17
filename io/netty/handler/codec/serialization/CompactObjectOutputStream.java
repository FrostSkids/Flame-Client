// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.io.OutputStream;
import java.io.IOException;
import java.io.ObjectStreamClass;
import java.io.ObjectOutputStream;

class CompactObjectOutputStream extends ObjectOutputStream
{
    private static final /* synthetic */ int[] lIllIllIIIIIlI;
    
    @Override
    protected void writeClassDescriptor(final ObjectStreamClass llllllllllllIlllllllIllIIlIllllI) throws IOException {
        final Class<?> llllllllllllIlllllllIllIIlIlllIl = llllllllllllIlllllllIllIIlIllllI.forClass();
        if (!lllllllIllIIIlI(llllllllllllIlllllllIllIIlIlllIl.isPrimitive() ? 1 : 0) || !lllllllIllIIIlI(llllllllllllIlllllllIllIIlIlllIl.isArray() ? 1 : 0) || !lllllllIllIIIlI(llllllllllllIlllllllIllIIlIlllIl.isInterface() ? 1 : 0) || lllllllIllIIIlI(lllllllIllIIIIl(llllllllllllIlllllllIllIIlIllllI.getSerialVersionUID(), 0L))) {
            this.write(CompactObjectOutputStream.lIllIllIIIIIlI[1]);
            super.writeClassDescriptor(llllllllllllIlllllllIllIIlIllllI);
            "".length();
            if (((0x54 ^ 0x65) & ~(0x96 ^ 0xA7)) != 0x0) {
                return;
            }
        }
        else {
            this.write(CompactObjectOutputStream.lIllIllIIIIIlI[2]);
            this.writeUTF(llllllllllllIlllllllIllIIlIllllI.getName());
        }
    }
    
    private static int lllllllIllIIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    CompactObjectOutputStream(final OutputStream llllllllllllIlllllllIllIIllIlIII) throws IOException {
        super(llllllllllllIlllllllIllIIllIlIII);
    }
    
    @Override
    protected void writeStreamHeader() throws IOException {
        this.writeByte(CompactObjectOutputStream.lIllIllIIIIIlI[0]);
    }
    
    private static void lllllllIllIIIII() {
        (lIllIllIIIIIlI = new int[3])[0] = (0x13 ^ 0x66 ^ (0xE5 ^ 0x95));
        CompactObjectOutputStream.lIllIllIIIIIlI[1] = ((0x41 ^ 0x5 ^ (0x2C ^ 0x73)) & (0xD ^ 0x57 ^ (0x59 ^ 0x18) ^ -" ".length()));
        CompactObjectOutputStream.lIllIllIIIIIlI[2] = " ".length();
    }
    
    private static boolean lllllllIllIIIlI(final int llllllllllllIlllllllIllIIlIllIII) {
        return llllllllllllIlllllllIllIIlIllIII == 0;
    }
    
    static {
        lllllllIllIIIII();
        TYPE_THIN_DESCRIPTOR = CompactObjectOutputStream.lIllIllIIIIIlI[2];
        TYPE_FAT_DESCRIPTOR = CompactObjectOutputStream.lIllIllIIIIIlI[1];
    }
}
