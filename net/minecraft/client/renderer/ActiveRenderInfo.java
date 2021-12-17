// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.util.MathHelper;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class ActiveRenderInfo
{
    private static /* synthetic */ float rotationZ;
    private static final /* synthetic */ int[] lIlIIlIllIllIl;
    private static final /* synthetic */ IntBuffer VIEWPORT;
    private static /* synthetic */ float rotationXY;
    private static final /* synthetic */ FloatBuffer OBJECTCOORDS;
    private static final /* synthetic */ FloatBuffer MODELVIEW;
    private static /* synthetic */ float rotationXZ;
    private static final /* synthetic */ FloatBuffer PROJECTION;
    private static /* synthetic */ Vec3 position;
    private static /* synthetic */ float rotationYZ;
    private static /* synthetic */ float rotationX;
    
    public static Block getBlockAtEntityViewpoint(final World lllllllllllllIIIllIlIlllIlllllIl, final Entity lllllllllllllIIIllIlIllllIIIIlIl, final float lllllllllllllIIIllIlIlllIllllIll) {
        final Vec3 lllllllllllllIIIllIlIllllIIIIIll = projectViewFromEntity(lllllllllllllIIIllIlIllllIIIIlIl, lllllllllllllIIIllIlIlllIllllIll);
        final BlockPos lllllllllllllIIIllIlIllllIIIIIlI = new BlockPos(lllllllllllllIIIllIlIllllIIIIIll);
        final IBlockState lllllllllllllIIIllIlIllllIIIIIIl = lllllllllllllIIIllIlIlllIlllllIl.getBlockState(lllllllllllllIIIllIlIllllIIIIIlI);
        Block lllllllllllllIIIllIlIllllIIIIIII = lllllllllllllIIIllIlIllllIIIIIIl.getBlock();
        if (lllIIllIlIllIll(lllllllllllllIIIllIlIllllIIIIIII.getMaterial().isLiquid() ? 1 : 0)) {
            float lllllllllllllIIIllIlIlllIlllllll = 0.0f;
            if (lllIIllIlIllIll((lllllllllllllIIIllIlIllllIIIIIIl.getBlock() instanceof BlockLiquid) ? 1 : 0)) {
                lllllllllllllIIIllIlIlllIlllllll = BlockLiquid.getLiquidHeightPercent(lllllllllllllIIIllIlIllllIIIIIIl.getValue((IProperty<Integer>)BlockLiquid.LEVEL)) - 0.11111111f;
            }
            final float lllllllllllllIIIllIlIlllIllllllI = lllllllllllllIIIllIlIllllIIIIIlI.getY() + ActiveRenderInfo.lIlIIlIllIllIl[7] - lllllllllllllIIIllIlIlllIlllllll;
            if (lllIIllIlIlllIl(lllIIllIlIlllII(lllllllllllllIIIllIlIllllIIIIIll.yCoord, lllllllllllllIIIllIlIlllIllllllI))) {
                lllllllllllllIIIllIlIllllIIIIIII = lllllllllllllIIIllIlIlllIlllllIl.getBlockState(lllllllllllllIIIllIlIllllIIIIIlI.up()).getBlock();
            }
        }
        return lllllllllllllIIIllIlIllllIIIIIII;
    }
    
    public static float getRotationZ() {
        return ActiveRenderInfo.rotationZ;
    }
    
    private static int lllIIllIlIlllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lllIIllIlIllIlI() {
        (lIlIIlIllIllIl = new int[8])[0] = (0x63 ^ 0x43 ^ (0xF2 ^ 0xC2));
        ActiveRenderInfo.lIlIIlIllIllIl[1] = "   ".length();
        ActiveRenderInfo.lIlIIlIllIllIl[2] = (-(0xFFFFF5DD & 0x3E7B) & (0xFFFFBFFE & 0x7FFF));
        ActiveRenderInfo.lIlIIlIllIllIl[3] = (-(0xFFFF9E9D & 0x6573) & (0xFFFFDFBF & 0x2FF7));
        ActiveRenderInfo.lIlIIlIllIllIl[4] = (0xFFFFAFA2 & 0x5BFF);
        ActiveRenderInfo.lIlIIlIllIllIl[5] = ((0x87 ^ 0xAD) & ~(0x44 ^ 0x6E));
        ActiveRenderInfo.lIlIIlIllIllIl[6] = "  ".length();
        ActiveRenderInfo.lIlIIlIllIllIl[7] = " ".length();
    }
    
    public static float getRotationX() {
        return ActiveRenderInfo.rotationX;
    }
    
    public static Vec3 projectViewFromEntity(final Entity lllllllllllllIIIllIlIllllIIlIlll, final double lllllllllllllIIIllIlIllllIIllllI) {
        final double lllllllllllllIIIllIlIllllIIlllIl = lllllllllllllIIIllIlIllllIIlIlll.prevPosX + (lllllllllllllIIIllIlIllllIIlIlll.posX - lllllllllllllIIIllIlIllllIIlIlll.prevPosX) * lllllllllllllIIIllIlIllllIIllllI;
        final double lllllllllllllIIIllIlIllllIIlllII = lllllllllllllIIIllIlIllllIIlIlll.prevPosY + (lllllllllllllIIIllIlIllllIIlIlll.posY - lllllllllllllIIIllIlIllllIIlIlll.prevPosY) * lllllllllllllIIIllIlIllllIIllllI;
        final double lllllllllllllIIIllIlIllllIIllIll = lllllllllllllIIIllIlIllllIIlIlll.prevPosZ + (lllllllllllllIIIllIlIllllIIlIlll.posZ - lllllllllllllIIIllIlIllllIIlIlll.prevPosZ) * lllllllllllllIIIllIlIllllIIllllI;
        final double lllllllllllllIIIllIlIllllIIllIlI = lllllllllllllIIIllIlIllllIIlllIl + ActiveRenderInfo.position.xCoord;
        final double lllllllllllllIIIllIlIllllIIllIIl = lllllllllllllIIIllIlIllllIIlllII + ActiveRenderInfo.position.yCoord;
        final double lllllllllllllIIIllIlIllllIIllIII = lllllllllllllIIIllIlIllllIIllIll + ActiveRenderInfo.position.zCoord;
        return new Vec3(lllllllllllllIIIllIlIllllIIllIlI, lllllllllllllIIIllIlIllllIIllIIl, lllllllllllllIIIllIlIllllIIllIII);
    }
    
    public static float getRotationXY() {
        return ActiveRenderInfo.rotationXY;
    }
    
    private static boolean lllIIllIlIlllIl(final int lllllllllllllIIIllIlIlllIlllIIIl) {
        return lllllllllllllIIIllIlIlllIlllIIIl >= 0;
    }
    
    public static float getRotationYZ() {
        return ActiveRenderInfo.rotationYZ;
    }
    
    public static float getRotationXZ() {
        return ActiveRenderInfo.rotationXZ;
    }
    
    static {
        lllIIllIlIllIlI();
        VIEWPORT = GLAllocation.createDirectIntBuffer(ActiveRenderInfo.lIlIIlIllIllIl[0]);
        MODELVIEW = GLAllocation.createDirectFloatBuffer(ActiveRenderInfo.lIlIIlIllIllIl[0]);
        PROJECTION = GLAllocation.createDirectFloatBuffer(ActiveRenderInfo.lIlIIlIllIllIl[0]);
        OBJECTCOORDS = GLAllocation.createDirectFloatBuffer(ActiveRenderInfo.lIlIIlIllIllIl[1]);
        ActiveRenderInfo.position = new Vec3(0.0, 0.0, 0.0);
    }
    
    public static Vec3 getPosition() {
        return ActiveRenderInfo.position;
    }
    
    public static void updateRenderInfo(final EntityPlayer lllllllllllllIIIllIlIllllIllIlIl, final boolean lllllllllllllIIIllIlIllllIlIllIl) {
        GlStateManager.getFloat(ActiveRenderInfo.lIlIIlIllIllIl[2], ActiveRenderInfo.MODELVIEW);
        GlStateManager.getFloat(ActiveRenderInfo.lIlIIlIllIllIl[3], ActiveRenderInfo.PROJECTION);
        GL11.glGetInteger(ActiveRenderInfo.lIlIIlIllIllIl[4], ActiveRenderInfo.VIEWPORT);
        final float lllllllllllllIIIllIlIllllIllIIll = (float)((ActiveRenderInfo.VIEWPORT.get(ActiveRenderInfo.lIlIIlIllIllIl[5]) + ActiveRenderInfo.VIEWPORT.get(ActiveRenderInfo.lIlIIlIllIllIl[6])) / ActiveRenderInfo.lIlIIlIllIllIl[6]);
        final float lllllllllllllIIIllIlIllllIllIIlI = (float)((ActiveRenderInfo.VIEWPORT.get(ActiveRenderInfo.lIlIIlIllIllIl[7]) + ActiveRenderInfo.VIEWPORT.get(ActiveRenderInfo.lIlIIlIllIllIl[1])) / ActiveRenderInfo.lIlIIlIllIllIl[6]);
        GLU.gluUnProject(lllllllllllllIIIllIlIllllIllIIll, lllllllllllllIIIllIlIllllIllIIlI, 0.0f, ActiveRenderInfo.MODELVIEW, ActiveRenderInfo.PROJECTION, ActiveRenderInfo.VIEWPORT, ActiveRenderInfo.OBJECTCOORDS);
        "".length();
        ActiveRenderInfo.position = new Vec3(ActiveRenderInfo.OBJECTCOORDS.get(ActiveRenderInfo.lIlIIlIllIllIl[5]), ActiveRenderInfo.OBJECTCOORDS.get(ActiveRenderInfo.lIlIIlIllIllIl[7]), ActiveRenderInfo.OBJECTCOORDS.get(ActiveRenderInfo.lIlIIlIllIllIl[6]));
        int n;
        if (lllIIllIlIllIll(lllllllllllllIIIllIlIllllIlIllIl ? 1 : 0)) {
            n = ActiveRenderInfo.lIlIIlIllIllIl[7];
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        }
        else {
            n = ActiveRenderInfo.lIlIIlIllIllIl[5];
        }
        final int lllllllllllllIIIllIlIllllIllIIIl = n;
        final float lllllllllllllIIIllIlIllllIllIIII = lllllllllllllIIIllIlIllllIllIlIl.rotationPitch;
        final float lllllllllllllIIIllIlIllllIlIllll = lllllllllllllIIIllIlIllllIllIlIl.rotationYaw;
        ActiveRenderInfo.rotationX = MathHelper.cos(lllllllllllllIIIllIlIllllIlIllll * 3.1415927f / 180.0f) * (ActiveRenderInfo.lIlIIlIllIllIl[7] - lllllllllllllIIIllIlIllllIllIIIl * ActiveRenderInfo.lIlIIlIllIllIl[6]);
        ActiveRenderInfo.rotationZ = MathHelper.sin(lllllllllllllIIIllIlIllllIlIllll * 3.1415927f / 180.0f) * (ActiveRenderInfo.lIlIIlIllIllIl[7] - lllllllllllllIIIllIlIllllIllIIIl * ActiveRenderInfo.lIlIIlIllIllIl[6]);
        ActiveRenderInfo.rotationYZ = -ActiveRenderInfo.rotationZ * MathHelper.sin(lllllllllllllIIIllIlIllllIllIIII * 3.1415927f / 180.0f) * (ActiveRenderInfo.lIlIIlIllIllIl[7] - lllllllllllllIIIllIlIllllIllIIIl * ActiveRenderInfo.lIlIIlIllIllIl[6]);
        ActiveRenderInfo.rotationXY = ActiveRenderInfo.rotationX * MathHelper.sin(lllllllllllllIIIllIlIllllIllIIII * 3.1415927f / 180.0f) * (ActiveRenderInfo.lIlIIlIllIllIl[7] - lllllllllllllIIIllIlIllllIllIIIl * ActiveRenderInfo.lIlIIlIllIllIl[6]);
        ActiveRenderInfo.rotationXZ = MathHelper.cos(lllllllllllllIIIllIlIllllIllIIII * 3.1415927f / 180.0f);
    }
    
    private static boolean lllIIllIlIllIll(final int lllllllllllllIIIllIlIlllIlllIIll) {
        return lllllllllllllIIIllIlIlllIlllIIll != 0;
    }
}
