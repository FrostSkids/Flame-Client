// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S45PacketTitle implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int fadeInTime;
    private /* synthetic */ IChatComponent message;
    private /* synthetic */ int displayTime;
    private /* synthetic */ Type type;
    private /* synthetic */ int fadeOutTime;
    private static final /* synthetic */ int[] lllIlIlIIlIllI;
    
    public IChatComponent getMessage() {
        return this.message;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllIllIlIIllIlIlIl) throws IOException {
        llllllllllllIlIllIllIlIIllIlIlIl.writeEnumValue(this.type);
        if (!lIlIIIlIllIllllI(this.type, Type.TITLE) || lIlIIIlIllIlllll(this.type, Type.SUBTITLE)) {
            llllllllllllIlIllIllIlIIllIlIlIl.writeChatComponent(this.message);
        }
        if (lIlIIIlIllIlllll(this.type, Type.TIMES)) {
            llllllllllllIlIllIllIlIIllIlIlIl.writeInt(this.fadeInTime);
            "".length();
            llllllllllllIlIllIllIlIIllIlIlIl.writeInt(this.displayTime);
            "".length();
            llllllllllllIlIllIllIlIIllIlIlIl.writeInt(this.fadeOutTime);
            "".length();
        }
    }
    
    public int getDisplayTime() {
        return this.displayTime;
    }
    
    public int getFadeOutTime() {
        return this.fadeOutTime;
    }
    
    static {
        lIlIIIlIllIlllIl();
    }
    
    private static boolean lIlIIIlIllIllllI(final Object llllllllllllIlIllIllIlIIlIllIlll, final Object llllllllllllIlIllIllIlIIlIllIllI) {
        return llllllllllllIlIllIllIlIIlIllIlll != llllllllllllIlIllIllIlIIlIllIllI;
    }
    
    private static void lIlIIIlIllIlllIl() {
        (lllIlIlIIlIllI = new int[1])[0] = -" ".length();
    }
    
    public S45PacketTitle() {
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllIllIlIIllIllIIl) throws IOException {
        this.type = llllllllllllIlIllIllIlIIllIllIIl.readEnumValue(Type.class);
        if (!lIlIIIlIllIllllI(this.type, Type.TITLE) || lIlIIIlIllIlllll(this.type, Type.SUBTITLE)) {
            this.message = llllllllllllIlIllIllIlIIllIllIIl.readChatComponent();
        }
        if (lIlIIIlIllIlllll(this.type, Type.TIMES)) {
            this.fadeInTime = llllllllllllIlIllIllIlIIllIllIIl.readInt();
            this.displayTime = llllllllllllIlIllIllIlIIllIllIIl.readInt();
            this.fadeOutTime = llllllllllllIlIllIllIlIIllIllIIl.readInt();
        }
    }
    
    public int getFadeInTime() {
        return this.fadeInTime;
    }
    
    public S45PacketTitle(final int llllllllllllIlIllIllIlIIlllllIIl, final int llllllllllllIlIllIllIlIIlllllIII, final int llllllllllllIlIllIllIlIIllllIIIl) {
        this(Type.TIMES, null, llllllllllllIlIllIllIlIIlllllIIl, llllllllllllIlIllIllIlIIlllllIII, llllllllllllIlIllIllIlIIllllIIIl);
    }
    
    public Type getType() {
        return this.type;
    }
    
    private static boolean lIlIIIlIllIlllll(final Object llllllllllllIlIllIllIlIIlIllIIll, final Object llllllllllllIlIllIllIlIIlIllIIlI) {
        return llllllllllllIlIllIllIlIIlIllIIll == llllllllllllIlIllIllIlIIlIllIIlI;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIllIllIlIIllIIllIl) {
        llllllllllllIlIllIllIlIIllIIllIl.handleTitle(this);
    }
    
    public S45PacketTitle(final Type llllllllllllIlIllIllIlIIlllIlIIl, final IChatComponent llllllllllllIlIllIllIlIIlllIlIII, final int llllllllllllIlIllIllIlIIlllIIIIl, final int llllllllllllIlIllIllIlIIlllIIIII, final int llllllllllllIlIllIllIlIIllIlllll) {
        this.type = llllllllllllIlIllIllIlIIlllIlIIl;
        this.message = llllllllllllIlIllIllIlIIlllIlIII;
        this.fadeInTime = llllllllllllIlIllIllIlIIlllIIIIl;
        this.displayTime = llllllllllllIlIllIllIlIIlllIIIII;
        this.fadeOutTime = llllllllllllIlIllIllIlIIllIlllll;
    }
    
    public S45PacketTitle(final Type llllllllllllIlIllIllIlIlIIIIIllI, final IChatComponent llllllllllllIlIllIllIlIlIIIIIlII) {
        this(llllllllllllIlIllIllIlIlIIIIIllI, llllllllllllIlIllIllIlIlIIIIIlII, S45PacketTitle.lllIlIlIIlIllI[0], S45PacketTitle.lllIlIlIIlIllI[0], S45PacketTitle.lllIlIlIIlIllI[0]);
    }
    
    public enum Type
    {
        CLEAR(Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[3]], Type.lIIllIllIIIIlI[3]);
        
        private static final /* synthetic */ String[] lIIllIllIIIIIl;
        
        SUBTITLE(Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[1]], Type.lIIllIllIIIIlI[1]);
        
        private static final /* synthetic */ int[] lIIllIllIIIIlI;
        
        TIMES(Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[2]], Type.lIIllIllIIIIlI[2]), 
        TITLE(Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[0]], Type.lIIllIllIIIIlI[0]), 
        RESET(Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[4]], Type.lIIllIllIIIIlI[4]);
        
        static {
            llIllIIllIIlIII();
            llIllIIllIIIlll();
            final Type[] enum$VALUES = new Type[Type.lIIllIllIIIIlI[5]];
            enum$VALUES[Type.lIIllIllIIIIlI[0]] = Type.TITLE;
            enum$VALUES[Type.lIIllIllIIIIlI[1]] = Type.SUBTITLE;
            enum$VALUES[Type.lIIllIllIIIIlI[2]] = Type.TIMES;
            enum$VALUES[Type.lIIllIllIIIIlI[3]] = Type.CLEAR;
            enum$VALUES[Type.lIIllIllIIIIlI[4]] = Type.RESET;
            ENUM$VALUES = enum$VALUES;
        }
        
        public static Type byName(final String lllllllllllllIIlIlIIllllIIIIIIlI) {
            final String lllllllllllllIIlIlIIlllIllllllII;
            final short lllllllllllllIIlIlIIlllIllllllIl = (short)((Type[])(Object)(lllllllllllllIIlIlIIlllIllllllII = (String)(Object)values())).length;
            double lllllllllllllIIlIlIIlllIlllllllI = Type.lIIllIllIIIIlI[0];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
            while (!llIllIIllIIlIlI((int)lllllllllllllIIlIlIIlllIlllllllI, lllllllllllllIIlIlIIlllIllllllIl)) {
                final Type lllllllllllllIIlIlIIllllIIIIIIIl = lllllllllllllIIlIlIIlllIllllllII[lllllllllllllIIlIlIIlllIlllllllI];
                if (llIllIIllIIlIIl(lllllllllllllIIlIlIIllllIIIIIIIl.name().equalsIgnoreCase(lllllllllllllIIlIlIIllllIIIIIIlI) ? 1 : 0)) {
                    return lllllllllllllIIlIlIIllllIIIIIIIl;
                }
                ++lllllllllllllIIlIlIIlllIlllllllI;
            }
            return Type.TITLE;
        }
        
        private Type(final String lllllllllllllIIlIlIIllllIIIIlIIl, final int lllllllllllllIIlIlIIllllIIIIlIII) {
        }
        
        private static boolean llIllIIllIIlIll(final int lllllllllllllIIlIlIIlllIlIlllIIl, final int lllllllllllllIIlIlIIlllIlIlllIII) {
            return lllllllllllllIIlIlIIlllIlIlllIIl < lllllllllllllIIlIlIIlllIlIlllIII;
        }
        
        private static boolean llIllIIllIIlIIl(final int lllllllllllllIIlIlIIlllIlIllIllI) {
            return lllllllllllllIIlIlIIlllIlIllIllI != 0;
        }
        
        public static String[] getNames() {
            final String[] lllllllllllllIIlIlIIlllIllllIlIl = new String[values().length];
            int lllllllllllllIIlIlIIlllIllllIlII = Type.lIIllIllIIIIlI[0];
            final char lllllllllllllIIlIlIIlllIlllIllIl;
            final double lllllllllllllIIlIlIIlllIlllIlllI = ((Type[])(Object)(lllllllllllllIIlIlIIlllIlllIllIl = (char)(Object)values())).length;
            short lllllllllllllIIlIlIIlllIlllIllll = (short)Type.lIIllIllIIIIlI[0];
            "".length();
            if (((0x51 ^ 0x10) & ~(0xF1 ^ 0xB0)) >= " ".length()) {
                return null;
            }
            while (!llIllIIllIIlIlI(lllllllllllllIIlIlIIlllIlllIllll, (int)lllllllllllllIIlIlIIlllIlllIlllI)) {
                final Type lllllllllllllIIlIlIIlllIllllIIll = lllllllllllllIIlIlIIlllIlllIllIl[lllllllllllllIIlIlIIlllIlllIllll];
                lllllllllllllIIlIlIIlllIllllIlIl[lllllllllllllIIlIlIIlllIllllIlII++] = lllllllllllllIIlIlIIlllIllllIIll.name().toLowerCase();
                ++lllllllllllllIIlIlIIlllIlllIllll;
            }
            return lllllllllllllIIlIlIIlllIllllIlIl;
        }
        
        private static boolean llIllIIllIIlIlI(final int lllllllllllllIIlIlIIlllIlIllllIl, final int lllllllllllllIIlIlIIlllIlIllllII) {
            return lllllllllllllIIlIlIIlllIlIllllIl >= lllllllllllllIIlIlIIlllIlIllllII;
        }
        
        private static String llIllIIllIIIlIl(final String lllllllllllllIIlIlIIlllIllIlllIl, final String lllllllllllllIIlIlIIlllIllIlllII) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIIlllIlllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlllIllIlllII.getBytes(StandardCharsets.UTF_8)), Type.lIIllIllIIIIlI[6]), "DES");
                final Cipher lllllllllllllIIlIlIIlllIllIlllll = Cipher.getInstance("DES");
                lllllllllllllIIlIlIIlllIllIlllll.init(Type.lIIllIllIIIIlI[2], lllllllllllllIIlIlIIlllIlllIIIII);
                return new String(lllllllllllllIIlIlIIlllIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlllIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIIlllIllIllllI) {
                lllllllllllllIIlIlIIlllIllIllllI.printStackTrace();
                return null;
            }
        }
        
        private static void llIllIIllIIlIII() {
            (lIIllIllIIIIlI = new int[7])[0] = ((0x13 ^ 0x4E ^ (0x62 ^ 0x1C)) & (132 + 35 - 87 + 60 ^ 52 + 40 + 67 + 16 ^ -" ".length()));
            Type.lIIllIllIIIIlI[1] = " ".length();
            Type.lIIllIllIIIIlI[2] = "  ".length();
            Type.lIIllIllIIIIlI[3] = "   ".length();
            Type.lIIllIllIIIIlI[4] = (0x2 ^ 0x6);
            Type.lIIllIllIIIIlI[5] = (100 + 91 - 65 + 7 ^ 90 + 72 - 42 + 8);
            Type.lIIllIllIIIIlI[6] = (63 + 27 + 98 + 12 ^ 31 + 36 + 101 + 24);
        }
        
        private static String llIllIIllIIIllI(String lllllllllllllIIlIlIIlllIllIIlIII, final String lllllllllllllIIlIlIIlllIllIIIlll) {
            lllllllllllllIIlIlIIlllIllIIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIlllIllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIIlllIllIIlIll = new StringBuilder();
            final char[] lllllllllllllIIlIlIIlllIllIIlIlI = lllllllllllllIIlIlIIlllIllIIIlll.toCharArray();
            int lllllllllllllIIlIlIIlllIllIIlIIl = Type.lIIllIllIIIIlI[0];
            final char lllllllllllllIIlIlIIlllIllIIIIll = (Object)lllllllllllllIIlIlIIlllIllIIlIII.toCharArray();
            final Exception lllllllllllllIIlIlIIlllIllIIIIlI = (Exception)lllllllllllllIIlIlIIlllIllIIIIll.length;
            boolean lllllllllllllIIlIlIIlllIllIIIIIl = Type.lIIllIllIIIIlI[0] != 0;
            while (llIllIIllIIlIll(lllllllllllllIIlIlIIlllIllIIIIIl ? 1 : 0, (int)lllllllllllllIIlIlIIlllIllIIIIlI)) {
                final char lllllllllllllIIlIlIIlllIllIIlllI = lllllllllllllIIlIlIIlllIllIIIIll[lllllllllllllIIlIlIIlllIllIIIIIl];
                lllllllllllllIIlIlIIlllIllIIlIll.append((char)(lllllllllllllIIlIlIIlllIllIIlllI ^ lllllllllllllIIlIlIIlllIllIIlIlI[lllllllllllllIIlIlIIlllIllIIlIIl % lllllllllllllIIlIlIIlllIllIIlIlI.length]));
                "".length();
                ++lllllllllllllIIlIlIIlllIllIIlIIl;
                ++lllllllllllllIIlIlIIlllIllIIIIIl;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIIlllIllIIlIll);
        }
        
        private static void llIllIIllIIIlll() {
            (lIIllIllIIIIIl = new String[Type.lIIllIllIIIIlI[5]])[Type.lIIllIllIIIIlI[0]] = llIllIIllIIIlIl("hTw/6/v1MRs=", "gxKBa");
            Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[1]] = llIllIIllIIIlIl("2cdvdjNnoagElR65RxsHEQ==", "tDWBA");
            Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[2]] = llIllIIllIIIllI("OR41JjQ=", "mWxcg");
            Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[3]] = llIllIIllIIIllI("Cj40DDE=", "IrqMc");
            Type.lIIllIllIIIIIl[Type.lIIllIllIIIIlI[4]] = llIllIIllIIIlIl("ZCHivnZmEEE=", "bLVtb");
        }
    }
}
