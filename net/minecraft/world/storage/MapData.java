// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import java.util.Iterator;
import net.minecraft.network.play.server.S34PacketMaps;
import java.util.Arrays;
import net.minecraft.network.Packet;
import net.minecraft.world.World;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.nbt.NBTTagCompound;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec4b;
import java.util.Map;
import net.minecraft.world.WorldSavedData;

public class MapData extends WorldSavedData
{
    private static final /* synthetic */ int[] lIIlIIIIllIIlI;
    public /* synthetic */ int xCenter;
    public /* synthetic */ int zCenter;
    public /* synthetic */ Map<String, Vec4b> mapDecorations;
    private /* synthetic */ Map<EntityPlayer, MapInfo> playersHashMap;
    public /* synthetic */ byte dimension;
    public /* synthetic */ byte scale;
    private static final /* synthetic */ String[] lIIlIIIIllIIIl;
    public /* synthetic */ List<MapInfo> playersArrayList;
    public /* synthetic */ byte[] colors;
    
    private static void llIIlIIlllIllII() {
        (lIIlIIIIllIIlI = new int[32])[0] = (-(0xFFFFFCDB & 0x377D) & (0xFFFFF458 & 0x7FFF));
        MapData.lIIlIIIIllIIlI[1] = (0x4F ^ 0x6B) + (0x11 ^ 0x7A) - (0x1C ^ 0x7C) + (0x5E ^ 0xF);
        MapData.lIIlIIIIllIIlI[2] = " ".length();
        MapData.lIIlIIIIllIIlI[3] = "  ".length();
        MapData.lIIlIIIIllIIlI[4] = (0x73 ^ 0x33);
        MapData.lIIlIIIIllIIlI[5] = ((0xF ^ 0x44) & ~(0x50 ^ 0x1B));
        MapData.lIIlIIIIllIIlI[6] = "   ".length();
        MapData.lIIlIIIIllIIlI[7] = (0x64 ^ 0x60);
        MapData.lIIlIIIIllIIlI[8] = (0xDF ^ 0x87 ^ (0x6C ^ 0x31));
        MapData.lIIlIIIIllIIlI[9] = (0x71 ^ 0x77);
        MapData.lIIlIIIIllIIlI[10] = (0x95 ^ 0x92);
        MapData.lIIlIIIIllIIlI[11] = (97 + 85 - 41 + 7 ^ 43 + 77 - 37 + 73);
        MapData.lIIlIIIIllIIlI[12] = (164 + 6 - 141 + 175 ^ 84 + 34 - 58 + 137);
        MapData.lIIlIIIIllIIlI[13] = (0x5C ^ 0x56);
        MapData.lIIlIIIIllIIlI[14] = (150 + 7 + 5 + 14 ^ 0 + 159 - 23 + 51);
        MapData.lIIlIIIIllIIlI[15] = (0x4A ^ 0x46);
        MapData.lIIlIIIIllIIlI[16] = (0x35 ^ 0x38);
        MapData.lIIlIIIIllIIlI[17] = (0xBC ^ 0xC5 ^ (0x7 ^ 0x70));
        MapData.lIIlIIIIllIIlI[18] = (0x20 ^ 0x2F);
        MapData.lIIlIIIIllIIlI[19] = (136 + 126 - 65 + 48 ^ 85 + 133 - 197 + 154);
        MapData.lIIlIIIIllIIlI[20] = (70 + 5 - 29 + 111 ^ 20 + 4 + 91 + 26);
        MapData.lIIlIIIIllIIlI[21] = (0x5F ^ 0x4E);
        MapData.lIIlIIIIllIIlI[22] = (0x15 ^ 0x7);
        MapData.lIIlIIIIllIIlI[23] = (0xA ^ 0x19);
        MapData.lIIlIIIIllIIlI[24] = (0x40 ^ 0x54);
        MapData.lIIlIIIIllIIlI[25] = (0x9D ^ 0x88);
        MapData.lIIlIIIIllIIlI[26] = (0xD ^ 0x1B);
        MapData.lIIlIIIIllIIlI[27] = (0x72 ^ 0x65);
        MapData.lIIlIIIIllIIlI[28] = (0x86 ^ 0xB9);
        MapData.lIIlIIIIllIIlI[29] = (0xFFFFBF7B & 0x209E7F5);
        MapData.lIIlIIIIllIIlI[30] = (0x1A ^ 0x49 ^ (0x9B ^ 0xB1));
        MapData.lIIlIIIIllIIlI[31] = (0x6E ^ 0x76);
    }
    
    private static boolean llIIlIIllllIlll(final int lllllllllllllIIlllIllIIIllllIIll) {
        return lllllllllllllIIlllIllIIIllllIIll <= 0;
    }
    
    private static boolean llIIlIIllllIIlI(final int lllllllllllllIIlllIllIIIlllllIll) {
        return lllllllllllllIIlllIllIIIlllllIll != 0;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIIlllIllIIllIllIlIl) {
        this.dimension = lllllllllllllIIlllIllIIllIllIlIl.getByte(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[5]]);
        this.xCenter = lllllllllllllIIlllIllIIllIllIlIl.getInteger(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[2]]);
        this.zCenter = lllllllllllllIIlllIllIIllIllIlIl.getInteger(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[3]]);
        this.scale = lllllllllllllIIlllIllIIllIllIlIl.getByte(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[6]]);
        this.scale = (byte)MathHelper.clamp_int(this.scale, MapData.lIIlIIIIllIIlI[5], MapData.lIIlIIIIllIIlI[7]);
        final int lllllllllllllIIlllIllIIllIllllll = lllllllllllllIIlllIllIIllIllIlIl.getShort(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[7]]);
        final int lllllllllllllIIlllIllIIllIlllllI = lllllllllllllIIlllIllIIllIllIlIl.getShort(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[8]]);
        if (llIIlIIlllIllIl(lllllllllllllIIlllIllIIllIllllll, MapData.lIIlIIIIllIIlI[1]) && llIIlIIlllIllIl(lllllllllllllIIlllIllIIllIlllllI, MapData.lIIlIIIIllIIlI[1])) {
            this.colors = lllllllllllllIIlllIllIIllIllIlIl.getByteArray(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[9]]);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            final byte[] lllllllllllllIIlllIllIIllIllllIl = lllllllllllllIIlllIllIIllIllIlIl.getByteArray(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[10]]);
            this.colors = new byte[MapData.lIIlIIIIllIIlI[0]];
            final int lllllllllllllIIlllIllIIllIllllII = (MapData.lIIlIIIIllIIlI[1] - lllllllllllllIIlllIllIIllIllllll) / MapData.lIIlIIIIllIIlI[3];
            final int lllllllllllllIIlllIllIIllIlllIll = (MapData.lIIlIIIIllIIlI[1] - lllllllllllllIIlllIllIIllIlllllI) / MapData.lIIlIIIIllIIlI[3];
            int lllllllllllllIIlllIllIIllIlllIlI = MapData.lIIlIIIIllIIlI[5];
            "".length();
            if ("   ".length() >= (0xE ^ 0xA)) {
                return;
            }
            while (!llIIlIIllllIIII(lllllllllllllIIlllIllIIllIlllIlI, lllllllllllllIIlllIllIIllIlllllI)) {
                final int lllllllllllllIIlllIllIIllIlllIIl = lllllllllllllIIlllIllIIllIlllIlI + lllllllllllllIIlllIllIIllIlllIll;
                if (!llIIlIIlllIlllI(lllllllllllllIIlllIllIIllIlllIIl) || llIIlIIlllIllll(lllllllllllllIIlllIllIIllIlllIIl, MapData.lIIlIIIIllIIlI[1])) {
                    int lllllllllllllIIlllIllIIllIlllIII = MapData.lIIlIIIIllIIlI[5];
                    "".length();
                    if ((0x53 ^ 0x57) < 0) {
                        return;
                    }
                    while (!llIIlIIllllIIII(lllllllllllllIIlllIllIIllIlllIII, lllllllllllllIIlllIllIIllIllllll)) {
                        final int lllllllllllllIIlllIllIIllIllIlll = lllllllllllllIIlllIllIIllIlllIII + lllllllllllllIIlllIllIIllIllllII;
                        if (!llIIlIIlllIlllI(lllllllllllllIIlllIllIIllIllIlll) || llIIlIIlllIllll(lllllllllllllIIlllIllIIllIllIlll, MapData.lIIlIIIIllIIlI[1])) {
                            this.colors[lllllllllllllIIlllIllIIllIllIlll + lllllllllllllIIlllIllIIllIlllIIl * MapData.lIIlIIIIllIIlI[1]] = lllllllllllllIIlllIllIIllIllllIl[lllllllllllllIIlllIllIIllIlllIII + lllllllllllllIIlllIllIIllIlllIlI * lllllllllllllIIlllIllIIllIllllll];
                        }
                        ++lllllllllllllIIlllIllIIllIlllIII;
                    }
                }
                ++lllllllllllllIIlllIllIIllIlllIlI;
            }
        }
    }
    
    public void updateVisiblePlayers(final EntityPlayer lllllllllllllIIlllIllIIllIIllllI, final ItemStack lllllllllllllIIlllIllIIllIIlllIl) {
        if (llIIlIIllllIIIl(this.playersHashMap.containsKey(lllllllllllllIIlllIllIIllIIllllI) ? 1 : 0)) {
            final MapInfo lllllllllllllIIlllIllIIllIIlllII = new MapInfo(lllllllllllllIIlllIllIIllIIllllI);
            this.playersHashMap.put(lllllllllllllIIlllIllIIllIIllllI, lllllllllllllIIlllIllIIllIIlllII);
            "".length();
            this.playersArrayList.add(lllllllllllllIIlllIllIIllIIlllII);
            "".length();
        }
        if (llIIlIIllllIIIl(lllllllllllllIIlllIllIIllIIllllI.inventory.hasItemStack(lllllllllllllIIlllIllIIllIIlllIl) ? 1 : 0)) {
            this.mapDecorations.remove(lllllllllllllIIlllIllIIllIIllllI.getName());
            "".length();
        }
        int lllllllllllllIIlllIllIIllIIllIll = MapData.lIIlIIIIllIIlI[5];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!llIIlIIllllIIII(lllllllllllllIIlllIllIIllIIllIll, this.playersArrayList.size())) {
            final MapInfo lllllllllllllIIlllIllIIllIIllIlI = this.playersArrayList.get(lllllllllllllIIlllIllIIllIIllIll);
            if (llIIlIIllllIIIl(lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.isDead ? 1 : 0) && (!llIIlIIllllIIIl(lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.inventory.hasItemStack(lllllllllllllIIlllIllIIllIIlllIl) ? 1 : 0) || llIIlIIllllIIlI(lllllllllllllIIlllIllIIllIIlllIl.isOnItemFrame() ? 1 : 0))) {
                if (llIIlIIllllIIIl(lllllllllllllIIlllIllIIllIIlllIl.isOnItemFrame() ? 1 : 0) && llIIlIIlllIllIl(lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.dimension, this.dimension)) {
                    this.updateDecorations(MapData.lIIlIIIIllIIlI[5], lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.worldObj, lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.getName(), lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.posX, lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.posZ, lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj.rotationYaw);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
            }
            else {
                this.playersHashMap.remove(lllllllllllllIIlllIllIIllIIllIlI.entityplayerObj);
                "".length();
                this.playersArrayList.remove(lllllllllllllIIlllIllIIllIIllIlI);
                "".length();
            }
            ++lllllllllllllIIlllIllIIllIIllIll;
        }
        if (llIIlIIllllIIlI(lllllllllllllIIlllIllIIllIIlllIl.isOnItemFrame() ? 1 : 0)) {
            final EntityItemFrame lllllllllllllIIlllIllIIllIIllIIl = lllllllllllllIIlllIllIIllIIlllIl.getItemFrame();
            final BlockPos lllllllllllllIIlllIllIIllIIllIII = lllllllllllllIIlllIllIIllIIllIIl.getHangingPosition();
            this.updateDecorations(MapData.lIIlIIIIllIIlI[2], lllllllllllllIIlllIllIIllIIllllI.worldObj, String.valueOf(new StringBuilder(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[18]]).append(lllllllllllllIIlllIllIIllIIllIIl.getEntityId())), lllllllllllllIIlllIllIIllIIllIII.getX(), lllllllllllllIIlllIllIIllIIllIII.getZ(), lllllllllllllIIlllIllIIllIIllIIl.facingDirection.getHorizontalIndex() * MapData.lIIlIIIIllIIlI[19]);
        }
        if (llIIlIIllllIIlI(lllllllllllllIIlllIllIIllIIlllIl.hasTagCompound() ? 1 : 0) && llIIlIIllllIIlI(lllllllllllllIIlllIllIIllIIlllIl.getTagCompound().hasKey(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[20]], MapData.lIIlIIIIllIIlI[12]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIIlllIllIIllIIlIlll = lllllllllllllIIlllIllIIllIIlllIl.getTagCompound().getTagList(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[21]], MapData.lIIlIIIIllIIlI[13]);
            int lllllllllllllIIlllIllIIllIIlIllI = MapData.lIIlIIIIllIIlI[5];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!llIIlIIllllIIII(lllllllllllllIIlllIllIIllIIlIllI, lllllllllllllIIlllIllIIllIIlIlll.tagCount())) {
                final NBTTagCompound lllllllllllllIIlllIllIIllIIlIlIl = lllllllllllllIIlllIllIIllIIlIlll.getCompoundTagAt(lllllllllllllIIlllIllIIllIIlIllI);
                if (llIIlIIllllIIIl(this.mapDecorations.containsKey(lllllllllllllIIlllIllIIllIIlIlIl.getString(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[22]])) ? 1 : 0)) {
                    this.updateDecorations(lllllllllllllIIlllIllIIllIIlIlIl.getByte(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[23]]), lllllllllllllIIlllIllIIllIIllllI.worldObj, lllllllllllllIIlllIllIIllIIlIlIl.getString(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[24]]), lllllllllllllIIlllIllIIllIIlIlIl.getDouble(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[25]]), lllllllllllllIIlllIllIIllIIlIlIl.getDouble(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[26]]), lllllllllllllIIlllIllIIllIIlIlIl.getDouble(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[27]]));
                }
                ++lllllllllllllIIlllIllIIllIIlIllI;
            }
        }
    }
    
    public void calculateMapCenter(final double lllllllllllllIIlllIllIIlllIlIIlI, final double lllllllllllllIIlllIllIIlllIlIIIl, final int lllllllllllllIIlllIllIIlllIlIIII) {
        final int lllllllllllllIIlllIllIIlllIlIllI = MapData.lIIlIIIIllIIlI[1] * (MapData.lIIlIIIIllIIlI[2] << lllllllllllllIIlllIllIIlllIlIIII);
        final int lllllllllllllIIlllIllIIlllIlIlIl = MathHelper.floor_double((lllllllllllllIIlllIllIIlllIlIIlI + 64.0) / lllllllllllllIIlllIllIIlllIlIllI);
        final int lllllllllllllIIlllIllIIlllIlIlII = MathHelper.floor_double((lllllllllllllIIlllIllIIlllIlIIIl + 64.0) / lllllllllllllIIlllIllIIlllIlIllI);
        this.xCenter = lllllllllllllIIlllIllIIlllIlIlIl * lllllllllllllIIlllIllIIlllIlIllI + lllllllllllllIIlllIllIIlllIlIllI / MapData.lIIlIIIIllIIlI[3] - MapData.lIIlIIIIllIIlI[4];
        this.zCenter = lllllllllllllIIlllIllIIlllIlIlII * lllllllllllllIIlllIllIIlllIlIllI + lllllllllllllIIlllIllIIlllIlIllI / MapData.lIIlIIIIllIIlI[3] - MapData.lIIlIIIIllIIlI[4];
    }
    
    private static boolean llIIlIIllllIIIl(final int lllllllllllllIIlllIllIIIlllllIIl) {
        return lllllllllllllIIlllIllIIIlllllIIl == 0;
    }
    
    private static String llIIlIIlllIlIII(String lllllllllllllIIlllIllIIlIIlIIIII, final String lllllllllllllIIlllIllIIlIIlIIlII) {
        lllllllllllllIIlllIllIIlIIlIIIII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIllIIlIIlIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIllIIlIIlIIIll = new StringBuilder();
        final char[] lllllllllllllIIlllIllIIlIIlIIIlI = lllllllllllllIIlllIllIIlIIlIIlII.toCharArray();
        int lllllllllllllIIlllIllIIlIIlIIIIl = MapData.lIIlIIIIllIIlI[5];
        final Exception lllllllllllllIIlllIllIIlIIIllIll = (Object)((String)lllllllllllllIIlllIllIIlIIlIIIII).toCharArray();
        final char lllllllllllllIIlllIllIIlIIIllIlI = (char)lllllllllllllIIlllIllIIlIIIllIll.length;
        long lllllllllllllIIlllIllIIlIIIllIIl = MapData.lIIlIIIIllIIlI[5];
        while (llIIlIIlllIllll((int)lllllllllllllIIlllIllIIlIIIllIIl, lllllllllllllIIlllIllIIlIIIllIlI)) {
            final char lllllllllllllIIlllIllIIlIIlIIllI = lllllllllllllIIlllIllIIlIIIllIll[lllllllllllllIIlllIllIIlIIIllIIl];
            lllllllllllllIIlllIllIIlIIlIIIll.append((char)(lllllllllllllIIlllIllIIlIIlIIllI ^ lllllllllllllIIlllIllIIlIIlIIIlI[lllllllllllllIIlllIllIIlIIlIIIIl % lllllllllllllIIlllIllIIlIIlIIIlI.length]));
            "".length();
            ++lllllllllllllIIlllIllIIlIIlIIIIl;
            ++lllllllllllllIIlllIllIIlIIIllIIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIllIIlIIlIIIll);
    }
    
    private static void llIIlIIlllIlIlI() {
        (lIIlIIIIllIIIl = new String[MapData.lIIlIIIIllIIlI[31]])[MapData.lIIlIIIIllIIlI[5]] = llIIlIIlllIIlll("5Q8ygNAat/cj6UzRmxHvww==", "fpfMs");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[2]] = llIIlIIlllIlIII("FTQjIyYIBQ==", "mwFMR");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[3]] = llIIlIIlllIIlll("iGv2zJDKvyc=", "BJGHI");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[6]] = llIIlIIlllIlIIl("qWcm+6tcrXI=", "OwWRq");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[7]] = llIIlIIlllIIlll("OxFXkfUy5T4=", "nawgO");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[8]] = llIIlIIlllIIlll("Rls+NO0bDdk=", "vEwZG");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[9]] = llIIlIIlllIlIII("DyYUIjof", "lIxMH");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[10]] = llIIlIIlllIlIII("NSgBHhUl", "VGmqg");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[11]] = llIIlIIlllIlIIl("z5MVDRnf9a5EUOQvrWcgWQ==", "ZLqoj");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[12]] = llIIlIIlllIIlll("QAYCA+WmZXA=", "kWxYw");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[13]] = llIIlIIlllIlIII("NjkODCcpCA==", "LzkbS");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[14]] = llIIlIIlllIlIII("PAIzOgA=", "OaRVe");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[15]] = llIIlIIlllIIlll("w2cOtNFD6DU=", "RYuBJ");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[16]] = llIIlIIlllIlIII("KSAqEhg1", "AECup");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[17]] = llIIlIIlllIlIIl("6TZRWYjZzbk=", "sVEeU");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[18]] = llIIlIIlllIIlll("SMM1mCH2M0w=", "TavmI");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[20]] = llIIlIIlllIlIIl("JJcKsHXtCt0ZNU1shkqh9w==", "qswav");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[21]] = llIIlIIlllIlIII("HQIpKTM4EyMpLyo=", "YgJFA");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[22]] = llIIlIIlllIIlll("/SfADZw4ZTc=", "qdXbG");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[23]] = llIIlIIlllIIlll("k6GBMZanfVM=", "PTIKT");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[24]] = llIIlIIlllIIlll("ftOV317mBoE=", "uapZL");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[25]] = llIIlIIlllIlIIl("anjixFNoxjU=", "lmGiG");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[26]] = llIIlIIlllIIlll("DNqcnRGhN/0=", "WtbBw");
        MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[27]] = llIIlIIlllIlIIl("7dHNuh85yxY=", "bEsHs");
    }
    
    private static String llIIlIIlllIlIIl(final String lllllllllllllIIlllIllIIlIIIIlllI, final String lllllllllllllIIlllIllIIlIIIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIIlIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIIlIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIllIIlIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIllIIlIIIlIIlI.init(MapData.lIIlIIIIllIIlI[3], lllllllllllllIIlllIllIIlIIIlIIll);
            return new String(lllllllllllllIIlllIllIIlIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIIlIIIlIIIl) {
            lllllllllllllIIlllIllIIlIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIlIIlllIllII();
        llIIlIIlllIlIlI();
    }
    
    public void updateMapData(final int lllllllllllllIIlllIllIIlIlIIlIIl, final int lllllllllllllIIlllIllIIlIlIIllII) {
        super.markDirty();
        final char lllllllllllllIIlllIllIIlIlIIIllI = (char)this.playersArrayList.iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!llIIlIIllllIIIl(((Iterator)lllllllllllllIIlllIllIIlIlIIIllI).hasNext() ? 1 : 0)) {
            final MapInfo lllllllllllllIIlllIllIIlIlIIlIll = ((Iterator<MapInfo>)lllllllllllllIIlllIllIIlIlIIIllI).next();
            lllllllllllllIIlllIllIIlIlIIlIll.update(lllllllllllllIIlllIllIIlIlIIlIIl, lllllllllllllIIlllIllIIlIlIIllII);
        }
    }
    
    public MapData(final String lllllllllllllIIlllIllIIllllIIIlI) {
        super(lllllllllllllIIlllIllIIllllIIIlI);
        this.colors = new byte[MapData.lIIlIIIIllIIlI[0]];
        this.playersArrayList = (List<MapInfo>)Lists.newArrayList();
        this.playersHashMap = (Map<EntityPlayer, MapInfo>)Maps.newHashMap();
        this.mapDecorations = (Map<String, Vec4b>)Maps.newLinkedHashMap();
    }
    
    public MapInfo getMapInfo(final EntityPlayer lllllllllllllIIlllIllIIlIIlllllI) {
        MapInfo lllllllllllllIIlllIllIIlIlIIIIII = this.playersHashMap.get(lllllllllllllIIlllIllIIlIIlllllI);
        if (llIIlIIlllllIII(lllllllllllllIIlllIllIIlIlIIIIII)) {
            lllllllllllllIIlllIllIIlIlIIIIII = new MapInfo(lllllllllllllIIlllIllIIlIIlllllI);
            this.playersHashMap.put(lllllllllllllIIlllIllIIlIIlllllI, lllllllllllllIIlllIllIIlIlIIIIII);
            "".length();
            this.playersArrayList.add(lllllllllllllIIlllIllIIlIlIIIIII);
            "".length();
        }
        return lllllllllllllIIlllIllIIlIlIIIIII;
    }
    
    private static boolean llIIlIIlllllIII(final Object lllllllllllllIIlllIllIIIllllllIl) {
        return lllllllllllllIIlllIllIIIllllllIl == null;
    }
    
    private static boolean llIIlIIlllIllll(final int lllllllllllllIIlllIllIIlIIIIIIII, final int lllllllllllllIIlllIllIIIllllllll) {
        return lllllllllllllIIlllIllIIlIIIIIIII < lllllllllllllIIlllIllIIIllllllll;
    }
    
    private static int llIIlIIllllIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIIlllIllIIllIlIlIII) {
        lllllllllllllIIlllIllIIllIlIlIII.setByte(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[11]], this.dimension);
        lllllllllllllIIlllIllIIllIlIlIII.setInteger(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[12]], this.xCenter);
        lllllllllllllIIlllIllIIllIlIlIII.setInteger(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[13]], this.zCenter);
        lllllllllllllIIlllIllIIllIlIlIII.setByte(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[14]], this.scale);
        lllllllllllllIIlllIllIIllIlIlIII.setShort(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[15]], (short)MapData.lIIlIIIIllIIlI[1]);
        lllllllllllllIIlllIllIIllIlIlIII.setShort(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[16]], (short)MapData.lIIlIIIIllIIlI[1]);
        lllllllllllllIIlllIllIIllIlIlIII.setByteArray(MapData.lIIlIIIIllIIIl[MapData.lIIlIIIIllIIlI[17]], this.colors);
    }
    
    private static int llIIlIIllllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Packet getMapPacket(final ItemStack lllllllllllllIIlllIllIIlIlIllIll, final World lllllllllllllIIlllIllIIlIlIllIlI, final EntityPlayer lllllllllllllIIlllIllIIlIlIllIIl) {
        final MapInfo lllllllllllllIIlllIllIIlIlIllIII = this.playersHashMap.get(lllllllllllllIIlllIllIIlIlIllIIl);
        Packet packet;
        if (llIIlIIlllllIII(lllllllllllllIIlllIllIIlIlIllIII)) {
            packet = null;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        else {
            packet = lllllllllllllIIlllIllIIlIlIllIII.getPacket(lllllllllllllIIlllIllIIlIlIllIll);
        }
        return packet;
    }
    
    private static boolean llIIlIIlllIlllI(final int lllllllllllllIIlllIllIIIllllIlIl) {
        return lllllllllllllIIlllIllIIIllllIlIl < 0;
    }
    
    private static boolean llIIlIIllllIIII(final int lllllllllllllIIlllIllIIlIIIIIlII, final int lllllllllllllIIlllIllIIlIIIIIIll) {
        return lllllllllllllIIlllIllIIlIIIIIlII >= lllllllllllllIIlllIllIIlIIIIIIll;
    }
    
    private static String llIIlIIlllIIlll(final String lllllllllllllIIlllIllIIlIIllIIll, final String lllllllllllllIIlllIllIIlIIllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIIlIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIIlIIllIlII.getBytes(StandardCharsets.UTF_8)), MapData.lIIlIIIIllIIlI[11]), "DES");
            final Cipher lllllllllllllIIlllIllIIlIIllIlll = Cipher.getInstance("DES");
            lllllllllllllIIlllIllIIlIIllIlll.init(MapData.lIIlIIIIllIIlI[3], lllllllllllllIIlllIllIIlIIlllIII);
            return new String(lllllllllllllIIlllIllIIlIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIIlIIllIllI) {
            lllllllllllllIIlllIllIIlIIllIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIIlllIllIl(final int lllllllllllllIIlllIllIIlIIIIlIII, final int lllllllllllllIIlllIllIIlIIIIIlll) {
        return lllllllllllllIIlllIllIIlIIIIlIII == lllllllllllllIIlllIllIIlIIIIIlll;
    }
    
    private static boolean llIIlIIllllIllI(final int lllllllllllllIIlllIllIIIllllIlll) {
        return lllllllllllllIIlllIllIIIllllIlll >= 0;
    }
    
    private static int llIIlIIllllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private void updateDecorations(int lllllllllllllIIlllIllIIlIllIlllI, final World lllllllllllllIIlllIllIIlIllIllIl, final String lllllllllllllIIlllIllIIlIllIllII, final double lllllllllllllIIlllIllIIlIllllIll, final double lllllllllllllIIlllIllIIlIllllIlI, double lllllllllllllIIlllIllIIlIllllIIl) {
        final int lllllllllllllIIlllIllIIlIllllIII = MapData.lIIlIIIIllIIlI[2] << this.scale;
        final float lllllllllllllIIlllIllIIlIlllIlll = (float)(lllllllllllllIIlllIllIIlIllllIll - this.xCenter) / lllllllllllllIIlllIllIIlIllllIII;
        final float lllllllllllllIIlllIllIIlIlllIllI = (float)(lllllllllllllIIlllIllIIlIllllIlI - this.zCenter) / lllllllllllllIIlllIllIIlIllllIII;
        byte lllllllllllllIIlllIllIIlIlllIlIl = (byte)(lllllllllllllIIlllIllIIlIlllIlll * 2.0f + 0.5);
        byte lllllllllllllIIlllIllIIlIlllIlII = (byte)(lllllllllllllIIlllIllIIlIlllIllI * 2.0f + 0.5);
        final int lllllllllllllIIlllIllIIlIlllIIll = MapData.lIIlIIIIllIIlI[28];
        byte lllllllllllllIIlllIllIIlIlllIIIl = 0;
        if (llIIlIIllllIllI(llIIlIIllllIIll(lllllllllllllIIlllIllIIlIlllIlll, (float)(-lllllllllllllIIlllIllIIlIlllIIll))) && llIIlIIllllIllI(llIIlIIllllIIll(lllllllllllllIIlllIllIIlIlllIllI, (float)(-lllllllllllllIIlllIllIIlIlllIIll))) && llIIlIIllllIlll(llIIlIIllllIlII(lllllllllllllIIlllIllIIlIlllIlll, (float)lllllllllllllIIlllIllIIlIlllIIll)) && llIIlIIllllIlll(llIIlIIllllIlII(lllllllllllllIIlllIllIIlIlllIllI, (float)lllllllllllllIIlllIllIIlIlllIIll))) {
            double n;
            if (llIIlIIlllIlllI(llIIlIIllllIlIl(lllllllllllllIIlllIllIIlIllllIIl, 0.0))) {
                n = -8.0;
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else {
                n = 8.0;
            }
            lllllllllllllIIlllIllIIlIllllIIl += n;
            byte lllllllllllllIIlllIllIIlIlllIIlI = (byte)(lllllllllllllIIlllIllIIlIllllIIl * 16.0 / 360.0);
            if (llIIlIIlllIlllI(this.dimension)) {
                final int lllllllllllllIIlllIllIIlIlllIIII = (int)(lllllllllllllIIlllIllIIlIllIllIl.getWorldInfo().getWorldTime() / 10L);
                lllllllllllllIIlllIllIIlIlllIIlI = (byte)(lllllllllllllIIlllIllIIlIlllIIII * lllllllllllllIIlllIllIIlIlllIIII * MapData.lIIlIIIIllIIlI[29] + lllllllllllllIIlllIllIIlIlllIIII * MapData.lIIlIIIIllIIlI[30] >> MapData.lIIlIIIIllIIlI[18] & MapData.lIIlIIIIllIIlI[18]);
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            if (!llIIlIIlllIlllI(llIIlIIllllIIll(Math.abs(lllllllllllllIIlllIllIIlIlllIlll), 320.0f)) || llIIlIIllllIllI(llIIlIIllllIIll(Math.abs(lllllllllllllIIlllIllIIlIlllIllI), 320.0f))) {
                this.mapDecorations.remove(lllllllllllllIIlllIllIIlIllIllII);
                "".length();
                return;
            }
            lllllllllllllIIlllIllIIlIllIlllI = MapData.lIIlIIIIllIIlI[9];
            lllllllllllllIIlllIllIIlIlllIIIl = (byte)MapData.lIIlIIIIllIIlI[5];
            if (llIIlIIllllIlll(llIIlIIllllIlII(lllllllllllllIIlllIllIIlIlllIlll, (float)(-lllllllllllllIIlllIllIIlIlllIIll)))) {
                lllllllllllllIIlllIllIIlIlllIlIl = (byte)(lllllllllllllIIlllIllIIlIlllIIll * MapData.lIIlIIIIllIIlI[3] + 2.5);
            }
            if (llIIlIIllllIlll(llIIlIIllllIlII(lllllllllllllIIlllIllIIlIlllIllI, (float)(-lllllllllllllIIlllIllIIlIlllIIll)))) {
                lllllllllllllIIlllIllIIlIlllIlII = (byte)(lllllllllllllIIlllIllIIlIlllIIll * MapData.lIIlIIIIllIIlI[3] + 2.5);
            }
            if (llIIlIIllllIllI(llIIlIIllllIIll(lllllllllllllIIlllIllIIlIlllIlll, (float)lllllllllllllIIlllIllIIlIlllIIll))) {
                lllllllllllllIIlllIllIIlIlllIlIl = (byte)(lllllllllllllIIlllIllIIlIlllIIll * MapData.lIIlIIIIllIIlI[3] + MapData.lIIlIIIIllIIlI[2]);
            }
            if (llIIlIIllllIllI(llIIlIIllllIIll(lllllllllllllIIlllIllIIlIlllIllI, (float)lllllllllllllIIlllIllIIlIlllIIll))) {
                lllllllllllllIIlllIllIIlIlllIlII = (byte)(lllllllllllllIIlllIllIIlIlllIIll * MapData.lIIlIIIIllIIlI[3] + MapData.lIIlIIIIllIIlI[2]);
            }
        }
        this.mapDecorations.put(lllllllllllllIIlllIllIIlIllIllII, new Vec4b((byte)lllllllllllllIIlllIllIIlIllIlllI, lllllllllllllIIlllIllIIlIlllIlIl, lllllllllllllIIlllIllIIlIlllIlII, lllllllllllllIIlllIllIIlIlllIIIl));
        "".length();
    }
    
    public class MapInfo
    {
        private /* synthetic */ boolean field_176105_d;
        private /* synthetic */ int maxY;
        private /* synthetic */ int field_176109_i;
        private static final /* synthetic */ int[] lIlllIlIIllllI;
        private /* synthetic */ int minX;
        private /* synthetic */ int minY;
        private /* synthetic */ int maxX;
        public final /* synthetic */ EntityPlayer entityplayerObj;
        
        public Packet getPacket(final ItemStack llllllllllllIlllllIIIIIlIIllllll) {
            if (lIIIIIlIlIlllIII(this.field_176105_d ? 1 : 0)) {
                this.field_176105_d = (MapInfo.lIlllIlIIllllI[1] != 0);
                return new S34PacketMaps(llllllllllllIlllllIIIIIlIIllllll.getMetadata(), MapData.this.scale, MapData.this.mapDecorations.values(), MapData.this.colors, this.minX, this.minY, this.maxX + MapInfo.lIlllIlIIllllI[0] - this.minX, this.maxY + MapInfo.lIlllIlIIllllI[0] - this.minY);
            }
            final int field_176109_i = this.field_176109_i;
            this.field_176109_i = field_176109_i + MapInfo.lIlllIlIIllllI[0];
            Packet packet;
            if (lIIIIIlIlIlllIIl(field_176109_i % MapInfo.lIlllIlIIllllI[3])) {
                packet = new S34PacketMaps(llllllllllllIlllllIIIIIlIIllllll.getMetadata(), MapData.this.scale, MapData.this.mapDecorations.values(), MapData.this.colors, MapInfo.lIlllIlIIllllI[1], MapInfo.lIlllIlIIllllI[1], MapInfo.lIlllIlIIllllI[1], MapInfo.lIlllIlIIllllI[1]);
                "".length();
                if ((0xA1 ^ 0xA5) <= " ".length()) {
                    return null;
                }
            }
            else {
                packet = null;
            }
            return packet;
        }
        
        public MapInfo(final EntityPlayer llllllllllllIlllllIIIIIlIlIIlIII) {
            this.field_176105_d = (MapInfo.lIlllIlIIllllI[0] != 0);
            this.minX = MapInfo.lIlllIlIIllllI[1];
            this.minY = MapInfo.lIlllIlIIllllI[1];
            this.maxX = MapInfo.lIlllIlIIllllI[2];
            this.maxY = MapInfo.lIlllIlIIllllI[2];
            this.entityplayerObj = llllllllllllIlllllIIIIIlIlIIlIII;
        }
        
        private static void lIIIIIlIlIllIlll() {
            (lIlllIlIIllllI = new int[4])[0] = " ".length();
            MapInfo.lIlllIlIIllllI[1] = ((0x9C ^ 0x8A) & ~(0x8C ^ 0x9A));
            MapInfo.lIlllIlIIllllI[2] = (0x7E ^ 0x16) + (0x2C ^ 0x47) - (0x2E ^ 0x4D) + (0x27 ^ 0x28);
            MapInfo.lIlllIlIIllllI[3] = (90 + 33 - 51 + 56 ^ 39 + 122 - 120 + 92);
        }
        
        public void update(final int llllllllllllIlllllIIIIIlIIllIlll, final int llllllllllllIlllllIIIIIlIIllIllI) {
            if (lIIIIIlIlIlllIII(this.field_176105_d ? 1 : 0)) {
                this.minX = Math.min(this.minX, llllllllllllIlllllIIIIIlIIllIlll);
                this.minY = Math.min(this.minY, llllllllllllIlllllIIIIIlIIllIllI);
                this.maxX = Math.max(this.maxX, llllllllllllIlllllIIIIIlIIllIlll);
                this.maxY = Math.max(this.maxY, llllllllllllIlllllIIIIIlIIllIllI);
                "".length();
                if (-" ".length() >= ((0x2F ^ 0x3E) & ~(0x7E ^ 0x6F))) {
                    return;
                }
            }
            else {
                this.field_176105_d = (MapInfo.lIlllIlIIllllI[0] != 0);
                this.minX = llllllllllllIlllllIIIIIlIIllIlll;
                this.minY = llllllllllllIlllllIIIIIlIIllIllI;
                this.maxX = llllllllllllIlllllIIIIIlIIllIlll;
                this.maxY = llllllllllllIlllllIIIIIlIIllIllI;
            }
        }
        
        static {
            lIIIIIlIlIllIlll();
        }
        
        private static boolean lIIIIIlIlIlllIIl(final int llllllllllllIlllllIIIIIlIIllIIlI) {
            return llllllllllllIlllllIIIIIlIIllIIlI == 0;
        }
        
        private static boolean lIIIIIlIlIlllIII(final int llllllllllllIlllllIIIIIlIIllIlII) {
            return llllllllllllIlllllIIIIIlIIllIlII != 0;
        }
    }
}
