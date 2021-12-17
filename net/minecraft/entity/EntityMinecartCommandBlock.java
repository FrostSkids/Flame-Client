// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Arrays;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IChatComponent;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.entity.item.EntityMinecart;

public class EntityMinecartCommandBlock extends EntityMinecart
{
    private final /* synthetic */ CommandBlockLogic commandBlockLogic;
    private static final /* synthetic */ String[] llIIIllIIIllII;
    private /* synthetic */ int activatorRailCooldown;
    private static final /* synthetic */ int[] llIIIllIIIllIl;
    
    private static void lIIIlIlIIIIllIll() {
        (llIIIllIIIllII = new String[EntityMinecartCommandBlock.llIIIllIIIllIl[5]])[EntityMinecartCommandBlock.llIIIllIIIllIl[0]] = lIIIlIlIIIIllIIl("rkrRsFT9lss=", "bmxll");
        EntityMinecartCommandBlock.llIIIllIIIllII[EntityMinecartCommandBlock.llIIIllIIIllIl[3]] = lIIIlIlIIIIllIlI("PEn0m8ghUZU=", "AGNbV");
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIlllIlIIllIlllllllIl) {
        super.readEntityFromNBT(llllllllllllIlllIlIIllIlllllllIl);
        this.commandBlockLogic.readDataFromNBT(llllllllllllIlllIlIIllIlllllllIl);
        this.getDataWatcher().updateObject(EntityMinecartCommandBlock.llIIIllIIIllIl[1], this.getCommandBlockLogic().getCommand());
        this.getDataWatcher().updateObject(EntityMinecartCommandBlock.llIIIllIIIllIl[2], IChatComponent.Serializer.componentToJson(this.getCommandBlockLogic().getLastOutput()));
    }
    
    @Override
    public IBlockState getDefaultDisplayTile() {
        return Blocks.command_block.getDefaultState();
    }
    
    @Override
    public void onActivatorRailPass(final int llllllllllllIlllIlIIllIllllIlllI, final int llllllllllllIlllIlIIllIllllIllIl, final int llllllllllllIlllIlIIllIllllIllII, final boolean llllllllllllIlllIlIIllIllllIlIll) {
        if (lIIIlIlIIIIlllIl(llllllllllllIlllIlIIllIllllIlIll ? 1 : 0) && lIIIlIlIIIIllllI(this.ticksExisted - this.activatorRailCooldown, EntityMinecartCommandBlock.llIIIllIIIllIl[4])) {
            this.getCommandBlockLogic().trigger(this.worldObj);
            this.activatorRailCooldown = this.ticksExisted;
        }
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(EntityMinecartCommandBlock.llIIIllIIIllIl[1], EntityMinecartCommandBlock.llIIIllIIIllII[EntityMinecartCommandBlock.llIIIllIIIllIl[0]]);
        this.getDataWatcher().addObject(EntityMinecartCommandBlock.llIIIllIIIllIl[2], EntityMinecartCommandBlock.llIIIllIIIllII[EntityMinecartCommandBlock.llIIIllIIIllIl[3]]);
    }
    
    private static void lIIIlIlIIIIlllII() {
        (llIIIllIIIllIl = new int[7])[0] = ((0xA1 ^ 0x94) & ~(0x40 ^ 0x75));
        EntityMinecartCommandBlock.llIIIllIIIllIl[1] = (0x78 ^ 0x28 ^ (0x54 ^ 0x13));
        EntityMinecartCommandBlock.llIIIllIIIllIl[2] = (115 + 129 - 228 + 140 ^ 12 + 120 - 128 + 128);
        EntityMinecartCommandBlock.llIIIllIIIllIl[3] = " ".length();
        EntityMinecartCommandBlock.llIIIllIIIllIl[4] = (0x6D ^ 0x69);
        EntityMinecartCommandBlock.llIIIllIIIllIl[5] = "  ".length();
        EntityMinecartCommandBlock.llIIIllIIIllIl[6] = (0xAF ^ 0xA7);
    }
    
    public EntityMinecartCommandBlock(final World llllllllllllIlllIlIIlllIIIIIlllI, final double llllllllllllIlllIlIIlllIIIIIllIl, final double llllllllllllIlllIlIIlllIIIIIllII, final double llllllllllllIlllIlIIlllIIIIIIllI) {
        super(llllllllllllIlllIlIIlllIIIIIlllI, llllllllllllIlllIlIIlllIIIIIllIl, llllllllllllIlllIlIIlllIIIIIllII, llllllllllllIlllIlIIlllIIIIIIllI);
        this.commandBlockLogic = new CommandBlockLogic() {
            private static final /* synthetic */ int[] lIIIlIIIlIIllI;
            
            static {
                lIlllllIIllIllI();
            }
            
            @Override
            public Vec3 getPositionVector() {
                return new Vec3(EntityMinecartCommandBlock.this.posX, EntityMinecartCommandBlock.this.posY, EntityMinecartCommandBlock.this.posZ);
            }
            
            @Override
            public void func_145757_a(final ByteBuf lllllllllllllIlIIIllIIIllIIIIllI) {
                lllllllllllllIlIIIllIIIllIIIIllI.writeInt(EntityMinecartCommandBlock.this.getEntityId());
                "".length();
            }
            
            @Override
            public BlockPos getPosition() {
                return new BlockPos(EntityMinecartCommandBlock.this.posX, EntityMinecartCommandBlock.this.posY + 0.5, EntityMinecartCommandBlock.this.posZ);
            }
            
            @Override
            public void updateCommand() {
                EntityMinecartCommandBlock.this.getDataWatcher().updateObject(EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[0], this.getCommand());
                EntityMinecartCommandBlock.this.getDataWatcher().updateObject(EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[1], IChatComponent.Serializer.componentToJson(this.getLastOutput()));
            }
            
            @Override
            public int func_145751_f() {
                return EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[2];
            }
            
            @Override
            public World getEntityWorld() {
                return EntityMinecartCommandBlock.this.worldObj;
            }
            
            private static void lIlllllIIllIllI() {
                (lIIIlIIIlIIllI = new int[3])[0] = (0x2F ^ 0x38);
                EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[1] = (0xBD ^ 0xA5);
                EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[2] = " ".length();
            }
            
            @Override
            public Entity getCommandSenderEntity() {
                return EntityMinecartCommandBlock.this;
            }
        };
        this.activatorRailCooldown = EntityMinecartCommandBlock.llIIIllIIIllIl[0];
    }
    
    private static String lIIIlIlIIIIllIlI(final String llllllllllllIlllIlIIllIlllIlIIll, final String llllllllllllIlllIlIIllIlllIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIllIlllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIllIlllIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIllIlllIlIlIl.init(EntityMinecartCommandBlock.llIIIllIIIllIl[5], llllllllllllIlllIlIIllIlllIlIllI);
            return new String(llllllllllllIlllIlIIllIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIllIlllIlIlII) {
            llllllllllllIlllIlIIllIlllIlIlII.printStackTrace();
            return null;
        }
    }
    
    public CommandBlockLogic getCommandBlockLogic() {
        return this.commandBlockLogic;
    }
    
    public EntityMinecartCommandBlock(final World llllllllllllIlllIlIIlllIIIIlIlIl) {
        super(llllllllllllIlllIlIIlllIIIIlIlIl);
        this.commandBlockLogic = new CommandBlockLogic() {
            private static final /* synthetic */ int[] lIIIlIIIlIIllI;
            
            static {
                lIlllllIIllIllI();
            }
            
            @Override
            public Vec3 getPositionVector() {
                return new Vec3(EntityMinecartCommandBlock.this.posX, EntityMinecartCommandBlock.this.posY, EntityMinecartCommandBlock.this.posZ);
            }
            
            @Override
            public void func_145757_a(final ByteBuf lllllllllllllIlIIIllIIIllIIIIllI) {
                lllllllllllllIlIIIllIIIllIIIIllI.writeInt(EntityMinecartCommandBlock.this.getEntityId());
                "".length();
            }
            
            @Override
            public BlockPos getPosition() {
                return new BlockPos(EntityMinecartCommandBlock.this.posX, EntityMinecartCommandBlock.this.posY + 0.5, EntityMinecartCommandBlock.this.posZ);
            }
            
            @Override
            public void updateCommand() {
                EntityMinecartCommandBlock.this.getDataWatcher().updateObject(EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[0], this.getCommand());
                EntityMinecartCommandBlock.this.getDataWatcher().updateObject(EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[1], IChatComponent.Serializer.componentToJson(this.getLastOutput()));
            }
            
            @Override
            public int func_145751_f() {
                return EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[2];
            }
            
            @Override
            public World getEntityWorld() {
                return EntityMinecartCommandBlock.this.worldObj;
            }
            
            private static void lIlllllIIllIllI() {
                (lIIIlIIIlIIllI = new int[3])[0] = (0x2F ^ 0x38);
                EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[1] = (0xBD ^ 0xA5);
                EntityMinecartCommandBlock$1.lIIIlIIIlIIllI[2] = " ".length();
            }
            
            @Override
            public Entity getCommandSenderEntity() {
                return EntityMinecartCommandBlock.this;
            }
        };
        this.activatorRailCooldown = EntityMinecartCommandBlock.llIIIllIIIllIl[0];
    }
    
    private static boolean lIIIlIlIIIIllllI(final int llllllllllllIlllIlIIllIllIlllIlI, final int llllllllllllIlllIlIIllIllIlllIIl) {
        return llllllllllllIlllIlIIllIllIlllIlI >= llllllllllllIlllIlIIllIllIlllIIl;
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer llllllllllllIlllIlIIllIllllIIIll) {
        this.commandBlockLogic.tryOpenEditCommandBlock(llllllllllllIlllIlIIllIllllIIIll);
        "".length();
        return EntityMinecartCommandBlock.llIIIllIIIllIl[0] != 0;
    }
    
    private static boolean lIIIlIlIIIIlllIl(final int llllllllllllIlllIlIIllIllIllIlll) {
        return llllllllllllIlllIlIIllIllIllIlll != 0;
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIlllIlIIllIllllllIIl) {
        super.writeEntityToNBT(llllllllllllIlllIlIIllIllllllIIl);
        this.commandBlockLogic.writeDataToNBT(llllllllllllIlllIlIIllIllllllIIl);
    }
    
    @Override
    public EnumMinecartType getMinecartType() {
        return EnumMinecartType.COMMAND_BLOCK;
    }
    
    private static boolean lIIIlIlIIIIlllll(final int llllllllllllIlllIlIIllIllIlllllI, final int llllllllllllIlllIlIIllIllIllllIl) {
        return llllllllllllIlllIlIIllIllIlllllI == llllllllllllIlllIlIIllIllIllllIl;
    }
    
    static {
        lIIIlIlIIIIlllII();
        lIIIlIlIIIIllIll();
    }
    
    @Override
    public void onDataWatcherUpdate(final int llllllllllllIlllIlIIllIlllIllllI) {
        super.onDataWatcherUpdate(llllllllllllIlllIlIIllIlllIllllI);
        if (lIIIlIlIIIIlllll(llllllllllllIlllIlIIllIlllIllllI, EntityMinecartCommandBlock.llIIIllIIIllIl[2])) {
            try {
                this.commandBlockLogic.setLastOutput(IChatComponent.Serializer.jsonToComponent(this.getDataWatcher().getWatchableObjectString(EntityMinecartCommandBlock.llIIIllIIIllIl[2])));
                "".length();
                if (((0x60 ^ 0x43) & ~(0x36 ^ 0x15)) != 0x0) {
                    return;
                }
                return;
            }
            catch (Throwable llllllllllllIlllIlIIllIlllIllIll) {
                "".length();
                if ((12 + 65 - 59 + 176 ^ 36 + 54 + 98 + 10) <= 0) {
                    return;
                }
                return;
            }
        }
        if (lIIIlIlIIIIlllll(llllllllllllIlllIlIIllIlllIllllI, EntityMinecartCommandBlock.llIIIllIIIllIl[1])) {
            this.commandBlockLogic.setCommand(this.getDataWatcher().getWatchableObjectString(EntityMinecartCommandBlock.llIIIllIIIllIl[1]));
        }
    }
    
    private static String lIIIlIlIIIIllIIl(final String llllllllllllIlllIlIIllIlllIIIlII, final String llllllllllllIlllIlIIllIlllIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIllIlllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), EntityMinecartCommandBlock.llIIIllIIIllIl[6]), "DES");
            final Cipher llllllllllllIlllIlIIllIlllIIlIII = Cipher.getInstance("DES");
            llllllllllllIlllIlIIllIlllIIlIII.init(EntityMinecartCommandBlock.llIIIllIIIllIl[5], llllllllllllIlllIlIIllIlllIIlIIl);
            return new String(llllllllllllIlllIlIIllIlllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIllIlllIIIlll) {
            llllllllllllIlllIlIIllIlllIIIlll.printStackTrace();
            return null;
        }
    }
}
