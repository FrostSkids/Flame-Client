// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import java.util.Iterator;
import net.minecraft.util.AxisAlignedBB;
import java.util.Collection;
import net.minecraft.init.Blocks;
import java.util.Arrays;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ITickable;

public class TileEntityPiston extends TileEntity implements ITickable
{
    private /* synthetic */ boolean extending;
    private /* synthetic */ IBlockState pistonState;
    private /* synthetic */ EnumFacing pistonFacing;
    private static final /* synthetic */ int[] lIIlIllIIIlIII;
    private /* synthetic */ boolean shouldHeadBeRendered;
    private /* synthetic */ float progress;
    private /* synthetic */ float lastProgress;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
    private static final /* synthetic */ String[] lIIlIllIIIIllI;
    private /* synthetic */ List<Entity> field_174933_k;
    
    private static boolean llIlIIIlllIIIIl(final int lllllllllllllIIllIIlIlIllIlIlllI) {
        return lllllllllllllIIllIIlIlIllIlIlllI > 0;
    }
    
    private static int llIlIIIlllIIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llIlIIIlllIIIll(final Object lllllllllllllIIllIIlIlIllIllllII) {
        return lllllllllllllIIllIIlIlIllIllllII != null;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIIllIIlIllIIIIlIIII) {
        super.writeToNBT(lllllllllllllIIllIIlIllIIIIlIIII);
        lllllllllllllIIllIIlIllIIIIlIIII.setInteger(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[5]], Block.getIdFromBlock(this.pistonState.getBlock()));
        lllllllllllllIIllIIlIllIIIIlIIII.setInteger(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[6]], this.pistonState.getBlock().getMetaFromState(this.pistonState));
        lllllllllllllIIllIIlIllIIIIlIIII.setInteger(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[7]], this.pistonFacing.getIndex());
        lllllllllllllIIllIIlIllIIIIlIIII.setFloat(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[8]], this.lastProgress);
        lllllllllllllIIllIIlIllIIIIlIIII.setBoolean(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[9]], this.extending);
    }
    
    private static boolean llIlIIIlllIIlII(final int lllllllllllllIIllIIlIlIllIllIlII) {
        return lllllllllllllIIllIIlIlIllIllIlII == 0;
    }
    
    public float getProgress(float lllllllllllllIIllIIlIllIIlIIlIlI) {
        if (llIlIIIlllIIIIl(llIlIIIlllIIIII(lllllllllllllIIllIIlIllIIlIIlIlI, 1.0f))) {
            lllllllllllllIIllIIlIllIIlIIlIlI = 1.0f;
        }
        return this.lastProgress + (this.progress - this.lastProgress) * lllllllllllllIIllIIlIllIIlIIlIlI;
    }
    
    private static boolean llIlIIIlllIIIlI(final int lllllllllllllIIllIIlIlIllIllIllI) {
        return lllllllllllllIIllIIlIlIllIllIllI != 0;
    }
    
    private static boolean llIlIIIlllIlIIl(final int lllllllllllllIIllIIlIlIllIllIIlI) {
        return lllllllllllllIIllIIlIlIllIllIIlI >= 0;
    }
    
    private static String llIlIIIllIlllIl(final String lllllllllllllIIllIIlIlIlllIlIIlI, final String lllllllllllllIIllIIlIlIlllIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIlIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIlIlllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIlIlllIlIllI.init(TileEntityPiston.lIIlIllIIIlIII[3], lllllllllllllIIllIIlIlIlllIlIlll);
            return new String(lllllllllllllIIllIIlIlIlllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIlIlllIlIlIl) {
            lllllllllllllIIllIIlIlIlllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public boolean shouldPistonHeadBeRendered() {
        return this.shouldHeadBeRendered;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIIllIIlIllIIIIllIlI) {
        super.readFromNBT(lllllllllllllIIllIIlIllIIIIllIlI);
        this.pistonState = Block.getBlockById(lllllllllllllIIllIIlIllIIIIllIlI.getInteger(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[0]])).getStateFromMeta(lllllllllllllIIllIIlIllIIIIllIlI.getInteger(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[2]]));
        this.pistonFacing = EnumFacing.getFront(lllllllllllllIIllIIlIllIIIIllIlI.getInteger(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[3]]));
        final float float1 = lllllllllllllIIllIIlIllIIIIllIlI.getFloat(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[1]]);
        this.progress = float1;
        this.lastProgress = float1;
        this.extending = lllllllllllllIIllIIlIllIIIIllIlI.getBoolean(TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[4]]);
    }
    
    static {
        llIlIIIllIlllll();
        llIlIIIllIllllI();
    }
    
    private static boolean llIlIIIlllIIlll(final int lllllllllllllIIllIIlIlIllIllIIII) {
        return lllllllllllllIIllIIlIlIllIllIIII < 0;
    }
    
    public TileEntityPiston(final IBlockState lllllllllllllIIllIIlIllIIllIIIII, final EnumFacing lllllllllllllIIllIIlIllIIllIIlII, final boolean lllllllllllllIIllIIlIllIIllIIIll, final boolean lllllllllllllIIllIIlIllIIlIlllIl) {
        this.field_174933_k = (List<Entity>)Lists.newArrayList();
        this.pistonState = lllllllllllllIIllIIlIllIIllIIIII;
        this.pistonFacing = lllllllllllllIIllIIlIllIIllIIlII;
        this.extending = lllllllllllllIIllIIlIllIIllIIIll;
        this.shouldHeadBeRendered = lllllllllllllIIllIIlIllIIlIlllIl;
    }
    
    private static String llIlIIIllIllIlI(final String lllllllllllllIIllIIlIlIlllIIIlll, final String lllllllllllllIIllIIlIlIlllIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIlIlllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIlIlllIIIllI.getBytes(StandardCharsets.UTF_8)), TileEntityPiston.lIIlIllIIIlIII[8]), "DES");
            final Cipher lllllllllllllIIllIIlIlIlllIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIlIlllIIlIIl.init(TileEntityPiston.lIIlIllIIIlIII[3], lllllllllllllIIllIIlIlIlllIIlIlI);
            return new String(lllllllllllllIIllIIlIlIlllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIlIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIlIlllIIlIII) {
            lllllllllllllIIllIIlIlIlllIIlIII.printStackTrace();
            return null;
        }
    }
    
    private void launchWithSlimeBlock(float lllllllllllllIIllIIlIllIIIlIlIIl, final float lllllllllllllIIllIIlIllIIIlIlIII) {
        if (llIlIIIlllIIIlI(this.extending ? 1 : 0)) {
            lllllllllllllIIllIIlIllIIIlIlIIl = (Exception)(1.0f - lllllllllllllIIllIIlIllIIIlIlIIl);
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            --lllllllllllllIIllIIlIllIIIlIlIIl;
        }
        final AxisAlignedBB lllllllllllllIIllIIlIllIIIlIllIl = Blocks.piston_extension.getBoundingBox(this.worldObj, this.pos, this.pistonState, (float)lllllllllllllIIllIIlIllIIIlIlIIl, this.pistonFacing);
        if (llIlIIIlllIIIll(lllllllllllllIIllIIlIllIIIlIllIl)) {
            final List<Entity> lllllllllllllIIllIIlIllIIIlIllII = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, lllllllllllllIIllIIlIllIIIlIllIl);
            if (llIlIIIlllIIlII(lllllllllllllIIllIIlIllIIIlIllII.isEmpty() ? 1 : 0)) {
                this.field_174933_k.addAll(lllllllllllllIIllIIlIllIIIlIllII);
                "".length();
                final double lllllllllllllIIllIIlIllIIIlIIlII = (double)this.field_174933_k.iterator();
                "".length();
                if ("   ".length() < ((0xDF ^ 0x90 ^ (0xD2 ^ 0xA2)) & (18 + 157 - 129 + 112 ^ 49 + 123 - 158 + 147 ^ -" ".length()))) {
                    return;
                }
                while (!llIlIIIlllIIlII(((Iterator)lllllllllllllIIllIIlIllIIIlIIlII).hasNext() ? 1 : 0)) {
                    final Entity lllllllllllllIIllIIlIllIIIlIlIll = ((Iterator<Entity>)lllllllllllllIIllIIlIllIIIlIIlII).next();
                    if (llIlIIIlllIIlIl(this.pistonState.getBlock(), Blocks.slime_block) && llIlIIIlllIIIlI(this.extending ? 1 : 0)) {
                        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis()[this.pistonFacing.getAxis().ordinal()]) {
                            case 1: {
                                lllllllllllllIIllIIlIllIIIlIlIll.motionX = this.pistonFacing.getFrontOffsetX();
                                "".length();
                                if (-"  ".length() > 0) {
                                    return;
                                }
                                continue;
                            }
                            case 2: {
                                lllllllllllllIIllIIlIllIIIlIlIll.motionY = this.pistonFacing.getFrontOffsetY();
                                "".length();
                                if (((128 + 24 - 74 + 85 ^ 32 + 56 - 48 + 101) & (0xDF ^ 0x95 ^ (0xD ^ 0x69) ^ -" ".length())) > 0) {
                                    return;
                                }
                                continue;
                            }
                            case 3: {
                                lllllllllllllIIllIIlIllIIIlIlIll.motionZ = this.pistonFacing.getFrontOffsetZ();
                                break;
                            }
                        }
                        "".length();
                        if (" ".length() < " ".length()) {
                            return;
                        }
                        continue;
                    }
                    else {
                        lllllllllllllIIllIIlIllIIIlIlIll.moveEntity(lllllllllllllIIllIIlIllIIIlIlIII * this.pistonFacing.getFrontOffsetX(), lllllllllllllIIllIIlIllIIIlIlIII * this.pistonFacing.getFrontOffsetY(), lllllllllllllIIllIIlIllIIIlIlIII * this.pistonFacing.getFrontOffsetZ());
                    }
                }
                this.field_174933_k.clear();
            }
        }
    }
    
    public EnumFacing getFacing() {
        return this.pistonFacing;
    }
    
    private static void llIlIIIllIllllI() {
        (lIIlIllIIIIllI = new String[TileEntityPiston.lIIlIllIIIlIII[10]])[TileEntityPiston.lIIlIllIIIlIII[0]] = llIlIIIllIllIlI("BGgITQEVPz4=", "MDPUC");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[2]] = llIlIIIllIlllII("LiQJMRsIKRIz", "LHfRp");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[3]] = llIlIIIllIlllII("FxUWGykW", "qturG");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[1]] = llIlIIIllIlllIl("8n66IZL9vmc6BUGgtv4XaA==", "jVliP");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[4]] = llIlIIIllIlllII("Jy0jAwgmPDkB", "BUWff");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[5]] = llIlIIIllIllIlI("Bojb/j32Bcw=", "TNevm");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[6]] = llIlIIIllIlllIl("Ql89X8hIMX6aVkbPuCnWSg==", "lIrAS");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[7]] = llIlIIIllIlllIl("Y6TvWI7Dm9I=", "VvqYN");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[8]] = llIlIIIllIllIlI("4QTm/wJdzSSIwxjha8BB+w==", "TuDjt");
        TileEntityPiston.lIIlIllIIIIllI[TileEntityPiston.lIIlIllIIIlIII[9]] = llIlIIIllIlllII("CAwlNxYJHT81", "mtQRx");
    }
    
    public TileEntityPiston() {
        this.field_174933_k = (List<Entity>)Lists.newArrayList();
    }
    
    public float getOffsetZ(final float lllllllllllllIIllIIlIllIIIlllIII) {
        float n;
        if (llIlIIIlllIIIlI(this.extending ? 1 : 0)) {
            n = (this.getProgress(lllllllllllllIIllIIlIllIIIlllIII) - 1.0f) * this.pistonFacing.getFrontOffsetZ();
            "".length();
            if (-" ".length() > ((0x4B ^ 0x64 ^ (0xBA ^ 0x85)) & (127 + 87 - 96 + 26 ^ 61 + 64 - 52 + 55 ^ -" ".length()))) {
                return 0.0f;
            }
        }
        else {
            n = (1.0f - this.getProgress(lllllllllllllIIllIIlIllIIIlllIII)) * this.pistonFacing.getFrontOffsetZ();
        }
        return n;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing$Axis = TileEntityPiston.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
        if (llIlIIIlllIIIll($switch_TABLE$net$minecraft$util$EnumFacing$Axis)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing$Axis;
        }
        "".length();
        final long lllllllllllllIIllIIlIllIIIIIlIIl = (Object)new int[EnumFacing.Axis.values().length];
        try {
            lllllllllllllIIllIIlIllIIIIIlIIl[EnumFacing.Axis.X.ordinal()] = TileEntityPiston.lIIlIllIIIlIII[2];
            "".length();
            if (" ".length() >= (159 + 53 - 183 + 170 ^ 60 + 24 + 84 + 27)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllIIlIllIIIIIlIIl[EnumFacing.Axis.Y.ordinal()] = TileEntityPiston.lIIlIllIIIlIII[3];
            "".length();
            if (" ".length() >= (0x1B ^ 0x1F)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllIIlIllIIIIIlIIl[EnumFacing.Axis.Z.ordinal()] = TileEntityPiston.lIIlIllIIIlIII[1];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return TileEntityPiston.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis = (int[])(Object)lllllllllllllIIllIIlIllIIIIIlIIl;
    }
    
    private static String llIlIIIllIlllII(String lllllllllllllIIllIIlIlIllllIlIIl, final String lllllllllllllIIllIIlIlIllllIlIII) {
        lllllllllllllIIllIIlIlIllllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlIlIllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIlIllllIllIl = new StringBuilder();
        final char[] lllllllllllllIIllIIlIlIllllIllII = lllllllllllllIIllIIlIlIllllIlIII.toCharArray();
        int lllllllllllllIIllIIlIlIllllIlIll = TileEntityPiston.lIIlIllIIIlIII[0];
        final Exception lllllllllllllIIllIIlIlIllllIIIII = (Object)lllllllllllllIIllIIlIlIllllIlIIl.toCharArray();
        final byte lllllllllllllIIllIIlIlIlllIllllI = (byte)lllllllllllllIIllIIlIlIllllIIIII.length;
        Exception lllllllllllllIIllIIlIlIlllIlllIl = (Exception)TileEntityPiston.lIIlIllIIIlIII[0];
        while (llIlIIIlllIlIlI((int)lllllllllllllIIllIIlIlIlllIlllIl, lllllllllllllIIllIIlIlIlllIllllI)) {
            final char lllllllllllllIIllIIlIlIlllllIIll = lllllllllllllIIllIIlIlIllllIIIII[lllllllllllllIIllIIlIlIlllIlllIl];
            lllllllllllllIIllIIlIlIllllIllIl.append((char)(lllllllllllllIIllIIlIlIlllllIIll ^ lllllllllllllIIllIIlIlIllllIllII[lllllllllllllIIllIIlIlIllllIlIll % lllllllllllllIIllIIlIlIllllIllII.length]));
            "".length();
            ++lllllllllllllIIllIIlIlIllllIlIll;
            ++lllllllllllllIIllIIlIlIlllIlllIl;
            "".length();
            if ((0x10 ^ 0x14) != (0x8F ^ 0x8B)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIlIllllIllIl);
    }
    
    @Override
    public int getBlockMetadata() {
        return TileEntityPiston.lIIlIllIIIlIII[0];
    }
    
    public float getOffsetY(final float lllllllllllllIIllIIlIllIIIlllllI) {
        float n;
        if (llIlIIIlllIIIlI(this.extending ? 1 : 0)) {
            n = (this.getProgress(lllllllllllllIIllIIlIllIIIlllllI) - 1.0f) * this.pistonFacing.getFrontOffsetY();
            "".length();
            if (((0xEE ^ 0xB2) & ~(0x73 ^ 0x2F)) > "  ".length()) {
                return 0.0f;
            }
        }
        else {
            n = (1.0f - this.getProgress(lllllllllllllIIllIIlIllIIIlllllI)) * this.pistonFacing.getFrontOffsetY();
        }
        return n;
    }
    
    private static int llIlIIIlllIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIlIIIlllIlIlI(final int lllllllllllllIIllIIlIlIllIllllll, final int lllllllllllllIIllIIlIlIllIlllllI) {
        return lllllllllllllIIllIIlIlIllIllllll < lllllllllllllIIllIIlIlIllIlllllI;
    }
    
    public float getOffsetX(final float lllllllllllllIIllIIlIllIIlIIIllI) {
        float n;
        if (llIlIIIlllIIIlI(this.extending ? 1 : 0)) {
            n = (this.getProgress(lllllllllllllIIllIIlIllIIlIIIllI) - 1.0f) * this.pistonFacing.getFrontOffsetX();
            "".length();
            if ("  ".length() <= -" ".length()) {
                return 0.0f;
            }
        }
        else {
            n = (1.0f - this.getProgress(lllllllllllllIIllIIlIllIIlIIIllI)) * this.pistonFacing.getFrontOffsetX();
        }
        return n;
    }
    
    private static int llIlIIIlllIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void clearPistonTileEntity() {
        if (llIlIIIlllIIlll(llIlIIIlllIIllI(this.lastProgress, 1.0f)) && llIlIIIlllIIIll(this.worldObj)) {
            final float n = 1.0f;
            this.progress = n;
            this.lastProgress = n;
            this.worldObj.removeTileEntity(this.pos);
            this.invalidate();
            if (llIlIIIlllIIlIl(this.worldObj.getBlockState(this.pos).getBlock(), Blocks.piston_extension)) {
                this.worldObj.setBlockState(this.pos, this.pistonState, TileEntityPiston.lIIlIllIIIlIII[1]);
                "".length();
                this.worldObj.notifyBlockOfStateChange(this.pos, this.pistonState.getBlock());
            }
        }
    }
    
    @Override
    public void update() {
        this.lastProgress = this.progress;
        if (llIlIIIlllIlIIl(llIlIIIlllIlIII(this.lastProgress, 1.0f))) {
            this.launchWithSlimeBlock(1.0f, 0.25f);
            this.worldObj.removeTileEntity(this.pos);
            this.invalidate();
            if (llIlIIIlllIIlIl(this.worldObj.getBlockState(this.pos).getBlock(), Blocks.piston_extension)) {
                this.worldObj.setBlockState(this.pos, this.pistonState, TileEntityPiston.lIIlIllIIIlIII[1]);
                "".length();
                this.worldObj.notifyBlockOfStateChange(this.pos, this.pistonState.getBlock());
                "".length();
                if (((75 + 81 - 132 + 109 ^ 170 + 119 - 131 + 20) & (58 + 102 - 128 + 105 ^ 183 + 140 - 244 + 111 ^ -" ".length())) > ((0x5A ^ 0x56 ^ (0xF2 ^ 0xB2)) & (0x5A ^ 0x7D ^ (0xEE ^ 0x85) ^ -" ".length()))) {
                    return;
                }
            }
        }
        else {
            this.progress += 0.5f;
            if (llIlIIIlllIlIIl(llIlIIIlllIlIII(this.progress, 1.0f))) {
                this.progress = 1.0f;
            }
            if (llIlIIIlllIIIlI(this.extending ? 1 : 0)) {
                this.launchWithSlimeBlock(this.progress, this.progress - this.lastProgress + 0.0625f);
            }
        }
    }
    
    private static void llIlIIIllIlllll() {
        (lIIlIllIIIlIII = new int[11])[0] = ((104 + 111 - 192 + 151 ^ 6 + 0 + 14 + 128) & (0x19 ^ 0x61 ^ (0xC5 ^ 0x87) ^ -" ".length()));
        TileEntityPiston.lIIlIllIIIlIII[1] = "   ".length();
        TileEntityPiston.lIIlIllIIIlIII[2] = " ".length();
        TileEntityPiston.lIIlIllIIIlIII[3] = "  ".length();
        TileEntityPiston.lIIlIllIIIlIII[4] = (0x88 ^ 0x8C);
        TileEntityPiston.lIIlIllIIIlIII[5] = (0xC ^ 0x2B ^ (0x27 ^ 0x5));
        TileEntityPiston.lIIlIllIIIlIII[6] = (0x78 ^ 0x7E);
        TileEntityPiston.lIIlIllIIIlIII[7] = (165 + 105 - 115 + 20 ^ 155 + 142 - 142 + 13);
        TileEntityPiston.lIIlIllIIIlIII[8] = (0x81 ^ 0x89);
        TileEntityPiston.lIIlIllIIIlIII[9] = (0x9B ^ 0x92);
        TileEntityPiston.lIIlIllIIIlIII[10] = (0x5F ^ 0x55);
    }
    
    private static boolean llIlIIIlllIIlIl(final Object lllllllllllllIIllIIlIlIllIlllIIl, final Object lllllllllllllIIllIIlIlIllIlllIII) {
        return lllllllllllllIIllIIlIlIllIlllIIl == lllllllllllllIIllIIlIlIllIlllIII;
    }
    
    public IBlockState getPistonState() {
        return this.pistonState;
    }
    
    public boolean isExtending() {
        return this.extending;
    }
}
