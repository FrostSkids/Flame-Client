// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S44PacketWorldBorder implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int size;
    private /* synthetic */ Action action;
    private /* synthetic */ double centerZ;
    private /* synthetic */ double diameter;
    private /* synthetic */ int warningDistance;
    private static final /* synthetic */ int[] lllIlIllllIIll;
    private /* synthetic */ double centerX;
    private /* synthetic */ double targetSize;
    private /* synthetic */ long timeUntilTarget;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action;
    private /* synthetic */ int warningTime;
    
    private static void lIlIIIlllIlIlIIl() {
        (lllIlIllllIIll = new int[6])[0] = (0xA1 ^ 0xA5);
        S44PacketWorldBorder.lllIlIllllIIll[1] = "  ".length();
        S44PacketWorldBorder.lllIlIllllIIll[2] = "   ".length();
        S44PacketWorldBorder.lllIlIllllIIll[3] = " ".length();
        S44PacketWorldBorder.lllIlIllllIIll[4] = (0x8F ^ 0xB1 ^ (0xB8 ^ 0x80));
        S44PacketWorldBorder.lllIlIllllIIll[5] = (156 + 4 - 66 + 90 ^ 132 + 25 - 42 + 74);
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllIlIIlIIllllllII) throws IOException {
        llllllllllllIlIllIlIIlIIllllllII.writeEnumValue(this.action);
        switch ($SWITCH_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action()[this.action.ordinal()]) {
            case 1: {
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.targetSize);
                "".length();
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.diameter);
                "".length();
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.targetSize);
                "".length();
                llllllllllllIlIllIlIIlIIllllllII.writeVarLong(this.timeUntilTarget);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 3: {
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.centerX);
                "".length();
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.centerZ);
                "".length();
                "".length();
                if ((0x79 ^ 0x22 ^ (0x5F ^ 0x0)) <= 0) {
                    return;
                }
                break;
            }
            case 6: {
                llllllllllllIlIllIlIIlIIllllllII.writeVarIntToBuffer(this.warningDistance);
                "".length();
                if (-" ".length() == (0xB2 ^ 0xB6)) {
                    return;
                }
                break;
            }
            case 5: {
                llllllllllllIlIllIlIIlIIllllllII.writeVarIntToBuffer(this.warningTime);
                "".length();
                if ((0x8B ^ 0x8E ^ " ".length()) < 0) {
                    return;
                }
                break;
            }
            case 4: {
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.centerX);
                "".length();
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.centerZ);
                "".length();
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.diameter);
                "".length();
                llllllllllllIlIllIlIIlIIllllllII.writeDouble(this.targetSize);
                "".length();
                llllllllllllIlIllIlIIlIIllllllII.writeVarLong(this.timeUntilTarget);
                llllllllllllIlIllIlIIlIIllllllII.writeVarIntToBuffer(this.size);
                llllllllllllIlIllIlIIlIIllllllII.writeVarIntToBuffer(this.warningDistance);
                llllllllllllIlIllIlIIlIIllllllII.writeVarIntToBuffer(this.warningTime);
                break;
            }
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action() {
        final int[] $switch_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action = S44PacketWorldBorder.$SWITCH_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action;
        if (lIlIIIlllIlIllII($switch_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action)) {
            return $switch_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action;
        }
        "".length();
        final int llllllllllllIlIllIlIIlIIllIlIIlI = (Object)new int[Action.values().length];
        try {
            llllllllllllIlIllIlIIlIIllIlIIlI[Action.INITIALIZE.ordinal()] = S44PacketWorldBorder.lllIlIllllIIll[0];
            "".length();
            if (((0x73 ^ 0x3D) & ~(0x50 ^ 0x1E)) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIlIIlIIllIlIIlI[Action.LERP_SIZE.ordinal()] = S44PacketWorldBorder.lllIlIllllIIll[1];
            "".length();
            if (((0x90 ^ 0xB0) & ~(0x85 ^ 0xA5)) < ("   ".length() & ~"   ".length())) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIlIIlIIllIlIIlI[Action.SET_CENTER.ordinal()] = S44PacketWorldBorder.lllIlIllllIIll[2];
            "".length();
            if (-(119 + 72 - 167 + 118 ^ 131 + 26 - 95 + 76) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIlIIlIIllIlIIlI[Action.SET_SIZE.ordinal()] = S44PacketWorldBorder.lllIlIllllIIll[3];
            "".length();
            if ((0x1D ^ 0x19) < " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIllIlIIlIIllIlIIlI[Action.SET_WARNING_BLOCKS.ordinal()] = S44PacketWorldBorder.lllIlIllllIIll[4];
            "".length();
            if ((0x69 ^ 0x6D) > (0x6F ^ 0x6B)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIllIlIIlIIllIlIIlI[Action.SET_WARNING_TIME.ordinal()] = S44PacketWorldBorder.lllIlIllllIIll[5];
            "".length();
            if ("  ".length() == (0x71 ^ 0x6F ^ (0x3B ^ 0x21))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return S44PacketWorldBorder.$SWITCH_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action = (int[])(Object)llllllllllllIlIllIlIIlIIllIlIIlI;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIllIlIIlIIllllIIll) {
        llllllllllllIlIllIlIIlIIllllIIll.handleWorldBorder(this);
    }
    
    private static int lIlIIIlllIlIlIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllIlIIlIlIIIIIIlI) throws IOException {
        this.action = llllllllllllIlIllIlIIlIlIIIIIIlI.readEnumValue(Action.class);
        switch ($SWITCH_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action()[this.action.ordinal()]) {
            case 1: {
                this.targetSize = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                "".length();
                if (-" ".length() > ((0x13 ^ 0x23) & ~(0xD ^ 0x3D))) {
                    return;
                }
                break;
            }
            case 2: {
                this.diameter = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                this.targetSize = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                this.timeUntilTarget = llllllllllllIlIllIlIIlIlIIIIIIlI.readVarLong();
                "".length();
                if ((146 + 44 - 80 + 56 ^ 149 + 43 - 148 + 118) < "   ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                this.centerX = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                this.centerZ = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                "".length();
                if ((0x4F ^ 0x4B) <= -" ".length()) {
                    return;
                }
                break;
            }
            case 6: {
                this.warningDistance = llllllllllllIlIllIlIIlIlIIIIIIlI.readVarIntFromBuffer();
                "".length();
                if (((0xEA ^ 0xC3) & ~(0x85 ^ 0xAC)) < ((0x4 ^ 0xF) & ~(0xBB ^ 0xB0))) {
                    return;
                }
                break;
            }
            case 5: {
                this.warningTime = llllllllllllIlIllIlIIlIlIIIIIIlI.readVarIntFromBuffer();
                "".length();
                if ((0x13 ^ 0x75 ^ (0xE9 ^ 0x8B)) <= " ".length()) {
                    return;
                }
                break;
            }
            case 4: {
                this.centerX = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                this.centerZ = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                this.diameter = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                this.targetSize = llllllllllllIlIllIlIIlIlIIIIIIlI.readDouble();
                this.timeUntilTarget = llllllllllllIlIllIlIIlIlIIIIIIlI.readVarLong();
                this.size = llllllllllllIlIllIlIIlIlIIIIIIlI.readVarIntFromBuffer();
                this.warningDistance = llllllllllllIlIllIlIIlIlIIIIIIlI.readVarIntFromBuffer();
                this.warningTime = llllllllllllIlIllIlIIlIlIIIIIIlI.readVarIntFromBuffer();
                break;
            }
        }
    }
    
    private static boolean lIlIIIlllIlIllII(final Object llllllllllllIlIllIlIIlIIllIlIIII) {
        return llllllllllllIlIllIlIIlIIllIlIIII != null;
    }
    
    public S44PacketWorldBorder(final WorldBorder llllllllllllIlIllIlIIlIlIIIIIlll, final Action llllllllllllIlIllIlIIlIlIIIIIllI) {
        this.action = llllllllllllIlIllIlIIlIlIIIIIllI;
        this.centerX = llllllllllllIlIllIlIIlIlIIIIIlll.getCenterX();
        this.centerZ = llllllllllllIlIllIlIIlIlIIIIIlll.getCenterZ();
        this.diameter = llllllllllllIlIllIlIIlIlIIIIIlll.getDiameter();
        this.targetSize = llllllllllllIlIllIlIIlIlIIIIIlll.getTargetSize();
        this.timeUntilTarget = llllllllllllIlIllIlIIlIlIIIIIlll.getTimeUntilTarget();
        this.size = llllllllllllIlIllIlIIlIlIIIIIlll.getSize();
        this.warningDistance = llllllllllllIlIllIlIIlIlIIIIIlll.getWarningDistance();
        this.warningTime = llllllllllllIlIllIlIIlIlIIIIIlll.getWarningTime();
    }
    
    public void func_179788_a(final WorldBorder llllllllllllIlIllIlIIlIIllIllllI) {
        switch ($SWITCH_TABLE$net$minecraft$network$play$server$S44PacketWorldBorder$Action()[this.action.ordinal()]) {
            case 1: {
                llllllllllllIlIllIlIIlIIllIllllI.setTransition(this.targetSize);
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIlIllIlIIlIIllIllllI.setTransition(this.diameter, this.targetSize, this.timeUntilTarget);
                "".length();
                if ((0x8B ^ 0xA9 ^ (0x7E ^ 0x58)) < -" ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                llllllllllllIlIllIlIIlIIllIllllI.setCenter(this.centerX, this.centerZ);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 6: {
                llllllllllllIlIllIlIIlIIllIllllI.setWarningDistance(this.warningDistance);
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
                break;
            }
            case 5: {
                llllllllllllIlIllIlIIlIIllIllllI.setWarningTime(this.warningTime);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 4: {
                llllllllllllIlIllIlIIlIIllIllllI.setCenter(this.centerX, this.centerZ);
                if (lIlIIIlllIlIlIll(lIlIIIlllIlIlIlI(this.timeUntilTarget, 0L))) {
                    llllllllllllIlIllIlIIlIIllIllllI.setTransition(this.diameter, this.targetSize, this.timeUntilTarget);
                    "".length();
                    if (((0x28 ^ 0x31 ^ (0x73 ^ 0x42)) & (0xF8 ^ 0xA7 ^ (0xF0 ^ 0x87) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIllIlIIlIIllIllllI.setTransition(this.targetSize);
                }
                llllllllllllIlIllIlIIlIIllIllllI.setSize(this.size);
                llllllllllllIlIllIlIIlIIllIllllI.setWarningDistance(this.warningDistance);
                llllllllllllIlIllIlIIlIIllIllllI.setWarningTime(this.warningTime);
                break;
            }
        }
    }
    
    static {
        lIlIIIlllIlIlIIl();
    }
    
    private static boolean lIlIIIlllIlIlIll(final int llllllllllllIlIllIlIIlIIllIIllII) {
        return llllllllllllIlIllIlIIlIIllIIllII > 0;
    }
    
    public S44PacketWorldBorder() {
    }
    
    public enum Action
    {
        LERP_SIZE(Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[1]], Action.lIlIlIlIIlIIII[1]);
        
        private static final /* synthetic */ int[] lIlIlIlIIlIIII;
        private static final /* synthetic */ String[] lIlIlIlIIIllll;
        
        SET_WARNING_TIME(Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[4]], Action.lIlIlIlIIlIIII[4]), 
        INITIALIZE(Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[3]], Action.lIlIlIlIIlIIII[3]), 
        SET_SIZE(Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[0]], Action.lIlIlIlIIlIIII[0]), 
        SET_CENTER(Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[2]], Action.lIlIlIlIIlIIII[2]), 
        SET_WARNING_BLOCKS(Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[5]], Action.lIlIlIlIIlIIII[5]);
        
        private static boolean lllIllIlllIlIll(final int lllllllllllllIIIlIIIlIIIlIIIIIIl, final int lllllllllllllIIIlIIIlIIIlIIIIIII) {
            return lllllllllllllIIIlIIIlIIIlIIIIIIl < lllllllllllllIIIlIIIlIIIlIIIIIII;
        }
        
        static {
            lllIllIlllIlIlI();
            lllIllIlllIlIIl();
            final Action[] enum$VALUES = new Action[Action.lIlIlIlIIlIIII[6]];
            enum$VALUES[Action.lIlIlIlIIlIIII[0]] = Action.SET_SIZE;
            enum$VALUES[Action.lIlIlIlIIlIIII[1]] = Action.LERP_SIZE;
            enum$VALUES[Action.lIlIlIlIIlIIII[2]] = Action.SET_CENTER;
            enum$VALUES[Action.lIlIlIlIIlIIII[3]] = Action.INITIALIZE;
            enum$VALUES[Action.lIlIlIlIIlIIII[4]] = Action.SET_WARNING_TIME;
            enum$VALUES[Action.lIlIlIlIIlIIII[5]] = Action.SET_WARNING_BLOCKS;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lllIllIlllIlIIl() {
            (lIlIlIlIIIllll = new String[Action.lIlIlIlIIlIIII[6]])[Action.lIlIlIlIIlIIII[0]] = lllIllIlllIIlll("5JWKkeLz5EmoBcoQXAChCQ==", "bXCVB");
            Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[1]] = lllIllIlllIIlll("c0fYme4jHkfeNZ5hjyNO3g==", "dLSkd");
            Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[2]] = lllIllIlllIlIII("MBQaPg4mHxokHw==", "cQNaM");
            Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[3]] = lllIllIlllIIlll("A5XIe1lZNnxleetgZqyVow==", "vSvIO");
            Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[4]] = lllIllIlllIlIII("JD8aHCA2KAAKOTAlGgo6Mg==", "wzNCw");
            Action.lIlIlIlIIIllll[Action.lIlIlIlIIlIIII[5]] = lllIllIlllIIlll("zPNE/bCHdvRRSDhgVQIB54w0LnHJ/aI5", "TBZPE");
        }
        
        private Action(final String lllllllllllllIIIlIIIlIIIlIllIIlI, final int lllllllllllllIIIlIIIlIIIlIllIIIl) {
        }
        
        private static void lllIllIlllIlIlI() {
            (lIlIlIlIIlIIII = new int[7])[0] = ((0x14 ^ 0x70 ^ (0x4F ^ 0x23)) & (98 + 61 - 55 + 41 ^ 111 + 106 - 81 + 17 ^ -" ".length()));
            Action.lIlIlIlIIlIIII[1] = " ".length();
            Action.lIlIlIlIIlIIII[2] = "  ".length();
            Action.lIlIlIlIIlIIII[3] = "   ".length();
            Action.lIlIlIlIIlIIII[4] = (157 + 80 - 106 + 61 ^ 118 + 149 - 185 + 114);
            Action.lIlIlIlIIlIIII[5] = (38 + 90 - 90 + 154 ^ 87 + 7 + 37 + 66);
            Action.lIlIlIlIIlIIII[6] = (0x6D ^ 0x47 ^ (0x33 ^ 0x1F));
        }
        
        private static String lllIllIlllIlIII(String lllllllllllllIIIlIIIlIIIlIIllllI, final String lllllllllllllIIIlIIIlIIIlIIlllIl) {
            lllllllllllllIIIlIIIlIIIlIIllllI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIIIlIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIlIIIlIIIlIIlllII = new StringBuilder();
            final char[] lllllllllllllIIIlIIIlIIIlIIllIll = lllllllllllllIIIlIIIlIIIlIIlllIl.toCharArray();
            int lllllllllllllIIIlIIIlIIIlIIllIlI = Action.lIlIlIlIIlIIII[0];
            final byte lllllllllllllIIIlIIIlIIIlIIlIlII = (Object)lllllllllllllIIIlIIIlIIIlIIllllI.toCharArray();
            final String lllllllllllllIIIlIIIlIIIlIIlIIll = (String)lllllllllllllIIIlIIIlIIIlIIlIlII.length;
            long lllllllllllllIIIlIIIlIIIlIIlIIlI = Action.lIlIlIlIIlIIII[0];
            while (lllIllIlllIlIll((int)lllllllllllllIIIlIIIlIIIlIIlIIlI, (int)lllllllllllllIIIlIIIlIIIlIIlIIll)) {
                final char lllllllllllllIIIlIIIlIIIlIIlllll = lllllllllllllIIIlIIIlIIIlIIlIlII[lllllllllllllIIIlIIIlIIIlIIlIIlI];
                lllllllllllllIIIlIIIlIIIlIIlllII.append((char)(lllllllllllllIIIlIIIlIIIlIIlllll ^ lllllllllllllIIIlIIIlIIIlIIllIll[lllllllllllllIIIlIIIlIIIlIIllIlI % lllllllllllllIIIlIIIlIIIlIIllIll.length]));
                "".length();
                ++lllllllllllllIIIlIIIlIIIlIIllIlI;
                ++lllllllllllllIIIlIIIlIIIlIIlIIlI;
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIlIIIlIIIlIIlllII);
        }
        
        private static String lllIllIlllIIlll(final String lllllllllllllIIIlIIIlIIIlIIIIlll, final String lllllllllllllIIIlIIIlIIIlIIIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIIlIIIlIIIlIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIlIIIlIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlIIIlIIIlIIIlIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlIIIlIIIlIIIlIll.init(Action.lIlIlIlIIlIIII[2], lllllllllllllIIIlIIIlIIIlIIIllII);
                return new String(lllllllllllllIIIlIIIlIIIlIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIlIIIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIIIlIIIlIIIlIlI) {
                lllllllllllllIIIlIIIlIIIlIIIlIlI.printStackTrace();
                return null;
            }
        }
    }
}
