// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.demo;

import java.util.Arrays;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.server.management.ItemInWorldManager;

public class DemoWorldManager extends ItemInWorldManager
{
    private /* synthetic */ int field_73102_f;
    private /* synthetic */ boolean demoTimeExpired;
    private static final /* synthetic */ String[] llIIlIIlIllIII;
    private static final /* synthetic */ int[] llIIlIIlIllIIl;
    private /* synthetic */ boolean field_73105_c;
    private /* synthetic */ int field_73104_e;
    
    static {
        lIIIllIIIlllIIII();
        lIIIllIIIllIllll();
    }
    
    private static boolean lIIIllIIIlllIlIl(final int llllllllllllIlllIIlIlIIIlllIIIII) {
        return llllllllllllIlllIIlIlIIIlllIIIII != 0;
    }
    
    private static boolean lIIIllIIIlllIllI(final int llllllllllllIlllIIlIlIIIllIlllII) {
        return llllllllllllIlllIIlIlIIIllIlllII <= 0;
    }
    
    private static boolean lIIIllIIIlllIIll(final int llllllllllllIlllIIlIlIIIlllIIIll, final int llllllllllllIlllIIlIlIIIlllIIIlI) {
        return llllllllllllIlllIIlIlIIIlllIIIll > llllllllllllIlllIIlIlIIIlllIIIlI;
    }
    
    private static String lIIIllIIIllIlllI(final String llllllllllllIlllIIlIlIIIllllIllI, final String llllllllllllIlllIIlIlIIIllllIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlIIIlllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlIIIllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIlIIIlllllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIlIIIlllllIlI.init(DemoWorldManager.llIIlIIlIllIIl[5], llllllllllllIlllIIlIlIIIlllllIll);
            return new String(llllllllllllIlllIIlIlIIIlllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlIIIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlIIIlllllIIl) {
            llllllllllllIlllIIlIlIIIlllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIIIlllIIII() {
        (llIIlIIlIllIIl = new int[8])[0] = " ".length();
        DemoWorldManager.llIIlIIlIllIIl[1] = (0x5 ^ 0x3E ^ (0xA1 ^ 0x8E));
        DemoWorldManager.llIIlIIlIllIIl[2] = (0xF9 ^ 0xC1 ^ (0xA ^ 0x37));
        DemoWorldManager.llIIlIIlIllIIl[3] = ((0x4E ^ 0x6 ^ (0x35 ^ 0x4F)) & (0x28 ^ 0x76 ^ (0x21 ^ 0x4D) ^ -" ".length()));
        DemoWorldManager.llIIlIIlIllIIl[4] = (0xA0 ^ 0xC4);
        DemoWorldManager.llIIlIIlIllIIl[5] = "  ".length();
        DemoWorldManager.llIIlIIlIllIIl[6] = "   ".length();
        DemoWorldManager.llIIlIIlIllIIl[7] = (120 + 117 - 64 + 28 ^ 82 + 97 + 9 + 5);
    }
    
    private static int lIIIllIIIlllIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void blockRemoving(final BlockPos llllllllllllIlllIIlIlIIlIIlIllll) {
        if (lIIIllIIIlllIIlI(this.demoTimeExpired ? 1 : 0)) {
            super.blockRemoving(llllllllllllIlllIIlIlIIlIIlIllll);
        }
    }
    
    private static boolean lIIIllIIIlllIIlI(final int llllllllllllIlllIIlIlIIIllIllllI) {
        return llllllllllllIlllIIlIlIIIllIllllI == 0;
    }
    
    public DemoWorldManager(final World llllllllllllIlllIIlIlIIlIlIIlIlI) {
        super(llllllllllllIlllIIlIlIIlIlIIlIlI);
    }
    
    @Override
    public boolean activateBlockOrUseItem(final EntityPlayer llllllllllllIlllIIlIlIIlIIIlIIII, final World llllllllllllIlllIIlIlIIlIIIIIllI, final ItemStack llllllllllllIlllIIlIlIIlIIIIlllI, final BlockPos llllllllllllIlllIIlIlIIlIIIIllIl, final EnumFacing llllllllllllIlllIIlIlIIlIIIIIIll, final float llllllllllllIlllIIlIlIIlIIIIlIll, final float llllllllllllIlllIIlIlIIlIIIIIIIl, final float llllllllllllIlllIIlIlIIlIIIIlIIl) {
        if (lIIIllIIIlllIlIl(this.demoTimeExpired ? 1 : 0)) {
            this.sendDemoReminder();
            return DemoWorldManager.llIIlIIlIllIIl[3] != 0;
        }
        return super.activateBlockOrUseItem(llllllllllllIlllIIlIlIIlIIIlIIII, llllllllllllIlllIIlIlIIlIIIIIllI, llllllllllllIlllIIlIlIIlIIIIlllI, llllllllllllIlllIIlIlIIlIIIIllIl, llllllllllllIlllIIlIlIIlIIIIIIll, llllllllllllIlllIIlIlIIlIIIIlIll, llllllllllllIlllIIlIlIIlIIIIIIIl, llllllllllllIlllIIlIlIIlIIIIlIIl);
    }
    
    @Override
    public boolean tryUseItem(final EntityPlayer llllllllllllIlllIIlIlIIlIIIlllIl, final World llllllllllllIlllIIlIlIIlIIlIIIII, final ItemStack llllllllllllIlllIIlIlIIlIIIllIll) {
        if (lIIIllIIIlllIlIl(this.demoTimeExpired ? 1 : 0)) {
            this.sendDemoReminder();
            return DemoWorldManager.llIIlIIlIllIIl[3] != 0;
        }
        return super.tryUseItem(llllllllllllIlllIIlIlIIlIIIlllIl, llllllllllllIlllIIlIlIIlIIlIIIII, llllllllllllIlllIIlIlIIlIIIllIll);
    }
    
    private static void lIIIllIIIllIllll() {
        (llIIlIIlIllIII = new String[DemoWorldManager.llIIlIIlIllIIl[6]])[DemoWorldManager.llIIlIIlIllIIl[3]] = lIIIllIIIllIllIl("PLc4rTmMCegGgglGTyZY+A==", "NLndr");
        DemoWorldManager.llIIlIIlIllIII[DemoWorldManager.llIIlIIlIllIIl[0]] = lIIIllIIIllIlllI("YR/4VC1V+Gye+2T+eBEWva/MrkMhMreO", "GIvVP");
        DemoWorldManager.llIIlIIlIllIII[DemoWorldManager.llIIlIIlIllIIl[5]] = lIIIllIIIllIlllI("Dpb2CYFPaIW7ZyBfNbilSg==", "fIGcL");
    }
    
    @Override
    public void onBlockClicked(final BlockPos llllllllllllIlllIIlIlIIlIIllIlII, final EnumFacing llllllllllllIlllIIlIlIIlIIllIIll) {
        if (lIIIllIIIlllIlIl(this.demoTimeExpired ? 1 : 0)) {
            this.sendDemoReminder();
            "".length();
            if ((182 + 175 - 342 + 183 ^ 118 + 35 - 22 + 63) < 0) {
                return;
            }
        }
        else {
            super.onBlockClicked(llllllllllllIlllIIlIlIIlIIllIlII, llllllllllllIlllIIlIlIIlIIllIIll);
        }
    }
    
    @Override
    public boolean tryHarvestBlock(final BlockPos llllllllllllIlllIIlIlIIlIIlIlIIl) {
        int tryHarvestBlock;
        if (lIIIllIIIlllIlIl(this.demoTimeExpired ? 1 : 0)) {
            tryHarvestBlock = DemoWorldManager.llIIlIIlIllIIl[3];
            "".length();
            if ((82 + 150 - 119 + 48 ^ 122 + 113 - 89 + 19) < 0) {
                return ((17 + 184 - 78 + 79 ^ 27 + 99 - 19 + 26) & (0xD2 ^ 0x8B ^ (0xA2 ^ 0xB4) ^ -" ".length())) != 0x0;
            }
        }
        else {
            tryHarvestBlock = (super.tryHarvestBlock(llllllllllllIlllIIlIlIIlIIlIlIIl) ? 1 : 0);
        }
        return tryHarvestBlock != 0;
    }
    
    private static boolean lIIIllIIIlllIlII(final int llllllllllllIlllIIlIlIIIllIllIlI) {
        return llllllllllllIlllIIlIlIIIllIllIlI > 0;
    }
    
    private void sendDemoReminder() {
        if (lIIIllIIIlllIIll(this.field_73104_e, DemoWorldManager.llIIlIIlIllIIl[4])) {
            this.thisPlayerMP.addChatMessage(new ChatComponentTranslation(DemoWorldManager.llIIlIIlIllIII[DemoWorldManager.llIIlIIlIllIIl[5]], new Object[DemoWorldManager.llIIlIIlIllIIl[3]]));
            this.field_73104_e = DemoWorldManager.llIIlIIlIllIIl[3];
        }
    }
    
    @Override
    public void updateBlockRemoving() {
        super.updateBlockRemoving();
        this.field_73102_f += DemoWorldManager.llIIlIIlIllIIl[0];
        final long llllllllllllIlllIIlIlIIlIlIIIIll = this.theWorld.getTotalWorldTime();
        final long llllllllllllIlllIIlIlIIlIlIIIIlI = llllllllllllIlllIIlIlIIlIlIIIIll / 24000L + 1L;
        if (lIIIllIIIlllIIlI(this.field_73105_c ? 1 : 0) && lIIIllIIIlllIIll(this.field_73102_f, DemoWorldManager.llIIlIIlIllIIl[1])) {
            this.field_73105_c = (DemoWorldManager.llIIlIIlIllIIl[0] != 0);
            this.thisPlayerMP.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(DemoWorldManager.llIIlIIlIllIIl[2], 0.0f));
        }
        int demoTimeExpired;
        if (lIIIllIIIlllIlII(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIll, 120500L))) {
            demoTimeExpired = DemoWorldManager.llIIlIIlIllIIl[0];
            "".length();
            if ("  ".length() < " ".length()) {
                return;
            }
        }
        else {
            demoTimeExpired = DemoWorldManager.llIIlIIlIllIIl[3];
        }
        this.demoTimeExpired = (demoTimeExpired != 0);
        if (lIIIllIIIlllIlIl(this.demoTimeExpired ? 1 : 0)) {
            this.field_73104_e += DemoWorldManager.llIIlIIlIllIIl[0];
        }
        if (lIIIllIIIlllIIlI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIll % 24000L, 500L))) {
            if (lIIIllIIIlllIllI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIlI, 6L))) {
                this.thisPlayerMP.addChatMessage(new ChatComponentTranslation(String.valueOf(new StringBuilder(DemoWorldManager.llIIlIIlIllIII[DemoWorldManager.llIIlIIlIllIIl[3]]).append(llllllllllllIlllIIlIlIIlIlIIIIlI)), new Object[DemoWorldManager.llIIlIIlIllIIl[3]]));
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
        }
        else if (lIIIllIIIlllIIlI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIlI, 1L))) {
            if (lIIIllIIIlllIIlI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIll, 100L))) {
                this.thisPlayerMP.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(DemoWorldManager.llIIlIIlIllIIl[2], 101.0f));
                "".length();
                if (((0x87 ^ 0x9A ^ (0x1C ^ 0x4B)) & (155 + 209 - 228 + 106 ^ 182 + 69 - 239 + 172 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (lIIIllIIIlllIIlI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIll, 175L))) {
                this.thisPlayerMP.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(DemoWorldManager.llIIlIIlIllIIl[2], 102.0f));
                "".length();
                if (" ".length() > " ".length()) {
                    return;
                }
            }
            else if (lIIIllIIIlllIIlI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIll, 250L))) {
                this.thisPlayerMP.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(DemoWorldManager.llIIlIIlIllIIl[2], 103.0f));
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else if (lIIIllIIIlllIIlI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIlI, 5L)) && lIIIllIIIlllIIlI(lIIIllIIIlllIIIl(llllllllllllIlllIIlIlIIlIlIIIIll % 24000L, 22000L))) {
            this.thisPlayerMP.addChatMessage(new ChatComponentTranslation(DemoWorldManager.llIIlIIlIllIII[DemoWorldManager.llIIlIIlIllIIl[0]], new Object[DemoWorldManager.llIIlIIlIllIIl[3]]));
        }
    }
    
    private static String lIIIllIIIllIllIl(final String llllllllllllIlllIIlIlIIIlllIlIll, final String llllllllllllIlllIIlIlIIIlllIlIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlIIIlllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlIIIlllIlIII.getBytes(StandardCharsets.UTF_8)), DemoWorldManager.llIIlIIlIllIIl[7]), "DES");
            final Cipher llllllllllllIlllIIlIlIIIlllIllIl = Cipher.getInstance("DES");
            llllllllllllIlllIIlIlIIIlllIllIl.init(DemoWorldManager.llIIlIIlIllIIl[5], llllllllllllIlllIIlIlIIIlllIlllI);
            return new String(llllllllllllIlllIIlIlIIIlllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlIIIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlIIIlllIllII) {
            llllllllllllIlllIIlIlIIIlllIllII.printStackTrace();
            return null;
        }
    }
}
