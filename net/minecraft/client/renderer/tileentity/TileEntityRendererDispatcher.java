// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityEndPortal;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.tileentity.TileEntitySign;
import com.google.common.collect.Maps;
import net.minecraft.util.BlockPos;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.tileentity.TileEntity;
import java.util.Map;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.TextureManager;

public class TileEntityRendererDispatcher
{
    private static final /* synthetic */ int[] lllIIIlIlIIllI;
    private static final /* synthetic */ String[] lllIIIlIlIIlIl;
    public static /* synthetic */ double staticPlayerY;
    public /* synthetic */ TextureManager renderEngine;
    public /* synthetic */ double entityX;
    public /* synthetic */ World worldObj;
    public static /* synthetic */ double staticPlayerX;
    public /* synthetic */ Entity entity;
    public /* synthetic */ double entityY;
    public /* synthetic */ float entityPitch;
    private /* synthetic */ FontRenderer fontRenderer;
    public /* synthetic */ double entityZ;
    public static /* synthetic */ TileEntityRendererDispatcher instance;
    public static /* synthetic */ double staticPlayerZ;
    public /* synthetic */ float entityYaw;
    private /* synthetic */ Map<Class<? extends TileEntity>, TileEntitySpecialRenderer<? extends TileEntity>> mapSpecialRenderers;
    
    private static void lIIlllIlIllIIIIl() {
        (lllIIIlIlIIlIl = new String[TileEntityRendererDispatcher.lllIIIlIlIIllI[4]])[TileEntityRendererDispatcher.lllIIIlIlIIllI[0]] = lIIlllIlIlIlllll("7OD4CzsKo4HsX4vbxBk9iMb+YWv2YJZV", "IlAYm");
        TileEntityRendererDispatcher.lllIIIlIlIIlIl[TileEntityRendererDispatcher.lllIIIlIlIIllI[3]] = lIIlllIlIllIIIII("FSY/BBF3Dz4TEyMzcCMfIys5Cwk=", "WJPgz");
    }
    
    private static void lIIlllIlIllIIIlI() {
        (lllIIIlIlIIllI = new int[6])[0] = ((0xE5 ^ 0xAF) & ~(0x8B ^ 0xC1));
        TileEntityRendererDispatcher.lllIIIlIlIIllI[1] = (-(0xFFFFDFD7 & 0x7BAB) & (0xFFFFDBAF & 0x17FD2));
        TileEntityRendererDispatcher.lllIIIlIlIIllI[2] = -" ".length();
        TileEntityRendererDispatcher.lllIIIlIlIIllI[3] = " ".length();
        TileEntityRendererDispatcher.lllIIIlIlIIllI[4] = "  ".length();
        TileEntityRendererDispatcher.lllIIIlIlIIllI[5] = (0x97 ^ 0x9F);
    }
    
    public void renderTileEntity(final TileEntity llllllllllllIllIIIIIlIIllIlIlIll, final float llllllllllllIllIIIIIlIIllIlIIIlI, final int llllllllllllIllIIIIIlIIllIlIlIIl) {
        if (lIIlllIlIllIIlll(lIIlllIlIllIIllI(llllllllllllIllIIIIIlIIllIlIlIll.getDistanceSq(this.entityX, this.entityY, this.entityZ), llllllllllllIllIIIIIlIIllIlIlIll.getMaxRenderDistanceSquared()))) {
            final int llllllllllllIllIIIIIlIIllIlIlIII = this.worldObj.getCombinedLight(llllllllllllIllIIIIIlIIllIlIlIll.getPos(), TileEntityRendererDispatcher.lllIIIlIlIIllI[0]);
            final int llllllllllllIllIIIIIlIIllIlIIlll = llllllllllllIllIIIIIlIIllIlIlIII % TileEntityRendererDispatcher.lllIIIlIlIIllI[1];
            final int llllllllllllIllIIIIIlIIllIlIIllI = llllllllllllIllIIIIIlIIllIlIlIII / TileEntityRendererDispatcher.lllIIIlIlIIllI[1];
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIllIIIIIlIIllIlIIlll / 1.0f, llllllllllllIllIIIIIlIIllIlIIllI / 1.0f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            final BlockPos llllllllllllIllIIIIIlIIllIlIIlIl = llllllllllllIllIIIIIlIIllIlIlIll.getPos();
            this.renderTileEntityAt(llllllllllllIllIIIIIlIIllIlIlIll, llllllllllllIllIIIIIlIIllIlIIlIl.getX() - TileEntityRendererDispatcher.staticPlayerX, llllllllllllIllIIIIIlIIllIlIIlIl.getY() - TileEntityRendererDispatcher.staticPlayerY, llllllllllllIllIIIIIlIIllIlIIlIl.getZ() - TileEntityRendererDispatcher.staticPlayerZ, llllllllllllIllIIIIIlIIllIlIIIlI, llllllllllllIllIIIIIlIIllIlIlIIl);
        }
    }
    
    private static boolean lIIlllIlIllIIlll(final int llllllllllllIllIIIIIlIIlIIlIllII) {
        return llllllllllllIllIIIIIlIIlIIlIllII < 0;
    }
    
    private static boolean lIIlllIlIllIIIll(final int llllllllllllIllIIIIIlIIlIIlIlllI) {
        return llllllllllllIllIIIIIlIIlIIlIlllI == 0;
    }
    
    public void renderTileEntityAt(final TileEntity llllllllllllIllIIIIIlIIllIIIllll, final double llllllllllllIllIIIIIlIIllIIIlllI, final double llllllllllllIllIIIIIlIIllIIlIIll, final double llllllllllllIllIIIIIlIIllIIIllII, final float llllllllllllIllIIIIIlIIllIIlIIIl) {
        this.renderTileEntityAt(llllllllllllIllIIIIIlIIllIIIllll, llllllllllllIllIIIIIlIIllIIIlllI, llllllllllllIllIIIIIlIIllIIlIIll, llllllllllllIllIIIIIlIIllIIIllII, llllllllllllIllIIIIIlIIllIIlIIIl, TileEntityRendererDispatcher.lllIIIlIlIIllI[2]);
    }
    
    public void cacheActiveRenderInfo(final World llllllllllllIllIIIIIlIIllIllllll, final TextureManager llllllllllllIllIIIIIlIIllIlllIII, final FontRenderer llllllllllllIllIIIIIlIIllIllllIl, final Entity llllllllllllIllIIIIIlIIllIllllII, final float llllllllllllIllIIIIIlIIllIllIlIl) {
        if (lIIlllIlIllIIlIl(this.worldObj, llllllllllllIllIIIIIlIIllIllllll)) {
            this.setWorld(llllllllllllIllIIIIIlIIllIllllll);
        }
        this.renderEngine = llllllllllllIllIIIIIlIIllIlllIII;
        this.entity = llllllllllllIllIIIIIlIIllIllllII;
        this.fontRenderer = llllllllllllIllIIIIIlIIllIllllIl;
        this.entityYaw = llllllllllllIllIIIIIlIIllIllllII.prevRotationYaw + (llllllllllllIllIIIIIlIIllIllllII.rotationYaw - llllllllllllIllIIIIIlIIllIllllII.prevRotationYaw) * llllllllllllIllIIIIIlIIllIllIlIl;
        this.entityPitch = llllllllllllIllIIIIIlIIllIllllII.prevRotationPitch + (llllllllllllIllIIIIIlIIllIllllII.rotationPitch - llllllllllllIllIIIIIlIIllIllllII.prevRotationPitch) * llllllllllllIllIIIIIlIIllIllIlIl;
        this.entityX = llllllllllllIllIIIIIlIIllIllllII.lastTickPosX + (llllllllllllIllIIIIIlIIllIllllII.posX - llllllllllllIllIIIIIlIIllIllllII.lastTickPosX) * llllllllllllIllIIIIIlIIllIllIlIl;
        this.entityY = llllllllllllIllIIIIIlIIllIllllII.lastTickPosY + (llllllllllllIllIIIIIlIIllIllllII.posY - llllllllllllIllIIIIIlIIllIllllII.lastTickPosY) * llllllllllllIllIIIIIlIIllIllIlIl;
        this.entityZ = llllllllllllIllIIIIIlIIllIllllII.lastTickPosZ + (llllllllllllIllIIIIIlIIllIllllII.posZ - llllllllllllIllIIIIIlIIllIllllII.lastTickPosZ) * llllllllllllIllIIIIIlIIllIllIlIl;
    }
    
    private TileEntityRendererDispatcher() {
        this.mapSpecialRenderers = (Map<Class<? extends TileEntity>, TileEntitySpecialRenderer<? extends TileEntity>>)Maps.newHashMap();
        this.mapSpecialRenderers.put(TileEntitySign.class, new TileEntitySignRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityMobSpawner.class, new TileEntityMobSpawnerRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityPiston.class, new TileEntityPistonRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityChest.class, new TileEntityChestRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityEnderChest.class, new TileEntityEnderChestRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityEnchantmentTable.class, new TileEntityEnchantmentTableRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityEndPortal.class, new TileEntityEndPortalRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityBeacon.class, new TileEntityBeaconRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntitySkull.class, new TileEntitySkullRenderer());
        "".length();
        this.mapSpecialRenderers.put(TileEntityBanner.class, new TileEntityBannerRenderer());
        "".length();
        final long llllllllllllIllIIIIIlIIlllIlIllI = (long)this.mapSpecialRenderers.values().iterator();
        "".length();
        if ("   ".length() < "  ".length()) {
            throw null;
        }
        while (!lIIlllIlIllIIIll(((Iterator)llllllllllllIllIIIIIlIIlllIlIllI).hasNext() ? 1 : 0)) {
            final TileEntitySpecialRenderer<?> llllllllllllIllIIIIIlIIlllIllIIl = ((Iterator<TileEntitySpecialRenderer<?>>)llllllllllllIllIIIIIlIIlllIlIllI).next();
            llllllllllllIllIIIIIlIIlllIllIIl.setRendererDispatcher(this);
        }
    }
    
    private static String lIIlllIlIllIIIII(String llllllllllllIllIIIIIlIIlIlIlIllI, final String llllllllllllIllIIIIIlIIlIlIlIlIl) {
        llllllllllllIllIIIIIlIIlIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIlIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIlIIlIlIlIlII = new StringBuilder();
        final char[] llllllllllllIllIIIIIlIIlIlIlIIll = llllllllllllIllIIIIIlIIlIlIlIlIl.toCharArray();
        int llllllllllllIllIIIIIlIIlIlIlIIlI = TileEntityRendererDispatcher.lllIIIlIlIIllI[0];
        final short llllllllllllIllIIIIIlIIlIlIIllII = (Object)llllllllllllIllIIIIIlIIlIlIlIllI.toCharArray();
        final boolean llllllllllllIllIIIIIlIIlIlIIlIll = llllllllllllIllIIIIIlIIlIlIIllII.length != 0;
        byte llllllllllllIllIIIIIlIIlIlIIlIlI = (byte)TileEntityRendererDispatcher.lllIIIlIlIIllI[0];
        while (lIIlllIlIllIlIIl(llllllllllllIllIIIIIlIIlIlIIlIlI, llllllllllllIllIIIIIlIIlIlIIlIll ? 1 : 0)) {
            final char llllllllllllIllIIIIIlIIlIlIlIlll = llllllllllllIllIIIIIlIIlIlIIllII[llllllllllllIllIIIIIlIIlIlIIlIlI];
            llllllllllllIllIIIIIlIIlIlIlIlII.append((char)(llllllllllllIllIIIIIlIIlIlIlIlll ^ llllllllllllIllIIIIIlIIlIlIlIIll[llllllllllllIllIIIIIlIIlIlIlIIlI % llllllllllllIllIIIIIlIIlIlIlIIll.length]));
            "".length();
            ++llllllllllllIllIIIIIlIIlIlIlIIlI;
            ++llllllllllllIllIIIIIlIIlIlIIlIlI;
            "".length();
            if ((0xC6 ^ 0xC3) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIlIIlIlIlIlII);
    }
    
    private static boolean lIIlllIlIllIIlII(final Object llllllllllllIllIIIIIlIIlIIllIIII) {
        return llllllllllllIllIIIIIlIIlIIllIIII == null;
    }
    
    private static boolean lIIlllIlIllIlIII(final Object llllllllllllIllIIIIIlIIlIIllIIlI) {
        return llllllllllllIllIIIIIlIIlIIllIIlI != null;
    }
    
    public FontRenderer getFontRenderer() {
        return this.fontRenderer;
    }
    
    private static int lIIlllIlIllIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        lIIlllIlIllIIIlI();
        lIIlllIlIllIIIIl();
        TileEntityRendererDispatcher.instance = new TileEntityRendererDispatcher();
    }
    
    private static boolean lIIlllIlIllIIlIl(final Object llllllllllllIllIIIIIlIIlIIllIlIl, final Object llllllllllllIllIIIIIlIIlIIllIlII) {
        return llllllllllllIllIIIIIlIIlIIllIlIl != llllllllllllIllIIIIIlIIlIIllIlII;
    }
    
    public void setWorld(final World llllllllllllIllIIIIIlIIlIllIIlII) {
        this.worldObj = llllllllllllIllIIIIIlIIlIllIIlII;
    }
    
    private static boolean lIIlllIlIllIlIIl(final int llllllllllllIllIIIIIlIIlIIlllIIl, final int llllllllllllIllIIIIIlIIlIIlllIII) {
        return llllllllllllIllIIIIIlIIlIIlllIIl < llllllllllllIllIIIIIlIIlIIlllIII;
    }
    
    public void renderTileEntityAt(final TileEntity llllllllllllIllIIIIIlIIlIllllllI, final double llllllllllllIllIIIIIlIIlIlllllIl, final double llllllllllllIllIIIIIlIIlIlllIIIl, final double llllllllllllIllIIIIIlIIlIllllIll, final float llllllllllllIllIIIIIlIIlIllllIlI, final int llllllllllllIllIIIIIlIIlIllllIIl) {
        final TileEntitySpecialRenderer<TileEntity> llllllllllllIllIIIIIlIIlIllllIII = this.getSpecialRenderer(llllllllllllIllIIIIIlIIlIllllllI);
        if (lIIlllIlIllIlIII(llllllllllllIllIIIIIlIIlIllllIII)) {
            try {
                llllllllllllIllIIIIIlIIlIllllIII.renderTileEntityAt(llllllllllllIllIIIIIlIIlIllllllI, llllllllllllIllIIIIIlIIlIlllllIl, llllllllllllIllIIIIIlIIlIlllIIIl, llllllllllllIllIIIIIlIIlIllllIll, llllllllllllIllIIIIIlIIlIllllIlI, llllllllllllIllIIIIIlIIlIllllIIl);
                "".length();
                if ((62 + 20 - 5 + 71 ^ 54 + 51 + 15 + 24) < ((0xDC ^ 0xA2 ^ (0x51 ^ 0x63)) & (0xB3 ^ 0xBB ^ (0x17 ^ 0x53) ^ -" ".length()))) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIIIIIlIIlIlllIlll) {
                final CrashReport llllllllllllIllIIIIIlIIlIlllIllI = CrashReport.makeCrashReport(llllllllllllIllIIIIIlIIlIlllIlll, TileEntityRendererDispatcher.lllIIIlIlIIlIl[TileEntityRendererDispatcher.lllIIIlIlIIllI[0]]);
                final CrashReportCategory llllllllllllIllIIIIIlIIlIlllIlIl = llllllllllllIllIIIIIlIIlIlllIllI.makeCategory(TileEntityRendererDispatcher.lllIIIlIlIIlIl[TileEntityRendererDispatcher.lllIIIlIlIIllI[3]]);
                llllllllllllIllIIIIIlIIlIllllllI.addInfoToCrashReport(llllllllllllIllIIIIIlIIlIlllIlIl);
                throw new ReportedException(llllllllllllIllIIIIIlIIlIlllIllI);
            }
        }
    }
    
    public <T extends TileEntity> TileEntitySpecialRenderer<T> getSpecialRendererByClass(final Class<? extends TileEntity> llllllllllllIllIIIIIlIIlllIlIIIl) {
        TileEntitySpecialRenderer<? extends TileEntity> llllllllllllIllIIIIIlIIlllIlIIII = this.mapSpecialRenderers.get(llllllllllllIllIIIIIlIIlllIlIIIl);
        if (lIIlllIlIllIIlII(llllllllllllIllIIIIIlIIlllIlIIII) && lIIlllIlIllIIlIl(llllllllllllIllIIIIIlIIlllIlIIIl, TileEntity.class)) {
            llllllllllllIllIIIIIlIIlllIlIIII = this.getSpecialRendererByClass((Class<? extends TileEntity>)llllllllllllIllIIIIIlIIlllIlIIIl.getSuperclass());
            this.mapSpecialRenderers.put(llllllllllllIllIIIIIlIIlllIlIIIl, llllllllllllIllIIIIIlIIlllIlIIII);
            "".length();
        }
        return (TileEntitySpecialRenderer<T>)llllllllllllIllIIIIIlIIlllIlIIII;
    }
    
    private static String lIIlllIlIlIlllll(final String llllllllllllIllIIIIIlIIlIlIIIIIl, final String llllllllllllIllIIIIIlIIlIIlllllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIlIIlIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIlIIlIIlllllI.getBytes(StandardCharsets.UTF_8)), TileEntityRendererDispatcher.lllIIIlIlIIllI[5]), "DES");
            final Cipher llllllllllllIllIIIIIlIIlIlIIIIll = Cipher.getInstance("DES");
            llllllllllllIllIIIIIlIIlIlIIIIll.init(TileEntityRendererDispatcher.lllIIIlIlIIllI[4], llllllllllllIllIIIIIlIIlIlIIIlII);
            return new String(llllllllllllIllIIIIIlIIlIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIlIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIlIIlIlIIIIlI) {
            llllllllllllIllIIIIIlIIlIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    public <T extends TileEntity> TileEntitySpecialRenderer<T> getSpecialRenderer(final TileEntity llllllllllllIllIIIIIlIIlllIIIlll) {
        TileEntitySpecialRenderer<T> specialRendererByClass;
        if (lIIlllIlIllIIlII(llllllllllllIllIIIIIlIIlllIIIlll)) {
            specialRendererByClass = null;
            "".length();
            if ((0x79 ^ 0x55 ^ (0x30 ^ 0x18)) <= "   ".length()) {
                return null;
            }
        }
        else {
            specialRendererByClass = this.getSpecialRendererByClass(llllllllllllIllIIIIIlIIlllIIIlll.getClass());
        }
        return specialRendererByClass;
    }
}
