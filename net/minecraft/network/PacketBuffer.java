// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import java.io.InputStream;
import java.util.Arrays;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.google.common.base.Charsets;
import io.netty.handler.codec.DecoderException;
import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.codec.EncoderException;
import java.io.DataOutput;
import io.netty.buffer.ByteBufOutputStream;
import java.io.OutputStream;
import net.minecraft.util.IChatComponent;
import java.io.DataInput;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTSizeTracker;
import io.netty.buffer.ByteBufInputStream;
import net.minecraft.nbt.NBTTagCompound;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.util.UUID;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteOrder;
import io.netty.util.ReferenceCounted;
import java.nio.charset.Charset;
import net.minecraft.util.BlockPos;
import io.netty.buffer.ByteBufProcessor;
import io.netty.buffer.ByteBuf;

public class PacketBuffer extends ByteBuf
{
    private static final /* synthetic */ int[] lllIlIllIlIIlI;
    private final /* synthetic */ ByteBuf buf;
    private static final /* synthetic */ String[] lllIlIllIIllll;
    
    @Override
    public ByteBuf setShort(final int llllllllllllIlIllIlIlIllIlIllIll, final int llllllllllllIlIllIlIlIllIlIllIlI) {
        return this.buf.setShort(llllllllllllIlIllIlIlIllIlIllIll, llllllllllllIlIllIlIlIllIlIllIlI);
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor llllllllllllIlIllIlIlIIlIlIIlIIl) {
        return this.buf.forEachByteDesc(llllllllllllIlIllIlIlIIlIlIIlIIl);
    }
    
    public int readVarIntFromBuffer() {
        int llllllllllllIlIllIlIllIIlllllIll = PacketBuffer.lllIlIllIlIIlI[5];
        int llllllllllllIlIllIlIllIIlllllIlI = PacketBuffer.lllIlIllIlIIlI[5];
        byte llllllllllllIlIllIlIllIIlllllIIl;
        do {
            llllllllllllIlIllIlIllIIlllllIIl = this.readByte();
            llllllllllllIlIllIlIllIIlllllIll |= (llllllllllllIlIllIlIllIIlllllIIl & PacketBuffer.lllIlIllIlIIlI[6]) << llllllllllllIlIllIlIllIIlllllIlI++ * PacketBuffer.lllIlIllIlIIlI[2];
            if (lIlIIIllIlIIlIII(llllllllllllIlIllIlIllIIlllllIlI, PacketBuffer.lllIlIllIlIIlI[3])) {
                throw new RuntimeException(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[5]]);
            }
        } while (!lIlIIIllIlIIlIIl(llllllllllllIlIllIlIllIIlllllIIl & PacketBuffer.lllIlIllIlIIlI[7], PacketBuffer.lllIlIllIlIIlI[7]));
        return llllllllllllIlIllIlIllIIlllllIll;
    }
    
    public void writeBlockPos(final BlockPos llllllllllllIlIllIlIllIlIIIlIllI) {
        this.writeLong(llllllllllllIlIllIlIllIlIIIlIllI.toLong());
        "".length();
    }
    
    @Override
    public String toString(final int llllllllllllIlIllIlIlIIIlIIllIII, final int llllllllllllIlIllIlIlIIIlIIlIIII, final Charset llllllllllllIlIllIlIlIIIlIIlIlIl) {
        return this.buf.toString(llllllllllllIlIllIlIlIIIlIIllIII, llllllllllllIlIllIlIlIIIlIIlIIII, llllllllllllIlIllIlIlIIIlIIlIlIl);
    }
    
    @Override
    public ByteBuf writeChar(final int llllllllllllIlIllIlIlIlIIIIlIIll) {
        return this.buf.writeChar(llllllllllllIlIllIlIlIlIIIIlIIll);
    }
    
    public void writeVarLong(long llllllllllllIlIllIlIllIIllIlIlII) {
        "".length();
        if (-" ".length() > "   ".length()) {
            return;
        }
        while (!lIlIIIllIlIIIlII(lIlIIIllIlIIlIlI((long)(llllllllllllIlIllIlIllIIllIlIlII & 0xFFFFFFFFFFFFFF80L), 0L))) {
            this.writeByte((int)(llllllllllllIlIllIlIllIIllIlIlII & 0x7FL) | PacketBuffer.lllIlIllIlIIlI[7]);
            "".length();
            llllllllllllIlIllIlIllIIllIlIlII >>>= PacketBuffer.lllIlIllIlIIlI[2];
        }
        this.writeByte((int)llllllllllllIlIllIlIllIIllIlIlII);
        "".length();
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIllIlIlIlllIllllII, final ByteBuf llllllllllllIlIllIlIlIlllIllllll, final int llllllllllllIlIllIlIlIlllIlllllI) {
        return this.buf.getBytes(llllllllllllIlIllIlIlIlllIllllII, llllllllllllIlIllIlIlIlllIllllll, llllllllllllIlIllIlIlIlllIlllllI);
    }
    
    @Override
    public ByteBuf writeShort(final int llllllllllllIlIllIlIlIlIIIlIllIl) {
        return this.buf.writeShort(llllllllllllIlIllIlIlIlIIIlIllIl);
    }
    
    public static int getVarIntSize(final int llllllllllllIlIllIlIllIlIIlIlllI) {
        int llllllllllllIlIllIlIllIlIIlIllIl = PacketBuffer.lllIlIllIlIIlI[0];
        "".length();
        if ("  ".length() == 0) {
            return (0x4D ^ 0x1D) & ~(0x58 ^ 0x8);
        }
        while (!lIlIIIllIlIIIlIl(llllllllllllIlIllIlIllIlIIlIllIl, PacketBuffer.lllIlIllIlIIlI[3])) {
            if (lIlIIIllIlIIIlII(llllllllllllIlIllIlIllIlIIlIlllI & PacketBuffer.lllIlIllIlIIlI[1] << llllllllllllIlIllIlIllIlIIlIllIl * PacketBuffer.lllIlIllIlIIlI[2])) {
                return llllllllllllIlIllIlIllIlIIlIllIl;
            }
            ++llllllllllllIlIllIlIllIlIIlIllIl;
        }
        return PacketBuffer.lllIlIllIlIIlI[3];
    }
    
    @Override
    public boolean readBoolean() {
        return this.buf.readBoolean();
    }
    
    @Override
    public long readUnsignedInt() {
        return this.buf.readUnsignedInt();
    }
    
    @Override
    public int readMedium() {
        return this.buf.readMedium();
    }
    
    private static void lIlIIIllIlIIIIll() {
        (lllIlIllIlIIlI = new int[18])[0] = " ".length();
        PacketBuffer.lllIlIllIlIIlI[1] = -" ".length();
        PacketBuffer.lllIlIllIlIIlI[2] = (0xB0 ^ 0xB7);
        PacketBuffer.lllIlIllIlIIlI[3] = (18 + 80 - 53 + 82 ^ (0x7 ^ 0x7D));
        PacketBuffer.lllIlIllIlIIlI[4] = (-1 & 0x7FFF);
        PacketBuffer.lllIlIllIlIIlI[5] = ((0x1A ^ 0x24) & ~(0xBA ^ 0x84));
        PacketBuffer.lllIlIllIlIIlI[6] = (0x31 ^ 0x5C) + (0x45 ^ 0x5C) - (0xF5 ^ 0xC0) + (0x49 ^ 0x67);
        PacketBuffer.lllIlIllIlIIlI[7] = (0x6F ^ 0x61) + (0xF0 ^ 0x8C) - (0x1 ^ 0x45) + (0x64 ^ 0x5E);
        PacketBuffer.lllIlIllIlIIlI[8] = (0x2E ^ 0x24);
        PacketBuffer.lllIlIllIlIIlI[9] = -((0xDF ^ 0xC1) + (0xB ^ 0x23) - -(0x77 ^ 0x73) + (0x61 ^ 0x57));
        PacketBuffer.lllIlIllIlIIlI[10] = (0x23 ^ 0x27);
        PacketBuffer.lllIlIllIlIIlI[11] = "  ".length();
        PacketBuffer.lllIlIllIlIIlI[12] = "   ".length();
        PacketBuffer.lllIlIllIlIIlI[13] = (0xB8 ^ 0xBE);
        PacketBuffer.lllIlIllIlIIlI[14] = (0xAB ^ 0xB2 ^ (0x3B ^ 0x2A));
        PacketBuffer.lllIlIllIlIIlI[15] = (0x2B ^ 0x4A ^ (0xC5 ^ 0xAD));
        PacketBuffer.lllIlIllIlIIlI[16] = (0x45 ^ 0x4E);
        PacketBuffer.lllIlIllIlIIlI[17] = (0x2 ^ 0xE);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIlIllIlIlIIllllIIIII, final int llllllllllllIlIllIlIlIIlllIlllll, final int llllllllllllIlIllIlIlIIlllIllIlI) {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIIllllIIIII, llllllllllllIlIllIlIlIIlllIlllll, llllllllllllIlIllIlIlIIlllIllIlI);
    }
    
    @Override
    public int writerIndex() {
        return this.buf.writerIndex();
    }
    
    @Override
    public ByteBuf writeFloat(final float llllllllllllIlIllIlIlIlIIIIIllIl) {
        return this.buf.writeFloat(llllllllllllIlIllIlIlIlIIIIIllIl);
    }
    
    @Override
    public ByteBuf order(final ByteOrder llllllllllllIlIllIlIllIIIlllllIl) {
        return this.buf.order(llllllllllllIlIllIlIllIIIlllllIl);
    }
    
    @Override
    public int arrayOffset() {
        return this.buf.arrayOffset();
    }
    
    private static String lIlIIIllIIlllIlI(final String llllllllllllIlIllIlIlIIIIIIlllIl, final String llllllllllllIlIllIlIlIIIIIIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIlIIIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIlIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIlIIIIIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIlIIIIIIlllll.init(PacketBuffer.lllIlIllIlIIlI[11], llllllllllllIlIllIlIlIIIIIlIIIII);
            return new String(llllllllllllIlIllIlIlIIIIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIlIIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIlIIIIIIllllI) {
            llllllllllllIlIllIlIlIIIIIIllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIllIlIlIlIlllllIII, final byte[] llllllllllllIlIllIlIlIlIllllIlll) {
        return this.buf.setBytes(llllllllllllIlIllIlIlIlIlllllIII, llllllllllllIlIllIlIlIlIllllIlll);
    }
    
    @Override
    public int writableBytes() {
        return this.buf.writableBytes();
    }
    
    @Override
    public long getLong(final int llllllllllllIlIllIlIlIlllllIIIll) {
        return this.buf.getLong(llllllllllllIlIllIlIlIlllllIIIll);
    }
    
    @Override
    public ByteBuf setChar(final int llllllllllllIlIllIlIlIllIIllIlll, final int llllllllllllIlIllIlIlIllIIllIIll) {
        return this.buf.setChar(llllllllllllIlIllIlIlIllIIllIlll, llllllllllllIlIllIlIlIllIIllIIll);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIlIllIlIlIlIIllIIlll) {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIIllIIlll);
    }
    
    @Override
    public int readerIndex() {
        return this.buf.readerIndex();
    }
    
    @Override
    public boolean isDirect() {
        return this.buf.isDirect();
    }
    
    @Override
    public int setBytes(final int llllllllllllIlIllIlIlIlIllIIIllI, final ScatteringByteChannel llllllllllllIlIllIlIlIlIllIIlIIl, final int llllllllllllIlIllIlIlIlIllIIIlII) throws IOException {
        return this.buf.setBytes(llllllllllllIlIllIlIlIlIllIIIllI, llllllllllllIlIllIlIlIlIllIIlIIl, llllllllllllIlIllIlIlIlIllIIIlII);
    }
    
    @Override
    public ByteBuf setByte(final int llllllllllllIlIllIlIlIllIllIIIIl, final int llllllllllllIlIllIlIlIllIllIIIII) {
        return this.buf.setByte(llllllllllllIlIllIlIlIllIllIIIIl, llllllllllllIlIllIlIlIllIllIIIII);
    }
    
    @Override
    public byte readByte() {
        return this.buf.readByte();
    }
    
    @Override
    public boolean release() {
        return this.buf.release();
    }
    
    @Override
    public String toString(final Charset llllllllllllIlIllIlIlIIIlIlIIlll) {
        return this.buf.toString(llllllllllllIlIllIlIlIIIlIlIIlll);
    }
    
    @Override
    public ByteBuf writeByte(final int llllllllllllIlIllIlIlIlIIIllIIll) {
        return this.buf.writeByte(llllllllllllIlIllIlIlIlIIIllIIll);
    }
    
    private static int lIlIIIllIlIIlIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public int readUnsignedMedium() {
        return this.buf.readUnsignedMedium();
    }
    
    @Override
    public ByteBuf setZero(final int llllllllllllIlIllIlIlIlIlIllllll, final int llllllllllllIlIllIlIlIlIlIlllIll) {
        return this.buf.setZero(llllllllllllIlIllIlIlIlIlIllllll, llllllllllllIlIllIlIlIlIlIlllIll);
    }
    
    @Override
    public int getUnsignedShort(final int llllllllllllIlIllIlIlIllllllllll) {
        return this.buf.getUnsignedShort(llllllllllllIlIllIlIlIllllllllll);
    }
    
    private static boolean lIlIIIllIlIIIlIl(final int llllllllllllIlIllIlIlIIIIIIlIlIl, final int llllllllllllIlIllIlIlIIIIIIlIlII) {
        return llllllllllllIlIllIlIlIIIIIIlIlIl >= llllllllllllIlIllIlIlIIIIIIlIlII;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIllIlIlIlllIlIIllI, final byte[] llllllllllllIlIllIlIlIlllIlIIIlI) {
        return this.buf.getBytes(llllllllllllIlIllIlIlIlllIlIIllI, llllllllllllIlIllIlIlIlllIlIIIlI);
    }
    
    private static void lIlIIIllIlIIIIII() {
        (lllIlIllIIllll = new String[PacketBuffer.lllIlIllIlIIlI[17]])[PacketBuffer.lllIlIllIlIIlI[5]] = lIlIIIllIIlllIIl("sSur+Xp9cvRr9l8iE+Cj0w==", "OQrax");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[0]] = lIlIIIllIIlllIlI("hdHvm+vjVcBFpXjuWQnN/w==", "HwyrX");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[11]] = lIlIIIllIIlllIll("AQITTz4wCRMGOjAOVgoiNgUSCih1GQIdJTsNVg05MwwTHWw5DxgIOD1KHxxsOQUYCCknSgIHLTtKGw40PAcDAmw0BhoAOzAOVkc=", "UjvoL");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[12]] = lIlIIIllIIlllIlI("E4jvDeiYntE=", "BuoRZ");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[10]] = lIlIIIllIIlllIIl("9Xv8Q8mtIlc=", "GehzP");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[3]] = lIlIIIllIIlllIIl("IHM02cFPOYcUyKUTeWPYTi79WqEvmSiivGth2Lsu5HH6z1mzYZc+7LwcmpziAmj80YUsswu0hjLG5v/BsLY2lv8FOUwcfbFff4qfvpDfmrE=", "zSGZv");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[13]] = lIlIIIllIIlllIll("IScrZQAQLCssBBArbjYGByYgIlIZKiAiBh1vJzZSGSAgIhcHbzotExtvIyQKHCI7KFIUIyIqBRArbm0=", "uONEr");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[2]] = lIlIIIllIIlllIIl("ySJs97xkqtA=", "pucZH");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[14]] = lIlIIIllIIlllIIl("48uhK0T/yrM=", "EJPoQ");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[15]] = lIlIIIllIIlllIIl("jHtTnadfws+3L7bSQPmnHgv9BJbvMo5e", "GKwUY");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[8]] = lIlIIIllIIlllIll("Ry8POx8UbRMhGQgpEytWRyAXN1o=", "gMvOz");
        PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[16]] = lIlIIIllIIlllIll("Wg==", "ssPxF");
    }
    
    public UUID readUuid() {
        return new UUID(this.readLong(), this.readLong());
    }
    
    @Override
    public int getUnsignedMedium(final int llllllllllllIlIllIlIlIllllllIlIl) {
        return this.buf.getUnsignedMedium(llllllllllllIlIllIlIlIllllllIlIl);
    }
    
    @Override
    public short readUnsignedByte() {
        return this.buf.readUnsignedByte();
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIlIllIlIlIlIIIIIIIll) {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIlIIIIIIIll);
    }
    
    @Override
    public int getBytes(final int llllllllllllIlIllIlIlIllIlllIlII, final GatheringByteChannel llllllllllllIlIllIlIlIllIlllIIll, final int llllllllllllIlIllIlIlIllIlllIllI) throws IOException {
        return this.buf.getBytes(llllllllllllIlIllIlIlIllIlllIlII, llllllllllllIlIllIlIlIllIlllIIll, llllllllllllIlIllIlIlIllIlllIllI);
    }
    
    @Override
    public float readFloat() {
        return this.buf.readFloat();
    }
    
    @Override
    public boolean isReadable() {
        return this.buf.isReadable();
    }
    
    @Override
    public ByteBuf setLong(final int llllllllllllIlIllIlIlIllIIllllIl, final long llllllllllllIlIllIlIlIllIIllllII) {
        return this.buf.setLong(llllllllllllIlIllIlIlIllIIllllIl, llllllllllllIlIllIlIlIllIIllllII);
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIllIlIlIlIlllIIIII, final ByteBuffer llllllllllllIlIllIlIlIlIllIlllII) {
        return this.buf.setBytes(llllllllllllIlIllIlIlIlIlllIIIII, llllllllllllIlIllIlIlIlIllIlllII);
    }
    
    @Override
    public ByteBuf readBytes(final int llllllllllllIlIllIlIlIlIlIIlIIII) {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIlIIlIIII);
    }
    
    public void writeByteArray(final byte[] llllllllllllIlIllIlIllIlIIlIIlIl) {
        this.writeVarIntToBuffer(llllllllllllIlIllIlIllIlIIlIIlIl.length);
        this.writeBytes(llllllllllllIlIllIlIllIlIIlIIlIl);
        "".length();
    }
    
    @Override
    public ByteBuf retain(final int llllllllllllIlIllIlIlIIIIllIlIlI) {
        return this.buf.retain(llllllllllllIlIllIlIlIIIIllIlIlI);
    }
    
    @Override
    public int indexOf(final int llllllllllllIlIllIlIlIIllIlIlIll, final int llllllllllllIlIllIlIlIIllIlIlIIl, final byte llllllllllllIlIllIlIlIIllIlIIIIl) {
        return this.buf.indexOf(llllllllllllIlIllIlIlIIllIlIlIll, llllllllllllIlIllIlIlIIllIlIlIIl, llllllllllllIlIllIlIlIIllIlIIIIl);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIlIllIlIlIlIlIIIIIlI) {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIlIIIIIlI);
    }
    
    @Override
    public ByteBuf setFloat(final int llllllllllllIlIllIlIlIllIIlIlIll, final float llllllllllllIlIllIlIlIllIIlIlIlI) {
        return this.buf.setFloat(llllllllllllIlIllIlIlIllIIlIlIll, llllllllllllIlIllIlIlIllIIlIlIlI);
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int llllllllllllIlIllIlIlIIIllIIlIII, final int llllllllllllIlIllIlIlIIIllIIIlII) {
        return this.buf.nioBuffers(llllllllllllIlIllIlIlIIIllIIlIII, llllllllllllIlIllIlIlIIIllIIIlII);
    }
    
    private static boolean lIlIIIllIlIIlIll(final Object llllllllllllIlIllIlIlIIIIIIIlIlI) {
        return llllllllllllIlIllIlIlIIIIIIIlIlI == null;
    }
    
    public NBTTagCompound readNBTTagCompoundFromBuffer() throws IOException {
        final int llllllllllllIlIllIlIllIIllIIIllI = this.readerIndex();
        final byte llllllllllllIlIllIlIllIIllIIIlIl = this.readByte();
        if (lIlIIIllIlIIIlII(llllllllllllIlIllIlIllIIllIIIlIl)) {
            return null;
        }
        this.readerIndex(llllllllllllIlIllIlIllIIllIIIllI);
        "".length();
        return CompressedStreamTools.read(new ByteBufInputStream(this), new NBTSizeTracker(2097152L));
    }
    
    @Override
    public ByteBuf setMedium(final int llllllllllllIlIllIlIlIllIlIlIIlI, final int llllllllllllIlIllIlIlIllIlIIlllI) {
        return this.buf.setMedium(llllllllllllIlIllIlIlIllIlIlIIlI, llllllllllllIlIllIlIlIllIlIIlllI);
    }
    
    @Override
    public ByteBuf skipBytes(final int llllllllllllIlIllIlIlIlIIIllllIl) {
        return this.buf.skipBytes(llllllllllllIlIllIlIlIlIIIllllIl);
    }
    
    @Override
    public int getInt(final int llllllllllllIlIllIlIlIlllllIllIl) {
        return this.buf.getInt(llllllllllllIlIllIlIlIlllllIllIl);
    }
    
    @Override
    public ByteBuf setDouble(final int llllllllllllIlIllIlIlIllIIlIIlIl, final double llllllllllllIlIllIlIlIllIIlIIIIl) {
        return this.buf.setDouble(llllllllllllIlIllIlIlIllIIlIIlIl, llllllllllllIlIllIlIlIllIIlIIIIl);
    }
    
    @Override
    public boolean isReadable(final int llllllllllllIlIllIlIllIIIlIIllII) {
        return this.buf.isReadable(llllllllllllIlIllIlIllIIIlIIllII);
    }
    
    @Override
    public ByteBuf slice() {
        return this.buf.slice();
    }
    
    @Override
    public char getChar(final int llllllllllllIlIllIlIlIllllIllIll) {
        return this.buf.getChar(llllllllllllIlIllIlIlIllllIllIll);
    }
    
    public IChatComponent readChatComponent() throws IOException {
        return IChatComponent.Serializer.jsonToComponent(this.readStringFromBuffer(PacketBuffer.lllIlIllIlIIlI[4]));
    }
    
    @Override
    public short readShort() {
        return this.buf.readShort();
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIlIllIlIlIIllllIlllI, final int llllllllllllIlIllIlIlIIlllllIIIl, final int llllllllllllIlIllIlIlIIllllIllII) {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIIllllIlllI, llllllllllllIlIllIlIlIIlllllIIIl, llllllllllllIlIllIlIlIIllllIllII);
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream llllllllllllIlIllIlIlIlIIlIIllIl, final int llllllllllllIlIllIlIlIlIIlIIllll) throws IOException {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIIlIIllIl, llllllllllllIlIllIlIlIlIIlIIllll);
    }
    
    @Override
    public byte getByte(final int llllllllllllIlIllIlIllIIIIIlIIll) {
        return this.buf.getByte(llllllllllllIlIllIlIllIIIIIlIIll);
    }
    
    @Override
    public ByteBuf retain() {
        return this.buf.retain();
    }
    
    @Override
    public ByteBuf copy() {
        return this.buf.copy();
    }
    
    @Override
    public String toString() {
        return this.buf.toString();
    }
    
    private static boolean lIlIIIllIlIIllIl(final int llllllllllllIlIllIlIlIIIIIIIIlII) {
        return llllllllllllIlIllIlIlIIIIIIIIlII >= 0;
    }
    
    @Override
    public int readBytes(final GatheringByteChannel llllllllllllIlIllIlIlIlIIlIIIlII, final int llllllllllllIlIllIlIlIlIIlIIIllI) throws IOException {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIIlIIIlII, llllllllllllIlIllIlIlIlIIlIIIllI);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIlIllIlIlIlIIlllIIll, final int llllllllllllIlIllIlIlIlIIlllIIlI, final int llllllllllllIlIllIlIlIlIIlllIIIl) {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIIlllIIll, llllllllllllIlIllIlIlIlIIlllIIlI, llllllllllllIlIllIlIlIlIIlllIIIl);
    }
    
    @Override
    public int readInt() {
        return this.buf.readInt();
    }
    
    @Override
    public char readChar() {
        return this.buf.readChar();
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIllIlIlIlllIlIlllI, final ByteBuf llllllllllllIlIllIlIlIlllIllIIlI, final int llllllllllllIlIllIlIlIlllIllIIIl, final int llllllllllllIlIllIlIlIlllIlIlIll) {
        return this.buf.getBytes(llllllllllllIlIllIlIlIlllIlIlllI, llllllllllllIlIllIlIlIlllIllIIlI, llllllllllllIlIllIlIlIlllIllIIIl, llllllllllllIlIllIlIlIlllIlIlIll);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIlIllIlIlIIlllllllII, final int llllllllllllIlIllIlIlIIllllllIII) {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIIlllllllII, llllllllllllIlIllIlIlIIllllllIII);
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor llllllllllllIlIllIlIlIIlIllIlIlI) {
        return this.buf.forEachByte(llllllllllllIlIllIlIlIIlIllIlIlI);
    }
    
    public BlockPos readBlockPos() {
        return BlockPos.fromLong(this.readLong());
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        return this.buf.discardReadBytes();
    }
    
    @Override
    public int bytesBefore(final int llllllllllllIlIllIlIlIIlIllllllI, final int llllllllllllIlIllIlIlIIlIlllIlII, final byte llllllllllllIlIllIlIlIIlIllllIlI) {
        return this.buf.bytesBefore(llllllllllllIlIllIlIlIIlIllllllI, llllllllllllIlIllIlIlIIlIlllIlII, llllllllllllIlIllIlIlIIlIllllIlI);
    }
    
    @Override
    public ByteBuf readSlice(final int llllllllllllIlIllIlIlIlIlIIIlIII) {
        return this.buf.readSlice(llllllllllllIlIllIlIlIlIlIIIlIII);
    }
    
    private static boolean lIlIIIllIlIIIlII(final int llllllllllllIlIllIlIlIIIIIIIIllI) {
        return llllllllllllIlIllIlIlIIIIIIIIllI == 0;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIllIlIlIllllIIIlll, final ByteBuf llllllllllllIlIllIlIlIllllIIIllI) {
        return this.buf.getBytes(llllllllllllIlIllIlIlIllllIIIlll, llllllllllllIlIllIlIlIllllIIIllI);
    }
    
    @Override
    public ByteBuf slice(final int llllllllllllIlIllIlIlIIlIIIIlIIl, final int llllllllllllIlIllIlIlIIlIIIIlIII) {
        return this.buf.slice(llllllllllllIlIllIlIlIIlIIIIlIIl, llllllllllllIlIllIlIlIIlIIIIlIII);
    }
    
    @Override
    public int hashCode() {
        return this.buf.hashCode();
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIlIllIlIlIlIIllllIlI, final int llllllllllllIlIllIlIlIlIIllllIIl) {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIIllllIlI, llllllllllllIlIllIlIlIlIIllllIIl);
    }
    
    public PacketBuffer(final ByteBuf llllllllllllIlIllIlIllIlIIllIIIl) {
        this.buf = llllllllllllIlIllIlIllIlIIllIIIl;
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        return this.buf.resetWriterIndex();
    }
    
    @Override
    public ByteBuf readerIndex(final int llllllllllllIlIllIlIllIIIlllIIII) {
        return this.buf.readerIndex(llllllllllllIlIllIlIllIIIlllIIII);
    }
    
    @Override
    public ByteBuf writeInt(final int llllllllllllIlIllIlIlIlIIIIlllll) {
        return this.buf.writeInt(llllllllllllIlIllIlIlIlIIIIlllll);
    }
    
    public void writeNBTTagCompoundToBuffer(final NBTTagCompound llllllllllllIlIllIlIllIIllIIllll) {
        if (lIlIIIllIlIIlIll(llllllllllllIlIllIlIllIIllIIllll)) {
            this.writeByte(PacketBuffer.lllIlIllIlIIlI[5]);
            "".length();
            "".length();
            if (((0xA4 ^ 0xAE) & ~(0x7E ^ 0x74)) != 0x0) {
                return;
            }
        }
        else {
            try {
                CompressedStreamTools.write(llllllllllllIlIllIlIllIIllIIllll, new ByteBufOutputStream(this));
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (IOException llllllllllllIlIllIlIllIIllIIlllI) {
                throw new EncoderException(llllllllllllIlIllIlIllIIllIIlllI);
            }
        }
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer llllllllllllIlIllIlIlIIlllIlIlII) {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIIlllIlIlII);
    }
    
    private static boolean lIlIIIllIlIIllII(final int llllllllllllIlIllIlIlIIIIIIIlIII) {
        return llllllllllllIlIllIlIlIIIIIIIlIII != 0;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer llllllllllllIlIllIlIlIlIIlIlIlIl) {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIIlIlIlIl);
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.buf.alloc();
    }
    
    @Override
    public ByteBuf clear() {
        return this.buf.clear();
    }
    
    @Override
    public ByteOrder order() {
        return this.buf.order();
    }
    
    @Override
    public ByteBuf writeLong(final long llllllllllllIlIllIlIlIlIIIIllIll) {
        return this.buf.writeLong(llllllllllllIlIllIlIlIlIIIIllIll);
    }
    
    public void writeChatComponent(final IChatComponent llllllllllllIlIllIlIllIlIIIIllIl) throws IOException {
        this.writeString(IChatComponent.Serializer.componentToJson(llllllllllllIlIllIlIllIlIIIIllIl));
        "".length();
    }
    
    public String readStringFromBuffer(final int llllllllllllIlIllIlIllIIlIlIIlII) {
        final int llllllllllllIlIllIlIllIIlIlIIIll = this.readVarIntFromBuffer();
        if (lIlIIIllIlIIlIII(llllllllllllIlIllIlIllIIlIlIIIll, llllllllllllIlIllIlIllIIlIlIIlII * PacketBuffer.lllIlIllIlIIlI[10])) {
            throw new DecoderException(String.valueOf(new StringBuilder(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[11]]).append(llllllllllllIlIllIlIllIIlIlIIIll).append(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[12]]).append(llllllllllllIlIllIlIllIIlIlIIlII * PacketBuffer.lllIlIllIlIIlI[10]).append(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[10]])));
        }
        if (lIlIIIllIlIIlllI(llllllllllllIlIllIlIllIIlIlIIIll)) {
            throw new DecoderException(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[3]]);
        }
        final String llllllllllllIlIllIlIllIIlIlIIIlI = new String(this.readBytes(llllllllllllIlIllIlIllIIlIlIIIll).array(), Charsets.UTF_8);
        if (lIlIIIllIlIIlIII(llllllllllllIlIllIlIllIIlIlIIIlI.length(), llllllllllllIlIllIlIllIIlIlIIlII)) {
            throw new DecoderException(String.valueOf(new StringBuilder(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[13]]).append(llllllllllllIlIllIlIllIIlIlIIIll).append(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[2]]).append(llllllllllllIlIllIlIllIIlIlIIlII).append(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[14]])));
        }
        return llllllllllllIlIllIlIllIIlIlIIIlI;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIllIlIlIllIIIIlllI, final ByteBuf llllllllllllIlIllIlIlIllIIIlIIIl, final int llllllllllllIlIllIlIlIllIIIIllII) {
        return this.buf.setBytes(llllllllllllIlIllIlIlIllIIIIlllI, llllllllllllIlIllIlIlIllIIIlIIIl, llllllllllllIlIllIlIlIllIIIIllII);
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIllIlIlIlIlllIllIl, final byte[] llllllllllllIlIllIlIlIlIlllIllII, final int llllllllllllIlIllIlIlIlIlllIlIll, final int llllllllllllIlIllIlIlIlIlllIlIlI) {
        return this.buf.setBytes(llllllllllllIlIllIlIlIlIlllIllIl, llllllllllllIlIllIlIlIlIlllIllII, llllllllllllIlIllIlIlIlIlllIlIll, llllllllllllIlIllIlIlIlIlllIlIlI);
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIllIlIlIllIIIIIlIl, final ByteBuf llllllllllllIlIllIlIlIlIllllllll, final int llllllllllllIlIllIlIlIlIlllllllI, final int llllllllllllIlIllIlIlIllIIIIIIlI) {
        return this.buf.setBytes(llllllllllllIlIllIlIlIllIIIIIlIl, llllllllllllIlIllIlIlIlIllllllll, llllllllllllIlIllIlIlIlIlllllllI, llllllllllllIlIllIlIlIllIIIIIIlI);
    }
    
    @Override
    public ByteBuf writeDouble(final double llllllllllllIlIllIlIlIlIIIIIlIIl) {
        return this.buf.writeDouble(llllllllllllIlIllIlIlIlIIIIIlIIl);
    }
    
    @Override
    public ByteBuf duplicate() {
        return this.buf.duplicate();
    }
    
    @Override
    public int readableBytes() {
        return this.buf.readableBytes();
    }
    
    @Override
    public short getShort(final int llllllllllllIlIllIlIllIIIIIIIlIl) {
        return this.buf.getShort(llllllllllllIlIllIlIllIIIIIIIlIl);
    }
    
    private static String lIlIIIllIIlllIll(String llllllllllllIlIllIlIlIIIIIlllIlI, final String llllllllllllIlIllIlIlIIIIIlllllI) {
        llllllllllllIlIllIlIlIIIIIlllIlI = new String(Base64.getDecoder().decode(llllllllllllIlIllIlIlIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlIlIIIIIllllIl = new StringBuilder();
        final char[] llllllllllllIlIllIlIlIIIIIllllII = llllllllllllIlIllIlIlIIIIIlllllI.toCharArray();
        int llllllllllllIlIllIlIlIIIIIlllIll = PacketBuffer.lllIlIllIlIIlI[5];
        final int llllllllllllIlIllIlIlIIIIIllIlIl = (Object)llllllllllllIlIllIlIlIIIIIlllIlI.toCharArray();
        final String llllllllllllIlIllIlIlIIIIIllIlII = (String)llllllllllllIlIllIlIlIIIIIllIlIl.length;
        int llllllllllllIlIllIlIlIIIIIllIIll = PacketBuffer.lllIlIllIlIIlI[5];
        while (lIlIIIllIlIIllll(llllllllllllIlIllIlIlIIIIIllIIll, (int)llllllllllllIlIllIlIlIIIIIllIlII)) {
            final char llllllllllllIlIllIlIlIIIIlIIIIII = llllllllllllIlIllIlIlIIIIIllIlIl[llllllllllllIlIllIlIlIIIIIllIIll];
            llllllllllllIlIllIlIlIIIIIllllIl.append((char)(llllllllllllIlIllIlIlIIIIlIIIIII ^ llllllllllllIlIllIlIlIIIIIllllII[llllllllllllIlIllIlIlIIIIIlllIll % llllllllllllIlIllIlIlIIIIIllllII.length]));
            "".length();
            ++llllllllllllIlIllIlIlIIIIIlllIll;
            ++llllllllllllIlIllIlIlIIIIIllIIll;
            "".length();
            if ((0xBF ^ 0xBA) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlIlIIIIIllllIl);
    }
    
    @Override
    public int refCnt() {
        return this.buf.refCnt();
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        return this.buf.discardSomeReadBytes();
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        return this.buf.nioBuffers();
    }
    
    @Override
    public short getUnsignedByte(final int llllllllllllIlIllIlIllIIIIIIllIl) {
        return this.buf.getUnsignedByte(llllllllllllIlIllIlIllIIIIIIllIl);
    }
    
    @Override
    public ByteBuf ensureWritable(final int llllllllllllIlIllIlIllIIIIlIIllI) {
        return this.buf.ensureWritable(llllllllllllIlIllIlIllIIIIlIIllI);
    }
    
    @Override
    public ByteBuf setBoolean(final int llllllllllllIlIllIlIlIllIllIlIlI, final boolean llllllllllllIlIllIlIlIllIllIllII) {
        return this.buf.setBoolean(llllllllllllIlIllIlIlIllIllIlIlI, llllllllllllIlIllIlIlIllIllIllII);
    }
    
    @Override
    public ByteBuffer nioBuffer(final int llllllllllllIlIllIlIlIIIlllIlIII, final int llllllllllllIlIllIlIlIIIlllIllII) {
        return this.buf.nioBuffer(llllllllllllIlIllIlIlIIIlllIlIII, llllllllllllIlIllIlIlIIIlllIllII);
    }
    
    public void writeEnumValue(final Enum<?> llllllllllllIlIllIlIllIlIIIIIIIl) {
        this.writeVarIntToBuffer(llllllllllllIlIllIlIllIlIIIIIIIl.ordinal());
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel llllllllllllIlIllIlIlIIlllIIIlIl, final int llllllllllllIlIllIlIlIIlllIIIIll) throws IOException {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIIlllIIIlIl, llllllllllllIlIllIlIlIIlllIIIIll);
    }
    
    @Override
    public double getDouble(final int llllllllllllIlIllIlIlIllllIIllll) {
        return this.buf.getDouble(llllllllllllIlIllIlIlIllllIIllll);
    }
    
    @Override
    public int compareTo(final ByteBuf llllllllllllIlIllIlIlIIIIlllIlll) {
        return this.buf.compareTo(llllllllllllIlIllIlIlIIIIlllIlll);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIllIlIlIlllIIIIlII, final OutputStream llllllllllllIlIllIlIlIllIlllllll, final int llllllllllllIlIllIlIlIlllIIIIIlI) throws IOException {
        return this.buf.getBytes(llllllllllllIlIllIlIlIlllIIIIlII, llllllllllllIlIllIlIlIllIlllllll, llllllllllllIlIllIlIlIlllIIIIIlI);
    }
    
    private static boolean lIlIIIllIlIIlllI(final int llllllllllllIlIllIlIlIIIIIIIIIlI) {
        return llllllllllllIlIllIlIlIIIIIIIIIlI < 0;
    }
    
    public void writeItemStackToBuffer(final ItemStack llllllllllllIlIllIlIllIIlIllllIl) {
        if (lIlIIIllIlIIlIll(llllllllllllIlIllIlIllIIlIllllIl)) {
            this.writeShort(PacketBuffer.lllIlIllIlIIlI[1]);
            "".length();
            "".length();
            if (-(0xCD ^ 0xBA ^ (0x7F ^ 0xC)) > 0) {
                return;
            }
        }
        else {
            this.writeShort(Item.getIdFromItem(llllllllllllIlIllIlIllIIlIllllIl.getItem()));
            "".length();
            this.writeByte(llllllllllllIlIllIlIllIIlIllllIl.stackSize);
            "".length();
            this.writeShort(llllllllllllIlIllIlIllIIlIllllIl.getMetadata());
            "".length();
            NBTTagCompound llllllllllllIlIllIlIllIIlIllllII = null;
            if (!lIlIIIllIlIIIlII(llllllllllllIlIllIlIllIIlIllllIl.getItem().isDamageable() ? 1 : 0) || lIlIIIllIlIIllII(llllllllllllIlIllIlIllIIlIllllIl.getItem().getShareTag() ? 1 : 0)) {
                llllllllllllIlIllIlIllIIlIllllII = llllllllllllIlIllIlIllIIlIllllIl.getTagCompound();
            }
            this.writeNBTTagCompoundToBuffer(llllllllllllIlIllIlIllIIlIllllII);
        }
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return this.buf.hasMemoryAddress();
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        return this.buf.nioBuffer();
    }
    
    private static String lIlIIIllIIlllIIl(final String llllllllllllIlIllIlIlIIIIIlIlIlI, final String llllllllllllIlIllIlIlIIIIIlIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIlIIIIIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIlIIIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), PacketBuffer.lllIlIllIlIIlI[14]), "DES");
            final Cipher llllllllllllIlIllIlIlIIIIIlIllII = Cipher.getInstance("DES");
            llllllllllllIlIllIlIlIIIIIlIllII.init(PacketBuffer.lllIlIllIlIIlI[11], llllllllllllIlIllIlIlIIIIIlIllIl);
            return new String(llllllllllllIlIllIlIlIIIIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIlIIIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIlIIIIIlIlIll) {
            llllllllllllIlIllIlIlIIIIIlIlIll.printStackTrace();
            return null;
        }
    }
    
    public void writeUuid(final UUID llllllllllllIlIllIlIllIIlllIIlIl) {
        this.writeLong(llllllllllllIlIllIlIllIIlllIIlIl.getMostSignificantBits());
        "".length();
        this.writeLong(llllllllllllIlIllIlIllIIlllIIlIl.getLeastSignificantBits());
        "".length();
    }
    
    @Override
    public long readLong() {
        return this.buf.readLong();
    }
    
    @Override
    public ByteBuf resetReaderIndex() {
        return this.buf.resetReaderIndex();
    }
    
    @Override
    public ByteBuf writeZero(final int llllllllllllIlIllIlIlIIllIllIlIl) {
        return this.buf.writeZero(llllllllllllIlIllIlIlIIllIllIlIl);
    }
    
    @Override
    public int bytesBefore(final int llllllllllllIlIllIlIlIIllIIIlllI, final byte llllllllllllIlIllIlIlIIllIIIIlll) {
        return this.buf.bytesBefore(llllllllllllIlIllIlIlIIllIIIlllI, llllllllllllIlIllIlIlIIllIIIIlll);
    }
    
    @Override
    public int setBytes(final int llllllllllllIlIllIlIlIlIllIlIIlI, final InputStream llllllllllllIlIllIlIlIlIllIlIIIl, final int llllllllllllIlIllIlIlIlIllIlIlII) throws IOException {
        return this.buf.setBytes(llllllllllllIlIllIlIlIlIllIlIIlI, llllllllllllIlIllIlIlIlIllIlIIIl, llllllllllllIlIllIlIlIlIllIlIlII);
    }
    
    @Override
    public boolean hasArray() {
        return this.buf.hasArray();
    }
    
    @Override
    public ByteBuf capacity(final int llllllllllllIlIllIlIllIIlIIIlllI) {
        return this.buf.capacity(llllllllllllIlIllIlIllIIlIIIlllI);
    }
    
    @Override
    public boolean getBoolean(final int llllllllllllIlIllIlIllIIIIIlIlll) {
        return this.buf.getBoolean(llllllllllllIlIllIlIllIIIIIlIlll);
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean llllllllllllIlIllIlIlIlIIIlllIIl) {
        return this.buf.writeBoolean(llllllllllllIlIllIlIlIlIIIlllIIl);
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        return this.buf.markReaderIndex();
    }
    
    public <T extends Enum<T>> T readEnumValue(final Class<T> llllllllllllIlIllIlIllIlIIIIIlll) {
        return llllllllllllIlIllIlIllIlIIIIIlll.getEnumConstants()[this.readVarIntFromBuffer()];
    }
    
    @Override
    public int maxWritableBytes() {
        return this.buf.maxWritableBytes();
    }
    
    @Override
    public ByteBuf markWriterIndex() {
        return this.buf.markWriterIndex();
    }
    
    @Override
    public int writeBytes(final InputStream llllllllllllIlIllIlIlIIlllIIllII, final int llllllllllllIlIllIlIlIIlllIIlIll) throws IOException {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIIlllIIllII, llllllllllllIlIllIlIlIIlllIIlIll);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIllIlIlIlllIIllIll, final byte[] llllllllllllIlIllIlIlIlllIIllIlI, final int llllllllllllIlIllIlIlIlllIIllIIl, final int llllllllllllIlIllIlIlIlllIIllIII) {
        return this.buf.getBytes(llllllllllllIlIllIlIlIlllIIllIll, llllllllllllIlIllIlIlIlllIIllIlI, llllllllllllIlIllIlIlIlllIIllIIl, llllllllllllIlIllIlIlIlllIIllIII);
    }
    
    @Override
    public boolean release(final int llllllllllllIlIllIlIlIIIIlIlIlIl) {
        return this.buf.release(llllllllllllIlIllIlIlIIIIlIlIlIl);
    }
    
    @Override
    public int readUnsignedShort() {
        return this.buf.readUnsignedShort();
    }
    
    private static boolean lIlIIIllIlIIlIIl(final int llllllllllllIlIllIlIIlllllllllll, final int llllllllllllIlIllIlIIllllllllllI) {
        return llllllllllllIlIllIlIIlllllllllll != llllllllllllIlIllIlIIllllllllllI;
    }
    
    @Override
    public ByteBuf writeMedium(final int llllllllllllIlIllIlIlIlIIIlIIlll) {
        return this.buf.writeMedium(llllllllllllIlIllIlIlIlIIIlIIlll);
    }
    
    @Override
    public double readDouble() {
        return this.buf.readDouble();
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlIllIlIlIIIlIIIIlII) {
        return this.buf.equals(llllllllllllIlIllIlIlIIIlIIIIlII);
    }
    
    @Override
    public int maxCapacity() {
        return this.buf.maxCapacity();
    }
    
    @Override
    public int ensureWritable(final int llllllllllllIlIllIlIllIIIIIllllI, final boolean llllllllllllIlIllIlIllIIIIlIIIII) {
        return this.buf.ensureWritable(llllllllllllIlIllIlIllIIIIIllllI, llllllllllllIlIllIlIllIIIIlIIIII);
    }
    
    @Override
    public byte[] array() {
        return this.buf.array();
    }
    
    @Override
    public ByteBuf writerIndex(final int llllllllllllIlIllIlIllIIIllIIlll) {
        return this.buf.writerIndex(llllllllllllIlIllIlIllIIIllIIlll);
    }
    
    @Override
    public ByteBuf setInt(final int llllllllllllIlIllIlIlIllIlIIlIIl, final int llllllllllllIlIllIlIlIllIlIIlIII) {
        return this.buf.setInt(llllllllllllIlIllIlIlIllIlIIlIIl, llllllllllllIlIllIlIlIllIlIIlIII);
    }
    
    public void writeVarIntToBuffer(int llllllllllllIlIllIlIllIIllIllIlI) {
        "".length();
        if (" ".length() > "   ".length()) {
            return;
        }
        while (!lIlIIIllIlIIIlII((int)(llllllllllllIlIllIlIllIIllIllIlI & PacketBuffer.lllIlIllIlIIlI[9]))) {
            this.writeByte((int)((llllllllllllIlIllIlIllIIllIllIlI & PacketBuffer.lllIlIllIlIIlI[6]) | PacketBuffer.lllIlIllIlIIlI[7]));
            "".length();
            llllllllllllIlIllIlIllIIllIllIlI >>>= PacketBuffer.lllIlIllIlIIlI[2];
        }
        this.writeByte((int)llllllllllllIlIllIlIllIIllIllIlI);
        "".length();
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.buf.unwrap();
    }
    
    public ItemStack readItemStackFromBuffer() throws IOException {
        ItemStack llllllllllllIlIllIlIllIIlIllIIlI = null;
        final int llllllllllllIlIllIlIllIIlIllIIIl = this.readShort();
        if (lIlIIIllIlIIllIl(llllllllllllIlIllIlIllIIlIllIIIl)) {
            final int llllllllllllIlIllIlIllIIlIllIIII = this.readByte();
            final int llllllllllllIlIllIlIllIIlIlIllll = this.readShort();
            llllllllllllIlIllIlIllIIlIllIIlI = new ItemStack(Item.getItemById(llllllllllllIlIllIlIllIIlIllIIIl), llllllllllllIlIllIlIllIIlIllIIII, llllllllllllIlIllIlIllIIlIlIllll);
            llllllllllllIlIllIlIllIIlIllIIlI.setTagCompound(this.readNBTTagCompoundFromBuffer());
        }
        return llllllllllllIlIllIlIllIIlIllIIlI;
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIlIllIlIlIIllllIlIII) {
        return this.buf.writeBytes(llllllllllllIlIllIlIlIIllllIlIII);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int llllllllllllIlIllIlIlIIIllIllIIl, final int llllllllllllIlIllIlIlIIIllIllIII) {
        return this.buf.internalNioBuffer(llllllllllllIlIllIlIlIIIllIllIIl, llllllllllllIlIllIlIlIIIllIllIII);
    }
    
    @Override
    public long memoryAddress() {
        return this.buf.memoryAddress();
    }
    
    @Override
    public boolean isWritable() {
        return this.buf.isWritable();
    }
    
    private static boolean lIlIIIllIlIIllll(final int llllllllllllIlIllIlIlIIIIIIlIIIl, final int llllllllllllIlIllIlIlIIIIIIlIIII) {
        return llllllllllllIlIllIlIlIIIIIIlIIIl < llllllllllllIlIllIlIlIIIIIIlIIII;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIlIllIlIlIlIIllIIIIl, final int llllllllllllIlIllIlIlIlIIlIlllII, final int llllllllllllIlIllIlIlIlIIlIllIll) {
        return this.buf.readBytes(llllllllllllIlIllIlIlIlIIllIIIIl, llllllllllllIlIllIlIlIlIIlIlllII, llllllllllllIlIllIlIlIlIIlIllIll);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIllIlIlIlllIIIlIll, final ByteBuffer llllllllllllIlIllIlIlIlllIIIlIlI) {
        return this.buf.getBytes(llllllllllllIlIllIlIlIlllIIIlIll, llllllllllllIlIllIlIlIlllIIIlIlI);
    }
    
    public byte[] readByteArray() {
        final byte[] llllllllllllIlIllIlIllIlIIlIIIIl = new byte[this.readVarIntFromBuffer()];
        this.readBytes(llllllllllllIlIllIlIllIlIIlIIIIl);
        "".length();
        return llllllllllllIlIllIlIllIlIIlIIIIl;
    }
    
    @Override
    public ByteBuf copy(final int llllllllllllIlIllIlIlIIlIIIllllI, final int llllllllllllIlIllIlIlIIlIIIlllIl) {
        return this.buf.copy(llllllllllllIlIllIlIlIIlIIIllllI, llllllllllllIlIllIlIlIIlIIIlllIl);
    }
    
    public PacketBuffer writeString(final String llllllllllllIlIllIlIllIIlIIllIIl) {
        final byte[] llllllllllllIlIllIlIllIIlIIllIII = llllllllllllIlIllIlIllIIlIIllIIl.getBytes(Charsets.UTF_8);
        if (lIlIIIllIlIIlIII(llllllllllllIlIllIlIllIIlIIllIII.length, PacketBuffer.lllIlIllIlIIlI[4])) {
            throw new EncoderException(String.valueOf(new StringBuilder(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[15]]).append(llllllllllllIlIllIlIllIIlIIllIIl.length()).append(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[8]]).append(PacketBuffer.lllIlIllIlIIlI[4]).append(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[16]])));
        }
        this.writeVarIntToBuffer(llllllllllllIlIllIlIllIIlIIllIII.length);
        this.writeBytes(llllllllllllIlIllIlIllIIlIIllIII);
        "".length();
        return this;
    }
    
    static {
        lIlIIIllIlIIIIll();
        lIlIIIllIlIIIIII();
    }
    
    public long readVarLong() {
        long llllllllllllIlIllIlIllIIlllIllll = 0L;
        int llllllllllllIlIllIlIllIIlllIlllI = PacketBuffer.lllIlIllIlIIlI[5];
        byte llllllllllllIlIllIlIllIIlllIllIl;
        do {
            llllllllllllIlIllIlIllIIlllIllIl = this.readByte();
            llllllllllllIlIllIlIllIIlllIllll |= (long)(llllllllllllIlIllIlIllIIlllIllIl & PacketBuffer.lllIlIllIlIIlI[6]) << llllllllllllIlIllIlIllIIlllIlllI++ * PacketBuffer.lllIlIllIlIIlI[2];
            if (lIlIIIllIlIIlIII(llllllllllllIlIllIlIllIIlllIlllI, PacketBuffer.lllIlIllIlIIlI[8])) {
                throw new RuntimeException(PacketBuffer.lllIlIllIIllll[PacketBuffer.lllIlIllIlIIlI[0]]);
            }
        } while (!lIlIIIllIlIIlIIl(llllllllllllIlIllIlIllIIlllIllIl & PacketBuffer.lllIlIllIlIIlI[7], PacketBuffer.lllIlIllIlIIlI[7]));
        return llllllllllllIlIllIlIllIIlllIllll;
    }
    
    @Override
    public int forEachByte(final int llllllllllllIlIllIlIlIIlIlIllIlI, final int llllllllllllIlIllIlIlIIlIlIlIIll, final ByteBufProcessor llllllllllllIlIllIlIlIIlIlIlIIlI) {
        return this.buf.forEachByte(llllllllllllIlIllIlIlIIlIlIllIlI, llllllllllllIlIllIlIlIIlIlIlIIll, llllllllllllIlIllIlIlIIlIlIlIIlI);
    }
    
    @Override
    public float getFloat(final int llllllllllllIlIllIlIlIllllIlIlIl) {
        return this.buf.getFloat(llllllllllllIlIllIlIlIllllIlIlIl);
    }
    
    @Override
    public int bytesBefore(final byte llllllllllllIlIllIlIlIIllIIllIII) {
        return this.buf.bytesBefore(llllllllllllIlIllIlIlIIllIIllIII);
    }
    
    @Override
    public ByteBuf setIndex(final int llllllllllllIlIllIlIllIIIlIlllIl, final int llllllllllllIlIllIlIllIIIlIlllII) {
        return this.buf.setIndex(llllllllllllIlIllIlIllIIIlIlllIl, llllllllllllIlIllIlIllIIIlIlllII);
    }
    
    @Override
    public int nioBufferCount() {
        return this.buf.nioBufferCount();
    }
    
    private static boolean lIlIIIllIlIIlIII(final int llllllllllllIlIllIlIlIIIIIIIllIl, final int llllllllllllIlIllIlIlIIIIIIIllII) {
        return llllllllllllIlIllIlIlIIIIIIIllIl > llllllllllllIlIllIlIlIIIIIIIllII;
    }
    
    @Override
    public long getUnsignedInt(final int llllllllllllIlIllIlIlIlllllIlIIl) {
        return this.buf.getUnsignedInt(llllllllllllIlIllIlIlIlllllIlIIl);
    }
    
    @Override
    public int getMedium(final int llllllllllllIlIllIlIlIlllllllIIl) {
        return this.buf.getMedium(llllllllllllIlIllIlIlIlllllllIIl);
    }
    
    @Override
    public int capacity() {
        return this.buf.capacity();
    }
    
    @Override
    public boolean isWritable(final int llllllllllllIlIllIlIllIIIlIIIIll) {
        return this.buf.isWritable(llllllllllllIlIllIlIllIIIlIIIIll);
    }
    
    @Override
    public int forEachByteDesc(final int llllllllllllIlIllIlIlIIlIIllllIl, final int llllllllllllIlIllIlIlIIlIIlllIll, final ByteBufProcessor llllllllllllIlIllIlIlIIlIIlllIIl) {
        return this.buf.forEachByteDesc(llllllllllllIlIllIlIlIIlIIllllIl, llllllllllllIlIllIlIlIIlIIlllIll, llllllllllllIlIllIlIlIIlIIlllIIl);
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIllIlIlIllIIIlllII, final ByteBuf llllllllllllIlIllIlIlIllIIIllIII) {
        return this.buf.setBytes(llllllllllllIlIllIlIlIllIIIlllII, llllllllllllIlIllIlIlIllIIIllIII);
    }
}
