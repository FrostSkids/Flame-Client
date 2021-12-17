// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataOutput;
import java.io.OutputStream;

public class ByteBufOutputStream extends OutputStream implements DataOutput
{
    private final /* synthetic */ int startIndex;
    private final /* synthetic */ ByteBuf buffer;
    private static final /* synthetic */ int[] llIllIIIllllIl;
    private final /* synthetic */ DataOutputStream utf8out;
    private static final /* synthetic */ String[] llIllIIIlIIlII;
    
    private static boolean lIIlIllIlIlIIIlI(final int llllllllllllIllIIllllllllIIlIIlI) {
        return llllllllllllIllIIllllllllIIlIIlI != 0;
    }
    
    private static boolean lIIlIllIlIlIIIIl(final int llllllllllllIllIIllllllllIIlIIII) {
        return llllllllllllIllIIllllllllIIlIIII == 0;
    }
    
    @Override
    public void writeLong(final long llllllllllllIllIIlllllllllIIIIll) throws IOException {
        this.buffer.writeLong(llllllllllllIllIIlllllllllIIIIll);
        "".length();
    }
    
    public ByteBufOutputStream(final ByteBuf llllllllllllIllIlIIIIIIIIIIllllI) {
        this.utf8out = new DataOutputStream(this);
        if (lIIlIllIlIlIIIII(llllllllllllIllIlIIIIIIIIIIllllI)) {
            throw new NullPointerException(ByteBufOutputStream.llIllIIIlIIlII[ByteBufOutputStream.llIllIIIllllIl[0]]);
        }
        this.buffer = llllllllllllIllIlIIIIIIIIIIllllI;
        this.startIndex = llllllllllllIllIlIIIIIIIIIIllllI.writerIndex();
    }
    
    public ByteBuf buffer() {
        return this.buffer;
    }
    
    @Override
    public void writeChars(final String llllllllllllIllIIlllllllllIllIll) throws IOException {
        final int llllllllllllIllIIlllllllllIlllIl = llllllllllllIllIIlllllllllIllIll.length();
        int llllllllllllIllIIllllllllllIIIII = ByteBufOutputStream.llIllIIIllllIl[0];
        while (lIIlIllIlIlIIIll(llllllllllllIllIIllllllllllIIIII, llllllllllllIllIIlllllllllIlllIl)) {
            this.writeChar(llllllllllllIllIIlllllllllIllIll.charAt(llllllllllllIllIIllllllllllIIIII));
            ++llllllllllllIllIIllllllllllIIIII;
            "".length();
            if (((0x1F ^ 0x7C) & ~(0x74 ^ 0x17)) >= "   ".length()) {
                return;
            }
        }
    }
    
    private static boolean lIIlIllIlIlIIIII(final Object llllllllllllIllIIllllllllIIlIlII) {
        return llllllllllllIllIIllllllllIIlIlII == null;
    }
    
    @Override
    public void writeDouble(final double llllllllllllIllIIlllllllllIlIlIl) throws IOException {
        this.writeLong(Double.doubleToLongBits(llllllllllllIllIIlllllllllIlIlIl));
    }
    
    @Override
    public void writeByte(final int llllllllllllIllIIllllllllllllIIl) throws IOException {
        this.write(llllllllllllIllIIllllllllllllIIl);
    }
    
    @Override
    public void writeBoolean(final boolean llllllllllllIllIIlllllllllllllIl) throws IOException {
        int llllllllllllIllIlIIIIIIIIIIIIlIl;
        if (lIIlIllIlIlIIIlI(llllllllllllIllIIlllllllllllllIl ? 1 : 0)) {
            llllllllllllIllIlIIIIIIIIIIIIlIl = ByteBufOutputStream.llIllIIIllllIl[1];
            "".length();
            if (-(0x70 ^ 0x74) > 0) {
                return;
            }
        }
        else {
            llllllllllllIllIlIIIIIIIIIIIIlIl = ByteBufOutputStream.llIllIIIllllIl[0];
        }
        this.write(llllllllllllIllIlIIIIIIIIIIIIlIl);
    }
    
    private static boolean lIIlIllIlIlIIIll(final int llllllllllllIllIIllllllllIIlIlll, final int llllllllllllIllIIllllllllIIlIllI) {
        return llllllllllllIllIIllllllllIIlIlll < llllllllllllIllIIllllllllIIlIllI;
    }
    
    @Override
    public void write(final byte[] llllllllllllIllIlIIIIIIIIIIlIlIl, final int llllllllllllIllIlIIIIIIIIIIlIlII, final int llllllllllllIllIlIIIIIIIIIIIllll) throws IOException {
        if (lIIlIllIlIlIIIIl(llllllllllllIllIlIIIIIIIIIIIllll)) {
            return;
        }
        this.buffer.writeBytes(llllllllllllIllIlIIIIIIIIIIlIlIl, llllllllllllIllIlIIIIIIIIIIlIlII, llllllllllllIllIlIIIIIIIIIIIllll);
        "".length();
    }
    
    @Override
    public void write(final int llllllllllllIllIlIIIIIIIIIIIIlIl) throws IOException {
        this.buffer.writeByte((byte)llllllllllllIllIlIIIIIIIIIIIIlIl);
        "".length();
    }
    
    @Override
    public void writeChar(final int llllllllllllIllIIllllllllllIIlIl) throws IOException {
        this.writeShort((short)llllllllllllIllIIllllllllllIIlIl);
    }
    
    public int writtenBytes() {
        return this.buffer.writerIndex() - this.startIndex;
    }
    
    @Override
    public void writeShort(final int llllllllllllIllIIllllllllIlllIll) throws IOException {
        this.buffer.writeShort((short)llllllllllllIllIIllllllllIlllIll);
        "".length();
    }
    
    @Override
    public void writeFloat(final float llllllllllllIllIIlllllllllIIllll) throws IOException {
        this.writeInt(Float.floatToIntBits(llllllllllllIllIIlllllllllIIllll));
    }
    
    @Override
    public void write(final byte[] llllllllllllIllIlIIIIIIIIIIIlIll) throws IOException {
        this.buffer.writeBytes(llllllllllllIllIlIIIIIIIIIIIlIll);
        "".length();
    }
    
    private static String lIIlIllIIlllIlll(String llllllllllllIllIIllllllllIlIIIlI, final String llllllllllllIllIIllllllllIlIIllI) {
        llllllllllllIllIIllllllllIlIIIlI = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllllllllIlIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllllllllIlIIlIl = new StringBuilder();
        final char[] llllllllllllIllIIllllllllIlIIlII = llllllllllllIllIIllllllllIlIIllI.toCharArray();
        int llllllllllllIllIIllllllllIlIIIll = ByteBufOutputStream.llIllIIIllllIl[0];
        final short llllllllllllIllIIllllllllIIlllIl = (Object)((String)llllllllllllIllIIllllllllIlIIIlI).toCharArray();
        final byte llllllllllllIllIIllllllllIIlllII = (byte)llllllllllllIllIIllllllllIIlllIl.length;
        char llllllllllllIllIIllllllllIIllIll = (char)ByteBufOutputStream.llIllIIIllllIl[0];
        while (lIIlIllIlIlIIIll(llllllllllllIllIIllllllllIIllIll, llllllllllllIllIIllllllllIIlllII)) {
            final char llllllllllllIllIIllllllllIlIlIII = llllllllllllIllIIllllllllIIlllIl[llllllllllllIllIIllllllllIIllIll];
            llllllllllllIllIIllllllllIlIIlIl.append((char)(llllllllllllIllIIllllllllIlIlIII ^ llllllllllllIllIIllllllllIlIIlII[llllllllllllIllIIllllllllIlIIIll % llllllllllllIllIIllllllllIlIIlII.length]));
            "".length();
            ++llllllllllllIllIIllllllllIlIIIll;
            ++llllllllllllIllIIllllllllIIllIll;
            "".length();
            if ((0x76 ^ 0x72) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllllllllIlIIlIl);
    }
    
    static {
        lIIlIllIlIIlllll();
        lIIlIllIIllllIII();
    }
    
    private static void lIIlIllIlIIlllll() {
        (llIllIIIllllIl = new int[2])[0] = ((0x65 ^ 0x5F) & ~(0xA0 ^ 0x9A));
        ByteBufOutputStream.llIllIIIllllIl[1] = " ".length();
    }
    
    @Override
    public void writeUTF(final String llllllllllllIllIIllllllllIllIlll) throws IOException {
        this.utf8out.writeUTF(llllllllllllIllIIllllllllIllIlll);
    }
    
    private static void lIIlIllIIllllIII() {
        (llIllIIIlIIlII = new String[ByteBufOutputStream.llIllIIIllllIl[1]])[ByteBufOutputStream.llIllIIIllllIl[0]] = lIIlIllIIlllIlll("BAYzPhIU", "fsUXw");
    }
    
    @Override
    public void writeInt(final int llllllllllllIllIIlllllllllIIIlll) throws IOException {
        this.buffer.writeInt(llllllllllllIllIIlllllllllIIIlll);
        "".length();
    }
    
    @Override
    public void writeBytes(final String llllllllllllIllIIlllllllllllIIII) throws IOException {
        final int llllllllllllIllIIllllllllllIllll = llllllllllllIllIIlllllllllllIIII.length();
        int llllllllllllIllIIlllllllllllIIlI = ByteBufOutputStream.llIllIIIllllIl[0];
        while (lIIlIllIlIlIIIll(llllllllllllIllIIlllllllllllIIlI, llllllllllllIllIIllllllllllIllll)) {
            this.write((byte)llllllllllllIllIIlllllllllllIIII.charAt(llllllllllllIllIIlllllllllllIIlI));
            ++llllllllllllIllIIlllllllllllIIlI;
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
    }
}
