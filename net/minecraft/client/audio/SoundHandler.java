// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import java.util.Iterator;
import net.minecraft.util.RegistrySimple;
import java.io.FileNotFoundException;
import org.apache.commons.io.IOUtils;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import net.minecraft.client.resources.IResource;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.settings.GameSettings;
import java.util.Map;
import java.io.InputStream;
import net.minecraft.client.resources.IResourceManager;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;
import java.lang.reflect.ParameterizedType;
import net.minecraft.util.ITickable;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class SoundHandler implements IResourceManagerReloadListener, ITickable
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type;
    private static final /* synthetic */ String[] lIIIllllIIIIll;
    private static final /* synthetic */ Logger logger;
    public static final /* synthetic */ SoundPoolEntry missing_sound;
    private static final /* synthetic */ int[] lIIIllllIIIlll;
    private final /* synthetic */ SoundManager sndManager;
    private final /* synthetic */ IResourceManager mcResourceManager;
    private final /* synthetic */ SoundRegistry sndRegistry;
    
    private static void llIIIllllIIlIll() {
        (lIIIllllIIIlll = new int[12])[0] = ((0x8A ^ 0xA1 ^ (0xC0 ^ 0xC5)) & (0x71 ^ 0x7B ^ (0x7 ^ 0x23) ^ -" ".length()));
        SoundHandler.lIIIllllIIIlll[1] = " ".length();
        SoundHandler.lIIIllllIIIlll[2] = "  ".length();
        SoundHandler.lIIIllllIIIlll[3] = "   ".length();
        SoundHandler.lIIIllllIIIlll[4] = (0x6D ^ 0x69);
        SoundHandler.lIIIllllIIIlll[5] = (0x22 ^ 0x27);
        SoundHandler.lIIIllllIIIlll[6] = (26 + 12 - 20 + 177 ^ 13 + 9 + 141 + 34);
        SoundHandler.lIIIllllIIIlll[7] = (0xA3 ^ 0x9C ^ (0x6B ^ 0x53));
        SoundHandler.lIIIllllIIIlll[8] = (174 + 95 - 136 + 48 ^ 87 + 14 + 67 + 21);
        SoundHandler.lIIIllllIIIlll[9] = (0x36 ^ 0x7 ^ (0x32 ^ 0xA));
        SoundHandler.lIIIllllIIIlll[10] = (13 + 107 - 39 + 50 ^ 121 + 118 - 200 + 98);
        SoundHandler.lIIIllllIIIlll[11] = (85 + 121 - 189 + 136 ^ 7 + 41 - 27 + 125);
    }
    
    private static void llIIIllllIIIIlI() {
        (lIIIllllIIIIll = new String[SoundHandler.lIIIllllIIIlll[11]])[SoundHandler.lIIIllllIIIlll[0]] = llIIIlllIllllll("PBwDD1s8EAQdCD8eKB0OJBcT", "Qywna");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[1]] = llIIIlllIllllll("FDkyABQUeC0dHwk=", "gVGnp");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[2]] = llIIIlllIllllll("HwcFMi0/DVMgLiMHFyBvPBocPQ==", "VisSA");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[3]] = llIIIlllIllllll("NikXOwcHKQN3FQs5CTNGAToCORJEIAg0BxAlCDlGHzE=", "dLgWf");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[4]] = llIIIllllIIIIII("pNohqss5qXM=", "ZUKvm");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[5]] = llIIIllllIIIIIl("fbX1vg9kBzQ=", "qjFfH");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[6]] = llIIIlllIllllll("bBkABA==", "Bvgcw");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[7]] = llIIIlllIllllll("Fhg4B0krDHQGBjUCdAwGJFExGgAjBXhCCjEfOg0dcBAwBkk5BXQWBnAUIgcHJFEvHw==", "PqTbi");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[8]] = llIIIlllIllllll("ER8ZBhFyHgMeVT4fDQ5VIR8ZBBFyFgUGEHI=", "Rplju");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[9]] = llIIIlllIllllll("QG00FB4CIiNVEQgpdxwETDk4VRUaKDkBUA==", "lMWup");
        SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[10]] = llIIIllllIIIIIl("OKm+Oy35+A0RG/EzozW+Aw==", "kLarx");
    }
    
    public void resumeSounds() {
        this.sndManager.resumeAllSounds();
    }
    
    private static boolean llIIIllllIlIIlI(final int lllllllllllllIIllllIlIIlIIIlIlII, final int lllllllllllllIIllllIlIIlIIIlIIll) {
        return lllllllllllllIIllllIlIIlIIIlIlII < lllllllllllllIIllllIlIIlIIIlIIll;
    }
    
    protected Map<String, SoundList> getSoundMap(final InputStream lllllllllllllIIllllIlIIlllIlIIIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Ljava/io/InputStreamReader;
        //     6: dup            
        //     7: aload_1         /* lllllllllllllIIllllIlIIlllIlIlII */
        //     8: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    11: getstatic       net/minecraft/client/audio/SoundHandler.TYPE:Ljava/lang/reflect/ParameterizedType;
        //    14: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
        //    17: checkcast       Ljava/util/Map;
        //    20: astore_2        /* lllllllllllllIIllllIlIIlllIlIIll */
        //    21: ldc             ""
        //    23: invokevirtual   java/lang/String.length:()I
        //    26: pop            
        //    27: aconst_null    
        //    28: ifnull          40
        //    31: aconst_null    
        //    32: areturn        
        //    33: astore_3        /* lllllllllllllIIllllIlIIlllIIllll */
        //    34: aload_1         /* lllllllllllllIIllllIlIIlllIlIlII */
        //    35: invokestatic    org/apache/commons/io/IOUtils.closeQuietly:(Ljava/io/InputStream;)V
        //    38: aload_3         /* lllllllllllllIIllllIlIIlllIIllll */
        //    39: athrow         
        //    40: aload_1         /* lllllllllllllIIllllIlIIlllIlIlII */
        //    41: invokestatic    org/apache/commons/io/IOUtils.closeQuietly:(Ljava/io/InputStream;)V
        //    44: aload_2         /* lllllllllllllIIllllIlIIlllIlIIlI */
        //    45: areturn        
        //    Signature:
        //  (Ljava/io/InputStream;)Ljava/util/Map<Ljava/lang/String;Lnet/minecraft/client/audio/SoundList;>;
        //    StackMapTable: 00 02 61 07 00 9E FC 00 06 07 00 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      33     33     40     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void playSound(final ISound lllllllllllllIIllllIlIIllIIlIllI) {
        this.sndManager.playSound(lllllllllllllIIllllIlIIllIIlIllI);
    }
    
    public SoundHandler(final IResourceManager lllllllllllllIIllllIlIIlllllIllI, final GameSettings lllllllllllllIIllllIlIIlllllIlIl) {
        this.sndRegistry = new SoundRegistry();
        this.mcResourceManager = lllllllllllllIIllllIlIIlllllIllI;
        this.sndManager = new SoundManager(this, lllllllllllllIIllllIlIIlllllIlIl);
    }
    
    public void setSoundLevel(final SoundCategory lllllllllllllIIllllIlIIlIllIlllI, final float lllllllllllllIIllllIlIIlIllIllIl) {
        if (llIIIllllIIllll(lllllllllllllIIllllIlIIlIllIlllI, SoundCategory.MASTER) && llIIIllllIlIIII(llIIIllllIIlllI(lllllllllllllIIllllIlIIlIllIllIl, 0.0f))) {
            this.stopSounds();
        }
        this.sndManager.setSoundCategoryVolume(lllllllllllllIIllllIlIIlIllIlllI, lllllllllllllIIllllIlIIlIllIllIl);
    }
    
    public SoundEventAccessorComposite getSound(final ResourceLocation lllllllllllllIIllllIlIIllIIlllII) {
        return this.sndRegistry.getObject(lllllllllllllIIllllIlIIllIIlllII);
    }
    
    public boolean isSoundPlaying(final ISound lllllllllllllIIllllIlIIlIlIIllll) {
        return this.sndManager.isSoundPlaying(lllllllllllllIIllllIlIIlIlIIllll);
    }
    
    private static String llIIIlllIllllll(String lllllllllllllIIllllIlIIlIIIlllll, final String lllllllllllllIIllllIlIIlIIlIIIll) {
        lllllllllllllIIllllIlIIlIIIlllll = new String(Base64.getDecoder().decode(lllllllllllllIIllllIlIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIlIIlIIlIIIlI = new StringBuilder();
        final char[] lllllllllllllIIllllIlIIlIIlIIIIl = lllllllllllllIIllllIlIIlIIlIIIll.toCharArray();
        int lllllllllllllIIllllIlIIlIIlIIIII = SoundHandler.lIIIllllIIIlll[0];
        final long lllllllllllllIIllllIlIIlIIIllIlI = (Object)lllllllllllllIIllllIlIIlIIIlllll.toCharArray();
        final short lllllllllllllIIllllIlIIlIIIllIIl = (short)lllllllllllllIIllllIlIIlIIIllIlI.length;
        String lllllllllllllIIllllIlIIlIIIllIII = (String)SoundHandler.lIIIllllIIIlll[0];
        while (llIIIllllIlIIlI((int)lllllllllllllIIllllIlIIlIIIllIII, lllllllllllllIIllllIlIIlIIIllIIl)) {
            final char lllllllllllllIIllllIlIIlIIlIIlIl = lllllllllllllIIllllIlIIlIIIllIlI[lllllllllllllIIllllIlIIlIIIllIII];
            lllllllllllllIIllllIlIIlIIlIIIlI.append((char)(lllllllllllllIIllllIlIIlIIlIIlIl ^ lllllllllllllIIllllIlIIlIIlIIIIl[lllllllllllllIIllllIlIIlIIlIIIII % lllllllllllllIIllllIlIIlIIlIIIIl.length]));
            "".length();
            ++lllllllllllllIIllllIlIIlIIlIIIII;
            ++lllllllllllllIIllllIlIIlIIIllIII;
            "".length();
            if ((0x56 ^ 0x52) != (0x70 ^ 0x74)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIlIIlIIlIIIlI);
    }
    
    public SoundEventAccessorComposite getRandomSoundFromCategories(final SoundCategory... lllllllllllllIIllllIlIIlIlIlllII) {
        final List<SoundEventAccessorComposite> lllllllllllllIIllllIlIIlIlIllIll = (List<SoundEventAccessorComposite>)Lists.newArrayList();
        final double lllllllllllllIIllllIlIIlIlIlIlII = (double)((RegistrySimple<ResourceLocation, V>)this.sndRegistry).getKeys().iterator();
        "".length();
        if ("  ".length() < " ".length()) {
            return null;
        }
        while (!llIIIllllIIllII(((Iterator)lllllllllllllIIllllIlIIlIlIlIlII).hasNext() ? 1 : 0)) {
            final ResourceLocation lllllllllllllIIllllIlIIlIlIllIlI = ((Iterator<ResourceLocation>)lllllllllllllIIllllIlIIlIlIlIlII).next();
            final SoundEventAccessorComposite lllllllllllllIIllllIlIIlIlIllIIl = this.sndRegistry.getObject(lllllllllllllIIllllIlIIlIlIllIlI);
            if (llIIIllllIIllIl(ArrayUtils.contains((Object[])lllllllllllllIIllllIlIIlIlIlllII, (Object)lllllllllllllIIllllIlIIlIlIllIIl.getSoundCategory()) ? 1 : 0)) {
                lllllllllllllIIllllIlIIlIlIllIll.add(lllllllllllllIIllllIlIIlIlIllIIl);
                "".length();
            }
        }
        if (llIIIllllIIllIl(lllllllllllllIIllllIlIIlIlIllIll.isEmpty() ? 1 : 0)) {
            return null;
        }
        return lllllllllllllIIllllIlIIlIlIllIll.get(new Random().nextInt(lllllllllllllIIllllIlIIlIlIllIll.size()));
    }
    
    private static boolean llIIIllllIIllll(final Object lllllllllllllIIllllIlIIlIIIlIIII, final Object lllllllllllllIIllllIlIIlIIIIllll) {
        return lllllllllllllIIllllIlIIlIIIlIIII == lllllllllllllIIllllIlIIlIIIIllll;
    }
    
    public void unloadSounds() {
        this.sndManager.unloadSoundSystem();
    }
    
    private static boolean llIIIllllIlIIII(final int lllllllllllllIIllllIlIIlIIIIIlll) {
        return lllllllllllllIIllllIlIIlIIIIIlll <= 0;
    }
    
    private static boolean llIIIllllIIllII(final int lllllllllllllIIllllIlIIlIIIIlIIl) {
        return lllllllllllllIIllllIlIIlIIIIlIIl == 0;
    }
    
    private static String llIIIllllIIIIIl(final String lllllllllllllIIllllIlIIlIIllIlII, final String lllllllllllllIIllllIlIIlIIllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIIlIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIlIIlIIllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIlIIlIIllIllI.init(SoundHandler.lIIIllllIIIlll[2], lllllllllllllIIllllIlIIlIIllIlll);
            return new String(lllllllllllllIIllllIlIIlIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIIlIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIIlIIllIlIl) {
            lllllllllllllIIllllIlIIlIIllIlIl.printStackTrace();
            return null;
        }
    }
    
    public void stopSounds() {
        this.sndManager.stopAllSounds();
    }
    
    public void stopSound(final ISound lllllllllllllIIllllIlIIlIllIIllI) {
        this.sndManager.stopSound(lllllllllllllIIllllIlIIlIllIIllI);
    }
    
    public void playDelayedSound(final ISound lllllllllllllIIllllIlIIllIIIllII, final int lllllllllllllIIllllIlIIllIIIlllI) {
        this.sndManager.playDelayedSound(lllllllllllllIIllllIlIIllIIIllII, lllllllllllllIIllllIlIIllIIIlllI);
    }
    
    private static String llIIIllllIIIIII(final String lllllllllllllIIllllIlIIlIlIIIIIl, final String lllllllllllllIIllllIlIIlIIlllllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIIlIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIIlIIlllllI.getBytes(StandardCharsets.UTF_8)), SoundHandler.lIIIllllIIIlll[8]), "DES");
            final Cipher lllllllllllllIIllllIlIIlIlIIIIll = Cipher.getInstance("DES");
            lllllllllllllIIllllIlIIlIlIIIIll.init(SoundHandler.lIIIllllIIIlll[2], lllllllllllllIIllllIlIIlIlIIIlII);
            return new String(lllllllllllllIIllllIlIIlIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIIlIlIIIIlI) {
            lllllllllllllIIllllIlIIlIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    public void pauseSounds() {
        this.sndManager.pauseAllSounds();
    }
    
    public void setListener(final EntityPlayer lllllllllllllIIllllIlIIllIIIIIll, final float lllllllllllllIIllllIlIIllIIIIlIl) {
        this.sndManager.setListener(lllllllllllllIIllllIlIIllIIIIIll, lllllllllllllIIllllIlIIllIIIIlIl);
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager lllllllllllllIIllllIlIIllllIIIII) {
        this.sndManager.reloadSoundSystem();
        this.sndRegistry.clearMap();
        final float lllllllllllllIIllllIlIIlllIllllI = (float)lllllllllllllIIllllIlIIllllIIIII.getResourceDomains().iterator();
        "".length();
        if (" ".length() > "  ".length()) {
            return;
        }
        while (!llIIIllllIIllII(((Iterator)lllllllllllllIIllllIlIIlllIllllI).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllllIlIIllllIIllI = ((Iterator<String>)lllllllllllllIIllllIlIIlllIllllI).next();
            try {
                final short lllllllllllllIIllllIlIIlllIlllII = (short)lllllllllllllIIllllIlIIllllIIIII.getAllResources(new ResourceLocation(lllllllllllllIIllllIlIIllllIIllI, SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[1]])).iterator();
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                while (!llIIIllllIIllII(((Iterator)lllllllllllllIIllllIlIIlllIlllII).hasNext() ? 1 : 0)) {
                    final IResource lllllllllllllIIllllIlIIllllIIlIl = ((Iterator<IResource>)lllllllllllllIIllllIlIIlllIlllII).next();
                    try {
                        final Map<String, SoundList> lllllllllllllIIllllIlIIllllIIlII = this.getSoundMap(lllllllllllllIIllllIlIIllllIIlIl.getInputStream());
                        final long lllllllllllllIIllllIlIIlllIllIIl = (long)lllllllllllllIIllllIlIIllllIIlII.entrySet().iterator();
                        "".length();
                        if (" ".length() > (0x6E ^ 0x6A)) {
                            return;
                        }
                        while (!llIIIllllIIllII(((Iterator)lllllllllllllIIllllIlIIlllIllIIl).hasNext() ? 1 : 0)) {
                            final Map.Entry<String, SoundList> lllllllllllllIIllllIlIIllllIIIll = ((Iterator<Map.Entry<String, SoundList>>)lllllllllllllIIllllIlIIlllIllIIl).next();
                            this.loadSoundResource(new ResourceLocation(lllllllllllllIIllllIlIIllllIIllI, lllllllllllllIIllllIlIIllllIIIll.getKey()), lllllllllllllIIllllIlIIllllIIIll.getValue());
                        }
                        "".length();
                        if (null != null) {
                            return;
                        }
                        continue;
                    }
                    catch (RuntimeException lllllllllllllIIllllIlIIllllIIIlI) {
                        SoundHandler.logger.warn(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[2]], (Throwable)lllllllllllllIIllllIlIIllllIIIlI);
                    }
                }
                "".length();
                if ((0x1C ^ 0x77 ^ (0xD0 ^ 0xBF)) == 0x0) {
                    return;
                }
                continue;
            }
            catch (IOException ex) {}
        }
    }
    
    static {
        llIIIllllIIlIll();
        llIIIllllIIIIlI();
        logger = LogManager.getLogger();
        GSON = new GsonBuilder().registerTypeAdapter((Type)SoundList.class, (Object)new SoundListSerializer()).create();
        TYPE = new ParameterizedType() {
            private static final /* synthetic */ int[] llllIllIllIIl;
            
            static {
                lIlIlIlllIIIIII();
            }
            
            private static void lIlIlIlllIIIIII() {
                (llllIllIllIIl = new int[3])[0] = "  ".length();
                SoundHandler$1.llllIllIllIIl[1] = ((0x50 ^ 0x63 ^ (0x1D ^ 0x2)) & (0x37 ^ 0x18 ^ "   ".length() ^ -" ".length()));
                SoundHandler$1.llllIllIllIIl[2] = " ".length();
            }
            
            @Override
            public Type[] getActualTypeArguments() {
                final Type[] array = new Type[SoundHandler$1.llllIllIllIIl[0]];
                array[SoundHandler$1.llllIllIllIIl[1]] = String.class;
                array[SoundHandler$1.llllIllIllIIl[2]] = SoundList.class;
                return array;
            }
            
            @Override
            public Type getRawType() {
                return Map.class;
            }
            
            @Override
            public Type getOwnerType() {
                return null;
            }
        };
        missing_sound = new SoundPoolEntry(new ResourceLocation(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[0]]), 0.0, 0.0, (boolean)(SoundHandler.lIIIllllIIIlll[0] != 0));
    }
    
    private void loadSoundResource(final ResourceLocation lllllllllllllIIllllIlIIllIlIllIl, final SoundList lllllllllllllIIllllIlIIllIlIllII) {
        int n;
        if (llIIIllllIIllIl(((RegistrySimple<ResourceLocation, V>)this.sndRegistry).containsKey(lllllllllllllIIllllIlIIllIlIllIl) ? 1 : 0)) {
            n = SoundHandler.lIIIllllIIIlll[0];
            "".length();
            if ((0x5A ^ 0x56 ^ (0x60 ^ 0x68)) < "   ".length()) {
                return;
            }
        }
        else {
            n = SoundHandler.lIIIllllIIIlll[1];
        }
        final boolean lllllllllllllIIllllIlIIllIllllII = n != 0;
        SoundEventAccessorComposite lllllllllllllIIllllIlIIllIlllIlI = null;
        if (llIIIllllIIllII(lllllllllllllIIllllIlIIllIllllII ? 1 : 0) && llIIIllllIIllII(lllllllllllllIIllllIlIIllIlIllII.canReplaceExisting() ? 1 : 0)) {
            final SoundEventAccessorComposite lllllllllllllIIllllIlIIllIlllIll = this.sndRegistry.getObject(lllllllllllllIIllllIlIIllIlIllIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            if (llIIIllllIIllII(lllllllllllllIIllllIlIIllIllllII ? 1 : 0)) {
                final Logger logger = SoundHandler.logger;
                final String s = SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[3]];
                final Object[] array = new Object[SoundHandler.lIIIllllIIIlll[1]];
                array[SoundHandler.lIIIllllIIIlll[0]] = lllllllllllllIIllllIlIIllIlIllIl;
                logger.debug(s, array);
            }
            lllllllllllllIIllllIlIIllIlllIlI = new SoundEventAccessorComposite(lllllllllllllIIllllIlIIllIlIllIl, 1.0, 1.0, lllllllllllllIIllllIlIIllIlIllII.getSoundCategory());
            this.sndRegistry.registerSound(lllllllllllllIIllllIlIIllIlllIlI);
        }
        final double lllllllllllllIIllllIlIIllIlIlIII = (double)lllllllllllllIIllllIlIIllIlIllII.getSoundList().iterator();
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!llIIIllllIIllII(((Iterator)lllllllllllllIIllllIlIIllIlIlIII).hasNext() ? 1 : 0)) {
            final SoundList.SoundEntry lllllllllllllIIllllIlIIllIlllIIl = ((Iterator<SoundList.SoundEntry>)lllllllllllllIIllllIlIIllIlIlIII).next();
            final String lllllllllllllIIllllIlIIllIlllIII = lllllllllllllIIllllIlIIllIlllIIl.getSoundEntryName();
            final ResourceLocation lllllllllllllIIllllIlIIllIllIlll = new ResourceLocation(lllllllllllllIIllllIlIIllIlllIII);
            String s2;
            if (llIIIllllIIllIl(lllllllllllllIIllllIlIIllIlllIII.contains(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[4]]) ? 1 : 0)) {
                s2 = lllllllllllllIIllllIlIIllIllIlll.getResourceDomain();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                s2 = lllllllllllllIIllllIlIIllIlIllIl.getResourceDomain();
            }
            final String lllllllllllllIIllllIlIIllIllIllI = s2;
            switch ($SWITCH_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type()[lllllllllllllIIllllIlIIllIlllIIl.getSoundEntryType().ordinal()]) {
                case 1: {
                    final ResourceLocation lllllllllllllIIllllIlIIllIllIIlI = new ResourceLocation(lllllllllllllIIllllIlIIllIllIllI, String.valueOf(new StringBuilder(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[5]]).append(lllllllllllllIIllllIlIIllIllIlll.getResourcePath()).append(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[6]])));
                    InputStream lllllllllllllIIllllIlIIllIllIIIl = null;
                    try {
                        lllllllllllllIIllllIlIIllIllIIIl = this.mcResourceManager.getResource(lllllllllllllIIllllIlIIllIllIIlI).getInputStream();
                        "".length();
                        if ("  ".length() <= ((26 + 62 + 61 + 17 ^ 81 + 6 + 33 + 15) & (137 + 71 - 143 + 163 ^ 190 + 122 - 146 + 31 ^ -" ".length()))) {
                            return;
                        }
                    }
                    catch (FileNotFoundException lllllllllllllIIllllIlIIllIllIIII) {
                        final Logger logger2 = SoundHandler.logger;
                        final String s3 = SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[7]];
                        final Object[] array2 = new Object[SoundHandler.lIIIllllIIIlll[2]];
                        array2[SoundHandler.lIIIllllIIIlll[0]] = lllllllllllllIIllllIlIIllIllIIlI;
                        array2[SoundHandler.lIIIllllIIIlll[1]] = lllllllllllllIIllllIlIIllIlIllIl;
                        logger2.warn(s3, array2);
                        IOUtils.closeQuietly(lllllllllllllIIllllIlIIllIllIIIl);
                        "".length();
                        if (" ".length() == (171 + 107 - 141 + 52 ^ 118 + 85 - 68 + 50)) {
                            return;
                        }
                        continue;
                    }
                    catch (IOException lllllllllllllIIllllIlIIllIlIllll) {
                        SoundHandler.logger.warn(String.valueOf(new StringBuilder(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[8]]).append(lllllllllllllIIllllIlIIllIllIIlI).append(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[9]]).append(lllllllllllllIIllllIlIIllIlIllIl)), (Throwable)lllllllllllllIIllllIlIIllIlIllll);
                        IOUtils.closeQuietly(lllllllllllllIIllllIlIIllIllIIIl);
                        "".length();
                        if ("  ".length() > "  ".length()) {
                            return;
                        }
                        continue;
                    }
                    finally {
                        IOUtils.closeQuietly(lllllllllllllIIllllIlIIllIllIIIl);
                    }
                    IOUtils.closeQuietly(lllllllllllllIIllllIlIIllIllIIIl);
                    final Object lllllllllllllIIllllIlIIllIllIlIl = new SoundEventAccessor(new SoundPoolEntry(lllllllllllllIIllllIlIIllIllIIlI, lllllllllllllIIllllIlIIllIlllIIl.getSoundEntryPitch(), lllllllllllllIIllllIlIIllIlllIIl.getSoundEntryVolume(), lllllllllllllIIllllIlIIllIlllIIl.isStreaming()), lllllllllllllIIllllIlIIllIlllIIl.getSoundEntryWeight());
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                    break;
                }
                case 2: {
                    final Object lllllllllllllIIllllIlIIllIllIlII = new ISoundEventAccessor<SoundPoolEntry>(lllllllllllllIIllllIlIIllIllIllI, lllllllllllllIIllllIlIIllIlllIIl) {
                        final /* synthetic */ ResourceLocation field_148726_a = new ResourceLocation(llllllllllllIllIIlIIlllllIllIlIl, llllllllllllIllIIlIIlllllIllIlII.getSoundEntryName());
                        private static final /* synthetic */ int[] llIlllIIlIIllI;
                        
                        private static boolean lIIllIIlIlIllIII(final Object llllllllllllIllIIlIIlllllIlIIlII) {
                            return llllllllllllIllIIlIIlllllIlIIlII == null;
                        }
                        
                        @Override
                        public int getWeight() {
                            final SoundEventAccessorComposite llllllllllllIllIIlIIlllllIllIIII = SoundHandler.this.sndRegistry.getObject(this.field_148726_a);
                            int weight;
                            if (lIIllIIlIlIllIII(llllllllllllIllIIlIIlllllIllIIII)) {
                                weight = SoundHandler$2.llIlllIIlIIllI[0];
                                "".length();
                                if ("  ".length() < ((0xC8 ^ 0x9D ^ (0xF7 ^ 0xB1)) & (73 + 38 - 43 + 79 ^ 122 + 70 - 98 + 34 ^ -" ".length()))) {
                                    return (0x3C ^ 0xA ^ (0x16 ^ 0x6D)) & (52 + 118 - 37 + 85 ^ 55 + 113 - 79 + 62 ^ -" ".length());
                                }
                            }
                            else {
                                weight = llllllllllllIllIIlIIlllllIllIIII.getWeight();
                            }
                            return weight;
                        }
                        
                        @Override
                        public SoundPoolEntry cloneEntry() {
                            final SoundEventAccessorComposite llllllllllllIllIIlIIlllllIlIlIlI = SoundHandler.this.sndRegistry.getObject(this.field_148726_a);
                            SoundPoolEntry soundPoolEntry;
                            if (lIIllIIlIlIllIII(llllllllllllIllIIlIIlllllIlIlIlI)) {
                                soundPoolEntry = SoundHandler.missing_sound;
                                "".length();
                                if (((0xB3 ^ 0xA6 ^ (0x3B ^ 0x3E)) & (0x52 ^ 0xF ^ (0x16 ^ 0x5B) ^ -" ".length())) <= -" ".length()) {
                                    return null;
                                }
                            }
                            else {
                                soundPoolEntry = llllllllllllIllIIlIIlllllIlIlIlI.cloneEntry();
                            }
                            return soundPoolEntry;
                        }
                        
                        private static void lIIllIIlIlIlIlll() {
                            (llIlllIIlIIllI = new int[1])[0] = ((0x72 ^ 0x67) & ~(0xAE ^ 0xBB));
                        }
                        
                        static {
                            lIIllIIlIlIlIlll();
                        }
                    };
                    "".length();
                    if (" ".length() < " ".length()) {
                        return;
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException(SoundHandler.lIIIllllIIIIll[SoundHandler.lIIIllllIIIlll[10]]);
                }
            }
            final Object lllllllllllllIIllllIlIIllIllIIll;
            lllllllllllllIIllllIlIIllIlllIlI.addSoundToEventPool((ISoundEventAccessor<SoundPoolEntry>)lllllllllllllIIllllIlIIllIllIIll);
        }
    }
    
    private static boolean llIIIllllIlIIIl(final Object lllllllllllllIIllllIlIIlIIIIllIl) {
        return lllllllllllllIIllllIlIIlIIIIllIl != null;
    }
    
    @Override
    public void update() {
        this.sndManager.updateAllSounds();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type() {
        final int[] $switch_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type = SoundHandler.$SWITCH_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type;
        if (llIIIllllIlIIIl($switch_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type)) {
            return $switch_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type;
        }
        "".length();
        final byte lllllllllllllIIllllIlIIlIlIIlIIl = (Object)new int[SoundList.SoundEntry.Type.values().length];
        try {
            lllllllllllllIIllllIlIIlIlIIlIIl[SoundList.SoundEntry.Type.FILE.ordinal()] = SoundHandler.lIIIllllIIIlll[1];
            "".length();
            if (((0x85 ^ 0x9B) & ~(0xA0 ^ 0xBE)) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllllIlIIlIlIIlIIl[SoundList.SoundEntry.Type.SOUND_EVENT.ordinal()] = SoundHandler.lIIIllllIIIlll[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        return SoundHandler.$SWITCH_TABLE$net$minecraft$client$audio$SoundList$SoundEntry$Type = (int[])(Object)lllllllllllllIIllllIlIIlIlIIlIIl;
    }
    
    private static int llIIIllllIIlllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llIIIllllIIllIl(final int lllllllllllllIIllllIlIIlIIIIlIll) {
        return lllllllllllllIIllllIlIIlIIIIlIll != 0;
    }
}
