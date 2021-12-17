// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Iterator;
import com.google.common.base.Objects;
import java.io.IOException;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.WorldSettings;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.PacketBuffer;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetHandler;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S38PacketPlayerListItem implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ String[] lllIIIlIlIllll;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action;
    private /* synthetic */ Action action;
    private final /* synthetic */ List<AddPlayerData> players;
    private static final /* synthetic */ int[] lllIIIlIllIIII;
    
    private static String lIIlllIllIIIlIlI(final String llllllllllllIllIIIIIIllIIIIIIIll, final String llllllllllllIllIIIIIIllIIIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIllIIIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), S38PacketPlayerListItem.lllIIIlIllIIII[8]), "DES");
            final Cipher llllllllllllIllIIIIIIllIIIIIIlll = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIllIIIIIIlll.init(S38PacketPlayerListItem.lllIIIlIllIIII[6], llllllllllllIllIIIIIIllIIIIIlIII);
            return new String(llllllllllllIllIIIIIIllIIIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIllIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIllIIIIIIllI) {
            llllllllllllIllIIIIIIllIIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllIllIIIlIIl(final String llllllllllllIllIIIIIIllIIIIlIIlI, final String llllllllllllIllIIIIIIllIIIIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIllIIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIllIIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIllIIIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIllIIIIlIlII.init(S38PacketPlayerListItem.lllIIIlIllIIII[6], llllllllllllIllIIIIIIllIIIIlIlIl);
            return new String(llllllllllllIllIIIIIIllIIIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIllIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIllIIIIlIIll) {
            llllllllllllIllIIIIIIllIIIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIllIIIllIl(final int llllllllllllIllIIIIIIlIlllllllIl, final int llllllllllllIllIIIIIIlIlllllllII) {
        return llllllllllllIllIIIIIIlIlllllllIl >= llllllllllllIllIIIIIIlIlllllllII;
    }
    
    static {
        lIIlllIllIIIllII();
        lIIlllIllIIIlIll();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIIIIIIllIIIlIlIll) {
        llllllllllllIllIIIIIIllIIIlIlIll.handlePlayerListItem(this);
    }
    
    private static void lIIlllIllIIIllII() {
        (lllIIIlIllIIII = new int[9])[0] = ((0x6A ^ 0x60) & ~(0x9 ^ 0x3));
        S38PacketPlayerListItem.lllIIIlIllIIII[1] = (0x35 ^ 0x25);
        S38PacketPlayerListItem.lllIIIlIllIIII[2] = (-1 & 0x7FFF);
        S38PacketPlayerListItem.lllIIIlIllIIII[3] = " ".length();
        S38PacketPlayerListItem.lllIIIlIllIIII[4] = (107 + 99 - 117 + 44 ^ 92 + 38 - 47 + 45);
        S38PacketPlayerListItem.lllIIIlIllIIII[5] = (149 + 5 - 134 + 137 ^ 148 + 63 - 195 + 137);
        S38PacketPlayerListItem.lllIIIlIllIIII[6] = "  ".length();
        S38PacketPlayerListItem.lllIIIlIllIIII[7] = "   ".length();
        S38PacketPlayerListItem.lllIIIlIllIIII[8] = (0x68 ^ 0x60);
    }
    
    public List<AddPlayerData> func_179767_a() {
        return this.players;
    }
    
    public S38PacketPlayerListItem(final Action llllllllllllIllIIIIIIllIIllIlIlI, final Iterable<EntityPlayerMP> llllllllllllIllIIIIIIllIIllIIlIl) {
        this.players = (List<AddPlayerData>)Lists.newArrayList();
        this.action = llllllllllllIllIIIIIIllIIllIlIlI;
        final byte llllllllllllIllIIIIIIllIIllIIIll = (byte)llllllllllllIllIIIIIIllIIllIIlIl.iterator();
        "".length();
        if ((0x93 ^ 0x97) == 0x0) {
            throw null;
        }
        while (!lIIlllIllIIIlllI(((Iterator)llllllllllllIllIIIIIIllIIllIIIll).hasNext() ? 1 : 0)) {
            final EntityPlayerMP llllllllllllIllIIIIIIllIIllIlIII = ((Iterator<EntityPlayerMP>)llllllllllllIllIIIIIIllIIllIIIll).next();
            this.players.add(new AddPlayerData(llllllllllllIllIIIIIIllIIllIlIII.getGameProfile(), llllllllllllIllIIIIIIllIIllIlIII.ping, llllllllllllIllIIIIIIllIIllIlIII.theItemInWorldManager.getGameType(), llllllllllllIllIIIIIIllIIllIlIII.getTabListDisplayName()));
            "".length();
        }
    }
    
    public S38PacketPlayerListItem(final Action llllllllllllIllIIIIIIllIIlllIllI, final EntityPlayerMP... llllllllllllIllIIIIIIllIIllllIIl) {
        this.players = (List<AddPlayerData>)Lists.newArrayList();
        this.action = llllllllllllIllIIIIIIllIIlllIllI;
        final boolean llllllllllllIllIIIIIIllIIlllIIIl = (Object)llllllllllllIllIIIIIIllIIllllIIl;
        final float llllllllllllIllIIIIIIllIIlllIIlI = llllllllllllIllIIIIIIllIIllllIIl.length;
        String llllllllllllIllIIIIIIllIIlllIIll = (String)S38PacketPlayerListItem.lllIIIlIllIIII[0];
        "".length();
        if (((0x58 ^ 0x1A) & ~(0x65 ^ 0x27)) != 0x0) {
            throw null;
        }
        while (!lIIlllIllIIIllIl((int)llllllllllllIllIIIIIIllIIlllIIll, (int)llllllllllllIllIIIIIIllIIlllIIlI)) {
            final EntityPlayerMP llllllllllllIllIIIIIIllIIllllIII = llllllllllllIllIIIIIIllIIlllIIIl[llllllllllllIllIIIIIIllIIlllIIll];
            this.players.add(new AddPlayerData(llllllllllllIllIIIIIIllIIllllIII.getGameProfile(), llllllllllllIllIIIIIIllIIllllIII.ping, llllllllllllIllIIIIIIllIIllllIII.theItemInWorldManager.getGameType(), llllllllllllIllIIIIIIllIIllllIII.getTabListDisplayName()));
            "".length();
            ++llllllllllllIllIIIIIIllIIlllIIll;
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIIIIIllIIlIlIlIl) throws IOException {
        this.action = llllllllllllIllIIIIIIllIIlIlIlIl.readEnumValue(Action.class);
        final int llllllllllllIllIIIIIIllIIlIlIlII = llllllllllllIllIIIIIIllIIlIlIlIl.readVarIntFromBuffer();
        int llllllllllllIllIIIIIIllIIlIlIIll = S38PacketPlayerListItem.lllIIIlIllIIII[0];
        "".length();
        if ((0x14 ^ 0x10) == 0x0) {
            return;
        }
        while (!lIIlllIllIIIllIl(llllllllllllIllIIIIIIllIIlIlIIll, llllllllllllIllIIIIIIllIIlIlIlII)) {
            GameProfile llllllllllllIllIIIIIIllIIlIlIIlI = null;
            int llllllllllllIllIIIIIIllIIlIlIIIl = S38PacketPlayerListItem.lllIIIlIllIIII[0];
            WorldSettings.GameType llllllllllllIllIIIIIIllIIlIlIIII = null;
            IChatComponent llllllllllllIllIIIIIIllIIlIIllll = null;
            switch ($SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action()[this.action.ordinal()]) {
                case 1: {
                    llllllllllllIllIIIIIIllIIlIlIIlI = new GameProfile(llllllllllllIllIIIIIIllIIlIlIlIl.readUuid(), llllllllllllIllIIIIIIllIIlIlIlIl.readStringFromBuffer(S38PacketPlayerListItem.lllIIIlIllIIII[1]));
                    final int llllllllllllIllIIIIIIllIIlIIlllI = llllllllllllIllIIIIIIllIIlIlIlIl.readVarIntFromBuffer();
                    int llllllllllllIllIIIIIIllIIlIIllIl = S38PacketPlayerListItem.lllIIIlIllIIII[0];
                    "".length();
                    if ((60 + 74 - 110 + 108 ^ 77 + 119 - 102 + 35) <= 0) {
                        return;
                    }
                    while (!lIIlllIllIIIllIl(llllllllllllIllIIIIIIllIIlIIllIl, llllllllllllIllIIIIIIllIIlIIlllI)) {
                        final String llllllllllllIllIIIIIIllIIlIIllII = llllllllllllIllIIIIIIllIIlIlIlIl.readStringFromBuffer(S38PacketPlayerListItem.lllIIIlIllIIII[2]);
                        final String llllllllllllIllIIIIIIllIIlIIlIll = llllllllllllIllIIIIIIllIIlIlIlIl.readStringFromBuffer(S38PacketPlayerListItem.lllIIIlIllIIII[2]);
                        if (lIIlllIllIIIllll(llllllllllllIllIIIIIIllIIlIlIlIl.readBoolean() ? 1 : 0)) {
                            llllllllllllIllIIIIIIllIIlIlIIlI.getProperties().put((Object)llllllllllllIllIIIIIIllIIlIIllII, (Object)new Property(llllllllllllIllIIIIIIllIIlIIllII, llllllllllllIllIIIIIIllIIlIIlIll, llllllllllllIllIIIIIIllIIlIlIlIl.readStringFromBuffer(S38PacketPlayerListItem.lllIIIlIllIIII[2])));
                            "".length();
                            "".length();
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIllIIIIIIllIIlIlIIlI.getProperties().put((Object)llllllllllllIllIIIIIIllIIlIIllII, (Object)new Property(llllllllllllIllIIIIIIllIIlIIllII, llllllllllllIllIIIIIIllIIlIIlIll));
                            "".length();
                        }
                        ++llllllllllllIllIIIIIIllIIlIIllIl;
                    }
                    llllllllllllIllIIIIIIllIIlIlIIII = WorldSettings.GameType.getByID(llllllllllllIllIIIIIIllIIlIlIlIl.readVarIntFromBuffer());
                    llllllllllllIllIIIIIIllIIlIlIIIl = llllllllllllIllIIIIIIllIIlIlIlIl.readVarIntFromBuffer();
                    if (!lIIlllIllIIIllll(llllllllllllIllIIIIIIllIIlIlIlIl.readBoolean() ? 1 : 0)) {
                        break;
                    }
                    llllllllllllIllIIIIIIllIIlIIllll = llllllllllllIllIIIIIIllIIlIlIlIl.readChatComponent();
                    "".length();
                    if ("  ".length() >= (0xB1 ^ 0xB5)) {
                        return;
                    }
                    break;
                }
                case 2: {
                    llllllllllllIllIIIIIIllIIlIlIIlI = new GameProfile(llllllllllllIllIIIIIIllIIlIlIlIl.readUuid(), (String)null);
                    llllllllllllIllIIIIIIllIIlIlIIII = WorldSettings.GameType.getByID(llllllllllllIllIIIIIIllIIlIlIlIl.readVarIntFromBuffer());
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 3: {
                    llllllllllllIllIIIIIIllIIlIlIIlI = new GameProfile(llllllllllllIllIIIIIIllIIlIlIlIl.readUuid(), (String)null);
                    llllllllllllIllIIIIIIllIIlIlIIIl = llllllllllllIllIIIIIIllIIlIlIlIl.readVarIntFromBuffer();
                    "".length();
                    if (-(0x53 ^ 0x57) > 0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    llllllllllllIllIIIIIIllIIlIlIIlI = new GameProfile(llllllllllllIllIIIIIIllIIlIlIlIl.readUuid(), (String)null);
                    if (!lIIlllIllIIIllll(llllllllllllIllIIIIIIllIIlIlIlIl.readBoolean() ? 1 : 0)) {
                        break;
                    }
                    llllllllllllIllIIIIIIllIIlIIllll = llllllllllllIllIIIIIIllIIlIlIlIl.readChatComponent();
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
                case 5: {
                    llllllllllllIllIIIIIIllIIlIlIIlI = new GameProfile(llllllllllllIllIIIIIIllIIlIlIlIl.readUuid(), (String)null);
                    break;
                }
            }
            this.players.add(new AddPlayerData(llllllllllllIllIIIIIIllIIlIlIIlI, llllllllllllIllIIIIIIllIIlIlIIIl, llllllllllllIllIIIIIIllIIlIlIIII, llllllllllllIllIIIIIIllIIlIIllll));
            "".length();
            ++llllllllllllIllIIIIIIllIIlIlIIll;
        }
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add(S38PacketPlayerListItem.lllIIIlIlIllll[S38PacketPlayerListItem.lllIIIlIllIIII[0]], (Object)this.action).add(S38PacketPlayerListItem.lllIIIlIlIllll[S38PacketPlayerListItem.lllIIIlIllIIII[3]], (Object)this.players).toString();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action() {
        final int[] $switch_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action = S38PacketPlayerListItem.$SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action;
        if (lIIlllIllIIlIIIl($switch_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action)) {
            return $switch_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action;
        }
        "".length();
        final double llllllllllllIllIIIIIIllIIIIllIlI = (Object)new int[Action.values().length];
        try {
            llllllllllllIllIIIIIIllIIIIllIlI[Action.ADD_PLAYER.ordinal()] = S38PacketPlayerListItem.lllIIIlIllIIII[3];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIIIIIIllIIIIllIlI[Action.REMOVE_PLAYER.ordinal()] = S38PacketPlayerListItem.lllIIIlIllIIII[4];
            "".length();
            if (((0x8C ^ 0x89) & ~(0x9F ^ 0x9A)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIIIIIIllIIIIllIlI[Action.UPDATE_DISPLAY_NAME.ordinal()] = S38PacketPlayerListItem.lllIIIlIllIIII[5];
            "".length();
            if (((0x8A ^ 0x81) & ~(0x59 ^ 0x52)) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIIIIIIllIIIIllIlI[Action.UPDATE_GAME_MODE.ordinal()] = S38PacketPlayerListItem.lllIIIlIllIIII[6];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIIIIIIllIIIIllIlI[Action.UPDATE_LATENCY.ordinal()] = S38PacketPlayerListItem.lllIIIlIllIIII[7];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        return S38PacketPlayerListItem.$SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action = (int[])(Object)llllllllllllIllIIIIIIllIIIIllIlI;
    }
    
    public S38PacketPlayerListItem() {
        this.players = (List<AddPlayerData>)Lists.newArrayList();
    }
    
    public Action func_179768_b() {
        return this.action;
    }
    
    private static boolean lIIlllIllIIIlllI(final int llllllllllllIllIIIIIIlIlllllIlII) {
        return llllllllllllIllIIIIIIlIlllllIlII == 0;
    }
    
    private static boolean lIIlllIllIIlIIIl(final Object llllllllllllIllIIIIIIlIllllllIlI) {
        return llllllllllllIllIIIIIIlIllllllIlI != null;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIIIIIllIIIllIIll) throws IOException {
        llllllllllllIllIIIIIIllIIIllIIll.writeEnumValue(this.action);
        llllllllllllIllIIIIIIllIIIllIIll.writeVarIntToBuffer(this.players.size());
        final Exception llllllllllllIllIIIIIIllIIIllIIIl = (Exception)this.players.iterator();
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
        while (!lIIlllIllIIIlllI(((Iterator)llllllllllllIllIIIIIIllIIIllIIIl).hasNext() ? 1 : 0)) {
            final AddPlayerData llllllllllllIllIIIIIIllIIIllIllI = ((Iterator<AddPlayerData>)llllllllllllIllIIIIIIllIIIllIIIl).next();
            switch ($SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action()[this.action.ordinal()]) {
                case 1: {
                    llllllllllllIllIIIIIIllIIIllIIll.writeUuid(llllllllllllIllIIIIIIllIIIllIllI.getProfile().getId());
                    llllllllllllIllIIIIIIllIIIllIIll.writeString(llllllllllllIllIIIIIIllIIIllIllI.getProfile().getName());
                    "".length();
                    llllllllllllIllIIIIIIllIIIllIIll.writeVarIntToBuffer(llllllllllllIllIIIIIIllIIIllIllI.getProfile().getProperties().size());
                    final char llllllllllllIllIIIIIIllIIIlIllll = (char)llllllllllllIllIIIIIIllIIIllIllI.getProfile().getProperties().values().iterator();
                    "".length();
                    if (((0xB2 ^ 0xAC) & ~(0x9C ^ 0x82)) == (0x62 ^ 0x66)) {
                        return;
                    }
                    while (!lIIlllIllIIIlllI(((Iterator)llllllllllllIllIIIIIIllIIIlIllll).hasNext() ? 1 : 0)) {
                        final Property llllllllllllIllIIIIIIllIIIllIlIl = ((Iterator<Property>)llllllllllllIllIIIIIIllIIIlIllll).next();
                        llllllllllllIllIIIIIIllIIIllIIll.writeString(llllllllllllIllIIIIIIllIIIllIlIl.getName());
                        "".length();
                        llllllllllllIllIIIIIIllIIIllIIll.writeString(llllllllllllIllIIIIIIllIIIllIlIl.getValue());
                        "".length();
                        if (lIIlllIllIIIllll(llllllllllllIllIIIIIIllIIIllIlIl.hasSignature() ? 1 : 0)) {
                            llllllllllllIllIIIIIIllIIIllIIll.writeBoolean((boolean)(S38PacketPlayerListItem.lllIIIlIllIIII[3] != 0));
                            "".length();
                            llllllllllllIllIIIIIIllIIIllIIll.writeString(llllllllllllIllIIIIIIllIIIllIlIl.getSignature());
                            "".length();
                            "".length();
                            if (-(69 + 81 - 136 + 151 ^ 16 + 71 + 69 + 4) >= 0) {
                                return;
                            }
                            continue;
                        }
                        else {
                            llllllllllllIllIIIIIIllIIIllIIll.writeBoolean((boolean)(S38PacketPlayerListItem.lllIIIlIllIIII[0] != 0));
                            "".length();
                        }
                    }
                    llllllllllllIllIIIIIIllIIIllIIll.writeVarIntToBuffer(llllllllllllIllIIIIIIllIIIllIllI.getGameMode().getID());
                    llllllllllllIllIIIIIIllIIIllIIll.writeVarIntToBuffer(llllllllllllIllIIIIIIllIIIllIllI.getPing());
                    if (lIIlllIllIIlIIII(llllllllllllIllIIIIIIllIIIllIllI.getDisplayName())) {
                        llllllllllllIllIIIIIIllIIIllIIll.writeBoolean((boolean)(S38PacketPlayerListItem.lllIIIlIllIIII[0] != 0));
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        continue;
                    }
                    else {
                        llllllllllllIllIIIIIIllIIIllIIll.writeBoolean((boolean)(S38PacketPlayerListItem.lllIIIlIllIIII[3] != 0));
                        "".length();
                        llllllllllllIllIIIIIIllIIIllIIll.writeChatComponent(llllllllllllIllIIIIIIllIIIllIllI.getDisplayName());
                        "".length();
                        if (((0x63 ^ 0x52) & ~(0x52 ^ 0x63)) != 0x0) {
                            return;
                        }
                        continue;
                    }
                    break;
                }
                case 2: {
                    llllllllllllIllIIIIIIllIIIllIIll.writeUuid(llllllllllllIllIIIIIIllIIIllIllI.getProfile().getId());
                    llllllllllllIllIIIIIIllIIIllIIll.writeVarIntToBuffer(llllllllllllIllIIIIIIllIIIllIllI.getGameMode().getID());
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                case 3: {
                    llllllllllllIllIIIIIIllIIIllIIll.writeUuid(llllllllllllIllIIIIIIllIIIllIllI.getProfile().getId());
                    llllllllllllIllIIIIIIllIIIllIIll.writeVarIntToBuffer(llllllllllllIllIIIIIIllIIIllIllI.getPing());
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    continue;
                }
                case 4: {
                    llllllllllllIllIIIIIIllIIIllIIll.writeUuid(llllllllllllIllIIIIIIllIIIllIllI.getProfile().getId());
                    if (lIIlllIllIIlIIII(llllllllllllIllIIIIIIllIIIllIllI.getDisplayName())) {
                        llllllllllllIllIIIIIIllIIIllIIll.writeBoolean((boolean)(S38PacketPlayerListItem.lllIIIlIllIIII[0] != 0));
                        "".length();
                        "".length();
                        if ("  ".length() == (37 + 27 + 1 + 118 ^ 136 + 73 - 69 + 39)) {
                            return;
                        }
                        continue;
                    }
                    else {
                        llllllllllllIllIIIIIIllIIIllIIll.writeBoolean((boolean)(S38PacketPlayerListItem.lllIIIlIllIIII[3] != 0));
                        "".length();
                        llllllllllllIllIIIIIIllIIIllIIll.writeChatComponent(llllllllllllIllIIIIIIllIIIllIllI.getDisplayName());
                        "".length();
                        if (null != null) {
                            return;
                        }
                        continue;
                    }
                    break;
                }
                case 5: {
                    llllllllllllIllIIIIIIllIIIllIIll.writeUuid(llllllllllllIllIIIIIIllIIIllIllI.getProfile().getId());
                }
                default: {
                    continue;
                }
            }
        }
    }
    
    private static boolean lIIlllIllIIlIIII(final Object llllllllllllIllIIIIIIlIllllllIII) {
        return llllllllllllIllIIIIIIlIllllllIII == null;
    }
    
    private static boolean lIIlllIllIIIllll(final int llllllllllllIllIIIIIIlIlllllIllI) {
        return llllllllllllIllIIIIIIlIlllllIllI != 0;
    }
    
    private static void lIIlllIllIIIlIll() {
        (lllIIIlIlIllll = new String[S38PacketPlayerListItem.lllIIIlIllIIII[6]])[S38PacketPlayerListItem.lllIIIlIllIIII[0]] = lIIlllIllIIIlIIl("/gajkn3sDhI=", "aNkIH");
        S38PacketPlayerListItem.lllIIIlIlIllll[S38PacketPlayerListItem.lllIIIlIllIIII[3]] = lIIlllIllIIIlIlI("ChzE3hinDv0=", "MooyA");
    }
    
    public enum Action
    {
        UPDATE_LATENCY(Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[2]], Action.llIlIIIlIllIIl[2]);
        
        private static final /* synthetic */ int[] llIlIIIlIllIIl;
        
        ADD_PLAYER(Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[0]], Action.llIlIIIlIllIIl[0]), 
        UPDATE_DISPLAY_NAME(Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[3]], Action.llIlIIIlIllIIl[3]), 
        UPDATE_GAME_MODE(Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[1]], Action.llIlIIIlIllIIl[1]), 
        REMOVE_PLAYER(Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[4]], Action.llIlIIIlIllIIl[4]);
        
        private static final /* synthetic */ String[] llIlIIIlIlIlll;
        
        private static void lIIlIIIllllIlllI() {
            (llIlIIIlIlIlll = new String[Action.llIlIIIlIllIIl[5]])[Action.llIlIIIlIllIIl[0]] = lIIlIIIllllIlIll("OBE2JQk1FCs/Cw==", "yUrzY");
            Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[1]] = lIIlIIIllllIllII("3ZTkoTqjuKFmU/gtFFV4rsK0ztfVoV5h", "XEhBQ");
            Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[2]] = lIIlIIIllllIllIl("04xz2iu/a/0LRWsTSJictA==", "zPnhT");
            Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[3]] = lIIlIIIllllIllII("yEph9t10pDViXTGESJULjsc8hX22bTnk", "WMyij");
            Action.llIlIIIlIlIlll[Action.llIlIIIlIllIIl[4]] = lIIlIIIllllIllIl("coT+wEIAQbv8ZCl5Hxdmtw==", "lWEWF");
        }
        
        static {
            lIIlIIIlllllIIlI();
            lIIlIIIllllIlllI();
            final Action[] enum$VALUES = new Action[Action.llIlIIIlIllIIl[5]];
            enum$VALUES[Action.llIlIIIlIllIIl[0]] = Action.ADD_PLAYER;
            enum$VALUES[Action.llIlIIIlIllIIl[1]] = Action.UPDATE_GAME_MODE;
            enum$VALUES[Action.llIlIIIlIllIIl[2]] = Action.UPDATE_LATENCY;
            enum$VALUES[Action.llIlIIIlIllIIl[3]] = Action.UPDATE_DISPLAY_NAME;
            enum$VALUES[Action.llIlIIIlIllIIl[4]] = Action.REMOVE_PLAYER;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIlIIIllllIlIll(String llllllllllllIllIllIIlllIlIllllIl, final String llllllllllllIllIllIIlllIllIIIIIl) {
            llllllllllllIllIllIIlllIlIllllIl = new String(Base64.getDecoder().decode(llllllllllllIllIllIIlllIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllIIlllIllIIIIII = new StringBuilder();
            final char[] llllllllllllIllIllIIlllIlIllllll = llllllllllllIllIllIIlllIllIIIIIl.toCharArray();
            int llllllllllllIllIllIIlllIlIlllllI = Action.llIlIIIlIllIIl[0];
            final float llllllllllllIllIllIIlllIlIlllIII = (Object)llllllllllllIllIllIIlllIlIllllIl.toCharArray();
            final int llllllllllllIllIllIIlllIlIllIlll = llllllllllllIllIllIIlllIlIlllIII.length;
            short llllllllllllIllIllIIlllIlIllIllI = (short)Action.llIlIIIlIllIIl[0];
            while (lIIlIIIlllllIIll(llllllllllllIllIllIIlllIlIllIllI, llllllllllllIllIllIIlllIlIllIlll)) {
                final char llllllllllllIllIllIIlllIllIIIIll = llllllllllllIllIllIIlllIlIlllIII[llllllllllllIllIllIIlllIlIllIllI];
                llllllllllllIllIllIIlllIllIIIIII.append((char)(llllllllllllIllIllIIlllIllIIIIll ^ llllllllllllIllIllIIlllIlIllllll[llllllllllllIllIllIIlllIlIlllllI % llllllllllllIllIllIIlllIlIllllll.length]));
                "".length();
                ++llllllllllllIllIllIIlllIlIlllllI;
                ++llllllllllllIllIllIIlllIlIllIllI;
                "".length();
                if ("  ".length() == -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllIIlllIllIIIIII);
        }
        
        private static void lIIlIIIlllllIIlI() {
            (llIlIIIlIllIIl = new int[7])[0] = ((0x80 ^ 0x92) & ~(0x2B ^ 0x39));
            Action.llIlIIIlIllIIl[1] = " ".length();
            Action.llIlIIIlIllIIl[2] = "  ".length();
            Action.llIlIIIlIllIIl[3] = "   ".length();
            Action.llIlIIIlIllIIl[4] = (0x2A ^ 0x2E);
            Action.llIlIIIlIllIIl[5] = (0x8C ^ 0x89);
            Action.llIlIIIlIllIIl[6] = (0xB4 ^ 0xBC);
        }
        
        private static String lIIlIIIllllIllII(final String llllllllllllIllIllIIlllIlIlIlIll, final String llllllllllllIllIllIIlllIlIlIllII) {
            try {
                final SecretKeySpec llllllllllllIllIllIIlllIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlllIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllIIlllIlIlIllll = Cipher.getInstance("Blowfish");
                llllllllllllIllIllIIlllIlIlIllll.init(Action.llIlIIIlIllIIl[2], llllllllllllIllIllIIlllIlIllIIII);
                return new String(llllllllllllIllIllIIlllIlIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlllIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIlllIlIlIlllI) {
                llllllllllllIllIllIIlllIlIlIlllI.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlIIIllllIllIl(final String llllllllllllIllIllIIlllIlIlIIIII, final String llllllllllllIllIllIIlllIlIIlllll) {
            try {
                final SecretKeySpec llllllllllllIllIllIIlllIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlllIlIIlllll.getBytes(StandardCharsets.UTF_8)), Action.llIlIIIlIllIIl[6]), "DES");
                final Cipher llllllllllllIllIllIIlllIlIlIIIlI = Cipher.getInstance("DES");
                llllllllllllIllIllIIlllIlIlIIIlI.init(Action.llIlIIIlIllIIl[2], llllllllllllIllIllIIlllIlIlIIIll);
                return new String(llllllllllllIllIllIIlllIlIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlllIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIlllIlIlIIIIl) {
                llllllllllllIllIllIIlllIlIlIIIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlIIIlllllIIll(final int llllllllllllIllIllIIlllIlIIllIII, final int llllllllllllIllIllIIlllIlIIlIlll) {
            return llllllllllllIllIllIIlllIlIIllIII < llllllllllllIllIllIIlllIlIIlIlll;
        }
        
        private Action(final String llllllllllllIllIllIIlllIllIlIllI, final int llllllllllllIllIllIIlllIllIlIlIl) {
        }
    }
    
    public class AddPlayerData
    {
        private static final /* synthetic */ int[] llIlIIIlllIIII;
        private final /* synthetic */ int ping;
        private static final /* synthetic */ String[] llIlIIIllIlIlI;
        private final /* synthetic */ IChatComponent displayName;
        private final /* synthetic */ WorldSettings.GameType gamemode;
        private final /* synthetic */ GameProfile profile;
        
        private static void lIIlIIlIIIlIIIlI() {
            (llIlIIIlllIIII = new int[5])[0] = ((0x32 ^ 0x21) & ~(0x4E ^ 0x5D));
            AddPlayerData.llIlIIIlllIIII[1] = " ".length();
            AddPlayerData.llIlIIIlllIIII[2] = "  ".length();
            AddPlayerData.llIlIIIlllIIII[3] = "   ".length();
            AddPlayerData.llIlIIIlllIIII[4] = (0x2A ^ 0xD ^ (0x28 ^ 0xB));
        }
        
        private static boolean lIIlIIlIIIlIIIll(final Object llllllllllllIllIllIIlIllIllllIII) {
            return llllllllllllIllIllIIlIllIllllIII == null;
        }
        
        public GameProfile getProfile() {
            return this.profile;
        }
        
        @Override
        public String toString() {
            final Objects.ToStringHelper add = Objects.toStringHelper((Object)this).add(AddPlayerData.llIlIIIllIlIlI[AddPlayerData.llIlIIIlllIIII[0]], this.ping).add(AddPlayerData.llIlIIIllIlIlI[AddPlayerData.llIlIIIlllIIII[1]], (Object)this.gamemode).add(AddPlayerData.llIlIIIllIlIlI[AddPlayerData.llIlIIIlllIIII[2]], (Object)this.profile);
            final String s = AddPlayerData.llIlIIIllIlIlI[AddPlayerData.llIlIIIlllIIII[3]];
            String componentToJson;
            if (lIIlIIlIIIlIIIll(this.displayName)) {
                componentToJson = null;
                "".length();
                if ((0x7B ^ 0x32 ^ (0x14 ^ 0x59)) == "  ".length()) {
                    return null;
                }
            }
            else {
                componentToJson = IChatComponent.Serializer.componentToJson(this.displayName);
            }
            return add.add(s, (Object)componentToJson).toString();
        }
        
        public WorldSettings.GameType getGameMode() {
            return this.gamemode;
        }
        
        public int getPing() {
            return this.ping;
        }
        
        public IChatComponent getDisplayName() {
            return this.displayName;
        }
        
        private static String lIIlIIlIIIIllIIl(final String llllllllllllIllIllIIlIlllIIllIll, final String llllllllllllIllIllIIlIlllIIllIII) {
            try {
                final SecretKeySpec llllllllllllIllIllIIlIlllIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIlllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllIIlIlllIIlllIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIllIIlIlllIIlllIl.init(AddPlayerData.llIlIIIlllIIII[2], llllllllllllIllIllIIlIlllIIllllI);
                return new String(llllllllllllIllIllIIlIlllIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIlllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIlIlllIIlllII) {
                llllllllllllIllIllIIlIlllIIlllII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlIIlIIIlIIlII(final int llllllllllllIllIllIIlIllIllllIll, final int llllllllllllIllIllIIlIllIllllIlI) {
            return llllllllllllIllIllIIlIllIllllIll < llllllllllllIllIllIIlIllIllllIlI;
        }
        
        public AddPlayerData(final GameProfile llllllllllllIllIllIIlIlllIlllIll, final int llllllllllllIllIllIIlIlllIllIlII, final WorldSettings.GameType llllllllllllIllIllIIlIlllIllIIll, final IChatComponent llllllllllllIllIllIIlIlllIlllIII) {
            this.profile = llllllllllllIllIllIIlIlllIlllIll;
            this.ping = llllllllllllIllIllIIlIlllIllIlII;
            this.gamemode = llllllllllllIllIllIIlIlllIllIIll;
            this.displayName = llllllllllllIllIllIIlIlllIlllIII;
        }
        
        private static void lIIlIIlIIIIllIll() {
            (llIlIIIllIlIlI = new String[AddPlayerData.llIlIIIlllIIII[4]])[AddPlayerData.llIlIIIlllIIII[0]] = lIIlIIlIIIIllIIl("uDLwllfmlBo=", "YFJoj");
            AddPlayerData.llIlIIIllIlIlI[AddPlayerData.llIlIIIlllIIII[1]] = lIIlIIlIIIIllIIl("2CBc6gTW2tYco5nYfXhsaw==", "Xbvug");
            AddPlayerData.llIlIIIllIlIlI[AddPlayerData.llIlIIIlllIIII[2]] = lIIlIIlIIIIllIlI("Pz0nESojKg==", "OOHwC");
            AddPlayerData.llIlIIIllIlIlI[AddPlayerData.llIlIIIlllIIII[3]] = lIIlIIlIIIIllIIl("OTqY7gaFviC7INEAvQw4AQ==", "RJbAH");
        }
        
        private static String lIIlIIlIIIIllIlI(String llllllllllllIllIllIIlIlllIIIIllI, final String llllllllllllIllIllIIlIlllIIIlIlI) {
            llllllllllllIllIllIIlIlllIIIIllI = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIIlIlllIIIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllIIlIlllIIIlIIl = new StringBuilder();
            final char[] llllllllllllIllIllIIlIlllIIIlIII = llllllllllllIllIllIIlIlllIIIlIlI.toCharArray();
            int llllllllllllIllIllIIlIlllIIIIlll = AddPlayerData.llIlIIIlllIIII[0];
            final char llllllllllllIllIllIIlIlllIIIIIIl = (Object)((String)llllllllllllIllIllIIlIlllIIIIllI).toCharArray();
            final float llllllllllllIllIllIIlIlllIIIIIII = llllllllllllIllIllIIlIlllIIIIIIl.length;
            boolean llllllllllllIllIllIIlIllIlllllll = AddPlayerData.llIlIIIlllIIII[0] != 0;
            while (lIIlIIlIIIlIIlII(llllllllllllIllIllIIlIllIlllllll ? 1 : 0, (int)llllllllllllIllIllIIlIlllIIIIIII)) {
                final char llllllllllllIllIllIIlIlllIIIllII = llllllllllllIllIllIIlIlllIIIIIIl[llllllllllllIllIllIIlIllIlllllll];
                llllllllllllIllIllIIlIlllIIIlIIl.append((char)(llllllllllllIllIllIIlIlllIIIllII ^ llllllllllllIllIllIIlIlllIIIlIII[llllllllllllIllIllIIlIlllIIIIlll % llllllllllllIllIllIIlIlllIIIlIII.length]));
                "".length();
                ++llllllllllllIllIllIIlIlllIIIIlll;
                ++llllllllllllIllIllIIlIllIlllllll;
                "".length();
                if ("   ".length() > "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllIIlIlllIIIlIIl);
        }
        
        static {
            lIIlIIlIIIlIIIlI();
            lIIlIIlIIIIllIll();
        }
    }
}
