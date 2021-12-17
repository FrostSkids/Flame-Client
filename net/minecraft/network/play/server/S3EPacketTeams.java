// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Iterator;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import com.google.common.collect.Lists;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.ScorePlayerTeam;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S3EPacketTeams implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ Collection<String> field_149317_e;
    private /* synthetic */ String field_179816_e;
    private /* synthetic */ String field_149318_b;
    private /* synthetic */ String field_149319_c;
    private static final /* synthetic */ int[] lllIllIlIIIllI;
    private static final /* synthetic */ String[] lllIllIlIIIlIl;
    private /* synthetic */ String field_149316_d;
    private /* synthetic */ int field_149315_g;
    private /* synthetic */ int field_149314_f;
    private /* synthetic */ int field_179815_f;
    private /* synthetic */ String field_149320_a;
    
    private static String lIlIIlIIlIllIlII(String llllllllllllIlIllIIlIIllIlIlIllI, final String llllllllllllIlIllIIlIIllIlIllIlI) {
        llllllllllllIlIllIIlIIllIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlIIllIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIIllIlIllIIl = new StringBuilder();
        final char[] llllllllllllIlIllIIlIIllIlIllIII = llllllllllllIlIllIIlIIllIlIllIlI.toCharArray();
        int llllllllllllIlIllIIlIIllIlIlIlll = S3EPacketTeams.lllIllIlIIIllI[0];
        final int llllllllllllIlIllIIlIIllIlIlIIIl = (Object)llllllllllllIlIllIIlIIllIlIlIllI.toCharArray();
        final long llllllllllllIlIllIIlIIllIlIlIIII = llllllllllllIlIllIIlIIllIlIlIIIl.length;
        Exception llllllllllllIlIllIIlIIllIlIIllll = (Exception)S3EPacketTeams.lllIllIlIIIllI[0];
        while (lIlIIlIIlIllllll((int)llllllllllllIlIllIIlIIllIlIIllll, (int)llllllllllllIlIllIIlIIllIlIlIIII)) {
            final char llllllllllllIlIllIIlIIllIlIlllII = llllllllllllIlIllIIlIIllIlIlIIIl[llllllllllllIlIllIIlIIllIlIIllll];
            llllllllllllIlIllIIlIIllIlIllIIl.append((char)(llllllllllllIlIllIIlIIllIlIlllII ^ llllllllllllIlIllIIlIIllIlIllIII[llllllllllllIlIllIIlIIllIlIlIlll % llllllllllllIlIllIIlIIllIlIllIII.length]));
            "".length();
            ++llllllllllllIlIllIIlIIllIlIlIlll;
            ++llllllllllllIlIllIIlIIllIlIIllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIIllIlIllIIl);
    }
    
    private static void lIlIIlIIlIllIlll() {
        (lllIllIlIIIlIl = new String[S3EPacketTeams.lllIllIlIIIllI[18]])[S3EPacketTeams.lllIllIlIIIllI[0]] = lIlIIlIIlIllIlII("", "oLKQt");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[1]] = lIlIIlIIlIllIlII("", "Fsqjz");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[2]] = lIlIIlIIlIllIlIl("Towy+L7Y9t4=", "CrGBE");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[3]] = lIlIIlIIlIllIllI("G03UnQr7zYg=", "clmLK");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[5]] = lIlIIlIIlIllIlII("", "GjFRG");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[6]] = lIlIIlIIlIllIllI("cNMgPr5t/wo=", "RAfXR");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[7]] = lIlIIlIIlIllIllI("19kxS8Ri2zE=", "aVQLy");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[8]] = lIlIIlIIlIllIlII("", "ZXOCP");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[9]] = lIlIIlIIlIllIllI("v5ET9hfu/aA=", "GnZSd");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[10]] = lIlIIlIIlIllIllI("CsvwNqWYBOQ=", "dPSFu");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[11]] = lIlIIlIIlIllIlII("", "ZNJNR");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[12]] = lIlIIlIIlIllIllI("wJb4SMsXjPo=", "nBEVz");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[13]] = lIlIIlIIlIllIllI("ekL1kHN5NJ3gNsTf717V0CtUuZvN3q6fviGQlQ1dGfXk+ZS3aIYqSM7L7c/gODTV9Nqd4Cvj6Os=", "LcgbH");
        S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[14]] = lIlIIlIIlIllIlIl("LXTTba0HR6v9rBAvj3N9yB9MK07zwX9+CoaXtKuU8iQ=", "LFvYe");
    }
    
    public String func_179814_i() {
        return this.field_179816_e;
    }
    
    public String func_149311_e() {
        return this.field_149319_c;
    }
    
    private static boolean lIlIIlIIlIlllllI(final int llllllllllllIlIllIIlIIllIIlllIlI, final int llllllllllllIlIllIIlIIllIIlllIIl) {
        return llllllllllllIlIllIIlIIllIIlllIlI >= llllllllllllIlIllIIlIIllIIlllIIl;
    }
    
    static {
        lIlIIlIIlIlllIII();
        lIlIIlIIlIllIlll();
    }
    
    public String func_149306_d() {
        return this.field_149318_b;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIllIIlIIlllIIlIIlI) {
        llllllllllllIlIllIIlIIlllIIlIIlI.handleTeams(this);
    }
    
    private static boolean lIlIIlIIlIlllIll(final int llllllllllllIlIllIIlIIllIIlIllll) {
        return llllllllllllIlIllIIlIIllIIlIllll == 0;
    }
    
    public S3EPacketTeams(final ScorePlayerTeam llllllllllllIlIllIIlIIlllIllllII, final int llllllllllllIlIllIIlIIlllIlllllI) {
        this.field_149320_a = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[5]];
        this.field_149318_b = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[6]];
        this.field_149319_c = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[7]];
        this.field_149316_d = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[8]];
        this.field_179816_e = Team.EnumVisible.ALWAYS.field_178830_e;
        this.field_179815_f = S3EPacketTeams.lllIllIlIIIllI[4];
        this.field_149317_e = (Collection<String>)Lists.newArrayList();
        this.field_149320_a = llllllllllllIlIllIIlIIlllIllllII.getRegisteredName();
        this.field_149314_f = llllllllllllIlIllIIlIIlllIlllllI;
        if (!lIlIIlIIlIlllIIl(llllllllllllIlIllIIlIIlllIlllllI) || lIlIIlIIlIlllIlI(llllllllllllIlIllIIlIIlllIlllllI, S3EPacketTeams.lllIllIlIIIllI[2])) {
            this.field_149318_b = llllllllllllIlIllIIlIIlllIllllII.getTeamName();
            this.field_149319_c = llllllllllllIlIllIIlIIlllIllllII.getColorPrefix();
            this.field_149316_d = llllllllllllIlIllIIlIIlllIllllII.getColorSuffix();
            this.field_149315_g = llllllllllllIlIllIIlIIlllIllllII.func_98299_i();
            this.field_179816_e = llllllllllllIlIllIIlIIlllIllllII.getNameTagVisibility().field_178830_e;
            this.field_179815_f = llllllllllllIlIllIIlIIlllIllllII.getChatFormat().getColorIndex();
        }
        if (lIlIIlIIlIlllIll(llllllllllllIlIllIIlIIlllIlllllI)) {
            this.field_149317_e.addAll(llllllllllllIlIllIIlIIlllIllllII.getMembershipCollection());
            "".length();
        }
    }
    
    public String func_149309_f() {
        return this.field_149316_d;
    }
    
    private static void lIlIIlIIlIlllIII() {
        (lllIllIlIIIllI = new int[19])[0] = ((0xA ^ 0x3B) & ~(0x44 ^ 0x75));
        S3EPacketTeams.lllIllIlIIIllI[1] = " ".length();
        S3EPacketTeams.lllIllIlIIIllI[2] = "  ".length();
        S3EPacketTeams.lllIllIlIIIllI[3] = "   ".length();
        S3EPacketTeams.lllIllIlIIIllI[4] = -" ".length();
        S3EPacketTeams.lllIllIlIIIllI[5] = (167 + 79 - 169 + 112 ^ 51 + 141 - 93 + 86);
        S3EPacketTeams.lllIllIlIIIllI[6] = (0x81 ^ 0x84);
        S3EPacketTeams.lllIllIlIIIllI[7] = (151 + 173 - 320 + 171 ^ 42 + 108 - 145 + 164);
        S3EPacketTeams.lllIllIlIIIllI[8] = (0xAB ^ 0xAC);
        S3EPacketTeams.lllIllIlIIIllI[9] = (((0x61 ^ 0x6B) & ~(0xAA ^ 0xA0)) ^ (0x2F ^ 0x27));
        S3EPacketTeams.lllIllIlIIIllI[10] = (77 + 158 - 191 + 123 ^ 24 + 138 - 43 + 55);
        S3EPacketTeams.lllIllIlIIIllI[11] = (0x43 ^ 0x72 ^ (0x66 ^ 0x5D));
        S3EPacketTeams.lllIllIlIIIllI[12] = (108 + 58 - 94 + 77 ^ 77 + 10 - 74 + 145);
        S3EPacketTeams.lllIllIlIIIllI[13] = (0x4A ^ 0x46);
        S3EPacketTeams.lllIllIlIIIllI[14] = (0x6C ^ 0x61);
        S3EPacketTeams.lllIllIlIIIllI[15] = (0x21 ^ 0x31);
        S3EPacketTeams.lllIllIlIIIllI[16] = (0x3 ^ 0x23);
        S3EPacketTeams.lllIllIlIIIllI[17] = (0x8A ^ 0xA2);
        S3EPacketTeams.lllIllIlIIIllI[18] = (115 + 69 - 148 + 150 ^ 177 + 78 - 81 + 6);
    }
    
    public int func_179813_h() {
        return this.field_179815_f;
    }
    
    public S3EPacketTeams() {
        this.field_149320_a = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[0]];
        this.field_149318_b = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[1]];
        this.field_149319_c = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[2]];
        this.field_149316_d = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[3]];
        this.field_179816_e = Team.EnumVisible.ALWAYS.field_178830_e;
        this.field_179815_f = S3EPacketTeams.lllIllIlIIIllI[4];
        this.field_149317_e = (Collection<String>)Lists.newArrayList();
    }
    
    public String func_149312_c() {
        return this.field_149320_a;
    }
    
    private static boolean lIlIIlIIlIlllIlI(final int llllllllllllIlIllIIlIIllIIlllllI, final int llllllllllllIlIllIIlIIllIIllllIl) {
        return llllllllllllIlIllIIlIIllIIlllllI == llllllllllllIlIllIIlIIllIIllllIl;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllIIlIIlllIlIlIIl) throws IOException {
        this.field_149320_a = llllllllllllIlIllIIlIIlllIlIlIIl.readStringFromBuffer(S3EPacketTeams.lllIllIlIIIllI[15]);
        this.field_149314_f = llllllllllllIlIllIIlIIlllIlIlIIl.readByte();
        if (!lIlIIlIIlIlllIIl(this.field_149314_f) || lIlIIlIIlIlllIlI(this.field_149314_f, S3EPacketTeams.lllIllIlIIIllI[2])) {
            this.field_149318_b = llllllllllllIlIllIIlIIlllIlIlIIl.readStringFromBuffer(S3EPacketTeams.lllIllIlIIIllI[16]);
            this.field_149319_c = llllllllllllIlIllIIlIIlllIlIlIIl.readStringFromBuffer(S3EPacketTeams.lllIllIlIIIllI[15]);
            this.field_149316_d = llllllllllllIlIllIIlIIlllIlIlIIl.readStringFromBuffer(S3EPacketTeams.lllIllIlIIIllI[15]);
            this.field_149315_g = llllllllllllIlIllIIlIIlllIlIlIIl.readByte();
            this.field_179816_e = llllllllllllIlIllIIlIIlllIlIlIIl.readStringFromBuffer(S3EPacketTeams.lllIllIlIIIllI[16]);
            this.field_179815_f = llllllllllllIlIllIIlIIlllIlIlIIl.readByte();
        }
        if (!lIlIIlIIlIlllIIl(this.field_149314_f) || !lIlIIlIIlIllllII(this.field_149314_f, S3EPacketTeams.lllIllIlIIIllI[3]) || lIlIIlIIlIlllIlI(this.field_149314_f, S3EPacketTeams.lllIllIlIIIllI[5])) {
            final int llllllllllllIlIllIIlIIlllIlIlIII = llllllllllllIlIllIIlIIlllIlIlIIl.readVarIntFromBuffer();
            int llllllllllllIlIllIIlIIlllIlIIlll = S3EPacketTeams.lllIllIlIIIllI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIlIIlIlllllI(llllllllllllIlIllIIlIIlllIlIIlll, llllllllllllIlIllIIlIIlllIlIlIII)) {
                this.field_149317_e.add(llllllllllllIlIllIIlIIlllIlIlIIl.readStringFromBuffer(S3EPacketTeams.lllIllIlIIIllI[17]));
                "".length();
                ++llllllllllllIlIllIIlIIlllIlIIlll;
            }
        }
    }
    
    public Collection<String> func_149310_g() {
        return this.field_149317_e;
    }
    
    private static boolean lIlIIlIIlIllllII(final int llllllllllllIlIllIIlIIllIIlIllII, final int llllllllllllIlIllIIlIIllIIlIlIll) {
        return llllllllllllIlIllIIlIIllIIlIllII != llllllllllllIlIllIIlIIllIIlIlIll;
    }
    
    public S3EPacketTeams(final ScorePlayerTeam llllllllllllIlIllIIlIIlllIllIIIl, final Collection<String> llllllllllllIlIllIIlIIlllIllIIII, final int llllllllllllIlIllIIlIIlllIllIIll) {
        this.field_149320_a = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[9]];
        this.field_149318_b = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[10]];
        this.field_149319_c = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[11]];
        this.field_149316_d = S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[12]];
        this.field_179816_e = Team.EnumVisible.ALWAYS.field_178830_e;
        this.field_179815_f = S3EPacketTeams.lllIllIlIIIllI[4];
        this.field_149317_e = (Collection<String>)Lists.newArrayList();
        if (lIlIIlIIlIllllII(llllllllllllIlIllIIlIIlllIllIIll, S3EPacketTeams.lllIllIlIIIllI[3]) && lIlIIlIIlIllllII(llllllllllllIlIllIIlIIlllIllIIll, S3EPacketTeams.lllIllIlIIIllI[5])) {
            throw new IllegalArgumentException(S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[13]]);
        }
        if (!lIlIIlIIlIllllIl(llllllllllllIlIllIIlIIlllIllIIII) || !lIlIIlIIlIlllIll(llllllllllllIlIllIIlIIlllIllIIII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(S3EPacketTeams.lllIllIlIIIlIl[S3EPacketTeams.lllIllIlIIIllI[14]]);
        }
        this.field_149314_f = llllllllllllIlIllIIlIIlllIllIIll;
        this.field_149320_a = llllllllllllIlIllIIlIIlllIllIIIl.getRegisteredName();
        this.field_149317_e.addAll(llllllllllllIlIllIIlIIlllIllIIII);
        "".length();
        "".length();
        if ("  ".length() < 0) {
            throw null;
        }
    }
    
    private static boolean lIlIIlIIlIllllIl(final Object llllllllllllIlIllIIlIIllIIllIIll) {
        return llllllllllllIlIllIIlIIllIIllIIll != null;
    }
    
    public int func_149307_h() {
        return this.field_149314_f;
    }
    
    private static boolean lIlIIlIIlIllllll(final int llllllllllllIlIllIIlIIllIIllIllI, final int llllllllllllIlIllIIlIIllIIllIlIl) {
        return llllllllllllIlIllIIlIIllIIllIllI < llllllllllllIlIllIIlIIllIIllIlIl;
    }
    
    private static String lIlIIlIIlIllIlIl(final String llllllllllllIlIllIIlIIllIllIlIIl, final String llllllllllllIlIllIIlIIllIllIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIllIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIllIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIIllIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIIllIllIllIl.init(S3EPacketTeams.lllIllIlIIIllI[2], llllllllllllIlIllIIlIIllIllIlllI);
            return new String(llllllllllllIlIllIIlIIllIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIllIllIllII) {
            llllllllllllIlIllIIlIIllIllIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllIIlIIlllIIlllIl) throws IOException {
        llllllllllllIlIllIIlIIlllIIlllIl.writeString(this.field_149320_a);
        "".length();
        llllllllllllIlIllIIlIIlllIIlllIl.writeByte(this.field_149314_f);
        "".length();
        if (!lIlIIlIIlIlllIIl(this.field_149314_f) || lIlIIlIIlIlllIlI(this.field_149314_f, S3EPacketTeams.lllIllIlIIIllI[2])) {
            llllllllllllIlIllIIlIIlllIIlllIl.writeString(this.field_149318_b);
            "".length();
            llllllllllllIlIllIIlIIlllIIlllIl.writeString(this.field_149319_c);
            "".length();
            llllllllllllIlIllIIlIIlllIIlllIl.writeString(this.field_149316_d);
            "".length();
            llllllllllllIlIllIIlIIlllIIlllIl.writeByte(this.field_149315_g);
            "".length();
            llllllllllllIlIllIIlIIlllIIlllIl.writeString(this.field_179816_e);
            "".length();
            llllllllllllIlIllIIlIIlllIIlllIl.writeByte(this.field_179815_f);
            "".length();
        }
        if (!lIlIIlIIlIlllIIl(this.field_149314_f) || !lIlIIlIIlIllllII(this.field_149314_f, S3EPacketTeams.lllIllIlIIIllI[3]) || lIlIIlIIlIlllIlI(this.field_149314_f, S3EPacketTeams.lllIllIlIIIllI[5])) {
            llllllllllllIlIllIIlIIlllIIlllIl.writeVarIntToBuffer(this.field_149317_e.size());
            final boolean llllllllllllIlIllIIlIIlllIIllIII = (boolean)this.field_149317_e.iterator();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
            while (!lIlIIlIIlIlllIll(((Iterator)llllllllllllIlIllIIlIIlllIIllIII).hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllIIlIIlllIIlllII = ((Iterator<String>)llllllllllllIlIllIIlIIlllIIllIII).next();
                llllllllllllIlIllIIlIIlllIIlllIl.writeString(llllllllllllIlIllIIlIIlllIIlllII);
                "".length();
            }
        }
    }
    
    private static boolean lIlIIlIIlIlllIIl(final int llllllllllllIlIllIIlIIllIIllIIIl) {
        return llllllllllllIlIllIIlIIllIIllIIIl != 0;
    }
    
    public int func_149308_i() {
        return this.field_149315_g;
    }
    
    private static String lIlIIlIIlIllIllI(final String llllllllllllIlIllIIlIIllIlIIIlII, final String llllllllllllIlIllIIlIIllIlIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIllIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), S3EPacketTeams.lllIllIlIIIllI[9]), "DES");
            final Cipher llllllllllllIlIllIIlIIllIlIIlIII = Cipher.getInstance("DES");
            llllllllllllIlIllIIlIIllIlIIlIII.init(S3EPacketTeams.lllIllIlIIIllI[2], llllllllllllIlIllIIlIIllIlIIlIIl);
            return new String(llllllllllllIlIllIIlIIllIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIllIlIIIlll) {
            llllllllllllIlIllIIlIIllIlIIIlll.printStackTrace();
            return null;
        }
    }
}
