// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import net.minecraft.server.management.UserList;
import java.util.Iterator;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.ContainerBeacon;
import net.minecraft.entity.EntityMinecartCommandBlock;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.inventory.ContainerMerchant;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.item.ItemEditableBook;
import net.minecraft.init.Items;
import java.io.IOException;
import net.minecraft.item.ItemWritableBook;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.client.C15PacketClientSettings;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import java.util.Date;
import net.minecraft.server.management.UserListBansEntry;
import net.minecraft.network.play.server.S3APacketTabComplete;
import net.minecraft.command.ICommandSender;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C11PacketEnchantItem;
import net.minecraft.network.play.client.C16PacketClientStatus;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Doubles;
import net.minecraft.util.ChatAllowedCharacters;
import org.apache.commons.lang3.StringUtils;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.server.S00PacketKeepAlive;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.client.C18PacketSpectate;
import java.util.Collections;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.BlockPos;
import net.minecraft.world.WorldServer;
import net.minecraft.block.material.Material;
import net.minecraft.network.play.server.S23PacketBlockChange;
import net.minecraft.world.World;
import java.util.List;
import net.minecraft.network.play.server.S32PacketConfirmTransaction;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.util.IThreadListener;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import com.google.common.util.concurrent.Futures;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.IntHashMap;
import net.minecraft.entity.player.EntityPlayerMP;
import org.apache.logging.log4j.Logger;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.util.ITickable;

public class NetHandlerPlayServer implements ITickable, INetHandlerPlayServer
{
    private /* synthetic */ double lastPosY;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ long lastPingTime;
    private /* synthetic */ boolean field_147366_g;
    public /* synthetic */ EntityPlayerMP playerEntity;
    private /* synthetic */ int networkTickCount;
    private /* synthetic */ double lastPosZ;
    private /* synthetic */ int chatSpamThresholdCount;
    private /* synthetic */ double lastPosX;
    private /* synthetic */ IntHashMap<Short> field_147372_n;
    public final /* synthetic */ NetworkManager netManager;
    private /* synthetic */ int field_147378_h;
    private /* synthetic */ int itemDropThreshold;
    private static final /* synthetic */ String[] llIllIlllIllIl;
    private final /* synthetic */ MinecraftServer serverController;
    private static final /* synthetic */ int[] llIlllIIIIIIII;
    private /* synthetic */ long lastSentPingPacket;
    private /* synthetic */ boolean hasMoved;
    private /* synthetic */ int field_175090_f;
    private /* synthetic */ int floatingTickCount;
    
    public void kickPlayerFromServer(final String llllllllllllIllIIlIlllIIIllIIIIl) {
        final ChatComponentText llllllllllllIllIIlIlllIIIllIIIll = new ChatComponentText(llllllllllllIllIIlIlllIIIllIIIIl);
        this.netManager.sendPacket(new S40PacketDisconnect(llllllllllllIllIIlIlllIIIllIIIll), new GenericFutureListener<Future<? super Void>>() {
            @Override
            public void operationComplete(final Future<? super Void> llllllllllllIllIllIIIlIIIlIIIIIl) throws Exception {
                NetHandlerPlayServer.this.netManager.closeChannel(llllllllllllIllIIlIlllIIIllIIIll);
            }
        }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[NetHandlerPlayServer.llIlllIIIIIIII[1]]);
        this.netManager.disableAutoRead();
        Futures.getUnchecked((java.util.concurrent.Future)this.serverController.addScheduledTask(new Runnable() {
            @Override
            public void run() {
                NetHandlerPlayServer.this.netManager.checkDisconnected();
            }
        }));
        "".length();
    }
    
    private static boolean lIIllIIIllIIIlll(final int llllllllllllIllIIlIllIlIIlIIlIIl, final int llllllllllllIllIIlIllIlIIlIIlIII) {
        return llllllllllllIllIIlIllIlIIlIIlIIl == llllllllllllIllIIlIllIlIIlIIlIII;
    }
    
    private static int lIIllIIIlIllIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIllIIIllIIIlIl(final Object llllllllllllIllIIlIllIlIIIllIlIl, final Object llllllllllllIllIIlIllIlIIIllIlII) {
        return llllllllllllIllIIlIllIlIIIllIlIl != llllllllllllIllIIlIllIlIIIllIlII;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$client$C07PacketPlayerDigging$Action() {
        final int[] $switch_TABLE$net$minecraft$network$play$client$C07PacketPlayerDigging$Action = NetHandlerPlayServer.$SWITCH_TABLE$net$minecraft$network$play$client$C07PacketPlayerDigging$Action;
        if (lIIllIIIlIlllllI($switch_TABLE$net$minecraft$network$play$client$C07PacketPlayerDigging$Action)) {
            return $switch_TABLE$net$minecraft$network$play$client$C07PacketPlayerDigging$Action;
        }
        "".length();
        final double llllllllllllIllIIlIllIlIlIIIIIlI = (Object)new int[C07PacketPlayerDigging.Action.values().length];
        try {
            llllllllllllIllIIlIllIlIlIIIIIlI[C07PacketPlayerDigging.Action.ABORT_DESTROY_BLOCK.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[4];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIlI[C07PacketPlayerDigging.Action.DROP_ALL_ITEMS.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[6];
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIlI[C07PacketPlayerDigging.Action.DROP_ITEM.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[7];
            "".length();
            if ((0x35 ^ 0x31) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIlI[C07PacketPlayerDigging.Action.RELEASE_USE_ITEM.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[8];
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIlI[C07PacketPlayerDigging.Action.START_DESTROY_BLOCK.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIlI[C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[5];
            "".length();
            if ((0x15 ^ 0x10) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return NetHandlerPlayServer.$SWITCH_TABLE$net$minecraft$network$play$client$C07PacketPlayerDigging$Action = (int[])(Object)llllllllllllIllIIlIllIlIlIIIIIlI;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$client$C0BPacketEntityAction$Action() {
        final int[] $switch_TABLE$net$minecraft$network$play$client$C0BPacketEntityAction$Action = NetHandlerPlayServer.$SWITCH_TABLE$net$minecraft$network$play$client$C0BPacketEntityAction$Action;
        if (lIIllIIIlIlllllI($switch_TABLE$net$minecraft$network$play$client$C0BPacketEntityAction$Action)) {
            return $switch_TABLE$net$minecraft$network$play$client$C0BPacketEntityAction$Action;
        }
        "".length();
        final float llllllllllllIllIIlIllIlIlIIIIIII = (Object)new int[C0BPacketEntityAction.Action.values().length];
        try {
            llllllllllllIllIIlIllIlIlIIIIIII[C0BPacketEntityAction.Action.OPEN_INVENTORY.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[9];
            "".length();
            if (-(0x3B ^ 0x3F) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIII[C0BPacketEntityAction.Action.RIDING_JUMP.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[8];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIII[C0BPacketEntityAction.Action.START_SNEAKING.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIII[C0BPacketEntityAction.Action.START_SPRINTING.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[6];
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIII[C0BPacketEntityAction.Action.STOP_SLEEPING.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[5];
            "".length();
            if ((0x19 ^ 0x60 ^ (0x2A ^ 0x56)) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIII[C0BPacketEntityAction.Action.STOP_SNEAKING.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[4];
            "".length();
            if (((0x30 ^ 0x6F) & ~(0xC4 ^ 0x9B)) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIlIIIIIII[C0BPacketEntityAction.Action.STOP_SPRINTING.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[7];
            "".length();
            if ("   ".length() < ((0x27 ^ 0x17) & ~(0x99 ^ 0xA9))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return NetHandlerPlayServer.$SWITCH_TABLE$net$minecraft$network$play$client$C0BPacketEntityAction$Action = (int[])(Object)llllllllllllIllIIlIllIlIlIIIIIII;
    }
    
    @Override
    public void handleAnimation(final C0APacketAnimation llllllllllllIllIIlIllIllIlIlIlII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIlIlIlII, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.markPlayerActive();
        this.playerEntity.swingItem();
    }
    
    private static void lIIllIIIlIllIlIl() {
        (llIllIlllIllIl = new String[NetHandlerPlayServer.llIlllIIIIIIII[80]])[NetHandlerPlayServer.llIlllIIIIIIII[1]] = lIIllIIIlIIllIlI("HAQXOC8bCAQt", "warHn");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[0]] = lIIllIIIlIIllIlI("Ez4CRzwrJxJHNi80GUc9Lj0SRzIlI1cTOyVxGwg6LXA=", "JQwgT");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[4]] = lIIllIIIlIIllIll("QmdfES8DINe3XfFCfkZ06sMU+3/DibMhO5wLYCRicZY=", "xigWB");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[5]] = lIIllIIIlIIllIll("O0itLLBhVTz+33zgzsYu9UjSLQDxd9g4", "OzcaR");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[6]] = lIIllIIIlIIllIlI("bAsBAykoRhoaI2wXGxwvJwoXVGw=", "LfnuL");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[7]] = lIIllIIIlIIllIll("/47a3V/8QXc=", "dhNnm");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[8]] = lIIllIIIlIIllIlI("Xg==", "rYDIj");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[9]] = lIIllIIIlIIllIlI("cEE=", "PiNQt");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[10]] = lIIllIIIlIIllIlI("Z3E=", "KQZPh");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[11]] = lIIllIIIlIIllIlI("RGU=", "hEJuv");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[12]] = lIIllIIIlIIlllII("ZzS9XkrRz14=", "JUiTC");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[13]] = lIIllIIIlIIllIlI("SwAYMDEPTQA0OwUKGz91", "kmwFT");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[15]] = lIIllIIIlIIllIlI("ZQQKOkouGggiDyFTDSYYZRUHJgsxGgUuSjEcBGkGKh0MaA==", "EskIj");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[16]] = lIIllIIIlIIlllII("vD68OQMbETl+dpfrMABKbFPWLm78h/pg7ec6LG0lFYP2Ow/Z/FB95Q==", "otJAl");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[18]] = lIIllIIIlIIllIlI("OwAMFg8bCloHDxMXHwVDEw0OHgwc", "rnzwc");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[20]] = lIIllIIIlIIllIlI("IwUeADVvBBgDGSgXHw==", "ApwlQ");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[21]] = lIIllIIIlIIllIll("UDY/adcJAIHf6fJVN/QYZpOyL5nTgWxs", "sHBjG");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[22]] = lIIllIIIlIIllIlI("CjMPMQoXKgI8BhVoEykCHiMRaw8CIBc=", "gFcEc");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[23]] = lIIllIIIlIIllIll("a9lfX22AkLiVnD2A1PlG3Ot3BLH3iVAWgdwKiV1HI6uzmh0iq4EBF0hq8lDCtwusadM/14StXec=", "eMeaf");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[24]] = lIIllIIIlIIlllII("EscoNcyDxTo5j5EjCvFOnw==", "ZYDmn");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[17]] = lIIllIIIlIIlllII("+PZsmZNMxxelI5+nFffZAgJiV8eMBfv1", "juoed");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[25]] = lIIllIIIlIIllIlI("AisWMgQmahY1ACE5", "RJuYa");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[26]] = lIIllIIIlIIllIlI("cx45DD03Sj8KeCAPP0U5PUoiCy4yBiIBeDALORcxNg5rDCw2Bw==", "SjKeX");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[27]] = lIIllIIIlIIllIll("y0bSeP2chzq33PyUIlOVmQ==", "nChxT");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[28]] = lIIllIIIlIIllIll("f+WNhdefd0BjHgfJVZTlE1ByrjPXT/UQY+Pzl/j0OOU=", "DbBve");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[29]] = lIIllIIIlIIllIlI("Xw==", "pfenv");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[30]] = lIIllIIIlIIllIll("QN2rcdc+l/tErF1x+w1CPQ==", "RDRyM");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[32]] = lIIllIIIlIIllIll("AVV2vxBxzYRolno8BGYFsQ==", "hnXxm");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[33]] = lIIllIIIlIIllIlI("Dg0EFz0uB1IVPS4GHAJxJAwfGzApB1M=", "GcrvQ");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[34]] = lIIllIIIlIIllIlI("ES0tAwEgLTAIC3AtNkYNJC04BQdwODdGBT4vOAoFNHk8CBg5LSA=", "PYYfl");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[35]] = lIIllIIIlIIlllII("abirC1zv10E=", "yMQsM");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[36]] = lIIllIIIlIIllIll("GnwwneixfZRp5eClTlNNCyj7jyEMTfEmUo8nVk1oDKpJkLfeoMc5Mw==", "WcWhP");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[37]] = lIIllIIIlIIllIlI("CywUdh0zNQR2ETsmBXhVFSIMM1U9NQQkWXIuADhZcioVcQZyJAA7EHIsFzMHcw==", "RCaVu");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[38]] = lIIllIIIlIIllIll("gbLJXTLLDq1yLlgrnO+imVKNkboqmgV8Ii6uEgtLhzY=", "RXxIZ");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[39]] = lIIllIIIlIIllIll("C7COv4pNDaSRQgadsQEcKUaGVay7wAtl", "kSQtq");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[40]] = lIIllIIIlIIlllII("ucm3iDr/j+N/EEFRzFwesFGnUbfPMAaTTWhTjEI3ppP0dUyVOQ6W4G+caJnwYVZu", "huGeo");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[41]] = lIIllIIIlIIllIll("mjS6XAUQMbaHMjfTGHx8PA==", "FaPzK");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[42]] = lIIllIIIlIIllIll("N2Jn3HkbikhMkWOklU4Z7Q==", "ZrfYs");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[43]] = lIIllIIIlIIllIlI("Eg==", "jghGc");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[44]] = lIIllIIIlIIlllII("vGbxT4tAtUE=", "ZWJrZ");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[45]] = lIIllIIIlIIllIll("eaD93ZPKtKs=", "IJuNr");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[46]] = lIIllIIIlIIlllII("TFKJzUCSGMg=", "GRVRr");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[47]] = lIIllIIIlIIllIlI("NQ==", "LNEgc");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[48]] = lIIllIIIlIIlllII("bBrQf4AFIzw=", "aucAR");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[49]] = lIIllIIIlIIllIll("FHUpFhW3Zbg=", "KcfMY");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[50]] = lIIllIIIlIIlllII("u7OF2FTB4w8=", "VRTpJ");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[51]] = lIIllIIIlIIlllII("qPm0DPaAmoE=", "mXUtu");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[52]] = lIIllIIIlIIllIll("iysbXmL/u+6gI/TOd1Sf6Q==", "bVSzn");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[54]] = lIIllIIIlIIlllII("JRO14HQkFwM=", "pWPel");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[55]] = lIIllIIIlIIllIll("VYFKPR0LG1reOTMTA/foMCOTxt2dg5mSP1l798bet72O+YwkqhVjkg==", "mOLvf");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[56]] = lIIllIIIlIIllIlI("IQ4JEAgIJAE=", "lMuRM");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[57]] = lIIllIIIlIIllIlI("BBozJQYkEGUmBSIfZTALKlU=", "MtEDj");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[58]] = lIIllIIIlIIllIll("SyIJ4tF4oKA=", "zOThk");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[59]] = lIIllIIIlIIllIlI("FgUAFhc=", "fdgsd");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[60]] = lIIllIIIlIIllIll("09oBxN5RrGE2mtHCIL3Uk7tgtNwx2wyYzayD+tLPkqk=", "wqhbM");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[61]] = lIIllIIIlIIllIlI("PwwXJBwbKAU=", "rOkfO");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[62]] = lIIllIIIlIIllIll("I05fuxJ7cssaA+RYBM9NggTjyVEHAyHv", "CQPYM");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[63]] = lIIllIIIlIIllIll("qwrrjJRLK8E=", "ArDFE");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[64]] = lIIllIIIlIIlllII("Rbq1fAVyHBI=", "DSRyH");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[65]] = lIIllIIIlIIlllII("15eCvXZLAMI=", "PfRHs");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[3]] = lIIllIIIlIIllIll("pg/HaA1VXWs=", "fUJXC");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[66]] = lIIllIIIlIIllIlI("Kg4IKAE=", "ZooMr");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[67]] = lIIllIIIlIIllIlI("DRsxHycgUzBTMCcTKlMhIRsv", "NtDsC");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[68]] = lIIllIIIlIIllIll("Zv9w9lq9ZSoPwZ/xMsB1Bg==", "GkcrO");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[53]] = lIIllIIIlIIllIlI("FwUaNAA6TRt4FzEGCjsQdB4dOQAx", "TjoXd");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[69]] = lIIllIIIlIIllIll("LaZldfjDr9/SArRKGY7OdQ==", "VMGKQ");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[70]] = lIIllIIIlIIllIll("O/jZGKErwOEQFq9wmyYuawCnEsU2rfKK", "cLhSp");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[71]] = lIIllIIIlIIllIll("z/cBwb10csQ=", "FjCYN");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[72]] = lIIllIIIlIIllIlI("CxE7Dj0OEGMwNx42Ii4/CxspbSEfFi4mIRk=", "juMCR");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[73]] = lIIllIIIlIIllIlI("Cw4gBQAmRiFJFy0VdQoLJQw0BwBoAzkGByM=", "HaUid");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[74]] = lIIllIIIlIIlllII("C6jOBpFCbEN3TRhEQDEyXaNcxARkGAxP", "Udoiw");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[75]] = lIIllIIIlIIlllII("Zf9DZ3+jyG5Vf6eghwGBww==", "WsioS");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[76]] = lIIllIIIlIIllIlI("NDosBSUZci1JMhIheQskFjY2Bw==", "wUYiA");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[77]] = lIIllIIIlIIllIlI("GCw2GAcwAgQwHjA=", "UoJQs");
        NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[79]] = lIIllIIIlIIllIll("Ayn9p1gdc/c=", "kLMem");
    }
    
    public NetHandlerPlayServer(final MinecraftServer llllllllllllIllIIlIlllIIIlllIlIl, final NetworkManager llllllllllllIllIIlIlllIIIlllIlII, final EntityPlayerMP llllllllllllIllIIlIlllIIIlllIIll) {
        this.field_147372_n = new IntHashMap<Short>();
        this.hasMoved = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
        this.serverController = llllllllllllIllIIlIlllIIIlllIlIl;
        this.netManager = llllllllllllIllIIlIlllIIIlllIlII;
        llllllllllllIllIIlIlllIIIlllIlII.setNetHandler(this);
        this.playerEntity = llllllllllllIllIIlIlllIIIlllIIll;
        llllllllllllIllIIlIlllIIIlllIIll.playerNetServerHandler = this;
    }
    
    private static void lIIllIIIlIllIllI() {
        (llIlllIIIIIIII = new int[81])[0] = " ".length();
        NetHandlerPlayServer.llIlllIIIIIIII[1] = ((0x40 ^ 0x2C ^ (0xC1 ^ 0xB3)) & (0xDF ^ 0x89 ^ (0x36 ^ 0x7E) ^ -" ".length()));
        NetHandlerPlayServer.llIlllIIIIIIII[2] = (-(0xFFFFDD3F & 0x6ED7) & (-1 & 0x4FFE));
        NetHandlerPlayServer.llIlllIIIIIIII[3] = (0x68 ^ 0x54);
        NetHandlerPlayServer.llIlllIIIIIIII[4] = "  ".length();
        NetHandlerPlayServer.llIlllIIIIIIII[5] = "   ".length();
        NetHandlerPlayServer.llIlllIIIIIIII[6] = (0xA3 ^ 0xA7);
        NetHandlerPlayServer.llIlllIIIIIIII[7] = (0x6 ^ 0x3);
        NetHandlerPlayServer.llIlllIIIIIIII[8] = (0xCE ^ 0xC1 ^ (0x29 ^ 0x20));
        NetHandlerPlayServer.llIlllIIIIIIII[9] = (162 + 175 - 173 + 26 ^ 18 + 0 + 145 + 22);
        NetHandlerPlayServer.llIlllIIIIIIII[10] = (0xC9 ^ 0x8A ^ (0x14 ^ 0x5F));
        NetHandlerPlayServer.llIlllIIIIIIII[11] = (0x39 ^ 0x30);
        NetHandlerPlayServer.llIlllIIIIIIII[12] = (0x25 ^ 0x4A ^ (0x6E ^ 0xB));
        NetHandlerPlayServer.llIlllIIIIIIII[13] = (0x1F ^ 0x14);
        NetHandlerPlayServer.llIlllIIIIIIII[14] = (0x74 ^ 0x24);
        NetHandlerPlayServer.llIlllIIIIIIII[15] = (0xD ^ 0x1);
        NetHandlerPlayServer.llIlllIIIIIIII[16] = (0x8B ^ 0x86);
        NetHandlerPlayServer.llIlllIIIIIIII[17] = (0x4B ^ 0x5F);
        NetHandlerPlayServer.llIlllIIIIIIII[18] = (97 + 94 - 172 + 125 ^ 34 + 127 - 5 + 2);
        NetHandlerPlayServer.llIlllIIIIIIII[19] = 224 + 152 - 281 + 160;
        NetHandlerPlayServer.llIlllIIIIIIII[20] = (0x2A ^ 0x25);
        NetHandlerPlayServer.llIlllIIIIIIII[21] = (0x1C ^ 0xC);
        NetHandlerPlayServer.llIlllIIIIIIII[22] = (0xD0 ^ 0xC1);
        NetHandlerPlayServer.llIlllIIIIIIII[23] = (0x14 ^ 0x6);
        NetHandlerPlayServer.llIlllIIIIIIII[24] = (0x22 ^ 0x31);
        NetHandlerPlayServer.llIlllIIIIIIII[25] = (0x72 ^ 0x67);
        NetHandlerPlayServer.llIlllIIIIIIII[26] = (0xD5 ^ 0xC3);
        NetHandlerPlayServer.llIlllIIIIIIII[27] = (0x40 ^ 0x22 ^ (0xD5 ^ 0xA0));
        NetHandlerPlayServer.llIlllIIIIIIII[28] = (0xA9 ^ 0xB1);
        NetHandlerPlayServer.llIlllIIIIIIII[29] = (58 + 18 + 5 + 80 ^ 146 + 31 - 152 + 159);
        NetHandlerPlayServer.llIlllIIIIIIII[30] = (0xB7 ^ 0xAD);
        NetHandlerPlayServer.llIlllIIIIIIII[31] = 102 + 186 - 172 + 84;
        NetHandlerPlayServer.llIlllIIIIIIII[32] = (0x1A ^ 0x1);
        NetHandlerPlayServer.llIlllIIIIIIII[33] = (0x1D ^ 0x1);
        NetHandlerPlayServer.llIlllIIIIIIII[34] = (0x5 ^ 0x18);
        NetHandlerPlayServer.llIlllIIIIIIII[35] = (0x84 ^ 0xAB ^ (0x96 ^ 0xA7));
        NetHandlerPlayServer.llIlllIIIIIIII[36] = (126 + 53 - 99 + 72 ^ 41 + 116 - 112 + 90);
        NetHandlerPlayServer.llIlllIIIIIIII[37] = (0x23 ^ 0x3);
        NetHandlerPlayServer.llIlllIIIIIIII[38] = (0x54 ^ 0x75);
        NetHandlerPlayServer.llIlllIIIIIIII[39] = (0xB1 ^ 0x93);
        NetHandlerPlayServer.llIlllIIIIIIII[40] = (0x73 ^ 0x62 ^ (0x48 ^ 0x7A));
        NetHandlerPlayServer.llIlllIIIIIIII[41] = (0xDD ^ 0x8D ^ (0x77 ^ 0x3));
        NetHandlerPlayServer.llIlllIIIIIIII[42] = (125 + 128 - 250 + 139 ^ 121 + 66 - 45 + 29);
        NetHandlerPlayServer.llIlllIIIIIIII[43] = (0x16 ^ 0xA ^ (0xF9 ^ 0xC3));
        NetHandlerPlayServer.llIlllIIIIIIII[44] = (0xC0 ^ 0xB2 ^ (0x21 ^ 0x74));
        NetHandlerPlayServer.llIlllIIIIIIII[45] = ("  ".length() ^ (0x3F ^ 0x15));
        NetHandlerPlayServer.llIlllIIIIIIII[46] = (0x9D ^ 0xA7 ^ (0x3E ^ 0x2D));
        NetHandlerPlayServer.llIlllIIIIIIII[47] = (0x22 ^ 0x8);
        NetHandlerPlayServer.llIlllIIIIIIII[48] = (0x5D ^ 0x76);
        NetHandlerPlayServer.llIlllIIIIIIII[49] = (0x19 ^ 0x35);
        NetHandlerPlayServer.llIlllIIIIIIII[50] = (0xED ^ 0xC0);
        NetHandlerPlayServer.llIlllIIIIIIII[51] = (0xB ^ 0x25);
        NetHandlerPlayServer.llIlllIIIIIIII[52] = (0x25 ^ 0x66 ^ (0x31 ^ 0x5D));
        NetHandlerPlayServer.llIlllIIIIIIII[53] = (0xC7 ^ 0x87);
        NetHandlerPlayServer.llIlllIIIIIIII[54] = (0x67 ^ 0x57);
        NetHandlerPlayServer.llIlllIIIIIIII[55] = (24 + 86 - 76 + 154 ^ 71 + 83 - 137 + 124);
        NetHandlerPlayServer.llIlllIIIIIIII[56] = (0xEC ^ 0xA5 ^ (0x30 ^ 0x4B));
        NetHandlerPlayServer.llIlllIIIIIIII[57] = (0xCF ^ 0x8F ^ (0x3A ^ 0x49));
        NetHandlerPlayServer.llIlllIIIIIIII[58] = (0x93 ^ 0xB7 ^ (0x91 ^ 0x81));
        NetHandlerPlayServer.llIlllIIIIIIII[59] = (0x91 ^ 0xA4);
        NetHandlerPlayServer.llIlllIIIIIIII[60] = (0x5 ^ 0x33);
        NetHandlerPlayServer.llIlllIIIIIIII[61] = (0x51 ^ 0x3C ^ (0xFB ^ 0xA1));
        NetHandlerPlayServer.llIlllIIIIIIII[62] = (201 + 200 - 324 + 178 ^ 96 + 55 - 78 + 126);
        NetHandlerPlayServer.llIlllIIIIIIII[63] = (42 + 71 + 35 + 41 ^ 113 + 79 - 60 + 0);
        NetHandlerPlayServer.llIlllIIIIIIII[64] = (0x75 ^ 0x42 ^ (0xA6 ^ 0xAB));
        NetHandlerPlayServer.llIlllIIIIIIII[65] = (0x78 ^ 0x43);
        NetHandlerPlayServer.llIlllIIIIIIII[66] = (4 + 71 - 68 + 141 ^ 163 + 135 - 294 + 165);
        NetHandlerPlayServer.llIlllIIIIIIII[67] = (0xBF ^ 0x81);
        NetHandlerPlayServer.llIlllIIIIIIII[68] = (10 + 50 - 52 + 145 ^ 133 + 164 - 273 + 142);
        NetHandlerPlayServer.llIlllIIIIIIII[69] = (0xD2 ^ 0x93);
        NetHandlerPlayServer.llIlllIIIIIIII[70] = (0x1B ^ 0x59);
        NetHandlerPlayServer.llIlllIIIIIIII[71] = (229 + 122 - 160 + 63 ^ 125 + 112 - 161 + 113);
        NetHandlerPlayServer.llIlllIIIIIIII[72] = (0xF ^ 0x46 ^ (0x3D ^ 0x30));
        NetHandlerPlayServer.llIlllIIIIIIII[73] = (0x3E ^ 0x48 ^ (0xB7 ^ 0x84));
        NetHandlerPlayServer.llIlllIIIIIIII[74] = (0xC ^ 0x28 ^ (0x13 ^ 0x71));
        NetHandlerPlayServer.llIlllIIIIIIII[75] = (60 + 64 + 7 + 116 ^ 163 + 5 - 166 + 174);
        NetHandlerPlayServer.llIlllIIIIIIII[76] = (0x1F ^ 0x57);
        NetHandlerPlayServer.llIlllIIIIIIII[77] = (0x4D ^ 0x47 ^ (0xFA ^ 0xB9));
        NetHandlerPlayServer.llIlllIIIIIIII[78] = (-1 & 0x7FFF);
        NetHandlerPlayServer.llIlllIIIIIIII[79] = (0x19 ^ 0x10 ^ (0x62 ^ 0x21));
        NetHandlerPlayServer.llIlllIIIIIIII[80] = (0x3B ^ 0x70);
    }
    
    @Override
    public void processClickWindow(final C0EPacketClickWindow llllllllllllIllIIlIllIllIIlIIIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIIlIIIll, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.markPlayerActive();
        if (lIIllIIIllIIIlll(this.playerEntity.openContainer.windowId, llllllllllllIllIIlIllIllIIlIIIll.getWindowId()) && lIIllIIIlIlllIIl(this.playerEntity.openContainer.getCanCraft(this.playerEntity) ? 1 : 0)) {
            if (lIIllIIIlIlllIIl(this.playerEntity.isSpectator() ? 1 : 0)) {
                final List<ItemStack> llllllllllllIllIIlIllIllIIlIIIlI = (List<ItemStack>)Lists.newArrayList();
                int llllllllllllIllIIlIllIllIIlIIIIl = NetHandlerPlayServer.llIlllIIIIIIII[1];
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
                while (!lIIllIIIllIIIIll(llllllllllllIllIIlIllIllIIlIIIIl, this.playerEntity.openContainer.inventorySlots.size())) {
                    llllllllllllIllIIlIllIllIIlIIIlI.add(this.playerEntity.openContainer.inventorySlots.get(llllllllllllIllIIlIllIllIIlIIIIl).getStack());
                    "".length();
                    ++llllllllllllIllIIlIllIllIIlIIIIl;
                }
                this.playerEntity.updateCraftingInventory(this.playerEntity.openContainer, llllllllllllIllIIlIllIllIIlIIIlI);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                final ItemStack llllllllllllIllIIlIllIllIIlIIIII = this.playerEntity.openContainer.slotClick(llllllllllllIllIIlIllIllIIlIIIll.getSlotId(), llllllllllllIllIIlIllIllIIlIIIll.getUsedButton(), llllllllllllIllIIlIllIllIIlIIIll.getMode(), this.playerEntity);
                if (lIIllIIIlIlllIIl(ItemStack.areItemStacksEqual(llllllllllllIllIIlIllIllIIlIIIll.getClickedItem(), llllllllllllIllIIlIllIllIIlIIIII) ? 1 : 0)) {
                    this.playerEntity.playerNetServerHandler.sendPacket(new S32PacketConfirmTransaction(llllllllllllIllIIlIllIllIIlIIIll.getWindowId(), llllllllllllIllIIlIllIllIIlIIIll.getActionNumber(), (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0)));
                    this.playerEntity.isChangingQuantityOnly = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
                    this.playerEntity.openContainer.detectAndSendChanges();
                    this.playerEntity.updateHeldItem();
                    this.playerEntity.isChangingQuantityOnly = (NetHandlerPlayServer.llIlllIIIIIIII[1] != 0);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.field_147372_n.addKey(this.playerEntity.openContainer.windowId, llllllllllllIllIIlIllIllIIlIIIll.getActionNumber());
                    this.playerEntity.playerNetServerHandler.sendPacket(new S32PacketConfirmTransaction(llllllllllllIllIIlIllIllIIlIIIll.getWindowId(), llllllllllllIllIIlIllIllIIlIIIll.getActionNumber(), (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0)));
                    this.playerEntity.openContainer.setCanCraft(this.playerEntity, (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                    final List<ItemStack> llllllllllllIllIIlIllIllIIIlllll = (List<ItemStack>)Lists.newArrayList();
                    int llllllllllllIllIIlIllIllIIIllllI = NetHandlerPlayServer.llIlllIIIIIIII[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIIllIIIllIIIIll(llllllllllllIllIIlIllIllIIIllllI, this.playerEntity.openContainer.inventorySlots.size())) {
                        llllllllllllIllIIlIllIllIIIlllll.add(this.playerEntity.openContainer.inventorySlots.get(llllllllllllIllIIlIllIllIIIllllI).getStack());
                        "".length();
                        ++llllllllllllIllIIlIllIllIIIllllI;
                    }
                    this.playerEntity.updateCraftingInventory(this.playerEntity.openContainer, llllllllllllIllIIlIllIllIIIlllll);
                }
            }
        }
    }
    
    @Override
    public void processPlayerDigging(final C07PacketPlayerDigging llllllllllllIllIIlIllIllllIIlIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllllIIlIll, this, this.playerEntity.getServerForPlayer());
        final WorldServer llllllllllllIllIIlIllIllllIIlIlI = this.serverController.worldServerForDimension(this.playerEntity.dimension);
        final BlockPos llllllllllllIllIIlIllIllllIIlIIl = llllllllllllIllIIlIllIllllIIlIll.getPosition();
        this.playerEntity.markPlayerActive();
        switch ($SWITCH_TABLE$net$minecraft$network$play$client$C07PacketPlayerDigging$Action()[llllllllllllIllIIlIllIllllIIlIll.getStatus().ordinal()]) {
            case 5: {
                if (lIIllIIIlIllllII(this.playerEntity.isSpectator() ? 1 : 0)) {
                    this.playerEntity.dropOneItem((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                    "".length();
                }
            }
            case 4: {
                if (lIIllIIIlIllllII(this.playerEntity.isSpectator() ? 1 : 0)) {
                    this.playerEntity.dropOneItem((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
                    "".length();
                }
            }
            case 6: {
                this.playerEntity.stopUsingItem();
            }
            case 1:
            case 2:
            case 3: {
                final double llllllllllllIllIIlIllIllllIIlIII = this.playerEntity.posX - (llllllllllllIllIIlIllIllllIIlIIl.getX() + 0.5);
                final double llllllllllllIllIIlIllIllllIIIlll = this.playerEntity.posY - (llllllllllllIllIIlIllIllllIIlIIl.getY() + 0.5) + 1.5;
                final double llllllllllllIllIIlIllIllllIIIllI = this.playerEntity.posZ - (llllllllllllIllIIlIllIllllIIlIIl.getZ() + 0.5);
                final double llllllllllllIllIIlIllIllllIIIlIl = llllllllllllIllIIlIllIllllIIlIII * llllllllllllIllIIlIllIllllIIlIII + llllllllllllIllIIlIllIllllIIIlll * llllllllllllIllIIlIllIllllIIIlll + llllllllllllIllIIlIllIllllIIIllI * llllllllllllIllIIlIllIllllIIIllI;
                if (lIIllIIIlIlllIII(lIIllIIIllIIIIlI(llllllllllllIllIIlIllIllllIIIlIl, 36.0))) {
                    return;
                }
                if (lIIllIIIllIIIIll(llllllllllllIllIIlIllIllllIIlIIl.getY(), this.serverController.getBuildLimit())) {
                    return;
                }
                if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllllIIlIll.getStatus(), C07PacketPlayerDigging.Action.START_DESTROY_BLOCK)) {
                    if (lIIllIIIlIllllII(this.serverController.isBlockProtected(llllllllllllIllIIlIllIllllIIlIlI, llllllllllllIllIIlIllIllllIIlIIl, this.playerEntity) ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllllIIlIlI.getWorldBorder().contains(llllllllllllIllIIlIllIllllIIlIIl) ? 1 : 0)) {
                        this.playerEntity.theItemInWorldManager.onBlockClicked(llllllllllllIllIIlIllIllllIIlIIl, llllllllllllIllIIlIllIllllIIlIll.getFacing());
                        "".length();
                        if (((29 + 100 - 88 + 114 ^ 111 + 121 - 206 + 119) & (30 + 164 - 89 + 86 ^ 139 + 26 + 13 + 3 ^ -" ".length())) == "   ".length()) {
                            return;
                        }
                    }
                    else {
                        this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(llllllllllllIllIIlIllIllllIIlIlI, llllllllllllIllIIlIllIllllIIlIIl));
                        "".length();
                        if (-" ".length() > (0xB1 ^ 0xB5)) {
                            return;
                        }
                    }
                }
                else {
                    if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllllIIlIll.getStatus(), C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK)) {
                        this.playerEntity.theItemInWorldManager.blockRemoving(llllllllllllIllIIlIllIllllIIlIIl);
                        "".length();
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                    }
                    else if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllllIIlIll.getStatus(), C07PacketPlayerDigging.Action.ABORT_DESTROY_BLOCK)) {
                        this.playerEntity.theItemInWorldManager.cancelDestroyingBlock();
                    }
                    if (lIIllIIIllIIIlIl(llllllllllllIllIIlIllIllllIIlIlI.getBlockState(llllllllllllIllIIlIllIllllIIlIIl).getBlock().getMaterial(), Material.air)) {
                        this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(llllllllllllIllIIlIllIllllIIlIlI, llllllllllllIllIIlIllIllllIIlIIl));
                    }
                }
            }
            default: {
                throw new IllegalArgumentException(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[18]]);
            }
        }
    }
    
    public void sendPacket(final Packet llllllllllllIllIIlIllIllIlllIlll) {
        if (lIIllIIIlIlllIIl((llllllllllllIllIIlIllIllIlllIlll instanceof S02PacketChat) ? 1 : 0)) {
            final S02PacketChat llllllllllllIllIIlIllIllIlllllIl = (S02PacketChat)llllllllllllIllIIlIllIllIlllIlll;
            final EntityPlayer.EnumChatVisibility llllllllllllIllIIlIllIllIlllllII = this.playerEntity.getChatVisibility();
            if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllIlllllII, EntityPlayer.EnumChatVisibility.HIDDEN)) {
                return;
            }
            if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllIlllllII, EntityPlayer.EnumChatVisibility.SYSTEM) && lIIllIIIlIllllII(llllllllllllIllIIlIllIllIlllllIl.isChat() ? 1 : 0)) {
                return;
            }
        }
        try {
            this.netManager.sendPacket(llllllllllllIllIIlIllIllIlllIlll);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIlIllIllIllllIll) {
            final CrashReport llllllllllllIllIIlIllIllIllllIlI = CrashReport.makeCrashReport(llllllllllllIllIIlIllIllIllllIll, NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[24]]);
            final CrashReportCategory llllllllllllIllIIlIllIllIllllIIl = llllllllllllIllIIlIllIllIllllIlI.makeCategory(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[17]]);
            llllllllllllIllIIlIllIllIllllIIl.addCrashSectionCallable(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[25]], new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return llllllllllllIllIIlIllIllIlllIlll.getClass().getCanonicalName();
                }
            });
            throw new ReportedException(llllllllllllIllIIlIllIllIllllIlI);
        }
    }
    
    @Override
    public void processPlayer(final C03PacketPlayer llllllllllllIllIIlIlllIIIIIllIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIlllIIIIIllIlI, this, this.playerEntity.getServerForPlayer());
        if (lIIllIIIlIlllIIl(this.func_183006_b(llllllllllllIllIIlIlllIIIIIllIlI) ? 1 : 0)) {
            this.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[4]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final WorldServer llllllllllllIllIIlIlllIIIIlllIIl = this.serverController.worldServerForDimension(this.playerEntity.dimension);
            this.field_147366_g = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
            if (lIIllIIIlIllllII(this.playerEntity.playerConqueredTheEnd ? 1 : 0)) {
                final double llllllllllllIllIIlIlllIIIIlllIII = this.playerEntity.posX;
                final double llllllllllllIllIIlIlllIIIIllIlll = this.playerEntity.posY;
                final double llllllllllllIllIIlIlllIIIIllIllI = this.playerEntity.posZ;
                double llllllllllllIllIIlIlllIIIIllIlIl = 0.0;
                final double llllllllllllIllIIlIlllIIIIllIlII = llllllllllllIllIIlIlllIIIIIllIlI.getPositionX() - this.lastPosX;
                final double llllllllllllIllIIlIlllIIIIllIIll = llllllllllllIllIIlIlllIIIIIllIlI.getPositionY() - this.lastPosY;
                final double llllllllllllIllIIlIlllIIIIllIIlI = llllllllllllIllIIlIlllIIIIIllIlI.getPositionZ() - this.lastPosZ;
                if (lIIllIIIlIlllIIl(llllllllllllIllIIlIlllIIIIIllIlI.isMoving() ? 1 : 0)) {
                    llllllllllllIllIIlIlllIIIIllIlIl = llllllllllllIllIIlIlllIIIIllIlII * llllllllllllIllIIlIlllIIIIllIlII + llllllllllllIllIIlIlllIIIIllIIll * llllllllllllIllIIlIlllIIIIllIIll + llllllllllllIllIIlIlllIIIIllIIlI * llllllllllllIllIIlIlllIIIIllIIlI;
                    if (lIIllIIIlIllllII(this.hasMoved ? 1 : 0) && lIIllIIIlIllllIl(lIIllIIIlIlllIlI(llllllllllllIllIIlIlllIIIIllIlIl, 0.25))) {
                        this.hasMoved = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
                    }
                }
                if (lIIllIIIlIlllIIl(this.hasMoved ? 1 : 0)) {
                    this.field_175090_f = this.networkTickCount;
                    if (lIIllIIIlIlllllI(this.playerEntity.ridingEntity)) {
                        float llllllllllllIllIIlIlllIIIIllIIIl = this.playerEntity.rotationYaw;
                        float llllllllllllIllIIlIlllIIIIllIIII = this.playerEntity.rotationPitch;
                        this.playerEntity.ridingEntity.updateRiderPosition();
                        final double llllllllllllIllIIlIlllIIIIlIllll = this.playerEntity.posX;
                        final double llllllllllllIllIIlIlllIIIIlIlllI = this.playerEntity.posY;
                        final double llllllllllllIllIIlIlllIIIIlIllIl = this.playerEntity.posZ;
                        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIlllIIIIIllIlI.getRotating() ? 1 : 0)) {
                            llllllllllllIllIIlIlllIIIIllIIIl = llllllllllllIllIIlIlllIIIIIllIlI.getYaw();
                            llllllllllllIllIIlIlllIIIIllIIII = llllllllllllIllIIlIlllIIIIIllIlI.getPitch();
                        }
                        this.playerEntity.onGround = llllllllllllIllIIlIlllIIIIIllIlI.isOnGround();
                        this.playerEntity.onUpdateEntity();
                        this.playerEntity.setPositionAndRotation(llllllllllllIllIIlIlllIIIIlIllll, llllllllllllIllIIlIlllIIIIlIlllI, llllllllllllIllIIlIlllIIIIlIllIl, llllllllllllIllIIlIlllIIIIllIIIl, llllllllllllIllIIlIlllIIIIllIIII);
                        if (lIIllIIIlIlllllI(this.playerEntity.ridingEntity)) {
                            this.playerEntity.ridingEntity.updateRiderPosition();
                        }
                        this.serverController.getConfigurationManager().serverUpdateMountedMovingPlayer(this.playerEntity);
                        if (lIIllIIIlIlllllI(this.playerEntity.ridingEntity)) {
                            if (lIIllIIIlIlllIII(lIIllIIIlIlllIll(llllllllllllIllIIlIlllIIIIllIlIl, 4.0))) {
                                final Entity llllllllllllIllIIlIlllIIIIlIllII = this.playerEntity.ridingEntity;
                                this.playerEntity.playerNetServerHandler.sendPacket(new S18PacketEntityTeleport(llllllllllllIllIIlIlllIIIIlIllII));
                                this.setPlayerLocation(this.playerEntity.posX, this.playerEntity.posY, this.playerEntity.posZ, this.playerEntity.rotationYaw, this.playerEntity.rotationPitch);
                            }
                            this.playerEntity.ridingEntity.isAirBorne = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
                        }
                        if (lIIllIIIlIlllIIl(this.hasMoved ? 1 : 0)) {
                            this.lastPosX = this.playerEntity.posX;
                            this.lastPosY = this.playerEntity.posY;
                            this.lastPosZ = this.playerEntity.posZ;
                        }
                        llllllllllllIllIIlIlllIIIIlllIIl.updateEntity(this.playerEntity);
                        return;
                    }
                    if (lIIllIIIlIlllIIl(this.playerEntity.isPlayerSleeping() ? 1 : 0)) {
                        this.playerEntity.onUpdateEntity();
                        this.playerEntity.setPositionAndRotation(this.lastPosX, this.lastPosY, this.lastPosZ, this.playerEntity.rotationYaw, this.playerEntity.rotationPitch);
                        llllllllllllIllIIlIlllIIIIlllIIl.updateEntity(this.playerEntity);
                        return;
                    }
                    final double llllllllllllIllIIlIlllIIIIlIlIll = this.playerEntity.posY;
                    this.lastPosX = this.playerEntity.posX;
                    this.lastPosY = this.playerEntity.posY;
                    this.lastPosZ = this.playerEntity.posZ;
                    double llllllllllllIllIIlIlllIIIIlIlIlI = this.playerEntity.posX;
                    double llllllllllllIllIIlIlllIIIIlIlIIl = this.playerEntity.posY;
                    double llllllllllllIllIIlIlllIIIIlIlIII = this.playerEntity.posZ;
                    float llllllllllllIllIIlIlllIIIIlIIlll = this.playerEntity.rotationYaw;
                    float llllllllllllIllIIlIlllIIIIlIIllI = this.playerEntity.rotationPitch;
                    if (lIIllIIIlIlllIIl(llllllllllllIllIIlIlllIIIIIllIlI.isMoving() ? 1 : 0) && lIIllIIIlIllllII(lIIllIIIlIlllIll(llllllllllllIllIIlIlllIIIIIllIlI.getPositionY(), -999.0))) {
                        llllllllllllIllIIlIlllIIIIIllIlI.setMoving((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                    }
                    if (lIIllIIIlIlllIIl(llllllllllllIllIIlIlllIIIIIllIlI.isMoving() ? 1 : 0)) {
                        llllllllllllIllIIlIlllIIIIlIlIlI = llllllllllllIllIIlIlllIIIIIllIlI.getPositionX();
                        llllllllllllIllIIlIlllIIIIlIlIIl = llllllllllllIllIIlIlllIIIIIllIlI.getPositionY();
                        llllllllllllIllIIlIlllIIIIlIlIII = llllllllllllIllIIlIlllIIIIIllIlI.getPositionZ();
                        if (!lIIllIIIlIllllll(lIIllIIIlIlllIll(Math.abs(llllllllllllIllIIlIlllIIIIIllIlI.getPositionX()), 3.0E7)) || lIIllIIIlIlllIII(lIIllIIIlIlllIll(Math.abs(llllllllllllIllIIlIlllIIIIIllIlI.getPositionZ()), 3.0E7))) {
                            this.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[5]]);
                            return;
                        }
                    }
                    if (lIIllIIIlIlllIIl(llllllllllllIllIIlIlllIIIIIllIlI.getRotating() ? 1 : 0)) {
                        llllllllllllIllIIlIlllIIIIlIIlll = llllllllllllIllIIlIlllIIIIIllIlI.getYaw();
                        llllllllllllIllIIlIlllIIIIlIIllI = llllllllllllIllIIlIlllIIIIIllIlI.getPitch();
                    }
                    this.playerEntity.onUpdateEntity();
                    this.playerEntity.setPositionAndRotation(this.lastPosX, this.lastPosY, this.lastPosZ, llllllllllllIllIIlIlllIIIIlIIlll, llllllllllllIllIIlIlllIIIIlIIllI);
                    if (lIIllIIIlIllllII(this.hasMoved ? 1 : 0)) {
                        return;
                    }
                    double llllllllllllIllIIlIlllIIIIlIIlIl = llllllllllllIllIIlIlllIIIIlIlIlI - this.playerEntity.posX;
                    double llllllllllllIllIIlIlllIIIIlIIlII = llllllllllllIllIIlIlllIIIIlIlIIl - this.playerEntity.posY;
                    double llllllllllllIllIIlIlllIIIIlIIIll = llllllllllllIllIIlIlllIIIIlIlIII - this.playerEntity.posZ;
                    final double llllllllllllIllIIlIlllIIIIlIIIlI = this.playerEntity.motionX * this.playerEntity.motionX + this.playerEntity.motionY * this.playerEntity.motionY + this.playerEntity.motionZ * this.playerEntity.motionZ;
                    double llllllllllllIllIIlIlllIIIIlIIIIl = llllllllllllIllIIlIlllIIIIlIIlIl * llllllllllllIllIIlIlllIIIIlIIlIl + llllllllllllIllIIlIlllIIIIlIIlII * llllllllllllIllIIlIlllIIIIlIIlII + llllllllllllIllIIlIlllIIIIlIIIll * llllllllllllIllIIlIlllIIIIlIIIll;
                    if (lIIllIIIlIlllIII(lIIllIIIlIlllIll(llllllllllllIllIIlIlllIIIIlIIIIl - llllllllllllIllIIlIlllIIIIlIIIlI, 100.0)) && (!lIIllIIIlIlllIIl(this.serverController.isSinglePlayer() ? 1 : 0) || lIIllIIIlIllllII(this.serverController.getServerOwner().equals(this.playerEntity.getName()) ? 1 : 0))) {
                        NetHandlerPlayServer.logger.warn(String.valueOf(new StringBuilder(String.valueOf(this.playerEntity.getName())).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[6]]).append(llllllllllllIllIIlIlllIIIIlIIlIl).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[7]]).append(llllllllllllIllIIlIlllIIIIlIIlII).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[8]]).append(llllllllllllIllIIlIlllIIIIlIIIll).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[9]]).append(llllllllllllIllIIlIlllIIIIlIIlIl).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[10]]).append(llllllllllllIllIIlIlllIIIIlIIlII).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[11]]).append(llllllllllllIllIIlIlllIIIIlIIIll).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[12]])));
                        this.setPlayerLocation(this.lastPosX, this.lastPosY, this.lastPosZ, this.playerEntity.rotationYaw, this.playerEntity.rotationPitch);
                        return;
                    }
                    final float llllllllllllIllIIlIlllIIIIlIIIII = 0.0625f;
                    final boolean llllllllllllIllIIlIlllIIIIIlllll = llllllllllllIllIIlIlllIIIIlllIIl.getCollidingBoundingBoxes(this.playerEntity, this.playerEntity.getEntityBoundingBox().contract(llllllllllllIllIIlIlllIIIIlIIIII, llllllllllllIllIIlIlllIIIIlIIIII, llllllllllllIllIIlIlllIIIIlIIIII)).isEmpty();
                    if (lIIllIIIlIlllIIl(this.playerEntity.onGround ? 1 : 0) && lIIllIIIlIllllII(llllllllllllIllIIlIlllIIIIIllIlI.isOnGround() ? 1 : 0) && lIIllIIIlIlllIII(lIIllIIIlIlllIll(llllllllllllIllIIlIlllIIIIlIIlII, 0.0))) {
                        this.playerEntity.jump();
                    }
                    this.playerEntity.moveEntity(llllllllllllIllIIlIlllIIIIlIIlIl, llllllllllllIllIIlIlllIIIIlIIlII, llllllllllllIllIIlIlllIIIIlIIIll);
                    this.playerEntity.onGround = llllllllllllIllIIlIlllIIIIIllIlI.isOnGround();
                    llllllllllllIllIIlIlllIIIIlIIlIl = llllllllllllIllIIlIlllIIIIlIlIlI - this.playerEntity.posX;
                    llllllllllllIllIIlIlllIIIIlIIlII = llllllllllllIllIIlIlllIIIIlIlIIl - this.playerEntity.posY;
                    if (!lIIllIIIlIllllll(lIIllIIIlIlllIll(llllllllllllIllIIlIlllIIIIlIIlII, -0.5)) || lIIllIIIlIllllIl(lIIllIIIlIlllIlI(llllllllllllIllIIlIlllIIIIlIIlII, 0.5))) {
                        llllllllllllIllIIlIlllIIIIlIIlII = 0.0;
                    }
                    llllllllllllIllIIlIlllIIIIlIIIll = llllllllllllIllIIlIlllIIIIlIlIII - this.playerEntity.posZ;
                    llllllllllllIllIIlIlllIIIIlIIIIl = llllllllllllIllIIlIlllIIIIlIIlIl * llllllllllllIllIIlIlllIIIIlIIlIl + llllllllllllIllIIlIlllIIIIlIIlII * llllllllllllIllIIlIlllIIIIlIIlII + llllllllllllIllIIlIlllIIIIlIIIll * llllllllllllIllIIlIlllIIIIlIIIll;
                    boolean llllllllllllIllIIlIlllIIIIIllllI = NetHandlerPlayServer.llIlllIIIIIIII[1] != 0;
                    if (lIIllIIIlIlllIII(lIIllIIIlIlllIll(llllllllllllIllIIlIlllIIIIlIIIIl, 0.0625)) && lIIllIIIlIllllII(this.playerEntity.isPlayerSleeping() ? 1 : 0) && lIIllIIIlIllllII(this.playerEntity.theItemInWorldManager.isCreative() ? 1 : 0)) {
                        llllllllllllIllIIlIlllIIIIIllllI = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
                        NetHandlerPlayServer.logger.warn(String.valueOf(new StringBuilder(String.valueOf(this.playerEntity.getName())).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[13]])));
                    }
                    this.playerEntity.setPositionAndRotation(llllllllllllIllIIlIlllIIIIlIlIlI, llllllllllllIllIIlIlllIIIIlIlIIl, llllllllllllIllIIlIlllIIIIlIlIII, llllllllllllIllIIlIlllIIIIlIIlll, llllllllllllIllIIlIlllIIIIlIIllI);
                    this.playerEntity.addMovementStat(this.playerEntity.posX - llllllllllllIllIIlIlllIIIIlllIII, this.playerEntity.posY - llllllllllllIllIIlIlllIIIIllIlll, this.playerEntity.posZ - llllllllllllIllIIlIlllIIIIllIllI);
                    if (lIIllIIIlIllllII(this.playerEntity.noClip ? 1 : 0)) {
                        final boolean llllllllllllIllIIlIlllIIIIIlllIl = llllllllllllIllIIlIlllIIIIlllIIl.getCollidingBoundingBoxes(this.playerEntity, this.playerEntity.getEntityBoundingBox().contract(llllllllllllIllIIlIlllIIIIlIIIII, llllllllllllIllIIlIlllIIIIlIIIII, llllllllllllIllIIlIlllIIIIlIIIII)).isEmpty();
                        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIlllIIIIIlllll ? 1 : 0) && (!lIIllIIIlIllllII(llllllllllllIllIIlIlllIIIIIllllI ? 1 : 0) || lIIllIIIlIllllII(llllllllllllIllIIlIlllIIIIIlllIl ? 1 : 0)) && lIIllIIIlIllllII(this.playerEntity.isPlayerSleeping() ? 1 : 0)) {
                            this.setPlayerLocation(this.lastPosX, this.lastPosY, this.lastPosZ, llllllllllllIllIIlIlllIIIIlIIlll, llllllllllllIllIIlIlllIIIIlIIllI);
                            return;
                        }
                    }
                    final AxisAlignedBB llllllllllllIllIIlIlllIIIIIlllII = this.playerEntity.getEntityBoundingBox().expand(llllllllllllIllIIlIlllIIIIlIIIII, llllllllllllIllIIlIlllIIIIlIIIII, llllllllllllIllIIlIlllIIIIlIIIII).addCoord(0.0, -0.55, 0.0);
                    if (lIIllIIIlIllllII(this.serverController.isFlightAllowed() ? 1 : 0) && lIIllIIIlIllllII(this.playerEntity.capabilities.allowFlying ? 1 : 0) && lIIllIIIlIllllII(llllllllllllIllIIlIlllIIIIlllIIl.checkBlockCollision(llllllllllllIllIIlIlllIIIIIlllII) ? 1 : 0)) {
                        if (lIIllIIIllIIIIII(lIIllIIIlIlllIll(llllllllllllIllIIlIlllIIIIlIIlII, -0.03125))) {
                            this.floatingTickCount += NetHandlerPlayServer.llIlllIIIIIIII[0];
                            if (lIIllIIIllIIIIIl(this.floatingTickCount, NetHandlerPlayServer.llIlllIIIIIIII[14])) {
                                NetHandlerPlayServer.logger.warn(String.valueOf(new StringBuilder(String.valueOf(this.playerEntity.getName())).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[15]])));
                                this.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[16]]);
                                return;
                            }
                        }
                    }
                    else {
                        this.floatingTickCount = NetHandlerPlayServer.llIlllIIIIIIII[1];
                    }
                    this.playerEntity.onGround = llllllllllllIllIIlIlllIIIIIllIlI.isOnGround();
                    this.serverController.getConfigurationManager().serverUpdateMountedMovingPlayer(this.playerEntity);
                    this.playerEntity.handleFalling(this.playerEntity.posY - llllllllllllIllIIlIlllIIIIlIlIll, llllllllllllIllIIlIlllIIIIIllIlI.isOnGround());
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIIllIIIllIIIIIl(this.networkTickCount - this.field_175090_f, NetHandlerPlayServer.llIlllIIIIIIII[17])) {
                    this.setPlayerLocation(this.lastPosX, this.lastPosY, this.lastPosZ, this.playerEntity.rotationYaw, this.playerEntity.rotationPitch);
                }
            }
        }
    }
    
    private static String lIIllIIIlIIlllII(final String llllllllllllIllIIlIllIlIIllIlIIl, final String llllllllllllIllIIlIllIlIIllIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIIlIllIlIIllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIllIlIIllIlIII.getBytes(StandardCharsets.UTF_8)), NetHandlerPlayServer.llIlllIIIIIIII[10]), "DES");
            final Cipher llllllllllllIllIIlIllIlIIllIlIll = Cipher.getInstance("DES");
            llllllllllllIllIIlIllIlIIllIlIll.init(NetHandlerPlayServer.llIlllIIIIIIII[4], llllllllllllIllIIlIllIlIIllIllII);
            return new String(llllllllllllIllIIlIllIlIIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIllIlIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIllIlIIllIlIlI) {
            llllllllllllIllIIlIllIlIIllIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIIllIIIIII(final int llllllllllllIllIIlIllIlIIIlIIllI) {
        return llllllllllllIllIIlIllIlIIIlIIllI >= 0;
    }
    
    @Override
    public void processCreativeInventoryAction(final C10PacketCreativeInventoryAction llllllllllllIllIIlIllIllIIIIlIIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIIIIlIIl, this, this.playerEntity.getServerForPlayer());
        if (lIIllIIIlIlllIIl(this.playerEntity.theItemInWorldManager.isCreative() ? 1 : 0)) {
            int n;
            if (lIIllIIIlIllllIl(llllllllllllIllIIlIllIllIIIIlIIl.getSlotId())) {
                n = NetHandlerPlayServer.llIlllIIIIIIII[0];
                "".length();
                if ("   ".length() == ((0x27 ^ 0x7F) & ~(0x9A ^ 0xC2))) {
                    return;
                }
            }
            else {
                n = NetHandlerPlayServer.llIlllIIIIIIII[1];
            }
            final boolean llllllllllllIllIIlIllIllIIIIlIII = n != 0;
            final ItemStack llllllllllllIllIIlIllIllIIIIIlll = llllllllllllIllIIlIllIllIIIIlIIl.getStack();
            if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIllIIIIIlll) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIlll.hasTagCompound() ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIlll.getTagCompound().hasKey(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[41]], NetHandlerPlayServer.llIlllIIIIIIII[12]) ? 1 : 0)) {
                final NBTTagCompound llllllllllllIllIIlIllIllIIIIIllI = llllllllllllIllIIlIllIllIIIIIlll.getTagCompound().getCompoundTag(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[42]]);
                if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIllI.hasKey(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[43]]) ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIllI.hasKey(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[44]]) ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIllI.hasKey(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[45]]) ? 1 : 0)) {
                    final BlockPos llllllllllllIllIIlIllIllIIIIIlIl = new BlockPos(llllllllllllIllIIlIllIllIIIIIllI.getInteger(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[46]]), llllllllllllIllIIlIllIllIIIIIllI.getInteger(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[47]]), llllllllllllIllIIlIllIllIIIIIllI.getInteger(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[48]]));
                    final TileEntity llllllllllllIllIIlIllIllIIIIIlII = this.playerEntity.worldObj.getTileEntity(llllllllllllIllIIlIllIllIIIIIlIl);
                    if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIllIIIIIlII)) {
                        final NBTTagCompound llllllllllllIllIIlIllIllIIIIIIll = new NBTTagCompound();
                        llllllllllllIllIIlIllIllIIIIIlII.writeToNBT(llllllllllllIllIIlIllIllIIIIIIll);
                        llllllllllllIllIIlIllIllIIIIIIll.removeTag(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[49]]);
                        llllllllllllIllIIlIllIllIIIIIIll.removeTag(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[50]]);
                        llllllllllllIllIIlIllIllIIIIIIll.removeTag(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[51]]);
                        llllllllllllIllIIlIllIllIIIIIlll.setTagInfo(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[52]], llllllllllllIllIIlIllIllIIIIIIll);
                    }
                }
            }
            int n2;
            if (lIIllIIIllIIIIll(llllllllllllIllIIlIllIllIIIIlIIl.getSlotId(), NetHandlerPlayServer.llIlllIIIIIIII[0]) && lIIllIIIllIIlIIl(llllllllllllIllIIlIllIllIIIIlIIl.getSlotId(), NetHandlerPlayServer.llIlllIIIIIIII[41] + InventoryPlayer.getHotbarSize())) {
                n2 = NetHandlerPlayServer.llIlllIIIIIIII[0];
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                n2 = NetHandlerPlayServer.llIlllIIIIIIII[1];
            }
            final boolean llllllllllllIllIIlIllIllIIIIIIlI = n2 != 0;
            int n3;
            if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIllIIIIIlll) && lIIllIIIllIIlIII(llllllllllllIllIIlIllIllIIIIIlll.getItem())) {
                n3 = NetHandlerPlayServer.llIlllIIIIIIII[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n3 = NetHandlerPlayServer.llIlllIIIIIIII[0];
            }
            final boolean llllllllllllIllIIlIllIllIIIIIIIl = n3 != 0;
            int n4;
            if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIllIIIIIlll) && (!lIIllIIIllIIIIII(llllllllllllIllIIlIllIllIIIIIlll.getMetadata()) || !lIIllIIIllIIlllI(llllllllllllIllIIlIllIllIIIIIlll.stackSize, NetHandlerPlayServer.llIlllIIIIIIII[53]) || lIIllIIIlIllllll(llllllllllllIllIIlIllIllIIIIIlll.stackSize))) {
                n4 = NetHandlerPlayServer.llIlllIIIIIIII[1];
                "".length();
                if (-" ".length() >= ((0x7 ^ 0x32 ^ (0x93 ^ 0xA2)) & (0x74 ^ 0x8 ^ (0x31 ^ 0x49) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                n4 = NetHandlerPlayServer.llIlllIIIIIIII[0];
            }
            final boolean llllllllllllIllIIlIllIllIIIIIIII = n4 != 0;
            if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIIlI ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIIIl ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIIII ? 1 : 0)) {
                if (lIIllIIIllIIlIII(llllllllllllIllIIlIllIllIIIIIlll)) {
                    this.playerEntity.inventoryContainer.putStackInSlot(llllllllllllIllIIlIllIllIIIIlIIl.getSlotId(), null);
                    "".length();
                    if (((129 + 80 - 50 + 91 ^ 136 + 159 - 264 + 130) & (150 + 154 - 146 + 77 ^ 106 + 173 - 166 + 63 ^ -" ".length())) == -" ".length()) {
                        return;
                    }
                }
                else {
                    this.playerEntity.inventoryContainer.putStackInSlot(llllllllllllIllIIlIllIllIIIIlIIl.getSlotId(), llllllllllllIllIIlIllIllIIIIIlll);
                }
                this.playerEntity.inventoryContainer.setCanCraft(this.playerEntity, (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIlIII ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIIIl ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIIIIIIII ? 1 : 0) && lIIllIIIllIIlIIl(this.itemDropThreshold, NetHandlerPlayServer.llIlllIIIIIIII[31])) {
                this.itemDropThreshold += NetHandlerPlayServer.llIlllIIIIIIII[17];
                final EntityItem llllllllllllIllIIlIllIlIllllllll = this.playerEntity.dropPlayerItemWithRandomChoice(llllllllllllIllIIlIllIllIIIIIlll, (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
                if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlIllllllll)) {
                    llllllllllllIllIIlIllIlIllllllll.setAgeToCreativeDespawnTime();
                }
            }
        }
    }
    
    @Override
    public void processInput(final C0CPacketInput llllllllllllIllIIlIlllIIIlIlllII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIlllIIIlIlllII, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.setEntityActionState(llllllllllllIllIIlIlllIIIlIlllII.getStrafeSpeed(), llllllllllllIllIIlIlllIIIlIlllII.getForwardSpeed(), llllllllllllIllIIlIlllIIIlIlllII.isJumping(), llllllllllllIllIIlIlllIIIlIlllII.isSneaking());
    }
    
    private static boolean lIIllIIIlIllllll(final int llllllllllllIllIIlIllIlIIIlIIIlI) {
        return llllllllllllIllIIlIllIlIIIlIIIlI <= 0;
    }
    
    @Override
    public void processCloseWindow(final C0DPacketCloseWindow llllllllllllIllIIlIllIllIIlIllII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIIlIllII, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.closeContainer();
    }
    
    @Override
    public void processPlayerBlockPlacement(final C08PacketPlayerBlockPlacement llllllllllllIllIIlIllIlllIllIIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlllIllIIll, this, this.playerEntity.getServerForPlayer());
        final WorldServer llllllllllllIllIIlIllIlllIllIIlI = this.serverController.worldServerForDimension(this.playerEntity.dimension);
        ItemStack llllllllllllIllIIlIllIlllIllIIIl = this.playerEntity.inventory.getCurrentItem();
        boolean llllllllllllIllIIlIllIlllIllIIII = NetHandlerPlayServer.llIlllIIIIIIII[1] != 0;
        final BlockPos llllllllllllIllIIlIllIlllIlIllll = llllllllllllIllIIlIllIlllIllIIll.getPosition();
        final EnumFacing llllllllllllIllIIlIllIlllIlIlllI = EnumFacing.getFront(llllllllllllIllIIlIllIlllIllIIll.getPlacedBlockDirection());
        this.playerEntity.markPlayerActive();
        if (lIIllIIIllIIIlll(llllllllllllIllIIlIllIlllIllIIll.getPlacedBlockDirection(), NetHandlerPlayServer.llIlllIIIIIIII[19])) {
            if (lIIllIIIllIIlIII(llllllllllllIllIIlIllIlllIllIIIl)) {
                return;
            }
            this.playerEntity.theItemInWorldManager.tryUseItem(this.playerEntity, llllllllllllIllIIlIllIlllIllIIlI, llllllllllllIllIIlIllIlllIllIIIl);
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else if (!lIIllIIIllIIIIll(llllllllllllIllIIlIllIlllIlIllll.getY(), this.serverController.getBuildLimit() - NetHandlerPlayServer.llIlllIIIIIIII[0]) || (lIIllIIIllIIIlIl(llllllllllllIllIIlIllIlllIlIlllI, EnumFacing.UP) && lIIllIIIllIIlIIl(llllllllllllIllIIlIllIlllIlIllll.getY(), this.serverController.getBuildLimit()))) {
            if (lIIllIIIlIlllIIl(this.hasMoved ? 1 : 0) && lIIllIIIlIllllIl(lIIllIIIllIIIllI(this.playerEntity.getDistanceSq(llllllllllllIllIIlIllIlllIlIllll.getX() + 0.5, llllllllllllIllIIlIllIlllIlIllll.getY() + 0.5, llllllllllllIllIIlIllIlllIlIllll.getZ() + 0.5), 64.0)) && lIIllIIIlIllllII(this.serverController.isBlockProtected(llllllllllllIllIIlIllIlllIllIIlI, llllllllllllIllIIlIllIlllIlIllll, this.playerEntity) ? 1 : 0) && lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlllIllIIlI.getWorldBorder().contains(llllllllllllIllIIlIllIlllIlIllll) ? 1 : 0)) {
                this.playerEntity.theItemInWorldManager.activateBlockOrUseItem(this.playerEntity, llllllllllllIllIIlIllIlllIllIIlI, llllllllllllIllIIlIllIlllIllIIIl, llllllllllllIllIIlIllIlllIlIllll, llllllllllllIllIIlIllIlllIlIlllI, llllllllllllIllIIlIllIlllIllIIll.getPlacedBlockOffsetX(), llllllllllllIllIIlIllIlllIllIIll.getPlacedBlockOffsetY(), llllllllllllIllIIlIllIlllIllIIll.getPlacedBlockOffsetZ());
                "".length();
            }
            llllllllllllIllIIlIllIlllIllIIII = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[20]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[NetHandlerPlayServer.llIlllIIIIIIII[0]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayServer.llIlllIIIIIIII[1]] = this.serverController.getBuildLimit();
            final ChatComponentTranslation llllllllllllIllIIlIllIlllIlIllIl = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            llllllllllllIllIIlIllIlllIlIllIl.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            this.playerEntity.playerNetServerHandler.sendPacket(new S02PacketChat(llllllllllllIllIIlIllIlllIlIllIl));
            llllllllllllIllIIlIllIlllIllIIII = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
        }
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlllIllIIII ? 1 : 0)) {
            this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(llllllllllllIllIIlIllIlllIllIIlI, llllllllllllIllIIlIllIlllIlIllll));
            this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(llllllllllllIllIIlIllIlllIllIIlI, llllllllllllIllIIlIllIlllIlIllll.offset(llllllllllllIllIIlIllIlllIlIlllI)));
        }
        llllllllllllIllIIlIllIlllIllIIIl = this.playerEntity.inventory.getCurrentItem();
        if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlllIllIIIl) && lIIllIIIlIllllII(llllllllllllIllIIlIllIlllIllIIIl.stackSize)) {
            this.playerEntity.inventory.mainInventory[this.playerEntity.inventory.currentItem] = null;
            llllllllllllIllIIlIllIlllIllIIIl = null;
        }
        if (!lIIllIIIlIlllllI(llllllllllllIllIIlIllIlllIllIIIl) || lIIllIIIlIllllII(llllllllllllIllIIlIllIlllIllIIIl.getMaxItemUseDuration())) {
            this.playerEntity.isChangingQuantityOnly = (NetHandlerPlayServer.llIlllIIIIIIII[0] != 0);
            this.playerEntity.inventory.mainInventory[this.playerEntity.inventory.currentItem] = ItemStack.copyItemStack(this.playerEntity.inventory.mainInventory[this.playerEntity.inventory.currentItem]);
            final Slot llllllllllllIllIIlIllIlllIlIllII = this.playerEntity.openContainer.getSlotFromInventory(this.playerEntity.inventory, this.playerEntity.inventory.currentItem);
            this.playerEntity.openContainer.detectAndSendChanges();
            this.playerEntity.isChangingQuantityOnly = (NetHandlerPlayServer.llIlllIIIIIIII[1] != 0);
            if (lIIllIIIlIllllII(ItemStack.areItemStacksEqual(this.playerEntity.inventory.getCurrentItem(), llllllllllllIllIIlIllIlllIllIIll.getStack()) ? 1 : 0)) {
                this.sendPacket(new S2FPacketSetSlot(this.playerEntity.openContainer.windowId, llllllllllllIllIIlIllIlllIlIllII.slotNumber, this.playerEntity.inventory.getCurrentItem()));
            }
        }
    }
    
    @Override
    public void handleResourcePackStatus(final C19PacketResourcePackStatus llllllllllllIllIIlIllIlllIIIlllI) {
    }
    
    public void setPlayerLocation(final double llllllllllllIllIIlIllIllllllIlII, final double llllllllllllIllIIlIllIlllllllIIl, final double llllllllllllIllIIlIllIllllllIIlI, final float llllllllllllIllIIlIllIllllllIlll, final float llllllllllllIllIIlIllIllllllIIII) {
        this.setPlayerLocation(llllllllllllIllIIlIllIllllllIlII, llllllllllllIllIIlIllIlllllllIIl, llllllllllllIllIIlIllIllllllIIlI, llllllllllllIllIIlIllIllllllIlll, llllllllllllIllIIlIllIllllllIIII, Collections.emptySet());
    }
    
    private static int lIIllIIIllIIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIllIIIllIIlIIl(final int llllllllllllIllIIlIllIlIIlIIIIIl, final int llllllllllllIllIIlIllIlIIlIIIIII) {
        return llllllllllllIllIIlIllIlIIlIIIIIl < llllllllllllIllIIlIllIlIIlIIIIII;
    }
    
    private static int lIIllIIIllIIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lIIllIIIlIIllIll(final String llllllllllllIllIIlIllIlIIlllIlII, final String llllllllllllIllIIlIllIlIIlllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIllIlIIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIllIlIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIllIlIIllllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIllIlIIllllIII.init(NetHandlerPlayServer.llIlllIIIIIIII[4], llllllllllllIllIIlIllIlIIllllIIl);
            return new String(llllllllllllIllIIlIllIlIIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIllIlIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIllIlIIlllIlll) {
            llllllllllllIllIIlIllIlIIlllIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handleSpectate(final C18PacketSpectate llllllllllllIllIIlIllIlllIIlIlIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlllIIlIlIl, this, this.playerEntity.getServerForPlayer());
        if (lIIllIIIlIlllIIl(this.playerEntity.isSpectator() ? 1 : 0)) {
            Entity llllllllllllIllIIlIllIlllIIllIlI = null;
            final long llllllllllllIllIIlIllIlllIIlIIII;
            final boolean llllllllllllIllIIlIllIlllIIlIIIl = ((WorldServer[])(Object)(llllllllllllIllIIlIllIlllIIlIIII = (long)(Object)this.serverController.worldServers)).length != 0;
            int llllllllllllIllIIlIllIlIIlIIIlIl = NetHandlerPlayServer.llIlllIIIIIIII[1];
            "".length();
            if ((0x92 ^ 0x96) < ((0x15 ^ 0x3A) & ~(0x44 ^ 0x6B))) {
                return;
            }
            while (!lIIllIIIllIIIIll(llllllllllllIllIIlIllIlIIlIIIlIl, llllllllllllIllIIlIllIlllIIlIIIl ? 1 : 0)) {
                final WorldServer llllllllllllIllIIlIllIlllIIllIIl = llllllllllllIllIIlIllIlllIIlIIII[llllllllllllIllIIlIllIlIIlIIIlIl];
                if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlllIIllIIl)) {
                    llllllllllllIllIIlIllIlllIIllIlI = llllllllllllIllIIlIllIlllIIlIlIl.getEntity(llllllllllllIllIIlIllIlllIIllIIl);
                    if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlllIIllIlI)) {
                        "".length();
                        if ((0x45 ^ 0x40) <= 0) {
                            return;
                        }
                        break;
                    }
                }
                ++llllllllllllIllIIlIllIlIIlIIIlIl;
            }
            if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlllIIllIlI)) {
                this.playerEntity.setSpectatingEntity(this.playerEntity);
                this.playerEntity.mountEntity(null);
                if (lIIllIIIllIIIlIl(llllllllllllIllIIlIllIlllIIllIlI.worldObj, this.playerEntity.worldObj)) {
                    final WorldServer llllllllllllIllIIlIllIlllIIllIII = this.playerEntity.getServerForPlayer();
                    final WorldServer llllllllllllIllIIlIllIlllIIlIlll = (WorldServer)llllllllllllIllIIlIllIlllIIllIlI.worldObj;
                    this.playerEntity.dimension = llllllllllllIllIIlIllIlllIIllIlI.dimension;
                    this.sendPacket(new S07PacketRespawn(this.playerEntity.dimension, llllllllllllIllIIlIllIlllIIllIII.getDifficulty(), llllllllllllIllIIlIllIlllIIllIII.getWorldInfo().getTerrainType(), this.playerEntity.theItemInWorldManager.getGameType()));
                    llllllllllllIllIIlIllIlllIIllIII.removePlayerEntityDangerously(this.playerEntity);
                    this.playerEntity.isDead = (NetHandlerPlayServer.llIlllIIIIIIII[1] != 0);
                    this.playerEntity.setLocationAndAngles(llllllllllllIllIIlIllIlllIIllIlI.posX, llllllllllllIllIIlIllIlllIIllIlI.posY, llllllllllllIllIIlIllIlllIIllIlI.posZ, llllllllllllIllIIlIllIlllIIllIlI.rotationYaw, llllllllllllIllIIlIllIlllIIllIlI.rotationPitch);
                    if (lIIllIIIlIlllIIl(this.playerEntity.isEntityAlive() ? 1 : 0)) {
                        llllllllllllIllIIlIllIlllIIllIII.updateEntityWithOptionalForce(this.playerEntity, (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                        llllllllllllIllIIlIllIlllIIlIlll.spawnEntityInWorld(this.playerEntity);
                        "".length();
                        llllllllllllIllIIlIllIlllIIlIlll.updateEntityWithOptionalForce(this.playerEntity, (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                    }
                    this.playerEntity.setWorld(llllllllllllIllIIlIllIlllIIlIlll);
                    this.serverController.getConfigurationManager().preparePlayer(this.playerEntity, llllllllllllIllIIlIllIlllIIllIII);
                    this.playerEntity.setPositionAndUpdate(llllllllllllIllIIlIllIlllIIllIlI.posX, llllllllllllIllIIlIllIlllIIllIlI.posY, llllllllllllIllIIlIllIlllIIllIlI.posZ);
                    this.playerEntity.theItemInWorldManager.setWorld(llllllllllllIllIIlIllIlllIIlIlll);
                    this.serverController.getConfigurationManager().updateTimeAndWeatherForPlayer(this.playerEntity, llllllllllllIllIIlIllIlllIIlIlll);
                    this.serverController.getConfigurationManager().syncPlayerInventory(this.playerEntity);
                    "".length();
                    if (((0x70 ^ 0x62) & ~(0xD1 ^ 0xC3)) != 0x0) {
                        return;
                    }
                }
                else {
                    this.playerEntity.setPositionAndUpdate(llllllllllllIllIIlIllIlllIIllIlI.posX, llllllllllllIllIIlIllIlllIIllIlI.posY, llllllllllllIllIIlIllIlllIIllIlI.posZ);
                }
            }
        }
    }
    
    @Override
    public void update() {
        this.field_147366_g = (NetHandlerPlayServer.llIlllIIIIIIII[1] != 0);
        this.networkTickCount += NetHandlerPlayServer.llIlllIIIIIIII[0];
        this.serverController.theProfiler.startSection(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[1]]);
        if (lIIllIIIlIlllIII(lIIllIIIlIllIlll(this.networkTickCount - this.lastSentPingPacket, 40L))) {
            this.lastSentPingPacket = this.networkTickCount;
            this.lastPingTime = this.currentTimeMillis();
            this.field_147378_h = (int)this.lastPingTime;
            this.sendPacket(new S00PacketKeepAlive(this.field_147378_h));
        }
        this.serverController.theProfiler.endSection();
        if (lIIllIIIlIlllIII(this.chatSpamThresholdCount)) {
            this.chatSpamThresholdCount -= NetHandlerPlayServer.llIlllIIIIIIII[0];
        }
        if (lIIllIIIlIlllIII(this.itemDropThreshold)) {
            this.itemDropThreshold -= NetHandlerPlayServer.llIlllIIIIIIII[0];
        }
        if (lIIllIIIlIlllIII(lIIllIIIlIllIlll(this.playerEntity.getLastActiveTime(), 0L)) && lIIllIIIlIlllIII(this.serverController.getMaxPlayerIdleMinutes()) && lIIllIIIlIlllIII(lIIllIIIlIllIlll(MinecraftServer.getCurrentTimeMillis() - this.playerEntity.getLastActiveTime(), this.serverController.getMaxPlayerIdleMinutes() * NetHandlerPlayServer.llIlllIIIIIIII[2] * NetHandlerPlayServer.llIlllIIIIIIII[3]))) {
            this.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[0]]);
        }
    }
    
    private static boolean lIIllIIIllIIIIll(final int llllllllllllIllIIlIllIlIIlIIIlIl, final int llllllllllllIllIIlIllIlIIlIIIlII) {
        return llllllllllllIllIIlIllIlIIlIIIlIl >= llllllllllllIllIIlIllIlIIlIIIlII;
    }
    
    private static int lIIllIIIlIlllIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIllIIIlIlllIII(final int llllllllllllIllIIlIllIlIIIlIIIII) {
        return llllllllllllIllIIlIllIlIIIlIIIII > 0;
    }
    
    private static boolean lIIllIIIlIlllIIl(final int llllllllllllIllIIlIllIlIIIlIlIlI) {
        return llllllllllllIllIIlIllIlIIIlIlIlI != 0;
    }
    
    private static boolean lIIllIIIllIIlIII(final Object llllllllllllIllIIlIllIlIIIlIllII) {
        return llllllllllllIllIIlIllIlIIIlIllII == null;
    }
    
    @Override
    public void processPlayerAbilities(final C13PacketPlayerAbilities llllllllllllIllIIlIllIlIllIIlIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlIllIIlIII, this, this.playerEntity.getServerForPlayer());
        final PlayerCapabilities capabilities = this.playerEntity.capabilities;
        int isFlying;
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlIllIIlIII.isFlying() ? 1 : 0) && lIIllIIIlIlllIIl(this.playerEntity.capabilities.allowFlying ? 1 : 0)) {
            isFlying = NetHandlerPlayServer.llIlllIIIIIIII[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            isFlying = NetHandlerPlayServer.llIlllIIIIIIII[1];
        }
        capabilities.isFlying = (isFlying != 0);
    }
    
    @Override
    public void processChatMessage(final C01PacketChatMessage llllllllllllIllIIlIllIllIllIlIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIllIlIII, this, this.playerEntity.getServerForPlayer());
        if (lIIllIIIllIIIlII(this.playerEntity.getChatVisibility(), EntityPlayer.EnumChatVisibility.HIDDEN)) {
            final ChatComponentTranslation llllllllllllIllIIlIllIllIllIIlll = new ChatComponentTranslation(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[27]], new Object[NetHandlerPlayServer.llIlllIIIIIIII[1]]);
            llllllllllllIllIIlIllIllIllIIlll.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            this.sendPacket(new S02PacketChat(llllllllllllIllIIlIllIllIllIIlll));
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        else {
            this.playerEntity.markPlayerActive();
            String llllllllllllIllIIlIllIllIllIIllI = llllllllllllIllIIlIllIllIllIlIII.getMessage();
            llllllllllllIllIIlIllIllIllIIllI = StringUtils.normalizeSpace(llllllllllllIllIIlIllIllIllIIllI);
            int llllllllllllIllIIlIllIllIllIIlIl = NetHandlerPlayServer.llIlllIIIIIIII[1];
            "".length();
            if (-" ".length() >= " ".length()) {
                return;
            }
            while (!lIIllIIIllIIIIll(llllllllllllIllIIlIllIllIllIIlIl, llllllllllllIllIIlIllIllIllIIllI.length())) {
                if (lIIllIIIlIllllII(ChatAllowedCharacters.isAllowedCharacter(llllllllllllIllIIlIllIllIllIIllI.charAt(llllllllllllIllIIlIllIllIllIIlIl)) ? 1 : 0)) {
                    this.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[28]]);
                    return;
                }
                ++llllllllllllIllIIlIllIllIllIIlIl;
            }
            if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIllIllIIllI.startsWith(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[29]]) ? 1 : 0)) {
                this.handleSlashCommand(llllllllllllIllIIlIllIllIllIIllI);
                "".length();
                if (((0x6F ^ 0x62) & ~(0x3E ^ 0x33)) > "   ".length()) {
                    return;
                }
            }
            else {
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[30]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[NetHandlerPlayServer.llIlllIIIIIIII[4]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayServer.llIlllIIIIIIII[1]] = this.playerEntity.getDisplayName();
                lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayServer.llIlllIIIIIIII[0]] = llllllllllllIllIIlIllIllIllIIllI;
                final IChatComponent llllllllllllIllIIlIllIllIllIIlII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
                this.serverController.getConfigurationManager().sendChatMsgImpl(llllllllllllIllIIlIllIllIllIIlII, (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
            }
            this.chatSpamThresholdCount += NetHandlerPlayServer.llIlllIIIIIIII[17];
            if (lIIllIIIllIIIIIl(this.chatSpamThresholdCount, NetHandlerPlayServer.llIlllIIIIIIII[31]) && lIIllIIIlIllllII(this.serverController.getConfigurationManager().canSendCommands(this.playerEntity.getGameProfile()) ? 1 : 0)) {
                this.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[32]]);
            }
        }
    }
    
    private static boolean lIIllIIIllIIIIIl(final int llllllllllllIllIIlIllIlIIIlllIIl, final int llllllllllllIllIIlIllIlIIIlllIII) {
        return llllllllllllIllIIlIllIlIIIlllIIl > llllllllllllIllIIlIllIlIIIlllIII;
    }
    
    private boolean func_183006_b(final C03PacketPlayer llllllllllllIllIIlIlllIIIlIlIllI) {
        if (lIIllIIIlIlllIIl(Doubles.isFinite(llllllllllllIllIIlIlllIIIlIlIllI.getPositionX()) ? 1 : 0) && lIIllIIIlIlllIIl(Doubles.isFinite(llllllllllllIllIIlIlllIIIlIlIllI.getPositionY()) ? 1 : 0) && lIIllIIIlIlllIIl(Doubles.isFinite(llllllllllllIllIIlIlllIIIlIlIllI.getPositionZ()) ? 1 : 0) && lIIllIIIlIlllIIl(Floats.isFinite(llllllllllllIllIIlIlllIIIlIlIllI.getPitch()) ? 1 : 0) && lIIllIIIlIlllIIl(Floats.isFinite(llllllllllllIllIIlIlllIIIlIlIllI.getYaw()) ? 1 : 0)) {
            return NetHandlerPlayServer.llIlllIIIIIIII[1] != 0;
        }
        return NetHandlerPlayServer.llIlllIIIIIIII[0] != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$client$C16PacketClientStatus$EnumState() {
        final int[] $switch_TABLE$net$minecraft$network$play$client$C16PacketClientStatus$EnumState = NetHandlerPlayServer.$SWITCH_TABLE$net$minecraft$network$play$client$C16PacketClientStatus$EnumState;
        if (lIIllIIIlIlllllI($switch_TABLE$net$minecraft$network$play$client$C16PacketClientStatus$EnumState)) {
            return $switch_TABLE$net$minecraft$network$play$client$C16PacketClientStatus$EnumState;
        }
        "".length();
        final int llllllllllllIllIIlIllIlIIllllllI = (Object)new int[C16PacketClientStatus.EnumState.values().length];
        try {
            llllllllllllIllIIlIllIlIIllllllI[C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[5];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIIllllllI[C16PacketClientStatus.EnumState.PERFORM_RESPAWN.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[0];
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIIlIllIlIIllllllI[C16PacketClientStatus.EnumState.REQUEST_STATS.ordinal()] = NetHandlerPlayServer.llIlllIIIIIIII[4];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return NetHandlerPlayServer.$SWITCH_TABLE$net$minecraft$network$play$client$C16PacketClientStatus$EnumState = (int[])(Object)llllllllllllIllIIlIllIlIIllllllI;
    }
    
    private long currentTimeMillis() {
        return System.nanoTime() / 1000000L;
    }
    
    @Override
    public void processEnchantItem(final C11PacketEnchantItem llllllllllllIllIIlIllIllIIIlIIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIIIlIIll, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.markPlayerActive();
        if (lIIllIIIllIIIlll(this.playerEntity.openContainer.windowId, llllllllllllIllIIlIllIllIIIlIIll.getWindowId()) && lIIllIIIlIlllIIl(this.playerEntity.openContainer.getCanCraft(this.playerEntity) ? 1 : 0) && lIIllIIIlIllllII(this.playerEntity.isSpectator() ? 1 : 0)) {
            this.playerEntity.openContainer.enchantItem(this.playerEntity, llllllllllllIllIIlIllIllIIIlIIll.getButton());
            "".length();
            this.playerEntity.openContainer.detectAndSendChanges();
        }
    }
    
    private static String lIIllIIIlIIllIlI(String llllllllllllIllIIlIllIlIIlIlIlII, final String llllllllllllIllIIlIllIlIIlIlIIll) {
        llllllllllllIllIIlIllIlIIlIlIlII = new String(Base64.getDecoder().decode(llllllllllllIllIIlIllIlIIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIllIlIIlIlIlll = new StringBuilder();
        final char[] llllllllllllIllIIlIllIlIIlIlIllI = llllllllllllIllIIlIllIlIIlIlIIll.toCharArray();
        int llllllllllllIllIIlIllIlIIlIlIlIl = NetHandlerPlayServer.llIlllIIIIIIII[1];
        final double llllllllllllIllIIlIllIlIIlIIllll = (Object)llllllllllllIllIIlIllIlIIlIlIlII.toCharArray();
        final byte llllllllllllIllIIlIllIlIIlIIlllI = (byte)llllllllllllIllIIlIllIlIIlIIllll.length;
        double llllllllllllIllIIlIllIlIIlIIllIl = NetHandlerPlayServer.llIlllIIIIIIII[1];
        while (lIIllIIIllIIlIIl((int)llllllllllllIllIIlIllIlIIlIIllIl, llllllllllllIllIIlIllIlIIlIIlllI)) {
            final char llllllllllllIllIIlIllIlIIlIllIlI = llllllllllllIllIIlIllIlIIlIIllll[llllllllllllIllIIlIllIlIIlIIllIl];
            llllllllllllIllIIlIllIlIIlIlIlll.append((char)(llllllllllllIllIIlIllIlIIlIllIlI ^ llllllllllllIllIIlIllIlIIlIlIllI[llllllllllllIllIIlIllIlIIlIlIlIl % llllllllllllIllIIlIllIlIIlIlIllI.length]));
            "".length();
            ++llllllllllllIllIIlIllIlIIlIlIlIl;
            ++llllllllllllIllIIlIllIlIIlIIllIl;
            "".length();
            if (((101 + 89 - 8 + 18 ^ 82 + 108 - 181 + 189) & (0x6C ^ 0x54 ^ (0xB5 ^ 0x83) ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIllIlIIlIlIlll);
    }
    
    private static boolean lIIllIIIlIlllllI(final Object llllllllllllIllIIlIllIlIIIllIIlI) {
        return llllllllllllIllIIlIllIlIIIllIIlI != null;
    }
    
    private static int lIIllIIIllIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIllIIIlIllllII(final int llllllllllllIllIIlIllIlIIIlIlIII) {
        return llllllllllllIllIIlIllIlIIIlIlIII == 0;
    }
    
    @Override
    public void processUseEntity(final C02PacketUseEntity llllllllllllIllIIlIllIllIlIIIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIlIIIIII, this, this.playerEntity.getServerForPlayer());
        final WorldServer llllllllllllIllIIlIllIllIlIIIlIl = this.serverController.worldServerForDimension(this.playerEntity.dimension);
        final Entity llllllllllllIllIIlIllIllIlIIIlII = llllllllllllIllIIlIllIllIlIIIIII.getEntityFromWorld(llllllllllllIllIIlIllIllIlIIIlIl);
        this.playerEntity.markPlayerActive();
        if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIllIlIIIlII)) {
            final boolean llllllllllllIllIIlIllIllIlIIIIll = this.playerEntity.canEntityBeSeen(llllllllllllIllIIlIllIllIlIIIlII);
            double llllllllllllIllIIlIllIllIlIIIIlI = 36.0;
            if (lIIllIIIlIllllII(llllllllllllIllIIlIllIllIlIIIIll ? 1 : 0)) {
                llllllllllllIllIIlIllIllIlIIIIlI = 9.0;
            }
            if (lIIllIIIlIllllIl(lIIllIIIllIIlIlI(this.playerEntity.getDistanceSqToEntity(llllllllllllIllIIlIllIllIlIIIlII), llllllllllllIllIIlIllIllIlIIIIlI))) {
                if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllIlIIIIII.getAction(), C02PacketUseEntity.Action.INTERACT)) {
                    this.playerEntity.interactWith(llllllllllllIllIIlIllIllIlIIIlII);
                    "".length();
                    "".length();
                    if ((0xBD ^ 0xB3 ^ (0x58 ^ 0x52)) == ((132 + 42 - 91 + 117 ^ 155 + 90 - 88 + 14) & (146 + 79 - 204 + 173 ^ 32 + 5 + 82 + 42 ^ -" ".length()))) {
                        return;
                    }
                }
                else if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllIlIIIIII.getAction(), C02PacketUseEntity.Action.INTERACT_AT)) {
                    llllllllllllIllIIlIllIllIlIIIlII.interactAt(this.playerEntity, llllllllllllIllIIlIllIllIlIIIIII.getHitVec());
                    "".length();
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                else if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIllIlIIIIII.getAction(), C02PacketUseEntity.Action.ATTACK)) {
                    if (!lIIllIIIlIllllII((llllllllllllIllIIlIllIllIlIIIlII instanceof EntityItem) ? 1 : 0) || !lIIllIIIlIllllII((llllllllllllIllIIlIllIllIlIIIlII instanceof EntityXPOrb) ? 1 : 0) || !lIIllIIIlIllllII((llllllllllllIllIIlIllIllIlIIIlII instanceof EntityArrow) ? 1 : 0) || lIIllIIIllIIIlII(llllllllllllIllIIlIllIllIlIIIlII, this.playerEntity)) {
                        this.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[34]]);
                        this.serverController.logWarning(String.valueOf(new StringBuilder(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[35]]).append(this.playerEntity.getName()).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[36]])));
                        return;
                    }
                    this.playerEntity.attackTargetEntityWithCurrentItem(llllllllllllIllIIlIllIllIlIIIlII);
                }
            }
        }
    }
    
    @Override
    public void processTabComplete(final C14PacketTabComplete llllllllllllIllIIlIllIlIlIllllll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlIlIllllll, this, this.playerEntity.getServerForPlayer());
        final List<String> llllllllllllIllIIlIllIlIlIlllllI = (List<String>)Lists.newArrayList();
        final double llllllllllllIllIIlIllIlIlIlllIII = (double)this.serverController.getTabCompletions(this.playerEntity, llllllllllllIllIIlIllIlIlIllllll.getMessage(), llllllllllllIllIIlIllIlIlIllllll.getTargetBlock()).iterator();
        "".length();
        if ((47 + 149 - 14 + 10 ^ 188 + 192 - 271 + 87) <= "   ".length()) {
            return;
        }
        while (!lIIllIIIlIllllII(((Iterator)llllllllllllIllIIlIllIlIlIlllIII).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIIlIllIlIlIllllIl = ((Iterator<String>)llllllllllllIllIIlIllIlIlIlllIII).next();
            llllllllllllIllIIlIllIlIlIlllllI.add(llllllllllllIllIIlIllIlIlIllllIl);
            "".length();
        }
        this.playerEntity.playerNetServerHandler.sendPacket(new S3APacketTabComplete(llllllllllllIllIIlIllIlIlIlllllI.toArray(new String[llllllllllllIllIIlIllIlIlIlllllI.size()])));
    }
    
    @Override
    public void onDisconnect(final IChatComponent llllllllllllIllIIlIllIlllIIIIllI) {
        NetHandlerPlayServer.logger.info(String.valueOf(new StringBuilder(String.valueOf(this.playerEntity.getName())).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[21]]).append(llllllllllllIllIIlIllIlllIIIIllI)));
        this.serverController.refreshStatusNextTick();
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[22]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[NetHandlerPlayServer.llIlllIIIIIIII[0]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayServer.llIlllIIIIIIII[1]] = this.playerEntity.getDisplayName();
        final ChatComponentTranslation llllllllllllIllIIlIllIlllIIIlIII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        llllllllllllIllIIlIllIlllIIIlIII.getChatStyle().setColor(EnumChatFormatting.YELLOW);
        "".length();
        this.serverController.getConfigurationManager().sendChatMsg(llllllllllllIllIIlIllIlllIIIlIII);
        this.playerEntity.mountEntityAndWakeUp();
        this.serverController.getConfigurationManager().playerLoggedOut(this.playerEntity);
        if (lIIllIIIlIlllIIl(this.serverController.isSinglePlayer() ? 1 : 0) && lIIllIIIlIlllIIl(this.playerEntity.getName().equals(this.serverController.getServerOwner()) ? 1 : 0)) {
            NetHandlerPlayServer.logger.info(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[23]]);
            this.serverController.initiateShutdown();
        }
    }
    
    private static boolean lIIllIIIlIllllIl(final int llllllllllllIllIIlIllIlIIIlIIlII) {
        return llllllllllllIllIIlIllIlIIIlIIlII < 0;
    }
    
    private static int lIIllIIIlIlllIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void processClientStatus(final C16PacketClientStatus llllllllllllIllIIlIllIllIIllIllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIIllIllI, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.markPlayerActive();
        final C16PacketClientStatus.EnumState llllllllllllIllIIlIllIllIIllIlIl = llllllllllllIllIIlIllIllIIllIllI.getStatus();
        switch ($SWITCH_TABLE$net$minecraft$network$play$client$C16PacketClientStatus$EnumState()[llllllllllllIllIIlIllIllIIllIlIl.ordinal()]) {
            case 1: {
                if (lIIllIIIlIlllIIl(this.playerEntity.playerConqueredTheEnd ? 1 : 0)) {
                    this.playerEntity = this.serverController.getConfigurationManager().recreatePlayerEntity(this.playerEntity, NetHandlerPlayServer.llIlllIIIIIIII[1], (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
                    "".length();
                    if (((0xF5 ^ 0xA6 ^ (0x78 ^ 0xB)) & (0x13 ^ 0x6E ^ (0x9C ^ 0xC1) ^ -" ".length())) != 0x0) {
                        return;
                    }
                    break;
                }
                else if (lIIllIIIlIlllIIl(this.playerEntity.getServerForPlayer().getWorldInfo().isHardcoreModeEnabled() ? 1 : 0)) {
                    if (lIIllIIIlIlllIIl(this.serverController.isSinglePlayer() ? 1 : 0) && lIIllIIIlIlllIIl(this.playerEntity.getName().equals(this.serverController.getServerOwner()) ? 1 : 0)) {
                        this.playerEntity.playerNetServerHandler.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[37]]);
                        this.serverController.deleteWorldAndStopServer();
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        final UserListBansEntry llllllllllllIllIIlIllIllIIllIlII = new UserListBansEntry(this.playerEntity.getGameProfile(), null, NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[38]], null, NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[39]]);
                        ((UserList<K, UserListBansEntry>)this.serverController.getConfigurationManager().getBannedPlayers()).addEntry(llllllllllllIllIIlIllIllIIllIlII);
                        this.playerEntity.playerNetServerHandler.kickPlayerFromServer(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[40]]);
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                        break;
                    }
                }
                else {
                    if (lIIllIIIlIlllIII(lIIllIIIllIIlIll(this.playerEntity.getHealth(), 0.0f))) {
                        return;
                    }
                    this.playerEntity = this.serverController.getConfigurationManager().recreatePlayerEntity(this.playerEntity, NetHandlerPlayServer.llIlllIIIIIIII[1], (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                    "".length();
                    if ("   ".length() <= ((0xF ^ 0x74 ^ 110 + 43 - 69 + 43) & (0x6 ^ 0x66 ^ (0xDE ^ 0xBA) ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                break;
            }
            case 2: {
                this.playerEntity.getStatFile().func_150876_a(this.playerEntity);
                "".length();
                if ((0x60 ^ 0x64) <= -" ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                this.playerEntity.triggerAchievement(AchievementList.openInventory);
                break;
            }
        }
    }
    
    private void handleSlashCommand(final String llllllllllllIllIIlIllIllIlIlllII) {
        this.serverController.getCommandManager().executeCommand(this.playerEntity, llllllllllllIllIIlIllIllIlIlllII);
        "".length();
    }
    
    @Override
    public void processHeldItemChange(final C09PacketHeldItemChange llllllllllllIllIIlIllIllIllIlllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIllIlllI, this, this.playerEntity.getServerForPlayer());
        if (lIIllIIIllIIIIII(llllllllllllIllIIlIllIllIllIlllI.getSlotId()) && lIIllIIIllIIlIIl(llllllllllllIllIIlIllIllIllIlllI.getSlotId(), InventoryPlayer.getHotbarSize())) {
            this.playerEntity.inventory.currentItem = llllllllllllIllIIlIllIllIllIlllI.getSlotId();
            this.playerEntity.markPlayerActive();
            "".length();
            if (" ".length() < ((0x23 ^ 0x1D) & ~(0x7B ^ 0x45))) {
                return;
            }
        }
        else {
            NetHandlerPlayServer.logger.warn(String.valueOf(new StringBuilder(String.valueOf(this.playerEntity.getName())).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[26]])));
        }
    }
    
    @Override
    public void processKeepAlive(final C00PacketKeepAlive llllllllllllIllIIlIllIlIllIlIIIl) {
        if (lIIllIIIllIIIlll(llllllllllllIllIIlIllIlIllIlIIIl.getKey(), this.field_147378_h)) {
            final int llllllllllllIllIIlIllIlIllIlIIII = (int)(this.currentTimeMillis() - this.lastPingTime);
            this.playerEntity.ping = (this.playerEntity.ping * NetHandlerPlayServer.llIlllIIIIIIII[5] + llllllllllllIllIIlIllIlIllIlIIII) / NetHandlerPlayServer.llIlllIIIIIIII[6];
        }
    }
    
    @Override
    public void processClientSettings(final C15PacketClientSettings llllllllllllIllIIlIllIlIlIllIlII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlIlIllIlII, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.handleClientSettings(llllllllllllIllIIlIllIlIlIllIlII);
    }
    
    private static boolean lIIllIIIllIIIlII(final Object llllllllllllIllIIlIllIlIIIlIllll, final Object llllllllllllIllIIlIllIlIIIlIlllI) {
        return llllllllllllIllIIlIllIlIIIlIllll == llllllllllllIllIIlIllIlIIIlIlllI;
    }
    
    public NetworkManager getNetworkManager() {
        return this.netManager;
    }
    
    private static int lIIllIIIllIIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void processVanilla250Packet(final C17PacketCustomPayload llllllllllllIllIIlIllIlIlIlIlIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlIlIlIlIII, this, this.playerEntity.getServerForPlayer());
        if (lIIllIIIlIlllIIl(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[56]].equals(llllllllllllIllIIlIllIlIlIlIlIII.getChannelName()) ? 1 : 0)) {
            final PacketBuffer llllllllllllIllIIlIllIlIlIlIIlll = new PacketBuffer(Unpooled.wrappedBuffer(llllllllllllIllIIlIllIlIlIlIlIII.getBufferData()));
            try {
                final ItemStack llllllllllllIllIIlIllIlIlIlIIllI = llllllllllllIllIIlIllIlIlIlIIlll.readItemStackFromBuffer();
                if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlIlIlIIllI)) {
                    if (lIIllIIIlIllllII(ItemWritableBook.isNBTValid(llllllllllllIllIIlIllIlIlIlIIllI.getTagCompound()) ? 1 : 0)) {
                        throw new IOException(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[57]]);
                    }
                    final ItemStack llllllllllllIllIIlIllIlIlIlIIlIl = this.playerEntity.inventory.getCurrentItem();
                    if (lIIllIIIllIIlIII(llllllllllllIllIIlIllIlIlIlIIlIl)) {
                        return;
                    }
                    if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIlIlIlIIllI.getItem(), Items.writable_book) && lIIllIIIllIIIlII(llllllllllllIllIIlIllIlIlIlIIllI.getItem(), llllllllllllIllIIlIllIlIlIlIIlIl.getItem())) {
                        llllllllllllIllIIlIllIlIlIlIIlIl.setTagInfo(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[58]], llllllllllllIllIIlIllIlIlIlIIllI.getTagCompound().getTagList(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[59]], NetHandlerPlayServer.llIlllIIIIIIII[10]));
                    }
                    return;
                }
            }
            catch (Exception llllllllllllIllIIlIllIlIlIlIIlII) {
                NetHandlerPlayServer.logger.error(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[60]], (Throwable)llllllllllllIllIIlIllIlIlIlIIlII);
                return;
            }
            finally {
                llllllllllllIllIIlIllIlIlIlIIlll.release();
                "".length();
            }
            llllllllllllIllIIlIllIlIlIlIIlll.release();
            "".length();
            return;
        }
        if (lIIllIIIlIlllIIl(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[61]].equals(llllllllllllIllIIlIllIlIlIlIlIII.getChannelName()) ? 1 : 0)) {
            final PacketBuffer llllllllllllIllIIlIllIlIlIlIIIll = new PacketBuffer(Unpooled.wrappedBuffer(llllllllllllIllIIlIllIlIlIlIlIII.getBufferData()));
            try {
                final ItemStack llllllllllllIllIIlIllIlIlIlIIIlI = llllllllllllIllIIlIllIlIlIlIIIll.readItemStackFromBuffer();
                if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlIlIlIIIlI)) {
                    if (lIIllIIIlIllllII(ItemEditableBook.validBookTagContents(llllllllllllIllIIlIllIlIlIlIIIlI.getTagCompound()) ? 1 : 0)) {
                        throw new IOException(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[62]]);
                    }
                    final ItemStack llllllllllllIllIIlIllIlIlIlIIIIl = this.playerEntity.inventory.getCurrentItem();
                    if (lIIllIIIllIIlIII(llllllllllllIllIIlIllIlIlIlIIIIl)) {
                        return;
                    }
                    if (lIIllIIIllIIIlII(llllllllllllIllIIlIllIlIlIlIIIlI.getItem(), Items.written_book) && lIIllIIIllIIIlII(llllllllllllIllIIlIllIlIlIlIIIIl.getItem(), Items.writable_book)) {
                        llllllllllllIllIIlIllIlIlIlIIIIl.setTagInfo(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[63]], new NBTTagString(this.playerEntity.getName()));
                        llllllllllllIllIIlIllIlIlIlIIIIl.setTagInfo(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[64]], new NBTTagString(llllllllllllIllIIlIllIlIlIlIIIlI.getTagCompound().getString(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[65]])));
                        llllllllllllIllIIlIllIlIlIlIIIIl.setTagInfo(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[3]], llllllllllllIllIIlIllIlIlIlIIIlI.getTagCompound().getTagList(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[66]], NetHandlerPlayServer.llIlllIIIIIIII[10]));
                        llllllllllllIllIIlIllIlIlIlIIIIl.setItem(Items.written_book);
                    }
                    return;
                }
            }
            catch (Exception llllllllllllIllIIlIllIlIlIlIIIII) {
                NetHandlerPlayServer.logger.error(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[67]], (Throwable)llllllllllllIllIIlIllIlIlIlIIIII);
                return;
            }
            finally {
                llllllllllllIllIIlIllIlIlIlIIIll.release();
                "".length();
            }
            llllllllllllIllIIlIllIlIlIlIIIll.release();
            "".length();
            return;
        }
        if (lIIllIIIlIlllIIl(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[68]].equals(llllllllllllIllIIlIllIlIlIlIlIII.getChannelName()) ? 1 : 0)) {
            try {
                final int llllllllllllIllIIlIllIlIlIIlllll = llllllllllllIllIIlIllIlIlIlIlIII.getBufferData().readInt();
                final Container llllllllllllIllIIlIllIlIlIIllllI = this.playerEntity.openContainer;
                if (!lIIllIIIlIlllIIl((llllllllllllIllIIlIllIlIlIIllllI instanceof ContainerMerchant) ? 1 : 0)) {
                    return;
                }
                ((ContainerMerchant)llllllllllllIllIIlIllIlIlIIllllI).setCurrentRecipeIndex(llllllllllllIllIIlIllIlIlIIlllll);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
                return;
            }
            catch (Exception llllllllllllIllIIlIllIlIlIIlllIl) {
                NetHandlerPlayServer.logger.error(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[53]], (Throwable)llllllllllllIllIIlIllIlIlIIlllIl);
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
                return;
            }
        }
        if (lIIllIIIlIlllIIl(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[69]].equals(llllllllllllIllIIlIllIlIlIlIlIII.getChannelName()) ? 1 : 0)) {
            if (lIIllIIIlIllllII(this.serverController.isCommandBlockEnabled() ? 1 : 0)) {
                this.playerEntity.addChatMessage(new ChatComponentTranslation(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[70]], new Object[NetHandlerPlayServer.llIlllIIIIIIII[1]]));
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else if (lIIllIIIlIlllIIl(this.playerEntity.canCommandSenderUseCommand(NetHandlerPlayServer.llIlllIIIIIIII[4], NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[71]]) ? 1 : 0) && lIIllIIIlIlllIIl(this.playerEntity.capabilities.isCreativeMode ? 1 : 0)) {
                final PacketBuffer llllllllllllIllIIlIllIlIlIIlllII = llllllllllllIllIIlIllIlIlIlIlIII.getBufferData();
                try {
                    final int llllllllllllIllIIlIllIlIlIIllIll = llllllllllllIllIIlIllIlIlIIlllII.readByte();
                    CommandBlockLogic llllllllllllIllIIlIllIlIlIIllIlI = null;
                    if (lIIllIIIlIllllII(llllllllllllIllIIlIllIlIlIIllIll)) {
                        final TileEntity llllllllllllIllIIlIllIlIlIIllIIl = this.playerEntity.worldObj.getTileEntity(new BlockPos(llllllllllllIllIIlIllIlIlIIlllII.readInt(), llllllllllllIllIIlIllIlIlIIlllII.readInt(), llllllllllllIllIIlIllIlIlIIlllII.readInt()));
                        if (lIIllIIIlIlllIIl((llllllllllllIllIIlIllIlIlIIllIIl instanceof TileEntityCommandBlock) ? 1 : 0)) {
                            llllllllllllIllIIlIllIlIlIIllIlI = ((TileEntityCommandBlock)llllllllllllIllIIlIllIlIlIIllIIl).getCommandBlockLogic();
                            "".length();
                            if (-" ".length() > "   ".length()) {
                                return;
                            }
                        }
                    }
                    else if (lIIllIIIllIIIlll(llllllllllllIllIIlIllIlIlIIllIll, NetHandlerPlayServer.llIlllIIIIIIII[0])) {
                        final Entity llllllllllllIllIIlIllIlIlIIllIII = this.playerEntity.worldObj.getEntityByID(llllllllllllIllIIlIllIlIlIIlllII.readInt());
                        if (lIIllIIIlIlllIIl((llllllllllllIllIIlIllIlIlIIllIII instanceof EntityMinecartCommandBlock) ? 1 : 0)) {
                            llllllllllllIllIIlIllIlIlIIllIlI = ((EntityMinecartCommandBlock)llllllllllllIllIIlIllIlIlIIllIII).getCommandBlockLogic();
                        }
                    }
                    final String llllllllllllIllIIlIllIlIlIIlIlll = llllllllllllIllIIlIllIlIlIIlllII.readStringFromBuffer(llllllllllllIllIIlIllIlIlIIlllII.readableBytes());
                    final boolean llllllllllllIllIIlIllIlIlIIlIllI = llllllllllllIllIIlIllIlIlIIlllII.readBoolean();
                    if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlIlIIllIlI)) {
                        llllllllllllIllIIlIllIlIlIIllIlI.setCommand(llllllllllllIllIIlIllIlIlIIlIlll);
                        llllllllllllIllIIlIllIlIlIIllIlI.setTrackOutput(llllllllllllIllIIlIllIlIlIIlIllI);
                        if (lIIllIIIlIllllII(llllllllllllIllIIlIllIlIlIIlIllI ? 1 : 0)) {
                            llllllllllllIllIIlIllIlIlIIllIlI.setLastOutput(null);
                        }
                        llllllllllllIllIIlIllIlIlIIllIlI.updateCommand();
                        final EntityPlayerMP playerEntity = this.playerEntity;
                        final String lllllllllllllIlIIlIlllIIlIIIIIlI = NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[72]];
                        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[NetHandlerPlayServer.llIlllIIIIIIII[0]];
                        lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayServer.llIlllIIIIIIII[1]] = llllllllllllIllIIlIllIlIlIIlIlll;
                        playerEntity.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return;
                        }
                    }
                }
                catch (Exception llllllllllllIllIIlIllIlIlIIlIlIl) {
                    NetHandlerPlayServer.logger.error(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[73]], (Throwable)llllllllllllIllIIlIllIlIlIIlIlIl);
                    llllllllllllIllIIlIllIlIlIIlllII.release();
                    "".length();
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    return;
                }
                finally {
                    llllllllllllIllIIlIllIlIlIIlllII.release();
                    "".length();
                }
                llllllllllllIllIIlIllIlIlIIlllII.release();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.playerEntity.addChatMessage(new ChatComponentTranslation(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[74]], new Object[NetHandlerPlayServer.llIlllIIIIIIII[1]]));
                "".length();
                if ((145 + 171 - 269 + 126 ^ 4 + 117 - 117 + 165) <= 0) {
                    return;
                }
            }
        }
        else {
            if (lIIllIIIlIlllIIl(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[75]].equals(llllllllllllIllIIlIllIlIlIlIlIII.getChannelName()) ? 1 : 0)) {
                if (!lIIllIIIlIlllIIl((this.playerEntity.openContainer instanceof ContainerBeacon) ? 1 : 0)) {
                    return;
                }
                try {
                    final PacketBuffer llllllllllllIllIIlIllIlIlIIlIlII = llllllllllllIllIIlIllIlIlIlIlIII.getBufferData();
                    final int llllllllllllIllIIlIllIlIlIIlIIll = llllllllllllIllIIlIllIlIlIIlIlII.readInt();
                    final int llllllllllllIllIIlIllIlIlIIlIIlI = llllllllllllIllIIlIllIlIlIIlIlII.readInt();
                    final ContainerBeacon llllllllllllIllIIlIllIlIlIIlIIIl = (ContainerBeacon)this.playerEntity.openContainer;
                    final Slot llllllllllllIllIIlIllIlIlIIlIIII = llllllllllllIllIIlIllIlIlIIlIIIl.getSlot(NetHandlerPlayServer.llIlllIIIIIIII[1]);
                    if (!lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlIlIIlIIII.getHasStack() ? 1 : 0)) {
                        return;
                    }
                    llllllllllllIllIIlIllIlIlIIlIIII.decrStackSize(NetHandlerPlayServer.llIlllIIIIIIII[0]);
                    "".length();
                    final IInventory llllllllllllIllIIlIllIlIlIIIllll = llllllllllllIllIIlIllIlIlIIlIIIl.func_180611_e();
                    llllllllllllIllIIlIllIlIlIIIllll.setField(NetHandlerPlayServer.llIlllIIIIIIII[0], llllllllllllIllIIlIllIlIlIIlIIll);
                    llllllllllllIllIIlIllIlIlIIIllll.setField(NetHandlerPlayServer.llIlllIIIIIIII[4], llllllllllllIllIIlIllIlIlIIlIIlI);
                    llllllllllllIllIIlIllIlIlIIIllll.markDirty();
                    "".length();
                    if (-(0x47 ^ 0x21 ^ (0x51 ^ 0x33)) >= 0) {
                        return;
                    }
                    return;
                }
                catch (Exception llllllllllllIllIIlIllIlIlIIIlllI) {
                    NetHandlerPlayServer.logger.error(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[76]], (Throwable)llllllllllllIllIIlIllIlIlIIIlllI);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    return;
                }
            }
            if (lIIllIIIlIlllIIl(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[77]].equals(llllllllllllIllIIlIllIlIlIlIlIII.getChannelName()) ? 1 : 0) && lIIllIIIlIlllIIl((this.playerEntity.openContainer instanceof ContainerRepair) ? 1 : 0)) {
                final ContainerRepair llllllllllllIllIIlIllIlIlIIIllIl = (ContainerRepair)this.playerEntity.openContainer;
                if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlIlIlIlIII.getBufferData()) && lIIllIIIllIIIIll(llllllllllllIllIIlIllIlIlIlIlIII.getBufferData().readableBytes(), NetHandlerPlayServer.llIlllIIIIIIII[0])) {
                    final String llllllllllllIllIIlIllIlIlIIIllII = ChatAllowedCharacters.filterAllowedCharacters(llllllllllllIllIIlIllIlIlIlIlIII.getBufferData().readStringFromBuffer(NetHandlerPlayServer.llIlllIIIIIIII[78]));
                    if (lIIllIIIllIIlllI(llllllllllllIllIIlIllIlIlIIIllII.length(), NetHandlerPlayServer.llIlllIIIIIIII[35])) {
                        llllllllllllIllIIlIllIlIlIIIllIl.updateItemName(llllllllllllIllIIlIllIlIlIIIllII);
                        "".length();
                        if (((0x6D ^ 0x24 ^ (0x36 ^ 0x4F)) & (0x64 ^ 0x51 ^ (0x12 ^ 0x17) ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                }
                else {
                    llllllllllllIllIIlIllIlIlIIIllIl.updateItemName(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[79]]);
                }
            }
        }
    }
    
    static {
        lIIllIIIlIllIllI();
        lIIllIIIlIllIlIl();
        logger = LogManager.getLogger();
    }
    
    public void setPlayerLocation(final double llllllllllllIllIIlIllIlllllIIlIl, final double llllllllllllIllIIlIllIllllIllIll, final double llllllllllllIllIIlIllIlllllIIIll, final float llllllllllllIllIIlIllIllllIllIIl, final float llllllllllllIllIIlIllIlllllIIIIl, final Set<S08PacketPlayerPosLook.EnumFlags> llllllllllllIllIIlIllIlllllIIIII) {
        this.hasMoved = (NetHandlerPlayServer.llIlllIIIIIIII[1] != 0);
        this.lastPosX = llllllllllllIllIIlIllIlllllIIlIl;
        this.lastPosY = llllllllllllIllIIlIllIllllIllIll;
        this.lastPosZ = llllllllllllIllIIlIllIlllllIIIll;
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlllllIIIII.contains(S08PacketPlayerPosLook.EnumFlags.X) ? 1 : 0)) {
            this.lastPosX += this.playerEntity.posX;
        }
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlllllIIIII.contains(S08PacketPlayerPosLook.EnumFlags.Y) ? 1 : 0)) {
            this.lastPosY += this.playerEntity.posY;
        }
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlllllIIIII.contains(S08PacketPlayerPosLook.EnumFlags.Z) ? 1 : 0)) {
            this.lastPosZ += this.playerEntity.posZ;
        }
        float llllllllllllIllIIlIllIllllIlllll = llllllllllllIllIIlIllIllllIllIIl;
        float llllllllllllIllIIlIllIllllIllllI = llllllllllllIllIIlIllIlllllIIIIl;
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlllllIIIII.contains(S08PacketPlayerPosLook.EnumFlags.Y_ROT) ? 1 : 0)) {
            llllllllllllIllIIlIllIllllIlllll = llllllllllllIllIIlIllIllllIllIIl + this.playerEntity.rotationYaw;
        }
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlllllIIIII.contains(S08PacketPlayerPosLook.EnumFlags.X_ROT) ? 1 : 0)) {
            llllllllllllIllIIlIllIllllIllllI = llllllllllllIllIIlIllIlllllIIIIl + this.playerEntity.rotationPitch;
        }
        this.playerEntity.setPositionAndRotation(this.lastPosX, this.lastPosY, this.lastPosZ, llllllllllllIllIIlIllIllllIlllll, llllllllllllIllIIlIllIllllIllllI);
        this.playerEntity.playerNetServerHandler.sendPacket(new S08PacketPlayerPosLook(llllllllllllIllIIlIllIlllllIIlIl, llllllllllllIllIIlIllIllllIllIll, llllllllllllIllIIlIllIlllllIIIll, llllllllllllIllIIlIllIllllIllIIl, llllllllllllIllIIlIllIlllllIIIIl, llllllllllllIllIIlIllIlllllIIIII));
    }
    
    private static boolean lIIllIIIllIIlllI(final int llllllllllllIllIIlIllIlIIIllllIl, final int llllllllllllIllIIlIllIlIIIllllII) {
        return llllllllllllIllIIlIllIlIIIllllIl <= llllllllllllIllIIlIllIlIIIllllII;
    }
    
    @Override
    public void processConfirmTransaction(final C0FPacketConfirmTransaction llllllllllllIllIIlIllIlIllllIIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlIllllIIlI, this, this.playerEntity.getServerForPlayer());
        final Short llllllllllllIllIIlIllIlIllllIIIl = this.field_147372_n.lookup(this.playerEntity.openContainer.windowId);
        if (lIIllIIIlIlllllI(llllllllllllIllIIlIllIlIllllIIIl) && lIIllIIIllIIIlll(llllllllllllIllIIlIllIlIllllIIlI.getUid(), llllllllllllIllIIlIllIlIllllIIIl) && lIIllIIIllIIIlll(this.playerEntity.openContainer.windowId, llllllllllllIllIIlIllIlIllllIIlI.getWindowId()) && lIIllIIIlIllllII(this.playerEntity.openContainer.getCanCraft(this.playerEntity) ? 1 : 0) && lIIllIIIlIllllII(this.playerEntity.isSpectator() ? 1 : 0)) {
            this.playerEntity.openContainer.setCanCraft(this.playerEntity, (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
        }
    }
    
    @Override
    public void processUpdateSign(final C12PacketUpdateSign llllllllllllIllIIlIllIlIllIlllII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIlIllIlllII, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.markPlayerActive();
        final WorldServer llllllllllllIllIIlIllIlIlllIIIll = this.serverController.worldServerForDimension(this.playerEntity.dimension);
        final BlockPos llllllllllllIllIIlIllIlIlllIIIlI = llllllllllllIllIIlIllIlIllIlllII.getPosition();
        if (lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlIlllIIIll.isBlockLoaded(llllllllllllIllIIlIllIlIlllIIIlI) ? 1 : 0)) {
            final TileEntity llllllllllllIllIIlIllIlIlllIIIIl = llllllllllllIllIIlIllIlIlllIIIll.getTileEntity(llllllllllllIllIIlIllIlIlllIIIlI);
            if (lIIllIIIlIllllII((llllllllllllIllIIlIllIlIlllIIIIl instanceof TileEntitySign) ? 1 : 0)) {
                return;
            }
            final TileEntitySign llllllllllllIllIIlIllIlIlllIIIII = (TileEntitySign)llllllllllllIllIIlIllIlIlllIIIIl;
            if (!lIIllIIIlIlllIIl(llllllllllllIllIIlIllIlIlllIIIII.getIsEditable() ? 1 : 0) || lIIllIIIllIIIlIl(llllllllllllIllIIlIllIlIlllIIIII.getPlayer(), this.playerEntity)) {
                this.serverController.logWarning(String.valueOf(new StringBuilder(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[54]]).append(this.playerEntity.getName()).append(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[55]])));
                return;
            }
            final IChatComponent[] llllllllllllIllIIlIllIlIllIlllll = llllllllllllIllIIlIllIlIllIlllII.getLines();
            int llllllllllllIllIIlIllIlIllIllllI = NetHandlerPlayServer.llIlllIIIIIIII[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIllIIIllIIIIll(llllllllllllIllIIlIllIlIllIllllI, llllllllllllIllIIlIllIlIllIlllll.length)) {
                llllllllllllIllIIlIllIlIlllIIIII.signText[llllllllllllIllIIlIllIlIllIllllI] = new ChatComponentText(EnumChatFormatting.getTextWithoutFormattingCodes(llllllllllllIllIIlIllIlIllIlllll[llllllllllllIllIIlIllIlIllIllllI].getUnformattedText()));
                ++llllllllllllIllIIlIllIlIllIllllI;
            }
            llllllllllllIllIIlIllIlIlllIIIII.markDirty();
            llllllllllllIllIIlIllIlIlllIIIll.markBlockForUpdate(llllllllllllIllIIlIllIlIlllIIIlI);
        }
    }
    
    @Override
    public void processEntityAction(final C0BPacketEntityAction llllllllllllIllIIlIllIllIlIlIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayServer>)llllllllllllIllIIlIllIllIlIlIIII, this, this.playerEntity.getServerForPlayer());
        this.playerEntity.markPlayerActive();
        switch ($SWITCH_TABLE$net$minecraft$network$play$client$C0BPacketEntityAction$Action()[llllllllllllIllIIlIllIllIlIlIIII.getAction().ordinal()]) {
            case 1: {
                this.playerEntity.setSneaking((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
                "".length();
                if (-(0x17 ^ 0x1 ^ (0x16 ^ 0x4)) > 0) {
                    return;
                }
                break;
            }
            case 2: {
                this.playerEntity.setSneaking((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                "".length();
                if ((0x46 ^ 0x42) <= ((0x2 ^ 0xC) & ~(0xA8 ^ 0xA6))) {
                    return;
                }
                break;
            }
            case 4: {
                this.playerEntity.setSprinting((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
                "".length();
                if ((0x1 ^ 0x4) <= 0) {
                    return;
                }
                break;
            }
            case 5: {
                this.playerEntity.setSprinting((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0));
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                break;
            }
            case 3: {
                this.playerEntity.wakeUpPlayer((boolean)(NetHandlerPlayServer.llIlllIIIIIIII[1] != 0), (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0), (boolean)(NetHandlerPlayServer.llIlllIIIIIIII[0] != 0));
                this.hasMoved = (NetHandlerPlayServer.llIlllIIIIIIII[1] != 0);
                "".length();
                if ((0x4B ^ 0x4F) == ((0x68 ^ 0x29) & ~(0x28 ^ 0x69))) {
                    return;
                }
                break;
            }
            case 6: {
                if (!lIIllIIIlIlllIIl((this.playerEntity.ridingEntity instanceof EntityHorse) ? 1 : 0)) {
                    break;
                }
                ((EntityHorse)this.playerEntity.ridingEntity).setJumpPower(llllllllllllIllIIlIllIllIlIlIIII.getAuxData());
                "".length();
                if ("   ".length() == ((0x16 ^ 0x28 ^ (0x62 ^ 0x72)) & (231 + 155 - 333 + 183 ^ 32 + 104 - 67 + 125 ^ -" ".length()) & (((58 + 202 - 70 + 37 ^ 42 + 148 - 107 + 99) & (0x76 ^ 0x24 ^ (0xC2 ^ 0xC5) ^ -" ".length())) ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 7: {
                if (!lIIllIIIlIlllIIl((this.playerEntity.ridingEntity instanceof EntityHorse) ? 1 : 0)) {
                    break;
                }
                ((EntityHorse)this.playerEntity.ridingEntity).openGUI(this.playerEntity);
                "".length();
                if (((0x16 ^ 0x0) & ~(0xD6 ^ 0xC0)) > 0) {
                    return;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException(NetHandlerPlayServer.llIllIlllIllIl[NetHandlerPlayServer.llIlllIIIIIIII[33]]);
            }
        }
    }
}
