// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Iterator;
import net.minecraft.network.play.server.S25PacketBlockBreakAnim;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S28PacketEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class WorldManager implements IWorldAccess
{
    private /* synthetic */ MinecraftServer mcServer;
    private static final /* synthetic */ int[] llIIlllIlIIIlI;
    private /* synthetic */ WorldServer theWorldServer;
    
    @Override
    public void playAuxSFX(final EntityPlayer llllllllllllIllIllllIlllIlIlIIIl, final int llllllllllllIllIllllIlllIlIlIIII, final BlockPos llllllllllllIllIllllIlllIlIIllll, final int llllllllllllIllIllllIlllIlIIlllI) {
        this.mcServer.getConfigurationManager().sendToAllNearExcept(llllllllllllIllIllllIlllIlIlIIIl, llllllllllllIllIllllIlllIlIIllll.getX(), llllllllllllIllIllllIlllIlIIllll.getY(), llllllllllllIllIllllIlllIlIIllll.getZ(), 64.0, this.theWorldServer.provider.getDimensionId(), new S28PacketEffect(llllllllllllIllIllllIlllIlIlIIII, llllllllllllIllIllllIlllIlIIllll, llllllllllllIllIllllIlllIlIIlllI, (boolean)(WorldManager.llIIlllIlIIIlI[0] != 0)));
    }
    
    private static boolean lIIIlllllIIlIlll(final int llllllllllllIllIllllIlllIIIllIll) {
        return llllllllllllIllIllllIlllIIIllIll == 0;
    }
    
    @Override
    public void playSoundToNearExcept(final EntityPlayer llllllllllllIllIllllIlllIlllIIII, final String llllllllllllIllIllllIlllIllIllll, final double llllllllllllIllIllllIlllIlllIllI, final double llllllllllllIllIllllIlllIllIllIl, final double llllllllllllIllIllllIlllIllIllII, final float llllllllllllIllIllllIlllIllIlIll, final float llllllllllllIllIllllIlllIlllIIlI) {
        final ServerConfigurationManager configurationManager = this.mcServer.getConfigurationManager();
        double llllllllllllIlIlIlllIllIllIIlIll;
        if (lIIIlllllIIlIIII(lIIIlllllIIlIIIl(llllllllllllIllIllllIlllIllIlIll, 1.0f))) {
            llllllllllllIlIlIlllIllIllIIlIll = 16.0f * llllllllllllIllIllllIlllIllIlIll;
            "".length();
            if (((0x2F ^ 0x22) & ~(0x3B ^ 0x36)) >= "  ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlIlIlllIllIllIIlIll = 16.0;
        }
        configurationManager.sendToAllNearExcept(llllllllllllIllIllllIlllIlllIIII, llllllllllllIllIllllIlllIlllIllI, llllllllllllIllIllllIlllIllIllIl, llllllllllllIllIllllIlllIllIllII, llllllllllllIlIlIlllIllIllIIlIll, this.theWorldServer.provider.getDimensionId(), new S29PacketSoundEffect(llllllllllllIllIllllIlllIllIllll, llllllllllllIllIllllIlllIlllIllI, llllllllllllIllIllllIlllIllIllIl, llllllllllllIllIllllIlllIllIllII, llllllllllllIllIllllIlllIllIlIll, llllllllllllIllIllllIlllIlllIIlI));
    }
    
    private static int lIIIlllllIIlIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void onEntityRemoved(final Entity llllllllllllIllIllllIllllIIllIIl) {
        this.theWorldServer.getEntityTracker().untrackEntity(llllllllllllIllIllllIllllIIllIIl);
        this.theWorldServer.getScoreboard().func_181140_a(llllllllllllIllIllllIllllIIllIIl);
    }
    
    @Override
    public void notifyLightSet(final BlockPos llllllllllllIllIllllIlllIlIllIll) {
    }
    
    private static boolean lIIIlllllIIlIlII(final Object llllllllllllIllIllllIlllIIIllllI, final Object llllllllllllIllIllllIlllIIIlllIl) {
        return llllllllllllIllIllllIlllIIIllllI == llllllllllllIllIllllIlllIIIlllIl;
    }
    
    @Override
    public void markBlockForUpdate(final BlockPos llllllllllllIllIllllIlllIlIlllIl) {
        this.theWorldServer.getPlayerManager().markBlockForUpdate(llllllllllllIllIllllIlllIlIlllIl);
    }
    
    @Override
    public void markBlockRangeForRenderUpdate(final int llllllllllllIllIllllIlllIllIlIII, final int llllllllllllIllIllllIlllIllIIlll, final int llllllllllllIllIllllIlllIllIIllI, final int llllllllllllIllIllllIlllIllIIlIl, final int llllllllllllIllIllllIlllIllIIlII, final int llllllllllllIllIllllIlllIllIIIll) {
    }
    
    private static boolean lIIIlllllIIlIlIl(final int llllllllllllIllIllllIlllIIIlIlII, final int llllllllllllIllIllllIlllIIIlIIll) {
        return llllllllllllIllIllllIlllIIIlIlII != llllllllllllIllIllllIlllIIIlIIll;
    }
    
    public WorldManager(final MinecraftServer llllllllllllIllIllllIllllIlIlllI, final WorldServer llllllllllllIllIllllIllllIlIllIl) {
        this.mcServer = llllllllllllIllIllllIllllIlIlllI;
        this.theWorldServer = llllllllllllIllIllllIllllIlIllIl;
    }
    
    @Override
    public void playRecord(final String llllllllllllIllIllllIlllIlIllIIl, final BlockPos llllllllllllIllIllllIlllIlIllIII) {
    }
    
    private static boolean lIIIlllllIIlIllI(final int llllllllllllIllIllllIlllIIIllIIl) {
        return llllllllllllIllIllllIlllIIIllIIl < 0;
    }
    
    private static boolean lIIIlllllIIlIIII(final int llllllllllllIllIllllIlllIIIlIlll) {
        return llllllllllllIllIllllIlllIIIlIlll > 0;
    }
    
    @Override
    public void sendBlockBreakProgress(final int llllllllllllIllIllllIlllIIllIIlI, final BlockPos llllllllllllIllIllllIlllIIlIlIIl, final int llllllllllllIllIllllIlllIIlIlIII) {
        final boolean llllllllllllIllIllllIlllIIlIIllI = (boolean)this.mcServer.getConfigurationManager().func_181057_v().iterator();
        "".length();
        if ("  ".length() <= " ".length()) {
            return;
        }
        while (!lIIIlllllIIlIlll(((Iterator)llllllllllllIllIllllIlllIIlIIllI).hasNext() ? 1 : 0)) {
            final EntityPlayerMP llllllllllllIllIllllIlllIIlIllll = ((Iterator<EntityPlayerMP>)llllllllllllIllIllllIlllIIlIIllI).next();
            if (lIIIlllllIIlIIll(llllllllllllIllIllllIlllIIlIllll) && lIIIlllllIIlIlII(llllllllllllIllIllllIlllIIlIllll.worldObj, this.theWorldServer) && lIIIlllllIIlIlIl(llllllllllllIllIllllIlllIIlIllll.getEntityId(), llllllllllllIllIllllIlllIIllIIlI)) {
                final double llllllllllllIllIllllIlllIIlIlllI = llllllllllllIllIllllIlllIIlIlIIl.getX() - llllllllllllIllIllllIlllIIlIllll.posX;
                final double llllllllllllIllIllllIlllIIlIllIl = llllllllllllIllIllllIlllIIlIlIIl.getY() - llllllllllllIllIllllIlllIIlIllll.posY;
                final double llllllllllllIllIllllIlllIIlIllII = llllllllllllIllIllllIlllIIlIlIIl.getZ() - llllllllllllIllIllllIlllIIlIllll.posZ;
                if (!lIIIlllllIIlIllI(lIIIlllllIIlIIlI(llllllllllllIllIllllIlllIIlIlllI * llllllllllllIllIllllIlllIIlIlllI + llllllllllllIllIllllIlllIIlIllIl * llllllllllllIllIllllIlllIIlIllIl + llllllllllllIllIllllIlllIIlIllII * llllllllllllIllIllllIlllIIlIllII, 1024.0))) {
                    continue;
                }
                llllllllllllIllIllllIlllIIlIllll.playerNetServerHandler.sendPacket(new S25PacketBlockBreakAnim(llllllllllllIllIllllIlllIIllIIlI, llllllllllllIllIllllIlllIIlIlIIl, llllllllllllIllIllllIlllIIlIlIII));
            }
        }
    }
    
    private static void lIIIlllllIIIlllI() {
        (llIIlllIlIIIlI = new int[2])[0] = ((0x92 ^ 0xA8) & ~(0xBA ^ 0x80));
        WorldManager.llIIlllIlIIIlI[1] = " ".length();
    }
    
    @Override
    public void playSound(final String llllllllllllIllIllllIllllIIIlllI, final double llllllllllllIllIllllIllllIIIllIl, final double llllllllllllIllIllllIllllIIIllII, final double llllllllllllIllIllllIllllIIIIlII, final float llllllllllllIllIllllIllllIIIIIll, final float llllllllllllIllIllllIllllIIIIIlI) {
        final ServerConfigurationManager configurationManager = this.mcServer.getConfigurationManager();
        double llllllllllllIlIlIlllIllIllllIlII;
        if (lIIIlllllIIlIIII(lIIIlllllIIIllll(llllllllllllIllIllllIllllIIIIIll, 1.0f))) {
            llllllllllllIlIlIlllIllIllllIlII = 16.0f * llllllllllllIllIllllIllllIIIIIll;
            "".length();
            if ((0x24 ^ 0x2D ^ (0x11 ^ 0x1D)) <= 0) {
                return;
            }
        }
        else {
            llllllllllllIlIlIlllIllIllllIlII = 16.0;
        }
        configurationManager.sendToAllNear(llllllllllllIllIllllIllllIIIllIl, llllllllllllIllIllllIllllIIIllII, llllllllllllIllIllllIllllIIIIlII, llllllllllllIlIlIlllIllIllllIlII, this.theWorldServer.provider.getDimensionId(), new S29PacketSoundEffect(llllllllllllIllIllllIllllIIIlllI, llllllllllllIllIllllIllllIIIllIl, llllllllllllIllIllllIllllIIIllII, llllllllllllIllIllllIllllIIIIlII, llllllllllllIllIllllIllllIIIIIll, llllllllllllIllIllllIllllIIIIIlI));
    }
    
    private static boolean lIIIlllllIIlIIll(final Object llllllllllllIllIllllIlllIIlIIIIl) {
        return llllllllllllIllIllllIlllIIlIIIIl != null;
    }
    
    private static int lIIIlllllIIlIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIIIlllllIIIlllI();
    }
    
    @Override
    public void broadcastSound(final int llllllllllllIllIllllIlllIIllllll, final BlockPos llllllllllllIllIllllIlllIIlllllI, final int llllllllllllIllIllllIlllIIllllIl) {
        this.mcServer.getConfigurationManager().sendPacketToAllPlayers(new S28PacketEffect(llllllllllllIllIllllIlllIIllllll, llllllllllllIllIllllIlllIIlllllI, llllllllllllIllIllllIlllIIllllIl, (boolean)(WorldManager.llIIlllIlIIIlI[1] != 0)));
    }
    
    @Override
    public void spawnParticle(final int llllllllllllIllIllllIllllIlIlIll, final boolean llllllllllllIllIllllIllllIlIlIlI, final double llllllllllllIllIllllIllllIlIlIIl, final double llllllllllllIllIllllIllllIlIlIII, final double llllllllllllIllIllllIllllIlIIlll, final double llllllllllllIllIllllIllllIlIIllI, final double llllllllllllIllIllllIllllIlIIlIl, final double llllllllllllIllIllllIllllIlIIlII, final int... llllllllllllIllIllllIllllIlIIIll) {
    }
    
    private static int lIIIlllllIIIllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void onEntityAdded(final Entity llllllllllllIllIllllIllllIIlllIl) {
        this.theWorldServer.getEntityTracker().trackEntity(llllllllllllIllIllllIllllIIlllIl);
    }
}
