// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import java.util.Set;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S08PacketPlayerPosLook implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ double x;
    private /* synthetic */ float pitch;
    private /* synthetic */ double y;
    private /* synthetic */ float yaw;
    private /* synthetic */ double z;
    private /* synthetic */ Set<EnumFlags> field_179835_f;
    
    public double getX() {
        return this.x;
    }
    
    public float getYaw() {
        return this.yaw;
    }
    
    public S08PacketPlayerPosLook(final double lllllllllllllIIlIlIlllllIIIlIlIl, final double lllllllllllllIIlIlIlllllIIIlIlII, final double lllllllllllllIIlIlIlllllIIIlIIll, final float lllllllllllllIIlIlIlllllIIIllIIl, final float lllllllllllllIIlIlIlllllIIIllIII, final Set<EnumFlags> lllllllllllllIIlIlIlllllIIIlIIII) {
        this.x = lllllllllllllIIlIlIlllllIIIlIlIl;
        this.y = lllllllllllllIIlIlIlllllIIIlIlII;
        this.z = lllllllllllllIIlIlIlllllIIIlIIll;
        this.yaw = lllllllllllllIIlIlIlllllIIIllIIl;
        this.pitch = lllllllllllllIIlIlIlllllIIIllIII;
        this.field_179835_f = lllllllllllllIIlIlIlllllIIIlIIII;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIlIlIllllIlllllllI) {
        lllllllllllllIIlIlIllllIlllllllI.handlePlayerPosLook(this);
    }
    
    public float getPitch() {
        return this.pitch;
    }
    
    public Set<EnumFlags> func_179834_f() {
        return this.field_179835_f;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlIlIlllllIIIIIllI) throws IOException {
        lllllllllllllIIlIlIlllllIIIIIllI.writeDouble(this.x);
        "".length();
        lllllllllllllIIlIlIlllllIIIIIllI.writeDouble(this.y);
        "".length();
        lllllllllllllIIlIlIlllllIIIIIllI.writeDouble(this.z);
        "".length();
        lllllllllllllIIlIlIlllllIIIIIllI.writeFloat(this.yaw);
        "".length();
        lllllllllllllIIlIlIlllllIIIIIllI.writeFloat(this.pitch);
        "".length();
        lllllllllllllIIlIlIlllllIIIIIllI.writeByte(EnumFlags.func_180056_a(this.field_179835_f));
        "".length();
    }
    
    public double getZ() {
        return this.z;
    }
    
    public S08PacketPlayerPosLook() {
    }
    
    public double getY() {
        return this.y;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlIlIlllllIIIIllII) throws IOException {
        this.x = lllllllllllllIIlIlIlllllIIIIllII.readDouble();
        this.y = lllllllllllllIIlIlIlllllIIIIllII.readDouble();
        this.z = lllllllllllllIIlIlIlllllIIIIllII.readDouble();
        this.yaw = lllllllllllllIIlIlIlllllIIIIllII.readFloat();
        this.pitch = lllllllllllllIIlIlIlllllIIIIllII.readFloat();
        this.field_179835_f = EnumFlags.func_180053_a(lllllllllllllIIlIlIlllllIIIIllII.readUnsignedByte());
    }
    
    public enum EnumFlags
    {
        Y(EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[1]], EnumFlags.lIllIllllIIlIl[1], EnumFlags.lIllIllllIIlIl[1]), 
        Y_ROT(EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[3]], EnumFlags.lIllIllllIIlIl[3], EnumFlags.lIllIllllIIlIl[3]), 
        X_ROT(EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[4]], EnumFlags.lIllIllllIIlIl[4], EnumFlags.lIllIllllIIlIl[4]);
        
        private static final /* synthetic */ String[] lIllIllllIIIIl;
        
        X(EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[0]], EnumFlags.lIllIllllIIlIl[0], EnumFlags.lIllIllllIIlIl[0]);
        
        private /* synthetic */ int field_180058_f;
        private static final /* synthetic */ int[] lIllIllllIIlIl;
        
        Z(EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[2]], EnumFlags.lIllIllllIIlIl[2], EnumFlags.lIllIllllIIlIl[2]);
        
        private static boolean lIIIIIIIIllIIlll(final int llllllllllllIllllllIIlIIIIllIIlI, final int llllllllllllIllllllIIlIIIIllIIIl) {
            return llllllllllllIllllllIIlIIIIllIIlI == llllllllllllIllllllIIlIIIIllIIIl;
        }
        
        private EnumFlags(final String llllllllllllIllllllIIlIIlIIlIlII, final int llllllllllllIllllllIIlIIlIIlIIll, final int llllllllllllIllllllIIlIIlIIlIllI) {
            this.field_180058_f = llllllllllllIllllllIIlIIlIIlIllI;
        }
        
        private int func_180055_a() {
            return EnumFlags.lIllIllllIIlIl[1] << this.field_180058_f;
        }
        
        private static void lIIIIIIIIllIIIII() {
            (lIllIllllIIIIl = new String[EnumFlags.lIllIllllIIlIl[5]])[EnumFlags.lIllIllllIIlIl[0]] = lIIIIIIIIlIlllIl("Hg==", "FizXj");
            EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[1]] = lIIIIIIIIlIllllI("Ckp8GBulbEE=", "RLamn");
            EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[2]] = lIIIIIIIIlIlllll("u5riuoyN/7M=", "NNcJq");
            EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[3]] = lIIIIIIIIlIlllIl("ITs3Fh8=", "xdeYK");
            EnumFlags.lIllIllllIIIIl[EnumFlags.lIllIllllIIlIl[4]] = lIIIIIIIIlIlllIl("GT4iLRo=", "AapbN");
        }
        
        private static String lIIIIIIIIlIlllIl(String llllllllllllIllllllIIlIIIlIIlIlI, final String llllllllllllIllllllIIlIIIlIIlIIl) {
            llllllllllllIllllllIIlIIIlIIlIlI = new String(Base64.getDecoder().decode(llllllllllllIllllllIIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllllIIlIIIlIIllIl = new StringBuilder();
            final char[] llllllllllllIllllllIIlIIIlIIllII = llllllllllllIllllllIIlIIIlIIlIIl.toCharArray();
            int llllllllllllIllllllIIlIIIlIIlIll = EnumFlags.lIllIllllIIlIl[0];
            final int llllllllllllIllllllIIlIIIlIIIlIl = (Object)llllllllllllIllllllIIlIIIlIIlIlI.toCharArray();
            final Exception llllllllllllIllllllIIlIIIlIIIlII = (Exception)llllllllllllIllllllIIlIIIlIIIlIl.length;
            byte llllllllllllIllllllIIlIIIlIIIIll = (byte)EnumFlags.lIllIllllIIlIl[0];
            while (lIIIIIIIIllIlIll(llllllllllllIllllllIIlIIIlIIIIll, (int)llllllllllllIllllllIIlIIIlIIIlII)) {
                final char llllllllllllIllllllIIlIIIlIlIIII = llllllllllllIllllllIIlIIIlIIIlIl[llllllllllllIllllllIIlIIIlIIIIll];
                llllllllllllIllllllIIlIIIlIIllIl.append((char)(llllllllllllIllllllIIlIIIlIlIIII ^ llllllllllllIllllllIIlIIIlIIllII[llllllllllllIllllllIIlIIIlIIlIll % llllllllllllIllllllIIlIIIlIIllII.length]));
                "".length();
                ++llllllllllllIllllllIIlIIIlIIlIll;
                ++llllllllllllIllllllIIlIIIlIIIIll;
                "".length();
                if (-(0x62 ^ 0x32 ^ (0xD7 ^ 0x82)) >= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllllIIlIIIlIIllIl);
        }
        
        static {
            lIIIIIIIIllIIllI();
            lIIIIIIIIllIIIII();
            final EnumFlags[] enum$VALUES = new EnumFlags[EnumFlags.lIllIllllIIlIl[5]];
            enum$VALUES[EnumFlags.lIllIllllIIlIl[0]] = EnumFlags.X;
            enum$VALUES[EnumFlags.lIllIllllIIlIl[1]] = EnumFlags.Y;
            enum$VALUES[EnumFlags.lIllIllllIIlIl[2]] = EnumFlags.Z;
            enum$VALUES[EnumFlags.lIllIllllIIlIl[3]] = EnumFlags.Y_ROT;
            enum$VALUES[EnumFlags.lIllIllllIIlIl[4]] = EnumFlags.X_ROT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lIIIIIIIIllIlIIl(final int llllllllllllIllllllIIlIIIIlIlllI, final int llllllllllllIllllllIIlIIIIlIllIl) {
            return llllllllllllIllllllIIlIIIIlIlllI >= llllllllllllIllllllIIlIIIIlIllIl;
        }
        
        private static boolean lIIIIIIIIllIlIlI(final int llllllllllllIllllllIIlIIIIlIIlIl) {
            return llllllllllllIllllllIIlIIIIlIIlIl == 0;
        }
        
        private static String lIIIIIIIIlIlllll(final String llllllllllllIllllllIIlIIIIlllIlI, final String llllllllllllIllllllIIlIIIIllIlll) {
            try {
                final SecretKeySpec llllllllllllIllllllIIlIIIIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIlIIIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllllIIlIIIIllllII = Cipher.getInstance("Blowfish");
                llllllllllllIllllllIIlIIIIllllII.init(EnumFlags.lIllIllllIIlIl[2], llllllllllllIllllllIIlIIIIllllIl);
                return new String(llllllllllllIllllllIIlIIIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIlIIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIIlIIIIlllIll) {
                llllllllllllIllllllIIlIIIIlllIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIIIIIIllIlIII(final int llllllllllllIllllllIIlIIIIlIIlll) {
            return llllllllllllIllllllIIlIIIIlIIlll != 0;
        }
        
        private boolean func_180054_b(final int llllllllllllIllllllIIlIIlIIIlIll) {
            if (lIIIIIIIIllIIlll(llllllllllllIllllllIIlIIlIIIlIll & this.func_180055_a(), this.func_180055_a())) {
                return EnumFlags.lIllIllllIIlIl[1] != 0;
            }
            return EnumFlags.lIllIllllIIlIl[0] != 0;
        }
        
        private static boolean lIIIIIIIIllIlIll(final int llllllllllllIllllllIIlIIIIlIlIlI, final int llllllllllllIllllllIIlIIIIlIlIIl) {
            return llllllllllllIllllllIIlIIIIlIlIlI < llllllllllllIllllllIIlIIIIlIlIIl;
        }
        
        private static String lIIIIIIIIlIllllI(final String llllllllllllIllllllIIlIIIlIlllIl, final String llllllllllllIllllllIIlIIIlIllllI) {
            try {
                final SecretKeySpec llllllllllllIllllllIIlIIIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIlIIIlIllllI.getBytes(StandardCharsets.UTF_8)), EnumFlags.lIllIllllIIlIl[6]), "DES");
                final Cipher llllllllllllIllllllIIlIIIllIIIIl = Cipher.getInstance("DES");
                llllllllllllIllllllIIlIIIllIIIIl.init(EnumFlags.lIllIllllIIlIl[2], llllllllllllIllllllIIlIIIllIIIlI);
                return new String(llllllllllllIllllllIIlIIIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIlIIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIIlIIIllIIIII) {
                llllllllllllIllllllIIlIIIllIIIII.printStackTrace();
                return null;
            }
        }
        
        public static int func_180056_a(final Set<EnumFlags> llllllllllllIllllllIIlIIIlllIlIl) {
            int llllllllllllIllllllIIlIIIlllIlII = EnumFlags.lIllIllllIIlIl[0];
            final short llllllllllllIllllllIIlIIIllIllll = (short)llllllllllllIllllllIIlIIIlllIlIl.iterator();
            "".length();
            if ("  ".length() < "  ".length()) {
                return (72 + 2 + 1 + 93 ^ 140 + 77 - 149 + 91) & (0x66 ^ 0x79 ^ (0x38 ^ 0x10) ^ -" ".length());
            }
            while (!lIIIIIIIIllIlIlI(((Iterator)llllllllllllIllllllIIlIIIllIllll).hasNext() ? 1 : 0)) {
                final EnumFlags llllllllllllIllllllIIlIIIlllIIll = ((Iterator<EnumFlags>)llllllllllllIllllllIIlIIIllIllll).next();
                llllllllllllIllllllIIlIIIlllIlII |= llllllllllllIllllllIIlIIIlllIIll.func_180055_a();
            }
            return llllllllllllIllllllIIlIIIlllIlII;
        }
        
        public static Set<EnumFlags> func_180053_a(final int llllllllllllIllllllIIlIIIlllllll) {
            final Set<EnumFlags> llllllllllllIllllllIIlIIlIIIIIIl = EnumSet.noneOf(EnumFlags.class);
            final short llllllllllllIllllllIIlIIIllllIlI;
            final long llllllllllllIllllllIIlIIIllllIll = ((EnumFlags[])(Object)(llllllllllllIllllllIIlIIIllllIlI = (short)(Object)values())).length;
            short llllllllllllIllllllIIlIIIlllllII = (short)EnumFlags.lIllIllllIIlIl[0];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
            while (!lIIIIIIIIllIlIIl(llllllllllllIllllllIIlIIIlllllII, (int)llllllllllllIllllllIIlIIIllllIll)) {
                final EnumFlags llllllllllllIllllllIIlIIlIIIIIII = llllllllllllIllllllIIlIIIllllIlI[llllllllllllIllllllIIlIIIlllllII];
                if (lIIIIIIIIllIlIII(llllllllllllIllllllIIlIIlIIIIIII.func_180054_b(llllllllllllIllllllIIlIIIlllllll) ? 1 : 0)) {
                    llllllllllllIllllllIIlIIlIIIIIIl.add(llllllllllllIllllllIIlIIlIIIIIII);
                    "".length();
                }
                ++llllllllllllIllllllIIlIIIlllllII;
            }
            return llllllllllllIllllllIIlIIlIIIIIIl;
        }
        
        private static void lIIIIIIIIllIIllI() {
            (lIllIllllIIlIl = new int[7])[0] = ((76 + 169 - 152 + 146 ^ 108 + 61 - 119 + 110) & (6 + 108 - 86 + 172 ^ 124 + 69 - 182 + 124 ^ -" ".length()));
            EnumFlags.lIllIllllIIlIl[1] = " ".length();
            EnumFlags.lIllIllllIIlIl[2] = "  ".length();
            EnumFlags.lIllIllllIIlIl[3] = "   ".length();
            EnumFlags.lIllIllllIIlIl[4] = (0x1 ^ 0x5);
            EnumFlags.lIllIllllIIlIl[5] = (121 + 19 - 11 + 65 ^ 79 + 41 + 11 + 68);
            EnumFlags.lIllIllllIIlIl[6] = (0x33 ^ 0x4 ^ (0xBD ^ 0x82));
        }
    }
}
