// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.network.play.server.S33PacketUpdateSign;
import net.minecraft.network.Packet;
import java.util.Arrays;
import com.google.gson.JsonParseException;
import net.minecraft.command.CommandException;
import net.minecraft.util.ChatComponentProcessor;
import net.minecraft.util.ChatComponentText;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatStyle;
import net.minecraft.server.MinecraftServer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.CommandResultStats;
import net.minecraft.util.IChatComponent;

public class TileEntitySign extends TileEntity
{
    public /* synthetic */ int lineBeingEdited;
    public final /* synthetic */ IChatComponent[] signText;
    private final /* synthetic */ CommandResultStats stats;
    private static final /* synthetic */ int[] lIIllllIlIIllI;
    private /* synthetic */ EntityPlayer player;
    private /* synthetic */ boolean isEditable;
    private static final /* synthetic */ String[] lIIllllIIlllll;
    
    private static void llIlllIlllIllIl() {
        (lIIllllIIlllll = new String[TileEntitySign.lIIllllIlIIllI[7]])[TileEntitySign.lIIllllIlIIllI[1]] = llIlllIlllIIIIl("t+IcM2VRTJ0=", "klJjt");
        TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[2]] = llIlllIlllIIIIl("g+yVAlx494U=", "FKHSM");
        TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[3]] = llIlllIlllIlIll("6xq2Xv0Z+bU=", "vDyCY");
        TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[4]] = llIlllIlllIllII("", "JxbHj");
        TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[0]] = llIlllIlllIIIIl("Vq/M6d2QYMU=", "iteMV");
        TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[6]] = llIlllIlllIllII("BikLEA==", "RLsdb");
    }
    
    public void setPlayer(final EntityPlayer lllllllllllllIIlIIlIlIlIllIllIlI) {
        this.player = lllllllllllllIIlIIlIlIlIllIllIlI;
    }
    
    public boolean executeCommand(final EntityPlayer lllllllllllllIIlIIlIlIlIllIIlIIl) {
        final ICommandSender lllllllllllllIIlIIlIlIlIllIIlllI = new ICommandSender() {
            private static final /* synthetic */ int[] lIllIllllIllII;
            
            @Override
            public Vec3 getPositionVector() {
                return new Vec3(TileEntitySign.this.pos.getX() + 0.5, TileEntitySign.this.pos.getY() + 0.5, TileEntitySign.this.pos.getZ() + 0.5);
            }
            
            @Override
            public void setCommandStat(final CommandResultStats.Type llllllllllllIllllllIIIlIlllIlIII, final int llllllllllllIllllllIIIlIlllIIlII) {
                TileEntitySign.this.stats.func_179672_a(this, llllllllllllIllllllIIIlIlllIlIII, llllllllllllIllllllIIIlIlllIIlII);
            }
            
            @Override
            public boolean sendCommandFeedback() {
                return TileEntitySign$2.lIllIllllIllII[2] != 0;
            }
            
            private static void lIIIIIIIlIIIIIIl() {
                (lIllIllllIllII = new int[3])[0] = "  ".length();
                TileEntitySign$2.lIllIllllIllII[1] = " ".length();
                TileEntitySign$2.lIllIllllIllII[2] = ((77 + 116 - 167 + 175 ^ 125 + 48 - 157 + 123) & (0x80 ^ 0xB1 ^ (0xC4 ^ 0xB7) ^ -" ".length()));
            }
            
            @Override
            public boolean canCommandSenderUseCommand(final int llllllllllllIllllllIIIlIlllllIlI, final String llllllllllllIllllllIIIlIlllllIll) {
                if (lIIIIIIIlIIIIIlI(llllllllllllIllllllIIIlIlllllIlI, TileEntitySign$2.lIllIllllIllII[0])) {
                    return TileEntitySign$2.lIllIllllIllII[1] != 0;
                }
                return TileEntitySign$2.lIllIllllIllII[2] != 0;
            }
            
            @Override
            public World getEntityWorld() {
                return lllllllllllllIIlIIlIlIlIllIIlIIl.getEntityWorld();
            }
            
            static {
                lIIIIIIIlIIIIIIl();
            }
            
            @Override
            public Entity getCommandSenderEntity() {
                return lllllllllllllIIlIIlIlIlIllIIlIIl;
            }
            
            @Override
            public void addChatMessage(final IChatComponent llllllllllllIllllllIIIlIllllllll) {
            }
            
            @Override
            public IChatComponent getDisplayName() {
                return lllllllllllllIIlIIlIlIlIllIIlIIl.getDisplayName();
            }
            
            private static boolean lIIIIIIIlIIIIIlI(final int llllllllllllIllllllIIIlIlllIIIIl, final int llllllllllllIllllllIIIlIlllIIIII) {
                return llllllllllllIllllllIIIlIlllIIIIl <= llllllllllllIllllllIIIlIlllIIIII;
            }
            
            @Override
            public String getName() {
                return lllllllllllllIIlIIlIlIlIllIIlIIl.getName();
            }
            
            @Override
            public BlockPos getPosition() {
                return TileEntitySign.this.pos;
            }
        };
        int lllllllllllllIIlIIlIlIlIllIIllIl = TileEntitySign.lIIllllIlIIllI[1];
        "".length();
        if (((0x2E ^ 0x3) & ~(0xBE ^ 0x93)) != 0x0) {
            return ((0x6F ^ 0x4D) & ~(0x4E ^ 0x6C)) != 0x0;
        }
        while (!llIlllIllllIIll(lllllllllllllIIlIIlIlIlIllIIllIl, this.signText.length)) {
            ChatStyle chatStyle;
            if (llIlllIllllIlIl(this.signText[lllllllllllllIIlIIlIlIlIllIIllIl])) {
                chatStyle = null;
                "".length();
                if (((0x5B ^ 0xC) & ~(0xD7 ^ 0x80)) != 0x0) {
                    return ((0x5 ^ 0x65) & ~(0xFC ^ 0x9C)) != 0x0;
                }
            }
            else {
                chatStyle = this.signText[lllllllllllllIIlIIlIlIlIllIIllIl].getChatStyle();
            }
            final ChatStyle lllllllllllllIIlIIlIlIlIllIIllII = chatStyle;
            if (llIlllIllllIllI(lllllllllllllIIlIIlIlIlIllIIllII) && llIlllIllllIllI(lllllllllllllIIlIIlIlIlIllIIllII.getChatClickEvent())) {
                final ClickEvent lllllllllllllIIlIIlIlIlIllIIlIll = lllllllllllllIIlIIlIlIlIllIIllII.getChatClickEvent();
                if (llIlllIllllIlll(lllllllllllllIIlIIlIlIlIllIIlIll.getAction(), ClickEvent.Action.RUN_COMMAND)) {
                    MinecraftServer.getServer().getCommandManager().executeCommand(lllllllllllllIIlIIlIlIlIllIIlllI, lllllllllllllIIlIIlIlIlIllIIlIll.getValue());
                    "".length();
                }
            }
            ++lllllllllllllIIlIIlIlIlIllIIllIl;
        }
        return TileEntitySign.lIIllllIlIIllI[2] != 0;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIIlIIlIlIllIIIIlIII) {
        super.writeToNBT(lllllllllllllIIlIIlIlIllIIIIlIII);
        int lllllllllllllIIlIIlIlIllIIIIlIll = TileEntitySign.lIIllllIlIIllI[1];
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!llIlllIllllIIll(lllllllllllllIIlIIlIlIllIIIIlIll, TileEntitySign.lIIllllIlIIllI[0])) {
            final String lllllllllllllIIlIIlIlIllIIIIlIlI = IChatComponent.Serializer.componentToJson(this.signText[lllllllllllllIIlIIlIlIllIIIIlIll]);
            lllllllllllllIIlIIlIlIllIIIIlIII.setString(String.valueOf(new StringBuilder(TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[0]]).append(lllllllllllllIIlIIlIlIllIIIIlIll + TileEntitySign.lIIllllIlIIllI[2])), lllllllllllllIIlIIlIlIllIIIIlIlI);
            ++lllllllllllllIIlIIlIlIllIIIIlIll;
        }
        this.stats.writeStatsToNBT(lllllllllllllIIlIIlIlIllIIIIlIII);
    }
    
    public void setEditable(final boolean lllllllllllllIIlIIlIlIlIlllIIIII) {
        this.isEditable = lllllllllllllIIlIIlIlIlIlllIIIII;
        if (llIlllIllllIlII(lllllllllllllIIlIIlIlIlIlllIIIII ? 1 : 0)) {
            this.player = null;
        }
    }
    
    public boolean getIsEditable() {
        return this.isEditable;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIIlIIlIlIlIllllIlIl) {
        this.isEditable = (TileEntitySign.lIIllllIlIIllI[1] != 0);
        super.readFromNBT(lllllllllllllIIlIIlIlIlIllllIlIl);
        final ICommandSender lllllllllllllIIlIIlIlIlIllllllII = new ICommandSender() {
            private static final /* synthetic */ String[] llIllllIlIllIl;
            private static final /* synthetic */ int[] llIllllIlIlllI;
            
            @Override
            public void addChatMessage(final IChatComponent llllllllllllIllIIIllIlIlllIlllII) {
            }
            
            @Override
            public boolean canCommandSenderUseCommand(final int llllllllllllIllIIIllIlIlllIllIII, final String llllllllllllIllIIIllIlIlllIlIlll) {
                return TileEntitySign$1.llIllllIlIlllI[1] != 0;
            }
            
            @Override
            public BlockPos getPosition() {
                return TileEntitySign.this.pos;
            }
            
            @Override
            public Entity getCommandSenderEntity() {
                return null;
            }
            
            @Override
            public Vec3 getPositionVector() {
                return new Vec3(TileEntitySign.this.pos.getX() + 0.5, TileEntitySign.this.pos.getY() + 0.5, TileEntitySign.this.pos.getZ() + 0.5);
            }
            
            @Override
            public World getEntityWorld() {
                return TileEntitySign.this.worldObj;
            }
            
            static {
                lIIllIlIlIlllIll();
                lIIllIlIlIlllIII();
            }
            
            @Override
            public boolean sendCommandFeedback() {
                return TileEntitySign$1.llIllllIlIlllI[0] != 0;
            }
            
            private static String lIIllIlIlIllIlll(final String llllllllllllIllIIIllIlIllIllIIII, final String llllllllllllIllIIIllIlIllIlIlIll) {
                try {
                    final SecretKeySpec llllllllllllIllIIIllIlIllIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIlIllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllIIIllIlIllIllIIll = Cipher.getInstance("Blowfish");
                    llllllllllllIllIIIllIlIllIllIIll.init(TileEntitySign$1.llIllllIlIlllI[2], llllllllllllIllIIIllIlIllIllIlII);
                    return new String(llllllllllllIllIIIllIlIllIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIlIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllIIIllIlIllIllIIlI) {
                    llllllllllllIllIIIllIlIllIllIIlI.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String getName() {
                return TileEntitySign$1.llIllllIlIllIl[TileEntitySign$1.llIllllIlIlllI[0]];
            }
            
            @Override
            public IChatComponent getDisplayName() {
                return new ChatComponentText(this.getName());
            }
            
            private static void lIIllIlIlIlllIII() {
                (llIllllIlIllIl = new String[TileEntitySign$1.llIllllIlIlllI[1]])[TileEntitySign$1.llIllllIlIlllI[0]] = lIIllIlIlIllIlll("ChmgXU5iiNY=", "QEhMz");
            }
            
            @Override
            public void setCommandStat(final CommandResultStats.Type llllllllllllIllIIIllIlIlllIIIIIl, final int llllllllllllIllIIIllIlIllIllllll) {
            }
            
            private static void lIIllIlIlIlllIll() {
                (llIllllIlIlllI = new int[3])[0] = ((0x7 ^ 0xC) & ~(0x41 ^ 0x4A));
                TileEntitySign$1.llIllllIlIlllI[1] = " ".length();
                TileEntitySign$1.llIllllIlIlllI[2] = "  ".length();
            }
        };
        int lllllllllllllIIlIIlIlIlIlllllIll = TileEntitySign.lIIllllIlIIllI[1];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!llIlllIllllIIll(lllllllllllllIIlIIlIlIlIlllllIll, TileEntitySign.lIIllllIlIIllI[0])) {
            final String lllllllllllllIIlIIlIlIlIlllllIlI = lllllllllllllIIlIIlIlIlIllllIlIl.getString(String.valueOf(new StringBuilder(TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[6]]).append(lllllllllllllIIlIIlIlIlIlllllIll + TileEntitySign.lIIllllIlIIllI[2])));
            try {
                final IChatComponent lllllllllllllIIlIIlIlIlIlllllIIl = IChatComponent.Serializer.jsonToComponent(lllllllllllllIIlIIlIlIlIlllllIlI);
                try {
                    this.signText[lllllllllllllIIlIIlIlIlIlllllIll] = ChatComponentProcessor.processComponent(lllllllllllllIIlIIlIlIlIllllllII, lllllllllllllIIlIIlIlIlIlllllIIl, null);
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                }
                catch (CommandException lllllllllllllIIlIIlIlIlIlllllIII) {
                    this.signText[lllllllllllllIIlIIlIlIlIlllllIll] = lllllllllllllIIlIIlIlIlIlllllIIl;
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
            }
            catch (JsonParseException lllllllllllllIIlIIlIlIlIllllIlll) {
                this.signText[lllllllllllllIIlIIlIlIlIlllllIll] = new ChatComponentText(lllllllllllllIIlIIlIlIlIlllllIlI);
            }
            ++lllllllllllllIIlIIlIlIlIlllllIll;
        }
        this.stats.readStatsFromNBT(lllllllllllllIIlIIlIlIlIllllIlIl);
    }
    
    private static boolean llIlllIllllIlll(final Object lllllllllllllIIlIIlIlIlIlIIIIIIl, final Object lllllllllllllIIlIIlIlIlIlIIIIIII) {
        return lllllllllllllIIlIIlIlIlIlIIIIIIl == lllllllllllllIIlIIlIlIlIlIIIIIII;
    }
    
    private static boolean llIlllIllllIlII(final int lllllllllllllIIlIIlIlIlIIlllllII) {
        return lllllllllllllIIlIIlIlIlIIlllllII == 0;
    }
    
    private static boolean llIlllIllllIIll(final int lllllllllllllIIlIIlIlIlIlIIIlIll, final int lllllllllllllIIlIIlIlIlIlIIIlIlI) {
        return lllllllllllllIIlIIlIlIlIlIIIlIll >= lllllllllllllIIlIIlIlIlIlIIIlIlI;
    }
    
    private static String llIlllIlllIIIIl(final String lllllllllllllIIlIIlIlIlIlIIlIIll, final String lllllllllllllIIlIIlIlIlIlIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlIlIlIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlIlIlIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIlIlIlIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIlIlIlIIlIlIl.init(TileEntitySign.lIIllllIlIIllI[3], lllllllllllllIIlIIlIlIlIlIIlIllI);
            return new String(lllllllllllllIIlIIlIlIlIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIlIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlIlIlIIlIlII) {
            lllllllllllllIIlIIlIlIlIlIIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllIllllIllI(final Object lllllllllllllIIlIIlIlIlIlIIIIlII) {
        return lllllllllllllIIlIIlIlIlIlIIIIlII != null;
    }
    
    private static String llIlllIlllIlIll(final String lllllllllllllIIlIIlIlIlIlIlIIIII, final String lllllllllllllIIlIIlIlIlIlIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlIlIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlIlIlIIlllIl.getBytes(StandardCharsets.UTF_8)), TileEntitySign.lIIllllIlIIllI[8]), "DES");
            final Cipher lllllllllllllIIlIIlIlIlIlIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIlIlIlIlIIIlI.init(TileEntitySign.lIIllllIlIIllI[3], lllllllllllllIIlIIlIlIlIlIlIIIll);
            return new String(lllllllllllllIIlIIlIlIlIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIlIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlIlIlIlIIIIl) {
            lllllllllllllIIlIIlIlIlIlIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    public TileEntitySign() {
        final IChatComponent[] signText = new IChatComponent[TileEntitySign.lIIllllIlIIllI[0]];
        signText[TileEntitySign.lIIllllIlIIllI[1]] = new ChatComponentText(TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[1]]);
        signText[TileEntitySign.lIIllllIlIIllI[2]] = new ChatComponentText(TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[2]]);
        signText[TileEntitySign.lIIllllIlIIllI[3]] = new ChatComponentText(TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[3]]);
        signText[TileEntitySign.lIIllllIlIIllI[4]] = new ChatComponentText(TileEntitySign.lIIllllIIlllll[TileEntitySign.lIIllllIlIIllI[4]]);
        this.signText = signText;
        this.lineBeingEdited = TileEntitySign.lIIllllIlIIllI[5];
        this.isEditable = (TileEntitySign.lIIllllIlIIllI[2] != 0);
        this.stats = new CommandResultStats();
    }
    
    static {
        llIlllIllllIIlI();
        llIlllIlllIllIl();
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final IChatComponent[] lllllllllllllIIlIIlIlIlIlllIllII = new IChatComponent[TileEntitySign.lIIllllIlIIllI[0]];
        System.arraycopy(this.signText, TileEntitySign.lIIllllIlIIllI[1], lllllllllllllIIlIIlIlIlIlllIllII, TileEntitySign.lIIllllIlIIllI[1], TileEntitySign.lIIllllIlIIllI[0]);
        return new S33PacketUpdateSign(this.worldObj, this.pos, lllllllllllllIIlIIlIlIlIlllIllII);
    }
    
    public EntityPlayer getPlayer() {
        return this.player;
    }
    
    @Override
    public boolean func_183000_F() {
        return TileEntitySign.lIIllllIlIIllI[2] != 0;
    }
    
    private static boolean llIlllIllllIlIl(final Object lllllllllllllIIlIIlIlIlIIllllllI) {
        return lllllllllllllIIlIIlIlIlIIllllllI == null;
    }
    
    private static boolean llIlllIlllllIII(final int lllllllllllllIIlIIlIlIlIlIIIIlll, final int lllllllllllllIIlIIlIlIlIlIIIIllI) {
        return lllllllllllllIIlIIlIlIlIlIIIIlll < lllllllllllllIIlIIlIlIlIlIIIIllI;
    }
    
    public CommandResultStats getStats() {
        return this.stats;
    }
    
    private static String llIlllIlllIllII(String lllllllllllllIIlIIlIlIlIlIllIIII, final String lllllllllllllIIlIIlIlIlIlIllIlII) {
        lllllllllllllIIlIIlIlIlIlIllIIII = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIlIlIlIllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIlIlIlIllIIll = new StringBuilder();
        final char[] lllllllllllllIIlIIlIlIlIlIllIIlI = lllllllllllllIIlIIlIlIlIlIllIlII.toCharArray();
        int lllllllllllllIIlIIlIlIlIlIllIIIl = TileEntitySign.lIIllllIlIIllI[1];
        final char lllllllllllllIIlIIlIlIlIlIlIlIll = (Object)((String)lllllllllllllIIlIIlIlIlIlIllIIII).toCharArray();
        final Exception lllllllllllllIIlIIlIlIlIlIlIlIlI = (Exception)lllllllllllllIIlIIlIlIlIlIlIlIll.length;
        float lllllllllllllIIlIIlIlIlIlIlIlIIl = TileEntitySign.lIIllllIlIIllI[1];
        while (llIlllIlllllIII((int)lllllllllllllIIlIIlIlIlIlIlIlIIl, (int)lllllllllllllIIlIIlIlIlIlIlIlIlI)) {
            final char lllllllllllllIIlIIlIlIlIlIllIllI = lllllllllllllIIlIIlIlIlIlIlIlIll[lllllllllllllIIlIIlIlIlIlIlIlIIl];
            lllllllllllllIIlIIlIlIlIlIllIIll.append((char)(lllllllllllllIIlIIlIlIlIlIllIllI ^ lllllllllllllIIlIIlIlIlIlIllIIlI[lllllllllllllIIlIIlIlIlIlIllIIIl % lllllllllllllIIlIIlIlIlIlIllIIlI.length]));
            "".length();
            ++lllllllllllllIIlIIlIlIlIlIllIIIl;
            ++lllllllllllllIIlIIlIlIlIlIlIlIIl;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIlIlIlIllIIll);
    }
    
    private static void llIlllIllllIIlI() {
        (lIIllllIlIIllI = new int[9])[0] = (74 + 16 - 71 + 127 ^ 72 + 49 - 78 + 107);
        TileEntitySign.lIIllllIlIIllI[1] = ((0x68 ^ 0x73 ^ (0x7B ^ 0x68)) & (0xE ^ 0x4E ^ (0x77 ^ 0x3F) ^ -" ".length()));
        TileEntitySign.lIIllllIlIIllI[2] = " ".length();
        TileEntitySign.lIIllllIlIIllI[3] = "  ".length();
        TileEntitySign.lIIllllIlIIllI[4] = "   ".length();
        TileEntitySign.lIIllllIlIIllI[5] = -" ".length();
        TileEntitySign.lIIllllIlIIllI[6] = (0x41 ^ 0x29 ^ (0xE1 ^ 0x8C));
        TileEntitySign.lIIllllIlIIllI[7] = (67 + 50 - 46 + 80 ^ 104 + 25 - 78 + 94);
        TileEntitySign.lIIllllIlIIllI[8] = (0x40 ^ 0x2 ^ (0x52 ^ 0x18));
    }
}
