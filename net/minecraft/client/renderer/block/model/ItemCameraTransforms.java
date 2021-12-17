// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import com.google.gson.JsonObject;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import net.minecraft.client.renderer.GlStateManager;

public class ItemCameraTransforms
{
    public static /* synthetic */ float field_181694_f;
    public final /* synthetic */ ItemTransformVec3f head;
    public final /* synthetic */ ItemTransformVec3f fixed;
    public final /* synthetic */ ItemTransformVec3f firstPerson;
    public final /* synthetic */ ItemTransformVec3f ground;
    public static /* synthetic */ float field_181697_i;
    public static /* synthetic */ float field_181692_d;
    public static /* synthetic */ float field_181693_e;
    public final /* synthetic */ ItemTransformVec3f gui;
    public static /* synthetic */ float field_181696_h;
    private static final /* synthetic */ int[] lIIlIlIIIllIll;
    public static /* synthetic */ float field_181691_c;
    public static /* synthetic */ float field_181690_b;
    public final /* synthetic */ ItemTransformVec3f thirdPerson;
    public static /* synthetic */ float field_181695_g;
    public static /* synthetic */ float field_181698_j;
    
    private static boolean llIIlllllIIllII(final Object lllllllllllllIIllIlIIllIIIlIlllI, final Object lllllllllllllIIllIlIIllIIIlIllIl) {
        return lllllllllllllIIllIlIIllIIIlIlllI != lllllllllllllIIllIlIIllIIIlIllIl;
    }
    
    private static boolean llIIlllllIIllIl(final int lllllllllllllIIllIlIIllIIIlIlIIl) {
        return lllllllllllllIIllIlIIllIIIlIlIIl != 0;
    }
    
    static {
        llIIlllllIIlIll();
        DEFAULT = new ItemCameraTransforms();
        ItemCameraTransforms.field_181690_b = 0.0f;
        ItemCameraTransforms.field_181691_c = 0.0f;
        ItemCameraTransforms.field_181692_d = 0.0f;
        ItemCameraTransforms.field_181693_e = 0.0f;
        ItemCameraTransforms.field_181694_f = 0.0f;
        ItemCameraTransforms.field_181695_g = 0.0f;
        ItemCameraTransforms.field_181696_h = 0.0f;
        ItemCameraTransforms.field_181697_i = 0.0f;
        ItemCameraTransforms.field_181698_j = 0.0f;
    }
    
    public ItemCameraTransforms(final ItemCameraTransforms lllllllllllllIIllIlIIllIIlIlllll) {
        this.thirdPerson = lllllllllllllIIllIlIIllIIlIlllll.thirdPerson;
        this.firstPerson = lllllllllllllIIllIlIIllIIlIlllll.firstPerson;
        this.head = lllllllllllllIIllIlIIllIIlIlllll.head;
        this.gui = lllllllllllllIIllIlIIllIIlIlllll.gui;
        this.ground = lllllllllllllIIllIlIIllIIlIlllll.ground;
        this.fixed = lllllllllllllIIllIlIIllIIlIlllll.fixed;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemCameraTransforms$TransformType() {
        final int[] $switch_TABLE$net$minecraft$client$renderer$block$model$ItemCameraTransforms$TransformType = ItemCameraTransforms.$SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemCameraTransforms$TransformType;
        if (llIIlllllIIlllI($switch_TABLE$net$minecraft$client$renderer$block$model$ItemCameraTransforms$TransformType)) {
            return $switch_TABLE$net$minecraft$client$renderer$block$model$ItemCameraTransforms$TransformType;
        }
        "".length();
        final Exception lllllllllllllIIllIlIIllIIIllIIIl = (Object)new int[TransformType.values().length];
        try {
            lllllllllllllIIllIlIIllIIIllIIIl[TransformType.FIRST_PERSON.ordinal()] = ItemCameraTransforms.lIIlIlIIIllIll[2];
            "".length();
            if (-(0xC0 ^ 0xC5) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIIllIIIllIIIl[TransformType.FIXED.ordinal()] = ItemCameraTransforms.lIIlIlIIIllIll[3];
            "".length();
            if ("  ".length() < ((0x36 ^ 0x9) & ~(0x95 ^ 0xAA))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIIllIIIllIIIl[TransformType.GROUND.ordinal()] = ItemCameraTransforms.lIIlIlIIIllIll[4];
            "".length();
            if (((0x62 ^ 0x79) & ~(0x8F ^ 0x94)) > ((0xD5 ^ 0xC3) & ~(0x33 ^ 0x25))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIIllIIIllIIIl[TransformType.GUI.ordinal()] = ItemCameraTransforms.lIIlIlIIIllIll[5];
            "".length();
            if (((0xE2 ^ 0xAB) & ~(0x1B ^ 0x52)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIIllIIIllIIIl[TransformType.HEAD.ordinal()] = ItemCameraTransforms.lIIlIlIIIllIll[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIIllIIIllIIIl[TransformType.NONE.ordinal()] = ItemCameraTransforms.lIIlIlIIIllIll[1];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIIllIIIllIIIl[TransformType.THIRD_PERSON.ordinal()] = ItemCameraTransforms.lIIlIlIIIllIll[7];
            "".length();
            if (((0x3C ^ 0x71 ^ (0x5A ^ 0xD)) & (0xBD ^ 0x85 ^ (0x53 ^ 0x71) ^ -" ".length())) != ((0x54 ^ 0x8 ^ (0x22 ^ 0x3A)) & (0x62 ^ 0x76 ^ (0xF1 ^ 0xA1) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return ItemCameraTransforms.$SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemCameraTransforms$TransformType = (int[])(Object)lllllllllllllIIllIlIIllIIIllIIIl;
    }
    
    public ItemCameraTransforms(final ItemTransformVec3f lllllllllllllIIllIlIIllIIlIlIlII, final ItemTransformVec3f lllllllllllllIIllIlIIllIIlIlIIll, final ItemTransformVec3f lllllllllllllIIllIlIIllIIlIlIIlI, final ItemTransformVec3f lllllllllllllIIllIlIIllIIlIIlIlI, final ItemTransformVec3f lllllllllllllIIllIlIIllIIlIIlIIl, final ItemTransformVec3f lllllllllllllIIllIlIIllIIlIIllll) {
        this.thirdPerson = lllllllllllllIIllIlIIllIIlIlIlII;
        this.firstPerson = lllllllllllllIIllIlIIllIIlIlIIll;
        this.head = lllllllllllllIIllIlIIllIIlIlIIlI;
        this.gui = lllllllllllllIIllIlIIllIIlIIlIlI;
        this.ground = lllllllllllllIIllIlIIllIIlIIlIIl;
        this.fixed = lllllllllllllIIllIlIIllIIlIIllll;
    }
    
    private ItemCameraTransforms() {
        this(ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT);
    }
    
    public void applyTransform(final TransformType lllllllllllllIIllIlIIllIIlIIIIll) {
        final ItemTransformVec3f lllllllllllllIIllIlIIllIIlIIIIlI = this.getTransform(lllllllllllllIIllIlIIllIIlIIIIll);
        if (llIIlllllIIllII(lllllllllllllIIllIlIIllIIlIIIIlI, ItemTransformVec3f.DEFAULT)) {
            GlStateManager.translate(lllllllllllllIIllIlIIllIIlIIIIlI.translation.x + ItemCameraTransforms.field_181690_b, lllllllllllllIIllIlIIllIIlIIIIlI.translation.y + ItemCameraTransforms.field_181691_c, lllllllllllllIIllIlIIllIIlIIIIlI.translation.z + ItemCameraTransforms.field_181692_d);
            GlStateManager.rotate(lllllllllllllIIllIlIIllIIlIIIIlI.rotation.y + ItemCameraTransforms.field_181694_f, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(lllllllllllllIIllIlIIllIIlIIIIlI.rotation.x + ItemCameraTransforms.field_181693_e, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(lllllllllllllIIllIlIIllIIlIIIIlI.rotation.z + ItemCameraTransforms.field_181695_g, 0.0f, 0.0f, 1.0f);
            GlStateManager.scale(lllllllllllllIIllIlIIllIIlIIIIlI.scale.x + ItemCameraTransforms.field_181696_h, lllllllllllllIIllIlIIllIIlIIIIlI.scale.y + ItemCameraTransforms.field_181697_i, lllllllllllllIIllIlIIllIIlIIIIlI.scale.z + ItemCameraTransforms.field_181698_j);
        }
    }
    
    private static boolean llIIlllllIIlllI(final Object lllllllllllllIIllIlIIllIIIlIlIll) {
        return lllllllllllllIIllIlIIllIIIlIlIll != null;
    }
    
    private static void llIIlllllIIlIll() {
        (lIIlIlIIIllIll = new int[8])[0] = ((0x4E ^ 0x79) & ~(0x87 ^ 0xB0));
        ItemCameraTransforms.lIIlIlIIIllIll[1] = " ".length();
        ItemCameraTransforms.lIIlIlIIIllIll[2] = "   ".length();
        ItemCameraTransforms.lIIlIlIIIllIll[3] = (0x9B ^ 0x9C);
        ItemCameraTransforms.lIIlIlIIIllIll[4] = (113 + 141 - 130 + 71 ^ 80 + 103 - 56 + 70);
        ItemCameraTransforms.lIIlIlIIIllIll[5] = (0x4F ^ 0x4A);
        ItemCameraTransforms.lIIlIlIIIllIll[6] = (0x22 ^ 0x26);
        ItemCameraTransforms.lIIlIlIIIllIll[7] = "  ".length();
    }
    
    public boolean func_181687_c(final TransformType lllllllllllllIIllIlIIllIIIllIlIl) {
        int n;
        if (llIIlllllIIllIl(this.getTransform(lllllllllllllIIllIlIIllIIIllIlIl).equals(ItemTransformVec3f.DEFAULT) ? 1 : 0)) {
            n = ItemCameraTransforms.lIIlIlIIIllIll[0];
            "".length();
            if (-(0x2 ^ 0x7) >= 0) {
                return ((0x46 ^ 0x5C) & ~(0xBB ^ 0xA1)) != 0x0;
            }
        }
        else {
            n = ItemCameraTransforms.lIIlIlIIIllIll[1];
        }
        return n != 0;
    }
    
    public ItemTransformVec3f getTransform(final TransformType lllllllllllllIIllIlIIllIIIlllIIl) {
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$block$model$ItemCameraTransforms$TransformType()[lllllllllllllIIllIlIIllIIIlllIIl.ordinal()]) {
            case 2: {
                return this.thirdPerson;
            }
            case 3: {
                return this.firstPerson;
            }
            case 4: {
                return this.head;
            }
            case 5: {
                return this.gui;
            }
            case 6: {
                return this.ground;
            }
            case 7: {
                return this.fixed;
            }
            default: {
                return ItemTransformVec3f.DEFAULT;
            }
        }
    }
    
    static class Deserializer implements JsonDeserializer<ItemCameraTransforms>
    {
        private static final /* synthetic */ String[] lIIIIlIllIlllI;
        private static final /* synthetic */ int[] lIIIIlIlllIlII;
        
        private static boolean lIlllIlIlIlllII(final int lllllllllllllIlIIlIlIIIlIllIlIlI) {
            return lllllllllllllIlIIlIlIIIlIllIlIlI != 0;
        }
        
        static {
            lIlllIlIlIllIll();
            lIlllIlIlIIllll();
        }
        
        private static String lIlllIlIlIIlIll(final String lllllllllllllIlIIlIlIIIlIlllIIll, final String lllllllllllllIlIIlIlIIIlIlllIIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIlIIIlIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), Deserializer.lIIIIlIlllIlII[7]), "DES");
                final Cipher lllllllllllllIlIIlIlIIIlIlllIlll = Cipher.getInstance("DES");
                lllllllllllllIlIIlIlIIIlIlllIlll.init(Deserializer.lIIIIlIlllIlII[2], lllllllllllllIlIIlIlIIIlIllllIII);
                return new String(lllllllllllllIlIIlIlIIIlIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIlIIIlIlllIllI) {
                lllllllllllllIlIIlIlIIIlIlllIllI.printStackTrace();
                return null;
            }
        }
        
        private static void lIlllIlIlIllIll() {
            (lIIIIlIlllIlII = new int[8])[0] = ((0x6D ^ 0x38 ^ (0x9A ^ 0x97)) & (0xCB ^ 0xA8 ^ (0x51 ^ 0x6A) ^ -" ".length()));
            Deserializer.lIIIIlIlllIlII[1] = " ".length();
            Deserializer.lIIIIlIlllIlII[2] = "  ".length();
            Deserializer.lIIIIlIlllIlII[3] = "   ".length();
            Deserializer.lIIIIlIlllIlII[4] = (0x2D ^ 0x29);
            Deserializer.lIIIIlIlllIlII[5] = (0x95 ^ 0x90);
            Deserializer.lIIIIlIlllIlII[6] = (0x36 ^ 0x30);
            Deserializer.lIIIIlIlllIlII[7] = (0x34 ^ 0x3C);
        }
        
        public ItemCameraTransforms deserialize(final JsonElement lllllllllllllIlIIlIlIIIllllIIIll, final Type lllllllllllllIlIIlIlIIIllllllIII, final JsonDeserializationContext lllllllllllllIlIIlIlIIIlllllIllI) throws JsonParseException {
            final JsonObject lllllllllllllIlIIlIlIIIlllllIlII = lllllllllllllIlIIlIlIIIllllIIIll.getAsJsonObject();
            final ItemTransformVec3f lllllllllllllIlIIlIlIIIlllllIIlI = this.func_181683_a(lllllllllllllIlIIlIlIIIlllllIllI, lllllllllllllIlIIlIlIIIlllllIlII, Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[0]]);
            final ItemTransformVec3f lllllllllllllIlIIlIlIIIlllllIIII = this.func_181683_a(lllllllllllllIlIIlIlIIIlllllIllI, lllllllllllllIlIIlIlIIIlllllIlII, Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[1]]);
            final ItemTransformVec3f lllllllllllllIlIIlIlIIIllllIllIl = this.func_181683_a(lllllllllllllIlIIlIlIIIlllllIllI, lllllllllllllIlIIlIlIIIlllllIlII, Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[2]]);
            final ItemTransformVec3f lllllllllllllIlIIlIlIIIllllIlIll = this.func_181683_a(lllllllllllllIlIIlIlIIIlllllIllI, lllllllllllllIlIIlIlIIIlllllIlII, Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[3]]);
            final ItemTransformVec3f lllllllllllllIlIIlIlIIIllllIlIIl = this.func_181683_a(lllllllllllllIlIIlIlIIIlllllIllI, lllllllllllllIlIIlIlIIIlllllIlII, Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[4]]);
            final ItemTransformVec3f lllllllllllllIlIIlIlIIIllllIIlll = this.func_181683_a(lllllllllllllIlIIlIlIIIlllllIllI, lllllllllllllIlIIlIlIIIlllllIlII, Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[5]]);
            return new ItemCameraTransforms(lllllllllllllIlIIlIlIIIlllllIIlI, lllllllllllllIlIIlIlIIIlllllIIII, lllllllllllllIlIIlIlIIIllllIllIl, lllllllllllllIlIIlIlIIIllllIlIll, lllllllllllllIlIIlIlIIIllllIlIIl, lllllllllllllIlIIlIlIIIllllIIlll);
        }
        
        private static boolean lIlllIlIlIlllIl(final int lllllllllllllIlIIlIlIIIlIllIllIl, final int lllllllllllllIlIIlIlIIIlIllIllII) {
            return lllllllllllllIlIIlIlIIIlIllIllIl < lllllllllllllIlIIlIlIIIlIllIllII;
        }
        
        private static String lIlllIlIlIIlIlI(String lllllllllllllIlIIlIlIIIllIIIIlIl, final String lllllllllllllIlIIlIlIIIllIIIIlII) {
            lllllllllllllIlIIlIlIIIllIIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIlIlIIIllIIIlIII = new StringBuilder();
            final char[] lllllllllllllIlIIlIlIIIllIIIIlll = lllllllllllllIlIIlIlIIIllIIIIlII.toCharArray();
            int lllllllllllllIlIIlIlIIIllIIIIllI = Deserializer.lIIIIlIlllIlII[0];
            final long lllllllllllllIlIIlIlIIIllIIIIIII = (Object)lllllllllllllIlIIlIlIIIllIIIIlIl.toCharArray();
            final int lllllllllllllIlIIlIlIIIlIlllllll = lllllllllllllIlIIlIlIIIllIIIIIII.length;
            double lllllllllllllIlIIlIlIIIlIllllllI = Deserializer.lIIIIlIlllIlII[0];
            while (lIlllIlIlIlllIl((int)lllllllllllllIlIIlIlIIIlIllllllI, lllllllllllllIlIIlIlIIIlIlllllll)) {
                final char lllllllllllllIlIIlIlIIIllIIIlIll = lllllllllllllIlIIlIlIIIllIIIIIII[lllllllllllllIlIIlIlIIIlIllllllI];
                lllllllllllllIlIIlIlIIIllIIIlIII.append((char)(lllllllllllllIlIIlIlIIIllIIIlIll ^ lllllllllllllIlIIlIlIIIllIIIIlll[lllllllllllllIlIIlIlIIIllIIIIllI % lllllllllllllIlIIlIlIIIllIIIIlll.length]));
                "".length();
                ++lllllllllllllIlIIlIlIIIllIIIIllI;
                ++lllllllllllllIlIIlIlIIIlIllllllI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIlIlIIIllIIIlIII);
        }
        
        private static void lIlllIlIlIIllll() {
            (lIIIIlIllIlllI = new String[Deserializer.lIIIIlIlllIlII[6]])[Deserializer.lIIIIlIlllIlII[0]] = lIlllIlIlIIlIlI("MCYCBzM0KxkGOCo=", "DNkuW");
            Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[1]] = lIlllIlIlIIlIll("2YYXXPpUl7DgndevyZeJuA==", "BiEoT");
            Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[2]] = lIlllIlIlIIlIlI("LQcZIA==", "EbxDC");
            Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[3]] = lIlllIlIlIIllII("1SEwwoD3u2o=", "OoZQU");
            Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[4]] = lIlllIlIlIIlIll("uXNx7QWdX4g=", "HOerE");
            Deserializer.lIIIIlIllIlllI[Deserializer.lIIIIlIlllIlII[5]] = lIlllIlIlIIllII("SrwFgm3gyTo=", "Cvyvf");
        }
        
        private ItemTransformVec3f func_181683_a(final JsonDeserializationContext lllllllllllllIlIIlIlIIIlllIIIllI, final JsonObject lllllllllllllIlIIlIlIIIlllIIIIII, final String lllllllllllllIlIIlIlIIIllIllllll) {
            ItemTransformVec3f default1;
            if (lIlllIlIlIlllII(lllllllllllllIlIIlIlIIIlllIIIIII.has(lllllllllllllIlIIlIlIIIllIllllll) ? 1 : 0)) {
                default1 = (ItemTransformVec3f)lllllllllllllIlIIlIlIIIlllIIIllI.deserialize(lllllllllllllIlIIlIlIIIlllIIIIII.get(lllllllllllllIlIIlIlIIIllIllllll), (Type)ItemTransformVec3f.class);
                "".length();
                if ("   ".length() <= ((163 + 12 - 150 + 153 ^ 2 + 57 + 5 + 95) & (16 + 46 - 31 + 155 ^ 5 + 138 - 54 + 62 ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                default1 = ItemTransformVec3f.DEFAULT;
            }
            return default1;
        }
        
        private static String lIlllIlIlIIllII(final String lllllllllllllIlIIlIlIIIllIIllIlI, final String lllllllllllllIlIIlIlIIIllIIllIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIlIIIllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIIllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIlIlIIIllIIllllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIlIlIIIllIIllllI.init(Deserializer.lIIIIlIlllIlII[2], lllllllllllllIlIIlIlIIIllIIlllll);
                return new String(lllllllllllllIlIIlIlIIIllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIlIIIllIIlllII) {
                lllllllllllllIlIIlIlIIIllIIlllII.printStackTrace();
                return null;
            }
        }
    }
    
    public enum TransformType
    {
        GROUND(TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[5]], TransformType.lIlIIIIllllIIl[5]), 
        FIRST_PERSON(TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[2]], TransformType.lIlIIIIllllIIl[2]), 
        THIRD_PERSON(TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[1]], TransformType.lIlIIIIllllIIl[1]), 
        HEAD(TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[3]], TransformType.lIlIIIIllllIIl[3]);
        
        private static final /* synthetic */ String[] lIlIIIIlllIlll;
        
        GUI(TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[4]], TransformType.lIlIIIIllllIIl[4]), 
        NONE(TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[0]], TransformType.lIlIIIIllllIIl[0]);
        
        private static final /* synthetic */ int[] lIlIIIIllllIIl;
        
        FIXED(TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[6]], TransformType.lIlIIIIllllIIl[6]);
        
        private TransformType(final String lllllllllllllIIlIIIIIIIllIIIIIll, final int lllllllllllllIIlIIIIIIIllIIIIIlI) {
        }
        
        private static String lllIIIlIIIIllII(final String lllllllllllllIIlIIIIIIIlIllIIlIl, final String lllllllllllllIIlIIIIIIIlIllIIlII) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIIIIlIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIIIIIIlIllIIlll = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIIIIIIlIllIIlll.init(TransformType.lIlIIIIllllIIl[2], lllllllllllllIIlIIIIIIIlIllIlIII);
                return new String(lllllllllllllIIlIIIIIIIlIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIIlIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIIIIlIllIIllI) {
                lllllllllllllIIlIIIIIIIlIllIIllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lllIIIlIIIlIllI();
            lllIIIlIIIIlllI();
            final TransformType[] enum$VALUES = new TransformType[TransformType.lIlIIIIllllIIl[7]];
            enum$VALUES[TransformType.lIlIIIIllllIIl[0]] = TransformType.NONE;
            enum$VALUES[TransformType.lIlIIIIllllIIl[1]] = TransformType.THIRD_PERSON;
            enum$VALUES[TransformType.lIlIIIIllllIIl[2]] = TransformType.FIRST_PERSON;
            enum$VALUES[TransformType.lIlIIIIllllIIl[3]] = TransformType.HEAD;
            enum$VALUES[TransformType.lIlIIIIllllIIl[4]] = TransformType.GUI;
            enum$VALUES[TransformType.lIlIIIIllllIIl[5]] = TransformType.GROUND;
            enum$VALUES[TransformType.lIlIIIIllllIIl[6]] = TransformType.FIXED;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lllIIIlIIIIlllI() {
            (lIlIIIIlllIlll = new String[TransformType.lIlIIIIllllIIl[7]])[TransformType.lIlIIIIllllIIl[0]] = lllIIIlIIIIlIlI("Kyo4Mw==", "eevvW");
            TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[1]] = lllIIIlIIIIlIll("YrVCcY8ZeOFeKONzXPckqg==", "UgDEv");
            TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[2]] = lllIIIlIIIIllII("eOCn6raiR8lzQ8pq47UOIw==", "AzdWX");
            TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[3]] = lllIIIlIIIIlIll("//4DE+7LLeA=", "WwxPz");
            TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[4]] = lllIIIlIIIIlIlI("Lwwv", "hYfJB");
            TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[5]] = lllIIIlIIIIllII("OP5KnvX0+1A=", "vmDqV");
            TransformType.lIlIIIIlllIlll[TransformType.lIlIIIIllllIIl[6]] = lllIIIlIIIIllII("3zLe8k47uAk=", "SmzPi");
        }
        
        private static boolean lllIIIlIIIlIlll(final int lllllllllllllIIlIIIIIIIlIlIIIlIl, final int lllllllllllllIIlIIIIIIIlIlIIIlII) {
            return lllllllllllllIIlIIIIIIIlIlIIIlIl < lllllllllllllIIlIIIIIIIlIlIIIlII;
        }
        
        private static String lllIIIlIIIIlIlI(String lllllllllllllIIlIIIIIIIlIlIlIIII, final String lllllllllllllIIlIIIIIIIlIlIlIlII) {
            lllllllllllllIIlIIIIIIIlIlIlIIII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIIIIIlIlIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIIIIIlIlIlIIll = new StringBuilder();
            final char[] lllllllllllllIIlIIIIIIIlIlIlIIlI = lllllllllllllIIlIIIIIIIlIlIlIlII.toCharArray();
            int lllllllllllllIIlIIIIIIIlIlIlIIIl = TransformType.lIlIIIIllllIIl[0];
            final long lllllllllllllIIlIIIIIIIlIlIIlIll = (Object)((String)lllllllllllllIIlIIIIIIIlIlIlIIII).toCharArray();
            final Exception lllllllllllllIIlIIIIIIIlIlIIlIlI = (Exception)lllllllllllllIIlIIIIIIIlIlIIlIll.length;
            double lllllllllllllIIlIIIIIIIlIlIIlIIl = TransformType.lIlIIIIllllIIl[0];
            while (lllIIIlIIIlIlll((int)lllllllllllllIIlIIIIIIIlIlIIlIIl, (int)lllllllllllllIIlIIIIIIIlIlIIlIlI)) {
                final char lllllllllllllIIlIIIIIIIlIlIlIllI = lllllllllllllIIlIIIIIIIlIlIIlIll[lllllllllllllIIlIIIIIIIlIlIIlIIl];
                lllllllllllllIIlIIIIIIIlIlIlIIll.append((char)(lllllllllllllIIlIIIIIIIlIlIlIllI ^ lllllllllllllIIlIIIIIIIlIlIlIIlI[lllllllllllllIIlIIIIIIIlIlIlIIIl % lllllllllllllIIlIIIIIIIlIlIlIIlI.length]));
                "".length();
                ++lllllllllllllIIlIIIIIIIlIlIlIIIl;
                ++lllllllllllllIIlIIIIIIIlIlIIlIIl;
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIIIIIlIlIlIIll);
        }
        
        private static String lllIIIlIIIIlIll(final String lllllllllllllIIlIIIIIIIlIlllIIII, final String lllllllllllllIIlIIIIIIIlIlllIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIIIIlIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIIlIlllIIIl.getBytes(StandardCharsets.UTF_8)), TransformType.lIlIIIIllllIIl[8]), "DES");
                final Cipher lllllllllllllIIlIIIIIIIlIlllIlII = Cipher.getInstance("DES");
                lllllllllllllIIlIIIIIIIlIlllIlII.init(TransformType.lIlIIIIllllIIl[2], lllllllllllllIIlIIIIIIIlIlllIlIl);
                return new String(lllllllllllllIIlIIIIIIIlIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIIlIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIIIIlIlllIIll) {
                lllllllllllllIIlIIIIIIIlIlllIIll.printStackTrace();
                return null;
            }
        }
        
        private static void lllIIIlIIIlIllI() {
            (lIlIIIIllllIIl = new int[9])[0] = ((0x13 ^ 0x3C ^ (0xF4 ^ 0x97)) & (" ".length() ^ (0x65 ^ 0x28) ^ -" ".length()));
            TransformType.lIlIIIIllllIIl[1] = " ".length();
            TransformType.lIlIIIIllllIIl[2] = "  ".length();
            TransformType.lIlIIIIllllIIl[3] = "   ".length();
            TransformType.lIlIIIIllllIIl[4] = (100 + 43 - 108 + 121 ^ 121 + 147 - 210 + 94);
            TransformType.lIlIIIIllllIIl[5] = (0x48 ^ 0x4D);
            TransformType.lIlIIIIllllIIl[6] = (0x2D ^ 0x2B);
            TransformType.lIlIIIIllllIIl[7] = (0x9A ^ 0x85 ^ (0x97 ^ 0x8F));
            TransformType.lIlIIIIllllIIl[8] = (0x5 ^ 0x20 ^ (0x9A ^ 0xB7));
        }
    }
}
