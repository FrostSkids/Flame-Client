// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityHanging;

public class EntityPainting extends EntityHanging
{
    public /* synthetic */ EnumArt art;
    private static final /* synthetic */ String[] llIIIIlIIIlIlI;
    private static final /* synthetic */ int[] llIIIIlIIlIIll;
    
    private static boolean lIIIIllllIlllllI(final int llllllllllllIlllIlllIIIIllllIlll, final int llllllllllllIlllIlllIIIIllllIllI) {
        return llllllllllllIlllIlllIIIIllllIlll < llllllllllllIlllIlllIIIIllllIllI;
    }
    
    private static boolean lIIIIllllIllllII(final int llllllllllllIlllIlllIIIIllllIIII) {
        return llllllllllllIlllIlllIIIIllllIIII == 0;
    }
    
    @Override
    public void setPositionAndRotation2(final double llllllllllllIlllIlllIIIlIIlIIllI, final double llllllllllllIlllIlllIIIlIIlIlllI, final double llllllllllllIlllIlllIIIlIIlIIlII, final float llllllllllllIlllIlllIIIlIIlIllII, final float llllllllllllIlllIlllIIIlIIlIlIll, final int llllllllllllIlllIlllIIIlIIlIlIlI, final boolean llllllllllllIlllIlllIIIlIIlIlIIl) {
        final BlockPos llllllllllllIlllIlllIIIlIIlIlIII = this.hangingPosition.add(llllllllllllIlllIlllIIIlIIlIIllI - this.posX, llllllllllllIlllIlllIIIlIIlIlllI - this.posY, llllllllllllIlllIlllIIIlIIlIIlII - this.posZ);
        this.setPosition(llllllllllllIlllIlllIIIlIIlIlIII.getX(), llllllllllllIlllIlllIIIlIIlIlIII.getY(), llllllllllllIlllIlllIIIlIIlIlIII.getZ());
    }
    
    private static boolean lIIIIllllIlllIll(final int llllllllllllIlllIlllIIIIlllllIll, final int llllllllllllIlllIlllIIIIlllllIlI) {
        return llllllllllllIlllIlllIIIIlllllIll >= llllllllllllIlllIlllIIIIlllllIlI;
    }
    
    private static boolean lIIIIllllIlllIlI(final int llllllllllllIlllIlllIIIIllllIIlI) {
        return llllllllllllIlllIlllIIIIllllIIlI != 0;
    }
    
    private static String lIIIIllllIIIllIl(String llllllllllllIlllIlllIIIlIIIIIllI, final String llllllllllllIlllIlllIIIlIIIIIlIl) {
        llllllllllllIlllIlllIIIlIIIIIllI = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlllIIIlIIIIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllIIIlIIIIlIIl = new StringBuilder();
        final char[] llllllllllllIlllIlllIIIlIIIIlIII = llllllllllllIlllIlllIIIlIIIIIlIl.toCharArray();
        int llllllllllllIlllIlllIIIlIIIIIlll = EntityPainting.llIIIIlIIlIIll[0];
        final double llllllllllllIlllIlllIIIlIIIIIIIl = (Object)((String)llllllllllllIlllIlllIIIlIIIIIllI).toCharArray();
        final int llllllllllllIlllIlllIIIlIIIIIIII = llllllllllllIlllIlllIIIlIIIIIIIl.length;
        long llllllllllllIlllIlllIIIIllllllll = EntityPainting.llIIIIlIIlIIll[0];
        while (lIIIIllllIlllllI((int)llllllllllllIlllIlllIIIIllllllll, llllllllllllIlllIlllIIIlIIIIIIII)) {
            final char llllllllllllIlllIlllIIIlIIIIllII = llllllllllllIlllIlllIIIlIIIIIIIl[llllllllllllIlllIlllIIIIllllllll];
            llllllllllllIlllIlllIIIlIIIIlIIl.append((char)(llllllllllllIlllIlllIIIlIIIIllII ^ llllllllllllIlllIlllIIIlIIIIlIII[llllllllllllIlllIlllIIIlIIIIIlll % llllllllllllIlllIlllIIIlIIIIlIII.length]));
            "".length();
            ++llllllllllllIlllIlllIIIlIIIIIlll;
            ++llllllllllllIlllIlllIIIIllllllll;
            "".length();
            if ("  ".length() <= ((0xC1 ^ 0x9F) & ~(0x3A ^ 0x64))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllIIIlIIIIlIIl);
    }
    
    @Override
    public int getHeightPixels() {
        return this.art.sizeY;
    }
    
    @Override
    public void onBroken(final Entity llllllllllllIlllIlllIIIlIlIIlIll) {
        if (lIIIIllllIlllIlI(this.worldObj.getGameRules().getBoolean(EntityPainting.llIIIIlIIIlIlI[EntityPainting.llIIIIlIIlIIll[2]]) ? 1 : 0)) {
            if (lIIIIllllIlllIlI((llllllllllllIlllIlllIIIlIlIIlIll instanceof EntityPlayer) ? 1 : 0)) {
                final EntityPlayer llllllllllllIlllIlllIIIlIlIIlIlI = (EntityPlayer)llllllllllllIlllIlllIIIlIlIIlIll;
                if (lIIIIllllIlllIlI(llllllllllllIlllIlllIIIlIlIIlIlI.capabilities.isCreativeMode ? 1 : 0)) {
                    return;
                }
            }
            this.entityDropItem(new ItemStack(Items.painting), 0.0f);
            "".length();
        }
    }
    
    private static void lIIIIllllIllIlII() {
        (llIIIIlIIIlIlI = new String[EntityPainting.llIIIIlIIlIIll[3]])[EntityPainting.llIIIIlIIlIIll[0]] = lIIIIllllIIIllIl("JTw1DC4N", "hSAeX");
        EntityPainting.llIIIIlIIIlIlI[EntityPainting.llIIIIlIIlIIll[1]] = lIIIIllllIIIllIl("AB0DLzgo", "MrwFN");
        EntityPainting.llIIIIlIIIlIlI[EntityPainting.llIIIIlIIlIIll[2]] = lIIIIllllIIIlllI("8M0ISsFSNIYw69KYbKFnJA==", "xPvls");
    }
    
    public EntityPainting(final World llllllllllllIlllIlllIIIlIlllIlIl, final BlockPos llllllllllllIlllIlllIIIlIllllIlI, final EnumFacing llllllllllllIlllIlllIIIlIllllIIl, final String llllllllllllIlllIlllIIIlIllllIII) {
        this(llllllllllllIlllIlllIIIlIlllIlIl, llllllllllllIlllIlllIIIlIllllIlI, llllllllllllIlllIlllIIIlIllllIIl);
        final char llllllllllllIlllIlllIIIlIllIlllI;
        final String llllllllllllIlllIlllIIIlIllIllll = (String)((EnumArt[])(Object)(llllllllllllIlllIlllIIIlIllIlllI = (char)(Object)EnumArt.values())).length;
        String llllllllllllIlllIlllIIIlIlllIIII = (String)EntityPainting.llIIIIlIIlIIll[0];
        "".length();
        if ("  ".length() == 0) {
            throw null;
        }
        while (!lIIIIllllIlllIll((int)llllllllllllIlllIlllIIIlIlllIIII, (int)llllllllllllIlllIlllIIIlIllIllll)) {
            final EnumArt llllllllllllIlllIlllIIIlIlllIlll = llllllllllllIlllIlllIIIlIllIlllI[llllllllllllIlllIlllIIIlIlllIIII];
            if (lIIIIllllIlllIlI(llllllllllllIlllIlllIIIlIlllIlll.title.equals(llllllllllllIlllIlllIIIlIllllIII) ? 1 : 0)) {
                this.art = llllllllllllIlllIlllIIIlIlllIlll;
                "".length();
                if (-"   ".length() > 0) {
                    throw null;
                }
                break;
            }
            else {
                ++llllllllllllIlllIlllIIIlIlllIIII;
            }
        }
        this.updateFacingWithBoundingBox(llllllllllllIlllIlllIIIlIllllIIl);
    }
    
    private static boolean lIIIIllllIllllIl(final Object llllllllllllIlllIlllIIIIllllIlII) {
        return llllllllllllIlllIlllIIIIllllIlII == null;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlllIlllIIIlIllIlIlI) {
        llllllllllllIlllIlllIIIlIllIlIlI.setString(EntityPainting.llIIIIlIIIlIlI[EntityPainting.llIIIIlIIlIIll[0]], this.art.title);
        super.writeEntityToNBT(llllllllllllIlllIlllIIIlIllIlIlI);
    }
    
    @Override
    public int getWidthPixels() {
        return this.art.sizeX;
    }
    
    static {
        lIIIIllllIlllIIl();
        lIIIIllllIllIlII();
    }
    
    private static void lIIIIllllIlllIIl() {
        (llIIIIlIIlIIll = new int[4])[0] = ((0x16 ^ 0x4C) & ~(0x2 ^ 0x58));
        EntityPainting.llIIIIlIIlIIll[1] = " ".length();
        EntityPainting.llIIIIlIIlIIll[2] = "  ".length();
        EntityPainting.llIIIIlIIlIIll[3] = "   ".length();
    }
    
    public EntityPainting(final World llllllllllllIlllIlllIIIllIIlIIll, final BlockPos llllllllllllIlllIlllIIIllIIlIIlI, final EnumFacing llllllllllllIlllIlllIIIllIIlIIIl) {
        super(llllllllllllIlllIlllIIIllIIlIIll, llllllllllllIlllIlllIIIllIIlIIlI);
        final List<EnumArt> llllllllllllIlllIlllIIIllIIlIIII = (List<EnumArt>)Lists.newArrayList();
        final double llllllllllllIlllIlllIIIllIIIIllI;
        final long llllllllllllIlllIlllIIIllIIIIlll = ((EnumArt[])(Object)(llllllllllllIlllIlllIIIllIIIIllI = (double)(Object)EnumArt.values())).length;
        int llllllllllllIlllIlllIIIllIIIlIII = EntityPainting.llIIIIlIIlIIll[0];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lIIIIllllIlllIll(llllllllllllIlllIlllIIIllIIIlIII, (int)llllllllllllIlllIlllIIIllIIIIlll)) {
            final EnumArt llllllllllllIlllIlllIIIllIIIllll = llllllllllllIlllIlllIIIllIIIIllI[llllllllllllIlllIlllIIIllIIIlIII];
            this.art = llllllllllllIlllIlllIIIllIIIllll;
            this.updateFacingWithBoundingBox(llllllllllllIlllIlllIIIllIIlIIIl);
            if (lIIIIllllIlllIlI(this.onValidSurface() ? 1 : 0)) {
                llllllllllllIlllIlllIIIllIIlIIII.add(llllllllllllIlllIlllIIIllIIIllll);
                "".length();
            }
            ++llllllllllllIlllIlllIIIllIIIlIII;
        }
        if (lIIIIllllIllllII(llllllllllllIlllIlllIIIllIIlIIII.isEmpty() ? 1 : 0)) {
            this.art = llllllllllllIlllIlllIIIllIIlIIII.get(this.rand.nextInt(llllllllllllIlllIlllIIIllIIlIIII.size()));
        }
        this.updateFacingWithBoundingBox(llllllllllllIlllIlllIIIllIIlIIIl);
    }
    
    private static String lIIIIllllIIIlllI(final String llllllllllllIlllIlllIIIlIIIllIll, final String llllllllllllIlllIlllIIIlIIIllIII) {
        try {
            final SecretKeySpec llllllllllllIlllIlllIIIlIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIIIlIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlllIIIlIIIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlllIIIlIIIlllIl.init(EntityPainting.llIIIIlIIlIIll[2], llllllllllllIlllIlllIIIlIIIllllI);
            return new String(llllllllllllIlllIlllIIIlIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIIIlIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllIIIlIIIlllII) {
            llllllllllllIlllIlllIIIlIIIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setLocationAndAngles(final double llllllllllllIlllIlllIIIlIIlllIIl, final double llllllllllllIlllIlllIIIlIIllllll, final double llllllllllllIlllIlllIIIlIIlllllI, final float llllllllllllIlllIlllIIIlIIllllIl, final float llllllllllllIlllIlllIIIlIIllllII) {
        final BlockPos llllllllllllIlllIlllIIIlIIlllIll = this.hangingPosition.add(llllllllllllIlllIlllIIIlIIlllIIl - this.posX, llllllllllllIlllIlllIIIlIIllllll - this.posY, llllllllllllIlllIlllIIIlIIlllllI - this.posZ);
        this.setPosition(llllllllllllIlllIlllIIIlIIlllIll.getX(), llllllllllllIlllIlllIIIlIIlllIll.getY(), llllllllllllIlllIlllIIIlIIlllIll.getZ());
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlllIlllIIIlIlIllIll) {
        final String llllllllllllIlllIlllIIIlIlIllllI = llllllllllllIlllIlllIIIlIlIllIll.getString(EntityPainting.llIIIIlIIIlIlI[EntityPainting.llIIIIlIIlIIll[1]]);
        final byte llllllllllllIlllIlllIIIlIlIlIllI;
        final long llllllllllllIlllIlllIIIlIlIlIlll = ((EnumArt[])(Object)(llllllllllllIlllIlllIIIlIlIlIllI = (byte)(Object)EnumArt.values())).length;
        int llllllllllllIlllIlllIIIlIlIllIII = EntityPainting.llIIIIlIIlIIll[0];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return;
        }
        while (!lIIIIllllIlllIll(llllllllllllIlllIlllIIIlIlIllIII, (int)llllllllllllIlllIlllIIIlIlIlIlll)) {
            final EnumArt llllllllllllIlllIlllIIIlIlIlllIl = llllllllllllIlllIlllIIIlIlIlIllI[llllllllllllIlllIlllIIIlIlIllIII];
            if (lIIIIllllIlllIlI(llllllllllllIlllIlllIIIlIlIlllIl.title.equals(llllllllllllIlllIlllIIIlIlIllllI) ? 1 : 0)) {
                this.art = llllllllllllIlllIlllIIIlIlIlllIl;
            }
            ++llllllllllllIlllIlllIIIlIlIllIII;
        }
        if (lIIIIllllIllllIl(this.art)) {
            this.art = EnumArt.KEBAB;
        }
        super.readEntityFromNBT(llllllllllllIlllIlllIIIlIlIllIll);
    }
    
    public EntityPainting(final World llllllllllllIlllIlllIIIllIlIIIII) {
        super(llllllllllllIlllIlllIIIllIlIIIII);
    }
    
    public enum EnumArt
    {
        AZTEC_2(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[8]], EnumArt.llIlIlIllIlIIl[4], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[9]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[10], EnumArt.llIlIlIllIlIIl[0]), 
        MATCH(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[34]], EnumArt.llIlIlIllIlIIl[20], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[35]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[0], EnumArt.llIlIlIllIlIIl[29]), 
        PLANT(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[14]], EnumArt.llIlIlIllIlIIl[6], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[15]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[16], EnumArt.llIlIlIllIlIIl[0]), 
        FIGHTERS(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[46]], EnumArt.llIlIlIllIlIIl[25], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[47]], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[0], EnumArt.llIlIlIllIlIIl[19]), 
        KEBAB(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[0]], EnumArt.llIlIlIllIlIIl[0], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[1]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[0], EnumArt.llIlIlIllIlIIl[0]), 
        SUNSET(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[25]], EnumArt.llIlIlIllIlIIl[14], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[26]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[19], EnumArt.llIlIlIllIlIIl[7]), 
        POINTER(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[48]], EnumArt.llIlIlIllIlIIl[26], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[49]], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[0], EnumArt.llIlIlIllIlIIl[50]), 
        WANDERER(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[30]], EnumArt.llIlIlIllIlIIl[17], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[31]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[0], EnumArt.llIlIlIllIlIIl[13]), 
        DONKEY_KONG(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[56]], EnumArt.llIlIlIllIlIIl[31], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[57]], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[10], EnumArt.llIlIlIllIlIIl[50], EnumArt.llIlIlIllIlIIl[58]);
        
        private static final /* synthetic */ int[] llIlIlIllIlIIl;
        public final /* synthetic */ int offsetX;
        
        SEA(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[23]], EnumArt.llIlIlIllIlIIl[12], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[24]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[7]), 
        POOL(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[20]], EnumArt.llIlIlIllIlIIl[9], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[21]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[0], EnumArt.llIlIlIllIlIIl[7]), 
        SKULL_AND_ROSES(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[41]], EnumArt.llIlIlIllIlIIl[23], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[42]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[29], EnumArt.llIlIlIllIlIIl[29]), 
        PIGSCENE(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[51]], EnumArt.llIlIlIllIlIIl[27], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[52]], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[50]), 
        BUST(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[36]], EnumArt.llIlIlIllIlIIl[21], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[37]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[29]), 
        CREEBET(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[27]], EnumArt.llIlIlIllIlIIl[15], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[28]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[29], EnumArt.llIlIlIllIlIIl[7]);
        
        public final /* synthetic */ int offsetY;
        
        BOMB(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[11]], EnumArt.llIlIlIllIlIIl[5], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[12]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[0]), 
        GRAHAM(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[32]], EnumArt.llIlIlIllIlIIl[18], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[33]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[13]);
        
        public final /* synthetic */ int sizeY;
        
        STAGE(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[7]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[38]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[29]), 
        SKELETON(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[10]], EnumArt.llIlIlIllIlIIl[30], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[55]], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[10], EnumArt.llIlIlIllIlIIl[50], EnumArt.llIlIlIllIlIIl[13]), 
        COURBET(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[2]], EnumArt.llIlIlIllIlIIl[11], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[22]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7]);
        
        public final /* synthetic */ String title;
        
        WASTELAND(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[17]], EnumArt.llIlIlIllIlIIl[8], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[18]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[19], EnumArt.llIlIlIllIlIIl[0]), 
        ALBAN(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[5]], EnumArt.llIlIlIllIlIIl[3], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[6]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[0]);
        
        public final /* synthetic */ int sizeX;
        
        BURNING_SKULL(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[53]], EnumArt.llIlIlIllIlIIl[28], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[54]], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[13], EnumArt.llIlIlIllIlIIl[29], EnumArt.llIlIlIllIlIIl[50]), 
        AZTEC(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[3]], EnumArt.llIlIlIllIlIIl[1], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[4]], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[2], EnumArt.llIlIlIllIlIIl[0]), 
        WITHER(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[43]], EnumArt.llIlIlIllIlIIl[24], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[44]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[45], EnumArt.llIlIlIllIlIIl[29]);
        
        private static final /* synthetic */ String[] llIlIlIllIIIlI;
        
        VOID(EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[39]], EnumArt.llIlIlIllIlIIl[22], EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[40]], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[7], EnumArt.llIlIlIllIlIIl[19], EnumArt.llIlIlIllIlIIl[29]);
        
        private EnumArt(final String llllllllllllIllIlIlIIIlIlIllIIlI, final int llllllllllllIllIlIlIIIlIlIllIIIl, final String llllllllllllIllIlIlIIIlIlIlllIII, final int llllllllllllIllIlIlIIIlIlIllIlll, final int llllllllllllIllIlIlIIIlIlIllIllI, final int llllllllllllIllIlIlIIIlIlIlIllIl, final int llllllllllllIllIlIlIIIlIlIllIlII) {
            this.title = llllllllllllIllIlIlIIIlIlIlllIII;
            this.sizeX = llllllllllllIllIlIlIIIlIlIllIlll;
            this.sizeY = llllllllllllIllIlIlIIIlIlIllIllI;
            this.offsetX = llllllllllllIllIlIlIIIlIlIlIllIl;
            this.offsetY = llllllllllllIllIlIlIIIlIlIllIlII;
        }
        
        private static String lIIlIlIIlIIIIIIl(String llllllllllllIllIlIlIIIlIIllllIlI, final String llllllllllllIllIlIlIIIlIIllllllI) {
            llllllllllllIllIlIlIIIlIIllllIlI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIIIlIIllllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlIIIlIIlllllIl = new StringBuilder();
            final char[] llllllllllllIllIlIlIIIlIIlllllII = llllllllllllIllIlIlIIIlIIllllllI.toCharArray();
            int llllllllllllIllIlIlIIIlIIllllIll = EnumArt.llIlIlIllIlIIl[0];
            final Exception llllllllllllIllIlIlIIIlIIlllIlIl = (Object)((String)llllllllllllIllIlIlIIIlIIllllIlI).toCharArray();
            final byte llllllllllllIllIlIlIIIlIIlllIlII = (byte)llllllllllllIllIlIlIIIlIIlllIlIl.length;
            byte llllllllllllIllIlIlIIIlIIlllIIll = (byte)EnumArt.llIlIlIllIlIIl[0];
            while (lIIlIlIIlIIllIlI(llllllllllllIllIlIlIIIlIIlllIIll, llllllllllllIllIlIlIIIlIIlllIlII)) {
                final char llllllllllllIllIlIlIIIlIlIIIIIII = llllllllllllIllIlIlIIIlIIlllIlIl[llllllllllllIllIlIlIIIlIIlllIIll];
                llllllllllllIllIlIlIIIlIIlllllIl.append((char)(llllllllllllIllIlIlIIIlIlIIIIIII ^ llllllllllllIllIlIlIIIlIIlllllII[llllllllllllIllIlIlIIIlIIllllIll % llllllllllllIllIlIlIIIlIIlllllII.length]));
                "".length();
                ++llllllllllllIllIlIlIIIlIIllllIll;
                ++llllllllllllIllIlIlIIIlIIlllIIll;
                "".length();
                if (((79 + 44 - 99 + 168 ^ 33 + 64 - 23 + 77) & (0xF3 ^ 0x95 ^ (0x6C ^ 0x5D) ^ -" ".length())) <= -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlIIIlIIlllllIl);
        }
        
        private static void lIIlIlIIlIIlIlll() {
            (llIlIlIllIIIlI = new String[EnumArt.llIlIlIllIlIIl[60]])[EnumArt.llIlIlIllIlIIl[0]] = lIIlIlIIlIIIIIII("FuHUu6/IV2Y=", "enFqE");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[1]] = lIIlIlIIlIIIIIIl("LjI0CyA=", "eWVjB");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[3]] = lIIlIlIIlIIIIIII("Ko1L5gpC8h4=", "yUOCy");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[4]] = lIIlIlIIlIIIIIlI("3Xgyr1Da5m0=", "NmpbH");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[5]] = lIIlIlIIlIIIIIII("VFC0tfacNTc=", "ZWMIU");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[6]] = lIIlIlIIlIIIIIlI("O72Phg43VkM=", "ajIYJ");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[8]] = lIIlIlIIlIIIIIIl("OT0jPzQnVQ==", "xgwzw");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[9]] = lIIlIlIIlIIIIIII("QtPmz2Mg9lM=", "FhPik");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[11]] = lIIlIlIIlIIIIIII("MuyMiMPk6hQ=", "QicDc");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[12]] = lIIlIlIIlIIIIIlI("fQhs1GvRXc4=", "MKZpn");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[14]] = lIIlIlIIlIIIIIII("l0GdCngILzw=", "XzFFm");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[15]] = lIIlIlIIlIIIIIII("uBsPYeo4NIw=", "TmfbP");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[17]] = lIIlIlIIlIIIIIIl("ERgXMhcKGAoi", "FYDfR");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[18]] = lIIlIlIIlIIIIIII("gSX1UxUnRSrBwofSWV8Faw==", "CbPBC");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[20]] = lIIlIlIIlIIIIIIl("IiwGHA==", "rcIPY");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[21]] = lIIlIlIIlIIIIIlI("HU8SyzCbdd8=", "WfZQh");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[2]] = lIIlIlIIlIIIIIIl("AAsPEyMGEA==", "CDZAa");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[22]] = lIIlIlIIlIIIIIlI("lT8OetcWnqA=", "XwFNY");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[23]] = lIIlIlIIlIIIIIlI("tHeI4M7C6G4=", "MjpFe");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[24]] = lIIlIlIIlIIIIIII("rbTl6N+iHDA=", "vHFDc");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[25]] = lIIlIlIIlIIIIIII("xr3p4ZkD/Po=", "gHICX");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[26]] = lIIlIlIIlIIIIIII("ii1NXGptOI8=", "ghScP");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[27]] = lIIlIlIIlIIIIIIl("IQIWEzonBA==", "bPSVx");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[28]] = lIIlIlIIlIIIIIlI("3fQUg0x0hE0=", "YvlQu");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[30]] = lIIlIlIIlIIIIIIl("IhQaES4nEAY=", "uUTUk");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[31]] = lIIlIlIIlIIIIIIl("PDg5KwgZPCU=", "kYWOm");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[32]] = lIIlIlIIlIIIIIII("zCRQgt0sGco=", "UQFhq");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[33]] = lIIlIlIIlIIIIIIl("FiMLCTA8", "QQjaQ");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[34]] = lIIlIlIIlIIIIIII("///jlx2Ru98=", "fiVTc");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[35]] = lIIlIlIIlIIIIIII("4PT4bx1tIhM=", "bWbET");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[36]] = lIIlIlIIlIIIIIlI("C0PTr1SNzyk=", "jMUEp");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[37]] = lIIlIlIIlIIIIIlI("A1RtOtNv8Uk=", "widmC");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[7]] = lIIlIlIIlIIIIIII("0VT4P14S0JI=", "XaMfn");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[38]] = lIIlIlIIlIIIIIII("APnLWrJcja4=", "FhTox");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[39]] = lIIlIlIIlIIIIIlI("imDXEwU2dfo=", "CtoNR");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[40]] = lIIlIlIIlIIIIIlI("YpRqvW0Qb40=", "iOPPP");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[41]] = lIIlIlIIlIIIIIlI("40HjmZ+MhX57Mt7mkaI8eA==", "ILqDj");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[42]] = lIIlIlIIlIIIIIII("xB40AqdcVCxv/BI01aKJIQ==", "mEfQc");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[43]] = lIIlIlIIlIIIIIII("4VKf77Psc3Y=", "FhHWT");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[44]] = lIIlIlIIlIIIIIlI("xLbXdjLr3KU=", "suSdK");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[46]] = lIIlIlIIlIIIIIII("0nmORx2n8uTn1UQF6Y49wQ==", "nYtFj");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[47]] = lIIlIlIIlIIIIIII("kmYSUkeYSSAZu+3VcF8nfw==", "FLVAj");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[48]] = lIIlIlIIlIIIIIlI("SfI3np5/VL8=", "AHyxg");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[49]] = lIIlIlIIlIIIIIIl("ExkDNxkmBA==", "CvjYm");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[51]] = lIIlIlIIlIIIIIII("PEV5+/bTFU3ygE9Qb9n1wQ==", "ZGzFF");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[52]] = lIIlIlIIlIIIIIlI("QeajBZEqJp3CbZwgjrALTw==", "QUrpa");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[53]] = lIIlIlIIlIIIIIII("TLyxToAeEkMj0DgH/giBPg==", "NstLT");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[54]] = lIIlIlIIlIIIIIlI("VPMin4wJ9qVLWtVw27cT+Q==", "NfGTE");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[10]] = lIIlIlIIlIIIIIlI("emMaM2/4Q5jdtMxM8xOwKA==", "nFJjf");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[55]] = lIIlIlIIlIIIIIIl("ND4XKR0TOhw=", "gUrEx");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[56]] = lIIlIlIIlIIIIIIl("MSUcJhIsNRkiGTI=", "ujRmW");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[57]] = lIIlIlIIlIIIIIII("rkFQQ2AChGzhfo7mJkBMwg==", "wJOrN");
            EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[59]] = lIIlIlIIlIIIIIII("SQR9nFZ01kSMPY8Pn44c8A==", "lRzon");
        }
        
        private static String lIIlIlIIlIIIIIlI(final String llllllllllllIllIlIlIIIlIlIIIllIl, final String llllllllllllIllIlIlIIIlIlIIIlllI) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIIIlIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIlIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIlIIIlIlIIlIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIlIIIlIlIIlIIIl.init(EnumArt.llIlIlIllIlIIl[3], llllllllllllIllIlIlIIIlIlIIlIIlI);
                return new String(llllllllllllIllIlIlIIIlIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIlIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIIIlIlIIlIIII) {
                llllllllllllIllIlIlIIIlIlIIlIIII.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlIlIIlIIllIIl() {
            (llIlIlIllIlIIl = new int[61])[0] = ((0x6E ^ 0x2D ^ (0x9F ^ 0xC2)) & (0x2E ^ 0x4F ^ 80 + 47 - 110 + 110 ^ -" ".length()));
            EnumArt.llIlIlIllIlIIl[1] = " ".length();
            EnumArt.llIlIlIllIlIIl[2] = (0x98 ^ 0xC4 ^ (0x23 ^ 0x6F));
            EnumArt.llIlIlIllIlIIl[3] = "  ".length();
            EnumArt.llIlIlIllIlIIl[4] = "   ".length();
            EnumArt.llIlIlIllIlIIl[5] = (0x91 ^ 0x95);
            EnumArt.llIlIlIllIlIIl[6] = (113 + 185 - 124 + 25 ^ 27 + 73 + 61 + 33);
            EnumArt.llIlIlIllIlIIl[7] = (0xB7 ^ 0x97);
            EnumArt.llIlIlIllIlIIl[8] = (0x1A ^ 0x1C);
            EnumArt.llIlIlIllIlIIl[9] = (0x21 ^ 0x47 ^ (0x22 ^ 0x43));
            EnumArt.llIlIlIllIlIIl[10] = (0xB ^ 0x3B);
            EnumArt.llIlIlIllIlIIl[11] = (0x8 ^ 0x2B ^ (0x9F ^ 0xB4));
            EnumArt.llIlIlIllIlIIl[12] = (0x90 ^ 0x83 ^ (0x92 ^ 0x88));
            EnumArt.llIlIlIllIlIIl[13] = (0x18 ^ 0x58);
            EnumArt.llIlIlIllIlIIl[14] = (0xC ^ 0x34 ^ (0x1B ^ 0x29));
            EnumArt.llIlIlIllIlIIl[15] = (0x6F ^ 0x64);
            EnumArt.llIlIlIllIlIIl[16] = (98 + 65 - 143 + 129 ^ 92 + 83 - 160 + 182);
            EnumArt.llIlIlIllIlIIl[17] = (0xA ^ 0x6);
            EnumArt.llIlIlIllIlIIl[18] = (64 + 90 - 27 + 22 ^ 60 + 70 - 8 + 30);
            EnumArt.llIlIlIllIlIIl[19] = (0xA1 ^ 0xC1);
            EnumArt.llIlIlIllIlIIl[20] = (0x90 ^ 0x9E);
            EnumArt.llIlIlIllIlIIl[21] = (54 + 47 - 48 + 77 ^ 81 + 29 + 18 + 13);
            EnumArt.llIlIlIllIlIIl[22] = (0xA ^ 0x1B);
            EnumArt.llIlIlIllIlIIl[23] = (0xA7 ^ 0xB5 ^ ((0xC5 ^ 0x8D) & ~(0x1D ^ 0x55)));
            EnumArt.llIlIlIllIlIIl[24] = (0x8D ^ 0x9E);
            EnumArt.llIlIlIllIlIIl[25] = (0xAB ^ 0x89 ^ (0xA5 ^ 0x93));
            EnumArt.llIlIlIllIlIIl[26] = (0xBB ^ 0x90 ^ (0xA8 ^ 0x96));
            EnumArt.llIlIlIllIlIIl[27] = (0x43 ^ 0x55);
            EnumArt.llIlIlIllIlIIl[28] = (6 + 88 - 77 + 126 ^ 126 + 30 - 98 + 94);
            EnumArt.llIlIlIllIlIIl[29] = 23 + 34 - 15 + 86;
            EnumArt.llIlIlIllIlIIl[30] = (0xC ^ 0x14);
            EnumArt.llIlIlIllIlIIl[31] = (0x98 ^ 0x81);
            EnumArt.llIlIlIllIlIIl[32] = (0x52 ^ 0x48);
            EnumArt.llIlIlIllIlIIl[33] = (0xA3 ^ 0xB8);
            EnumArt.llIlIlIllIlIIl[34] = (31 + 66 - 0 + 32 ^ 101 + 74 - 69 + 51);
            EnumArt.llIlIlIllIlIIl[35] = (0x16 ^ 0xB);
            EnumArt.llIlIlIllIlIIl[36] = (0x3 ^ 0x1D);
            EnumArt.llIlIlIllIlIIl[37] = (0x4F ^ 0x5 ^ (0x1F ^ 0x4A));
            EnumArt.llIlIlIllIlIIl[38] = (0x14 ^ 0x6D ^ (0xD2 ^ 0x8A));
            EnumArt.llIlIlIllIlIIl[39] = (23 + 119 - 110 + 101 ^ 135 + 59 - 111 + 84);
            EnumArt.llIlIlIllIlIIl[40] = (118 + 55 - 95 + 69 ^ 63 + 150 - 41 + 4);
            EnumArt.llIlIlIllIlIIl[41] = (0x36 ^ 0x12);
            EnumArt.llIlIlIllIlIIl[42] = (0xFC ^ 0x86 ^ (0xD7 ^ 0x88));
            EnumArt.llIlIlIllIlIIl[43] = (23 + 101 + 55 + 3 ^ 129 + 124 - 212 + 103);
            EnumArt.llIlIlIllIlIIl[44] = (0x1E ^ 0x11 ^ (0x1F ^ 0x37));
            EnumArt.llIlIlIllIlIIl[45] = 81 + 118 - 97 + 58;
            EnumArt.llIlIlIllIlIIl[46] = (0xC ^ 0x24);
            EnumArt.llIlIlIllIlIIl[47] = (0xAA ^ 0x83);
            EnumArt.llIlIlIllIlIIl[48] = (166 + 139 - 243 + 128 ^ 101 + 124 - 82 + 5);
            EnumArt.llIlIlIllIlIIl[49] = (0xED ^ 0x85 ^ (0x3 ^ 0x40));
            EnumArt.llIlIlIllIlIIl[50] = 83 + 173 - 82 + 18;
            EnumArt.llIlIlIllIlIIl[51] = (0x84 ^ 0xB7 ^ (0x58 ^ 0x47));
            EnumArt.llIlIlIllIlIIl[52] = (0x5F ^ 0x72);
            EnumArt.llIlIlIllIlIIl[53] = (0x7 ^ 0x73 ^ (0xFC ^ 0xA6));
            EnumArt.llIlIlIllIlIIl[54] = (0x9F ^ 0x90 ^ (0x2F ^ 0xF));
            EnumArt.llIlIlIllIlIIl[55] = (0x98 ^ 0xBE ^ (0xAA ^ 0xBD));
            EnumArt.llIlIlIllIlIIl[56] = (0x85 ^ 0xAC ^ (0xE ^ 0x15));
            EnumArt.llIlIlIllIlIIl[57] = (122 + 157 - 192 + 87 ^ 24 + 67 - 85 + 151);
            EnumArt.llIlIlIllIlIIl[58] = (0xEB ^ 0x81 ^ (0xB2 ^ 0xA8));
            EnumArt.llIlIlIllIlIIl[59] = (0x47 ^ 0x0 ^ (0xFE ^ 0x8D));
            EnumArt.llIlIlIllIlIIl[60] = (0x7F ^ 0x77 ^ (0x47 ^ 0x7A));
        }
        
        private static String lIIlIlIIlIIIIIII(final String llllllllllllIllIlIlIIIlIlIIlllII, final String llllllllllllIllIlIlIIIlIlIIllIll) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIIIlIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIlIlIIllIll.getBytes(StandardCharsets.UTF_8)), EnumArt.llIlIlIllIlIIl[11]), "DES");
                final Cipher llllllllllllIllIlIlIIIlIlIIllllI = Cipher.getInstance("DES");
                llllllllllllIllIlIlIIIlIlIIllllI.init(EnumArt.llIlIlIllIlIIl[3], llllllllllllIllIlIlIIIlIlIIlllll);
                return new String(llllllllllllIllIlIlIIIlIlIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIlIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIIIlIlIIlllIl) {
                llllllllllllIllIlIlIIIlIlIIlllIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlIlIIlIIllIlI(final int llllllllllllIllIlIlIIIlIIllIllll, final int llllllllllllIllIlIlIIIlIIllIlllI) {
            return llllllllllllIllIlIlIIIlIIllIllll < llllllllllllIllIlIlIIIlIIllIlllI;
        }
        
        static {
            lIIlIlIIlIIllIIl();
            lIIlIlIIlIIlIlll();
            final EnumArt[] enum$VALUES = new EnumArt[EnumArt.llIlIlIllIlIIl[32]];
            enum$VALUES[EnumArt.llIlIlIllIlIIl[0]] = EnumArt.KEBAB;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[1]] = EnumArt.AZTEC;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[3]] = EnumArt.ALBAN;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[4]] = EnumArt.AZTEC_2;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[5]] = EnumArt.BOMB;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[6]] = EnumArt.PLANT;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[8]] = EnumArt.WASTELAND;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[9]] = EnumArt.POOL;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[11]] = EnumArt.COURBET;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[12]] = EnumArt.SEA;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[14]] = EnumArt.SUNSET;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[15]] = EnumArt.CREEBET;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[17]] = EnumArt.WANDERER;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[18]] = EnumArt.GRAHAM;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[20]] = EnumArt.MATCH;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[21]] = EnumArt.BUST;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[2]] = EnumArt.STAGE;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[22]] = EnumArt.VOID;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[23]] = EnumArt.SKULL_AND_ROSES;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[24]] = EnumArt.WITHER;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[25]] = EnumArt.FIGHTERS;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[26]] = EnumArt.POINTER;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[27]] = EnumArt.PIGSCENE;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[28]] = EnumArt.BURNING_SKULL;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[30]] = EnumArt.SKELETON;
            enum$VALUES[EnumArt.llIlIlIllIlIIl[31]] = EnumArt.DONKEY_KONG;
            ENUM$VALUES = enum$VALUES;
            field_180001_A = EnumArt.llIlIlIllIIIlI[EnumArt.llIlIlIllIlIIl[59]].length();
        }
    }
}
